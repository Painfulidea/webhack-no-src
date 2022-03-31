package bigname.zprestige.webhack.features.modules;

import Perry1;
import Perryc;

public enum Module$Category {
  HUD, PLAYER, CHAT, RENDER, MISC, CLIENT, MOVEMENT, COMBAT;
  
  public String name;
  
  public static Module$Category[] $VALUES;
  
  public String getName() {
    return Perry1.b(this, (int)-1286546507L ^ 0xA45D5840);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Module$Category
    //   3: dup
    //   4: ldc 'ᣮ㌼ᢊㅎ?'
    //   6: getstatic Perryc.0 : I
    //   9: ifle -> 22
    //   12: ldc2_w 1176445983
    //   15: l2i
    //   16: ldc -121671371
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 36487765
    //   25: l2i
    //   26: ldc 1834991292
    //   28: ixor
    //   29: ldc2_w -1706416932
    //   32: l2i
    //   33: ldc -446269384
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, -1629689339 -> 22, -1047787058 -> 2826
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 1261079429
    //   70: l2i
    //   71: ldc 1261079429
    //   73: ixor
    //   74: ldc 'ᣮ㌜ᢪㅮ?'
    //   76: getstatic Perryc.0 : I
    //   79: ifle -> 92
    //   82: ldc2_w 331430589
    //   85: l2i
    //   86: ldc 1439899455
    //   88: ixor
    //   89: goto -> 99
    //   92: ldc2_w 1390208925
    //   95: l2i
    //   96: ldc -292680192
    //   98: ixor
    //   99: ldc2_w 1848631785
    //   102: l2i
    //   103: ldc -1541402700
    //   105: ixor
    //   106: ixor
    //   107: lookupswitch default -> 2790, -1944204321 -> 92, 1985808320 -> 132
    //   132: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w -1720226514
    //   144: l2i
    //   145: ldc -1757610365
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -630268920
    //   154: l2i
    //   155: ldc -2056130494
    //   157: ixor
    //   158: ldc2_w -989427769
    //   161: l2i
    //   162: ldc 1864327264
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -1538100214 -> 2784, -945741927 -> 151
    //   192: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 211
    //   201: ldc2_w 1672189225
    //   204: l2i
    //   205: ldc -671523416
    //   207: ixor
    //   208: goto -> 218
    //   211: ldc2_w 778579386
    //   214: l2i
    //   215: ldc -1155200402
    //   217: ixor
    //   218: ldc2_w -1874253842
    //   221: l2i
    //   222: ldc -1587918206
    //   224: ixor
    //   225: ixor
    //   226: lookupswitch default -> 2832, -2059295251 -> 211, -1537324360 -> 252
    //   252: putstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   255: new bigname/zprestige/webhack/features/modules/Module$Category
    //   258: dup
    //   259: ldc 'ᣠ㌺ᢔㅏ'
    //   261: getstatic Perryc.0 : I
    //   264: ifle -> 277
    //   267: ldc2_w 2058092799
    //   270: l2i
    //   271: ldc 559410648
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w 1131117999
    //   280: l2i
    //   281: ldc -1657117996
    //   283: ixor
    //   284: ldc2_w 1927863600
    //   287: l2i
    //   288: ldc 438912870
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 2792, -1232042707 -> 320, 859469681 -> 277
    //   320: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   323: ldc2_w -458771344
    //   326: l2i
    //   327: ldc -458771343
    //   329: ixor
    //   330: ldc 'ᣠ㌚ᢴㅯ'
    //   332: getstatic Perryc.0 : I
    //   335: ifle -> 348
    //   338: ldc2_w 1386888654
    //   341: l2i
    //   342: ldc 197226615
    //   344: ixor
    //   345: goto -> 355
    //   348: ldc2_w -16464486
    //   351: l2i
    //   352: ldc 1130145898
    //   354: ixor
    //   355: ldc2_w 888477314
    //   358: l2i
    //   359: ldc 1359823369
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 388, 1016273202 -> 2852, 1730744602 -> 348
    //   388: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   391: getstatic Perryc.c : I
    //   394: iflt -> 407
    //   397: ldc2_w 2023178035
    //   400: l2i
    //   401: ldc -1709957820
    //   403: ixor
    //   404: goto -> 414
    //   407: ldc2_w 80735147
    //   410: l2i
    //   411: ldc -773210258
    //   413: ixor
    //   414: ldc2_w 118531016
    //   417: l2i
    //   418: ldc -1161570073
    //   420: ixor
    //   421: ixor
    //   422: lookupswitch default -> 448, -1225457407 -> 407, 1599101272 -> 2846
    //   448: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   451: getstatic Perryc.c : I
    //   454: iflt -> 467
    //   457: ldc2_w -128217394
    //   460: l2i
    //   461: ldc 1743669796
    //   463: ixor
    //   464: goto -> 474
    //   467: ldc2_w 1801439193
    //   470: l2i
    //   471: ldc 2018728784
    //   473: ixor
    //   474: ldc2_w 1142582130
    //   477: l2i
    //   478: ldc -2088658175
    //   480: ixor
    //   481: ixor
    //   482: lookupswitch default -> 508, -1294224362 -> 467, 1479423129 -> 2794
    //   508: putstatic bigname/zprestige/webhack/features/modules/Module$Category.MISC : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   511: new bigname/zprestige/webhack/features/modules/Module$Category
    //   514: dup
    //   515: ldc 'ᣠ㌼ᢑㅉ?๗敔'
    //   517: getstatic Perryc.0 : I
    //   520: ifle -> 533
    //   523: ldc2_w -1978003576
    //   526: l2i
    //   527: ldc -1001226999
    //   529: ixor
    //   530: goto -> 540
    //   533: ldc2_w 1462786697
    //   536: l2i
    //   537: ldc 970669090
    //   539: ixor
    //   540: ldc2_w -1685571839
    //   543: l2i
    //   544: ldc 531912586
    //   546: ixor
    //   547: ixor
    //   548: lookupswitch default -> 576, -898362870 -> 2812, 586689758 -> 533
    //   576: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   579: ldc2_w -341488808
    //   582: l2i
    //   583: ldc -341488806
    //   585: ixor
    //   586: ldc 'ᣠ㌜ᢱㅩ?๷整'
    //   588: getstatic Perryc.c : I
    //   591: iflt -> 604
    //   594: ldc2_w -490852941
    //   597: l2i
    //   598: ldc 317295583
    //   600: ixor
    //   601: goto -> 611
    //   604: ldc2_w -1462279156
    //   607: l2i
    //   608: ldc 1546638934
    //   610: ixor
    //   611: ldc2_w 1887713954
    //   614: l2i
    //   615: ldc -1904401559
    //   617: ixor
    //   618: ixor
    //   619: lookupswitch default -> 2786, 167881617 -> 644, 246333351 -> 604
    //   644: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   647: getstatic Perryc.0 : I
    //   650: ifle -> 663
    //   653: ldc2_w -1247966368
    //   656: l2i
    //   657: ldc 1843063874
    //   659: ixor
    //   660: goto -> 670
    //   663: ldc2_w -1124018367
    //   666: l2i
    //   667: ldc -1039699775
    //   669: ixor
    //   670: ldc2_w -1829880041
    //   673: l2i
    //   674: ldc 967005839
    //   676: ixor
    //   677: ixor
    //   678: lookupswitch default -> 2822, -733295080 -> 704, 1930038970 -> 663
    //   704: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   707: getstatic Perryc.c : I
    //   710: iflt -> 723
    //   713: ldc2_w 1225430525
    //   716: l2i
    //   717: ldc 1246828861
    //   719: ixor
    //   720: goto -> 730
    //   723: ldc2_w -1709023835
    //   726: l2i
    //   727: ldc -1720262943
    //   729: ixor
    //   730: ldc2_w 389348905
    //   733: l2i
    //   734: ldc -926057813
    //   736: ixor
    //   737: ixor
    //   738: lookupswitch default -> 764, -833561271 -> 723, -593360830 -> 2820
    //   764: putstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   767: new bigname/zprestige/webhack/features/modules/Module$Category
    //   770: dup
    //   771: ldc '᣽㌿ᢆㅕ?'
    //   773: getstatic Perryc.0 : I
    //   776: ifle -> 789
    //   779: ldc2_w -2027848425
    //   782: l2i
    //   783: ldc -1919110348
    //   785: ixor
    //   786: goto -> 796
    //   789: ldc2_w 1008702823
    //   792: l2i
    //   793: ldc -985156448
    //   795: ixor
    //   796: ldc2_w -1954685498
    //   799: l2i
    //   800: ldc 922236319
    //   802: ixor
    //   803: ixor
    //   804: lookupswitch default -> 832, -1699990630 -> 789, -1221056902 -> 2818
    //   832: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   835: ldc2_w -751924255
    //   838: l2i
    //   839: ldc -751924254
    //   841: ixor
    //   842: ldc '᣽㌟ᢦㅵ?'
    //   844: getstatic Perryc.0 : I
    //   847: ifle -> 860
    //   850: ldc2_w -1137297241
    //   853: l2i
    //   854: ldc -1355168450
    //   856: ixor
    //   857: goto -> 867
    //   860: ldc2_w -1092776040
    //   863: l2i
    //   864: ldc 1841646325
    //   866: ixor
    //   867: ldc2_w 871392798
    //   870: l2i
    //   871: ldc 1309366109
    //   873: ixor
    //   874: ixor
    //   875: lookupswitch default -> 900, -600124580 -> 860, 1861536986 -> 2864
    //   900: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   903: getstatic Perryc.c : I
    //   906: iflt -> 919
    //   909: ldc2_w 203432107
    //   912: l2i
    //   913: ldc 2123583148
    //   915: ixor
    //   916: goto -> 926
    //   919: ldc2_w -1069846858
    //   922: l2i
    //   923: ldc 1741494188
    //   925: ixor
    //   926: ldc2_w 385471692
    //   929: l2i
    //   930: ldc -1460642519
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, -860166174 -> 2840, 1996443430 -> 919
    //   960: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   963: getstatic Perryc.1 : I
    //   966: ifeq -> 980
    //   969: ldc2_w 865994044
    //   972: l2i
    //   973: ldc_w 1718699067
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w -1644176549
    //   983: l2i
    //   984: ldc_w 1064125189
    //   987: ixor
    //   988: ldc2_w -1668875976
    //   991: l2i
    //   992: ldc_w 2138731305
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, -1240216810 -> 2810, -1163567966 -> 980
    //   1024: putstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   1027: new bigname/zprestige/webhack/features/modules/Module$Category
    //   1030: dup
    //   1031: ldc_w '᣿㌶ᢉㅈ?'
    //   1034: getstatic Perryc.1 : I
    //   1037: ifeq -> 1051
    //   1040: ldc2_w 367918491
    //   1043: l2i
    //   1044: ldc_w -1395479175
    //   1047: ixor
    //   1048: goto -> 1059
    //   1051: ldc2_w -1859835870
    //   1054: l2i
    //   1055: ldc_w -993361502
    //   1058: ixor
    //   1059: ldc2_w -1939676957
    //   1062: l2i
    //   1063: ldc_w 1346667957
    //   1066: ixor
    //   1067: ixor
    //   1068: lookupswitch default -> 1096, -1561602661 -> 1051, 1696150964 -> 2824
    //   1096: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1099: ldc2_w -1357747073
    //   1102: l2i
    //   1103: ldc_w -1357747077
    //   1106: ixor
    //   1107: ldc_w '᣿㌖ᢩㅨ?'
    //   1110: getstatic Perryc.1 : I
    //   1113: ifeq -> 1127
    //   1116: ldc2_w 1745281623
    //   1119: l2i
    //   1120: ldc_w -592205125
    //   1123: ixor
    //   1124: goto -> 1135
    //   1127: ldc2_w 581034876
    //   1130: l2i
    //   1131: ldc_w 1553515901
    //   1134: ixor
    //   1135: ldc2_w 1577251211
    //   1138: l2i
    //   1139: ldc_w 1833294027
    //   1142: ixor
    //   1143: ixor
    //   1144: lookupswitch default -> 1172, -2014158420 -> 2854, -1574817721 -> 1127
    //   1172: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1175: getstatic Perryc.0 : I
    //   1178: ifle -> 1192
    //   1181: ldc2_w 687834950
    //   1184: l2i
    //   1185: ldc_w 1284750930
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w 1100072301
    //   1195: l2i
    //   1196: ldc_w -874544352
    //   1199: ixor
    //   1200: ldc2_w -1659592063
    //   1203: l2i
    //   1204: ldc_w -1254107178
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 1236, -1757884889 -> 1192, 1279740995 -> 2860
    //   1236: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   1239: getstatic Perryc.0 : I
    //   1242: ifle -> 1256
    //   1245: ldc2_w -167819477
    //   1248: l2i
    //   1249: ldc_w -355159545
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w 1116198305
    //   1259: l2i
    //   1260: ldc_w 331165473
    //   1263: ixor
    //   1264: ldc2_w 2915212
    //   1267: l2i
    //   1268: ldc_w -810052701
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 1300, -1552241472 -> 1256, -793764605 -> 2798
    //   1300: putstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   1303: new bigname/zprestige/webhack/features/modules/Module$Category
    //   1306: dup
    //   1307: ldc_w 'ᣮ㌿ᢎㅉ?'
    //   1310: getstatic Perryc.c : I
    //   1313: iflt -> 1327
    //   1316: ldc2_w -1319982
    //   1319: l2i
    //   1320: ldc_w -1624233044
    //   1323: ixor
    //   1324: goto -> 1335
    //   1327: ldc2_w -814448456
    //   1330: l2i
    //   1331: ldc_w -1731365970
    //   1334: ixor
    //   1335: ldc2_w 1843244639
    //   1338: l2i
    //   1339: ldc_w 1512839132
    //   1342: ixor
    //   1343: ixor
    //   1344: lookupswitch default -> 2802, 1462389245 -> 1327, 1615350421 -> 1372
    //   1372: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1375: ldc2_w -831288700
    //   1378: l2i
    //   1379: ldc_w -831288703
    //   1382: ixor
    //   1383: ldc_w 'ᣮ㌟᢮ㅩ?'
    //   1386: getstatic Perryc.c : I
    //   1389: iflt -> 1403
    //   1392: ldc2_w -1947961154
    //   1395: l2i
    //   1396: ldc_w 1521495396
    //   1399: ixor
    //   1400: goto -> 1411
    //   1403: ldc2_w -814218761
    //   1406: l2i
    //   1407: ldc_w -742500556
    //   1410: ixor
    //   1411: ldc2_w 1936755047
    //   1414: l2i
    //   1415: ldc_w 1736315509
    //   1418: ixor
    //   1419: ixor
    //   1420: lookupswitch default -> 1448, -1884064839 -> 1403, -983904568 -> 2830
    //   1448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1451: getstatic Perryc.1 : I
    //   1454: ifeq -> 1468
    //   1457: ldc2_w 1289260706
    //   1460: l2i
    //   1461: ldc_w 1607083500
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w -24675399
    //   1471: l2i
    //   1472: ldc_w 1999925772
    //   1475: ixor
    //   1476: ldc2_w -1843816031
    //   1479: l2i
    //   1480: ldc_w -701976777
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 2800, -847102173 -> 1512, 1461951960 -> 1468
    //   1512: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   1515: getstatic Perryc.0 : I
    //   1518: ifle -> 1532
    //   1521: ldc2_w -810693021
    //   1524: l2i
    //   1525: ldc_w -2125970352
    //   1528: ixor
    //   1529: goto -> 1540
    //   1532: ldc2_w 469506847
    //   1535: l2i
    //   1536: ldc_w -991744278
    //   1539: ixor
    //   1540: ldc2_w 2077309532
    //   1543: l2i
    //   1544: ldc_w 1930528814
    //   1547: ixor
    //   1548: ixor
    //   1549: lookupswitch default -> 1576, 1176844353 -> 2856, 1395040934 -> 1532
    //   1576: putstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   1579: new bigname/zprestige/webhack/features/modules/Module$Category
    //   1582: dup
    //   1583: ldc_w 'ᣮ㌻ᢆㅘ'
    //   1586: getstatic Perryc.1 : I
    //   1589: ifeq -> 1603
    //   1592: ldc2_w -1392157606
    //   1595: l2i
    //   1596: ldc_w 1252090949
    //   1599: ixor
    //   1600: goto -> 1611
    //   1603: ldc2_w -1169153799
    //   1606: l2i
    //   1607: ldc_w 1666138448
    //   1610: ixor
    //   1611: ldc2_w -1154016281
    //   1614: l2i
    //   1615: ldc_w -1343967257
    //   1618: ixor
    //   1619: ixor
    //   1620: lookupswitch default -> 2850, -842213975 -> 1648, -210269153 -> 1603
    //   1648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1651: ldc2_w -1734955456
    //   1654: l2i
    //   1655: ldc_w -1734955450
    //   1658: ixor
    //   1659: ldc_w 'ᣮ㌛ᢦㅸ'
    //   1662: getstatic Perryc.c : I
    //   1665: iflt -> 1679
    //   1668: ldc2_w -451622662
    //   1671: l2i
    //   1672: ldc_w 599955632
    //   1675: ixor
    //   1676: goto -> 1687
    //   1679: ldc2_w -179548117
    //   1682: l2i
    //   1683: ldc_w 1203354195
    //   1686: ixor
    //   1687: ldc2_w 339171841
    //   1690: l2i
    //   1691: ldc_w -670201505
    //   1694: ixor
    //   1695: ixor
    //   1696: lookupswitch default -> 2806, 183272212 -> 1679, 2127509798 -> 1724
    //   1724: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1727: getstatic Perryc.c : I
    //   1730: iflt -> 1744
    //   1733: ldc2_w -336374028
    //   1736: l2i
    //   1737: ldc_w 443604621
    //   1740: ixor
    //   1741: goto -> 1752
    //   1744: ldc2_w 368688029
    //   1747: l2i
    //   1748: ldc_w 425713759
    //   1751: ixor
    //   1752: ldc2_w -1336599749
    //   1755: l2i
    //   1756: ldc_w 536520927
    //   1759: ixor
    //   1760: ixor
    //   1761: lookupswitch default -> 2804, -1559631834 -> 1788, 1579957149 -> 1744
    //   1788: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   1791: getstatic Perryc.1 : I
    //   1794: ifeq -> 1808
    //   1797: ldc2_w 179622379
    //   1800: l2i
    //   1801: ldc_w 1815679433
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -231575005
    //   1811: l2i
    //   1812: ldc_w -855909652
    //   1815: ixor
    //   1816: ldc2_w -1862573976
    //   1819: l2i
    //   1820: ldc_w 1251963122
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 1852, -1634112540 -> 1808, -1125527368 -> 2842
    //   1852: putstatic bigname/zprestige/webhack/features/modules/Module$Category.CHAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   1855: new bigname/zprestige/webhack/features/modules/Module$Category
    //   1858: dup
    //   1859: ldc_w 'ᣥ㌦ᢃ'
    //   1862: getstatic Perryc.0 : I
    //   1865: ifle -> 1879
    //   1868: ldc2_w -321747409
    //   1871: l2i
    //   1872: ldc_w 718712761
    //   1875: ixor
    //   1876: goto -> 1887
    //   1879: ldc2_w -1680676848
    //   1882: l2i
    //   1883: ldc_w -1905013900
    //   1886: ixor
    //   1887: ldc2_w -1075577612
    //   1890: l2i
    //   1891: ldc_w -473183499
    //   1894: ixor
    //   1895: ixor
    //   1896: lookupswitch default -> 1924, -1708384361 -> 2844, 1340910340 -> 1879
    //   1924: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1927: ldc2_w 1605828520
    //   1930: l2i
    //   1931: ldc_w 1605828527
    //   1934: ixor
    //   1935: ldc_w 'ᣥ㌆ᢣ'
    //   1938: getstatic Perryc.c : I
    //   1941: iflt -> 1955
    //   1944: ldc2_w 1059756835
    //   1947: l2i
    //   1948: ldc_w 592171829
    //   1951: ixor
    //   1952: goto -> 1963
    //   1955: ldc2_w -1798373520
    //   1958: l2i
    //   1959: ldc_w 554726675
    //   1962: ixor
    //   1963: ldc2_w -1908268799
    //   1966: l2i
    //   1967: ldc_w -2128811817
    //   1970: ixor
    //   1971: ixor
    //   1972: lookupswitch default -> 2838, -1165999179 -> 2000, 322929088 -> 1955
    //   2000: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2003: getstatic Perryc.0 : I
    //   2006: ifle -> 2020
    //   2009: ldc2_w -510787410
    //   2012: l2i
    //   2013: ldc_w 1850866123
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w -659268388
    //   2023: l2i
    //   2024: ldc_w 226759129
    //   2027: ixor
    //   2028: ldc2_w -1779163947
    //   2031: l2i
    //   2032: ldc_w 579620414
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2808, 950512526 -> 2020, 1648893934 -> 2064
    //   2064: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;)V
    //   2067: getstatic Perryc.0 : I
    //   2070: ifle -> 2084
    //   2073: ldc2_w 1734125903
    //   2076: l2i
    //   2077: ldc_w 1441710358
    //   2080: ixor
    //   2081: goto -> 2092
    //   2084: ldc2_w 1615089953
    //   2087: l2i
    //   2088: ldc_w -2132085400
    //   2091: ixor
    //   2092: ldc2_w 860717952
    //   2095: l2i
    //   2096: ldc_w 222024601
    //   2099: ixor
    //   2100: ixor
    //   2101: lookupswitch default -> 2128, -1996195801 -> 2084, 214186048 -> 2814
    //   2128: putstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2131: ldc2_w 1256903286
    //   2134: l2i
    //   2135: ldc_w 1256903294
    //   2138: ixor
    //   2139: anewarray bigname/zprestige/webhack/features/modules/Module$Category
    //   2142: dup
    //   2143: ldc2_w -2037601608
    //   2146: l2i
    //   2147: ldc_w -2037601608
    //   2150: ixor
    //   2151: getstatic Perryc.1 : I
    //   2154: ifeq -> 2168
    //   2157: ldc2_w 874962361
    //   2160: l2i
    //   2161: ldc_w 753966803
    //   2164: ixor
    //   2165: goto -> 2176
    //   2168: ldc2_w 309613026
    //   2171: l2i
    //   2172: ldc_w 24364586
    //   2175: ixor
    //   2176: ldc2_w 1949950657
    //   2179: l2i
    //   2180: ldc_w -796768262
    //   2183: ixor
    //   2184: ixor
    //   2185: lookupswitch default -> 2816, -1212402957 -> 2212, -1133648303 -> 2168
    //   2212: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2215: aastore
    //   2216: dup
    //   2217: ldc2_w -615530729
    //   2220: l2i
    //   2221: ldc_w -615530730
    //   2224: ixor
    //   2225: getstatic Perryc.0 : I
    //   2228: ifle -> 2242
    //   2231: ldc2_w -185688770
    //   2234: l2i
    //   2235: ldc_w -811664933
    //   2238: ixor
    //   2239: goto -> 2250
    //   2242: ldc2_w 1360550253
    //   2245: l2i
    //   2246: ldc_w 1278759777
    //   2249: ixor
    //   2250: ldc2_w 1200290661
    //   2253: l2i
    //   2254: ldc_w 1384816513
    //   2257: ixor
    //   2258: ixor
    //   2259: lookupswitch default -> 2284, -802446156 -> 2242, 779091969 -> 2836
    //   2284: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MISC : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2287: aastore
    //   2288: dup
    //   2289: ldc2_w -1309100486
    //   2292: l2i
    //   2293: ldc_w -1309100488
    //   2296: ixor
    //   2297: getstatic Perryc.0 : I
    //   2300: ifle -> 2314
    //   2303: ldc2_w -1869670558
    //   2306: l2i
    //   2307: ldc_w 1203732008
    //   2310: ixor
    //   2311: goto -> 2322
    //   2314: ldc2_w 1497290443
    //   2317: l2i
    //   2318: ldc_w 195643856
    //   2321: ixor
    //   2322: ldc2_w 1144481001
    //   2325: l2i
    //   2326: ldc_w 522160994
    //   2329: ixor
    //   2330: ixor
    //   2331: lookupswitch default -> 2862, -1944549695 -> 2314, 163541136 -> 2356
    //   2356: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2359: aastore
    //   2360: dup
    //   2361: ldc2_w -1997685528
    //   2364: l2i
    //   2365: ldc_w -1997685525
    //   2368: ixor
    //   2369: getstatic Perryc.c : I
    //   2372: iflt -> 2386
    //   2375: ldc2_w -1046431044
    //   2378: l2i
    //   2379: ldc_w 193964730
    //   2382: ixor
    //   2383: goto -> 2394
    //   2386: ldc2_w -760541701
    //   2389: l2i
    //   2390: ldc_w -330282378
    //   2393: ixor
    //   2394: ldc2_w 2136689343
    //   2397: l2i
    //   2398: ldc_w 1446463230
    //   2401: ixor
    //   2402: ixor
    //   2403: lookupswitch default -> 2428, -1528163739 -> 2386, -482141113 -> 2828
    //   2428: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2431: aastore
    //   2432: dup
    //   2433: ldc2_w -489192978
    //   2436: l2i
    //   2437: ldc_w -489192982
    //   2440: ixor
    //   2441: getstatic Perryc.c : I
    //   2444: iflt -> 2458
    //   2447: ldc2_w 1035457593
    //   2450: l2i
    //   2451: ldc_w -2049524117
    //   2454: ixor
    //   2455: goto -> 2466
    //   2458: ldc2_w -923484070
    //   2461: l2i
    //   2462: ldc_w 914219284
    //   2465: ixor
    //   2466: ldc2_w 1893295191
    //   2469: l2i
    //   2470: ldc_w 448847331
    //   2473: ixor
    //   2474: ixor
    //   2475: lookupswitch default -> 2500, -763833370 -> 2796, 872848437 -> 2458
    //   2500: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2503: aastore
    //   2504: dup
    //   2505: ldc2_w 1754190468
    //   2508: l2i
    //   2509: ldc_w 1754190465
    //   2512: ixor
    //   2513: getstatic Perryc.0 : I
    //   2516: ifle -> 2530
    //   2519: ldc2_w -1832339770
    //   2522: l2i
    //   2523: ldc_w 2122434288
    //   2526: ixor
    //   2527: goto -> 2538
    //   2530: ldc2_w 61255599
    //   2533: l2i
    //   2534: ldc_w -1838966048
    //   2537: ixor
    //   2538: ldc2_w -2139726407
    //   2541: l2i
    //   2542: ldc_w 763326449
    //   2545: ixor
    //   2546: ixor
    //   2547: lookupswitch default -> 2788, 1020004103 -> 2572, 1094730366 -> 2530
    //   2572: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2575: aastore
    //   2576: dup
    //   2577: ldc2_w -1614789005
    //   2580: l2i
    //   2581: ldc_w -1614789003
    //   2584: ixor
    //   2585: getstatic Perryc.1 : I
    //   2588: ifeq -> 2602
    //   2591: ldc2_w -725944944
    //   2594: l2i
    //   2595: ldc_w 1563010655
    //   2598: ixor
    //   2599: goto -> 2610
    //   2602: ldc2_w -1210463957
    //   2605: l2i
    //   2606: ldc_w -1441091465
    //   2609: ixor
    //   2610: ldc2_w 655859607
    //   2613: l2i
    //   2614: ldc_w -601264320
    //   2617: ixor
    //   2618: ixor
    //   2619: lookupswitch default -> 2858, -419591797 -> 2644, 1923982104 -> 2602
    //   2644: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CHAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2647: aastore
    //   2648: dup
    //   2649: ldc2_w -1595892356
    //   2652: l2i
    //   2653: ldc_w -1595892357
    //   2656: ixor
    //   2657: getstatic Perryc.1 : I
    //   2660: ifeq -> 2674
    //   2663: ldc2_w -642198212
    //   2666: l2i
    //   2667: ldc_w -2077432893
    //   2670: ixor
    //   2671: goto -> 2682
    //   2674: ldc2_w -737537161
    //   2677: l2i
    //   2678: ldc_w -1269481275
    //   2681: ixor
    //   2682: ldc2_w 676556567
    //   2685: l2i
    //   2686: ldc_w -446212072
    //   2689: ixor
    //   2690: ixor
    //   2691: lookupswitch default -> 2716, -1868561936 -> 2848, 268984319 -> 2674
    //   2716: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2719: aastore
    //   2720: getstatic Perryc.c : I
    //   2723: iflt -> 2737
    //   2726: ldc2_w -285166222
    //   2729: l2i
    //   2730: ldc_w 411718927
    //   2733: ixor
    //   2734: goto -> 2745
    //   2737: ldc2_w -1779326240
    //   2740: l2i
    //   2741: ldc_w -1106212390
    //   2744: ixor
    //   2745: ldc2_w -998184456
    //   2748: l2i
    //   2749: ldc_w -246081468
    //   2752: ixor
    //   2753: ixor
    //   2754: lookupswitch default -> 2780, -1033956927 -> 2834, -225929661 -> 2737
    //   2780: putstatic bigname/zprestige/webhack/features/modules/Module$Category.$VALUES : [Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2783: return
    //   2784: aconst_null
    //   2785: athrow
    //   2786: aconst_null
    //   2787: athrow
    //   2788: aconst_null
    //   2789: athrow
    //   2790: aconst_null
    //   2791: athrow
    //   2792: aconst_null
    //   2793: athrow
    //   2794: aconst_null
    //   2795: athrow
    //   2796: aconst_null
    //   2797: athrow
    //   2798: aconst_null
    //   2799: athrow
    //   2800: aconst_null
    //   2801: athrow
    //   2802: aconst_null
    //   2803: athrow
    //   2804: aconst_null
    //   2805: athrow
    //   2806: aconst_null
    //   2807: athrow
    //   2808: aconst_null
    //   2809: athrow
    //   2810: aconst_null
    //   2811: athrow
    //   2812: aconst_null
    //   2813: athrow
    //   2814: aconst_null
    //   2815: athrow
    //   2816: aconst_null
    //   2817: athrow
    //   2818: aconst_null
    //   2819: athrow
    //   2820: aconst_null
    //   2821: athrow
    //   2822: aconst_null
    //   2823: athrow
    //   2824: aconst_null
    //   2825: athrow
    //   2826: aconst_null
    //   2827: athrow
    //   2828: aconst_null
    //   2829: athrow
    //   2830: aconst_null
    //   2831: athrow
    //   2832: aconst_null
    //   2833: athrow
    //   2834: aconst_null
    //   2835: athrow
    //   2836: aconst_null
    //   2837: athrow
    //   2838: aconst_null
    //   2839: athrow
    //   2840: aconst_null
    //   2841: athrow
    //   2842: aconst_null
    //   2843: athrow
    //   2844: aconst_null
    //   2845: athrow
    //   2846: aconst_null
    //   2847: athrow
    //   2848: aconst_null
    //   2849: athrow
    //   2850: aconst_null
    //   2851: athrow
    //   2852: aconst_null
    //   2853: athrow
    //   2854: aconst_null
    //   2855: athrow
    //   2856: aconst_null
    //   2857: athrow
    //   2858: aconst_null
    //   2859: athrow
    //   2860: aconst_null
    //   2861: athrow
    //   2862: aconst_null
    //   2863: athrow
    //   2864: aconst_null
    //   2865: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Module$Category.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */