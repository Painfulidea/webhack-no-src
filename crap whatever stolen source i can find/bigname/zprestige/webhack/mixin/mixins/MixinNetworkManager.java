/*    */ package bigname.zprestige.webhack.mixin.mixins;
/*    */ import bigname.zprestige.webhack.event.events.PacketEvent;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import net.minecraft.network.NetworkManager;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.common.eventhandler.Event;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({NetworkManager.class})
/*    */ public class MixinNetworkManager {
/*    */   @Inject(method = {"sendPacket(Lnet/minecraft/network/Packet;)V"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void onSendPacketPre(Packet<?> packet, CallbackInfo info) {
/* 17 */     PacketEvent.Send event = new PacketEvent.Send(0, packet);
/* 18 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 19 */     if (event.isCanceled()) {
/* 20 */       info.cancel();
/*    */     }
/*    */   }
/*    */   
/*    */   @Inject(method = {"channelRead0"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void onChannelReadPre(ChannelHandlerContext context, Packet<?> packet, CallbackInfo info) {
/* 26 */     PacketEvent.Receive event = new PacketEvent.Receive(0, packet);
/* 27 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 28 */     if (event.isCanceled())
/* 29 */       info.cancel(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinNetworkManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */