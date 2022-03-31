/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ import bigname.zprestige.webhack.WebHack;
/*    */ import bigname.zprestige.webhack.event.events.KeyEvent;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.crash.CrashReport;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.eventhandler.Event;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({Minecraft.class})
/*    */ public abstract class MixinMinecraft {
/*    */   @Inject(method = {"shutdownMinecraftApplet"}, at = {@At("HEAD")})
/*    */   private void stopClient(CallbackInfo callbackInfo) {
/* 19 */     unload();
/*    */   }
/*    */   
/*    */   @Redirect(method = {"run"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;displayCrashReport(Lnet/minecraft/crash/CrashReport;)V"))
/*    */   public void displayCrashReport(Minecraft minecraft, CrashReport crashReport) {
/* 24 */     unload();
/*    */   }
/*    */ 
/*    */   
/*    */   @Inject(method = {"runTickKeyboard"}, at = {@At(value = "INVOKE", remap = false, target = "Lorg/lwjgl/input/Keyboard;getEventKey()I", ordinal = 0, shift = At.Shift.BEFORE)})
/*    */   private void onKeyboard(CallbackInfo callbackInfo) {
/* 30 */     int i = (Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + 256) : Keyboard.getEventKey(), n = i;
/* 31 */     if (Keyboard.getEventKeyState()) {
/* 32 */       KeyEvent event = new KeyEvent(i);
/* 33 */       MinecraftForge.EVENT_BUS.post((Event)event);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void unload() {
/* 38 */     WebHack.LOGGER.info("Initiated client shutdown.");
/* 39 */     WebHack.onUnload();
/* 40 */     WebHack.LOGGER.info("Finished client shutdown.");
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinMinecraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */