/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import bigname.zprestige.webhack.event.events.MoveEvent;
/*    */ import bigname.zprestige.webhack.event.events.PushEvent;
/*    */ import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.entity.AbstractClientPlayer;
/*    */ import net.minecraft.client.entity.EntityPlayerSP;
/*    */ import net.minecraft.client.network.NetHandlerPlayClient;
/*    */ import net.minecraft.entity.MoverType;
/*    */ import net.minecraft.stats.RecipeBook;
/*    */ import net.minecraft.stats.StatisticsManager;
/*    */ import net.minecraft.util.math.AxisAlignedBB;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.eventhandler.Event;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin(value = {EntityPlayerSP.class}, priority = 9998)
/*    */ public abstract class MixinEntityPlayerSP
/*    */   extends AbstractClientPlayer {
/*    */   public MixinEntityPlayerSP(Minecraft p_i47378_1_, World p_i47378_2_, NetHandlerPlayClient p_i47378_3_, StatisticsManager p_i47378_4_, RecipeBook p_i47378_5_) {
/* 28 */     super(p_i47378_2_, p_i47378_3_.func_175105_e());
/*    */   }
/*    */   
/*    */   @Inject(method = {"onUpdateWalkingPlayer"}, at = {@At("HEAD")})
/*    */   private void preMotion(CallbackInfo info) {
/* 33 */     UpdateWalkingPlayerEvent event = new UpdateWalkingPlayerEvent(0);
/* 34 */     MinecraftForge.EVENT_BUS.post((Event)event);
/*    */   }
/*    */   
/*    */   @Inject(method = {"onUpdateWalkingPlayer"}, at = {@At("RETURN")})
/*    */   private void postMotion(CallbackInfo info) {
/* 39 */     UpdateWalkingPlayerEvent event = new UpdateWalkingPlayerEvent(1);
/* 40 */     MinecraftForge.EVENT_BUS.post((Event)event);
/*    */   }
/*    */   @Redirect(method = {"onLivingUpdate"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;setSprinting(Z)V", ordinal = 2))
/*    */   public void onLivingUpdate(EntityPlayerSP entityPlayerSP, boolean sprinting) {
/* 44 */     entityPlayerSP.func_70031_b(sprinting);
/*    */   }
/*    */   
/*    */   @Inject(method = {"pushOutOfBlocks"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void pushOutOfBlocksHook(double x, double y, double z, CallbackInfoReturnable<Boolean> info) {
/* 49 */     PushEvent event = new PushEvent(1);
/* 50 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 51 */     if (event.isCanceled()) {
/* 52 */       info.setReturnValue(Boolean.valueOf(false));
/*    */     }
/*    */   }
/*    */   
/*    */   @Redirect(method = {"onUpdateWalkingPlayer"}, at = @At(value = "FIELD", target = "net/minecraft/util/math/AxisAlignedBB.minY:D"))
/*    */   private double minYHook(AxisAlignedBB bb) {
/* 58 */     return bb.field_72338_b;
/*    */   }
/*    */   
/*    */   @Redirect(method = {"move"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;move(Lnet/minecraft/entity/MoverType;DDD)V"))
/*    */   public void move(AbstractClientPlayer player, MoverType moverType, double x, double y, double z) {
/* 63 */     MoveEvent event = new MoveEvent(0, moverType, x, y, z);
/* 64 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 65 */     if (!event.isCanceled())
/* 66 */       func_70091_d(event.getType(), event.getX(), event.getY(), event.getZ()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinEntityPlayerSP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */