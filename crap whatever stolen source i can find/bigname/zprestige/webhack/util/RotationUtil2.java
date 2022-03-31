package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class RotationUtil2 implements Util {
  public static float[] getAngle(Entity paramEntity) {
    return Perry1.0Q(null, (int)-558748370L ^ 0xBD6640AD, paramEntity);
  }
  
  public RotationUtil2() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -469829562
    //   9: l2i
    //   10: ldc -1591337659
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 156456479
    //   19: l2i
    //   20: ldc -1902383069
    //   22: ixor
    //   23: ldc2_w 109121283
    //   26: l2i
    //   27: ldc 1466503395
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1871422266 -> 16, 321977059 -> 122
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -602143731
    //   66: l2i
    //   67: ldc -1466794357
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 2094440161
    //   76: l2i
    //   77: ldc 307809218
    //   79: ixor
    //   80: ldc2_w -298635069
    //   83: l2i
    //   84: ldc -1963544012
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 120, 172742612 -> 116, 273414257 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/RotationUtil2;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static double yawDist(Entity paramEntity) {
    return Perry1.5H(null, (int)741602676L ^ 0x3FC6A50E, paramEntity);
  }
  
  public static String getDirection4D(boolean northRed) {
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
  
  public static float[] simpleFacing(EnumFacing facing) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 999
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 991
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 983
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 805025450
    //   33: l2i
    //   34: ldc_w 1806314987
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1799895980
    //   44: l2i
    //   45: ldc_w 441402339
    //   48: ixor
    //   49: ldc2_w 138940962
    //   52: l2i
    //   53: ldc_w -633474708
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1775994865 -> 964, -787392432 -> 41
    //   84: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 104
    //   93: ldc2_w 1365517372
    //   96: l2i
    //   97: ldc_w 1274085805
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -348627053
    //   107: l2i
    //   108: ldc_w 80610074
    //   111: ixor
    //   112: ldc2_w 1073531715
    //   115: l2i
    //   116: ldc_w -760461537
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -138040883 -> 972, 1423335778 -> 104
    //   148: aload_0
    //   149: getstatic Perryc.0 : I
    //   152: ifle -> 166
    //   155: ldc2_w -1323826460
    //   158: l2i
    //   159: ldc_w 977696858
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -1519879532
    //   169: l2i
    //   170: ldc_w 504383661
    //   173: ixor
    //   174: ldc2_w -830254544
    //   177: l2i
    //   178: ldc_w 325305846
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 208, 1455353208 -> 968, 1735113326 -> 166
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual ordinal : ()I
    //   215: goto -> 219
    //   218: athrow
    //   219: iaload
    //   220: tableswitch default -> 899, 1 -> 256, 2 -> 492, 3 -> 728, 4 -> 785, 5 -> 842
    //   256: ldc2_w 1292200450
    //   259: l2i
    //   260: ldc_w 1292200448
    //   263: ixor
    //   264: newarray float
    //   266: dup
    //   267: ldc2_w -1204245544
    //   270: l2i
    //   271: ldc_w -1204245544
    //   274: ixor
    //   275: getstatic Perryc.c : I
    //   278: iflt -> 292
    //   281: ldc2_w 1859792475
    //   284: l2i
    //   285: ldc_w -1109851065
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w 1815804159
    //   295: l2i
    //   296: ldc_w 1111154689
    //   299: ixor
    //   300: ldc2_w 1823803616
    //   303: l2i
    //   304: ldc_w -146728783
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 336, 980031404 -> 292, 1224161869 -> 966
    //   336: getstatic bigname/zprestige/webhack/util/RotationUtil2.mc : Lnet/minecraft/client/Minecraft;
    //   339: getstatic Perryc.0 : I
    //   342: ifle -> 356
    //   345: ldc2_w 1140002016
    //   348: l2i
    //   349: ldc_w -243286888
    //   352: ixor
    //   353: goto -> 364
    //   356: ldc2_w 1279513001
    //   359: l2i
    //   360: ldc_w 2049476616
    //   363: ixor
    //   364: ldc2_w 919626639
    //   367: l2i
    //   368: ldc_w 1704569557
    //   371: ixor
    //   372: ixor
    //   373: lookupswitch default -> 400, -507152094 -> 970, 2083868050 -> 356
    //   400: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   403: getstatic Perryc.0 : I
    //   406: ifle -> 420
    //   409: ldc2_w -419896562
    //   412: l2i
    //   413: ldc_w 1806947804
    //   416: ixor
    //   417: goto -> 428
    //   420: ldc2_w -582401913
    //   423: l2i
    //   424: ldc_w -383634721
    //   427: ixor
    //   428: ldc2_w 1699118425
    //   431: l2i
    //   432: ldc_w 989976070
    //   435: ixor
    //   436: ixor
    //   437: lookupswitch default -> 464, -754147955 -> 962, -598373612 -> 420
    //   464: getfield field_70177_z : F
    //   467: fastore
    //   468: dup
    //   469: ldc2_w 336301593
    //   472: l2i
    //   473: ldc_w 336301592
    //   476: ixor
    //   477: ldc_w 1.2730979
    //   480: invokestatic floatToIntBits : (F)I
    //   483: ldc_w 2098656479
    //   486: ixor
    //   487: invokestatic intBitsToFloat : (I)F
    //   490: fastore
    //   491: areturn
    //   492: ldc2_w 138916451
    //   495: l2i
    //   496: ldc_w 138916449
    //   499: ixor
    //   500: newarray float
    //   502: dup
    //   503: ldc2_w 815028373
    //   506: l2i
    //   507: ldc_w 815028373
    //   510: ixor
    //   511: getstatic Perryc.0 : I
    //   514: ifle -> 528
    //   517: ldc2_w -1928243831
    //   520: l2i
    //   521: ldc_w -1701429371
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w 1462987386
    //   531: l2i
    //   532: ldc_w -683510783
    //   535: ixor
    //   536: ldc2_w -700259610
    //   539: l2i
    //   540: ldc_w 62881894
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 572, -1032189812 -> 956, 1425310140 -> 528
    //   572: getstatic bigname/zprestige/webhack/util/RotationUtil2.mc : Lnet/minecraft/client/Minecraft;
    //   575: getstatic Perryc.c : I
    //   578: iflt -> 592
    //   581: ldc2_w 879489385
    //   584: l2i
    //   585: ldc_w -1709122312
    //   588: ixor
    //   589: goto -> 600
    //   592: ldc2_w -1980986660
    //   595: l2i
    //   596: ldc_w 540165291
    //   599: ixor
    //   600: ldc2_w -1034449426
    //   603: l2i
    //   604: ldc_w -2130284783
    //   607: ixor
    //   608: ixor
    //   609: lookupswitch default -> 960, -359715704 -> 636, -317010066 -> 592
    //   636: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   639: getstatic Perryc.1 : I
    //   642: ifeq -> 656
    //   645: ldc2_w 518905633
    //   648: l2i
    //   649: ldc_w -1933198162
    //   652: ixor
    //   653: goto -> 664
    //   656: ldc2_w 796760892
    //   659: l2i
    //   660: ldc_w -1384740715
    //   663: ixor
    //   664: ldc2_w -2116612912
    //   667: l2i
    //   668: ldc_w 2046654652
    //   671: ixor
    //   672: ixor
    //   673: lookupswitch default -> 700, -1795124159 -> 656, 1778522083 -> 958
    //   700: getfield field_70177_z : F
    //   703: fastore
    //   704: dup
    //   705: ldc2_w -1782706556
    //   708: l2i
    //   709: ldc_w -1782706555
    //   712: ixor
    //   713: ldc_w -0.20917796
    //   716: invokestatic floatToIntBits : (F)I
    //   719: ldc_w 2095198911
    //   722: ixor
    //   723: invokestatic intBitsToFloat : (I)F
    //   726: fastore
    //   727: areturn
    //   728: ldc2_w -726074091
    //   731: l2i
    //   732: ldc_w -726074089
    //   735: ixor
    //   736: newarray float
    //   738: dup
    //   739: ldc2_w -1366120810
    //   742: l2i
    //   743: ldc_w -1366120810
    //   746: ixor
    //   747: ldc_w 0.012484058
    //   750: invokestatic floatToIntBits : (F)I
    //   753: ldc_w 2138606063
    //   756: ixor
    //   757: invokestatic intBitsToFloat : (I)F
    //   760: fastore
    //   761: dup
    //   762: ldc2_w -796228282
    //   765: l2i
    //   766: ldc_w -796228281
    //   769: ixor
    //   770: ldc_w 1.9510305E38
    //   773: invokestatic floatToIntBits : (F)I
    //   776: ldc_w 2131937147
    //   779: ixor
    //   780: invokestatic intBitsToFloat : (I)F
    //   783: fastore
    //   784: areturn
    //   785: ldc2_w 489463394
    //   788: l2i
    //   789: ldc_w 489463392
    //   792: ixor
    //   793: newarray float
    //   795: dup
    //   796: ldc2_w 1729071976
    //   799: l2i
    //   800: ldc_w 1729071976
    //   803: ixor
    //   804: ldc_w 1.9534978E38
    //   807: invokestatic floatToIntBits : (F)I
    //   810: ldc_w 2131949312
    //   813: ixor
    //   814: invokestatic intBitsToFloat : (I)F
    //   817: fastore
    //   818: dup
    //   819: ldc2_w 1743153187
    //   822: l2i
    //   823: ldc_w 1743153186
    //   826: ixor
    //   827: ldc_w 2.1219915E38
    //   830: invokestatic floatToIntBits : (F)I
    //   833: ldc_w 2132780050
    //   836: ixor
    //   837: invokestatic intBitsToFloat : (I)F
    //   840: fastore
    //   841: areturn
    //   842: ldc2_w -1740245522
    //   845: l2i
    //   846: ldc_w -1740245524
    //   849: ixor
    //   850: newarray float
    //   852: dup
    //   853: ldc2_w -1734367590
    //   856: l2i
    //   857: ldc_w -1734367590
    //   860: ixor
    //   861: ldc_w 0.088431485
    //   864: invokestatic floatToIntBits : (F)I
    //   867: ldc_w 2130779025
    //   870: ixor
    //   871: invokestatic intBitsToFloat : (I)F
    //   874: fastore
    //   875: dup
    //   876: ldc2_w 1185687208
    //   879: l2i
    //   880: ldc_w 1185687209
    //   883: ixor
    //   884: ldc_w 3.2786036E38
    //   887: invokestatic floatToIntBits : (F)I
    //   890: ldc_w 2138482588
    //   893: ixor
    //   894: invokestatic intBitsToFloat : (I)F
    //   897: fastore
    //   898: areturn
    //   899: ldc2_w -695564237
    //   902: l2i
    //   903: ldc_w -695564239
    //   906: ixor
    //   907: newarray float
    //   909: dup
    //   910: ldc2_w 1693088775
    //   913: l2i
    //   914: ldc_w 1693088775
    //   917: ixor
    //   918: ldc_w 0.10543623
    //   921: invokestatic floatToIntBits : (F)I
    //   924: ldc_w 2119233267
    //   927: ixor
    //   928: invokestatic intBitsToFloat : (I)F
    //   931: fastore
    //   932: dup
    //   933: ldc2_w -1091849990
    //   936: l2i
    //   937: ldc_w -1091849989
    //   940: ixor
    //   941: ldc_w 2.6742675E38
    //   944: invokestatic floatToIntBits : (F)I
    //   947: ldc_w 2135502981
    //   950: ixor
    //   951: invokestatic intBitsToFloat : (I)F
    //   954: fastore
    //   955: areturn
    //   956: aconst_null
    //   957: athrow
    //   958: aconst_null
    //   959: athrow
    //   960: aconst_null
    //   961: athrow
    //   962: aconst_null
    //   963: athrow
    //   964: aconst_null
    //   965: athrow
    //   966: aconst_null
    //   967: athrow
    //   968: aconst_null
    //   969: athrow
    //   970: aconst_null
    //   971: athrow
    //   972: aconst_null
    //   973: athrow
    //   974: pop
    //   975: goto -> 24
    //   978: pop
    //   979: aconst_null
    //   980: goto -> 974
    //   983: dup
    //   984: ifnull -> 974
    //   987: checkcast java/lang/Throwable
    //   990: athrow
    //   991: dup
    //   992: ifnull -> 978
    //   995: checkcast java/lang/Throwable
    //   998: athrow
    //   999: aconst_null
    //   1000: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	932	0	facing	Lnet/minecraft/util/EnumFacing;
    // Exception table:
    //   from	to	target	type
    //   8	20	983	java/lang/NegativeArraySizeException
    //   211	218	218	finally
    //   211	218	3	finally
    //   211	218	218	java/lang/ArrayIndexOutOfBoundsException
    //   212	218	218	finally
    //   212	218	211	java/lang/IndexOutOfBoundsException
    //   983	991	983	java/lang/ArithmeticException
    //   999	1001	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public static float getFov() {
    return Perry1.2L(null, (int)1021868163L ^ 0xD5C64BF);
  }
  
  public static void faceVector(Vec3d vec, boolean normalizeAngle) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1221
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1213
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1205
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1951442149
    //   33: l2i
    //   34: ldc_w -1637264977
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 534228151
    //   44: l2i
    //   45: ldc_w -1119300064
    //   48: ixor
    //   49: ldc2_w -196249131
    //   52: l2i
    //   53: ldc_w -612783666
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1174, -1918129524 -> 84, 988994223 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 739895261
    //   94: l2i
    //   95: ldc_w 1891607071
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -120320962
    //   105: l2i
    //   106: ldc_w 630458745
    //   109: ixor
    //   110: ldc2_w 1426991379
    //   113: l2i
    //   114: ldc_w 1168259636
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1184, -840165792 -> 144, 1275746021 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokestatic getLegitRotations : (Lnet/minecraft/util/math/Vec3d;)[F
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 172
    //   161: ldc2_w 24610972
    //   164: l2i
    //   165: ldc_w 1598907714
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -1161544749
    //   175: l2i
    //   176: ldc_w -1605101023
    //   179: ixor
    //   180: ldc2_w 305109590
    //   183: l2i
    //   184: ldc_w -1671712460
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 1168, -1796994416 -> 216, -800143684 -> 172
    //   216: astore_2
    //   217: getstatic Perryc.0 : I
    //   220: ifle -> 234
    //   223: ldc2_w -7755505
    //   226: l2i
    //   227: ldc_w 1371363871
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w -1433972725
    //   237: l2i
    //   238: ldc_w -447270360
    //   241: ixor
    //   242: ldc2_w -741797086
    //   245: l2i
    //   246: ldc_w 1698202716
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, 415589486 -> 1192, 1008882200 -> 234
    //   276: getstatic bigname/zprestige/webhack/util/RotationUtil2.mc : Lnet/minecraft/client/Minecraft;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w -52391412
    //   288: l2i
    //   289: ldc_w -404042799
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -302355107
    //   299: l2i
    //   300: ldc_w -535368701
    //   303: ixor
    //   304: ldc2_w 137293152
    //   307: l2i
    //   308: ldc_w -1212237556
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 1176, -1533407823 -> 296, -1300441806 -> 340
    //   340: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   343: getstatic Perryc.0 : I
    //   346: ifle -> 360
    //   349: ldc2_w -1221017896
    //   352: l2i
    //   353: ldc_w 1806006131
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 2089206277
    //   363: l2i
    //   364: ldc_w 1401765889
    //   367: ixor
    //   368: ldc2_w 1536140277
    //   371: l2i
    //   372: ldc_w -194369632
    //   375: ixor
    //   376: ixor
    //   377: lookupswitch default -> 404, -425936236 -> 360, 1937264126 -> 1190
    //   404: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   407: new net/minecraft/network/play/client/CPacketPlayer$Rotation
    //   410: dup
    //   411: getstatic Perryc.0 : I
    //   414: ifle -> 428
    //   417: ldc2_w 1232439655
    //   420: l2i
    //   421: ldc_w -310053598
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w 1995704749
    //   431: l2i
    //   432: ldc_w 1922530498
    //   435: ixor
    //   436: ldc2_w 2031790255
    //   439: l2i
    //   440: ldc_w 1484680761
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -2053784877 -> 1166, -603718983 -> 428
    //   472: aload_2
    //   473: ldc2_w 1541834003
    //   476: l2i
    //   477: ldc_w 1541834003
    //   480: ixor
    //   481: faload
    //   482: getstatic Perryc.1 : I
    //   485: ifeq -> 499
    //   488: ldc2_w -184591835
    //   491: l2i
    //   492: ldc_w 2142292152
    //   495: ixor
    //   496: goto -> 507
    //   499: ldc2_w -271926327
    //   502: l2i
    //   503: ldc_w -1352490892
    //   506: ixor
    //   507: ldc2_w 1412214734
    //   510: l2i
    //   511: ldc_w -1488732358
    //   514: ixor
    //   515: ixor
    //   516: lookupswitch default -> 544, 929826700 -> 499, 2015396457 -> 1186
    //   544: iload_1
    //   545: ifeq -> 559
    //   548: ldc2_w 2003530239
    //   551: l2i
    //   552: ldc_w 768317430
    //   555: ixor
    //   556: goto -> 567
    //   559: ldc2_w 384459268
    //   562: l2i
    //   563: ldc_w 1279951882
    //   566: ixor
    //   567: ldc2_w -1797828912
    //   570: l2i
    //   571: ldc_w -737043342
    //   574: ixor
    //   575: ixor
    //   576: tableswitch default -> 548, 442905771 -> 600, 442905772 -> 755
    //   600: getstatic Perryc.c : I
    //   603: iflt -> 617
    //   606: ldc2_w 1778323238
    //   609: l2i
    //   610: ldc_w 1538679715
    //   613: ixor
    //   614: goto -> 625
    //   617: ldc2_w -1245632087
    //   620: l2i
    //   621: ldc_w -66724007
    //   624: ixor
    //   625: ldc2_w -349819358
    //   628: l2i
    //   629: ldc_w -332231760
    //   632: ixor
    //   633: ixor
    //   634: lookupswitch default -> 1182, 895338775 -> 617, 1322275682 -> 660
    //   660: aload_2
    //   661: ldc2_w 1116440507
    //   664: l2i
    //   665: ldc_w 1116440506
    //   668: ixor
    //   669: faload
    //   670: f2i
    //   671: ldc2_w -400248808
    //   674: l2i
    //   675: ldc_w -400248464
    //   678: ixor
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 696
    //   685: ldc2_w 2062181125
    //   688: l2i
    //   689: ldc_w -1443989676
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 643009016
    //   699: l2i
    //   700: ldc_w 811073957
    //   703: ixor
    //   704: ldc2_w -81329704
    //   707: l2i
    //   708: ldc_w 488637145
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 740, -906726451 -> 696, 889395024 -> 1164
    //   740: goto -> 744
    //   743: athrow
    //   744: invokestatic func_180184_b : (II)I
    //   747: goto -> 751
    //   750: athrow
    //   751: i2f
    //   752: goto -> 826
    //   755: getstatic Perryc.c : I
    //   758: iflt -> 772
    //   761: ldc2_w 812443845
    //   764: l2i
    //   765: ldc_w 763090707
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -1484264014
    //   775: l2i
    //   776: ldc_w -59415793
    //   779: ixor
    //   780: ldc2_w 184103723
    //   783: l2i
    //   784: ldc_w 698841021
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 1194, 1045003072 -> 772, 2024589867 -> 816
    //   816: aload_2
    //   817: ldc2_w 1078572980
    //   820: l2i
    //   821: ldc_w 1078572981
    //   824: ixor
    //   825: faload
    //   826: getstatic Perryc.0 : I
    //   829: ifle -> 843
    //   832: ldc2_w -1432835525
    //   835: l2i
    //   836: ldc_w -2030723073
    //   839: ixor
    //   840: goto -> 851
    //   843: ldc2_w -1213538889
    //   846: l2i
    //   847: ldc_w -1899997626
    //   850: ixor
    //   851: ldc2_w -811773098
    //   854: l2i
    //   855: ldc_w 1615256790
    //   858: ixor
    //   859: ixor
    //   860: lookupswitch default -> 1178, -2085176764 -> 843, -1766783887 -> 888
    //   888: getstatic bigname/zprestige/webhack/util/RotationUtil2.mc : Lnet/minecraft/client/Minecraft;
    //   891: getstatic Perryc.c : I
    //   894: iflt -> 908
    //   897: ldc2_w 1270412111
    //   900: l2i
    //   901: ldc_w -2763992
    //   904: ixor
    //   905: goto -> 916
    //   908: ldc2_w -401532025
    //   911: l2i
    //   912: ldc_w 1087661279
    //   915: ixor
    //   916: ldc2_w -693437412
    //   919: l2i
    //   920: ldc_w 2018185853
    //   923: ixor
    //   924: ixor
    //   925: lookupswitch default -> 1180, 103059769 -> 952, 445435398 -> 908
    //   952: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   955: getstatic Perryc.c : I
    //   958: iflt -> 972
    //   961: ldc2_w 296873614
    //   964: l2i
    //   965: ldc_w 470198448
    //   968: ixor
    //   969: goto -> 980
    //   972: ldc2_w 496868483
    //   975: l2i
    //   976: ldc_w 610970982
    //   979: ixor
    //   980: ldc2_w 2000330615
    //   983: l2i
    //   984: ldc_w -1979873884
    //   987: ixor
    //   988: ixor
    //   989: lookupswitch default -> 1016, -210739987 -> 1170, 1913143016 -> 972
    //   1016: getfield field_70122_E : Z
    //   1019: getstatic Perryc.0 : I
    //   1022: ifle -> 1036
    //   1025: ldc2_w 503391373
    //   1028: l2i
    //   1029: ldc_w 554743293
    //   1032: ixor
    //   1033: goto -> 1044
    //   1036: ldc2_w 822780662
    //   1039: l2i
    //   1040: ldc_w -986760151
    //   1043: ixor
    //   1044: ldc2_w -134252222
    //   1047: l2i
    //   1048: ldc_w 596985703
    //   1051: ixor
    //   1052: ixor
    //   1053: lookupswitch default -> 1080, -344215723 -> 1172, 2039991827 -> 1036
    //   1080: goto -> 1084
    //   1083: athrow
    //   1084: invokespecial <init> : (FFZ)V
    //   1087: goto -> 1091
    //   1090: athrow
    //   1091: getstatic Perryc.c : I
    //   1094: iflt -> 1108
    //   1097: ldc2_w -209409069
    //   1100: l2i
    //   1101: ldc_w -1090107689
    //   1104: ixor
    //   1105: goto -> 1116
    //   1108: ldc2_w -1717499250
    //   1111: l2i
    //   1112: ldc_w 1650803399
    //   1115: ixor
    //   1116: ldc2_w -1292310228
    //   1119: l2i
    //   1120: ldc_w -471101806
    //   1123: ixor
    //   1124: ixor
    //   1125: lookupswitch default -> 1188, -1428738057 -> 1152, 496077498 -> 1108
    //   1152: goto -> 1156
    //   1155: athrow
    //   1156: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   1159: goto -> 1163
    //   1162: athrow
    //   1163: return
    //   1164: aconst_null
    //   1165: athrow
    //   1166: aconst_null
    //   1167: athrow
    //   1168: aconst_null
    //   1169: athrow
    //   1170: aconst_null
    //   1171: athrow
    //   1172: aconst_null
    //   1173: athrow
    //   1174: aconst_null
    //   1175: athrow
    //   1176: aconst_null
    //   1177: athrow
    //   1178: aconst_null
    //   1179: athrow
    //   1180: aconst_null
    //   1181: athrow
    //   1182: aconst_null
    //   1183: athrow
    //   1184: aconst_null
    //   1185: athrow
    //   1186: aconst_null
    //   1187: athrow
    //   1188: aconst_null
    //   1189: athrow
    //   1190: aconst_null
    //   1191: athrow
    //   1192: aconst_null
    //   1193: athrow
    //   1194: aconst_null
    //   1195: athrow
    //   1196: pop
    //   1197: goto -> 24
    //   1200: pop
    //   1201: aconst_null
    //   1202: goto -> 1196
    //   1205: dup
    //   1206: ifnull -> 1196
    //   1209: checkcast java/lang/Throwable
    //   1212: athrow
    //   1213: dup
    //   1214: ifnull -> 1200
    //   1217: checkcast java/lang/Throwable
    //   1220: athrow
    //   1221: aconst_null
    //   1222: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1140	0	vec	Lnet/minecraft/util/math/Vec3d;
    //   24	1140	1	normalizeAngle	Z
    //   217	947	2	rotations	[F
    // Exception table:
    //   from	to	target	type
    //   8	20	1205	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	finally
    //   743	750	750	finally
    //   743	750	743	finally
    //   744	750	743	java/util/NoSuchElementException
    //   744	750	3	finally
    //   744	750	3	finally
    //   1083	1090	1090	finally
    //   1083	1090	3	java/lang/IllegalArgumentException
    //   1084	1090	1090	finally
    //   1084	1090	1083	finally
    //   1084	1090	1090	finally
    //   1155	1162	1162	finally
    //   1155	1162	1162	finally
    //   1155	1162	1155	java/util/ConcurrentModificationException
    //   1155	1162	1162	java/lang/IndexOutOfBoundsException
    //   1155	1162	1162	java/lang/EnumConstantNotPresentException
    //   1205	1213	1205	finally
    //   1221	1223	3	java/lang/IllegalArgumentException
  }
  
  public static void faceEntity(Entity entity) {
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
  
  public static float getHalvedfov() {
    return Perry1.2M(null, (int)-990421969L ^ 0xE31CE67B);
  }
  
  public static int getDirection4D() {
    return Perry1.2S(null, (int)-1700349596L ^ 0xDD39C222);
  }
  
  public static float transformYaw() {
    return Perry1.2N(null, (int)-1460063288L ^ 0xDC1B8D93);
  }
  
  public static boolean isInFov(Entity paramEntity) {
    return Perry1.5V(null, (int)-426328404L ^ 0xF729B716, paramEntity);
  }
  
  public static double[] calculateLookAt(double px, double py, double pz, EntityPlayer me) {
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
  
  public static boolean isInFov(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return Perry1.0H(null, (int)-123747891L ^ 0x8670E6D0, paramVec3d1, paramVec3d2);
  }
  
  public static float[] getLegitRotations(Vec3d paramVec3d) {
    return Perry1.6w(null, (int)672258363L ^ 0x6E445315, paramVec3d);
  }
  
  public static Vec3d getEyesPos() {
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
  
  public static boolean isInFov(BlockPos paramBlockPos) {
    return Perry1.6j(null, (int)1138283588L ^ 0x266A10D2, paramBlockPos);
  }
  
  public static void faceYawAndPitch(float yaw, float pitch) {
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
  
  public static double yawDist(BlockPos pos) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\RotationUtil2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */