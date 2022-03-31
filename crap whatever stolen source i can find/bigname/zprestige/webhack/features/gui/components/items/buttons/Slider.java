package bigname.zprestige.webhack.features.gui.components.items.buttons;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.setting.Setting;

public class Slider extends Button {
  public int difference;
  
  public Setting setting;
  
  public Number min;
  
  public Number max;
  
  public void setSettingFromX(int paramInt) {
    Perry1.A(this, (int)667714115L ^ 0x32713420, paramInt);
  }
  
  public float middle() {
    return Perry1.2K(this, (int)1568402648L ^ 0x33C633DD);
  }
  
  public void update() {
    Perry1.4e(this, (int)-1958164265L ^ 0xEF266ACF);
  }
  
  public boolean isHovering(int paramInt1, int paramInt2) {
    return Perry1.0M(this, (int)-1566305747L ^ 0x99008ED3, paramInt1, paramInt2);
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6539
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 6531
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6523
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 1748986916
    //   33: l2i
    //   34: ldc -1490481337
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1890874986
    //   43: l2i
    //   44: ldc 2119217501
    //   46: ixor
    //   47: ldc2_w 1466426949
    //   50: l2i
    //   51: ldc 2103822003
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -451656811 -> 6492, 797721488 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 849174962
    //   90: l2i
    //   91: ldc 1344235866
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -2145054413
    //   100: l2i
    //   101: ldc -176228520
    //   103: ixor
    //   104: ldc2_w 2066433269
    //   107: l2i
    //   108: ldc 96999290
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 6400, 196654564 -> 140, 476142439 -> 97
    //   140: iload_1
    //   141: getstatic Perryc.0 : I
    //   144: ifle -> 157
    //   147: ldc2_w -1168950020
    //   150: l2i
    //   151: ldc 1055674534
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w 1363672902
    //   160: l2i
    //   161: ldc -858087961
    //   163: ixor
    //   164: ldc2_w -290244142
    //   167: l2i
    //   168: ldc 1250326768
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 6504, 545926520 -> 157, 967320451 -> 200
    //   200: iload_2
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -2134154170
    //   210: l2i
    //   211: ldc -1554935405
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 1758755142
    //   220: l2i
    //   221: ldc 195127975
    //   223: ixor
    //   224: ldc2_w 525738329
    //   227: l2i
    //   228: ldc -670606756
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -456421680 -> 6370, 1634799722 -> 217
    //   260: goto -> 264
    //   263: athrow
    //   264: invokespecial dragSetting : (II)V
    //   267: goto -> 271
    //   270: athrow
    //   271: getstatic Perryc.0 : I
    //   274: ifle -> 287
    //   277: ldc2_w 4505502
    //   280: l2i
    //   281: ldc 926661016
    //   283: ixor
    //   284: goto -> 294
    //   287: ldc2_w -232059233
    //   290: l2i
    //   291: ldc 622768255
    //   293: ixor
    //   294: ldc2_w 1515877634
    //   297: l2i
    //   298: ldc -1597324655
    //   300: ixor
    //   301: ixor
    //   302: lookupswitch default -> 6394, -839929451 -> 287, 765790579 -> 328
    //   328: aload_0
    //   329: getstatic Perryc.0 : I
    //   332: ifle -> 345
    //   335: ldc2_w -303373704
    //   338: l2i
    //   339: ldc 1888364979
    //   341: ixor
    //   342: goto -> 352
    //   345: ldc2_w -1110245185
    //   348: l2i
    //   349: ldc -353456326
    //   351: ixor
    //   352: ldc2_w -746467630
    //   355: l2i
    //   356: ldc -707313698
    //   358: ixor
    //   359: ixor
    //   360: lookupswitch default -> 6508, -1691206969 -> 345, 1365991049 -> 388
    //   388: getfield x : F
    //   391: getstatic Perryc.1 : I
    //   394: ifeq -> 407
    //   397: ldc2_w -576222979
    //   400: l2i
    //   401: ldc 225298480
    //   403: ixor
    //   404: goto -> 414
    //   407: ldc2_w -1906435777
    //   410: l2i
    //   411: ldc 1579939788
    //   413: ixor
    //   414: ldc2_w 1372411210
    //   417: l2i
    //   418: ldc -298330505
    //   420: ixor
    //   421: ixor
    //   422: lookupswitch default -> 6406, 1865466864 -> 407, 1871670734 -> 448
    //   448: aload_0
    //   449: getstatic Perryc.c : I
    //   452: iflt -> 465
    //   455: ldc2_w 1966142157
    //   458: l2i
    //   459: ldc -1493480547
    //   461: ixor
    //   462: goto -> 472
    //   465: ldc2_w 2074661222
    //   468: l2i
    //   469: ldc -783430287
    //   471: ixor
    //   472: ldc2_w 299822675
    //   475: l2i
    //   476: ldc -1738662436
    //   478: ixor
    //   479: ixor
    //   480: lookupswitch default -> 508, -1174501841 -> 465, 1514883807 -> 6386
    //   508: getfield y : F
    //   511: getstatic Perryc.c : I
    //   514: iflt -> 527
    //   517: ldc2_w 1508350057
    //   520: l2i
    //   521: ldc 1063063493
    //   523: ixor
    //   524: goto -> 534
    //   527: ldc2_w 1651946727
    //   530: l2i
    //   531: ldc -1128757080
    //   533: ixor
    //   534: ldc2_w 246020576
    //   537: l2i
    //   538: ldc -894484543
    //   540: ixor
    //   541: ixor
    //   542: lookupswitch default -> 6418, -1564716659 -> 527, 449378926 -> 568
    //   568: aload_0
    //   569: getstatic Perryc.0 : I
    //   572: ifle -> 585
    //   575: ldc2_w 1842148295
    //   578: l2i
    //   579: ldc -1787360468
    //   581: ixor
    //   582: goto -> 592
    //   585: ldc2_w -1049188877
    //   588: l2i
    //   589: ldc 1498853819
    //   591: ixor
    //   592: ldc2_w 418835032
    //   595: l2i
    //   596: ldc 1022879125
    //   598: ixor
    //   599: ixor
    //   600: lookupswitch default -> 6426, -1138680955 -> 628, -591726810 -> 585
    //   628: getfield x : F
    //   631: getstatic Perryc.0 : I
    //   634: ifle -> 647
    //   637: ldc2_w -2139268920
    //   640: l2i
    //   641: ldc 328729253
    //   643: ixor
    //   644: goto -> 654
    //   647: ldc2_w -1441418596
    //   650: l2i
    //   651: ldc -1777762814
    //   653: ixor
    //   654: ldc2_w 1370609682
    //   657: l2i
    //   658: ldc 236015331
    //   660: ixor
    //   661: ixor
    //   662: lookupswitch default -> 688, -1667984040 -> 647, -867840868 -> 6354
    //   688: aload_0
    //   689: getstatic Perryc.c : I
    //   692: iflt -> 705
    //   695: ldc2_w -1538192931
    //   698: l2i
    //   699: ldc 180211383
    //   701: ixor
    //   702: goto -> 712
    //   705: ldc2_w 1790980652
    //   708: l2i
    //   709: ldc -1377254046
    //   711: ixor
    //   712: ldc2_w 756969874
    //   715: l2i
    //   716: ldc -1957426459
    //   718: ixor
    //   719: ixor
    //   720: lookupswitch default -> 748, -1721623661 -> 705, 145144861 -> 6466
    //   748: getfield width : I
    //   751: i2f
    //   752: fadd
    //   753: ldc 0.41164547
    //   755: invokestatic floatToIntBits : (F)I
    //   758: ldc 2117996543
    //   760: ixor
    //   761: invokestatic intBitsToFloat : (I)F
    //   764: fadd
    //   765: getstatic Perryc.c : I
    //   768: iflt -> 781
    //   771: ldc2_w -1282296074
    //   774: l2i
    //   775: ldc -1179830673
    //   777: ixor
    //   778: goto -> 788
    //   781: ldc2_w -1161746482
    //   784: l2i
    //   785: ldc -1094721744
    //   787: ixor
    //   788: ldc2_w -351209002
    //   791: l2i
    //   792: ldc 9314035
    //   794: ixor
    //   795: ixor
    //   796: lookupswitch default -> 824, -509450308 -> 6422, 1762250080 -> 781
    //   824: aload_0
    //   825: getstatic Perryc.1 : I
    //   828: ifeq -> 841
    //   831: ldc2_w -814412174
    //   834: l2i
    //   835: ldc -1376033235
    //   837: ixor
    //   838: goto -> 848
    //   841: ldc2_w 1608024045
    //   844: l2i
    //   845: ldc -15369208
    //   847: ixor
    //   848: ldc2_w -939097715
    //   851: l2i
    //   852: ldc 791505949
    //   854: ixor
    //   855: ixor
    //   856: lookupswitch default -> 884, -2052749873 -> 6356, -1239097608 -> 841
    //   884: getfield y : F
    //   887: getstatic Perryc.c : I
    //   890: iflt -> 903
    //   893: ldc2_w 1262937642
    //   896: l2i
    //   897: ldc -792753550
    //   899: ixor
    //   900: goto -> 910
    //   903: ldc2_w -994315465
    //   906: l2i
    //   907: ldc -1056010187
    //   909: ixor
    //   910: ldc2_w 730315342
    //   913: l2i
    //   914: ldc_w -503192208
    //   917: ixor
    //   918: ixor
    //   919: lookupswitch default -> 6512, -869057476 -> 944, 1384067942 -> 903
    //   944: aload_0
    //   945: getstatic Perryc.0 : I
    //   948: ifle -> 962
    //   951: ldc2_w -500830321
    //   954: l2i
    //   955: ldc_w -1544272929
    //   958: ixor
    //   959: goto -> 970
    //   962: ldc2_w -751847383
    //   965: l2i
    //   966: ldc_w -610524419
    //   969: ixor
    //   970: ldc2_w -1860705342
    //   973: l2i
    //   974: ldc_w -992221456
    //   977: ixor
    //   978: ixor
    //   979: lookupswitch default -> 1004, -761143044 -> 962, 337488226 -> 6416
    //   1004: getfield height : I
    //   1007: i2f
    //   1008: fadd
    //   1009: ldc_w 62.30865
    //   1012: invokestatic floatToIntBits : (F)I
    //   1015: ldc_w 2105097231
    //   1018: ixor
    //   1019: invokestatic intBitsToFloat : (I)F
    //   1022: fsub
    //   1023: getstatic Perryc.0 : I
    //   1026: ifle -> 1040
    //   1029: ldc2_w 1849283327
    //   1032: l2i
    //   1033: ldc_w 1574256116
    //   1036: ixor
    //   1037: goto -> 1048
    //   1040: ldc2_w -972135031
    //   1043: l2i
    //   1044: ldc_w -1537541769
    //   1047: ixor
    //   1048: ldc2_w 904395842
    //   1051: l2i
    //   1052: ldc_w 500988829
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 6372, 467101908 -> 1040, 1248795425 -> 1084
    //   1084: aload_0
    //   1085: getstatic Perryc.c : I
    //   1088: iflt -> 1102
    //   1091: ldc2_w 1469397240
    //   1094: l2i
    //   1095: ldc_w -220079082
    //   1098: ixor
    //   1099: goto -> 1110
    //   1102: ldc2_w -649808060
    //   1105: l2i
    //   1106: ldc_w -947338143
    //   1109: ixor
    //   1110: ldc2_w -864601838
    //   1113: l2i
    //   1114: ldc_w 237631814
    //   1117: ixor
    //   1118: ixor
    //   1119: lookupswitch default -> 1144, -817065700 -> 1102, 1730815162 -> 6402
    //   1144: iload_1
    //   1145: getstatic Perryc.0 : I
    //   1148: ifle -> 1162
    //   1151: ldc2_w -1811055396
    //   1154: l2i
    //   1155: ldc_w -1629571181
    //   1158: ixor
    //   1159: goto -> 1170
    //   1162: ldc2_w 64457156
    //   1165: l2i
    //   1166: ldc_w -2086386316
    //   1169: ixor
    //   1170: ldc2_w -564731545
    //   1173: l2i
    //   1174: ldc_w 434915956
    //   1177: ixor
    //   1178: ixor
    //   1179: lookupswitch default -> 6342, -848732068 -> 1162, 1204381603 -> 1204
    //   1204: iload_2
    //   1205: getstatic Perryc.c : I
    //   1208: iflt -> 1222
    //   1211: ldc2_w -745885666
    //   1214: l2i
    //   1215: ldc_w 2072341285
    //   1218: ixor
    //   1219: goto -> 1230
    //   1222: ldc2_w 1492932973
    //   1225: l2i
    //   1226: ldc_w 1807624155
    //   1229: ixor
    //   1230: ldc2_w 1674704682
    //   1233: l2i
    //   1234: ldc_w -2120450854
    //   1237: ixor
    //   1238: ixor
    //   1239: lookupswitch default -> 6464, -787483322 -> 1264, 1245860043 -> 1222
    //   1264: goto -> 1268
    //   1267: athrow
    //   1268: invokevirtual isHovering : (II)Z
    //   1271: goto -> 1275
    //   1274: athrow
    //   1275: ifne -> 1289
    //   1278: ldc2_w -882882668
    //   1281: l2i
    //   1282: ldc_w 1351762415
    //   1285: ixor
    //   1286: goto -> 1297
    //   1289: ldc2_w 1438022151
    //   1292: l2i
    //   1293: ldc_w -834372483
    //   1296: ixor
    //   1297: ldc2_w 1457069486
    //   1300: l2i
    //   1301: ldc_w -1064287407
    //   1304: ixor
    //   1305: ixor
    //   1306: tableswitch default -> 1278, 230381700 -> 1328, 230381701 -> 1339
    //   1328: ldc2_w -1485132508
    //   1331: l2i
    //   1332: ldc_w -1238370191
    //   1335: ixor
    //   1336: goto -> 1347
    //   1339: ldc2_w -2061340562
    //   1342: l2i
    //   1343: ldc_w 225912123
    //   1346: ixor
    //   1347: getstatic Perryc.0 : I
    //   1350: ifle -> 1364
    //   1353: ldc2_w -1862133821
    //   1356: l2i
    //   1357: ldc_w -474091780
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w 2117015179
    //   1367: l2i
    //   1368: ldc_w 2124015621
    //   1371: ixor
    //   1372: ldc2_w -1507030608
    //   1375: l2i
    //   1376: ldc_w -499891322
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 6498, 916927241 -> 1364, 1152267448 -> 1408
    //   1408: goto -> 1412
    //   1411: athrow
    //   1412: invokestatic drawRect : (FFFFI)V
    //   1415: goto -> 1419
    //   1418: athrow
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -666252785
    //   1428: l2i
    //   1429: ldc_w -807107605
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w -2016511449
    //   1439: l2i
    //   1440: ldc_w -341960769
    //   1443: ixor
    //   1444: ldc2_w -23100840
    //   1447: l2i
    //   1448: ldc_w 1309251376
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1480, -1489281908 -> 6474, 1708981477 -> 1436
    //   1480: aload_0
    //   1481: getstatic Perryc.c : I
    //   1484: iflt -> 1498
    //   1487: ldc2_w 890372465
    //   1490: l2i
    //   1491: ldc_w 803382413
    //   1494: ixor
    //   1495: goto -> 1506
    //   1498: ldc2_w -1989468529
    //   1501: l2i
    //   1502: ldc_w -1909031793
    //   1505: ixor
    //   1506: ldc2_w -1217619480
    //   1509: l2i
    //   1510: ldc_w 793761302
    //   1513: ixor
    //   1514: ixor
    //   1515: lookupswitch default -> 6390, -2100041214 -> 1498, -1619120642 -> 1540
    //   1540: getfield x : F
    //   1543: getstatic Perryc.1 : I
    //   1546: ifeq -> 1560
    //   1549: ldc2_w 543853646
    //   1552: l2i
    //   1553: ldc_w 1693398201
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w 104923100
    //   1563: l2i
    //   1564: ldc_w -855894382
    //   1567: ixor
    //   1568: ldc2_w 672593177
    //   1571: l2i
    //   1572: ldc_w 410586980
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 6482, -86830285 -> 1604, 1961509514 -> 1560
    //   1604: aload_0
    //   1605: getstatic Perryc.0 : I
    //   1608: ifle -> 1622
    //   1611: ldc2_w -1105570909
    //   1614: l2i
    //   1615: ldc_w 903835097
    //   1618: ixor
    //   1619: goto -> 1630
    //   1622: ldc2_w 1201135576
    //   1625: l2i
    //   1626: ldc_w -602311608
    //   1629: ixor
    //   1630: ldc2_w -2125824139
    //   1633: l2i
    //   1634: ldc_w -1132839223
    //   1637: ixor
    //   1638: ixor
    //   1639: lookupswitch default -> 1664, -1225424954 -> 6490, 1189925650 -> 1622
    //   1664: getfield y : F
    //   1667: getstatic Perryc.c : I
    //   1670: iflt -> 1684
    //   1673: ldc2_w 1841090590
    //   1676: l2i
    //   1677: ldc_w -1701826846
    //   1680: ixor
    //   1681: goto -> 1692
    //   1684: ldc2_w -1326905789
    //   1687: l2i
    //   1688: ldc_w 1834919064
    //   1691: ixor
    //   1692: ldc2_w 1174244711
    //   1695: l2i
    //   1696: ldc_w -409988782
    //   1699: ixor
    //   1700: ixor
    //   1701: lookupswitch default -> 1728, 82923465 -> 1684, 1430348489 -> 6460
    //   1728: aload_0
    //   1729: getstatic Perryc.c : I
    //   1732: iflt -> 1746
    //   1735: ldc2_w -1840937339
    //   1738: l2i
    //   1739: ldc_w -2013831845
    //   1742: ixor
    //   1743: goto -> 1754
    //   1746: ldc2_w 349237622
    //   1749: l2i
    //   1750: ldc_w 1319849484
    //   1753: ixor
    //   1754: ldc2_w 288878911
    //   1757: l2i
    //   1758: ldc_w 433734480
    //   1761: ixor
    //   1762: ixor
    //   1763: lookupswitch default -> 1788, -516629278 -> 1746, 492792241 -> 6392
    //   1788: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1791: getstatic Perryc.0 : I
    //   1794: ifle -> 1808
    //   1797: ldc2_w -1244320291
    //   1800: l2i
    //   1801: ldc_w 628914528
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -1814316619
    //   1811: l2i
    //   1812: ldc_w -2092477062
    //   1815: ixor
    //   1816: ldc2_w -761192141
    //   1819: l2i
    //   1820: ldc_w 1794885225
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 1852, 687059943 -> 6380, 753840162 -> 1808
    //   1852: goto -> 1856
    //   1855: athrow
    //   1856: invokevirtual getValue : ()Ljava/lang/Object;
    //   1859: goto -> 1863
    //   1862: athrow
    //   1863: checkcast java/lang/Number
    //   1866: getstatic Perryc.c : I
    //   1869: iflt -> 1883
    //   1872: ldc2_w 1011155955
    //   1875: l2i
    //   1876: ldc_w 1728127786
    //   1879: ixor
    //   1880: goto -> 1891
    //   1883: ldc2_w -1169169489
    //   1886: l2i
    //   1887: ldc_w 415810486
    //   1890: ixor
    //   1891: ldc2_w 1321266016
    //   1894: l2i
    //   1895: ldc_w -1773993027
    //   1898: ixor
    //   1899: ixor
    //   1900: lookupswitch default -> 1928, -2084059132 -> 6484, -436560322 -> 1883
    //   1928: goto -> 1932
    //   1931: athrow
    //   1932: invokevirtual floatValue : ()F
    //   1935: goto -> 1939
    //   1938: athrow
    //   1939: getstatic Perryc.0 : I
    //   1942: ifle -> 1956
    //   1945: ldc2_w 523190361
    //   1948: l2i
    //   1949: ldc_w 1111860909
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w -997185238
    //   1959: l2i
    //   1960: ldc_w -348642731
    //   1963: ixor
    //   1964: ldc2_w -2083369973
    //   1967: l2i
    //   1968: ldc_w -509072824
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 2000, 1058046135 -> 6414, 1248034559 -> 1956
    //   2000: aload_0
    //   2001: getstatic Perryc.0 : I
    //   2004: ifle -> 2018
    //   2007: ldc2_w -556793852
    //   2010: l2i
    //   2011: ldc_w -513500829
    //   2014: ixor
    //   2015: goto -> 2026
    //   2018: ldc2_w 1518359378
    //   2021: l2i
    //   2022: ldc_w -1576510783
    //   2025: ixor
    //   2026: ldc2_w -637242473
    //   2029: l2i
    //   2030: ldc_w 1815287014
    //   2033: ixor
    //   2034: ixor
    //   2035: lookupswitch default -> 2060, -1987838442 -> 6384, 724179406 -> 2018
    //   2060: getfield min : Ljava/lang/Number;
    //   2063: getstatic Perryc.0 : I
    //   2066: ifle -> 2080
    //   2069: ldc2_w -548095326
    //   2072: l2i
    //   2073: ldc_w 126574466
    //   2076: ixor
    //   2077: goto -> 2088
    //   2080: ldc2_w -8906927
    //   2083: l2i
    //   2084: ldc_w -1029580691
    //   2087: ixor
    //   2088: ldc2_w 861165593
    //   2091: l2i
    //   2092: ldc_w 1303604999
    //   2095: ixor
    //   2096: ixor
    //   2097: lookupswitch default -> 2124, -1691779844 -> 2080, -1506225602 -> 6410
    //   2124: goto -> 2128
    //   2127: athrow
    //   2128: invokevirtual floatValue : ()F
    //   2131: goto -> 2135
    //   2134: athrow
    //   2135: fcmpg
    //   2136: ifgt -> 2150
    //   2139: ldc2_w 1599228454
    //   2142: l2i
    //   2143: ldc_w -1052682135
    //   2146: ixor
    //   2147: goto -> 2158
    //   2150: ldc2_w 1961834329
    //   2153: l2i
    //   2154: ldc_w -352574183
    //   2157: ixor
    //   2158: ldc2_w 423495471
    //   2161: l2i
    //   2162: ldc_w -1884674217
    //   2165: ixor
    //   2166: ixor
    //   2167: tableswitch default -> 2139, 143077943 -> 2188, 143077944 -> 2314
    //   2188: getstatic Perryc.c : I
    //   2191: iflt -> 2205
    //   2194: ldc2_w -1276947375
    //   2197: l2i
    //   2198: ldc_w 1037761064
    //   2201: ixor
    //   2202: goto -> 2213
    //   2205: ldc2_w -975319605
    //   2208: l2i
    //   2209: ldc_w -761958739
    //   2212: ixor
    //   2213: ldc2_w 784328642
    //   2216: l2i
    //   2217: ldc_w 265019089
    //   2220: ixor
    //   2221: ixor
    //   2222: lookupswitch default -> 6448, -1353869462 -> 2205, 909941365 -> 2248
    //   2248: aload_0
    //   2249: getstatic Perryc.0 : I
    //   2252: ifle -> 2266
    //   2255: ldc2_w -1499129993
    //   2258: l2i
    //   2259: ldc_w -992825857
    //   2262: ixor
    //   2263: goto -> 2274
    //   2266: ldc2_w -1849474340
    //   2269: l2i
    //   2270: ldc_w 1881780927
    //   2273: ixor
    //   2274: ldc2_w 1243933125
    //   2277: l2i
    //   2278: ldc_w -280697179
    //   2281: ixor
    //   2282: ixor
    //   2283: lookupswitch default -> 6438, -954747416 -> 2266, 1149959939 -> 2308
    //   2308: getfield x : F
    //   2311: goto -> 2713
    //   2314: getstatic Perryc.0 : I
    //   2317: ifle -> 2331
    //   2320: ldc2_w -1494031896
    //   2323: l2i
    //   2324: ldc_w -1852137392
    //   2327: ixor
    //   2328: goto -> 2339
    //   2331: ldc2_w -1479484295
    //   2334: l2i
    //   2335: ldc_w -1310148114
    //   2338: ixor
    //   2339: ldc2_w 895344094
    //   2342: l2i
    //   2343: ldc_w -674738977
    //   2346: ixor
    //   2347: ixor
    //   2348: lookupswitch default -> 2376, -1698103714 -> 2331, -704786247 -> 6442
    //   2376: aload_0
    //   2377: getstatic Perryc.1 : I
    //   2380: ifeq -> 2394
    //   2383: ldc2_w 338290689
    //   2386: l2i
    //   2387: ldc_w -1227485329
    //   2390: ixor
    //   2391: goto -> 2402
    //   2394: ldc2_w -366344709
    //   2397: l2i
    //   2398: ldc_w 803700277
    //   2401: ixor
    //   2402: ldc2_w -872926280
    //   2405: l2i
    //   2406: ldc_w -490947855
    //   2409: ixor
    //   2410: ixor
    //   2411: lookupswitch default -> 6456, -1950650841 -> 2394, -326503801 -> 2436
    //   2436: getfield x : F
    //   2439: getstatic Perryc.1 : I
    //   2442: ifeq -> 2456
    //   2445: ldc2_w -901341691
    //   2448: l2i
    //   2449: ldc_w -768003129
    //   2452: ixor
    //   2453: goto -> 2464
    //   2456: ldc2_w -1371749327
    //   2459: l2i
    //   2460: ldc_w -697036738
    //   2463: ixor
    //   2464: ldc2_w -1070927298
    //   2467: l2i
    //   2468: ldc_w 1319585394
    //   2471: ixor
    //   2472: ixor
    //   2473: lookupswitch default -> 2500, -1911715047 -> 2456, -1762518642 -> 6428
    //   2500: aload_0
    //   2501: getstatic Perryc.0 : I
    //   2504: ifle -> 2518
    //   2507: ldc2_w 438408173
    //   2510: l2i
    //   2511: ldc_w 2017874840
    //   2514: ixor
    //   2515: goto -> 2526
    //   2518: ldc2_w 427914543
    //   2521: l2i
    //   2522: ldc_w 399131620
    //   2525: ixor
    //   2526: ldc2_w -1372152073
    //   2529: l2i
    //   2530: ldc_w 2004261055
    //   2533: ixor
    //   2534: ixor
    //   2535: lookupswitch default -> 6480, -1155021251 -> 2518, -687132541 -> 2560
    //   2560: getfield width : I
    //   2563: i2f
    //   2564: ldc_w 0.0786009
    //   2567: invokestatic floatToIntBits : (F)I
    //   2570: ldc_w 2102146383
    //   2573: ixor
    //   2574: invokestatic intBitsToFloat : (I)F
    //   2577: fadd
    //   2578: getstatic Perryc.c : I
    //   2581: iflt -> 2595
    //   2584: ldc2_w -199997762
    //   2587: l2i
    //   2588: ldc_w 1811964105
    //   2591: ixor
    //   2592: goto -> 2603
    //   2595: ldc2_w -898347532
    //   2598: l2i
    //   2599: ldc_w 1687193033
    //   2602: ixor
    //   2603: ldc2_w 1312951944
    //   2606: l2i
    //   2607: ldc_w 1895951347
    //   2610: ixor
    //   2611: ixor
    //   2612: lookupswitch default -> 6374, -1851314874 -> 2640, -1487420660 -> 2595
    //   2640: aload_0
    //   2641: getstatic Perryc.0 : I
    //   2644: ifle -> 2658
    //   2647: ldc2_w -55764594
    //   2650: l2i
    //   2651: ldc_w 462056786
    //   2654: ixor
    //   2655: goto -> 2666
    //   2658: ldc2_w 550868445
    //   2661: l2i
    //   2662: ldc_w 417786887
    //   2665: ixor
    //   2666: ldc2_w 1935194087
    //   2669: l2i
    //   2670: ldc_w 499536037
    //   2673: ixor
    //   2674: ixor
    //   2675: lookupswitch default -> 2700, -1984326754 -> 6388, -1722474987 -> 2658
    //   2700: goto -> 2704
    //   2703: athrow
    //   2704: invokespecial partialMultiplier : ()F
    //   2707: goto -> 2711
    //   2710: athrow
    //   2711: fmul
    //   2712: fadd
    //   2713: getstatic Perryc.c : I
    //   2716: iflt -> 2730
    //   2719: ldc2_w 1029531486
    //   2722: l2i
    //   2723: ldc_w -734762775
    //   2726: ixor
    //   2727: goto -> 2738
    //   2730: ldc2_w 601625485
    //   2733: l2i
    //   2734: ldc_w -279358771
    //   2737: ixor
    //   2738: ldc2_w -668023860
    //   2741: l2i
    //   2742: ldc_w 1447241419
    //   2745: ixor
    //   2746: ixor
    //   2747: lookupswitch default -> 2772, 1600409059 -> 2730, 1728375472 -> 6452
    //   2772: aload_0
    //   2773: getstatic Perryc.0 : I
    //   2776: ifle -> 2790
    //   2779: ldc2_w 352391345
    //   2782: l2i
    //   2783: ldc_w 642990417
    //   2786: ixor
    //   2787: goto -> 2798
    //   2790: ldc2_w -193212433
    //   2793: l2i
    //   2794: ldc_w 758944423
    //   2797: ixor
    //   2798: ldc2_w -161394210
    //   2801: l2i
    //   2802: ldc_w -1576850851
    //   2805: ixor
    //   2806: ixor
    //   2807: lookupswitch default -> 2832, -599122536 -> 2790, 1731209827 -> 6334
    //   2832: getfield y : F
    //   2835: getstatic Perryc.1 : I
    //   2838: ifeq -> 2852
    //   2841: ldc2_w -625568844
    //   2844: l2i
    //   2845: ldc_w -1779034614
    //   2848: ixor
    //   2849: goto -> 2860
    //   2852: ldc2_w -1482537188
    //   2855: l2i
    //   2856: ldc_w 20165431
    //   2859: ixor
    //   2860: ldc2_w -888082662
    //   2863: l2i
    //   2864: ldc_w 1801183235
    //   2867: ixor
    //   2868: ixor
    //   2869: lookupswitch default -> 2896, -284456281 -> 6476, 887754478 -> 2852
    //   2896: aload_0
    //   2897: getstatic Perryc.0 : I
    //   2900: ifle -> 2914
    //   2903: ldc2_w -742726115
    //   2906: l2i
    //   2907: ldc_w 1937942403
    //   2910: ixor
    //   2911: goto -> 2922
    //   2914: ldc2_w -1160168232
    //   2917: l2i
    //   2918: ldc_w -343531946
    //   2921: ixor
    //   2922: ldc2_w -1799053821
    //   2925: l2i
    //   2926: ldc_w 41163342
    //   2929: ixor
    //   2930: ixor
    //   2931: lookupswitch default -> 6430, -940595517 -> 2956, 914933203 -> 2914
    //   2956: getfield height : I
    //   2959: i2f
    //   2960: fadd
    //   2961: ldc_w 15.097438
    //   2964: invokestatic floatToIntBits : (F)I
    //   2967: ldc_w 2121371419
    //   2970: ixor
    //   2971: invokestatic intBitsToFloat : (I)F
    //   2974: fsub
    //   2975: getstatic Perryc.1 : I
    //   2978: ifeq -> 2992
    //   2981: ldc2_w 1591868597
    //   2984: l2i
    //   2985: ldc_w 1588059144
    //   2988: ixor
    //   2989: goto -> 3000
    //   2992: ldc2_w -747999006
    //   2995: l2i
    //   2996: ldc_w -243607172
    //   2999: ixor
    //   3000: ldc2_w 326439106
    //   3003: l2i
    //   3004: ldc_w -354100697
    //   3007: ixor
    //   3008: ixor
    //   3009: lookupswitch default -> 6506, -612277381 -> 3036, -103290280 -> 2992
    //   3036: aload_0
    //   3037: getstatic Perryc.c : I
    //   3040: iflt -> 3054
    //   3043: ldc2_w 504838452
    //   3046: l2i
    //   3047: ldc_w -1302927259
    //   3050: ixor
    //   3051: goto -> 3062
    //   3054: ldc2_w -378799023
    //   3057: l2i
    //   3058: ldc_w -1729986906
    //   3061: ixor
    //   3062: ldc2_w -1360757302
    //   3065: l2i
    //   3066: ldc_w 1240345199
    //   3069: ixor
    //   3070: ixor
    //   3071: lookupswitch default -> 3096, 1263240948 -> 6486, 1311799579 -> 3054
    //   3096: iload_1
    //   3097: getstatic Perryc.0 : I
    //   3100: ifle -> 3114
    //   3103: ldc2_w -74436803
    //   3106: l2i
    //   3107: ldc_w 1697959071
    //   3110: ixor
    //   3111: goto -> 3122
    //   3114: ldc2_w -1460088205
    //   3117: l2i
    //   3118: ldc_w 1815635831
    //   3121: ixor
    //   3122: ldc2_w 1957877002
    //   3125: l2i
    //   3126: ldc_w -265771762
    //   3129: ixor
    //   3130: ixor
    //   3131: lookupswitch default -> 6470, 440308646 -> 3114, 1079690496 -> 3156
    //   3156: iload_2
    //   3157: getstatic Perryc.1 : I
    //   3160: ifeq -> 3174
    //   3163: ldc2_w 2118947128
    //   3166: l2i
    //   3167: ldc_w -1238501338
    //   3170: ixor
    //   3171: goto -> 3182
    //   3174: ldc2_w -1571262951
    //   3177: l2i
    //   3178: ldc_w 1780452076
    //   3181: ixor
    //   3182: ldc2_w 826415086
    //   3185: l2i
    //   3186: ldc_w -1425935871
    //   3189: ixor
    //   3190: ixor
    //   3191: lookupswitch default -> 6382, 1375994138 -> 3216, 1377996017 -> 3174
    //   3216: goto -> 3220
    //   3219: athrow
    //   3220: invokevirtual isHovering : (II)Z
    //   3223: goto -> 3227
    //   3226: athrow
    //   3227: ifne -> 3241
    //   3230: ldc2_w 1893998010
    //   3233: l2i
    //   3234: ldc_w -994065227
    //   3237: ixor
    //   3238: goto -> 3249
    //   3241: ldc2_w -1191258117
    //   3244: l2i
    //   3245: ldc_w 212143861
    //   3248: ixor
    //   3249: ldc2_w 1827892599
    //   3252: l2i
    //   3253: ldc_w 1157932818
    //   3256: ixor
    //   3257: ixor
    //   3258: tableswitch default -> 3230, -1649667222 -> 3280, -1649667221 -> 3774
    //   3280: getstatic Perryc.c : I
    //   3283: iflt -> 3297
    //   3286: ldc2_w 1394639534
    //   3289: l2i
    //   3290: ldc_w 305846375
    //   3293: ixor
    //   3294: goto -> 3305
    //   3297: ldc2_w -880719714
    //   3300: l2i
    //   3301: ldc_w -1524653904
    //   3304: ixor
    //   3305: ldc2_w -658975964
    //   3308: l2i
    //   3309: ldc_w 45620232
    //   3312: ixor
    //   3313: ixor
    //   3314: lookupswitch default -> 3340, -2056611566 -> 3297, -1692756507 -> 6424
    //   3340: getstatic bigname/zprestige/webhack/WebHack.colorManager : Lbigname/zprestige/webhack/manager/ColorManager;
    //   3343: getstatic Perryc.c : I
    //   3346: iflt -> 3360
    //   3349: ldc2_w 193539579
    //   3352: l2i
    //   3353: ldc_w 194207533
    //   3356: ixor
    //   3357: goto -> 3368
    //   3360: ldc2_w -2025871955
    //   3363: l2i
    //   3364: ldc_w 1323443271
    //   3367: ixor
    //   3368: ldc2_w -788902317
    //   3371: l2i
    //   3372: ldc_w -1964556343
    //   3375: ixor
    //   3376: ixor
    //   3377: lookupswitch default -> 3404, 1164061685 -> 3360, 1510409036 -> 6344
    //   3404: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   3407: ldc_w bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   3410: getstatic Perryc.0 : I
    //   3413: ifle -> 3427
    //   3416: ldc2_w -368131660
    //   3419: l2i
    //   3420: ldc_w 31955175
    //   3423: ixor
    //   3424: goto -> 3435
    //   3427: ldc2_w -1026352516
    //   3430: l2i
    //   3431: ldc_w 1076805886
    //   3434: ixor
    //   3435: ldc2_w 39024421
    //   3438: l2i
    //   3439: ldc_w -1850523010
    //   3442: ixor
    //   3443: ixor
    //   3444: lookupswitch default -> 3472, -1578019085 -> 3427, 2013883400 -> 6360
    //   3472: goto -> 3476
    //   3475: athrow
    //   3476: invokevirtual getModuleByClass : (Ljava/lang/Class;)Lbigname/zprestige/webhack/features/modules/Module;
    //   3479: goto -> 3483
    //   3482: athrow
    //   3483: checkcast bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   3486: getstatic Perryc.1 : I
    //   3489: ifeq -> 3503
    //   3492: ldc2_w -1706229915
    //   3495: l2i
    //   3496: ldc_w 25521732
    //   3499: ixor
    //   3500: goto -> 3511
    //   3503: ldc2_w 1898221998
    //   3506: l2i
    //   3507: ldc_w 421731605
    //   3510: ixor
    //   3511: ldc2_w -1424679321
    //   3514: l2i
    //   3515: ldc_w 1708898154
    //   3518: ixor
    //   3519: ixor
    //   3520: lookupswitch default -> 6350, -1496767050 -> 3548, 1426536492 -> 3503
    //   3548: getfield hoverAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3551: getstatic Perryc.c : I
    //   3554: iflt -> 3568
    //   3557: ldc2_w -675860415
    //   3560: l2i
    //   3561: ldc_w -1177098548
    //   3564: ixor
    //   3565: goto -> 3576
    //   3568: ldc2_w 633357722
    //   3571: l2i
    //   3572: ldc_w -1051017057
    //   3575: ixor
    //   3576: ldc2_w -1124860972
    //   3579: l2i
    //   3580: ldc_w 96297734
    //   3583: ixor
    //   3584: ixor
    //   3585: lookupswitch default -> 6500, -684765601 -> 3568, 1574182359 -> 3612
    //   3612: goto -> 3616
    //   3615: athrow
    //   3616: invokevirtual getValue : ()Ljava/lang/Object;
    //   3619: goto -> 3623
    //   3622: athrow
    //   3623: checkcast java/lang/Integer
    //   3626: getstatic Perryc.0 : I
    //   3629: ifle -> 3643
    //   3632: ldc2_w 1058886276
    //   3635: l2i
    //   3636: ldc_w -1555944891
    //   3639: ixor
    //   3640: goto -> 3651
    //   3643: ldc2_w -1842044218
    //   3646: l2i
    //   3647: ldc_w 1103196226
    //   3650: ixor
    //   3651: ldc2_w 734267914
    //   3654: l2i
    //   3655: ldc_w 1222190817
    //   3658: ixor
    //   3659: ixor
    //   3660: lookupswitch default -> 6454, -1326907793 -> 3688, -12430294 -> 3643
    //   3688: goto -> 3692
    //   3691: athrow
    //   3692: invokevirtual intValue : ()I
    //   3695: goto -> 3699
    //   3698: athrow
    //   3699: getstatic Perryc.0 : I
    //   3702: ifle -> 3716
    //   3705: ldc2_w 1514939642
    //   3708: l2i
    //   3709: ldc_w 1372852753
    //   3712: ixor
    //   3713: goto -> 3724
    //   3716: ldc2_w 1933774194
    //   3719: l2i
    //   3720: ldc_w 863643226
    //   3723: ixor
    //   3724: ldc2_w 512645533
    //   3727: l2i
    //   3728: ldc_w 70753550
    //   3731: ixor
    //   3732: ixor
    //   3733: lookupswitch default -> 3760, -1545003907 -> 3716, 287437432 -> 6352
    //   3760: goto -> 3764
    //   3763: athrow
    //   3764: invokevirtual getColorWithAlpha : (I)I
    //   3767: goto -> 3771
    //   3770: athrow
    //   3771: goto -> 4267
    //   3774: getstatic Perryc.1 : I
    //   3777: ifeq -> 3791
    //   3780: ldc2_w -767627804
    //   3783: l2i
    //   3784: ldc_w -1530389532
    //   3787: ixor
    //   3788: goto -> 3799
    //   3791: ldc2_w 863855863
    //   3794: l2i
    //   3795: ldc_w 545106939
    //   3798: ixor
    //   3799: ldc2_w 681625521
    //   3802: l2i
    //   3803: ldc_w -752770997
    //   3806: ixor
    //   3807: ixor
    //   3808: lookupswitch default -> 6458, -1921543686 -> 3791, -394155786 -> 3836
    //   3836: getstatic bigname/zprestige/webhack/WebHack.colorManager : Lbigname/zprestige/webhack/manager/ColorManager;
    //   3839: getstatic Perryc.0 : I
    //   3842: ifle -> 3856
    //   3845: ldc2_w 1823765029
    //   3848: l2i
    //   3849: ldc_w -1699932183
    //   3852: ixor
    //   3853: goto -> 3864
    //   3856: ldc2_w 1269711958
    //   3859: l2i
    //   3860: ldc_w 480561403
    //   3863: ixor
    //   3864: ldc2_w 933183858
    //   3867: l2i
    //   3868: ldc_w 1536116174
    //   3871: ixor
    //   3872: ixor
    //   3873: lookupswitch default -> 6362, -1710661264 -> 3856, 991594513 -> 3900
    //   3900: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   3903: ldc_w bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   3906: getstatic Perryc.0 : I
    //   3909: ifle -> 3923
    //   3912: ldc2_w -1131439160
    //   3915: l2i
    //   3916: ldc_w -896423515
    //   3919: ixor
    //   3920: goto -> 3931
    //   3923: ldc2_w -196959471
    //   3926: l2i
    //   3927: ldc_w 210872381
    //   3930: ixor
    //   3931: ldc2_w -220369710
    //   3934: l2i
    //   3935: ldc_w -1929331129
    //   3938: ixor
    //   3939: ixor
    //   3940: lookupswitch default -> 3968, -1246255999 -> 3923, 163832056 -> 6496
    //   3968: goto -> 3972
    //   3971: athrow
    //   3972: invokevirtual getModuleByClass : (Ljava/lang/Class;)Lbigname/zprestige/webhack/features/modules/Module;
    //   3975: goto -> 3979
    //   3978: athrow
    //   3979: checkcast bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   3982: getstatic Perryc.1 : I
    //   3985: ifeq -> 3999
    //   3988: ldc2_w 250551981
    //   3991: l2i
    //   3992: ldc_w 1770692519
    //   3995: ixor
    //   3996: goto -> 4007
    //   3999: ldc2_w -564485107
    //   4002: l2i
    //   4003: ldc_w -1105883417
    //   4006: ixor
    //   4007: ldc2_w -1758101913
    //   4010: l2i
    //   4011: ldc_w 2033418698
    //   4014: ixor
    //   4015: ixor
    //   4016: lookupswitch default -> 6376, -1989968217 -> 3999, -1907763897 -> 4044
    //   4044: getfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4047: getstatic Perryc.0 : I
    //   4050: ifle -> 4064
    //   4053: ldc2_w -281250676
    //   4056: l2i
    //   4057: ldc_w 2063116591
    //   4060: ixor
    //   4061: goto -> 4072
    //   4064: ldc2_w 226402305
    //   4067: l2i
    //   4068: ldc_w -1190668452
    //   4071: ixor
    //   4072: ldc2_w 1190824032
    //   4075: l2i
    //   4076: ldc_w 1772742684
    //   4079: ixor
    //   4080: ixor
    //   4081: lookupswitch default -> 6494, -1691740383 -> 4108, -1164460577 -> 4064
    //   4108: goto -> 4112
    //   4111: athrow
    //   4112: invokevirtual getValue : ()Ljava/lang/Object;
    //   4115: goto -> 4119
    //   4118: athrow
    //   4119: checkcast java/lang/Integer
    //   4122: getstatic Perryc.0 : I
    //   4125: ifle -> 4139
    //   4128: ldc2_w -1062708806
    //   4131: l2i
    //   4132: ldc_w 267504271
    //   4135: ixor
    //   4136: goto -> 4147
    //   4139: ldc2_w 718955050
    //   4142: l2i
    //   4143: ldc_w 340411737
    //   4146: ixor
    //   4147: ldc2_w 1687026564
    //   4150: l2i
    //   4151: ldc_w -1578933652
    //   4154: ixor
    //   4155: ixor
    //   4156: lookupswitch default -> 6364, -67191141 -> 4184, 171379421 -> 4139
    //   4184: goto -> 4188
    //   4187: athrow
    //   4188: invokevirtual intValue : ()I
    //   4191: goto -> 4195
    //   4194: athrow
    //   4195: getstatic Perryc.1 : I
    //   4198: ifeq -> 4212
    //   4201: ldc2_w -951163098
    //   4204: l2i
    //   4205: ldc_w -1006482737
    //   4208: ixor
    //   4209: goto -> 4220
    //   4212: ldc2_w 782350090
    //   4215: l2i
    //   4216: ldc_w -829104247
    //   4219: ixor
    //   4220: ldc2_w 677244764
    //   4223: l2i
    //   4224: ldc_w -900262626
    //   4227: ixor
    //   4228: ixor
    //   4229: lookupswitch default -> 4256, -515450965 -> 6420, -277707073 -> 4212
    //   4256: goto -> 4260
    //   4259: athrow
    //   4260: invokevirtual getColorWithAlpha : (I)I
    //   4263: goto -> 4267
    //   4266: athrow
    //   4267: getstatic Perryc.c : I
    //   4270: iflt -> 4284
    //   4273: ldc2_w -233902189
    //   4276: l2i
    //   4277: ldc_w -337066535
    //   4280: ixor
    //   4281: goto -> 4292
    //   4284: ldc2_w -1281077453
    //   4287: l2i
    //   4288: ldc_w 475088999
    //   4291: ixor
    //   4292: ldc2_w 1157791057
    //   4295: l2i
    //   4296: ldc_w -1527089114
    //   4299: ixor
    //   4300: ixor
    //   4301: lookupswitch default -> 4328, -134242707 -> 4284, -132239555 -> 6436
    //   4328: goto -> 4332
    //   4331: athrow
    //   4332: invokestatic drawRect : (FFFFI)V
    //   4335: goto -> 4339
    //   4338: athrow
    //   4339: getstatic Perryc.1 : I
    //   4342: ifeq -> 4356
    //   4345: ldc2_w 1581528814
    //   4348: l2i
    //   4349: ldc_w 1013873669
    //   4352: ixor
    //   4353: goto -> 4364
    //   4356: ldc2_w -485691068
    //   4359: l2i
    //   4360: ldc_w 242095315
    //   4363: ixor
    //   4364: ldc2_w 231215027
    //   4367: l2i
    //   4368: ldc_w -116924298
    //   4371: ixor
    //   4372: ixor
    //   4373: lookupswitch default -> 6346, -1763334866 -> 4356, 430770770 -> 4400
    //   4400: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   4403: new java/lang/StringBuilder
    //   4406: dup
    //   4407: getstatic Perryc.0 : I
    //   4410: ifle -> 4424
    //   4413: ldc2_w -999667852
    //   4416: l2i
    //   4417: ldc_w -523416592
    //   4420: ixor
    //   4421: goto -> 4432
    //   4424: ldc2_w 1279883999
    //   4427: l2i
    //   4428: ldc_w -1533693979
    //   4431: ixor
    //   4432: ldc2_w 1844902198
    //   4435: l2i
    //   4436: ldc_w 1921751354
    //   4439: ixor
    //   4440: ixor
    //   4441: lookupswitch default -> 4468, 689963409 -> 4424, 1004170376 -> 6348
    //   4468: goto -> 4472
    //   4471: athrow
    //   4472: invokespecial <init> : ()V
    //   4475: goto -> 4479
    //   4478: athrow
    //   4479: getstatic Perryc.c : I
    //   4482: iflt -> 4496
    //   4485: ldc2_w 1952947063
    //   4488: l2i
    //   4489: ldc_w 1662680257
    //   4492: ixor
    //   4493: goto -> 4504
    //   4496: ldc2_w 1447931242
    //   4499: l2i
    //   4500: ldc_w -1847852766
    //   4503: ixor
    //   4504: ldc2_w 707330905
    //   4507: l2i
    //   4508: ldc_w -1009446587
    //   4511: ixor
    //   4512: ixor
    //   4513: lookupswitch default -> 4540, -251863496 -> 4496, -25037398 -> 6488
    //   4540: aload_0
    //   4541: getstatic Perryc.1 : I
    //   4544: ifeq -> 4558
    //   4547: ldc2_w 2106260219
    //   4550: l2i
    //   4551: ldc_w -674301163
    //   4554: ixor
    //   4555: goto -> 4566
    //   4558: ldc2_w 399156293
    //   4561: l2i
    //   4562: ldc_w 1398319220
    //   4565: ixor
    //   4566: ldc2_w -502683629
    //   4569: l2i
    //   4570: ldc_w -1823325167
    //   4573: ixor
    //   4574: ixor
    //   4575: lookupswitch default -> 6478, -618664468 -> 4558, 902422579 -> 4600
    //   4600: goto -> 4604
    //   4603: athrow
    //   4604: invokevirtual getName : ()Ljava/lang/String;
    //   4607: goto -> 4611
    //   4610: athrow
    //   4611: getstatic Perryc.c : I
    //   4614: iflt -> 4628
    //   4617: ldc2_w 611818299
    //   4620: l2i
    //   4621: ldc_w -1989435559
    //   4624: ixor
    //   4625: goto -> 4636
    //   4628: ldc2_w -631135792
    //   4631: l2i
    //   4632: ldc_w 1541441152
    //   4635: ixor
    //   4636: ldc2_w -332034109
    //   4639: l2i
    //   4640: ldc_w 682053392
    //   4643: ixor
    //   4644: ixor
    //   4645: lookupswitch default -> 4672, -335209471 -> 4628, 1770964145 -> 6368
    //   4672: goto -> 4676
    //   4675: athrow
    //   4676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4679: goto -> 4683
    //   4682: athrow
    //   4683: ldc_w ' '
    //   4686: getstatic Perryc.1 : I
    //   4689: ifeq -> 4703
    //   4692: ldc2_w 1463822066
    //   4695: l2i
    //   4696: ldc_w 1015770226
    //   4699: ixor
    //   4700: goto -> 4711
    //   4703: ldc2_w -1548339647
    //   4706: l2i
    //   4707: ldc_w -1385487164
    //   4710: ixor
    //   4711: ldc2_w 416748651
    //   4714: l2i
    //   4715: ldc_w 1970249115
    //   4718: ixor
    //   4719: ixor
    //   4720: lookupswitch default -> 6450, 108249968 -> 4703, 1667603317 -> 4748
    //   4748: goto -> 4752
    //   4751: athrow
    //   4752: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4755: goto -> 4759
    //   4758: athrow
    //   4759: getstatic Perryc.c : I
    //   4762: iflt -> 4776
    //   4765: ldc2_w -1754890239
    //   4768: l2i
    //   4769: ldc_w -581070743
    //   4772: ixor
    //   4773: goto -> 4784
    //   4776: ldc2_w -757410862
    //   4779: l2i
    //   4780: ldc_w 58591201
    //   4783: ixor
    //   4784: ldc2_w -229313640
    //   4787: l2i
    //   4788: ldc_w 150821634
    //   4791: ixor
    //   4792: ixor
    //   4793: lookupswitch default -> 4820, -1332561678 -> 6338, 1668944093 -> 4776
    //   4820: getstatic com/mojang/realmsclient/gui/ChatFormatting.GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4823: getstatic Perryc.0 : I
    //   4826: ifle -> 4840
    //   4829: ldc2_w 603038256
    //   4832: l2i
    //   4833: ldc_w -977649879
    //   4836: ixor
    //   4837: goto -> 4848
    //   4840: ldc2_w -774406753
    //   4843: l2i
    //   4844: ldc_w -292126220
    //   4847: ixor
    //   4848: ldc2_w -2035520831
    //   4851: l2i
    //   4852: ldc_w -1736829476
    //   4855: ixor
    //   4856: ixor
    //   4857: lookupswitch default -> 6472, -123870716 -> 4840, 563577718 -> 4884
    //   4884: goto -> 4888
    //   4887: athrow
    //   4888: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4891: goto -> 4895
    //   4894: athrow
    //   4895: getstatic Perryc.c : I
    //   4898: iflt -> 4912
    //   4901: ldc2_w 1829335059
    //   4904: l2i
    //   4905: ldc_w 1196101345
    //   4908: ixor
    //   4909: goto -> 4920
    //   4912: ldc2_w 1560681476
    //   4915: l2i
    //   4916: ldc_w -322167359
    //   4919: ixor
    //   4920: ldc2_w -1159007481
    //   4923: l2i
    //   4924: ldc_w -1701319711
    //   4927: ixor
    //   4928: ixor
    //   4929: lookupswitch default -> 4956, 171927060 -> 6336, 1790841484 -> 4912
    //   4956: aload_0
    //   4957: getstatic Perryc.1 : I
    //   4960: ifeq -> 4974
    //   4963: ldc2_w 2003856657
    //   4966: l2i
    //   4967: ldc_w 42583820
    //   4970: ixor
    //   4971: goto -> 4982
    //   4974: ldc2_w 1806103002
    //   4977: l2i
    //   4978: ldc_w -1364585035
    //   4981: ixor
    //   4982: ldc2_w 1622329666
    //   4985: l2i
    //   4986: ldc_w -969071165
    //   4989: ixor
    //   4990: ixor
    //   4991: lookupswitch default -> 6468, -747223396 -> 4974, 1669531886 -> 5016
    //   5016: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5019: getstatic Perryc.0 : I
    //   5022: ifle -> 5036
    //   5025: ldc2_w 568814386
    //   5028: l2i
    //   5029: ldc_w 1398182706
    //   5032: ixor
    //   5033: goto -> 5044
    //   5036: ldc2_w 1705706970
    //   5039: l2i
    //   5040: ldc_w -1208409122
    //   5043: ixor
    //   5044: ldc2_w -1002597760
    //   5047: l2i
    //   5048: ldc_w -419219353
    //   5051: ixor
    //   5052: ixor
    //   5053: lookupswitch default -> 6434, -244544285 -> 5080, 1368347367 -> 5036
    //   5080: goto -> 5084
    //   5083: athrow
    //   5084: invokevirtual getValue : ()Ljava/lang/Object;
    //   5087: goto -> 5091
    //   5090: athrow
    //   5091: instanceof java/lang/Float
    //   5094: ifeq -> 5108
    //   5097: ldc2_w 912027955
    //   5100: l2i
    //   5101: ldc_w 1597004512
    //   5104: ixor
    //   5105: goto -> 5116
    //   5108: ldc2_w -1822405362
    //   5111: l2i
    //   5112: ldc_w -99850532
    //   5115: ixor
    //   5116: ldc2_w 878015416
    //   5119: l2i
    //   5120: ldc_w 10984807
    //   5123: ixor
    //   5124: ixor
    //   5125: tableswitch default -> 5097, 1570686220 -> 5148, 1570686221 -> 5346
    //   5148: getstatic Perryc.c : I
    //   5151: iflt -> 5165
    //   5154: ldc2_w -1385591614
    //   5157: l2i
    //   5158: ldc_w -1180012239
    //   5161: ixor
    //   5162: goto -> 5173
    //   5165: ldc2_w -2005568800
    //   5168: l2i
    //   5169: ldc_w 620432622
    //   5172: ixor
    //   5173: ldc2_w 385752605
    //   5176: l2i
    //   5177: ldc_w -72951636
    //   5180: ixor
    //   5181: ixor
    //   5182: lookupswitch default -> 6444, -107267262 -> 5165, 1104591039 -> 5208
    //   5208: aload_0
    //   5209: getstatic Perryc.0 : I
    //   5212: ifle -> 5226
    //   5215: ldc2_w 1672015175
    //   5218: l2i
    //   5219: ldc_w -499523730
    //   5222: ixor
    //   5223: goto -> 5234
    //   5226: ldc2_w 1206674424
    //   5229: l2i
    //   5230: ldc_w 279583798
    //   5233: ixor
    //   5234: ldc2_w -507663138
    //   5237: l2i
    //   5238: ldc_w 654632720
    //   5241: ixor
    //   5242: ixor
    //   5243: lookupswitch default -> 6378, -1845545984 -> 5268, 1193834983 -> 5226
    //   5268: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5271: getstatic Perryc.c : I
    //   5274: iflt -> 5288
    //   5277: ldc2_w 281670196
    //   5280: l2i
    //   5281: ldc_w 14029979
    //   5284: ixor
    //   5285: goto -> 5296
    //   5288: ldc2_w -224879201
    //   5291: l2i
    //   5292: ldc_w -936900919
    //   5295: ixor
    //   5296: ldc2_w -181465283
    //   5299: l2i
    //   5300: ldc_w -978741866
    //   5303: ixor
    //   5304: ixor
    //   5305: lookupswitch default -> 6398, 171311613 -> 5332, 546929668 -> 5288
    //   5332: goto -> 5336
    //   5335: athrow
    //   5336: invokevirtual getValue : ()Ljava/lang/Object;
    //   5339: goto -> 5343
    //   5342: athrow
    //   5343: goto -> 5691
    //   5346: getstatic Perryc.1 : I
    //   5349: ifeq -> 5363
    //   5352: ldc2_w -1877052359
    //   5355: l2i
    //   5356: ldc_w -691000216
    //   5359: ixor
    //   5360: goto -> 5371
    //   5363: ldc2_w 59675235
    //   5366: l2i
    //   5367: ldc_w -1044780969
    //   5370: ixor
    //   5371: ldc2_w -513616703
    //   5374: l2i
    //   5375: ldc_w -2045501902
    //   5378: ixor
    //   5379: ixor
    //   5380: lookupswitch default -> 5408, 565744290 -> 6462, 1451035238 -> 5363
    //   5408: aload_0
    //   5409: getstatic Perryc.1 : I
    //   5412: ifeq -> 5426
    //   5415: ldc2_w -559461823
    //   5418: l2i
    //   5419: ldc_w -1229807276
    //   5422: ixor
    //   5423: goto -> 5434
    //   5426: ldc2_w -377642307
    //   5429: l2i
    //   5430: ldc_w -1921657064
    //   5433: ixor
    //   5434: ldc2_w -1580741788
    //   5437: l2i
    //   5438: ldc_w 47137594
    //   5441: ixor
    //   5442: ixor
    //   5443: lookupswitch default -> 6412, -956236293 -> 5468, -887266485 -> 5426
    //   5468: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5471: getstatic Perryc.0 : I
    //   5474: ifle -> 5488
    //   5477: ldc2_w 1540628326
    //   5480: l2i
    //   5481: ldc_w 518617526
    //   5484: ixor
    //   5485: goto -> 5496
    //   5488: ldc2_w 2085441066
    //   5491: l2i
    //   5492: ldc_w -1669688808
    //   5495: ixor
    //   5496: ldc2_w -1235593804
    //   5499: l2i
    //   5500: ldc_w 107425772
    //   5503: ixor
    //   5504: ixor
    //   5505: lookupswitch default -> 5532, -988027224 -> 5488, -184542072 -> 6408
    //   5532: goto -> 5536
    //   5535: athrow
    //   5536: invokevirtual getValue : ()Ljava/lang/Object;
    //   5539: goto -> 5543
    //   5542: athrow
    //   5543: checkcast java/lang/Number
    //   5546: getstatic Perryc.1 : I
    //   5549: ifeq -> 5563
    //   5552: ldc2_w -400979719
    //   5555: l2i
    //   5556: ldc_w 1830867974
    //   5559: ixor
    //   5560: goto -> 5571
    //   5563: ldc2_w -268249750
    //   5566: l2i
    //   5567: ldc_w 145771468
    //   5570: ixor
    //   5571: ldc2_w 1269330254
    //   5574: l2i
    //   5575: ldc_w 1174073983
    //   5578: ixor
    //   5579: ixor
    //   5580: lookupswitch default -> 5608, -1955864626 -> 6502, 422996764 -> 5563
    //   5608: goto -> 5612
    //   5611: athrow
    //   5612: invokevirtual doubleValue : ()D
    //   5615: goto -> 5619
    //   5618: athrow
    //   5619: getstatic Perryc.1 : I
    //   5622: ifeq -> 5636
    //   5625: ldc2_w 343567335
    //   5628: l2i
    //   5629: ldc_w 267984111
    //   5632: ixor
    //   5633: goto -> 5644
    //   5636: ldc2_w -35625306
    //   5639: l2i
    //   5640: ldc_w -1011259377
    //   5643: ixor
    //   5644: ldc2_w 96725297
    //   5647: l2i
    //   5648: ldc_w -1957454052
    //   5651: ixor
    //   5652: ixor
    //   5653: lookupswitch default -> 5680, -1793916635 -> 6404, 1053924654 -> 5636
    //   5680: goto -> 5684
    //   5683: athrow
    //   5684: invokestatic valueOf : (D)Ljava/lang/Double;
    //   5687: goto -> 5691
    //   5690: athrow
    //   5691: getstatic Perryc.0 : I
    //   5694: ifle -> 5708
    //   5697: ldc2_w 2068624405
    //   5700: l2i
    //   5701: ldc_w 76463540
    //   5704: ixor
    //   5705: goto -> 5716
    //   5708: ldc2_w 1406056723
    //   5711: l2i
    //   5712: ldc_w 89552228
    //   5715: ixor
    //   5716: ldc2_w 2042324685
    //   5719: l2i
    //   5720: ldc_w 1729647130
    //   5723: ixor
    //   5724: ixor
    //   5725: lookupswitch default -> 5752, 1633762678 -> 6358, 2019588080 -> 5708
    //   5752: goto -> 5756
    //   5755: athrow
    //   5756: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5759: goto -> 5763
    //   5762: athrow
    //   5763: getstatic Perryc.c : I
    //   5766: iflt -> 5780
    //   5769: ldc2_w 683540236
    //   5772: l2i
    //   5773: ldc_w -1123073000
    //   5776: ixor
    //   5777: goto -> 5788
    //   5780: ldc2_w -523836698
    //   5783: l2i
    //   5784: ldc_w 347409329
    //   5787: ixor
    //   5788: ldc2_w 1271548942
    //   5791: l2i
    //   5792: ldc_w 818469753
    //   5795: ixor
    //   5796: ixor
    //   5797: lookupswitch default -> 6396, -1888387552 -> 5824, -290444189 -> 5780
    //   5824: goto -> 5828
    //   5827: athrow
    //   5828: invokevirtual toString : ()Ljava/lang/String;
    //   5831: goto -> 5835
    //   5834: athrow
    //   5835: getstatic Perryc.1 : I
    //   5838: ifeq -> 5852
    //   5841: ldc2_w 1204193577
    //   5844: l2i
    //   5845: ldc_w 574737040
    //   5848: ixor
    //   5849: goto -> 5860
    //   5852: ldc2_w 1129633688
    //   5855: l2i
    //   5856: ldc_w -1074188083
    //   5859: ixor
    //   5860: ldc2_w 1690364403
    //   5863: l2i
    //   5864: ldc_w -504846650
    //   5867: ixor
    //   5868: ixor
    //   5869: lookupswitch default -> 5896, -1436083912 -> 5852, -525398900 -> 6366
    //   5896: aload_0
    //   5897: getstatic Perryc.0 : I
    //   5900: ifle -> 5914
    //   5903: ldc2_w -293516588
    //   5906: l2i
    //   5907: ldc_w -2069640652
    //   5910: ixor
    //   5911: goto -> 5922
    //   5914: ldc2_w 1994487554
    //   5917: l2i
    //   5918: ldc_w 307609146
    //   5921: ixor
    //   5922: ldc2_w -540961597
    //   5925: l2i
    //   5926: ldc_w 641046327
    //   5929: ixor
    //   5930: ixor
    //   5931: lookupswitch default -> 5956, -1814658284 -> 6340, -531003082 -> 5914
    //   5956: getfield x : F
    //   5959: ldc_w 0.93524027
    //   5962: invokestatic floatToIntBits : (F)I
    //   5965: ldc_w 2138855643
    //   5968: ixor
    //   5969: invokestatic intBitsToFloat : (I)F
    //   5972: fadd
    //   5973: getstatic Perryc.c : I
    //   5976: iflt -> 5990
    //   5979: ldc2_w -736226833
    //   5982: l2i
    //   5983: ldc_w -451144710
    //   5986: ixor
    //   5987: goto -> 5998
    //   5990: ldc2_w -1152886900
    //   5993: l2i
    //   5994: ldc_w -1051492769
    //   5997: ixor
    //   5998: ldc2_w -1337391535
    //   6001: l2i
    //   6002: ldc_w 453921182
    //   6005: ixor
    //   6006: ixor
    //   6007: lookupswitch default -> 6510, -1706734118 -> 5990, -782473700 -> 6032
    //   6032: aload_0
    //   6033: getstatic Perryc.c : I
    //   6036: iflt -> 6050
    //   6039: ldc2_w -1299053264
    //   6042: l2i
    //   6043: ldc_w -886827387
    //   6046: ixor
    //   6047: goto -> 6058
    //   6050: ldc2_w 999318512
    //   6053: l2i
    //   6054: ldc_w -895404541
    //   6057: ixor
    //   6058: ldc2_w 1021047169
    //   6061: l2i
    //   6062: ldc_w -1885136867
    //   6065: ixor
    //   6066: ixor
    //   6067: lookupswitch default -> 6446, -892405207 -> 6050, 1112128623 -> 6092
    //   6092: getfield y : F
    //   6095: ldc_w 17.99042
    //   6098: invokestatic floatToIntBits : (F)I
    //   6101: ldc_w 2119595515
    //   6104: ixor
    //   6105: invokestatic intBitsToFloat : (I)F
    //   6108: fsub
    //   6109: getstatic Perryc.c : I
    //   6112: iflt -> 6126
    //   6115: ldc2_w 90451269
    //   6118: l2i
    //   6119: ldc_w -1016899777
    //   6122: ixor
    //   6123: goto -> 6134
    //   6126: ldc2_w 1821004893
    //   6129: l2i
    //   6130: ldc_w 864681251
    //   6133: ixor
    //   6134: ldc2_w -1533118978
    //   6137: l2i
    //   6138: ldc_w 320414546
    //   6141: ixor
    //   6142: ixor
    //   6143: lookupswitch default -> 6332, -393936942 -> 6168, 1904225494 -> 6126
    //   6168: goto -> 6172
    //   6171: athrow
    //   6172: invokestatic getClickGui : ()Lbigname/zprestige/webhack/features/gui/OyVeyGui;
    //   6175: goto -> 6179
    //   6178: athrow
    //   6179: getstatic Perryc.1 : I
    //   6182: ifeq -> 6196
    //   6185: ldc2_w 1460308141
    //   6188: l2i
    //   6189: ldc_w -620264487
    //   6192: ixor
    //   6193: goto -> 6204
    //   6196: ldc2_w -1032991014
    //   6199: l2i
    //   6200: ldc_w 1848338197
    //   6203: ixor
    //   6204: ldc2_w -284140268
    //   6207: l2i
    //   6208: ldc_w 1914314157
    //   6211: ixor
    //   6212: ixor
    //   6213: lookupswitch default -> 6432, 285690829 -> 6196, 827124086 -> 6240
    //   6240: goto -> 6244
    //   6243: athrow
    //   6244: invokevirtual getTextOffset : ()I
    //   6247: goto -> 6251
    //   6250: athrow
    //   6251: i2f
    //   6252: fsub
    //   6253: ldc2_w -1237960937
    //   6256: l2i
    //   6257: ldc_w 1237960936
    //   6260: ixor
    //   6261: getstatic Perryc.1 : I
    //   6264: ifeq -> 6278
    //   6267: ldc2_w -506975639
    //   6270: l2i
    //   6271: ldc_w -1912895803
    //   6274: ixor
    //   6275: goto -> 6286
    //   6278: ldc2_w -1077249818
    //   6281: l2i
    //   6282: ldc_w 1428950797
    //   6285: ixor
    //   6286: ldc2_w 1943793196
    //   6289: l2i
    //   6290: ldc_w 1641702635
    //   6293: ixor
    //   6294: ixor
    //   6295: lookupswitch default -> 6440, -119014100 -> 6320, 2117215851 -> 6278
    //   6320: goto -> 6324
    //   6323: athrow
    //   6324: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   6327: goto -> 6331
    //   6330: athrow
    //   6331: return
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
    //   6352: aconst_null
    //   6353: athrow
    //   6354: aconst_null
    //   6355: athrow
    //   6356: aconst_null
    //   6357: athrow
    //   6358: aconst_null
    //   6359: athrow
    //   6360: aconst_null
    //   6361: athrow
    //   6362: aconst_null
    //   6363: athrow
    //   6364: aconst_null
    //   6365: athrow
    //   6366: aconst_null
    //   6367: athrow
    //   6368: aconst_null
    //   6369: athrow
    //   6370: aconst_null
    //   6371: athrow
    //   6372: aconst_null
    //   6373: athrow
    //   6374: aconst_null
    //   6375: athrow
    //   6376: aconst_null
    //   6377: athrow
    //   6378: aconst_null
    //   6379: athrow
    //   6380: aconst_null
    //   6381: athrow
    //   6382: aconst_null
    //   6383: athrow
    //   6384: aconst_null
    //   6385: athrow
    //   6386: aconst_null
    //   6387: athrow
    //   6388: aconst_null
    //   6389: athrow
    //   6390: aconst_null
    //   6391: athrow
    //   6392: aconst_null
    //   6393: athrow
    //   6394: aconst_null
    //   6395: athrow
    //   6396: aconst_null
    //   6397: athrow
    //   6398: aconst_null
    //   6399: athrow
    //   6400: aconst_null
    //   6401: athrow
    //   6402: aconst_null
    //   6403: athrow
    //   6404: aconst_null
    //   6405: athrow
    //   6406: aconst_null
    //   6407: athrow
    //   6408: aconst_null
    //   6409: athrow
    //   6410: aconst_null
    //   6411: athrow
    //   6412: aconst_null
    //   6413: athrow
    //   6414: aconst_null
    //   6415: athrow
    //   6416: aconst_null
    //   6417: athrow
    //   6418: aconst_null
    //   6419: athrow
    //   6420: aconst_null
    //   6421: athrow
    //   6422: aconst_null
    //   6423: athrow
    //   6424: aconst_null
    //   6425: athrow
    //   6426: aconst_null
    //   6427: athrow
    //   6428: aconst_null
    //   6429: athrow
    //   6430: aconst_null
    //   6431: athrow
    //   6432: aconst_null
    //   6433: athrow
    //   6434: aconst_null
    //   6435: athrow
    //   6436: aconst_null
    //   6437: athrow
    //   6438: aconst_null
    //   6439: athrow
    //   6440: aconst_null
    //   6441: athrow
    //   6442: aconst_null
    //   6443: athrow
    //   6444: aconst_null
    //   6445: athrow
    //   6446: aconst_null
    //   6447: athrow
    //   6448: aconst_null
    //   6449: athrow
    //   6450: aconst_null
    //   6451: athrow
    //   6452: aconst_null
    //   6453: athrow
    //   6454: aconst_null
    //   6455: athrow
    //   6456: aconst_null
    //   6457: athrow
    //   6458: aconst_null
    //   6459: athrow
    //   6460: aconst_null
    //   6461: athrow
    //   6462: aconst_null
    //   6463: athrow
    //   6464: aconst_null
    //   6465: athrow
    //   6466: aconst_null
    //   6467: athrow
    //   6468: aconst_null
    //   6469: athrow
    //   6470: aconst_null
    //   6471: athrow
    //   6472: aconst_null
    //   6473: athrow
    //   6474: aconst_null
    //   6475: athrow
    //   6476: aconst_null
    //   6477: athrow
    //   6478: aconst_null
    //   6479: athrow
    //   6480: aconst_null
    //   6481: athrow
    //   6482: aconst_null
    //   6483: athrow
    //   6484: aconst_null
    //   6485: athrow
    //   6486: aconst_null
    //   6487: athrow
    //   6488: aconst_null
    //   6489: athrow
    //   6490: aconst_null
    //   6491: athrow
    //   6492: aconst_null
    //   6493: athrow
    //   6494: aconst_null
    //   6495: athrow
    //   6496: aconst_null
    //   6497: athrow
    //   6498: aconst_null
    //   6499: athrow
    //   6500: aconst_null
    //   6501: athrow
    //   6502: aconst_null
    //   6503: athrow
    //   6504: aconst_null
    //   6505: athrow
    //   6506: aconst_null
    //   6507: athrow
    //   6508: aconst_null
    //   6509: athrow
    //   6510: aconst_null
    //   6511: athrow
    //   6512: aconst_null
    //   6513: athrow
    //   6514: pop
    //   6515: goto -> 24
    //   6518: pop
    //   6519: aconst_null
    //   6520: goto -> 6514
    //   6523: dup
    //   6524: ifnull -> 6514
    //   6527: checkcast java/lang/Throwable
    //   6530: athrow
    //   6531: dup
    //   6532: ifnull -> 6518
    //   6535: checkcast java/lang/Throwable
    //   6538: athrow
    //   6539: aconst_null
    //   6540: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	6308	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/Slider;
    //   24	6308	1	mouseX	I
    //   24	6308	2	mouseY	I
    //   24	6308	3	partialTicks	F
    // Exception table:
    //   from	to	target	type
    //   8	20	6523	finally
    //   264	270	270	finally
    //   264	270	270	java/util/NoSuchElementException
    //   264	270	270	java/lang/UnsupportedOperationException
    //   264	270	270	java/util/ConcurrentModificationException
    //   264	270	3	finally
    //   1267	1274	1274	finally
    //   1267	1274	1267	java/util/NoSuchElementException
    //   1268	1274	1267	finally
    //   1268	1274	3	java/lang/UnsupportedOperationException
    //   1268	1274	1274	java/lang/NegativeArraySizeException
    //   1411	1418	1418	finally
    //   1411	1418	1418	java/lang/StringIndexOutOfBoundsException
    //   1411	1418	3	finally
    //   1411	1418	1418	java/lang/EnumConstantNotPresentException
    //   1412	1418	1411	java/util/NoSuchElementException
    //   1856	1862	1862	finally
    //   1856	1862	1862	finally
    //   1856	1862	1862	finally
    //   1856	1862	1862	java/lang/ClassCastException
    //   1856	1862	3	java/util/ConcurrentModificationException
    //   1931	1938	1938	finally
    //   1931	1938	3	java/lang/AssertionError
    //   1931	1938	3	finally
    //   1931	1938	1931	java/lang/IndexOutOfBoundsException
    //   1932	1938	3	finally
    //   2127	2134	2134	finally
    //   2127	2134	3	finally
    //   2127	2134	2127	finally
    //   2128	2134	2134	java/util/NoSuchElementException
    //   2128	2134	2134	java/lang/ArithmeticException
    //   2703	2710	2710	finally
    //   2703	2710	3	finally
    //   2703	2710	2703	finally
    //   2704	2710	2710	finally
    //   2704	2710	2710	java/lang/NullPointerException
    //   3220	3226	3226	finally
    //   3220	3226	3226	java/lang/ArithmeticException
    //   3220	3226	3	finally
    //   3220	3226	3	finally
    //   3220	3226	3	finally
    //   3475	3482	3482	finally
    //   3475	3482	3	java/util/NoSuchElementException
    //   3475	3482	3482	finally
    //   3476	3482	3482	java/util/NoSuchElementException
    //   3476	3482	3475	finally
    //   3616	3622	3622	finally
    //   3616	3622	3622	finally
    //   3616	3622	3622	java/lang/IllegalArgumentException
    //   3616	3622	3	finally
    //   3616	3622	3622	java/util/ConcurrentModificationException
    //   3691	3698	3698	finally
    //   3691	3698	3691	finally
    //   3691	3698	3698	finally
    //   3692	3698	3	java/lang/NumberFormatException
    //   3692	3698	3	finally
    //   3763	3770	3770	finally
    //   3763	3770	3763	finally
    //   3763	3770	3	java/lang/ArrayIndexOutOfBoundsException
    //   3763	3770	3763	java/lang/ArrayIndexOutOfBoundsException
    //   3763	3770	3770	finally
    //   3971	3978	3978	finally
    //   3971	3978	3971	finally
    //   3972	3978	3	java/lang/ArithmeticException
    //   3972	3978	3978	java/lang/RuntimeException
    //   3972	3978	3978	java/lang/ArrayIndexOutOfBoundsException
    //   4111	4118	4118	finally
    //   4111	4118	4111	java/lang/IllegalStateException
    //   4111	4118	4118	java/lang/AssertionError
    //   4112	4118	3	java/lang/NullPointerException
    //   4112	4118	4111	finally
    //   4187	4194	4194	finally
    //   4187	4194	4194	java/lang/AssertionError
    //   4187	4194	3	java/lang/EnumConstantNotPresentException
    //   4188	4194	4187	java/lang/UnsupportedOperationException
    //   4188	4194	4187	finally
    //   4259	4266	4266	finally
    //   4259	4266	3	finally
    //   4259	4266	4259	java/lang/ArrayIndexOutOfBoundsException
    //   4259	4266	3	finally
    //   4260	4266	4266	finally
    //   4331	4338	4338	finally
    //   4331	4338	4338	java/lang/ArrayIndexOutOfBoundsException
    //   4331	4338	3	finally
    //   4331	4338	4338	finally
    //   4332	4338	4331	java/util/NoSuchElementException
    //   4472	4478	4478	finally
    //   4472	4478	4478	java/lang/NegativeArraySizeException
    //   4472	4478	3	finally
    //   4472	4478	4478	java/lang/NegativeArraySizeException
    //   4472	4478	3	finally
    //   4603	4610	4610	finally
    //   4603	4610	4610	finally
    //   4603	4610	3	java/lang/NullPointerException
    //   4604	4610	4603	finally
    //   4604	4610	3	java/lang/AssertionError
    //   4675	4682	4682	finally
    //   4675	4682	4682	java/lang/ClassCastException
    //   4675	4682	4675	finally
    //   4675	4682	4682	finally
    //   4676	4682	3	java/lang/EnumConstantNotPresentException
    //   4751	4758	4758	finally
    //   4751	4758	4758	finally
    //   4751	4758	4751	java/lang/NumberFormatException
    //   4752	4758	4758	java/lang/NumberFormatException
    //   4752	4758	4758	finally
    //   4887	4894	4894	finally
    //   4887	4894	4894	finally
    //   4887	4894	4887	finally
    //   4888	4894	3	finally
    //   4888	4894	4887	finally
    //   5083	5090	5090	finally
    //   5083	5090	5090	java/lang/NumberFormatException
    //   5083	5090	3	finally
    //   5084	5090	3	java/lang/ArrayIndexOutOfBoundsException
    //   5084	5090	5083	java/lang/ArrayIndexOutOfBoundsException
    //   5335	5342	5342	finally
    //   5335	5342	3	finally
    //   5336	5342	3	finally
    //   5336	5342	5335	java/lang/NullPointerException
    //   5336	5342	5335	java/util/ConcurrentModificationException
    //   5536	5542	5542	finally
    //   5536	5542	5542	finally
    //   5536	5542	5542	java/util/NoSuchElementException
    //   5536	5542	3	finally
    //   5536	5542	3	finally
    //   5611	5618	5618	finally
    //   5611	5618	5611	finally
    //   5611	5618	3	finally
    //   5612	5618	5611	java/lang/IllegalArgumentException
    //   5612	5618	5618	java/lang/NullPointerException
    //   5683	5690	5690	finally
    //   5683	5690	5683	finally
    //   5684	5690	3	finally
    //   5684	5690	3	java/lang/StringIndexOutOfBoundsException
    //   5684	5690	5683	java/lang/RuntimeException
    //   5755	5762	5762	finally
    //   5755	5762	5755	java/lang/NumberFormatException
    //   5755	5762	5755	java/util/ConcurrentModificationException
    //   5755	5762	5755	finally
    //   5756	5762	5762	java/lang/NullPointerException
    //   5827	5834	5834	finally
    //   5827	5834	5827	finally
    //   5827	5834	5827	finally
    //   5827	5834	5827	finally
    //   5827	5834	5834	finally
    //   6172	6178	6178	finally
    //   6172	6178	3	java/lang/RuntimeException
    //   6172	6178	6178	java/lang/AssertionError
    //   6172	6178	6178	java/lang/ArrayIndexOutOfBoundsException
    //   6172	6178	6178	java/util/NoSuchElementException
    //   6243	6250	6250	finally
    //   6243	6250	6243	java/lang/ArrayIndexOutOfBoundsException
    //   6243	6250	3	java/lang/ArithmeticException
    //   6243	6250	6243	finally
    //   6244	6250	6250	java/lang/StringIndexOutOfBoundsException
    //   6323	6330	6330	finally
    //   6323	6330	6323	java/lang/NumberFormatException
    //   6323	6330	3	java/lang/AssertionError
    //   6323	6330	3	finally
    //   6324	6330	6330	java/lang/ArithmeticException
    //   6523	6531	6523	finally
    //   6539	6541	3	java/lang/IllegalStateException
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
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
  
  public float partialMultiplier() {
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
  
  public float part() {
    return Perry1.2P(this, (int)-2003524262L ^ 0xB4FDDAA4);
  }
  
  public int getHeight() {
    return Perry1.2X(this, (int)-609839029L ^ 0xB880E8A5);
  }
  
  public Slider(Setting setting) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1536261802
    //   9: l2i
    //   10: ldc_w -1919003917
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1950130771
    //   20: l2i
    //   21: ldc_w 1970877081
    //   24: ixor
    //   25: ldc2_w -818032459
    //   28: l2i
    //   29: ldc_w 1917509285
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1805242797 -> 17, -1803035211 -> 1596
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -1108675011
    //   70: l2i
    //   71: ldc_w 1379438547
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 1125124473
    //   81: l2i
    //   82: ldc_w 2077803890
    //   85: ixor
    //   86: ldc2_w -1820607699
    //   89: l2i
    //   90: ldc_w 1833752094
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 300225757 -> 1580, 338075809 -> 78
    //   120: aload_1
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 138
    //   127: ldc2_w 1893307928
    //   130: l2i
    //   131: ldc_w -223105255
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w -1904129959
    //   141: l2i
    //   142: ldc_w 615886708
    //   145: ixor
    //   146: ldc2_w -38679285
    //   149: l2i
    //   150: ldc_w 1517087497
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 180, 632758019 -> 1598, 1795086786 -> 138
    //   180: invokevirtual getName : ()Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 200
    //   189: ldc2_w 212703557
    //   192: l2i
    //   193: ldc_w -1596271844
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w 1858581608
    //   203: l2i
    //   204: ldc_w 1199935341
    //   207: ixor
    //   208: ldc2_w 843827693
    //   211: l2i
    //   212: ldc_w 937471446
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 244, -1445187998 -> 1574, 1725481701 -> 200
    //   244: invokespecial <init> : (Ljava/lang/String;)V
    //   247: getstatic Perryc.0 : I
    //   250: ifle -> 264
    //   253: ldc2_w -1733207542
    //   256: l2i
    //   257: ldc_w -690539424
    //   260: ixor
    //   261: goto -> 272
    //   264: ldc2_w -1504228115
    //   267: l2i
    //   268: ldc_w -1886062460
    //   271: ixor
    //   272: ldc2_w -1147627221
    //   275: l2i
    //   276: ldc_w -1664441760
    //   279: ixor
    //   280: ixor
    //   281: lookupswitch default -> 308, -1531417034 -> 264, 1765037345 -> 1606
    //   308: aload_0
    //   309: getstatic Perryc.0 : I
    //   312: ifle -> 326
    //   315: ldc2_w 1421438786
    //   318: l2i
    //   319: ldc_w 1641707374
    //   322: ixor
    //   323: goto -> 334
    //   326: ldc2_w 617332758
    //   329: l2i
    //   330: ldc_w -1315846180
    //   333: ixor
    //   334: ldc2_w -2030465332
    //   337: l2i
    //   338: ldc_w 1576453504
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 1586, -294890656 -> 326, 1314212998 -> 368
    //   368: aload_1
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w 1303002613
    //   378: l2i
    //   379: ldc_w -335599295
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 1720500668
    //   389: l2i
    //   390: ldc_w 828970648
    //   393: ixor
    //   394: ldc2_w 442300055
    //   397: l2i
    //   398: ldc_w 2026953545
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -992396950 -> 1602, -742805848 -> 386
    //   428: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   431: getstatic Perryc.c : I
    //   434: iflt -> 448
    //   437: ldc2_w 534220030
    //   440: l2i
    //   441: ldc_w -1892077034
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w -1011381068
    //   451: l2i
    //   452: ldc_w 1307367143
    //   455: ixor
    //   456: ldc2_w 997576011
    //   459: l2i
    //   460: ldc_w 1616284923
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 1616, -875692200 -> 448, -713548829 -> 492
    //   492: aload_0
    //   493: getstatic Perryc.0 : I
    //   496: ifle -> 510
    //   499: ldc2_w 387870065
    //   502: l2i
    //   503: ldc_w 460245664
    //   506: ixor
    //   507: goto -> 518
    //   510: ldc2_w -10709149
    //   513: l2i
    //   514: ldc_w -1507988247
    //   517: ixor
    //   518: ldc2_w 1227363069
    //   521: l2i
    //   522: ldc_w -128556214
    //   525: ixor
    //   526: ixor
    //   527: lookupswitch default -> 1578, -1123101082 -> 510, -398521795 -> 552
    //   552: aload_1
    //   553: getstatic Perryc.1 : I
    //   556: ifeq -> 570
    //   559: ldc2_w -1974694290
    //   562: l2i
    //   563: ldc_w -665458172
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w 1082608193
    //   573: l2i
    //   574: ldc_w 56427794
    //   577: ixor
    //   578: ldc2_w 987732574
    //   581: l2i
    //   582: ldc_w 1369881691
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, 468297719 -> 570, 962609775 -> 1608
    //   612: invokevirtual getMin : ()Ljava/lang/Object;
    //   615: checkcast java/lang/Number
    //   618: getstatic Perryc.c : I
    //   621: iflt -> 635
    //   624: ldc2_w 219637898
    //   627: l2i
    //   628: ldc_w 404984
    //   631: ixor
    //   632: goto -> 643
    //   635: ldc2_w 1526530476
    //   638: l2i
    //   639: ldc_w -777806481
    //   642: ixor
    //   643: ldc2_w 1581815247
    //   646: l2i
    //   647: ldc_w -2130631796
    //   650: ixor
    //   651: ixor
    //   652: lookupswitch default -> 680, -765922511 -> 1588, 1165244100 -> 635
    //   680: putfield min : Ljava/lang/Number;
    //   683: getstatic Perryc.0 : I
    //   686: ifle -> 700
    //   689: ldc2_w -830885653
    //   692: l2i
    //   693: ldc_w -21912147
    //   696: ixor
    //   697: goto -> 708
    //   700: ldc2_w -248693956
    //   703: l2i
    //   704: ldc_w -1685056721
    //   707: ixor
    //   708: ldc2_w 825662317
    //   711: l2i
    //   712: ldc_w -674001593
    //   715: ixor
    //   716: ixor
    //   717: lookupswitch default -> 1612, -1940373959 -> 744, -701693076 -> 700
    //   744: aload_0
    //   745: getstatic Perryc.1 : I
    //   748: ifeq -> 762
    //   751: ldc2_w 710351174
    //   754: l2i
    //   755: ldc_w 398387404
    //   758: ixor
    //   759: goto -> 770
    //   762: ldc2_w -2036154358
    //   765: l2i
    //   766: ldc_w -1776745961
    //   769: ixor
    //   770: ldc2_w 1191701759
    //   773: l2i
    //   774: ldc_w 1993881069
    //   777: ixor
    //   778: ixor
    //   779: lookupswitch default -> 1592, 204875928 -> 762, 560208655 -> 804
    //   804: aload_1
    //   805: getstatic Perryc.c : I
    //   808: iflt -> 822
    //   811: ldc2_w -960645171
    //   814: l2i
    //   815: ldc_w 1082038349
    //   818: ixor
    //   819: goto -> 830
    //   822: ldc2_w -57804705
    //   825: l2i
    //   826: ldc_w -862779525
    //   829: ixor
    //   830: ldc2_w -999899093
    //   833: l2i
    //   834: ldc_w -1742175569
    //   837: ixor
    //   838: ixor
    //   839: lookupswitch default -> 1570, -628265724 -> 822, 1817230752 -> 864
    //   864: invokevirtual getMax : ()Ljava/lang/Object;
    //   867: checkcast java/lang/Number
    //   870: getstatic Perryc.c : I
    //   873: iflt -> 887
    //   876: ldc2_w 771312540
    //   879: l2i
    //   880: ldc_w 1901989407
    //   883: ixor
    //   884: goto -> 895
    //   887: ldc2_w 2133368701
    //   890: l2i
    //   891: ldc_w 1900856262
    //   894: ixor
    //   895: ldc2_w 1246164982
    //   898: l2i
    //   899: ldc_w -1623906996
    //   902: ixor
    //   903: ixor
    //   904: lookupswitch default -> 1568, -1982556359 -> 887, -619213311 -> 932
    //   932: putfield max : Ljava/lang/Number;
    //   935: getstatic Perryc.c : I
    //   938: iflt -> 952
    //   941: ldc2_w 1340711806
    //   944: l2i
    //   945: ldc_w 1060632649
    //   948: ixor
    //   949: goto -> 960
    //   952: ldc2_w 1524800132
    //   955: l2i
    //   956: ldc_w 380347055
    //   959: ixor
    //   960: ldc2_w -962318845
    //   963: l2i
    //   964: ldc_w -52947400
    //   967: ixor
    //   968: ixor
    //   969: lookupswitch default -> 1584, 1252156172 -> 952, 1983184912 -> 996
    //   996: aload_0
    //   997: getstatic Perryc.c : I
    //   1000: iflt -> 1014
    //   1003: ldc2_w -2066409085
    //   1006: l2i
    //   1007: ldc_w -335921224
    //   1010: ixor
    //   1011: goto -> 1022
    //   1014: ldc2_w -1843935061
    //   1017: l2i
    //   1018: ldc_w 929771284
    //   1021: ixor
    //   1022: ldc2_w 241477761
    //   1025: l2i
    //   1026: ldc_w 1693510712
    //   1029: ixor
    //   1030: ixor
    //   1031: lookupswitch default -> 1056, 96166530 -> 1610, 417846499 -> 1014
    //   1056: aload_0
    //   1057: getstatic Perryc.1 : I
    //   1060: ifeq -> 1074
    //   1063: ldc2_w 1157713911
    //   1066: l2i
    //   1067: ldc_w -1200188647
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w -1358289597
    //   1077: l2i
    //   1078: ldc_w -1858486852
    //   1081: ixor
    //   1082: ldc2_w -1049738206
    //   1085: l2i
    //   1086: ldc_w -1332903639
    //   1089: ixor
    //   1090: ixor
    //   1091: lookupswitch default -> 1594, -1936451099 -> 1074, 1339055604 -> 1116
    //   1116: getfield max : Ljava/lang/Number;
    //   1119: getstatic Perryc.1 : I
    //   1122: ifeq -> 1136
    //   1125: ldc2_w -1309663744
    //   1128: l2i
    //   1129: ldc_w -909353936
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w -252852817
    //   1139: l2i
    //   1140: ldc_w -901050856
    //   1143: ixor
    //   1144: ldc2_w 2108514479
    //   1147: l2i
    //   1148: ldc_w 2026597401
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1576, 1069598465 -> 1180, 2103070342 -> 1136
    //   1180: invokevirtual intValue : ()I
    //   1183: getstatic Perryc.1 : I
    //   1186: ifeq -> 1200
    //   1189: ldc2_w 1409693242
    //   1192: l2i
    //   1193: ldc_w -1745105223
    //   1196: ixor
    //   1197: goto -> 1208
    //   1200: ldc2_w -1057978237
    //   1203: l2i
    //   1204: ldc_w 1724347955
    //   1207: ixor
    //   1208: ldc2_w -645123046
    //   1211: l2i
    //   1212: ldc_w -921329389
    //   1215: ixor
    //   1216: ixor
    //   1217: lookupswitch default -> 1244, -748393078 -> 1614, -173919826 -> 1200
    //   1244: aload_0
    //   1245: getstatic Perryc.1 : I
    //   1248: ifeq -> 1262
    //   1251: ldc2_w -20046878
    //   1254: l2i
    //   1255: ldc_w -295155176
    //   1258: ixor
    //   1259: goto -> 1270
    //   1262: ldc2_w -605690688
    //   1265: l2i
    //   1266: ldc_w 80408888
    //   1269: ixor
    //   1270: ldc2_w 1060176585
    //   1273: l2i
    //   1274: ldc_w -1972866287
    //   1277: ixor
    //   1278: ixor
    //   1279: lookupswitch default -> 1604, -1510006750 -> 1262, 1786143776 -> 1304
    //   1304: getfield min : Ljava/lang/Number;
    //   1307: getstatic Perryc.c : I
    //   1310: iflt -> 1324
    //   1313: ldc2_w 143478265
    //   1316: l2i
    //   1317: ldc_w -2107922714
    //   1320: ixor
    //   1321: goto -> 1332
    //   1324: ldc2_w -1705155159
    //   1327: l2i
    //   1328: ldc_w 1035604398
    //   1331: ixor
    //   1332: ldc2_w -909284530
    //   1335: l2i
    //   1336: ldc_w -2046347524
    //   1339: ixor
    //   1340: ixor
    //   1341: lookupswitch default -> 1368, -987973971 -> 1590, 1416596375 -> 1324
    //   1368: invokevirtual intValue : ()I
    //   1371: isub
    //   1372: getstatic Perryc.c : I
    //   1375: iflt -> 1389
    //   1378: ldc2_w -461042299
    //   1381: l2i
    //   1382: ldc_w 557535399
    //   1385: ixor
    //   1386: goto -> 1397
    //   1389: ldc2_w 956035476
    //   1392: l2i
    //   1393: ldc_w -26242831
    //   1396: ixor
    //   1397: ldc2_w 59736190
    //   1400: l2i
    //   1401: ldc_w -282789362
    //   1404: ixor
    //   1405: ixor
    //   1406: lookupswitch default -> 1432, 689252178 -> 1600, 1358046391 -> 1389
    //   1432: putfield difference : I
    //   1435: getstatic Perryc.1 : I
    //   1438: ifeq -> 1452
    //   1441: ldc2_w -231807665
    //   1444: l2i
    //   1445: ldc_w 356724923
    //   1448: ixor
    //   1449: goto -> 1460
    //   1452: ldc2_w 718877918
    //   1455: l2i
    //   1456: ldc_w -30114505
    //   1459: ixor
    //   1460: ldc2_w 233679156
    //   1463: l2i
    //   1464: ldc_w 812402092
    //   1467: ixor
    //   1468: ixor
    //   1469: lookupswitch default -> 1496, -622053012 -> 1572, 628807500 -> 1452
    //   1496: aload_0
    //   1497: ldc2_w 2136788718
    //   1500: l2i
    //   1501: ldc_w 2136788705
    //   1504: ixor
    //   1505: getstatic Perryc.0 : I
    //   1508: ifle -> 1522
    //   1511: ldc2_w -780577851
    //   1514: l2i
    //   1515: ldc_w 782689792
    //   1518: ixor
    //   1519: goto -> 1530
    //   1522: ldc2_w 1869241101
    //   1525: l2i
    //   1526: ldc_w 109342654
    //   1529: ixor
    //   1530: ldc2_w -983023540
    //   1533: l2i
    //   1534: ldc_w 1554080583
    //   1537: ixor
    //   1538: ixor
    //   1539: lookupswitch default -> 1564, -1969409398 -> 1522, 1712756430 -> 1582
    //   1564: putfield width : I
    //   1567: return
    //   1568: aconst_null
    //   1569: athrow
    //   1570: aconst_null
    //   1571: athrow
    //   1572: aconst_null
    //   1573: athrow
    //   1574: aconst_null
    //   1575: athrow
    //   1576: aconst_null
    //   1577: athrow
    //   1578: aconst_null
    //   1579: athrow
    //   1580: aconst_null
    //   1581: athrow
    //   1582: aconst_null
    //   1583: athrow
    //   1584: aconst_null
    //   1585: athrow
    //   1586: aconst_null
    //   1587: athrow
    //   1588: aconst_null
    //   1589: athrow
    //   1590: aconst_null
    //   1591: athrow
    //   1592: aconst_null
    //   1593: athrow
    //   1594: aconst_null
    //   1595: athrow
    //   1596: aconst_null
    //   1597: athrow
    //   1598: aconst_null
    //   1599: athrow
    //   1600: aconst_null
    //   1601: athrow
    //   1602: aconst_null
    //   1603: athrow
    //   1604: aconst_null
    //   1605: athrow
    //   1606: aconst_null
    //   1607: athrow
    //   1608: aconst_null
    //   1609: athrow
    //   1610: aconst_null
    //   1611: athrow
    //   1612: aconst_null
    //   1613: athrow
    //   1614: aconst_null
    //   1615: athrow
    //   1616: aconst_null
    //   1617: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1568	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/Slider;
    //   0	1568	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
  }
  
  public void dragSetting(int mouseX, int mouseY) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\buttons\Slider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */