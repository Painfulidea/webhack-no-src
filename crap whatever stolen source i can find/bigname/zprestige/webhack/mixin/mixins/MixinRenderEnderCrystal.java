/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import bigname.zprestige.webhack.features.modules.Render.CrystalModifier;
/*    */ import bigname.zprestige.webhack.util.ColorUtil;
/*    */ import java.awt.Color;
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.client.renderer.entity.RenderEnderCrystal;
/*    */ import net.minecraft.entity.Entity;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({RenderEnderCrystal.class})
/*    */ public class MixinRenderEnderCrystal
/*    */ {
/*    */   @Redirect(method = {"doRender"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBase;render(Lnet/minecraft/entity/Entity;FFFFFF)V"))
/*    */   public void renderModelBaseHook(ModelBase model, Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
/* 22 */     CrystalModifier crystalScale = CrystalModifier.INSTANCE;
/* 23 */     if (crystalScale.isEnabled() && (((Boolean)crystalScale.crystalWireframe.getValue()).booleanValue() || ((Boolean)crystalScale.crystalChams.getValue()).booleanValue())) {
/* 24 */       GlStateManager.func_179152_a(((Float)crystalScale.scale.getValue()).floatValue(), ((Float)crystalScale.scale.getValue()).floatValue(), ((Float)crystalScale.scale.getValue()).floatValue());
/* 25 */       if (((Boolean)crystalScale.crystalWireframe.getValue()).booleanValue()) {
/* 26 */         crystalScale.onRenderModel(model, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
/*    */       }
/* 28 */       if (((Boolean)crystalScale.crystalChams.getValue()).booleanValue()) {
/* 29 */         GL11.glPushAttrib(1048575);
/* 30 */         GL11.glDisable(3008);
/* 31 */         GL11.glDisable(3553);
/* 32 */         GL11.glDisable(2896);
/* 33 */         GL11.glEnable(3042);
/* 34 */         GL11.glBlendFunc(770, 771);
/* 35 */         GL11.glLineWidth(1.5F);
/* 36 */         GL11.glEnable(2960);
/* 37 */         Color color = ((Boolean)crystalScale.rainbow.getValue()).booleanValue() ? new Color(ColorUtil.getRainbow(((Integer)crystalScale.speed.getValue()).intValue() * 100, 0, ((Integer)crystalScale.saturation.getValue()).intValue() / 100.0F)) : new Color(((Integer)crystalScale.red.getValue()).intValue(), ((Integer)crystalScale.green.getValue()).intValue(), ((Integer)crystalScale.blue.getValue()).intValue());
/* 38 */         GL11.glEnable(10754);
/* 39 */         GL11.glColor4f(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, ((Integer)crystalScale.crystalAlpha.getValue()).intValue() / 255.0F);
/* 40 */         model.func_78088_a(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
/* 41 */         GL11.glEnable(3042);
/* 42 */         GL11.glEnable(2896);
/* 43 */         GL11.glEnable(3553);
/* 44 */         GL11.glEnable(3008);
/* 45 */         GL11.glPopAttrib();
/*    */       } 
/*    */     } else {
/*    */       
/* 49 */       model.func_78088_a(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
/*    */     } 
/* 51 */     if (crystalScale.isEnabled()) {
/* 52 */       GlStateManager.func_179152_a(1.0F / ((Float)crystalScale.scale.getValue()).floatValue(), 1.0F / ((Float)crystalScale.scale.getValue()).floatValue(), 1.0F / ((Float)crystalScale.scale.getValue()).floatValue());
/*    */     }
/*    */   }
/*    */   
/*    */   public Color getColor(Entity entity, int red, int green, int blue, int alpha, boolean colorFriends) {
/* 57 */     Color color = new Color(red / 255.0F, green / 255.0F, blue / 255.0F, alpha / 255.0F);
/* 58 */     return color;
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinRenderEnderCrystal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */