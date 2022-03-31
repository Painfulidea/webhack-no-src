package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;

public class DamageUtil implements Util {
  public DamageUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 224324895
    //   9: l2i
    //   10: ldc 1299784418
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 643661751
    //   19: l2i
    //   20: ldc -294795743
    //   22: ixor
    //   23: ldc2_w 1134059689
    //   26: l2i
    //   27: ldc 735186842
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 120, -1602562395 -> 56, 678273230 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 255292440
    //   66: l2i
    //   67: ldc -1239314258
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -975953271
    //   76: l2i
    //   77: ldc -193499822
    //   79: ixor
    //   80: ldc2_w 1757732405
    //   83: l2i
    //   84: ldc -314297713
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 884908333 -> 73, 1016465420 -> 122
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/DamageUtil;
  }
  
  public static boolean isNaked(EntityPlayer paramEntityPlayer) {
    return Perry1.09(null, (int)424237567L ^ 0x7819D241, paramEntityPlayer);
  }
  
  public static float getDamageMultiplied(float paramFloat) {
    return Perry1.0L(null, (int)1705147819L ^ 0x68108C9E, paramFloat);
  }
  
  public static float getDamageInPercent(ItemStack paramItemStack) {
    return Perry1.0f(null, (int)672469947L ^ 0x519BDF8D, paramItemStack);
  }
  
  public static boolean canBreakWeakness(EntityPlayer paramEntityPlayer) {
    return Perry1.0d(null, (int)-1681371726L ^ 0xF5040B34, paramEntityPlayer);
  }
  
  public static float calculateDamage(BlockPos pos, Entity entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 617
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 609
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 601
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -2014339996
    //   33: l2i
    //   34: ldc -1371654444
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -196881872
    //   43: l2i
    //   44: ldc 678849313
    //   46: ixor
    //   47: ldc2_w 477223187
    //   50: l2i
    //   51: ldc -894098461
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -958366026 -> 40, -15380416 -> 576
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w -1155605513
    //   90: l2i
    //   91: ldc 856453889
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 925149139
    //   100: l2i
    //   101: ldc 801584240
    //   103: ixor
    //   104: ldc2_w -178493715
    //   107: l2i
    //   108: ldc -630842120
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1490496797 -> 590, -190215545 -> 97
    //   140: goto -> 144
    //   143: athrow
    //   144: invokevirtual func_177958_n : ()I
    //   147: goto -> 151
    //   150: athrow
    //   151: i2d
    //   152: ldc2_w 2.31127731317435
    //   155: invokestatic doubleToLongBits : (D)J
    //   158: ldc2_w 9215065771795845262
    //   161: lxor
    //   162: invokestatic longBitsToDouble : (J)D
    //   165: dadd
    //   166: getstatic Perryc.1 : I
    //   169: ifeq -> 182
    //   172: ldc2_w 422880043
    //   175: l2i
    //   176: ldc 1768566703
    //   178: ixor
    //   179: goto -> 189
    //   182: ldc2_w -987957490
    //   185: l2i
    //   186: ldc -1305289725
    //   188: ixor
    //   189: ldc2_w -1994084678
    //   192: l2i
    //   193: ldc 388014436
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 224, -952231028 -> 182, -296058022 -> 584
    //   224: aload_0
    //   225: getstatic Perryc.0 : I
    //   228: ifle -> 241
    //   231: ldc2_w 1240478270
    //   234: l2i
    //   235: ldc -861974874
    //   237: ixor
    //   238: goto -> 248
    //   241: ldc2_w -506548484
    //   244: l2i
    //   245: ldc -1504956771
    //   247: ixor
    //   248: ldc2_w -186467750
    //   251: l2i
    //   252: ldc -1579692254
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 284, -799405600 -> 580, 984716016 -> 241
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_177956_o : ()I
    //   291: goto -> 295
    //   294: athrow
    //   295: ldc2_w -1168158969
    //   298: l2i
    //   299: ldc -1168158970
    //   301: ixor
    //   302: iadd
    //   303: i2d
    //   304: getstatic Perryc.0 : I
    //   307: ifle -> 320
    //   310: ldc2_w -634131190
    //   313: l2i
    //   314: ldc 1109327762
    //   316: ixor
    //   317: goto -> 327
    //   320: ldc2_w 1769372975
    //   323: l2i
    //   324: ldc 5495048
    //   326: ixor
    //   327: ldc2_w -886001003
    //   330: l2i
    //   331: ldc 1265921867
    //   333: ixor
    //   334: ixor
    //   335: lookupswitch default -> 360, -692389116 -> 320, 409587526 -> 582
    //   360: aload_0
    //   361: getstatic Perryc.1 : I
    //   364: ifeq -> 377
    //   367: ldc2_w 2143541918
    //   370: l2i
    //   371: ldc -172034995
    //   373: ixor
    //   374: goto -> 384
    //   377: ldc2_w -1951982725
    //   380: l2i
    //   381: ldc 1195186028
    //   383: ixor
    //   384: ldc2_w 303101460
    //   387: l2i
    //   388: ldc -647724807
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 586, 133069562 -> 420, 1091131454 -> 377
    //   420: goto -> 424
    //   423: athrow
    //   424: invokevirtual func_177952_p : ()I
    //   427: goto -> 431
    //   430: athrow
    //   431: i2d
    //   432: ldc2_w 2.8678160095003533
    //   435: invokestatic doubleToLongBits : (D)J
    //   438: ldc2_w 9216318985528540787
    //   441: lxor
    //   442: invokestatic longBitsToDouble : (J)D
    //   445: dadd
    //   446: getstatic Perryc.0 : I
    //   449: ifle -> 462
    //   452: ldc2_w 1573366401
    //   455: l2i
    //   456: ldc -1553052677
    //   458: ixor
    //   459: goto -> 469
    //   462: ldc2_w 38166910
    //   465: l2i
    //   466: ldc 1322316631
    //   468: ixor
    //   469: ldc2_w 1823878483
    //   472: l2i
    //   473: ldc -1313775063
    //   475: ixor
    //   476: ixor
    //   477: lookupswitch default -> 578, -1852711597 -> 504, 598650368 -> 462
    //   504: aload_1
    //   505: getstatic Perryc.1 : I
    //   508: ifeq -> 521
    //   511: ldc2_w -116295489
    //   514: l2i
    //   515: ldc -2121248975
    //   517: ixor
    //   518: goto -> 528
    //   521: ldc2_w -79287897
    //   524: l2i
    //   525: ldc 95259667
    //   527: ixor
    //   528: ldc2_w 1032712840
    //   531: l2i
    //   532: ldc 277410870
    //   534: ixor
    //   535: ixor
    //   536: lookupswitch default -> 564, -953888247 -> 521, 1434726704 -> 588
    //   564: goto -> 568
    //   567: athrow
    //   568: invokestatic calculateDamage : (DDDLnet/minecraft/entity/Entity;)F
    //   571: goto -> 575
    //   574: athrow
    //   575: freturn
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
    //   592: pop
    //   593: goto -> 24
    //   596: pop
    //   597: aconst_null
    //   598: goto -> 592
    //   601: dup
    //   602: ifnull -> 592
    //   605: checkcast java/lang/Throwable
    //   608: athrow
    //   609: dup
    //   610: ifnull -> 596
    //   613: checkcast java/lang/Throwable
    //   616: athrow
    //   617: aconst_null
    //   618: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	552	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	552	1	entity	Lnet/minecraft/entity/Entity;
    // Exception table:
    //   from	to	target	type
    //   8	20	601	finally
    //   143	150	150	finally
    //   143	150	3	finally
    //   144	150	3	finally
    //   144	150	143	finally
    //   144	150	150	java/lang/RuntimeException
    //   288	294	294	finally
    //   288	294	294	java/lang/AssertionError
    //   288	294	294	java/lang/ArrayIndexOutOfBoundsException
    //   288	294	3	finally
    //   288	294	294	finally
    //   423	430	430	finally
    //   423	430	3	finally
    //   424	430	423	finally
    //   424	430	423	finally
    //   424	430	430	finally
    //   567	574	574	finally
    //   567	574	567	finally
    //   567	574	574	java/lang/ArithmeticException
    //   568	574	3	finally
    //   568	574	3	finally
    //   601	609	601	finally
    //   617	619	3	java/util/NoSuchElementException
  }
  
  public static boolean canTakeDamage(boolean suicide) {
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
  
  public static float calculateDamage(Entity crystal, Entity entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 569
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 561
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 553
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 392742541
    //   33: l2i
    //   34: ldc_w -1306600622
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1141951202
    //   44: l2i
    //   45: ldc_w -1436332862
    //   48: ixor
    //   49: ldc2_w 812286017
    //   52: l2i
    //   53: ldc_w 685438031
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1111070255 -> 530, 654321701 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -936660442
    //   94: l2i
    //   95: ldc_w 1317560540
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 820273448
    //   105: l2i
    //   106: ldc_w 415564073
    //   109: ixor
    //   110: ldc2_w -889773701
    //   113: l2i
    //   114: ldc_w 1272986875
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1147736216 -> 102, 129290106 -> 528
    //   144: getfield field_70165_t : D
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w -80769665
    //   156: l2i
    //   157: ldc_w 610003988
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -169405722
    //   167: l2i
    //   168: ldc_w 1132307272
    //   171: ixor
    //   172: ldc2_w 2086680091
    //   175: l2i
    //   176: ldc_w 1464460110
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 538, -1649187589 -> 208, -195185602 -> 164
    //   208: aload_0
    //   209: getstatic Perryc.c : I
    //   212: iflt -> 226
    //   215: ldc2_w -1449378618
    //   218: l2i
    //   219: ldc_w 782329247
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 939013618
    //   229: l2i
    //   230: ldc_w -45785458
    //   233: ixor
    //   234: ldc2_w 1738812207
    //   237: l2i
    //   238: ldc_w 1349933022
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -1326504536 -> 534, -1257512702 -> 226
    //   268: getfield field_70163_u : D
    //   271: getstatic Perryc.c : I
    //   274: iflt -> 288
    //   277: ldc2_w -1154147313
    //   280: l2i
    //   281: ldc_w -710018729
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -1103240239
    //   291: l2i
    //   292: ldc_w 1105178155
    //   295: ixor
    //   296: ldc2_w 190213245
    //   299: l2i
    //   300: ldc_w 544358452
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -1728973597 -> 288, 1170000145 -> 542
    //   332: aload_0
    //   333: getstatic Perryc.0 : I
    //   336: ifle -> 350
    //   339: ldc2_w -1173467066
    //   342: l2i
    //   343: ldc_w -1243987469
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w -2116676053
    //   353: l2i
    //   354: ldc_w -417013135
    //   357: ixor
    //   358: ldc2_w -1841609406
    //   361: l2i
    //   362: ldc_w 1400630076
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 536, -1481483740 -> 392, -829112373 -> 350
    //   392: getfield field_70161_v : D
    //   395: getstatic Perryc.c : I
    //   398: iflt -> 412
    //   401: ldc2_w -584123833
    //   404: l2i
    //   405: ldc_w -596624848
    //   408: ixor
    //   409: goto -> 420
    //   412: ldc2_w 1291211502
    //   415: l2i
    //   416: ldc_w -123656377
    //   419: ixor
    //   420: ldc2_w 418141607
    //   423: l2i
    //   424: ldc_w 574063374
    //   427: ixor
    //   428: ixor
    //   429: lookupswitch default -> 532, -1903385856 -> 456, 998577886 -> 412
    //   456: aload_1
    //   457: getstatic Perryc.1 : I
    //   460: ifeq -> 474
    //   463: ldc2_w 1173033003
    //   466: l2i
    //   467: ldc_w 459824811
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w 347771017
    //   477: l2i
    //   478: ldc_w 361236887
    //   481: ixor
    //   482: ldc2_w -565050611
    //   485: l2i
    //   486: ldc_w -1828729920
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 540, 305038925 -> 474, 1302286803 -> 516
    //   516: goto -> 520
    //   519: athrow
    //   520: invokestatic calculateDamage : (DDDLnet/minecraft/entity/Entity;)F
    //   523: goto -> 527
    //   526: athrow
    //   527: freturn
    //   528: aconst_null
    //   529: athrow
    //   530: aconst_null
    //   531: athrow
    //   532: aconst_null
    //   533: athrow
    //   534: aconst_null
    //   535: athrow
    //   536: aconst_null
    //   537: athrow
    //   538: aconst_null
    //   539: athrow
    //   540: aconst_null
    //   541: athrow
    //   542: aconst_null
    //   543: athrow
    //   544: pop
    //   545: goto -> 24
    //   548: pop
    //   549: aconst_null
    //   550: goto -> 544
    //   553: dup
    //   554: ifnull -> 544
    //   557: checkcast java/lang/Throwable
    //   560: athrow
    //   561: dup
    //   562: ifnull -> 548
    //   565: checkcast java/lang/Throwable
    //   568: athrow
    //   569: aconst_null
    //   570: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	504	0	crystal	Lnet/minecraft/entity/Entity;
    //   24	504	1	entity	Lnet/minecraft/entity/Entity;
    // Exception table:
    //   from	to	target	type
    //   8	20	553	finally
    //   519	526	526	finally
    //   519	526	526	java/lang/AssertionError
    //   519	526	519	java/lang/RuntimeException
    //   520	526	519	finally
    //   520	526	3	finally
    //   553	561	553	finally
    //   569	571	3	java/lang/RuntimeException
  }
  
  public static float calculateDamage(double posX, double posY, double posZ, Entity entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3169
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3161
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3153
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc_w 0.5204782
    //   27: invokestatic floatToIntBits : (F)I
    //   30: ldc_w 2118467087
    //   33: ixor
    //   34: invokestatic intBitsToFloat : (I)F
    //   37: getstatic Perryc.0 : I
    //   40: ifle -> 54
    //   43: ldc2_w -2126922590
    //   46: l2i
    //   47: ldc_w 2102022211
    //   50: ixor
    //   51: goto -> 62
    //   54: ldc2_w 21971711
    //   57: l2i
    //   58: ldc_w 1546222568
    //   61: ixor
    //   62: ldc2_w 2053997533
    //   65: l2i
    //   66: ldc_w 149464231
    //   69: ixor
    //   70: ixor
    //   71: lookupswitch default -> 3102, -1896428645 -> 54, 803413613 -> 96
    //   96: fstore #7
    //   98: getstatic Perryc.c : I
    //   101: iflt -> 115
    //   104: ldc2_w 2085486372
    //   107: l2i
    //   108: ldc_w -1976191718
    //   111: ixor
    //   112: goto -> 123
    //   115: ldc2_w 1382631284
    //   118: l2i
    //   119: ldc_w 859779282
    //   122: ixor
    //   123: ldc2_w 1096098036
    //   126: l2i
    //   127: ldc_w 1965962444
    //   130: ixor
    //   131: ixor
    //   132: lookupswitch default -> 3140, -1039966714 -> 115, 1429037982 -> 160
    //   160: aload #6
    //   162: getstatic Perryc.1 : I
    //   165: ifeq -> 179
    //   168: ldc2_w -1736173318
    //   171: l2i
    //   172: ldc_w 266542118
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -754819977
    //   182: l2i
    //   183: ldc_w 68953022
    //   186: ixor
    //   187: ldc2_w 82872230
    //   190: l2i
    //   191: ldc_w -707524347
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -1473387321 -> 179, 1178831487 -> 3088
    //   224: dload_0
    //   225: getstatic Perryc.c : I
    //   228: iflt -> 242
    //   231: ldc2_w 783349036
    //   234: l2i
    //   235: ldc_w -384249276
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -1352800236
    //   245: l2i
    //   246: ldc_w -978745770
    //   249: ixor
    //   250: ldc2_w -1516616545
    //   253: l2i
    //   254: ldc_w 568954406
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 284, -660732350 -> 242, 1138486737 -> 3106
    //   284: dload_2
    //   285: getstatic Perryc.1 : I
    //   288: ifeq -> 302
    //   291: ldc2_w -1356070472
    //   294: l2i
    //   295: ldc_w -721910690
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w 773259210
    //   305: l2i
    //   306: ldc_w -1949787008
    //   309: ixor
    //   310: ldc2_w -1363844013
    //   313: l2i
    //   314: ldc_w 1187683554
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 3132, -1817477801 -> 302, 1302436859 -> 344
    //   344: dload #4
    //   346: getstatic Perryc.1 : I
    //   349: ifeq -> 363
    //   352: ldc2_w 505157978
    //   355: l2i
    //   356: ldc_w -249770794
    //   359: ixor
    //   360: goto -> 371
    //   363: ldc2_w 857246811
    //   366: l2i
    //   367: ldc_w 131353778
    //   370: ixor
    //   371: ldc2_w -618495934
    //   374: l2i
    //   375: ldc_w -913965019
    //   378: ixor
    //   379: ixor
    //   380: lookupswitch default -> 3096, -39561749 -> 363, 644366478 -> 408
    //   408: goto -> 412
    //   411: athrow
    //   412: invokevirtual func_70011_f : (DDD)D
    //   415: goto -> 419
    //   418: athrow
    //   419: getstatic Perryc.0 : I
    //   422: ifle -> 436
    //   425: ldc2_w 1834808757
    //   428: l2i
    //   429: ldc_w 1770451975
    //   432: ixor
    //   433: goto -> 444
    //   436: ldc2_w 75205479
    //   439: l2i
    //   440: ldc_w 946281563
    //   443: ixor
    //   444: ldc2_w -1501338025
    //   447: l2i
    //   448: ldc_w -1837865750
    //   451: ixor
    //   452: ixor
    //   453: lookupswitch default -> 3120, 149656961 -> 480, 808256271 -> 436
    //   480: fload #7
    //   482: f2d
    //   483: ddiv
    //   484: getstatic Perryc.1 : I
    //   487: ifeq -> 501
    //   490: ldc2_w -2045214600
    //   493: l2i
    //   494: ldc_w 427976084
    //   497: ixor
    //   498: goto -> 509
    //   501: ldc2_w 1002543709
    //   504: l2i
    //   505: ldc_w 1351450415
    //   508: ixor
    //   509: ldc2_w 2044608689
    //   512: l2i
    //   513: ldc_w 1169977888
    //   516: ixor
    //   517: ixor
    //   518: lookupswitch default -> 544, -2001768765 -> 501, -1543972995 -> 3142
    //   544: dstore #8
    //   546: new net/minecraft/util/math/Vec3d
    //   549: dup
    //   550: getstatic Perryc.0 : I
    //   553: ifle -> 567
    //   556: ldc2_w 1236567948
    //   559: l2i
    //   560: ldc_w 707332203
    //   563: ixor
    //   564: goto -> 575
    //   567: ldc2_w 1268353375
    //   570: l2i
    //   571: ldc_w 595351431
    //   574: ixor
    //   575: ldc2_w -1149200657
    //   578: l2i
    //   579: ldc_w 877170170
    //   582: ixor
    //   583: ixor
    //   584: lookupswitch default -> 612, -329935630 -> 3128, -47132337 -> 567
    //   612: dload_0
    //   613: getstatic Perryc.1 : I
    //   616: ifeq -> 630
    //   619: ldc2_w 1405706210
    //   622: l2i
    //   623: ldc_w 1405325384
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 1671930421
    //   633: l2i
    //   634: ldc_w 1110051831
    //   637: ixor
    //   638: ldc2_w 582423534
    //   641: l2i
    //   642: ldc_w -580593127
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -2554275 -> 3078, 1976724772 -> 630
    //   672: dload_2
    //   673: getstatic Perryc.c : I
    //   676: iflt -> 690
    //   679: ldc2_w -1339496621
    //   682: l2i
    //   683: ldc_w 409411332
    //   686: ixor
    //   687: goto -> 698
    //   690: ldc2_w -527514297
    //   693: l2i
    //   694: ldc_w -1534348422
    //   697: ixor
    //   698: ldc2_w -57807353
    //   701: l2i
    //   702: ldc_w -1722349692
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 3082, -845868588 -> 690, 568303550 -> 732
    //   732: dload #4
    //   734: getstatic Perryc.c : I
    //   737: iflt -> 751
    //   740: ldc2_w 1606952010
    //   743: l2i
    //   744: ldc_w 2061165229
    //   747: ixor
    //   748: goto -> 759
    //   751: ldc2_w 506888260
    //   754: l2i
    //   755: ldc_w -282760333
    //   758: ixor
    //   759: ldc2_w -456379215
    //   762: l2i
    //   763: ldc_w 817458323
    //   766: ixor
    //   767: ixor
    //   768: lookupswitch default -> 3108, -244867387 -> 751, 627487509 -> 796
    //   796: goto -> 800
    //   799: athrow
    //   800: invokespecial <init> : (DDD)V
    //   803: goto -> 807
    //   806: athrow
    //   807: getstatic Perryc.0 : I
    //   810: ifle -> 824
    //   813: ldc2_w -1427460584
    //   816: l2i
    //   817: ldc_w -1855741096
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w 55786925
    //   827: l2i
    //   828: ldc_w 1624302371
    //   831: ixor
    //   832: ldc2_w -689034899
    //   835: l2i
    //   836: ldc_w -172007934
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 868, 416840239 -> 3086, 1129555576 -> 824
    //   868: astore #10
    //   870: ldc2_w 9.786767930863764E306
    //   873: invokestatic doubleToLongBits : (D)J
    //   876: ldc2_w 9199692571716697391
    //   879: lxor
    //   880: invokestatic longBitsToDouble : (J)D
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w 459611239
    //   892: l2i
    //   893: ldc_w -647793609
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -476321842
    //   903: l2i
    //   904: ldc_w -1292386259
    //   907: ixor
    //   908: ldc2_w -1492327312
    //   911: l2i
    //   912: ldc_w 590169638
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 3094, -716339787 -> 944, 1177012742 -> 900
    //   944: dstore #11
    //   946: getstatic Perryc.1 : I
    //   949: ifeq -> 963
    //   952: ldc2_w 1624336932
    //   955: l2i
    //   956: ldc_w 1085087847
    //   959: ixor
    //   960: goto -> 971
    //   963: ldc2_w 1847924511
    //   966: l2i
    //   967: ldc_w 1836814303
    //   970: ixor
    //   971: ldc2_w -991559517
    //   974: l2i
    //   975: ldc_w -1827138531
    //   978: ixor
    //   979: ixor
    //   980: lookupswitch default -> 3068, 1419807870 -> 1008, 2005032701 -> 963
    //   1008: aload #6
    //   1010: getstatic Perryc.0 : I
    //   1013: ifle -> 1027
    //   1016: ldc2_w -254176979
    //   1019: l2i
    //   1020: ldc_w 1122175797
    //   1023: ixor
    //   1024: goto -> 1035
    //   1027: ldc2_w -239522945
    //   1030: l2i
    //   1031: ldc_w 1757755074
    //   1034: ixor
    //   1035: ldc2_w -1010258591
    //   1038: l2i
    //   1039: ldc_w 267432078
    //   1042: ixor
    //   1043: ixor
    //   1044: lookupswitch default -> 1072, 820454977 -> 1027, 2114095095 -> 3074
    //   1072: getfield field_70170_p : Lnet/minecraft/world/World;
    //   1075: getstatic Perryc.1 : I
    //   1078: ifeq -> 1092
    //   1081: ldc2_w 779596037
    //   1084: l2i
    //   1085: ldc_w 40029095
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w -2095754628
    //   1095: l2i
    //   1096: ldc_w -1983998268
    //   1099: ixor
    //   1100: ldc2_w -1996290420
    //   1103: l2i
    //   1104: ldc_w 42009117
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 3092, -2127970263 -> 1136, -1483243981 -> 1092
    //   1136: aload #10
    //   1138: getstatic Perryc.1 : I
    //   1141: ifeq -> 1155
    //   1144: ldc2_w 1674635767
    //   1147: l2i
    //   1148: ldc_w 1528056899
    //   1151: ixor
    //   1152: goto -> 1163
    //   1155: ldc2_w -196044700
    //   1158: l2i
    //   1159: ldc_w 530566503
    //   1162: ixor
    //   1163: ldc2_w 859862993
    //   1166: l2i
    //   1167: ldc_w -1919928317
    //   1170: ixor
    //   1171: ixor
    //   1172: lookupswitch default -> 1200, -2045449626 -> 3122, -1657325354 -> 1155
    //   1200: aload #6
    //   1202: getstatic Perryc.0 : I
    //   1205: ifle -> 1219
    //   1208: ldc2_w 636223474
    //   1211: l2i
    //   1212: ldc_w 1622544381
    //   1215: ixor
    //   1216: goto -> 1227
    //   1219: ldc2_w -262547
    //   1222: l2i
    //   1223: ldc_w -895205873
    //   1226: ixor
    //   1227: ldc2_w 1714636218
    //   1230: l2i
    //   1231: ldc_w -1788856670
    //   1234: ixor
    //   1235: ixor
    //   1236: lookupswitch default -> 1264, -1616273545 -> 1219, -1240562921 -> 3118
    //   1264: goto -> 1268
    //   1267: athrow
    //   1268: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   1271: goto -> 1275
    //   1274: athrow
    //   1275: getstatic Perryc.1 : I
    //   1278: ifeq -> 1292
    //   1281: ldc2_w 220856340
    //   1284: l2i
    //   1285: ldc_w 1282224947
    //   1288: ixor
    //   1289: goto -> 1300
    //   1292: ldc2_w 558632177
    //   1295: l2i
    //   1296: ldc_w -1809123621
    //   1299: ixor
    //   1300: ldc2_w 1415221805
    //   1303: l2i
    //   1304: ldc_w 1623646017
    //   1307: ixor
    //   1308: ixor
    //   1309: lookupswitch default -> 1336, -1776658173 -> 1292, 1977318987 -> 3076
    //   1336: goto -> 1340
    //   1339: athrow
    //   1340: invokevirtual func_72842_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/AxisAlignedBB;)F
    //   1343: goto -> 1347
    //   1346: athrow
    //   1347: f2d
    //   1348: getstatic Perryc.c : I
    //   1351: iflt -> 1365
    //   1354: ldc2_w -301877924
    //   1357: l2i
    //   1358: ldc_w 1949251301
    //   1361: ixor
    //   1362: goto -> 1373
    //   1365: ldc2_w -2023473829
    //   1368: l2i
    //   1369: ldc_w -478551295
    //   1372: ixor
    //   1373: ldc2_w 1985681671
    //   1376: l2i
    //   1377: ldc_w -362943768
    //   1380: ixor
    //   1381: ixor
    //   1382: lookupswitch default -> 3114, -132436555 -> 1408, 103313494 -> 1365
    //   1408: dstore #11
    //   1410: goto -> 1474
    //   1413: getstatic Perryc.1 : I
    //   1416: ifeq -> 1430
    //   1419: ldc2_w -1144710256
    //   1422: l2i
    //   1423: ldc_w -2006768453
    //   1426: ixor
    //   1427: goto -> 1438
    //   1430: ldc2_w 1666557194
    //   1433: l2i
    //   1434: ldc_w -685424274
    //   1437: ixor
    //   1438: ldc2_w -874955927
    //   1441: l2i
    //   1442: ldc_w -441973387
    //   1445: ixor
    //   1446: ixor
    //   1447: lookupswitch default -> 3124, -1711154568 -> 1472, 500629815 -> 1430
    //   1472: astore #13
    //   1474: ldc2_w 8.221119528798718
    //   1477: invokestatic doubleToLongBits : (D)J
    //   1480: ldc2_w 9209985717201102101
    //   1483: lxor
    //   1484: invokestatic longBitsToDouble : (J)D
    //   1487: getstatic Perryc.1 : I
    //   1490: ifeq -> 1504
    //   1493: ldc2_w 54616506
    //   1496: l2i
    //   1497: ldc_w -957501041
    //   1500: ixor
    //   1501: goto -> 1512
    //   1504: ldc2_w -638570380
    //   1507: l2i
    //   1508: ldc_w -156390629
    //   1511: ixor
    //   1512: ldc2_w 597038705
    //   1515: l2i
    //   1516: ldc_w -288592387
    //   1519: ixor
    //   1520: ixor
    //   1521: lookupswitch default -> 1548, 150383545 -> 3134, 1932670483 -> 1504
    //   1548: dload #8
    //   1550: dsub
    //   1551: getstatic Perryc.c : I
    //   1554: iflt -> 1568
    //   1557: ldc2_w 532572502
    //   1560: l2i
    //   1561: ldc_w 2093742006
    //   1564: ixor
    //   1565: goto -> 1576
    //   1568: ldc2_w -1084992659
    //   1571: l2i
    //   1572: ldc_w 439816644
    //   1575: ixor
    //   1576: ldc2_w 1529499576
    //   1579: l2i
    //   1580: ldc_w -1977783570
    //   1583: ixor
    //   1584: ixor
    //   1585: lookupswitch default -> 1612, -1304249418 -> 3058, 842509414 -> 1568
    //   1612: dload #11
    //   1614: dmul
    //   1615: getstatic Perryc.1 : I
    //   1618: ifeq -> 1632
    //   1621: ldc2_w -89410391
    //   1624: l2i
    //   1625: ldc_w 715335557
    //   1628: ixor
    //   1629: goto -> 1640
    //   1632: ldc2_w 863821343
    //   1635: l2i
    //   1636: ldc_w -451639472
    //   1639: ixor
    //   1640: ldc2_w 205005942
    //   1643: l2i
    //   1644: ldc_w 553984836
    //   1647: ixor
    //   1648: ixor
    //   1649: lookupswitch default -> 1676, -46820322 -> 3062, 1096097338 -> 1632
    //   1676: dstore #13
    //   1678: getstatic Perryc.1 : I
    //   1681: ifeq -> 1695
    //   1684: ldc2_w -1215598234
    //   1687: l2i
    //   1688: ldc_w 987237053
    //   1691: ixor
    //   1692: goto -> 1703
    //   1695: ldc2_w 365649638
    //   1698: l2i
    //   1699: ldc_w 906081605
    //   1702: ixor
    //   1703: ldc2_w -1430976638
    //   1706: l2i
    //   1707: ldc_w -1601102896
    //   1710: ixor
    //   1711: ixor
    //   1712: lookupswitch default -> 3072, -2022217847 -> 1695, 703526897 -> 1740
    //   1740: dload #13
    //   1742: getstatic Perryc.1 : I
    //   1745: ifeq -> 1759
    //   1748: ldc2_w 1948207011
    //   1751: l2i
    //   1752: ldc_w 470167141
    //   1755: ixor
    //   1756: goto -> 1767
    //   1759: ldc2_w -1000235052
    //   1762: l2i
    //   1763: ldc_w 998338517
    //   1766: ixor
    //   1767: ldc2_w -1927462857
    //   1770: l2i
    //   1771: ldc_w 1447282013
    //   1774: ixor
    //   1775: ixor
    //   1776: lookupswitch default -> 1804, -1287131988 -> 3116, 531057643 -> 1759
    //   1804: dload #13
    //   1806: dmul
    //   1807: getstatic Perryc.c : I
    //   1810: iflt -> 1824
    //   1813: ldc2_w -2088684776
    //   1816: l2i
    //   1817: ldc_w 874544834
    //   1820: ixor
    //   1821: goto -> 1832
    //   1824: ldc2_w 971752735
    //   1827: l2i
    //   1828: ldc_w -844797671
    //   1831: ixor
    //   1832: ldc2_w -74413668
    //   1835: l2i
    //   1836: ldc_w -167179367
    //   1839: ixor
    //   1840: ixor
    //   1841: lookupswitch default -> 3056, -1170681889 -> 1824, -103338493 -> 1868
    //   1868: dload #13
    //   1870: dadd
    //   1871: ldc2_w 0.4736984510230277
    //   1874: invokestatic doubleToLongBits : (D)J
    //   1877: ldc2_w 9213891031015346979
    //   1880: lxor
    //   1881: invokestatic longBitsToDouble : (J)D
    //   1884: ddiv
    //   1885: ldc2_w 1.634594664291664
    //   1888: invokestatic doubleToLongBits : (D)J
    //   1891: ldc2_w 9216096897986827435
    //   1894: lxor
    //   1895: invokestatic longBitsToDouble : (J)D
    //   1898: dmul
    //   1899: getstatic Perryc.0 : I
    //   1902: ifle -> 1916
    //   1905: ldc2_w -1969360273
    //   1908: l2i
    //   1909: ldc_w -806475679
    //   1912: ixor
    //   1913: goto -> 1924
    //   1916: ldc2_w -93338115
    //   1919: l2i
    //   1920: ldc_w 157171605
    //   1923: ixor
    //   1924: ldc2_w -815786253
    //   1927: l2i
    //   1928: ldc_w 1245115235
    //   1931: ixor
    //   1932: ixor
    //   1933: lookupswitch default -> 1960, -1599762892 -> 1916, -1071300706 -> 3110
    //   1960: fload #7
    //   1962: f2d
    //   1963: dmul
    //   1964: ldc2_w 7.898795739437263
    //   1967: invokestatic doubleToLongBits : (D)J
    //   1970: ldc2_w 9218754491359865650
    //   1973: lxor
    //   1974: invokestatic longBitsToDouble : (J)D
    //   1977: dadd
    //   1978: d2i
    //   1979: i2f
    //   1980: getstatic Perryc.0 : I
    //   1983: ifle -> 1997
    //   1986: ldc2_w 39437170
    //   1989: l2i
    //   1990: ldc_w -783461515
    //   1993: ixor
    //   1994: goto -> 2005
    //   1997: ldc2_w 47899925
    //   2000: l2i
    //   2001: ldc_w 1480460361
    //   2004: ixor
    //   2005: ldc2_w -1391845539
    //   2008: l2i
    //   2009: ldc_w -1404486939
    //   2012: ixor
    //   2013: ixor
    //   2014: lookupswitch default -> 2040, -1449867611 -> 1997, -766003777 -> 3112
    //   2040: fstore #15
    //   2042: ldc2_w 79.67232797991299
    //   2045: invokestatic doubleToLongBits : (D)J
    //   2048: ldc2_w 9197453281128839775
    //   2051: lxor
    //   2052: invokestatic longBitsToDouble : (J)D
    //   2055: getstatic Perryc.0 : I
    //   2058: ifle -> 2072
    //   2061: ldc2_w 1558883415
    //   2064: l2i
    //   2065: ldc_w 1937761462
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w -819543502
    //   2075: l2i
    //   2076: ldc_w 1043159192
    //   2079: ixor
    //   2080: ldc2_w -1204949349
    //   2083: l2i
    //   2084: ldc_w 847456460
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 3064, -1522823498 -> 2072, 2074434813 -> 2116
    //   2116: dstore #16
    //   2118: getstatic Perryc.c : I
    //   2121: iflt -> 2135
    //   2124: ldc2_w -1908486658
    //   2127: l2i
    //   2128: ldc_w -56254219
    //   2131: ixor
    //   2132: goto -> 2143
    //   2135: ldc2_w -1841051365
    //   2138: l2i
    //   2139: ldc_w 1475825106
    //   2142: ixor
    //   2143: ldc2_w -746085288
    //   2146: l2i
    //   2147: ldc_w -1694947781
    //   2150: ixor
    //   2151: ixor
    //   2152: lookupswitch default -> 3130, -1932917078 -> 2180, 1004924776 -> 2135
    //   2180: aload #6
    //   2182: instanceof net/minecraft/entity/EntityLivingBase
    //   2185: ifeq -> 2199
    //   2188: ldc2_w 865727400
    //   2191: l2i
    //   2192: ldc_w 1104116374
    //   2195: ixor
    //   2196: goto -> 2207
    //   2199: ldc2_w -1788665702
    //   2202: l2i
    //   2203: ldc_w -415913893
    //   2206: ixor
    //   2207: ldc2_w 591808218
    //   2210: l2i
    //   2211: ldc_w 1165274395
    //   2214: ixor
    //   2215: ixor
    //   2216: tableswitch default -> 2188, 342123263 -> 2240, 342123264 -> 2990
    //   2240: getstatic Perryc.c : I
    //   2243: iflt -> 2257
    //   2246: ldc2_w -1710563488
    //   2249: l2i
    //   2250: ldc_w -1106410802
    //   2253: ixor
    //   2254: goto -> 2265
    //   2257: ldc2_w 894684476
    //   2260: l2i
    //   2261: ldc_w -698320121
    //   2264: ixor
    //   2265: ldc2_w 824988462
    //   2268: l2i
    //   2269: ldc_w -397242358
    //   2272: ixor
    //   2273: ixor
    //   2274: lookupswitch default -> 3070, -42361206 -> 2257, 978154783 -> 2300
    //   2300: aload #6
    //   2302: checkcast net/minecraft/entity/EntityLivingBase
    //   2305: getstatic Perryc.1 : I
    //   2308: ifeq -> 2322
    //   2311: ldc2_w 1597249589
    //   2314: l2i
    //   2315: ldc_w 1057836651
    //   2318: ixor
    //   2319: goto -> 2330
    //   2322: ldc2_w 1725354516
    //   2325: l2i
    //   2326: ldc_w -1421216260
    //   2329: ixor
    //   2330: ldc2_w -281752869
    //   2333: l2i
    //   2334: ldc_w 327158790
    //   2337: ixor
    //   2338: ixor
    //   2339: lookupswitch default -> 2364, -1668444029 -> 3084, 21787376 -> 2322
    //   2364: fload #15
    //   2366: getstatic Perryc.0 : I
    //   2369: ifle -> 2383
    //   2372: ldc2_w 1643770772
    //   2375: l2i
    //   2376: ldc_w -75977692
    //   2379: ixor
    //   2380: goto -> 2391
    //   2383: ldc2_w -1752054136
    //   2386: l2i
    //   2387: ldc_w 630694945
    //   2390: ixor
    //   2391: ldc2_w 979209468
    //   2394: l2i
    //   2395: ldc_w -1304849283
    //   2398: ixor
    //   2399: ixor
    //   2400: lookupswitch default -> 2428, -186166798 -> 2383, 317015857 -> 3136
    //   2428: goto -> 2432
    //   2431: athrow
    //   2432: invokestatic getDamageMultiplied : (F)F
    //   2435: goto -> 2439
    //   2438: athrow
    //   2439: new net/minecraft/world/Explosion
    //   2442: dup
    //   2443: getstatic Perryc.0 : I
    //   2446: ifle -> 2460
    //   2449: ldc2_w -482244992
    //   2452: l2i
    //   2453: ldc_w 2109062410
    //   2456: ixor
    //   2457: goto -> 2468
    //   2460: ldc2_w 1639510886
    //   2463: l2i
    //   2464: ldc_w 1144793542
    //   2467: ixor
    //   2468: ldc2_w -1777726989
    //   2471: l2i
    //   2472: ldc_w 928772474
    //   2475: ixor
    //   2476: ixor
    //   2477: lookupswitch default -> 3138, -2066406871 -> 2504, 1067827971 -> 2460
    //   2504: getstatic bigname/zprestige/webhack/util/DamageUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2507: getstatic Perryc.c : I
    //   2510: iflt -> 2524
    //   2513: ldc2_w 654045837
    //   2516: l2i
    //   2517: ldc_w -1871171665
    //   2520: ixor
    //   2521: goto -> 2532
    //   2524: ldc2_w 1605580345
    //   2527: l2i
    //   2528: ldc_w -1898944289
    //   2531: ixor
    //   2532: ldc2_w -2099011606
    //   2535: l2i
    //   2536: ldc_w -856844471
    //   2539: ixor
    //   2540: ixor
    //   2541: lookupswitch default -> 3098, -1620224443 -> 2568, -124922495 -> 2524
    //   2568: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2571: aconst_null
    //   2572: getstatic Perryc.1 : I
    //   2575: ifeq -> 2589
    //   2578: ldc2_w 1457249922
    //   2581: l2i
    //   2582: ldc_w 1969617043
    //   2585: ixor
    //   2586: goto -> 2597
    //   2589: ldc2_w 1318494487
    //   2592: l2i
    //   2593: ldc_w 126195381
    //   2596: ixor
    //   2597: ldc2_w 1761338633
    //   2600: l2i
    //   2601: ldc_w 155761237
    //   2604: ixor
    //   2605: ixor
    //   2606: lookupswitch default -> 2632, 204566560 -> 2589, 1108179277 -> 3060
    //   2632: dload_0
    //   2633: getstatic Perryc.c : I
    //   2636: iflt -> 2650
    //   2639: ldc2_w -1513694373
    //   2642: l2i
    //   2643: ldc_w -1079446575
    //   2646: ixor
    //   2647: goto -> 2658
    //   2650: ldc2_w -1984363217
    //   2653: l2i
    //   2654: ldc_w 998290726
    //   2657: ixor
    //   2658: ldc2_w -2063441751
    //   2661: l2i
    //   2662: ldc_w 1458382981
    //   2665: ixor
    //   2666: ixor
    //   2667: lookupswitch default -> 2692, -914267994 -> 3080, 37297992 -> 2650
    //   2692: dload_2
    //   2693: getstatic Perryc.0 : I
    //   2696: ifle -> 2710
    //   2699: ldc2_w 1872783069
    //   2702: l2i
    //   2703: ldc_w -1889886962
    //   2706: ixor
    //   2707: goto -> 2718
    //   2710: ldc2_w -1656799031
    //   2713: l2i
    //   2714: ldc_w -720076812
    //   2717: ixor
    //   2718: ldc2_w -160232044
    //   2721: l2i
    //   2722: ldc_w 1714293122
    //   2725: ixor
    //   2726: ixor
    //   2727: lookupswitch default -> 2752, 575191419 -> 2710, 1890058181 -> 3104
    //   2752: dload #4
    //   2754: ldc_w 0.49441263
    //   2757: invokestatic floatToIntBits : (F)I
    //   2760: ldc_w 2117936039
    //   2763: ixor
    //   2764: invokestatic intBitsToFloat : (I)F
    //   2767: ldc2_w -22917061
    //   2770: l2i
    //   2771: ldc_w -22917061
    //   2774: ixor
    //   2775: ldc2_w 265571648
    //   2778: l2i
    //   2779: ldc_w 265571649
    //   2782: ixor
    //   2783: getstatic Perryc.c : I
    //   2786: iflt -> 2800
    //   2789: ldc2_w 289441569
    //   2792: l2i
    //   2793: ldc_w 184050184
    //   2796: ixor
    //   2797: goto -> 2808
    //   2800: ldc2_w 1037881011
    //   2803: l2i
    //   2804: ldc_w -1121659650
    //   2807: ixor
    //   2808: ldc2_w -823574540
    //   2811: l2i
    //   2812: ldc_w -539711913
    //   2815: ixor
    //   2816: ixor
    //   2817: lookupswitch default -> 2844, -161810424 -> 2800, 176520330 -> 3100
    //   2844: goto -> 2848
    //   2847: athrow
    //   2848: invokespecial <init> : (Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;DDDFZZ)V
    //   2851: goto -> 2855
    //   2854: athrow
    //   2855: getstatic Perryc.0 : I
    //   2858: ifle -> 2872
    //   2861: ldc2_w -612632324
    //   2864: l2i
    //   2865: ldc_w -1854650117
    //   2868: ixor
    //   2869: goto -> 2880
    //   2872: ldc2_w -245907432
    //   2875: l2i
    //   2876: ldc_w 21436908
    //   2879: ixor
    //   2880: ldc2_w -1257447165
    //   2883: l2i
    //   2884: ldc_w -75885951
    //   2887: ixor
    //   2888: ixor
    //   2889: lookupswitch default -> 2916, -31459213 -> 2872, 75056005 -> 3090
    //   2916: goto -> 2920
    //   2919: athrow
    //   2920: invokestatic getBlastReduction : (Lnet/minecraft/entity/EntityLivingBase;FLnet/minecraft/world/Explosion;)F
    //   2923: goto -> 2927
    //   2926: athrow
    //   2927: f2d
    //   2928: getstatic Perryc.c : I
    //   2931: iflt -> 2945
    //   2934: ldc2_w 53297710
    //   2937: l2i
    //   2938: ldc_w -942263651
    //   2941: ixor
    //   2942: goto -> 2953
    //   2945: ldc2_w -929619001
    //   2948: l2i
    //   2949: ldc_w -741946530
    //   2952: ixor
    //   2953: ldc2_w 1472481119
    //   2956: l2i
    //   2957: ldc_w -1185025381
    //   2960: ixor
    //   2961: ixor
    //   2962: lookupswitch default -> 3066, -171418275 -> 2988, 711116151 -> 2945
    //   2988: dstore #16
    //   2990: getstatic Perryc.c : I
    //   2993: iflt -> 3007
    //   2996: ldc2_w 1609725813
    //   2999: l2i
    //   3000: ldc_w 678142955
    //   3003: ixor
    //   3004: goto -> 3015
    //   3007: ldc2_w -283481797
    //   3010: l2i
    //   3011: ldc_w -1555383091
    //   3014: ixor
    //   3015: ldc2_w -1713747961
    //   3018: l2i
    //   3019: ldc_w -1200735172
    //   3022: ixor
    //   3023: ixor
    //   3024: lookupswitch default -> 3052, 134767327 -> 3007, 1445830821 -> 3126
    //   3052: dload #16
    //   3054: d2f
    //   3055: freturn
    //   3056: aconst_null
    //   3057: athrow
    //   3058: aconst_null
    //   3059: athrow
    //   3060: aconst_null
    //   3061: athrow
    //   3062: aconst_null
    //   3063: athrow
    //   3064: aconst_null
    //   3065: athrow
    //   3066: aconst_null
    //   3067: athrow
    //   3068: aconst_null
    //   3069: athrow
    //   3070: aconst_null
    //   3071: athrow
    //   3072: aconst_null
    //   3073: athrow
    //   3074: aconst_null
    //   3075: athrow
    //   3076: aconst_null
    //   3077: athrow
    //   3078: aconst_null
    //   3079: athrow
    //   3080: aconst_null
    //   3081: athrow
    //   3082: aconst_null
    //   3083: athrow
    //   3084: aconst_null
    //   3085: athrow
    //   3086: aconst_null
    //   3087: athrow
    //   3088: aconst_null
    //   3089: athrow
    //   3090: aconst_null
    //   3091: athrow
    //   3092: aconst_null
    //   3093: athrow
    //   3094: aconst_null
    //   3095: athrow
    //   3096: aconst_null
    //   3097: athrow
    //   3098: aconst_null
    //   3099: athrow
    //   3100: aconst_null
    //   3101: athrow
    //   3102: aconst_null
    //   3103: athrow
    //   3104: aconst_null
    //   3105: athrow
    //   3106: aconst_null
    //   3107: athrow
    //   3108: aconst_null
    //   3109: athrow
    //   3110: aconst_null
    //   3111: athrow
    //   3112: aconst_null
    //   3113: athrow
    //   3114: aconst_null
    //   3115: athrow
    //   3116: aconst_null
    //   3117: athrow
    //   3118: aconst_null
    //   3119: athrow
    //   3120: aconst_null
    //   3121: athrow
    //   3122: aconst_null
    //   3123: athrow
    //   3124: aconst_null
    //   3125: athrow
    //   3126: aconst_null
    //   3127: athrow
    //   3128: aconst_null
    //   3129: athrow
    //   3130: aconst_null
    //   3131: athrow
    //   3132: aconst_null
    //   3133: athrow
    //   3134: aconst_null
    //   3135: athrow
    //   3136: aconst_null
    //   3137: athrow
    //   3138: aconst_null
    //   3139: athrow
    //   3140: aconst_null
    //   3141: athrow
    //   3142: aconst_null
    //   3143: athrow
    //   3144: pop
    //   3145: goto -> 24
    //   3148: pop
    //   3149: aconst_null
    //   3150: goto -> 3144
    //   3153: dup
    //   3154: ifnull -> 3144
    //   3157: checkcast java/lang/Throwable
    //   3160: athrow
    //   3161: dup
    //   3162: ifnull -> 3148
    //   3165: checkcast java/lang/Throwable
    //   3168: athrow
    //   3169: aconst_null
    //   3170: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3032	0	posX	D
    //   24	3032	2	posY	D
    //   24	3032	4	posZ	D
    //   24	3032	6	entity	Lnet/minecraft/entity/Entity;
    //   98	2958	7	doubleExplosionSize	F
    //   546	2510	8	distancedsize	D
    //   870	2186	10	vec3d	Lnet/minecraft/util/math/Vec3d;
    //   946	2110	11	blockDensity	D
    //   1678	1378	13	v	D
    //   2042	1014	15	damage	F
    //   2118	938	16	finald	D
    // Exception table:
    //   from	to	target	type
    //   8	20	3153	finally
    //   411	418	418	finally
    //   412	418	418	java/lang/ArithmeticException
    //   412	418	3	finally
    //   412	418	418	java/lang/UnsupportedOperationException
    //   412	418	411	finally
    //   799	806	806	finally
    //   799	806	806	java/lang/RuntimeException
    //   799	806	799	finally
    //   800	806	806	finally
    //   800	806	3	java/lang/ArithmeticException
    //   946	1339	1413	java/lang/Exception
    //   1267	1274	1274	finally
    //   1267	1274	3	java/lang/NegativeArraySizeException
    //   1267	1274	1274	finally
    //   1268	1274	1267	java/lang/AssertionError
    //   1268	1274	3	java/lang/NegativeArraySizeException
    //   1340	1346	1346	finally
    //   1340	1346	1346	finally
    //   1340	1346	3	finally
    //   1340	1346	3	java/lang/IllegalStateException
    //   1340	1346	1346	finally
    //   1340	1410	1413	java/lang/Exception
    //   2431	2438	2438	finally
    //   2431	2438	2431	java/lang/NumberFormatException
    //   2432	2438	3	finally
    //   2432	2438	3	finally
    //   2432	2438	2431	finally
    //   2847	2854	2854	finally
    //   2847	2854	3	java/lang/IllegalArgumentException
    //   2847	2854	3	finally
    //   2848	2854	3	java/lang/IllegalStateException
    //   2848	2854	2847	finally
    //   2919	2926	2926	finally
    //   2919	2926	2926	finally
    //   2919	2926	2926	finally
    //   2919	2926	2919	java/lang/AssertionError
    //   2920	2926	2926	java/lang/StringIndexOutOfBoundsException
    //   3153	3161	3153	finally
    //   3169	3171	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static float getBlastReduction(EntityLivingBase paramEntityLivingBase, float paramFloat, Explosion paramExplosion) {
    return Perry1.5K(null, (int)-438596923L ^ 0xE65BF4C8, paramEntityLivingBase, paramFloat, paramExplosion);
  }
  
  public static boolean hasDurability(ItemStack paramItemStack) {
    return Perry1.0v(null, (int)-847892855L ^ 0xD89D3684, paramItemStack);
  }
  
  public static int getCooldownByWeapon(EntityPlayer paramEntityPlayer) {
    return Perry1.3d(null, (int)-1169885927L ^ 0xA75BCA62, paramEntityPlayer);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static int getRoundedDamage(ItemStack paramItemStack) {
    return Perry1.0n(null, (int)615174611L ^ 0x2020A6C9, paramItemStack);
  }
  
  public static boolean isArmorLow(EntityPlayer player, int durability) {
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
  
  public static int getItemDamage(ItemStack paramItemStack) {
    return Perry1.0o(null, (int)-1258537972L ^ 0xB54DF15B, paramItemStack);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\DamageUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */