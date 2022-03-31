package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class CombatUtil implements Globals {
  public CombatUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -35170097
    //   9: l2i
    //   10: ldc 1199308688
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1493227817
    //   19: l2i
    //   20: ldc -1995488594
    //   22: ixor
    //   23: ldc2_w 1847597108
    //   26: l2i
    //   27: ldc 2053179868
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 122, -1361201481 -> 16, -1001485713 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 1021719017
    //   66: l2i
    //   67: ldc 1586127879
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 347004122
    //   76: l2i
    //   77: ldc -425062172
    //   79: ixor
    //   80: ldc2_w 1309846391
    //   83: l2i
    //   84: ldc 801063767
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 120, -1817631714 -> 116, 63028686 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/CombatUtil;
  }
  
  public static int isInHoleInt(EntityPlayer entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 881
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 873
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 865
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 44
    //   34: ldc2_w -954201275
    //   37: l2i
    //   38: ldc 1750632193
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w 1838788941
    //   47: l2i
    //   48: ldc -2050928511
    //   50: ixor
    //   51: ldc2_w -987328358
    //   54: l2i
    //   55: ldc 1745566895
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1114895991 -> 44, 39133297 -> 836
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 101
    //   91: ldc2_w 463444926
    //   94: l2i
    //   95: ldc 1413552490
    //   97: ixor
    //   98: goto -> 108
    //   101: ldc2_w 890865687
    //   104: l2i
    //   105: ldc -1449353307
    //   107: ixor
    //   108: ldc2_w 1570369390
    //   111: l2i
    //   112: ldc 2003026753
    //   114: ixor
    //   115: ixor
    //   116: lookupswitch default -> 848, -1233175651 -> 144, 1696902907 -> 101
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 171
    //   161: ldc2_w -644107973
    //   164: l2i
    //   165: ldc 1731018064
    //   167: ixor
    //   168: goto -> 178
    //   171: ldc2_w 1672946459
    //   174: l2i
    //   175: ldc -1266240261
    //   177: ixor
    //   178: ldc2_w 2112647150
    //   181: l2i
    //   182: ldc 1449532438
    //   184: ixor
    //   185: ixor
    //   186: lookupswitch default -> 846, -1791164525 -> 171, -54795240 -> 212
    //   212: goto -> 216
    //   215: athrow
    //   216: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   219: goto -> 223
    //   222: athrow
    //   223: getstatic Perryc.c : I
    //   226: iflt -> 239
    //   229: ldc2_w -1436073704
    //   232: l2i
    //   233: ldc -572062709
    //   235: ixor
    //   236: goto -> 246
    //   239: ldc2_w -904992771
    //   242: l2i
    //   243: ldc -1012288128
    //   245: ixor
    //   246: ldc2_w -1728763329
    //   249: l2i
    //   250: ldc -1054772444
    //   252: ixor
    //   253: ixor
    //   254: lookupswitch default -> 280, -839309392 -> 239, 777264136 -> 840
    //   280: astore_1
    //   281: getstatic Perryc.0 : I
    //   284: ifle -> 297
    //   287: ldc2_w 1532030140
    //   290: l2i
    //   291: ldc 1442562596
    //   293: ixor
    //   294: goto -> 304
    //   297: ldc2_w 2095137139
    //   300: l2i
    //   301: ldc -1200588496
    //   303: ixor
    //   304: ldc2_w -1027868334
    //   307: l2i
    //   308: ldc -424464023
    //   310: ixor
    //   311: ixor
    //   312: lookupswitch default -> 852, -526782344 -> 340, 715384483 -> 297
    //   340: aload_1
    //   341: getstatic Perryc.1 : I
    //   344: ifeq -> 357
    //   347: ldc2_w -1427637341
    //   350: l2i
    //   351: ldc -922372397
    //   353: ixor
    //   354: goto -> 364
    //   357: ldc2_w 2090507697
    //   360: l2i
    //   361: ldc 1836321749
    //   363: ixor
    //   364: ldc2_w -708086642
    //   367: l2i
    //   368: ldc 787756459
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 400, -1730343851 -> 844, 103160248 -> 357
    //   400: goto -> 404
    //   403: athrow
    //   404: invokestatic isBedrockHole : (Lnet/minecraft/util/math/BlockPos;)Z
    //   407: goto -> 411
    //   410: athrow
    //   411: ifeq -> 424
    //   414: ldc2_w 1822139874
    //   417: l2i
    //   418: ldc -1586767196
    //   420: ixor
    //   421: goto -> 431
    //   424: ldc2_w 719521324
    //   427: l2i
    //   428: ldc -418154133
    //   430: ixor
    //   431: ldc2_w -1688298745
    //   434: l2i
    //   435: ldc 1831958097
    //   437: ixor
    //   438: ixor
    //   439: tableswitch default -> 414, 1000313360 -> 460, 1000313361 -> 468
    //   460: ldc2_w -1686692398
    //   463: l2i
    //   464: ldc -1686692397
    //   466: ixor
    //   467: ireturn
    //   468: getstatic Perryc.c : I
    //   471: iflt -> 484
    //   474: ldc2_w 70044973
    //   477: l2i
    //   478: ldc 474944360
    //   480: ixor
    //   481: goto -> 491
    //   484: ldc2_w -2122160542
    //   487: l2i
    //   488: ldc -150161241
    //   490: ixor
    //   491: ldc2_w -1332719684
    //   494: l2i
    //   495: ldc 331818315
    //   497: ixor
    //   498: ixor
    //   499: lookupswitch default -> 524, -1154173774 -> 854, 1070774586 -> 484
    //   524: aload_1
    //   525: getstatic Perryc.1 : I
    //   528: ifeq -> 541
    //   531: ldc2_w -1350454023
    //   534: l2i
    //   535: ldc 334619073
    //   537: ixor
    //   538: goto -> 548
    //   541: ldc2_w 552340205
    //   544: l2i
    //   545: ldc -1537776208
    //   547: ixor
    //   548: ldc2_w -325726775
    //   551: l2i
    //   552: ldc 1979596983
    //   554: ixor
    //   555: ixor
    //   556: lookupswitch default -> 584, 301692315 -> 541, 622581830 -> 838
    //   584: goto -> 588
    //   587: athrow
    //   588: invokestatic isObbyHole : (Lnet/minecraft/util/math/BlockPos;)Z
    //   591: goto -> 595
    //   594: athrow
    //   595: ifne -> 608
    //   598: ldc2_w 479085888
    //   601: l2i
    //   602: ldc -1866315538
    //   604: ixor
    //   605: goto -> 615
    //   608: ldc2_w 1353158693
    //   611: l2i
    //   612: ldc -588538486
    //   614: ixor
    //   615: ldc2_w 329235342
    //   618: l2i
    //   619: ldc 871264420
    //   621: ixor
    //   622: ixor
    //   623: tableswitch default -> 598, -1405237628 -> 644, -1405237627 -> 820
    //   644: getstatic Perryc.0 : I
    //   647: ifle -> 660
    //   650: ldc2_w 124922817
    //   653: l2i
    //   654: ldc -2143845681
    //   656: ixor
    //   657: goto -> 667
    //   660: ldc2_w 213543065
    //   663: l2i
    //   664: ldc 440123480
    //   666: ixor
    //   667: ldc2_w 561226681
    //   670: l2i
    //   671: ldc 1861480244
    //   673: ixor
    //   674: ixor
    //   675: lookupswitch default -> 700, -1287247205 -> 660, -926554749 -> 850
    //   700: aload_1
    //   701: getstatic Perryc.1 : I
    //   704: ifeq -> 717
    //   707: ldc2_w 461627242
    //   710: l2i
    //   711: ldc 214890053
    //   713: ixor
    //   714: goto -> 724
    //   717: ldc2_w -351882209
    //   720: l2i
    //   721: ldc 943466717
    //   723: ixor
    //   724: ldc2_w 1000212098
    //   727: l2i
    //   728: ldc -1785094751
    //   730: ixor
    //   731: ixor
    //   732: lookupswitch default -> 842, -1186287092 -> 717, 2101151713 -> 760
    //   760: goto -> 764
    //   763: athrow
    //   764: invokestatic isBothHole : (Lnet/minecraft/util/math/BlockPos;)Z
    //   767: goto -> 771
    //   770: athrow
    //   771: ifeq -> 784
    //   774: ldc2_w -1178962279
    //   777: l2i
    //   778: ldc -256347278
    //   780: ixor
    //   781: goto -> 791
    //   784: ldc2_w -730644417
    //   787: l2i
    //   788: ldc -1653520949
    //   790: ixor
    //   791: ldc2_w 1763064776
    //   794: l2i
    //   795: ldc -1101405332
    //   797: ixor
    //   798: ixor
    //   799: tableswitch default -> 774, -1639064241 -> 820, -1639064240 -> 828
    //   820: ldc2_w -1515529150
    //   823: l2i
    //   824: ldc -1515529152
    //   826: ixor
    //   827: ireturn
    //   828: ldc2_w 1539044621
    //   831: l2i
    //   832: ldc 1539044621
    //   834: ixor
    //   835: ireturn
    //   836: aconst_null
    //   837: athrow
    //   838: aconst_null
    //   839: athrow
    //   840: aconst_null
    //   841: athrow
    //   842: aconst_null
    //   843: athrow
    //   844: aconst_null
    //   845: athrow
    //   846: aconst_null
    //   847: athrow
    //   848: aconst_null
    //   849: athrow
    //   850: aconst_null
    //   851: athrow
    //   852: aconst_null
    //   853: athrow
    //   854: aconst_null
    //   855: athrow
    //   856: pop
    //   857: goto -> 24
    //   860: pop
    //   861: aconst_null
    //   862: goto -> 856
    //   865: dup
    //   866: ifnull -> 856
    //   869: checkcast java/lang/Throwable
    //   872: athrow
    //   873: dup
    //   874: ifnull -> 860
    //   877: checkcast java/lang/Throwable
    //   880: athrow
    //   881: aconst_null
    //   882: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	812	0	entity	Lnet/minecraft/entity/player/EntityPlayer;
    //   281	555	1	playerPos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	865	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	java/util/ConcurrentModificationException
    //   148	154	154	finally
    //   215	222	222	finally
    //   215	222	222	java/lang/ArithmeticException
    //   216	222	215	finally
    //   216	222	222	java/lang/AssertionError
    //   216	222	222	finally
    //   403	410	410	finally
    //   403	410	3	finally
    //   404	410	3	finally
    //   404	410	403	java/lang/IllegalArgumentException
    //   404	410	410	java/lang/ClassCastException
    //   587	594	594	finally
    //   587	594	594	finally
    //   587	594	594	finally
    //   588	594	594	finally
    //   588	594	587	java/lang/NegativeArraySizeException
    //   763	770	770	finally
    //   763	770	770	java/lang/UnsupportedOperationException
    //   763	770	763	finally
    //   764	770	3	finally
    //   764	770	770	finally
    //   865	873	865	finally
    //   881	883	3	java/util/NoSuchElementException
  }
  
  public static boolean isBlockValid(BlockPos paramBlockPos) {
    return Perry1.6f(null, (int)1727456031L ^ 0x13AA5307, paramBlockPos);
  }
  
  public static boolean isObbyHole(BlockPos paramBlockPos) {
    return Perry1.6o(null, (int)1077684992L ^ 0x37795368, paramBlockPos);
  }
  
  public static EntityPlayer getTarget(float range) {
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
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static boolean isBothHole(BlockPos paramBlockPos) {
    return Perry1.6i(null, (int)-1189411680L ^ 0xE29D6039, paramBlockPos);
  }
  
  public static boolean isBedrockHole(BlockPos paramBlockPos) {
    return Perry1.6q(null, (int)1565921723L ^ 0x721948E6, paramBlockPos);
  }
  
  public static boolean isInHole(EntityPlayer entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 585
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 577
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 569
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 687232297
    //   37: l2i
    //   38: ldc_w -1804748785
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1738803588
    //   48: l2i
    //   49: ldc_w -674918501
    //   52: ixor
    //   53: ldc2_w 307129027
    //   56: l2i
    //   57: ldc_w 861088326
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1652118109 -> 548, 621871826 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w 1719346395
    //   98: l2i
    //   99: ldc_w 134425941
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -740613807
    //   109: l2i
    //   110: ldc_w 1112782302
    //   113: ixor
    //   114: ldc2_w 2032801561
    //   117: l2i
    //   118: ldc_w 1648516506
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, 36261896 -> 106, 1964000013 -> 546
    //   148: getfield field_70165_t : D
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w -1857076471
    //   160: l2i
    //   161: ldc_w 1869330687
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1544603518
    //   171: l2i
    //   172: ldc_w -495926128
    //   175: ixor
    //   176: ldc2_w 1303528137
    //   179: l2i
    //   180: ldc_w 283917210
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 556, -1552252251 -> 168, 482444609 -> 212
    //   212: aload_0
    //   213: getstatic Perryc.1 : I
    //   216: ifeq -> 230
    //   219: ldc2_w 96294239
    //   222: l2i
    //   223: ldc_w 1114706932
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 1581528009
    //   233: l2i
    //   234: ldc_w 785754275
    //   237: ixor
    //   238: ldc2_w -1614582058
    //   241: l2i
    //   242: ldc_w 1927401157
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 554, -1649198215 -> 272, -1427183944 -> 230
    //   272: getfield field_70163_u : D
    //   275: getstatic Perryc.0 : I
    //   278: ifle -> 292
    //   281: ldc2_w -1361707787
    //   284: l2i
    //   285: ldc_w -1644829713
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w -181360258
    //   295: l2i
    //   296: ldc_w -554965246
    //   299: ixor
    //   300: ldc2_w -1117945586
    //   303: l2i
    //   304: ldc_w 550465590
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 336, -1364005342 -> 558, 663776476 -> 292
    //   336: aload_0
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w 1579946025
    //   346: l2i
    //   347: ldc_w -1908194107
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -1551308831
    //   357: l2i
    //   358: ldc_w -2007217470
    //   361: ixor
    //   362: ldc2_w -1673672615
    //   365: l2i
    //   366: ldc_w 202059520
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 396, 1079620533 -> 550, 1509749532 -> 354
    //   396: getfield field_70161_v : D
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 1233972898
    //   408: l2i
    //   409: ldc_w -808221488
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -971206598
    //   419: l2i
    //   420: ldc_w -104407540
    //   423: ixor
    //   424: ldc2_w -1061877958
    //   427: l2i
    //   428: ldc_w 1939965191
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 544, -1932604405 -> 460, 894167119 -> 416
    //   460: goto -> 464
    //   463: athrow
    //   464: invokespecial <init> : (DDD)V
    //   467: goto -> 471
    //   470: athrow
    //   471: getstatic Perryc.0 : I
    //   474: ifle -> 488
    //   477: ldc2_w 1415382849
    //   480: l2i
    //   481: ldc_w -1939539206
    //   484: ixor
    //   485: goto -> 496
    //   488: ldc2_w 776871989
    //   491: l2i
    //   492: ldc_w -1028989464
    //   495: ixor
    //   496: ldc2_w -1920746629
    //   499: l2i
    //   500: ldc_w 71526140
    //   503: ixor
    //   504: ixor
    //   505: lookupswitch default -> 532, 1375281212 -> 552, 2100566537 -> 488
    //   532: goto -> 536
    //   535: athrow
    //   536: invokestatic isBlockValid : (Lnet/minecraft/util/math/BlockPos;)Z
    //   539: goto -> 543
    //   542: athrow
    //   543: ireturn
    //   544: aconst_null
    //   545: athrow
    //   546: aconst_null
    //   547: athrow
    //   548: aconst_null
    //   549: athrow
    //   550: aconst_null
    //   551: athrow
    //   552: aconst_null
    //   553: athrow
    //   554: aconst_null
    //   555: athrow
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
    //   560: pop
    //   561: goto -> 24
    //   564: pop
    //   565: aconst_null
    //   566: goto -> 560
    //   569: dup
    //   570: ifnull -> 560
    //   573: checkcast java/lang/Throwable
    //   576: athrow
    //   577: dup
    //   578: ifnull -> 564
    //   581: checkcast java/lang/Throwable
    //   584: athrow
    //   585: aconst_null
    //   586: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	520	0	entity	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   8	20	569	java/lang/NegativeArraySizeException
    //   464	470	470	finally
    //   464	470	470	finally
    //   464	470	3	finally
    //   464	470	470	finally
    //   464	470	470	finally
    //   535	542	542	finally
    //   536	542	3	finally
    //   536	542	535	java/lang/StringIndexOutOfBoundsException
    //   536	542	542	finally
    //   536	542	3	java/lang/NumberFormatException
    //   569	577	569	finally
    //   585	587	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\CombatUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */