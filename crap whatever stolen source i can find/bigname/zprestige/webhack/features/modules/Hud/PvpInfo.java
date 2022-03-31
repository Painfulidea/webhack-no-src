package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class PvpInfo extends Module {
  public int color;
  
  public Setting<Integer> PvpInfoY;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void renderPvpInfo() {
    // Byte code:
    //   0: goto -> 13
    //   3: dup
    //   4: ifnonnull -> 12
    //   7: goto_w -> 38217
    //   12: athrow
    //   13: aconst_null
    //   14: getstatic Perryc.0 : I
    //   17: ifle -> 25
    //   20: goto_w -> 38209
    //   25: pop
    //   26: aconst_null
    //   27: goto_w -> 38201
    //   32: nop
    //   33: nop
    //   34: nop
    //   35: athrow
    //   36: new java/lang/StringBuilder
    //   39: dup
    //   40: getstatic Perryc.0 : I
    //   43: ifle -> 56
    //   46: ldc2_w -1250569214
    //   49: l2i
    //   50: ldc -1134127601
    //   52: ixor
    //   53: goto -> 63
    //   56: ldc2_w -1266098506
    //   59: l2i
    //   60: ldc -985639074
    //   62: ixor
    //   63: ldc2_w -1976080391
    //   66: l2i
    //   67: ldc -729536146
    //   69: ixor
    //   70: ixor
    //   71: lookupswitch default -> 96, -1964402361 -> 56, 1470106778 -> 37304
    //   96: goto -> 100
    //   99: athrow
    //   100: invokespecial <init> : ()V
    //   103: goto -> 107
    //   106: athrow
    //   107: ldc '䯻㌲䯠'
    //   109: getstatic Perryc.1 : I
    //   112: ifeq -> 125
    //   115: ldc2_w -1426650382
    //   118: l2i
    //   119: ldc 1947041827
    //   121: ixor
    //   122: goto -> 132
    //   125: ldc2_w -262576023
    //   128: l2i
    //   129: ldc -312591180
    //   131: ixor
    //   132: ldc2_w -571776650
    //   135: l2i
    //   136: ldc -812657900
    //   138: ixor
    //   139: ixor
    //   140: lookupswitch default -> 37900, -862046029 -> 125, 258205375 -> 168
    //   168: goto -> 172
    //   171: athrow
    //   172: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   175: goto -> 179
    //   178: athrow
    //   179: getstatic Perryc.0 : I
    //   182: ifle -> 195
    //   185: ldc2_w 2112759475
    //   188: l2i
    //   189: ldc 855446076
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -1096133695
    //   198: l2i
    //   199: ldc 1211318259
    //   201: ixor
    //   202: ldc2_w 1766488106
    //   205: l2i
    //   206: ldc 1007143692
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 37292, -1546330348 -> 236, 442402729 -> 195
    //   236: goto -> 240
    //   239: athrow
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: goto -> 247
    //   246: athrow
    //   247: getstatic Perryc.0 : I
    //   250: ifle -> 263
    //   253: ldc2_w -1481102249
    //   256: l2i
    //   257: ldc 166752874
    //   259: ixor
    //   260: goto -> 270
    //   263: ldc2_w 1265227394
    //   266: l2i
    //   267: ldc 2051771941
    //   269: ixor
    //   270: ldc2_w -2094205766
    //   273: l2i
    //   274: ldc 661565115
    //   276: ixor
    //   277: ixor
    //   278: lookupswitch default -> 304, 168428604 -> 37622, 1544164612 -> 263
    //   304: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   307: getstatic Perryc.c : I
    //   310: iflt -> 323
    //   313: ldc2_w -950953841
    //   316: l2i
    //   317: ldc 993899780
    //   319: ixor
    //   320: goto -> 330
    //   323: ldc2_w 1400915230
    //   326: l2i
    //   327: ldc 1021601655
    //   329: ixor
    //   330: ldc2_w -191606547
    //   333: l2i
    //   334: ldc 1462424246
    //   336: ixor
    //   337: ixor
    //   338: lookupswitch default -> 364, -634979425 -> 323, 1607643088 -> 37710
    //   364: goto -> 368
    //   367: athrow
    //   368: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   371: goto -> 375
    //   374: athrow
    //   375: ldc '䮘㌼䮔'
    //   377: getstatic Perryc.1 : I
    //   380: ifeq -> 393
    //   383: ldc2_w -1050021460
    //   386: l2i
    //   387: ldc -1440318922
    //   389: ixor
    //   390: goto -> 400
    //   393: ldc2_w -45185333
    //   396: l2i
    //   397: ldc -1173988790
    //   399: ixor
    //   400: ldc2_w -1741832015
    //   403: l2i
    //   404: ldc 532511914
    //   406: ixor
    //   407: ixor
    //   408: lookupswitch default -> 436, -320915583 -> 37540, 1524289828 -> 393
    //   436: goto -> 440
    //   439: athrow
    //   440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   443: goto -> 447
    //   446: athrow
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w 1776495067
    //   456: l2i
    //   457: ldc 2003618588
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -2059167198
    //   466: l2i
    //   467: ldc -146349485
    //   469: ixor
    //   470: ldc2_w 1946629231
    //   473: l2i
    //   474: ldc -660922916
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -1307325580 -> 37756, 1484445129 -> 463
    //   504: goto -> 508
    //   507: athrow
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: goto -> 515
    //   514: athrow
    //   515: getstatic Perryc.0 : I
    //   518: ifle -> 531
    //   521: ldc2_w 1948488380
    //   524: l2i
    //   525: ldc -162967985
    //   527: ixor
    //   528: goto -> 538
    //   531: ldc2_w 896225082
    //   534: l2i
    //   535: ldc 653039278
    //   537: ixor
    //   538: ldc2_w 252034676
    //   541: l2i
    //   542: ldc -241095039
    //   544: ixor
    //   545: ixor
    //   546: lookupswitch default -> 38006, -316454559 -> 572, 2093894662 -> 531
    //   572: goto -> 576
    //   575: athrow
    //   576: invokevirtual toString : ()Ljava/lang/String;
    //   579: goto -> 583
    //   582: athrow
    //   583: getstatic Perryc.0 : I
    //   586: ifle -> 599
    //   589: ldc2_w 1199364610
    //   592: l2i
    //   593: ldc -1691714012
    //   595: ixor
    //   596: goto -> 606
    //   599: ldc2_w -2109323125
    //   602: l2i
    //   603: ldc -2052417856
    //   605: ixor
    //   606: ldc2_w -1459732236
    //   609: l2i
    //   610: ldc 1909976485
    //   612: ixor
    //   613: ixor
    //   614: lookupswitch default -> 38020, -557485286 -> 640, 92211575 -> 599
    //   640: astore_1
    //   641: new java/lang/StringBuilder
    //   644: dup
    //   645: getstatic Perryc.c : I
    //   648: iflt -> 661
    //   651: ldc2_w -854693836
    //   654: l2i
    //   655: ldc -2022083555
    //   657: ixor
    //   658: goto -> 668
    //   661: ldc2_w -954942712
    //   664: l2i
    //   665: ldc -1730563300
    //   667: ixor
    //   668: ldc2_w -381962221
    //   671: l2i
    //   672: ldc 1093090826
    //   674: ixor
    //   675: ixor
    //   676: lookupswitch default -> 37508, -496264656 -> 661, -137261555 -> 704
    //   704: goto -> 708
    //   707: athrow
    //   708: invokespecial <init> : ()V
    //   711: goto -> 715
    //   714: athrow
    //   715: ldc '䯻㌲䯠'
    //   717: getstatic Perryc.1 : I
    //   720: ifeq -> 733
    //   723: ldc2_w 1625497193
    //   726: l2i
    //   727: ldc 1605918085
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w 2146584696
    //   736: l2i
    //   737: ldc -1899483035
    //   739: ixor
    //   740: ldc2_w 2108898296
    //   743: l2i
    //   744: ldc 1913920112
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 776, -923812030 -> 733, 821846628 -> 38062
    //   776: goto -> 780
    //   779: athrow
    //   780: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   783: goto -> 787
    //   786: athrow
    //   787: getstatic Perryc.1 : I
    //   790: ifeq -> 803
    //   793: ldc2_w 1708764686
    //   796: l2i
    //   797: ldc -611589496
    //   799: ixor
    //   800: goto -> 810
    //   803: ldc2_w 1654844379
    //   806: l2i
    //   807: ldc -1738266379
    //   809: ixor
    //   810: ldc2_w 1576631100
    //   813: l2i
    //   814: ldc 2119935025
    //   816: ixor
    //   817: ixor
    //   818: lookupswitch default -> 37472, -1645177973 -> 803, -647750621 -> 844
    //   844: goto -> 848
    //   847: athrow
    //   848: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   851: goto -> 855
    //   854: athrow
    //   855: getstatic Perryc.c : I
    //   858: iflt -> 871
    //   861: ldc2_w -728392639
    //   864: l2i
    //   865: ldc 1798926324
    //   867: ixor
    //   868: goto -> 878
    //   871: ldc2_w 2017833025
    //   874: l2i
    //   875: ldc -428203888
    //   877: ixor
    //   878: ldc2_w -842414979
    //   881: l2i
    //   882: ldc -26411732
    //   884: ixor
    //   885: ixor
    //   886: lookupswitch default -> 912, -1945515292 -> 37410, 308277060 -> 871
    //   912: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   915: getstatic Perryc.1 : I
    //   918: ifeq -> 931
    //   921: ldc2_w -2015667607
    //   924: l2i
    //   925: ldc 1452276913
    //   927: ixor
    //   928: goto -> 938
    //   931: ldc2_w 1908203148
    //   934: l2i
    //   935: ldc 79039176
    //   937: ixor
    //   938: ldc2_w -1825414461
    //   941: l2i
    //   942: ldc 1186365519
    //   944: ixor
    //   945: ixor
    //   946: lookupswitch default -> 972, 80757844 -> 37514, 946984118 -> 931
    //   972: goto -> 976
    //   975: athrow
    //   976: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   979: goto -> 983
    //   982: athrow
    //   983: ldc '䮘㌼䮜坡'
    //   985: getstatic Perryc.0 : I
    //   988: ifle -> 1001
    //   991: ldc2_w 330602756
    //   994: l2i
    //   995: ldc 1285102880
    //   997: ixor
    //   998: goto -> 1008
    //   1001: ldc2_w 334021927
    //   1004: l2i
    //   1005: ldc -1081861255
    //   1007: ixor
    //   1008: ldc2_w 827474300
    //   1011: l2i
    //   1012: ldc -1686842431
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 38016, -183822695 -> 1001, 105532643 -> 1044
    //   1044: goto -> 1048
    //   1047: athrow
    //   1048: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1051: goto -> 1055
    //   1054: athrow
    //   1055: getstatic Perryc.c : I
    //   1058: iflt -> 1071
    //   1061: ldc2_w -1287625095
    //   1064: l2i
    //   1065: ldc -834233145
    //   1067: ixor
    //   1068: goto -> 1078
    //   1071: ldc2_w -207668279
    //   1074: l2i
    //   1075: ldc -1265883819
    //   1077: ixor
    //   1078: ldc2_w -1187105805
    //   1081: l2i
    //   1082: ldc 1362916829
    //   1084: ixor
    //   1085: ixor
    //   1086: lookupswitch default -> 37888, -1794851696 -> 1071, -1357817678 -> 1112
    //   1112: goto -> 1116
    //   1115: athrow
    //   1116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1119: goto -> 1123
    //   1122: athrow
    //   1123: getstatic Perryc.c : I
    //   1126: iflt -> 1139
    //   1129: ldc2_w -973388959
    //   1132: l2i
    //   1133: ldc 229525571
    //   1135: ixor
    //   1136: goto -> 1146
    //   1139: ldc2_w -1572557813
    //   1142: l2i
    //   1143: ldc -773303566
    //   1145: ixor
    //   1146: ldc2_w -1150658299
    //   1149: l2i
    //   1150: ldc 1719684034
    //   1152: ixor
    //   1153: ixor
    //   1154: lookupswitch default -> 37956, -1371083714 -> 1180, 364845541 -> 1139
    //   1180: goto -> 1184
    //   1183: athrow
    //   1184: invokevirtual toString : ()Ljava/lang/String;
    //   1187: goto -> 1191
    //   1190: athrow
    //   1191: getstatic Perryc.0 : I
    //   1194: ifle -> 1207
    //   1197: ldc2_w 444817
    //   1200: l2i
    //   1201: ldc 257496329
    //   1203: ixor
    //   1204: goto -> 1214
    //   1207: ldc2_w 2093469
    //   1210: l2i
    //   1211: ldc 2000117898
    //   1213: ixor
    //   1214: ldc2_w -975142861
    //   1217: l2i
    //   1218: ldc_w -1584820740
    //   1221: ixor
    //   1222: ixor
    //   1223: lookupswitch default -> 37294, 323067096 -> 1248, 1798754647 -> 1207
    //   1248: astore_2
    //   1249: new java/lang/StringBuilder
    //   1252: dup
    //   1253: getstatic Perryc.c : I
    //   1256: iflt -> 1270
    //   1259: ldc2_w 46945769
    //   1262: l2i
    //   1263: ldc_w 1680597501
    //   1266: ixor
    //   1267: goto -> 1278
    //   1270: ldc2_w -1475619811
    //   1273: l2i
    //   1274: ldc_w 761254881
    //   1277: ixor
    //   1278: ldc2_w -152173845
    //   1281: l2i
    //   1282: ldc_w 688456765
    //   1285: ixor
    //   1286: ixor
    //   1287: lookupswitch default -> 1312, -1191136574 -> 37644, 1669492465 -> 1270
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokespecial <init> : ()V
    //   1319: goto -> 1323
    //   1322: athrow
    //   1323: ldc_w '䯫㌦䯠'
    //   1326: getstatic Perryc.1 : I
    //   1329: ifeq -> 1343
    //   1332: ldc2_w -2063099505
    //   1335: l2i
    //   1336: ldc_w 951195632
    //   1339: ixor
    //   1340: goto -> 1351
    //   1343: ldc2_w 1283817246
    //   1346: l2i
    //   1347: ldc_w -839471857
    //   1350: ixor
    //   1351: ldc2_w 2101155181
    //   1354: l2i
    //   1355: ldc_w -1885561973
    //   1358: ixor
    //   1359: ixor
    //   1360: lookupswitch default -> 1388, 1326710937 -> 37754, 2053560623 -> 1343
    //   1388: goto -> 1392
    //   1391: athrow
    //   1392: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1395: goto -> 1399
    //   1398: athrow
    //   1399: getstatic Perryc.0 : I
    //   1402: ifle -> 1416
    //   1405: ldc2_w 1932461895
    //   1408: l2i
    //   1409: ldc_w -1617103395
    //   1412: ixor
    //   1413: goto -> 1424
    //   1416: ldc2_w -201497528
    //   1419: l2i
    //   1420: ldc_w -268937303
    //   1423: ixor
    //   1424: ldc2_w 876747214
    //   1427: l2i
    //   1428: ldc_w 56734098
    //   1431: ixor
    //   1432: ixor
    //   1433: lookupswitch default -> 1460, -611296570 -> 37784, 1089152140 -> 1416
    //   1460: goto -> 1464
    //   1463: athrow
    //   1464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1467: goto -> 1471
    //   1470: athrow
    //   1471: getstatic Perryc.0 : I
    //   1474: ifle -> 1488
    //   1477: ldc2_w 1959666465
    //   1480: l2i
    //   1481: ldc_w 635434901
    //   1484: ixor
    //   1485: goto -> 1496
    //   1488: ldc2_w 392430008
    //   1491: l2i
    //   1492: ldc_w -1779952543
    //   1495: ixor
    //   1496: ldc2_w 369421065
    //   1499: l2i
    //   1500: ldc_w 648830432
    //   1503: ixor
    //   1504: ixor
    //   1505: lookupswitch default -> 37638, -1306221776 -> 1532, 1639539293 -> 1488
    //   1532: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1535: getstatic Perryc.1 : I
    //   1538: ifeq -> 1552
    //   1541: ldc2_w 584911470
    //   1544: l2i
    //   1545: ldc_w 1652952373
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w -1046898468
    //   1555: l2i
    //   1556: ldc_w 373941621
    //   1559: ixor
    //   1560: ldc2_w -457227011
    //   1563: l2i
    //   1564: ldc_w 420493785
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 1596, -1108051329 -> 37922, 174307646 -> 1552
    //   1596: goto -> 1600
    //   1599: athrow
    //   1600: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1603: goto -> 1607
    //   1606: athrow
    //   1607: ldc '䮘㌼䮔'
    //   1609: getstatic Perryc.0 : I
    //   1612: ifle -> 1626
    //   1615: ldc2_w -1761686523
    //   1618: l2i
    //   1619: ldc_w 719196378
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w 30172454
    //   1629: l2i
    //   1630: ldc_w 1109421941
    //   1633: ixor
    //   1634: ldc2_w -142173859
    //   1637: l2i
    //   1638: ldc_w 634142372
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, 602725046 -> 1626, 1852472102 -> 38042
    //   1668: goto -> 1672
    //   1671: athrow
    //   1672: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1675: goto -> 1679
    //   1678: athrow
    //   1679: getstatic Perryc.1 : I
    //   1682: ifeq -> 1696
    //   1685: ldc2_w 1003874112
    //   1688: l2i
    //   1689: ldc_w -1793201289
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w -537839412
    //   1699: l2i
    //   1700: ldc_w -1591731013
    //   1703: ixor
    //   1704: ldc2_w 1025259551
    //   1707: l2i
    //   1708: ldc_w -752937792
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, 1087054056 -> 37826, 2106631512 -> 1696
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: getstatic Perryc.0 : I
    //   1754: ifle -> 1768
    //   1757: ldc2_w 1514687022
    //   1760: l2i
    //   1761: ldc_w -1404196953
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w -1888335741
    //   1771: l2i
    //   1772: ldc_w 2105534640
    //   1775: ixor
    //   1776: ldc2_w -1298686167
    //   1779: l2i
    //   1780: ldc_w -328383198
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 37250, -1459669118 -> 1768, -1393067464 -> 1812
    //   1812: goto -> 1816
    //   1815: athrow
    //   1816: invokevirtual toString : ()Ljava/lang/String;
    //   1819: goto -> 1823
    //   1822: athrow
    //   1823: getstatic Perryc.c : I
    //   1826: iflt -> 1840
    //   1829: ldc2_w -308183835
    //   1832: l2i
    //   1833: ldc_w 1107988778
    //   1836: ixor
    //   1837: goto -> 1848
    //   1840: ldc2_w 1052346978
    //   1843: l2i
    //   1844: ldc_w -1300178445
    //   1847: ixor
    //   1848: ldc2_w 1077464699
    //   1851: l2i
    //   1852: ldc_w -808770579
    //   1855: ixor
    //   1856: ixor
    //   1857: lookupswitch default -> 1884, -1358794786 -> 1840, 542638169 -> 37646
    //   1884: astore_3
    //   1885: new java/lang/StringBuilder
    //   1888: dup
    //   1889: getstatic Perryc.1 : I
    //   1892: ifeq -> 1906
    //   1895: ldc2_w -586275347
    //   1898: l2i
    //   1899: ldc_w 1957469362
    //   1902: ixor
    //   1903: goto -> 1914
    //   1906: ldc2_w -756436186
    //   1909: l2i
    //   1910: ldc_w 1842609596
    //   1913: ixor
    //   1914: ldc2_w 490671946
    //   1917: l2i
    //   1918: ldc_w 965527467
    //   1921: ixor
    //   1922: ixor
    //   1923: lookupswitch default -> 1948, -1928236610 -> 37776, 1966775070 -> 1906
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokespecial <init> : ()V
    //   1955: goto -> 1959
    //   1958: athrow
    //   1959: ldc_w '䯫㌦䯠'
    //   1962: getstatic Perryc.1 : I
    //   1965: ifeq -> 1979
    //   1968: ldc2_w 860834830
    //   1971: l2i
    //   1972: ldc_w 852041590
    //   1975: ixor
    //   1976: goto -> 1987
    //   1979: ldc2_w 1146064263
    //   1982: l2i
    //   1983: ldc_w 1385598582
    //   1986: ixor
    //   1987: ldc2_w -663111117
    //   1990: l2i
    //   1991: ldc_w -375385747
    //   1994: ixor
    //   1995: ixor
    //   1996: lookupswitch default -> 2024, -820906598 -> 1979, 811595814 -> 37636
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: getstatic Perryc.c : I
    //   2038: iflt -> 2052
    //   2041: ldc2_w -2020158190
    //   2044: l2i
    //   2045: ldc_w -1482886625
    //   2048: ixor
    //   2049: goto -> 2060
    //   2052: ldc2_w 81541557
    //   2055: l2i
    //   2056: ldc_w 1838263991
    //   2059: ixor
    //   2060: ldc2_w 181694371
    //   2063: l2i
    //   2064: ldc_w 403834895
    //   2067: ixor
    //   2068: ixor
    //   2069: lookupswitch default -> 37380, 852246689 -> 2052, 2072768686 -> 2096
    //   2096: goto -> 2100
    //   2099: athrow
    //   2100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2103: goto -> 2107
    //   2106: athrow
    //   2107: getstatic Perryc.c : I
    //   2110: iflt -> 2124
    //   2113: ldc2_w 1958476221
    //   2116: l2i
    //   2117: ldc_w -949996062
    //   2120: ixor
    //   2121: goto -> 2132
    //   2124: ldc2_w 1122243312
    //   2127: l2i
    //   2128: ldc_w -127888765
    //   2131: ixor
    //   2132: ldc2_w 1959461493
    //   2135: l2i
    //   2136: ldc_w -570815282
    //   2139: ixor
    //   2140: ixor
    //   2141: lookupswitch default -> 2168, 451592932 -> 37328, 578851431 -> 2124
    //   2168: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2171: getstatic Perryc.1 : I
    //   2174: ifeq -> 2188
    //   2177: ldc2_w 503979723
    //   2180: l2i
    //   2181: ldc_w -1908829321
    //   2184: ixor
    //   2185: goto -> 2196
    //   2188: ldc2_w -615770964
    //   2191: l2i
    //   2192: ldc_w -1307999661
    //   2195: ixor
    //   2196: ldc2_w 279443737
    //   2199: l2i
    //   2200: ldc_w 1663542191
    //   2203: ixor
    //   2204: ixor
    //   2205: lookupswitch default -> 37426, -474753270 -> 2188, 449170505 -> 2232
    //   2232: goto -> 2236
    //   2235: athrow
    //   2236: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2239: goto -> 2243
    //   2242: athrow
    //   2243: ldc '䮘㌼䮜坡'
    //   2245: getstatic Perryc.c : I
    //   2248: iflt -> 2262
    //   2251: ldc2_w -373832540
    //   2254: l2i
    //   2255: ldc_w 405637208
    //   2258: ixor
    //   2259: goto -> 2270
    //   2262: ldc2_w -1955606204
    //   2265: l2i
    //   2266: ldc_w 1040488708
    //   2269: ixor
    //   2270: ldc2_w -185549883
    //   2273: l2i
    //   2274: ldc_w -66651398
    //   2277: ixor
    //   2278: ixor
    //   2279: lookupswitch default -> 37828, -1113781889 -> 2304, -110359101 -> 2262
    //   2304: goto -> 2308
    //   2307: athrow
    //   2308: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2311: goto -> 2315
    //   2314: athrow
    //   2315: getstatic Perryc.c : I
    //   2318: iflt -> 2332
    //   2321: ldc2_w -623428413
    //   2324: l2i
    //   2325: ldc_w -294325663
    //   2328: ixor
    //   2329: goto -> 2340
    //   2332: ldc2_w 60342652
    //   2335: l2i
    //   2336: ldc_w -1286850226
    //   2339: ixor
    //   2340: ldc2_w 197869176
    //   2343: l2i
    //   2344: ldc_w -152000526
    //   2347: ixor
    //   2348: ixor
    //   2349: lookupswitch default -> 2376, -1382306665 -> 2332, -912763096 -> 37502
    //   2376: goto -> 2380
    //   2379: athrow
    //   2380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2383: goto -> 2387
    //   2386: athrow
    //   2387: getstatic Perryc.1 : I
    //   2390: ifeq -> 2404
    //   2393: ldc2_w 755584279
    //   2396: l2i
    //   2397: ldc_w 476974682
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w 2078846805
    //   2407: l2i
    //   2408: ldc_w 259687568
    //   2411: ixor
    //   2412: ldc2_w 1067229088
    //   2415: l2i
    //   2416: ldc_w -1718833463
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, -1753779676 -> 38082, -683356567 -> 2404
    //   2448: goto -> 2452
    //   2451: athrow
    //   2452: invokevirtual toString : ()Ljava/lang/String;
    //   2455: goto -> 2459
    //   2458: athrow
    //   2459: getstatic Perryc.1 : I
    //   2462: ifeq -> 2476
    //   2465: ldc2_w 869891136
    //   2468: l2i
    //   2469: ldc_w -1534511570
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w -210188359
    //   2479: l2i
    //   2480: ldc_w -1457842605
    //   2483: ixor
    //   2484: ldc2_w -1290220360
    //   2487: l2i
    //   2488: ldc_w -39926190
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 38066, -640270204 -> 2476, 350608128 -> 2520
    //   2520: astore #4
    //   2522: new java/lang/StringBuilder
    //   2525: dup
    //   2526: getstatic Perryc.1 : I
    //   2529: ifeq -> 2543
    //   2532: ldc2_w 1778220170
    //   2535: l2i
    //   2536: ldc_w 2021693340
    //   2539: ixor
    //   2540: goto -> 2551
    //   2543: ldc2_w 532592102
    //   2546: l2i
    //   2547: ldc_w -1424107104
    //   2550: ixor
    //   2551: ldc2_w 1320744682
    //   2554: l2i
    //   2555: ldc_w 534244490
    //   2558: ixor
    //   2559: ixor
    //   2560: lookupswitch default -> 2588, -870003238 -> 2543, 1074983286 -> 37594
    //   2588: goto -> 2592
    //   2591: athrow
    //   2592: invokespecial <init> : ()V
    //   2595: goto -> 2599
    //   2598: athrow
    //   2599: ldc_w '䯾㌿䯠'
    //   2602: getstatic Perryc.1 : I
    //   2605: ifeq -> 2619
    //   2608: ldc2_w -19973933
    //   2611: l2i
    //   2612: ldc_w 2091088085
    //   2615: ixor
    //   2616: goto -> 2627
    //   2619: ldc2_w 1449543987
    //   2622: l2i
    //   2623: ldc_w -1504501930
    //   2626: ixor
    //   2627: ldc2_w -1695242834
    //   2630: l2i
    //   2631: ldc_w -1740049433
    //   2634: ixor
    //   2635: ixor
    //   2636: lookupswitch default -> 2664, -2133846449 -> 37760, 1289561074 -> 2619
    //   2664: goto -> 2668
    //   2667: athrow
    //   2668: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2671: goto -> 2675
    //   2674: athrow
    //   2675: getstatic Perryc.0 : I
    //   2678: ifle -> 2692
    //   2681: ldc2_w 1128870713
    //   2684: l2i
    //   2685: ldc_w -48224708
    //   2688: ixor
    //   2689: goto -> 2700
    //   2692: ldc2_w 901215144
    //   2695: l2i
    //   2696: ldc_w 1212069306
    //   2699: ixor
    //   2700: ldc2_w -1107481953
    //   2703: l2i
    //   2704: ldc_w -1289775709
    //   2707: ixor
    //   2708: ixor
    //   2709: lookupswitch default -> 37820, -1333024199 -> 2692, 1936423214 -> 2736
    //   2736: goto -> 2740
    //   2739: athrow
    //   2740: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2743: goto -> 2747
    //   2746: athrow
    //   2747: getstatic Perryc.0 : I
    //   2750: ifle -> 2764
    //   2753: ldc2_w 562898472
    //   2756: l2i
    //   2757: ldc_w -214348637
    //   2760: ixor
    //   2761: goto -> 2772
    //   2764: ldc2_w -128126570
    //   2767: l2i
    //   2768: ldc_w 1836329906
    //   2771: ixor
    //   2772: ldc2_w -1342856994
    //   2775: l2i
    //   2776: ldc_w -38999386
    //   2779: ixor
    //   2780: ixor
    //   2781: lookupswitch default -> 37670, -2131943181 -> 2764, -948858788 -> 2808
    //   2808: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2811: getstatic Perryc.1 : I
    //   2814: ifeq -> 2828
    //   2817: ldc2_w -355779610
    //   2820: l2i
    //   2821: ldc_w 133986216
    //   2824: ixor
    //   2825: goto -> 2836
    //   2828: ldc2_w -1737991709
    //   2831: l2i
    //   2832: ldc_w -474816448
    //   2835: ixor
    //   2836: ldc2_w 1807145849
    //   2839: l2i
    //   2840: ldc_w -1022557860
    //   2843: ixor
    //   2844: ixor
    //   2845: lookupswitch default -> 37274, -748592250 -> 2872, 1166841451 -> 2828
    //   2872: goto -> 2876
    //   2875: athrow
    //   2876: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2879: goto -> 2883
    //   2882: athrow
    //   2883: ldc '䮘㌼䮔'
    //   2885: getstatic Perryc.c : I
    //   2888: iflt -> 2902
    //   2891: ldc2_w -1579875561
    //   2894: l2i
    //   2895: ldc_w 1186907807
    //   2898: ixor
    //   2899: goto -> 2910
    //   2902: ldc2_w -1576013303
    //   2905: l2i
    //   2906: ldc_w 1312163017
    //   2909: ixor
    //   2910: ldc2_w 1135459841
    //   2913: l2i
    //   2914: ldc_w 1240993773
    //   2917: ixor
    //   2918: ixor
    //   2919: lookupswitch default -> 2944, -314674076 -> 37662, 1909041814 -> 2902
    //   2944: goto -> 2948
    //   2947: athrow
    //   2948: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2951: goto -> 2955
    //   2954: athrow
    //   2955: getstatic Perryc.1 : I
    //   2958: ifeq -> 2972
    //   2961: ldc2_w -1922603769
    //   2964: l2i
    //   2965: ldc_w -1470189403
    //   2968: ixor
    //   2969: goto -> 2980
    //   2972: ldc2_w 1474095309
    //   2975: l2i
    //   2976: ldc_w 721711753
    //   2979: ixor
    //   2980: ldc2_w 395583638
    //   2983: l2i
    //   2984: ldc_w 220985942
    //   2987: ixor
    //   2988: ixor
    //   2989: lookupswitch default -> 37524, 1065750370 -> 2972, 1718042756 -> 3016
    //   3016: goto -> 3020
    //   3019: athrow
    //   3020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3023: goto -> 3027
    //   3026: athrow
    //   3027: getstatic Perryc.c : I
    //   3030: iflt -> 3044
    //   3033: ldc2_w -985670217
    //   3036: l2i
    //   3037: ldc_w -217209595
    //   3040: ixor
    //   3041: goto -> 3052
    //   3044: ldc2_w 151858525
    //   3047: l2i
    //   3048: ldc_w -1771491277
    //   3051: ixor
    //   3052: ldc2_w 1597666655
    //   3055: l2i
    //   3056: ldc_w -1952139118
    //   3059: ixor
    //   3060: ixor
    //   3061: lookupswitch default -> 37586, -491997825 -> 3044, 1274728611 -> 3088
    //   3088: goto -> 3092
    //   3091: athrow
    //   3092: invokevirtual toString : ()Ljava/lang/String;
    //   3095: goto -> 3099
    //   3098: athrow
    //   3099: getstatic Perryc.1 : I
    //   3102: ifeq -> 3116
    //   3105: ldc2_w -1393015955
    //   3108: l2i
    //   3109: ldc_w 166962326
    //   3112: ixor
    //   3113: goto -> 3124
    //   3116: ldc2_w -1967824266
    //   3119: l2i
    //   3120: ldc_w 2097979929
    //   3123: ixor
    //   3124: ldc2_w -1753474298
    //   3127: l2i
    //   3128: ldc_w -1144738605
    //   3131: ixor
    //   3132: ixor
    //   3133: lookupswitch default -> 37578, -1984737234 -> 3116, -620660806 -> 3160
    //   3160: astore #5
    //   3162: new java/lang/StringBuilder
    //   3165: dup
    //   3166: getstatic Perryc.0 : I
    //   3169: ifle -> 3183
    //   3172: ldc2_w 62847718
    //   3175: l2i
    //   3176: ldc_w -2017968247
    //   3179: ixor
    //   3180: goto -> 3191
    //   3183: ldc2_w 1719145741
    //   3186: l2i
    //   3187: ldc_w -1662471623
    //   3190: ixor
    //   3191: ldc2_w -200362347
    //   3194: l2i
    //   3195: ldc_w 1480927753
    //   3198: ixor
    //   3199: ixor
    //   3200: lookupswitch default -> 37806, 676157939 -> 3183, 1457208232 -> 3228
    //   3228: goto -> 3232
    //   3231: athrow
    //   3232: invokespecial <init> : ()V
    //   3235: goto -> 3239
    //   3238: athrow
    //   3239: ldc_w '䯾㌿䯠'
    //   3242: getstatic Perryc.1 : I
    //   3245: ifeq -> 3259
    //   3248: ldc2_w 626555322
    //   3251: l2i
    //   3252: ldc_w 1623306525
    //   3255: ixor
    //   3256: goto -> 3267
    //   3259: ldc2_w -1198454040
    //   3262: l2i
    //   3263: ldc_w -120761747
    //   3266: ixor
    //   3267: ldc2_w -310457356
    //   3270: l2i
    //   3271: ldc_w -1957248273
    //   3274: ixor
    //   3275: ixor
    //   3276: lookupswitch default -> 37546, 598852028 -> 3259, 645157278 -> 3304
    //   3304: goto -> 3308
    //   3307: athrow
    //   3308: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3311: goto -> 3315
    //   3314: athrow
    //   3315: getstatic Perryc.c : I
    //   3318: iflt -> 3332
    //   3321: ldc2_w 111175340
    //   3324: l2i
    //   3325: ldc_w -815653816
    //   3328: ixor
    //   3329: goto -> 3340
    //   3332: ldc2_w -392174515
    //   3335: l2i
    //   3336: ldc_w 237243203
    //   3339: ixor
    //   3340: ldc2_w -567960054
    //   3343: l2i
    //   3344: ldc_w 473748299
    //   3347: ixor
    //   3348: ixor
    //   3349: lookupswitch default -> 3376, 198916005 -> 37834, 1662701572 -> 3332
    //   3376: goto -> 3380
    //   3379: athrow
    //   3380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3383: goto -> 3387
    //   3386: athrow
    //   3387: getstatic Perryc.c : I
    //   3390: iflt -> 3404
    //   3393: ldc2_w -1599567320
    //   3396: l2i
    //   3397: ldc_w -1329291058
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w 427541749
    //   3407: l2i
    //   3408: ldc_w 1371319548
    //   3411: ixor
    //   3412: ldc2_w 1246452430
    //   3415: l2i
    //   3416: ldc_w -1462669197
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 37738, -1436728652 -> 3448, -218759077 -> 3404
    //   3448: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3451: getstatic Perryc.0 : I
    //   3454: ifle -> 3468
    //   3457: ldc2_w 1930242333
    //   3460: l2i
    //   3461: ldc_w -1521172662
    //   3464: ixor
    //   3465: goto -> 3476
    //   3468: ldc2_w -1246292476
    //   3471: l2i
    //   3472: ldc_w -930267652
    //   3475: ixor
    //   3476: ldc2_w 987488976
    //   3479: l2i
    //   3480: ldc_w -1934077720
    //   3483: ixor
    //   3484: ixor
    //   3485: lookupswitch default -> 3512, 16951668 -> 3468, 1614423151 -> 37334
    //   3512: goto -> 3516
    //   3515: athrow
    //   3516: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3519: goto -> 3523
    //   3522: athrow
    //   3523: ldc '䮘㌼䮜坡'
    //   3525: getstatic Perryc.1 : I
    //   3528: ifeq -> 3542
    //   3531: ldc2_w -1639116309
    //   3534: l2i
    //   3535: ldc_w -1667462242
    //   3538: ixor
    //   3539: goto -> 3550
    //   3542: ldc2_w -1247950469
    //   3545: l2i
    //   3546: ldc_w 1066816810
    //   3549: ixor
    //   3550: ldc2_w 1950643706
    //   3553: l2i
    //   3554: ldc_w -1266071268
    //   3557: ixor
    //   3558: ixor
    //   3559: lookupswitch default -> 37654, -1038309741 -> 3542, 1254531255 -> 3584
    //   3584: goto -> 3588
    //   3587: athrow
    //   3588: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3591: goto -> 3595
    //   3594: athrow
    //   3595: getstatic Perryc.1 : I
    //   3598: ifeq -> 3612
    //   3601: ldc2_w 1977346357
    //   3604: l2i
    //   3605: ldc_w 1564118080
    //   3608: ixor
    //   3609: goto -> 3620
    //   3612: ldc2_w 1693657898
    //   3615: l2i
    //   3616: ldc_w -1865709794
    //   3619: ixor
    //   3620: ldc2_w 1254884551
    //   3623: l2i
    //   3624: ldc_w -777285243
    //   3627: ixor
    //   3628: ixor
    //   3629: lookupswitch default -> 3656, -1283002313 -> 37904, 846374055 -> 3612
    //   3656: goto -> 3660
    //   3659: athrow
    //   3660: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3663: goto -> 3667
    //   3666: athrow
    //   3667: getstatic Perryc.1 : I
    //   3670: ifeq -> 3684
    //   3673: ldc2_w -966442070
    //   3676: l2i
    //   3677: ldc_w -1199819648
    //   3680: ixor
    //   3681: goto -> 3692
    //   3684: ldc2_w -331958645
    //   3687: l2i
    //   3688: ldc_w -524419238
    //   3691: ixor
    //   3692: ldc2_w -24973851
    //   3695: l2i
    //   3696: ldc_w 330017313
    //   3699: ixor
    //   3700: ixor
    //   3701: lookupswitch default -> 3728, -1825558290 -> 37832, 781431778 -> 3684
    //   3728: goto -> 3732
    //   3731: athrow
    //   3732: invokevirtual toString : ()Ljava/lang/String;
    //   3735: goto -> 3739
    //   3738: athrow
    //   3739: getstatic Perryc.0 : I
    //   3742: ifle -> 3756
    //   3745: ldc2_w -1654389114
    //   3748: l2i
    //   3749: ldc_w 357850427
    //   3752: ixor
    //   3753: goto -> 3764
    //   3756: ldc2_w 563345281
    //   3759: l2i
    //   3760: ldc_w -1229018972
    //   3763: ixor
    //   3764: ldc2_w 1833782761
    //   3767: l2i
    //   3768: ldc_w -1141084697
    //   3771: ixor
    //   3772: ixor
    //   3773: lookupswitch default -> 3800, 146327296 -> 3756, 1585544115 -> 38058
    //   3800: astore #6
    //   3802: getstatic Perryc.c : I
    //   3805: iflt -> 3819
    //   3808: ldc2_w -311335237
    //   3811: l2i
    //   3812: ldc_w -312480267
    //   3815: ixor
    //   3816: goto -> 3827
    //   3819: ldc2_w 173422415
    //   3822: l2i
    //   3823: ldc_w -829971647
    //   3826: ixor
    //   3827: ldc2_w -1262225350
    //   3830: l2i
    //   3831: ldc_w 667790289
    //   3834: ixor
    //   3835: ixor
    //   3836: lookupswitch default -> 3864, -1826563931 -> 37246, -637498489 -> 3819
    //   3864: aload_0
    //   3865: getstatic Perryc.c : I
    //   3868: iflt -> 3882
    //   3871: ldc2_w -1114471810
    //   3874: l2i
    //   3875: ldc_w 2011213009
    //   3878: ixor
    //   3879: goto -> 3890
    //   3882: ldc2_w 1025258352
    //   3885: l2i
    //   3886: ldc_w 376578739
    //   3889: ixor
    //   3890: ldc2_w -1658920624
    //   3893: l2i
    //   3894: ldc_w -625065591
    //   3897: ixor
    //   3898: ixor
    //   3899: lookupswitch default -> 37420, -1915580810 -> 3882, 1825485082 -> 3924
    //   3924: goto -> 3928
    //   3927: athrow
    //   3928: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   3931: goto -> 3935
    //   3934: athrow
    //   3935: getstatic Perryc.c : I
    //   3938: iflt -> 3952
    //   3941: ldc2_w -29475513
    //   3944: l2i
    //   3945: ldc_w -895002588
    //   3948: ixor
    //   3949: goto -> 3960
    //   3952: ldc2_w -794502788
    //   3955: l2i
    //   3956: ldc_w -367135203
    //   3959: ixor
    //   3960: ldc2_w -1205608871
    //   3963: l2i
    //   3964: ldc_w -1145225207
    //   3967: ixor
    //   3968: ixor
    //   3969: lookupswitch default -> 38156, 923269939 -> 3952, 958902577 -> 3996
    //   3996: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3999: getstatic Perryc.0 : I
    //   4002: ifle -> 4016
    //   4005: ldc2_w -1883824525
    //   4008: l2i
    //   4009: ldc_w 96432926
    //   4012: ixor
    //   4013: goto -> 4024
    //   4016: ldc2_w -156562808
    //   4019: l2i
    //   4020: ldc_w -2140122065
    //   4023: ixor
    //   4024: ldc2_w 792274664
    //   4027: l2i
    //   4028: ldc_w 898963203
    //   4031: ixor
    //   4032: ixor
    //   4033: lookupswitch default -> 37980, -1868276602 -> 4016, 1819766604 -> 4060
    //   4060: goto -> 4064
    //   4063: athrow
    //   4064: invokevirtual getValue : ()Ljava/lang/Object;
    //   4067: goto -> 4071
    //   4070: athrow
    //   4071: checkcast java/lang/Integer
    //   4074: getstatic Perryc.0 : I
    //   4077: ifle -> 4091
    //   4080: ldc2_w 1076779561
    //   4083: l2i
    //   4084: ldc_w -2070563824
    //   4087: ixor
    //   4088: goto -> 4099
    //   4091: ldc2_w -1067363
    //   4094: l2i
    //   4095: ldc_w -783943648
    //   4098: ixor
    //   4099: ldc2_w -1955832341
    //   4102: l2i
    //   4103: ldc_w 1802799289
    //   4106: ixor
    //   4107: ixor
    //   4108: lookupswitch default -> 37910, -827155473 -> 4136, 614677355 -> 4091
    //   4136: goto -> 4140
    //   4139: athrow
    //   4140: invokevirtual intValue : ()I
    //   4143: goto -> 4147
    //   4146: athrow
    //   4147: getstatic Perryc.0 : I
    //   4150: ifle -> 4164
    //   4153: ldc2_w 1610575419
    //   4156: l2i
    //   4157: ldc_w -1781151731
    //   4160: ixor
    //   4161: goto -> 4172
    //   4164: ldc2_w 516968833
    //   4167: l2i
    //   4168: ldc_w -1449609104
    //   4171: ixor
    //   4172: ldc2_w -1054937640
    //   4175: l2i
    //   4176: ldc_w -840590454
    //   4179: ixor
    //   4180: ixor
    //   4181: lookupswitch default -> 38108, -1145856093 -> 4208, -959328156 -> 4164
    //   4208: goto -> 4212
    //   4211: athrow
    //   4212: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   4215: goto -> 4219
    //   4218: athrow
    //   4219: getstatic Perryc.0 : I
    //   4222: ifle -> 4236
    //   4225: ldc2_w -145157306
    //   4228: l2i
    //   4229: ldc_w 81681136
    //   4232: ixor
    //   4233: goto -> 4244
    //   4236: ldc2_w 833306474
    //   4239: l2i
    //   4240: ldc_w 635477904
    //   4243: ixor
    //   4244: ldc2_w -1471766526
    //   4247: l2i
    //   4248: ldc_w 1798467654
    //   4251: ixor
    //   4252: ixor
    //   4253: lookupswitch default -> 4280, 821271026 -> 37462, 1502193837 -> 4236
    //   4280: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4283: getstatic Perryc.0 : I
    //   4286: ifle -> 4300
    //   4289: ldc2_w -444250389
    //   4292: l2i
    //   4293: ldc_w -1622755643
    //   4296: ixor
    //   4297: goto -> 4308
    //   4300: ldc2_w -400601154
    //   4303: l2i
    //   4304: ldc_w -1527080390
    //   4307: ixor
    //   4308: ldc2_w -1672915511
    //   4311: l2i
    //   4312: ldc_w 1558323392
    //   4315: ixor
    //   4316: ixor
    //   4317: lookupswitch default -> 4344, -1323380229 -> 4300, -1167555289 -> 37422
    //   4344: goto -> 4348
    //   4347: athrow
    //   4348: invokevirtual getValue : ()Ljava/lang/Object;
    //   4351: goto -> 4355
    //   4354: athrow
    //   4355: checkcast java/lang/Integer
    //   4358: getstatic Perryc.0 : I
    //   4361: ifle -> 4375
    //   4364: ldc2_w 778029085
    //   4367: l2i
    //   4368: ldc_w 1926346128
    //   4371: ixor
    //   4372: goto -> 4383
    //   4375: ldc2_w -1216257327
    //   4378: l2i
    //   4379: ldc_w -1062334291
    //   4382: ixor
    //   4383: ldc2_w 1613456279
    //   4386: l2i
    //   4387: ldc_w 1638984257
    //   4390: ixor
    //   4391: ixor
    //   4392: lookupswitch default -> 37838, 1561719899 -> 4375, 1991572394 -> 4420
    //   4420: goto -> 4424
    //   4423: athrow
    //   4424: invokevirtual intValue : ()I
    //   4427: goto -> 4431
    //   4430: athrow
    //   4431: getstatic Perryc.c : I
    //   4434: iflt -> 4448
    //   4437: ldc2_w 469331317
    //   4440: l2i
    //   4441: ldc_w -372552414
    //   4444: ixor
    //   4445: goto -> 4456
    //   4448: ldc2_w -1634448713
    //   4451: l2i
    //   4452: ldc_w -813895644
    //   4455: ixor
    //   4456: ldc2_w 1855276309
    //   4459: l2i
    //   4460: ldc_w 1200874718
    //   4463: ixor
    //   4464: ixor
    //   4465: lookupswitch default -> 37520, -617315940 -> 4448, 2028870488 -> 4492
    //   4492: goto -> 4496
    //   4495: athrow
    //   4496: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   4499: goto -> 4503
    //   4502: athrow
    //   4503: getstatic Perryc.c : I
    //   4506: iflt -> 4520
    //   4509: ldc2_w 1059735730
    //   4512: l2i
    //   4513: ldc_w -1897106635
    //   4516: ixor
    //   4517: goto -> 4528
    //   4520: ldc2_w -2072520418
    //   4523: l2i
    //   4524: ldc_w 101206106
    //   4527: ixor
    //   4528: ldc2_w 1612044415
    //   4531: l2i
    //   4532: ldc_w -591155709
    //   4535: ixor
    //   4536: ixor
    //   4537: lookupswitch default -> 4564, -1551108366 -> 4520, 219172347 -> 37936
    //   4564: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4567: getstatic Perryc.0 : I
    //   4570: ifle -> 4584
    //   4573: ldc2_w -1384796256
    //   4576: l2i
    //   4577: ldc_w 440989197
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w -72429157
    //   4587: l2i
    //   4588: ldc_w 1965185956
    //   4591: ixor
    //   4592: ldc2_w 793763447
    //   4595: l2i
    //   4596: ldc_w -434931583
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 4628, -1316756199 -> 4584, 2120351579 -> 37666
    //   4628: goto -> 4632
    //   4631: athrow
    //   4632: invokevirtual getValue : ()Ljava/lang/Object;
    //   4635: goto -> 4639
    //   4638: athrow
    //   4639: checkcast java/lang/Integer
    //   4642: getstatic Perryc.1 : I
    //   4645: ifeq -> 4659
    //   4648: ldc2_w 1470532604
    //   4651: l2i
    //   4652: ldc_w -1707381512
    //   4655: ixor
    //   4656: goto -> 4667
    //   4659: ldc2_w 1058576420
    //   4662: l2i
    //   4663: ldc_w 1493556750
    //   4666: ixor
    //   4667: ldc2_w 1425740569
    //   4670: l2i
    //   4671: ldc_w 1435573885
    //   4674: ixor
    //   4675: ixor
    //   4676: lookupswitch default -> 37368, -856167840 -> 4659, 1735871310 -> 4704
    //   4704: goto -> 4708
    //   4707: athrow
    //   4708: invokevirtual intValue : ()I
    //   4711: goto -> 4715
    //   4714: athrow
    //   4715: getstatic Perryc.c : I
    //   4718: iflt -> 4732
    //   4721: ldc2_w -423951920
    //   4724: l2i
    //   4725: ldc_w -206977045
    //   4728: ixor
    //   4729: goto -> 4740
    //   4732: ldc2_w -528871377
    //   4735: l2i
    //   4736: ldc_w 1970551631
    //   4739: ixor
    //   4740: ldc2_w 638775812
    //   4743: l2i
    //   4744: ldc_w -13259377
    //   4747: ixor
    //   4748: ixor
    //   4749: lookupswitch default -> 4776, -1627987385 -> 4732, -868902480 -> 37800
    //   4776: goto -> 4780
    //   4779: athrow
    //   4780: invokestatic toRGBA : (III)I
    //   4783: goto -> 4787
    //   4786: athrow
    //   4787: getstatic Perryc.0 : I
    //   4790: ifle -> 4804
    //   4793: ldc2_w 563237433
    //   4796: l2i
    //   4797: ldc_w -67548165
    //   4800: ixor
    //   4801: goto -> 4812
    //   4804: ldc2_w 749535086
    //   4807: l2i
    //   4808: ldc_w -263432861
    //   4811: ixor
    //   4812: ldc2_w 938887600
    //   4815: l2i
    //   4816: ldc_w 2147196041
    //   4819: ixor
    //   4820: ixor
    //   4821: lookupswitch default -> 4848, -1838756613 -> 37358, -1167583201 -> 4804
    //   4848: putfield color : I
    //   4851: getstatic Perryc.c : I
    //   4854: iflt -> 4868
    //   4857: ldc2_w -1990307372
    //   4860: l2i
    //   4861: ldc_w -2115653685
    //   4864: ixor
    //   4865: goto -> 4876
    //   4868: ldc2_w 1448064930
    //   4871: l2i
    //   4872: ldc_w -2103712739
    //   4875: ixor
    //   4876: ldc2_w 460257378
    //   4879: l2i
    //   4880: ldc_w 285962469
    //   4883: ixor
    //   4884: ixor
    //   4885: lookupswitch default -> 37944, -558769352 -> 4912, 48133784 -> 4868
    //   4912: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   4915: ldc_w '䯹㌆䮮坈公ꕶ๠㙮ධ'
    //   4918: getstatic Perryc.1 : I
    //   4921: ifeq -> 4935
    //   4924: ldc2_w -1894321564
    //   4927: l2i
    //   4928: ldc_w 595876755
    //   4931: ixor
    //   4932: goto -> 4943
    //   4935: ldc2_w 1051063751
    //   4938: l2i
    //   4939: ldc_w 1604558165
    //   4942: ixor
    //   4943: ldc2_w 1403642659
    //   4946: l2i
    //   4947: ldc_w 1082185027
    //   4950: ixor
    //   4951: ixor
    //   4952: lookupswitch default -> 4980, -1078222953 -> 37884, 1019674546 -> 4935
    //   4980: goto -> 4984
    //   4983: athrow
    //   4984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4987: goto -> 4991
    //   4990: athrow
    //   4991: getstatic Perryc.0 : I
    //   4994: ifle -> 5008
    //   4997: ldc2_w 640941280
    //   5000: l2i
    //   5001: ldc_w 1000591625
    //   5004: ixor
    //   5005: goto -> 5016
    //   5008: ldc2_w -1836233780
    //   5011: l2i
    //   5012: ldc_w -1429707411
    //   5015: ixor
    //   5016: ldc2_w 1439554805
    //   5019: l2i
    //   5020: ldc_w 881826752
    //   5023: ixor
    //   5024: ixor
    //   5025: lookupswitch default -> 37278, 1493658004 -> 5052, 2094164700 -> 5008
    //   5052: goto -> 5056
    //   5055: athrow
    //   5056: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   5059: goto -> 5063
    //   5062: athrow
    //   5063: getstatic Perryc.0 : I
    //   5066: ifle -> 5080
    //   5069: ldc2_w -1245187728
    //   5072: l2i
    //   5073: ldc_w 1461274699
    //   5076: ixor
    //   5077: goto -> 5088
    //   5080: ldc2_w 1972181233
    //   5083: l2i
    //   5084: ldc_w -1868872386
    //   5087: ixor
    //   5088: ldc2_w 519819328
    //   5091: l2i
    //   5092: ldc_w 1648740010
    //   5095: ixor
    //   5096: ixor
    //   5097: lookupswitch default -> 5124, -1637830703 -> 37634, 92414432 -> 5080
    //   5124: goto -> 5128
    //   5127: athrow
    //   5128: invokevirtual isEnabled : ()Z
    //   5131: goto -> 5135
    //   5134: athrow
    //   5135: ifeq -> 5149
    //   5138: ldc2_w 1641825707
    //   5141: l2i
    //   5142: ldc_w -1416707179
    //   5145: ixor
    //   5146: goto -> 5157
    //   5149: ldc2_w -1153023959
    //   5152: l2i
    //   5153: ldc_w 1897186838
    //   5156: ixor
    //   5157: ldc2_w 1706650023
    //   5160: l2i
    //   5161: ldc_w 1212017319
    //   5164: ixor
    //   5165: ixor
    //   5166: tableswitch default -> 5138, -405404354 -> 5188, -405404353 -> 10383
    //   5188: getstatic Perryc.1 : I
    //   5191: ifeq -> 5205
    //   5194: ldc2_w -1184537843
    //   5197: l2i
    //   5198: ldc_w 1281040074
    //   5201: ixor
    //   5202: goto -> 5213
    //   5205: ldc2_w 1524847582
    //   5208: l2i
    //   5209: ldc_w -433272388
    //   5212: ixor
    //   5213: ldc2_w 1145852659
    //   5216: l2i
    //   5217: ldc_w 1657453035
    //   5220: ixor
    //   5221: ixor
    //   5222: lookupswitch default -> 37242, -1706462854 -> 5248, -742877473 -> 5205
    //   5248: goto -> 5252
    //   5251: athrow
    //   5252: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   5255: goto -> 5259
    //   5258: athrow
    //   5259: getstatic Perryc.0 : I
    //   5262: ifle -> 5276
    //   5265: ldc2_w -365186297
    //   5268: l2i
    //   5269: ldc_w 230436447
    //   5272: ixor
    //   5273: goto -> 5284
    //   5276: ldc2_w 31578145
    //   5279: l2i
    //   5280: ldc_w -498884420
    //   5283: ixor
    //   5284: ldc2_w 555473852
    //   5287: l2i
    //   5288: ldc_w -1959426272
    //   5291: ixor
    //   5292: ixor
    //   5293: lookupswitch default -> 37300, 1233921025 -> 5320, 1302970820 -> 5276
    //   5320: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5323: getstatic Perryc.0 : I
    //   5326: ifle -> 5340
    //   5329: ldc2_w 880654207
    //   5332: l2i
    //   5333: ldc_w 135570365
    //   5336: ixor
    //   5337: goto -> 5348
    //   5340: ldc2_w -1301621067
    //   5343: l2i
    //   5344: ldc_w -1354333779
    //   5347: ixor
    //   5348: ldc2_w 1084204084
    //   5351: l2i
    //   5352: ldc_w -716459513
    //   5355: ixor
    //   5356: ixor
    //   5357: lookupswitch default -> 38178, -1996996309 -> 5384, -1447230735 -> 5340
    //   5384: goto -> 5388
    //   5387: athrow
    //   5388: invokevirtual getValue : ()Ljava/lang/Object;
    //   5391: goto -> 5395
    //   5394: athrow
    //   5395: checkcast java/lang/Boolean
    //   5398: getstatic Perryc.0 : I
    //   5401: ifle -> 5415
    //   5404: ldc2_w 2116295383
    //   5407: l2i
    //   5408: ldc_w 1219941911
    //   5411: ixor
    //   5412: goto -> 5423
    //   5415: ldc2_w -754103839
    //   5418: l2i
    //   5419: ldc_w -1047711902
    //   5422: ixor
    //   5423: ldc2_w -776944274
    //   5426: l2i
    //   5427: ldc_w -1070183606
    //   5430: ixor
    //   5431: ixor
    //   5432: lookupswitch default -> 37450, 50784423 -> 5460, 655639268 -> 5415
    //   5460: goto -> 5464
    //   5463: athrow
    //   5464: invokevirtual booleanValue : ()Z
    //   5467: goto -> 5471
    //   5470: athrow
    //   5471: ifeq -> 5485
    //   5474: ldc2_w -1748943836
    //   5477: l2i
    //   5478: ldc_w -1669368433
    //   5481: ixor
    //   5482: goto -> 5493
    //   5485: ldc2_w -531335879
    //   5488: l2i
    //   5489: ldc_w -336970607
    //   5492: ixor
    //   5493: ldc2_w -543365642
    //   5496: l2i
    //   5497: ldc_w 1720138164
    //   5500: ixor
    //   5501: ixor
    //   5502: tableswitch default -> 5474, -1297771031 -> 5524, -1297771030 -> 9706
    //   5524: getstatic Perryc.1 : I
    //   5527: ifeq -> 5541
    //   5530: ldc2_w -830159274
    //   5533: l2i
    //   5534: ldc_w -2124392530
    //   5537: ixor
    //   5538: goto -> 5549
    //   5541: ldc2_w 1692109762
    //   5544: l2i
    //   5545: ldc_w -1143021552
    //   5548: ixor
    //   5549: ldc2_w -1363391679
    //   5552: l2i
    //   5553: ldc_w -315136837
    //   5556: ixor
    //   5557: ixor
    //   5558: lookupswitch default -> 37778, -1668398040 -> 5584, 208649730 -> 5541
    //   5584: goto -> 5588
    //   5587: athrow
    //   5588: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   5591: goto -> 5595
    //   5594: athrow
    //   5595: getstatic Perryc.c : I
    //   5598: iflt -> 5612
    //   5601: ldc2_w -1117663063
    //   5604: l2i
    //   5605: ldc_w 1489648002
    //   5608: ixor
    //   5609: goto -> 5620
    //   5612: ldc2_w 1663946889
    //   5615: l2i
    //   5616: ldc_w -882645834
    //   5619: ixor
    //   5620: ldc2_w 1353193497
    //   5623: l2i
    //   5624: ldc_w 794713616
    //   5627: ixor
    //   5628: ixor
    //   5629: lookupswitch default -> 5656, -1705136350 -> 38060, -219443279 -> 5612
    //   5656: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5659: getstatic Perryc.0 : I
    //   5662: ifle -> 5676
    //   5665: ldc2_w -883065045
    //   5668: l2i
    //   5669: ldc_w 1270976884
    //   5672: ixor
    //   5673: goto -> 5684
    //   5676: ldc2_w 1535105057
    //   5679: l2i
    //   5680: ldc_w 1289168399
    //   5683: ixor
    //   5684: ldc2_w -71043356
    //   5687: l2i
    //   5688: ldc_w -890355103
    //   5691: ixor
    //   5692: ixor
    //   5693: lookupswitch default -> 5720, -2031683496 -> 5676, -1313776934 -> 37526
    //   5720: goto -> 5724
    //   5723: athrow
    //   5724: invokevirtual getValue : ()Ljava/lang/Object;
    //   5727: goto -> 5731
    //   5730: athrow
    //   5731: getstatic Perryc.0 : I
    //   5734: ifle -> 5748
    //   5737: ldc2_w -1011853869
    //   5740: l2i
    //   5741: ldc_w 299288735
    //   5744: ixor
    //   5745: goto -> 5756
    //   5748: ldc2_w -634513079
    //   5751: l2i
    //   5752: ldc_w -227379393
    //   5755: ixor
    //   5756: ldc2_w -118246108
    //   5759: l2i
    //   5760: ldc_w -1579811781
    //   5763: ixor
    //   5764: ixor
    //   5765: lookupswitch default -> 38110, -1958685613 -> 5748, 1903830889 -> 5792
    //   5792: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   5795: if_acmpne -> 5809
    //   5798: ldc2_w -614088087
    //   5801: l2i
    //   5802: ldc_w 1711772814
    //   5805: ixor
    //   5806: goto -> 5817
    //   5809: ldc2_w -4056510
    //   5812: l2i
    //   5813: ldc_w 1117801636
    //   5816: ixor
    //   5817: ldc2_w 1832042904
    //   5820: l2i
    //   5821: ldc_w -1785657695
    //   5824: ixor
    //   5825: ixor
    //   5826: tableswitch default -> 5798, 1170313694 -> 5848, 1170313695 -> 6830
    //   5848: getstatic Perryc.c : I
    //   5851: iflt -> 5865
    //   5854: ldc2_w -173006062
    //   5857: l2i
    //   5858: ldc_w -1103729141
    //   5861: ixor
    //   5862: goto -> 5873
    //   5865: ldc2_w 745171065
    //   5868: l2i
    //   5869: ldc_w 1546371709
    //   5872: ixor
    //   5873: ldc2_w -659307313
    //   5876: l2i
    //   5877: ldc_w 185589413
    //   5880: ixor
    //   5881: ixor
    //   5882: lookupswitch default -> 37550, -1741006989 -> 5865, -1543655314 -> 5908
    //   5908: aload_0
    //   5909: getstatic Perryc.c : I
    //   5912: iflt -> 5926
    //   5915: ldc2_w 370860318
    //   5918: l2i
    //   5919: ldc_w -1982012724
    //   5922: ixor
    //   5923: goto -> 5934
    //   5926: ldc2_w 1291126628
    //   5929: l2i
    //   5930: ldc_w -2055307944
    //   5933: ixor
    //   5934: ldc2_w 2116818923
    //   5937: l2i
    //   5938: ldc_w -826197868
    //   5941: ixor
    //   5942: ixor
    //   5943: lookupswitch default -> 5968, -722196533 -> 5926, 791358637 -> 37986
    //   5968: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   5971: getstatic Perryc.1 : I
    //   5974: ifeq -> 5988
    //   5977: ldc2_w 1272383605
    //   5980: l2i
    //   5981: ldc_w 579949234
    //   5984: ixor
    //   5985: goto -> 5996
    //   5988: ldc2_w 1720470968
    //   5991: l2i
    //   5992: ldc_w -1901590297
    //   5995: ixor
    //   5996: ldc2_w 1304988389
    //   5999: l2i
    //   6000: ldc_w 2012782319
    //   6003: ixor
    //   6004: ixor
    //   6005: lookupswitch default -> 37606, -770420395 -> 6032, 1400262349 -> 5988
    //   6032: aload_1
    //   6033: ldc_w 4.40656E37
    //   6036: invokestatic floatToIntBits : (F)I
    //   6039: ldc_w 2114231015
    //   6042: ixor
    //   6043: invokestatic intBitsToFloat : (I)F
    //   6046: getstatic Perryc.0 : I
    //   6049: ifle -> 6063
    //   6052: ldc2_w 1435096309
    //   6055: l2i
    //   6056: ldc_w -2028842022
    //   6059: ixor
    //   6060: goto -> 6071
    //   6063: ldc2_w 2069386404
    //   6066: l2i
    //   6067: ldc_w -1837794066
    //   6070: ixor
    //   6071: ldc2_w 1122552734
    //   6074: l2i
    //   6075: ldc_w -2111712830
    //   6078: ixor
    //   6079: ixor
    //   6080: lookupswitch default -> 38174, 307404147 -> 6063, 702820886 -> 6108
    //   6108: aload_0
    //   6109: getstatic Perryc.1 : I
    //   6112: ifeq -> 6126
    //   6115: ldc2_w 1118340248
    //   6118: l2i
    //   6119: ldc_w 1406193747
    //   6122: ixor
    //   6123: goto -> 6134
    //   6126: ldc2_w -1525548354
    //   6129: l2i
    //   6130: ldc_w -864802306
    //   6133: ixor
    //   6134: ldc2_w 629112451
    //   6137: l2i
    //   6138: ldc_w -1131428996
    //   6141: ixor
    //   6142: ixor
    //   6143: lookupswitch default -> 37474, -2004293324 -> 6126, -258642241 -> 6168
    //   6168: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6171: getstatic Perryc.c : I
    //   6174: iflt -> 6188
    //   6177: ldc2_w -1345370989
    //   6180: l2i
    //   6181: ldc_w 1452342277
    //   6184: ixor
    //   6185: goto -> 6196
    //   6188: ldc2_w -1461286370
    //   6191: l2i
    //   6192: ldc_w -1688066096
    //   6195: ixor
    //   6196: ldc2_w 1509785770
    //   6199: l2i
    //   6200: ldc_w 2097713043
    //   6203: ixor
    //   6204: ixor
    //   6205: lookupswitch default -> 6232, -576014417 -> 38010, 497877074 -> 6188
    //   6232: goto -> 6236
    //   6235: athrow
    //   6236: invokevirtual getValue : ()Ljava/lang/Object;
    //   6239: goto -> 6243
    //   6242: athrow
    //   6243: checkcast java/lang/Integer
    //   6246: getstatic Perryc.1 : I
    //   6249: ifeq -> 6263
    //   6252: ldc2_w -2089907112
    //   6255: l2i
    //   6256: ldc_w 247795307
    //   6259: ixor
    //   6260: goto -> 6271
    //   6263: ldc2_w 445693797
    //   6266: l2i
    //   6267: ldc_w 1575022201
    //   6270: ixor
    //   6271: ldc2_w 92717798
    //   6274: l2i
    //   6275: ldc_w -207649203
    //   6278: ixor
    //   6279: ixor
    //   6280: lookupswitch default -> 6308, 2016504395 -> 6263, 2075313816 -> 38094
    //   6308: goto -> 6312
    //   6311: athrow
    //   6312: invokevirtual intValue : ()I
    //   6315: goto -> 6319
    //   6318: athrow
    //   6319: i2f
    //   6320: getstatic Perryc.c : I
    //   6323: iflt -> 6337
    //   6326: ldc2_w 1518945793
    //   6329: l2i
    //   6330: ldc_w 1864743005
    //   6333: ixor
    //   6334: goto -> 6345
    //   6337: ldc2_w 1122770077
    //   6340: l2i
    //   6341: ldc_w -1565146270
    //   6344: ixor
    //   6345: ldc2_w 8129693
    //   6348: l2i
    //   6349: ldc_w -1619757843
    //   6352: ixor
    //   6353: ixor
    //   6354: lookupswitch default -> 38008, -1432058324 -> 6337, 2136057743 -> 6380
    //   6380: goto -> 6384
    //   6383: athrow
    //   6384: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   6387: goto -> 6391
    //   6390: athrow
    //   6391: getstatic Perryc.c : I
    //   6394: iflt -> 6408
    //   6397: ldc2_w 923817875
    //   6400: l2i
    //   6401: ldc_w 151000132
    //   6404: ixor
    //   6405: goto -> 6416
    //   6408: ldc2_w 420762603
    //   6411: l2i
    //   6412: ldc_w 695161243
    //   6415: ixor
    //   6416: ldc2_w 1668707878
    //   6419: l2i
    //   6420: ldc_w -1201724779
    //   6423: ixor
    //   6424: ixor
    //   6425: lookupswitch default -> 6452, -449243292 -> 38188, 1240507190 -> 6408
    //   6452: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6455: getstatic Perryc.1 : I
    //   6458: ifeq -> 6472
    //   6461: ldc2_w -240564507
    //   6464: l2i
    //   6465: ldc_w -820165602
    //   6468: ixor
    //   6469: goto -> 6480
    //   6472: ldc2_w 1925106298
    //   6475: l2i
    //   6476: ldc_w 1530821662
    //   6479: ixor
    //   6480: ldc2_w -911507938
    //   6483: l2i
    //   6484: ldc_w -1096779557
    //   6487: ixor
    //   6488: ixor
    //   6489: lookupswitch default -> 6516, -1598747573 -> 6472, 1237255230 -> 37696
    //   6516: goto -> 6520
    //   6519: athrow
    //   6520: invokevirtual getValue : ()Ljava/lang/Object;
    //   6523: goto -> 6527
    //   6526: athrow
    //   6527: checkcast java/lang/Integer
    //   6530: getstatic Perryc.1 : I
    //   6533: ifeq -> 6547
    //   6536: ldc2_w 1919555223
    //   6539: l2i
    //   6540: ldc_w 826206542
    //   6543: ixor
    //   6544: goto -> 6555
    //   6547: ldc2_w 1930277689
    //   6550: l2i
    //   6551: ldc_w 1678277416
    //   6554: ixor
    //   6555: ldc2_w 77921318
    //   6558: l2i
    //   6559: ldc_w 122906555
    //   6562: ixor
    //   6563: ixor
    //   6564: lookupswitch default -> 6592, -449497881 -> 6547, 1084449860 -> 37488
    //   6592: goto -> 6596
    //   6595: athrow
    //   6596: invokevirtual intValue : ()I
    //   6599: goto -> 6603
    //   6602: athrow
    //   6603: getstatic Perryc.0 : I
    //   6606: ifle -> 6620
    //   6609: ldc2_w 1304476639
    //   6612: l2i
    //   6613: ldc_w 360929201
    //   6616: ixor
    //   6617: goto -> 6628
    //   6620: ldc2_w 940633669
    //   6623: l2i
    //   6624: ldc_w 1139974104
    //   6627: ixor
    //   6628: ldc2_w -505967032
    //   6631: l2i
    //   6632: ldc_w 2106151812
    //   6635: ixor
    //   6636: ixor
    //   6637: lookupswitch default -> 6664, -1004719710 -> 37906, 33429231 -> 6620
    //   6664: goto -> 6668
    //   6667: athrow
    //   6668: invokestatic rainbow : (I)Ljava/awt/Color;
    //   6671: goto -> 6675
    //   6674: athrow
    //   6675: getstatic Perryc.1 : I
    //   6678: ifeq -> 6692
    //   6681: ldc2_w 44983460
    //   6684: l2i
    //   6685: ldc_w 18074611
    //   6688: ixor
    //   6689: goto -> 6700
    //   6692: ldc2_w -2028704439
    //   6695: l2i
    //   6696: ldc_w 1232719359
    //   6699: ixor
    //   6700: ldc2_w 36723081
    //   6703: l2i
    //   6704: ldc_w 1266356852
    //   6707: ixor
    //   6708: ixor
    //   6709: lookupswitch default -> 37668, -2027492533 -> 6736, 1257694378 -> 6692
    //   6736: goto -> 6740
    //   6739: athrow
    //   6740: invokevirtual getRGB : ()I
    //   6743: goto -> 6747
    //   6746: athrow
    //   6747: ldc2_w 1645877101
    //   6750: l2i
    //   6751: ldc_w 1645877100
    //   6754: ixor
    //   6755: getstatic Perryc.c : I
    //   6758: iflt -> 6772
    //   6761: ldc2_w 1872874454
    //   6764: l2i
    //   6765: ldc_w -626593634
    //   6768: ixor
    //   6769: goto -> 6780
    //   6772: ldc2_w 1268581602
    //   6775: l2i
    //   6776: ldc_w -956730604
    //   6779: ixor
    //   6780: ldc2_w 359219037
    //   6783: l2i
    //   6784: ldc_w 895771989
    //   6787: ixor
    //   6788: ixor
    //   6789: lookupswitch default -> 37736, -1794481856 -> 6772, -1385615874 -> 6816
    //   6816: goto -> 6820
    //   6819: athrow
    //   6820: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   6823: goto -> 6827
    //   6826: athrow
    //   6827: goto -> 10383
    //   6830: ldc2_w -1496793794
    //   6833: l2i
    //   6834: ldc_w -1496793793
    //   6837: ixor
    //   6838: newarray int
    //   6840: dup
    //   6841: ldc2_w -1770425141
    //   6844: l2i
    //   6845: ldc_w -1770425141
    //   6848: ixor
    //   6849: ldc2_w -373558716
    //   6852: l2i
    //   6853: ldc_w -373558715
    //   6856: ixor
    //   6857: iastore
    //   6858: getstatic Perryc.1 : I
    //   6861: ifeq -> 6875
    //   6864: ldc2_w 571130696
    //   6867: l2i
    //   6868: ldc_w -743802456
    //   6871: ixor
    //   6872: goto -> 6883
    //   6875: ldc2_w 850972925
    //   6878: l2i
    //   6879: ldc_w 451183690
    //   6882: ixor
    //   6883: ldc2_w -1620632395
    //   6886: l2i
    //   6887: ldc_w 615926882
    //   6890: ixor
    //   6891: ixor
    //   6892: lookupswitch default -> 6920, 1248979511 -> 37340, 2066157373 -> 6875
    //   6920: astore #7
    //   6922: getstatic Perryc.0 : I
    //   6925: ifle -> 6939
    //   6928: ldc2_w 630052382
    //   6931: l2i
    //   6932: ldc_w 1201969235
    //   6935: ixor
    //   6936: goto -> 6947
    //   6939: ldc2_w -1894920212
    //   6942: l2i
    //   6943: ldc_w -1639414357
    //   6946: ixor
    //   6947: ldc2_w 1542340198
    //   6950: l2i
    //   6951: ldc_w -817516420
    //   6954: ixor
    //   6955: ixor
    //   6956: lookupswitch default -> 37256, -2047949731 -> 6984, -159203241 -> 6939
    //   6984: aload_1
    //   6985: getstatic Perryc.1 : I
    //   6988: ifeq -> 7002
    //   6991: ldc2_w 1945625573
    //   6994: l2i
    //   6995: ldc_w 391338094
    //   6998: ixor
    //   6999: goto -> 7010
    //   7002: ldc2_w 66240429
    //   7005: l2i
    //   7006: ldc_w 928657311
    //   7009: ixor
    //   7010: ldc2_w 642572278
    //   7013: l2i
    //   7014: ldc_w 1295946592
    //   7017: ixor
    //   7018: ixor
    //   7019: lookupswitch default -> 38036, 265746205 -> 7002, 1608178852 -> 7044
    //   7044: goto -> 7048
    //   7047: athrow
    //   7048: invokevirtual toCharArray : ()[C
    //   7051: goto -> 7055
    //   7054: athrow
    //   7055: getstatic Perryc.c : I
    //   7058: iflt -> 7072
    //   7061: ldc2_w 698594699
    //   7064: l2i
    //   7065: ldc_w -1615913732
    //   7068: ixor
    //   7069: goto -> 7080
    //   7072: ldc2_w 1267627542
    //   7075: l2i
    //   7076: ldc_w 187075511
    //   7079: ixor
    //   7080: ldc2_w 1232220077
    //   7083: l2i
    //   7084: ldc_w 690596601
    //   7087: ixor
    //   7088: ixor
    //   7089: lookupswitch default -> 7116, -698930141 -> 37628, 1991855832 -> 7072
    //   7116: astore #8
    //   7118: ldc_w 2.4985793E38
    //   7121: invokestatic floatToIntBits : (F)I
    //   7124: ldc_w 2134636771
    //   7127: ixor
    //   7128: invokestatic intBitsToFloat : (I)F
    //   7131: getstatic Perryc.0 : I
    //   7134: ifle -> 7148
    //   7137: ldc2_w -2045252164
    //   7140: l2i
    //   7141: ldc_w 1037333230
    //   7144: ixor
    //   7145: goto -> 7156
    //   7148: ldc2_w 302742856
    //   7151: l2i
    //   7152: ldc_w -95421803
    //   7155: ixor
    //   7156: ldc2_w 1622195752
    //   7159: l2i
    //   7160: ldc_w -1582494382
    //   7163: ixor
    //   7164: ixor
    //   7165: lookupswitch default -> 37460, 693712039 -> 7192, 2061380648 -> 7148
    //   7192: fstore #9
    //   7194: getstatic Perryc.1 : I
    //   7197: ifeq -> 7211
    //   7200: ldc2_w 449371090
    //   7203: l2i
    //   7204: ldc_w -1108849835
    //   7207: ixor
    //   7208: goto -> 7219
    //   7211: ldc2_w 1603673010
    //   7214: l2i
    //   7215: ldc_w -1586267445
    //   7218: ixor
    //   7219: ldc2_w 1347159590
    //   7222: l2i
    //   7223: ldc_w -357683862
    //   7226: ixor
    //   7227: ixor
    //   7228: lookupswitch default -> 7256, 499301323 -> 37882, 1350735887 -> 7211
    //   7256: aload #8
    //   7258: getstatic Perryc.c : I
    //   7261: iflt -> 7275
    //   7264: ldc2_w -355141533
    //   7267: l2i
    //   7268: ldc_w -1609890201
    //   7271: ixor
    //   7272: goto -> 7283
    //   7275: ldc2_w -292099384
    //   7278: l2i
    //   7279: ldc_w -1046931526
    //   7282: ixor
    //   7283: ldc2_w -239833553
    //   7286: l2i
    //   7287: ldc_w 66257339
    //   7290: ixor
    //   7291: ixor
    //   7292: lookupswitch default -> 7320, -1197960816 -> 37796, 1087214133 -> 7275
    //   7320: astore #10
    //   7322: getstatic Perryc.0 : I
    //   7325: ifle -> 7339
    //   7328: ldc2_w 1624593063
    //   7331: l2i
    //   7332: ldc_w -1136323169
    //   7335: ixor
    //   7336: goto -> 7347
    //   7339: ldc2_w -552137586
    //   7342: l2i
    //   7343: ldc_w 724064969
    //   7346: ixor
    //   7347: ldc2_w -2092088855
    //   7350: l2i
    //   7351: ldc_w -1258577798
    //   7354: ixor
    //   7355: ixor
    //   7356: lookupswitch default -> 7384, -1834634594 -> 7339, -349788501 -> 37692
    //   7384: aload #10
    //   7386: arraylength
    //   7387: getstatic Perryc.1 : I
    //   7390: ifeq -> 7404
    //   7393: ldc2_w -1501768253
    //   7396: l2i
    //   7397: ldc_w 908811084
    //   7400: ixor
    //   7401: goto -> 7412
    //   7404: ldc2_w -537473376
    //   7407: l2i
    //   7408: ldc_w 1539081799
    //   7411: ixor
    //   7412: ldc2_w -1415572689
    //   7415: l2i
    //   7416: ldc_w 543990484
    //   7419: ixor
    //   7420: ixor
    //   7421: lookupswitch default -> 7448, -2093528039 -> 7404, 463159156 -> 37650
    //   7448: istore #11
    //   7450: ldc2_w -343771884
    //   7453: l2i
    //   7454: ldc_w -343771884
    //   7457: ixor
    //   7458: getstatic Perryc.1 : I
    //   7461: ifeq -> 7475
    //   7464: ldc2_w -772515111
    //   7467: l2i
    //   7468: ldc_w -56070122
    //   7471: ixor
    //   7472: goto -> 7483
    //   7475: ldc2_w 1180408552
    //   7478: l2i
    //   7479: ldc_w 445049721
    //   7482: ixor
    //   7483: ldc2_w -268950523
    //   7486: l2i
    //   7487: ldc_w -1107706361
    //   7490: ixor
    //   7491: ixor
    //   7492: lookupswitch default -> 37374, 249359251 -> 7520, 2136846541 -> 7475
    //   7520: istore #12
    //   7522: getstatic Perryc.c : I
    //   7525: iflt -> 7539
    //   7528: ldc2_w 760989902
    //   7531: l2i
    //   7532: ldc_w 771092373
    //   7535: ixor
    //   7536: goto -> 7547
    //   7539: ldc2_w 1562308502
    //   7542: l2i
    //   7543: ldc_w 1178276752
    //   7546: ixor
    //   7547: ldc2_w -1811250129
    //   7550: l2i
    //   7551: ldc_w 1476582741
    //   7554: ixor
    //   7555: ixor
    //   7556: lookupswitch default -> 7584, -861503967 -> 37876, 2073772794 -> 7539
    //   7584: iload #12
    //   7586: getstatic Perryc.c : I
    //   7589: iflt -> 7603
    //   7592: ldc2_w 2080700016
    //   7595: l2i
    //   7596: ldc_w -180508652
    //   7599: ixor
    //   7600: goto -> 7611
    //   7603: ldc2_w -930073962
    //   7606: l2i
    //   7607: ldc_w 190484233
    //   7610: ixor
    //   7611: ldc2_w -1297436724
    //   7614: l2i
    //   7615: ldc_w 627423869
    //   7618: ixor
    //   7619: ixor
    //   7620: lookupswitch default -> 37484, 519457749 -> 7603, 1409656878 -> 7648
    //   7648: iload #11
    //   7650: if_icmpge -> 7664
    //   7653: ldc2_w 885452447
    //   7656: l2i
    //   7657: ldc_w -1873711564
    //   7660: ixor
    //   7661: goto -> 7672
    //   7664: ldc2_w -1006982860
    //   7667: l2i
    //   7668: ldc_w 1735207326
    //   7671: ixor
    //   7672: ldc2_w 487384308
    //   7675: l2i
    //   7676: ldc_w 1128438699
    //   7679: ixor
    //   7680: ixor
    //   7681: tableswitch default -> 7653, -86376460 -> 7704, -86376459 -> 9703
    //   7704: getstatic Perryc.c : I
    //   7707: iflt -> 7721
    //   7710: ldc2_w -520443237
    //   7713: l2i
    //   7714: ldc_w -1343011691
    //   7717: ixor
    //   7718: goto -> 7729
    //   7721: ldc2_w -1553872606
    //   7724: l2i
    //   7725: ldc_w 752495520
    //   7728: ixor
    //   7729: ldc2_w -1988115014
    //   7732: l2i
    //   7733: ldc_w 751235132
    //   7736: ixor
    //   7737: ixor
    //   7738: lookupswitch default -> 38162, -357508216 -> 7721, 704829188 -> 7764
    //   7764: aload #10
    //   7766: getstatic Perryc.c : I
    //   7769: iflt -> 7783
    //   7772: ldc2_w -2057323894
    //   7775: l2i
    //   7776: ldc_w 183482189
    //   7779: ixor
    //   7780: goto -> 7791
    //   7783: ldc2_w 1162118206
    //   7786: l2i
    //   7787: ldc_w 780800748
    //   7790: ixor
    //   7791: ldc2_w -228072707
    //   7794: l2i
    //   7795: ldc_w -640596301
    //   7798: ixor
    //   7799: ixor
    //   7800: lookupswitch default -> 37676, -1543067255 -> 7783, 1081619100 -> 7828
    //   7828: iload #12
    //   7830: caload
    //   7831: getstatic Perryc.1 : I
    //   7834: ifeq -> 7848
    //   7837: ldc2_w 2020684770
    //   7840: l2i
    //   7841: ldc_w 88922335
    //   7844: ixor
    //   7845: goto -> 7856
    //   7848: ldc2_w -274292084
    //   7851: l2i
    //   7852: ldc_w 1408184147
    //   7855: ixor
    //   7856: ldc2_w 2111210542
    //   7859: l2i
    //   7860: ldc_w 1281756454
    //   7863: ixor
    //   7864: ixor
    //   7865: lookupswitch default -> 37590, -1913060137 -> 7892, 1284334133 -> 7848
    //   7892: istore #13
    //   7894: getstatic Perryc.0 : I
    //   7897: ifle -> 7911
    //   7900: ldc2_w -811521261
    //   7903: l2i
    //   7904: ldc_w -907856193
    //   7907: ixor
    //   7908: goto -> 7919
    //   7911: ldc2_w 783356053
    //   7914: l2i
    //   7915: ldc_w -418814389
    //   7918: ixor
    //   7919: ldc2_w 636639819
    //   7922: l2i
    //   7923: ldc_w -1763388779
    //   7926: ixor
    //   7927: ixor
    //   7928: lookupswitch default -> 7956, -1252747918 -> 37812, -642440309 -> 7911
    //   7956: aload_0
    //   7957: getstatic Perryc.0 : I
    //   7960: ifle -> 7974
    //   7963: ldc2_w -1937115032
    //   7966: l2i
    //   7967: ldc_w -1130530387
    //   7970: ixor
    //   7971: goto -> 7982
    //   7974: ldc2_w 2037972793
    //   7977: l2i
    //   7978: ldc_w -469698513
    //   7981: ixor
    //   7982: ldc2_w 267934277
    //   7985: l2i
    //   7986: ldc_w 465227090
    //   7989: ixor
    //   7990: ixor
    //   7991: lookupswitch default -> 8016, -151700485 -> 7974, 609621714 -> 38180
    //   8016: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   8019: getstatic Perryc.1 : I
    //   8022: ifeq -> 8036
    //   8025: ldc2_w 380998003
    //   8028: l2i
    //   8029: ldc_w 245007470
    //   8032: ixor
    //   8033: goto -> 8044
    //   8036: ldc2_w 225534679
    //   8039: l2i
    //   8040: ldc_w -1148980388
    //   8043: ixor
    //   8044: ldc2_w -181835095
    //   8047: l2i
    //   8048: ldc_w -1850508497
    //   8051: ixor
    //   8052: ixor
    //   8053: lookupswitch default -> 8080, 71611454 -> 8036, 2092237979 -> 37984
    //   8080: iload #13
    //   8082: getstatic Perryc.c : I
    //   8085: iflt -> 8099
    //   8088: ldc2_w 2073076252
    //   8091: l2i
    //   8092: ldc_w 1526462036
    //   8095: ixor
    //   8096: goto -> 8107
    //   8099: ldc2_w 272988320
    //   8102: l2i
    //   8103: ldc_w 860470249
    //   8106: ixor
    //   8107: ldc2_w -986179046
    //   8110: l2i
    //   8111: ldc_w 524341221
    //   8114: ixor
    //   8115: ixor
    //   8116: lookupswitch default -> 37162, -109832522 -> 8144, -82607689 -> 8099
    //   8144: goto -> 8148
    //   8147: athrow
    //   8148: invokestatic valueOf : (C)Ljava/lang/String;
    //   8151: goto -> 8155
    //   8154: athrow
    //   8155: ldc_w 8.602509E37
    //   8158: invokestatic floatToIntBits : (F)I
    //   8161: ldc_w 2122411945
    //   8164: ixor
    //   8165: invokestatic intBitsToFloat : (I)F
    //   8168: getstatic Perryc.1 : I
    //   8171: ifeq -> 8185
    //   8174: ldc2_w -1096616088
    //   8177: l2i
    //   8178: ldc_w -381845244
    //   8181: ixor
    //   8182: goto -> 8193
    //   8185: ldc2_w 1104258608
    //   8188: l2i
    //   8189: ldc_w 1404800828
    //   8192: ixor
    //   8193: ldc2_w -142786356
    //   8196: l2i
    //   8197: ldc_w 902602914
    //   8200: ixor
    //   8201: ixor
    //   8202: lookupswitch default -> 8228, -1792109054 -> 37600, 1599205072 -> 8185
    //   8228: fload #9
    //   8230: fadd
    //   8231: getstatic Perryc.c : I
    //   8234: iflt -> 8248
    //   8237: ldc2_w 97461738
    //   8240: l2i
    //   8241: ldc_w 1405291912
    //   8244: ixor
    //   8245: goto -> 8256
    //   8248: ldc2_w -704445387
    //   8251: l2i
    //   8252: ldc_w -1091045600
    //   8255: ixor
    //   8256: ldc2_w 679067401
    //   8259: l2i
    //   8260: ldc_w -332870362
    //   8263: ixor
    //   8264: ixor
    //   8265: lookupswitch default -> 8292, -1839375795 -> 37396, -415128165 -> 8248
    //   8292: aload_0
    //   8293: getstatic Perryc.0 : I
    //   8296: ifle -> 8310
    //   8299: ldc2_w 603066177
    //   8302: l2i
    //   8303: ldc_w 1674834393
    //   8306: ixor
    //   8307: goto -> 8318
    //   8310: ldc2_w -617747508
    //   8313: l2i
    //   8314: ldc_w 291576594
    //   8317: ixor
    //   8318: ldc2_w -1089574674
    //   8321: l2i
    //   8322: ldc_w 2135192073
    //   8325: ixor
    //   8326: ixor
    //   8327: lookupswitch default -> 37432, -2140412801 -> 8310, 168225337 -> 8352
    //   8352: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8355: getstatic Perryc.1 : I
    //   8358: ifeq -> 8372
    //   8361: ldc2_w -590354101
    //   8364: l2i
    //   8365: ldc_w -339164775
    //   8368: ixor
    //   8369: goto -> 8380
    //   8372: ldc2_w -1817747484
    //   8375: l2i
    //   8376: ldc_w -1024850853
    //   8379: ixor
    //   8380: ldc2_w 1835541560
    //   8383: l2i
    //   8384: ldc_w -661713392
    //   8387: ixor
    //   8388: ixor
    //   8389: lookupswitch default -> 8416, -2099248390 -> 37588, 2002622084 -> 8372
    //   8416: goto -> 8420
    //   8419: athrow
    //   8420: invokevirtual getValue : ()Ljava/lang/Object;
    //   8423: goto -> 8427
    //   8426: athrow
    //   8427: checkcast java/lang/Integer
    //   8430: getstatic Perryc.c : I
    //   8433: iflt -> 8447
    //   8436: ldc2_w -1056643515
    //   8439: l2i
    //   8440: ldc_w 1423837151
    //   8443: ixor
    //   8444: goto -> 8455
    //   8447: ldc2_w -945809083
    //   8450: l2i
    //   8451: ldc_w 735395502
    //   8454: ixor
    //   8455: ldc2_w 124995621
    //   8458: l2i
    //   8459: ldc_w -1069820996
    //   8462: ixor
    //   8463: ixor
    //   8464: lookupswitch default -> 8492, -911178051 -> 8447, 1385331203 -> 37824
    //   8492: goto -> 8496
    //   8495: athrow
    //   8496: invokevirtual intValue : ()I
    //   8499: goto -> 8503
    //   8502: athrow
    //   8503: i2f
    //   8504: getstatic Perryc.0 : I
    //   8507: ifle -> 8521
    //   8510: ldc2_w -1403177919
    //   8513: l2i
    //   8514: ldc_w -242610718
    //   8517: ixor
    //   8518: goto -> 8529
    //   8521: ldc2_w -386696262
    //   8524: l2i
    //   8525: ldc_w 2072363033
    //   8528: ixor
    //   8529: ldc2_w -1618545858
    //   8532: l2i
    //   8533: ldc_w 723449839
    //   8536: ixor
    //   8537: ixor
    //   8538: lookupswitch default -> 38152, -380682894 -> 8521, 669958002 -> 8564
    //   8564: aload #7
    //   8566: ldc2_w 862008141
    //   8569: l2i
    //   8570: ldc_w 862008141
    //   8573: ixor
    //   8574: iaload
    //   8575: getstatic Perryc.c : I
    //   8578: iflt -> 8592
    //   8581: ldc2_w -1009095806
    //   8584: l2i
    //   8585: ldc_w -378954169
    //   8588: ixor
    //   8589: goto -> 8600
    //   8592: ldc2_w 1963830266
    //   8595: l2i
    //   8596: ldc_w -994985032
    //   8599: ixor
    //   8600: ldc2_w 1646165920
    //   8603: l2i
    //   8604: ldc_w -456129002
    //   8607: ixor
    //   8608: ixor
    //   8609: lookupswitch default -> 8636, -1401058189 -> 37712, 1748280205 -> 8592
    //   8636: goto -> 8640
    //   8639: athrow
    //   8640: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   8643: goto -> 8647
    //   8646: athrow
    //   8647: getstatic Perryc.0 : I
    //   8650: ifle -> 8664
    //   8653: ldc2_w -469685785
    //   8656: l2i
    //   8657: ldc_w 2065467068
    //   8660: ixor
    //   8661: goto -> 8672
    //   8664: ldc2_w 1541500026
    //   8667: l2i
    //   8668: ldc_w 2133867767
    //   8671: ixor
    //   8672: ldc2_w 368784819
    //   8675: l2i
    //   8676: ldc_w -157982092
    //   8679: ixor
    //   8680: ixor
    //   8681: lookupswitch default -> 37392, -943782070 -> 8708, 2087975068 -> 8664
    //   8708: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8711: getstatic Perryc.c : I
    //   8714: iflt -> 8728
    //   8717: ldc2_w 361899202
    //   8720: l2i
    //   8721: ldc_w 434639414
    //   8724: ixor
    //   8725: goto -> 8736
    //   8728: ldc2_w 1199178891
    //   8731: l2i
    //   8732: ldc_w 479939242
    //   8735: ixor
    //   8736: ldc2_w 1494248762
    //   8739: l2i
    //   8740: ldc_w 1623098170
    //   8743: ixor
    //   8744: ixor
    //   8745: lookupswitch default -> 8772, 903141620 -> 38120, 912828223 -> 8728
    //   8772: goto -> 8776
    //   8775: athrow
    //   8776: invokevirtual getValue : ()Ljava/lang/Object;
    //   8779: goto -> 8783
    //   8782: athrow
    //   8783: checkcast java/lang/Integer
    //   8786: getstatic Perryc.c : I
    //   8789: iflt -> 8803
    //   8792: ldc2_w -1129340444
    //   8795: l2i
    //   8796: ldc_w 162531595
    //   8799: ixor
    //   8800: goto -> 8811
    //   8803: ldc2_w -649544495
    //   8806: l2i
    //   8807: ldc_w 1146116596
    //   8810: ixor
    //   8811: ldc2_w -1632368771
    //   8814: l2i
    //   8815: ldc_w -155963961
    //   8818: ixor
    //   8819: ixor
    //   8820: lookupswitch default -> 37314, -585137579 -> 8803, -182923361 -> 8848
    //   8848: goto -> 8852
    //   8851: athrow
    //   8852: invokevirtual intValue : ()I
    //   8855: goto -> 8859
    //   8858: athrow
    //   8859: imul
    //   8860: getstatic Perryc.0 : I
    //   8863: ifle -> 8877
    //   8866: ldc2_w 925104615
    //   8869: l2i
    //   8870: ldc_w 336980859
    //   8873: ixor
    //   8874: goto -> 8885
    //   8877: ldc2_w 532094696
    //   8880: l2i
    //   8881: ldc_w 1582027868
    //   8884: ixor
    //   8885: ldc2_w -1654781120
    //   8888: l2i
    //   8889: ldc_w -1622171556
    //   8892: ixor
    //   8893: ixor
    //   8894: lookupswitch default -> 8920, 556251520 -> 38072, 1664214682 -> 8877
    //   8920: goto -> 8924
    //   8923: athrow
    //   8924: invokestatic rainbow : (I)Ljava/awt/Color;
    //   8927: goto -> 8931
    //   8930: athrow
    //   8931: getstatic Perryc.1 : I
    //   8934: ifeq -> 8948
    //   8937: ldc2_w 1961013390
    //   8940: l2i
    //   8941: ldc_w 621891569
    //   8944: ixor
    //   8945: goto -> 8956
    //   8948: ldc2_w 553191057
    //   8951: l2i
    //   8952: ldc_w -863963979
    //   8955: ixor
    //   8956: ldc2_w -796508707
    //   8959: l2i
    //   8960: ldc_w -1961093343
    //   8963: ixor
    //   8964: ixor
    //   8965: lookupswitch default -> 8992, 174708099 -> 37582, 1324322598 -> 8948
    //   8992: goto -> 8996
    //   8995: athrow
    //   8996: invokevirtual getRGB : ()I
    //   8999: goto -> 9003
    //   9002: athrow
    //   9003: ldc2_w -1925625267
    //   9006: l2i
    //   9007: ldc_w -1925625268
    //   9010: ixor
    //   9011: getstatic Perryc.0 : I
    //   9014: ifle -> 9028
    //   9017: ldc2_w 2073886067
    //   9020: l2i
    //   9021: ldc_w 877176622
    //   9024: ixor
    //   9025: goto -> 9036
    //   9028: ldc2_w 1993943240
    //   9031: l2i
    //   9032: ldc_w 1954525364
    //   9035: ixor
    //   9036: ldc2_w 1550078324
    //   9039: l2i
    //   9040: ldc_w 545358264
    //   9043: ixor
    //   9044: ixor
    //   9045: lookupswitch default -> 37528, 858884753 -> 9028, 2118338736 -> 9072
    //   9072: goto -> 9076
    //   9075: athrow
    //   9076: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   9079: goto -> 9083
    //   9082: athrow
    //   9083: getstatic Perryc.c : I
    //   9086: iflt -> 9100
    //   9089: ldc2_w -1817657746
    //   9092: l2i
    //   9093: ldc_w 389516899
    //   9096: ixor
    //   9097: goto -> 9108
    //   9100: ldc2_w -2126333571
    //   9103: l2i
    //   9104: ldc_w -520262507
    //   9107: ixor
    //   9108: ldc2_w 407674044
    //   9111: l2i
    //   9112: ldc_w -1908212936
    //   9115: ixor
    //   9116: ixor
    //   9117: lookupswitch default -> 9144, 311515017 -> 37734, 1346390181 -> 9100
    //   9144: fload #9
    //   9146: getstatic Perryc.0 : I
    //   9149: ifle -> 9163
    //   9152: ldc2_w -1064312743
    //   9155: l2i
    //   9156: ldc_w 1191716250
    //   9159: ixor
    //   9160: goto -> 9171
    //   9163: ldc2_w 1909325269
    //   9166: l2i
    //   9167: ldc_w 1108227821
    //   9170: ixor
    //   9171: ldc2_w 1783842216
    //   9174: l2i
    //   9175: ldc_w 972959535
    //   9178: ixor
    //   9179: ixor
    //   9180: lookupswitch default -> 37758, -735400124 -> 9163, 1617863103 -> 9208
    //   9208: aload_0
    //   9209: getstatic Perryc.0 : I
    //   9212: ifle -> 9226
    //   9215: ldc2_w 1239837048
    //   9218: l2i
    //   9219: ldc_w 1158964268
    //   9222: ixor
    //   9223: goto -> 9234
    //   9226: ldc2_w 386055028
    //   9229: l2i
    //   9230: ldc_w 1374018793
    //   9233: ixor
    //   9234: ldc2_w -761783720
    //   9237: l2i
    //   9238: ldc_w -1306324726
    //   9241: ixor
    //   9242: ixor
    //   9243: lookupswitch default -> 9268, -1436278851 -> 9226, 1816724998 -> 37532
    //   9268: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   9271: getstatic Perryc.c : I
    //   9274: iflt -> 9288
    //   9277: ldc2_w 384358420
    //   9280: l2i
    //   9281: ldc_w -488119468
    //   9284: ixor
    //   9285: goto -> 9296
    //   9288: ldc2_w 514268604
    //   9291: l2i
    //   9292: ldc_w -1726134008
    //   9295: ixor
    //   9296: ldc2_w 1304208435
    //   9299: l2i
    //   9300: ldc_w -916182468
    //   9303: ixor
    //   9304: ixor
    //   9305: lookupswitch default -> 9332, -1115565134 -> 9288, 1893184847 -> 37366
    //   9332: iload #13
    //   9334: getstatic Perryc.c : I
    //   9337: iflt -> 9351
    //   9340: ldc2_w -1820048781
    //   9343: l2i
    //   9344: ldc_w 959609849
    //   9347: ixor
    //   9348: goto -> 9359
    //   9351: ldc2_w 1394903960
    //   9354: l2i
    //   9355: ldc_w 276926341
    //   9358: ixor
    //   9359: ldc2_w 547282735
    //   9362: l2i
    //   9363: ldc_w -2000846751
    //   9366: ixor
    //   9367: ixor
    //   9368: lookupswitch default -> 37238, -343516333 -> 9396, 43345604 -> 9351
    //   9396: goto -> 9400
    //   9399: athrow
    //   9400: invokestatic valueOf : (C)Ljava/lang/String;
    //   9403: goto -> 9407
    //   9406: athrow
    //   9407: getstatic Perryc.1 : I
    //   9410: ifeq -> 9424
    //   9413: ldc2_w 1378292642
    //   9416: l2i
    //   9417: ldc_w -297493592
    //   9420: ixor
    //   9421: goto -> 9432
    //   9424: ldc2_w 1606179118
    //   9427: l2i
    //   9428: ldc_w -1797971011
    //   9431: ixor
    //   9432: ldc2_w -1761067928
    //   9435: l2i
    //   9436: ldc_w 1528334426
    //   9439: ixor
    //   9440: ixor
    //   9441: lookupswitch default -> 9468, -804357996 -> 9424, 1886600248 -> 37966
    //   9468: goto -> 9472
    //   9471: athrow
    //   9472: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   9475: goto -> 9479
    //   9478: athrow
    //   9479: i2f
    //   9480: fadd
    //   9481: getstatic Perryc.1 : I
    //   9484: ifeq -> 9498
    //   9487: ldc2_w -826149629
    //   9490: l2i
    //   9491: ldc_w -2104301391
    //   9494: ixor
    //   9495: goto -> 9506
    //   9498: ldc2_w -704208641
    //   9501: l2i
    //   9502: ldc_w -987732659
    //   9505: ixor
    //   9506: ldc2_w 524988290
    //   9509: l2i
    //   9510: ldc_w 1507452495
    //   9513: ixor
    //   9514: ixor
    //   9515: lookupswitch default -> 9540, 180376703 -> 38038, 428046490 -> 9498
    //   9540: fstore #9
    //   9542: getstatic Perryc.c : I
    //   9545: iflt -> 9559
    //   9548: ldc2_w -1256011995
    //   9551: l2i
    //   9552: ldc_w -1219237426
    //   9555: ixor
    //   9556: goto -> 9567
    //   9559: ldc2_w 1735719856
    //   9562: l2i
    //   9563: ldc_w -283573575
    //   9566: ixor
    //   9567: ldc2_w -90772437
    //   9570: l2i
    //   9571: ldc_w 815569480
    //   9574: ixor
    //   9575: ixor
    //   9576: lookupswitch default -> 9604, -931440504 -> 37684, 1780923045 -> 9559
    //   9604: aload #7
    //   9606: ldc2_w 1611457015
    //   9609: l2i
    //   9610: ldc_w 1611457015
    //   9613: ixor
    //   9614: getstatic Perryc.1 : I
    //   9617: ifeq -> 9631
    //   9620: ldc2_w -1380339726
    //   9623: l2i
    //   9624: ldc_w 1020435992
    //   9627: ixor
    //   9628: goto -> 9639
    //   9631: ldc2_w -148214527
    //   9634: l2i
    //   9635: ldc_w 440965737
    //   9638: ixor
    //   9639: ldc2_w -1200451926
    //   9642: l2i
    //   9643: ldc_w 2030518696
    //   9646: ixor
    //   9647: ixor
    //   9648: lookupswitch default -> 37544, 739719274 -> 9676, 1344208616 -> 9631
    //   9676: aload #7
    //   9678: ldc2_w 1064957558
    //   9681: l2i
    //   9682: ldc_w 1064957558
    //   9685: ixor
    //   9686: iaload
    //   9687: ldc2_w 933593905
    //   9690: l2i
    //   9691: ldc_w 933593904
    //   9694: ixor
    //   9695: iadd
    //   9696: iastore
    //   9697: iinc #12, 1
    //   9700: goto -> 7522
    //   9703: goto -> 10383
    //   9706: getstatic Perryc.c : I
    //   9709: iflt -> 9723
    //   9712: ldc2_w -1615740966
    //   9715: l2i
    //   9716: ldc_w 1718925758
    //   9719: ixor
    //   9720: goto -> 9731
    //   9723: ldc2_w 1463843830
    //   9726: l2i
    //   9727: ldc_w 2071888633
    //   9730: ixor
    //   9731: ldc2_w 1552434427
    //   9734: l2i
    //   9735: ldc_w -1363138437
    //   9738: ixor
    //   9739: ixor
    //   9740: lookupswitch default -> 37934, -562653809 -> 9768, 193817316 -> 9723
    //   9768: aload_0
    //   9769: getstatic Perryc.c : I
    //   9772: iflt -> 9786
    //   9775: ldc2_w -338614738
    //   9778: l2i
    //   9779: ldc_w 1035168355
    //   9782: ixor
    //   9783: goto -> 9794
    //   9786: ldc2_w -1381790
    //   9789: l2i
    //   9790: ldc_w 1708019887
    //   9793: ixor
    //   9794: ldc2_w 1800455593
    //   9797: l2i
    //   9798: ldc_w 412849486
    //   9801: ixor
    //   9802: ixor
    //   9803: lookupswitch default -> 38158, -1515643734 -> 9786, -370152918 -> 9828
    //   9828: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   9831: getstatic Perryc.0 : I
    //   9834: ifle -> 9848
    //   9837: ldc2_w 1214103910
    //   9840: l2i
    //   9841: ldc_w 1490464343
    //   9844: ixor
    //   9845: goto -> 9856
    //   9848: ldc2_w -531303571
    //   9851: l2i
    //   9852: ldc_w -1052502255
    //   9855: ixor
    //   9856: ldc2_w -2067816135
    //   9859: l2i
    //   9860: ldc_w -2045490818
    //   9863: ixor
    //   9864: ixor
    //   9865: lookupswitch default -> 9892, 304121718 -> 38028, 2078957753 -> 9848
    //   9892: aload_1
    //   9893: ldc_w 1.6804635E38
    //   9896: invokestatic floatToIntBits : (F)I
    //   9899: ldc_w 2130499865
    //   9902: ixor
    //   9903: invokestatic intBitsToFloat : (I)F
    //   9906: getstatic Perryc.c : I
    //   9909: iflt -> 9923
    //   9912: ldc2_w -1380379541
    //   9915: l2i
    //   9916: ldc_w -1815975145
    //   9919: ixor
    //   9920: goto -> 9931
    //   9923: ldc2_w -1403716787
    //   9926: l2i
    //   9927: ldc_w -1748951246
    //   9930: ixor
    //   9931: ldc2_w 949790219
    //   9934: l2i
    //   9935: ldc_w -619939344
    //   9938: ixor
    //   9939: ixor
    //   9940: lookupswitch default -> 37978, -670745724 -> 9968, -571760505 -> 9923
    //   9968: aload_0
    //   9969: getstatic Perryc.1 : I
    //   9972: ifeq -> 9986
    //   9975: ldc2_w 1808855721
    //   9978: l2i
    //   9979: ldc_w -1472583047
    //   9982: ixor
    //   9983: goto -> 9994
    //   9986: ldc2_w -338409880
    //   9989: l2i
    //   9990: ldc_w -1007407031
    //   9993: ixor
    //   9994: ldc2_w 1692687082
    //   9997: l2i
    //   9998: ldc_w 2123887533
    //   10001: ixor
    //   10002: ixor
    //   10003: lookupswitch default -> 38102, -644255337 -> 9986, 844357478 -> 10028
    //   10028: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10031: getstatic Perryc.c : I
    //   10034: iflt -> 10048
    //   10037: ldc2_w -1090661122
    //   10040: l2i
    //   10041: ldc_w 1185636688
    //   10044: ixor
    //   10045: goto -> 10056
    //   10048: ldc2_w 1426054393
    //   10051: l2i
    //   10052: ldc_w -999752684
    //   10055: ixor
    //   10056: ldc2_w -1867467623
    //   10059: l2i
    //   10060: ldc_w 1850913847
    //   10063: ixor
    //   10064: ixor
    //   10065: lookupswitch default -> 37490, 112506112 -> 10048, 1853169731 -> 10092
    //   10092: goto -> 10096
    //   10095: athrow
    //   10096: invokevirtual getValue : ()Ljava/lang/Object;
    //   10099: goto -> 10103
    //   10102: athrow
    //   10103: checkcast java/lang/Integer
    //   10106: getstatic Perryc.1 : I
    //   10109: ifeq -> 10123
    //   10112: ldc2_w 1796343068
    //   10115: l2i
    //   10116: ldc_w 265793199
    //   10119: ixor
    //   10120: goto -> 10131
    //   10123: ldc2_w -1654434408
    //   10126: l2i
    //   10127: ldc_w 858905470
    //   10130: ixor
    //   10131: ldc2_w -1321185402
    //   10134: l2i
    //   10135: ldc_w 796207637
    //   10138: ixor
    //   10139: ixor
    //   10140: lookupswitch default -> 37254, -84881888 -> 10123, 812116853 -> 10168
    //   10168: goto -> 10172
    //   10171: athrow
    //   10172: invokevirtual intValue : ()I
    //   10175: goto -> 10179
    //   10178: athrow
    //   10179: i2f
    //   10180: getstatic Perryc.0 : I
    //   10183: ifle -> 10197
    //   10186: ldc2_w -2062932361
    //   10189: l2i
    //   10190: ldc_w 684750615
    //   10193: ixor
    //   10194: goto -> 10205
    //   10197: ldc2_w 582220285
    //   10200: l2i
    //   10201: ldc_w 779372070
    //   10204: ixor
    //   10205: ldc2_w 2118632364
    //   10208: l2i
    //   10209: ldc_w -359961155
    //   10212: ixor
    //   10213: ixor
    //   10214: lookupswitch default -> 37408, -1744105014 -> 10240, 957808497 -> 10197
    //   10240: aload_0
    //   10241: getstatic Perryc.0 : I
    //   10244: ifle -> 10258
    //   10247: ldc2_w 649048752
    //   10250: l2i
    //   10251: ldc_w -809357388
    //   10254: ixor
    //   10255: goto -> 10266
    //   10258: ldc2_w -1450668260
    //   10261: l2i
    //   10262: ldc_w -1046300313
    //   10265: ixor
    //   10266: ldc2_w -966400109
    //   10269: l2i
    //   10270: ldc_w -69131308
    //   10273: ixor
    //   10274: ixor
    //   10275: lookupswitch default -> 10300, -722904765 -> 37202, 364457426 -> 10258
    //   10300: getfield color : I
    //   10303: ldc2_w 477170704
    //   10306: l2i
    //   10307: ldc_w 477170705
    //   10310: ixor
    //   10311: getstatic Perryc.c : I
    //   10314: iflt -> 10328
    //   10317: ldc2_w 1800474851
    //   10320: l2i
    //   10321: ldc_w -594433429
    //   10324: ixor
    //   10325: goto -> 10336
    //   10328: ldc2_w -1950129224
    //   10331: l2i
    //   10332: ldc_w -1759875384
    //   10335: ixor
    //   10336: ldc2_w 1013487068
    //   10339: l2i
    //   10340: ldc_w -868745563
    //   10343: ixor
    //   10344: ixor
    //   10345: lookupswitch default -> 38142, -326736375 -> 10372, 1201656305 -> 10328
    //   10372: goto -> 10376
    //   10375: athrow
    //   10376: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   10379: goto -> 10383
    //   10382: athrow
    //   10383: getstatic Perryc.1 : I
    //   10386: ifeq -> 10400
    //   10389: ldc2_w -1898200029
    //   10392: l2i
    //   10393: ldc_w -186734155
    //   10396: ixor
    //   10397: goto -> 10408
    //   10400: ldc2_w -2031982204
    //   10403: l2i
    //   10404: ldc_w -395775445
    //   10407: ixor
    //   10408: ldc2_w -1245488623
    //   10411: l2i
    //   10412: ldc_w 18623079
    //   10415: ixor
    //   10416: ixor
    //   10417: lookupswitch default -> 10444, -824566304 -> 37948, 1216671869 -> 10400
    //   10444: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   10447: ldc_w '䯹㌆䮮坈公ꕶ๠㙮ධ'
    //   10450: getstatic Perryc.1 : I
    //   10453: ifeq -> 10467
    //   10456: ldc2_w -515939751
    //   10459: l2i
    //   10460: ldc_w 1186885470
    //   10463: ixor
    //   10464: goto -> 10475
    //   10467: ldc2_w 1428225076
    //   10470: l2i
    //   10471: ldc_w 1206617737
    //   10474: ixor
    //   10475: ldc2_w -270804501
    //   10478: l2i
    //   10479: ldc_w -2117750905
    //   10482: ixor
    //   10483: ixor
    //   10484: lookupswitch default -> 37506, -912295061 -> 10467, 2094337233 -> 10512
    //   10512: goto -> 10516
    //   10515: athrow
    //   10516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10519: goto -> 10523
    //   10522: athrow
    //   10523: getstatic Perryc.c : I
    //   10526: iflt -> 10540
    //   10529: ldc2_w -380010047
    //   10532: l2i
    //   10533: ldc_w 916219655
    //   10536: ixor
    //   10537: goto -> 10548
    //   10540: ldc2_w 368082071
    //   10543: l2i
    //   10544: ldc_w 357870405
    //   10547: ixor
    //   10548: ldc2_w 21298924
    //   10551: l2i
    //   10552: ldc_w -2072193331
    //   10555: ixor
    //   10556: ixor
    //   10557: lookupswitch default -> 10584, 654014782 -> 10540, 1526583015 -> 37982
    //   10584: goto -> 10588
    //   10587: athrow
    //   10588: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   10591: goto -> 10595
    //   10594: athrow
    //   10595: getstatic Perryc.1 : I
    //   10598: ifeq -> 10612
    //   10601: ldc2_w 32853145
    //   10604: l2i
    //   10605: ldc_w -1900928088
    //   10608: ixor
    //   10609: goto -> 10620
    //   10612: ldc2_w -1761916528
    //   10615: l2i
    //   10616: ldc_w 993358665
    //   10619: ixor
    //   10620: ldc2_w 68665695
    //   10623: l2i
    //   10624: ldc_w -754653765
    //   10627: ixor
    //   10628: ixor
    //   10629: lookupswitch default -> 10656, 1389197346 -> 10612, 1481919445 -> 37522
    //   10656: goto -> 10660
    //   10659: athrow
    //   10660: invokevirtual isDisabled : ()Z
    //   10663: goto -> 10667
    //   10666: athrow
    //   10667: ifeq -> 10681
    //   10670: ldc2_w 710200621
    //   10673: l2i
    //   10674: ldc_w 293398168
    //   10677: ixor
    //   10678: goto -> 10689
    //   10681: ldc2_w -1632727039
    //   10684: l2i
    //   10685: ldc_w -1517896779
    //   10688: ixor
    //   10689: ldc2_w 1228835638
    //   10692: l2i
    //   10693: ldc_w 737421359
    //   10696: ixor
    //   10697: ixor
    //   10698: tableswitch default -> 10670, 1508018348 -> 10720, 1508018349 -> 15655
    //   10720: getstatic Perryc.1 : I
    //   10723: ifeq -> 10737
    //   10726: ldc2_w 531966291
    //   10729: l2i
    //   10730: ldc_w -769344874
    //   10733: ixor
    //   10734: goto -> 10745
    //   10737: ldc2_w 1513203736
    //   10740: l2i
    //   10741: ldc_w 1801088065
    //   10744: ixor
    //   10745: ldc2_w -322462906
    //   10748: l2i
    //   10749: ldc_w 1025521306
    //   10752: ixor
    //   10753: ixor
    //   10754: lookupswitch default -> 38002, -527668859 -> 10780, 477511193 -> 10737
    //   10780: goto -> 10784
    //   10783: athrow
    //   10784: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   10787: goto -> 10791
    //   10790: athrow
    //   10791: getstatic Perryc.1 : I
    //   10794: ifeq -> 10808
    //   10797: ldc2_w -2134797596
    //   10800: l2i
    //   10801: ldc_w -1377034294
    //   10804: ixor
    //   10805: goto -> 10816
    //   10808: ldc2_w -414190009
    //   10811: l2i
    //   10812: ldc_w 1324276196
    //   10815: ixor
    //   10816: ldc2_w -1666795731
    //   10819: l2i
    //   10820: ldc_w 402655118
    //   10823: ixor
    //   10824: ixor
    //   10825: lookupswitch default -> 10852, -1450492531 -> 37318, -1274047398 -> 10808
    //   10852: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10855: getstatic Perryc.1 : I
    //   10858: ifeq -> 10872
    //   10861: ldc2_w 92985915
    //   10864: l2i
    //   10865: ldc_w 227960284
    //   10868: ixor
    //   10869: goto -> 10880
    //   10872: ldc2_w -1995428586
    //   10875: l2i
    //   10876: ldc_w 218379948
    //   10879: ixor
    //   10880: ldc2_w 1273279704
    //   10883: l2i
    //   10884: ldc_w -446105845
    //   10887: ixor
    //   10888: ixor
    //   10889: lookupswitch default -> 10916, -1500447692 -> 37850, 600160093 -> 10872
    //   10916: goto -> 10920
    //   10919: athrow
    //   10920: invokevirtual getValue : ()Ljava/lang/Object;
    //   10923: goto -> 10927
    //   10926: athrow
    //   10927: checkcast java/lang/Boolean
    //   10930: getstatic Perryc.0 : I
    //   10933: ifle -> 10947
    //   10936: ldc2_w 2000924836
    //   10939: l2i
    //   10940: ldc_w 1220637683
    //   10943: ixor
    //   10944: goto -> 10955
    //   10947: ldc2_w -989083590
    //   10950: l2i
    //   10951: ldc_w 1480423433
    //   10954: ixor
    //   10955: ldc2_w 915275807
    //   10958: l2i
    //   10959: ldc_w -2039381290
    //   10962: ixor
    //   10963: ixor
    //   10964: lookupswitch default -> 37184, -1887616610 -> 10947, 768160506 -> 10992
    //   10992: goto -> 10996
    //   10995: athrow
    //   10996: invokevirtual booleanValue : ()Z
    //   10999: goto -> 11003
    //   11002: athrow
    //   11003: ifeq -> 11017
    //   11006: ldc2_w 1236036687
    //   11009: l2i
    //   11010: ldc_w 1843637501
    //   11013: ixor
    //   11014: goto -> 11025
    //   11017: ldc2_w 241070684
    //   11020: l2i
    //   11021: ldc_w 705802989
    //   11024: ixor
    //   11025: ldc2_w 1749866206
    //   11028: l2i
    //   11029: ldc_w -786358791
    //   11032: ixor
    //   11033: ixor
    //   11034: tableswitch default -> 11006, -1658713195 -> 11056, -1658713194 -> 15238
    //   11056: getstatic Perryc.c : I
    //   11059: iflt -> 11073
    //   11062: ldc2_w 1919460283
    //   11065: l2i
    //   11066: ldc_w -551800073
    //   11069: ixor
    //   11070: goto -> 11081
    //   11073: ldc2_w 1534618570
    //   11076: l2i
    //   11077: ldc_w -1813085845
    //   11080: ixor
    //   11081: ldc2_w -1336410915
    //   11084: l2i
    //   11085: ldc_w 1226673191
    //   11088: ixor
    //   11089: ixor
    //   11090: lookupswitch default -> 37770, 836541019 -> 11116, 1413407158 -> 11073
    //   11116: goto -> 11120
    //   11119: athrow
    //   11120: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   11123: goto -> 11127
    //   11126: athrow
    //   11127: getstatic Perryc.c : I
    //   11130: iflt -> 11144
    //   11133: ldc2_w 273167553
    //   11136: l2i
    //   11137: ldc_w -794702343
    //   11140: ixor
    //   11141: goto -> 11152
    //   11144: ldc2_w 1408433134
    //   11147: l2i
    //   11148: ldc_w -842093254
    //   11151: ixor
    //   11152: ldc2_w 1127891420
    //   11155: l2i
    //   11156: ldc_w 1059214748
    //   11159: ixor
    //   11160: ixor
    //   11161: lookupswitch default -> 11188, -1124995720 -> 37652, 1905481653 -> 11144
    //   11188: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11191: getstatic Perryc.0 : I
    //   11194: ifle -> 11208
    //   11197: ldc2_w -1084593125
    //   11200: l2i
    //   11201: ldc_w 1713817768
    //   11204: ixor
    //   11205: goto -> 11216
    //   11208: ldc2_w -2054094711
    //   11211: l2i
    //   11212: ldc_w 847207519
    //   11215: ixor
    //   11216: ldc2_w 1559890152
    //   11219: l2i
    //   11220: ldc_w 460828378
    //   11223: ixor
    //   11224: ixor
    //   11225: lookupswitch default -> 37226, -1628372351 -> 11208, -261883164 -> 11252
    //   11252: goto -> 11256
    //   11255: athrow
    //   11256: invokevirtual getValue : ()Ljava/lang/Object;
    //   11259: goto -> 11263
    //   11262: athrow
    //   11263: getstatic Perryc.c : I
    //   11266: iflt -> 11280
    //   11269: ldc2_w 1357089279
    //   11272: l2i
    //   11273: ldc_w 1903699446
    //   11276: ixor
    //   11277: goto -> 11288
    //   11280: ldc2_w 541908619
    //   11283: l2i
    //   11284: ldc_w 246622171
    //   11287: ixor
    //   11288: ldc2_w 24303945
    //   11291: l2i
    //   11292: ldc_w 63458330
    //   11295: ixor
    //   11296: ixor
    //   11297: lookupswitch default -> 11324, -423923471 -> 11280, 589379930 -> 37688
    //   11324: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   11327: if_acmpne -> 11341
    //   11330: ldc2_w 1208989709
    //   11333: l2i
    //   11334: ldc_w -2083448134
    //   11337: ixor
    //   11338: goto -> 11349
    //   11341: ldc2_w -1606202712
    //   11344: l2i
    //   11345: ldc_w 1805510686
    //   11348: ixor
    //   11349: ldc2_w 1308782487
    //   11352: l2i
    //   11353: ldc_w 325595386
    //   11356: ixor
    //   11357: ixor
    //   11358: tableswitch default -> 11330, -1766523430 -> 11380, -1766523429 -> 12362
    //   11380: getstatic Perryc.0 : I
    //   11383: ifle -> 11397
    //   11386: ldc2_w 1644639966
    //   11389: l2i
    //   11390: ldc_w 646691148
    //   11393: ixor
    //   11394: goto -> 11405
    //   11397: ldc2_w 2022429193
    //   11400: l2i
    //   11401: ldc_w 782677920
    //   11404: ixor
    //   11405: ldc2_w -836612611
    //   11408: l2i
    //   11409: ldc_w -1870344155
    //   11412: ixor
    //   11413: ixor
    //   11414: lookupswitch default -> 38044, 143390833 -> 11440, 438964810 -> 11397
    //   11440: aload_0
    //   11441: getstatic Perryc.0 : I
    //   11444: ifle -> 11458
    //   11447: ldc2_w -2021850784
    //   11450: l2i
    //   11451: ldc_w -39684313
    //   11454: ixor
    //   11455: goto -> 11466
    //   11458: ldc2_w -870194527
    //   11461: l2i
    //   11462: ldc_w -528699427
    //   11465: ixor
    //   11466: ldc2_w -1657028978
    //   11469: l2i
    //   11470: ldc_w -275053906
    //   11473: ixor
    //   11474: ixor
    //   11475: lookupswitch default -> 37690, 142592615 -> 11458, 1593700700 -> 11500
    //   11500: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   11503: getstatic Perryc.c : I
    //   11506: iflt -> 11520
    //   11509: ldc2_w 687745556
    //   11512: l2i
    //   11513: ldc_w 2093026524
    //   11516: ixor
    //   11517: goto -> 11528
    //   11520: ldc2_w -1928974027
    //   11523: l2i
    //   11524: ldc_w 277421276
    //   11527: ixor
    //   11528: ldc2_w -1534111195
    //   11531: l2i
    //   11532: ldc_w 1375105509
    //   11535: ixor
    //   11536: ixor
    //   11537: lookupswitch default -> 11564, -1789853661 -> 11520, -1589246712 -> 37792
    //   11564: aload_2
    //   11565: ldc_w 2.4227778E38
    //   11568: invokestatic floatToIntBits : (F)I
    //   11571: ldc_w 2134263041
    //   11574: ixor
    //   11575: invokestatic intBitsToFloat : (I)F
    //   11578: getstatic Perryc.0 : I
    //   11581: ifle -> 11595
    //   11584: ldc2_w -873775381
    //   11587: l2i
    //   11588: ldc_w 739612783
    //   11591: ixor
    //   11592: goto -> 11603
    //   11595: ldc2_w -1831256968
    //   11598: l2i
    //   11599: ldc_w 623102379
    //   11602: ixor
    //   11603: ldc2_w 2027489882
    //   11606: l2i
    //   11607: ldc_w -1114810401
    //   11610: ixor
    //   11611: ixor
    //   11612: lookupswitch default -> 37168, 581630721 -> 11595, 1924048982 -> 11640
    //   11640: aload_0
    //   11641: getstatic Perryc.c : I
    //   11644: iflt -> 11658
    //   11647: ldc2_w 388538403
    //   11650: l2i
    //   11651: ldc_w 1388874626
    //   11654: ixor
    //   11655: goto -> 11666
    //   11658: ldc2_w 2018761832
    //   11661: l2i
    //   11662: ldc_w -258610279
    //   11665: ixor
    //   11666: ldc2_w 1476108852
    //   11669: l2i
    //   11670: ldc_w 401346123
    //   11673: ixor
    //   11674: ixor
    //   11675: lookupswitch default -> 37940, -925787250 -> 11700, 100108254 -> 11658
    //   11700: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11703: getstatic Perryc.1 : I
    //   11706: ifeq -> 11720
    //   11709: ldc2_w 894749858
    //   11712: l2i
    //   11713: ldc_w 44095847
    //   11716: ixor
    //   11717: goto -> 11728
    //   11720: ldc2_w 1126829264
    //   11723: l2i
    //   11724: ldc_w 478324335
    //   11727: ixor
    //   11728: ldc2_w 763768197
    //   11731: l2i
    //   11732: ldc_w 993734401
    //   11735: ixor
    //   11736: ixor
    //   11737: lookupswitch default -> 11764, 558438209 -> 38138, 1917979263 -> 11720
    //   11764: goto -> 11768
    //   11767: athrow
    //   11768: invokevirtual getValue : ()Ljava/lang/Object;
    //   11771: goto -> 11775
    //   11774: athrow
    //   11775: checkcast java/lang/Integer
    //   11778: getstatic Perryc.1 : I
    //   11781: ifeq -> 11795
    //   11784: ldc2_w -1083350681
    //   11787: l2i
    //   11788: ldc_w 650819854
    //   11791: ixor
    //   11792: goto -> 11803
    //   11795: ldc2_w 594341621
    //   11798: l2i
    //   11799: ldc_w -392664110
    //   11802: ixor
    //   11803: ldc2_w 1873480205
    //   11806: l2i
    //   11807: ldc_w 653687755
    //   11810: ixor
    //   11811: ixor
    //   11812: lookupswitch default -> 38132, -2102790943 -> 11840, -788878929 -> 11795
    //   11840: goto -> 11844
    //   11843: athrow
    //   11844: invokevirtual intValue : ()I
    //   11847: goto -> 11851
    //   11850: athrow
    //   11851: i2f
    //   11852: getstatic Perryc.0 : I
    //   11855: ifle -> 11869
    //   11858: ldc2_w -891398717
    //   11861: l2i
    //   11862: ldc_w -1538153927
    //   11865: ixor
    //   11866: goto -> 11877
    //   11869: ldc2_w -2105090375
    //   11872: l2i
    //   11873: ldc_w -1913898060
    //   11876: ixor
    //   11877: ldc2_w 1836195754
    //   11880: l2i
    //   11881: ldc_w -279132228
    //   11884: ixor
    //   11885: ixor
    //   11886: lookupswitch default -> 37342, -1924907749 -> 11912, -324980756 -> 11869
    //   11912: goto -> 11916
    //   11915: athrow
    //   11916: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   11919: goto -> 11923
    //   11922: athrow
    //   11923: getstatic Perryc.c : I
    //   11926: iflt -> 11940
    //   11929: ldc2_w 745694229
    //   11932: l2i
    //   11933: ldc_w 1472659242
    //   11936: ixor
    //   11937: goto -> 11948
    //   11940: ldc2_w -1265142708
    //   11943: l2i
    //   11944: ldc_w -2128245034
    //   11947: ixor
    //   11948: ldc2_w 1463855563
    //   11951: l2i
    //   11952: ldc_w -1326957857
    //   11955: ixor
    //   11956: ixor
    //   11957: lookupswitch default -> 11984, -1675884501 -> 37674, -3773060 -> 11940
    //   11984: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11987: getstatic Perryc.c : I
    //   11990: iflt -> 12004
    //   11993: ldc2_w 869730207
    //   11996: l2i
    //   11997: ldc_w 2089190512
    //   12000: ixor
    //   12001: goto -> 12012
    //   12004: ldc2_w 647949665
    //   12007: l2i
    //   12008: ldc_w -731621213
    //   12011: ixor
    //   12012: ldc2_w -47468644
    //   12015: l2i
    //   12016: ldc_w 1115883808
    //   12019: ixor
    //   12020: ixor
    //   12021: lookupswitch default -> 37286, -252107437 -> 12004, 1297224574 -> 12048
    //   12048: goto -> 12052
    //   12051: athrow
    //   12052: invokevirtual getValue : ()Ljava/lang/Object;
    //   12055: goto -> 12059
    //   12058: athrow
    //   12059: checkcast java/lang/Integer
    //   12062: getstatic Perryc.1 : I
    //   12065: ifeq -> 12079
    //   12068: ldc2_w -1915738860
    //   12071: l2i
    //   12072: ldc_w 462377354
    //   12075: ixor
    //   12076: goto -> 12087
    //   12079: ldc2_w -2070776236
    //   12082: l2i
    //   12083: ldc_w 1951434878
    //   12086: ixor
    //   12087: ldc2_w -1933397651
    //   12090: l2i
    //   12091: ldc_w -842665151
    //   12094: ixor
    //   12095: ixor
    //   12096: lookupswitch default -> 12124, -682084686 -> 37276, -279045910 -> 12079
    //   12124: goto -> 12128
    //   12127: athrow
    //   12128: invokevirtual intValue : ()I
    //   12131: goto -> 12135
    //   12134: athrow
    //   12135: getstatic Perryc.c : I
    //   12138: iflt -> 12152
    //   12141: ldc2_w 193141749
    //   12144: l2i
    //   12145: ldc_w 631771909
    //   12148: ixor
    //   12149: goto -> 12160
    //   12152: ldc2_w 6644211
    //   12155: l2i
    //   12156: ldc_w -18724744
    //   12159: ixor
    //   12160: ldc2_w 854283759
    //   12163: l2i
    //   12164: ldc_w 344050312
    //   12167: ixor
    //   12168: ixor
    //   12169: lookupswitch default -> 12196, -1091774270 -> 12152, 138516375 -> 37228
    //   12196: goto -> 12200
    //   12199: athrow
    //   12200: invokestatic rainbow : (I)Ljava/awt/Color;
    //   12203: goto -> 12207
    //   12206: athrow
    //   12207: getstatic Perryc.0 : I
    //   12210: ifle -> 12224
    //   12213: ldc2_w -707271857
    //   12216: l2i
    //   12217: ldc_w 1198613095
    //   12220: ixor
    //   12221: goto -> 12232
    //   12224: ldc2_w -1531552073
    //   12227: l2i
    //   12228: ldc_w 1237465164
    //   12231: ixor
    //   12232: ldc2_w 1392708735
    //   12235: l2i
    //   12236: ldc_w -866953386
    //   12239: ixor
    //   12240: ixor
    //   12241: lookupswitch default -> 37974, 234281473 -> 12224, 1914977746 -> 12268
    //   12268: goto -> 12272
    //   12271: athrow
    //   12272: invokevirtual getRGB : ()I
    //   12275: goto -> 12279
    //   12278: athrow
    //   12279: ldc2_w -1471090234
    //   12282: l2i
    //   12283: ldc_w -1471090233
    //   12286: ixor
    //   12287: getstatic Perryc.1 : I
    //   12290: ifeq -> 12304
    //   12293: ldc2_w -1814862606
    //   12296: l2i
    //   12297: ldc_w -1729740440
    //   12300: ixor
    //   12301: goto -> 12312
    //   12304: ldc2_w 285127362
    //   12307: l2i
    //   12308: ldc_w 824833605
    //   12311: ixor
    //   12312: ldc2_w -261555150
    //   12315: l2i
    //   12316: ldc_w 1243851116
    //   12319: ixor
    //   12320: ixor
    //   12321: lookupswitch default -> 37178, -1684270631 -> 12348, -1317113660 -> 12304
    //   12348: goto -> 12352
    //   12351: athrow
    //   12352: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   12355: goto -> 12359
    //   12358: athrow
    //   12359: goto -> 15655
    //   12362: ldc2_w -1216468460
    //   12365: l2i
    //   12366: ldc_w -1216468459
    //   12369: ixor
    //   12370: newarray int
    //   12372: dup
    //   12373: ldc2_w 280176619
    //   12376: l2i
    //   12377: ldc_w 280176619
    //   12380: ixor
    //   12381: ldc2_w 183769794
    //   12384: l2i
    //   12385: ldc_w 183769795
    //   12388: ixor
    //   12389: iastore
    //   12390: getstatic Perryc.1 : I
    //   12393: ifeq -> 12407
    //   12396: ldc2_w 307515849
    //   12399: l2i
    //   12400: ldc_w 649496451
    //   12403: ixor
    //   12404: goto -> 12415
    //   12407: ldc2_w -526412809
    //   12410: l2i
    //   12411: ldc_w -1262518758
    //   12414: ixor
    //   12415: ldc2_w 306622310
    //   12418: l2i
    //   12419: ldc_w 1774170528
    //   12422: ixor
    //   12423: ixor
    //   12424: lookupswitch default -> 37700, 802812715 -> 12452, 1327220876 -> 12407
    //   12452: astore #7
    //   12454: getstatic Perryc.1 : I
    //   12457: ifeq -> 12471
    //   12460: ldc2_w -2086850470
    //   12463: l2i
    //   12464: ldc_w 107535716
    //   12467: ixor
    //   12468: goto -> 12479
    //   12471: ldc2_w -1083031573
    //   12474: l2i
    //   12475: ldc_w 2082894755
    //   12478: ixor
    //   12479: ldc2_w -1426878033
    //   12482: l2i
    //   12483: ldc_w -2079988640
    //   12486: ixor
    //   12487: ixor
    //   12488: lookupswitch default -> 12516, -1425827599 -> 37766, 446817545 -> 12471
    //   12516: aload_2
    //   12517: getstatic Perryc.0 : I
    //   12520: ifle -> 12534
    //   12523: ldc2_w 1952284966
    //   12526: l2i
    //   12527: ldc_w 109139423
    //   12530: ixor
    //   12531: goto -> 12542
    //   12534: ldc2_w -643838332
    //   12537: l2i
    //   12538: ldc_w -1251763858
    //   12541: ixor
    //   12542: ldc2_w -358681688
    //   12545: l2i
    //   12546: ldc_w 114999993
    //   12549: ixor
    //   12550: ixor
    //   12551: lookupswitch default -> 12576, -1634146840 -> 37316, -830019553 -> 12534
    //   12576: goto -> 12580
    //   12579: athrow
    //   12580: invokevirtual toCharArray : ()[C
    //   12583: goto -> 12587
    //   12586: athrow
    //   12587: getstatic Perryc.1 : I
    //   12590: ifeq -> 12604
    //   12593: ldc2_w 688975143
    //   12596: l2i
    //   12597: ldc_w -428231924
    //   12600: ixor
    //   12601: goto -> 12612
    //   12604: ldc2_w 774671469
    //   12607: l2i
    //   12608: ldc_w -1155025909
    //   12611: ixor
    //   12612: ldc2_w 1507315453
    //   12615: l2i
    //   12616: ldc_w 592569341
    //   12619: ixor
    //   12620: ixor
    //   12621: lookupswitch default -> 37548, -1242598613 -> 12604, -275966618 -> 12648
    //   12648: astore #8
    //   12650: ldc_w 2.7017721E38
    //   12653: invokestatic floatToIntBits : (F)I
    //   12656: ldc_w 2135638589
    //   12659: ixor
    //   12660: invokestatic intBitsToFloat : (I)F
    //   12663: getstatic Perryc.c : I
    //   12666: iflt -> 12680
    //   12669: ldc2_w -531877382
    //   12672: l2i
    //   12673: ldc_w -1642489903
    //   12676: ixor
    //   12677: goto -> 12688
    //   12680: ldc2_w 631877957
    //   12683: l2i
    //   12684: ldc_w -616294163
    //   12687: ixor
    //   12688: ldc2_w -374933212
    //   12691: l2i
    //   12692: ldc_w -1011808507
    //   12695: ixor
    //   12696: ixor
    //   12697: lookupswitch default -> 12724, 1413634058 -> 37186, 2083230942 -> 12680
    //   12724: fstore #9
    //   12726: getstatic Perryc.1 : I
    //   12729: ifeq -> 12743
    //   12732: ldc2_w 135665688
    //   12735: l2i
    //   12736: ldc_w 2130683408
    //   12739: ixor
    //   12740: goto -> 12751
    //   12743: ldc2_w -1567997667
    //   12746: l2i
    //   12747: ldc_w 1038782422
    //   12750: ixor
    //   12751: ldc2_w -1238825707
    //   12754: l2i
    //   12755: ldc_w -1331539312
    //   12758: ixor
    //   12759: ixor
    //   12760: lookupswitch default -> 37744, -1712613042 -> 12788, 1885530509 -> 12743
    //   12788: aload #8
    //   12790: getstatic Perryc.1 : I
    //   12793: ifeq -> 12807
    //   12796: ldc2_w -973058614
    //   12799: l2i
    //   12800: ldc_w 1276505330
    //   12803: ixor
    //   12804: goto -> 12815
    //   12807: ldc2_w -911802702
    //   12810: l2i
    //   12811: ldc_w 1609463758
    //   12814: ixor
    //   12815: ldc2_w 1832322558
    //   12818: l2i
    //   12819: ldc_w -72121351
    //   12822: ixor
    //   12823: ixor
    //   12824: lookupswitch default -> 38092, 13373307 -> 12852, 479274815 -> 12807
    //   12852: astore #10
    //   12854: getstatic Perryc.c : I
    //   12857: iflt -> 12871
    //   12860: ldc2_w -1138943725
    //   12863: l2i
    //   12864: ldc_w -1890516560
    //   12867: ixor
    //   12868: goto -> 12879
    //   12871: ldc2_w -204921897
    //   12874: l2i
    //   12875: ldc_w -79466506
    //   12878: ixor
    //   12879: ldc2_w 642376519
    //   12882: l2i
    //   12883: ldc_w -1040748179
    //   12886: ixor
    //   12887: ixor
    //   12888: lookupswitch default -> 12916, -722302327 -> 37492, -491110707 -> 12871
    //   12916: aload #10
    //   12918: arraylength
    //   12919: getstatic Perryc.1 : I
    //   12922: ifeq -> 12936
    //   12925: ldc2_w -473330502
    //   12928: l2i
    //   12929: ldc_w -41651885
    //   12932: ixor
    //   12933: goto -> 12944
    //   12936: ldc2_w 1615883355
    //   12939: l2i
    //   12940: ldc_w -565082651
    //   12943: ixor
    //   12944: ldc2_w 1382007020
    //   12947: l2i
    //   12948: ldc_w 1844655404
    //   12951: ixor
    //   12952: ixor
    //   12953: lookupswitch default -> 38084, -2119361410 -> 12980, 568395817 -> 12936
    //   12980: istore #11
    //   12982: ldc2_w -488541345
    //   12985: l2i
    //   12986: ldc_w -488541345
    //   12989: ixor
    //   12990: getstatic Perryc.0 : I
    //   12993: ifle -> 13007
    //   12996: ldc2_w -86480628
    //   12999: l2i
    //   13000: ldc_w 1843600151
    //   13003: ixor
    //   13004: goto -> 13015
    //   13007: ldc2_w -1460790520
    //   13010: l2i
    //   13011: ldc_w -61868147
    //   13014: ixor
    //   13015: ldc2_w -1224258650
    //   13018: l2i
    //   13019: ldc_w -1655198504
    //   13022: ixor
    //   13023: ixor
    //   13024: lookupswitch default -> 13052, -2081354955 -> 13007, -1117022875 -> 38146
    //   13052: istore #12
    //   13054: getstatic Perryc.1 : I
    //   13057: ifeq -> 13071
    //   13060: ldc2_w -77204562
    //   13063: l2i
    //   13064: ldc_w -2104444590
    //   13067: ixor
    //   13068: goto -> 13079
    //   13071: ldc2_w -1032761405
    //   13074: l2i
    //   13075: ldc_w -497399239
    //   13078: ixor
    //   13079: ldc2_w 970675491
    //   13082: l2i
    //   13083: ldc_w -2129631414
    //   13086: ixor
    //   13087: ixor
    //   13088: lookupswitch default -> 13116, -1052870507 -> 38076, -1010610775 -> 13071
    //   13116: iload #12
    //   13118: getstatic Perryc.1 : I
    //   13121: ifeq -> 13135
    //   13124: ldc2_w -1055657979
    //   13127: l2i
    //   13128: ldc_w 1285620478
    //   13131: ixor
    //   13132: goto -> 13143
    //   13135: ldc2_w -1379046568
    //   13138: l2i
    //   13139: ldc_w -75659480
    //   13142: ixor
    //   13143: ldc2_w 2122426295
    //   13146: l2i
    //   13147: ldc_w -1251853744
    //   13150: ixor
    //   13151: ixor
    //   13152: lookupswitch default -> 13180, -1254839687 -> 13135, 1179741980 -> 37852
    //   13180: iload #11
    //   13182: if_icmpge -> 13196
    //   13185: ldc2_w 920918238
    //   13188: l2i
    //   13189: ldc_w -63455562
    //   13192: ixor
    //   13193: goto -> 13204
    //   13196: ldc2_w 2003302358
    //   13199: l2i
    //   13200: ldc_w -1112256065
    //   13203: ixor
    //   13204: ldc2_w -1749751369
    //   13207: l2i
    //   13208: ldc_w 1382184445
    //   13211: ixor
    //   13212: ixor
    //   13213: tableswitch default -> 13185, 252000802 -> 13236, 252000803 -> 15235
    //   13236: getstatic Perryc.0 : I
    //   13239: ifle -> 13253
    //   13242: ldc2_w 1862396192
    //   13245: l2i
    //   13246: ldc_w 1272887148
    //   13249: ixor
    //   13250: goto -> 13261
    //   13253: ldc2_w 1254749473
    //   13256: l2i
    //   13257: ldc_w 767593341
    //   13260: ixor
    //   13261: ldc2_w 1037301019
    //   13264: l2i
    //   13265: ldc_w -794381400
    //   13268: ixor
    //   13269: ixor
    //   13270: lookupswitch default -> 37398, -1971570449 -> 13296, -911599361 -> 13253
    //   13296: aload #10
    //   13298: getstatic Perryc.c : I
    //   13301: iflt -> 13315
    //   13304: ldc2_w -1639294891
    //   13307: l2i
    //   13308: ldc_w -110617402
    //   13311: ixor
    //   13312: goto -> 13323
    //   13315: ldc2_w 337646850
    //   13318: l2i
    //   13319: ldc_w 188980373
    //   13322: ixor
    //   13323: ldc2_w 67499596
    //   13326: l2i
    //   13327: ldc_w -283786490
    //   13330: ixor
    //   13331: ixor
    //   13332: lookupswitch default -> 13360, -1942851111 -> 38074, 477054495 -> 13315
    //   13360: iload #12
    //   13362: caload
    //   13363: getstatic Perryc.c : I
    //   13366: iflt -> 13380
    //   13369: ldc2_w 1558404088
    //   13372: l2i
    //   13373: ldc_w 195846556
    //   13376: ixor
    //   13377: goto -> 13388
    //   13380: ldc2_w -520652736
    //   13383: l2i
    //   13384: ldc_w 1847918362
    //   13387: ixor
    //   13388: ldc2_w -194344907
    //   13391: l2i
    //   13392: ldc_w 1574645072
    //   13395: ixor
    //   13396: ixor
    //   13397: lookupswitch default -> 13424, -16867583 -> 37558, 1654420564 -> 13380
    //   13424: istore #13
    //   13426: getstatic Perryc.1 : I
    //   13429: ifeq -> 13443
    //   13432: ldc2_w -1564558973
    //   13435: l2i
    //   13436: ldc_w -1041355054
    //   13439: ixor
    //   13440: goto -> 13451
    //   13443: ldc2_w -685655156
    //   13446: l2i
    //   13447: ldc_w -1294216474
    //   13450: ixor
    //   13451: ldc2_w -1599008297
    //   13454: l2i
    //   13455: ldc_w -2002785917
    //   13458: ixor
    //   13459: ixor
    //   13460: lookupswitch default -> 37454, 1266577157 -> 13443, 1305776446 -> 13488
    //   13488: aload_0
    //   13489: getstatic Perryc.0 : I
    //   13492: ifle -> 13506
    //   13495: ldc2_w -1316080753
    //   13498: l2i
    //   13499: ldc_w -67794391
    //   13502: ixor
    //   13503: goto -> 13514
    //   13506: ldc2_w 1889317786
    //   13509: l2i
    //   13510: ldc_w -1734636778
    //   13513: ixor
    //   13514: ldc2_w 585940413
    //   13517: l2i
    //   13518: ldc_w 691220752
    //   13521: ixor
    //   13522: ixor
    //   13523: lookupswitch default -> 38126, -472337375 -> 13548, 1101280523 -> 13506
    //   13548: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   13551: getstatic Perryc.0 : I
    //   13554: ifle -> 13568
    //   13557: ldc2_w -846433
    //   13560: l2i
    //   13561: ldc_w -702603438
    //   13564: ixor
    //   13565: goto -> 13576
    //   13568: ldc2_w -408970335
    //   13571: l2i
    //   13572: ldc_w 1626877717
    //   13575: ixor
    //   13576: ldc2_w -128160182
    //   13579: l2i
    //   13580: ldc_w 813257718
    //   13583: ixor
    //   13584: ixor
    //   13585: lookupswitch default -> 13612, -635592273 -> 13568, -506906767 -> 38086
    //   13612: iload #13
    //   13614: getstatic Perryc.1 : I
    //   13617: ifeq -> 13631
    //   13620: ldc2_w 1088577824
    //   13623: l2i
    //   13624: ldc_w 1356569589
    //   13627: ixor
    //   13628: goto -> 13639
    //   13631: ldc2_w -203695131
    //   13634: l2i
    //   13635: ldc_w 694948291
    //   13638: ixor
    //   13639: ldc2_w 874651219
    //   13642: l2i
    //   13643: ldc_w 348189517
    //   13646: ixor
    //   13647: ixor
    //   13648: lookupswitch default -> 13676, 50927937 -> 13631, 819664843 -> 37976
    //   13676: goto -> 13680
    //   13679: athrow
    //   13680: invokestatic valueOf : (C)Ljava/lang/String;
    //   13683: goto -> 13687
    //   13686: athrow
    //   13687: ldc_w 1.3831753E38
    //   13690: invokestatic floatToIntBits : (F)I
    //   13693: ldc_w 2127568377
    //   13696: ixor
    //   13697: invokestatic intBitsToFloat : (I)F
    //   13700: getstatic Perryc.0 : I
    //   13703: ifle -> 13717
    //   13706: ldc2_w 469277912
    //   13709: l2i
    //   13710: ldc_w 173262870
    //   13713: ixor
    //   13714: goto -> 13725
    //   13717: ldc2_w 519128234
    //   13720: l2i
    //   13721: ldc_w -1239842260
    //   13724: ixor
    //   13725: ldc2_w 1726775789
    //   13728: l2i
    //   13729: ldc_w -1459597911
    //   13732: ixor
    //   13733: ixor
    //   13734: lookupswitch default -> 13760, -565733238 -> 37848, 2081937273 -> 13717
    //   13760: fload #9
    //   13762: fadd
    //   13763: getstatic Perryc.0 : I
    //   13766: ifle -> 13780
    //   13769: ldc2_w -1246711205
    //   13772: l2i
    //   13773: ldc_w 1486930923
    //   13776: ixor
    //   13777: goto -> 13788
    //   13780: ldc2_w -117237116
    //   13783: l2i
    //   13784: ldc_w -838025577
    //   13787: ixor
    //   13788: ldc2_w -1910038284
    //   13791: l2i
    //   13792: ldc_w -974053753
    //   13795: ixor
    //   13796: ixor
    //   13797: lookupswitch default -> 37258, -1496952893 -> 13780, 2094635616 -> 13824
    //   13824: aload_0
    //   13825: getstatic Perryc.c : I
    //   13828: iflt -> 13842
    //   13831: ldc2_w -1642578391
    //   13834: l2i
    //   13835: ldc_w -1905264959
    //   13838: ixor
    //   13839: goto -> 13850
    //   13842: ldc2_w 2035674028
    //   13845: l2i
    //   13846: ldc_w -544175112
    //   13849: ixor
    //   13850: ldc2_w -1067499429
    //   13853: l2i
    //   13854: ldc_w -1265867214
    //   13857: ixor
    //   13858: ixor
    //   13859: lookupswitch default -> 13884, -685347720 -> 13842, 1688530561 -> 37412
    //   13884: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13887: getstatic Perryc.c : I
    //   13890: iflt -> 13904
    //   13893: ldc2_w -421199298
    //   13896: l2i
    //   13897: ldc_w 945508622
    //   13900: ixor
    //   13901: goto -> 13912
    //   13904: ldc2_w -424080404
    //   13907: l2i
    //   13908: ldc_w 1771283248
    //   13911: ixor
    //   13912: ldc2_w -2136784472
    //   13915: l2i
    //   13916: ldc_w -1484456073
    //   13919: ixor
    //   13920: ixor
    //   13921: lookupswitch default -> 13948, -107352593 -> 37798, 1440943119 -> 13904
    //   13948: goto -> 13952
    //   13951: athrow
    //   13952: invokevirtual getValue : ()Ljava/lang/Object;
    //   13955: goto -> 13959
    //   13958: athrow
    //   13959: checkcast java/lang/Integer
    //   13962: getstatic Perryc.1 : I
    //   13965: ifeq -> 13979
    //   13968: ldc2_w -542116822
    //   13971: l2i
    //   13972: ldc_w -933911501
    //   13975: ixor
    //   13976: goto -> 13987
    //   13979: ldc2_w -122224994
    //   13982: l2i
    //   13983: ldc_w 1186842774
    //   13986: ixor
    //   13987: ldc2_w -606694425
    //   13990: l2i
    //   13991: ldc_w 1299844776
    //   13994: ixor
    //   13995: ixor
    //   13996: lookupswitch default -> 14024, -2125017770 -> 38176, -1099184664 -> 13979
    //   14024: goto -> 14028
    //   14027: athrow
    //   14028: invokevirtual intValue : ()I
    //   14031: goto -> 14035
    //   14034: athrow
    //   14035: i2f
    //   14036: getstatic Perryc.c : I
    //   14039: iflt -> 14053
    //   14042: ldc2_w 842654239
    //   14045: l2i
    //   14046: ldc_w -980532948
    //   14049: ixor
    //   14050: goto -> 14061
    //   14053: ldc2_w -1505409447
    //   14056: l2i
    //   14057: ldc_w 1859347012
    //   14060: ixor
    //   14061: ldc2_w -1674553890
    //   14064: l2i
    //   14065: ldc_w -1174300863
    //   14068: ixor
    //   14069: ixor
    //   14070: lookupswitch default -> 37748, -779722324 -> 14053, -290986366 -> 14096
    //   14096: aload #7
    //   14098: ldc2_w 821114660
    //   14101: l2i
    //   14102: ldc_w 821114660
    //   14105: ixor
    //   14106: iaload
    //   14107: getstatic Perryc.0 : I
    //   14110: ifle -> 14124
    //   14113: ldc2_w -1899010524
    //   14116: l2i
    //   14117: ldc_w -746987591
    //   14120: ixor
    //   14121: goto -> 14132
    //   14124: ldc2_w 1654470576
    //   14127: l2i
    //   14128: ldc_w -358439613
    //   14131: ixor
    //   14132: ldc2_w -1317510270
    //   14135: l2i
    //   14136: ldc_w -1177087938
    //   14139: ixor
    //   14140: ixor
    //   14141: lookupswitch default -> 14168, 1427753505 -> 37918, 1589717078 -> 14124
    //   14168: goto -> 14172
    //   14171: athrow
    //   14172: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   14175: goto -> 14179
    //   14178: athrow
    //   14179: getstatic Perryc.1 : I
    //   14182: ifeq -> 14196
    //   14185: ldc2_w -817818509
    //   14188: l2i
    //   14189: ldc_w -1591637139
    //   14192: ixor
    //   14193: goto -> 14204
    //   14196: ldc2_w 794177089
    //   14199: l2i
    //   14200: ldc_w 848430412
    //   14203: ixor
    //   14204: ldc2_w -1937005532
    //   14207: l2i
    //   14208: ldc_w -1126739317
    //   14211: ixor
    //   14212: ixor
    //   14213: lookupswitch default -> 14240, 1481546241 -> 14196, 1581017521 -> 37440
    //   14240: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14243: getstatic Perryc.0 : I
    //   14246: ifle -> 14260
    //   14249: ldc2_w 1234173361
    //   14252: l2i
    //   14253: ldc_w 350995175
    //   14256: ixor
    //   14257: goto -> 14268
    //   14260: ldc2_w -1256497625
    //   14263: l2i
    //   14264: ldc_w 844214472
    //   14267: ixor
    //   14268: ldc2_w 1048011805
    //   14271: l2i
    //   14272: ldc_w 1036963616
    //   14275: ixor
    //   14276: ixor
    //   14277: lookupswitch default -> 14304, -1317586774 -> 14260, 1591579755 -> 38040
    //   14304: goto -> 14308
    //   14307: athrow
    //   14308: invokevirtual getValue : ()Ljava/lang/Object;
    //   14311: goto -> 14315
    //   14314: athrow
    //   14315: checkcast java/lang/Integer
    //   14318: getstatic Perryc.1 : I
    //   14321: ifeq -> 14335
    //   14324: ldc2_w 659301963
    //   14327: l2i
    //   14328: ldc_w -971823022
    //   14331: ixor
    //   14332: goto -> 14343
    //   14335: ldc2_w -843988161
    //   14338: l2i
    //   14339: ldc_w -31527251
    //   14342: ixor
    //   14343: ldc2_w -1119510203
    //   14346: l2i
    //   14347: ldc_w -689652967
    //   14350: ixor
    //   14351: ixor
    //   14352: lookupswitch default -> 14380, -1963060155 -> 37716, -1830810932 -> 14335
    //   14380: goto -> 14384
    //   14383: athrow
    //   14384: invokevirtual intValue : ()I
    //   14387: goto -> 14391
    //   14390: athrow
    //   14391: imul
    //   14392: getstatic Perryc.0 : I
    //   14395: ifle -> 14409
    //   14398: ldc2_w -1280348467
    //   14401: l2i
    //   14402: ldc_w 2064504373
    //   14405: ixor
    //   14406: goto -> 14417
    //   14409: ldc2_w 179487032
    //   14412: l2i
    //   14413: ldc_w -731692918
    //   14416: ixor
    //   14417: ldc2_w 1918802083
    //   14420: l2i
    //   14421: ldc_w -1560691634
    //   14424: ixor
    //   14425: ixor
    //   14426: lookupswitch default -> 14452, 403020821 -> 38050, 1803823227 -> 14409
    //   14452: goto -> 14456
    //   14455: athrow
    //   14456: invokestatic rainbow : (I)Ljava/awt/Color;
    //   14459: goto -> 14463
    //   14462: athrow
    //   14463: getstatic Perryc.c : I
    //   14466: iflt -> 14480
    //   14469: ldc2_w -100041702
    //   14472: l2i
    //   14473: ldc_w -352503150
    //   14476: ixor
    //   14477: goto -> 14488
    //   14480: ldc2_w 1536724891
    //   14483: l2i
    //   14484: ldc_w -1124006567
    //   14487: ixor
    //   14488: ldc2_w 1701207197
    //   14491: l2i
    //   14492: ldc_w 1302664001
    //   14495: ixor
    //   14496: ixor
    //   14497: lookupswitch default -> 37498, -832912098 -> 14524, 943130964 -> 14480
    //   14524: goto -> 14528
    //   14527: athrow
    //   14528: invokevirtual getRGB : ()I
    //   14531: goto -> 14535
    //   14534: athrow
    //   14535: ldc2_w -87830545
    //   14538: l2i
    //   14539: ldc_w -87830546
    //   14542: ixor
    //   14543: getstatic Perryc.c : I
    //   14546: iflt -> 14560
    //   14549: ldc2_w 532847680
    //   14552: l2i
    //   14553: ldc_w -1755388833
    //   14556: ixor
    //   14557: goto -> 14568
    //   14560: ldc2_w 462150336
    //   14563: l2i
    //   14564: ldc_w -1989336853
    //   14567: ixor
    //   14568: ldc2_w -1045407346
    //   14571: l2i
    //   14572: ldc_w 787703844
    //   14575: ixor
    //   14576: ixor
    //   14577: lookupswitch default -> 37722, 1742686645 -> 14560, 2108017537 -> 14604
    //   14604: goto -> 14608
    //   14607: athrow
    //   14608: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   14611: goto -> 14615
    //   14614: athrow
    //   14615: getstatic Perryc.0 : I
    //   14618: ifle -> 14632
    //   14621: ldc2_w 1639551437
    //   14624: l2i
    //   14625: ldc_w -855362085
    //   14628: ixor
    //   14629: goto -> 14640
    //   14632: ldc2_w 1699183686
    //   14635: l2i
    //   14636: ldc_w -466273847
    //   14639: ixor
    //   14640: ldc2_w 1119202615
    //   14643: l2i
    //   14644: ldc_w -1691346008
    //   14647: ixor
    //   14648: ixor
    //   14649: lookupswitch default -> 37946, 1492644624 -> 14676, 1966609033 -> 14632
    //   14676: fload #9
    //   14678: getstatic Perryc.0 : I
    //   14681: ifle -> 14695
    //   14684: ldc2_w 1607263363
    //   14687: l2i
    //   14688: ldc_w 29621371
    //   14691: ixor
    //   14692: goto -> 14703
    //   14695: ldc2_w -2138723160
    //   14698: l2i
    //   14699: ldc_w -1292983093
    //   14702: ixor
    //   14703: ldc2_w 1000462381
    //   14706: l2i
    //   14707: ldc_w -12568032
    //   14710: ixor
    //   14711: ixor
    //   14712: lookupswitch default -> 14740, -1695614219 -> 37394, 1086857841 -> 14695
    //   14740: aload_0
    //   14741: getstatic Perryc.c : I
    //   14744: iflt -> 14758
    //   14747: ldc2_w -228566780
    //   14750: l2i
    //   14751: ldc_w -622379436
    //   14754: ixor
    //   14755: goto -> 14766
    //   14758: ldc2_w -1327935070
    //   14761: l2i
    //   14762: ldc_w -787285265
    //   14765: ixor
    //   14766: ldc2_w -851119829
    //   14769: l2i
    //   14770: ldc_w 475779851
    //   14773: ixor
    //   14774: ixor
    //   14775: lookupswitch default -> 14800, -269819019 -> 14758, -107461264 -> 37724
    //   14800: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   14803: getstatic Perryc.1 : I
    //   14806: ifeq -> 14820
    //   14809: ldc2_w -945258724
    //   14812: l2i
    //   14813: ldc_w 347960174
    //   14816: ixor
    //   14817: goto -> 14828
    //   14820: ldc2_w -1488402138
    //   14823: l2i
    //   14824: ldc_w 1310876980
    //   14827: ixor
    //   14828: ldc2_w 1452651994
    //   14831: l2i
    //   14832: ldc_w -1613767880
    //   14835: ixor
    //   14836: ixor
    //   14837: lookupswitch default -> 14864, 441410192 -> 37496, 1083319350 -> 14820
    //   14864: iload #13
    //   14866: getstatic Perryc.1 : I
    //   14869: ifeq -> 14883
    //   14872: ldc2_w -542988251
    //   14875: l2i
    //   14876: ldc_w -818863104
    //   14879: ixor
    //   14880: goto -> 14891
    //   14883: ldc2_w -2096385792
    //   14886: l2i
    //   14887: ldc_w -872099180
    //   14890: ixor
    //   14891: ldc2_w 921361687
    //   14894: l2i
    //   14895: ldc_w 651746385
    //   14898: ixor
    //   14899: ixor
    //   14900: lookupswitch default -> 14928, 10587491 -> 37580, 777363123 -> 14883
    //   14928: goto -> 14932
    //   14931: athrow
    //   14932: invokestatic valueOf : (C)Ljava/lang/String;
    //   14935: goto -> 14939
    //   14938: athrow
    //   14939: getstatic Perryc.c : I
    //   14942: iflt -> 14956
    //   14945: ldc2_w 390279099
    //   14948: l2i
    //   14949: ldc_w 1147316557
    //   14952: ixor
    //   14953: goto -> 14964
    //   14956: ldc2_w 1786268635
    //   14959: l2i
    //   14960: ldc_w 1156709669
    //   14963: ixor
    //   14964: ldc2_w 1131839669
    //   14967: l2i
    //   14968: ldc_w -1232218295
    //   14971: ixor
    //   14972: ixor
    //   14973: lookupswitch default -> 15000, -1495609078 -> 37992, 930739739 -> 14956
    //   15000: goto -> 15004
    //   15003: athrow
    //   15004: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   15007: goto -> 15011
    //   15010: athrow
    //   15011: i2f
    //   15012: fadd
    //   15013: getstatic Perryc.c : I
    //   15016: iflt -> 15030
    //   15019: ldc2_w 360150227
    //   15022: l2i
    //   15023: ldc_w -2122261840
    //   15026: ixor
    //   15027: goto -> 15038
    //   15030: ldc2_w 2016579444
    //   15033: l2i
    //   15034: ldc_w 2037335761
    //   15037: ixor
    //   15038: ldc2_w 1801869543
    //   15041: l2i
    //   15042: ldc_w 1391774337
    //   15045: ixor
    //   15046: ixor
    //   15047: lookupswitch default -> 37916, -1385874427 -> 15030, 953113539 -> 15072
    //   15072: fstore #9
    //   15074: getstatic Perryc.0 : I
    //   15077: ifle -> 15091
    //   15080: ldc2_w 1353705004
    //   15083: l2i
    //   15084: ldc_w 19052859
    //   15087: ixor
    //   15088: goto -> 15099
    //   15091: ldc2_w 1524614479
    //   15094: l2i
    //   15095: ldc_w 395713136
    //   15098: ixor
    //   15099: ldc2_w -706686344
    //   15102: l2i
    //   15103: ldc_w -536731343
    //   15106: ixor
    //   15107: ixor
    //   15108: lookupswitch default -> 15136, 426971785 -> 15091, 1685040222 -> 37790
    //   15136: aload #7
    //   15138: ldc2_w -880657405
    //   15141: l2i
    //   15142: ldc_w -880657405
    //   15145: ixor
    //   15146: getstatic Perryc.0 : I
    //   15149: ifle -> 15163
    //   15152: ldc2_w 320461260
    //   15155: l2i
    //   15156: ldc_w -299149488
    //   15159: ixor
    //   15160: goto -> 15171
    //   15163: ldc2_w -523929767
    //   15166: l2i
    //   15167: ldc_w 360004436
    //   15170: ixor
    //   15171: ldc2_w -1955418738
    //   15174: l2i
    //   15175: ldc_w 509930208
    //   15178: ixor
    //   15179: ixor
    //   15180: lookupswitch default -> 15208, 1577970584 -> 15163, 1747241458 -> 37764
    //   15208: aload #7
    //   15210: ldc2_w -950107762
    //   15213: l2i
    //   15214: ldc_w -950107762
    //   15217: ixor
    //   15218: iaload
    //   15219: ldc2_w -857996392
    //   15222: l2i
    //   15223: ldc_w -857996391
    //   15226: ixor
    //   15227: iadd
    //   15228: iastore
    //   15229: iinc #12, 1
    //   15232: goto -> 13054
    //   15235: goto -> 15655
    //   15238: getstatic Perryc.c : I
    //   15241: iflt -> 15255
    //   15244: ldc2_w 633002564
    //   15247: l2i
    //   15248: ldc_w -1916077282
    //   15251: ixor
    //   15252: goto -> 15263
    //   15255: ldc2_w 1145920210
    //   15258: l2i
    //   15259: ldc_w -1932140681
    //   15262: ixor
    //   15263: ldc2_w -2118855609
    //   15266: l2i
    //   15267: ldc_w -294962032
    //   15270: ixor
    //   15271: ixor
    //   15272: lookupswitch default -> 15300, -944780915 -> 37836, 1535670934 -> 15255
    //   15300: aload_0
    //   15301: getstatic Perryc.1 : I
    //   15304: ifeq -> 15318
    //   15307: ldc2_w -1740046968
    //   15310: l2i
    //   15311: ldc_w -342247921
    //   15314: ixor
    //   15315: goto -> 15326
    //   15318: ldc2_w 1130888083
    //   15321: l2i
    //   15322: ldc_w -168655826
    //   15325: ixor
    //   15326: ldc2_w 1874628664
    //   15329: l2i
    //   15330: ldc_w 479820809
    //   15333: ixor
    //   15334: ixor
    //   15335: lookupswitch default -> 15360, 16033718 -> 38004, 914781674 -> 15318
    //   15360: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   15363: getstatic Perryc.0 : I
    //   15366: ifle -> 15380
    //   15369: ldc2_w -1600083213
    //   15372: l2i
    //   15373: ldc_w 210197594
    //   15376: ixor
    //   15377: goto -> 15388
    //   15380: ldc2_w 1346271934
    //   15383: l2i
    //   15384: ldc_w -1455909966
    //   15387: ixor
    //   15388: ldc2_w 513656504
    //   15391: l2i
    //   15392: ldc_w -762111457
    //   15395: ixor
    //   15396: ixor
    //   15397: lookupswitch default -> 15424, -1232284208 -> 15380, 1613310478 -> 37320
    //   15424: aload #4
    //   15426: ldc_w 2.5974508E38
    //   15429: invokestatic floatToIntBits : (F)I
    //   15432: ldc_w 2135124245
    //   15435: ixor
    //   15436: invokestatic intBitsToFloat : (I)F
    //   15439: ldc_w 0.1494922
    //   15442: invokestatic floatToIntBits : (F)I
    //   15445: ldc_w 2134447228
    //   15448: ixor
    //   15449: invokestatic intBitsToFloat : (I)F
    //   15452: getstatic Perryc.c : I
    //   15455: iflt -> 15469
    //   15458: ldc2_w -1870380415
    //   15461: l2i
    //   15462: ldc_w -1732442860
    //   15465: ixor
    //   15466: goto -> 15477
    //   15469: ldc2_w -533598025
    //   15472: l2i
    //   15473: ldc_w -1469924166
    //   15476: ixor
    //   15477: ldc2_w 237773595
    //   15480: l2i
    //   15481: ldc_w -443496180
    //   15484: ixor
    //   15485: ixor
    //   15486: lookupswitch default -> 37446, -1544575462 -> 15512, -477778558 -> 15469
    //   15512: aload_0
    //   15513: getstatic Perryc.1 : I
    //   15516: ifeq -> 15530
    //   15519: ldc2_w 590346287
    //   15522: l2i
    //   15523: ldc_w 1223976161
    //   15526: ixor
    //   15527: goto -> 15538
    //   15530: ldc2_w 1695915225
    //   15533: l2i
    //   15534: ldc_w 550625014
    //   15537: ixor
    //   15538: ldc2_w 1547986383
    //   15541: l2i
    //   15542: ldc_w 1794584145
    //   15545: ixor
    //   15546: ixor
    //   15547: lookupswitch default -> 37510, 1567151952 -> 15530, 1937181105 -> 15572
    //   15572: getfield color : I
    //   15575: ldc2_w -580921293
    //   15578: l2i
    //   15579: ldc_w -580921294
    //   15582: ixor
    //   15583: getstatic Perryc.c : I
    //   15586: iflt -> 15600
    //   15589: ldc2_w -981441839
    //   15592: l2i
    //   15593: ldc_w 1529755396
    //   15596: ixor
    //   15597: goto -> 15608
    //   15600: ldc2_w -2017489778
    //   15603: l2i
    //   15604: ldc_w 1657345418
    //   15607: ixor
    //   15608: ldc2_w -1012502945
    //   15611: l2i
    //   15612: ldc_w 1071631232
    //   15615: ixor
    //   15616: ixor
    //   15617: lookupswitch default -> 37296, 420429019 -> 15644, 1658318858 -> 15600
    //   15644: goto -> 15648
    //   15647: athrow
    //   15648: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   15651: goto -> 15655
    //   15654: athrow
    //   15655: getstatic Perryc.1 : I
    //   15658: ifeq -> 15672
    //   15661: ldc2_w -1464442181
    //   15664: l2i
    //   15665: ldc_w -1633621960
    //   15668: ixor
    //   15669: goto -> 15680
    //   15672: ldc2_w -122828286
    //   15675: l2i
    //   15676: ldc_w -1208990234
    //   15679: ixor
    //   15680: ldc2_w 1967055137
    //   15683: l2i
    //   15684: ldc_w 518858890
    //   15687: ixor
    //   15688: ixor
    //   15689: lookupswitch default -> 15716, -1524083132 -> 15672, 1573208872 -> 37576
    //   15716: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   15719: ldc_w '䯫㌆䮨坕兀ꕱ๷㙹'
    //   15722: getstatic Perryc.1 : I
    //   15725: ifeq -> 15739
    //   15728: ldc2_w 1413226743
    //   15731: l2i
    //   15732: ldc_w -318514587
    //   15735: ixor
    //   15736: goto -> 15747
    //   15739: ldc2_w -2007288049
    //   15742: l2i
    //   15743: ldc_w 233842744
    //   15746: ixor
    //   15747: ldc2_w 243181679
    //   15750: l2i
    //   15751: ldc_w 1914257109
    //   15754: ixor
    //   15755: ixor
    //   15756: lookupswitch default -> 37932, -984060888 -> 15739, -104035955 -> 15784
    //   15784: goto -> 15788
    //   15787: athrow
    //   15788: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15791: goto -> 15795
    //   15794: athrow
    //   15795: getstatic Perryc.0 : I
    //   15798: ifle -> 15812
    //   15801: ldc2_w 2112085971
    //   15804: l2i
    //   15805: ldc_w 1394220606
    //   15808: ixor
    //   15809: goto -> 15820
    //   15812: ldc2_w -813005811
    //   15815: l2i
    //   15816: ldc_w 1140534484
    //   15819: ixor
    //   15820: ldc2_w 1499478369
    //   15823: l2i
    //   15824: ldc_w -1474353197
    //   15827: ixor
    //   15828: ixor
    //   15829: lookupswitch default -> 38046, -544809121 -> 15812, 2098116203 -> 15856
    //   15856: goto -> 15860
    //   15859: athrow
    //   15860: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   15863: goto -> 15867
    //   15866: athrow
    //   15867: getstatic Perryc.0 : I
    //   15870: ifle -> 15884
    //   15873: ldc2_w 681630722
    //   15876: l2i
    //   15877: ldc_w 1329000291
    //   15880: ixor
    //   15881: goto -> 15892
    //   15884: ldc2_w -2004516498
    //   15887: l2i
    //   15888: ldc_w -2071550766
    //   15891: ixor
    //   15892: ldc2_w 1313671899
    //   15895: l2i
    //   15896: ldc_w 1178966607
    //   15899: ixor
    //   15900: ixor
    //   15901: lookupswitch default -> 15928, -1871822573 -> 15884, 1872667637 -> 37436
    //   15928: goto -> 15932
    //   15931: athrow
    //   15932: invokevirtual isEnabled : ()Z
    //   15935: goto -> 15939
    //   15938: athrow
    //   15939: ifeq -> 15953
    //   15942: ldc2_w -913584583
    //   15945: l2i
    //   15946: ldc_w -1723059475
    //   15949: ixor
    //   15950: goto -> 15961
    //   15953: ldc2_w 830609709
    //   15956: l2i
    //   15957: ldc_w 1631970808
    //   15960: ixor
    //   15961: ldc2_w 824636572
    //   15964: l2i
    //   15965: ldc_w -1196671814
    //   15968: ixor
    //   15969: ixor
    //   15970: tableswitch default -> 15942, -649251598 -> 15992, -649251597 -> 20959
    //   15992: getstatic Perryc.0 : I
    //   15995: ifle -> 16009
    //   15998: ldc2_w 1439224272
    //   16001: l2i
    //   16002: ldc_w -365110224
    //   16005: ixor
    //   16006: goto -> 16017
    //   16009: ldc2_w -1815692906
    //   16012: l2i
    //   16013: ldc_w -451592477
    //   16016: ixor
    //   16017: ldc2_w -1144274708
    //   16020: l2i
    //   16021: ldc_w -47263626
    //   16024: ixor
    //   16025: ixor
    //   16026: lookupswitch default -> 37232, -116318854 -> 16009, 808884207 -> 16052
    //   16052: goto -> 16056
    //   16055: athrow
    //   16056: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   16059: goto -> 16063
    //   16062: athrow
    //   16063: getstatic Perryc.c : I
    //   16066: iflt -> 16080
    //   16069: ldc2_w -1258281386
    //   16072: l2i
    //   16073: ldc_w -1075391787
    //   16076: ixor
    //   16077: goto -> 16088
    //   16080: ldc2_w 191735709
    //   16083: l2i
    //   16084: ldc_w -817453807
    //   16087: ixor
    //   16088: ldc2_w 837628815
    //   16091: l2i
    //   16092: ldc_w -1603840990
    //   16095: ixor
    //   16096: ixor
    //   16097: lookupswitch default -> 16124, -1687383250 -> 37914, 1962318680 -> 16080
    //   16124: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16127: getstatic Perryc.0 : I
    //   16130: ifle -> 16144
    //   16133: ldc2_w -141233685
    //   16136: l2i
    //   16137: ldc_w 468102770
    //   16140: ixor
    //   16141: goto -> 16152
    //   16144: ldc2_w -506716891
    //   16147: l2i
    //   16148: ldc_w -1838862021
    //   16151: ixor
    //   16152: ldc2_w -1805227877
    //   16155: l2i
    //   16156: ldc_w 1938432017
    //   16159: ixor
    //   16160: ixor
    //   16161: lookupswitch default -> 16188, -1319253168 -> 16144, 194909971 -> 37402
    //   16188: goto -> 16192
    //   16191: athrow
    //   16192: invokevirtual getValue : ()Ljava/lang/Object;
    //   16195: goto -> 16199
    //   16198: athrow
    //   16199: checkcast java/lang/Boolean
    //   16202: getstatic Perryc.c : I
    //   16205: iflt -> 16219
    //   16208: ldc2_w -777265967
    //   16211: l2i
    //   16212: ldc_w 1260007276
    //   16215: ixor
    //   16216: goto -> 16227
    //   16219: ldc2_w -887232552
    //   16222: l2i
    //   16223: ldc_w 1622705239
    //   16226: ixor
    //   16227: ldc2_w 1074176820
    //   16230: l2i
    //   16231: ldc_w 1697960758
    //   16234: ixor
    //   16235: ixor
    //   16236: lookupswitch default -> 38034, -1902701683 -> 16264, -1081900097 -> 16219
    //   16264: goto -> 16268
    //   16267: athrow
    //   16268: invokevirtual booleanValue : ()Z
    //   16271: goto -> 16275
    //   16274: athrow
    //   16275: ifeq -> 16289
    //   16278: ldc2_w -1518663765
    //   16281: l2i
    //   16282: ldc_w -154047220
    //   16285: ixor
    //   16286: goto -> 16297
    //   16289: ldc2_w 472064054
    //   16292: l2i
    //   16293: ldc_w 1334397584
    //   16296: ixor
    //   16297: ldc2_w -1773471429
    //   16300: l2i
    //   16301: ldc_w -1728264512
    //   16304: ixor
    //   16305: ixor
    //   16306: tableswitch default -> 16278, 1562137948 -> 16328, 1562137949 -> 20542
    //   16328: getstatic Perryc.1 : I
    //   16331: ifeq -> 16345
    //   16334: ldc2_w 178802263
    //   16337: l2i
    //   16338: ldc_w -1158734289
    //   16341: ixor
    //   16342: goto -> 16353
    //   16345: ldc2_w 272521129
    //   16348: l2i
    //   16349: ldc_w -1880707748
    //   16352: ixor
    //   16353: ldc2_w 341447588
    //   16356: l2i
    //   16357: ldc_w 673868437
    //   16360: ixor
    //   16361: ixor
    //   16362: lookupswitch default -> 16388, -1942542007 -> 37842, 514112119 -> 16345
    //   16388: goto -> 16392
    //   16391: athrow
    //   16392: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   16395: goto -> 16399
    //   16398: athrow
    //   16399: getstatic Perryc.0 : I
    //   16402: ifle -> 16416
    //   16405: ldc2_w -432453323
    //   16408: l2i
    //   16409: ldc_w 639110227
    //   16412: ixor
    //   16413: goto -> 16424
    //   16416: ldc2_w -656416461
    //   16419: l2i
    //   16420: ldc_w 886943759
    //   16423: ixor
    //   16424: ldc2_w -252546641
    //   16427: l2i
    //   16428: ldc_w 1794593200
    //   16431: ixor
    //   16432: ixor
    //   16433: lookupswitch default -> 16460, -1220852167 -> 16416, 1512334713 -> 37768
    //   16460: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16463: getstatic Perryc.c : I
    //   16466: iflt -> 16480
    //   16469: ldc2_w -206850799
    //   16472: l2i
    //   16473: ldc_w -975966374
    //   16476: ixor
    //   16477: goto -> 16488
    //   16480: ldc2_w 1899099128
    //   16483: l2i
    //   16484: ldc_w 1870948313
    //   16487: ixor
    //   16488: ldc2_w -394289982
    //   16491: l2i
    //   16492: ldc_w -1560750770
    //   16495: ixor
    //   16496: ixor
    //   16497: lookupswitch default -> 37616, 1412619693 -> 16524, 2097091527 -> 16480
    //   16524: goto -> 16528
    //   16527: athrow
    //   16528: invokevirtual getValue : ()Ljava/lang/Object;
    //   16531: goto -> 16535
    //   16534: athrow
    //   16535: getstatic Perryc.0 : I
    //   16538: ifle -> 16552
    //   16541: ldc2_w 1765047960
    //   16544: l2i
    //   16545: ldc_w -800070321
    //   16548: ixor
    //   16549: goto -> 16560
    //   16552: ldc2_w -1067000186
    //   16555: l2i
    //   16556: ldc_w 127102455
    //   16559: ixor
    //   16560: ldc2_w 276210101
    //   16563: l2i
    //   16564: ldc_w -1910256538
    //   16567: ixor
    //   16568: ixor
    //   16569: lookupswitch default -> 16596, 426632977 -> 16552, 657389060 -> 37262
    //   16596: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   16599: if_acmpne -> 16613
    //   16602: ldc2_w 628225106
    //   16605: l2i
    //   16606: ldc_w -205432088
    //   16609: ixor
    //   16610: goto -> 16621
    //   16613: ldc2_w 1826127974
    //   16616: l2i
    //   16617: ldc_w -1167577379
    //   16620: ixor
    //   16621: ldc2_w -1394885871
    //   16624: l2i
    //   16625: ldc_w -1219799787
    //   16628: ixor
    //   16629: ixor
    //   16630: tableswitch default -> 16602, -853524290 -> 16652, -853524289 -> 17650
    //   16652: getstatic Perryc.0 : I
    //   16655: ifle -> 16669
    //   16658: ldc2_w 879418176
    //   16661: l2i
    //   16662: ldc_w 234562758
    //   16665: ixor
    //   16666: goto -> 16677
    //   16669: ldc2_w -238458706
    //   16672: l2i
    //   16673: ldc_w -1530737615
    //   16676: ixor
    //   16677: ldc2_w 454306767
    //   16680: l2i
    //   16681: ldc_w -312125233
    //   16684: ixor
    //   16685: ixor
    //   16686: lookupswitch default -> 38184, -1552230497 -> 16712, -807367546 -> 16669
    //   16712: aload_0
    //   16713: getstatic Perryc.0 : I
    //   16716: ifle -> 16730
    //   16719: ldc2_w -675894718
    //   16722: l2i
    //   16723: ldc_w 1992717929
    //   16726: ixor
    //   16727: goto -> 16738
    //   16730: ldc2_w 1816679271
    //   16733: l2i
    //   16734: ldc_w 1491410686
    //   16737: ixor
    //   16738: ldc2_w 1445654683
    //   16741: l2i
    //   16742: ldc_w 2134099205
    //   16745: ixor
    //   16746: ixor
    //   16747: lookupswitch default -> 38018, -2006324811 -> 16730, 498366471 -> 16772
    //   16772: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   16775: getstatic Perryc.c : I
    //   16778: iflt -> 16792
    //   16781: ldc2_w -1617555381
    //   16784: l2i
    //   16785: ldc_w -282841
    //   16788: ixor
    //   16789: goto -> 16800
    //   16792: ldc2_w 1609952630
    //   16795: l2i
    //   16796: ldc_w 708400470
    //   16799: ixor
    //   16800: ldc2_w 667818292
    //   16803: l2i
    //   16804: ldc_w -1429350952
    //   16807: ixor
    //   16808: ixor
    //   16809: lookupswitch default -> 37382, -311528576 -> 16792, -120621876 -> 16836
    //   16836: aload_3
    //   16837: ldc_w 1.5654054E38
    //   16840: invokestatic floatToIntBits : (F)I
    //   16843: ldc_w 2129365305
    //   16846: ixor
    //   16847: invokestatic intBitsToFloat : (I)F
    //   16850: getstatic Perryc.c : I
    //   16853: iflt -> 16867
    //   16856: ldc2_w -1444010896
    //   16859: l2i
    //   16860: ldc_w 950764419
    //   16863: ixor
    //   16864: goto -> 16875
    //   16867: ldc2_w -1094765677
    //   16870: l2i
    //   16871: ldc_w 1838369693
    //   16874: ixor
    //   16875: ldc2_w 1144300625
    //   16878: l2i
    //   16879: ldc_w -139766700
    //   16882: ixor
    //   16883: ixor
    //   16884: lookupswitch default -> 37996, 584734710 -> 16867, 1622378507 -> 16912
    //   16912: aload_0
    //   16913: getstatic Perryc.0 : I
    //   16916: ifle -> 16930
    //   16919: ldc2_w -2317572
    //   16922: l2i
    //   16923: ldc_w 534181399
    //   16926: ixor
    //   16927: goto -> 16938
    //   16930: ldc2_w 209494393
    //   16933: l2i
    //   16934: ldc_w -1016569204
    //   16937: ixor
    //   16938: ldc2_w 39450341
    //   16941: l2i
    //   16942: ldc_w 2083805848
    //   16945: ixor
    //   16946: ixor
    //   16947: lookupswitch default -> 16972, -1637353322 -> 37714, -1119799780 -> 16930
    //   16972: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16975: getstatic Perryc.c : I
    //   16978: iflt -> 16992
    //   16981: ldc2_w -587465700
    //   16984: l2i
    //   16985: ldc_w 1612620429
    //   16988: ixor
    //   16989: goto -> 17000
    //   16992: ldc2_w 500186311
    //   16995: l2i
    //   16996: ldc_w -2035287404
    //   16999: ixor
    //   17000: ldc2_w 1672876063
    //   17003: l2i
    //   17004: ldc_w 1984782532
    //   17007: ixor
    //   17008: ixor
    //   17009: lookupswitch default -> 37964, -1903905144 -> 17036, -1457639862 -> 16992
    //   17036: goto -> 17040
    //   17039: athrow
    //   17040: invokevirtual getValue : ()Ljava/lang/Object;
    //   17043: goto -> 17047
    //   17046: athrow
    //   17047: checkcast java/lang/Integer
    //   17050: getstatic Perryc.c : I
    //   17053: iflt -> 17067
    //   17056: ldc2_w -478565703
    //   17059: l2i
    //   17060: ldc_w 1713760609
    //   17063: ixor
    //   17064: goto -> 17075
    //   17067: ldc2_w -370587383
    //   17070: l2i
    //   17071: ldc_w 448804539
    //   17074: ixor
    //   17075: ldc2_w -688377290
    //   17078: l2i
    //   17079: ldc_w -2021796411
    //   17082: ixor
    //   17083: ixor
    //   17084: lookupswitch default -> 17112, -723934165 -> 38000, -286379888 -> 17067
    //   17112: goto -> 17116
    //   17115: athrow
    //   17116: invokevirtual intValue : ()I
    //   17119: goto -> 17123
    //   17122: athrow
    //   17123: i2f
    //   17124: ldc_w 0.78356093
    //   17127: invokestatic floatToIntBits : (F)I
    //   17130: ldc_w 2120783731
    //   17133: ixor
    //   17134: invokestatic intBitsToFloat : (I)F
    //   17137: fadd
    //   17138: getstatic Perryc.c : I
    //   17141: iflt -> 17155
    //   17144: ldc2_w -1334653432
    //   17147: l2i
    //   17148: ldc_w -993483112
    //   17151: ixor
    //   17152: goto -> 17163
    //   17155: ldc2_w 157989199
    //   17158: l2i
    //   17159: ldc_w 227214850
    //   17162: ixor
    //   17163: ldc2_w -1254946384
    //   17166: l2i
    //   17167: ldc_w 1280648794
    //   17170: ixor
    //   17171: ixor
    //   17172: lookupswitch default -> 37604, -1914943622 -> 17155, -41447257 -> 17200
    //   17200: goto -> 17204
    //   17203: athrow
    //   17204: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   17207: goto -> 17211
    //   17210: athrow
    //   17211: getstatic Perryc.0 : I
    //   17214: ifle -> 17228
    //   17217: ldc2_w 1045189437
    //   17220: l2i
    //   17221: ldc_w -1527672136
    //   17224: ixor
    //   17225: goto -> 17236
    //   17228: ldc2_w -41200631
    //   17231: l2i
    //   17232: ldc_w -1987356645
    //   17235: ixor
    //   17236: ldc2_w -1942258590
    //   17239: l2i
    //   17240: ldc_w -1272395766
    //   17243: ixor
    //   17244: ixor
    //   17245: lookupswitch default -> 37200, -1565624851 -> 17228, 1276360826 -> 17272
    //   17272: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17275: getstatic Perryc.c : I
    //   17278: iflt -> 17292
    //   17281: ldc2_w -2063156217
    //   17284: l2i
    //   17285: ldc_w 1442299163
    //   17288: ixor
    //   17289: goto -> 17300
    //   17292: ldc2_w 867497412
    //   17295: l2i
    //   17296: ldc_w -579287486
    //   17299: ixor
    //   17300: ldc2_w 766052277
    //   17303: l2i
    //   17304: ldc_w 18059981
    //   17307: ixor
    //   17308: ixor
    //   17309: lookupswitch default -> 17336, -1172984632 -> 17292, -62155676 -> 38148
    //   17336: goto -> 17340
    //   17339: athrow
    //   17340: invokevirtual getValue : ()Ljava/lang/Object;
    //   17343: goto -> 17347
    //   17346: athrow
    //   17347: checkcast java/lang/Integer
    //   17350: getstatic Perryc.c : I
    //   17353: iflt -> 17367
    //   17356: ldc2_w -2137051977
    //   17359: l2i
    //   17360: ldc_w 787188390
    //   17363: ixor
    //   17364: goto -> 17375
    //   17367: ldc2_w 1184842202
    //   17370: l2i
    //   17371: ldc_w -1285018942
    //   17374: ixor
    //   17375: ldc2_w 1131261412
    //   17378: l2i
    //   17379: ldc_w 44784136
    //   17382: ixor
    //   17383: ixor
    //   17384: lookupswitch default -> 17412, -1419951387 -> 17367, -273526275 -> 37434
    //   17412: goto -> 17416
    //   17415: athrow
    //   17416: invokevirtual intValue : ()I
    //   17419: goto -> 17423
    //   17422: athrow
    //   17423: getstatic Perryc.c : I
    //   17426: iflt -> 17440
    //   17429: ldc2_w -1570796968
    //   17432: l2i
    //   17433: ldc_w 1871175243
    //   17436: ixor
    //   17437: goto -> 17448
    //   17440: ldc2_w -2059777697
    //   17443: l2i
    //   17444: ldc_w -241238995
    //   17447: ixor
    //   17448: ldc2_w -653564805
    //   17451: l2i
    //   17452: ldc_w -1539390700
    //   17455: ixor
    //   17456: ixor
    //   17457: lookupswitch default -> 17484, -1326582916 -> 37504, 110598871 -> 17440
    //   17484: goto -> 17488
    //   17487: athrow
    //   17488: invokestatic rainbow : (I)Ljava/awt/Color;
    //   17491: goto -> 17495
    //   17494: athrow
    //   17495: getstatic Perryc.0 : I
    //   17498: ifle -> 17512
    //   17501: ldc2_w 2084711021
    //   17504: l2i
    //   17505: ldc_w -244523311
    //   17508: ixor
    //   17509: goto -> 17520
    //   17512: ldc2_w 1405906654
    //   17515: l2i
    //   17516: ldc_w -471912801
    //   17519: ixor
    //   17520: ldc2_w -1402108289
    //   17523: l2i
    //   17524: ldc_w 713114183
    //   17527: ixor
    //   17528: ixor
    //   17529: lookupswitch default -> 17556, -1211825300 -> 17512, 197275780 -> 38078
    //   17556: goto -> 17560
    //   17559: athrow
    //   17560: invokevirtual getRGB : ()I
    //   17563: goto -> 17567
    //   17566: athrow
    //   17567: ldc2_w -2137910641
    //   17570: l2i
    //   17571: ldc_w -2137910642
    //   17574: ixor
    //   17575: getstatic Perryc.0 : I
    //   17578: ifle -> 17592
    //   17581: ldc2_w 1815166711
    //   17584: l2i
    //   17585: ldc_w -1931894160
    //   17588: ixor
    //   17589: goto -> 17600
    //   17592: ldc2_w -580578435
    //   17595: l2i
    //   17596: ldc_w 664859860
    //   17599: ixor
    //   17600: ldc2_w 1348892908
    //   17603: l2i
    //   17604: ldc_w 1888210992
    //   17607: ixor
    //   17608: ixor
    //   17609: lookupswitch default -> 37266, -1073400741 -> 17592, -634892427 -> 17636
    //   17636: goto -> 17640
    //   17639: athrow
    //   17640: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   17643: goto -> 17647
    //   17646: athrow
    //   17647: goto -> 20959
    //   17650: ldc2_w -2107887692
    //   17653: l2i
    //   17654: ldc_w -2107887691
    //   17657: ixor
    //   17658: newarray int
    //   17660: dup
    //   17661: ldc2_w 1036949915
    //   17664: l2i
    //   17665: ldc_w 1036949915
    //   17668: ixor
    //   17669: ldc2_w 1127751082
    //   17672: l2i
    //   17673: ldc_w 1127751083
    //   17676: ixor
    //   17677: iastore
    //   17678: getstatic Perryc.0 : I
    //   17681: ifle -> 17695
    //   17684: ldc2_w -167637320
    //   17687: l2i
    //   17688: ldc_w 1997715134
    //   17691: ixor
    //   17692: goto -> 17703
    //   17695: ldc2_w -954768264
    //   17698: l2i
    //   17699: ldc_w 268091288
    //   17702: ixor
    //   17703: ldc2_w 795746240
    //   17706: l2i
    //   17707: ldc_w 786438730
    //   17710: ixor
    //   17711: ixor
    //   17712: lookupswitch default -> 17740, -2137080436 -> 37658, 855179471 -> 17695
    //   17740: astore #7
    //   17742: getstatic Perryc.0 : I
    //   17745: ifle -> 17759
    //   17748: ldc2_w -746640851
    //   17751: l2i
    //   17752: ldc_w -156378111
    //   17755: ixor
    //   17756: goto -> 17767
    //   17759: ldc2_w 790003418
    //   17762: l2i
    //   17763: ldc_w 1710034246
    //   17766: ixor
    //   17767: ldc2_w 1988358540
    //   17770: l2i
    //   17771: ldc_w 1904885930
    //   17774: ixor
    //   17775: ixor
    //   17776: lookupswitch default -> 17804, 584795914 -> 37494, 793149802 -> 17759
    //   17804: aload_3
    //   17805: getstatic Perryc.1 : I
    //   17808: ifeq -> 17822
    //   17811: ldc2_w -1833915881
    //   17814: l2i
    //   17815: ldc_w 310445346
    //   17818: ixor
    //   17819: goto -> 17830
    //   17822: ldc2_w -1558369113
    //   17825: l2i
    //   17826: ldc_w -1583744408
    //   17829: ixor
    //   17830: ldc2_w -579849849
    //   17833: l2i
    //   17834: ldc_w 1765635590
    //   17837: ixor
    //   17838: ixor
    //   17839: lookupswitch default -> 37968, -1228304050 -> 17864, 880601268 -> 17822
    //   17864: goto -> 17868
    //   17867: athrow
    //   17868: invokevirtual toCharArray : ()[C
    //   17871: goto -> 17875
    //   17874: athrow
    //   17875: getstatic Perryc.1 : I
    //   17878: ifeq -> 17892
    //   17881: ldc2_w -1322896698
    //   17884: l2i
    //   17885: ldc_w -777853405
    //   17888: ixor
    //   17889: goto -> 17900
    //   17892: ldc2_w 1611962487
    //   17895: l2i
    //   17896: ldc_w 1515493745
    //   17899: ixor
    //   17900: ldc2_w -1519023391
    //   17903: l2i
    //   17904: ldc_w 1382458691
    //   17907: ixor
    //   17908: ixor
    //   17909: lookupswitch default -> 37728, -1751647417 -> 17892, -850186588 -> 17936
    //   17936: astore #8
    //   17938: ldc_w 3.1770547E38
    //   17941: invokestatic floatToIntBits : (F)I
    //   17944: ldc_w 2137981913
    //   17947: ixor
    //   17948: invokestatic intBitsToFloat : (I)F
    //   17951: getstatic Perryc.1 : I
    //   17954: ifeq -> 17968
    //   17957: ldc2_w 1109007817
    //   17960: l2i
    //   17961: ldc_w -245111873
    //   17964: ixor
    //   17965: goto -> 17976
    //   17968: ldc2_w -1998464437
    //   17971: l2i
    //   17972: ldc_w 810743569
    //   17975: ixor
    //   17976: ldc2_w 1845336689
    //   17979: l2i
    //   17980: ldc_w -224619718
    //   17983: ixor
    //   17984: ixor
    //   17985: lookupswitch default -> 18012, -1585229504 -> 17968, 739833661 -> 37556
    //   18012: fstore #9
    //   18014: getstatic Perryc.0 : I
    //   18017: ifle -> 18031
    //   18020: ldc2_w 97603742
    //   18023: l2i
    //   18024: ldc_w 1968033526
    //   18027: ixor
    //   18028: goto -> 18039
    //   18031: ldc2_w -668318970
    //   18034: l2i
    //   18035: ldc_w -2007838876
    //   18038: ixor
    //   18039: ldc2_w -609518892
    //   18042: l2i
    //   18043: ldc_w 123436137
    //   18046: ixor
    //   18047: ixor
    //   18048: lookupswitch default -> 18076, -1402169131 -> 37478, 436773250 -> 18031
    //   18076: aload #8
    //   18078: getstatic Perryc.1 : I
    //   18081: ifeq -> 18095
    //   18084: ldc2_w 2036937805
    //   18087: l2i
    //   18088: ldc_w 1800499018
    //   18091: ixor
    //   18092: goto -> 18103
    //   18095: ldc2_w -2019005103
    //   18098: l2i
    //   18099: ldc_w -1227500932
    //   18102: ixor
    //   18103: ldc2_w -2102167760
    //   18106: l2i
    //   18107: ldc_w 1695216886
    //   18110: ixor
    //   18111: ixor
    //   18112: lookupswitch default -> 18140, -176039743 -> 37348, 1042154989 -> 18095
    //   18140: astore #10
    //   18142: getstatic Perryc.1 : I
    //   18145: ifeq -> 18159
    //   18148: ldc2_w -1090898075
    //   18151: l2i
    //   18152: ldc_w 114070270
    //   18155: ixor
    //   18156: goto -> 18167
    //   18159: ldc2_w 1563801600
    //   18162: l2i
    //   18163: ldc_w -1703612753
    //   18166: ixor
    //   18167: ldc2_w 1025064305
    //   18170: l2i
    //   18171: ldc_w 1625040702
    //   18174: ixor
    //   18175: ixor
    //   18176: lookupswitch default -> 37204, -1702605600 -> 18204, -437010476 -> 18159
    //   18204: aload #10
    //   18206: arraylength
    //   18207: getstatic Perryc.1 : I
    //   18210: ifeq -> 18224
    //   18213: ldc2_w 409879411
    //   18216: l2i
    //   18217: ldc_w -1748877933
    //   18220: ixor
    //   18221: goto -> 18232
    //   18224: ldc2_w 1482422020
    //   18227: l2i
    //   18228: ldc_w -1483853783
    //   18231: ixor
    //   18232: ldc2_w -1514610182
    //   18235: l2i
    //   18236: ldc_w -367956076
    //   18239: ixor
    //   18240: ixor
    //   18241: lookupswitch default -> 37466, -1334032061 -> 18268, -1073352562 -> 18224
    //   18268: istore #11
    //   18270: ldc2_w 210584353
    //   18273: l2i
    //   18274: ldc_w 210584353
    //   18277: ixor
    //   18278: getstatic Perryc.1 : I
    //   18281: ifeq -> 18295
    //   18284: ldc2_w 979421958
    //   18287: l2i
    //   18288: ldc_w 164137609
    //   18291: ixor
    //   18292: goto -> 18303
    //   18295: ldc2_w -1069689710
    //   18298: l2i
    //   18299: ldc_w -2147246723
    //   18302: ixor
    //   18303: ldc2_w 850835447
    //   18306: l2i
    //   18307: ldc_w -715460537
    //   18310: ixor
    //   18311: ixor
    //   18312: lookupswitch default -> 38182, -1479405985 -> 18340, -733739457 -> 18295
    //   18340: istore #12
    //   18342: getstatic Perryc.1 : I
    //   18345: ifeq -> 18359
    //   18348: ldc2_w -237153288
    //   18351: l2i
    //   18352: ldc_w 195574113
    //   18355: ixor
    //   18356: goto -> 18367
    //   18359: ldc2_w 998985602
    //   18362: l2i
    //   18363: ldc_w -178028406
    //   18366: ixor
    //   18367: ldc2_w -1911204587
    //   18370: l2i
    //   18371: ldc_w 228840500
    //   18374: ixor
    //   18375: ixor
    //   18376: lookupswitch default -> 18404, 2028844992 -> 18359, 2042883000 -> 37198
    //   18404: iload #12
    //   18406: getstatic Perryc.1 : I
    //   18409: ifeq -> 18423
    //   18412: ldc2_w 91874150
    //   18415: l2i
    //   18416: ldc_w 2092045862
    //   18419: ixor
    //   18420: goto -> 18431
    //   18423: ldc2_w 364436548
    //   18426: l2i
    //   18427: ldc_w -2135833943
    //   18430: ixor
    //   18431: ldc2_w -1309007634
    //   18434: l2i
    //   18435: ldc_w -1556191920
    //   18438: ixor
    //   18439: ixor
    //   18440: lookupswitch default -> 37924, -2016584877 -> 18468, 1796190462 -> 18423
    //   18468: iload #11
    //   18470: if_icmpge -> 18484
    //   18473: ldc2_w 1606750558
    //   18476: l2i
    //   18477: ldc_w -670313976
    //   18480: ixor
    //   18481: goto -> 18492
    //   18484: ldc2_w 2096078536
    //   18487: l2i
    //   18488: ldc_w -81699431
    //   18491: ixor
    //   18492: ldc2_w 1172567245
    //   18495: l2i
    //   18496: ldc_w -1849527504
    //   18499: ixor
    //   18500: ixor
    //   18501: tableswitch default -> 18473, 1408189611 -> 18524, 1408189612 -> 20539
    //   18524: getstatic Perryc.0 : I
    //   18527: ifle -> 18541
    //   18530: ldc2_w -1058983310
    //   18533: l2i
    //   18534: ldc_w 455618720
    //   18537: ixor
    //   18538: goto -> 18549
    //   18541: ldc2_w 1239521968
    //   18544: l2i
    //   18545: ldc_w -1874463187
    //   18548: ixor
    //   18549: ldc2_w -587081519
    //   18552: l2i
    //   18553: ldc_w 1063682665
    //   18556: ixor
    //   18557: ixor
    //   18558: lookupswitch default -> 37482, 967727210 -> 18541, 1002649125 -> 18584
    //   18584: aload #10
    //   18586: getstatic Perryc.1 : I
    //   18589: ifeq -> 18603
    //   18592: ldc2_w 629407258
    //   18595: l2i
    //   18596: ldc_w 1323857295
    //   18599: ixor
    //   18600: goto -> 18611
    //   18603: ldc2_w 222773729
    //   18606: l2i
    //   18607: ldc_w 694177949
    //   18610: ixor
    //   18611: ldc2_w -147388803
    //   18614: l2i
    //   18615: ldc_w 252627679
    //   18618: ixor
    //   18619: ixor
    //   18620: lookupswitch default -> 18648, -1823324361 -> 38026, -76698569 -> 18603
    //   18648: iload #12
    //   18650: caload
    //   18651: getstatic Perryc.0 : I
    //   18654: ifle -> 18668
    //   18657: ldc2_w 2098548445
    //   18660: l2i
    //   18661: ldc_w 1757764913
    //   18664: ixor
    //   18665: goto -> 18676
    //   18668: ldc2_w -1349113593
    //   18671: l2i
    //   18672: ldc_w -27608361
    //   18675: ixor
    //   18676: ldc2_w 827506668
    //   18679: l2i
    //   18680: ldc_w 1739698494
    //   18683: ixor
    //   18684: ixor
    //   18685: lookupswitch default -> 18712, -248996860 -> 18668, 1127423294 -> 37702
    //   18712: istore #13
    //   18714: getstatic Perryc.0 : I
    //   18717: ifle -> 18731
    //   18720: ldc2_w -928436207
    //   18723: l2i
    //   18724: ldc_w 307910479
    //   18727: ixor
    //   18728: goto -> 18739
    //   18731: ldc2_w 861079523
    //   18734: l2i
    //   18735: ldc_w -489775604
    //   18738: ixor
    //   18739: ldc2_w 882264840
    //   18742: l2i
    //   18743: ldc_w 1898367554
    //   18746: ixor
    //   18747: ixor
    //   18748: lookupswitch default -> 37534, -1808983899 -> 18776, -1622940140 -> 18731
    //   18776: aload_0
    //   18777: getstatic Perryc.1 : I
    //   18780: ifeq -> 18794
    //   18783: ldc2_w 998920520
    //   18786: l2i
    //   18787: ldc_w -369932303
    //   18790: ixor
    //   18791: goto -> 18802
    //   18794: ldc2_w 867247642
    //   18797: l2i
    //   18798: ldc_w 1477895149
    //   18801: ixor
    //   18802: ldc2_w -1647222740
    //   18805: l2i
    //   18806: ldc_w 23474970
    //   18809: ixor
    //   18810: ixor
    //   18811: lookupswitch default -> 18836, -2105388642 -> 18794, 1322141071 -> 37840
    //   18836: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   18839: getstatic Perryc.c : I
    //   18842: iflt -> 18856
    //   18845: ldc2_w 606755752
    //   18848: l2i
    //   18849: ldc_w 496337562
    //   18852: ixor
    //   18853: goto -> 18864
    //   18856: ldc2_w 1517806987
    //   18859: l2i
    //   18860: ldc_w 83940295
    //   18863: ixor
    //   18864: ldc2_w -192267919
    //   18867: l2i
    //   18868: ldc_w -584100329
    //   18871: ixor
    //   18872: ixor
    //   18873: lookupswitch default -> 18900, 270186068 -> 37894, 1629629736 -> 18856
    //   18900: iload #13
    //   18902: getstatic Perryc.c : I
    //   18905: iflt -> 18919
    //   18908: ldc2_w -1491460455
    //   18911: l2i
    //   18912: ldc_w 1187301210
    //   18915: ixor
    //   18916: goto -> 18927
    //   18919: ldc2_w 559047434
    //   18922: l2i
    //   18923: ldc_w 794445891
    //   18926: ixor
    //   18927: ldc2_w -946725098
    //   18930: l2i
    //   18931: ldc_w -1525365153
    //   18934: ixor
    //   18935: ixor
    //   18936: lookupswitch default -> 18964, -2091384694 -> 38054, -1441620342 -> 18919
    //   18964: goto -> 18968
    //   18967: athrow
    //   18968: invokestatic valueOf : (C)Ljava/lang/String;
    //   18971: goto -> 18975
    //   18974: athrow
    //   18975: ldc_w 2.952135E38
    //   18978: invokestatic floatToIntBits : (F)I
    //   18981: ldc_w 2136872973
    //   18984: ixor
    //   18985: invokestatic intBitsToFloat : (I)F
    //   18988: getstatic Perryc.c : I
    //   18991: iflt -> 19005
    //   18994: ldc2_w -1329137158
    //   18997: l2i
    //   18998: ldc_w 1678456018
    //   19001: ixor
    //   19002: goto -> 19013
    //   19005: ldc2_w -600725568
    //   19008: l2i
    //   19009: ldc_w 1914857347
    //   19012: ixor
    //   19013: ldc2_w 878019230
    //   19016: l2i
    //   19017: ldc_w -1449081703
    //   19020: ixor
    //   19021: ixor
    //   19022: lookupswitch default -> 37468, 870745668 -> 19048, 1228442415 -> 19005
    //   19048: fload #9
    //   19050: fadd
    //   19051: getstatic Perryc.c : I
    //   19054: iflt -> 19068
    //   19057: ldc2_w 1582969813
    //   19060: l2i
    //   19061: ldc_w 1248154562
    //   19064: ixor
    //   19065: goto -> 19076
    //   19068: ldc2_w -1799523192
    //   19071: l2i
    //   19072: ldc_w -11091004
    //   19075: ixor
    //   19076: ldc2_w -738663107
    //   19079: l2i
    //   19080: ldc_w 196799786
    //   19083: ixor
    //   19084: ixor
    //   19085: lookupswitch default -> 37856, -1280721061 -> 19112, -864196608 -> 19068
    //   19112: aload_0
    //   19113: getstatic Perryc.c : I
    //   19116: iflt -> 19130
    //   19119: ldc2_w 1162700535
    //   19122: l2i
    //   19123: ldc_w 740281951
    //   19126: ixor
    //   19127: goto -> 19138
    //   19130: ldc2_w 1599678307
    //   19133: l2i
    //   19134: ldc_w -1386715201
    //   19137: ixor
    //   19138: ldc2_w 1071916202
    //   19141: l2i
    //   19142: ldc_w -1571521116
    //   19145: ixor
    //   19146: ixor
    //   19147: lookupswitch default -> 37216, -186453594 -> 19130, 1873877458 -> 19172
    //   19172: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19175: getstatic Perryc.0 : I
    //   19178: ifle -> 19192
    //   19181: ldc2_w -668484033
    //   19184: l2i
    //   19185: ldc_w 23442693
    //   19188: ixor
    //   19189: goto -> 19200
    //   19192: ldc2_w -2146070119
    //   19195: l2i
    //   19196: ldc_w 1943636944
    //   19199: ixor
    //   19200: ldc2_w 1605822861
    //   19203: l2i
    //   19204: ldc_w -1015907353
    //   19207: ixor
    //   19208: ixor
    //   19209: lookupswitch default -> 37960, 1166448976 -> 19192, 1862830115 -> 19236
    //   19236: goto -> 19240
    //   19239: athrow
    //   19240: invokevirtual getValue : ()Ljava/lang/Object;
    //   19243: goto -> 19247
    //   19246: athrow
    //   19247: checkcast java/lang/Integer
    //   19250: getstatic Perryc.1 : I
    //   19253: ifeq -> 19267
    //   19256: ldc2_w -1398106400
    //   19259: l2i
    //   19260: ldc_w 865433478
    //   19263: ixor
    //   19264: goto -> 19275
    //   19267: ldc2_w -1653111173
    //   19270: l2i
    //   19271: ldc_w -1966145948
    //   19274: ixor
    //   19275: ldc2_w -1503957699
    //   19278: l2i
    //   19279: ldc_w -1050714328
    //   19282: ixor
    //   19283: ixor
    //   19284: lookupswitch default -> 37846, -130296973 -> 19267, 1891453450 -> 19312
    //   19312: goto -> 19316
    //   19315: athrow
    //   19316: invokevirtual intValue : ()I
    //   19319: goto -> 19323
    //   19322: athrow
    //   19323: i2f
    //   19324: ldc_w 0.17094772
    //   19327: invokestatic floatToIntBits : (F)I
    //   19330: ldc_w 2131692779
    //   19333: ixor
    //   19334: invokestatic intBitsToFloat : (I)F
    //   19337: fadd
    //   19338: getstatic Perryc.c : I
    //   19341: iflt -> 19355
    //   19344: ldc2_w 1566205939
    //   19347: l2i
    //   19348: ldc_w 1728193559
    //   19351: ixor
    //   19352: goto -> 19363
    //   19355: ldc2_w -966818988
    //   19358: l2i
    //   19359: ldc_w -327704694
    //   19362: ixor
    //   19363: ldc2_w 1178617937
    //   19366: l2i
    //   19367: ldc_w -21707445
    //   19370: ixor
    //   19371: ixor
    //   19372: lookupswitch default -> 19400, -2102604034 -> 38166, -1807364263 -> 19355
    //   19400: aload #7
    //   19402: ldc2_w 160270627
    //   19405: l2i
    //   19406: ldc_w 160270627
    //   19409: ixor
    //   19410: iaload
    //   19411: getstatic Perryc.c : I
    //   19414: iflt -> 19428
    //   19417: ldc2_w 283173426
    //   19420: l2i
    //   19421: ldc_w -1684445283
    //   19424: ixor
    //   19425: goto -> 19436
    //   19428: ldc2_w -1274413292
    //   19431: l2i
    //   19432: ldc_w 541670895
    //   19435: ixor
    //   19436: ldc2_w 1193127040
    //   19439: l2i
    //   19440: ldc_w -2145437503
    //   19443: ixor
    //   19444: ixor
    //   19445: lookupswitch default -> 38104, 1283133934 -> 19428, 1396856506 -> 19472
    //   19472: goto -> 19476
    //   19475: athrow
    //   19476: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   19479: goto -> 19483
    //   19482: athrow
    //   19483: getstatic Perryc.0 : I
    //   19486: ifle -> 19500
    //   19489: ldc2_w 893957641
    //   19492: l2i
    //   19493: ldc_w 1101650054
    //   19496: ixor
    //   19497: goto -> 19508
    //   19500: ldc2_w -30359253
    //   19503: l2i
    //   19504: ldc_w -641759818
    //   19507: ixor
    //   19508: ldc2_w 1044910211
    //   19511: l2i
    //   19512: ldc_w 173874589
    //   19515: ixor
    //   19516: ixor
    //   19517: lookupswitch default -> 37786, 328878467 -> 19544, 1089758097 -> 19500
    //   19544: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19547: getstatic Perryc.0 : I
    //   19550: ifle -> 19564
    //   19553: ldc2_w -1504636124
    //   19556: l2i
    //   19557: ldc_w -1324577321
    //   19560: ixor
    //   19561: goto -> 19572
    //   19564: ldc2_w -1479618180
    //   19567: l2i
    //   19568: ldc_w 999063525
    //   19571: ixor
    //   19572: ldc2_w 1191291095
    //   19575: l2i
    //   19576: ldc_w -1130699217
    //   19579: ixor
    //   19580: ixor
    //   19581: lookupswitch default -> 19608, -322514933 -> 37630, -190541281 -> 19564
    //   19608: goto -> 19612
    //   19611: athrow
    //   19612: invokevirtual getValue : ()Ljava/lang/Object;
    //   19615: goto -> 19619
    //   19618: athrow
    //   19619: checkcast java/lang/Integer
    //   19622: getstatic Perryc.c : I
    //   19625: iflt -> 19639
    //   19628: ldc2_w -109796671
    //   19631: l2i
    //   19632: ldc_w 1204117451
    //   19635: ixor
    //   19636: goto -> 19647
    //   19639: ldc2_w 1926117512
    //   19642: l2i
    //   19643: ldc_w -1444825629
    //   19646: ixor
    //   19647: ldc2_w 1622501659
    //   19650: l2i
    //   19651: ldc_w -763950969
    //   19654: ixor
    //   19655: ixor
    //   19656: lookupswitch default -> 37782, 208903318 -> 19639, 1777200375 -> 19684
    //   19684: goto -> 19688
    //   19687: athrow
    //   19688: invokevirtual intValue : ()I
    //   19691: goto -> 19695
    //   19694: athrow
    //   19695: imul
    //   19696: getstatic Perryc.c : I
    //   19699: iflt -> 19713
    //   19702: ldc2_w -490428859
    //   19705: l2i
    //   19706: ldc_w -953955352
    //   19709: ixor
    //   19710: goto -> 19721
    //   19713: ldc2_w 1058418696
    //   19716: l2i
    //   19717: ldc_w -331612205
    //   19720: ixor
    //   19721: ldc2_w 1467175474
    //   19724: l2i
    //   19725: ldc_w 253188644
    //   19728: ixor
    //   19729: ixor
    //   19730: lookupswitch default -> 19756, -1210917140 -> 19713, 2105763259 -> 37516
    //   19756: goto -> 19760
    //   19759: athrow
    //   19760: invokestatic rainbow : (I)Ljava/awt/Color;
    //   19763: goto -> 19767
    //   19766: athrow
    //   19767: getstatic Perryc.1 : I
    //   19770: ifeq -> 19784
    //   19773: ldc2_w 786725448
    //   19776: l2i
    //   19777: ldc_w 660837959
    //   19780: ixor
    //   19781: goto -> 19792
    //   19784: ldc2_w 1560282482
    //   19787: l2i
    //   19788: ldc_w 1760633993
    //   19791: ixor
    //   19792: ldc2_w -434970846
    //   19795: l2i
    //   19796: ldc_w -758386362
    //   19799: ixor
    //   19800: ixor
    //   19801: lookupswitch default -> 37390, 19402655 -> 19828, 1029620331 -> 19784
    //   19828: goto -> 19832
    //   19831: athrow
    //   19832: invokevirtual getRGB : ()I
    //   19835: goto -> 19839
    //   19838: athrow
    //   19839: ldc2_w -686350437
    //   19842: l2i
    //   19843: ldc_w -686350438
    //   19846: ixor
    //   19847: getstatic Perryc.1 : I
    //   19850: ifeq -> 19864
    //   19853: ldc2_w -1000337349
    //   19856: l2i
    //   19857: ldc_w 49756518
    //   19860: ixor
    //   19861: goto -> 19872
    //   19864: ldc2_w 794946553
    //   19867: l2i
    //   19868: ldc_w 657521212
    //   19871: ixor
    //   19872: ldc2_w -992518204
    //   19875: l2i
    //   19876: ldc_w 41339710
    //   19879: ixor
    //   19880: ixor
    //   19881: lookupswitch default -> 19908, -1635067247 -> 19864, 3587495 -> 37272
    //   19908: goto -> 19912
    //   19911: athrow
    //   19912: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   19915: goto -> 19919
    //   19918: athrow
    //   19919: getstatic Perryc.c : I
    //   19922: iflt -> 19936
    //   19925: ldc2_w -1270860631
    //   19928: l2i
    //   19929: ldc_w 211596596
    //   19932: ixor
    //   19933: goto -> 19944
    //   19936: ldc2_w 2124588723
    //   19939: l2i
    //   19940: ldc_w -801279478
    //   19943: ixor
    //   19944: ldc2_w 1550590861
    //   19947: l2i
    //   19948: ldc_w 180944949
    //   19951: ixor
    //   19952: ixor
    //   19953: lookupswitch default -> 37862, -294018523 -> 19936, -130353407 -> 19980
    //   19980: fload #9
    //   19982: getstatic Perryc.0 : I
    //   19985: ifle -> 19999
    //   19988: ldc2_w -1658004070
    //   19991: l2i
    //   19992: ldc_w -1248858036
    //   19995: ixor
    //   19996: goto -> 20007
    //   19999: ldc2_w -895417112
    //   20002: l2i
    //   20003: ldc_w -2131634588
    //   20006: ixor
    //   20007: ldc2_w -478680476
    //   20010: l2i
    //   20011: ldc_w 302959108
    //   20014: ixor
    //   20015: ixor
    //   20016: lookupswitch default -> 37868, -1154878740 -> 20044, -640021066 -> 19999
    //   20044: aload_0
    //   20045: getstatic Perryc.c : I
    //   20048: iflt -> 20062
    //   20051: ldc2_w 2126270365
    //   20054: l2i
    //   20055: ldc_w 251787325
    //   20058: ixor
    //   20059: goto -> 20070
    //   20062: ldc2_w -144083463
    //   20065: l2i
    //   20066: ldc_w 108420706
    //   20069: ixor
    //   20070: ldc2_w -1578291894
    //   20073: l2i
    //   20074: ldc_w 2098254648
    //   20077: ixor
    //   20078: ixor
    //   20079: lookupswitch default -> 20104, -1397663108 -> 20062, -1388295726 -> 38024
    //   20104: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   20107: getstatic Perryc.0 : I
    //   20110: ifle -> 20124
    //   20113: ldc2_w 2000293412
    //   20116: l2i
    //   20117: ldc_w 1568215299
    //   20120: ixor
    //   20121: goto -> 20132
    //   20124: ldc2_w -1829185018
    //   20127: l2i
    //   20128: ldc_w -498793827
    //   20131: ixor
    //   20132: ldc2_w -751683549
    //   20135: l2i
    //   20136: ldc_w -1644637623
    //   20139: ixor
    //   20140: ixor
    //   20141: lookupswitch default -> 20168, 1566922521 -> 20124, 1686762829 -> 37336
    //   20168: iload #13
    //   20170: getstatic Perryc.1 : I
    //   20173: ifeq -> 20187
    //   20176: ldc2_w 1605127968
    //   20179: l2i
    //   20180: ldc_w -956780072
    //   20183: ixor
    //   20184: goto -> 20195
    //   20187: ldc2_w -1173691108
    //   20190: l2i
    //   20191: ldc_w 1294404478
    //   20194: ixor
    //   20195: ldc2_w 428744660
    //   20198: l2i
    //   20199: ldc_w 388261361
    //   20202: ixor
    //   20203: ixor
    //   20204: lookupswitch default -> 37562, -1744927523 -> 20187, -108555193 -> 20232
    //   20232: goto -> 20236
    //   20235: athrow
    //   20236: invokestatic valueOf : (C)Ljava/lang/String;
    //   20239: goto -> 20243
    //   20242: athrow
    //   20243: getstatic Perryc.c : I
    //   20246: iflt -> 20260
    //   20249: ldc2_w -1405408054
    //   20252: l2i
    //   20253: ldc_w 7954991
    //   20256: ixor
    //   20257: goto -> 20268
    //   20260: ldc2_w -806867007
    //   20263: l2i
    //   20264: ldc_w -1412297024
    //   20267: ixor
    //   20268: ldc2_w -2002912798
    //   20271: l2i
    //   20272: ldc_w -1768713128
    //   20275: ixor
    //   20276: ixor
    //   20277: lookupswitch default -> 37808, -1303633057 -> 20260, 2050247867 -> 20304
    //   20304: goto -> 20308
    //   20307: athrow
    //   20308: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   20311: goto -> 20315
    //   20314: athrow
    //   20315: i2f
    //   20316: fadd
    //   20317: getstatic Perryc.1 : I
    //   20320: ifeq -> 20334
    //   20323: ldc2_w -318039995
    //   20326: l2i
    //   20327: ldc_w 1513736340
    //   20330: ixor
    //   20331: goto -> 20342
    //   20334: ldc2_w -1838549830
    //   20337: l2i
    //   20338: ldc_w -330963283
    //   20341: ixor
    //   20342: ldc2_w 103641757
    //   20345: l2i
    //   20346: ldc_w -1201815919
    //   20349: ixor
    //   20350: ixor
    //   20351: lookupswitch default -> 37428, -1067655653 -> 20376, 155327709 -> 20334
    //   20376: fstore #9
    //   20378: getstatic Perryc.0 : I
    //   20381: ifle -> 20395
    //   20384: ldc2_w 1660100681
    //   20387: l2i
    //   20388: ldc_w 846651239
    //   20391: ixor
    //   20392: goto -> 20403
    //   20395: ldc2_w -2014542216
    //   20398: l2i
    //   20399: ldc_w -1942560058
    //   20402: ixor
    //   20403: ldc2_w 1460885425
    //   20406: l2i
    //   20407: ldc_w 705634292
    //   20410: ixor
    //   20411: ixor
    //   20412: lookupswitch default -> 20440, 156773379 -> 20395, 765048683 -> 37214
    //   20440: aload #7
    //   20442: ldc2_w 699104418
    //   20445: l2i
    //   20446: ldc_w 699104418
    //   20449: ixor
    //   20450: getstatic Perryc.0 : I
    //   20453: ifle -> 20467
    //   20456: ldc2_w 1035596096
    //   20459: l2i
    //   20460: ldc_w -2144837535
    //   20463: ixor
    //   20464: goto -> 20475
    //   20467: ldc2_w 609375927
    //   20470: l2i
    //   20471: ldc_w 550627331
    //   20474: ixor
    //   20475: ldc2_w -339793041
    //   20478: l2i
    //   20479: ldc_w -283289024
    //   20482: ixor
    //   20483: ixor
    //   20484: lookupswitch default -> 20512, -1187782642 -> 37830, 601175904 -> 20467
    //   20512: aload #7
    //   20514: ldc2_w 1830936542
    //   20517: l2i
    //   20518: ldc_w 1830936542
    //   20521: ixor
    //   20522: iaload
    //   20523: ldc2_w 2068413723
    //   20526: l2i
    //   20527: ldc_w 2068413722
    //   20530: ixor
    //   20531: iadd
    //   20532: iastore
    //   20533: iinc #12, 1
    //   20536: goto -> 18342
    //   20539: goto -> 20959
    //   20542: getstatic Perryc.0 : I
    //   20545: ifle -> 20559
    //   20548: ldc2_w 1289258333
    //   20551: l2i
    //   20552: ldc_w -1906287341
    //   20555: ixor
    //   20556: goto -> 20567
    //   20559: ldc2_w -624207715
    //   20562: l2i
    //   20563: ldc_w -1266599825
    //   20566: ixor
    //   20567: ldc2_w -288837583
    //   20570: l2i
    //   20571: ldc_w 847607031
    //   20574: ixor
    //   20575: ixor
    //   20576: lookupswitch default -> 38032, -1308122060 -> 20604, 519380104 -> 20559
    //   20604: aload_0
    //   20605: getstatic Perryc.0 : I
    //   20608: ifle -> 20622
    //   20611: ldc2_w 1165815434
    //   20614: l2i
    //   20615: ldc_w -1559523458
    //   20618: ixor
    //   20619: goto -> 20630
    //   20622: ldc2_w 353518919
    //   20625: l2i
    //   20626: ldc_w -285804693
    //   20629: ixor
    //   20630: ldc2_w -1000953072
    //   20633: l2i
    //   20634: ldc_w -1827516352
    //   20637: ixor
    //   20638: ixor
    //   20639: lookupswitch default -> 20664, -1913854643 -> 20622, -1322018140 -> 37564
    //   20664: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   20667: getstatic Perryc.c : I
    //   20670: iflt -> 20684
    //   20673: ldc2_w -1603026205
    //   20676: l2i
    //   20677: ldc_w 1090942473
    //   20680: ixor
    //   20681: goto -> 20692
    //   20684: ldc2_w 889993583
    //   20687: l2i
    //   20688: ldc_w 1476784038
    //   20691: ixor
    //   20692: ldc2_w -1589872224
    //   20695: l2i
    //   20696: ldc_w 1561231676
    //   20699: ixor
    //   20700: ixor
    //   20701: lookupswitch default -> 37222, -1858392491 -> 20728, 491211894 -> 20684
    //   20728: aload_3
    //   20729: ldc_w 3.2590697E38
    //   20732: invokestatic floatToIntBits : (F)I
    //   20735: ldc_w 2138386278
    //   20738: ixor
    //   20739: invokestatic intBitsToFloat : (I)F
    //   20742: ldc_w 0.023814974
    //   20745: invokestatic floatToIntBits : (F)I
    //   20748: ldc_w 2103646111
    //   20751: ixor
    //   20752: invokestatic intBitsToFloat : (I)F
    //   20755: getstatic Perryc.1 : I
    //   20758: ifeq -> 20772
    //   20761: ldc2_w 959560688
    //   20764: l2i
    //   20765: ldc_w 1497123837
    //   20768: ixor
    //   20769: goto -> 20780
    //   20772: ldc2_w -174770495
    //   20775: l2i
    //   20776: ldc_w 1941176688
    //   20779: ixor
    //   20780: ldc2_w -1746855000
    //   20783: l2i
    //   20784: ldc_w 1411687989
    //   20787: ixor
    //   20788: ixor
    //   20789: lookupswitch default -> 37332, -1547154032 -> 20772, 1172605484 -> 20816
    //   20816: aload_0
    //   20817: getstatic Perryc.0 : I
    //   20820: ifle -> 20834
    //   20823: ldc2_w -1179194680
    //   20826: l2i
    //   20827: ldc_w -324460066
    //   20830: ixor
    //   20831: goto -> 20842
    //   20834: ldc2_w -558400469
    //   20837: l2i
    //   20838: ldc_w 721479575
    //   20841: ixor
    //   20842: ldc2_w -458524086
    //   20845: l2i
    //   20846: ldc_w -641725856
    //   20849: ixor
    //   20850: ixor
    //   20851: lookupswitch default -> 37870, -925045866 -> 20876, 1752480572 -> 20834
    //   20876: getfield color : I
    //   20879: ldc2_w -1751427824
    //   20882: l2i
    //   20883: ldc_w -1751427823
    //   20886: ixor
    //   20887: getstatic Perryc.c : I
    //   20890: iflt -> 20904
    //   20893: ldc2_w 61270666
    //   20896: l2i
    //   20897: ldc_w -1514314207
    //   20900: ixor
    //   20901: goto -> 20912
    //   20904: ldc2_w 327732706
    //   20907: l2i
    //   20908: ldc_w -1240777282
    //   20911: ixor
    //   20912: ldc2_w 1457509268
    //   20915: l2i
    //   20916: ldc_w 1443119697
    //   20919: ixor
    //   20920: ixor
    //   20921: lookupswitch default -> 20948, -1497358994 -> 37938, 227901527 -> 20904
    //   20948: goto -> 20952
    //   20951: athrow
    //   20952: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   20955: goto -> 20959
    //   20958: athrow
    //   20959: getstatic Perryc.c : I
    //   20962: iflt -> 20976
    //   20965: ldc2_w 348274815
    //   20968: l2i
    //   20969: ldc_w -24706628
    //   20972: ixor
    //   20973: goto -> 20984
    //   20976: ldc2_w 321400144
    //   20979: l2i
    //   20980: ldc_w -308879129
    //   20983: ixor
    //   20984: ldc2_w 606953162
    //   20987: l2i
    //   20988: ldc_w -344927953
    //   20991: ixor
    //   20992: ixor
    //   20993: lookupswitch default -> 21020, -329959796 -> 20976, 622382630 -> 37746
    //   21020: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   21023: ldc_w '䯫㌆䮨坕兀ꕱ๷㙹'
    //   21026: getstatic Perryc.c : I
    //   21029: iflt -> 21043
    //   21032: ldc2_w 1123586813
    //   21035: l2i
    //   21036: ldc_w -525156274
    //   21039: ixor
    //   21040: goto -> 21051
    //   21043: ldc2_w -1685467460
    //   21046: l2i
    //   21047: ldc_w 572051155
    //   21050: ixor
    //   21051: ldc2_w -917644636
    //   21054: l2i
    //   21055: ldc_w -76090465
    //   21058: ixor
    //   21059: ixor
    //   21060: lookupswitch default -> 37326, -1951782572 -> 21088, -1871611000 -> 21043
    //   21088: goto -> 21092
    //   21091: athrow
    //   21092: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   21095: goto -> 21099
    //   21098: athrow
    //   21099: getstatic Perryc.c : I
    //   21102: iflt -> 21116
    //   21105: ldc2_w -401638294
    //   21108: l2i
    //   21109: ldc_w -95452608
    //   21112: ixor
    //   21113: goto -> 21124
    //   21116: ldc2_w -381279908
    //   21119: l2i
    //   21120: ldc_w 968904073
    //   21123: ixor
    //   21124: ldc2_w -2009343438
    //   21127: l2i
    //   21128: ldc_w -711516482
    //   21131: ixor
    //   21132: ixor
    //   21133: lookupswitch default -> 21160, 743962980 -> 21116, 1340881574 -> 37218
    //   21160: goto -> 21164
    //   21163: athrow
    //   21164: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   21167: goto -> 21171
    //   21170: athrow
    //   21171: getstatic Perryc.c : I
    //   21174: iflt -> 21188
    //   21177: ldc2_w -50521108
    //   21180: l2i
    //   21181: ldc_w -1324700477
    //   21184: ixor
    //   21185: goto -> 21196
    //   21188: ldc2_w 1732268520
    //   21191: l2i
    //   21192: ldc_w -1187773717
    //   21195: ixor
    //   21196: ldc2_w -1348724945
    //   21199: l2i
    //   21200: ldc_w -1297194006
    //   21203: ixor
    //   21204: ixor
    //   21205: lookupswitch default -> 21232, -1733796944 -> 21188, 1355138026 -> 37740
    //   21232: goto -> 21236
    //   21235: athrow
    //   21236: invokevirtual isDisabled : ()Z
    //   21239: goto -> 21243
    //   21242: athrow
    //   21243: ifeq -> 21257
    //   21246: ldc2_w -1240040259
    //   21249: l2i
    //   21250: ldc_w 1773489892
    //   21253: ixor
    //   21254: goto -> 21265
    //   21257: ldc2_w 1264270811
    //   21260: l2i
    //   21261: ldc_w -1795682429
    //   21264: ixor
    //   21265: ldc2_w 741528624
    //   21268: l2i
    //   21269: ldc_w 864541701
    //   21272: ixor
    //   21273: ixor
    //   21274: tableswitch default -> 21246, -1072285076 -> 21296, -1072285075 -> 26267
    //   21296: getstatic Perryc.c : I
    //   21299: iflt -> 21313
    //   21302: ldc2_w -771192486
    //   21305: l2i
    //   21306: ldc_w -1546064255
    //   21309: ixor
    //   21310: goto -> 21321
    //   21313: ldc2_w -628402454
    //   21316: l2i
    //   21317: ldc_w -1678992618
    //   21320: ixor
    //   21321: ldc2_w -937774074
    //   21324: l2i
    //   21325: ldc_w -1578769507
    //   21328: ixor
    //   21329: ixor
    //   21330: lookupswitch default -> 21356, -1184771137 -> 21313, 405745728 -> 37166
    //   21356: goto -> 21360
    //   21359: athrow
    //   21360: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   21363: goto -> 21367
    //   21366: athrow
    //   21367: getstatic Perryc.c : I
    //   21370: iflt -> 21384
    //   21373: ldc2_w -224840583
    //   21376: l2i
    //   21377: ldc_w -1908211196
    //   21380: ixor
    //   21381: goto -> 21392
    //   21384: ldc2_w -1119595843
    //   21387: l2i
    //   21388: ldc_w 1396078661
    //   21391: ixor
    //   21392: ldc2_w 669693965
    //   21395: l2i
    //   21396: ldc_w 1622544031
    //   21399: ixor
    //   21400: ixor
    //   21401: lookupswitch default -> 21428, -1338556391 -> 21384, 998670575 -> 38170
    //   21428: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21431: getstatic Perryc.0 : I
    //   21434: ifle -> 21448
    //   21437: ldc2_w 109268834
    //   21440: l2i
    //   21441: ldc_w 1844620332
    //   21444: ixor
    //   21445: goto -> 21456
    //   21448: ldc2_w -1794710620
    //   21451: l2i
    //   21452: ldc_w 1616440233
    //   21455: ixor
    //   21456: ldc2_w -276446248
    //   21459: l2i
    //   21460: ldc_w 1328158936
    //   21463: ixor
    //   21464: ixor
    //   21465: lookupswitch default -> 21492, -874629042 -> 37626, -337972472 -> 21448
    //   21492: goto -> 21496
    //   21495: athrow
    //   21496: invokevirtual getValue : ()Ljava/lang/Object;
    //   21499: goto -> 21503
    //   21502: athrow
    //   21503: checkcast java/lang/Boolean
    //   21506: getstatic Perryc.0 : I
    //   21509: ifle -> 21523
    //   21512: ldc2_w 176671994
    //   21515: l2i
    //   21516: ldc_w -1275560117
    //   21519: ixor
    //   21520: goto -> 21531
    //   21523: ldc2_w 156823417
    //   21526: l2i
    //   21527: ldc_w -870578754
    //   21530: ixor
    //   21531: ldc2_w 133996142
    //   21534: l2i
    //   21535: ldc_w -452387758
    //   21538: ixor
    //   21539: ixor
    //   21540: lookupswitch default -> 21568, 999853121 -> 21523, 1535783309 -> 38090
    //   21568: goto -> 21572
    //   21571: athrow
    //   21572: invokevirtual booleanValue : ()Z
    //   21575: goto -> 21579
    //   21578: athrow
    //   21579: ifeq -> 21593
    //   21582: ldc2_w -1871333627
    //   21585: l2i
    //   21586: ldc_w -803855943
    //   21589: ixor
    //   21590: goto -> 21601
    //   21593: ldc2_w 964122649
    //   21596: l2i
    //   21597: ldc_w 2031406758
    //   21600: ixor
    //   21601: ldc2_w -223318559
    //   21604: l2i
    //   21605: ldc_w -1436061608
    //   21608: ixor
    //   21609: ixor
    //   21610: tableswitch default -> 21582, 414485253 -> 21632, 414485254 -> 25850
    //   21632: getstatic Perryc.0 : I
    //   21635: ifle -> 21649
    //   21638: ldc2_w -1388491251
    //   21641: l2i
    //   21642: ldc_w -1151238081
    //   21645: ixor
    //   21646: goto -> 21657
    //   21649: ldc2_w 247798709
    //   21652: l2i
    //   21653: ldc_w -1259763861
    //   21656: ixor
    //   21657: ldc2_w 348119654
    //   21660: l2i
    //   21661: ldc_w -1892450720
    //   21664: ixor
    //   21665: ixor
    //   21666: lookupswitch default -> 37566, -1915727308 -> 21649, 564134104 -> 21692
    //   21692: goto -> 21696
    //   21695: athrow
    //   21696: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   21699: goto -> 21703
    //   21702: athrow
    //   21703: getstatic Perryc.0 : I
    //   21706: ifle -> 21720
    //   21709: ldc2_w 115488594
    //   21712: l2i
    //   21713: ldc_w 756253925
    //   21716: ixor
    //   21717: goto -> 21728
    //   21720: ldc2_w 1601303465
    //   21723: l2i
    //   21724: ldc_w 67507303
    //   21727: ixor
    //   21728: ldc2_w 2046491029
    //   21731: l2i
    //   21732: ldc_w 1630486955
    //   21735: ixor
    //   21736: ixor
    //   21737: lookupswitch default -> 38114, 858000265 -> 21720, 1134714864 -> 21764
    //   21764: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21767: getstatic Perryc.1 : I
    //   21770: ifeq -> 21784
    //   21773: ldc2_w -2092956321
    //   21776: l2i
    //   21777: ldc_w 270766738
    //   21780: ixor
    //   21781: goto -> 21792
    //   21784: ldc2_w 1320165091
    //   21787: l2i
    //   21788: ldc_w -559204256
    //   21791: ixor
    //   21792: ldc2_w -774779840
    //   21795: l2i
    //   21796: ldc_w -1371474142
    //   21799: ixor
    //   21800: ixor
    //   21801: lookupswitch default -> 37188, -319640401 -> 21784, -276161055 -> 21828
    //   21828: goto -> 21832
    //   21831: athrow
    //   21832: invokevirtual getValue : ()Ljava/lang/Object;
    //   21835: goto -> 21839
    //   21838: athrow
    //   21839: getstatic Perryc.c : I
    //   21842: iflt -> 21856
    //   21845: ldc2_w 1850677326
    //   21848: l2i
    //   21849: ldc_w -1791371052
    //   21852: ixor
    //   21853: goto -> 21864
    //   21856: ldc2_w 1677613276
    //   21859: l2i
    //   21860: ldc_w -1430230000
    //   21863: ixor
    //   21864: ldc2_w 1089570659
    //   21867: l2i
    //   21868: ldc_w 1329661796
    //   21871: ixor
    //   21872: ixor
    //   21873: lookupswitch default -> 21900, -188333923 -> 37890, -174395489 -> 21856
    //   21900: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   21903: if_acmpne -> 21917
    //   21906: ldc2_w 489097778
    //   21909: l2i
    //   21910: ldc_w -1550298058
    //   21913: ixor
    //   21914: goto -> 21925
    //   21917: ldc2_w 917120879
    //   21920: l2i
    //   21921: ldc_w -2011858582
    //   21924: ixor
    //   21925: ldc2_w -1872077394
    //   21928: l2i
    //   21929: ldc_w 1006471678
    //   21932: ixor
    //   21933: ixor
    //   21934: tableswitch default -> 21906, 354978388 -> 21956, 354978389 -> 22954
    //   21956: getstatic Perryc.1 : I
    //   21959: ifeq -> 21973
    //   21962: ldc2_w 2130925136
    //   21965: l2i
    //   21966: ldc_w 160563434
    //   21969: ixor
    //   21970: goto -> 21981
    //   21973: ldc2_w 1777881895
    //   21976: l2i
    //   21977: ldc_w -2026809357
    //   21980: ixor
    //   21981: ldc2_w -2060476514
    //   21984: l2i
    //   21985: ldc_w -1173286353
    //   21988: ixor
    //   21989: ixor
    //   21990: lookupswitch default -> 37306, -772306587 -> 22016, 1236261643 -> 21973
    //   22016: aload_0
    //   22017: getstatic Perryc.c : I
    //   22020: iflt -> 22034
    //   22023: ldc2_w -1839750737
    //   22026: l2i
    //   22027: ldc_w -627847518
    //   22030: ixor
    //   22031: goto -> 22042
    //   22034: ldc2_w -1814174376
    //   22037: l2i
    //   22038: ldc_w -963452641
    //   22041: ixor
    //   22042: ldc2_w 1723994406
    //   22045: l2i
    //   22046: ldc_w 1145519863
    //   22049: ixor
    //   22050: ixor
    //   22051: lookupswitch default -> 22076, 11393324 -> 22034, 1782661340 -> 37596
    //   22076: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   22079: getstatic Perryc.c : I
    //   22082: iflt -> 22096
    //   22085: ldc2_w 811064200
    //   22088: l2i
    //   22089: ldc_w -1745705071
    //   22092: ixor
    //   22093: goto -> 22104
    //   22096: ldc2_w 626498670
    //   22099: l2i
    //   22100: ldc_w -416466213
    //   22103: ixor
    //   22104: ldc2_w 1389234816
    //   22107: l2i
    //   22108: ldc_w -538874351
    //   22111: ixor
    //   22112: ixor
    //   22113: lookupswitch default -> 22140, 713693320 -> 38134, 1932277434 -> 22096
    //   22140: aload #4
    //   22142: ldc_w 4.7550887E37
    //   22145: invokestatic floatToIntBits : (F)I
    //   22148: ldc_w 2114918367
    //   22151: ixor
    //   22152: invokestatic intBitsToFloat : (I)F
    //   22155: getstatic Perryc.1 : I
    //   22158: ifeq -> 22172
    //   22161: ldc2_w -1071286150
    //   22164: l2i
    //   22165: ldc_w -1325686752
    //   22168: ixor
    //   22169: goto -> 22180
    //   22172: ldc2_w -966320791
    //   22175: l2i
    //   22176: ldc_w -1031179136
    //   22179: ixor
    //   22180: ldc2_w -1636821091
    //   22183: l2i
    //   22184: ldc_w -1377696784
    //   22187: ixor
    //   22188: ixor
    //   22189: lookupswitch default -> 22216, 1006767054 -> 22172, 1129106487 -> 37574
    //   22216: aload_0
    //   22217: getstatic Perryc.1 : I
    //   22220: ifeq -> 22234
    //   22223: ldc2_w 327605120
    //   22226: l2i
    //   22227: ldc_w -705893527
    //   22230: ixor
    //   22231: goto -> 22242
    //   22234: ldc2_w 310485447
    //   22237: l2i
    //   22238: ldc_w -805617628
    //   22241: ixor
    //   22242: ldc2_w -299340522
    //   22245: l2i
    //   22246: ldc_w -933403438
    //   22249: ixor
    //   22250: ixor
    //   22251: lookupswitch default -> 37610, -534824659 -> 22234, -82843609 -> 22276
    //   22276: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22279: getstatic Perryc.c : I
    //   22282: iflt -> 22296
    //   22285: ldc2_w -468983319
    //   22288: l2i
    //   22289: ldc_w 1873512839
    //   22292: ixor
    //   22293: goto -> 22304
    //   22296: ldc2_w 1566378767
    //   22299: l2i
    //   22300: ldc_w -577623151
    //   22303: ixor
    //   22304: ldc2_w -448134875
    //   22307: l2i
    //   22308: ldc_w -2024090452
    //   22311: ixor
    //   22312: ixor
    //   22313: lookupswitch default -> 37424, -488639209 -> 22340, -374293017 -> 22296
    //   22340: goto -> 22344
    //   22343: athrow
    //   22344: invokevirtual getValue : ()Ljava/lang/Object;
    //   22347: goto -> 22351
    //   22350: athrow
    //   22351: checkcast java/lang/Integer
    //   22354: getstatic Perryc.0 : I
    //   22357: ifle -> 22371
    //   22360: ldc2_w 46224432
    //   22363: l2i
    //   22364: ldc_w 286678728
    //   22367: ixor
    //   22368: goto -> 22379
    //   22371: ldc2_w 2086673797
    //   22374: l2i
    //   22375: ldc_w 422421135
    //   22378: ixor
    //   22379: ldc2_w -209563369
    //   22382: l2i
    //   22383: ldc_w 11467061
    //   22386: ixor
    //   22387: ixor
    //   22388: lookupswitch default -> 22416, -520379686 -> 37686, -370669091 -> 22371
    //   22416: goto -> 22420
    //   22419: athrow
    //   22420: invokevirtual intValue : ()I
    //   22423: goto -> 22427
    //   22426: athrow
    //   22427: i2f
    //   22428: ldc_w 1.1431996
    //   22431: invokestatic floatToIntBits : (F)I
    //   22434: ldc_w 2125616221
    //   22437: ixor
    //   22438: invokestatic intBitsToFloat : (I)F
    //   22441: fadd
    //   22442: getstatic Perryc.c : I
    //   22445: iflt -> 22459
    //   22448: ldc2_w -340975325
    //   22451: l2i
    //   22452: ldc_w -487595136
    //   22455: ixor
    //   22456: goto -> 22467
    //   22459: ldc2_w -1733233014
    //   22462: l2i
    //   22463: ldc_w -630007999
    //   22466: ixor
    //   22467: ldc2_w 935486137
    //   22470: l2i
    //   22471: ldc_w -1898192304
    //   22474: ixor
    //   22475: ixor
    //   22476: lookupswitch default -> 37350, -1336196534 -> 22459, -69492446 -> 22504
    //   22504: goto -> 22508
    //   22507: athrow
    //   22508: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   22511: goto -> 22515
    //   22514: athrow
    //   22515: getstatic Perryc.c : I
    //   22518: iflt -> 22532
    //   22521: ldc2_w 1821194006
    //   22524: l2i
    //   22525: ldc_w 1069916053
    //   22528: ixor
    //   22529: goto -> 22540
    //   22532: ldc2_w 639004401
    //   22535: l2i
    //   22536: ldc_w -276643760
    //   22539: ixor
    //   22540: ldc2_w -1787024673
    //   22543: l2i
    //   22544: ldc_w 1922235869
    //   22547: ixor
    //   22548: ixor
    //   22549: lookupswitch default -> 37240, -1264156799 -> 22532, 779778467 -> 22576
    //   22576: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22579: getstatic Perryc.0 : I
    //   22582: ifle -> 22596
    //   22585: ldc2_w -1392655804
    //   22588: l2i
    //   22589: ldc_w 1199525154
    //   22592: ixor
    //   22593: goto -> 22604
    //   22596: ldc2_w 361294634
    //   22599: l2i
    //   22600: ldc_w 840990811
    //   22603: ixor
    //   22604: ldc2_w -1240944052
    //   22607: l2i
    //   22608: ldc_w -702383998
    //   22611: ixor
    //   22612: ixor
    //   22613: lookupswitch default -> 37536, -1951906392 -> 22596, 1199743423 -> 22640
    //   22640: goto -> 22644
    //   22643: athrow
    //   22644: invokevirtual getValue : ()Ljava/lang/Object;
    //   22647: goto -> 22651
    //   22650: athrow
    //   22651: checkcast java/lang/Integer
    //   22654: getstatic Perryc.1 : I
    //   22657: ifeq -> 22671
    //   22660: ldc2_w -823732192
    //   22663: l2i
    //   22664: ldc_w 1847716544
    //   22667: ixor
    //   22668: goto -> 22679
    //   22671: ldc2_w 1994972391
    //   22674: l2i
    //   22675: ldc_w 123008493
    //   22678: ixor
    //   22679: ldc2_w -1332836617
    //   22682: l2i
    //   22683: ldc_w -1357010262
    //   22686: ixor
    //   22687: ixor
    //   22688: lookupswitch default -> 37640, -1085006147 -> 22671, 1848575319 -> 22716
    //   22716: goto -> 22720
    //   22719: athrow
    //   22720: invokevirtual intValue : ()I
    //   22723: goto -> 22727
    //   22726: athrow
    //   22727: getstatic Perryc.0 : I
    //   22730: ifle -> 22744
    //   22733: ldc2_w -1910973263
    //   22736: l2i
    //   22737: ldc_w -743872387
    //   22740: ixor
    //   22741: goto -> 22752
    //   22744: ldc2_w -1218048288
    //   22747: l2i
    //   22748: ldc_w 542064508
    //   22751: ixor
    //   22752: ldc2_w -455416539
    //   22755: l2i
    //   22756: ldc_w -92216226
    //   22759: ixor
    //   22760: ixor
    //   22761: lookupswitch default -> 37602, -1988939545 -> 22788, 1139520951 -> 22744
    //   22788: goto -> 22792
    //   22791: athrow
    //   22792: invokestatic rainbow : (I)Ljava/awt/Color;
    //   22795: goto -> 22799
    //   22798: athrow
    //   22799: getstatic Perryc.1 : I
    //   22802: ifeq -> 22816
    //   22805: ldc2_w 1541193623
    //   22808: l2i
    //   22809: ldc_w -271695592
    //   22812: ixor
    //   22813: goto -> 22824
    //   22816: ldc2_w 1550844688
    //   22819: l2i
    //   22820: ldc_w -1243540309
    //   22823: ixor
    //   22824: ldc2_w -833026786
    //   22827: l2i
    //   22828: ldc_w -1585339063
    //   22831: ixor
    //   22832: ixor
    //   22833: lookupswitch default -> 22860, -1317935488 -> 22816, -607494440 -> 37864
    //   22860: goto -> 22864
    //   22863: athrow
    //   22864: invokevirtual getRGB : ()I
    //   22867: goto -> 22871
    //   22870: athrow
    //   22871: ldc2_w -1668175728
    //   22874: l2i
    //   22875: ldc_w -1668175727
    //   22878: ixor
    //   22879: getstatic Perryc.1 : I
    //   22882: ifeq -> 22896
    //   22885: ldc2_w 1890702048
    //   22888: l2i
    //   22889: ldc_w -1425155436
    //   22892: ixor
    //   22893: goto -> 22904
    //   22896: ldc2_w -1176837358
    //   22899: l2i
    //   22900: ldc_w -2142566075
    //   22903: ixor
    //   22904: ldc2_w -692678576
    //   22907: l2i
    //   22908: ldc_w 758505813
    //   22911: ixor
    //   22912: ixor
    //   22913: lookupswitch default -> 37902, -1038967982 -> 22940, 541030769 -> 22896
    //   22940: goto -> 22944
    //   22943: athrow
    //   22944: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   22947: goto -> 22951
    //   22950: athrow
    //   22951: goto -> 26267
    //   22954: ldc2_w 651106348
    //   22957: l2i
    //   22958: ldc_w 651106349
    //   22961: ixor
    //   22962: newarray int
    //   22964: dup
    //   22965: ldc2_w 551001778
    //   22968: l2i
    //   22969: ldc_w 551001778
    //   22972: ixor
    //   22973: ldc2_w -2107561011
    //   22976: l2i
    //   22977: ldc_w -2107561012
    //   22980: ixor
    //   22981: iastore
    //   22982: getstatic Perryc.0 : I
    //   22985: ifle -> 22999
    //   22988: ldc2_w -62494249
    //   22991: l2i
    //   22992: ldc_w -190809118
    //   22995: ixor
    //   22996: goto -> 23007
    //   22999: ldc2_w -13510316
    //   23002: l2i
    //   23003: ldc_w -1229069836
    //   23006: ixor
    //   23007: ldc2_w -242301842
    //   23010: l2i
    //   23011: ldc_w -1099383297
    //   23014: ixor
    //   23015: ixor
    //   23016: lookupswitch default -> 23044, 363620903 -> 22999, 1192258468 -> 37302
    //   23044: astore #7
    //   23046: getstatic Perryc.0 : I
    //   23049: ifle -> 23063
    //   23052: ldc2_w 776864721
    //   23055: l2i
    //   23056: ldc_w 2052885259
    //   23059: ixor
    //   23060: goto -> 23071
    //   23063: ldc2_w 110380759
    //   23066: l2i
    //   23067: ldc_w -1599372438
    //   23070: ixor
    //   23071: ldc2_w -714053092
    //   23074: l2i
    //   23075: ldc_w -624890025
    //   23078: ixor
    //   23079: ixor
    //   23080: lookupswitch default -> 38096, -1450229514 -> 23108, 1537346961 -> 23063
    //   23108: aload #4
    //   23110: getstatic Perryc.1 : I
    //   23113: ifeq -> 23127
    //   23116: ldc2_w -781042098
    //   23119: l2i
    //   23120: ldc_w 1310880103
    //   23123: ixor
    //   23124: goto -> 23135
    //   23127: ldc2_w -587764964
    //   23130: l2i
    //   23131: ldc_w -1943740912
    //   23134: ixor
    //   23135: ldc2_w -1392524649
    //   23138: l2i
    //   23139: ldc_w 1475644294
    //   23142: ixor
    //   23143: ixor
    //   23144: lookupswitch default -> 37892, -1411843043 -> 23172, 1683686968 -> 23127
    //   23172: goto -> 23176
    //   23175: athrow
    //   23176: invokevirtual toCharArray : ()[C
    //   23179: goto -> 23183
    //   23182: athrow
    //   23183: getstatic Perryc.0 : I
    //   23186: ifle -> 23200
    //   23189: ldc2_w -1847675146
    //   23192: l2i
    //   23193: ldc_w 1318875551
    //   23196: ixor
    //   23197: goto -> 23208
    //   23200: ldc2_w 813570227
    //   23203: l2i
    //   23204: ldc_w 998641887
    //   23207: ixor
    //   23208: ldc2_w 1705891176
    //   23211: l2i
    //   23212: ldc_w -1244083522
    //   23215: ixor
    //   23216: ixor
    //   23217: lookupswitch default -> 37330, -611510342 -> 23244, 255318207 -> 23200
    //   23244: astore #8
    //   23246: ldc_w 2.5711613E38
    //   23249: invokestatic floatToIntBits : (F)I
    //   23252: ldc_w 2134994628
    //   23255: ixor
    //   23256: invokestatic intBitsToFloat : (I)F
    //   23259: getstatic Perryc.1 : I
    //   23262: ifeq -> 23276
    //   23265: ldc2_w -120046716
    //   23268: l2i
    //   23269: ldc_w -390701320
    //   23272: ixor
    //   23273: goto -> 23284
    //   23276: ldc2_w 50779896
    //   23279: l2i
    //   23280: ldc_w 1514207295
    //   23283: ixor
    //   23284: ldc2_w -762649268
    //   23287: l2i
    //   23288: ldc_w 1136881690
    //   23291: ixor
    //   23292: ixor
    //   23293: lookupswitch default -> 37656, -2128089046 -> 23276, -938493039 -> 23320
    //   23320: fstore #9
    //   23322: getstatic Perryc.0 : I
    //   23325: ifle -> 23339
    //   23328: ldc2_w -1157116
    //   23331: l2i
    //   23332: ldc_w -1059932275
    //   23335: ixor
    //   23336: goto -> 23347
    //   23339: ldc2_w 821985395
    //   23342: l2i
    //   23343: ldc_w -317218455
    //   23346: ixor
    //   23347: ldc2_w 186439043
    //   23350: l2i
    //   23351: ldc_w -287310078
    //   23354: ixor
    //   23355: ixor
    //   23356: lookupswitch default -> 23384, -885033554 -> 23339, -620772088 -> 37816
    //   23384: aload #8
    //   23386: getstatic Perryc.c : I
    //   23389: iflt -> 23403
    //   23392: ldc2_w -667823895
    //   23395: l2i
    //   23396: ldc_w 1838060996
    //   23399: ixor
    //   23400: goto -> 23411
    //   23403: ldc2_w 187784908
    //   23406: l2i
    //   23407: ldc_w 1089541398
    //   23410: ixor
    //   23411: ldc2_w -165814971
    //   23414: l2i
    //   23415: ldc_w -901237725
    //   23418: ixor
    //   23419: ixor
    //   23420: lookupswitch default -> 23448, -1981109173 -> 37694, -748627219 -> 23403
    //   23448: astore #10
    //   23450: getstatic Perryc.0 : I
    //   23453: ifle -> 23467
    //   23456: ldc2_w 196932509
    //   23459: l2i
    //   23460: ldc_w -1517077213
    //   23463: ixor
    //   23464: goto -> 23475
    //   23467: ldc2_w 1081976469
    //   23470: l2i
    //   23471: ldc_w 1358169646
    //   23474: ixor
    //   23475: ldc2_w -1794345552
    //   23478: l2i
    //   23479: ldc_w -1806145843
    //   23482: ixor
    //   23483: ixor
    //   23484: lookupswitch default -> 23512, -1350836797 -> 38070, -1061655574 -> 23467
    //   23512: aload #10
    //   23514: arraylength
    //   23515: getstatic Perryc.0 : I
    //   23518: ifle -> 23532
    //   23521: ldc2_w -228089183
    //   23524: l2i
    //   23525: ldc_w 33132916
    //   23528: ixor
    //   23529: goto -> 23540
    //   23532: ldc2_w 1441697176
    //   23535: l2i
    //   23536: ldc_w -713980578
    //   23539: ixor
    //   23540: ldc2_w 1309483093
    //   23543: l2i
    //   23544: ldc_w 1126326927
    //   23547: ixor
    //   23548: ixor
    //   23549: lookupswitch default -> 37726, -1917826532 -> 23576, -21925617 -> 23532
    //   23576: istore #11
    //   23578: ldc2_w 1426678960
    //   23581: l2i
    //   23582: ldc_w 1426678960
    //   23585: ixor
    //   23586: getstatic Perryc.0 : I
    //   23589: ifle -> 23603
    //   23592: ldc2_w 315335187
    //   23595: l2i
    //   23596: ldc_w 1357284952
    //   23599: ixor
    //   23600: goto -> 23611
    //   23603: ldc2_w 935206590
    //   23606: l2i
    //   23607: ldc_w -269973723
    //   23610: ixor
    //   23611: ldc2_w -1433508013
    //   23614: l2i
    //   23615: ldc_w -1130612998
    //   23618: ixor
    //   23619: ixor
    //   23620: lookupswitch default -> 23648, -958302100 -> 23603, 1413445090 -> 37268
    //   23648: istore #12
    //   23650: getstatic Perryc.0 : I
    //   23653: ifle -> 23667
    //   23656: ldc2_w -1352851618
    //   23659: l2i
    //   23660: ldc_w -1637403605
    //   23663: ixor
    //   23664: goto -> 23675
    //   23667: ldc2_w 1202689970
    //   23670: l2i
    //   23671: ldc_w 787550022
    //   23674: ixor
    //   23675: ldc2_w 756674823
    //   23678: l2i
    //   23679: ldc_w -564306528
    //   23682: ixor
    //   23683: ixor
    //   23684: lookupswitch default -> 37414, -1709558701 -> 23712, -1031895086 -> 23667
    //   23712: iload #12
    //   23714: getstatic Perryc.1 : I
    //   23717: ifeq -> 23731
    //   23720: ldc2_w 123793650
    //   23723: l2i
    //   23724: ldc_w -1792503379
    //   23727: ixor
    //   23728: goto -> 23739
    //   23731: ldc2_w 2039929517
    //   23734: l2i
    //   23735: ldc_w -972461952
    //   23738: ixor
    //   23739: ldc2_w -959882208
    //   23742: l2i
    //   23743: ldc_w 163403279
    //   23746: ixor
    //   23747: ixor
    //   23748: lookupswitch default -> 23776, 1564240752 -> 37990, 1782606082 -> 23731
    //   23776: iload #11
    //   23778: if_icmpge -> 23792
    //   23781: ldc2_w 1234423082
    //   23784: l2i
    //   23785: ldc_w -1587563357
    //   23788: ixor
    //   23789: goto -> 23800
    //   23792: ldc2_w -1190573092
    //   23795: l2i
    //   23796: ldc_w 1371877974
    //   23799: ixor
    //   23800: ldc2_w -411275888
    //   23803: l2i
    //   23804: ldc_w 1719348096
    //   23807: ixor
    //   23808: ixor
    //   23809: tableswitch default -> 23781, 1774927769 -> 23832, 1774927770 -> 25847
    //   23832: getstatic Perryc.1 : I
    //   23835: ifeq -> 23849
    //   23838: ldc2_w 2085581137
    //   23841: l2i
    //   23842: ldc_w 1006421610
    //   23845: ixor
    //   23846: goto -> 23857
    //   23849: ldc2_w 1379552200
    //   23852: l2i
    //   23853: ldc_w 5292333
    //   23856: ixor
    //   23857: ldc2_w 681803717
    //   23860: l2i
    //   23861: ldc_w -1407284829
    //   23864: ixor
    //   23865: ixor
    //   23866: lookupswitch default -> 23892, -1022475939 -> 37404, -439461867 -> 23849
    //   23892: aload #10
    //   23894: getstatic Perryc.c : I
    //   23897: iflt -> 23911
    //   23900: ldc2_w -328318006
    //   23903: l2i
    //   23904: ldc_w -4239905
    //   23907: ixor
    //   23908: goto -> 23919
    //   23911: ldc2_w 2039088686
    //   23914: l2i
    //   23915: ldc_w 947569016
    //   23918: ixor
    //   23919: ldc2_w -1988969525
    //   23922: l2i
    //   23923: ldc_w -730007897
    //   23926: ixor
    //   23927: ixor
    //   23928: lookupswitch default -> 23956, 683671484 -> 23911, 1323254649 -> 37458
    //   23956: iload #12
    //   23958: caload
    //   23959: getstatic Perryc.c : I
    //   23962: iflt -> 23976
    //   23965: ldc2_w 1499749536
    //   23968: l2i
    //   23969: ldc_w -1131814189
    //   23972: ixor
    //   23973: goto -> 23984
    //   23976: ldc2_w 882195607
    //   23979: l2i
    //   23980: ldc_w 417357654
    //   23983: ixor
    //   23984: ldc2_w 288728974
    //   23987: l2i
    //   23988: ldc_w -596378365
    //   23991: ixor
    //   23992: ixor
    //   23993: lookupswitch default -> 37854, -516736692 -> 24020, 682353918 -> 23976
    //   24020: istore #13
    //   24022: getstatic Perryc.0 : I
    //   24025: ifle -> 24039
    //   24028: ldc2_w 1165374585
    //   24031: l2i
    //   24032: ldc_w 1910355050
    //   24035: ixor
    //   24036: goto -> 24047
    //   24039: ldc2_w 1465573114
    //   24042: l2i
    //   24043: ldc_w -1615143516
    //   24046: ixor
    //   24047: ldc2_w 2042536110
    //   24050: l2i
    //   24051: ldc_w -1234072755
    //   24054: ixor
    //   24055: ixor
    //   24056: lookupswitch default -> 38064, -77288464 -> 24039, 120531133 -> 24084
    //   24084: aload_0
    //   24085: getstatic Perryc.1 : I
    //   24088: ifeq -> 24102
    //   24091: ldc2_w -1354025764
    //   24094: l2i
    //   24095: ldc_w -581629345
    //   24098: ixor
    //   24099: goto -> 24110
    //   24102: ldc2_w 836606708
    //   24105: l2i
    //   24106: ldc_w -646724424
    //   24109: ixor
    //   24110: ldc2_w -1968991087
    //   24113: l2i
    //   24114: ldc_w 171523076
    //   24117: ixor
    //   24118: ixor
    //   24119: lookupswitch default -> 24144, -226191850 -> 38130, 1308518430 -> 24102
    //   24144: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   24147: getstatic Perryc.1 : I
    //   24150: ifeq -> 24164
    //   24153: ldc2_w 337696153
    //   24156: l2i
    //   24157: ldc_w 599042667
    //   24160: ixor
    //   24161: goto -> 24172
    //   24164: ldc2_w -1845825820
    //   24167: l2i
    //   24168: ldc_w -34705316
    //   24171: ixor
    //   24172: ldc2_w 401976128
    //   24175: l2i
    //   24176: ldc_w -910513271
    //   24179: ixor
    //   24180: ixor
    //   24181: lookupswitch default -> 24208, -991457348 -> 24164, -371491013 -> 37950
    //   24208: iload #13
    //   24210: getstatic Perryc.0 : I
    //   24213: ifle -> 24227
    //   24216: ldc2_w -1987768938
    //   24219: l2i
    //   24220: ldc_w 937020236
    //   24223: ixor
    //   24224: goto -> 24235
    //   24227: ldc2_w 335054020
    //   24230: l2i
    //   24231: ldc_w 1357356232
    //   24234: ixor
    //   24235: ldc2_w 440885777
    //   24238: l2i
    //   24239: ldc_w -2059952143
    //   24242: ixor
    //   24243: ixor
    //   24244: lookupswitch default -> 37874, -596646420 -> 24272, 556546874 -> 24227
    //   24272: goto -> 24276
    //   24275: athrow
    //   24276: invokestatic valueOf : (C)Ljava/lang/String;
    //   24279: goto -> 24283
    //   24282: athrow
    //   24283: ldc_w 3.3383595E38
    //   24286: invokestatic floatToIntBits : (F)I
    //   24289: ldc_w 2138777207
    //   24292: ixor
    //   24293: invokestatic intBitsToFloat : (I)F
    //   24296: getstatic Perryc.0 : I
    //   24299: ifle -> 24313
    //   24302: ldc2_w -1264123009
    //   24305: l2i
    //   24306: ldc_w -569981417
    //   24309: ixor
    //   24310: goto -> 24321
    //   24313: ldc2_w -829280777
    //   24316: l2i
    //   24317: ldc_w -2106466466
    //   24320: ixor
    //   24321: ldc2_w 1044618296
    //   24324: l2i
    //   24325: ldc_w -1335895763
    //   24328: ixor
    //   24329: ixor
    //   24330: lookupswitch default -> 24356, -457342851 -> 37698, -240214676 -> 24313
    //   24356: fload #9
    //   24358: fadd
    //   24359: getstatic Perryc.c : I
    //   24362: iflt -> 24376
    //   24365: ldc2_w -606457393
    //   24368: l2i
    //   24369: ldc_w -54718990
    //   24372: ixor
    //   24373: goto -> 24384
    //   24376: ldc2_w 1558315114
    //   24379: l2i
    //   24380: ldc_w 991974818
    //   24383: ixor
    //   24384: ldc2_w 1973040387
    //   24387: l2i
    //   24388: ldc_w 781224781
    //   24391: ixor
    //   24392: ixor
    //   24393: lookupswitch default -> 37930, 1019800454 -> 24420, 2087551603 -> 24376
    //   24420: aload_0
    //   24421: getstatic Perryc.0 : I
    //   24424: ifle -> 24438
    //   24427: ldc2_w 1484986710
    //   24430: l2i
    //   24431: ldc_w 232073099
    //   24434: ixor
    //   24435: goto -> 24446
    //   24438: ldc2_w -1599243236
    //   24441: l2i
    //   24442: ldc_w -1389470961
    //   24445: ixor
    //   24446: ldc2_w -518804718
    //   24449: l2i
    //   24450: ldc_w -1453111837
    //   24453: ixor
    //   24454: ixor
    //   24455: lookupswitch default -> 24480, 254915708 -> 24438, 489082924 -> 38080
    //   24480: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24483: getstatic Perryc.0 : I
    //   24486: ifle -> 24500
    //   24489: ldc2_w -1660086327
    //   24492: l2i
    //   24493: ldc_w 412800072
    //   24496: ixor
    //   24497: goto -> 24508
    //   24500: ldc2_w -801278279
    //   24503: l2i
    //   24504: ldc_w -1808642031
    //   24507: ixor
    //   24508: ldc2_w -302804018
    //   24511: l2i
    //   24512: ldc_w -1107269515
    //   24515: ixor
    //   24516: ixor
    //   24517: lookupswitch default -> 37682, -698075078 -> 24500, 402447635 -> 24544
    //   24544: goto -> 24548
    //   24547: athrow
    //   24548: invokevirtual getValue : ()Ljava/lang/Object;
    //   24551: goto -> 24555
    //   24554: athrow
    //   24555: checkcast java/lang/Integer
    //   24558: getstatic Perryc.0 : I
    //   24561: ifle -> 24575
    //   24564: ldc2_w 1764883708
    //   24567: l2i
    //   24568: ldc_w 590916787
    //   24571: ixor
    //   24572: goto -> 24583
    //   24575: ldc2_w -1568609404
    //   24578: l2i
    //   24579: ldc_w 1088000558
    //   24582: ixor
    //   24583: ldc2_w 1137431728
    //   24586: l2i
    //   24587: ldc_w 1544358603
    //   24590: ixor
    //   24591: ixor
    //   24592: lookupswitch default -> 37376, -39868463 -> 24620, 1439665716 -> 24575
    //   24620: goto -> 24624
    //   24623: athrow
    //   24624: invokevirtual intValue : ()I
    //   24627: goto -> 24631
    //   24630: athrow
    //   24631: i2f
    //   24632: ldc_w 0.20588936
    //   24635: invokestatic floatToIntBits : (F)I
    //   24638: ldc_w 2138231977
    //   24641: ixor
    //   24642: invokestatic intBitsToFloat : (I)F
    //   24645: fadd
    //   24646: getstatic Perryc.1 : I
    //   24649: ifeq -> 24663
    //   24652: ldc2_w -1640901198
    //   24655: l2i
    //   24656: ldc_w 230716212
    //   24659: ixor
    //   24660: goto -> 24671
    //   24663: ldc2_w -54518158
    //   24666: l2i
    //   24667: ldc_w 1390463461
    //   24670: ixor
    //   24671: ldc2_w 1168907601
    //   24674: l2i
    //   24675: ldc_w 1823936179
    //   24678: ixor
    //   24679: ixor
    //   24680: lookupswitch default -> 38150, -2026126219 -> 24708, -1159023260 -> 24663
    //   24708: aload #7
    //   24710: ldc2_w -202031050
    //   24713: l2i
    //   24714: ldc_w -202031050
    //   24717: ixor
    //   24718: iaload
    //   24719: getstatic Perryc.0 : I
    //   24722: ifle -> 24736
    //   24725: ldc2_w 906602364
    //   24728: l2i
    //   24729: ldc_w 455252391
    //   24732: ixor
    //   24733: goto -> 24744
    //   24736: ldc2_w 1537399402
    //   24739: l2i
    //   24740: ldc_w -412783460
    //   24743: ixor
    //   24744: ldc2_w -1177693581
    //   24747: l2i
    //   24748: ldc_w 941884551
    //   24751: ixor
    //   24752: ixor
    //   24753: lookupswitch default -> 37270, -1396512721 -> 24736, 1026449410 -> 24780
    //   24780: goto -> 24784
    //   24783: athrow
    //   24784: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   24787: goto -> 24791
    //   24790: athrow
    //   24791: getstatic Perryc.c : I
    //   24794: iflt -> 24808
    //   24797: ldc2_w -831959617
    //   24800: l2i
    //   24801: ldc_w -476177200
    //   24804: ixor
    //   24805: goto -> 24816
    //   24808: ldc2_w 901522571
    //   24811: l2i
    //   24812: ldc_w -1078507602
    //   24815: ixor
    //   24816: ldc2_w 2109002535
    //   24819: l2i
    //   24820: ldc_w 1740591249
    //   24823: ixor
    //   24824: ixor
    //   24825: lookupswitch default -> 24852, -1273503914 -> 24808, 939315929 -> 37648
    //   24852: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24855: getstatic Perryc.c : I
    //   24858: iflt -> 24872
    //   24861: ldc2_w 1349022525
    //   24864: l2i
    //   24865: ldc_w -1660202802
    //   24868: ixor
    //   24869: goto -> 24880
    //   24872: ldc2_w 116737821
    //   24875: l2i
    //   24876: ldc_w 1628703217
    //   24879: ixor
    //   24880: ldc2_w -1116641655
    //   24883: l2i
    //   24884: ldc_w 99003505
    //   24887: ixor
    //   24888: ixor
    //   24889: lookupswitch default -> 24916, -573706732 -> 24872, 1978984715 -> 37372
    //   24916: goto -> 24920
    //   24919: athrow
    //   24920: invokevirtual getValue : ()Ljava/lang/Object;
    //   24923: goto -> 24927
    //   24926: athrow
    //   24927: checkcast java/lang/Integer
    //   24930: getstatic Perryc.1 : I
    //   24933: ifeq -> 24947
    //   24936: ldc2_w -1936205063
    //   24939: l2i
    //   24940: ldc_w 761781307
    //   24943: ixor
    //   24944: goto -> 24955
    //   24947: ldc2_w -1262616014
    //   24950: l2i
    //   24951: ldc_w -1573810512
    //   24954: ixor
    //   24955: ldc2_w 648042481
    //   24958: l2i
    //   24959: ldc_w -377164038
    //   24962: ixor
    //   24963: ixor
    //   24964: lookupswitch default -> 37844, -643091063 -> 24992, 1859436489 -> 24947
    //   24992: goto -> 24996
    //   24995: athrow
    //   24996: invokevirtual intValue : ()I
    //   24999: goto -> 25003
    //   25002: athrow
    //   25003: imul
    //   25004: getstatic Perryc.0 : I
    //   25007: ifle -> 25021
    //   25010: ldc2_w -1909043973
    //   25013: l2i
    //   25014: ldc_w -1444128077
    //   25017: ixor
    //   25018: goto -> 25029
    //   25021: ldc2_w 1863478876
    //   25024: l2i
    //   25025: ldc_w 433656388
    //   25028: ixor
    //   25029: ldc2_w -860536529
    //   25032: l2i
    //   25033: ldc_w 1314858438
    //   25036: ixor
    //   25037: ixor
    //   25038: lookupswitch default -> 25064, -1523551583 -> 37928, 1933455779 -> 25021
    //   25064: goto -> 25068
    //   25067: athrow
    //   25068: invokestatic rainbow : (I)Ljava/awt/Color;
    //   25071: goto -> 25075
    //   25074: athrow
    //   25075: getstatic Perryc.1 : I
    //   25078: ifeq -> 25092
    //   25081: ldc2_w 1138705059
    //   25084: l2i
    //   25085: ldc_w 51013962
    //   25088: ixor
    //   25089: goto -> 25100
    //   25092: ldc2_w 1789156547
    //   25095: l2i
    //   25096: ldc_w 1048980912
    //   25099: ixor
    //   25100: ldc2_w 1321771897
    //   25103: l2i
    //   25104: ldc_w -404270917
    //   25107: ixor
    //   25108: ixor
    //   25109: lookupswitch default -> 37742, -369436629 -> 25092, -49446223 -> 25136
    //   25136: goto -> 25140
    //   25139: athrow
    //   25140: invokevirtual getRGB : ()I
    //   25143: goto -> 25147
    //   25146: athrow
    //   25147: ldc2_w -109907288
    //   25150: l2i
    //   25151: ldc_w -109907287
    //   25154: ixor
    //   25155: getstatic Perryc.0 : I
    //   25158: ifle -> 25172
    //   25161: ldc2_w 691898616
    //   25164: l2i
    //   25165: ldc_w 1982511627
    //   25168: ixor
    //   25169: goto -> 25180
    //   25172: ldc2_w -1914585167
    //   25175: l2i
    //   25176: ldc_w 1486015534
    //   25179: ixor
    //   25180: ldc2_w -690969784
    //   25183: l2i
    //   25184: ldc_w 1520080161
    //   25187: ixor
    //   25188: ixor
    //   25189: lookupswitch default -> 25216, -812282168 -> 25172, -748878694 -> 37896
    //   25216: goto -> 25220
    //   25219: athrow
    //   25220: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   25223: goto -> 25227
    //   25226: athrow
    //   25227: getstatic Perryc.0 : I
    //   25230: ifle -> 25244
    //   25233: ldc2_w 2053018385
    //   25236: l2i
    //   25237: ldc_w -1270616594
    //   25240: ixor
    //   25241: goto -> 25252
    //   25244: ldc2_w -1406870803
    //   25247: l2i
    //   25248: ldc_w 1692272169
    //   25251: ixor
    //   25252: ldc2_w 259165933
    //   25255: l2i
    //   25256: ldc_w 1306050162
    //   25259: ixor
    //   25260: ixor
    //   25261: lookupswitch default -> 25288, -1934143904 -> 38186, -1097462825 -> 25244
    //   25288: fload #9
    //   25290: getstatic Perryc.0 : I
    //   25293: ifle -> 25307
    //   25296: ldc2_w 857492014
    //   25299: l2i
    //   25300: ldc_w 1604983483
    //   25303: ixor
    //   25304: goto -> 25315
    //   25307: ldc2_w 315231131
    //   25310: l2i
    //   25311: ldc_w -1986225400
    //   25314: ixor
    //   25315: ldc2_w 575381892
    //   25318: l2i
    //   25319: ldc_w 217641243
    //   25322: ixor
    //   25323: ixor
    //   25324: lookupswitch default -> 25352, -1039151646 -> 25307, 1107623946 -> 38124
    //   25352: aload_0
    //   25353: getstatic Perryc.0 : I
    //   25356: ifle -> 25370
    //   25359: ldc2_w 540439997
    //   25362: l2i
    //   25363: ldc_w -1456469969
    //   25366: ixor
    //   25367: goto -> 25378
    //   25370: ldc2_w -738951379
    //   25373: l2i
    //   25374: ldc_w -551101968
    //   25377: ixor
    //   25378: ldc2_w 777516402
    //   25381: l2i
    //   25382: ldc_w -1900138864
    //   25385: ixor
    //   25386: ixor
    //   25387: lookupswitch default -> 37284, -1405387457 -> 25412, 703571568 -> 25370
    //   25412: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   25415: getstatic Perryc.0 : I
    //   25418: ifle -> 25432
    //   25421: ldc2_w 1542354274
    //   25424: l2i
    //   25425: ldc_w 1972386149
    //   25428: ixor
    //   25429: goto -> 25440
    //   25432: ldc2_w 1171011715
    //   25435: l2i
    //   25436: ldc_w -1190009208
    //   25439: ixor
    //   25440: ldc2_w 1821665114
    //   25443: l2i
    //   25444: ldc_w 697994216
    //   25447: ixor
    //   25448: ixor
    //   25449: lookupswitch default -> 37378, -1177341255 -> 25476, 1802543285 -> 25432
    //   25476: iload #13
    //   25478: getstatic Perryc.0 : I
    //   25481: ifle -> 25495
    //   25484: ldc2_w 1779743282
    //   25487: l2i
    //   25488: ldc_w -1352615477
    //   25491: ixor
    //   25492: goto -> 25503
    //   25495: ldc2_w 1219249508
    //   25498: l2i
    //   25499: ldc_w -1480674830
    //   25502: ixor
    //   25503: ldc2_w 1698242344
    //   25506: l2i
    //   25507: ldc_w -194959046
    //   25510: ixor
    //   25511: ixor
    //   25512: lookupswitch default -> 37788, 1412183531 -> 25495, 2118828676 -> 25540
    //   25540: goto -> 25544
    //   25543: athrow
    //   25544: invokestatic valueOf : (C)Ljava/lang/String;
    //   25547: goto -> 25551
    //   25550: athrow
    //   25551: getstatic Perryc.c : I
    //   25554: iflt -> 25568
    //   25557: ldc2_w 255994329
    //   25560: l2i
    //   25561: ldc_w 1033208575
    //   25564: ixor
    //   25565: goto -> 25576
    //   25568: ldc2_w -1721808395
    //   25571: l2i
    //   25572: ldc_w 1355000185
    //   25575: ixor
    //   25576: ldc2_w -1289616774
    //   25579: l2i
    //   25580: ldc_w 1059447986
    //   25583: ixor
    //   25584: ixor
    //   25585: lookupswitch default -> 37464, -1093644818 -> 25568, 1167787588 -> 25612
    //   25612: goto -> 25616
    //   25615: athrow
    //   25616: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   25619: goto -> 25623
    //   25622: athrow
    //   25623: i2f
    //   25624: fadd
    //   25625: getstatic Perryc.0 : I
    //   25628: ifle -> 25642
    //   25631: ldc2_w 499407850
    //   25634: l2i
    //   25635: ldc_w -2051653514
    //   25638: ixor
    //   25639: goto -> 25650
    //   25642: ldc2_w -270278278
    //   25645: l2i
    //   25646: ldc_w 482707816
    //   25649: ixor
    //   25650: ldc2_w -1915944380
    //   25653: l2i
    //   25654: ldc_w -241050096
    //   25657: ixor
    //   25658: ixor
    //   25659: lookupswitch default -> 38116, -1890929594 -> 25684, -467744824 -> 25642
    //   25684: fstore #9
    //   25686: getstatic Perryc.1 : I
    //   25689: ifeq -> 25703
    //   25692: ldc2_w 1818309811
    //   25695: l2i
    //   25696: ldc_w 1587215780
    //   25699: ixor
    //   25700: goto -> 25711
    //   25703: ldc2_w -55684833
    //   25706: l2i
    //   25707: ldc_w 1202196856
    //   25710: ixor
    //   25711: ldc2_w 2039167291
    //   25714: l2i
    //   25715: ldc_w 1861388943
    //   25718: ixor
    //   25719: ixor
    //   25720: lookupswitch default -> 38136, -1400900653 -> 25748, 629308067 -> 25703
    //   25748: aload #7
    //   25750: ldc2_w 1530479693
    //   25753: l2i
    //   25754: ldc_w 1530479693
    //   25757: ixor
    //   25758: getstatic Perryc.c : I
    //   25761: iflt -> 25775
    //   25764: ldc2_w 209085983
    //   25767: l2i
    //   25768: ldc_w 225615367
    //   25771: ixor
    //   25772: goto -> 25783
    //   25775: ldc2_w -659687009
    //   25778: l2i
    //   25779: ldc_w 619500959
    //   25782: ixor
    //   25783: ldc2_w 761630702
    //   25786: l2i
    //   25787: ldc_w -729438134
    //   25790: ixor
    //   25791: ixor
    //   25792: lookupswitch default -> 37220, -119218244 -> 25775, 94440356 -> 25820
    //   25820: aload #7
    //   25822: ldc2_w -2070156126
    //   25825: l2i
    //   25826: ldc_w -2070156126
    //   25829: ixor
    //   25830: iaload
    //   25831: ldc2_w 896502881
    //   25834: l2i
    //   25835: ldc_w 896502880
    //   25838: ixor
    //   25839: iadd
    //   25840: iastore
    //   25841: iinc #12, 1
    //   25844: goto -> 23650
    //   25847: goto -> 26267
    //   25850: getstatic Perryc.c : I
    //   25853: iflt -> 25867
    //   25856: ldc2_w -1903893930
    //   25859: l2i
    //   25860: ldc_w 1281389048
    //   25863: ixor
    //   25864: goto -> 25875
    //   25867: ldc2_w 214107789
    //   25870: l2i
    //   25871: ldc_w 883256868
    //   25874: ixor
    //   25875: ldc2_w -550128199
    //   25878: l2i
    //   25879: ldc_w 1818402310
    //   25882: ixor
    //   25883: ixor
    //   25884: lookupswitch default -> 25912, 546339289 -> 25867, 1907603473 -> 37386
    //   25912: aload_0
    //   25913: getstatic Perryc.c : I
    //   25916: iflt -> 25930
    //   25919: ldc2_w 1926507244
    //   25922: l2i
    //   25923: ldc_w 1793194734
    //   25926: ixor
    //   25927: goto -> 25938
    //   25930: ldc2_w -501737584
    //   25933: l2i
    //   25934: ldc_w -315268818
    //   25937: ixor
    //   25938: ldc2_w -613694369
    //   25941: l2i
    //   25942: ldc_w -493276413
    //   25945: ixor
    //   25946: ixor
    //   25947: lookupswitch default -> 37624, 566699870 -> 25930, 920617442 -> 25972
    //   25972: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   25975: getstatic Perryc.1 : I
    //   25978: ifeq -> 25992
    //   25981: ldc2_w 1113042409
    //   25984: l2i
    //   25985: ldc_w -951092464
    //   25988: ixor
    //   25989: goto -> 26000
    //   25992: ldc2_w 1723348010
    //   25995: l2i
    //   25996: ldc_w -354305271
    //   25999: ixor
    //   26000: ldc2_w -461080969
    //   26003: l2i
    //   26004: ldc_w 524854660
    //   26007: ixor
    //   26008: ixor
    //   26009: lookupswitch default -> 38068, 2006277328 -> 26036, 2127824138 -> 25992
    //   26036: aload #4
    //   26038: ldc_w 3.0905372E38
    //   26041: invokestatic floatToIntBits : (F)I
    //   26044: ldc_w 2137555349
    //   26047: ixor
    //   26048: invokestatic intBitsToFloat : (I)F
    //   26051: ldc_w 0.54563946
    //   26054: invokestatic floatToIntBits : (F)I
    //   26057: ldc_w 2125180679
    //   26060: ixor
    //   26061: invokestatic intBitsToFloat : (I)F
    //   26064: getstatic Perryc.c : I
    //   26067: iflt -> 26081
    //   26070: ldc2_w -902375921
    //   26073: l2i
    //   26074: ldc_w 1358517703
    //   26077: ixor
    //   26078: goto -> 26089
    //   26081: ldc2_w 1305619933
    //   26084: l2i
    //   26085: ldc_w 1691595534
    //   26088: ixor
    //   26089: ldc2_w -330019516
    //   26092: l2i
    //   26093: ldc_w 1156114306
    //   26096: ixor
    //   26097: ixor
    //   26098: lookupswitch default -> 37858, -2118306795 -> 26124, 846407950 -> 26081
    //   26124: aload_0
    //   26125: getstatic Perryc.0 : I
    //   26128: ifle -> 26142
    //   26131: ldc2_w -2134518484
    //   26134: l2i
    //   26135: ldc_w -60623852
    //   26138: ixor
    //   26139: goto -> 26150
    //   26142: ldc2_w -1894612591
    //   26145: l2i
    //   26146: ldc_w -1693757646
    //   26149: ixor
    //   26150: ldc2_w -535684416
    //   26153: l2i
    //   26154: ldc_w 189568702
    //   26157: ixor
    //   26158: ixor
    //   26159: lookupswitch default -> 38056, -1745244858 -> 26142, -12107043 -> 26184
    //   26184: getfield color : I
    //   26187: ldc2_w -79629329
    //   26190: l2i
    //   26191: ldc_w -79629330
    //   26194: ixor
    //   26195: getstatic Perryc.1 : I
    //   26198: ifeq -> 26212
    //   26201: ldc2_w 1083061640
    //   26204: l2i
    //   26205: ldc_w -2114493956
    //   26208: ixor
    //   26209: goto -> 26220
    //   26212: ldc2_w -804375741
    //   26215: l2i
    //   26216: ldc_w 1515252868
    //   26219: ixor
    //   26220: ldc2_w -321106141
    //   26223: l2i
    //   26224: ldc_w 2098181394
    //   26227: ixor
    //   26228: ixor
    //   26229: lookupswitch default -> 37388, 462235126 -> 26256, 1353363013 -> 26212
    //   26256: goto -> 26260
    //   26259: athrow
    //   26260: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   26263: goto -> 26267
    //   26266: athrow
    //   26267: getstatic Perryc.1 : I
    //   26270: ifeq -> 26284
    //   26273: ldc2_w 849771925
    //   26276: l2i
    //   26277: ldc_w 646290066
    //   26280: ixor
    //   26281: goto -> 26292
    //   26284: ldc2_w -590604549
    //   26287: l2i
    //   26288: ldc_w 1039192980
    //   26291: ixor
    //   26292: ldc2_w -49222931
    //   26295: l2i
    //   26296: ldc_w -916371248
    //   26299: ixor
    //   26300: ixor
    //   26301: lookupswitch default -> 26328, -1532590393 -> 26284, 542262586 -> 37518
    //   26328: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   26331: ldc_w '䯾㌟䮻坓兛ꕡ๷'
    //   26334: getstatic Perryc.0 : I
    //   26337: ifle -> 26351
    //   26340: ldc2_w 1961007820
    //   26343: l2i
    //   26344: ldc_w -886065840
    //   26347: ixor
    //   26348: goto -> 26359
    //   26351: ldc2_w -207426281
    //   26354: l2i
    //   26355: ldc_w -259188730
    //   26358: ixor
    //   26359: ldc2_w -709132814
    //   26362: l2i
    //   26363: ldc_w 1330272201
    //   26366: ixor
    //   26367: ixor
    //   26368: lookupswitch default -> 26396, -1573668091 -> 26351, 624690599 -> 37280
    //   26396: goto -> 26400
    //   26399: athrow
    //   26400: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   26403: goto -> 26407
    //   26406: athrow
    //   26407: getstatic Perryc.c : I
    //   26410: iflt -> 26424
    //   26413: ldc2_w -1176223064
    //   26416: l2i
    //   26417: ldc_w 210886176
    //   26420: ixor
    //   26421: goto -> 26432
    //   26424: ldc2_w -1267027095
    //   26427: l2i
    //   26428: ldc_w -336421806
    //   26431: ixor
    //   26432: ldc2_w 43080054
    //   26435: l2i
    //   26436: ldc_w 1213904132
    //   26439: ixor
    //   26440: ixor
    //   26441: lookupswitch default -> 26468, -4296454 -> 37608, 1338420603 -> 26424
    //   26468: goto -> 26472
    //   26471: athrow
    //   26472: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   26475: goto -> 26479
    //   26478: athrow
    //   26479: getstatic Perryc.0 : I
    //   26482: ifle -> 26496
    //   26485: ldc2_w 1704131464
    //   26488: l2i
    //   26489: ldc_w 680866069
    //   26492: ixor
    //   26493: goto -> 26504
    //   26496: ldc2_w -163474431
    //   26499: l2i
    //   26500: ldc_w 678758211
    //   26503: ixor
    //   26504: ldc2_w -341921848
    //   26507: l2i
    //   26508: ldc_w -1527821154
    //   26511: ixor
    //   26512: ixor
    //   26513: lookupswitch default -> 26540, -1497233610 -> 26496, 41298379 -> 37908
    //   26540: goto -> 26544
    //   26543: athrow
    //   26544: invokevirtual isEnabled : ()Z
    //   26547: goto -> 26551
    //   26550: athrow
    //   26551: ifeq -> 26565
    //   26554: ldc2_w 619282594
    //   26557: l2i
    //   26558: ldc_w 727792320
    //   26561: ixor
    //   26562: goto -> 26573
    //   26565: ldc2_w 1772165833
    //   26568: l2i
    //   26569: ldc_w 1714004136
    //   26572: ixor
    //   26573: ldc2_w 735993829
    //   26576: l2i
    //   26577: ldc_w 1814656538
    //   26580: ixor
    //   26581: ixor
    //   26582: tableswitch default -> 26554, 1216320413 -> 26604, 1216320414 -> 31851
    //   26604: getstatic Perryc.c : I
    //   26607: iflt -> 26621
    //   26610: ldc2_w -533790145
    //   26613: l2i
    //   26614: ldc_w -1071601651
    //   26617: ixor
    //   26618: goto -> 26629
    //   26621: ldc2_w 1520043243
    //   26624: l2i
    //   26625: ldc_w 1485569789
    //   26628: ixor
    //   26629: ldc2_w 1751557232
    //   26632: l2i
    //   26633: ldc_w -1340069774
    //   26636: ixor
    //   26637: ixor
    //   26638: lookupswitch default -> 37370, -631802348 -> 26664, -129423824 -> 26621
    //   26664: goto -> 26668
    //   26667: athrow
    //   26668: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   26671: goto -> 26675
    //   26674: athrow
    //   26675: getstatic Perryc.1 : I
    //   26678: ifeq -> 26692
    //   26681: ldc2_w -1843861051
    //   26684: l2i
    //   26685: ldc_w -929633214
    //   26688: ixor
    //   26689: goto -> 26700
    //   26692: ldc2_w 840806798
    //   26695: l2i
    //   26696: ldc_w -22771421
    //   26699: ixor
    //   26700: ldc2_w -1709293109
    //   26703: l2i
    //   26704: ldc_w -1251798491
    //   26707: ixor
    //   26708: ixor
    //   26709: lookupswitch default -> 37190, -473666749 -> 26736, 1978881641 -> 26692
    //   26736: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26739: getstatic Perryc.c : I
    //   26742: iflt -> 26756
    //   26745: ldc2_w -1737709411
    //   26748: l2i
    //   26749: ldc_w -1336450074
    //   26752: ixor
    //   26753: goto -> 26764
    //   26756: ldc2_w -973246728
    //   26759: l2i
    //   26760: ldc_w 401019315
    //   26763: ixor
    //   26764: ldc2_w -1609344043
    //   26767: l2i
    //   26768: ldc_w 928866961
    //   26771: ixor
    //   26772: ixor
    //   26773: lookupswitch default -> 26800, -1082789313 -> 37704, 713159784 -> 26756
    //   26800: goto -> 26804
    //   26803: athrow
    //   26804: invokevirtual getValue : ()Ljava/lang/Object;
    //   26807: goto -> 26811
    //   26810: athrow
    //   26811: checkcast java/lang/Boolean
    //   26814: getstatic Perryc.1 : I
    //   26817: ifeq -> 26831
    //   26820: ldc2_w -2071543085
    //   26823: l2i
    //   26824: ldc_w 935424686
    //   26827: ixor
    //   26828: goto -> 26839
    //   26831: ldc2_w -543402930
    //   26834: l2i
    //   26835: ldc_w -722698304
    //   26838: ixor
    //   26839: ldc2_w -871088892
    //   26842: l2i
    //   26843: ldc_w 1551145789
    //   26846: ixor
    //   26847: ixor
    //   26848: lookupswitch default -> 37570, -1693413961 -> 26876, 589764164 -> 26831
    //   26876: goto -> 26880
    //   26879: athrow
    //   26880: invokevirtual booleanValue : ()Z
    //   26883: goto -> 26887
    //   26886: athrow
    //   26887: ifeq -> 26901
    //   26890: ldc2_w -151242831
    //   26893: l2i
    //   26894: ldc_w -1864830857
    //   26897: ixor
    //   26898: goto -> 26909
    //   26901: ldc2_w -1745200951
    //   26904: l2i
    //   26905: ldc_w -237068530
    //   26908: ixor
    //   26909: ldc2_w 1678361039
    //   26912: l2i
    //   26913: ldc_w 999839635
    //   26916: ixor
    //   26917: ixor
    //   26918: tableswitch default -> 26890, 968184218 -> 26940, 968184219 -> 31158
    //   26940: getstatic Perryc.1 : I
    //   26943: ifeq -> 26957
    //   26946: ldc2_w -835848790
    //   26949: l2i
    //   26950: ldc_w -1381853710
    //   26953: ixor
    //   26954: goto -> 26965
    //   26957: ldc2_w -1770791923
    //   26960: l2i
    //   26961: ldc_w -48276167
    //   26964: ixor
    //   26965: ldc2_w -1634837408
    //   26968: l2i
    //   26969: ldc_w 122727584
    //   26972: ixor
    //   26973: ixor
    //   26974: lookupswitch default -> 27000, -170323833 -> 26957, -95317864 -> 37430
    //   27000: goto -> 27004
    //   27003: athrow
    //   27004: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   27007: goto -> 27011
    //   27010: athrow
    //   27011: getstatic Perryc.0 : I
    //   27014: ifle -> 27028
    //   27017: ldc2_w -1061883699
    //   27020: l2i
    //   27021: ldc_w 122008700
    //   27024: ixor
    //   27025: goto -> 27036
    //   27028: ldc2_w -1881935735
    //   27031: l2i
    //   27032: ldc_w 2128928045
    //   27035: ixor
    //   27036: ldc2_w 1991027965
    //   27039: l2i
    //   27040: ldc_w -1289972302
    //   27043: ixor
    //   27044: ixor
    //   27045: lookupswitch default -> 37448, 37846526 -> 27028, 881267947 -> 27072
    //   27072: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27075: getstatic Perryc.c : I
    //   27078: iflt -> 27092
    //   27081: ldc2_w 1701328755
    //   27084: l2i
    //   27085: ldc_w -782749724
    //   27088: ixor
    //   27089: goto -> 27100
    //   27092: ldc2_w -1639665433
    //   27095: l2i
    //   27096: ldc_w -2145739228
    //   27099: ixor
    //   27100: ldc2_w 586532554
    //   27103: l2i
    //   27104: ldc_w 875481213
    //   27107: ixor
    //   27108: ixor
    //   27109: lookupswitch default -> 38118, -1561651680 -> 27092, 142942324 -> 27136
    //   27136: goto -> 27140
    //   27139: athrow
    //   27140: invokevirtual getValue : ()Ljava/lang/Object;
    //   27143: goto -> 27147
    //   27146: athrow
    //   27147: getstatic Perryc.c : I
    //   27150: iflt -> 27164
    //   27153: ldc2_w -1745564544
    //   27156: l2i
    //   27157: ldc_w -1282007163
    //   27160: ixor
    //   27161: goto -> 27172
    //   27164: ldc2_w 2032192249
    //   27167: l2i
    //   27168: ldc_w 1706705028
    //   27171: ixor
    //   27172: ldc2_w -137007270
    //   27175: l2i
    //   27176: ldc_w -1268234602
    //   27179: ixor
    //   27180: ixor
    //   27181: lookupswitch default -> 27208, 134905751 -> 27164, 1742731977 -> 37584
    //   27208: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   27211: if_acmpne -> 27225
    //   27214: ldc2_w -1001242669
    //   27217: l2i
    //   27218: ldc_w 1334652796
    //   27221: ixor
    //   27222: goto -> 27233
    //   27225: ldc2_w -1227266920
    //   27228: l2i
    //   27229: ldc_w 1023833142
    //   27232: ixor
    //   27233: ldc2_w -1567182016
    //   27236: l2i
    //   27237: ldc_w -1816183857
    //   27240: ixor
    //   27241: ixor
    //   27242: tableswitch default -> 27214, -1158244320 -> 27264, -1158244319 -> 28262
    //   27264: getstatic Perryc.c : I
    //   27267: iflt -> 27281
    //   27270: ldc2_w -1746023044
    //   27273: l2i
    //   27274: ldc_w -60541321
    //   27277: ixor
    //   27278: goto -> 27289
    //   27281: ldc2_w -161063286
    //   27284: l2i
    //   27285: ldc_w -900750970
    //   27288: ixor
    //   27289: ldc2_w 1640523120
    //   27292: l2i
    //   27293: ldc_w -2111295833
    //   27296: ixor
    //   27297: ixor
    //   27298: lookupswitch default -> 38014, -2006339364 -> 27281, -540429093 -> 27324
    //   27324: aload_0
    //   27325: getstatic Perryc.1 : I
    //   27328: ifeq -> 27342
    //   27331: ldc2_w -1733220317
    //   27334: l2i
    //   27335: ldc_w 1895168250
    //   27338: ixor
    //   27339: goto -> 27350
    //   27342: ldc2_w 96267166
    //   27345: l2i
    //   27346: ldc_w 525564130
    //   27349: ixor
    //   27350: ldc2_w 927886333
    //   27353: l2i
    //   27354: ldc_w -2032855280
    //   27357: ixor
    //   27358: ixor
    //   27359: lookupswitch default -> 27384, 988293470 -> 27342, 1507830836 -> 37554
    //   27384: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   27387: getstatic Perryc.0 : I
    //   27390: ifle -> 27404
    //   27393: ldc2_w 977862202
    //   27396: l2i
    //   27397: ldc_w -108109563
    //   27400: ixor
    //   27401: goto -> 27412
    //   27404: ldc2_w -861001699
    //   27407: l2i
    //   27408: ldc_w -420533513
    //   27411: ixor
    //   27412: ldc2_w 776250383
    //   27415: l2i
    //   27416: ldc_w -1940322011
    //   27419: ixor
    //   27420: ixor
    //   27421: lookupswitch default -> 27448, -1681100076 -> 27404, 1641755157 -> 37542
    //   27448: aload #5
    //   27450: ldc_w 1.1764488E38
    //   27453: invokestatic floatToIntBits : (F)I
    //   27456: ldc_w 2125529897
    //   27459: ixor
    //   27460: invokestatic intBitsToFloat : (I)F
    //   27463: getstatic Perryc.0 : I
    //   27466: ifle -> 27480
    //   27469: ldc2_w -1405874207
    //   27472: l2i
    //   27473: ldc_w 1102906179
    //   27476: ixor
    //   27477: goto -> 27488
    //   27480: ldc2_w -1826296629
    //   27483: l2i
    //   27484: ldc_w -427550024
    //   27487: ixor
    //   27488: ldc2_w 1881738012
    //   27491: l2i
    //   27492: ldc_w -1116522004
    //   27495: ixor
    //   27496: ixor
    //   27497: lookupswitch default -> 27524, 343452467 -> 27480, 550714962 -> 38128
    //   27524: aload_0
    //   27525: getstatic Perryc.c : I
    //   27528: iflt -> 27542
    //   27531: ldc2_w -1035821068
    //   27534: l2i
    //   27535: ldc_w 840174350
    //   27538: ixor
    //   27539: goto -> 27550
    //   27542: ldc2_w -1546770159
    //   27545: l2i
    //   27546: ldc_w 1611681654
    //   27549: ixor
    //   27550: ldc2_w 1868972845
    //   27553: l2i
    //   27554: ldc_w 893700718
    //   27557: ixor
    //   27558: ixor
    //   27559: lookupswitch default -> 37500, -1711476956 -> 27584, -1435230791 -> 27542
    //   27584: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27587: getstatic Perryc.0 : I
    //   27590: ifle -> 27604
    //   27593: ldc2_w -883955662
    //   27596: l2i
    //   27597: ldc_w 1651510244
    //   27600: ixor
    //   27601: goto -> 27612
    //   27604: ldc2_w -489563907
    //   27607: l2i
    //   27608: ldc_w -913710606
    //   27611: ixor
    //   27612: ldc2_w -1398309237
    //   27615: l2i
    //   27616: ldc_w -645464242
    //   27619: ixor
    //   27620: ixor
    //   27621: lookupswitch default -> 37456, -601988589 -> 27604, 1585035466 -> 27648
    //   27648: goto -> 27652
    //   27651: athrow
    //   27652: invokevirtual getValue : ()Ljava/lang/Object;
    //   27655: goto -> 27659
    //   27658: athrow
    //   27659: checkcast java/lang/Integer
    //   27662: getstatic Perryc.1 : I
    //   27665: ifeq -> 27679
    //   27668: ldc2_w -2045753303
    //   27671: l2i
    //   27672: ldc_w 923503597
    //   27675: ixor
    //   27676: goto -> 27687
    //   27679: ldc2_w -1082052961
    //   27682: l2i
    //   27683: ldc_w 1393727189
    //   27686: ixor
    //   27687: ldc2_w -925154502
    //   27690: l2i
    //   27691: ldc_w 1096020100
    //   27694: ixor
    //   27695: ixor
    //   27696: lookupswitch default -> 37794, 949186682 -> 27679, 1696271348 -> 27724
    //   27724: goto -> 27728
    //   27727: athrow
    //   27728: invokevirtual intValue : ()I
    //   27731: goto -> 27735
    //   27734: athrow
    //   27735: i2f
    //   27736: ldc_w 0.025009958
    //   27739: invokestatic floatToIntBits : (F)I
    //   27742: ldc_w 2104287663
    //   27745: ixor
    //   27746: invokestatic intBitsToFloat : (I)F
    //   27749: fadd
    //   27750: getstatic Perryc.1 : I
    //   27753: ifeq -> 27767
    //   27756: ldc2_w -2049313708
    //   27759: l2i
    //   27760: ldc_w -268273612
    //   27763: ixor
    //   27764: goto -> 27775
    //   27767: ldc2_w -1831283940
    //   27770: l2i
    //   27771: ldc_w -577351644
    //   27774: ixor
    //   27775: ldc2_w 378607937
    //   27778: l2i
    //   27779: ldc_w -1830123894
    //   27782: ixor
    //   27783: ixor
    //   27784: lookupswitch default -> 27812, -241167445 -> 37172, 778307718 -> 27767
    //   27812: goto -> 27816
    //   27815: athrow
    //   27816: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   27819: goto -> 27823
    //   27822: athrow
    //   27823: getstatic Perryc.c : I
    //   27826: iflt -> 27840
    //   27829: ldc2_w -1631335736
    //   27832: l2i
    //   27833: ldc_w 2048274830
    //   27836: ixor
    //   27837: goto -> 27848
    //   27840: ldc2_w -1378014118
    //   27843: l2i
    //   27844: ldc_w -1135927059
    //   27847: ixor
    //   27848: ldc2_w 771185159
    //   27851: l2i
    //   27852: ldc_w 1460001438
    //   27855: ixor
    //   27856: ixor
    //   27857: lookupswitch default -> 38172, -1641579553 -> 27840, 1801751598 -> 27884
    //   27884: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27887: getstatic Perryc.c : I
    //   27890: iflt -> 27904
    //   27893: ldc2_w -875845305
    //   27896: l2i
    //   27897: ldc_w -607217359
    //   27900: ixor
    //   27901: goto -> 27912
    //   27904: ldc2_w -29421837
    //   27907: l2i
    //   27908: ldc_w -623997140
    //   27911: ixor
    //   27912: ldc2_w 817714089
    //   27915: l2i
    //   27916: ldc_w -1210996549
    //   27919: ixor
    //   27920: ixor
    //   27921: lookupswitch default -> 27948, -1871116370 -> 27904, -1754674332 -> 37660
    //   27948: goto -> 27952
    //   27951: athrow
    //   27952: invokevirtual getValue : ()Ljava/lang/Object;
    //   27955: goto -> 27959
    //   27958: athrow
    //   27959: checkcast java/lang/Integer
    //   27962: getstatic Perryc.0 : I
    //   27965: ifle -> 27979
    //   27968: ldc2_w 1070043629
    //   27971: l2i
    //   27972: ldc_w -1942565982
    //   27975: ixor
    //   27976: goto -> 27987
    //   27979: ldc2_w 267938789
    //   27982: l2i
    //   27983: ldc_w 1199692124
    //   27986: ixor
    //   27987: ldc2_w 1047755980
    //   27990: l2i
    //   27991: ldc_w -1856554318
    //   27994: ixor
    //   27995: ixor
    //   27996: lookupswitch default -> 37878, -413272889 -> 28024, 483728433 -> 27979
    //   28024: goto -> 28028
    //   28027: athrow
    //   28028: invokevirtual intValue : ()I
    //   28031: goto -> 28035
    //   28034: athrow
    //   28035: getstatic Perryc.c : I
    //   28038: iflt -> 28052
    //   28041: ldc2_w -1018595342
    //   28044: l2i
    //   28045: ldc_w 581759509
    //   28048: ixor
    //   28049: goto -> 28060
    //   28052: ldc2_w -587921553
    //   28055: l2i
    //   28056: ldc_w -1751592893
    //   28059: ixor
    //   28060: ldc2_w -1660047234
    //   28063: l2i
    //   28064: ldc_w 594229185
    //   28067: ixor
    //   28068: ixor
    //   28069: lookupswitch default -> 28096, 1602421336 -> 37194, 1942166724 -> 28052
    //   28096: goto -> 28100
    //   28099: athrow
    //   28100: invokestatic rainbow : (I)Ljava/awt/Color;
    //   28103: goto -> 28107
    //   28106: athrow
    //   28107: getstatic Perryc.0 : I
    //   28110: ifle -> 28124
    //   28113: ldc2_w 1088869274
    //   28116: l2i
    //   28117: ldc_w -1445835275
    //   28120: ixor
    //   28121: goto -> 28132
    //   28124: ldc2_w -62166159
    //   28127: l2i
    //   28128: ldc_w 1922263437
    //   28131: ixor
    //   28132: ldc2_w 490406741
    //   28135: l2i
    //   28136: ldc_w 699008932
    //   28139: ixor
    //   28140: ixor
    //   28141: lookupswitch default -> 37298, -1169619443 -> 28168, -576349538 -> 28124
    //   28168: goto -> 28172
    //   28171: athrow
    //   28172: invokevirtual getRGB : ()I
    //   28175: goto -> 28179
    //   28178: athrow
    //   28179: ldc2_w -486417652
    //   28182: l2i
    //   28183: ldc_w -486417651
    //   28186: ixor
    //   28187: getstatic Perryc.1 : I
    //   28190: ifeq -> 28204
    //   28193: ldc2_w -249726987
    //   28196: l2i
    //   28197: ldc_w -875341039
    //   28200: ixor
    //   28201: goto -> 28212
    //   28204: ldc2_w 760083363
    //   28207: l2i
    //   28208: ldc_w -1025508256
    //   28211: ixor
    //   28212: ldc2_w -1404365928
    //   28215: l2i
    //   28216: ldc_w -959328360
    //   28219: ixor
    //   28220: ixor
    //   28221: lookupswitch default -> 28248, 1347743972 -> 37288, 2115532580 -> 28204
    //   28248: goto -> 28252
    //   28251: athrow
    //   28252: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   28255: goto -> 28259
    //   28258: athrow
    //   28259: goto -> 31851
    //   28262: ldc2_w -814199511
    //   28265: l2i
    //   28266: ldc_w -814199512
    //   28269: ixor
    //   28270: newarray int
    //   28272: dup
    //   28273: ldc2_w 1181179053
    //   28276: l2i
    //   28277: ldc_w 1181179053
    //   28280: ixor
    //   28281: ldc2_w -1642715008
    //   28284: l2i
    //   28285: ldc_w -1642715007
    //   28288: ixor
    //   28289: iastore
    //   28290: getstatic Perryc.c : I
    //   28293: iflt -> 28307
    //   28296: ldc2_w 1655546529
    //   28299: l2i
    //   28300: ldc_w 849734751
    //   28303: ixor
    //   28304: goto -> 28315
    //   28307: ldc2_w -844195263
    //   28310: l2i
    //   28311: ldc_w 1358218719
    //   28314: ixor
    //   28315: ldc2_w 918727431
    //   28318: l2i
    //   28319: ldc_w 452148578
    //   28322: ixor
    //   28323: ixor
    //   28324: lookupswitch default -> 28352, 168677573 -> 28307, 2084165787 -> 37234
    //   28352: astore #7
    //   28354: getstatic Perryc.0 : I
    //   28357: ifle -> 28371
    //   28360: ldc2_w 1407859505
    //   28363: l2i
    //   28364: ldc_w 1768115327
    //   28367: ixor
    //   28368: goto -> 28379
    //   28371: ldc2_w 1568492880
    //   28374: l2i
    //   28375: ldc_w -1170298794
    //   28378: ixor
    //   28379: ldc2_w 131518601
    //   28382: l2i
    //   28383: ldc_w -56828083
    //   28386: ixor
    //   28387: ixor
    //   28388: lookupswitch default -> 28416, -1044154230 -> 38144, -1005118109 -> 28371
    //   28416: aload #5
    //   28418: getstatic Perryc.1 : I
    //   28421: ifeq -> 28435
    //   28424: ldc2_w -12092729
    //   28427: l2i
    //   28428: ldc_w 831253569
    //   28431: ixor
    //   28432: goto -> 28443
    //   28435: ldc2_w -1264813399
    //   28438: l2i
    //   28439: ldc_w 1191820377
    //   28442: ixor
    //   28443: ldc2_w -1900053414
    //   28446: l2i
    //   28447: ldc_w -339857829
    //   28450: ixor
    //   28451: ixor
    //   28452: lookupswitch default -> 28480, -1412578169 -> 37322, 1789157531 -> 28435
    //   28480: goto -> 28484
    //   28483: athrow
    //   28484: invokevirtual toCharArray : ()[C
    //   28487: goto -> 28491
    //   28490: athrow
    //   28491: getstatic Perryc.1 : I
    //   28494: ifeq -> 28508
    //   28497: ldc2_w 1548254794
    //   28500: l2i
    //   28501: ldc_w -906285163
    //   28504: ixor
    //   28505: goto -> 28516
    //   28508: ldc2_w 1966546112
    //   28511: l2i
    //   28512: ldc_w -135386241
    //   28515: ixor
    //   28516: ldc2_w -1143089911
    //   28519: l2i
    //   28520: ldc_w -851278518
    //   28523: ixor
    //   28524: ixor
    //   28525: lookupswitch default -> 28552, -483655268 -> 37308, -134746236 -> 28508
    //   28552: astore #8
    //   28554: ldc_w 2.9687625E38
    //   28557: invokestatic floatToIntBits : (F)I
    //   28560: ldc_w 2136954953
    //   28563: ixor
    //   28564: invokestatic intBitsToFloat : (I)F
    //   28567: getstatic Perryc.c : I
    //   28570: iflt -> 28584
    //   28573: ldc2_w 106032395
    //   28576: l2i
    //   28577: ldc_w -1294020982
    //   28580: ixor
    //   28581: goto -> 28592
    //   28584: ldc2_w -1410043652
    //   28587: l2i
    //   28588: ldc_w -229776685
    //   28591: ixor
    //   28592: ldc2_w 79224238
    //   28595: l2i
    //   28596: ldc_w -668252714
    //   28599: ixor
    //   28600: ixor
    //   28601: lookupswitch default -> 28628, -104121357 -> 28584, 1746713593 -> 37592
    //   28628: fstore #9
    //   28630: getstatic Perryc.c : I
    //   28633: iflt -> 28647
    //   28636: ldc2_w -1121781423
    //   28639: l2i
    //   28640: ldc_w 1538238943
    //   28643: ixor
    //   28644: goto -> 28655
    //   28647: ldc2_w -489417144
    //   28650: l2i
    //   28651: ldc_w 1032344227
    //   28654: ixor
    //   28655: ldc2_w 784543229
    //   28658: l2i
    //   28659: ldc_w 1991270048
    //   28662: ixor
    //   28663: ixor
    //   28664: lookupswitch default -> 37814, -2026948682 -> 28692, -1090640941 -> 28647
    //   28692: aload #8
    //   28694: getstatic Perryc.1 : I
    //   28697: ifeq -> 28711
    //   28700: ldc2_w -865974762
    //   28703: l2i
    //   28704: ldc_w 909841646
    //   28707: ixor
    //   28708: goto -> 28719
    //   28711: ldc2_w 622658793
    //   28714: l2i
    //   28715: ldc_w 1869353054
    //   28718: ixor
    //   28719: ldc2_w 653605413
    //   28722: l2i
    //   28723: ldc_w -1271976263
    //   28726: ixor
    //   28727: ixor
    //   28728: lookupswitch default -> 38100, -659881941 -> 28756, 1753433700 -> 28711
    //   28756: astore #10
    //   28758: getstatic Perryc.c : I
    //   28761: iflt -> 28775
    //   28764: ldc2_w -89730901
    //   28767: l2i
    //   28768: ldc_w 710075404
    //   28771: ixor
    //   28772: goto -> 28783
    //   28775: ldc2_w -878794955
    //   28778: l2i
    //   28779: ldc_w -92392617
    //   28782: ixor
    //   28783: ldc2_w 1802512782
    //   28786: l2i
    //   28787: ldc_w 1516340576
    //   28790: ixor
    //   28791: ixor
    //   28792: lookupswitch default -> 37418, -505046967 -> 28775, 15808652 -> 28820
    //   28820: aload #10
    //   28822: arraylength
    //   28823: getstatic Perryc.0 : I
    //   28826: ifle -> 28840
    //   28829: ldc2_w 926516072
    //   28832: l2i
    //   28833: ldc_w -1142537878
    //   28836: ixor
    //   28837: goto -> 28848
    //   28840: ldc2_w -1536300602
    //   28843: l2i
    //   28844: ldc_w 1649980532
    //   28847: ixor
    //   28848: ldc2_w -544139050
    //   28851: l2i
    //   28852: ldc_w -322503086
    //   28855: ixor
    //   28856: ixor
    //   28857: lookupswitch default -> 37962, -1081596794 -> 28840, -178078922 -> 28884
    //   28884: istore #11
    //   28886: ldc2_w -693749508
    //   28889: l2i
    //   28890: ldc_w -693749508
    //   28893: ixor
    //   28894: getstatic Perryc.0 : I
    //   28897: ifle -> 28911
    //   28900: ldc2_w -1063845295
    //   28903: l2i
    //   28904: ldc_w -1508656391
    //   28907: ixor
    //   28908: goto -> 28919
    //   28911: ldc2_w 923192390
    //   28914: l2i
    //   28915: ldc_w -2011450263
    //   28918: ixor
    //   28919: ldc2_w -1924711775
    //   28922: l2i
    //   28923: ldc_w -140576890
    //   28926: ixor
    //   28927: ixor
    //   28928: lookupswitch default -> 37180, -976964344 -> 28956, 475886991 -> 28911
    //   28956: istore #12
    //   28958: getstatic Perryc.0 : I
    //   28961: ifle -> 28975
    //   28964: ldc2_w -1348971459
    //   28967: l2i
    //   28968: ldc_w -676868217
    //   28971: ixor
    //   28972: goto -> 28983
    //   28975: ldc2_w 1490620913
    //   28978: l2i
    //   28979: ldc_w -1677556726
    //   28982: ixor
    //   28983: ldc2_w -105409608
    //   28986: l2i
    //   28987: ldc_w -1928577058
    //   28990: ixor
    //   28991: ixor
    //   28992: lookupswitch default -> 37612, -1335871075 -> 29020, 209991644 -> 28975
    //   29020: iload #12
    //   29022: getstatic Perryc.c : I
    //   29025: iflt -> 29039
    //   29028: ldc2_w -1148248698
    //   29031: l2i
    //   29032: ldc_w 1143437470
    //   29035: ixor
    //   29036: goto -> 29047
    //   29039: ldc2_w 2133969399
    //   29042: l2i
    //   29043: ldc_w 2041420898
    //   29046: ixor
    //   29047: ldc2_w 1682686282
    //   29050: l2i
    //   29051: ldc_w -132444266
    //   29054: ixor
    //   29055: ixor
    //   29056: lookupswitch default -> 29084, -481270806 -> 29039, 1677241284 -> 37324
    //   29084: iload #11
    //   29086: if_icmpge -> 29100
    //   29089: ldc2_w -2009489065
    //   29092: l2i
    //   29093: ldc_w 734374295
    //   29096: ixor
    //   29097: goto -> 29108
    //   29100: ldc2_w 1899722821
    //   29103: l2i
    //   29104: ldc_w -758681470
    //   29107: ixor
    //   29108: ldc2_w 1134922801
    //   29111: l2i
    //   29112: ldc_w 830125538
    //   29115: ixor
    //   29116: ixor
    //   29117: tableswitch default -> 29089, -786222829 -> 29140, -786222828 -> 31155
    //   29140: getstatic Perryc.0 : I
    //   29143: ifle -> 29157
    //   29146: ldc2_w -766326906
    //   29149: l2i
    //   29150: ldc_w -359524917
    //   29153: ixor
    //   29154: goto -> 29165
    //   29157: ldc2_w 641379341
    //   29160: l2i
    //   29161: ldc_w 747879328
    //   29164: ixor
    //   29165: ldc2_w 631384498
    //   29168: l2i
    //   29169: ldc_w -485157546
    //   29172: ixor
    //   29173: ixor
    //   29174: lookupswitch default -> 29200, -860401704 -> 29157, -25694551 -> 37730
    //   29200: aload #10
    //   29202: getstatic Perryc.0 : I
    //   29205: ifle -> 29219
    //   29208: ldc2_w 1763258340
    //   29211: l2i
    //   29212: ldc_w -103640140
    //   29215: ixor
    //   29216: goto -> 29227
    //   29219: ldc2_w 1519342484
    //   29222: l2i
    //   29223: ldc_w -42678831
    //   29226: ixor
    //   29227: ldc2_w 500970116
    //   29230: l2i
    //   29231: ldc_w 323079068
    //   29234: ixor
    //   29235: ixor
    //   29236: lookupswitch default -> 29264, -1638513336 -> 37486, 1257443179 -> 29219
    //   29264: iload #12
    //   29266: caload
    //   29267: getstatic Perryc.0 : I
    //   29270: ifle -> 29284
    //   29273: ldc2_w 1336854979
    //   29276: l2i
    //   29277: ldc_w -95045301
    //   29280: ixor
    //   29281: goto -> 29292
    //   29284: ldc2_w 1176792070
    //   29287: l2i
    //   29288: ldc_w -294908398
    //   29291: ixor
    //   29292: ldc2_w -1353030609
    //   29295: l2i
    //   29296: ldc_w 407898325
    //   29299: ixor
    //   29300: ixor
    //   29301: lookupswitch default -> 38160, 49355890 -> 29284, 524422894 -> 29328
    //   29328: istore #13
    //   29330: getstatic Perryc.0 : I
    //   29333: ifle -> 29347
    //   29336: ldc2_w 489373467
    //   29339: l2i
    //   29340: ldc_w -542362461
    //   29343: ixor
    //   29344: goto -> 29355
    //   29347: ldc2_w -428669295
    //   29350: l2i
    //   29351: ldc_w 540077296
    //   29354: ixor
    //   29355: ldc2_w 2049679267
    //   29358: l2i
    //   29359: ldc_w 387011862
    //   29362: ixor
    //   29363: ixor
    //   29364: lookupswitch default -> 37344, -1418125100 -> 29392, -1346518771 -> 29347
    //   29392: aload_0
    //   29393: getstatic Perryc.1 : I
    //   29396: ifeq -> 29410
    //   29399: ldc2_w 1720886457
    //   29402: l2i
    //   29403: ldc_w 1629484188
    //   29406: ixor
    //   29407: goto -> 29418
    //   29410: ldc2_w 759532462
    //   29413: l2i
    //   29414: ldc_w -1645033184
    //   29417: ixor
    //   29418: ldc2_w 1086366196
    //   29421: l2i
    //   29422: ldc_w 105729742
    //   29425: ixor
    //   29426: ixor
    //   29427: lookupswitch default -> 37572, -163926604 -> 29452, 1090567967 -> 29410
    //   29452: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   29455: getstatic Perryc.c : I
    //   29458: iflt -> 29472
    //   29461: ldc2_w 1961820137
    //   29464: l2i
    //   29465: ldc_w 1762199088
    //   29468: ixor
    //   29469: goto -> 29480
    //   29472: ldc2_w -1072405521
    //   29475: l2i
    //   29476: ldc_w -26315345
    //   29479: ixor
    //   29480: ldc2_w -1666432426
    //   29483: l2i
    //   29484: ldc_w 1824603066
    //   29487: ixor
    //   29488: ixor
    //   29489: lookupswitch default -> 29516, -866696546 -> 29472, -309690315 -> 37480
    //   29516: iload #13
    //   29518: getstatic Perryc.0 : I
    //   29521: ifle -> 29535
    //   29524: ldc2_w 1973700311
    //   29527: l2i
    //   29528: ldc_w -1874971215
    //   29531: ixor
    //   29532: goto -> 29543
    //   29535: ldc2_w -1027742740
    //   29538: l2i
    //   29539: ldc_w 1992543063
    //   29542: ixor
    //   29543: ldc2_w -642108529
    //   29546: l2i
    //   29547: ldc_w 1329745527
    //   29550: ixor
    //   29551: ixor
    //   29552: lookupswitch default -> 29580, 801498934 -> 29535, 1935806110 -> 37552
    //   29580: goto -> 29584
    //   29583: athrow
    //   29584: invokestatic valueOf : (C)Ljava/lang/String;
    //   29587: goto -> 29591
    //   29590: athrow
    //   29591: ldc_w 3.016466E38
    //   29594: invokestatic floatToIntBits : (F)I
    //   29597: ldc_w 2137190150
    //   29600: ixor
    //   29601: invokestatic intBitsToFloat : (I)F
    //   29604: getstatic Perryc.1 : I
    //   29607: ifeq -> 29621
    //   29610: ldc2_w -2087167222
    //   29613: l2i
    //   29614: ldc_w -2115270235
    //   29617: ixor
    //   29618: goto -> 29629
    //   29621: ldc2_w 212662363
    //   29624: l2i
    //   29625: ldc_w 523882877
    //   29628: ixor
    //   29629: ldc2_w -853207829
    //   29632: l2i
    //   29633: ldc_w 1540081585
    //   29636: ixor
    //   29637: ixor
    //   29638: lookupswitch default -> 37732, -2055472516 -> 29664, -1801649675 -> 29621
    //   29664: fload #9
    //   29666: fadd
    //   29667: getstatic Perryc.1 : I
    //   29670: ifeq -> 29684
    //   29673: ldc2_w -1769479294
    //   29676: l2i
    //   29677: ldc_w 917912011
    //   29680: ixor
    //   29681: goto -> 29692
    //   29684: ldc2_w 1666996000
    //   29687: l2i
    //   29688: ldc_w 1390655941
    //   29691: ixor
    //   29692: ldc2_w 760650837
    //   29695: l2i
    //   29696: ldc_w -1768929519
    //   29699: ixor
    //   29700: ixor
    //   29701: lookupswitch default -> 29728, -230706265 -> 29684, 469172493 -> 37598
    //   29728: aload_0
    //   29729: getstatic Perryc.1 : I
    //   29732: ifeq -> 29746
    //   29735: ldc2_w 597022769
    //   29738: l2i
    //   29739: ldc_w 1077226516
    //   29742: ixor
    //   29743: goto -> 29754
    //   29746: ldc2_w 864465294
    //   29749: l2i
    //   29750: ldc_w -1472436073
    //   29753: ixor
    //   29754: ldc2_w -2092440624
    //   29757: l2i
    //   29758: ldc_w 1116264214
    //   29761: ixor
    //   29762: ixor
    //   29763: lookupswitch default -> 29788, -1569734429 -> 37886, -846249829 -> 29746
    //   29788: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   29791: getstatic Perryc.c : I
    //   29794: iflt -> 29808
    //   29797: ldc2_w 556175569
    //   29800: l2i
    //   29801: ldc_w -856205461
    //   29804: ixor
    //   29805: goto -> 29816
    //   29808: ldc2_w -1200908552
    //   29811: l2i
    //   29812: ldc_w -2016681266
    //   29815: ixor
    //   29816: ldc2_w -649892412
    //   29819: l2i
    //   29820: ldc_w -1227813527
    //   29823: ixor
    //   29824: ixor
    //   29825: lookupswitch default -> 29852, -2109495529 -> 38106, 1606328211 -> 29808
    //   29852: goto -> 29856
    //   29855: athrow
    //   29856: invokevirtual getValue : ()Ljava/lang/Object;
    //   29859: goto -> 29863
    //   29862: athrow
    //   29863: checkcast java/lang/Integer
    //   29866: getstatic Perryc.1 : I
    //   29869: ifeq -> 29883
    //   29872: ldc2_w -1375537857
    //   29875: l2i
    //   29876: ldc_w 2053523085
    //   29879: ixor
    //   29880: goto -> 29891
    //   29883: ldc2_w -1105945929
    //   29886: l2i
    //   29887: ldc_w -186264830
    //   29890: ixor
    //   29891: ldc2_w -887969162
    //   29894: l2i
    //   29895: ldc_w 1308370421
    //   29898: ixor
    //   29899: ixor
    //   29900: lookupswitch default -> 29928, 1384791089 -> 37618, 1607154424 -> 29883
    //   29928: goto -> 29932
    //   29931: athrow
    //   29932: invokevirtual intValue : ()I
    //   29935: goto -> 29939
    //   29938: athrow
    //   29939: i2f
    //   29940: ldc_w 0.8285771
    //   29943: invokestatic floatToIntBits : (F)I
    //   29946: ldc_w 2129927585
    //   29949: ixor
    //   29950: invokestatic intBitsToFloat : (I)F
    //   29953: fadd
    //   29954: getstatic Perryc.1 : I
    //   29957: ifeq -> 29971
    //   29960: ldc2_w 897924129
    //   29963: l2i
    //   29964: ldc_w -1675649043
    //   29967: ixor
    //   29968: goto -> 29979
    //   29971: ldc2_w 734069468
    //   29974: l2i
    //   29975: ldc_w 72050788
    //   29978: ixor
    //   29979: ldc2_w 2013193819
    //   29982: l2i
    //   29983: ldc_w 147341591
    //   29986: ixor
    //   29987: ixor
    //   29988: lookupswitch default -> 37880, -693369728 -> 29971, 1354550772 -> 30016
    //   30016: aload #7
    //   30018: ldc2_w -1687035510
    //   30021: l2i
    //   30022: ldc_w -1687035510
    //   30025: ixor
    //   30026: iaload
    //   30027: getstatic Perryc.0 : I
    //   30030: ifle -> 30044
    //   30033: ldc2_w 2035509675
    //   30036: l2i
    //   30037: ldc_w 2032182575
    //   30040: ixor
    //   30041: goto -> 30052
    //   30044: ldc2_w -1085907774
    //   30047: l2i
    //   30048: ldc_w 1055051212
    //   30051: ixor
    //   30052: ldc2_w 1555334250
    //   30055: l2i
    //   30056: ldc_w -1204432976
    //   30059: ixor
    //   30060: ixor
    //   30061: lookupswitch default -> 37752, -453867682 -> 30044, 1696979668 -> 30088
    //   30088: goto -> 30092
    //   30091: athrow
    //   30092: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   30095: goto -> 30099
    //   30098: athrow
    //   30099: getstatic Perryc.c : I
    //   30102: iflt -> 30116
    //   30105: ldc2_w -1278440492
    //   30108: l2i
    //   30109: ldc_w 375380892
    //   30112: ixor
    //   30113: goto -> 30124
    //   30116: ldc2_w 1954653150
    //   30119: l2i
    //   30120: ldc_w 1058728745
    //   30123: ixor
    //   30124: ldc2_w 760912720
    //   30127: l2i
    //   30128: ldc_w -2080450438
    //   30131: ixor
    //   30132: ixor
    //   30133: lookupswitch default -> 30160, -1626760736 -> 30116, 188158818 -> 37164
    //   30160: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   30163: getstatic Perryc.1 : I
    //   30166: ifeq -> 30180
    //   30169: ldc2_w -94834019
    //   30172: l2i
    //   30173: ldc_w -1616534116
    //   30176: ixor
    //   30177: goto -> 30188
    //   30180: ldc2_w 1746537042
    //   30183: l2i
    //   30184: ldc_w -1233810415
    //   30187: ixor
    //   30188: ldc2_w 468037410
    //   30191: l2i
    //   30192: ldc_w -1004381479
    //   30195: ixor
    //   30196: ixor
    //   30197: lookupswitch default -> 37416, -1170562310 -> 30180, 27816888 -> 30224
    //   30224: goto -> 30228
    //   30227: athrow
    //   30228: invokevirtual getValue : ()Ljava/lang/Object;
    //   30231: goto -> 30235
    //   30234: athrow
    //   30235: checkcast java/lang/Integer
    //   30238: getstatic Perryc.0 : I
    //   30241: ifle -> 30255
    //   30244: ldc2_w -1084485914
    //   30247: l2i
    //   30248: ldc_w -1126861031
    //   30251: ixor
    //   30252: goto -> 30263
    //   30255: ldc2_w 1009690771
    //   30258: l2i
    //   30259: ldc_w -1559150182
    //   30262: ixor
    //   30263: ldc2_w -1412994209
    //   30266: l2i
    //   30267: ldc_w 800190302
    //   30270: ixor
    //   30271: ixor
    //   30272: lookupswitch default -> 37442, -2013266434 -> 30255, 457796872 -> 30300
    //   30300: goto -> 30304
    //   30303: athrow
    //   30304: invokevirtual intValue : ()I
    //   30307: goto -> 30311
    //   30310: athrow
    //   30311: imul
    //   30312: getstatic Perryc.0 : I
    //   30315: ifle -> 30329
    //   30318: ldc2_w 189962849
    //   30321: l2i
    //   30322: ldc_w -148872973
    //   30325: ixor
    //   30326: goto -> 30337
    //   30329: ldc2_w -885695696
    //   30332: l2i
    //   30333: ldc_w -1216730319
    //   30336: ixor
    //   30337: ldc2_w -2108011397
    //   30340: l2i
    //   30341: ldc_w -417104282
    //   30344: ixor
    //   30345: ixor
    //   30346: lookupswitch default -> 37530, -1727281009 -> 30329, 422986268 -> 30372
    //   30372: goto -> 30376
    //   30375: athrow
    //   30376: invokestatic rainbow : (I)Ljava/awt/Color;
    //   30379: goto -> 30383
    //   30382: athrow
    //   30383: getstatic Perryc.1 : I
    //   30386: ifeq -> 30400
    //   30389: ldc2_w 1415183410
    //   30392: l2i
    //   30393: ldc_w -1252838112
    //   30396: ixor
    //   30397: goto -> 30408
    //   30400: ldc2_w 2143479235
    //   30403: l2i
    //   30404: ldc_w 206732981
    //   30407: ixor
    //   30408: ldc2_w -1249882322
    //   30411: l2i
    //   30412: ldc_w -1224692042
    //   30415: ixor
    //   30416: ixor
    //   30417: lookupswitch default -> 30444, -477484918 -> 37362, 404825593 -> 30400
    //   30444: goto -> 30448
    //   30447: athrow
    //   30448: invokevirtual getRGB : ()I
    //   30451: goto -> 30455
    //   30454: athrow
    //   30455: ldc2_w 1479585462
    //   30458: l2i
    //   30459: ldc_w 1479585463
    //   30462: ixor
    //   30463: getstatic Perryc.0 : I
    //   30466: ifle -> 30480
    //   30469: ldc2_w -554024909
    //   30472: l2i
    //   30473: ldc_w 22253032
    //   30476: ixor
    //   30477: goto -> 30488
    //   30480: ldc2_w 1854276480
    //   30483: l2i
    //   30484: ldc_w 197536286
    //   30487: ixor
    //   30488: ldc2_w 1651196378
    //   30491: l2i
    //   30492: ldc_w -349601246
    //   30495: ixor
    //   30496: ixor
    //   30497: lookupswitch default -> 30524, -2081970228 -> 30480, 1458245155 -> 37994
    //   30524: goto -> 30528
    //   30527: athrow
    //   30528: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   30531: goto -> 30535
    //   30534: athrow
    //   30535: getstatic Perryc.0 : I
    //   30538: ifle -> 30552
    //   30541: ldc2_w 1963030555
    //   30544: l2i
    //   30545: ldc_w 472735914
    //   30548: ixor
    //   30549: goto -> 30560
    //   30552: ldc2_w 2122541583
    //   30555: l2i
    //   30556: ldc_w 170943445
    //   30559: ixor
    //   30560: ldc2_w 1853145495
    //   30563: l2i
    //   30564: ldc_w -1999543829
    //   30567: ixor
    //   30568: ixor
    //   30569: lookupswitch default -> 30596, -1886799667 -> 37708, 524302934 -> 30552
    //   30596: fload #9
    //   30598: getstatic Perryc.1 : I
    //   30601: ifeq -> 30615
    //   30604: ldc2_w 1447191208
    //   30607: l2i
    //   30608: ldc_w 347227857
    //   30611: ixor
    //   30612: goto -> 30623
    //   30615: ldc2_w -747438717
    //   30618: l2i
    //   30619: ldc_w -386296268
    //   30622: ixor
    //   30623: ldc2_w 153089666
    //   30626: l2i
    //   30627: ldc_w 232606041
    //   30630: ixor
    //   30631: ixor
    //   30632: lookupswitch default -> 30660, -1478907993 -> 30615, 1177721762 -> 38030
    //   30660: aload_0
    //   30661: getstatic Perryc.0 : I
    //   30664: ifle -> 30678
    //   30667: ldc2_w 1478778268
    //   30670: l2i
    //   30671: ldc_w 105948393
    //   30674: ixor
    //   30675: goto -> 30686
    //   30678: ldc2_w -1991819962
    //   30681: l2i
    //   30682: ldc_w -1930260645
    //   30685: ixor
    //   30686: ldc2_w 1599009404
    //   30689: l2i
    //   30690: ldc_w -301157166
    //   30693: ixor
    //   30694: ixor
    //   30695: lookupswitch default -> 30720, -2093125516 -> 30678, -281624613 -> 37438
    //   30720: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   30723: getstatic Perryc.c : I
    //   30726: iflt -> 30740
    //   30729: ldc2_w -439634237
    //   30732: l2i
    //   30733: ldc_w 1481336186
    //   30736: ixor
    //   30737: goto -> 30748
    //   30740: ldc2_w -361510844
    //   30743: l2i
    //   30744: ldc_w -1769417554
    //   30747: ixor
    //   30748: ldc2_w -658828956
    //   30751: l2i
    //   30752: ldc_w 686556526
    //   30755: ixor
    //   30756: ixor
    //   30757: lookupswitch default -> 30784, -998001943 -> 30740, 1305986995 -> 37678
    //   30784: iload #13
    //   30786: getstatic Perryc.c : I
    //   30789: iflt -> 30803
    //   30792: ldc2_w 1967650354
    //   30795: l2i
    //   30796: ldc_w 857635499
    //   30799: ixor
    //   30800: goto -> 30811
    //   30803: ldc2_w -243605990
    //   30806: l2i
    //   30807: ldc_w 938003792
    //   30810: ixor
    //   30811: ldc2_w 394035382
    //   30814: l2i
    //   30815: ldc_w 807699130
    //   30818: ixor
    //   30819: ixor
    //   30820: lookupswitch default -> 38140, -506851002 -> 30848, 1627491989 -> 30803
    //   30848: goto -> 30852
    //   30851: athrow
    //   30852: invokestatic valueOf : (C)Ljava/lang/String;
    //   30855: goto -> 30859
    //   30858: athrow
    //   30859: getstatic Perryc.0 : I
    //   30862: ifle -> 30876
    //   30865: ldc2_w 2118688502
    //   30868: l2i
    //   30869: ldc_w -1106468822
    //   30872: ixor
    //   30873: goto -> 30884
    //   30876: ldc2_w 2127497760
    //   30879: l2i
    //   30880: ldc_w 1061328698
    //   30883: ixor
    //   30884: ldc2_w -1839811002
    //   30887: l2i
    //   30888: ldc_w 1838666573
    //   30891: ixor
    //   30892: ixor
    //   30893: lookupswitch default -> 37400, -1102252015 -> 30920, 1065704407 -> 30876
    //   30920: goto -> 30924
    //   30923: athrow
    //   30924: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   30927: goto -> 30931
    //   30930: athrow
    //   30931: i2f
    //   30932: fadd
    //   30933: getstatic Perryc.1 : I
    //   30936: ifeq -> 30950
    //   30939: ldc2_w -606317970
    //   30942: l2i
    //   30943: ldc_w 1570125254
    //   30946: ixor
    //   30947: goto -> 30958
    //   30950: ldc2_w -1386625990
    //   30953: l2i
    //   30954: ldc_w -986792563
    //   30957: ixor
    //   30958: ldc2_w 950913191
    //   30961: l2i
    //   30962: ldc_w -1082720583
    //   30965: ixor
    //   30966: ixor
    //   30967: lookupswitch default -> 30992, 26300854 -> 37384, 1203948278 -> 30950
    //   30992: fstore #9
    //   30994: getstatic Perryc.1 : I
    //   30997: ifeq -> 31011
    //   31000: ldc2_w -221822443
    //   31003: l2i
    //   31004: ldc_w -560575698
    //   31007: ixor
    //   31008: goto -> 31019
    //   31011: ldc2_w 2004805858
    //   31014: l2i
    //   31015: ldc_w 1859273780
    //   31018: ixor
    //   31019: ldc2_w -1010955626
    //   31022: l2i
    //   31023: ldc_w -805897760
    //   31026: ixor
    //   31027: ixor
    //   31028: lookupswitch default -> 31056, -507129384 -> 31011, 538573389 -> 37290
    //   31056: aload #7
    //   31058: ldc2_w 2073778991
    //   31061: l2i
    //   31062: ldc_w 2073778991
    //   31065: ixor
    //   31066: getstatic Perryc.1 : I
    //   31069: ifeq -> 31083
    //   31072: ldc2_w 111944397
    //   31075: l2i
    //   31076: ldc_w -2029592259
    //   31079: ixor
    //   31080: goto -> 31091
    //   31083: ldc2_w 1084312890
    //   31086: l2i
    //   31087: ldc_w 1052606958
    //   31090: ixor
    //   31091: ldc2_w 890990717
    //   31094: l2i
    //   31095: ldc_w -876570006
    //   31098: ixor
    //   31099: ixor
    //   31100: lookupswitch default -> 31128, 358598557 -> 31083, 2138122727 -> 38122
    //   31128: aload #7
    //   31130: ldc2_w -1966646361
    //   31133: l2i
    //   31134: ldc_w -1966646361
    //   31137: ixor
    //   31138: iaload
    //   31139: ldc2_w -644158854
    //   31142: l2i
    //   31143: ldc_w -644158853
    //   31146: ixor
    //   31147: iadd
    //   31148: iastore
    //   31149: iinc #12, 1
    //   31152: goto -> 28958
    //   31155: goto -> 31851
    //   31158: getstatic Perryc.0 : I
    //   31161: ifle -> 31175
    //   31164: ldc2_w -1525716870
    //   31167: l2i
    //   31168: ldc_w -1144657704
    //   31171: ixor
    //   31172: goto -> 31183
    //   31175: ldc2_w 90100335
    //   31178: l2i
    //   31179: ldc_w 1083615919
    //   31182: ixor
    //   31183: ldc2_w 992890272
    //   31186: l2i
    //   31187: ldc_w 1016875631
    //   31190: ixor
    //   31191: ixor
    //   31192: lookupswitch default -> 37818, 427329389 -> 31175, 1115324175 -> 31220
    //   31220: aload_0
    //   31221: getstatic Perryc.c : I
    //   31224: iflt -> 31238
    //   31227: ldc2_w 2091421476
    //   31230: l2i
    //   31231: ldc_w -703263091
    //   31234: ixor
    //   31235: goto -> 31246
    //   31238: ldc2_w 297565049
    //   31241: l2i
    //   31242: ldc_w -1455627
    //   31245: ixor
    //   31246: ldc2_w -1302366686
    //   31249: l2i
    //   31250: ldc_w 553079099
    //   31253: ixor
    //   31254: ixor
    //   31255: lookupswitch default -> 31280, 63166412 -> 31238, 940943024 -> 37988
    //   31280: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   31283: getstatic Perryc.1 : I
    //   31286: ifeq -> 31300
    //   31289: ldc2_w -296267308
    //   31292: l2i
    //   31293: ldc_w 321330227
    //   31296: ixor
    //   31297: goto -> 31308
    //   31300: ldc2_w -119253282
    //   31303: l2i
    //   31304: ldc_w -72521253
    //   31307: ixor
    //   31308: ldc2_w 2096297313
    //   31311: l2i
    //   31312: ldc_w -1623923302
    //   31315: ixor
    //   31316: ixor
    //   31317: lookupswitch default -> 37338, -527486978 -> 31344, 515267868 -> 31300
    //   31344: aload #5
    //   31346: ldc_w 2.8432223E38
    //   31349: invokestatic floatToIntBits : (F)I
    //   31352: ldc_w 2136335992
    //   31355: ixor
    //   31356: invokestatic intBitsToFloat : (I)F
    //   31359: getstatic Perryc.1 : I
    //   31362: ifeq -> 31376
    //   31365: ldc2_w 1716018473
    //   31368: l2i
    //   31369: ldc_w -577685782
    //   31372: ixor
    //   31373: goto -> 31384
    //   31376: ldc2_w 441204306
    //   31379: l2i
    //   31380: ldc_w 699835850
    //   31383: ixor
    //   31384: ldc2_w -758920338
    //   31387: l2i
    //   31388: ldc_w -914827200
    //   31391: ixor
    //   31392: ixor
    //   31393: lookupswitch default -> 37680, -1604159251 -> 31376, 675383478 -> 31420
    //   31420: aload_0
    //   31421: getstatic Perryc.0 : I
    //   31424: ifle -> 31438
    //   31427: ldc2_w -1299176202
    //   31430: l2i
    //   31431: ldc_w 373897825
    //   31434: ixor
    //   31435: goto -> 31446
    //   31438: ldc2_w -1241669136
    //   31441: l2i
    //   31442: ldc_w -1027436102
    //   31445: ixor
    //   31446: ldc2_w 2064463099
    //   31449: l2i
    //   31450: ldc_w -1764494064
    //   31453: ixor
    //   31454: ixor
    //   31455: lookupswitch default -> 37958, -1696468575 -> 31480, 1225252732 -> 31438
    //   31480: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   31483: getstatic Perryc.c : I
    //   31486: iflt -> 31500
    //   31489: ldc2_w 1842145440
    //   31492: l2i
    //   31493: ldc_w 1222697709
    //   31496: ixor
    //   31497: goto -> 31508
    //   31500: ldc2_w -716073607
    //   31503: l2i
    //   31504: ldc_w 2013021958
    //   31507: ixor
    //   31508: ldc2_w 667315720
    //   31511: l2i
    //   31512: ldc_w 1213653833
    //   31515: ixor
    //   31516: ixor
    //   31517: lookupswitch default -> 37538, -851615938 -> 31544, 1253869324 -> 31500
    //   31544: goto -> 31548
    //   31547: athrow
    //   31548: invokevirtual getValue : ()Ljava/lang/Object;
    //   31551: goto -> 31555
    //   31554: athrow
    //   31555: checkcast java/lang/Integer
    //   31558: getstatic Perryc.1 : I
    //   31561: ifeq -> 31575
    //   31564: ldc2_w -1224065390
    //   31567: l2i
    //   31568: ldc_w 1620922259
    //   31571: ixor
    //   31572: goto -> 31583
    //   31575: ldc2_w -1633383760
    //   31578: l2i
    //   31579: ldc_w 1857682343
    //   31582: ixor
    //   31583: ldc2_w -1855567385
    //   31586: l2i
    //   31587: ldc_w 1557417939
    //   31590: ixor
    //   31591: ixor
    //   31592: lookupswitch default -> 37236, 438662965 -> 31575, 1034909475 -> 31620
    //   31620: goto -> 31624
    //   31623: athrow
    //   31624: invokevirtual intValue : ()I
    //   31627: goto -> 31631
    //   31630: athrow
    //   31631: i2f
    //   31632: ldc_w 0.31333303
    //   31635: invokestatic floatToIntBits : (F)I
    //   31638: ldc_w 2130734384
    //   31641: ixor
    //   31642: invokestatic intBitsToFloat : (I)F
    //   31645: fadd
    //   31646: getstatic Perryc.1 : I
    //   31649: ifeq -> 31663
    //   31652: ldc2_w -1149330779
    //   31655: l2i
    //   31656: ldc_w 580448413
    //   31659: ixor
    //   31660: goto -> 31671
    //   31663: ldc2_w 1131173482
    //   31666: l2i
    //   31667: ldc_w -1898246149
    //   31670: ixor
    //   31671: ldc2_w -1569200514
    //   31674: l2i
    //   31675: ldc_w -386478452
    //   31678: ixor
    //   31679: ixor
    //   31680: lookupswitch default -> 38088, -2026475165 -> 31708, -748207414 -> 31663
    //   31708: aload_0
    //   31709: getstatic Perryc.c : I
    //   31712: iflt -> 31726
    //   31715: ldc2_w 1249176402
    //   31718: l2i
    //   31719: ldc_w -952591533
    //   31722: ixor
    //   31723: goto -> 31734
    //   31726: ldc2_w -1947665201
    //   31729: l2i
    //   31730: ldc_w 1420132930
    //   31733: ixor
    //   31734: ldc2_w -82999603
    //   31737: l2i
    //   31738: ldc_w 794476205
    //   31741: ixor
    //   31742: ixor
    //   31743: lookupswitch default -> 31768, -1098311788 -> 31726, 1494960225 -> 37224
    //   31768: getfield color : I
    //   31771: ldc2_w 1908425444
    //   31774: l2i
    //   31775: ldc_w 1908425445
    //   31778: ixor
    //   31779: getstatic Perryc.0 : I
    //   31782: ifle -> 31796
    //   31785: ldc2_w 1331984141
    //   31788: l2i
    //   31789: ldc_w -2054722528
    //   31792: ixor
    //   31793: goto -> 31804
    //   31796: ldc2_w -1482799268
    //   31799: l2i
    //   31800: ldc_w 1458720217
    //   31803: ixor
    //   31804: ldc2_w 1917909680
    //   31807: l2i
    //   31808: ldc_w -994225695
    //   31811: ixor
    //   31812: ixor
    //   31813: lookupswitch default -> 31840, -1964986165 -> 31796, 2081337468 -> 37212
    //   31840: goto -> 31844
    //   31843: athrow
    //   31844: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   31847: goto -> 31851
    //   31850: athrow
    //   31851: getstatic Perryc.1 : I
    //   31854: ifeq -> 31868
    //   31857: ldc2_w -1537510767
    //   31860: l2i
    //   31861: ldc_w 200294084
    //   31864: ixor
    //   31865: goto -> 31876
    //   31868: ldc2_w -1781540222
    //   31871: l2i
    //   31872: ldc_w 1959362548
    //   31875: ixor
    //   31876: ldc2_w -820925988
    //   31879: l2i
    //   31880: ldc_w -841858902
    //   31883: ixor
    //   31884: ixor
    //   31885: lookupswitch default -> 37476, -1385650909 -> 31868, -473609216 -> 31912
    //   31912: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   31915: ldc_w '䯾㌟䮻坓兛ꕡ๷'
    //   31918: getstatic Perryc.c : I
    //   31921: iflt -> 31935
    //   31924: ldc2_w 1049858495
    //   31927: l2i
    //   31928: ldc_w 2092528617
    //   31931: ixor
    //   31932: goto -> 31943
    //   31935: ldc2_w -1558672747
    //   31938: l2i
    //   31939: ldc_w 613228239
    //   31942: ixor
    //   31943: ldc2_w -982650938
    //   31946: l2i
    //   31947: ldc_w -123359893
    //   31950: ixor
    //   31951: ixor
    //   31952: lookupswitch default -> 37810, -1168255241 -> 31980, 2145558779 -> 31935
    //   31980: goto -> 31984
    //   31983: athrow
    //   31984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   31987: goto -> 31991
    //   31990: athrow
    //   31991: getstatic Perryc.0 : I
    //   31994: ifle -> 32008
    //   31997: ldc2_w -1358551436
    //   32000: l2i
    //   32001: ldc_w 2015285249
    //   32004: ixor
    //   32005: goto -> 32016
    //   32008: ldc2_w 530362156
    //   32011: l2i
    //   32012: ldc_w 1533903133
    //   32015: ixor
    //   32016: ldc2_w 2094868150
    //   32019: l2i
    //   32020: ldc_w -722111066
    //   32023: ixor
    //   32024: ixor
    //   32025: lookupswitch default -> 38048, -321290975 -> 32052, 2133894501 -> 32008
    //   32052: goto -> 32056
    //   32055: athrow
    //   32056: invokevirtual getModuleByName : (Ljava/lang/String;)Lbigname/zprestige/webhack/features/modules/Module;
    //   32059: goto -> 32063
    //   32062: athrow
    //   32063: getstatic Perryc.0 : I
    //   32066: ifle -> 32080
    //   32069: ldc2_w 1997621141
    //   32072: l2i
    //   32073: ldc_w 868505850
    //   32076: ixor
    //   32077: goto -> 32088
    //   32080: ldc2_w 1530726371
    //   32083: l2i
    //   32084: ldc_w 809097488
    //   32087: ixor
    //   32088: ldc2_w 1072174051
    //   32091: l2i
    //   32092: ldc_w -895921508
    //   32095: ixor
    //   32096: ixor
    //   32097: lookupswitch default -> 32124, -1314628080 -> 37568, 1104747393 -> 32080
    //   32124: goto -> 32128
    //   32127: athrow
    //   32128: invokevirtual isDisabled : ()Z
    //   32131: goto -> 32135
    //   32134: athrow
    //   32135: ifeq -> 32149
    //   32138: ldc2_w 1657256210
    //   32141: l2i
    //   32142: ldc_w -92227489
    //   32145: ixor
    //   32146: goto -> 32157
    //   32149: ldc2_w -1339122134
    //   32152: l2i
    //   32153: ldc_w 678010726
    //   32156: ixor
    //   32157: ldc2_w -1285097093
    //   32160: l2i
    //   32161: ldc_w -402378942
    //   32164: ixor
    //   32165: ixor
    //   32166: tableswitch default -> 32138, -1020930188 -> 32188, -1020930187 -> 37159
    //   32188: getstatic Perryc.c : I
    //   32191: iflt -> 32205
    //   32194: ldc2_w -1625087489
    //   32197: l2i
    //   32198: ldc_w 1386370484
    //   32201: ixor
    //   32202: goto -> 32213
    //   32205: ldc2_w -2073612564
    //   32208: l2i
    //   32209: ldc_w -865904598
    //   32212: ixor
    //   32213: ldc2_w 726865393
    //   32216: l2i
    //   32217: ldc_w 204548200
    //   32220: ixor
    //   32221: ixor
    //   32222: lookupswitch default -> 32248, -354203182 -> 37860, 1942490895 -> 32205
    //   32248: goto -> 32252
    //   32251: athrow
    //   32252: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   32255: goto -> 32259
    //   32258: athrow
    //   32259: getstatic Perryc.1 : I
    //   32262: ifeq -> 32276
    //   32265: ldc2_w -1566055737
    //   32268: l2i
    //   32269: ldc_w -998038405
    //   32272: ixor
    //   32273: goto -> 32284
    //   32276: ldc2_w -490710273
    //   32279: l2i
    //   32280: ldc_w 1245785064
    //   32283: ixor
    //   32284: ldc2_w 1880489001
    //   32287: l2i
    //   32288: ldc_w -1556306318
    //   32291: ixor
    //   32292: ixor
    //   32293: lookupswitch default -> 32320, -1448803902 -> 32276, -1257399065 -> 37912
    //   32320: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   32323: getstatic Perryc.c : I
    //   32326: iflt -> 32340
    //   32329: ldc2_w -1152397863
    //   32332: l2i
    //   32333: ldc_w 1953065746
    //   32336: ixor
    //   32337: goto -> 32348
    //   32340: ldc2_w -1726134789
    //   32343: l2i
    //   32344: ldc_w 372985368
    //   32347: ixor
    //   32348: ldc2_w 1555744823
    //   32351: l2i
    //   32352: ldc_w 603835713
    //   32355: ixor
    //   32356: ixor
    //   32357: lookupswitch default -> 32384, -1335778371 -> 37352, -730555715 -> 32340
    //   32384: goto -> 32388
    //   32387: athrow
    //   32388: invokevirtual getValue : ()Ljava/lang/Object;
    //   32391: goto -> 32395
    //   32394: athrow
    //   32395: checkcast java/lang/Boolean
    //   32398: getstatic Perryc.1 : I
    //   32401: ifeq -> 32415
    //   32404: ldc2_w 1914730621
    //   32407: l2i
    //   32408: ldc_w 1539471341
    //   32411: ixor
    //   32412: goto -> 32423
    //   32415: ldc2_w -961765167
    //   32418: l2i
    //   32419: ldc_w 468568429
    //   32422: ixor
    //   32423: ldc2_w 349459886
    //   32426: l2i
    //   32427: ldc_w -738690557
    //   32430: ixor
    //   32431: ixor
    //   32432: lookupswitch default -> 32460, -288481219 -> 37264, 493904358 -> 32415
    //   32460: goto -> 32464
    //   32463: athrow
    //   32464: invokevirtual booleanValue : ()Z
    //   32467: goto -> 32471
    //   32470: athrow
    //   32471: ifeq -> 32485
    //   32474: ldc2_w -1672007243
    //   32477: l2i
    //   32478: ldc_w 639014508
    //   32481: ixor
    //   32482: goto -> 32493
    //   32485: ldc2_w -1921345280
    //   32488: l2i
    //   32489: ldc_w 926629598
    //   32492: ixor
    //   32493: ldc2_w -949479763
    //   32496: l2i
    //   32497: ldc_w 1325311623
    //   32500: ixor
    //   32501: ixor
    //   32502: tableswitch default -> 32474, 869734387 -> 32524, 869734388 -> 36742
    //   32524: getstatic Perryc.1 : I
    //   32527: ifeq -> 32541
    //   32530: ldc2_w 807612834
    //   32533: l2i
    //   32534: ldc_w 998305631
    //   32537: ixor
    //   32538: goto -> 32549
    //   32541: ldc2_w -678579367
    //   32544: l2i
    //   32545: ldc_w -1218847091
    //   32548: ixor
    //   32549: ldc2_w -393713275
    //   32552: l2i
    //   32553: ldc_w -977881827
    //   32556: ixor
    //   32557: ixor
    //   32558: lookupswitch default -> 32584, 647823973 -> 37244, 1670261745 -> 32541
    //   32584: goto -> 32588
    //   32587: athrow
    //   32588: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   32591: goto -> 32595
    //   32594: athrow
    //   32595: getstatic Perryc.1 : I
    //   32598: ifeq -> 32612
    //   32601: ldc2_w 2011562400
    //   32604: l2i
    //   32605: ldc_w 1919921909
    //   32608: ixor
    //   32609: goto -> 32620
    //   32612: ldc2_w 879953634
    //   32615: l2i
    //   32616: ldc_w 1286401084
    //   32619: ixor
    //   32620: ldc2_w 1591167477
    //   32623: l2i
    //   32624: ldc_w 1288373669
    //   32627: ixor
    //   32628: ixor
    //   32629: lookupswitch default -> 32656, -2065120035 -> 32612, 395698949 -> 37310
    //   32656: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   32659: getstatic Perryc.0 : I
    //   32662: ifle -> 32676
    //   32665: ldc2_w -132633793
    //   32668: l2i
    //   32669: ldc_w 324280089
    //   32672: ixor
    //   32673: goto -> 32684
    //   32676: ldc2_w 826816735
    //   32679: l2i
    //   32680: ldc_w 1953972771
    //   32683: ixor
    //   32684: ldc2_w -1917803327
    //   32687: l2i
    //   32688: ldc_w -1007742668
    //   32691: ixor
    //   32692: ixor
    //   32693: lookupswitch default -> 37182, -1525448237 -> 32676, 190893833 -> 32720
    //   32720: goto -> 32724
    //   32723: athrow
    //   32724: invokevirtual getValue : ()Ljava/lang/Object;
    //   32727: goto -> 32731
    //   32730: athrow
    //   32731: getstatic Perryc.0 : I
    //   32734: ifle -> 32748
    //   32737: ldc2_w 1241705220
    //   32740: l2i
    //   32741: ldc_w -41644722
    //   32744: ixor
    //   32745: goto -> 32756
    //   32748: ldc2_w 545088085
    //   32751: l2i
    //   32752: ldc_w -644159302
    //   32755: ixor
    //   32756: ldc2_w -1759758082
    //   32759: l2i
    //   32760: ldc_w -113670012
    //   32763: ixor
    //   32764: ixor
    //   32765: lookupswitch default -> 32792, -643574224 -> 37614, 404270505 -> 32748
    //   32792: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   32795: if_acmpne -> 32809
    //   32798: ldc2_w -569342
    //   32801: l2i
    //   32802: ldc_w 620869974
    //   32805: ixor
    //   32806: goto -> 32817
    //   32809: ldc2_w -955253560
    //   32812: l2i
    //   32813: ldc_w 502863263
    //   32816: ixor
    //   32817: ldc2_w -1835107667
    //   32820: l2i
    //   32821: ldc_w 832899904
    //   32824: ixor
    //   32825: ixor
    //   32826: tableswitch default -> 32798, 2043517113 -> 32848, 2043517114 -> 33846
    //   32848: getstatic Perryc.0 : I
    //   32851: ifle -> 32865
    //   32854: ldc2_w 1535126137
    //   32857: l2i
    //   32858: ldc_w -238789805
    //   32861: ixor
    //   32862: goto -> 32873
    //   32865: ldc2_w 145980363
    //   32868: l2i
    //   32869: ldc_w 1826359201
    //   32872: ixor
    //   32873: ldc2_w 1128335604
    //   32876: l2i
    //   32877: ldc_w -1063299979
    //   32880: ixor
    //   32881: ixor
    //   32882: lookupswitch default -> 38012, -407822101 -> 32908, 697970091 -> 32865
    //   32908: aload_0
    //   32909: getstatic Perryc.1 : I
    //   32912: ifeq -> 32926
    //   32915: ldc2_w -1839213312
    //   32918: l2i
    //   32919: ldc_w -920798484
    //   32922: ixor
    //   32923: goto -> 32934
    //   32926: ldc2_w -1945087138
    //   32929: l2i
    //   32930: ldc_w 1134541741
    //   32933: ixor
    //   32934: ldc2_w 245136704
    //   32937: l2i
    //   32938: ldc_w -13556849
    //   32941: ixor
    //   32942: ixor
    //   32943: lookupswitch default -> 32968, -1427164893 -> 38154, 910400766 -> 32926
    //   32968: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   32971: getstatic Perryc.1 : I
    //   32974: ifeq -> 32988
    //   32977: ldc2_w -1398371501
    //   32980: l2i
    //   32981: ldc_w 818349555
    //   32984: ixor
    //   32985: goto -> 32996
    //   32988: ldc2_w 334156608
    //   32991: l2i
    //   32992: ldc_w 1562525048
    //   32995: ixor
    //   32996: ldc2_w 1120975954
    //   32999: l2i
    //   33000: ldc_w -359083455
    //   33003: ixor
    //   33004: ixor
    //   33005: lookupswitch default -> 33032, -441471948 -> 32988, 875159731 -> 37360
    //   33032: aload #6
    //   33034: ldc_w 3.3009437E38
    //   33037: invokestatic floatToIntBits : (F)I
    //   33040: ldc_w 2138592733
    //   33043: ixor
    //   33044: invokestatic intBitsToFloat : (I)F
    //   33047: getstatic Perryc.0 : I
    //   33050: ifle -> 33064
    //   33053: ldc2_w -1990129786
    //   33056: l2i
    //   33057: ldc_w 1566140839
    //   33060: ixor
    //   33061: goto -> 33072
    //   33064: ldc2_w -1395912790
    //   33067: l2i
    //   33068: ldc_w -889164290
    //   33071: ixor
    //   33072: ldc2_w -661267186
    //   33075: l2i
    //   33076: ldc_w -160386743
    //   33079: ixor
    //   33080: ixor
    //   33081: lookupswitch default -> 37160, -86179226 -> 33064, 1227427347 -> 33108
    //   33108: aload_0
    //   33109: getstatic Perryc.1 : I
    //   33112: ifeq -> 33126
    //   33115: ldc2_w 687959753
    //   33118: l2i
    //   33119: ldc_w 1103115499
    //   33122: ixor
    //   33123: goto -> 33134
    //   33126: ldc2_w -1525611269
    //   33129: l2i
    //   33130: ldc_w -403693253
    //   33133: ixor
    //   33134: ldc2_w 52612977
    //   33137: l2i
    //   33138: ldc_w -1835327669
    //   33141: ixor
    //   33142: ixor
    //   33143: lookupswitch default -> 33168, -340305198 -> 33126, -109540840 -> 37706
    //   33168: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   33171: getstatic Perryc.0 : I
    //   33174: ifle -> 33188
    //   33177: ldc2_w -795393527
    //   33180: l2i
    //   33181: ldc_w -1245390782
    //   33184: ixor
    //   33185: goto -> 33196
    //   33188: ldc2_w -1992302597
    //   33191: l2i
    //   33192: ldc_w -760107827
    //   33195: ixor
    //   33196: ldc2_w -1883846321
    //   33199: l2i
    //   33200: ldc_w -391165498
    //   33203: ixor
    //   33204: ixor
    //   33205: lookupswitch default -> 33232, -894232542 -> 33188, 38410946 -> 37470
    //   33232: goto -> 33236
    //   33235: athrow
    //   33236: invokevirtual getValue : ()Ljava/lang/Object;
    //   33239: goto -> 33243
    //   33242: athrow
    //   33243: checkcast java/lang/Integer
    //   33246: getstatic Perryc.1 : I
    //   33249: ifeq -> 33263
    //   33252: ldc2_w -1593130989
    //   33255: l2i
    //   33256: ldc_w 148112790
    //   33259: ixor
    //   33260: goto -> 33271
    //   33263: ldc2_w 10577051
    //   33266: l2i
    //   33267: ldc_w 1735713108
    //   33270: ixor
    //   33271: ldc2_w 1954646513
    //   33274: l2i
    //   33275: ldc_w 431397830
    //   33278: ixor
    //   33279: ixor
    //   33280: lookupswitch default -> 37762, -991307854 -> 33263, 182622200 -> 33308
    //   33308: goto -> 33312
    //   33311: athrow
    //   33312: invokevirtual intValue : ()I
    //   33315: goto -> 33319
    //   33318: athrow
    //   33319: i2f
    //   33320: ldc_w 0.059213277
    //   33323: invokestatic floatToIntBits : (F)I
    //   33326: ldc_w 2094172575
    //   33329: ixor
    //   33330: invokestatic intBitsToFloat : (I)F
    //   33333: fadd
    //   33334: getstatic Perryc.1 : I
    //   33337: ifeq -> 33351
    //   33340: ldc2_w 358974946
    //   33343: l2i
    //   33344: ldc_w 1607151437
    //   33347: ixor
    //   33348: goto -> 33359
    //   33351: ldc2_w 592640252
    //   33354: l2i
    //   33355: ldc_w 2123054268
    //   33358: ixor
    //   33359: ldc2_w -1082505336
    //   33362: l2i
    //   33363: ldc_w -1649328282
    //   33366: ixor
    //   33367: ixor
    //   33368: lookupswitch default -> 33396, -499769953 -> 33351, 1751503425 -> 37942
    //   33396: goto -> 33400
    //   33399: athrow
    //   33400: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   33403: goto -> 33407
    //   33406: athrow
    //   33407: getstatic Perryc.c : I
    //   33410: iflt -> 33424
    //   33413: ldc2_w -1099593732
    //   33416: l2i
    //   33417: ldc_w 2123117228
    //   33420: ixor
    //   33421: goto -> 33432
    //   33424: ldc2_w 676652213
    //   33427: l2i
    //   33428: ldc_w 1544509743
    //   33431: ixor
    //   33432: ldc2_w -1370374518
    //   33435: l2i
    //   33436: ldc_w 345470252
    //   33439: ixor
    //   33440: ixor
    //   33441: lookupswitch default -> 33468, 379166065 -> 33424, 2050981622 -> 37260
    //   33468: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   33471: getstatic Perryc.0 : I
    //   33474: ifle -> 33488
    //   33477: ldc2_w -1032119253
    //   33480: l2i
    //   33481: ldc_w -590310343
    //   33484: ixor
    //   33485: goto -> 33496
    //   33488: ldc2_w -801736781
    //   33491: l2i
    //   33492: ldc_w 1018280426
    //   33495: ixor
    //   33496: ldc2_w -2027222202
    //   33499: l2i
    //   33500: ldc_w 1620441981
    //   33503: ixor
    //   33504: ixor
    //   33505: lookupswitch default -> 37672, -116033495 -> 33488, 188300898 -> 33532
    //   33532: goto -> 33536
    //   33535: athrow
    //   33536: invokevirtual getValue : ()Ljava/lang/Object;
    //   33539: goto -> 33543
    //   33542: athrow
    //   33543: checkcast java/lang/Integer
    //   33546: getstatic Perryc.c : I
    //   33549: iflt -> 33563
    //   33552: ldc2_w 33056242
    //   33555: l2i
    //   33556: ldc_w 547020293
    //   33559: ixor
    //   33560: goto -> 33571
    //   33563: ldc2_w -160816885
    //   33566: l2i
    //   33567: ldc_w 1867027657
    //   33570: ixor
    //   33571: ldc2_w 2050997668
    //   33574: l2i
    //   33575: ldc_w 295214252
    //   33578: ixor
    //   33579: ixor
    //   33580: lookupswitch default -> 37920, -226126646 -> 33608, 1254464255 -> 33563
    //   33608: goto -> 33612
    //   33611: athrow
    //   33612: invokevirtual intValue : ()I
    //   33615: goto -> 33619
    //   33618: athrow
    //   33619: getstatic Perryc.0 : I
    //   33622: ifle -> 33636
    //   33625: ldc2_w -614351605
    //   33628: l2i
    //   33629: ldc_w 1325348354
    //   33632: ixor
    //   33633: goto -> 33644
    //   33636: ldc2_w -2029749514
    //   33639: l2i
    //   33640: ldc_w -1164048745
    //   33643: ixor
    //   33644: ldc2_w -76535659
    //   33647: l2i
    //   33648: ldc_w -783274257
    //   33651: ixor
    //   33652: ixor
    //   33653: lookupswitch default -> 37866, -1078030989 -> 33636, 398096923 -> 33680
    //   33680: goto -> 33684
    //   33683: athrow
    //   33684: invokestatic rainbow : (I)Ljava/awt/Color;
    //   33687: goto -> 33691
    //   33690: athrow
    //   33691: getstatic Perryc.c : I
    //   33694: iflt -> 33708
    //   33697: ldc2_w -6165529
    //   33700: l2i
    //   33701: ldc_w -249278929
    //   33704: ixor
    //   33705: goto -> 33716
    //   33708: ldc2_w 1652857911
    //   33711: l2i
    //   33712: ldc_w 61625914
    //   33715: ixor
    //   33716: ldc2_w -837056708
    //   33719: l2i
    //   33720: ldc_w 1559236217
    //   33723: ixor
    //   33724: ixor
    //   33725: lookupswitch default -> 37720, -1670501235 -> 33708, -205307064 -> 33752
    //   33752: goto -> 33756
    //   33755: athrow
    //   33756: invokevirtual getRGB : ()I
    //   33759: goto -> 33763
    //   33762: athrow
    //   33763: ldc2_w 684406605
    //   33766: l2i
    //   33767: ldc_w 684406604
    //   33770: ixor
    //   33771: getstatic Perryc.0 : I
    //   33774: ifle -> 33788
    //   33777: ldc2_w -118758304
    //   33780: l2i
    //   33781: ldc_w 1227121795
    //   33784: ixor
    //   33785: goto -> 33796
    //   33788: ldc2_w 132836309
    //   33791: l2i
    //   33792: ldc_w 1702281789
    //   33795: ixor
    //   33796: ldc2_w 1657529031
    //   33799: l2i
    //   33800: ldc_w -952565778
    //   33803: ixor
    //   33804: ixor
    //   33805: lookupswitch default -> 37632, -949013311 -> 33832, 339516874 -> 33788
    //   33832: goto -> 33836
    //   33835: athrow
    //   33836: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   33839: goto -> 33843
    //   33842: athrow
    //   33843: goto -> 37159
    //   33846: ldc2_w 513902976
    //   33849: l2i
    //   33850: ldc_w 513902977
    //   33853: ixor
    //   33854: newarray int
    //   33856: dup
    //   33857: ldc2_w -897602013
    //   33860: l2i
    //   33861: ldc_w -897602013
    //   33864: ixor
    //   33865: ldc2_w -1078034463
    //   33868: l2i
    //   33869: ldc_w -1078034464
    //   33872: ixor
    //   33873: iastore
    //   33874: getstatic Perryc.c : I
    //   33877: iflt -> 33891
    //   33880: ldc2_w 2003715040
    //   33883: l2i
    //   33884: ldc_w 1843506711
    //   33887: ixor
    //   33888: goto -> 33899
    //   33891: ldc2_w -180922625
    //   33894: l2i
    //   33895: ldc_w -1695577884
    //   33898: ixor
    //   33899: ldc2_w -255502951
    //   33902: l2i
    //   33903: ldc_w 1968180104
    //   33906: ixor
    //   33907: ixor
    //   33908: lookupswitch default -> 37452, -1625639962 -> 33891, -364019702 -> 33936
    //   33936: astore #7
    //   33938: getstatic Perryc.0 : I
    //   33941: ifle -> 33955
    //   33944: ldc2_w 742599889
    //   33947: l2i
    //   33948: ldc_w 1062518330
    //   33951: ixor
    //   33952: goto -> 33963
    //   33955: ldc2_w 1209040473
    //   33958: l2i
    //   33959: ldc_w 463695515
    //   33962: ixor
    //   33963: ldc2_w 824867994
    //   33966: l2i
    //   33967: ldc_w 799041332
    //   33970: ixor
    //   33971: ixor
    //   33972: lookupswitch default -> 37354, 228428101 -> 33955, 1295584108 -> 34000
    //   34000: aload #6
    //   34002: getstatic Perryc.1 : I
    //   34005: ifeq -> 34019
    //   34008: ldc2_w -887736830
    //   34011: l2i
    //   34012: ldc_w -113996598
    //   34015: ixor
    //   34016: goto -> 34027
    //   34019: ldc2_w 805098667
    //   34022: l2i
    //   34023: ldc_w -19125587
    //   34026: ixor
    //   34027: ldc2_w -649965156
    //   34030: l2i
    //   34031: ldc_w 1172725240
    //   34034: ixor
    //   34035: ixor
    //   34036: lookupswitch default -> 38168, -1366903124 -> 34019, 1300558434 -> 34064
    //   34064: goto -> 34068
    //   34067: athrow
    //   34068: invokevirtual toCharArray : ()[C
    //   34071: goto -> 34075
    //   34074: athrow
    //   34075: getstatic Perryc.c : I
    //   34078: iflt -> 34092
    //   34081: ldc2_w -1846587533
    //   34084: l2i
    //   34085: ldc_w 20934930
    //   34088: ixor
    //   34089: goto -> 34100
    //   34092: ldc2_w 38229868
    //   34095: l2i
    //   34096: ldc_w 1259720189
    //   34099: ixor
    //   34100: ldc2_w -1961732050
    //   34103: l2i
    //   34104: ldc_w 312939200
    //   34107: ixor
    //   34108: ixor
    //   34109: lookupswitch default -> 34136, -1788707403 -> 34092, 157643919 -> 37206
    //   34136: astore #8
    //   34138: ldc_w 1.7259268E38
    //   34141: invokestatic floatToIntBits : (F)I
    //   34144: ldc_w 2130827300
    //   34147: ixor
    //   34148: invokestatic intBitsToFloat : (I)F
    //   34151: getstatic Perryc.0 : I
    //   34154: ifle -> 34168
    //   34157: ldc2_w 1077699155
    //   34160: l2i
    //   34161: ldc_w 83718752
    //   34164: ixor
    //   34165: goto -> 34176
    //   34168: ldc2_w -512815993
    //   34171: l2i
    //   34172: ldc_w -2125695974
    //   34175: ixor
    //   34176: ldc2_w 450881629
    //   34179: l2i
    //   34180: ldc_w 488780668
    //   34183: ixor
    //   34184: ixor
    //   34185: lookupswitch default -> 34212, -2051323201 -> 34168, 1128057618 -> 38052
    //   34212: fstore #9
    //   34214: getstatic Perryc.c : I
    //   34217: iflt -> 34231
    //   34220: ldc2_w -920120468
    //   34223: l2i
    //   34224: ldc_w 1719805161
    //   34227: ixor
    //   34228: goto -> 34239
    //   34231: ldc2_w 1075768040
    //   34234: l2i
    //   34235: ldc_w -502985066
    //   34238: ixor
    //   34239: ldc2_w -964646037
    //   34242: l2i
    //   34243: ldc_w 2079678767
    //   34246: ixor
    //   34247: ixor
    //   34248: lookupswitch default -> 38022, 316669377 -> 34231, 527314490 -> 34276
    //   34276: aload #8
    //   34278: getstatic Perryc.1 : I
    //   34281: ifeq -> 34295
    //   34284: ldc2_w 627052232
    //   34287: l2i
    //   34288: ldc_w 943255596
    //   34291: ixor
    //   34292: goto -> 34303
    //   34295: ldc2_w 1758013437
    //   34298: l2i
    //   34299: ldc_w -1743995396
    //   34302: ixor
    //   34303: ldc2_w -829093098
    //   34306: l2i
    //   34307: ldc_w -2009796584
    //   34310: ixor
    //   34311: ixor
    //   34312: lookupswitch default -> 37208, -1234935537 -> 34340, 1543046634 -> 34295
    //   34340: astore #10
    //   34342: getstatic Perryc.c : I
    //   34345: iflt -> 34359
    //   34348: ldc2_w -1897294323
    //   34351: l2i
    //   34352: ldc_w 529374468
    //   34355: ixor
    //   34356: goto -> 34367
    //   34359: ldc2_w 1587655553
    //   34362: l2i
    //   34363: ldc_w -2088370233
    //   34366: ixor
    //   34367: ldc2_w 75335918
    //   34370: l2i
    //   34371: ldc_w 244518947
    //   34374: ixor
    //   34375: ixor
    //   34376: lookupswitch default -> 37954, -1685417020 -> 34359, -674573173 -> 34404
    //   34404: aload #10
    //   34406: arraylength
    //   34407: getstatic Perryc.c : I
    //   34410: iflt -> 34424
    //   34413: ldc2_w -952043067
    //   34416: l2i
    //   34417: ldc_w -20203298
    //   34420: ixor
    //   34421: goto -> 34432
    //   34424: ldc2_w -1073130153
    //   34427: l2i
    //   34428: ldc_w 529855262
    //   34431: ixor
    //   34432: ldc2_w -726308137
    //   34435: l2i
    //   34436: ldc_w -409089297
    //   34439: ixor
    //   34440: ixor
    //   34441: lookupswitch default -> 34468, 178512163 -> 37802, 493666067 -> 34424
    //   34468: istore #11
    //   34470: ldc2_w 2134748646
    //   34473: l2i
    //   34474: ldc_w 2134748646
    //   34477: ixor
    //   34478: getstatic Perryc.0 : I
    //   34481: ifle -> 34495
    //   34484: ldc2_w -764564134
    //   34487: l2i
    //   34488: ldc_w 9377745
    //   34491: ixor
    //   34492: goto -> 34503
    //   34495: ldc2_w 1284367578
    //   34498: l2i
    //   34499: ldc_w -690815344
    //   34502: ixor
    //   34503: ldc2_w 298526281
    //   34506: l2i
    //   34507: ldc_w 411611567
    //   34510: ixor
    //   34511: ixor
    //   34512: lookupswitch default -> 34540, -610194067 -> 37998, 999880561 -> 34495
    //   34540: istore #12
    //   34542: getstatic Perryc.0 : I
    //   34545: ifle -> 34559
    //   34548: ldc2_w -1047935028
    //   34551: l2i
    //   34552: ldc_w -958753888
    //   34555: ixor
    //   34556: goto -> 34567
    //   34559: ldc2_w 1972883053
    //   34562: l2i
    //   34563: ldc_w -394648023
    //   34566: ixor
    //   34567: ldc2_w -1105716947
    //   34570: l2i
    //   34571: ldc_w -2056866799
    //   34574: ixor
    //   34575: ixor
    //   34576: lookupswitch default -> 37282, -1500297864 -> 34604, 1009645904 -> 34559
    //   34604: iload #12
    //   34606: getstatic Perryc.0 : I
    //   34609: ifle -> 34623
    //   34612: ldc2_w -837481353
    //   34615: l2i
    //   34616: ldc_w -847286288
    //   34619: ixor
    //   34620: goto -> 34631
    //   34623: ldc2_w -1431422446
    //   34626: l2i
    //   34627: ldc_w 1416121823
    //   34630: ixor
    //   34631: ldc2_w -765465870
    //   34634: l2i
    //   34635: ldc_w -1347849901
    //   34638: ixor
    //   34639: ixor
    //   34640: lookupswitch default -> 34668, 656262987 -> 34623, 2124216358 -> 37642
    //   34668: iload #11
    //   34670: if_icmpge -> 34684
    //   34673: ldc2_w -665270062
    //   34676: l2i
    //   34677: ldc_w 1993414426
    //   34680: ixor
    //   34681: goto -> 34692
    //   34684: ldc2_w 1533567505
    //   34687: l2i
    //   34688: ldc_w -169755178
    //   34691: ixor
    //   34692: ldc2_w -1788539507
    //   34695: l2i
    //   34696: ldc_w 2078253378
    //   34699: ixor
    //   34700: ixor
    //   34701: tableswitch default -> 34673, 1077113607 -> 34724, 1077113608 -> 36739
    //   34724: getstatic Perryc.1 : I
    //   34727: ifeq -> 34741
    //   34730: ldc2_w -104604131
    //   34733: l2i
    //   34734: ldc_w 812417367
    //   34737: ixor
    //   34738: goto -> 34749
    //   34741: ldc2_w 2124762621
    //   34744: l2i
    //   34745: ldc_w -1682715237
    //   34748: ixor
    //   34749: ldc2_w -1185976085
    //   34752: l2i
    //   34753: ldc_w 378488353
    //   34756: ixor
    //   34757: ixor
    //   34758: lookupswitch default -> 34784, 920562412 -> 34741, 1718577536 -> 37230
    //   34784: aload #10
    //   34786: getstatic Perryc.1 : I
    //   34789: ifeq -> 34803
    //   34792: ldc2_w 1512753712
    //   34795: l2i
    //   34796: ldc_w 789101174
    //   34799: ixor
    //   34800: goto -> 34811
    //   34803: ldc2_w 466906443
    //   34806: l2i
    //   34807: ldc_w 2048282879
    //   34810: ixor
    //   34811: ldc2_w -1801313771
    //   34814: l2i
    //   34815: ldc_w -1029175773
    //   34818: ixor
    //   34819: ixor
    //   34820: lookupswitch default -> 37174, 589845616 -> 34803, 935860610 -> 34848
    //   34848: iload #12
    //   34850: caload
    //   34851: getstatic Perryc.1 : I
    //   34854: ifeq -> 34868
    //   34857: ldc2_w 18631927
    //   34860: l2i
    //   34861: ldc_w -560940917
    //   34864: ixor
    //   34865: goto -> 34876
    //   34868: ldc2_w 542567050
    //   34871: l2i
    //   34872: ldc_w -237539704
    //   34875: ixor
    //   34876: ldc2_w -1336207309
    //   34879: l2i
    //   34880: ldc_w 799221310
    //   34883: ixor
    //   34884: ixor
    //   34885: lookupswitch default -> 37804, 1081395825 -> 34868, 1316600335 -> 34912
    //   34912: istore #13
    //   34914: getstatic Perryc.1 : I
    //   34917: ifeq -> 34931
    //   34920: ldc2_w -705555245
    //   34923: l2i
    //   34924: ldc_w -1095377772
    //   34927: ixor
    //   34928: goto -> 34939
    //   34931: ldc2_w 1283855572
    //   34934: l2i
    //   34935: ldc_w -474855508
    //   34938: ixor
    //   34939: ldc2_w -580807761
    //   34942: l2i
    //   34943: ldc_w -1663750947
    //   34946: ixor
    //   34947: ixor
    //   34948: lookupswitch default -> 37926, -293540854 -> 34976, 720598837 -> 34931
    //   34976: aload_0
    //   34977: getstatic Perryc.1 : I
    //   34980: ifeq -> 34994
    //   34983: ldc2_w -441000401
    //   34986: l2i
    //   34987: ldc_w -1542109517
    //   34990: ixor
    //   34991: goto -> 35002
    //   34994: ldc2_w 1523893430
    //   34997: l2i
    //   34998: ldc_w 131191443
    //   35001: ixor
    //   35002: ldc2_w 273687641
    //   35005: l2i
    //   35006: ldc_w 324036205
    //   35009: ixor
    //   35010: ixor
    //   35011: lookupswitch default -> 37406, 1118034600 -> 34994, 1577407505 -> 35036
    //   35036: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   35039: getstatic Perryc.1 : I
    //   35042: ifeq -> 35056
    //   35045: ldc2_w -1182615835
    //   35048: l2i
    //   35049: ldc_w -299882276
    //   35052: ixor
    //   35053: goto -> 35064
    //   35056: ldc2_w 2094640683
    //   35059: l2i
    //   35060: ldc_w 2104273958
    //   35063: ixor
    //   35064: ldc2_w -2097631097
    //   35067: l2i
    //   35068: ldc_w -1316471017
    //   35071: ixor
    //   35072: ixor
    //   35073: lookupswitch default -> 37170, 851807645 -> 35100, 1691488681 -> 35056
    //   35100: iload #13
    //   35102: getstatic Perryc.1 : I
    //   35105: ifeq -> 35119
    //   35108: ldc2_w 518849460
    //   35111: l2i
    //   35112: ldc_w -608480778
    //   35115: ixor
    //   35116: goto -> 35127
    //   35119: ldc2_w 1307027679
    //   35122: l2i
    //   35123: ldc_w 2032510358
    //   35126: ixor
    //   35127: ldc2_w 1869250927
    //   35130: l2i
    //   35131: ldc_w 825227331
    //   35134: ixor
    //   35135: ixor
    //   35136: lookupswitch default -> 37248, -1693242514 -> 35119, 1787262053 -> 35164
    //   35164: goto -> 35168
    //   35167: athrow
    //   35168: invokestatic valueOf : (C)Ljava/lang/String;
    //   35171: goto -> 35175
    //   35174: athrow
    //   35175: ldc_w 3.319081E38
    //   35178: invokestatic floatToIntBits : (F)I
    //   35181: ldc_w 2138682157
    //   35184: ixor
    //   35185: invokestatic intBitsToFloat : (I)F
    //   35188: getstatic Perryc.1 : I
    //   35191: ifeq -> 35205
    //   35194: ldc2_w -890359364
    //   35197: l2i
    //   35198: ldc_w -863124353
    //   35201: ixor
    //   35202: goto -> 35213
    //   35205: ldc2_w 926645888
    //   35208: l2i
    //   35209: ldc_w -569345029
    //   35212: ixor
    //   35213: ldc2_w 586226193
    //   35216: l2i
    //   35217: ldc_w -1665421723
    //   35220: ixor
    //   35221: ixor
    //   35222: lookupswitch default -> 37872, -1205255753 -> 35205, 1466020111 -> 35248
    //   35248: fload #9
    //   35250: fadd
    //   35251: getstatic Perryc.c : I
    //   35254: iflt -> 35268
    //   35257: ldc2_w 1722161554
    //   35260: l2i
    //   35261: ldc_w 1943969134
    //   35264: ixor
    //   35265: goto -> 35276
    //   35268: ldc2_w 1087599611
    //   35271: l2i
    //   35272: ldc_w -1330457729
    //   35275: ixor
    //   35276: ldc2_w -1632920551
    //   35279: l2i
    //   35280: ldc_w -1235759685
    //   35283: ixor
    //   35284: ixor
    //   35285: lookupswitch default -> 37560, -660737754 -> 35312, 1032115550 -> 35268
    //   35312: aload_0
    //   35313: getstatic Perryc.0 : I
    //   35316: ifle -> 35330
    //   35319: ldc2_w 1658344841
    //   35322: l2i
    //   35323: ldc_w -670589687
    //   35326: ixor
    //   35327: goto -> 35338
    //   35330: ldc2_w 757605930
    //   35333: l2i
    //   35334: ldc_w 1695223664
    //   35337: ixor
    //   35338: ldc2_w -71063278
    //   35341: l2i
    //   35342: ldc_w -1893939835
    //   35345: ixor
    //   35346: ixor
    //   35347: lookupswitch default -> 37176, -838818793 -> 35330, 1023165901 -> 35372
    //   35372: getfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   35375: getstatic Perryc.1 : I
    //   35378: ifeq -> 35392
    //   35381: ldc2_w 1002178375
    //   35384: l2i
    //   35385: ldc_w 1294998683
    //   35388: ixor
    //   35389: goto -> 35400
    //   35392: ldc2_w -1066984785
    //   35395: l2i
    //   35396: ldc_w 359578763
    //   35399: ixor
    //   35400: ldc2_w 1188926850
    //   35403: l2i
    //   35404: ldc_w -1186343879
    //   35407: ixor
    //   35408: ixor
    //   35409: lookupswitch default -> 35436, -1994892697 -> 37774, 1718675307 -> 35392
    //   35436: goto -> 35440
    //   35439: athrow
    //   35440: invokevirtual getValue : ()Ljava/lang/Object;
    //   35443: goto -> 35447
    //   35446: athrow
    //   35447: checkcast java/lang/Integer
    //   35450: getstatic Perryc.1 : I
    //   35453: ifeq -> 35467
    //   35456: ldc2_w -865568763
    //   35459: l2i
    //   35460: ldc_w -2068069734
    //   35463: ixor
    //   35464: goto -> 35475
    //   35467: ldc2_w 2078448482
    //   35470: l2i
    //   35471: ldc_w -451571131
    //   35474: ixor
    //   35475: ldc2_w -340782298
    //   35478: l2i
    //   35479: ldc_w -121124685
    //   35482: ixor
    //   35483: ixor
    //   35484: lookupswitch default -> 35512, -742222346 -> 35467, 1537499402 -> 37252
    //   35512: goto -> 35516
    //   35515: athrow
    //   35516: invokevirtual intValue : ()I
    //   35519: goto -> 35523
    //   35522: athrow
    //   35523: i2f
    //   35524: ldc_w 0.5877114
    //   35527: invokestatic floatToIntBits : (F)I
    //   35530: ldc_w 2125886529
    //   35533: ixor
    //   35534: invokestatic intBitsToFloat : (I)F
    //   35537: fadd
    //   35538: getstatic Perryc.1 : I
    //   35541: ifeq -> 35555
    //   35544: ldc2_w -826377767
    //   35547: l2i
    //   35548: ldc_w 559931020
    //   35551: ixor
    //   35552: goto -> 35563
    //   35555: ldc2_w 1322181880
    //   35558: l2i
    //   35559: ldc_w -110147464
    //   35562: ixor
    //   35563: ldc2_w 930378918
    //   35566: l2i
    //   35567: ldc_w -2027903008
    //   35570: ixor
    //   35571: ixor
    //   35572: lookupswitch default -> 37210, 133529542 -> 35600, 1605727251 -> 35555
    //   35600: aload #7
    //   35602: ldc2_w 68896097
    //   35605: l2i
    //   35606: ldc_w 68896097
    //   35609: ixor
    //   35610: iaload
    //   35611: getstatic Perryc.c : I
    //   35614: iflt -> 35628
    //   35617: ldc2_w -1858368601
    //   35620: l2i
    //   35621: ldc_w 1967194288
    //   35624: ixor
    //   35625: goto -> 35636
    //   35628: ldc2_w 1039768661
    //   35631: l2i
    //   35632: ldc_w -1228029958
    //   35635: ixor
    //   35636: ldc2_w -901162158
    //   35639: l2i
    //   35640: ldc_w 1954875251
    //   35643: ixor
    //   35644: ixor
    //   35645: lookupswitch default -> 35672, -2033482905 -> 35628, 1521932086 -> 37970
    //   35672: goto -> 35676
    //   35675: athrow
    //   35676: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   35679: goto -> 35683
    //   35682: athrow
    //   35683: getstatic Perryc.c : I
    //   35686: iflt -> 35700
    //   35689: ldc2_w 886646982
    //   35692: l2i
    //   35693: ldc_w -787671856
    //   35696: ixor
    //   35697: goto -> 35708
    //   35700: ldc2_w -1832414523
    //   35703: l2i
    //   35704: ldc_w 1542435633
    //   35707: ixor
    //   35708: ldc2_w -1423423433
    //   35711: l2i
    //   35712: ldc_w 1651041466
    //   35715: ixor
    //   35716: ixor
    //   35717: lookupswitch default -> 35744, 747933851 -> 37780, 1563501361 -> 35700
    //   35744: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   35747: getstatic Perryc.c : I
    //   35750: iflt -> 35764
    //   35753: ldc2_w -4807960
    //   35756: l2i
    //   35757: ldc_w 1418951511
    //   35760: ixor
    //   35761: goto -> 35772
    //   35764: ldc2_w -958240777
    //   35767: l2i
    //   35768: ldc_w 896022544
    //   35771: ixor
    //   35772: ldc2_w 1673676530
    //   35775: l2i
    //   35776: ldc_w -51708790
    //   35779: ixor
    //   35780: ixor
    //   35781: lookupswitch default -> 35808, 873292743 -> 38164, 1199781277 -> 35764
    //   35808: goto -> 35812
    //   35811: athrow
    //   35812: invokevirtual getValue : ()Ljava/lang/Object;
    //   35815: goto -> 35819
    //   35818: athrow
    //   35819: checkcast java/lang/Integer
    //   35822: getstatic Perryc.0 : I
    //   35825: ifle -> 35839
    //   35828: ldc2_w -641800289
    //   35831: l2i
    //   35832: ldc_w -2095840846
    //   35835: ixor
    //   35836: goto -> 35847
    //   35839: ldc2_w -1359788398
    //   35842: l2i
    //   35843: ldc_w 1225453648
    //   35846: ixor
    //   35847: ldc2_w -1922202224
    //   35850: l2i
    //   35851: ldc_w -1038584476
    //   35854: ixor
    //   35855: ixor
    //   35856: lookupswitch default -> 35884, -217697137 -> 35839, 366941913 -> 37364
    //   35884: goto -> 35888
    //   35887: athrow
    //   35888: invokevirtual intValue : ()I
    //   35891: goto -> 35895
    //   35894: athrow
    //   35895: imul
    //   35896: getstatic Perryc.c : I
    //   35899: iflt -> 35913
    //   35902: ldc2_w 1646185720
    //   35905: l2i
    //   35906: ldc_w 1376791763
    //   35909: ixor
    //   35910: goto -> 35921
    //   35913: ldc2_w -844523072
    //   35916: l2i
    //   35917: ldc_w 90328840
    //   35920: ixor
    //   35921: ldc2_w -1415073769
    //   35924: l2i
    //   35925: ldc_w -413807685
    //   35928: ixor
    //   35929: ixor
    //   35930: lookupswitch default -> 37718, -2076594844 -> 35956, 2096929671 -> 35913
    //   35956: goto -> 35960
    //   35959: athrow
    //   35960: invokestatic rainbow : (I)Ljava/awt/Color;
    //   35963: goto -> 35967
    //   35966: athrow
    //   35967: getstatic Perryc.0 : I
    //   35970: ifle -> 35984
    //   35973: ldc2_w 1311635122
    //   35976: l2i
    //   35977: ldc_w -1924235549
    //   35980: ixor
    //   35981: goto -> 35992
    //   35984: ldc2_w -1752645117
    //   35987: l2i
    //   35988: ldc_w 1088533961
    //   35991: ixor
    //   35992: ldc2_w -584548753
    //   35995: l2i
    //   35996: ldc_w -123605461
    //   35999: ixor
    //   36000: ixor
    //   36001: lookupswitch default -> 36028, -2050112035 -> 35984, -420866027 -> 37312
    //   36028: goto -> 36032
    //   36031: athrow
    //   36032: invokevirtual getRGB : ()I
    //   36035: goto -> 36039
    //   36038: athrow
    //   36039: ldc2_w 820164959
    //   36042: l2i
    //   36043: ldc_w 820164958
    //   36046: ixor
    //   36047: getstatic Perryc.0 : I
    //   36050: ifle -> 36064
    //   36053: ldc2_w -1216907849
    //   36056: l2i
    //   36057: ldc_w 1753470408
    //   36060: ixor
    //   36061: goto -> 36072
    //   36064: ldc2_w -725167067
    //   36067: l2i
    //   36068: ldc_w -1760665290
    //   36071: ixor
    //   36072: ldc2_w -1933521154
    //   36075: l2i
    //   36076: ldc_w -1796201891
    //   36079: ixor
    //   36080: ixor
    //   36081: lookupswitch default -> 37512, -943436580 -> 36064, 1543002544 -> 36108
    //   36108: goto -> 36112
    //   36111: athrow
    //   36112: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   36115: goto -> 36119
    //   36118: athrow
    //   36119: getstatic Perryc.0 : I
    //   36122: ifle -> 36136
    //   36125: ldc2_w 1354515369
    //   36128: l2i
    //   36129: ldc_w -1860788727
    //   36132: ixor
    //   36133: goto -> 36144
    //   36136: ldc2_w 1267323005
    //   36139: l2i
    //   36140: ldc_w 68667900
    //   36143: ixor
    //   36144: ldc2_w 459839636
    //   36147: l2i
    //   36148: ldc_w -324932507
    //   36151: ixor
    //   36152: ixor
    //   36153: lookupswitch default -> 36180, 912501073 -> 37196, 1028747127 -> 36136
    //   36180: fload #9
    //   36182: getstatic Perryc.0 : I
    //   36185: ifle -> 36199
    //   36188: ldc2_w 1140868527
    //   36191: l2i
    //   36192: ldc_w 578198761
    //   36195: ixor
    //   36196: goto -> 36207
    //   36199: ldc2_w 2082337113
    //   36202: l2i
    //   36203: ldc_w -899755298
    //   36206: ixor
    //   36207: ldc2_w 1422038729
    //   36210: l2i
    //   36211: ldc_w 639813649
    //   36214: ixor
    //   36215: ixor
    //   36216: lookupswitch default -> 38112, -995918497 -> 36244, 345409438 -> 36199
    //   36244: aload_0
    //   36245: getstatic Perryc.0 : I
    //   36248: ifle -> 36262
    //   36251: ldc2_w -1252151008
    //   36254: l2i
    //   36255: ldc_w -1409274866
    //   36258: ixor
    //   36259: goto -> 36270
    //   36262: ldc2_w 1883751276
    //   36265: l2i
    //   36266: ldc_w -2131303378
    //   36269: ixor
    //   36270: ldc2_w 2117642806
    //   36273: l2i
    //   36274: ldc_w -983252467
    //   36277: ixor
    //   36278: ixor
    //   36279: lookupswitch default -> 38098, -1576930027 -> 36262, 1273843577 -> 36304
    //   36304: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   36307: getstatic Perryc.1 : I
    //   36310: ifeq -> 36324
    //   36313: ldc2_w -1453971655
    //   36316: l2i
    //   36317: ldc_w 567177982
    //   36320: ixor
    //   36321: goto -> 36332
    //   36324: ldc2_w 2123528731
    //   36327: l2i
    //   36328: ldc_w -643789505
    //   36331: ixor
    //   36332: ldc2_w -1063773033
    //   36335: l2i
    //   36336: ldc_w 1513887195
    //   36339: ixor
    //   36340: ixor
    //   36341: lookupswitch default -> 37356, 305945739 -> 36324, 1033305704 -> 36368
    //   36368: iload #13
    //   36370: getstatic Perryc.1 : I
    //   36373: ifeq -> 36387
    //   36376: ldc2_w 1909732971
    //   36379: l2i
    //   36380: ldc_w -1429915193
    //   36383: ixor
    //   36384: goto -> 36395
    //   36387: ldc2_w 1328847962
    //   36390: l2i
    //   36391: ldc_w 1252618616
    //   36394: ixor
    //   36395: ldc2_w 762752991
    //   36398: l2i
    //   36399: ldc_w 1196710536
    //   36402: ixor
    //   36403: ixor
    //   36404: lookupswitch default -> 36432, -1660258891 -> 36387, -1321993477 -> 37346
    //   36432: goto -> 36436
    //   36435: athrow
    //   36436: invokestatic valueOf : (C)Ljava/lang/String;
    //   36439: goto -> 36443
    //   36442: athrow
    //   36443: getstatic Perryc.1 : I
    //   36446: ifeq -> 36460
    //   36449: ldc2_w -760226750
    //   36452: l2i
    //   36453: ldc_w 1349429691
    //   36456: ixor
    //   36457: goto -> 36468
    //   36460: ldc2_w 1839462275
    //   36463: l2i
    //   36464: ldc_w 1371379190
    //   36467: ixor
    //   36468: ldc2_w -1696864090
    //   36471: l2i
    //   36472: ldc_w 1460803055
    //   36475: ixor
    //   36476: ixor
    //   36477: lookupswitch default -> 36504, -1757340452 -> 36460, 1325959344 -> 37822
    //   36504: goto -> 36508
    //   36507: athrow
    //   36508: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   36511: goto -> 36515
    //   36514: athrow
    //   36515: i2f
    //   36516: fadd
    //   36517: getstatic Perryc.c : I
    //   36520: iflt -> 36534
    //   36523: ldc2_w -1790064016
    //   36526: l2i
    //   36527: ldc_w 1811799832
    //   36530: ixor
    //   36531: goto -> 36542
    //   36534: ldc2_w -310662217
    //   36537: l2i
    //   36538: ldc_w 235032170
    //   36541: ixor
    //   36542: ldc2_w -625301532
    //   36545: l2i
    //   36546: ldc_w -1296061101
    //   36549: ixor
    //   36550: ixor
    //   36551: lookupswitch default -> 37620, -1954746518 -> 36576, -1766514721 -> 36534
    //   36576: fstore #9
    //   36578: getstatic Perryc.0 : I
    //   36581: ifle -> 36595
    //   36584: ldc2_w -2086589535
    //   36587: l2i
    //   36588: ldc_w 998661465
    //   36591: ixor
    //   36592: goto -> 36603
    //   36595: ldc2_w 329526653
    //   36598: l2i
    //   36599: ldc_w 928817756
    //   36602: ixor
    //   36603: ldc2_w 1186414674
    //   36606: l2i
    //   36607: ldc_w 176574952
    //   36610: ixor
    //   36611: ixor
    //   36612: lookupswitch default -> 37772, -199858366 -> 36595, 1758043803 -> 36640
    //   36640: aload #7
    //   36642: ldc2_w -1626893191
    //   36645: l2i
    //   36646: ldc_w -1626893191
    //   36649: ixor
    //   36650: getstatic Perryc.1 : I
    //   36653: ifeq -> 36667
    //   36656: ldc2_w 1989229125
    //   36659: l2i
    //   36660: ldc_w -756127122
    //   36663: ixor
    //   36664: goto -> 36675
    //   36667: ldc2_w -1923066089
    //   36670: l2i
    //   36671: ldc_w -880324374
    //   36674: ixor
    //   36675: ldc2_w 658818983
    //   36678: l2i
    //   36679: ldc_w -2060337937
    //   36682: ixor
    //   36683: ixor
    //   36684: lookupswitch default -> 36712, -1762186968 -> 36667, 101329763 -> 37192
    //   36712: aload #7
    //   36714: ldc2_w 47360270
    //   36717: l2i
    //   36718: ldc_w 47360270
    //   36721: ixor
    //   36722: iaload
    //   36723: ldc2_w 1223993142
    //   36726: l2i
    //   36727: ldc_w 1223993143
    //   36730: ixor
    //   36731: iadd
    //   36732: iastore
    //   36733: iinc #12, 1
    //   36736: goto -> 34542
    //   36739: goto -> 37159
    //   36742: getstatic Perryc.c : I
    //   36745: iflt -> 36759
    //   36748: ldc2_w -717422513
    //   36751: l2i
    //   36752: ldc_w 325479154
    //   36755: ixor
    //   36756: goto -> 36767
    //   36759: ldc2_w -368142275
    //   36762: l2i
    //   36763: ldc_w -940861463
    //   36766: ixor
    //   36767: ldc2_w 1987488728
    //   36770: l2i
    //   36771: ldc_w 105485027
    //   36774: ixor
    //   36775: ixor
    //   36776: lookupswitch default -> 37664, -1234939002 -> 36759, 1574581999 -> 36804
    //   36804: aload_0
    //   36805: getstatic Perryc.0 : I
    //   36808: ifle -> 36822
    //   36811: ldc2_w -151246372
    //   36814: l2i
    //   36815: ldc_w -575554486
    //   36818: ixor
    //   36819: goto -> 36830
    //   36822: ldc2_w 1134376002
    //   36825: l2i
    //   36826: ldc_w -430299904
    //   36829: ixor
    //   36830: ldc2_w 681112998
    //   36833: l2i
    //   36834: ldc_w 805681174
    //   36837: ixor
    //   36838: ixor
    //   36839: lookupswitch default -> 36864, -1779248499 -> 36822, 869324838 -> 37444
    //   36864: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   36867: getstatic Perryc.c : I
    //   36870: iflt -> 36884
    //   36873: ldc2_w 80792843
    //   36876: l2i
    //   36877: ldc_w -680250928
    //   36880: ixor
    //   36881: goto -> 36892
    //   36884: ldc2_w -1604813751
    //   36887: l2i
    //   36888: ldc_w -1948819978
    //   36891: ixor
    //   36892: ldc2_w 756773907
    //   36895: l2i
    //   36896: ldc_w 810653464
    //   36899: ixor
    //   36900: ixor
    //   36901: lookupswitch default -> 37972, -823255088 -> 36884, 918930100 -> 36928
    //   36928: aload #6
    //   36930: ldc_w 2.9881612E38
    //   36933: invokestatic floatToIntBits : (F)I
    //   36936: ldc_w 2137050596
    //   36939: ixor
    //   36940: invokestatic intBitsToFloat : (I)F
    //   36943: ldc_w 0.18498397
    //   36946: invokestatic floatToIntBits : (F)I
    //   36949: ldc_w 2132634736
    //   36952: ixor
    //   36953: invokestatic intBitsToFloat : (I)F
    //   36956: getstatic Perryc.0 : I
    //   36959: ifle -> 36973
    //   36962: ldc2_w -1293250214
    //   36965: l2i
    //   36966: ldc_w 621949270
    //   36969: ixor
    //   36970: goto -> 36981
    //   36973: ldc2_w 638593198
    //   36976: l2i
    //   36977: ldc_w 1018787689
    //   36980: ixor
    //   36981: ldc2_w 2082702155
    //   36984: l2i
    //   36985: ldc_w 630058132
    //   36988: ixor
    //   36989: ixor
    //   36990: lookupswitch default -> 37016, -833171501 -> 37750, -362172362 -> 36973
    //   37016: aload_0
    //   37017: getstatic Perryc.0 : I
    //   37020: ifle -> 37034
    //   37023: ldc2_w 1460667812
    //   37026: l2i
    //   37027: ldc_w -889778985
    //   37030: ixor
    //   37031: goto -> 37042
    //   37034: ldc2_w -723214855
    //   37037: l2i
    //   37038: ldc_w -739065463
    //   37041: ixor
    //   37042: ldc2_w 2032613933
    //   37045: l2i
    //   37046: ldc_w -105124488
    //   37049: ixor
    //   37050: ixor
    //   37051: lookupswitch default -> 37076, -2028445827 -> 37034, 494657062 -> 37952
    //   37076: getfield color : I
    //   37079: ldc2_w -1905887404
    //   37082: l2i
    //   37083: ldc_w -1905887403
    //   37086: ixor
    //   37087: getstatic Perryc.1 : I
    //   37090: ifeq -> 37104
    //   37093: ldc2_w -1711143170
    //   37096: l2i
    //   37097: ldc_w 1946341364
    //   37100: ixor
    //   37101: goto -> 37112
    //   37104: ldc2_w 1376474081
    //   37107: l2i
    //   37108: ldc_w -30063973
    //   37111: ixor
    //   37112: ldc2_w 1432126056
    //   37115: l2i
    //   37116: ldc_w 1141685540
    //   37119: ixor
    //   37120: ixor
    //   37121: lookupswitch default -> 37898, -1116852682 -> 37148, -11471290 -> 37104
    //   37148: goto -> 37152
    //   37151: athrow
    //   37152: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   37155: goto -> 37159
    //   37158: athrow
    //   37159: return
    //   37160: aconst_null
    //   37161: athrow
    //   37162: aconst_null
    //   37163: athrow
    //   37164: aconst_null
    //   37165: athrow
    //   37166: aconst_null
    //   37167: athrow
    //   37168: aconst_null
    //   37169: athrow
    //   37170: aconst_null
    //   37171: athrow
    //   37172: aconst_null
    //   37173: athrow
    //   37174: aconst_null
    //   37175: athrow
    //   37176: aconst_null
    //   37177: athrow
    //   37178: aconst_null
    //   37179: athrow
    //   37180: aconst_null
    //   37181: athrow
    //   37182: aconst_null
    //   37183: athrow
    //   37184: aconst_null
    //   37185: athrow
    //   37186: aconst_null
    //   37187: athrow
    //   37188: aconst_null
    //   37189: athrow
    //   37190: aconst_null
    //   37191: athrow
    //   37192: aconst_null
    //   37193: athrow
    //   37194: aconst_null
    //   37195: athrow
    //   37196: aconst_null
    //   37197: athrow
    //   37198: aconst_null
    //   37199: athrow
    //   37200: aconst_null
    //   37201: athrow
    //   37202: aconst_null
    //   37203: athrow
    //   37204: aconst_null
    //   37205: athrow
    //   37206: aconst_null
    //   37207: athrow
    //   37208: aconst_null
    //   37209: athrow
    //   37210: aconst_null
    //   37211: athrow
    //   37212: aconst_null
    //   37213: athrow
    //   37214: aconst_null
    //   37215: athrow
    //   37216: aconst_null
    //   37217: athrow
    //   37218: aconst_null
    //   37219: athrow
    //   37220: aconst_null
    //   37221: athrow
    //   37222: aconst_null
    //   37223: athrow
    //   37224: aconst_null
    //   37225: athrow
    //   37226: aconst_null
    //   37227: athrow
    //   37228: aconst_null
    //   37229: athrow
    //   37230: aconst_null
    //   37231: athrow
    //   37232: aconst_null
    //   37233: athrow
    //   37234: aconst_null
    //   37235: athrow
    //   37236: aconst_null
    //   37237: athrow
    //   37238: aconst_null
    //   37239: athrow
    //   37240: aconst_null
    //   37241: athrow
    //   37242: aconst_null
    //   37243: athrow
    //   37244: aconst_null
    //   37245: athrow
    //   37246: aconst_null
    //   37247: athrow
    //   37248: aconst_null
    //   37249: athrow
    //   37250: aconst_null
    //   37251: athrow
    //   37252: aconst_null
    //   37253: athrow
    //   37254: aconst_null
    //   37255: athrow
    //   37256: aconst_null
    //   37257: athrow
    //   37258: aconst_null
    //   37259: athrow
    //   37260: aconst_null
    //   37261: athrow
    //   37262: aconst_null
    //   37263: athrow
    //   37264: aconst_null
    //   37265: athrow
    //   37266: aconst_null
    //   37267: athrow
    //   37268: aconst_null
    //   37269: athrow
    //   37270: aconst_null
    //   37271: athrow
    //   37272: aconst_null
    //   37273: athrow
    //   37274: aconst_null
    //   37275: athrow
    //   37276: aconst_null
    //   37277: athrow
    //   37278: aconst_null
    //   37279: athrow
    //   37280: aconst_null
    //   37281: athrow
    //   37282: aconst_null
    //   37283: athrow
    //   37284: aconst_null
    //   37285: athrow
    //   37286: aconst_null
    //   37287: athrow
    //   37288: aconst_null
    //   37289: athrow
    //   37290: aconst_null
    //   37291: athrow
    //   37292: aconst_null
    //   37293: athrow
    //   37294: aconst_null
    //   37295: athrow
    //   37296: aconst_null
    //   37297: athrow
    //   37298: aconst_null
    //   37299: athrow
    //   37300: aconst_null
    //   37301: athrow
    //   37302: aconst_null
    //   37303: athrow
    //   37304: aconst_null
    //   37305: athrow
    //   37306: aconst_null
    //   37307: athrow
    //   37308: aconst_null
    //   37309: athrow
    //   37310: aconst_null
    //   37311: athrow
    //   37312: aconst_null
    //   37313: athrow
    //   37314: aconst_null
    //   37315: athrow
    //   37316: aconst_null
    //   37317: athrow
    //   37318: aconst_null
    //   37319: athrow
    //   37320: aconst_null
    //   37321: athrow
    //   37322: aconst_null
    //   37323: athrow
    //   37324: aconst_null
    //   37325: athrow
    //   37326: aconst_null
    //   37327: athrow
    //   37328: aconst_null
    //   37329: athrow
    //   37330: aconst_null
    //   37331: athrow
    //   37332: aconst_null
    //   37333: athrow
    //   37334: aconst_null
    //   37335: athrow
    //   37336: aconst_null
    //   37337: athrow
    //   37338: aconst_null
    //   37339: athrow
    //   37340: aconst_null
    //   37341: athrow
    //   37342: aconst_null
    //   37343: athrow
    //   37344: aconst_null
    //   37345: athrow
    //   37346: aconst_null
    //   37347: athrow
    //   37348: aconst_null
    //   37349: athrow
    //   37350: aconst_null
    //   37351: athrow
    //   37352: aconst_null
    //   37353: athrow
    //   37354: aconst_null
    //   37355: athrow
    //   37356: aconst_null
    //   37357: athrow
    //   37358: aconst_null
    //   37359: athrow
    //   37360: aconst_null
    //   37361: athrow
    //   37362: aconst_null
    //   37363: athrow
    //   37364: aconst_null
    //   37365: athrow
    //   37366: aconst_null
    //   37367: athrow
    //   37368: aconst_null
    //   37369: athrow
    //   37370: aconst_null
    //   37371: athrow
    //   37372: aconst_null
    //   37373: athrow
    //   37374: aconst_null
    //   37375: athrow
    //   37376: aconst_null
    //   37377: athrow
    //   37378: aconst_null
    //   37379: athrow
    //   37380: aconst_null
    //   37381: athrow
    //   37382: aconst_null
    //   37383: athrow
    //   37384: aconst_null
    //   37385: athrow
    //   37386: aconst_null
    //   37387: athrow
    //   37388: aconst_null
    //   37389: athrow
    //   37390: aconst_null
    //   37391: athrow
    //   37392: aconst_null
    //   37393: athrow
    //   37394: aconst_null
    //   37395: athrow
    //   37396: aconst_null
    //   37397: athrow
    //   37398: aconst_null
    //   37399: athrow
    //   37400: aconst_null
    //   37401: athrow
    //   37402: aconst_null
    //   37403: athrow
    //   37404: aconst_null
    //   37405: athrow
    //   37406: aconst_null
    //   37407: athrow
    //   37408: aconst_null
    //   37409: athrow
    //   37410: aconst_null
    //   37411: athrow
    //   37412: aconst_null
    //   37413: athrow
    //   37414: aconst_null
    //   37415: athrow
    //   37416: aconst_null
    //   37417: athrow
    //   37418: aconst_null
    //   37419: athrow
    //   37420: aconst_null
    //   37421: athrow
    //   37422: aconst_null
    //   37423: athrow
    //   37424: aconst_null
    //   37425: athrow
    //   37426: aconst_null
    //   37427: athrow
    //   37428: aconst_null
    //   37429: athrow
    //   37430: aconst_null
    //   37431: athrow
    //   37432: aconst_null
    //   37433: athrow
    //   37434: aconst_null
    //   37435: athrow
    //   37436: aconst_null
    //   37437: athrow
    //   37438: aconst_null
    //   37439: athrow
    //   37440: aconst_null
    //   37441: athrow
    //   37442: aconst_null
    //   37443: athrow
    //   37444: aconst_null
    //   37445: athrow
    //   37446: aconst_null
    //   37447: athrow
    //   37448: aconst_null
    //   37449: athrow
    //   37450: aconst_null
    //   37451: athrow
    //   37452: aconst_null
    //   37453: athrow
    //   37454: aconst_null
    //   37455: athrow
    //   37456: aconst_null
    //   37457: athrow
    //   37458: aconst_null
    //   37459: athrow
    //   37460: aconst_null
    //   37461: athrow
    //   37462: aconst_null
    //   37463: athrow
    //   37464: aconst_null
    //   37465: athrow
    //   37466: aconst_null
    //   37467: athrow
    //   37468: aconst_null
    //   37469: athrow
    //   37470: aconst_null
    //   37471: athrow
    //   37472: aconst_null
    //   37473: athrow
    //   37474: aconst_null
    //   37475: athrow
    //   37476: aconst_null
    //   37477: athrow
    //   37478: aconst_null
    //   37479: athrow
    //   37480: aconst_null
    //   37481: athrow
    //   37482: aconst_null
    //   37483: athrow
    //   37484: aconst_null
    //   37485: athrow
    //   37486: aconst_null
    //   37487: athrow
    //   37488: aconst_null
    //   37489: athrow
    //   37490: aconst_null
    //   37491: athrow
    //   37492: aconst_null
    //   37493: athrow
    //   37494: aconst_null
    //   37495: athrow
    //   37496: aconst_null
    //   37497: athrow
    //   37498: aconst_null
    //   37499: athrow
    //   37500: aconst_null
    //   37501: athrow
    //   37502: aconst_null
    //   37503: athrow
    //   37504: aconst_null
    //   37505: athrow
    //   37506: aconst_null
    //   37507: athrow
    //   37508: aconst_null
    //   37509: athrow
    //   37510: aconst_null
    //   37511: athrow
    //   37512: aconst_null
    //   37513: athrow
    //   37514: aconst_null
    //   37515: athrow
    //   37516: aconst_null
    //   37517: athrow
    //   37518: aconst_null
    //   37519: athrow
    //   37520: aconst_null
    //   37521: athrow
    //   37522: aconst_null
    //   37523: athrow
    //   37524: aconst_null
    //   37525: athrow
    //   37526: aconst_null
    //   37527: athrow
    //   37528: aconst_null
    //   37529: athrow
    //   37530: aconst_null
    //   37531: athrow
    //   37532: aconst_null
    //   37533: athrow
    //   37534: aconst_null
    //   37535: athrow
    //   37536: aconst_null
    //   37537: athrow
    //   37538: aconst_null
    //   37539: athrow
    //   37540: aconst_null
    //   37541: athrow
    //   37542: aconst_null
    //   37543: athrow
    //   37544: aconst_null
    //   37545: athrow
    //   37546: aconst_null
    //   37547: athrow
    //   37548: aconst_null
    //   37549: athrow
    //   37550: aconst_null
    //   37551: athrow
    //   37552: aconst_null
    //   37553: athrow
    //   37554: aconst_null
    //   37555: athrow
    //   37556: aconst_null
    //   37557: athrow
    //   37558: aconst_null
    //   37559: athrow
    //   37560: aconst_null
    //   37561: athrow
    //   37562: aconst_null
    //   37563: athrow
    //   37564: aconst_null
    //   37565: athrow
    //   37566: aconst_null
    //   37567: athrow
    //   37568: aconst_null
    //   37569: athrow
    //   37570: aconst_null
    //   37571: athrow
    //   37572: aconst_null
    //   37573: athrow
    //   37574: aconst_null
    //   37575: athrow
    //   37576: aconst_null
    //   37577: athrow
    //   37578: aconst_null
    //   37579: athrow
    //   37580: aconst_null
    //   37581: athrow
    //   37582: aconst_null
    //   37583: athrow
    //   37584: aconst_null
    //   37585: athrow
    //   37586: aconst_null
    //   37587: athrow
    //   37588: aconst_null
    //   37589: athrow
    //   37590: aconst_null
    //   37591: athrow
    //   37592: aconst_null
    //   37593: athrow
    //   37594: aconst_null
    //   37595: athrow
    //   37596: aconst_null
    //   37597: athrow
    //   37598: aconst_null
    //   37599: athrow
    //   37600: aconst_null
    //   37601: athrow
    //   37602: aconst_null
    //   37603: athrow
    //   37604: aconst_null
    //   37605: athrow
    //   37606: aconst_null
    //   37607: athrow
    //   37608: aconst_null
    //   37609: athrow
    //   37610: aconst_null
    //   37611: athrow
    //   37612: aconst_null
    //   37613: athrow
    //   37614: aconst_null
    //   37615: athrow
    //   37616: aconst_null
    //   37617: athrow
    //   37618: aconst_null
    //   37619: athrow
    //   37620: aconst_null
    //   37621: athrow
    //   37622: aconst_null
    //   37623: athrow
    //   37624: aconst_null
    //   37625: athrow
    //   37626: aconst_null
    //   37627: athrow
    //   37628: aconst_null
    //   37629: athrow
    //   37630: aconst_null
    //   37631: athrow
    //   37632: aconst_null
    //   37633: athrow
    //   37634: aconst_null
    //   37635: athrow
    //   37636: aconst_null
    //   37637: athrow
    //   37638: aconst_null
    //   37639: athrow
    //   37640: aconst_null
    //   37641: athrow
    //   37642: aconst_null
    //   37643: athrow
    //   37644: aconst_null
    //   37645: athrow
    //   37646: aconst_null
    //   37647: athrow
    //   37648: aconst_null
    //   37649: athrow
    //   37650: aconst_null
    //   37651: athrow
    //   37652: aconst_null
    //   37653: athrow
    //   37654: aconst_null
    //   37655: athrow
    //   37656: aconst_null
    //   37657: athrow
    //   37658: aconst_null
    //   37659: athrow
    //   37660: aconst_null
    //   37661: athrow
    //   37662: aconst_null
    //   37663: athrow
    //   37664: aconst_null
    //   37665: athrow
    //   37666: aconst_null
    //   37667: athrow
    //   37668: aconst_null
    //   37669: athrow
    //   37670: aconst_null
    //   37671: athrow
    //   37672: aconst_null
    //   37673: athrow
    //   37674: aconst_null
    //   37675: athrow
    //   37676: aconst_null
    //   37677: athrow
    //   37678: aconst_null
    //   37679: athrow
    //   37680: aconst_null
    //   37681: athrow
    //   37682: aconst_null
    //   37683: athrow
    //   37684: aconst_null
    //   37685: athrow
    //   37686: aconst_null
    //   37687: athrow
    //   37688: aconst_null
    //   37689: athrow
    //   37690: aconst_null
    //   37691: athrow
    //   37692: aconst_null
    //   37693: athrow
    //   37694: aconst_null
    //   37695: athrow
    //   37696: aconst_null
    //   37697: athrow
    //   37698: aconst_null
    //   37699: athrow
    //   37700: aconst_null
    //   37701: athrow
    //   37702: aconst_null
    //   37703: athrow
    //   37704: aconst_null
    //   37705: athrow
    //   37706: aconst_null
    //   37707: athrow
    //   37708: aconst_null
    //   37709: athrow
    //   37710: aconst_null
    //   37711: athrow
    //   37712: aconst_null
    //   37713: athrow
    //   37714: aconst_null
    //   37715: athrow
    //   37716: aconst_null
    //   37717: athrow
    //   37718: aconst_null
    //   37719: athrow
    //   37720: aconst_null
    //   37721: athrow
    //   37722: aconst_null
    //   37723: athrow
    //   37724: aconst_null
    //   37725: athrow
    //   37726: aconst_null
    //   37727: athrow
    //   37728: aconst_null
    //   37729: athrow
    //   37730: aconst_null
    //   37731: athrow
    //   37732: aconst_null
    //   37733: athrow
    //   37734: aconst_null
    //   37735: athrow
    //   37736: aconst_null
    //   37737: athrow
    //   37738: aconst_null
    //   37739: athrow
    //   37740: aconst_null
    //   37741: athrow
    //   37742: aconst_null
    //   37743: athrow
    //   37744: aconst_null
    //   37745: athrow
    //   37746: aconst_null
    //   37747: athrow
    //   37748: aconst_null
    //   37749: athrow
    //   37750: aconst_null
    //   37751: athrow
    //   37752: aconst_null
    //   37753: athrow
    //   37754: aconst_null
    //   37755: athrow
    //   37756: aconst_null
    //   37757: athrow
    //   37758: aconst_null
    //   37759: athrow
    //   37760: aconst_null
    //   37761: athrow
    //   37762: aconst_null
    //   37763: athrow
    //   37764: aconst_null
    //   37765: athrow
    //   37766: aconst_null
    //   37767: athrow
    //   37768: aconst_null
    //   37769: athrow
    //   37770: aconst_null
    //   37771: athrow
    //   37772: aconst_null
    //   37773: athrow
    //   37774: aconst_null
    //   37775: athrow
    //   37776: aconst_null
    //   37777: athrow
    //   37778: aconst_null
    //   37779: athrow
    //   37780: aconst_null
    //   37781: athrow
    //   37782: aconst_null
    //   37783: athrow
    //   37784: aconst_null
    //   37785: athrow
    //   37786: aconst_null
    //   37787: athrow
    //   37788: aconst_null
    //   37789: athrow
    //   37790: aconst_null
    //   37791: athrow
    //   37792: aconst_null
    //   37793: athrow
    //   37794: aconst_null
    //   37795: athrow
    //   37796: aconst_null
    //   37797: athrow
    //   37798: aconst_null
    //   37799: athrow
    //   37800: aconst_null
    //   37801: athrow
    //   37802: aconst_null
    //   37803: athrow
    //   37804: aconst_null
    //   37805: athrow
    //   37806: aconst_null
    //   37807: athrow
    //   37808: aconst_null
    //   37809: athrow
    //   37810: aconst_null
    //   37811: athrow
    //   37812: aconst_null
    //   37813: athrow
    //   37814: aconst_null
    //   37815: athrow
    //   37816: aconst_null
    //   37817: athrow
    //   37818: aconst_null
    //   37819: athrow
    //   37820: aconst_null
    //   37821: athrow
    //   37822: aconst_null
    //   37823: athrow
    //   37824: aconst_null
    //   37825: athrow
    //   37826: aconst_null
    //   37827: athrow
    //   37828: aconst_null
    //   37829: athrow
    //   37830: aconst_null
    //   37831: athrow
    //   37832: aconst_null
    //   37833: athrow
    //   37834: aconst_null
    //   37835: athrow
    //   37836: aconst_null
    //   37837: athrow
    //   37838: aconst_null
    //   37839: athrow
    //   37840: aconst_null
    //   37841: athrow
    //   37842: aconst_null
    //   37843: athrow
    //   37844: aconst_null
    //   37845: athrow
    //   37846: aconst_null
    //   37847: athrow
    //   37848: aconst_null
    //   37849: athrow
    //   37850: aconst_null
    //   37851: athrow
    //   37852: aconst_null
    //   37853: athrow
    //   37854: aconst_null
    //   37855: athrow
    //   37856: aconst_null
    //   37857: athrow
    //   37858: aconst_null
    //   37859: athrow
    //   37860: aconst_null
    //   37861: athrow
    //   37862: aconst_null
    //   37863: athrow
    //   37864: aconst_null
    //   37865: athrow
    //   37866: aconst_null
    //   37867: athrow
    //   37868: aconst_null
    //   37869: athrow
    //   37870: aconst_null
    //   37871: athrow
    //   37872: aconst_null
    //   37873: athrow
    //   37874: aconst_null
    //   37875: athrow
    //   37876: aconst_null
    //   37877: athrow
    //   37878: aconst_null
    //   37879: athrow
    //   37880: aconst_null
    //   37881: athrow
    //   37882: aconst_null
    //   37883: athrow
    //   37884: aconst_null
    //   37885: athrow
    //   37886: aconst_null
    //   37887: athrow
    //   37888: aconst_null
    //   37889: athrow
    //   37890: aconst_null
    //   37891: athrow
    //   37892: aconst_null
    //   37893: athrow
    //   37894: aconst_null
    //   37895: athrow
    //   37896: aconst_null
    //   37897: athrow
    //   37898: aconst_null
    //   37899: athrow
    //   37900: aconst_null
    //   37901: athrow
    //   37902: aconst_null
    //   37903: athrow
    //   37904: aconst_null
    //   37905: athrow
    //   37906: aconst_null
    //   37907: athrow
    //   37908: aconst_null
    //   37909: athrow
    //   37910: aconst_null
    //   37911: athrow
    //   37912: aconst_null
    //   37913: athrow
    //   37914: aconst_null
    //   37915: athrow
    //   37916: aconst_null
    //   37917: athrow
    //   37918: aconst_null
    //   37919: athrow
    //   37920: aconst_null
    //   37921: athrow
    //   37922: aconst_null
    //   37923: athrow
    //   37924: aconst_null
    //   37925: athrow
    //   37926: aconst_null
    //   37927: athrow
    //   37928: aconst_null
    //   37929: athrow
    //   37930: aconst_null
    //   37931: athrow
    //   37932: aconst_null
    //   37933: athrow
    //   37934: aconst_null
    //   37935: athrow
    //   37936: aconst_null
    //   37937: athrow
    //   37938: aconst_null
    //   37939: athrow
    //   37940: aconst_null
    //   37941: athrow
    //   37942: aconst_null
    //   37943: athrow
    //   37944: aconst_null
    //   37945: athrow
    //   37946: aconst_null
    //   37947: athrow
    //   37948: aconst_null
    //   37949: athrow
    //   37950: aconst_null
    //   37951: athrow
    //   37952: aconst_null
    //   37953: athrow
    //   37954: aconst_null
    //   37955: athrow
    //   37956: aconst_null
    //   37957: athrow
    //   37958: aconst_null
    //   37959: athrow
    //   37960: aconst_null
    //   37961: athrow
    //   37962: aconst_null
    //   37963: athrow
    //   37964: aconst_null
    //   37965: athrow
    //   37966: aconst_null
    //   37967: athrow
    //   37968: aconst_null
    //   37969: athrow
    //   37970: aconst_null
    //   37971: athrow
    //   37972: aconst_null
    //   37973: athrow
    //   37974: aconst_null
    //   37975: athrow
    //   37976: aconst_null
    //   37977: athrow
    //   37978: aconst_null
    //   37979: athrow
    //   37980: aconst_null
    //   37981: athrow
    //   37982: aconst_null
    //   37983: athrow
    //   37984: aconst_null
    //   37985: athrow
    //   37986: aconst_null
    //   37987: athrow
    //   37988: aconst_null
    //   37989: athrow
    //   37990: aconst_null
    //   37991: athrow
    //   37992: aconst_null
    //   37993: athrow
    //   37994: aconst_null
    //   37995: athrow
    //   37996: aconst_null
    //   37997: athrow
    //   37998: aconst_null
    //   37999: athrow
    //   38000: aconst_null
    //   38001: athrow
    //   38002: aconst_null
    //   38003: athrow
    //   38004: aconst_null
    //   38005: athrow
    //   38006: aconst_null
    //   38007: athrow
    //   38008: aconst_null
    //   38009: athrow
    //   38010: aconst_null
    //   38011: athrow
    //   38012: aconst_null
    //   38013: athrow
    //   38014: aconst_null
    //   38015: athrow
    //   38016: aconst_null
    //   38017: athrow
    //   38018: aconst_null
    //   38019: athrow
    //   38020: aconst_null
    //   38021: athrow
    //   38022: aconst_null
    //   38023: athrow
    //   38024: aconst_null
    //   38025: athrow
    //   38026: aconst_null
    //   38027: athrow
    //   38028: aconst_null
    //   38029: athrow
    //   38030: aconst_null
    //   38031: athrow
    //   38032: aconst_null
    //   38033: athrow
    //   38034: aconst_null
    //   38035: athrow
    //   38036: aconst_null
    //   38037: athrow
    //   38038: aconst_null
    //   38039: athrow
    //   38040: aconst_null
    //   38041: athrow
    //   38042: aconst_null
    //   38043: athrow
    //   38044: aconst_null
    //   38045: athrow
    //   38046: aconst_null
    //   38047: athrow
    //   38048: aconst_null
    //   38049: athrow
    //   38050: aconst_null
    //   38051: athrow
    //   38052: aconst_null
    //   38053: athrow
    //   38054: aconst_null
    //   38055: athrow
    //   38056: aconst_null
    //   38057: athrow
    //   38058: aconst_null
    //   38059: athrow
    //   38060: aconst_null
    //   38061: athrow
    //   38062: aconst_null
    //   38063: athrow
    //   38064: aconst_null
    //   38065: athrow
    //   38066: aconst_null
    //   38067: athrow
    //   38068: aconst_null
    //   38069: athrow
    //   38070: aconst_null
    //   38071: athrow
    //   38072: aconst_null
    //   38073: athrow
    //   38074: aconst_null
    //   38075: athrow
    //   38076: aconst_null
    //   38077: athrow
    //   38078: aconst_null
    //   38079: athrow
    //   38080: aconst_null
    //   38081: athrow
    //   38082: aconst_null
    //   38083: athrow
    //   38084: aconst_null
    //   38085: athrow
    //   38086: aconst_null
    //   38087: athrow
    //   38088: aconst_null
    //   38089: athrow
    //   38090: aconst_null
    //   38091: athrow
    //   38092: aconst_null
    //   38093: athrow
    //   38094: aconst_null
    //   38095: athrow
    //   38096: aconst_null
    //   38097: athrow
    //   38098: aconst_null
    //   38099: athrow
    //   38100: aconst_null
    //   38101: athrow
    //   38102: aconst_null
    //   38103: athrow
    //   38104: aconst_null
    //   38105: athrow
    //   38106: aconst_null
    //   38107: athrow
    //   38108: aconst_null
    //   38109: athrow
    //   38110: aconst_null
    //   38111: athrow
    //   38112: aconst_null
    //   38113: athrow
    //   38114: aconst_null
    //   38115: athrow
    //   38116: aconst_null
    //   38117: athrow
    //   38118: aconst_null
    //   38119: athrow
    //   38120: aconst_null
    //   38121: athrow
    //   38122: aconst_null
    //   38123: athrow
    //   38124: aconst_null
    //   38125: athrow
    //   38126: aconst_null
    //   38127: athrow
    //   38128: aconst_null
    //   38129: athrow
    //   38130: aconst_null
    //   38131: athrow
    //   38132: aconst_null
    //   38133: athrow
    //   38134: aconst_null
    //   38135: athrow
    //   38136: aconst_null
    //   38137: athrow
    //   38138: aconst_null
    //   38139: athrow
    //   38140: aconst_null
    //   38141: athrow
    //   38142: aconst_null
    //   38143: athrow
    //   38144: aconst_null
    //   38145: athrow
    //   38146: aconst_null
    //   38147: athrow
    //   38148: aconst_null
    //   38149: athrow
    //   38150: aconst_null
    //   38151: athrow
    //   38152: aconst_null
    //   38153: athrow
    //   38154: aconst_null
    //   38155: athrow
    //   38156: aconst_null
    //   38157: athrow
    //   38158: aconst_null
    //   38159: athrow
    //   38160: aconst_null
    //   38161: athrow
    //   38162: aconst_null
    //   38163: athrow
    //   38164: aconst_null
    //   38165: athrow
    //   38166: aconst_null
    //   38167: athrow
    //   38168: aconst_null
    //   38169: athrow
    //   38170: aconst_null
    //   38171: athrow
    //   38172: aconst_null
    //   38173: athrow
    //   38174: aconst_null
    //   38175: athrow
    //   38176: aconst_null
    //   38177: athrow
    //   38178: aconst_null
    //   38179: athrow
    //   38180: aconst_null
    //   38181: athrow
    //   38182: aconst_null
    //   38183: athrow
    //   38184: aconst_null
    //   38185: athrow
    //   38186: aconst_null
    //   38187: athrow
    //   38188: aconst_null
    //   38189: athrow
    //   38190: pop
    //   38191: goto_w -> 36
    //   38196: pop
    //   38197: aconst_null
    //   38198: goto -> 38190
    //   38201: dup
    //   38202: ifnull -> 38190
    //   38205: checkcast java/lang/Throwable
    //   38208: athrow
    //   38209: dup
    //   38210: ifnull -> 38196
    //   38213: checkcast java/lang/Throwable
    //   38216: athrow
    //   38217: aconst_null
    //   38218: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   7894	1803	13	c	C
    //   6922	2781	7	arrayOfInt	[I
    //   7118	2585	8	stringToCharArray	[C
    //   7194	2509	9	f	F
    //   13426	1803	13	c	C
    //   12454	2781	7	arrayOfInt	[I
    //   12650	2585	8	stringToCharArray	[C
    //   12726	2509	9	f	F
    //   18714	1819	13	c	C
    //   17742	2797	7	arrayOfInt	[I
    //   17938	2601	8	stringToCharArray	[C
    //   18014	2525	9	f	F
    //   24022	1819	13	c	C
    //   23046	2801	7	arrayOfInt	[I
    //   23246	2601	8	stringToCharArray	[C
    //   23322	2525	9	f	F
    //   29330	1819	13	c	C
    //   28354	2801	7	arrayOfInt	[I
    //   28554	2601	8	stringToCharArray	[C
    //   28630	2525	9	f	F
    //   34914	1819	13	c	C
    //   33938	2801	7	arrayOfInt	[I
    //   34138	2601	8	stringToCharArray	[C
    //   34214	2525	9	f	F
    //   36	37124	0	this	Lbigname/zprestige/webhack/features/modules/Hud/PvpInfo;
    //   641	36519	1	caOn	Ljava/lang/String;
    //   1249	35911	2	caOff	Ljava/lang/String;
    //   1885	35275	3	suOn	Ljava/lang/String;
    //   2522	34638	4	suOff	Ljava/lang/String;
    //   3162	33998	5	flOn	Ljava/lang/String;
    //   3802	33358	6	flOff	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   13	32	38201	java/lang/IndexOutOfBoundsException
    //   99	106	106	finally
    //   99	106	3	finally
    //   99	106	99	finally
    //   99	106	99	finally
    //   100	106	106	java/lang/NullPointerException
    //   172	178	178	finally
    //   172	178	3	finally
    //   172	178	3	finally
    //   172	178	178	finally
    //   172	178	178	java/lang/ArrayIndexOutOfBoundsException
    //   239	246	246	finally
    //   239	246	239	java/lang/ArrayIndexOutOfBoundsException
    //   239	246	3	java/lang/ArithmeticException
    //   239	246	246	finally
    //   239	246	246	java/lang/StringIndexOutOfBoundsException
    //   367	374	374	finally
    //   368	374	374	finally
    //   368	374	374	java/lang/IllegalStateException
    //   368	374	367	finally
    //   368	374	3	finally
    //   439	446	446	finally
    //   439	446	439	finally
    //   439	446	446	java/lang/RuntimeException
    //   440	446	439	java/lang/StringIndexOutOfBoundsException
    //   440	446	3	java/util/NoSuchElementException
    //   507	514	514	finally
    //   507	514	507	java/lang/IllegalStateException
    //   508	514	514	finally
    //   508	514	3	java/lang/IllegalStateException
    //   508	514	507	finally
    //   575	582	582	finally
    //   575	582	575	java/lang/IllegalArgumentException
    //   575	582	3	finally
    //   575	582	582	finally
    //   576	582	582	finally
    //   707	714	714	finally
    //   707	714	714	java/lang/ClassCastException
    //   707	714	714	java/lang/RuntimeException
    //   708	714	714	finally
    //   708	714	707	finally
    //   779	786	786	finally
    //   779	786	779	java/lang/RuntimeException
    //   779	786	779	finally
    //   780	786	786	java/lang/IllegalStateException
    //   780	786	779	java/lang/NullPointerException
    //   847	854	854	finally
    //   847	854	3	finally
    //   848	854	854	finally
    //   848	854	847	java/lang/EnumConstantNotPresentException
    //   848	854	854	java/lang/IndexOutOfBoundsException
    //   975	982	982	finally
    //   975	982	3	finally
    //   976	982	975	java/lang/RuntimeException
    //   976	982	3	finally
    //   976	982	975	java/lang/IllegalStateException
    //   1047	1054	1054	finally
    //   1047	1054	1047	java/lang/EnumConstantNotPresentException
    //   1047	1054	1054	finally
    //   1048	1054	1054	java/lang/RuntimeException
    //   1048	1054	1054	java/util/ConcurrentModificationException
    //   1115	1122	1122	finally
    //   1115	1122	1115	java/lang/NegativeArraySizeException
    //   1116	1122	1115	finally
    //   1116	1122	3	finally
    //   1116	1122	3	finally
    //   1183	1190	1190	finally
    //   1183	1190	1183	java/lang/IllegalStateException
    //   1184	1190	1190	java/lang/ArrayIndexOutOfBoundsException
    //   1184	1190	1183	java/lang/ArithmeticException
    //   1184	1190	1190	java/lang/NullPointerException
    //   1315	1322	1322	finally
    //   1315	1322	1322	java/lang/IndexOutOfBoundsException
    //   1315	1322	1315	java/lang/ArithmeticException
    //   1316	1322	1315	java/lang/ArithmeticException
    //   1316	1322	1315	java/lang/ArithmeticException
    //   1391	1398	1398	finally
    //   1391	1398	1391	java/lang/ClassCastException
    //   1392	1398	3	finally
    //   1392	1398	3	java/util/ConcurrentModificationException
    //   1392	1398	3	java/lang/NumberFormatException
    //   1463	1470	1470	finally
    //   1463	1470	1470	finally
    //   1463	1470	1463	java/lang/StringIndexOutOfBoundsException
    //   1463	1470	1470	java/lang/EnumConstantNotPresentException
    //   1464	1470	1470	finally
    //   1599	1606	1606	finally
    //   1599	1606	1599	finally
    //   1599	1606	1606	java/lang/ArithmeticException
    //   1600	1606	3	finally
    //   1600	1606	1599	finally
    //   1671	1678	1678	finally
    //   1671	1678	1671	finally
    //   1672	1678	3	finally
    //   1672	1678	1678	java/lang/RuntimeException
    //   1672	1678	1671	finally
    //   1744	1750	1750	finally
    //   1744	1750	3	finally
    //   1744	1750	3	java/lang/ArithmeticException
    //   1744	1750	1750	java/lang/IllegalStateException
    //   1744	1750	1750	finally
    //   1815	1822	1822	finally
    //   1815	1822	1815	finally
    //   1815	1822	1815	java/lang/NumberFormatException
    //   1815	1822	1815	java/lang/NegativeArraySizeException
    //   1816	1822	3	java/util/NoSuchElementException
    //   1951	1958	1958	finally
    //   1951	1958	1951	finally
    //   1951	1958	1951	finally
    //   1952	1958	1958	finally
    //   1952	1958	1951	finally
    //   2027	2034	2034	finally
    //   2027	2034	3	finally
    //   2027	2034	2034	java/util/NoSuchElementException
    //   2028	2034	2027	java/lang/UnsupportedOperationException
    //   2028	2034	2027	java/lang/ArithmeticException
    //   2099	2106	2106	finally
    //   2099	2106	3	finally
    //   2099	2106	2099	java/lang/ArithmeticException
    //   2099	2106	2106	finally
    //   2100	2106	3	finally
    //   2235	2242	2242	finally
    //   2235	2242	2235	finally
    //   2235	2242	2235	finally
    //   2236	2242	3	finally
    //   2236	2242	2242	java/lang/NumberFormatException
    //   2308	2314	2314	finally
    //   2308	2314	3	java/lang/UnsupportedOperationException
    //   2308	2314	3	finally
    //   2308	2314	3	finally
    //   2308	2314	2314	finally
    //   2379	2386	2386	finally
    //   2379	2386	2386	finally
    //   2379	2386	3	java/lang/UnsupportedOperationException
    //   2379	2386	2379	java/lang/RuntimeException
    //   2380	2386	2386	java/util/NoSuchElementException
    //   2452	2458	2458	finally
    //   2452	2458	3	finally
    //   2452	2458	2458	java/util/NoSuchElementException
    //   2452	2458	2458	java/lang/NullPointerException
    //   2452	2458	3	java/lang/RuntimeException
    //   2591	2598	2598	finally
    //   2591	2598	2591	finally
    //   2591	2598	2591	java/lang/ArrayIndexOutOfBoundsException
    //   2592	2598	3	finally
    //   2592	2598	2591	java/lang/EnumConstantNotPresentException
    //   2667	2674	2674	finally
    //   2667	2674	2667	java/lang/UnsupportedOperationException
    //   2668	2674	3	java/lang/NullPointerException
    //   2668	2674	3	java/lang/IndexOutOfBoundsException
    //   2668	2674	2667	java/lang/IllegalStateException
    //   2739	2746	2746	finally
    //   2739	2746	2746	finally
    //   2739	2746	3	finally
    //   2740	2746	3	java/lang/ArithmeticException
    //   2740	2746	2739	finally
    //   2875	2882	2882	finally
    //   2875	2882	2875	java/lang/IndexOutOfBoundsException
    //   2875	2882	2875	java/lang/ClassCastException
    //   2875	2882	3	java/lang/NegativeArraySizeException
    //   2876	2882	2875	java/lang/ArrayIndexOutOfBoundsException
    //   2948	2954	2954	finally
    //   2948	2954	3	java/lang/EnumConstantNotPresentException
    //   2948	2954	2954	java/lang/ArithmeticException
    //   2948	2954	2954	finally
    //   2948	2954	2954	finally
    //   3019	3026	3026	finally
    //   3019	3026	3026	java/lang/RuntimeException
    //   3019	3026	3019	java/lang/NegativeArraySizeException
    //   3019	3026	3026	finally
    //   3020	3026	3	finally
    //   3092	3098	3098	finally
    //   3092	3098	3	finally
    //   3092	3098	3098	finally
    //   3092	3098	3	java/lang/IllegalStateException
    //   3092	3098	3	java/lang/RuntimeException
    //   3231	3238	3238	finally
    //   3231	3238	3	java/lang/UnsupportedOperationException
    //   3231	3238	3231	java/lang/AssertionError
    //   3231	3238	3	finally
    //   3232	3238	3	finally
    //   3307	3314	3314	finally
    //   3307	3314	3	finally
    //   3308	3314	3307	java/util/NoSuchElementException
    //   3308	3314	3314	finally
    //   3308	3314	3307	java/lang/UnsupportedOperationException
    //   3379	3386	3386	finally
    //   3379	3386	3379	finally
    //   3379	3386	3386	java/util/ConcurrentModificationException
    //   3379	3386	3	java/lang/ArithmeticException
    //   3380	3386	3	java/lang/UnsupportedOperationException
    //   3516	3522	3522	finally
    //   3516	3522	3522	java/lang/IllegalArgumentException
    //   3516	3522	3522	finally
    //   3516	3522	3	finally
    //   3516	3522	3	java/lang/NegativeArraySizeException
    //   3587	3594	3594	finally
    //   3587	3594	3	finally
    //   3588	3594	3	java/lang/ArrayIndexOutOfBoundsException
    //   3588	3594	3594	finally
    //   3588	3594	3587	finally
    //   3659	3666	3666	finally
    //   3659	3666	3666	java/lang/NegativeArraySizeException
    //   3659	3666	3666	java/lang/ArrayIndexOutOfBoundsException
    //   3659	3666	3659	java/lang/RuntimeException
    //   3660	3666	3659	finally
    //   3731	3738	3738	finally
    //   3731	3738	3	finally
    //   3731	3738	3731	finally
    //   3731	3738	3	java/util/NoSuchElementException
    //   3732	3738	3731	java/util/NoSuchElementException
    //   3927	3934	3934	finally
    //   3927	3934	3927	java/util/ConcurrentModificationException
    //   3928	3934	3927	java/lang/IndexOutOfBoundsException
    //   3928	3934	3934	finally
    //   3928	3934	3	finally
    //   4064	4070	4070	finally
    //   4064	4070	3	java/util/NoSuchElementException
    //   4064	4070	4070	finally
    //   4064	4070	3	java/lang/NegativeArraySizeException
    //   4064	4070	4070	finally
    //   4139	4146	4146	finally
    //   4139	4146	4139	finally
    //   4139	4146	4146	java/lang/ArithmeticException
    //   4140	4146	4146	finally
    //   4140	4146	4139	finally
    //   4211	4218	4218	finally
    //   4212	4218	4211	finally
    //   4212	4218	3	finally
    //   4212	4218	4211	java/lang/IndexOutOfBoundsException
    //   4212	4218	3	java/lang/ClassCastException
    //   4347	4354	4354	finally
    //   4347	4354	4347	finally
    //   4347	4354	3	finally
    //   4347	4354	4354	finally
    //   4348	4354	3	java/util/NoSuchElementException
    //   4423	4430	4430	finally
    //   4423	4430	4423	java/lang/AssertionError
    //   4423	4430	4423	java/lang/AssertionError
    //   4424	4430	3	finally
    //   4424	4430	4430	finally
    //   4496	4502	4502	finally
    //   4496	4502	4502	finally
    //   4496	4502	4502	java/util/ConcurrentModificationException
    //   4496	4502	3	java/lang/NullPointerException
    //   4496	4502	4502	finally
    //   4632	4638	4638	finally
    //   4632	4638	4638	finally
    //   4632	4638	4638	finally
    //   4632	4638	4638	java/lang/ArrayIndexOutOfBoundsException
    //   4632	4638	3	finally
    //   4707	4714	4714	finally
    //   4707	4714	4714	finally
    //   4707	4714	4707	java/lang/AssertionError
    //   4708	4714	3	finally
    //   4708	4714	4714	finally
    //   4779	4786	4786	finally
    //   4779	4786	3	finally
    //   4779	4786	4779	finally
    //   4779	4786	4786	java/lang/ArithmeticException
    //   4780	4786	3	java/lang/ArithmeticException
    //   4983	4990	4990	finally
    //   4984	4990	3	finally
    //   4984	4990	3	java/lang/StringIndexOutOfBoundsException
    //   4984	4990	4990	java/util/ConcurrentModificationException
    //   4984	4990	4983	finally
    //   5055	5062	5062	finally
    //   5056	5062	3	java/lang/IndexOutOfBoundsException
    //   5056	5062	5062	finally
    //   5056	5062	5055	java/lang/ArithmeticException
    //   5056	5062	3	java/lang/ClassCastException
    //   5127	5134	5134	finally
    //   5128	5134	5127	finally
    //   5128	5134	5127	finally
    //   5128	5134	3	java/util/ConcurrentModificationException
    //   5128	5134	3	java/lang/NumberFormatException
    //   5251	5258	5258	finally
    //   5251	5258	5251	java/lang/StringIndexOutOfBoundsException
    //   5252	5258	3	java/lang/AssertionError
    //   5252	5258	5251	finally
    //   5252	5258	5258	java/lang/AssertionError
    //   5387	5394	5394	finally
    //   5387	5394	5387	finally
    //   5388	5394	3	java/lang/EnumConstantNotPresentException
    //   5388	5394	3	finally
    //   5388	5394	5387	finally
    //   5464	5470	5470	finally
    //   5464	5470	3	java/lang/EnumConstantNotPresentException
    //   5464	5470	3	java/util/ConcurrentModificationException
    //   5464	5470	3	finally
    //   5464	5470	5470	finally
    //   5587	5594	5594	finally
    //   5588	5594	5587	finally
    //   5588	5594	5594	java/util/NoSuchElementException
    //   5588	5594	5587	finally
    //   5588	5594	5594	finally
    //   5723	5730	5730	finally
    //   5723	5730	3	java/lang/IllegalStateException
    //   5723	5730	3	java/lang/AssertionError
    //   5724	5730	5730	finally
    //   5724	5730	5723	finally
    //   6235	6242	6242	finally
    //   6235	6242	6235	java/lang/IllegalArgumentException
    //   6236	6242	3	finally
    //   6236	6242	6242	java/lang/StringIndexOutOfBoundsException
    //   6236	6242	3	java/lang/EnumConstantNotPresentException
    //   6311	6318	6318	finally
    //   6311	6318	6311	finally
    //   6312	6318	6318	java/lang/IndexOutOfBoundsException
    //   6312	6318	3	java/lang/UnsupportedOperationException
    //   6312	6318	6318	java/util/ConcurrentModificationException
    //   6383	6390	6390	finally
    //   6383	6390	3	java/lang/UnsupportedOperationException
    //   6383	6390	6390	java/lang/IndexOutOfBoundsException
    //   6383	6390	6383	finally
    //   6384	6390	6383	finally
    //   6520	6526	6526	finally
    //   6520	6526	6526	finally
    //   6520	6526	3	finally
    //   6520	6526	6526	java/lang/UnsupportedOperationException
    //   6520	6526	3	finally
    //   6595	6602	6602	finally
    //   6595	6602	6595	java/lang/IllegalArgumentException
    //   6595	6602	6595	finally
    //   6596	6602	6602	finally
    //   6596	6602	6595	finally
    //   6667	6674	6674	finally
    //   6667	6674	3	finally
    //   6667	6674	6667	finally
    //   6667	6674	6667	java/lang/NegativeArraySizeException
    //   6668	6674	6667	finally
    //   6739	6746	6746	finally
    //   6739	6746	6746	finally
    //   6739	6746	3	java/lang/NullPointerException
    //   6740	6746	6746	java/lang/ArrayIndexOutOfBoundsException
    //   6740	6746	6739	java/lang/ArrayIndexOutOfBoundsException
    //   6819	6826	6826	finally
    //   6819	6826	6826	finally
    //   6819	6826	3	finally
    //   6819	6826	6819	java/lang/ArrayIndexOutOfBoundsException
    //   6820	6826	3	java/lang/NullPointerException
    //   7047	7054	7054	finally
    //   7047	7054	3	java/lang/NumberFormatException
    //   7047	7054	7054	java/lang/ClassCastException
    //   7047	7054	7047	finally
    //   7048	7054	3	finally
    //   8147	8154	8154	finally
    //   8147	8154	8147	java/lang/NumberFormatException
    //   8147	8154	3	java/lang/IllegalStateException
    //   8148	8154	8154	finally
    //   8148	8154	8154	finally
    //   8419	8426	8426	finally
    //   8419	8426	8426	java/lang/NegativeArraySizeException
    //   8420	8426	3	java/lang/NegativeArraySizeException
    //   8420	8426	3	java/lang/StringIndexOutOfBoundsException
    //   8420	8426	8419	finally
    //   8495	8502	8502	finally
    //   8495	8502	8495	finally
    //   8496	8502	3	finally
    //   8496	8502	3	finally
    //   8496	8502	3	java/lang/IndexOutOfBoundsException
    //   8639	8646	8646	finally
    //   8639	8646	8646	finally
    //   8640	8646	3	finally
    //   8640	8646	8639	finally
    //   8640	8646	3	finally
    //   8775	8782	8782	finally
    //   8775	8782	3	java/lang/AssertionError
    //   8775	8782	3	finally
    //   8775	8782	3	java/lang/NullPointerException
    //   8776	8782	8775	java/lang/IllegalStateException
    //   8851	8858	8858	finally
    //   8851	8858	8858	finally
    //   8851	8858	8851	java/util/NoSuchElementException
    //   8851	8858	8858	java/lang/IllegalArgumentException
    //   8852	8858	8858	java/lang/IllegalArgumentException
    //   8923	8930	8930	finally
    //   8923	8930	3	finally
    //   8923	8930	3	finally
    //   8924	8930	8923	java/lang/NullPointerException
    //   8924	8930	8923	finally
    //   8995	9002	9002	finally
    //   8995	9002	8995	java/util/ConcurrentModificationException
    //   8995	9002	9002	java/lang/NumberFormatException
    //   8995	9002	9002	java/lang/RuntimeException
    //   8996	9002	8995	finally
    //   9075	9082	9082	finally
    //   9075	9082	3	finally
    //   9075	9082	9075	finally
    //   9076	9082	9075	java/lang/ArrayIndexOutOfBoundsException
    //   9076	9082	3	java/lang/UnsupportedOperationException
    //   9399	9406	9406	finally
    //   9399	9406	3	java/util/ConcurrentModificationException
    //   9399	9406	9399	finally
    //   9399	9406	9399	finally
    //   9400	9406	9406	java/util/NoSuchElementException
    //   9471	9478	9478	finally
    //   9472	9478	9471	java/lang/RuntimeException
    //   9472	9478	9471	finally
    //   9472	9478	9471	finally
    //   9472	9478	9478	java/lang/RuntimeException
    //   10095	10102	10102	finally
    //   10095	10102	10102	java/util/NoSuchElementException
    //   10095	10102	3	java/lang/EnumConstantNotPresentException
    //   10096	10102	10095	finally
    //   10096	10102	10095	finally
    //   10171	10178	10178	finally
    //   10171	10178	3	finally
    //   10171	10178	3	java/lang/ArrayIndexOutOfBoundsException
    //   10171	10178	10171	java/lang/ArrayIndexOutOfBoundsException
    //   10172	10178	10178	finally
    //   10375	10382	10382	finally
    //   10375	10382	10382	finally
    //   10375	10382	3	java/lang/AssertionError
    //   10375	10382	10375	finally
    //   10375	10382	10382	java/lang/RuntimeException
    //   10515	10522	10522	finally
    //   10516	10522	3	finally
    //   10516	10522	3	java/lang/RuntimeException
    //   10516	10522	10515	java/lang/StringIndexOutOfBoundsException
    //   10516	10522	10522	java/lang/RuntimeException
    //   10587	10594	10594	finally
    //   10587	10594	3	finally
    //   10588	10594	3	java/lang/ClassCastException
    //   10588	10594	10587	finally
    //   10588	10594	10594	finally
    //   10659	10666	10666	finally
    //   10659	10666	10659	finally
    //   10660	10666	10659	java/lang/StringIndexOutOfBoundsException
    //   10660	10666	3	java/lang/IllegalArgumentException
    //   10660	10666	3	java/lang/IndexOutOfBoundsException
    //   10783	10790	10790	finally
    //   10783	10790	10790	java/lang/StringIndexOutOfBoundsException
    //   10783	10790	10790	java/lang/NegativeArraySizeException
    //   10783	10790	10783	java/lang/IllegalArgumentException
    //   10784	10790	10790	finally
    //   10920	10926	10926	finally
    //   10920	10926	10926	finally
    //   10920	10926	3	java/lang/RuntimeException
    //   10920	10926	10926	java/lang/AssertionError
    //   10920	10926	3	finally
    //   10995	11002	11002	finally
    //   10995	11002	11002	java/lang/EnumConstantNotPresentException
    //   10995	11002	10995	java/lang/ArithmeticException
    //   10995	11002	3	java/lang/IndexOutOfBoundsException
    //   10996	11002	11002	java/lang/IllegalArgumentException
    //   11120	11126	11126	finally
    //   11120	11126	3	java/util/ConcurrentModificationException
    //   11120	11126	11126	java/util/ConcurrentModificationException
    //   11120	11126	11126	finally
    //   11120	11126	11126	java/lang/EnumConstantNotPresentException
    //   11255	11262	11262	finally
    //   11255	11262	11262	java/lang/StringIndexOutOfBoundsException
    //   11256	11262	11255	finally
    //   11256	11262	11262	finally
    //   11256	11262	3	finally
    //   11767	11774	11774	finally
    //   11767	11774	11767	java/lang/RuntimeException
    //   11767	11774	3	java/lang/IllegalStateException
    //   11767	11774	3	finally
    //   11767	11774	11774	java/lang/StringIndexOutOfBoundsException
    //   11843	11850	11850	finally
    //   11843	11850	3	java/lang/IllegalArgumentException
    //   11843	11850	3	finally
    //   11843	11850	11843	finally
    //   11844	11850	11843	finally
    //   11915	11922	11922	finally
    //   11915	11922	11915	finally
    //   11915	11922	11915	java/lang/ClassCastException
    //   11916	11922	3	finally
    //   11916	11922	11915	java/lang/IndexOutOfBoundsException
    //   12051	12058	12058	finally
    //   12052	12058	12058	finally
    //   12052	12058	12051	finally
    //   12052	12058	12058	finally
    //   12052	12058	12058	finally
    //   12128	12134	12134	finally
    //   12128	12134	12134	java/lang/IndexOutOfBoundsException
    //   12128	12134	3	finally
    //   12128	12134	3	java/lang/AssertionError
    //   12128	12134	3	java/lang/IndexOutOfBoundsException
    //   12199	12206	12206	finally
    //   12199	12206	12199	java/lang/IllegalArgumentException
    //   12200	12206	12199	finally
    //   12200	12206	12206	finally
    //   12200	12206	3	java/lang/NegativeArraySizeException
    //   12271	12278	12278	finally
    //   12271	12278	12271	finally
    //   12271	12278	3	java/lang/ArithmeticException
    //   12272	12278	12278	java/lang/ArithmeticException
    //   12272	12278	3	finally
    //   12351	12358	12358	finally
    //   12351	12358	12358	java/util/NoSuchElementException
    //   12351	12358	12358	java/lang/EnumConstantNotPresentException
    //   12351	12358	12351	java/lang/NegativeArraySizeException
    //   12351	12358	12351	finally
    //   12579	12586	12586	finally
    //   12579	12586	12579	finally
    //   12579	12586	12586	java/lang/IllegalArgumentException
    //   12579	12586	12579	finally
    //   12580	12586	12586	java/lang/ArrayIndexOutOfBoundsException
    //   13679	13686	13686	finally
    //   13679	13686	13686	finally
    //   13680	13686	3	java/lang/IllegalStateException
    //   13680	13686	13679	java/util/ConcurrentModificationException
    //   13680	13686	13686	finally
    //   13951	13958	13958	finally
    //   13951	13958	13951	finally
    //   13952	13958	13958	finally
    //   13952	13958	13958	finally
    //   13952	13958	3	finally
    //   14027	14034	14034	finally
    //   14027	14034	14034	finally
    //   14027	14034	14034	finally
    //   14028	14034	14034	finally
    //   14028	14034	14027	finally
    //   14172	14178	14178	finally
    //   14172	14178	3	java/lang/NegativeArraySizeException
    //   14172	14178	14178	java/lang/IllegalArgumentException
    //   14172	14178	3	java/lang/IllegalArgumentException
    //   14172	14178	3	finally
    //   14307	14314	14314	finally
    //   14307	14314	3	finally
    //   14308	14314	14314	finally
    //   14308	14314	14307	finally
    //   14308	14314	3	finally
    //   14383	14390	14390	finally
    //   14383	14390	14383	java/lang/IndexOutOfBoundsException
    //   14384	14390	14383	java/lang/IllegalArgumentException
    //   14384	14390	3	java/util/NoSuchElementException
    //   14384	14390	14383	finally
    //   14455	14462	14462	finally
    //   14455	14462	14462	finally
    //   14456	14462	14455	finally
    //   14456	14462	3	java/lang/AssertionError
    //   14456	14462	14462	java/lang/StringIndexOutOfBoundsException
    //   14528	14534	14534	finally
    //   14528	14534	3	java/lang/NegativeArraySizeException
    //   14528	14534	3	finally
    //   14528	14534	3	java/util/ConcurrentModificationException
    //   14528	14534	14534	finally
    //   14607	14614	14614	finally
    //   14607	14614	14607	finally
    //   14607	14614	14614	finally
    //   14608	14614	14614	finally
    //   14608	14614	3	finally
    //   14931	14938	14938	finally
    //   14931	14938	14938	java/lang/RuntimeException
    //   14931	14938	14931	java/lang/NegativeArraySizeException
    //   14932	14938	14931	finally
    //   14932	14938	14931	java/lang/RuntimeException
    //   15003	15010	15010	finally
    //   15003	15010	3	java/lang/NegativeArraySizeException
    //   15003	15010	15003	finally
    //   15004	15010	15010	finally
    //   15004	15010	15010	finally
    //   15648	15654	15654	finally
    //   15648	15654	3	java/lang/NumberFormatException
    //   15648	15654	3	java/lang/NumberFormatException
    //   15648	15654	3	java/lang/NumberFormatException
    //   15648	15654	3	finally
    //   15787	15794	15794	finally
    //   15787	15794	15787	finally
    //   15787	15794	3	java/lang/NullPointerException
    //   15788	15794	3	java/lang/ClassCastException
    //   15788	15794	15787	java/lang/ClassCastException
    //   15859	15866	15866	finally
    //   15859	15866	15859	java/lang/NegativeArraySizeException
    //   15859	15866	3	java/lang/IllegalStateException
    //   15859	15866	15859	finally
    //   15860	15866	15866	finally
    //   15931	15938	15938	finally
    //   15931	15938	15938	finally
    //   15931	15938	15931	java/lang/EnumConstantNotPresentException
    //   15931	15938	15931	finally
    //   15932	15938	15931	java/lang/NumberFormatException
    //   16055	16062	16062	finally
    //   16056	16062	16055	finally
    //   16056	16062	3	finally
    //   16056	16062	16055	java/util/ConcurrentModificationException
    //   16056	16062	16055	finally
    //   16191	16198	16198	finally
    //   16191	16198	16191	java/lang/AssertionError
    //   16191	16198	16198	java/lang/StringIndexOutOfBoundsException
    //   16192	16198	16198	java/lang/IndexOutOfBoundsException
    //   16192	16198	16198	finally
    //   16267	16274	16274	finally
    //   16267	16274	16274	java/lang/NullPointerException
    //   16267	16274	16274	finally
    //   16267	16274	16267	finally
    //   16268	16274	16267	finally
    //   16391	16398	16398	finally
    //   16391	16398	16398	java/lang/RuntimeException
    //   16391	16398	16391	java/lang/IndexOutOfBoundsException
    //   16391	16398	3	finally
    //   16392	16398	3	java/lang/RuntimeException
    //   16527	16534	16534	finally
    //   16527	16534	16534	finally
    //   16527	16534	16534	finally
    //   16527	16534	3	finally
    //   16528	16534	16527	java/lang/StringIndexOutOfBoundsException
    //   17040	17046	17046	finally
    //   17040	17046	3	finally
    //   17040	17046	17046	finally
    //   17040	17046	17046	java/lang/NegativeArraySizeException
    //   17040	17046	3	finally
    //   17116	17122	17122	finally
    //   17116	17122	3	finally
    //   17116	17122	17122	finally
    //   17116	17122	17122	finally
    //   17116	17122	3	finally
    //   17203	17210	17210	finally
    //   17203	17210	17210	finally
    //   17203	17210	17203	java/lang/ClassCastException
    //   17204	17210	3	java/lang/AssertionError
    //   17204	17210	3	java/lang/EnumConstantNotPresentException
    //   17340	17346	17346	finally
    //   17340	17346	3	java/lang/IllegalArgumentException
    //   17340	17346	3	finally
    //   17340	17346	3	finally
    //   17340	17346	3	finally
    //   17415	17422	17422	finally
    //   17416	17422	17422	java/util/NoSuchElementException
    //   17416	17422	17422	finally
    //   17416	17422	17415	java/lang/ClassCastException
    //   17416	17422	17422	finally
    //   17487	17494	17494	finally
    //   17487	17494	3	finally
    //   17488	17494	17487	finally
    //   17488	17494	17494	java/lang/NegativeArraySizeException
    //   17488	17494	17487	finally
    //   17559	17566	17566	finally
    //   17559	17566	17566	java/lang/IllegalStateException
    //   17559	17566	3	java/lang/AssertionError
    //   17560	17566	17559	finally
    //   17560	17566	3	finally
    //   17639	17646	17646	finally
    //   17639	17646	3	java/lang/IndexOutOfBoundsException
    //   17639	17646	3	finally
    //   17639	17646	3	java/lang/IllegalStateException
    //   17639	17646	17639	finally
    //   17867	17874	17874	finally
    //   17867	17874	17874	java/lang/IllegalStateException
    //   17867	17874	17867	java/lang/IllegalArgumentException
    //   17868	17874	17867	java/lang/RuntimeException
    //   17868	17874	17867	finally
    //   18968	18974	18974	finally
    //   18968	18974	3	finally
    //   18968	18974	3	java/lang/ArrayIndexOutOfBoundsException
    //   18968	18974	3	java/lang/ClassCastException
    //   18968	18974	3	finally
    //   19239	19246	19246	finally
    //   19239	19246	19239	finally
    //   19239	19246	19239	finally
    //   19240	19246	19246	java/lang/IndexOutOfBoundsException
    //   19240	19246	19239	finally
    //   19315	19322	19322	finally
    //   19315	19322	19315	java/lang/StringIndexOutOfBoundsException
    //   19316	19322	3	java/lang/ArrayIndexOutOfBoundsException
    //   19316	19322	19315	finally
    //   19316	19322	19322	finally
    //   19475	19482	19482	finally
    //   19475	19482	19475	java/lang/ArrayIndexOutOfBoundsException
    //   19475	19482	19475	java/lang/ArithmeticException
    //   19475	19482	19482	finally
    //   19476	19482	19475	java/lang/ArrayIndexOutOfBoundsException
    //   19611	19618	19618	finally
    //   19611	19618	19611	java/lang/ArithmeticException
    //   19611	19618	19611	finally
    //   19611	19618	3	finally
    //   19612	19618	19611	finally
    //   19687	19694	19694	finally
    //   19688	19694	19687	java/lang/StringIndexOutOfBoundsException
    //   19688	19694	3	finally
    //   19688	19694	19687	java/lang/NullPointerException
    //   19688	19694	19687	finally
    //   19759	19766	19766	finally
    //   19759	19766	19759	finally
    //   19759	19766	19766	java/lang/AssertionError
    //   19760	19766	19766	finally
    //   19760	19766	19759	finally
    //   19831	19838	19838	finally
    //   19831	19838	19831	finally
    //   19831	19838	19838	finally
    //   19832	19838	19838	finally
    //   19832	19838	3	finally
    //   19912	19918	19918	finally
    //   19912	19918	3	java/lang/IllegalStateException
    //   19912	19918	19918	java/lang/ClassCastException
    //   19912	19918	3	finally
    //   19912	19918	3	finally
    //   20235	20242	20242	finally
    //   20236	20242	20235	java/lang/IllegalStateException
    //   20236	20242	20242	finally
    //   20236	20242	20235	java/lang/NullPointerException
    //   20236	20242	3	java/lang/NumberFormatException
    //   20307	20314	20314	finally
    //   20307	20314	20307	finally
    //   20307	20314	20314	java/lang/IllegalStateException
    //   20308	20314	20314	finally
    //   20308	20314	20307	java/lang/ClassCastException
    //   20951	20958	20958	finally
    //   20952	20958	20958	java/lang/StringIndexOutOfBoundsException
    //   20952	20958	20958	java/lang/ArithmeticException
    //   20952	20958	20958	java/lang/UnsupportedOperationException
    //   20952	20958	20951	java/lang/NullPointerException
    //   21091	21098	21098	finally
    //   21091	21098	3	java/lang/EnumConstantNotPresentException
    //   21091	21098	3	java/lang/RuntimeException
    //   21091	21098	21091	java/lang/StringIndexOutOfBoundsException
    //   21092	21098	21091	java/lang/IllegalStateException
    //   21163	21170	21170	finally
    //   21163	21170	21163	java/lang/NumberFormatException
    //   21163	21170	3	finally
    //   21163	21170	21163	java/util/ConcurrentModificationException
    //   21164	21170	21170	java/lang/NumberFormatException
    //   21235	21242	21242	finally
    //   21235	21242	3	java/lang/NullPointerException
    //   21235	21242	3	finally
    //   21236	21242	3	java/lang/StringIndexOutOfBoundsException
    //   21236	21242	21235	finally
    //   21359	21366	21366	finally
    //   21359	21366	3	finally
    //   21360	21366	21366	java/util/ConcurrentModificationException
    //   21360	21366	21366	java/lang/UnsupportedOperationException
    //   21360	21366	21359	java/lang/IllegalStateException
    //   21495	21502	21502	finally
    //   21495	21502	21495	java/lang/IllegalStateException
    //   21495	21502	3	java/lang/ArithmeticException
    //   21495	21502	21502	java/lang/ArrayIndexOutOfBoundsException
    //   21495	21502	21495	java/lang/IllegalStateException
    //   21571	21578	21578	finally
    //   21571	21578	3	java/lang/IndexOutOfBoundsException
    //   21572	21578	21578	finally
    //   21572	21578	21571	finally
    //   21572	21578	3	finally
    //   21695	21702	21702	finally
    //   21695	21702	21695	finally
    //   21696	21702	21702	finally
    //   21696	21702	21702	finally
    //   21696	21702	21702	finally
    //   21831	21838	21838	finally
    //   21831	21838	21831	finally
    //   21831	21838	21838	java/lang/AssertionError
    //   21832	21838	3	finally
    //   21832	21838	3	finally
    //   22343	22350	22350	finally
    //   22343	22350	22343	java/util/ConcurrentModificationException
    //   22344	22350	3	java/lang/ArithmeticException
    //   22344	22350	22350	finally
    //   22344	22350	3	java/util/NoSuchElementException
    //   22419	22426	22426	finally
    //   22419	22426	3	finally
    //   22419	22426	22426	java/lang/ArithmeticException
    //   22419	22426	22419	finally
    //   22420	22426	22426	finally
    //   22507	22514	22514	finally
    //   22507	22514	22514	finally
    //   22507	22514	22514	java/lang/ArrayIndexOutOfBoundsException
    //   22508	22514	22507	java/lang/ClassCastException
    //   22508	22514	22514	java/util/NoSuchElementException
    //   22643	22650	22650	finally
    //   22643	22650	22643	java/lang/EnumConstantNotPresentException
    //   22643	22650	22650	java/lang/UnsupportedOperationException
    //   22644	22650	22650	java/lang/ClassCastException
    //   22644	22650	22643	finally
    //   22719	22726	22726	finally
    //   22719	22726	22726	finally
    //   22719	22726	22719	finally
    //   22720	22726	22726	java/lang/IllegalStateException
    //   22720	22726	22726	finally
    //   22791	22798	22798	finally
    //   22791	22798	22791	java/util/ConcurrentModificationException
    //   22791	22798	22798	java/lang/NullPointerException
    //   22792	22798	22798	finally
    //   22792	22798	3	java/util/NoSuchElementException
    //   22864	22870	22870	finally
    //   22864	22870	22870	java/lang/IndexOutOfBoundsException
    //   22864	22870	3	java/util/ConcurrentModificationException
    //   22864	22870	3	java/lang/RuntimeException
    //   22864	22870	3	finally
    //   22943	22950	22950	finally
    //   22944	22950	22950	java/lang/NumberFormatException
    //   22944	22950	22943	finally
    //   22944	22950	3	java/lang/EnumConstantNotPresentException
    //   22944	22950	22950	finally
    //   23175	23182	23182	finally
    //   23175	23182	23182	java/util/NoSuchElementException
    //   23176	23182	3	java/lang/StringIndexOutOfBoundsException
    //   23176	23182	3	java/lang/RuntimeException
    //   23176	23182	23175	finally
    //   24275	24282	24282	finally
    //   24276	24282	24282	java/lang/RuntimeException
    //   24276	24282	3	java/lang/NullPointerException
    //   24276	24282	24282	finally
    //   24276	24282	24275	finally
    //   24547	24554	24554	finally
    //   24547	24554	24554	finally
    //   24547	24554	3	java/lang/UnsupportedOperationException
    //   24547	24554	24547	finally
    //   24548	24554	24547	java/lang/IndexOutOfBoundsException
    //   24623	24630	24630	finally
    //   24623	24630	3	java/lang/ArrayIndexOutOfBoundsException
    //   24623	24630	24630	finally
    //   24623	24630	24623	finally
    //   24623	24630	3	finally
    //   24783	24790	24790	finally
    //   24783	24790	24783	java/lang/EnumConstantNotPresentException
    //   24783	24790	24790	finally
    //   24783	24790	24783	finally
    //   24784	24790	3	finally
    //   24919	24926	24926	finally
    //   24919	24926	24919	java/lang/EnumConstantNotPresentException
    //   24919	24926	3	java/lang/NullPointerException
    //   24920	24926	3	java/lang/IndexOutOfBoundsException
    //   24920	24926	3	finally
    //   24995	25002	25002	finally
    //   24995	25002	24995	java/lang/NegativeArraySizeException
    //   24996	25002	24995	finally
    //   24996	25002	25002	java/lang/EnumConstantNotPresentException
    //   24996	25002	24995	java/lang/NegativeArraySizeException
    //   25067	25074	25074	finally
    //   25067	25074	25074	finally
    //   25067	25074	3	finally
    //   25068	25074	25067	finally
    //   25068	25074	25067	finally
    //   25140	25146	25146	finally
    //   25140	25146	3	java/lang/AssertionError
    //   25140	25146	3	finally
    //   25140	25146	25146	finally
    //   25140	25146	3	java/lang/ArrayIndexOutOfBoundsException
    //   25219	25226	25226	finally
    //   25219	25226	25219	java/lang/ArithmeticException
    //   25219	25226	25219	java/lang/EnumConstantNotPresentException
    //   25220	25226	25219	java/lang/ArrayIndexOutOfBoundsException
    //   25220	25226	25226	finally
    //   25544	25550	25550	finally
    //   25544	25550	25550	finally
    //   25544	25550	25550	java/lang/NumberFormatException
    //   25544	25550	3	finally
    //   25544	25550	3	finally
    //   25615	25622	25622	finally
    //   25615	25622	25615	finally
    //   25615	25622	25615	finally
    //   25616	25622	25622	java/lang/EnumConstantNotPresentException
    //   25616	25622	25615	java/lang/RuntimeException
    //   26260	26266	26266	finally
    //   26260	26266	3	finally
    //   26260	26266	26266	finally
    //   26260	26266	3	finally
    //   26260	26266	26266	java/util/ConcurrentModificationException
    //   26400	26406	26406	finally
    //   26400	26406	26406	finally
    //   26400	26406	3	java/lang/NumberFormatException
    //   26400	26406	26406	java/lang/StringIndexOutOfBoundsException
    //   26400	26406	26406	finally
    //   26471	26478	26478	finally
    //   26472	26478	26471	finally
    //   26472	26478	3	java/lang/EnumConstantNotPresentException
    //   26472	26478	26471	java/util/NoSuchElementException
    //   26472	26478	26471	java/util/ConcurrentModificationException
    //   26544	26550	26550	finally
    //   26544	26550	26550	java/lang/EnumConstantNotPresentException
    //   26544	26550	26550	finally
    //   26544	26550	3	finally
    //   26544	26550	3	java/lang/IllegalStateException
    //   26668	26674	26674	finally
    //   26668	26674	3	finally
    //   26668	26674	26674	java/lang/UnsupportedOperationException
    //   26668	26674	3	java/lang/IndexOutOfBoundsException
    //   26668	26674	3	finally
    //   26803	26810	26810	finally
    //   26803	26810	3	finally
    //   26803	26810	26803	java/lang/IndexOutOfBoundsException
    //   26804	26810	26810	finally
    //   26804	26810	3	java/lang/NumberFormatException
    //   26879	26886	26886	finally
    //   26879	26886	26886	java/lang/IndexOutOfBoundsException
    //   26879	26886	3	finally
    //   26879	26886	3	finally
    //   26879	26886	26879	java/util/ConcurrentModificationException
    //   27003	27010	27010	finally
    //   27003	27010	3	finally
    //   27003	27010	3	java/lang/UnsupportedOperationException
    //   27004	27010	27010	finally
    //   27004	27010	27003	java/lang/ClassCastException
    //   27139	27146	27146	finally
    //   27139	27146	27146	java/lang/ClassCastException
    //   27139	27146	27139	finally
    //   27139	27146	27146	java/lang/IllegalStateException
    //   27140	27146	27146	finally
    //   27651	27658	27658	finally
    //   27651	27658	27658	finally
    //   27651	27658	27651	java/lang/EnumConstantNotPresentException
    //   27651	27658	27651	java/lang/IllegalStateException
    //   27652	27658	3	finally
    //   27727	27734	27734	finally
    //   27727	27734	27734	java/util/NoSuchElementException
    //   27727	27734	3	java/lang/NullPointerException
    //   27727	27734	27727	java/lang/StringIndexOutOfBoundsException
    //   27728	27734	27734	java/lang/UnsupportedOperationException
    //   27815	27822	27822	finally
    //   27815	27822	27822	finally
    //   27816	27822	27822	java/lang/EnumConstantNotPresentException
    //   27816	27822	27815	java/lang/NegativeArraySizeException
    //   27816	27822	27815	finally
    //   27951	27958	27958	finally
    //   27951	27958	3	java/lang/StringIndexOutOfBoundsException
    //   27951	27958	3	finally
    //   27952	27958	27951	java/lang/ClassCastException
    //   27952	27958	3	finally
    //   28027	28034	28034	finally
    //   28027	28034	3	finally
    //   28027	28034	3	finally
    //   28027	28034	28034	finally
    //   28027	28034	28027	java/lang/ArithmeticException
    //   28099	28106	28106	finally
    //   28099	28106	3	finally
    //   28099	28106	28099	java/lang/RuntimeException
    //   28100	28106	28106	finally
    //   28100	28106	28099	finally
    //   28171	28178	28178	finally
    //   28171	28178	28171	java/lang/NumberFormatException
    //   28171	28178	28171	finally
    //   28172	28178	28178	java/lang/IllegalArgumentException
    //   28172	28178	28171	java/lang/AssertionError
    //   28251	28258	28258	finally
    //   28251	28258	3	finally
    //   28251	28258	28251	java/lang/AssertionError
    //   28251	28258	28251	finally
    //   28252	28258	28251	finally
    //   28483	28490	28490	finally
    //   28483	28490	3	finally
    //   28483	28490	28483	java/lang/NumberFormatException
    //   28483	28490	28490	java/lang/ClassCastException
    //   28483	28490	28490	java/lang/StringIndexOutOfBoundsException
    //   29583	29590	29590	finally
    //   29583	29590	29583	java/lang/StringIndexOutOfBoundsException
    //   29583	29590	3	finally
    //   29583	29590	29583	java/lang/UnsupportedOperationException
    //   29583	29590	29590	finally
    //   29855	29862	29862	finally
    //   29855	29862	29862	java/lang/ArrayIndexOutOfBoundsException
    //   29855	29862	29855	finally
    //   29855	29862	3	java/lang/IndexOutOfBoundsException
    //   29856	29862	29862	finally
    //   29932	29938	29938	finally
    //   29932	29938	3	finally
    //   29932	29938	3	java/lang/UnsupportedOperationException
    //   29932	29938	3	finally
    //   29932	29938	29938	java/lang/IllegalArgumentException
    //   30092	30098	30098	finally
    //   30092	30098	3	java/lang/RuntimeException
    //   30092	30098	3	java/lang/AssertionError
    //   30092	30098	30098	java/lang/AssertionError
    //   30092	30098	30098	java/lang/RuntimeException
    //   30227	30234	30234	finally
    //   30227	30234	30234	java/lang/AssertionError
    //   30227	30234	30227	finally
    //   30227	30234	3	finally
    //   30228	30234	30234	finally
    //   30303	30310	30310	finally
    //   30303	30310	3	java/lang/ArithmeticException
    //   30303	30310	3	java/lang/IllegalStateException
    //   30303	30310	30303	java/lang/NumberFormatException
    //   30304	30310	30303	java/lang/IndexOutOfBoundsException
    //   30375	30382	30382	finally
    //   30375	30382	30382	finally
    //   30375	30382	30375	java/lang/ArrayIndexOutOfBoundsException
    //   30376	30382	3	finally
    //   30376	30382	30382	java/lang/EnumConstantNotPresentException
    //   30448	30454	30454	finally
    //   30448	30454	30454	java/lang/AssertionError
    //   30448	30454	30454	finally
    //   30448	30454	3	finally
    //   30448	30454	30454	finally
    //   30527	30534	30534	finally
    //   30527	30534	3	finally
    //   30528	30534	30527	java/lang/AssertionError
    //   30528	30534	3	java/lang/EnumConstantNotPresentException
    //   30528	30534	3	finally
    //   30851	30858	30858	finally
    //   30851	30858	3	finally
    //   30852	30858	3	finally
    //   30852	30858	3	java/util/ConcurrentModificationException
    //   30852	30858	30851	finally
    //   30923	30930	30930	finally
    //   30923	30930	30930	finally
    //   30923	30930	30923	finally
    //   30923	30930	3	java/lang/IllegalArgumentException
    //   30924	30930	3	java/lang/UnsupportedOperationException
    //   31547	31554	31554	finally
    //   31547	31554	31547	finally
    //   31547	31554	3	java/lang/NumberFormatException
    //   31548	31554	31554	finally
    //   31548	31554	31554	finally
    //   31623	31630	31630	finally
    //   31623	31630	31623	finally
    //   31623	31630	31630	finally
    //   31624	31630	31623	finally
    //   31624	31630	31623	finally
    //   31843	31850	31850	finally
    //   31843	31850	3	java/lang/EnumConstantNotPresentException
    //   31843	31850	3	finally
    //   31844	31850	31843	java/lang/NullPointerException
    //   31844	31850	31850	finally
    //   31983	31990	31990	finally
    //   31983	31990	31983	finally
    //   31983	31990	31990	java/lang/UnsupportedOperationException
    //   31983	31990	31990	finally
    //   31984	31990	31983	finally
    //   32056	32062	32062	finally
    //   32056	32062	32062	finally
    //   32056	32062	3	java/util/ConcurrentModificationException
    //   32056	32062	32062	java/util/NoSuchElementException
    //   32056	32062	32062	finally
    //   32127	32134	32134	finally
    //   32127	32134	32134	java/lang/UnsupportedOperationException
    //   32128	32134	3	finally
    //   32128	32134	32127	finally
    //   32128	32134	32127	java/lang/ArrayIndexOutOfBoundsException
    //   32251	32258	32258	finally
    //   32251	32258	3	finally
    //   32251	32258	32251	finally
    //   32251	32258	3	java/lang/ArrayIndexOutOfBoundsException
    //   32251	32258	32251	java/lang/NegativeArraySizeException
    //   32388	32394	32394	finally
    //   32388	32394	3	finally
    //   32388	32394	32394	finally
    //   32388	32394	3	java/lang/IndexOutOfBoundsException
    //   32388	32394	32394	java/lang/ArithmeticException
    //   32463	32470	32470	finally
    //   32463	32470	32470	java/lang/ArithmeticException
    //   32463	32470	3	java/lang/IndexOutOfBoundsException
    //   32464	32470	3	java/lang/IllegalArgumentException
    //   32464	32470	32463	finally
    //   32587	32594	32594	finally
    //   32587	32594	32587	finally
    //   32587	32594	32587	finally
    //   32588	32594	32587	finally
    //   32588	32594	3	java/lang/IllegalStateException
    //   32723	32730	32730	finally
    //   32723	32730	32723	java/lang/IllegalStateException
    //   32724	32730	32723	java/lang/StringIndexOutOfBoundsException
    //   32724	32730	32730	java/lang/EnumConstantNotPresentException
    //   32724	32730	32723	java/lang/ClassCastException
    //   33235	33242	33242	finally
    //   33235	33242	33235	finally
    //   33235	33242	33242	finally
    //   33236	33242	33242	finally
    //   33236	33242	33235	java/lang/NegativeArraySizeException
    //   33311	33318	33318	finally
    //   33311	33318	33318	java/util/ConcurrentModificationException
    //   33312	33318	33318	finally
    //   33312	33318	3	finally
    //   33312	33318	33311	java/lang/ClassCastException
    //   33399	33406	33406	finally
    //   33400	33406	33399	finally
    //   33400	33406	33399	finally
    //   33400	33406	33399	java/lang/NullPointerException
    //   33400	33406	3	finally
    //   33535	33542	33542	finally
    //   33535	33542	33535	java/lang/IllegalArgumentException
    //   33535	33542	3	java/lang/NumberFormatException
    //   33536	33542	3	finally
    //   33536	33542	33542	finally
    //   33611	33618	33618	finally
    //   33611	33618	3	java/lang/ClassCastException
    //   33612	33618	33618	finally
    //   33612	33618	33611	java/lang/ArrayIndexOutOfBoundsException
    //   33612	33618	33618	finally
    //   33683	33690	33690	finally
    //   33683	33690	3	java/util/NoSuchElementException
    //   33683	33690	33683	java/lang/IllegalStateException
    //   33683	33690	33690	finally
    //   33684	33690	33690	finally
    //   33755	33762	33762	finally
    //   33755	33762	33755	finally
    //   33756	33762	33755	java/lang/IllegalStateException
    //   33756	33762	3	java/lang/IllegalArgumentException
    //   33756	33762	33762	finally
    //   33835	33842	33842	finally
    //   33835	33842	33835	finally
    //   33836	33842	33842	java/lang/ClassCastException
    //   33836	33842	33835	java/util/NoSuchElementException
    //   33836	33842	33842	java/lang/UnsupportedOperationException
    //   34067	34074	34074	finally
    //   34067	34074	34067	finally
    //   34068	34074	3	finally
    //   34068	34074	34074	finally
    //   34068	34074	3	java/lang/StringIndexOutOfBoundsException
    //   35167	35174	35174	finally
    //   35167	35174	35174	java/lang/UnsupportedOperationException
    //   35167	35174	35167	java/util/ConcurrentModificationException
    //   35167	35174	35167	finally
    //   35168	35174	3	finally
    //   35439	35446	35446	finally
    //   35439	35446	3	java/lang/EnumConstantNotPresentException
    //   35439	35446	35439	finally
    //   35440	35446	35446	java/lang/IllegalStateException
    //   35440	35446	35446	java/lang/IllegalStateException
    //   35515	35522	35522	finally
    //   35515	35522	35515	finally
    //   35515	35522	3	finally
    //   35515	35522	35515	java/lang/IllegalStateException
    //   35515	35522	35522	finally
    //   35675	35682	35682	finally
    //   35675	35682	35675	java/util/ConcurrentModificationException
    //   35675	35682	3	finally
    //   35676	35682	35675	finally
    //   35676	35682	35682	java/util/NoSuchElementException
    //   35812	35818	35818	finally
    //   35812	35818	35818	java/lang/IllegalStateException
    //   35812	35818	3	finally
    //   35812	35818	3	java/lang/IllegalStateException
    //   35812	35818	3	finally
    //   35887	35894	35894	finally
    //   35887	35894	3	finally
    //   35887	35894	35887	finally
    //   35887	35894	35894	finally
    //   35888	35894	35887	finally
    //   35960	35966	35966	finally
    //   35960	35966	3	finally
    //   35960	35966	35966	finally
    //   35960	35966	3	finally
    //   35960	35966	35966	java/lang/NegativeArraySizeException
    //   36031	36038	36038	finally
    //   36031	36038	36031	finally
    //   36031	36038	3	java/lang/AssertionError
    //   36031	36038	36031	finally
    //   36031	36038	3	finally
    //   36111	36118	36118	finally
    //   36111	36118	36111	java/lang/UnsupportedOperationException
    //   36111	36118	36111	finally
    //   36112	36118	36111	java/lang/NullPointerException
    //   36112	36118	36118	finally
    //   36435	36442	36442	finally
    //   36435	36442	36435	java/lang/NegativeArraySizeException
    //   36435	36442	3	java/lang/NumberFormatException
    //   36436	36442	36442	finally
    //   36436	36442	3	finally
    //   36508	36514	36514	finally
    //   36508	36514	36514	finally
    //   36508	36514	3	finally
    //   36508	36514	3	finally
    //   36508	36514	3	finally
    //   37151	37158	37158	finally
    //   37151	37158	37151	finally
    //   37151	37158	37158	finally
    //   37151	37158	37151	java/lang/RuntimeException
    //   37152	37158	3	java/lang/NullPointerException
    //   38201	38209	38201	finally
    //   38217	38219	3	finally
  }
  
  public PvpInfo() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 1740751876
    //   9: l2i
    //   10: ldc_w 572230566
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 54513931
    //   20: l2i
    //   21: ldc_w 1123619614
    //   24: ixor
    //   25: ldc2_w 1113312192
    //   28: l2i
    //   29: ldc_w -1501117145
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1593360059 -> 970, -1505228921 -> 17
    //   60: aload_0
    //   61: ldc_w '䯨㌅䮪㶞ꕢ๶'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -504460542
    //   73: l2i
    //   74: ldc_w -1592441183
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1511404900
    //   84: l2i
    //   85: ldc_w -657708228
    //   88: ixor
    //   89: ldc2_w -739568280
    //   92: l2i
    //   93: ldc_w -1441703330
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -110019830 -> 81, 956400277 -> 972
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '䯫㌛䮵㶠ꔤ๬㙯踣ꮱ਷虈煵⽟횴辑鏚Ᵹ'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 1224216058
    //   139: l2i
    //   140: ldc_w -215613188
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -2082122058
    //   150: l2i
    //   151: ldc_w -1982348914
    //   154: ixor
    //   155: ldc2_w -953012288
    //   158: l2i
    //   159: ldc_w 909773445
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 950, -80039299 -> 192, 1255548995 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w 2013286838
    //   204: l2i
    //   205: ldc_w -1064585437
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1463487797
    //   215: l2i
    //   216: ldc_w 333565755
    //   219: ixor
    //   220: ldc2_w 836447444
    //   223: l2i
    //   224: ldc_w 237569770
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 954, -2022060885 -> 212, 2066278448 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -104046166
    //   262: l2i
    //   263: ldc_w -104046165
    //   266: ixor
    //   267: ldc2_w -533974843
    //   270: l2i
    //   271: ldc_w -533974843
    //   274: ixor
    //   275: ldc2_w 1854363171
    //   278: l2i
    //   279: ldc_w 1854363171
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 1361071451
    //   292: l2i
    //   293: ldc_w 2108051558
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -755776902
    //   303: l2i
    //   304: ldc_w -119932483
    //   307: ixor
    //   308: ldc2_w 1695507553
    //   311: l2i
    //   312: ldc_w -866166372
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 948, -2089155014 -> 344, -2049564480 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w 1144994083
    //   356: l2i
    //   357: ldc_w 643112971
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -713662278
    //   367: l2i
    //   368: ldc_w -1024418472
    //   371: ixor
    //   372: ldc2_w -1092328087
    //   375: l2i
    //   376: ldc_w -339103254
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, 927452587 -> 974, 1039271310 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 1838938481
    //   418: l2i
    //   419: ldc_w -1072841362
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -235386993
    //   429: l2i
    //   430: ldc_w 503832251
    //   433: ixor
    //   434: ldc2_w -1195972783
    //   437: l2i
    //   438: ldc_w -1912235920
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1707868909 -> 426, -1692058818 -> 968
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '䯨㌅䮪㶞ꕢ๶㙄'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -2018802860
    //   485: l2i
    //   486: ldc_w 1919690609
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1152520872
    //   496: l2i
    //   497: ldc_w -1249969546
    //   500: ixor
    //   501: ldc2_w 718270558
    //   504: l2i
    //   505: ldc_w -1373186244
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 960, -1965412276 -> 536, 1898873671 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -314886888
    //   542: l2i
    //   543: ldc_w -314886846
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 2069020285
    //   556: l2i
    //   557: ldc_w -1087364232
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -2009077892
    //   567: l2i
    //   568: ldc_w 1595505083
    //   571: ixor
    //   572: ldc2_w 1994638015
    //   575: l2i
    //   576: ldc_w -2027985358
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 962, 651835978 -> 608, 899561864 -> 564
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w -1293802054
    //   614: l2i
    //   615: ldc_w -1293802054
    //   618: ixor
    //   619: getstatic Perryc.c : I
    //   622: iflt -> 636
    //   625: ldc2_w 296878255
    //   628: l2i
    //   629: ldc_w -869548648
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 211166768
    //   639: l2i
    //   640: ldc_w -1875180426
    //   643: ixor
    //   644: ldc2_w -281285062
    //   647: l2i
    //   648: ldc_w 1038271555
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 958, 255891278 -> 636, 1316227135 -> 680
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w -28873451
    //   686: l2i
    //   687: ldc_w -28872953
    //   690: ixor
    //   691: getstatic Perryc.0 : I
    //   694: ifle -> 708
    //   697: ldc2_w 942727623
    //   700: l2i
    //   701: ldc_w 1334756011
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 1063996771
    //   711: l2i
    //   712: ldc_w 126342112
    //   715: ixor
    //   716: ldc2_w -1463144540
    //   719: l2i
    //   720: ldc_w -204790504
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, 470273030 -> 708, 750725584 -> 966
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w -567826917
    //   764: l2i
    //   765: ldc_w -670707182
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -1725780566
    //   775: l2i
    //   776: ldc_w -1417035581
    //   779: ixor
    //   780: ldc2_w 1220613171
    //   783: l2i
    //   784: ldc_w 1879503254
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 956, 174885068 -> 816, 1055232428 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.1 : I
    //   822: ifeq -> 836
    //   825: ldc2_w -1669532342
    //   828: l2i
    //   829: ldc_w 1122990662
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 706900012
    //   839: l2i
    //   840: ldc_w -1412394030
    //   843: ixor
    //   844: ldc2_w 446242987
    //   847: l2i
    //   848: ldc_w -485118466
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 952, 656343641 -> 836, 2021551787 -> 880
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.c : I
    //   886: iflt -> 900
    //   889: ldc2_w -957914185
    //   892: l2i
    //   893: ldc_w 957899468
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 1049705138
    //   903: l2i
    //   904: ldc_w 787476156
    //   907: ixor
    //   908: ldc2_w 1757724700
    //   911: l2i
    //   912: ldc_w -731425893
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 964, -1394784375 -> 944, 1130140412 -> 900
    //   944: putfield PvpInfoY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: return
    //   948: aconst_null
    //   949: athrow
    //   950: aconst_null
    //   951: athrow
    //   952: aconst_null
    //   953: athrow
    //   954: aconst_null
    //   955: athrow
    //   956: aconst_null
    //   957: athrow
    //   958: aconst_null
    //   959: athrow
    //   960: aconst_null
    //   961: athrow
    //   962: aconst_null
    //   963: athrow
    //   964: aconst_null
    //   965: athrow
    //   966: aconst_null
    //   967: athrow
    //   968: aconst_null
    //   969: athrow
    //   970: aconst_null
    //   971: athrow
    //   972: aconst_null
    //   973: athrow
    //   974: aconst_null
    //   975: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	948	0	this	Lbigname/zprestige/webhack/features/modules/Hud/PvpInfo;
  }
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.V(this, (int)-849170254L ^ 0xF2A60118, paramRender2DEvent);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\PvpInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */