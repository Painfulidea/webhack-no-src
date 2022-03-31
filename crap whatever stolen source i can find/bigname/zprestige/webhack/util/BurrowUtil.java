package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class BurrowUtil implements Util {
  public static Minecraft mc;
  
  public static EnumFacing getFirstFacing(BlockPos paramBlockPos) {
    return Perry1.03(null, (int)-552693798L ^ 0x97BD7C85, paramBlockPos);
  }
  
  public static int findHotbarBlock(Class paramClass) {
    return Perry1.05(null, (int)-1760558071L ^ 0xFD668B5B, paramClass);
  }
  
  public static float[] getLegitRotations(Vec3d paramVec3d) {
    return Perry1.6w(null, (int)-1466365176L ^ 0xEECC8139, paramVec3d);
  }
  
  public static List getPossibleSides(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2747
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2739
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2731
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 44
    //   34: ldc2_w 845964546
    //   37: l2i
    //   38: ldc 1735964083
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w -2010032917
    //   47: l2i
    //   48: ldc 260407044
    //   50: ixor
    //   51: ldc2_w 1116324257
    //   54: l2i
    //   55: ldc -194702866
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -470286082 -> 2648, 464035500 -> 44
    //   84: goto -> 88
    //   87: athrow
    //   88: invokespecial <init> : ()V
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.0 : I
    //   98: ifle -> 111
    //   101: ldc2_w 1479877353
    //   104: l2i
    //   105: ldc 1787329904
    //   107: ixor
    //   108: goto -> 118
    //   111: ldc2_w -1484860810
    //   114: l2i
    //   115: ldc -1184927016
    //   117: ixor
    //   118: ldc2_w 2063002203
    //   121: l2i
    //   122: ldc -1120869644
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 152, -176466122 -> 2654, 1120242942 -> 111
    //   152: astore_1
    //   153: getstatic Perryc.1 : I
    //   156: ifeq -> 169
    //   159: ldc2_w -638804565
    //   162: l2i
    //   163: ldc -207900179
    //   165: ixor
    //   166: goto -> 176
    //   169: ldc2_w -1285094328
    //   172: l2i
    //   173: ldc -992055339
    //   175: ixor
    //   176: ldc2_w 1147757654
    //   179: l2i
    //   180: ldc -1218779105
    //   182: ixor
    //   183: ixor
    //   184: lookupswitch default -> 2680, -2071271468 -> 212, -649814001 -> 169
    //   212: goto -> 216
    //   215: athrow
    //   216: invokestatic values : ()[Lnet/minecraft/util/EnumFacing;
    //   219: goto -> 223
    //   222: athrow
    //   223: getstatic Perryc.c : I
    //   226: iflt -> 239
    //   229: ldc2_w -1853541596
    //   232: l2i
    //   233: ldc -366635436
    //   235: ixor
    //   236: goto -> 246
    //   239: ldc2_w 2034154120
    //   242: l2i
    //   243: ldc -1829139123
    //   245: ixor
    //   246: ldc2_w -802852632
    //   249: l2i
    //   250: ldc 653594161
    //   252: ixor
    //   253: ixor
    //   254: lookupswitch default -> 280, -1921983575 -> 2674, -998289314 -> 239
    //   280: astore_2
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 297
    //   287: ldc2_w 223392422
    //   290: l2i
    //   291: ldc -531588974
    //   293: ixor
    //   294: goto -> 304
    //   297: ldc2_w -242361792
    //   300: l2i
    //   301: ldc 2001561881
    //   303: ixor
    //   304: ldc2_w 2141419527
    //   307: l2i
    //   308: ldc 631780247
    //   310: ixor
    //   311: ixor
    //   312: lookupswitch default -> 2712, -1223990876 -> 297, -590612279 -> 340
    //   340: aload_2
    //   341: arraylength
    //   342: getstatic Perryc.1 : I
    //   345: ifeq -> 358
    //   348: ldc2_w 1720603106
    //   351: l2i
    //   352: ldc -1479563934
    //   354: ixor
    //   355: goto -> 365
    //   358: ldc2_w -1241037653
    //   361: l2i
    //   362: ldc 190088469
    //   364: ixor
    //   365: ldc2_w 1196651995
    //   368: l2i
    //   369: ldc 839064537
    //   371: ixor
    //   372: ixor
    //   373: lookupswitch default -> 400, -1273914750 -> 2662, -779038191 -> 358
    //   400: istore_3
    //   401: ldc2_w -523003021
    //   404: l2i
    //   405: ldc -523003021
    //   407: ixor
    //   408: getstatic Perryc.c : I
    //   411: iflt -> 424
    //   414: ldc2_w -1858199422
    //   417: l2i
    //   418: ldc 292056475
    //   420: ixor
    //   421: goto -> 431
    //   424: ldc2_w -1039927426
    //   427: l2i
    //   428: ldc 1224145934
    //   430: ixor
    //   431: ldc2_w -785402708
    //   434: l2i
    //   435: ldc -328082094
    //   437: ixor
    //   438: ixor
    //   439: lookupswitch default -> 464, -1123539737 -> 2656, 1158275131 -> 424
    //   464: istore #4
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w -94114966
    //   475: l2i
    //   476: ldc 1280102437
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w -417096090
    //   485: l2i
    //   486: ldc 2120018498
    //   488: ixor
    //   489: ldc2_w 1841500226
    //   492: l2i
    //   493: ldc -1318957186
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 2698, 1172187928 -> 524, 1787716723 -> 482
    //   524: iload #4
    //   526: getstatic Perryc.1 : I
    //   529: ifeq -> 542
    //   532: ldc2_w -1286649208
    //   535: l2i
    //   536: ldc 1001920051
    //   538: ixor
    //   539: goto -> 549
    //   542: ldc2_w 740248325
    //   545: l2i
    //   546: ldc 69017273
    //   548: ixor
    //   549: ldc2_w -860300740
    //   552: l2i
    //   553: ldc 149393470
    //   555: ixor
    //   556: ixor
    //   557: lookupswitch default -> 584, 1286084281 -> 2676, 1911029406 -> 542
    //   584: iload_3
    //   585: if_icmpge -> 598
    //   588: ldc2_w -548627165
    //   591: l2i
    //   592: ldc 1827708954
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w 380229903
    //   601: l2i
    //   602: ldc -1525291977
    //   604: ixor
    //   605: ldc2_w -2087444824
    //   608: l2i
    //   609: ldc 1897541463
    //   611: ixor
    //   612: ixor
    //   613: tableswitch default -> 588, 1093799110 -> 636, 1093799111 -> 2584
    //   636: getstatic Perryc.0 : I
    //   639: ifle -> 652
    //   642: ldc2_w 1143782219
    //   645: l2i
    //   646: ldc -1325607611
    //   648: ixor
    //   649: goto -> 659
    //   652: ldc2_w 1719856612
    //   655: l2i
    //   656: ldc 1280441946
    //   658: ixor
    //   659: ldc2_w 1752315271
    //   662: l2i
    //   663: ldc -656269427
    //   665: ixor
    //   666: ixor
    //   667: lookupswitch default -> 2672, -1706870348 -> 692, 1145062404 -> 652
    //   692: aload_2
    //   693: getstatic Perryc.1 : I
    //   696: ifeq -> 709
    //   699: ldc2_w -2060261727
    //   702: l2i
    //   703: ldc -1272443059
    //   705: ixor
    //   706: goto -> 716
    //   709: ldc2_w -625870196
    //   712: l2i
    //   713: ldc 1417239620
    //   715: ixor
    //   716: ldc2_w 227336913
    //   719: l2i
    //   720: ldc -1289018670
    //   722: ixor
    //   723: ixor
    //   724: lookupswitch default -> 752, -1883428369 -> 2652, -1311801565 -> 709
    //   752: iload #4
    //   754: aaload
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 771
    //   761: ldc2_w -1184882558
    //   764: l2i
    //   765: ldc 308566494
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w -486341335
    //   774: l2i
    //   775: ldc 1777651915
    //   777: ixor
    //   778: ldc2_w 264016
    //   781: l2i
    //   782: ldc 1903340784
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 2716, -630009092 -> 771, -75399614 -> 812
    //   812: astore #5
    //   814: getstatic Perryc.c : I
    //   817: iflt -> 830
    //   820: ldc2_w -1048029509
    //   823: l2i
    //   824: ldc 22053514
    //   826: ixor
    //   827: goto -> 837
    //   830: ldc2_w -1556535370
    //   833: l2i
    //   834: ldc 1536966895
    //   836: ixor
    //   837: ldc2_w 1256505765
    //   840: l2i
    //   841: ldc -614647508
    //   843: ixor
    //   844: ixor
    //   845: lookupswitch default -> 872, -1634563917 -> 830, 1365322936 -> 2688
    //   872: aload_0
    //   873: getstatic Perryc.0 : I
    //   876: ifle -> 889
    //   879: ldc2_w -327398244
    //   882: l2i
    //   883: ldc 2138532095
    //   885: ixor
    //   886: goto -> 896
    //   889: ldc2_w 836965520
    //   892: l2i
    //   893: ldc 1442963267
    //   895: ixor
    //   896: ldc2_w -232375569
    //   899: l2i
    //   900: ldc -1229332583
    //   902: ixor
    //   903: ixor
    //   904: lookupswitch default -> 2692, -678117099 -> 889, 595406501 -> 932
    //   932: aload #5
    //   934: getstatic Perryc.1 : I
    //   937: ifeq -> 950
    //   940: ldc2_w -1429620961
    //   943: l2i
    //   944: ldc -1769363067
    //   946: ixor
    //   947: goto -> 957
    //   950: ldc2_w 1428038753
    //   953: l2i
    //   954: ldc -1413236152
    //   956: ixor
    //   957: ldc2_w -1371930443
    //   960: l2i
    //   961: ldc -201064609
    //   963: ixor
    //   964: ixor
    //   965: lookupswitch default -> 992, -1446851226 -> 950, 1719263600 -> 2718
    //   992: goto -> 996
    //   995: athrow
    //   996: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   999: goto -> 1003
    //   1002: athrow
    //   1003: getstatic Perryc.0 : I
    //   1006: ifle -> 1019
    //   1009: ldc2_w 115659472
    //   1012: l2i
    //   1013: ldc -1245552133
    //   1015: ixor
    //   1016: goto -> 1026
    //   1019: ldc2_w -2084775864
    //   1022: l2i
    //   1023: ldc -1233756345
    //   1025: ixor
    //   1026: ldc2_w -1575428196
    //   1029: l2i
    //   1030: ldc -1714115499
    //   1032: ixor
    //   1033: ixor
    //   1034: lookupswitch default -> 1060, -1997881118 -> 2670, -302263733 -> 1019
    //   1060: astore #6
    //   1062: getstatic Perryc.1 : I
    //   1065: ifeq -> 1078
    //   1068: ldc2_w -977253946
    //   1071: l2i
    //   1072: ldc -200650856
    //   1074: ixor
    //   1075: goto -> 1086
    //   1078: ldc2_w 2021888993
    //   1081: l2i
    //   1082: ldc_w -1404391380
    //   1085: ixor
    //   1086: ldc2_w 1914038642
    //   1089: l2i
    //   1090: ldc_w 1788913868
    //   1093: ixor
    //   1094: ixor
    //   1095: lookupswitch default -> 1120, -1507678643 -> 1078, 696207328 -> 2664
    //   1120: getstatic bigname/zprestige/webhack/util/BurrowUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1123: getstatic Perryc.1 : I
    //   1126: ifeq -> 1140
    //   1129: ldc2_w 431480125
    //   1132: l2i
    //   1133: ldc_w 1425757960
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -1021659279
    //   1143: l2i
    //   1144: ldc_w -1508375978
    //   1147: ixor
    //   1148: ldc2_w 1185329265
    //   1151: l2i
    //   1152: ldc_w -474517552
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1184, -877481420 -> 1140, -396536428 -> 2650
    //   1184: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1187: getstatic Perryc.0 : I
    //   1190: ifle -> 1204
    //   1193: ldc2_w -204710790
    //   1196: l2i
    //   1197: ldc_w 857397587
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 854903124
    //   1207: l2i
    //   1208: ldc_w 2033786367
    //   1211: ixor
    //   1212: ldc2_w 1642991677
    //   1215: l2i
    //   1216: ldc_w 826350013
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 1248, -1871082327 -> 2708, 416898752 -> 1204
    //   1248: aload #6
    //   1250: getstatic Perryc.1 : I
    //   1253: ifeq -> 1267
    //   1256: ldc2_w 944412985
    //   1259: l2i
    //   1260: ldc_w -131956446
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w -1181944910
    //   1270: l2i
    //   1271: ldc_w 843549708
    //   1274: ixor
    //   1275: ldc2_w 706281076
    //   1278: l2i
    //   1279: ldc_w 348621836
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 2702, -1256976954 -> 1312, -21534109 -> 1267
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1319: goto -> 1323
    //   1322: athrow
    //   1323: getstatic Perryc.1 : I
    //   1326: ifeq -> 1340
    //   1329: ldc2_w 1441935777
    //   1332: l2i
    //   1333: ldc_w 1583394598
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w 1725030554
    //   1343: l2i
    //   1344: ldc_w -769974988
    //   1347: ixor
    //   1348: ldc2_w -314489096
    //   1351: l2i
    //   1352: ldc_w -1873856823
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 2666, -909865569 -> 1384, 1989996214 -> 1340
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1393: goto -> 1397
    //   1396: athrow
    //   1397: getstatic Perryc.1 : I
    //   1400: ifeq -> 1414
    //   1403: ldc2_w 962235889
    //   1406: l2i
    //   1407: ldc_w -349165201
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w 1174913199
    //   1417: l2i
    //   1418: ldc_w 822051250
    //   1421: ixor
    //   1422: ldc2_w -1322047393
    //   1425: l2i
    //   1426: ldc_w 2129973720
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 2690, -1187006310 -> 1456, 497900825 -> 1414
    //   1456: getstatic bigname/zprestige/webhack/util/BurrowUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1459: getstatic Perryc.1 : I
    //   1462: ifeq -> 1476
    //   1465: ldc2_w -1467022298
    //   1468: l2i
    //   1469: ldc_w 802077231
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w -851367322
    //   1479: l2i
    //   1480: ldc_w -965579010
    //   1483: ixor
    //   1484: ldc2_w 1768635751
    //   1487: l2i
    //   1488: ldc_w 1949963238
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 1520, -1939536293 -> 1476, -1710190456 -> 2658
    //   1520: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1523: getstatic Perryc.c : I
    //   1526: iflt -> 1540
    //   1529: ldc2_w -103298319
    //   1532: l2i
    //   1533: ldc_w 1455321690
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w 1805516844
    //   1543: l2i
    //   1544: ldc_w -870871116
    //   1547: ixor
    //   1548: ldc2_w 246032032
    //   1551: l2i
    //   1552: ldc_w 1041606338
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 2720, -1758064646 -> 1584, -1613350711 -> 1540
    //   1584: aload #6
    //   1586: getstatic Perryc.c : I
    //   1589: iflt -> 1603
    //   1592: ldc2_w 1468305585
    //   1595: l2i
    //   1596: ldc_w -1702992084
    //   1599: ixor
    //   1600: goto -> 1611
    //   1603: ldc2_w 1113303490
    //   1606: l2i
    //   1607: ldc_w -1775989043
    //   1610: ixor
    //   1611: ldc2_w 228195556
    //   1614: l2i
    //   1615: ldc_w -126346318
    //   1618: ixor
    //   1619: ixor
    //   1620: lookupswitch default -> 1648, -394673298 -> 1603, 941297867 -> 2682
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: ldc2_w -500275120
    //   1662: l2i
    //   1663: ldc_w -500275120
    //   1666: ixor
    //   1667: getstatic Perryc.1 : I
    //   1670: ifeq -> 1684
    //   1673: ldc2_w 986492024
    //   1676: l2i
    //   1677: ldc_w 177107585
    //   1680: ixor
    //   1681: goto -> 1692
    //   1684: ldc2_w 1996760279
    //   1687: l2i
    //   1688: ldc_w -1694104896
    //   1691: ixor
    //   1692: ldc2_w -873710956
    //   1695: l2i
    //   1696: ldc_w -1890894173
    //   1699: ixor
    //   1700: ixor
    //   1701: lookupswitch default -> 2646, -1465572832 -> 1728, 1961220814 -> 1684
    //   1728: goto -> 1732
    //   1731: athrow
    //   1732: invokevirtual func_176209_a : (Lnet/minecraft/block/state/IBlockState;Z)Z
    //   1735: goto -> 1739
    //   1738: athrow
    //   1739: ifeq -> 1753
    //   1742: ldc2_w 1821213160
    //   1745: l2i
    //   1746: ldc_w -968294292
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -1230250777
    //   1756: l2i
    //   1757: ldc_w 477060448
    //   1760: ixor
    //   1761: ldc2_w 944373297
    //   1764: l2i
    //   1765: ldc_w -1767444144
    //   1768: ixor
    //   1769: ixor
    //   1770: tableswitch default -> 1742, 69963493 -> 1792, 69963494 -> 2578
    //   1792: getstatic Perryc.1 : I
    //   1795: ifeq -> 1809
    //   1798: ldc2_w -685933640
    //   1801: l2i
    //   1802: ldc_w 798859110
    //   1805: ixor
    //   1806: goto -> 1817
    //   1809: ldc2_w -1402841842
    //   1812: l2i
    //   1813: ldc_w 243904237
    //   1816: ixor
    //   1817: ldc2_w 1913512488
    //   1820: l2i
    //   1821: ldc_w 1131679025
    //   1824: ixor
    //   1825: ixor
    //   1826: lookupswitch default -> 1852, -1339502870 -> 1809, -906425401 -> 2704
    //   1852: getstatic bigname/zprestige/webhack/util/BurrowUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1855: getstatic Perryc.1 : I
    //   1858: ifeq -> 1872
    //   1861: ldc2_w 1426369136
    //   1864: l2i
    //   1865: ldc_w -1739424502
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w -1939342544
    //   1875: l2i
    //   1876: ldc_w -2036319034
    //   1879: ixor
    //   1880: ldc2_w 242071551
    //   1883: l2i
    //   1884: ldc_w -173560614
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 1916, 916245599 -> 2694, 1676153087 -> 1872
    //   1916: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1919: getstatic Perryc.0 : I
    //   1922: ifle -> 1936
    //   1925: ldc2_w -383201043
    //   1928: l2i
    //   1929: ldc_w 1103103449
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w 1823756879
    //   1939: l2i
    //   1940: ldc_w -1627882263
    //   1943: ixor
    //   1944: ldc2_w -2020546749
    //   1947: l2i
    //   1948: ldc_w -2077948391
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 2660, -1419955090 -> 1936, -235286532 -> 1980
    //   1980: aload #6
    //   1982: getstatic Perryc.c : I
    //   1985: iflt -> 1999
    //   1988: ldc2_w 1161165609
    //   1991: l2i
    //   1992: ldc_w 219802574
    //   1995: ixor
    //   1996: goto -> 2007
    //   1999: ldc2_w -2088273980
    //   2002: l2i
    //   2003: ldc_w 2076111849
    //   2006: ixor
    //   2007: ldc2_w -2129867786
    //   2010: l2i
    //   2011: ldc_w -521879674
    //   2014: ixor
    //   2015: ixor
    //   2016: lookupswitch default -> 2696, -1714294691 -> 2044, 700736663 -> 1999
    //   2044: goto -> 2048
    //   2047: athrow
    //   2048: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2051: goto -> 2055
    //   2054: athrow
    //   2055: getstatic Perryc.0 : I
    //   2058: ifle -> 2072
    //   2061: ldc2_w 1956817012
    //   2064: l2i
    //   2065: ldc_w 1853731346
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w 1443307160
    //   2075: l2i
    //   2076: ldc_w 959295047
    //   2079: ixor
    //   2080: ldc2_w -1066976540
    //   2083: l2i
    //   2084: ldc_w 1483614873
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 2116, -2099901925 -> 2710, 904762748 -> 2072
    //   2116: astore #7
    //   2118: getstatic Perryc.c : I
    //   2121: iflt -> 2135
    //   2124: ldc2_w -347269316
    //   2127: l2i
    //   2128: ldc_w -1467937733
    //   2131: ixor
    //   2132: goto -> 2143
    //   2135: ldc2_w -568755719
    //   2138: l2i
    //   2139: ldc_w -1825554125
    //   2142: ixor
    //   2143: ldc2_w 941731798
    //   2146: l2i
    //   2147: ldc_w 95989149
    //   2150: ixor
    //   2151: ixor
    //   2152: lookupswitch default -> 2706, 1890597505 -> 2180, 2119506252 -> 2135
    //   2180: aload #7
    //   2182: getstatic Perryc.c : I
    //   2185: iflt -> 2199
    //   2188: ldc2_w 2116252389
    //   2191: l2i
    //   2192: ldc_w 1440817439
    //   2195: ixor
    //   2196: goto -> 2207
    //   2199: ldc2_w -1116860044
    //   2202: l2i
    //   2203: ldc_w 741097255
    //   2206: ixor
    //   2207: ldc2_w -1507578163
    //   2210: l2i
    //   2211: ldc_w -449447336
    //   2214: ixor
    //   2215: ixor
    //   2216: lookupswitch default -> 2244, 1379810935 -> 2199, 1758693231 -> 2714
    //   2244: goto -> 2248
    //   2247: athrow
    //   2248: invokeinterface func_185904_a : ()Lnet/minecraft/block/material/Material;
    //   2253: goto -> 2257
    //   2256: athrow
    //   2257: getstatic Perryc.1 : I
    //   2260: ifeq -> 2274
    //   2263: ldc2_w -48344957
    //   2266: l2i
    //   2267: ldc_w -1241134175
    //   2270: ixor
    //   2271: goto -> 2282
    //   2274: ldc2_w -1072547337
    //   2277: l2i
    //   2278: ldc_w -1227675535
    //   2281: ixor
    //   2282: ldc2_w -65301905
    //   2285: l2i
    //   2286: ldc_w -313689620
    //   2289: ixor
    //   2290: ixor
    //   2291: lookupswitch default -> 2316, 341402352 -> 2274, 1515024545 -> 2668
    //   2316: goto -> 2320
    //   2319: athrow
    //   2320: invokevirtual func_76222_j : ()Z
    //   2323: goto -> 2327
    //   2326: athrow
    //   2327: ifne -> 2341
    //   2330: ldc2_w 572646255
    //   2333: l2i
    //   2334: ldc_w -713550032
    //   2337: ixor
    //   2338: goto -> 2349
    //   2341: ldc2_w 651799351
    //   2344: l2i
    //   2345: ldc_w -780116119
    //   2348: ixor
    //   2349: ldc2_w -1834031746
    //   2352: l2i
    //   2353: ldc_w 1512766293
    //   2356: ixor
    //   2357: ixor
    //   2358: tableswitch default -> 2330, 1071508084 -> 2380, 1071508085 -> 2578
    //   2380: getstatic Perryc.0 : I
    //   2383: ifle -> 2397
    //   2386: ldc2_w -1983468475
    //   2389: l2i
    //   2390: ldc_w 2059583134
    //   2393: ixor
    //   2394: goto -> 2405
    //   2397: ldc2_w -1301009493
    //   2400: l2i
    //   2401: ldc_w 1825637937
    //   2404: ixor
    //   2405: ldc2_w 2089172592
    //   2408: l2i
    //   2409: ldc_w 1843575668
    //   2412: ixor
    //   2413: ixor
    //   2414: lookupswitch default -> 2440, -496986145 -> 2700, 1151950780 -> 2397
    //   2440: aload_1
    //   2441: getstatic Perryc.1 : I
    //   2444: ifeq -> 2458
    //   2447: ldc2_w 864514513
    //   2450: l2i
    //   2451: ldc_w -1015387982
    //   2454: ixor
    //   2455: goto -> 2466
    //   2458: ldc2_w 5771811
    //   2461: l2i
    //   2462: ldc_w -1970339411
    //   2465: ixor
    //   2466: ldc2_w 225107246
    //   2469: l2i
    //   2470: ldc_w 1657726057
    //   2473: ixor
    //   2474: ixor
    //   2475: lookupswitch default -> 2684, -1621549020 -> 2458, -445437239 -> 2500
    //   2500: aload #5
    //   2502: getstatic Perryc.c : I
    //   2505: iflt -> 2519
    //   2508: ldc2_w -1610646742
    //   2511: l2i
    //   2512: ldc_w 2064635846
    //   2515: ixor
    //   2516: goto -> 2527
    //   2519: ldc2_w -581277166
    //   2522: l2i
    //   2523: ldc_w 1679855733
    //   2526: ixor
    //   2527: ldc2_w -1183789100
    //   2530: l2i
    //   2531: ldc_w -690249873
    //   2534: ixor
    //   2535: ixor
    //   2536: lookupswitch default -> 2678, -1956905897 -> 2519, -690902308 -> 2564
    //   2564: goto -> 2568
    //   2567: athrow
    //   2568: invokeinterface add : (Ljava/lang/Object;)Z
    //   2573: goto -> 2577
    //   2576: athrow
    //   2577: pop
    //   2578: iinc #4, 1
    //   2581: goto -> 466
    //   2584: getstatic Perryc.1 : I
    //   2587: ifeq -> 2601
    //   2590: ldc2_w -1406291828
    //   2593: l2i
    //   2594: ldc_w 1403910468
    //   2597: ixor
    //   2598: goto -> 2609
    //   2601: ldc2_w -689409105
    //   2604: l2i
    //   2605: ldc_w 66007901
    //   2608: ixor
    //   2609: ldc2_w 951775197
    //   2612: l2i
    //   2613: ldc_w -1533491818
    //   2616: ixor
    //   2617: ixor
    //   2618: lookupswitch default -> 2644, -1510363945 -> 2601, 1671586691 -> 2686
    //   2644: aload_1
    //   2645: areturn
    //   2646: aconst_null
    //   2647: athrow
    //   2648: aconst_null
    //   2649: athrow
    //   2650: aconst_null
    //   2651: athrow
    //   2652: aconst_null
    //   2653: athrow
    //   2654: aconst_null
    //   2655: athrow
    //   2656: aconst_null
    //   2657: athrow
    //   2658: aconst_null
    //   2659: athrow
    //   2660: aconst_null
    //   2661: athrow
    //   2662: aconst_null
    //   2663: athrow
    //   2664: aconst_null
    //   2665: athrow
    //   2666: aconst_null
    //   2667: athrow
    //   2668: aconst_null
    //   2669: athrow
    //   2670: aconst_null
    //   2671: athrow
    //   2672: aconst_null
    //   2673: athrow
    //   2674: aconst_null
    //   2675: athrow
    //   2676: aconst_null
    //   2677: athrow
    //   2678: aconst_null
    //   2679: athrow
    //   2680: aconst_null
    //   2681: athrow
    //   2682: aconst_null
    //   2683: athrow
    //   2684: aconst_null
    //   2685: athrow
    //   2686: aconst_null
    //   2687: athrow
    //   2688: aconst_null
    //   2689: athrow
    //   2690: aconst_null
    //   2691: athrow
    //   2692: aconst_null
    //   2693: athrow
    //   2694: aconst_null
    //   2695: athrow
    //   2696: aconst_null
    //   2697: athrow
    //   2698: aconst_null
    //   2699: athrow
    //   2700: aconst_null
    //   2701: athrow
    //   2702: aconst_null
    //   2703: athrow
    //   2704: aconst_null
    //   2705: athrow
    //   2706: aconst_null
    //   2707: athrow
    //   2708: aconst_null
    //   2709: athrow
    //   2710: aconst_null
    //   2711: athrow
    //   2712: aconst_null
    //   2713: athrow
    //   2714: aconst_null
    //   2715: athrow
    //   2716: aconst_null
    //   2717: athrow
    //   2718: aconst_null
    //   2719: athrow
    //   2720: aconst_null
    //   2721: athrow
    //   2722: pop
    //   2723: goto -> 24
    //   2726: pop
    //   2727: aconst_null
    //   2728: goto -> 2722
    //   2731: dup
    //   2732: ifnull -> 2722
    //   2735: checkcast java/lang/Throwable
    //   2738: athrow
    //   2739: dup
    //   2740: ifnull -> 2726
    //   2743: checkcast java/lang/Throwable
    //   2746: athrow
    //   2747: aconst_null
    //   2748: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2118	460	7	blockState	Lnet/minecraft/block/state/IBlockState;
    //   1062	1516	6	neighbour	Lnet/minecraft/util/math/BlockPos;
    //   814	1764	5	side	Lnet/minecraft/util/EnumFacing;
    //   24	2622	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   153	2493	1	facings	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   153	2493	1	facings	Ljava/util/List<Lnet/minecraft/util/EnumFacing;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2731	java/lang/StringIndexOutOfBoundsException
    //   87	94	94	finally
    //   87	94	94	java/lang/IllegalStateException
    //   87	94	94	finally
    //   88	94	87	finally
    //   88	94	87	finally
    //   215	222	222	finally
    //   215	222	3	finally
    //   216	222	222	finally
    //   216	222	222	java/lang/EnumConstantNotPresentException
    //   216	222	215	finally
    //   995	1002	1002	finally
    //   995	1002	3	finally
    //   995	1002	1002	java/lang/IllegalStateException
    //   995	1002	995	finally
    //   996	1002	3	finally
    //   1315	1322	1322	finally
    //   1315	1322	1315	finally
    //   1315	1322	1315	finally
    //   1316	1322	3	finally
    //   1316	1322	3	finally
    //   1387	1396	1396	finally
    //   1387	1396	3	java/lang/NegativeArraySizeException
    //   1387	1396	1396	java/lang/UnsupportedOperationException
    //   1388	1396	1387	finally
    //   1388	1396	1396	finally
    //   1651	1658	1658	finally
    //   1651	1658	1658	java/lang/UnsupportedOperationException
    //   1651	1658	1651	finally
    //   1652	1658	3	java/util/NoSuchElementException
    //   1652	1658	1658	finally
    //   1731	1738	1738	finally
    //   1731	1738	1738	java/lang/NullPointerException
    //   1731	1738	1738	finally
    //   1731	1738	1731	java/lang/RuntimeException
    //   1732	1738	1738	finally
    //   2047	2054	2054	finally
    //   2047	2054	2047	java/lang/NullPointerException
    //   2047	2054	2054	finally
    //   2047	2054	2054	java/lang/StringIndexOutOfBoundsException
    //   2048	2054	3	finally
    //   2248	2256	2256	finally
    //   2248	2256	3	finally
    //   2248	2256	3	finally
    //   2248	2256	2256	java/lang/IndexOutOfBoundsException
    //   2248	2256	3	java/lang/RuntimeException
    //   2319	2326	2326	finally
    //   2319	2326	2326	finally
    //   2319	2326	2319	java/util/ConcurrentModificationException
    //   2319	2326	2326	finally
    //   2320	2326	2326	finally
    //   2568	2576	2576	finally
    //   2568	2576	3	java/lang/RuntimeException
    //   2568	2576	2576	finally
    //   2568	2576	3	java/lang/StringIndexOutOfBoundsException
    //   2568	2576	2576	java/lang/ClassCastException
    //   2731	2739	2731	finally
    //   2747	2749	3	finally
  }
  
  public static boolean placeBlock(BlockPos pos, EnumHand hand, boolean rotate, boolean packet, boolean isSneaking) {
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
  
  public static void rightClickBlock(BlockPos pos, Vec3d vec, EnumHand hand, EnumFacing direction, boolean packet) {
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
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -2061950750
    //   9: l2i
    //   10: ldc_w 522865478
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -258203704
    //   20: l2i
    //   21: ldc_w -1815175951
    //   24: ixor
    //   25: ldc2_w 308343066
    //   28: l2i
    //   29: ldc_w 760259548
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 128, -1526515358 -> 17, 1549980159 -> 60
    //   60: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   63: getstatic Perryc.0 : I
    //   66: ifle -> 80
    //   69: ldc2_w 1415967347
    //   72: l2i
    //   73: ldc_w -1513197928
    //   76: ixor
    //   77: goto -> 88
    //   80: ldc2_w -681372166
    //   83: l2i
    //   84: ldc_w -2034676062
    //   87: ixor
    //   88: ldc2_w 1666316799
    //   91: l2i
    //   92: ldc_w 2015396300
    //   95: ixor
    //   96: ixor
    //   97: lookupswitch default -> 124, -354753320 -> 130, 665036264 -> 80
    //   124: putstatic bigname/zprestige/webhack/util/BurrowUtil.mc : Lnet/minecraft/client/Minecraft;
    //   127: return
    //   128: aconst_null
    //   129: athrow
    //   130: aconst_null
    //   131: athrow
  }
  
  public static void faceVector(Vec3d vec, boolean normalizeAngle) {
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
  
  public static Vec3d getEyesPos() {
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
  
  public BurrowUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -657290323
    //   9: l2i
    //   10: ldc_w 930239886
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -741247902
    //   20: l2i
    //   21: ldc_w 2141219078
    //   24: ixor
    //   25: ldc2_w 1812277719
    //   28: l2i
    //   29: ldc_w 1321660172
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 124, -1900880961 -> 60, -849143560 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -670198669
    //   70: l2i
    //   71: ldc_w 2098241098
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -938014156
    //   81: l2i
    //   82: ldc_w -13904893
    //   85: ixor
    //   86: ldc2_w -734205780
    //   89: l2i
    //   90: ldc_w 1248383200
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 126, -1452743045 -> 120, 994652789 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/BurrowUtil;
  }
  
  public static void switchToSlot(int slot) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\BurrowUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */