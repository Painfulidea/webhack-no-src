package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemUtil implements Globals {
  public static int getItemDamage(ItemStack paramItemStack) {
    return Perry1.0n(null, (int)-96438629L ^ 0xFECA0180, paramItemStack);
  }
  
  public static int findItemInventorySlot(Item item, boolean offHand) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2341
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 2333
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2325
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/concurrent/atomic/AtomicInteger
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 44
    //   34: ldc2_w -1981106011
    //   37: l2i
    //   38: ldc -1565884637
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w -225060499
    //   47: l2i
    //   48: ldc -679612768
    //   50: ixor
    //   51: ldc2_w 383119411
    //   54: l2i
    //   55: ldc -1870291793
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1391416550 -> 2280, -1278460575 -> 44
    //   84: goto -> 88
    //   87: athrow
    //   88: invokespecial <init> : ()V
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.c : I
    //   98: iflt -> 111
    //   101: ldc2_w 1191986157
    //   104: l2i
    //   105: ldc 1086353306
    //   107: ixor
    //   108: goto -> 118
    //   111: ldc2_w -545503218
    //   114: l2i
    //   115: ldc 158333533
    //   117: ixor
    //   118: ldc2_w -1640419962
    //   121: l2i
    //   122: ldc 1979600183
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 2270, -334803770 -> 111, 1037357794 -> 152
    //   152: astore_2
    //   153: getstatic Perryc.1 : I
    //   156: ifeq -> 169
    //   159: ldc2_w -772213005
    //   162: l2i
    //   163: ldc -1314493444
    //   165: ixor
    //   166: goto -> 176
    //   169: ldc2_w -1937618152
    //   172: l2i
    //   173: ldc 1885536545
    //   175: ixor
    //   176: ldc2_w 137461729
    //   179: l2i
    //   180: ldc 2107506771
    //   182: ixor
    //   183: ixor
    //   184: lookupswitch default -> 2292, -1991363189 -> 212, 368173757 -> 169
    //   212: aload_2
    //   213: ldc2_w 561650269
    //   216: l2i
    //   217: ldc -561650270
    //   219: ixor
    //   220: getstatic Perryc.0 : I
    //   223: ifle -> 236
    //   226: ldc2_w 310290287
    //   229: l2i
    //   230: ldc 1395187090
    //   232: ixor
    //   233: goto -> 243
    //   236: ldc2_w -505691262
    //   239: l2i
    //   240: ldc 2015383959
    //   242: ixor
    //   243: ldc2_w 1344882224
    //   246: l2i
    //   247: ldc -301863906
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 2274, -8466221 -> 236, 668153915 -> 276
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual set : (I)V
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.c : I
    //   290: iflt -> 303
    //   293: ldc2_w -1142853455
    //   296: l2i
    //   297: ldc -793518680
    //   299: ixor
    //   300: goto -> 310
    //   303: ldc2_w -1149714270
    //   306: l2i
    //   307: ldc 1168821874
    //   309: ixor
    //   310: ldc2_w -1979029604
    //   313: l2i
    //   314: ldc -1039511405
    //   316: ixor
    //   317: ixor
    //   318: lookupswitch default -> 2260, -1227736609 -> 344, 592615958 -> 303
    //   344: goto -> 348
    //   347: athrow
    //   348: invokestatic getInventoryAndHotbarSlots : ()Ljava/util/Map;
    //   351: goto -> 355
    //   354: athrow
    //   355: getstatic Perryc.c : I
    //   358: iflt -> 371
    //   361: ldc2_w -729992691
    //   364: l2i
    //   365: ldc 1172389375
    //   367: ixor
    //   368: goto -> 378
    //   371: ldc2_w -1907449356
    //   374: l2i
    //   375: ldc -64870229
    //   377: ixor
    //   378: ldc2_w -2028807278
    //   381: l2i
    //   382: ldc -910347253
    //   384: ixor
    //   385: ixor
    //   386: lookupswitch default -> 412, -550248341 -> 2282, 738850667 -> 371
    //   412: goto -> 416
    //   415: athrow
    //   416: invokeinterface entrySet : ()Ljava/util/Set;
    //   421: goto -> 425
    //   424: athrow
    //   425: getstatic Perryc.1 : I
    //   428: ifeq -> 441
    //   431: ldc2_w -1537077549
    //   434: l2i
    //   435: ldc -1253691943
    //   437: ixor
    //   438: goto -> 448
    //   441: ldc2_w 2088914830
    //   444: l2i
    //   445: ldc 623932019
    //   447: ixor
    //   448: ldc2_w 257397673
    //   451: l2i
    //   452: ldc -27998169
    //   454: ixor
    //   455: ixor
    //   456: lookupswitch default -> 484, -534284156 -> 2302, 1875407276 -> 441
    //   484: goto -> 488
    //   487: athrow
    //   488: invokeinterface iterator : ()Ljava/util/Iterator;
    //   493: goto -> 497
    //   496: athrow
    //   497: getstatic Perryc.1 : I
    //   500: ifeq -> 513
    //   503: ldc2_w -1950423705
    //   506: l2i
    //   507: ldc 994986727
    //   509: ixor
    //   510: goto -> 520
    //   513: ldc2_w 99658013
    //   516: l2i
    //   517: ldc -586238593
    //   519: ixor
    //   520: ldc2_w 534141385
    //   523: l2i
    //   524: ldc 19481999
    //   526: ixor
    //   527: ixor
    //   528: lookupswitch default -> 2264, -1374702650 -> 513, -973012956 -> 556
    //   556: astore_3
    //   557: getstatic Perryc.c : I
    //   560: iflt -> 573
    //   563: ldc2_w 251499935
    //   566: l2i
    //   567: ldc 2121084654
    //   569: ixor
    //   570: goto -> 580
    //   573: ldc2_w 1825399930
    //   576: l2i
    //   577: ldc -746636772
    //   579: ixor
    //   580: ldc2_w -1899183403
    //   583: l2i
    //   584: ldc -378369570
    //   586: ixor
    //   587: ixor
    //   588: lookupswitch default -> 616, 388952186 -> 2290, 1021252412 -> 573
    //   616: aload_3
    //   617: getstatic Perryc.1 : I
    //   620: ifeq -> 633
    //   623: ldc2_w 1170846074
    //   626: l2i
    //   627: ldc -1222836091
    //   629: ixor
    //   630: goto -> 640
    //   633: ldc2_w -247511416
    //   636: l2i
    //   637: ldc 554678255
    //   639: ixor
    //   640: ldc2_w 1062477472
    //   643: l2i
    //   644: ldc 1314949259
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 676, -2082461740 -> 2278, 838345449 -> 633
    //   676: goto -> 680
    //   679: athrow
    //   680: invokeinterface hasNext : ()Z
    //   685: goto -> 689
    //   688: athrow
    //   689: ifeq -> 702
    //   692: ldc2_w 609443032
    //   695: l2i
    //   696: ldc -72103357
    //   698: ixor
    //   699: goto -> 709
    //   702: ldc2_w 2055345056
    //   705: l2i
    //   706: ldc -1520270028
    //   708: ixor
    //   709: ldc2_w -1170446572
    //   712: l2i
    //   713: ldc 1213209128
    //   715: ixor
    //   716: ixor
    //   717: tableswitch default -> 692, 764210087 -> 740, 764210088 -> 2123
    //   740: getstatic Perryc.0 : I
    //   743: ifle -> 756
    //   746: ldc2_w 1327497930
    //   749: l2i
    //   750: ldc 287917331
    //   752: ixor
    //   753: goto -> 763
    //   756: ldc2_w -1558898840
    //   759: l2i
    //   760: ldc 1798483403
    //   762: ixor
    //   763: ldc2_w -105435549
    //   766: l2i
    //   767: ldc 471476783
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 2312, -1146862699 -> 756, 764067567 -> 796
    //   796: aload_3
    //   797: getstatic Perryc.c : I
    //   800: iflt -> 813
    //   803: ldc2_w 215322018
    //   806: l2i
    //   807: ldc 1492348593
    //   809: ixor
    //   810: goto -> 820
    //   813: ldc2_w 1107382071
    //   816: l2i
    //   817: ldc 1799258246
    //   819: ixor
    //   820: ldc2_w 889457852
    //   823: l2i
    //   824: ldc 2020967705
    //   826: ixor
    //   827: ixor
    //   828: lookupswitch default -> 856, 425159350 -> 2314, 691984061 -> 813
    //   856: goto -> 860
    //   859: athrow
    //   860: invokeinterface next : ()Ljava/lang/Object;
    //   865: goto -> 869
    //   868: athrow
    //   869: checkcast java/util/Map$Entry
    //   872: getstatic Perryc.c : I
    //   875: iflt -> 888
    //   878: ldc2_w 1673747673
    //   881: l2i
    //   882: ldc -1354600275
    //   884: ixor
    //   885: goto -> 895
    //   888: ldc2_w 1935235634
    //   891: l2i
    //   892: ldc -589190788
    //   894: ixor
    //   895: ldc2_w 1348860672
    //   898: l2i
    //   899: ldc -352039343
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, 1501592817 -> 888, 2011207973 -> 2288
    //   928: astore #4
    //   930: getstatic Perryc.1 : I
    //   933: ifeq -> 946
    //   936: ldc2_w -683988235
    //   939: l2i
    //   940: ldc -262061520
    //   942: ixor
    //   943: goto -> 953
    //   946: ldc2_w 2020291941
    //   949: l2i
    //   950: ldc 2146922573
    //   952: ixor
    //   953: ldc2_w -708624439
    //   956: l2i
    //   957: ldc 421754572
    //   959: ixor
    //   960: ixor
    //   961: lookupswitch default -> 2272, -881062867 -> 988, -340123200 -> 946
    //   988: aload #4
    //   990: getstatic Perryc.0 : I
    //   993: ifle -> 1006
    //   996: ldc2_w -1599003606
    //   999: l2i
    //   1000: ldc 324394914
    //   1002: ixor
    //   1003: goto -> 1013
    //   1006: ldc2_w -1028607792
    //   1009: l2i
    //   1010: ldc 1019994229
    //   1012: ixor
    //   1013: ldc2_w 1804255537
    //   1016: l2i
    //   1017: ldc -820083294
    //   1019: ixor
    //   1020: ixor
    //   1021: lookupswitch default -> 2284, 393264923 -> 1006, 1525617718 -> 1048
    //   1048: goto -> 1052
    //   1051: athrow
    //   1052: invokeinterface getValue : ()Ljava/lang/Object;
    //   1057: goto -> 1061
    //   1060: athrow
    //   1061: checkcast net/minecraft/item/ItemStack
    //   1064: getstatic Perryc.c : I
    //   1067: iflt -> 1081
    //   1070: ldc2_w 2044494975
    //   1073: l2i
    //   1074: ldc_w 987357627
    //   1077: ixor
    //   1078: goto -> 1089
    //   1081: ldc2_w 463105389
    //   1084: l2i
    //   1085: ldc_w 784437861
    //   1088: ixor
    //   1089: ldc2_w -2112178990
    //   1092: l2i
    //   1093: ldc_w -1134780105
    //   1096: ixor
    //   1097: ixor
    //   1098: lookupswitch default -> 1124, -1162226117 -> 1081, 2101571617 -> 2286
    //   1124: goto -> 1128
    //   1127: athrow
    //   1128: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1131: goto -> 1135
    //   1134: athrow
    //   1135: getstatic Perryc.1 : I
    //   1138: ifeq -> 1152
    //   1141: ldc2_w -1493109708
    //   1144: l2i
    //   1145: ldc_w -304462119
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w -438313422
    //   1155: l2i
    //   1156: ldc_w 1784439
    //   1159: ixor
    //   1160: ldc2_w 1710812665
    //   1163: l2i
    //   1164: ldc_w 1960344163
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 1196, 1543120247 -> 2256, 1645371804 -> 1152
    //   1196: aload_0
    //   1197: if_acmpne -> 1211
    //   1200: ldc2_w -1393578679
    //   1203: l2i
    //   1204: ldc_w 1451783087
    //   1207: ixor
    //   1208: goto -> 1219
    //   1211: ldc2_w 389650314
    //   1214: l2i
    //   1215: ldc_w -312587923
    //   1218: ixor
    //   1219: ldc2_w 279629196
    //   1222: l2i
    //   1223: ldc_w -333979952
    //   1226: ixor
    //   1227: ixor
    //   1228: tableswitch default -> 1200, 115002810 -> 1252, 115002811 -> 2120
    //   1252: getstatic Perryc.c : I
    //   1255: iflt -> 1269
    //   1258: ldc2_w 1206943098
    //   1261: l2i
    //   1262: ldc_w 1690474307
    //   1265: ixor
    //   1266: goto -> 1277
    //   1269: ldc2_w -2093813337
    //   1272: l2i
    //   1273: ldc_w -1916931501
    //   1276: ixor
    //   1277: ldc2_w -1117962729
    //   1280: l2i
    //   1281: ldc_w -280578488
    //   1284: ixor
    //   1285: ixor
    //   1286: lookupswitch default -> 1312, -795623348 -> 1269, 1898537574 -> 2304
    //   1312: aload #4
    //   1314: getstatic Perryc.c : I
    //   1317: iflt -> 1331
    //   1320: ldc2_w 887240766
    //   1323: l2i
    //   1324: ldc_w 1317196843
    //   1327: ixor
    //   1328: goto -> 1339
    //   1331: ldc2_w -1951285122
    //   1334: l2i
    //   1335: ldc_w 1045682533
    //   1338: ixor
    //   1339: ldc2_w -1137180977
    //   1342: l2i
    //   1343: ldc_w -2046259562
    //   1346: ixor
    //   1347: ixor
    //   1348: lookupswitch default -> 1376, 1080007756 -> 2266, 1868494054 -> 1331
    //   1376: goto -> 1380
    //   1379: athrow
    //   1380: invokeinterface getKey : ()Ljava/lang/Object;
    //   1385: goto -> 1389
    //   1388: athrow
    //   1389: checkcast java/lang/Integer
    //   1392: getstatic Perryc.0 : I
    //   1395: ifle -> 1409
    //   1398: ldc2_w 1267532391
    //   1401: l2i
    //   1402: ldc_w -1378262752
    //   1405: ixor
    //   1406: goto -> 1417
    //   1409: ldc2_w -1892639550
    //   1412: l2i
    //   1413: ldc_w 1823744673
    //   1416: ixor
    //   1417: ldc2_w -407774672
    //   1420: l2i
    //   1421: ldc_w 1555455362
    //   1424: ixor
    //   1425: ixor
    //   1426: lookupswitch default -> 1452, 184119622 -> 1409, 1565779189 -> 2308
    //   1452: goto -> 1456
    //   1455: athrow
    //   1456: invokevirtual intValue : ()I
    //   1459: goto -> 1463
    //   1462: athrow
    //   1463: ldc2_w 592227589
    //   1466: l2i
    //   1467: ldc_w 592227624
    //   1470: ixor
    //   1471: if_icmpne -> 1485
    //   1474: ldc2_w -678075418
    //   1477: l2i
    //   1478: ldc_w -1031454250
    //   1481: ixor
    //   1482: goto -> 1493
    //   1485: ldc2_w -1617055043
    //   1488: l2i
    //   1489: ldc_w -1970433908
    //   1492: ixor
    //   1493: ldc2_w 513534841
    //   1496: l2i
    //   1497: ldc_w 2064329949
    //   1500: ixor
    //   1501: ixor
    //   1502: tableswitch default -> 1474, 1887495572 -> 1524, 1887495573 -> 1643
    //   1524: getstatic Perryc.0 : I
    //   1527: ifle -> 1541
    //   1530: ldc2_w 1616320097
    //   1533: l2i
    //   1534: ldc_w 302450825
    //   1537: ixor
    //   1538: goto -> 1549
    //   1541: ldc2_w -1902524976
    //   1544: l2i
    //   1545: ldc_w -1760133321
    //   1548: ixor
    //   1549: ldc2_w 1233041819
    //   1552: l2i
    //   1553: ldc_w 493016105
    //   1556: ixor
    //   1557: ixor
    //   1558: lookupswitch default -> 2258, 642544474 -> 1541, 1301534549 -> 1584
    //   1584: iload_1
    //   1585: ifne -> 1599
    //   1588: ldc2_w 741995027
    //   1591: l2i
    //   1592: ldc_w -1206318586
    //   1595: ixor
    //   1596: goto -> 1607
    //   1599: ldc2_w -1869950681
    //   1602: l2i
    //   1603: ldc_w 78260493
    //   1606: ixor
    //   1607: ldc2_w 1781839027
    //   1610: l2i
    //   1611: ldc_w -953997063
    //   1614: ixor
    //   1615: ixor
    //   1616: tableswitch default -> 1588, 959931487 -> 1640, 959931488 -> 1643
    //   1640: goto -> 557
    //   1643: getstatic Perryc.1 : I
    //   1646: ifeq -> 1660
    //   1649: ldc2_w -1474975994
    //   1652: l2i
    //   1653: ldc_w -697796614
    //   1656: ixor
    //   1657: goto -> 1668
    //   1660: ldc2_w 1945726493
    //   1663: l2i
    //   1664: ldc_w -1052159511
    //   1667: ixor
    //   1668: ldc2_w 1435169724
    //   1671: l2i
    //   1672: ldc_w -1823198336
    //   1675: ixor
    //   1676: ixor
    //   1677: lookupswitch default -> 1704, -1197272896 -> 2296, 1456147510 -> 1660
    //   1704: aload_2
    //   1705: getstatic Perryc.1 : I
    //   1708: ifeq -> 1722
    //   1711: ldc2_w 1643063879
    //   1714: l2i
    //   1715: ldc_w 414455068
    //   1718: ixor
    //   1719: goto -> 1730
    //   1722: ldc2_w -1875736700
    //   1725: l2i
    //   1726: ldc_w -1913727677
    //   1729: ixor
    //   1730: ldc2_w -199207694
    //   1733: l2i
    //   1734: ldc_w 820405849
    //   1737: ixor
    //   1738: ixor
    //   1739: lookupswitch default -> 1764, -1482891747 -> 1722, -1113780752 -> 2268
    //   1764: aload #4
    //   1766: getstatic Perryc.1 : I
    //   1769: ifeq -> 1783
    //   1772: ldc2_w 805940725
    //   1775: l2i
    //   1776: ldc_w -2064666207
    //   1779: ixor
    //   1780: goto -> 1791
    //   1783: ldc2_w 1866280354
    //   1786: l2i
    //   1787: ldc_w 855448929
    //   1790: ixor
    //   1791: ldc2_w 967718626
    //   1794: l2i
    //   1795: ldc_w -1052885638
    //   1798: ixor
    //   1799: ixor
    //   1800: lookupswitch default -> 1828, -1790458752 -> 1783, 1282807756 -> 2298
    //   1828: goto -> 1832
    //   1831: athrow
    //   1832: invokeinterface getKey : ()Ljava/lang/Object;
    //   1837: goto -> 1841
    //   1840: athrow
    //   1841: checkcast java/lang/Integer
    //   1844: getstatic Perryc.0 : I
    //   1847: ifle -> 1861
    //   1850: ldc2_w 713241245
    //   1853: l2i
    //   1854: ldc_w 99576211
    //   1857: ixor
    //   1858: goto -> 1869
    //   1861: ldc2_w 139802713
    //   1864: l2i
    //   1865: ldc_w 616378565
    //   1868: ixor
    //   1869: ldc2_w 1032316658
    //   1872: l2i
    //   1873: ldc_w -1534492640
    //   1876: ixor
    //   1877: ixor
    //   1878: lookupswitch default -> 1904, -1235075620 -> 2310, -108171830 -> 1861
    //   1904: goto -> 1908
    //   1907: athrow
    //   1908: invokevirtual intValue : ()I
    //   1911: goto -> 1915
    //   1914: athrow
    //   1915: getstatic Perryc.0 : I
    //   1918: ifle -> 1932
    //   1921: ldc2_w -771142207
    //   1924: l2i
    //   1925: ldc_w 1746464168
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w -1657893450
    //   1935: l2i
    //   1936: ldc_w 1485170437
    //   1939: ixor
    //   1940: ldc2_w 1112783657
    //   1943: l2i
    //   1944: ldc_w -1246552138
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 1976, 1082754424 -> 1932, 1307641078 -> 2306
    //   1976: goto -> 1980
    //   1979: athrow
    //   1980: invokevirtual set : (I)V
    //   1983: goto -> 1987
    //   1986: athrow
    //   1987: getstatic Perryc.c : I
    //   1990: iflt -> 2004
    //   1993: ldc2_w 2029752927
    //   1996: l2i
    //   1997: ldc_w 535107201
    //   2000: ixor
    //   2001: goto -> 2012
    //   2004: ldc2_w 407661835
    //   2007: l2i
    //   2008: ldc_w -1635869104
    //   2011: ixor
    //   2012: ldc2_w 46888278
    //   2015: l2i
    //   2016: ldc_w 95747215
    //   2019: ixor
    //   2020: ixor
    //   2021: lookupswitch default -> 2048, -517191454 -> 2004, 1616973063 -> 2300
    //   2048: aload_2
    //   2049: getstatic Perryc.1 : I
    //   2052: ifeq -> 2066
    //   2055: ldc2_w -1795945769
    //   2058: l2i
    //   2059: ldc_w -2061299871
    //   2062: ixor
    //   2063: goto -> 2074
    //   2066: ldc2_w 2097586095
    //   2069: l2i
    //   2070: ldc_w 2118560746
    //   2073: ixor
    //   2074: ldc2_w -1885424744
    //   2077: l2i
    //   2078: ldc_w -217166018
    //   2081: ixor
    //   2082: ixor
    //   2083: lookupswitch default -> 2108, 500686665 -> 2066, 1833433360 -> 2294
    //   2108: goto -> 2112
    //   2111: athrow
    //   2112: invokevirtual get : ()I
    //   2115: goto -> 2119
    //   2118: athrow
    //   2119: ireturn
    //   2120: goto -> 557
    //   2123: getstatic Perryc.c : I
    //   2126: iflt -> 2140
    //   2129: ldc2_w -214943351
    //   2132: l2i
    //   2133: ldc_w -189405081
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w -88225698
    //   2143: l2i
    //   2144: ldc_w -645723355
    //   2147: ixor
    //   2148: ldc2_w -1198871890
    //   2151: l2i
    //   2152: ldc_w -528931177
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 2184, -599174805 -> 2140, 1601592791 -> 2262
    //   2184: aload_2
    //   2185: getstatic Perryc.c : I
    //   2188: iflt -> 2202
    //   2191: ldc2_w -652736461
    //   2194: l2i
    //   2195: ldc_w 1513541059
    //   2198: ixor
    //   2199: goto -> 2210
    //   2202: ldc2_w -1984508797
    //   2205: l2i
    //   2206: ldc_w 1558138013
    //   2209: ixor
    //   2210: ldc2_w 1728497213
    //   2213: l2i
    //   2214: ldc_w -1910630747
    //   2217: ixor
    //   2218: ixor
    //   2219: lookupswitch default -> 2276, 1014059142 -> 2244, 1781929320 -> 2202
    //   2244: goto -> 2248
    //   2247: athrow
    //   2248: invokevirtual get : ()I
    //   2251: goto -> 2255
    //   2254: athrow
    //   2255: ireturn
    //   2256: aconst_null
    //   2257: athrow
    //   2258: aconst_null
    //   2259: athrow
    //   2260: aconst_null
    //   2261: athrow
    //   2262: aconst_null
    //   2263: athrow
    //   2264: aconst_null
    //   2265: athrow
    //   2266: aconst_null
    //   2267: athrow
    //   2268: aconst_null
    //   2269: athrow
    //   2270: aconst_null
    //   2271: athrow
    //   2272: aconst_null
    //   2273: athrow
    //   2274: aconst_null
    //   2275: athrow
    //   2276: aconst_null
    //   2277: athrow
    //   2278: aconst_null
    //   2279: athrow
    //   2280: aconst_null
    //   2281: athrow
    //   2282: aconst_null
    //   2283: athrow
    //   2284: aconst_null
    //   2285: athrow
    //   2286: aconst_null
    //   2287: athrow
    //   2288: aconst_null
    //   2289: athrow
    //   2290: aconst_null
    //   2291: athrow
    //   2292: aconst_null
    //   2293: athrow
    //   2294: aconst_null
    //   2295: athrow
    //   2296: aconst_null
    //   2297: athrow
    //   2298: aconst_null
    //   2299: athrow
    //   2300: aconst_null
    //   2301: athrow
    //   2302: aconst_null
    //   2303: athrow
    //   2304: aconst_null
    //   2305: athrow
    //   2306: aconst_null
    //   2307: athrow
    //   2308: aconst_null
    //   2309: athrow
    //   2310: aconst_null
    //   2311: athrow
    //   2312: aconst_null
    //   2313: athrow
    //   2314: aconst_null
    //   2315: athrow
    //   2316: pop
    //   2317: goto -> 24
    //   2320: pop
    //   2321: aconst_null
    //   2322: goto -> 2316
    //   2325: dup
    //   2326: ifnull -> 2316
    //   2329: checkcast java/lang/Throwable
    //   2332: athrow
    //   2333: dup
    //   2334: ifnull -> 2320
    //   2337: checkcast java/lang/Throwable
    //   2340: athrow
    //   2341: aconst_null
    //   2342: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   930	1190	4	entry	Ljava/util/Map$Entry;
    //   24	2232	0	item	Lnet/minecraft/item/Item;
    //   24	2232	1	offHand	Z
    //   153	2103	2	slot	Ljava/util/concurrent/atomic/AtomicInteger;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   930	1190	4	entry	Ljava/util/Map$Entry<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2325	finally
    //   87	94	94	finally
    //   87	94	87	finally
    //   87	94	94	finally
    //   87	94	94	finally
    //   88	94	87	java/lang/NullPointerException
    //   279	286	286	finally
    //   279	286	286	java/lang/IllegalArgumentException
    //   280	286	279	finally
    //   280	286	3	java/lang/NegativeArraySizeException
    //   280	286	3	java/lang/UnsupportedOperationException
    //   347	354	354	finally
    //   347	354	347	finally
    //   347	354	3	finally
    //   347	354	347	finally
    //   348	354	347	java/lang/IllegalArgumentException
    //   415	424	424	finally
    //   415	424	3	java/util/NoSuchElementException
    //   415	424	424	java/lang/NegativeArraySizeException
    //   416	424	415	java/lang/ClassCastException
    //   416	424	3	finally
    //   487	496	496	finally
    //   487	496	3	java/lang/AssertionError
    //   487	496	496	finally
    //   487	496	3	java/lang/StringIndexOutOfBoundsException
    //   488	496	487	java/util/ConcurrentModificationException
    //   679	688	688	finally
    //   679	688	3	finally
    //   679	688	679	java/lang/ClassCastException
    //   680	688	3	finally
    //   680	688	679	finally
    //   859	868	868	finally
    //   860	868	3	finally
    //   860	868	859	java/lang/AssertionError
    //   860	868	859	java/lang/EnumConstantNotPresentException
    //   860	868	859	java/lang/IndexOutOfBoundsException
    //   1051	1060	1060	finally
    //   1051	1060	1060	finally
    //   1051	1060	1051	finally
    //   1051	1060	1051	java/lang/IllegalArgumentException
    //   1052	1060	1051	finally
    //   1127	1134	1134	finally
    //   1128	1134	3	java/util/NoSuchElementException
    //   1128	1134	1127	finally
    //   1128	1134	1134	finally
    //   1128	1134	1127	java/lang/NumberFormatException
    //   1379	1388	1388	finally
    //   1379	1388	3	java/lang/EnumConstantNotPresentException
    //   1379	1388	1379	java/lang/ArrayIndexOutOfBoundsException
    //   1380	1388	1388	java/lang/IllegalArgumentException
    //   1380	1388	1379	java/lang/ClassCastException
    //   1455	1462	1462	finally
    //   1455	1462	1455	java/lang/UnsupportedOperationException
    //   1455	1462	1462	finally
    //   1456	1462	3	java/lang/RuntimeException
    //   1456	1462	1455	java/lang/NegativeArraySizeException
    //   1831	1840	1840	finally
    //   1831	1840	1831	java/lang/AssertionError
    //   1831	1840	1840	finally
    //   1831	1840	1831	java/lang/ClassCastException
    //   1832	1840	3	java/lang/NegativeArraySizeException
    //   1907	1914	1914	finally
    //   1907	1914	3	java/util/ConcurrentModificationException
    //   1908	1914	3	java/util/NoSuchElementException
    //   1908	1914	1907	java/util/ConcurrentModificationException
    //   1908	1914	3	finally
    //   1979	1986	1986	finally
    //   1979	1986	1979	java/lang/IllegalStateException
    //   1980	1986	3	java/lang/IndexOutOfBoundsException
    //   1980	1986	3	finally
    //   1980	1986	1986	finally
    //   2111	2118	2118	finally
    //   2111	2118	2118	finally
    //   2111	2118	2118	java/lang/IndexOutOfBoundsException
    //   2112	2118	2118	finally
    //   2112	2118	2111	finally
    //   2247	2254	2254	finally
    //   2247	2254	3	java/lang/ClassCastException
    //   2247	2254	2254	java/util/NoSuchElementException
    //   2248	2254	3	java/lang/UnsupportedOperationException
    //   2248	2254	2247	java/lang/IllegalStateException
    //   2325	2333	2325	java/lang/IllegalArgumentException
    //   2341	2343	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public static Map getInventoryAndHotbarSlots() {
    return Perry1.0h(null, (int)-1534046332L ^ 0xCD8F3056);
  }
  
  public static int getItemSlot(Item item) {
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
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static int getItemSlot(Class clss) {
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
  
  public static int getRoundedDamage(ItemStack paramItemStack) {
    return Perry1.0o(null, (int)-1725310357L ^ 0x98981723, paramItemStack);
  }
  
  public static float getDamageInPercent(ItemStack paramItemStack) {
    return Perry1.0f(null, (int)-1043954406L ^ 0xB848492D, paramItemStack);
  }
  
  public static void switchToHotbarSlot(int slot, boolean silent) {
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
  
  public static boolean isBlock(Item paramItem, Class paramClass) {
    return Perry1.5J(null, (int)1983898011L ^ 0x55D0950B, paramItem, paramClass);
  }
  
  public static boolean isArmorLow(EntityPlayer paramEntityPlayer, int paramInt) {
    return Perry1.53(null, (int)-97243283L ^ 0x9B491D4C, paramEntityPlayer, paramInt);
  }
  
  public ItemUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -2019480761
    //   9: l2i
    //   10: ldc_w 1348432798
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1210809743
    //   20: l2i
    //   21: ldc_w 342505116
    //   24: ixor
    //   25: ldc2_w 1265124135
    //   28: l2i
    //   29: ldc_w 1188076992
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 126, -632912322 -> 17, 1375311348 -> 60
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -2047771531
    //   70: l2i
    //   71: ldc_w -1008097735
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -826151678
    //   81: l2i
    //   82: ldc_w 532191663
    //   85: ixor
    //   86: ldc2_w -1807894396
    //   89: l2i
    //   90: ldc_w -2101827884
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 124, -939758851 -> 120, 1352516636 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/ItemUtil;
  }
  
  public static int getItemCount(Item paramItem) {
    return Perry1.4V(null, (int)491915409L ^ 0x48B7DBC, paramItem);
  }
  
  public static int getItemFromHotbar(Item paramItem) {
    return Perry1.4V(null, (int)-398697372L ^ 0xF1E5294A, paramItem);
  }
  
  public static int findHotbarBlock(Block paramBlock) {
    return Perry1.6e(null, (int)225573926L ^ 0x266012D, paramBlock);
  }
  
  public static boolean hasDurability(ItemStack paramItemStack) {
    return Perry1.0A(null, (int)-152840893L ^ 0xE6BB1F54, paramItemStack);
  }
  
  public static int findHotbarBlock(Class clazz) {
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
  
  public static Map getInventorySlots(int currentI, int last) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\ItemUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */