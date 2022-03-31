package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class AutoTrap extends Module {
  public int placements;
  
  public Setting<Integer> blocksPerPlace;
  
  public int lastHotbarSlot;
  
  public static boolean isPlacing = (int)1394308503L ^ 0x531B7597;
  
  public Setting<Boolean> rotate;
  
  public Timer timer;
  
  public BlockPos startPos;
  
  public boolean smartRotate;
  
  public Setting<Boolean> antiScaffold;
  
  public Map<BlockPos, Integer> retries;
  
  public Setting<Boolean> raytrace;
  
  public Timer retryTimer;
  
  public EntityPlayer target;
  
  public boolean isSneaking;
  
  public boolean didPlace;
  
  public Setting<Integer> delay;
  
  public void placeList(List<Vec3d> list) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4306
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 4298
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4290
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 1615504263
    //   33: l2i
    //   34: ldc 446265958
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1135902583
    //   43: l2i
    //   44: ldc 924912151
    //   46: ixor
    //   47: ldc2_w 508287558
    //   50: l2i
    //   51: ldc 1137363687
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 4201, -689202625 -> 80, 659736896 -> 40
    //   80: aload_1
    //   81: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   86: getstatic Perryc.c : I
    //   89: iflt -> 102
    //   92: ldc2_w -1976658615
    //   95: l2i
    //   96: ldc 14693613
    //   98: ixor
    //   99: goto -> 109
    //   102: ldc2_w 540280369
    //   105: l2i
    //   106: ldc -915574773
    //   108: ixor
    //   109: ldc2_w 1741244811
    //   112: l2i
    //   113: ldc -1896697582
    //   115: ixor
    //   116: ixor
    //   117: lookupswitch default -> 4253, 6459043 -> 144, 1677023549 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokeinterface sort : (Ljava/util/Comparator;)V
    //   153: goto -> 157
    //   156: athrow
    //   157: getstatic Perryc.c : I
    //   160: iflt -> 173
    //   163: ldc2_w -6455203
    //   166: l2i
    //   167: ldc -252886870
    //   169: ixor
    //   170: goto -> 180
    //   173: ldc2_w 1489748250
    //   176: l2i
    //   177: ldc 1187459063
    //   179: ixor
    //   180: ldc2_w -1903462674
    //   183: l2i
    //   184: ldc -706350014
    //   186: ixor
    //   187: ixor
    //   188: lookupswitch default -> 216, -1233799917 -> 173, 1411269211 -> 4199
    //   216: aload_1
    //   217: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
    //   222: getstatic Perryc.c : I
    //   225: iflt -> 238
    //   228: ldc2_w 1592771274
    //   231: l2i
    //   232: ldc -1472789279
    //   234: ixor
    //   235: goto -> 245
    //   238: ldc2_w 56247489
    //   241: l2i
    //   242: ldc -83933880
    //   244: ixor
    //   245: ldc2_w -345927671
    //   248: l2i
    //   249: ldc -1017667924
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 280, -554776434 -> 4273, 1785573163 -> 238
    //   280: goto -> 284
    //   283: athrow
    //   284: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    //   287: goto -> 291
    //   290: athrow
    //   291: getstatic Perryc.1 : I
    //   294: ifeq -> 307
    //   297: ldc2_w -1979692077
    //   300: l2i
    //   301: ldc -665667778
    //   303: ixor
    //   304: goto -> 314
    //   307: ldc2_w -966559684
    //   310: l2i
    //   311: ldc 529961901
    //   313: ixor
    //   314: ldc2_w -1371806376
    //   317: l2i
    //   318: ldc 1646283438
    //   320: ixor
    //   321: ixor
    //   322: lookupswitch default -> 348, -1639361765 -> 4271, 737233463 -> 307
    //   348: goto -> 352
    //   351: athrow
    //   352: invokeinterface sort : (Ljava/util/Comparator;)V
    //   357: goto -> 361
    //   360: athrow
    //   361: getstatic Perryc.1 : I
    //   364: ifeq -> 377
    //   367: ldc2_w 1404195279
    //   370: l2i
    //   371: ldc 1670112450
    //   373: ixor
    //   374: goto -> 384
    //   377: ldc2_w -1014513525
    //   380: l2i
    //   381: ldc -528597929
    //   383: ixor
    //   384: ldc2_w -1405565004
    //   387: l2i
    //   388: ldc -886400126
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 420, 747639700 -> 377, 1462495547 -> 4189
    //   420: aload_1
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 437
    //   427: ldc2_w 743836080
    //   430: l2i
    //   431: ldc 880907419
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w 1117549330
    //   440: l2i
    //   441: ldc -390339930
    //   443: ixor
    //   444: ldc2_w 546589753
    //   447: l2i
    //   448: ldc -1214479071
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 480, -1881189325 -> 4193, 1692592557 -> 437
    //   480: goto -> 484
    //   483: athrow
    //   484: invokeinterface iterator : ()Ljava/util/Iterator;
    //   489: goto -> 493
    //   492: athrow
    //   493: getstatic Perryc.1 : I
    //   496: ifeq -> 509
    //   499: ldc2_w 13080295
    //   502: l2i
    //   503: ldc -67891416
    //   505: ixor
    //   506: goto -> 516
    //   509: ldc2_w 1003916152
    //   512: l2i
    //   513: ldc -208432304
    //   515: ixor
    //   516: ldc2_w 2033712077
    //   519: l2i
    //   520: ldc -384370423
    //   522: ixor
    //   523: ixor
    //   524: lookupswitch default -> 4181, 1482955500 -> 552, 1796381451 -> 509
    //   552: astore_2
    //   553: getstatic Perryc.1 : I
    //   556: ifeq -> 569
    //   559: ldc2_w 910859317
    //   562: l2i
    //   563: ldc -1299061548
    //   565: ixor
    //   566: goto -> 576
    //   569: ldc2_w 831244264
    //   572: l2i
    //   573: ldc -1635866896
    //   575: ixor
    //   576: ldc2_w -145590080
    //   579: l2i
    //   580: ldc -419445383
    //   582: ixor
    //   583: ixor
    //   584: lookupswitch default -> 612, -1787378344 -> 4203, 1973965356 -> 569
    //   612: aload_2
    //   613: getstatic Perryc.c : I
    //   616: iflt -> 629
    //   619: ldc2_w 419432681
    //   622: l2i
    //   623: ldc -1474408999
    //   625: ixor
    //   626: goto -> 636
    //   629: ldc2_w -739522708
    //   632: l2i
    //   633: ldc -736671710
    //   635: ixor
    //   636: ldc2_w -1848261554
    //   639: l2i
    //   640: ldc 1701306469
    //   642: ixor
    //   643: ixor
    //   644: lookupswitch default -> 672, -292846731 -> 629, 1168924955 -> 4249
    //   672: goto -> 676
    //   675: athrow
    //   676: invokeinterface hasNext : ()Z
    //   681: goto -> 685
    //   684: athrow
    //   685: ifeq -> 698
    //   688: ldc2_w 1212050388
    //   691: l2i
    //   692: ldc 491290509
    //   694: ixor
    //   695: goto -> 705
    //   698: ldc2_w -211122359
    //   701: l2i
    //   702: ldc -1508076781
    //   704: ixor
    //   705: ldc2_w -1732663267
    //   708: l2i
    //   709: ldc 1518085485
    //   711: ixor
    //   712: ixor
    //   713: tableswitch default -> 688, -1749837527 -> 736, -1749837526 -> 4166
    //   736: getstatic Perryc.0 : I
    //   739: ifle -> 752
    //   742: ldc2_w 559225950
    //   745: l2i
    //   746: ldc -870496401
    //   748: ixor
    //   749: goto -> 759
    //   752: ldc2_w -1260009593
    //   755: l2i
    //   756: ldc -1744711554
    //   758: ixor
    //   759: ldc2_w 1622583686
    //   762: l2i
    //   763: ldc -1979059424
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 792, -389601759 -> 752, 133628311 -> 4231
    //   792: aload_2
    //   793: getstatic Perryc.c : I
    //   796: iflt -> 809
    //   799: ldc2_w -140591228
    //   802: l2i
    //   803: ldc 1152988527
    //   805: ixor
    //   806: goto -> 816
    //   809: ldc2_w 982515522
    //   812: l2i
    //   813: ldc -1077149574
    //   815: ixor
    //   816: ldc2_w 1639474693
    //   819: l2i
    //   820: ldc 1510658754
    //   822: ixor
    //   823: ixor
    //   824: lookupswitch default -> 4251, -2003485140 -> 809, -1091482625 -> 852
    //   852: goto -> 856
    //   855: athrow
    //   856: invokeinterface next : ()Ljava/lang/Object;
    //   861: goto -> 865
    //   864: athrow
    //   865: checkcast net/minecraft/util/math/Vec3d
    //   868: getstatic Perryc.1 : I
    //   871: ifeq -> 884
    //   874: ldc2_w 1397419739
    //   877: l2i
    //   878: ldc -578450116
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w 1057681963
    //   887: l2i
    //   888: ldc_w -335725974
    //   891: ixor
    //   892: ldc2_w 641904724
    //   895: l2i
    //   896: ldc_w 259997781
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 4223, -1477274650 -> 884, -37078976 -> 928
    //   928: astore_3
    //   929: new net/minecraft/util/math/BlockPos
    //   932: dup
    //   933: getstatic Perryc.1 : I
    //   936: ifeq -> 950
    //   939: ldc2_w 657682402
    //   942: l2i
    //   943: ldc_w 560368902
    //   946: ixor
    //   947: goto -> 958
    //   950: ldc2_w -979394164
    //   953: l2i
    //   954: ldc_w 1930258914
    //   957: ixor
    //   958: ldc2_w -1797506388
    //   961: l2i
    //   962: ldc_w -1223164539
    //   965: ixor
    //   966: ixor
    //   967: lookupswitch default -> 4241, -1789325497 -> 992, 631121357 -> 950
    //   992: aload_3
    //   993: getstatic Perryc.1 : I
    //   996: ifeq -> 1010
    //   999: ldc2_w 1531750808
    //   1002: l2i
    //   1003: ldc_w -120123268
    //   1006: ixor
    //   1007: goto -> 1018
    //   1010: ldc2_w 252232133
    //   1013: l2i
    //   1014: ldc_w -1277667052
    //   1017: ixor
    //   1018: ldc2_w -32319748
    //   1021: l2i
    //   1022: ldc_w 484153941
    //   1025: ixor
    //   1026: ixor
    //   1027: lookupswitch default -> 4197, 1095955789 -> 1010, 1578751096 -> 1052
    //   1052: goto -> 1056
    //   1055: athrow
    //   1056: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   1059: goto -> 1063
    //   1062: athrow
    //   1063: getstatic Perryc.1 : I
    //   1066: ifeq -> 1080
    //   1069: ldc2_w 360460373
    //   1072: l2i
    //   1073: ldc_w 1453906845
    //   1076: ixor
    //   1077: goto -> 1088
    //   1080: ldc2_w 1100493150
    //   1083: l2i
    //   1084: ldc_w 861846083
    //   1087: ixor
    //   1088: ldc2_w -1146264614
    //   1091: l2i
    //   1092: ldc_w -403532897
    //   1095: ixor
    //   1096: ixor
    //   1097: lookupswitch default -> 1124, -431349899 -> 1080, 529210253 -> 4167
    //   1124: astore #4
    //   1126: getstatic Perryc.1 : I
    //   1129: ifeq -> 1143
    //   1132: ldc2_w 1747770048
    //   1135: l2i
    //   1136: ldc_w -1429928185
    //   1139: ixor
    //   1140: goto -> 1151
    //   1143: ldc2_w -1501130110
    //   1146: l2i
    //   1147: ldc_w 1179132573
    //   1150: ixor
    //   1151: ldc2_w -1875117101
    //   1154: l2i
    //   1155: ldc_w 2052192559
    //   1158: ixor
    //   1159: ixor
    //   1160: lookupswitch default -> 4237, 178565859 -> 1188, 679731003 -> 1143
    //   1188: aload #4
    //   1190: getstatic Perryc.1 : I
    //   1193: ifeq -> 1207
    //   1196: ldc2_w -1031141278
    //   1199: l2i
    //   1200: ldc_w -321269952
    //   1203: ixor
    //   1204: goto -> 1215
    //   1207: ldc2_w 1939505578
    //   1210: l2i
    //   1211: ldc_w -1346694681
    //   1214: ixor
    //   1215: ldc2_w 1813987467
    //   1218: l2i
    //   1219: ldc_w -406779574
    //   1222: ixor
    //   1223: ixor
    //   1224: lookupswitch default -> 4255, -1517449501 -> 1207, 1476385164 -> 1252
    //   1252: aload_0
    //   1253: getstatic Perryc.1 : I
    //   1256: ifeq -> 1270
    //   1259: ldc2_w -2074544901
    //   1262: l2i
    //   1263: ldc_w -789962261
    //   1266: ixor
    //   1267: goto -> 1278
    //   1270: ldc2_w -945267694
    //   1273: l2i
    //   1274: ldc_w 987074064
    //   1277: ixor
    //   1278: ldc2_w -1070909056
    //   1281: l2i
    //   1282: ldc_w -1080797097
    //   1285: ixor
    //   1286: ixor
    //   1287: lookupswitch default -> 4215, -2101169195 -> 1312, 722318535 -> 1270
    //   1312: getfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1315: getstatic Perryc.c : I
    //   1318: iflt -> 1332
    //   1321: ldc2_w -779399078
    //   1324: l2i
    //   1325: ldc_w -1987077605
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w 1494125763
    //   1335: l2i
    //   1336: ldc_w -1111490239
    //   1339: ixor
    //   1340: ldc2_w -2043268250
    //   1343: l2i
    //   1344: ldc_w 1433366534
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 4183, -1956804319 -> 1332, 932695778 -> 1376
    //   1376: goto -> 1380
    //   1379: athrow
    //   1380: invokevirtual getValue : ()Ljava/lang/Object;
    //   1383: goto -> 1387
    //   1386: athrow
    //   1387: checkcast java/lang/Boolean
    //   1390: getstatic Perryc.c : I
    //   1393: iflt -> 1407
    //   1396: ldc2_w 1058169132
    //   1399: l2i
    //   1400: ldc_w 1753003162
    //   1403: ixor
    //   1404: goto -> 1415
    //   1407: ldc2_w -14679698
    //   1410: l2i
    //   1411: ldc_w -1438544262
    //   1414: ixor
    //   1415: ldc2_w -1128288831
    //   1418: l2i
    //   1419: ldc_w -1937434673
    //   1422: ixor
    //   1423: ixor
    //   1424: lookupswitch default -> 1452, 1374982887 -> 1407, 1733586872 -> 4277
    //   1452: goto -> 1456
    //   1455: athrow
    //   1456: invokevirtual booleanValue : ()Z
    //   1459: goto -> 1463
    //   1462: athrow
    //   1463: getstatic Perryc.0 : I
    //   1466: ifle -> 1480
    //   1469: ldc2_w 253708699
    //   1472: l2i
    //   1473: ldc_w -1510733453
    //   1476: ixor
    //   1477: goto -> 1488
    //   1480: ldc2_w 571982230
    //   1483: l2i
    //   1484: ldc_w 509293285
    //   1487: ixor
    //   1488: ldc2_w -1463223367
    //   1491: l2i
    //   1492: ldc_w 1638858078
    //   1495: ixor
    //   1496: ixor
    //   1497: lookupswitch default -> 1524, 279071935 -> 1480, 1670202895 -> 4259
    //   1524: goto -> 1528
    //   1527: athrow
    //   1528: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   1531: goto -> 1535
    //   1534: athrow
    //   1535: getstatic Perryc.1 : I
    //   1538: ifeq -> 1552
    //   1541: ldc2_w -635312248
    //   1544: l2i
    //   1545: ldc_w 1680058141
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w 171314351
    //   1555: l2i
    //   1556: ldc_w -1516212726
    //   1559: ixor
    //   1560: ldc2_w 145935905
    //   1563: l2i
    //   1564: ldc_w -770754288
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 1596, -2061321060 -> 1552, 1690285988 -> 4205
    //   1596: istore #5
    //   1598: getstatic Perryc.1 : I
    //   1601: ifeq -> 1615
    //   1604: ldc2_w -1034142754
    //   1607: l2i
    //   1608: ldc_w 653136944
    //   1611: ixor
    //   1612: goto -> 1623
    //   1615: ldc2_w 2091408232
    //   1618: l2i
    //   1619: ldc_w -480287731
    //   1622: ixor
    //   1623: ldc2_w 2133126042
    //   1626: l2i
    //   1627: ldc_w -564826657
    //   1630: ixor
    //   1631: ixor
    //   1632: lookupswitch default -> 1660, -1839737446 -> 1615, 1170450859 -> 4219
    //   1660: iload #5
    //   1662: ldc2_w 548877372
    //   1665: l2i
    //   1666: ldc_w 548877373
    //   1669: ixor
    //   1670: if_icmpne -> 1684
    //   1673: ldc2_w -775143830
    //   1676: l2i
    //   1677: ldc_w 47382453
    //   1680: ixor
    //   1681: goto -> 1692
    //   1684: ldc2_w 1761616134
    //   1687: l2i
    //   1688: ldc_w -1172381478
    //   1691: ixor
    //   1692: ldc2_w 1851242500
    //   1695: l2i
    //   1696: ldc_w 1985888078
    //   1699: ixor
    //   1700: ixor
    //   1701: tableswitch default -> 1673, -887667051 -> 1724, -887667050 -> 3839
    //   1724: getstatic Perryc.0 : I
    //   1727: ifle -> 1741
    //   1730: ldc2_w -198816143
    //   1733: l2i
    //   1734: ldc_w -1249345540
    //   1737: ixor
    //   1738: goto -> 1749
    //   1741: ldc2_w -1677285560
    //   1744: l2i
    //   1745: ldc_w 598671904
    //   1748: ixor
    //   1749: ldc2_w -1951662586
    //   1752: l2i
    //   1753: ldc_w 1827473910
    //   1756: ixor
    //   1757: ixor
    //   1758: lookupswitch default -> 4265, -1494694275 -> 1741, 1492079256 -> 1784
    //   1784: aload_0
    //   1785: getstatic Perryc.c : I
    //   1788: iflt -> 1802
    //   1791: ldc2_w -1776585674
    //   1794: l2i
    //   1795: ldc_w -1200363211
    //   1798: ixor
    //   1799: goto -> 1810
    //   1802: ldc2_w -358849342
    //   1805: l2i
    //   1806: ldc_w -6494031
    //   1809: ixor
    //   1810: ldc2_w 380624917
    //   1813: l2i
    //   1814: ldc_w 1858567229
    //   1817: ixor
    //   1818: ixor
    //   1819: lookupswitch default -> 4211, 1442840875 -> 1802, 1835536475 -> 1844
    //   1844: getfield retries : Ljava/util/Map;
    //   1847: getstatic Perryc.0 : I
    //   1850: ifle -> 1864
    //   1853: ldc2_w -202595692
    //   1856: l2i
    //   1857: ldc_w -527709571
    //   1860: ixor
    //   1861: goto -> 1872
    //   1864: ldc2_w 1045532323
    //   1867: l2i
    //   1868: ldc_w -932185613
    //   1871: ixor
    //   1872: ldc2_w 814099311
    //   1875: l2i
    //   1876: ldc_w -1750761436
    //   1879: ixor
    //   1880: ixor
    //   1881: lookupswitch default -> 4233, -1270561886 -> 1864, 1360911387 -> 1908
    //   1908: aload #4
    //   1910: getstatic Perryc.1 : I
    //   1913: ifeq -> 1927
    //   1916: ldc2_w 984189897
    //   1919: l2i
    //   1920: ldc_w 416380571
    //   1923: ixor
    //   1924: goto -> 1935
    //   1927: ldc2_w -1806994981
    //   1930: l2i
    //   1931: ldc_w 373756296
    //   1934: ixor
    //   1935: ldc2_w -530929476
    //   1938: l2i
    //   1939: ldc_w -170823855
    //   1942: ixor
    //   1943: ixor
    //   1944: lookupswitch default -> 4179, -1752717378 -> 1972, 938687167 -> 1927
    //   1972: goto -> 1976
    //   1975: athrow
    //   1976: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1981: goto -> 1985
    //   1984: athrow
    //   1985: ifnull -> 1999
    //   1988: ldc2_w 1545480632
    //   1991: l2i
    //   1992: ldc_w -1743093744
    //   1995: ixor
    //   1996: goto -> 2007
    //   1999: ldc2_w -1054638381
    //   2002: l2i
    //   2003: ldc_w 86497144
    //   2006: ixor
    //   2007: ldc2_w 1734346930
    //   2010: l2i
    //   2011: ldc_w 1111851631
    //   2014: ixor
    //   2015: ixor
    //   2016: tableswitch default -> 1988, -517921931 -> 2040, -517921930 -> 2436
    //   2040: getstatic Perryc.1 : I
    //   2043: ifeq -> 2057
    //   2046: ldc2_w 398842034
    //   2049: l2i
    //   2050: ldc_w -807685382
    //   2053: ixor
    //   2054: goto -> 2065
    //   2057: ldc2_w -1335644459
    //   2060: l2i
    //   2061: ldc_w 1719060548
    //   2064: ixor
    //   2065: ldc2_w 1652434870
    //   2068: l2i
    //   2069: ldc_w -2006647661
    //   2072: ixor
    //   2073: ixor
    //   2074: lookupswitch default -> 2100, 839168365 -> 4213, 1001983853 -> 2057
    //   2100: aload_0
    //   2101: getstatic Perryc.1 : I
    //   2104: ifeq -> 2118
    //   2107: ldc2_w -1997000273
    //   2110: l2i
    //   2111: ldc_w -1040738790
    //   2114: ixor
    //   2115: goto -> 2126
    //   2118: ldc2_w 1178262643
    //   2121: l2i
    //   2122: ldc_w 2083453547
    //   2125: ixor
    //   2126: ldc2_w -1817244824
    //   2129: l2i
    //   2130: ldc_w -251622063
    //   2133: ixor
    //   2134: ixor
    //   2135: lookupswitch default -> 4239, 731914636 -> 2118, 1488691233 -> 2160
    //   2160: getfield retries : Ljava/util/Map;
    //   2163: getstatic Perryc.1 : I
    //   2166: ifeq -> 2180
    //   2169: ldc2_w 1871873844
    //   2172: l2i
    //   2173: ldc_w -1004053270
    //   2176: ixor
    //   2177: goto -> 2188
    //   2180: ldc2_w 1719924261
    //   2183: l2i
    //   2184: ldc_w -2042385083
    //   2187: ixor
    //   2188: ldc2_w -779723133
    //   2191: l2i
    //   2192: ldc_w 993509132
    //   2195: ixor
    //   2196: ixor
    //   2197: lookupswitch default -> 4235, 175225583 -> 2224, 1090796113 -> 2180
    //   2224: aload #4
    //   2226: getstatic Perryc.0 : I
    //   2229: ifle -> 2243
    //   2232: ldc2_w 173767406
    //   2235: l2i
    //   2236: ldc_w -1146870891
    //   2239: ixor
    //   2240: goto -> 2251
    //   2243: ldc2_w 409811613
    //   2246: l2i
    //   2247: ldc_w -928608186
    //   2250: ixor
    //   2251: ldc2_w 550634956
    //   2254: l2i
    //   2255: ldc_w 1596933190
    //   2258: ixor
    //   2259: ixor
    //   2260: lookupswitch default -> 2288, -838723343 -> 4209, 795081024 -> 2243
    //   2288: goto -> 2292
    //   2291: athrow
    //   2292: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2297: goto -> 2301
    //   2300: athrow
    //   2301: checkcast java/lang/Integer
    //   2304: getstatic Perryc.1 : I
    //   2307: ifeq -> 2321
    //   2310: ldc2_w -2085143342
    //   2313: l2i
    //   2314: ldc_w 937365661
    //   2317: ixor
    //   2318: goto -> 2329
    //   2321: ldc2_w 281337458
    //   2324: l2i
    //   2325: ldc_w 1864459725
    //   2328: ixor
    //   2329: ldc2_w 1133918968
    //   2332: l2i
    //   2333: ldc_w -613889384
    //   2336: ixor
    //   2337: ixor
    //   2338: lookupswitch default -> 4173, -417641505 -> 2364, 748084271 -> 2321
    //   2364: goto -> 2368
    //   2367: athrow
    //   2368: invokevirtual intValue : ()I
    //   2371: goto -> 2375
    //   2374: athrow
    //   2375: ldc2_w 923781098
    //   2378: l2i
    //   2379: ldc_w 923781102
    //   2382: ixor
    //   2383: if_icmpge -> 2397
    //   2386: ldc2_w 1540159420
    //   2389: l2i
    //   2390: ldc_w 922346146
    //   2393: ixor
    //   2394: goto -> 2405
    //   2397: ldc2_w -316360509
    //   2400: l2i
    //   2401: ldc_w -2146325028
    //   2404: ixor
    //   2405: ldc2_w -953767426
    //   2408: l2i
    //   2409: ldc_w 733594156
    //   2412: ixor
    //   2413: ixor
    //   2414: tableswitch default -> 2386, -2119532852 -> 2436, -2119532851 -> 3839
    //   2436: getstatic Perryc.0 : I
    //   2439: ifle -> 2453
    //   2442: ldc2_w 652651723
    //   2445: l2i
    //   2446: ldc_w -1686195781
    //   2449: ixor
    //   2450: goto -> 2461
    //   2453: ldc2_w -425446847
    //   2456: l2i
    //   2457: ldc_w 666848333
    //   2460: ixor
    //   2461: ldc2_w 1591111036
    //   2464: l2i
    //   2465: ldc_w 737583299
    //   2468: ixor
    //   2469: ixor
    //   2470: lookupswitch default -> 2496, -927412017 -> 4185, 196361204 -> 2453
    //   2496: aload_0
    //   2497: getstatic Perryc.c : I
    //   2500: iflt -> 2514
    //   2503: ldc2_w -1043430973
    //   2506: l2i
    //   2507: ldc_w -1762058263
    //   2510: ixor
    //   2511: goto -> 2522
    //   2514: ldc2_w -1880962264
    //   2517: l2i
    //   2518: ldc_w 1266898993
    //   2521: ixor
    //   2522: ldc2_w -923456963
    //   2525: l2i
    //   2526: ldc_w 247987394
    //   2529: ixor
    //   2530: ixor
    //   2531: lookupswitch default -> 2556, -1861924651 -> 4261, -50683520 -> 2514
    //   2556: aload #4
    //   2558: getstatic Perryc.0 : I
    //   2561: ifle -> 2575
    //   2564: ldc2_w 367965097
    //   2567: l2i
    //   2568: ldc_w 1326552457
    //   2571: ixor
    //   2572: goto -> 2583
    //   2575: ldc2_w -2064288365
    //   2578: l2i
    //   2579: ldc_w -287444347
    //   2582: ixor
    //   2583: ldc2_w -2074726796
    //   2586: l2i
    //   2587: ldc_w -1176194329
    //   2590: ixor
    //   2591: ixor
    //   2592: lookupswitch default -> 4243, 1469717381 -> 2620, 1733147315 -> 2575
    //   2620: goto -> 2624
    //   2623: athrow
    //   2624: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   2627: goto -> 2631
    //   2630: athrow
    //   2631: getstatic Perryc.c : I
    //   2634: iflt -> 2648
    //   2637: ldc2_w 2037934307
    //   2640: l2i
    //   2641: ldc_w -71630033
    //   2644: ixor
    //   2645: goto -> 2656
    //   2648: ldc2_w 1369538932
    //   2651: l2i
    //   2652: ldc_w -1300338470
    //   2655: ixor
    //   2656: ldc2_w 930222626
    //   2659: l2i
    //   2660: ldc_w -79042397
    //   2663: ixor
    //   2664: ixor
    //   2665: lookupswitch default -> 2692, 1324912973 -> 4269, 1744295682 -> 2648
    //   2692: aload_0
    //   2693: getstatic Perryc.c : I
    //   2696: iflt -> 2710
    //   2699: ldc2_w -29017247
    //   2702: l2i
    //   2703: ldc_w -1176935331
    //   2706: ixor
    //   2707: goto -> 2718
    //   2710: ldc2_w 394573255
    //   2713: l2i
    //   2714: ldc_w 1207920435
    //   2717: ixor
    //   2718: ldc2_w -142753368
    //   2721: l2i
    //   2722: ldc_w -1643442280
    //   2725: ixor
    //   2726: ixor
    //   2727: lookupswitch default -> 2752, 426085148 -> 2710, 787124492 -> 4169
    //   2752: getfield retries : Ljava/util/Map;
    //   2755: getstatic Perryc.c : I
    //   2758: iflt -> 2772
    //   2761: ldc2_w -296588505
    //   2764: l2i
    //   2765: ldc_w 534442381
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w 403955942
    //   2775: l2i
    //   2776: ldc_w -1278226407
    //   2779: ixor
    //   2780: ldc2_w -496392971
    //   2783: l2i
    //   2784: ldc_w -1667439968
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 2816, -1887576833 -> 4175, 1959069663 -> 2772
    //   2816: aload #4
    //   2818: getstatic Perryc.1 : I
    //   2821: ifeq -> 2835
    //   2824: ldc2_w -852047605
    //   2827: l2i
    //   2828: ldc_w -639789100
    //   2831: ixor
    //   2832: goto -> 2843
    //   2835: ldc2_w -1758528810
    //   2838: l2i
    //   2839: ldc_w -335441998
    //   2842: ixor
    //   2843: ldc2_w 914191987
    //   2846: l2i
    //   2847: ldc_w 1394253857
    //   2850: ixor
    //   2851: ixor
    //   2852: lookupswitch default -> 4275, 508076854 -> 2880, 1905035405 -> 2835
    //   2880: aload_0
    //   2881: getstatic Perryc.0 : I
    //   2884: ifle -> 2898
    //   2887: ldc2_w -1732290526
    //   2890: l2i
    //   2891: ldc_w -45404064
    //   2894: ixor
    //   2895: goto -> 2906
    //   2898: ldc2_w -1724029602
    //   2901: l2i
    //   2902: ldc_w -1439825381
    //   2905: ixor
    //   2906: ldc2_w -1471646287
    //   2909: l2i
    //   2910: ldc_w 1484506724
    //   2913: ixor
    //   2914: ixor
    //   2915: lookupswitch default -> 2940, -1782064233 -> 4257, -1708522475 -> 2898
    //   2940: getfield retries : Ljava/util/Map;
    //   2943: getstatic Perryc.0 : I
    //   2946: ifle -> 2960
    //   2949: ldc2_w 1421145910
    //   2952: l2i
    //   2953: ldc_w -440406791
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w 355872214
    //   2963: l2i
    //   2964: ldc_w 1816150900
    //   2967: ixor
    //   2968: ldc2_w -157725347
    //   2971: l2i
    //   2972: ldc_w -1752978304
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 4221, -804128238 -> 2960, 409767807 -> 3004
    //   3004: aload #4
    //   3006: getstatic Perryc.c : I
    //   3009: iflt -> 3023
    //   3012: ldc2_w 95347594
    //   3015: l2i
    //   3016: ldc_w 491149298
    //   3019: ixor
    //   3020: goto -> 3031
    //   3023: ldc2_w -1191864401
    //   3026: l2i
    //   3027: ldc_w -1049498364
    //   3030: ixor
    //   3031: ldc2_w -1709477946
    //   3034: l2i
    //   3035: ldc_w 2146801335
    //   3038: ixor
    //   3039: ixor
    //   3040: lookupswitch default -> 3068, -49918711 -> 4195, 2032050994 -> 3023
    //   3068: goto -> 3072
    //   3071: athrow
    //   3072: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3077: goto -> 3081
    //   3080: athrow
    //   3081: ifnonnull -> 3095
    //   3084: ldc2_w 1906126562
    //   3087: l2i
    //   3088: ldc_w 25514959
    //   3091: ixor
    //   3092: goto -> 3103
    //   3095: ldc2_w -888320547
    //   3098: l2i
    //   3099: ldc_w -1156239119
    //   3102: ixor
    //   3103: ldc2_w 193178029
    //   3106: l2i
    //   3107: ldc_w -930431850
    //   3110: ixor
    //   3111: ixor
    //   3112: tableswitch default -> 3084, -1290704874 -> 3136, -1290704873 -> 3147
    //   3136: ldc2_w -1720495829
    //   3139: l2i
    //   3140: ldc_w -1720495830
    //   3143: ixor
    //   3144: goto -> 3492
    //   3147: getstatic Perryc.c : I
    //   3150: iflt -> 3164
    //   3153: ldc2_w -2109747850
    //   3156: l2i
    //   3157: ldc_w -1907213024
    //   3160: ixor
    //   3161: goto -> 3172
    //   3164: ldc2_w 2002330029
    //   3167: l2i
    //   3168: ldc_w -1702253705
    //   3171: ixor
    //   3172: ldc2_w 404334056
    //   3175: l2i
    //   3176: ldc_w 872180261
    //   3179: ixor
    //   3180: ixor
    //   3181: lookupswitch default -> 3208, -828062986 -> 3164, 663240603 -> 4225
    //   3208: aload_0
    //   3209: getstatic Perryc.1 : I
    //   3212: ifeq -> 3226
    //   3215: ldc2_w 757758941
    //   3218: l2i
    //   3219: ldc_w -47571782
    //   3222: ixor
    //   3223: goto -> 3234
    //   3226: ldc2_w -1791968487
    //   3229: l2i
    //   3230: ldc_w -264849236
    //   3233: ixor
    //   3234: ldc2_w -188043323
    //   3237: l2i
    //   3238: ldc_w 1054427394
    //   3241: ixor
    //   3242: ixor
    //   3243: lookupswitch default -> 3268, 437485984 -> 4217, 1601692594 -> 3226
    //   3268: getfield retries : Ljava/util/Map;
    //   3271: getstatic Perryc.0 : I
    //   3274: ifle -> 3288
    //   3277: ldc2_w 117363345
    //   3280: l2i
    //   3281: ldc_w 446491257
    //   3284: ixor
    //   3285: goto -> 3296
    //   3288: ldc2_w 346086147
    //   3291: l2i
    //   3292: ldc_w 793102091
    //   3295: ixor
    //   3296: ldc2_w 968024251
    //   3299: l2i
    //   3300: ldc_w 250003186
    //   3303: ixor
    //   3304: ixor
    //   3305: lookupswitch default -> 3332, 724985505 -> 4245, 1065147822 -> 3288
    //   3332: aload #4
    //   3334: getstatic Perryc.c : I
    //   3337: iflt -> 3351
    //   3340: ldc2_w -2040481848
    //   3343: l2i
    //   3344: ldc_w 398313752
    //   3347: ixor
    //   3348: goto -> 3359
    //   3351: ldc2_w 1329759315
    //   3354: l2i
    //   3355: ldc_w -609595900
    //   3358: ixor
    //   3359: ldc2_w -801203225
    //   3362: l2i
    //   3363: ldc_w -179978760
    //   3366: ixor
    //   3367: ixor
    //   3368: lookupswitch default -> 4227, -1315705784 -> 3396, -1264166705 -> 3351
    //   3396: goto -> 3400
    //   3399: athrow
    //   3400: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3405: goto -> 3409
    //   3408: athrow
    //   3409: checkcast java/lang/Integer
    //   3412: getstatic Perryc.1 : I
    //   3415: ifeq -> 3429
    //   3418: ldc2_w 1421520105
    //   3421: l2i
    //   3422: ldc_w -722742589
    //   3425: ixor
    //   3426: goto -> 3437
    //   3429: ldc2_w 424096673
    //   3432: l2i
    //   3433: ldc_w -582792744
    //   3436: ixor
    //   3437: ldc2_w 1411983150
    //   3440: l2i
    //   3441: ldc_w -1699571230
    //   3444: ixor
    //   3445: ixor
    //   3446: lookupswitch default -> 4177, 178242741 -> 3472, 1321910502 -> 3429
    //   3472: goto -> 3476
    //   3475: athrow
    //   3476: invokevirtual intValue : ()I
    //   3479: goto -> 3483
    //   3482: athrow
    //   3483: ldc2_w 100478207
    //   3486: l2i
    //   3487: ldc_w 100478206
    //   3490: ixor
    //   3491: iadd
    //   3492: getstatic Perryc.0 : I
    //   3495: ifle -> 3509
    //   3498: ldc2_w 418228072
    //   3501: l2i
    //   3502: ldc_w -589245792
    //   3505: ixor
    //   3506: goto -> 3517
    //   3509: ldc2_w -273398543
    //   3512: l2i
    //   3513: ldc_w -499071909
    //   3516: ixor
    //   3517: ldc2_w 1840929654
    //   3520: l2i
    //   3521: ldc_w 162813918
    //   3524: ixor
    //   3525: ixor
    //   3526: lookupswitch default -> 4247, -1610385056 -> 3509, 1778027522 -> 3552
    //   3552: goto -> 3556
    //   3555: athrow
    //   3556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3559: goto -> 3563
    //   3562: athrow
    //   3563: getstatic Perryc.0 : I
    //   3566: ifle -> 3580
    //   3569: ldc2_w -1967433493
    //   3572: l2i
    //   3573: ldc_w 1356911642
    //   3576: ixor
    //   3577: goto -> 3588
    //   3580: ldc2_w -1319570497
    //   3583: l2i
    //   3584: ldc_w -289851102
    //   3587: ixor
    //   3588: ldc2_w 609724746
    //   3591: l2i
    //   3592: ldc_w -1037871371
    //   3595: ixor
    //   3596: ixor
    //   3597: lookupswitch default -> 4279, -1181403870 -> 3624, 1009742670 -> 3580
    //   3624: goto -> 3628
    //   3627: athrow
    //   3628: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3633: goto -> 3637
    //   3636: athrow
    //   3637: pop
    //   3638: getstatic Perryc.0 : I
    //   3641: ifle -> 3655
    //   3644: ldc2_w 191942810
    //   3647: l2i
    //   3648: ldc_w -1588408571
    //   3651: ixor
    //   3652: goto -> 3663
    //   3655: ldc2_w 2133286973
    //   3658: l2i
    //   3659: ldc_w -450416518
    //   3662: ixor
    //   3663: ldc2_w 129138813
    //   3666: l2i
    //   3667: ldc_w 525803389
    //   3670: ixor
    //   3671: ixor
    //   3672: lookupswitch default -> 4229, -2098868409 -> 3700, -1295548257 -> 3655
    //   3700: aload_0
    //   3701: getstatic Perryc.1 : I
    //   3704: ifeq -> 3718
    //   3707: ldc2_w 1605996912
    //   3710: l2i
    //   3711: ldc_w -1305240275
    //   3714: ixor
    //   3715: goto -> 3726
    //   3718: ldc2_w 1562531918
    //   3721: l2i
    //   3722: ldc_w 1242142510
    //   3725: ixor
    //   3726: ldc2_w 429349277
    //   3729: l2i
    //   3730: ldc_w 1537299756
    //   3733: ixor
    //   3734: ixor
    //   3735: lookupswitch default -> 3760, -1997265678 -> 3718, -1346633492 -> 4191
    //   3760: getfield retryTimer : Lbigname/zprestige/webhack/util/Timer;
    //   3763: getstatic Perryc.0 : I
    //   3766: ifle -> 3780
    //   3769: ldc2_w 501466469
    //   3772: l2i
    //   3773: ldc_w -388014579
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 413618879
    //   3783: l2i
    //   3784: ldc_w 461680969
    //   3787: ixor
    //   3788: ldc2_w -1918120785
    //   3791: l2i
    //   3792: ldc_w 135822647
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 3824, -757247402 -> 3780, 1888430832 -> 4187
    //   3824: goto -> 3828
    //   3827: athrow
    //   3828: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   3831: goto -> 3835
    //   3834: athrow
    //   3835: pop
    //   3836: goto -> 553
    //   3839: getstatic Perryc.0 : I
    //   3842: ifle -> 3856
    //   3845: ldc2_w -348374789
    //   3848: l2i
    //   3849: ldc_w -18898878
    //   3852: ixor
    //   3853: goto -> 3864
    //   3856: ldc2_w -386928778
    //   3859: l2i
    //   3860: ldc_w 1944154695
    //   3863: ixor
    //   3864: ldc2_w 1202360461
    //   3867: l2i
    //   3868: ldc_w -1473065519
    //   3871: ixor
    //   3872: ixor
    //   3873: lookupswitch default -> 4267, -92551707 -> 3856, 1956036717 -> 3900
    //   3900: iload #5
    //   3902: ldc2_w 465440255
    //   3905: l2i
    //   3906: ldc_w 465440252
    //   3909: ixor
    //   3910: if_icmpeq -> 3924
    //   3913: ldc2_w 1354097862
    //   3916: l2i
    //   3917: ldc_w 1097181632
    //   3920: ixor
    //   3921: goto -> 3932
    //   3924: ldc2_w -943358070
    //   3927: l2i
    //   3928: ldc_w -703253875
    //   3931: ixor
    //   3932: ldc2_w 1514171629
    //   3935: l2i
    //   3936: ldc_w 1203847533
    //   3939: ixor
    //   3940: ixor
    //   3941: tableswitch default -> 3913, 206659718 -> 3964, 206659719 -> 3967
    //   3964: goto -> 553
    //   3967: getstatic Perryc.1 : I
    //   3970: ifeq -> 3984
    //   3973: ldc2_w 1631353382
    //   3976: l2i
    //   3977: ldc_w -542993948
    //   3980: ixor
    //   3981: goto -> 3992
    //   3984: ldc2_w 1720848454
    //   3987: l2i
    //   3988: ldc_w 378261876
    //   3991: ixor
    //   3992: ldc2_w 852311265
    //   3995: l2i
    //   3996: ldc_w -1091323590
    //   3999: ixor
    //   4000: ixor
    //   4001: lookupswitch default -> 4263, -64535319 -> 4028, 849374745 -> 3984
    //   4028: aload_0
    //   4029: getstatic Perryc.0 : I
    //   4032: ifle -> 4046
    //   4035: ldc2_w -1511689827
    //   4038: l2i
    //   4039: ldc_w 1168651454
    //   4042: ixor
    //   4043: goto -> 4054
    //   4046: ldc2_w 1095541343
    //   4049: l2i
    //   4050: ldc_w 1476174318
    //   4053: ixor
    //   4054: ldc2_w 1276443658
    //   4057: l2i
    //   4058: ldc_w 299304814
    //   4061: ixor
    //   4062: ixor
    //   4063: lookupswitch default -> 4088, -1114718649 -> 4171, -140672459 -> 4046
    //   4088: aload #4
    //   4090: getstatic Perryc.0 : I
    //   4093: ifle -> 4107
    //   4096: ldc2_w -45317089
    //   4099: l2i
    //   4100: ldc_w -1681772647
    //   4103: ixor
    //   4104: goto -> 4115
    //   4107: ldc2_w 148313073
    //   4110: l2i
    //   4111: ldc_w 1469702819
    //   4114: ixor
    //   4115: ldc2_w 384783316
    //   4118: l2i
    //   4119: ldc_w 137745206
    //   4122: ixor
    //   4123: ixor
    //   4124: lookupswitch default -> 4207, 1100247472 -> 4152, 2018782052 -> 4107
    //   4152: goto -> 4156
    //   4155: athrow
    //   4156: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   4159: goto -> 4163
    //   4162: athrow
    //   4163: goto -> 553
    //   4166: return
    //   4167: aconst_null
    //   4168: athrow
    //   4169: aconst_null
    //   4170: athrow
    //   4171: aconst_null
    //   4172: athrow
    //   4173: aconst_null
    //   4174: athrow
    //   4175: aconst_null
    //   4176: athrow
    //   4177: aconst_null
    //   4178: athrow
    //   4179: aconst_null
    //   4180: athrow
    //   4181: aconst_null
    //   4182: athrow
    //   4183: aconst_null
    //   4184: athrow
    //   4185: aconst_null
    //   4186: athrow
    //   4187: aconst_null
    //   4188: athrow
    //   4189: aconst_null
    //   4190: athrow
    //   4191: aconst_null
    //   4192: athrow
    //   4193: aconst_null
    //   4194: athrow
    //   4195: aconst_null
    //   4196: athrow
    //   4197: aconst_null
    //   4198: athrow
    //   4199: aconst_null
    //   4200: athrow
    //   4201: aconst_null
    //   4202: athrow
    //   4203: aconst_null
    //   4204: athrow
    //   4205: aconst_null
    //   4206: athrow
    //   4207: aconst_null
    //   4208: athrow
    //   4209: aconst_null
    //   4210: athrow
    //   4211: aconst_null
    //   4212: athrow
    //   4213: aconst_null
    //   4214: athrow
    //   4215: aconst_null
    //   4216: athrow
    //   4217: aconst_null
    //   4218: athrow
    //   4219: aconst_null
    //   4220: athrow
    //   4221: aconst_null
    //   4222: athrow
    //   4223: aconst_null
    //   4224: athrow
    //   4225: aconst_null
    //   4226: athrow
    //   4227: aconst_null
    //   4228: athrow
    //   4229: aconst_null
    //   4230: athrow
    //   4231: aconst_null
    //   4232: athrow
    //   4233: aconst_null
    //   4234: athrow
    //   4235: aconst_null
    //   4236: athrow
    //   4237: aconst_null
    //   4238: athrow
    //   4239: aconst_null
    //   4240: athrow
    //   4241: aconst_null
    //   4242: athrow
    //   4243: aconst_null
    //   4244: athrow
    //   4245: aconst_null
    //   4246: athrow
    //   4247: aconst_null
    //   4248: athrow
    //   4249: aconst_null
    //   4250: athrow
    //   4251: aconst_null
    //   4252: athrow
    //   4253: aconst_null
    //   4254: athrow
    //   4255: aconst_null
    //   4256: athrow
    //   4257: aconst_null
    //   4258: athrow
    //   4259: aconst_null
    //   4260: athrow
    //   4261: aconst_null
    //   4262: athrow
    //   4263: aconst_null
    //   4264: athrow
    //   4265: aconst_null
    //   4266: athrow
    //   4267: aconst_null
    //   4268: athrow
    //   4269: aconst_null
    //   4270: athrow
    //   4271: aconst_null
    //   4272: athrow
    //   4273: aconst_null
    //   4274: athrow
    //   4275: aconst_null
    //   4276: athrow
    //   4277: aconst_null
    //   4278: athrow
    //   4279: aconst_null
    //   4280: athrow
    //   4281: pop
    //   4282: goto -> 24
    //   4285: pop
    //   4286: aconst_null
    //   4287: goto -> 4281
    //   4290: dup
    //   4291: ifnull -> 4281
    //   4294: checkcast java/lang/Throwable
    //   4297: athrow
    //   4298: dup
    //   4299: ifnull -> 4285
    //   4302: checkcast java/lang/Throwable
    //   4305: athrow
    //   4306: aconst_null
    //   4307: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1126	3037	4	position	Lnet/minecraft/util/math/BlockPos;
    //   1598	2565	5	placeability	I
    //   929	3234	3	vec3d3	Lnet/minecraft/util/math/Vec3d;
    //   24	4143	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoTrap;
    //   24	4143	1	list	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	4143	1	list	Ljava/util/List<Lnet/minecraft/util/math/Vec3d;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	4290	java/lang/IllegalArgumentException
    //   148	156	156	finally
    //   148	156	156	finally
    //   148	156	3	finally
    //   148	156	156	finally
    //   148	156	156	java/util/NoSuchElementException
    //   283	290	290	finally
    //   283	290	3	finally
    //   284	290	283	finally
    //   284	290	283	finally
    //   284	290	290	java/util/ConcurrentModificationException
    //   351	360	360	finally
    //   351	360	3	finally
    //   351	360	351	java/lang/StringIndexOutOfBoundsException
    //   351	360	351	finally
    //   352	360	351	java/lang/ArithmeticException
    //   484	492	492	finally
    //   484	492	3	java/lang/IndexOutOfBoundsException
    //   484	492	492	finally
    //   484	492	492	java/lang/AssertionError
    //   484	492	492	java/util/NoSuchElementException
    //   675	684	684	finally
    //   676	684	3	java/lang/IllegalStateException
    //   676	684	675	java/util/ConcurrentModificationException
    //   676	684	684	java/lang/StringIndexOutOfBoundsException
    //   676	684	675	java/lang/ArithmeticException
    //   856	864	864	finally
    //   856	864	864	finally
    //   856	864	3	finally
    //   856	864	3	java/lang/IllegalArgumentException
    //   856	864	864	java/util/NoSuchElementException
    //   1055	1062	1062	finally
    //   1055	1062	3	finally
    //   1055	1062	1062	java/lang/ClassCastException
    //   1056	1062	1055	finally
    //   1056	1062	3	finally
    //   1379	1386	1386	finally
    //   1379	1386	1379	finally
    //   1380	1386	1379	java/lang/AssertionError
    //   1380	1386	1379	finally
    //   1380	1386	1386	finally
    //   1455	1462	1462	finally
    //   1455	1462	1455	finally
    //   1455	1462	3	finally
    //   1455	1462	3	finally
    //   1456	1462	1455	java/lang/StringIndexOutOfBoundsException
    //   1527	1534	1534	finally
    //   1527	1534	3	java/lang/NullPointerException
    //   1527	1534	1527	java/lang/ArithmeticException
    //   1528	1534	1527	java/lang/NegativeArraySizeException
    //   1528	1534	3	java/util/NoSuchElementException
    //   1976	1984	1984	finally
    //   1976	1984	3	finally
    //   1976	1984	1984	finally
    //   1976	1984	3	finally
    //   1976	1984	3	finally
    //   2291	2300	2300	finally
    //   2291	2300	2291	java/lang/UnsupportedOperationException
    //   2292	2300	3	java/lang/IllegalArgumentException
    //   2292	2300	2300	java/lang/AssertionError
    //   2292	2300	2291	java/lang/IllegalArgumentException
    //   2367	2374	2374	finally
    //   2367	2374	2374	java/lang/NegativeArraySizeException
    //   2368	2374	2367	finally
    //   2368	2374	2374	java/lang/NegativeArraySizeException
    //   2368	2374	2367	java/lang/IllegalStateException
    //   2623	2630	2630	finally
    //   2623	2630	3	java/util/ConcurrentModificationException
    //   2623	2630	2630	java/lang/NumberFormatException
    //   2623	2630	2623	finally
    //   2624	2630	2623	finally
    //   3071	3080	3080	finally
    //   3071	3080	3	java/lang/AssertionError
    //   3071	3080	3080	finally
    //   3072	3080	3071	finally
    //   3072	3080	3	finally
    //   3399	3408	3408	finally
    //   3400	3408	3	java/lang/RuntimeException
    //   3400	3408	3399	java/util/NoSuchElementException
    //   3400	3408	3399	java/lang/NullPointerException
    //   3400	3408	3399	java/lang/EnumConstantNotPresentException
    //   3475	3482	3482	finally
    //   3476	3482	3482	java/lang/UnsupportedOperationException
    //   3476	3482	3482	finally
    //   3476	3482	3475	java/lang/ArithmeticException
    //   3476	3482	3	finally
    //   3555	3562	3562	finally
    //   3555	3562	3562	java/lang/NegativeArraySizeException
    //   3555	3562	3555	java/lang/EnumConstantNotPresentException
    //   3556	3562	3555	java/lang/ArithmeticException
    //   3556	3562	3	java/util/ConcurrentModificationException
    //   3628	3636	3636	finally
    //   3628	3636	3	finally
    //   3628	3636	3	finally
    //   3628	3636	3	finally
    //   3628	3636	3	finally
    //   3827	3834	3834	finally
    //   3827	3834	3827	java/lang/UnsupportedOperationException
    //   3827	3834	3827	finally
    //   3828	3834	3834	java/lang/ArithmeticException
    //   3828	3834	3	finally
    //   4155	4162	4162	finally
    //   4155	4162	3	finally
    //   4155	4162	4162	finally
    //   4155	4162	4155	java/lang/StringIndexOutOfBoundsException
    //   4156	4162	4155	java/lang/AssertionError
    //   4290	4298	4290	java/lang/AssertionError
    //   4306	4308	3	java/lang/IndexOutOfBoundsException
  }
  
  public void doStaticTrap() {
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
  
  public EntityPlayer getTarget(double range, boolean trapped) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3760
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3752
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3744
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: aconst_null
    //   25: getstatic Perryc.1 : I
    //   28: ifeq -> 42
    //   31: ldc2_w -570106349
    //   34: l2i
    //   35: ldc_w -900532625
    //   38: ixor
    //   39: goto -> 50
    //   42: ldc2_w -846274635
    //   45: l2i
    //   46: ldc_w 675645263
    //   49: ixor
    //   50: ldc2_w -1190270657
    //   53: l2i
    //   54: ldc_w 1008144709
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1857236986 -> 3659, -682387673 -> 42
    //   84: astore #4
    //   86: getstatic Perryc.c : I
    //   89: iflt -> 103
    //   92: ldc2_w -338165722
    //   95: l2i
    //   96: ldc_w 2069992588
    //   99: ixor
    //   100: goto -> 111
    //   103: ldc2_w 1202011690
    //   106: l2i
    //   107: ldc_w -531176637
    //   110: ixor
    //   111: ldc2_w -742233275
    //   114: l2i
    //   115: ldc_w -1677358564
    //   118: ixor
    //   119: ixor
    //   120: lookupswitch default -> 3641, -545360397 -> 103, -399229904 -> 148
    //   148: dload_1
    //   149: ldc2_w 0.8365625225631114
    //   152: invokestatic doubleToLongBits : (D)J
    //   155: ldc2_w 9217396323302439021
    //   158: lxor
    //   159: invokestatic longBitsToDouble : (J)D
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w -1376048655
    //   171: l2i
    //   172: ldc_w 1872928167
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 567436948
    //   182: l2i
    //   183: ldc_w -1413735410
    //   186: ixor
    //   187: ldc2_w 195385477
    //   190: l2i
    //   191: ldc_w -1000674601
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -1127794921 -> 179, 228984324 -> 3687
    //   224: goto -> 228
    //   227: athrow
    //   228: invokestatic pow : (DD)D
    //   231: goto -> 235
    //   234: athrow
    //   235: ldc2_w 5.724180101446732
    //   238: invokestatic doubleToLongBits : (D)J
    //   241: ldc2_w 9216306091815633598
    //   244: lxor
    //   245: invokestatic longBitsToDouble : (J)D
    //   248: dadd
    //   249: getstatic Perryc.1 : I
    //   252: ifeq -> 266
    //   255: ldc2_w 1482106515
    //   258: l2i
    //   259: ldc_w 1725965692
    //   262: ixor
    //   263: goto -> 274
    //   266: ldc2_w -463638302
    //   269: l2i
    //   270: ldc_w 1344550664
    //   273: ixor
    //   274: ldc2_w 1088555778
    //   277: l2i
    //   278: ldc_w 2032757924
    //   281: ixor
    //   282: ixor
    //   283: lookupswitch default -> 3685, -1917706164 -> 308, 125592649 -> 266
    //   308: dstore #5
    //   310: getstatic Perryc.c : I
    //   313: iflt -> 327
    //   316: ldc2_w -629241518
    //   319: l2i
    //   320: ldc_w 1016169828
    //   323: ixor
    //   324: goto -> 335
    //   327: ldc2_w 962200121
    //   330: l2i
    //   331: ldc_w 815976050
    //   334: ixor
    //   335: ldc2_w 656835957
    //   338: l2i
    //   339: ldc_w 2040622570
    //   342: ixor
    //   343: ixor
    //   344: lookupswitch default -> 3697, -1201085271 -> 327, 1467950292 -> 372
    //   372: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoTrap.mc : Lnet/minecraft/client/Minecraft;
    //   375: getstatic Perryc.0 : I
    //   378: ifle -> 392
    //   381: ldc2_w -642575111
    //   384: l2i
    //   385: ldc_w -1564940012
    //   388: ixor
    //   389: goto -> 400
    //   392: ldc2_w -1919734756
    //   395: l2i
    //   396: ldc_w -1382534002
    //   399: ixor
    //   400: ldc2_w 386777026
    //   403: l2i
    //   404: ldc_w 65022736
    //   407: ixor
    //   408: ixor
    //   409: lookupswitch default -> 3729, 887524416 -> 436, 1877371199 -> 392
    //   436: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   439: getstatic Perryc.1 : I
    //   442: ifeq -> 456
    //   445: ldc2_w -412826588
    //   448: l2i
    //   449: ldc_w 265491789
    //   452: ixor
    //   453: goto -> 464
    //   456: ldc2_w -1679170041
    //   459: l2i
    //   460: ldc_w 1793721650
    //   463: ixor
    //   464: ldc2_w 884751304
    //   467: l2i
    //   468: ldc_w -448510317
    //   471: ixor
    //   472: ixor
    //   473: lookupswitch default -> 3725, 553361006 -> 500, 961522738 -> 456
    //   500: getfield field_73010_i : Ljava/util/List;
    //   503: getstatic Perryc.1 : I
    //   506: ifeq -> 520
    //   509: ldc2_w 639895720
    //   512: l2i
    //   513: ldc_w 1125825162
    //   516: ixor
    //   517: goto -> 528
    //   520: ldc2_w 182478282
    //   523: l2i
    //   524: ldc_w 1188054719
    //   527: ixor
    //   528: ldc2_w 604366152
    //   531: l2i
    //   532: ldc_w 745182916
    //   535: ixor
    //   536: ixor
    //   537: lookupswitch default -> 564, -877096208 -> 520, 1834074542 -> 3677
    //   564: goto -> 568
    //   567: athrow
    //   568: invokeinterface iterator : ()Ljava/util/Iterator;
    //   573: goto -> 577
    //   576: athrow
    //   577: getstatic Perryc.c : I
    //   580: iflt -> 594
    //   583: ldc2_w 1580747031
    //   586: l2i
    //   587: ldc_w -14962761
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w 1377870834
    //   597: l2i
    //   598: ldc_w 1134129179
    //   601: ixor
    //   602: ldc2_w -1556705617
    //   605: l2i
    //   606: ldc_w -179438422
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 3699, -145189723 -> 594, 1203937772 -> 636
    //   636: astore #7
    //   638: getstatic Perryc.c : I
    //   641: iflt -> 655
    //   644: ldc2_w 1019276044
    //   647: l2i
    //   648: ldc_w 2043383331
    //   651: ixor
    //   652: goto -> 663
    //   655: ldc2_w 406208323
    //   658: l2i
    //   659: ldc_w 1811935793
    //   662: ixor
    //   663: ldc2_w 1074858866
    //   666: l2i
    //   667: ldc_w 479391390
    //   670: ixor
    //   671: ixor
    //   672: lookupswitch default -> 3657, 428376259 -> 655, 793389214 -> 700
    //   700: aload #7
    //   702: getstatic Perryc.1 : I
    //   705: ifeq -> 719
    //   708: ldc2_w 2019078456
    //   711: l2i
    //   712: ldc_w -1179378082
    //   715: ixor
    //   716: goto -> 727
    //   719: ldc2_w -14691990
    //   722: l2i
    //   723: ldc_w 135605609
    //   726: ixor
    //   727: ldc2_w -897535296
    //   730: l2i
    //   731: ldc_w 1932930675
    //   734: ixor
    //   735: ixor
    //   736: lookupswitch default -> 3703, 1320968368 -> 764, 2019177429 -> 719
    //   764: goto -> 768
    //   767: athrow
    //   768: invokeinterface hasNext : ()Z
    //   773: goto -> 777
    //   776: athrow
    //   777: ifeq -> 791
    //   780: ldc2_w -1009217324
    //   783: l2i
    //   784: ldc_w -2025708321
    //   787: ixor
    //   788: goto -> 799
    //   791: ldc2_w 44073107
    //   794: l2i
    //   795: ldc_w 1178219673
    //   798: ixor
    //   799: ldc2_w -1168465773
    //   802: l2i
    //   803: ldc_w 1825002146
    //   806: ixor
    //   807: ixor
    //   808: tableswitch default -> 780, -1845017030 -> 832, -1845017029 -> 3577
    //   832: getstatic Perryc.1 : I
    //   835: ifeq -> 849
    //   838: ldc2_w -1442781387
    //   841: l2i
    //   842: ldc_w 1741981243
    //   845: ixor
    //   846: goto -> 857
    //   849: ldc2_w 17178910
    //   852: l2i
    //   853: ldc_w 801271149
    //   856: ixor
    //   857: ldc2_w -1023040635
    //   860: l2i
    //   861: ldc_w 83331753
    //   864: ixor
    //   865: ixor
    //   866: lookupswitch default -> 3647, -382311073 -> 892, 170280994 -> 849
    //   892: aload #7
    //   894: getstatic Perryc.0 : I
    //   897: ifle -> 911
    //   900: ldc2_w 1543130286
    //   903: l2i
    //   904: ldc_w -355380384
    //   907: ixor
    //   908: goto -> 919
    //   911: ldc2_w -1651711525
    //   914: l2i
    //   915: ldc_w 895386143
    //   918: ixor
    //   919: ldc2_w 2143203714
    //   922: l2i
    //   923: ldc_w 764125043
    //   926: ixor
    //   927: ixor
    //   928: lookupswitch default -> 956, -1841089016 -> 911, -484560577 -> 3719
    //   956: goto -> 960
    //   959: athrow
    //   960: invokeinterface next : ()Ljava/lang/Object;
    //   965: goto -> 969
    //   968: athrow
    //   969: checkcast net/minecraft/entity/player/EntityPlayer
    //   972: getstatic Perryc.c : I
    //   975: iflt -> 989
    //   978: ldc2_w 374286264
    //   981: l2i
    //   982: ldc_w -661592350
    //   985: ixor
    //   986: goto -> 997
    //   989: ldc2_w -746951493
    //   992: l2i
    //   993: ldc_w 366773745
    //   996: ixor
    //   997: ldc2_w -359197679
    //   1000: l2i
    //   1001: ldc_w 241338047
    //   1004: ixor
    //   1005: ixor
    //   1006: lookupswitch default -> 1032, 707417076 -> 3711, 1493982316 -> 989
    //   1032: astore #8
    //   1034: getstatic Perryc.c : I
    //   1037: iflt -> 1051
    //   1040: ldc2_w -1977308255
    //   1043: l2i
    //   1044: ldc_w -26228736
    //   1047: ixor
    //   1048: goto -> 1059
    //   1051: ldc2_w 1199909340
    //   1054: l2i
    //   1055: ldc_w -276277668
    //   1058: ixor
    //   1059: ldc2_w -636767990
    //   1062: l2i
    //   1063: ldc_w -745565405
    //   1066: ixor
    //   1067: ixor
    //   1068: lookupswitch default -> 3655, -1584833111 -> 1096, 2110734728 -> 1051
    //   1096: aload #8
    //   1098: getstatic Perryc.0 : I
    //   1101: ifle -> 1115
    //   1104: ldc2_w -807238249
    //   1107: l2i
    //   1108: ldc_w 1729137067
    //   1111: ixor
    //   1112: goto -> 1123
    //   1115: ldc2_w -557543761
    //   1118: l2i
    //   1119: ldc_w -1082742968
    //   1122: ixor
    //   1123: ldc2_w -1334743524
    //   1126: l2i
    //   1127: ldc_w -1546317697
    //   1130: ixor
    //   1131: ixor
    //   1132: lookupswitch default -> 3695, -1151962529 -> 1115, 1914066820 -> 1160
    //   1160: dload_1
    //   1161: getstatic Perryc.0 : I
    //   1164: ifle -> 1178
    //   1167: ldc2_w 559599602
    //   1170: l2i
    //   1171: ldc_w -745028045
    //   1174: ixor
    //   1175: goto -> 1186
    //   1178: ldc2_w -350658327
    //   1181: l2i
    //   1182: ldc_w -1558684443
    //   1185: ixor
    //   1186: ldc2_w 686878481
    //   1189: l2i
    //   1190: ldc_w 1939957040
    //   1193: ixor
    //   1194: ixor
    //   1195: lookupswitch default -> 1220, -1449360416 -> 3649, -808320075 -> 1178
    //   1220: goto -> 1224
    //   1223: athrow
    //   1224: invokestatic isntValid : (Lnet/minecraft/entity/Entity;D)Z
    //   1227: goto -> 1231
    //   1230: athrow
    //   1231: ifne -> 1245
    //   1234: ldc2_w -2143427989
    //   1237: l2i
    //   1238: ldc_w -1357688145
    //   1241: ixor
    //   1242: goto -> 1253
    //   1245: ldc2_w -1533142520
    //   1248: l2i
    //   1249: ldc_w -1951356209
    //   1252: ixor
    //   1253: ldc2_w 182057274
    //   1256: l2i
    //   1257: ldc_w -1405121681
    //   1260: ixor
    //   1261: ixor
    //   1262: tableswitch default -> 1234, -1983331695 -> 1284, -1983331694 -> 638
    //   1284: getstatic Perryc.1 : I
    //   1287: ifeq -> 1301
    //   1290: ldc2_w -964067397
    //   1293: l2i
    //   1294: ldc_w -1731684036
    //   1297: ixor
    //   1298: goto -> 1309
    //   1301: ldc2_w 2122682603
    //   1304: l2i
    //   1305: ldc_w 1883905919
    //   1308: ixor
    //   1309: ldc2_w -1271161489
    //   1312: l2i
    //   1313: ldc_w 1292951316
    //   1316: ixor
    //   1317: ixor
    //   1318: lookupswitch default -> 1344, -1486183172 -> 3709, -806364760 -> 1301
    //   1344: iload_3
    //   1345: ifeq -> 1359
    //   1348: ldc2_w 541467862
    //   1351: l2i
    //   1352: ldc_w 1238272217
    //   1355: ixor
    //   1356: goto -> 1367
    //   1359: ldc2_w -1486053206
    //   1362: l2i
    //   1363: ldc_w -823915354
    //   1366: ixor
    //   1367: ldc2_w 1435817492
    //   1370: l2i
    //   1371: ldc_w -1423964970
    //   1374: ixor
    //   1375: ixor
    //   1376: tableswitch default -> 1348, -1757643059 -> 1400, -1757643058 -> 1892
    //   1400: getstatic Perryc.1 : I
    //   1403: ifeq -> 1417
    //   1406: ldc2_w -1489901939
    //   1409: l2i
    //   1410: ldc_w -1522860185
    //   1413: ixor
    //   1414: goto -> 1425
    //   1417: ldc2_w -1270903595
    //   1420: l2i
    //   1421: ldc_w -1509665882
    //   1424: ixor
    //   1425: ldc2_w -640769228
    //   1428: l2i
    //   1429: ldc_w -638814410
    //   1432: ixor
    //   1433: ixor
    //   1434: lookupswitch default -> 3689, 36294120 -> 1417, 303631217 -> 1460
    //   1460: aload #8
    //   1462: getstatic Perryc.1 : I
    //   1465: ifeq -> 1479
    //   1468: ldc2_w -1549617770
    //   1471: l2i
    //   1472: ldc_w 412688445
    //   1475: ixor
    //   1476: goto -> 1487
    //   1479: ldc2_w 1674078591
    //   1482: l2i
    //   1483: ldc_w -98978945
    //   1486: ixor
    //   1487: ldc2_w 1720104397
    //   1490: l2i
    //   1491: ldc_w 1332755004
    //   1494: ixor
    //   1495: ixor
    //   1496: lookupswitch default -> 1524, -1999185955 -> 1479, -1832052134 -> 3733
    //   1524: aload_0
    //   1525: getstatic Perryc.1 : I
    //   1528: ifeq -> 1542
    //   1531: ldc2_w -1222033456
    //   1534: l2i
    //   1535: ldc_w 805352829
    //   1538: ixor
    //   1539: goto -> 1550
    //   1542: ldc2_w 603741468
    //   1545: l2i
    //   1546: ldc_w -586812595
    //   1549: ixor
    //   1550: ldc2_w 2010062069
    //   1553: l2i
    //   1554: ldc_w 251204229
    //   1557: ixor
    //   1558: ixor
    //   1559: lookupswitch default -> 3705, -2016436191 -> 1584, -31488803 -> 1542
    //   1584: getfield antiScaffold : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1587: getstatic Perryc.1 : I
    //   1590: ifeq -> 1604
    //   1593: ldc2_w 1930412146
    //   1596: l2i
    //   1597: ldc_w -927799174
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w -1317701303
    //   1607: l2i
    //   1608: ldc_w -348935163
    //   1611: ixor
    //   1612: ldc2_w 2092094021
    //   1615: l2i
    //   1616: ldc_w -113235499
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 3713, -541839652 -> 1648, 1045418904 -> 1604
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual getValue : ()Ljava/lang/Object;
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: checkcast java/lang/Boolean
    //   1662: getstatic Perryc.c : I
    //   1665: iflt -> 1679
    //   1668: ldc2_w 369428633
    //   1671: l2i
    //   1672: ldc_w 916510915
    //   1675: ixor
    //   1676: goto -> 1687
    //   1679: ldc2_w 1426373532
    //   1682: l2i
    //   1683: ldc_w -1329664330
    //   1686: ixor
    //   1687: ldc2_w 926106502
    //   1690: l2i
    //   1691: ldc_w 423895801
    //   1694: ixor
    //   1695: ixor
    //   1696: lookupswitch default -> 1724, -309680392 -> 1679, 248688933 -> 3665
    //   1724: goto -> 1728
    //   1727: athrow
    //   1728: invokevirtual booleanValue : ()Z
    //   1731: goto -> 1735
    //   1734: athrow
    //   1735: ldc2_w -1961043397
    //   1738: l2i
    //   1739: ldc_w -1961043397
    //   1742: ixor
    //   1743: ldc2_w -139336104
    //   1746: l2i
    //   1747: ldc_w -139336104
    //   1750: ixor
    //   1751: ldc2_w -1938387971
    //   1754: l2i
    //   1755: ldc_w -1938387971
    //   1758: ixor
    //   1759: ldc2_w 2143673831
    //   1762: l2i
    //   1763: ldc_w 2143673831
    //   1766: ixor
    //   1767: getstatic Perryc.1 : I
    //   1770: ifeq -> 1784
    //   1773: ldc2_w 343283806
    //   1776: l2i
    //   1777: ldc_w 319066062
    //   1780: ixor
    //   1781: goto -> 1792
    //   1784: ldc2_w 711403226
    //   1787: l2i
    //   1788: ldc_w 1141101894
    //   1791: ixor
    //   1792: ldc2_w 1603099787
    //   1795: l2i
    //   1796: ldc_w 362795241
    //   1799: ixor
    //   1800: ixor
    //   1801: lookupswitch default -> 1828, 18177806 -> 1784, 1298144242 -> 3679
    //   1828: goto -> 1832
    //   1831: athrow
    //   1832: invokestatic isTrapped : (Lnet/minecraft/entity/player/EntityPlayer;ZZZZZ)Z
    //   1835: goto -> 1839
    //   1838: athrow
    //   1839: ifne -> 1853
    //   1842: ldc2_w 1343980412
    //   1845: l2i
    //   1846: ldc_w -1392812278
    //   1849: ixor
    //   1850: goto -> 1861
    //   1853: ldc2_w -974384215
    //   1856: l2i
    //   1857: ldc_w 957140956
    //   1860: ixor
    //   1861: ldc2_w 593187314
    //   1864: l2i
    //   1865: ldc_w 1021406581
    //   1868: ixor
    //   1869: ixor
    //   1870: tableswitch default -> 1842, -480583439 -> 1892, -480583438 -> 638
    //   1892: getstatic Perryc.0 : I
    //   1895: ifle -> 1909
    //   1898: ldc2_w 975149199
    //   1901: l2i
    //   1902: ldc_w -673269674
    //   1905: ixor
    //   1906: goto -> 1917
    //   1909: ldc2_w 1585383523
    //   1912: l2i
    //   1913: ldc_w -1032193493
    //   1916: ixor
    //   1917: ldc2_w -824804311
    //   1920: l2i
    //   1921: ldc_w -216279192
    //   1924: ixor
    //   1925: ixor
    //   1926: lookupswitch default -> 1952, -804484200 -> 3643, -568579074 -> 1909
    //   1952: getstatic bigname/zprestige/webhack/WebHack.speedManager : Lbigname/zprestige/webhack/manager/SpeedManager;
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w -1074465219
    //   1964: l2i
    //   1965: ldc_w 7719120
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 1800081420
    //   1975: l2i
    //   1976: ldc_w -381672295
    //   1979: ixor
    //   1980: ldc2_w 73158218
    //   1983: l2i
    //   1984: ldc_w -919594968
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 3683, 1332175607 -> 2016, 1928161423 -> 1972
    //   2016: aload #8
    //   2018: getstatic Perryc.1 : I
    //   2021: ifeq -> 2035
    //   2024: ldc2_w 1258850824
    //   2027: l2i
    //   2028: ldc_w -366538051
    //   2031: ixor
    //   2032: goto -> 2043
    //   2035: ldc2_w -1607697480
    //   2038: l2i
    //   2039: ldc_w 410976499
    //   2042: ixor
    //   2043: ldc2_w -662916296
    //   2046: l2i
    //   2047: ldc_w 1779699276
    //   2050: ixor
    //   2051: ixor
    //   2052: lookupswitch default -> 3661, 171689535 -> 2080, 323429825 -> 2035
    //   2080: goto -> 2084
    //   2083: athrow
    //   2084: invokevirtual getPlayerSpeed : (Lnet/minecraft/entity/player/EntityPlayer;)D
    //   2087: goto -> 2091
    //   2090: athrow
    //   2091: ldc2_w 0.02678406655664214
    //   2094: invokestatic doubleToLongBits : (D)J
    //   2097: ldc2_w 9205196320575888903
    //   2100: lxor
    //   2101: invokestatic longBitsToDouble : (J)D
    //   2104: dcmpl
    //   2105: ifle -> 2119
    //   2108: ldc2_w -918253675
    //   2111: l2i
    //   2112: ldc_w -1002329315
    //   2115: ixor
    //   2116: goto -> 2127
    //   2119: ldc2_w 290070230
    //   2122: l2i
    //   2123: ldc_w 474954335
    //   2126: ixor
    //   2127: ldc2_w 1090942265
    //   2130: l2i
    //   2131: ldc_w -398247239
    //   2134: ixor
    //   2135: ixor
    //   2136: tableswitch default -> 2108, -1539282168 -> 2160, -1539282167 -> 2163
    //   2160: goto -> 638
    //   2163: getstatic Perryc.0 : I
    //   2166: ifle -> 2180
    //   2169: ldc2_w 935457927
    //   2172: l2i
    //   2173: ldc_w -1732533826
    //   2176: ixor
    //   2177: goto -> 2188
    //   2180: ldc2_w -1362348647
    //   2183: l2i
    //   2184: ldc_w -1315524688
    //   2187: ixor
    //   2188: ldc2_w -2051101339
    //   2191: l2i
    //   2192: ldc_w -249269490
    //   2195: ixor
    //   2196: ixor
    //   2197: lookupswitch default -> 3723, -606041262 -> 2180, 1807762498 -> 2224
    //   2224: aload #4
    //   2226: ifnonnull -> 2240
    //   2229: ldc2_w 1941538171
    //   2232: l2i
    //   2233: ldc_w 582882409
    //   2236: ixor
    //   2237: goto -> 2248
    //   2240: ldc2_w 648676649
    //   2243: l2i
    //   2244: ldc_w 2007864380
    //   2247: ixor
    //   2248: ldc2_w -364133656
    //   2251: l2i
    //   2252: ldc_w 815724553
    //   2255: ixor
    //   2256: ixor
    //   2257: tableswitch default -> 2229, -1949127693 -> 2280, -1949127692 -> 2737
    //   2280: getstatic Perryc.1 : I
    //   2283: ifeq -> 2297
    //   2286: ldc2_w -929458540
    //   2289: l2i
    //   2290: ldc_w 1804504296
    //   2293: ixor
    //   2294: goto -> 2305
    //   2297: ldc2_w -11862556
    //   2300: l2i
    //   2301: ldc_w 321858228
    //   2304: ixor
    //   2305: ldc2_w -939770624
    //   2308: l2i
    //   2309: ldc_w 525083282
    //   2312: ixor
    //   2313: ixor
    //   2314: lookupswitch default -> 2340, -599973966 -> 2297, 2074543598 -> 3727
    //   2340: aload #8
    //   2342: getstatic Perryc.1 : I
    //   2345: ifeq -> 2359
    //   2348: ldc2_w -1966694411
    //   2351: l2i
    //   2352: ldc_w -1686861861
    //   2355: ixor
    //   2356: goto -> 2367
    //   2359: ldc2_w -1689508840
    //   2362: l2i
    //   2363: ldc_w -1365685205
    //   2366: ixor
    //   2367: ldc2_w -1151055284
    //   2370: l2i
    //   2371: ldc_w 1553740650
    //   2374: ixor
    //   2375: ixor
    //   2376: lookupswitch default -> 2404, -162897656 -> 3707, 523375936 -> 2359
    //   2404: astore #4
    //   2406: getstatic Perryc.1 : I
    //   2409: ifeq -> 2423
    //   2412: ldc2_w 972869368
    //   2415: l2i
    //   2416: ldc_w 283733254
    //   2419: ixor
    //   2420: goto -> 2431
    //   2423: ldc2_w 1397894665
    //   2426: l2i
    //   2427: ldc_w 405852351
    //   2430: ixor
    //   2431: ldc2_w -580895749
    //   2434: l2i
    //   2435: ldc_w -283405626
    //   2438: ixor
    //   2439: ixor
    //   2440: lookupswitch default -> 3673, 460196547 -> 2423, 2031703947 -> 2468
    //   2468: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoTrap.mc : Lnet/minecraft/client/Minecraft;
    //   2471: getstatic Perryc.0 : I
    //   2474: ifle -> 2488
    //   2477: ldc2_w 1151058720
    //   2480: l2i
    //   2481: ldc_w -972607407
    //   2484: ixor
    //   2485: goto -> 2496
    //   2488: ldc2_w -888881701
    //   2491: l2i
    //   2492: ldc_w -1521503473
    //   2495: ixor
    //   2496: ldc2_w -394867101
    //   2499: l2i
    //   2500: ldc_w -1923996120
    //   2503: ixor
    //   2504: ixor
    //   2505: lookupswitch default -> 2532, -692415352 -> 2488, -407364806 -> 3667
    //   2532: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2535: getstatic Perryc.1 : I
    //   2538: ifeq -> 2552
    //   2541: ldc2_w -264890832
    //   2544: l2i
    //   2545: ldc_w -1796539134
    //   2548: ixor
    //   2549: goto -> 2560
    //   2552: ldc2_w -1978275587
    //   2555: l2i
    //   2556: ldc_w -1574634635
    //   2559: ixor
    //   2560: ldc2_w -131323313
    //   2563: l2i
    //   2564: ldc_w 164080715
    //   2567: ixor
    //   2568: ixor
    //   2569: lookupswitch default -> 2596, -1791529674 -> 3691, -1473357365 -> 2552
    //   2596: aload #8
    //   2598: getstatic Perryc.1 : I
    //   2601: ifeq -> 2615
    //   2604: ldc2_w -77051771
    //   2607: l2i
    //   2608: ldc_w -1580601908
    //   2611: ixor
    //   2612: goto -> 2623
    //   2615: ldc2_w -543225044
    //   2618: l2i
    //   2619: ldc_w -855026731
    //   2622: ixor
    //   2623: ldc2_w 1280144261
    //   2626: l2i
    //   2627: ldc_w 113336631
    //   2630: ixor
    //   2631: ixor
    //   2632: lookupswitch default -> 2660, -1175946015 -> 2615, 271431675 -> 3651
    //   2660: goto -> 2664
    //   2663: athrow
    //   2664: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   2667: goto -> 2671
    //   2670: athrow
    //   2671: getstatic Perryc.1 : I
    //   2674: ifeq -> 2688
    //   2677: ldc2_w -1443331139
    //   2680: l2i
    //   2681: ldc_w 135823502
    //   2684: ixor
    //   2685: goto -> 2696
    //   2688: ldc2_w 1309057089
    //   2691: l2i
    //   2692: ldc_w -1682194202
    //   2695: ixor
    //   2696: ldc2_w 233943661
    //   2699: l2i
    //   2700: ldc_w 1864431366
    //   2703: ixor
    //   2704: ixor
    //   2705: lookupswitch default -> 3731, -1217649204 -> 2732, -1020180904 -> 2688
    //   2732: dstore #5
    //   2734: goto -> 638
    //   2737: getstatic Perryc.c : I
    //   2740: iflt -> 2754
    //   2743: ldc2_w 1905003979
    //   2746: l2i
    //   2747: ldc_w 244550820
    //   2750: ixor
    //   2751: goto -> 2762
    //   2754: ldc2_w -585389037
    //   2757: l2i
    //   2758: ldc_w 1838251381
    //   2761: ixor
    //   2762: ldc2_w 485777741
    //   2765: l2i
    //   2766: ldc_w -569322026
    //   2769: ixor
    //   2770: ixor
    //   2771: lookupswitch default -> 3669, -1107610124 -> 2754, 1919837693 -> 2796
    //   2796: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoTrap.mc : Lnet/minecraft/client/Minecraft;
    //   2799: getstatic Perryc.0 : I
    //   2802: ifle -> 2816
    //   2805: ldc2_w 1061179944
    //   2808: l2i
    //   2809: ldc_w -1030241499
    //   2812: ixor
    //   2813: goto -> 2824
    //   2816: ldc2_w 1079026801
    //   2819: l2i
    //   2820: ldc_w -100402878
    //   2823: ixor
    //   2824: ldc2_w -1968882109
    //   2827: l2i
    //   2828: ldc_w 1300264917
    //   2831: ixor
    //   2832: ixor
    //   2833: lookupswitch default -> 3721, 988993691 -> 2816, 2104890533 -> 2860
    //   2860: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2863: getstatic Perryc.c : I
    //   2866: iflt -> 2880
    //   2869: ldc2_w 269685687
    //   2872: l2i
    //   2873: ldc_w 981649568
    //   2876: ixor
    //   2877: goto -> 2888
    //   2880: ldc2_w 1130470622
    //   2883: l2i
    //   2884: ldc_w 2099063071
    //   2887: ixor
    //   2888: ldc2_w -2070723332
    //   2891: l2i
    //   2892: ldc_w -76864321
    //   2895: ixor
    //   2896: ixor
    //   2897: lookupswitch default -> 3717, 1099224450 -> 2924, 1432992596 -> 2880
    //   2924: aload #8
    //   2926: getstatic Perryc.c : I
    //   2929: iflt -> 2943
    //   2932: ldc2_w -689995740
    //   2935: l2i
    //   2936: ldc_w 37391702
    //   2939: ixor
    //   2940: goto -> 2951
    //   2943: ldc2_w 437883851
    //   2946: l2i
    //   2947: ldc_w -2106427646
    //   2950: ixor
    //   2951: ldc2_w 1934108859
    //   2954: l2i
    //   2955: ldc_w 1951913877
    //   2958: ixor
    //   2959: ixor
    //   2960: lookupswitch default -> 3675, -1619780633 -> 2988, -738528676 -> 2943
    //   2988: goto -> 2992
    //   2991: athrow
    //   2992: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   2995: goto -> 2999
    //   2998: athrow
    //   2999: getstatic Perryc.1 : I
    //   3002: ifeq -> 3016
    //   3005: ldc2_w 1255205445
    //   3008: l2i
    //   3009: ldc_w -637300706
    //   3012: ixor
    //   3013: goto -> 3024
    //   3016: ldc2_w 491780079
    //   3019: l2i
    //   3020: ldc_w 1240162903
    //   3023: ixor
    //   3024: ldc2_w -285911307
    //   3027: l2i
    //   3028: ldc_w 1619089676
    //   3031: ixor
    //   3032: ixor
    //   3033: lookupswitch default -> 3060, 514291106 -> 3715, 636105128 -> 3016
    //   3060: dload #5
    //   3062: dcmpg
    //   3063: iflt -> 3077
    //   3066: ldc2_w -497572961
    //   3069: l2i
    //   3070: ldc_w 1099227155
    //   3073: ixor
    //   3074: goto -> 3085
    //   3077: ldc2_w 1315600834
    //   3080: l2i
    //   3081: ldc_w -306628017
    //   3084: ixor
    //   3085: ldc2_w 140274538
    //   3088: l2i
    //   3089: ldc_w 2071191862
    //   3092: ixor
    //   3093: ixor
    //   3094: tableswitch default -> 3066, -788739632 -> 3116, -788739631 -> 3119
    //   3116: goto -> 638
    //   3119: getstatic Perryc.0 : I
    //   3122: ifle -> 3136
    //   3125: ldc2_w -1933182673
    //   3128: l2i
    //   3129: ldc_w 827020999
    //   3132: ixor
    //   3133: goto -> 3144
    //   3136: ldc2_w -1418490743
    //   3139: l2i
    //   3140: ldc_w 1213154985
    //   3143: ixor
    //   3144: ldc2_w 2049549051
    //   3147: l2i
    //   3148: ldc_w 738075353
    //   3151: ixor
    //   3152: ixor
    //   3153: lookupswitch default -> 3681, -1293202942 -> 3180, -329699382 -> 3136
    //   3180: aload #8
    //   3182: getstatic Perryc.1 : I
    //   3185: ifeq -> 3199
    //   3188: ldc2_w 1862840796
    //   3191: l2i
    //   3192: ldc_w -248117263
    //   3195: ixor
    //   3196: goto -> 3207
    //   3199: ldc2_w 1861342745
    //   3202: l2i
    //   3203: ldc_w -1094387356
    //   3206: ixor
    //   3207: ldc2_w 186098396
    //   3210: l2i
    //   3211: ldc_w -861079629
    //   3214: ixor
    //   3215: ixor
    //   3216: lookupswitch default -> 3653, 395213330 -> 3244, 1501946690 -> 3199
    //   3244: astore #4
    //   3246: getstatic Perryc.c : I
    //   3249: iflt -> 3263
    //   3252: ldc2_w -1023207494
    //   3255: l2i
    //   3256: ldc_w 1425022758
    //   3259: ixor
    //   3260: goto -> 3271
    //   3263: ldc2_w 67212787
    //   3266: l2i
    //   3267: ldc_w 1797949655
    //   3270: ixor
    //   3271: ldc2_w 1722442257
    //   3274: l2i
    //   3275: ldc_w -1266411506
    //   3278: ixor
    //   3279: ixor
    //   3280: lookupswitch default -> 3308, 1172140675 -> 3701, 1294857996 -> 3263
    //   3308: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoTrap.mc : Lnet/minecraft/client/Minecraft;
    //   3311: getstatic Perryc.1 : I
    //   3314: ifeq -> 3328
    //   3317: ldc2_w 1303638350
    //   3320: l2i
    //   3321: ldc_w -164650161
    //   3324: ixor
    //   3325: goto -> 3336
    //   3328: ldc2_w 196958280
    //   3331: l2i
    //   3332: ldc_w 122136938
    //   3335: ixor
    //   3336: ldc2_w -256175286
    //   3339: l2i
    //   3340: ldc_w -1271893409
    //   3343: ixor
    //   3344: ixor
    //   3345: lookupswitch default -> 3372, -15256812 -> 3671, 1599167501 -> 3328
    //   3372: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3375: getstatic Perryc.0 : I
    //   3378: ifle -> 3392
    //   3381: ldc2_w -175470549
    //   3384: l2i
    //   3385: ldc_w -671677655
    //   3388: ixor
    //   3389: goto -> 3400
    //   3392: ldc2_w -136047670
    //   3395: l2i
    //   3396: ldc_w -1243661635
    //   3399: ixor
    //   3400: ldc2_w -849163159
    //   3403: l2i
    //   3404: ldc_w 1788814780
    //   3407: ixor
    //   3408: ixor
    //   3409: lookupswitch default -> 3436, -2055183657 -> 3663, -757357882 -> 3392
    //   3436: aload #8
    //   3438: getstatic Perryc.1 : I
    //   3441: ifeq -> 3455
    //   3444: ldc2_w 258442424
    //   3447: l2i
    //   3448: ldc_w 1167430999
    //   3451: ixor
    //   3452: goto -> 3463
    //   3455: ldc2_w 1480301759
    //   3458: l2i
    //   3459: ldc_w -1327973993
    //   3462: ixor
    //   3463: ldc2_w 323919309
    //   3466: l2i
    //   3467: ldc_w -228859683
    //   3470: ixor
    //   3471: ixor
    //   3472: lookupswitch default -> 3500, -1410896641 -> 3693, -126634980 -> 3455
    //   3500: goto -> 3504
    //   3503: athrow
    //   3504: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   3507: goto -> 3511
    //   3510: athrow
    //   3511: getstatic Perryc.1 : I
    //   3514: ifeq -> 3528
    //   3517: ldc2_w 953237848
    //   3520: l2i
    //   3521: ldc_w 2095536726
    //   3524: ixor
    //   3525: goto -> 3536
    //   3528: ldc2_w 130449016
    //   3531: l2i
    //   3532: ldc_w 2054275142
    //   3535: ixor
    //   3536: ldc2_w 2000589354
    //   3539: l2i
    //   3540: ldc_w 1878561549
    //   3543: ixor
    //   3544: ixor
    //   3545: lookupswitch default -> 3572, 1559239209 -> 3639, 1713419741 -> 3528
    //   3572: dstore #5
    //   3574: goto -> 638
    //   3577: getstatic Perryc.1 : I
    //   3580: ifeq -> 3594
    //   3583: ldc2_w -1435719716
    //   3586: l2i
    //   3587: ldc_w 1499697634
    //   3590: ixor
    //   3591: goto -> 3602
    //   3594: ldc2_w 1195275384
    //   3597: l2i
    //   3598: ldc_w -74826726
    //   3601: ixor
    //   3602: ldc2_w 953296319
    //   3605: l2i
    //   3606: ldc_w 277030387
    //   3609: ixor
    //   3610: ixor
    //   3611: lookupswitch default -> 3645, -1796913106 -> 3636, -614582670 -> 3594
    //   3636: aload #4
    //   3638: areturn
    //   3639: aconst_null
    //   3640: athrow
    //   3641: aconst_null
    //   3642: athrow
    //   3643: aconst_null
    //   3644: athrow
    //   3645: aconst_null
    //   3646: athrow
    //   3647: aconst_null
    //   3648: athrow
    //   3649: aconst_null
    //   3650: athrow
    //   3651: aconst_null
    //   3652: athrow
    //   3653: aconst_null
    //   3654: athrow
    //   3655: aconst_null
    //   3656: athrow
    //   3657: aconst_null
    //   3658: athrow
    //   3659: aconst_null
    //   3660: athrow
    //   3661: aconst_null
    //   3662: athrow
    //   3663: aconst_null
    //   3664: athrow
    //   3665: aconst_null
    //   3666: athrow
    //   3667: aconst_null
    //   3668: athrow
    //   3669: aconst_null
    //   3670: athrow
    //   3671: aconst_null
    //   3672: athrow
    //   3673: aconst_null
    //   3674: athrow
    //   3675: aconst_null
    //   3676: athrow
    //   3677: aconst_null
    //   3678: athrow
    //   3679: aconst_null
    //   3680: athrow
    //   3681: aconst_null
    //   3682: athrow
    //   3683: aconst_null
    //   3684: athrow
    //   3685: aconst_null
    //   3686: athrow
    //   3687: aconst_null
    //   3688: athrow
    //   3689: aconst_null
    //   3690: athrow
    //   3691: aconst_null
    //   3692: athrow
    //   3693: aconst_null
    //   3694: athrow
    //   3695: aconst_null
    //   3696: athrow
    //   3697: aconst_null
    //   3698: athrow
    //   3699: aconst_null
    //   3700: athrow
    //   3701: aconst_null
    //   3702: athrow
    //   3703: aconst_null
    //   3704: athrow
    //   3705: aconst_null
    //   3706: athrow
    //   3707: aconst_null
    //   3708: athrow
    //   3709: aconst_null
    //   3710: athrow
    //   3711: aconst_null
    //   3712: athrow
    //   3713: aconst_null
    //   3714: athrow
    //   3715: aconst_null
    //   3716: athrow
    //   3717: aconst_null
    //   3718: athrow
    //   3719: aconst_null
    //   3720: athrow
    //   3721: aconst_null
    //   3722: athrow
    //   3723: aconst_null
    //   3724: athrow
    //   3725: aconst_null
    //   3726: athrow
    //   3727: aconst_null
    //   3728: athrow
    //   3729: aconst_null
    //   3730: athrow
    //   3731: aconst_null
    //   3732: athrow
    //   3733: aconst_null
    //   3734: athrow
    //   3735: pop
    //   3736: goto -> 24
    //   3739: pop
    //   3740: aconst_null
    //   3741: goto -> 3735
    //   3744: dup
    //   3745: ifnull -> 3735
    //   3748: checkcast java/lang/Throwable
    //   3751: athrow
    //   3752: dup
    //   3753: ifnull -> 3739
    //   3756: checkcast java/lang/Throwable
    //   3759: athrow
    //   3760: aconst_null
    //   3761: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1034	2540	8	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	3615	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoTrap;
    //   24	3615	1	range	D
    //   24	3615	3	trapped	Z
    //   86	3553	4	target	Lnet/minecraft/entity/player/EntityPlayer;
    //   310	3329	5	distance	D
    // Exception table:
    //   from	to	target	type
    //   8	20	3744	finally
    //   227	234	234	finally
    //   227	234	227	finally
    //   227	234	227	java/lang/AssertionError
    //   228	234	3	finally
    //   228	234	3	finally
    //   567	576	576	finally
    //   567	576	576	finally
    //   567	576	3	java/lang/UnsupportedOperationException
    //   568	576	567	finally
    //   568	576	576	java/lang/EnumConstantNotPresentException
    //   767	776	776	finally
    //   767	776	767	finally
    //   768	776	776	java/lang/IndexOutOfBoundsException
    //   768	776	776	java/lang/EnumConstantNotPresentException
    //   768	776	776	java/lang/NullPointerException
    //   959	968	968	finally
    //   959	968	968	finally
    //   959	968	959	finally
    //   959	968	968	java/lang/NegativeArraySizeException
    //   960	968	3	java/lang/RuntimeException
    //   1224	1230	1230	finally
    //   1224	1230	3	finally
    //   1224	1230	3	java/lang/UnsupportedOperationException
    //   1224	1230	1230	java/util/NoSuchElementException
    //   1224	1230	1230	java/util/NoSuchElementException
    //   1651	1658	1658	finally
    //   1651	1658	3	finally
    //   1652	1658	1651	java/lang/NumberFormatException
    //   1652	1658	1651	finally
    //   1652	1658	1658	finally
    //   1727	1734	1734	finally
    //   1727	1734	1727	java/lang/StringIndexOutOfBoundsException
    //   1728	1734	1727	java/util/ConcurrentModificationException
    //   1728	1734	3	java/lang/AssertionError
    //   1728	1734	3	finally
    //   1832	1838	1838	finally
    //   1832	1838	1838	finally
    //   1832	1838	3	finally
    //   1832	1838	1838	java/lang/NullPointerException
    //   1832	1838	1838	finally
    //   2083	2090	2090	finally
    //   2083	2090	2083	java/lang/UnsupportedOperationException
    //   2083	2090	2083	finally
    //   2083	2090	3	java/lang/UnsupportedOperationException
    //   2084	2090	3	finally
    //   2663	2670	2670	finally
    //   2663	2670	3	java/lang/UnsupportedOperationException
    //   2663	2670	3	finally
    //   2663	2670	2670	java/lang/NumberFormatException
    //   2664	2670	2663	finally
    //   2991	2998	2998	finally
    //   2991	2998	2998	finally
    //   2992	2998	2991	java/lang/EnumConstantNotPresentException
    //   2992	2998	3	finally
    //   2992	2998	2998	finally
    //   3504	3510	3510	finally
    //   3504	3510	3510	finally
    //   3504	3510	3	finally
    //   3504	3510	3	finally
    //   3504	3510	3	java/lang/ArithmeticException
    //   3744	3752	3744	finally
    //   3760	3762	3	finally
  }
  
  public void onTick() {
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
  
  public void placeBlock(BlockPos paramBlockPos) {
    Perry1.60(this, (int)1216472283L ^ 0x66D474C2, paramBlockPos);
  }
  
  public void onEnable() {
    Perry1.3F(this, (int)-796495874L ^ 0xA338B984);
  }
  
  public String getDisplayInfo() {
    return Perry1.k(this, (int)589397849L ^ 0x1E5C1E0F);
  }
  
  public static int lambda$placeList$0(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return Perry1.0P(null, (int)-1107534980L ^ 0xAB33E675, paramVec3d1, paramVec3d2);
  }
  
  public void doTrap() {
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
  
  public boolean check() {
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
  
  public static double lambda$placeList$1(Vec3d paramVec3d) {
    return Perry1.13(null, (int)438093811L ^ 0x5737F2B6, paramVec3d);
  }
  
  public AutoTrap() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 525973224
    //   9: l2i
    //   10: ldc_w 693998066
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1929210773
    //   20: l2i
    //   21: ldc_w -1205076203
    //   24: ixor
    //   25: ldc2_w -1153248318
    //   28: l2i
    //   29: ldc_w -1697255100
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 4050, 348015096 -> 60, 395511196 -> 17
    //   60: aload_0
    //   61: ldc_w '쯬㌆쮳㶸眞╣๸뙰'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -168681268
    //   73: l2i
    //   74: ldc_w 991461746
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -595254247
    //   84: l2i
    //   85: ldc_w 697297189
    //   88: ixor
    //   89: ldc2_w 1672505759
    //   92: l2i
    //   93: ldc_w 1305956631
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -527591114 -> 4094, 1442200206 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '쯹㌁쮦㶧眹┱๶뙴蹫⯑猄੧؅煭꼣嚱辚ᏒꝽ'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 1010193513
    //   139: l2i
    //   140: ldc_w -456734701
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 229086942
    //   150: l2i
    //   151: ldc_w 113850688
    //   154: ixor
    //   155: ldc2_w 291026444
    //   158: l2i
    //   159: ldc_w 872460909
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 4034, -39282661 -> 147, 775334911 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w 1959474134
    //   204: l2i
    //   205: ldc_w 462017459
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1143904920
    //   215: l2i
    //   216: ldc_w -1572691997
    //   219: ixor
    //   220: ldc2_w 754117427
    //   223: l2i
    //   224: ldc_w 1516591374
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, 433410648 -> 4076, 706238810 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 2039115200
    //   262: l2i
    //   263: ldc_w 2039115201
    //   266: ixor
    //   267: ldc2_w -1370157725
    //   270: l2i
    //   271: ldc_w -1370157725
    //   274: ixor
    //   275: ldc2_w 165301191
    //   278: l2i
    //   279: ldc_w 165301191
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -1034199018
    //   292: l2i
    //   293: ldc_w -1590979638
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1558356194
    //   303: l2i
    //   304: ldc_w -300151489
    //   307: ixor
    //   308: ldc2_w -78486600
    //   311: l2i
    //   312: ldc_w -1088660645
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 4096, 156199618 -> 344, 658426687 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 495280796
    //   356: l2i
    //   357: ldc_w 1061380104
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1106633343
    //   367: l2i
    //   368: ldc_w -1114083928
    //   371: ixor
    //   372: ldc2_w 768504654
    //   375: l2i
    //   376: ldc_w 1576026645
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, 228490025 -> 364, 1391997903 -> 4052
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w -1312164573
    //   418: l2i
    //   419: ldc_w 1989619592
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -612230880
    //   429: l2i
    //   430: ldc_w 1531191425
    //   433: ixor
    //   434: ldc2_w 1760555631
    //   437: l2i
    //   438: ldc_w 605698101
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1951723279 -> 4134, -1124367950 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '쯩㌖쮫㶶眳'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 331458812
    //   485: l2i
    //   486: ldc_w -14563249
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 265367066
    //   496: l2i
    //   497: ldc_w 721103030
    //   500: ixor
    //   501: ldc2_w -1124123437
    //   504: l2i
    //   505: ldc_w -1338053198
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -534662702 -> 4058, 1522572943 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -993261044
    //   542: l2i
    //   543: ldc_w -993260994
    //   546: ixor
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w -1789529942
    //   556: l2i
    //   557: ldc_w 377597701
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1940367143
    //   567: l2i
    //   568: ldc_w -1720072568
    //   571: ixor
    //   572: ldc2_w -331630263
    //   575: l2i
    //   576: ldc_w -502976566
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 4022, -1913992916 -> 564, 455018706 -> 608
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w 427744562
    //   614: l2i
    //   615: ldc_w 427744562
    //   618: ixor
    //   619: getstatic Perryc.1 : I
    //   622: ifeq -> 636
    //   625: ldc2_w 1071344138
    //   628: l2i
    //   629: ldc_w -1300825447
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 1354768230
    //   639: l2i
    //   640: ldc_w -1698532284
    //   643: ixor
    //   644: ldc2_w 74098141
    //   647: l2i
    //   648: ldc_w -1606420618
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 680, 364123003 -> 636, 704168504 -> 4020
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w -415379122
    //   686: l2i
    //   687: ldc_w -415379020
    //   690: ixor
    //   691: getstatic Perryc.c : I
    //   694: iflt -> 708
    //   697: ldc2_w -2028349680
    //   700: l2i
    //   701: ldc_w 563739431
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 49225741
    //   711: l2i
    //   712: ldc_w -1139083052
    //   715: ixor
    //   716: ldc2_w -17670672
    //   719: l2i
    //   720: ldc_w -1400849411
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -2115776702 -> 708, -185415110 -> 4044
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w 1173761753
    //   764: l2i
    //   765: ldc_w -826544792
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -1795178862
    //   775: l2i
    //   776: ldc_w 321295127
    //   779: ixor
    //   780: ldc2_w -128903668
    //   783: l2i
    //   784: ldc_w -422833454
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 4128, -1781479569 -> 772, -1723586213 -> 816
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.c : I
    //   822: iflt -> 836
    //   825: ldc2_w -2034732813
    //   828: l2i
    //   829: ldc_w 1895314105
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w -432527261
    //   839: l2i
    //   840: ldc_w -1964349677
    //   843: ixor
    //   844: ldc2_w 80597749
    //   847: l2i
    //   848: ldc_w 1311322501
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -1273373706 -> 836, -1130061510 -> 4066
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.c : I
    //   886: iflt -> 900
    //   889: ldc2_w -1249366582
    //   892: l2i
    //   893: ldc_w 913450814
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 869993389
    //   903: l2i
    //   904: ldc_w 1840481917
    //   907: ixor
    //   908: ldc2_w -923397734
    //   911: l2i
    //   912: ldc_w 723579313
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 4082, -1111593477 -> 944, 1613556447 -> 900
    //   944: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.0 : I
    //   950: ifle -> 964
    //   953: ldc2_w -819151862
    //   956: l2i
    //   957: ldc_w -359974299
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w -489948834
    //   967: l2i
    //   968: ldc_w 1365967255
    //   971: ixor
    //   972: ldc2_w 1326446224
    //   975: l2i
    //   976: ldc_w 918705800
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -1279261818 -> 964, 1550460535 -> 4126
    //   1008: aload_0
    //   1009: getstatic Perryc.1 : I
    //   1012: ifeq -> 1026
    //   1015: ldc2_w -2124989323
    //   1018: l2i
    //   1019: ldc_w -1830513246
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 619448843
    //   1029: l2i
    //   1030: ldc_w -1635196448
    //   1033: ixor
    //   1034: ldc2_w 2111315764
    //   1037: l2i
    //   1038: ldc_w 42199982
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1068, 17441642 -> 1026, 1827167565 -> 4106
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '쯯㌟쮨㶴眡╢้뙥蹱⯠猟ਤ؞'
    //   1076: getstatic Perryc.c : I
    //   1079: iflt -> 1093
    //   1082: ldc2_w -1057966535
    //   1085: l2i
    //   1086: ldc_w 826014234
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w 1595848294
    //   1096: l2i
    //   1097: ldc_w 1526075249
    //   1100: ixor
    //   1101: ldc2_w 1011125571
    //   1104: l2i
    //   1105: ldc_w -1373520834
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, 693696666 -> 1093, 1672379742 -> 4100
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w 1368277984
    //   1142: l2i
    //   1143: ldc_w 1368277992
    //   1146: ixor
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w -2090886152
    //   1156: l2i
    //   1157: ldc_w -1709649297
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 1520224108
    //   1167: l2i
    //   1168: ldc_w 1409058666
    //   1171: ixor
    //   1172: ldc2_w -1387126026
    //   1175: l2i
    //   1176: ldc_w 1289728807
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 4046, -387067433 -> 1208, -120924090 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w -26994868
    //   1214: l2i
    //   1215: ldc_w -26994867
    //   1218: ixor
    //   1219: getstatic Perryc.1 : I
    //   1222: ifeq -> 1236
    //   1225: ldc2_w -1224723595
    //   1228: l2i
    //   1229: ldc_w 785663735
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w 584110206
    //   1239: l2i
    //   1240: ldc_w 10720340
    //   1243: ixor
    //   1244: ldc2_w -1509514159
    //   1247: l2i
    //   1248: ldc_w -1513803948
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 4072, -1709703545 -> 1236, 565235503 -> 1280
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w 778462649
    //   1286: l2i
    //   1287: ldc_w 778462631
    //   1290: ixor
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w 194222128
    //   1300: l2i
    //   1301: ldc_w 1531906253
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w -44844309
    //   1311: l2i
    //   1312: ldc_w -527704763
    //   1315: ixor
    //   1316: ldc2_w -1804814945
    //   1319: l2i
    //   1320: ldc_w 1102268356
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 4048, -2063375706 -> 1308, -939026955 -> 1352
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.1 : I
    //   1358: ifeq -> 1372
    //   1361: ldc2_w -1290387964
    //   1364: l2i
    //   1365: ldc_w -690982943
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w -1164877801
    //   1375: l2i
    //   1376: ldc_w 1627127163
    //   1379: ixor
    //   1380: ldc2_w -1900948125
    //   1383: l2i
    //   1384: ldc_w -437431435
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 4122, -1321854086 -> 1416, 245028851 -> 1372
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.1 : I
    //   1422: ifeq -> 1436
    //   1425: ldc2_w 110804119
    //   1428: l2i
    //   1429: ldc_w 1833629358
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 362372146
    //   1439: l2i
    //   1440: ldc_w 692955850
    //   1443: ixor
    //   1444: ldc2_w 1523408510
    //   1447: l2i
    //   1448: ldc_w -1623523574
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 4038, -1373115571 -> 1436, -115124340 -> 1480
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.1 : I
    //   1486: ifeq -> 1500
    //   1489: ldc2_w 1147396033
    //   1492: l2i
    //   1493: ldc_w 1977473503
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w -783718791
    //   1503: l2i
    //   1504: ldc_w 888668957
    //   1507: ixor
    //   1508: ldc2_w -1378610748
    //   1511: l2i
    //   1512: ldc_w -1329802247
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, 165005506 -> 1500, 752272419 -> 4114
    //   1544: putfield blocksPerPlace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.1 : I
    //   1550: ifeq -> 1564
    //   1553: ldc2_w 690725385
    //   1556: l2i
    //   1557: ldc_w 1350403078
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w -515384404
    //   1567: l2i
    //   1568: ldc_w 196678813
    //   1571: ixor
    //   1572: ldc2_w -1955430248
    //   1575: l2i
    //   1576: ldc_w -464195974
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 4116, -2049400365 -> 1608, 376457453 -> 1564
    //   1608: aload_0
    //   1609: getstatic Perryc.1 : I
    //   1612: ifeq -> 1626
    //   1615: ldc2_w 582887386
    //   1618: l2i
    //   1619: ldc_w -1389778055
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w -1383352086
    //   1629: l2i
    //   1630: ldc_w 639973590
    //   1633: ixor
    //   1634: ldc2_w -1701770559
    //   1637: l2i
    //   1638: ldc_w -509947199
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, -191081309 -> 4030, 2140620232 -> 1626
    //   1668: aload_0
    //   1669: new bigname/zprestige/webhack/features/setting/Setting
    //   1672: dup
    //   1673: ldc_w '쯿㌜쮳㶶眾╴'
    //   1676: getstatic Perryc.0 : I
    //   1679: ifle -> 1693
    //   1682: ldc2_w -868296710
    //   1685: l2i
    //   1686: ldc_w -1850873724
    //   1689: ixor
    //   1690: goto -> 1701
    //   1693: ldc2_w 809266835
    //   1696: l2i
    //   1697: ldc_w -1305123140
    //   1700: ixor
    //   1701: ldc2_w -1734013713
    //   1704: l2i
    //   1705: ldc_w -362318249
    //   1708: ixor
    //   1709: ixor
    //   1710: lookupswitch default -> 4060, -255102313 -> 1736, 793855430 -> 1693
    //   1736: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1739: ldc2_w -593179330
    //   1742: l2i
    //   1743: ldc_w -593179329
    //   1746: ixor
    //   1747: getstatic Perryc.c : I
    //   1750: iflt -> 1764
    //   1753: ldc2_w 312384321
    //   1756: l2i
    //   1757: ldc_w -2041532947
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w -504896898
    //   1767: l2i
    //   1768: ldc_w -1476270143
    //   1771: ixor
    //   1772: ldc2_w 75072307
    //   1775: l2i
    //   1776: ldc_w -1507894973
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 4108, -343875633 -> 1808, 917040348 -> 1764
    //   1808: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1811: getstatic Perryc.c : I
    //   1814: iflt -> 1828
    //   1817: ldc2_w 1987760112
    //   1820: l2i
    //   1821: ldc_w -964714238
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w -314387683
    //   1831: l2i
    //   1832: ldc_w -732141214
    //   1835: ixor
    //   1836: ldc2_w 886689250
    //   1839: l2i
    //   1840: ldc_w -35577289
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 1872, 582012691 -> 1828, 2034073895 -> 4062
    //   1872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1875: getstatic Perryc.1 : I
    //   1878: ifeq -> 1892
    //   1881: ldc2_w -1596190829
    //   1884: l2i
    //   1885: ldc_w -1296596570
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w -1229085879
    //   1895: l2i
    //   1896: ldc_w -598225806
    //   1899: ixor
    //   1900: ldc2_w -2002280004
    //   1903: l2i
    //   1904: ldc_w -834171487
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 4132, 738870054 -> 1936, 1418437160 -> 1892
    //   1936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1939: getstatic Perryc.0 : I
    //   1942: ifle -> 1956
    //   1945: ldc2_w 1225554310
    //   1948: l2i
    //   1949: ldc_w 290328975
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w 1683965651
    //   1959: l2i
    //   1960: ldc_w -1041759892
    //   1963: ixor
    //   1964: ldc2_w 150278389
    //   1967: l2i
    //   1968: ldc_w -542236576
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 2000, -1894164324 -> 4068, 1631494300 -> 1956
    //   2000: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2003: getstatic Perryc.1 : I
    //   2006: ifeq -> 2020
    //   2009: ldc2_w 435873191
    //   2012: l2i
    //   2013: ldc_w -1476522349
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 1267259569
    //   2023: l2i
    //   2024: ldc_w -1983508416
    //   2027: ixor
    //   2028: ldc2_w 24676726
    //   2031: l2i
    //   2032: ldc_w -1148573022
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2064, -2123333094 -> 2020, 83249376 -> 4088
    //   2064: aload_0
    //   2065: getstatic Perryc.1 : I
    //   2068: ifeq -> 2082
    //   2071: ldc2_w -543556922
    //   2074: l2i
    //   2075: ldc_w 877595729
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w 1193313285
    //   2085: l2i
    //   2086: ldc_w 1431367120
    //   2089: ixor
    //   2090: ldc2_w -156847967
    //   2093: l2i
    //   2094: ldc_w 1561863401
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 4028, -1177616995 -> 2124, 1080582879 -> 2082
    //   2124: aload_0
    //   2125: new bigname/zprestige/webhack/features/setting/Setting
    //   2128: dup
    //   2129: ldc_w '쯿㌒쮾㶣眸╰๺뙥'
    //   2132: getstatic Perryc.c : I
    //   2135: iflt -> 2149
    //   2138: ldc2_w 1771146708
    //   2141: l2i
    //   2142: ldc_w -431830684
    //   2145: ixor
    //   2146: goto -> 2157
    //   2149: ldc2_w -730719579
    //   2152: l2i
    //   2153: ldc_w 1775396526
    //   2156: ixor
    //   2157: ldc2_w -1586612072
    //   2160: l2i
    //   2161: ldc_w 1226791353
    //   2164: ixor
    //   2165: ixor
    //   2166: lookupswitch default -> 4110, 1439767850 -> 2192, 1738679697 -> 2149
    //   2192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2195: ldc2_w 1843411215
    //   2198: l2i
    //   2199: ldc_w 1843411215
    //   2202: ixor
    //   2203: getstatic Perryc.0 : I
    //   2206: ifle -> 2220
    //   2209: ldc2_w 817312325
    //   2212: l2i
    //   2213: ldc_w -1892130298
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w -269807387
    //   2223: l2i
    //   2224: ldc_w 1583844385
    //   2227: ixor
    //   2228: ldc2_w 66260079
    //   2231: l2i
    //   2232: ldc_w -1632581203
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 4120, 583832961 -> 2220, 751786246 -> 2264
    //   2264: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2267: getstatic Perryc.1 : I
    //   2270: ifeq -> 2284
    //   2273: ldc2_w 235706503
    //   2276: l2i
    //   2277: ldc_w 462573002
    //   2280: ixor
    //   2281: goto -> 2292
    //   2284: ldc2_w -444717387
    //   2287: l2i
    //   2288: ldc_w 1772255644
    //   2291: ixor
    //   2292: ldc2_w 481057197
    //   2295: l2i
    //   2296: ldc_w 690426864
    //   2299: ixor
    //   2300: ixor
    //   2301: lookupswitch default -> 4092, -1185475212 -> 2328, 538287888 -> 2284
    //   2328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2331: getstatic Perryc.1 : I
    //   2334: ifeq -> 2348
    //   2337: ldc2_w 1148436694
    //   2340: l2i
    //   2341: ldc_w -1857902145
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w -353148617
    //   2351: l2i
    //   2352: ldc_w -625269234
    //   2355: ixor
    //   2356: ldc2_w -2124205521
    //   2359: l2i
    //   2360: ldc_w 223043271
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 4024, -1134548015 -> 2392, 1494812033 -> 2348
    //   2392: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2395: getstatic Perryc.1 : I
    //   2398: ifeq -> 2412
    //   2401: ldc2_w 79771927
    //   2404: l2i
    //   2405: ldc_w 2093744837
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w -1065514421
    //   2415: l2i
    //   2416: ldc_w -727713576
    //   2419: ixor
    //   2420: ldc2_w -396177868
    //   2423: l2i
    //   2424: ldc_w 1612618099
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 4084, -1667357228 -> 2456, -261002091 -> 2412
    //   2456: putfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2459: getstatic Perryc.0 : I
    //   2462: ifle -> 2476
    //   2465: ldc2_w 2096593605
    //   2468: l2i
    //   2469: ldc_w 933872282
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w 411986373
    //   2479: l2i
    //   2480: ldc_w -2122674321
    //   2483: ixor
    //   2484: ldc2_w -2088256927
    //   2487: l2i
    //   2488: ldc_w 738634364
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 4056, -455104446 -> 2476, 913700535 -> 2520
    //   2520: aload_0
    //   2521: getstatic Perryc.c : I
    //   2524: iflt -> 2538
    //   2527: ldc2_w -397536779
    //   2530: l2i
    //   2531: ldc_w -70054614
    //   2534: ixor
    //   2535: goto -> 2546
    //   2538: ldc2_w 1362881268
    //   2541: l2i
    //   2542: ldc_w -1995570078
    //   2545: ixor
    //   2546: ldc2_w -471021645
    //   2549: l2i
    //   2550: ldc_w -840700402
    //   2553: ixor
    //   2554: ixor
    //   2555: lookupswitch default -> 4090, -163920085 -> 2580, 1032992098 -> 2538
    //   2580: aload_0
    //   2581: new bigname/zprestige/webhack/features/setting/Setting
    //   2584: dup
    //   2585: ldc_w '쯨㌋쮳㶥眫'
    //   2588: getstatic Perryc.c : I
    //   2591: iflt -> 2605
    //   2594: ldc2_w 429340403
    //   2597: l2i
    //   2598: ldc_w 1333062781
    //   2601: ixor
    //   2602: goto -> 2613
    //   2605: ldc2_w 1173148780
    //   2608: l2i
    //   2609: ldc_w 881664342
    //   2612: ixor
    //   2613: ldc2_w 1222257243
    //   2616: l2i
    //   2617: ldc_w -1558041158
    //   2620: ixor
    //   2621: ixor
    //   2622: lookupswitch default -> 2648, -1122247313 -> 4026, -122872080 -> 2605
    //   2648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2651: ldc2_w 1538413250
    //   2654: l2i
    //   2655: ldc_w 1538413251
    //   2658: ixor
    //   2659: getstatic Perryc.0 : I
    //   2662: ifle -> 2676
    //   2665: ldc2_w -902982923
    //   2668: l2i
    //   2669: ldc_w -345508981
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -161355148
    //   2679: l2i
    //   2680: ldc_w 197757551
    //   2683: ixor
    //   2684: ldc2_w -1012669937
    //   2687: l2i
    //   2688: ldc_w 118510673
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 4064, -436611296 -> 2676, 958125637 -> 2720
    //   2720: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2723: getstatic Perryc.c : I
    //   2726: iflt -> 2740
    //   2729: ldc2_w 1592973774
    //   2732: l2i
    //   2733: ldc_w 1636715681
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w -1855654904
    //   2743: l2i
    //   2744: ldc_w -499855806
    //   2747: ixor
    //   2748: ldc2_w 1658017594
    //   2751: l2i
    //   2752: ldc_w 90961781
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 4124, 350788101 -> 2784, 1489253664 -> 2740
    //   2784: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2787: getstatic Perryc.1 : I
    //   2790: ifeq -> 2804
    //   2793: ldc2_w -1663221105
    //   2796: l2i
    //   2797: ldc_w 92318134
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w 165747647
    //   2807: l2i
    //   2808: ldc_w -1721736896
    //   2811: ixor
    //   2812: ldc2_w -2115357356
    //   2815: l2i
    //   2816: ldc_w -1376848408
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 4054, -1252447355 -> 2804, -1132086717 -> 2848
    //   2848: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2851: getstatic Perryc.1 : I
    //   2854: ifeq -> 2868
    //   2857: ldc2_w 1488765749
    //   2860: l2i
    //   2861: ldc_w -292144903
    //   2864: ixor
    //   2865: goto -> 2876
    //   2868: ldc2_w -1811983116
    //   2871: l2i
    //   2872: ldc_w 406055491
    //   2875: ixor
    //   2876: ldc2_w 611859268
    //   2879: l2i
    //   2880: ldc_w -139672086
    //   2883: ixor
    //   2884: ixor
    //   2885: lookupswitch default -> 4102, 1477984281 -> 2912, 1711146338 -> 2868
    //   2912: putfield antiScaffold : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2915: getstatic Perryc.0 : I
    //   2918: ifle -> 2932
    //   2921: ldc2_w 399059692
    //   2924: l2i
    //   2925: ldc_w -1304455324
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w 487452947
    //   2935: l2i
    //   2936: ldc_w -412118577
    //   2939: ixor
    //   2940: ldc2_w 409373209
    //   2943: l2i
    //   2944: ldc_w 935592483
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 4112, -1974192718 -> 2932, -708777754 -> 2976
    //   2976: aload_0
    //   2977: new bigname/zprestige/webhack/util/Timer
    //   2980: dup
    //   2981: getstatic Perryc.0 : I
    //   2984: ifle -> 2998
    //   2987: ldc2_w 1860686206
    //   2990: l2i
    //   2991: ldc_w 1688798601
    //   2994: ixor
    //   2995: goto -> 3006
    //   2998: ldc2_w -558221492
    //   3001: l2i
    //   3002: ldc_w -485981709
    //   3005: ixor
    //   3006: ldc2_w 1341489869
    //   3009: l2i
    //   3010: ldc_w 484405469
    //   3013: ixor
    //   3014: ixor
    //   3015: lookupswitch default -> 4098, 1499735783 -> 2998, 1855472815 -> 3040
    //   3040: invokespecial <init> : ()V
    //   3043: getstatic Perryc.1 : I
    //   3046: ifeq -> 3060
    //   3049: ldc2_w 17194787
    //   3052: l2i
    //   3053: ldc_w -1602098977
    //   3056: ixor
    //   3057: goto -> 3068
    //   3060: ldc2_w 1951255805
    //   3063: l2i
    //   3064: ldc_w 1037809322
    //   3067: ixor
    //   3068: ldc2_w -1948136889
    //   3071: l2i
    //   3072: ldc_w 889858056
    //   3075: ixor
    //   3076: ixor
    //   3077: lookupswitch default -> 3104, 527193523 -> 4104, 1593386811 -> 3060
    //   3104: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   3107: getstatic Perryc.1 : I
    //   3110: ifeq -> 3124
    //   3113: ldc2_w 1028924186
    //   3116: l2i
    //   3117: ldc_w -423849232
    //   3120: ixor
    //   3121: goto -> 3132
    //   3124: ldc2_w -623489519
    //   3127: l2i
    //   3128: ldc_w -1552395268
    //   3131: ixor
    //   3132: ldc2_w 1231190987
    //   3135: l2i
    //   3136: ldc_w -136030599
    //   3139: ixor
    //   3140: ixor
    //   3141: lookupswitch default -> 4118, -953667489 -> 3168, 1701747800 -> 3124
    //   3168: aload_0
    //   3169: new java/util/HashMap
    //   3172: dup
    //   3173: getstatic Perryc.0 : I
    //   3176: ifle -> 3190
    //   3179: ldc2_w -1226347225
    //   3182: l2i
    //   3183: ldc_w -161880978
    //   3186: ixor
    //   3187: goto -> 3198
    //   3190: ldc2_w -394032587
    //   3193: l2i
    //   3194: ldc_w -325022625
    //   3197: ixor
    //   3198: ldc2_w -887014509
    //   3201: l2i
    //   3202: ldc_w -1266319478
    //   3205: ixor
    //   3206: ixor
    //   3207: lookupswitch default -> 3232, 1058721104 -> 4136, 1850625747 -> 3190
    //   3232: invokespecial <init> : ()V
    //   3235: getstatic Perryc.c : I
    //   3238: iflt -> 3252
    //   3241: ldc2_w -1588858696
    //   3244: l2i
    //   3245: ldc_w 65857555
    //   3248: ixor
    //   3249: goto -> 3260
    //   3252: ldc2_w -737592929
    //   3255: l2i
    //   3256: ldc_w -1701492256
    //   3259: ixor
    //   3260: ldc2_w -1184929035
    //   3263: l2i
    //   3264: ldc_w -36521843
    //   3267: ixor
    //   3268: ixor
    //   3269: lookupswitch default -> 3296, -433403181 -> 4032, 1205017705 -> 3252
    //   3296: putfield retries : Ljava/util/Map;
    //   3299: getstatic Perryc.c : I
    //   3302: iflt -> 3316
    //   3305: ldc2_w 1218444572
    //   3308: l2i
    //   3309: ldc_w 681960252
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w -1976162415
    //   3319: l2i
    //   3320: ldc_w -1714886557
    //   3323: ixor
    //   3324: ldc2_w -1500061954
    //   3327: l2i
    //   3328: ldc_w -2115187528
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, -327984048 -> 3316, 1195379814 -> 4040
    //   3360: aload_0
    //   3361: new bigname/zprestige/webhack/util/Timer
    //   3364: dup
    //   3365: getstatic Perryc.0 : I
    //   3368: ifle -> 3382
    //   3371: ldc2_w 1169092699
    //   3374: l2i
    //   3375: ldc_w -1348373981
    //   3378: ixor
    //   3379: goto -> 3390
    //   3382: ldc2_w -1436860862
    //   3385: l2i
    //   3386: ldc_w 762078403
    //   3389: ixor
    //   3390: ldc2_w 1708814154
    //   3393: l2i
    //   3394: ldc_w -1260802215
    //   3397: ixor
    //   3398: ixor
    //   3399: lookupswitch default -> 4042, 990659179 -> 3382, 1446288018 -> 3424
    //   3424: invokespecial <init> : ()V
    //   3427: getstatic Perryc.0 : I
    //   3430: ifle -> 3444
    //   3433: ldc2_w 1801352707
    //   3436: l2i
    //   3437: ldc_w 436280028
    //   3440: ixor
    //   3441: goto -> 3452
    //   3444: ldc2_w 106194892
    //   3447: l2i
    //   3448: ldc_w 1275428854
    //   3451: ixor
    //   3452: ldc2_w 1715976215
    //   3455: l2i
    //   3456: ldc_w -1619058820
    //   3459: ixor
    //   3460: ixor
    //   3461: lookupswitch default -> 3488, -2006463564 -> 4086, 900842146 -> 3444
    //   3488: putfield retryTimer : Lbigname/zprestige/webhack/util/Timer;
    //   3491: getstatic Perryc.0 : I
    //   3494: ifle -> 3508
    //   3497: ldc2_w -1829886773
    //   3500: l2i
    //   3501: ldc_w 416883877
    //   3504: ixor
    //   3505: goto -> 3516
    //   3508: ldc2_w -856326765
    //   3511: l2i
    //   3512: ldc_w -1202304028
    //   3515: ixor
    //   3516: ldc2_w 1976862584
    //   3519: l2i
    //   3520: ldc_w -119908020
    //   3523: ixor
    //   3524: ixor
    //   3525: lookupswitch default -> 3552, 121232986 -> 4078, 823827870 -> 3508
    //   3552: aload_0
    //   3553: ldc2_w 422433091
    //   3556: l2i
    //   3557: ldc_w 422433091
    //   3560: ixor
    //   3561: getstatic Perryc.1 : I
    //   3564: ifeq -> 3578
    //   3567: ldc2_w 864340460
    //   3570: l2i
    //   3571: ldc_w -1615602315
    //   3574: ixor
    //   3575: goto -> 3586
    //   3578: ldc2_w 2130760209
    //   3581: l2i
    //   3582: ldc_w 98678527
    //   3585: ixor
    //   3586: ldc2_w 410035922
    //   3589: l2i
    //   3590: ldc_w 155263587
    //   3593: ixor
    //   3594: ixor
    //   3595: lookupswitch default -> 3620, -1123643352 -> 4036, 2140962242 -> 3578
    //   3620: putfield didPlace : Z
    //   3623: getstatic Perryc.1 : I
    //   3626: ifeq -> 3640
    //   3629: ldc2_w 517814795
    //   3632: l2i
    //   3633: ldc_w -1910367435
    //   3636: ixor
    //   3637: goto -> 3648
    //   3640: ldc2_w 51224324
    //   3643: l2i
    //   3644: ldc_w -242118795
    //   3647: ixor
    //   3648: ldc2_w 1060135070
    //   3651: l2i
    //   3652: ldc_w -1027778021
    //   3655: ixor
    //   3656: ixor
    //   3657: lookupswitch default -> 3684, -635230142 -> 3640, 1836194747 -> 4074
    //   3684: aload_0
    //   3685: ldc2_w 1371378270
    //   3688: l2i
    //   3689: ldc_w 1371378270
    //   3692: ixor
    //   3693: getstatic Perryc.1 : I
    //   3696: ifeq -> 3710
    //   3699: ldc2_w -1467957219
    //   3702: l2i
    //   3703: ldc_w 211223583
    //   3706: ixor
    //   3707: goto -> 3718
    //   3710: ldc2_w -2132697121
    //   3713: l2i
    //   3714: ldc_w -1758880113
    //   3717: ixor
    //   3718: ldc2_w 118924622
    //   3721: l2i
    //   3722: ldc_w -1238128998
    //   3725: ixor
    //   3726: ixor
    //   3727: lookupswitch default -> 3752, -1479251496 -> 3710, 355649494 -> 4016
    //   3752: putfield placements : I
    //   3755: getstatic Perryc.c : I
    //   3758: iflt -> 3772
    //   3761: ldc2_w -844867751
    //   3764: l2i
    //   3765: ldc_w -1295194139
    //   3768: ixor
    //   3769: goto -> 3780
    //   3772: ldc2_w -1490158744
    //   3775: l2i
    //   3776: ldc_w 317118892
    //   3779: ixor
    //   3780: ldc2_w -1788459895
    //   3783: l2i
    //   3784: ldc_w 1995399906
    //   3787: ixor
    //   3788: ixor
    //   3789: lookupswitch default -> 3816, -1662937385 -> 4080, -876036943 -> 3772
    //   3816: aload_0
    //   3817: ldc2_w -1613562285
    //   3820: l2i
    //   3821: ldc_w -1613562285
    //   3824: ixor
    //   3825: getstatic Perryc.1 : I
    //   3828: ifeq -> 3842
    //   3831: ldc2_w 1245327590
    //   3834: l2i
    //   3835: ldc_w 2071836742
    //   3838: ixor
    //   3839: goto -> 3850
    //   3842: ldc2_w -1898386426
    //   3845: l2i
    //   3846: ldc_w -837196144
    //   3849: ixor
    //   3850: ldc2_w 975135267
    //   3853: l2i
    //   3854: ldc_w -2040919064
    //   3857: ixor
    //   3858: ixor
    //   3859: lookupswitch default -> 4070, -1929191061 -> 3842, -58399907 -> 3884
    //   3884: putfield smartRotate : Z
    //   3887: getstatic Perryc.1 : I
    //   3890: ifeq -> 3904
    //   3893: ldc2_w -937074747
    //   3896: l2i
    //   3897: ldc_w 172378984
    //   3900: ixor
    //   3901: goto -> 3912
    //   3904: ldc2_w -1500037036
    //   3907: l2i
    //   3908: ldc_w -1014037885
    //   3911: ixor
    //   3912: ldc2_w 1080955946
    //   3915: l2i
    //   3916: ldc_w -1095599350
    //   3919: ixor
    //   3920: ixor
    //   3921: lookupswitch default -> 3948, -638025777 -> 3904, 1019181965 -> 4018
    //   3948: aload_0
    //   3949: aconst_null
    //   3950: getstatic Perryc.0 : I
    //   3953: ifle -> 3967
    //   3956: ldc2_w -105076684
    //   3959: l2i
    //   3960: ldc_w 1046262364
    //   3963: ixor
    //   3964: goto -> 3975
    //   3967: ldc2_w -1911470086
    //   3970: l2i
    //   3971: ldc_w 774923244
    //   3974: ixor
    //   3975: ldc2_w 411189646
    //   3978: l2i
    //   3979: ldc_w -1552478620
    //   3982: ixor
    //   3983: ixor
    //   3984: lookupswitch default -> 4130, 466906108 -> 4012, 2081772930 -> 3967
    //   4012: putfield startPos : Lnet/minecraft/util/math/BlockPos;
    //   4015: return
    //   4016: aconst_null
    //   4017: athrow
    //   4018: aconst_null
    //   4019: athrow
    //   4020: aconst_null
    //   4021: athrow
    //   4022: aconst_null
    //   4023: athrow
    //   4024: aconst_null
    //   4025: athrow
    //   4026: aconst_null
    //   4027: athrow
    //   4028: aconst_null
    //   4029: athrow
    //   4030: aconst_null
    //   4031: athrow
    //   4032: aconst_null
    //   4033: athrow
    //   4034: aconst_null
    //   4035: athrow
    //   4036: aconst_null
    //   4037: athrow
    //   4038: aconst_null
    //   4039: athrow
    //   4040: aconst_null
    //   4041: athrow
    //   4042: aconst_null
    //   4043: athrow
    //   4044: aconst_null
    //   4045: athrow
    //   4046: aconst_null
    //   4047: athrow
    //   4048: aconst_null
    //   4049: athrow
    //   4050: aconst_null
    //   4051: athrow
    //   4052: aconst_null
    //   4053: athrow
    //   4054: aconst_null
    //   4055: athrow
    //   4056: aconst_null
    //   4057: athrow
    //   4058: aconst_null
    //   4059: athrow
    //   4060: aconst_null
    //   4061: athrow
    //   4062: aconst_null
    //   4063: athrow
    //   4064: aconst_null
    //   4065: athrow
    //   4066: aconst_null
    //   4067: athrow
    //   4068: aconst_null
    //   4069: athrow
    //   4070: aconst_null
    //   4071: athrow
    //   4072: aconst_null
    //   4073: athrow
    //   4074: aconst_null
    //   4075: athrow
    //   4076: aconst_null
    //   4077: athrow
    //   4078: aconst_null
    //   4079: athrow
    //   4080: aconst_null
    //   4081: athrow
    //   4082: aconst_null
    //   4083: athrow
    //   4084: aconst_null
    //   4085: athrow
    //   4086: aconst_null
    //   4087: athrow
    //   4088: aconst_null
    //   4089: athrow
    //   4090: aconst_null
    //   4091: athrow
    //   4092: aconst_null
    //   4093: athrow
    //   4094: aconst_null
    //   4095: athrow
    //   4096: aconst_null
    //   4097: athrow
    //   4098: aconst_null
    //   4099: athrow
    //   4100: aconst_null
    //   4101: athrow
    //   4102: aconst_null
    //   4103: athrow
    //   4104: aconst_null
    //   4105: athrow
    //   4106: aconst_null
    //   4107: athrow
    //   4108: aconst_null
    //   4109: athrow
    //   4110: aconst_null
    //   4111: athrow
    //   4112: aconst_null
    //   4113: athrow
    //   4114: aconst_null
    //   4115: athrow
    //   4116: aconst_null
    //   4117: athrow
    //   4118: aconst_null
    //   4119: athrow
    //   4120: aconst_null
    //   4121: athrow
    //   4122: aconst_null
    //   4123: athrow
    //   4124: aconst_null
    //   4125: athrow
    //   4126: aconst_null
    //   4127: athrow
    //   4128: aconst_null
    //   4129: athrow
    //   4130: aconst_null
    //   4131: athrow
    //   4132: aconst_null
    //   4133: athrow
    //   4134: aconst_null
    //   4135: athrow
    //   4136: aconst_null
    //   4137: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	4016	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoTrap;
  }
  
  public void onDisable() {
    Perry1.3x(this, (int)1584496197L ^ 0x3DD15B24);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\AutoTrap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */