/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.BlockLiquid;
/*    */ import net.minecraft.block.material.Material;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ 
/*    */ @Mixin({BlockLiquid.class})
/*    */ public class MixinBlockLiquid
/*    */   extends Block {
/*    */   protected MixinBlockLiquid(Material materialIn) {
/* 12 */     super(materialIn);
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinBlockLiquid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */