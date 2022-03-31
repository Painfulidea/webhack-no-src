package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.network.Packet;

public class Wrapper {
  public static Wrapper INSTANCE;
  
  public static Minecraft mc;
  
  @Nullable
  public static WorldClient getWorld() {
    if (Perryc.1 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  @Nullable
  public static EntityPlayerSP getPlayer() {
    return Perry1.4Z(null, (int)1053077530L ^ 0x67121C9D);
  }
  
  public void sendPacket(Packet paramPacket) {
    Perry1.4T(this, (int)1572483043L ^ 0x30A791B, paramPacket);
  }
  
  public static FontRenderer getFontRenderer() {
    if (Perryc.1 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public static String getBlock() {
    if (Perryc.0 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  static {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -1127005397
    //   9: l2i
    //   10: ldc_w -129425590
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1897067239
    //   20: l2i
    //   21: ldc_w 519584017
    //   24: ixor
    //   25: ldc2_w -1371410564
    //   28: l2i
    //   29: ldc_w 1952134279
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 260, -1635743846 -> 17, -1242558451 -> 60
    //   60: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   63: getstatic Perryc.1 : I
    //   66: ifeq -> 80
    //   69: ldc2_w 1573393800
    //   72: l2i
    //   73: ldc_w -1325790169
    //   76: ixor
    //   77: goto -> 88
    //   80: ldc2_w 257980357
    //   83: l2i
    //   84: ldc_w -103618395
    //   87: ixor
    //   88: ldc2_w 789795397
    //   91: l2i
    //   92: ldc_w -516555536
    //   95: ixor
    //   96: ixor
    //   97: lookupswitch default -> 262, 588560154 -> 80, 949236181 -> 124
    //   124: putstatic bigname/zprestige/webhack/util/Wrapper.mc : Lnet/minecraft/client/Minecraft;
    //   127: new bigname/zprestige/webhack/util/Wrapper
    //   130: dup
    //   131: getstatic Perryc.c : I
    //   134: iflt -> 148
    //   137: ldc2_w 1338483309
    //   140: l2i
    //   141: ldc_w -1302031688
    //   144: ixor
    //   145: goto -> 156
    //   148: ldc2_w -375001593
    //   151: l2i
    //   152: ldc_w 1173816033
    //   155: ixor
    //   156: ldc2_w -1544920555
    //   159: l2i
    //   160: ldc_w 2002711346
    //   163: ixor
    //   164: ixor
    //   165: lookupswitch default -> 264, 689414642 -> 148, 2028371393 -> 192
    //   192: invokespecial <init> : ()V
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -1992048546
    //   204: l2i
    //   205: ldc_w 1962060443
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 2049380330
    //   215: l2i
    //   216: ldc_w 1194687553
    //   219: ixor
    //   220: ldc2_w -60839410
    //   223: l2i
    //   224: ldc_w 737071397
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -483698440 -> 212, 704647662 -> 266
    //   256: putstatic bigname/zprestige/webhack/util/Wrapper.INSTANCE : Lbigname/zprestige/webhack/util/Wrapper;
    //   259: return
    //   260: aconst_null
    //   261: athrow
    //   262: aconst_null
    //   263: athrow
    //   264: aconst_null
    //   265: athrow
    //   266: aconst_null
    //   267: athrow
  }
  
  public Wrapper() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 854171339
    //   9: l2i
    //   10: ldc_w 314614823
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -491079664
    //   20: l2i
    //   21: ldc_w 1170789778
    //   24: ixor
    //   25: ldc2_w -1373469587
    //   28: l2i
    //   29: ldc_w -1971395097
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 74799974 -> 126, 589314921 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 1690955948
    //   70: l2i
    //   71: ldc_w 1449976141
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 983778525
    //   81: l2i
    //   82: ldc_w -1710047235
    //   85: ixor
    //   86: ldc2_w 708397756
    //   89: l2i
    //   90: ldc_w 119255169
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 529001436 -> 124, 1002521016 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/Wrapper;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\Wrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */