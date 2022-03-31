/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import bigname.zprestige.webhack.features.modules.Render.Viewmodel;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.client.renderer.RenderItem;
/*    */ import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ @Mixin({RenderItem.class})
/*    */ public abstract class MixinItemRenderer
/*    */ {
/*    */   @Inject(method = {"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Z)V"}, at = {@At("INVOKE")})
/*    */   public void renderItem(ItemStack stack, EntityLivingBase entitylivingbaseIn, ItemCameraTransforms.TransformType transform, boolean leftHanded, CallbackInfo ci) {
/* 21 */     if (Viewmodel.getINSTANCE().isEnabled() && (transform == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || transform == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND)) {
/* 22 */       Viewmodel changer = Viewmodel.getINSTANCE();
/* 23 */       GlStateManager.func_179152_a(((Float)(Viewmodel.getINSTANCE()).sizeX.getValue()).floatValue(), ((Float)(Viewmodel.getINSTANCE()).sizeY.getValue()).floatValue(), ((Float)(Viewmodel.getINSTANCE()).sizeZ.getValue()).floatValue());
/* 24 */       if (transform.equals(ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND)) {
/* 25 */         GL11.glTranslated((((Float)changer.offhandX.getValue()).floatValue() / 4.0F), (((Float)changer.offhandY.getValue()).floatValue() / 4.0F), (((Float)changer.offhandZ.getValue()).floatValue() / 4.0F));
/*    */       } else {
/*    */         
/* 28 */         GL11.glTranslated((((Float)changer.offsetX.getValue()).floatValue() / 4.0F), (((Float)changer.offsetY.getValue()).floatValue() / 4.0F), (((Float)changer.offsetZ.getValue()).floatValue() / 4.0F));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinItemRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */