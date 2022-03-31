package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Util;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.ArrayList;

public class ConfigManager implements Util {
  public ArrayList<Feature> features;
  
  public String config;
  
  public static void setValueFromJson(Feature feature, Setting setting, JsonElement element) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 7345
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 7337
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 7329
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w 851670096
    //   33: l2i
    //   34: ldc 1675766188
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1526255575
    //   43: l2i
    //   44: ldc 1578276295
    //   46: ixor
    //   47: ldc2_w 494751008
    //   50: l2i
    //   51: ldc -1871252134
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -2092649124 -> 40, -601168506 -> 7188
    //   80: aload_1
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 1932565671
    //   90: l2i
    //   91: ldc 1871598623
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -776172101
    //   100: l2i
    //   101: ldc 1255830751
    //   103: ixor
    //   104: ldc2_w 887749020
    //   107: l2i
    //   108: ldc 152141438
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, 123107710 -> 97, 558255962 -> 7290
    //   140: goto -> 144
    //   143: athrow
    //   144: invokevirtual getType : ()Ljava/lang/String;
    //   147: goto -> 151
    //   150: athrow
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 167
    //   157: ldc2_w 1645898710
    //   160: l2i
    //   161: ldc 387968329
    //   163: ixor
    //   164: goto -> 174
    //   167: ldc2_w 1300763613
    //   170: l2i
    //   171: ldc 1989477588
    //   173: ixor
    //   174: ldc2_w -1134813853
    //   177: l2i
    //   178: ldc 2053451459
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 208, -1287867073 -> 7170, 1630208469 -> 167
    //   208: astore #4
    //   210: ldc2_w -1443850389
    //   213: l2i
    //   214: ldc 1443850388
    //   216: ixor
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 233
    //   223: ldc2_w 1231402783
    //   226: l2i
    //   227: ldc 1468283518
    //   229: ixor
    //   230: goto -> 240
    //   233: ldc2_w 676165958
    //   236: l2i
    //   237: ldc 274035320
    //   239: ixor
    //   240: ldc2_w -795191059
    //   243: l2i
    //   244: ldc -2138641750
    //   246: ixor
    //   247: ixor
    //   248: lookupswitch default -> 276, 1325219622 -> 7284, 1611938364 -> 233
    //   276: istore #5
    //   278: getstatic Perryc.c : I
    //   281: iflt -> 294
    //   284: ldc2_w -1857044288
    //   287: l2i
    //   288: ldc 1435546697
    //   290: ixor
    //   291: goto -> 301
    //   294: ldc2_w 938791614
    //   297: l2i
    //   298: ldc -943917169
    //   300: ixor
    //   301: ldc2_w -480220214
    //   304: l2i
    //   305: ldc 456910465
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 7216, 135506042 -> 336, 1015347650 -> 294
    //   336: aload #4
    //   338: getstatic Perryc.0 : I
    //   341: ifle -> 354
    //   344: ldc2_w -471167496
    //   347: l2i
    //   348: ldc 1573879950
    //   350: ixor
    //   351: goto -> 361
    //   354: ldc2_w 632222304
    //   357: l2i
    //   358: ldc 1003968457
    //   360: ixor
    //   361: ldc2_w 188043410
    //   364: l2i
    //   365: ldc -2127569154
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 396, 876577562 -> 7222, 931733825 -> 354
    //   396: goto -> 400
    //   399: athrow
    //   400: invokevirtual hashCode : ()I
    //   403: goto -> 407
    //   406: athrow
    //   407: lookupswitch default -> 2758, -1808118735 -> 1765, -672261858 -> 1433, 2070621 -> 2097, 2165025 -> 2429, 67973692 -> 1101, 1729365000 -> 472, 2052876273 -> 785
    //   472: getstatic Perryc.c : I
    //   475: iflt -> 488
    //   478: ldc2_w 372560830
    //   481: l2i
    //   482: ldc -1388464328
    //   484: ixor
    //   485: goto -> 495
    //   488: ldc2_w 731472875
    //   491: l2i
    //   492: ldc -1464769207
    //   494: ixor
    //   495: ldc2_w 1141602936
    //   498: l2i
    //   499: ldc 1193452822
    //   501: ixor
    //   502: ixor
    //   503: lookupswitch default -> 528, -1205814296 -> 7132, 1560515434 -> 488
    //   528: aload #4
    //   530: ldc 'េ㌜ើ铈篌丹๷'
    //   532: getstatic Perryc.0 : I
    //   535: ifle -> 548
    //   538: ldc2_w 1883401674
    //   541: l2i
    //   542: ldc 108088702
    //   544: ixor
    //   545: goto -> 555
    //   548: ldc2_w 390761848
    //   551: l2i
    //   552: ldc 575985162
    //   554: ixor
    //   555: ldc2_w 671721622
    //   558: l2i
    //   559: ldc -1338186571
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 588, -1248764273 -> 548, -301568873 -> 7144
    //   588: goto -> 592
    //   591: athrow
    //   592: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   595: goto -> 599
    //   598: athrow
    //   599: getstatic Perryc.0 : I
    //   602: ifle -> 615
    //   605: ldc2_w 1690252174
    //   608: l2i
    //   609: ldc 1327911929
    //   611: ixor
    //   612: goto -> 622
    //   615: ldc2_w 671415181
    //   618: l2i
    //   619: ldc 666305569
    //   621: ixor
    //   622: ldc2_w -343158406
    //   625: l2i
    //   626: ldc 1196756652
    //   628: ixor
    //   629: ixor
    //   630: lookupswitch default -> 7212, -2025341023 -> 615, -1553129350 -> 656
    //   656: goto -> 660
    //   659: athrow
    //   660: invokevirtual equals : (Ljava/lang/Object;)Z
    //   663: goto -> 667
    //   666: athrow
    //   667: ifeq -> 680
    //   670: ldc2_w -1746393826
    //   673: l2i
    //   674: ldc 1004031172
    //   676: ixor
    //   677: goto -> 687
    //   680: ldc2_w 1233864892
    //   683: l2i
    //   684: ldc -440721049
    //   686: ixor
    //   687: ldc2_w 2073678076
    //   690: l2i
    //   691: ldc 1133471042
    //   693: ixor
    //   694: ixor
    //   695: tableswitch default -> 670, -1809392540 -> 716, -1809392539 -> 2758
    //   716: ldc2_w 2043726954
    //   719: l2i
    //   720: ldc 2043726954
    //   722: ixor
    //   723: getstatic Perryc.0 : I
    //   726: ifle -> 739
    //   729: ldc2_w -2008750069
    //   732: l2i
    //   733: ldc 1917441260
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w -564368202
    //   742: l2i
    //   743: ldc -494896507
    //   745: ixor
    //   746: ldc2_w 1645300899
    //   749: l2i
    //   750: ldc 146915741
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 780, -1864519207 -> 7130, 1583329678 -> 739
    //   780: istore #5
    //   782: goto -> 2758
    //   785: getstatic Perryc.c : I
    //   788: iflt -> 801
    //   791: ldc2_w 1722493287
    //   794: l2i
    //   795: ldc 2035352362
    //   797: ixor
    //   798: goto -> 808
    //   801: ldc2_w -1015871831
    //   804: l2i
    //   805: ldc -761544097
    //   807: ixor
    //   808: ldc2_w -1290246085
    //   811: l2i
    //   812: ldc 363582020
    //   814: ixor
    //   815: ixor
    //   816: lookupswitch default -> 7234, -1218740599 -> 844, -1186361294 -> 801
    //   844: aload #4
    //   846: ldc 'ះ㌜ឤ铆篅讀'
    //   848: getstatic Perryc.c : I
    //   851: iflt -> 864
    //   854: ldc2_w 267204665
    //   857: l2i
    //   858: ldc 874853938
    //   860: ixor
    //   861: goto -> 871
    //   864: ldc2_w 2120037353
    //   867: l2i
    //   868: ldc 161332152
    //   870: ixor
    //   871: ldc2_w -1648131292
    //   874: l2i
    //   875: ldc 1713425443
    //   877: ixor
    //   878: ixor
    //   879: lookupswitch default -> 904, -1619764711 -> 864, -1070907124 -> 7182
    //   904: goto -> 908
    //   907: athrow
    //   908: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   911: goto -> 915
    //   914: athrow
    //   915: getstatic Perryc.1 : I
    //   918: ifeq -> 931
    //   921: ldc2_w -226161728
    //   924: l2i
    //   925: ldc -53071444
    //   927: ixor
    //   928: goto -> 938
    //   931: ldc2_w 1893185413
    //   934: l2i
    //   935: ldc 746782187
    //   937: ixor
    //   938: ldc2_w -895849048
    //   941: l2i
    //   942: ldc 1410425626
    //   944: ixor
    //   945: ixor
    //   946: lookupswitch default -> 972, -1864878882 -> 7262, 451382014 -> 931
    //   972: goto -> 976
    //   975: athrow
    //   976: invokevirtual equals : (Ljava/lang/Object;)Z
    //   979: goto -> 983
    //   982: athrow
    //   983: ifeq -> 996
    //   986: ldc2_w -1946063635
    //   989: l2i
    //   990: ldc 1120717163
    //   992: ixor
    //   993: goto -> 1003
    //   996: ldc2_w 1890345845
    //   999: l2i
    //   1000: ldc -1100888336
    //   1002: ixor
    //   1003: ldc2_w -1430300893
    //   1006: l2i
    //   1007: ldc 970194556
    //   1009: ixor
    //   1010: ixor
    //   1011: tableswitch default -> 986, 1570835673 -> 1032, 1570835674 -> 2758
    //   1032: ldc2_w -834060693
    //   1035: l2i
    //   1036: ldc -834060694
    //   1038: ixor
    //   1039: getstatic Perryc.1 : I
    //   1042: ifeq -> 1055
    //   1045: ldc2_w 1866561471
    //   1048: l2i
    //   1049: ldc 1347727967
    //   1051: ixor
    //   1052: goto -> 1062
    //   1055: ldc2_w 1097117443
    //   1058: l2i
    //   1059: ldc 915011570
    //   1061: ixor
    //   1062: ldc2_w -1136787477
    //   1065: l2i
    //   1066: ldc 1396577297
    //   1068: ixor
    //   1069: ixor
    //   1070: lookupswitch default -> 7196, -1729187061 -> 1096, -803852774 -> 1055
    //   1096: istore #5
    //   1098: goto -> 2758
    //   1101: getstatic Perryc.c : I
    //   1104: iflt -> 1117
    //   1107: ldc2_w -514962192
    //   1110: l2i
    //   1111: ldc 1881942588
    //   1113: ixor
    //   1114: goto -> 1124
    //   1117: ldc2_w -1493416575
    //   1120: l2i
    //   1121: ldc -1097891054
    //   1123: ixor
    //   1124: ldc2_w -1365267468
    //   1127: l2i
    //   1128: ldc 1623200121
    //   1130: ixor
    //   1131: ixor
    //   1132: lookupswitch default -> 7256, -701727714 -> 1160, 1597889601 -> 1117
    //   1160: aload #4
    //   1162: ldc 'ៅ㌟ើ铅篝'
    //   1164: getstatic Perryc.1 : I
    //   1167: ifeq -> 1180
    //   1170: ldc2_w 629986687
    //   1173: l2i
    //   1174: ldc -246608774
    //   1176: ixor
    //   1177: goto -> 1188
    //   1180: ldc2_w -811212919
    //   1183: l2i
    //   1184: ldc_w 1020960629
    //   1187: ixor
    //   1188: ldc2_w 1154659089
    //   1191: l2i
    //   1192: ldc_w 890569038
    //   1195: ixor
    //   1196: ixor
    //   1197: lookupswitch default -> 7240, -2101808477 -> 1224, -1526305958 -> 1180
    //   1224: goto -> 1228
    //   1227: athrow
    //   1228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1231: goto -> 1235
    //   1234: athrow
    //   1235: getstatic Perryc.0 : I
    //   1238: ifle -> 1252
    //   1241: ldc2_w 994631176
    //   1244: l2i
    //   1245: ldc_w 2070118151
    //   1248: ixor
    //   1249: goto -> 1260
    //   1252: ldc2_w -1899987748
    //   1255: l2i
    //   1256: ldc_w -1512210736
    //   1259: ixor
    //   1260: ldc2_w -163902948
    //   1263: l2i
    //   1264: ldc_w 422624348
    //   1267: ixor
    //   1268: ixor
    //   1269: lookupswitch default -> 7176, -1356851377 -> 1252, -1005145012 -> 1296
    //   1296: goto -> 1300
    //   1299: athrow
    //   1300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1303: goto -> 1307
    //   1306: athrow
    //   1307: ifeq -> 1321
    //   1310: ldc2_w -483338530
    //   1313: l2i
    //   1314: ldc_w 1950198598
    //   1317: ixor
    //   1318: goto -> 1329
    //   1321: ldc2_w -1233752239
    //   1324: l2i
    //   1325: ldc_w 561713864
    //   1328: ixor
    //   1329: ldc2_w -378174243
    //   1332: l2i
    //   1333: ldc_w -762630247
    //   1336: ixor
    //   1337: ixor
    //   1338: tableswitch default -> 1310, -1393305892 -> 1360, -1393305891 -> 2758
    //   1360: ldc2_w -1619297222
    //   1363: l2i
    //   1364: ldc_w -1619297224
    //   1367: ixor
    //   1368: getstatic Perryc.1 : I
    //   1371: ifeq -> 1385
    //   1374: ldc2_w 380918625
    //   1377: l2i
    //   1378: ldc_w 628823795
    //   1381: ixor
    //   1382: goto -> 1393
    //   1385: ldc2_w -1572005319
    //   1388: l2i
    //   1389: ldc_w 2067220978
    //   1392: ixor
    //   1393: ldc2_w 1122427967
    //   1396: l2i
    //   1397: ldc_w 86742211
    //   1400: ixor
    //   1401: ixor
    //   1402: lookupswitch default -> 7172, -1632165065 -> 1428, 1946303854 -> 1385
    //   1428: istore #5
    //   1430: goto -> 2758
    //   1433: getstatic Perryc.c : I
    //   1436: iflt -> 1450
    //   1439: ldc2_w 532148855
    //   1442: l2i
    //   1443: ldc_w -190739753
    //   1446: ixor
    //   1447: goto -> 1458
    //   1450: ldc2_w -1368139500
    //   1453: l2i
    //   1454: ldc_w -1408471932
    //   1457: ixor
    //   1458: ldc2_w -1629446301
    //   1461: l2i
    //   1462: ldc_w -172928481
    //   1465: ixor
    //   1466: ixor
    //   1467: lookupswitch default -> 7184, -2142784036 -> 1450, 1764653292 -> 1492
    //   1492: aload #4
    //   1494: ldc_w '៊㌝ឥ铁篎讀๫'
    //   1497: getstatic Perryc.0 : I
    //   1500: ifle -> 1514
    //   1503: ldc2_w 1785745690
    //   1506: l2i
    //   1507: ldc_w 1989372160
    //   1510: ixor
    //   1511: goto -> 1522
    //   1514: ldc2_w 1434881371
    //   1517: l2i
    //   1518: ldc_w -618301802
    //   1521: ixor
    //   1522: ldc2_w -80300960
    //   1525: l2i
    //   1526: ldc_w 1378940059
    //   1529: ixor
    //   1530: ixor
    //   1531: lookupswitch default -> 1556, -1243252511 -> 7300, 16832301 -> 1514
    //   1556: goto -> 1560
    //   1559: athrow
    //   1560: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1563: goto -> 1567
    //   1566: athrow
    //   1567: getstatic Perryc.0 : I
    //   1570: ifle -> 1584
    //   1573: ldc2_w 1314941234
    //   1576: l2i
    //   1577: ldc_w -1972360208
    //   1580: ixor
    //   1581: goto -> 1592
    //   1584: ldc2_w 1022903344
    //   1587: l2i
    //   1588: ldc_w 1045813043
    //   1591: ixor
    //   1592: ldc2_w 1016068282
    //   1595: l2i
    //   1596: ldc_w 1446908978
    //   1599: ixor
    //   1600: ixor
    //   1601: lookupswitch default -> 7142, -1365135798 -> 1584, 1746698123 -> 1628
    //   1628: goto -> 1632
    //   1631: athrow
    //   1632: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1635: goto -> 1639
    //   1638: athrow
    //   1639: ifeq -> 1653
    //   1642: ldc2_w 374773015
    //   1645: l2i
    //   1646: ldc_w 1764190354
    //   1649: ixor
    //   1650: goto -> 1661
    //   1653: ldc2_w -567804253
    //   1656: l2i
    //   1657: ldc_w -1588198617
    //   1660: ixor
    //   1661: ldc2_w 1571499996
    //   1664: l2i
    //   1665: ldc_w -187196437
    //   1668: ixor
    //   1669: ixor
    //   1670: tableswitch default -> 1642, -703772238 -> 1692, -703772237 -> 2758
    //   1692: ldc2_w -204229283
    //   1695: l2i
    //   1696: ldc_w -204229282
    //   1699: ixor
    //   1700: getstatic Perryc.0 : I
    //   1703: ifle -> 1717
    //   1706: ldc2_w -711244349
    //   1709: l2i
    //   1710: ldc_w -1813781853
    //   1713: ixor
    //   1714: goto -> 1725
    //   1717: ldc2_w 327120136
    //   1720: l2i
    //   1721: ldc_w 1535452376
    //   1724: ixor
    //   1725: ldc2_w 779127521
    //   1728: l2i
    //   1729: ldc_w -1329870424
    //   1732: ixor
    //   1733: ixor
    //   1734: lookupswitch default -> 7134, -701427047 -> 1760, -659299287 -> 1717
    //   1760: istore #5
    //   1762: goto -> 2758
    //   1765: getstatic Perryc.c : I
    //   1768: iflt -> 1782
    //   1771: ldc2_w 535797735
    //   1774: l2i
    //   1775: ldc_w -182633669
    //   1778: ixor
    //   1779: goto -> 1790
    //   1782: ldc2_w -1061694819
    //   1785: l2i
    //   1786: ldc_w -495708420
    //   1789: ixor
    //   1790: ldc2_w -1162997567
    //   1793: l2i
    //   1794: ldc_w -2114747285
    //   1797: ixor
    //   1798: ixor
    //   1799: lookupswitch default -> 1824, -1654793347 -> 1782, -777047946 -> 7314
    //   1824: aload #4
    //   1826: ldc_w '័㌇ឣ铍篇菱'
    //   1829: getstatic Perryc.1 : I
    //   1832: ifeq -> 1846
    //   1835: ldc2_w -1196406609
    //   1838: l2i
    //   1839: ldc_w 954573252
    //   1842: ixor
    //   1843: goto -> 1854
    //   1846: ldc2_w 1035794691
    //   1849: l2i
    //   1850: ldc_w -81143616
    //   1853: ixor
    //   1854: ldc2_w -1581175484
    //   1857: l2i
    //   1858: ldc_w 263460585
    //   1861: ixor
    //   1862: ixor
    //   1863: lookupswitch default -> 7136, 773903046 -> 1846, 1759517294 -> 1888
    //   1888: goto -> 1892
    //   1891: athrow
    //   1892: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1895: goto -> 1899
    //   1898: athrow
    //   1899: getstatic Perryc.c : I
    //   1902: iflt -> 1916
    //   1905: ldc2_w -1216719521
    //   1908: l2i
    //   1909: ldc_w 1966216113
    //   1912: ixor
    //   1913: goto -> 1924
    //   1916: ldc2_w 502383868
    //   1919: l2i
    //   1920: ldc_w 357118297
    //   1923: ixor
    //   1924: ldc2_w -867778843
    //   1927: l2i
    //   1928: ldc_w -1036343325
    //   1931: ixor
    //   1932: ixor
    //   1933: lookupswitch default -> 7242, -868982808 -> 1916, 113568931 -> 1960
    //   1960: goto -> 1964
    //   1963: athrow
    //   1964: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1967: goto -> 1971
    //   1970: athrow
    //   1971: ifeq -> 1985
    //   1974: ldc2_w 815393607
    //   1977: l2i
    //   1978: ldc_w 649877003
    //   1981: ixor
    //   1982: goto -> 1993
    //   1985: ldc2_w -1371038687
    //   1988: l2i
    //   1989: ldc_w -1201528470
    //   1992: ixor
    //   1993: ldc2_w 374207841
    //   1996: l2i
    //   1997: ldc_w 1739236078
    //   2000: ixor
    //   2001: ixor
    //   2002: tableswitch default -> 1974, 1740827331 -> 2024, 1740827332 -> 2758
    //   2024: ldc2_w 1841310885
    //   2027: l2i
    //   2028: ldc_w 1841310881
    //   2031: ixor
    //   2032: getstatic Perryc.c : I
    //   2035: iflt -> 2049
    //   2038: ldc2_w -1040948391
    //   2041: l2i
    //   2042: ldc_w 682891309
    //   2045: ixor
    //   2046: goto -> 2057
    //   2049: ldc2_w 1226722390
    //   2052: l2i
    //   2053: ldc_w -663387630
    //   2056: ixor
    //   2057: ldc2_w 1497577300
    //   2060: l2i
    //   2061: ldc_w -896855632
    //   2064: ixor
    //   2065: ixor
    //   2066: lookupswitch default -> 2092, -619691000 -> 2049, 2055757200 -> 7166
    //   2092: istore #5
    //   2094: goto -> 2758
    //   2097: getstatic Perryc.c : I
    //   2100: iflt -> 2114
    //   2103: ldc2_w -278974324
    //   2106: l2i
    //   2107: ldc_w -368405271
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w -135892949
    //   2117: l2i
    //   2118: ldc_w 955319160
    //   2121: ixor
    //   2122: ldc2_w 1939668255
    //   2125: l2i
    //   2126: ldc_w 767141168
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 7260, -1858983044 -> 2156, 1534131274 -> 2114
    //   2156: aload #4
    //   2158: ldc_w 'េ㌚ឿ铀'
    //   2161: getstatic Perryc.c : I
    //   2164: iflt -> 2178
    //   2167: ldc2_w 1267390533
    //   2170: l2i
    //   2171: ldc_w 374758989
    //   2174: ixor
    //   2175: goto -> 2186
    //   2178: ldc2_w 1819655252
    //   2181: l2i
    //   2182: ldc_w -1188406561
    //   2185: ixor
    //   2186: ldc2_w 1037423081
    //   2189: l2i
    //   2190: ldc_w 223763380
    //   2193: ixor
    //   2194: ixor
    //   2195: lookupswitch default -> 7214, -438539050 -> 2220, 1834945621 -> 2178
    //   2220: goto -> 2224
    //   2223: athrow
    //   2224: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2227: goto -> 2231
    //   2230: athrow
    //   2231: getstatic Perryc.0 : I
    //   2234: ifle -> 2248
    //   2237: ldc2_w 986357218
    //   2240: l2i
    //   2241: ldc_w -1945741490
    //   2244: ixor
    //   2245: goto -> 2256
    //   2248: ldc2_w 1546921495
    //   2251: l2i
    //   2252: ldc_w -189813951
    //   2255: ixor
    //   2256: ldc2_w -110112433
    //   2259: l2i
    //   2260: ldc_w -197777042
    //   2263: ixor
    //   2264: ixor
    //   2265: lookupswitch default -> 7160, -1513982601 -> 2292, -1147850099 -> 2248
    //   2292: goto -> 2296
    //   2295: athrow
    //   2296: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2299: goto -> 2303
    //   2302: athrow
    //   2303: ifeq -> 2317
    //   2306: ldc2_w -1615738999
    //   2309: l2i
    //   2310: ldc_w 1915487160
    //   2313: ixor
    //   2314: goto -> 2325
    //   2317: ldc2_w 964467411
    //   2320: l2i
    //   2321: ldc_w -723427613
    //   2324: ixor
    //   2325: ldc2_w 1347821186
    //   2328: l2i
    //   2329: ldc_w 2027176663
    //   2332: ixor
    //   2333: ixor
    //   2334: tableswitch default -> 2306, -987785116 -> 2356, -987785115 -> 2758
    //   2356: ldc2_w 1608379608
    //   2359: l2i
    //   2360: ldc_w 1608379613
    //   2363: ixor
    //   2364: getstatic Perryc.c : I
    //   2367: iflt -> 2381
    //   2370: ldc2_w -654006707
    //   2373: l2i
    //   2374: ldc_w 1656587343
    //   2377: ixor
    //   2378: goto -> 2389
    //   2381: ldc2_w -920781331
    //   2384: l2i
    //   2385: ldc_w 1362212142
    //   2388: ixor
    //   2389: ldc2_w 1576672334
    //   2392: l2i
    //   2393: ldc_w -1313265611
    //   2396: ixor
    //   2397: ixor
    //   2398: lookupswitch default -> 2424, 744935316 -> 2381, 1476007545 -> 7278
    //   2424: istore #5
    //   2426: goto -> 2758
    //   2429: getstatic Perryc.1 : I
    //   2432: ifeq -> 2446
    //   2435: ldc2_w -861821257
    //   2438: l2i
    //   2439: ldc_w -414467249
    //   2442: ixor
    //   2443: goto -> 2454
    //   2446: ldc2_w -1416866062
    //   2449: l2i
    //   2450: ldc_w -1678370988
    //   2453: ixor
    //   2454: ldc2_w 905301971
    //   2457: l2i
    //   2458: ldc_w -55879504
    //   2461: ixor
    //   2462: ixor
    //   2463: lookupswitch default -> 2488, -1195352102 -> 2446, -491484517 -> 7224
    //   2488: aload #4
    //   2490: ldc_w 'ំ㌝ឤ铉'
    //   2493: getstatic Perryc.c : I
    //   2496: iflt -> 2510
    //   2499: ldc2_w 149896502
    //   2502: l2i
    //   2503: ldc_w 18143948
    //   2506: ixor
    //   2507: goto -> 2518
    //   2510: ldc2_w 1262363186
    //   2513: l2i
    //   2514: ldc_w -1478672609
    //   2517: ixor
    //   2518: ldc2_w 1385074630
    //   2521: l2i
    //   2522: ldc_w -365991234
    //   2525: ixor
    //   2526: ixor
    //   2527: lookupswitch default -> 2552, -1319501182 -> 7206, 281045648 -> 2510
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: getstatic Perryc.1 : I
    //   2566: ifeq -> 2580
    //   2569: ldc2_w 702985460
    //   2572: l2i
    //   2573: ldc_w 689947568
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w 1342853304
    //   2583: l2i
    //   2584: ldc_w -534086169
    //   2587: ixor
    //   2588: ldc2_w -1567496975
    //   2591: l2i
    //   2592: ldc_w -1669593148
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 7308, -1899114902 -> 2624, 1041536113 -> 2580
    //   2624: goto -> 2628
    //   2627: athrow
    //   2628: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2631: goto -> 2635
    //   2634: athrow
    //   2635: ifeq -> 2649
    //   2638: ldc2_w -1923809113
    //   2641: l2i
    //   2642: ldc_w 2049606511
    //   2645: ixor
    //   2646: goto -> 2657
    //   2649: ldc2_w -440314657
    //   2652: l2i
    //   2653: ldc_w 314496790
    //   2656: ixor
    //   2657: ldc2_w 1552532041
    //   2660: l2i
    //   2661: ldc_w 404983477
    //   2664: ixor
    //   2665: ixor
    //   2666: tableswitch default -> 2638, -1277833420 -> 2688, -1277833419 -> 2758
    //   2688: ldc2_w -1151503340
    //   2691: l2i
    //   2692: ldc_w -1151503342
    //   2695: ixor
    //   2696: getstatic Perryc.c : I
    //   2699: iflt -> 2713
    //   2702: ldc2_w 1272309516
    //   2705: l2i
    //   2706: ldc_w -1838144851
    //   2709: ixor
    //   2710: goto -> 2721
    //   2713: ldc2_w 388305511
    //   2716: l2i
    //   2717: ldc_w 448729378
    //   2720: ixor
    //   2721: ldc2_w 1480546694
    //   2724: l2i
    //   2725: ldc_w -426410886
    //   2728: ixor
    //   2729: ixor
    //   2730: lookupswitch default -> 7150, -1288689991 -> 2756, 1729093725 -> 2713
    //   2756: istore #5
    //   2758: getstatic Perryc.0 : I
    //   2761: ifle -> 2775
    //   2764: ldc2_w 359231053
    //   2767: l2i
    //   2768: ldc_w 771235545
    //   2771: ixor
    //   2772: goto -> 2783
    //   2775: ldc2_w -1719000892
    //   2778: l2i
    //   2779: ldc_w -2019383577
    //   2782: ixor
    //   2783: ldc2_w -1972323425
    //   2786: l2i
    //   2787: ldc_w -1780332219
    //   2790: ixor
    //   2791: ixor
    //   2792: lookupswitch default -> 2820, 307140301 -> 2775, 654541390 -> 7210
    //   2820: iload #5
    //   2822: tableswitch default -> 6135, 0 -> 2864, 1 -> 3200, 2 -> 3536, 3 -> 3872, 4 -> 4208, 5 -> 4672, 6 -> 5012
    //   2864: getstatic Perryc.c : I
    //   2867: iflt -> 2881
    //   2870: ldc2_w -182547586
    //   2873: l2i
    //   2874: ldc_w 1079627307
    //   2877: ixor
    //   2878: goto -> 2889
    //   2881: ldc2_w -1709728441
    //   2884: l2i
    //   2885: ldc_w 324879266
    //   2888: ixor
    //   2889: ldc2_w -573722461
    //   2892: l2i
    //   2893: ldc_w -438266549
    //   2896: ixor
    //   2897: ixor
    //   2898: lookupswitch default -> 2924, -1922408259 -> 7274, 181881261 -> 2881
    //   2924: aload_1
    //   2925: getstatic Perryc.c : I
    //   2928: iflt -> 2942
    //   2931: ldc2_w -2024260526
    //   2934: l2i
    //   2935: ldc_w -1193214857
    //   2938: ixor
    //   2939: goto -> 2950
    //   2942: ldc2_w 447942842
    //   2945: l2i
    //   2946: ldc_w -1308620123
    //   2949: ixor
    //   2950: ldc2_w 1349913817
    //   2953: l2i
    //   2954: ldc_w -726790078
    //   2957: ixor
    //   2958: ixor
    //   2959: lookupswitch default -> 7264, -1151279938 -> 2942, 745211524 -> 2984
    //   2984: aload_2
    //   2985: getstatic Perryc.0 : I
    //   2988: ifle -> 3002
    //   2991: ldc2_w 1473259219
    //   2994: l2i
    //   2995: ldc_w 2031771142
    //   2998: ixor
    //   2999: goto -> 3010
    //   3002: ldc2_w -393903865
    //   3005: l2i
    //   3006: ldc_w 2134617728
    //   3009: ixor
    //   3010: ldc2_w -1358354682
    //   3013: l2i
    //   3014: ldc_w -1598043059
    //   3017: ixor
    //   3018: ixor
    //   3019: lookupswitch default -> 7280, -1744255796 -> 3044, 561812382 -> 3002
    //   3044: goto -> 3048
    //   3047: athrow
    //   3048: invokevirtual getAsBoolean : ()Z
    //   3051: goto -> 3055
    //   3054: athrow
    //   3055: getstatic Perryc.1 : I
    //   3058: ifeq -> 3072
    //   3061: ldc2_w 1280510437
    //   3064: l2i
    //   3065: ldc_w -785636906
    //   3068: ixor
    //   3069: goto -> 3080
    //   3072: ldc2_w 851149931
    //   3075: l2i
    //   3076: ldc_w 1769687908
    //   3079: ixor
    //   3080: ldc2_w 544908480
    //   3083: l2i
    //   3084: ldc_w -1697187221
    //   3087: ixor
    //   3088: ixor
    //   3089: lookupswitch default -> 3116, -1607589515 -> 3072, 668169880 -> 7156
    //   3116: goto -> 3120
    //   3119: athrow
    //   3120: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3123: goto -> 3127
    //   3126: athrow
    //   3127: getstatic Perryc.1 : I
    //   3130: ifeq -> 3144
    //   3133: ldc2_w -260353319
    //   3136: l2i
    //   3137: ldc_w -1437193324
    //   3140: ixor
    //   3141: goto -> 3152
    //   3144: ldc2_w 1956304170
    //   3147: l2i
    //   3148: ldc_w -97632831
    //   3151: ixor
    //   3152: ldc2_w 1559889171
    //   3155: l2i
    //   3156: ldc_w -692889363
    //   3159: ixor
    //   3160: ixor
    //   3161: lookupswitch default -> 7220, -798743373 -> 3144, 83735829 -> 3188
    //   3188: goto -> 3192
    //   3191: athrow
    //   3192: invokevirtual setValue : (Ljava/lang/Object;)V
    //   3195: goto -> 3199
    //   3198: athrow
    //   3199: return
    //   3200: getstatic Perryc.c : I
    //   3203: iflt -> 3217
    //   3206: ldc2_w 2008815188
    //   3209: l2i
    //   3210: ldc_w 1734136238
    //   3213: ixor
    //   3214: goto -> 3225
    //   3217: ldc2_w 720235921
    //   3220: l2i
    //   3221: ldc_w 1705540398
    //   3224: ixor
    //   3225: ldc2_w -130918810
    //   3228: l2i
    //   3229: ldc_w -1721738736
    //   3232: ixor
    //   3233: ixor
    //   3234: lookupswitch default -> 3260, 798444479 -> 3217, 1907542924 -> 7244
    //   3260: aload_1
    //   3261: getstatic Perryc.c : I
    //   3264: iflt -> 3278
    //   3267: ldc2_w -1213993874
    //   3270: l2i
    //   3271: ldc_w 284820464
    //   3274: ixor
    //   3275: goto -> 3286
    //   3278: ldc2_w 910536871
    //   3281: l2i
    //   3282: ldc_w -1302958853
    //   3285: ixor
    //   3286: ldc2_w 742775422
    //   3289: l2i
    //   3290: ldc_w -769401893
    //   3293: ixor
    //   3294: ixor
    //   3295: lookupswitch default -> 3320, 136676073 -> 3278, 1497361979 -> 7270
    //   3320: aload_2
    //   3321: getstatic Perryc.0 : I
    //   3324: ifle -> 3338
    //   3327: ldc2_w 2106545066
    //   3330: l2i
    //   3331: ldc_w -1302216010
    //   3334: ixor
    //   3335: goto -> 3346
    //   3338: ldc2_w 1895769769
    //   3341: l2i
    //   3342: ldc_w 2017147364
    //   3345: ixor
    //   3346: ldc2_w 95793549
    //   3349: l2i
    //   3350: ldc_w 1129661244
    //   3353: ixor
    //   3354: ixor
    //   3355: lookupswitch default -> 3380, -1995545683 -> 7218, 188518458 -> 3338
    //   3380: goto -> 3384
    //   3383: athrow
    //   3384: invokevirtual getAsDouble : ()D
    //   3387: goto -> 3391
    //   3390: athrow
    //   3391: getstatic Perryc.c : I
    //   3394: iflt -> 3408
    //   3397: ldc2_w -1396716336
    //   3400: l2i
    //   3401: ldc_w 1356425303
    //   3404: ixor
    //   3405: goto -> 3416
    //   3408: ldc2_w -1892428686
    //   3411: l2i
    //   3412: ldc_w 689286758
    //   3415: ixor
    //   3416: ldc2_w 670930791
    //   3419: l2i
    //   3420: ldc_w -1038950624
    //   3423: ixor
    //   3424: ixor
    //   3425: lookupswitch default -> 3452, 428469440 -> 7248, 543110066 -> 3408
    //   3452: goto -> 3456
    //   3455: athrow
    //   3456: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3459: goto -> 3463
    //   3462: athrow
    //   3463: getstatic Perryc.0 : I
    //   3466: ifle -> 3480
    //   3469: ldc2_w -1216579179
    //   3472: l2i
    //   3473: ldc_w -2096371168
    //   3476: ixor
    //   3477: goto -> 3488
    //   3480: ldc2_w -153960884
    //   3483: l2i
    //   3484: ldc_w -1398158529
    //   3487: ixor
    //   3488: ldc2_w -597619521
    //   3491: l2i
    //   3492: ldc_w 371925044
    //   3495: ixor
    //   3496: ixor
    //   3497: lookupswitch default -> 7272, -1875813896 -> 3524, -29507778 -> 3480
    //   3524: goto -> 3528
    //   3527: athrow
    //   3528: invokevirtual setValue : (Ljava/lang/Object;)V
    //   3531: goto -> 3535
    //   3534: athrow
    //   3535: return
    //   3536: getstatic Perryc.0 : I
    //   3539: ifle -> 3553
    //   3542: ldc2_w -1180675366
    //   3545: l2i
    //   3546: ldc_w 412577433
    //   3549: ixor
    //   3550: goto -> 3561
    //   3553: ldc2_w 680413553
    //   3556: l2i
    //   3557: ldc_w 1374012897
    //   3560: ixor
    //   3561: ldc2_w -1612292754
    //   3564: l2i
    //   3565: ldc_w -194412937
    //   3568: ixor
    //   3569: ixor
    //   3570: lookupswitch default -> 3596, -893903014 -> 7152, -515281710 -> 3553
    //   3596: aload_1
    //   3597: getstatic Perryc.c : I
    //   3600: iflt -> 3614
    //   3603: ldc2_w 1813452171
    //   3606: l2i
    //   3607: ldc_w 64140179
    //   3610: ixor
    //   3611: goto -> 3622
    //   3614: ldc2_w 1471337694
    //   3617: l2i
    //   3618: ldc_w 1821398786
    //   3621: ixor
    //   3622: ldc2_w 1155559350
    //   3625: l2i
    //   3626: ldc_w -350908250
    //   3629: ixor
    //   3630: ixor
    //   3631: lookupswitch default -> 3656, -1070573304 -> 7236, 1189781966 -> 3614
    //   3656: aload_2
    //   3657: getstatic Perryc.0 : I
    //   3660: ifle -> 3674
    //   3663: ldc2_w 296371003
    //   3666: l2i
    //   3667: ldc_w 1498396789
    //   3670: ixor
    //   3671: goto -> 3682
    //   3674: ldc2_w 1883444276
    //   3677: l2i
    //   3678: ldc_w 590599711
    //   3681: ixor
    //   3682: ldc2_w 9302400
    //   3685: l2i
    //   3686: ldc_w -466264820
    //   3689: ixor
    //   3690: ixor
    //   3691: lookupswitch default -> 3716, -1403168830 -> 7202, 206263826 -> 3674
    //   3716: goto -> 3720
    //   3719: athrow
    //   3720: invokevirtual getAsFloat : ()F
    //   3723: goto -> 3727
    //   3726: athrow
    //   3727: getstatic Perryc.1 : I
    //   3730: ifeq -> 3744
    //   3733: ldc2_w 1512709525
    //   3736: l2i
    //   3737: ldc_w 330087427
    //   3740: ixor
    //   3741: goto -> 3752
    //   3744: ldc2_w -1511388535
    //   3747: l2i
    //   3748: ldc_w 912594806
    //   3751: ixor
    //   3752: ldc2_w 168150647
    //   3755: l2i
    //   3756: ldc_w -2015309893
    //   3759: ixor
    //   3760: ixor
    //   3761: lookupswitch default -> 3788, -1000101798 -> 7296, 1936015854 -> 3744
    //   3788: goto -> 3792
    //   3791: athrow
    //   3792: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3795: goto -> 3799
    //   3798: athrow
    //   3799: getstatic Perryc.0 : I
    //   3802: ifle -> 3816
    //   3805: ldc2_w 403433465
    //   3808: l2i
    //   3809: ldc_w 1071612978
    //   3812: ixor
    //   3813: goto -> 3824
    //   3816: ldc2_w -901082760
    //   3819: l2i
    //   3820: ldc_w -1065795737
    //   3823: ixor
    //   3824: ldc2_w 591971903
    //   3827: l2i
    //   3828: ldc_w -734836453
    //   3831: ixor
    //   3832: ixor
    //   3833: lookupswitch default -> 3860, -793776913 -> 7286, 1493997537 -> 3816
    //   3860: goto -> 3864
    //   3863: athrow
    //   3864: invokevirtual setValue : (Ljava/lang/Object;)V
    //   3867: goto -> 3871
    //   3870: athrow
    //   3871: return
    //   3872: getstatic Perryc.1 : I
    //   3875: ifeq -> 3889
    //   3878: ldc2_w -1842789933
    //   3881: l2i
    //   3882: ldc_w -1645217614
    //   3885: ixor
    //   3886: goto -> 3897
    //   3889: ldc2_w 1603151636
    //   3892: l2i
    //   3893: ldc_w 1802331172
    //   3896: ixor
    //   3897: ldc2_w 118346609
    //   3900: l2i
    //   3901: ldc_w -596183185
    //   3904: ixor
    //   3905: ixor
    //   3906: lookupswitch default -> 3932, -1228352889 -> 3889, -725770881 -> 7304
    //   3932: aload_1
    //   3933: getstatic Perryc.0 : I
    //   3936: ifle -> 3950
    //   3939: ldc2_w 1413079867
    //   3942: l2i
    //   3943: ldc_w 1717844113
    //   3946: ixor
    //   3947: goto -> 3958
    //   3950: ldc2_w 1934583505
    //   3953: l2i
    //   3954: ldc_w 1274588329
    //   3957: ixor
    //   3958: ldc2_w 1678828819
    //   3961: l2i
    //   3962: ldc_w 1541424924
    //   3965: ixor
    //   3966: ixor
    //   3967: lookupswitch default -> 7266, 122120311 -> 3992, 229472677 -> 3950
    //   3992: aload_2
    //   3993: getstatic Perryc.1 : I
    //   3996: ifeq -> 4010
    //   3999: ldc2_w 510584161
    //   4002: l2i
    //   4003: ldc_w -153684385
    //   4006: ixor
    //   4007: goto -> 4018
    //   4010: ldc2_w 633329952
    //   4013: l2i
    //   4014: ldc_w -556268468
    //   4017: ixor
    //   4018: ldc2_w 1393718451
    //   4021: l2i
    //   4022: ldc_w 470531665
    //   4025: ixor
    //   4026: ixor
    //   4027: lookupswitch default -> 7186, -1482565156 -> 4010, -1266804850 -> 4052
    //   4052: goto -> 4056
    //   4055: athrow
    //   4056: invokevirtual getAsInt : ()I
    //   4059: goto -> 4063
    //   4062: athrow
    //   4063: getstatic Perryc.c : I
    //   4066: iflt -> 4080
    //   4069: ldc2_w -845958609
    //   4072: l2i
    //   4073: ldc_w -1092534966
    //   4076: ixor
    //   4077: goto -> 4088
    //   4080: ldc2_w -255661231
    //   4083: l2i
    //   4084: ldc_w -2069818790
    //   4087: ixor
    //   4088: ldc2_w -1058109927
    //   4091: l2i
    //   4092: ldc_w -487639405
    //   4095: ixor
    //   4096: ixor
    //   4097: lookupswitch default -> 7310, 1366507503 -> 4080, 1449281921 -> 4124
    //   4124: goto -> 4128
    //   4127: athrow
    //   4128: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4131: goto -> 4135
    //   4134: athrow
    //   4135: getstatic Perryc.c : I
    //   4138: iflt -> 4152
    //   4141: ldc2_w 1609893434
    //   4144: l2i
    //   4145: ldc_w -1773306196
    //   4148: ixor
    //   4149: goto -> 4160
    //   4152: ldc2_w 529571617
    //   4155: l2i
    //   4156: ldc_w -608790230
    //   4159: ixor
    //   4160: ldc2_w 1149142381
    //   4163: l2i
    //   4164: ldc_w 1086056523
    //   4167: ixor
    //   4168: ixor
    //   4169: lookupswitch default -> 4196, -847440464 -> 7162, 551775791 -> 4152
    //   4196: goto -> 4200
    //   4199: athrow
    //   4200: invokevirtual setValue : (Ljava/lang/Object;)V
    //   4203: goto -> 4207
    //   4206: athrow
    //   4207: return
    //   4208: getstatic Perryc.0 : I
    //   4211: ifle -> 4225
    //   4214: ldc2_w 662416597
    //   4217: l2i
    //   4218: ldc_w -919120336
    //   4221: ixor
    //   4222: goto -> 4233
    //   4225: ldc2_w -1190598553
    //   4228: l2i
    //   4229: ldc_w -1210023636
    //   4232: ixor
    //   4233: ldc2_w -1949336100
    //   4236: l2i
    //   4237: ldc_w 1984056267
    //   4240: ixor
    //   4241: ixor
    //   4242: lookupswitch default -> 4268, -462015280 -> 4225, 331468018 -> 7178
    //   4268: aload_2
    //   4269: getstatic Perryc.c : I
    //   4272: iflt -> 4286
    //   4275: ldc2_w -1148926286
    //   4278: l2i
    //   4279: ldc_w -2069882074
    //   4282: ixor
    //   4283: goto -> 4294
    //   4286: ldc2_w 921712827
    //   4289: l2i
    //   4290: ldc_w -1172323623
    //   4293: ixor
    //   4294: ldc2_w -896822012
    //   4297: l2i
    //   4298: ldc_w -1977083227
    //   4301: ixor
    //   4302: ixor
    //   4303: lookupswitch default -> 7148, -867404349 -> 4328, 2139574837 -> 4286
    //   4328: goto -> 4332
    //   4331: athrow
    //   4332: invokevirtual getAsString : ()Ljava/lang/String;
    //   4335: goto -> 4339
    //   4338: athrow
    //   4339: getstatic Perryc.1 : I
    //   4342: ifeq -> 4356
    //   4345: ldc2_w 945874575
    //   4348: l2i
    //   4349: ldc_w 1387540194
    //   4352: ixor
    //   4353: goto -> 4364
    //   4356: ldc2_w -731127478
    //   4359: l2i
    //   4360: ldc_w -1820732525
    //   4363: ixor
    //   4364: ldc2_w 1856200802
    //   4367: l2i
    //   4368: ldc_w 1465108002
    //   4371: ixor
    //   4372: ixor
    //   4373: lookupswitch default -> 4400, 1296862777 -> 4356, 1394896429 -> 7288
    //   4400: astore_3
    //   4401: getstatic Perryc.0 : I
    //   4404: ifle -> 4418
    //   4407: ldc2_w -817043639
    //   4410: l2i
    //   4411: ldc_w -646411366
    //   4414: ixor
    //   4415: goto -> 4426
    //   4418: ldc2_w -547125731
    //   4421: l2i
    //   4422: ldc_w -910581772
    //   4425: ixor
    //   4426: ldc2_w 765984038
    //   4429: l2i
    //   4430: ldc_w -35907076
    //   4433: ixor
    //   4434: ixor
    //   4435: lookupswitch default -> 7238, -967866359 -> 4418, -962462413 -> 4460
    //   4460: aload_1
    //   4461: getstatic Perryc.c : I
    //   4464: iflt -> 4478
    //   4467: ldc2_w 1099709370
    //   4470: l2i
    //   4471: ldc_w -743601771
    //   4474: ixor
    //   4475: goto -> 4486
    //   4478: ldc2_w -1939068087
    //   4481: l2i
    //   4482: ldc_w -1973258473
    //   4485: ixor
    //   4486: ldc2_w -1444401364
    //   4489: l2i
    //   4490: ldc_w 2111718207
    //   4493: ixor
    //   4494: ixor
    //   4495: lookupswitch default -> 7204, -768069555 -> 4520, 1175969340 -> 4478
    //   4520: aload_3
    //   4521: ldc_w '_'
    //   4524: ldc_w ' '
    //   4527: getstatic Perryc.0 : I
    //   4530: ifle -> 4544
    //   4533: ldc2_w 1258001116
    //   4536: l2i
    //   4537: ldc_w -1002588767
    //   4540: ixor
    //   4541: goto -> 4552
    //   4544: ldc2_w 649516549
    //   4547: l2i
    //   4548: ldc_w 1555387077
    //   4551: ixor
    //   4552: ldc2_w 1805269195
    //   4555: l2i
    //   4556: ldc_w 360435855
    //   4559: ixor
    //   4560: ixor
    //   4561: lookupswitch default -> 4588, -942411577 -> 4544, -265826503 -> 7232
    //   4588: goto -> 4592
    //   4591: athrow
    //   4592: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   4595: goto -> 4599
    //   4598: athrow
    //   4599: getstatic Perryc.c : I
    //   4602: iflt -> 4616
    //   4605: ldc2_w 1255842658
    //   4608: l2i
    //   4609: ldc_w 1759218936
    //   4612: ixor
    //   4613: goto -> 4624
    //   4616: ldc2_w -1709082440
    //   4619: l2i
    //   4620: ldc_w -20063177
    //   4623: ixor
    //   4624: ldc2_w -145901691
    //   4627: l2i
    //   4628: ldc_w 1104513582
    //   4631: ixor
    //   4632: ixor
    //   4633: lookupswitch default -> 4660, -1801907663 -> 7276, -895006791 -> 4616
    //   4660: goto -> 4664
    //   4663: athrow
    //   4664: invokevirtual setValue : (Ljava/lang/Object;)V
    //   4667: goto -> 4671
    //   4670: athrow
    //   4671: return
    //   4672: getstatic Perryc.1 : I
    //   4675: ifeq -> 4689
    //   4678: ldc2_w 840470006
    //   4681: l2i
    //   4682: ldc_w -1590963240
    //   4685: ixor
    //   4686: goto -> 4697
    //   4689: ldc2_w -1757224795
    //   4692: l2i
    //   4693: ldc_w -1934700149
    //   4696: ixor
    //   4697: ldc2_w 1644530059
    //   4700: l2i
    //   4701: ldc_w 1093071070
    //   4704: ixor
    //   4705: ixor
    //   4706: lookupswitch default -> 7226, -1341118597 -> 4689, 953108603 -> 4732
    //   4732: aload_1
    //   4733: new bigname/zprestige/webhack/features/setting/Bind$BindConverter
    //   4736: dup
    //   4737: getstatic Perryc.0 : I
    //   4740: ifle -> 4754
    //   4743: ldc2_w 1887551638
    //   4746: l2i
    //   4747: ldc_w -691265726
    //   4750: ixor
    //   4751: goto -> 4762
    //   4754: ldc2_w 1392987623
    //   4757: l2i
    //   4758: ldc_w -1881477582
    //   4761: ixor
    //   4762: ldc2_w -958040232
    //   4765: l2i
    //   4766: ldc_w -739084801
    //   4769: ixor
    //   4770: ixor
    //   4771: lookupswitch default -> 4796, -1285890701 -> 7302, 26676700 -> 4754
    //   4796: goto -> 4800
    //   4799: athrow
    //   4800: invokespecial <init> : ()V
    //   4803: goto -> 4807
    //   4806: athrow
    //   4807: getstatic Perryc.0 : I
    //   4810: ifle -> 4824
    //   4813: ldc2_w -2055754186
    //   4816: l2i
    //   4817: ldc_w -1930509433
    //   4820: ixor
    //   4821: goto -> 4832
    //   4824: ldc2_w -153437394
    //   4827: l2i
    //   4828: ldc_w 1128871696
    //   4831: ixor
    //   4832: ldc2_w -257844517
    //   4835: l2i
    //   4836: ldc_w -20861099
    //   4839: ixor
    //   4840: ixor
    //   4841: lookupswitch default -> 7316, -1141655120 -> 4868, 133781567 -> 4824
    //   4868: aload_2
    //   4869: getstatic Perryc.0 : I
    //   4872: ifle -> 4886
    //   4875: ldc2_w -1155007379
    //   4878: l2i
    //   4879: ldc_w 768472328
    //   4882: ixor
    //   4883: goto -> 4894
    //   4886: ldc2_w -724684522
    //   4889: l2i
    //   4890: ldc_w -1259105019
    //   4893: ixor
    //   4894: ldc2_w -1742807840
    //   4897: l2i
    //   4898: ldc_w -2143137011
    //   4901: ixor
    //   4902: ixor
    //   4903: lookupswitch default -> 4928, -1900640632 -> 7294, 902528755 -> 4886
    //   4928: goto -> 4932
    //   4931: athrow
    //   4932: invokevirtual doBackward : (Lcom/google/gson/JsonElement;)Lbigname/zprestige/webhack/features/setting/Bind;
    //   4935: goto -> 4939
    //   4938: athrow
    //   4939: getstatic Perryc.1 : I
    //   4942: ifeq -> 4956
    //   4945: ldc2_w -1030718834
    //   4948: l2i
    //   4949: ldc_w -846749543
    //   4952: ixor
    //   4953: goto -> 4964
    //   4956: ldc2_w 273134480
    //   4959: l2i
    //   4960: ldc_w 636584820
    //   4963: ixor
    //   4964: ldc2_w 1938346483
    //   4967: l2i
    //   4968: ldc_w 1781751160
    //   4971: ixor
    //   4972: ixor
    //   4973: lookupswitch default -> 7208, 380393116 -> 4956, 739097711 -> 5000
    //   5000: goto -> 5004
    //   5003: athrow
    //   5004: invokevirtual setValue : (Ljava/lang/Object;)V
    //   5007: goto -> 5011
    //   5010: athrow
    //   5011: return
    //   5012: new bigname/zprestige/webhack/features/setting/EnumConverter
    //   5015: dup
    //   5016: getstatic Perryc.1 : I
    //   5019: ifeq -> 5033
    //   5022: ldc2_w -2090443605
    //   5025: l2i
    //   5026: ldc_w 1280736521
    //   5029: ixor
    //   5030: goto -> 5041
    //   5033: ldc2_w -1190449929
    //   5036: l2i
    //   5037: ldc_w 1842872892
    //   5040: ixor
    //   5041: ldc2_w 991748231
    //   5044: l2i
    //   5045: ldc_w -1623633869
    //   5048: ixor
    //   5049: ixor
    //   5050: lookupswitch default -> 7312, 1796575510 -> 5033, 1895210623 -> 5076
    //   5076: aload_1
    //   5077: getstatic Perryc.0 : I
    //   5080: ifle -> 5094
    //   5083: ldc2_w 1995075510
    //   5086: l2i
    //   5087: ldc_w -217295869
    //   5090: ixor
    //   5091: goto -> 5102
    //   5094: ldc2_w -1623772308
    //   5097: l2i
    //   5098: ldc_w 1754708714
    //   5101: ixor
    //   5102: ldc2_w 1548893548
    //   5105: l2i
    //   5106: ldc_w -2093343565
    //   5109: ixor
    //   5110: ixor
    //   5111: lookupswitch default -> 7154, 684304473 -> 5136, 1519262314 -> 5094
    //   5136: goto -> 5140
    //   5139: athrow
    //   5140: invokevirtual getValue : ()Ljava/lang/Object;
    //   5143: goto -> 5147
    //   5146: athrow
    //   5147: checkcast java/lang/Enum
    //   5150: getstatic Perryc.0 : I
    //   5153: ifle -> 5167
    //   5156: ldc2_w -350488502
    //   5159: l2i
    //   5160: ldc_w 1392485942
    //   5163: ixor
    //   5164: goto -> 5175
    //   5167: ldc2_w 1866053110
    //   5170: l2i
    //   5171: ldc_w -1701011138
    //   5174: ixor
    //   5175: ldc2_w -380646006
    //   5178: l2i
    //   5179: ldc_w -1847349668
    //   5182: ixor
    //   5183: ixor
    //   5184: lookupswitch default -> 5212, -1942635769 -> 5167, -1052230230 -> 7190
    //   5212: goto -> 5216
    //   5215: athrow
    //   5216: invokevirtual getClass : ()Ljava/lang/Class;
    //   5219: goto -> 5223
    //   5222: athrow
    //   5223: getstatic Perryc.1 : I
    //   5226: ifeq -> 5240
    //   5229: ldc2_w -556710842
    //   5232: l2i
    //   5233: ldc_w -1505749706
    //   5236: ixor
    //   5237: goto -> 5248
    //   5240: ldc2_w 629350446
    //   5243: l2i
    //   5244: ldc_w 521143292
    //   5247: ixor
    //   5248: ldc2_w 1954447244
    //   5251: l2i
    //   5252: ldc_w -1534967315
    //   5255: ixor
    //   5256: ixor
    //   5257: lookupswitch default -> 5284, -1469223151 -> 7250, -429080376 -> 5240
    //   5284: goto -> 5288
    //   5287: athrow
    //   5288: invokespecial <init> : (Ljava/lang/Class;)V
    //   5291: goto -> 5295
    //   5294: athrow
    //   5295: getstatic Perryc.1 : I
    //   5298: ifeq -> 5312
    //   5301: ldc2_w -2117671353
    //   5304: l2i
    //   5305: ldc_w -179567776
    //   5308: ixor
    //   5309: goto -> 5320
    //   5312: ldc2_w 508697916
    //   5315: l2i
    //   5316: ldc_w 273112430
    //   5319: ixor
    //   5320: ldc2_w 620359816
    //   5323: l2i
    //   5324: ldc_w -8226554
    //   5327: ixor
    //   5328: ixor
    //   5329: lookupswitch default -> 5356, -1343132503 -> 7228, -263750381 -> 5312
    //   5356: astore #6
    //   5358: getstatic Perryc.0 : I
    //   5361: ifle -> 5375
    //   5364: ldc2_w 585813790
    //   5367: l2i
    //   5368: ldc_w -1249010532
    //   5371: ixor
    //   5372: goto -> 5383
    //   5375: ldc2_w -1719238689
    //   5378: l2i
    //   5379: ldc_w 439137302
    //   5382: ixor
    //   5383: ldc2_w 1413458971
    //   5386: l2i
    //   5387: ldc_w -430760771
    //   5390: ixor
    //   5391: ixor
    //   5392: lookupswitch default -> 5420, 621536036 -> 7158, 1271913699 -> 5375
    //   5420: aload #6
    //   5422: getstatic Perryc.c : I
    //   5425: iflt -> 5439
    //   5428: ldc2_w 1233566285
    //   5431: l2i
    //   5432: ldc_w -921193121
    //   5435: ixor
    //   5436: goto -> 5447
    //   5439: ldc2_w -829835245
    //   5442: l2i
    //   5443: ldc_w 797417464
    //   5446: ixor
    //   5447: ldc2_w 157302142
    //   5450: l2i
    //   5451: ldc_w 210664800
    //   5454: ixor
    //   5455: ixor
    //   5456: lookupswitch default -> 7282, -2055254260 -> 5439, -455055371 -> 5484
    //   5484: aload_2
    //   5485: getstatic Perryc.c : I
    //   5488: iflt -> 5502
    //   5491: ldc2_w 478994025
    //   5494: l2i
    //   5495: ldc_w -494761910
    //   5498: ixor
    //   5499: goto -> 5510
    //   5502: ldc2_w -927507336
    //   5505: l2i
    //   5506: ldc_w 915927453
    //   5509: ixor
    //   5510: ldc2_w 2031940214
    //   5513: l2i
    //   5514: ldc_w 622391069
    //   5517: ixor
    //   5518: ixor
    //   5519: lookupswitch default -> 5544, -1576383672 -> 7126, 979156890 -> 5502
    //   5544: goto -> 5548
    //   5547: athrow
    //   5548: invokevirtual doBackward : (Lcom/google/gson/JsonElement;)Ljava/lang/Enum;
    //   5551: goto -> 5555
    //   5554: athrow
    //   5555: getstatic Perryc.c : I
    //   5558: iflt -> 5572
    //   5561: ldc2_w 4950917
    //   5564: l2i
    //   5565: ldc_w -1943450352
    //   5568: ixor
    //   5569: goto -> 5580
    //   5572: ldc2_w -2127891133
    //   5575: l2i
    //   5576: ldc_w -723884324
    //   5579: ixor
    //   5580: ldc2_w -1000257259
    //   5583: l2i
    //   5584: ldc_w 538295378
    //   5587: ixor
    //   5588: ixor
    //   5589: lookupswitch default -> 7258, -1316722984 -> 5616, 1746285522 -> 5572
    //   5616: astore #7
    //   5618: getstatic Perryc.c : I
    //   5621: iflt -> 5635
    //   5624: ldc2_w 2133843504
    //   5627: l2i
    //   5628: ldc_w 1405987218
    //   5631: ixor
    //   5632: goto -> 5643
    //   5635: ldc2_w 599814163
    //   5638: l2i
    //   5639: ldc_w -1945803909
    //   5642: ixor
    //   5643: ldc2_w 1774196926
    //   5646: l2i
    //   5647: ldc_w -436593402
    //   5650: ixor
    //   5651: ixor
    //   5652: lookupswitch default -> 7168, -1596427750 -> 5635, 603920080 -> 5680
    //   5680: aload_1
    //   5681: getstatic Perryc.0 : I
    //   5684: ifle -> 5698
    //   5687: ldc2_w 1974674987
    //   5690: l2i
    //   5691: ldc_w 1369306298
    //   5694: ixor
    //   5695: goto -> 5706
    //   5698: ldc2_w -1366839892
    //   5701: l2i
    //   5702: ldc_w -456276474
    //   5705: ixor
    //   5706: ldc2_w 1064022125
    //   5709: l2i
    //   5710: ldc_w 1730649264
    //   5713: ixor
    //   5714: ixor
    //   5715: lookupswitch default -> 5740, 20353674 -> 5698, 2086862412 -> 7174
    //   5740: aload #7
    //   5742: ifnonnull -> 5756
    //   5745: ldc2_w -1666497262
    //   5748: l2i
    //   5749: ldc_w 251142624
    //   5752: ixor
    //   5753: goto -> 5764
    //   5756: ldc2_w -173686097
    //   5759: l2i
    //   5760: ldc_w 1744217634
    //   5763: ixor
    //   5764: ldc2_w -590406357
    //   5767: l2i
    //   5768: ldc_w 25779814
    //   5771: ixor
    //   5772: ixor
    //   5773: tableswitch default -> 5745, 1326786495 -> 5796, 1326786496 -> 5930
    //   5796: getstatic Perryc.c : I
    //   5799: iflt -> 5813
    //   5802: ldc2_w -1342494962
    //   5805: l2i
    //   5806: ldc_w 1293673612
    //   5809: ixor
    //   5810: goto -> 5821
    //   5813: ldc2_w 1060283137
    //   5816: l2i
    //   5817: ldc_w -538720127
    //   5820: ixor
    //   5821: ldc2_w -1348216091
    //   5824: l2i
    //   5825: ldc_w 1375838972
    //   5828: ixor
    //   5829: ixor
    //   5830: lookupswitch default -> 5856, 524467099 -> 7164, 2069973108 -> 5813
    //   5856: aload_1
    //   5857: getstatic Perryc.0 : I
    //   5860: ifle -> 5874
    //   5863: ldc2_w 560631616
    //   5866: l2i
    //   5867: ldc_w -1411080352
    //   5870: ixor
    //   5871: goto -> 5882
    //   5874: ldc2_w 378640246
    //   5877: l2i
    //   5878: ldc_w -1457968561
    //   5881: ixor
    //   5882: ldc2_w -1775064477
    //   5885: l2i
    //   5886: ldc_w -1327272897
    //   5889: ixor
    //   5890: ixor
    //   5891: lookupswitch default -> 5916, -1403005316 -> 7298, 1865343973 -> 5874
    //   5916: goto -> 5920
    //   5919: athrow
    //   5920: invokevirtual getDefaultValue : ()Ljava/lang/Object;
    //   5923: goto -> 5927
    //   5926: athrow
    //   5927: goto -> 5994
    //   5930: getstatic Perryc.0 : I
    //   5933: ifle -> 5947
    //   5936: ldc2_w -264556733
    //   5939: l2i
    //   5940: ldc_w -2141401598
    //   5943: ixor
    //   5944: goto -> 5955
    //   5947: ldc2_w -1014906337
    //   5950: l2i
    //   5951: ldc_w -1526094373
    //   5954: ixor
    //   5955: ldc2_w -308299849
    //   5958: l2i
    //   5959: ldc_w -536030286
    //   5962: ixor
    //   5963: ixor
    //   5964: lookupswitch default -> 5992, -2042464571 -> 5947, 2113176900 -> 7268
    //   5992: aload #7
    //   5994: getstatic Perryc.0 : I
    //   5997: ifle -> 6011
    //   6000: ldc2_w 1485276241
    //   6003: l2i
    //   6004: ldc_w 1447140900
    //   6007: ixor
    //   6008: goto -> 6019
    //   6011: ldc2_w 185243094
    //   6014: l2i
    //   6015: ldc_w -633257871
    //   6018: ixor
    //   6019: ldc2_w -2110395751
    //   6022: l2i
    //   6023: ldc_w 1775704064
    //   6026: ixor
    //   6027: ixor
    //   6028: lookupswitch default -> 6056, -923149553 -> 6011, -450565908 -> 7246
    //   6056: goto -> 6060
    //   6059: athrow
    //   6060: invokevirtual setValue : (Ljava/lang/Object;)V
    //   6063: goto -> 6067
    //   6066: athrow
    //   6067: goto -> 6134
    //   6070: getstatic Perryc.c : I
    //   6073: iflt -> 6087
    //   6076: ldc2_w 483853197
    //   6079: l2i
    //   6080: ldc_w -1374154114
    //   6083: ixor
    //   6084: goto -> 6095
    //   6087: ldc2_w -1340958640
    //   6090: l2i
    //   6091: ldc_w -1471685542
    //   6094: ixor
    //   6095: ldc2_w -1856903125
    //   6098: l2i
    //   6099: ldc_w -1949569262
    //   6102: ixor
    //   6103: ixor
    //   6104: lookupswitch default -> 7254, -1470818614 -> 6087, 47137587 -> 6132
    //   6132: astore #6
    //   6134: return
    //   6135: getstatic Perryc.1 : I
    //   6138: ifeq -> 6152
    //   6141: ldc2_w -1319682767
    //   6144: l2i
    //   6145: ldc_w 1669602755
    //   6148: ixor
    //   6149: goto -> 6160
    //   6152: ldc2_w 273540105
    //   6155: l2i
    //   6156: ldc_w 352530884
    //   6159: ixor
    //   6160: ldc2_w 1254307257
    //   6163: l2i
    //   6164: ldc_w -150837145
    //   6167: ixor
    //   6168: ixor
    //   6169: lookupswitch default -> 6196, -1137602197 -> 6152, 1863482668 -> 7198
    //   6196: getstatic bigname/zprestige/webhack/WebHack.LOGGER : Lorg/apache/logging/log4j/Logger;
    //   6199: new java/lang/StringBuilder
    //   6202: dup
    //   6203: getstatic Perryc.c : I
    //   6206: iflt -> 6220
    //   6209: ldc2_w 808240993
    //   6212: l2i
    //   6213: ldc_w -277880979
    //   6216: ixor
    //   6217: goto -> 6228
    //   6220: ldc2_w 1902019242
    //   6223: l2i
    //   6224: ldc_w -1465187798
    //   6227: ixor
    //   6228: ldc2_w 290523793
    //   6231: l2i
    //   6232: ldc_w 1783919789
    //   6235: ixor
    //   6236: ixor
    //   6237: lookupswitch default -> 7138, -1561264452 -> 6264, -1538890192 -> 6220
    //   6264: goto -> 6268
    //   6267: athrow
    //   6268: invokespecial <init> : ()V
    //   6271: goto -> 6275
    //   6274: athrow
    //   6275: ldc_w '៖㌝ឺ铊篆賂๷樶✣✲꼬ਲ਼??ꏆ諆辋쿏ญ曤顈侷﵃⑅䎞'
    //   6278: getstatic Perryc.0 : I
    //   6281: ifle -> 6295
    //   6284: ldc2_w -363478298
    //   6287: l2i
    //   6288: ldc_w 1348383189
    //   6291: ixor
    //   6292: goto -> 6303
    //   6295: ldc2_w -657492512
    //   6298: l2i
    //   6299: ldc_w -202218905
    //   6302: ixor
    //   6303: ldc2_w 1395509195
    //   6306: l2i
    //   6307: ldc_w 1293475390
    //   6310: ixor
    //   6311: ixor
    //   6312: lookupswitch default -> 7146, -1539413306 -> 6295, 889720434 -> 6340
    //   6340: goto -> 6344
    //   6343: athrow
    //   6344: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6347: goto -> 6351
    //   6350: athrow
    //   6351: getstatic Perryc.0 : I
    //   6354: ifle -> 6368
    //   6357: ldc2_w -1857540388
    //   6360: l2i
    //   6361: ldc_w -197049749
    //   6364: ixor
    //   6365: goto -> 6376
    //   6368: ldc2_w 1293702628
    //   6371: l2i
    //   6372: ldc_w -1525656089
    //   6375: ixor
    //   6376: ldc2_w 1897338343
    //   6379: l2i
    //   6380: ldc_w -2136685641
    //   6383: ixor
    //   6384: ixor
    //   6385: lookupswitch default -> 7192, -1799701785 -> 6368, 432002643 -> 6412
    //   6412: goto -> 6416
    //   6415: athrow
    //   6416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6419: goto -> 6423
    //   6422: athrow
    //   6423: getstatic Perryc.0 : I
    //   6426: ifle -> 6440
    //   6429: ldc2_w -2098676530
    //   6432: l2i
    //   6433: ldc_w -2090636720
    //   6436: ixor
    //   6437: goto -> 6448
    //   6440: ldc2_w -1792436292
    //   6443: l2i
    //   6444: ldc_w 554968616
    //   6447: ixor
    //   6448: ldc2_w 788147308
    //   6451: l2i
    //   6452: ldc_w 559019820
    //   6455: ixor
    //   6456: ixor
    //   6457: lookupswitch default -> 6484, -119459363 -> 6440, 236981726 -> 7230
    //   6484: aload_0
    //   6485: getstatic Perryc.1 : I
    //   6488: ifeq -> 6502
    //   6491: ldc2_w 1993563453
    //   6494: l2i
    //   6495: ldc_w -1370435579
    //   6498: ixor
    //   6499: goto -> 6510
    //   6502: ldc2_w 1736274079
    //   6505: l2i
    //   6506: ldc_w -793166300
    //   6509: ixor
    //   6510: ldc2_w 18939293
    //   6513: l2i
    //   6514: ldc_w 460125273
    //   6517: ixor
    //   6518: ixor
    //   6519: lookupswitch default -> 6544, -1026587396 -> 7306, -526311317 -> 6502
    //   6544: goto -> 6548
    //   6547: athrow
    //   6548: invokevirtual getName : ()Ljava/lang/String;
    //   6551: goto -> 6555
    //   6554: athrow
    //   6555: getstatic Perryc.1 : I
    //   6558: ifeq -> 6572
    //   6561: ldc2_w -1826714577
    //   6564: l2i
    //   6565: ldc_w 23777414
    //   6568: ixor
    //   6569: goto -> 6580
    //   6572: ldc2_w -1773315321
    //   6575: l2i
    //   6576: ldc_w 1624322337
    //   6579: ixor
    //   6580: ldc2_w -989336826
    //   6583: l2i
    //   6584: ldc_w 1002196722
    //   6587: ixor
    //   6588: ixor
    //   6589: lookupswitch default -> 6616, 1458693791 -> 6572, 1825569117 -> 7180
    //   6616: goto -> 6620
    //   6619: athrow
    //   6620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6623: goto -> 6627
    //   6626: athrow
    //   6627: ldc_w 'ឣ㍉៱'
    //   6630: getstatic Perryc.0 : I
    //   6633: ifle -> 6647
    //   6636: ldc2_w -1322377476
    //   6639: l2i
    //   6640: ldc_w -1603313164
    //   6643: ixor
    //   6644: goto -> 6655
    //   6647: ldc2_w -1663093171
    //   6650: l2i
    //   6651: ldc_w 1831079160
    //   6654: ixor
    //   6655: ldc2_w 561398384
    //   6658: l2i
    //   6659: ldc_w -20095382
    //   6662: ixor
    //   6663: ixor
    //   6664: lookupswitch default -> 7194, -822451438 -> 6647, 775956143 -> 6692
    //   6692: goto -> 6696
    //   6695: athrow
    //   6696: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6699: goto -> 6703
    //   6702: athrow
    //   6703: getstatic Perryc.1 : I
    //   6706: ifeq -> 6720
    //   6709: ldc2_w 1771261753
    //   6712: l2i
    //   6713: ldc_w 1891132557
    //   6716: ixor
    //   6717: goto -> 6728
    //   6720: ldc2_w 1032348762
    //   6723: l2i
    //   6724: ldc_w -1199202911
    //   6727: ixor
    //   6728: ldc2_w -589019524
    //   6731: l2i
    //   6732: ldc_w 778387425
    //   6735: ixor
    //   6736: ixor
    //   6737: lookupswitch default -> 7200, -341159383 -> 6720, 2005696614 -> 6764
    //   6764: goto -> 6768
    //   6767: athrow
    //   6768: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6771: goto -> 6775
    //   6774: athrow
    //   6775: getstatic Perryc.0 : I
    //   6778: ifle -> 6792
    //   6781: ldc2_w 1947846425
    //   6784: l2i
    //   6785: ldc_w 192872938
    //   6788: ixor
    //   6789: goto -> 6800
    //   6792: ldc2_w 1543415200
    //   6795: l2i
    //   6796: ldc_w 1174100720
    //   6799: ixor
    //   6800: ldc2_w -1157902082
    //   6803: l2i
    //   6804: ldc_w -500054623
    //   6807: ixor
    //   6808: ixor
    //   6809: lookupswitch default -> 7252, 665637804 -> 6792, 1188030991 -> 6836
    //   6836: aload_1
    //   6837: getstatic Perryc.0 : I
    //   6840: ifle -> 6854
    //   6843: ldc2_w 184339350
    //   6846: l2i
    //   6847: ldc_w 1347498907
    //   6850: ixor
    //   6851: goto -> 6862
    //   6854: ldc2_w -2052880685
    //   6857: l2i
    //   6858: ldc_w 1152299103
    //   6861: ixor
    //   6862: ldc2_w -2134101610
    //   6865: l2i
    //   6866: ldc_w -1442941377
    //   6869: ixor
    //   6870: ixor
    //   6871: lookupswitch default -> 6896, -1706946602 -> 6854, 1939849124 -> 7292
    //   6896: goto -> 6900
    //   6899: athrow
    //   6900: invokevirtual getName : ()Ljava/lang/String;
    //   6903: goto -> 6907
    //   6906: athrow
    //   6907: getstatic Perryc.c : I
    //   6910: iflt -> 6924
    //   6913: ldc2_w 726375372
    //   6916: l2i
    //   6917: ldc_w 73054397
    //   6920: ixor
    //   6921: goto -> 6932
    //   6924: ldc2_w 1207051085
    //   6927: l2i
    //   6928: ldc_w -802635505
    //   6931: ixor
    //   6932: ldc2_w -1100425438
    //   6935: l2i
    //   6936: ldc_w 1107662878
    //   6939: ixor
    //   6940: ixor
    //   6941: lookupswitch default -> 7318, -746820531 -> 6924, 1807199614 -> 6968
    //   6968: goto -> 6972
    //   6971: athrow
    //   6972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6975: goto -> 6979
    //   6978: athrow
    //   6979: getstatic Perryc.1 : I
    //   6982: ifeq -> 6996
    //   6985: ldc2_w 2115248303
    //   6988: l2i
    //   6989: ldc_w 1311979864
    //   6992: ixor
    //   6993: goto -> 7004
    //   6996: ldc2_w -1622842290
    //   6999: l2i
    //   7000: ldc_w -360171664
    //   7003: ixor
    //   7004: ldc2_w 1954892282
    //   7007: l2i
    //   7008: ldc_w -706277105
    //   7011: ixor
    //   7012: ixor
    //   7013: lookupswitch default -> 7040, -1857732350 -> 7140, 1694535580 -> 6996
    //   7040: goto -> 7044
    //   7043: athrow
    //   7044: invokevirtual toString : ()Ljava/lang/String;
    //   7047: goto -> 7051
    //   7050: athrow
    //   7051: getstatic Perryc.1 : I
    //   7054: ifeq -> 7068
    //   7057: ldc2_w 1572785681
    //   7060: l2i
    //   7061: ldc_w -99217187
    //   7064: ixor
    //   7065: goto -> 7076
    //   7068: ldc2_w -208316218
    //   7071: l2i
    //   7072: ldc_w 1819823999
    //   7075: ixor
    //   7076: ldc2_w 1139544201
    //   7079: l2i
    //   7080: ldc_w 498505594
    //   7083: ixor
    //   7084: ixor
    //   7085: lookupswitch default -> 7112, -182576166 -> 7068, -101557953 -> 7128
    //   7112: goto -> 7116
    //   7115: athrow
    //   7116: invokeinterface error : (Ljava/lang/String;)V
    //   7121: goto -> 7125
    //   7124: athrow
    //   7125: return
    //   7126: aconst_null
    //   7127: athrow
    //   7128: aconst_null
    //   7129: athrow
    //   7130: aconst_null
    //   7131: athrow
    //   7132: aconst_null
    //   7133: athrow
    //   7134: aconst_null
    //   7135: athrow
    //   7136: aconst_null
    //   7137: athrow
    //   7138: aconst_null
    //   7139: athrow
    //   7140: aconst_null
    //   7141: athrow
    //   7142: aconst_null
    //   7143: athrow
    //   7144: aconst_null
    //   7145: athrow
    //   7146: aconst_null
    //   7147: athrow
    //   7148: aconst_null
    //   7149: athrow
    //   7150: aconst_null
    //   7151: athrow
    //   7152: aconst_null
    //   7153: athrow
    //   7154: aconst_null
    //   7155: athrow
    //   7156: aconst_null
    //   7157: athrow
    //   7158: aconst_null
    //   7159: athrow
    //   7160: aconst_null
    //   7161: athrow
    //   7162: aconst_null
    //   7163: athrow
    //   7164: aconst_null
    //   7165: athrow
    //   7166: aconst_null
    //   7167: athrow
    //   7168: aconst_null
    //   7169: athrow
    //   7170: aconst_null
    //   7171: athrow
    //   7172: aconst_null
    //   7173: athrow
    //   7174: aconst_null
    //   7175: athrow
    //   7176: aconst_null
    //   7177: athrow
    //   7178: aconst_null
    //   7179: athrow
    //   7180: aconst_null
    //   7181: athrow
    //   7182: aconst_null
    //   7183: athrow
    //   7184: aconst_null
    //   7185: athrow
    //   7186: aconst_null
    //   7187: athrow
    //   7188: aconst_null
    //   7189: athrow
    //   7190: aconst_null
    //   7191: athrow
    //   7192: aconst_null
    //   7193: athrow
    //   7194: aconst_null
    //   7195: athrow
    //   7196: aconst_null
    //   7197: athrow
    //   7198: aconst_null
    //   7199: athrow
    //   7200: aconst_null
    //   7201: athrow
    //   7202: aconst_null
    //   7203: athrow
    //   7204: aconst_null
    //   7205: athrow
    //   7206: aconst_null
    //   7207: athrow
    //   7208: aconst_null
    //   7209: athrow
    //   7210: aconst_null
    //   7211: athrow
    //   7212: aconst_null
    //   7213: athrow
    //   7214: aconst_null
    //   7215: athrow
    //   7216: aconst_null
    //   7217: athrow
    //   7218: aconst_null
    //   7219: athrow
    //   7220: aconst_null
    //   7221: athrow
    //   7222: aconst_null
    //   7223: athrow
    //   7224: aconst_null
    //   7225: athrow
    //   7226: aconst_null
    //   7227: athrow
    //   7228: aconst_null
    //   7229: athrow
    //   7230: aconst_null
    //   7231: athrow
    //   7232: aconst_null
    //   7233: athrow
    //   7234: aconst_null
    //   7235: athrow
    //   7236: aconst_null
    //   7237: athrow
    //   7238: aconst_null
    //   7239: athrow
    //   7240: aconst_null
    //   7241: athrow
    //   7242: aconst_null
    //   7243: athrow
    //   7244: aconst_null
    //   7245: athrow
    //   7246: aconst_null
    //   7247: athrow
    //   7248: aconst_null
    //   7249: athrow
    //   7250: aconst_null
    //   7251: athrow
    //   7252: aconst_null
    //   7253: athrow
    //   7254: aconst_null
    //   7255: athrow
    //   7256: aconst_null
    //   7257: athrow
    //   7258: aconst_null
    //   7259: athrow
    //   7260: aconst_null
    //   7261: athrow
    //   7262: aconst_null
    //   7263: athrow
    //   7264: aconst_null
    //   7265: athrow
    //   7266: aconst_null
    //   7267: athrow
    //   7268: aconst_null
    //   7269: athrow
    //   7270: aconst_null
    //   7271: athrow
    //   7272: aconst_null
    //   7273: athrow
    //   7274: aconst_null
    //   7275: athrow
    //   7276: aconst_null
    //   7277: athrow
    //   7278: aconst_null
    //   7279: athrow
    //   7280: aconst_null
    //   7281: athrow
    //   7282: aconst_null
    //   7283: athrow
    //   7284: aconst_null
    //   7285: athrow
    //   7286: aconst_null
    //   7287: athrow
    //   7288: aconst_null
    //   7289: athrow
    //   7290: aconst_null
    //   7291: athrow
    //   7292: aconst_null
    //   7293: athrow
    //   7294: aconst_null
    //   7295: athrow
    //   7296: aconst_null
    //   7297: athrow
    //   7298: aconst_null
    //   7299: athrow
    //   7300: aconst_null
    //   7301: athrow
    //   7302: aconst_null
    //   7303: athrow
    //   7304: aconst_null
    //   7305: athrow
    //   7306: aconst_null
    //   7307: athrow
    //   7308: aconst_null
    //   7309: athrow
    //   7310: aconst_null
    //   7311: athrow
    //   7312: aconst_null
    //   7313: athrow
    //   7314: aconst_null
    //   7315: athrow
    //   7316: aconst_null
    //   7317: athrow
    //   7318: aconst_null
    //   7319: athrow
    //   7320: pop
    //   7321: goto -> 24
    //   7324: pop
    //   7325: aconst_null
    //   7326: goto -> 7320
    //   7329: dup
    //   7330: ifnull -> 7320
    //   7333: checkcast java/lang/Throwable
    //   7336: athrow
    //   7337: dup
    //   7338: ifnull -> 7324
    //   7341: checkcast java/lang/Throwable
    //   7344: athrow
    //   7345: aconst_null
    //   7346: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   4401	271	3	str	Ljava/lang/String;
    //   5358	709	6	converter	Lbigname/zprestige/webhack/features/setting/EnumConverter;
    //   5618	449	7	value	Ljava/lang/Enum;
    //   24	7102	0	feature	Lbigname/zprestige/webhack/features/Feature;
    //   24	7102	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
    //   24	7102	2	element	Lcom/google/gson/JsonElement;
    // Exception table:
    //   from	to	target	type
    //   8	20	7329	finally
    //   144	150	150	finally
    //   144	150	150	java/lang/NumberFormatException
    //   144	150	3	finally
    //   144	150	3	java/lang/IndexOutOfBoundsException
    //   144	150	3	finally
    //   399	406	406	finally
    //   399	406	406	java/lang/IllegalArgumentException
    //   399	406	399	java/lang/IllegalArgumentException
    //   400	406	406	finally
    //   400	406	406	finally
    //   591	598	598	finally
    //   591	598	598	java/util/ConcurrentModificationException
    //   591	598	3	finally
    //   591	598	591	java/lang/ArrayIndexOutOfBoundsException
    //   592	598	591	java/lang/IllegalArgumentException
    //   660	666	666	finally
    //   660	666	666	finally
    //   660	666	666	finally
    //   660	666	666	java/lang/RuntimeException
    //   660	666	666	java/lang/ClassCastException
    //   907	914	914	finally
    //   907	914	914	java/lang/NegativeArraySizeException
    //   907	914	3	finally
    //   908	914	3	finally
    //   908	914	907	finally
    //   975	982	982	finally
    //   975	982	3	finally
    //   975	982	3	java/lang/NullPointerException
    //   976	982	975	java/lang/NullPointerException
    //   976	982	982	java/lang/RuntimeException
    //   1227	1234	1234	finally
    //   1227	1234	1234	finally
    //   1227	1234	1234	finally
    //   1228	1234	1227	finally
    //   1228	1234	3	finally
    //   1299	1306	1306	finally
    //   1299	1306	3	java/lang/IllegalStateException
    //   1299	1306	1299	finally
    //   1300	1306	1299	finally
    //   1300	1306	1299	finally
    //   1559	1566	1566	finally
    //   1559	1566	1566	finally
    //   1559	1566	1559	java/lang/ClassCastException
    //   1559	1566	3	java/lang/IndexOutOfBoundsException
    //   1560	1566	1566	java/lang/EnumConstantNotPresentException
    //   1631	1638	1638	finally
    //   1631	1638	1638	finally
    //   1632	1638	1638	finally
    //   1632	1638	1631	java/lang/NegativeArraySizeException
    //   1632	1638	1638	finally
    //   1891	1898	1898	finally
    //   1891	1898	1891	finally
    //   1892	1898	3	finally
    //   1892	1898	1891	finally
    //   1892	1898	3	finally
    //   1963	1970	1970	finally
    //   1963	1970	1963	java/lang/UnsupportedOperationException
    //   1963	1970	1970	java/lang/EnumConstantNotPresentException
    //   1963	1970	3	java/lang/ArrayIndexOutOfBoundsException
    //   1964	1970	1963	java/lang/NumberFormatException
    //   2224	2230	2230	finally
    //   2224	2230	2230	java/util/NoSuchElementException
    //   2224	2230	3	java/lang/UnsupportedOperationException
    //   2224	2230	2230	java/lang/AssertionError
    //   2224	2230	3	finally
    //   2295	2302	2302	finally
    //   2295	2302	3	finally
    //   2295	2302	3	java/lang/IllegalStateException
    //   2296	2302	2295	finally
    //   2296	2302	2302	finally
    //   2556	2562	2562	finally
    //   2556	2562	2562	finally
    //   2556	2562	2562	java/lang/IllegalStateException
    //   2556	2562	2562	finally
    //   2556	2562	3	finally
    //   2627	2634	2634	finally
    //   2627	2634	2634	finally
    //   2627	2634	2634	finally
    //   2628	2634	2627	finally
    //   2628	2634	2627	java/lang/StringIndexOutOfBoundsException
    //   3047	3054	3054	finally
    //   3047	3054	3	finally
    //   3047	3054	3047	java/lang/ArithmeticException
    //   3047	3054	3	java/util/ConcurrentModificationException
    //   3048	3054	3054	java/lang/UnsupportedOperationException
    //   3119	3126	3126	finally
    //   3119	3126	3119	finally
    //   3119	3126	3119	finally
    //   3120	3126	3119	finally
    //   3120	3126	3	finally
    //   3191	3198	3198	finally
    //   3191	3198	3191	java/lang/UnsupportedOperationException
    //   3191	3198	3191	finally
    //   3191	3198	3191	java/lang/NumberFormatException
    //   3192	3198	3	finally
    //   3384	3390	3390	finally
    //   3384	3390	3	finally
    //   3384	3390	3390	finally
    //   3384	3390	3	java/lang/ArrayIndexOutOfBoundsException
    //   3384	3390	3390	finally
    //   3455	3462	3462	finally
    //   3456	3462	3462	finally
    //   3456	3462	3455	java/lang/NullPointerException
    //   3456	3462	3462	finally
    //   3456	3462	3	java/lang/ClassCastException
    //   3527	3534	3534	finally
    //   3527	3534	3527	finally
    //   3528	3534	3527	java/util/ConcurrentModificationException
    //   3528	3534	3527	finally
    //   3528	3534	3534	java/lang/NullPointerException
    //   3720	3726	3726	finally
    //   3720	3726	3726	finally
    //   3720	3726	3	finally
    //   3720	3726	3726	finally
    //   3720	3726	3726	java/lang/AssertionError
    //   3792	3798	3798	finally
    //   3792	3798	3	java/lang/EnumConstantNotPresentException
    //   3792	3798	3	java/lang/AssertionError
    //   3792	3798	3798	finally
    //   3792	3798	3798	java/lang/AssertionError
    //   3863	3870	3870	finally
    //   3863	3870	3870	java/lang/ArrayIndexOutOfBoundsException
    //   3864	3870	3	finally
    //   3864	3870	3	finally
    //   3864	3870	3863	java/lang/NumberFormatException
    //   4055	4062	4062	finally
    //   4055	4062	3	finally
    //   4056	4062	4062	java/util/ConcurrentModificationException
    //   4056	4062	4055	finally
    //   4056	4062	4055	java/util/ConcurrentModificationException
    //   4127	4134	4134	finally
    //   4127	4134	4127	java/lang/RuntimeException
    //   4127	4134	4134	java/util/NoSuchElementException
    //   4128	4134	4127	finally
    //   4128	4134	4127	finally
    //   4199	4206	4206	finally
    //   4199	4206	4206	finally
    //   4199	4206	3	java/lang/UnsupportedOperationException
    //   4200	4206	3	java/lang/ArrayIndexOutOfBoundsException
    //   4200	4206	4199	java/lang/ArrayIndexOutOfBoundsException
    //   4332	4338	4338	finally
    //   4332	4338	4338	java/lang/ArrayIndexOutOfBoundsException
    //   4332	4338	4338	finally
    //   4332	4338	4338	finally
    //   4332	4338	3	java/lang/StringIndexOutOfBoundsException
    //   4592	4598	4598	finally
    //   4592	4598	4598	finally
    //   4592	4598	3	finally
    //   4592	4598	4598	java/lang/UnsupportedOperationException
    //   4592	4598	4598	java/util/ConcurrentModificationException
    //   4664	4670	4670	finally
    //   4664	4670	3	finally
    //   4664	4670	4670	finally
    //   4664	4670	4670	java/lang/IndexOutOfBoundsException
    //   4664	4670	3	finally
    //   4799	4806	4806	finally
    //   4799	4806	4799	java/lang/NumberFormatException
    //   4799	4806	4806	finally
    //   4800	4806	3	java/lang/AssertionError
    //   4800	4806	4806	java/lang/NegativeArraySizeException
    //   4931	4938	4938	finally
    //   4931	4938	4938	java/lang/AssertionError
    //   4931	4938	4931	finally
    //   4932	4938	3	finally
    //   4932	4938	4938	java/lang/IndexOutOfBoundsException
    //   5003	5010	5010	finally
    //   5003	5010	5003	java/lang/RuntimeException
    //   5003	5010	3	java/lang/ArithmeticException
    //   5004	5010	5010	java/util/ConcurrentModificationException
    //   5004	5010	5010	java/lang/AssertionError
    //   5012	5139	6070	java/lang/Exception
    //   5140	5146	5146	finally
    //   5140	5146	3	finally
    //   5140	5146	5146	finally
    //   5140	5146	5146	java/lang/ArithmeticException
    //   5140	5146	5146	java/util/NoSuchElementException
    //   5140	5215	6070	java/lang/Exception
    //   5216	5222	5222	finally
    //   5216	5222	5222	java/lang/StringIndexOutOfBoundsException
    //   5216	5222	5222	finally
    //   5216	5222	3	java/lang/ClassCastException
    //   5216	5222	5222	finally
    //   5216	6067	6070	java/lang/Exception
    //   5287	5294	5294	finally
    //   5287	5294	5287	java/lang/NullPointerException
    //   5287	5294	5294	java/lang/AssertionError
    //   5288	5294	5287	java/lang/IllegalStateException
    //   5288	5294	5287	finally
    //   5547	5554	5554	finally
    //   5547	5554	5547	finally
    //   5548	5554	5554	java/lang/AssertionError
    //   5548	5554	3	finally
    //   5548	5554	5554	finally
    //   5919	5926	5926	finally
    //   5919	5926	5919	finally
    //   5920	5926	5919	finally
    //   5920	5926	5926	java/lang/ArrayIndexOutOfBoundsException
    //   5920	5926	3	finally
    //   6059	6066	6066	finally
    //   6060	6066	3	java/lang/EnumConstantNotPresentException
    //   6060	6066	3	finally
    //   6060	6066	6059	java/lang/UnsupportedOperationException
    //   6060	6066	3	java/lang/ArithmeticException
    //   6267	6274	6274	finally
    //   6267	6274	6274	finally
    //   6267	6274	6267	java/lang/ArrayIndexOutOfBoundsException
    //   6268	6274	3	java/util/NoSuchElementException
    //   6268	6274	6274	java/lang/NegativeArraySizeException
    //   6343	6350	6350	finally
    //   6343	6350	3	finally
    //   6344	6350	6350	java/lang/EnumConstantNotPresentException
    //   6344	6350	6350	finally
    //   6344	6350	6343	java/lang/EnumConstantNotPresentException
    //   6415	6422	6422	finally
    //   6416	6422	6422	java/lang/IndexOutOfBoundsException
    //   6416	6422	3	java/lang/AssertionError
    //   6416	6422	3	finally
    //   6416	6422	6415	java/lang/IndexOutOfBoundsException
    //   6547	6554	6554	finally
    //   6547	6554	6554	java/lang/ClassCastException
    //   6547	6554	3	java/util/ConcurrentModificationException
    //   6548	6554	6554	finally
    //   6548	6554	6547	finally
    //   6619	6626	6626	finally
    //   6619	6626	3	finally
    //   6619	6626	6619	finally
    //   6620	6626	3	finally
    //   6620	6626	3	java/lang/ArithmeticException
    //   6696	6702	6702	finally
    //   6696	6702	3	finally
    //   6696	6702	3	java/lang/AssertionError
    //   6696	6702	6702	finally
    //   6696	6702	3	finally
    //   6768	6774	6774	finally
    //   6768	6774	3	java/lang/ClassCastException
    //   6768	6774	6774	java/lang/IllegalArgumentException
    //   6768	6774	6774	finally
    //   6768	6774	3	java/lang/ArrayIndexOutOfBoundsException
    //   6899	6906	6906	finally
    //   6899	6906	3	finally
    //   6900	6906	6899	java/lang/ArrayIndexOutOfBoundsException
    //   6900	6906	3	finally
    //   6900	6906	3	finally
    //   6971	6978	6978	finally
    //   6971	6978	3	java/lang/IllegalArgumentException
    //   6971	6978	6971	finally
    //   6971	6978	6978	java/lang/IllegalArgumentException
    //   6972	6978	3	java/util/NoSuchElementException
    //   7043	7050	7050	finally
    //   7043	7050	7050	finally
    //   7044	7050	3	java/lang/AssertionError
    //   7044	7050	7043	java/lang/ArithmeticException
    //   7044	7050	7043	java/lang/NullPointerException
    //   7115	7124	7124	finally
    //   7115	7124	7115	finally
    //   7115	7124	7124	java/lang/ArrayIndexOutOfBoundsException
    //   7116	7124	7124	java/util/ConcurrentModificationException
    //   7116	7124	7124	finally
    //   7329	7337	7329	finally
    //   7345	7347	3	java/util/NoSuchElementException
  }
  
  public void resetConfig(boolean saveConfig, String name) {
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
  
  public JsonObject writeSettings(Feature feature) {
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
  
  public static void loadFile(JsonObject input, Feature feature) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3719
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 3711
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3703
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1131744203
    //   33: l2i
    //   34: ldc_w -1086000725
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1073396123
    //   44: l2i
    //   45: ldc_w -646169751
    //   48: ixor
    //   49: ldc2_w -347363526
    //   52: l2i
    //   53: ldc_w 1827883910
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2072581854 -> 3598, 1674940693 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 1872531807
    //   94: l2i
    //   95: ldc_w -359879572
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1017061990
    //   105: l2i
    //   106: ldc_w 578212334
    //   109: ixor
    //   110: ldc2_w 758979271
    //   113: l2i
    //   114: ldc_w 1093911357
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 3630, -383851319 -> 102, 1927752306 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual entrySet : ()Ljava/util/Set;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 172
    //   161: ldc2_w 460581313
    //   164: l2i
    //   165: ldc_w 822035754
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -64962595
    //   175: l2i
    //   176: ldc_w 1633226332
    //   179: ixor
    //   180: ldc2_w 1886398369
    //   183: l2i
    //   184: ldc_w 539067899
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, 1481074805 -> 172, 2078084785 -> 3610
    //   216: goto -> 220
    //   219: athrow
    //   220: invokeinterface iterator : ()Ljava/util/Iterator;
    //   225: goto -> 229
    //   228: athrow
    //   229: getstatic Perryc.0 : I
    //   232: ifle -> 246
    //   235: ldc2_w 1597468075
    //   238: l2i
    //   239: ldc_w 1463387428
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w -1694615889
    //   249: l2i
    //   250: ldc_w 158032110
    //   253: ixor
    //   254: ldc2_w -1744958819
    //   257: l2i
    //   258: ldc_w 731593575
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 288, -1579818942 -> 246, -1268000395 -> 3662
    //   288: astore_2
    //   289: getstatic Perryc.0 : I
    //   292: ifle -> 306
    //   295: ldc2_w 1752883054
    //   298: l2i
    //   299: ldc_w 448849354
    //   302: ixor
    //   303: goto -> 314
    //   306: ldc2_w 735385138
    //   309: l2i
    //   310: ldc_w 300292516
    //   313: ixor
    //   314: ldc2_w 2041720100
    //   317: l2i
    //   318: ldc_w 174819493
    //   321: ixor
    //   322: ixor
    //   323: lookupswitch default -> 348, 23306021 -> 3686, 25731839 -> 306
    //   348: aload_2
    //   349: getstatic Perryc.1 : I
    //   352: ifeq -> 366
    //   355: ldc2_w -198401817
    //   358: l2i
    //   359: ldc_w 1673680385
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w 671001550
    //   369: l2i
    //   370: ldc_w -1313743164
    //   373: ixor
    //   374: ldc2_w 1737729526
    //   377: l2i
    //   378: ldc_w 1758238690
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 3602, -1733180174 -> 366, -1726986466 -> 408
    //   408: goto -> 412
    //   411: athrow
    //   412: invokeinterface hasNext : ()Z
    //   417: goto -> 421
    //   420: athrow
    //   421: ifeq -> 435
    //   424: ldc2_w -1912732798
    //   427: l2i
    //   428: ldc_w -891606768
    //   431: ixor
    //   432: goto -> 443
    //   435: ldc2_w 1623198834
    //   438: l2i
    //   439: ldc_w 669329121
    //   442: ixor
    //   443: ldc2_w -589721723
    //   446: l2i
    //   447: ldc_w -1093586223
    //   450: ixor
    //   451: ixor
    //   452: tableswitch default -> 424, 623744966 -> 476, 623744967 -> 3595
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -141088691
    //   485: l2i
    //   486: ldc_w -1884943187
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1349417741
    //   496: l2i
    //   497: ldc_w 459520315
    //   500: ixor
    //   501: ldc2_w 431722288
    //   504: l2i
    //   505: ldc_w 37402348
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -1991572999 -> 493, 1672486204 -> 3622
    //   536: aload_2
    //   537: getstatic Perryc.0 : I
    //   540: ifle -> 554
    //   543: ldc2_w -1550953333
    //   546: l2i
    //   547: ldc_w -1686906538
    //   550: ixor
    //   551: goto -> 562
    //   554: ldc2_w 772079128
    //   557: l2i
    //   558: ldc_w -431689414
    //   561: ixor
    //   562: ldc2_w -593630691
    //   565: l2i
    //   566: ldc_w -1583695024
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 3612, -1253613969 -> 596, 1174068368 -> 554
    //   596: goto -> 600
    //   599: athrow
    //   600: invokeinterface next : ()Ljava/lang/Object;
    //   605: goto -> 609
    //   608: athrow
    //   609: checkcast java/util/Map$Entry
    //   612: getstatic Perryc.c : I
    //   615: iflt -> 629
    //   618: ldc2_w 1356369713
    //   621: l2i
    //   622: ldc_w -1207308649
    //   625: ixor
    //   626: goto -> 637
    //   629: ldc2_w 849317015
    //   632: l2i
    //   633: ldc_w -30581783
    //   636: ixor
    //   637: ldc2_w -1886452683
    //   640: l2i
    //   641: ldc_w 182549233
    //   644: ixor
    //   645: ixor
    //   646: lookupswitch default -> 672, 391258885 -> 629, 1841241954 -> 3616
    //   672: astore_3
    //   673: getstatic Perryc.c : I
    //   676: iflt -> 690
    //   679: ldc2_w -311474716
    //   682: l2i
    //   683: ldc_w 1429331211
    //   686: ixor
    //   687: goto -> 698
    //   690: ldc2_w 1618626495
    //   693: l2i
    //   694: ldc_w 1477697717
    //   697: ixor
    //   698: ldc2_w 1374273649
    //   701: l2i
    //   702: ldc_w -2128698357
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 3638, -392248464 -> 732, 1755970709 -> 690
    //   732: aload_3
    //   733: getstatic Perryc.0 : I
    //   736: ifle -> 750
    //   739: ldc2_w 115584517
    //   742: l2i
    //   743: ldc_w -1002944210
    //   746: ixor
    //   747: goto -> 758
    //   750: ldc2_w 2026912979
    //   753: l2i
    //   754: ldc_w -1805870857
    //   757: ixor
    //   758: ldc2_w 398725723
    //   761: l2i
    //   762: ldc_w 478444130
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 3670, -912552174 -> 750, -406008803 -> 792
    //   792: goto -> 796
    //   795: athrow
    //   796: invokeinterface getKey : ()Ljava/lang/Object;
    //   801: goto -> 805
    //   804: athrow
    //   805: checkcast java/lang/String
    //   808: getstatic Perryc.0 : I
    //   811: ifle -> 825
    //   814: ldc2_w 1322550670
    //   817: l2i
    //   818: ldc_w 564974491
    //   821: ixor
    //   822: goto -> 833
    //   825: ldc2_w -1833803834
    //   828: l2i
    //   829: ldc_w -1708043560
    //   832: ixor
    //   833: ldc2_w -1671003396
    //   836: l2i
    //   837: ldc_w -1721425848
    //   840: ixor
    //   841: ixor
    //   842: lookupswitch default -> 3688, 226537386 -> 868, 1786508449 -> 825
    //   868: astore #4
    //   870: getstatic Perryc.c : I
    //   873: iflt -> 887
    //   876: ldc2_w -1599627554
    //   879: l2i
    //   880: ldc_w -1775547816
    //   883: ixor
    //   884: goto -> 895
    //   887: ldc2_w -417775901
    //   890: l2i
    //   891: ldc_w -934973632
    //   894: ixor
    //   895: ldc2_w -642844695
    //   898: l2i
    //   899: ldc_w -356935085
    //   902: ixor
    //   903: ixor
    //   904: lookupswitch default -> 3604, 94091580 -> 887, 474692633 -> 932
    //   932: aload_3
    //   933: getstatic Perryc.1 : I
    //   936: ifeq -> 950
    //   939: ldc2_w -1073027191
    //   942: l2i
    //   943: ldc_w 766076921
    //   946: ixor
    //   947: goto -> 958
    //   950: ldc2_w 193362624
    //   953: l2i
    //   954: ldc_w -637126142
    //   957: ixor
    //   958: ldc2_w 1823946940
    //   961: l2i
    //   962: ldc_w 1394980390
    //   965: ixor
    //   966: ixor
    //   967: lookupswitch default -> 992, -1368989018 -> 950, -768536854 -> 3682
    //   992: goto -> 996
    //   995: athrow
    //   996: invokeinterface getValue : ()Ljava/lang/Object;
    //   1001: goto -> 1005
    //   1004: athrow
    //   1005: checkcast com/google/gson/JsonElement
    //   1008: getstatic Perryc.c : I
    //   1011: iflt -> 1025
    //   1014: ldc2_w -15572642
    //   1017: l2i
    //   1018: ldc_w -1779756701
    //   1021: ixor
    //   1022: goto -> 1033
    //   1025: ldc2_w -227242121
    //   1028: l2i
    //   1029: ldc_w -1595576475
    //   1032: ixor
    //   1033: ldc2_w 1445473221
    //   1036: l2i
    //   1037: ldc_w -867705550
    //   1040: ixor
    //   1041: ixor
    //   1042: lookupswitch default -> 1068, -258570550 -> 3640, 118751486 -> 1025
    //   1068: astore #5
    //   1070: getstatic Perryc.1 : I
    //   1073: ifeq -> 1087
    //   1076: ldc2_w 517975976
    //   1079: l2i
    //   1080: ldc_w 1754945978
    //   1083: ixor
    //   1084: goto -> 1095
    //   1087: ldc2_w -1734775399
    //   1090: l2i
    //   1091: ldc_w -123487221
    //   1094: ixor
    //   1095: ldc2_w -1234071023
    //   1098: l2i
    //   1099: ldc_w -2138454639
    //   1102: ixor
    //   1103: ixor
    //   1104: lookupswitch default -> 1132, 31675665 -> 1087, 1086169490 -> 3614
    //   1132: aload_1
    //   1133: instanceof bigname/zprestige/webhack/manager/FriendManager
    //   1136: ifeq -> 1150
    //   1139: ldc2_w 65417711
    //   1142: l2i
    //   1143: ldc_w -743975700
    //   1146: ixor
    //   1147: goto -> 1158
    //   1150: ldc2_w -2035638358
    //   1153: l2i
    //   1154: ldc_w 1458272936
    //   1157: ixor
    //   1158: ldc2_w -307502366
    //   1161: l2i
    //   1162: ldc_w 2099562005
    //   1165: ixor
    //   1166: ixor
    //   1167: tableswitch default -> 1139, 1087291892 -> 1188, 1087291893 -> 1878
    //   1188: getstatic Perryc.c : I
    //   1191: iflt -> 1205
    //   1194: ldc2_w 988132478
    //   1197: l2i
    //   1198: ldc_w -1950516601
    //   1201: ixor
    //   1202: goto -> 1213
    //   1205: ldc2_w 1911159403
    //   1208: l2i
    //   1209: ldc_w 368148539
    //   1212: ixor
    //   1213: ldc2_w -649884565
    //   1216: l2i
    //   1217: ldc_w 1242753546
    //   1220: ixor
    //   1221: ixor
    //   1222: lookupswitch default -> 3666, -146203599 -> 1248, 571058328 -> 1205
    //   1248: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   1251: new bigname/zprestige/webhack/manager/FriendManager$Friend
    //   1254: dup
    //   1255: getstatic Perryc.1 : I
    //   1258: ifeq -> 1272
    //   1261: ldc2_w 470174856
    //   1264: l2i
    //   1265: ldc_w 1781606571
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w 1410270896
    //   1275: l2i
    //   1276: ldc_w 1230433101
    //   1279: ixor
    //   1280: ldc2_w 1448718816
    //   1283: l2i
    //   1284: ldc_w 1840955937
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 1316, -882856713 -> 1272, 1305745378 -> 3672
    //   1316: aload #5
    //   1318: getstatic Perryc.c : I
    //   1321: iflt -> 1335
    //   1324: ldc2_w -398033231
    //   1327: l2i
    //   1328: ldc_w -529891222
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w -844818422
    //   1338: l2i
    //   1339: ldc_w 1820270609
    //   1342: ixor
    //   1343: ldc2_w -828927537
    //   1346: l2i
    //   1347: ldc_w 1380681974
    //   1350: ixor
    //   1351: ixor
    //   1352: lookupswitch default -> 3654, -1796151326 -> 1335, 1023811874 -> 1380
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokevirtual getAsString : ()Ljava/lang/String;
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: getstatic Perryc.0 : I
    //   1394: ifle -> 1408
    //   1397: ldc2_w -1048470047
    //   1400: l2i
    //   1401: ldc_w -1997859363
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w -1462551385
    //   1411: l2i
    //   1412: ldc_w 1720463470
    //   1415: ixor
    //   1416: ldc2_w 1239330257
    //   1419: l2i
    //   1420: ldc_w 1070062515
    //   1423: ixor
    //   1424: ixor
    //   1425: lookupswitch default -> 1452, 1001791684 -> 1408, 1064566366 -> 3642
    //   1452: aload #4
    //   1454: getstatic Perryc.1 : I
    //   1457: ifeq -> 1471
    //   1460: ldc2_w 2090958596
    //   1463: l2i
    //   1464: ldc_w 1137760795
    //   1467: ixor
    //   1468: goto -> 1479
    //   1471: ldc2_w 198850795
    //   1474: l2i
    //   1475: ldc_w 1919243664
    //   1478: ixor
    //   1479: ldc2_w 308735605
    //   1482: l2i
    //   1483: ldc_w 2093224922
    //   1486: ixor
    //   1487: ixor
    //   1488: lookupswitch default -> 1516, -1716805276 -> 1471, 1372805296 -> 3618
    //   1516: goto -> 1520
    //   1519: athrow
    //   1520: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
    //   1523: goto -> 1527
    //   1526: athrow
    //   1527: getstatic Perryc.1 : I
    //   1530: ifeq -> 1544
    //   1533: ldc2_w -485895226
    //   1536: l2i
    //   1537: ldc_w 1599830193
    //   1540: ixor
    //   1541: goto -> 1552
    //   1544: ldc2_w 1703227220
    //   1547: l2i
    //   1548: ldc_w 1548340367
    //   1551: ixor
    //   1552: ldc2_w -917880403
    //   1555: l2i
    //   1556: ldc_w -356761758
    //   1559: ixor
    //   1560: ixor
    //   1561: lookupswitch default -> 3632, -1616587336 -> 1544, 440048916 -> 1588
    //   1588: goto -> 1592
    //   1591: athrow
    //   1592: invokespecial <init> : (Ljava/lang/String;Ljava/util/UUID;)V
    //   1595: goto -> 1599
    //   1598: athrow
    //   1599: getstatic Perryc.1 : I
    //   1602: ifeq -> 1616
    //   1605: ldc2_w 2101032501
    //   1608: l2i
    //   1609: ldc_w 1253161508
    //   1612: ixor
    //   1613: goto -> 1624
    //   1616: ldc2_w 291586529
    //   1619: l2i
    //   1620: ldc_w 647034745
    //   1623: ixor
    //   1624: ldc2_w 1307635044
    //   1627: l2i
    //   1628: ldc_w 1346483381
    //   1631: ixor
    //   1632: ixor
    //   1633: lookupswitch default -> 3668, 708564416 -> 1616, 708898633 -> 1660
    //   1660: goto -> 1664
    //   1663: athrow
    //   1664: invokevirtual addFriend : (Lbigname/zprestige/webhack/manager/FriendManager$Friend;)V
    //   1667: goto -> 1671
    //   1670: athrow
    //   1671: goto -> 289
    //   1674: getstatic Perryc.0 : I
    //   1677: ifle -> 1691
    //   1680: ldc2_w 926900062
    //   1683: l2i
    //   1684: ldc_w 1273510928
    //   1687: ixor
    //   1688: goto -> 1699
    //   1691: ldc2_w 1557715823
    //   1694: l2i
    //   1695: ldc_w 1976775637
    //   1698: ixor
    //   1699: ldc2_w 1802992829
    //   1702: l2i
    //   1703: ldc_w -45926084
    //   1706: ixor
    //   1707: ixor
    //   1708: lookupswitch default -> 3676, -1086345925 -> 1736, -354212145 -> 1691
    //   1736: astore #6
    //   1738: getstatic Perryc.c : I
    //   1741: iflt -> 1755
    //   1744: ldc2_w 179418376
    //   1747: l2i
    //   1748: ldc_w -1972370663
    //   1751: ixor
    //   1752: goto -> 1763
    //   1755: ldc2_w 564161276
    //   1758: l2i
    //   1759: ldc_w -259168000
    //   1762: ixor
    //   1763: ldc2_w -670223653
    //   1766: l2i
    //   1767: ldc_w -1703355958
    //   1770: ixor
    //   1771: ixor
    //   1772: lookupswitch default -> 3636, -1822889747 -> 1800, -1028367104 -> 1755
    //   1800: aload #6
    //   1802: getstatic Perryc.0 : I
    //   1805: ifle -> 1819
    //   1808: ldc2_w -1439235226
    //   1811: l2i
    //   1812: ldc_w 1071791664
    //   1815: ixor
    //   1816: goto -> 1827
    //   1819: ldc2_w 878745606
    //   1822: l2i
    //   1823: ldc_w -1912952417
    //   1826: ixor
    //   1827: ldc2_w -1317931539
    //   1830: l2i
    //   1831: ldc_w 770114668
    //   1834: ixor
    //   1835: ixor
    //   1836: lookupswitch default -> 3692, 155438295 -> 1819, 621592600 -> 1864
    //   1864: goto -> 1868
    //   1867: athrow
    //   1868: invokevirtual printStackTrace : ()V
    //   1871: goto -> 1875
    //   1874: athrow
    //   1875: goto -> 289
    //   1878: ldc2_w 1510444028
    //   1881: l2i
    //   1882: ldc_w 1510444028
    //   1885: ixor
    //   1886: getstatic Perryc.c : I
    //   1889: iflt -> 1903
    //   1892: ldc2_w 1312133049
    //   1895: l2i
    //   1896: ldc_w 1685613881
    //   1899: ixor
    //   1900: goto -> 1911
    //   1903: ldc2_w -1591778707
    //   1906: l2i
    //   1907: ldc_w -1654442959
    //   1910: ixor
    //   1911: ldc2_w -2099928603
    //   1914: l2i
    //   1915: ldc_w 684614939
    //   1918: ixor
    //   1919: ixor
    //   1920: lookupswitch default -> 3660, -2141837698 -> 1903, -1771597150 -> 1948
    //   1948: istore #6
    //   1950: getstatic Perryc.1 : I
    //   1953: ifeq -> 1967
    //   1956: ldc2_w -103132015
    //   1959: l2i
    //   1960: ldc_w -7667109
    //   1963: ixor
    //   1964: goto -> 1975
    //   1967: ldc2_w 1140546704
    //   1970: l2i
    //   1971: ldc_w 857076319
    //   1974: ixor
    //   1975: ldc2_w 86474181
    //   1978: l2i
    //   1979: ldc_w -780594914
    //   1982: ixor
    //   1983: ixor
    //   1984: lookupswitch default -> 3620, -1531919852 -> 2012, -770754031 -> 1967
    //   2012: aload_1
    //   2013: getstatic Perryc.1 : I
    //   2016: ifeq -> 2030
    //   2019: ldc2_w 1787137527
    //   2022: l2i
    //   2023: ldc_w 326034174
    //   2026: ixor
    //   2027: goto -> 2038
    //   2030: ldc2_w -470648443
    //   2033: l2i
    //   2034: ldc_w 905102553
    //   2037: ixor
    //   2038: ldc2_w 711710497
    //   2041: l2i
    //   2042: ldc_w -22169272
    //   2045: ixor
    //   2046: ixor
    //   2047: lookupswitch default -> 2072, -1389559456 -> 3606, 1616311471 -> 2030
    //   2072: goto -> 2076
    //   2075: athrow
    //   2076: invokevirtual getSettings : ()Ljava/util/List;
    //   2079: goto -> 2083
    //   2082: athrow
    //   2083: getstatic Perryc.1 : I
    //   2086: ifeq -> 2100
    //   2089: ldc2_w -1102906296
    //   2092: l2i
    //   2093: ldc_w -1073975633
    //   2096: ixor
    //   2097: goto -> 2108
    //   2100: ldc2_w 980200703
    //   2103: l2i
    //   2104: ldc_w -968376433
    //   2107: ixor
    //   2108: ldc2_w 973772311
    //   2111: l2i
    //   2112: ldc_w 1399921205
    //   2115: ixor
    //   2116: ixor
    //   2117: lookupswitch default -> 2144, 105271597 -> 2100, 1757748933 -> 3684
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2153: goto -> 2157
    //   2156: athrow
    //   2157: getstatic Perryc.0 : I
    //   2160: ifle -> 2174
    //   2163: ldc2_w -405502377
    //   2166: l2i
    //   2167: ldc_w 1431818271
    //   2170: ixor
    //   2171: goto -> 2182
    //   2174: ldc2_w 1551305012
    //   2177: l2i
    //   2178: ldc_w -790975939
    //   2181: ixor
    //   2182: ldc2_w -1748557528
    //   2185: l2i
    //   2186: ldc_w 2092205389
    //   2189: ixor
    //   2190: ixor
    //   2191: lookupswitch default -> 3628, 1508962861 -> 2174, 1742604140 -> 2216
    //   2216: astore #7
    //   2218: getstatic Perryc.0 : I
    //   2221: ifle -> 2235
    //   2224: ldc2_w 72676483
    //   2227: l2i
    //   2228: ldc_w -21954046
    //   2231: ixor
    //   2232: goto -> 2243
    //   2235: ldc2_w -2072703541
    //   2238: l2i
    //   2239: ldc_w 2019419564
    //   2242: ixor
    //   2243: ldc2_w 793761559
    //   2246: l2i
    //   2247: ldc_w -693059495
    //   2250: ixor
    //   2251: ixor
    //   2252: lookupswitch default -> 2280, 52093391 -> 3674, 1283684704 -> 2235
    //   2280: aload #7
    //   2282: getstatic Perryc.1 : I
    //   2285: ifeq -> 2299
    //   2288: ldc2_w 327615827
    //   2291: l2i
    //   2292: ldc_w 371667726
    //   2295: ixor
    //   2296: goto -> 2307
    //   2299: ldc2_w 38733738
    //   2302: l2i
    //   2303: ldc_w 110528581
    //   2306: ixor
    //   2307: ldc2_w -985861386
    //   2310: l2i
    //   2311: ldc_w 1380190245
    //   2314: ixor
    //   2315: ixor
    //   2316: lookupswitch default -> 2344, -1831285618 -> 3656, 445684337 -> 2299
    //   2344: goto -> 2348
    //   2347: athrow
    //   2348: invokeinterface hasNext : ()Z
    //   2353: goto -> 2357
    //   2356: athrow
    //   2357: ifeq -> 2371
    //   2360: ldc2_w 1262612884
    //   2363: l2i
    //   2364: ldc_w 1847043675
    //   2367: ixor
    //   2368: goto -> 2379
    //   2371: ldc2_w 1819720679
    //   2374: l2i
    //   2375: ldc_w 1226894379
    //   2378: ixor
    //   2379: ldc2_w 1063550510
    //   2382: l2i
    //   2383: ldc_w 1160964324
    //   2386: ixor
    //   2387: ixor
    //   2388: tableswitch default -> 2360, 1593884933 -> 2412, 1593884934 -> 3477
    //   2412: getstatic Perryc.1 : I
    //   2415: ifeq -> 2429
    //   2418: ldc2_w 1875342417
    //   2421: l2i
    //   2422: ldc_w -922245387
    //   2425: ixor
    //   2426: goto -> 2437
    //   2429: ldc2_w 1273722794
    //   2432: l2i
    //   2433: ldc_w 1729097761
    //   2436: ixor
    //   2437: ldc2_w 1906883872
    //   2440: l2i
    //   2441: ldc_w -1394918953
    //   2444: ixor
    //   2445: ixor
    //   2446: lookupswitch default -> 2472, -916553882 -> 2429, 2075350611 -> 3644
    //   2472: aload #7
    //   2474: getstatic Perryc.1 : I
    //   2477: ifeq -> 2491
    //   2480: ldc2_w -1819083398
    //   2483: l2i
    //   2484: ldc_w 494613578
    //   2487: ixor
    //   2488: goto -> 2499
    //   2491: ldc2_w 1381391450
    //   2494: l2i
    //   2495: ldc_w -1765359255
    //   2498: ixor
    //   2499: ldc2_w -573522790
    //   2502: l2i
    //   2503: ldc_w -43488331
    //   2506: ixor
    //   2507: ixor
    //   2508: lookupswitch default -> 2536, -1370415585 -> 3648, -379837288 -> 2491
    //   2536: goto -> 2540
    //   2539: athrow
    //   2540: invokeinterface next : ()Ljava/lang/Object;
    //   2545: goto -> 2549
    //   2548: athrow
    //   2549: checkcast bigname/zprestige/webhack/features/setting/Setting
    //   2552: getstatic Perryc.c : I
    //   2555: iflt -> 2569
    //   2558: ldc2_w 1118586875
    //   2561: l2i
    //   2562: ldc_w 552034015
    //   2565: ixor
    //   2566: goto -> 2577
    //   2569: ldc2_w -2117640227
    //   2572: l2i
    //   2573: ldc_w 1042379367
    //   2576: ixor
    //   2577: ldc2_w -807459717
    //   2580: l2i
    //   2581: ldc_w -568535135
    //   2584: ixor
    //   2585: ixor
    //   2586: lookupswitch default -> 2612, 752665839 -> 2569, 1938352894 -> 3608
    //   2612: astore #8
    //   2614: getstatic Perryc.0 : I
    //   2617: ifle -> 2631
    //   2620: ldc2_w -1268681687
    //   2623: l2i
    //   2624: ldc_w -801647014
    //   2627: ixor
    //   2628: goto -> 2639
    //   2631: ldc2_w -1091399491
    //   2634: l2i
    //   2635: ldc_w -2268212
    //   2638: ixor
    //   2639: ldc2_w -118041553
    //   2642: l2i
    //   2643: ldc_w -1856384436
    //   2646: ixor
    //   2647: ixor
    //   2648: lookupswitch default -> 2676, 234464272 -> 3652, 1605414342 -> 2631
    //   2676: aload #4
    //   2678: getstatic Perryc.c : I
    //   2681: iflt -> 2695
    //   2684: ldc2_w -1245341708
    //   2687: l2i
    //   2688: ldc_w 2118425823
    //   2691: ixor
    //   2692: goto -> 2703
    //   2695: ldc2_w -29333996
    //   2698: l2i
    //   2699: ldc_w 1648000791
    //   2702: ixor
    //   2703: ldc2_w -429992217
    //   2706: l2i
    //   2707: ldc_w -596789357
    //   2710: ixor
    //   2711: ixor
    //   2712: lookupswitch default -> 3690, -1505134473 -> 2740, -239965601 -> 2695
    //   2740: aload #8
    //   2742: getstatic Perryc.0 : I
    //   2745: ifle -> 2759
    //   2748: ldc2_w -378058720
    //   2751: l2i
    //   2752: ldc_w -776161638
    //   2755: ixor
    //   2756: goto -> 2767
    //   2759: ldc2_w -544066596
    //   2762: l2i
    //   2763: ldc_w -1967198943
    //   2766: ixor
    //   2767: ldc2_w 1985303139
    //   2770: l2i
    //   2771: ldc_w 487253802
    //   2774: ixor
    //   2775: ixor
    //   2776: lookupswitch default -> 2804, 659674009 -> 2759, 1402227699 -> 3658
    //   2804: goto -> 2808
    //   2807: athrow
    //   2808: invokevirtual getName : ()Ljava/lang/String;
    //   2811: goto -> 2815
    //   2814: athrow
    //   2815: getstatic Perryc.1 : I
    //   2818: ifeq -> 2832
    //   2821: ldc2_w 1891117245
    //   2824: l2i
    //   2825: ldc_w -1014922268
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -1664374340
    //   2835: l2i
    //   2836: ldc_w -2025175848
    //   2839: ixor
    //   2840: ldc2_w -1107858818
    //   2843: l2i
    //   2844: ldc_w -1643904512
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 3624, -1865759961 -> 2832, 947029274 -> 2876
    //   2876: goto -> 2880
    //   2879: athrow
    //   2880: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2883: goto -> 2887
    //   2886: athrow
    //   2887: ifeq -> 2901
    //   2890: ldc2_w 969449513
    //   2893: l2i
    //   2894: ldc_w -174111304
    //   2897: ixor
    //   2898: goto -> 2909
    //   2901: ldc2_w -699543078
    //   2904: l2i
    //   2905: ldc_w 437924938
    //   2908: ixor
    //   2909: ldc2_w 970996730
    //   2912: l2i
    //   2913: ldc_w -1173044885
    //   2916: ixor
    //   2917: ixor
    //   2918: tableswitch default -> 2890, 1336090368 -> 2940, 1336090369 -> 3474
    //   2940: getstatic Perryc.c : I
    //   2943: iflt -> 2957
    //   2946: ldc2_w -383170596
    //   2949: l2i
    //   2950: ldc_w 1559912972
    //   2953: ixor
    //   2954: goto -> 2965
    //   2957: ldc2_w -1062590747
    //   2960: l2i
    //   2961: ldc_w -1352741812
    //   2964: ixor
    //   2965: ldc2_w 1066906479
    //   2968: l2i
    //   2969: ldc_w 818774452
    //   2972: ixor
    //   2973: ixor
    //   2974: lookupswitch default -> 3650, -1165420789 -> 2957, 1622071410 -> 3000
    //   3000: aload_1
    //   3001: getstatic Perryc.c : I
    //   3004: iflt -> 3018
    //   3007: ldc2_w -2042487159
    //   3010: l2i
    //   3011: ldc_w 275303214
    //   3014: ixor
    //   3015: goto -> 3026
    //   3018: ldc2_w 1985324921
    //   3021: l2i
    //   3022: ldc_w 1279665903
    //   3025: ixor
    //   3026: ldc2_w -1215232817
    //   3029: l2i
    //   3030: ldc_w 567861213
    //   3033: ixor
    //   3034: ixor
    //   3035: lookupswitch default -> 3060, 6491829 -> 3626, 1253710777 -> 3018
    //   3060: aload #8
    //   3062: getstatic Perryc.c : I
    //   3065: iflt -> 3079
    //   3068: ldc2_w 2056921873
    //   3071: l2i
    //   3072: ldc_w 1810047364
    //   3075: ixor
    //   3076: goto -> 3087
    //   3079: ldc2_w -1350313843
    //   3082: l2i
    //   3083: ldc_w -1764975027
    //   3086: ixor
    //   3087: ldc2_w 2109959364
    //   3090: l2i
    //   3091: ldc_w -1035901591
    //   3094: ixor
    //   3095: ixor
    //   3096: lookupswitch default -> 3124, -1596881470 -> 3079, -1359279304 -> 3680
    //   3124: aload #5
    //   3126: getstatic Perryc.c : I
    //   3129: iflt -> 3143
    //   3132: ldc2_w -1324336954
    //   3135: l2i
    //   3136: ldc_w -1675240990
    //   3139: ixor
    //   3140: goto -> 3151
    //   3143: ldc2_w -1699527095
    //   3146: l2i
    //   3147: ldc_w -1887884644
    //   3150: ixor
    //   3151: ldc2_w 296871769
    //   3154: l2i
    //   3155: ldc_w -1393158391
    //   3158: ixor
    //   3159: ixor
    //   3160: lookupswitch default -> 3188, -1871572620 -> 3596, 400199603 -> 3143
    //   3188: goto -> 3192
    //   3191: athrow
    //   3192: invokestatic setValueFromJson : (Lbigname/zprestige/webhack/features/Feature;Lbigname/zprestige/webhack/features/setting/Setting;Lcom/google/gson/JsonElement;)V
    //   3195: goto -> 3199
    //   3198: athrow
    //   3199: goto -> 3403
    //   3202: getstatic Perryc.c : I
    //   3205: iflt -> 3219
    //   3208: ldc2_w -943962005
    //   3211: l2i
    //   3212: ldc_w -72208156
    //   3215: ixor
    //   3216: goto -> 3227
    //   3219: ldc2_w -1400472036
    //   3222: l2i
    //   3223: ldc_w -1256600637
    //   3226: ixor
    //   3227: ldc2_w 883384915
    //   3230: l2i
    //   3231: ldc_w 2069955824
    //   3234: ixor
    //   3235: ixor
    //   3236: lookupswitch default -> 3264, 15718262 -> 3219, 1942494764 -> 3634
    //   3264: astore #9
    //   3266: getstatic Perryc.1 : I
    //   3269: ifeq -> 3283
    //   3272: ldc2_w 1365846174
    //   3275: l2i
    //   3276: ldc_w 103040541
    //   3279: ixor
    //   3280: goto -> 3291
    //   3283: ldc2_w 57551911
    //   3286: l2i
    //   3287: ldc_w -698099123
    //   3290: ixor
    //   3291: ldc2_w -664865800
    //   3294: l2i
    //   3295: ldc_w -145764940
    //   3298: ixor
    //   3299: ixor
    //   3300: lookupswitch default -> 3328, -647383235 -> 3283, 2019315919 -> 3646
    //   3328: aload #9
    //   3330: getstatic Perryc.1 : I
    //   3333: ifeq -> 3347
    //   3336: ldc2_w 137106349
    //   3339: l2i
    //   3340: ldc_w 1742310420
    //   3343: ixor
    //   3344: goto -> 3355
    //   3347: ldc2_w 219858161
    //   3350: l2i
    //   3351: ldc_w 1532075205
    //   3354: ixor
    //   3355: ldc2_w 1693703848
    //   3358: l2i
    //   3359: ldc_w 1307556515
    //   3362: ixor
    //   3363: ixor
    //   3364: lookupswitch default -> 3392, 19595152 -> 3347, 1189739442 -> 3678
    //   3392: goto -> 3396
    //   3395: athrow
    //   3396: invokevirtual printStackTrace : ()V
    //   3399: goto -> 3403
    //   3402: athrow
    //   3403: ldc2_w -255443565
    //   3406: l2i
    //   3407: ldc_w -255443566
    //   3410: ixor
    //   3411: getstatic Perryc.1 : I
    //   3414: ifeq -> 3428
    //   3417: ldc2_w 2108307164
    //   3420: l2i
    //   3421: ldc_w -2145697100
    //   3424: ixor
    //   3425: goto -> 3436
    //   3428: ldc2_w -299848117
    //   3431: l2i
    //   3432: ldc_w 45238501
    //   3435: ixor
    //   3436: ldc2_w -328501758
    //   3439: l2i
    //   3440: ldc_w -2019614307
    //   3443: ixor
    //   3444: ixor
    //   3445: lookupswitch default -> 3600, -2023313103 -> 3472, -1773853705 -> 3428
    //   3472: istore #6
    //   3474: goto -> 2218
    //   3477: getstatic Perryc.c : I
    //   3480: iflt -> 3494
    //   3483: ldc2_w 1919926217
    //   3486: l2i
    //   3487: ldc_w 2063961964
    //   3490: ixor
    //   3491: goto -> 3502
    //   3494: ldc2_w 1331240960
    //   3497: l2i
    //   3498: ldc_w -1689398609
    //   3501: ixor
    //   3502: ldc2_w 1649719524
    //   3505: l2i
    //   3506: ldc_w 817248008
    //   3509: ixor
    //   3510: ixor
    //   3511: lookupswitch default -> 3536, -211024157 -> 3494, 1535688521 -> 3664
    //   3536: iload #6
    //   3538: ifeq -> 3552
    //   3541: ldc2_w 69345779
    //   3544: l2i
    //   3545: ldc_w -700977189
    //   3548: ixor
    //   3549: goto -> 3560
    //   3552: ldc2_w -1749732024
    //   3555: l2i
    //   3556: ldc_w 1168178023
    //   3559: ixor
    //   3560: ldc2_w -2138220301
    //   3563: l2i
    //   3564: ldc_w -52348672
    //   3567: ixor
    //   3568: ixor
    //   3569: tableswitch default -> 3541, -1367756837 -> 3592, -1367756836 -> 3592
    //   3592: goto -> 289
    //   3595: return
    //   3596: aconst_null
    //   3597: athrow
    //   3598: aconst_null
    //   3599: athrow
    //   3600: aconst_null
    //   3601: athrow
    //   3602: aconst_null
    //   3603: athrow
    //   3604: aconst_null
    //   3605: athrow
    //   3606: aconst_null
    //   3607: athrow
    //   3608: aconst_null
    //   3609: athrow
    //   3610: aconst_null
    //   3611: athrow
    //   3612: aconst_null
    //   3613: athrow
    //   3614: aconst_null
    //   3615: athrow
    //   3616: aconst_null
    //   3617: athrow
    //   3618: aconst_null
    //   3619: athrow
    //   3620: aconst_null
    //   3621: athrow
    //   3622: aconst_null
    //   3623: athrow
    //   3624: aconst_null
    //   3625: athrow
    //   3626: aconst_null
    //   3627: athrow
    //   3628: aconst_null
    //   3629: athrow
    //   3630: aconst_null
    //   3631: athrow
    //   3632: aconst_null
    //   3633: athrow
    //   3634: aconst_null
    //   3635: athrow
    //   3636: aconst_null
    //   3637: athrow
    //   3638: aconst_null
    //   3639: athrow
    //   3640: aconst_null
    //   3641: athrow
    //   3642: aconst_null
    //   3643: athrow
    //   3644: aconst_null
    //   3645: athrow
    //   3646: aconst_null
    //   3647: athrow
    //   3648: aconst_null
    //   3649: athrow
    //   3650: aconst_null
    //   3651: athrow
    //   3652: aconst_null
    //   3653: athrow
    //   3654: aconst_null
    //   3655: athrow
    //   3656: aconst_null
    //   3657: athrow
    //   3658: aconst_null
    //   3659: athrow
    //   3660: aconst_null
    //   3661: athrow
    //   3662: aconst_null
    //   3663: athrow
    //   3664: aconst_null
    //   3665: athrow
    //   3666: aconst_null
    //   3667: athrow
    //   3668: aconst_null
    //   3669: athrow
    //   3670: aconst_null
    //   3671: athrow
    //   3672: aconst_null
    //   3673: athrow
    //   3674: aconst_null
    //   3675: athrow
    //   3676: aconst_null
    //   3677: athrow
    //   3678: aconst_null
    //   3679: athrow
    //   3680: aconst_null
    //   3681: athrow
    //   3682: aconst_null
    //   3683: athrow
    //   3684: aconst_null
    //   3685: athrow
    //   3686: aconst_null
    //   3687: athrow
    //   3688: aconst_null
    //   3689: athrow
    //   3690: aconst_null
    //   3691: athrow
    //   3692: aconst_null
    //   3693: athrow
    //   3694: pop
    //   3695: goto -> 24
    //   3698: pop
    //   3699: aconst_null
    //   3700: goto -> 3694
    //   3703: dup
    //   3704: ifnull -> 3694
    //   3707: checkcast java/lang/Throwable
    //   3710: athrow
    //   3711: dup
    //   3712: ifnull -> 3698
    //   3715: checkcast java/lang/Throwable
    //   3718: athrow
    //   3719: aconst_null
    //   3720: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1738	137	6	e	Ljava/lang/Exception;
    //   3266	137	9	e	Ljava/lang/Exception;
    //   2614	860	8	setting	Lbigname/zprestige/webhack/features/setting/Setting;
    //   870	2722	4	settingName	Ljava/lang/String;
    //   1070	2522	5	element	Lcom/google/gson/JsonElement;
    //   1950	1642	6	settingFound	Z
    //   673	2919	3	entry	Ljava/util/Map$Entry;
    //   24	3572	0	input	Lcom/google/gson/JsonObject;
    //   24	3572	1	feature	Lbigname/zprestige/webhack/features/Feature;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   673	2919	3	entry	Ljava/util/Map$Entry<Ljava/lang/String;Lcom/google/gson/JsonElement;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	3703	java/lang/NegativeArraySizeException
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	java/util/NoSuchElementException
    //   148	154	154	finally
    //   148	154	154	finally
    //   219	228	228	finally
    //   219	228	3	java/util/NoSuchElementException
    //   219	228	3	java/lang/ArrayIndexOutOfBoundsException
    //   219	228	219	java/lang/IndexOutOfBoundsException
    //   220	228	3	finally
    //   412	420	420	finally
    //   412	420	420	java/lang/ArrayIndexOutOfBoundsException
    //   412	420	3	java/lang/AssertionError
    //   412	420	3	java/lang/EnumConstantNotPresentException
    //   412	420	3	java/lang/EnumConstantNotPresentException
    //   599	608	608	finally
    //   599	608	599	java/lang/ArithmeticException
    //   599	608	599	java/lang/AssertionError
    //   600	608	3	finally
    //   600	608	3	finally
    //   795	804	804	finally
    //   795	804	3	finally
    //   795	804	795	finally
    //   796	804	804	java/lang/EnumConstantNotPresentException
    //   796	804	795	java/util/ConcurrentModificationException
    //   996	1004	1004	finally
    //   996	1004	1004	finally
    //   996	1004	3	finally
    //   996	1004	3	java/lang/IllegalArgumentException
    //   996	1004	3	finally
    //   1188	1383	1674	java/lang/Exception
    //   1384	1390	1390	finally
    //   1384	1390	1390	finally
    //   1384	1390	3	finally
    //   1384	1390	1390	finally
    //   1384	1390	1390	java/util/ConcurrentModificationException
    //   1384	1671	1674	java/lang/Exception
    //   1519	1526	1526	finally
    //   1519	1526	1526	java/lang/AssertionError
    //   1519	1526	1519	finally
    //   1519	1526	1526	finally
    //   1520	1526	1526	finally
    //   1591	1598	1598	finally
    //   1591	1598	1591	finally
    //   1591	1598	3	java/lang/ClassCastException
    //   1591	1598	3	finally
    //   1592	1598	1591	finally
    //   1663	1670	1670	finally
    //   1663	1670	1670	java/lang/IllegalStateException
    //   1663	1670	1663	finally
    //   1664	1670	1670	java/lang/ArrayIndexOutOfBoundsException
    //   1664	1670	1670	finally
    //   1867	1874	1874	finally
    //   1867	1874	1867	finally
    //   1867	1874	1867	java/lang/EnumConstantNotPresentException
    //   1868	1874	3	finally
    //   1868	1874	1874	java/lang/NumberFormatException
    //   2075	2082	2082	finally
    //   2075	2082	3	java/lang/IllegalArgumentException
    //   2075	2082	2082	finally
    //   2076	2082	2075	java/lang/NegativeArraySizeException
    //   2076	2082	2075	finally
    //   2147	2156	2156	finally
    //   2147	2156	2147	finally
    //   2147	2156	3	finally
    //   2147	2156	3	finally
    //   2148	2156	3	java/lang/StringIndexOutOfBoundsException
    //   2347	2356	2356	finally
    //   2347	2356	2356	finally
    //   2347	2356	2347	finally
    //   2347	2356	3	java/util/NoSuchElementException
    //   2348	2356	3	java/lang/IndexOutOfBoundsException
    //   2540	2548	2548	finally
    //   2540	2548	2548	finally
    //   2540	2548	2548	java/util/NoSuchElementException
    //   2540	2548	2548	finally
    //   2540	2548	3	finally
    //   2807	2814	2814	finally
    //   2807	2814	3	finally
    //   2807	2814	2814	java/lang/IllegalArgumentException
    //   2808	2814	2814	java/lang/ClassCastException
    //   2808	2814	2807	finally
    //   2879	2886	2886	finally
    //   2879	2886	2886	java/lang/IndexOutOfBoundsException
    //   2879	2886	2886	java/util/ConcurrentModificationException
    //   2880	2886	2879	java/lang/AssertionError
    //   2880	2886	2879	finally
    //   2940	3199	3202	java/lang/Exception
    //   3191	3198	3198	finally
    //   3192	3198	3191	finally
    //   3192	3198	3198	java/lang/UnsupportedOperationException
    //   3192	3198	3198	java/lang/UnsupportedOperationException
    //   3192	3198	3	finally
    //   3396	3402	3402	finally
    //   3396	3402	3	java/lang/AssertionError
    //   3396	3402	3	finally
    //   3396	3402	3	java/lang/NegativeArraySizeException
    //   3396	3402	3402	java/lang/IllegalArgumentException
    //   3703	3711	3703	finally
    //   3719	3721	3	finally
  }
  
  public boolean configExists(String name) {
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
  
  public void saveCurrentConfig() {
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
  
  public String getDirectory(Feature feature) {
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
  
  public void loadSettings(Feature feature) {
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
  
  public void saveSettings(Feature feature) {
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
  
  public String loadCurrentConfig() {
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
  
  public void loadConfig(String name) {
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
  
  public void init() {
    Perry1.3J(this, (int)-1857721463L ^ 0xD66BDA8C);
  }
  
  public ConfigManager() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -878593736
    //   9: l2i
    //   10: ldc_w -1942780597
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1260999315
    //   20: l2i
    //   21: ldc_w -421923237
    //   24: ixor
    //   25: ldc2_w -1441610906
    //   28: l2i
    //   29: ldc_w 1037639038
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 522, -976976594 -> 60, -799415701 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -1786130751
    //   70: l2i
    //   71: ldc_w 986624033
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 597632623
    //   81: l2i
    //   82: ldc_w -146948937
    //   85: ixor
    //   86: ldc2_w 1164192366
    //   89: l2i
    //   90: ldc_w 247666897
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 514, -1627019161 -> 120, -455062433 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w 614050829
    //   132: l2i
    //   133: ldc_w -908539559
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 43044642
    //   143: l2i
    //   144: ldc_w -1466511106
    //   147: ixor
    //   148: ldc2_w -522405181
    //   151: l2i
    //   152: ldc_w -323055476
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 510, -1503382125 -> 184, -517779685 -> 140
    //   184: aload_0
    //   185: new java/util/ArrayList
    //   188: dup
    //   189: getstatic Perryc.1 : I
    //   192: ifeq -> 206
    //   195: ldc2_w 1416069873
    //   198: l2i
    //   199: ldc_w 1387217770
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w 1387853723
    //   209: l2i
    //   210: ldc_w 435860494
    //   213: ixor
    //   214: ldc2_w -1442934987
    //   217: l2i
    //   218: ldc_w -2145138158
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 248, -1614813997 -> 206, 789939388 -> 518
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 268
    //   257: ldc2_w 1360837694
    //   260: l2i
    //   261: ldc_w -1685075645
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w 2144070841
    //   271: l2i
    //   272: ldc_w 1714432317
    //   275: ixor
    //   276: ldc2_w -1100545041
    //   279: l2i
    //   280: ldc_w 2009555389
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 516, -799299626 -> 312, 53679919 -> 268
    //   312: putfield features : Ljava/util/ArrayList;
    //   315: getstatic Perryc.1 : I
    //   318: ifeq -> 332
    //   321: ldc2_w 826997940
    //   324: l2i
    //   325: ldc_w 918552383
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w -1828018034
    //   335: l2i
    //   336: ldc_w 1373700874
    //   339: ixor
    //   340: ldc2_w 2009973577
    //   343: l2i
    //   344: ldc_w -905645992
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 520, -1170460518 -> 332, 2132973717 -> 376
    //   376: aload_0
    //   377: ldc_w '។㌖ឳ㶟ꍙ樂๲樹蹠ﾩ꼶ਡ?煦笟'
    //   380: getstatic Perryc.c : I
    //   383: iflt -> 397
    //   386: ldc2_w 591181059
    //   389: l2i
    //   390: ldc_w 1704965024
    //   393: ixor
    //   394: goto -> 405
    //   397: ldc2_w -1111440432
    //   400: l2i
    //   401: ldc_w 1266215965
    //   404: ixor
    //   405: ldc2_w -1892705530
    //   408: l2i
    //   409: ldc_w -1043756931
    //   412: ixor
    //   413: ixor
    //   414: lookupswitch default -> 508, -1201783626 -> 440, 138745304 -> 397
    //   440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   443: getstatic Perryc.0 : I
    //   446: ifle -> 460
    //   449: ldc2_w 1075486642
    //   452: l2i
    //   453: ldc_w -494008154
    //   456: ixor
    //   457: goto -> 468
    //   460: ldc2_w 1159038913
    //   463: l2i
    //   464: ldc_w 760474643
    //   467: ixor
    //   468: ldc2_w -778863500
    //   471: l2i
    //   472: ldc_w -759457959
    //   475: ixor
    //   476: ixor
    //   477: lookupswitch default -> 504, -1581482951 -> 512, -146242335 -> 460
    //   504: putfield config : Ljava/lang/String;
    //   507: return
    //   508: aconst_null
    //   509: athrow
    //   510: aconst_null
    //   511: athrow
    //   512: aconst_null
    //   513: athrow
    //   514: aconst_null
    //   515: athrow
    //   516: aconst_null
    //   517: athrow
    //   518: aconst_null
    //   519: athrow
    //   520: aconst_null
    //   521: athrow
    //   522: aconst_null
    //   523: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	508	0	this	Lbigname/zprestige/webhack/manager/ConfigManager;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void saveConfig(String name) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2641
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2633
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2625
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -586036260
    //   33: l2i
    //   34: ldc_w -1396188865
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1651340142
    //   44: l2i
    //   45: ldc_w -848836849
    //   48: ixor
    //   49: ldc2_w 870975626
    //   52: l2i
    //   53: ldc_w 920222179
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 162133412 -> 41, 1961190282 -> 2550
    //   84: aload_0
    //   85: new java/lang/StringBuilder
    //   88: dup
    //   89: getstatic Perryc.1 : I
    //   92: ifeq -> 106
    //   95: ldc2_w -637944077
    //   98: l2i
    //   99: ldc_w -516056851
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -548454971
    //   109: l2i
    //   110: ldc_w 1429477846
    //   113: ixor
    //   114: ldc2_w 1883705110
    //   117: l2i
    //   118: ldc_w -121721640
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 2608, -1338145328 -> 106, 42108893 -> 148
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : ()V
    //   155: goto -> 159
    //   158: athrow
    //   159: ldc_w '។㌖ឳ惲ߪ樂๲樹'
    //   162: getstatic Perryc.0 : I
    //   165: ifle -> 179
    //   168: ldc2_w 151220156
    //   171: l2i
    //   172: ldc_w 2141025570
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -1536601494
    //   182: l2i
    //   183: ldc_w -760517303
    //   186: ixor
    //   187: ldc2_w 1588300640
    //   190: l2i
    //   191: ldc_w -1441877160
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -2110053722 -> 2604, -2093279304 -> 179
    //   224: goto -> 228
    //   227: athrow
    //   228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   231: goto -> 235
    //   234: athrow
    //   235: getstatic Perryc.0 : I
    //   238: ifle -> 252
    //   241: ldc2_w -282206125
    //   244: l2i
    //   245: ldc_w 326783021
    //   248: ixor
    //   249: goto -> 260
    //   252: ldc2_w -455542281
    //   255: l2i
    //   256: ldc_w -590817508
    //   259: ixor
    //   260: ldc2_w 1402911475
    //   263: l2i
    //   264: ldc_w 2067395393
    //   267: ixor
    //   268: ixor
    //   269: lookupswitch default -> 2564, -722404916 -> 252, 280455001 -> 296
    //   296: goto -> 300
    //   299: athrow
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: goto -> 307
    //   306: athrow
    //   307: getstatic Perryc.0 : I
    //   310: ifle -> 324
    //   313: ldc2_w 249764304
    //   316: l2i
    //   317: ldc_w 172772179
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 1708727147
    //   327: l2i
    //   328: ldc_w -418587700
    //   331: ixor
    //   332: ldc2_w 869710596
    //   335: l2i
    //   336: ldc_w 430012950
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 368, -110175320 -> 324, 785945489 -> 2592
    //   368: aload_1
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -1435310515
    //   378: l2i
    //   379: ldc_w -1072675317
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 747800153
    //   389: l2i
    //   390: ldc_w 1839971684
    //   393: ixor
    //   394: ldc2_w -1213948039
    //   397: l2i
    //   398: ldc_w -474467438
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 2576, 354785238 -> 428, 1048448173 -> 386
    //   428: goto -> 432
    //   431: athrow
    //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: goto -> 439
    //   438: athrow
    //   439: ldc_w '/'
    //   442: getstatic Perryc.0 : I
    //   445: ifle -> 459
    //   448: ldc2_w 166238034
    //   451: l2i
    //   452: ldc_w 332133482
    //   455: ixor
    //   456: goto -> 467
    //   459: ldc2_w -284254391
    //   462: l2i
    //   463: ldc_w 1014274317
    //   466: ixor
    //   467: ldc2_w 106571463
    //   470: l2i
    //   471: ldc_w -606922267
    //   474: ixor
    //   475: ixor
    //   476: lookupswitch default -> 2612, -945136614 -> 459, 250820966 -> 504
    //   504: goto -> 508
    //   507: athrow
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: goto -> 515
    //   514: athrow
    //   515: getstatic Perryc.c : I
    //   518: iflt -> 532
    //   521: ldc2_w 1835747715
    //   524: l2i
    //   525: ldc_w -1205358670
    //   528: ixor
    //   529: goto -> 540
    //   532: ldc2_w -130681690
    //   535: l2i
    //   536: ldc_w -404544607
    //   539: ixor
    //   540: ldc2_w 86097782
    //   543: l2i
    //   544: ldc_w 1124143915
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 2602, -1821619604 -> 532, 1509325658 -> 576
    //   576: goto -> 580
    //   579: athrow
    //   580: invokevirtual toString : ()Ljava/lang/String;
    //   583: goto -> 587
    //   586: athrow
    //   587: getstatic Perryc.0 : I
    //   590: ifle -> 604
    //   593: ldc2_w -130845865
    //   596: l2i
    //   597: ldc_w 92944306
    //   600: ixor
    //   601: goto -> 612
    //   604: ldc2_w 1331623998
    //   607: l2i
    //   608: ldc_w -1938456829
    //   611: ixor
    //   612: ldc2_w 1120676365
    //   615: l2i
    //   616: ldc_w -744988370
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 2582, 1384107038 -> 648, 1827475398 -> 604
    //   648: putfield config : Ljava/lang/String;
    //   651: new java/io/File
    //   654: dup
    //   655: getstatic Perryc.0 : I
    //   658: ifle -> 672
    //   661: ldc2_w 268691258
    //   664: l2i
    //   665: ldc_w -1829157943
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w -1905295672
    //   675: l2i
    //   676: ldc_w -1706742933
    //   679: ixor
    //   680: ldc2_w 172963825
    //   683: l2i
    //   684: ldc_w 148865525
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 716, -2140531977 -> 2558, -1321476724 -> 672
    //   716: aload_0
    //   717: getstatic Perryc.c : I
    //   720: iflt -> 734
    //   723: ldc2_w 479151414
    //   726: l2i
    //   727: ldc_w 1130797630
    //   730: ixor
    //   731: goto -> 742
    //   734: ldc2_w -637712628
    //   737: l2i
    //   738: ldc_w -228998754
    //   741: ixor
    //   742: ldc2_w -1014232267
    //   745: l2i
    //   746: ldc_w -1315035525
    //   749: ixor
    //   750: ixor
    //   751: lookupswitch default -> 2594, 771486278 -> 734, 1505143772 -> 776
    //   776: getfield config : Ljava/lang/String;
    //   779: getstatic Perryc.c : I
    //   782: iflt -> 796
    //   785: ldc2_w -2000178330
    //   788: l2i
    //   789: ldc_w 2045423343
    //   792: ixor
    //   793: goto -> 804
    //   796: ldc2_w -377396197
    //   799: l2i
    //   800: ldc_w 1784953220
    //   803: ixor
    //   804: ldc2_w 455177498
    //   807: l2i
    //   808: ldc_w -794133586
    //   811: ixor
    //   812: ixor
    //   813: lookupswitch default -> 2586, 983962429 -> 796, 1215189803 -> 840
    //   840: goto -> 844
    //   843: athrow
    //   844: invokespecial <init> : (Ljava/lang/String;)V
    //   847: goto -> 851
    //   850: athrow
    //   851: getstatic Perryc.1 : I
    //   854: ifeq -> 868
    //   857: ldc2_w 619913887
    //   860: l2i
    //   861: ldc_w 1408390460
    //   864: ixor
    //   865: goto -> 876
    //   868: ldc2_w 14744239
    //   871: l2i
    //   872: ldc_w -553468360
    //   875: ixor
    //   876: ldc2_w 1537497059
    //   879: l2i
    //   880: ldc_w -590212157
    //   883: ixor
    //   884: ixor
    //   885: lookupswitch default -> 2544, -260623485 -> 868, 1486094519 -> 912
    //   912: astore_2
    //   913: getstatic Perryc.1 : I
    //   916: ifeq -> 930
    //   919: ldc2_w 384762536
    //   922: l2i
    //   923: ldc_w -429938566
    //   926: ixor
    //   927: goto -> 938
    //   930: ldc2_w -954639423
    //   933: l2i
    //   934: ldc_w -542637875
    //   937: ixor
    //   938: ldc2_w 344679355
    //   941: l2i
    //   942: ldc_w -441992708
    //   945: ixor
    //   946: ixor
    //   947: lookupswitch default -> 2596, -375553717 -> 972, 27029653 -> 930
    //   972: aload_2
    //   973: getstatic Perryc.1 : I
    //   976: ifeq -> 990
    //   979: ldc2_w -1482726007
    //   982: l2i
    //   983: ldc_w 499361910
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w 259377918
    //   993: l2i
    //   994: ldc_w -1534365617
    //   997: ixor
    //   998: ldc2_w -1053583748
    //   1001: l2i
    //   1002: ldc_w -706159461
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 1032, -1562733217 -> 990, -1366849768 -> 2606
    //   1032: goto -> 1036
    //   1035: athrow
    //   1036: invokevirtual exists : ()Z
    //   1039: goto -> 1043
    //   1042: athrow
    //   1043: ifne -> 1057
    //   1046: ldc2_w -910198401
    //   1049: l2i
    //   1050: ldc_w -714025795
    //   1053: ixor
    //   1054: goto -> 1065
    //   1057: ldc2_w -713548400
    //   1060: l2i
    //   1061: ldc_w -910708653
    //   1064: ixor
    //   1065: ldc2_w 1535655186
    //   1068: l2i
    //   1069: ldc_w -1075805490
    //   1072: ixor
    //   1073: ixor
    //   1074: tableswitch default -> 1046, -123268578 -> 1096, -123268577 -> 1228
    //   1096: getstatic Perryc.c : I
    //   1099: iflt -> 1113
    //   1102: ldc2_w 897325984
    //   1105: l2i
    //   1106: ldc_w 8381072
    //   1109: ixor
    //   1110: goto -> 1121
    //   1113: ldc2_w 880127485
    //   1116: l2i
    //   1117: ldc_w 1345175498
    //   1120: ixor
    //   1121: ldc2_w 1170163057
    //   1124: l2i
    //   1125: ldc_w -1066927678
    //   1128: ixor
    //   1129: ixor
    //   1130: lookupswitch default -> 2552, -1327807101 -> 1113, -511660412 -> 1156
    //   1156: aload_2
    //   1157: getstatic Perryc.1 : I
    //   1160: ifeq -> 1174
    //   1163: ldc2_w 1214931457
    //   1166: l2i
    //   1167: ldc_w -1838325182
    //   1170: ixor
    //   1171: goto -> 1182
    //   1174: ldc2_w -1115382025
    //   1177: l2i
    //   1178: ldc_w -1871658045
    //   1181: ixor
    //   1182: ldc2_w 1005647073
    //   1185: l2i
    //   1186: ldc_w -1552736329
    //   1189: ixor
    //   1190: ixor
    //   1191: lookupswitch default -> 2590, -1250445726 -> 1216, 1116007189 -> 1174
    //   1216: goto -> 1220
    //   1219: athrow
    //   1220: invokevirtual mkdir : ()Z
    //   1223: goto -> 1227
    //   1226: athrow
    //   1227: pop
    //   1228: getstatic Perryc.1 : I
    //   1231: ifeq -> 1245
    //   1234: ldc2_w -552740702
    //   1237: l2i
    //   1238: ldc_w 1190076892
    //   1241: ixor
    //   1242: goto -> 1253
    //   1245: ldc2_w 1039490710
    //   1248: l2i
    //   1249: ldc_w -1739931045
    //   1252: ixor
    //   1253: ldc2_w -976838489
    //   1256: l2i
    //   1257: ldc_w -188851293
    //   1260: ixor
    //   1261: ixor
    //   1262: lookupswitch default -> 2554, -1798871095 -> 1288, -1466301830 -> 1245
    //   1288: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w -1272980308
    //   1300: l2i
    //   1301: ldc_w 2141937875
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w 48001245
    //   1311: l2i
    //   1312: ldc_w 1356606474
    //   1315: ixor
    //   1316: ldc2_w -302608984
    //   1319: l2i
    //   1320: ldc_w -395249361
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -835532552 -> 2556, 932284577 -> 1308
    //   1352: goto -> 1356
    //   1355: athrow
    //   1356: invokevirtual saveFriends : ()V
    //   1359: goto -> 1363
    //   1362: athrow
    //   1363: getstatic Perryc.1 : I
    //   1366: ifeq -> 1380
    //   1369: ldc2_w -1598507907
    //   1372: l2i
    //   1373: ldc_w 1359728711
    //   1376: ixor
    //   1377: goto -> 1388
    //   1380: ldc2_w -1827935026
    //   1383: l2i
    //   1384: ldc_w 283076659
    //   1387: ixor
    //   1388: ldc2_w -1737618154
    //   1391: l2i
    //   1392: ldc_w 1817593926
    //   1395: ixor
    //   1396: ixor
    //   1397: lookupswitch default -> 1424, 93004138 -> 2572, 1237013837 -> 1380
    //   1424: aload_0
    //   1425: getstatic Perryc.1 : I
    //   1428: ifeq -> 1442
    //   1431: ldc2_w 1277858393
    //   1434: l2i
    //   1435: ldc_w -948993828
    //   1438: ixor
    //   1439: goto -> 1450
    //   1442: ldc2_w 1579807361
    //   1445: l2i
    //   1446: ldc_w 770201080
    //   1449: ixor
    //   1450: ldc2_w -1354269503
    //   1453: l2i
    //   1454: ldc_w 1289437089
    //   1457: ixor
    //   1458: ixor
    //   1459: lookupswitch default -> 2548, -1872894951 -> 1484, 1759072741 -> 1442
    //   1484: getfield features : Ljava/util/ArrayList;
    //   1487: getstatic Perryc.c : I
    //   1490: iflt -> 1504
    //   1493: ldc2_w 2041996842
    //   1496: l2i
    //   1497: ldc_w 1195929834
    //   1500: ixor
    //   1501: goto -> 1512
    //   1504: ldc2_w -2039238366
    //   1507: l2i
    //   1508: ldc_w 1071668807
    //   1511: ixor
    //   1512: ldc2_w -731910647
    //   1515: l2i
    //   1516: ldc_w -1405065185
    //   1519: ixor
    //   1520: ixor
    //   1521: lookupswitch default -> 1548, 1189187798 -> 2588, 2067931432 -> 1504
    //   1548: goto -> 1552
    //   1551: athrow
    //   1552: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1555: goto -> 1559
    //   1558: athrow
    //   1559: getstatic Perryc.c : I
    //   1562: iflt -> 1576
    //   1565: ldc2_w 119374440
    //   1568: l2i
    //   1569: ldc_w 45022444
    //   1572: ixor
    //   1573: goto -> 1584
    //   1576: ldc2_w -1623472596
    //   1579: l2i
    //   1580: ldc_w -1277606513
    //   1583: ixor
    //   1584: ldc2_w 851030521
    //   1587: l2i
    //   1588: ldc_w 1918380486
    //   1591: ixor
    //   1592: ixor
    //   1593: lookupswitch default -> 2566, 1163060923 -> 1576, 1812143004 -> 1620
    //   1620: astore_3
    //   1621: getstatic Perryc.0 : I
    //   1624: ifle -> 1638
    //   1627: ldc2_w -1931577432
    //   1630: l2i
    //   1631: ldc_w -477332585
    //   1634: ixor
    //   1635: goto -> 1646
    //   1638: ldc2_w -1344993109
    //   1641: l2i
    //   1642: ldc_w -63464857
    //   1645: ixor
    //   1646: ldc2_w -1587307333
    //   1649: l2i
    //   1650: ldc_w 441457930
    //   1653: ixor
    //   1654: ixor
    //   1655: lookupswitch default -> 1680, -731804274 -> 2560, 1739315112 -> 1638
    //   1680: aload_3
    //   1681: getstatic Perryc.0 : I
    //   1684: ifle -> 1698
    //   1687: ldc2_w 818198630
    //   1690: l2i
    //   1691: ldc_w -850532021
    //   1694: ixor
    //   1695: goto -> 1706
    //   1698: ldc2_w -1126788299
    //   1701: l2i
    //   1702: ldc_w -1033770633
    //   1705: ixor
    //   1706: ldc2_w -744202669
    //   1709: l2i
    //   1710: ldc_w -507394821
    //   1713: ixor
    //   1714: ixor
    //   1715: lookupswitch default -> 1740, -806564987 -> 2610, 137750222 -> 1698
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokeinterface hasNext : ()Z
    //   1749: goto -> 1753
    //   1752: athrow
    //   1753: ifeq -> 1767
    //   1756: ldc2_w -949553775
    //   1759: l2i
    //   1760: ldc_w -428745024
    //   1763: ixor
    //   1764: goto -> 1775
    //   1767: ldc2_w 2082529392
    //   1770: l2i
    //   1771: ldc_w 1563937568
    //   1774: ixor
    //   1775: ldc2_w 1889497448
    //   1778: l2i
    //   1779: ldc_w -1029386887
    //   1782: ixor
    //   1783: ixor
    //   1784: tableswitch default -> 1756, -1825794240 -> 1808, -1825794239 -> 2410
    //   1808: getstatic Perryc.c : I
    //   1811: iflt -> 1825
    //   1814: ldc2_w 1683440690
    //   1817: l2i
    //   1818: ldc_w 899393542
    //   1821: ixor
    //   1822: goto -> 1833
    //   1825: ldc2_w -1408949031
    //   1828: l2i
    //   1829: ldc_w -1131376392
    //   1832: ixor
    //   1833: ldc2_w -973684235
    //   1836: l2i
    //   1837: ldc_w 743825425
    //   1840: ixor
    //   1841: ixor
    //   1842: lookupswitch default -> 1868, -1200632368 -> 2614, 535899004 -> 1825
    //   1868: aload_3
    //   1869: getstatic Perryc.c : I
    //   1872: iflt -> 1886
    //   1875: ldc2_w 593520174
    //   1878: l2i
    //   1879: ldc_w 807220807
    //   1882: ixor
    //   1883: goto -> 1894
    //   1886: ldc2_w 2006211646
    //   1889: l2i
    //   1890: ldc_w -748100923
    //   1893: ixor
    //   1894: ldc2_w 2140062217
    //   1897: l2i
    //   1898: ldc_w -1319675584
    //   1901: ixor
    //   1902: ixor
    //   1903: lookupswitch default -> 2570, -576402656 -> 1886, 1780819378 -> 1928
    //   1928: goto -> 1932
    //   1931: athrow
    //   1932: invokeinterface next : ()Ljava/lang/Object;
    //   1937: goto -> 1941
    //   1940: athrow
    //   1941: checkcast bigname/zprestige/webhack/features/Feature
    //   1944: getstatic Perryc.c : I
    //   1947: iflt -> 1961
    //   1950: ldc2_w -457314906
    //   1953: l2i
    //   1954: ldc_w 313989195
    //   1957: ixor
    //   1958: goto -> 1969
    //   1961: ldc2_w 2020998314
    //   1964: l2i
    //   1965: ldc_w 521633830
    //   1968: ixor
    //   1969: ldc2_w -894177706
    //   1972: l2i
    //   1973: ldc_w 1405587412
    //   1976: ixor
    //   1977: ixor
    //   1978: lookupswitch default -> 2004, -1068244049 -> 1961, 1870566511 -> 2578
    //   2004: astore #4
    //   2006: getstatic Perryc.1 : I
    //   2009: ifeq -> 2023
    //   2012: ldc2_w -652996656
    //   2015: l2i
    //   2016: ldc_w -1440382784
    //   2019: ixor
    //   2020: goto -> 2031
    //   2023: ldc2_w -1754386217
    //   2026: l2i
    //   2027: ldc_w -824637154
    //   2030: ixor
    //   2031: ldc2_w 1504663631
    //   2034: l2i
    //   2035: ldc_w 2030997069
    //   2038: ixor
    //   2039: ixor
    //   2040: lookupswitch default -> 2574, 1401968914 -> 2023, 2031546315 -> 2068
    //   2068: aload_0
    //   2069: getstatic Perryc.1 : I
    //   2072: ifeq -> 2086
    //   2075: ldc2_w -620478383
    //   2078: l2i
    //   2079: ldc_w -236752607
    //   2082: ixor
    //   2083: goto -> 2094
    //   2086: ldc2_w 1190327432
    //   2089: l2i
    //   2090: ldc_w -378571067
    //   2093: ixor
    //   2094: ldc2_w -211179869
    //   2097: l2i
    //   2098: ldc_w -889954811
    //   2101: ixor
    //   2102: ixor
    //   2103: lookupswitch default -> 2128, 14498506 -> 2086, 326814166 -> 2568
    //   2128: aload #4
    //   2130: getstatic Perryc.c : I
    //   2133: iflt -> 2147
    //   2136: ldc2_w -1855787083
    //   2139: l2i
    //   2140: ldc_w 696330787
    //   2143: ixor
    //   2144: goto -> 2155
    //   2147: ldc2_w 2140842457
    //   2150: l2i
    //   2151: ldc_w 1830685992
    //   2154: ixor
    //   2155: ldc2_w -1232927304
    //   2158: l2i
    //   2159: ldc_w -1568961859
    //   2162: ixor
    //   2163: ixor
    //   2164: lookupswitch default -> 2192, -1407497581 -> 2584, 761704023 -> 2147
    //   2192: goto -> 2196
    //   2195: athrow
    //   2196: invokevirtual saveSettings : (Lbigname/zprestige/webhack/features/Feature;)V
    //   2199: goto -> 2203
    //   2202: athrow
    //   2203: goto -> 2407
    //   2206: getstatic Perryc.0 : I
    //   2209: ifle -> 2223
    //   2212: ldc2_w 1019622482
    //   2215: l2i
    //   2216: ldc_w 814229310
    //   2219: ixor
    //   2220: goto -> 2231
    //   2223: ldc2_w 1481206472
    //   2226: l2i
    //   2227: ldc_w -1334632280
    //   2230: ixor
    //   2231: ldc2_w 1537267250
    //   2234: l2i
    //   2235: ldc_w 1631795666
    //   2238: ixor
    //   2239: ixor
    //   2240: lookupswitch default -> 2600, -757488256 -> 2268, 917372044 -> 2223
    //   2268: astore #5
    //   2270: getstatic Perryc.c : I
    //   2273: iflt -> 2287
    //   2276: ldc2_w 2010295201
    //   2279: l2i
    //   2280: ldc_w 1621294543
    //   2283: ixor
    //   2284: goto -> 2295
    //   2287: ldc2_w 1837595251
    //   2290: l2i
    //   2291: ldc_w -1274951491
    //   2294: ixor
    //   2295: ldc2_w 1217591946
    //   2298: l2i
    //   2299: ldc_w -658954977
    //   2302: ixor
    //   2303: ixor
    //   2304: lookupswitch default -> 2598, -2024044037 -> 2287, 1236102491 -> 2332
    //   2332: aload #5
    //   2334: getstatic Perryc.0 : I
    //   2337: ifle -> 2351
    //   2340: ldc2_w -443843237
    //   2343: l2i
    //   2344: ldc_w -1981631561
    //   2347: ixor
    //   2348: goto -> 2359
    //   2351: ldc2_w -876573800
    //   2354: l2i
    //   2355: ldc_w -496158486
    //   2358: ixor
    //   2359: ldc2_w -724714573
    //   2362: l2i
    //   2363: ldc_w 40167964
    //   2366: ixor
    //   2367: ixor
    //   2368: lookupswitch default -> 2580, -1161781437 -> 2351, -16456995 -> 2396
    //   2396: goto -> 2400
    //   2399: athrow
    //   2400: invokevirtual printStackTrace : ()V
    //   2403: goto -> 2407
    //   2406: athrow
    //   2407: goto -> 1621
    //   2410: getstatic Perryc.0 : I
    //   2413: ifle -> 2427
    //   2416: ldc2_w 7680428
    //   2419: l2i
    //   2420: ldc_w 743682685
    //   2423: ixor
    //   2424: goto -> 2435
    //   2427: ldc2_w -145843080
    //   2430: l2i
    //   2431: ldc_w -1364624632
    //   2434: ixor
    //   2435: ldc2_w 1576846585
    //   2438: l2i
    //   2439: ldc_w -502631157
    //   2442: ixor
    //   2443: ixor
    //   2444: lookupswitch default -> 2546, -1815072221 -> 2427, -435071358 -> 2472
    //   2472: aload_0
    //   2473: getstatic Perryc.0 : I
    //   2476: ifle -> 2490
    //   2479: ldc2_w 1811063177
    //   2482: l2i
    //   2483: ldc_w -720815297
    //   2486: ixor
    //   2487: goto -> 2498
    //   2490: ldc2_w 532675953
    //   2493: l2i
    //   2494: ldc_w 1161766071
    //   2497: ixor
    //   2498: ldc2_w 722750747
    //   2501: l2i
    //   2502: ldc_w -1777242853
    //   2505: ixor
    //   2506: ixor
    //   2507: lookupswitch default -> 2532, -1330757949 -> 2490, 67025590 -> 2562
    //   2532: goto -> 2536
    //   2535: athrow
    //   2536: invokevirtual saveCurrentConfig : ()V
    //   2539: goto -> 2543
    //   2542: athrow
    //   2543: return
    //   2544: aconst_null
    //   2545: athrow
    //   2546: aconst_null
    //   2547: athrow
    //   2548: aconst_null
    //   2549: athrow
    //   2550: aconst_null
    //   2551: athrow
    //   2552: aconst_null
    //   2553: athrow
    //   2554: aconst_null
    //   2555: athrow
    //   2556: aconst_null
    //   2557: athrow
    //   2558: aconst_null
    //   2559: athrow
    //   2560: aconst_null
    //   2561: athrow
    //   2562: aconst_null
    //   2563: athrow
    //   2564: aconst_null
    //   2565: athrow
    //   2566: aconst_null
    //   2567: athrow
    //   2568: aconst_null
    //   2569: athrow
    //   2570: aconst_null
    //   2571: athrow
    //   2572: aconst_null
    //   2573: athrow
    //   2574: aconst_null
    //   2575: athrow
    //   2576: aconst_null
    //   2577: athrow
    //   2578: aconst_null
    //   2579: athrow
    //   2580: aconst_null
    //   2581: athrow
    //   2582: aconst_null
    //   2583: athrow
    //   2584: aconst_null
    //   2585: athrow
    //   2586: aconst_null
    //   2587: athrow
    //   2588: aconst_null
    //   2589: athrow
    //   2590: aconst_null
    //   2591: athrow
    //   2592: aconst_null
    //   2593: athrow
    //   2594: aconst_null
    //   2595: athrow
    //   2596: aconst_null
    //   2597: athrow
    //   2598: aconst_null
    //   2599: athrow
    //   2600: aconst_null
    //   2601: athrow
    //   2602: aconst_null
    //   2603: athrow
    //   2604: aconst_null
    //   2605: athrow
    //   2606: aconst_null
    //   2607: athrow
    //   2608: aconst_null
    //   2609: athrow
    //   2610: aconst_null
    //   2611: athrow
    //   2612: aconst_null
    //   2613: athrow
    //   2614: aconst_null
    //   2615: athrow
    //   2616: pop
    //   2617: goto -> 24
    //   2620: pop
    //   2621: aconst_null
    //   2622: goto -> 2616
    //   2625: dup
    //   2626: ifnull -> 2616
    //   2629: checkcast java/lang/Throwable
    //   2632: athrow
    //   2633: dup
    //   2634: ifnull -> 2620
    //   2637: checkcast java/lang/Throwable
    //   2640: athrow
    //   2641: aconst_null
    //   2642: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2270	137	5	e	Ljava/io/IOException;
    //   2006	401	4	feature	Lbigname/zprestige/webhack/features/Feature;
    //   24	2520	0	this	Lbigname/zprestige/webhack/manager/ConfigManager;
    //   24	2520	1	name	Ljava/lang/String;
    //   913	1631	2	path	Ljava/io/File;
    // Exception table:
    //   from	to	target	type
    //   8	20	2625	java/lang/ClassCastException
    //   152	158	158	finally
    //   152	158	158	finally
    //   152	158	3	finally
    //   152	158	3	java/lang/StringIndexOutOfBoundsException
    //   152	158	3	finally
    //   227	234	234	finally
    //   227	234	227	finally
    //   227	234	227	finally
    //   227	234	227	finally
    //   228	234	234	finally
    //   299	306	306	finally
    //   299	306	299	java/lang/ArithmeticException
    //   299	306	3	java/lang/AssertionError
    //   299	306	306	java/lang/ArrayIndexOutOfBoundsException
    //   300	306	306	finally
    //   431	438	438	finally
    //   432	438	438	finally
    //   432	438	431	java/lang/StringIndexOutOfBoundsException
    //   432	438	438	finally
    //   432	438	3	finally
    //   507	514	514	finally
    //   507	514	514	java/util/NoSuchElementException
    //   507	514	514	java/util/NoSuchElementException
    //   507	514	507	finally
    //   507	514	3	finally
    //   579	586	586	finally
    //   579	586	3	finally
    //   579	586	586	java/util/ConcurrentModificationException
    //   580	586	579	java/lang/RuntimeException
    //   580	586	579	java/lang/EnumConstantNotPresentException
    //   843	850	850	finally
    //   843	850	843	finally
    //   844	850	3	finally
    //   844	850	850	java/lang/ArrayIndexOutOfBoundsException
    //   844	850	843	finally
    //   1036	1042	1042	finally
    //   1036	1042	1042	finally
    //   1036	1042	3	finally
    //   1036	1042	3	java/lang/EnumConstantNotPresentException
    //   1036	1042	3	finally
    //   1220	1226	1226	finally
    //   1220	1226	3	finally
    //   1220	1226	1226	java/lang/RuntimeException
    //   1220	1226	1226	finally
    //   1220	1226	3	finally
    //   1355	1362	1362	finally
    //   1355	1362	1355	java/lang/ClassCastException
    //   1356	1362	1362	java/lang/UnsupportedOperationException
    //   1356	1362	1362	finally
    //   1356	1362	3	java/lang/ArrayIndexOutOfBoundsException
    //   1551	1558	1558	finally
    //   1551	1558	1551	java/lang/NumberFormatException
    //   1551	1558	1558	java/lang/AssertionError
    //   1552	1558	3	java/lang/UnsupportedOperationException
    //   1552	1558	1558	java/lang/EnumConstantNotPresentException
    //   1743	1752	1752	finally
    //   1743	1752	3	java/lang/RuntimeException
    //   1743	1752	1752	java/lang/ClassCastException
    //   1744	1752	3	finally
    //   1744	1752	1743	finally
    //   1931	1940	1940	finally
    //   1931	1940	1931	finally
    //   1931	1940	1940	java/lang/AssertionError
    //   1931	1940	3	java/lang/IndexOutOfBoundsException
    //   1931	1940	1931	java/lang/NullPointerException
    //   2006	2203	2206	java/io/IOException
    //   2195	2202	2202	finally
    //   2195	2202	3	finally
    //   2195	2202	2202	finally
    //   2195	2202	3	java/lang/ClassCastException
    //   2196	2202	2195	java/util/ConcurrentModificationException
    //   2399	2406	2406	finally
    //   2399	2406	2406	finally
    //   2400	2406	3	finally
    //   2400	2406	2399	finally
    //   2400	2406	2406	finally
    //   2535	2542	2542	finally
    //   2535	2542	2535	finally
    //   2536	2542	2542	finally
    //   2536	2542	2535	java/lang/ArithmeticException
    //   2536	2542	2535	java/lang/AssertionError
    //   2625	2633	2625	java/lang/IllegalArgumentException
    //   2641	2643	3	java/lang/AssertionError
  }
  
  public void loadPath(Path path, Feature feature) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ConfigManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */