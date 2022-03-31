package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class Viewmodel extends Module {
  public Setting<Float> offhandX;
  
  public Setting<Float> offsetZ;
  
  public Setting<Float> sizeY;
  
  public Setting<Float> offhandZ;
  
  public Setting<Float> sizeX;
  
  public Setting<Float> offhandY;
  
  public Setting<Float> offsetY;
  
  public static Viewmodel INSTANCE;
  
  public Setting<Float> sizeZ;
  
  public Setting<Float> offsetX;
  
  public static Viewmodel getINSTANCE() {
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
  
  public void setInstance() {
    Perry1.46(this, (int)-19306845L ^ 0xC433090F);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Render/Viewmodel
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 20
    //   10: ldc2_w 1525457416
    //   13: l2i
    //   14: ldc -1423094385
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w 2035363063
    //   23: l2i
    //   24: ldc 138781532
    //   26: ixor
    //   27: ldc2_w -1331920979
    //   30: l2i
    //   31: ldc 135192260
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 124, -913953086 -> 60, 1230196462 -> 20
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.0 : I
    //   66: ifle -> 79
    //   69: ldc2_w -1042369809
    //   72: l2i
    //   73: ldc 504547106
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w -2054729531
    //   82: l2i
    //   83: ldc 897531702
    //   85: ixor
    //   86: ldc2_w 1852090008
    //   89: l2i
    //   90: ldc 1532318026
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 120, -1397600601 -> 79, -352484833 -> 126
    //   120: putstatic bigname/zprestige/webhack/features/modules/Render/Viewmodel.INSTANCE : Lbigname/zprestige/webhack/features/modules/Render/Viewmodel;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public Viewmodel() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1793891614
    //   9: l2i
    //   10: ldc -726098722
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1025360417
    //   19: l2i
    //   20: ldc 1489506145
    //   22: ixor
    //   23: ldc2_w 1886713759
    //   26: l2i
    //   27: ldc 2069695236
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 6044, -1862021595 -> 56, -1250034341 -> 16
    //   56: aload_0
    //   57: ldc '흯㌚휾㶠擓㧪๽꫹蹯'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -1804021028
    //   68: l2i
    //   69: ldc 263894605
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -28489845
    //   78: l2i
    //   79: ldc 845381036
    //   81: ixor
    //   82: ldc2_w -1772828078
    //   85: l2i
    //   86: ldc 278583509
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, 487355926 -> 6106, 1958382054 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '흺㌛휺㶹擙㧠๪ꪼ蹷㠯濂ਲ਼᪁煤벖䨯辖ཆꝫ禶墽侷㶆䚶㬉荪ᣊ爜'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w -1148110336
    //   130: l2i
    //   131: ldc -550557687
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 959039146
    //   140: l2i
    //   141: ldc 1818023412
    //   143: ixor
    //   144: ldc2_w 865936973
    //   147: l2i
    //   148: ldc -83061346
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -1913186526 -> 137, -1406164518 -> 6074
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w 273221906
    //   192: l2i
    //   193: ldc -1632163201
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -6792820
    //   202: l2i
    //   203: ldc -2082181198
    //   205: ixor
    //   206: ldc2_w 899111522
    //   209: l2i
    //   210: ldc 353090620
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1369258701 -> 5948, 871561871 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -819422510
    //   246: l2i
    //   247: ldc -819422510
    //   249: ixor
    //   250: ldc2_w -1498218759
    //   253: l2i
    //   254: ldc -1498218759
    //   256: ixor
    //   257: ldc2_w -525579277
    //   260: l2i
    //   261: ldc -525579277
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 1464912986
    //   273: l2i
    //   274: ldc -204454555
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1076322957
    //   283: l2i
    //   284: ldc 1465509385
    //   286: ixor
    //   287: ldc2_w 1816003031
    //   290: l2i
    //   291: ldc -421091545
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 6078, -1650056588 -> 320, 777531343 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w 1181373766
    //   332: l2i
    //   333: ldc 1079652755
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 70434083
    //   342: l2i
    //   343: ldc -654879084
    //   345: ixor
    //   346: ldc2_w -537391506
    //   349: l2i
    //   350: ldc -1515471823
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 6040, -1500096024 -> 380, 2086917770 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 397
    //   387: ldc2_w -1650442014
    //   390: l2i
    //   391: ldc 1273614021
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -45709805
    //   400: l2i
    //   401: ldc -1384456503
    //   403: ixor
    //   404: ldc2_w 975705679
    //   407: l2i
    //   408: ldc 2078843388
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1752614508 -> 6064, 660758415 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '흪㌚휡㶲擦'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w -943849531
    //   456: l2i
    //   457: ldc -651270094
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -1919883306
    //   466: l2i
    //   467: ldc 1159902291
    //   469: ixor
    //   470: ldc2_w -357949816
    //   473: l2i
    //   474: ldc -1784306641
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 6108, -1212290782 -> 504, 1637625168 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc 5.169506
    //   509: invokestatic floatToIntBits : (F)I
    //   512: ldc 2133159064
    //   514: ixor
    //   515: invokestatic intBitsToFloat : (I)F
    //   518: getstatic Perryc.c : I
    //   521: iflt -> 534
    //   524: ldc2_w 1753727234
    //   527: l2i
    //   528: ldc 874120584
    //   530: ixor
    //   531: goto -> 541
    //   534: ldc2_w 1113831758
    //   537: l2i
    //   538: ldc 1054077459
    //   540: ixor
    //   541: ldc2_w -1151280881
    //   544: l2i
    //   545: ldc 486719690
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 6088, -623750504 -> 576, -83894961 -> 534
    //   576: invokestatic valueOf : (F)Ljava/lang/Float;
    //   579: ldc 1.0831455E38
    //   581: invokestatic floatToIntBits : (F)I
    //   584: ldc 2124609855
    //   586: ixor
    //   587: invokestatic intBitsToFloat : (I)F
    //   590: getstatic Perryc.0 : I
    //   593: ifle -> 606
    //   596: ldc2_w -1421610039
    //   599: l2i
    //   600: ldc 352912472
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w 1785254045
    //   609: l2i
    //   610: ldc -121707895
    //   612: ixor
    //   613: ldc2_w -1335085100
    //   616: l2i
    //   617: ldc_w -1510738118
    //   620: ixor
    //   621: ixor
    //   622: lookupswitch default -> 648, -1412089985 -> 6058, -76905811 -> 606
    //   648: invokestatic valueOf : (F)Ljava/lang/Float;
    //   651: ldc_w 0.67281055
    //   654: invokestatic floatToIntBits : (F)I
    //   657: ldc_w 2133605712
    //   660: ixor
    //   661: invokestatic intBitsToFloat : (I)F
    //   664: getstatic Perryc.c : I
    //   667: iflt -> 681
    //   670: ldc2_w -1912991626
    //   673: l2i
    //   674: ldc_w 602468377
    //   677: ixor
    //   678: goto -> 689
    //   681: ldc2_w -1240139139
    //   684: l2i
    //   685: ldc_w 1378262076
    //   688: ixor
    //   689: ldc2_w 1858725076
    //   692: l2i
    //   693: ldc_w -1040922346
    //   696: ixor
    //   697: ixor
    //   698: lookupswitch default -> 6012, 19910061 -> 681, 1259293571 -> 724
    //   724: invokestatic valueOf : (F)Ljava/lang/Float;
    //   727: getstatic Perryc.c : I
    //   730: iflt -> 744
    //   733: ldc2_w 591519732
    //   736: l2i
    //   737: ldc_w 1101473094
    //   740: ixor
    //   741: goto -> 752
    //   744: ldc2_w -653658341
    //   747: l2i
    //   748: ldc_w -1238731966
    //   751: ixor
    //   752: ldc2_w -464065219
    //   755: l2i
    //   756: ldc_w 1843114120
    //   759: ixor
    //   760: ixor
    //   761: lookupswitch default -> 788, -345266425 -> 6036, 732377070 -> 744
    //   788: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   791: getstatic Perryc.0 : I
    //   794: ifle -> 808
    //   797: ldc2_w -1233687497
    //   800: l2i
    //   801: ldc_w 2033298973
    //   804: ixor
    //   805: goto -> 816
    //   808: ldc2_w 82699605
    //   811: l2i
    //   812: ldc_w -716589546
    //   815: ixor
    //   816: ldc2_w 1060658832
    //   819: l2i
    //   820: ldc_w -1554449428
    //   823: ixor
    //   824: ixor
    //   825: lookupswitch default -> 5960, 1304753727 -> 852, 1395025750 -> 808
    //   852: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   855: getstatic Perryc.c : I
    //   858: iflt -> 872
    //   861: ldc2_w -577476340
    //   864: l2i
    //   865: ldc_w -1225061226
    //   868: ixor
    //   869: goto -> 880
    //   872: ldc2_w -1507584942
    //   875: l2i
    //   876: ldc_w 310780462
    //   879: ixor
    //   880: ldc2_w 1957369302
    //   883: l2i
    //   884: ldc_w -331764182
    //   887: ixor
    //   888: ixor
    //   889: lookupswitch default -> 916, -201466266 -> 5952, 1580544355 -> 872
    //   916: putfield sizeX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   919: getstatic Perryc.1 : I
    //   922: ifeq -> 936
    //   925: ldc2_w -499581104
    //   928: l2i
    //   929: ldc_w 1486483681
    //   932: ixor
    //   933: goto -> 944
    //   936: ldc2_w 1417008647
    //   939: l2i
    //   940: ldc_w -1984568934
    //   943: ixor
    //   944: ldc2_w 506537603
    //   947: l2i
    //   948: ldc_w -988220300
    //   951: ixor
    //   952: ixor
    //   953: lookupswitch default -> 980, -603695522 -> 936, 1636359494 -> 6110
    //   980: aload_0
    //   981: getstatic Perryc.c : I
    //   984: iflt -> 998
    //   987: ldc2_w 1991042834
    //   990: l2i
    //   991: ldc_w -1833820894
    //   994: ixor
    //   995: goto -> 1006
    //   998: ldc2_w -1710757229
    //   1001: l2i
    //   1002: ldc_w 599222514
    //   1005: ixor
    //   1006: ldc2_w -2009956061
    //   1009: l2i
    //   1010: ldc_w 140412997
    //   1013: ixor
    //   1014: ixor
    //   1015: lookupswitch default -> 6104, 970754823 -> 1040, 1685254998 -> 998
    //   1040: aload_0
    //   1041: new bigname/zprestige/webhack/features/setting/Setting
    //   1044: dup
    //   1045: ldc_w '흪㌚휡㶲擧'
    //   1048: getstatic Perryc.0 : I
    //   1051: ifle -> 1065
    //   1054: ldc2_w -485091233
    //   1057: l2i
    //   1058: ldc_w 810180942
    //   1061: ixor
    //   1062: goto -> 1073
    //   1065: ldc2_w 285856770
    //   1068: l2i
    //   1069: ldc_w 1571046604
    //   1072: ixor
    //   1073: ldc2_w 212553298
    //   1076: l2i
    //   1077: ldc_w -1849561553
    //   1080: ixor
    //   1081: ixor
    //   1082: lookupswitch default -> 6114, -775475021 -> 1108, 1312217452 -> 1065
    //   1108: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1111: ldc_w 21.632406
    //   1114: invokestatic floatToIntBits : (F)I
    //   1117: ldc_w 2116882219
    //   1120: ixor
    //   1121: invokestatic intBitsToFloat : (I)F
    //   1124: getstatic Perryc.1 : I
    //   1127: ifeq -> 1141
    //   1130: ldc2_w 1179568790
    //   1133: l2i
    //   1134: ldc_w -424788725
    //   1137: ixor
    //   1138: goto -> 1149
    //   1141: ldc2_w -215426384
    //   1144: l2i
    //   1145: ldc_w 1674739813
    //   1148: ixor
    //   1149: ldc2_w -1163120287
    //   1152: l2i
    //   1153: ldc_w -545839216
    //   1156: ixor
    //   1157: ixor
    //   1158: lookupswitch default -> 1184, -2091769075 -> 1141, -985931412 -> 6080
    //   1184: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1187: ldc_w 6.343398E37
    //   1190: invokestatic floatToIntBits : (F)I
    //   1193: ldc_w 2118050755
    //   1196: ixor
    //   1197: invokestatic intBitsToFloat : (I)F
    //   1200: getstatic Perryc.c : I
    //   1203: iflt -> 1217
    //   1206: ldc2_w -538626775
    //   1209: l2i
    //   1210: ldc_w -926070917
    //   1213: ixor
    //   1214: goto -> 1225
    //   1217: ldc2_w 215829364
    //   1220: l2i
    //   1221: ldc_w -1610542975
    //   1224: ixor
    //   1225: ldc2_w 2054074113
    //   1228: l2i
    //   1229: ldc_w -923004648
    //   1232: ixor
    //   1233: ixor
    //   1234: lookupswitch default -> 1260, -1514484661 -> 6016, 1311676334 -> 1217
    //   1260: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1263: ldc_w 0.027748523
    //   1266: invokestatic floatToIntBits : (F)I
    //   1269: ldc_w 2095272159
    //   1272: ixor
    //   1273: invokestatic intBitsToFloat : (I)F
    //   1276: getstatic Perryc.0 : I
    //   1279: ifle -> 1293
    //   1282: ldc2_w 2065022974
    //   1285: l2i
    //   1286: ldc_w 162148462
    //   1289: ixor
    //   1290: goto -> 1301
    //   1293: ldc2_w -943791704
    //   1296: l2i
    //   1297: ldc_w 22300157
    //   1300: ixor
    //   1301: ldc2_w 1346542358
    //   1304: l2i
    //   1305: ldc_w -117602413
    //   1308: ixor
    //   1309: ixor
    //   1310: lookupswitch default -> 6046, -637496555 -> 1293, 1851111632 -> 1336
    //   1336: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1339: getstatic Perryc.1 : I
    //   1342: ifeq -> 1356
    //   1345: ldc2_w -78014112
    //   1348: l2i
    //   1349: ldc_w 1698993893
    //   1352: ixor
    //   1353: goto -> 1364
    //   1356: ldc2_w -1598803576
    //   1359: l2i
    //   1360: ldc_w -1665984277
    //   1363: ixor
    //   1364: ldc2_w 2108074080
    //   1367: l2i
    //   1368: ldc_w -968326748
    //   1371: ixor
    //   1372: ixor
    //   1373: lookupswitch default -> 1400, -1096300322 -> 1356, 636692033 -> 6092
    //   1400: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1403: getstatic Perryc.1 : I
    //   1406: ifeq -> 1420
    //   1409: ldc2_w 1515599626
    //   1412: l2i
    //   1413: ldc_w 895659388
    //   1416: ixor
    //   1417: goto -> 1428
    //   1420: ldc2_w -990050791
    //   1423: l2i
    //   1424: ldc_w 1687616339
    //   1427: ixor
    //   1428: ldc2_w 1467817733
    //   1431: l2i
    //   1432: ldc_w 2116524443
    //   1435: ixor
    //   1436: ixor
    //   1437: lookupswitch default -> 6002, -1993245740 -> 1464, 1181621480 -> 1420
    //   1464: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1467: getstatic Perryc.1 : I
    //   1470: ifeq -> 1484
    //   1473: ldc2_w 879750647
    //   1476: l2i
    //   1477: ldc_w 1597486536
    //   1480: ixor
    //   1481: goto -> 1492
    //   1484: ldc2_w -133908462
    //   1487: l2i
    //   1488: ldc_w -429410558
    //   1491: ixor
    //   1492: ldc2_w 819235691
    //   1495: l2i
    //   1496: ldc_w 1213048447
    //   1499: ixor
    //   1500: ixor
    //   1501: lookupswitch default -> 1528, 331445547 -> 6060, 1821386370 -> 1484
    //   1528: putfield sizeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1531: getstatic Perryc.0 : I
    //   1534: ifle -> 1548
    //   1537: ldc2_w 1120026771
    //   1540: l2i
    //   1541: ldc_w -1209311359
    //   1544: ixor
    //   1545: goto -> 1556
    //   1548: ldc2_w 1074625923
    //   1551: l2i
    //   1552: ldc_w 1793893357
    //   1555: ixor
    //   1556: ldc2_w -153600614
    //   1559: l2i
    //   1560: ldc_w -625620612
    //   1563: ixor
    //   1564: ixor
    //   1565: lookupswitch default -> 6018, -649794572 -> 1548, 109849224 -> 1592
    //   1592: aload_0
    //   1593: getstatic Perryc.c : I
    //   1596: iflt -> 1610
    //   1599: ldc2_w 255120480
    //   1602: l2i
    //   1603: ldc_w -1296941112
    //   1606: ixor
    //   1607: goto -> 1618
    //   1610: ldc2_w 1423015022
    //   1613: l2i
    //   1614: ldc_w 146275231
    //   1617: ixor
    //   1618: ldc2_w -339065118
    //   1621: l2i
    //   1622: ldc_w 96918398
    //   1625: ixor
    //   1626: ixor
    //   1627: lookupswitch default -> 1652, -1968342501 -> 1610, 1401583156 -> 5996
    //   1652: aload_0
    //   1653: new bigname/zprestige/webhack/features/setting/Setting
    //   1656: dup
    //   1657: ldc_w '흪㌚휡㶲擤'
    //   1660: getstatic Perryc.1 : I
    //   1663: ifeq -> 1677
    //   1666: ldc2_w -1183844472
    //   1669: l2i
    //   1670: ldc_w -400946449
    //   1673: ixor
    //   1674: goto -> 1685
    //   1677: ldc2_w -1378045863
    //   1680: l2i
    //   1681: ldc_w -636600098
    //   1684: ixor
    //   1685: ldc2_w -883875682
    //   1688: l2i
    //   1689: ldc_w -1587735360
    //   1692: ixor
    //   1693: ixor
    //   1694: lookupswitch default -> 5940, 501138649 -> 1720, 997837113 -> 1677
    //   1720: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1723: ldc_w 13.264903
    //   1726: invokestatic floatToIntBits : (F)I
    //   1729: ldc_w 2127838475
    //   1732: ixor
    //   1733: invokestatic intBitsToFloat : (I)F
    //   1736: getstatic Perryc.1 : I
    //   1739: ifeq -> 1753
    //   1742: ldc2_w -1109710012
    //   1745: l2i
    //   1746: ldc_w 60900491
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -1161969800
    //   1756: l2i
    //   1757: ldc_w 1954676136
    //   1760: ixor
    //   1761: ldc2_w -2019589094
    //   1764: l2i
    //   1765: ldc_w -46754543
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 1796, -992772412 -> 6100, -69713991 -> 1753
    //   1796: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1799: ldc_w 3.095622E38
    //   1802: invokestatic floatToIntBits : (F)I
    //   1805: ldc_w 2137580419
    //   1808: ixor
    //   1809: invokestatic intBitsToFloat : (I)F
    //   1812: getstatic Perryc.c : I
    //   1815: iflt -> 1829
    //   1818: ldc2_w -1401932545
    //   1821: l2i
    //   1822: ldc_w 1864316490
    //   1825: ixor
    //   1826: goto -> 1837
    //   1829: ldc2_w -672263996
    //   1832: l2i
    //   1833: ldc_w 162860372
    //   1836: ixor
    //   1837: ldc2_w 1210556741
    //   1840: l2i
    //   1841: ldc_w 2090962420
    //   1844: ixor
    //   1845: ixor
    //   1846: lookupswitch default -> 1872, -835876579 -> 1829, -135713276 -> 5998
    //   1872: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1875: ldc_w 0.5532641
    //   1878: invokestatic floatToIntBits : (F)I
    //   1881: ldc_w 2131600055
    //   1884: ixor
    //   1885: invokestatic intBitsToFloat : (I)F
    //   1888: getstatic Perryc.0 : I
    //   1891: ifle -> 1905
    //   1894: ldc2_w -1794206856
    //   1897: l2i
    //   1898: ldc_w -862786270
    //   1901: ixor
    //   1902: goto -> 1913
    //   1905: ldc2_w 798641678
    //   1908: l2i
    //   1909: ldc_w -1329745833
    //   1912: ixor
    //   1913: ldc2_w -23625002
    //   1916: l2i
    //   1917: ldc_w 173823859
    //   1920: ixor
    //   1921: ixor
    //   1922: lookupswitch default -> 1948, -1386763265 -> 6068, 332369665 -> 1905
    //   1948: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1951: getstatic Perryc.0 : I
    //   1954: ifle -> 1968
    //   1957: ldc2_w 323630397
    //   1960: l2i
    //   1961: ldc_w -2038241355
    //   1964: ixor
    //   1965: goto -> 1976
    //   1968: ldc2_w 1502770275
    //   1971: l2i
    //   1972: ldc_w 76116364
    //   1975: ixor
    //   1976: ldc2_w 362153759
    //   1979: l2i
    //   1980: ldc_w -306901457
    //   1983: ixor
    //   1984: ixor
    //   1985: lookupswitch default -> 2012, 164814300 -> 1968, 1844173752 -> 6072
    //   2012: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2015: getstatic Perryc.0 : I
    //   2018: ifle -> 2032
    //   2021: ldc2_w 1692444886
    //   2024: l2i
    //   2025: ldc_w 1561634669
    //   2028: ixor
    //   2029: goto -> 2040
    //   2032: ldc2_w 830674251
    //   2035: l2i
    //   2036: ldc_w -1738431475
    //   2039: ixor
    //   2040: ldc2_w 1499452382
    //   2043: l2i
    //   2044: ldc_w -1948425378
    //   2047: ixor
    //   2048: ixor
    //   2049: lookupswitch default -> 2076, -344539333 -> 5990, 1984577888 -> 2032
    //   2076: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2079: getstatic Perryc.c : I
    //   2082: iflt -> 2096
    //   2085: ldc2_w 1825276630
    //   2088: l2i
    //   2089: ldc_w -679601362
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w 424542113
    //   2099: l2i
    //   2100: ldc_w -247116770
    //   2103: ixor
    //   2104: ldc2_w 1707618785
    //   2107: l2i
    //   2108: ldc_w 542361026
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 2140, -30511653 -> 6042, 1791878765 -> 2096
    //   2140: putfield sizeZ : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2143: getstatic Perryc.1 : I
    //   2146: ifeq -> 2160
    //   2149: ldc2_w -216029881
    //   2152: l2i
    //   2153: ldc_w -1427205644
    //   2156: ixor
    //   2157: goto -> 2168
    //   2160: ldc2_w 216538927
    //   2163: l2i
    //   2164: ldc_w 238012704
    //   2167: ixor
    //   2168: ldc2_w 552068176
    //   2171: l2i
    //   2172: ldc_w 29075486
    //   2175: ixor
    //   2176: ixor
    //   2177: lookupswitch default -> 5980, 597400129 -> 2204, 2024634621 -> 2160
    //   2204: aload_0
    //   2205: getstatic Perryc.c : I
    //   2208: iflt -> 2222
    //   2211: ldc2_w -1732178340
    //   2214: l2i
    //   2215: ldc_w 1235920341
    //   2218: ixor
    //   2219: goto -> 2230
    //   2222: ldc2_w -1593188968
    //   2225: l2i
    //   2226: ldc_w 285231178
    //   2229: ixor
    //   2230: ldc2_w -846702168
    //   2233: l2i
    //   2234: ldc_w 1573995229
    //   2237: ixor
    //   2238: ixor
    //   2239: lookupswitch default -> 2264, 61107565 -> 2222, 1093841148 -> 6024
    //   2264: aload_0
    //   2265: new bigname/zprestige/webhack/features/setting/Setting
    //   2268: dup
    //   2269: ldc_w '흶㌕휽㶤擛㧱แ'
    //   2272: getstatic Perryc.0 : I
    //   2275: ifle -> 2289
    //   2278: ldc2_w -1970496486
    //   2281: l2i
    //   2282: ldc_w 1233112908
    //   2285: ixor
    //   2286: goto -> 2297
    //   2289: ldc2_w -1177193880
    //   2292: l2i
    //   2293: ldc_w -359354656
    //   2296: ixor
    //   2297: ldc2_w -82475588
    //   2300: l2i
    //   2301: ldc_w 1426692827
    //   2304: ixor
    //   2305: ixor
    //   2306: lookupswitch default -> 5986, -44186641 -> 2332, 1844399153 -> 2289
    //   2332: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2335: ldc_w 4.209634E36
    //   2338: invokestatic floatToIntBits : (F)I
    //   2341: ldc_w 2085269439
    //   2344: ixor
    //   2345: invokestatic intBitsToFloat : (I)F
    //   2348: getstatic Perryc.c : I
    //   2351: iflt -> 2365
    //   2354: ldc2_w -1655902234
    //   2357: l2i
    //   2358: ldc_w -1217485147
    //   2361: ixor
    //   2362: goto -> 2373
    //   2365: ldc2_w 1665989350
    //   2368: l2i
    //   2369: ldc_w 5879267
    //   2372: ixor
    //   2373: ldc2_w -1467076446
    //   2376: l2i
    //   2377: ldc_w -612133088
    //   2380: ixor
    //   2381: ixor
    //   2382: lookupswitch default -> 2408, -182139769 -> 2365, 1496313537 -> 6112
    //   2408: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2411: ldc_w -10.80395
    //   2414: invokestatic floatToIntBits : (F)I
    //   2417: ldc_w 2125257979
    //   2420: ixor
    //   2421: invokestatic intBitsToFloat : (I)F
    //   2424: getstatic Perryc.c : I
    //   2427: iflt -> 2441
    //   2430: ldc2_w -1025214732
    //   2433: l2i
    //   2434: ldc_w -1405748547
    //   2437: ixor
    //   2438: goto -> 2449
    //   2441: ldc2_w 1379967834
    //   2444: l2i
    //   2445: ldc_w -799930653
    //   2448: ixor
    //   2449: ldc2_w 1088629972
    //   2452: l2i
    //   2453: ldc_w 810360503
    //   2456: ixor
    //   2457: ixor
    //   2458: lookupswitch default -> 5970, -222521382 -> 2484, 511688234 -> 2441
    //   2484: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2487: ldc_w 15.995719
    //   2490: invokestatic floatToIntBits : (F)I
    //   2493: ldc_w 2130701943
    //   2496: ixor
    //   2497: invokestatic intBitsToFloat : (I)F
    //   2500: getstatic Perryc.c : I
    //   2503: iflt -> 2517
    //   2506: ldc2_w 1157663888
    //   2509: l2i
    //   2510: ldc_w 357447254
    //   2513: ixor
    //   2514: goto -> 2525
    //   2517: ldc2_w -139908272
    //   2520: l2i
    //   2521: ldc_w -1779320660
    //   2524: ixor
    //   2525: ldc2_w 2060309035
    //   2528: l2i
    //   2529: ldc_w -222722433
    //   2532: ixor
    //   2533: ixor
    //   2534: lookupswitch default -> 6090, -667226478 -> 2517, -366164056 -> 2560
    //   2560: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2563: getstatic Perryc.1 : I
    //   2566: ifeq -> 2580
    //   2569: ldc2_w -1669723379
    //   2572: l2i
    //   2573: ldc_w -941940143
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w -1960096887
    //   2583: l2i
    //   2584: ldc_w -1397700925
    //   2587: ixor
    //   2588: ldc2_w 813949265
    //   2591: l2i
    //   2592: ldc_w 1715526354
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 5982, 224531167 -> 2580, 1901639369 -> 2624
    //   2624: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2627: getstatic Perryc.0 : I
    //   2630: ifle -> 2644
    //   2633: ldc2_w -401282380
    //   2636: l2i
    //   2637: ldc_w 378375090
    //   2640: ixor
    //   2641: goto -> 2652
    //   2644: ldc2_w 2130920957
    //   2647: l2i
    //   2648: ldc_w -1891882383
    //   2651: ixor
    //   2652: ldc2_w -1677408878
    //   2655: l2i
    //   2656: ldc_w 639716323
    //   2659: ixor
    //   2660: ixor
    //   2661: lookupswitch default -> 5962, 1153232759 -> 2644, 1243275773 -> 2688
    //   2688: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2691: getstatic Perryc.1 : I
    //   2694: ifeq -> 2708
    //   2697: ldc2_w -58697852
    //   2700: l2i
    //   2701: ldc_w 1603266952
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w 1334095151
    //   2711: l2i
    //   2712: ldc_w -761055260
    //   2715: ixor
    //   2716: ldc2_w -219867640
    //   2719: l2i
    //   2720: ldc_w 347784611
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 6026, 1162898855 -> 2708, 2071480672 -> 2752
    //   2752: putfield offsetX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2755: getstatic Perryc.0 : I
    //   2758: ifle -> 2772
    //   2761: ldc2_w -192123436
    //   2764: l2i
    //   2765: ldc_w 269373537
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w 1830698016
    //   2775: l2i
    //   2776: ldc_w -138263415
    //   2779: ixor
    //   2780: ldc2_w -1985029906
    //   2783: l2i
    //   2784: ldc_w 1195991211
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 2816, -2091699065 -> 2772, 711296496 -> 6020
    //   2816: aload_0
    //   2817: getstatic Perryc.c : I
    //   2820: iflt -> 2834
    //   2823: ldc2_w -841054680
    //   2826: l2i
    //   2827: ldc_w -1390279879
    //   2830: ixor
    //   2831: goto -> 2842
    //   2834: ldc2_w 1297299035
    //   2837: l2i
    //   2838: ldc_w -239779492
    //   2841: ixor
    //   2842: ldc2_w -1505102038
    //   2845: l2i
    //   2846: ldc_w -99402939
    //   2849: ixor
    //   2850: ixor
    //   2851: lookupswitch default -> 6102, -524502168 -> 2876, 1017530750 -> 2834
    //   2876: aload_0
    //   2877: new bigname/zprestige/webhack/features/setting/Setting
    //   2880: dup
    //   2881: ldc_w '흶㌕휽㶤擛㧱เ'
    //   2884: getstatic Perryc.c : I
    //   2887: iflt -> 2901
    //   2890: ldc2_w 1698061709
    //   2893: l2i
    //   2894: ldc_w 2054603262
    //   2897: ixor
    //   2898: goto -> 2909
    //   2901: ldc2_w 1453291816
    //   2904: l2i
    //   2905: ldc_w 2052163319
    //   2908: ixor
    //   2909: ldc2_w 1518878152
    //   2912: l2i
    //   2913: ldc_w -169817452
    //   2916: ixor
    //   2917: ixor
    //   2918: lookupswitch default -> 5994, -2086270845 -> 2944, -1339528401 -> 2901
    //   2944: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2947: ldc_w 2.9285964E38
    //   2950: invokestatic floatToIntBits : (F)I
    //   2953: ldc_w 2136756919
    //   2956: ixor
    //   2957: invokestatic intBitsToFloat : (I)F
    //   2960: getstatic Perryc.1 : I
    //   2963: ifeq -> 2977
    //   2966: ldc2_w -1215377887
    //   2969: l2i
    //   2970: ldc_w 1236086011
    //   2973: ixor
    //   2974: goto -> 2985
    //   2977: ldc2_w 1374521659
    //   2980: l2i
    //   2981: ldc_w 159954662
    //   2984: ixor
    //   2985: ldc2_w 441691032
    //   2988: l2i
    //   2989: ldc_w 2139554609
    //   2992: ixor
    //   2993: ixor
    //   2994: lookupswitch default -> 5988, -1678292365 -> 2977, 1035048820 -> 3020
    //   3020: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3023: ldc_w -6.771147
    //   3026: invokestatic floatToIntBits : (F)I
    //   3029: ldc_w 2136517948
    //   3032: ixor
    //   3033: invokestatic intBitsToFloat : (I)F
    //   3036: getstatic Perryc.c : I
    //   3039: iflt -> 3053
    //   3042: ldc2_w 836994615
    //   3045: l2i
    //   3046: ldc_w 1663348058
    //   3049: ixor
    //   3050: goto -> 3061
    //   3053: ldc2_w 638080523
    //   3056: l2i
    //   3057: ldc_w 1006792174
    //   3060: ixor
    //   3061: ldc2_w -649210110
    //   3064: l2i
    //   3065: ldc_w -1502614906
    //   3068: ixor
    //   3069: ixor
    //   3070: lookupswitch default -> 3096, -1799531820 -> 3053, 769988329 -> 6076
    //   3096: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3099: ldc_w 11.720796
    //   3102: invokestatic floatToIntBits : (F)I
    //   3105: ldc_w 2126219361
    //   3108: ixor
    //   3109: invokestatic intBitsToFloat : (I)F
    //   3112: getstatic Perryc.0 : I
    //   3115: ifle -> 3129
    //   3118: ldc2_w 520004578
    //   3121: l2i
    //   3122: ldc_w -1541408299
    //   3125: ixor
    //   3126: goto -> 3137
    //   3129: ldc2_w -153767531
    //   3132: l2i
    //   3133: ldc_w 78046393
    //   3136: ixor
    //   3137: ldc2_w 442835997
    //   3140: l2i
    //   3141: ldc_w -705222399
    //   3144: ixor
    //   3145: ixor
    //   3146: lookupswitch default -> 6052, 1038178352 -> 3172, 1970493227 -> 3129
    //   3172: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3175: getstatic Perryc.c : I
    //   3178: iflt -> 3192
    //   3181: ldc2_w 1578577661
    //   3184: l2i
    //   3185: ldc_w 1687918651
    //   3188: ixor
    //   3189: goto -> 3200
    //   3192: ldc2_w 890722099
    //   3195: l2i
    //   3196: ldc_w -2060354961
    //   3199: ixor
    //   3200: ldc2_w -422243831
    //   3203: l2i
    //   3204: ldc_w -1758064389
    //   3207: ixor
    //   3208: ixor
    //   3209: lookupswitch default -> 3236, 1253747800 -> 3192, 1265611828 -> 6038
    //   3236: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3239: getstatic Perryc.1 : I
    //   3242: ifeq -> 3256
    //   3245: ldc2_w 64167635
    //   3248: l2i
    //   3249: ldc_w 180251606
    //   3252: ixor
    //   3253: goto -> 3264
    //   3256: ldc2_w -774834526
    //   3259: l2i
    //   3260: ldc_w 1132090265
    //   3263: ixor
    //   3264: ldc2_w -1349734823
    //   3267: l2i
    //   3268: ldc_w -1929452679
    //   3271: ixor
    //   3272: ixor
    //   3273: lookupswitch default -> 6028, -1311184869 -> 3300, 706689061 -> 3256
    //   3300: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3303: getstatic Perryc.c : I
    //   3306: iflt -> 3320
    //   3309: ldc2_w -220558508
    //   3312: l2i
    //   3313: ldc_w -227660033
    //   3316: ixor
    //   3317: goto -> 3328
    //   3320: ldc2_w 711933788
    //   3323: l2i
    //   3324: ldc_w 108460039
    //   3327: ixor
    //   3328: ldc2_w -952762211
    //   3331: l2i
    //   3332: ldc_w -1625630512
    //   3335: ixor
    //   3336: ixor
    //   3337: lookupswitch default -> 3364, 1486388710 -> 6084, 1753146227 -> 3320
    //   3364: putfield offsetY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3367: getstatic Perryc.1 : I
    //   3370: ifeq -> 3384
    //   3373: ldc2_w 337316107
    //   3376: l2i
    //   3377: ldc_w 634091418
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w -566284298
    //   3387: l2i
    //   3388: ldc_w -87164168
    //   3391: ixor
    //   3392: ldc2_w 986573037
    //   3395: l2i
    //   3396: ldc_w 895962653
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 6030, 727217150 -> 3428, 1048238177 -> 3384
    //   3428: aload_0
    //   3429: getstatic Perryc.1 : I
    //   3432: ifeq -> 3446
    //   3435: ldc2_w -2023991725
    //   3438: l2i
    //   3439: ldc_w 200042152
    //   3442: ixor
    //   3443: goto -> 3454
    //   3446: ldc2_w -1554112874
    //   3449: l2i
    //   3450: ldc_w 1615149982
    //   3453: ixor
    //   3454: ldc2_w -598089872
    //   3457: l2i
    //   3458: ldc_w -1063991838
    //   3461: ixor
    //   3462: ixor
    //   3463: lookupswitch default -> 3488, -1870845335 -> 6022, 319864449 -> 3446
    //   3488: aload_0
    //   3489: new bigname/zprestige/webhack/features/setting/Setting
    //   3492: dup
    //   3493: ldc_w '흶㌕휽㶤擛㧱ใ'
    //   3496: getstatic Perryc.c : I
    //   3499: iflt -> 3513
    //   3502: ldc2_w 1661869583
    //   3505: l2i
    //   3506: ldc_w -883502422
    //   3509: ixor
    //   3510: goto -> 3521
    //   3513: ldc2_w -1580513731
    //   3516: l2i
    //   3517: ldc_w -1907747657
    //   3520: ixor
    //   3521: ldc2_w 730362711
    //   3524: l2i
    //   3525: ldc_w -462180184
    //   3528: ixor
    //   3529: ixor
    //   3530: lookupswitch default -> 6094, -528838283 -> 3556, 1738739546 -> 3513
    //   3556: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3559: ldc_w 2.0279842E38
    //   3562: invokestatic floatToIntBits : (F)I
    //   3565: ldc_w 2132316558
    //   3568: ixor
    //   3569: invokestatic intBitsToFloat : (I)F
    //   3572: getstatic Perryc.c : I
    //   3575: iflt -> 3589
    //   3578: ldc2_w -1587517959
    //   3581: l2i
    //   3582: ldc_w -705096347
    //   3585: ixor
    //   3586: goto -> 3597
    //   3589: ldc2_w 2095703141
    //   3592: l2i
    //   3593: ldc_w -35121134
    //   3596: ixor
    //   3597: ldc2_w 807301408
    //   3600: l2i
    //   3601: ldc_w 647006864
    //   3604: ixor
    //   3605: ixor
    //   3606: lookupswitch default -> 5984, -1752234041 -> 3632, 1645710124 -> 3589
    //   3632: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3635: ldc_w -12.965299
    //   3638: invokestatic floatToIntBits : (F)I
    //   3641: ldc_w 2127524317
    //   3644: ixor
    //   3645: invokestatic intBitsToFloat : (I)F
    //   3648: getstatic Perryc.0 : I
    //   3651: ifle -> 3665
    //   3654: ldc2_w 1905057504
    //   3657: l2i
    //   3658: ldc_w 248478046
    //   3661: ixor
    //   3662: goto -> 3673
    //   3665: ldc2_w 1593426574
    //   3668: l2i
    //   3669: ldc_w 1300538239
    //   3672: ixor
    //   3673: ldc2_w -388435333
    //   3676: l2i
    //   3677: ldc_w 924902550
    //   3680: ixor
    //   3681: ixor
    //   3682: lookupswitch default -> 6066, -1598312109 -> 3665, -863668452 -> 3708
    //   3708: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3711: ldc_w 7.358662
    //   3714: invokestatic floatToIntBits : (F)I
    //   3717: ldc_w 2137750057
    //   3720: ixor
    //   3721: invokestatic intBitsToFloat : (I)F
    //   3724: getstatic Perryc.1 : I
    //   3727: ifeq -> 3741
    //   3730: ldc2_w -1278491036
    //   3733: l2i
    //   3734: ldc_w -496122601
    //   3737: ixor
    //   3738: goto -> 3749
    //   3741: ldc2_w -558764942
    //   3744: l2i
    //   3745: ldc_w 1864503809
    //   3748: ixor
    //   3749: ldc2_w -870315306
    //   3752: l2i
    //   3753: ldc_w 1374891162
    //   3756: ixor
    //   3757: ixor
    //   3758: lookupswitch default -> 6098, -864737985 -> 3741, 742447167 -> 3784
    //   3784: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3787: getstatic Perryc.c : I
    //   3790: iflt -> 3804
    //   3793: ldc2_w -2109997962
    //   3796: l2i
    //   3797: ldc_w 1589454139
    //   3800: ixor
    //   3801: goto -> 3812
    //   3804: ldc2_w 1587488330
    //   3807: l2i
    //   3808: ldc_w -1870716803
    //   3811: ixor
    //   3812: ldc2_w -1377588654
    //   3815: l2i
    //   3816: ldc_w 1905614529
    //   3819: ixor
    //   3820: ixor
    //   3821: lookupswitch default -> 3848, -1371159899 -> 3804, 15740382 -> 6000
    //   3848: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3851: getstatic Perryc.1 : I
    //   3854: ifeq -> 3868
    //   3857: ldc2_w 69873973
    //   3860: l2i
    //   3861: ldc_w -307577674
    //   3864: ixor
    //   3865: goto -> 3876
    //   3868: ldc2_w -372589082
    //   3871: l2i
    //   3872: ldc_w -1844765552
    //   3875: ixor
    //   3876: ldc2_w 2064106702
    //   3879: l2i
    //   3880: ldc_w 185186219
    //   3883: ixor
    //   3884: ixor
    //   3885: lookupswitch default -> 5944, -1718681882 -> 3868, 198169107 -> 3912
    //   3912: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3915: getstatic Perryc.1 : I
    //   3918: ifeq -> 3932
    //   3921: ldc2_w -1441981477
    //   3924: l2i
    //   3925: ldc_w -1797763004
    //   3928: ixor
    //   3929: goto -> 3940
    //   3932: ldc2_w -1414887666
    //   3935: l2i
    //   3936: ldc_w -844986101
    //   3939: ixor
    //   3940: ldc2_w -1269948495
    //   3943: l2i
    //   3944: ldc_w -887430679
    //   3947: ixor
    //   3948: ixor
    //   3949: lookupswitch default -> 3976, 1099019719 -> 6048, 1861405339 -> 3932
    //   3976: putfield offsetZ : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3979: getstatic Perryc.1 : I
    //   3982: ifeq -> 3996
    //   3985: ldc2_w 952996219
    //   3988: l2i
    //   3989: ldc_w -637368601
    //   3992: ixor
    //   3993: goto -> 4004
    //   3996: ldc2_w 2116708043
    //   3999: l2i
    //   4000: ldc_w -1875906608
    //   4003: ixor
    //   4004: ldc2_w 766848887
    //   4007: l2i
    //   4008: ldc_w 234897135
    //   4011: ixor
    //   4012: ixor
    //   4013: lookupswitch default -> 4040, -1048967676 -> 6082, 2055874040 -> 3996
    //   4040: aload_0
    //   4041: getstatic Perryc.c : I
    //   4044: iflt -> 4058
    //   4047: ldc2_w 539921448
    //   4050: l2i
    //   4051: ldc_w 1068210518
    //   4054: ixor
    //   4055: goto -> 4066
    //   4058: ldc2_w 2076568482
    //   4061: l2i
    //   4062: ldc_w 1363333546
    //   4065: ixor
    //   4066: ldc2_w -1859248839
    //   4069: l2i
    //   4070: ldc_w 1982241552
    //   4073: ixor
    //   4074: ixor
    //   4075: lookupswitch default -> 4100, -261216033 -> 4058, -124939433 -> 5968
    //   4100: aload_0
    //   4101: new bigname/zprestige/webhack/features/setting/Setting
    //   4104: dup
    //   4105: ldc_w '흶㌕휽㶿擟㧫๽꫄'
    //   4108: getstatic Perryc.c : I
    //   4111: iflt -> 4125
    //   4114: ldc2_w 1361954189
    //   4117: l2i
    //   4118: ldc_w -1956000533
    //   4121: ixor
    //   4122: goto -> 4133
    //   4125: ldc2_w -2005129777
    //   4128: l2i
    //   4129: ldc_w -1609120880
    //   4132: ixor
    //   4133: ldc2_w 597802324
    //   4136: l2i
    //   4137: ldc_w -728938911
    //   4140: ixor
    //   4141: ixor
    //   4142: lookupswitch default -> 6056, -549053078 -> 4168, 761852499 -> 4125
    //   4168: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4171: ldc_w 2.0970233E38
    //   4174: invokestatic floatToIntBits : (F)I
    //   4177: ldc_w 2132656947
    //   4180: ixor
    //   4181: invokestatic intBitsToFloat : (I)F
    //   4184: getstatic Perryc.1 : I
    //   4187: ifeq -> 4201
    //   4190: ldc2_w 1345633666
    //   4193: l2i
    //   4194: ldc_w 1473717311
    //   4197: ixor
    //   4198: goto -> 4209
    //   4201: ldc2_w 1898542365
    //   4204: l2i
    //   4205: ldc_w 1470232562
    //   4208: ixor
    //   4209: ldc2_w -1038757061
    //   4212: l2i
    //   4213: ldc_w -685239884
    //   4216: ixor
    //   4217: ixor
    //   4218: lookupswitch default -> 6032, 316562226 -> 4201, 867516512 -> 4244
    //   4244: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4247: ldc_w -61.088497
    //   4250: invokestatic floatToIntBits : (F)I
    //   4253: ldc_w 2113165983
    //   4256: ixor
    //   4257: invokestatic intBitsToFloat : (I)F
    //   4260: getstatic Perryc.c : I
    //   4263: iflt -> 4277
    //   4266: ldc2_w -1767973108
    //   4269: l2i
    //   4270: ldc_w -1182769683
    //   4273: ixor
    //   4274: goto -> 4285
    //   4277: ldc2_w 2119409801
    //   4280: l2i
    //   4281: ldc_w 685941556
    //   4284: ixor
    //   4285: ldc2_w 1746203343
    //   4288: l2i
    //   4289: ldc_w -250491398
    //   4292: ixor
    //   4293: ixor
    //   4294: lookupswitch default -> 4320, -1239695916 -> 5966, 1298769273 -> 4277
    //   4320: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4323: ldc_w 103.43517
    //   4326: invokestatic floatToIntBits : (F)I
    //   4329: ldc_w 2102320847
    //   4332: ixor
    //   4333: invokestatic intBitsToFloat : (I)F
    //   4336: getstatic Perryc.1 : I
    //   4339: ifeq -> 4353
    //   4342: ldc2_w 1062419551
    //   4345: l2i
    //   4346: ldc_w 911812027
    //   4349: ixor
    //   4350: goto -> 4361
    //   4353: ldc2_w -132510505
    //   4356: l2i
    //   4357: ldc_w 1230098773
    //   4360: ixor
    //   4361: ldc2_w 986055247
    //   4364: l2i
    //   4365: ldc_w 1927726682
    //   4368: ixor
    //   4369: ixor
    //   4370: lookupswitch default -> 4396, -179343230 -> 4353, 1093328369 -> 6034
    //   4396: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4399: getstatic Perryc.c : I
    //   4402: iflt -> 4416
    //   4405: ldc2_w -954256601
    //   4408: l2i
    //   4409: ldc_w 1445469978
    //   4412: ixor
    //   4413: goto -> 4424
    //   4416: ldc2_w -706991268
    //   4419: l2i
    //   4420: ldc_w -1458586912
    //   4423: ixor
    //   4424: ldc2_w -1779291655
    //   4427: l2i
    //   4428: ldc_w -1931653813
    //   4431: ixor
    //   4432: ixor
    //   4433: lookupswitch default -> 4460, -2011674481 -> 5958, -1838524398 -> 4416
    //   4460: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4463: getstatic Perryc.1 : I
    //   4466: ifeq -> 4480
    //   4469: ldc2_w -256895862
    //   4472: l2i
    //   4473: ldc_w 1782343757
    //   4476: ixor
    //   4477: goto -> 4488
    //   4480: ldc2_w -747878973
    //   4483: l2i
    //   4484: ldc_w 187544160
    //   4487: ixor
    //   4488: ldc2_w 157390026
    //   4491: l2i
    //   4492: ldc_w -985239691
    //   4495: ixor
    //   4496: ixor
    //   4497: lookupswitch default -> 6096, 342232092 -> 4524, 1454081912 -> 4480
    //   4524: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4527: getstatic Perryc.0 : I
    //   4530: ifle -> 4544
    //   4533: ldc2_w 1709254921
    //   4536: l2i
    //   4537: ldc_w -975682968
    //   4540: ixor
    //   4541: goto -> 4552
    //   4544: ldc2_w -1277298684
    //   4547: l2i
    //   4548: ldc_w 1004037367
    //   4551: ixor
    //   4552: ldc2_w -2102042211
    //   4555: l2i
    //   4556: ldc_w 1391048650
    //   4559: ixor
    //   4560: ixor
    //   4561: lookupswitch default -> 4588, -750184204 -> 4544, 1885715766 -> 6050
    //   4588: putfield offhandX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4591: getstatic Perryc.c : I
    //   4594: iflt -> 4608
    //   4597: ldc2_w -1905056091
    //   4600: l2i
    //   4601: ldc_w 1651364573
    //   4604: ixor
    //   4605: goto -> 4616
    //   4608: ldc2_w 1491622084
    //   4611: l2i
    //   4612: ldc_w -849143084
    //   4615: ixor
    //   4616: ldc2_w -537089893
    //   4619: l2i
    //   4620: ldc_w 1315072475
    //   4623: ixor
    //   4624: ixor
    //   4625: lookupswitch default -> 5956, 68518736 -> 4652, 2105554232 -> 4608
    //   4652: aload_0
    //   4653: getstatic Perryc.c : I
    //   4656: iflt -> 4670
    //   4659: ldc2_w -1040657571
    //   4662: l2i
    //   4663: ldc_w -1732961854
    //   4666: ixor
    //   4667: goto -> 4678
    //   4670: ldc2_w -1043414905
    //   4673: l2i
    //   4674: ldc_w 407809988
    //   4677: ixor
    //   4678: ldc2_w -1917679772
    //   4681: l2i
    //   4682: ldc_w -596774700
    //   4685: ixor
    //   4686: ixor
    //   4687: lookupswitch default -> 4712, -1636166481 -> 4670, 143834415 -> 5978
    //   4712: aload_0
    //   4713: new bigname/zprestige/webhack/features/setting/Setting
    //   4716: dup
    //   4717: ldc_w '흶㌕휽㶿擟㧫๽꫅'
    //   4720: getstatic Perryc.0 : I
    //   4723: ifle -> 4737
    //   4726: ldc2_w 1672164021
    //   4729: l2i
    //   4730: ldc_w -2009797457
    //   4733: ixor
    //   4734: goto -> 4745
    //   4737: ldc2_w 1863532125
    //   4740: l2i
    //   4741: ldc_w -788991430
    //   4744: ixor
    //   4745: ldc2_w 470180667
    //   4748: l2i
    //   4749: ldc_w 1163396681
    //   4752: ixor
    //   4753: ixor
    //   4754: lookupswitch default -> 6010, -1295926424 -> 4737, -424302315 -> 4780
    //   4780: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4783: ldc_w 2.120629E38
    //   4786: invokestatic floatToIntBits : (F)I
    //   4789: ldc_w 2132773332
    //   4792: ixor
    //   4793: invokestatic intBitsToFloat : (I)F
    //   4796: getstatic Perryc.0 : I
    //   4799: ifle -> 4813
    //   4802: ldc2_w -1456874079
    //   4805: l2i
    //   4806: ldc_w 1943709070
    //   4809: ixor
    //   4810: goto -> 4821
    //   4813: ldc2_w -1236745258
    //   4816: l2i
    //   4817: ldc_w 523395362
    //   4820: ixor
    //   4821: ldc2_w -1720868329
    //   4824: l2i
    //   4825: ldc_w -851620237
    //   4828: ixor
    //   4829: ixor
    //   4830: lookupswitch default -> 4856, -1901882293 -> 6054, 384700109 -> 4813
    //   4856: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4859: ldc_w -5.2505317
    //   4862: invokestatic floatToIntBits : (F)I
    //   4865: ldc_w 2133328987
    //   4868: ixor
    //   4869: invokestatic intBitsToFloat : (I)F
    //   4872: getstatic Perryc.1 : I
    //   4875: ifeq -> 4889
    //   4878: ldc2_w -1365488401
    //   4881: l2i
    //   4882: ldc_w 692793618
    //   4885: ixor
    //   4886: goto -> 4897
    //   4889: ldc2_w 1940528154
    //   4892: l2i
    //   4893: ldc_w -831016535
    //   4896: ixor
    //   4897: ldc2_w -1482628776
    //   4900: l2i
    //   4901: ldc_w -1371360418
    //   4904: ixor
    //   4905: ixor
    //   4906: lookupswitch default -> 6004, -1909116933 -> 4889, -1270874187 -> 4932
    //   4932: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4935: ldc_w 7.27056
    //   4938: invokestatic floatToIntBits : (F)I
    //   4941: ldc_w 2137565293
    //   4944: ixor
    //   4945: invokestatic intBitsToFloat : (I)F
    //   4948: getstatic Perryc.c : I
    //   4951: iflt -> 4965
    //   4954: ldc2_w -1414530338
    //   4957: l2i
    //   4958: ldc_w 816124560
    //   4961: ixor
    //   4962: goto -> 4973
    //   4965: ldc2_w 354353959
    //   4968: l2i
    //   4969: ldc_w 129405281
    //   4972: ixor
    //   4973: ldc2_w -1493456730
    //   4976: l2i
    //   4977: ldc_w 134426904
    //   4980: ixor
    //   4981: ixor
    //   4982: lookupswitch default -> 6062, -1135539208 -> 5008, 905081328 -> 4965
    //   5008: invokestatic valueOf : (F)Ljava/lang/Float;
    //   5011: getstatic Perryc.1 : I
    //   5014: ifeq -> 5028
    //   5017: ldc2_w 1349843916
    //   5020: l2i
    //   5021: ldc_w 1716921468
    //   5024: ixor
    //   5025: goto -> 5036
    //   5028: ldc2_w 30791254
    //   5031: l2i
    //   5032: ldc_w 1307680351
    //   5035: ixor
    //   5036: ldc2_w 1962617991
    //   5039: l2i
    //   5040: ldc_w -1104597248
    //   5043: ixor
    //   5044: ixor
    //   5045: lookupswitch default -> 5974, -2030679154 -> 5072, -51323849 -> 5028
    //   5072: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5075: getstatic Perryc.1 : I
    //   5078: ifeq -> 5092
    //   5081: ldc2_w -1563533923
    //   5084: l2i
    //   5085: ldc_w -494792070
    //   5088: ixor
    //   5089: goto -> 5100
    //   5092: ldc2_w 1595324881
    //   5095: l2i
    //   5096: ldc_w 1863114934
    //   5099: ixor
    //   5100: ldc2_w -1322626103
    //   5103: l2i
    //   5104: ldc_w -285544457
    //   5107: ixor
    //   5108: ixor
    //   5109: lookupswitch default -> 5954, 530379737 -> 5092, 1875567961 -> 5136
    //   5136: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5139: getstatic Perryc.0 : I
    //   5142: ifle -> 5156
    //   5145: ldc2_w -1432743326
    //   5148: l2i
    //   5149: ldc_w -1689578251
    //   5152: ixor
    //   5153: goto -> 5164
    //   5156: ldc2_w -2018144991
    //   5159: l2i
    //   5160: ldc_w -1154301344
    //   5163: ixor
    //   5164: ldc2_w -1147188221
    //   5167: l2i
    //   5168: ldc_w -615834483
    //   5171: ixor
    //   5172: ixor
    //   5173: lookupswitch default -> 5200, -272311120 -> 5156, 1359304217 -> 6006
    //   5200: putfield offhandY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5203: getstatic Perryc.0 : I
    //   5206: ifle -> 5220
    //   5209: ldc2_w -1690245147
    //   5212: l2i
    //   5213: ldc_w -366941645
    //   5216: ixor
    //   5217: goto -> 5228
    //   5220: ldc2_w -835576110
    //   5223: l2i
    //   5224: ldc_w -1926467033
    //   5227: ixor
    //   5228: ldc2_w 81077721
    //   5231: l2i
    //   5232: ldc_w -393350045
    //   5235: ixor
    //   5236: ixor
    //   5237: lookupswitch default -> 5264, -1988587121 -> 5220, -1657217940 -> 5964
    //   5264: aload_0
    //   5265: getstatic Perryc.1 : I
    //   5268: ifeq -> 5282
    //   5271: ldc2_w -585042692
    //   5274: l2i
    //   5275: ldc_w -2127587407
    //   5278: ixor
    //   5279: goto -> 5290
    //   5282: ldc2_w 656039307
    //   5285: l2i
    //   5286: ldc_w 164059267
    //   5289: ixor
    //   5290: ldc2_w -196005812
    //   5293: l2i
    //   5294: ldc_w -683752948
    //   5297: ixor
    //   5298: ixor
    //   5299: lookupswitch default -> 5324, -1435862388 -> 5282, 2137035021 -> 5950
    //   5324: aload_0
    //   5325: new bigname/zprestige/webhack/features/setting/Setting
    //   5328: dup
    //   5329: ldc_w '흶㌕휽㶿擟㧫๽꫆'
    //   5332: getstatic Perryc.1 : I
    //   5335: ifeq -> 5349
    //   5338: ldc2_w -975867450
    //   5341: l2i
    //   5342: ldc_w -883649370
    //   5345: ixor
    //   5346: goto -> 5357
    //   5349: ldc2_w 567284391
    //   5352: l2i
    //   5353: ldc_w 1675896580
    //   5356: ixor
    //   5357: ldc2_w 1906242645
    //   5360: l2i
    //   5361: ldc_w -477023191
    //   5364: ixor
    //   5365: ixor
    //   5366: lookupswitch default -> 5392, -1668405988 -> 5992, -1121255913 -> 5349
    //   5392: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5395: ldc_w 3.0942102E38
    //   5398: invokestatic floatToIntBits : (F)I
    //   5401: ldc_w 2137573458
    //   5404: ixor
    //   5405: invokestatic intBitsToFloat : (I)F
    //   5408: getstatic Perryc.c : I
    //   5411: iflt -> 5425
    //   5414: ldc2_w 1318981824
    //   5417: l2i
    //   5418: ldc_w 1819582348
    //   5421: ixor
    //   5422: goto -> 5433
    //   5425: ldc2_w 1524425069
    //   5428: l2i
    //   5429: ldc_w -1398780979
    //   5432: ixor
    //   5433: ldc2_w 914805106
    //   5436: l2i
    //   5437: ldc_w -458070974
    //   5440: ixor
    //   5441: ixor
    //   5442: lookupswitch default -> 5468, -1517085216 -> 5425, -253871492 -> 5976
    //   5468: invokestatic valueOf : (F)Ljava/lang/Float;
    //   5471: ldc_w -7.181914
    //   5474: invokestatic floatToIntBits : (F)I
    //   5477: ldc_w 2137379389
    //   5480: ixor
    //   5481: invokestatic intBitsToFloat : (I)F
    //   5484: getstatic Perryc.c : I
    //   5487: iflt -> 5501
    //   5490: ldc2_w -713297420
    //   5493: l2i
    //   5494: ldc_w -1684152541
    //   5497: ixor
    //   5498: goto -> 5509
    //   5501: ldc2_w -462445767
    //   5504: l2i
    //   5505: ldc_w 970547662
    //   5508: ixor
    //   5509: ldc2_w 1045903334
    //   5512: l2i
    //   5513: ldc_w 29044853
    //   5516: ixor
    //   5517: ixor
    //   5518: lookupswitch default -> 5544, 927084636 -> 5501, 1896491332 -> 6070
    //   5544: invokestatic valueOf : (F)Ljava/lang/Float;
    //   5547: ldc_w 30.468573
    //   5550: invokestatic floatToIntBits : (F)I
    //   5553: ldc_w 2121514915
    //   5556: ixor
    //   5557: invokestatic intBitsToFloat : (I)F
    //   5560: getstatic Perryc.0 : I
    //   5563: ifle -> 5577
    //   5566: ldc2_w -1006242340
    //   5569: l2i
    //   5570: ldc_w -2131952941
    //   5573: ixor
    //   5574: goto -> 5585
    //   5577: ldc2_w 1975918009
    //   5580: l2i
    //   5581: ldc_w -60498358
    //   5584: ixor
    //   5585: ldc2_w 115473276
    //   5588: l2i
    //   5589: ldc_w 1122078166
    //   5592: ixor
    //   5593: ixor
    //   5594: lookupswitch default -> 6014, -844974759 -> 5620, 15301029 -> 5577
    //   5620: invokestatic valueOf : (F)Ljava/lang/Float;
    //   5623: getstatic Perryc.c : I
    //   5626: iflt -> 5640
    //   5629: ldc2_w -1723113182
    //   5632: l2i
    //   5633: ldc_w -168683990
    //   5636: ixor
    //   5637: goto -> 5648
    //   5640: ldc2_w 1971678754
    //   5643: l2i
    //   5644: ldc_w -2038976170
    //   5647: ixor
    //   5648: ldc2_w 416759902
    //   5651: l2i
    //   5652: ldc_w 1541589480
    //   5655: ixor
    //   5656: ixor
    //   5657: lookupswitch default -> 5684, -263846749 -> 5640, 797769406 -> 5946
    //   5684: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5687: getstatic Perryc.c : I
    //   5690: iflt -> 5704
    //   5693: ldc2_w -1665080967
    //   5696: l2i
    //   5697: ldc_w -846694841
    //   5700: ixor
    //   5701: goto -> 5712
    //   5704: ldc2_w -1575679049
    //   5707: l2i
    //   5708: ldc_w 451551201
    //   5711: ixor
    //   5712: ldc2_w 192523060
    //   5715: l2i
    //   5716: ldc_w 1210516969
    //   5719: ixor
    //   5720: ixor
    //   5721: lookupswitch default -> 5748, 303446499 -> 6008, 2136764122 -> 5704
    //   5748: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5751: getstatic Perryc.c : I
    //   5754: iflt -> 5768
    //   5757: ldc2_w -390920863
    //   5760: l2i
    //   5761: ldc_w -1223326797
    //   5764: ixor
    //   5765: goto -> 5776
    //   5768: ldc2_w -551345499
    //   5771: l2i
    //   5772: ldc_w 1079670894
    //   5775: ixor
    //   5776: ldc2_w 1189289488
    //   5779: l2i
    //   5780: ldc_w -2001319459
    //   5783: ixor
    //   5784: ixor
    //   5785: lookupswitch default -> 5972, -1846292193 -> 5768, 1361841414 -> 5812
    //   5812: putfield offhandZ : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5815: getstatic Perryc.1 : I
    //   5818: ifeq -> 5832
    //   5821: ldc2_w 747352714
    //   5824: l2i
    //   5825: ldc_w 1797978033
    //   5828: ixor
    //   5829: goto -> 5840
    //   5832: ldc2_w -1793249950
    //   5835: l2i
    //   5836: ldc_w 1473216128
    //   5839: ixor
    //   5840: ldc2_w 963305788
    //   5843: l2i
    //   5844: ldc_w -828710444
    //   5847: ixor
    //   5848: ixor
    //   5849: lookupswitch default -> 5876, -1336850989 -> 5942, 1943131859 -> 5832
    //   5876: aload_0
    //   5877: getstatic Perryc.c : I
    //   5880: iflt -> 5894
    //   5883: ldc2_w 2075003573
    //   5886: l2i
    //   5887: ldc_w 1918989210
    //   5890: ixor
    //   5891: goto -> 5902
    //   5894: ldc2_w -2012073175
    //   5897: l2i
    //   5898: ldc_w 1341595457
    //   5901: ixor
    //   5902: ldc2_w 193891389
    //   5905: l2i
    //   5906: ldc_w -1443954797
    //   5909: ixor
    //   5910: ixor
    //   5911: lookupswitch default -> 6086, -1414591871 -> 5894, 1703239622 -> 5936
    //   5936: invokespecial setInstance : ()V
    //   5939: return
    //   5940: aconst_null
    //   5941: athrow
    //   5942: aconst_null
    //   5943: athrow
    //   5944: aconst_null
    //   5945: athrow
    //   5946: aconst_null
    //   5947: athrow
    //   5948: aconst_null
    //   5949: athrow
    //   5950: aconst_null
    //   5951: athrow
    //   5952: aconst_null
    //   5953: athrow
    //   5954: aconst_null
    //   5955: athrow
    //   5956: aconst_null
    //   5957: athrow
    //   5958: aconst_null
    //   5959: athrow
    //   5960: aconst_null
    //   5961: athrow
    //   5962: aconst_null
    //   5963: athrow
    //   5964: aconst_null
    //   5965: athrow
    //   5966: aconst_null
    //   5967: athrow
    //   5968: aconst_null
    //   5969: athrow
    //   5970: aconst_null
    //   5971: athrow
    //   5972: aconst_null
    //   5973: athrow
    //   5974: aconst_null
    //   5975: athrow
    //   5976: aconst_null
    //   5977: athrow
    //   5978: aconst_null
    //   5979: athrow
    //   5980: aconst_null
    //   5981: athrow
    //   5982: aconst_null
    //   5983: athrow
    //   5984: aconst_null
    //   5985: athrow
    //   5986: aconst_null
    //   5987: athrow
    //   5988: aconst_null
    //   5989: athrow
    //   5990: aconst_null
    //   5991: athrow
    //   5992: aconst_null
    //   5993: athrow
    //   5994: aconst_null
    //   5995: athrow
    //   5996: aconst_null
    //   5997: athrow
    //   5998: aconst_null
    //   5999: athrow
    //   6000: aconst_null
    //   6001: athrow
    //   6002: aconst_null
    //   6003: athrow
    //   6004: aconst_null
    //   6005: athrow
    //   6006: aconst_null
    //   6007: athrow
    //   6008: aconst_null
    //   6009: athrow
    //   6010: aconst_null
    //   6011: athrow
    //   6012: aconst_null
    //   6013: athrow
    //   6014: aconst_null
    //   6015: athrow
    //   6016: aconst_null
    //   6017: athrow
    //   6018: aconst_null
    //   6019: athrow
    //   6020: aconst_null
    //   6021: athrow
    //   6022: aconst_null
    //   6023: athrow
    //   6024: aconst_null
    //   6025: athrow
    //   6026: aconst_null
    //   6027: athrow
    //   6028: aconst_null
    //   6029: athrow
    //   6030: aconst_null
    //   6031: athrow
    //   6032: aconst_null
    //   6033: athrow
    //   6034: aconst_null
    //   6035: athrow
    //   6036: aconst_null
    //   6037: athrow
    //   6038: aconst_null
    //   6039: athrow
    //   6040: aconst_null
    //   6041: athrow
    //   6042: aconst_null
    //   6043: athrow
    //   6044: aconst_null
    //   6045: athrow
    //   6046: aconst_null
    //   6047: athrow
    //   6048: aconst_null
    //   6049: athrow
    //   6050: aconst_null
    //   6051: athrow
    //   6052: aconst_null
    //   6053: athrow
    //   6054: aconst_null
    //   6055: athrow
    //   6056: aconst_null
    //   6057: athrow
    //   6058: aconst_null
    //   6059: athrow
    //   6060: aconst_null
    //   6061: athrow
    //   6062: aconst_null
    //   6063: athrow
    //   6064: aconst_null
    //   6065: athrow
    //   6066: aconst_null
    //   6067: athrow
    //   6068: aconst_null
    //   6069: athrow
    //   6070: aconst_null
    //   6071: athrow
    //   6072: aconst_null
    //   6073: athrow
    //   6074: aconst_null
    //   6075: athrow
    //   6076: aconst_null
    //   6077: athrow
    //   6078: aconst_null
    //   6079: athrow
    //   6080: aconst_null
    //   6081: athrow
    //   6082: aconst_null
    //   6083: athrow
    //   6084: aconst_null
    //   6085: athrow
    //   6086: aconst_null
    //   6087: athrow
    //   6088: aconst_null
    //   6089: athrow
    //   6090: aconst_null
    //   6091: athrow
    //   6092: aconst_null
    //   6093: athrow
    //   6094: aconst_null
    //   6095: athrow
    //   6096: aconst_null
    //   6097: athrow
    //   6098: aconst_null
    //   6099: athrow
    //   6100: aconst_null
    //   6101: athrow
    //   6102: aconst_null
    //   6103: athrow
    //   6104: aconst_null
    //   6105: athrow
    //   6106: aconst_null
    //   6107: athrow
    //   6108: aconst_null
    //   6109: athrow
    //   6110: aconst_null
    //   6111: athrow
    //   6112: aconst_null
    //   6113: athrow
    //   6114: aconst_null
    //   6115: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5940	0	this	Lbigname/zprestige/webhack/features/modules/Render/Viewmodel;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\Viewmodel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */