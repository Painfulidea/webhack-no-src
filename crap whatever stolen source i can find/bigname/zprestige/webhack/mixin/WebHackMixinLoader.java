/*    */ package bigname.zprestige.webhack.mixin;
/*    */ 
/*    */ import bigname.zprestige.webhack.WebHack;
/*    */ import java.util.Map;
/*    */ import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
/*    */ import org.spongepowered.asm.launch.MixinBootstrap;
/*    */ import org.spongepowered.asm.mixin.MixinEnvironment;
/*    */ import org.spongepowered.asm.mixin.Mixins;
/*    */ 
/*    */ public class WebHackMixinLoader
/*    */   implements IFMLLoadingPlugin
/*    */ {
/*    */   private static boolean isObfuscatedEnvironment = false;
/*    */   
/*    */   public WebHackMixinLoader() {
/* 16 */     WebHack.LOGGER.info("\n\nLoading mixins by zPrestige_");
/* 17 */     MixinBootstrap.init();
/* 18 */     Mixins.addConfiguration("mixins.webhack.json");
/* 19 */     MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
/* 20 */     WebHack.LOGGER.info(MixinEnvironment.getDefaultEnvironment().getObfuscationContext());
/*    */   }
/*    */   
/*    */   public String[] getASMTransformerClass() {
/* 24 */     return new String[0];
/*    */   }
/*    */   
/*    */   public String getModContainerClass() {
/* 28 */     return null;
/*    */   }
/*    */   
/*    */   public String getSetupClass() {
/* 32 */     return null;
/*    */   }
/*    */   
/*    */   public void injectData(Map<String, Object> data) {
/* 36 */     isObfuscatedEnvironment = ((Boolean)data.get("runtimeDeobfuscationEnabled")).booleanValue();
/*    */   }
/*    */   
/*    */   public String getAccessTransformerClass() {
/* 40 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\WebHackMixinLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */