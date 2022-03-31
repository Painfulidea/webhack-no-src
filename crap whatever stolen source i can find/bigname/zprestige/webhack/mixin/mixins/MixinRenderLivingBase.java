/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.renderer.entity.Render;
/*    */ import net.minecraft.client.renderer.entity.RenderLivingBase;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ 
/*    */ @Mixin({RenderLivingBase.class})
/*    */ public abstract class MixinRenderLivingBase<T extends EntityLivingBase> extends Render<T> {
/*    */   @Shadow
/* 16 */   private static final Logger field_147923_a = LogManager.getLogger();
/*    */   
/*    */   @Shadow
/*    */   protected ModelBase field_77045_g;
/*    */   
/*    */   @Shadow
/*    */   protected boolean field_188323_j;
/*    */   
/*    */   float red;
/*    */   float green;
/*    */   float blue;
/*    */   
/*    */   protected MixinRenderLivingBase(RenderManager renderManager) {
/* 29 */     super(renderManager);
/* 30 */     this.red = 0.0F;
/* 31 */     this.green = 0.0F;
/* 32 */     this.blue = 0.0F;
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   protected abstract boolean func_193115_c(EntityLivingBase paramEntityLivingBase);
/*    */   
/*    */   @Shadow
/*    */   protected abstract float func_77040_d(T paramT, float paramFloat);
/*    */   
/*    */   @Shadow
/*    */   protected abstract float func_77034_a(float paramFloat1, float paramFloat2, float paramFloat3);
/*    */   
/*    */   @Shadow
/*    */   protected abstract float func_77044_a(T paramT, float paramFloat);
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_77043_a(T paramT, float paramFloat1, float paramFloat2, float paramFloat3);
/*    */   
/*    */   @Shadow
/*    */   public abstract float func_188322_c(T paramT, float paramFloat);
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_180565_e();
/*    */   
/*    */   @Shadow
/*    */   protected abstract boolean func_177088_c(T paramT);
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_77039_a(T paramT, double paramDouble1, double paramDouble2, double paramDouble3);
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_177091_f();
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_77036_a(T paramT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6);
/*    */   
/*    */   @Shadow
/*    */   protected abstract void func_177093_a(T paramT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7);
/*    */   
/*    */   @Shadow
/*    */   protected abstract boolean func_177090_c(T paramT, float paramFloat);
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinRenderLivingBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */