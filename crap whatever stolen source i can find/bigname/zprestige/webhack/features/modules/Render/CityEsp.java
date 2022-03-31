package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class CityEsp extends Module {
  public Setting<Integer> blue;
  
  public Setting<Integer> alpha;
  
  public Setting<Integer> red;
  
  public List<BlockPos> cityBlocks;
  
  public Setting<Integer> green;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Integer> range;
  
  public Setting<Float> lineWidth;
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3752
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 3744
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3736
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w 583584429
    //   33: l2i
    //   34: ldc 1562922430
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 905607166
    //   43: l2i
    //   44: ldc 2040711098
    //   46: ixor
    //   47: ldc2_w -427242420
    //   50: l2i
    //   51: ldc 604609112
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 3637, -1898322352 -> 80, -1117662969 -> 40
    //   80: aload_1
    //   81: ifnull -> 94
    //   84: ldc2_w -46388937
    //   87: l2i
    //   88: ldc 207925478
    //   90: ixor
    //   91: goto -> 101
    //   94: ldc2_w -479630004
    //   97: l2i
    //   98: ldc 305263772
    //   100: ixor
    //   101: ldc2_w 608392764
    //   104: l2i
    //   105: ldc 1468898063
    //   107: ixor
    //   108: ixor
    //   109: tableswitch default -> 84, -2104077086 -> 132, -2104077085 -> 468
    //   132: getstatic Perryc.c : I
    //   135: iflt -> 148
    //   138: ldc2_w 11316722
    //   141: l2i
    //   142: ldc -1321757332
    //   144: ixor
    //   145: goto -> 155
    //   148: ldc2_w 784223100
    //   151: l2i
    //   152: ldc -148981855
    //   154: ixor
    //   155: ldc2_w -1548154181
    //   158: l2i
    //   159: ldc -1892961306
    //   161: ixor
    //   162: ixor
    //   163: lookupswitch default -> 188, -1660321341 -> 3675, 157510416 -> 148
    //   188: getstatic bigname/zprestige/webhack/features/modules/Render/CityEsp.mc : Lnet/minecraft/client/Minecraft;
    //   191: getstatic Perryc.0 : I
    //   194: ifle -> 207
    //   197: ldc2_w -1238250938
    //   200: l2i
    //   201: ldc -1057526024
    //   203: ixor
    //   204: goto -> 214
    //   207: ldc2_w -537972555
    //   210: l2i
    //   211: ldc 943701539
    //   213: ixor
    //   214: ldc2_w -343928002
    //   217: l2i
    //   218: ldc 624961732
    //   220: ixor
    //   221: ixor
    //   222: lookupswitch default -> 248, -1207525564 -> 3671, 1813989209 -> 207
    //   248: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   251: ifnull -> 264
    //   254: ldc2_w 2090420273
    //   257: l2i
    //   258: ldc 895345567
    //   260: ixor
    //   261: goto -> 271
    //   264: ldc2_w -113988548
    //   267: l2i
    //   268: ldc -1326446701
    //   270: ixor
    //   271: ldc2_w 1945384715
    //   274: l2i
    //   275: ldc -1880403993
    //   277: ixor
    //   278: ixor
    //   279: tableswitch default -> 254, -1243884734 -> 300, -1243884733 -> 468
    //   300: getstatic Perryc.0 : I
    //   303: ifle -> 316
    //   306: ldc2_w 320968383
    //   309: l2i
    //   310: ldc -416599699
    //   312: ixor
    //   313: goto -> 323
    //   316: ldc2_w -742031017
    //   319: l2i
    //   320: ldc -473902087
    //   322: ixor
    //   323: ldc2_w -1039383494
    //   326: l2i
    //   327: ldc 144131610
    //   329: ixor
    //   330: ixor
    //   331: lookupswitch default -> 356, 1049732594 -> 3717, 1708362671 -> 316
    //   356: getstatic bigname/zprestige/webhack/features/modules/Render/CityEsp.mc : Lnet/minecraft/client/Minecraft;
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w -1415493531
    //   368: l2i
    //   369: ldc 1694926991
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w 1174797167
    //   378: l2i
    //   379: ldc -468672689
    //   381: ixor
    //   382: ldc2_w 1689905391
    //   385: l2i
    //   386: ldc 1771821234
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 3723, -1355328387 -> 416, -1014632265 -> 375
    //   416: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   419: ifnonnull -> 432
    //   422: ldc2_w -1120204135
    //   425: l2i
    //   426: ldc 1505240634
    //   428: ixor
    //   429: goto -> 439
    //   432: ldc2_w -1668123918
    //   435: l2i
    //   436: ldc 2014404176
    //   438: ixor
    //   439: ldc2_w -253851428
    //   442: l2i
    //   443: ldc 1093727767
    //   445: ixor
    //   446: ixor
    //   447: tableswitch default -> 422, 1433227880 -> 468, 1433227881 -> 469
    //   468: return
    //   469: getstatic Perryc.0 : I
    //   472: ifle -> 485
    //   475: ldc2_w -1807469353
    //   478: l2i
    //   479: ldc -1257978462
    //   481: ixor
    //   482: goto -> 492
    //   485: ldc2_w 1680911221
    //   488: l2i
    //   489: ldc -60666601
    //   491: ixor
    //   492: ldc2_w 1520937147
    //   495: l2i
    //   496: ldc -1321507801
    //   498: ixor
    //   499: ixor
    //   500: lookupswitch default -> 3633, -891535895 -> 485, 1942891262 -> 528
    //   528: aload_0
    //   529: getstatic Perryc.1 : I
    //   532: ifeq -> 545
    //   535: ldc2_w 1357345869
    //   538: l2i
    //   539: ldc -1879111149
    //   541: ixor
    //   542: goto -> 552
    //   545: ldc2_w -973782280
    //   548: l2i
    //   549: ldc 818506666
    //   551: ixor
    //   552: ldc2_w 1862050721
    //   555: l2i
    //   556: ldc -1487212326
    //   558: ixor
    //   559: ixor
    //   560: lookupswitch default -> 3651, 381562149 -> 545, 1016756777 -> 588
    //   588: getfield cityBlocks : Ljava/util/List;
    //   591: getstatic Perryc.0 : I
    //   594: ifle -> 607
    //   597: ldc2_w 961004562
    //   600: l2i
    //   601: ldc -388589938
    //   603: ixor
    //   604: goto -> 614
    //   607: ldc2_w 1603677148
    //   610: l2i
    //   611: ldc 1087351092
    //   613: ixor
    //   614: ldc2_w 1201296787
    //   617: l2i
    //   618: ldc 1966009821
    //   620: ixor
    //   621: ixor
    //   622: lookupswitch default -> 3663, -484054318 -> 607, 770521766 -> 648
    //   648: goto -> 652
    //   651: athrow
    //   652: invokeinterface clear : ()V
    //   657: goto -> 661
    //   660: athrow
    //   661: ldc2_w 1.6968781659503234
    //   664: invokestatic doubleToLongBits : (D)J
    //   667: ldc2_w 9209621998500632959
    //   670: lxor
    //   671: invokestatic longBitsToDouble : (J)D
    //   674: getstatic Perryc.c : I
    //   677: iflt -> 690
    //   680: ldc2_w 205993093
    //   683: l2i
    //   684: ldc -1092984241
    //   686: ixor
    //   687: goto -> 697
    //   690: ldc2_w 1131347291
    //   693: l2i
    //   694: ldc 17900447
    //   696: ixor
    //   697: ldc2_w 42130505
    //   700: l2i
    //   701: ldc -1219876075
    //   703: ixor
    //   704: ixor
    //   705: lookupswitch default -> 3679, -138991208 -> 732, 123052438 -> 690
    //   732: goto -> 736
    //   735: athrow
    //   736: invokestatic getNearbyPlayers : (D)Ljava/util/List;
    //   739: goto -> 743
    //   742: athrow
    //   743: getstatic Perryc.1 : I
    //   746: ifeq -> 759
    //   749: ldc2_w 263277823
    //   752: l2i
    //   753: ldc 1170667680
    //   755: ixor
    //   756: goto -> 766
    //   759: ldc2_w 1003759005
    //   762: l2i
    //   763: ldc 1606016723
    //   765: ixor
    //   766: ldc2_w -555328489
    //   769: l2i
    //   770: ldc -1994941275
    //   772: ixor
    //   773: ixor
    //   774: lookupswitch default -> 800, 495351021 -> 3721, 1143169207 -> 759
    //   800: aload_0
    //   801: <illegal opcode> accept : (Lbigname/zprestige/webhack/features/modules/Render/CityEsp;)Ljava/util/function/Consumer;
    //   806: getstatic Perryc.0 : I
    //   809: ifle -> 822
    //   812: ldc2_w -331995168
    //   815: l2i
    //   816: ldc -672163208
    //   818: ixor
    //   819: goto -> 829
    //   822: ldc2_w 133770091
    //   825: l2i
    //   826: ldc 414605461
    //   828: ixor
    //   829: ldc2_w 1250442012
    //   832: l2i
    //   833: ldc -167790937
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 3681, -2068959197 -> 822, -1606891963 -> 864
    //   864: goto -> 868
    //   867: athrow
    //   868: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   873: goto -> 877
    //   876: athrow
    //   877: getstatic Perryc.1 : I
    //   880: ifeq -> 894
    //   883: ldc2_w -350151093
    //   886: l2i
    //   887: ldc_w -1502077723
    //   890: ixor
    //   891: goto -> 902
    //   894: ldc2_w -2049418468
    //   897: l2i
    //   898: ldc_w 649688807
    //   901: ixor
    //   902: ldc2_w -630277147
    //   905: l2i
    //   906: ldc_w 158367442
    //   909: ixor
    //   910: ixor
    //   911: lookupswitch default -> 3657, -1639463015 -> 894, 1887430860 -> 936
    //   936: aload_0
    //   937: getstatic Perryc.0 : I
    //   940: ifle -> 954
    //   943: ldc2_w 261827450
    //   946: l2i
    //   947: ldc_w -316122988
    //   950: ixor
    //   951: goto -> 962
    //   954: ldc2_w 1687685909
    //   957: l2i
    //   958: ldc_w -1394757232
    //   961: ixor
    //   962: ldc2_w -1788718067
    //   965: l2i
    //   966: ldc_w 1600802722
    //   969: ixor
    //   970: ixor
    //   971: lookupswitch default -> 3683, 38641962 -> 996, 683370561 -> 954
    //   996: getfield cityBlocks : Ljava/util/List;
    //   999: getstatic Perryc.c : I
    //   1002: iflt -> 1016
    //   1005: ldc2_w 656964003
    //   1008: l2i
    //   1009: ldc_w -74312941
    //   1012: ixor
    //   1013: goto -> 1024
    //   1016: ldc2_w 181315826
    //   1019: l2i
    //   1020: ldc_w -1199176385
    //   1023: ixor
    //   1024: ldc2_w -1763417445
    //   1027: l2i
    //   1028: ldc_w 819868684
    //   1031: ixor
    //   1032: ixor
    //   1033: lookupswitch default -> 3697, 343079770 -> 1060, 2055224359 -> 1016
    //   1060: goto -> 1064
    //   1063: athrow
    //   1064: invokeinterface isEmpty : ()Z
    //   1069: goto -> 1073
    //   1072: athrow
    //   1073: ifeq -> 1087
    //   1076: ldc2_w -148301352
    //   1079: l2i
    //   1080: ldc_w 34812903
    //   1083: ixor
    //   1084: goto -> 1095
    //   1087: ldc2_w 278313008
    //   1090: l2i
    //   1091: ldc_w -441675250
    //   1094: ixor
    //   1095: ldc2_w 809080497
    //   1098: l2i
    //   1099: ldc_w 355751332
    //   1102: ixor
    //   1103: ixor
    //   1104: tableswitch default -> 1076, -801642198 -> 1128, -801642197 -> 1129
    //   1128: return
    //   1129: getstatic Perryc.c : I
    //   1132: iflt -> 1146
    //   1135: ldc2_w -55224138
    //   1138: l2i
    //   1139: ldc_w -956786035
    //   1142: ixor
    //   1143: goto -> 1154
    //   1146: ldc2_w -1034212638
    //   1149: l2i
    //   1150: ldc_w 503847493
    //   1153: ixor
    //   1154: ldc2_w 1088261596
    //   1157: l2i
    //   1158: ldc_w -1019852175
    //   1161: ixor
    //   1162: ixor
    //   1163: lookupswitch default -> 1188, -1180301930 -> 3715, 1933348419 -> 1146
    //   1188: aload_0
    //   1189: getstatic Perryc.0 : I
    //   1192: ifle -> 1206
    //   1195: ldc2_w -513222889
    //   1198: l2i
    //   1199: ldc_w -758574916
    //   1202: ixor
    //   1203: goto -> 1214
    //   1206: ldc2_w 256570538
    //   1209: l2i
    //   1210: ldc_w -1252189613
    //   1213: ixor
    //   1214: ldc2_w -2063459581
    //   1217: l2i
    //   1218: ldc_w 1140427333
    //   1221: ixor
    //   1222: ixor
    //   1223: lookupswitch default -> 3639, -178628883 -> 1206, 2095873983 -> 1248
    //   1248: getfield cityBlocks : Ljava/util/List;
    //   1251: getstatic Perryc.1 : I
    //   1254: ifeq -> 1268
    //   1257: ldc2_w 485306188
    //   1260: l2i
    //   1261: ldc_w 816020659
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 1604412706
    //   1271: l2i
    //   1272: ldc_w -665377244
    //   1275: ixor
    //   1276: ldc2_w 250022319
    //   1279: l2i
    //   1280: ldc_w -1105691848
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 3645, -1666113176 -> 1268, 923349393 -> 1312
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1321: goto -> 1325
    //   1324: athrow
    //   1325: getstatic Perryc.1 : I
    //   1328: ifeq -> 1342
    //   1331: ldc2_w -420914827
    //   1334: l2i
    //   1335: ldc_w -268974345
    //   1338: ixor
    //   1339: goto -> 1350
    //   1342: ldc2_w 709146494
    //   1345: l2i
    //   1346: ldc_w -2067642363
    //   1349: ixor
    //   1350: ldc2_w 378903146
    //   1353: l2i
    //   1354: ldc_w -1763595265
    //   1357: ixor
    //   1358: ixor
    //   1359: lookupswitch default -> 3707, -1989497321 -> 1342, 787664622 -> 1384
    //   1384: astore_2
    //   1385: getstatic Perryc.0 : I
    //   1388: ifle -> 1402
    //   1391: ldc2_w -574562477
    //   1394: l2i
    //   1395: ldc_w -1839794468
    //   1398: ixor
    //   1399: goto -> 1410
    //   1402: ldc2_w -616746743
    //   1405: l2i
    //   1406: ldc_w 1430476253
    //   1409: ixor
    //   1410: ldc2_w 473536704
    //   1413: l2i
    //   1414: ldc_w -1480473373
    //   1417: ixor
    //   1418: ixor
    //   1419: lookupswitch default -> 3649, -194087508 -> 1402, 897988855 -> 1444
    //   1444: aload_2
    //   1445: getstatic Perryc.1 : I
    //   1448: ifeq -> 1462
    //   1451: ldc2_w -1742739540
    //   1454: l2i
    //   1455: ldc_w -1759952803
    //   1458: ixor
    //   1459: goto -> 1470
    //   1462: ldc2_w 1230118532
    //   1465: l2i
    //   1466: ldc_w -103093333
    //   1469: ixor
    //   1470: ldc2_w 1054302492
    //   1473: l2i
    //   1474: ldc_w -550300695
    //   1477: ixor
    //   1478: ixor
    //   1479: lookupswitch default -> 3685, -287124220 -> 1462, 1366067162 -> 1504
    //   1504: goto -> 1508
    //   1507: athrow
    //   1508: invokeinterface hasNext : ()Z
    //   1513: goto -> 1517
    //   1516: athrow
    //   1517: ifeq -> 1531
    //   1520: ldc2_w 1080862420
    //   1523: l2i
    //   1524: ldc_w 1085093019
    //   1527: ixor
    //   1528: goto -> 1539
    //   1531: ldc2_w -1182227886
    //   1534: l2i
    //   1535: ldc_w -1186385894
    //   1538: ixor
    //   1539: ldc2_w 1056907829
    //   1542: l2i
    //   1543: ldc_w 542469081
    //   1546: ixor
    //   1547: ixor
    //   1548: tableswitch default -> 1520, 510385059 -> 1572, 510385060 -> 3626
    //   1572: getstatic Perryc.c : I
    //   1575: iflt -> 1589
    //   1578: ldc2_w -1498341927
    //   1581: l2i
    //   1582: ldc_w -264666849
    //   1585: ixor
    //   1586: goto -> 1597
    //   1589: ldc2_w 1532214136
    //   1592: l2i
    //   1593: ldc_w -1918944488
    //   1596: ixor
    //   1597: ldc2_w -1519340531
    //   1600: l2i
    //   1601: ldc_w -531129814
    //   1604: ixor
    //   1605: ixor
    //   1606: lookupswitch default -> 1632, 330281697 -> 3711, 953273411 -> 1589
    //   1632: aload_2
    //   1633: getstatic Perryc.c : I
    //   1636: iflt -> 1650
    //   1639: ldc2_w 1200892077
    //   1642: l2i
    //   1643: ldc_w -1288719402
    //   1646: ixor
    //   1647: goto -> 1658
    //   1650: ldc2_w 638187250
    //   1653: l2i
    //   1654: ldc_w -1445336019
    //   1657: ixor
    //   1658: ldc2_w -1344196229
    //   1661: l2i
    //   1662: ldc_w 164112419
    //   1665: ixor
    //   1666: ixor
    //   1667: lookupswitch default -> 3677, 704185223 -> 1692, 1385333283 -> 1650
    //   1692: goto -> 1696
    //   1695: athrow
    //   1696: invokeinterface next : ()Ljava/lang/Object;
    //   1701: goto -> 1705
    //   1704: athrow
    //   1705: checkcast net/minecraft/util/math/BlockPos
    //   1708: getstatic Perryc.0 : I
    //   1711: ifle -> 1725
    //   1714: ldc2_w 692276447
    //   1717: l2i
    //   1718: ldc_w -66034975
    //   1721: ixor
    //   1722: goto -> 1733
    //   1725: ldc2_w 326541122
    //   1728: l2i
    //   1729: ldc_w -2115324787
    //   1732: ixor
    //   1733: ldc2_w 1582797661
    //   1736: l2i
    //   1737: ldc_w -952144512
    //   1740: ixor
    //   1741: ixor
    //   1742: lookupswitch default -> 3695, 200594706 -> 1768, 1278988515 -> 1725
    //   1768: astore_3
    //   1769: getstatic Perryc.c : I
    //   1772: iflt -> 1786
    //   1775: ldc2_w -961770701
    //   1778: l2i
    //   1779: ldc_w -1906617112
    //   1782: ixor
    //   1783: goto -> 1794
    //   1786: ldc2_w 916543901
    //   1789: l2i
    //   1790: ldc_w -1007241519
    //   1793: ixor
    //   1794: ldc2_w 435901458
    //   1797: l2i
    //   1798: ldc_w -1513302132
    //   1801: ixor
    //   1802: ixor
    //   1803: lookupswitch default -> 1828, -188720059 -> 3701, -18327601 -> 1786
    //   1828: aload_3
    //   1829: new java/awt/Color
    //   1832: dup
    //   1833: getstatic Perryc.0 : I
    //   1836: ifle -> 1850
    //   1839: ldc2_w -914263151
    //   1842: l2i
    //   1843: ldc_w 193028666
    //   1846: ixor
    //   1847: goto -> 1858
    //   1850: ldc2_w 432467542
    //   1853: l2i
    //   1854: ldc_w 1206734146
    //   1857: ixor
    //   1858: ldc2_w -244847865
    //   1861: l2i
    //   1862: ldc_w -659397013
    //   1865: ixor
    //   1866: ixor
    //   1867: lookupswitch default -> 1892, -338322233 -> 3699, 443128476 -> 1850
    //   1892: aload_0
    //   1893: getstatic Perryc.0 : I
    //   1896: ifle -> 1910
    //   1899: ldc2_w -2045127176
    //   1902: l2i
    //   1903: ldc_w 1160444488
    //   1906: ixor
    //   1907: goto -> 1918
    //   1910: ldc2_w 1347287702
    //   1913: l2i
    //   1914: ldc_w 42335374
    //   1917: ixor
    //   1918: ldc2_w 1644762010
    //   1921: l2i
    //   1922: ldc_w -2034435746
    //   1925: ixor
    //   1926: ixor
    //   1927: lookupswitch default -> 1952, -1190272125 -> 1910, 663143796 -> 3641
    //   1952: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1955: getstatic Perryc.c : I
    //   1958: iflt -> 1972
    //   1961: ldc2_w -32854404
    //   1964: l2i
    //   1965: ldc_w 743931122
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 1290866160
    //   1975: l2i
    //   1976: ldc_w 1094214435
    //   1979: ixor
    //   1980: ldc2_w 731110624
    //   1983: l2i
    //   1984: ldc_w -1320296775
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 3659, -1760072566 -> 2016, 1216598231 -> 1972
    //   2016: goto -> 2020
    //   2019: athrow
    //   2020: invokevirtual getValue : ()Ljava/lang/Object;
    //   2023: goto -> 2027
    //   2026: athrow
    //   2027: checkcast java/lang/Integer
    //   2030: getstatic Perryc.0 : I
    //   2033: ifle -> 2047
    //   2036: ldc2_w -1463239547
    //   2039: l2i
    //   2040: ldc_w 2057496458
    //   2043: ixor
    //   2044: goto -> 2055
    //   2047: ldc2_w 555067042
    //   2050: l2i
    //   2051: ldc_w 870196034
    //   2054: ixor
    //   2055: ldc2_w -1223495974
    //   2058: l2i
    //   2059: ldc_w -1689112776
    //   2062: ixor
    //   2063: ixor
    //   2064: lookupswitch default -> 2092, -30762259 -> 3725, 1319468076 -> 2047
    //   2092: goto -> 2096
    //   2095: athrow
    //   2096: invokevirtual intValue : ()I
    //   2099: goto -> 2103
    //   2102: athrow
    //   2103: getstatic Perryc.1 : I
    //   2106: ifeq -> 2120
    //   2109: ldc2_w 930172957
    //   2112: l2i
    //   2113: ldc_w -2106951904
    //   2116: ixor
    //   2117: goto -> 2128
    //   2120: ldc2_w 347001997
    //   2123: l2i
    //   2124: ldc_w -1809816273
    //   2127: ixor
    //   2128: ldc2_w 1375832215
    //   2131: l2i
    //   2132: ldc_w 181229067
    //   2135: ixor
    //   2136: ixor
    //   2137: lookupswitch default -> 3647, -666734786 -> 2164, -304612959 -> 2120
    //   2164: aload_0
    //   2165: getstatic Perryc.1 : I
    //   2168: ifeq -> 2182
    //   2171: ldc2_w -1725282388
    //   2174: l2i
    //   2175: ldc_w -1887677783
    //   2178: ixor
    //   2179: goto -> 2190
    //   2182: ldc2_w -651148216
    //   2185: l2i
    //   2186: ldc_w 186651603
    //   2189: ixor
    //   2190: ldc2_w -1576498026
    //   2193: l2i
    //   2194: ldc_w -118631166
    //   2197: ixor
    //   2198: ixor
    //   2199: lookupswitch default -> 2224, 1286818961 -> 3629, 1336728448 -> 2182
    //   2224: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2227: getstatic Perryc.1 : I
    //   2230: ifeq -> 2244
    //   2233: ldc2_w 1801661645
    //   2236: l2i
    //   2237: ldc_w -13535026
    //   2240: ixor
    //   2241: goto -> 2252
    //   2244: ldc2_w 1724271143
    //   2247: l2i
    //   2248: ldc_w -1419006992
    //   2251: ixor
    //   2252: ldc2_w 1822661580
    //   2255: l2i
    //   2256: ldc_w -1361459579
    //   2259: ixor
    //   2260: ixor
    //   2261: lookupswitch default -> 2288, -268130796 -> 2244, 1445464394 -> 3665
    //   2288: goto -> 2292
    //   2291: athrow
    //   2292: invokevirtual getValue : ()Ljava/lang/Object;
    //   2295: goto -> 2299
    //   2298: athrow
    //   2299: checkcast java/lang/Integer
    //   2302: getstatic Perryc.c : I
    //   2305: iflt -> 2319
    //   2308: ldc2_w -1472052791
    //   2311: l2i
    //   2312: ldc_w 224070234
    //   2315: ixor
    //   2316: goto -> 2327
    //   2319: ldc2_w 399490440
    //   2322: l2i
    //   2323: ldc_w 1108378398
    //   2326: ixor
    //   2327: ldc2_w -694273096
    //   2330: l2i
    //   2331: ldc_w 1190234514
    //   2334: ixor
    //   2335: ixor
    //   2336: lookupswitch default -> 2364, -357545021 -> 2319, 896989625 -> 3691
    //   2364: goto -> 2368
    //   2367: athrow
    //   2368: invokevirtual intValue : ()I
    //   2371: goto -> 2375
    //   2374: athrow
    //   2375: getstatic Perryc.c : I
    //   2378: iflt -> 2392
    //   2381: ldc2_w 881990982
    //   2384: l2i
    //   2385: ldc_w -1738901982
    //   2388: ixor
    //   2389: goto -> 2400
    //   2392: ldc2_w -946646872
    //   2395: l2i
    //   2396: ldc_w 1386106735
    //   2399: ixor
    //   2400: ldc2_w -2030548468
    //   2403: l2i
    //   2404: ldc_w 65781226
    //   2407: ixor
    //   2408: ixor
    //   2409: lookupswitch default -> 3703, 270460961 -> 2436, 702258306 -> 2392
    //   2436: aload_0
    //   2437: getstatic Perryc.1 : I
    //   2440: ifeq -> 2454
    //   2443: ldc2_w 720339648
    //   2446: l2i
    //   2447: ldc_w 1063650667
    //   2450: ixor
    //   2451: goto -> 2462
    //   2454: ldc2_w -2108403750
    //   2457: l2i
    //   2458: ldc_w -1425324620
    //   2461: ixor
    //   2462: ldc2_w 1565341226
    //   2465: l2i
    //   2466: ldc_w -325250399
    //   2469: ixor
    //   2470: ixor
    //   2471: lookupswitch default -> 2496, -1537629408 -> 3719, 648454272 -> 2454
    //   2496: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2499: getstatic Perryc.1 : I
    //   2502: ifeq -> 2516
    //   2505: ldc2_w 194221544
    //   2508: l2i
    //   2509: ldc_w 1911053043
    //   2512: ixor
    //   2513: goto -> 2524
    //   2516: ldc2_w -887360497
    //   2519: l2i
    //   2520: ldc_w 1455877696
    //   2523: ixor
    //   2524: ldc2_w -684734387
    //   2527: l2i
    //   2528: ldc_w -1473846408
    //   2531: ixor
    //   2532: ixor
    //   2533: lookupswitch default -> 3673, -489410182 -> 2560, 91415598 -> 2516
    //   2560: goto -> 2564
    //   2563: athrow
    //   2564: invokevirtual getValue : ()Ljava/lang/Object;
    //   2567: goto -> 2571
    //   2570: athrow
    //   2571: checkcast java/lang/Integer
    //   2574: getstatic Perryc.0 : I
    //   2577: ifle -> 2591
    //   2580: ldc2_w 332349392
    //   2583: l2i
    //   2584: ldc_w 458730160
    //   2587: ixor
    //   2588: goto -> 2599
    //   2591: ldc2_w 439076079
    //   2594: l2i
    //   2595: ldc_w 1010644491
    //   2598: ixor
    //   2599: ldc2_w 1087349280
    //   2602: l2i
    //   2603: ldc_w 932866168
    //   2606: ixor
    //   2607: ixor
    //   2608: lookupswitch default -> 3653, 1363359932 -> 2636, 2144165688 -> 2591
    //   2636: goto -> 2640
    //   2639: athrow
    //   2640: invokevirtual intValue : ()I
    //   2643: goto -> 2647
    //   2646: athrow
    //   2647: getstatic Perryc.0 : I
    //   2650: ifle -> 2664
    //   2653: ldc2_w -1139329949
    //   2656: l2i
    //   2657: ldc_w 217392334
    //   2660: ixor
    //   2661: goto -> 2672
    //   2664: ldc2_w -2067679922
    //   2667: l2i
    //   2668: ldc_w -1995204444
    //   2671: ixor
    //   2672: ldc2_w -1835143409
    //   2675: l2i
    //   2676: ldc_w -1934554161
    //   2679: ixor
    //   2680: ixor
    //   2681: lookupswitch default -> 3705, -1362168723 -> 2664, 335464746 -> 2708
    //   2708: aload_0
    //   2709: getstatic Perryc.1 : I
    //   2712: ifeq -> 2726
    //   2715: ldc2_w 565877993
    //   2718: l2i
    //   2719: ldc_w -449962419
    //   2722: ixor
    //   2723: goto -> 2734
    //   2726: ldc2_w 300177882
    //   2729: l2i
    //   2730: ldc_w -571007173
    //   2733: ixor
    //   2734: ldc2_w -813525372
    //   2737: l2i
    //   2738: ldc_w -1986455089
    //   2741: ixor
    //   2742: ixor
    //   2743: lookupswitch default -> 3655, -2104554001 -> 2726, -1979135574 -> 2768
    //   2768: getfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2771: getstatic Perryc.0 : I
    //   2774: ifle -> 2788
    //   2777: ldc2_w 1152486425
    //   2780: l2i
    //   2781: ldc_w -1300594048
    //   2784: ixor
    //   2785: goto -> 2796
    //   2788: ldc2_w 834253334
    //   2791: l2i
    //   2792: ldc_w 293438005
    //   2795: ixor
    //   2796: ldc2_w 809344283
    //   2799: l2i
    //   2800: ldc_w -134251287
    //   2803: ixor
    //   2804: ixor
    //   2805: lookupswitch default -> 2832, -1615059151 -> 2788, 822734699 -> 3709
    //   2832: goto -> 2836
    //   2835: athrow
    //   2836: invokevirtual getValue : ()Ljava/lang/Object;
    //   2839: goto -> 2843
    //   2842: athrow
    //   2843: checkcast java/lang/Integer
    //   2846: getstatic Perryc.c : I
    //   2849: iflt -> 2863
    //   2852: ldc2_w 1885707142
    //   2855: l2i
    //   2856: ldc_w -1563822369
    //   2859: ixor
    //   2860: goto -> 2871
    //   2863: ldc2_w -110832987
    //   2866: l2i
    //   2867: ldc_w 575819678
    //   2870: ixor
    //   2871: ldc2_w -974379637
    //   2874: l2i
    //   2875: ldc_w -1544416290
    //   2878: ixor
    //   2879: ixor
    //   2880: lookupswitch default -> 3631, -1263379700 -> 2863, -1121408146 -> 2908
    //   2908: goto -> 2912
    //   2911: athrow
    //   2912: invokevirtual intValue : ()I
    //   2915: goto -> 2919
    //   2918: athrow
    //   2919: getstatic Perryc.1 : I
    //   2922: ifeq -> 2936
    //   2925: ldc2_w 1487960906
    //   2928: l2i
    //   2929: ldc_w -1734321740
    //   2932: ixor
    //   2933: goto -> 2944
    //   2936: ldc2_w -1103605809
    //   2939: l2i
    //   2940: ldc_w 63896217
    //   2943: ixor
    //   2944: ldc2_w -54291706
    //   2947: l2i
    //   2948: ldc_w -971034811
    //   2951: ixor
    //   2952: ixor
    //   2953: lookupswitch default -> 3689, -2027288299 -> 2980, -87253315 -> 2936
    //   2980: goto -> 2984
    //   2983: athrow
    //   2984: invokespecial <init> : (IIII)V
    //   2987: goto -> 2991
    //   2990: athrow
    //   2991: getstatic Perryc.1 : I
    //   2994: ifeq -> 3008
    //   2997: ldc2_w -1141484256
    //   3000: l2i
    //   3001: ldc_w 1029931398
    //   3004: ixor
    //   3005: goto -> 3016
    //   3008: ldc2_w -809325778
    //   3011: l2i
    //   3012: ldc_w -1587650358
    //   3015: ixor
    //   3016: ldc2_w -1026135793
    //   3019: l2i
    //   3020: ldc_w 741019710
    //   3023: ixor
    //   3024: ixor
    //   3025: lookupswitch default -> 3052, -1447611215 -> 3008, 1751690647 -> 3693
    //   3052: aload_0
    //   3053: getstatic Perryc.1 : I
    //   3056: ifeq -> 3070
    //   3059: ldc2_w -966276752
    //   3062: l2i
    //   3063: ldc_w 929107748
    //   3066: ixor
    //   3067: goto -> 3078
    //   3070: ldc2_w -53973586
    //   3073: l2i
    //   3074: ldc_w 245597333
    //   3077: ixor
    //   3078: ldc2_w 862949351
    //   3081: l2i
    //   3082: ldc_w 540747028
    //   3085: ixor
    //   3086: ixor
    //   3087: lookupswitch default -> 3635, -515947576 -> 3112, -497914713 -> 3070
    //   3112: getfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3115: getstatic Perryc.0 : I
    //   3118: ifle -> 3132
    //   3121: ldc2_w 1835428940
    //   3124: l2i
    //   3125: ldc_w -374587035
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w 319691035
    //   3135: l2i
    //   3136: ldc_w 756796756
    //   3139: ixor
    //   3140: ldc2_w 1929177751
    //   3143: l2i
    //   3144: ldc_w -1957193629
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 3667, -943806789 -> 3176, 2103533533 -> 3132
    //   3176: goto -> 3180
    //   3179: athrow
    //   3180: invokevirtual getValue : ()Ljava/lang/Object;
    //   3183: goto -> 3187
    //   3186: athrow
    //   3187: checkcast java/lang/Float
    //   3190: getstatic Perryc.0 : I
    //   3193: ifle -> 3207
    //   3196: ldc2_w 1224783123
    //   3199: l2i
    //   3200: ldc_w 648631395
    //   3203: ixor
    //   3204: goto -> 3215
    //   3207: ldc2_w -2020177170
    //   3210: l2i
    //   3211: ldc_w -1200232173
    //   3214: ixor
    //   3215: ldc2_w 1600352089
    //   3218: l2i
    //   3219: ldc_w -47605294
    //   3222: ixor
    //   3223: ixor
    //   3224: lookupswitch default -> 3643, -1649830538 -> 3252, -840755205 -> 3207
    //   3252: goto -> 3256
    //   3255: athrow
    //   3256: invokevirtual floatValue : ()F
    //   3259: goto -> 3263
    //   3262: athrow
    //   3263: ldc2_w -438229657
    //   3266: l2i
    //   3267: ldc_w -438229658
    //   3270: ixor
    //   3271: ldc2_w 669593473
    //   3274: l2i
    //   3275: ldc_w 669593472
    //   3278: ixor
    //   3279: getstatic Perryc.0 : I
    //   3282: ifle -> 3296
    //   3285: ldc2_w -1036851761
    //   3288: l2i
    //   3289: ldc_w 192046874
    //   3292: ixor
    //   3293: goto -> 3304
    //   3296: ldc2_w -621953757
    //   3299: l2i
    //   3300: ldc_w -1203987911
    //   3303: ixor
    //   3304: ldc2_w -1935265720
    //   3307: l2i
    //   3308: ldc_w 121023458
    //   3311: ixor
    //   3312: ixor
    //   3313: lookupswitch default -> 3340, 175101114 -> 3296, 1120934271 -> 3669
    //   3340: aload_0
    //   3341: getstatic Perryc.1 : I
    //   3344: ifeq -> 3358
    //   3347: ldc2_w 246767427
    //   3350: l2i
    //   3351: ldc_w 265183313
    //   3354: ixor
    //   3355: goto -> 3366
    //   3358: ldc2_w -58526356
    //   3361: l2i
    //   3362: ldc_w 1127521997
    //   3365: ixor
    //   3366: ldc2_w -1773016580
    //   3369: l2i
    //   3370: ldc_w 1879901713
    //   3373: ixor
    //   3374: ixor
    //   3375: lookupswitch default -> 3687, -416820993 -> 3358, 1508541516 -> 3400
    //   3400: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3403: getstatic Perryc.c : I
    //   3406: iflt -> 3420
    //   3409: ldc2_w 1007799530
    //   3412: l2i
    //   3413: ldc_w 1055230046
    //   3416: ixor
    //   3417: goto -> 3428
    //   3420: ldc2_w -1540329677
    //   3423: l2i
    //   3424: ldc_w 762813429
    //   3427: ixor
    //   3428: ldc2_w 515463164
    //   3431: l2i
    //   3432: ldc_w -754851361
    //   3435: ixor
    //   3436: ixor
    //   3437: lookupswitch default -> 3464, -980443292 -> 3420, -817040745 -> 3661
    //   3464: goto -> 3468
    //   3467: athrow
    //   3468: invokevirtual getValue : ()Ljava/lang/Object;
    //   3471: goto -> 3475
    //   3474: athrow
    //   3475: checkcast java/lang/Integer
    //   3478: getstatic Perryc.0 : I
    //   3481: ifle -> 3495
    //   3484: ldc2_w -1517326359
    //   3487: l2i
    //   3488: ldc_w -651338084
    //   3491: ixor
    //   3492: goto -> 3503
    //   3495: ldc2_w 559432945
    //   3498: l2i
    //   3499: ldc_w 1960752676
    //   3502: ixor
    //   3503: ldc2_w -500160428
    //   3506: l2i
    //   3507: ldc_w 249165428
    //   3510: ixor
    //   3511: ixor
    //   3512: lookupswitch default -> 3540, -1874071723 -> 3713, -637472855 -> 3495
    //   3540: goto -> 3544
    //   3543: athrow
    //   3544: invokevirtual intValue : ()I
    //   3547: goto -> 3551
    //   3550: athrow
    //   3551: getstatic Perryc.1 : I
    //   3554: ifeq -> 3568
    //   3557: ldc2_w 1485541736
    //   3560: l2i
    //   3561: ldc_w -926771884
    //   3564: ixor
    //   3565: goto -> 3576
    //   3568: ldc2_w -1911498868
    //   3571: l2i
    //   3572: ldc_w 1425642346
    //   3575: ixor
    //   3576: ldc2_w -2019787133
    //   3579: l2i
    //   3580: ldc_w 1257404552
    //   3583: ixor
    //   3584: ixor
    //   3585: lookupswitch default -> 3627, 394740461 -> 3612, 1562837559 -> 3568
    //   3612: goto -> 3616
    //   3615: athrow
    //   3616: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;FZZI)V
    //   3619: goto -> 3623
    //   3622: athrow
    //   3623: goto -> 1385
    //   3626: return
    //   3627: aconst_null
    //   3628: athrow
    //   3629: aconst_null
    //   3630: athrow
    //   3631: aconst_null
    //   3632: athrow
    //   3633: aconst_null
    //   3634: athrow
    //   3635: aconst_null
    //   3636: athrow
    //   3637: aconst_null
    //   3638: athrow
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
    //   3727: pop
    //   3728: goto -> 24
    //   3731: pop
    //   3732: aconst_null
    //   3733: goto -> 3727
    //   3736: dup
    //   3737: ifnull -> 3727
    //   3740: checkcast java/lang/Throwable
    //   3743: athrow
    //   3744: dup
    //   3745: ifnull -> 3731
    //   3748: checkcast java/lang/Throwable
    //   3751: athrow
    //   3752: aconst_null
    //   3753: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1769	1854	3	cityPos	Lnet/minecraft/util/math/BlockPos;
    //   24	3603	0	this	Lbigname/zprestige/webhack/features/modules/Render/CityEsp;
    //   24	3603	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	3736	finally
    //   651	660	660	finally
    //   651	660	660	java/lang/NullPointerException
    //   651	660	3	java/lang/ClassCastException
    //   651	660	660	finally
    //   652	660	651	finally
    //   736	742	742	finally
    //   736	742	742	java/lang/AssertionError
    //   736	742	742	java/lang/IllegalStateException
    //   736	742	3	java/lang/NumberFormatException
    //   736	742	3	finally
    //   867	876	876	finally
    //   867	876	876	java/lang/NumberFormatException
    //   868	876	3	finally
    //   868	876	867	finally
    //   868	876	3	finally
    //   1064	1072	1072	finally
    //   1064	1072	3	java/lang/NumberFormatException
    //   1064	1072	3	finally
    //   1064	1072	1072	java/lang/NegativeArraySizeException
    //   1064	1072	1072	finally
    //   1315	1324	1324	finally
    //   1315	1324	1324	java/lang/IllegalArgumentException
    //   1315	1324	1324	java/lang/EnumConstantNotPresentException
    //   1316	1324	3	finally
    //   1316	1324	1315	java/lang/AssertionError
    //   1508	1516	1516	finally
    //   1508	1516	1516	java/util/NoSuchElementException
    //   1508	1516	1516	finally
    //   1508	1516	1516	finally
    //   1508	1516	3	java/lang/UnsupportedOperationException
    //   1695	1704	1704	finally
    //   1695	1704	1695	java/lang/IndexOutOfBoundsException
    //   1695	1704	1695	finally
    //   1696	1704	1704	finally
    //   1696	1704	3	finally
    //   2019	2026	2026	finally
    //   2019	2026	2026	java/lang/IllegalArgumentException
    //   2020	2026	2019	java/lang/NullPointerException
    //   2020	2026	2026	java/lang/ArrayIndexOutOfBoundsException
    //   2020	2026	2019	java/lang/EnumConstantNotPresentException
    //   2096	2102	2102	finally
    //   2096	2102	3	java/lang/IndexOutOfBoundsException
    //   2096	2102	2102	java/lang/EnumConstantNotPresentException
    //   2096	2102	3	finally
    //   2096	2102	2102	java/util/NoSuchElementException
    //   2292	2298	2298	finally
    //   2292	2298	2298	java/lang/IndexOutOfBoundsException
    //   2292	2298	3	java/lang/ArithmeticException
    //   2292	2298	3	java/lang/AssertionError
    //   2292	2298	3	finally
    //   2367	2374	2374	finally
    //   2367	2374	2367	java/lang/ArithmeticException
    //   2368	2374	2367	java/lang/NumberFormatException
    //   2368	2374	2374	java/lang/NumberFormatException
    //   2368	2374	2367	java/lang/IllegalStateException
    //   2563	2570	2570	finally
    //   2563	2570	2563	java/lang/AssertionError
    //   2564	2570	3	finally
    //   2564	2570	2563	java/lang/NumberFormatException
    //   2564	2570	3	finally
    //   2640	2646	2646	finally
    //   2640	2646	2646	finally
    //   2640	2646	2646	java/lang/IllegalStateException
    //   2640	2646	2646	finally
    //   2640	2646	3	java/util/NoSuchElementException
    //   2835	2842	2842	finally
    //   2835	2842	3	finally
    //   2835	2842	3	java/lang/RuntimeException
    //   2835	2842	3	java/lang/EnumConstantNotPresentException
    //   2836	2842	2835	java/lang/NullPointerException
    //   2911	2918	2918	finally
    //   2911	2918	3	java/lang/RuntimeException
    //   2912	2918	3	java/lang/ClassCastException
    //   2912	2918	2918	finally
    //   2912	2918	2911	java/lang/NumberFormatException
    //   2983	2990	2990	finally
    //   2983	2990	2983	java/lang/StringIndexOutOfBoundsException
    //   2983	2990	3	finally
    //   2984	2990	2983	java/lang/AssertionError
    //   2984	2990	2990	java/lang/NumberFormatException
    //   3179	3186	3186	finally
    //   3179	3186	3	java/util/NoSuchElementException
    //   3179	3186	3	java/lang/IndexOutOfBoundsException
    //   3180	3186	3179	finally
    //   3180	3186	3179	finally
    //   3255	3262	3262	finally
    //   3255	3262	3	java/lang/NumberFormatException
    //   3255	3262	3262	finally
    //   3256	3262	3255	java/util/ConcurrentModificationException
    //   3256	3262	3262	finally
    //   3468	3474	3474	finally
    //   3468	3474	3	java/lang/NumberFormatException
    //   3468	3474	3	finally
    //   3468	3474	3474	java/lang/UnsupportedOperationException
    //   3468	3474	3474	finally
    //   3543	3550	3550	finally
    //   3543	3550	3	java/lang/NumberFormatException
    //   3543	3550	3	java/lang/AssertionError
    //   3544	3550	3543	java/lang/IllegalArgumentException
    //   3544	3550	3543	finally
    //   3615	3622	3622	finally
    //   3615	3622	3615	java/lang/ArrayIndexOutOfBoundsException
    //   3615	3622	3615	finally
    //   3615	3622	3615	finally
    //   3616	3622	3	finally
    //   3736	3744	3736	finally
    //   3752	3754	3	java/util/NoSuchElementException
  }
  
  public static List getCityBlocks(EntityPlayer player, boolean crystal) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 6369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1137141084
    //   37: l2i
    //   38: ldc_w -936798925
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -393064514
    //   48: l2i
    //   49: ldc_w -2101969080
    //   52: ixor
    //   53: ldc2_w 52087773
    //   56: l2i
    //   57: ldc_w 1262798989
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1011813569 -> 6238, 119378505 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w 1594208184
    //   98: l2i
    //   99: ldc_w -67131167
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 898230034
    //   109: l2i
    //   110: ldc_w 283076234
    //   113: ixor
    //   114: ldc2_w -573371206
    //   117: l2i
    //   118: ldc_w 1847594814
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -478958573 -> 106, 386467037 -> 6268
    //   148: getfield field_70165_t : D
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w -1574617971
    //   160: l2i
    //   161: ldc_w 1648398092
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 2011046477
    //   171: l2i
    //   172: ldc_w 958043066
    //   175: ixor
    //   176: ldc2_w 251038887
    //   179: l2i
    //   180: ldc_w -858375184
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 6252, -1931213152 -> 212, 38077654 -> 168
    //   212: aload_0
    //   213: getstatic Perryc.1 : I
    //   216: ifeq -> 230
    //   219: ldc2_w -358820191
    //   222: l2i
    //   223: ldc_w -483293460
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 890512386
    //   233: l2i
    //   234: ldc_w 856085898
    //   237: ixor
    //   238: ldc2_w 1299858479
    //   241: l2i
    //   242: ldc_w 1831049728
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 272, -2132334160 -> 230, 703893090 -> 6272
    //   272: getfield field_70163_u : D
    //   275: getstatic Perryc.0 : I
    //   278: ifle -> 292
    //   281: ldc2_w -132901837
    //   284: l2i
    //   285: ldc_w -1104682926
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w 466571636
    //   295: l2i
    //   296: ldc_w 1162842436
    //   299: ixor
    //   300: ldc2_w -686572676
    //   303: l2i
    //   304: ldc_w -372489823
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 6212, 1616853741 -> 336, 2028736188 -> 292
    //   336: aload_0
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w 1188480796
    //   346: l2i
    //   347: ldc_w -381620551
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -1123188544
    //   357: l2i
    //   358: ldc_w -2029795416
    //   361: ixor
    //   362: ldc2_w -945561580
    //   365: l2i
    //   366: ldc_w -250592658
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 6336, -1725592609 -> 354, 213771538 -> 396
    //   396: getfield field_70161_v : D
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 788921428
    //   408: l2i
    //   409: ldc_w -1278083740
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -303994107
    //   419: l2i
    //   420: ldc_w 1635050007
    //   423: ixor
    //   424: ldc2_w -684520997
    //   427: l2i
    //   428: ldc_w 811035506
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 460, -728476554 -> 416, 2075157401 -> 6218
    //   460: goto -> 464
    //   463: athrow
    //   464: invokespecial <init> : (DDD)V
    //   467: goto -> 471
    //   470: athrow
    //   471: getstatic Perryc.1 : I
    //   474: ifeq -> 488
    //   477: ldc2_w 1895519420
    //   480: l2i
    //   481: ldc_w -2045645477
    //   484: ixor
    //   485: goto -> 496
    //   488: ldc2_w 735495752
    //   491: l2i
    //   492: ldc_w -1856589398
    //   495: ixor
    //   496: ldc2_w -1262569710
    //   499: l2i
    //   500: ldc_w 201747825
    //   503: ixor
    //   504: ixor
    //   505: lookupswitch default -> 532, -292446483 -> 488, 1314022276 -> 6320
    //   532: astore_2
    //   533: new java/util/ArrayList
    //   536: dup
    //   537: getstatic Perryc.0 : I
    //   540: ifle -> 554
    //   543: ldc2_w -429057552
    //   546: l2i
    //   547: ldc_w 604992431
    //   550: ixor
    //   551: goto -> 562
    //   554: ldc2_w 443234653
    //   557: l2i
    //   558: ldc_w 1001395273
    //   561: ixor
    //   562: ldc2_w -36427271
    //   565: l2i
    //   566: ldc_w -1002890224
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 6280, -74489930 -> 554, 406198525 -> 596
    //   596: goto -> 600
    //   599: athrow
    //   600: invokespecial <init> : ()V
    //   603: goto -> 607
    //   606: athrow
    //   607: getstatic Perryc.c : I
    //   610: iflt -> 624
    //   613: ldc2_w 975634865
    //   616: l2i
    //   617: ldc_w -732980341
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -1228273776
    //   627: l2i
    //   628: ldc_w -1618624317
    //   631: ixor
    //   632: ldc2_w -860844392
    //   635: l2i
    //   636: ldc_w -1114895421
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, -1621876895 -> 6286, -1354214860 -> 624
    //   668: astore_3
    //   669: getstatic Perryc.1 : I
    //   672: ifeq -> 686
    //   675: ldc2_w 1114475091
    //   678: l2i
    //   679: ldc_w 1597503194
    //   682: ixor
    //   683: goto -> 694
    //   686: ldc2_w -660488420
    //   689: l2i
    //   690: ldc_w -674439198
    //   693: ixor
    //   694: ldc2_w -632884740
    //   697: l2i
    //   698: ldc_w 2005931717
    //   701: ixor
    //   702: ixor
    //   703: lookupswitch default -> 728, -2048567384 -> 686, -1332962384 -> 6282
    //   728: aload_2
    //   729: getstatic Perryc.0 : I
    //   732: ifle -> 746
    //   735: ldc2_w 1676793971
    //   738: l2i
    //   739: ldc_w -1541100634
    //   742: ixor
    //   743: goto -> 754
    //   746: ldc2_w 1768913369
    //   749: l2i
    //   750: ldc_w -1727815550
    //   753: ixor
    //   754: ldc2_w 1497289143
    //   757: l2i
    //   758: ldc_w 1953436653
    //   761: ixor
    //   762: ixor
    //   763: lookupswitch default -> 6332, -583197951 -> 788, -360402545 -> 746
    //   788: goto -> 792
    //   791: athrow
    //   792: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   795: goto -> 799
    //   798: athrow
    //   799: getstatic Perryc.1 : I
    //   802: ifeq -> 816
    //   805: ldc2_w 1997566836
    //   808: l2i
    //   809: ldc_w -1465589760
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w 1506209279
    //   819: l2i
    //   820: ldc_w -1081316059
    //   823: ixor
    //   824: ldc2_w -1451509683
    //   827: l2i
    //   828: ldc_w -1639695045
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 860, -393538046 -> 6298, -183840244 -> 816
    //   860: goto -> 864
    //   863: athrow
    //   864: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   867: goto -> 871
    //   870: athrow
    //   871: getstatic Perryc.c : I
    //   874: iflt -> 888
    //   877: ldc2_w 546664598
    //   880: l2i
    //   881: ldc_w -1605577748
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 449243499
    //   891: l2i
    //   892: ldc_w 785591733
    //   895: ixor
    //   896: ldc2_w 169611921
    //   899: l2i
    //   900: ldc_w 979243122
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 6296, -1331977831 -> 888, 72861245 -> 932
    //   932: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   935: if_acmpne -> 949
    //   938: ldc2_w 814820074
    //   941: l2i
    //   942: ldc_w 1965249124
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 412373368
    //   952: l2i
    //   953: ldc_w 1562782201
    //   956: ixor
    //   957: ldc2_w 1920839315
    //   960: l2i
    //   961: ldc_w 2033749674
    //   964: ixor
    //   965: ixor
    //   966: tableswitch default -> 938, 1324832951 -> 988, 1324832952 -> 2030
    //   988: getstatic Perryc.c : I
    //   991: iflt -> 1005
    //   994: ldc2_w 822794279
    //   997: l2i
    //   998: ldc_w 1872002702
    //   1001: ixor
    //   1002: goto -> 1013
    //   1005: ldc2_w 949943175
    //   1008: l2i
    //   1009: ldc_w 1598073234
    //   1012: ixor
    //   1013: ldc2_w 1965197996
    //   1016: l2i
    //   1017: ldc_w 962916134
    //   1020: ixor
    //   1021: ixor
    //   1022: lookupswitch default -> 6300, 316195619 -> 1005, 731395999 -> 1048
    //   1048: iload_1
    //   1049: ifeq -> 1063
    //   1052: ldc2_w -927409418
    //   1055: l2i
    //   1056: ldc_w -1218544798
    //   1059: ixor
    //   1060: goto -> 1071
    //   1063: ldc2_w 881845540
    //   1066: l2i
    //   1067: ldc_w 1265190065
    //   1070: ixor
    //   1071: ldc2_w 962727758
    //   1074: l2i
    //   1075: ldc_w -1318729132
    //   1078: ixor
    //   1079: ixor
    //   1080: tableswitch default -> 1052, -136223602 -> 1104, -136223601 -> 1373
    //   1104: getstatic Perryc.c : I
    //   1107: iflt -> 1121
    //   1110: ldc2_w -887449270
    //   1113: l2i
    //   1114: ldc_w 1975785770
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w -1704869498
    //   1124: l2i
    //   1125: ldc_w 42020622
    //   1128: ixor
    //   1129: ldc2_w 677328866
    //   1132: l2i
    //   1133: ldc_w 1640850238
    //   1136: ixor
    //   1137: ixor
    //   1138: lookupswitch default -> 6210, -781010348 -> 1164, -145959748 -> 1121
    //   1164: aload_3
    //   1165: getstatic Perryc.1 : I
    //   1168: ifeq -> 1182
    //   1171: ldc2_w -743119357
    //   1174: l2i
    //   1175: ldc_w -827806597
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w -1503680798
    //   1185: l2i
    //   1186: ldc_w -824835148
    //   1189: ixor
    //   1190: ldc2_w 339480924
    //   1193: l2i
    //   1194: ldc_w -732739330
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 6338, -1461256972 -> 1224, -579660838 -> 1182
    //   1224: aload_2
    //   1225: getstatic Perryc.1 : I
    //   1228: ifeq -> 1242
    //   1231: ldc2_w 540232013
    //   1234: l2i
    //   1235: ldc_w 1948201339
    //   1238: ixor
    //   1239: goto -> 1250
    //   1242: ldc2_w 864591866
    //   1245: l2i
    //   1246: ldc_w 298000666
    //   1249: ixor
    //   1250: ldc2_w 1162549338
    //   1253: l2i
    //   1254: ldc_w -1566587026
    //   1257: ixor
    //   1258: ixor
    //   1259: lookupswitch default -> 6326, -1275549950 -> 1242, -979410476 -> 1284
    //   1284: goto -> 1288
    //   1287: athrow
    //   1288: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1291: goto -> 1295
    //   1294: athrow
    //   1295: getstatic Perryc.c : I
    //   1298: iflt -> 1312
    //   1301: ldc2_w -1423611945
    //   1304: l2i
    //   1305: ldc_w 551421852
    //   1308: ixor
    //   1309: goto -> 1320
    //   1312: ldc2_w 1238325895
    //   1315: l2i
    //   1316: ldc_w -152986783
    //   1319: ixor
    //   1320: ldc2_w 1824186516
    //   1323: l2i
    //   1324: ldc_w -468202004
    //   1327: ixor
    //   1328: ixor
    //   1329: lookupswitch default -> 6204, 55987507 -> 1312, 931392670 -> 1356
    //   1356: goto -> 1360
    //   1359: athrow
    //   1360: invokeinterface add : (Ljava/lang/Object;)Z
    //   1365: goto -> 1369
    //   1368: athrow
    //   1369: pop
    //   1370: goto -> 2030
    //   1373: getstatic Perryc.1 : I
    //   1376: ifeq -> 1390
    //   1379: ldc2_w 1783120299
    //   1382: l2i
    //   1383: ldc_w 1043604794
    //   1386: ixor
    //   1387: goto -> 1398
    //   1390: ldc2_w 624844086
    //   1393: l2i
    //   1394: ldc_w 1788287093
    //   1397: ixor
    //   1398: ldc2_w -1601497936
    //   1401: l2i
    //   1402: ldc_w 1224682508
    //   1405: ixor
    //   1406: ixor
    //   1407: lookupswitch default -> 6334, -1478656513 -> 1432, -1140302803 -> 1390
    //   1432: aload_2
    //   1433: getstatic Perryc.0 : I
    //   1436: ifle -> 1450
    //   1439: ldc2_w -1407133140
    //   1442: l2i
    //   1443: ldc_w 332287937
    //   1446: ixor
    //   1447: goto -> 1458
    //   1450: ldc2_w -1979977934
    //   1453: l2i
    //   1454: ldc_w -1385673295
    //   1457: ixor
    //   1458: ldc2_w 858834009
    //   1461: l2i
    //   1462: ldc_w -1012092264
    //   1465: ixor
    //   1466: ixor
    //   1467: lookupswitch default -> 6270, -737160126 -> 1492, 1332929324 -> 1450
    //   1492: goto -> 1496
    //   1495: athrow
    //   1496: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1499: goto -> 1503
    //   1502: athrow
    //   1503: getstatic Perryc.0 : I
    //   1506: ifle -> 1520
    //   1509: ldc2_w -1853042234
    //   1512: l2i
    //   1513: ldc_w 1186085801
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w -492973071
    //   1523: l2i
    //   1524: ldc_w -1746468875
    //   1527: ixor
    //   1528: ldc2_w 1170438273
    //   1531: l2i
    //   1532: ldc_w 1080880629
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 1564, -785541919 -> 1520, -762216677 -> 6302
    //   1564: goto -> 1568
    //   1567: athrow
    //   1568: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1571: goto -> 1575
    //   1574: athrow
    //   1575: getstatic Perryc.1 : I
    //   1578: ifeq -> 1592
    //   1581: ldc2_w -1816192564
    //   1584: l2i
    //   1585: ldc_w 1614108510
    //   1588: ixor
    //   1589: goto -> 1600
    //   1592: ldc2_w 75388618
    //   1595: l2i
    //   1596: ldc_w -1653761768
    //   1599: ixor
    //   1600: ldc2_w 558207530
    //   1603: l2i
    //   1604: ldc_w 1855409227
    //   1607: ixor
    //   1608: ixor
    //   1609: lookupswitch default -> 1636, -1135046413 -> 6222, 479066353 -> 1592
    //   1636: goto -> 1640
    //   1639: athrow
    //   1640: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   1643: goto -> 1647
    //   1646: athrow
    //   1647: getstatic Perryc.c : I
    //   1650: iflt -> 1664
    //   1653: ldc2_w -1274782582
    //   1656: l2i
    //   1657: ldc_w -1199319278
    //   1660: ixor
    //   1661: goto -> 1672
    //   1664: ldc2_w -997349276
    //   1667: l2i
    //   1668: ldc_w -1352398263
    //   1671: ixor
    //   1672: ldc2_w 1105985049
    //   1675: l2i
    //   1676: ldc_w -207873156
    //   1679: ixor
    //   1680: ixor
    //   1681: lookupswitch default -> 6206, -1091539203 -> 1664, -643938488 -> 1708
    //   1708: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   1711: if_acmpne -> 1725
    //   1714: ldc2_w 1512655580
    //   1717: l2i
    //   1718: ldc_w 49886629
    //   1721: ixor
    //   1722: goto -> 1733
    //   1725: ldc2_w -951988544
    //   1728: l2i
    //   1729: ldc_w -1617841734
    //   1732: ixor
    //   1733: ldc2_w 1717955271
    //   1736: l2i
    //   1737: ldc_w 151863779
    //   1740: ixor
    //   1741: ixor
    //   1742: tableswitch default -> 1714, 934859869 -> 1764, 934859870 -> 2030
    //   1764: getstatic Perryc.c : I
    //   1767: iflt -> 1781
    //   1770: ldc2_w -912794774
    //   1773: l2i
    //   1774: ldc_w 128655141
    //   1777: ixor
    //   1778: goto -> 1789
    //   1781: ldc2_w -737801295
    //   1784: l2i
    //   1785: ldc_w -529470223
    //   1788: ixor
    //   1789: ldc2_w -1540809855
    //   1792: l2i
    //   1793: ldc_w -227805271
    //   1796: ixor
    //   1797: ixor
    //   1798: lookupswitch default -> 6246, -1736562585 -> 1781, 1647577960 -> 1824
    //   1824: aload_3
    //   1825: getstatic Perryc.0 : I
    //   1828: ifle -> 1842
    //   1831: ldc2_w 534531869
    //   1834: l2i
    //   1835: ldc_w 1402096864
    //   1838: ixor
    //   1839: goto -> 1850
    //   1842: ldc2_w 668345247
    //   1845: l2i
    //   1846: ldc_w 1919752326
    //   1849: ixor
    //   1850: ldc2_w 717664114
    //   1853: l2i
    //   1854: ldc_w -1204502378
    //   1857: ixor
    //   1858: ixor
    //   1859: lookupswitch default -> 1884, -558076903 -> 6248, -330264267 -> 1842
    //   1884: aload_2
    //   1885: getstatic Perryc.1 : I
    //   1888: ifeq -> 1902
    //   1891: ldc2_w 721786462
    //   1894: l2i
    //   1895: ldc_w -1383293678
    //   1898: ixor
    //   1899: goto -> 1910
    //   1902: ldc2_w 504925467
    //   1905: l2i
    //   1906: ldc_w 2048831381
    //   1909: ixor
    //   1910: ldc2_w 884331873
    //   1913: l2i
    //   1914: ldc_w 342197783
    //   1917: ixor
    //   1918: ixor
    //   1919: lookupswitch default -> 6304, -1504094150 -> 1902, 1154904568 -> 1944
    //   1944: goto -> 1948
    //   1947: athrow
    //   1948: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   1951: goto -> 1955
    //   1954: athrow
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w -605994212
    //   1964: l2i
    //   1965: ldc_w 677692619
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 1376610056
    //   1975: l2i
    //   1976: ldc_w -620165537
    //   1979: ixor
    //   1980: ldc2_w 463084059
    //   1983: l2i
    //   1984: ldc_w 640698955
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 2016, -835725433 -> 6260, 1936568989 -> 1972
    //   2016: goto -> 2020
    //   2019: athrow
    //   2020: invokeinterface add : (Ljava/lang/Object;)Z
    //   2025: goto -> 2029
    //   2028: athrow
    //   2029: pop
    //   2030: getstatic Perryc.c : I
    //   2033: iflt -> 2047
    //   2036: ldc2_w 1047956009
    //   2039: l2i
    //   2040: ldc_w -64560114
    //   2043: ixor
    //   2044: goto -> 2055
    //   2047: ldc2_w -459368329
    //   2050: l2i
    //   2051: ldc_w -1713119866
    //   2054: ixor
    //   2055: ldc2_w 96769599
    //   2058: l2i
    //   2059: ldc_w 676210433
    //   2062: ixor
    //   2063: ixor
    //   2064: lookupswitch default -> 6186, -270868711 -> 2047, 1358427343 -> 2092
    //   2092: aload_2
    //   2093: getstatic Perryc.1 : I
    //   2096: ifeq -> 2110
    //   2099: ldc2_w -1098463561
    //   2102: l2i
    //   2103: ldc_w 1460413780
    //   2106: ixor
    //   2107: goto -> 2118
    //   2110: ldc2_w -1734372077
    //   2113: l2i
    //   2114: ldc_w -1235105273
    //   2117: ixor
    //   2118: ldc2_w 1759800056
    //   2121: l2i
    //   2122: ldc_w -330616621
    //   2125: ixor
    //   2126: ixor
    //   2127: lookupswitch default -> 2152, -1283800426 -> 2110, 1831188936 -> 6324
    //   2152: goto -> 2156
    //   2155: athrow
    //   2156: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   2159: goto -> 2163
    //   2162: athrow
    //   2163: getstatic Perryc.c : I
    //   2166: iflt -> 2180
    //   2169: ldc2_w 1758502193
    //   2172: l2i
    //   2173: ldc_w -1140275042
    //   2176: ixor
    //   2177: goto -> 2188
    //   2180: ldc2_w -1952366667
    //   2183: l2i
    //   2184: ldc_w -1531226130
    //   2187: ixor
    //   2188: ldc2_w 1725911392
    //   2191: l2i
    //   2192: ldc_w 82123026
    //   2195: ixor
    //   2196: ixor
    //   2197: lookupswitch default -> 6264, -1226695203 -> 2180, 1293951017 -> 2224
    //   2224: goto -> 2228
    //   2227: athrow
    //   2228: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   2231: goto -> 2235
    //   2234: athrow
    //   2235: getstatic Perryc.c : I
    //   2238: iflt -> 2252
    //   2241: ldc2_w 1675707004
    //   2244: l2i
    //   2245: ldc_w 1369002279
    //   2248: ixor
    //   2249: goto -> 2260
    //   2252: ldc2_w 449055647
    //   2255: l2i
    //   2256: ldc_w 955490924
    //   2259: ixor
    //   2260: ldc2_w -594387027
    //   2263: l2i
    //   2264: ldc_w 922870031
    //   2267: ixor
    //   2268: ixor
    //   2269: lookupswitch default -> 6278, -911993007 -> 2296, -638865927 -> 2252
    //   2296: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   2299: if_acmpne -> 2313
    //   2302: ldc2_w -99905995
    //   2305: l2i
    //   2306: ldc_w -972864515
    //   2309: ixor
    //   2310: goto -> 2321
    //   2313: ldc2_w 1356455810
    //   2316: l2i
    //   2317: ldc_w 1825641045
    //   2320: ixor
    //   2321: ldc2_w 1080781204
    //   2324: l2i
    //   2325: ldc_w 349427027
    //   2328: ixor
    //   2329: ixor
    //   2330: tableswitch default -> 2302, 1756393743 -> 2352, 1756393744 -> 3394
    //   2352: getstatic Perryc.1 : I
    //   2355: ifeq -> 2369
    //   2358: ldc2_w -1318010315
    //   2361: l2i
    //   2362: ldc_w -1932218339
    //   2365: ixor
    //   2366: goto -> 2377
    //   2369: ldc2_w -1821766794
    //   2372: l2i
    //   2373: ldc_w 1614352847
    //   2376: ixor
    //   2377: ldc2_w -1749272927
    //   2380: l2i
    //   2381: ldc_w 1384715677
    //   2384: ixor
    //   2385: ixor
    //   2386: lookupswitch default -> 6192, -124694252 -> 2369, 912669061 -> 2412
    //   2412: iload_1
    //   2413: ifeq -> 2427
    //   2416: ldc2_w 819429357
    //   2419: l2i
    //   2420: ldc_w 1739506396
    //   2423: ixor
    //   2424: goto -> 2435
    //   2427: ldc2_w 859297293
    //   2430: l2i
    //   2431: ldc_w 1682860863
    //   2434: ixor
    //   2435: ldc2_w -1528564446
    //   2438: l2i
    //   2439: ldc_w -1703317362
    //   2442: ixor
    //   2443: ixor
    //   2444: tableswitch default -> 2416, 1776498845 -> 2468, 1776498846 -> 2737
    //   2468: getstatic Perryc.c : I
    //   2471: iflt -> 2485
    //   2474: ldc2_w 2033324695
    //   2477: l2i
    //   2478: ldc_w -1652444043
    //   2481: ixor
    //   2482: goto -> 2493
    //   2485: ldc2_w 1927053474
    //   2488: l2i
    //   2489: ldc_w 2061778191
    //   2492: ixor
    //   2493: ldc2_w 224804262
    //   2496: l2i
    //   2497: ldc_w -333861323
    //   2500: ixor
    //   2501: ixor
    //   2502: lookupswitch default -> 6290, -381211074 -> 2528, 97269105 -> 2485
    //   2528: aload_3
    //   2529: getstatic Perryc.0 : I
    //   2532: ifle -> 2546
    //   2535: ldc2_w -1222541067
    //   2538: l2i
    //   2539: ldc_w 1038568664
    //   2542: ixor
    //   2543: goto -> 2554
    //   2546: ldc2_w -1472819156
    //   2549: l2i
    //   2550: ldc_w 1187415068
    //   2553: ixor
    //   2554: ldc2_w -2047058066
    //   2557: l2i
    //   2558: ldc_w -1525891572
    //   2561: ixor
    //   2562: ixor
    //   2563: lookupswitch default -> 2588, -2032088656 -> 2546, -1439290033 -> 6232
    //   2588: aload_2
    //   2589: getstatic Perryc.0 : I
    //   2592: ifle -> 2606
    //   2595: ldc2_w -1467097382
    //   2598: l2i
    //   2599: ldc_w 1778891820
    //   2602: ixor
    //   2603: goto -> 2614
    //   2606: ldc2_w 206924313
    //   2609: l2i
    //   2610: ldc_w -703143501
    //   2613: ixor
    //   2614: ldc2_w 2073511395
    //   2617: l2i
    //   2618: ldc_w 1450162567
    //   2621: ixor
    //   2622: ixor
    //   2623: lookupswitch default -> 6346, -277700974 -> 2606, -138709042 -> 2648
    //   2648: goto -> 2652
    //   2651: athrow
    //   2652: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   2655: goto -> 2659
    //   2658: athrow
    //   2659: getstatic Perryc.1 : I
    //   2662: ifeq -> 2676
    //   2665: ldc2_w 1406265824
    //   2668: l2i
    //   2669: ldc_w 1175399464
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -1838249309
    //   2679: l2i
    //   2680: ldc_w -1189352643
    //   2683: ixor
    //   2684: ldc2_w 1424317757
    //   2687: l2i
    //   2688: ldc_w -698887426
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 6288, -1754510837 -> 2676, -1446515107 -> 2720
    //   2720: goto -> 2724
    //   2723: athrow
    //   2724: invokeinterface add : (Ljava/lang/Object;)Z
    //   2729: goto -> 2733
    //   2732: athrow
    //   2733: pop
    //   2734: goto -> 3394
    //   2737: getstatic Perryc.0 : I
    //   2740: ifle -> 2754
    //   2743: ldc2_w -190138415
    //   2746: l2i
    //   2747: ldc_w 299342842
    //   2750: ixor
    //   2751: goto -> 2762
    //   2754: ldc2_w -1696901370
    //   2757: l2i
    //   2758: ldc_w -2122113093
    //   2761: ixor
    //   2762: ldc2_w 917994193
    //   2765: l2i
    //   2766: ldc_w 1557699659
    //   2769: ixor
    //   2770: ixor
    //   2771: lookupswitch default -> 2796, -1894593871 -> 6242, 1519963060 -> 2754
    //   2796: aload_2
    //   2797: getstatic Perryc.1 : I
    //   2800: ifeq -> 2814
    //   2803: ldc2_w 211693256
    //   2806: l2i
    //   2807: ldc_w 450775907
    //   2810: ixor
    //   2811: goto -> 2822
    //   2814: ldc2_w -1262863106
    //   2817: l2i
    //   2818: ldc_w -725405708
    //   2821: ixor
    //   2822: ldc2_w -1124659460
    //   2825: l2i
    //   2826: ldc_w -767885784
    //   2829: ixor
    //   2830: ixor
    //   2831: lookupswitch default -> 6200, 246735838 -> 2856, 2022544767 -> 2814
    //   2856: goto -> 2860
    //   2859: athrow
    //   2860: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   2863: goto -> 2867
    //   2866: athrow
    //   2867: getstatic Perryc.0 : I
    //   2870: ifle -> 2884
    //   2873: ldc2_w 270451756
    //   2876: l2i
    //   2877: ldc_w 1555574066
    //   2880: ixor
    //   2881: goto -> 2892
    //   2884: ldc2_w 954949804
    //   2887: l2i
    //   2888: ldc_w 805531000
    //   2891: ixor
    //   2892: ldc2_w 994033657
    //   2895: l2i
    //   2896: ldc_w 104682703
    //   2899: ixor
    //   2900: ixor
    //   2901: lookupswitch default -> 2928, 1207903708 -> 2884, 1906573864 -> 6240
    //   2928: goto -> 2932
    //   2931: athrow
    //   2932: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   2935: goto -> 2939
    //   2938: athrow
    //   2939: getstatic Perryc.c : I
    //   2942: iflt -> 2956
    //   2945: ldc2_w 1419127665
    //   2948: l2i
    //   2949: ldc_w -1488066676
    //   2952: ixor
    //   2953: goto -> 2964
    //   2956: ldc2_w 1143437256
    //   2959: l2i
    //   2960: ldc_w 360178448
    //   2963: ixor
    //   2964: ldc2_w 1087102237
    //   2967: l2i
    //   2968: ldc_w -693624010
    //   2971: ixor
    //   2972: ixor
    //   2973: lookupswitch default -> 6308, -952931597 -> 3000, 1706570454 -> 2956
    //   3000: goto -> 3004
    //   3003: athrow
    //   3004: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   3007: goto -> 3011
    //   3010: athrow
    //   3011: getstatic Perryc.0 : I
    //   3014: ifle -> 3028
    //   3017: ldc2_w 675050267
    //   3020: l2i
    //   3021: ldc_w -2131075661
    //   3024: ixor
    //   3025: goto -> 3036
    //   3028: ldc2_w -471172610
    //   3031: l2i
    //   3032: ldc_w 1622877272
    //   3035: ixor
    //   3036: ldc2_w -1873085896
    //   3039: l2i
    //   3040: ldc_w -1801009842
    //   3043: ixor
    //   3044: ixor
    //   3045: lookupswitch default -> 3072, -1405480482 -> 6208, 199579645 -> 3028
    //   3072: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   3075: if_acmpne -> 3089
    //   3078: ldc2_w 954842822
    //   3081: l2i
    //   3082: ldc_w -1546041790
    //   3085: ixor
    //   3086: goto -> 3097
    //   3089: ldc2_w -1725288792
    //   3092: l2i
    //   3093: ldc_w 35313197
    //   3096: ixor
    //   3097: ldc2_w -1732863117
    //   3100: l2i
    //   3101: ldc_w 460806709
    //   3104: ixor
    //   3105: ixor
    //   3106: tableswitch default -> 3078, 418462146 -> 3128, 418462147 -> 3394
    //   3128: getstatic Perryc.c : I
    //   3131: iflt -> 3145
    //   3134: ldc2_w 738285119
    //   3137: l2i
    //   3138: ldc_w 1994563792
    //   3141: ixor
    //   3142: goto -> 3153
    //   3145: ldc2_w 1623508542
    //   3148: l2i
    //   3149: ldc_w -2140006132
    //   3152: ixor
    //   3153: ldc2_w -669992937
    //   3156: l2i
    //   3157: ldc_w 2077013023
    //   3160: ixor
    //   3161: ixor
    //   3162: lookupswitch default -> 3188, -113247513 -> 6254, 1546315012 -> 3145
    //   3188: aload_3
    //   3189: getstatic Perryc.0 : I
    //   3192: ifle -> 3206
    //   3195: ldc2_w 1389894934
    //   3198: l2i
    //   3199: ldc_w 985487021
    //   3202: ixor
    //   3203: goto -> 3214
    //   3206: ldc2_w -719864620
    //   3209: l2i
    //   3210: ldc_w -1892065954
    //   3213: ixor
    //   3214: ldc2_w -600428214
    //   3217: l2i
    //   3218: ldc_w -440205865
    //   3221: ixor
    //   3222: ixor
    //   3223: lookupswitch default -> 6226, 1368491814 -> 3206, 1675242775 -> 3248
    //   3248: aload_2
    //   3249: getstatic Perryc.c : I
    //   3252: iflt -> 3266
    //   3255: ldc2_w -992802893
    //   3258: l2i
    //   3259: ldc_w 101802227
    //   3262: ixor
    //   3263: goto -> 3274
    //   3266: ldc2_w -942941883
    //   3269: l2i
    //   3270: ldc_w -1711276372
    //   3273: ixor
    //   3274: ldc2_w 1827778657
    //   3277: l2i
    //   3278: ldc_w 611795666
    //   3281: ixor
    //   3282: ixor
    //   3283: lookupswitch default -> 6214, -1975216653 -> 3266, 380818778 -> 3308
    //   3308: goto -> 3312
    //   3311: athrow
    //   3312: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   3315: goto -> 3319
    //   3318: athrow
    //   3319: getstatic Perryc.0 : I
    //   3322: ifle -> 3336
    //   3325: ldc2_w 145919516
    //   3328: l2i
    //   3329: ldc_w 908744029
    //   3332: ixor
    //   3333: goto -> 3344
    //   3336: ldc2_w 1793698074
    //   3339: l2i
    //   3340: ldc_w 1242591376
    //   3343: ixor
    //   3344: ldc2_w 1711212430
    //   3347: l2i
    //   3348: ldc_w -522227143
    //   3351: ixor
    //   3352: ixor
    //   3353: lookupswitch default -> 3380, -1145524490 -> 6190, 1601224304 -> 3336
    //   3380: goto -> 3384
    //   3383: athrow
    //   3384: invokeinterface add : (Ljava/lang/Object;)Z
    //   3389: goto -> 3393
    //   3392: athrow
    //   3393: pop
    //   3394: getstatic Perryc.c : I
    //   3397: iflt -> 3411
    //   3400: ldc2_w -336002999
    //   3403: l2i
    //   3404: ldc_w 1450348130
    //   3407: ixor
    //   3408: goto -> 3419
    //   3411: ldc2_w -761273823
    //   3414: l2i
    //   3415: ldc_w 2027783917
    //   3418: ixor
    //   3419: ldc2_w 133692641
    //   3422: l2i
    //   3423: ldc_w 921212744
    //   3426: ixor
    //   3427: ixor
    //   3428: lookupswitch default -> 6194, -1936398974 -> 3411, -1688400027 -> 3456
    //   3456: aload_2
    //   3457: getstatic Perryc.c : I
    //   3460: iflt -> 3474
    //   3463: ldc2_w -88781982
    //   3466: l2i
    //   3467: ldc_w -1217390030
    //   3470: ixor
    //   3471: goto -> 3482
    //   3474: ldc2_w 1560905333
    //   3477: l2i
    //   3478: ldc_w 1690872127
    //   3481: ixor
    //   3482: ldc2_w -825343231
    //   3485: l2i
    //   3486: ldc_w -1846753360
    //   3489: ixor
    //   3490: ixor
    //   3491: lookupswitch default -> 6350, 317183457 -> 3474, 1726196731 -> 3516
    //   3516: goto -> 3520
    //   3519: athrow
    //   3520: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   3523: goto -> 3527
    //   3526: athrow
    //   3527: getstatic Perryc.1 : I
    //   3530: ifeq -> 3544
    //   3533: ldc2_w -587265923
    //   3536: l2i
    //   3537: ldc_w -1120229990
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w 1549428469
    //   3547: l2i
    //   3548: ldc_w 314357697
    //   3551: ixor
    //   3552: ldc2_w -1923327934
    //   3555: l2i
    //   3556: ldc_w 1241927202
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 3588, -1499481209 -> 6276, -612129354 -> 3544
    //   3588: goto -> 3592
    //   3591: athrow
    //   3592: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   3595: goto -> 3599
    //   3598: athrow
    //   3599: getstatic Perryc.1 : I
    //   3602: ifeq -> 3616
    //   3605: ldc2_w -331361364
    //   3608: l2i
    //   3609: ldc_w 1316732623
    //   3612: ixor
    //   3613: goto -> 3624
    //   3616: ldc2_w -1114482589
    //   3619: l2i
    //   3620: ldc_w -2124081362
    //   3623: ixor
    //   3624: ldc2_w 658332222
    //   3627: l2i
    //   3628: ldc_w -1273376517
    //   3631: ixor
    //   3632: ixor
    //   3633: lookupswitch default -> 6328, -1345075832 -> 3660, 828434342 -> 3616
    //   3660: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   3663: if_acmpne -> 3677
    //   3666: ldc2_w -944962336
    //   3669: l2i
    //   3670: ldc_w 1470175122
    //   3673: ixor
    //   3674: goto -> 3685
    //   3677: ldc2_w -14908216
    //   3680: l2i
    //   3681: ldc_w 1863358373
    //   3684: ixor
    //   3685: ldc2_w -498576602
    //   3688: l2i
    //   3689: ldc_w -1268892805
    //   3692: ixor
    //   3693: ixor
    //   3694: tableswitch default -> 3666, -971343057 -> 3716, -971343056 -> 4758
    //   3716: getstatic Perryc.0 : I
    //   3719: ifle -> 3733
    //   3722: ldc2_w -1851504155
    //   3725: l2i
    //   3726: ldc_w -2132630147
    //   3729: ixor
    //   3730: goto -> 3741
    //   3733: ldc2_w -1462661041
    //   3736: l2i
    //   3737: ldc_w 364436135
    //   3740: ixor
    //   3741: ldc2_w -902307103
    //   3744: l2i
    //   3745: ldc_w -2014786514
    //   3748: ixor
    //   3749: ixor
    //   3750: lookupswitch default -> 6344, -256482265 -> 3776, 1553580631 -> 3733
    //   3776: iload_1
    //   3777: ifeq -> 3791
    //   3780: ldc2_w 1630448157
    //   3783: l2i
    //   3784: ldc_w -1384057602
    //   3787: ixor
    //   3788: goto -> 3799
    //   3791: ldc2_w -1140175827
    //   3794: l2i
    //   3795: ldc_w 1889800905
    //   3798: ixor
    //   3799: ldc2_w 575567747
    //   3802: l2i
    //   3803: ldc_w -1290285669
    //   3806: ixor
    //   3807: ixor
    //   3808: tableswitch default -> 3780, 1576527099 -> 3832, 1576527100 -> 4101
    //   3832: getstatic Perryc.c : I
    //   3835: iflt -> 3849
    //   3838: ldc2_w -461456690
    //   3841: l2i
    //   3842: ldc_w -975699824
    //   3845: ixor
    //   3846: goto -> 3857
    //   3849: ldc2_w -64822182
    //   3852: l2i
    //   3853: ldc_w 538338435
    //   3856: ixor
    //   3857: ldc2_w -513909403
    //   3860: l2i
    //   3861: ldc_w 1811128251
    //   3864: ixor
    //   3865: ixor
    //   3866: lookupswitch default -> 6230, -1425311616 -> 3849, 1452884487 -> 3892
    //   3892: aload_3
    //   3893: getstatic Perryc.1 : I
    //   3896: ifeq -> 3910
    //   3899: ldc2_w 1911100853
    //   3902: l2i
    //   3903: ldc_w -58272281
    //   3906: ixor
    //   3907: goto -> 3918
    //   3910: ldc2_w -1000055756
    //   3913: l2i
    //   3914: ldc_w 578597202
    //   3917: ixor
    //   3918: ldc2_w 480117732
    //   3921: l2i
    //   3922: ldc_w -1848992576
    //   3925: ixor
    //   3926: ixor
    //   3927: lookupswitch default -> 3952, 3891062 -> 6220, 1078215685 -> 3910
    //   3952: aload_2
    //   3953: getstatic Perryc.c : I
    //   3956: iflt -> 3970
    //   3959: ldc2_w -386774610
    //   3962: l2i
    //   3963: ldc_w -1662115168
    //   3966: ixor
    //   3967: goto -> 3978
    //   3970: ldc2_w -1909165852
    //   3973: l2i
    //   3974: ldc_w -1366062110
    //   3977: ixor
    //   3978: ldc2_w 1502390819
    //   3981: l2i
    //   3982: ldc_w 2044581329
    //   3985: ixor
    //   3986: ixor
    //   3987: lookupswitch default -> 4012, -1768396561 -> 3970, 1414337788 -> 6294
    //   4012: goto -> 4016
    //   4015: athrow
    //   4016: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   4019: goto -> 4023
    //   4022: athrow
    //   4023: getstatic Perryc.0 : I
    //   4026: ifle -> 4040
    //   4029: ldc2_w 549555065
    //   4032: l2i
    //   4033: ldc_w -2093013363
    //   4036: ixor
    //   4037: goto -> 4048
    //   4040: ldc2_w 741907519
    //   4043: l2i
    //   4044: ldc_w 2117869553
    //   4047: ixor
    //   4048: ldc2_w 1365166059
    //   4051: l2i
    //   4052: ldc_w -1543595579
    //   4055: ixor
    //   4056: ixor
    //   4057: lookupswitch default -> 4084, -211823932 -> 4040, 1365177306 -> 6314
    //   4084: goto -> 4088
    //   4087: athrow
    //   4088: invokeinterface add : (Ljava/lang/Object;)Z
    //   4093: goto -> 4097
    //   4096: athrow
    //   4097: pop
    //   4098: goto -> 4758
    //   4101: getstatic Perryc.c : I
    //   4104: iflt -> 4118
    //   4107: ldc2_w -1786551732
    //   4110: l2i
    //   4111: ldc_w -294891104
    //   4114: ixor
    //   4115: goto -> 4126
    //   4118: ldc2_w -320560941
    //   4121: l2i
    //   4122: ldc_w 1552963546
    //   4125: ixor
    //   4126: ldc2_w 1059189137
    //   4129: l2i
    //   4130: ldc_w -1563553848
    //   4133: ixor
    //   4134: ixor
    //   4135: lookupswitch default -> 4160, -436154955 -> 6196, 1043308719 -> 4118
    //   4160: aload_2
    //   4161: getstatic Perryc.c : I
    //   4164: iflt -> 4178
    //   4167: ldc2_w 920565719
    //   4170: l2i
    //   4171: ldc_w 1028043496
    //   4174: ixor
    //   4175: goto -> 4186
    //   4178: ldc2_w -521781723
    //   4181: l2i
    //   4182: ldc_w 1092408564
    //   4185: ixor
    //   4186: ldc2_w 1593462794
    //   4189: l2i
    //   4190: ldc_w -2127106814
    //   4193: ixor
    //   4194: ixor
    //   4195: lookupswitch default -> 4220, -732645321 -> 6262, -631178311 -> 4178
    //   4220: goto -> 4224
    //   4223: athrow
    //   4224: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   4227: goto -> 4231
    //   4230: athrow
    //   4231: getstatic Perryc.1 : I
    //   4234: ifeq -> 4248
    //   4237: ldc2_w 512367329
    //   4240: l2i
    //   4241: ldc_w 1304725640
    //   4244: ixor
    //   4245: goto -> 4256
    //   4248: ldc2_w -30985618
    //   4251: l2i
    //   4252: ldc_w -873839795
    //   4255: ixor
    //   4256: ldc2_w 118892592
    //   4259: l2i
    //   4260: ldc_w -801521471
    //   4263: ixor
    //   4264: ixor
    //   4265: lookupswitch default -> 4292, -2073986408 -> 6348, -247065746 -> 4248
    //   4292: goto -> 4296
    //   4295: athrow
    //   4296: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   4299: goto -> 4303
    //   4302: athrow
    //   4303: getstatic Perryc.1 : I
    //   4306: ifeq -> 4320
    //   4309: ldc2_w 916765498
    //   4312: l2i
    //   4313: ldc_w -151697577
    //   4316: ixor
    //   4317: goto -> 4328
    //   4320: ldc2_w 520743127
    //   4323: l2i
    //   4324: ldc_w -942322664
    //   4327: ixor
    //   4328: ldc2_w -705613811
    //   4331: l2i
    //   4332: ldc_w -2017857118
    //   4335: ixor
    //   4336: ixor
    //   4337: lookupswitch default -> 6250, -1969986208 -> 4364, -1843839550 -> 4320
    //   4364: goto -> 4368
    //   4367: athrow
    //   4368: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   4371: goto -> 4375
    //   4374: athrow
    //   4375: getstatic Perryc.1 : I
    //   4378: ifeq -> 4392
    //   4381: ldc2_w -907339261
    //   4384: l2i
    //   4385: ldc_w 423001716
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w -1532354135
    //   4395: l2i
    //   4396: ldc_w -514914306
    //   4399: ixor
    //   4400: ldc2_w 1561158779
    //   4403: l2i
    //   4404: ldc_w 1998617938
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 4436, -84902562 -> 6274, 2043464498 -> 4392
    //   4436: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   4439: if_acmpne -> 4453
    //   4442: ldc2_w -48278534
    //   4445: l2i
    //   4446: ldc_w -1714491236
    //   4449: ixor
    //   4450: goto -> 4461
    //   4453: ldc2_w 515502587
    //   4456: l2i
    //   4457: ldc_w 2053657244
    //   4460: ixor
    //   4461: ldc2_w 286977699
    //   4464: l2i
    //   4465: ldc_w -326031795
    //   4468: ixor
    //   4469: ixor
    //   4470: tableswitch default -> 4442, -1722127480 -> 4492, -1722127479 -> 4758
    //   4492: getstatic Perryc.0 : I
    //   4495: ifle -> 4509
    //   4498: ldc2_w 1994181549
    //   4501: l2i
    //   4502: ldc_w -1562143161
    //   4505: ixor
    //   4506: goto -> 4517
    //   4509: ldc2_w 270908892
    //   4512: l2i
    //   4513: ldc_w -593584863
    //   4516: ixor
    //   4517: ldc2_w -1292620210
    //   4520: l2i
    //   4521: ldc_w 431748190
    //   4524: ixor
    //   4525: ixor
    //   4526: lookupswitch default -> 6316, 1744108269 -> 4552, 2138081274 -> 4509
    //   4552: aload_3
    //   4553: getstatic Perryc.c : I
    //   4556: iflt -> 4570
    //   4559: ldc2_w -645914619
    //   4562: l2i
    //   4563: ldc_w 226991004
    //   4566: ixor
    //   4567: goto -> 4578
    //   4570: ldc2_w 1562218839
    //   4573: l2i
    //   4574: ldc_w 491187049
    //   4577: ixor
    //   4578: ldc2_w -782306249
    //   4581: l2i
    //   4582: ldc_w 1491234907
    //   4585: ixor
    //   4586: ixor
    //   4587: lookupswitch default -> 6266, -907542958 -> 4612, 1572552693 -> 4570
    //   4612: aload_2
    //   4613: getstatic Perryc.1 : I
    //   4616: ifeq -> 4630
    //   4619: ldc2_w 642996862
    //   4622: l2i
    //   4623: ldc_w -1309609005
    //   4626: ixor
    //   4627: goto -> 4638
    //   4630: ldc2_w -291823257
    //   4633: l2i
    //   4634: ldc_w 1938014882
    //   4637: ixor
    //   4638: ldc2_w 1259901529
    //   4641: l2i
    //   4642: ldc_w 166141494
    //   4645: ixor
    //   4646: ixor
    //   4647: lookupswitch default -> 6228, -715381310 -> 4630, -538480726 -> 4672
    //   4672: goto -> 4676
    //   4675: athrow
    //   4676: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   4679: goto -> 4683
    //   4682: athrow
    //   4683: getstatic Perryc.c : I
    //   4686: iflt -> 4700
    //   4689: ldc2_w 1636913871
    //   4692: l2i
    //   4693: ldc_w -832774011
    //   4696: ixor
    //   4697: goto -> 4708
    //   4700: ldc2_w 797815568
    //   4703: l2i
    //   4704: ldc_w 1929209462
    //   4707: ixor
    //   4708: ldc2_w -1666644669
    //   4711: l2i
    //   4712: ldc_w 103218170
    //   4715: ixor
    //   4716: ixor
    //   4717: lookupswitch default -> 6292, -939578401 -> 4744, 893537523 -> 4700
    //   4744: goto -> 4748
    //   4747: athrow
    //   4748: invokeinterface add : (Ljava/lang/Object;)Z
    //   4753: goto -> 4757
    //   4756: athrow
    //   4757: pop
    //   4758: getstatic Perryc.1 : I
    //   4761: ifeq -> 4775
    //   4764: ldc2_w 1712404524
    //   4767: l2i
    //   4768: ldc_w -885553489
    //   4771: ixor
    //   4772: goto -> 4783
    //   4775: ldc2_w -243545744
    //   4778: l2i
    //   4779: ldc_w 947914973
    //   4782: ixor
    //   4783: ldc2_w 1925283456
    //   4786: l2i
    //   4787: ldc_w -367736152
    //   4790: ixor
    //   4791: ixor
    //   4792: lookupswitch default -> 6236, 905120427 -> 4775, 1361999237 -> 4820
    //   4820: aload_2
    //   4821: getstatic Perryc.1 : I
    //   4824: ifeq -> 4838
    //   4827: ldc2_w -1482236300
    //   4830: l2i
    //   4831: ldc_w 1005329461
    //   4834: ixor
    //   4835: goto -> 4846
    //   4838: ldc2_w -1485996866
    //   4841: l2i
    //   4842: ldc_w 203426065
    //   4845: ixor
    //   4846: ldc2_w 907511816
    //   4849: l2i
    //   4850: ldc_w -140602862
    //   4853: ixor
    //   4854: ixor
    //   4855: lookupswitch default -> 6234, 1573115995 -> 4838, 1791258549 -> 4880
    //   4880: goto -> 4884
    //   4883: athrow
    //   4884: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   4887: goto -> 4891
    //   4890: athrow
    //   4891: getstatic Perryc.c : I
    //   4894: iflt -> 4908
    //   4897: ldc2_w 1976653620
    //   4900: l2i
    //   4901: ldc_w 87143484
    //   4904: ixor
    //   4905: goto -> 4916
    //   4908: ldc2_w 775058615
    //   4911: l2i
    //   4912: ldc_w 590964561
    //   4915: ixor
    //   4916: ldc2_w 88146465
    //   4919: l2i
    //   4920: ldc_w 238764906
    //   4923: ixor
    //   4924: ixor
    //   4925: lookupswitch default -> 4952, -1543282785 -> 4908, 2073731651 -> 6342
    //   4952: goto -> 4956
    //   4955: athrow
    //   4956: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   4959: goto -> 4963
    //   4962: athrow
    //   4963: getstatic Perryc.c : I
    //   4966: iflt -> 4980
    //   4969: ldc2_w 1412763627
    //   4972: l2i
    //   4973: ldc_w -1481297773
    //   4976: ixor
    //   4977: goto -> 4988
    //   4980: ldc2_w 1893155633
    //   4983: l2i
    //   4984: ldc_w 1978994636
    //   4987: ixor
    //   4988: ldc2_w -682242900
    //   4991: l2i
    //   4992: ldc_w 1259824416
    //   4995: ixor
    //   4996: ixor
    //   4997: lookupswitch default -> 6312, -1721703055 -> 5024, 1875023604 -> 4980
    //   5024: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   5027: if_acmpne -> 5041
    //   5030: ldc2_w 1175039634
    //   5033: l2i
    //   5034: ldc_w 876200533
    //   5037: ixor
    //   5038: goto -> 5049
    //   5041: ldc2_w -2063067070
    //   5044: l2i
    //   5045: ldc_w -147295102
    //   5048: ixor
    //   5049: ldc2_w -402138078
    //   5052: l2i
    //   5053: ldc_w 1494740950
    //   5056: ixor
    //   5057: ixor
    //   5058: tableswitch default -> 5030, -1021288653 -> 5080, -1021288652 -> 6122
    //   5080: getstatic Perryc.c : I
    //   5083: iflt -> 5097
    //   5086: ldc2_w 369459350
    //   5089: l2i
    //   5090: ldc_w 1299380779
    //   5093: ixor
    //   5094: goto -> 5105
    //   5097: ldc2_w -1119074430
    //   5100: l2i
    //   5101: ldc_w 1710609502
    //   5104: ixor
    //   5105: ldc2_w -861296866
    //   5108: l2i
    //   5109: ldc_w 1201158037
    //   5112: ixor
    //   5113: ixor
    //   5114: lookupswitch default -> 6330, -800658890 -> 5097, 1401422679 -> 5140
    //   5140: iload_1
    //   5141: ifeq -> 5155
    //   5144: ldc2_w 476265254
    //   5147: l2i
    //   5148: ldc_w 1144566589
    //   5151: ixor
    //   5152: goto -> 5163
    //   5155: ldc2_w -204105349
    //   5158: l2i
    //   5159: ldc_w -1416752769
    //   5162: ixor
    //   5163: ldc2_w 1141224542
    //   5166: l2i
    //   5167: ldc_w 988938026
    //   5170: ixor
    //   5171: ixor
    //   5172: tableswitch default -> 5144, 649053039 -> 5196, 649053040 -> 5465
    //   5196: getstatic Perryc.c : I
    //   5199: iflt -> 5213
    //   5202: ldc2_w -1130899797
    //   5205: l2i
    //   5206: ldc_w -363385159
    //   5209: ixor
    //   5210: goto -> 5221
    //   5213: ldc2_w -179991719
    //   5216: l2i
    //   5217: ldc_w -431312934
    //   5220: ixor
    //   5221: ldc2_w -497799626
    //   5224: l2i
    //   5225: ldc_w -1480348914
    //   5228: ixor
    //   5229: ixor
    //   5230: lookupswitch default -> 6284, 324500778 -> 5213, 1452843451 -> 5256
    //   5256: aload_3
    //   5257: getstatic Perryc.c : I
    //   5260: iflt -> 5274
    //   5263: ldc2_w -1464864107
    //   5266: l2i
    //   5267: ldc_w 14559614
    //   5270: ixor
    //   5271: goto -> 5282
    //   5274: ldc2_w -1101581299
    //   5277: l2i
    //   5278: ldc_w 1280091726
    //   5281: ixor
    //   5282: ldc2_w 279886476
    //   5285: l2i
    //   5286: ldc_w 212062854
    //   5289: ixor
    //   5290: ixor
    //   5291: lookupswitch default -> 5316, -1266895903 -> 6256, 2080820367 -> 5274
    //   5316: aload_2
    //   5317: getstatic Perryc.0 : I
    //   5320: ifle -> 5334
    //   5323: ldc2_w 1420084072
    //   5326: l2i
    //   5327: ldc_w -548027610
    //   5330: ixor
    //   5331: goto -> 5342
    //   5334: ldc2_w -694101503
    //   5337: l2i
    //   5338: ldc_w 1233282540
    //   5341: ixor
    //   5342: ldc2_w 1743489509
    //   5345: l2i
    //   5346: ldc_w -94459677
    //   5349: ixor
    //   5350: ixor
    //   5351: lookupswitch default -> 6258, 43491051 -> 5376, 373563720 -> 5334
    //   5376: goto -> 5380
    //   5379: athrow
    //   5380: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   5383: goto -> 5387
    //   5386: athrow
    //   5387: getstatic Perryc.c : I
    //   5390: iflt -> 5404
    //   5393: ldc2_w 987628308
    //   5396: l2i
    //   5397: ldc_w -909652818
    //   5400: ixor
    //   5401: goto -> 5412
    //   5404: ldc2_w -1764584501
    //   5407: l2i
    //   5408: ldc_w -2015807147
    //   5411: ixor
    //   5412: ldc2_w -420483593
    //   5415: l2i
    //   5416: ldc_w 1852640638
    //   5419: ixor
    //   5420: ixor
    //   5421: lookupswitch default -> 5448, 273119115 -> 5404, 2073767731 -> 6202
    //   5448: goto -> 5452
    //   5451: athrow
    //   5452: invokeinterface add : (Ljava/lang/Object;)Z
    //   5457: goto -> 5461
    //   5460: athrow
    //   5461: pop
    //   5462: goto -> 6122
    //   5465: getstatic Perryc.c : I
    //   5468: iflt -> 5482
    //   5471: ldc2_w 1506359078
    //   5474: l2i
    //   5475: ldc_w -478474596
    //   5478: ixor
    //   5479: goto -> 5490
    //   5482: ldc2_w -547813240
    //   5485: l2i
    //   5486: ldc_w -641709810
    //   5489: ixor
    //   5490: ldc2_w -1607211399
    //   5493: l2i
    //   5494: ldc_w 180506469
    //   5497: ixor
    //   5498: ixor
    //   5499: lookupswitch default -> 5524, -473529541 -> 5482, 272863398 -> 6318
    //   5524: aload_2
    //   5525: getstatic Perryc.c : I
    //   5528: iflt -> 5542
    //   5531: ldc2_w 460811060
    //   5534: l2i
    //   5535: ldc_w 1548334399
    //   5538: ixor
    //   5539: goto -> 5550
    //   5542: ldc2_w -646373616
    //   5545: l2i
    //   5546: ldc_w 1506240634
    //   5549: ixor
    //   5550: ldc2_w 509485251
    //   5553: l2i
    //   5554: ldc_w -775391928
    //   5557: ixor
    //   5558: ixor
    //   5559: lookupswitch default -> 6198, -2002220160 -> 5542, 1328030433 -> 5584
    //   5584: goto -> 5588
    //   5587: athrow
    //   5588: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   5591: goto -> 5595
    //   5594: athrow
    //   5595: getstatic Perryc.0 : I
    //   5598: ifle -> 5612
    //   5601: ldc2_w 276247248
    //   5604: l2i
    //   5605: ldc_w -1494866356
    //   5608: ixor
    //   5609: goto -> 5620
    //   5612: ldc2_w 999217902
    //   5615: l2i
    //   5616: ldc_w 1982927026
    //   5619: ixor
    //   5620: ldc2_w 1833115905
    //   5623: l2i
    //   5624: ldc_w -259622062
    //   5627: ixor
    //   5628: ixor
    //   5629: lookupswitch default -> 5656, -1344773409 -> 5612, 726945487 -> 6188
    //   5656: goto -> 5660
    //   5659: athrow
    //   5660: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   5663: goto -> 5667
    //   5666: athrow
    //   5667: getstatic Perryc.0 : I
    //   5670: ifle -> 5684
    //   5673: ldc2_w -470240607
    //   5676: l2i
    //   5677: ldc_w 1611563634
    //   5680: ixor
    //   5681: goto -> 5692
    //   5684: ldc2_w 1791622998
    //   5687: l2i
    //   5688: ldc_w -1389556310
    //   5691: ixor
    //   5692: ldc2_w -466675174
    //   5695: l2i
    //   5696: ldc_w -210080915
    //   5699: ixor
    //   5700: ixor
    //   5701: lookupswitch default -> 5728, -1801240156 -> 6310, 1700002987 -> 5684
    //   5728: goto -> 5732
    //   5731: athrow
    //   5732: invokestatic getBlockResistance : (Lnet/minecraft/util/math/BlockPos;)Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   5735: goto -> 5739
    //   5738: athrow
    //   5739: getstatic Perryc.c : I
    //   5742: iflt -> 5756
    //   5745: ldc2_w 1198185380
    //   5748: l2i
    //   5749: ldc_w 713969440
    //   5752: ixor
    //   5753: goto -> 5764
    //   5756: ldc2_w -1138430187
    //   5759: l2i
    //   5760: ldc_w -452356120
    //   5763: ixor
    //   5764: ldc2_w -111578936
    //   5767: l2i
    //   5768: ldc_w -1030691835
    //   5771: ixor
    //   5772: ixor
    //   5773: lookupswitch default -> 6306, 1445789769 -> 5756, 1659169840 -> 5800
    //   5800: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   5803: if_acmpne -> 5817
    //   5806: ldc2_w -1500276214
    //   5809: l2i
    //   5810: ldc_w 342501852
    //   5813: ixor
    //   5814: goto -> 5825
    //   5817: ldc2_w 1028194507
    //   5820: l2i
    //   5821: ldc_w -1884245230
    //   5824: ixor
    //   5825: ldc2_w -319105585
    //   5828: l2i
    //   5829: ldc_w -95306914
    //   5832: ixor
    //   5833: ixor
    //   5834: tableswitch default -> 5806, -1538073273 -> 5856, -1538073272 -> 6122
    //   5856: getstatic Perryc.c : I
    //   5859: iflt -> 5873
    //   5862: ldc2_w 574020544
    //   5865: l2i
    //   5866: ldc_w -1712899175
    //   5869: ixor
    //   5870: goto -> 5881
    //   5873: ldc2_w 1591842525
    //   5876: l2i
    //   5877: ldc_w 1138281165
    //   5880: ixor
    //   5881: ldc2_w -163599580
    //   5884: l2i
    //   5885: ldc_w 1464771530
    //   5888: ixor
    //   5889: ixor
    //   5890: lookupswitch default -> 5916, 446752951 -> 6340, 2016113855 -> 5873
    //   5916: aload_3
    //   5917: getstatic Perryc.c : I
    //   5920: iflt -> 5934
    //   5923: ldc2_w -1145517579
    //   5926: l2i
    //   5927: ldc_w 1775424581
    //   5930: ixor
    //   5931: goto -> 5942
    //   5934: ldc2_w 44390884
    //   5937: l2i
    //   5938: ldc_w -1711222857
    //   5941: ixor
    //   5942: ldc2_w 1134322848
    //   5945: l2i
    //   5946: ldc_w -253380795
    //   5949: ixor
    //   5950: ixor
    //   5951: lookupswitch default -> 6224, 735856054 -> 5976, 1628687957 -> 5934
    //   5976: aload_2
    //   5977: getstatic Perryc.0 : I
    //   5980: ifle -> 5994
    //   5983: ldc2_w -2114222096
    //   5986: l2i
    //   5987: ldc_w -650735635
    //   5990: ixor
    //   5991: goto -> 6002
    //   5994: ldc2_w -1900985634
    //   5997: l2i
    //   5998: ldc_w -1412647907
    //   6001: ixor
    //   6002: ldc2_w 1363173950
    //   6005: l2i
    //   6006: ldc_w 2052867609
    //   6009: ixor
    //   6010: ixor
    //   6011: lookupswitch default -> 6216, 241292004 -> 6036, 1943088186 -> 5994
    //   6036: goto -> 6040
    //   6039: athrow
    //   6040: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   6043: goto -> 6047
    //   6046: athrow
    //   6047: getstatic Perryc.1 : I
    //   6050: ifeq -> 6064
    //   6053: ldc2_w 1606181760
    //   6056: l2i
    //   6057: ldc_w -1507353013
    //   6060: ixor
    //   6061: goto -> 6072
    //   6064: ldc2_w -625891451
    //   6067: l2i
    //   6068: ldc_w -1285449285
    //   6071: ixor
    //   6072: ldc2_w 689861129
    //   6075: l2i
    //   6076: ldc_w 2103344154
    //   6079: ixor
    //   6080: ixor
    //   6081: lookupswitch default -> 6108, -1378094120 -> 6244, -1272951523 -> 6064
    //   6108: goto -> 6112
    //   6111: athrow
    //   6112: invokeinterface add : (Ljava/lang/Object;)Z
    //   6117: goto -> 6121
    //   6120: athrow
    //   6121: pop
    //   6122: getstatic Perryc.0 : I
    //   6125: ifle -> 6139
    //   6128: ldc2_w -1079080113
    //   6131: l2i
    //   6132: ldc_w 174908728
    //   6135: ixor
    //   6136: goto -> 6147
    //   6139: ldc2_w 1408914026
    //   6142: l2i
    //   6143: ldc_w -1123304610
    //   6146: ixor
    //   6147: ldc2_w 1249212850
    //   6150: l2i
    //   6151: ldc_w 605159432
    //   6154: ixor
    //   6155: ixor
    //   6156: lookupswitch default -> 6184, -609937459 -> 6322, 1522051666 -> 6139
    //   6184: aload_3
    //   6185: areturn
    //   6186: aconst_null
    //   6187: athrow
    //   6188: aconst_null
    //   6189: athrow
    //   6190: aconst_null
    //   6191: athrow
    //   6192: aconst_null
    //   6193: athrow
    //   6194: aconst_null
    //   6195: athrow
    //   6196: aconst_null
    //   6197: athrow
    //   6198: aconst_null
    //   6199: athrow
    //   6200: aconst_null
    //   6201: athrow
    //   6202: aconst_null
    //   6203: athrow
    //   6204: aconst_null
    //   6205: athrow
    //   6206: aconst_null
    //   6207: athrow
    //   6208: aconst_null
    //   6209: athrow
    //   6210: aconst_null
    //   6211: athrow
    //   6212: aconst_null
    //   6213: athrow
    //   6214: aconst_null
    //   6215: athrow
    //   6216: aconst_null
    //   6217: athrow
    //   6218: aconst_null
    //   6219: athrow
    //   6220: aconst_null
    //   6221: athrow
    //   6222: aconst_null
    //   6223: athrow
    //   6224: aconst_null
    //   6225: athrow
    //   6226: aconst_null
    //   6227: athrow
    //   6228: aconst_null
    //   6229: athrow
    //   6230: aconst_null
    //   6231: athrow
    //   6232: aconst_null
    //   6233: athrow
    //   6234: aconst_null
    //   6235: athrow
    //   6236: aconst_null
    //   6237: athrow
    //   6238: aconst_null
    //   6239: athrow
    //   6240: aconst_null
    //   6241: athrow
    //   6242: aconst_null
    //   6243: athrow
    //   6244: aconst_null
    //   6245: athrow
    //   6246: aconst_null
    //   6247: athrow
    //   6248: aconst_null
    //   6249: athrow
    //   6250: aconst_null
    //   6251: athrow
    //   6252: aconst_null
    //   6253: athrow
    //   6254: aconst_null
    //   6255: athrow
    //   6256: aconst_null
    //   6257: athrow
    //   6258: aconst_null
    //   6259: athrow
    //   6260: aconst_null
    //   6261: athrow
    //   6262: aconst_null
    //   6263: athrow
    //   6264: aconst_null
    //   6265: athrow
    //   6266: aconst_null
    //   6267: athrow
    //   6268: aconst_null
    //   6269: athrow
    //   6270: aconst_null
    //   6271: athrow
    //   6272: aconst_null
    //   6273: athrow
    //   6274: aconst_null
    //   6275: athrow
    //   6276: aconst_null
    //   6277: athrow
    //   6278: aconst_null
    //   6279: athrow
    //   6280: aconst_null
    //   6281: athrow
    //   6282: aconst_null
    //   6283: athrow
    //   6284: aconst_null
    //   6285: athrow
    //   6286: aconst_null
    //   6287: athrow
    //   6288: aconst_null
    //   6289: athrow
    //   6290: aconst_null
    //   6291: athrow
    //   6292: aconst_null
    //   6293: athrow
    //   6294: aconst_null
    //   6295: athrow
    //   6296: aconst_null
    //   6297: athrow
    //   6298: aconst_null
    //   6299: athrow
    //   6300: aconst_null
    //   6301: athrow
    //   6302: aconst_null
    //   6303: athrow
    //   6304: aconst_null
    //   6305: athrow
    //   6306: aconst_null
    //   6307: athrow
    //   6308: aconst_null
    //   6309: athrow
    //   6310: aconst_null
    //   6311: athrow
    //   6312: aconst_null
    //   6313: athrow
    //   6314: aconst_null
    //   6315: athrow
    //   6316: aconst_null
    //   6317: athrow
    //   6318: aconst_null
    //   6319: athrow
    //   6320: aconst_null
    //   6321: athrow
    //   6322: aconst_null
    //   6323: athrow
    //   6324: aconst_null
    //   6325: athrow
    //   6326: aconst_null
    //   6327: athrow
    //   6328: aconst_null
    //   6329: athrow
    //   6330: aconst_null
    //   6331: athrow
    //   6332: aconst_null
    //   6333: athrow
    //   6334: aconst_null
    //   6335: athrow
    //   6336: aconst_null
    //   6337: athrow
    //   6338: aconst_null
    //   6339: athrow
    //   6340: aconst_null
    //   6341: athrow
    //   6342: aconst_null
    //   6343: athrow
    //   6344: aconst_null
    //   6345: athrow
    //   6346: aconst_null
    //   6347: athrow
    //   6348: aconst_null
    //   6349: athrow
    //   6350: aconst_null
    //   6351: athrow
    //   6352: pop
    //   6353: goto -> 24
    //   6356: pop
    //   6357: aconst_null
    //   6358: goto -> 6352
    //   6361: dup
    //   6362: ifnull -> 6352
    //   6365: checkcast java/lang/Throwable
    //   6368: athrow
    //   6369: dup
    //   6370: ifnull -> 6356
    //   6373: checkcast java/lang/Throwable
    //   6376: athrow
    //   6377: aconst_null
    //   6378: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	6162	0	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	6162	1	crystal	Z
    //   533	5653	2	playerPos	Lnet/minecraft/util/math/BlockPos;
    //   669	5517	3	cityBlocks	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   669	5517	3	cityBlocks	Ljava/util/List<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	6361	finally
    //   464	470	470	finally
    //   464	470	470	finally
    //   464	470	470	java/lang/NumberFormatException
    //   464	470	3	finally
    //   464	470	470	finally
    //   600	606	606	finally
    //   600	606	3	finally
    //   600	606	3	java/util/NoSuchElementException
    //   600	606	3	finally
    //   600	606	606	java/util/NoSuchElementException
    //   791	798	798	finally
    //   791	798	3	java/lang/NegativeArraySizeException
    //   791	798	798	finally
    //   792	798	791	java/lang/ArrayIndexOutOfBoundsException
    //   792	798	3	finally
    //   863	870	870	finally
    //   863	870	863	java/lang/AssertionError
    //   863	870	863	finally
    //   864	870	870	java/util/ConcurrentModificationException
    //   864	870	3	java/lang/StringIndexOutOfBoundsException
    //   1288	1294	1294	finally
    //   1288	1294	1294	finally
    //   1288	1294	3	finally
    //   1288	1294	1294	finally
    //   1288	1294	3	java/lang/IllegalArgumentException
    //   1359	1368	1368	finally
    //   1359	1368	1359	finally
    //   1359	1368	1359	java/lang/IllegalStateException
    //   1360	1368	1368	finally
    //   1360	1368	1368	finally
    //   1495	1502	1502	finally
    //   1495	1502	1495	java/lang/UnsupportedOperationException
    //   1495	1502	1495	java/lang/RuntimeException
    //   1495	1502	3	java/lang/IllegalArgumentException
    //   1496	1502	1495	java/lang/StringIndexOutOfBoundsException
    //   1568	1574	1574	finally
    //   1568	1574	1574	java/lang/AssertionError
    //   1568	1574	3	java/lang/ArithmeticException
    //   1568	1574	1574	java/lang/StringIndexOutOfBoundsException
    //   1568	1574	1574	finally
    //   1639	1646	1646	finally
    //   1639	1646	3	java/util/ConcurrentModificationException
    //   1639	1646	3	java/util/ConcurrentModificationException
    //   1639	1646	1639	java/lang/AssertionError
    //   1640	1646	3	finally
    //   1947	1954	1954	finally
    //   1947	1954	3	java/lang/NumberFormatException
    //   1947	1954	3	java/lang/ArithmeticException
    //   1948	1954	3	java/util/NoSuchElementException
    //   1948	1954	1947	finally
    //   2019	2028	2028	finally
    //   2019	2028	2019	finally
    //   2019	2028	2019	finally
    //   2019	2028	2028	finally
    //   2020	2028	2019	finally
    //   2155	2162	2162	finally
    //   2155	2162	2162	finally
    //   2156	2162	3	finally
    //   2156	2162	2155	java/lang/AssertionError
    //   2156	2162	3	java/lang/NullPointerException
    //   2227	2234	2234	finally
    //   2227	2234	3	finally
    //   2227	2234	2234	java/lang/IllegalArgumentException
    //   2228	2234	2227	java/lang/ArithmeticException
    //   2228	2234	3	finally
    //   2651	2658	2658	finally
    //   2651	2658	3	java/lang/NegativeArraySizeException
    //   2651	2658	2651	finally
    //   2651	2658	3	java/lang/RuntimeException
    //   2652	2658	2651	java/lang/IllegalArgumentException
    //   2723	2732	2732	finally
    //   2723	2732	3	finally
    //   2723	2732	2723	java/lang/NullPointerException
    //   2723	2732	2732	finally
    //   2724	2732	3	finally
    //   2859	2866	2866	finally
    //   2859	2866	2859	java/util/NoSuchElementException
    //   2859	2866	2859	java/lang/ArrayIndexOutOfBoundsException
    //   2859	2866	2866	finally
    //   2860	2866	2866	finally
    //   2932	2938	2938	finally
    //   2932	2938	2938	java/lang/UnsupportedOperationException
    //   2932	2938	3	java/lang/NullPointerException
    //   2932	2938	2938	java/util/ConcurrentModificationException
    //   2932	2938	3	finally
    //   3003	3010	3010	finally
    //   3003	3010	3003	java/lang/UnsupportedOperationException
    //   3003	3010	3010	finally
    //   3003	3010	3010	java/lang/ArrayIndexOutOfBoundsException
    //   3004	3010	3	java/lang/StringIndexOutOfBoundsException
    //   3312	3318	3318	finally
    //   3312	3318	3318	java/util/NoSuchElementException
    //   3312	3318	3	finally
    //   3312	3318	3	finally
    //   3312	3318	3	java/lang/StringIndexOutOfBoundsException
    //   3384	3392	3392	finally
    //   3384	3392	3	java/util/NoSuchElementException
    //   3384	3392	3	java/lang/RuntimeException
    //   3384	3392	3	java/lang/IllegalStateException
    //   3384	3392	3392	finally
    //   3519	3526	3526	finally
    //   3519	3526	3526	java/lang/IllegalStateException
    //   3519	3526	3519	finally
    //   3519	3526	3526	java/util/ConcurrentModificationException
    //   3520	3526	3526	finally
    //   3591	3598	3598	finally
    //   3592	3598	3591	java/lang/EnumConstantNotPresentException
    //   3592	3598	3598	java/lang/NumberFormatException
    //   3592	3598	3591	java/util/ConcurrentModificationException
    //   3592	3598	3591	finally
    //   4015	4022	4022	finally
    //   4015	4022	4015	java/lang/ArrayIndexOutOfBoundsException
    //   4015	4022	4022	finally
    //   4015	4022	4015	java/lang/NullPointerException
    //   4016	4022	4015	finally
    //   4087	4096	4096	finally
    //   4087	4096	4087	java/lang/UnsupportedOperationException
    //   4088	4096	4096	java/util/ConcurrentModificationException
    //   4088	4096	4087	finally
    //   4088	4096	3	java/util/ConcurrentModificationException
    //   4223	4230	4230	finally
    //   4223	4230	4230	java/lang/NegativeArraySizeException
    //   4224	4230	4223	finally
    //   4224	4230	4230	java/lang/IndexOutOfBoundsException
    //   4224	4230	4230	java/util/NoSuchElementException
    //   4296	4302	4302	finally
    //   4296	4302	3	java/lang/EnumConstantNotPresentException
    //   4296	4302	4302	java/lang/NegativeArraySizeException
    //   4296	4302	4302	finally
    //   4296	4302	3	finally
    //   4367	4374	4374	finally
    //   4367	4374	4367	finally
    //   4367	4374	3	java/lang/ClassCastException
    //   4367	4374	4374	java/lang/NullPointerException
    //   4368	4374	4374	java/lang/NullPointerException
    //   4675	4682	4682	finally
    //   4675	4682	3	java/lang/NumberFormatException
    //   4676	4682	3	finally
    //   4676	4682	4682	finally
    //   4676	4682	4675	finally
    //   4747	4756	4756	finally
    //   4747	4756	4747	java/util/ConcurrentModificationException
    //   4748	4756	4756	finally
    //   4748	4756	4756	finally
    //   4748	4756	4747	finally
    //   4883	4890	4890	finally
    //   4883	4890	4890	finally
    //   4883	4890	4883	java/lang/IllegalStateException
    //   4884	4890	4883	finally
    //   4884	4890	4890	finally
    //   4955	4962	4962	finally
    //   4955	4962	3	java/lang/UnsupportedOperationException
    //   4955	4962	4955	java/lang/IndexOutOfBoundsException
    //   4956	4962	3	java/util/ConcurrentModificationException
    //   4956	4962	4955	finally
    //   5379	5386	5386	finally
    //   5379	5386	5386	java/lang/RuntimeException
    //   5379	5386	3	finally
    //   5380	5386	5379	java/lang/UnsupportedOperationException
    //   5380	5386	5379	finally
    //   5451	5460	5460	finally
    //   5451	5460	5451	java/lang/ClassCastException
    //   5451	5460	5451	finally
    //   5452	5460	5460	finally
    //   5452	5460	5460	finally
    //   5588	5594	5594	finally
    //   5588	5594	5594	finally
    //   5588	5594	5594	java/lang/IndexOutOfBoundsException
    //   5588	5594	3	java/lang/ArrayIndexOutOfBoundsException
    //   5588	5594	3	finally
    //   5660	5666	5666	finally
    //   5660	5666	5666	java/lang/IndexOutOfBoundsException
    //   5660	5666	5666	finally
    //   5660	5666	3	java/lang/UnsupportedOperationException
    //   5660	5666	5666	finally
    //   5731	5738	5738	finally
    //   5731	5738	5731	java/lang/NullPointerException
    //   5731	5738	5731	java/util/ConcurrentModificationException
    //   5731	5738	3	finally
    //   5732	5738	3	finally
    //   6039	6046	6046	finally
    //   6039	6046	3	finally
    //   6040	6046	3	java/lang/EnumConstantNotPresentException
    //   6040	6046	6046	finally
    //   6040	6046	6039	java/lang/EnumConstantNotPresentException
    //   6112	6120	6120	finally
    //   6112	6120	6120	finally
    //   6112	6120	6120	java/util/ConcurrentModificationException
    //   6112	6120	3	java/lang/ArrayIndexOutOfBoundsException
    //   6112	6120	3	finally
    //   6361	6369	6361	java/lang/ClassCastException
    //   6377	6379	3	java/lang/NegativeArraySizeException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void lambda$null$1(BlockPos paramBlockPos) {
    Perry1.61(this, (int)152243481L ^ 0x5B9EE4CD, paramBlockPos);
  }
  
  public CityEsp() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -1980908520
    //   9: l2i
    //   10: ldc_w -949951895
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -247868710
    //   20: l2i
    //   21: ldc_w -699605988
    //   24: ixor
    //   25: ldc2_w 932275845
    //   28: l2i
    //   29: ldc_w -614061893
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 4850, -1569058737 -> 17, -880656136 -> 60
    //   60: aload_0
    //   61: ldc_w '袯㌚裲㶮㟎昃้'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w -756904463
    //   73: l2i
    //   74: ldc_w 265643121
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1018476081
    //   84: l2i
    //   85: ldc_w -666268337
    //   88: ixor
    //   89: ldc2_w -1630091227
    //   92: l2i
    //   93: ldc_w 204631382
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1408377766 -> 81, 1339247859 -> 4890
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '袄㌒裮㶶㞫昳๶蹠'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w -1513085208
    //   139: l2i
    //   140: ldc_w 354565031
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 880183170
    //   150: l2i
    //   151: ldc_w 519315386
    //   154: ixor
    //   155: ldc2_w -1702004186
    //   158: l2i
    //   159: ldc_w -1493140598
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1921049373 -> 4806, 1618743289 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 212
    //   201: ldc2_w 823022676
    //   204: l2i
    //   205: ldc_w -294018765
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -327435025
    //   215: l2i
    //   216: ldc_w 1555754204
    //   219: ixor
    //   220: ldc2_w 1179749824
    //   223: l2i
    //   224: ldc_w 650182277
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 4792, -1075411422 -> 212, -800054410 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -2031956547
    //   262: l2i
    //   263: ldc_w -2031956548
    //   266: ixor
    //   267: ldc2_w -1995437400
    //   270: l2i
    //   271: ldc_w -1995437400
    //   274: ixor
    //   275: ldc2_w 1619461335
    //   278: l2i
    //   279: ldc_w 1619461335
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -1889437726
    //   292: l2i
    //   293: ldc_w -1137063029
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1274009377
    //   303: l2i
    //   304: ldc_w 2140251446
    //   307: ixor
    //   308: ldc2_w -301806942
    //   311: l2i
    //   312: ldc_w 1208735748
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 4834, -1789808945 -> 300, 1837670223 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w 1738941964
    //   356: l2i
    //   357: ldc_w 297484950
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 924469190
    //   367: l2i
    //   368: ldc_w -148041552
    //   371: ixor
    //   372: ldc2_w -180315196
    //   375: l2i
    //   376: ldc_w 2071841905
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 4878, -132107473 -> 364, 1309278403 -> 408
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w -2058405867
    //   418: l2i
    //   419: ldc_w 1246626463
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -1339322134
    //   429: l2i
    //   430: ldc_w -381101200
    //   433: ixor
    //   434: ldc2_w -983811483
    //   437: l2i
    //   438: ldc_w 1507053476
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 4818, -974340517 -> 468, 1401868107 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '袾㌒裨㶰㟮'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w -588144015
    //   485: l2i
    //   486: ldc_w 2055507978
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1275671969
    //   496: l2i
    //   497: ldc_w 1014501688
    //   500: ixor
    //   501: ldc2_w 101686523
    //   504: l2i
    //   505: ldc_w -715642842
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -455552352 -> 493, 1965196966 -> 4846
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1426924992
    //   542: l2i
    //   543: ldc_w 1426925004
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 2054782452
    //   556: l2i
    //   557: ldc_w 1032586554
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -487812017
    //   567: l2i
    //   568: ldc_w 1462497748
    //   571: ixor
    //   572: ldc2_w 1538666711
    //   575: l2i
    //   576: ldc_w 763879587
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, 834971834 -> 4772, 985413211 -> 564
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w 1235054288
    //   614: l2i
    //   615: ldc_w 1235054288
    //   618: ixor
    //   619: getstatic Perryc.1 : I
    //   622: ifeq -> 636
    //   625: ldc2_w -646686577
    //   628: l2i
    //   629: ldc_w -1761646521
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 1139421120
    //   639: l2i
    //   640: ldc_w 1889408613
    //   643: ixor
    //   644: ldc2_w 1309080760
    //   647: l2i
    //   648: ldc_w 2045121596
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 4860, 76861729 -> 680, 2020333644 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w 419256710
    //   686: l2i
    //   687: ldc_w 419256490
    //   690: ixor
    //   691: getstatic Perryc.c : I
    //   694: iflt -> 708
    //   697: ldc2_w 943009559
    //   700: l2i
    //   701: ldc_w -2077543137
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 367510881
    //   711: l2i
    //   712: ldc_w -949501206
    //   715: ixor
    //   716: ldc2_w 365669385
    //   719: l2i
    //   720: ldc_w 124128607
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -1363952802 -> 4764, -1343238959 -> 708
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w -71002597
    //   764: l2i
    //   765: ldc_w -1231676089
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 596117658
    //   775: l2i
    //   776: ldc_w 764051827
    //   779: ixor
    //   780: ldc2_w 830066647
    //   783: l2i
    //   784: ldc_w -1895485933
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 4802, -1333893075 -> 816, -215061864 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w -1073460643
    //   828: l2i
    //   829: ldc_w 534241602
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 2101164428
    //   839: l2i
    //   840: ldc_w -1766857165
    //   843: ixor
    //   844: ldc2_w -1648044922
    //   847: l2i
    //   848: ldc_w -739390009
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -1845841314 -> 4828, 677535324 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w 1823971238
    //   892: l2i
    //   893: ldc_w -1239768664
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -1700560438
    //   903: l2i
    //   904: ldc_w 619748024
    //   907: ixor
    //   908: ldc2_w -2103113084
    //   911: l2i
    //   912: ldc_w -1498988401
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, -2016749049 -> 900, -22053883 -> 4786
    //   944: putfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.1 : I
    //   950: ifeq -> 964
    //   953: ldc2_w 2066148305
    //   956: l2i
    //   957: ldc_w -2085359993
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 863529142
    //   967: l2i
    //   968: ldc_w -95146734
    //   971: ixor
    //   972: ldc2_w 1547784945
    //   975: l2i
    //   976: ldc_w 1583053739
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -91280372 -> 4836, 268658315 -> 964
    //   1008: aload_0
    //   1009: getstatic Perryc.1 : I
    //   1012: ifeq -> 1026
    //   1015: ldc2_w 1743429770
    //   1018: l2i
    //   1019: ldc_w 1565155465
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 1635223647
    //   1029: l2i
    //   1030: ldc_w -1358286081
    //   1033: ixor
    //   1034: ldc2_w -1243119478
    //   1037: l2i
    //   1038: ldc_w 321025845
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1068, -1671088196 -> 4776, -1088145655 -> 1026
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '袠㌚裨㶲㟜昹๽蹫'
    //   1076: getstatic Perryc.1 : I
    //   1079: ifeq -> 1093
    //   1082: ldc2_w -424982172
    //   1085: l2i
    //   1086: ldc_w -125611514
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w -1760082768
    //   1096: l2i
    //   1097: ldc_w 911664311
    //   1100: ixor
    //   1101: ldc2_w -859707329
    //   1104: l2i
    //   1105: ldc_w -1477997736
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, 1963882501 -> 4754, 2098158937 -> 1093
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc_w 8.249896
    //   1142: invokestatic floatToIntBits : (F)I
    //   1145: ldc_w 2126774163
    //   1148: ixor
    //   1149: invokestatic intBitsToFloat : (I)F
    //   1152: getstatic Perryc.0 : I
    //   1155: ifle -> 1169
    //   1158: ldc2_w -978126078
    //   1161: l2i
    //   1162: ldc_w 779232610
    //   1165: ixor
    //   1166: goto -> 1177
    //   1169: ldc2_w 1730434159
    //   1172: l2i
    //   1173: ldc_w 647179102
    //   1176: ixor
    //   1177: ldc2_w 1539614222
    //   1180: l2i
    //   1181: ldc_w -295526613
    //   1184: ixor
    //   1185: ixor
    //   1186: lookupswitch default -> 4870, -200194540 -> 1212, 1583802181 -> 1169
    //   1212: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1215: ldc_w 123.2782
    //   1218: invokestatic floatToIntBits : (F)I
    //   1221: ldc_w 2134524605
    //   1224: ixor
    //   1225: invokestatic intBitsToFloat : (I)F
    //   1228: getstatic Perryc.c : I
    //   1231: iflt -> 1245
    //   1234: ldc2_w 1268666543
    //   1237: l2i
    //   1238: ldc_w -703218221
    //   1241: ixor
    //   1242: goto -> 1253
    //   1245: ldc2_w 186530179
    //   1248: l2i
    //   1249: ldc_w 425643674
    //   1252: ixor
    //   1253: ldc2_w -829792864
    //   1256: l2i
    //   1257: ldc_w -308129028
    //   1260: ixor
    //   1261: ixor
    //   1262: lookupswitch default -> 1288, -1096556000 -> 4808, -570059730 -> 1245
    //   1288: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1291: ldc_w 1.3203698
    //   1294: invokestatic floatToIntBits : (F)I
    //   1297: ldc_w 2131296737
    //   1300: ixor
    //   1301: invokestatic intBitsToFloat : (I)F
    //   1304: getstatic Perryc.c : I
    //   1307: iflt -> 1321
    //   1310: ldc2_w -981667754
    //   1313: l2i
    //   1314: ldc_w -2005867409
    //   1317: ixor
    //   1318: goto -> 1329
    //   1321: ldc2_w -1281120084
    //   1324: l2i
    //   1325: ldc_w 1908161796
    //   1328: ixor
    //   1329: ldc2_w -451207023
    //   1332: l2i
    //   1333: ldc_w -731892526
    //   1336: ixor
    //   1337: ixor
    //   1338: lookupswitch default -> 4756, -211516949 -> 1364, 2088173690 -> 1321
    //   1364: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1367: getstatic Perryc.0 : I
    //   1370: ifle -> 1384
    //   1373: ldc2_w 333461366
    //   1376: l2i
    //   1377: ldc_w -1032380637
    //   1380: ixor
    //   1381: goto -> 1392
    //   1384: ldc2_w -531368448
    //   1387: l2i
    //   1388: ldc_w 1897740316
    //   1391: ixor
    //   1392: ldc2_w 1230486950
    //   1395: l2i
    //   1396: ldc_w -1537743304
    //   1399: ixor
    //   1400: ixor
    //   1401: lookupswitch default -> 4838, 1016558539 -> 1384, 2085524866 -> 1428
    //   1428: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1431: getstatic Perryc.1 : I
    //   1434: ifeq -> 1448
    //   1437: ldc2_w 2071589110
    //   1440: l2i
    //   1441: ldc_w 822767630
    //   1444: ixor
    //   1445: goto -> 1456
    //   1448: ldc2_w -1746218174
    //   1451: l2i
    //   1452: ldc_w -1493217881
    //   1455: ixor
    //   1456: ldc2_w 2073799870
    //   1459: l2i
    //   1460: ldc_w 269571832
    //   1463: ixor
    //   1464: ixor
    //   1465: lookupswitch default -> 4884, 569998014 -> 1448, 1520395427 -> 1492
    //   1492: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1495: getstatic Perryc.0 : I
    //   1498: ifle -> 1512
    //   1501: ldc2_w 1090940594
    //   1504: l2i
    //   1505: ldc_w -1071799722
    //   1508: ixor
    //   1509: goto -> 1520
    //   1512: ldc2_w 273989871
    //   1515: l2i
    //   1516: ldc_w -1423767336
    //   1519: ixor
    //   1520: ldc2_w 1967074808
    //   1523: l2i
    //   1524: ldc_w 1025569375
    //   1527: ixor
    //   1528: ixor
    //   1529: lookupswitch default -> 1556, -922479805 -> 4760, 1566812213 -> 1512
    //   1556: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1559: getstatic Perryc.1 : I
    //   1562: ifeq -> 1576
    //   1565: ldc2_w -759850621
    //   1568: l2i
    //   1569: ldc_w -1469118684
    //   1572: ixor
    //   1573: goto -> 1584
    //   1576: ldc2_w -2007525392
    //   1579: l2i
    //   1580: ldc_w 2105854304
    //   1583: ixor
    //   1584: ldc2_w -1566650530
    //   1587: l2i
    //   1588: ldc_w 1749470064
    //   1591: ixor
    //   1592: ixor
    //   1593: lookupswitch default -> 1620, -1342006647 -> 4770, 1564058995 -> 1576
    //   1620: aload_0
    //   1621: getstatic Perryc.c : I
    //   1624: iflt -> 1638
    //   1627: ldc2_w 478600435
    //   1630: l2i
    //   1631: ldc_w -332384738
    //   1634: ixor
    //   1635: goto -> 1646
    //   1638: ldc2_w 528862449
    //   1641: l2i
    //   1642: ldc_w 294731359
    //   1645: ixor
    //   1646: ldc2_w -423082807
    //   1649: l2i
    //   1650: ldc_w 1849333203
    //   1653: ixor
    //   1654: ixor
    //   1655: lookupswitch default -> 4848, -2031737932 -> 1680, 2017737719 -> 1638
    //   1680: aload_0
    //   1681: new bigname/zprestige/webhack/features/setting/Setting
    //   1684: dup
    //   1685: ldc_w '袾㌖裢'
    //   1688: getstatic Perryc.c : I
    //   1691: iflt -> 1705
    //   1694: ldc2_w -1677991943
    //   1697: l2i
    //   1698: ldc_w 231048066
    //   1701: ixor
    //   1702: goto -> 1713
    //   1705: ldc2_w -978966883
    //   1708: l2i
    //   1709: ldc_w 391087250
    //   1712: ixor
    //   1713: ldc2_w -989905222
    //   1716: l2i
    //   1717: ldc_w 1360819035
    //   1720: ixor
    //   1721: ixor
    //   1722: lookupswitch default -> 1748, -1877365362 -> 1705, 64819610 -> 4766
    //   1748: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1751: ldc2_w 407516298
    //   1754: l2i
    //   1755: ldc_w 407516298
    //   1758: ixor
    //   1759: getstatic Perryc.c : I
    //   1762: iflt -> 1776
    //   1765: ldc2_w 1703565560
    //   1768: l2i
    //   1769: ldc_w 538000915
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w 238284242
    //   1779: l2i
    //   1780: ldc_w -1333055231
    //   1783: ixor
    //   1784: ldc2_w -2013228733
    //   1787: l2i
    //   1788: ldc_w 1539880741
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 4780, -1772928883 -> 1776, 1836120757 -> 1820
    //   1820: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1823: ldc2_w 732645042
    //   1826: l2i
    //   1827: ldc_w 732645042
    //   1830: ixor
    //   1831: getstatic Perryc.0 : I
    //   1834: ifle -> 1848
    //   1837: ldc2_w -1812947175
    //   1840: l2i
    //   1841: ldc_w -1606762089
    //   1844: ixor
    //   1845: goto -> 1856
    //   1848: ldc2_w 236781211
    //   1851: l2i
    //   1852: ldc_w -1717292537
    //   1855: ixor
    //   1856: ldc2_w -1929130513
    //   1859: l2i
    //   1860: ldc_w 1332113720
    //   1863: ixor
    //   1864: ixor
    //   1865: lookupswitch default -> 1892, -240131495 -> 4852, 667653058 -> 1848
    //   1892: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1895: ldc2_w 220066554
    //   1898: l2i
    //   1899: ldc_w 220066309
    //   1902: ixor
    //   1903: getstatic Perryc.c : I
    //   1906: iflt -> 1920
    //   1909: ldc2_w 1232834233
    //   1912: l2i
    //   1913: ldc_w 1350931952
    //   1916: ixor
    //   1917: goto -> 1928
    //   1920: ldc2_w 990916292
    //   1923: l2i
    //   1924: ldc_w 1320980604
    //   1927: ixor
    //   1928: ldc2_w -1812313563
    //   1931: l2i
    //   1932: ldc_w 157970182
    //   1935: ixor
    //   1936: ixor
    //   1937: lookupswitch default -> 1964, -2089927062 -> 4844, 326578517 -> 1920
    //   1964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1967: getstatic Perryc.0 : I
    //   1970: ifle -> 1984
    //   1973: ldc2_w -1666198233
    //   1976: l2i
    //   1977: ldc_w -14498060
    //   1980: ixor
    //   1981: goto -> 1992
    //   1984: ldc2_w 129907430
    //   1987: l2i
    //   1988: ldc_w -21031170
    //   1991: ixor
    //   1992: ldc2_w 38662584
    //   1995: l2i
    //   1996: ldc_w -470418792
    //   1999: ixor
    //   2000: ixor
    //   2001: lookupswitch default -> 4812, -2110449421 -> 1984, 414787384 -> 2028
    //   2028: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2031: getstatic Perryc.0 : I
    //   2034: ifle -> 2048
    //   2037: ldc2_w 1132219840
    //   2040: l2i
    //   2041: ldc_w -1313511507
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w 1258204423
    //   2051: l2i
    //   2052: ldc_w 267213618
    //   2055: ixor
    //   2056: ldc2_w 1482698275
    //   2059: l2i
    //   2060: ldc_w 1717250964
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 4810, -856543270 -> 2048, 2066281346 -> 2092
    //   2092: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2095: getstatic Perryc.0 : I
    //   2098: ifle -> 2112
    //   2101: ldc2_w -1311451051
    //   2104: l2i
    //   2105: ldc_w 1969810023
    //   2108: ixor
    //   2109: goto -> 2120
    //   2112: ldc2_w 114801671
    //   2115: l2i
    //   2116: ldc_w 225983875
    //   2119: ixor
    //   2120: ldc2_w 569736174
    //   2123: l2i
    //   2124: ldc_w 153333888
    //   2127: ixor
    //   2128: ixor
    //   2129: lookupswitch default -> 4866, -328533668 -> 2112, 595151594 -> 2156
    //   2156: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2159: getstatic Perryc.1 : I
    //   2162: ifeq -> 2176
    //   2165: ldc2_w -1005960780
    //   2168: l2i
    //   2169: ldc_w 1570963201
    //   2172: ixor
    //   2173: goto -> 2184
    //   2176: ldc2_w -924177229
    //   2179: l2i
    //   2180: ldc_w 903531903
    //   2183: ixor
    //   2184: ldc2_w 663875761
    //   2187: l2i
    //   2188: ldc_w 1114778542
    //   2191: ixor
    //   2192: ixor
    //   2193: lookupswitch default -> 4824, -1730987309 -> 2220, -62167638 -> 2176
    //   2220: aload_0
    //   2221: getstatic Perryc.c : I
    //   2224: iflt -> 2238
    //   2227: ldc2_w -65457353
    //   2230: l2i
    //   2231: ldc_w -616824332
    //   2234: ixor
    //   2235: goto -> 2246
    //   2238: ldc2_w 353607724
    //   2241: l2i
    //   2242: ldc_w 695428721
    //   2245: ixor
    //   2246: ldc2_w 133972006
    //   2249: l2i
    //   2250: ldc_w -849100934
    //   2253: ixor
    //   2254: ixor
    //   2255: lookupswitch default -> 4762, -306524769 -> 2238, -151045887 -> 2280
    //   2280: aload_0
    //   2281: new bigname/zprestige/webhack/features/setting/Setting
    //   2284: dup
    //   2285: ldc_w '被㌁裣㶲㟥'
    //   2288: getstatic Perryc.0 : I
    //   2291: ifle -> 2305
    //   2294: ldc2_w 1446396870
    //   2297: l2i
    //   2298: ldc_w -1208520485
    //   2301: ixor
    //   2302: goto -> 2313
    //   2305: ldc2_w -589517377
    //   2308: l2i
    //   2309: ldc_w -192700053
    //   2312: ixor
    //   2313: ldc2_w -881378351
    //   2316: l2i
    //   2317: ldc_w -1754571096
    //   2320: ixor
    //   2321: ixor
    //   2322: lookupswitch default -> 2348, -1109567900 -> 4876, 356187772 -> 2305
    //   2348: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2351: ldc2_w 922076576
    //   2354: l2i
    //   2355: ldc_w 922076511
    //   2358: ixor
    //   2359: getstatic Perryc.1 : I
    //   2362: ifeq -> 2376
    //   2365: ldc2_w -253542867
    //   2368: l2i
    //   2369: ldc_w 507390434
    //   2372: ixor
    //   2373: goto -> 2384
    //   2376: ldc2_w -710875350
    //   2379: l2i
    //   2380: ldc_w 229997476
    //   2383: ixor
    //   2384: ldc2_w -2098461415
    //   2387: l2i
    //   2388: ldc_w 1086015856
    //   2391: ixor
    //   2392: ixor
    //   2393: lookupswitch default -> 4816, 440586471 -> 2420, 747264934 -> 2376
    //   2420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2423: ldc2_w 1990138016
    //   2426: l2i
    //   2427: ldc_w 1990138016
    //   2430: ixor
    //   2431: getstatic Perryc.1 : I
    //   2434: ifeq -> 2448
    //   2437: ldc2_w 1811948790
    //   2440: l2i
    //   2441: ldc_w 898913545
    //   2444: ixor
    //   2445: goto -> 2456
    //   2448: ldc2_w -970589695
    //   2451: l2i
    //   2452: ldc_w 409147183
    //   2455: ixor
    //   2456: ldc2_w -408189325
    //   2459: l2i
    //   2460: ldc_w 867523071
    //   2463: ixor
    //   2464: ixor
    //   2465: lookupswitch default -> 4892, -1920291213 -> 2448, 173552290 -> 2492
    //   2492: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2495: ldc2_w 222172727
    //   2498: l2i
    //   2499: ldc_w 222172872
    //   2502: ixor
    //   2503: getstatic Perryc.0 : I
    //   2506: ifle -> 2520
    //   2509: ldc2_w 1353489819
    //   2512: l2i
    //   2513: ldc_w 322198852
    //   2516: ixor
    //   2517: goto -> 2528
    //   2520: ldc2_w -988802555
    //   2523: l2i
    //   2524: ldc_w -1770769876
    //   2527: ixor
    //   2528: ldc2_w 1702004175
    //   2531: l2i
    //   2532: ldc_w -1286374721
    //   2535: ixor
    //   2536: ixor
    //   2537: lookupswitch default -> 4788, -2059018407 -> 2564, -1783021649 -> 2520
    //   2564: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2567: getstatic Perryc.0 : I
    //   2570: ifle -> 2584
    //   2573: ldc2_w 778132809
    //   2576: l2i
    //   2577: ldc_w -1274560295
    //   2580: ixor
    //   2581: goto -> 2592
    //   2584: ldc2_w -644850221
    //   2587: l2i
    //   2588: ldc_w 1105024660
    //   2591: ixor
    //   2592: ldc2_w 1688772924
    //   2595: l2i
    //   2596: ldc_w 931358787
    //   2599: ixor
    //   2600: ixor
    //   2601: lookupswitch default -> 2628, -1751299136 -> 2584, -917678865 -> 4868
    //   2628: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2631: getstatic Perryc.c : I
    //   2634: iflt -> 2648
    //   2637: ldc2_w -1753203225
    //   2640: l2i
    //   2641: ldc_w 1300597932
    //   2644: ixor
    //   2645: goto -> 2656
    //   2648: ldc2_w 1962091904
    //   2651: l2i
    //   2652: ldc_w -670991270
    //   2655: ixor
    //   2656: ldc2_w 1798295823
    //   2659: l2i
    //   2660: ldc_w -1798902262
    //   2663: ixor
    //   2664: ixor
    //   2665: lookupswitch default -> 2692, 636259918 -> 4886, 2064250288 -> 2648
    //   2692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2695: getstatic Perryc.1 : I
    //   2698: ifeq -> 2712
    //   2701: ldc2_w -194811361
    //   2704: l2i
    //   2705: ldc_w 835026992
    //   2708: ixor
    //   2709: goto -> 2720
    //   2712: ldc2_w 883232163
    //   2715: l2i
    //   2716: ldc_w -2012209880
    //   2719: ixor
    //   2720: ldc2_w -2123778279
    //   2723: l2i
    //   2724: ldc_w -1537752512
    //   2727: ixor
    //   2728: ixor
    //   2729: lookupswitch default -> 2756, -526868618 -> 4796, 1774238109 -> 2712
    //   2756: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2759: getstatic Perryc.c : I
    //   2762: iflt -> 2776
    //   2765: ldc2_w 1063266268
    //   2768: l2i
    //   2769: ldc_w -821412902
    //   2772: ixor
    //   2773: goto -> 2784
    //   2776: ldc2_w 1559081994
    //   2779: l2i
    //   2780: ldc_w -165592851
    //   2783: ixor
    //   2784: ldc2_w -82607988
    //   2787: l2i
    //   2788: ldc_w 785203790
    //   2791: ixor
    //   2792: ixor
    //   2793: lookupswitch default -> 4794, 632610500 -> 2776, 2131899941 -> 2820
    //   2820: aload_0
    //   2821: getstatic Perryc.0 : I
    //   2824: ifle -> 2838
    //   2827: ldc2_w 910492284
    //   2830: l2i
    //   2831: ldc_w -186326554
    //   2834: ixor
    //   2835: goto -> 2846
    //   2838: ldc2_w 1779388291
    //   2841: l2i
    //   2842: ldc_w -255535510
    //   2845: ixor
    //   2846: ldc2_w 546921931
    //   2849: l2i
    //   2850: ldc_w 1445901128
    //   2853: ixor
    //   2854: ixor
    //   2855: lookupswitch default -> 4820, -1273623271 -> 2838, -327387286 -> 2880
    //   2880: aload_0
    //   2881: new bigname/zprestige/webhack/features/setting/Setting
    //   2884: dup
    //   2885: ldc_w '袮㌟裳㶲'
    //   2888: getstatic Perryc.0 : I
    //   2891: ifle -> 2905
    //   2894: ldc2_w -1246400802
    //   2897: l2i
    //   2898: ldc_w 1731242622
    //   2901: ixor
    //   2902: goto -> 2913
    //   2905: ldc2_w -1608158379
    //   2908: l2i
    //   2909: ldc_w -791751825
    //   2912: ixor
    //   2913: ldc2_w 1583738040
    //   2916: l2i
    //   2917: ldc_w -1170729186
    //   2920: ixor
    //   2921: ixor
    //   2922: lookupswitch default -> 4874, -1799988324 -> 2948, 920141574 -> 2905
    //   2948: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2951: ldc2_w 133461261
    //   2954: l2i
    //   2955: ldc_w 133461261
    //   2958: ixor
    //   2959: getstatic Perryc.1 : I
    //   2962: ifeq -> 2976
    //   2965: ldc2_w -290338015
    //   2968: l2i
    //   2969: ldc_w 1184973467
    //   2972: ixor
    //   2973: goto -> 2984
    //   2976: ldc2_w -1306739319
    //   2979: l2i
    //   2980: ldc_w 1565290230
    //   2983: ixor
    //   2984: ldc2_w -1752063564
    //   2987: l2i
    //   2988: ldc_w -2001735136
    //   2991: ixor
    //   2992: ixor
    //   2993: lookupswitch default -> 3020, -1221666258 -> 4832, -345485438 -> 2976
    //   3020: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3023: ldc2_w 212715508
    //   3026: l2i
    //   3027: ldc_w 212715508
    //   3030: ixor
    //   3031: getstatic Perryc.0 : I
    //   3034: ifle -> 3048
    //   3037: ldc2_w -341405446
    //   3040: l2i
    //   3041: ldc_w 516334291
    //   3044: ixor
    //   3045: goto -> 3056
    //   3048: ldc2_w 1999065374
    //   3051: l2i
    //   3052: ldc_w -395058976
    //   3055: ixor
    //   3056: ldc2_w -1060202455
    //   3059: l2i
    //   3060: ldc_w -960677272
    //   3063: ixor
    //   3064: ixor
    //   3065: lookupswitch default -> 3092, -216821656 -> 4774, 402161874 -> 3048
    //   3092: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3095: ldc2_w 1193513324
    //   3098: l2i
    //   3099: ldc_w 1193513363
    //   3102: ixor
    //   3103: getstatic Perryc.c : I
    //   3106: iflt -> 3120
    //   3109: ldc2_w -660202718
    //   3112: l2i
    //   3113: ldc_w -258603580
    //   3116: ixor
    //   3117: goto -> 3128
    //   3120: ldc2_w -1291405808
    //   3123: l2i
    //   3124: ldc_w 953842861
    //   3127: ixor
    //   3128: ldc2_w 416078903
    //   3131: l2i
    //   3132: ldc_w 1754945358
    //   3135: ixor
    //   3136: ixor
    //   3137: lookupswitch default -> 3164, -127208264 -> 3120, 1483117983 -> 4882
    //   3164: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3167: getstatic Perryc.0 : I
    //   3170: ifle -> 3184
    //   3173: ldc2_w 1213038411
    //   3176: l2i
    //   3177: ldc_w 60278552
    //   3180: ixor
    //   3181: goto -> 3192
    //   3184: ldc2_w 1172896647
    //   3187: l2i
    //   3188: ldc_w 314294344
    //   3191: ixor
    //   3192: ldc2_w -1849437190
    //   3195: l2i
    //   3196: ldc_w 1203795134
    //   3199: ixor
    //   3200: ixor
    //   3201: lookupswitch default -> 4842, -2125423477 -> 3228, -1646715113 -> 3184
    //   3228: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3231: getstatic Perryc.0 : I
    //   3234: ifle -> 3248
    //   3237: ldc2_w 244682572
    //   3240: l2i
    //   3241: ldc_w 51343347
    //   3244: ixor
    //   3245: goto -> 3256
    //   3248: ldc2_w -811242148
    //   3251: l2i
    //   3252: ldc_w -1411604388
    //   3255: ixor
    //   3256: ldc2_w -925189144
    //   3259: l2i
    //   3260: ldc_w 472997668
    //   3263: ixor
    //   3264: ixor
    //   3265: lookupswitch default -> 4784, -1332598324 -> 3292, -646904717 -> 3248
    //   3292: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3295: getstatic Perryc.c : I
    //   3298: iflt -> 3312
    //   3301: ldc2_w 368926559
    //   3304: l2i
    //   3305: ldc_w -387274895
    //   3308: ixor
    //   3309: goto -> 3320
    //   3312: ldc2_w 2001954069
    //   3315: l2i
    //   3316: ldc_w 861138473
    //   3319: ixor
    //   3320: ldc2_w 12299960
    //   3323: l2i
    //   3324: ldc_w 1360527246
    //   3327: ixor
    //   3328: ixor
    //   3329: lookupswitch default -> 3356, -1396987624 -> 4872, -1376767247 -> 3312
    //   3356: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3359: getstatic Perryc.0 : I
    //   3362: ifle -> 3376
    //   3365: ldc2_w 567230589
    //   3368: l2i
    //   3369: ldc_w 1323527470
    //   3372: ixor
    //   3373: goto -> 3384
    //   3376: ldc2_w 2133193385
    //   3379: l2i
    //   3380: ldc_w 460527856
    //   3383: ixor
    //   3384: ldc2_w 1368104074
    //   3387: l2i
    //   3388: ldc_w 96770599
    //   3391: ixor
    //   3392: ixor
    //   3393: lookupswitch default -> 3420, 652343979 -> 3376, 996355070 -> 4830
    //   3420: aload_0
    //   3421: getstatic Perryc.1 : I
    //   3424: ifeq -> 3438
    //   3427: ldc2_w 191466126
    //   3430: l2i
    //   3431: ldc_w 2003681998
    //   3434: ixor
    //   3435: goto -> 3446
    //   3438: ldc2_w -1093753831
    //   3441: l2i
    //   3442: ldc_w -1013689134
    //   3445: ixor
    //   3446: ldc2_w -12624132
    //   3449: l2i
    //   3450: ldc_w -1320366578
    //   3453: ixor
    //   3454: ixor
    //   3455: lookupswitch default -> 3480, 447113465 -> 3438, 846715058 -> 4864
    //   3480: aload_0
    //   3481: new bigname/zprestige/webhack/features/setting/Setting
    //   3484: dup
    //   3485: ldc_w '袭㌟裶㶿㟪'
    //   3488: getstatic Perryc.0 : I
    //   3491: ifle -> 3505
    //   3494: ldc2_w -1484769266
    //   3497: l2i
    //   3498: ldc_w -1264488755
    //   3501: ixor
    //   3502: goto -> 3513
    //   3505: ldc2_w 328216883
    //   3508: l2i
    //   3509: ldc_w -1128586990
    //   3512: ixor
    //   3513: ldc2_w 1434494610
    //   3516: l2i
    //   3517: ldc_w -1472247996
    //   3520: ixor
    //   3521: ixor
    //   3522: lookupswitch default -> 4826, -291588331 -> 3505, 1385492983 -> 3548
    //   3548: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3551: ldc2_w -1411242009
    //   3554: l2i
    //   3555: ldc_w -1411242009
    //   3558: ixor
    //   3559: getstatic Perryc.0 : I
    //   3562: ifle -> 3576
    //   3565: ldc2_w 1244434373
    //   3568: l2i
    //   3569: ldc_w -254766893
    //   3572: ixor
    //   3573: goto -> 3584
    //   3576: ldc2_w 727422601
    //   3579: l2i
    //   3580: ldc_w -2091453393
    //   3583: ixor
    //   3584: ldc2_w 91936887
    //   3587: l2i
    //   3588: ldc_w 1637382922
    //   3591: ixor
    //   3592: ixor
    //   3593: lookupswitch default -> 4800, -856702501 -> 3620, -568411029 -> 3576
    //   3620: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3623: ldc2_w -1592728179
    //   3626: l2i
    //   3627: ldc_w -1592728179
    //   3630: ixor
    //   3631: getstatic Perryc.1 : I
    //   3634: ifeq -> 3648
    //   3637: ldc2_w -1948572067
    //   3640: l2i
    //   3641: ldc_w 932254362
    //   3644: ixor
    //   3645: goto -> 3656
    //   3648: ldc2_w -588633407
    //   3651: l2i
    //   3652: ldc_w 1085562365
    //   3655: ixor
    //   3656: ldc2_w -1823733138
    //   3659: l2i
    //   3660: ldc_w 1982232508
    //   3663: ixor
    //   3664: ixor
    //   3665: lookupswitch default -> 3692, 1359271007 -> 3648, 1495288085 -> 4862
    //   3692: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3695: ldc2_w 1695699561
    //   3698: l2i
    //   3699: ldc_w 1695699606
    //   3702: ixor
    //   3703: getstatic Perryc.0 : I
    //   3706: ifle -> 3720
    //   3709: ldc2_w 1294348663
    //   3712: l2i
    //   3713: ldc_w 894383631
    //   3716: ixor
    //   3717: goto -> 3728
    //   3720: ldc2_w -1146874193
    //   3723: l2i
    //   3724: ldc_w -960908684
    //   3727: ixor
    //   3728: ldc2_w -1534862899
    //   3731: l2i
    //   3732: ldc_w -910121312
    //   3735: ixor
    //   3736: ixor
    //   3737: lookupswitch default -> 3764, -517613819 -> 3720, 355104789 -> 4888
    //   3764: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3767: getstatic Perryc.c : I
    //   3770: iflt -> 3784
    //   3773: ldc2_w 1370148903
    //   3776: l2i
    //   3777: ldc_w -1098151903
    //   3780: ixor
    //   3781: goto -> 3792
    //   3784: ldc2_w -2015674891
    //   3787: l2i
    //   3788: ldc_w -2088223666
    //   3791: ixor
    //   3792: ldc2_w 2084003711
    //   3795: l2i
    //   3796: ldc_w 1275088060
    //   3799: ixor
    //   3800: ixor
    //   3801: lookupswitch default -> 4782, -552186939 -> 3784, 878973560 -> 3828
    //   3828: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3831: getstatic Perryc.c : I
    //   3834: iflt -> 3848
    //   3837: ldc2_w 444914808
    //   3840: l2i
    //   3841: ldc_w -567584252
    //   3844: ixor
    //   3845: goto -> 3856
    //   3848: ldc2_w 356801243
    //   3851: l2i
    //   3852: ldc_w -1736099868
    //   3855: ixor
    //   3856: ldc2_w -35389048
    //   3859: l2i
    //   3860: ldc_w 521885135
    //   3863: ixor
    //   3864: ixor
    //   3865: lookupswitch default -> 3892, 642830907 -> 4814, 1847411384 -> 3848
    //   3892: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3895: getstatic Perryc.1 : I
    //   3898: ifeq -> 3912
    //   3901: ldc2_w 1520100899
    //   3904: l2i
    //   3905: ldc_w 477550040
    //   3908: ixor
    //   3909: goto -> 3920
    //   3912: ldc2_w -73899003
    //   3915: l2i
    //   3916: ldc_w -1509844275
    //   3919: ixor
    //   3920: ldc2_w -419744115
    //   3923: l2i
    //   3924: ldc_w 1875500281
    //   3927: ixor
    //   3928: ixor
    //   3929: lookupswitch default -> 4752, -807478897 -> 3912, -726985540 -> 3956
    //   3956: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3959: getstatic Perryc.1 : I
    //   3962: ifeq -> 3976
    //   3965: ldc2_w -107780560
    //   3968: l2i
    //   3969: ldc_w 1100583650
    //   3972: ixor
    //   3973: goto -> 3984
    //   3976: ldc2_w 794868641
    //   3979: l2i
    //   3980: ldc_w -1760298289
    //   3983: ixor
    //   3984: ldc2_w 608775372
    //   3987: l2i
    //   3988: ldc_w -1472768158
    //   3991: ixor
    //   3992: ixor
    //   3993: lookupswitch default -> 4020, 503648972 -> 3976, 880054140 -> 4840
    //   4020: aload_0
    //   4021: getstatic Perryc.c : I
    //   4024: iflt -> 4038
    //   4027: ldc2_w 394519582
    //   4030: l2i
    //   4031: ldc_w 1023551027
    //   4034: ixor
    //   4035: goto -> 4046
    //   4038: ldc2_w 464442952
    //   4041: l2i
    //   4042: ldc_w -1000208984
    //   4045: ixor
    //   4046: ldc2_w -2026847894
    //   4049: l2i
    //   4050: ldc_w -93377319
    //   4053: ixor
    //   4054: ixor
    //   4055: lookupswitch default -> 4854, -1567408557 -> 4080, 1474178974 -> 4038
    //   4080: aload_0
    //   4081: new bigname/zprestige/webhack/features/setting/Setting
    //   4084: dup
    //   4085: ldc_w '袮㌜裾㶖㟧映๱'
    //   4088: getstatic Perryc.1 : I
    //   4091: ifeq -> 4105
    //   4094: ldc2_w -311396974
    //   4097: l2i
    //   4098: ldc_w -1292685719
    //   4101: ixor
    //   4102: goto -> 4113
    //   4105: ldc2_w -1055211261
    //   4108: l2i
    //   4109: ldc_w -1075755377
    //   4112: ixor
    //   4113: ldc2_w -536120178
    //   4116: l2i
    //   4117: ldc_w -469649617
    //   4120: ixor
    //   4121: ixor
    //   4122: lookupswitch default -> 4768, 1535744090 -> 4105, 2062631981 -> 4148
    //   4148: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4151: ldc2_w -1147901964
    //   4154: l2i
    //   4155: ldc_w -1147902148
    //   4158: ixor
    //   4159: getstatic Perryc.1 : I
    //   4162: ifeq -> 4176
    //   4165: ldc2_w 1836220142
    //   4168: l2i
    //   4169: ldc_w 644447762
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w 284586134
    //   4179: l2i
    //   4180: ldc_w -785101681
    //   4183: ixor
    //   4184: ldc2_w 1727123770
    //   4187: l2i
    //   4188: ldc_w -451675926
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4220, -923195092 -> 4798, 1804483401 -> 4176
    //   4220: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4223: ldc2_w -691015018
    //   4226: l2i
    //   4227: ldc_w -691015018
    //   4230: ixor
    //   4231: getstatic Perryc.1 : I
    //   4234: ifeq -> 4248
    //   4237: ldc2_w -447654109
    //   4240: l2i
    //   4241: ldc_w -1033855586
    //   4244: ixor
    //   4245: goto -> 4256
    //   4248: ldc2_w 220942219
    //   4251: l2i
    //   4252: ldc_w 1103263742
    //   4255: ixor
    //   4256: ldc2_w -60158104
    //   4259: l2i
    //   4260: ldc_w -446451590
    //   4263: ixor
    //   4264: ixor
    //   4265: lookupswitch default -> 4804, 1043887535 -> 4248, 1440778087 -> 4292
    //   4292: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4295: ldc2_w -1657114988
    //   4298: l2i
    //   4299: ldc_w -1657115029
    //   4302: ixor
    //   4303: getstatic Perryc.0 : I
    //   4306: ifle -> 4320
    //   4309: ldc2_w 1266253230
    //   4312: l2i
    //   4313: ldc_w -808822577
    //   4316: ixor
    //   4317: goto -> 4328
    //   4320: ldc2_w 781633982
    //   4323: l2i
    //   4324: ldc_w -2141481252
    //   4327: ixor
    //   4328: ldc2_w -459463248
    //   4331: l2i
    //   4332: ldc_w 1344388661
    //   4335: ixor
    //   4336: ixor
    //   4337: lookupswitch default -> 4758, 443663591 -> 4364, 806338276 -> 4320
    //   4364: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4367: getstatic Perryc.0 : I
    //   4370: ifle -> 4384
    //   4373: ldc2_w 224768726
    //   4376: l2i
    //   4377: ldc_w 1239911957
    //   4380: ixor
    //   4381: goto -> 4392
    //   4384: ldc2_w -1022100481
    //   4387: l2i
    //   4388: ldc_w 2046036357
    //   4391: ixor
    //   4392: ldc2_w -1462202527
    //   4395: l2i
    //   4396: ldc_w -207915661
    //   4399: ixor
    //   4400: ixor
    //   4401: lookupswitch default -> 4858, -509343640 -> 4428, 532793041 -> 4384
    //   4428: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4431: getstatic Perryc.1 : I
    //   4434: ifeq -> 4448
    //   4437: ldc2_w -1355766868
    //   4440: l2i
    //   4441: ldc_w 82662300
    //   4444: ixor
    //   4445: goto -> 4456
    //   4448: ldc2_w 505131896
    //   4451: l2i
    //   4452: ldc_w 968914830
    //   4455: ixor
    //   4456: ldc2_w -1437797442
    //   4459: l2i
    //   4460: ldc_w -195898392
    //   4463: ixor
    //   4464: ixor
    //   4465: lookupswitch default -> 4492, -171716506 -> 4778, 2133630618 -> 4448
    //   4492: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4495: getstatic Perryc.1 : I
    //   4498: ifeq -> 4512
    //   4501: ldc2_w -1113410387
    //   4504: l2i
    //   4505: ldc_w 300148028
    //   4508: ixor
    //   4509: goto -> 4520
    //   4512: ldc2_w 1634690590
    //   4515: l2i
    //   4516: ldc_w -658827862
    //   4519: ixor
    //   4520: ldc2_w 2083261811
    //   4523: l2i
    //   4524: ldc_w 154071119
    //   4527: ixor
    //   4528: ixor
    //   4529: lookupswitch default -> 4556, -649876307 -> 4822, 1713987213 -> 4512
    //   4556: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4559: getstatic Perryc.0 : I
    //   4562: ifle -> 4576
    //   4565: ldc2_w 1410074726
    //   4568: l2i
    //   4569: ldc_w -1770739499
    //   4572: ixor
    //   4573: goto -> 4584
    //   4576: ldc2_w 1280611833
    //   4579: l2i
    //   4580: ldc_w 2078642798
    //   4583: ixor
    //   4584: ldc2_w 1727316482
    //   4587: l2i
    //   4588: ldc_w 1415058243
    //   4591: ixor
    //   4592: ixor
    //   4593: lookupswitch default -> 4790, -254512654 -> 4576, 85841622 -> 4620
    //   4620: aload_0
    //   4621: new java/util/ArrayList
    //   4624: dup
    //   4625: getstatic Perryc.1 : I
    //   4628: ifeq -> 4642
    //   4631: ldc2_w -2018328388
    //   4634: l2i
    //   4635: ldc_w 126438490
    //   4638: ixor
    //   4639: goto -> 4650
    //   4642: ldc2_w 331025449
    //   4645: l2i
    //   4646: ldc_w 768864223
    //   4649: ixor
    //   4650: ldc2_w -6757529
    //   4653: l2i
    //   4654: ldc_w 1906458871
    //   4657: ixor
    //   4658: ixor
    //   4659: lookupswitch default -> 4684, -80932866 -> 4642, 234958710 -> 4856
    //   4684: invokespecial <init> : ()V
    //   4687: getstatic Perryc.c : I
    //   4690: iflt -> 4704
    //   4693: ldc2_w -460926341
    //   4696: l2i
    //   4697: ldc_w -2019165260
    //   4700: ixor
    //   4701: goto -> 4712
    //   4704: ldc2_w 1533665126
    //   4707: l2i
    //   4708: ldc_w -1748600291
    //   4711: ixor
    //   4712: ldc2_w 1534615720
    //   4715: l2i
    //   4716: ldc_w -905401671
    //   4719: ixor
    //   4720: ixor
    //   4721: lookupswitch default -> 4748, -229383202 -> 4880, -195795733 -> 4704
    //   4748: putfield cityBlocks : Ljava/util/List;
    //   4751: return
    //   4752: aconst_null
    //   4753: athrow
    //   4754: aconst_null
    //   4755: athrow
    //   4756: aconst_null
    //   4757: athrow
    //   4758: aconst_null
    //   4759: athrow
    //   4760: aconst_null
    //   4761: athrow
    //   4762: aconst_null
    //   4763: athrow
    //   4764: aconst_null
    //   4765: athrow
    //   4766: aconst_null
    //   4767: athrow
    //   4768: aconst_null
    //   4769: athrow
    //   4770: aconst_null
    //   4771: athrow
    //   4772: aconst_null
    //   4773: athrow
    //   4774: aconst_null
    //   4775: athrow
    //   4776: aconst_null
    //   4777: athrow
    //   4778: aconst_null
    //   4779: athrow
    //   4780: aconst_null
    //   4781: athrow
    //   4782: aconst_null
    //   4783: athrow
    //   4784: aconst_null
    //   4785: athrow
    //   4786: aconst_null
    //   4787: athrow
    //   4788: aconst_null
    //   4789: athrow
    //   4790: aconst_null
    //   4791: athrow
    //   4792: aconst_null
    //   4793: athrow
    //   4794: aconst_null
    //   4795: athrow
    //   4796: aconst_null
    //   4797: athrow
    //   4798: aconst_null
    //   4799: athrow
    //   4800: aconst_null
    //   4801: athrow
    //   4802: aconst_null
    //   4803: athrow
    //   4804: aconst_null
    //   4805: athrow
    //   4806: aconst_null
    //   4807: athrow
    //   4808: aconst_null
    //   4809: athrow
    //   4810: aconst_null
    //   4811: athrow
    //   4812: aconst_null
    //   4813: athrow
    //   4814: aconst_null
    //   4815: athrow
    //   4816: aconst_null
    //   4817: athrow
    //   4818: aconst_null
    //   4819: athrow
    //   4820: aconst_null
    //   4821: athrow
    //   4822: aconst_null
    //   4823: athrow
    //   4824: aconst_null
    //   4825: athrow
    //   4826: aconst_null
    //   4827: athrow
    //   4828: aconst_null
    //   4829: athrow
    //   4830: aconst_null
    //   4831: athrow
    //   4832: aconst_null
    //   4833: athrow
    //   4834: aconst_null
    //   4835: athrow
    //   4836: aconst_null
    //   4837: athrow
    //   4838: aconst_null
    //   4839: athrow
    //   4840: aconst_null
    //   4841: athrow
    //   4842: aconst_null
    //   4843: athrow
    //   4844: aconst_null
    //   4845: athrow
    //   4846: aconst_null
    //   4847: athrow
    //   4848: aconst_null
    //   4849: athrow
    //   4850: aconst_null
    //   4851: athrow
    //   4852: aconst_null
    //   4853: athrow
    //   4854: aconst_null
    //   4855: athrow
    //   4856: aconst_null
    //   4857: athrow
    //   4858: aconst_null
    //   4859: athrow
    //   4860: aconst_null
    //   4861: athrow
    //   4862: aconst_null
    //   4863: athrow
    //   4864: aconst_null
    //   4865: athrow
    //   4866: aconst_null
    //   4867: athrow
    //   4868: aconst_null
    //   4869: athrow
    //   4870: aconst_null
    //   4871: athrow
    //   4872: aconst_null
    //   4873: athrow
    //   4874: aconst_null
    //   4875: athrow
    //   4876: aconst_null
    //   4877: athrow
    //   4878: aconst_null
    //   4879: athrow
    //   4880: aconst_null
    //   4881: athrow
    //   4882: aconst_null
    //   4883: athrow
    //   4884: aconst_null
    //   4885: athrow
    //   4886: aconst_null
    //   4887: athrow
    //   4888: aconst_null
    //   4889: athrow
    //   4890: aconst_null
    //   4891: athrow
    //   4892: aconst_null
    //   4893: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	4752	0	this	Lbigname/zprestige/webhack/features/modules/Render/CityEsp;
  }
  
  public List getCityBlocksy() {
    return Perry1.54(this, (int)1231713553L ^ 0x78FD303C);
  }
  
  public boolean lambda$null$0(BlockPos blockPos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 673
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 665
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 657
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1593724661
    //   33: l2i
    //   34: ldc_w 666278826
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1400822182
    //   44: l2i
    //   45: ldc_w 659484359
    //   48: ixor
    //   49: ldc2_w -217551358
    //   52: l2i
    //   53: ldc_w -1880732726
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 640, -148771499 -> 84, -94826647 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Render/CityEsp.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.1 : I
    //   90: ifeq -> 104
    //   93: ldc2_w 407399199
    //   96: l2i
    //   97: ldc_w -365170954
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -788199826
    //   107: l2i
    //   108: ldc_w 1475724102
    //   111: ixor
    //   112: ldc2_w 1356504986
    //   115: l2i
    //   116: ldc_w 169648083
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -1464498784 -> 638, -343928544 -> 104
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w 1451057410
    //   160: l2i
    //   161: ldc_w 2047388689
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 1698250750
    //   171: l2i
    //   172: ldc_w 1217485108
    //   175: ixor
    //   176: ldc2_w 217535311
    //   179: l2i
    //   180: ldc_w -1890978790
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 642, -1374240353 -> 212, -1345623482 -> 168
    //   212: aload_1
    //   213: getstatic Perryc.c : I
    //   216: iflt -> 230
    //   219: ldc2_w 1286898500
    //   222: l2i
    //   223: ldc_w 1447060849
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 381546766
    //   233: l2i
    //   234: ldc_w 46770993
    //   237: ixor
    //   238: ldc2_w -1820988170
    //   241: l2i
    //   242: ldc_w -1588897275
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 272, -1787522202 -> 230, 684347590 -> 644
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual func_174818_b : (Lnet/minecraft/util/math/BlockPos;)D
    //   279: goto -> 283
    //   282: athrow
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w 200991644
    //   292: l2i
    //   293: ldc_w 596761685
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1993047085
    //   303: l2i
    //   304: ldc_w 1876779132
    //   307: ixor
    //   308: ldc2_w -1936215526
    //   311: l2i
    //   312: ldc_w -496461736
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, 1184109963 -> 646, 1190639001 -> 300
    //   344: aload_0
    //   345: getstatic Perryc.c : I
    //   348: iflt -> 362
    //   351: ldc2_w 272615538
    //   354: l2i
    //   355: ldc_w -1463571613
    //   358: ixor
    //   359: goto -> 370
    //   362: ldc2_w 1303851096
    //   365: l2i
    //   366: ldc_w -1158689232
    //   369: ixor
    //   370: ldc2_w 1241449420
    //   373: l2i
    //   374: ldc_w -1241708131
    //   377: ixor
    //   378: ixor
    //   379: lookupswitch default -> 404, -1811079920 -> 362, 1157523776 -> 632
    //   404: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   407: getstatic Perryc.c : I
    //   410: iflt -> 424
    //   413: ldc2_w 1194879587
    //   416: l2i
    //   417: ldc_w -740643737
    //   420: ixor
    //   421: goto -> 432
    //   424: ldc2_w -596204269
    //   427: l2i
    //   428: ldc_w -1628832283
    //   431: ixor
    //   432: ldc2_w 834261183
    //   435: l2i
    //   436: ldc_w -70050574
    //   439: ixor
    //   440: ixor
    //   441: lookupswitch default -> 634, -1997171525 -> 468, 1585973833 -> 424
    //   468: goto -> 472
    //   471: athrow
    //   472: invokevirtual getValue : ()Ljava/lang/Object;
    //   475: goto -> 479
    //   478: athrow
    //   479: checkcast java/lang/Integer
    //   482: getstatic Perryc.c : I
    //   485: iflt -> 499
    //   488: ldc2_w 804833495
    //   491: l2i
    //   492: ldc_w -309746418
    //   495: ixor
    //   496: goto -> 507
    //   499: ldc2_w -1701930791
    //   502: l2i
    //   503: ldc_w -929033886
    //   506: ixor
    //   507: ldc2_w -1758942405
    //   510: l2i
    //   511: ldc_w -1708638190
    //   514: ixor
    //   515: ixor
    //   516: lookupswitch default -> 544, -814643472 -> 636, 1622742995 -> 499
    //   544: goto -> 548
    //   547: athrow
    //   548: invokevirtual intValue : ()I
    //   551: goto -> 555
    //   554: athrow
    //   555: i2d
    //   556: dcmpg
    //   557: ifgt -> 571
    //   560: ldc2_w 1172756420
    //   563: l2i
    //   564: ldc_w -892317087
    //   567: ixor
    //   568: goto -> 579
    //   571: ldc2_w -448998852
    //   574: l2i
    //   575: ldc_w 1779062682
    //   578: ixor
    //   579: ldc2_w 1833407490
    //   582: l2i
    //   583: ldc_w -390108126
    //   586: ixor
    //   587: ixor
    //   588: tableswitch default -> 560, 181304709 -> 612, 181304710 -> 623
    //   612: ldc2_w -618961076
    //   615: l2i
    //   616: ldc_w -618961075
    //   619: ixor
    //   620: goto -> 631
    //   623: ldc2_w 2115269110
    //   626: l2i
    //   627: ldc_w 2115269110
    //   630: ixor
    //   631: ireturn
    //   632: aconst_null
    //   633: athrow
    //   634: aconst_null
    //   635: athrow
    //   636: aconst_null
    //   637: athrow
    //   638: aconst_null
    //   639: athrow
    //   640: aconst_null
    //   641: athrow
    //   642: aconst_null
    //   643: athrow
    //   644: aconst_null
    //   645: athrow
    //   646: aconst_null
    //   647: athrow
    //   648: pop
    //   649: goto -> 24
    //   652: pop
    //   653: aconst_null
    //   654: goto -> 648
    //   657: dup
    //   658: ifnull -> 648
    //   661: checkcast java/lang/Throwable
    //   664: athrow
    //   665: dup
    //   666: ifnull -> 652
    //   669: checkcast java/lang/Throwable
    //   672: athrow
    //   673: aconst_null
    //   674: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	608	0	this	Lbigname/zprestige/webhack/features/modules/Render/CityEsp;
    //   24	608	1	blockPos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	657	finally
    //   276	282	282	finally
    //   276	282	282	finally
    //   276	282	3	finally
    //   276	282	282	java/lang/EnumConstantNotPresentException
    //   276	282	282	java/lang/AssertionError
    //   471	478	478	finally
    //   471	478	478	java/lang/NullPointerException
    //   471	478	471	java/lang/RuntimeException
    //   472	478	471	java/lang/IndexOutOfBoundsException
    //   472	478	478	finally
    //   548	554	554	finally
    //   548	554	554	java/lang/AssertionError
    //   548	554	3	finally
    //   548	554	554	java/lang/ClassCastException
    //   548	554	3	java/lang/EnumConstantNotPresentException
    //   657	665	657	finally
    //   673	675	3	finally
  }
  
  public void lambda$onRender3D$2(EntityPlayer entityPlayer) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\CityEsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */