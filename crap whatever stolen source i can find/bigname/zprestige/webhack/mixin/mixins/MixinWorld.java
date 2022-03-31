/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ 
/*    */ import bigname.zprestige.webhack.event.events.PushEvent;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.eventhandler.Event;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Redirect;
/*    */ 
/*    */ @Mixin({World.class})
/*    */ public class MixinWorld {
/*    */   @Redirect(method = {"handleMaterialAcceleration"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isPushedByWater()Z"))
/*    */   public boolean isPushedbyWaterHook(Entity entity) {
/* 16 */     PushEvent event = new PushEvent(2, entity);
/* 17 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 18 */     return (entity.func_96092_aw() && !event.isCanceled());
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinWorld.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */