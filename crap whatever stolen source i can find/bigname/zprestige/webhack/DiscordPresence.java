package bigname.zprestige.webhack;

import Perry1;
import Perryc;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

public class DiscordPresence {
  public static int index;
  
  public static DiscordRichPresence presence;
  
  public static DiscordRPC rpc;
  
  public static Thread thread;
  
  public DiscordPresence() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 117508174
    //   9: l2i
    //   10: ldc 1770772216
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -265481387
    //   19: l2i
    //   20: ldc -1569014826
    //   22: ixor
    //   23: ldc2_w -887605338
    //   26: l2i
    //   27: ldc 1013853628
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1711487828 -> 120, -223280371 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -943963748
    //   66: l2i
    //   67: ldc 29538376
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 911072306
    //   76: l2i
    //   77: ldc 855819739
    //   79: ixor
    //   80: ldc2_w 1261183005
    //   83: l2i
    //   84: ldc -808672082
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -2119197350 -> 116, 1117683047 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/DiscordPresence;
  }
  
  public static void lambda$start$0() {
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
  
  public static void start() {
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
  
  static {
    // Byte code:
    //   0: ldc2_w -1492986492
    //   3: l2i
    //   4: ldc_w -1492986491
    //   7: ixor
    //   8: getstatic Perryc.0 : I
    //   11: ifle -> 25
    //   14: ldc2_w -1826721743
    //   17: l2i
    //   18: ldc_w 249623440
    //   21: ixor
    //   22: goto -> 33
    //   25: ldc2_w -1698142304
    //   28: l2i
    //   29: ldc_w -389650056
    //   32: ixor
    //   33: ldc2_w 1314964807
    //   36: l2i
    //   37: ldc_w -982923465
    //   40: ixor
    //   41: ixor
    //   42: lookupswitch default -> 68, 385319377 -> 338, 667742206 -> 25
    //   68: putstatic bigname/zprestige/webhack/DiscordPresence.index : I
    //   71: getstatic Perryc.c : I
    //   74: iflt -> 88
    //   77: ldc2_w -1807706583
    //   80: l2i
    //   81: ldc_w -1560013181
    //   84: ixor
    //   85: goto -> 96
    //   88: ldc2_w 997922017
    //   91: l2i
    //   92: ldc_w 1471578503
    //   95: ixor
    //   96: ldc2_w -590682815
    //   99: l2i
    //   100: ldc_w 681456099
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 340, -1734786620 -> 132, -1022340088 -> 88
    //   132: getstatic club/minnced/discord/rpc/DiscordRPC.INSTANCE : Lclub/minnced/discord/rpc/DiscordRPC;
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 152
    //   141: ldc2_w 2114697952
    //   144: l2i
    //   145: ldc_w 1360403067
    //   148: ixor
    //   149: goto -> 160
    //   152: ldc2_w -1854704005
    //   155: l2i
    //   156: ldc_w 359718475
    //   159: ixor
    //   160: ldc2_w 752414590
    //   163: l2i
    //   164: ldc_w -1716993709
    //   167: ixor
    //   168: ixor
    //   169: lookupswitch default -> 196, -1704096074 -> 336, 333102377 -> 152
    //   196: putstatic bigname/zprestige/webhack/DiscordPresence.rpc : Lclub/minnced/discord/rpc/DiscordRPC;
    //   199: new club/minnced/discord/rpc/DiscordRichPresence
    //   202: dup
    //   203: getstatic Perryc.1 : I
    //   206: ifeq -> 220
    //   209: ldc2_w 632457825
    //   212: l2i
    //   213: ldc_w -1668407589
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 2137069613
    //   223: l2i
    //   224: ldc_w 1195254549
    //   227: ixor
    //   228: ldc2_w -646421931
    //   231: l2i
    //   232: ldc_w 2051603643
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 264, 436996692 -> 332, 934848111 -> 220
    //   264: invokespecial <init> : ()V
    //   267: getstatic Perryc.c : I
    //   270: iflt -> 284
    //   273: ldc2_w -454577934
    //   276: l2i
    //   277: ldc_w 1770854296
    //   280: ixor
    //   281: goto -> 292
    //   284: ldc2_w 1613222033
    //   287: l2i
    //   288: ldc_w 1361719793
    //   291: ixor
    //   292: ldc2_w 833967049
    //   295: l2i
    //   296: ldc_w 1508186001
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 334, -449125582 -> 284, 1499309368 -> 328
    //   328: putstatic bigname/zprestige/webhack/DiscordPresence.presence : Lclub/minnced/discord/rpc/DiscordRichPresence;
    //   331: return
    //   332: aconst_null
    //   333: athrow
    //   334: aconst_null
    //   335: athrow
    //   336: aconst_null
    //   337: athrow
    //   338: aconst_null
    //   339: athrow
    //   340: aconst_null
    //   341: athrow
  }
  
  public static void stop() {
    Perry1.3S(null, (int)-1437300191L ^ 0x817EF0D9);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\DiscordPresence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */