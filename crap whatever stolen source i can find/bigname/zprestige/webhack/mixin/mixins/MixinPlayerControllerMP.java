/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import bigname.zprestige.webhack.event.events.BlockEvent;
/*    */ import bigname.zprestige.webhack.event.events.ProcessRightClickBlockEvent;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.entity.EntityPlayerSP;
/*    */ import net.minecraft.client.multiplayer.PlayerControllerMP;
/*    */ import net.minecraft.client.multiplayer.WorldClient;
/*    */ import net.minecraft.util.EnumActionResult;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.util.math.Vec3d;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.eventhandler.Event;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({PlayerControllerMP.class})
/*    */ public class MixinPlayerControllerMP {
/*    */   @Inject(method = {"clickBlock"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void clickBlockHook(BlockPos pos, EnumFacing face, CallbackInfoReturnable<Boolean> info) {
/* 25 */     BlockEvent event = new BlockEvent(3, pos, face);
/* 26 */     MinecraftForge.EVENT_BUS.post((Event)event);
/*    */   }
/*    */   
/*    */   @Inject(method = {"onPlayerDamageBlock"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void onPlayerDamageBlockHook(BlockPos pos, EnumFacing face, CallbackInfoReturnable<Boolean> info) {
/* 31 */     BlockEvent event = new BlockEvent(4, pos, face);
/* 32 */     MinecraftForge.EVENT_BUS.post((Event)event);
/*    */   }
/*    */   
/*    */   @Inject(method = {"processRightClickBlock"}, at = {@At("HEAD")}, cancellable = true)
/*    */   public void processRightClickBlock(EntityPlayerSP player, WorldClient worldIn, BlockPos pos, EnumFacing direction, Vec3d vec, EnumHand hand, CallbackInfoReturnable<EnumActionResult> cir) {
/* 37 */     ProcessRightClickBlockEvent event = new ProcessRightClickBlockEvent(pos, hand, Minecraft.field_71432_P.field_71439_g.func_184586_b(hand));
/* 38 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 39 */     if (event.isCanceled())
/* 40 */       cir.cancel(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinPlayerControllerMP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */