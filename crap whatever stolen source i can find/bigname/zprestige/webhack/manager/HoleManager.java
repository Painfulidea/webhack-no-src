package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import java.util.List;
import net.minecraft.util.math.BlockPos;

public class HoleManager extends Feature {
  public List<BlockPos> midSafety;
  
  public List<BlockPos> holes;
  
  public static BlockPos[] surroundOffset;
  
  public void update() {
    Perry1.3G(this, (int)-1904306108L ^ 0x9BB7644E);
  }
  
  public List getSortedHoles() {
    if (Perryc.c < 0) {
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
  
  public static double lambda$getSortedHoles$0(BlockPos hole) {
    if (Perryc.c < 0) {
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
    //   0: ldc2_w -1985909662
    //   3: l2i
    //   4: ldc -1985909662
    //   6: ixor
    //   7: ldc2_w 1083975927
    //   10: l2i
    //   11: ldc 1083975926
    //   13: ixor
    //   14: getstatic Perryc.1 : I
    //   17: ifeq -> 30
    //   20: ldc2_w -1528308033
    //   23: l2i
    //   24: ldc -607035860
    //   26: ixor
    //   27: goto -> 37
    //   30: ldc2_w -329327659
    //   33: l2i
    //   34: ldc -1714044685
    //   36: ixor
    //   37: ldc2_w 741074497
    //   40: l2i
    //   41: ldc 1639117344
    //   43: ixor
    //   44: ixor
    //   45: lookupswitch default -> 198, 850367730 -> 30, 940707655 -> 72
    //   72: invokestatic getOffsets : (IZ)[Lnet/minecraft/util/math/Vec3d;
    //   75: getstatic Perryc.1 : I
    //   78: ifeq -> 91
    //   81: ldc2_w 2131451441
    //   84: l2i
    //   85: ldc 1294435723
    //   87: ixor
    //   88: goto -> 98
    //   91: ldc2_w -964336343
    //   94: l2i
    //   95: ldc 1331772636
    //   97: ixor
    //   98: ldc2_w 1435444189
    //   101: l2i
    //   102: ldc -1811003454
    //   104: ixor
    //   105: ixor
    //   106: lookupswitch default -> 132, -735130121 -> 91, -206717019 -> 196
    //   132: invokestatic toBlockPos : ([Lnet/minecraft/util/math/Vec3d;)[Lnet/minecraft/util/math/BlockPos;
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w 1993719953
    //   144: l2i
    //   145: ldc 684620500
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 1626586122
    //   154: l2i
    //   155: ldc 589801963
    //   157: ixor
    //   158: ldc2_w 18787685
    //   161: l2i
    //   162: ldc -910569022
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -1766013214 -> 200, -753394874 -> 151
    //   192: putstatic bigname/zprestige/webhack/manager/HoleManager.surroundOffset : [Lnet/minecraft/util/math/BlockPos;
    //   195: return
    //   196: aconst_null
    //   197: athrow
    //   198: aconst_null
    //   199: athrow
    //   200: aconst_null
    //   201: athrow
  }
  
  public List calcHoles() {
    if (Perryc.c < 0) {
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
  
  public List getMidSafety() {
    return Perry1.58(this, (int)174475428L ^ 0x723B9D2E);
  }
  
  public List getHoles() {
    return Perry1.54(this, (int)326968126L ^ 0x22EA6614);
  }
  
  public boolean isSafe(BlockPos paramBlockPos) {
    return Perry1.6m(this, (int)1145470319L ^ 0x7B1D854A, paramBlockPos);
  }
  
  public HoleManager() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 1811486087
    //   9: l2i
    //   10: ldc_w -1326683148
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -39670427
    //   20: l2i
    //   21: ldc_w 1105368795
    //   24: ixor
    //   25: ldc2_w -563659773
    //   28: l2i
    //   29: ldc_w 265050830
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 180230334 -> 520, 2060696472 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 1482649574
    //   70: l2i
    //   71: ldc_w 1482258440
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -2004468780
    //   81: l2i
    //   82: ldc_w -173197522
    //   85: ixor
    //   86: ldc2_w -1886690337
    //   89: l2i
    //   90: ldc_w -738014337
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 510, 648193114 -> 120, 1536147278 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -652466323
    //   132: l2i
    //   133: ldc_w -625634223
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1430797576
    //   143: l2i
    //   144: ldc_w 2113257663
    //   147: ixor
    //   148: ldc2_w 1872638220
    //   151: l2i
    //   152: ldc_w -1070505364
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -1579990140 -> 140, -1408835492 -> 518
    //   184: aload_0
    //   185: new java/util/ArrayList
    //   188: dup
    //   189: getstatic Perryc.1 : I
    //   192: ifeq -> 206
    //   195: ldc2_w 738647122
    //   198: l2i
    //   199: ldc_w -1653025409
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w 993481053
    //   209: l2i
    //   210: ldc_w -854662303
    //   213: ixor
    //   214: ldc2_w -220924818
    //   217: l2i
    //   218: ldc_w -1565376034
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 516, -1503721588 -> 248, -518472547 -> 206
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 268
    //   257: ldc2_w -900221571
    //   260: l2i
    //   261: ldc_w 1533616796
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w -1619803454
    //   271: l2i
    //   272: ldc_w 1953622918
    //   275: ixor
    //   276: ldc2_w 1914633064
    //   279: l2i
    //   280: ldc_w -1421448580
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 508, 844806224 -> 312, 1214646005 -> 268
    //   312: putfield midSafety : Ljava/util/List;
    //   315: getstatic Perryc.1 : I
    //   318: ifeq -> 332
    //   321: ldc2_w 734749062
    //   324: l2i
    //   325: ldc_w 441925756
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w -311239842
    //   335: l2i
    //   336: ldc_w -1607907220
    //   339: ixor
    //   340: ldc2_w -1410653659
    //   343: l2i
    //   344: ldc_w 249902055
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 376, -1802358728 -> 512, -725486538 -> 332
    //   376: aload_0
    //   377: new java/util/ArrayList
    //   380: dup
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 398
    //   387: ldc2_w -1466967091
    //   390: l2i
    //   391: ldc_w -744772856
    //   394: ixor
    //   395: goto -> 406
    //   398: ldc2_w 638095913
    //   401: l2i
    //   402: ldc_w -546048040
    //   405: ixor
    //   406: ldc2_w -305130528
    //   409: l2i
    //   410: ldc_w 694456237
    //   413: ixor
    //   414: ixor
    //   415: lookupswitch default -> 440, -1287025706 -> 398, -1079972728 -> 514
    //   440: invokespecial <init> : ()V
    //   443: getstatic Perryc.0 : I
    //   446: ifle -> 460
    //   449: ldc2_w 705569829
    //   452: l2i
    //   453: ldc_w 1260805229
    //   456: ixor
    //   457: goto -> 468
    //   460: ldc2_w -1261840430
    //   463: l2i
    //   464: ldc_w 217221825
    //   467: ixor
    //   468: ldc2_w -2128972641
    //   471: l2i
    //   472: ldc_w -183811741
    //   475: ixor
    //   476: ixor
    //   477: lookupswitch default -> 504, 356076980 -> 522, 1658282018 -> 460
    //   504: putfield holes : Ljava/util/List;
    //   507: return
    //   508: aconst_null
    //   509: athrow
    //   510: aconst_null
    //   511: athrow
    //   512: aconst_null
    //   513: athrow
    //   514: aconst_null
    //   515: athrow
    //   516: aconst_null
    //   517: athrow
    //   518: aconst_null
    //   519: athrow
    //   520: aconst_null
    //   521: athrow
    //   522: aconst_null
    //   523: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	508	0	this	Lbigname/zprestige/webhack/manager/HoleManager;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\HoleManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */