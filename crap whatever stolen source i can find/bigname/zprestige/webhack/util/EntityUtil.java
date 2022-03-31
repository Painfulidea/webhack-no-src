package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.awt.Color;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EntityUtil implements Util {
  public static Vec3d[] OffsetList;
  
  public static Vec3d[] doubleLegOffsetList;
  
  public static Vec3d[] legOffsetList;
  
  public static Vec3d[] platformOffsetList;
  
  public static Vec3d[] antiScaffoldOffsetList;
  
  public static Vec3d[] antiStepOffsetList;
  
  public static Vec3d[] antiDropOffsetList;
  
  public static boolean isInWater(Entity entity) {
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
  
  public static List getSphere(BlockPos loc, float r, int h, boolean hollow, boolean sphere, int plusY) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4910
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 4902
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4894
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -273027399
    //   37: l2i
    //   38: ldc_w -117331269
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -501618866
    //   48: l2i
    //   49: ldc_w -419692217
    //   52: ixor
    //   53: ldc2_w 837740760
    //   56: l2i
    //   57: ldc_w 788203545
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 4787, 162374851 -> 45, 468715208 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w 100304535
    //   108: l2i
    //   109: ldc_w -1035402091
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 897816591
    //   119: l2i
    //   120: ldc_w 1876556171
    //   123: ixor
    //   124: ldc2_w 1830620113
    //   127: l2i
    //   128: ldc_w 1511681986
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 4781, -256580079 -> 116, 1834812823 -> 160
    //   160: astore #6
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w 332874417
    //   171: l2i
    //   172: ldc_w 418729927
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 1941023581
    //   182: l2i
    //   183: ldc_w -798273673
    //   186: ixor
    //   187: ldc2_w 1157775503
    //   190: l2i
    //   191: ldc_w -1082639777
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -245860442 -> 4847, 1254240049 -> 179
    //   224: aload_0
    //   225: getstatic Perryc.1 : I
    //   228: ifeq -> 242
    //   231: ldc2_w 1335389915
    //   234: l2i
    //   235: ldc_w 283866149
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -1971576013
    //   245: l2i
    //   246: ldc_w -523038572
    //   249: ixor
    //   250: ldc2_w -15734745
    //   253: l2i
    //   254: ldc_w -51363584
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 284, -202800029 -> 242, 1552724953 -> 4879
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_177958_n : ()I
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.c : I
    //   298: iflt -> 312
    //   301: ldc2_w -1286996981
    //   304: l2i
    //   305: ldc_w 588951005
    //   308: ixor
    //   309: goto -> 320
    //   312: ldc2_w 2039988460
    //   315: l2i
    //   316: ldc_w -1910450918
    //   319: ixor
    //   320: ldc2_w -1299649434
    //   323: l2i
    //   324: ldc_w -765506704
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 4859, -1755270432 -> 356, -259721536 -> 312
    //   356: istore #7
    //   358: getstatic Perryc.c : I
    //   361: iflt -> 375
    //   364: ldc2_w 2045782041
    //   367: l2i
    //   368: ldc_w 2022981770
    //   371: ixor
    //   372: goto -> 383
    //   375: ldc2_w 2146842907
    //   378: l2i
    //   379: ldc_w 1246675365
    //   382: ixor
    //   383: ldc2_w -1771254675
    //   386: l2i
    //   387: ldc_w 2090024954
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 420, -342123772 -> 4817, 1611052443 -> 375
    //   420: aload_0
    //   421: getstatic Perryc.c : I
    //   424: iflt -> 438
    //   427: ldc2_w 1229540312
    //   430: l2i
    //   431: ldc_w -866767972
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w 822892323
    //   441: l2i
    //   442: ldc_w 1105632861
    //   445: ixor
    //   446: ldc2_w -1228215843
    //   449: l2i
    //   450: ldc_w 1790323699
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 4793, -1399452848 -> 480, 1499701866 -> 438
    //   480: goto -> 484
    //   483: athrow
    //   484: invokevirtual func_177956_o : ()I
    //   487: goto -> 491
    //   490: athrow
    //   491: getstatic Perryc.0 : I
    //   494: ifle -> 508
    //   497: ldc2_w -470220259
    //   500: l2i
    //   501: ldc_w -1212988038
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w 870753606
    //   511: l2i
    //   512: ldc_w -1571435085
    //   515: ixor
    //   516: ldc2_w -1383861690
    //   519: l2i
    //   520: ldc_w -6350552
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 4773, -1011907685 -> 552, 106343433 -> 508
    //   552: istore #8
    //   554: getstatic Perryc.0 : I
    //   557: ifle -> 571
    //   560: ldc2_w 2081725242
    //   563: l2i
    //   564: ldc_w 1089757916
    //   567: ixor
    //   568: goto -> 579
    //   571: ldc2_w 1060421049
    //   574: l2i
    //   575: ldc_w -1769331510
    //   578: ixor
    //   579: ldc2_w -1097883157
    //   582: l2i
    //   583: ldc_w 1147861901
    //   586: ixor
    //   587: ixor
    //   588: lookupswitch default -> 4841, -972708992 -> 571, 1398522645 -> 616
    //   616: aload_0
    //   617: getstatic Perryc.c : I
    //   620: iflt -> 634
    //   623: ldc2_w 701037742
    //   626: l2i
    //   627: ldc_w 1560923404
    //   630: ixor
    //   631: goto -> 642
    //   634: ldc2_w 1361752781
    //   637: l2i
    //   638: ldc_w 1052047006
    //   641: ixor
    //   642: ldc2_w -445755713
    //   645: l2i
    //   646: ldc_w -1290551036
    //   649: ixor
    //   650: ixor
    //   651: lookupswitch default -> 676, -921976543 -> 634, 582794777 -> 4795
    //   676: goto -> 680
    //   679: athrow
    //   680: invokevirtual func_177952_p : ()I
    //   683: goto -> 687
    //   686: athrow
    //   687: getstatic Perryc.c : I
    //   690: iflt -> 704
    //   693: ldc2_w 1208077519
    //   696: l2i
    //   697: ldc_w 1667343203
    //   700: ixor
    //   701: goto -> 712
    //   704: ldc2_w -651295652
    //   707: l2i
    //   708: ldc_w -1995807125
    //   711: ixor
    //   712: ldc2_w 554367436
    //   715: l2i
    //   716: ldc_w 196016540
    //   719: ixor
    //   720: ixor
    //   721: lookupswitch default -> 748, 29650940 -> 4825, 1813139056 -> 704
    //   748: istore #9
    //   750: getstatic Perryc.0 : I
    //   753: ifle -> 767
    //   756: ldc2_w 78510472
    //   759: l2i
    //   760: ldc_w -977495688
    //   763: ixor
    //   764: goto -> 775
    //   767: ldc2_w 1129918925
    //   770: l2i
    //   771: ldc_w -673852810
    //   774: ixor
    //   775: ldc2_w -1012586018
    //   778: l2i
    //   779: ldc_w -2093283375
    //   782: ixor
    //   783: ixor
    //   784: lookupswitch default -> 4853, -2121314561 -> 767, -736965196 -> 812
    //   812: iload #7
    //   814: getstatic Perryc.c : I
    //   817: iflt -> 831
    //   820: ldc2_w 764501806
    //   823: l2i
    //   824: ldc_w -1472688132
    //   827: ixor
    //   828: goto -> 839
    //   831: ldc2_w 2129791897
    //   834: l2i
    //   835: ldc_w -91089385
    //   838: ixor
    //   839: ldc2_w -229627112
    //   842: l2i
    //   843: ldc_w -849039561
    //   846: ixor
    //   847: ixor
    //   848: lookupswitch default -> 4831, -1164094211 -> 831, -1152083551 -> 876
    //   876: fload_1
    //   877: f2i
    //   878: isub
    //   879: getstatic Perryc.c : I
    //   882: iflt -> 896
    //   885: ldc2_w -2035819240
    //   888: l2i
    //   889: ldc_w 401544419
    //   892: ixor
    //   893: goto -> 904
    //   896: ldc2_w -1890343149
    //   899: l2i
    //   900: ldc_w 476420943
    //   903: ixor
    //   904: ldc2_w -315563315
    //   907: l2i
    //   908: ldc_w 964680234
    //   911: ixor
    //   912: ixor
    //   913: lookupswitch default -> 4835, 1158148380 -> 896, 1199113403 -> 940
    //   940: istore #10
    //   942: getstatic Perryc.c : I
    //   945: iflt -> 959
    //   948: ldc2_w 1923288935
    //   951: l2i
    //   952: ldc_w 645698784
    //   955: ixor
    //   956: goto -> 967
    //   959: ldc2_w 850763098
    //   962: l2i
    //   963: ldc_w -1141130925
    //   966: ixor
    //   967: ldc2_w 1174599338
    //   970: l2i
    //   971: ldc_w -1736571520
    //   974: ixor
    //   975: ixor
    //   976: lookupswitch default -> 4779, -1969002323 -> 959, 1462949667 -> 1004
    //   1004: iload #10
    //   1006: i2f
    //   1007: getstatic Perryc.1 : I
    //   1010: ifeq -> 1024
    //   1013: ldc2_w 2125278417
    //   1016: l2i
    //   1017: ldc_w 34694524
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w 996145684
    //   1027: l2i
    //   1028: ldc_w 381455641
    //   1031: ixor
    //   1032: ldc2_w -532311928
    //   1035: l2i
    //   1036: ldc_w 1089570111
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 4785, -1923652934 -> 1068, -603431910 -> 1024
    //   1068: iload #7
    //   1070: i2f
    //   1071: getstatic Perryc.1 : I
    //   1074: ifeq -> 1088
    //   1077: ldc2_w -1273870502
    //   1080: l2i
    //   1081: ldc_w -2025264279
    //   1084: ixor
    //   1085: goto -> 1096
    //   1088: ldc2_w 88519483
    //   1091: l2i
    //   1092: ldc_w 772749820
    //   1095: ixor
    //   1096: ldc2_w -600225001
    //   1099: l2i
    //   1100: ldc_w 572705926
    //   1103: ixor
    //   1104: ixor
    //   1105: lookupswitch default -> 1132, -1940153541 -> 1088, -851367006 -> 4827
    //   1132: fload_1
    //   1133: fadd
    //   1134: fcmpg
    //   1135: ifgt -> 1149
    //   1138: ldc2_w -1065788018
    //   1141: l2i
    //   1142: ldc_w -787648685
    //   1145: ixor
    //   1146: goto -> 1157
    //   1149: ldc2_w 262073954
    //   1152: l2i
    //   1153: ldc_w 518708414
    //   1156: ixor
    //   1157: ldc2_w -1092396513
    //   1160: l2i
    //   1161: ldc_w -482657806
    //   1164: ixor
    //   1165: ixor
    //   1166: tableswitch default -> 1138, 1286361392 -> 1188, 1286361393 -> 4692
    //   1188: getstatic Perryc.1 : I
    //   1191: ifeq -> 1205
    //   1194: ldc2_w 1526208692
    //   1197: l2i
    //   1198: ldc_w 1147846592
    //   1201: ixor
    //   1202: goto -> 1213
    //   1205: ldc2_w -633718103
    //   1208: l2i
    //   1209: ldc_w -548140806
    //   1212: ixor
    //   1213: ldc2_w 535458522
    //   1216: l2i
    //   1217: ldc_w -1104299814
    //   1220: ixor
    //   1221: ixor
    //   1222: lookupswitch default -> 1248, -1660387558 -> 1205, -1084920460 -> 4861
    //   1248: iload #9
    //   1250: getstatic Perryc.c : I
    //   1253: iflt -> 1267
    //   1256: ldc2_w 328179227
    //   1259: l2i
    //   1260: ldc_w 1933951146
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w -1080908141
    //   1270: l2i
    //   1271: ldc_w 1945626280
    //   1274: ixor
    //   1275: ldc2_w 147475627
    //   1278: l2i
    //   1279: ldc_w 682842955
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 1312, 1085491537 -> 4757, 1328711203 -> 1267
    //   1312: fload_1
    //   1313: f2i
    //   1314: isub
    //   1315: getstatic Perryc.0 : I
    //   1318: ifle -> 1332
    //   1321: ldc2_w -942531918
    //   1324: l2i
    //   1325: ldc_w -1565055839
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w 1005072660
    //   1335: l2i
    //   1336: ldc_w 2127835460
    //   1339: ixor
    //   1340: ldc2_w -417105313
    //   1343: l2i
    //   1344: ldc_w -1920728738
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 4837, 264389906 -> 1332, 798718801 -> 1376
    //   1376: istore #11
    //   1378: getstatic Perryc.c : I
    //   1381: iflt -> 1395
    //   1384: ldc2_w -1283090260
    //   1387: l2i
    //   1388: ldc_w -716633386
    //   1391: ixor
    //   1392: goto -> 1403
    //   1395: ldc2_w 974960847
    //   1398: l2i
    //   1399: ldc_w -356761757
    //   1402: ixor
    //   1403: ldc2_w -2037571326
    //   1406: l2i
    //   1407: ldc_w 2145353676
    //   1410: ixor
    //   1411: ixor
    //   1412: lookupswitch default -> 1440, -1616982860 -> 4807, 303354419 -> 1395
    //   1440: iload #11
    //   1442: i2f
    //   1443: getstatic Perryc.1 : I
    //   1446: ifeq -> 1460
    //   1449: ldc2_w 431372212
    //   1452: l2i
    //   1453: ldc_w 487779079
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w -641543007
    //   1463: l2i
    //   1464: ldc_w 183590631
    //   1467: ixor
    //   1468: ldc2_w 1326584788
    //   1471: l2i
    //   1472: ldc_w 548751055
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 4849, -1131094179 -> 1504, 1795393960 -> 1460
    //   1504: iload #9
    //   1506: i2f
    //   1507: getstatic Perryc.1 : I
    //   1510: ifeq -> 1524
    //   1513: ldc2_w -855824887
    //   1516: l2i
    //   1517: ldc_w -2096107603
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w 1356666301
    //   1527: l2i
    //   1528: ldc_w -389140752
    //   1531: ixor
    //   1532: ldc2_w 1682587304
    //   1535: l2i
    //   1536: ldc_w -732875742
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 4813, -1457362 -> 1524, 134754759 -> 1568
    //   1568: fload_1
    //   1569: fadd
    //   1570: fcmpg
    //   1571: ifgt -> 1585
    //   1574: ldc2_w 371940068
    //   1577: l2i
    //   1578: ldc_w 13405453
    //   1581: ixor
    //   1582: goto -> 1593
    //   1585: ldc2_w 1096422903
    //   1588: l2i
    //   1589: ldc_w 1472053793
    //   1592: ixor
    //   1593: ldc2_w -1058629283
    //   1596: l2i
    //   1597: ldc_w 1051961579
    //   1600: ixor
    //   1601: ixor
    //   1602: tableswitch default -> 1574, -390928801 -> 1624, -390928800 -> 4686
    //   1624: getstatic Perryc.1 : I
    //   1627: ifeq -> 1641
    //   1630: ldc2_w 1406294565
    //   1633: l2i
    //   1634: ldc_w -1860961359
    //   1637: ixor
    //   1638: goto -> 1649
    //   1641: ldc2_w -889233949
    //   1644: l2i
    //   1645: ldc_w -160312081
    //   1648: ixor
    //   1649: ldc2_w -1178559152
    //   1652: l2i
    //   1653: ldc_w 1714868220
    //   1656: ixor
    //   1657: ixor
    //   1658: lookupswitch default -> 1684, 490206008 -> 4821, 1422070890 -> 1641
    //   1684: iload #4
    //   1686: ifeq -> 1700
    //   1689: ldc2_w -1306023801
    //   1692: l2i
    //   1693: ldc_w 1256740377
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w -536476149
    //   1703: l2i
    //   1704: ldc_w 415889554
    //   1707: ixor
    //   1708: ldc2_w 818061484
    //   1711: l2i
    //   1712: ldc_w -2109437495
    //   1715: ixor
    //   1716: ixor
    //   1717: tableswitch default -> 1689, 1246353403 -> 1740, 1246353404 -> 1870
    //   1740: getstatic Perryc.c : I
    //   1743: iflt -> 1757
    //   1746: ldc2_w 2103194579
    //   1749: l2i
    //   1750: ldc_w 1090397659
    //   1753: ixor
    //   1754: goto -> 1765
    //   1757: ldc2_w -1114153170
    //   1760: l2i
    //   1761: ldc_w -839256702
    //   1764: ixor
    //   1765: ldc2_w -409328251
    //   1768: l2i
    //   1769: ldc_w 2091253258
    //   1772: ixor
    //   1773: ixor
    //   1774: lookupswitch default -> 4755, -1499607673 -> 1757, -346984157 -> 1800
    //   1800: iload #8
    //   1802: getstatic Perryc.1 : I
    //   1805: ifeq -> 1819
    //   1808: ldc2_w -28961947
    //   1811: l2i
    //   1812: ldc_w -1302067251
    //   1815: ixor
    //   1816: goto -> 1827
    //   1819: ldc2_w 469734600
    //   1822: l2i
    //   1823: ldc_w -1633081744
    //   1826: ixor
    //   1827: ldc2_w -27317904
    //   1830: l2i
    //   1831: ldc_w -702384504
    //   1834: ixor
    //   1835: ixor
    //   1836: lookupswitch default -> 4869, -1389630144 -> 1864, 1683966800 -> 1819
    //   1864: fload_1
    //   1865: f2i
    //   1866: isub
    //   1867: goto -> 1934
    //   1870: getstatic Perryc.c : I
    //   1873: iflt -> 1887
    //   1876: ldc2_w 1834192338
    //   1879: l2i
    //   1880: ldc_w -1225190733
    //   1883: ixor
    //   1884: goto -> 1895
    //   1887: ldc2_w -787219347
    //   1890: l2i
    //   1891: ldc_w 1448673641
    //   1894: ixor
    //   1895: ldc2_w -243461875
    //   1898: l2i
    //   1899: ldc_w -2140461799
    //   1902: ixor
    //   1903: ixor
    //   1904: lookupswitch default -> 1932, -1430475915 -> 4767, 658397412 -> 1887
    //   1932: iload #8
    //   1934: getstatic Perryc.c : I
    //   1937: iflt -> 1951
    //   1940: ldc2_w -1545020111
    //   1943: l2i
    //   1944: ldc_w 739460208
    //   1947: ixor
    //   1948: goto -> 1959
    //   1951: ldc2_w -658486341
    //   1954: l2i
    //   1955: ldc_w -1889077843
    //   1958: ixor
    //   1959: ldc2_w 1581323919
    //   1962: l2i
    //   1963: ldc_w -2106605400
    //   1966: ixor
    //   1967: ixor
    //   1968: lookupswitch default -> 4783, -1953994703 -> 1996, 1406488422 -> 1951
    //   1996: istore #12
    //   1998: getstatic Perryc.0 : I
    //   2001: ifle -> 2015
    //   2004: ldc2_w -2094886824
    //   2007: l2i
    //   2008: ldc_w 950132138
    //   2011: ixor
    //   2012: goto -> 2023
    //   2015: ldc2_w 1498857633
    //   2018: l2i
    //   2019: ldc_w 1430205608
    //   2022: ixor
    //   2023: ldc2_w 537405097
    //   2026: l2i
    //   2027: ldc_w 1920795880
    //   2030: ixor
    //   2031: ixor
    //   2032: lookupswitch default -> 2060, -369725517 -> 4805, 173823579 -> 2015
    //   2060: iload #12
    //   2062: i2f
    //   2063: getstatic Perryc.0 : I
    //   2066: ifle -> 2080
    //   2069: ldc2_w -1890415918
    //   2072: l2i
    //   2073: ldc_w 176833959
    //   2076: ixor
    //   2077: goto -> 2088
    //   2080: ldc2_w 1221213735
    //   2083: l2i
    //   2084: ldc_w -1859511811
    //   2087: ixor
    //   2088: ldc2_w -1929634291
    //   2091: l2i
    //   2092: ldc_w 2067894231
    //   2095: ixor
    //   2096: ixor
    //   2097: lookupswitch default -> 2124, 1229769497 -> 2080, 1919245999 -> 4819
    //   2124: iload #4
    //   2126: ifeq -> 2140
    //   2129: ldc2_w -548701247
    //   2132: l2i
    //   2133: ldc_w 1127771644
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w -11848767
    //   2143: l2i
    //   2144: ldc_w 1664624123
    //   2147: ixor
    //   2148: ldc2_w -1584380899
    //   2151: l2i
    //   2152: ldc_w -276053797
    //   2155: ixor
    //   2156: ixor
    //   2157: tableswitch default -> 2129, -764898565 -> 2180, -764898564 -> 2309
    //   2180: getstatic Perryc.c : I
    //   2183: iflt -> 2197
    //   2186: ldc2_w 1879476649
    //   2189: l2i
    //   2190: ldc_w -805127042
    //   2193: ixor
    //   2194: goto -> 2205
    //   2197: ldc2_w 2126089411
    //   2200: l2i
    //   2201: ldc_w 1652913957
    //   2204: ixor
    //   2205: ldc2_w 112721050
    //   2208: l2i
    //   2209: ldc_w 1056545276
    //   2212: ixor
    //   2213: ixor
    //   2214: lookupswitch default -> 2240, -1739960143 -> 4871, -1425024029 -> 2197
    //   2240: iload #8
    //   2242: i2f
    //   2243: getstatic Perryc.c : I
    //   2246: iflt -> 2260
    //   2249: ldc2_w -248610287
    //   2252: l2i
    //   2253: ldc_w -1439585101
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w 528737308
    //   2263: l2i
    //   2264: ldc_w 884168179
    //   2267: ixor
    //   2268: ldc2_w -307953327
    //   2271: l2i
    //   2272: ldc_w 1633682176
    //   2275: ixor
    //   2276: ixor
    //   2277: lookupswitch default -> 4881, -1477069890 -> 2304, -673567501 -> 2260
    //   2304: fload_1
    //   2305: fadd
    //   2306: goto -> 2435
    //   2309: getstatic Perryc.c : I
    //   2312: iflt -> 2326
    //   2315: ldc2_w -1320038261
    //   2318: l2i
    //   2319: ldc_w -988729054
    //   2322: ixor
    //   2323: goto -> 2334
    //   2326: ldc2_w 241847569
    //   2329: l2i
    //   2330: ldc_w -383339212
    //   2333: ixor
    //   2334: ldc2_w -1316160523
    //   2337: l2i
    //   2338: ldc_w -1715894385
    //   2341: ixor
    //   2342: ixor
    //   2343: lookupswitch default -> 2368, 192092862 -> 2326, 1551211987 -> 4763
    //   2368: iload #8
    //   2370: getstatic Perryc.0 : I
    //   2373: ifle -> 2387
    //   2376: ldc2_w -1880394782
    //   2379: l2i
    //   2380: ldc_w 808938768
    //   2383: ixor
    //   2384: goto -> 2395
    //   2387: ldc2_w -1452141696
    //   2390: l2i
    //   2391: ldc_w -2071849692
    //   2394: ixor
    //   2395: ldc2_w 1093258513
    //   2398: l2i
    //   2399: ldc_w 1036808499
    //   2402: ixor
    //   2403: ixor
    //   2404: lookupswitch default -> 4877, -1019632944 -> 2387, 1360378502 -> 2432
    //   2432: iload_2
    //   2433: iadd
    //   2434: i2f
    //   2435: fcmpg
    //   2436: ifge -> 2450
    //   2439: ldc2_w -1120972202
    //   2442: l2i
    //   2443: ldc_w 1369907253
    //   2446: ixor
    //   2447: goto -> 2458
    //   2450: ldc2_w 565384036
    //   2453: l2i
    //   2454: ldc_w -851746552
    //   2457: ixor
    //   2458: ldc2_w -2020181643
    //   2461: l2i
    //   2462: ldc_w 1213907313
    //   2465: ixor
    //   2466: ixor
    //   2467: tableswitch default -> 2439, 591710823 -> 2488, 591710824 -> 4680
    //   2488: getstatic Perryc.c : I
    //   2491: iflt -> 2505
    //   2494: ldc2_w -323016904
    //   2497: l2i
    //   2498: ldc_w 361627251
    //   2501: ixor
    //   2502: goto -> 2513
    //   2505: ldc2_w -865616249
    //   2508: l2i
    //   2509: ldc_w 515171407
    //   2512: ixor
    //   2513: ldc2_w 1867231330
    //   2516: l2i
    //   2517: ldc_w -1876629154
    //   2520: ixor
    //   2521: ixor
    //   2522: lookupswitch default -> 4761, 106791031 -> 2505, 767296500 -> 2548
    //   2548: iload #7
    //   2550: getstatic Perryc.0 : I
    //   2553: ifle -> 2567
    //   2556: ldc2_w 155764089
    //   2559: l2i
    //   2560: ldc_w 491529992
    //   2563: ixor
    //   2564: goto -> 2575
    //   2567: ldc2_w 2000532671
    //   2570: l2i
    //   2571: ldc_w -790475479
    //   2574: ixor
    //   2575: ldc2_w -719536229
    //   2578: l2i
    //   2579: ldc_w 1787243940
    //   2582: ixor
    //   2583: ixor
    //   2584: lookupswitch default -> 4789, -1415614386 -> 2567, 407137193 -> 2612
    //   2612: iload #10
    //   2614: isub
    //   2615: getstatic Perryc.1 : I
    //   2618: ifeq -> 2632
    //   2621: ldc2_w -1256453193
    //   2624: l2i
    //   2625: ldc_w 1402872081
    //   2628: ixor
    //   2629: goto -> 2640
    //   2632: ldc2_w 596605932
    //   2635: l2i
    //   2636: ldc_w -153367090
    //   2639: ixor
    //   2640: ldc2_w 578535301
    //   2643: l2i
    //   2644: ldc_w 575134047
    //   2647: ixor
    //   2648: ixor
    //   2649: lookupswitch default -> 4823, -714551048 -> 2676, -423736196 -> 2632
    //   2676: iload #7
    //   2678: getstatic Perryc.0 : I
    //   2681: ifle -> 2695
    //   2684: ldc2_w 1077045482
    //   2687: l2i
    //   2688: ldc_w -458200484
    //   2691: ixor
    //   2692: goto -> 2703
    //   2695: ldc2_w 1134070160
    //   2698: l2i
    //   2699: ldc_w -2057723032
    //   2702: ixor
    //   2703: ldc2_w -334713829
    //   2706: l2i
    //   2707: ldc_w -938178028
    //   2710: ixor
    //   2711: ixor
    //   2712: lookupswitch default -> 2740, -2137381703 -> 4851, 779354863 -> 2695
    //   2740: iload #10
    //   2742: isub
    //   2743: imul
    //   2744: getstatic Perryc.1 : I
    //   2747: ifeq -> 2761
    //   2750: ldc2_w -967893507
    //   2753: l2i
    //   2754: ldc_w -1692571270
    //   2757: ixor
    //   2758: goto -> 2769
    //   2761: ldc2_w 205748035
    //   2764: l2i
    //   2765: ldc_w -967763527
    //   2768: ixor
    //   2769: ldc2_w -199459278
    //   2772: l2i
    //   2773: ldc_w -1884127303
    //   2776: ixor
    //   2777: ixor
    //   2778: lookupswitch default -> 4833, -1313050767 -> 2804, 654079244 -> 2761
    //   2804: iload #9
    //   2806: getstatic Perryc.0 : I
    //   2809: ifle -> 2823
    //   2812: ldc2_w 857538056
    //   2815: l2i
    //   2816: ldc_w 726396049
    //   2819: ixor
    //   2820: goto -> 2831
    //   2823: ldc2_w -215948088
    //   2826: l2i
    //   2827: ldc_w -628891133
    //   2830: ixor
    //   2831: ldc2_w -862015002
    //   2834: l2i
    //   2835: ldc_w -1617725096
    //   2838: ixor
    //   2839: ixor
    //   2840: lookupswitch default -> 4765, 1264245287 -> 2823, 2058276469 -> 2868
    //   2868: iload #11
    //   2870: isub
    //   2871: getstatic Perryc.1 : I
    //   2874: ifeq -> 2888
    //   2877: ldc2_w 542215456
    //   2880: l2i
    //   2881: ldc_w 966254886
    //   2884: ixor
    //   2885: goto -> 2896
    //   2888: ldc2_w -1811755331
    //   2891: l2i
    //   2892: ldc_w -249726168
    //   2895: ixor
    //   2896: ldc2_w 918624721
    //   2899: l2i
    //   2900: ldc_w 739831672
    //   2903: ixor
    //   2904: ixor
    //   2905: lookupswitch default -> 2932, 52402863 -> 4857, 1226462577 -> 2888
    //   2932: iload #9
    //   2934: getstatic Perryc.1 : I
    //   2937: ifeq -> 2951
    //   2940: ldc2_w 715578072
    //   2943: l2i
    //   2944: ldc_w 257245288
    //   2947: ixor
    //   2948: goto -> 2959
    //   2951: ldc2_w -121445993
    //   2954: l2i
    //   2955: ldc_w 552668817
    //   2958: ixor
    //   2959: ldc2_w 1283750177
    //   2962: l2i
    //   2963: ldc_w -1063098483
    //   2966: ixor
    //   2967: ixor
    //   2968: lookupswitch default -> 2996, -1445624804 -> 4771, -557769320 -> 2951
    //   2996: iload #11
    //   2998: isub
    //   2999: imul
    //   3000: iadd
    //   3001: getstatic Perryc.1 : I
    //   3004: ifeq -> 3018
    //   3007: ldc2_w -1713611666
    //   3010: l2i
    //   3011: ldc_w 911415001
    //   3014: ixor
    //   3015: goto -> 3026
    //   3018: ldc2_w -1696521910
    //   3021: l2i
    //   3022: ldc_w 254635347
    //   3025: ixor
    //   3026: ldc2_w 1191422333
    //   3029: l2i
    //   3030: ldc_w 1437057295
    //   3033: ixor
    //   3034: ixor
    //   3035: lookupswitch default -> 3060, -1121246523 -> 4845, -306062891 -> 3018
    //   3060: iload #4
    //   3062: ifeq -> 3076
    //   3065: ldc2_w -773690281
    //   3068: l2i
    //   3069: ldc_w -1117297299
    //   3072: ixor
    //   3073: goto -> 3084
    //   3076: ldc2_w 195519351
    //   3079: l2i
    //   3080: ldc_w 1730308684
    //   3083: ixor
    //   3084: ldc2_w 831906339
    //   3087: l2i
    //   3088: ldc_w 1448976953
    //   3091: ixor
    //   3092: ixor
    //   3093: tableswitch default -> 3065, 189614368 -> 3116, 189614369 -> 3375
    //   3116: getstatic Perryc.0 : I
    //   3119: ifle -> 3133
    //   3122: ldc2_w 2003207306
    //   3125: l2i
    //   3126: ldc_w -532825801
    //   3129: ixor
    //   3130: goto -> 3141
    //   3133: ldc2_w -963331211
    //   3136: l2i
    //   3137: ldc_w 1515396140
    //   3140: ixor
    //   3141: ldc2_w -1575425322
    //   3144: l2i
    //   3145: ldc_w 1864793188
    //   3148: ixor
    //   3149: ixor
    //   3150: lookupswitch default -> 4863, 1375285739 -> 3176, 1516612367 -> 3133
    //   3176: iload #8
    //   3178: getstatic Perryc.1 : I
    //   3181: ifeq -> 3195
    //   3184: ldc2_w 2056115834
    //   3187: l2i
    //   3188: ldc_w 264353293
    //   3191: ixor
    //   3192: goto -> 3203
    //   3195: ldc2_w 857685075
    //   3198: l2i
    //   3199: ldc_w -559936368
    //   3202: ixor
    //   3203: ldc2_w -2128552212
    //   3206: l2i
    //   3207: ldc_w -430384105
    //   3210: ixor
    //   3211: ixor
    //   3212: lookupswitch default -> 3240, 305422988 -> 4867, 658451676 -> 3195
    //   3240: iload #12
    //   3242: isub
    //   3243: getstatic Perryc.0 : I
    //   3246: ifle -> 3260
    //   3249: ldc2_w 923309089
    //   3252: l2i
    //   3253: ldc_w -1178910196
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w 675870476
    //   3263: l2i
    //   3264: ldc_w 1736391952
    //   3267: ixor
    //   3268: ldc2_w -377243411
    //   3271: l2i
    //   3272: ldc_w 991484465
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 4797, -1649628992 -> 3304, 1546171633 -> 3260
    //   3304: iload #8
    //   3306: getstatic Perryc.1 : I
    //   3309: ifeq -> 3323
    //   3312: ldc2_w -2089491457
    //   3315: l2i
    //   3316: ldc_w 965191408
    //   3319: ixor
    //   3320: goto -> 3331
    //   3323: ldc2_w -749790380
    //   3326: l2i
    //   3327: ldc_w 369756637
    //   3330: ixor
    //   3331: ldc2_w -528791947
    //   3334: l2i
    //   3335: ldc_w 578822149
    //   3338: ixor
    //   3339: ixor
    //   3340: lookupswitch default -> 3368, -1507210952 -> 3323, 2013799295 -> 4815
    //   3368: iload #12
    //   3370: isub
    //   3371: imul
    //   3372: goto -> 3383
    //   3375: ldc2_w -41484380
    //   3378: l2i
    //   3379: ldc_w -41484380
    //   3382: ixor
    //   3383: iadd
    //   3384: i2d
    //   3385: getstatic Perryc.1 : I
    //   3388: ifeq -> 3402
    //   3391: ldc2_w -1296191067
    //   3394: l2i
    //   3395: ldc_w -1151366977
    //   3398: ixor
    //   3399: goto -> 3410
    //   3402: ldc2_w 1063646954
    //   3405: l2i
    //   3406: ldc_w 659464738
    //   3409: ixor
    //   3410: ldc2_w -459720912
    //   3413: l2i
    //   3414: ldc_w -1188467162
    //   3417: ixor
    //   3418: ixor
    //   3419: lookupswitch default -> 3444, -517765794 -> 3402, 1414684684 -> 4829
    //   3444: dstore #13
    //   3446: getstatic Perryc.c : I
    //   3449: iflt -> 3463
    //   3452: ldc2_w 1103182256
    //   3455: l2i
    //   3456: ldc_w 1660162663
    //   3459: ixor
    //   3460: goto -> 3471
    //   3463: ldc2_w -846876246
    //   3466: l2i
    //   3467: ldc_w 566598049
    //   3470: ixor
    //   3471: ldc2_w -1268967146
    //   3474: l2i
    //   3475: ldc_w 1135052762
    //   3478: ixor
    //   3479: ixor
    //   3480: lookupswitch default -> 3508, -724585189 -> 4777, -262775523 -> 3463
    //   3508: dload #13
    //   3510: getstatic Perryc.c : I
    //   3513: iflt -> 3527
    //   3516: ldc2_w 839220692
    //   3519: l2i
    //   3520: ldc_w 1843709275
    //   3523: ixor
    //   3524: goto -> 3535
    //   3527: ldc2_w 1726048652
    //   3530: l2i
    //   3531: ldc_w -1609383183
    //   3534: ixor
    //   3535: ldc2_w 883938133
    //   3538: l2i
    //   3539: ldc_w -1089460083
    //   3542: ixor
    //   3543: ixor
    //   3544: lookupswitch default -> 3572, -732019881 -> 4791, -625526305 -> 3527
    //   3572: fload_1
    //   3573: getstatic Perryc.0 : I
    //   3576: ifle -> 3590
    //   3579: ldc2_w -131513607
    //   3582: l2i
    //   3583: ldc_w -1202529251
    //   3586: ixor
    //   3587: goto -> 3598
    //   3590: ldc2_w 42025448
    //   3593: l2i
    //   3594: ldc_w 1874751776
    //   3597: ixor
    //   3598: ldc2_w 1103700386
    //   3601: l2i
    //   3602: ldc_w 328243484
    //   3605: ixor
    //   3606: ixor
    //   3607: lookupswitch default -> 4883, 304227930 -> 3590, 1063684214 -> 3632
    //   3632: fload_1
    //   3633: fmul
    //   3634: f2d
    //   3635: dcmpg
    //   3636: ifge -> 3650
    //   3639: ldc2_w 300643770
    //   3642: l2i
    //   3643: ldc_w -478384046
    //   3646: ixor
    //   3647: goto -> 3658
    //   3650: ldc2_w -358911406
    //   3653: l2i
    //   3654: ldc_w 403470267
    //   3657: ixor
    //   3658: ldc2_w 1317963032
    //   3661: l2i
    //   3662: ldc_w 1460551960
    //   3665: ixor
    //   3666: ixor
    //   3667: tableswitch default -> 3639, -350764568 -> 3688, -350764567 -> 4674
    //   3688: getstatic Perryc.0 : I
    //   3691: ifle -> 3705
    //   3694: ldc2_w -172443200
    //   3697: l2i
    //   3698: ldc_w 651475526
    //   3701: ixor
    //   3702: goto -> 3713
    //   3705: ldc2_w -213778980
    //   3708: l2i
    //   3709: ldc_w -89008708
    //   3712: ixor
    //   3713: ldc2_w -991377029
    //   3716: l2i
    //   3717: ldc_w 1755785496
    //   3720: ixor
    //   3721: ixor
    //   3722: lookupswitch default -> 3748, 1693328310 -> 3705, 2133058533 -> 4855
    //   3748: iload_3
    //   3749: ifeq -> 3763
    //   3752: ldc2_w -1577932767
    //   3755: l2i
    //   3756: ldc_w -40451675
    //   3759: ixor
    //   3760: goto -> 3771
    //   3763: ldc2_w -1341489703
    //   3766: l2i
    //   3767: ldc_w -328330146
    //   3770: ixor
    //   3771: ldc2_w 517184379
    //   3774: l2i
    //   3775: ldc_w -1771663710
    //   3778: ixor
    //   3779: ixor
    //   3780: tableswitch default -> 3752, -724468643 -> 3804, -724468642 -> 4076
    //   3804: getstatic Perryc.0 : I
    //   3807: ifle -> 3821
    //   3810: ldc2_w 512802583
    //   3813: l2i
    //   3814: ldc_w 449155457
    //   3817: ixor
    //   3818: goto -> 3829
    //   3821: ldc2_w 1674096802
    //   3824: l2i
    //   3825: ldc_w -2120249656
    //   3828: ixor
    //   3829: ldc2_w -87419306
    //   3832: l2i
    //   3833: ldc_w 766869325
    //   3836: ixor
    //   3837: ixor
    //   3838: lookupswitch default -> 4775, -752203891 -> 3821, 891836273 -> 3864
    //   3864: dload #13
    //   3866: getstatic Perryc.c : I
    //   3869: iflt -> 3883
    //   3872: ldc2_w 17303232
    //   3875: l2i
    //   3876: ldc_w -735579632
    //   3879: ixor
    //   3880: goto -> 3891
    //   3883: ldc2_w -782468157
    //   3886: l2i
    //   3887: ldc_w 183760085
    //   3890: ixor
    //   3891: ldc2_w -522901552
    //   3894: l2i
    //   3895: ldc_w 872047217
    //   3898: ixor
    //   3899: ixor
    //   3900: lookupswitch default -> 3928, 100708721 -> 4799, 1997884227 -> 3883
    //   3928: fload_1
    //   3929: ldc_w 5.3955674
    //   3932: invokestatic floatToIntBits : (F)I
    //   3935: ldc_w 2133633149
    //   3938: ixor
    //   3939: invokestatic intBitsToFloat : (I)F
    //   3942: fsub
    //   3943: getstatic Perryc.1 : I
    //   3946: ifeq -> 3960
    //   3949: ldc2_w 934722024
    //   3952: l2i
    //   3953: ldc_w 1115024633
    //   3956: ixor
    //   3957: goto -> 3968
    //   3960: ldc2_w -290409506
    //   3963: l2i
    //   3964: ldc_w -1663109590
    //   3967: ixor
    //   3968: ldc2_w -2105194395
    //   3971: l2i
    //   3972: ldc_w 768468881
    //   3975: ixor
    //   3976: ixor
    //   3977: lookupswitch default -> 4803, -628360475 -> 3960, -584652288 -> 4004
    //   4004: fload_1
    //   4005: ldc_w 4.6515236
    //   4008: invokestatic floatToIntBits : (F)I
    //   4011: ldc_w 2132072776
    //   4014: ixor
    //   4015: invokestatic intBitsToFloat : (I)F
    //   4018: fsub
    //   4019: fmul
    //   4020: f2d
    //   4021: dcmpg
    //   4022: iflt -> 4036
    //   4025: ldc2_w -169000881
    //   4028: l2i
    //   4029: ldc_w -1538309471
    //   4032: ixor
    //   4033: goto -> 4044
    //   4036: ldc2_w -439175934
    //   4039: l2i
    //   4040: ldc_w -1267681299
    //   4043: ixor
    //   4044: ldc2_w 898486457
    //   4047: l2i
    //   4048: ldc_w 1112959383
    //   4051: ixor
    //   4052: ixor
    //   4053: tableswitch default -> 4025, 645512128 -> 4076, 645512129 -> 4674
    //   4076: new net/minecraft/util/math/BlockPos
    //   4079: dup
    //   4080: getstatic Perryc.1 : I
    //   4083: ifeq -> 4097
    //   4086: ldc2_w 1168579682
    //   4089: l2i
    //   4090: ldc_w -2111457993
    //   4093: ixor
    //   4094: goto -> 4105
    //   4097: ldc2_w 1938574023
    //   4100: l2i
    //   4101: ldc_w -2008616959
    //   4104: ixor
    //   4105: ldc2_w 1382136073
    //   4108: l2i
    //   4109: ldc_w -108910739
    //   4112: ixor
    //   4113: ixor
    //   4114: lookupswitch default -> 4801, 1344873634 -> 4140, 1818310449 -> 4097
    //   4140: iload #10
    //   4142: getstatic Perryc.c : I
    //   4145: iflt -> 4159
    //   4148: ldc2_w -1880738332
    //   4151: l2i
    //   4152: ldc_w 1134368630
    //   4155: ixor
    //   4156: goto -> 4167
    //   4159: ldc2_w -242424625
    //   4162: l2i
    //   4163: ldc_w 8292783
    //   4166: ixor
    //   4167: ldc2_w -1105054466
    //   4170: l2i
    //   4171: ldc_w 350270449
    //   4174: ixor
    //   4175: ixor
    //   4176: lookupswitch default -> 4204, -761379894 -> 4159, 1723442589 -> 4811
    //   4204: iload #12
    //   4206: getstatic Perryc.c : I
    //   4209: iflt -> 4223
    //   4212: ldc2_w -1621687840
    //   4215: l2i
    //   4216: ldc_w 1808613375
    //   4219: ixor
    //   4220: goto -> 4231
    //   4223: ldc2_w 853354533
    //   4226: l2i
    //   4227: ldc_w -1375323105
    //   4230: ixor
    //   4231: ldc2_w 1406521943
    //   4234: l2i
    //   4235: ldc_w -1811670783
    //   4238: ixor
    //   4239: ixor
    //   4240: lookupswitch default -> 4873, 860616009 -> 4223, 1527439212 -> 4268
    //   4268: iload #5
    //   4270: iadd
    //   4271: getstatic Perryc.1 : I
    //   4274: ifeq -> 4288
    //   4277: ldc2_w 1637908546
    //   4280: l2i
    //   4281: ldc_w 843477994
    //   4284: ixor
    //   4285: goto -> 4296
    //   4288: ldc2_w -1052452127
    //   4291: l2i
    //   4292: ldc_w -1976807405
    //   4295: ixor
    //   4296: ldc2_w 1334819361
    //   4299: l2i
    //   4300: ldc_w -388149366
    //   4303: ixor
    //   4304: ixor
    //   4305: lookupswitch default -> 4332, -189528573 -> 4839, 169817581 -> 4288
    //   4332: iload #11
    //   4334: getstatic Perryc.1 : I
    //   4337: ifeq -> 4351
    //   4340: ldc2_w -1091688077
    //   4343: l2i
    //   4344: ldc_w -414448676
    //   4347: ixor
    //   4348: goto -> 4359
    //   4351: ldc2_w -1031314500
    //   4354: l2i
    //   4355: ldc_w 1901382413
    //   4358: ixor
    //   4359: ldc2_w -1781740118
    //   4362: l2i
    //   4363: ldc_w 1673075877
    //   4366: ixor
    //   4367: ixor
    //   4368: lookupswitch default -> 4396, -1344799840 -> 4759, -263587433 -> 4351
    //   4396: goto -> 4400
    //   4399: athrow
    //   4400: invokespecial <init> : (III)V
    //   4403: goto -> 4407
    //   4406: athrow
    //   4407: getstatic Perryc.c : I
    //   4410: iflt -> 4424
    //   4413: ldc2_w -1868364690
    //   4416: l2i
    //   4417: ldc_w -796126701
    //   4420: ixor
    //   4421: goto -> 4432
    //   4424: ldc2_w -1151338864
    //   4427: l2i
    //   4428: ldc_w -785122545
    //   4431: ixor
    //   4432: ldc2_w 838144401
    //   4435: l2i
    //   4436: ldc_w 499392294
    //   4439: ixor
    //   4440: ixor
    //   4441: lookupswitch default -> 4865, 1180500776 -> 4468, 1813911754 -> 4424
    //   4468: astore #15
    //   4470: getstatic Perryc.0 : I
    //   4473: ifle -> 4487
    //   4476: ldc2_w 1155381513
    //   4479: l2i
    //   4480: ldc_w -1614450766
    //   4483: ixor
    //   4484: goto -> 4495
    //   4487: ldc2_w 753124171
    //   4490: l2i
    //   4491: ldc_w -1394156751
    //   4494: ixor
    //   4495: ldc2_w 593452836
    //   4498: l2i
    //   4499: ldc_w 1650661087
    //   4502: ixor
    //   4503: ixor
    //   4504: lookupswitch default -> 4809, -1708875968 -> 4487, -1053208191 -> 4532
    //   4532: aload #6
    //   4534: getstatic Perryc.1 : I
    //   4537: ifeq -> 4551
    //   4540: ldc2_w 226636343
    //   4543: l2i
    //   4544: ldc_w 1580729683
    //   4547: ixor
    //   4548: goto -> 4559
    //   4551: ldc2_w -1996190342
    //   4554: l2i
    //   4555: ldc_w -1716367108
    //   4558: ixor
    //   4559: ldc2_w -421143394
    //   4562: l2i
    //   4563: ldc_w -2014150545
    //   4566: ixor
    //   4567: ixor
    //   4568: lookupswitch default -> 4596, -571359215 -> 4551, 850226069 -> 4875
    //   4596: aload #15
    //   4598: getstatic Perryc.0 : I
    //   4601: ifle -> 4615
    //   4604: ldc2_w -579107130
    //   4607: l2i
    //   4608: ldc_w -1327665168
    //   4611: ixor
    //   4612: goto -> 4623
    //   4615: ldc2_w -1361621073
    //   4618: l2i
    //   4619: ldc_w -610799920
    //   4622: ixor
    //   4623: ldc2_w -2088606184
    //   4626: l2i
    //   4627: ldc_w -1727276021
    //   4630: ixor
    //   4631: ixor
    //   4632: lookupswitch default -> 4769, 1875450732 -> 4660, 1999590181 -> 4615
    //   4660: goto -> 4664
    //   4663: athrow
    //   4664: invokeinterface add : (Ljava/lang/Object;)Z
    //   4669: goto -> 4673
    //   4672: athrow
    //   4673: pop
    //   4674: iinc #12, 1
    //   4677: goto -> 1998
    //   4680: iinc #11, 1
    //   4683: goto -> 1378
    //   4686: iinc #10, 1
    //   4689: goto -> 942
    //   4692: getstatic Perryc.0 : I
    //   4695: ifle -> 4709
    //   4698: ldc2_w 1638343417
    //   4701: l2i
    //   4702: ldc_w -1921140398
    //   4705: ixor
    //   4706: goto -> 4717
    //   4709: ldc2_w 1766558829
    //   4712: l2i
    //   4713: ldc_w 2101856387
    //   4716: ixor
    //   4717: ldc2_w 239394078
    //   4720: l2i
    //   4721: ldc_w 107562695
    //   4724: ixor
    //   4725: ixor
    //   4726: lookupswitch default -> 4752, -453574542 -> 4843, 1576929547 -> 4709
    //   4752: aload #6
    //   4754: areturn
    //   4755: aconst_null
    //   4756: athrow
    //   4757: aconst_null
    //   4758: athrow
    //   4759: aconst_null
    //   4760: athrow
    //   4761: aconst_null
    //   4762: athrow
    //   4763: aconst_null
    //   4764: athrow
    //   4765: aconst_null
    //   4766: athrow
    //   4767: aconst_null
    //   4768: athrow
    //   4769: aconst_null
    //   4770: athrow
    //   4771: aconst_null
    //   4772: athrow
    //   4773: aconst_null
    //   4774: athrow
    //   4775: aconst_null
    //   4776: athrow
    //   4777: aconst_null
    //   4778: athrow
    //   4779: aconst_null
    //   4780: athrow
    //   4781: aconst_null
    //   4782: athrow
    //   4783: aconst_null
    //   4784: athrow
    //   4785: aconst_null
    //   4786: athrow
    //   4787: aconst_null
    //   4788: athrow
    //   4789: aconst_null
    //   4790: athrow
    //   4791: aconst_null
    //   4792: athrow
    //   4793: aconst_null
    //   4794: athrow
    //   4795: aconst_null
    //   4796: athrow
    //   4797: aconst_null
    //   4798: athrow
    //   4799: aconst_null
    //   4800: athrow
    //   4801: aconst_null
    //   4802: athrow
    //   4803: aconst_null
    //   4804: athrow
    //   4805: aconst_null
    //   4806: athrow
    //   4807: aconst_null
    //   4808: athrow
    //   4809: aconst_null
    //   4810: athrow
    //   4811: aconst_null
    //   4812: athrow
    //   4813: aconst_null
    //   4814: athrow
    //   4815: aconst_null
    //   4816: athrow
    //   4817: aconst_null
    //   4818: athrow
    //   4819: aconst_null
    //   4820: athrow
    //   4821: aconst_null
    //   4822: athrow
    //   4823: aconst_null
    //   4824: athrow
    //   4825: aconst_null
    //   4826: athrow
    //   4827: aconst_null
    //   4828: athrow
    //   4829: aconst_null
    //   4830: athrow
    //   4831: aconst_null
    //   4832: athrow
    //   4833: aconst_null
    //   4834: athrow
    //   4835: aconst_null
    //   4836: athrow
    //   4837: aconst_null
    //   4838: athrow
    //   4839: aconst_null
    //   4840: athrow
    //   4841: aconst_null
    //   4842: athrow
    //   4843: aconst_null
    //   4844: athrow
    //   4845: aconst_null
    //   4846: athrow
    //   4847: aconst_null
    //   4848: athrow
    //   4849: aconst_null
    //   4850: athrow
    //   4851: aconst_null
    //   4852: athrow
    //   4853: aconst_null
    //   4854: athrow
    //   4855: aconst_null
    //   4856: athrow
    //   4857: aconst_null
    //   4858: athrow
    //   4859: aconst_null
    //   4860: athrow
    //   4861: aconst_null
    //   4862: athrow
    //   4863: aconst_null
    //   4864: athrow
    //   4865: aconst_null
    //   4866: athrow
    //   4867: aconst_null
    //   4868: athrow
    //   4869: aconst_null
    //   4870: athrow
    //   4871: aconst_null
    //   4872: athrow
    //   4873: aconst_null
    //   4874: athrow
    //   4875: aconst_null
    //   4876: athrow
    //   4877: aconst_null
    //   4878: athrow
    //   4879: aconst_null
    //   4880: athrow
    //   4881: aconst_null
    //   4882: athrow
    //   4883: aconst_null
    //   4884: athrow
    //   4885: pop
    //   4886: goto -> 24
    //   4889: pop
    //   4890: aconst_null
    //   4891: goto -> 4885
    //   4894: dup
    //   4895: ifnull -> 4885
    //   4898: checkcast java/lang/Throwable
    //   4901: athrow
    //   4902: dup
    //   4903: ifnull -> 4889
    //   4906: checkcast java/lang/Throwable
    //   4909: athrow
    //   4910: aconst_null
    //   4911: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   4470	204	15	l	Lnet/minecraft/util/math/BlockPos;
    //   3446	1228	13	dist	D
    //   1998	2682	12	y	I
    //   1378	3308	11	z	I
    //   942	3750	10	x	I
    //   24	4731	0	loc	Lnet/minecraft/util/math/BlockPos;
    //   24	4731	1	r	F
    //   24	4731	2	h	I
    //   24	4731	3	hollow	Z
    //   24	4731	4	sphere	Z
    //   24	4731	5	plusY	I
    //   162	4593	6	circleBlocks	Ljava/util/List;
    //   358	4397	7	cx	I
    //   554	4201	8	cy	I
    //   750	4005	9	cz	I
    // Local variable type table:
    //   start	length	slot	name	signature
    //   162	4593	6	circleBlocks	Ljava/util/List<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	4894	java/lang/ClassCastException
    //   91	98	98	finally
    //   91	98	91	java/lang/RuntimeException
    //   91	98	91	java/lang/NegativeArraySizeException
    //   91	98	91	java/lang/NegativeArraySizeException
    //   92	98	98	finally
    //   287	294	294	finally
    //   287	294	294	finally
    //   287	294	287	finally
    //   288	294	287	java/lang/AssertionError
    //   288	294	3	java/util/NoSuchElementException
    //   483	490	490	finally
    //   483	490	3	java/lang/ClassCastException
    //   483	490	483	finally
    //   484	490	3	java/lang/AssertionError
    //   484	490	483	finally
    //   679	686	686	finally
    //   679	686	3	java/lang/ArithmeticException
    //   679	686	686	finally
    //   679	686	679	java/lang/NegativeArraySizeException
    //   680	686	686	java/lang/ArithmeticException
    //   4400	4406	4406	finally
    //   4400	4406	4406	java/lang/RuntimeException
    //   4400	4406	4406	finally
    //   4400	4406	4406	finally
    //   4400	4406	4406	java/lang/IllegalStateException
    //   4663	4672	4672	finally
    //   4663	4672	4672	java/lang/IllegalStateException
    //   4663	4672	4672	java/lang/UnsupportedOperationException
    //   4664	4672	4663	finally
    //   4664	4672	4663	finally
    //   4894	4902	4894	java/lang/ArrayIndexOutOfBoundsException
    //   4910	4912	3	java/lang/RuntimeException
  }
  
  public static List getUntrappedBlocks(EntityPlayer player, boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4178
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 4170
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4162
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1774209020
    //   37: l2i
    //   38: ldc_w -1616050475
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1660600921
    //   48: l2i
    //   49: ldc_w 744751736
    //   52: ixor
    //   53: ldc2_w -1737633885
    //   56: l2i
    //   57: ldc_w 665291563
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 4075, -246119255 -> 88, 1235682721 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w 658544188
    //   108: l2i
    //   109: ldc_w 1295094283
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1640682769
    //   119: l2i
    //   120: ldc_w -281795341
    //   123: ixor
    //   124: ldc2_w -770422571
    //   127: l2i
    //   128: ldc_w 279202544
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 4061, -1463745006 -> 116, -1280242631 -> 160
    //   160: astore #6
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w 345232672
    //   171: l2i
    //   172: ldc_w 473910406
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -1067899611
    //   182: l2i
    //   183: ldc_w -576443056
    //   186: ixor
    //   187: ldc2_w -326579068
    //   190: l2i
    //   191: ldc_w -1285123366
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 4101, 1108563499 -> 224, 1463994360 -> 179
    //   224: iload_2
    //   225: ifne -> 239
    //   228: ldc2_w 273009038
    //   231: l2i
    //   232: ldc_w 1038225183
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w -1241328065
    //   242: l2i
    //   243: ldc_w -1683681107
    //   246: ixor
    //   247: ldc2_w -1788702025
    //   250: l2i
    //   251: ldc_w -1984857025
    //   254: ixor
    //   255: ixor
    //   256: tableswitch default -> 228, 829696025 -> 280, 829696026 -> 848
    //   280: getstatic Perryc.0 : I
    //   283: ifle -> 297
    //   286: ldc2_w -242804332
    //   289: l2i
    //   290: ldc_w -783956926
    //   293: ixor
    //   294: goto -> 305
    //   297: ldc2_w 1806091820
    //   300: l2i
    //   301: ldc_w -992401788
    //   304: ixor
    //   305: ldc2_w 304680314
    //   308: l2i
    //   309: ldc_w -1414353101
    //   312: ixor
    //   313: ixor
    //   314: lookupswitch default -> 4111, -1722187873 -> 297, 384058081 -> 340
    //   340: aload_0
    //   341: ldc2_w -149698825
    //   344: l2i
    //   345: ldc_w -149698827
    //   348: ixor
    //   349: ldc2_w 1644689310
    //   352: l2i
    //   353: ldc_w 1644689310
    //   356: ixor
    //   357: getstatic Perryc.0 : I
    //   360: ifle -> 374
    //   363: ldc2_w 1374649432
    //   366: l2i
    //   367: ldc_w 134411082
    //   370: ixor
    //   371: goto -> 382
    //   374: ldc2_w -365789739
    //   377: l2i
    //   378: ldc_w -632154102
    //   381: ixor
    //   382: ldc2_w 107499393
    //   385: l2i
    //   386: ldc_w 1109506604
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 416, 497318591 -> 4079, 589269009 -> 374
    //   416: goto -> 420
    //   419: athrow
    //   420: invokestatic getUnsafeBlocks : (Lnet/minecraft/entity/Entity;IZ)Ljava/util/List;
    //   423: goto -> 427
    //   426: athrow
    //   427: getstatic Perryc.c : I
    //   430: iflt -> 444
    //   433: ldc2_w -1465625301
    //   436: l2i
    //   437: ldc_w 737906052
    //   440: ixor
    //   441: goto -> 452
    //   444: ldc2_w -440670445
    //   447: l2i
    //   448: ldc_w -1301453369
    //   451: ixor
    //   452: ldc2_w -1889066415
    //   455: l2i
    //   456: ldc_w 1841002239
    //   459: ixor
    //   460: ixor
    //   461: lookupswitch default -> 488, 1345436683 -> 444, 1636011009 -> 4071
    //   488: goto -> 492
    //   491: athrow
    //   492: invokeinterface size : ()I
    //   497: goto -> 501
    //   500: athrow
    //   501: ldc2_w -119859202
    //   504: l2i
    //   505: ldc_w -119859206
    //   508: ixor
    //   509: if_icmpne -> 523
    //   512: ldc2_w 160988126
    //   515: l2i
    //   516: ldc_w 1677023641
    //   519: ixor
    //   520: goto -> 531
    //   523: ldc2_w -1146604182
    //   526: l2i
    //   527: ldc_w -775612628
    //   530: ixor
    //   531: ldc2_w 626968873
    //   534: l2i
    //   535: ldc_w -1059299786
    //   538: ixor
    //   539: ixor
    //   540: tableswitch default -> 512, -1880115880 -> 564, -1880115879 -> 848
    //   564: getstatic Perryc.0 : I
    //   567: ifle -> 581
    //   570: ldc2_w 613900657
    //   573: l2i
    //   574: ldc_w 1787478901
    //   577: ixor
    //   578: goto -> 589
    //   581: ldc2_w 1620712527
    //   584: l2i
    //   585: ldc_w 199456149
    //   588: ixor
    //   589: ldc2_w 999850076
    //   592: l2i
    //   593: ldc_w 346314669
    //   596: ixor
    //   597: ixor
    //   598: lookupswitch default -> 4069, 1145421355 -> 624, 1629582837 -> 581
    //   624: aload #6
    //   626: getstatic Perryc.c : I
    //   629: iflt -> 643
    //   632: ldc2_w 1502644938
    //   635: l2i
    //   636: ldc_w -1691126452
    //   639: ixor
    //   640: goto -> 651
    //   643: ldc2_w -1203465383
    //   646: l2i
    //   647: ldc_w 71147990
    //   650: ixor
    //   651: ldc2_w -824649197
    //   654: l2i
    //   655: ldc_w -2055997620
    //   658: ixor
    //   659: ixor
    //   660: lookupswitch default -> 4067, -1995910439 -> 643, -137224240 -> 688
    //   688: aload_0
    //   689: ldc2_w 1882253800
    //   692: l2i
    //   693: ldc_w 1882253802
    //   696: ixor
    //   697: ldc2_w 1660232540
    //   700: l2i
    //   701: ldc_w 1660232540
    //   704: ixor
    //   705: getstatic Perryc.0 : I
    //   708: ifle -> 722
    //   711: ldc2_w 966205686
    //   714: l2i
    //   715: ldc_w -1930642235
    //   718: ixor
    //   719: goto -> 730
    //   722: ldc2_w 203298022
    //   725: l2i
    //   726: ldc_w -303454761
    //   729: ixor
    //   730: ldc2_w -564676988
    //   733: l2i
    //   734: ldc_w -944514211
    //   737: ixor
    //   738: ixor
    //   739: lookupswitch default -> 4077, -1398803990 -> 722, -132915992 -> 764
    //   764: goto -> 768
    //   767: athrow
    //   768: invokestatic getUnsafeBlocks : (Lnet/minecraft/entity/Entity;IZ)Ljava/util/List;
    //   771: goto -> 775
    //   774: athrow
    //   775: getstatic Perryc.0 : I
    //   778: ifle -> 792
    //   781: ldc2_w 1450890652
    //   784: l2i
    //   785: ldc_w -2030387170
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w 679550983
    //   795: l2i
    //   796: ldc_w -970320348
    //   799: ixor
    //   800: ldc2_w -963892027
    //   803: l2i
    //   804: ldc_w 1104809228
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 836, -1579983726 -> 792, 1473655883 -> 4123
    //   836: goto -> 840
    //   839: athrow
    //   840: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   843: goto -> 847
    //   846: athrow
    //   847: pop
    //   848: ldc2_w -1546717623
    //   851: l2i
    //   852: ldc_w -1546717623
    //   855: ixor
    //   856: getstatic Perryc.1 : I
    //   859: ifeq -> 873
    //   862: ldc2_w -904900592
    //   865: l2i
    //   866: ldc_w -872592933
    //   869: ixor
    //   870: goto -> 881
    //   873: ldc2_w -1989726150
    //   876: l2i
    //   877: ldc_w -1818583315
    //   880: ixor
    //   881: ldc2_w 1026528204
    //   884: l2i
    //   885: ldc_w 1951199255
    //   888: ixor
    //   889: ixor
    //   890: lookupswitch default -> 4131, 1217296912 -> 873, 1402916108 -> 916
    //   916: istore #7
    //   918: getstatic Perryc.1 : I
    //   921: ifeq -> 935
    //   924: ldc2_w 1457434442
    //   927: l2i
    //   928: ldc_w -1685523117
    //   931: ixor
    //   932: goto -> 943
    //   935: ldc2_w -1564337144
    //   938: l2i
    //   939: ldc_w 2060611410
    //   942: ixor
    //   943: ldc2_w -817287042
    //   946: l2i
    //   947: ldc_w -318339519
    //   950: ixor
    //   951: ixor
    //   952: lookupswitch default -> 980, -283513818 -> 4145, 938784366 -> 935
    //   980: iload #7
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w 1830009263
    //   991: l2i
    //   992: ldc_w -1583450
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w 905866891
    //   1002: l2i
    //   1003: ldc_w 2141866558
    //   1006: ixor
    //   1007: ldc2_w -1141983852
    //   1010: l2i
    //   1011: ldc_w 167551653
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 4063, -129617020 -> 1044, 551974968 -> 999
    //   1044: iload_1
    //   1045: getstatic Perryc.1 : I
    //   1048: ifeq -> 1062
    //   1051: ldc2_w 2061445954
    //   1054: l2i
    //   1055: ldc_w 1414107662
    //   1058: ixor
    //   1059: goto -> 1070
    //   1062: ldc2_w -605207057
    //   1065: l2i
    //   1066: ldc_w -802664953
    //   1069: ixor
    //   1070: ldc2_w -732918274
    //   1073: l2i
    //   1074: ldc_w -531544583
    //   1077: ixor
    //   1078: ixor
    //   1079: lookupswitch default -> 4049, 446132555 -> 1062, 1069859823 -> 1104
    //   1104: iload_2
    //   1105: getstatic Perryc.1 : I
    //   1108: ifeq -> 1122
    //   1111: ldc2_w -68561973
    //   1114: l2i
    //   1115: ldc_w -835606805
    //   1118: ixor
    //   1119: goto -> 1130
    //   1122: ldc2_w -401339450
    //   1125: l2i
    //   1126: ldc_w -1374982374
    //   1129: ixor
    //   1130: ldc2_w 379129664
    //   1133: l2i
    //   1134: ldc_w 1918024393
    //   1137: ixor
    //   1138: ixor
    //   1139: lookupswitch default -> 4047, 584372565 -> 1164, 1360249001 -> 1122
    //   1164: iload_3
    //   1165: getstatic Perryc.1 : I
    //   1168: ifeq -> 1182
    //   1171: ldc2_w 1656757580
    //   1174: l2i
    //   1175: ldc_w -896717349
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w 566884286
    //   1185: l2i
    //   1186: ldc_w 427490095
    //   1189: ixor
    //   1190: ldc2_w 846997321
    //   1193: l2i
    //   1194: ldc_w -615150424
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 1224, 1097112438 -> 4099, 1312211501 -> 1182
    //   1224: iload #4
    //   1226: getstatic Perryc.0 : I
    //   1229: ifle -> 1243
    //   1232: ldc2_w 605379117
    //   1235: l2i
    //   1236: ldc_w 2090472053
    //   1239: ixor
    //   1240: goto -> 1251
    //   1243: ldc2_w -44691700
    //   1246: l2i
    //   1247: ldc_w -314115378
    //   1250: ixor
    //   1251: ldc2_w 2124827659
    //   1254: l2i
    //   1255: ldc_w -1015011419
    //   1258: ixor
    //   1259: ixor
    //   1260: lookupswitch default -> 4127, -1388929428 -> 1288, -441900042 -> 1243
    //   1288: iload #5
    //   1290: getstatic Perryc.1 : I
    //   1293: ifeq -> 1307
    //   1296: ldc2_w 696764219
    //   1299: l2i
    //   1300: ldc_w -346468966
    //   1303: ixor
    //   1304: goto -> 1315
    //   1307: ldc2_w -890696525
    //   1310: l2i
    //   1311: ldc_w -544267647
    //   1314: ixor
    //   1315: ldc2_w 1137920646
    //   1318: l2i
    //   1319: ldc_w -1301969025
    //   1322: ixor
    //   1323: ixor
    //   1324: lookupswitch default -> 4097, -456072245 -> 1352, 862472024 -> 1307
    //   1352: goto -> 1356
    //   1355: athrow
    //   1356: invokestatic getTrapOffsets : (ZZZZZ)[Lnet/minecraft/util/math/Vec3d;
    //   1359: goto -> 1363
    //   1362: athrow
    //   1363: arraylength
    //   1364: if_icmpge -> 1378
    //   1367: ldc2_w 318473142
    //   1370: l2i
    //   1371: ldc_w 1228163963
    //   1374: ixor
    //   1375: goto -> 1386
    //   1378: ldc2_w -173377933
    //   1381: l2i
    //   1382: ldc_w -1369063751
    //   1385: ixor
    //   1386: ldc2_w 2056785761
    //   1389: l2i
    //   1390: ldc_w 2107675383
    //   1393: ixor
    //   1394: ixor
    //   1395: tableswitch default -> 1367, 1559713115 -> 1416, 1559713116 -> 3982
    //   1416: getstatic Perryc.1 : I
    //   1419: ifeq -> 1433
    //   1422: ldc2_w -331627876
    //   1425: l2i
    //   1426: ldc_w 482173583
    //   1429: ixor
    //   1430: goto -> 1441
    //   1433: ldc2_w 119797355
    //   1436: l2i
    //   1437: ldc_w -1236308809
    //   1440: ixor
    //   1441: ldc2_w 588691193
    //   1444: l2i
    //   1445: ldc_w -1461214411
    //   1448: ixor
    //   1449: ixor
    //   1450: lookupswitch default -> 1476, -1499896642 -> 1433, 2071442911 -> 4129
    //   1476: iload_1
    //   1477: getstatic Perryc.0 : I
    //   1480: ifle -> 1494
    //   1483: ldc2_w -997754388
    //   1486: l2i
    //   1487: ldc_w 446680134
    //   1490: ixor
    //   1491: goto -> 1502
    //   1494: ldc2_w 243475670
    //   1497: l2i
    //   1498: ldc_w 2005958347
    //   1501: ixor
    //   1502: ldc2_w -1284657405
    //   1505: l2i
    //   1506: ldc_w 1501579981
    //   1509: ixor
    //   1510: ixor
    //   1511: lookupswitch default -> 1536, -436526664 -> 1494, 888492132 -> 4121
    //   1536: iload_2
    //   1537: getstatic Perryc.c : I
    //   1540: iflt -> 1554
    //   1543: ldc2_w -1702815479
    //   1546: l2i
    //   1547: ldc_w -1748963280
    //   1550: ixor
    //   1551: goto -> 1562
    //   1554: ldc2_w -817706014
    //   1557: l2i
    //   1558: ldc_w -900989156
    //   1561: ixor
    //   1562: ldc2_w -43243943
    //   1565: l2i
    //   1566: ldc_w 425602392
    //   1569: ixor
    //   1570: ixor
    //   1571: lookupswitch default -> 1596, -805369315 -> 1554, -378281416 -> 4139
    //   1596: iload_3
    //   1597: getstatic Perryc.0 : I
    //   1600: ifle -> 1614
    //   1603: ldc2_w 209074873
    //   1606: l2i
    //   1607: ldc_w -1799611639
    //   1610: ixor
    //   1611: goto -> 1622
    //   1614: ldc2_w 378752185
    //   1617: l2i
    //   1618: ldc_w -2068824393
    //   1621: ixor
    //   1622: ldc2_w 895014906
    //   1625: l2i
    //   1626: ldc_w -618894246
    //   1629: ixor
    //   1630: ixor
    //   1631: lookupswitch default -> 1656, 1989057040 -> 4119, 2127270744 -> 1614
    //   1656: iload #4
    //   1658: getstatic Perryc.1 : I
    //   1661: ifeq -> 1675
    //   1664: ldc2_w 1145229859
    //   1667: l2i
    //   1668: ldc_w -499870288
    //   1671: ixor
    //   1672: goto -> 1683
    //   1675: ldc2_w 585213824
    //   1678: l2i
    //   1679: ldc_w -1803464928
    //   1682: ixor
    //   1683: ldc2_w 1695070333
    //   1686: l2i
    //   1687: ldc_w -1660285485
    //   1690: ixor
    //   1691: ixor
    //   1692: lookupswitch default -> 4107, 1315069198 -> 1720, 1584722493 -> 1675
    //   1720: iload #5
    //   1722: getstatic Perryc.c : I
    //   1725: iflt -> 1739
    //   1728: ldc2_w -606528518
    //   1731: l2i
    //   1732: ldc_w -694074335
    //   1735: ixor
    //   1736: goto -> 1747
    //   1739: ldc2_w -2049008882
    //   1742: l2i
    //   1743: ldc_w 1086006530
    //   1746: ixor
    //   1747: ldc2_w 625886187
    //   1750: l2i
    //   1751: ldc_w -227707777
    //   1754: ixor
    //   1755: ixor
    //   1756: lookupswitch default -> 1784, -631543729 -> 4091, 1052686781 -> 1739
    //   1784: goto -> 1788
    //   1787: athrow
    //   1788: invokestatic getTrapOffsets : (ZZZZZ)[Lnet/minecraft/util/math/Vec3d;
    //   1791: goto -> 1795
    //   1794: athrow
    //   1795: getstatic Perryc.0 : I
    //   1798: ifle -> 1812
    //   1801: ldc2_w -1148596774
    //   1804: l2i
    //   1805: ldc_w -194309884
    //   1808: ixor
    //   1809: goto -> 1820
    //   1812: ldc2_w -76624917
    //   1815: l2i
    //   1816: ldc_w -1342606322
    //   1819: ixor
    //   1820: ldc2_w -519477098
    //   1823: l2i
    //   1824: ldc_w 1506330618
    //   1827: ixor
    //   1828: ixor
    //   1829: lookupswitch default -> 4093, -329903991 -> 1856, -148671566 -> 1812
    //   1856: iload #7
    //   1858: aaload
    //   1859: getstatic Perryc.0 : I
    //   1862: ifle -> 1876
    //   1865: ldc2_w 2012856659
    //   1868: l2i
    //   1869: ldc_w 929050589
    //   1872: ixor
    //   1873: goto -> 1884
    //   1876: ldc2_w 92533893
    //   1879: l2i
    //   1880: ldc_w 752567696
    //   1883: ixor
    //   1884: ldc2_w -1798541774
    //   1887: l2i
    //   1888: ldc_w 1029621143
    //   1891: ixor
    //   1892: ixor
    //   1893: lookupswitch default -> 4053, -2134238544 -> 1920, -385137365 -> 1876
    //   1920: astore #8
    //   1922: new net/minecraft/util/math/BlockPos
    //   1925: dup
    //   1926: getstatic Perryc.c : I
    //   1929: iflt -> 1943
    //   1932: ldc2_w -617388082
    //   1935: l2i
    //   1936: ldc_w 710012443
    //   1939: ixor
    //   1940: goto -> 1951
    //   1943: ldc2_w 1518592209
    //   1946: l2i
    //   1947: ldc_w 599672425
    //   1950: ixor
    //   1951: ldc2_w -1355780650
    //   1954: l2i
    //   1955: ldc_w 400478888
    //   1958: ixor
    //   1959: ixor
    //   1960: lookupswitch default -> 1988, -374429496 -> 1943, 1233925803 -> 4081
    //   1988: aload_0
    //   1989: getstatic Perryc.1 : I
    //   1992: ifeq -> 2006
    //   1995: ldc2_w 318401807
    //   1998: l2i
    //   1999: ldc_w 404849671
    //   2002: ixor
    //   2003: goto -> 2014
    //   2006: ldc2_w 1083648114
    //   2009: l2i
    //   2010: ldc_w 1753638877
    //   2013: ixor
    //   2014: ldc2_w -561973503
    //   2017: l2i
    //   2018: ldc_w -187061795
    //   2021: ixor
    //   2022: ixor
    //   2023: lookupswitch default -> 2048, -1843193123 -> 2006, 545437652 -> 4125
    //   2048: goto -> 2052
    //   2051: athrow
    //   2052: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   2055: goto -> 2059
    //   2058: athrow
    //   2059: getstatic Perryc.c : I
    //   2062: iflt -> 2076
    //   2065: ldc2_w 1739401378
    //   2068: l2i
    //   2069: ldc_w 1789565925
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w 1841679281
    //   2079: l2i
    //   2080: ldc_w 53842107
    //   2083: ixor
    //   2084: ldc2_w -264936611
    //   2087: l2i
    //   2088: ldc_w 2021462696
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -2058370382 -> 4113, 1234472362 -> 2076
    //   2120: goto -> 2124
    //   2123: athrow
    //   2124: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   2127: goto -> 2131
    //   2130: athrow
    //   2131: getstatic Perryc.1 : I
    //   2134: ifeq -> 2148
    //   2137: ldc2_w -17566627
    //   2140: l2i
    //   2141: ldc_w 972251859
    //   2144: ixor
    //   2145: goto -> 2156
    //   2148: ldc2_w -327016863
    //   2151: l2i
    //   2152: ldc_w 1748267562
    //   2155: ixor
    //   2156: ldc2_w -290582985
    //   2159: l2i
    //   2160: ldc_w -1936019711
    //   2163: ixor
    //   2164: ixor
    //   2165: lookupswitch default -> 4137, -1523304520 -> 2148, -427635331 -> 2192
    //   2192: aload #8
    //   2194: getstatic Perryc.c : I
    //   2197: iflt -> 2211
    //   2200: ldc2_w -1751859365
    //   2203: l2i
    //   2204: ldc_w 782335745
    //   2207: ixor
    //   2208: goto -> 2219
    //   2211: ldc2_w 1928085204
    //   2214: l2i
    //   2215: ldc_w -447310870
    //   2218: ixor
    //   2219: ldc2_w 1753917032
    //   2222: l2i
    //   2223: ldc_w -1693926120
    //   2226: ixor
    //   2227: ixor
    //   2228: lookupswitch default -> 4059, 1253563178 -> 2211, 1681438286 -> 2256
    //   2256: getfield field_72450_a : D
    //   2259: getstatic Perryc.0 : I
    //   2262: ifle -> 2276
    //   2265: ldc2_w 381753855
    //   2268: l2i
    //   2269: ldc_w 1411091857
    //   2272: ixor
    //   2273: goto -> 2284
    //   2276: ldc2_w 1002605835
    //   2279: l2i
    //   2280: ldc_w 1740123681
    //   2283: ixor
    //   2284: ldc2_w 1038921621
    //   2287: l2i
    //   2288: ldc_w 1530419713
    //   2291: ixor
    //   2292: ixor
    //   2293: lookupswitch default -> 2320, -375655378 -> 2276, 604922362 -> 4133
    //   2320: aload #8
    //   2322: getstatic Perryc.0 : I
    //   2325: ifle -> 2339
    //   2328: ldc2_w -1669558436
    //   2331: l2i
    //   2332: ldc_w 2118863925
    //   2335: ixor
    //   2336: goto -> 2347
    //   2339: ldc2_w 227709688
    //   2342: l2i
    //   2343: ldc_w 1483323679
    //   2346: ixor
    //   2347: ldc2_w -211653613
    //   2350: l2i
    //   2351: ldc_w 93277667
    //   2354: ixor
    //   2355: ixor
    //   2356: lookupswitch default -> 4151, -1558836713 -> 2384, 349889177 -> 2339
    //   2384: getfield field_72448_b : D
    //   2387: getstatic Perryc.c : I
    //   2390: iflt -> 2404
    //   2393: ldc2_w 1956881829
    //   2396: l2i
    //   2397: ldc_w -636413564
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w -866044511
    //   2407: l2i
    //   2408: ldc_w -1316393042
    //   2411: ixor
    //   2412: ldc2_w 962002284
    //   2415: l2i
    //   2416: ldc_w 2071119061
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, -325679720 -> 4089, 1381975087 -> 2404
    //   2448: aload #8
    //   2450: getstatic Perryc.0 : I
    //   2453: ifle -> 2467
    //   2456: ldc2_w -1643961381
    //   2459: l2i
    //   2460: ldc_w 1372256203
    //   2463: ixor
    //   2464: goto -> 2475
    //   2467: ldc2_w -745861061
    //   2470: l2i
    //   2471: ldc_w 680127331
    //   2474: ixor
    //   2475: ldc2_w -661781633
    //   2478: l2i
    //   2479: ldc_w -2010156827
    //   2482: ixor
    //   2483: ixor
    //   2484: lookupswitch default -> 2512, -1620531318 -> 4087, 2110085273 -> 2467
    //   2512: getfield field_72449_c : D
    //   2515: getstatic Perryc.c : I
    //   2518: iflt -> 2532
    //   2521: ldc2_w 895347628
    //   2524: l2i
    //   2525: ldc_w 635871863
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w -1298582562
    //   2535: l2i
    //   2536: ldc_w 1125785621
    //   2539: ixor
    //   2540: ldc2_w -279964213
    //   2543: l2i
    //   2544: ldc_w -1558320236
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 4117, -1110512236 -> 2576, 1559672708 -> 2532
    //   2576: goto -> 2580
    //   2579: athrow
    //   2580: invokevirtual func_177963_a : (DDD)Lnet/minecraft/util/math/BlockPos;
    //   2583: goto -> 2587
    //   2586: athrow
    //   2587: getstatic Perryc.c : I
    //   2590: iflt -> 2604
    //   2593: ldc2_w -2002229140
    //   2596: l2i
    //   2597: ldc_w -640582729
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w -726293062
    //   2607: l2i
    //   2608: ldc_w 1463862523
    //   2611: ixor
    //   2612: ldc2_w 134619560
    //   2615: l2i
    //   2616: ldc_w 115152555
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 2648, 1489330032 -> 2604, 1604461784 -> 4103
    //   2648: astore #9
    //   2650: getstatic Perryc.0 : I
    //   2653: ifle -> 2667
    //   2656: ldc2_w -1505681198
    //   2659: l2i
    //   2660: ldc_w 16120039
    //   2663: ixor
    //   2664: goto -> 2675
    //   2667: ldc2_w 1813830251
    //   2670: l2i
    //   2671: ldc_w -672411589
    //   2674: ixor
    //   2675: ldc2_w 800309494
    //   2678: l2i
    //   2679: ldc_w -1621985832
    //   2682: ixor
    //   2683: ixor
    //   2684: lookupswitch default -> 4057, 186040190 -> 2712, 374697243 -> 2667
    //   2712: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2715: getstatic Perryc.1 : I
    //   2718: ifeq -> 2732
    //   2721: ldc2_w 859865896
    //   2724: l2i
    //   2725: ldc_w -800281757
    //   2728: ixor
    //   2729: goto -> 2740
    //   2732: ldc2_w -711900749
    //   2735: l2i
    //   2736: ldc_w -942233425
    //   2739: ixor
    //   2740: ldc2_w 591383504
    //   2743: l2i
    //   2744: ldc_w 628049587
    //   2747: ixor
    //   2748: ixor
    //   2749: lookupswitch default -> 2776, -1431332736 -> 2732, -446913240 -> 4065
    //   2776: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2779: getstatic Perryc.c : I
    //   2782: iflt -> 2796
    //   2785: ldc2_w 2145834895
    //   2788: l2i
    //   2789: ldc_w -982680433
    //   2792: ixor
    //   2793: goto -> 2804
    //   2796: ldc2_w 2090250671
    //   2799: l2i
    //   2800: ldc_w -291372749
    //   2803: ixor
    //   2804: ldc2_w -2076183639
    //   2807: l2i
    //   2808: ldc_w -504494082
    //   2811: ixor
    //   2812: ixor
    //   2813: lookupswitch default -> 2840, -1750120783 -> 2796, -547725481 -> 4051
    //   2840: aload #9
    //   2842: getstatic Perryc.c : I
    //   2845: iflt -> 2859
    //   2848: ldc2_w -1623722834
    //   2851: l2i
    //   2852: ldc_w -1354873442
    //   2855: ixor
    //   2856: goto -> 2867
    //   2859: ldc2_w 1926506251
    //   2862: l2i
    //   2863: ldc_w -154976616
    //   2866: ixor
    //   2867: ldc2_w -892629504
    //   2870: l2i
    //   2871: ldc_w 1673288848
    //   2874: ixor
    //   2875: ixor
    //   2876: lookupswitch default -> 2904, -1719770208 -> 4083, 1950526277 -> 2859
    //   2904: goto -> 2908
    //   2907: athrow
    //   2908: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2911: goto -> 2915
    //   2914: athrow
    //   2915: getstatic Perryc.c : I
    //   2918: iflt -> 2932
    //   2921: ldc2_w 2006586666
    //   2924: l2i
    //   2925: ldc_w -2133178902
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w -1192594379
    //   2935: l2i
    //   2936: ldc_w -1366904472
    //   2939: ixor
    //   2940: ldc2_w 7931235
    //   2943: l2i
    //   2944: ldc_w -1295971619
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 4055, -1529558301 -> 2976, 1173905278 -> 2932
    //   2976: goto -> 2980
    //   2979: athrow
    //   2980: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2985: goto -> 2989
    //   2988: athrow
    //   2989: getstatic Perryc.0 : I
    //   2992: ifle -> 3006
    //   2995: ldc2_w 1436075581
    //   2998: l2i
    //   2999: ldc_w -1953561839
    //   3002: ixor
    //   3003: goto -> 3014
    //   3006: ldc2_w 1760281145
    //   3009: l2i
    //   3010: ldc_w -1482583933
    //   3013: ixor
    //   3014: ldc2_w 1230539878
    //   3017: l2i
    //   3018: ldc_w 817678197
    //   3021: ixor
    //   3022: ixor
    //   3023: lookupswitch default -> 3048, -1477210561 -> 4085, -1086724344 -> 3006
    //   3048: astore #10
    //   3050: getstatic Perryc.0 : I
    //   3053: ifle -> 3067
    //   3056: ldc2_w -2020451005
    //   3059: l2i
    //   3060: ldc_w -790759041
    //   3063: ixor
    //   3064: goto -> 3075
    //   3067: ldc2_w -811931502
    //   3070: l2i
    //   3071: ldc_w 124339385
    //   3074: ixor
    //   3075: ldc2_w -350022623
    //   3078: l2i
    //   3079: ldc_w 1116607180
    //   3082: ixor
    //   3083: ixor
    //   3084: lookupswitch default -> 4115, -18701615 -> 3067, 1633594054 -> 3112
    //   3112: aload #10
    //   3114: instanceof net/minecraft/block/BlockAir
    //   3117: ifne -> 3131
    //   3120: ldc2_w 2105678706
    //   3123: l2i
    //   3124: ldc_w 1044470110
    //   3127: ixor
    //   3128: goto -> 3139
    //   3131: ldc2_w -2139760319
    //   3134: l2i
    //   3135: ldc_w -1011442836
    //   3138: ixor
    //   3139: ldc2_w 1788845996
    //   3142: l2i
    //   3143: ldc_w -1498975464
    //   3146: ixor
    //   3147: ixor
    //   3148: tableswitch default -> 3120, -1879331176 -> 3172, -1879331175 -> 3775
    //   3172: getstatic Perryc.1 : I
    //   3175: ifeq -> 3189
    //   3178: ldc2_w 1470431575
    //   3181: l2i
    //   3182: ldc_w -745009382
    //   3185: ixor
    //   3186: goto -> 3197
    //   3189: ldc2_w -1418896524
    //   3192: l2i
    //   3193: ldc_w 1785361628
    //   3196: ixor
    //   3197: ldc2_w -558104228
    //   3200: l2i
    //   3201: ldc_w -2091201231
    //   3204: ixor
    //   3205: ixor
    //   3206: lookupswitch default -> 4147, -1662917691 -> 3232, -639909344 -> 3189
    //   3232: aload #10
    //   3234: instanceof net/minecraft/block/BlockLiquid
    //   3237: ifne -> 3251
    //   3240: ldc2_w 273737242
    //   3243: l2i
    //   3244: ldc_w 180990997
    //   3247: ixor
    //   3248: goto -> 3259
    //   3251: ldc2_w -639420584
    //   3254: l2i
    //   3255: ldc_w -1015388856
    //   3258: ixor
    //   3259: ldc2_w 852916189
    //   3262: l2i
    //   3263: ldc_w -811952067
    //   3266: ixor
    //   3267: ixor
    //   3268: tableswitch default -> 3240, -405422609 -> 3292, -405422608 -> 3775
    //   3292: getstatic Perryc.0 : I
    //   3295: ifle -> 3309
    //   3298: ldc2_w -1577796708
    //   3301: l2i
    //   3302: ldc_w -1893238893
    //   3305: ixor
    //   3306: goto -> 3317
    //   3309: ldc2_w 1087332522
    //   3312: l2i
    //   3313: ldc_w 153302644
    //   3316: ixor
    //   3317: ldc2_w 1228283169
    //   3320: l2i
    //   3321: ldc_w -1222455099
    //   3324: ixor
    //   3325: ixor
    //   3326: lookupswitch default -> 4095, -1208444102 -> 3352, -792264213 -> 3309
    //   3352: aload #10
    //   3354: instanceof net/minecraft/block/BlockTallGrass
    //   3357: ifne -> 3371
    //   3360: ldc2_w -965889950
    //   3363: l2i
    //   3364: ldc_w -1679689917
    //   3367: ixor
    //   3368: goto -> 3379
    //   3371: ldc2_w -308451903
    //   3374: l2i
    //   3375: ldc_w -1341054233
    //   3378: ixor
    //   3379: ldc2_w -782985313
    //   3382: l2i
    //   3383: ldc_w 525061805
    //   3386: ixor
    //   3387: ixor
    //   3388: tableswitch default -> 3360, -1819075053 -> 3412, -1819075052 -> 3775
    //   3412: getstatic Perryc.1 : I
    //   3415: ifeq -> 3429
    //   3418: ldc2_w -294348966
    //   3421: l2i
    //   3422: ldc_w 1187464587
    //   3425: ixor
    //   3426: goto -> 3437
    //   3429: ldc2_w -2107136218
    //   3432: l2i
    //   3433: ldc_w 918284585
    //   3436: ixor
    //   3437: ldc2_w -1922308831
    //   3440: l2i
    //   3441: ldc_w 1558812176
    //   3444: ixor
    //   3445: ixor
    //   3446: lookupswitch default -> 4149, 1700674878 -> 3472, 2033295840 -> 3429
    //   3472: aload #10
    //   3474: instanceof net/minecraft/block/BlockFire
    //   3477: ifne -> 3491
    //   3480: ldc2_w -1019615338
    //   3483: l2i
    //   3484: ldc_w 1582268769
    //   3487: ixor
    //   3488: goto -> 3499
    //   3491: ldc2_w -842937882
    //   3494: l2i
    //   3495: ldc_w 1354215184
    //   3498: ixor
    //   3499: ldc2_w -18041573
    //   3502: l2i
    //   3503: ldc_w 1411451860
    //   3506: ixor
    //   3507: ixor
    //   3508: tableswitch default -> 3480, 935057464 -> 3532, 935057465 -> 3775
    //   3532: getstatic Perryc.1 : I
    //   3535: ifeq -> 3549
    //   3538: ldc2_w -1823160900
    //   3541: l2i
    //   3542: ldc_w 225190775
    //   3545: ixor
    //   3546: goto -> 3557
    //   3549: ldc2_w 621867923
    //   3552: l2i
    //   3553: ldc_w 1720055154
    //   3556: ixor
    //   3557: ldc2_w 448945235
    //   3560: l2i
    //   3561: ldc_w 2083960815
    //   3564: ixor
    //   3565: ixor
    //   3566: lookupswitch default -> 4073, -120844937 -> 3549, 627174749 -> 3592
    //   3592: aload #10
    //   3594: instanceof net/minecraft/block/BlockDeadBush
    //   3597: ifne -> 3611
    //   3600: ldc2_w 1972165
    //   3603: l2i
    //   3604: ldc_w 484202577
    //   3607: ixor
    //   3608: goto -> 3619
    //   3611: ldc2_w -725999874
    //   3614: l2i
    //   3615: ldc_w -931638933
    //   3618: ixor
    //   3619: ldc2_w -1660059686
    //   3622: l2i
    //   3623: ldc_w 124053378
    //   3626: ixor
    //   3627: ixor
    //   3628: tableswitch default -> 3600, -2035558452 -> 3652, -2035558451 -> 3775
    //   3652: getstatic Perryc.1 : I
    //   3655: ifeq -> 3669
    //   3658: ldc2_w 1340473955
    //   3661: l2i
    //   3662: ldc_w -1962736990
    //   3665: ixor
    //   3666: goto -> 3677
    //   3669: ldc2_w -1737069699
    //   3672: l2i
    //   3673: ldc_w -32432014
    //   3676: ixor
    //   3677: ldc2_w -6319955
    //   3680: l2i
    //   3681: ldc_w -444599992
    //   3684: ixor
    //   3685: ixor
    //   3686: lookupswitch default -> 4105, -570072796 -> 3669, 2089233130 -> 3712
    //   3712: aload #10
    //   3714: instanceof net/minecraft/block/BlockSnow
    //   3717: ifne -> 3731
    //   3720: ldc2_w -2108758789
    //   3723: l2i
    //   3724: ldc_w 1205110527
    //   3727: ixor
    //   3728: goto -> 3739
    //   3731: ldc2_w 388894005
    //   3734: l2i
    //   3735: ldc_w -759926992
    //   3738: ixor
    //   3739: ldc2_w 1308445945
    //   3742: l2i
    //   3743: ldc_w -1812374603
    //   3746: ixor
    //   3747: ixor
    //   3748: tableswitch default -> 3720, 463369544 -> 3772, 463369545 -> 3775
    //   3772: goto -> 3976
    //   3775: getstatic Perryc.c : I
    //   3778: iflt -> 3792
    //   3781: ldc2_w -1364044138
    //   3784: l2i
    //   3785: ldc_w -1735529036
    //   3788: ixor
    //   3789: goto -> 3800
    //   3792: ldc2_w -78200666
    //   3795: l2i
    //   3796: ldc_w 1513474763
    //   3799: ixor
    //   3800: ldc2_w 646820856
    //   3803: l2i
    //   3804: ldc_w -141860691
    //   3807: ixor
    //   3808: ixor
    //   3809: lookupswitch default -> 3836, -415668105 -> 4135, 1544072797 -> 3792
    //   3836: aload #6
    //   3838: getstatic Perryc.1 : I
    //   3841: ifeq -> 3855
    //   3844: ldc2_w 878494499
    //   3847: l2i
    //   3848: ldc_w 990264154
    //   3851: ixor
    //   3852: goto -> 3863
    //   3855: ldc2_w -1114948225
    //   3858: l2i
    //   3859: ldc_w 539044612
    //   3862: ixor
    //   3863: ldc2_w 1006800355
    //   3866: l2i
    //   3867: ldc_w -1975116481
    //   3870: ixor
    //   3871: ixor
    //   3872: lookupswitch default -> 4141, -1189189467 -> 3855, 737052327 -> 3900
    //   3900: aload #8
    //   3902: getstatic Perryc.1 : I
    //   3905: ifeq -> 3919
    //   3908: ldc2_w -2054586883
    //   3911: l2i
    //   3912: ldc_w -1959526970
    //   3915: ixor
    //   3916: goto -> 3927
    //   3919: ldc2_w -1511371669
    //   3922: l2i
    //   3923: ldc_w 1368559008
    //   3926: ixor
    //   3927: ldc2_w 1156565231
    //   3930: l2i
    //   3931: ldc_w -1561671724
    //   3934: ixor
    //   3935: ixor
    //   3936: lookupswitch default -> 4143, -390099200 -> 3919, 310234864 -> 3964
    //   3964: goto -> 3968
    //   3967: athrow
    //   3968: invokevirtual add : (Ljava/lang/Object;)Z
    //   3971: goto -> 3975
    //   3974: athrow
    //   3975: pop
    //   3976: iinc #7, 1
    //   3979: goto -> 918
    //   3982: getstatic Perryc.1 : I
    //   3985: ifeq -> 3999
    //   3988: ldc2_w -2105141961
    //   3991: l2i
    //   3992: ldc_w -1538086807
    //   3995: ixor
    //   3996: goto -> 4007
    //   3999: ldc2_w -1736727878
    //   4002: l2i
    //   4003: ldc_w -225701286
    //   4006: ixor
    //   4007: ldc2_w -160027780
    //   4010: l2i
    //   4011: ldc_w -920996758
    //   4014: ixor
    //   4015: ixor
    //   4016: lookupswitch default -> 4044, -1130282759 -> 3999, 431497800 -> 4109
    //   4044: aload #6
    //   4046: areturn
    //   4047: aconst_null
    //   4048: athrow
    //   4049: aconst_null
    //   4050: athrow
    //   4051: aconst_null
    //   4052: athrow
    //   4053: aconst_null
    //   4054: athrow
    //   4055: aconst_null
    //   4056: athrow
    //   4057: aconst_null
    //   4058: athrow
    //   4059: aconst_null
    //   4060: athrow
    //   4061: aconst_null
    //   4062: athrow
    //   4063: aconst_null
    //   4064: athrow
    //   4065: aconst_null
    //   4066: athrow
    //   4067: aconst_null
    //   4068: athrow
    //   4069: aconst_null
    //   4070: athrow
    //   4071: aconst_null
    //   4072: athrow
    //   4073: aconst_null
    //   4074: athrow
    //   4075: aconst_null
    //   4076: athrow
    //   4077: aconst_null
    //   4078: athrow
    //   4079: aconst_null
    //   4080: athrow
    //   4081: aconst_null
    //   4082: athrow
    //   4083: aconst_null
    //   4084: athrow
    //   4085: aconst_null
    //   4086: athrow
    //   4087: aconst_null
    //   4088: athrow
    //   4089: aconst_null
    //   4090: athrow
    //   4091: aconst_null
    //   4092: athrow
    //   4093: aconst_null
    //   4094: athrow
    //   4095: aconst_null
    //   4096: athrow
    //   4097: aconst_null
    //   4098: athrow
    //   4099: aconst_null
    //   4100: athrow
    //   4101: aconst_null
    //   4102: athrow
    //   4103: aconst_null
    //   4104: athrow
    //   4105: aconst_null
    //   4106: athrow
    //   4107: aconst_null
    //   4108: athrow
    //   4109: aconst_null
    //   4110: athrow
    //   4111: aconst_null
    //   4112: athrow
    //   4113: aconst_null
    //   4114: athrow
    //   4115: aconst_null
    //   4116: athrow
    //   4117: aconst_null
    //   4118: athrow
    //   4119: aconst_null
    //   4120: athrow
    //   4121: aconst_null
    //   4122: athrow
    //   4123: aconst_null
    //   4124: athrow
    //   4125: aconst_null
    //   4126: athrow
    //   4127: aconst_null
    //   4128: athrow
    //   4129: aconst_null
    //   4130: athrow
    //   4131: aconst_null
    //   4132: athrow
    //   4133: aconst_null
    //   4134: athrow
    //   4135: aconst_null
    //   4136: athrow
    //   4137: aconst_null
    //   4138: athrow
    //   4139: aconst_null
    //   4140: athrow
    //   4141: aconst_null
    //   4142: athrow
    //   4143: aconst_null
    //   4144: athrow
    //   4145: aconst_null
    //   4146: athrow
    //   4147: aconst_null
    //   4148: athrow
    //   4149: aconst_null
    //   4150: athrow
    //   4151: aconst_null
    //   4152: athrow
    //   4153: pop
    //   4154: goto -> 24
    //   4157: pop
    //   4158: aconst_null
    //   4159: goto -> 4153
    //   4162: dup
    //   4163: ifnull -> 4153
    //   4166: checkcast java/lang/Throwable
    //   4169: athrow
    //   4170: dup
    //   4171: ifnull -> 4157
    //   4174: checkcast java/lang/Throwable
    //   4177: athrow
    //   4178: aconst_null
    //   4179: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1922	2054	8	vector	Lnet/minecraft/util/math/Vec3d;
    //   2650	1326	9	targetPos	Lnet/minecraft/util/math/BlockPos;
    //   3050	926	10	block	Lnet/minecraft/block/Block;
    //   918	3064	7	i	I
    //   24	4023	0	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	4023	1	antiScaffold	Z
    //   24	4023	2	antiStep	Z
    //   24	4023	3	legs	Z
    //   24	4023	4	platform	Z
    //   24	4023	5	antiDrop	Z
    //   162	3885	6	vec3ds	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   162	3885	6	vec3ds	Ljava/util/ArrayList<Lnet/minecraft/util/math/Vec3d;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	4162	java/lang/NegativeArraySizeException
    //   91	98	98	finally
    //   91	98	98	java/lang/IndexOutOfBoundsException
    //   91	98	91	finally
    //   91	98	3	java/util/NoSuchElementException
    //   92	98	98	finally
    //   419	426	426	finally
    //   419	426	419	finally
    //   419	426	419	java/util/NoSuchElementException
    //   419	426	426	finally
    //   420	426	419	java/lang/IllegalStateException
    //   491	500	500	finally
    //   491	500	491	finally
    //   491	500	3	finally
    //   492	500	3	finally
    //   492	500	3	finally
    //   768	774	774	finally
    //   768	774	3	java/util/ConcurrentModificationException
    //   768	774	3	finally
    //   768	774	774	finally
    //   768	774	774	java/lang/IndexOutOfBoundsException
    //   839	846	846	finally
    //   839	846	839	java/lang/NumberFormatException
    //   840	846	3	finally
    //   840	846	846	finally
    //   840	846	846	finally
    //   1356	1362	1362	finally
    //   1356	1362	1362	java/lang/RuntimeException
    //   1356	1362	3	java/util/ConcurrentModificationException
    //   1356	1362	3	java/lang/NegativeArraySizeException
    //   1356	1362	1362	java/lang/AssertionError
    //   1787	1794	1794	finally
    //   1787	1794	1794	finally
    //   1787	1794	3	java/util/NoSuchElementException
    //   1788	1794	1787	finally
    //   1788	1794	1794	java/util/NoSuchElementException
    //   2051	2058	2058	finally
    //   2052	2058	2058	finally
    //   2052	2058	2051	java/lang/UnsupportedOperationException
    //   2052	2058	3	java/lang/IllegalStateException
    //   2052	2058	2051	finally
    //   2123	2130	2130	finally
    //   2123	2130	2123	java/lang/NumberFormatException
    //   2123	2130	3	finally
    //   2123	2130	2130	java/lang/AssertionError
    //   2124	2130	3	java/lang/AssertionError
    //   2579	2586	2586	finally
    //   2579	2586	2579	java/lang/NegativeArraySizeException
    //   2579	2586	3	java/util/NoSuchElementException
    //   2580	2586	3	finally
    //   2580	2586	2579	finally
    //   2908	2914	2914	finally
    //   2908	2914	3	finally
    //   2908	2914	3	finally
    //   2908	2914	3	finally
    //   2908	2914	2914	java/lang/NumberFormatException
    //   2979	2988	2988	finally
    //   2979	2988	2988	java/lang/RuntimeException
    //   2980	2988	2988	finally
    //   2980	2988	2979	finally
    //   2980	2988	2979	finally
    //   3967	3974	3974	finally
    //   3967	3974	3974	java/lang/UnsupportedOperationException
    //   3967	3974	3	finally
    //   3968	3974	3967	java/lang/NegativeArraySizeException
    //   3968	3974	3974	finally
    //   4162	4170	4162	java/lang/NumberFormatException
    //   4178	4180	3	java/lang/UnsupportedOperationException
  }
  
  public static List getOffsetList(int y, boolean floor) {
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
  
  public static Vec3d getInterpolatedAmount(Entity entity, double x, double y, double z) {
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
  
  public static boolean isAlive(Entity paramEntity) {
    return Perry1.5X(null, (int)1336002723L ^ 0x7BE72D3A, paramEntity);
  }
  
  public static boolean canEntityFeetBeSeen(Entity entityIn) {
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
  
  public static void attackEntity(Entity entity, boolean packet, boolean swingArm) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1373
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1365
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1357
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1924385225
    //   33: l2i
    //   34: ldc_w -470186507
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1250283615
    //   44: l2i
    //   45: ldc_w -1792136100
    //   48: ixor
    //   49: ldc2_w -1466989434
    //   52: l2i
    //   53: ldc_w -1239011859
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1880890025 -> 1314, 181089270 -> 41
    //   84: iload_1
    //   85: ifeq -> 99
    //   88: ldc2_w -1365036110
    //   91: l2i
    //   92: ldc_w -818828
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w 903972855
    //   102: l2i
    //   103: ldc_w 1689335090
    //   106: ixor
    //   107: ldc2_w 582288482
    //   110: l2i
    //   111: ldc_w 305174269
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, 1641357401 -> 140, 1641357402 -> 542
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 157
    //   146: ldc2_w 1851807346
    //   149: l2i
    //   150: ldc_w 211982546
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w -1526986904
    //   160: l2i
    //   161: ldc_w 1641627965
    //   164: ixor
    //   165: ldc2_w 2027616642
    //   168: l2i
    //   169: ldc_w 633490816
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -395140869 -> 157, 1071282850 -> 1330
    //   200: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   203: getstatic Perryc.c : I
    //   206: iflt -> 220
    //   209: ldc2_w -1063431236
    //   212: l2i
    //   213: ldc_w -722478485
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 236569773
    //   223: l2i
    //   224: ldc_w 839471372
    //   227: ixor
    //   228: ldc2_w 1971618763
    //   231: l2i
    //   232: ldc_w -1042071993
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 264, -1609223077 -> 1332, -914980341 -> 220
    //   264: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   267: getstatic Perryc.0 : I
    //   270: ifle -> 284
    //   273: ldc2_w 2098363787
    //   276: l2i
    //   277: ldc_w -336305545
    //   280: ixor
    //   281: goto -> 292
    //   284: ldc2_w -922730775
    //   287: l2i
    //   288: ldc_w -1338688770
    //   291: ixor
    //   292: ldc2_w -398525684
    //   295: l2i
    //   296: ldc_w 812923099
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -1670590877 -> 284, 1319951403 -> 1318
    //   328: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   331: new net/minecraft/network/play/client/CPacketUseEntity
    //   334: dup
    //   335: getstatic Perryc.1 : I
    //   338: ifeq -> 352
    //   341: ldc2_w 2097004937
    //   344: l2i
    //   345: ldc_w 1980364026
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 2000240938
    //   355: l2i
    //   356: ldc_w 1693721242
    //   359: ixor
    //   360: ldc2_w -456116699
    //   363: l2i
    //   364: ldc_w -2060331157
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 396, -1474395447 -> 352, 1796592701 -> 1340
    //   396: aload_0
    //   397: getstatic Perryc.c : I
    //   400: iflt -> 414
    //   403: ldc2_w -163639167
    //   406: l2i
    //   407: ldc_w -1768199292
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w -1755248515
    //   417: l2i
    //   418: ldc_w 591070950
    //   421: ixor
    //   422: ldc2_w -741716895
    //   425: l2i
    //   426: ldc_w 604355614
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 456, -1754559622 -> 1316, 1330618920 -> 414
    //   456: goto -> 460
    //   459: athrow
    //   460: invokespecial <init> : (Lnet/minecraft/entity/Entity;)V
    //   463: goto -> 467
    //   466: athrow
    //   467: getstatic Perryc.c : I
    //   470: iflt -> 484
    //   473: ldc2_w -1258950669
    //   476: l2i
    //   477: ldc_w -639696610
    //   480: ixor
    //   481: goto -> 492
    //   484: ldc2_w -1742090130
    //   487: l2i
    //   488: ldc_w -508393367
    //   491: ixor
    //   492: ldc2_w -1928441423
    //   495: l2i
    //   496: ldc_w 1096132932
    //   499: ixor
    //   500: ixor
    //   501: lookupswitch default -> 528, -1586424296 -> 1334, -1034433381 -> 484
    //   528: goto -> 532
    //   531: athrow
    //   532: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   535: goto -> 539
    //   538: athrow
    //   539: goto -> 931
    //   542: getstatic Perryc.0 : I
    //   545: ifle -> 559
    //   548: ldc2_w 399044912
    //   551: l2i
    //   552: ldc_w 1358328846
    //   555: ixor
    //   556: goto -> 567
    //   559: ldc2_w -1865329068
    //   562: l2i
    //   563: ldc_w 218053074
    //   566: ixor
    //   567: ldc2_w 316815481
    //   570: l2i
    //   571: ldc_w -1118629028
    //   574: ixor
    //   575: ixor
    //   576: lookupswitch default -> 1342, -393236965 -> 559, 866075811 -> 604
    //   604: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   607: getstatic Perryc.1 : I
    //   610: ifeq -> 624
    //   613: ldc2_w -1198424585
    //   616: l2i
    //   617: ldc_w 1150784418
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -90572498
    //   627: l2i
    //   628: ldc_w -630638894
    //   631: ixor
    //   632: ldc2_w 1122319046
    //   635: l2i
    //   636: ldc_w 1610824749
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, -555685698 -> 1346, 1578579112 -> 624
    //   668: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   671: getstatic Perryc.c : I
    //   674: iflt -> 688
    //   677: ldc2_w 1177332477
    //   680: l2i
    //   681: ldc_w 1671426957
    //   684: ixor
    //   685: goto -> 696
    //   688: ldc2_w -557482656
    //   691: l2i
    //   692: ldc_w 711850965
    //   695: ixor
    //   696: ldc2_w 993068674
    //   699: l2i
    //   700: ldc_w 299278802
    //   703: ixor
    //   704: ixor
    //   705: lookupswitch default -> 1320, -565239323 -> 732, 257228320 -> 688
    //   732: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   735: getstatic Perryc.1 : I
    //   738: ifeq -> 752
    //   741: ldc2_w 317196532
    //   744: l2i
    //   745: ldc_w 2125629006
    //   748: ixor
    //   749: goto -> 760
    //   752: ldc2_w 1574500680
    //   755: l2i
    //   756: ldc_w -672412411
    //   759: ixor
    //   760: ldc2_w -60088352
    //   763: l2i
    //   764: ldc_w 190745517
    //   767: ixor
    //   768: ixor
    //   769: lookupswitch default -> 796, -1687217417 -> 1326, -1462493708 -> 752
    //   796: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   799: getstatic Perryc.1 : I
    //   802: ifeq -> 816
    //   805: ldc2_w 2063102876
    //   808: l2i
    //   809: ldc_w 159497719
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -345790564
    //   819: l2i
    //   820: ldc_w -1731396607
    //   823: ixor
    //   824: ldc2_w 1462034848
    //   827: l2i
    //   828: ldc_w -431987620
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 1322, -1038267497 -> 816, -1026826655 -> 860
    //   860: aload_0
    //   861: getstatic Perryc.c : I
    //   864: iflt -> 878
    //   867: ldc2_w -436850148
    //   870: l2i
    //   871: ldc_w -2141439692
    //   874: ixor
    //   875: goto -> 886
    //   878: ldc2_w 1963109807
    //   881: l2i
    //   882: ldc_w 1149907659
    //   885: ixor
    //   886: ldc2_w 1899929686
    //   889: l2i
    //   890: ldc_w 775968986
    //   893: ixor
    //   894: ixor
    //   895: lookupswitch default -> 920, 825775578 -> 878, 987034532 -> 1338
    //   920: goto -> 924
    //   923: athrow
    //   924: invokevirtual func_78764_a : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;)V
    //   927: goto -> 931
    //   930: athrow
    //   931: getstatic Perryc.c : I
    //   934: iflt -> 948
    //   937: ldc2_w -206730703
    //   940: l2i
    //   941: ldc_w 1647037061
    //   944: ixor
    //   945: goto -> 956
    //   948: ldc2_w -1252852274
    //   951: l2i
    //   952: ldc_w 1250134271
    //   955: ixor
    //   956: ldc2_w 733046924
    //   959: l2i
    //   960: ldc_w -1814266743
    //   963: ixor
    //   964: ixor
    //   965: lookupswitch default -> 1324, 703288497 -> 948, 1203527988 -> 992
    //   992: iload_2
    //   993: ifeq -> 1007
    //   996: ldc2_w 409745692
    //   999: l2i
    //   1000: ldc_w 1743711825
    //   1003: ixor
    //   1004: goto -> 1015
    //   1007: ldc2_w 53261195
    //   1010: l2i
    //   1011: ldc_w 2091803841
    //   1014: ixor
    //   1015: ldc2_w -855893143
    //   1018: l2i
    //   1019: ldc_w 682025551
    //   1022: ixor
    //   1023: ixor
    //   1024: tableswitch default -> 996, -1680331157 -> 1048, -1680331156 -> 1311
    //   1048: getstatic Perryc.1 : I
    //   1051: ifeq -> 1065
    //   1054: ldc2_w -1375310093
    //   1057: l2i
    //   1058: ldc_w 965112658
    //   1061: ixor
    //   1062: goto -> 1073
    //   1065: ldc2_w 789590677
    //   1068: l2i
    //   1069: ldc_w -57558466
    //   1072: ixor
    //   1073: ldc2_w 660021937
    //   1076: l2i
    //   1077: ldc_w -1950577463
    //   1080: ixor
    //   1081: ixor
    //   1082: lookupswitch default -> 1108, 242746494 -> 1065, 996914137 -> 1344
    //   1108: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1111: getstatic Perryc.c : I
    //   1114: iflt -> 1128
    //   1117: ldc2_w -157236525
    //   1120: l2i
    //   1121: ldc_w 1218668756
    //   1124: ixor
    //   1125: goto -> 1136
    //   1128: ldc2_w 1169802129
    //   1131: l2i
    //   1132: ldc_w 486144520
    //   1135: ixor
    //   1136: ldc2_w -1175487709
    //   1139: l2i
    //   1140: ldc_w 2021309476
    //   1143: ixor
    //   1144: ixor
    //   1145: lookupswitch default -> 1336, -1730806114 -> 1172, 2140564736 -> 1128
    //   1172: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1175: getstatic Perryc.c : I
    //   1178: iflt -> 1192
    //   1181: ldc2_w 2136931953
    //   1184: l2i
    //   1185: ldc_w 462028858
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w -1562186628
    //   1195: l2i
    //   1196: ldc_w -911845880
    //   1199: ixor
    //   1200: ldc2_w -1371539901
    //   1203: l2i
    //   1204: ldc_w -1411378581
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 1328, 1628117603 -> 1192, 1855675996 -> 1236
    //   1236: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   1239: getstatic Perryc.0 : I
    //   1242: ifle -> 1256
    //   1245: ldc2_w -678938036
    //   1248: l2i
    //   1249: ldc_w 904605377
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w 48635291
    //   1259: l2i
    //   1260: ldc_w -946941668
    //   1263: ixor
    //   1264: ldc2_w -2037036242
    //   1267: l2i
    //   1268: ldc_w -1157703719
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 1300, -569866118 -> 1312, 1966778066 -> 1256
    //   1300: goto -> 1304
    //   1303: athrow
    //   1304: invokevirtual func_184609_a : (Lnet/minecraft/util/EnumHand;)V
    //   1307: goto -> 1311
    //   1310: athrow
    //   1311: return
    //   1312: aconst_null
    //   1313: athrow
    //   1314: aconst_null
    //   1315: athrow
    //   1316: aconst_null
    //   1317: athrow
    //   1318: aconst_null
    //   1319: athrow
    //   1320: aconst_null
    //   1321: athrow
    //   1322: aconst_null
    //   1323: athrow
    //   1324: aconst_null
    //   1325: athrow
    //   1326: aconst_null
    //   1327: athrow
    //   1328: aconst_null
    //   1329: athrow
    //   1330: aconst_null
    //   1331: athrow
    //   1332: aconst_null
    //   1333: athrow
    //   1334: aconst_null
    //   1335: athrow
    //   1336: aconst_null
    //   1337: athrow
    //   1338: aconst_null
    //   1339: athrow
    //   1340: aconst_null
    //   1341: athrow
    //   1342: aconst_null
    //   1343: athrow
    //   1344: aconst_null
    //   1345: athrow
    //   1346: aconst_null
    //   1347: athrow
    //   1348: pop
    //   1349: goto -> 24
    //   1352: pop
    //   1353: aconst_null
    //   1354: goto -> 1348
    //   1357: dup
    //   1358: ifnull -> 1348
    //   1361: checkcast java/lang/Throwable
    //   1364: athrow
    //   1365: dup
    //   1366: ifnull -> 1352
    //   1369: checkcast java/lang/Throwable
    //   1372: athrow
    //   1373: aconst_null
    //   1374: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1288	0	entity	Lnet/minecraft/entity/Entity;
    //   24	1288	1	packet	Z
    //   24	1288	2	swingArm	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	1357	finally
    //   459	466	466	finally
    //   459	466	3	finally
    //   459	466	459	java/util/NoSuchElementException
    //   460	466	466	finally
    //   460	466	459	java/lang/ClassCastException
    //   531	538	538	finally
    //   531	538	3	finally
    //   532	538	531	java/lang/RuntimeException
    //   532	538	538	finally
    //   532	538	3	java/lang/ClassCastException
    //   924	930	930	finally
    //   924	930	3	finally
    //   924	930	930	finally
    //   924	930	3	java/lang/EnumConstantNotPresentException
    //   924	930	3	java/lang/ArithmeticException
    //   1303	1310	1310	finally
    //   1303	1310	1303	finally
    //   1303	1310	3	finally
    //   1304	1310	3	java/util/ConcurrentModificationException
    //   1304	1310	1303	java/lang/ClassCastException
    //   1357	1365	1357	java/util/ConcurrentModificationException
    //   1373	1375	3	finally
  }
  
  public static float getHealth(Entity paramEntity) {
    return Perry1.6d(null, (int)-657924803L ^ 0xE614D6D7, paramEntity);
  }
  
  public static List getUnsafeBlocks(Entity paramEntity, int paramInt, boolean paramBoolean) {
    return Perry1.4Y(null, (int)-1153150388L ^ 0xB5D9755D, paramEntity, paramInt, paramBoolean);
  }
  
  public static void moveEntityStrafe(double speed, Entity entity) {
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
  
  public static boolean isAboveWater(Entity paramEntity) {
    return Perry1.5Y(null, (int)53421996L ^ 0x23E46222, paramEntity);
  }
  
  public static boolean isNeutralMob(Entity paramEntity) {
    return Perry1.5Q(null, (int)-2011580898L ^ 0x804725E4, paramEntity);
  }
  
  public static boolean isHostileMob(Entity paramEntity) {
    return Perry1.5V(null, (int)-1252540894L ^ 0xA4E8B799, paramEntity);
  }
  
  public static Vec3d getInterpolatedPos(Entity entity, float partialTicks) {
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
  
  public static boolean isProjectile(Entity paramEntity) {
    return Perry1.5U(null, (int)-1119896855L ^ 0xBAF1DFC4, paramEntity);
  }
  
  public static List getUnsafeBlocksFromVec3d(Vec3d pos, int height, boolean floor) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3139
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 3131
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3123
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 1832360598
    //   37: l2i
    //   38: ldc_w 372952351
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -831220806
    //   48: l2i
    //   49: ldc_w -90404961
    //   52: ixor
    //   53: ldc2_w -629788097
    //   56: l2i
    //   57: ldc_w 1036309677
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1665158885 -> 3048, 1224206884 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w 1359350813
    //   108: l2i
    //   109: ldc_w 749648241
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -85146142
    //   119: l2i
    //   120: ldc_w 2002869581
    //   123: ixor
    //   124: ldc2_w -492317245
    //   127: l2i
    //   128: ldc_w -590983620
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, 66923945 -> 116, 1137258131 -> 3092
    //   160: astore_3
    //   161: getstatic Perryc.1 : I
    //   164: ifeq -> 178
    //   167: ldc2_w 1746988496
    //   170: l2i
    //   171: ldc_w -618217024
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 471895449
    //   181: l2i
    //   182: ldc_w 543930420
    //   185: ixor
    //   186: ldc2_w -451046740
    //   189: l2i
    //   190: ldc_w 1409447918
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 3052, -1923821329 -> 220, 35244370 -> 178
    //   220: iload_1
    //   221: getstatic Perryc.c : I
    //   224: iflt -> 238
    //   227: ldc2_w -1717101652
    //   230: l2i
    //   231: ldc_w 52298585
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w 1038683809
    //   241: l2i
    //   242: ldc_w 2097706506
    //   245: ixor
    //   246: ldc2_w -1886830463
    //   249: l2i
    //   250: ldc_w 2144946487
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 280, -1426082518 -> 238, 1793659203 -> 3106
    //   280: iload_2
    //   281: getstatic Perryc.0 : I
    //   284: ifle -> 298
    //   287: ldc2_w 1833891215
    //   290: l2i
    //   291: ldc_w -154527001
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 1214518707
    //   301: l2i
    //   302: ldc_w 380213418
    //   305: ixor
    //   306: ldc2_w -1980710765
    //   309: l2i
    //   310: ldc_w 7068591
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, 304084052 -> 3036, 1597932925 -> 298
    //   340: goto -> 344
    //   343: athrow
    //   344: invokestatic getOffsets : (IZ)[Lnet/minecraft/util/math/Vec3d;
    //   347: goto -> 351
    //   350: athrow
    //   351: getstatic Perryc.0 : I
    //   354: ifle -> 368
    //   357: ldc2_w -743812391
    //   360: l2i
    //   361: ldc_w -1102641806
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w 1579002638
    //   371: l2i
    //   372: ldc_w -1219144268
    //   375: ixor
    //   376: ldc2_w 1201136563
    //   379: l2i
    //   380: ldc_w 6141900
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 3094, -1367168315 -> 412, 707199956 -> 368
    //   412: astore #4
    //   414: getstatic Perryc.0 : I
    //   417: ifle -> 431
    //   420: ldc2_w 1115943063
    //   423: l2i
    //   424: ldc_w -1681329966
    //   427: ixor
    //   428: goto -> 439
    //   431: ldc2_w 1953286390
    //   434: l2i
    //   435: ldc_w -1096711217
    //   438: ixor
    //   439: ldc2_w 1070034338
    //   442: l2i
    //   443: ldc_w -100312044
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -1391837209 -> 431, 478753267 -> 3086
    //   476: aload #4
    //   478: arraylength
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 496
    //   485: ldc2_w -1732539426
    //   488: l2i
    //   489: ldc_w 257668654
    //   492: ixor
    //   493: goto -> 504
    //   496: ldc2_w -998486807
    //   499: l2i
    //   500: ldc_w 1335199524
    //   503: ixor
    //   504: ldc2_w -1816955675
    //   507: l2i
    //   508: ldc_w 191030546
    //   511: ixor
    //   512: ixor
    //   513: lookupswitch default -> 540, -203814057 -> 496, 254913543 -> 3096
    //   540: istore #5
    //   542: ldc2_w 233871743
    //   545: l2i
    //   546: ldc_w 233871743
    //   549: ixor
    //   550: getstatic Perryc.c : I
    //   553: iflt -> 567
    //   556: ldc2_w 1211055833
    //   559: l2i
    //   560: ldc_w -1202289282
    //   563: ixor
    //   564: goto -> 575
    //   567: ldc2_w -1029727958
    //   570: l2i
    //   571: ldc_w -838859873
    //   574: ixor
    //   575: ldc2_w 467944170
    //   578: l2i
    //   579: ldc_w 1280895696
    //   582: ixor
    //   583: ixor
    //   584: lookupswitch default -> 612, -1480256611 -> 3108, -406790062 -> 567
    //   612: istore #6
    //   614: getstatic Perryc.1 : I
    //   617: ifeq -> 631
    //   620: ldc2_w -51402879
    //   623: l2i
    //   624: ldc_w 1108082110
    //   627: ixor
    //   628: goto -> 639
    //   631: ldc2_w -1764974219
    //   634: l2i
    //   635: ldc_w 1616570495
    //   638: ixor
    //   639: ldc2_w -728125370
    //   642: l2i
    //   643: ldc_w 2076100837
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 3062, 298001052 -> 631, 1504784809 -> 676
    //   676: iload #6
    //   678: getstatic Perryc.c : I
    //   681: iflt -> 695
    //   684: ldc2_w 2026650025
    //   687: l2i
    //   688: ldc_w -1789969695
    //   691: ixor
    //   692: goto -> 703
    //   695: ldc2_w -1876457158
    //   698: l2i
    //   699: ldc_w -525716650
    //   702: ixor
    //   703: ldc2_w 1033096524
    //   706: l2i
    //   707: ldc_w 467894956
    //   710: ixor
    //   711: ixor
    //   712: lookupswitch default -> 3076, -873247576 -> 695, 1459484044 -> 740
    //   740: iload #5
    //   742: if_icmpge -> 756
    //   745: ldc2_w 1129935137
    //   748: l2i
    //   749: ldc_w -182436154
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -1423698169
    //   759: l2i
    //   760: ldc_w 492656895
    //   763: ixor
    //   764: ldc2_w 1349431371
    //   767: l2i
    //   768: ldc_w -1985767101
    //   771: ixor
    //   772: ixor
    //   773: tableswitch default -> 745, 1874093807 -> 796, 1874093808 -> 2970
    //   796: getstatic Perryc.c : I
    //   799: iflt -> 813
    //   802: ldc2_w 1947016524
    //   805: l2i
    //   806: ldc_w 1201850884
    //   809: ixor
    //   810: goto -> 821
    //   813: ldc2_w -490966551
    //   816: l2i
    //   817: ldc_w -1758260700
    //   820: ixor
    //   821: ldc2_w 1855464146
    //   824: l2i
    //   825: ldc_w -537892152
    //   828: ixor
    //   829: ixor
    //   830: lookupswitch default -> 3102, -2100846766 -> 813, -991482921 -> 856
    //   856: aload #4
    //   858: getstatic Perryc.c : I
    //   861: iflt -> 875
    //   864: ldc2_w 1288724763
    //   867: l2i
    //   868: ldc_w 542359155
    //   871: ixor
    //   872: goto -> 883
    //   875: ldc2_w 100624147
    //   878: l2i
    //   879: ldc_w -138367426
    //   882: ixor
    //   883: ldc2_w -723981749
    //   886: l2i
    //   887: ldc_w -1625192183
    //   890: ixor
    //   891: ixor
    //   892: lookupswitch default -> 3078, -1178162577 -> 920, 662354986 -> 875
    //   920: iload #6
    //   922: aaload
    //   923: getstatic Perryc.1 : I
    //   926: ifeq -> 940
    //   929: ldc2_w 937792572
    //   932: l2i
    //   933: ldc_w -1221090617
    //   936: ixor
    //   937: goto -> 948
    //   940: ldc2_w 2088305187
    //   943: l2i
    //   944: ldc_w 33305602
    //   947: ixor
    //   948: ldc2_w -1006024768
    //   951: l2i
    //   952: ldc_w 268533641
    //   955: ixor
    //   956: ixor
    //   957: lookupswitch default -> 3072, -1450373528 -> 984, 1423576754 -> 940
    //   984: astore #7
    //   986: new net/minecraft/util/math/BlockPos
    //   989: dup
    //   990: getstatic Perryc.0 : I
    //   993: ifle -> 1007
    //   996: ldc2_w 81027918
    //   999: l2i
    //   1000: ldc_w 1897090027
    //   1003: ixor
    //   1004: goto -> 1015
    //   1007: ldc2_w -1565379091
    //   1010: l2i
    //   1011: ldc_w -509456728
    //   1014: ixor
    //   1015: ldc2_w 1102947778
    //   1018: l2i
    //   1019: ldc_w -1394287763
    //   1022: ixor
    //   1023: ixor
    //   1024: lookupswitch default -> 1052, -1734453750 -> 3080, 647136151 -> 1007
    //   1052: aload_0
    //   1053: getstatic Perryc.c : I
    //   1056: iflt -> 1070
    //   1059: ldc2_w -962235596
    //   1062: l2i
    //   1063: ldc_w 1319858151
    //   1066: ixor
    //   1067: goto -> 1078
    //   1070: ldc2_w 385580987
    //   1073: l2i
    //   1074: ldc_w 1927411225
    //   1077: ixor
    //   1078: ldc2_w 255684977
    //   1081: l2i
    //   1082: ldc_w -660276305
    //   1085: ixor
    //   1086: ixor
    //   1087: lookupswitch default -> 3034, -1283259524 -> 1112, 1603769869 -> 1070
    //   1112: goto -> 1116
    //   1115: athrow
    //   1116: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   1119: goto -> 1123
    //   1122: athrow
    //   1123: getstatic Perryc.0 : I
    //   1126: ifle -> 1140
    //   1129: ldc2_w -74393936
    //   1132: l2i
    //   1133: ldc_w 797608733
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -994802357
    //   1143: l2i
    //   1144: ldc_w 2099911399
    //   1147: ixor
    //   1148: ldc2_w -1730939060
    //   1151: l2i
    //   1152: ldc_w -1197678701
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1184, -289998584 -> 1140, -195725966 -> 3056
    //   1184: aload #7
    //   1186: getstatic Perryc.c : I
    //   1189: iflt -> 1203
    //   1192: ldc2_w -362259709
    //   1195: l2i
    //   1196: ldc_w 695853035
    //   1199: ixor
    //   1200: goto -> 1211
    //   1203: ldc2_w 1265853550
    //   1206: l2i
    //   1207: ldc_w 1159108082
    //   1210: ixor
    //   1211: ldc2_w 88232751
    //   1214: l2i
    //   1215: ldc_w 2014825110
    //   1218: ixor
    //   1219: ixor
    //   1220: lookupswitch default -> 3064, -1102832303 -> 1203, 1932552229 -> 1248
    //   1248: getfield field_72450_a : D
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w -64864478
    //   1260: l2i
    //   1261: ldc_w -431222698
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 1164029313
    //   1271: l2i
    //   1272: ldc_w 1385315436
    //   1275: ixor
    //   1276: ldc2_w -1650945605
    //   1279: l2i
    //   1280: ldc_w -368196135
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 1312, 1845197590 -> 3098, 1914598650 -> 1268
    //   1312: aload #7
    //   1314: getstatic Perryc.1 : I
    //   1317: ifeq -> 1331
    //   1320: ldc2_w 929284149
    //   1323: l2i
    //   1324: ldc_w 1542290021
    //   1327: ixor
    //   1328: goto -> 1339
    //   1331: ldc2_w -1362030761
    //   1334: l2i
    //   1335: ldc_w 570286446
    //   1338: ixor
    //   1339: ldc2_w 391496884
    //   1342: l2i
    //   1343: ldc_w 1893788181
    //   1346: ixor
    //   1347: ixor
    //   1348: lookupswitch default -> 1376, 188454129 -> 3104, 2088079389 -> 1331
    //   1376: getfield field_72448_b : D
    //   1379: getstatic Perryc.1 : I
    //   1382: ifeq -> 1396
    //   1385: ldc2_w -802265965
    //   1388: l2i
    //   1389: ldc_w 1088445235
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w 1550550803
    //   1399: l2i
    //   1400: ldc_w -247440954
    //   1403: ixor
    //   1404: ldc2_w -2022825964
    //   1407: l2i
    //   1408: ldc_w -35049708
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 1440, -364302176 -> 3074, 1285981009 -> 1396
    //   1440: aload #7
    //   1442: getstatic Perryc.0 : I
    //   1445: ifle -> 1459
    //   1448: ldc2_w -1743064820
    //   1451: l2i
    //   1452: ldc_w -1457554190
    //   1455: ixor
    //   1456: goto -> 1467
    //   1459: ldc2_w 987513684
    //   1462: l2i
    //   1463: ldc_w -1457417965
    //   1466: ixor
    //   1467: ldc2_w -1065664733
    //   1470: l2i
    //   1471: ldc_w 1315766791
    //   1474: ixor
    //   1475: ixor
    //   1476: lookupswitch default -> 3070, -1089228582 -> 1459, 502001507 -> 1504
    //   1504: getfield field_72449_c : D
    //   1507: getstatic Perryc.c : I
    //   1510: iflt -> 1524
    //   1513: ldc2_w 386102338
    //   1516: l2i
    //   1517: ldc_w 570107861
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w 2118074010
    //   1527: l2i
    //   1528: ldc_w 687657569
    //   1531: ixor
    //   1532: ldc2_w 471338984
    //   1535: l2i
    //   1536: ldc_w 2049806843
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 1568, 122741665 -> 1524, 1355664772 -> 3054
    //   1568: goto -> 1572
    //   1571: athrow
    //   1572: invokevirtual func_177963_a : (DDD)Lnet/minecraft/util/math/BlockPos;
    //   1575: goto -> 1579
    //   1578: athrow
    //   1579: getstatic Perryc.0 : I
    //   1582: ifle -> 1596
    //   1585: ldc2_w -558304375
    //   1588: l2i
    //   1589: ldc_w 890049170
    //   1592: ixor
    //   1593: goto -> 1604
    //   1596: ldc2_w -1059695570
    //   1599: l2i
    //   1600: ldc_w 1805332869
    //   1603: ixor
    //   1604: ldc2_w 693372048
    //   1607: l2i
    //   1608: ldc_w -127302388
    //   1611: ixor
    //   1612: ixor
    //   1613: lookupswitch default -> 1640, -2113487028 -> 1596, 982016135 -> 3090
    //   1640: astore #8
    //   1642: getstatic Perryc.c : I
    //   1645: iflt -> 1659
    //   1648: ldc2_w -183639511
    //   1651: l2i
    //   1652: ldc_w 1061695766
    //   1655: ixor
    //   1656: goto -> 1667
    //   1659: ldc2_w -1113017214
    //   1662: l2i
    //   1663: ldc_w -558574709
    //   1666: ixor
    //   1667: ldc2_w 1341013046
    //   1670: l2i
    //   1671: ldc_w 657184952
    //   1674: ixor
    //   1675: ixor
    //   1676: lookupswitch default -> 1704, -1568655439 -> 3088, -1355764730 -> 1659
    //   1704: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1707: getstatic Perryc.c : I
    //   1710: iflt -> 1724
    //   1713: ldc2_w 1718807351
    //   1716: l2i
    //   1717: ldc_w -552901690
    //   1720: ixor
    //   1721: goto -> 1732
    //   1724: ldc2_w 201524424
    //   1727: l2i
    //   1728: ldc_w -627965330
    //   1731: ixor
    //   1732: ldc2_w -1476395018
    //   1735: l2i
    //   1736: ldc_w -1313405038
    //   1739: ixor
    //   1740: ixor
    //   1741: lookupswitch default -> 1768, -1791036899 -> 1724, -1355714411 -> 3050
    //   1768: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1771: getstatic Perryc.1 : I
    //   1774: ifeq -> 1788
    //   1777: ldc2_w -982763622
    //   1780: l2i
    //   1781: ldc_w 1890168062
    //   1784: ixor
    //   1785: goto -> 1796
    //   1788: ldc2_w 2067458505
    //   1791: l2i
    //   1792: ldc_w 1637693600
    //   1795: ixor
    //   1796: ldc2_w -320519531
    //   1799: l2i
    //   1800: ldc_w 13719983
    //   1803: ixor
    //   1804: ixor
    //   1805: lookupswitch default -> 3066, -158086573 -> 1832, 1508999262 -> 1788
    //   1832: aload #8
    //   1834: getstatic Perryc.c : I
    //   1837: iflt -> 1851
    //   1840: ldc2_w 1136120461
    //   1843: l2i
    //   1844: ldc_w -1929528458
    //   1847: ixor
    //   1848: goto -> 1859
    //   1851: ldc2_w 244052514
    //   1854: l2i
    //   1855: ldc_w -1663894850
    //   1858: ixor
    //   1859: ldc2_w 1275217961
    //   1862: l2i
    //   1863: ldc_w -1130256991
    //   1866: ixor
    //   1867: ixor
    //   1868: lookupswitch default -> 1896, 746128803 -> 1851, 1072268403 -> 3068
    //   1896: goto -> 1900
    //   1899: athrow
    //   1900: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1903: goto -> 1907
    //   1906: athrow
    //   1907: getstatic Perryc.c : I
    //   1910: iflt -> 1924
    //   1913: ldc2_w 892484280
    //   1916: l2i
    //   1917: ldc_w -1036133804
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w 757645250
    //   1927: l2i
    //   1928: ldc_w -646741473
    //   1931: ixor
    //   1932: ldc2_w -1022357984
    //   1935: l2i
    //   1936: ldc_w 1492926837
    //   1939: ixor
    //   1940: ixor
    //   1941: lookupswitch default -> 3084, 1826860985 -> 1924, 1874293384 -> 1968
    //   1968: goto -> 1972
    //   1971: athrow
    //   1972: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1977: goto -> 1981
    //   1980: athrow
    //   1981: getstatic Perryc.1 : I
    //   1984: ifeq -> 1998
    //   1987: ldc2_w -88346016
    //   1990: l2i
    //   1991: ldc_w -543972966
    //   1994: ixor
    //   1995: goto -> 2006
    //   1998: ldc2_w 2006384729
    //   2001: l2i
    //   2002: ldc_w 1804022999
    //   2005: ixor
    //   2006: ldc2_w 1221870899
    //   2009: l2i
    //   2010: ldc_w -1220536638
    //   2013: ixor
    //   2014: ixor
    //   2015: lookupswitch default -> 3058, -625213429 -> 1998, -477862017 -> 2040
    //   2040: astore #9
    //   2042: getstatic Perryc.0 : I
    //   2045: ifle -> 2059
    //   2048: ldc2_w 1516974140
    //   2051: l2i
    //   2052: ldc_w -965734218
    //   2055: ixor
    //   2056: goto -> 2067
    //   2059: ldc2_w -174578288
    //   2062: l2i
    //   2063: ldc_w 541643794
    //   2066: ixor
    //   2067: ldc2_w 518302361
    //   2070: l2i
    //   2071: ldc_w 890162548
    //   2074: ixor
    //   2075: ixor
    //   2076: lookupswitch default -> 2104, -2022645605 -> 2059, -1208924313 -> 3044
    //   2104: aload #9
    //   2106: instanceof net/minecraft/block/BlockAir
    //   2109: ifne -> 2123
    //   2112: ldc2_w 2022058271
    //   2115: l2i
    //   2116: ldc_w 400494170
    //   2119: ixor
    //   2120: goto -> 2131
    //   2123: ldc2_w 234277406
    //   2126: l2i
    //   2127: ldc_w 1655696730
    //   2130: ixor
    //   2131: ldc2_w -248715179
    //   2134: l2i
    //   2135: ldc_w -1945613898
    //   2138: ixor
    //   2139: ixor
    //   2140: tableswitch default -> 2112, 310216358 -> 2164, 310216359 -> 2767
    //   2164: getstatic Perryc.c : I
    //   2167: iflt -> 2181
    //   2170: ldc2_w 1977137405
    //   2173: l2i
    //   2174: ldc_w 361351360
    //   2177: ixor
    //   2178: goto -> 2189
    //   2181: ldc2_w 789456880
    //   2184: l2i
    //   2185: ldc_w 1311903160
    //   2188: ixor
    //   2189: ldc2_w 1056684466
    //   2192: l2i
    //   2193: ldc_w -950185263
    //   2196: ixor
    //   2197: ixor
    //   2198: lookupswitch default -> 3040, -1734688469 -> 2224, -1711826082 -> 2181
    //   2224: aload #9
    //   2226: instanceof net/minecraft/block/BlockLiquid
    //   2229: ifne -> 2243
    //   2232: ldc2_w -491577821
    //   2235: l2i
    //   2236: ldc_w -1750936337
    //   2239: ixor
    //   2240: goto -> 2251
    //   2243: ldc2_w -171167969
    //   2246: l2i
    //   2247: ldc_w -2132941360
    //   2250: ixor
    //   2251: ldc2_w 1995813822
    //   2254: l2i
    //   2255: ldc_w 1945227079
    //   2258: ixor
    //   2259: ixor
    //   2260: tableswitch default -> 2232, 1880471093 -> 2284, 1880471094 -> 2767
    //   2284: getstatic Perryc.0 : I
    //   2287: ifle -> 2301
    //   2290: ldc2_w 393506869
    //   2293: l2i
    //   2294: ldc_w 1428290447
    //   2297: ixor
    //   2298: goto -> 2309
    //   2301: ldc2_w -386078296
    //   2304: l2i
    //   2305: ldc_w -256753498
    //   2308: ixor
    //   2309: ldc2_w -1829894435
    //   2312: l2i
    //   2313: ldc_w -1425572391
    //   2316: ixor
    //   2317: ixor
    //   2318: lookupswitch default -> 2344, 1021915984 -> 2301, 2075979966 -> 3038
    //   2344: aload #9
    //   2346: instanceof net/minecraft/block/BlockTallGrass
    //   2349: ifne -> 2363
    //   2352: ldc2_w -543443103
    //   2355: l2i
    //   2356: ldc_w 387655701
    //   2359: ixor
    //   2360: goto -> 2371
    //   2363: ldc2_w -2000677503
    //   2366: l2i
    //   2367: ldc_w 1077971700
    //   2370: ixor
    //   2371: ldc2_w 39558731
    //   2374: l2i
    //   2375: ldc_w 1061829433
    //   2378: ixor
    //   2379: ixor
    //   2380: tableswitch default -> 2352, -175031802 -> 2404, -175031801 -> 2767
    //   2404: getstatic Perryc.0 : I
    //   2407: ifle -> 2421
    //   2410: ldc2_w 148278481
    //   2413: l2i
    //   2414: ldc_w -1003761157
    //   2417: ixor
    //   2418: goto -> 2429
    //   2421: ldc2_w 1161527224
    //   2424: l2i
    //   2425: ldc_w 504498278
    //   2428: ixor
    //   2429: ldc2_w -223704010
    //   2432: l2i
    //   2433: ldc_w -359553396
    //   2436: ixor
    //   2437: ixor
    //   2438: lookupswitch default -> 2464, -725190768 -> 3110, 171537538 -> 2421
    //   2464: aload #9
    //   2466: instanceof net/minecraft/block/BlockFire
    //   2469: ifne -> 2483
    //   2472: ldc2_w 302980208
    //   2475: l2i
    //   2476: ldc_w -997457782
    //   2479: ixor
    //   2480: goto -> 2491
    //   2483: ldc2_w -1032590532
    //   2486: l2i
    //   2487: ldc_w 351336385
    //   2490: ixor
    //   2491: ldc2_w 170681273
    //   2494: l2i
    //   2495: ldc_w -842667112
    //   2498: ixor
    //   2499: ixor
    //   2500: tableswitch default -> 2472, 292197595 -> 2524, 292197596 -> 2767
    //   2524: getstatic Perryc.c : I
    //   2527: iflt -> 2541
    //   2530: ldc2_w 1344187751
    //   2533: l2i
    //   2534: ldc_w 353851848
    //   2537: ixor
    //   2538: goto -> 2549
    //   2541: ldc2_w -137567650
    //   2544: l2i
    //   2545: ldc_w 1717729035
    //   2548: ixor
    //   2549: ldc2_w -1966018833
    //   2552: l2i
    //   2553: ldc_w -126091998
    //   2556: ixor
    //   2557: ixor
    //   2558: lookupswitch default -> 2584, 933422946 -> 3060, 1684415433 -> 2541
    //   2584: aload #9
    //   2586: instanceof net/minecraft/block/BlockDeadBush
    //   2589: ifne -> 2603
    //   2592: ldc2_w 2027037737
    //   2595: l2i
    //   2596: ldc_w -512730342
    //   2599: ixor
    //   2600: goto -> 2611
    //   2603: ldc2_w -1171629039
    //   2606: l2i
    //   2607: ldc_w 596124449
    //   2610: ixor
    //   2611: ldc2_w -1559230460
    //   2614: l2i
    //   2615: ldc_w -800080002
    //   2618: ixor
    //   2619: ixor
    //   2620: tableswitch default -> 2592, -352466871 -> 2644, -352466870 -> 2767
    //   2644: getstatic Perryc.1 : I
    //   2647: ifeq -> 2661
    //   2650: ldc2_w 611690261
    //   2653: l2i
    //   2654: ldc_w 371688614
    //   2657: ixor
    //   2658: goto -> 2669
    //   2661: ldc2_w 1414367753
    //   2664: l2i
    //   2665: ldc_w 786661694
    //   2668: ixor
    //   2669: ldc2_w 942176836
    //   2672: l2i
    //   2673: ldc_w 1130528044
    //   2676: ixor
    //   2677: ixor
    //   2678: lookupswitch default -> 2704, -220851158 -> 2661, 1226319067 -> 3082
    //   2704: aload #9
    //   2706: instanceof net/minecraft/block/BlockSnow
    //   2709: ifne -> 2723
    //   2712: ldc2_w -742884047
    //   2715: l2i
    //   2716: ldc_w -1887143379
    //   2719: ixor
    //   2720: goto -> 2731
    //   2723: ldc2_w 829639030
    //   2726: l2i
    //   2727: ldc_w 1833913963
    //   2730: ixor
    //   2731: ldc2_w -1179621084
    //   2734: l2i
    //   2735: ldc_w -1415824166
    //   2738: ixor
    //   2739: ixor
    //   2740: tableswitch default -> 2712, 1309692642 -> 2764, 1309692643 -> 2767
    //   2764: goto -> 2964
    //   2767: getstatic Perryc.1 : I
    //   2770: ifeq -> 2784
    //   2773: ldc2_w 773762747
    //   2776: l2i
    //   2777: ldc_w -1988373012
    //   2780: ixor
    //   2781: goto -> 2792
    //   2784: ldc2_w -318652048
    //   2787: l2i
    //   2788: ldc_w 644309589
    //   2791: ixor
    //   2792: ldc2_w -223720212
    //   2795: l2i
    //   2796: ldc_w 1662679521
    //   2799: ixor
    //   2800: ixor
    //   2801: lookupswitch default -> 3112, 919948890 -> 2784, 1524012584 -> 2828
    //   2828: aload_3
    //   2829: getstatic Perryc.1 : I
    //   2832: ifeq -> 2846
    //   2835: ldc2_w -71657260
    //   2838: l2i
    //   2839: ldc_w -452160205
    //   2842: ixor
    //   2843: goto -> 2854
    //   2846: ldc2_w -4983748
    //   2849: l2i
    //   2850: ldc_w 867058641
    //   2853: ixor
    //   2854: ldc2_w 1323467530
    //   2857: l2i
    //   2858: ldc_w 1411061524
    //   2861: ixor
    //   2862: ixor
    //   2863: lookupswitch default -> 2888, 72325625 -> 3100, 818337240 -> 2846
    //   2888: aload #7
    //   2890: getstatic Perryc.c : I
    //   2893: iflt -> 2907
    //   2896: ldc2_w -1880443100
    //   2899: l2i
    //   2900: ldc_w 754046156
    //   2903: ixor
    //   2904: goto -> 2915
    //   2907: ldc2_w -1081254515
    //   2910: l2i
    //   2911: ldc_w 1087453488
    //   2914: ixor
    //   2915: ldc2_w 1267880309
    //   2918: l2i
    //   2919: ldc_w 215024847
    //   2922: ixor
    //   2923: ixor
    //   2924: lookupswitch default -> 2952, -1857958425 -> 2907, -463980974 -> 3042
    //   2952: goto -> 2956
    //   2955: athrow
    //   2956: invokevirtual add : (Ljava/lang/Object;)Z
    //   2959: goto -> 2963
    //   2962: athrow
    //   2963: pop
    //   2964: iinc #6, 1
    //   2967: goto -> 614
    //   2970: getstatic Perryc.1 : I
    //   2973: ifeq -> 2987
    //   2976: ldc2_w -468046613
    //   2979: l2i
    //   2980: ldc_w -595093897
    //   2983: ixor
    //   2984: goto -> 2995
    //   2987: ldc2_w 640107975
    //   2990: l2i
    //   2991: ldc_w -1657944993
    //   2994: ixor
    //   2995: ldc2_w -1777283458
    //   2998: l2i
    //   2999: ldc_w 1470838458
    //   3002: ixor
    //   3003: ixor
    //   3004: lookupswitch default -> 3046, -114933160 -> 2987, 2058451292 -> 3032
    //   3032: aload_3
    //   3033: areturn
    //   3034: aconst_null
    //   3035: athrow
    //   3036: aconst_null
    //   3037: athrow
    //   3038: aconst_null
    //   3039: athrow
    //   3040: aconst_null
    //   3041: athrow
    //   3042: aconst_null
    //   3043: athrow
    //   3044: aconst_null
    //   3045: athrow
    //   3046: aconst_null
    //   3047: athrow
    //   3048: aconst_null
    //   3049: athrow
    //   3050: aconst_null
    //   3051: athrow
    //   3052: aconst_null
    //   3053: athrow
    //   3054: aconst_null
    //   3055: athrow
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
    //   3114: pop
    //   3115: goto -> 24
    //   3118: pop
    //   3119: aconst_null
    //   3120: goto -> 3114
    //   3123: dup
    //   3124: ifnull -> 3114
    //   3127: checkcast java/lang/Throwable
    //   3130: athrow
    //   3131: dup
    //   3132: ifnull -> 3118
    //   3135: checkcast java/lang/Throwable
    //   3138: athrow
    //   3139: aconst_null
    //   3140: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1642	1322	8	targetPos	Lnet/minecraft/util/math/BlockPos;
    //   2042	922	9	block	Lnet/minecraft/block/Block;
    //   986	1978	7	vector	Lnet/minecraft/util/math/Vec3d;
    //   24	3010	0	pos	Lnet/minecraft/util/math/Vec3d;
    //   24	3010	1	height	I
    //   24	3010	2	floor	Z
    //   161	2873	3	vec3ds	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	2873	3	vec3ds	Ljava/util/ArrayList<Lnet/minecraft/util/math/Vec3d;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	3123	java/lang/IllegalArgumentException
    //   91	98	98	finally
    //   91	98	91	finally
    //   91	98	91	java/lang/StringIndexOutOfBoundsException
    //   92	98	98	java/lang/UnsupportedOperationException
    //   92	98	98	finally
    //   343	350	350	finally
    //   343	350	343	finally
    //   343	350	343	java/lang/IllegalArgumentException
    //   344	350	3	java/lang/IndexOutOfBoundsException
    //   344	350	3	finally
    //   1115	1122	1122	finally
    //   1115	1122	1122	java/util/ConcurrentModificationException
    //   1115	1122	1115	java/lang/ClassCastException
    //   1116	1122	1115	finally
    //   1116	1122	3	java/lang/ArrayIndexOutOfBoundsException
    //   1571	1578	1578	finally
    //   1571	1578	3	java/lang/StringIndexOutOfBoundsException
    //   1571	1578	1571	finally
    //   1572	1578	1571	finally
    //   1572	1578	1571	java/lang/ArrayIndexOutOfBoundsException
    //   1899	1906	1906	finally
    //   1899	1906	1906	java/lang/ClassCastException
    //   1899	1906	3	finally
    //   1899	1906	1899	finally
    //   1900	1906	3	finally
    //   1971	1980	1980	finally
    //   1971	1980	1971	java/util/ConcurrentModificationException
    //   1972	1980	3	finally
    //   1972	1980	1971	java/lang/NegativeArraySizeException
    //   1972	1980	3	java/lang/AssertionError
    //   2955	2962	2962	finally
    //   2955	2962	2955	java/lang/IllegalStateException
    //   2955	2962	2955	finally
    //   2956	2962	2962	java/lang/AssertionError
    //   2956	2962	3	java/lang/IllegalArgumentException
    //   3123	3131	3123	java/lang/StringIndexOutOfBoundsException
    //   3139	3141	3	java/util/ConcurrentModificationException
  }
  
  public static double getMaxSpeed() {
    return Perry1.2G(null, (int)656507504L ^ 0x22D134C9);
  }
  
  public static boolean isBedrockHole(BlockPos paramBlockPos) {
    return Perry1.6s(null, (int)-1374448188L ^ 0x93483082, paramBlockPos);
  }
  
  public static boolean isTrapped(EntityPlayer player, boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop) {
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
  
  public static boolean isCrystalAtFeet(EntityEnderCrystal crystal, double range) {
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
  
  public static boolean lambda$getNearbyPlayers$3(EntityPlayer paramEntityPlayer) {
    return Perry1.09(null, (int)2072578009L ^ 0x1AD98C64, paramEntityPlayer);
  }
  
  public static boolean isBlockValid(BlockPos paramBlockPos) {
    return Perry1.6k(null, (int)278842353L ^ 0x505D24C, paramBlockPos);
  }
  
  public static List getUntrappedBlocksExtended(int extension, EntityPlayer player, boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop, boolean raytrace) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5014
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 5006
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4998
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -1132665879
    //   37: l2i
    //   38: ldc_w -1786019911
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1966493044
    //   48: l2i
    //   49: ldc_w 1081140623
    //   52: ixor
    //   53: ldc2_w -306560868
    //   56: l2i
    //   57: ldc_w 1140230632
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 4985, -2017766108 -> 45, 1693818487 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w -2062318922
    //   108: l2i
    //   109: ldc_w 1099977163
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1474443671
    //   119: l2i
    //   120: ldc_w 1011854344
    //   123: ixor
    //   124: ldc2_w 1275510725
    //   127: l2i
    //   128: ldc_w -1878898561
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -1316508584 -> 116, 411509959 -> 4969
    //   160: astore #8
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w -116271388
    //   171: l2i
    //   172: ldc_w 365055054
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -1017687579
    //   182: l2i
    //   183: ldc_w 757444896
    //   186: ixor
    //   187: ldc2_w 1093014830
    //   190: l2i
    //   191: ldc_w -501872366
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 4957, 1296235769 -> 224, 1340311190 -> 179
    //   224: iload_0
    //   225: ldc2_w 1411631682
    //   228: l2i
    //   229: ldc_w 1411631683
    //   232: ixor
    //   233: if_icmpne -> 247
    //   236: ldc2_w -540035128
    //   239: l2i
    //   240: ldc_w -1703273043
    //   243: ixor
    //   244: goto -> 255
    //   247: ldc2_w 359877113
    //   250: l2i
    //   251: ldc_w 1355211677
    //   254: ixor
    //   255: ldc2_w -141274725
    //   258: l2i
    //   259: ldc_w -826866908
    //   262: ixor
    //   263: ixor
    //   264: tableswitch default -> 236, 2090268890 -> 288, 2090268891 -> 1007
    //   288: getstatic Perryc.1 : I
    //   291: ifeq -> 305
    //   294: ldc2_w 924468417
    //   297: l2i
    //   298: ldc_w 871346157
    //   301: ixor
    //   302: goto -> 313
    //   305: ldc2_w 316107709
    //   308: l2i
    //   309: ldc_w -1996135929
    //   312: ixor
    //   313: ldc2_w 895901127
    //   316: l2i
    //   317: ldc_w 916308688
    //   320: ixor
    //   321: ixor
    //   322: lookupswitch default -> 348, 118387771 -> 4917, 392227458 -> 305
    //   348: aload #8
    //   350: getstatic Perryc.1 : I
    //   353: ifeq -> 367
    //   356: ldc2_w -1276872990
    //   359: l2i
    //   360: ldc_w 541910723
    //   363: ixor
    //   364: goto -> 375
    //   367: ldc2_w -581748012
    //   370: l2i
    //   371: ldc_w -1482303122
    //   374: ixor
    //   375: ldc2_w -1467588115
    //   378: l2i
    //   379: ldc_w 1064156830
    //   382: ixor
    //   383: ixor
    //   384: lookupswitch default -> 4961, -316850999 -> 412, 71520082 -> 367
    //   412: aload_1
    //   413: getstatic Perryc.0 : I
    //   416: ifle -> 430
    //   419: ldc2_w 1692296378
    //   422: l2i
    //   423: ldc_w 496148755
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w 753778216
    //   433: l2i
    //   434: ldc_w -555770431
    //   437: ixor
    //   438: ldc2_w -1702864521
    //   441: l2i
    //   442: ldc_w -567555185
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 472, -1070596479 -> 430, 1038571345 -> 4887
    //   472: goto -> 476
    //   475: athrow
    //   476: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   479: goto -> 483
    //   482: athrow
    //   483: getstatic Perryc.0 : I
    //   486: ifle -> 500
    //   489: ldc2_w -1068334370
    //   492: l2i
    //   493: ldc_w 826824173
    //   496: ixor
    //   497: goto -> 508
    //   500: ldc2_w -2105043222
    //   503: l2i
    //   504: ldc_w -955769441
    //   507: ixor
    //   508: ldc2_w 41305299
    //   511: l2i
    //   512: ldc_w -559452078
    //   515: ixor
    //   516: ixor
    //   517: lookupswitch default -> 4901, -1721843724 -> 544, 768336818 -> 500
    //   544: iload_2
    //   545: getstatic Perryc.c : I
    //   548: iflt -> 562
    //   551: ldc2_w 1458273891
    //   554: l2i
    //   555: ldc_w -1244543736
    //   558: ixor
    //   559: goto -> 570
    //   562: ldc2_w -294396019
    //   565: l2i
    //   566: ldc_w 824165453
    //   569: ixor
    //   570: ldc2_w -114616233
    //   573: l2i
    //   574: ldc_w -251101230
    //   577: ixor
    //   578: ixor
    //   579: lookupswitch default -> 604, -350626578 -> 4883, -244323718 -> 562
    //   604: iload_3
    //   605: getstatic Perryc.1 : I
    //   608: ifeq -> 622
    //   611: ldc2_w 1881051389
    //   614: l2i
    //   615: ldc_w 1462718967
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w 837518349
    //   625: l2i
    //   626: ldc_w 253334499
    //   629: ixor
    //   630: ldc2_w 1509692899
    //   633: l2i
    //   634: ldc_w 137450151
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 4903, 1866420394 -> 664, 1996260942 -> 622
    //   664: iload #4
    //   666: getstatic Perryc.c : I
    //   669: iflt -> 683
    //   672: ldc2_w -1953028626
    //   675: l2i
    //   676: ldc_w 276516363
    //   679: ixor
    //   680: goto -> 691
    //   683: ldc2_w -198459550
    //   686: l2i
    //   687: ldc_w -1784648301
    //   690: ixor
    //   691: ldc2_w -561312571
    //   694: l2i
    //   695: ldc_w -2063826
    //   698: ixor
    //   699: ixor
    //   700: lookupswitch default -> 728, -1165499122 -> 4933, 551481097 -> 683
    //   728: iload #5
    //   730: getstatic Perryc.c : I
    //   733: iflt -> 747
    //   736: ldc2_w -460968059
    //   739: l2i
    //   740: ldc_w -1410034310
    //   743: ixor
    //   744: goto -> 755
    //   747: ldc2_w -824199492
    //   750: l2i
    //   751: ldc_w -85930043
    //   754: ixor
    //   755: ldc2_w 1121275142
    //   758: l2i
    //   759: ldc_w 866026634
    //   762: ixor
    //   763: ixor
    //   764: lookupswitch default -> 792, 1043952499 -> 4891, 1435121769 -> 747
    //   792: iload #6
    //   794: getstatic Perryc.c : I
    //   797: iflt -> 811
    //   800: ldc2_w -1194750668
    //   803: l2i
    //   804: ldc_w -966425970
    //   807: ixor
    //   808: goto -> 819
    //   811: ldc2_w 630332720
    //   814: l2i
    //   815: ldc_w 669141127
    //   818: ixor
    //   819: ldc2_w -1563191219
    //   822: l2i
    //   823: ldc_w -1418525449
    //   826: ixor
    //   827: ixor
    //   828: lookupswitch default -> 856, 412704637 -> 811, 1997312768 -> 4857
    //   856: iload #7
    //   858: getstatic Perryc.1 : I
    //   861: ifeq -> 875
    //   864: ldc2_w -1556143369
    //   867: l2i
    //   868: ldc_w 565189902
    //   871: ixor
    //   872: goto -> 883
    //   875: ldc2_w 1632419171
    //   878: l2i
    //   879: ldc_w 1943254263
    //   882: ixor
    //   883: ldc2_w 106532244
    //   886: l2i
    //   887: ldc_w 351369383
    //   890: ixor
    //   891: ixor
    //   892: lookupswitch default -> 4867, -1876440374 -> 875, 3669159 -> 920
    //   920: goto -> 924
    //   923: athrow
    //   924: invokestatic targets : (Lnet/minecraft/util/math/Vec3d;ZZZZZZ)Ljava/util/List;
    //   927: goto -> 931
    //   930: athrow
    //   931: getstatic Perryc.c : I
    //   934: iflt -> 948
    //   937: ldc2_w 1924637551
    //   940: l2i
    //   941: ldc_w -481718241
    //   944: ixor
    //   945: goto -> 956
    //   948: ldc2_w 1585262213
    //   951: l2i
    //   952: ldc_w 1518303343
    //   955: ixor
    //   956: ldc2_w -1858529401
    //   959: l2i
    //   960: ldc_w 735560151
    //   963: ixor
    //   964: ixor
    //   965: lookupswitch default -> 4855, -1091796806 -> 992, 722527520 -> 948
    //   992: goto -> 996
    //   995: athrow
    //   996: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   999: goto -> 1003
    //   1002: athrow
    //   1003: pop
    //   1004: goto -> 2582
    //   1007: ldc2_w 56320611
    //   1010: l2i
    //   1011: ldc_w 56320610
    //   1014: ixor
    //   1015: getstatic Perryc.1 : I
    //   1018: ifeq -> 1032
    //   1021: ldc2_w 1242782529
    //   1024: l2i
    //   1025: ldc_w -2036557753
    //   1028: ixor
    //   1029: goto -> 1040
    //   1032: ldc2_w 521327677
    //   1035: l2i
    //   1036: ldc_w 585955379
    //   1039: ixor
    //   1040: ldc2_w 370256744
    //   1043: l2i
    //   1044: ldc_w 217852527
    //   1047: ixor
    //   1048: ixor
    //   1049: lookupswitch default -> 1076, -698203647 -> 4893, 213216884 -> 1032
    //   1076: istore #9
    //   1078: getstatic Perryc.1 : I
    //   1081: ifeq -> 1095
    //   1084: ldc2_w 387554739
    //   1087: l2i
    //   1088: ldc_w -1428129325
    //   1091: ixor
    //   1092: goto -> 1103
    //   1095: ldc2_w -601736971
    //   1098: l2i
    //   1099: ldc_w -638789317
    //   1102: ixor
    //   1103: ldc2_w -773155469
    //   1106: l2i
    //   1107: ldc_w 1478791725
    //   1110: ixor
    //   1111: ixor
    //   1112: lookupswitch default -> 1140, 424484760 -> 1095, 876077886 -> 4981
    //   1140: aload_1
    //   1141: getstatic Perryc.0 : I
    //   1144: ifle -> 1158
    //   1147: ldc2_w -531910444
    //   1150: l2i
    //   1151: ldc_w -269811930
    //   1154: ixor
    //   1155: goto -> 1166
    //   1158: ldc2_w -795195200
    //   1161: l2i
    //   1162: ldc_w 396743302
    //   1165: ixor
    //   1166: ldc2_w 1032742201
    //   1169: l2i
    //   1170: ldc_w -103155662
    //   1173: ixor
    //   1174: ixor
    //   1175: lookupswitch default -> 1200, -1075176024 -> 1158, -873016583 -> 4973
    //   1200: goto -> 1204
    //   1203: athrow
    //   1204: invokestatic getBlockBlocks : (Lnet/minecraft/entity/Entity;)Ljava/util/List;
    //   1207: goto -> 1211
    //   1210: athrow
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w -2057161360
    //   1220: l2i
    //   1221: ldc_w -1563085319
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 1360760304
    //   1231: l2i
    //   1232: ldc_w 1635357159
    //   1235: ixor
    //   1236: ldc2_w 274026788
    //   1239: l2i
    //   1240: ldc_w 397351378
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 4859, 541935743 -> 1228, 932730081 -> 1272
    //   1272: goto -> 1276
    //   1275: athrow
    //   1276: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1281: goto -> 1285
    //   1284: athrow
    //   1285: getstatic Perryc.0 : I
    //   1288: ifle -> 1302
    //   1291: ldc2_w -676661430
    //   1294: l2i
    //   1295: ldc_w -1967567182
    //   1298: ixor
    //   1299: goto -> 1310
    //   1302: ldc2_w -1067092185
    //   1305: l2i
    //   1306: ldc_w -56438871
    //   1309: ixor
    //   1310: ldc2_w 1438369970
    //   1313: l2i
    //   1314: ldc_w -952566624
    //   1317: ixor
    //   1318: ixor
    //   1319: lookupswitch default -> 1344, -812610070 -> 4921, 2022544214 -> 1302
    //   1344: astore #10
    //   1346: getstatic Perryc.0 : I
    //   1349: ifle -> 1363
    //   1352: ldc2_w 1228360231
    //   1355: l2i
    //   1356: ldc_w 1782448982
    //   1359: ixor
    //   1360: goto -> 1371
    //   1363: ldc2_w -40262288
    //   1366: l2i
    //   1367: ldc_w -727501169
    //   1370: ixor
    //   1371: ldc2_w 1391299788
    //   1374: l2i
    //   1375: ldc_w 2128908835
    //   1378: ixor
    //   1379: ixor
    //   1380: lookupswitch default -> 1408, 251680670 -> 4907, 794315726 -> 1363
    //   1408: aload #10
    //   1410: getstatic Perryc.1 : I
    //   1413: ifeq -> 1427
    //   1416: ldc2_w -1558904251
    //   1419: l2i
    //   1420: ldc_w 554347865
    //   1423: ixor
    //   1424: goto -> 1435
    //   1427: ldc2_w -1017127626
    //   1430: l2i
    //   1431: ldc_w -1958913122
    //   1434: ixor
    //   1435: ldc2_w -934477869
    //   1438: l2i
    //   1439: ldc_w 171195790
    //   1442: ixor
    //   1443: ixor
    //   1444: lookupswitch default -> 4869, -1977989899 -> 1472, 1080520001 -> 1427
    //   1472: goto -> 1476
    //   1475: athrow
    //   1476: invokeinterface hasNext : ()Z
    //   1481: goto -> 1485
    //   1484: athrow
    //   1485: ifeq -> 1499
    //   1488: ldc2_w -2054226363
    //   1491: l2i
    //   1492: ldc_w -136603553
    //   1495: ixor
    //   1496: goto -> 1507
    //   1499: ldc2_w 1031359251
    //   1502: l2i
    //   1503: ldc_w 1328295176
    //   1506: ixor
    //   1507: ldc2_w 1598697551
    //   1510: l2i
    //   1511: ldc_w 570991839
    //   1514: ixor
    //   1515: ixor
    //   1516: tableswitch default -> 1488, 253227658 -> 1540, 253227659 -> 2582
    //   1540: getstatic Perryc.0 : I
    //   1543: ifle -> 1557
    //   1546: ldc2_w 1252262549
    //   1549: l2i
    //   1550: ldc_w -873620924
    //   1553: ixor
    //   1554: goto -> 1565
    //   1557: ldc2_w 624534638
    //   1560: l2i
    //   1561: ldc_w 1700978949
    //   1564: ixor
    //   1565: ldc2_w 2096208019
    //   1568: l2i
    //   1569: ldc_w 230485968
    //   1572: ixor
    //   1573: ixor
    //   1574: lookupswitch default -> 1600, -268111982 -> 4939, 1056373813 -> 1557
    //   1600: aload #10
    //   1602: getstatic Perryc.1 : I
    //   1605: ifeq -> 1619
    //   1608: ldc2_w -409772075
    //   1611: l2i
    //   1612: ldc_w -456759928
    //   1615: ixor
    //   1616: goto -> 1627
    //   1619: ldc2_w 1460948139
    //   1622: l2i
    //   1623: ldc_w -801360006
    //   1626: ixor
    //   1627: ldc2_w -1586252154
    //   1630: l2i
    //   1631: ldc_w 271150755
    //   1634: ixor
    //   1635: ixor
    //   1636: lookupswitch default -> 4951, -1307581832 -> 1619, 913482740 -> 1664
    //   1664: goto -> 1668
    //   1667: athrow
    //   1668: invokeinterface next : ()Ljava/lang/Object;
    //   1673: goto -> 1677
    //   1676: athrow
    //   1677: checkcast net/minecraft/util/math/Vec3d
    //   1680: getstatic Perryc.1 : I
    //   1683: ifeq -> 1697
    //   1686: ldc2_w -2047276964
    //   1689: l2i
    //   1690: ldc_w -1689067618
    //   1693: ixor
    //   1694: goto -> 1705
    //   1697: ldc2_w -1924033656
    //   1700: l2i
    //   1701: ldc_w -1934777930
    //   1704: ixor
    //   1705: ldc2_w 734923748
    //   1708: l2i
    //   1709: ldc_w 2080032720
    //   1712: ixor
    //   1713: ixor
    //   1714: lookupswitch default -> 4885, 1319050230 -> 1697, 1372126730 -> 1740
    //   1740: astore #11
    //   1742: getstatic Perryc.c : I
    //   1745: iflt -> 1759
    //   1748: ldc2_w 1553168424
    //   1751: l2i
    //   1752: ldc_w 58476701
    //   1755: ixor
    //   1756: goto -> 1767
    //   1759: ldc2_w -1930903847
    //   1762: l2i
    //   1763: ldc_w -538656953
    //   1766: ixor
    //   1767: ldc2_w 1459821622
    //   1770: l2i
    //   1771: ldc_w -550120503
    //   1774: ixor
    //   1775: ixor
    //   1776: lookupswitch default -> 4963, -673579190 -> 1759, -616903071 -> 1804
    //   1804: iload #9
    //   1806: getstatic Perryc.1 : I
    //   1809: ifeq -> 1823
    //   1812: ldc2_w -839761356
    //   1815: l2i
    //   1816: ldc_w 975400598
    //   1819: ixor
    //   1820: goto -> 1831
    //   1823: ldc2_w -1072418753
    //   1826: l2i
    //   1827: ldc_w 933772958
    //   1830: ixor
    //   1831: ldc2_w 1506686344
    //   1834: l2i
    //   1835: ldc_w -646145793
    //   1838: ixor
    //   1839: ixor
    //   1840: lookupswitch default -> 4877, 1997448150 -> 1868, 2003010005 -> 1823
    //   1868: iload_0
    //   1869: if_icmple -> 1883
    //   1872: ldc2_w 2065625507
    //   1875: l2i
    //   1876: ldc_w -567379428
    //   1879: ixor
    //   1880: goto -> 1891
    //   1883: ldc2_w -2034980430
    //   1886: l2i
    //   1887: ldc_w 595862030
    //   1890: ixor
    //   1891: ldc2_w 252481295
    //   1894: l2i
    //   1895: ldc_w -1991422063
    //   1898: ixor
    //   1899: ixor
    //   1900: tableswitch default -> 1872, 594627361 -> 1924, 594627362 -> 1927
    //   1924: goto -> 2582
    //   1927: getstatic Perryc.c : I
    //   1930: iflt -> 1944
    //   1933: ldc2_w 1262623077
    //   1936: l2i
    //   1937: ldc_w 164068476
    //   1940: ixor
    //   1941: goto -> 1952
    //   1944: ldc2_w 179749073
    //   1947: l2i
    //   1948: ldc_w 1391686383
    //   1951: ixor
    //   1952: ldc2_w 210474956
    //   1955: l2i
    //   1956: ldc_w 694515187
    //   1959: ixor
    //   1960: ixor
    //   1961: lookupswitch default -> 4949, 1735100198 -> 1944, 2108379137 -> 1988
    //   1988: aload #8
    //   1990: getstatic Perryc.0 : I
    //   1993: ifle -> 2007
    //   1996: ldc2_w 1321336796
    //   1999: l2i
    //   2000: ldc_w 1638512572
    //   2003: ixor
    //   2004: goto -> 2015
    //   2007: ldc2_w 1978493869
    //   2010: l2i
    //   2011: ldc_w -108411858
    //   2014: ixor
    //   2015: ldc2_w 1669310558
    //   2018: l2i
    //   2019: ldc_w 1020086329
    //   2022: ixor
    //   2023: ixor
    //   2024: lookupswitch default -> 4967, -740929564 -> 2052, 1893378055 -> 2007
    //   2052: aload #11
    //   2054: getstatic Perryc.0 : I
    //   2057: ifle -> 2071
    //   2060: ldc2_w -312665662
    //   2063: l2i
    //   2064: ldc_w 738005952
    //   2067: ixor
    //   2068: goto -> 2079
    //   2071: ldc2_w 1435615339
    //   2074: l2i
    //   2075: ldc_w -2023859524
    //   2078: ixor
    //   2079: ldc2_w -682349993
    //   2082: l2i
    //   2083: ldc_w 1218455856
    //   2086: ixor
    //   2087: ixor
    //   2088: lookupswitch default -> 2116, 1451343131 -> 2071, 1498679653 -> 4931
    //   2116: iload_2
    //   2117: getstatic Perryc.1 : I
    //   2120: ifeq -> 2134
    //   2123: ldc2_w -2139058312
    //   2126: l2i
    //   2127: ldc_w -1556703237
    //   2130: ixor
    //   2131: goto -> 2142
    //   2134: ldc2_w -1037019767
    //   2137: l2i
    //   2138: ldc_w 1483841094
    //   2141: ixor
    //   2142: ldc2_w -1994867049
    //   2145: l2i
    //   2146: ldc_w 764134753
    //   2149: ixor
    //   2150: ixor
    //   2151: lookupswitch default -> 4879, -2027592843 -> 2134, 1053995065 -> 2176
    //   2176: iload_3
    //   2177: getstatic Perryc.0 : I
    //   2180: ifle -> 2194
    //   2183: ldc2_w 2027020484
    //   2186: l2i
    //   2187: ldc_w -29918331
    //   2190: ixor
    //   2191: goto -> 2202
    //   2194: ldc2_w 1328613495
    //   2197: l2i
    //   2198: ldc_w 44301402
    //   2201: ixor
    //   2202: ldc2_w 1006740774
    //   2205: l2i
    //   2206: ldc_w -1276828079
    //   2209: ixor
    //   2210: ixor
    //   2211: lookupswitch default -> 2236, 151132214 -> 4897, 1899737330 -> 2194
    //   2236: iload #4
    //   2238: getstatic Perryc.c : I
    //   2241: iflt -> 2255
    //   2244: ldc2_w -211570066
    //   2247: l2i
    //   2248: ldc_w 1971742106
    //   2251: ixor
    //   2252: goto -> 2263
    //   2255: ldc2_w -1699378858
    //   2258: l2i
    //   2259: ldc_w -1518531397
    //   2262: ixor
    //   2263: ldc2_w 244486710
    //   2266: l2i
    //   2267: ldc_w 386065437
    //   2270: ixor
    //   2271: ixor
    //   2272: lookupswitch default -> 2300, -1619680801 -> 4861, 1668855272 -> 2255
    //   2300: iload #5
    //   2302: getstatic Perryc.c : I
    //   2305: iflt -> 2319
    //   2308: ldc2_w -590152238
    //   2311: l2i
    //   2312: ldc_w 1812034963
    //   2315: ixor
    //   2316: goto -> 2327
    //   2319: ldc2_w 368461207
    //   2322: l2i
    //   2323: ldc_w 1618470202
    //   2326: ixor
    //   2327: ldc2_w 167194303
    //   2330: l2i
    //   2331: ldc_w 257809450
    //   2334: ixor
    //   2335: ixor
    //   2336: lookupswitch default -> 4915, -1233552684 -> 2319, 1932218936 -> 2364
    //   2364: iload #6
    //   2366: getstatic Perryc.c : I
    //   2369: iflt -> 2383
    //   2372: ldc2_w -439368351
    //   2375: l2i
    //   2376: ldc_w 1987420138
    //   2379: ixor
    //   2380: goto -> 2391
    //   2383: ldc2_w -994424911
    //   2386: l2i
    //   2387: ldc_w -567468380
    //   2390: ixor
    //   2391: ldc2_w -451498043
    //   2394: l2i
    //   2395: ldc_w 1469515604
    //   2398: ixor
    //   2399: ixor
    //   2400: lookupswitch default -> 4941, -1474891388 -> 2428, 557576730 -> 2383
    //   2428: iload #7
    //   2430: getstatic Perryc.c : I
    //   2433: iflt -> 2447
    //   2436: ldc2_w 1857562131
    //   2439: l2i
    //   2440: ldc_w -472061803
    //   2443: ixor
    //   2444: goto -> 2455
    //   2447: ldc2_w 1703371349
    //   2450: l2i
    //   2451: ldc_w 1795674512
    //   2454: ixor
    //   2455: ldc2_w -585389634
    //   2458: l2i
    //   2459: ldc_w -1268754520
    //   2462: ixor
    //   2463: ixor
    //   2464: lookupswitch default -> 2492, -467718000 -> 4875, 70980641 -> 2447
    //   2492: goto -> 2496
    //   2495: athrow
    //   2496: invokestatic targets : (Lnet/minecraft/util/math/Vec3d;ZZZZZZ)Ljava/util/List;
    //   2499: goto -> 2503
    //   2502: athrow
    //   2503: getstatic Perryc.c : I
    //   2506: iflt -> 2520
    //   2509: ldc2_w -468591478
    //   2512: l2i
    //   2513: ldc_w -1955303380
    //   2516: ixor
    //   2517: goto -> 2528
    //   2520: ldc2_w -541980968
    //   2523: l2i
    //   2524: ldc_w -1295678346
    //   2527: ixor
    //   2528: ldc2_w -1333200290
    //   2531: l2i
    //   2532: ldc_w -343905892
    //   2535: ixor
    //   2536: ixor
    //   2537: lookupswitch default -> 2564, 879574884 -> 4925, 1419437649 -> 2520
    //   2564: goto -> 2568
    //   2567: athrow
    //   2568: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   2571: goto -> 2575
    //   2574: athrow
    //   2575: pop
    //   2576: iinc #9, 1
    //   2579: goto -> 1346
    //   2582: new java/util/ArrayList
    //   2585: dup
    //   2586: getstatic Perryc.0 : I
    //   2589: ifle -> 2603
    //   2592: ldc2_w 1380612286
    //   2595: l2i
    //   2596: ldc_w 537667196
    //   2599: ixor
    //   2600: goto -> 2611
    //   2603: ldc2_w -1292660302
    //   2606: l2i
    //   2607: ldc_w -649460533
    //   2610: ixor
    //   2611: ldc2_w -524637467
    //   2614: l2i
    //   2615: ldc_w 1947271239
    //   2618: ixor
    //   2619: ixor
    //   2620: lookupswitch default -> 4975, -420613024 -> 2603, -15581221 -> 2648
    //   2648: goto -> 2652
    //   2651: athrow
    //   2652: invokespecial <init> : ()V
    //   2655: goto -> 2659
    //   2658: athrow
    //   2659: getstatic Perryc.c : I
    //   2662: iflt -> 2676
    //   2665: ldc2_w 1576336848
    //   2668: l2i
    //   2669: ldc_w 1517525306
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -1669513498
    //   2679: l2i
    //   2680: ldc_w 1390142378
    //   2683: ixor
    //   2684: ldc2_w -1331050105
    //   2687: l2i
    //   2688: ldc_w 2080698131
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 4911, -886422914 -> 2676, 34339800 -> 2720
    //   2720: astore #9
    //   2722: getstatic Perryc.c : I
    //   2725: iflt -> 2739
    //   2728: ldc2_w -470912127
    //   2731: l2i
    //   2732: ldc_w -1439026841
    //   2735: ixor
    //   2736: goto -> 2747
    //   2739: ldc2_w -1971216939
    //   2742: l2i
    //   2743: ldc_w -1264050970
    //   2746: ixor
    //   2747: ldc2_w 34490363
    //   2750: l2i
    //   2751: ldc_w 645368872
    //   2754: ixor
    //   2755: ixor
    //   2756: lookupswitch default -> 4909, 441469664 -> 2784, 1840089397 -> 2739
    //   2784: aload #8
    //   2786: getstatic Perryc.0 : I
    //   2789: ifle -> 2803
    //   2792: ldc2_w -857556525
    //   2795: l2i
    //   2796: ldc_w -1804638772
    //   2799: ixor
    //   2800: goto -> 2811
    //   2803: ldc2_w -377830509
    //   2806: l2i
    //   2807: ldc_w -1958919095
    //   2810: ixor
    //   2811: ldc2_w -1795742799
    //   2814: l2i
    //   2815: ldc_w 1639874535
    //   2818: ixor
    //   2819: ixor
    //   2820: lookupswitch default -> 2848, -1379631031 -> 4865, 102794319 -> 2803
    //   2848: goto -> 2852
    //   2851: athrow
    //   2852: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2855: goto -> 2859
    //   2858: athrow
    //   2859: getstatic Perryc.1 : I
    //   2862: ifeq -> 2876
    //   2865: ldc2_w -856056114
    //   2868: l2i
    //   2869: ldc_w 1761116127
    //   2872: ixor
    //   2873: goto -> 2884
    //   2876: ldc2_w 286120695
    //   2879: l2i
    //   2880: ldc_w -1712602084
    //   2883: ixor
    //   2884: ldc2_w -1207439623
    //   2887: l2i
    //   2888: ldc_w 1724097402
    //   2891: ixor
    //   2892: ixor
    //   2893: lookupswitch default -> 2920, -1277451740 -> 2876, 2059775122 -> 4971
    //   2920: astore #10
    //   2922: getstatic Perryc.c : I
    //   2925: iflt -> 2939
    //   2928: ldc2_w 153872965
    //   2931: l2i
    //   2932: ldc_w -1432273152
    //   2935: ixor
    //   2936: goto -> 2947
    //   2939: ldc2_w -840178318
    //   2942: l2i
    //   2943: ldc_w -2015924077
    //   2946: ixor
    //   2947: ldc2_w 1806110807
    //   2950: l2i
    //   2951: ldc_w -1340330998
    //   2954: ixor
    //   2955: ixor
    //   2956: lookupswitch default -> 4863, -1853380164 -> 2984, 2016536856 -> 2939
    //   2984: aload #10
    //   2986: getstatic Perryc.c : I
    //   2989: iflt -> 3003
    //   2992: ldc2_w 1178815419
    //   2995: l2i
    //   2996: ldc_w -779878861
    //   2999: ixor
    //   3000: goto -> 3011
    //   3003: ldc2_w 407527383
    //   3006: l2i
    //   3007: ldc_w -1841373434
    //   3010: ixor
    //   3011: ldc2_w -306313449
    //   3014: l2i
    //   3015: ldc_w -833299794
    //   3018: ixor
    //   3019: ixor
    //   3020: lookupswitch default -> 3048, -1272289231 -> 4977, 1829913329 -> 3003
    //   3048: goto -> 3052
    //   3051: athrow
    //   3052: invokeinterface hasNext : ()Z
    //   3057: goto -> 3061
    //   3060: athrow
    //   3061: ifeq -> 3075
    //   3064: ldc2_w 1992510592
    //   3067: l2i
    //   3068: ldc_w -2061277643
    //   3071: ixor
    //   3072: goto -> 3083
    //   3075: ldc2_w -1978619166
    //   3078: l2i
    //   3079: ldc_w 2045804630
    //   3082: ixor
    //   3083: ldc2_w 1046123446
    //   3086: l2i
    //   3087: ldc_w 1925804141
    //   3090: ixor
    //   3091: ixor
    //   3092: tableswitch default -> 3064, -1082930834 -> 3116, -1082930833 -> 3991
    //   3116: getstatic Perryc.1 : I
    //   3119: ifeq -> 3133
    //   3122: ldc2_w 1972996875
    //   3125: l2i
    //   3126: ldc_w -608892327
    //   3129: ixor
    //   3130: goto -> 3141
    //   3133: ldc2_w 1712422671
    //   3136: l2i
    //   3137: ldc_w -1321832200
    //   3140: ixor
    //   3141: ldc2_w -592019037
    //   3144: l2i
    //   3145: ldc_w -1829494512
    //   3148: ixor
    //   3149: ixor
    //   3150: lookupswitch default -> 3176, -529653279 -> 4913, 726832016 -> 3133
    //   3176: aload #10
    //   3178: getstatic Perryc.c : I
    //   3181: iflt -> 3195
    //   3184: ldc2_w -1080707028
    //   3187: l2i
    //   3188: ldc_w -1885288625
    //   3191: ixor
    //   3192: goto -> 3203
    //   3195: ldc2_w -773186547
    //   3198: l2i
    //   3199: ldc_w -1617601978
    //   3202: ixor
    //   3203: ldc2_w -526644619
    //   3206: l2i
    //   3207: ldc_w 1069257533
    //   3210: ixor
    //   3211: ixor
    //   3212: lookupswitch default -> 4927, -1856446717 -> 3240, -283974101 -> 3195
    //   3240: goto -> 3244
    //   3243: athrow
    //   3244: invokeinterface next : ()Ljava/lang/Object;
    //   3249: goto -> 3253
    //   3252: athrow
    //   3253: checkcast net/minecraft/util/math/Vec3d
    //   3256: getstatic Perryc.1 : I
    //   3259: ifeq -> 3273
    //   3262: ldc2_w 470162124
    //   3265: l2i
    //   3266: ldc_w -417000175
    //   3269: ixor
    //   3270: goto -> 3281
    //   3273: ldc2_w -1628522328
    //   3276: l2i
    //   3277: ldc_w -1333392980
    //   3280: ixor
    //   3281: ldc2_w 1722590630
    //   3284: l2i
    //   3285: ldc_w -148998351
    //   3288: ixor
    //   3289: ixor
    //   3290: lookupswitch default -> 4895, -1076206701 -> 3316, 1787944266 -> 3273
    //   3316: astore #11
    //   3318: new net/minecraft/util/math/BlockPos
    //   3321: dup
    //   3322: getstatic Perryc.c : I
    //   3325: iflt -> 3339
    //   3328: ldc2_w 526960675
    //   3331: l2i
    //   3332: ldc_w -1302657675
    //   3335: ixor
    //   3336: goto -> 3347
    //   3339: ldc2_w 1495343704
    //   3342: l2i
    //   3343: ldc_w -1482403078
    //   3346: ixor
    //   3347: ldc2_w 1666101420
    //   3350: l2i
    //   3351: ldc_w -1435475352
    //   3354: ixor
    //   3355: ixor
    //   3356: lookupswitch default -> 3384, 1678581650 -> 4899, 1798824432 -> 3339
    //   3384: aload #11
    //   3386: getstatic Perryc.1 : I
    //   3389: ifeq -> 3403
    //   3392: ldc2_w 205713144
    //   3395: l2i
    //   3396: ldc_w -775643508
    //   3399: ixor
    //   3400: goto -> 3411
    //   3403: ldc2_w -1683441470
    //   3406: l2i
    //   3407: ldc_w -37658972
    //   3410: ixor
    //   3411: ldc2_w -1015060324
    //   3414: l2i
    //   3415: ldc_w 205907750
    //   3418: ixor
    //   3419: ixor
    //   3420: lookupswitch default -> 3448, 314376142 -> 4935, 321515562 -> 3403
    //   3448: goto -> 3452
    //   3451: athrow
    //   3452: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   3455: goto -> 3459
    //   3458: athrow
    //   3459: getstatic Perryc.c : I
    //   3462: iflt -> 3476
    //   3465: ldc2_w -1083898798
    //   3468: l2i
    //   3469: ldc_w 1169190493
    //   3472: ixor
    //   3473: goto -> 3484
    //   3476: ldc2_w -645974664
    //   3479: l2i
    //   3480: ldc_w -1517485483
    //   3483: ixor
    //   3484: ldc2_w 923560582
    //   3487: l2i
    //   3488: ldc_w -691773185
    //   3491: ixor
    //   3492: ixor
    //   3493: lookupswitch default -> 4965, -1657127596 -> 3520, 454910070 -> 3476
    //   3520: astore #12
    //   3522: getstatic Perryc.c : I
    //   3525: iflt -> 3539
    //   3528: ldc2_w -222214284
    //   3531: l2i
    //   3532: ldc_w 1542429294
    //   3535: ixor
    //   3536: goto -> 3547
    //   3539: ldc2_w -1171984206
    //   3542: l2i
    //   3543: ldc_w -592839221
    //   3546: ixor
    //   3547: ldc2_w -73411826
    //   3550: l2i
    //   3551: ldc_w -1076084838
    //   3554: ixor
    //   3555: ixor
    //   3556: lookupswitch default -> 3584, -311610994 -> 4953, 937756554 -> 3539
    //   3584: aload #12
    //   3586: getstatic Perryc.0 : I
    //   3589: ifle -> 3603
    //   3592: ldc2_w -1515681272
    //   3595: l2i
    //   3596: ldc_w -296650515
    //   3599: ixor
    //   3600: goto -> 3611
    //   3603: ldc2_w -1014414039
    //   3606: l2i
    //   3607: ldc_w 380883434
    //   3610: ixor
    //   3611: ldc2_w 1248768817
    //   3614: l2i
    //   3615: ldc_w 2033850647
    //   3618: ixor
    //   3619: ixor
    //   3620: lookupswitch default -> 4979, -428982555 -> 3648, 2024626371 -> 3603
    //   3648: iload #7
    //   3650: getstatic Perryc.0 : I
    //   3653: ifle -> 3667
    //   3656: ldc2_w 1496495335
    //   3659: l2i
    //   3660: ldc_w 1074834467
    //   3663: ixor
    //   3664: goto -> 3675
    //   3667: ldc2_w -2108677888
    //   3670: l2i
    //   3671: ldc_w -1135063059
    //   3674: ixor
    //   3675: ldc2_w 1265360771
    //   3678: l2i
    //   3679: ldc_w -1274194378
    //   3682: ixor
    //   3683: ixor
    //   3684: lookupswitch default -> 3712, -431713935 -> 4881, 665544856 -> 3667
    //   3712: goto -> 3716
    //   3715: athrow
    //   3716: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   3719: goto -> 3723
    //   3722: athrow
    //   3723: ldc2_w -1296009272
    //   3726: l2i
    //   3727: ldc_w 1296009271
    //   3730: ixor
    //   3731: if_icmpeq -> 3745
    //   3734: ldc2_w -1835170125
    //   3737: l2i
    //   3738: ldc_w 1526901499
    //   3741: ixor
    //   3742: goto -> 3753
    //   3745: ldc2_w -821766331
    //   3748: l2i
    //   3749: ldc_w 110885644
    //   3752: ixor
    //   3753: ldc2_w -492708796
    //   3756: l2i
    //   3757: ldc_w 1106350780
    //   3760: ixor
    //   3761: ixor
    //   3762: tableswitch default -> 3734, 1791976112 -> 3784, 1791976113 -> 3787
    //   3784: goto -> 2922
    //   3787: getstatic Perryc.1 : I
    //   3790: ifeq -> 3804
    //   3793: ldc2_w -232064128
    //   3796: l2i
    //   3797: ldc_w -1991434799
    //   3800: ixor
    //   3801: goto -> 3812
    //   3804: ldc2_w -1622659166
    //   3807: l2i
    //   3808: ldc_w 196344369
    //   3811: ixor
    //   3812: ldc2_w 866716644
    //   3815: l2i
    //   3816: ldc_w 426307057
    //   3819: ixor
    //   3820: ixor
    //   3821: lookupswitch default -> 3848, 287514180 -> 3804, 1369833540 -> 4983
    //   3848: aload #9
    //   3850: getstatic Perryc.0 : I
    //   3853: ifle -> 3867
    //   3856: ldc2_w -1699488866
    //   3859: l2i
    //   3860: ldc_w 896951173
    //   3863: ixor
    //   3864: goto -> 3875
    //   3867: ldc2_w 1365782045
    //   3870: l2i
    //   3871: ldc_w 253378478
    //   3874: ixor
    //   3875: ldc2_w 1136408657
    //   3878: l2i
    //   3879: ldc_w -812991017
    //   3882: ixor
    //   3883: ixor
    //   3884: lookupswitch default -> 3912, 603143581 -> 4947, 889923939 -> 3867
    //   3912: aload #11
    //   3914: getstatic Perryc.0 : I
    //   3917: ifle -> 3931
    //   3920: ldc2_w -1104085266
    //   3923: l2i
    //   3924: ldc_w -2058616046
    //   3927: ixor
    //   3928: goto -> 3939
    //   3931: ldc2_w -1963079453
    //   3934: l2i
    //   3935: ldc_w 647296008
    //   3938: ixor
    //   3939: ldc2_w -514292971
    //   3942: l2i
    //   3943: ldc_w -1747804263
    //   3946: ixor
    //   3947: ixor
    //   3948: lookupswitch default -> 4871, -622649241 -> 3976, 1308025200 -> 3931
    //   3976: goto -> 3980
    //   3979: athrow
    //   3980: invokevirtual add : (Ljava/lang/Object;)Z
    //   3983: goto -> 3987
    //   3986: athrow
    //   3987: pop
    //   3988: goto -> 2922
    //   3991: getstatic Perryc.0 : I
    //   3994: ifle -> 4008
    //   3997: ldc2_w 744515570
    //   4000: l2i
    //   4001: ldc_w -857945138
    //   4004: ixor
    //   4005: goto -> 4016
    //   4008: ldc2_w 1471996258
    //   4011: l2i
    //   4012: ldc_w 99463691
    //   4015: ixor
    //   4016: ldc2_w 1667050083
    //   4019: l2i
    //   4020: ldc_w -467576574
    //   4023: ixor
    //   4024: ixor
    //   4025: lookupswitch default -> 4052, -1064436371 -> 4008, 1740693341 -> 4987
    //   4052: aload #9
    //   4054: getstatic Perryc.c : I
    //   4057: iflt -> 4071
    //   4060: ldc2_w -2098186030
    //   4063: l2i
    //   4064: ldc_w 791213144
    //   4067: ixor
    //   4068: goto -> 4079
    //   4071: ldc2_w 1161662484
    //   4074: l2i
    //   4075: ldc_w 1646888823
    //   4078: ixor
    //   4079: ldc2_w 1691491652
    //   4082: l2i
    //   4083: ldc_w -865724360
    //   4086: ixor
    //   4087: ixor
    //   4088: lookupswitch default -> 4905, -1885335009 -> 4116, 91015670 -> 4071
    //   4116: goto -> 4120
    //   4119: athrow
    //   4120: invokevirtual iterator : ()Ljava/util/Iterator;
    //   4123: goto -> 4127
    //   4126: athrow
    //   4127: getstatic Perryc.0 : I
    //   4130: ifle -> 4144
    //   4133: ldc2_w 1598078524
    //   4136: l2i
    //   4137: ldc_w -1839174922
    //   4140: ixor
    //   4141: goto -> 4152
    //   4144: ldc2_w -288464604
    //   4147: l2i
    //   4148: ldc_w -1318469330
    //   4151: ixor
    //   4152: ldc2_w -193183945
    //   4155: l2i
    //   4156: ldc_w 21212697
    //   4159: ixor
    //   4160: ixor
    //   4161: lookupswitch default -> 4188, -482016008 -> 4144, 941573604 -> 4945
    //   4188: astore #10
    //   4190: getstatic Perryc.c : I
    //   4193: iflt -> 4207
    //   4196: ldc2_w -917039558
    //   4199: l2i
    //   4200: ldc_w 1784407050
    //   4203: ixor
    //   4204: goto -> 4215
    //   4207: ldc2_w 33341725
    //   4210: l2i
    //   4211: ldc_w 154213422
    //   4214: ixor
    //   4215: ldc2_w 1893067466
    //   4218: l2i
    //   4219: ldc_w -2018482471
    //   4222: ixor
    //   4223: ixor
    //   4224: lookupswitch default -> 4252, -331591576 -> 4207, 1416199715 -> 4923
    //   4252: aload #10
    //   4254: getstatic Perryc.0 : I
    //   4257: ifle -> 4271
    //   4260: ldc2_w 1425851121
    //   4263: l2i
    //   4264: ldc_w 186268430
    //   4267: ixor
    //   4268: goto -> 4279
    //   4271: ldc2_w -806422275
    //   4274: l2i
    //   4275: ldc_w -2137676087
    //   4278: ixor
    //   4279: ldc2_w -1851152666
    //   4282: l2i
    //   4283: ldc_w 1190305897
    //   4286: ixor
    //   4287: ixor
    //   4288: lookupswitch default -> 4889, -2000814224 -> 4271, -1742710597 -> 4316
    //   4316: goto -> 4320
    //   4319: athrow
    //   4320: invokeinterface hasNext : ()Z
    //   4325: goto -> 4329
    //   4328: athrow
    //   4329: ifeq -> 4343
    //   4332: ldc2_w -1243338799
    //   4335: l2i
    //   4336: ldc_w 1690608001
    //   4339: ixor
    //   4340: goto -> 4351
    //   4343: ldc2_w -1672843250
    //   4346: l2i
    //   4347: ldc_w 1298855519
    //   4350: ixor
    //   4351: ldc2_w 1085746167
    //   4354: l2i
    //   4355: ldc_w -92087611
    //   4358: ixor
    //   4359: ixor
    //   4360: tableswitch default -> 4332, 1796568930 -> 4384, 1796568931 -> 4791
    //   4384: getstatic Perryc.1 : I
    //   4387: ifeq -> 4401
    //   4390: ldc2_w 886130833
    //   4393: l2i
    //   4394: ldc_w -781908085
    //   4397: ixor
    //   4398: goto -> 4409
    //   4401: ldc2_w 339349436
    //   4404: l2i
    //   4405: ldc_w 1685720666
    //   4408: ixor
    //   4409: ldc2_w -322544636
    //   4412: l2i
    //   4413: ldc_w 165343863
    //   4416: ixor
    //   4417: ixor
    //   4418: lookupswitch default -> 4444, -1913462333 -> 4401, 11067753 -> 4937
    //   4444: aload #10
    //   4446: getstatic Perryc.c : I
    //   4449: iflt -> 4463
    //   4452: ldc2_w -1112270474
    //   4455: l2i
    //   4456: ldc_w -254330545
    //   4459: ixor
    //   4460: goto -> 4471
    //   4463: ldc2_w -172101540
    //   4466: l2i
    //   4467: ldc_w -1294844165
    //   4470: ixor
    //   4471: ldc2_w 249587741
    //   4474: l2i
    //   4475: ldc_w 1322471001
    //   4478: ixor
    //   4479: ixor
    //   4480: lookupswitch default -> 4508, 223348349 -> 4929, 560015316 -> 4463
    //   4508: goto -> 4512
    //   4511: athrow
    //   4512: invokeinterface next : ()Ljava/lang/Object;
    //   4517: goto -> 4521
    //   4520: athrow
    //   4521: checkcast net/minecraft/util/math/Vec3d
    //   4524: getstatic Perryc.c : I
    //   4527: iflt -> 4541
    //   4530: ldc2_w 722348908
    //   4533: l2i
    //   4534: ldc_w 2048126251
    //   4537: ixor
    //   4538: goto -> 4549
    //   4541: ldc2_w -1294623319
    //   4544: l2i
    //   4545: ldc_w -1723943348
    //   4548: ixor
    //   4549: ldc2_w 1470650067
    //   4552: l2i
    //   4553: ldc_w 1278919271
    //   4556: ixor
    //   4557: ixor
    //   4558: lookupswitch default -> 4943, 813285201 -> 4584, 1250906867 -> 4541
    //   4584: astore #11
    //   4586: getstatic Perryc.c : I
    //   4589: iflt -> 4603
    //   4592: ldc2_w 1391912616
    //   4595: l2i
    //   4596: ldc_w -1984948767
    //   4599: ixor
    //   4600: goto -> 4611
    //   4603: ldc2_w -1418591311
    //   4606: l2i
    //   4607: ldc_w -1519374775
    //   4610: ixor
    //   4611: ldc2_w -509877595
    //   4614: l2i
    //   4615: ldc_w -1497111317
    //   4618: ixor
    //   4619: ixor
    //   4620: lookupswitch default -> 4648, -1675692793 -> 4959, -159264752 -> 4603
    //   4648: aload #8
    //   4650: getstatic Perryc.c : I
    //   4653: iflt -> 4667
    //   4656: ldc2_w -1602135196
    //   4659: l2i
    //   4660: ldc_w 1546908461
    //   4663: ixor
    //   4664: goto -> 4675
    //   4667: ldc2_w 1150179536
    //   4670: l2i
    //   4671: ldc_w 1700059089
    //   4674: ixor
    //   4675: ldc2_w -449986468
    //   4678: l2i
    //   4679: ldc_w -1174812785
    //   4682: ixor
    //   4683: ixor
    //   4684: lookupswitch default -> 4712, -1603883110 -> 4955, -1285208668 -> 4667
    //   4712: aload #11
    //   4714: getstatic Perryc.c : I
    //   4717: iflt -> 4731
    //   4720: ldc2_w -1689377268
    //   4723: l2i
    //   4724: ldc_w 1735048553
    //   4727: ixor
    //   4728: goto -> 4739
    //   4731: ldc2_w -831545023
    //   4734: l2i
    //   4735: ldc_w 1261652749
    //   4738: ixor
    //   4739: ldc2_w 1651442335
    //   4742: l2i
    //   4743: ldc_w 1398891977
    //   4746: ixor
    //   4747: ixor
    //   4748: lookupswitch default -> 4776, -852820941 -> 4919, 1043794848 -> 4731
    //   4776: goto -> 4780
    //   4779: athrow
    //   4780: invokevirtual remove : (Ljava/lang/Object;)Z
    //   4783: goto -> 4787
    //   4786: athrow
    //   4787: pop
    //   4788: goto -> 4190
    //   4791: getstatic Perryc.1 : I
    //   4794: ifeq -> 4808
    //   4797: ldc2_w -1607266047
    //   4800: l2i
    //   4801: ldc_w -1544164045
    //   4804: ixor
    //   4805: goto -> 4816
    //   4808: ldc2_w -980162596
    //   4811: l2i
    //   4812: ldc_w 292984795
    //   4815: ixor
    //   4816: ldc2_w -888903299
    //   4819: l2i
    //   4820: ldc_w -1315776472
    //   4823: ixor
    //   4824: ixor
    //   4825: lookupswitch default -> 4873, -1368145582 -> 4852, 2035305831 -> 4808
    //   4852: aload #8
    //   4854: areturn
    //   4855: aconst_null
    //   4856: athrow
    //   4857: aconst_null
    //   4858: athrow
    //   4859: aconst_null
    //   4860: athrow
    //   4861: aconst_null
    //   4862: athrow
    //   4863: aconst_null
    //   4864: athrow
    //   4865: aconst_null
    //   4866: athrow
    //   4867: aconst_null
    //   4868: athrow
    //   4869: aconst_null
    //   4870: athrow
    //   4871: aconst_null
    //   4872: athrow
    //   4873: aconst_null
    //   4874: athrow
    //   4875: aconst_null
    //   4876: athrow
    //   4877: aconst_null
    //   4878: athrow
    //   4879: aconst_null
    //   4880: athrow
    //   4881: aconst_null
    //   4882: athrow
    //   4883: aconst_null
    //   4884: athrow
    //   4885: aconst_null
    //   4886: athrow
    //   4887: aconst_null
    //   4888: athrow
    //   4889: aconst_null
    //   4890: athrow
    //   4891: aconst_null
    //   4892: athrow
    //   4893: aconst_null
    //   4894: athrow
    //   4895: aconst_null
    //   4896: athrow
    //   4897: aconst_null
    //   4898: athrow
    //   4899: aconst_null
    //   4900: athrow
    //   4901: aconst_null
    //   4902: athrow
    //   4903: aconst_null
    //   4904: athrow
    //   4905: aconst_null
    //   4906: athrow
    //   4907: aconst_null
    //   4908: athrow
    //   4909: aconst_null
    //   4910: athrow
    //   4911: aconst_null
    //   4912: athrow
    //   4913: aconst_null
    //   4914: athrow
    //   4915: aconst_null
    //   4916: athrow
    //   4917: aconst_null
    //   4918: athrow
    //   4919: aconst_null
    //   4920: athrow
    //   4921: aconst_null
    //   4922: athrow
    //   4923: aconst_null
    //   4924: athrow
    //   4925: aconst_null
    //   4926: athrow
    //   4927: aconst_null
    //   4928: athrow
    //   4929: aconst_null
    //   4930: athrow
    //   4931: aconst_null
    //   4932: athrow
    //   4933: aconst_null
    //   4934: athrow
    //   4935: aconst_null
    //   4936: athrow
    //   4937: aconst_null
    //   4938: athrow
    //   4939: aconst_null
    //   4940: athrow
    //   4941: aconst_null
    //   4942: athrow
    //   4943: aconst_null
    //   4944: athrow
    //   4945: aconst_null
    //   4946: athrow
    //   4947: aconst_null
    //   4948: athrow
    //   4949: aconst_null
    //   4950: athrow
    //   4951: aconst_null
    //   4952: athrow
    //   4953: aconst_null
    //   4954: athrow
    //   4955: aconst_null
    //   4956: athrow
    //   4957: aconst_null
    //   4958: athrow
    //   4959: aconst_null
    //   4960: athrow
    //   4961: aconst_null
    //   4962: athrow
    //   4963: aconst_null
    //   4964: athrow
    //   4965: aconst_null
    //   4966: athrow
    //   4967: aconst_null
    //   4968: athrow
    //   4969: aconst_null
    //   4970: athrow
    //   4971: aconst_null
    //   4972: athrow
    //   4973: aconst_null
    //   4974: athrow
    //   4975: aconst_null
    //   4976: athrow
    //   4977: aconst_null
    //   4978: athrow
    //   4979: aconst_null
    //   4980: athrow
    //   4981: aconst_null
    //   4982: athrow
    //   4983: aconst_null
    //   4984: athrow
    //   4985: aconst_null
    //   4986: athrow
    //   4987: aconst_null
    //   4988: athrow
    //   4989: pop
    //   4990: goto -> 24
    //   4993: pop
    //   4994: aconst_null
    //   4995: goto -> 4989
    //   4998: dup
    //   4999: ifnull -> 4989
    //   5002: checkcast java/lang/Throwable
    //   5005: athrow
    //   5006: dup
    //   5007: ifnull -> 4993
    //   5010: checkcast java/lang/Throwable
    //   5013: athrow
    //   5014: aconst_null
    //   5015: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1742	837	11	vec3d	Lnet/minecraft/util/math/Vec3d;
    //   1078	1504	9	extend	I
    //   3522	466	12	pos	Lnet/minecraft/util/math/BlockPos;
    //   3318	670	11	vec3d	Lnet/minecraft/util/math/Vec3d;
    //   4586	202	11	vec3d	Lnet/minecraft/util/math/Vec3d;
    //   24	4831	0	extension	I
    //   24	4831	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	4831	2	antiScaffold	Z
    //   24	4831	3	antiStep	Z
    //   24	4831	4	legs	Z
    //   24	4831	5	platform	Z
    //   24	4831	6	antiDrop	Z
    //   24	4831	7	raytrace	Z
    //   162	4693	8	placeTargets	Ljava/util/ArrayList;
    //   2722	2133	9	removeList	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   162	4693	8	placeTargets	Ljava/util/ArrayList<Lnet/minecraft/util/math/Vec3d;>;
    //   2722	2133	9	removeList	Ljava/util/ArrayList<Lnet/minecraft/util/math/Vec3d;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	4998	java/lang/IndexOutOfBoundsException
    //   91	98	98	finally
    //   92	98	91	finally
    //   92	98	3	finally
    //   92	98	98	finally
    //   92	98	3	java/lang/AssertionError
    //   475	482	482	finally
    //   475	482	475	java/util/NoSuchElementException
    //   475	482	482	java/lang/NullPointerException
    //   475	482	482	finally
    //   476	482	475	finally
    //   923	930	930	finally
    //   923	930	923	finally
    //   923	930	3	finally
    //   924	930	3	java/util/ConcurrentModificationException
    //   924	930	3	finally
    //   995	1002	1002	finally
    //   995	1002	995	finally
    //   995	1002	1002	finally
    //   995	1002	995	finally
    //   996	1002	995	java/lang/RuntimeException
    //   1203	1210	1210	finally
    //   1203	1210	1203	java/lang/AssertionError
    //   1203	1210	3	finally
    //   1203	1210	1203	finally
    //   1204	1210	1203	java/lang/NullPointerException
    //   1275	1284	1284	finally
    //   1275	1284	1275	java/lang/RuntimeException
    //   1275	1284	3	java/lang/IndexOutOfBoundsException
    //   1276	1284	1284	java/lang/RuntimeException
    //   1276	1284	1275	finally
    //   1475	1484	1484	finally
    //   1475	1484	1484	java/lang/ArithmeticException
    //   1475	1484	3	java/lang/RuntimeException
    //   1476	1484	1475	finally
    //   1476	1484	1484	finally
    //   1668	1676	1676	finally
    //   1668	1676	1676	finally
    //   1668	1676	3	finally
    //   1668	1676	1676	java/lang/UnsupportedOperationException
    //   1668	1676	3	java/util/NoSuchElementException
    //   2495	2502	2502	finally
    //   2495	2502	2502	finally
    //   2496	2502	2502	finally
    //   2496	2502	3	finally
    //   2496	2502	2495	java/lang/ArrayIndexOutOfBoundsException
    //   2567	2574	2574	finally
    //   2567	2574	2567	java/util/ConcurrentModificationException
    //   2567	2574	2567	java/lang/NegativeArraySizeException
    //   2568	2574	2567	finally
    //   2568	2574	3	java/util/NoSuchElementException
    //   2651	2658	2658	finally
    //   2651	2658	2651	finally
    //   2652	2658	3	finally
    //   2652	2658	2651	java/util/NoSuchElementException
    //   2652	2658	3	finally
    //   2851	2858	2858	finally
    //   2851	2858	2851	finally
    //   2852	2858	2858	java/lang/RuntimeException
    //   2852	2858	2858	java/util/NoSuchElementException
    //   2852	2858	3	java/lang/ArithmeticException
    //   3051	3060	3060	finally
    //   3051	3060	3060	java/lang/ArithmeticException
    //   3051	3060	3051	finally
    //   3051	3060	3051	finally
    //   3052	3060	3051	java/lang/IndexOutOfBoundsException
    //   3243	3252	3252	finally
    //   3243	3252	3252	java/lang/StringIndexOutOfBoundsException
    //   3243	3252	3	java/lang/NumberFormatException
    //   3243	3252	3243	finally
    //   3244	3252	3	java/lang/IllegalArgumentException
    //   3451	3458	3458	finally
    //   3451	3458	3458	java/lang/ArithmeticException
    //   3451	3458	3451	java/lang/StringIndexOutOfBoundsException
    //   3452	3458	3458	finally
    //   3452	3458	3458	java/lang/NullPointerException
    //   3715	3722	3722	finally
    //   3715	3722	3715	java/lang/AssertionError
    //   3715	3722	3	java/lang/NullPointerException
    //   3716	3722	3	java/lang/NegativeArraySizeException
    //   3716	3722	3722	finally
    //   3979	3986	3986	finally
    //   3979	3986	3979	java/lang/AssertionError
    //   3980	3986	3986	java/lang/NullPointerException
    //   3980	3986	3979	finally
    //   3980	3986	3986	finally
    //   4119	4126	4126	finally
    //   4120	4126	3	java/lang/StringIndexOutOfBoundsException
    //   4120	4126	3	java/lang/ClassCastException
    //   4120	4126	4119	finally
    //   4120	4126	3	finally
    //   4319	4328	4328	finally
    //   4320	4328	4328	finally
    //   4320	4328	4328	finally
    //   4320	4328	4319	java/lang/ClassCastException
    //   4320	4328	4319	finally
    //   4511	4520	4520	finally
    //   4511	4520	4511	java/lang/StringIndexOutOfBoundsException
    //   4511	4520	4520	java/lang/NegativeArraySizeException
    //   4511	4520	4511	finally
    //   4512	4520	3	java/lang/NullPointerException
    //   4779	4786	4786	finally
    //   4779	4786	4779	finally
    //   4780	4786	3	finally
    //   4780	4786	4779	java/util/ConcurrentModificationException
    //   4780	4786	4786	finally
    //   4998	5006	4998	java/lang/IndexOutOfBoundsException
    //   5014	5016	3	java/lang/UnsupportedOperationException
  }
  
  public static boolean isFriendlyMob(Entity paramEntity) {
    return Perry1.5Y(null, (int)-1086672916L ^ 0x9FF1EA6D, paramEntity);
  }
  
  public static List targets(Vec3d vec3d, boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop, boolean raytrace) {
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
  
  public static boolean isFakePlayer(EntityPlayer paramEntityPlayer) {
    return Perry1.0d(null, (int)928161185L ^ 0x599EDB28, paramEntityPlayer);
  }
  
  public static BlockPos getPlayerPos(EntityPlayer player) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 733
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 725
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 717
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -532348047
    //   37: l2i
    //   38: ldc_w -1132058073
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 76874819
    //   48: l2i
    //   49: ldc_w -728333263
    //   52: ixor
    //   53: ldc2_w -1773979461
    //   56: l2i
    //   57: ldc_w 1639128036
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 700, -1422718455 -> 45, 670278445 -> 88
    //   88: aload_0
    //   89: getstatic Perryc.0 : I
    //   92: ifle -> 106
    //   95: ldc2_w -910128564
    //   98: l2i
    //   99: ldc_w 60060868
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 1642632813
    //   109: l2i
    //   110: ldc_w 1094595769
    //   113: ixor
    //   114: ldc2_w 591313264
    //   117: l2i
    //   118: ldc_w 1895462582
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 702, -1718603442 -> 106, 1930587410 -> 148
    //   148: getfield field_70165_t : D
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w -604664462
    //   160: l2i
    //   161: ldc_w -1949825562
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 213301302
    //   171: l2i
    //   172: ldc_w -26214941
    //   175: ixor
    //   176: ldc2_w -561192571
    //   179: l2i
    //   180: ldc_w -555119396
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, -345735604 -> 168, 1348003277 -> 694
    //   212: goto -> 216
    //   215: athrow
    //   216: invokestatic floor : (D)D
    //   219: goto -> 223
    //   222: athrow
    //   223: getstatic Perryc.0 : I
    //   226: ifle -> 240
    //   229: ldc2_w 316155698
    //   232: l2i
    //   233: ldc_w 1384989934
    //   236: ixor
    //   237: goto -> 248
    //   240: ldc2_w 1634432186
    //   243: l2i
    //   244: ldc_w -1126629770
    //   247: ixor
    //   248: ldc2_w -93068412
    //   251: l2i
    //   252: ldc_w -233211535
    //   255: ixor
    //   256: ixor
    //   257: lookupswitch default -> 284, -229154658 -> 240, 1212152105 -> 698
    //   284: aload_0
    //   285: getstatic Perryc.1 : I
    //   288: ifeq -> 302
    //   291: ldc2_w -2034598849
    //   294: l2i
    //   295: ldc_w -847002527
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w 675654346
    //   305: l2i
    //   306: ldc_w -894731863
    //   309: ixor
    //   310: ldc2_w 800826460
    //   313: l2i
    //   314: ldc_w 1150404285
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 344, 538172095 -> 692, 646823441 -> 302
    //   344: getfield field_70163_u : D
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w 1566929995
    //   356: l2i
    //   357: ldc_w 518118758
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -967513578
    //   367: l2i
    //   368: ldc_w -1125341025
    //   371: ixor
    //   372: ldc2_w 383565788
    //   375: l2i
    //   376: ldc_w -156806933
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 704, -1698452034 -> 408, -1543551462 -> 364
    //   408: goto -> 412
    //   411: athrow
    //   412: invokestatic floor : (D)D
    //   415: goto -> 419
    //   418: athrow
    //   419: getstatic Perryc.1 : I
    //   422: ifeq -> 436
    //   425: ldc2_w -1340539421
    //   428: l2i
    //   429: ldc_w 1014148683
    //   432: ixor
    //   433: goto -> 444
    //   436: ldc2_w -379163974
    //   439: l2i
    //   440: ldc_w -1519125391
    //   443: ixor
    //   444: ldc2_w 91474709
    //   447: l2i
    //   448: ldc_w 1851359550
    //   451: ixor
    //   452: ixor
    //   453: lookupswitch default -> 696, -415229565 -> 436, 658496736 -> 480
    //   480: aload_0
    //   481: getstatic Perryc.c : I
    //   484: iflt -> 498
    //   487: ldc2_w -121614292
    //   490: l2i
    //   491: ldc_w 753837782
    //   494: ixor
    //   495: goto -> 506
    //   498: ldc2_w 1652983042
    //   501: l2i
    //   502: ldc_w 1490985891
    //   505: ixor
    //   506: ldc2_w 1531956977
    //   509: l2i
    //   510: ldc_w -724037967
    //   513: ixor
    //   514: ixor
    //   515: lookupswitch default -> 688, -1244666143 -> 540, 1538864826 -> 498
    //   540: getfield field_70161_v : D
    //   543: getstatic Perryc.c : I
    //   546: iflt -> 560
    //   549: ldc2_w 1594875601
    //   552: l2i
    //   553: ldc_w -881288660
    //   556: ixor
    //   557: goto -> 568
    //   560: ldc2_w 593124152
    //   563: l2i
    //   564: ldc_w -1772191625
    //   567: ixor
    //   568: ldc2_w -868487680
    //   571: l2i
    //   572: ldc_w -432591282
    //   575: ixor
    //   576: ixor
    //   577: lookupswitch default -> 604, -1099201357 -> 706, 1736772940 -> 560
    //   604: goto -> 608
    //   607: athrow
    //   608: invokestatic floor : (D)D
    //   611: goto -> 615
    //   614: athrow
    //   615: getstatic Perryc.0 : I
    //   618: ifle -> 632
    //   621: ldc2_w -833428267
    //   624: l2i
    //   625: ldc_w -165455030
    //   628: ixor
    //   629: goto -> 640
    //   632: ldc2_w -1260469171
    //   635: l2i
    //   636: ldc_w 2109586427
    //   639: ixor
    //   640: ldc2_w -1408858489
    //   643: l2i
    //   644: ldc_w 984919523
    //   647: ixor
    //   648: ixor
    //   649: lookupswitch default -> 676, -1362914053 -> 690, 982561615 -> 632
    //   676: goto -> 680
    //   679: athrow
    //   680: invokespecial <init> : (DDD)V
    //   683: goto -> 687
    //   686: athrow
    //   687: areturn
    //   688: aconst_null
    //   689: athrow
    //   690: aconst_null
    //   691: athrow
    //   692: aconst_null
    //   693: athrow
    //   694: aconst_null
    //   695: athrow
    //   696: aconst_null
    //   697: athrow
    //   698: aconst_null
    //   699: athrow
    //   700: aconst_null
    //   701: athrow
    //   702: aconst_null
    //   703: athrow
    //   704: aconst_null
    //   705: athrow
    //   706: aconst_null
    //   707: athrow
    //   708: pop
    //   709: goto -> 24
    //   712: pop
    //   713: aconst_null
    //   714: goto -> 708
    //   717: dup
    //   718: ifnull -> 708
    //   721: checkcast java/lang/Throwable
    //   724: athrow
    //   725: dup
    //   726: ifnull -> 712
    //   729: checkcast java/lang/Throwable
    //   732: athrow
    //   733: aconst_null
    //   734: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	664	0	player	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   8	20	717	java/lang/IllegalStateException
    //   215	222	222	finally
    //   215	222	3	finally
    //   215	222	222	finally
    //   216	222	215	java/lang/IllegalArgumentException
    //   216	222	222	finally
    //   412	418	418	finally
    //   412	418	3	finally
    //   412	418	3	finally
    //   412	418	3	finally
    //   412	418	3	finally
    //   608	614	614	finally
    //   608	614	3	java/lang/ClassCastException
    //   608	614	3	java/lang/NullPointerException
    //   608	614	614	java/lang/EnumConstantNotPresentException
    //   608	614	3	java/lang/ClassCastException
    //   679	686	686	finally
    //   679	686	679	java/lang/IllegalStateException
    //   680	686	686	java/lang/IllegalStateException
    //   680	686	3	finally
    //   680	686	679	java/lang/ArithmeticException
    //   717	725	717	java/lang/NullPointerException
    //   733	735	3	java/lang/RuntimeException
  }
  
  public static boolean is32k(ItemStack paramItemStack) {
    return Perry1.0z(null, (int)308887348L ^ 0x24794D96, paramItemStack);
  }
  
  public static Vec3d getInterpolatedRenderPos(Vec3d vec) {
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
  
  public static boolean isInHole(Entity entity) {
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
  
  public static void mutliplyEntitySpeed(Entity entity, double multiplier) {
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
  
  public static double[] forward(double paramDouble) {
    return Perry1.0G(null, (int)1482103087L ^ 0xE5AD535, paramDouble);
  }
  
  public static boolean rayTraceHitCheck(Entity entity, boolean shouldCheck) {
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
  
  public static boolean isMoving() {
    return Perry1.4u(null, (int)-84919974L ^ 0xF4ED5DC7);
  }
  
  public static List getNearbyPlayers(double range) {
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
    //   0: ldc2_w 1173273559
    //   3: l2i
    //   4: ldc_w 1173273558
    //   7: ixor
    //   8: anewarray net/minecraft/util/math/Vec3d
    //   11: dup
    //   12: ldc2_w 2028951711
    //   15: l2i
    //   16: ldc_w 2028951711
    //   19: ixor
    //   20: new net/minecraft/util/math/Vec3d
    //   23: dup
    //   24: ldc2_w 1.710860468203497E308
    //   27: invokestatic doubleToLongBits : (D)J
    //   30: ldc2_w 9218433369019573285
    //   33: lxor
    //   34: invokestatic longBitsToDouble : (J)D
    //   37: ldc2_w -0.3269571151745286
    //   40: invokestatic doubleToLongBits : (D)J
    //   43: ldc2_w 9211247574113558381
    //   46: lxor
    //   47: invokestatic longBitsToDouble : (J)D
    //   50: ldc2_w 6.072551192694946E307
    //   53: invokestatic doubleToLongBits : (D)J
    //   56: ldc2_w 9211442845827760805
    //   59: lxor
    //   60: invokestatic longBitsToDouble : (J)D
    //   63: getstatic Perryc.c : I
    //   66: iflt -> 80
    //   69: ldc2_w 507503801
    //   72: l2i
    //   73: ldc_w -1502480624
    //   76: ixor
    //   77: goto -> 88
    //   80: ldc2_w -458347467
    //   83: l2i
    //   84: ldc_w -1610155788
    //   87: ixor
    //   88: ldc2_w -1252687137
    //   91: l2i
    //   92: ldc_w 254569734
    //   95: ixor
    //   96: ixor
    //   97: lookupswitch default -> 4280, -19842280 -> 124, 37223536 -> 80
    //   124: invokespecial <init> : (DDD)V
    //   127: aastore
    //   128: getstatic Perryc.0 : I
    //   131: ifle -> 145
    //   134: ldc2_w -858294716
    //   137: l2i
    //   138: ldc_w 1821798263
    //   141: ixor
    //   142: goto -> 153
    //   145: ldc2_w -1163694777
    //   148: l2i
    //   149: ldc_w 1372423447
    //   152: ixor
    //   153: ldc2_w 244583385
    //   156: l2i
    //   157: ldc_w 95264673
    //   160: ixor
    //   161: ixor
    //   162: lookupswitch default -> 188, -1418162869 -> 4244, -1049812678 -> 145
    //   188: putstatic bigname/zprestige/webhack/util/EntityUtil.antiDropOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   191: ldc2_w -1347688257
    //   194: l2i
    //   195: ldc_w -1347688262
    //   198: ixor
    //   199: anewarray net/minecraft/util/math/Vec3d
    //   202: dup
    //   203: ldc2_w 1720329635
    //   206: l2i
    //   207: ldc_w 1720329635
    //   210: ixor
    //   211: new net/minecraft/util/math/Vec3d
    //   214: dup
    //   215: ldc2_w 8.427976222233234E306
    //   218: invokestatic doubleToLongBits : (D)J
    //   221: ldc2_w 9198603272776585455
    //   224: lxor
    //   225: invokestatic longBitsToDouble : (J)D
    //   228: ldc2_w -6.588775371300999
    //   231: invokestatic doubleToLongBits : (D)J
    //   234: ldc2_w 9217279539549419090
    //   237: lxor
    //   238: invokestatic longBitsToDouble : (J)D
    //   241: ldc2_w 1.7323561590537577E308
    //   244: invokestatic doubleToLongBits : (D)J
    //   247: ldc2_w 9218541071478269852
    //   250: lxor
    //   251: invokestatic longBitsToDouble : (J)D
    //   254: getstatic Perryc.c : I
    //   257: iflt -> 271
    //   260: ldc2_w -901742531
    //   263: l2i
    //   264: ldc_w 107837860
    //   267: ixor
    //   268: goto -> 279
    //   271: ldc2_w -785109725
    //   274: l2i
    //   275: ldc_w -1378175158
    //   278: ixor
    //   279: ldc2_w -1045396236
    //   282: l2i
    //   283: ldc_w -488345382
    //   286: ixor
    //   287: ixor
    //   288: lookupswitch default -> 316, -277279305 -> 4276, 1006482276 -> 271
    //   316: invokespecial <init> : (DDD)V
    //   319: aastore
    //   320: dup
    //   321: ldc2_w -1919476002
    //   324: l2i
    //   325: ldc_w -1919476001
    //   328: ixor
    //   329: new net/minecraft/util/math/Vec3d
    //   332: dup
    //   333: ldc2_w 2.5610030438634625E307
    //   336: invokestatic doubleToLongBits : (D)J
    //   339: ldc2_w 9205986719988321151
    //   342: lxor
    //   343: invokestatic longBitsToDouble : (J)D
    //   346: ldc2_w -6.748591179369361
    //   349: invokestatic doubleToLongBits : (D)J
    //   352: ldc2_w 9217459476152835238
    //   355: lxor
    //   356: invokestatic longBitsToDouble : (J)D
    //   359: ldc2_w -24.231409296423063
    //   362: invokestatic doubleToLongBits : (D)J
    //   365: ldc2_w 9207674574085300383
    //   368: lxor
    //   369: invokestatic longBitsToDouble : (J)D
    //   372: getstatic Perryc.1 : I
    //   375: ifeq -> 389
    //   378: ldc2_w 729656420
    //   381: l2i
    //   382: ldc_w 1612151445
    //   385: ixor
    //   386: goto -> 397
    //   389: ldc2_w 868280397
    //   392: l2i
    //   393: ldc_w 955569621
    //   396: ixor
    //   397: ldc2_w 1088178669
    //   400: l2i
    //   401: ldc_w 980135956
    //   404: ixor
    //   405: ixor
    //   406: lookupswitch default -> 4260, 836579080 -> 389, 1904460897 -> 432
    //   432: invokespecial <init> : (DDD)V
    //   435: aastore
    //   436: dup
    //   437: ldc2_w 392609267
    //   440: l2i
    //   441: ldc_w 392609265
    //   444: ixor
    //   445: new net/minecraft/util/math/Vec3d
    //   448: dup
    //   449: ldc2_w 8.890297282267477E307
    //   452: invokestatic doubleToLongBits : (D)J
    //   455: ldc2_w 9214266464607390943
    //   458: lxor
    //   459: invokestatic longBitsToDouble : (J)D
    //   462: ldc2_w -6.812945582664539
    //   465: invokestatic doubleToLongBits : (D)J
    //   468: ldc2_w 9217531932769510191
    //   471: lxor
    //   472: invokestatic longBitsToDouble : (J)D
    //   475: ldc2_w 8.730108332526187
    //   478: invokestatic doubleToLongBits : (D)J
    //   481: ldc2_w 9210272252424452449
    //   484: lxor
    //   485: invokestatic longBitsToDouble : (J)D
    //   488: getstatic Perryc.c : I
    //   491: iflt -> 505
    //   494: ldc2_w 607928568
    //   497: l2i
    //   498: ldc_w -657266364
    //   501: ixor
    //   502: goto -> 513
    //   505: ldc2_w 1909272570
    //   508: l2i
    //   509: ldc_w 917512888
    //   512: ixor
    //   513: ldc2_w 430875408
    //   516: l2i
    //   517: ldc_w -537771079
    //   520: ixor
    //   521: ixor
    //   522: lookupswitch default -> 548, 65857765 -> 505, 984762645 -> 4282
    //   548: invokespecial <init> : (DDD)V
    //   551: aastore
    //   552: dup
    //   553: ldc2_w -698362906
    //   556: l2i
    //   557: ldc_w -698362907
    //   560: ixor
    //   561: new net/minecraft/util/math/Vec3d
    //   564: dup
    //   565: ldc2_w -6.457804653843757
    //   568: invokestatic doubleToLongBits : (D)J
    //   571: ldc2_w 9217132079630834870
    //   574: lxor
    //   575: invokestatic longBitsToDouble : (J)D
    //   578: ldc2_w -4.4126745705918795
    //   581: invokestatic doubleToLongBits : (D)J
    //   584: ldc2_w 9214829467860620533
    //   587: lxor
    //   588: invokestatic longBitsToDouble : (J)D
    //   591: ldc2_w 6.217998732034571E305
    //   594: invokestatic doubleToLongBits : (D)J
    //   597: ldc2_w 9181808067399344895
    //   600: lxor
    //   601: invokestatic longBitsToDouble : (J)D
    //   604: getstatic Perryc.1 : I
    //   607: ifeq -> 621
    //   610: ldc2_w 1541418646
    //   613: l2i
    //   614: ldc_w -2132415794
    //   617: ixor
    //   618: goto -> 629
    //   621: ldc2_w 482228523
    //   624: l2i
    //   625: ldc_w -2043901999
    //   628: ixor
    //   629: ldc2_w -1925268914
    //   632: l2i
    //   633: ldc_w 2015436267
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 664, 773481469 -> 4312, 2013961492 -> 621
    //   664: invokespecial <init> : (DDD)V
    //   667: aastore
    //   668: dup
    //   669: ldc2_w -2131019053
    //   672: l2i
    //   673: ldc_w -2131019049
    //   676: ixor
    //   677: new net/minecraft/util/math/Vec3d
    //   680: dup
    //   681: ldc2_w 49.9094062565075
    //   684: invokestatic doubleToLongBits : (D)J
    //   687: ldc2_w 9203374563572399391
    //   690: lxor
    //   691: invokestatic longBitsToDouble : (J)D
    //   694: ldc2_w -7.876098194208357
    //   697: invokestatic doubleToLongBits : (D)J
    //   700: ldc2_w 9218728936195806868
    //   703: lxor
    //   704: invokestatic longBitsToDouble : (J)D
    //   707: ldc2_w 1.6259507641803196E308
    //   710: invokestatic doubleToLongBits : (D)J
    //   713: ldc2_w 9218007935663920838
    //   716: lxor
    //   717: invokestatic longBitsToDouble : (J)D
    //   720: getstatic Perryc.c : I
    //   723: iflt -> 737
    //   726: ldc2_w 849160526
    //   729: l2i
    //   730: ldc_w -1278861946
    //   733: ixor
    //   734: goto -> 745
    //   737: ldc2_w 510010838
    //   740: l2i
    //   741: ldc_w 334575981
    //   744: ixor
    //   745: ldc2_w -235597515
    //   748: l2i
    //   749: ldc_w 846864791
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 4256, -837276647 -> 780, 1121191018 -> 737
    //   780: invokespecial <init> : (DDD)V
    //   783: aastore
    //   784: getstatic Perryc.c : I
    //   787: iflt -> 801
    //   790: ldc2_w -1779533550
    //   793: l2i
    //   794: ldc_w 1145360162
    //   797: ixor
    //   798: goto -> 809
    //   801: ldc2_w -658876045
    //   804: l2i
    //   805: ldc_w -184646620
    //   808: ixor
    //   809: ldc2_w -1762886007
    //   812: l2i
    //   813: ldc_w 588939786
    //   816: ixor
    //   817: ixor
    //   818: lookupswitch default -> 4286, -1716379180 -> 844, 1683770035 -> 801
    //   844: putstatic bigname/zprestige/webhack/util/EntityUtil.platformOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   847: ldc2_w 2118599221
    //   850: l2i
    //   851: ldc_w 2118599217
    //   854: ixor
    //   855: anewarray net/minecraft/util/math/Vec3d
    //   858: dup
    //   859: ldc2_w -1826304771
    //   862: l2i
    //   863: ldc_w -1826304771
    //   866: ixor
    //   867: new net/minecraft/util/math/Vec3d
    //   870: dup
    //   871: ldc2_w -21.243211777576914
    //   874: invokestatic doubleToLongBits : (D)J
    //   877: ldc2_w 9206833471258276323
    //   880: lxor
    //   881: invokestatic longBitsToDouble : (J)D
    //   884: ldc2_w 1.0689399447953972E308
    //   887: invokestatic doubleToLongBits : (D)J
    //   890: ldc2_w 9215217077012936003
    //   893: lxor
    //   894: invokestatic longBitsToDouble : (J)D
    //   897: ldc2_w 2.611621972983396E307
    //   900: invokestatic doubleToLongBits : (D)J
    //   903: ldc2_w 9206088168844480859
    //   906: lxor
    //   907: invokestatic longBitsToDouble : (J)D
    //   910: getstatic Perryc.1 : I
    //   913: ifeq -> 927
    //   916: ldc2_w -160161891
    //   919: l2i
    //   920: ldc_w -427604864
    //   923: ixor
    //   924: goto -> 935
    //   927: ldc2_w -898649887
    //   930: l2i
    //   931: ldc_w -1950255052
    //   934: ixor
    //   935: ldc2_w -143268667
    //   938: l2i
    //   939: ldc_w -273567020
    //   942: ixor
    //   943: ixor
    //   944: lookupswitch default -> 4266, 137563404 -> 927, 1500159684 -> 972
    //   972: invokespecial <init> : (DDD)V
    //   975: aastore
    //   976: dup
    //   977: ldc2_w 825238819
    //   980: l2i
    //   981: ldc_w 825238818
    //   984: ixor
    //   985: new net/minecraft/util/math/Vec3d
    //   988: dup
    //   989: ldc2_w 5.4660675133506675
    //   992: invokestatic doubleToLongBits : (D)J
    //   995: ldc2_w 9216015482876741330
    //   998: lxor
    //   999: invokestatic longBitsToDouble : (J)D
    //   1002: ldc2_w 1.0272396142798694E308
    //   1005: invokestatic doubleToLongBits : (D)J
    //   1008: ldc2_w 9215008140805383159
    //   1011: lxor
    //   1012: invokestatic longBitsToDouble : (J)D
    //   1015: ldc2_w 1.2199786356496083E307
    //   1018: invokestatic doubleToLongBits : (D)J
    //   1021: ldc2_w 9201240524253464551
    //   1024: lxor
    //   1025: invokestatic longBitsToDouble : (J)D
    //   1028: getstatic Perryc.1 : I
    //   1031: ifeq -> 1045
    //   1034: ldc2_w -1171731404
    //   1037: l2i
    //   1038: ldc_w 1210233322
    //   1041: ixor
    //   1042: goto -> 1053
    //   1045: ldc2_w 2000839958
    //   1048: l2i
    //   1049: ldc_w -1636533527
    //   1052: ixor
    //   1053: ldc2_w -18579210
    //   1056: l2i
    //   1057: ldc_w -1009215601
    //   1060: ixor
    //   1061: ixor
    //   1062: lookupswitch default -> 1088, -818517337 -> 4252, 2068892411 -> 1045
    //   1088: invokespecial <init> : (DDD)V
    //   1091: aastore
    //   1092: dup
    //   1093: ldc2_w -1591947530
    //   1096: l2i
    //   1097: ldc_w -1591947532
    //   1100: ixor
    //   1101: new net/minecraft/util/math/Vec3d
    //   1104: dup
    //   1105: ldc2_w 5.2376666555976776E306
    //   1108: invokestatic doubleToLongBits : (D)J
    //   1111: ldc2_w 9195740972468950143
    //   1114: lxor
    //   1115: invokestatic longBitsToDouble : (J)D
    //   1118: ldc2_w 1.4655625494816814E308
    //   1121: invokestatic doubleToLongBits : (D)J
    //   1124: ldc2_w 9217204323200877496
    //   1127: lxor
    //   1128: invokestatic longBitsToDouble : (J)D
    //   1131: ldc2_w -6.910349046879131
    //   1134: invokestatic doubleToLongBits : (D)J
    //   1137: ldc2_w 9217641599320795549
    //   1140: lxor
    //   1141: invokestatic longBitsToDouble : (J)D
    //   1144: getstatic Perryc.1 : I
    //   1147: ifeq -> 1161
    //   1150: ldc2_w -342517242
    //   1153: l2i
    //   1154: ldc_w -1609807862
    //   1157: ixor
    //   1158: goto -> 1169
    //   1161: ldc2_w 1591004451
    //   1164: l2i
    //   1165: ldc_w -1337330572
    //   1168: ixor
    //   1169: ldc2_w -2011688987
    //   1172: l2i
    //   1173: ldc_w 637645330
    //   1176: ixor
    //   1177: ixor
    //   1178: lookupswitch default -> 4304, -444567557 -> 1161, 1082426528 -> 1204
    //   1204: invokespecial <init> : (DDD)V
    //   1207: aastore
    //   1208: dup
    //   1209: ldc2_w 655285239
    //   1212: l2i
    //   1213: ldc_w 655285236
    //   1216: ixor
    //   1217: new net/minecraft/util/math/Vec3d
    //   1220: dup
    //   1221: ldc2_w 5.912481813676066E306
    //   1224: invokestatic doubleToLongBits : (D)J
    //   1227: ldc2_w 9196586683055221551
    //   1230: lxor
    //   1231: invokestatic longBitsToDouble : (J)D
    //   1234: ldc2_w 1.5102335358097719E308
    //   1237: invokestatic doubleToLongBits : (D)J
    //   1240: ldc2_w 9217428143644400377
    //   1243: lxor
    //   1244: invokestatic longBitsToDouble : (J)D
    //   1247: ldc2_w 23.720628845236586
    //   1250: invokestatic doubleToLongBits : (D)J
    //   1253: ldc2_w 9207530802169698411
    //   1256: lxor
    //   1257: invokestatic longBitsToDouble : (J)D
    //   1260: getstatic Perryc.1 : I
    //   1263: ifeq -> 1277
    //   1266: ldc2_w 1294163395
    //   1269: l2i
    //   1270: ldc_w -1276383290
    //   1273: ixor
    //   1274: goto -> 1285
    //   1277: ldc2_w -407581723
    //   1280: l2i
    //   1281: ldc_w 1903991055
    //   1284: ixor
    //   1285: ldc2_w -849616666
    //   1288: l2i
    //   1289: ldc_w -1482684249
    //   1292: ixor
    //   1293: ixor
    //   1294: lookupswitch default -> 1320, -1808573884 -> 4308, -1483589414 -> 1277
    //   1320: invokespecial <init> : (DDD)V
    //   1323: aastore
    //   1324: getstatic Perryc.1 : I
    //   1327: ifeq -> 1341
    //   1330: ldc2_w -1886052698
    //   1333: l2i
    //   1334: ldc_w 1772557847
    //   1337: ixor
    //   1338: goto -> 1349
    //   1341: ldc2_w -74088349
    //   1344: l2i
    //   1345: ldc_w 774916852
    //   1348: ixor
    //   1349: ldc2_w 969311180
    //   1352: l2i
    //   1353: ldc_w 765878697
    //   1356: ixor
    //   1357: ixor
    //   1358: lookupswitch default -> 4300, -1044043534 -> 1384, -229446956 -> 1341
    //   1384: putstatic bigname/zprestige/webhack/util/EntityUtil.legOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   1387: ldc2_w -315292137
    //   1390: l2i
    //   1391: ldc_w -315292142
    //   1394: ixor
    //   1395: anewarray net/minecraft/util/math/Vec3d
    //   1398: dup
    //   1399: ldc2_w -1794324015
    //   1402: l2i
    //   1403: ldc_w -1794324015
    //   1406: ixor
    //   1407: new net/minecraft/util/math/Vec3d
    //   1410: dup
    //   1411: ldc2_w 27.573137757600772
    //   1414: invokestatic doubleToLongBits : (D)J
    //   1417: ldc2_w 9208615187026083715
    //   1420: lxor
    //   1421: invokestatic longBitsToDouble : (J)D
    //   1424: ldc2_w 13.473446000520097
    //   1427: invokestatic doubleToLongBits : (D)J
    //   1430: ldc2_w 9212942514143711175
    //   1433: lxor
    //   1434: invokestatic longBitsToDouble : (J)D
    //   1437: ldc2_w 7.812058931140383E307
    //   1440: invokestatic doubleToLongBits : (D)J
    //   1443: ldc2_w 9213185979013452359
    //   1446: lxor
    //   1447: invokestatic longBitsToDouble : (J)D
    //   1450: getstatic Perryc.0 : I
    //   1453: ifle -> 1467
    //   1456: ldc2_w 242770591
    //   1459: l2i
    //   1460: ldc_w -525842568
    //   1463: ixor
    //   1464: goto -> 1475
    //   1467: ldc2_w 1216252800
    //   1470: l2i
    //   1471: ldc_w -704134042
    //   1474: ixor
    //   1475: ldc2_w 1400220093
    //   1478: l2i
    //   1479: ldc_w 1099910993
    //   1482: ixor
    //   1483: ixor
    //   1484: lookupswitch default -> 1512, -64306421 -> 4254, -49860574 -> 1467
    //   1512: invokespecial <init> : (DDD)V
    //   1515: aastore
    //   1516: dup
    //   1517: ldc2_w -1309893300
    //   1520: l2i
    //   1521: ldc_w -1309893299
    //   1524: ixor
    //   1525: new net/minecraft/util/math/Vec3d
    //   1528: dup
    //   1529: ldc2_w -5.618571630996826
    //   1532: invokestatic doubleToLongBits : (D)J
    //   1535: ldc2_w 9216187187248592256
    //   1538: lxor
    //   1539: invokestatic longBitsToDouble : (J)D
    //   1542: ldc2_w 42.53138023249783
    //   1545: invokestatic doubleToLongBits : (D)J
    //   1548: ldc2_w 9202336198720760023
    //   1551: lxor
    //   1552: invokestatic longBitsToDouble : (J)D
    //   1555: ldc2_w 2.6593136950773684E307
    //   1558: invokestatic doubleToLongBits : (D)J
    //   1561: ldc2_w 9206183751084935939
    //   1564: lxor
    //   1565: invokestatic longBitsToDouble : (J)D
    //   1568: getstatic Perryc.0 : I
    //   1571: ifle -> 1585
    //   1574: ldc2_w -770964126
    //   1577: l2i
    //   1578: ldc_w 1101482794
    //   1581: ixor
    //   1582: goto -> 1593
    //   1585: ldc2_w 917937220
    //   1588: l2i
    //   1589: ldc_w -883162827
    //   1592: ixor
    //   1593: ldc2_w 2021128772
    //   1596: l2i
    //   1597: ldc_w 1638189428
    //   1600: ixor
    //   1601: ixor
    //   1602: lookupswitch default -> 1628, -1971815048 -> 4318, -693497899 -> 1585
    //   1628: invokespecial <init> : (DDD)V
    //   1631: aastore
    //   1632: dup
    //   1633: ldc2_w -1699582055
    //   1636: l2i
    //   1637: ldc_w -1699582053
    //   1640: ixor
    //   1641: new net/minecraft/util/math/Vec3d
    //   1644: dup
    //   1645: ldc2_w 1.1303476432609267E308
    //   1648: invokestatic doubleToLongBits : (D)J
    //   1651: ldc2_w 9215524755428749967
    //   1654: lxor
    //   1655: invokestatic longBitsToDouble : (J)D
    //   1658: ldc2_w 13.58204002579924
    //   1661: invokestatic doubleToLongBits : (D)J
    //   1664: ldc2_w 9213003647145183901
    //   1667: lxor
    //   1668: invokestatic longBitsToDouble : (J)D
    //   1671: ldc2_w 7.028447081055703
    //   1674: invokestatic doubleToLongBits : (D)J
    //   1677: ldc2_w 9217774565886473249
    //   1680: lxor
    //   1681: invokestatic longBitsToDouble : (J)D
    //   1684: getstatic Perryc.0 : I
    //   1687: ifle -> 1701
    //   1690: ldc2_w -260362188
    //   1693: l2i
    //   1694: ldc_w -500305468
    //   1697: ixor
    //   1698: goto -> 1709
    //   1701: ldc2_w -2025872899
    //   1704: l2i
    //   1705: ldc_w 590404568
    //   1708: ixor
    //   1709: ldc2_w 1845850400
    //   1712: l2i
    //   1713: ldc_w 760952881
    //   1716: ixor
    //   1717: ixor
    //   1718: lookupswitch default -> 4246, -414108876 -> 1744, 1359513825 -> 1701
    //   1744: invokespecial <init> : (DDD)V
    //   1747: aastore
    //   1748: dup
    //   1749: ldc2_w 221067055
    //   1752: l2i
    //   1753: ldc_w 221067052
    //   1756: ixor
    //   1757: new net/minecraft/util/math/Vec3d
    //   1760: dup
    //   1761: ldc2_w 5.297912442389184E307
    //   1764: invokestatic doubleToLongBits : (D)J
    //   1767: ldc2_w 9210666592590860955
    //   1770: lxor
    //   1771: invokestatic longBitsToDouble : (J)D
    //   1774: ldc2_w 6.931503699743133
    //   1777: invokestatic doubleToLongBits : (D)J
    //   1780: ldc2_w 9217665417342484417
    //   1783: lxor
    //   1784: invokestatic longBitsToDouble : (J)D
    //   1787: ldc2_w -44.172939412229134
    //   1790: invokestatic doubleToLongBits : (D)J
    //   1793: ldc2_w 9202567227636702039
    //   1796: lxor
    //   1797: invokestatic longBitsToDouble : (J)D
    //   1800: getstatic Perryc.c : I
    //   1803: iflt -> 1817
    //   1806: ldc2_w 167577141
    //   1809: l2i
    //   1810: ldc_w 475876223
    //   1813: ixor
    //   1814: goto -> 1825
    //   1817: ldc2_w 857813187
    //   1820: l2i
    //   1821: ldc_w -1628305569
    //   1824: ixor
    //   1825: ldc2_w -1682946306
    //   1828: l2i
    //   1829: ldc_w 1694765933
    //   1832: ixor
    //   1833: ixor
    //   1834: lookupswitch default -> 4284, -351004455 -> 1817, 1399284239 -> 1860
    //   1860: invokespecial <init> : (DDD)V
    //   1863: aastore
    //   1864: dup
    //   1865: ldc2_w 1349455327
    //   1868: l2i
    //   1869: ldc_w 1349455323
    //   1872: ixor
    //   1873: new net/minecraft/util/math/Vec3d
    //   1876: dup
    //   1877: ldc2_w 9.95671183897022E307
    //   1880: invokestatic doubleToLongBits : (D)J
    //   1883: ldc2_w 9214849969682012037
    //   1886: lxor
    //   1887: invokestatic longBitsToDouble : (J)D
    //   1890: ldc2_w 0.16728726342999586
    //   1893: invokestatic doubleToLongBits : (D)J
    //   1896: ldc2_w 9206881197575900603
    //   1899: lxor
    //   1900: invokestatic longBitsToDouble : (J)D
    //   1903: ldc2_w 1.5142602644050216E308
    //   1906: invokestatic doubleToLongBits : (D)J
    //   1909: ldc2_w 9217448319249512734
    //   1912: lxor
    //   1913: invokestatic longBitsToDouble : (J)D
    //   1916: getstatic Perryc.1 : I
    //   1919: ifeq -> 1933
    //   1922: ldc2_w -306134421
    //   1925: l2i
    //   1926: ldc_w -47539918
    //   1929: ixor
    //   1930: goto -> 1941
    //   1933: ldc2_w -1038332433
    //   1936: l2i
    //   1937: ldc_w 776993968
    //   1940: ixor
    //   1941: ldc2_w 289565256
    //   1944: l2i
    //   1945: ldc_w -647523544
    //   1948: ixor
    //   1949: ixor
    //   1950: lookupswitch default -> 1976, -657481159 -> 4310, 1020642815 -> 1933
    //   1976: invokespecial <init> : (DDD)V
    //   1979: aastore
    //   1980: getstatic Perryc.0 : I
    //   1983: ifle -> 1997
    //   1986: ldc2_w 1754716391
    //   1989: l2i
    //   1990: ldc_w 1727347335
    //   1993: ixor
    //   1994: goto -> 2005
    //   1997: ldc2_w -1126126115
    //   2000: l2i
    //   2001: ldc_w -1115412040
    //   2004: ixor
    //   2005: ldc2_w 564881116
    //   2008: l2i
    //   2009: ldc_w 953972374
    //   2012: ixor
    //   2013: ixor
    //   2014: lookupswitch default -> 4248, 387248682 -> 1997, 403936303 -> 2040
    //   2040: putstatic bigname/zprestige/webhack/util/EntityUtil.OffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   2043: ldc2_w -1524514798
    //   2046: l2i
    //   2047: ldc_w -1524514794
    //   2050: ixor
    //   2051: anewarray net/minecraft/util/math/Vec3d
    //   2054: dup
    //   2055: ldc2_w -243725539
    //   2058: l2i
    //   2059: ldc_w -243725539
    //   2062: ixor
    //   2063: new net/minecraft/util/math/Vec3d
    //   2066: dup
    //   2067: ldc2_w -14.387620186166304
    //   2070: invokestatic doubleToLongBits : (D)J
    //   2073: ldc2_w 9213457148458939673
    //   2076: lxor
    //   2077: invokestatic longBitsToDouble : (J)D
    //   2080: ldc2_w 0.9210627116835176
    //   2083: invokestatic doubleToLongBits : (D)J
    //   2086: ldc2_w 9215905633529224569
    //   2089: lxor
    //   2090: invokestatic longBitsToDouble : (J)D
    //   2093: ldc2_w 1.3199983764800877E308
    //   2096: invokestatic doubleToLongBits : (D)J
    //   2099: ldc2_w 9216474985426175830
    //   2102: lxor
    //   2103: invokestatic longBitsToDouble : (J)D
    //   2106: getstatic Perryc.1 : I
    //   2109: ifeq -> 2123
    //   2112: ldc2_w -438144804
    //   2115: l2i
    //   2116: ldc_w 285014731
    //   2119: ixor
    //   2120: goto -> 2131
    //   2123: ldc2_w 1311377512
    //   2126: l2i
    //   2127: ldc_w -360838840
    //   2130: ixor
    //   2131: ldc2_w 174760165
    //   2134: l2i
    //   2135: ldc_w -1339942240
    //   2138: ixor
    //   2139: ixor
    //   2140: lookupswitch default -> 2168, -1353958748 -> 2123, 1331048530 -> 4288
    //   2168: invokespecial <init> : (DDD)V
    //   2171: aastore
    //   2172: dup
    //   2173: ldc2_w 476728937
    //   2176: l2i
    //   2177: ldc_w 476728936
    //   2180: ixor
    //   2181: new net/minecraft/util/math/Vec3d
    //   2184: dup
    //   2185: ldc2_w 16.94277711755468
    //   2188: invokestatic doubleToLongBits : (D)J
    //   2191: ldc2_w 9205623006512500867
    //   2194: lxor
    //   2195: invokestatic longBitsToDouble : (J)D
    //   2198: ldc2_w 0.8685086099067324
    //   2201: invokestatic doubleToLongBits : (D)J
    //   2204: ldc2_w 9215432268262867127
    //   2207: lxor
    //   2208: invokestatic longBitsToDouble : (J)D
    //   2211: ldc2_w 7.96921904834896E307
    //   2214: invokestatic doubleToLongBits : (D)J
    //   2217: ldc2_w 9213343466680634725
    //   2220: lxor
    //   2221: invokestatic longBitsToDouble : (J)D
    //   2224: getstatic Perryc.1 : I
    //   2227: ifeq -> 2241
    //   2230: ldc2_w 435844636
    //   2233: l2i
    //   2234: ldc_w 1384847423
    //   2237: ixor
    //   2238: goto -> 2249
    //   2241: ldc2_w -1909512043
    //   2244: l2i
    //   2245: ldc_w 775144573
    //   2248: ixor
    //   2249: ldc2_w 1695966137
    //   2252: l2i
    //   2253: ldc_w 876078718
    //   2256: ixor
    //   2257: ixor
    //   2258: lookupswitch default -> 2284, 441510884 -> 4264, 1143325990 -> 2241
    //   2284: invokespecial <init> : (DDD)V
    //   2287: aastore
    //   2288: dup
    //   2289: ldc2_w 847046152
    //   2292: l2i
    //   2293: ldc_w 847046154
    //   2296: ixor
    //   2297: new net/minecraft/util/math/Vec3d
    //   2300: dup
    //   2301: ldc2_w 1.0837123583001345E308
    //   2304: invokestatic doubleToLongBits : (D)J
    //   2307: ldc2_w 9215291093022303912
    //   2310: lxor
    //   2311: invokestatic longBitsToDouble : (J)D
    //   2314: ldc2_w 0.08666304060254969
    //   2317: invokestatic doubleToLongBits : (D)J
    //   2320: ldc2_w 9204846969102069071
    //   2323: lxor
    //   2324: invokestatic longBitsToDouble : (J)D
    //   2327: ldc2_w 7.955672448841442
    //   2330: invokestatic doubleToLongBits : (D)J
    //   2333: ldc2_w 9218818528841685330
    //   2336: lxor
    //   2337: invokestatic longBitsToDouble : (J)D
    //   2340: getstatic Perryc.0 : I
    //   2343: ifle -> 2357
    //   2346: ldc2_w -746997715
    //   2349: l2i
    //   2350: ldc_w 1963611692
    //   2353: ixor
    //   2354: goto -> 2365
    //   2357: ldc2_w 1476475221
    //   2360: l2i
    //   2361: ldc_w -79340251
    //   2364: ixor
    //   2365: ldc2_w -174432552
    //   2368: l2i
    //   2369: ldc_w 1675747228
    //   2372: ixor
    //   2373: ixor
    //   2374: lookupswitch default -> 2400, -644061209 -> 2357, 805859141 -> 4296
    //   2400: invokespecial <init> : (DDD)V
    //   2403: aastore
    //   2404: dup
    //   2405: ldc2_w 100743468
    //   2408: l2i
    //   2409: ldc_w 100743471
    //   2412: ixor
    //   2413: new net/minecraft/util/math/Vec3d
    //   2416: dup
    //   2417: ldc2_w 6.361925025813072E307
    //   2420: invokestatic doubleToLongBits : (D)J
    //   2423: ldc2_w 9211732822768035737
    //   2426: lxor
    //   2427: invokestatic longBitsToDouble : (J)D
    //   2430: ldc2_w 0.3411179725960993
    //   2433: invokestatic doubleToLongBits : (D)J
    //   2436: ldc2_w 9213754473256071759
    //   2439: lxor
    //   2440: invokestatic longBitsToDouble : (J)D
    //   2443: ldc2_w -4.335573610180557
    //   2446: invokestatic doubleToLongBits : (D)J
    //   2449: ldc2_w 9214742659896475948
    //   2452: lxor
    //   2453: invokestatic longBitsToDouble : (J)D
    //   2456: getstatic Perryc.0 : I
    //   2459: ifle -> 2473
    //   2462: ldc2_w -126921897
    //   2465: l2i
    //   2466: ldc_w -303511626
    //   2469: ixor
    //   2470: goto -> 2481
    //   2473: ldc2_w -1917697424
    //   2476: l2i
    //   2477: ldc_w 1765190303
    //   2480: ixor
    //   2481: ldc2_w 1308432582
    //   2484: l2i
    //   2485: ldc_w 1180203983
    //   2488: ixor
    //   2489: ixor
    //   2490: lookupswitch default -> 4290, -283014170 -> 2516, 505608168 -> 2473
    //   2516: invokespecial <init> : (DDD)V
    //   2519: aastore
    //   2520: getstatic Perryc.1 : I
    //   2523: ifeq -> 2537
    //   2526: ldc2_w 898245967
    //   2529: l2i
    //   2530: ldc_w 1072035473
    //   2533: ixor
    //   2534: goto -> 2545
    //   2537: ldc2_w 1524443349
    //   2540: l2i
    //   2541: ldc_w 1239795947
    //   2544: ixor
    //   2545: ldc2_w 749548403
    //   2548: l2i
    //   2549: ldc_w 458303264
    //   2552: ixor
    //   2553: ixor
    //   2554: lookupswitch default -> 2580, -836500377 -> 2537, 1033095053 -> 4258
    //   2580: putstatic bigname/zprestige/webhack/util/EntityUtil.antiStepOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   2583: ldc2_w 279968373
    //   2586: l2i
    //   2587: ldc_w 279968368
    //   2590: ixor
    //   2591: anewarray net/minecraft/util/math/Vec3d
    //   2594: dup
    //   2595: ldc2_w -1907109802
    //   2598: l2i
    //   2599: ldc_w -1907109802
    //   2602: ixor
    //   2603: new net/minecraft/util/math/Vec3d
    //   2606: dup
    //   2607: ldc2_w 11.15081204692534
    //   2610: invokestatic doubleToLongBits : (D)J
    //   2613: ldc2_w 9211634987467720249
    //   2616: lxor
    //   2617: invokestatic longBitsToDouble : (J)D
    //   2620: ldc2_w -10.553719603475246
    //   2623: invokestatic doubleToLongBits : (D)J
    //   2626: ldc2_w 9211298854304491801
    //   2629: lxor
    //   2630: invokestatic longBitsToDouble : (J)D
    //   2633: ldc2_w 7.468281789398345E307
    //   2636: invokestatic doubleToLongBits : (D)J
    //   2639: ldc2_w 9212841485378265503
    //   2642: lxor
    //   2643: invokestatic longBitsToDouble : (J)D
    //   2646: getstatic Perryc.0 : I
    //   2649: ifle -> 2663
    //   2652: ldc2_w 1225239767
    //   2655: l2i
    //   2656: ldc_w 704289137
    //   2659: ixor
    //   2660: goto -> 2671
    //   2663: ldc2_w 931389132
    //   2666: l2i
    //   2667: ldc_w 1133302596
    //   2670: ixor
    //   2671: ldc2_w -1223792163
    //   2674: l2i
    //   2675: ldc_w 840133567
    //   2678: ixor
    //   2679: ixor
    //   2680: lookupswitch default -> 2708, -1251100220 -> 2663, -438290492 -> 4268
    //   2708: invokespecial <init> : (DDD)V
    //   2711: aastore
    //   2712: dup
    //   2713: ldc2_w -2067034555
    //   2716: l2i
    //   2717: ldc_w -2067034556
    //   2720: ixor
    //   2721: new net/minecraft/util/math/Vec3d
    //   2724: dup
    //   2725: ldc2_w -7.177548403561378
    //   2728: invokestatic doubleToLongBits : (D)J
    //   2731: ldc2_w 9217942439051592500
    //   2734: lxor
    //   2735: invokestatic longBitsToDouble : (J)D
    //   2738: ldc2_w -7.589428156810987
    //   2741: invokestatic doubleToLongBits : (D)J
    //   2744: ldc2_w 9218406174427406598
    //   2747: lxor
    //   2748: invokestatic longBitsToDouble : (J)D
    //   2751: ldc2_w 1.6931912119313763E307
    //   2754: invokestatic doubleToLongBits : (D)J
    //   2757: ldc2_w 9203137319599349055
    //   2760: lxor
    //   2761: invokestatic longBitsToDouble : (J)D
    //   2764: getstatic Perryc.0 : I
    //   2767: ifle -> 2781
    //   2770: ldc2_w -305062059
    //   2773: l2i
    //   2774: ldc_w 2114747511
    //   2777: ixor
    //   2778: goto -> 2789
    //   2781: ldc2_w -1848806918
    //   2784: l2i
    //   2785: ldc_w 1776972279
    //   2788: ixor
    //   2789: ldc2_w 239040099
    //   2792: l2i
    //   2793: ldc_w -1400349606
    //   2796: ixor
    //   2797: ixor
    //   2798: lookupswitch default -> 2824, -824508141 -> 2781, 829049115 -> 4306
    //   2824: invokespecial <init> : (DDD)V
    //   2827: aastore
    //   2828: dup
    //   2829: ldc2_w 533822513
    //   2832: l2i
    //   2833: ldc_w 533822515
    //   2836: ixor
    //   2837: new net/minecraft/util/math/Vec3d
    //   2840: dup
    //   2841: ldc2_w 1.0267076564748452E308
    //   2844: invokestatic doubleToLongBits : (D)J
    //   2847: ldc2_w 9215005475472878936
    //   2850: lxor
    //   2851: invokestatic longBitsToDouble : (J)D
    //   2854: ldc2_w -5691.766251035965
    //   2857: invokestatic doubleToLongBits : (D)J
    //   2860: ldc2_w 9171083404874556415
    //   2863: lxor
    //   2864: invokestatic longBitsToDouble : (J)D
    //   2867: ldc2_w 5.122326715303149
    //   2870: invokestatic doubleToLongBits : (D)J
    //   2873: ldc2_w 9215628465144241620
    //   2876: lxor
    //   2877: invokestatic longBitsToDouble : (J)D
    //   2880: getstatic Perryc.0 : I
    //   2883: ifle -> 2897
    //   2886: ldc2_w -123912547
    //   2889: l2i
    //   2890: ldc_w 1759111279
    //   2893: ixor
    //   2894: goto -> 2905
    //   2897: ldc2_w 1292408256
    //   2900: l2i
    //   2901: ldc_w 384185119
    //   2904: ixor
    //   2905: ldc2_w -196857541
    //   2908: l2i
    //   2909: ldc_w -853956014
    //   2912: ixor
    //   2913: ixor
    //   2914: lookupswitch default -> 2940, -1457959525 -> 4250, -145931851 -> 2897
    //   2940: invokespecial <init> : (DDD)V
    //   2943: aastore
    //   2944: dup
    //   2945: ldc2_w -315646447
    //   2948: l2i
    //   2949: ldc_w -315646446
    //   2952: ixor
    //   2953: new net/minecraft/util/math/Vec3d
    //   2956: dup
    //   2957: ldc2_w 5.395228621942546E307
    //   2960: invokestatic doubleToLongBits : (D)J
    //   2963: ldc2_w 9210764111594849855
    //   2966: lxor
    //   2967: invokestatic longBitsToDouble : (J)D
    //   2970: ldc2_w -180.38574385826902
    //   2973: invokestatic doubleToLongBits : (D)J
    //   2976: ldc2_w 9193689998967241919
    //   2979: lxor
    //   2980: invokestatic longBitsToDouble : (J)D
    //   2983: ldc2_w -4.077610809291331
    //   2986: invokestatic doubleToLongBits : (D)J
    //   2989: ldc2_w 9214452219602985906
    //   2992: lxor
    //   2993: invokestatic longBitsToDouble : (J)D
    //   2996: getstatic Perryc.0 : I
    //   2999: ifle -> 3013
    //   3002: ldc2_w 673672303
    //   3005: l2i
    //   3006: ldc_w -1039061486
    //   3009: ixor
    //   3010: goto -> 3021
    //   3013: ldc2_w 339199243
    //   3016: l2i
    //   3017: ldc_w 3126801
    //   3020: ixor
    //   3021: ldc2_w 706515731
    //   3024: l2i
    //   3025: ldc_w 989879270
    //   3028: ixor
    //   3029: ixor
    //   3030: lookupswitch default -> 3056, -81098104 -> 4294, 122007666 -> 3013
    //   3056: invokespecial <init> : (DDD)V
    //   3059: aastore
    //   3060: dup
    //   3061: ldc2_w 1211748741
    //   3064: l2i
    //   3065: ldc_w 1211748737
    //   3068: ixor
    //   3069: new net/minecraft/util/math/Vec3d
    //   3072: dup
    //   3073: ldc2_w 4.218356673659321E307
    //   3076: invokestatic doubleToLongBits : (D)J
    //   3079: ldc2_w 9209308335694504035
    //   3082: lxor
    //   3083: invokestatic longBitsToDouble : (J)D
    //   3086: ldc2_w 0.1486496343087282
    //   3089: invokestatic doubleToLongBits : (D)J
    //   3092: ldc2_w 9208461506033060967
    //   3095: lxor
    //   3096: invokestatic longBitsToDouble : (J)D
    //   3099: ldc2_w 1.037092098827744E308
    //   3102: invokestatic doubleToLongBits : (D)J
    //   3105: ldc2_w 9215057505899878978
    //   3108: lxor
    //   3109: invokestatic longBitsToDouble : (J)D
    //   3112: getstatic Perryc.c : I
    //   3115: iflt -> 3129
    //   3118: ldc2_w 799215205
    //   3121: l2i
    //   3122: ldc_w -2119468669
    //   3125: ixor
    //   3126: goto -> 3137
    //   3129: ldc2_w -1510468355
    //   3132: l2i
    //   3133: ldc_w -1270112499
    //   3136: ixor
    //   3137: ldc2_w -1931510358
    //   3140: l2i
    //   3141: ldc_w -361584335
    //   3144: ixor
    //   3145: ixor
    //   3146: lookupswitch default -> 3172, -928668803 -> 4262, 2019372271 -> 3129
    //   3172: invokespecial <init> : (DDD)V
    //   3175: aastore
    //   3176: getstatic Perryc.c : I
    //   3179: iflt -> 3193
    //   3182: ldc2_w -2124344515
    //   3185: l2i
    //   3186: ldc_w 117597240
    //   3189: ixor
    //   3190: goto -> 3201
    //   3193: ldc2_w 124485997
    //   3196: l2i
    //   3197: ldc_w -1934269084
    //   3200: ixor
    //   3201: ldc2_w 173725425
    //   3204: l2i
    //   3205: ldc_w -826062469
    //   3208: ixor
    //   3209: ixor
    //   3210: lookupswitch default -> 3236, -739292109 -> 3193, 1123739791 -> 4316
    //   3236: putstatic bigname/zprestige/webhack/util/EntityUtil.antiScaffoldOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   3239: ldc2_w -1563475085
    //   3242: l2i
    //   3243: ldc_w -1563475077
    //   3246: ixor
    //   3247: anewarray net/minecraft/util/math/Vec3d
    //   3250: dup
    //   3251: ldc2_w -779566348
    //   3254: l2i
    //   3255: ldc_w -779566348
    //   3258: ixor
    //   3259: new net/minecraft/util/math/Vec3d
    //   3262: dup
    //   3263: ldc2_w -93.24856770671316
    //   3266: invokestatic doubleToLongBits : (D)J
    //   3269: ldc2_w 9198408624069069615
    //   3272: lxor
    //   3273: invokestatic longBitsToDouble : (J)D
    //   3276: ldc2_w 5.315451491884229E307
    //   3279: invokestatic doubleToLongBits : (D)J
    //   3282: ldc2_w 9210684168194892255
    //   3285: lxor
    //   3286: invokestatic longBitsToDouble : (J)D
    //   3289: ldc2_w 7.449850326643889E307
    //   3292: invokestatic doubleToLongBits : (D)J
    //   3295: ldc2_w 9212823015501024921
    //   3298: lxor
    //   3299: invokestatic longBitsToDouble : (J)D
    //   3302: getstatic Perryc.c : I
    //   3305: iflt -> 3319
    //   3308: ldc2_w 205424333
    //   3311: l2i
    //   3312: ldc_w -276993508
    //   3315: ixor
    //   3316: goto -> 3327
    //   3319: ldc2_w 308381663
    //   3322: l2i
    //   3323: ldc_w -175857723
    //   3326: ixor
    //   3327: ldc2_w -994596730
    //   3330: l2i
    //   3331: ldc_w 1606511369
    //   3334: ixor
    //   3335: ixor
    //   3336: lookupswitch default -> 3364, 1986344752 -> 3319, 2016751454 -> 4270
    //   3364: invokespecial <init> : (DDD)V
    //   3367: aastore
    //   3368: dup
    //   3369: ldc2_w 828731120
    //   3372: l2i
    //   3373: ldc_w 828731121
    //   3376: ixor
    //   3377: new net/minecraft/util/math/Vec3d
    //   3380: dup
    //   3381: ldc2_w 4.716316298501065
    //   3384: invokestatic doubleToLongBits : (D)J
    //   3387: ldc2_w 9215171338053787018
    //   3390: lxor
    //   3391: invokestatic longBitsToDouble : (J)D
    //   3394: ldc2_w 4.305621805665347E307
    //   3397: invokestatic doubleToLongBits : (D)J
    //   3400: ldc2_w 9209483229711002519
    //   3403: lxor
    //   3404: invokestatic longBitsToDouble : (J)D
    //   3407: ldc2_w 3.0810406765664944E307
    //   3410: invokestatic doubleToLongBits : (D)J
    //   3413: ldc2_w 9207028962957798535
    //   3416: lxor
    //   3417: invokestatic longBitsToDouble : (J)D
    //   3420: getstatic Perryc.1 : I
    //   3423: ifeq -> 3437
    //   3426: ldc2_w 1728277710
    //   3429: l2i
    //   3430: ldc_w 1172952696
    //   3433: ixor
    //   3434: goto -> 3445
    //   3437: ldc2_w -86050202
    //   3440: l2i
    //   3441: ldc_w 394680367
    //   3444: ixor
    //   3445: ldc2_w -567606766
    //   3448: l2i
    //   3449: ldc_w -1158273022
    //   3452: ixor
    //   3453: ixor
    //   3454: lookupswitch default -> 4292, -1987737511 -> 3480, 1178046630 -> 3437
    //   3480: invokespecial <init> : (DDD)V
    //   3483: aastore
    //   3484: dup
    //   3485: ldc2_w 394532996
    //   3488: l2i
    //   3489: ldc_w 394532998
    //   3492: ixor
    //   3493: new net/minecraft/util/math/Vec3d
    //   3496: dup
    //   3497: ldc2_w 5.286228758843435E307
    //   3500: invokestatic doubleToLongBits : (D)J
    //   3503: ldc2_w 9210654884556415581
    //   3506: lxor
    //   3507: invokestatic longBitsToDouble : (J)D
    //   3510: ldc2_w 5.792953276626542E307
    //   3513: invokestatic doubleToLongBits : (D)J
    //   3516: ldc2_w 9211162665179306435
    //   3519: lxor
    //   3520: invokestatic longBitsToDouble : (J)D
    //   3523: ldc2_w -25.08938712970774
    //   3526: invokestatic doubleToLongBits : (D)J
    //   3529: ldc2_w 9207916073375942447
    //   3532: lxor
    //   3533: invokestatic longBitsToDouble : (J)D
    //   3536: getstatic Perryc.1 : I
    //   3539: ifeq -> 3553
    //   3542: ldc2_w -1762681396
    //   3545: l2i
    //   3546: ldc_w 2030611203
    //   3549: ixor
    //   3550: goto -> 3561
    //   3553: ldc2_w 1840889670
    //   3556: l2i
    //   3557: ldc_w 785723794
    //   3560: ixor
    //   3561: ldc2_w 813683978
    //   3564: l2i
    //   3565: ldc_w 23347797
    //   3568: ixor
    //   3569: ixor
    //   3570: lookupswitch default -> 3596, -553868912 -> 4298, 104540957 -> 3553
    //   3596: invokespecial <init> : (DDD)V
    //   3599: aastore
    //   3600: dup
    //   3601: ldc2_w 1932549279
    //   3604: l2i
    //   3605: ldc_w 1932549276
    //   3608: ixor
    //   3609: new net/minecraft/util/math/Vec3d
    //   3612: dup
    //   3613: ldc2_w 5.552704282062271E307
    //   3616: invokestatic doubleToLongBits : (D)J
    //   3619: ldc2_w 9210921915462591595
    //   3622: lxor
    //   3623: invokestatic longBitsToDouble : (J)D
    //   3626: ldc2_w 1.1972329232800869E308
    //   3629: invokestatic doubleToLongBits : (D)J
    //   3632: ldc2_w 9215859878833661820
    //   3635: lxor
    //   3636: invokestatic longBitsToDouble : (J)D
    //   3639: ldc2_w 4.421786627662147
    //   3642: invokestatic doubleToLongBits : (D)J
    //   3645: ldc2_w 9214839727124827092
    //   3648: lxor
    //   3649: invokestatic longBitsToDouble : (J)D
    //   3652: getstatic Perryc.1 : I
    //   3655: ifeq -> 3669
    //   3658: ldc2_w 1193483681
    //   3661: l2i
    //   3662: ldc_w 946695849
    //   3665: ixor
    //   3666: goto -> 3677
    //   3669: ldc2_w -352596189
    //   3672: l2i
    //   3673: ldc_w -309768059
    //   3676: ixor
    //   3677: ldc2_w -1908692425
    //   3680: l2i
    //   3681: ldc_w -46077409
    //   3684: ixor
    //   3685: ixor
    //   3686: lookupswitch default -> 4302, 204813088 -> 3669, 1946804110 -> 3712
    //   3712: invokespecial <init> : (DDD)V
    //   3715: aastore
    //   3716: dup
    //   3717: ldc2_w -377784152
    //   3720: l2i
    //   3721: ldc_w -377784148
    //   3724: ixor
    //   3725: new net/minecraft/util/math/Vec3d
    //   3728: dup
    //   3729: ldc2_w -0.0031561074395154427
    //   3732: invokestatic doubleToLongBits : (D)J
    //   3735: ldc2_w 9181109929229434367
    //   3738: lxor
    //   3739: invokestatic longBitsToDouble : (J)D
    //   3742: ldc2_w 1.4409219172777541E308
    //   3745: invokestatic doubleToLongBits : (D)J
    //   3748: ldc2_w 9217080863262293173
    //   3751: lxor
    //   3752: invokestatic longBitsToDouble : (J)D
    //   3755: ldc2_w 1.8676124123264982E306
    //   3758: invokestatic doubleToLongBits : (D)J
    //   3761: ldc2_w 9188828455737313023
    //   3764: lxor
    //   3765: invokestatic longBitsToDouble : (J)D
    //   3768: getstatic Perryc.c : I
    //   3771: iflt -> 3785
    //   3774: ldc2_w -1350931377
    //   3777: l2i
    //   3778: ldc_w 1502082627
    //   3781: ixor
    //   3782: goto -> 3793
    //   3785: ldc2_w 230728638
    //   3788: l2i
    //   3789: ldc_w 1625673172
    //   3792: ixor
    //   3793: ldc2_w 1502985631
    //   3796: l2i
    //   3797: ldc_w 2045533159
    //   3800: ixor
    //   3801: ixor
    //   3802: lookupswitch default -> 3828, -1758412834 -> 3785, -695960460 -> 4320
    //   3828: invokespecial <init> : (DDD)V
    //   3831: aastore
    //   3832: dup
    //   3833: ldc2_w 671562280
    //   3836: l2i
    //   3837: ldc_w 671562285
    //   3840: ixor
    //   3841: new net/minecraft/util/math/Vec3d
    //   3844: dup
    //   3845: ldc2_w 0.9633542548229176
    //   3848: invokestatic doubleToLongBits : (D)J
    //   3851: ldc2_w 9218538361698756867
    //   3854: lxor
    //   3855: invokestatic longBitsToDouble : (J)D
    //   3858: ldc2_w 4.1380133208347773E307
    //   3861: invokestatic doubleToLongBits : (D)J
    //   3864: ldc2_w 9209147314088836047
    //   3867: lxor
    //   3868: invokestatic longBitsToDouble : (J)D
    //   3871: ldc2_w 1.1556133890232666E308
    //   3874: invokestatic doubleToLongBits : (D)J
    //   3877: ldc2_w 9215651347449372248
    //   3880: lxor
    //   3881: invokestatic longBitsToDouble : (J)D
    //   3884: getstatic Perryc.c : I
    //   3887: iflt -> 3901
    //   3890: ldc2_w 214749345
    //   3893: l2i
    //   3894: ldc_w 508264181
    //   3897: ixor
    //   3898: goto -> 3909
    //   3901: ldc2_w 1578799932
    //   3904: l2i
    //   3905: ldc_w 952118137
    //   3908: ixor
    //   3909: ldc2_w 1885056618
    //   3912: l2i
    //   3913: ldc_w -1341822528
    //   3916: ixor
    //   3917: ixor
    //   3918: lookupswitch default -> 4274, -1501265937 -> 3944, -757503490 -> 3901
    //   3944: invokespecial <init> : (DDD)V
    //   3947: aastore
    //   3948: dup
    //   3949: ldc2_w -728873545
    //   3952: l2i
    //   3953: ldc_w -728873551
    //   3956: ixor
    //   3957: new net/minecraft/util/math/Vec3d
    //   3960: dup
    //   3961: ldc2_w 1.4172451431311462E308
    //   3964: invokestatic doubleToLongBits : (D)J
    //   3967: ldc2_w 9216962232658263898
    //   3970: lxor
    //   3971: invokestatic longBitsToDouble : (J)D
    //   3974: ldc2_w 4.551827893251794E307
    //   3977: invokestatic doubleToLongBits : (D)J
    //   3980: ldc2_w 9209918953067224597
    //   3983: lxor
    //   3984: invokestatic longBitsToDouble : (J)D
    //   3987: ldc2_w -0.8651023706176053
    //   3990: invokestatic doubleToLongBits : (D)J
    //   3993: ldc2_w 9217653387400565880
    //   3996: lxor
    //   3997: invokestatic longBitsToDouble : (J)D
    //   4000: getstatic Perryc.c : I
    //   4003: iflt -> 4017
    //   4006: ldc2_w 404520260
    //   4009: l2i
    //   4010: ldc_w -1227631696
    //   4013: ixor
    //   4014: goto -> 4025
    //   4017: ldc2_w 158536516
    //   4020: l2i
    //   4021: ldc_w 1121553866
    //   4024: ixor
    //   4025: ldc2_w -192176313
    //   4028: l2i
    //   4029: ldc_w -1986780674
    //   4032: ixor
    //   4033: ixor
    //   4034: lookupswitch default -> 4060, -741339059 -> 4278, 144173232 -> 4017
    //   4060: invokespecial <init> : (DDD)V
    //   4063: aastore
    //   4064: dup
    //   4065: ldc2_w -34989151
    //   4068: l2i
    //   4069: ldc_w -34989146
    //   4072: ixor
    //   4073: new net/minecraft/util/math/Vec3d
    //   4076: dup
    //   4077: ldc2_w 8.535264732390555E307
    //   4080: invokestatic doubleToLongBits : (D)J
    //   4083: ldc2_w 9213910692105772625
    //   4086: lxor
    //   4087: invokestatic longBitsToDouble : (J)D
    //   4090: ldc2_w 9.05182420816072E307
    //   4093: invokestatic doubleToLongBits : (D)J
    //   4096: ldc2_w 9214396582892254067
    //   4099: lxor
    //   4100: invokestatic longBitsToDouble : (J)D
    //   4103: ldc2_w 0.07080939949551689
    //   4106: invokestatic doubleToLongBits : (D)J
    //   4109: ldc2_w 9201452794053470247
    //   4112: lxor
    //   4113: invokestatic longBitsToDouble : (J)D
    //   4116: getstatic Perryc.c : I
    //   4119: iflt -> 4133
    //   4122: ldc2_w 242579386
    //   4125: l2i
    //   4126: ldc_w 1371369360
    //   4129: ixor
    //   4130: goto -> 4141
    //   4133: ldc2_w 607193564
    //   4136: l2i
    //   4137: ldc_w 1241284812
    //   4140: ixor
    //   4141: ldc2_w 579855260
    //   4144: l2i
    //   4145: ldc_w 1527487321
    //   4148: ixor
    //   4149: ixor
    //   4150: lookupswitch default -> 4314, 340390357 -> 4176, 642539759 -> 4133
    //   4176: invokespecial <init> : (DDD)V
    //   4179: aastore
    //   4180: getstatic Perryc.1 : I
    //   4183: ifeq -> 4197
    //   4186: ldc2_w -336087554
    //   4189: l2i
    //   4190: ldc_w 1372102154
    //   4193: ixor
    //   4194: goto -> 4205
    //   4197: ldc2_w 1014056317
    //   4200: l2i
    //   4201: ldc_w -1762092644
    //   4204: ixor
    //   4205: ldc2_w -578133648
    //   4208: l2i
    //   4209: ldc_w 513518180
    //   4212: ixor
    //   4213: ixor
    //   4214: lookupswitch default -> 4240, 451407243 -> 4197, 2033115360 -> 4272
    //   4240: putstatic bigname/zprestige/webhack/util/EntityUtil.doubleLegOffsetList : [Lnet/minecraft/util/math/Vec3d;
    //   4243: return
    //   4244: aconst_null
    //   4245: athrow
    //   4246: aconst_null
    //   4247: athrow
    //   4248: aconst_null
    //   4249: athrow
    //   4250: aconst_null
    //   4251: athrow
    //   4252: aconst_null
    //   4253: athrow
    //   4254: aconst_null
    //   4255: athrow
    //   4256: aconst_null
    //   4257: athrow
    //   4258: aconst_null
    //   4259: athrow
    //   4260: aconst_null
    //   4261: athrow
    //   4262: aconst_null
    //   4263: athrow
    //   4264: aconst_null
    //   4265: athrow
    //   4266: aconst_null
    //   4267: athrow
    //   4268: aconst_null
    //   4269: athrow
    //   4270: aconst_null
    //   4271: athrow
    //   4272: aconst_null
    //   4273: athrow
    //   4274: aconst_null
    //   4275: athrow
    //   4276: aconst_null
    //   4277: athrow
    //   4278: aconst_null
    //   4279: athrow
    //   4280: aconst_null
    //   4281: athrow
    //   4282: aconst_null
    //   4283: athrow
    //   4284: aconst_null
    //   4285: athrow
    //   4286: aconst_null
    //   4287: athrow
    //   4288: aconst_null
    //   4289: athrow
    //   4290: aconst_null
    //   4291: athrow
    //   4292: aconst_null
    //   4293: athrow
    //   4294: aconst_null
    //   4295: athrow
    //   4296: aconst_null
    //   4297: athrow
    //   4298: aconst_null
    //   4299: athrow
    //   4300: aconst_null
    //   4301: athrow
    //   4302: aconst_null
    //   4303: athrow
    //   4304: aconst_null
    //   4305: athrow
    //   4306: aconst_null
    //   4307: athrow
    //   4308: aconst_null
    //   4309: athrow
    //   4310: aconst_null
    //   4311: athrow
    //   4312: aconst_null
    //   4313: athrow
    //   4314: aconst_null
    //   4315: athrow
    //   4316: aconst_null
    //   4317: athrow
    //   4318: aconst_null
    //   4319: athrow
    //   4320: aconst_null
    //   4321: athrow
  }
  
  public static boolean lambda$getNearbyPlayers$2(EntityPlayer paramEntityPlayer) {
    return Perry1.08(null, (int)80436034L ^ 0x1FC8CA91, paramEntityPlayer);
  }
  
  public static boolean checkCollide() {
    return Perry1.4E(null, (int)-463817816L ^ 0xE430B9AE);
  }
  
  public static boolean holdingWeapon(EntityPlayer paramEntityPlayer) {
    return Perry1.0b(null, (int)885097456L ^ 0x1FAFC023, paramEntityPlayer);
  }
  
  public static boolean isPassive(Entity paramEntity) {
    return Perry1.5W(null, (int)1543522569L ^ 0x3981015B, paramEntity);
  }
  
  public static boolean isObbyHole(BlockPos paramBlockPos) {
    return Perry1.6l(null, (int)-2137645909L ^ 0xE7699AE1, paramBlockPos);
  }
  
  public static boolean isBothHole(BlockPos paramBlockPos) {
    return Perry1.6h(null, (int)-1146623625L ^ 0x9ABAEE82, paramBlockPos);
  }
  
  public static Vec3d getInterpolatedAmount(Entity paramEntity, float paramFloat) {
    return Perry1.L(null, (int)2118696549L ^ 0x1A4C7F22, paramEntity, paramFloat);
  }
  
  public static List getTrapOffsetsList(boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop) {
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
  
  public static boolean isntValid(Entity entity, double range) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1597
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1589
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1581
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1266742287
    //   33: l2i
    //   34: ldc_w -699804608
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 317197953
    //   44: l2i
    //   45: ldc_w 850715040
    //   48: ixor
    //   49: ldc2_w 1819855218
    //   52: l2i
    //   53: ldc_w -1165334612
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1544, -156352001 -> 84, 1262194321 -> 41
    //   84: aload_0
    //   85: ifnull -> 99
    //   88: ldc2_w -666388320
    //   91: l2i
    //   92: ldc_w 1635002974
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w -1428258759
    //   102: l2i
    //   103: ldc_w 334303942
    //   106: ixor
    //   107: ldc2_w -76769233
    //   110: l2i
    //   111: ldc_w 1930903193
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, 826815560 -> 140, 826815561 -> 1516
    //   140: getstatic Perryc.1 : I
    //   143: ifeq -> 157
    //   146: ldc2_w 1916345092
    //   149: l2i
    //   150: ldc_w -93515036
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w -473363271
    //   160: l2i
    //   161: ldc_w 285753991
    //   164: ixor
    //   165: ldc2_w -45496692
    //   168: l2i
    //   169: ldc_w 827615595
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -2116534836 -> 157, 1145677319 -> 1542
    //   200: aload_0
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 218
    //   207: ldc2_w -808912852
    //   210: l2i
    //   211: ldc_w 1447384242
    //   214: ixor
    //   215: goto -> 226
    //   218: ldc2_w 957957575
    //   221: l2i
    //   222: ldc_w 1371889858
    //   225: ixor
    //   226: ldc2_w 721297490
    //   229: l2i
    //   230: ldc_w 1101179665
    //   233: ixor
    //   234: ixor
    //   235: lookupswitch default -> 260, -544275582 -> 218, -221173795 -> 1552
    //   260: goto -> 264
    //   263: athrow
    //   264: invokestatic isDead : (Lnet/minecraft/entity/Entity;)Z
    //   267: goto -> 271
    //   270: athrow
    //   271: ifne -> 285
    //   274: ldc2_w 1485541339
    //   277: l2i
    //   278: ldc_w -522802570
    //   281: ixor
    //   282: goto -> 293
    //   285: ldc2_w -407612661
    //   288: l2i
    //   289: ldc_w 1609135781
    //   292: ixor
    //   293: ldc2_w 1410156147
    //   296: l2i
    //   297: ldc_w -1909627673
    //   300: ixor
    //   301: ixor
    //   302: tableswitch default -> 274, 1652361017 -> 324, 1652361018 -> 1516
    //   324: getstatic Perryc.0 : I
    //   327: ifle -> 341
    //   330: ldc2_w 1265126600
    //   333: l2i
    //   334: ldc_w 1328288245
    //   337: ixor
    //   338: goto -> 349
    //   341: ldc2_w -1424109838
    //   344: l2i
    //   345: ldc_w 1168882050
    //   348: ixor
    //   349: ldc2_w -511712530
    //   352: l2i
    //   353: ldc_w -959883344
    //   356: ixor
    //   357: ixor
    //   358: lookupswitch default -> 384, -1314936289 -> 341, 603121763 -> 1562
    //   384: aload_0
    //   385: getstatic Perryc.c : I
    //   388: iflt -> 402
    //   391: ldc2_w 1129671621
    //   394: l2i
    //   395: ldc_w 670637726
    //   398: ixor
    //   399: goto -> 410
    //   402: ldc2_w -1016563710
    //   405: l2i
    //   406: ldc_w -94867392
    //   409: ixor
    //   410: ldc2_w 323122163
    //   413: l2i
    //   414: ldc_w 498541724
    //   417: ixor
    //   418: ixor
    //   419: lookupswitch default -> 444, 706099076 -> 402, 1784226356 -> 1550
    //   444: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 464
    //   453: ldc2_w -1809925595
    //   456: l2i
    //   457: ldc_w -439801952
    //   460: ixor
    //   461: goto -> 472
    //   464: ldc2_w -773478827
    //   467: l2i
    //   468: ldc_w -313192074
    //   471: ixor
    //   472: ldc2_w 102902988
    //   475: l2i
    //   476: ldc_w 1146984309
    //   479: ixor
    //   480: ixor
    //   481: lookupswitch default -> 1538, 866657852 -> 464, 2127498394 -> 508
    //   508: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   511: getstatic Perryc.c : I
    //   514: iflt -> 528
    //   517: ldc2_w 1710165353
    //   520: l2i
    //   521: ldc_w -20013036
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w 11960029
    //   531: l2i
    //   532: ldc_w 183073344
    //   535: ixor
    //   536: ldc2_w -129223556
    //   539: l2i
    //   540: ldc_w 612729967
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1554, -694766450 -> 572, 1206394222 -> 528
    //   572: goto -> 576
    //   575: athrow
    //   576: invokevirtual equals : (Ljava/lang/Object;)Z
    //   579: goto -> 583
    //   582: athrow
    //   583: ifne -> 597
    //   586: ldc2_w 497284398
    //   589: l2i
    //   590: ldc_w 1239890126
    //   593: ixor
    //   594: goto -> 605
    //   597: ldc2_w -1237438973
    //   600: l2i
    //   601: ldc_w -495262750
    //   604: ixor
    //   605: ldc2_w 435348906
    //   608: l2i
    //   609: ldc_w -450600216
    //   612: ixor
    //   613: ixor
    //   614: tableswitch default -> 586, -1466807646 -> 636, -1466807645 -> 1516
    //   636: getstatic Perryc.1 : I
    //   639: ifeq -> 653
    //   642: ldc2_w -1689010528
    //   645: l2i
    //   646: ldc_w 525540172
    //   649: ixor
    //   650: goto -> 661
    //   653: ldc2_w 650256929
    //   656: l2i
    //   657: ldc_w 1707948431
    //   660: ixor
    //   661: ldc2_w 708377670
    //   664: l2i
    //   665: ldc_w -1830924751
    //   668: ixor
    //   669: ixor
    //   670: lookupswitch default -> 696, 1021712283 -> 1536, 1914394517 -> 653
    //   696: aload_0
    //   697: instanceof net/minecraft/entity/player/EntityPlayer
    //   700: ifeq -> 714
    //   703: ldc2_w -1677939499
    //   706: l2i
    //   707: ldc_w -442346206
    //   710: ixor
    //   711: goto -> 722
    //   714: ldc2_w 1888467545
    //   717: l2i
    //   718: ldc_w 248595375
    //   721: ixor
    //   722: ldc2_w -1337680578
    //   725: l2i
    //   726: ldc_w -2003062369
    //   729: ixor
    //   730: ixor
    //   731: tableswitch default -> 703, 1182913878 -> 752, 1182913879 -> 1072
    //   752: getstatic Perryc.c : I
    //   755: iflt -> 769
    //   758: ldc2_w 1642763140
    //   761: l2i
    //   762: ldc_w -1275625372
    //   765: ixor
    //   766: goto -> 777
    //   769: ldc2_w 1267885545
    //   772: l2i
    //   773: ldc_w 1233274253
    //   776: ixor
    //   777: ldc2_w -999002090
    //   780: l2i
    //   781: ldc_w -411664475
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 812, -249619373 -> 1548, 425473774 -> 769
    //   812: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   815: getstatic Perryc.1 : I
    //   818: ifeq -> 832
    //   821: ldc2_w -1909521926
    //   824: l2i
    //   825: ldc_w 1879576177
    //   828: ixor
    //   829: goto -> 840
    //   832: ldc2_w 928370891
    //   835: l2i
    //   836: ldc_w -2136978880
    //   839: ixor
    //   840: ldc2_w -488407753
    //   843: l2i
    //   844: ldc_w -1872101025
    //   847: ixor
    //   848: ixor
    //   849: lookupswitch default -> 1564, -1934724125 -> 832, -981670173 -> 876
    //   876: aload_0
    //   877: getstatic Perryc.0 : I
    //   880: ifle -> 894
    //   883: ldc2_w 1231038858
    //   886: l2i
    //   887: ldc_w 2135982627
    //   890: ixor
    //   891: goto -> 902
    //   894: ldc2_w -1689992461
    //   897: l2i
    //   898: ldc_w -501927419
    //   901: ixor
    //   902: ldc2_w 1245133707
    //   905: l2i
    //   906: ldc_w 1119086449
    //   909: ixor
    //   910: ixor
    //   911: lookupswitch default -> 1566, 1052014419 -> 894, 1909795852 -> 936
    //   936: goto -> 940
    //   939: athrow
    //   940: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   943: goto -> 947
    //   946: athrow
    //   947: getstatic Perryc.c : I
    //   950: iflt -> 964
    //   953: ldc2_w 518602147
    //   956: l2i
    //   957: ldc_w 2049194225
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 1111297169
    //   967: l2i
    //   968: ldc_w 613575769
    //   971: ixor
    //   972: ldc2_w -108319595
    //   975: l2i
    //   976: ldc_w 856746009
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1556, -1405836220 -> 1008, -1370045986 -> 964
    //   1008: goto -> 1012
    //   1011: athrow
    //   1012: invokevirtual isFriend : (Ljava/lang/String;)Z
    //   1015: goto -> 1019
    //   1018: athrow
    //   1019: ifne -> 1033
    //   1022: ldc2_w 2010040359
    //   1025: l2i
    //   1026: ldc_w 635209895
    //   1029: ixor
    //   1030: goto -> 1041
    //   1033: ldc2_w -52417244
    //   1036: l2i
    //   1037: ldc_w -1359843931
    //   1040: ixor
    //   1041: ldc2_w -1853708302
    //   1044: l2i
    //   1045: ldc_w -1572084644
    //   1048: ixor
    //   1049: ixor
    //   1050: tableswitch default -> 1022, 1641743150 -> 1072, 1641743151 -> 1516
    //   1072: getstatic Perryc.1 : I
    //   1075: ifeq -> 1089
    //   1078: ldc2_w 562039680
    //   1081: l2i
    //   1082: ldc_w 388804913
    //   1085: ixor
    //   1086: goto -> 1097
    //   1089: ldc2_w 1669345260
    //   1092: l2i
    //   1093: ldc_w -2049409319
    //   1096: ixor
    //   1097: ldc2_w -670811090
    //   1100: l2i
    //   1101: ldc_w -2131196765
    //   1104: ixor
    //   1105: ixor
    //   1106: lookupswitch default -> 1540, -1096488520 -> 1132, 1850737212 -> 1089
    //   1132: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1135: getstatic Perryc.1 : I
    //   1138: ifeq -> 1152
    //   1141: ldc2_w -276137777
    //   1144: l2i
    //   1145: ldc_w -1130110082
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w -861846965
    //   1155: l2i
    //   1156: ldc_w -1142503914
    //   1159: ixor
    //   1160: ldc2_w 740311880
    //   1163: l2i
    //   1164: ldc_w -491457050
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 1558, -1648546529 -> 1152, -1177341197 -> 1196
    //   1196: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1199: getstatic Perryc.0 : I
    //   1202: ifle -> 1216
    //   1205: ldc2_w -1801782591
    //   1208: l2i
    //   1209: ldc_w 1044158078
    //   1212: ixor
    //   1213: goto -> 1224
    //   1216: ldc2_w 2118655996
    //   1219: l2i
    //   1220: ldc_w -292240216
    //   1223: ixor
    //   1224: ldc2_w -1350630533
    //   1227: l2i
    //   1228: ldc_w 1966035291
    //   1231: ixor
    //   1232: ixor
    //   1233: lookupswitch default -> 1560, 1250724212 -> 1260, 1895186079 -> 1216
    //   1260: aload_0
    //   1261: getstatic Perryc.1 : I
    //   1264: ifeq -> 1278
    //   1267: ldc2_w -588633235
    //   1270: l2i
    //   1271: ldc_w -724113678
    //   1274: ixor
    //   1275: goto -> 1286
    //   1278: ldc2_w -1559117720
    //   1281: l2i
    //   1282: ldc_w -796854585
    //   1285: ixor
    //   1286: ldc2_w -654277120
    //   1289: l2i
    //   1290: ldc_w 313668029
    //   1293: ixor
    //   1294: ixor
    //   1295: lookupswitch default -> 1320, -1014072798 -> 1568, -165815105 -> 1278
    //   1320: goto -> 1324
    //   1323: athrow
    //   1324: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   1327: goto -> 1331
    //   1330: athrow
    //   1331: getstatic Perryc.0 : I
    //   1334: ifle -> 1348
    //   1337: ldc2_w -1101908506
    //   1340: l2i
    //   1341: ldc_w 873741012
    //   1344: ixor
    //   1345: goto -> 1356
    //   1348: ldc2_w 2117524613
    //   1351: l2i
    //   1352: ldc_w -1321165924
    //   1355: ixor
    //   1356: ldc2_w 633505461
    //   1359: l2i
    //   1360: ldc_w 1605768276
    //   1363: ixor
    //   1364: ixor
    //   1365: lookupswitch default -> 1392, -265118253 -> 1546, 962387373 -> 1348
    //   1392: dload_1
    //   1393: getstatic Perryc.0 : I
    //   1396: ifle -> 1410
    //   1399: ldc2_w -225970003
    //   1402: l2i
    //   1403: ldc_w 729176069
    //   1406: ixor
    //   1407: goto -> 1418
    //   1410: ldc2_w 975731595
    //   1413: l2i
    //   1414: ldc_w -1924719896
    //   1417: ixor
    //   1418: ldc2_w 1600393796
    //   1421: l2i
    //   1422: ldc_w -206294005
    //   1425: ixor
    //   1426: ixor
    //   1427: lookupswitch default -> 1570, 465520428 -> 1452, 1965131495 -> 1410
    //   1452: goto -> 1456
    //   1455: athrow
    //   1456: invokestatic square : (D)D
    //   1459: goto -> 1463
    //   1462: athrow
    //   1463: dcmpl
    //   1464: ifle -> 1478
    //   1467: ldc2_w -819184040
    //   1470: l2i
    //   1471: ldc_w 6101777
    //   1474: ixor
    //   1475: goto -> 1486
    //   1478: ldc2_w -1920052264
    //   1481: l2i
    //   1482: ldc_w 1124038288
    //   1485: ixor
    //   1486: ldc2_w 413249443
    //   1489: l2i
    //   1490: ldc_w -1803442418
    //   1493: ixor
    //   1494: ixor
    //   1495: tableswitch default -> 1467, 1129393636 -> 1516, 1129393637 -> 1527
    //   1516: ldc2_w 1129923054
    //   1519: l2i
    //   1520: ldc_w 1129923055
    //   1523: ixor
    //   1524: goto -> 1535
    //   1527: ldc2_w 1055686012
    //   1530: l2i
    //   1531: ldc_w 1055686012
    //   1534: ixor
    //   1535: ireturn
    //   1536: aconst_null
    //   1537: athrow
    //   1538: aconst_null
    //   1539: athrow
    //   1540: aconst_null
    //   1541: athrow
    //   1542: aconst_null
    //   1543: athrow
    //   1544: aconst_null
    //   1545: athrow
    //   1546: aconst_null
    //   1547: athrow
    //   1548: aconst_null
    //   1549: athrow
    //   1550: aconst_null
    //   1551: athrow
    //   1552: aconst_null
    //   1553: athrow
    //   1554: aconst_null
    //   1555: athrow
    //   1556: aconst_null
    //   1557: athrow
    //   1558: aconst_null
    //   1559: athrow
    //   1560: aconst_null
    //   1561: athrow
    //   1562: aconst_null
    //   1563: athrow
    //   1564: aconst_null
    //   1565: athrow
    //   1566: aconst_null
    //   1567: athrow
    //   1568: aconst_null
    //   1569: athrow
    //   1570: aconst_null
    //   1571: athrow
    //   1572: pop
    //   1573: goto -> 24
    //   1576: pop
    //   1577: aconst_null
    //   1578: goto -> 1572
    //   1581: dup
    //   1582: ifnull -> 1572
    //   1585: checkcast java/lang/Throwable
    //   1588: athrow
    //   1589: dup
    //   1590: ifnull -> 1576
    //   1593: checkcast java/lang/Throwable
    //   1596: athrow
    //   1597: aconst_null
    //   1598: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1512	0	entity	Lnet/minecraft/entity/Entity;
    //   24	1512	1	range	D
    // Exception table:
    //   from	to	target	type
    //   8	20	1581	finally
    //   263	270	270	finally
    //   263	270	263	java/lang/UnsupportedOperationException
    //   263	270	270	java/lang/StringIndexOutOfBoundsException
    //   264	270	3	finally
    //   264	270	270	finally
    //   575	582	582	finally
    //   575	582	575	finally
    //   575	582	3	java/lang/ClassCastException
    //   576	582	582	finally
    //   576	582	3	java/lang/UnsupportedOperationException
    //   939	946	946	finally
    //   939	946	3	finally
    //   939	946	939	finally
    //   940	946	3	java/lang/ClassCastException
    //   940	946	939	java/lang/IndexOutOfBoundsException
    //   1011	1018	1018	finally
    //   1011	1018	1011	finally
    //   1011	1018	3	java/lang/StringIndexOutOfBoundsException
    //   1012	1018	1011	java/lang/ArithmeticException
    //   1012	1018	1018	java/lang/NumberFormatException
    //   1323	1330	1330	finally
    //   1323	1330	1323	finally
    //   1324	1330	1323	finally
    //   1324	1330	1330	java/util/NoSuchElementException
    //   1324	1330	3	java/util/ConcurrentModificationException
    //   1455	1462	1462	finally
    //   1455	1462	1462	java/lang/AssertionError
    //   1456	1462	3	java/lang/AssertionError
    //   1456	1462	1455	finally
    //   1456	1462	3	finally
    //   1581	1589	1581	java/lang/IndexOutOfBoundsException
    //   1597	1599	3	finally
  }
  
  public static BlockPos getRoundedBlockPos(Entity entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 345
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 337
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 329
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -246278259
    //   37: l2i
    //   38: ldc_w -872987593
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1249576889
    //   48: l2i
    //   49: ldc_w 882703904
    //   52: ixor
    //   53: ldc2_w -1190385926
    //   56: l2i
    //   57: ldc_w -1664550178
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, 526487454 -> 316, 1902134166 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.0 : I
    //   92: ifle -> 106
    //   95: ldc2_w 153372102
    //   98: l2i
    //   99: ldc_w -1072718179
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -1742245502
    //   109: l2i
    //   110: ldc_w 1536014103
    //   113: ixor
    //   114: ldc2_w 1480495713
    //   117: l2i
    //   118: ldc_w 1229060843
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -665537583 -> 312, 401174220 -> 106
    //   148: goto -> 152
    //   151: athrow
    //   152: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   155: goto -> 159
    //   158: athrow
    //   159: ldc2_w 1218902715
    //   162: l2i
    //   163: ldc_w 1218902715
    //   166: ixor
    //   167: getstatic Perryc.c : I
    //   170: iflt -> 184
    //   173: ldc2_w 1596958626
    //   176: l2i
    //   177: ldc_w 900507464
    //   180: ixor
    //   181: goto -> 192
    //   184: ldc2_w -856436517
    //   187: l2i
    //   188: ldc_w -767238013
    //   191: ixor
    //   192: ldc2_w 188442197
    //   195: l2i
    //   196: ldc_w 1372294959
    //   199: ixor
    //   200: ixor
    //   201: lookupswitch default -> 314, 812902800 -> 184, 1145559330 -> 228
    //   228: goto -> 232
    //   231: athrow
    //   232: invokestatic roundVec : (Lnet/minecraft/util/math/Vec3d;I)Lnet/minecraft/util/math/Vec3d;
    //   235: goto -> 239
    //   238: athrow
    //   239: getstatic Perryc.c : I
    //   242: iflt -> 256
    //   245: ldc2_w -1214665921
    //   248: l2i
    //   249: ldc_w 1391103700
    //   252: ixor
    //   253: goto -> 264
    //   256: ldc2_w -1810854363
    //   259: l2i
    //   260: ldc_w -1570259683
    //   263: ixor
    //   264: ldc2_w -1709144932
    //   267: l2i
    //   268: ldc_w -1795232564
    //   271: ixor
    //   272: ixor
    //   273: lookupswitch default -> 318, -340963909 -> 256, 950623080 -> 300
    //   300: goto -> 304
    //   303: athrow
    //   304: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   307: goto -> 311
    //   310: athrow
    //   311: areturn
    //   312: aconst_null
    //   313: athrow
    //   314: aconst_null
    //   315: athrow
    //   316: aconst_null
    //   317: athrow
    //   318: aconst_null
    //   319: athrow
    //   320: pop
    //   321: goto -> 24
    //   324: pop
    //   325: aconst_null
    //   326: goto -> 320
    //   329: dup
    //   330: ifnull -> 320
    //   333: checkcast java/lang/Throwable
    //   336: athrow
    //   337: dup
    //   338: ifnull -> 324
    //   341: checkcast java/lang/Throwable
    //   344: athrow
    //   345: aconst_null
    //   346: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	288	0	entity	Lnet/minecraft/entity/Entity;
    // Exception table:
    //   from	to	target	type
    //   8	20	329	finally
    //   151	158	158	finally
    //   151	158	3	finally
    //   151	158	158	java/lang/ArrayIndexOutOfBoundsException
    //   152	158	158	java/lang/NullPointerException
    //   152	158	151	java/lang/UnsupportedOperationException
    //   231	238	238	finally
    //   231	238	238	java/lang/NumberFormatException
    //   231	238	231	java/lang/UnsupportedOperationException
    //   232	238	3	finally
    //   232	238	238	java/lang/ArithmeticException
    //   303	310	310	finally
    //   303	310	310	java/lang/EnumConstantNotPresentException
    //   304	310	310	finally
    //   304	310	303	java/util/NoSuchElementException
    //   304	310	303	finally
    //   329	337	329	finally
    //   345	347	3	java/lang/IndexOutOfBoundsException
  }
  
  public static Vec3d[] getUnsafeBlockArray(Entity paramEntity, int paramInt, boolean paramBoolean) {
    return Perry1.0j(null, (int)2032876184L ^ 0x6D03234B, paramEntity, paramInt, paramBoolean);
  }
  
  public static void swingArmNoPacket(EnumHand hand, EntityLivingBase entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2037
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2029
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2021
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 698618688
    //   33: l2i
    //   34: ldc_w 2079802108
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -828282345
    //   44: l2i
    //   45: ldc_w 1040958940
    //   48: ixor
    //   49: ldc2_w -2034510014
    //   52: l2i
    //   53: ldc_w -2037512443
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 149352325 -> 41, 1382449659 -> 1966
    //   84: aload_1
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 885119468
    //   94: l2i
    //   95: ldc_w -291066898
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 2081310577
    //   105: l2i
    //   106: ldc_w 877920889
    //   109: ixor
    //   110: ldc2_w 1929687598
    //   113: l2i
    //   114: ldc_w 193986364
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2004, -1561575664 -> 102, 819005466 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 162
    //   151: ldc2_w 240668285
    //   154: l2i
    //   155: ldc_w -1170082297
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 948697013
    //   165: l2i
    //   166: ldc_w -555986470
    //   169: ixor
    //   170: ldc2_w 1706542786
    //   173: l2i
    //   174: ldc_w 1074037902
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, -1851065802 -> 1984, -171279350 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w 81711
    //   224: l2i
    //   225: ldc_w 1450348142
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1224796470
    //   235: l2i
    //   236: ldc_w -260850114
    //   239: ixor
    //   240: ldc2_w -2032184995
    //   243: l2i
    //   244: ldc_w -911319471
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 1962, 167618552 -> 276, 419610189 -> 232
    //   276: astore_2
    //   277: getstatic Perryc.c : I
    //   280: iflt -> 294
    //   283: ldc2_w 1206085346
    //   286: l2i
    //   287: ldc_w 437706792
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w -1722817908
    //   297: l2i
    //   298: ldc_w -324922472
    //   301: ixor
    //   302: ldc2_w -1374323010
    //   305: l2i
    //   306: ldc_w -1710862231
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 336, -685776826 -> 294, 1776723997 -> 2006
    //   336: aload_2
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w -2058905279
    //   346: l2i
    //   347: ldc_w -1720582019
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -104961205
    //   357: l2i
    //   358: ldc_w 1146541918
    //   361: ixor
    //   362: ldc2_w 733031465
    //   365: l2i
    //   366: ldc_w -81661032
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 1960, -861583731 -> 354, 1836606372 -> 396
    //   396: goto -> 400
    //   399: athrow
    //   400: invokevirtual func_190926_b : ()Z
    //   403: goto -> 407
    //   406: athrow
    //   407: ifne -> 421
    //   410: ldc2_w 1938663660
    //   413: l2i
    //   414: ldc_w -1921411570
    //   417: ixor
    //   418: goto -> 429
    //   421: ldc2_w -1734414885
    //   424: l2i
    //   425: ldc_w 1718276922
    //   428: ixor
    //   429: ldc2_w -1430413672
    //   432: l2i
    //   433: ldc_w 1323177243
    //   436: ixor
    //   437: ixor
    //   438: tableswitch default -> 410, 446149985 -> 460, 446149986 -> 837
    //   460: getstatic Perryc.c : I
    //   463: iflt -> 477
    //   466: ldc2_w -762008743
    //   469: l2i
    //   470: ldc_w 889288305
    //   473: ixor
    //   474: goto -> 485
    //   477: ldc2_w -1523163318
    //   480: l2i
    //   481: ldc_w -648640420
    //   484: ixor
    //   485: ldc2_w -660455851
    //   488: l2i
    //   489: ldc_w -1492597032
    //   492: ixor
    //   493: ixor
    //   494: lookupswitch default -> 1988, -1740692059 -> 477, 63582107 -> 520
    //   520: aload_2
    //   521: getstatic Perryc.1 : I
    //   524: ifeq -> 538
    //   527: ldc2_w -1345101480
    //   530: l2i
    //   531: ldc_w -780410458
    //   534: ixor
    //   535: goto -> 546
    //   538: ldc2_w -2054878017
    //   541: l2i
    //   542: ldc_w -2036412257
    //   545: ixor
    //   546: ldc2_w 843453600
    //   549: l2i
    //   550: ldc_w -1564791843
    //   553: ixor
    //   554: ixor
    //   555: lookupswitch default -> 580, -699433027 -> 538, -296370301 -> 1982
    //   580: goto -> 584
    //   583: athrow
    //   584: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   587: goto -> 591
    //   590: athrow
    //   591: getstatic Perryc.1 : I
    //   594: ifeq -> 608
    //   597: ldc2_w 1312027770
    //   600: l2i
    //   601: ldc_w 150930458
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 1668722286
    //   611: l2i
    //   612: ldc_w 1460477387
    //   615: ixor
    //   616: ldc2_w 715910007
    //   619: l2i
    //   620: ldc_w 270071202
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 652, 548706690 -> 608, 2088758965 -> 2000
    //   652: aload_1
    //   653: getstatic Perryc.0 : I
    //   656: ifle -> 670
    //   659: ldc2_w -100376926
    //   662: l2i
    //   663: ldc_w 1332120863
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w 817681521
    //   673: l2i
    //   674: ldc_w 1088568956
    //   677: ixor
    //   678: ldc2_w 1811808015
    //   681: l2i
    //   682: ldc_w -1428457582
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 2008, -1317510512 -> 712, 1950636832 -> 670
    //   712: aload_2
    //   713: getstatic Perryc.0 : I
    //   716: ifle -> 730
    //   719: ldc2_w -958479941
    //   722: l2i
    //   723: ldc_w -1806742156
    //   726: ixor
    //   727: goto -> 738
    //   730: ldc2_w -1702404023
    //   733: l2i
    //   734: ldc_w 80739232
    //   737: ixor
    //   738: ldc2_w -829032742
    //   741: l2i
    //   742: ldc_w 818593627
    //   745: ixor
    //   746: ixor
    //   747: lookupswitch default -> 1994, -1395735218 -> 730, 1612173928 -> 772
    //   772: goto -> 776
    //   775: athrow
    //   776: invokevirtual onEntitySwing : (Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)Z
    //   779: goto -> 783
    //   782: athrow
    //   783: ifeq -> 797
    //   786: ldc2_w 1578381565
    //   789: l2i
    //   790: ldc_w 643883480
    //   793: ixor
    //   794: goto -> 805
    //   797: ldc2_w -1652639090
    //   800: l2i
    //   801: ldc_w -452301910
    //   804: ixor
    //   805: ldc2_w -1810164724
    //   808: l2i
    //   809: ldc_w 354431559
    //   812: ixor
    //   813: ixor
    //   814: tableswitch default -> 786, -112199826 -> 836, -112199825 -> 837
    //   836: return
    //   837: getstatic Perryc.1 : I
    //   840: ifeq -> 854
    //   843: ldc2_w 259880612
    //   846: l2i
    //   847: ldc_w 1079576461
    //   850: ixor
    //   851: goto -> 862
    //   854: ldc2_w -1568031914
    //   857: l2i
    //   858: ldc_w -1090206863
    //   861: ixor
    //   862: ldc2_w -1824218248
    //   865: l2i
    //   866: ldc_w 1326628958
    //   869: ixor
    //   870: ixor
    //   871: lookupswitch default -> 896, -2079741123 -> 854, -1821240817 -> 2002
    //   896: aload_1
    //   897: getstatic Perryc.1 : I
    //   900: ifeq -> 914
    //   903: ldc2_w -1272390733
    //   906: l2i
    //   907: ldc_w -70412741
    //   910: ixor
    //   911: goto -> 922
    //   914: ldc2_w -1468802303
    //   917: l2i
    //   918: ldc_w -1980487955
    //   921: ixor
    //   922: ldc2_w 278438280
    //   925: l2i
    //   926: ldc_w -369500833
    //   929: ixor
    //   930: ixor
    //   931: lookupswitch default -> 1998, -1232850593 -> 914, -655982277 -> 956
    //   956: getfield field_82175_bq : Z
    //   959: ifeq -> 973
    //   962: ldc2_w 193005814
    //   965: l2i
    //   966: ldc_w -481468474
    //   969: ixor
    //   970: goto -> 981
    //   973: ldc2_w -1244782583
    //   976: l2i
    //   977: ldc_w 1560442680
    //   980: ixor
    //   981: ldc2_w -1414548890
    //   984: l2i
    //   985: ldc_w 845127282
    //   988: ixor
    //   989: ixor
    //   990: tableswitch default -> 962, 1899789092 -> 1012, 1899789093 -> 1512
    //   1012: getstatic Perryc.0 : I
    //   1015: ifle -> 1029
    //   1018: ldc2_w -597445958
    //   1021: l2i
    //   1022: ldc_w -1240891667
    //   1025: ixor
    //   1026: goto -> 1037
    //   1029: ldc2_w 1888857536
    //   1032: l2i
    //   1033: ldc_w 1907261395
    //   1036: ixor
    //   1037: ldc2_w 1761201941
    //   1040: l2i
    //   1041: ldc_w -951610499
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 1964, -1366978949 -> 1072, -975925185 -> 1029
    //   1072: aload_1
    //   1073: getstatic Perryc.c : I
    //   1076: iflt -> 1090
    //   1079: ldc2_w -1327224500
    //   1082: l2i
    //   1083: ldc_w 473266122
    //   1086: ixor
    //   1087: goto -> 1098
    //   1090: ldc2_w 697167138
    //   1093: l2i
    //   1094: ldc_w -1359998386
    //   1097: ixor
    //   1098: ldc2_w -812829905
    //   1101: l2i
    //   1102: ldc_w 674584005
    //   1105: ixor
    //   1106: ixor
    //   1107: lookupswitch default -> 1132, -1110527295 -> 1090, 1265186924 -> 1970
    //   1132: getfield field_110158_av : I
    //   1135: getstatic Perryc.c : I
    //   1138: iflt -> 1152
    //   1141: ldc2_w 1287141299
    //   1144: l2i
    //   1145: ldc_w -1020030707
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w -245906710
    //   1155: l2i
    //   1156: ldc_w -648403390
    //   1159: ixor
    //   1160: ldc2_w 1385283347
    //   1163: l2i
    //   1164: ldc_w -304522735
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 1990, -1757085270 -> 1196, 818103228 -> 1152
    //   1196: aload_1
    //   1197: checkcast bigname/zprestige/webhack/mixin/mixins/IEntityLivingBase
    //   1200: getstatic Perryc.c : I
    //   1203: iflt -> 1217
    //   1206: ldc2_w -183939679
    //   1209: l2i
    //   1210: ldc_w 1851525309
    //   1213: ixor
    //   1214: goto -> 1225
    //   1217: ldc2_w 199072449
    //   1220: l2i
    //   1221: ldc_w -688938315
    //   1224: ixor
    //   1225: ldc2_w 1546463620
    //   1228: l2i
    //   1229: ldc_w 1472752506
    //   1232: ixor
    //   1233: ixor
    //   1234: lookupswitch default -> 1972, -1867511838 -> 1217, -690521462 -> 1260
    //   1260: goto -> 1264
    //   1263: athrow
    //   1264: invokeinterface getArmSwingAnimationEnd : ()I
    //   1269: goto -> 1273
    //   1272: athrow
    //   1273: ldc2_w 1699628424
    //   1276: l2i
    //   1277: ldc_w 1699628426
    //   1280: ixor
    //   1281: idiv
    //   1282: if_icmpge -> 1296
    //   1285: ldc2_w -1840452227
    //   1288: l2i
    //   1289: ldc_w 551659628
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w -1304865538
    //   1299: l2i
    //   1300: ldc_w 9703918
    //   1303: ixor
    //   1304: ldc2_w -248970849
    //   1307: l2i
    //   1308: ldc_w 2090807174
    //   1311: ixor
    //   1312: ixor
    //   1313: tableswitch default -> 1285, 1058761480 -> 1336, 1058761481 -> 1512
    //   1336: getstatic Perryc.c : I
    //   1339: iflt -> 1353
    //   1342: ldc2_w -1328260711
    //   1345: l2i
    //   1346: ldc_w -1255686033
    //   1349: ixor
    //   1350: goto -> 1361
    //   1353: ldc2_w -838786518
    //   1356: l2i
    //   1357: ldc_w -901576541
    //   1360: ixor
    //   1361: ldc2_w 434241724
    //   1364: l2i
    //   1365: ldc_w 2135094880
    //   1368: ixor
    //   1369: ixor
    //   1370: lookupswitch default -> 1396, 1054629273 -> 1353, 1666412330 -> 1968
    //   1396: aload_1
    //   1397: getstatic Perryc.1 : I
    //   1400: ifeq -> 1414
    //   1403: ldc2_w 1386372772
    //   1406: l2i
    //   1407: ldc_w -685579057
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w 535797199
    //   1417: l2i
    //   1418: ldc_w -579102492
    //   1421: ixor
    //   1422: ldc2_w -124358450
    //   1425: l2i
    //   1426: ldc_w 1948400543
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1976, 154464570 -> 1414, 1310740090 -> 1456
    //   1456: getfield field_110158_av : I
    //   1459: ifge -> 1473
    //   1462: ldc2_w -1029054055
    //   1465: l2i
    //   1466: ldc_w -507961843
    //   1469: ixor
    //   1470: goto -> 1481
    //   1473: ldc2_w -909494754
    //   1476: l2i
    //   1477: ldc_w -354760309
    //   1480: ixor
    //   1481: ldc2_w -1057073165
    //   1484: l2i
    //   1485: ldc_w -223830195
    //   1488: ixor
    //   1489: ixor
    //   1490: tableswitch default -> 1462, 289814314 -> 1512, 289814315 -> 1959
    //   1512: getstatic Perryc.0 : I
    //   1515: ifle -> 1529
    //   1518: ldc2_w -480470095
    //   1521: l2i
    //   1522: ldc_w -715491147
    //   1525: ixor
    //   1526: goto -> 1537
    //   1529: ldc2_w 1486887019
    //   1532: l2i
    //   1533: ldc_w 1356767883
    //   1536: ixor
    //   1537: ldc2_w 882328754
    //   1540: l2i
    //   1541: ldc_w 1511430237
    //   1544: ixor
    //   1545: ixor
    //   1546: lookupswitch default -> 2010, 1485258731 -> 1529, 1728013839 -> 1572
    //   1572: aload_1
    //   1573: ldc2_w 798664812
    //   1576: l2i
    //   1577: ldc_w -798664813
    //   1580: ixor
    //   1581: getstatic Perryc.1 : I
    //   1584: ifeq -> 1598
    //   1587: ldc2_w 560936263
    //   1590: l2i
    //   1591: ldc_w -826674791
    //   1594: ixor
    //   1595: goto -> 1606
    //   1598: ldc2_w 20989908
    //   1601: l2i
    //   1602: ldc_w -1279180790
    //   1605: ixor
    //   1606: ldc2_w -261058529
    //   1609: l2i
    //   1610: ldc_w 109399086
    //   1613: ixor
    //   1614: ixor
    //   1615: lookupswitch default -> 1992, 421730543 -> 1598, 1148509167 -> 1640
    //   1640: putfield field_110158_av : I
    //   1643: getstatic Perryc.c : I
    //   1646: iflt -> 1660
    //   1649: ldc2_w -1720587499
    //   1652: l2i
    //   1653: ldc_w 514360667
    //   1656: ixor
    //   1657: goto -> 1668
    //   1660: ldc2_w 606413678
    //   1663: l2i
    //   1664: ldc_w -1714263947
    //   1667: ixor
    //   1668: ldc2_w -1568970032
    //   1671: l2i
    //   1672: ldc_w 880367892
    //   1675: ixor
    //   1676: ixor
    //   1677: lookupswitch default -> 1704, -286145836 -> 1660, 299589002 -> 1986
    //   1704: aload_1
    //   1705: ldc2_w 669090452
    //   1708: l2i
    //   1709: ldc_w 669090453
    //   1712: ixor
    //   1713: getstatic Perryc.0 : I
    //   1716: ifle -> 1730
    //   1719: ldc2_w -836908189
    //   1722: l2i
    //   1723: ldc_w -1482700619
    //   1726: ixor
    //   1727: goto -> 1738
    //   1730: ldc2_w 1038933967
    //   1733: l2i
    //   1734: ldc_w 758372220
    //   1737: ixor
    //   1738: ldc2_w 160308787
    //   1741: l2i
    //   1742: ldc_w 1910519529
    //   1745: ixor
    //   1746: ixor
    //   1747: lookupswitch default -> 1772, -1519258095 -> 1730, 300690188 -> 1980
    //   1772: putfield field_82175_bq : Z
    //   1775: getstatic Perryc.c : I
    //   1778: iflt -> 1792
    //   1781: ldc2_w 381141208
    //   1784: l2i
    //   1785: ldc_w 126640351
    //   1788: ixor
    //   1789: goto -> 1800
    //   1792: ldc2_w -508873187
    //   1795: l2i
    //   1796: ldc_w 1623653523
    //   1799: ixor
    //   1800: ldc2_w 1522165198
    //   1803: l2i
    //   1804: ldc_w -491916194
    //   1807: ixor
    //   1808: ixor
    //   1809: lookupswitch default -> 1836, -1456721513 -> 1978, 1427957884 -> 1792
    //   1836: aload_1
    //   1837: getstatic Perryc.1 : I
    //   1840: ifeq -> 1854
    //   1843: ldc2_w -1266382381
    //   1846: l2i
    //   1847: ldc_w -1821850474
    //   1850: ixor
    //   1851: goto -> 1862
    //   1854: ldc2_w 2121112110
    //   1857: l2i
    //   1858: ldc_w -189203889
    //   1861: ixor
    //   1862: ldc2_w 1619776882
    //   1865: l2i
    //   1866: ldc_w 427536896
    //   1869: ixor
    //   1870: ixor
    //   1871: lookupswitch default -> 1996, -215677165 -> 1896, 1578904119 -> 1854
    //   1896: aload_0
    //   1897: getstatic Perryc.0 : I
    //   1900: ifle -> 1914
    //   1903: ldc2_w 1348819455
    //   1906: l2i
    //   1907: ldc_w 204143939
    //   1910: ixor
    //   1911: goto -> 1922
    //   1914: ldc2_w -735250463
    //   1917: l2i
    //   1918: ldc_w 466793375
    //   1921: ixor
    //   1922: ldc2_w 851864563
    //   1925: l2i
    //   1926: ldc_w 628529250
    //   1929: ixor
    //   1930: ixor
    //   1931: lookupswitch default -> 1956, -146611260 -> 1914, 1275025197 -> 1974
    //   1956: putfield field_184622_au : Lnet/minecraft/util/EnumHand;
    //   1959: return
    //   1960: aconst_null
    //   1961: athrow
    //   1962: aconst_null
    //   1963: athrow
    //   1964: aconst_null
    //   1965: athrow
    //   1966: aconst_null
    //   1967: athrow
    //   1968: aconst_null
    //   1969: athrow
    //   1970: aconst_null
    //   1971: athrow
    //   1972: aconst_null
    //   1973: athrow
    //   1974: aconst_null
    //   1975: athrow
    //   1976: aconst_null
    //   1977: athrow
    //   1978: aconst_null
    //   1979: athrow
    //   1980: aconst_null
    //   1981: athrow
    //   1982: aconst_null
    //   1983: athrow
    //   1984: aconst_null
    //   1985: athrow
    //   1986: aconst_null
    //   1987: athrow
    //   1988: aconst_null
    //   1989: athrow
    //   1990: aconst_null
    //   1991: athrow
    //   1992: aconst_null
    //   1993: athrow
    //   1994: aconst_null
    //   1995: athrow
    //   1996: aconst_null
    //   1997: athrow
    //   1998: aconst_null
    //   1999: athrow
    //   2000: aconst_null
    //   2001: athrow
    //   2002: aconst_null
    //   2003: athrow
    //   2004: aconst_null
    //   2005: athrow
    //   2006: aconst_null
    //   2007: athrow
    //   2008: aconst_null
    //   2009: athrow
    //   2010: aconst_null
    //   2011: athrow
    //   2012: pop
    //   2013: goto -> 24
    //   2016: pop
    //   2017: aconst_null
    //   2018: goto -> 2012
    //   2021: dup
    //   2022: ifnull -> 2012
    //   2025: checkcast java/lang/Throwable
    //   2028: athrow
    //   2029: dup
    //   2030: ifnull -> 2016
    //   2033: checkcast java/lang/Throwable
    //   2036: athrow
    //   2037: aconst_null
    //   2038: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1936	0	hand	Lnet/minecraft/util/EnumHand;
    //   24	1936	1	entity	Lnet/minecraft/entity/EntityLivingBase;
    //   277	1683	2	stack	Lnet/minecraft/item/ItemStack;
    // Exception table:
    //   from	to	target	type
    //   8	20	2021	java/lang/StringIndexOutOfBoundsException
    //   207	214	214	finally
    //   207	214	3	finally
    //   207	214	214	java/lang/IndexOutOfBoundsException
    //   208	214	207	java/lang/StringIndexOutOfBoundsException
    //   208	214	3	java/lang/IllegalArgumentException
    //   400	406	406	finally
    //   400	406	406	finally
    //   400	406	3	finally
    //   400	406	3	java/lang/IllegalArgumentException
    //   400	406	406	java/lang/AssertionError
    //   584	590	590	finally
    //   584	590	3	finally
    //   584	590	3	finally
    //   584	590	590	java/lang/NullPointerException
    //   584	590	3	finally
    //   775	782	782	finally
    //   775	782	782	finally
    //   775	782	775	java/lang/ArrayIndexOutOfBoundsException
    //   775	782	775	java/lang/RuntimeException
    //   776	782	775	finally
    //   1263	1272	1272	finally
    //   1263	1272	1272	finally
    //   1264	1272	1263	finally
    //   1264	1272	1263	java/lang/EnumConstantNotPresentException
    //   1264	1272	1272	finally
    //   2021	2029	2021	java/lang/ArithmeticException
    //   2037	2039	3	finally
  }
  
  public static boolean stopSneaking(boolean isSneaking) {
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
  
  public static Vec3d interpolateEntity(Entity entity, float time) {
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
  
  public static double[] calculateLookAt(double paramDouble1, double paramDouble2, double paramDouble3, EntityPlayer paramEntityPlayer) {
    return Perry1.F(null, (int)-72540218L ^ 0xBD3C3271, paramDouble1, paramDouble2, paramDouble3, paramEntityPlayer);
  }
  
  public static boolean isDead(Entity paramEntity) {
    return Perry1.5S(null, (int)-321802997L ^ 0xCA02C15C, paramEntity);
  }
  
  public static Color getColor(Entity entity, int red, int green, int blue, int alpha, boolean colorFriends) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1326
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1318
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1310
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/awt/Color
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 1258150688
    //   37: l2i
    //   38: ldc_w 1584803849
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 853009553
    //   48: l2i
    //   49: ldc_w 180311479
    //   52: ixor
    //   53: ldc2_w -1526240830
    //   56: l2i
    //   57: ldc_w 813711746
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 1289, -2129869975 -> 45, -1376806554 -> 88
    //   88: iload_1
    //   89: i2f
    //   90: ldc_w 0.11795489
    //   93: invokestatic floatToIntBits : (F)I
    //   96: ldc_w 2123272789
    //   99: ixor
    //   100: invokestatic intBitsToFloat : (I)F
    //   103: fdiv
    //   104: getstatic Perryc.1 : I
    //   107: ifeq -> 121
    //   110: ldc2_w 1012972628
    //   113: l2i
    //   114: ldc_w -398466843
    //   117: ixor
    //   118: goto -> 129
    //   121: ldc2_w -729055052
    //   124: l2i
    //   125: ldc_w -974309081
    //   128: ixor
    //   129: ldc2_w 610375591
    //   132: l2i
    //   133: ldc_w 1846314158
    //   136: ixor
    //   137: ixor
    //   138: lookupswitch default -> 164, -1640869960 -> 1291, 1347437179 -> 121
    //   164: iload_2
    //   165: i2f
    //   166: ldc_w 0.010734218
    //   169: invokestatic floatToIntBits : (F)I
    //   172: ldc_w 2136006291
    //   175: ixor
    //   176: invokestatic intBitsToFloat : (I)F
    //   179: fdiv
    //   180: getstatic Perryc.c : I
    //   183: iflt -> 197
    //   186: ldc2_w -1764881078
    //   189: l2i
    //   190: ldc_w 1758328048
    //   193: ixor
    //   194: goto -> 205
    //   197: ldc2_w -27791472
    //   200: l2i
    //   201: ldc_w -1637164674
    //   204: ixor
    //   205: ldc2_w -1760222182
    //   208: l2i
    //   209: ldc_w 1191391136
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1524527463 -> 197, 773190144 -> 1285
    //   240: iload_3
    //   241: i2f
    //   242: ldc_w 0.2544534
    //   245: invokestatic floatToIntBits : (F)I
    //   248: ldc_w 2113750967
    //   251: ixor
    //   252: invokestatic intBitsToFloat : (I)F
    //   255: fdiv
    //   256: getstatic Perryc.0 : I
    //   259: ifle -> 273
    //   262: ldc2_w 1718485401
    //   265: l2i
    //   266: ldc_w -674509686
    //   269: ixor
    //   270: goto -> 281
    //   273: ldc2_w -1303851387
    //   276: l2i
    //   277: ldc_w 237451510
    //   280: ixor
    //   281: ldc2_w -394110424
    //   284: l2i
    //   285: ldc_w 848667658
    //   288: ixor
    //   289: ixor
    //   290: lookupswitch default -> 1277, 1719142481 -> 316, 1806840625 -> 273
    //   316: iload #4
    //   318: i2f
    //   319: ldc_w 0.011417847
    //   322: invokestatic floatToIntBits : (F)I
    //   325: ldc_w 2135167468
    //   328: ixor
    //   329: invokestatic intBitsToFloat : (I)F
    //   332: fdiv
    //   333: getstatic Perryc.c : I
    //   336: iflt -> 350
    //   339: ldc2_w 1883555250
    //   342: l2i
    //   343: ldc_w -477707403
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w -1826418718
    //   353: l2i
    //   354: ldc_w -1673133748
    //   357: ixor
    //   358: ldc2_w -1388645731
    //   361: l2i
    //   362: ldc_w -773892268
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 392, -1385058097 -> 350, -282615026 -> 1287
    //   392: goto -> 396
    //   395: athrow
    //   396: invokespecial <init> : (FFFF)V
    //   399: goto -> 403
    //   402: athrow
    //   403: getstatic Perryc.0 : I
    //   406: ifle -> 420
    //   409: ldc2_w -442121066
    //   412: l2i
    //   413: ldc_w -1789717198
    //   416: ixor
    //   417: goto -> 428
    //   420: ldc2_w -1773386190
    //   423: l2i
    //   424: ldc_w 1568895820
    //   427: ixor
    //   428: ldc2_w -1882399314
    //   431: l2i
    //   432: ldc_w -1725105390
    //   435: ixor
    //   436: ixor
    //   437: lookupswitch default -> 1297, -584117310 -> 464, 1712781080 -> 420
    //   464: astore #6
    //   466: getstatic Perryc.0 : I
    //   469: ifle -> 483
    //   472: ldc2_w 774819680
    //   475: l2i
    //   476: ldc_w -1084479396
    //   479: ixor
    //   480: goto -> 491
    //   483: ldc2_w -1558105956
    //   486: l2i
    //   487: ldc_w -81129552
    //   490: ixor
    //   491: ldc2_w -1404277696
    //   494: l2i
    //   495: ldc_w 1534943379
    //   498: ixor
    //   499: ixor
    //   500: lookupswitch default -> 528, 1715727343 -> 1271, 2125430249 -> 483
    //   528: aload_0
    //   529: instanceof net/minecraft/entity/player/EntityPlayer
    //   532: ifeq -> 546
    //   535: ldc2_w -338874541
    //   538: l2i
    //   539: ldc_w -241296925
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w -338984761
    //   549: l2i
    //   550: ldc_w -241650060
    //   553: ixor
    //   554: ldc2_w 2073819186
    //   557: l2i
    //   558: ldc_w -1058228125
    //   561: ixor
    //   562: ixor
    //   563: tableswitch default -> 535, -1591445791 -> 584, -1591445790 -> 1206
    //   584: getstatic Perryc.c : I
    //   587: iflt -> 601
    //   590: ldc2_w -1186612452
    //   593: l2i
    //   594: ldc_w 1723302578
    //   597: ixor
    //   598: goto -> 609
    //   601: ldc2_w -2077854231
    //   604: l2i
    //   605: ldc_w 1056455303
    //   608: ixor
    //   609: ldc2_w 695333987
    //   612: l2i
    //   613: ldc_w -1317676847
    //   616: ixor
    //   617: ixor
    //   618: lookupswitch default -> 1273, 584737756 -> 644, 1207309596 -> 601
    //   644: iload #5
    //   646: ifeq -> 660
    //   649: ldc2_w -1368796120
    //   652: l2i
    //   653: ldc_w -1706045283
    //   656: ixor
    //   657: goto -> 668
    //   660: ldc2_w -1264918436
    //   663: l2i
    //   664: ldc_w -2135104274
    //   667: ixor
    //   668: ldc2_w 1758731311
    //   671: l2i
    //   672: ldc_w 259139121
    //   675: ixor
    //   676: ixor
    //   677: tableswitch default -> 649, 1400913579 -> 700, 1400913580 -> 1206
    //   700: getstatic Perryc.1 : I
    //   703: ifeq -> 717
    //   706: ldc2_w 652851131
    //   709: l2i
    //   710: ldc_w -1667117781
    //   713: ixor
    //   714: goto -> 725
    //   717: ldc2_w 1370461578
    //   720: l2i
    //   721: ldc_w -520598163
    //   724: ixor
    //   725: ldc2_w -1692603321
    //   728: l2i
    //   729: ldc_w -1433787375
    //   732: ixor
    //   733: ixor
    //   734: lookupswitch default -> 760, -1948339514 -> 1293, -1507021270 -> 717
    //   760: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   763: getstatic Perryc.1 : I
    //   766: ifeq -> 780
    //   769: ldc2_w 1005476547
    //   772: l2i
    //   773: ldc_w 648018673
    //   776: ixor
    //   777: goto -> 788
    //   780: ldc2_w 2049743459
    //   783: l2i
    //   784: ldc_w 1072963679
    //   787: ixor
    //   788: ldc2_w -1611511459
    //   791: l2i
    //   792: ldc_w -467256083
    //   795: ixor
    //   796: ixor
    //   797: lookupswitch default -> 1299, 1041026956 -> 824, 1722144130 -> 780
    //   824: aload_0
    //   825: checkcast net/minecraft/entity/player/EntityPlayer
    //   828: getstatic Perryc.0 : I
    //   831: ifle -> 845
    //   834: ldc2_w -466549909
    //   837: l2i
    //   838: ldc_w 1070223394
    //   841: ixor
    //   842: goto -> 853
    //   845: ldc2_w -702701228
    //   848: l2i
    //   849: ldc_w 1251197807
    //   852: ixor
    //   853: ldc2_w 1447491061
    //   856: l2i
    //   857: ldc_w 443280436
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 888, -1747563896 -> 1279, -678520159 -> 845
    //   888: goto -> 892
    //   891: athrow
    //   892: invokevirtual isFriend : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   895: goto -> 899
    //   898: athrow
    //   899: ifeq -> 913
    //   902: ldc2_w -302910328
    //   905: l2i
    //   906: ldc_w 2032288801
    //   909: ixor
    //   910: goto -> 921
    //   913: ldc2_w -434536649
    //   916: l2i
    //   917: ldc_w 1925894041
    //   920: ixor
    //   921: ldc2_w -1684264928
    //   924: l2i
    //   925: ldc_w -567506622
    //   928: ixor
    //   929: ixor
    //   930: tableswitch default -> 902, -782036533 -> 952, -782036532 -> 1206
    //   952: new java/awt/Color
    //   955: dup
    //   956: ldc_w 31.047338
    //   959: invokestatic floatToIntBits : (F)I
    //   962: ldc_w 2136132184
    //   965: ixor
    //   966: invokestatic intBitsToFloat : (I)F
    //   969: ldc_w 16.88925
    //   972: invokestatic floatToIntBits : (F)I
    //   975: ldc_w 2114395439
    //   978: ixor
    //   979: invokestatic intBitsToFloat : (I)F
    //   982: ldc_w 102.01293
    //   985: invokestatic floatToIntBits : (F)I
    //   988: ldc_w 2102134431
    //   991: ixor
    //   992: invokestatic intBitsToFloat : (I)F
    //   995: getstatic Perryc.1 : I
    //   998: ifeq -> 1012
    //   1001: ldc2_w -1766806220
    //   1004: l2i
    //   1005: ldc_w 613989959
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w -1149453361
    //   1015: l2i
    //   1016: ldc_w 978826270
    //   1019: ixor
    //   1020: ldc2_w -342797457
    //   1023: l2i
    //   1024: ldc_w -875463746
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1056, -1838662750 -> 1295, 79169826 -> 1012
    //   1056: iload #4
    //   1058: i2f
    //   1059: ldc_w 0.011180517
    //   1062: invokestatic floatToIntBits : (F)I
    //   1065: ldc_w 2135436925
    //   1068: ixor
    //   1069: invokestatic intBitsToFloat : (I)F
    //   1072: fdiv
    //   1073: getstatic Perryc.1 : I
    //   1076: ifeq -> 1090
    //   1079: ldc2_w 1756136597
    //   1082: l2i
    //   1083: ldc_w 1476079415
    //   1086: ixor
    //   1087: goto -> 1098
    //   1090: ldc2_w -31542530
    //   1093: l2i
    //   1094: ldc_w -58226561
    //   1097: ixor
    //   1098: ldc2_w -1945739769
    //   1101: l2i
    //   1102: ldc_w -30804413
    //   1105: ixor
    //   1106: ixor
    //   1107: lookupswitch default -> 1275, 1299710950 -> 1090, 1891013317 -> 1132
    //   1132: goto -> 1136
    //   1135: athrow
    //   1136: invokespecial <init> : (FFFF)V
    //   1139: goto -> 1143
    //   1142: athrow
    //   1143: getstatic Perryc.1 : I
    //   1146: ifeq -> 1160
    //   1149: ldc2_w 1879662802
    //   1152: l2i
    //   1153: ldc_w 1394714212
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w -1360163011
    //   1163: l2i
    //   1164: ldc_w 1385951355
    //   1167: ixor
    //   1168: ldc2_w -1802002821
    //   1171: l2i
    //   1172: ldc_w -700211987
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 1283, -1096647216 -> 1204, 1643955232 -> 1160
    //   1204: astore #6
    //   1206: getstatic Perryc.0 : I
    //   1209: ifle -> 1223
    //   1212: ldc2_w -1505084992
    //   1215: l2i
    //   1216: ldc_w -1243256041
    //   1219: ixor
    //   1220: goto -> 1231
    //   1223: ldc2_w 1214994872
    //   1226: l2i
    //   1227: ldc_w -108069164
    //   1230: ixor
    //   1231: ldc2_w 1213829289
    //   1234: l2i
    //   1235: ldc_w 131292279
    //   1238: ixor
    //   1239: ixor
    //   1240: lookupswitch default -> 1281, -26252366 -> 1268, 1545969161 -> 1223
    //   1268: aload #6
    //   1270: areturn
    //   1271: aconst_null
    //   1272: athrow
    //   1273: aconst_null
    //   1274: athrow
    //   1275: aconst_null
    //   1276: athrow
    //   1277: aconst_null
    //   1278: athrow
    //   1279: aconst_null
    //   1280: athrow
    //   1281: aconst_null
    //   1282: athrow
    //   1283: aconst_null
    //   1284: athrow
    //   1285: aconst_null
    //   1286: athrow
    //   1287: aconst_null
    //   1288: athrow
    //   1289: aconst_null
    //   1290: athrow
    //   1291: aconst_null
    //   1292: athrow
    //   1293: aconst_null
    //   1294: athrow
    //   1295: aconst_null
    //   1296: athrow
    //   1297: aconst_null
    //   1298: athrow
    //   1299: aconst_null
    //   1300: athrow
    //   1301: pop
    //   1302: goto -> 24
    //   1305: pop
    //   1306: aconst_null
    //   1307: goto -> 1301
    //   1310: dup
    //   1311: ifnull -> 1301
    //   1314: checkcast java/lang/Throwable
    //   1317: athrow
    //   1318: dup
    //   1319: ifnull -> 1305
    //   1322: checkcast java/lang/Throwable
    //   1325: athrow
    //   1326: aconst_null
    //   1327: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1247	0	entity	Lnet/minecraft/entity/Entity;
    //   24	1247	1	red	I
    //   24	1247	2	green	I
    //   24	1247	3	blue	I
    //   24	1247	4	alpha	I
    //   24	1247	5	colorFriends	Z
    //   466	805	6	color	Ljava/awt/Color;
    // Exception table:
    //   from	to	target	type
    //   8	20	1310	java/lang/AssertionError
    //   395	402	402	finally
    //   395	402	3	finally
    //   395	402	395	java/lang/RuntimeException
    //   396	402	3	java/lang/UnsupportedOperationException
    //   396	402	395	finally
    //   891	898	898	finally
    //   892	898	898	java/lang/NumberFormatException
    //   892	898	898	java/lang/ClassCastException
    //   892	898	891	finally
    //   892	898	891	finally
    //   1135	1142	1142	finally
    //   1135	1142	3	java/lang/UnsupportedOperationException
    //   1135	1142	1135	java/util/NoSuchElementException
    //   1135	1142	3	java/lang/ArrayIndexOutOfBoundsException
    //   1135	1142	1142	finally
    //   1310	1318	1310	java/lang/NumberFormatException
    //   1326	1328	3	finally
  }
  
  public static Vec3d[] getOffsets(int paramInt, boolean paramBoolean) {
    return Perry1.0N(null, (int)481853803L ^ 0x716DBA27, paramInt, paramBoolean);
  }
  
  public static boolean isValid(Entity paramEntity, double paramDouble) {
    return Perry1.14(null, (int)370403937L ^ 0x7DB71DE3, paramEntity, paramDouble);
  }
  
  public static boolean isMobAggressive(Entity paramEntity) {
    return Perry1.5X(null, (int)1279525102L ^ 0x7802E578, paramEntity);
  }
  
  public EntityUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 787492164
    //   9: l2i
    //   10: ldc_w -189045382
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 180972288
    //   20: l2i
    //   21: ldc_w -1180116378
    //   24: ixor
    //   25: ldc2_w -705801986
    //   28: l2i
    //   29: ldc_w -766945068
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 124, -1262044852 -> 60, -571719660 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1714235005
    //   70: l2i
    //   71: ldc_w 935321740
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1483106602
    //   81: l2i
    //   82: ldc_w 1152236775
    //   85: ixor
    //   86: ldc2_w -1360154288
    //   89: l2i
    //   90: ldc_w 813445807
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 126, 821869296 -> 78, 2108008910 -> 120
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/EntityUtil;
  }
  
  public static double getBaseMoveSpeed() {
    return Perry1.2D(null, (int)1215591586L ^ 0xD659902);
  }
  
  public static boolean isAboveWater(Entity entity, boolean packet) {
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
  
  public static BlockPos getPlayerPosWithEntity() {
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
  
  public static boolean isEntityMoving(Entity paramEntity) {
    return Perry1.5P(null, (int)682216666L ^ 0x5333E78B, paramEntity);
  }
  
  public static boolean isSafe(Entity entity, int height, boolean floor, boolean face) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 459
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 451
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 443
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 355785123
    //   33: l2i
    //   34: ldc_w 715697001
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1022674302
    //   44: l2i
    //   45: ldc_w 1786116121
    //   48: ixor
    //   49: ldc2_w 2002227876
    //   52: l2i
    //   53: ldc_w -724403632
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 430, -1676043714 -> 41, -184232557 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 40999210
    //   94: l2i
    //   95: ldc_w 960132695
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 990633529
    //   105: l2i
    //   106: ldc_w 1897449270
    //   109: ixor
    //   110: ldc2_w 664573733
    //   113: l2i
    //   114: ldc_w -170817402
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 428, -1738668372 -> 144, -385421090 -> 102
    //   144: iload_1
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w 1626145981
    //   154: l2i
    //   155: ldc_w -139718447
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 1332013065
    //   165: l2i
    //   166: ldc_w 7247665
    //   169: ixor
    //   170: ldc2_w -1023400509
    //   173: l2i
    //   174: ldc_w -179517111
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, -1592919834 -> 426, -23293209 -> 162
    //   204: iload_2
    //   205: getstatic Perryc.1 : I
    //   208: ifeq -> 222
    //   211: ldc2_w 2069486967
    //   214: l2i
    //   215: ldc_w -1831070907
    //   218: ixor
    //   219: goto -> 230
    //   222: ldc2_w 206218325
    //   225: l2i
    //   226: ldc_w 1120489973
    //   229: ixor
    //   230: ldc2_w -1874314953
    //   233: l2i
    //   234: ldc_w -1760970699
    //   237: ixor
    //   238: ixor
    //   239: lookupswitch default -> 424, -289124560 -> 222, 1237480610 -> 264
    //   264: goto -> 268
    //   267: athrow
    //   268: invokestatic getUnsafeBlocks : (Lnet/minecraft/entity/Entity;IZ)Ljava/util/List;
    //   271: goto -> 275
    //   274: athrow
    //   275: getstatic Perryc.c : I
    //   278: iflt -> 292
    //   281: ldc2_w 1336082020
    //   284: l2i
    //   285: ldc_w -1158967241
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w -362575650
    //   295: l2i
    //   296: ldc_w -820110054
    //   299: ixor
    //   300: ldc2_w -1920056696
    //   303: l2i
    //   304: ldc_w -582087170
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 432, -1517739739 -> 292, 1975376562 -> 336
    //   336: goto -> 340
    //   339: athrow
    //   340: invokeinterface size : ()I
    //   345: goto -> 349
    //   348: athrow
    //   349: ifne -> 363
    //   352: ldc2_w -1346819069
    //   355: l2i
    //   356: ldc_w 1426066115
    //   359: ixor
    //   360: goto -> 371
    //   363: ldc2_w 61198200
    //   366: l2i
    //   367: ldc_w -115545689
    //   370: ixor
    //   371: ldc2_w 1213987145
    //   374: l2i
    //   375: ldc_w -1985391546
    //   378: ixor
    //   379: ixor
    //   380: tableswitch default -> 352, 994806735 -> 404, 994806736 -> 415
    //   404: ldc2_w -1093679239
    //   407: l2i
    //   408: ldc_w -1093679240
    //   411: ixor
    //   412: goto -> 423
    //   415: ldc2_w 576796076
    //   418: l2i
    //   419: ldc_w 576796076
    //   422: ixor
    //   423: ireturn
    //   424: aconst_null
    //   425: athrow
    //   426: aconst_null
    //   427: athrow
    //   428: aconst_null
    //   429: athrow
    //   430: aconst_null
    //   431: athrow
    //   432: aconst_null
    //   433: athrow
    //   434: pop
    //   435: goto -> 24
    //   438: pop
    //   439: aconst_null
    //   440: goto -> 434
    //   443: dup
    //   444: ifnull -> 434
    //   447: checkcast java/lang/Throwable
    //   450: athrow
    //   451: dup
    //   452: ifnull -> 438
    //   455: checkcast java/lang/Throwable
    //   458: athrow
    //   459: aconst_null
    //   460: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	400	0	entity	Lnet/minecraft/entity/Entity;
    //   24	400	1	height	I
    //   24	400	2	floor	Z
    //   24	400	3	face	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	443	java/util/ConcurrentModificationException
    //   267	274	274	finally
    //   267	274	274	java/lang/NegativeArraySizeException
    //   267	274	267	finally
    //   268	274	267	finally
    //   268	274	274	finally
    //   339	348	348	finally
    //   339	348	348	finally
    //   339	348	339	finally
    //   340	348	3	finally
    //   340	348	339	finally
    //   443	451	443	java/lang/ClassCastException
    //   459	461	3	finally
  }
  
  public static boolean isSafe2(Entity paramEntity) {
    return Perry1.5T(null, (int)729950270L ^ 0x1AA06E57, paramEntity);
  }
  
  public static boolean isVehicle(Entity paramEntity) {
    return Perry1.5R(null, (int)-137158759L ^ 0xEEF0D0C3, paramEntity);
  }
  
  public static boolean isLiving(Entity paramEntity) {
    return Perry1.5Q(null, (int)-1361743281L ^ 0xA68BDE4A, paramEntity);
  }
  
  public static Vec3d getInterpolatedAmount(Entity entity, Vec3d vec) {
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
  
  public static boolean isTrappedExtended(int extension, EntityPlayer player, boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop, boolean raytrace) {
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
  
  public static boolean isAboveBlock(Entity paramEntity, BlockPos paramBlockPos) {
    return Perry1.2k(null, (int)-1781419753L ^ 0x9C49D9DC, paramEntity, paramBlockPos);
  }
  
  public static boolean lambda$getNearbyPlayers$0(EntityPlayer paramEntityPlayer) {
    return Perry1.0a(null, (int)308160845L ^ 0x60985494, paramEntityPlayer);
  }
  
  public static Vec3d getInterpolatedRenderPos(Entity paramEntity, float paramFloat) {
    return Perry1.K(null, (int)1319946338L ^ 0x7AED28A2, paramEntity, paramFloat);
  }
  
  public static Map getTextRadarPlayers() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 9081
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 9073
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 9065
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/HashMap
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w -166960016
    //   37: l2i
    //   38: ldc_w 520865702
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1447366276
    //   48: l2i
    //   49: ldc_w -1577298460
    //   52: ixor
    //   53: ldc2_w -1345955982
    //   56: l2i
    //   57: ldc_w 193670417
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 8842, 1296751029 -> 45, 1408508163 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w 1068760134
    //   108: l2i
    //   109: ldc_w 1360529934
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1984780327
    //   119: l2i
    //   120: ldc_w 986277688
    //   123: ixor
    //   124: ldc2_w 554673065
    //   127: l2i
    //   128: ldc_w -994666203
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 8912, -1961702204 -> 116, 1455618669 -> 160
    //   160: astore_0
    //   161: new java/text/DecimalFormat
    //   164: dup
    //   165: ldc_w '첉㍝쳫'
    //   168: getstatic Perryc.c : I
    //   171: iflt -> 185
    //   174: ldc2_w -143406440
    //   177: l2i
    //   178: ldc_w 766263567
    //   181: ixor
    //   182: goto -> 193
    //   185: ldc2_w -527221725
    //   188: l2i
    //   189: ldc_w 477344028
    //   192: ixor
    //   193: ldc2_w -1503217709
    //   196: l2i
    //   197: ldc_w 972099331
    //   200: ixor
    //   201: ixor
    //   202: lookupswitch default -> 228, 814113247 -> 185, 1162359623 -> 9044
    //   228: goto -> 232
    //   231: athrow
    //   232: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   235: goto -> 239
    //   238: athrow
    //   239: getstatic Perryc.c : I
    //   242: iflt -> 256
    //   245: ldc2_w -959501156
    //   248: l2i
    //   249: ldc_w 111089935
    //   252: ixor
    //   253: goto -> 264
    //   256: ldc2_w -1174652170
    //   259: l2i
    //   260: ldc_w -1856044970
    //   263: ixor
    //   264: ldc2_w -987360070
    //   267: l2i
    //   268: ldc_w -697065936
    //   271: ixor
    //   272: ixor
    //   273: lookupswitch default -> 8898, -754598119 -> 256, 1006022698 -> 300
    //   300: goto -> 304
    //   303: athrow
    //   304: invokespecial <init> : (Ljava/lang/String;)V
    //   307: goto -> 311
    //   310: athrow
    //   311: getstatic Perryc.0 : I
    //   314: ifle -> 328
    //   317: ldc2_w -794545732
    //   320: l2i
    //   321: ldc_w -1058881036
    //   324: ixor
    //   325: goto -> 336
    //   328: ldc2_w 1816746887
    //   331: l2i
    //   332: ldc_w 1651847841
    //   335: ixor
    //   336: ldc2_w -2073343034
    //   339: l2i
    //   340: ldc_w -876513341
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 8828, 1100371235 -> 372, 1609354317 -> 328
    //   372: astore_1
    //   373: getstatic Perryc.1 : I
    //   376: ifeq -> 390
    //   379: ldc2_w -566005141
    //   382: l2i
    //   383: ldc_w -284008969
    //   386: ixor
    //   387: goto -> 398
    //   390: ldc2_w 1742324175
    //   393: l2i
    //   394: ldc_w 876265292
    //   397: ixor
    //   398: ldc2_w 2015720231
    //   401: l2i
    //   402: ldc_w -1829444315
    //   405: ixor
    //   406: ixor
    //   407: lookupswitch default -> 432, -612320866 -> 8962, 96632479 -> 390
    //   432: aload_1
    //   433: getstatic Perryc.c : I
    //   436: iflt -> 450
    //   439: ldc2_w 166480944
    //   442: l2i
    //   443: ldc_w 1132401364
    //   446: ixor
    //   447: goto -> 458
    //   450: ldc2_w 806252794
    //   453: l2i
    //   454: ldc_w 1669125233
    //   457: ixor
    //   458: ldc2_w -1039822414
    //   461: l2i
    //   462: ldc_w 57016632
    //   465: ixor
    //   466: ixor
    //   467: lookupswitch default -> 8990, -1947152786 -> 450, -1844366335 -> 492
    //   492: getstatic java/math/RoundingMode.CEILING : Ljava/math/RoundingMode;
    //   495: getstatic Perryc.c : I
    //   498: iflt -> 512
    //   501: ldc2_w 773429107
    //   504: l2i
    //   505: ldc_w -886052290
    //   508: ixor
    //   509: goto -> 520
    //   512: ldc2_w 1535845443
    //   515: l2i
    //   516: ldc_w -1979641586
    //   519: ixor
    //   520: ldc2_w -38620396
    //   523: l2i
    //   524: ldc_w 421624607
    //   527: ixor
    //   528: ixor
    //   529: lookupswitch default -> 556, -1764148693 -> 512, 27637062 -> 8964
    //   556: goto -> 560
    //   559: athrow
    //   560: invokevirtual setRoundingMode : (Ljava/math/RoundingMode;)V
    //   563: goto -> 567
    //   566: athrow
    //   567: new java/text/DecimalFormat
    //   570: dup
    //   571: ldc_w '첉㍝쳫'
    //   574: getstatic Perryc.1 : I
    //   577: ifeq -> 591
    //   580: ldc2_w 1768294706
    //   583: l2i
    //   584: ldc_w 707576387
    //   587: ixor
    //   588: goto -> 599
    //   591: ldc2_w 1832235318
    //   594: l2i
    //   595: ldc_w 1717644551
    //   598: ixor
    //   599: ldc2_w -1004581407
    //   602: l2i
    //   603: ldc_w -195557443
    //   606: ixor
    //   607: ixor
    //   608: lookupswitch default -> 636, 1148569611 -> 591, 1930264877 -> 8904
    //   636: goto -> 640
    //   639: athrow
    //   640: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   643: goto -> 647
    //   646: athrow
    //   647: getstatic Perryc.c : I
    //   650: iflt -> 664
    //   653: ldc2_w -1749170814
    //   656: l2i
    //   657: ldc_w -854659256
    //   660: ixor
    //   661: goto -> 672
    //   664: ldc2_w 1566522373
    //   667: l2i
    //   668: ldc_w -260943253
    //   671: ixor
    //   672: ldc2_w -780276959
    //   675: l2i
    //   676: ldc_w 792708792
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 8864, -1527707821 -> 664, 1399800823 -> 708
    //   708: goto -> 712
    //   711: athrow
    //   712: invokespecial <init> : (Ljava/lang/String;)V
    //   715: goto -> 719
    //   718: athrow
    //   719: getstatic Perryc.c : I
    //   722: iflt -> 736
    //   725: ldc2_w -940055671
    //   728: l2i
    //   729: ldc_w 885636350
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 1119922962
    //   739: l2i
    //   740: ldc_w -1034319501
    //   743: ixor
    //   744: ldc2_w 1672133051
    //   747: l2i
    //   748: ldc_w -396900522
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 9034, 191126668 -> 780, 2026054042 -> 736
    //   780: astore_2
    //   781: getstatic Perryc.1 : I
    //   784: ifeq -> 798
    //   787: ldc2_w -1656742559
    //   790: l2i
    //   791: ldc_w -528642842
    //   794: ixor
    //   795: goto -> 806
    //   798: ldc2_w -284915660
    //   801: l2i
    //   802: ldc_w 1822010053
    //   805: ixor
    //   806: ldc2_w 885107269
    //   809: l2i
    //   810: ldc_w 2080271429
    //   813: ixor
    //   814: ixor
    //   815: lookupswitch default -> 840, -1731738336 -> 798, 839014279 -> 8984
    //   840: aload_2
    //   841: getstatic Perryc.0 : I
    //   844: ifle -> 858
    //   847: ldc2_w 1487907031
    //   850: l2i
    //   851: ldc_w -688095386
    //   854: ixor
    //   855: goto -> 866
    //   858: ldc2_w 296843890
    //   861: l2i
    //   862: ldc_w -813744297
    //   865: ixor
    //   866: ldc2_w 429461622
    //   869: l2i
    //   870: ldc_w 455462645
    //   873: ixor
    //   874: ixor
    //   875: lookupswitch default -> 900, -1953138064 -> 858, -1930491598 -> 8816
    //   900: getstatic java/math/RoundingMode.CEILING : Ljava/math/RoundingMode;
    //   903: getstatic Perryc.c : I
    //   906: iflt -> 920
    //   909: ldc2_w 625943351
    //   912: l2i
    //   913: ldc_w -1250053093
    //   916: ixor
    //   917: goto -> 928
    //   920: ldc2_w 360270471
    //   923: l2i
    //   924: ldc_w 604521133
    //   927: ixor
    //   928: ldc2_w -1712329010
    //   931: l2i
    //   932: ldc_w 546588626
    //   935: ixor
    //   936: ixor
    //   937: lookupswitch default -> 8854, -2012569290 -> 964, 692665904 -> 920
    //   964: goto -> 968
    //   967: athrow
    //   968: invokevirtual setRoundingMode : (Ljava/math/RoundingMode;)V
    //   971: goto -> 975
    //   974: athrow
    //   975: new java/lang/StringBuilder
    //   978: dup
    //   979: getstatic Perryc.0 : I
    //   982: ifle -> 996
    //   985: ldc2_w -1925399462
    //   988: l2i
    //   989: ldc_w -1409512470
    //   992: ixor
    //   993: goto -> 1004
    //   996: ldc2_w -2094508327
    //   999: l2i
    //   1000: ldc_w -298330187
    //   1003: ixor
    //   1004: ldc2_w 630077896
    //   1007: l2i
    //   1008: ldc_w -73618335
    //   1011: ixor
    //   1012: ixor
    //   1013: lookupswitch default -> 1040, -120413671 -> 8888, 1319190276 -> 996
    //   1040: goto -> 1044
    //   1043: athrow
    //   1044: invokespecial <init> : ()V
    //   1047: goto -> 1051
    //   1050: athrow
    //   1051: getstatic Perryc.c : I
    //   1054: iflt -> 1068
    //   1057: ldc2_w 1680916038
    //   1060: l2i
    //   1061: ldc_w 2041942807
    //   1064: ixor
    //   1065: goto -> 1076
    //   1068: ldc2_w -1327513745
    //   1071: l2i
    //   1072: ldc_w 260596026
    //   1075: ixor
    //   1076: ldc2_w 1907360929
    //   1079: l2i
    //   1080: ldc_w -505204636
    //   1083: ixor
    //   1084: ixor
    //   1085: lookupswitch default -> 1112, -1915348588 -> 8910, 202721942 -> 1068
    //   1112: astore_3
    //   1113: new java/lang/StringBuilder
    //   1116: dup
    //   1117: getstatic Perryc.0 : I
    //   1120: ifle -> 1134
    //   1123: ldc2_w -326154547
    //   1126: l2i
    //   1127: ldc_w 484235285
    //   1130: ixor
    //   1131: goto -> 1142
    //   1134: ldc2_w 1115020998
    //   1137: l2i
    //   1138: ldc_w 531108247
    //   1141: ixor
    //   1142: ldc2_w -623311754
    //   1145: l2i
    //   1146: ldc_w 867638056
    //   1149: ixor
    //   1150: ixor
    //   1151: lookupswitch default -> 8914, -1263284209 -> 1176, 423461254 -> 1134
    //   1176: goto -> 1180
    //   1179: athrow
    //   1180: invokespecial <init> : ()V
    //   1183: goto -> 1187
    //   1186: athrow
    //   1187: getstatic Perryc.1 : I
    //   1190: ifeq -> 1204
    //   1193: ldc2_w -1224327920
    //   1196: l2i
    //   1197: ldc_w 612663436
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w -533383433
    //   1207: l2i
    //   1208: ldc_w 358042207
    //   1211: ixor
    //   1212: ldc2_w -612267819
    //   1215: l2i
    //   1216: ldc_w -169551959
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 8944, -1108876576 -> 1204, -620289068 -> 1248
    //   1248: astore #4
    //   1250: getstatic Perryc.0 : I
    //   1253: ifle -> 1267
    //   1256: ldc2_w -935086328
    //   1259: l2i
    //   1260: ldc_w 1579928425
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w 1809311554
    //   1270: l2i
    //   1271: ldc_w -2137055702
    //   1274: ixor
    //   1275: ldc2_w -1281970976
    //   1278: l2i
    //   1279: ldc_w 1153281752
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 1312, -1929289347 -> 1267, 1631813209 -> 9030
    //   1312: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1315: getstatic Perryc.c : I
    //   1318: iflt -> 1332
    //   1321: ldc2_w -980632172
    //   1324: l2i
    //   1325: ldc_w -1770998478
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w -964976119
    //   1335: l2i
    //   1336: ldc_w -417287790
    //   1339: ixor
    //   1340: ldc2_w 795891550
    //   1343: l2i
    //   1344: ldc_w 484815313
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, 797592757 -> 1332, 1617554985 -> 8856
    //   1376: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1379: getstatic Perryc.1 : I
    //   1382: ifeq -> 1396
    //   1385: ldc2_w 12726086
    //   1388: l2i
    //   1389: ldc_w 891417037
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w 1412986929
    //   1399: l2i
    //   1400: ldc_w 1317265346
    //   1403: ixor
    //   1404: ldc2_w 811837793
    //   1407: l2i
    //   1408: ldc_w -1169072484
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 1440, -1076811402 -> 8876, -991086814 -> 1396
    //   1440: getfield field_73010_i : Ljava/util/List;
    //   1443: getstatic Perryc.1 : I
    //   1446: ifeq -> 1460
    //   1449: ldc2_w 52534054
    //   1452: l2i
    //   1453: ldc_w 733475725
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w -386724536
    //   1463: l2i
    //   1464: ldc_w -469734063
    //   1467: ixor
    //   1468: ldc2_w 69231976
    //   1471: l2i
    //   1472: ldc_w -1763077582
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 1504, -1168138255 -> 9054, 685688713 -> 1460
    //   1504: goto -> 1508
    //   1507: athrow
    //   1508: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1513: goto -> 1517
    //   1516: athrow
    //   1517: getstatic Perryc.1 : I
    //   1520: ifeq -> 1534
    //   1523: ldc2_w 506024034
    //   1526: l2i
    //   1527: ldc_w 2052396397
    //   1530: ixor
    //   1531: goto -> 1542
    //   1534: ldc2_w 1366036922
    //   1537: l2i
    //   1538: ldc_w -2134917567
    //   1541: ixor
    //   1542: ldc2_w -658501516
    //   1545: l2i
    //   1546: ldc_w -181414444
    //   1549: ixor
    //   1550: ixor
    //   1551: lookupswitch default -> 8970, -63149477 -> 1576, 1234403503 -> 1534
    //   1576: astore #5
    //   1578: getstatic Perryc.c : I
    //   1581: iflt -> 1595
    //   1584: ldc2_w 705189115
    //   1587: l2i
    //   1588: ldc_w 374495893
    //   1591: ixor
    //   1592: goto -> 1603
    //   1595: ldc2_w 667979467
    //   1598: l2i
    //   1599: ldc_w -1146780189
    //   1602: ixor
    //   1603: ldc2_w -1825118924
    //   1606: l2i
    //   1607: ldc_w -61686303
    //   1610: ixor
    //   1611: ixor
    //   1612: lookupswitch default -> 1640, 784919799 -> 1595, 1396594363 -> 8996
    //   1640: aload #5
    //   1642: getstatic Perryc.0 : I
    //   1645: ifle -> 1659
    //   1648: ldc2_w -739224633
    //   1651: l2i
    //   1652: ldc_w 766451961
    //   1655: ixor
    //   1656: goto -> 1667
    //   1659: ldc2_w -156670996
    //   1662: l2i
    //   1663: ldc_w 114788470
    //   1666: ixor
    //   1667: ldc2_w 1992731619
    //   1670: l2i
    //   1671: ldc_w 36583857
    //   1674: ixor
    //   1675: ixor
    //   1676: lookupswitch default -> 8934, -2070513208 -> 1704, -1967660692 -> 1659
    //   1704: goto -> 1708
    //   1707: athrow
    //   1708: invokeinterface hasNext : ()Z
    //   1713: goto -> 1717
    //   1716: athrow
    //   1717: ifeq -> 1731
    //   1720: ldc2_w -492094523
    //   1723: l2i
    //   1724: ldc_w -400066470
    //   1727: ixor
    //   1728: goto -> 1739
    //   1731: ldc2_w 512059603
    //   1734: l2i
    //   1735: ldc_w 336145229
    //   1738: ixor
    //   1739: ldc2_w 1687091346
    //   1742: l2i
    //   1743: ldc_w -2112475197
    //   1746: ixor
    //   1747: ixor
    //   1748: tableswitch default -> 1720, -334195506 -> 1772, -334195505 -> 8362
    //   1772: getstatic Perryc.0 : I
    //   1775: ifle -> 1789
    //   1778: ldc2_w 174899938
    //   1781: l2i
    //   1782: ldc_w -940348933
    //   1785: ixor
    //   1786: goto -> 1797
    //   1789: ldc2_w 1356626700
    //   1792: l2i
    //   1793: ldc_w 318232208
    //   1796: ixor
    //   1797: ldc2_w -1123656991
    //   1800: l2i
    //   1801: ldc_w -464549946
    //   1804: ixor
    //   1805: ixor
    //   1806: lookupswitch default -> 1832, -1797884354 -> 8862, -1120405292 -> 1789
    //   1832: aload #5
    //   1834: getstatic Perryc.0 : I
    //   1837: ifle -> 1851
    //   1840: ldc2_w -1439812453
    //   1843: l2i
    //   1844: ldc_w -1682003945
    //   1847: ixor
    //   1848: goto -> 1859
    //   1851: ldc2_w -2089506516
    //   1854: l2i
    //   1855: ldc_w 275579904
    //   1858: ixor
    //   1859: ldc2_w -392631304
    //   1862: l2i
    //   1863: ldc_w -1080975283
    //   1866: ixor
    //   1867: ixor
    //   1868: lookupswitch default -> 9028, -1005525351 -> 1896, 1721358137 -> 1851
    //   1896: goto -> 1900
    //   1899: athrow
    //   1900: invokeinterface next : ()Ljava/lang/Object;
    //   1905: goto -> 1909
    //   1908: athrow
    //   1909: checkcast net/minecraft/entity/player/EntityPlayer
    //   1912: getstatic Perryc.0 : I
    //   1915: ifle -> 1929
    //   1918: ldc2_w -1985007432
    //   1921: l2i
    //   1922: ldc_w -1476460785
    //   1925: ixor
    //   1926: goto -> 1937
    //   1929: ldc2_w -662280379
    //   1932: l2i
    //   1933: ldc_w -1571878032
    //   1936: ixor
    //   1937: ldc2_w -865913410
    //   1940: l2i
    //   1941: ldc_w 808665553
    //   1944: ixor
    //   1945: ixor
    //   1946: lookupswitch default -> 1972, -1073264648 -> 1929, -771638312 -> 9032
    //   1972: astore #6
    //   1974: getstatic Perryc.c : I
    //   1977: iflt -> 1991
    //   1980: ldc2_w 1798903878
    //   1983: l2i
    //   1984: ldc_w 2141568695
    //   1987: ixor
    //   1988: goto -> 1999
    //   1991: ldc2_w 1595590980
    //   1994: l2i
    //   1995: ldc_w 419146146
    //   1998: ixor
    //   1999: ldc2_w -1367967622
    //   2002: l2i
    //   2003: ldc_w 616829581
    //   2006: ixor
    //   2007: ixor
    //   2008: lookupswitch default -> 9020, -1641100282 -> 1991, -850195951 -> 2036
    //   2036: aload #6
    //   2038: getstatic Perryc.1 : I
    //   2041: ifeq -> 2055
    //   2044: ldc2_w -1325818947
    //   2047: l2i
    //   2048: ldc_w -431924133
    //   2051: ixor
    //   2052: goto -> 2063
    //   2055: ldc2_w 1978302004
    //   2058: l2i
    //   2059: ldc_w -1354637202
    //   2062: ixor
    //   2063: ldc2_w -1360211324
    //   2066: l2i
    //   2067: ldc_w -1236207687
    //   2070: ixor
    //   2071: ixor
    //   2072: lookupswitch default -> 2100, -1580892591 -> 2055, 1308943067 -> 8930
    //   2100: goto -> 2104
    //   2103: athrow
    //   2104: invokevirtual func_82150_aj : ()Z
    //   2107: goto -> 2111
    //   2110: athrow
    //   2111: ifne -> 2125
    //   2114: ldc2_w 449674882
    //   2117: l2i
    //   2118: ldc_w -2070042621
    //   2121: ixor
    //   2122: goto -> 2133
    //   2125: ldc2_w -556624500
    //   2128: l2i
    //   2129: ldc_w 1082278668
    //   2132: ixor
    //   2133: ldc2_w -9707398
    //   2136: l2i
    //   2137: ldc_w -731734755
    //   2140: ixor
    //   2141: ixor
    //   2142: tableswitch default -> 2114, -1252414490 -> 2164, -1252414489 -> 1578
    //   2164: getstatic Perryc.c : I
    //   2167: iflt -> 2181
    //   2170: ldc2_w 545660772
    //   2173: l2i
    //   2174: ldc_w -1649248183
    //   2177: ixor
    //   2178: goto -> 2189
    //   2181: ldc2_w -1775290862
    //   2184: l2i
    //   2185: ldc_w -1963216653
    //   2188: ixor
    //   2189: ldc2_w 1696277632
    //   2192: l2i
    //   2193: ldc_w -1144751452
    //   2196: ixor
    //   2197: ixor
    //   2198: lookupswitch default -> 8960, -1039411003 -> 2224, 1676359945 -> 2181
    //   2224: aload #6
    //   2226: getstatic Perryc.1 : I
    //   2229: ifeq -> 2243
    //   2232: ldc2_w -381927508
    //   2235: l2i
    //   2236: ldc_w -325352291
    //   2239: ixor
    //   2240: goto -> 2251
    //   2243: ldc2_w 2004459300
    //   2246: l2i
    //   2247: ldc_w 1174360580
    //   2250: ixor
    //   2251: ldc2_w 1862305196
    //   2254: l2i
    //   2255: ldc_w -1404843691
    //   2258: ixor
    //   2259: ixor
    //   2260: lookupswitch default -> 2288, -2081406022 -> 2243, -958072888 -> 8844
    //   2288: goto -> 2292
    //   2291: athrow
    //   2292: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   2295: goto -> 2299
    //   2298: athrow
    //   2299: getstatic Perryc.c : I
    //   2302: iflt -> 2316
    //   2305: ldc2_w 1026845362
    //   2308: l2i
    //   2309: ldc_w 1310656560
    //   2312: ixor
    //   2313: goto -> 2324
    //   2316: ldc2_w -241587197
    //   2319: l2i
    //   2320: ldc_w -1099220511
    //   2323: ixor
    //   2324: ldc2_w -2065417555
    //   2327: l2i
    //   2328: ldc_w -612027944
    //   2331: ixor
    //   2332: ixor
    //   2333: lookupswitch default -> 2360, -1019403865 -> 2316, 743074295 -> 8836
    //   2360: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2363: getstatic Perryc.0 : I
    //   2366: ifle -> 2380
    //   2369: ldc2_w 1819170512
    //   2372: l2i
    //   2373: ldc_w -1301871715
    //   2376: ixor
    //   2377: goto -> 2388
    //   2380: ldc2_w -623815827
    //   2383: l2i
    //   2384: ldc_w 98568113
    //   2387: ixor
    //   2388: ldc2_w -1974722563
    //   2391: l2i
    //   2392: ldc_w 60520216
    //   2395: ixor
    //   2396: ixor
    //   2397: lookupswitch default -> 2424, 943147261 -> 2380, 1474182568 -> 8866
    //   2424: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2427: getstatic Perryc.1 : I
    //   2430: ifeq -> 2444
    //   2433: ldc2_w 337571724
    //   2436: l2i
    //   2437: ldc_w 757906342
    //   2440: ixor
    //   2441: goto -> 2452
    //   2444: ldc2_w -2090402660
    //   2447: l2i
    //   2448: ldc_w -1210513697
    //   2451: ixor
    //   2452: ldc2_w -442960019
    //   2455: l2i
    //   2456: ldc_w -617986186
    //   2459: ixor
    //   2460: ixor
    //   2461: lookupswitch default -> 2488, 125887537 -> 9046, 2106208541 -> 2444
    //   2488: goto -> 2492
    //   2491: athrow
    //   2492: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   2495: goto -> 2499
    //   2498: athrow
    //   2499: getstatic Perryc.0 : I
    //   2502: ifle -> 2516
    //   2505: ldc2_w 1214664748
    //   2508: l2i
    //   2509: ldc_w 1934733178
    //   2512: ixor
    //   2513: goto -> 2524
    //   2516: ldc2_w 797315302
    //   2519: l2i
    //   2520: ldc_w -1714166585
    //   2523: ixor
    //   2524: ldc2_w 577071084
    //   2527: l2i
    //   2528: ldc_w -96057786
    //   2531: ixor
    //   2532: ixor
    //   2533: lookupswitch default -> 8892, -485171460 -> 2516, 1853281675 -> 2560
    //   2560: goto -> 2564
    //   2563: athrow
    //   2564: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2567: goto -> 2571
    //   2570: athrow
    //   2571: ifeq -> 2585
    //   2574: ldc2_w -597754652
    //   2577: l2i
    //   2578: ldc_w -1988247142
    //   2581: ixor
    //   2582: goto -> 2593
    //   2585: ldc2_w 1551661716
    //   2588: l2i
    //   2589: ldc_w 157239253
    //   2592: ixor
    //   2593: ldc2_w -265154986
    //   2596: l2i
    //   2597: ldc_w 482576055
    //   2600: ixor
    //   2601: ixor
    //   2602: tableswitch default -> 2574, -1177373281 -> 2624, -1177373280 -> 2627
    //   2624: goto -> 1578
    //   2627: getstatic Perryc.c : I
    //   2630: iflt -> 2644
    //   2633: ldc2_w 1390277341
    //   2636: l2i
    //   2637: ldc_w -353033197
    //   2640: ixor
    //   2641: goto -> 2652
    //   2644: ldc2_w -1765441240
    //   2647: l2i
    //   2648: ldc_w -634433328
    //   2651: ixor
    //   2652: ldc2_w 1413316296
    //   2655: l2i
    //   2656: ldc_w 1432230676
    //   2659: ixor
    //   2660: ixor
    //   2661: lookupswitch default -> 2688, -1186221294 -> 8950, 127967242 -> 2644
    //   2688: aload #6
    //   2690: getstatic Perryc.1 : I
    //   2693: ifeq -> 2707
    //   2696: ldc2_w 983927420
    //   2699: l2i
    //   2700: ldc_w 1755643919
    //   2703: ixor
    //   2704: goto -> 2715
    //   2707: ldc2_w 1494766744
    //   2710: l2i
    //   2711: ldc_w 259185786
    //   2714: ixor
    //   2715: ldc2_w -653381092
    //   2718: l2i
    //   2719: ldc_w -1724777648
    //   2722: ixor
    //   2723: ixor
    //   2724: lookupswitch default -> 8848, 306135871 -> 2707, 374686126 -> 2752
    //   2752: goto -> 2756
    //   2755: athrow
    //   2756: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   2759: goto -> 2763
    //   2762: athrow
    //   2763: f2i
    //   2764: getstatic Perryc.c : I
    //   2767: iflt -> 2781
    //   2770: ldc2_w -699609795
    //   2773: l2i
    //   2774: ldc_w 165015677
    //   2777: ixor
    //   2778: goto -> 2789
    //   2781: ldc2_w 606081987
    //   2784: l2i
    //   2785: ldc_w -1285264064
    //   2788: ixor
    //   2789: ldc2_w 1092494835
    //   2792: l2i
    //   2793: ldc_w 1725219162
    //   2796: ixor
    //   2797: ixor
    //   2798: lookupswitch default -> 8972, -1332831702 -> 2824, -128722455 -> 2781
    //   2824: istore #7
    //   2826: getstatic Perryc.c : I
    //   2829: iflt -> 2843
    //   2832: ldc2_w -1330542675
    //   2835: l2i
    //   2836: ldc_w -2018247714
    //   2839: ixor
    //   2840: goto -> 2851
    //   2843: ldc2_w -1132555415
    //   2846: l2i
    //   2847: ldc_w -1206403401
    //   2850: ixor
    //   2851: ldc2_w 1303847146
    //   2854: l2i
    //   2855: ldc_w -1894268858
    //   2858: ixor
    //   2859: ixor
    //   2860: lookupswitch default -> 8976, -959853198 -> 2888, -173892385 -> 2843
    //   2888: aload_1
    //   2889: getstatic Perryc.1 : I
    //   2892: ifeq -> 2906
    //   2895: ldc2_w -1548499756
    //   2898: l2i
    //   2899: ldc_w 1381361838
    //   2902: ixor
    //   2903: goto -> 2914
    //   2906: ldc2_w 528924123
    //   2909: l2i
    //   2910: ldc_w -1333416373
    //   2913: ixor
    //   2914: ldc2_w -406811288
    //   2917: l2i
    //   2918: ldc_w 858412382
    //   2921: ixor
    //   2922: ixor
    //   2923: lookupswitch default -> 2948, 621605964 -> 8940, 2112262396 -> 2906
    //   2948: iload #7
    //   2950: i2l
    //   2951: getstatic Perryc.c : I
    //   2954: iflt -> 2968
    //   2957: ldc2_w -150602649
    //   2960: l2i
    //   2961: ldc_w 164423532
    //   2964: ixor
    //   2965: goto -> 2976
    //   2968: ldc2_w 724112552
    //   2971: l2i
    //   2972: ldc_w 1479929047
    //   2975: ixor
    //   2976: ldc2_w 853708484
    //   2979: l2i
    //   2980: ldc_w -1573634890
    //   2983: ixor
    //   2984: ixor
    //   2985: lookupswitch default -> 9050, -473282035 -> 3012, 1847568761 -> 2968
    //   3012: goto -> 3016
    //   3015: athrow
    //   3016: invokevirtual format : (J)Ljava/lang/String;
    //   3019: goto -> 3023
    //   3022: athrow
    //   3023: getstatic Perryc.0 : I
    //   3026: ifle -> 3040
    //   3029: ldc2_w 1761343933
    //   3032: l2i
    //   3033: ldc_w -1762187109
    //   3036: ixor
    //   3037: goto -> 3048
    //   3040: ldc2_w 2073755907
    //   3043: l2i
    //   3044: ldc_w 637170402
    //   3047: ixor
    //   3048: ldc2_w -1248020858
    //   3051: l2i
    //   3052: ldc_w -792639898
    //   3055: ixor
    //   3056: ixor
    //   3057: lookupswitch default -> 8868, -1689181754 -> 3040, 993821441 -> 3084
    //   3084: astore #8
    //   3086: getstatic Perryc.0 : I
    //   3089: ifle -> 3103
    //   3092: ldc2_w 652146547
    //   3095: l2i
    //   3096: ldc_w -464135721
    //   3099: ixor
    //   3100: goto -> 3111
    //   3103: ldc2_w 2007345350
    //   3106: l2i
    //   3107: ldc_w 1468279467
    //   3110: ixor
    //   3111: ldc2_w -721806828
    //   3114: l2i
    //   3115: ldc_w -1719931346
    //   3118: ixor
    //   3119: ixor
    //   3120: lookupswitch default -> 3148, -1895114082 -> 8872, -1561793039 -> 3103
    //   3148: aload_3
    //   3149: ldc_w '챨㏔'
    //   3152: getstatic Perryc.c : I
    //   3155: iflt -> 3169
    //   3158: ldc2_w 785195742
    //   3161: l2i
    //   3162: ldc_w 908427542
    //   3165: ixor
    //   3166: goto -> 3177
    //   3169: ldc2_w 428443830
    //   3172: l2i
    //   3173: ldc_w -575152700
    //   3176: ixor
    //   3177: ldc2_w -1581901565
    //   3180: l2i
    //   3181: ldc_w 911641146
    //   3184: ixor
    //   3185: ixor
    //   3186: lookupswitch default -> 8926, -1895288591 -> 3169, 1407108683 -> 3212
    //   3212: goto -> 3216
    //   3215: athrow
    //   3216: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3219: goto -> 3223
    //   3222: athrow
    //   3223: getstatic Perryc.0 : I
    //   3226: ifle -> 3240
    //   3229: ldc2_w 876331666
    //   3232: l2i
    //   3233: ldc_w 1375234186
    //   3236: ixor
    //   3237: goto -> 3248
    //   3240: ldc2_w 1380046062
    //   3243: l2i
    //   3244: ldc_w -1423110779
    //   3247: ixor
    //   3248: ldc2_w 819621772
    //   3251: l2i
    //   3252: ldc_w 692163556
    //   3255: ixor
    //   3256: ixor
    //   3257: lookupswitch default -> 3284, -1365923638 -> 3240, 2086164080 -> 8890
    //   3284: goto -> 3288
    //   3287: athrow
    //   3288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3291: goto -> 3295
    //   3294: athrow
    //   3295: pop
    //   3296: getstatic Perryc.0 : I
    //   3299: ifle -> 3313
    //   3302: ldc2_w 937344996
    //   3305: l2i
    //   3306: ldc_w 94775235
    //   3309: ixor
    //   3310: goto -> 3321
    //   3313: ldc2_w 300893895
    //   3316: l2i
    //   3317: ldc_w -1863727557
    //   3320: ixor
    //   3321: ldc2_w 1207480009
    //   3324: l2i
    //   3325: ldc_w -1687350804
    //   3328: ixor
    //   3329: ixor
    //   3330: lookupswitch default -> 3356, -286447870 -> 9016, -133078379 -> 3313
    //   3356: iload #7
    //   3358: ldc2_w -1873281785
    //   3361: l2i
    //   3362: ldc_w -1873281773
    //   3365: ixor
    //   3366: if_icmplt -> 3380
    //   3369: ldc2_w 543359904
    //   3372: l2i
    //   3373: ldc_w 802353643
    //   3376: ixor
    //   3377: goto -> 3388
    //   3380: ldc2_w 819653836
    //   3383: l2i
    //   3384: ldc_w 1063984772
    //   3387: ixor
    //   3388: ldc2_w 227744681
    //   3391: l2i
    //   3392: ldc_w 659502667
    //   3395: ixor
    //   3396: ixor
    //   3397: tableswitch default -> 3369, 627957673 -> 3420, 627957674 -> 3559
    //   3420: getstatic Perryc.1 : I
    //   3423: ifeq -> 3437
    //   3426: ldc2_w -669876907
    //   3429: l2i
    //   3430: ldc_w 1997952587
    //   3433: ixor
    //   3434: goto -> 3445
    //   3437: ldc2_w -710591932
    //   3440: l2i
    //   3441: ldc_w 1559566960
    //   3444: ixor
    //   3445: ldc2_w 1746883480
    //   3448: l2i
    //   3449: ldc_w 1170138686
    //   3452: ixor
    //   3453: ixor
    //   3454: lookupswitch default -> 3480, -2103075144 -> 8894, -1769649467 -> 3437
    //   3480: aload_3
    //   3481: ldc_w 'a'
    //   3484: getstatic Perryc.0 : I
    //   3487: ifle -> 3501
    //   3490: ldc2_w 2072621284
    //   3493: l2i
    //   3494: ldc_w -1119616961
    //   3497: ixor
    //   3498: goto -> 3509
    //   3501: ldc2_w 1346038078
    //   3504: l2i
    //   3505: ldc_w 1686375980
    //   3508: ixor
    //   3509: ldc2_w -731423640
    //   3512: l2i
    //   3513: ldc_w -1545193516
    //   3516: ixor
    //   3517: ixor
    //   3518: lookupswitch default -> 8818, -1320363161 -> 3501, 1128238254 -> 3544
    //   3544: goto -> 3548
    //   3547: athrow
    //   3548: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3551: goto -> 3555
    //   3554: athrow
    //   3555: pop
    //   3556: goto -> 4224
    //   3559: getstatic Perryc.c : I
    //   3562: iflt -> 3576
    //   3565: ldc2_w 117388872
    //   3568: l2i
    //   3569: ldc_w 1336674652
    //   3572: ixor
    //   3573: goto -> 3584
    //   3576: ldc2_w 570818682
    //   3579: l2i
    //   3580: ldc_w -1281544416
    //   3583: ixor
    //   3584: ldc2_w -1275121535
    //   3587: l2i
    //   3588: ldc_w -647908502
    //   3591: ixor
    //   3592: ixor
    //   3593: lookupswitch default -> 3620, -1103784939 -> 3576, 600685823 -> 8986
    //   3620: iload #7
    //   3622: ldc2_w -1884546553
    //   3625: l2i
    //   3626: ldc_w -1884546547
    //   3629: ixor
    //   3630: if_icmplt -> 3644
    //   3633: ldc2_w -402315791
    //   3636: l2i
    //   3637: ldc_w -219596863
    //   3640: ixor
    //   3641: goto -> 3652
    //   3644: ldc2_w -1298918993
    //   3647: l2i
    //   3648: ldc_w -1468529764
    //   3651: ixor
    //   3652: ldc2_w 2060609520
    //   3655: l2i
    //   3656: ldc_w -825860267
    //   3659: ixor
    //   3660: ixor
    //   3661: tableswitch default -> 3633, -1359467883 -> 3684, -1359467882 -> 3823
    //   3684: getstatic Perryc.0 : I
    //   3687: ifle -> 3701
    //   3690: ldc2_w 17174233
    //   3693: l2i
    //   3694: ldc_w -555299409
    //   3697: ixor
    //   3698: goto -> 3709
    //   3701: ldc2_w -1738874614
    //   3704: l2i
    //   3705: ldc_w -1999882239
    //   3708: ixor
    //   3709: ldc2_w 1042084680
    //   3712: l2i
    //   3713: ldc_w -643861329
    //   3716: ixor
    //   3717: ixor
    //   3718: lookupswitch default -> 8870, -149594388 -> 3744, 946029713 -> 3701
    //   3744: aload_3
    //   3745: ldc_w 'e'
    //   3748: getstatic Perryc.1 : I
    //   3751: ifeq -> 3765
    //   3754: ldc2_w -881425192
    //   3757: l2i
    //   3758: ldc_w 563568328
    //   3761: ixor
    //   3762: goto -> 3773
    //   3765: ldc2_w 1674283013
    //   3768: l2i
    //   3769: ldc_w -853088624
    //   3772: ixor
    //   3773: ldc2_w 1320803500
    //   3776: l2i
    //   3777: ldc_w 1180515214
    //   3780: ixor
    //   3781: ixor
    //   3782: lookupswitch default -> 3808, -921185019 -> 3765, -502973134 -> 8900
    //   3808: goto -> 3812
    //   3811: athrow
    //   3812: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3815: goto -> 3819
    //   3818: athrow
    //   3819: pop
    //   3820: goto -> 4224
    //   3823: getstatic Perryc.0 : I
    //   3826: ifle -> 3840
    //   3829: ldc2_w 2145006569
    //   3832: l2i
    //   3833: ldc_w -1002961639
    //   3836: ixor
    //   3837: goto -> 3848
    //   3840: ldc2_w -1574859156
    //   3843: l2i
    //   3844: ldc_w -289429826
    //   3847: ixor
    //   3848: ldc2_w 2133503640
    //   3851: l2i
    //   3852: ldc_w 1238894188
    //   3855: ixor
    //   3856: ixor
    //   3857: lookupswitch default -> 3884, -1928290812 -> 8966, 545324449 -> 3840
    //   3884: iload #7
    //   3886: ldc2_w -1533766472
    //   3889: l2i
    //   3890: ldc_w -1533766467
    //   3893: ixor
    //   3894: if_icmplt -> 3908
    //   3897: ldc2_w -43651115
    //   3900: l2i
    //   3901: ldc_w 1091924441
    //   3904: ixor
    //   3905: goto -> 3916
    //   3908: ldc2_w 757368835
    //   3911: l2i
    //   3912: ldc_w -1856760308
    //   3915: ixor
    //   3916: ldc2_w -1310233597
    //   3919: l2i
    //   3920: ldc_w -962624298
    //   3923: ixor
    //   3924: ixor
    //   3925: tableswitch default -> 3897, -888637735 -> 3948, -888637734 -> 4087
    //   3948: getstatic Perryc.c : I
    //   3951: iflt -> 3965
    //   3954: ldc2_w 2126491293
    //   3957: l2i
    //   3958: ldc_w 561407608
    //   3961: ixor
    //   3962: goto -> 3973
    //   3965: ldc2_w -552197077
    //   3968: l2i
    //   3969: ldc_w 179213428
    //   3972: ixor
    //   3973: ldc2_w -1537946119
    //   3976: l2i
    //   3977: ldc_w -1329931794
    //   3980: ixor
    //   3981: ixor
    //   3982: lookupswitch default -> 9002, -1051286456 -> 4008, 1260903666 -> 3965
    //   4008: aload_3
    //   4009: ldc_w '6'
    //   4012: getstatic Perryc.c : I
    //   4015: iflt -> 4029
    //   4018: ldc2_w 1410233883
    //   4021: l2i
    //   4022: ldc_w 1355222185
    //   4025: ixor
    //   4026: goto -> 4037
    //   4029: ldc2_w 1378466679
    //   4032: l2i
    //   4033: ldc_w 1563766516
    //   4036: ixor
    //   4037: ldc2_w -746815896
    //   4040: l2i
    //   4041: ldc_w 874365871
    //   4044: ixor
    //   4045: ixor
    //   4046: lookupswitch default -> 4072, -475478155 -> 8988, 672988064 -> 4029
    //   4072: goto -> 4076
    //   4075: athrow
    //   4076: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4079: goto -> 4083
    //   4082: athrow
    //   4083: pop
    //   4084: goto -> 4224
    //   4087: getstatic Perryc.0 : I
    //   4090: ifle -> 4104
    //   4093: ldc2_w 235655352
    //   4096: l2i
    //   4097: ldc_w -962319432
    //   4100: ixor
    //   4101: goto -> 4112
    //   4104: ldc2_w -985918622
    //   4107: l2i
    //   4108: ldc_w -629054229
    //   4111: ixor
    //   4112: ldc2_w -1461581199
    //   4115: l2i
    //   4116: ldc_w 1689552720
    //   4119: ixor
    //   4120: ixor
    //   4121: lookupswitch default -> 8922, -739509592 -> 4148, 83457569 -> 4104
    //   4148: aload_3
    //   4149: ldc_w 'c'
    //   4152: getstatic Perryc.c : I
    //   4155: iflt -> 4169
    //   4158: ldc2_w -454654101
    //   4161: l2i
    //   4162: ldc_w 1062612190
    //   4165: ixor
    //   4166: goto -> 4177
    //   4169: ldc2_w 1685286904
    //   4172: l2i
    //   4173: ldc_w -1542342505
    //   4176: ixor
    //   4177: ldc2_w -246075779
    //   4180: l2i
    //   4181: ldc_w 1065887718
    //   4184: ixor
    //   4185: ixor
    //   4186: lookupswitch default -> 9010, 247455476 -> 4212, 359506478 -> 4169
    //   4212: goto -> 4216
    //   4215: athrow
    //   4216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4219: goto -> 4223
    //   4222: athrow
    //   4223: pop
    //   4224: getstatic Perryc.c : I
    //   4227: iflt -> 4241
    //   4230: ldc2_w -2113864103
    //   4233: l2i
    //   4234: ldc_w 669336215
    //   4237: ixor
    //   4238: goto -> 4249
    //   4241: ldc2_w 1991703947
    //   4244: l2i
    //   4245: ldc_w 1432370326
    //   4248: ixor
    //   4249: ldc2_w -230083050
    //   4252: l2i
    //   4253: ldc_w -701721332
    //   4256: ixor
    //   4257: ixor
    //   4258: lookupswitch default -> 8834, -2122309676 -> 4241, 129196551 -> 4284
    //   4284: aload_3
    //   4285: getstatic Perryc.0 : I
    //   4288: ifle -> 4302
    //   4291: ldc2_w 1012931638
    //   4294: l2i
    //   4295: ldc_w 1928681647
    //   4298: ixor
    //   4299: goto -> 4310
    //   4302: ldc2_w -1564955402
    //   4305: l2i
    //   4306: ldc_w -584794397
    //   4309: ixor
    //   4310: ldc2_w -610962282
    //   4313: l2i
    //   4314: ldc_w -517703827
    //   4317: ixor
    //   4318: ixor
    //   4319: lookupswitch default -> 4344, 514986295 -> 4302, 1948534626 -> 8978
    //   4344: aload #8
    //   4346: getstatic Perryc.0 : I
    //   4349: ifle -> 4363
    //   4352: ldc2_w 776485258
    //   4355: l2i
    //   4356: ldc_w -298309916
    //   4359: ixor
    //   4360: goto -> 4371
    //   4363: ldc2_w 1572596966
    //   4366: l2i
    //   4367: ldc_w 354789648
    //   4370: ixor
    //   4371: ldc2_w 1168714271
    //   4374: l2i
    //   4375: ldc_w -543686948
    //   4378: ixor
    //   4379: ixor
    //   4380: lookupswitch default -> 8906, -761229003 -> 4408, 1515113389 -> 4363
    //   4408: goto -> 4412
    //   4411: athrow
    //   4412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4415: goto -> 4419
    //   4418: athrow
    //   4419: pop
    //   4420: getstatic Perryc.c : I
    //   4423: iflt -> 4437
    //   4426: ldc2_w -661412835
    //   4429: l2i
    //   4430: ldc_w -933515219
    //   4433: ixor
    //   4434: goto -> 4445
    //   4437: ldc2_w 1767150647
    //   4440: l2i
    //   4441: ldc_w 993897873
    //   4444: ixor
    //   4445: ldc2_w 1129482547
    //   4448: l2i
    //   4449: ldc_w 1179693069
    //   4452: ixor
    //   4453: ixor
    //   4454: lookupswitch default -> 8958, 365571342 -> 4437, 1466630296 -> 4480
    //   4480: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4483: getstatic Perryc.0 : I
    //   4486: ifle -> 4500
    //   4489: ldc2_w 1193425835
    //   4492: l2i
    //   4493: ldc_w -213298374
    //   4496: ixor
    //   4497: goto -> 4508
    //   4500: ldc2_w 2029099466
    //   4503: l2i
    //   4504: ldc_w -1922999982
    //   4507: ixor
    //   4508: ldc2_w 491471970
    //   4511: l2i
    //   4512: ldc_w -1022274286
    //   4515: ixor
    //   4516: ixor
    //   4517: lookupswitch default -> 4544, 876329741 -> 4500, 1781627361 -> 8860
    //   4544: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4547: getstatic Perryc.1 : I
    //   4550: ifeq -> 4564
    //   4553: ldc2_w 242357405
    //   4556: l2i
    //   4557: ldc_w 1180055072
    //   4560: ixor
    //   4561: goto -> 4572
    //   4564: ldc2_w 1792428317
    //   4567: l2i
    //   4568: ldc_w 209035172
    //   4571: ixor
    //   4572: ldc2_w -1563227683
    //   4575: l2i
    //   4576: ldc_w -1995061484
    //   4579: ixor
    //   4580: ixor
    //   4581: lookupswitch default -> 8846, 1298471024 -> 4608, 1675816052 -> 4564
    //   4608: aload #6
    //   4610: getstatic Perryc.c : I
    //   4613: iflt -> 4627
    //   4616: ldc2_w 302630719
    //   4619: l2i
    //   4620: ldc_w -1048858418
    //   4623: ixor
    //   4624: goto -> 4635
    //   4627: ldc2_w -1831990447
    //   4630: l2i
    //   4631: ldc_w -308666292
    //   4634: ixor
    //   4635: ldc2_w -645115707
    //   4638: l2i
    //   4639: ldc_w 1668503173
    //   4642: ixor
    //   4643: ixor
    //   4644: lookupswitch default -> 8902, -978637475 -> 4672, 1770877361 -> 4627
    //   4672: goto -> 4676
    //   4675: athrow
    //   4676: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   4679: goto -> 4683
    //   4682: athrow
    //   4683: f2i
    //   4684: getstatic Perryc.1 : I
    //   4687: ifeq -> 4701
    //   4690: ldc2_w 2132781624
    //   4693: l2i
    //   4694: ldc_w -1127372164
    //   4697: ixor
    //   4698: goto -> 4709
    //   4701: ldc2_w -791057408
    //   4704: l2i
    //   4705: ldc_w -1076066992
    //   4708: ixor
    //   4709: ldc2_w -1221806079
    //   4712: l2i
    //   4713: ldc_w 1045804357
    //   4716: ixor
    //   4717: ixor
    //   4718: lookupswitch default -> 8992, -428022764 -> 4744, 1252723968 -> 4701
    //   4744: istore #9
    //   4746: getstatic Perryc.c : I
    //   4749: iflt -> 4763
    //   4752: ldc2_w 596650869
    //   4755: l2i
    //   4756: ldc_w -791198422
    //   4759: ixor
    //   4760: goto -> 4771
    //   4763: ldc2_w -720509102
    //   4766: l2i
    //   4767: ldc_w 1926698748
    //   4770: ixor
    //   4771: ldc2_w -842979718
    //   4774: l2i
    //   4775: ldc_w -436337665
    //   4778: ixor
    //   4779: ixor
    //   4780: lookupswitch default -> 8918, -1880763349 -> 4808, -612873254 -> 4763
    //   4808: aload_2
    //   4809: getstatic Perryc.c : I
    //   4812: iflt -> 4826
    //   4815: ldc2_w -1994023575
    //   4818: l2i
    //   4819: ldc_w 1445076321
    //   4822: ixor
    //   4823: goto -> 4834
    //   4826: ldc2_w -1244104813
    //   4829: l2i
    //   4830: ldc_w 531280185
    //   4833: ixor
    //   4834: ldc2_w 1152452614
    //   4837: l2i
    //   4838: ldc_w 156780881
    //   4841: ixor
    //   4842: ixor
    //   4843: lookupswitch default -> 4868, -1829846689 -> 8878, -1127741090 -> 4826
    //   4868: iload #9
    //   4870: i2l
    //   4871: getstatic Perryc.1 : I
    //   4874: ifeq -> 4888
    //   4877: ldc2_w 399255500
    //   4880: l2i
    //   4881: ldc_w -410308082
    //   4884: ixor
    //   4885: goto -> 4896
    //   4888: ldc2_w -671825992
    //   4891: l2i
    //   4892: ldc_w -1358752841
    //   4895: ixor
    //   4896: ldc2_w 1745650626
    //   4899: l2i
    //   4900: ldc_w 762273091
    //   4903: ixor
    //   4904: ixor
    //   4905: lookupswitch default -> 4932, -1649572534 -> 4888, -1255879869 -> 8882
    //   4932: goto -> 4936
    //   4935: athrow
    //   4936: invokevirtual format : (J)Ljava/lang/String;
    //   4939: goto -> 4943
    //   4942: athrow
    //   4943: getstatic Perryc.1 : I
    //   4946: ifeq -> 4960
    //   4949: ldc2_w -2024821134
    //   4952: l2i
    //   4953: ldc_w 1629498499
    //   4956: ixor
    //   4957: goto -> 4968
    //   4960: ldc2_w 1714962251
    //   4963: l2i
    //   4964: ldc_w -594151638
    //   4967: ixor
    //   4968: ldc2_w 23770245
    //   4971: l2i
    //   4972: ldc_w 1623675989
    //   4975: ixor
    //   4976: ixor
    //   4977: lookupswitch default -> 8822, -2017304031 -> 4960, -620746575 -> 5004
    //   5004: astore #10
    //   5006: getstatic Perryc.0 : I
    //   5009: ifle -> 5023
    //   5012: ldc2_w -264623626
    //   5015: l2i
    //   5016: ldc_w -1194526006
    //   5019: ixor
    //   5020: goto -> 5031
    //   5023: ldc2_w -1026613443
    //   5026: l2i
    //   5027: ldc_w 516988276
    //   5030: ixor
    //   5031: ldc2_w -92726762
    //   5034: l2i
    //   5035: ldc_w 600443151
    //   5038: ixor
    //   5039: ixor
    //   5040: lookupswitch default -> 5068, -1857699803 -> 9022, -356995129 -> 5023
    //   5068: aload #4
    //   5070: ldc_w '챨㏔'
    //   5073: getstatic Perryc.1 : I
    //   5076: ifeq -> 5090
    //   5079: ldc2_w -236541509
    //   5082: l2i
    //   5083: ldc_w -721264821
    //   5086: ixor
    //   5087: goto -> 5098
    //   5090: ldc2_w -344168851
    //   5093: l2i
    //   5094: ldc_w -1488256860
    //   5097: ixor
    //   5098: ldc2_w 621600977
    //   5101: l2i
    //   5102: ldc_w -331759135
    //   5105: ixor
    //   5106: ixor
    //   5107: lookupswitch default -> 9052, -2063448071 -> 5132, -305014848 -> 5090
    //   5132: goto -> 5136
    //   5135: athrow
    //   5136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5139: goto -> 5143
    //   5142: athrow
    //   5143: getstatic Perryc.0 : I
    //   5146: ifle -> 5160
    //   5149: ldc2_w -992634266
    //   5152: l2i
    //   5153: ldc_w -1568912121
    //   5156: ixor
    //   5157: goto -> 5168
    //   5160: ldc2_w -746768288
    //   5163: l2i
    //   5164: ldc_w -95839939
    //   5167: ixor
    //   5168: ldc2_w 1011173005
    //   5171: l2i
    //   5172: ldc_w -1414889960
    //   5175: ixor
    //   5176: ixor
    //   5177: lookupswitch default -> 8980, -1092904504 -> 5204, -247009292 -> 5160
    //   5204: goto -> 5208
    //   5207: athrow
    //   5208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5211: goto -> 5215
    //   5214: athrow
    //   5215: pop
    //   5216: getstatic Perryc.0 : I
    //   5219: ifle -> 5233
    //   5222: ldc2_w 1621582742
    //   5225: l2i
    //   5226: ldc_w -2060706465
    //   5229: ixor
    //   5230: goto -> 5241
    //   5233: ldc2_w 1024459520
    //   5236: l2i
    //   5237: ldc_w -1637498656
    //   5240: ixor
    //   5241: ldc2_w 1933947981
    //   5244: l2i
    //   5245: ldc_w 1701812304
    //   5248: ixor
    //   5249: ixor
    //   5250: lookupswitch default -> 8852, -1252003843 -> 5276, -207531308 -> 5233
    //   5276: iload #9
    //   5278: ldc2_w 237305559
    //   5281: l2i
    //   5282: ldc_w 237305550
    //   5285: ixor
    //   5286: if_icmplt -> 5300
    //   5289: ldc2_w -981270417
    //   5292: l2i
    //   5293: ldc_w 1371577950
    //   5296: ixor
    //   5297: goto -> 5308
    //   5300: ldc2_w -1936956747
    //   5303: l2i
    //   5304: ldc_w 416283781
    //   5307: ixor
    //   5308: ldc2_w 1221095815
    //   5311: l2i
    //   5312: ldc_w 1331186496
    //   5315: ixor
    //   5316: ixor
    //   5317: tableswitch default -> 5289, -1814846218 -> 5340, -1814846217 -> 5479
    //   5340: getstatic Perryc.c : I
    //   5343: iflt -> 5357
    //   5346: ldc2_w 1881933214
    //   5349: l2i
    //   5350: ldc_w -1343675325
    //   5353: ixor
    //   5354: goto -> 5365
    //   5357: ldc2_w -1818182324
    //   5360: l2i
    //   5361: ldc_w 2046174005
    //   5364: ixor
    //   5365: ldc2_w -1269431664
    //   5368: l2i
    //   5369: ldc_w -215516880
    //   5372: ixor
    //   5373: ixor
    //   5374: lookupswitch default -> 9000, -1733010819 -> 5357, -1389894183 -> 5400
    //   5400: aload #4
    //   5402: ldc_w 'a'
    //   5405: getstatic Perryc.1 : I
    //   5408: ifeq -> 5422
    //   5411: ldc2_w -248666741
    //   5414: l2i
    //   5415: ldc_w -461125358
    //   5418: ixor
    //   5419: goto -> 5430
    //   5422: ldc2_w -385374990
    //   5425: l2i
    //   5426: ldc_w -124183667
    //   5429: ixor
    //   5430: ldc2_w 1623516510
    //   5433: l2i
    //   5434: ldc_w -855109316
    //   5437: ixor
    //   5438: ixor
    //   5439: lookupswitch default -> 5464, -1201497861 -> 8824, -802742191 -> 5422
    //   5464: goto -> 5468
    //   5467: athrow
    //   5468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5471: goto -> 5475
    //   5474: athrow
    //   5475: pop
    //   5476: goto -> 5880
    //   5479: getstatic Perryc.0 : I
    //   5482: ifle -> 5496
    //   5485: ldc2_w 1505244899
    //   5488: l2i
    //   5489: ldc_w -1705444854
    //   5492: ixor
    //   5493: goto -> 5504
    //   5496: ldc2_w -1267501697
    //   5499: l2i
    //   5500: ldc_w -533716627
    //   5503: ixor
    //   5504: ldc2_w 1654498916
    //   5507: l2i
    //   5508: ldc_w -919599097
    //   5511: ixor
    //   5512: ixor
    //   5513: lookupswitch default -> 5540, -2095174459 -> 5496, 1749901962 -> 9036
    //   5540: iload #9
    //   5542: ldc2_w -683641385
    //   5545: l2i
    //   5546: ldc_w -683641379
    //   5549: ixor
    //   5550: if_icmple -> 5564
    //   5553: ldc2_w 1197891540
    //   5556: l2i
    //   5557: ldc_w 438028611
    //   5560: ixor
    //   5561: goto -> 5572
    //   5564: ldc2_w 1595639616
    //   5567: l2i
    //   5568: ldc_w 40243664
    //   5571: ixor
    //   5572: ldc2_w -981666175
    //   5575: l2i
    //   5576: ldc_w 509960845
    //   5579: ixor
    //   5580: ixor
    //   5581: tableswitch default -> 5553, -2040266085 -> 5604, -2040266084 -> 5743
    //   5604: getstatic Perryc.c : I
    //   5607: iflt -> 5621
    //   5610: ldc2_w -1109683669
    //   5613: l2i
    //   5614: ldc_w 1645618971
    //   5617: ixor
    //   5618: goto -> 5629
    //   5621: ldc2_w -1899430490
    //   5624: l2i
    //   5625: ldc_w -962938578
    //   5628: ixor
    //   5629: ldc2_w -530128122
    //   5632: l2i
    //   5633: ldc_w 424029815
    //   5636: ixor
    //   5637: ixor
    //   5638: lookupswitch default -> 8998, -1317893639 -> 5664, 653097025 -> 5621
    //   5664: aload #4
    //   5666: ldc_w '6'
    //   5669: getstatic Perryc.c : I
    //   5672: iflt -> 5686
    //   5675: ldc2_w 868163270
    //   5678: l2i
    //   5679: ldc_w -1196982398
    //   5682: ixor
    //   5683: goto -> 5694
    //   5686: ldc2_w -1192410980
    //   5689: l2i
    //   5690: ldc_w 1046840517
    //   5693: ixor
    //   5694: ldc2_w 640257737
    //   5697: l2i
    //   5698: ldc_w 1126407951
    //   5701: ixor
    //   5702: ixor
    //   5703: lookupswitch default -> 5728, -955990151 -> 5686, -300781438 -> 8896
    //   5728: goto -> 5732
    //   5731: athrow
    //   5732: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5735: goto -> 5739
    //   5738: athrow
    //   5739: pop
    //   5740: goto -> 5880
    //   5743: getstatic Perryc.0 : I
    //   5746: ifle -> 5760
    //   5749: ldc2_w -821812164
    //   5752: l2i
    //   5753: ldc_w 746833571
    //   5756: ixor
    //   5757: goto -> 5768
    //   5760: ldc2_w 1765885871
    //   5763: l2i
    //   5764: ldc_w -99530416
    //   5767: ixor
    //   5768: ldc2_w -1608300305
    //   5771: l2i
    //   5772: ldc_w 2061029074
    //   5775: ixor
    //   5776: ixor
    //   5777: lookupswitch default -> 8920, 964453538 -> 5760, 1235978434 -> 5804
    //   5804: aload #4
    //   5806: ldc_w 'c'
    //   5809: getstatic Perryc.c : I
    //   5812: iflt -> 5826
    //   5815: ldc2_w 704734111
    //   5818: l2i
    //   5819: ldc_w 1350578893
    //   5822: ixor
    //   5823: goto -> 5834
    //   5826: ldc2_w -1296249347
    //   5829: l2i
    //   5830: ldc_w -1800932458
    //   5833: ixor
    //   5834: ldc2_w -1927945468
    //   5837: l2i
    //   5838: ldc_w 1368600681
    //   5841: ixor
    //   5842: ixor
    //   5843: lookupswitch default -> 5868, -1509457345 -> 8874, -762066025 -> 5826
    //   5868: goto -> 5872
    //   5871: athrow
    //   5872: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5875: goto -> 5879
    //   5878: athrow
    //   5879: pop
    //   5880: getstatic Perryc.0 : I
    //   5883: ifle -> 5897
    //   5886: ldc2_w 131766282
    //   5889: l2i
    //   5890: ldc_w -891832787
    //   5893: ixor
    //   5894: goto -> 5905
    //   5897: ldc2_w -115414797
    //   5900: l2i
    //   5901: ldc_w -1238964189
    //   5904: ixor
    //   5905: ldc2_w -582565576
    //   5908: l2i
    //   5909: ldc_w -2052160361
    //   5912: ixor
    //   5913: ixor
    //   5914: lookupswitch default -> 8814, -1780126840 -> 5897, 399525247 -> 5940
    //   5940: aload #4
    //   5942: getstatic Perryc.0 : I
    //   5945: ifle -> 5959
    //   5948: ldc2_w 1128944479
    //   5951: l2i
    //   5952: ldc_w 1000039851
    //   5955: ixor
    //   5956: goto -> 5967
    //   5959: ldc2_w -1230580057
    //   5962: l2i
    //   5963: ldc_w -1914277295
    //   5966: ixor
    //   5967: ldc2_w -1305997268
    //   5970: l2i
    //   5971: ldc_w 320811061
    //   5974: ixor
    //   5975: ixor
    //   5976: lookupswitch default -> 8974, -1703443217 -> 6004, -639232275 -> 5959
    //   6004: aload #10
    //   6006: getstatic Perryc.c : I
    //   6009: iflt -> 6023
    //   6012: ldc2_w -1984247768
    //   6015: l2i
    //   6016: ldc_w 1124246871
    //   6019: ixor
    //   6020: goto -> 6031
    //   6023: ldc2_w 1011763411
    //   6026: l2i
    //   6027: ldc_w 78154481
    //   6030: ixor
    //   6031: ldc2_w -1614814019
    //   6034: l2i
    //   6035: ldc_w 300072975
    //   6038: ixor
    //   6039: ixor
    //   6040: lookupswitch default -> 6068, -2094949433 -> 6023, 1155877325 -> 8924
    //   6068: goto -> 6072
    //   6071: athrow
    //   6072: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6075: goto -> 6079
    //   6078: athrow
    //   6079: pop
    //   6080: getstatic Perryc.0 : I
    //   6083: ifle -> 6097
    //   6086: ldc2_w 1324360075
    //   6089: l2i
    //   6090: ldc_w -784795481
    //   6093: ixor
    //   6094: goto -> 6105
    //   6097: ldc2_w -1415483545
    //   6100: l2i
    //   6101: ldc_w -527957803
    //   6104: ixor
    //   6105: ldc2_w 112888636
    //   6108: l2i
    //   6109: ldc_w -1882500128
    //   6112: ixor
    //   6113: ixor
    //   6114: lookupswitch default -> 6140, -1080997742 -> 6097, 381223408 -> 8956
    //   6140: aload_0
    //   6141: new java/lang/StringBuilder
    //   6144: dup
    //   6145: getstatic Perryc.c : I
    //   6148: iflt -> 6162
    //   6151: ldc2_w -881684076
    //   6154: l2i
    //   6155: ldc_w 1486873377
    //   6158: ixor
    //   6159: goto -> 6170
    //   6162: ldc2_w -1415610763
    //   6165: l2i
    //   6166: ldc_w 1238781444
    //   6169: ixor
    //   6170: ldc2_w 990396321
    //   6173: l2i
    //   6174: ldc_w -391310529
    //   6177: ixor
    //   6178: ixor
    //   6179: lookupswitch default -> 8908, 837557487 -> 6204, 1078484523 -> 6162
    //   6204: goto -> 6208
    //   6207: athrow
    //   6208: invokespecial <init> : ()V
    //   6211: goto -> 6215
    //   6214: athrow
    //   6215: getstatic Perryc.c : I
    //   6218: iflt -> 6232
    //   6221: ldc2_w -2004056947
    //   6224: l2i
    //   6225: ldc_w 783556482
    //   6228: ixor
    //   6229: goto -> 6240
    //   6232: ldc2_w 353160851
    //   6235: l2i
    //   6236: ldc_w -1781704254
    //   6239: ixor
    //   6240: ldc2_w -1511701725
    //   6243: l2i
    //   6244: ldc_w -503087393
    //   6247: ixor
    //   6248: ixor
    //   6249: lookupswitch default -> 8830, -953701715 -> 6276, -505501965 -> 6232
    //   6276: aload_3
    //   6277: getstatic Perryc.0 : I
    //   6280: ifle -> 6294
    //   6283: ldc2_w -1418807898
    //   6286: l2i
    //   6287: ldc_w -570869044
    //   6290: ixor
    //   6291: goto -> 6302
    //   6294: ldc2_w -208676846
    //   6297: l2i
    //   6298: ldc_w -394916949
    //   6301: ixor
    //   6302: ldc2_w -2075955292
    //   6305: l2i
    //   6306: ldc_w 726202257
    //   6309: ixor
    //   6310: ixor
    //   6311: lookupswitch default -> 8938, -1259189364 -> 6336, -644081825 -> 6294
    //   6336: goto -> 6340
    //   6339: athrow
    //   6340: invokevirtual toString : ()Ljava/lang/String;
    //   6343: goto -> 6347
    //   6346: athrow
    //   6347: getstatic Perryc.c : I
    //   6350: iflt -> 6364
    //   6353: ldc2_w -347157848
    //   6356: l2i
    //   6357: ldc_w -42630165
    //   6360: ixor
    //   6361: goto -> 6372
    //   6364: ldc2_w -605358648
    //   6367: l2i
    //   6368: ldc_w -1375823720
    //   6371: ixor
    //   6372: ldc2_w -1072224113
    //   6375: l2i
    //   6376: ldc_w 1529178912
    //   6379: ixor
    //   6380: ixor
    //   6381: lookupswitch default -> 8952, -1928787220 -> 6364, -316264705 -> 6408
    //   6408: goto -> 6412
    //   6411: athrow
    //   6412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6415: goto -> 6419
    //   6418: athrow
    //   6419: ldc_w ' '
    //   6422: getstatic Perryc.c : I
    //   6425: iflt -> 6439
    //   6428: ldc2_w 1991865606
    //   6431: l2i
    //   6432: ldc_w 823688471
    //   6435: ixor
    //   6436: goto -> 6447
    //   6439: ldc2_w -146595611
    //   6442: l2i
    //   6443: ldc_w -1236895960
    //   6446: ixor
    //   6447: ldc2_w -1146319079
    //   6450: l2i
    //   6451: ldc_w 1044623266
    //   6454: ixor
    //   6455: ixor
    //   6456: lookupswitch default -> 9024, -1035065174 -> 6439, -991266954 -> 6484
    //   6484: goto -> 6488
    //   6487: athrow
    //   6488: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6491: goto -> 6495
    //   6494: athrow
    //   6495: getstatic Perryc.0 : I
    //   6498: ifle -> 6512
    //   6501: ldc2_w -1658294625
    //   6504: l2i
    //   6505: ldc_w 2143856728
    //   6508: ixor
    //   6509: goto -> 6520
    //   6512: ldc2_w -1620356281
    //   6515: l2i
    //   6516: ldc_w 365485599
    //   6519: ixor
    //   6520: ldc2_w 1743309265
    //   6523: l2i
    //   6524: ldc_w -1670077826
    //   6527: ixor
    //   6528: ixor
    //   6529: lookupswitch default -> 8968, 427601256 -> 6512, 1900013303 -> 6556
    //   6556: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   6559: getstatic Perryc.c : I
    //   6562: iflt -> 6576
    //   6565: ldc2_w -153936223
    //   6568: l2i
    //   6569: ldc_w -735651108
    //   6572: ixor
    //   6573: goto -> 6584
    //   6576: ldc2_w 479813730
    //   6579: l2i
    //   6580: ldc_w -52682356
    //   6583: ixor
    //   6584: ldc2_w 1203815668
    //   6587: l2i
    //   6588: ldc_w -42739791
    //   6591: ixor
    //   6592: ixor
    //   6593: lookupswitch default -> 8880, -1740187848 -> 6576, 1526092459 -> 6620
    //   6620: aload #6
    //   6622: getstatic Perryc.0 : I
    //   6625: ifle -> 6639
    //   6628: ldc2_w 1363859521
    //   6631: l2i
    //   6632: ldc_w -375899473
    //   6635: ixor
    //   6636: goto -> 6647
    //   6639: ldc2_w 144103179
    //   6642: l2i
    //   6643: ldc_w 58889312
    //   6646: ixor
    //   6647: ldc2_w -151794222
    //   6650: l2i
    //   6651: ldc_w -1485869228
    //   6654: ixor
    //   6655: ixor
    //   6656: lookupswitch default -> 9040, -380747672 -> 6639, 1518920173 -> 6684
    //   6684: goto -> 6688
    //   6687: athrow
    //   6688: invokevirtual isFriend : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   6691: goto -> 6695
    //   6694: athrow
    //   6695: ifeq -> 6709
    //   6698: ldc2_w 279164043
    //   6701: l2i
    //   6702: ldc_w 1293166282
    //   6705: ixor
    //   6706: goto -> 6717
    //   6709: ldc2_w -1530685020
    //   6712: l2i
    //   6713: ldc_w -109835290
    //   6716: ixor
    //   6717: ldc2_w 2068214568
    //   6720: l2i
    //   6721: ldc_w 2062503088
    //   6724: ixor
    //   6725: ixor
    //   6726: tableswitch default -> 6698, 1545514457 -> 6748, 1545514458 -> 6814
    //   6748: getstatic Perryc.0 : I
    //   6751: ifle -> 6765
    //   6754: ldc2_w 874935679
    //   6757: l2i
    //   6758: ldc_w -1341128272
    //   6761: ixor
    //   6762: goto -> 6773
    //   6765: ldc2_w -1378153545
    //   6768: l2i
    //   6769: ldc_w 2068985594
    //   6772: ixor
    //   6773: ldc2_w 1858914885
    //   6776: l2i
    //   6777: ldc_w -1826840176
    //   6780: ixor
    //   6781: ixor
    //   6782: lookupswitch default -> 6808, -1149572234 -> 6765, 2045124378 -> 8884
    //   6808: getstatic com/mojang/realmsclient/gui/ChatFormatting.AQUA : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6811: goto -> 6879
    //   6814: getstatic Perryc.1 : I
    //   6817: ifeq -> 6831
    //   6820: ldc2_w 1289886222
    //   6823: l2i
    //   6824: ldc_w 585010095
    //   6827: ixor
    //   6828: goto -> 6839
    //   6831: ldc2_w 466353698
    //   6834: l2i
    //   6835: ldc_w 591036426
    //   6838: ixor
    //   6839: ldc2_w -871195586
    //   6842: l2i
    //   6843: ldc_w -1034620042
    //   6846: ixor
    //   6847: ixor
    //   6848: lookupswitch default -> 8942, 917967200 -> 6876, 1618673385 -> 6831
    //   6876: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6879: getstatic Perryc.c : I
    //   6882: iflt -> 6896
    //   6885: ldc2_w -1197646766
    //   6888: l2i
    //   6889: ldc_w -1443721827
    //   6892: ixor
    //   6893: goto -> 6904
    //   6896: ldc2_w -1604340296
    //   6899: l2i
    //   6900: ldc_w 1930685625
    //   6903: ixor
    //   6904: ldc2_w 727460952
    //   6907: l2i
    //   6908: ldc_w -1989727003
    //   6911: ixor
    //   6912: ixor
    //   6913: lookupswitch default -> 6940, -1286286990 -> 8946, 1417790037 -> 6896
    //   6940: goto -> 6944
    //   6943: athrow
    //   6944: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6947: goto -> 6951
    //   6950: athrow
    //   6951: getstatic Perryc.1 : I
    //   6954: ifeq -> 6968
    //   6957: ldc2_w -1438270062
    //   6960: l2i
    //   6961: ldc_w -282666478
    //   6964: ixor
    //   6965: goto -> 6976
    //   6968: ldc2_w -2061144958
    //   6971: l2i
    //   6972: ldc_w 743578394
    //   6975: ixor
    //   6976: ldc2_w 1559232562
    //   6979: l2i
    //   6980: ldc_w -1415602319
    //   6983: ixor
    //   6984: ixor
    //   6985: lookupswitch default -> 8850, -1307772733 -> 6968, 1578690779 -> 7012
    //   7012: aload #6
    //   7014: getstatic Perryc.0 : I
    //   7017: ifle -> 7031
    //   7020: ldc2_w -2031008351
    //   7023: l2i
    //   7024: ldc_w 1675956406
    //   7027: ixor
    //   7028: goto -> 7039
    //   7031: ldc2_w -1888040680
    //   7034: l2i
    //   7035: ldc_w -74987384
    //   7038: ixor
    //   7039: ldc2_w -1249646551
    //   7042: l2i
    //   7043: ldc_w -539094159
    //   7046: ixor
    //   7047: ixor
    //   7048: lookupswitch default -> 9042, -1890996657 -> 7031, 514652872 -> 7076
    //   7076: goto -> 7080
    //   7079: athrow
    //   7080: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   7083: goto -> 7087
    //   7086: athrow
    //   7087: getstatic Perryc.0 : I
    //   7090: ifle -> 7104
    //   7093: ldc2_w 1965686527
    //   7096: l2i
    //   7097: ldc_w 2009336533
    //   7100: ixor
    //   7101: goto -> 7112
    //   7104: ldc2_w 223559429
    //   7107: l2i
    //   7108: ldc_w 802548369
    //   7111: ixor
    //   7112: ldc2_w 463692579
    //   7115: l2i
    //   7116: ldc_w -343861115
    //   7119: ixor
    //   7120: ixor
    //   7121: lookupswitch default -> 8826, -760959438 -> 7148, -221278324 -> 7104
    //   7148: goto -> 7152
    //   7151: athrow
    //   7152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7155: goto -> 7159
    //   7158: athrow
    //   7159: ldc_w ' '
    //   7162: getstatic Perryc.1 : I
    //   7165: ifeq -> 7179
    //   7168: ldc2_w -839420235
    //   7171: l2i
    //   7172: ldc_w 635783961
    //   7175: ixor
    //   7176: goto -> 7187
    //   7179: ldc2_w -583042985
    //   7182: l2i
    //   7183: ldc_w 393510681
    //   7186: ixor
    //   7187: ldc2_w 794831152
    //   7190: l2i
    //   7191: ldc_w -1656760837
    //   7194: ixor
    //   7195: ixor
    //   7196: lookupswitch default -> 7224, 863128264 -> 7179, 1515045223 -> 8840
    //   7224: goto -> 7228
    //   7227: athrow
    //   7228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7231: goto -> 7235
    //   7234: athrow
    //   7235: getstatic Perryc.0 : I
    //   7238: ifle -> 7252
    //   7241: ldc2_w 582113385
    //   7244: l2i
    //   7245: ldc_w -494656270
    //   7248: ixor
    //   7249: goto -> 7260
    //   7252: ldc2_w 2071933074
    //   7255: l2i
    //   7256: ldc_w 2127020014
    //   7259: ixor
    //   7260: ldc2_w -1157918501
    //   7263: l2i
    //   7264: ldc_w -778722287
    //   7267: ixor
    //   7268: ixor
    //   7269: lookupswitch default -> 9012, -1420277679 -> 7252, 1859566518 -> 7296
    //   7296: aload #4
    //   7298: getstatic Perryc.c : I
    //   7301: iflt -> 7315
    //   7304: ldc2_w -1596003089
    //   7307: l2i
    //   7308: ldc_w 195897156
    //   7311: ixor
    //   7312: goto -> 7323
    //   7315: ldc2_w -60713888
    //   7318: l2i
    //   7319: ldc_w -1601006635
    //   7322: ixor
    //   7323: ldc2_w -550287196
    //   7326: l2i
    //   7327: ldc_w 1322225344
    //   7330: ixor
    //   7331: ixor
    //   7332: lookupswitch default -> 7360, -397230764 -> 7315, 982453711 -> 9038
    //   7360: goto -> 7364
    //   7363: athrow
    //   7364: invokevirtual toString : ()Ljava/lang/String;
    //   7367: goto -> 7371
    //   7370: athrow
    //   7371: getstatic Perryc.0 : I
    //   7374: ifle -> 7388
    //   7377: ldc2_w -901045716
    //   7380: l2i
    //   7381: ldc_w 1618245721
    //   7384: ixor
    //   7385: goto -> 7396
    //   7388: ldc2_w -386850522
    //   7391: l2i
    //   7392: ldc_w 674248695
    //   7395: ixor
    //   7396: ldc2_w 836570474
    //   7399: l2i
    //   7400: ldc_w 747435333
    //   7403: ixor
    //   7404: ixor
    //   7405: lookupswitch default -> 8820, -1217486246 -> 7388, -577704194 -> 7432
    //   7432: goto -> 7436
    //   7435: athrow
    //   7436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7439: goto -> 7443
    //   7442: athrow
    //   7443: ldc_w '첊㎱챯ꛌ'
    //   7446: getstatic Perryc.0 : I
    //   7449: ifle -> 7463
    //   7452: ldc2_w -1634394182
    //   7455: l2i
    //   7456: ldc_w -1449596624
    //   7459: ixor
    //   7460: goto -> 7471
    //   7463: ldc2_w -1735447464
    //   7466: l2i
    //   7467: ldc_w 1439767703
    //   7470: ixor
    //   7471: ldc2_w -1730369844
    //   7474: l2i
    //   7475: ldc_w 1504045701
    //   7478: ixor
    //   7479: ixor
    //   7480: lookupswitch default -> 7508, -986104618 -> 7463, -160122173 -> 8832
    //   7508: goto -> 7512
    //   7511: athrow
    //   7512: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7515: goto -> 7519
    //   7518: athrow
    //   7519: getstatic Perryc.c : I
    //   7522: iflt -> 7536
    //   7525: ldc2_w 1299430997
    //   7528: l2i
    //   7529: ldc_w -2018521294
    //   7532: ixor
    //   7533: goto -> 7544
    //   7536: ldc2_w -1913862336
    //   7539: l2i
    //   7540: ldc_w 423792463
    //   7543: ixor
    //   7544: ldc2_w 1618966001
    //   7547: l2i
    //   7548: ldc_w 894749711
    //   7551: ixor
    //   7552: ixor
    //   7553: lookupswitch default -> 8916, -1611151207 -> 7536, -1048186383 -> 7580
    //   7580: goto -> 7584
    //   7583: athrow
    //   7584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7587: goto -> 7591
    //   7590: athrow
    //   7591: getstatic Perryc.c : I
    //   7594: iflt -> 7608
    //   7597: ldc2_w 598996764
    //   7600: l2i
    //   7601: ldc_w 378990411
    //   7604: ixor
    //   7605: goto -> 7616
    //   7608: ldc2_w 117103047
    //   7611: l2i
    //   7612: ldc_w 297197454
    //   7615: ixor
    //   7616: ldc2_w 169041955
    //   7619: l2i
    //   7620: ldc_w -1173563007
    //   7623: ixor
    //   7624: ixor
    //   7625: lookupswitch default -> 9014, -2059755019 -> 7608, -1487683605 -> 7652
    //   7652: goto -> 7656
    //   7655: athrow
    //   7656: invokevirtual toString : ()Ljava/lang/String;
    //   7659: goto -> 7663
    //   7662: athrow
    //   7663: getstatic Perryc.c : I
    //   7666: iflt -> 7680
    //   7669: ldc2_w -875850812
    //   7672: l2i
    //   7673: ldc_w -879494563
    //   7676: ixor
    //   7677: goto -> 7688
    //   7680: ldc2_w 942262177
    //   7683: l2i
    //   7684: ldc_w -450582538
    //   7687: ixor
    //   7688: ldc2_w -370272067
    //   7691: l2i
    //   7692: ldc_w 878272295
    //   7695: ixor
    //   7696: ixor
    //   7697: lookupswitch default -> 8982, -571527677 -> 7680, 12199885 -> 7724
    //   7724: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   7727: getstatic Perryc.c : I
    //   7730: iflt -> 7744
    //   7733: ldc2_w 148052963
    //   7736: l2i
    //   7737: ldc_w 1972014809
    //   7740: ixor
    //   7741: goto -> 7752
    //   7744: ldc2_w -1944120862
    //   7747: l2i
    //   7748: ldc_w 1778844624
    //   7751: ixor
    //   7752: ldc2_w 1033436824
    //   7755: l2i
    //   7756: ldc_w -1655495386
    //   7759: ixor
    //   7760: ixor
    //   7761: lookupswitch default -> 7788, -1082002764 -> 7744, -577614204 -> 8858
    //   7788: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7791: getstatic Perryc.c : I
    //   7794: iflt -> 7808
    //   7797: ldc2_w -274208804
    //   7800: l2i
    //   7801: ldc_w -38550815
    //   7804: ixor
    //   7805: goto -> 7816
    //   7808: ldc2_w 2054440480
    //   7811: l2i
    //   7812: ldc_w 1436568858
    //   7815: ixor
    //   7816: ldc2_w 1693561524
    //   7819: l2i
    //   7820: ldc_w -1880848657
    //   7823: ixor
    //   7824: ixor
    //   7825: lookupswitch default -> 9008, -993968287 -> 7852, -117370522 -> 7808
    //   7852: aload #6
    //   7854: getstatic Perryc.c : I
    //   7857: iflt -> 7871
    //   7860: ldc2_w -522723504
    //   7863: l2i
    //   7864: ldc_w -2084450073
    //   7867: ixor
    //   7868: goto -> 7879
    //   7871: ldc2_w -747372240
    //   7874: l2i
    //   7875: ldc_w -174118562
    //   7878: ixor
    //   7879: ldc2_w -613611129
    //   7882: l2i
    //   7883: ldc_w 1021506514
    //   7886: ixor
    //   7887: ixor
    //   7888: lookupswitch default -> 7916, -2070284830 -> 8948, -1795156754 -> 7871
    //   7916: goto -> 7920
    //   7919: athrow
    //   7920: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   7923: goto -> 7927
    //   7926: athrow
    //   7927: f2i
    //   7928: getstatic Perryc.c : I
    //   7931: iflt -> 7945
    //   7934: ldc2_w 500663848
    //   7937: l2i
    //   7938: ldc_w 815792323
    //   7941: ixor
    //   7942: goto -> 7953
    //   7945: ldc2_w 1403476273
    //   7948: l2i
    //   7949: ldc_w 911795067
    //   7952: ixor
    //   7953: ldc2_w -187346668
    //   7956: l2i
    //   7957: ldc_w 1429863218
    //   7960: ixor
    //   7961: ixor
    //   7962: lookupswitch default -> 9026, -1935987507 -> 7945, -1005383572 -> 7988
    //   7988: goto -> 7992
    //   7991: athrow
    //   7992: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7995: goto -> 7999
    //   7998: athrow
    //   7999: getstatic Perryc.0 : I
    //   8002: ifle -> 8016
    //   8005: ldc2_w 1654637203
    //   8008: l2i
    //   8009: ldc_w -969640552
    //   8012: ixor
    //   8013: goto -> 8024
    //   8016: ldc2_w -1158165948
    //   8019: l2i
    //   8020: ldc_w -980635291
    //   8023: ixor
    //   8024: ldc2_w -1643959280
    //   8027: l2i
    //   8028: ldc_w 2101834563
    //   8031: ixor
    //   8032: ixor
    //   8033: lookupswitch default -> 8060, 686015949 -> 8016, 1206904920 -> 8994
    //   8060: goto -> 8064
    //   8063: athrow
    //   8064: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8069: goto -> 8073
    //   8072: athrow
    //   8073: pop
    //   8074: getstatic Perryc.1 : I
    //   8077: ifeq -> 8091
    //   8080: ldc2_w -1526010136
    //   8083: l2i
    //   8084: ldc_w 128696431
    //   8087: ixor
    //   8088: goto -> 8099
    //   8091: ldc2_w -1932614818
    //   8094: l2i
    //   8095: ldc_w -1379358544
    //   8098: ixor
    //   8099: ldc2_w -74690015
    //   8102: l2i
    //   8103: ldc_w -431358672
    //   8106: ixor
    //   8107: ixor
    //   8108: lookupswitch default -> 8136, -1083932266 -> 8932, 1513696913 -> 8091
    //   8136: aload_3
    //   8137: ldc2_w -958711061
    //   8140: l2i
    //   8141: ldc_w -958711061
    //   8144: ixor
    //   8145: getstatic Perryc.c : I
    //   8148: iflt -> 8162
    //   8151: ldc2_w 1214852163
    //   8154: l2i
    //   8155: ldc_w 1097535329
    //   8158: ixor
    //   8159: goto -> 8170
    //   8162: ldc2_w 2075332128
    //   8165: l2i
    //   8166: ldc_w -1672710231
    //   8169: ixor
    //   8170: ldc2_w 468135602
    //   8173: l2i
    //   8174: ldc_w -48860974
    //   8177: ixor
    //   8178: ixor
    //   8179: lookupswitch default -> 8928, -269255358 -> 8162, 17704937 -> 8204
    //   8204: goto -> 8208
    //   8207: athrow
    //   8208: invokevirtual setLength : (I)V
    //   8211: goto -> 8215
    //   8214: athrow
    //   8215: getstatic Perryc.c : I
    //   8218: iflt -> 8232
    //   8221: ldc2_w 768489758
    //   8224: l2i
    //   8225: ldc_w 762255345
    //   8228: ixor
    //   8229: goto -> 8240
    //   8232: ldc2_w 1873603129
    //   8235: l2i
    //   8236: ldc_w -1767639202
    //   8239: ixor
    //   8240: ldc2_w -1129815947
    //   8243: l2i
    //   8244: ldc_w -2009598207
    //   8247: ixor
    //   8248: ixor
    //   8249: lookupswitch default -> 9006, -846165485 -> 8276, 876525979 -> 8232
    //   8276: aload #4
    //   8278: ldc2_w 1792660085
    //   8281: l2i
    //   8282: ldc_w 1792660085
    //   8285: ixor
    //   8286: getstatic Perryc.0 : I
    //   8289: ifle -> 8303
    //   8292: ldc2_w -187272538
    //   8295: l2i
    //   8296: ldc_w -654266454
    //   8299: ixor
    //   8300: goto -> 8311
    //   8303: ldc2_w 1962391963
    //   8306: l2i
    //   8307: ldc_w 143477531
    //   8310: ixor
    //   8311: ldc2_w -1294417998
    //   8314: l2i
    //   8315: ldc_w -183943381
    //   8318: ixor
    //   8319: ixor
    //   8320: lookupswitch default -> 8838, 1001091609 -> 8348, 1778867605 -> 8303
    //   8348: goto -> 8352
    //   8351: athrow
    //   8352: invokevirtual setLength : (I)V
    //   8355: goto -> 8359
    //   8358: athrow
    //   8359: goto -> 1578
    //   8362: getstatic Perryc.c : I
    //   8365: iflt -> 8379
    //   8368: ldc2_w 1261838088
    //   8371: l2i
    //   8372: ldc_w 882720274
    //   8375: ixor
    //   8376: goto -> 8387
    //   8379: ldc2_w -1111635460
    //   8382: l2i
    //   8383: ldc_w 713242073
    //   8386: ixor
    //   8387: ldc2_w 1650637531
    //   8390: l2i
    //   8391: ldc_w -777992539
    //   8394: ixor
    //   8395: ixor
    //   8396: lookupswitch default -> 8424, -865510044 -> 9018, 2144745431 -> 8379
    //   8424: aload_0
    //   8425: getstatic Perryc.0 : I
    //   8428: ifle -> 8442
    //   8431: ldc2_w 812287919
    //   8434: l2i
    //   8435: ldc_w 108109821
    //   8438: ixor
    //   8439: goto -> 8450
    //   8442: ldc2_w 1742638357
    //   8445: l2i
    //   8446: ldc_w 2113424528
    //   8449: ixor
    //   8450: ldc2_w 511592874
    //   8453: l2i
    //   8454: ldc_w 1083589794
    //   8457: ixor
    //   8458: ixor
    //   8459: lookupswitch default -> 8936, 1154403469 -> 8484, 1760761178 -> 8442
    //   8484: goto -> 8488
    //   8487: athrow
    //   8488: invokeinterface isEmpty : ()Z
    //   8493: goto -> 8497
    //   8496: athrow
    //   8497: ifne -> 8511
    //   8500: ldc2_w -1362648633
    //   8503: l2i
    //   8504: ldc_w -1868422551
    //   8507: ixor
    //   8508: goto -> 8519
    //   8511: ldc2_w -1926984969
    //   8514: l2i
    //   8515: ldc_w -1287583394
    //   8518: ixor
    //   8519: ldc2_w -234192488
    //   8522: l2i
    //   8523: ldc_w 560296285
    //   8526: ixor
    //   8527: ixor
    //   8528: tableswitch default -> 8500, -318082197 -> 8552, -318082196 -> 8753
    //   8552: getstatic Perryc.c : I
    //   8555: iflt -> 8569
    //   8558: ldc2_w -1983296703
    //   8561: l2i
    //   8562: ldc_w 10916286
    //   8565: ixor
    //   8566: goto -> 8577
    //   8569: ldc2_w -1733300612
    //   8572: l2i
    //   8573: ldc_w 1530397113
    //   8576: ixor
    //   8577: ldc2_w -1697864460
    //   8580: l2i
    //   8581: ldc_w -1386467522
    //   8584: ixor
    //   8585: ixor
    //   8586: lookupswitch default -> 8612, -1090563787 -> 8886, 281589473 -> 8569
    //   8612: aload_0
    //   8613: ldc2_w -1076454652
    //   8616: l2i
    //   8617: ldc_w -1076454652
    //   8620: ixor
    //   8621: getstatic Perryc.0 : I
    //   8624: ifle -> 8638
    //   8627: ldc2_w 161752111
    //   8630: l2i
    //   8631: ldc_w 604837780
    //   8634: ixor
    //   8635: goto -> 8646
    //   8638: ldc2_w 923984983
    //   8641: l2i
    //   8642: ldc_w 1622630592
    //   8645: ixor
    //   8646: ldc2_w 827329436
    //   8649: l2i
    //   8650: ldc_w -1760180165
    //   8653: ixor
    //   8654: ixor
    //   8655: lookupswitch default -> 8954, -1947406308 -> 8638, -236959952 -> 8680
    //   8680: goto -> 8684
    //   8683: athrow
    //   8684: invokestatic sortByValue : (Ljava/util/Map;Z)Ljava/util/Map;
    //   8687: goto -> 8691
    //   8690: athrow
    //   8691: getstatic Perryc.0 : I
    //   8694: ifle -> 8708
    //   8697: ldc2_w 879964366
    //   8700: l2i
    //   8701: ldc_w 928521934
    //   8704: ixor
    //   8705: goto -> 8716
    //   8708: ldc2_w -1629837992
    //   8711: l2i
    //   8712: ldc_w 754157156
    //   8715: ixor
    //   8716: ldc2_w -346734005
    //   8719: l2i
    //   8720: ldc_w -1632214355
    //   8723: ixor
    //   8724: ixor
    //   8725: lookupswitch default -> 8752, 1364312476 -> 8708, 1992822502 -> 9004
    //   8752: astore_0
    //   8753: getstatic Perryc.1 : I
    //   8756: ifeq -> 8770
    //   8759: ldc2_w 1005933604
    //   8762: l2i
    //   8763: ldc_w -1526399004
    //   8766: ixor
    //   8767: goto -> 8778
    //   8770: ldc2_w -1845441011
    //   8773: l2i
    //   8774: ldc_w 670890246
    //   8777: ixor
    //   8778: ldc2_w 1638948380
    //   8781: l2i
    //   8782: ldc_w 1250524398
    //   8785: ixor
    //   8786: ixor
    //   8787: lookupswitch default -> 9048, -1631250951 -> 8812, -1245148878 -> 8770
    //   8812: aload_0
    //   8813: areturn
    //   8814: aconst_null
    //   8815: athrow
    //   8816: aconst_null
    //   8817: athrow
    //   8818: aconst_null
    //   8819: athrow
    //   8820: aconst_null
    //   8821: athrow
    //   8822: aconst_null
    //   8823: athrow
    //   8824: aconst_null
    //   8825: athrow
    //   8826: aconst_null
    //   8827: athrow
    //   8828: aconst_null
    //   8829: athrow
    //   8830: aconst_null
    //   8831: athrow
    //   8832: aconst_null
    //   8833: athrow
    //   8834: aconst_null
    //   8835: athrow
    //   8836: aconst_null
    //   8837: athrow
    //   8838: aconst_null
    //   8839: athrow
    //   8840: aconst_null
    //   8841: athrow
    //   8842: aconst_null
    //   8843: athrow
    //   8844: aconst_null
    //   8845: athrow
    //   8846: aconst_null
    //   8847: athrow
    //   8848: aconst_null
    //   8849: athrow
    //   8850: aconst_null
    //   8851: athrow
    //   8852: aconst_null
    //   8853: athrow
    //   8854: aconst_null
    //   8855: athrow
    //   8856: aconst_null
    //   8857: athrow
    //   8858: aconst_null
    //   8859: athrow
    //   8860: aconst_null
    //   8861: athrow
    //   8862: aconst_null
    //   8863: athrow
    //   8864: aconst_null
    //   8865: athrow
    //   8866: aconst_null
    //   8867: athrow
    //   8868: aconst_null
    //   8869: athrow
    //   8870: aconst_null
    //   8871: athrow
    //   8872: aconst_null
    //   8873: athrow
    //   8874: aconst_null
    //   8875: athrow
    //   8876: aconst_null
    //   8877: athrow
    //   8878: aconst_null
    //   8879: athrow
    //   8880: aconst_null
    //   8881: athrow
    //   8882: aconst_null
    //   8883: athrow
    //   8884: aconst_null
    //   8885: athrow
    //   8886: aconst_null
    //   8887: athrow
    //   8888: aconst_null
    //   8889: athrow
    //   8890: aconst_null
    //   8891: athrow
    //   8892: aconst_null
    //   8893: athrow
    //   8894: aconst_null
    //   8895: athrow
    //   8896: aconst_null
    //   8897: athrow
    //   8898: aconst_null
    //   8899: athrow
    //   8900: aconst_null
    //   8901: athrow
    //   8902: aconst_null
    //   8903: athrow
    //   8904: aconst_null
    //   8905: athrow
    //   8906: aconst_null
    //   8907: athrow
    //   8908: aconst_null
    //   8909: athrow
    //   8910: aconst_null
    //   8911: athrow
    //   8912: aconst_null
    //   8913: athrow
    //   8914: aconst_null
    //   8915: athrow
    //   8916: aconst_null
    //   8917: athrow
    //   8918: aconst_null
    //   8919: athrow
    //   8920: aconst_null
    //   8921: athrow
    //   8922: aconst_null
    //   8923: athrow
    //   8924: aconst_null
    //   8925: athrow
    //   8926: aconst_null
    //   8927: athrow
    //   8928: aconst_null
    //   8929: athrow
    //   8930: aconst_null
    //   8931: athrow
    //   8932: aconst_null
    //   8933: athrow
    //   8934: aconst_null
    //   8935: athrow
    //   8936: aconst_null
    //   8937: athrow
    //   8938: aconst_null
    //   8939: athrow
    //   8940: aconst_null
    //   8941: athrow
    //   8942: aconst_null
    //   8943: athrow
    //   8944: aconst_null
    //   8945: athrow
    //   8946: aconst_null
    //   8947: athrow
    //   8948: aconst_null
    //   8949: athrow
    //   8950: aconst_null
    //   8951: athrow
    //   8952: aconst_null
    //   8953: athrow
    //   8954: aconst_null
    //   8955: athrow
    //   8956: aconst_null
    //   8957: athrow
    //   8958: aconst_null
    //   8959: athrow
    //   8960: aconst_null
    //   8961: athrow
    //   8962: aconst_null
    //   8963: athrow
    //   8964: aconst_null
    //   8965: athrow
    //   8966: aconst_null
    //   8967: athrow
    //   8968: aconst_null
    //   8969: athrow
    //   8970: aconst_null
    //   8971: athrow
    //   8972: aconst_null
    //   8973: athrow
    //   8974: aconst_null
    //   8975: athrow
    //   8976: aconst_null
    //   8977: athrow
    //   8978: aconst_null
    //   8979: athrow
    //   8980: aconst_null
    //   8981: athrow
    //   8982: aconst_null
    //   8983: athrow
    //   8984: aconst_null
    //   8985: athrow
    //   8986: aconst_null
    //   8987: athrow
    //   8988: aconst_null
    //   8989: athrow
    //   8990: aconst_null
    //   8991: athrow
    //   8992: aconst_null
    //   8993: athrow
    //   8994: aconst_null
    //   8995: athrow
    //   8996: aconst_null
    //   8997: athrow
    //   8998: aconst_null
    //   8999: athrow
    //   9000: aconst_null
    //   9001: athrow
    //   9002: aconst_null
    //   9003: athrow
    //   9004: aconst_null
    //   9005: athrow
    //   9006: aconst_null
    //   9007: athrow
    //   9008: aconst_null
    //   9009: athrow
    //   9010: aconst_null
    //   9011: athrow
    //   9012: aconst_null
    //   9013: athrow
    //   9014: aconst_null
    //   9015: athrow
    //   9016: aconst_null
    //   9017: athrow
    //   9018: aconst_null
    //   9019: athrow
    //   9020: aconst_null
    //   9021: athrow
    //   9022: aconst_null
    //   9023: athrow
    //   9024: aconst_null
    //   9025: athrow
    //   9026: aconst_null
    //   9027: athrow
    //   9028: aconst_null
    //   9029: athrow
    //   9030: aconst_null
    //   9031: athrow
    //   9032: aconst_null
    //   9033: athrow
    //   9034: aconst_null
    //   9035: athrow
    //   9036: aconst_null
    //   9037: athrow
    //   9038: aconst_null
    //   9039: athrow
    //   9040: aconst_null
    //   9041: athrow
    //   9042: aconst_null
    //   9043: athrow
    //   9044: aconst_null
    //   9045: athrow
    //   9046: aconst_null
    //   9047: athrow
    //   9048: aconst_null
    //   9049: athrow
    //   9050: aconst_null
    //   9051: athrow
    //   9052: aconst_null
    //   9053: athrow
    //   9054: aconst_null
    //   9055: athrow
    //   9056: pop
    //   9057: goto -> 24
    //   9060: pop
    //   9061: aconst_null
    //   9062: goto -> 9056
    //   9065: dup
    //   9066: ifnull -> 9056
    //   9069: checkcast java/lang/Throwable
    //   9072: athrow
    //   9073: dup
    //   9074: ifnull -> 9060
    //   9077: checkcast java/lang/Throwable
    //   9080: athrow
    //   9081: aconst_null
    //   9082: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2826	5533	7	hpRaw	I
    //   3086	5273	8	hp	Ljava/lang/String;
    //   4746	3613	9	distanceInt	I
    //   5006	3353	10	distance	Ljava/lang/String;
    //   1974	6385	6	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   161	8653	0	output	Ljava/util/Map;
    //   373	8441	1	dfHealth	Ljava/text/DecimalFormat;
    //   781	8033	2	dfDistance	Ljava/text/DecimalFormat;
    //   1113	7701	3	healthSB	Ljava/lang/StringBuilder;
    //   1250	7564	4	distanceSB	Ljava/lang/StringBuilder;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	8653	0	output	Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	9065	finally
    //   91	98	98	finally
    //   91	98	3	finally
    //   91	98	3	finally
    //   92	98	91	java/lang/ClassCastException
    //   92	98	3	finally
    //   231	238	238	finally
    //   231	238	238	java/lang/ClassCastException
    //   231	238	238	java/lang/NegativeArraySizeException
    //   231	238	231	java/lang/UnsupportedOperationException
    //   232	238	238	finally
    //   304	310	310	finally
    //   304	310	3	java/lang/NegativeArraySizeException
    //   304	310	3	java/util/NoSuchElementException
    //   304	310	310	java/lang/EnumConstantNotPresentException
    //   304	310	310	java/util/ConcurrentModificationException
    //   559	566	566	finally
    //   559	566	559	java/lang/ArrayIndexOutOfBoundsException
    //   559	566	566	finally
    //   559	566	566	java/lang/IllegalArgumentException
    //   560	566	559	java/lang/UnsupportedOperationException
    //   639	646	646	finally
    //   639	646	646	finally
    //   639	646	646	finally
    //   640	646	639	finally
    //   640	646	3	java/lang/NumberFormatException
    //   712	718	718	finally
    //   712	718	3	java/lang/IndexOutOfBoundsException
    //   712	718	3	finally
    //   712	718	718	finally
    //   712	718	718	finally
    //   967	974	974	finally
    //   967	974	974	finally
    //   967	974	974	java/lang/IllegalArgumentException
    //   967	974	967	java/lang/NumberFormatException
    //   968	974	967	finally
    //   1044	1050	1050	finally
    //   1044	1050	3	finally
    //   1044	1050	3	finally
    //   1044	1050	1050	finally
    //   1044	1050	3	finally
    //   1179	1186	1186	finally
    //   1179	1186	3	java/util/ConcurrentModificationException
    //   1179	1186	3	finally
    //   1180	1186	3	finally
    //   1180	1186	1179	finally
    //   1507	1516	1516	finally
    //   1507	1516	3	finally
    //   1507	1516	1507	java/lang/IllegalArgumentException
    //   1507	1516	1516	finally
    //   1507	1516	1507	finally
    //   1707	1716	1716	finally
    //   1707	1716	1707	java/lang/ClassCastException
    //   1707	1716	3	java/lang/IndexOutOfBoundsException
    //   1708	1716	3	java/lang/IllegalStateException
    //   1708	1716	1707	java/lang/IndexOutOfBoundsException
    //   1900	1908	1908	finally
    //   1900	1908	1908	java/lang/RuntimeException
    //   1900	1908	3	finally
    //   1900	1908	3	finally
    //   1900	1908	3	java/lang/IllegalStateException
    //   2103	2110	2110	finally
    //   2104	2110	3	finally
    //   2104	2110	2103	java/util/NoSuchElementException
    //   2104	2110	2110	finally
    //   2104	2110	2110	finally
    //   2292	2298	2298	finally
    //   2292	2298	2298	java/lang/NullPointerException
    //   2292	2298	2298	java/util/NoSuchElementException
    //   2292	2298	2298	finally
    //   2292	2298	2298	java/lang/AssertionError
    //   2492	2498	2498	finally
    //   2492	2498	2498	finally
    //   2492	2498	3	java/lang/ArithmeticException
    //   2492	2498	2498	java/lang/IndexOutOfBoundsException
    //   2492	2498	2498	finally
    //   2564	2570	2570	finally
    //   2564	2570	2570	java/lang/AssertionError
    //   2564	2570	2570	java/util/NoSuchElementException
    //   2564	2570	2570	finally
    //   2564	2570	2570	finally
    //   2755	2762	2762	finally
    //   2755	2762	3	java/lang/ClassCastException
    //   2755	2762	2762	java/lang/IllegalArgumentException
    //   2756	2762	2755	finally
    //   2756	2762	2755	finally
    //   3015	3022	3022	finally
    //   3015	3022	3015	finally
    //   3015	3022	3022	finally
    //   3015	3022	3022	finally
    //   3016	3022	3015	java/lang/ArrayIndexOutOfBoundsException
    //   3215	3222	3222	finally
    //   3215	3222	3222	java/lang/ClassCastException
    //   3216	3222	3222	java/lang/IllegalArgumentException
    //   3216	3222	3	java/lang/UnsupportedOperationException
    //   3216	3222	3215	finally
    //   3287	3294	3294	finally
    //   3287	3294	3	java/util/NoSuchElementException
    //   3288	3294	3	java/lang/NullPointerException
    //   3288	3294	3287	java/lang/NegativeArraySizeException
    //   3288	3294	3287	finally
    //   3547	3554	3554	finally
    //   3547	3554	3547	finally
    //   3547	3554	3554	java/lang/NumberFormatException
    //   3548	3554	3547	java/lang/EnumConstantNotPresentException
    //   3548	3554	3	java/lang/ArithmeticException
    //   3812	3818	3818	finally
    //   3812	3818	3	java/lang/EnumConstantNotPresentException
    //   3812	3818	3	java/lang/RuntimeException
    //   3812	3818	3818	java/lang/NumberFormatException
    //   3812	3818	3	finally
    //   4075	4082	4082	finally
    //   4075	4082	4082	java/lang/NullPointerException
    //   4076	4082	4075	java/lang/AssertionError
    //   4076	4082	4075	java/lang/IllegalArgumentException
    //   4076	4082	3	java/lang/UnsupportedOperationException
    //   4215	4222	4222	finally
    //   4215	4222	4222	java/lang/NullPointerException
    //   4215	4222	3	finally
    //   4215	4222	4222	finally
    //   4216	4222	4215	java/lang/EnumConstantNotPresentException
    //   4411	4418	4418	finally
    //   4411	4418	4411	java/lang/UnsupportedOperationException
    //   4412	4418	4411	finally
    //   4412	4418	3	java/lang/NumberFormatException
    //   4412	4418	3	java/lang/AssertionError
    //   4675	4682	4682	finally
    //   4675	4682	4682	finally
    //   4675	4682	4675	finally
    //   4676	4682	4675	finally
    //   4676	4682	4682	java/lang/ArrayIndexOutOfBoundsException
    //   4935	4942	4942	finally
    //   4935	4942	3	java/lang/ArithmeticException
    //   4936	4942	4942	java/lang/NumberFormatException
    //   4936	4942	4935	java/lang/AssertionError
    //   4936	4942	4935	finally
    //   5135	5142	5142	finally
    //   5136	5142	3	java/lang/UnsupportedOperationException
    //   5136	5142	5135	java/lang/IllegalArgumentException
    //   5136	5142	5142	java/lang/ArrayIndexOutOfBoundsException
    //   5136	5142	3	java/util/ConcurrentModificationException
    //   5207	5214	5214	finally
    //   5207	5214	5207	java/util/NoSuchElementException
    //   5207	5214	5214	java/lang/StringIndexOutOfBoundsException
    //   5208	5214	5214	finally
    //   5208	5214	5214	java/util/ConcurrentModificationException
    //   5467	5474	5474	finally
    //   5467	5474	5467	java/lang/NullPointerException
    //   5467	5474	3	finally
    //   5468	5474	5467	java/lang/NumberFormatException
    //   5468	5474	5474	java/lang/RuntimeException
    //   5732	5738	5738	finally
    //   5732	5738	3	java/util/NoSuchElementException
    //   5732	5738	3	finally
    //   5732	5738	5738	java/util/ConcurrentModificationException
    //   5732	5738	5738	java/lang/EnumConstantNotPresentException
    //   5871	5878	5878	finally
    //   5871	5878	3	java/lang/RuntimeException
    //   5871	5878	3	java/lang/ArrayIndexOutOfBoundsException
    //   5871	5878	5871	java/util/ConcurrentModificationException
    //   5872	5878	5871	finally
    //   6071	6078	6078	finally
    //   6071	6078	6071	finally
    //   6071	6078	6071	finally
    //   6071	6078	3	java/lang/AssertionError
    //   6072	6078	3	finally
    //   6208	6214	6214	finally
    //   6208	6214	3	java/lang/NumberFormatException
    //   6208	6214	6214	finally
    //   6208	6214	6214	java/lang/IllegalStateException
    //   6208	6214	3	finally
    //   6339	6346	6346	finally
    //   6339	6346	6339	java/lang/ArithmeticException
    //   6339	6346	6346	java/lang/NumberFormatException
    //   6340	6346	6346	java/lang/EnumConstantNotPresentException
    //   6340	6346	6339	java/util/NoSuchElementException
    //   6412	6418	6418	finally
    //   6412	6418	6418	java/lang/StringIndexOutOfBoundsException
    //   6412	6418	3	finally
    //   6412	6418	6418	java/lang/IllegalArgumentException
    //   6412	6418	3	java/lang/NumberFormatException
    //   6487	6494	6494	finally
    //   6487	6494	6487	java/lang/NegativeArraySizeException
    //   6487	6494	6494	java/lang/ArithmeticException
    //   6488	6494	3	java/lang/StringIndexOutOfBoundsException
    //   6488	6494	3	java/lang/IllegalStateException
    //   6687	6694	6694	finally
    //   6687	6694	6687	java/lang/NegativeArraySizeException
    //   6687	6694	6687	java/util/ConcurrentModificationException
    //   6687	6694	3	finally
    //   6688	6694	6687	finally
    //   6943	6950	6950	finally
    //   6943	6950	6950	java/lang/NumberFormatException
    //   6943	6950	6950	finally
    //   6944	6950	6943	java/lang/NullPointerException
    //   6944	6950	6943	finally
    //   7079	7086	7086	finally
    //   7079	7086	3	finally
    //   7079	7086	7079	finally
    //   7080	7086	3	finally
    //   7080	7086	7079	java/lang/NullPointerException
    //   7151	7158	7158	finally
    //   7151	7158	3	finally
    //   7151	7158	7151	finally
    //   7152	7158	7158	finally
    //   7152	7158	7158	finally
    //   7228	7234	7234	finally
    //   7228	7234	3	java/lang/NegativeArraySizeException
    //   7228	7234	3	finally
    //   7228	7234	3	java/lang/IllegalStateException
    //   7228	7234	7234	java/util/NoSuchElementException
    //   7364	7370	7370	finally
    //   7364	7370	7370	finally
    //   7364	7370	3	java/lang/AssertionError
    //   7364	7370	3	java/lang/StringIndexOutOfBoundsException
    //   7364	7370	3	java/lang/AssertionError
    //   7436	7442	7442	finally
    //   7436	7442	3	java/util/ConcurrentModificationException
    //   7436	7442	7442	finally
    //   7436	7442	3	finally
    //   7436	7442	3	java/lang/AssertionError
    //   7512	7518	7518	finally
    //   7512	7518	7518	java/lang/AssertionError
    //   7512	7518	3	finally
    //   7512	7518	7518	finally
    //   7512	7518	3	java/util/ConcurrentModificationException
    //   7583	7590	7590	finally
    //   7583	7590	7583	java/lang/AssertionError
    //   7583	7590	7590	finally
    //   7583	7590	7583	finally
    //   7584	7590	7590	finally
    //   7656	7662	7662	finally
    //   7656	7662	3	java/lang/NegativeArraySizeException
    //   7656	7662	7662	java/lang/NumberFormatException
    //   7656	7662	3	java/lang/IllegalStateException
    //   7656	7662	3	finally
    //   7920	7926	7926	finally
    //   7920	7926	7926	java/lang/NullPointerException
    //   7920	7926	7926	java/lang/StringIndexOutOfBoundsException
    //   7920	7926	3	java/util/NoSuchElementException
    //   7920	7926	3	finally
    //   7991	7998	7998	finally
    //   7991	7998	7991	java/lang/ClassCastException
    //   7991	7998	3	java/lang/NumberFormatException
    //   7991	7998	3	finally
    //   7992	7998	3	java/lang/NegativeArraySizeException
    //   8063	8072	8072	finally
    //   8063	8072	8063	java/util/NoSuchElementException
    //   8063	8072	8072	finally
    //   8064	8072	8063	java/lang/RuntimeException
    //   8064	8072	8072	java/lang/RuntimeException
    //   8208	8214	8214	finally
    //   8208	8214	3	java/util/ConcurrentModificationException
    //   8208	8214	8214	java/util/ConcurrentModificationException
    //   8208	8214	8214	finally
    //   8208	8214	3	finally
    //   8351	8358	8358	finally
    //   8351	8358	3	java/lang/IllegalArgumentException
    //   8351	8358	3	java/util/ConcurrentModificationException
    //   8352	8358	8351	java/lang/ArrayIndexOutOfBoundsException
    //   8352	8358	8358	finally
    //   8487	8496	8496	finally
    //   8487	8496	8496	java/lang/AssertionError
    //   8487	8496	3	java/lang/NegativeArraySizeException
    //   8488	8496	8496	java/lang/IllegalArgumentException
    //   8488	8496	8487	java/lang/IndexOutOfBoundsException
    //   8683	8690	8690	finally
    //   8683	8690	8683	finally
    //   8684	8690	8683	finally
    //   8684	8690	8690	java/lang/ArithmeticException
    //   8684	8690	8683	java/lang/AssertionError
    //   9065	9073	9065	finally
    //   9081	9083	3	finally
  }
  
  public static Vec3d[] getHeightOffsets(int min, int max) {
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
  
  public static float getHealth(Entity entity, boolean absorption) {
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
  
  public static boolean isMoving(EntityLivingBase paramEntityLivingBase) {
    return Perry1.6c(null, (int)181513100L ^ 0x57FD59D8, paramEntityLivingBase);
  }
  
  public static Vec3d[] getTrapOffsets(boolean antiScaffold, boolean antiStep, boolean legs, boolean platform, boolean antiDrop) {
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
  
  public static double getDst(Vec3d paramVec3d) {
    return Perry1.13(null, (int)-2085299981L ^ 0xCE9FEDB7, paramVec3d);
  }
  
  public static boolean isSafe(Entity paramEntity, int paramInt, boolean paramBoolean) {
    return Perry1.t(null, (int)1773223784L ^ 0x3E276DC6, paramEntity, paramInt, paramBoolean);
  }
  
  public static EntityPlayer getClosestEnemy(double paramDouble) {
    return Perry1.4U(null, (int)1226238715L ^ 0x71BA5C1, paramDouble);
  }
  
  public static double getEntitySpeed(Entity paramEntity) {
    return Perry1.5H(null, (int)-1771803634L ^ 0x85913C75, paramEntity);
  }
  
  public static boolean lambda$getNearbyPlayers$1(double range, EntityPlayer entityPlayer) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 455
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 447
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 439
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1237564713
    //   33: l2i
    //   34: ldc_w -620791154
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -451743473
    //   44: l2i
    //   45: ldc_w -2086833527
    //   48: ixor
    //   49: ldc2_w 2050109757
    //   52: l2i
    //   53: ldc_w 243050319
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1937745813 -> 41, 411938347 -> 426
    //   84: getstatic bigname/zprestige/webhack/util/EntityUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w -721817568
    //   96: l2i
    //   97: ldc_w -1273616685
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -1906323950
    //   107: l2i
    //   108: ldc_w 321533907
    //   111: ixor
    //   112: ldc2_w 1564864191
    //   115: l2i
    //   116: ldc_w 1695551044
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -1993167206 -> 104, 1488598536 -> 424
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w 137631529
    //   160: l2i
    //   161: ldc_w 1166652137
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 1242119042
    //   171: l2i
    //   172: ldc_w -972496872
    //   175: ixor
    //   176: ldc2_w 1082706399
    //   179: l2i
    //   180: ldc_w 1670858464
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 428, -1356966747 -> 212, 1856121599 -> 168
    //   212: aload_2
    //   213: getstatic Perryc.0 : I
    //   216: ifle -> 230
    //   219: ldc2_w 1335154990
    //   222: l2i
    //   223: ldc_w 903766530
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 640448400
    //   233: l2i
    //   234: ldc_w 2032874915
    //   237: ixor
    //   238: ldc2_w -297534097
    //   241: l2i
    //   242: ldc_w -1147895221
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 420, 181419287 -> 272, 798868488 -> 230
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   279: goto -> 283
    //   282: athrow
    //   283: f2d
    //   284: getstatic Perryc.1 : I
    //   287: ifeq -> 301
    //   290: ldc2_w -606470188
    //   293: l2i
    //   294: ldc_w -616180536
    //   297: ixor
    //   298: goto -> 309
    //   301: ldc2_w -1963174342
    //   304: l2i
    //   305: ldc_w 1925047588
    //   308: ixor
    //   309: ldc2_w 245899868
    //   312: l2i
    //   313: ldc_w -1600501553
    //   316: ixor
    //   317: ixor
    //   318: lookupswitch default -> 344, -1364311665 -> 422, 2070409144 -> 301
    //   344: dload_0
    //   345: dcmpg
    //   346: ifgt -> 360
    //   349: ldc2_w 393440655
    //   352: l2i
    //   353: ldc_w 2070000286
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 210223313
    //   363: l2i
    //   364: ldc_w 1620385731
    //   367: ixor
    //   368: ldc2_w -948396302
    //   371: l2i
    //   372: ldc_w 1478050474
    //   375: ixor
    //   376: ixor
    //   377: tableswitch default -> 349, -210566327 -> 400, -210566326 -> 411
    //   400: ldc2_w 1692893785
    //   403: l2i
    //   404: ldc_w 1692893784
    //   407: ixor
    //   408: goto -> 419
    //   411: ldc2_w -1744608467
    //   414: l2i
    //   415: ldc_w -1744608467
    //   418: ixor
    //   419: ireturn
    //   420: aconst_null
    //   421: athrow
    //   422: aconst_null
    //   423: athrow
    //   424: aconst_null
    //   425: athrow
    //   426: aconst_null
    //   427: athrow
    //   428: aconst_null
    //   429: athrow
    //   430: pop
    //   431: goto -> 24
    //   434: pop
    //   435: aconst_null
    //   436: goto -> 430
    //   439: dup
    //   440: ifnull -> 430
    //   443: checkcast java/lang/Throwable
    //   446: athrow
    //   447: dup
    //   448: ifnull -> 434
    //   451: checkcast java/lang/Throwable
    //   454: athrow
    //   455: aconst_null
    //   456: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	396	0	range	D
    //   24	396	2	entityPlayer	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   8	20	439	java/lang/ArrayIndexOutOfBoundsException
    //   275	282	282	finally
    //   275	282	3	finally
    //   275	282	3	java/lang/ClassCastException
    //   276	282	275	java/lang/AssertionError
    //   276	282	3	java/lang/AssertionError
    //   439	447	439	java/lang/EnumConstantNotPresentException
    //   455	457	3	finally
  }
  
  public static Vec3d[] getUnsafeBlockArrayFromVec3d(Vec3d paramVec3d, int paramInt, boolean paramBoolean) {
    return Perry1.0E(null, (int)616119846L ^ 0x22A5578D, paramVec3d, paramInt, paramBoolean);
  }
  
  public static boolean isDrivenByPlayer(Entity paramEntity) {
    return Perry1.5W(null, (int)1061635186L ^ 0x5AC60C23, paramEntity);
  }
  
  public static boolean isPlayer(Entity paramEntity) {
    return Perry1.5P(null, (int)1530594284L ^ 0x20A128BC, paramEntity);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\EntityUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */