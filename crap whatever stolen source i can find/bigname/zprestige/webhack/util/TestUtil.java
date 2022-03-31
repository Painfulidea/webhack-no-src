package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class TestUtil {
  public static List<Block> emptyBlocks;
  
  public static Minecraft mc;
  
  public static List<Block> rightclickableBlocks;
  
  static {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1176866418
    //   9: l2i
    //   10: ldc 1843800669
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1322555744
    //   19: l2i
    //   20: ldc 1340090013
    //   22: ixor
    //   23: ldc2_w -343982932
    //   26: l2i
    //   27: ldc -728117863
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 164199976 -> 16, 337990938 -> 5082
    //   56: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w -165468316
    //   68: l2i
    //   69: ldc -1993072813
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -867861573
    //   78: l2i
    //   79: ldc 1707693864
    //   81: ixor
    //   82: ldc2_w -541339838
    //   85: l2i
    //   86: ldc -293051566
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, 665568279 -> 75, 1311020071 -> 5090
    //   116: putstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   119: ldc2_w -770279603
    //   122: l2i
    //   123: ldc -770279612
    //   125: ixor
    //   126: anewarray net/minecraft/block/Block
    //   129: dup
    //   130: ldc2_w 1445862723
    //   133: l2i
    //   134: ldc 1445862723
    //   136: ixor
    //   137: getstatic Perryc.1 : I
    //   140: ifeq -> 153
    //   143: ldc2_w -632421808
    //   146: l2i
    //   147: ldc -1648312426
    //   149: ixor
    //   150: goto -> 160
    //   153: ldc2_w 1976551824
    //   156: l2i
    //   157: ldc -1590232818
    //   159: ixor
    //   160: ldc2_w -1069190442
    //   163: l2i
    //   164: ldc -1095580624
    //   166: ixor
    //   167: ixor
    //   168: lookupswitch default -> 5010, -1441888648 -> 196, 964234016 -> 153
    //   196: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   199: aastore
    //   200: dup
    //   201: ldc2_w -441900510
    //   204: l2i
    //   205: ldc -441900509
    //   207: ixor
    //   208: getstatic Perryc.c : I
    //   211: iflt -> 224
    //   214: ldc2_w -99802838
    //   217: l2i
    //   218: ldc 1602500820
    //   220: ixor
    //   221: goto -> 231
    //   224: ldc2_w -200812906
    //   227: l2i
    //   228: ldc 1662757626
    //   230: ixor
    //   231: ldc2_w 1899892444
    //   234: l2i
    //   235: ldc 1932452850
    //   237: ixor
    //   238: ixor
    //   239: lookupswitch default -> 264, -1483082544 -> 5012, -1335104677 -> 224
    //   264: getstatic net/minecraft/init/Blocks.field_150356_k : Lnet/minecraft/block/BlockDynamicLiquid;
    //   267: aastore
    //   268: dup
    //   269: ldc2_w 555861896
    //   272: l2i
    //   273: ldc 555861898
    //   275: ixor
    //   276: getstatic Perryc.1 : I
    //   279: ifeq -> 292
    //   282: ldc2_w 1554034725
    //   285: l2i
    //   286: ldc -786048205
    //   288: ixor
    //   289: goto -> 299
    //   292: ldc2_w 617021914
    //   295: l2i
    //   296: ldc -93205493
    //   298: ixor
    //   299: ldc2_w 689187164
    //   302: l2i
    //   303: ldc -404217890
    //   305: ixor
    //   306: ixor
    //   307: lookupswitch default -> 332, 474289252 -> 292, 1132027284 -> 4980
    //   332: getstatic net/minecraft/init/Blocks.field_150353_l : Lnet/minecraft/block/BlockStaticLiquid;
    //   335: aastore
    //   336: dup
    //   337: ldc2_w 82549983
    //   340: l2i
    //   341: ldc 82549980
    //   343: ixor
    //   344: getstatic Perryc.0 : I
    //   347: ifle -> 360
    //   350: ldc2_w -1681073046
    //   353: l2i
    //   354: ldc -836204663
    //   356: ixor
    //   357: goto -> 367
    //   360: ldc2_w -145278847
    //   363: l2i
    //   364: ldc -1629408166
    //   366: ixor
    //   367: ldc2_w 162550903
    //   370: l2i
    //   371: ldc -1694250063
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 400, -950549467 -> 5014, -110068492 -> 360
    //   400: getstatic net/minecraft/init/Blocks.field_150358_i : Lnet/minecraft/block/BlockDynamicLiquid;
    //   403: aastore
    //   404: dup
    //   405: ldc2_w 1363609503
    //   408: l2i
    //   409: ldc 1363609499
    //   411: ixor
    //   412: getstatic Perryc.1 : I
    //   415: ifeq -> 428
    //   418: ldc2_w 1953570076
    //   421: l2i
    //   422: ldc 1609798957
    //   424: ixor
    //   425: goto -> 435
    //   428: ldc2_w 1086933277
    //   431: l2i
    //   432: ldc 676444904
    //   434: ixor
    //   435: ldc2_w -2079512046
    //   438: l2i
    //   439: ldc -302317960
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, 1114987611 -> 5058, 1780980621 -> 428
    //   468: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   471: aastore
    //   472: dup
    //   473: ldc2_w -2074508938
    //   476: l2i
    //   477: ldc -2074508941
    //   479: ixor
    //   480: getstatic Perryc.1 : I
    //   483: ifeq -> 496
    //   486: ldc2_w -1423904670
    //   489: l2i
    //   490: ldc -873983682
    //   492: ixor
    //   493: goto -> 503
    //   496: ldc2_w -1584809795
    //   499: l2i
    //   500: ldc 717117405
    //   502: ixor
    //   503: ldc2_w -1973233533
    //   506: l2i
    //   507: ldc -723118338
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 4974, -709680867 -> 536, 1045180193 -> 496
    //   536: getstatic net/minecraft/init/Blocks.field_150395_bd : Lnet/minecraft/block/Block;
    //   539: aastore
    //   540: dup
    //   541: ldc2_w 1814843390
    //   544: l2i
    //   545: ldc 1814843384
    //   547: ixor
    //   548: getstatic Perryc.0 : I
    //   551: ifle -> 564
    //   554: ldc2_w -947997406
    //   557: l2i
    //   558: ldc -454516835
    //   560: ixor
    //   561: goto -> 571
    //   564: ldc2_w 2049164027
    //   567: l2i
    //   568: ldc -1527382845
    //   570: ixor
    //   571: ldc2_w -1287928000
    //   574: l2i
    //   575: ldc -1004933372
    //   577: ixor
    //   578: ixor
    //   579: lookupswitch default -> 5072, -1443621252 -> 604, 1421083387 -> 564
    //   604: getstatic net/minecraft/init/Blocks.field_150431_aC : Lnet/minecraft/block/Block;
    //   607: aastore
    //   608: dup
    //   609: ldc2_w -1041220360
    //   612: l2i
    //   613: ldc -1041220353
    //   615: ixor
    //   616: getstatic Perryc.1 : I
    //   619: ifeq -> 632
    //   622: ldc2_w -1067281621
    //   625: l2i
    //   626: ldc 1878781329
    //   628: ixor
    //   629: goto -> 639
    //   632: ldc2_w -1711882056
    //   635: l2i
    //   636: ldc -81637516
    //   638: ixor
    //   639: ldc2_w -166121841
    //   642: l2i
    //   643: ldc 1842350662
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -437597055 -> 632, 877681267 -> 5050
    //   672: getstatic net/minecraft/init/Blocks.field_150329_H : Lnet/minecraft/block/BlockTallGrass;
    //   675: aastore
    //   676: dup
    //   677: ldc2_w 1915915061
    //   680: l2i
    //   681: ldc 1915915069
    //   683: ixor
    //   684: getstatic Perryc.0 : I
    //   687: ifle -> 700
    //   690: ldc2_w 575208131
    //   693: l2i
    //   694: ldc 597367443
    //   696: ixor
    //   697: goto -> 707
    //   700: ldc2_w 2012270861
    //   703: l2i
    //   704: ldc -1273292051
    //   706: ixor
    //   707: ldc2_w 1239606840
    //   710: l2i
    //   711: ldc -1446847688
    //   713: ixor
    //   714: ixor
    //   715: lookupswitch default -> 5040, -504111792 -> 700, 600569568 -> 740
    //   740: getstatic net/minecraft/init/Blocks.field_150480_ab : Lnet/minecraft/block/BlockFire;
    //   743: aastore
    //   744: getstatic Perryc.0 : I
    //   747: ifle -> 760
    //   750: ldc2_w 2047614092
    //   753: l2i
    //   754: ldc 1990044489
    //   756: ixor
    //   757: goto -> 767
    //   760: ldc2_w -889155172
    //   763: l2i
    //   764: ldc -313992665
    //   766: ixor
    //   767: ldc2_w 581831501
    //   770: l2i
    //   771: ldc 1323417579
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 800, -731446036 -> 760, 1625162595 -> 4962
    //   800: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 819
    //   809: ldc2_w -2031505634
    //   812: l2i
    //   813: ldc 65664954
    //   815: ixor
    //   816: goto -> 826
    //   819: ldc2_w 501544682
    //   822: l2i
    //   823: ldc 1973800844
    //   825: ixor
    //   826: ldc2_w -2058168902
    //   829: l2i
    //   830: ldc 1030794596
    //   832: ixor
    //   833: ixor
    //   834: lookupswitch default -> 860, -1816027409 -> 819, 1025646714 -> 4990
    //   860: putstatic bigname/zprestige/webhack/util/TestUtil.emptyBlocks : Ljava/util/List;
    //   863: ldc2_w 335176795
    //   866: l2i
    //   867: ldc 335176812
    //   869: ixor
    //   870: anewarray net/minecraft/block/Block
    //   873: dup
    //   874: ldc2_w 2059248157
    //   877: l2i
    //   878: ldc 2059248157
    //   880: ixor
    //   881: getstatic Perryc.0 : I
    //   884: ifle -> 897
    //   887: ldc2_w -377687063
    //   890: l2i
    //   891: ldc -1646129154
    //   893: ixor
    //   894: goto -> 904
    //   897: ldc2_w 975939316
    //   900: l2i
    //   901: ldc 1423878720
    //   903: ixor
    //   904: ldc2_w -1334618459
    //   907: l2i
    //   908: ldc -1721893678
    //   910: ixor
    //   911: ixor
    //   912: lookupswitch default -> 940, 1571837536 -> 5076, 1592548226 -> 897
    //   940: getstatic net/minecraft/init/Blocks.field_150486_ae : Lnet/minecraft/block/BlockChest;
    //   943: aastore
    //   944: dup
    //   945: ldc2_w -890683349
    //   948: l2i
    //   949: ldc -890683350
    //   951: ixor
    //   952: getstatic Perryc.0 : I
    //   955: ifle -> 968
    //   958: ldc2_w -305742786
    //   961: l2i
    //   962: ldc -664499670
    //   964: ixor
    //   965: goto -> 975
    //   968: ldc2_w 492286542
    //   971: l2i
    //   972: ldc 43710140
    //   974: ixor
    //   975: ldc2_w 519219205
    //   978: l2i
    //   979: ldc -466958878
    //   981: ixor
    //   982: ixor
    //   983: lookupswitch default -> 1008, -814064653 -> 4986, 1038128824 -> 968
    //   1008: getstatic net/minecraft/init/Blocks.field_150447_bR : Lnet/minecraft/block/Block;
    //   1011: aastore
    //   1012: dup
    //   1013: ldc2_w 846722151
    //   1016: l2i
    //   1017: ldc_w 846722149
    //   1020: ixor
    //   1021: getstatic Perryc.1 : I
    //   1024: ifeq -> 1038
    //   1027: ldc2_w 1148365556
    //   1030: l2i
    //   1031: ldc_w 122515297
    //   1034: ixor
    //   1035: goto -> 1046
    //   1038: ldc2_w -2014718479
    //   1041: l2i
    //   1042: ldc_w 1511062003
    //   1045: ixor
    //   1046: ldc2_w 1224498818
    //   1049: l2i
    //   1050: ldc_w 191906890
    //   1053: ixor
    //   1054: ixor
    //   1055: lookupswitch default -> 1080, -849281819 -> 1038, 11788125 -> 5016
    //   1080: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   1083: aastore
    //   1084: dup
    //   1085: ldc2_w 1424076770
    //   1088: l2i
    //   1089: ldc_w 1424076769
    //   1092: ixor
    //   1093: getstatic Perryc.c : I
    //   1096: iflt -> 1110
    //   1099: ldc2_w 1492586782
    //   1102: l2i
    //   1103: ldc_w 1103993671
    //   1106: ixor
    //   1107: goto -> 1118
    //   1110: ldc2_w 1687190393
    //   1113: l2i
    //   1114: ldc_w 1591668528
    //   1117: ixor
    //   1118: ldc2_w 541917482
    //   1121: l2i
    //   1122: ldc_w 2127441838
    //   1125: ixor
    //   1126: ixor
    //   1127: lookupswitch default -> 1152, 696634754 -> 1110, 1203348701 -> 5092
    //   1152: getstatic net/minecraft/init/Blocks.field_190977_dl : Lnet/minecraft/block/Block;
    //   1155: aastore
    //   1156: dup
    //   1157: ldc2_w 906085863
    //   1160: l2i
    //   1161: ldc_w 906085859
    //   1164: ixor
    //   1165: getstatic Perryc.c : I
    //   1168: iflt -> 1182
    //   1171: ldc2_w 1900852461
    //   1174: l2i
    //   1175: ldc_w -2108786142
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w -698017083
    //   1185: l2i
    //   1186: ldc_w 744233572
    //   1189: ixor
    //   1190: ldc2_w -1510316802
    //   1193: l2i
    //   1194: ldc_w 1641260570
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 4988, 925568043 -> 1182, 1041285701 -> 1224
    //   1224: getstatic net/minecraft/init/Blocks.field_190978_dm : Lnet/minecraft/block/Block;
    //   1227: aastore
    //   1228: dup
    //   1229: ldc2_w -1466061716
    //   1232: l2i
    //   1233: ldc_w -1466061719
    //   1236: ixor
    //   1237: getstatic Perryc.1 : I
    //   1240: ifeq -> 1254
    //   1243: ldc2_w -278806210
    //   1246: l2i
    //   1247: ldc_w 2054981063
    //   1250: ixor
    //   1251: goto -> 1262
    //   1254: ldc2_w -1955841598
    //   1257: l2i
    //   1258: ldc_w 766704352
    //   1261: ixor
    //   1262: ldc2_w 348585175
    //   1265: l2i
    //   1266: ldc_w 891233893
    //   1269: ixor
    //   1270: ixor
    //   1271: lookupswitch default -> 5052, -2029577840 -> 1296, -1262182837 -> 1254
    //   1296: getstatic net/minecraft/init/Blocks.field_190979_dn : Lnet/minecraft/block/Block;
    //   1299: aastore
    //   1300: dup
    //   1301: ldc2_w 1690850778
    //   1304: l2i
    //   1305: ldc_w 1690850780
    //   1308: ixor
    //   1309: getstatic Perryc.0 : I
    //   1312: ifle -> 1326
    //   1315: ldc2_w -1291175233
    //   1318: l2i
    //   1319: ldc_w -1455312849
    //   1322: ixor
    //   1323: goto -> 1334
    //   1326: ldc2_w 2055474799
    //   1329: l2i
    //   1330: ldc_w -733677785
    //   1333: ixor
    //   1334: ldc2_w -881435009
    //   1337: l2i
    //   1338: ldc_w 261807460
    //   1341: ixor
    //   1342: ixor
    //   1343: lookupswitch default -> 1368, -559478389 -> 4982, 309504582 -> 1326
    //   1368: getstatic net/minecraft/init/Blocks.field_190980_do : Lnet/minecraft/block/Block;
    //   1371: aastore
    //   1372: dup
    //   1373: ldc2_w -475580211
    //   1376: l2i
    //   1377: ldc_w -475580214
    //   1380: ixor
    //   1381: getstatic Perryc.c : I
    //   1384: iflt -> 1398
    //   1387: ldc2_w 525925111
    //   1390: l2i
    //   1391: ldc_w 1733021018
    //   1394: ixor
    //   1395: goto -> 1406
    //   1398: ldc2_w 2087494131
    //   1401: l2i
    //   1402: ldc_w -842259411
    //   1405: ixor
    //   1406: ldc2_w -130912760
    //   1409: l2i
    //   1410: ldc_w 1844948567
    //   1413: ixor
    //   1414: ixor
    //   1415: lookupswitch default -> 5094, -304678926 -> 1398, 610616705 -> 1440
    //   1440: getstatic net/minecraft/init/Blocks.field_190981_dp : Lnet/minecraft/block/Block;
    //   1443: aastore
    //   1444: dup
    //   1445: ldc2_w -378845563
    //   1448: l2i
    //   1449: ldc_w -378845555
    //   1452: ixor
    //   1453: getstatic Perryc.c : I
    //   1456: iflt -> 1470
    //   1459: ldc2_w 1509690049
    //   1462: l2i
    //   1463: ldc_w -171972172
    //   1466: ixor
    //   1467: goto -> 1478
    //   1470: ldc2_w -1596149281
    //   1473: l2i
    //   1474: ldc_w 1973035848
    //   1477: ixor
    //   1478: ldc2_w -1297192419
    //   1481: l2i
    //   1482: ldc_w -597403918
    //   1485: ixor
    //   1486: ixor
    //   1487: lookupswitch default -> 5002, -1148408200 -> 1512, -1031151718 -> 1470
    //   1512: getstatic net/minecraft/init/Blocks.field_190982_dq : Lnet/minecraft/block/Block;
    //   1515: aastore
    //   1516: dup
    //   1517: ldc2_w -720412032
    //   1520: l2i
    //   1521: ldc_w -720412023
    //   1524: ixor
    //   1525: getstatic Perryc.1 : I
    //   1528: ifeq -> 1542
    //   1531: ldc2_w 55696528
    //   1534: l2i
    //   1535: ldc_w -1942586646
    //   1538: ixor
    //   1539: goto -> 1550
    //   1542: ldc2_w 1258389605
    //   1545: l2i
    //   1546: ldc_w -2089288400
    //   1549: ixor
    //   1550: ldc2_w -129949033
    //   1553: l2i
    //   1554: ldc_w 1416455318
    //   1557: ixor
    //   1558: ixor
    //   1559: lookupswitch default -> 1584, 592175227 -> 5038, 1326697338 -> 1542
    //   1584: getstatic net/minecraft/init/Blocks.field_190983_dr : Lnet/minecraft/block/Block;
    //   1587: aastore
    //   1588: dup
    //   1589: ldc2_w 1548982635
    //   1592: l2i
    //   1593: ldc_w 1548982625
    //   1596: ixor
    //   1597: getstatic Perryc.c : I
    //   1600: iflt -> 1614
    //   1603: ldc2_w 2068737250
    //   1606: l2i
    //   1607: ldc_w 1121051243
    //   1610: ixor
    //   1611: goto -> 1622
    //   1614: ldc2_w 1592910353
    //   1617: l2i
    //   1618: ldc_w -1260636029
    //   1621: ixor
    //   1622: ldc2_w -2118947744
    //   1625: l2i
    //   1626: ldc_w -980461945
    //   1629: ixor
    //   1630: ixor
    //   1631: lookupswitch default -> 4960, -1374560139 -> 1656, 2107880558 -> 1614
    //   1656: getstatic net/minecraft/init/Blocks.field_190984_ds : Lnet/minecraft/block/Block;
    //   1659: aastore
    //   1660: dup
    //   1661: ldc2_w 1984001134
    //   1664: l2i
    //   1665: ldc_w 1984001125
    //   1668: ixor
    //   1669: getstatic Perryc.0 : I
    //   1672: ifle -> 1686
    //   1675: ldc2_w -2122100611
    //   1678: l2i
    //   1679: ldc_w -1136531222
    //   1682: ixor
    //   1683: goto -> 1694
    //   1686: ldc2_w 637611616
    //   1689: l2i
    //   1690: ldc_w 1102284367
    //   1693: ixor
    //   1694: ldc2_w 1147706033
    //   1697: l2i
    //   1698: ldc_w 1474179121
    //   1701: ixor
    //   1702: ixor
    //   1703: lookupswitch default -> 1728, 779358743 -> 5084, 1517198267 -> 1686
    //   1728: getstatic net/minecraft/init/Blocks.field_190985_dt : Lnet/minecraft/block/Block;
    //   1731: aastore
    //   1732: dup
    //   1733: ldc2_w 1094455620
    //   1736: l2i
    //   1737: ldc_w 1094455624
    //   1740: ixor
    //   1741: getstatic Perryc.0 : I
    //   1744: ifle -> 1758
    //   1747: ldc2_w 1880241641
    //   1750: l2i
    //   1751: ldc_w -1705277923
    //   1754: ixor
    //   1755: goto -> 1766
    //   1758: ldc2_w -254382378
    //   1761: l2i
    //   1762: ldc_w 1639165808
    //   1765: ixor
    //   1766: ldc2_w 1756882550
    //   1769: l2i
    //   1770: ldc_w -334177988
    //   1773: ixor
    //   1774: ixor
    //   1775: lookupswitch default -> 5022, 365362924 -> 1800, 1860865214 -> 1758
    //   1800: getstatic net/minecraft/init/Blocks.field_190986_du : Lnet/minecraft/block/Block;
    //   1803: aastore
    //   1804: dup
    //   1805: ldc2_w -316374381
    //   1808: l2i
    //   1809: ldc_w -316374370
    //   1812: ixor
    //   1813: getstatic Perryc.0 : I
    //   1816: ifle -> 1830
    //   1819: ldc2_w 1853381155
    //   1822: l2i
    //   1823: ldc_w 1772939840
    //   1826: ixor
    //   1827: goto -> 1838
    //   1830: ldc2_w -1164648909
    //   1833: l2i
    //   1834: ldc_w 784419378
    //   1837: ixor
    //   1838: ldc2_w 694116003
    //   1841: l2i
    //   1842: ldc_w 2004342309
    //   1845: ixor
    //   1846: ixor
    //   1847: lookupswitch default -> 5028, -897770361 -> 1872, 1509701861 -> 1830
    //   1872: getstatic net/minecraft/init/Blocks.field_190987_dv : Lnet/minecraft/block/Block;
    //   1875: aastore
    //   1876: dup
    //   1877: ldc2_w 545158771
    //   1880: l2i
    //   1881: ldc_w 545158781
    //   1884: ixor
    //   1885: getstatic Perryc.1 : I
    //   1888: ifeq -> 1902
    //   1891: ldc2_w -180703741
    //   1894: l2i
    //   1895: ldc_w -186295970
    //   1898: ixor
    //   1899: goto -> 1910
    //   1902: ldc2_w 867834272
    //   1905: l2i
    //   1906: ldc_w 633213972
    //   1909: ixor
    //   1910: ldc2_w 887184453
    //   1913: l2i
    //   1914: ldc_w 806503457
    //   1917: ixor
    //   1918: ixor
    //   1919: lookupswitch default -> 1944, -773208748 -> 1902, 86830905 -> 5000
    //   1944: getstatic net/minecraft/init/Blocks.field_190988_dw : Lnet/minecraft/block/Block;
    //   1947: aastore
    //   1948: dup
    //   1949: ldc2_w -1662099093
    //   1952: l2i
    //   1953: ldc_w -1662099100
    //   1956: ixor
    //   1957: getstatic Perryc.1 : I
    //   1960: ifeq -> 1974
    //   1963: ldc2_w 297734324
    //   1966: l2i
    //   1967: ldc_w -1905842393
    //   1970: ixor
    //   1971: goto -> 1982
    //   1974: ldc2_w 1821928332
    //   1977: l2i
    //   1978: ldc_w -637379898
    //   1981: ixor
    //   1982: ldc2_w 223711009
    //   1985: l2i
    //   1986: ldc_w -913845795
    //   1989: ixor
    //   1990: ixor
    //   1991: lookupswitch default -> 5086, 1527409007 -> 1974, 1917349814 -> 2016
    //   2016: getstatic net/minecraft/init/Blocks.field_190989_dx : Lnet/minecraft/block/Block;
    //   2019: aastore
    //   2020: dup
    //   2021: ldc2_w 1004690724
    //   2024: l2i
    //   2025: ldc_w 1004690740
    //   2028: ixor
    //   2029: getstatic Perryc.0 : I
    //   2032: ifle -> 2046
    //   2035: ldc2_w 1036583352
    //   2038: l2i
    //   2039: ldc_w -118298744
    //   2042: ixor
    //   2043: goto -> 2054
    //   2046: ldc2_w 1786044369
    //   2049: l2i
    //   2050: ldc_w -520988425
    //   2053: ixor
    //   2054: ldc2_w 89904210
    //   2057: l2i
    //   2058: ldc_w 212024091
    //   2061: ixor
    //   2062: ixor
    //   2063: lookupswitch default -> 4972, -2088867729 -> 2088, -859633287 -> 2046
    //   2088: getstatic net/minecraft/init/Blocks.field_190990_dy : Lnet/minecraft/block/Block;
    //   2091: aastore
    //   2092: dup
    //   2093: ldc2_w -641906275
    //   2096: l2i
    //   2097: ldc_w -641906292
    //   2100: ixor
    //   2101: getstatic Perryc.1 : I
    //   2104: ifeq -> 2118
    //   2107: ldc2_w -693236406
    //   2110: l2i
    //   2111: ldc_w 1342611499
    //   2114: ixor
    //   2115: goto -> 2126
    //   2118: ldc2_w -1175708727
    //   2121: l2i
    //   2122: ldc_w -1971650197
    //   2125: ixor
    //   2126: ldc2_w 904444395
    //   2129: l2i
    //   2130: ldc_w -1141341680
    //   2133: ixor
    //   2134: ixor
    //   2135: lookupswitch default -> 2160, -1349993401 -> 2118, 146314906 -> 5026
    //   2160: getstatic net/minecraft/init/Blocks.field_190991_dz : Lnet/minecraft/block/Block;
    //   2163: aastore
    //   2164: dup
    //   2165: ldc2_w 1713547189
    //   2168: l2i
    //   2169: ldc_w 1713547175
    //   2172: ixor
    //   2173: getstatic Perryc.1 : I
    //   2176: ifeq -> 2190
    //   2179: ldc2_w 1981967112
    //   2182: l2i
    //   2183: ldc_w 2126710165
    //   2186: ixor
    //   2187: goto -> 2198
    //   2190: ldc2_w -2073354134
    //   2193: l2i
    //   2194: ldc_w -1791286099
    //   2197: ixor
    //   2198: ldc2_w 836531058
    //   2201: l2i
    //   2202: ldc_w 1987814134
    //   2205: ixor
    //   2206: ixor
    //   2207: lookupswitch default -> 5054, 1330036505 -> 2190, 1459082563 -> 2232
    //   2232: getstatic net/minecraft/init/Blocks.field_190975_dA : Lnet/minecraft/block/Block;
    //   2235: aastore
    //   2236: dup
    //   2237: ldc2_w -1508561820
    //   2240: l2i
    //   2241: ldc_w -1508561801
    //   2244: ixor
    //   2245: getstatic Perryc.1 : I
    //   2248: ifeq -> 2262
    //   2251: ldc2_w 790468043
    //   2254: l2i
    //   2255: ldc_w 870407206
    //   2258: ixor
    //   2259: goto -> 2270
    //   2262: ldc2_w -1976561157
    //   2265: l2i
    //   2266: ldc_w -166965147
    //   2269: ixor
    //   2270: ldc2_w 1434482389
    //   2273: l2i
    //   2274: ldc_w 42572256
    //   2277: ixor
    //   2278: ixor
    //   2279: lookupswitch default -> 5006, 724938411 -> 2304, 1274357464 -> 2262
    //   2304: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   2307: aastore
    //   2308: dup
    //   2309: ldc2_w -175760922
    //   2312: l2i
    //   2313: ldc_w -175760910
    //   2316: ixor
    //   2317: getstatic Perryc.0 : I
    //   2320: ifle -> 2334
    //   2323: ldc2_w 254933934
    //   2326: l2i
    //   2327: ldc_w 1326073770
    //   2330: ixor
    //   2331: goto -> 2342
    //   2334: ldc2_w -1335907820
    //   2337: l2i
    //   2338: ldc_w -986482214
    //   2341: ixor
    //   2342: ldc2_w 1422731780
    //   2345: l2i
    //   2346: ldc_w -1740173171
    //   2349: ixor
    //   2350: ixor
    //   2351: lookupswitch default -> 2376, -1934522739 -> 4964, 1605781687 -> 2334
    //   2376: getstatic net/minecraft/init/Blocks.field_150471_bO : Lnet/minecraft/block/Block;
    //   2379: aastore
    //   2380: dup
    //   2381: ldc2_w -1868292608
    //   2384: l2i
    //   2385: ldc_w -1868292587
    //   2388: ixor
    //   2389: getstatic Perryc.c : I
    //   2392: iflt -> 2406
    //   2395: ldc2_w -2040080563
    //   2398: l2i
    //   2399: ldc_w 319284172
    //   2402: ixor
    //   2403: goto -> 2414
    //   2406: ldc2_w 1797802226
    //   2409: l2i
    //   2410: ldc_w 2143100431
    //   2413: ixor
    //   2414: ldc2_w 906715180
    //   2417: l2i
    //   2418: ldc_w -1319871360
    //   2421: ixor
    //   2422: ixor
    //   2423: lookupswitch default -> 4976, -1815451055 -> 2448, 306055213 -> 2406
    //   2448: getstatic net/minecraft/init/Blocks.field_150430_aB : Lnet/minecraft/block/Block;
    //   2451: aastore
    //   2452: dup
    //   2453: ldc2_w -479904121
    //   2456: l2i
    //   2457: ldc_w -479904111
    //   2460: ixor
    //   2461: getstatic Perryc.c : I
    //   2464: iflt -> 2478
    //   2467: ldc2_w 2009836876
    //   2470: l2i
    //   2471: ldc_w -1711428835
    //   2474: ixor
    //   2475: goto -> 2486
    //   2478: ldc2_w 1451259704
    //   2481: l2i
    //   2482: ldc_w -1952221742
    //   2485: ixor
    //   2486: ldc2_w 348077200
    //   2489: l2i
    //   2490: ldc_w -1215091971
    //   2493: ixor
    //   2494: ixor
    //   2495: lookupswitch default -> 4968, 1293553724 -> 2478, 2114917511 -> 2520
    //   2520: getstatic net/minecraft/init/Blocks.field_150441_bU : Lnet/minecraft/block/BlockRedstoneComparator;
    //   2523: aastore
    //   2524: dup
    //   2525: ldc2_w 1885691495
    //   2528: l2i
    //   2529: ldc_w 1885691504
    //   2532: ixor
    //   2533: getstatic Perryc.0 : I
    //   2536: ifle -> 2550
    //   2539: ldc2_w -1192379320
    //   2542: l2i
    //   2543: ldc_w -1169054786
    //   2546: ixor
    //   2547: goto -> 2558
    //   2550: ldc2_w -74674981
    //   2553: l2i
    //   2554: ldc_w -1135597460
    //   2557: ixor
    //   2558: ldc2_w 1629995275
    //   2561: l2i
    //   2562: ldc_w 1157624595
    //   2565: ixor
    //   2566: ixor
    //   2567: lookupswitch default -> 5020, 660876782 -> 2550, 1644467887 -> 2592
    //   2592: getstatic net/minecraft/init/Blocks.field_150413_aR : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   2595: aastore
    //   2596: dup
    //   2597: ldc2_w 722850784
    //   2600: l2i
    //   2601: ldc_w 722850808
    //   2604: ixor
    //   2605: getstatic Perryc.c : I
    //   2608: iflt -> 2622
    //   2611: ldc2_w 2115274850
    //   2614: l2i
    //   2615: ldc_w -1133458354
    //   2618: ixor
    //   2619: goto -> 2630
    //   2622: ldc2_w 777999698
    //   2625: l2i
    //   2626: ldc_w 1051368270
    //   2629: ixor
    //   2630: ldc2_w -1031963262
    //   2633: l2i
    //   2634: ldc_w 1828529428
    //   2637: ixor
    //   2638: ixor
    //   2639: lookupswitch default -> 5032, -1099590006 -> 2664, 1826888890 -> 2622
    //   2664: getstatic net/minecraft/init/Blocks.field_150416_aS : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   2667: aastore
    //   2668: dup
    //   2669: ldc2_w -1443036668
    //   2672: l2i
    //   2673: ldc_w -1443036643
    //   2676: ixor
    //   2677: getstatic Perryc.0 : I
    //   2680: ifle -> 2694
    //   2683: ldc2_w -154822984
    //   2686: l2i
    //   2687: ldc_w 248195683
    //   2690: ixor
    //   2691: goto -> 2702
    //   2694: ldc2_w -684648464
    //   2697: l2i
    //   2698: ldc_w -1435899849
    //   2701: ixor
    //   2702: ldc2_w 1706545809
    //   2705: l2i
    //   2706: ldc_w 1771237277
    //   2709: ixor
    //   2710: ixor
    //   2711: lookupswitch default -> 2736, -198475305 -> 5088, 1221394591 -> 2694
    //   2736: getstatic net/minecraft/init/Blocks.field_150455_bV : Lnet/minecraft/block/BlockRedstoneComparator;
    //   2739: aastore
    //   2740: dup
    //   2741: ldc2_w 1925240118
    //   2744: l2i
    //   2745: ldc_w 1925240108
    //   2748: ixor
    //   2749: getstatic Perryc.0 : I
    //   2752: ifle -> 2766
    //   2755: ldc2_w -1240572254
    //   2758: l2i
    //   2759: ldc_w -1162157651
    //   2762: ixor
    //   2763: goto -> 2774
    //   2766: ldc2_w 1876558605
    //   2769: l2i
    //   2770: ldc_w -2049189369
    //   2773: ixor
    //   2774: ldc2_w 585781509
    //   2777: l2i
    //   2778: ldc_w -546414645
    //   2781: ixor
    //   2782: ixor
    //   2783: lookupswitch default -> 5080, -248467007 -> 2766, 394647492 -> 2808
    //   2808: getstatic net/minecraft/init/Blocks.field_180390_bo : Lnet/minecraft/block/Block;
    //   2811: aastore
    //   2812: dup
    //   2813: ldc2_w 608331035
    //   2816: l2i
    //   2817: ldc_w 608331008
    //   2820: ixor
    //   2821: getstatic Perryc.0 : I
    //   2824: ifle -> 2838
    //   2827: ldc2_w -1190698396
    //   2830: l2i
    //   2831: ldc_w -539900399
    //   2834: ixor
    //   2835: goto -> 2846
    //   2838: ldc2_w -1662427544
    //   2841: l2i
    //   2842: ldc_w -1262996853
    //   2845: ixor
    //   2846: ldc2_w 1863098234
    //   2849: l2i
    //   2850: ldc_w -1368189800
    //   2853: ixor
    //   2854: ixor
    //   2855: lookupswitch default -> 2880, -1482084457 -> 4992, -536063220 -> 2838
    //   2880: getstatic net/minecraft/init/Blocks.field_180391_bp : Lnet/minecraft/block/Block;
    //   2883: aastore
    //   2884: dup
    //   2885: ldc2_w 640527050
    //   2888: l2i
    //   2889: ldc_w 640527062
    //   2892: ixor
    //   2893: getstatic Perryc.1 : I
    //   2896: ifeq -> 2910
    //   2899: ldc2_w 1395733969
    //   2902: l2i
    //   2903: ldc_w 1623505413
    //   2906: ixor
    //   2907: goto -> 2918
    //   2910: ldc2_w -756863999
    //   2913: l2i
    //   2914: ldc_w 1961614501
    //   2917: ixor
    //   2918: ldc2_w -1399866678
    //   2921: l2i
    //   2922: ldc_w 1291679797
    //   2925: ixor
    //   2926: ixor
    //   2927: lookupswitch default -> 2952, -746107605 -> 5060, 584785235 -> 2910
    //   2952: getstatic net/minecraft/init/Blocks.field_180392_bq : Lnet/minecraft/block/Block;
    //   2955: aastore
    //   2956: dup
    //   2957: ldc2_w -525206303
    //   2960: l2i
    //   2961: ldc_w -525206276
    //   2964: ixor
    //   2965: getstatic Perryc.c : I
    //   2968: iflt -> 2982
    //   2971: ldc2_w 1788576985
    //   2974: l2i
    //   2975: ldc_w -299381337
    //   2978: ixor
    //   2979: goto -> 2990
    //   2982: ldc2_w -1501051419
    //   2985: l2i
    //   2986: ldc_w 960148550
    //   2989: ixor
    //   2990: ldc2_w 294369109
    //   2993: l2i
    //   2994: ldc_w -1973823316
    //   2997: ixor
    //   2998: ixor
    //   2999: lookupswitch default -> 5064, 74391130 -> 3024, 527312519 -> 2982
    //   3024: getstatic net/minecraft/init/Blocks.field_180386_br : Lnet/minecraft/block/Block;
    //   3027: aastore
    //   3028: dup
    //   3029: ldc2_w -1405933872
    //   3032: l2i
    //   3033: ldc_w -1405933874
    //   3036: ixor
    //   3037: getstatic Perryc.0 : I
    //   3040: ifle -> 3054
    //   3043: ldc2_w -1164485909
    //   3046: l2i
    //   3047: ldc_w -1154568082
    //   3050: ixor
    //   3051: goto -> 3062
    //   3054: ldc2_w 706377041
    //   3057: l2i
    //   3058: ldc_w -872953905
    //   3061: ixor
    //   3062: ldc2_w 1773339870
    //   3065: l2i
    //   3066: ldc_w 764350335
    //   3069: ixor
    //   3070: ixor
    //   3071: lookupswitch default -> 5046, -1512982209 -> 3096, 1166401828 -> 3054
    //   3096: getstatic net/minecraft/init/Blocks.field_180385_bs : Lnet/minecraft/block/Block;
    //   3099: aastore
    //   3100: dup
    //   3101: ldc2_w -1733701888
    //   3104: l2i
    //   3105: ldc_w -1733701857
    //   3108: ixor
    //   3109: getstatic Perryc.0 : I
    //   3112: ifle -> 3126
    //   3115: ldc2_w 1457979512
    //   3118: l2i
    //   3119: ldc_w 819812468
    //   3122: ixor
    //   3123: goto -> 3134
    //   3126: ldc2_w 323587622
    //   3129: l2i
    //   3130: ldc_w -1253069109
    //   3133: ixor
    //   3134: ldc2_w 1856597488
    //   3137: l2i
    //   3138: ldc_w -1792271453
    //   3141: ixor
    //   3142: ixor
    //   3143: lookupswitch default -> 3168, -1648415137 -> 5030, 536175332 -> 3126
    //   3168: getstatic net/minecraft/init/Blocks.field_180387_bt : Lnet/minecraft/block/Block;
    //   3171: aastore
    //   3172: dup
    //   3173: ldc2_w -2113964709
    //   3176: l2i
    //   3177: ldc_w -2113964677
    //   3180: ixor
    //   3181: getstatic Perryc.c : I
    //   3184: iflt -> 3198
    //   3187: ldc2_w 141441301
    //   3190: l2i
    //   3191: ldc_w -1492300232
    //   3194: ixor
    //   3195: goto -> 3206
    //   3198: ldc2_w -1834947670
    //   3201: l2i
    //   3202: ldc_w -1807837029
    //   3205: ixor
    //   3206: ldc2_w -1461465041
    //   3209: l2i
    //   3210: ldc_w 647059067
    //   3213: ixor
    //   3214: ixor
    //   3215: lookupswitch default -> 5066, -1997736603 -> 3240, 554824057 -> 3198
    //   3240: getstatic net/minecraft/init/Blocks.field_150382_bo : Lnet/minecraft/block/Block;
    //   3243: aastore
    //   3244: dup
    //   3245: ldc2_w -1126807318
    //   3248: l2i
    //   3249: ldc_w -1126807349
    //   3252: ixor
    //   3253: getstatic Perryc.c : I
    //   3256: iflt -> 3270
    //   3259: ldc2_w -2050736174
    //   3262: l2i
    //   3263: ldc_w 955444312
    //   3266: ixor
    //   3267: goto -> 3278
    //   3270: ldc2_w 772090803
    //   3273: l2i
    //   3274: ldc_w -1443503167
    //   3277: ixor
    //   3278: ldc2_w -1983772651
    //   3281: l2i
    //   3282: ldc_w -73797568
    //   3285: ixor
    //   3286: ixor
    //   3287: lookupswitch default -> 3312, -814928929 -> 4998, 1999715470 -> 3270
    //   3312: getstatic net/minecraft/init/Blocks.field_150367_z : Lnet/minecraft/block/Block;
    //   3315: aastore
    //   3316: dup
    //   3317: ldc2_w -2101486192
    //   3320: l2i
    //   3321: ldc_w -2101486158
    //   3324: ixor
    //   3325: getstatic Perryc.1 : I
    //   3328: ifeq -> 3342
    //   3331: ldc2_w -1998337618
    //   3334: l2i
    //   3335: ldc_w 1106256907
    //   3338: ixor
    //   3339: goto -> 3350
    //   3342: ldc2_w -1107838188
    //   3345: l2i
    //   3346: ldc_w 735431235
    //   3349: ixor
    //   3350: ldc2_w 874442661
    //   3353: l2i
    //   3354: ldc_w 1422009651
    //   3357: ixor
    //   3358: ixor
    //   3359: lookupswitch default -> 4956, -1446041805 -> 3342, -151077951 -> 3384
    //   3384: getstatic net/minecraft/init/Blocks.field_150409_cd : Lnet/minecraft/block/Block;
    //   3387: aastore
    //   3388: dup
    //   3389: ldc2_w 2146103570
    //   3392: l2i
    //   3393: ldc_w 2146103601
    //   3396: ixor
    //   3397: getstatic Perryc.c : I
    //   3400: iflt -> 3414
    //   3403: ldc2_w 1814061058
    //   3406: l2i
    //   3407: ldc_w 457582517
    //   3410: ixor
    //   3411: goto -> 3422
    //   3414: ldc2_w 1000961536
    //   3417: l2i
    //   3418: ldc_w -1172821946
    //   3421: ixor
    //   3422: ldc2_w 2108169224
    //   3425: l2i
    //   3426: ldc_w 358056068
    //   3429: ixor
    //   3430: ixor
    //   3431: lookupswitch default -> 3456, -601913296 -> 3414, 530176827 -> 5042
    //   3456: getstatic net/minecraft/init/Blocks.field_150442_at : Lnet/minecraft/block/Block;
    //   3459: aastore
    //   3460: dup
    //   3461: ldc2_w 238114294
    //   3464: l2i
    //   3465: ldc_w 238114258
    //   3468: ixor
    //   3469: getstatic Perryc.c : I
    //   3472: iflt -> 3486
    //   3475: ldc2_w -512513172
    //   3478: l2i
    //   3479: ldc_w -971296384
    //   3482: ixor
    //   3483: goto -> 3494
    //   3486: ldc2_w 666978518
    //   3489: l2i
    //   3490: ldc_w -1262578024
    //   3493: ixor
    //   3494: ldc2_w 1999106191
    //   3497: l2i
    //   3498: ldc_w 758642173
    //   3501: ixor
    //   3502: ixor
    //   3503: lookupswitch default -> 3528, -673810508 -> 3486, 2105057182 -> 5048
    //   3528: getstatic net/minecraft/init/Blocks.field_150323_B : Lnet/minecraft/block/Block;
    //   3531: aastore
    //   3532: dup
    //   3533: ldc2_w 86529790
    //   3536: l2i
    //   3537: ldc_w 86529755
    //   3540: ixor
    //   3541: getstatic Perryc.c : I
    //   3544: iflt -> 3558
    //   3547: ldc2_w 1869534113
    //   3550: l2i
    //   3551: ldc_w 2066190698
    //   3554: ixor
    //   3555: goto -> 3566
    //   3558: ldc2_w -1367616205
    //   3561: l2i
    //   3562: ldc_w -331421545
    //   3565: ixor
    //   3566: ldc2_w -756304966
    //   3569: l2i
    //   3570: ldc_w 259091862
    //   3573: ixor
    //   3574: ixor
    //   3575: lookupswitch default -> 5008, -1612717176 -> 3600, -908878617 -> 3558
    //   3600: getstatic net/minecraft/init/Blocks.field_150421_aI : Lnet/minecraft/block/Block;
    //   3603: aastore
    //   3604: dup
    //   3605: ldc2_w 799881298
    //   3608: l2i
    //   3609: ldc_w 799881332
    //   3612: ixor
    //   3613: getstatic Perryc.c : I
    //   3616: iflt -> 3630
    //   3619: ldc2_w 1092968220
    //   3622: l2i
    //   3623: ldc_w -1887297242
    //   3626: ixor
    //   3627: goto -> 3638
    //   3630: ldc2_w 126039451
    //   3633: l2i
    //   3634: ldc_w -1766786679
    //   3637: ixor
    //   3638: ldc2_w 381215230
    //   3641: l2i
    //   3642: ldc_w 250703187
    //   3645: ixor
    //   3646: ixor
    //   3647: lookupswitch default -> 5070, -1988476737 -> 3672, -688983401 -> 3630
    //   3672: getstatic net/minecraft/init/Blocks.field_150461_bJ : Lnet/minecraft/block/BlockBeacon;
    //   3675: aastore
    //   3676: dup
    //   3677: ldc2_w -1987047466
    //   3680: l2i
    //   3681: ldc_w -1987047439
    //   3684: ixor
    //   3685: getstatic Perryc.0 : I
    //   3688: ifle -> 3702
    //   3691: ldc2_w -1112312484
    //   3694: l2i
    //   3695: ldc_w 246907196
    //   3698: ixor
    //   3699: goto -> 3710
    //   3702: ldc2_w 1047608139
    //   3705: l2i
    //   3706: ldc_w 1139717377
    //   3709: ixor
    //   3710: ldc2_w 1163692615
    //   3713: l2i
    //   3714: ldc_w 515578857
    //   3717: ixor
    //   3718: ixor
    //   3719: lookupswitch default -> 3744, -387750450 -> 4994, 283473180 -> 3702
    //   3744: getstatic net/minecraft/init/Blocks.field_150324_C : Lnet/minecraft/block/Block;
    //   3747: aastore
    //   3748: dup
    //   3749: ldc2_w -1304887748
    //   3752: l2i
    //   3753: ldc_w -1304887788
    //   3756: ixor
    //   3757: getstatic Perryc.c : I
    //   3760: iflt -> 3774
    //   3763: ldc2_w -222479216
    //   3766: l2i
    //   3767: ldc_w -464706238
    //   3770: ixor
    //   3771: goto -> 3782
    //   3774: ldc2_w 931031914
    //   3777: l2i
    //   3778: ldc_w -1945567273
    //   3781: ixor
    //   3782: ldc2_w 482111179
    //   3785: l2i
    //   3786: ldc_w -286733202
    //   3789: ixor
    //   3790: ixor
    //   3791: lookupswitch default -> 5034, -458966153 -> 3774, 1226978840 -> 3816
    //   3816: getstatic net/minecraft/init/Blocks.field_150460_al : Lnet/minecraft/block/Block;
    //   3819: aastore
    //   3820: dup
    //   3821: ldc2_w 2090867612
    //   3824: l2i
    //   3825: ldc_w 2090867637
    //   3828: ixor
    //   3829: getstatic Perryc.c : I
    //   3832: iflt -> 3846
    //   3835: ldc2_w -855827799
    //   3838: l2i
    //   3839: ldc_w -1882943805
    //   3842: ixor
    //   3843: goto -> 3854
    //   3846: ldc2_w -494329981
    //   3849: l2i
    //   3850: ldc_w -1825095784
    //   3853: ixor
    //   3854: ldc2_w 1030581397
    //   3857: l2i
    //   3858: ldc_w -349516984
    //   3861: ixor
    //   3862: ixor
    //   3863: lookupswitch default -> 5074, -1786891337 -> 3846, -1476819002 -> 3888
    //   3888: getstatic net/minecraft/init/Blocks.field_180413_ao : Lnet/minecraft/block/BlockDoor;
    //   3891: aastore
    //   3892: dup
    //   3893: ldc2_w 1163728373
    //   3896: l2i
    //   3897: ldc_w 1163728351
    //   3900: ixor
    //   3901: getstatic Perryc.c : I
    //   3904: iflt -> 3918
    //   3907: ldc2_w -477179093
    //   3910: l2i
    //   3911: ldc_w 400096777
    //   3914: ixor
    //   3915: goto -> 3926
    //   3918: ldc2_w 572915445
    //   3921: l2i
    //   3922: ldc_w 246420314
    //   3925: ixor
    //   3926: ldc2_w -121188262
    //   3929: l2i
    //   3930: ldc_w 1121268513
    //   3933: ixor
    //   3934: ixor
    //   3935: lookupswitch default -> 5018, -1769599276 -> 3960, 1313197657 -> 3918
    //   3960: getstatic net/minecraft/init/Blocks.field_180414_ap : Lnet/minecraft/block/BlockDoor;
    //   3963: aastore
    //   3964: dup
    //   3965: ldc2_w -1039571553
    //   3968: l2i
    //   3969: ldc_w -1039571532
    //   3972: ixor
    //   3973: getstatic Perryc.0 : I
    //   3976: ifle -> 3990
    //   3979: ldc2_w -1948508042
    //   3982: l2i
    //   3983: ldc_w -194481201
    //   3986: ixor
    //   3987: goto -> 3998
    //   3990: ldc2_w -1599442906
    //   3993: l2i
    //   3994: ldc_w -1134586261
    //   3997: ixor
    //   3998: ldc2_w 936999164
    //   4001: l2i
    //   4002: ldc_w -863923556
    //   4005: ixor
    //   4006: ixor
    //   4007: lookupswitch default -> 4978, -2064860711 -> 3990, -408089555 -> 4032
    //   4032: getstatic net/minecraft/init/Blocks.field_180412_aq : Lnet/minecraft/block/BlockDoor;
    //   4035: aastore
    //   4036: dup
    //   4037: ldc2_w -105321033
    //   4040: l2i
    //   4041: ldc_w -105321061
    //   4044: ixor
    //   4045: getstatic Perryc.c : I
    //   4048: iflt -> 4062
    //   4051: ldc2_w -40447394
    //   4054: l2i
    //   4055: ldc_w -1381245889
    //   4058: ixor
    //   4059: goto -> 4070
    //   4062: ldc2_w -1149160159
    //   4065: l2i
    //   4066: ldc_w -1687060043
    //   4069: ixor
    //   4070: ldc2_w -485081893
    //   4073: l2i
    //   4074: ldc_w 967709664
    //   4077: ixor
    //   4078: ixor
    //   4079: lookupswitch default -> 4104, -1970986662 -> 4958, 2021302475 -> 4062
    //   4104: getstatic net/minecraft/init/Blocks.field_180411_ar : Lnet/minecraft/block/BlockDoor;
    //   4107: aastore
    //   4108: dup
    //   4109: ldc2_w -572531298
    //   4112: l2i
    //   4113: ldc_w -572531277
    //   4116: ixor
    //   4117: getstatic Perryc.1 : I
    //   4120: ifeq -> 4134
    //   4123: ldc2_w 1706027051
    //   4126: l2i
    //   4127: ldc_w -1952648421
    //   4130: ixor
    //   4131: goto -> 4142
    //   4134: ldc2_w -2107038378
    //   4137: l2i
    //   4138: ldc_w -837399960
    //   4141: ixor
    //   4142: ldc2_w 231379194
    //   4145: l2i
    //   4146: ldc_w 848890522
    //   4149: ixor
    //   4150: ixor
    //   4151: lookupswitch default -> 5062, -782204592 -> 4134, 1932326238 -> 4176
    //   4176: getstatic net/minecraft/init/Blocks.field_180410_as : Lnet/minecraft/block/BlockDoor;
    //   4179: aastore
    //   4180: dup
    //   4181: ldc2_w 1655712495
    //   4184: l2i
    //   4185: ldc_w 1655712449
    //   4188: ixor
    //   4189: getstatic Perryc.c : I
    //   4192: iflt -> 4206
    //   4195: ldc2_w 1875872510
    //   4198: l2i
    //   4199: ldc_w -1201330135
    //   4202: ixor
    //   4203: goto -> 4214
    //   4206: ldc2_w -657316047
    //   4209: l2i
    //   4210: ldc_w -1054522439
    //   4213: ixor
    //   4214: ldc2_w -2095376641
    //   4217: l2i
    //   4218: ldc_w -1699004017
    //   4221: ixor
    //   4222: ixor
    //   4223: lookupswitch default -> 4248, -838142553 -> 5024, 1109848318 -> 4206
    //   4248: getstatic net/minecraft/init/Blocks.field_180409_at : Lnet/minecraft/block/BlockDoor;
    //   4251: aastore
    //   4252: dup
    //   4253: ldc2_w 1574644243
    //   4256: l2i
    //   4257: ldc_w 1574644284
    //   4260: ixor
    //   4261: getstatic Perryc.0 : I
    //   4264: ifle -> 4278
    //   4267: ldc2_w -2102887329
    //   4270: l2i
    //   4271: ldc_w 185310058
    //   4274: ixor
    //   4275: goto -> 4286
    //   4278: ldc2_w -1949375826
    //   4281: l2i
    //   4282: ldc_w -588945545
    //   4285: ixor
    //   4286: ldc2_w -75920543
    //   4289: l2i
    //   4290: ldc_w 1868235831
    //   4293: ixor
    //   4294: ixor
    //   4295: lookupswitch default -> 4984, -1022817649 -> 4320, 495020131 -> 4278
    //   4320: getstatic net/minecraft/init/Blocks.field_150414_aQ : Lnet/minecraft/block/Block;
    //   4323: aastore
    //   4324: dup
    //   4325: ldc2_w 351536355
    //   4328: l2i
    //   4329: ldc_w 351536339
    //   4332: ixor
    //   4333: getstatic Perryc.1 : I
    //   4336: ifeq -> 4350
    //   4339: ldc2_w 684457140
    //   4342: l2i
    //   4343: ldc_w 452751292
    //   4346: ixor
    //   4347: goto -> 4358
    //   4350: ldc2_w -1979920575
    //   4353: l2i
    //   4354: ldc_w -277086722
    //   4357: ixor
    //   4358: ldc2_w 1291980992
    //   4361: l2i
    //   4362: ldc_w -649075148
    //   4365: ixor
    //   4366: ixor
    //   4367: lookupswitch default -> 4392, -1501927940 -> 5044, 1550499948 -> 4350
    //   4392: getstatic net/minecraft/init/Blocks.field_150381_bn : Lnet/minecraft/block/Block;
    //   4395: aastore
    //   4396: dup
    //   4397: ldc2_w -617859090
    //   4400: l2i
    //   4401: ldc_w -617859105
    //   4404: ixor
    //   4405: getstatic Perryc.1 : I
    //   4408: ifeq -> 4422
    //   4411: ldc2_w 1399011642
    //   4414: l2i
    //   4415: ldc_w -1050876340
    //   4418: ixor
    //   4419: goto -> 4430
    //   4422: ldc2_w 884639782
    //   4425: l2i
    //   4426: ldc_w -579440303
    //   4429: ixor
    //   4430: ldc2_w 1676644019
    //   4433: l2i
    //   4434: ldc_w 1763150924
    //   4437: ixor
    //   4438: ixor
    //   4439: lookupswitch default -> 4966, -1731732087 -> 4422, -483067000 -> 4464
    //   4464: getstatic net/minecraft/init/Blocks.field_150380_bt : Lnet/minecraft/block/Block;
    //   4467: aastore
    //   4468: dup
    //   4469: ldc2_w -1553617062
    //   4472: l2i
    //   4473: ldc_w -1553617048
    //   4476: ixor
    //   4477: getstatic Perryc.1 : I
    //   4480: ifeq -> 4494
    //   4483: ldc2_w 1272416614
    //   4486: l2i
    //   4487: ldc_w 298401103
    //   4490: ixor
    //   4491: goto -> 4502
    //   4494: ldc2_w -899837153
    //   4497: l2i
    //   4498: ldc_w 798933750
    //   4501: ixor
    //   4502: ldc2_w -308438158
    //   4505: l2i
    //   4506: ldc_w -1573840651
    //   4509: ixor
    //   4510: ixor
    //   4511: lookupswitch default -> 4536, 364001198 -> 5004, 1308288370 -> 4494
    //   4536: getstatic net/minecraft/init/Blocks.field_150438_bZ : Lnet/minecraft/block/BlockHopper;
    //   4539: aastore
    //   4540: dup
    //   4541: ldc2_w 2129100566
    //   4544: l2i
    //   4545: ldc_w 2129100581
    //   4548: ixor
    //   4549: getstatic Perryc.1 : I
    //   4552: ifeq -> 4566
    //   4555: ldc2_w 907028180
    //   4558: l2i
    //   4559: ldc_w 2032973251
    //   4562: ixor
    //   4563: goto -> 4574
    //   4566: ldc2_w -1232179975
    //   4569: l2i
    //   4570: ldc_w -141486743
    //   4573: ixor
    //   4574: ldc2_w -811327742
    //   4577: l2i
    //   4578: ldc_w 999605610
    //   4581: ixor
    //   4582: ixor
    //   4583: lookupswitch default -> 5078, -1255169032 -> 4608, -1156822657 -> 4566
    //   4608: getstatic net/minecraft/init/Blocks.field_185776_dc : Lnet/minecraft/block/Block;
    //   4611: aastore
    //   4612: dup
    //   4613: ldc2_w -422147292
    //   4616: l2i
    //   4617: ldc_w -422147312
    //   4620: ixor
    //   4621: getstatic Perryc.c : I
    //   4624: iflt -> 4638
    //   4627: ldc2_w -618864287
    //   4630: l2i
    //   4631: ldc_w 1812224029
    //   4634: ixor
    //   4635: goto -> 4646
    //   4638: ldc2_w -611642999
    //   4641: l2i
    //   4642: ldc_w -1149071196
    //   4645: ixor
    //   4646: ldc2_w 1201029518
    //   4649: l2i
    //   4650: ldc_w 1976087341
    //   4653: ixor
    //   4654: ixor
    //   4655: lookupswitch default -> 5056, -2058990625 -> 4638, 1381462926 -> 4680
    //   4680: getstatic net/minecraft/init/Blocks.field_150483_bI : Lnet/minecraft/block/Block;
    //   4683: aastore
    //   4684: dup
    //   4685: ldc2_w 1144573320
    //   4688: l2i
    //   4689: ldc_w 1144573373
    //   4692: ixor
    //   4693: getstatic Perryc.c : I
    //   4696: iflt -> 4710
    //   4699: ldc2_w -1327606233
    //   4702: l2i
    //   4703: ldc_w 2004359912
    //   4706: ixor
    //   4707: goto -> 4718
    //   4710: ldc2_w 850731301
    //   4713: l2i
    //   4714: ldc_w -5763103
    //   4717: ixor
    //   4718: ldc2_w -103058493
    //   4721: l2i
    //   4722: ldc_w -1156389108
    //   4725: ixor
    //   4726: ixor
    //   4727: lookupswitch default -> 5036, -2056267776 -> 4710, -1881884149 -> 4752
    //   4752: getstatic net/minecraft/init/Blocks.field_185777_dd : Lnet/minecraft/block/Block;
    //   4755: aastore
    //   4756: dup
    //   4757: ldc2_w -1663982465
    //   4760: l2i
    //   4761: ldc_w -1663982519
    //   4764: ixor
    //   4765: getstatic Perryc.c : I
    //   4768: iflt -> 4782
    //   4771: ldc2_w 524444727
    //   4774: l2i
    //   4775: ldc_w 62659907
    //   4778: ixor
    //   4779: goto -> 4790
    //   4782: ldc2_w -201818845
    //   4785: l2i
    //   4786: ldc_w 43366241
    //   4789: ixor
    //   4790: ldc2_w 1774039824
    //   4793: l2i
    //   4794: ldc_w -1579649888
    //   4797: ixor
    //   4798: ixor
    //   4799: lookupswitch default -> 4824, -869428966 -> 4782, -727990588 -> 5068
    //   4824: getstatic net/minecraft/init/Blocks.field_150462_ai : Lnet/minecraft/block/Block;
    //   4827: aastore
    //   4828: getstatic Perryc.1 : I
    //   4831: ifeq -> 4845
    //   4834: ldc2_w -1461518672
    //   4837: l2i
    //   4838: ldc_w 1153350270
    //   4841: ixor
    //   4842: goto -> 4853
    //   4845: ldc2_w -1561598352
    //   4848: l2i
    //   4849: ldc_w 104963837
    //   4852: ixor
    //   4853: ldc2_w -1806867495
    //   4856: l2i
    //   4857: ldc_w -1953719688
    //   4860: ixor
    //   4861: ixor
    //   4862: lookupswitch default -> 4888, -207766161 -> 4970, 2016262642 -> 4845
    //   4888: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4891: getstatic Perryc.0 : I
    //   4894: ifle -> 4908
    //   4897: ldc2_w -560909291
    //   4900: l2i
    //   4901: ldc_w -584530652
    //   4904: ixor
    //   4905: goto -> 4916
    //   4908: ldc2_w -47597560
    //   4911: l2i
    //   4912: ldc_w -1351129366
    //   4915: ixor
    //   4916: ldc2_w -942567796
    //   4919: l2i
    //   4920: ldc_w 1618427617
    //   4923: ixor
    //   4924: ixor
    //   4925: lookupswitch default -> 4952, -1541455524 -> 4996, 1179230271 -> 4908
    //   4952: putstatic bigname/zprestige/webhack/util/TestUtil.rightclickableBlocks : Ljava/util/List;
    //   4955: return
    //   4956: aconst_null
    //   4957: athrow
    //   4958: aconst_null
    //   4959: athrow
    //   4960: aconst_null
    //   4961: athrow
    //   4962: aconst_null
    //   4963: athrow
    //   4964: aconst_null
    //   4965: athrow
    //   4966: aconst_null
    //   4967: athrow
    //   4968: aconst_null
    //   4969: athrow
    //   4970: aconst_null
    //   4971: athrow
    //   4972: aconst_null
    //   4973: athrow
    //   4974: aconst_null
    //   4975: athrow
    //   4976: aconst_null
    //   4977: athrow
    //   4978: aconst_null
    //   4979: athrow
    //   4980: aconst_null
    //   4981: athrow
    //   4982: aconst_null
    //   4983: athrow
    //   4984: aconst_null
    //   4985: athrow
    //   4986: aconst_null
    //   4987: athrow
    //   4988: aconst_null
    //   4989: athrow
    //   4990: aconst_null
    //   4991: athrow
    //   4992: aconst_null
    //   4993: athrow
    //   4994: aconst_null
    //   4995: athrow
    //   4996: aconst_null
    //   4997: athrow
    //   4998: aconst_null
    //   4999: athrow
    //   5000: aconst_null
    //   5001: athrow
    //   5002: aconst_null
    //   5003: athrow
    //   5004: aconst_null
    //   5005: athrow
    //   5006: aconst_null
    //   5007: athrow
    //   5008: aconst_null
    //   5009: athrow
    //   5010: aconst_null
    //   5011: athrow
    //   5012: aconst_null
    //   5013: athrow
    //   5014: aconst_null
    //   5015: athrow
    //   5016: aconst_null
    //   5017: athrow
    //   5018: aconst_null
    //   5019: athrow
    //   5020: aconst_null
    //   5021: athrow
    //   5022: aconst_null
    //   5023: athrow
    //   5024: aconst_null
    //   5025: athrow
    //   5026: aconst_null
    //   5027: athrow
    //   5028: aconst_null
    //   5029: athrow
    //   5030: aconst_null
    //   5031: athrow
    //   5032: aconst_null
    //   5033: athrow
    //   5034: aconst_null
    //   5035: athrow
    //   5036: aconst_null
    //   5037: athrow
    //   5038: aconst_null
    //   5039: athrow
    //   5040: aconst_null
    //   5041: athrow
    //   5042: aconst_null
    //   5043: athrow
    //   5044: aconst_null
    //   5045: athrow
    //   5046: aconst_null
    //   5047: athrow
    //   5048: aconst_null
    //   5049: athrow
    //   5050: aconst_null
    //   5051: athrow
    //   5052: aconst_null
    //   5053: athrow
    //   5054: aconst_null
    //   5055: athrow
    //   5056: aconst_null
    //   5057: athrow
    //   5058: aconst_null
    //   5059: athrow
    //   5060: aconst_null
    //   5061: athrow
    //   5062: aconst_null
    //   5063: athrow
    //   5064: aconst_null
    //   5065: athrow
    //   5066: aconst_null
    //   5067: athrow
    //   5068: aconst_null
    //   5069: athrow
    //   5070: aconst_null
    //   5071: athrow
    //   5072: aconst_null
    //   5073: athrow
    //   5074: aconst_null
    //   5075: athrow
    //   5076: aconst_null
    //   5077: athrow
    //   5078: aconst_null
    //   5079: athrow
    //   5080: aconst_null
    //   5081: athrow
    //   5082: aconst_null
    //   5083: athrow
    //   5084: aconst_null
    //   5085: athrow
    //   5086: aconst_null
    //   5087: athrow
    //   5088: aconst_null
    //   5089: athrow
    //   5090: aconst_null
    //   5091: athrow
    //   5092: aconst_null
    //   5093: athrow
    //   5094: aconst_null
    //   5095: athrow
  }
  
  public TestUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1791106949
    //   9: l2i
    //   10: ldc_w -415566985
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1246316597
    //   20: l2i
    //   21: ldc_w 1562272728
    //   24: ixor
    //   25: ldc2_w -891457393
    //   28: l2i
    //   29: ldc_w -701750506
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 124, -195459190 -> 60, 1861632149 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -863848358
    //   70: l2i
    //   71: ldc_w -2033184555
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 1480057706
    //   81: l2i
    //   82: ldc_w -189994887
    //   85: ixor
    //   86: ldc2_w 167663638
    //   89: l2i
    //   90: ldc_w -547734772
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1661547627 -> 126, -371093096 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/TestUtil;
  }
  
  public static boolean canPlaceBlock(BlockPos pos) {
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
  
  public static void openBlock(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2527
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2519
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2511
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1847736943
    //   33: l2i
    //   34: ldc_w 1424554040
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1133392082
    //   44: l2i
    //   45: ldc_w -174484545
    //   48: ixor
    //   49: ldc2_w -881339028
    //   52: l2i
    //   53: ldc_w 1907841574
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2460, -215428133 -> 84, 2146808547 -> 41
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic values : ()[Lnet/minecraft/util/EnumFacing;
    //   91: goto -> 95
    //   94: athrow
    //   95: dup
    //   96: getstatic Perryc.0 : I
    //   99: ifle -> 113
    //   102: ldc2_w -1805107439
    //   105: l2i
    //   106: ldc_w -1734581374
    //   109: ixor
    //   110: goto -> 121
    //   113: ldc2_w -810616622
    //   116: l2i
    //   117: ldc_w 408732936
    //   120: ixor
    //   121: ldc2_w 1973945522
    //   124: l2i
    //   125: ldc_w -2039786864
    //   128: ixor
    //   129: ixor
    //   130: lookupswitch default -> 156, -13169999 -> 2486, 622230315 -> 113
    //   156: astore_1
    //   157: getstatic Perryc.1 : I
    //   160: ifeq -> 174
    //   163: ldc2_w -1395647172
    //   166: l2i
    //   167: ldc_w -1960228228
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w -2120613079
    //   177: l2i
    //   178: ldc_w -236994011
    //   181: ixor
    //   182: ldc2_w -250928333
    //   185: l2i
    //   186: ldc_w -1546797836
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 2494, 579034827 -> 216, 1967114375 -> 174
    //   216: astore_2
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w 905343623
    //   226: l2i
    //   227: ldc_w -1437252030
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 27016242
    //   237: l2i
    //   238: ldc_w -1142999412
    //   241: ixor
    //   242: ldc2_w 1773767534
    //   245: l2i
    //   246: ldc_w 166128980
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -184665053 -> 234, -240897 -> 2488
    //   276: aload_2
    //   277: arraylength
    //   278: getstatic Perryc.c : I
    //   281: iflt -> 295
    //   284: ldc2_w 827553009
    //   287: l2i
    //   288: ldc_w 224969133
    //   291: ixor
    //   292: goto -> 303
    //   295: ldc2_w -950387206
    //   298: l2i
    //   299: ldc_w -410622690
    //   302: ixor
    //   303: ldc2_w -66825515
    //   306: l2i
    //   307: ldc_w -302820841
    //   310: ixor
    //   311: ixor
    //   312: lookupswitch default -> 340, -1347568910 -> 295, 768390558 -> 2498
    //   340: istore_3
    //   341: ldc2_w 569595742
    //   344: l2i
    //   345: ldc_w 569595742
    //   348: ixor
    //   349: getstatic Perryc.c : I
    //   352: iflt -> 366
    //   355: ldc2_w -1614923257
    //   358: l2i
    //   359: ldc_w 2135865631
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w -85350462
    //   369: l2i
    //   370: ldc_w 823432809
    //   373: ixor
    //   374: ldc2_w -15716240
    //   377: l2i
    //   378: ldc_w -1592987070
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 2436, -1780354151 -> 408, -1091813078 -> 366
    //   408: istore #4
    //   410: getstatic Perryc.c : I
    //   413: iflt -> 427
    //   416: ldc2_w 1653400655
    //   419: l2i
    //   420: ldc_w 385158333
    //   423: ixor
    //   424: goto -> 435
    //   427: ldc2_w 1623311427
    //   430: l2i
    //   431: ldc_w -1070083364
    //   434: ixor
    //   435: ldc2_w -936215746
    //   438: l2i
    //   439: ldc_w -139083763
    //   442: ixor
    //   443: ixor
    //   444: lookupswitch default -> 472, -1340036724 -> 427, 1274958785 -> 2454
    //   472: iload #4
    //   474: getstatic Perryc.0 : I
    //   477: ifle -> 491
    //   480: ldc2_w 1471806059
    //   483: l2i
    //   484: ldc_w 921644596
    //   487: ixor
    //   488: goto -> 499
    //   491: ldc2_w 804461548
    //   494: l2i
    //   495: ldc_w 1386996517
    //   498: ixor
    //   499: ldc2_w -1141889569
    //   502: l2i
    //   503: ldc_w -1891865059
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -924923193 -> 491, 1436196765 -> 2446
    //   536: iload_3
    //   537: if_icmpge -> 551
    //   540: ldc2_w 670743722
    //   543: l2i
    //   544: ldc_w 557609638
    //   547: ixor
    //   548: goto -> 559
    //   551: ldc2_w 1045260586
    //   554: l2i
    //   555: ldc_w 948676391
    //   558: ixor
    //   559: ldc2_w -813785753
    //   562: l2i
    //   563: ldc_w 475468219
    //   566: ixor
    //   567: ixor
    //   568: tableswitch default -> 540, -705740080 -> 592, -705740079 -> 2431
    //   592: getstatic Perryc.0 : I
    //   595: ifle -> 609
    //   598: ldc2_w -674658344
    //   601: l2i
    //   602: ldc_w 2065385273
    //   605: ixor
    //   606: goto -> 617
    //   609: ldc2_w 387074555
    //   612: l2i
    //   613: ldc_w 476025276
    //   616: ixor
    //   617: ldc2_w -1355042942
    //   620: l2i
    //   621: ldc_w -931268379
    //   624: ixor
    //   625: ixor
    //   626: lookupswitch default -> 652, -879454330 -> 2478, 1918122651 -> 609
    //   652: aload_2
    //   653: getstatic Perryc.c : I
    //   656: iflt -> 670
    //   659: ldc2_w -1752761925
    //   662: l2i
    //   663: ldc_w 1816069679
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -1613179066
    //   673: l2i
    //   674: ldc_w -921438081
    //   677: ixor
    //   678: ldc2_w -586977507
    //   681: l2i
    //   682: ldc_w 1186007065
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 2438, -847689667 -> 712, 1611372688 -> 670
    //   712: iload #4
    //   714: aaload
    //   715: getstatic Perryc.c : I
    //   718: iflt -> 732
    //   721: ldc2_w 376600293
    //   724: l2i
    //   725: ldc_w -1321142561
    //   728: ixor
    //   729: goto -> 740
    //   732: ldc2_w -754931358
    //   735: l2i
    //   736: ldc_w -2039951685
    //   739: ixor
    //   740: ldc2_w -1207018168
    //   743: l2i
    //   744: ldc_w 500807301
    //   747: ixor
    //   748: ixor
    //   749: lookupswitch default -> 776, -998355353 -> 732, 48589815 -> 2452
    //   776: astore #5
    //   778: getstatic Perryc.0 : I
    //   781: ifle -> 795
    //   784: ldc2_w 249986550
    //   787: l2i
    //   788: ldc_w -275156300
    //   791: ixor
    //   792: goto -> 803
    //   795: ldc2_w -1888286759
    //   798: l2i
    //   799: ldc_w -35152006
    //   802: ixor
    //   803: ldc2_w 971538697
    //   806: l2i
    //   807: ldc_w -677941198
    //   810: ixor
    //   811: ixor
    //   812: lookupswitch default -> 840, 251723385 -> 2458, 1135129663 -> 795
    //   840: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   843: getstatic Perryc.0 : I
    //   846: ifle -> 860
    //   849: ldc2_w 1024972618
    //   852: l2i
    //   853: ldc_w -1416001211
    //   856: ixor
    //   857: goto -> 868
    //   860: ldc2_w 574939885
    //   863: l2i
    //   864: ldc_w -136956318
    //   867: ixor
    //   868: ldc2_w 1239253979
    //   871: l2i
    //   872: ldc_w 93074347
    //   875: ixor
    //   876: ixor
    //   877: lookupswitch default -> 904, -622858625 -> 2492, 1392665935 -> 860
    //   904: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   907: getstatic Perryc.1 : I
    //   910: ifeq -> 924
    //   913: ldc2_w -1288355671
    //   916: l2i
    //   917: ldc_w -1084143979
    //   920: ixor
    //   921: goto -> 932
    //   924: ldc2_w -1990986199
    //   927: l2i
    //   928: ldc_w -466771646
    //   931: ixor
    //   932: ldc2_w -719496739
    //   935: l2i
    //   936: ldc_w -1365032117
    //   939: ixor
    //   940: ixor
    //   941: lookupswitch default -> 2432, 381701629 -> 968, 2011831466 -> 924
    //   968: aload_0
    //   969: getstatic Perryc.c : I
    //   972: iflt -> 986
    //   975: ldc2_w 896001863
    //   978: l2i
    //   979: ldc_w 215593759
    //   982: ixor
    //   983: goto -> 994
    //   986: ldc2_w 1234297536
    //   989: l2i
    //   990: ldc_w 460334674
    //   993: ixor
    //   994: ldc2_w 257723838
    //   997: l2i
    //   998: ldc_w -995864281
    //   1001: ixor
    //   1002: ixor
    //   1003: lookupswitch default -> 2482, -1726408693 -> 1028, -230258495 -> 986
    //   1028: aload #5
    //   1030: getstatic Perryc.0 : I
    //   1033: ifle -> 1047
    //   1036: ldc2_w 1043511571
    //   1039: l2i
    //   1040: ldc_w -1672831159
    //   1043: ixor
    //   1044: goto -> 1055
    //   1047: ldc2_w -71069993
    //   1050: l2i
    //   1051: ldc_w 952743613
    //   1054: ixor
    //   1055: ldc2_w 1667680679
    //   1058: l2i
    //   1059: ldc_w -705427427
    //   1062: ixor
    //   1063: ixor
    //   1064: lookupswitch default -> 1092, -867565948 -> 1047, 350939104 -> 2462
    //   1092: goto -> 1096
    //   1095: athrow
    //   1096: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   1099: goto -> 1103
    //   1102: athrow
    //   1103: getstatic Perryc.c : I
    //   1106: iflt -> 1120
    //   1109: ldc2_w -535577377
    //   1112: l2i
    //   1113: ldc_w -1208647046
    //   1116: ixor
    //   1117: goto -> 1128
    //   1120: ldc2_w -1922897260
    //   1123: l2i
    //   1124: ldc_w -1931482972
    //   1127: ixor
    //   1128: ldc2_w 1376566491
    //   1131: l2i
    //   1132: ldc_w 1473477326
    //   1135: ixor
    //   1136: ixor
    //   1137: lookupswitch default -> 2444, 73581605 -> 1164, 1379530928 -> 1120
    //   1164: goto -> 1168
    //   1167: athrow
    //   1168: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1171: goto -> 1175
    //   1174: athrow
    //   1175: getstatic Perryc.1 : I
    //   1178: ifeq -> 1192
    //   1181: ldc2_w 1938666683
    //   1184: l2i
    //   1185: ldc_w 1494985649
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w -238131727
    //   1195: l2i
    //   1196: ldc_w -1902559745
    //   1199: ixor
    //   1200: ldc2_w 1845303506
    //   1203: l2i
    //   1204: ldc_w -2130290903
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 1236, -965914383 -> 2456, 1825210996 -> 1192
    //   1236: goto -> 1240
    //   1239: athrow
    //   1240: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1245: goto -> 1249
    //   1248: athrow
    //   1249: getstatic Perryc.0 : I
    //   1252: ifle -> 1266
    //   1255: ldc2_w 1742074801
    //   1258: l2i
    //   1259: ldc_w 814612236
    //   1262: ixor
    //   1263: goto -> 1274
    //   1266: ldc2_w -1459106849
    //   1269: l2i
    //   1270: ldc_w -1153275018
    //   1273: ixor
    //   1274: ldc2_w 290049600
    //   1277: l2i
    //   1278: ldc_w 1900481371
    //   1281: ixor
    //   1282: ixor
    //   1283: lookupswitch default -> 2450, 928434598 -> 1266, 1917543858 -> 1308
    //   1308: astore #6
    //   1310: getstatic Perryc.0 : I
    //   1313: ifle -> 1327
    //   1316: ldc2_w 730030493
    //   1319: l2i
    //   1320: ldc_w -1592875688
    //   1323: ixor
    //   1324: goto -> 1335
    //   1327: ldc2_w -1617620388
    //   1330: l2i
    //   1331: ldc_w -1531773295
    //   1334: ixor
    //   1335: ldc2_w 498441439
    //   1338: l2i
    //   1339: ldc_w 1801828102
    //   1342: ixor
    //   1343: ixor
    //   1344: lookupswitch default -> 1372, -60952804 -> 2466, 319010080 -> 1327
    //   1372: getstatic bigname/zprestige/webhack/util/TestUtil.emptyBlocks : Ljava/util/List;
    //   1375: getstatic Perryc.1 : I
    //   1378: ifeq -> 1392
    //   1381: ldc2_w 2057555007
    //   1384: l2i
    //   1385: ldc_w -1521506780
    //   1388: ixor
    //   1389: goto -> 1400
    //   1392: ldc2_w 1622563296
    //   1395: l2i
    //   1396: ldc_w 385990849
    //   1399: ixor
    //   1400: ldc2_w -1312239709
    //   1403: l2i
    //   1404: ldc_w -1317810081
    //   1407: ixor
    //   1408: ixor
    //   1409: lookupswitch default -> 2490, -547916313 -> 1392, 1997309661 -> 1436
    //   1436: aload #6
    //   1438: getstatic Perryc.c : I
    //   1441: iflt -> 1455
    //   1444: ldc2_w -1482505674
    //   1447: l2i
    //   1448: ldc_w 700199993
    //   1451: ixor
    //   1452: goto -> 1463
    //   1455: ldc2_w 1312946729
    //   1458: l2i
    //   1459: ldc_w 707649680
    //   1462: ixor
    //   1463: ldc2_w -372111085
    //   1466: l2i
    //   1467: ldc_w 815148556
    //   1470: ixor
    //   1471: ixor
    //   1472: lookupswitch default -> 1500, -197017195 -> 1455, 1465569552 -> 2476
    //   1500: goto -> 1504
    //   1503: athrow
    //   1504: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1509: goto -> 1513
    //   1512: athrow
    //   1513: ifne -> 1527
    //   1516: ldc2_w 2096590470
    //   1519: l2i
    //   1520: ldc_w -774888295
    //   1523: ixor
    //   1524: goto -> 1535
    //   1527: ldc2_w 1974737508
    //   1530: l2i
    //   1531: ldc_w -661434268
    //   1534: ixor
    //   1535: ldc2_w 1965401753
    //   1538: l2i
    //   1539: ldc_w 1310412553
    //   1542: ixor
    //   1543: ixor
    //   1544: tableswitch default -> 1516, -1776704625 -> 1568, -1776704624 -> 1571
    //   1568: goto -> 2425
    //   1571: getstatic Perryc.0 : I
    //   1574: ifle -> 1588
    //   1577: ldc2_w 2082068407
    //   1580: l2i
    //   1581: ldc_w -145769881
    //   1584: ixor
    //   1585: goto -> 1596
    //   1588: ldc2_w 514323550
    //   1591: l2i
    //   1592: ldc_w -599645856
    //   1595: ixor
    //   1596: ldc2_w -279546650
    //   1599: l2i
    //   1600: ldc_w 188045471
    //   1603: ixor
    //   1604: ixor
    //   1605: lookupswitch default -> 2470, 646379847 -> 1632, 1865761193 -> 1588
    //   1632: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1635: getstatic Perryc.c : I
    //   1638: iflt -> 1652
    //   1641: ldc2_w -958273161
    //   1644: l2i
    //   1645: ldc_w 137812124
    //   1648: ixor
    //   1649: goto -> 1660
    //   1652: ldc2_w 954341297
    //   1655: l2i
    //   1656: ldc_w -1911057002
    //   1659: ixor
    //   1660: ldc2_w 866771177
    //   1663: l2i
    //   1664: ldc_w -63850680
    //   1667: ixor
    //   1668: ixor
    //   1669: lookupswitch default -> 1696, -686562236 -> 1652, 21980746 -> 2448
    //   1696: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   1699: getstatic Perryc.1 : I
    //   1702: ifeq -> 1716
    //   1705: ldc2_w -1464742032
    //   1708: l2i
    //   1709: ldc_w -1024063918
    //   1712: ixor
    //   1713: goto -> 1724
    //   1716: ldc2_w 1758368047
    //   1719: l2i
    //   1720: ldc_w 1149480998
    //   1723: ixor
    //   1724: ldc2_w -376124298
    //   1727: l2i
    //   1728: ldc_w 1919138912
    //   1731: ixor
    //   1732: ixor
    //   1733: lookupswitch default -> 2442, -1212526305 -> 1760, -240076492 -> 1716
    //   1760: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1763: getstatic Perryc.1 : I
    //   1766: ifeq -> 1780
    //   1769: ldc2_w -1573017310
    //   1772: l2i
    //   1773: ldc_w -2037211556
    //   1776: ixor
    //   1777: goto -> 1788
    //   1780: ldc2_w 566792653
    //   1783: l2i
    //   1784: ldc_w 178782724
    //   1787: ixor
    //   1788: ldc2_w 661686512
    //   1791: l2i
    //   1792: ldc_w 1292541843
    //   1795: ixor
    //   1796: ixor
    //   1797: lookupswitch default -> 1824, 810223480 -> 1780, 1322590237 -> 2480
    //   1824: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1827: getstatic Perryc.0 : I
    //   1830: ifle -> 1844
    //   1833: ldc2_w -1734448200
    //   1836: l2i
    //   1837: ldc_w 1434262710
    //   1840: ixor
    //   1841: goto -> 1852
    //   1844: ldc2_w -385478967
    //   1847: l2i
    //   1848: ldc_w 1609581242
    //   1851: ixor
    //   1852: ldc2_w 1734239274
    //   1855: l2i
    //   1856: ldc_w 1332651764
    //   1859: ixor
    //   1860: ixor
    //   1861: lookupswitch default -> 1888, -439110192 -> 2468, 1139153429 -> 1844
    //   1888: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1891: getstatic Perryc.1 : I
    //   1894: ifeq -> 1908
    //   1897: ldc2_w -1907989114
    //   1900: l2i
    //   1901: ldc_w 2039981632
    //   1904: ixor
    //   1905: goto -> 1916
    //   1908: ldc2_w 1106478432
    //   1911: l2i
    //   1912: ldc_w 1904268767
    //   1915: ixor
    //   1916: ldc2_w 1673853432
    //   1919: l2i
    //   1920: ldc_w -331161729
    //   1923: ixor
    //   1924: ixor
    //   1925: lookupswitch default -> 2484, -1074432456 -> 1952, 2019026241 -> 1908
    //   1952: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1955: getstatic Perryc.1 : I
    //   1958: ifeq -> 1972
    //   1961: ldc2_w -2035877340
    //   1964: l2i
    //   1965: ldc_w 1331285412
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w -1783208405
    //   1975: l2i
    //   1976: ldc_w -277759614
    //   1979: ixor
    //   1980: ldc2_w 463124131
    //   1983: l2i
    //   1984: ldc_w 493583186
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 2464, -821101967 -> 1972, 2083918424 -> 2016
    //   2016: aload_0
    //   2017: getstatic Perryc.1 : I
    //   2020: ifeq -> 2034
    //   2023: ldc2_w 191614540
    //   2026: l2i
    //   2027: ldc_w -253090816
    //   2030: ixor
    //   2031: goto -> 2042
    //   2034: ldc2_w -1522888387
    //   2037: l2i
    //   2038: ldc_w 1694833172
    //   2041: ixor
    //   2042: ldc2_w 1278467538
    //   2045: l2i
    //   2046: ldc_w 53846309
    //   2049: ixor
    //   2050: ixor
    //   2051: lookupswitch default -> 2434, -1892026402 -> 2076, -1266182469 -> 2034
    //   2076: aload #5
    //   2078: getstatic Perryc.1 : I
    //   2081: ifeq -> 2095
    //   2084: ldc2_w -642190172
    //   2087: l2i
    //   2088: ldc_w 689189937
    //   2091: ixor
    //   2092: goto -> 2103
    //   2095: ldc2_w -358773243
    //   2098: l2i
    //   2099: ldc_w -1269362248
    //   2102: ixor
    //   2103: ldc2_w 862748074
    //   2106: l2i
    //   2107: ldc_w 65866207
    //   2110: ixor
    //   2111: ixor
    //   2112: lookupswitch default -> 2496, -1070746400 -> 2095, 1850469320 -> 2140
    //   2140: goto -> 2144
    //   2143: athrow
    //   2144: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   2147: goto -> 2151
    //   2150: athrow
    //   2151: new net/minecraft/util/math/Vec3d
    //   2154: dup
    //   2155: getstatic Perryc.c : I
    //   2158: iflt -> 2172
    //   2161: ldc2_w -1172831139
    //   2164: l2i
    //   2165: ldc_w -2013024425
    //   2168: ixor
    //   2169: goto -> 2180
    //   2172: ldc2_w -830730498
    //   2175: l2i
    //   2176: ldc_w 1825482751
    //   2179: ixor
    //   2180: ldc2_w 1012074817
    //   2183: l2i
    //   2184: ldc_w -8681739
    //   2187: ixor
    //   2188: ixor
    //   2189: lookupswitch default -> 2216, -248306498 -> 2500, 1039620000 -> 2172
    //   2216: aload_0
    //   2217: getstatic Perryc.1 : I
    //   2220: ifeq -> 2234
    //   2223: ldc2_w 910750269
    //   2226: l2i
    //   2227: ldc_w 1974905196
    //   2230: ixor
    //   2231: goto -> 2242
    //   2234: ldc2_w -873050943
    //   2237: l2i
    //   2238: ldc_w -1056194210
    //   2241: ixor
    //   2242: ldc2_w -241913605
    //   2245: l2i
    //   2246: ldc_w -2111744325
    //   2249: ixor
    //   2250: ixor
    //   2251: lookupswitch default -> 2472, 810269969 -> 2234, 2034789343 -> 2276
    //   2276: goto -> 2280
    //   2279: athrow
    //   2280: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   2283: goto -> 2287
    //   2286: athrow
    //   2287: getstatic Perryc.0 : I
    //   2290: ifle -> 2304
    //   2293: ldc2_w -1595674209
    //   2296: l2i
    //   2297: ldc_w 1558288769
    //   2300: ixor
    //   2301: goto -> 2312
    //   2304: ldc2_w -1415687429
    //   2307: l2i
    //   2308: ldc_w 530471842
    //   2311: ixor
    //   2312: ldc2_w -937844259
    //   2315: l2i
    //   2316: ldc_w 297508892
    //   2319: ixor
    //   2320: ixor
    //   2321: lookupswitch default -> 2348, 631269855 -> 2440, 1622201823 -> 2304
    //   2348: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   2351: getstatic Perryc.1 : I
    //   2354: ifeq -> 2368
    //   2357: ldc2_w 781828097
    //   2360: l2i
    //   2361: ldc_w 2026197974
    //   2364: ixor
    //   2365: goto -> 2376
    //   2368: ldc2_w 2112822788
    //   2371: l2i
    //   2372: ldc_w -1730410677
    //   2375: ixor
    //   2376: ldc2_w 35879093
    //   2379: l2i
    //   2380: ldc_w 1161313173
    //   2383: ixor
    //   2384: ixor
    //   2385: lookupswitch default -> 2474, -1574413713 -> 2412, 289919223 -> 2368
    //   2412: goto -> 2416
    //   2415: athrow
    //   2416: invokevirtual func_187099_a : (Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
    //   2419: goto -> 2423
    //   2422: athrow
    //   2423: pop
    //   2424: return
    //   2425: iinc #4, 1
    //   2428: goto -> 410
    //   2431: return
    //   2432: aconst_null
    //   2433: athrow
    //   2434: aconst_null
    //   2435: athrow
    //   2436: aconst_null
    //   2437: athrow
    //   2438: aconst_null
    //   2439: athrow
    //   2440: aconst_null
    //   2441: athrow
    //   2442: aconst_null
    //   2443: athrow
    //   2444: aconst_null
    //   2445: athrow
    //   2446: aconst_null
    //   2447: athrow
    //   2448: aconst_null
    //   2449: athrow
    //   2450: aconst_null
    //   2451: athrow
    //   2452: aconst_null
    //   2453: athrow
    //   2454: aconst_null
    //   2455: athrow
    //   2456: aconst_null
    //   2457: athrow
    //   2458: aconst_null
    //   2459: athrow
    //   2460: aconst_null
    //   2461: athrow
    //   2462: aconst_null
    //   2463: athrow
    //   2464: aconst_null
    //   2465: athrow
    //   2466: aconst_null
    //   2467: athrow
    //   2468: aconst_null
    //   2469: athrow
    //   2470: aconst_null
    //   2471: athrow
    //   2472: aconst_null
    //   2473: athrow
    //   2474: aconst_null
    //   2475: athrow
    //   2476: aconst_null
    //   2477: athrow
    //   2478: aconst_null
    //   2479: athrow
    //   2480: aconst_null
    //   2481: athrow
    //   2482: aconst_null
    //   2483: athrow
    //   2484: aconst_null
    //   2485: athrow
    //   2486: aconst_null
    //   2487: athrow
    //   2488: aconst_null
    //   2489: athrow
    //   2490: aconst_null
    //   2491: athrow
    //   2492: aconst_null
    //   2493: athrow
    //   2494: aconst_null
    //   2495: athrow
    //   2496: aconst_null
    //   2497: athrow
    //   2498: aconst_null
    //   2499: athrow
    //   2500: aconst_null
    //   2501: athrow
    //   2502: pop
    //   2503: goto -> 24
    //   2506: pop
    //   2507: aconst_null
    //   2508: goto -> 2502
    //   2511: dup
    //   2512: ifnull -> 2502
    //   2515: checkcast java/lang/Throwable
    //   2518: athrow
    //   2519: dup
    //   2520: ifnull -> 2506
    //   2523: checkcast java/lang/Throwable
    //   2526: athrow
    //   2527: aconst_null
    //   2528: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1310	1115	6	neighborBlock	Lnet/minecraft/block/Block;
    //   778	1647	5	f	Lnet/minecraft/util/EnumFacing;
    //   24	2408	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   157	2275	1	facings	[Lnet/minecraft/util/EnumFacing;
    // Exception table:
    //   from	to	target	type
    //   8	20	2511	java/lang/IllegalStateException
    //   87	94	94	finally
    //   87	94	87	finally
    //   88	94	3	finally
    //   88	94	94	java/util/NoSuchElementException
    //   88	94	87	finally
    //   1095	1102	1102	finally
    //   1095	1102	3	java/lang/AssertionError
    //   1095	1102	1102	finally
    //   1096	1102	1095	finally
    //   1096	1102	1095	java/lang/AssertionError
    //   1167	1174	1174	finally
    //   1167	1174	1167	finally
    //   1168	1174	1167	java/lang/ArrayIndexOutOfBoundsException
    //   1168	1174	1167	java/lang/NumberFormatException
    //   1168	1174	1167	finally
    //   1239	1248	1248	finally
    //   1239	1248	3	java/lang/EnumConstantNotPresentException
    //   1240	1248	1239	java/lang/NumberFormatException
    //   1240	1248	1239	java/util/NoSuchElementException
    //   1240	1248	1239	java/lang/NumberFormatException
    //   1503	1512	1512	finally
    //   1503	1512	1503	finally
    //   1503	1512	3	java/lang/NumberFormatException
    //   1503	1512	1512	java/lang/NullPointerException
    //   1504	1512	1503	java/lang/UnsupportedOperationException
    //   2143	2150	2150	finally
    //   2144	2150	2143	java/lang/IndexOutOfBoundsException
    //   2144	2150	2150	finally
    //   2144	2150	2150	java/lang/NumberFormatException
    //   2144	2150	2143	finally
    //   2279	2286	2286	finally
    //   2279	2286	3	java/util/ConcurrentModificationException
    //   2279	2286	2279	finally
    //   2279	2286	2279	finally
    //   2279	2286	3	java/lang/UnsupportedOperationException
    //   2415	2422	2422	finally
    //   2415	2422	3	finally
    //   2415	2422	2415	finally
    //   2415	2422	2422	finally
    //   2416	2422	2415	java/util/ConcurrentModificationException
    //   2511	2519	2511	java/lang/NumberFormatException
    //   2527	2529	3	finally
  }
  
  public static boolean placeBlock(BlockPos pos) {
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
  
  public static boolean isBlockEmpty(BlockPos pos) {
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
  
  public static boolean canSeeBlock(BlockPos p_Pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1899
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1891
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1883
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 334799361
    //   33: l2i
    //   34: ldc_w -607394121
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 261334976
    //   44: l2i
    //   45: ldc_w -894933165
    //   48: ixor
    //   49: ldc2_w 816936050
    //   52: l2i
    //   53: ldc_w -1803759715
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1734448056 -> 41, 1827864409 -> 1854
    //   84: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.1 : I
    //   90: ifeq -> 104
    //   93: ldc2_w 1878886375
    //   96: l2i
    //   97: ldc_w 301988216
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 467066887
    //   107: l2i
    //   108: ldc_w -855310471
    //   111: ixor
    //   112: ldc2_w -1015138084
    //   115: l2i
    //   116: ldc_w 1087655834
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 1824, -39319079 -> 104, 1433954360 -> 148
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: ifnull -> 165
    //   154: ldc2_w -499913369
    //   157: l2i
    //   158: ldc_w 1451891321
    //   161: ixor
    //   162: goto -> 173
    //   165: ldc2_w -1048279472
    //   168: l2i
    //   169: ldc_w 1966960975
    //   172: ixor
    //   173: ldc2_w 1653583690
    //   176: l2i
    //   177: ldc_w 1043010254
    //   180: ixor
    //   181: ixor
    //   182: tableswitch default -> 154, -400733542 -> 204, -400733541 -> 1815
    //   204: getstatic Perryc.1 : I
    //   207: ifeq -> 221
    //   210: ldc2_w 1063164877
    //   213: l2i
    //   214: ldc_w -256917132
    //   217: ixor
    //   218: goto -> 229
    //   221: ldc2_w 1215087884
    //   224: l2i
    //   225: ldc_w -494917881
    //   228: ixor
    //   229: ldc2_w 1317551944
    //   232: l2i
    //   233: ldc_w -1359676206
    //   236: ixor
    //   237: ixor
    //   238: lookupswitch default -> 264, -1553237486 -> 221, 797808931 -> 1830
    //   264: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   267: getstatic Perryc.1 : I
    //   270: ifeq -> 284
    //   273: ldc2_w 1647567157
    //   276: l2i
    //   277: ldc_w 340966603
    //   280: ixor
    //   281: goto -> 292
    //   284: ldc2_w -1569933773
    //   287: l2i
    //   288: ldc_w 323534450
    //   291: ixor
    //   292: ldc2_w -131244477
    //   295: l2i
    //   296: ldc_w -1756164200
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, 421465125 -> 1860, 555161946 -> 284
    //   328: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   331: new net/minecraft/util/math/Vec3d
    //   334: dup
    //   335: getstatic Perryc.0 : I
    //   338: ifle -> 352
    //   341: ldc2_w 1123662919
    //   344: l2i
    //   345: ldc_w -2011928662
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 1934470159
    //   355: l2i
    //   356: ldc_w 349902780
    //   359: ixor
    //   360: ldc2_w 1782416397
    //   363: l2i
    //   364: ldc_w 707098588
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 396, -1963644868 -> 1842, 872436377 -> 352
    //   396: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   399: getstatic Perryc.0 : I
    //   402: ifle -> 416
    //   405: ldc2_w 607833783
    //   408: l2i
    //   409: ldc_w 1260616175
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w 1277581822
    //   419: l2i
    //   420: ldc_w 619461856
    //   423: ixor
    //   424: ldc2_w 1722478973
    //   427: l2i
    //   428: ldc_w 1439533045
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 460, -1845962585 -> 416, 1551811024 -> 1834
    //   460: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   463: getstatic Perryc.c : I
    //   466: iflt -> 480
    //   469: ldc2_w 2067502442
    //   472: l2i
    //   473: ldc_w -556165652
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -2060134803
    //   483: l2i
    //   484: ldc_w 845703642
    //   487: ixor
    //   488: ldc2_w -216380544
    //   491: l2i
    //   492: ldc_w 670974988
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -883458398 -> 480, 1896222474 -> 1836
    //   524: getfield field_70165_t : D
    //   527: getstatic Perryc.1 : I
    //   530: ifeq -> 544
    //   533: ldc2_w 36797975
    //   536: l2i
    //   537: ldc_w -463750054
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w -824253707
    //   547: l2i
    //   548: ldc_w -996449504
    //   551: ixor
    //   552: ldc2_w 1913784506
    //   555: l2i
    //   556: ldc_w 945788471
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 588, -2118828481 -> 544, -1406706496 -> 1866
    //   588: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   591: getstatic Perryc.c : I
    //   594: iflt -> 608
    //   597: ldc2_w -431428590
    //   600: l2i
    //   601: ldc_w 871111647
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w -926878038
    //   611: l2i
    //   612: ldc_w -781465778
    //   615: ixor
    //   616: ldc2_w 1517939002
    //   619: l2i
    //   620: ldc_w 646078256
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 1868, -1453375033 -> 608, 1699776494 -> 652
    //   652: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   655: getstatic Perryc.1 : I
    //   658: ifeq -> 672
    //   661: ldc2_w 62221748
    //   664: l2i
    //   665: ldc_w 162143944
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w 159725181
    //   675: l2i
    //   676: ldc_w -5439302
    //   679: ixor
    //   680: ldc2_w -1187828140
    //   683: l2i
    //   684: ldc_w 1952857252
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 1850, -951426676 -> 672, 998057015 -> 716
    //   716: getfield field_70163_u : D
    //   719: getstatic Perryc.1 : I
    //   722: ifeq -> 736
    //   725: ldc2_w -379454583
    //   728: l2i
    //   729: ldc_w 1977323600
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 2014330224
    //   739: l2i
    //   740: ldc_w -1264085955
    //   743: ixor
    //   744: ldc2_w 2010354159
    //   747: l2i
    //   748: ldc_w -22262088
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 780, -2046981502 -> 736, 365278350 -> 1840
    //   780: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   783: getstatic Perryc.0 : I
    //   786: ifle -> 800
    //   789: ldc2_w -710734728
    //   792: l2i
    //   793: ldc_w 118719428
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w -1851741990
    //   803: l2i
    //   804: ldc_w -1611337105
    //   807: ixor
    //   808: ldc2_w 553171678
    //   811: l2i
    //   812: ldc_w 1888176159
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 844, -2101117571 -> 1870, -1151896147 -> 800
    //   844: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   847: getstatic Perryc.0 : I
    //   850: ifle -> 864
    //   853: ldc2_w 1766426239
    //   856: l2i
    //   857: ldc_w 1625771530
    //   860: ixor
    //   861: goto -> 872
    //   864: ldc2_w -1640136410
    //   867: l2i
    //   868: ldc_w 243584798
    //   871: ixor
    //   872: ldc2_w -1314325522
    //   875: l2i
    //   876: ldc_w 99237636
    //   879: ixor
    //   880: ixor
    //   881: lookupswitch default -> 1828, -1108603745 -> 864, 620464850 -> 908
    //   908: goto -> 912
    //   911: athrow
    //   912: invokevirtual func_70047_e : ()F
    //   915: goto -> 919
    //   918: athrow
    //   919: f2d
    //   920: dadd
    //   921: getstatic Perryc.c : I
    //   924: iflt -> 938
    //   927: ldc2_w -2127329013
    //   930: l2i
    //   931: ldc_w -1807285499
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w -1792326899
    //   941: l2i
    //   942: ldc_w 1229579330
    //   945: ixor
    //   946: ldc2_w -596760394
    //   949: l2i
    //   950: ldc_w 109418611
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 980, -811648309 -> 1832, 777761703 -> 938
    //   980: getstatic bigname/zprestige/webhack/util/TestUtil.mc : Lnet/minecraft/client/Minecraft;
    //   983: getstatic Perryc.1 : I
    //   986: ifeq -> 1000
    //   989: ldc2_w -954415067
    //   992: l2i
    //   993: ldc_w -1660095862
    //   996: ixor
    //   997: goto -> 1008
    //   1000: ldc2_w 1156864793
    //   1003: l2i
    //   1004: ldc_w -489643253
    //   1007: ixor
    //   1008: ldc2_w -1003763011
    //   1011: l2i
    //   1012: ldc_w -799082673
    //   1015: ixor
    //   1016: ixor
    //   1017: lookupswitch default -> 1044, -1894892992 -> 1000, 1315243869 -> 1826
    //   1044: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w -736294709
    //   1056: l2i
    //   1057: ldc_w -762522881
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w 1118411433
    //   1067: l2i
    //   1068: ldc_w -1221985803
    //   1071: ixor
    //   1072: ldc2_w 567472634
    //   1075: l2i
    //   1076: ldc_w 2101873089
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1108, -953625134 -> 1064, 1510679055 -> 1858
    //   1108: getfield field_70161_v : D
    //   1111: getstatic Perryc.1 : I
    //   1114: ifeq -> 1128
    //   1117: ldc2_w -460497806
    //   1120: l2i
    //   1121: ldc_w -1573826122
    //   1124: ixor
    //   1125: goto -> 1136
    //   1128: ldc2_w -791443700
    //   1131: l2i
    //   1132: ldc_w 273980692
    //   1135: ixor
    //   1136: ldc2_w 935960497
    //   1139: l2i
    //   1140: ldc_w -1118101721
    //   1143: ixor
    //   1144: ixor
    //   1145: lookupswitch default -> 1172, -869364398 -> 1852, 1875717384 -> 1128
    //   1172: goto -> 1176
    //   1175: athrow
    //   1176: invokespecial <init> : (DDD)V
    //   1179: goto -> 1183
    //   1182: athrow
    //   1183: new net/minecraft/util/math/Vec3d
    //   1186: dup
    //   1187: getstatic Perryc.0 : I
    //   1190: ifle -> 1204
    //   1193: ldc2_w 142630159
    //   1196: l2i
    //   1197: ldc_w -2136454447
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w -721177492
    //   1207: l2i
    //   1208: ldc_w -413986220
    //   1211: ixor
    //   1212: ldc2_w 1082151884
    //   1215: l2i
    //   1216: ldc_w 830889426
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 1248, -2141371688 -> 1204, -114419264 -> 1846
    //   1248: aload_0
    //   1249: getstatic Perryc.c : I
    //   1252: iflt -> 1266
    //   1255: ldc2_w -938123726
    //   1258: l2i
    //   1259: ldc_w -1313740332
    //   1262: ixor
    //   1263: goto -> 1274
    //   1266: ldc2_w 171592531
    //   1269: l2i
    //   1270: ldc_w -233202392
    //   1273: ixor
    //   1274: ldc2_w 2017456967
    //   1277: l2i
    //   1278: ldc_w -859350676
    //   1281: ixor
    //   1282: ixor
    //   1283: lookupswitch default -> 1844, -849601075 -> 1266, 1289452624 -> 1308
    //   1308: goto -> 1312
    //   1311: athrow
    //   1312: invokevirtual func_177958_n : ()I
    //   1315: goto -> 1319
    //   1318: athrow
    //   1319: i2d
    //   1320: getstatic Perryc.c : I
    //   1323: iflt -> 1337
    //   1326: ldc2_w 1664101029
    //   1329: l2i
    //   1330: ldc_w -2039315382
    //   1333: ixor
    //   1334: goto -> 1345
    //   1337: ldc2_w 1544603203
    //   1340: l2i
    //   1341: ldc_w 785592721
    //   1344: ixor
    //   1345: ldc2_w 1940497065
    //   1348: l2i
    //   1349: ldc_w -1138044732
    //   1352: ixor
    //   1353: ixor
    //   1354: lookupswitch default -> 1380, 155482199 -> 1337, 717347970 -> 1856
    //   1380: aload_0
    //   1381: getstatic Perryc.0 : I
    //   1384: ifle -> 1398
    //   1387: ldc2_w -126875383
    //   1390: l2i
    //   1391: ldc_w 1566940764
    //   1394: ixor
    //   1395: goto -> 1406
    //   1398: ldc2_w -659140176
    //   1401: l2i
    //   1402: ldc_w 490220569
    //   1405: ixor
    //   1406: ldc2_w 1636230837
    //   1409: l2i
    //   1410: ldc_w 1072627580
    //   1413: ixor
    //   1414: ixor
    //   1415: lookupswitch default -> 1862, -1679399840 -> 1440, -75657572 -> 1398
    //   1440: goto -> 1444
    //   1443: athrow
    //   1444: invokevirtual func_177956_o : ()I
    //   1447: goto -> 1451
    //   1450: athrow
    //   1451: i2d
    //   1452: getstatic Perryc.1 : I
    //   1455: ifeq -> 1469
    //   1458: ldc2_w 34553226
    //   1461: l2i
    //   1462: ldc_w 247447638
    //   1465: ixor
    //   1466: goto -> 1477
    //   1469: ldc2_w -559620882
    //   1472: l2i
    //   1473: ldc_w 803737257
    //   1476: ixor
    //   1477: ldc2_w 849612613
    //   1480: l2i
    //   1481: ldc_w 1953056841
    //   1484: ixor
    //   1485: ixor
    //   1486: lookupswitch default -> 1512, -56565116 -> 1469, 1249753808 -> 1872
    //   1512: aload_0
    //   1513: getstatic Perryc.1 : I
    //   1516: ifeq -> 1530
    //   1519: ldc2_w -743105447
    //   1522: l2i
    //   1523: ldc_w -945273246
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w 942667838
    //   1533: l2i
    //   1534: ldc_w -236230925
    //   1537: ixor
    //   1538: ldc2_w -616905812
    //   1541: l2i
    //   1542: ldc_w 1235045606
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 1838, -2034576015 -> 1530, 1533219207 -> 1572
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual func_177952_p : ()I
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: i2d
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w 1485939515
    //   1593: l2i
    //   1594: ldc_w 1602211379
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w 1835519093
    //   1604: l2i
    //   1605: ldc_w 471684936
    //   1608: ixor
    //   1609: ldc2_w -2094555604
    //   1612: l2i
    //   1613: ldc_w -825718730
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 1864, 1016433959 -> 1644, 1241611026 -> 1601
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokespecial <init> : (DDD)V
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: ldc2_w 2112509679
    //   1658: l2i
    //   1659: ldc_w 2112509679
    //   1662: ixor
    //   1663: ldc2_w 972358656
    //   1666: l2i
    //   1667: ldc_w 972358657
    //   1670: ixor
    //   1671: ldc2_w -530042299
    //   1674: l2i
    //   1675: ldc_w -530042299
    //   1678: ixor
    //   1679: getstatic Perryc.0 : I
    //   1682: ifle -> 1696
    //   1685: ldc2_w -1716825045
    //   1688: l2i
    //   1689: ldc_w -1995457480
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 678994735
    //   1699: l2i
    //   1700: ldc_w 1702252710
    //   1703: ixor
    //   1704: ldc2_w -448006981
    //   1707: l2i
    //   1708: ldc_w -2002363715
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1848, 551771535 -> 1740, 2101954069 -> 1696
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual func_147447_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: ifnonnull -> 1765
    //   1754: ldc2_w -324609222
    //   1757: l2i
    //   1758: ldc_w -1656562163
    //   1761: ixor
    //   1762: goto -> 1773
    //   1765: ldc2_w -1776815521
    //   1768: l2i
    //   1769: ldc_w -403441813
    //   1772: ixor
    //   1773: ldc2_w 493976204
    //   1776: l2i
    //   1777: ldc_w -1584161222
    //   1780: ixor
    //   1781: ixor
    //   1782: tableswitch default -> 1754, -855187071 -> 1804, -855187070 -> 1815
    //   1804: ldc2_w 1366996978
    //   1807: l2i
    //   1808: ldc_w 1366996979
    //   1811: ixor
    //   1812: goto -> 1823
    //   1815: ldc2_w -1991104057
    //   1818: l2i
    //   1819: ldc_w -1991104057
    //   1822: ixor
    //   1823: ireturn
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aconst_null
    //   1827: athrow
    //   1828: aconst_null
    //   1829: athrow
    //   1830: aconst_null
    //   1831: athrow
    //   1832: aconst_null
    //   1833: athrow
    //   1834: aconst_null
    //   1835: athrow
    //   1836: aconst_null
    //   1837: athrow
    //   1838: aconst_null
    //   1839: athrow
    //   1840: aconst_null
    //   1841: athrow
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: aconst_null
    //   1853: athrow
    //   1854: aconst_null
    //   1855: athrow
    //   1856: aconst_null
    //   1857: athrow
    //   1858: aconst_null
    //   1859: athrow
    //   1860: aconst_null
    //   1861: athrow
    //   1862: aconst_null
    //   1863: athrow
    //   1864: aconst_null
    //   1865: athrow
    //   1866: aconst_null
    //   1867: athrow
    //   1868: aconst_null
    //   1869: athrow
    //   1870: aconst_null
    //   1871: athrow
    //   1872: aconst_null
    //   1873: athrow
    //   1874: pop
    //   1875: goto -> 24
    //   1878: pop
    //   1879: aconst_null
    //   1880: goto -> 1874
    //   1883: dup
    //   1884: ifnull -> 1874
    //   1887: checkcast java/lang/Throwable
    //   1890: athrow
    //   1891: dup
    //   1892: ifnull -> 1878
    //   1895: checkcast java/lang/Throwable
    //   1898: athrow
    //   1899: aconst_null
    //   1900: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1800	0	p_Pos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	1883	finally
    //   911	918	918	finally
    //   911	918	3	finally
    //   912	918	3	java/lang/IllegalStateException
    //   912	918	911	java/lang/NegativeArraySizeException
    //   912	918	3	java/lang/EnumConstantNotPresentException
    //   1175	1182	1182	finally
    //   1175	1182	1175	java/util/ConcurrentModificationException
    //   1175	1182	3	finally
    //   1176	1182	1175	java/lang/IndexOutOfBoundsException
    //   1176	1182	1175	finally
    //   1311	1318	1318	finally
    //   1311	1318	1311	finally
    //   1311	1318	1318	java/lang/NumberFormatException
    //   1311	1318	1311	java/lang/ArithmeticException
    //   1311	1318	1311	java/lang/UnsupportedOperationException
    //   1444	1450	1450	finally
    //   1444	1450	1450	finally
    //   1444	1450	3	finally
    //   1444	1450	1450	java/lang/NumberFormatException
    //   1444	1450	1450	finally
    //   1575	1582	1582	finally
    //   1575	1582	1575	finally
    //   1575	1582	3	java/util/NoSuchElementException
    //   1576	1582	1582	finally
    //   1576	1582	1582	java/lang/EnumConstantNotPresentException
    //   1647	1654	1654	finally
    //   1647	1654	1654	finally
    //   1648	1654	3	finally
    //   1648	1654	1647	java/util/ConcurrentModificationException
    //   1648	1654	3	finally
    //   1744	1750	1750	finally
    //   1744	1750	3	finally
    //   1744	1750	3	java/lang/NegativeArraySizeException
    //   1744	1750	1750	java/util/NoSuchElementException
    //   1744	1750	1750	java/lang/AssertionError
    //   1883	1891	1883	finally
    //   1899	1901	3	java/lang/IllegalArgumentException
  }
  
  public static boolean rayTracePlaceCheck(BlockPos paramBlockPos, boolean paramBoolean) {
    return Perry1.5c(null, (int)-1442003937L ^ 0x9C170128, paramBlockPos, paramBoolean);
  }
  
  public static void placeCrystalOnBlock(BlockPos pos, EnumHand hand) {
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
  
  public static boolean rayTracePlaceCheck(BlockPos pos, boolean shouldCheck, float height) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\TestUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */