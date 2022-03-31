/*    */ package com.krazzzzymonkey.catalyst.module.modules.player;
/*    */ 
/*    */ import bigname.zprestige.webhack.event.events.PacketEvent;
/*    */ import bigname.zprestige.webhack.features.modules.Module;
/*    */ import bigname.zprestige.webhack.features.setting.Setting;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.server.SPacketEntityVelocity;
/*    */ import net.minecraft.network.play.server.SPacketExplosion;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.gameevent.TickEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Velocity
/*    */   extends Module
/*    */ {
/*    */   private final Setting<Boolean> explosions;
/*    */   private static Setting<Boolean> push;
/*    */   
/*    */   public Velocity() {
/* 24 */     super("Velocity", "Cancels various knockback packets", Module.Category.MOVEMENT, true, false, false);
/* 25 */     this.explosions = register(new Setting("Explosions", Boolean.valueOf(true)));
/* 26 */     this; push = register(new Setting("Push", Boolean.valueOf(true)));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onClientTick(TickEvent.ClientTickEvent event) {
/* 31 */     if ((Minecraft.func_71410_x()).field_71441_e == null || (Minecraft.func_71410_x()).field_71439_g == null || (Minecraft.func_71410_x()).field_71439_g.func_110124_au() == null) {
/*    */       return;
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onPacket(PacketEvent event) {
/* 38 */     Packet packet = event.getPacket();
/* 39 */     if (packet instanceof SPacketEntityVelocity) { this; if (((Boolean)push.getValue()).booleanValue()) {
/* 40 */         SPacketEntityVelocity p = (SPacketEntityVelocity)packet;
/* 41 */         if (p.func_149412_c() == (Minecraft.func_71410_x()).field_71439_g.func_145782_y())
/* 42 */           event.setCanceled(true); 
/*    */       }  }
/*    */     
/* 45 */     if (packet instanceof SPacketExplosion && ((Boolean)this.explosions.getValue()).booleanValue()) {
/* 46 */       SPacketExplosion p2 = (SPacketExplosion)packet;
/* 47 */       p2.field_149152_f = 0.0F;
/* 48 */       p2.field_149153_g = 0.0F;
/* 49 */       p2.field_149159_h = 0.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\com\krazzzzymonkey\catalyst\module\modules\player\Velocity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */