/*    */ package bigname.zprestige.webhack.manager;
/*    */ 
/*    */ import bigname.zprestige.webhack.features.Feature;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.ConcurrentHashMap;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ 
/*    */ public class TotemPopManager
/*    */   extends Feature
/*    */ {
/* 13 */   private Map<EntityPlayer, Integer> poplist = new ConcurrentHashMap<>();
/* 14 */   private Set<EntityPlayer> toAnnounce = new HashSet<>();
/*    */   
/*    */   public void onUpdate() {
/* 17 */     for (EntityPlayer player : this.toAnnounce) {
/* 18 */       if (player == null)
/* 19 */         continue;  int playerNumber = 0;
/* 20 */       for (char character : player.func_70005_c_().toCharArray()) {
/* 21 */         playerNumber += character;
/* 22 */         playerNumber *= 10;
/*    */       } 
/* 24 */       this.toAnnounce.remove(player);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onLogout() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void init() {}
/*    */ 
/*    */   
/*    */   public void onTotemPop(EntityPlayer player) {
/* 38 */     popTotem(player);
/* 39 */     if (!player.equals(mc.field_71439_g)) {
/* 40 */       this.toAnnounce.add(player);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDeath(EntityPlayer player) {
/* 46 */     int playerNumber = 0;
/* 47 */     for (char character : player.func_70005_c_().toCharArray()) {
/* 48 */       playerNumber += character;
/* 49 */       playerNumber *= 10;
/*    */     } 
/* 51 */     this.toAnnounce.remove(player);
/*    */   }
/*    */   
/*    */   public void onLogout(EntityPlayer player, boolean clearOnLogout) {
/* 55 */     if (clearOnLogout) {
/* 56 */       resetPops(player);
/*    */     }
/*    */   }
/*    */   
/*    */   public void onOwnLogout(boolean clearOnLogout) {
/* 61 */     if (clearOnLogout) {
/* 62 */       clearList();
/*    */     }
/*    */   }
/*    */   
/*    */   public void clearList() {
/* 67 */     this.poplist = new ConcurrentHashMap<>();
/*    */   }
/*    */   
/*    */   public void resetPops(EntityPlayer player) {
/* 71 */     setTotemPops(player, 0);
/*    */   }
/*    */   
/*    */   public void popTotem(EntityPlayer player) {
/* 75 */     this.poplist.merge(player, Integer.valueOf(1), Integer::sum);
/*    */   }
/*    */   
/*    */   public void setTotemPops(EntityPlayer player, int amount) {
/* 79 */     this.poplist.put(player, Integer.valueOf(amount));
/*    */   }
/*    */   
/*    */   public int getTotemPops(EntityPlayer player) {
/* 83 */     Integer pops = this.poplist.get(player);
/* 84 */     if (pops == null) {
/* 85 */       return 0;
/*    */     }
/* 87 */     return pops.intValue();
/*    */   }
/*    */   
/*    */   public String getTotemPopString(EntityPlayer player) {
/* 91 */     return "§f" + ((getTotemPops(player) <= 0) ? "" : ("-" + getTotemPops(player) + " "));
/*    */   }
/*    */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\TotemPopManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */