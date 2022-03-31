/*      */ package bigname.zprestige.webhack.features.modules.Combat;
/*      */ import bigname.zprestige.webhack.WebHack;
/*      */ import bigname.zprestige.webhack.event.events.ClientEvent;
/*      */ import bigname.zprestige.webhack.event.events.PacketEvent;
/*      */ import bigname.zprestige.webhack.event.events.Render3DEvent;
/*      */ import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
/*      */ import bigname.zprestige.webhack.features.command.Command;
/*      */ import bigname.zprestige.webhack.features.modules.Module;
/*      */ import bigname.zprestige.webhack.features.setting.Bind;
/*      */ import bigname.zprestige.webhack.features.setting.Setting;
/*      */ import bigname.zprestige.webhack.util.BlockUtil;
/*      */ import bigname.zprestige.webhack.util.DamageUtil;
/*      */ import bigname.zprestige.webhack.util.EntityUtil;
/*      */ import bigname.zprestige.webhack.util.MathUtil;
/*      */ import bigname.zprestige.webhack.util.RenderUtil;
/*      */ import bigname.zprestige.webhack.util.Timer;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import java.awt.Color;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Map;
/*      */ import java.util.Queue;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ import java.util.concurrent.ScheduledExecutorService;
/*      */ import java.util.concurrent.atomic.AtomicBoolean;
/*      */ import net.minecraft.block.Block;
/*      */ import net.minecraft.block.state.IBlockState;
/*      */ import net.minecraft.client.entity.EntityOtherPlayerMP;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.entity.item.EntityEnderCrystal;
/*      */ import net.minecraft.entity.player.EntityPlayer;
/*      */ import net.minecraft.init.Items;
/*      */ import net.minecraft.network.Packet;
/*      */ import net.minecraft.network.play.client.CPacketPlayer;
/*      */ import net.minecraft.network.play.client.CPacketUseEntity;
/*      */ import net.minecraft.network.play.server.SPacketDestroyEntities;
/*      */ import net.minecraft.network.play.server.SPacketEntityStatus;
/*      */ import net.minecraft.network.play.server.SPacketExplosion;
/*      */ import net.minecraft.network.play.server.SPacketSoundEffect;
/*      */ import net.minecraft.network.play.server.SPacketSpawnObject;
/*      */ import net.minecraft.util.EnumFacing;
/*      */ import net.minecraft.util.EnumHand;
/*      */ import net.minecraft.util.math.AxisAlignedBB;
/*      */ import net.minecraft.util.math.BlockPos;
/*      */ import net.minecraft.util.math.RayTraceResult;
/*      */ import net.minecraft.util.math.Vec3d;
/*      */ import net.minecraft.world.World;
/*      */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ 
/*      */ public class AutoCrystal extends Module {
/*   54 */   public static EntityPlayer target = null;
/*   55 */   public static Set<BlockPos> lowDmgPos = (Set<BlockPos>)new ConcurrentSet();
/*   56 */   public static Set<BlockPos> placedPos = new HashSet<>();
/*   57 */   public static Set<BlockPos> brokenPos = new HashSet<>();
/*      */   private static AutoCrystal instance;
/*   59 */   public final Timer threadTimer = new Timer();
/*   60 */   private final Setting<Settings> setting = register(new Setting("Settings", Settings.PLACE));
/*   61 */   public final Setting<Boolean> attackOppositeHand = register(new Setting("OppositeHand", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*   62 */   public final Setting<Boolean> removeAfterAttack = register(new Setting("AttackRemove", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*   63 */   public final Setting<Boolean> antiBlock = register(new Setting("AntiFeetPlace", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*   64 */   private final Setting<Integer> switchCooldown = register(new Setting("Cooldown", Integer.valueOf(500), Integer.valueOf(0), Integer.valueOf(1000), v -> (this.setting.getValue() == Settings.MISC)));
/*   65 */   private final Setting<Integer> eventMode = register(new Setting("Updates", Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(3), v -> (this.setting.getValue() == Settings.DEV)));
/*   66 */   private final Timer switchTimer = new Timer();
/*   67 */   private final Timer manualTimer = new Timer();
/*   68 */   private final Timer breakTimer = new Timer();
/*   69 */   private final Timer placeTimer = new Timer();
/*   70 */   private final Timer syncTimer = new Timer();
/*   71 */   private final Timer predictTimer = new Timer();
/*   72 */   private final Timer renderTimer = new Timer();
/*   73 */   private final AtomicBoolean shouldInterrupt = new AtomicBoolean(false);
/*   74 */   private final Timer syncroTimer = new Timer();
/*   75 */   private final Map<EntityPlayer, Timer> totemPops = new ConcurrentHashMap<>();
/*   76 */   private final Queue<CPacketUseEntity> packetUseEntities = new LinkedList<>();
/*   77 */   private final AtomicBoolean threadOngoing = new AtomicBoolean(false);
/*   78 */   public Setting<Raytrace> raytrace = register(new Setting("Raytrace", Raytrace.NONE, v -> (this.setting.getValue() == Settings.MISC)));
/*   79 */   public Setting<Boolean> place = register(new Setting("Place", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.PLACE)));
/*   80 */   public Setting<Integer> placeDelay = register(new Setting("PlaceDelay", Integer.valueOf(25), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   81 */   public Setting<Float> placeRange = register(new Setting("PlaceRange", Float.valueOf(6.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   82 */   public Setting<Float> minDamage = register(new Setting("MinDamage", Float.valueOf(7.0F), Float.valueOf(0.1F), Float.valueOf(20.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   83 */   public Setting<Float> maxSelfPlace = register(new Setting("MaxSelfPlace", Float.valueOf(10.0F), Float.valueOf(0.1F), Float.valueOf(36.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   84 */   public Setting<Integer> wasteAmount = register(new Setting("WasteAmount", Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(5), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   85 */   public Setting<Boolean> wasteMinDmgCount = register(new Setting("CountMinDmg", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   86 */   public Setting<Float> facePlace = register(new Setting("FacePlace", Float.valueOf(8.0F), Float.valueOf(0.1F), Float.valueOf(36.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   87 */   public Setting<Float> placetrace = register(new Setting("Placetrace", Float.valueOf(4.5F), Float.valueOf(0.0F), Float.valueOf(10.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue() && this.raytrace.getValue() != Raytrace.NONE && this.raytrace.getValue() != Raytrace.BREAK)));
/*   88 */   public Setting<Boolean> antiSurround = register(new Setting("AntiSurround", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   89 */   public Setting<Boolean> limitFacePlace = register(new Setting("LimitFacePlace", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   90 */   public Setting<Boolean> oneDot15 = register(new Setting("1.15", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   91 */   public Setting<Boolean> doublePop = register(new Setting("AntiTotem", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue())));
/*   92 */   public Setting<Double> popHealth = register(new Setting("PopHealth", Double.valueOf(1.0D), Double.valueOf(0.0D), Double.valueOf(3.0D), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.doublePop.getValue()).booleanValue())));
/*   93 */   public Setting<Float> popDamage = register(new Setting("PopDamage", Float.valueOf(4.0F), Float.valueOf(0.0F), Float.valueOf(6.0F), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.doublePop.getValue()).booleanValue())));
/*   94 */   public Setting<Integer> popTime = register(new Setting("PopTime", Integer.valueOf(500), Integer.valueOf(0), Integer.valueOf(1000), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.doublePop.getValue()).booleanValue())));
/*   95 */   public Setting<Boolean> explode = register(new Setting("Break", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK)));
/*   96 */   public Setting<Switch> switchMode = register(new Setting("Attack", Switch.BREAKSLOT, v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue())));
/*   97 */   public Setting<Integer> breakDelay = register(new Setting("BreakDelay", Integer.valueOf(50), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue())));
/*   98 */   public Setting<Float> breakRange = register(new Setting("BreakRange", Float.valueOf(6.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue())));
/*   99 */   public Setting<Integer> packets = register(new Setting("Packets", Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(6), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue())));
/*  100 */   public Setting<Float> maxSelfBreak = register(new Setting("MaxSelfBreak", Float.valueOf(10.0F), Float.valueOf(0.1F), Float.valueOf(36.0F), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue())));
/*  101 */   public Setting<Float> breaktrace = register(new Setting("Breaktrace", Float.valueOf(4.5F), Float.valueOf(0.0F), Float.valueOf(10.0F), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && this.raytrace.getValue() != Raytrace.NONE && this.raytrace.getValue() != Raytrace.PLACE)));
/*  102 */   public Setting<Boolean> manual = register(new Setting("Manual", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK)));
/*  103 */   public Setting<Boolean> manualMinDmg = register(new Setting("ManMinDmg", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.manual.getValue()).booleanValue())));
/*  104 */   public Setting<Integer> manualBreak = register(new Setting("ManualDelay", Integer.valueOf(500), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.manual.getValue()).booleanValue())));
/*  105 */   public Setting<Boolean> sync = register(new Setting("Sync", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && (((Boolean)this.explode.getValue()).booleanValue() || ((Boolean)this.manual.getValue()).booleanValue()))));
/*  106 */   public Setting<Boolean> instant = register(new Setting("Predict", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue())));
/*  107 */   public Setting<PredictTimer> instantTimer = register(new Setting("PredictTimer", PredictTimer.NONE, v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue())));
/*  108 */   public Setting<Boolean> resetBreakTimer = register(new Setting("ResetBreakTimer", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue())));
/*  109 */   public Setting<Integer> predictDelay = register(new Setting("PredictDelay", Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue() && this.instantTimer.getValue() == PredictTimer.PREDICT)));
/*  110 */   public Setting<Boolean> predictCalc = register(new Setting("PredictCalc", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue())));
/*  111 */   public Setting<Boolean> superSafe = register(new Setting("SuperSafe", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue())));
/*  112 */   public Setting<Boolean> antiCommit = register(new Setting("AntiOverCommit", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.BREAK && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue())));
/*  113 */   public Setting<Boolean> render = register(new Setting("Render", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.RENDER)));
/*  114 */   private final Setting<Integer> red = register(new Setting("Red", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  115 */   private final Setting<Integer> green = register(new Setting("Green", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  116 */   private final Setting<Integer> blue = register(new Setting("Blue", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  117 */   private final Setting<Integer> alpha = register(new Setting("Alpha", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  118 */   public Setting<Boolean> colorSync = register(new Setting("ColorSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.RENDER)));
/*  119 */   public Setting<Boolean> box = register(new Setting("Box", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  120 */   private final Setting<Integer> boxAlpha = register(new Setting("BoxAlpha", Integer.valueOf(125), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.box.getValue()).booleanValue())));
/*  121 */   public Setting<Boolean> outline = register(new Setting("Outline", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  122 */   private final Setting<Float> lineWidth = register(new Setting("LineWidth", Float.valueOf(1.5F), Float.valueOf(0.1F), Float.valueOf(5.0F), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  123 */   public Setting<Boolean> text = register(new Setting("Text", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue())));
/*  124 */   public Setting<Boolean> customOutline = register(new Setting("CustomLine", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  125 */   private final Setting<Integer> cRed = register(new Setting("OL-Red", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.customOutline.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  126 */   private final Setting<Integer> cGreen = register(new Setting("OL-Green", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.customOutline.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  127 */   private final Setting<Integer> cBlue = register(new Setting("OL-Blue", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.customOutline.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  128 */   private final Setting<Integer> cAlpha = register(new Setting("OL-Alpha", Integer.valueOf(255), Integer.valueOf(0), Integer.valueOf(255), v -> (this.setting.getValue() == Settings.RENDER && ((Boolean)this.render.getValue()).booleanValue() && ((Boolean)this.customOutline.getValue()).booleanValue() && ((Boolean)this.outline.getValue()).booleanValue())));
/*  129 */   public Setting<Boolean> holdFacePlace = register(new Setting("HoldFacePlace", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  130 */   public Setting<Boolean> holdFaceBreak = register(new Setting("HoldSlowBreak", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC && ((Boolean)this.holdFacePlace.getValue()).booleanValue())));
/*  131 */   public Setting<Boolean> slowFaceBreak = register(new Setting("SlowFaceBreak", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  132 */   public Setting<Boolean> actualSlowBreak = register(new Setting("ActuallySlow", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  133 */   public Setting<Integer> facePlaceSpeed = register(new Setting("FaceSpeed", Integer.valueOf(500), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.MISC)));
/*  134 */   public Setting<Boolean> antiNaked = register(new Setting("AntiNaked", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC)));
/*  135 */   public Setting<Float> range = register(new Setting("Range", Float.valueOf(12.0F), Float.valueOf(0.1F), Float.valueOf(20.0F), v -> (this.setting.getValue() == Settings.MISC)));
/*  136 */   public Setting<Target> targetMode = register(new Setting("Target", Target.CLOSEST, v -> (this.setting.getValue() == Settings.MISC)));
/*  137 */   public Setting<Integer> minArmor = register(new Setting("MinArmor", Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(125), v -> (this.setting.getValue() == Settings.MISC)));
/*  138 */   public Setting<AutoSwitch> autoSwitch = register(new Setting("Switch", AutoSwitch.TOGGLE, v -> (this.setting.getValue() == Settings.MISC)));
/*  139 */   public Setting<Bind> switchBind = register(new Setting("SwitchBind", new Bind(-1), v -> (this.setting.getValue() == Settings.MISC && this.autoSwitch.getValue() == AutoSwitch.TOGGLE)));
/*  140 */   public Setting<Boolean> offhandSwitch = register(new Setting("Offhand", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC && this.autoSwitch.getValue() != AutoSwitch.NONE)));
/*  141 */   public Setting<Boolean> switchBack = register(new Setting("Switchback", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC && this.autoSwitch.getValue() != AutoSwitch.NONE && ((Boolean)this.offhandSwitch.getValue()).booleanValue())));
/*  142 */   public Setting<Boolean> lethalSwitch = register(new Setting("LethalSwitch", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC && this.autoSwitch.getValue() != AutoSwitch.NONE)));
/*  143 */   public Setting<Boolean> mineSwitch = register(new Setting("MineSwitch", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC && this.autoSwitch.getValue() != AutoSwitch.NONE)));
/*  144 */   public Setting<Rotate> rotate = register(new Setting("Rotate", Rotate.OFF, v -> (this.setting.getValue() == Settings.MISC)));
/*  145 */   public Setting<Boolean> suicide = register(new Setting("Suicide", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  146 */   public Setting<Boolean> webAttack = register(new Setting("WebAttack", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC && this.targetMode.getValue() != Target.DAMAGE)));
/*  147 */   public Setting<Boolean> fullCalc = register(new Setting("ExtraCalc", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  148 */   public Setting<Boolean> sound = register(new Setting("Sound", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC)));
/*  149 */   public Setting<Float> soundRange = register(new Setting("SoundRange", Float.valueOf(12.0F), Float.valueOf(0.0F), Float.valueOf(12.0F), v -> (this.setting.getValue() == Settings.MISC)));
/*  150 */   public Setting<Float> soundPlayer = register(new Setting("SoundPlayer", Float.valueOf(6.0F), Float.valueOf(0.0F), Float.valueOf(12.0F), v -> (this.setting.getValue() == Settings.MISC)));
/*  151 */   public Setting<Boolean> soundConfirm = register(new Setting("SoundConfirm", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.MISC)));
/*  152 */   public Setting<Boolean> extraSelfCalc = register(new Setting("MinSelfDmg", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  153 */   public Setting<AntiFriendPop> antiFriendPop = register(new Setting("FriendPop", AntiFriendPop.NONE, v -> (this.setting.getValue() == Settings.MISC)));
/*  154 */   public Setting<Boolean> noCount = register(new Setting("AntiCount", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC && (this.antiFriendPop.getValue() == AntiFriendPop.ALL || this.antiFriendPop.getValue() == AntiFriendPop.BREAK))));
/*  155 */   public Setting<Boolean> calcEvenIfNoDamage = register(new Setting("BigFriendCalc", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC && (this.antiFriendPop.getValue() == AntiFriendPop.ALL || this.antiFriendPop.getValue() == AntiFriendPop.BREAK) && this.targetMode.getValue() != Target.DAMAGE)));
/*  156 */   public Setting<Boolean> predictFriendDmg = register(new Setting("PredictFriend", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC && (this.antiFriendPop.getValue() == AntiFriendPop.ALL || this.antiFriendPop.getValue() == AntiFriendPop.BREAK) && ((Boolean)this.instant.getValue()).booleanValue())));
/*  157 */   public Setting<Float> minMinDmg = register(new Setting("MinMinDmg", Float.valueOf(0.0F), Float.valueOf(0.0F), Float.valueOf(3.0F), v -> (this.setting.getValue() == Settings.DEV && ((Boolean)this.place.getValue()).booleanValue())));
/*  158 */   public Setting<Boolean> breakSwing = register(new Setting("BreakSwing", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.DEV)));
/*  159 */   public Setting<Boolean> placeSwing = register(new Setting("PlaceSwing", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*  160 */   public Setting<Boolean> exactHand = register(new Setting("ExactHand", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && ((Boolean)this.placeSwing.getValue()).booleanValue())));
/*  161 */   public Setting<Boolean> justRender = register(new Setting("JustRender", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*  162 */   public Setting<Boolean> fakeSwing = register(new Setting("FakeSwing", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && ((Boolean)this.justRender.getValue()).booleanValue())));
/*  163 */   public Setting<Logic> logic = register(new Setting("Logic", Logic.BREAKPLACE, v -> (this.setting.getValue() == Settings.DEV)));
/*  164 */   public Setting<DamageSync> damageSync = register(new Setting("DamageSync", DamageSync.NONE, v -> (this.setting.getValue() == Settings.DEV)));
/*  165 */   public Setting<Integer> damageSyncTime = register(new Setting("SyncDelay", Integer.valueOf(500), Integer.valueOf(0), Integer.valueOf(500), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE)));
/*  166 */   public Setting<Float> dropOff = register(new Setting("DropOff", Float.valueOf(5.0F), Float.valueOf(0.0F), Float.valueOf(10.0F), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() == DamageSync.BREAK)));
/*  167 */   public Setting<Integer> confirm = register(new Setting("Confirm", Integer.valueOf(250), Integer.valueOf(0), Integer.valueOf(1000), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE)));
/*  168 */   public Setting<Boolean> syncedFeetPlace = register(new Setting("FeetSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE)));
/*  169 */   public Setting<Boolean> fullSync = register(new Setting("FullSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  170 */   public Setting<Boolean> syncCount = register(new Setting("SyncCount", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  171 */   public Setting<Boolean> hyperSync = register(new Setting("HyperSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  172 */   public Setting<Boolean> gigaSync = register(new Setting("GigaSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  173 */   public Setting<Boolean> syncySync = register(new Setting("SyncySync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  174 */   public Setting<Boolean> enormousSync = register(new Setting("EnormousSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  175 */   public Setting<Boolean> holySync = register(new Setting("UnbelievableSync", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.damageSync.getValue() != DamageSync.NONE && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue())));
/*  176 */   public Setting<Boolean> rotateFirst = register(new Setting("FirstRotation", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && this.rotate.getValue() != Rotate.OFF && ((Integer)this.eventMode.getValue()).intValue() == 2)));
/*  177 */   public Setting<ThreadMode> threadMode = register(new Setting("Thread", ThreadMode.NONE, v -> (this.setting.getValue() == Settings.DEV)));
/*  178 */   public Setting<Integer> threadDelay = register(new Setting("ThreadDelay", Integer.valueOf(50), Integer.valueOf(1), Integer.valueOf(1000), v -> (this.setting.getValue() == Settings.DEV && this.threadMode.getValue() != ThreadMode.NONE)));
/*  179 */   public Setting<Boolean> syncThreadBool = register(new Setting("ThreadSync", Boolean.valueOf(true), v -> (this.setting.getValue() == Settings.DEV && this.threadMode.getValue() != ThreadMode.NONE)));
/*  180 */   public Setting<Integer> syncThreads = register(new Setting("SyncThreads", Integer.valueOf(1000), Integer.valueOf(1), Integer.valueOf(10000), v -> (this.setting.getValue() == Settings.DEV && this.threadMode.getValue() != ThreadMode.NONE && ((Boolean)this.syncThreadBool.getValue()).booleanValue())));
/*  181 */   public Setting<Boolean> predictPos = register(new Setting("PredictPos", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*  182 */   public Setting<Boolean> renderExtrapolation = register(new Setting("RenderExtrapolation", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV && ((Boolean)this.predictPos.getValue()).booleanValue())));
/*  183 */   public Setting<Integer> predictTicks = register(new Setting("ExtrapolationTicks", Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(20), v -> (this.setting.getValue() == Settings.DEV && ((Boolean)this.predictPos.getValue()).booleanValue())));
/*  184 */   public Setting<Integer> rotations = register(new Setting("Spoofs", Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(20), v -> (this.setting.getValue() == Settings.DEV)));
/*  185 */   public Setting<Boolean> predictRotate = register(new Setting("PredictRotate", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.DEV)));
/*  186 */   public Setting<Float> predictOffset = register(new Setting("PredictOffset", Float.valueOf(0.0F), Float.valueOf(0.0F), Float.valueOf(4.0F), v -> (this.setting.getValue() == Settings.DEV)));
/*  187 */   public Setting<Boolean> brownZombie = register(new Setting("BrownZombieMode", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.MISC)));
/*  188 */   public Setting<Boolean> doublePopOnDamage = register(new Setting("DamagePop", Boolean.valueOf(false), v -> (this.setting.getValue() == Settings.PLACE && ((Boolean)this.place.getValue()).booleanValue() && ((Boolean)this.doublePop.getValue()).booleanValue() && this.targetMode.getValue() == Target.DAMAGE)));
/*      */   public boolean rotating = false;
/*  190 */   private Queue<Entity> attackList = new ConcurrentLinkedQueue<>();
/*  191 */   private Map<Entity, Float> crystalMap = new HashMap<>();
/*  192 */   private Entity efficientTarget = null;
/*  193 */   private double currentDamage = 0.0D;
/*  194 */   private double renderDamage = 0.0D;
/*  195 */   private double lastDamage = 0.0D;
/*      */   private boolean didRotation = false;
/*      */   private boolean switching = false;
/*  198 */   private BlockPos placePos = null;
/*  199 */   private BlockPos renderPos = null;
/*      */   private boolean mainHand = false;
/*      */   private boolean offHand = false;
/*  202 */   private int crystalCount = 0;
/*  203 */   private int minDmgCount = 0;
/*  204 */   private int lastSlot = -1;
/*  205 */   private float yaw = 0.0F;
/*  206 */   private float pitch = 0.0F;
/*  207 */   private BlockPos webPos = null;
/*  208 */   private BlockPos lastPos = null;
/*      */   private boolean posConfirmed = false;
/*      */   private boolean foundDoublePop = false;
/*  211 */   private int rotationPacketsSpoofed = 0;
/*      */   private ScheduledExecutorService executor;
/*      */   private Thread thread;
/*      */   private EntityPlayer currentSyncTarget;
/*      */   private BlockPos syncedPlayerPos;
/*      */   private BlockPos syncedCrystalPos;
/*      */   private PlaceInfo placeInfo;
/*      */   private boolean addTolowDmg;
/*      */   private Object BlockPos;
/*      */   
/*      */   public AutoCrystal() {
/*  222 */     super("AutoCrystal", "Best CA on the market", Module.Category.COMBAT, true, false, false);
/*  223 */     instance = this;
/*      */   }
/*      */   
/*      */   public static AutoCrystal getInstance() {
/*  227 */     if (instance == null) {
/*  228 */       instance = new AutoCrystal();
/*      */     }
/*  230 */     return instance;
/*      */   }
/*      */ 
/*      */   
/*      */   public void onTick() {
/*  235 */     if (this.threadMode.getValue() == ThreadMode.NONE && ((Integer)this.eventMode.getValue()).intValue() == 3) {
/*  236 */       doAutoCrystal();
/*      */     }
/*      */   }
/*      */   
/*      */   @SubscribeEvent
/*      */   public void onUpdateWalkingPlayer(UpdateWalkingPlayerEvent event) {
/*  242 */     if (event.getStage() == 1) {
/*  243 */       postProcessing();
/*      */     }
/*  245 */     if (event.getStage() != 0) {
/*      */       return;
/*      */     }
/*  248 */     if (((Integer)this.eventMode.getValue()).intValue() == 2) {
/*  249 */       doAutoCrystal();
/*      */     }
/*      */   }
/*      */   
/*      */   public void postTick() {
/*  254 */     if (this.threadMode.getValue() != ThreadMode.NONE) {
/*  255 */       processMultiThreading();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void onUpdate() {
/*  261 */     if (this.threadMode.getValue() == ThreadMode.NONE && ((Integer)this.eventMode.getValue()).intValue() == 1) {
/*  262 */       doAutoCrystal();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void onToggle() {
/*  268 */     brokenPos.clear();
/*  269 */     placedPos.clear();
/*  270 */     this.totemPops.clear();
/*  271 */     this.rotating = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void onDisable() {
/*  276 */     if (this.thread != null) {
/*  277 */       this.shouldInterrupt.set(true);
/*      */     }
/*  279 */     if (this.executor != null) {
/*  280 */       this.executor.shutdown();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void onEnable() {
/*  286 */     if (this.threadMode.getValue() != ThreadMode.NONE) {
/*  287 */       processMultiThreading();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDisplayInfo() {
/*  293 */     if (this.switching) {
/*  294 */       return "§aSwitch";
/*      */     }
/*  296 */     if (target != null) {
/*  297 */       return target.func_70005_c_();
/*      */     }
/*  299 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @SubscribeEvent
/*      */   public void onPacketSend(PacketEvent.Send event) {
/*  305 */     if (event.getStage() == 0 && this.rotate.getValue() != Rotate.OFF && this.rotating && ((Integer)this.eventMode.getValue()).intValue() != 2 && event.getPacket() instanceof CPacketPlayer) {
/*  306 */       CPacketPlayer packet2 = (CPacketPlayer)event.getPacket();
/*  307 */       packet2.field_149476_e = this.yaw;
/*  308 */       packet2.field_149473_f = this.pitch;
/*  309 */       this.rotationPacketsSpoofed++;
/*  310 */       if (this.rotationPacketsSpoofed >= ((Integer)this.rotations.getValue()).intValue()) {
/*  311 */         this.rotating = false;
/*  312 */         this.rotationPacketsSpoofed = 0;
/*      */       } 
/*      */     } 
/*  315 */     BlockPos pos = null; CPacketUseEntity packet;
/*  316 */     if (event.getStage() == 0 && event.getPacket() instanceof CPacketUseEntity && (packet = (CPacketUseEntity)event.getPacket()).func_149565_c() == CPacketUseEntity.Action.ATTACK && packet.func_149564_a((World)mc.field_71441_e) instanceof EntityEnderCrystal) {
/*  317 */       pos = packet.func_149564_a((World)mc.field_71441_e).func_180425_c();
/*  318 */       if (((Boolean)this.removeAfterAttack.getValue()).booleanValue()) {
/*  319 */         ((Entity)Objects.<Entity>requireNonNull(packet.func_149564_a((World)mc.field_71441_e))).func_70106_y();
/*  320 */         mc.field_71441_e.func_73028_b(packet.field_149567_a);
/*      */       } 
/*      */     } 
/*  323 */     if (event.getStage() == 0 && event.getPacket() instanceof CPacketUseEntity && (packet = (CPacketUseEntity)event.getPacket()).func_149565_c() == CPacketUseEntity.Action.ATTACK && packet.func_149564_a((World)mc.field_71441_e) instanceof EntityEnderCrystal) {
/*  324 */       EntityEnderCrystal crystal = (EntityEnderCrystal)packet.func_149564_a((World)mc.field_71441_e);
/*  325 */       if (((Boolean)this.antiBlock.getValue()).booleanValue() && EntityUtil.isCrystalAtFeet(crystal, ((Float)this.range.getValue()).floatValue()) && pos != null) {
/*  326 */         rotateToPos(pos);
/*  327 */         BlockUtil.placeCrystalOnBlock(this.placePos, this.offHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, ((Boolean)this.placeSwing.getValue()).booleanValue(), ((Boolean)this.exactHand.getValue()).booleanValue());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
/*      */   public void onPacketReceive(PacketEvent.Receive event) {
/*  335 */     if (fullNullCheck()) {
/*      */       return;
/*      */     }
/*  338 */     if (!((Boolean)this.justRender.getValue()).booleanValue() && this.switchTimer.passedMs(((Integer)this.switchCooldown.getValue()).intValue()) && ((Boolean)this.explode.getValue()).booleanValue() && ((Boolean)this.instant.getValue()).booleanValue() && event.getPacket() instanceof SPacketSpawnObject && (this.syncedCrystalPos == null || !((Boolean)this.syncedFeetPlace.getValue()).booleanValue() || this.damageSync.getValue() == DamageSync.NONE)) {
/*      */       
/*  340 */       SPacketSpawnObject packet2 = (SPacketSpawnObject)event.getPacket(); BlockPos pos;
/*  341 */       if (packet2.func_148993_l() == 51 && mc.field_71439_g.func_174818_b(pos = new BlockPos(packet2.func_186880_c(), packet2.func_186882_d(), packet2.func_186881_e())) + ((Float)this.predictOffset.getValue()).floatValue() <= MathUtil.square(((Float)this.breakRange.getValue()).floatValue()) && (this.instantTimer.getValue() == PredictTimer.NONE || (this.instantTimer.getValue() == PredictTimer.BREAK && this.breakTimer.passedMs(((Integer)this.breakDelay.getValue()).intValue())) || (this.instantTimer.getValue() == PredictTimer.PREDICT && this.predictTimer.passedMs(((Integer)this.predictDelay.getValue()).intValue())))) {
/*  342 */         if (predictSlowBreak(pos.func_177977_b())) {
/*      */           return;
/*      */         }
/*  345 */         if (((Boolean)this.predictFriendDmg.getValue()).booleanValue() && (this.antiFriendPop.getValue() == AntiFriendPop.BREAK || this.antiFriendPop.getValue() == AntiFriendPop.ALL) && isRightThread())
/*  346 */           for (EntityPlayer friend : mc.field_71441_e.field_73010_i) {
/*  347 */             if (friend == null || mc.field_71439_g.equals(friend) || friend.func_174818_b(pos) > MathUtil.square((((Float)this.range.getValue()).floatValue() + ((Float)this.placeRange.getValue()).floatValue())) || !WebHack.friendManager.isFriend(friend) || DamageUtil.calculateDamage(pos, (Entity)friend) <= EntityUtil.getHealth((Entity)friend) + 0.5D) {
/*      */               continue;
/*      */             }
/*      */             return;
/*      */           }  
/*  352 */         if (placedPos.contains(pos.func_177977_b())) {
/*      */           float selfDamage;
/*  354 */           if (isRightThread() ? (((Boolean)this.superSafe.getValue()).booleanValue() ? (DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue()) && ((selfDamage = DamageUtil.calculateDamage(pos, (Entity)mc.field_71439_g)) - 0.5D > EntityUtil.getHealth((Entity)mc.field_71439_g) || selfDamage > ((Float)this.maxSelfBreak.getValue()).floatValue())) : ((Boolean)this.superSafe.getValue()).booleanValue()) : ((Boolean)this.superSafe.getValue()).booleanValue()) {
/*      */             return;
/*      */           }
/*  357 */           attackCrystalPredict(packet2.func_149001_c(), pos);
/*  358 */         } else if (((Boolean)this.predictCalc.getValue()).booleanValue() && isRightThread()) {
/*  359 */           float selfDamage = -1.0F;
/*  360 */           if (DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) {
/*  361 */             selfDamage = DamageUtil.calculateDamage(pos, (Entity)mc.field_71439_g);
/*      */           }
/*  363 */           if (selfDamage + 0.5D < EntityUtil.getHealth((Entity)mc.field_71439_g) && selfDamage <= ((Float)this.maxSelfBreak.getValue()).floatValue()) {
/*  364 */             for (EntityPlayer player : mc.field_71441_e.field_73010_i) {
/*      */               float damage;
/*  366 */               if (player.func_174818_b(pos) > MathUtil.square(((Float)this.range.getValue()).floatValue()) || !EntityUtil.isValid((Entity)player, (((Float)this.range.getValue()).floatValue() + ((Float)this.breakRange.getValue()).floatValue())) || (((Boolean)this.antiNaked.getValue()).booleanValue() && DamageUtil.isNaked(player)) || ((damage = DamageUtil.calculateDamage(pos, (Entity)player)) <= selfDamage && (damage <= ((Float)this.minDamage.getValue()).floatValue() || DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) && damage <= EntityUtil.getHealth((Entity)player)))
/*      */                 continue; 
/*  368 */               if (((Boolean)this.predictRotate.getValue()).booleanValue() && ((Integer)this.eventMode.getValue()).intValue() != 2 && (this.rotate.getValue() == Rotate.BREAK || this.rotate.getValue() == Rotate.ALL)) {
/*  369 */                 rotateToPos(pos);
/*      */               }
/*  371 */               attackCrystalPredict(packet2.func_149001_c(), pos);
/*      */             }
/*      */           
/*      */           }
/*      */         }
/*      */       
/*      */       } 
/*  378 */     } else if (!((Boolean)this.soundConfirm.getValue()).booleanValue() && event.getPacket() instanceof SPacketExplosion) {
/*  379 */       SPacketExplosion packet3 = (SPacketExplosion)event.getPacket();
/*  380 */       BlockPos pos = (new BlockPos(packet3.func_149148_f(), packet3.func_149143_g(), packet3.func_149145_h())).func_177977_b();
/*  381 */       removePos(pos);
/*  382 */     } else if (event.getPacket() instanceof SPacketDestroyEntities) {
/*  383 */       SPacketDestroyEntities packet4 = (SPacketDestroyEntities)event.getPacket();
/*  384 */       for (int id : packet4.func_149098_c()) {
/*  385 */         Entity entity = mc.field_71441_e.func_73045_a(id);
/*  386 */         if (entity instanceof EntityEnderCrystal)
/*  387 */         { brokenPos.remove((new BlockPos(entity.func_174791_d())).func_177977_b());
/*  388 */           placedPos.remove((new BlockPos(entity.func_174791_d())).func_177977_b()); } 
/*      */       } 
/*  390 */     } else if (event.getPacket() instanceof SPacketEntityStatus) {
/*  391 */       SPacketEntityStatus packet5 = (SPacketEntityStatus)event.getPacket();
/*  392 */       if (packet5.func_149160_c() == 35 && packet5.func_149161_a((World)mc.field_71441_e) instanceof EntityPlayer)
/*  393 */         this.totemPops.put((EntityPlayer)packet5.func_149161_a((World)mc.field_71441_e), (new Timer()).reset()); 
/*      */     } else {
/*  395 */       SPacketSoundEffect packet; if (event.getPacket() instanceof SPacketSoundEffect && (packet = (SPacketSoundEffect)event.getPacket()).func_186977_b() == SoundCategory.BLOCKS && packet.func_186978_a() == SoundEvents.field_187539_bB) {
/*  396 */         BlockPos pos = new BlockPos(packet.func_149207_d(), packet.func_149211_e(), packet.func_149210_f());
/*  397 */         if (((Boolean)this.soundConfirm.getValue()).booleanValue()) {
/*  398 */           removePos(pos);
/*      */         }
/*  400 */         if (this.threadMode.getValue() == ThreadMode.SOUND && isRightThread() && mc.field_71439_g != null && mc.field_71439_g.func_174818_b(pos) < MathUtil.square(((Float)this.soundPlayer.getValue()).floatValue())) {
/*  401 */           handlePool(true);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean predictSlowBreak(BlockPos pos) {
/*  408 */     if (((Boolean)this.antiCommit.getValue()).booleanValue() && lowDmgPos.remove(pos)) {
/*  409 */       return shouldSlowBreak(false);
/*      */     }
/*  411 */     return false;
/*      */   }
/*      */   
/*      */   private boolean isRightThread() {
/*  415 */     return (mc.func_152345_ab() || (!WebHack.eventManager.ticksOngoing() && !this.threadOngoing.get()));
/*      */   }
/*      */   
/*      */   private void attackCrystalPredict(int entityID, BlockPos pos) {
/*  419 */     if (((Boolean)this.predictRotate.getValue()).booleanValue() && (((Integer)this.eventMode.getValue()).intValue() != 2 || this.threadMode.getValue() != ThreadMode.NONE) && (this.rotate.getValue() == Rotate.BREAK || this.rotate.getValue() == Rotate.ALL)) {
/*  420 */       rotateToPos(pos);
/*      */     }
/*  422 */     CPacketUseEntity attackPacket = new CPacketUseEntity();
/*  423 */     attackPacket.field_149567_a = entityID;
/*  424 */     attackPacket.field_149566_b = CPacketUseEntity.Action.ATTACK;
/*  425 */     mc.field_71439_g.field_71174_a.func_147297_a((Packet)attackPacket);
/*  426 */     if (((Boolean)this.breakSwing.getValue()).booleanValue()) {
/*  427 */       mc.field_71439_g.field_71174_a.func_147297_a((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
/*      */     }
/*  429 */     if (((Boolean)this.resetBreakTimer.getValue()).booleanValue()) {
/*  430 */       this.breakTimer.reset();
/*      */     }
/*  432 */     this.predictTimer.reset();
/*      */   }
/*      */   
/*      */   private void removePos(BlockPos pos) {
/*  436 */     if (this.damageSync.getValue() == DamageSync.PLACE) {
/*  437 */       if (placedPos.remove(pos)) {
/*  438 */         this.posConfirmed = true;
/*      */       }
/*  440 */     } else if (this.damageSync.getValue() == DamageSync.BREAK && brokenPos.remove(pos)) {
/*  441 */       this.posConfirmed = true;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void onRender3D(Render3DEvent event) {
/*  446 */     if ((this.offHand || this.mainHand || this.switchMode.getValue() == Switch.CALC) && this.renderPos != null && ((Boolean)this.render.getValue()).booleanValue() && (((Boolean)this.box.getValue()).booleanValue() || ((Boolean)this.text.getValue()).booleanValue() || ((Boolean)this.outline.getValue()).booleanValue())) {
/*  447 */       RenderUtil.drawBoxESP(this.renderPos, ((Boolean)this.colorSync.getValue()).booleanValue() ? ColorUtil.rainbow(((Integer)(ClickGui.getInstance()).rainbowHue.getValue()).intValue()) : new Color(((Integer)this.red.getValue()).intValue(), ((Integer)this.green.getValue()).intValue(), ((Integer)this.blue.getValue()).intValue(), ((Integer)this.alpha.getValue()).intValue()), ((Boolean)this.customOutline.getValue()).booleanValue(), ((Boolean)this.colorSync.getValue()).booleanValue() ? getCurrentColor() : new Color(((Integer)this.cRed.getValue()).intValue(), ((Integer)this.cGreen.getValue()).intValue(), ((Integer)this.cBlue.getValue()).intValue(), ((Integer)this.cAlpha.getValue()).intValue()), ((Float)this.lineWidth.getValue()).floatValue(), ((Boolean)this.outline.getValue()).booleanValue(), ((Boolean)this.box.getValue()).booleanValue(), ((Integer)this.boxAlpha.getValue()).intValue(), false);
/*  448 */       if (((Boolean)this.text.getValue()).booleanValue()) {
/*  449 */         RenderUtil.drawText(this.renderPos, ((Math.floor(this.renderDamage) == this.renderDamage) ? (String)Integer.valueOf((int)this.renderDamage) : String.format("%.1f", new Object[] { Double.valueOf(this.renderDamage) })) + "");
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   @SubscribeEvent
/*      */   public void onKeyInput(InputEvent.KeyInputEvent event) {
/*  456 */     if (Keyboard.getEventKeyState() && !(mc.field_71462_r instanceof bigname.zprestige.webhack.features.gui.OyVeyGui) && ((Bind)this.switchBind.getValue()).getKey() == Keyboard.getEventKey()) {
/*  457 */       if (((Boolean)this.switchBack.getValue()).booleanValue() && ((Boolean)this.offhandSwitch.getValue()).booleanValue() && this.offHand) {
/*  458 */         Offhand module = (Offhand)WebHack.moduleManager.getModuleByClass(Offhand.class);
/*  459 */         if (module.isOff()) {
/*  460 */           Command.sendMessage("<" + getDisplayName() + "> §cSwitch failed. Enable the Offhand module.");
/*      */         } else {
/*  462 */           module.setMode(Offhand$Mode2.TOTEMS);
/*  463 */           module.doSwitch();
/*      */         } 
/*      */         return;
/*      */       } 
/*  467 */       this.switching = !this.switching;
/*      */     } 
/*      */   }
/*      */   
/*      */   @SubscribeEvent
/*      */   public void onSettingChange(ClientEvent event) {
/*  473 */     if (event.getStage() == 2 && event.getSetting() != null && event.getSetting().getFeature() != null && event.getSetting().getFeature().equals(this) && isEnabled() && (event.getSetting().equals(this.threadDelay) || event.getSetting().equals(this.threadMode))) {
/*  474 */       if (this.executor != null) {
/*  475 */         this.executor.shutdown();
/*      */       }
/*  477 */       if (this.thread != null) {
/*  478 */         this.shouldInterrupt.set(true);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void postProcessing() {
/*  484 */     if (this.threadMode.getValue() != ThreadMode.NONE || ((Integer)this.eventMode.getValue()).intValue() != 2 || this.rotate.getValue() == Rotate.OFF || !((Boolean)this.rotateFirst.getValue()).booleanValue()) {
/*      */       return;
/*      */     }
/*  487 */     switch ((Logic)this.logic.getValue()) {
/*      */       case OFF:
/*  489 */         postProcessBreak();
/*  490 */         postProcessPlace();
/*      */         break;
/*      */       
/*      */       case PLACE:
/*  494 */         postProcessPlace();
/*  495 */         postProcessBreak();
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void postProcessBreak() {
/*  503 */     while (!this.packetUseEntities.isEmpty()) {
/*  504 */       CPacketUseEntity packet = this.packetUseEntities.poll();
/*  505 */       mc.field_71439_g.field_71174_a.func_147297_a((Packet)packet);
/*  506 */       if (((Boolean)this.breakSwing.getValue()).booleanValue()) {
/*  507 */         mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
/*      */       }
/*  509 */       this.breakTimer.reset();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void postProcessPlace() {
/*  514 */     if (this.placeInfo != null) {
/*  515 */       this.placeInfo.runPlace();
/*  516 */       this.placeTimer.reset();
/*  517 */       this.placeInfo = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void processMultiThreading() {
/*  522 */     if (isOff()) {
/*      */       return;
/*      */     }
/*  525 */     if (this.threadMode.getValue() == ThreadMode.WHILE) {
/*  526 */       handleWhile();
/*  527 */     } else if (this.threadMode.getValue() != ThreadMode.NONE) {
/*  528 */       handlePool(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void handlePool(boolean justDoIt) {
/*  533 */     if (justDoIt || this.executor == null || this.executor.isTerminated() || this.executor.isShutdown() || (this.syncroTimer.passedMs(((Integer)this.syncThreads.getValue()).intValue()) && ((Boolean)this.syncThreadBool.getValue()).booleanValue())) {
/*  534 */       if (this.executor != null) {
/*  535 */         this.executor.shutdown();
/*      */       }
/*  537 */       this.executor = getExecutor();
/*  538 */       this.syncroTimer.reset();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void handleWhile() {
/*  543 */     if (this.thread == null || this.thread.isInterrupted() || !this.thread.isAlive() || (this.syncroTimer.passedMs(((Integer)this.syncThreads.getValue()).intValue()) && ((Boolean)this.syncThreadBool.getValue()).booleanValue())) {
/*  544 */       if (this.thread == null) {
/*  545 */         this.thread = new Thread(RAutoCrystal.getInstance(this));
/*  546 */       } else if (this.syncroTimer.passedMs(((Integer)this.syncThreads.getValue()).intValue()) && !this.shouldInterrupt.get() && ((Boolean)this.syncThreadBool.getValue()).booleanValue()) {
/*  547 */         this.shouldInterrupt.set(true);
/*  548 */         this.syncroTimer.reset();
/*      */         return;
/*      */       } 
/*  551 */       if (this.thread != null && (this.thread.isInterrupted() || !this.thread.isAlive())) {
/*  552 */         this.thread = new Thread(RAutoCrystal.getInstance(this));
/*      */       }
/*  554 */       if (this.thread != null && this.thread.getState() == Thread.State.NEW) {
/*      */         try {
/*  556 */           this.thread.start();
/*  557 */         } catch (Exception e) {
/*  558 */           e.printStackTrace();
/*      */         } 
/*  560 */         this.syncroTimer.reset();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private ScheduledExecutorService getExecutor() {
/*  566 */     ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
/*  567 */     service.scheduleAtFixedRate(RAutoCrystal.getInstance(this), 0L, ((Integer)this.threadDelay.getValue()).intValue(), TimeUnit.MILLISECONDS);
/*  568 */     return service;
/*      */   }
/*      */   
/*      */   public void doAutoCrystal() {
/*  572 */     if (((Boolean)this.brownZombie.getValue()).booleanValue()) {
/*      */       return;
/*      */     }
/*  575 */     if (check()) {
/*  576 */       switch ((Logic)this.logic.getValue()) {
/*      */         case PLACE:
/*  578 */           placeCrystal();
/*  579 */           breakCrystal();
/*      */           break;
/*      */         
/*      */         case OFF:
/*  583 */           breakCrystal();
/*  584 */           placeCrystal();
/*      */           break;
/*      */       } 
/*      */       
/*  588 */       manualBreaker();
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean check() {
/*  593 */     if (fullNullCheck()) {
/*  594 */       return false;
/*      */     }
/*  596 */     if (this.syncTimer.passedMs(((Integer)this.damageSyncTime.getValue()).intValue())) {
/*  597 */       this.currentSyncTarget = null;
/*  598 */       this.syncedCrystalPos = null;
/*  599 */       this.syncedPlayerPos = null;
/*  600 */     } else if (((Boolean)this.syncySync.getValue()).booleanValue() && this.syncedCrystalPos != null) {
/*  601 */       this.posConfirmed = true;
/*      */     } 
/*  603 */     this.foundDoublePop = false;
/*  604 */     if (this.renderTimer.passedMs(500L)) {
/*  605 */       this.renderPos = null;
/*  606 */       this.renderTimer.reset();
/*      */     } 
/*  608 */     this.mainHand = (mc.field_71439_g.func_184614_ca().func_77973_b() == Items.field_185158_cP);
/*  609 */     this.offHand = (mc.field_71439_g.func_184592_cb().func_77973_b() == Items.field_185158_cP);
/*  610 */     this.currentDamage = 0.0D;
/*  611 */     this.placePos = null;
/*  612 */     if (!this.offHand && !this.mainHand) {
/*  613 */       this.placeInfo = null;
/*  614 */       this.packetUseEntities.clear();
/*      */     } 
/*  616 */     if (this.offHand || this.mainHand) {
/*  617 */       this.switching = false;
/*      */     }
/*  619 */     if ((!this.offHand && !this.mainHand && this.switchMode.getValue() == Switch.BREAKSLOT && !this.switching) || !DamageUtil.canBreakWeakness((EntityPlayer)mc.field_71439_g) || !this.switchTimer.passedMs(((Integer)this.switchCooldown.getValue()).intValue())) {
/*  620 */       this.renderPos = null;
/*  621 */       target = null;
/*  622 */       this.rotating = false;
/*  623 */       return false;
/*      */     } 
/*  625 */     if (((Boolean)this.mineSwitch.getValue()).booleanValue() && Mouse.isButtonDown(0) && (this.switching || this.autoSwitch.getValue() == AutoSwitch.ALWAYS) && Mouse.isButtonDown(1) && mc.field_71439_g.func_184614_ca().func_77973_b() instanceof net.minecraft.item.ItemPickaxe) {
/*  626 */       switchItem();
/*      */     }
/*  628 */     mapCrystals();
/*  629 */     if (!this.posConfirmed && this.damageSync.getValue() != DamageSync.NONE && this.syncTimer.passedMs(((Integer)this.confirm.getValue()).intValue())) {
/*  630 */       this.syncTimer.setMs((((Integer)this.damageSyncTime.getValue()).intValue() + 1));
/*      */     }
/*  632 */     return true;
/*      */   }
/*      */   
/*      */   private void mapCrystals() {
/*  636 */     this.efficientTarget = null;
/*  637 */     if (((Integer)this.packets.getValue()).intValue() != 1) {
/*  638 */       this.attackList = new ConcurrentLinkedQueue<>();
/*  639 */       this.crystalMap = new HashMap<>();
/*      */     } 
/*  641 */     this.crystalCount = 0;
/*  642 */     this.minDmgCount = 0;
/*  643 */     Entity maxCrystal = null;
/*  644 */     float maxDamage = 0.5F;
/*  645 */     for (Entity entity : mc.field_71441_e.field_72996_f) {
/*  646 */       if (entity.field_70128_L || !(entity instanceof EntityEnderCrystal) || !isValid(entity))
/*  647 */         continue;  if (((Boolean)this.syncedFeetPlace.getValue()).booleanValue() && entity.func_180425_c().func_177977_b().equals(this.syncedCrystalPos) && this.damageSync.getValue() != DamageSync.NONE) {
/*  648 */         this.minDmgCount++;
/*  649 */         this.crystalCount++;
/*  650 */         if (((Boolean)this.syncCount.getValue()).booleanValue()) {
/*  651 */           this.minDmgCount = ((Integer)this.wasteAmount.getValue()).intValue() + 1;
/*  652 */           this.crystalCount = ((Integer)this.wasteAmount.getValue()).intValue() + 1;
/*      */         } 
/*  654 */         if (!((Boolean)this.hyperSync.getValue()).booleanValue())
/*  655 */           continue;  maxCrystal = null;
/*      */         break;
/*      */       } 
/*  658 */       boolean count = false;
/*  659 */       boolean countMin = false;
/*  660 */       float selfDamage = -1.0F;
/*  661 */       if (DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) {
/*  662 */         selfDamage = DamageUtil.calculateDamage(entity, (Entity)mc.field_71439_g);
/*      */       }
/*  664 */       if (selfDamage + 0.5D < EntityUtil.getHealth((Entity)mc.field_71439_g) && selfDamage <= ((Float)this.maxSelfBreak.getValue()).floatValue()) {
/*  665 */         Entity beforeCrystal = maxCrystal;
/*  666 */         float beforeDamage = maxDamage;
/*  667 */         for (EntityPlayer player : mc.field_71441_e.field_73010_i) {
/*      */           
/*  669 */           if (player.func_70068_e(entity) > MathUtil.square(((Float)this.range.getValue()).floatValue()))
/*      */             continue; 
/*  671 */           if (EntityUtil.isValid((Entity)player, (((Float)this.range.getValue()).floatValue() + ((Float)this.breakRange.getValue()).floatValue()))) {
/*  672 */             float f; if ((((Boolean)this.antiNaked.getValue()).booleanValue() && DamageUtil.isNaked(player)) || ((f = DamageUtil.calculateDamage(entity, (Entity)player)) <= selfDamage && (f <= ((Float)this.minDamage.getValue()).floatValue() || DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) && f <= EntityUtil.getHealth((Entity)player)))
/*      */               continue; 
/*  674 */             if (f > maxDamage) {
/*  675 */               maxDamage = f;
/*  676 */               maxCrystal = entity;
/*      */             } 
/*  678 */             if (((Integer)this.packets.getValue()).intValue() == 1) {
/*  679 */               if (f >= ((Float)this.minDamage.getValue()).floatValue() || !((Boolean)this.wasteMinDmgCount.getValue()).booleanValue()) {
/*  680 */                 count = true;
/*      */               }
/*  682 */               countMin = true;
/*      */               continue;
/*      */             } 
/*  685 */             if (this.crystalMap.get(entity) != null && ((Float)this.crystalMap.get(entity)).floatValue() >= f)
/*      */               continue; 
/*  687 */             this.crystalMap.put(entity, Float.valueOf(f)); continue;
/*      */           } 
/*      */           float damage;
/*  690 */           if ((this.antiFriendPop.getValue() != AntiFriendPop.BREAK && this.antiFriendPop.getValue() != AntiFriendPop.ALL) || !WebHack.friendManager.isFriend(player.func_70005_c_()) || (damage = DamageUtil.calculateDamage(entity, (Entity)player)) <= EntityUtil.getHealth((Entity)player) + 0.5D)
/*      */             continue; 
/*  692 */           maxCrystal = beforeCrystal;
/*  693 */           maxDamage = beforeDamage;
/*  694 */           this.crystalMap.remove(entity);
/*  695 */           if (!((Boolean)this.noCount.getValue()).booleanValue())
/*  696 */             break;  count = false;
/*  697 */           countMin = false;
/*      */         } 
/*      */       } 
/*      */       
/*  701 */       if (!countMin)
/*  702 */         continue;  this.minDmgCount++;
/*  703 */       if (!count)
/*  704 */         continue;  this.crystalCount++;
/*      */     } 
/*  706 */     if (this.damageSync.getValue() == DamageSync.BREAK && (maxDamage > this.lastDamage || this.syncTimer.passedMs(((Integer)this.damageSyncTime.getValue()).intValue()) || this.damageSync.getValue() == DamageSync.NONE)) {
/*  707 */       this.lastDamage = maxDamage;
/*      */     }
/*  709 */     if (((Boolean)this.enormousSync.getValue()).booleanValue() && ((Boolean)this.syncedFeetPlace.getValue()).booleanValue() && this.damageSync.getValue() != DamageSync.NONE && this.syncedCrystalPos != null) {
/*  710 */       if (((Boolean)this.syncCount.getValue()).booleanValue()) {
/*  711 */         this.minDmgCount = ((Integer)this.wasteAmount.getValue()).intValue() + 1;
/*  712 */         this.crystalCount = ((Integer)this.wasteAmount.getValue()).intValue() + 1;
/*      */       } 
/*      */       return;
/*      */     } 
/*  716 */     if (((Boolean)this.webAttack.getValue()).booleanValue() && this.webPos != null) {
/*  717 */       if (mc.field_71439_g.func_174818_b(this.webPos.func_177984_a()) > MathUtil.square(((Float)this.breakRange.getValue()).floatValue())) {
/*  718 */         this.webPos = null;
/*      */       } else {
/*  720 */         for (Entity entity : mc.field_71441_e.func_72872_a(Entity.class, new AxisAlignedBB(this.webPos.func_177984_a()))) {
/*  721 */           if (!(entity instanceof EntityEnderCrystal))
/*  722 */             continue;  this.attackList.add(entity);
/*  723 */           this.efficientTarget = entity;
/*  724 */           this.webPos = null;
/*  725 */           this.lastDamage = 0.5D;
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     }
/*  730 */     if (shouldSlowBreak(true) && maxDamage < ((Float)this.minDamage.getValue()).floatValue() && (target == null || EntityUtil.getHealth((Entity)target) > ((Float)this.facePlace.getValue()).floatValue() || (!this.breakTimer.passedMs(((Integer)this.facePlaceSpeed.getValue()).intValue()) && ((Boolean)this.slowFaceBreak.getValue()).booleanValue() && Mouse.isButtonDown(0) && ((Boolean)this.holdFacePlace.getValue()).booleanValue() && ((Boolean)this.holdFaceBreak.getValue()).booleanValue()))) {
/*  731 */       this.efficientTarget = null;
/*      */       return;
/*      */     } 
/*  734 */     if (((Integer)this.packets.getValue()).intValue() == 1) {
/*  735 */       this.efficientTarget = maxCrystal;
/*      */     } else {
/*  737 */       this.crystalMap = MathUtil.sortByValue(this.crystalMap, true);
/*  738 */       for (Map.Entry<Entity, Float> entry : this.crystalMap.entrySet()) {
/*  739 */         Entity crystal = (Entity)entry.getKey();
/*  740 */         float damage = ((Float)entry.getValue()).floatValue();
/*  741 */         if (damage >= ((Float)this.minDamage.getValue()).floatValue() || !((Boolean)this.wasteMinDmgCount.getValue()).booleanValue()) {
/*  742 */           this.crystalCount++;
/*      */         }
/*  744 */         this.attackList.add(crystal);
/*  745 */         this.minDmgCount++;
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean shouldSlowBreak(boolean withManual) {
/*  751 */     return ((withManual && ((Boolean)this.manual.getValue()).booleanValue() && ((Boolean)this.manualMinDmg.getValue()).booleanValue() && Mouse.isButtonDown(1) && (!Mouse.isButtonDown(0) || !((Boolean)this.holdFacePlace.getValue()).booleanValue())) || (((Boolean)this.holdFacePlace.getValue()).booleanValue() && ((Boolean)this.holdFaceBreak.getValue()).booleanValue() && Mouse.isButtonDown(0) && !this.breakTimer.passedMs(((Integer)this.facePlaceSpeed.getValue()).intValue())) || (((Boolean)this.slowFaceBreak.getValue()).booleanValue() && !this.breakTimer.passedMs(((Integer)this.facePlaceSpeed.getValue()).intValue())));
/*      */   }
/*      */ 
/*      */   
/*      */   private void placeCrystal() {
/*  756 */     int crystalLimit = ((Integer)this.wasteAmount.getValue()).intValue();
/*  757 */     if (this.placeTimer.passedMs(((Integer)this.placeDelay.getValue()).intValue()) && ((Boolean)this.place.getValue()).booleanValue() && (this.offHand || this.mainHand || this.switchMode.getValue() == Switch.CALC || (this.switchMode.getValue() == Switch.BREAKSLOT && this.switching))) {
/*  758 */       if ((this.offHand || this.mainHand || (this.switchMode.getValue() != Switch.ALWAYS && !this.switching)) && this.crystalCount >= crystalLimit && (!((Boolean)this.antiSurround.getValue()).booleanValue() || this.lastPos == null || !this.lastPos.equals(this.placePos))) {
/*      */         return;
/*      */       }
/*  761 */       calculateDamage(getTarget((this.targetMode.getValue() == Target.UNSAFE)));
/*  762 */       if (target != null && this.placePos != null) {
/*  763 */         if (!this.offHand && !this.mainHand && this.autoSwitch.getValue() != AutoSwitch.NONE && (this.currentDamage > ((Float)this.minDamage.getValue()).floatValue() || (((Boolean)this.lethalSwitch.getValue()).booleanValue() && EntityUtil.getHealth((Entity)target) <= ((Float)this.facePlace.getValue()).floatValue())) && !switchItem()) {
/*      */           return;
/*      */         }
/*  766 */         if (this.currentDamage < ((Float)this.minDamage.getValue()).floatValue() && ((Boolean)this.limitFacePlace.getValue()).booleanValue()) {
/*  767 */           crystalLimit = 1;
/*      */         }
/*  769 */         if (this.currentDamage >= ((Float)this.minMinDmg.getValue()).floatValue() && (this.offHand || this.mainHand || this.autoSwitch.getValue() != AutoSwitch.NONE) && (this.crystalCount < crystalLimit || (((Boolean)this.antiSurround.getValue()).booleanValue() && this.lastPos != null && this.lastPos.equals(this.placePos))) && (this.currentDamage > ((Float)this.minDamage.getValue()).floatValue() || this.minDmgCount < crystalLimit) && this.currentDamage >= 1.0D && (DamageUtil.isArmorLow(target, ((Integer)this.minArmor.getValue()).intValue()) || EntityUtil.getHealth((Entity)target) <= ((Float)this.facePlace.getValue()).floatValue() || this.currentDamage > ((Float)this.minDamage.getValue()).floatValue() || shouldHoldFacePlace())) {
/*  770 */           float damageOffset = (this.damageSync.getValue() == DamageSync.BREAK) ? (((Float)this.dropOff.getValue()).floatValue() - 5.0F) : 0.0F;
/*  771 */           boolean syncflag = false;
/*  772 */           if (((Boolean)this.syncedFeetPlace.getValue()).booleanValue() && this.placePos.equals(this.lastPos) && isEligableForFeetSync(target, this.placePos) && !this.syncTimer.passedMs(((Integer)this.damageSyncTime.getValue()).intValue()) && target.equals(this.currentSyncTarget) && target.func_180425_c().equals(this.syncedPlayerPos) && this.damageSync.getValue() != DamageSync.NONE) {
/*  773 */             this.syncedCrystalPos = this.placePos;
/*  774 */             this.lastDamage = this.currentDamage;
/*  775 */             if (((Boolean)this.fullSync.getValue()).booleanValue()) {
/*  776 */               this.lastDamage = 100.0D;
/*      */             }
/*  778 */             syncflag = true;
/*      */           } 
/*  780 */           if (syncflag || this.currentDamage - damageOffset > this.lastDamage || this.syncTimer.passedMs(((Integer)this.damageSyncTime.getValue()).intValue()) || this.damageSync.getValue() == DamageSync.NONE) {
/*  781 */             if (!syncflag && this.damageSync.getValue() != DamageSync.BREAK) {
/*  782 */               this.lastDamage = this.currentDamage;
/*      */             }
/*  784 */             this.renderPos = this.placePos;
/*  785 */             this.renderDamage = this.currentDamage;
/*  786 */             if (switchItem()) {
/*  787 */               this.currentSyncTarget = target;
/*  788 */               this.syncedPlayerPos = target.func_180425_c();
/*  789 */               if (this.foundDoublePop) {
/*  790 */                 this.totemPops.put(target, (new Timer()).reset());
/*      */               }
/*  792 */               rotateToPos(this.placePos);
/*  793 */               if (this.addTolowDmg || (((Boolean)this.actualSlowBreak.getValue()).booleanValue() && this.currentDamage < ((Float)this.minDamage.getValue()).floatValue())) {
/*  794 */                 lowDmgPos.add(this.placePos);
/*      */               }
/*  796 */               placedPos.add(this.placePos);
/*  797 */               if (!((Boolean)this.justRender.getValue()).booleanValue()) {
/*  798 */                 if (((Integer)this.eventMode.getValue()).intValue() == 2 && this.threadMode.getValue() == ThreadMode.NONE && ((Boolean)this.rotateFirst.getValue()).booleanValue() && this.rotate.getValue() != Rotate.OFF) {
/*  799 */                   this.placeInfo = new PlaceInfo(this.placePos, this.offHand, ((Boolean)this.placeSwing.getValue()).booleanValue(), ((Boolean)this.exactHand.getValue()).booleanValue());
/*      */                 } else {
/*  801 */                   BlockUtil.placeCrystalOnBlock(this.placePos, this.offHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, ((Boolean)this.placeSwing.getValue()).booleanValue(), ((Boolean)this.exactHand.getValue()).booleanValue());
/*      */                 } 
/*      */               }
/*  804 */               this.lastPos = this.placePos;
/*  805 */               this.placeTimer.reset();
/*  806 */               this.posConfirmed = false;
/*  807 */               if (this.syncTimer.passedMs(((Integer)this.damageSyncTime.getValue()).intValue())) {
/*  808 */                 this.syncedCrystalPos = null;
/*  809 */                 this.syncTimer.reset();
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } else {
/*  815 */         this.renderPos = null;
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean shouldHoldFacePlace() {
/*  821 */     this.addTolowDmg = false;
/*  822 */     if (((Boolean)this.holdFacePlace.getValue()).booleanValue() && Mouse.isButtonDown(0)) {
/*  823 */       this.addTolowDmg = true;
/*  824 */       return true;
/*      */     } 
/*  826 */     return false;
/*      */   }
/*      */   
/*      */   private boolean switchItem() {
/*  830 */     if (this.offHand || this.mainHand) {
/*  831 */       return true;
/*      */     }
/*  833 */     switch ((AutoSwitch)this.autoSwitch.getValue()) {
/*      */       case OFF:
/*  835 */         return false;
/*      */       
/*      */       case PLACE:
/*  838 */         if (!this.switching) {
/*  839 */           return false;
/*      */         }
/*      */       
/*      */       case BREAK:
/*  843 */         if (!doSwitch())
/*  844 */           break;  return true;
/*      */     } 
/*      */     
/*  847 */     return false;
/*      */   }
/*      */   
/*      */   private boolean doSwitch() {
/*  851 */     if (((Boolean)this.offhandSwitch.getValue()).booleanValue()) {
/*  852 */       Offhand module = (Offhand)WebHack.moduleManager.getModuleByClass(Offhand.class);
/*  853 */       if (module.isOff()) {
/*  854 */         Command.sendMessage("<" + getDisplayName() + "> §cSwitch failed. Enable the Offhand module.");
/*  855 */         this.switching = false;
/*  856 */         return false;
/*      */       } 
/*  858 */       this.switching = false;
/*  859 */       return true;
/*      */     } 
/*  861 */     if (mc.field_71439_g.func_184592_cb().func_77973_b() == Items.field_185158_cP) {
/*  862 */       this.mainHand = false;
/*      */     } else {
/*  864 */       InventoryUtil.switchToHotbarSlot(ItemEndCrystal.class, false);
/*  865 */       this.mainHand = true;
/*      */     } 
/*  867 */     this.switching = false;
/*  868 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void calculateDamage(EntityPlayer targettedPlayer) {
/*  874 */     if (targettedPlayer == null && this.targetMode.getValue() != Target.DAMAGE && !((Boolean)this.fullCalc.getValue()).booleanValue()) {
/*      */       return;
/*      */     }
/*  877 */     float maxDamage = 0.5F;
/*  878 */     EntityPlayer currentTarget = null;
/*  879 */     BlockPos currentPos = null;
/*  880 */     float maxSelfDamage = 0.0F;
/*  881 */     this.foundDoublePop = false;
/*  882 */     BlockPos setToAir = null;
/*  883 */     IBlockState state = null; BlockPos playerPos; Block web;
/*  884 */     if (((Boolean)this.webAttack.getValue()).booleanValue() && targettedPlayer != null && (web = mc.field_71441_e.func_180495_p(playerPos = new BlockPos(targettedPlayer.func_174791_d())).func_177230_c()) == Blocks.field_150321_G) {
/*  885 */       setToAir = playerPos;
/*  886 */       state = mc.field_71441_e.func_180495_p(playerPos);
/*  887 */       mc.field_71441_e.func_175698_g(playerPos);
/*      */     } 
/*      */     
/*  890 */     for (BlockPos pos : BlockUtil.possiblePlacePositions(((Float)this.placeRange.getValue()).floatValue(), ((Boolean)this.antiSurround.getValue()).booleanValue(), ((Boolean)this.oneDot15.getValue()).booleanValue())) {
/*  891 */       if (!BlockUtil.rayTracePlaceCheck(pos, ((this.raytrace.getValue() == Raytrace.PLACE || this.raytrace.getValue() == Raytrace.FULL) && mc.field_71439_g.func_174818_b(pos) > MathUtil.square(((Float)this.placetrace.getValue()).floatValue())), 1.0F))
/*      */         continue; 
/*  893 */       float selfDamage = -1.0F;
/*  894 */       if (DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) {
/*  895 */         selfDamage = DamageUtil.calculateDamage(pos, (Entity)mc.field_71439_g);
/*      */       }
/*  897 */       if (selfDamage + 0.5D >= EntityUtil.getHealth((Entity)mc.field_71439_g) || selfDamage > ((Float)this.maxSelfPlace.getValue()).floatValue())
/*      */         continue; 
/*  899 */       if (targettedPlayer != null) {
/*  900 */         float playerDamage = DamageUtil.calculateDamage(pos, (Entity)targettedPlayer);
/*  901 */         if (((Boolean)this.calcEvenIfNoDamage.getValue()).booleanValue() && (this.antiFriendPop.getValue() == AntiFriendPop.ALL || this.antiFriendPop.getValue() == AntiFriendPop.PLACE)) {
/*  902 */           boolean friendPop = false;
/*  903 */           for (EntityPlayer friend : mc.field_71441_e.field_73010_i) {
/*      */             float friendDamage;
/*  905 */             if (friend == null || mc.field_71439_g.equals(friend) || friend.func_174818_b(pos) > MathUtil.square((((Float)this.range.getValue()).floatValue() + ((Float)this.placeRange.getValue()).floatValue())) || !WebHack.friendManager.isFriend(friend) || (friendDamage = DamageUtil.calculateDamage(pos, (Entity)friend)) <= EntityUtil.getHealth((Entity)friend) + 0.5D)
/*      */               continue; 
/*  907 */             friendPop = true;
/*      */           } 
/*      */           
/*  910 */           if (friendPop)
/*      */             continue; 
/*  912 */         }  if (isDoublePoppable(targettedPlayer, playerDamage) && (currentPos == null || targettedPlayer.func_174818_b(pos) < targettedPlayer.func_174818_b(currentPos))) {
/*  913 */           currentTarget = targettedPlayer;
/*  914 */           maxDamage = playerDamage;
/*  915 */           currentPos = pos;
/*  916 */           this.foundDoublePop = true;
/*      */           continue;
/*      */         } 
/*  919 */         if (this.foundDoublePop || (playerDamage <= maxDamage && (!((Boolean)this.extraSelfCalc.getValue()).booleanValue() || playerDamage < maxDamage || selfDamage >= maxSelfDamage)) || (playerDamage <= selfDamage && (playerDamage <= ((Float)this.minDamage.getValue()).floatValue() || DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) && playerDamage <= EntityUtil.getHealth((Entity)targettedPlayer)))
/*      */           continue; 
/*  921 */         maxDamage = playerDamage;
/*  922 */         currentTarget = targettedPlayer;
/*  923 */         currentPos = pos;
/*  924 */         maxSelfDamage = selfDamage;
/*      */         continue;
/*      */       } 
/*  927 */       float maxDamageBefore = maxDamage;
/*  928 */       EntityPlayer currentTargetBefore = currentTarget;
/*  929 */       BlockPos currentPosBefore = currentPos;
/*  930 */       float maxSelfDamageBefore = maxSelfDamage;
/*  931 */       for (EntityPlayer player : mc.field_71441_e.field_73010_i) {
/*      */         
/*  933 */         if (EntityUtil.isValid((Entity)player, (((Float)this.placeRange.getValue()).floatValue() + ((Float)this.range.getValue()).floatValue()))) {
/*  934 */           if (((Boolean)this.antiNaked.getValue()).booleanValue() && DamageUtil.isNaked(player))
/*  935 */             continue;  float playerDamage = DamageUtil.calculateDamage(pos, (Entity)player);
/*  936 */           if (((Boolean)this.doublePopOnDamage.getValue()).booleanValue() && isDoublePoppable(player, playerDamage) && (currentPos == null || player.func_174818_b(pos) < player.func_174818_b(currentPos))) {
/*  937 */             currentTarget = player;
/*  938 */             maxDamage = playerDamage;
/*  939 */             currentPos = pos;
/*  940 */             maxSelfDamage = selfDamage;
/*  941 */             this.foundDoublePop = true;
/*  942 */             if (this.antiFriendPop.getValue() != AntiFriendPop.BREAK && this.antiFriendPop.getValue() != AntiFriendPop.PLACE)
/*      */               continue; 
/*      */             break;
/*      */           } 
/*  946 */           if (this.foundDoublePop || (playerDamage <= maxDamage && (!((Boolean)this.extraSelfCalc.getValue()).booleanValue() || playerDamage < maxDamage || selfDamage >= maxSelfDamage)) || (playerDamage <= selfDamage && (playerDamage <= ((Float)this.minDamage.getValue()).floatValue() || DamageUtil.canTakeDamage(((Boolean)this.suicide.getValue()).booleanValue())) && playerDamage <= EntityUtil.getHealth((Entity)player)))
/*      */             continue; 
/*  948 */           maxDamage = playerDamage;
/*  949 */           currentTarget = player;
/*  950 */           currentPos = pos;
/*  951 */           maxSelfDamage = selfDamage; continue;
/*      */         } 
/*      */         float friendDamage;
/*  954 */         if ((this.antiFriendPop.getValue() != AntiFriendPop.ALL && this.antiFriendPop.getValue() != AntiFriendPop.PLACE) || player == null || player.func_174818_b(pos) > MathUtil.square((((Float)this.range.getValue()).floatValue() + ((Float)this.placeRange.getValue()).floatValue())) || !WebHack.friendManager.isFriend(player) || (friendDamage = DamageUtil.calculateDamage(pos, (Entity)player)) <= EntityUtil.getHealth((Entity)player) + 0.5D)
/*      */           continue; 
/*  956 */         maxDamage = maxDamageBefore;
/*  957 */         currentTarget = currentTargetBefore;
/*  958 */         currentPos = currentPosBefore;
/*  959 */         maxSelfDamage = maxSelfDamageBefore;
/*      */       } 
/*      */     } 
/*      */     
/*  963 */     if (setToAir != null) {
/*  964 */       mc.field_71441_e.func_175656_a(setToAir, state);
/*  965 */       this.webPos = currentPos;
/*      */     } 
/*  967 */     target = currentTarget;
/*  968 */     this.currentDamage = maxDamage;
/*  969 */     this.placePos = currentPos;
/*      */   }
/*      */   private EntityPlayer getTarget(boolean unsafe) {
/*      */     EntityOtherPlayerMP entityOtherPlayerMP;
/*  973 */     if (this.targetMode.getValue() == Target.DAMAGE) {
/*  974 */       return null;
/*      */     }
/*  976 */     EntityPlayer currentTarget = null;
/*  977 */     for (EntityPlayer player : mc.field_71441_e.field_73010_i) {
/*  978 */       if (EntityUtil.isntValid((Entity)player, (((Float)this.placeRange.getValue()).floatValue() + ((Float)this.range.getValue()).floatValue())) || (((Boolean)this.antiNaked.getValue()).booleanValue() && DamageUtil.isNaked(player)) || (unsafe && EntityUtil.isSafe((Entity)player, -1, false)))
/*      */         continue; 
/*  980 */       if (((Integer)this.minArmor.getValue()).intValue() > 0 && DamageUtil.isArmorLow(player, ((Integer)this.minArmor.getValue()).intValue())) {
/*  981 */         currentTarget = player;
/*      */         break;
/*      */       } 
/*  984 */       if (currentTarget == null) {
/*  985 */         currentTarget = player;
/*      */         continue;
/*      */       } 
/*  988 */       if (mc.field_71439_g.func_70068_e((Entity)player) >= mc.field_71439_g.func_70068_e((Entity)currentTarget))
/*      */         continue; 
/*  990 */       currentTarget = player;
/*      */     } 
/*  992 */     if (unsafe && currentTarget == null) {
/*  993 */       return getTarget(false);
/*      */     }
/*  995 */     if (((Boolean)this.predictPos.getValue()).booleanValue() && currentTarget != null) {
/*  996 */       GameProfile profile = new GameProfile((currentTarget.func_110124_au() == null) ? UUID.fromString("8af022c8-b926-41a0-8b79-2b544ff00fcf") : currentTarget.func_110124_au(), currentTarget.func_70005_c_());
/*  997 */       EntityOtherPlayerMP newTarget = new EntityOtherPlayerMP((World)mc.field_71441_e, profile);
/*  998 */       Vec3d extrapolatePosition = MathUtil.extrapolatePlayerPosition(currentTarget, ((Integer)this.predictTicks.getValue()).intValue());
/*  999 */       newTarget.func_82149_j((Entity)currentTarget);
/* 1000 */       newTarget.field_70165_t = extrapolatePosition.field_72450_a;
/* 1001 */       newTarget.field_70163_u = extrapolatePosition.field_72448_b;
/* 1002 */       newTarget.field_70161_v = extrapolatePosition.field_72449_c;
/* 1003 */       newTarget.func_70606_j(EntityUtil.getHealth((Entity)currentTarget));
/* 1004 */       newTarget.field_71071_by.func_70455_b(currentTarget.field_71071_by);
/* 1005 */       entityOtherPlayerMP = newTarget;
/*      */     } 
/* 1007 */     return (EntityPlayer)entityOtherPlayerMP;
/*      */   }
/*      */   
/*      */   private void breakCrystal() {
/* 1011 */     if (((Boolean)this.explode.getValue()).booleanValue() && this.breakTimer.passedMs(((Integer)this.breakDelay.getValue()).intValue()) && (this.switchMode.getValue() == Switch.ALWAYS || this.mainHand || this.offHand)) {
/* 1012 */       if (((Integer)this.packets.getValue()).intValue() == 1 && this.efficientTarget != null) {
/* 1013 */         if (((Boolean)this.justRender.getValue()).booleanValue()) {
/* 1014 */           doFakeSwing();
/*      */           return;
/*      */         } 
/* 1017 */         if (((Boolean)this.syncedFeetPlace.getValue()).booleanValue() && ((Boolean)this.gigaSync.getValue()).booleanValue() && this.syncedCrystalPos != null && this.damageSync.getValue() != DamageSync.NONE) {
/*      */           return;
/*      */         }
/* 1020 */         rotateTo(this.efficientTarget);
/* 1021 */         attackEntity(this.efficientTarget);
/* 1022 */         this.breakTimer.reset();
/* 1023 */       } else if (!this.attackList.isEmpty()) {
/* 1024 */         if (((Boolean)this.justRender.getValue()).booleanValue()) {
/* 1025 */           doFakeSwing();
/*      */           return;
/*      */         } 
/* 1028 */         if (((Boolean)this.syncedFeetPlace.getValue()).booleanValue() && ((Boolean)this.gigaSync.getValue()).booleanValue() && this.syncedCrystalPos != null && this.damageSync.getValue() != DamageSync.NONE) {
/*      */           return;
/*      */         }
/* 1031 */         for (int i = 0; i < ((Integer)this.packets.getValue()).intValue(); i++) {
/* 1032 */           Entity entity = this.attackList.poll();
/* 1033 */           if (entity != null) {
/* 1034 */             rotateTo(entity);
/* 1035 */             attackEntity(entity);
/*      */           } 
/* 1037 */         }  this.breakTimer.reset();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private void attackEntity(Entity entity) {
/* 1043 */     if (entity != null) {
/* 1044 */       if (((Integer)this.eventMode.getValue()).intValue() == 2 && this.threadMode.getValue() == ThreadMode.NONE && ((Boolean)this.rotateFirst.getValue()).booleanValue() && this.rotate.getValue() != Rotate.OFF) {
/* 1045 */         this.packetUseEntities.add(new CPacketUseEntity(entity));
/*      */       } else {
/* 1047 */         EntityUtil.attackEntity(entity, ((Boolean)this.sync.getValue()).booleanValue(), ((Boolean)this.breakSwing.getValue()).booleanValue());
/* 1048 */         brokenPos.add((new BlockPos(entity.func_174791_d())).func_177977_b());
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private void doFakeSwing() {
/* 1054 */     if (((Boolean)this.fakeSwing.getValue()).booleanValue()) {
/* 1055 */       EntityUtil.swingArmNoPacket(EnumHand.MAIN_HAND, (EntityLivingBase)mc.field_71439_g);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private void manualBreaker() {
/* 1061 */     if (this.rotate.getValue() != Rotate.OFF && ((Integer)this.eventMode.getValue()).intValue() != 2 && this.rotating)
/* 1062 */       if (this.didRotation) {
/* 1063 */         mc.field_71439_g.field_70125_A = (float)(mc.field_71439_g.field_70125_A + 4.0E-4D);
/* 1064 */         this.didRotation = false;
/*      */       } else {
/* 1066 */         mc.field_71439_g.field_70125_A = (float)(mc.field_71439_g.field_70125_A - 4.0E-4D);
/* 1067 */         this.didRotation = true;
/*      */       }  
/*      */     RayTraceResult result;
/* 1070 */     if ((this.offHand || this.mainHand) && ((Boolean)this.manual.getValue()).booleanValue() && this.manualTimer.passedMs(((Integer)this.manualBreak.getValue()).intValue()) && Mouse.isButtonDown(1) && mc.field_71439_g.func_184592_cb().func_77973_b() != Items.field_151153_ao && mc.field_71439_g.field_71071_by.func_70448_g().func_77973_b() != Items.field_151153_ao && mc.field_71439_g.field_71071_by.func_70448_g().func_77973_b() != Items.field_151031_f && mc.field_71439_g.field_71071_by.func_70448_g().func_77973_b() != Items.field_151062_by && (result = mc.field_71476_x) != null) {
/* 1071 */       Entity entity; BlockPos mousePos; switch (result.field_72313_a) {
/*      */         case OFF:
/* 1073 */           entity = result.field_72308_g;
/* 1074 */           if (!(entity instanceof EntityEnderCrystal))
/* 1075 */             break;  EntityUtil.attackEntity(entity, ((Boolean)this.sync.getValue()).booleanValue(), ((Boolean)this.breakSwing.getValue()).booleanValue());
/* 1076 */           this.manualTimer.reset();
/*      */           break;
/*      */         
/*      */         case PLACE:
/* 1080 */           mousePos = mc.field_71476_x.func_178782_a().func_177984_a();
/* 1081 */           for (Entity target : mc.field_71441_e.func_72839_b(null, new AxisAlignedBB(mousePos))) {
/* 1082 */             if (!(target instanceof EntityEnderCrystal))
/* 1083 */               continue;  EntityUtil.attackEntity(target, ((Boolean)this.sync.getValue()).booleanValue(), ((Boolean)this.breakSwing.getValue()).booleanValue());
/* 1084 */             this.manualTimer.reset();
/*      */           } 
/*      */           break;
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void rotateTo(Entity entity) {
/*      */     float[] angle;
/* 1093 */     switch ((Rotate)this.rotate.getValue()) {
/*      */       case OFF:
/* 1095 */         this.rotating = false;
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case BREAK:
/*      */       case ALL:
/* 1102 */         angle = MathUtil.calcAngle(mc.field_71439_g.func_174824_e(mc.func_184121_ak()), entity.func_174791_d());
/* 1103 */         if (((Integer)this.eventMode.getValue()).intValue() == 2 && this.threadMode.getValue() == ThreadMode.NONE) {
/* 1104 */           WebHack.rotationManager.setPlayerRotations(angle[0], angle[1]);
/*      */           break;
/*      */         } 
/* 1107 */         this.yaw = angle[0];
/* 1108 */         this.pitch = angle[1];
/* 1109 */         this.rotating = true;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   private void rotateToPos(BlockPos pos) {
/*      */     float[] angle;
/* 1115 */     switch ((Rotate)this.rotate.getValue()) {
/*      */       case OFF:
/* 1117 */         this.rotating = false;
/*      */         break;
/*      */ 
/*      */ 
/*      */       
/*      */       case PLACE:
/*      */       case ALL:
/* 1124 */         angle = MathUtil.calcAngle(mc.field_71439_g.func_174824_e(mc.func_184121_ak()), new Vec3d((pos.func_177958_n() + 0.5F), (pos.func_177956_o() - 0.5F), (pos.func_177952_p() + 0.5F)));
/* 1125 */         if (((Integer)this.eventMode.getValue()).intValue() == 2 && this.threadMode.getValue() == ThreadMode.NONE) {
/* 1126 */           WebHack.rotationManager.setPlayerRotations(angle[0], angle[1]);
/*      */           break;
/*      */         } 
/* 1129 */         this.yaw = angle[0];
/* 1130 */         this.pitch = angle[1];
/* 1131 */         this.rotating = true;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean isDoublePoppable(EntityPlayer player, float damage) {
/*      */     float health;
/* 1138 */     if (((Boolean)this.doublePop.getValue()).booleanValue() && (health = EntityUtil.getHealth((Entity)player)) <= ((Double)this.popHealth.getValue()).doubleValue() && damage > health + 0.5D && damage <= ((Float)this.popDamage.getValue()).floatValue()) {
/* 1139 */       Timer timer = this.totemPops.get(player);
/* 1140 */       return (timer == null || timer.passedMs(((Integer)this.popTime.getValue()).intValue()));
/*      */     } 
/* 1142 */     return false;
/*      */   }
/*      */   
/*      */   private boolean isValid(Entity entity) {
/* 1146 */     return (entity != null && mc.field_71439_g.func_70068_e(entity) <= MathUtil.square(((Float)this.breakRange.getValue()).floatValue()) && (this.raytrace.getValue() == Raytrace.NONE || this.raytrace.getValue() == Raytrace.PLACE || mc.field_71439_g.func_70685_l(entity) || (!mc.field_71439_g.func_70685_l(entity) && mc.field_71439_g.func_70068_e(entity) <= MathUtil.square(((Float)this.breaktrace.getValue()).floatValue()))));
/*      */   }
/*      */   
/*      */   private boolean isEligableForFeetSync(EntityPlayer player, BlockPos pos) {
/* 1150 */     if (((Boolean)this.holySync.getValue()).booleanValue()) {
/* 1151 */       BlockPos playerPos = new BlockPos(player.func_174791_d()); EnumFacing[] arrayOfEnumFacing; int i; byte b;
/* 1152 */       for (arrayOfEnumFacing = EnumFacing.values(), i = arrayOfEnumFacing.length, b = 0; b < i; ) { EnumFacing facing = arrayOfEnumFacing[b];
/*      */         BlockPos holyPos;
/* 1154 */         if (facing == EnumFacing.DOWN || facing == EnumFacing.UP || !pos.equals(holyPos = playerPos.func_177977_b().func_177972_a(facing))) {
/*      */           b++; continue;
/* 1156 */         }  return true; }
/*      */       
/* 1158 */       return false;
/*      */     } 
/* 1160 */     return true;
/*      */   }
/*      */   
/*      */   public enum PredictTimer {
/* 1164 */     NONE,
/* 1165 */     BREAK,
/* 1166 */     PREDICT;
/*      */   }
/*      */   
/*      */   public enum AntiFriendPop
/*      */   {
/* 1171 */     NONE,
/* 1172 */     PLACE,
/* 1173 */     BREAK,
/* 1174 */     ALL;
/*      */   }
/*      */   
/*      */   public enum ThreadMode
/*      */   {
/* 1179 */     NONE,
/* 1180 */     POOL,
/* 1181 */     SOUND,
/* 1182 */     WHILE;
/*      */   }
/*      */   
/*      */   public enum AutoSwitch
/*      */   {
/* 1187 */     NONE,
/* 1188 */     TOGGLE,
/* 1189 */     ALWAYS;
/*      */   }
/*      */   
/*      */   public enum Raytrace
/*      */   {
/* 1194 */     NONE,
/* 1195 */     PLACE,
/* 1196 */     BREAK,
/* 1197 */     FULL;
/*      */   }
/*      */   
/*      */   public enum Switch
/*      */   {
/* 1202 */     ALWAYS,
/* 1203 */     BREAKSLOT,
/* 1204 */     CALC;
/*      */   }
/*      */   
/*      */   public enum Logic
/*      */   {
/* 1209 */     BREAKPLACE,
/* 1210 */     PLACEBREAK;
/*      */   }
/*      */   
/*      */   public enum Target
/*      */   {
/* 1215 */     CLOSEST,
/* 1216 */     UNSAFE,
/* 1217 */     DAMAGE;
/*      */   }
/*      */   
/*      */   public enum Rotate
/*      */   {
/* 1222 */     OFF,
/* 1223 */     PLACE,
/* 1224 */     BREAK,
/* 1225 */     ALL;
/*      */   }
/*      */   
/*      */   public enum DamageSync
/*      */   {
/* 1230 */     NONE,
/* 1231 */     PLACE,
/* 1232 */     BREAK;
/*      */   }
/*      */   
/*      */   public enum Settings
/*      */   {
/* 1237 */     PLACE,
/* 1238 */     BREAK,
/* 1239 */     RENDER,
/* 1240 */     MISC,
/* 1241 */     DEV;
/*      */   }
/*      */   
/*      */   public static class PlaceInfo
/*      */   {
/*      */     private final BlockPos pos;
/*      */     private final boolean offhand;
/*      */     private final boolean placeSwing;
/*      */     private final boolean exactHand;
/*      */     
/*      */     public PlaceInfo(BlockPos pos, boolean offhand, boolean placeSwing, boolean exactHand) {
/* 1252 */       this.pos = pos;
/* 1253 */       this.offhand = offhand;
/* 1254 */       this.placeSwing = placeSwing;
/* 1255 */       this.exactHand = exactHand;
/*      */     }
/*      */     
/*      */     public void runPlace() {
/* 1259 */       BlockUtil.placeCrystalOnBlock(this.pos, this.offhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.placeSwing, this.exactHand);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class RAutoCrystal
/*      */     implements Runnable
/*      */   {
/*      */     private static RAutoCrystal instance;
/*      */     
/*      */     private AutoCrystal autoCrystal;
/*      */     
/*      */     public static RAutoCrystal getInstance(AutoCrystal autoCrystal) {
/* 1272 */       if (instance == null) {
/* 1273 */         instance = new RAutoCrystal();
/* 1274 */         instance.autoCrystal = autoCrystal;
/*      */       } 
/* 1276 */       return instance;
/*      */     }
/*      */ 
/*      */     
/*      */     public void run() {
/* 1281 */       if (this.autoCrystal.threadMode.getValue() == AutoCrystal.ThreadMode.WHILE) {
/* 1282 */         while (this.autoCrystal.isOn() && this.autoCrystal.threadMode.getValue() == AutoCrystal.ThreadMode.WHILE) {
/* 1283 */           while (WebHack.eventManager.ticksOngoing());
/*      */           
/* 1285 */           if (this.autoCrystal.shouldInterrupt.get()) {
/* 1286 */             this.autoCrystal.shouldInterrupt.set(false);
/* 1287 */             this.autoCrystal.syncroTimer.reset();
/* 1288 */             this.autoCrystal.thread.interrupt();
/*      */             break;
/*      */           } 
/* 1291 */           this.autoCrystal.threadOngoing.set(true);
/* 1292 */           this.autoCrystal.doAutoCrystal();
/* 1293 */           this.autoCrystal.threadOngoing.set(false);
/*      */           try {
/* 1295 */             Thread.sleep(((Integer)this.autoCrystal.threadDelay.getValue()).intValue());
/* 1296 */           } catch (InterruptedException e) {
/* 1297 */             this.autoCrystal.thread.interrupt();
/* 1298 */             e.printStackTrace();
/*      */           } 
/*      */         } 
/* 1301 */       } else if (this.autoCrystal.threadMode.getValue() != AutoCrystal.ThreadMode.NONE && this.autoCrystal.isOn()) {
/* 1302 */         while (WebHack.eventManager.ticksOngoing());
/*      */         
/* 1304 */         this.autoCrystal.threadOngoing.set(true);
/* 1305 */         this.autoCrystal.doAutoCrystal();
/* 1306 */         this.autoCrystal.threadOngoing.set(false);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public class switchTimer {
/* 1312 */     private long time = -1L;
/*      */     
/*      */     public boolean passedS(double s) {
/* 1315 */       return passedMs((long)s * 1000L);
/*      */     }
/*      */     
/*      */     public boolean passedDms(double dms) {
/* 1319 */       return passedMs((long)dms * 10L);
/*      */     }
/*      */     
/*      */     public boolean passedDs(double ds) {
/* 1323 */       return passedMs((long)ds * 100L);
/*      */     }
/*      */     
/*      */     public boolean passedMs(long ms) {
/* 1327 */       return passedNS(convertToNS(ms));
/*      */     }
/*      */     
/*      */     public void setMs(long ms) {
/* 1331 */       this.time = System.nanoTime() - convertToNS(ms);
/*      */     }
/*      */     
/*      */     public boolean passedNS(long ns) {
/* 1335 */       return (System.nanoTime() - this.time >= ns);
/*      */     }
/*      */     
/*      */     public long getPassedTimeMs() {
/* 1339 */       return getMs(System.nanoTime() - this.time);
/*      */     }
/*      */     
/*      */     public switchTimer reset() {
/* 1343 */       this.time = System.nanoTime();
/* 1344 */       return this;
/*      */     }
/*      */     
/*      */     public long getMs(long time) {
/* 1348 */       return time / 1000000L;
/*      */     }
/*      */     
/*      */     public long convertToNS(long time) {
/* 1352 */       return time * 1000000L;
/*      */     }
/*      */   }
/*      */   
/*      */   public Color getCurrentColor() {
/* 1357 */     return new Color(((Integer)this.red.getValue()).intValue(), ((Integer)this.green.getValue()).intValue(), ((Integer)this.blue.getValue()).intValue(), ((Integer)this.alpha.getValue()).intValue());
/*      */   }
/*      */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\AutoCrystal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */