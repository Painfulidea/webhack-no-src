package bigname.zprestige.webhack.util;

import Perry1;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;

public class MotionUtil {
  public static Minecraft mc = Minecraft.func_71410_x();
  
  public static double getSpeed(EntityLivingBase entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 619
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 611
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 603
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 2026963214
    //   33: l2i
    //   34: ldc -799715537
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1511734122
    //   43: l2i
    //   44: ldc -2022046753
    //   46: ixor
    //   47: ldc2_w -1691936938
    //   50: l2i
    //   51: ldc -617252479
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 590, -1653385630 -> 80, -392814346 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 1574644555
    //   90: l2i
    //   91: ldc -1979777174
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -615468460
    //   100: l2i
    //   101: ldc -1236711528
    //   103: ixor
    //   104: ldc2_w -1260698419
    //   107: l2i
    //   108: ldc 1248325005
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, 714702177 -> 576, 970631405 -> 97
    //   140: getfield field_70159_w : D
    //   143: getstatic Perryc.0 : I
    //   146: ifle -> 159
    //   149: ldc2_w -1637093850
    //   152: l2i
    //   153: ldc 1544864392
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1126483930
    //   162: l2i
    //   163: ldc 419902840
    //   165: ixor
    //   166: ldc2_w -1580845473
    //   169: l2i
    //   170: ldc 1638347029
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 586, 35531748 -> 159, 1706887700 -> 200
    //   200: aload_0
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -1577706782
    //   210: l2i
    //   211: ldc -127232816
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1463887305
    //   220: l2i
    //   221: ldc 175038801
    //   223: ixor
    //   224: ldc2_w -280163064
    //   227: l2i
    //   228: ldc 842952023
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -2064650643 -> 588, 1218037993 -> 217
    //   260: getfield field_70159_w : D
    //   263: dmul
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w -324423897
    //   273: l2i
    //   274: ldc 764582011
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 689653408
    //   283: l2i
    //   284: ldc -1320025008
    //   286: ixor
    //   287: ldc2_w -1840917877
    //   290: l2i
    //   291: ldc -987884511
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1772031498 -> 580, -650170179 -> 280
    //   320: aload_0
    //   321: getstatic Perryc.c : I
    //   324: iflt -> 337
    //   327: ldc2_w -1888864834
    //   330: l2i
    //   331: ldc -1654635530
    //   333: ixor
    //   334: goto -> 344
    //   337: ldc2_w 675875268
    //   340: l2i
    //   341: ldc 502887137
    //   343: ixor
    //   344: ldc2_w -1770579111
    //   347: l2i
    //   348: ldc -1496351221
    //   350: ixor
    //   351: ixor
    //   352: lookupswitch default -> 582, 84418167 -> 380, 582095642 -> 337
    //   380: getfield field_70179_y : D
    //   383: getstatic Perryc.0 : I
    //   386: ifle -> 399
    //   389: ldc2_w 1639057226
    //   392: l2i
    //   393: ldc 1197977936
    //   395: ixor
    //   396: goto -> 406
    //   399: ldc2_w 647624464
    //   402: l2i
    //   403: ldc -775148594
    //   405: ixor
    //   406: ldc2_w -2062842716
    //   409: l2i
    //   410: ldc -1102584750
    //   412: ixor
    //   413: ixor
    //   414: lookupswitch default -> 584, -870728664 -> 440, 496621292 -> 399
    //   440: aload_0
    //   441: getstatic Perryc.1 : I
    //   444: ifeq -> 457
    //   447: ldc2_w -973669493
    //   450: l2i
    //   451: ldc 1280412231
    //   453: ixor
    //   454: goto -> 464
    //   457: ldc2_w -1483711335
    //   460: l2i
    //   461: ldc -123764539
    //   463: ixor
    //   464: ldc2_w 1727392805
    //   467: l2i
    //   468: ldc -2143811689
    //   470: ixor
    //   471: ixor
    //   472: lookupswitch default -> 578, -1178454034 -> 500, 1869257342 -> 457
    //   500: getfield field_70179_y : D
    //   503: dmul
    //   504: dadd
    //   505: getstatic Perryc.1 : I
    //   508: ifeq -> 521
    //   511: ldc2_w 70642492
    //   514: l2i
    //   515: ldc 1660330228
    //   517: ixor
    //   518: goto -> 528
    //   521: ldc2_w 1690319541
    //   524: l2i
    //   525: ldc -114255291
    //   527: ixor
    //   528: ldc2_w -489065320
    //   531: l2i
    //   532: ldc -340634431
    //   534: ixor
    //   535: ixor
    //   536: lookupswitch default -> 564, -411316995 -> 521, 1873308561 -> 592
    //   564: goto -> 568
    //   567: athrow
    //   568: invokestatic sqrt : (D)D
    //   571: goto -> 575
    //   574: athrow
    //   575: dreturn
    //   576: aconst_null
    //   577: athrow
    //   578: aconst_null
    //   579: athrow
    //   580: aconst_null
    //   581: athrow
    //   582: aconst_null
    //   583: athrow
    //   584: aconst_null
    //   585: athrow
    //   586: aconst_null
    //   587: athrow
    //   588: aconst_null
    //   589: athrow
    //   590: aconst_null
    //   591: athrow
    //   592: aconst_null
    //   593: athrow
    //   594: pop
    //   595: goto -> 24
    //   598: pop
    //   599: aconst_null
    //   600: goto -> 594
    //   603: dup
    //   604: ifnull -> 594
    //   607: checkcast java/lang/Throwable
    //   610: athrow
    //   611: dup
    //   612: ifnull -> 598
    //   615: checkcast java/lang/Throwable
    //   618: athrow
    //   619: aconst_null
    //   620: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	552	0	entity	Lnet/minecraft/entity/EntityLivingBase;
    // Exception table:
    //   from	to	target	type
    //   8	20	603	finally
    //   568	574	574	finally
    //   568	574	574	finally
    //   568	574	3	finally
    //   568	574	3	finally
    //   568	574	3	finally
    //   603	611	603	java/lang/UnsupportedOperationException
    //   619	621	3	finally
  }
  
  public static void setSpeed(EntityLivingBase paramEntityLivingBase, double paramDouble) {
    Perry1.06(null, (int)679952348L ^ 0xA166A48, paramEntityLivingBase, paramDouble);
  }
  
  public static double[] forward(double paramDouble) {
    return Perry1.0F(null, (int)-570978826L ^ 0x9E4607BA, paramDouble);
  }
  
  public MotionUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1613936115
    //   9: l2i
    //   10: ldc 874451730
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -2113574422
    //   19: l2i
    //   20: ldc -1685585649
    //   22: ixor
    //   23: ldc2_w 143348188
    //   26: l2i
    //   27: ldc 231319883
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -781366600 -> 16, 1366253174 -> 120
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 1690426043
    //   66: l2i
    //   67: ldc 1924518778
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 222499345
    //   76: l2i
    //   77: ldc -808227794
    //   79: ixor
    //   80: ldc2_w -341911910
    //   83: l2i
    //   84: ldc -559049441
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -237257281 -> 73, 591874628 -> 122
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/MotionUtil;
  }
  
  public static double getBaseMoveSpeed() {
    return Perry1.2D(null, (int)-1136239570L ^ 0xF957B191);
  }
  
  public static boolean isMoving(EntityLivingBase paramEntityLivingBase) {
    return Perry1.6c(null, (int)-992127959L ^ 0x99F1A67E, paramEntityLivingBase);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\MotionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */