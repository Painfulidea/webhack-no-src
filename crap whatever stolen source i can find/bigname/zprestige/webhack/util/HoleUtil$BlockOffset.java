package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import net.minecraft.util.math.BlockPos;

public enum HoleUtil$BlockOffset {
  WEST, SOUTH, UP, EAST, NORTH, DOWN;
  
  public int z;
  
  public static HoleUtil$BlockOffset[] $VALUES;
  
  public int y;
  
  public int x;
  
  public BlockPos backward(BlockPos paramBlockPos, int paramInt) {
    return Perry1.0m(this, (int)718914511L ^ 0x3305B870, paramBlockPos, paramInt);
  }
  
  public BlockPos right(BlockPos paramBlockPos, int paramInt) {
    return Perry1.0l(this, (int)-474093563L ^ 0xA5F7641F, paramBlockPos, paramInt);
  }
  
  public BlockPos left(BlockPos paramBlockPos, int paramInt) {
    return Perry1.0l(this, (int)-811787889L ^ 0x89D79596, paramBlockPos, paramInt);
  }
  
  public BlockPos forward(BlockPos paramBlockPos, int paramInt) {
    return Perry1.0m(this, (int)-483998165L ^ 0xFAFABD97, paramBlockPos, paramInt);
  }
  
  public BlockPos offset(BlockPos pos) {
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
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   3: dup
    //   4: ldc_w '똇㌼뙆ㅂ'
    //   7: getstatic Perryc.1 : I
    //   10: ifeq -> 24
    //   13: ldc2_w 1226708306
    //   16: l2i
    //   17: ldc_w 1269953205
    //   20: ixor
    //   21: goto -> 32
    //   24: ldc2_w 281972991
    //   27: l2i
    //   28: ldc_w 307728063
    //   31: ixor
    //   32: ldc2_w -601552550
    //   35: l2i
    //   36: ldc_w 892642466
    //   39: ixor
    //   40: ixor
    //   41: lookupswitch default -> 1946, -343362632 -> 68, -339850721 -> 24
    //   68: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   71: ldc2_w -2121955497
    //   74: l2i
    //   75: ldc_w -2121955497
    //   78: ixor
    //   79: ldc2_w -167230265
    //   82: l2i
    //   83: ldc_w -167230265
    //   86: ixor
    //   87: ldc2_w 825047545
    //   90: l2i
    //   91: ldc_w -825047546
    //   94: ixor
    //   95: ldc2_w 921957423
    //   98: l2i
    //   99: ldc_w 921957423
    //   102: ixor
    //   103: getstatic Perryc.c : I
    //   106: iflt -> 120
    //   109: ldc2_w -1676736426
    //   112: l2i
    //   113: ldc_w 317492066
    //   116: ixor
    //   117: goto -> 128
    //   120: ldc2_w -1988390668
    //   123: l2i
    //   124: ldc_w 5889501
    //   127: ixor
    //   128: ldc2_w 1020284202
    //   131: l2i
    //   132: ldc_w 1679353036
    //   135: ixor
    //   136: ixor
    //   137: lookupswitch default -> 164, -701814062 -> 1922, 1003708164 -> 120
    //   164: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   167: getstatic Perryc.1 : I
    //   170: ifeq -> 184
    //   173: ldc2_w -689281069
    //   176: l2i
    //   177: ldc_w 305371230
    //   180: ixor
    //   181: goto -> 192
    //   184: ldc2_w 814287133
    //   187: l2i
    //   188: ldc_w 552867753
    //   191: ixor
    //   192: ldc2_w 357618294
    //   195: l2i
    //   196: ldc_w -630429546
    //   199: ixor
    //   200: ixor
    //   201: lookupswitch default -> 228, -775299890 -> 184, 199574893 -> 1918
    //   228: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.DOWN : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   231: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   234: dup
    //   235: ldc_w '똖㌣'
    //   238: getstatic Perryc.1 : I
    //   241: ifeq -> 255
    //   244: ldc2_w 958695051
    //   247: l2i
    //   248: ldc_w -946712869
    //   251: ixor
    //   252: goto -> 263
    //   255: ldc2_w -1795988352
    //   258: l2i
    //   259: ldc_w 1358719467
    //   262: ixor
    //   263: ldc2_w -512203700
    //   266: l2i
    //   267: ldc_w -1645322879
    //   270: ixor
    //   271: ixor
    //   272: lookupswitch default -> 300, -2111770211 -> 1928, -1612334085 -> 255
    //   300: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   303: ldc2_w -71454995
    //   306: l2i
    //   307: ldc_w -71454996
    //   310: ixor
    //   311: ldc2_w 2127598143
    //   314: l2i
    //   315: ldc_w 2127598143
    //   318: ixor
    //   319: ldc2_w 1758317840
    //   322: l2i
    //   323: ldc_w 1758317841
    //   326: ixor
    //   327: ldc2_w -1546685960
    //   330: l2i
    //   331: ldc_w -1546685960
    //   334: ixor
    //   335: getstatic Perryc.0 : I
    //   338: ifle -> 352
    //   341: ldc2_w -2039726882
    //   344: l2i
    //   345: ldc_w -1346491964
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 316240831
    //   355: l2i
    //   356: ldc_w 2045858796
    //   359: ixor
    //   360: ldc2_w 1181267694
    //   363: l2i
    //   364: ldc_w 708603155
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 1900, 125631406 -> 396, 1166462695 -> 352
    //   396: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 2090124084
    //   408: l2i
    //   409: ldc_w 1797925105
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -376055494
    //   419: l2i
    //   420: ldc_w 540887990
    //   423: ixor
    //   424: ldc2_w -781348691
    //   427: l2i
    //   428: ldc_w -519461706
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 1916, -104028521 -> 460, 668655582 -> 416
    //   460: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.UP : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   463: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   466: dup
    //   467: ldc_w '똍㌼뙃ㅘ㧹'
    //   470: getstatic Perryc.0 : I
    //   473: ifle -> 487
    //   476: ldc2_w -914504874
    //   479: l2i
    //   480: ldc_w -598262498
    //   483: ixor
    //   484: goto -> 495
    //   487: ldc2_w -451733051
    //   490: l2i
    //   491: ldc_w -785322272
    //   494: ixor
    //   495: ldc2_w 1986639779
    //   498: l2i
    //   499: ldc_w -867072588
    //   502: ixor
    //   503: ixor
    //   504: lookupswitch default -> 1912, -1910782670 -> 532, -1357722529 -> 487
    //   532: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   535: ldc2_w -519116093
    //   538: l2i
    //   539: ldc_w -519116095
    //   542: ixor
    //   543: ldc2_w 870153218
    //   546: l2i
    //   547: ldc_w 870153218
    //   550: ixor
    //   551: ldc2_w -476550231
    //   554: l2i
    //   555: ldc_w -476550231
    //   558: ixor
    //   559: ldc2_w 1578408542
    //   562: l2i
    //   563: ldc_w -1578408543
    //   566: ixor
    //   567: getstatic Perryc.1 : I
    //   570: ifeq -> 584
    //   573: ldc2_w -587252528
    //   576: l2i
    //   577: ldc_w 130876498
    //   580: ixor
    //   581: goto -> 592
    //   584: ldc2_w 1861751689
    //   587: l2i
    //   588: ldc_w 342688236
    //   591: ixor
    //   592: ldc2_w -645304862
    //   595: l2i
    //   596: ldc_w 835566672
    //   599: ixor
    //   600: ixor
    //   601: lookupswitch default -> 628, -1334561903 -> 584, 863430960 -> 1930
    //   628: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   631: getstatic Perryc.0 : I
    //   634: ifle -> 648
    //   637: ldc2_w -2080884733
    //   640: l2i
    //   641: ldc_w -871725961
    //   644: ixor
    //   645: goto -> 656
    //   648: ldc2_w -2043276291
    //   651: l2i
    //   652: ldc_w 1560960175
    //   655: ixor
    //   656: ldc2_w 1282024129
    //   659: l2i
    //   660: ldc_w 1387222780
    //   663: ixor
    //   664: ixor
    //   665: lookupswitch default -> 1926, -973522065 -> 692, 1362610249 -> 648
    //   692: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.NORTH : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   695: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   698: dup
    //   699: ldc_w '똆㌲뙂ㅘ'
    //   702: getstatic Perryc.1 : I
    //   705: ifeq -> 719
    //   708: ldc2_w -479560800
    //   711: l2i
    //   712: ldc_w 1567775520
    //   715: ixor
    //   716: goto -> 727
    //   719: ldc2_w 18432264
    //   722: l2i
    //   723: ldc_w -1762782485
    //   726: ixor
    //   727: ldc2_w -1394427259
    //   730: l2i
    //   731: ldc_w -1802732597
    //   734: ixor
    //   735: ixor
    //   736: lookupswitch default -> 764, -2039029298 -> 1932, -1780754404 -> 719
    //   764: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   767: ldc2_w 1364811997
    //   770: l2i
    //   771: ldc_w 1364811998
    //   774: ixor
    //   775: ldc2_w 1818923783
    //   778: l2i
    //   779: ldc_w 1818923782
    //   782: ixor
    //   783: ldc2_w -2004287515
    //   786: l2i
    //   787: ldc_w -2004287515
    //   790: ixor
    //   791: ldc2_w 710336799
    //   794: l2i
    //   795: ldc_w 710336799
    //   798: ixor
    //   799: getstatic Perryc.0 : I
    //   802: ifle -> 816
    //   805: ldc2_w 2072688192
    //   808: l2i
    //   809: ldc_w -1246521580
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -1210736302
    //   819: l2i
    //   820: ldc_w -263749555
    //   823: ixor
    //   824: ldc2_w 1384749575
    //   827: l2i
    //   828: ldc_w 87795083
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 1934, -1718935848 -> 816, 270540435 -> 860
    //   860: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   863: getstatic Perryc.c : I
    //   866: iflt -> 880
    //   869: ldc2_w 299928012
    //   872: l2i
    //   873: ldc_w -826178891
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w 1234975171
    //   883: l2i
    //   884: ldc_w -1800736332
    //   887: ixor
    //   888: ldc2_w -1210219886
    //   891: l2i
    //   892: ldc_w -1379895971
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 924, -985858890 -> 1942, 880400572 -> 880
    //   924: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.EAST : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   927: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   930: dup
    //   931: ldc_w '또㌼뙄ㅘ㧹'
    //   934: getstatic Perryc.1 : I
    //   937: ifeq -> 951
    //   940: ldc2_w -1607178351
    //   943: l2i
    //   944: ldc_w -1390573670
    //   947: ixor
    //   948: goto -> 959
    //   951: ldc2_w 731087366
    //   954: l2i
    //   955: ldc_w 875220810
    //   958: ixor
    //   959: ldc2_w 1033425854
    //   962: l2i
    //   963: ldc_w -842735118
    //   966: ixor
    //   967: ixor
    //   968: lookupswitch default -> 996, -42610105 -> 1940, 1532098737 -> 951
    //   996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   999: ldc2_w 335691601
    //   1002: l2i
    //   1003: ldc_w 335691605
    //   1006: ixor
    //   1007: ldc2_w -685030017
    //   1010: l2i
    //   1011: ldc_w -685030017
    //   1014: ixor
    //   1015: ldc2_w 957502936
    //   1018: l2i
    //   1019: ldc_w 957502936
    //   1022: ixor
    //   1023: ldc2_w 450667876
    //   1026: l2i
    //   1027: ldc_w 450667877
    //   1030: ixor
    //   1031: getstatic Perryc.0 : I
    //   1034: ifle -> 1048
    //   1037: ldc2_w 665038015
    //   1040: l2i
    //   1041: ldc_w -268945110
    //   1044: ixor
    //   1045: goto -> 1056
    //   1048: ldc2_w 646585833
    //   1051: l2i
    //   1052: ldc_w -566718095
    //   1055: ixor
    //   1056: ldc2_w 1359976093
    //   1059: l2i
    //   1060: ldc_w -756254121
    //   1063: ixor
    //   1064: ixor
    //   1065: lookupswitch default -> 1936, 1270380895 -> 1048, 2068930642 -> 1092
    //   1092: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   1095: getstatic Perryc.c : I
    //   1098: iflt -> 1112
    //   1101: ldc2_w -1356763512
    //   1104: l2i
    //   1105: ldc_w 1796303066
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -916499441
    //   1115: l2i
    //   1116: ldc_w -2001496357
    //   1119: ixor
    //   1120: ldc2_w -1356499523
    //   1123: l2i
    //   1124: ldc_w 292228773
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 1156, -494876741 -> 1112, 2055109962 -> 1920
    //   1156: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.SOUTH : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1159: new bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   1162: dup
    //   1163: ldc_w '똔㌶뙂ㅘ'
    //   1166: getstatic Perryc.0 : I
    //   1169: ifle -> 1183
    //   1172: ldc2_w 1071947451
    //   1175: l2i
    //   1176: ldc_w 368393219
    //   1179: ixor
    //   1180: goto -> 1191
    //   1183: ldc2_w 970121919
    //   1186: l2i
    //   1187: ldc_w -1082872552
    //   1190: ixor
    //   1191: ldc2_w -344154410
    //   1194: l2i
    //   1195: ldc_w 318172487
    //   1198: ixor
    //   1199: ixor
    //   1200: lookupswitch default -> 1228, -744763095 -> 1908, 1689486417 -> 1183
    //   1228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1231: ldc2_w -117934218
    //   1234: l2i
    //   1235: ldc_w -117934221
    //   1238: ixor
    //   1239: ldc2_w -755657055
    //   1242: l2i
    //   1243: ldc_w 755657054
    //   1246: ixor
    //   1247: ldc2_w 191127531
    //   1250: l2i
    //   1251: ldc_w 191127531
    //   1254: ixor
    //   1255: ldc2_w -848632395
    //   1258: l2i
    //   1259: ldc_w -848632395
    //   1262: ixor
    //   1263: getstatic Perryc.1 : I
    //   1266: ifeq -> 1280
    //   1269: ldc2_w -1513979195
    //   1272: l2i
    //   1273: ldc_w -1343226670
    //   1276: ixor
    //   1277: goto -> 1288
    //   1280: ldc2_w -433978784
    //   1283: l2i
    //   1284: ldc_w -1366900863
    //   1287: ixor
    //   1288: ldc2_w 1567074293
    //   1291: l2i
    //   1292: ldc_w 595607940
    //   1295: ixor
    //   1296: ixor
    //   1297: lookupswitch default -> 1324, 1250710936 -> 1280, 1959434342 -> 1924
    //   1324: invokespecial <init> : (Ljava/lang/String;IIII)V
    //   1327: getstatic Perryc.c : I
    //   1330: iflt -> 1344
    //   1333: ldc2_w -155746165
    //   1336: l2i
    //   1337: ldc_w -356918038
    //   1340: ixor
    //   1341: goto -> 1352
    //   1344: ldc2_w 1512755360
    //   1347: l2i
    //   1348: ldc_w 1062347232
    //   1351: ixor
    //   1352: ldc2_w 271131508
    //   1355: l2i
    //   1356: ldc_w -1945233833
    //   1359: ixor
    //   1360: ixor
    //   1361: lookupswitch default -> 1388, -2144769726 -> 1910, 1697085192 -> 1344
    //   1388: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.WEST : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1391: ldc2_w 20295132
    //   1394: l2i
    //   1395: ldc_w 20295130
    //   1398: ixor
    //   1399: anewarray bigname/zprestige/webhack/util/HoleUtil$BlockOffset
    //   1402: dup
    //   1403: ldc2_w -1772737112
    //   1406: l2i
    //   1407: ldc_w -1772737112
    //   1410: ixor
    //   1411: getstatic Perryc.1 : I
    //   1414: ifeq -> 1428
    //   1417: ldc2_w -1445837191
    //   1420: l2i
    //   1421: ldc_w -736938149
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w 787670159
    //   1431: l2i
    //   1432: ldc_w -865147741
    //   1435: ixor
    //   1436: ldc2_w -438557771
    //   1439: l2i
    //   1440: ldc_w -1292800120
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1906, -1246671855 -> 1472, 720125215 -> 1428
    //   1472: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.DOWN : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1475: aastore
    //   1476: dup
    //   1477: ldc2_w 98126708
    //   1480: l2i
    //   1481: ldc_w 98126709
    //   1484: ixor
    //   1485: getstatic Perryc.c : I
    //   1488: iflt -> 1502
    //   1491: ldc2_w 2065306398
    //   1494: l2i
    //   1495: ldc_w -367017477
    //   1498: ixor
    //   1499: goto -> 1510
    //   1502: ldc2_w 1329823239
    //   1505: l2i
    //   1506: ldc_w -2004183068
    //   1509: ixor
    //   1510: ldc2_w 191763895
    //   1513: l2i
    //   1514: ldc_w 1197088594
    //   1517: ixor
    //   1518: ixor
    //   1519: lookupswitch default -> 1938, -1946295546 -> 1544, -583936000 -> 1502
    //   1544: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.UP : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1547: aastore
    //   1548: dup
    //   1549: ldc2_w 659803221
    //   1552: l2i
    //   1553: ldc_w 659803223
    //   1556: ixor
    //   1557: getstatic Perryc.c : I
    //   1560: iflt -> 1574
    //   1563: ldc2_w 232117795
    //   1566: l2i
    //   1567: ldc_w 884554590
    //   1570: ixor
    //   1571: goto -> 1582
    //   1574: ldc2_w -1729842612
    //   1577: l2i
    //   1578: ldc_w -1479375589
    //   1581: ixor
    //   1582: ldc2_w -828912185
    //   1585: l2i
    //   1586: ldc_w -1798260370
    //   1589: ixor
    //   1590: ixor
    //   1591: lookupswitch default -> 1904, 1663801812 -> 1574, 1701921790 -> 1616
    //   1616: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.NORTH : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1619: aastore
    //   1620: dup
    //   1621: ldc2_w -602383882
    //   1624: l2i
    //   1625: ldc_w -602383883
    //   1628: ixor
    //   1629: getstatic Perryc.c : I
    //   1632: iflt -> 1646
    //   1635: ldc2_w 1262333802
    //   1638: l2i
    //   1639: ldc_w 1368185225
    //   1642: ixor
    //   1643: goto -> 1654
    //   1646: ldc2_w -54218090
    //   1649: l2i
    //   1650: ldc_w -17919675
    //   1653: ixor
    //   1654: ldc2_w -1158669080
    //   1657: l2i
    //   1658: ldc_w 1918407561
    //   1661: ixor
    //   1662: ixor
    //   1663: lookupswitch default -> 1902, -897405774 -> 1688, -770049662 -> 1646
    //   1688: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.EAST : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1691: aastore
    //   1692: dup
    //   1693: ldc2_w 1405996851
    //   1696: l2i
    //   1697: ldc_w 1405996855
    //   1700: ixor
    //   1701: getstatic Perryc.c : I
    //   1704: iflt -> 1718
    //   1707: ldc2_w -1600661628
    //   1710: l2i
    //   1711: ldc_w 117124807
    //   1714: ixor
    //   1715: goto -> 1726
    //   1718: ldc2_w -311097225
    //   1721: l2i
    //   1722: ldc_w -2073951007
    //   1725: ixor
    //   1726: ldc2_w -1525009441
    //   1729: l2i
    //   1730: ldc_w -1809840246
    //   1733: ixor
    //   1734: ixor
    //   1735: lookupswitch default -> 1760, -1755919082 -> 1944, -214424791 -> 1718
    //   1760: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.SOUTH : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1763: aastore
    //   1764: dup
    //   1765: ldc2_w 1686609196
    //   1768: l2i
    //   1769: ldc_w 1686609193
    //   1772: ixor
    //   1773: getstatic Perryc.c : I
    //   1776: iflt -> 1790
    //   1779: ldc2_w -845544599
    //   1782: l2i
    //   1783: ldc_w 650374803
    //   1786: ixor
    //   1787: goto -> 1798
    //   1790: ldc2_w 1087017348
    //   1793: l2i
    //   1794: ldc_w -967651451
    //   1797: ixor
    //   1798: ldc2_w 1509195230
    //   1801: l2i
    //   1802: ldc_w 716968420
    //   1805: ixor
    //   1806: ixor
    //   1807: lookupswitch default -> 1832, -1743683136 -> 1948, -534574322 -> 1790
    //   1832: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.WEST : Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1835: aastore
    //   1836: getstatic Perryc.0 : I
    //   1839: ifle -> 1853
    //   1842: ldc2_w -1500211335
    //   1845: l2i
    //   1846: ldc_w -2081514619
    //   1849: ixor
    //   1850: goto -> 1861
    //   1853: ldc2_w -598373045
    //   1856: l2i
    //   1857: ldc_w 215913149
    //   1860: ixor
    //   1861: ldc2_w 791156409
    //   1864: l2i
    //   1865: ldc_w -803757746
    //   1868: ixor
    //   1869: ixor
    //   1870: lookupswitch default -> 1914, -632964341 -> 1853, 800368641 -> 1896
    //   1896: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockOffset.$VALUES : [Lbigname/zprestige/webhack/util/HoleUtil$BlockOffset;
    //   1899: return
    //   1900: aconst_null
    //   1901: athrow
    //   1902: aconst_null
    //   1903: athrow
    //   1904: aconst_null
    //   1905: athrow
    //   1906: aconst_null
    //   1907: athrow
    //   1908: aconst_null
    //   1909: athrow
    //   1910: aconst_null
    //   1911: athrow
    //   1912: aconst_null
    //   1913: athrow
    //   1914: aconst_null
    //   1915: athrow
    //   1916: aconst_null
    //   1917: athrow
    //   1918: aconst_null
    //   1919: athrow
    //   1920: aconst_null
    //   1921: athrow
    //   1922: aconst_null
    //   1923: athrow
    //   1924: aconst_null
    //   1925: athrow
    //   1926: aconst_null
    //   1927: athrow
    //   1928: aconst_null
    //   1929: athrow
    //   1930: aconst_null
    //   1931: athrow
    //   1932: aconst_null
    //   1933: athrow
    //   1934: aconst_null
    //   1935: athrow
    //   1936: aconst_null
    //   1937: athrow
    //   1938: aconst_null
    //   1939: athrow
    //   1940: aconst_null
    //   1941: athrow
    //   1942: aconst_null
    //   1943: athrow
    //   1944: aconst_null
    //   1945: athrow
    //   1946: aconst_null
    //   1947: athrow
    //   1948: aconst_null
    //   1949: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\HoleUtil$BlockOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */