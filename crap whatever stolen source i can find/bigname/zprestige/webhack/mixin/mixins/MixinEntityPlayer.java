/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ 
/*    */ @Mixin({EntityPlayer.class})
/*    */ public abstract class MixinEntityPlayer
/*    */   extends EntityLivingBase {
/*    */   public MixinEntityPlayer(World worldIn, GameProfile gameProfileIn) {
/* 13 */     super(worldIn);
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinEntityPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */