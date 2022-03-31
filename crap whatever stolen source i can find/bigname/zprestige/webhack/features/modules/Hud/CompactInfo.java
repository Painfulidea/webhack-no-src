package bigname.zprestige.webhack.features.modules.Hud;

import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class CompactInfo extends Module {
  public int color1;
  
  public int color2;
  
  public Setting<Integer> compactX;
  
  public Setting<Integer> blue;
  
  public Setting<Integer> compactY;
  
  public Setting<Integer> green;
  
  public Setting<Boolean> rainbow;
  
  public Setting<Integer> red;
  
  public void onRender2D(Render2DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 10935
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 10927
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 10919
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 1004335410
    //   33: l2i
    //   34: ldc -1082985790
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1409424987
    //   43: l2i
    //   44: ldc 1417253740
    //   46: ixor
    //   47: ldc2_w 434064251
    //   50: l2i
    //   51: ldc 1305321103
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 10814, -792930812 -> 40, 1416190147 -> 80
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 832395702
    //   90: l2i
    //   91: ldc -82117813
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 609511542
    //   100: l2i
    //   101: ldc -128133995
    //   103: ixor
    //   104: ldc2_w 1091128957
    //   107: l2i
    //   108: ldc -1337940568
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 10642, 759256886 -> 140, 1003374888 -> 97
    //   140: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   143: getstatic Perryc.1 : I
    //   146: ifeq -> 159
    //   149: ldc2_w -1548792601
    //   152: l2i
    //   153: ldc 1754546109
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -216822973
    //   162: l2i
    //   163: ldc 254147363
    //   165: ixor
    //   166: ldc2_w -146310838
    //   169: l2i
    //   170: ldc -1426722878
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -1769347630 -> 10618, 1290387261 -> 159
    //   200: goto -> 204
    //   203: athrow
    //   204: invokevirtual getValue : ()Ljava/lang/Object;
    //   207: goto -> 211
    //   210: athrow
    //   211: checkcast java/lang/Boolean
    //   214: getstatic Perryc.c : I
    //   217: iflt -> 230
    //   220: ldc2_w -125348504
    //   223: l2i
    //   224: ldc 385708639
    //   226: ixor
    //   227: goto -> 237
    //   230: ldc2_w -435044735
    //   233: l2i
    //   234: ldc -1914618328
    //   236: ixor
    //   237: ldc2_w 78833577
    //   240: l2i
    //   241: ldc 780683176
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 10896, -1002404042 -> 230, 1103765672 -> 272
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual booleanValue : ()Z
    //   279: goto -> 283
    //   282: athrow
    //   283: ifeq -> 296
    //   286: ldc2_w -581076449
    //   289: l2i
    //   290: ldc 893395375
    //   292: ixor
    //   293: goto -> 303
    //   296: ldc2_w -1943416688
    //   299: l2i
    //   300: ldc 1681165089
    //   302: ixor
    //   303: ldc2_w 846387810
    //   306: l2i
    //   307: ldc -1223125970
    //   309: ixor
    //   310: ixor
    //   311: tableswitch default -> 286, 1836520956 -> 332, 1836520957 -> 5354
    //   332: getstatic Perryc.c : I
    //   335: iflt -> 348
    //   338: ldc2_w 1055572837
    //   341: l2i
    //   342: ldc 287229322
    //   344: ixor
    //   345: goto -> 355
    //   348: ldc2_w 1590625592
    //   351: l2i
    //   352: ldc 804912054
    //   354: ixor
    //   355: ldc2_w 315284606
    //   358: l2i
    //   359: ldc -2105301395
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 10766, -1078100740 -> 348, -511736675 -> 388
    //   388: aload_0
    //   389: getstatic Perryc.0 : I
    //   392: ifle -> 405
    //   395: ldc2_w -2037217592
    //   398: l2i
    //   399: ldc 1156680710
    //   401: ixor
    //   402: goto -> 412
    //   405: ldc2_w 1089982932
    //   408: l2i
    //   409: ldc -1364550409
    //   411: ixor
    //   412: ldc2_w 761675007
    //   415: l2i
    //   416: ldc 1923068775
    //   418: ixor
    //   419: ixor
    //   420: lookupswitch default -> 10778, -1650817706 -> 405, -1314602309 -> 448
    //   448: goto -> 452
    //   451: athrow
    //   452: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   455: goto -> 459
    //   458: athrow
    //   459: getstatic Perryc.0 : I
    //   462: ifle -> 475
    //   465: ldc2_w 274145222
    //   468: l2i
    //   469: ldc 746542525
    //   471: ixor
    //   472: goto -> 482
    //   475: ldc2_w 998086892
    //   478: l2i
    //   479: ldc -1439402419
    //   481: ixor
    //   482: ldc2_w 1069790327
    //   485: l2i
    //   486: ldc -1125669246
    //   488: ixor
    //   489: ixor
    //   490: lookupswitch default -> 10632, -1089709938 -> 475, 309197908 -> 516
    //   516: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   519: getstatic Perryc.c : I
    //   522: iflt -> 535
    //   525: ldc2_w 144199475
    //   528: l2i
    //   529: ldc -1302639915
    //   531: ixor
    //   532: goto -> 542
    //   535: ldc2_w 1685279997
    //   538: l2i
    //   539: ldc 99659101
    //   541: ixor
    //   542: ldc2_w 1789056972
    //   545: l2i
    //   546: ldc -196039626
    //   548: ixor
    //   549: ixor
    //   550: lookupswitch default -> 576, -836271989 -> 535, 607223324 -> 10882
    //   576: goto -> 580
    //   579: athrow
    //   580: invokevirtual getValue : ()Ljava/lang/Object;
    //   583: goto -> 587
    //   586: athrow
    //   587: checkcast java/lang/Integer
    //   590: getstatic Perryc.0 : I
    //   593: ifle -> 606
    //   596: ldc2_w 692073357
    //   599: l2i
    //   600: ldc 33250626
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w -1599977114
    //   609: l2i
    //   610: ldc -1226217319
    //   612: ixor
    //   613: ldc2_w 1851058386
    //   616: l2i
    //   617: ldc -279313282
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 648, -1447722397 -> 10810, -899605774 -> 606
    //   648: goto -> 652
    //   651: athrow
    //   652: invokevirtual intValue : ()I
    //   655: goto -> 659
    //   658: athrow
    //   659: getstatic Perryc.0 : I
    //   662: ifle -> 675
    //   665: ldc2_w -215351167
    //   668: l2i
    //   669: ldc 938351218
    //   671: ixor
    //   672: goto -> 682
    //   675: ldc2_w 122781054
    //   678: l2i
    //   679: ldc -1230406442
    //   681: ixor
    //   682: ldc2_w -1572945633
    //   685: l2i
    //   686: ldc 1314262344
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 10864, 682415780 -> 675, 1569771007 -> 716
    //   716: goto -> 720
    //   719: athrow
    //   720: invokestatic rainbow : (I)Ljava/awt/Color;
    //   723: goto -> 727
    //   726: athrow
    //   727: getstatic Perryc.c : I
    //   730: iflt -> 743
    //   733: ldc2_w 1700139476
    //   736: l2i
    //   737: ldc -931228389
    //   739: ixor
    //   740: goto -> 750
    //   743: ldc2_w -1647945024
    //   746: l2i
    //   747: ldc -174831553
    //   749: ixor
    //   750: ldc2_w -1337436078
    //   753: l2i
    //   754: ldc -2024393166
    //   756: ixor
    //   757: ixor
    //   758: lookupswitch default -> 784, -1707677009 -> 10738, -818901021 -> 743
    //   784: goto -> 788
    //   787: athrow
    //   788: invokevirtual getRGB : ()I
    //   791: goto -> 795
    //   794: athrow
    //   795: getstatic Perryc.0 : I
    //   798: ifle -> 811
    //   801: ldc2_w 1750235856
    //   804: l2i
    //   805: ldc -65297057
    //   807: ixor
    //   808: goto -> 818
    //   811: ldc2_w 2038793881
    //   814: l2i
    //   815: ldc 1336429120
    //   817: ixor
    //   818: ldc2_w 73232643
    //   821: l2i
    //   822: ldc 312431935
    //   824: ixor
    //   825: ixor
    //   826: lookupswitch default -> 852, -2104755277 -> 10688, -1704216399 -> 811
    //   852: putfield color1 : I
    //   855: getstatic Perryc.1 : I
    //   858: ifeq -> 871
    //   861: ldc2_w 94345480
    //   864: l2i
    //   865: ldc -1297150656
    //   867: ixor
    //   868: goto -> 878
    //   871: ldc2_w -1262215378
    //   874: l2i
    //   875: ldc 1664266247
    //   877: ixor
    //   878: ldc2_w 117669309
    //   881: l2i
    //   882: ldc -2060720259
    //   884: ixor
    //   885: ixor
    //   886: lookupswitch default -> 10812, 890769032 -> 871, 1440626153 -> 912
    //   912: aload_0
    //   913: ldc2_w 1136623794
    //   916: l2i
    //   917: ldc 1136623830
    //   919: ixor
    //   920: getstatic Perryc.c : I
    //   923: iflt -> 936
    //   926: ldc2_w -1969823590
    //   929: l2i
    //   930: ldc -1950148892
    //   932: ixor
    //   933: goto -> 943
    //   936: ldc2_w -980121194
    //   939: l2i
    //   940: ldc 201527292
    //   942: ixor
    //   943: ldc2_w 1547336131
    //   946: l2i
    //   947: ldc 1516289148
    //   949: ixor
    //   950: ixor
    //   951: lookupswitch default -> 10718, -808631339 -> 976, 118436801 -> 936
    //   976: goto -> 980
    //   979: athrow
    //   980: invokestatic rainbow : (I)Ljava/awt/Color;
    //   983: goto -> 987
    //   986: athrow
    //   987: getstatic Perryc.c : I
    //   990: iflt -> 1003
    //   993: ldc2_w -1210446166
    //   996: l2i
    //   997: ldc 459579626
    //   999: ixor
    //   1000: goto -> 1010
    //   1003: ldc2_w 977620150
    //   1006: l2i
    //   1007: ldc 948318429
    //   1009: ixor
    //   1010: ldc2_w -270955155
    //   1013: l2i
    //   1014: ldc 189615075
    //   1016: ixor
    //   1017: ixor
    //   1018: lookupswitch default -> 1044, 1210738894 -> 10776, 1931115307 -> 1003
    //   1044: goto -> 1048
    //   1047: athrow
    //   1048: invokevirtual getRGB : ()I
    //   1051: goto -> 1055
    //   1054: athrow
    //   1055: getstatic Perryc.0 : I
    //   1058: ifle -> 1071
    //   1061: ldc2_w 874484482
    //   1064: l2i
    //   1065: ldc 1781676748
    //   1067: ixor
    //   1068: goto -> 1079
    //   1071: ldc2_w -1313392728
    //   1074: l2i
    //   1075: ldc_w 691510118
    //   1078: ixor
    //   1079: ldc2_w -1617391768
    //   1082: l2i
    //   1083: ldc_w 349861705
    //   1086: ixor
    //   1087: ixor
    //   1088: lookupswitch default -> 1116, -1658206324 -> 1071, -714124817 -> 10608
    //   1116: putfield color2 : I
    //   1119: getstatic Perryc.c : I
    //   1122: iflt -> 1136
    //   1125: ldc2_w 1823509232
    //   1128: l2i
    //   1129: ldc_w -2140491547
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w -1109783358
    //   1139: l2i
    //   1140: ldc_w -344580130
    //   1143: ixor
    //   1144: ldc2_w 1657722170
    //   1147: l2i
    //   1148: ldc_w 289360890
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1180, -1624529707 -> 10740, 1974051276 -> 1136
    //   1180: aload_0
    //   1181: getstatic Perryc.0 : I
    //   1184: ifle -> 1198
    //   1187: ldc2_w -74390838
    //   1190: l2i
    //   1191: ldc_w -1326328593
    //   1194: ixor
    //   1195: goto -> 1206
    //   1198: ldc2_w 795486298
    //   1201: l2i
    //   1202: ldc_w -1233230999
    //   1205: ixor
    //   1206: ldc2_w 1931894492
    //   1209: l2i
    //   1210: ldc_w -806343840
    //   1213: ixor
    //   1214: ixor
    //   1215: lookupswitch default -> 1240, -138984551 -> 10682, 1365297120 -> 1198
    //   1240: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1243: getstatic Perryc.0 : I
    //   1246: ifle -> 1260
    //   1249: ldc2_w 1969946085
    //   1252: l2i
    //   1253: ldc_w 1598019421
    //   1256: ixor
    //   1257: goto -> 1268
    //   1260: ldc2_w -920297282
    //   1263: l2i
    //   1264: ldc_w 1153757696
    //   1267: ixor
    //   1268: ldc2_w 1744816021
    //   1271: l2i
    //   1272: ldc_w 635619010
    //   1275: ixor
    //   1276: ixor
    //   1277: lookupswitch default -> 10662, -805530647 -> 1304, 1749560303 -> 1260
    //   1304: goto -> 1308
    //   1307: athrow
    //   1308: invokevirtual getValue : ()Ljava/lang/Object;
    //   1311: goto -> 1315
    //   1314: athrow
    //   1315: checkcast java/lang/Integer
    //   1318: getstatic Perryc.0 : I
    //   1321: ifle -> 1335
    //   1324: ldc2_w -187744551
    //   1327: l2i
    //   1328: ldc_w 1245720078
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w 689867041
    //   1338: l2i
    //   1339: ldc_w 1531726742
    //   1342: ixor
    //   1343: ldc2_w 1350768060
    //   1346: l2i
    //   1347: ldc_w 226454057
    //   1350: ixor
    //   1351: ixor
    //   1352: lookupswitch default -> 10610, -478974142 -> 1335, 799980834 -> 1380
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokevirtual intValue : ()I
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: getstatic Perryc.0 : I
    //   1394: ifle -> 1408
    //   1397: ldc2_w 1656478920
    //   1400: l2i
    //   1401: ldc_w 634024540
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w 367339379
    //   1411: l2i
    //   1412: ldc_w -1787505006
    //   1415: ixor
    //   1416: ldc2_w -1487031446
    //   1419: l2i
    //   1420: ldc_w 1288959354
    //   1423: ixor
    //   1424: ixor
    //   1425: lookupswitch default -> 10902, -1392514940 -> 1408, 1797240817 -> 1452
    //   1452: aload_0
    //   1453: getstatic Perryc.1 : I
    //   1456: ifeq -> 1470
    //   1459: ldc2_w -1067030483
    //   1462: l2i
    //   1463: ldc_w -1561767422
    //   1466: ixor
    //   1467: goto -> 1478
    //   1470: ldc2_w -41346905
    //   1473: l2i
    //   1474: ldc_w -1644813100
    //   1477: ixor
    //   1478: ldc2_w -1437546207
    //   1481: l2i
    //   1482: ldc_w 1988557938
    //   1485: ixor
    //   1486: ixor
    //   1487: lookupswitch default -> 1512, -1101459588 -> 10784, 1552970485 -> 1470
    //   1512: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1515: getstatic Perryc.0 : I
    //   1518: ifle -> 1532
    //   1521: ldc2_w -17342727
    //   1524: l2i
    //   1525: ldc_w 1830167182
    //   1528: ixor
    //   1529: goto -> 1540
    //   1532: ldc2_w -448056687
    //   1535: l2i
    //   1536: ldc_w 1014966763
    //   1539: ixor
    //   1540: ldc2_w 2129242131
    //   1543: l2i
    //   1544: ldc_w -598881233
    //   1547: ixor
    //   1548: ixor
    //   1549: lookupswitch default -> 1576, -507410786 -> 1532, 826611787 -> 10614
    //   1576: goto -> 1580
    //   1579: athrow
    //   1580: invokevirtual getValue : ()Ljava/lang/Object;
    //   1583: goto -> 1587
    //   1586: athrow
    //   1587: checkcast java/lang/Integer
    //   1590: getstatic Perryc.1 : I
    //   1593: ifeq -> 1607
    //   1596: ldc2_w 146624583
    //   1599: l2i
    //   1600: ldc_w -2099565386
    //   1603: ixor
    //   1604: goto -> 1615
    //   1607: ldc2_w -1978473476
    //   1610: l2i
    //   1611: ldc_w -475252678
    //   1614: ixor
    //   1615: ldc2_w -1187196354
    //   1618: l2i
    //   1619: ldc_w 459760128
    //   1622: ixor
    //   1623: ixor
    //   1624: lookupswitch default -> 10628, -874157064 -> 1652, 675138767 -> 1607
    //   1652: goto -> 1656
    //   1655: athrow
    //   1656: invokevirtual intValue : ()I
    //   1659: goto -> 1663
    //   1662: athrow
    //   1663: ldc2_w -907175430
    //   1666: l2i
    //   1667: ldc_w -907175630
    //   1670: ixor
    //   1671: ldc2_w -1686538090
    //   1674: l2i
    //   1675: ldc_w -1686538087
    //   1678: ixor
    //   1679: ldc2_w -1365521034
    //   1682: l2i
    //   1683: ldc_w -1365521054
    //   1686: ixor
    //   1687: ldc2_w -35462660
    //   1690: l2i
    //   1691: ldc_w -35462680
    //   1694: ixor
    //   1695: ldc2_w 1391229272
    //   1698: l2i
    //   1699: ldc_w 1391229260
    //   1702: ixor
    //   1703: ldc2_w -1743496617
    //   1706: l2i
    //   1707: ldc_w -1743496545
    //   1710: ixor
    //   1711: getstatic Perryc.c : I
    //   1714: iflt -> 1728
    //   1717: ldc2_w -1142809490
    //   1720: l2i
    //   1721: ldc_w -388245071
    //   1724: ixor
    //   1725: goto -> 1736
    //   1728: ldc2_w -1836207501
    //   1731: l2i
    //   1732: ldc_w 151604111
    //   1735: ixor
    //   1736: ldc2_w -271272665
    //   1739: l2i
    //   1740: ldc_w 1871366426
    //   1743: ixor
    //   1744: ixor
    //   1745: lookupswitch default -> 1772, -748176926 -> 10726, 1546333884 -> 1728
    //   1772: goto -> 1776
    //   1775: athrow
    //   1776: invokestatic toRGBA : (IIII)I
    //   1779: goto -> 1783
    //   1782: athrow
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 90650332
    //   1792: l2i
    //   1793: ldc_w 1554735414
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -1876808653
    //   1803: l2i
    //   1804: ldc_w -819268794
    //   1807: ixor
    //   1808: ldc2_w -624664378
    //   1811: l2i
    //   1812: ldc_w -2084368887
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, 13318437 -> 10616, 438659243 -> 1800
    //   1844: goto -> 1848
    //   1847: athrow
    //   1848: invokestatic drawRectangleCorrectly : (IIIII)V
    //   1851: goto -> 1855
    //   1854: athrow
    //   1855: getstatic Perryc.c : I
    //   1858: iflt -> 1872
    //   1861: ldc2_w -259138331
    //   1864: l2i
    //   1865: ldc_w 1939037610
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w 1711381492
    //   1875: l2i
    //   1876: ldc_w 1535901364
    //   1879: ixor
    //   1880: ldc2_w 1253273993
    //   1883: l2i
    //   1884: ldc_w -168397099
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 10790, -2100338148 -> 1916, 1012631059 -> 1872
    //   1916: aload_0
    //   1917: getstatic Perryc.1 : I
    //   1920: ifeq -> 1934
    //   1923: ldc2_w 2029977911
    //   1926: l2i
    //   1927: ldc_w 238455531
    //   1930: ixor
    //   1931: goto -> 1942
    //   1934: ldc2_w -1519387066
    //   1937: l2i
    //   1938: ldc_w -1371122507
    //   1941: ixor
    //   1942: ldc2_w 1320142779
    //   1945: l2i
    //   1946: ldc_w 203510468
    //   1949: ixor
    //   1950: ixor
    //   1951: lookupswitch default -> 1976, 877076131 -> 10748, 1365245878 -> 1934
    //   1976: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1979: getstatic Perryc.1 : I
    //   1982: ifeq -> 1996
    //   1985: ldc2_w -56179666
    //   1988: l2i
    //   1989: ldc_w 560504439
    //   1992: ixor
    //   1993: goto -> 2004
    //   1996: ldc2_w -402710984
    //   1999: l2i
    //   2000: ldc_w 358911927
    //   2003: ixor
    //   2004: ldc2_w -2032301431
    //   2007: l2i
    //   2008: ldc_w 149356182
    //   2011: ixor
    //   2012: ixor
    //   2013: lookupswitch default -> 10686, 1408577094 -> 1996, 2090919312 -> 2040
    //   2040: goto -> 2044
    //   2043: athrow
    //   2044: invokevirtual getValue : ()Ljava/lang/Object;
    //   2047: goto -> 2051
    //   2050: athrow
    //   2051: checkcast java/lang/Integer
    //   2054: getstatic Perryc.1 : I
    //   2057: ifeq -> 2071
    //   2060: ldc2_w -1232850852
    //   2063: l2i
    //   2064: ldc_w 1485839128
    //   2067: ixor
    //   2068: goto -> 2079
    //   2071: ldc2_w -1114460087
    //   2074: l2i
    //   2075: ldc_w -1546332560
    //   2078: ixor
    //   2079: ldc2_w -967932683
    //   2082: l2i
    //   2083: ldc_w 889070319
    //   2086: ixor
    //   2087: ixor
    //   2088: lookupswitch default -> 10750, -319373277 -> 2116, 480546142 -> 2071
    //   2116: goto -> 2120
    //   2119: athrow
    //   2120: invokevirtual intValue : ()I
    //   2123: goto -> 2127
    //   2126: athrow
    //   2127: i2d
    //   2128: ldc2_w 8.403873003861901E307
    //   2131: invokestatic doubleToLongBits : (D)J
    //   2134: ldc2_w 9213779026533230617
    //   2137: lxor
    //   2138: invokestatic longBitsToDouble : (J)D
    //   2141: getstatic Perryc.0 : I
    //   2144: ifle -> 2158
    //   2147: ldc2_w 1969037936
    //   2150: l2i
    //   2151: ldc_w -489963636
    //   2154: ixor
    //   2155: goto -> 2166
    //   2158: ldc2_w -1505702140
    //   2161: l2i
    //   2162: ldc_w 431190961
    //   2165: ixor
    //   2166: ldc2_w -47615839
    //   2169: l2i
    //   2170: ldc_w -1599804890
    //   2173: ixor
    //   2174: ixor
    //   2175: lookupswitch default -> 2200, -904198277 -> 10680, -782176033 -> 2158
    //   2200: aload_0
    //   2201: getstatic Perryc.0 : I
    //   2204: ifle -> 2218
    //   2207: ldc2_w 848722537
    //   2210: l2i
    //   2211: ldc_w 959104875
    //   2214: ixor
    //   2215: goto -> 2226
    //   2218: ldc2_w 1521790680
    //   2221: l2i
    //   2222: ldc_w 1734914646
    //   2225: ixor
    //   2226: ldc2_w 2246449
    //   2229: l2i
    //   2230: ldc_w -785967843
    //   2233: ixor
    //   2234: ixor
    //   2235: lookupswitch default -> 10802, -625348818 -> 2218, -321302878 -> 2260
    //   2260: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2263: getstatic Perryc.c : I
    //   2266: iflt -> 2280
    //   2269: ldc2_w 358483412
    //   2272: l2i
    //   2273: ldc_w -1668708099
    //   2276: ixor
    //   2277: goto -> 2288
    //   2280: ldc2_w 293064693
    //   2283: l2i
    //   2284: ldc_w 53526665
    //   2287: ixor
    //   2288: ldc2_w -95579388
    //   2291: l2i
    //   2292: ldc_w -360559777
    //   2295: ixor
    //   2296: ixor
    //   2297: lookupswitch default -> 2324, -1726458510 -> 10908, 1114148641 -> 2280
    //   2324: goto -> 2328
    //   2327: athrow
    //   2328: invokevirtual getValue : ()Ljava/lang/Object;
    //   2331: goto -> 2335
    //   2334: athrow
    //   2335: checkcast java/lang/Integer
    //   2338: getstatic Perryc.0 : I
    //   2341: ifle -> 2355
    //   2344: ldc2_w 232695513
    //   2347: l2i
    //   2348: ldc_w -301145589
    //   2351: ixor
    //   2352: goto -> 2363
    //   2355: ldc2_w -2141071023
    //   2358: l2i
    //   2359: ldc_w -597464821
    //   2362: ixor
    //   2363: ldc2_w -1141208749
    //   2366: l2i
    //   2367: ldc_w -959564012
    //   2370: ixor
    //   2371: ixor
    //   2372: lookupswitch default -> 2400, -1629029739 -> 10856, 391684772 -> 2355
    //   2400: goto -> 2404
    //   2403: athrow
    //   2404: invokevirtual intValue : ()I
    //   2407: goto -> 2411
    //   2410: athrow
    //   2411: i2d
    //   2412: dadd
    //   2413: ldc2_w -125080447
    //   2416: l2i
    //   2417: ldc_w -125080503
    //   2420: ixor
    //   2421: getstatic Perryc.0 : I
    //   2424: ifle -> 2438
    //   2427: ldc2_w 193610850
    //   2430: l2i
    //   2431: ldc_w 1514424473
    //   2434: ixor
    //   2435: goto -> 2446
    //   2438: ldc2_w -1521163160
    //   2441: l2i
    //   2442: ldc_w -1974265582
    //   2445: ixor
    //   2446: ldc2_w 1527972946
    //   2449: l2i
    //   2450: ldc_w 1111778601
    //   2453: ixor
    //   2454: ixor
    //   2455: lookupswitch default -> 10744, 911252481 -> 2480, 1218014592 -> 2438
    //   2480: aload_0
    //   2481: getstatic Perryc.0 : I
    //   2484: ifle -> 2498
    //   2487: ldc2_w -888355212
    //   2490: l2i
    //   2491: ldc_w -709101804
    //   2494: ixor
    //   2495: goto -> 2506
    //   2498: ldc2_w 1071097762
    //   2501: l2i
    //   2502: ldc_w -403449853
    //   2505: ixor
    //   2506: ldc2_w -2071790633
    //   2509: l2i
    //   2510: ldc_w -67227354
    //   2513: ixor
    //   2514: ixor
    //   2515: lookupswitch default -> 2540, -1648439846 -> 2498, 1640758161 -> 10702
    //   2540: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2543: getstatic Perryc.c : I
    //   2546: iflt -> 2560
    //   2549: ldc2_w -453747680
    //   2552: l2i
    //   2553: ldc_w -1123227493
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w 1255539071
    //   2563: l2i
    //   2564: ldc_w 69188856
    //   2567: ixor
    //   2568: ldc2_w -136156009
    //   2571: l2i
    //   2572: ldc_w 1248385202
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 10884, -462290786 -> 2560, -213710430 -> 2604
    //   2604: goto -> 2608
    //   2607: athrow
    //   2608: invokevirtual getValue : ()Ljava/lang/Object;
    //   2611: goto -> 2615
    //   2614: athrow
    //   2615: checkcast java/lang/Integer
    //   2618: getstatic Perryc.0 : I
    //   2621: ifle -> 2635
    //   2624: ldc2_w -1018294709
    //   2627: l2i
    //   2628: ldc_w -147296909
    //   2631: ixor
    //   2632: goto -> 2643
    //   2635: ldc2_w -605703839
    //   2638: l2i
    //   2639: ldc_w -1371417276
    //   2642: ixor
    //   2643: ldc2_w -586588445
    //   2646: l2i
    //   2647: ldc_w 1012660058
    //   2650: ixor
    //   2651: ixor
    //   2652: lookupswitch default -> 10724, -1795764836 -> 2680, -719009151 -> 2635
    //   2680: goto -> 2684
    //   2683: athrow
    //   2684: invokevirtual intValue : ()I
    //   2687: goto -> 2691
    //   2690: athrow
    //   2691: iadd
    //   2692: i2d
    //   2693: ldc2_w 7.228404738934817
    //   2696: invokestatic doubleToLongBits : (D)J
    //   2699: ldc2_w 9215747898381166564
    //   2702: lxor
    //   2703: invokestatic longBitsToDouble : (J)D
    //   2706: getstatic Perryc.c : I
    //   2709: iflt -> 2723
    //   2712: ldc2_w 133028926
    //   2715: l2i
    //   2716: ldc_w -668649959
    //   2719: ixor
    //   2720: goto -> 2731
    //   2723: ldc2_w -1956113937
    //   2726: l2i
    //   2727: ldc_w 422404669
    //   2730: ixor
    //   2731: ldc2_w -1100521580
    //   2734: l2i
    //   2735: ldc_w -482703857
    //   2738: ixor
    //   2739: ixor
    //   2740: lookupswitch default -> 10752, -2104151108 -> 2723, -820467127 -> 2768
    //   2768: aload_0
    //   2769: getstatic Perryc.1 : I
    //   2772: ifeq -> 2786
    //   2775: ldc2_w -675988725
    //   2778: l2i
    //   2779: ldc_w -2124904131
    //   2782: ixor
    //   2783: goto -> 2794
    //   2786: ldc2_w -1261698488
    //   2789: l2i
    //   2790: ldc_w -62487925
    //   2793: ixor
    //   2794: ldc2_w 1303300487
    //   2797: l2i
    //   2798: ldc_w 1322841039
    //   2801: ixor
    //   2802: ixor
    //   2803: lookupswitch default -> 2828, -722086036 -> 2786, 1436256382 -> 10666
    //   2828: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2831: getstatic Perryc.0 : I
    //   2834: ifle -> 2848
    //   2837: ldc2_w 862744174
    //   2840: l2i
    //   2841: ldc_w 916305082
    //   2844: ixor
    //   2845: goto -> 2856
    //   2848: ldc2_w 549075461
    //   2851: l2i
    //   2852: ldc_w -1140944446
    //   2855: ixor
    //   2856: ldc2_w -511348285
    //   2859: l2i
    //   2860: ldc_w -783665200
    //   2863: ixor
    //   2864: ixor
    //   2865: lookupswitch default -> 2892, 875596952 -> 2848, 893295815 -> 10712
    //   2892: goto -> 2896
    //   2895: athrow
    //   2896: invokevirtual getValue : ()Ljava/lang/Object;
    //   2899: goto -> 2903
    //   2902: athrow
    //   2903: checkcast java/lang/Integer
    //   2906: getstatic Perryc.c : I
    //   2909: iflt -> 2923
    //   2912: ldc2_w -1518170656
    //   2915: l2i
    //   2916: ldc_w -1920859154
    //   2919: ixor
    //   2920: goto -> 2931
    //   2923: ldc2_w 1234840981
    //   2926: l2i
    //   2927: ldc_w 438395118
    //   2930: ixor
    //   2931: ldc2_w -2022354995
    //   2934: l2i
    //   2935: ldc_w 1389380518
    //   2938: ixor
    //   2939: ixor
    //   2940: lookupswitch default -> 10734, -2044837616 -> 2968, -39484827 -> 2923
    //   2968: goto -> 2972
    //   2971: athrow
    //   2972: invokevirtual intValue : ()I
    //   2975: goto -> 2979
    //   2978: athrow
    //   2979: i2d
    //   2980: dadd
    //   2981: getstatic Perryc.c : I
    //   2984: iflt -> 2998
    //   2987: ldc2_w 1737448665
    //   2990: l2i
    //   2991: ldc_w -1733580952
    //   2994: ixor
    //   2995: goto -> 3006
    //   2998: ldc2_w 657931661
    //   3001: l2i
    //   3002: ldc_w -1825938036
    //   3005: ixor
    //   3006: ldc2_w 90715766
    //   3009: l2i
    //   3010: ldc_w 1318041916
    //   3013: ixor
    //   3014: ixor
    //   3015: lookupswitch default -> 10670, -1262258949 -> 2998, -338101 -> 3040
    //   3040: aload_0
    //   3041: getstatic Perryc.0 : I
    //   3044: ifle -> 3058
    //   3047: ldc2_w 1937755639
    //   3050: l2i
    //   3051: ldc_w -207511003
    //   3054: ixor
    //   3055: goto -> 3066
    //   3058: ldc2_w 305159725
    //   3061: l2i
    //   3062: ldc_w 693672651
    //   3065: ixor
    //   3066: ldc2_w 343761112
    //   3069: l2i
    //   3070: ldc_w 945189977
    //   3073: ixor
    //   3074: ixor
    //   3075: lookupswitch default -> 3100, -1393198253 -> 10626, 277007018 -> 3058
    //   3100: getfield color1 : I
    //   3103: getstatic Perryc.1 : I
    //   3106: ifeq -> 3120
    //   3109: ldc2_w 234359793
    //   3112: l2i
    //   3113: ldc_w -918338939
    //   3116: ixor
    //   3117: goto -> 3128
    //   3120: ldc2_w 849651957
    //   3123: l2i
    //   3124: ldc_w 487180456
    //   3127: ixor
    //   3128: ldc2_w 964095703
    //   3131: l2i
    //   3132: ldc_w -838878664
    //   3135: ixor
    //   3136: ixor
    //   3137: lookupswitch default -> 3164, 808590747 -> 10904, 816992195 -> 3120
    //   3164: aload_0
    //   3165: getstatic Perryc.0 : I
    //   3168: ifle -> 3182
    //   3171: ldc2_w 2066071
    //   3174: l2i
    //   3175: ldc_w -1220655404
    //   3178: ixor
    //   3179: goto -> 3190
    //   3182: ldc2_w -935124880
    //   3185: l2i
    //   3186: ldc_w 1716773166
    //   3189: ixor
    //   3190: ldc2_w 888337049
    //   3193: l2i
    //   3194: ldc_w 451489275
    //   3197: ixor
    //   3198: ixor
    //   3199: lookupswitch default -> 10742, -2146755012 -> 3224, -1724244191 -> 3182
    //   3224: getfield color2 : I
    //   3227: getstatic Perryc.c : I
    //   3230: iflt -> 3244
    //   3233: ldc2_w -2101260168
    //   3236: l2i
    //   3237: ldc_w 1771815840
    //   3240: ixor
    //   3241: goto -> 3252
    //   3244: ldc2_w 1227209567
    //   3247: l2i
    //   3248: ldc_w 1533454454
    //   3251: ixor
    //   3252: ldc2_w -1399008343
    //   3255: l2i
    //   3256: ldc_w 556596512
    //   3259: ixor
    //   3260: ixor
    //   3261: lookupswitch default -> 10730, -1611448928 -> 3288, 1726659921 -> 3244
    //   3288: goto -> 3292
    //   3291: athrow
    //   3292: invokestatic drawGradientSideways : (DDDDII)V
    //   3295: goto -> 3299
    //   3298: athrow
    //   3299: getstatic Perryc.0 : I
    //   3302: ifle -> 3316
    //   3305: ldc2_w 1357610301
    //   3308: l2i
    //   3309: ldc_w 463775594
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w 798662558
    //   3319: l2i
    //   3320: ldc_w 1933492487
    //   3323: ixor
    //   3324: ldc2_w -1900671447
    //   3327: l2i
    //   3328: ldc_w -1089043327
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, -1816613118 -> 3316, 2062504191 -> 10876
    //   3360: aload_0
    //   3361: getstatic Perryc.1 : I
    //   3364: ifeq -> 3378
    //   3367: ldc2_w 1532236285
    //   3370: l2i
    //   3371: ldc_w 800230622
    //   3374: ixor
    //   3375: goto -> 3386
    //   3378: ldc2_w -1730442684
    //   3381: l2i
    //   3382: ldc_w 1970671923
    //   3385: ixor
    //   3386: ldc2_w -1024542143
    //   3389: l2i
    //   3390: ldc_w -1659709418
    //   3393: ixor
    //   3394: ixor
    //   3395: lookupswitch default -> 3420, -257779923 -> 3378, 723189620 -> 10756
    //   3420: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   3423: new java/lang/StringBuilder
    //   3426: dup
    //   3427: getstatic Perryc.c : I
    //   3430: iflt -> 3444
    //   3433: ldc2_w 1345603010
    //   3436: l2i
    //   3437: ldc_w -1555441450
    //   3440: ixor
    //   3441: goto -> 3452
    //   3444: ldc2_w -594492386
    //   3447: l2i
    //   3448: ldc_w 390814415
    //   3451: ixor
    //   3452: ldc2_w -1582237510
    //   3455: l2i
    //   3456: ldc_w 53499438
    //   3459: ixor
    //   3460: ixor
    //   3461: lookupswitch default -> 10848, 1375548288 -> 3444, 1767583813 -> 3488
    //   3488: goto -> 3492
    //   3491: athrow
    //   3492: invokespecial <init> : ()V
    //   3495: goto -> 3499
    //   3498: athrow
    //   3499: ldc_w '葦㌖萡把颠櫮๲捻턦쐑㳒੧模⸴'
    //   3502: getstatic Perryc.1 : I
    //   3505: ifeq -> 3519
    //   3508: ldc2_w -1587979809
    //   3511: l2i
    //   3512: ldc_w -902418804
    //   3515: ixor
    //   3516: goto -> 3527
    //   3519: ldc2_w 979840010
    //   3522: l2i
    //   3523: ldc_w 2089257871
    //   3526: ixor
    //   3527: ldc2_w 418746343
    //   3530: l2i
    //   3531: ldc_w -1895797698
    //   3534: ixor
    //   3535: ixor
    //   3536: lookupswitch default -> 10622, -787135396 -> 3564, -56978294 -> 3519
    //   3564: goto -> 3568
    //   3567: athrow
    //   3568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3571: goto -> 3575
    //   3574: athrow
    //   3575: getstatic Perryc.c : I
    //   3578: iflt -> 3592
    //   3581: ldc2_w -534980856
    //   3584: l2i
    //   3585: ldc_w -292390903
    //   3588: ixor
    //   3589: goto -> 3600
    //   3592: ldc2_w -598496166
    //   3595: l2i
    //   3596: ldc_w 1442659047
    //   3599: ixor
    //   3600: ldc2_w 663442586
    //   3603: l2i
    //   3604: ldc_w 1108792264
    //   3607: ixor
    //   3608: ixor
    //   3609: lookupswitch default -> 3636, -736016870 -> 3592, 1796417619 -> 10866
    //   3636: goto -> 3640
    //   3639: athrow
    //   3640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3643: goto -> 3647
    //   3646: athrow
    //   3647: getstatic Perryc.0 : I
    //   3650: ifle -> 3664
    //   3653: ldc2_w 494972192
    //   3656: l2i
    //   3657: ldc_w 289582644
    //   3660: ixor
    //   3661: goto -> 3672
    //   3664: ldc2_w 1313018601
    //   3667: l2i
    //   3668: ldc_w 1063261197
    //   3671: ixor
    //   3672: ldc2_w 811146539
    //   3675: l2i
    //   3676: ldc_w 762525375
    //   3679: ixor
    //   3680: ixor
    //   3681: lookupswitch default -> 3708, 300427392 -> 10720, 2017542923 -> 3664
    //   3708: goto -> 3712
    //   3711: athrow
    //   3712: invokestatic getPingSatus : ()Ljava/lang/String;
    //   3715: goto -> 3719
    //   3718: athrow
    //   3719: getstatic Perryc.c : I
    //   3722: iflt -> 3736
    //   3725: ldc2_w -982843428
    //   3728: l2i
    //   3729: ldc_w 1955186956
    //   3732: ixor
    //   3733: goto -> 3744
    //   3736: ldc2_w -1454777855
    //   3739: l2i
    //   3740: ldc_w 1535630467
    //   3743: ixor
    //   3744: ldc2_w -2011660709
    //   3747: l2i
    //   3748: ldc_w -1161496971
    //   3751: ixor
    //   3752: ixor
    //   3753: lookupswitch default -> 10668, -2092974338 -> 3736, -1072525652 -> 3780
    //   3780: goto -> 3784
    //   3783: athrow
    //   3784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3787: goto -> 3791
    //   3790: athrow
    //   3791: ldc_w '葜㌀董䄒飡'
    //   3794: getstatic Perryc.0 : I
    //   3797: ifle -> 3811
    //   3800: ldc2_w -44647061
    //   3803: l2i
    //   3804: ldc_w -840083218
    //   3807: ixor
    //   3808: goto -> 3819
    //   3811: ldc2_w -181420487
    //   3814: l2i
    //   3815: ldc_w 1912787151
    //   3818: ixor
    //   3819: ldc2_w 518732152
    //   3822: l2i
    //   3823: ldc_w 450236974
    //   3826: ixor
    //   3827: ixor
    //   3828: lookupswitch default -> 3856, -990004988 -> 3811, 881250003 -> 10878
    //   3856: goto -> 3860
    //   3859: athrow
    //   3860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3863: goto -> 3867
    //   3866: athrow
    //   3867: getstatic Perryc.c : I
    //   3870: iflt -> 3884
    //   3873: ldc2_w -1943642772
    //   3876: l2i
    //   3877: ldc_w -1200142784
    //   3880: ixor
    //   3881: goto -> 3892
    //   3884: ldc2_w -1956267858
    //   3887: l2i
    //   3888: ldc_w 1230868800
    //   3891: ixor
    //   3892: ldc2_w -533613279
    //   3895: l2i
    //   3896: ldc_w 2018892065
    //   3899: ixor
    //   3900: ixor
    //   3901: lookupswitch default -> 3928, -1405782228 -> 10858, -1080589446 -> 3884
    //   3928: goto -> 3932
    //   3931: athrow
    //   3932: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3935: goto -> 3939
    //   3938: athrow
    //   3939: getstatic Perryc.0 : I
    //   3942: ifle -> 3956
    //   3945: ldc2_w -1869264659
    //   3948: l2i
    //   3949: ldc_w 2109047574
    //   3952: ixor
    //   3953: goto -> 3964
    //   3956: ldc2_w 1869747331
    //   3959: l2i
    //   3960: ldc_w 495801153
    //   3963: ixor
    //   3964: ldc2_w 53057754
    //   3967: l2i
    //   3968: ldc_w 1116621237
    //   3971: ixor
    //   3972: ixor
    //   3973: lookupswitch default -> 10844, -1400431980 -> 3956, 861443757 -> 4000
    //   4000: goto -> 4004
    //   4003: athrow
    //   4004: invokestatic getFpsStatus : ()Ljava/lang/String;
    //   4007: goto -> 4011
    //   4010: athrow
    //   4011: getstatic Perryc.0 : I
    //   4014: ifle -> 4028
    //   4017: ldc2_w 201566826
    //   4020: l2i
    //   4021: ldc_w 1071050288
    //   4024: ixor
    //   4025: goto -> 4036
    //   4028: ldc2_w 1184708707
    //   4031: l2i
    //   4032: ldc_w -382088596
    //   4035: ixor
    //   4036: ldc2_w -633388686
    //   4039: l2i
    //   4040: ldc_w -1069083155
    //   4043: ixor
    //   4044: ixor
    //   4045: lookupswitch default -> 4072, -1871390788 -> 4028, 699207877 -> 10832
    //   4072: goto -> 4076
    //   4075: athrow
    //   4076: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4079: goto -> 4083
    //   4082: athrow
    //   4083: ldc_w '著㌃萰拢묑檭'
    //   4086: getstatic Perryc.1 : I
    //   4089: ifeq -> 4103
    //   4092: ldc2_w -1995835899
    //   4095: l2i
    //   4096: ldc_w 1098565284
    //   4099: ixor
    //   4100: goto -> 4111
    //   4103: ldc2_w 138432825
    //   4106: l2i
    //   4107: ldc_w 1032723663
    //   4110: ixor
    //   4111: ldc2_w -1657989443
    //   4114: l2i
    //   4115: ldc_w 863894317
    //   4118: ixor
    //   4119: ixor
    //   4120: lookupswitch default -> 4148, 1457841508 -> 4103, 1713626417 -> 10894
    //   4148: goto -> 4152
    //   4151: athrow
    //   4152: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4155: goto -> 4159
    //   4158: athrow
    //   4159: getstatic Perryc.1 : I
    //   4162: ifeq -> 4176
    //   4165: ldc2_w -1067800734
    //   4168: l2i
    //   4169: ldc_w -723409808
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w 1649989263
    //   4179: l2i
    //   4180: ldc_w 815602257
    //   4183: ixor
    //   4184: ldc2_w -318285776
    //   4187: l2i
    //   4188: ldc_w 1396983303
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4220, -1426580187 -> 10698, 1286122474 -> 4176
    //   4220: goto -> 4224
    //   4223: athrow
    //   4224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4227: goto -> 4231
    //   4230: athrow
    //   4231: getstatic Perryc.c : I
    //   4234: iflt -> 4248
    //   4237: ldc2_w 1465963416
    //   4240: l2i
    //   4241: ldc_w -908383625
    //   4244: ixor
    //   4245: goto -> 4256
    //   4248: ldc2_w -553934484
    //   4251: l2i
    //   4252: ldc_w 1774336235
    //   4255: ixor
    //   4256: ldc2_w -2111234780
    //   4259: l2i
    //   4260: ldc_w 530038457
    //   4263: ixor
    //   4264: ixor
    //   4265: lookupswitch default -> 10762, 50682482 -> 4248, 713505306 -> 4292
    //   4292: goto -> 4296
    //   4295: athrow
    //   4296: invokestatic getTpsStatus : ()Ljava/lang/String;
    //   4299: goto -> 4303
    //   4302: athrow
    //   4303: getstatic Perryc.1 : I
    //   4306: ifeq -> 4320
    //   4309: ldc2_w 176003034
    //   4312: l2i
    //   4313: ldc_w -767466584
    //   4316: ixor
    //   4317: goto -> 4328
    //   4320: ldc2_w 2073189740
    //   4323: l2i
    //   4324: ldc_w -1678776637
    //   4327: ixor
    //   4328: ldc2_w -1899545919
    //   4331: l2i
    //   4332: ldc_w 54841125
    //   4335: ixor
    //   4336: ixor
    //   4337: lookupswitch default -> 4364, 1438581142 -> 10672, 1484004849 -> 4320
    //   4364: goto -> 4368
    //   4367: athrow
    //   4368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4371: goto -> 4375
    //   4374: athrow
    //   4375: ldc_w '葅㌃萰'
    //   4378: getstatic Perryc.c : I
    //   4381: iflt -> 4395
    //   4384: ldc2_w -1796250649
    //   4387: l2i
    //   4388: ldc_w -2004693294
    //   4391: ixor
    //   4392: goto -> 4403
    //   4395: ldc2_w 1780766645
    //   4398: l2i
    //   4399: ldc_w -291958776
    //   4402: ixor
    //   4403: ldc2_w 876109864
    //   4406: l2i
    //   4407: ldc_w -1759944685
    //   4410: ixor
    //   4411: ixor
    //   4412: lookupswitch default -> 4440, -1546599501 -> 4395, -1085494002 -> 10796
    //   4440: goto -> 4444
    //   4443: athrow
    //   4444: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4447: goto -> 4451
    //   4450: athrow
    //   4451: getstatic Perryc.c : I
    //   4454: iflt -> 4468
    //   4457: ldc2_w 62022705
    //   4460: l2i
    //   4461: ldc_w 36117603
    //   4464: ixor
    //   4465: goto -> 4476
    //   4468: ldc2_w -2113976968
    //   4471: l2i
    //   4472: ldc_w -721149371
    //   4475: ixor
    //   4476: ldc2_w 2070284669
    //   4479: l2i
    //   4480: ldc_w -1269730892
    //   4483: ixor
    //   4484: ixor
    //   4485: lookupswitch default -> 10636, -1681121292 -> 4512, -828243813 -> 4468
    //   4512: goto -> 4516
    //   4515: athrow
    //   4516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4519: goto -> 4523
    //   4522: athrow
    //   4523: getstatic Perryc.0 : I
    //   4526: ifle -> 4540
    //   4529: ldc2_w -1257894705
    //   4532: l2i
    //   4533: ldc_w -2127294352
    //   4536: ixor
    //   4537: goto -> 4548
    //   4540: ldc2_w 975015729
    //   4543: l2i
    //   4544: ldc_w 1191826619
    //   4547: ixor
    //   4548: ldc2_w -597207803
    //   4551: l2i
    //   4552: ldc_w 1010317250
    //   4555: ixor
    //   4556: ixor
    //   4557: lookupswitch default -> 4584, -731021704 -> 10820, 866923698 -> 4540
    //   4584: goto -> 4588
    //   4587: athrow
    //   4588: invokevirtual toString : ()Ljava/lang/String;
    //   4591: goto -> 4595
    //   4594: athrow
    //   4595: getstatic Perryc.1 : I
    //   4598: ifeq -> 4612
    //   4601: ldc2_w 714315101
    //   4604: l2i
    //   4605: ldc_w 1232598987
    //   4608: ixor
    //   4609: goto -> 4620
    //   4612: ldc2_w 636638126
    //   4615: l2i
    //   4616: ldc_w -1631034690
    //   4619: ixor
    //   4620: ldc2_w 228295249
    //   4623: l2i
    //   4624: ldc_w -1574845269
    //   4627: ixor
    //   4628: ixor
    //   4629: lookupswitch default -> 10860, -866245524 -> 4612, 343963626 -> 4656
    //   4656: aload_0
    //   4657: getstatic Perryc.1 : I
    //   4660: ifeq -> 4674
    //   4663: ldc2_w 717813900
    //   4666: l2i
    //   4667: ldc_w -23559966
    //   4670: ixor
    //   4671: goto -> 4682
    //   4674: ldc2_w 527256589
    //   4677: l2i
    //   4678: ldc_w 2030288359
    //   4681: ixor
    //   4682: ldc2_w -218069588
    //   4685: l2i
    //   4686: ldc_w -1158630275
    //   4689: ixor
    //   4690: ixor
    //   4691: lookupswitch default -> 4716, -1650439745 -> 10888, 1981036808 -> 4674
    //   4716: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4719: getstatic Perryc.c : I
    //   4722: iflt -> 4736
    //   4725: ldc2_w 809901320
    //   4728: l2i
    //   4729: ldc_w -1153599547
    //   4732: ixor
    //   4733: goto -> 4744
    //   4736: ldc2_w -539856175
    //   4739: l2i
    //   4740: ldc_w 315410437
    //   4743: ixor
    //   4744: ldc2_w -49974527
    //   4747: l2i
    //   4748: ldc_w -774041137
    //   4751: ixor
    //   4752: ixor
    //   4753: lookupswitch default -> 10870, -1482487805 -> 4736, -507062246 -> 4780
    //   4780: goto -> 4784
    //   4783: athrow
    //   4784: invokevirtual getValue : ()Ljava/lang/Object;
    //   4787: goto -> 4791
    //   4790: athrow
    //   4791: checkcast java/lang/Integer
    //   4794: getstatic Perryc.1 : I
    //   4797: ifeq -> 4811
    //   4800: ldc2_w 1070584323
    //   4803: l2i
    //   4804: ldc_w -2041977216
    //   4807: ixor
    //   4808: goto -> 4819
    //   4811: ldc2_w -1800432451
    //   4814: l2i
    //   4815: ldc_w -733795653
    //   4818: ixor
    //   4819: ldc2_w 648883999
    //   4822: l2i
    //   4823: ldc_w -2054816474
    //   4826: ixor
    //   4827: ixor
    //   4828: lookupswitch default -> 10700, -473666497 -> 4856, 447669946 -> 4811
    //   4856: goto -> 4860
    //   4859: athrow
    //   4860: invokevirtual intValue : ()I
    //   4863: goto -> 4867
    //   4866: athrow
    //   4867: i2f
    //   4868: getstatic Perryc.1 : I
    //   4871: ifeq -> 4885
    //   4874: ldc2_w 1733448191
    //   4877: l2i
    //   4878: ldc_w -705189442
    //   4881: ixor
    //   4882: goto -> 4893
    //   4885: ldc2_w -1591272762
    //   4888: l2i
    //   4889: ldc_w -170379681
    //   4892: ixor
    //   4893: ldc2_w 1495599397
    //   4896: l2i
    //   4897: ldc_w -66209937
    //   4900: ixor
    //   4901: ixor
    //   4902: lookupswitch default -> 10806, -237530413 -> 4928, 395134475 -> 4885
    //   4928: aload_0
    //   4929: getstatic Perryc.1 : I
    //   4932: ifeq -> 4946
    //   4935: ldc2_w 1158255870
    //   4938: l2i
    //   4939: ldc_w 1570972690
    //   4942: ixor
    //   4943: goto -> 4954
    //   4946: ldc2_w 785889949
    //   4949: l2i
    //   4950: ldc_w -127218123
    //   4953: ixor
    //   4954: ldc2_w 822267243
    //   4957: l2i
    //   4958: ldc_w -141439174
    //   4961: ixor
    //   4962: ixor
    //   4963: lookupswitch default -> 4988, -1143313309 -> 4946, -566644035 -> 10850
    //   4988: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4991: getstatic Perryc.1 : I
    //   4994: ifeq -> 5008
    //   4997: ldc2_w -1989721415
    //   5000: l2i
    //   5001: ldc_w -1558032755
    //   5004: ixor
    //   5005: goto -> 5016
    //   5008: ldc2_w 604683213
    //   5011: l2i
    //   5012: ldc_w 1381612996
    //   5015: ixor
    //   5016: ldc2_w 1640259299
    //   5019: l2i
    //   5020: ldc_w -1490962913
    //   5023: ixor
    //   5024: ixor
    //   5025: lookupswitch default -> 10728, -1330188555 -> 5052, -324999992 -> 5008
    //   5052: goto -> 5056
    //   5055: athrow
    //   5056: invokevirtual getValue : ()Ljava/lang/Object;
    //   5059: goto -> 5063
    //   5062: athrow
    //   5063: checkcast java/lang/Integer
    //   5066: getstatic Perryc.1 : I
    //   5069: ifeq -> 5083
    //   5072: ldc2_w -705070829
    //   5075: l2i
    //   5076: ldc_w 1649727101
    //   5079: ixor
    //   5080: goto -> 5091
    //   5083: ldc2_w 610398160
    //   5086: l2i
    //   5087: ldc_w 1718490145
    //   5090: ixor
    //   5091: ldc2_w -715255294
    //   5094: l2i
    //   5095: ldc_w 375235422
    //   5098: ixor
    //   5099: ixor
    //   5100: lookupswitch default -> 5128, -639057453 -> 5083, 1957568050 -> 10704
    //   5128: goto -> 5132
    //   5131: athrow
    //   5132: invokevirtual intValue : ()I
    //   5135: goto -> 5139
    //   5138: athrow
    //   5139: ldc2_w 203855674
    //   5142: l2i
    //   5143: ldc_w 203855673
    //   5146: ixor
    //   5147: iadd
    //   5148: i2f
    //   5149: getstatic Perryc.0 : I
    //   5152: ifle -> 5166
    //   5155: ldc2_w -111068909
    //   5158: l2i
    //   5159: ldc_w 1528301842
    //   5162: ixor
    //   5163: goto -> 5174
    //   5166: ldc2_w -2098266074
    //   5169: l2i
    //   5170: ldc_w -1873796707
    //   5173: ixor
    //   5174: ldc2_w -355931783
    //   5177: l2i
    //   5178: ldc_w -1261216224
    //   5181: ixor
    //   5182: ixor
    //   5183: lookupswitch default -> 5208, -83017923 -> 5166, -60651688 -> 10788
    //   5208: aload_0
    //   5209: getstatic Perryc.1 : I
    //   5212: ifeq -> 5226
    //   5215: ldc2_w 1416036885
    //   5218: l2i
    //   5219: ldc_w 177037243
    //   5222: ixor
    //   5223: goto -> 5234
    //   5226: ldc2_w 579269519
    //   5229: l2i
    //   5230: ldc_w 1804317796
    //   5233: ixor
    //   5234: ldc2_w 866366923
    //   5237: l2i
    //   5238: ldc_w -353981892
    //   5241: ixor
    //   5242: ixor
    //   5243: lookupswitch default -> 10838, -2018557351 -> 5226, -1874307044 -> 5268
    //   5268: getfield color1 : I
    //   5271: ldc2_w -956730818
    //   5274: l2i
    //   5275: ldc_w -956730817
    //   5278: ixor
    //   5279: getstatic Perryc.1 : I
    //   5282: ifeq -> 5296
    //   5285: ldc2_w -1057280089
    //   5288: l2i
    //   5289: ldc_w -1450748580
    //   5292: ixor
    //   5293: goto -> 5304
    //   5296: ldc2_w 1482502838
    //   5299: l2i
    //   5300: ldc_w 2032768932
    //   5303: ixor
    //   5304: ldc2_w -392169743
    //   5307: l2i
    //   5308: ldc_w 975290743
    //   5311: ixor
    //   5312: ixor
    //   5313: lookupswitch default -> 5340, -1144894083 -> 10794, 425791757 -> 5296
    //   5340: goto -> 5344
    //   5343: athrow
    //   5344: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   5347: goto -> 5351
    //   5350: athrow
    //   5351: goto -> 10607
    //   5354: getstatic Perryc.0 : I
    //   5357: ifle -> 5371
    //   5360: ldc2_w 1899957344
    //   5363: l2i
    //   5364: ldc_w -1173906819
    //   5367: ixor
    //   5368: goto -> 5379
    //   5371: ldc2_w 1197810504
    //   5374: l2i
    //   5375: ldc_w 1431573243
    //   5378: ixor
    //   5379: ldc2_w -263164382
    //   5382: l2i
    //   5383: ldc_w -1686794356
    //   5386: ixor
    //   5387: ixor
    //   5388: lookupswitch default -> 5416, -1608681549 -> 10768, -1552492670 -> 5371
    //   5416: aload_0
    //   5417: getstatic Perryc.c : I
    //   5420: iflt -> 5434
    //   5423: ldc2_w 593809875
    //   5426: l2i
    //   5427: ldc_w -1093911873
    //   5430: ixor
    //   5431: goto -> 5442
    //   5434: ldc2_w 1058328990
    //   5437: l2i
    //   5438: ldc_w 1172671246
    //   5441: ixor
    //   5442: ldc2_w 863480628
    //   5445: l2i
    //   5446: ldc_w 1756444383
    //   5449: ixor
    //   5450: ixor
    //   5451: lookupswitch default -> 5476, -965839225 -> 10834, 1261439931 -> 5434
    //   5476: aload_0
    //   5477: getstatic Perryc.0 : I
    //   5480: ifle -> 5494
    //   5483: ldc2_w -758826442
    //   5486: l2i
    //   5487: ldc_w 1844980991
    //   5490: ixor
    //   5491: goto -> 5502
    //   5494: ldc2_w 700735058
    //   5497: l2i
    //   5498: ldc_w 707548434
    //   5501: ixor
    //   5502: ldc2_w 2058523884
    //   5505: l2i
    //   5506: ldc_w 666809352
    //   5509: ixor
    //   5510: ixor
    //   5511: lookupswitch default -> 10706, -500091347 -> 5494, 1592011684 -> 5536
    //   5536: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5539: getstatic Perryc.1 : I
    //   5542: ifeq -> 5556
    //   5545: ldc2_w -1183165787
    //   5548: l2i
    //   5549: ldc_w -1168442910
    //   5552: ixor
    //   5553: goto -> 5564
    //   5556: ldc2_w 19393578
    //   5559: l2i
    //   5560: ldc_w -879504728
    //   5563: ixor
    //   5564: ldc2_w -373652476
    //   5567: l2i
    //   5568: ldc_w 195222060
    //   5571: ixor
    //   5572: ixor
    //   5573: lookupswitch default -> 10664, -516360849 -> 5556, 682385578 -> 5600
    //   5600: goto -> 5604
    //   5603: athrow
    //   5604: invokevirtual getValue : ()Ljava/lang/Object;
    //   5607: goto -> 5611
    //   5610: athrow
    //   5611: checkcast java/lang/Integer
    //   5614: getstatic Perryc.1 : I
    //   5617: ifeq -> 5631
    //   5620: ldc2_w 1709172506
    //   5623: l2i
    //   5624: ldc_w -1572168744
    //   5627: ixor
    //   5628: goto -> 5639
    //   5631: ldc2_w 1856019247
    //   5634: l2i
    //   5635: ldc_w 1607214112
    //   5638: ixor
    //   5639: ldc2_w 980145273
    //   5642: l2i
    //   5643: ldc_w -1868616317
    //   5646: ixor
    //   5647: ixor
    //   5648: lookupswitch default -> 10816, -1684519179 -> 5676, 1835107640 -> 5631
    //   5676: goto -> 5680
    //   5679: athrow
    //   5680: invokevirtual intValue : ()I
    //   5683: goto -> 5687
    //   5686: athrow
    //   5687: getstatic Perryc.0 : I
    //   5690: ifle -> 5704
    //   5693: ldc2_w -821009617
    //   5696: l2i
    //   5697: ldc_w -1638471637
    //   5700: ixor
    //   5701: goto -> 5712
    //   5704: ldc2_w -1160595412
    //   5707: l2i
    //   5708: ldc_w 8444732
    //   5711: ixor
    //   5712: ldc2_w 2104254918
    //   5715: l2i
    //   5716: ldc_w -1043180390
    //   5719: ixor
    //   5720: ixor
    //   5721: lookupswitch default -> 5748, -1216237903 -> 5704, -302465448 -> 10786
    //   5748: aload_0
    //   5749: getstatic Perryc.0 : I
    //   5752: ifle -> 5766
    //   5755: ldc2_w -530291160
    //   5758: l2i
    //   5759: ldc_w 1729296188
    //   5762: ixor
    //   5763: goto -> 5774
    //   5766: ldc2_w 1073810867
    //   5769: l2i
    //   5770: ldc_w -1471715948
    //   5773: ixor
    //   5774: ldc2_w 353466596
    //   5777: l2i
    //   5778: ldc_w 223843936
    //   5781: ixor
    //   5782: ixor
    //   5783: lookupswitch default -> 5808, -1624211568 -> 10620, 993517674 -> 5766
    //   5808: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5811: getstatic Perryc.1 : I
    //   5814: ifeq -> 5828
    //   5817: ldc2_w -1939232616
    //   5820: l2i
    //   5821: ldc_w 840093495
    //   5824: ixor
    //   5825: goto -> 5836
    //   5828: ldc2_w -1978191792
    //   5831: l2i
    //   5832: ldc_w -648174501
    //   5835: ixor
    //   5836: ldc2_w 49253160
    //   5839: l2i
    //   5840: ldc_w -367273391
    //   5843: ixor
    //   5844: ixor
    //   5845: lookupswitch default -> 10852, -1145125518 -> 5872, 1452226262 -> 5828
    //   5872: goto -> 5876
    //   5875: athrow
    //   5876: invokevirtual getValue : ()Ljava/lang/Object;
    //   5879: goto -> 5883
    //   5882: athrow
    //   5883: checkcast java/lang/Integer
    //   5886: getstatic Perryc.0 : I
    //   5889: ifle -> 5903
    //   5892: ldc2_w 298487201
    //   5895: l2i
    //   5896: ldc_w 427916696
    //   5899: ixor
    //   5900: goto -> 5911
    //   5903: ldc2_w -1849012698
    //   5906: l2i
    //   5907: ldc_w -1260823992
    //   5910: ixor
    //   5911: ldc2_w -610716775
    //   5914: l2i
    //   5915: ldc_w -2116404339
    //   5918: ixor
    //   5919: ixor
    //   5920: lookupswitch default -> 10696, 1376319533 -> 5903, 2135956602 -> 5948
    //   5948: goto -> 5952
    //   5951: athrow
    //   5952: invokevirtual intValue : ()I
    //   5955: goto -> 5959
    //   5958: athrow
    //   5959: getstatic Perryc.c : I
    //   5962: iflt -> 5976
    //   5965: ldc2_w -1609103384
    //   5968: l2i
    //   5969: ldc_w -162162986
    //   5972: ixor
    //   5973: goto -> 5984
    //   5976: ldc2_w -1510880420
    //   5979: l2i
    //   5980: ldc_w -308673910
    //   5983: ixor
    //   5984: ldc2_w 508061854
    //   5987: l2i
    //   5988: ldc_w -806508646
    //   5991: ixor
    //   5992: ixor
    //   5993: lookupswitch default -> 10846, -2014880198 -> 5976, -1714551086 -> 6020
    //   6020: aload_0
    //   6021: getstatic Perryc.c : I
    //   6024: iflt -> 6038
    //   6027: ldc2_w 92824379
    //   6030: l2i
    //   6031: ldc_w 1598916922
    //   6034: ixor
    //   6035: goto -> 6046
    //   6038: ldc2_w -290381628
    //   6041: l2i
    //   6042: ldc_w -178055275
    //   6045: ixor
    //   6046: ldc2_w -1445204554
    //   6049: l2i
    //   6050: ldc_w -735466540
    //   6053: ixor
    //   6054: ixor
    //   6055: lookupswitch default -> 6080, 210113642 -> 6038, 657960035 -> 10830
    //   6080: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6083: getstatic Perryc.c : I
    //   6086: iflt -> 6100
    //   6089: ldc2_w -40031580
    //   6092: l2i
    //   6093: ldc_w -418016871
    //   6096: ixor
    //   6097: goto -> 6108
    //   6100: ldc2_w -1320107149
    //   6103: l2i
    //   6104: ldc_w 1288331513
    //   6107: ixor
    //   6108: ldc2_w -432669872
    //   6111: l2i
    //   6112: ldc_w 1417699638
    //   6115: ixor
    //   6116: ixor
    //   6117: lookupswitch default -> 6144, -1472388773 -> 10758, -118326347 -> 6100
    //   6144: goto -> 6148
    //   6147: athrow
    //   6148: invokevirtual getValue : ()Ljava/lang/Object;
    //   6151: goto -> 6155
    //   6154: athrow
    //   6155: checkcast java/lang/Integer
    //   6158: getstatic Perryc.c : I
    //   6161: iflt -> 6175
    //   6164: ldc2_w -914488676
    //   6167: l2i
    //   6168: ldc_w 1771439525
    //   6171: ixor
    //   6172: goto -> 6183
    //   6175: ldc2_w -24684189
    //   6178: l2i
    //   6179: ldc_w 1425774857
    //   6182: ixor
    //   6183: ldc2_w -1975524316
    //   6186: l2i
    //   6187: ldc_w -678728577
    //   6190: ixor
    //   6191: ixor
    //   6192: lookupswitch default -> 6220, -44265630 -> 10658, 1610579547 -> 6175
    //   6220: goto -> 6224
    //   6223: athrow
    //   6224: invokevirtual intValue : ()I
    //   6227: goto -> 6231
    //   6230: athrow
    //   6231: ldc2_w 2013183392
    //   6234: l2i
    //   6235: ldc_w 2013183327
    //   6238: ixor
    //   6239: getstatic Perryc.0 : I
    //   6242: ifle -> 6256
    //   6245: ldc2_w -1319021490
    //   6248: l2i
    //   6249: ldc_w 720801255
    //   6252: ixor
    //   6253: goto -> 6264
    //   6256: ldc2_w -1440712678
    //   6259: l2i
    //   6260: ldc_w 243323857
    //   6263: ixor
    //   6264: ldc2_w 453989867
    //   6267: l2i
    //   6268: ldc_w -1064267760
    //   6271: ixor
    //   6272: ixor
    //   6273: lookupswitch default -> 6300, -392541541 -> 6256, 1074273362 -> 10840
    //   6300: goto -> 6304
    //   6303: athrow
    //   6304: invokestatic toRGBA : (IIII)I
    //   6307: goto -> 6311
    //   6310: athrow
    //   6311: getstatic Perryc.c : I
    //   6314: iflt -> 6328
    //   6317: ldc2_w 88120033
    //   6320: l2i
    //   6321: ldc_w 121526211
    //   6324: ixor
    //   6325: goto -> 6336
    //   6328: ldc2_w 47239614
    //   6331: l2i
    //   6332: ldc_w -467589110
    //   6335: ixor
    //   6336: ldc2_w -1179786842
    //   6339: l2i
    //   6340: ldc_w -1957228557
    //   6343: ixor
    //   6344: ixor
    //   6345: lookupswitch default -> 10630, -737470495 -> 6372, 813966199 -> 6328
    //   6372: putfield color1 : I
    //   6375: getstatic Perryc.0 : I
    //   6378: ifle -> 6392
    //   6381: ldc2_w 1471668585
    //   6384: l2i
    //   6385: ldc_w 537519658
    //   6388: ixor
    //   6389: goto -> 6400
    //   6392: ldc2_w 1760636252
    //   6395: l2i
    //   6396: ldc_w 1286109742
    //   6399: ixor
    //   6400: ldc2_w 1507594969
    //   6403: l2i
    //   6404: ldc_w 14436481
    //   6407: ixor
    //   6408: ixor
    //   6409: lookupswitch default -> 6436, 784227611 -> 10678, 1443245242 -> 6392
    //   6436: aload_0
    //   6437: getstatic Perryc.0 : I
    //   6440: ifle -> 6454
    //   6443: ldc2_w -738832926
    //   6446: l2i
    //   6447: ldc_w -338292072
    //   6450: ixor
    //   6451: goto -> 6462
    //   6454: ldc2_w -1817139486
    //   6457: l2i
    //   6458: ldc_w 1899716202
    //   6461: ixor
    //   6462: ldc2_w 109812951
    //   6465: l2i
    //   6466: ldc_w -1163460011
    //   6469: ixor
    //   6470: ixor
    //   6471: lookupswitch default -> 6496, -2079538696 -> 10638, 1660617710 -> 6454
    //   6496: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6499: getstatic Perryc.1 : I
    //   6502: ifeq -> 6516
    //   6505: ldc2_w -1821090147
    //   6508: l2i
    //   6509: ldc_w 1388001683
    //   6512: ixor
    //   6513: goto -> 6524
    //   6516: ldc2_w 1961228318
    //   6519: l2i
    //   6520: ldc_w -1997665996
    //   6523: ixor
    //   6524: ldc2_w -1185271994
    //   6527: l2i
    //   6528: ldc_w 1084631474
    //   6531: ixor
    //   6532: ixor
    //   6533: lookupswitch default -> 10656, 100136926 -> 6560, 942891514 -> 6516
    //   6560: goto -> 6564
    //   6563: athrow
    //   6564: invokevirtual getValue : ()Ljava/lang/Object;
    //   6567: goto -> 6571
    //   6570: athrow
    //   6571: checkcast java/lang/Integer
    //   6574: getstatic Perryc.1 : I
    //   6577: ifeq -> 6591
    //   6580: ldc2_w -652822532
    //   6583: l2i
    //   6584: ldc_w 2020957923
    //   6587: ixor
    //   6588: goto -> 6599
    //   6591: ldc2_w 609120278
    //   6594: l2i
    //   6595: ldc_w -1771175919
    //   6598: ixor
    //   6599: ldc2_w 343121980
    //   6602: l2i
    //   6603: ldc_w -270069043
    //   6606: ixor
    //   6607: ixor
    //   6608: lookupswitch default -> 10880, 1236583158 -> 6636, 1526160366 -> 6591
    //   6636: goto -> 6640
    //   6639: athrow
    //   6640: invokevirtual intValue : ()I
    //   6643: goto -> 6647
    //   6646: athrow
    //   6647: getstatic Perryc.1 : I
    //   6650: ifeq -> 6664
    //   6653: ldc2_w -2030786751
    //   6656: l2i
    //   6657: ldc_w -152693677
    //   6660: ixor
    //   6661: goto -> 6672
    //   6664: ldc2_w -1530228055
    //   6667: l2i
    //   6668: ldc_w -1101672059
    //   6671: ixor
    //   6672: ldc2_w -1856209773
    //   6675: l2i
    //   6676: ldc_w -251100219
    //   6679: ixor
    //   6680: ixor
    //   6681: lookupswitch default -> 10652, 273042500 -> 6664, 2060172410 -> 6708
    //   6708: aload_0
    //   6709: getstatic Perryc.1 : I
    //   6712: ifeq -> 6726
    //   6715: ldc2_w -469903470
    //   6718: l2i
    //   6719: ldc_w 920489861
    //   6722: ixor
    //   6723: goto -> 6734
    //   6726: ldc2_w -1607654917
    //   6729: l2i
    //   6730: ldc_w -15150896
    //   6733: ixor
    //   6734: ldc2_w 898345577
    //   6737: l2i
    //   6738: ldc_w 1832342986
    //   6741: ixor
    //   6742: ixor
    //   6743: lookupswitch default -> 6768, -1919113292 -> 10694, -1426854209 -> 6726
    //   6768: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6771: getstatic Perryc.1 : I
    //   6774: ifeq -> 6788
    //   6777: ldc2_w -1891321104
    //   6780: l2i
    //   6781: ldc_w 1638920745
    //   6784: ixor
    //   6785: goto -> 6796
    //   6788: ldc2_w 1606343537
    //   6791: l2i
    //   6792: ldc_w -923049662
    //   6795: ixor
    //   6796: ldc2_w -2104016651
    //   6799: l2i
    //   6800: ldc_w 2094516692
    //   6803: ixor
    //   6804: ixor
    //   6805: lookupswitch default -> 6832, 279691768 -> 10824, 870162288 -> 6788
    //   6832: goto -> 6836
    //   6835: athrow
    //   6836: invokevirtual getValue : ()Ljava/lang/Object;
    //   6839: goto -> 6843
    //   6842: athrow
    //   6843: checkcast java/lang/Integer
    //   6846: getstatic Perryc.c : I
    //   6849: iflt -> 6863
    //   6852: ldc2_w -1425330770
    //   6855: l2i
    //   6856: ldc_w -2010585198
    //   6859: ixor
    //   6860: goto -> 6871
    //   6863: ldc2_w 1023305604
    //   6866: l2i
    //   6867: ldc_w 630152870
    //   6870: ixor
    //   6871: ldc2_w -1996701709
    //   6874: l2i
    //   6875: ldc_w 1297162528
    //   6878: ixor
    //   6879: ixor
    //   6880: lookupswitch default -> 10716, -589518863 -> 6908, -426879761 -> 6863
    //   6908: goto -> 6912
    //   6911: athrow
    //   6912: invokevirtual intValue : ()I
    //   6915: goto -> 6919
    //   6918: athrow
    //   6919: ldc2_w 809807603
    //   6922: l2i
    //   6923: ldc_w 809807419
    //   6926: ixor
    //   6927: ldc2_w -1075399673
    //   6930: l2i
    //   6931: ldc_w -1075399672
    //   6934: ixor
    //   6935: ldc2_w -905138696
    //   6938: l2i
    //   6939: ldc_w -905138708
    //   6942: ixor
    //   6943: ldc2_w 2113006061
    //   6946: l2i
    //   6947: ldc_w 2113006073
    //   6950: ixor
    //   6951: ldc2_w 774384153
    //   6954: l2i
    //   6955: ldc_w 774384141
    //   6958: ixor
    //   6959: ldc2_w 1790858271
    //   6962: l2i
    //   6963: ldc_w 1790858455
    //   6966: ixor
    //   6967: getstatic Perryc.0 : I
    //   6970: ifle -> 6984
    //   6973: ldc2_w 1059619262
    //   6976: l2i
    //   6977: ldc_w -1090561782
    //   6980: ixor
    //   6981: goto -> 6992
    //   6984: ldc2_w 700350520
    //   6987: l2i
    //   6988: ldc_w 396406937
    //   6991: ixor
    //   6992: ldc2_w 392950294
    //   6995: l2i
    //   6996: ldc_w 28145792
    //   6999: ixor
    //   7000: ixor
    //   7001: lookupswitch default -> 7028, -1901055716 -> 6984, -1760472542 -> 10800
    //   7028: goto -> 7032
    //   7031: athrow
    //   7032: invokestatic toRGBA : (IIII)I
    //   7035: goto -> 7039
    //   7038: athrow
    //   7039: getstatic Perryc.0 : I
    //   7042: ifle -> 7056
    //   7045: ldc2_w -259094912
    //   7048: l2i
    //   7049: ldc_w -1809655023
    //   7052: ixor
    //   7053: goto -> 7064
    //   7056: ldc2_w -1834356473
    //   7059: l2i
    //   7060: ldc_w 1869150400
    //   7063: ixor
    //   7064: ldc2_w -689508522
    //   7067: l2i
    //   7068: ldc_w -77985329
    //   7071: ixor
    //   7072: ixor
    //   7073: lookupswitch default -> 10898, -797053090 -> 7100, 1225833224 -> 7056
    //   7100: goto -> 7104
    //   7103: athrow
    //   7104: invokestatic drawRectangleCorrectly : (IIIII)V
    //   7107: goto -> 7111
    //   7110: athrow
    //   7111: getstatic Perryc.0 : I
    //   7114: ifle -> 7128
    //   7117: ldc2_w -982698875
    //   7120: l2i
    //   7121: ldc_w -1730718368
    //   7124: ixor
    //   7125: goto -> 7136
    //   7128: ldc2_w -1552855020
    //   7131: l2i
    //   7132: ldc_w 1357727183
    //   7135: ixor
    //   7136: ldc2_w -69779044
    //   7139: l2i
    //   7140: ldc_w -1862690591
    //   7143: ixor
    //   7144: ixor
    //   7145: lookupswitch default -> 10780, -1733112666 -> 7172, 915716248 -> 7128
    //   7172: aload_0
    //   7173: getstatic Perryc.c : I
    //   7176: iflt -> 7190
    //   7179: ldc2_w -1386515356
    //   7182: l2i
    //   7183: ldc_w 121885854
    //   7186: ixor
    //   7187: goto -> 7198
    //   7190: ldc2_w 997490558
    //   7193: l2i
    //   7194: ldc_w -942935711
    //   7197: ixor
    //   7198: ldc2_w 2118591405
    //   7201: l2i
    //   7202: ldc_w -1527974786
    //   7205: ixor
    //   7206: ixor
    //   7207: lookupswitch default -> 7232, 1145735254 -> 7190, 1890809641 -> 10640
    //   7232: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7235: getstatic Perryc.1 : I
    //   7238: ifeq -> 7252
    //   7241: ldc2_w 1632741427
    //   7244: l2i
    //   7245: ldc_w 207450049
    //   7248: ixor
    //   7249: goto -> 7260
    //   7252: ldc2_w 934267117
    //   7255: l2i
    //   7256: ldc_w -1798089246
    //   7259: ixor
    //   7260: ldc2_w -286930904
    //   7263: l2i
    //   7264: ldc_w -973959917
    //   7267: ixor
    //   7268: ixor
    //   7269: lookupswitch default -> 10650, -2006198220 -> 7296, 1176208073 -> 7252
    //   7296: goto -> 7300
    //   7299: athrow
    //   7300: invokevirtual getValue : ()Ljava/lang/Object;
    //   7303: goto -> 7307
    //   7306: athrow
    //   7307: checkcast java/lang/Integer
    //   7310: getstatic Perryc.1 : I
    //   7313: ifeq -> 7327
    //   7316: ldc2_w -1205850760
    //   7319: l2i
    //   7320: ldc_w 2048362284
    //   7323: ixor
    //   7324: goto -> 7335
    //   7327: ldc2_w 1588276657
    //   7330: l2i
    //   7331: ldc_w 766731526
    //   7334: ixor
    //   7335: ldc2_w -436402553
    //   7338: l2i
    //   7339: ldc_w 1135378799
    //   7342: ixor
    //   7343: ixor
    //   7344: lookupswitch default -> 10710, -716583073 -> 7372, 1684417980 -> 7327
    //   7372: goto -> 7376
    //   7375: athrow
    //   7376: invokevirtual intValue : ()I
    //   7379: goto -> 7383
    //   7382: athrow
    //   7383: i2d
    //   7384: ldc2_w 1.2746142652167885E308
    //   7387: invokestatic doubleToLongBits : (D)J
    //   7390: ldc2_w 9216247591926573252
    //   7393: lxor
    //   7394: invokestatic longBitsToDouble : (J)D
    //   7397: getstatic Perryc.0 : I
    //   7400: ifle -> 7414
    //   7403: ldc2_w 2071381770
    //   7406: l2i
    //   7407: ldc_w 1663937200
    //   7410: ixor
    //   7411: goto -> 7422
    //   7414: ldc2_w -1475606688
    //   7417: l2i
    //   7418: ldc_w -74482135
    //   7421: ixor
    //   7422: ldc2_w -1228227154
    //   7425: l2i
    //   7426: ldc_w 1007927193
    //   7429: ixor
    //   7430: ixor
    //   7431: lookupswitch default -> 7456, -1836945523 -> 10854, -1315162520 -> 7414
    //   7456: aload_0
    //   7457: getstatic Perryc.c : I
    //   7460: iflt -> 7474
    //   7463: ldc2_w 2069456251
    //   7466: l2i
    //   7467: ldc_w -2018286341
    //   7470: ixor
    //   7471: goto -> 7482
    //   7474: ldc2_w -2036681851
    //   7477: l2i
    //   7478: ldc_w 1581444077
    //   7481: ixor
    //   7482: ldc2_w 2007581646
    //   7485: l2i
    //   7486: ldc_w -173460412
    //   7489: ixor
    //   7490: ixor
    //   7491: lookupswitch default -> 7516, 1947336351 -> 7474, 2129294858 -> 10862
    //   7516: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7519: getstatic Perryc.c : I
    //   7522: iflt -> 7536
    //   7525: ldc2_w 847591006
    //   7528: l2i
    //   7529: ldc_w 1126489792
    //   7532: ixor
    //   7533: goto -> 7544
    //   7536: ldc2_w -1293125579
    //   7539: l2i
    //   7540: ldc_w -1331304167
    //   7543: ixor
    //   7544: ldc2_w 132723646
    //   7547: l2i
    //   7548: ldc_w -1152937969
    //   7551: ixor
    //   7552: ixor
    //   7553: lookupswitch default -> 7580, -854635729 -> 10754, -619902539 -> 7536
    //   7580: goto -> 7584
    //   7583: athrow
    //   7584: invokevirtual getValue : ()Ljava/lang/Object;
    //   7587: goto -> 7591
    //   7590: athrow
    //   7591: checkcast java/lang/Integer
    //   7594: getstatic Perryc.c : I
    //   7597: iflt -> 7611
    //   7600: ldc2_w -107137974
    //   7603: l2i
    //   7604: ldc_w -950111716
    //   7607: ixor
    //   7608: goto -> 7619
    //   7611: ldc2_w -145876283
    //   7614: l2i
    //   7615: ldc_w 1471592820
    //   7618: ixor
    //   7619: ldc2_w -1779423840
    //   7622: l2i
    //   7623: ldc_w 100829493
    //   7626: ixor
    //   7627: ixor
    //   7628: lookupswitch default -> 10886, -1389237565 -> 7611, 856297252 -> 7656
    //   7656: goto -> 7660
    //   7659: athrow
    //   7660: invokevirtual intValue : ()I
    //   7663: goto -> 7667
    //   7666: athrow
    //   7667: i2d
    //   7668: dadd
    //   7669: ldc2_w 1771117610
    //   7672: l2i
    //   7673: ldc_w 1771117794
    //   7676: ixor
    //   7677: getstatic Perryc.c : I
    //   7680: iflt -> 7694
    //   7683: ldc2_w -380340317
    //   7686: l2i
    //   7687: ldc_w -297506031
    //   7690: ixor
    //   7691: goto -> 7702
    //   7694: ldc2_w 1876997489
    //   7697: l2i
    //   7698: ldc_w 77042096
    //   7701: ixor
    //   7702: ldc2_w -970364742
    //   7705: l2i
    //   7706: ldc_w -1618143257
    //   7709: ixor
    //   7710: ixor
    //   7711: lookupswitch default -> 10644, 852712348 -> 7736, 1588880367 -> 7694
    //   7736: aload_0
    //   7737: getstatic Perryc.0 : I
    //   7740: ifle -> 7754
    //   7743: ldc2_w 628246382
    //   7746: l2i
    //   7747: ldc_w -1468987127
    //   7750: ixor
    //   7751: goto -> 7762
    //   7754: ldc2_w 1178848900
    //   7757: l2i
    //   7758: ldc_w -125601889
    //   7761: ixor
    //   7762: ldc2_w 1600160204
    //   7765: l2i
    //   7766: ldc_w -509105676
    //   7769: ixor
    //   7770: ixor
    //   7771: lookupswitch default -> 10900, 495907 -> 7796, 868509279 -> 7754
    //   7796: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7799: getstatic Perryc.1 : I
    //   7802: ifeq -> 7816
    //   7805: ldc2_w 412145510
    //   7808: l2i
    //   7809: ldc_w 232490708
    //   7812: ixor
    //   7813: goto -> 7824
    //   7816: ldc2_w -2032921961
    //   7819: l2i
    //   7820: ldc_w 514258593
    //   7823: ixor
    //   7824: ldc2_w 770516584
    //   7827: l2i
    //   7828: ldc_w 369127982
    //   7831: ixor
    //   7832: ixor
    //   7833: lookupswitch default -> 7860, -548537680 -> 7816, 782632436 -> 10660
    //   7860: goto -> 7864
    //   7863: athrow
    //   7864: invokevirtual getValue : ()Ljava/lang/Object;
    //   7867: goto -> 7871
    //   7870: athrow
    //   7871: checkcast java/lang/Integer
    //   7874: getstatic Perryc.c : I
    //   7877: iflt -> 7891
    //   7880: ldc2_w -1967716131
    //   7883: l2i
    //   7884: ldc_w -1434369231
    //   7887: ixor
    //   7888: goto -> 7899
    //   7891: ldc2_w -2129912090
    //   7894: l2i
    //   7895: ldc_w -1331704366
    //   7898: ixor
    //   7899: ldc2_w -613478149
    //   7902: l2i
    //   7903: ldc_w 403114716
    //   7906: ixor
    //   7907: ixor
    //   7908: lookupswitch default -> 10818, -480357941 -> 7891, -218380013 -> 7936
    //   7936: goto -> 7940
    //   7939: athrow
    //   7940: invokevirtual intValue : ()I
    //   7943: goto -> 7947
    //   7946: athrow
    //   7947: iadd
    //   7948: i2d
    //   7949: ldc2_w 12.358839188844554
    //   7952: invokestatic doubleToLongBits : (D)J
    //   7955: ldc2_w 9210063246477310103
    //   7958: lxor
    //   7959: invokestatic longBitsToDouble : (J)D
    //   7962: getstatic Perryc.0 : I
    //   7965: ifle -> 7979
    //   7968: ldc2_w 631328994
    //   7971: l2i
    //   7972: ldc_w 1735142783
    //   7975: ixor
    //   7976: goto -> 7987
    //   7979: ldc2_w 977076416
    //   7982: l2i
    //   7983: ldc_w 742383502
    //   7986: ixor
    //   7987: ldc2_w -115372610
    //   7990: l2i
    //   7991: ldc_w -890530502
    //   7994: ixor
    //   7995: ixor
    //   7996: lookupswitch default -> 10792, 636929994 -> 8024, 1899586841 -> 7979
    //   8024: aload_0
    //   8025: getstatic Perryc.0 : I
    //   8028: ifle -> 8042
    //   8031: ldc2_w -1929120581
    //   8034: l2i
    //   8035: ldc_w 812305630
    //   8038: ixor
    //   8039: goto -> 8050
    //   8042: ldc2_w 898600717
    //   8045: l2i
    //   8046: ldc_w 1191624027
    //   8049: ixor
    //   8050: ldc2_w -1793069143
    //   8053: l2i
    //   8054: ldc_w -89365980
    //   8057: ixor
    //   8058: ixor
    //   8059: lookupswitch default -> 10822, -757418520 -> 8042, 490389467 -> 8084
    //   8084: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8087: getstatic Perryc.c : I
    //   8090: iflt -> 8104
    //   8093: ldc2_w -1397117430
    //   8096: l2i
    //   8097: ldc_w -775175756
    //   8100: ixor
    //   8101: goto -> 8112
    //   8104: ldc2_w -1033734386
    //   8107: l2i
    //   8108: ldc_w -1052629487
    //   8111: ixor
    //   8112: ldc2_w 1577230326
    //   8115: l2i
    //   8116: ldc_w -835623062
    //   8119: ixor
    //   8120: ixor
    //   8121: lookupswitch default -> 10646, -1827427965 -> 8148, -314468574 -> 8104
    //   8148: goto -> 8152
    //   8151: athrow
    //   8152: invokevirtual getValue : ()Ljava/lang/Object;
    //   8155: goto -> 8159
    //   8158: athrow
    //   8159: checkcast java/lang/Integer
    //   8162: getstatic Perryc.c : I
    //   8165: iflt -> 8179
    //   8168: ldc2_w 257019906
    //   8171: l2i
    //   8172: ldc_w -2077938869
    //   8175: ixor
    //   8176: goto -> 8187
    //   8179: ldc2_w -90083021
    //   8182: l2i
    //   8183: ldc_w 964599804
    //   8186: ixor
    //   8187: ldc2_w 1957076747
    //   8190: l2i
    //   8191: ldc_w -757165277
    //   8194: ixor
    //   8195: ixor
    //   8196: lookupswitch default -> 10826, 755824481 -> 8179, 1705501415 -> 8224
    //   8224: goto -> 8228
    //   8227: athrow
    //   8228: invokevirtual intValue : ()I
    //   8231: goto -> 8235
    //   8234: athrow
    //   8235: i2d
    //   8236: dadd
    //   8237: getstatic Perryc.1 : I
    //   8240: ifeq -> 8254
    //   8243: ldc2_w 229833488
    //   8246: l2i
    //   8247: ldc_w 1948027059
    //   8250: ixor
    //   8251: goto -> 8262
    //   8254: ldc2_w 1225805088
    //   8257: l2i
    //   8258: ldc_w 695963455
    //   8261: ixor
    //   8262: ldc2_w 1744387468
    //   8265: l2i
    //   8266: ldc_w 1900978304
    //   8269: ixor
    //   8270: ixor
    //   8271: lookupswitch default -> 10654, 1863970479 -> 8254, 1994153747 -> 8296
    //   8296: aload_0
    //   8297: getstatic Perryc.1 : I
    //   8300: ifeq -> 8314
    //   8303: ldc2_w -1259610406
    //   8306: l2i
    //   8307: ldc_w 922506747
    //   8310: ixor
    //   8311: goto -> 8322
    //   8314: ldc2_w 708512917
    //   8317: l2i
    //   8318: ldc_w -446558840
    //   8321: ixor
    //   8322: ldc2_w -599618738
    //   8325: l2i
    //   8326: ldc_w -731425065
    //   8329: ixor
    //   8330: ixor
    //   8331: lookupswitch default -> 8356, -1976412488 -> 10674, -378964468 -> 8314
    //   8356: getfield color1 : I
    //   8359: getstatic Perryc.1 : I
    //   8362: ifeq -> 8376
    //   8365: ldc2_w 796960211
    //   8368: l2i
    //   8369: ldc_w 1660217266
    //   8372: ixor
    //   8373: goto -> 8384
    //   8376: ldc2_w 1130177098
    //   8379: l2i
    //   8380: ldc_w 1398925049
    //   8383: ixor
    //   8384: ldc2_w -1916408469
    //   8387: l2i
    //   8388: ldc_w -469792987
    //   8391: ixor
    //   8392: ixor
    //   8393: lookupswitch default -> 10722, 592324655 -> 8376, 2114367229 -> 8420
    //   8420: aload_0
    //   8421: getstatic Perryc.0 : I
    //   8424: ifle -> 8438
    //   8427: ldc2_w 1918503227
    //   8430: l2i
    //   8431: ldc_w -1929203875
    //   8434: ixor
    //   8435: goto -> 8446
    //   8438: ldc2_w -2121782348
    //   8441: l2i
    //   8442: ldc_w 1761291819
    //   8445: ixor
    //   8446: ldc2_w 1809620738
    //   8449: l2i
    //   8450: ldc_w 1348808753
    //   8453: ixor
    //   8454: ixor
    //   8455: lookupswitch default -> 8480, -991884971 -> 10770, 137066687 -> 8438
    //   8480: getfield color1 : I
    //   8483: getstatic Perryc.1 : I
    //   8486: ifeq -> 8500
    //   8489: ldc2_w 455478716
    //   8492: l2i
    //   8493: ldc_w 1383161602
    //   8496: ixor
    //   8497: goto -> 8508
    //   8500: ldc2_w -55563472
    //   8503: l2i
    //   8504: ldc_w -312291929
    //   8507: ixor
    //   8508: ldc2_w 382968663
    //   8511: l2i
    //   8512: ldc_w 56796143
    //   8515: ixor
    //   8516: ixor
    //   8517: lookupswitch default -> 8544, -900450897 -> 8500, 1558598150 -> 10714
    //   8544: goto -> 8548
    //   8547: athrow
    //   8548: invokestatic drawGradientSideways : (DDDDII)V
    //   8551: goto -> 8555
    //   8554: athrow
    //   8555: getstatic Perryc.1 : I
    //   8558: ifeq -> 8572
    //   8561: ldc2_w -315649636
    //   8564: l2i
    //   8565: ldc_w 92508049
    //   8568: ixor
    //   8569: goto -> 8580
    //   8572: ldc2_w 1403435080
    //   8575: l2i
    //   8576: ldc_w -997329625
    //   8579: ixor
    //   8580: ldc2_w -391278258
    //   8583: l2i
    //   8584: ldc_w -600078739
    //   8587: ixor
    //   8588: ixor
    //   8589: lookupswitch default -> 8616, -792505028 -> 8572, -600176338 -> 10736
    //   8616: aload_0
    //   8617: getstatic Perryc.0 : I
    //   8620: ifle -> 8634
    //   8623: ldc2_w -763575211
    //   8626: l2i
    //   8627: ldc_w -350402812
    //   8630: ixor
    //   8631: goto -> 8642
    //   8634: ldc2_w -1398911950
    //   8637: l2i
    //   8638: ldc_w -1464197360
    //   8641: ixor
    //   8642: ldc2_w -492905968
    //   8645: l2i
    //   8646: ldc_w 1092144078
    //   8649: ixor
    //   8650: ixor
    //   8651: lookupswitch default -> 8676, -1696099697 -> 10690, 49831943 -> 8634
    //   8676: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   8679: new java/lang/StringBuilder
    //   8682: dup
    //   8683: getstatic Perryc.c : I
    //   8686: iflt -> 8700
    //   8689: ldc2_w 693678982
    //   8692: l2i
    //   8693: ldc_w -1894006063
    //   8696: ixor
    //   8697: goto -> 8708
    //   8700: ldc2_w 1981256969
    //   8703: l2i
    //   8704: ldc_w -308334426
    //   8707: ixor
    //   8708: ldc2_w 481191233
    //   8711: l2i
    //   8712: ldc_w 397925635
    //   8715: ixor
    //   8716: ixor
    //   8717: lookupswitch default -> 8744, -1386559211 -> 10782, 593669037 -> 8700
    //   8744: goto -> 8748
    //   8747: athrow
    //   8748: invokespecial <init> : ()V
    //   8751: goto -> 8755
    //   8754: athrow
    //   8755: ldc_w '葦㌖萡把颠櫮๲捻턦쐑㳒੧模⸴'
    //   8758: getstatic Perryc.c : I
    //   8761: iflt -> 8775
    //   8764: ldc2_w 7250257
    //   8767: l2i
    //   8768: ldc_w 198042741
    //   8771: ixor
    //   8772: goto -> 8783
    //   8775: ldc2_w 2124531333
    //   8778: l2i
    //   8779: ldc_w 326772393
    //   8782: ixor
    //   8783: ldc2_w 2082591945
    //   8786: l2i
    //   8787: ldc_w -144062013
    //   8790: ixor
    //   8791: ixor
    //   8792: lookupswitch default -> 8820, -2132060114 -> 10772, 1660800402 -> 8775
    //   8820: goto -> 8824
    //   8823: athrow
    //   8824: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8827: goto -> 8831
    //   8830: athrow
    //   8831: getstatic Perryc.0 : I
    //   8834: ifle -> 8848
    //   8837: ldc2_w 1908204452
    //   8840: l2i
    //   8841: ldc_w 1080220015
    //   8844: ixor
    //   8845: goto -> 8856
    //   8848: ldc2_w 522993803
    //   8851: l2i
    //   8852: ldc_w 654690522
    //   8855: ixor
    //   8856: ldc2_w 1854771692
    //   8859: l2i
    //   8860: ldc_w -1933097218
    //   8863: ixor
    //   8864: ixor
    //   8865: lookupswitch default -> 10746, -745214503 -> 8848, -631021757 -> 8892
    //   8892: goto -> 8896
    //   8895: athrow
    //   8896: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8899: goto -> 8903
    //   8902: athrow
    //   8903: getstatic Perryc.0 : I
    //   8906: ifle -> 8920
    //   8909: ldc2_w -754170207
    //   8912: l2i
    //   8913: ldc_w -1407595591
    //   8916: ixor
    //   8917: goto -> 8928
    //   8920: ldc2_w -2016067890
    //   8923: l2i
    //   8924: ldc_w 1133003731
    //   8927: ixor
    //   8928: ldc2_w 1904933140
    //   8931: l2i
    //   8932: ldc_w -297281405
    //   8935: ixor
    //   8936: ixor
    //   8937: lookupswitch default -> 10624, -522670961 -> 8920, 1536187530 -> 8964
    //   8964: goto -> 8968
    //   8967: athrow
    //   8968: invokestatic getPingSatus : ()Ljava/lang/String;
    //   8971: goto -> 8975
    //   8974: athrow
    //   8975: getstatic Perryc.c : I
    //   8978: iflt -> 8992
    //   8981: ldc2_w 528268927
    //   8984: l2i
    //   8985: ldc_w -1996587810
    //   8988: ixor
    //   8989: goto -> 9000
    //   8992: ldc2_w 1997744556
    //   8995: l2i
    //   8996: ldc_w -211384564
    //   8999: ixor
    //   9000: ldc2_w 1442550223
    //   9003: l2i
    //   9004: ldc_w 393064589
    //   9007: ixor
    //   9008: ixor
    //   9009: lookupswitch default -> 10890, -958165022 -> 9036, -720051229 -> 8992
    //   9036: goto -> 9040
    //   9039: athrow
    //   9040: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9043: goto -> 9047
    //   9046: athrow
    //   9047: ldc_w '葜㌀董䄒飡'
    //   9050: getstatic Perryc.0 : I
    //   9053: ifle -> 9067
    //   9056: ldc2_w 1992884903
    //   9059: l2i
    //   9060: ldc_w 286309171
    //   9063: ixor
    //   9064: goto -> 9075
    //   9067: ldc2_w -1486422929
    //   9070: l2i
    //   9071: ldc_w -2046748376
    //   9074: ixor
    //   9075: ldc2_w -1394644096
    //   9078: l2i
    //   9079: ldc_w -304197424
    //   9082: ixor
    //   9083: ixor
    //   9084: lookupswitch default -> 9112, 651723460 -> 10828, 1794913415 -> 9067
    //   9112: goto -> 9116
    //   9115: athrow
    //   9116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9119: goto -> 9123
    //   9122: athrow
    //   9123: getstatic Perryc.c : I
    //   9126: iflt -> 9140
    //   9129: ldc2_w -1895433916
    //   9132: l2i
    //   9133: ldc_w -1706704693
    //   9136: ixor
    //   9137: goto -> 9148
    //   9140: ldc2_w -1153454758
    //   9143: l2i
    //   9144: ldc_w -1421470872
    //   9147: ixor
    //   9148: ldc2_w 1223557492
    //   9151: l2i
    //   9152: ldc_w -488674069
    //   9155: ixor
    //   9156: ixor
    //   9157: lookupswitch default -> 10692, -1169632339 -> 9184, -1083091952 -> 9140
    //   9184: goto -> 9188
    //   9187: athrow
    //   9188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9191: goto -> 9195
    //   9194: athrow
    //   9195: getstatic Perryc.c : I
    //   9198: iflt -> 9212
    //   9201: ldc2_w 1677819351
    //   9204: l2i
    //   9205: ldc_w -1242117440
    //   9208: ixor
    //   9209: goto -> 9220
    //   9212: ldc2_w 1628827957
    //   9215: l2i
    //   9216: ldc_w -837344091
    //   9219: ixor
    //   9220: ldc2_w 1078120849
    //   9223: l2i
    //   9224: ldc_w 525171873
    //   9227: ixor
    //   9228: ixor
    //   9229: lookupswitch default -> 10634, -1896343001 -> 9212, -267552608 -> 9256
    //   9256: goto -> 9260
    //   9259: athrow
    //   9260: invokestatic getFpsStatus : ()Ljava/lang/String;
    //   9263: goto -> 9267
    //   9266: athrow
    //   9267: getstatic Perryc.c : I
    //   9270: iflt -> 9284
    //   9273: ldc2_w -17595836
    //   9276: l2i
    //   9277: ldc_w 2144209165
    //   9280: ixor
    //   9281: goto -> 9292
    //   9284: ldc2_w 504482994
    //   9287: l2i
    //   9288: ldc_w 1306248500
    //   9291: ixor
    //   9292: ldc2_w -214843328
    //   9295: l2i
    //   9296: ldc_w 1427708684
    //   9299: ixor
    //   9300: ixor
    //   9301: lookupswitch default -> 10868, -169684278 -> 9328, 655708165 -> 9284
    //   9328: goto -> 9332
    //   9331: athrow
    //   9332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9335: goto -> 9339
    //   9338: athrow
    //   9339: ldc_w '著㌃萰拢묑檭'
    //   9342: getstatic Perryc.0 : I
    //   9345: ifle -> 9359
    //   9348: ldc2_w 1405580883
    //   9351: l2i
    //   9352: ldc_w -37383167
    //   9355: ixor
    //   9356: goto -> 9367
    //   9359: ldc2_w 164772252
    //   9362: l2i
    //   9363: ldc_w -1281184067
    //   9366: ixor
    //   9367: ldc2_w -1835921803
    //   9370: l2i
    //   9371: ldc_w 236040924
    //   9374: ixor
    //   9375: ixor
    //   9376: lookupswitch default -> 10612, 653470600 -> 9404, 847339259 -> 9359
    //   9404: goto -> 9408
    //   9407: athrow
    //   9408: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9411: goto -> 9415
    //   9414: athrow
    //   9415: getstatic Perryc.1 : I
    //   9418: ifeq -> 9432
    //   9421: ldc2_w 751031990
    //   9424: l2i
    //   9425: ldc_w -1067315421
    //   9428: ixor
    //   9429: goto -> 9440
    //   9432: ldc2_w -601356760
    //   9435: l2i
    //   9436: ldc_w 584771746
    //   9439: ixor
    //   9440: ldc2_w 1715119332
    //   9443: l2i
    //   9444: ldc_w -1796415085
    //   9447: ixor
    //   9448: ixor
    //   9449: lookupswitch default -> 9476, 511155426 -> 10906, 1963802563 -> 9432
    //   9476: goto -> 9480
    //   9479: athrow
    //   9480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9483: goto -> 9487
    //   9486: athrow
    //   9487: getstatic Perryc.c : I
    //   9490: iflt -> 9504
    //   9493: ldc2_w 1726832491
    //   9496: l2i
    //   9497: ldc_w 588220010
    //   9500: ixor
    //   9501: goto -> 9512
    //   9504: ldc2_w 535562872
    //   9507: l2i
    //   9508: ldc_w 540720740
    //   9511: ixor
    //   9512: ldc2_w -486434122
    //   9515: l2i
    //   9516: ldc_w -819899619
    //   9519: ixor
    //   9520: ixor
    //   9521: lookupswitch default -> 9548, -1827896413 -> 9504, 1774325930 -> 10892
    //   9548: goto -> 9552
    //   9551: athrow
    //   9552: invokestatic getTpsStatus : ()Ljava/lang/String;
    //   9555: goto -> 9559
    //   9558: athrow
    //   9559: getstatic Perryc.0 : I
    //   9562: ifle -> 9576
    //   9565: ldc2_w -1200561857
    //   9568: l2i
    //   9569: ldc_w -1543608379
    //   9572: ixor
    //   9573: goto -> 9584
    //   9576: ldc2_w -1550916332
    //   9579: l2i
    //   9580: ldc_w 1805632678
    //   9583: ixor
    //   9584: ldc2_w -682036018
    //   9587: l2i
    //   9588: ldc_w -1324126480
    //   9591: ixor
    //   9592: ixor
    //   9593: lookupswitch default -> 9620, -1484672699 -> 9576, 2110069956 -> 10732
    //   9620: goto -> 9624
    //   9623: athrow
    //   9624: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9627: goto -> 9631
    //   9630: athrow
    //   9631: ldc_w '葅㌃萰'
    //   9634: getstatic Perryc.0 : I
    //   9637: ifle -> 9651
    //   9640: ldc2_w -1380480191
    //   9643: l2i
    //   9644: ldc_w -1901214280
    //   9647: ixor
    //   9648: goto -> 9659
    //   9651: ldc2_w -1818723493
    //   9654: l2i
    //   9655: ldc_w 1559044225
    //   9658: ixor
    //   9659: ldc2_w 1377290785
    //   9662: l2i
    //   9663: ldc_w -1758906159
    //   9666: ixor
    //   9667: ixor
    //   9668: lookupswitch default -> 10808, -433800183 -> 9651, 172730666 -> 9696
    //   9696: goto -> 9700
    //   9699: athrow
    //   9700: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9703: goto -> 9707
    //   9706: athrow
    //   9707: getstatic Perryc.1 : I
    //   9710: ifeq -> 9724
    //   9713: ldc2_w 591085577
    //   9716: l2i
    //   9717: ldc_w -751717038
    //   9720: ixor
    //   9721: goto -> 9732
    //   9724: ldc2_w 1728301707
    //   9727: l2i
    //   9728: ldc_w -1038680586
    //   9731: ixor
    //   9732: ldc2_w 1313212462
    //   9735: l2i
    //   9736: ldc_w 929148854
    //   9739: ixor
    //   9740: ixor
    //   9741: lookupswitch default -> 9768, -1993518397 -> 10874, -876897988 -> 9724
    //   9768: goto -> 9772
    //   9771: athrow
    //   9772: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9775: goto -> 9779
    //   9778: athrow
    //   9779: getstatic Perryc.1 : I
    //   9782: ifeq -> 9796
    //   9785: ldc2_w 878020129
    //   9788: l2i
    //   9789: ldc_w -1276422865
    //   9792: ixor
    //   9793: goto -> 9804
    //   9796: ldc2_w 187986427
    //   9799: l2i
    //   9800: ldc_w 1222247337
    //   9803: ixor
    //   9804: ldc2_w -1789500430
    //   9807: l2i
    //   9808: ldc_w -2077598259
    //   9811: ixor
    //   9812: ixor
    //   9813: lookupswitch default -> 10676, -1765610191 -> 9796, 1385319533 -> 9840
    //   9840: goto -> 9844
    //   9843: athrow
    //   9844: invokevirtual toString : ()Ljava/lang/String;
    //   9847: goto -> 9851
    //   9850: athrow
    //   9851: getstatic Perryc.1 : I
    //   9854: ifeq -> 9868
    //   9857: ldc2_w 376094438
    //   9860: l2i
    //   9861: ldc_w -1453583558
    //   9864: ixor
    //   9865: goto -> 9876
    //   9868: ldc2_w -528523840
    //   9871: l2i
    //   9872: ldc_w 1139733397
    //   9875: ixor
    //   9876: ldc2_w -2077951675
    //   9879: l2i
    //   9880: ldc_w 1914517318
    //   9883: ixor
    //   9884: ixor
    //   9885: lookupswitch default -> 9912, 271677011 -> 9868, 1225745375 -> 10842
    //   9912: aload_0
    //   9913: getstatic Perryc.1 : I
    //   9916: ifeq -> 9930
    //   9919: ldc2_w 1901694704
    //   9922: l2i
    //   9923: ldc_w -1934273884
    //   9926: ixor
    //   9927: goto -> 9938
    //   9930: ldc2_w 2068790065
    //   9933: l2i
    //   9934: ldc_w 1846196528
    //   9937: ixor
    //   9938: ldc2_w -984047508
    //   9941: l2i
    //   9942: ldc_w 664139174
    //   9945: ixor
    //   9946: ixor
    //   9947: lookupswitch default -> 9972, 522291614 -> 10872, 1641226884 -> 9930
    //   9972: getfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9975: getstatic Perryc.c : I
    //   9978: iflt -> 9992
    //   9981: ldc2_w 743587805
    //   9984: l2i
    //   9985: ldc_w -1410567007
    //   9988: ixor
    //   9989: goto -> 10000
    //   9992: ldc2_w -1007405337
    //   9995: l2i
    //   9996: ldc_w -1176846989
    //   9999: ixor
    //   10000: ldc2_w -310580508
    //   10003: l2i
    //   10004: ldc_w 309438913
    //   10007: ixor
    //   10008: ixor
    //   10009: lookupswitch default -> 10036, -986752263 -> 9992, 2024999001 -> 10648
    //   10036: goto -> 10040
    //   10039: athrow
    //   10040: invokevirtual getValue : ()Ljava/lang/Object;
    //   10043: goto -> 10047
    //   10046: athrow
    //   10047: checkcast java/lang/Integer
    //   10050: getstatic Perryc.0 : I
    //   10053: ifle -> 10067
    //   10056: ldc2_w -1277930575
    //   10059: l2i
    //   10060: ldc_w -1493332929
    //   10063: ixor
    //   10064: goto -> 10075
    //   10067: ldc2_w -1282218744
    //   10070: l2i
    //   10071: ldc_w -1195107852
    //   10074: ixor
    //   10075: ldc2_w 1428511171
    //   10078: l2i
    //   10079: ldc_w -732824379
    //   10082: ixor
    //   10083: ixor
    //   10084: lookupswitch default -> 10112, -1805813112 -> 10764, -135669120 -> 10067
    //   10112: goto -> 10116
    //   10115: athrow
    //   10116: invokevirtual intValue : ()I
    //   10119: goto -> 10123
    //   10122: athrow
    //   10123: i2f
    //   10124: getstatic Perryc.c : I
    //   10127: iflt -> 10141
    //   10130: ldc2_w 54258028
    //   10133: l2i
    //   10134: ldc_w -1473433457
    //   10137: ixor
    //   10138: goto -> 10149
    //   10141: ldc2_w 1266304173
    //   10144: l2i
    //   10145: ldc_w 101360936
    //   10148: ixor
    //   10149: ldc2_w -1820292891
    //   10152: l2i
    //   10153: ldc_w 1015937377
    //   10156: ixor
    //   10157: ixor
    //   10158: lookupswitch default -> 10184, 68921447 -> 10804, 1268973251 -> 10141
    //   10184: aload_0
    //   10185: getstatic Perryc.1 : I
    //   10188: ifeq -> 10202
    //   10191: ldc2_w 1208250123
    //   10194: l2i
    //   10195: ldc_w 720493041
    //   10198: ixor
    //   10199: goto -> 10210
    //   10202: ldc2_w 226895512
    //   10205: l2i
    //   10206: ldc_w 1236974193
    //   10209: ixor
    //   10210: ldc2_w -210163273
    //   10213: l2i
    //   10214: ldc_w 1559729290
    //   10217: ixor
    //   10218: ixor
    //   10219: lookupswitch default -> 10244, -847574073 -> 10684, -98243542 -> 10202
    //   10244: getfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10247: getstatic Perryc.1 : I
    //   10250: ifeq -> 10264
    //   10253: ldc2_w 1101351864
    //   10256: l2i
    //   10257: ldc_w -794234505
    //   10260: ixor
    //   10261: goto -> 10272
    //   10264: ldc2_w -1642146575
    //   10267: l2i
    //   10268: ldc_w 1652703286
    //   10271: ixor
    //   10272: ldc2_w 885723327
    //   10275: l2i
    //   10276: ldc_w -2026283298
    //   10279: ixor
    //   10280: ixor
    //   10281: lookupswitch default -> 10308, 587199662 -> 10798, 1745393073 -> 10264
    //   10308: goto -> 10312
    //   10311: athrow
    //   10312: invokevirtual getValue : ()Ljava/lang/Object;
    //   10315: goto -> 10319
    //   10318: athrow
    //   10319: checkcast java/lang/Integer
    //   10322: getstatic Perryc.1 : I
    //   10325: ifeq -> 10339
    //   10328: ldc2_w -1874120465
    //   10331: l2i
    //   10332: ldc_w -1072615900
    //   10335: ixor
    //   10336: goto -> 10347
    //   10339: ldc2_w 1178583006
    //   10342: l2i
    //   10343: ldc_w -7184963
    //   10346: ixor
    //   10347: ldc2_w 197103187
    //   10350: l2i
    //   10351: ldc_w -1238588003
    //   10354: ixor
    //   10355: ixor
    //   10356: lookupswitch default -> 10384, -513382927 -> 10339, -305580795 -> 10760
    //   10384: goto -> 10388
    //   10387: athrow
    //   10388: invokevirtual intValue : ()I
    //   10391: goto -> 10395
    //   10394: athrow
    //   10395: ldc2_w 4222674
    //   10398: l2i
    //   10399: ldc_w 4222673
    //   10402: ixor
    //   10403: iadd
    //   10404: i2f
    //   10405: getstatic Perryc.0 : I
    //   10408: ifle -> 10422
    //   10411: ldc2_w 367595757
    //   10414: l2i
    //   10415: ldc_w 296075856
    //   10418: ixor
    //   10419: goto -> 10430
    //   10422: ldc2_w -1939523339
    //   10425: l2i
    //   10426: ldc_w 1793671932
    //   10429: ixor
    //   10430: ldc2_w 3516288
    //   10433: l2i
    //   10434: ldc_w -1220116867
    //   10437: ixor
    //   10438: ixor
    //   10439: lookupswitch default -> 10464, -1287713984 -> 10836, 1243249911 -> 10422
    //   10464: aload_0
    //   10465: getstatic Perryc.0 : I
    //   10468: ifle -> 10482
    //   10471: ldc2_w 1100328363
    //   10474: l2i
    //   10475: ldc_w -1833705179
    //   10478: ixor
    //   10479: goto -> 10490
    //   10482: ldc2_w 457330732
    //   10485: l2i
    //   10486: ldc_w -652598181
    //   10489: ixor
    //   10490: ldc2_w -274357145
    //   10493: l2i
    //   10494: ldc_w -9542457
    //   10497: ixor
    //   10498: ixor
    //   10499: lookupswitch default -> 10524, -2047454946 -> 10482, -1007842258 -> 10708
    //   10524: getfield color1 : I
    //   10527: ldc2_w 204823639
    //   10530: l2i
    //   10531: ldc_w 204823638
    //   10534: ixor
    //   10535: getstatic Perryc.c : I
    //   10538: iflt -> 10552
    //   10541: ldc2_w 422894949
    //   10544: l2i
    //   10545: ldc_w 606958209
    //   10548: ixor
    //   10549: goto -> 10560
    //   10552: ldc2_w -2000704963
    //   10555: l2i
    //   10556: ldc_w 623261201
    //   10559: ixor
    //   10560: ldc2_w -47478879
    //   10563: l2i
    //   10564: ldc_w -653310422
    //   10567: ixor
    //   10568: ixor
    //   10569: lookupswitch default -> 10596, 285915927 -> 10552, 423456367 -> 10774
    //   10596: goto -> 10600
    //   10599: athrow
    //   10600: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   10603: goto -> 10607
    //   10606: athrow
    //   10607: return
    //   10608: aconst_null
    //   10609: athrow
    //   10610: aconst_null
    //   10611: athrow
    //   10612: aconst_null
    //   10613: athrow
    //   10614: aconst_null
    //   10615: athrow
    //   10616: aconst_null
    //   10617: athrow
    //   10618: aconst_null
    //   10619: athrow
    //   10620: aconst_null
    //   10621: athrow
    //   10622: aconst_null
    //   10623: athrow
    //   10624: aconst_null
    //   10625: athrow
    //   10626: aconst_null
    //   10627: athrow
    //   10628: aconst_null
    //   10629: athrow
    //   10630: aconst_null
    //   10631: athrow
    //   10632: aconst_null
    //   10633: athrow
    //   10634: aconst_null
    //   10635: athrow
    //   10636: aconst_null
    //   10637: athrow
    //   10638: aconst_null
    //   10639: athrow
    //   10640: aconst_null
    //   10641: athrow
    //   10642: aconst_null
    //   10643: athrow
    //   10644: aconst_null
    //   10645: athrow
    //   10646: aconst_null
    //   10647: athrow
    //   10648: aconst_null
    //   10649: athrow
    //   10650: aconst_null
    //   10651: athrow
    //   10652: aconst_null
    //   10653: athrow
    //   10654: aconst_null
    //   10655: athrow
    //   10656: aconst_null
    //   10657: athrow
    //   10658: aconst_null
    //   10659: athrow
    //   10660: aconst_null
    //   10661: athrow
    //   10662: aconst_null
    //   10663: athrow
    //   10664: aconst_null
    //   10665: athrow
    //   10666: aconst_null
    //   10667: athrow
    //   10668: aconst_null
    //   10669: athrow
    //   10670: aconst_null
    //   10671: athrow
    //   10672: aconst_null
    //   10673: athrow
    //   10674: aconst_null
    //   10675: athrow
    //   10676: aconst_null
    //   10677: athrow
    //   10678: aconst_null
    //   10679: athrow
    //   10680: aconst_null
    //   10681: athrow
    //   10682: aconst_null
    //   10683: athrow
    //   10684: aconst_null
    //   10685: athrow
    //   10686: aconst_null
    //   10687: athrow
    //   10688: aconst_null
    //   10689: athrow
    //   10690: aconst_null
    //   10691: athrow
    //   10692: aconst_null
    //   10693: athrow
    //   10694: aconst_null
    //   10695: athrow
    //   10696: aconst_null
    //   10697: athrow
    //   10698: aconst_null
    //   10699: athrow
    //   10700: aconst_null
    //   10701: athrow
    //   10702: aconst_null
    //   10703: athrow
    //   10704: aconst_null
    //   10705: athrow
    //   10706: aconst_null
    //   10707: athrow
    //   10708: aconst_null
    //   10709: athrow
    //   10710: aconst_null
    //   10711: athrow
    //   10712: aconst_null
    //   10713: athrow
    //   10714: aconst_null
    //   10715: athrow
    //   10716: aconst_null
    //   10717: athrow
    //   10718: aconst_null
    //   10719: athrow
    //   10720: aconst_null
    //   10721: athrow
    //   10722: aconst_null
    //   10723: athrow
    //   10724: aconst_null
    //   10725: athrow
    //   10726: aconst_null
    //   10727: athrow
    //   10728: aconst_null
    //   10729: athrow
    //   10730: aconst_null
    //   10731: athrow
    //   10732: aconst_null
    //   10733: athrow
    //   10734: aconst_null
    //   10735: athrow
    //   10736: aconst_null
    //   10737: athrow
    //   10738: aconst_null
    //   10739: athrow
    //   10740: aconst_null
    //   10741: athrow
    //   10742: aconst_null
    //   10743: athrow
    //   10744: aconst_null
    //   10745: athrow
    //   10746: aconst_null
    //   10747: athrow
    //   10748: aconst_null
    //   10749: athrow
    //   10750: aconst_null
    //   10751: athrow
    //   10752: aconst_null
    //   10753: athrow
    //   10754: aconst_null
    //   10755: athrow
    //   10756: aconst_null
    //   10757: athrow
    //   10758: aconst_null
    //   10759: athrow
    //   10760: aconst_null
    //   10761: athrow
    //   10762: aconst_null
    //   10763: athrow
    //   10764: aconst_null
    //   10765: athrow
    //   10766: aconst_null
    //   10767: athrow
    //   10768: aconst_null
    //   10769: athrow
    //   10770: aconst_null
    //   10771: athrow
    //   10772: aconst_null
    //   10773: athrow
    //   10774: aconst_null
    //   10775: athrow
    //   10776: aconst_null
    //   10777: athrow
    //   10778: aconst_null
    //   10779: athrow
    //   10780: aconst_null
    //   10781: athrow
    //   10782: aconst_null
    //   10783: athrow
    //   10784: aconst_null
    //   10785: athrow
    //   10786: aconst_null
    //   10787: athrow
    //   10788: aconst_null
    //   10789: athrow
    //   10790: aconst_null
    //   10791: athrow
    //   10792: aconst_null
    //   10793: athrow
    //   10794: aconst_null
    //   10795: athrow
    //   10796: aconst_null
    //   10797: athrow
    //   10798: aconst_null
    //   10799: athrow
    //   10800: aconst_null
    //   10801: athrow
    //   10802: aconst_null
    //   10803: athrow
    //   10804: aconst_null
    //   10805: athrow
    //   10806: aconst_null
    //   10807: athrow
    //   10808: aconst_null
    //   10809: athrow
    //   10810: aconst_null
    //   10811: athrow
    //   10812: aconst_null
    //   10813: athrow
    //   10814: aconst_null
    //   10815: athrow
    //   10816: aconst_null
    //   10817: athrow
    //   10818: aconst_null
    //   10819: athrow
    //   10820: aconst_null
    //   10821: athrow
    //   10822: aconst_null
    //   10823: athrow
    //   10824: aconst_null
    //   10825: athrow
    //   10826: aconst_null
    //   10827: athrow
    //   10828: aconst_null
    //   10829: athrow
    //   10830: aconst_null
    //   10831: athrow
    //   10832: aconst_null
    //   10833: athrow
    //   10834: aconst_null
    //   10835: athrow
    //   10836: aconst_null
    //   10837: athrow
    //   10838: aconst_null
    //   10839: athrow
    //   10840: aconst_null
    //   10841: athrow
    //   10842: aconst_null
    //   10843: athrow
    //   10844: aconst_null
    //   10845: athrow
    //   10846: aconst_null
    //   10847: athrow
    //   10848: aconst_null
    //   10849: athrow
    //   10850: aconst_null
    //   10851: athrow
    //   10852: aconst_null
    //   10853: athrow
    //   10854: aconst_null
    //   10855: athrow
    //   10856: aconst_null
    //   10857: athrow
    //   10858: aconst_null
    //   10859: athrow
    //   10860: aconst_null
    //   10861: athrow
    //   10862: aconst_null
    //   10863: athrow
    //   10864: aconst_null
    //   10865: athrow
    //   10866: aconst_null
    //   10867: athrow
    //   10868: aconst_null
    //   10869: athrow
    //   10870: aconst_null
    //   10871: athrow
    //   10872: aconst_null
    //   10873: athrow
    //   10874: aconst_null
    //   10875: athrow
    //   10876: aconst_null
    //   10877: athrow
    //   10878: aconst_null
    //   10879: athrow
    //   10880: aconst_null
    //   10881: athrow
    //   10882: aconst_null
    //   10883: athrow
    //   10884: aconst_null
    //   10885: athrow
    //   10886: aconst_null
    //   10887: athrow
    //   10888: aconst_null
    //   10889: athrow
    //   10890: aconst_null
    //   10891: athrow
    //   10892: aconst_null
    //   10893: athrow
    //   10894: aconst_null
    //   10895: athrow
    //   10896: aconst_null
    //   10897: athrow
    //   10898: aconst_null
    //   10899: athrow
    //   10900: aconst_null
    //   10901: athrow
    //   10902: aconst_null
    //   10903: athrow
    //   10904: aconst_null
    //   10905: athrow
    //   10906: aconst_null
    //   10907: athrow
    //   10908: aconst_null
    //   10909: athrow
    //   10910: pop
    //   10911: goto -> 24
    //   10914: pop
    //   10915: aconst_null
    //   10916: goto -> 10910
    //   10919: dup
    //   10920: ifnull -> 10910
    //   10923: checkcast java/lang/Throwable
    //   10926: athrow
    //   10927: dup
    //   10928: ifnull -> 10914
    //   10931: checkcast java/lang/Throwable
    //   10934: athrow
    //   10935: aconst_null
    //   10936: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	10584	0	this	Lbigname/zprestige/webhack/features/modules/Hud/CompactInfo;
    //   24	10584	1	event	Lbigname/zprestige/webhack/event/events/Render2DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	10919	finally
    //   203	210	210	finally
    //   203	210	210	java/lang/IndexOutOfBoundsException
    //   203	210	3	finally
    //   204	210	203	java/lang/IllegalArgumentException
    //   204	210	203	java/lang/NullPointerException
    //   275	282	282	finally
    //   275	282	275	java/lang/UnsupportedOperationException
    //   275	282	3	finally
    //   275	282	282	java/lang/EnumConstantNotPresentException
    //   276	282	275	java/lang/StringIndexOutOfBoundsException
    //   451	458	458	finally
    //   451	458	458	java/util/ConcurrentModificationException
    //   451	458	451	finally
    //   451	458	451	finally
    //   452	458	3	finally
    //   580	586	586	finally
    //   580	586	586	java/lang/NumberFormatException
    //   580	586	586	java/lang/EnumConstantNotPresentException
    //   580	586	3	java/lang/NullPointerException
    //   580	586	586	java/lang/ArithmeticException
    //   651	658	658	finally
    //   651	658	3	finally
    //   651	658	3	java/lang/ArithmeticException
    //   652	658	651	finally
    //   652	658	658	finally
    //   720	726	726	finally
    //   720	726	726	finally
    //   720	726	3	java/lang/NumberFormatException
    //   720	726	3	java/lang/UnsupportedOperationException
    //   720	726	3	finally
    //   787	794	794	finally
    //   787	794	787	java/lang/NegativeArraySizeException
    //   787	794	3	java/lang/ArrayIndexOutOfBoundsException
    //   788	794	787	java/lang/IllegalArgumentException
    //   788	794	3	finally
    //   979	986	986	finally
    //   979	986	3	finally
    //   979	986	979	java/lang/IllegalArgumentException
    //   980	986	986	java/lang/NegativeArraySizeException
    //   980	986	979	java/lang/NullPointerException
    //   1047	1054	1054	finally
    //   1047	1054	1047	finally
    //   1048	1054	1054	java/lang/ArithmeticException
    //   1048	1054	1047	finally
    //   1048	1054	3	finally
    //   1307	1314	1314	finally
    //   1307	1314	1314	finally
    //   1308	1314	1307	java/util/NoSuchElementException
    //   1308	1314	1307	finally
    //   1308	1314	1307	java/lang/ClassCastException
    //   1383	1390	1390	finally
    //   1383	1390	1383	java/util/NoSuchElementException
    //   1383	1390	1383	java/lang/RuntimeException
    //   1384	1390	1390	finally
    //   1384	1390	3	java/lang/StringIndexOutOfBoundsException
    //   1580	1586	1586	finally
    //   1580	1586	1586	java/lang/ClassCastException
    //   1580	1586	1586	java/lang/StringIndexOutOfBoundsException
    //   1580	1586	1586	finally
    //   1580	1586	3	finally
    //   1655	1662	1662	finally
    //   1655	1662	1655	java/lang/ArrayIndexOutOfBoundsException
    //   1655	1662	1662	finally
    //   1655	1662	1655	java/lang/StringIndexOutOfBoundsException
    //   1656	1662	1655	java/lang/IllegalArgumentException
    //   1776	1782	1782	finally
    //   1776	1782	1782	java/lang/ArrayIndexOutOfBoundsException
    //   1776	1782	1782	java/lang/ClassCastException
    //   1776	1782	1782	java/lang/ArithmeticException
    //   1776	1782	3	java/lang/AssertionError
    //   1847	1854	1854	finally
    //   1847	1854	1847	java/lang/ArrayIndexOutOfBoundsException
    //   1848	1854	1854	finally
    //   1848	1854	3	finally
    //   1848	1854	1847	java/util/NoSuchElementException
    //   2043	2050	2050	finally
    //   2043	2050	2043	java/lang/NegativeArraySizeException
    //   2043	2050	2043	java/lang/AssertionError
    //   2044	2050	2043	java/lang/ArrayIndexOutOfBoundsException
    //   2044	2050	3	java/lang/NumberFormatException
    //   2119	2126	2126	finally
    //   2119	2126	2126	java/lang/IndexOutOfBoundsException
    //   2119	2126	2119	finally
    //   2119	2126	3	finally
    //   2120	2126	3	java/lang/IllegalArgumentException
    //   2327	2334	2334	finally
    //   2327	2334	2327	java/lang/NegativeArraySizeException
    //   2327	2334	2327	finally
    //   2328	2334	2327	java/util/NoSuchElementException
    //   2328	2334	3	java/util/ConcurrentModificationException
    //   2403	2410	2410	finally
    //   2403	2410	2403	java/lang/ClassCastException
    //   2404	2410	2403	finally
    //   2404	2410	2403	finally
    //   2404	2410	2403	finally
    //   2607	2614	2614	finally
    //   2607	2614	2614	java/lang/NullPointerException
    //   2607	2614	3	finally
    //   2607	2614	2607	java/lang/StringIndexOutOfBoundsException
    //   2608	2614	2614	finally
    //   2684	2690	2690	finally
    //   2684	2690	2690	java/lang/NullPointerException
    //   2684	2690	3	java/lang/StringIndexOutOfBoundsException
    //   2684	2690	2690	finally
    //   2684	2690	2690	java/lang/EnumConstantNotPresentException
    //   2896	2902	2902	finally
    //   2896	2902	2902	java/lang/NegativeArraySizeException
    //   2896	2902	3	finally
    //   2896	2902	2902	finally
    //   2896	2902	2902	finally
    //   2971	2978	2978	finally
    //   2971	2978	2978	finally
    //   2971	2978	2971	java/lang/ClassCastException
    //   2972	2978	2971	finally
    //   2972	2978	2978	java/lang/UnsupportedOperationException
    //   3291	3298	3298	finally
    //   3291	3298	3	finally
    //   3291	3298	3	finally
    //   3292	3298	3	finally
    //   3292	3298	3291	java/util/NoSuchElementException
    //   3491	3498	3498	finally
    //   3491	3498	3498	finally
    //   3491	3498	3	java/lang/ArrayIndexOutOfBoundsException
    //   3491	3498	3	finally
    //   3492	3498	3491	finally
    //   3567	3574	3574	finally
    //   3567	3574	3	finally
    //   3568	3574	3567	java/lang/IllegalArgumentException
    //   3568	3574	3574	java/lang/ArrayIndexOutOfBoundsException
    //   3568	3574	3567	java/lang/ArithmeticException
    //   3639	3646	3646	finally
    //   3639	3646	3639	java/util/NoSuchElementException
    //   3639	3646	3646	java/lang/ArrayIndexOutOfBoundsException
    //   3640	3646	3639	java/lang/UnsupportedOperationException
    //   3640	3646	3	finally
    //   3712	3718	3718	finally
    //   3712	3718	3	finally
    //   3712	3718	3	java/lang/AssertionError
    //   3712	3718	3	java/lang/NegativeArraySizeException
    //   3712	3718	3	finally
    //   3783	3790	3790	finally
    //   3783	3790	3783	finally
    //   3783	3790	3	java/lang/IndexOutOfBoundsException
    //   3783	3790	3790	java/lang/IllegalArgumentException
    //   3783	3790	3790	java/lang/EnumConstantNotPresentException
    //   3860	3866	3866	finally
    //   3860	3866	3	finally
    //   3860	3866	3	java/lang/NegativeArraySizeException
    //   3860	3866	3866	java/lang/NumberFormatException
    //   3860	3866	3866	java/lang/ArithmeticException
    //   3931	3938	3938	finally
    //   3931	3938	3931	java/lang/IllegalArgumentException
    //   3932	3938	3931	finally
    //   3932	3938	3	finally
    //   3932	3938	3931	finally
    //   4003	4010	4010	finally
    //   4003	4010	4010	java/util/ConcurrentModificationException
    //   4003	4010	4010	java/util/ConcurrentModificationException
    //   4003	4010	4003	finally
    //   4003	4010	4010	finally
    //   4075	4082	4082	finally
    //   4075	4082	4075	java/lang/StringIndexOutOfBoundsException
    //   4076	4082	4075	java/lang/UnsupportedOperationException
    //   4076	4082	3	java/lang/IndexOutOfBoundsException
    //   4076	4082	4082	finally
    //   4151	4158	4158	finally
    //   4151	4158	4158	java/lang/ArithmeticException
    //   4151	4158	4158	finally
    //   4152	4158	4151	java/lang/IllegalStateException
    //   4152	4158	4158	finally
    //   4224	4230	4230	finally
    //   4224	4230	3	finally
    //   4224	4230	4230	java/lang/EnumConstantNotPresentException
    //   4224	4230	3	finally
    //   4224	4230	4230	finally
    //   4296	4302	4302	finally
    //   4296	4302	4302	finally
    //   4296	4302	4302	java/lang/EnumConstantNotPresentException
    //   4296	4302	3	finally
    //   4296	4302	4302	java/lang/AssertionError
    //   4367	4374	4374	finally
    //   4367	4374	4367	java/lang/NullPointerException
    //   4368	4374	4374	finally
    //   4368	4374	3	java/lang/NullPointerException
    //   4368	4374	4374	java/lang/NumberFormatException
    //   4444	4450	4450	finally
    //   4444	4450	3	finally
    //   4444	4450	3	finally
    //   4444	4450	4450	java/lang/IllegalArgumentException
    //   4444	4450	4450	finally
    //   4516	4522	4522	finally
    //   4516	4522	3	java/util/ConcurrentModificationException
    //   4516	4522	3	java/lang/UnsupportedOperationException
    //   4516	4522	4522	java/lang/NullPointerException
    //   4516	4522	4522	finally
    //   4587	4594	4594	finally
    //   4587	4594	4594	finally
    //   4587	4594	4587	java/lang/NumberFormatException
    //   4587	4594	3	java/lang/EnumConstantNotPresentException
    //   4588	4594	4587	java/lang/NullPointerException
    //   4783	4790	4790	finally
    //   4783	4790	4790	finally
    //   4784	4790	4783	java/lang/EnumConstantNotPresentException
    //   4784	4790	4783	java/lang/IndexOutOfBoundsException
    //   4784	4790	4790	java/lang/UnsupportedOperationException
    //   4859	4866	4866	finally
    //   4859	4866	3	java/lang/NegativeArraySizeException
    //   4859	4866	4866	java/lang/NumberFormatException
    //   4860	4866	4859	java/lang/ArithmeticException
    //   4860	4866	4859	java/lang/EnumConstantNotPresentException
    //   5056	5062	5062	finally
    //   5056	5062	3	java/lang/NumberFormatException
    //   5056	5062	3	java/lang/IllegalStateException
    //   5056	5062	5062	java/lang/AssertionError
    //   5056	5062	5062	java/lang/NumberFormatException
    //   5132	5138	5138	finally
    //   5132	5138	5138	java/lang/StringIndexOutOfBoundsException
    //   5132	5138	5138	finally
    //   5132	5138	5138	finally
    //   5132	5138	3	finally
    //   5343	5350	5350	finally
    //   5343	5350	3	finally
    //   5343	5350	5343	java/lang/NegativeArraySizeException
    //   5344	5350	5350	finally
    //   5344	5350	3	finally
    //   5603	5610	5610	finally
    //   5603	5610	3	finally
    //   5603	5610	5603	finally
    //   5604	5610	3	java/lang/RuntimeException
    //   5604	5610	5610	java/lang/ArrayIndexOutOfBoundsException
    //   5679	5686	5686	finally
    //   5679	5686	5686	finally
    //   5679	5686	5679	finally
    //   5680	5686	5686	java/lang/IllegalStateException
    //   5680	5686	3	java/lang/EnumConstantNotPresentException
    //   5875	5882	5882	finally
    //   5875	5882	3	java/lang/NegativeArraySizeException
    //   5875	5882	3	java/lang/NumberFormatException
    //   5875	5882	5882	java/lang/StringIndexOutOfBoundsException
    //   5876	5882	5875	finally
    //   5951	5958	5958	finally
    //   5951	5958	5951	java/util/ConcurrentModificationException
    //   5951	5958	5958	java/lang/UnsupportedOperationException
    //   5951	5958	5951	java/lang/ClassCastException
    //   5952	5958	3	java/lang/ClassCastException
    //   6147	6154	6154	finally
    //   6147	6154	6147	java/lang/AssertionError
    //   6147	6154	3	java/lang/ArrayIndexOutOfBoundsException
    //   6147	6154	3	java/lang/IllegalStateException
    //   6148	6154	6147	java/lang/EnumConstantNotPresentException
    //   6223	6230	6230	finally
    //   6223	6230	6223	finally
    //   6223	6230	6230	finally
    //   6224	6230	6230	finally
    //   6224	6230	6230	java/lang/ArithmeticException
    //   6303	6310	6310	finally
    //   6303	6310	6303	finally
    //   6303	6310	6303	java/lang/EnumConstantNotPresentException
    //   6303	6310	6303	java/lang/ClassCastException
    //   6304	6310	6303	java/lang/NumberFormatException
    //   6563	6570	6570	finally
    //   6563	6570	6570	finally
    //   6563	6570	6563	java/lang/NumberFormatException
    //   6563	6570	6563	java/lang/IllegalStateException
    //   6564	6570	3	finally
    //   6639	6646	6646	finally
    //   6639	6646	6639	finally
    //   6640	6646	6639	finally
    //   6640	6646	3	finally
    //   6640	6646	3	java/util/NoSuchElementException
    //   6835	6842	6842	finally
    //   6835	6842	6842	finally
    //   6835	6842	3	finally
    //   6835	6842	6835	finally
    //   6836	6842	6842	finally
    //   6911	6918	6918	finally
    //   6911	6918	3	finally
    //   6912	6918	3	java/lang/IllegalStateException
    //   6912	6918	6911	finally
    //   6912	6918	6918	finally
    //   7031	7038	7038	finally
    //   7031	7038	3	java/util/NoSuchElementException
    //   7031	7038	3	java/lang/EnumConstantNotPresentException
    //   7032	7038	7031	java/lang/RuntimeException
    //   7032	7038	7031	java/lang/NullPointerException
    //   7103	7110	7110	finally
    //   7103	7110	3	finally
    //   7103	7110	7110	java/lang/ArithmeticException
    //   7104	7110	7103	java/lang/EnumConstantNotPresentException
    //   7104	7110	3	finally
    //   7299	7306	7306	finally
    //   7299	7306	3	java/lang/EnumConstantNotPresentException
    //   7299	7306	7299	finally
    //   7299	7306	7299	java/lang/UnsupportedOperationException
    //   7300	7306	7306	finally
    //   7375	7382	7382	finally
    //   7375	7382	7375	java/lang/ArithmeticException
    //   7375	7382	3	finally
    //   7375	7382	7382	finally
    //   7376	7382	3	finally
    //   7583	7590	7590	finally
    //   7583	7590	3	java/lang/EnumConstantNotPresentException
    //   7583	7590	7590	java/lang/NumberFormatException
    //   7583	7590	7583	finally
    //   7584	7590	7583	java/lang/NegativeArraySizeException
    //   7660	7666	7666	finally
    //   7660	7666	7666	java/lang/IllegalStateException
    //   7660	7666	3	finally
    //   7660	7666	3	java/util/ConcurrentModificationException
    //   7660	7666	3	finally
    //   7863	7870	7870	finally
    //   7863	7870	7863	java/lang/RuntimeException
    //   7864	7870	7863	finally
    //   7864	7870	7870	java/lang/IllegalStateException
    //   7864	7870	7863	java/lang/NegativeArraySizeException
    //   7939	7946	7946	finally
    //   7939	7946	7939	finally
    //   7939	7946	7946	java/lang/StringIndexOutOfBoundsException
    //   7940	7946	7946	java/lang/IndexOutOfBoundsException
    //   7940	7946	7946	java/lang/UnsupportedOperationException
    //   8151	8158	8158	finally
    //   8151	8158	8151	java/lang/IllegalStateException
    //   8152	8158	8158	java/lang/UnsupportedOperationException
    //   8152	8158	8158	finally
    //   8152	8158	3	finally
    //   8227	8234	8234	finally
    //   8227	8234	8227	java/lang/AssertionError
    //   8228	8234	3	finally
    //   8228	8234	8234	finally
    //   8228	8234	8227	java/lang/IndexOutOfBoundsException
    //   8548	8554	8554	finally
    //   8548	8554	3	java/lang/NullPointerException
    //   8548	8554	8554	finally
    //   8548	8554	8554	finally
    //   8548	8554	3	finally
    //   8747	8754	8754	finally
    //   8747	8754	8747	java/lang/NumberFormatException
    //   8747	8754	8747	finally
    //   8748	8754	8747	finally
    //   8748	8754	3	java/lang/IllegalArgumentException
    //   8823	8830	8830	finally
    //   8823	8830	8823	java/lang/UnsupportedOperationException
    //   8823	8830	8830	java/lang/RuntimeException
    //   8824	8830	8823	finally
    //   8824	8830	8823	java/lang/UnsupportedOperationException
    //   8895	8902	8902	finally
    //   8895	8902	3	java/lang/IllegalStateException
    //   8895	8902	8902	finally
    //   8895	8902	8895	finally
    //   8896	8902	8902	finally
    //   8967	8974	8974	finally
    //   8967	8974	8967	finally
    //   8967	8974	3	finally
    //   8968	8974	8967	java/util/ConcurrentModificationException
    //   8968	8974	3	finally
    //   9040	9046	9046	finally
    //   9040	9046	3	finally
    //   9040	9046	3	finally
    //   9040	9046	3	finally
    //   9040	9046	9046	finally
    //   9115	9122	9122	finally
    //   9115	9122	9115	finally
    //   9115	9122	9115	java/lang/NegativeArraySizeException
    //   9116	9122	3	java/lang/EnumConstantNotPresentException
    //   9116	9122	9115	java/lang/IllegalArgumentException
    //   9187	9194	9194	finally
    //   9187	9194	9187	java/lang/StringIndexOutOfBoundsException
    //   9187	9194	3	java/lang/ClassCastException
    //   9188	9194	3	java/lang/EnumConstantNotPresentException
    //   9188	9194	9194	java/lang/AssertionError
    //   9259	9266	9266	finally
    //   9259	9266	9259	finally
    //   9260	9266	3	finally
    //   9260	9266	9266	java/lang/AssertionError
    //   9260	9266	9259	finally
    //   9331	9338	9338	finally
    //   9332	9338	3	finally
    //   9332	9338	9331	finally
    //   9332	9338	9338	java/lang/NumberFormatException
    //   9332	9338	9338	java/lang/IllegalArgumentException
    //   9407	9414	9414	finally
    //   9407	9414	3	finally
    //   9407	9414	3	java/util/ConcurrentModificationException
    //   9408	9414	3	finally
    //   9408	9414	9407	finally
    //   9479	9486	9486	finally
    //   9479	9486	9486	java/lang/UnsupportedOperationException
    //   9479	9486	9479	java/lang/IllegalStateException
    //   9479	9486	3	finally
    //   9480	9486	9486	finally
    //   9551	9558	9558	finally
    //   9552	9558	3	java/lang/NumberFormatException
    //   9552	9558	3	java/lang/NumberFormatException
    //   9552	9558	9551	java/lang/UnsupportedOperationException
    //   9552	9558	9551	finally
    //   9624	9630	9630	finally
    //   9624	9630	9630	java/lang/StringIndexOutOfBoundsException
    //   9624	9630	3	finally
    //   9624	9630	3	finally
    //   9624	9630	9630	java/lang/EnumConstantNotPresentException
    //   9700	9706	9706	finally
    //   9700	9706	3	java/lang/ArrayIndexOutOfBoundsException
    //   9700	9706	9706	java/lang/UnsupportedOperationException
    //   9700	9706	3	java/lang/IndexOutOfBoundsException
    //   9700	9706	3	finally
    //   9771	9778	9778	finally
    //   9771	9778	9771	java/lang/UnsupportedOperationException
    //   9772	9778	9778	java/util/NoSuchElementException
    //   9772	9778	9778	java/lang/ClassCastException
    //   9772	9778	3	finally
    //   9843	9850	9850	finally
    //   9843	9850	9843	java/lang/IllegalStateException
    //   9844	9850	3	finally
    //   9844	9850	9843	finally
    //   9844	9850	3	finally
    //   10039	10046	10046	finally
    //   10039	10046	10046	java/lang/ArithmeticException
    //   10039	10046	10039	finally
    //   10040	10046	10039	java/lang/NumberFormatException
    //   10040	10046	10039	java/lang/EnumConstantNotPresentException
    //   10115	10122	10122	finally
    //   10115	10122	10122	java/util/ConcurrentModificationException
    //   10115	10122	10122	java/lang/NegativeArraySizeException
    //   10116	10122	10115	finally
    //   10116	10122	10115	finally
    //   10311	10318	10318	finally
    //   10311	10318	3	java/lang/NegativeArraySizeException
    //   10311	10318	3	java/lang/NumberFormatException
    //   10311	10318	10318	finally
    //   10312	10318	10311	finally
    //   10387	10394	10394	finally
    //   10387	10394	10394	finally
    //   10388	10394	10394	java/lang/ClassCastException
    //   10388	10394	10394	java/lang/NumberFormatException
    //   10388	10394	10387	java/lang/AssertionError
    //   10599	10606	10606	finally
    //   10599	10606	3	java/lang/UnsupportedOperationException
    //   10600	10606	10599	finally
    //   10600	10606	10599	finally
    //   10600	10606	10606	java/lang/StringIndexOutOfBoundsException
    //   10919	10927	10919	java/lang/RuntimeException
    //   10935	10937	3	finally
  }
  
  public CompactInfo() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -957359988
    //   9: l2i
    //   10: ldc_w 338097351
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1920545558
    //   20: l2i
    //   21: ldc_w -522904300
    //   24: ixor
    //   25: ldc2_w 817589370
    //   28: l2i
    //   29: ldc_w 748490988
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 3856, -1903537516 -> 60, -823176995 -> 17
    //   60: aload_0
    //   61: ldc_w '葲㌜萮㶧㏗櫮๭留蹭漮㲅'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w 1466372561
    //   73: l2i
    //   74: ldc_w -1578694111
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 317861991
    //   84: l2i
    //   85: ldc_w 385006204
    //   88: ixor
    //   89: ldc2_w -135837676
    //   92: l2i
    //   93: ldc_w -1894589610
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1904899918 -> 3900, 623113736 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '葕㌁萢㶠㏅檭๰離蹥漧㳊ਪ䦞煳ᥴ辜屋ꝣ⻮஻侲滊䛾氙큩ᣝ'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w 157305314
    //   139: l2i
    //   140: ldc_w -271980049
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1904936913
    //   150: l2i
    //   151: ldc_w 670926952
    //   154: ixor
    //   155: ldc2_w 771569280
    //   158: l2i
    //   159: ldc_w -93339407
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1389178042 -> 147, 825972348 -> 3894
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -1983736698
    //   204: l2i
    //   205: ldc_w -1324329671
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 530889987
    //   215: l2i
    //   216: ldc_w 1229983415
    //   219: ixor
    //   220: ldc2_w 1543246280
    //   223: l2i
    //   224: ldc_w -1827738813
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 3914, -1643755201 -> 256, -266323148 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1050554802
    //   262: l2i
    //   263: ldc_w -1050554801
    //   266: ixor
    //   267: ldc2_w -1390215349
    //   270: l2i
    //   271: ldc_w -1390215349
    //   274: ixor
    //   275: ldc2_w 716341122
    //   278: l2i
    //   279: ldc_w 716341122
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -437759711
    //   292: l2i
    //   293: ldc_w 575361551
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1360471417
    //   303: l2i
    //   304: ldc_w -996494382
    //   307: ixor
    //   308: ldc2_w 529097985
    //   311: l2i
    //   312: ldc_w -1438791646
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 3804, 540621704 -> 344, 1914154509 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w -984848284
    //   356: l2i
    //   357: ldc_w 1235435832
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -810970977
    //   367: l2i
    //   368: ldc_w 680570667
    //   371: ixor
    //   372: ldc2_w 313515091
    //   375: l2i
    //   376: ldc_w 711319944
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 3892, -1272638329 -> 364, -537722257 -> 408
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w -1282432909
    //   418: l2i
    //   419: ldc_w 2010831494
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -157548432
    //   429: l2i
    //   430: ldc_w -2005688226
    //   433: ixor
    //   434: ldc2_w 1061008703
    //   437: l2i
    //   438: ldc_w 1731347995
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 3910, -1671788079 -> 426, 652235530 -> 468
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '董㌒萪㶹㏔櫢๮'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w -394767215
    //   485: l2i
    //   486: ldc_w 887358507
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -2078738520
    //   496: l2i
    //   497: ldc_w 582002652
    //   500: ixor
    //   501: ldc2_w 1735713452
    //   504: l2i
    //   505: ldc_w -51794560
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 3852, 1026891608 -> 536, 1191255958 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -166048854
    //   542: l2i
    //   543: ldc_w -166048853
    //   546: ixor
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w -964347442
    //   556: l2i
    //   557: ldc_w -1703360974
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 812620285
    //   567: l2i
    //   568: ldc_w 1765352935
    //   571: ixor
    //   572: ldc2_w -887046015
    //   575: l2i
    //   576: ldc_w -1363593027
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, 735006413 -> 564, 962856896 -> 3836
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.1 : I
    //   614: ifeq -> 628
    //   617: ldc2_w -811535432
    //   620: l2i
    //   621: ldc_w 345966639
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w -1385362920
    //   631: l2i
    //   632: ldc_w 678264021
    //   635: ixor
    //   636: ldc2_w -1268979840
    //   639: l2i
    //   640: ldc_w 1355839933
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 3828, 1068721578 -> 628, 1636624624 -> 672
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.1 : I
    //   678: ifeq -> 692
    //   681: ldc2_w 1984259207
    //   684: l2i
    //   685: ldc_w 1704265902
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -1784204094
    //   695: l2i
    //   696: ldc_w -888057000
    //   699: ixor
    //   700: ldc2_w 1694770590
    //   703: l2i
    //   704: ldc_w 1023003531
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 3860, 122390927 -> 736, 1244496444 -> 692
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w 1529884345
    //   748: l2i
    //   749: ldc_w 728731246
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 1814794862
    //   759: l2i
    //   760: ldc_w 603909766
    //   763: ixor
    //   764: ldc2_w -1174561578
    //   767: l2i
    //   768: ldc_w -1541736003
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, 1408832738 -> 756, 1840825788 -> 3840
    //   800: putfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 820
    //   809: ldc2_w -1207065758
    //   812: l2i
    //   813: ldc_w -1257114285
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 850157167
    //   823: l2i
    //   824: ldc_w 425001597
    //   827: ixor
    //   828: ldc2_w 1828242039
    //   831: l2i
    //   832: ldc_w -1798053888
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 3816, -741179803 -> 864, -180915130 -> 820
    //   864: aload_0
    //   865: getstatic Perryc.1 : I
    //   868: ifeq -> 882
    //   871: ldc2_w -1210579854
    //   874: l2i
    //   875: ldc_w 1929594621
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w -509403221
    //   885: l2i
    //   886: ldc_w -863478325
    //   889: ixor
    //   890: ldc2_w 1764156601
    //   893: l2i
    //   894: ldc_w -1509242791
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 3832, -502829440 -> 924, 200765039 -> 882
    //   924: aload_0
    //   925: new bigname/zprestige/webhack/features/setting/Setting
    //   928: dup
    //   929: ldc_w '葲㌜萮㶧㏗櫮๭留蹭漮㲅ਟ'
    //   932: getstatic Perryc.0 : I
    //   935: ifle -> 949
    //   938: ldc2_w 1578755404
    //   941: l2i
    //   942: ldc_w -1932840811
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 181785410
    //   952: l2i
    //   953: ldc_w -416589099
    //   956: ixor
    //   957: ldc2_w -134536182
    //   960: l2i
    //   961: ldc_w -2073803166
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 992, -1679339987 -> 949, -1588742223 -> 3896
    //   992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   995: ldc2_w -1074060247
    //   998: l2i
    //   999: ldc_w -1074060247
    //   1002: ixor
    //   1003: getstatic Perryc.0 : I
    //   1006: ifle -> 1020
    //   1009: ldc2_w -1273266443
    //   1012: l2i
    //   1013: ldc_w -571655054
    //   1016: ixor
    //   1017: goto -> 1028
    //   1020: ldc2_w -1444848878
    //   1023: l2i
    //   1024: ldc_w -152366477
    //   1027: ixor
    //   1028: ldc2_w 483698701
    //   1031: l2i
    //   1032: ldc_w -1818534497
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 3888, -800736013 -> 1064, -424036587 -> 1020
    //   1064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1067: ldc2_w -1538548006
    //   1070: l2i
    //   1071: ldc_w -1538548006
    //   1074: ixor
    //   1075: getstatic Perryc.1 : I
    //   1078: ifeq -> 1092
    //   1081: ldc2_w -161272100
    //   1084: l2i
    //   1085: ldc_w -598426814
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w 1332905620
    //   1095: l2i
    //   1096: ldc_w -1490894854
    //   1099: ixor
    //   1100: ldc2_w 98990007
    //   1103: l2i
    //   1104: ldc_w -1565199557
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 1136, -1922756334 -> 3872, 2083996386 -> 1092
    //   1136: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1139: ldc2_w 2121035710
    //   1142: l2i
    //   1143: ldc_w 2121034630
    //   1146: ixor
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w -1640404899
    //   1156: l2i
    //   1157: ldc_w -1412204074
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 53859066
    //   1167: l2i
    //   1168: ldc_w -435757516
    //   1171: ixor
    //   1172: ldc2_w 884534687
    //   1175: l2i
    //   1176: ldc_w 1812458665
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 3912, -1114894856 -> 1208, 1834291389 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w -189807928
    //   1220: l2i
    //   1221: ldc_w -198398312
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 295813370
    //   1231: l2i
    //   1232: ldc_w 993843897
    //   1235: ixor
    //   1236: ldc2_w -970245748
    //   1239: l2i
    //   1240: ldc_w -1228578570
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 3864, 1517503289 -> 1272, 1886205226 -> 1228
    //   1272: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1275: getstatic Perryc.0 : I
    //   1278: ifle -> 1292
    //   1281: ldc2_w 1247112811
    //   1284: l2i
    //   1285: ldc_w 66219212
    //   1288: ixor
    //   1289: goto -> 1300
    //   1292: ldc2_w 1064257135
    //   1295: l2i
    //   1296: ldc_w 1419431376
    //   1299: ixor
    //   1300: ldc2_w -988766775
    //   1303: l2i
    //   1304: ldc_w -215146454
    //   1307: ixor
    //   1308: ixor
    //   1309: lookupswitch default -> 3820, 1573402204 -> 1336, 2140847940 -> 1292
    //   1336: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1339: getstatic Perryc.1 : I
    //   1342: ifeq -> 1356
    //   1345: ldc2_w -691297074
    //   1348: l2i
    //   1349: ldc_w 1347664575
    //   1352: ixor
    //   1353: goto -> 1364
    //   1356: ldc2_w -2084815759
    //   1359: l2i
    //   1360: ldc_w -1172969008
    //   1363: ixor
    //   1364: ldc2_w -245839389
    //   1367: l2i
    //   1368: ldc_w 1735016559
    //   1371: ixor
    //   1372: ixor
    //   1373: lookupswitch default -> 3808, -1348772819 -> 1400, 279615485 -> 1356
    //   1400: putfield compactX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1403: getstatic Perryc.0 : I
    //   1406: ifle -> 1420
    //   1409: ldc2_w 320319661
    //   1412: l2i
    //   1413: ldc_w -1073077621
    //   1416: ixor
    //   1417: goto -> 1428
    //   1420: ldc2_w -1866955568
    //   1423: l2i
    //   1424: ldc_w 698634701
    //   1427: ixor
    //   1428: ldc2_w 606562263
    //   1431: l2i
    //   1432: ldc_w 916824646
    //   1435: ixor
    //   1436: ixor
    //   1437: lookupswitch default -> 3876, -1415704436 -> 1464, -1046521929 -> 1420
    //   1464: aload_0
    //   1465: getstatic Perryc.c : I
    //   1468: iflt -> 1482
    //   1471: ldc2_w -621672424
    //   1474: l2i
    //   1475: ldc_w 1508311153
    //   1478: ixor
    //   1479: goto -> 1490
    //   1482: ldc2_w 1655752276
    //   1485: l2i
    //   1486: ldc_w -442657161
    //   1489: ixor
    //   1490: ldc2_w -1791285368
    //   1493: l2i
    //   1494: ldc_w 2051445138
    //   1497: ixor
    //   1498: ixor
    //   1499: lookupswitch default -> 1524, 12103443 -> 1482, 1818803827 -> 3830
    //   1524: aload_0
    //   1525: new bigname/zprestige/webhack/features/setting/Setting
    //   1528: dup
    //   1529: ldc_w '葲㌜萮㶧㏗櫮๭留蹭漮㲅ਞ'
    //   1532: getstatic Perryc.1 : I
    //   1535: ifeq -> 1549
    //   1538: ldc2_w -771264643
    //   1541: l2i
    //   1542: ldc_w 1862806073
    //   1545: ixor
    //   1546: goto -> 1557
    //   1549: ldc2_w 1041810859
    //   1552: l2i
    //   1553: ldc_w 1437847207
    //   1556: ixor
    //   1557: ldc2_w -258789525
    //   1560: l2i
    //   1561: ldc_w 2029256670
    //   1564: ixor
    //   1565: ixor
    //   1566: lookupswitch default -> 3844, -473179207 -> 1592, 896505329 -> 1549
    //   1592: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1595: ldc2_w -1164757648
    //   1598: l2i
    //   1599: ldc_w -1164757648
    //   1602: ixor
    //   1603: getstatic Perryc.0 : I
    //   1606: ifle -> 1620
    //   1609: ldc2_w -1248464040
    //   1612: l2i
    //   1613: ldc_w 1815544590
    //   1616: ixor
    //   1617: goto -> 1628
    //   1620: ldc2_w -1731944830
    //   1623: l2i
    //   1624: ldc_w 1020438394
    //   1627: ixor
    //   1628: ldc2_w -682169670
    //   1631: l2i
    //   1632: ldc_w -774705364
    //   1635: ixor
    //   1636: ixor
    //   1637: lookupswitch default -> 1664, -551094848 -> 3810, 1353976902 -> 1620
    //   1664: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1667: ldc2_w 1312949010
    //   1670: l2i
    //   1671: ldc_w 1312949010
    //   1674: ixor
    //   1675: getstatic Perryc.1 : I
    //   1678: ifeq -> 1692
    //   1681: ldc2_w -432187612
    //   1684: l2i
    //   1685: ldc_w -621967183
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w -1472011109
    //   1695: l2i
    //   1696: ldc_w 1687384863
    //   1699: ixor
    //   1700: ldc2_w -2050253343
    //   1703: l2i
    //   1704: ldc_w 2028430372
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 1736, -1040439728 -> 3850, 1878298490 -> 1692
    //   1736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1739: ldc2_w 2026271952
    //   1742: l2i
    //   1743: ldc_w 2026272450
    //   1746: ixor
    //   1747: getstatic Perryc.1 : I
    //   1750: ifeq -> 1764
    //   1753: ldc2_w 1436598331
    //   1756: l2i
    //   1757: ldc_w -2014547636
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 57975153
    //   1767: l2i
    //   1768: ldc_w 574096434
    //   1771: ixor
    //   1772: ldc2_w 608811245
    //   1775: l2i
    //   1776: ldc_w 699083513
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 1808, -1423440540 -> 1764, -542235805 -> 3814
    //   1808: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1811: getstatic Perryc.1 : I
    //   1814: ifeq -> 1828
    //   1817: ldc2_w 2127383147
    //   1820: l2i
    //   1821: ldc_w 89405726
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w 724221245
    //   1831: l2i
    //   1832: ldc_w -208913066
    //   1835: ixor
    //   1836: ldc2_w 403831275
    //   1839: l2i
    //   1840: ldc_w 100861627
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 1872, -950927438 -> 1828, 1703644197 -> 3818
    //   1872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1875: getstatic Perryc.1 : I
    //   1878: ifeq -> 1892
    //   1881: ldc2_w -1899239930
    //   1884: l2i
    //   1885: ldc_w 2100825046
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w 1456591750
    //   1895: l2i
    //   1896: ldc_w 1351625098
    //   1899: ixor
    //   1900: ldc2_w -1696809321
    //   1903: l2i
    //   1904: ldc_w 1073148464
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 3842, -1553221973 -> 1936, 1457103223 -> 1892
    //   1936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1939: getstatic Perryc.0 : I
    //   1942: ifle -> 1956
    //   1945: ldc2_w 1975435751
    //   1948: l2i
    //   1949: ldc_w 1683139464
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w 2137505389
    //   1959: l2i
    //   1960: ldc_w -21659945
    //   1963: ixor
    //   1964: ldc2_w -1232404144
    //   1967: l2i
    //   1968: ldc_w -1239791590
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 3826, -2126280208 -> 2000, 293413669 -> 1956
    //   2000: putfield compactY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2003: getstatic Perryc.1 : I
    //   2006: ifeq -> 2020
    //   2009: ldc2_w 1882150667
    //   2012: l2i
    //   2013: ldc_w -476584467
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w -792433586
    //   2023: l2i
    //   2024: ldc_w 2071339676
    //   2027: ixor
    //   2028: ldc2_w 1042240801
    //   2031: l2i
    //   2032: ldc_w -504223927
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 3868, 1280688270 -> 2020, 1952398522 -> 2064
    //   2064: aload_0
    //   2065: getstatic Perryc.0 : I
    //   2068: ifle -> 2082
    //   2071: ldc2_w -896415875
    //   2074: l2i
    //   2075: ldc_w 1126388309
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w 1645881528
    //   2085: l2i
    //   2086: ldc_w 1314004088
    //   2089: ixor
    //   2090: ldc2_w -748635645
    //   2093: l2i
    //   2094: ldc_w 1367223987
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 3866, -1370054544 -> 2124, 195821976 -> 2082
    //   2124: aload_0
    //   2125: new bigname/zprestige/webhack/features/setting/Setting
    //   2128: dup
    //   2129: ldc_w '董㌖萧'
    //   2132: getstatic Perryc.c : I
    //   2135: iflt -> 2149
    //   2138: ldc2_w 2013462718
    //   2141: l2i
    //   2142: ldc_w 1443037640
    //   2145: ixor
    //   2146: goto -> 2157
    //   2149: ldc2_w 1716885641
    //   2152: l2i
    //   2153: ldc_w -507733775
    //   2156: ixor
    //   2157: ldc2_w 1746701253
    //   2160: l2i
    //   2161: ldc_w 229983825
    //   2164: ixor
    //   2165: ixor
    //   2166: lookupswitch default -> 2192, -953543182 -> 2149, 1269419234 -> 3884
    //   2192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2195: ldc2_w 928460277
    //   2198: l2i
    //   2199: ldc_w 928460257
    //   2202: ixor
    //   2203: getstatic Perryc.0 : I
    //   2206: ifle -> 2220
    //   2209: ldc2_w 1851792704
    //   2212: l2i
    //   2213: ldc_w -675537553
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w -1584938169
    //   2223: l2i
    //   2224: ldc_w -1726859856
    //   2227: ixor
    //   2228: ldc2_w 1556581506
    //   2231: l2i
    //   2232: ldc_w 299648204
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 2264, -990035195 -> 2220, -188233631 -> 3904
    //   2264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2267: ldc2_w 240017659
    //   2270: l2i
    //   2271: ldc_w 240017659
    //   2274: ixor
    //   2275: getstatic Perryc.c : I
    //   2278: iflt -> 2292
    //   2281: ldc2_w -758372051
    //   2284: l2i
    //   2285: ldc_w 1411901287
    //   2288: ixor
    //   2289: goto -> 2300
    //   2292: ldc2_w 2102584336
    //   2295: l2i
    //   2296: ldc_w -1751139861
    //   2299: ixor
    //   2300: ldc2_w 1622986223
    //   2303: l2i
    //   2304: ldc_w 1363646953
    //   2307: ixor
    //   2308: ixor
    //   2309: lookupswitch default -> 2336, -1701505872 -> 2292, -1223648692 -> 3878
    //   2336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2339: ldc2_w 452415023
    //   2342: l2i
    //   2343: ldc_w 452415184
    //   2346: ixor
    //   2347: getstatic Perryc.1 : I
    //   2350: ifeq -> 2364
    //   2353: ldc2_w 176115567
    //   2356: l2i
    //   2357: ldc_w 769866033
    //   2360: ixor
    //   2361: goto -> 2372
    //   2364: ldc2_w 189290957
    //   2367: l2i
    //   2368: ldc_w -1856288442
    //   2371: ixor
    //   2372: ldc2_w 1724456626
    //   2375: l2i
    //   2376: ldc_w -50877422
    //   2379: ixor
    //   2380: ixor
    //   2381: lookupswitch default -> 2408, -1113406210 -> 3908, 407765242 -> 2364
    //   2408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2411: getstatic Perryc.0 : I
    //   2414: ifle -> 2428
    //   2417: ldc2_w 2073198601
    //   2420: l2i
    //   2421: ldc_w -326179467
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w 1908404767
    //   2431: l2i
    //   2432: ldc_w -672843403
    //   2435: ixor
    //   2436: ldc2_w 821344254
    //   2439: l2i
    //   2440: ldc_w -1129971842
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 2472, -1059250312 -> 2428, 458042876 -> 3848
    //   2472: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2475: getstatic Perryc.c : I
    //   2478: iflt -> 2492
    //   2481: ldc2_w 640803668
    //   2484: l2i
    //   2485: ldc_w -2116464012
    //   2488: ixor
    //   2489: goto -> 2500
    //   2492: ldc2_w 1173233169
    //   2495: l2i
    //   2496: ldc_w -279500524
    //   2499: ixor
    //   2500: ldc2_w -1360422326
    //   2503: l2i
    //   2504: ldc_w -1395321137
    //   2507: ixor
    //   2508: ixor
    //   2509: lookupswitch default -> 3812, -1512817243 -> 2492, -1467630720 -> 2536
    //   2536: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w 603988194
    //   2548: l2i
    //   2549: ldc_w 1213322804
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w 1603841275
    //   2559: l2i
    //   2560: ldc_w -850994535
    //   2563: ixor
    //   2564: ldc2_w 1263049830
    //   2567: l2i
    //   2568: ldc_w -1380847126
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 3916, -1968661670 -> 2556, 1948720110 -> 2600
    //   2600: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2603: getstatic Perryc.0 : I
    //   2606: ifle -> 2620
    //   2609: ldc2_w -1700142439
    //   2612: l2i
    //   2613: ldc_w -1375592952
    //   2616: ixor
    //   2617: goto -> 2628
    //   2620: ldc2_w 743172844
    //   2623: l2i
    //   2624: ldc_w 147097320
    //   2627: ixor
    //   2628: ldc2_w 717573764
    //   2631: l2i
    //   2632: ldc_w -99539170
    //   2635: ixor
    //   2636: ixor
    //   2637: lookupswitch default -> 3824, -461400821 -> 2620, -195361378 -> 2664
    //   2664: aload_0
    //   2665: getstatic Perryc.1 : I
    //   2668: ifeq -> 2682
    //   2671: ldc2_w -1128284011
    //   2674: l2i
    //   2675: ldc_w -2010680349
    //   2678: ixor
    //   2679: goto -> 2690
    //   2682: ldc2_w 1062010466
    //   2685: l2i
    //   2686: ldc_w 571958962
    //   2689: ixor
    //   2690: ldc2_w -702551660
    //   2693: l2i
    //   2694: ldc_w 587475477
    //   2697: ixor
    //   2698: ixor
    //   2699: lookupswitch default -> 2724, -1048350473 -> 3846, 140794927 -> 2682
    //   2724: aload_0
    //   2725: new bigname/zprestige/webhack/features/setting/Setting
    //   2728: dup
    //   2729: ldc_w '葶㌁萦㶲㏘'
    //   2732: getstatic Perryc.c : I
    //   2735: iflt -> 2749
    //   2738: ldc2_w -1507540077
    //   2741: l2i
    //   2742: ldc_w -1787990314
    //   2745: ixor
    //   2746: goto -> 2757
    //   2749: ldc2_w -398509023
    //   2752: l2i
    //   2753: ldc_w -1209631980
    //   2756: ixor
    //   2757: ldc2_w 168817196
    //   2760: l2i
    //   2761: ldc_w -329120786
    //   2764: ixor
    //   2765: ixor
    //   2766: lookupswitch default -> 3874, -1179339017 -> 2792, -719037305 -> 2749
    //   2792: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2795: ldc2_w -1525364570
    //   2798: l2i
    //   2799: ldc_w -1525364558
    //   2802: ixor
    //   2803: getstatic Perryc.0 : I
    //   2806: ifle -> 2820
    //   2809: ldc2_w 1252905207
    //   2812: l2i
    //   2813: ldc_w -662737821
    //   2816: ixor
    //   2817: goto -> 2828
    //   2820: ldc2_w 1482863720
    //   2823: l2i
    //   2824: ldc_w -1151951271
    //   2827: ixor
    //   2828: ldc2_w 148266607
    //   2831: l2i
    //   2832: ldc_w 1844988656
    //   2835: ixor
    //   2836: ixor
    //   2837: lookupswitch default -> 3906, -2045100370 -> 2864, -134436853 -> 2820
    //   2864: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2867: ldc2_w -322412287
    //   2870: l2i
    //   2871: ldc_w -322412287
    //   2874: ixor
    //   2875: getstatic Perryc.c : I
    //   2878: iflt -> 2892
    //   2881: ldc2_w 1133441079
    //   2884: l2i
    //   2885: ldc_w 1176070114
    //   2888: ixor
    //   2889: goto -> 2900
    //   2892: ldc2_w 2067469024
    //   2895: l2i
    //   2896: ldc_w -362715192
    //   2899: ixor
    //   2900: ldc2_w -403436550
    //   2903: l2i
    //   2904: ldc_w 1941072971
    //   2907: ixor
    //   2908: ixor
    //   2909: lookupswitch default -> 2936, -1848512412 -> 3806, -1747763543 -> 2892
    //   2936: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2939: ldc2_w -809660616
    //   2942: l2i
    //   2943: ldc_w -809660473
    //   2946: ixor
    //   2947: getstatic Perryc.c : I
    //   2950: iflt -> 2964
    //   2953: ldc2_w 1541175148
    //   2956: l2i
    //   2957: ldc_w -1559835741
    //   2960: ixor
    //   2961: goto -> 2972
    //   2964: ldc2_w -1990650151
    //   2967: l2i
    //   2968: ldc_w -240325184
    //   2971: ixor
    //   2972: ldc2_w -1080276468
    //   2975: l2i
    //   2976: ldc_w 1102523379
    //   2979: ixor
    //   2980: ixor
    //   2981: lookupswitch default -> 3008, -1724411879 -> 2964, 116514096 -> 3858
    //   3008: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3011: getstatic Perryc.0 : I
    //   3014: ifle -> 3028
    //   3017: ldc2_w 1937579459
    //   3020: l2i
    //   3021: ldc_w 1831244641
    //   3024: ixor
    //   3025: goto -> 3036
    //   3028: ldc2_w -734088795
    //   3031: l2i
    //   3032: ldc_w 1909936849
    //   3035: ixor
    //   3036: ldc2_w 220469009
    //   3039: l2i
    //   3040: ldc_w -1846371340
    //   3043: ixor
    //   3044: ixor
    //   3045: lookupswitch default -> 3890, -2104688057 -> 3028, 960458641 -> 3072
    //   3072: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3075: getstatic Perryc.0 : I
    //   3078: ifle -> 3092
    //   3081: ldc2_w -1853605749
    //   3084: l2i
    //   3085: ldc_w -1236002086
    //   3088: ixor
    //   3089: goto -> 3100
    //   3092: ldc2_w 2028567983
    //   3095: l2i
    //   3096: ldc_w -1042107753
    //   3099: ixor
    //   3100: ldc2_w 1567630125
    //   3103: l2i
    //   3104: ldc_w 1738878440
    //   3107: ixor
    //   3108: ixor
    //   3109: lookupswitch default -> 3136, 486878356 -> 3882, 1115562573 -> 3092
    //   3136: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3139: getstatic Perryc.0 : I
    //   3142: ifle -> 3156
    //   3145: ldc2_w -1835760157
    //   3148: l2i
    //   3149: ldc_w 121959659
    //   3152: ixor
    //   3153: goto -> 3164
    //   3156: ldc2_w -485017473
    //   3159: l2i
    //   3160: ldc_w -17099542
    //   3163: ixor
    //   3164: ldc2_w -124353017
    //   3167: l2i
    //   3168: ldc_w -1614114427
    //   3171: ixor
    //   3172: ixor
    //   3173: lookupswitch default -> 3834, -225679734 -> 3156, 2058369815 -> 3200
    //   3200: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3203: getstatic Perryc.0 : I
    //   3206: ifle -> 3220
    //   3209: ldc2_w -985017654
    //   3212: l2i
    //   3213: ldc_w -1350478646
    //   3216: ixor
    //   3217: goto -> 3228
    //   3220: ldc2_w 952294027
    //   3223: l2i
    //   3224: ldc_w -582624361
    //   3227: ixor
    //   3228: ldc2_w -1527199666
    //   3231: l2i
    //   3232: ldc_w 1135429850
    //   3235: ixor
    //   3236: ixor
    //   3237: lookupswitch default -> 3264, -1919089004 -> 3862, -528357623 -> 3220
    //   3264: aload_0
    //   3265: getstatic Perryc.1 : I
    //   3268: ifeq -> 3282
    //   3271: ldc2_w 286899386
    //   3274: l2i
    //   3275: ldc_w -1677094124
    //   3278: ixor
    //   3279: goto -> 3290
    //   3282: ldc2_w -297861249
    //   3285: l2i
    //   3286: ldc_w 1696228972
    //   3289: ixor
    //   3290: ldc2_w -164104595
    //   3293: l2i
    //   3294: ldc_w -154093628
    //   3297: ixor
    //   3298: ixor
    //   3299: lookupswitch default -> 3822, -1950099270 -> 3324, -1913164281 -> 3282
    //   3324: aload_0
    //   3325: new bigname/zprestige/webhack/features/setting/Setting
    //   3328: dup
    //   3329: ldc_w '葳㌟萶㶲'
    //   3332: getstatic Perryc.1 : I
    //   3335: ifeq -> 3349
    //   3338: ldc2_w 308781475
    //   3341: l2i
    //   3342: ldc_w -1081454449
    //   3345: ixor
    //   3346: goto -> 3357
    //   3349: ldc2_w -891118483
    //   3352: l2i
    //   3353: ldc_w 1974793146
    //   3356: ixor
    //   3357: ldc2_w 163218759
    //   3360: l2i
    //   3361: ldc_w 1387756016
    //   3364: ixor
    //   3365: ixor
    //   3366: lookupswitch default -> 3838, -463760544 -> 3392, -153088613 -> 3349
    //   3392: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3395: ldc2_w -806491540
    //   3398: l2i
    //   3399: ldc_w -806491528
    //   3402: ixor
    //   3403: getstatic Perryc.0 : I
    //   3406: ifle -> 3420
    //   3409: ldc2_w -1636587568
    //   3412: l2i
    //   3413: ldc_w -1916872123
    //   3416: ixor
    //   3417: goto -> 3428
    //   3420: ldc2_w 507314254
    //   3423: l2i
    //   3424: ldc_w -903628760
    //   3427: ixor
    //   3428: ldc2_w -1223283260
    //   3431: l2i
    //   3432: ldc_w -1461148813
    //   3435: ixor
    //   3436: ixor
    //   3437: lookupswitch default -> 3464, -1604851134 -> 3420, 204731170 -> 3902
    //   3464: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3467: ldc2_w 232554829
    //   3470: l2i
    //   3471: ldc_w 232554829
    //   3474: ixor
    //   3475: getstatic Perryc.0 : I
    //   3478: ifle -> 3492
    //   3481: ldc2_w -1168772396
    //   3484: l2i
    //   3485: ldc_w 1220098597
    //   3488: ixor
    //   3489: goto -> 3500
    //   3492: ldc2_w -637758620
    //   3495: l2i
    //   3496: ldc_w 378369656
    //   3499: ixor
    //   3500: ldc2_w -2108616382
    //   3503: l2i
    //   3504: ldc_w -558647516
    //   3507: ixor
    //   3508: ixor
    //   3509: lookupswitch default -> 3886, -1819065478 -> 3536, -1374785897 -> 3492
    //   3536: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3539: ldc2_w -2005526054
    //   3542: l2i
    //   3543: ldc_w -2005526235
    //   3546: ixor
    //   3547: getstatic Perryc.c : I
    //   3550: iflt -> 3564
    //   3553: ldc2_w 1501394441
    //   3556: l2i
    //   3557: ldc_w 2043141022
    //   3560: ixor
    //   3561: goto -> 3572
    //   3564: ldc2_w 1978447378
    //   3567: l2i
    //   3568: ldc_w -1992156228
    //   3571: ixor
    //   3572: ldc2_w -1855305098
    //   3575: l2i
    //   3576: ldc_w 160384744
    //   3579: ixor
    //   3580: ixor
    //   3581: lookupswitch default -> 3608, -1201692407 -> 3880, 1938695667 -> 3564
    //   3608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3611: getstatic Perryc.1 : I
    //   3614: ifeq -> 3628
    //   3617: ldc2_w 1145105608
    //   3620: l2i
    //   3621: ldc_w 571110137
    //   3624: ixor
    //   3625: goto -> 3636
    //   3628: ldc2_w -2127625408
    //   3631: l2i
    //   3632: ldc_w 707331339
    //   3635: ixor
    //   3636: ldc2_w 1590246417
    //   3639: l2i
    //   3640: ldc_w -1075951430
    //   3643: ixor
    //   3644: ixor
    //   3645: lookupswitch default -> 3898, -2023888230 -> 3628, 1242657504 -> 3672
    //   3672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3675: getstatic Perryc.c : I
    //   3678: iflt -> 3692
    //   3681: ldc2_w -1723183447
    //   3684: l2i
    //   3685: ldc_w -550264142
    //   3688: ixor
    //   3689: goto -> 3700
    //   3692: ldc2_w 1684616551
    //   3695: l2i
    //   3696: ldc_w 675451287
    //   3699: ixor
    //   3700: ldc2_w -444273730
    //   3703: l2i
    //   3704: ldc_w -640288482
    //   3707: ixor
    //   3708: ixor
    //   3709: lookupswitch default -> 3854, 1887090256 -> 3736, 2049507003 -> 3692
    //   3736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3739: getstatic Perryc.1 : I
    //   3742: ifeq -> 3756
    //   3745: ldc2_w 1924448480
    //   3748: l2i
    //   3749: ldc_w -1527698284
    //   3752: ixor
    //   3753: goto -> 3764
    //   3756: ldc2_w 1941849147
    //   3759: l2i
    //   3760: ldc_w 1064613479
    //   3763: ixor
    //   3764: ldc2_w -771260208
    //   3767: l2i
    //   3768: ldc_w -53875708
    //   3771: ixor
    //   3772: ixor
    //   3773: lookupswitch default -> 3800, -1528747559 -> 3756, -125075296 -> 3870
    //   3800: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3803: return
    //   3804: aconst_null
    //   3805: athrow
    //   3806: aconst_null
    //   3807: athrow
    //   3808: aconst_null
    //   3809: athrow
    //   3810: aconst_null
    //   3811: athrow
    //   3812: aconst_null
    //   3813: athrow
    //   3814: aconst_null
    //   3815: athrow
    //   3816: aconst_null
    //   3817: athrow
    //   3818: aconst_null
    //   3819: athrow
    //   3820: aconst_null
    //   3821: athrow
    //   3822: aconst_null
    //   3823: athrow
    //   3824: aconst_null
    //   3825: athrow
    //   3826: aconst_null
    //   3827: athrow
    //   3828: aconst_null
    //   3829: athrow
    //   3830: aconst_null
    //   3831: athrow
    //   3832: aconst_null
    //   3833: athrow
    //   3834: aconst_null
    //   3835: athrow
    //   3836: aconst_null
    //   3837: athrow
    //   3838: aconst_null
    //   3839: athrow
    //   3840: aconst_null
    //   3841: athrow
    //   3842: aconst_null
    //   3843: athrow
    //   3844: aconst_null
    //   3845: athrow
    //   3846: aconst_null
    //   3847: athrow
    //   3848: aconst_null
    //   3849: athrow
    //   3850: aconst_null
    //   3851: athrow
    //   3852: aconst_null
    //   3853: athrow
    //   3854: aconst_null
    //   3855: athrow
    //   3856: aconst_null
    //   3857: athrow
    //   3858: aconst_null
    //   3859: athrow
    //   3860: aconst_null
    //   3861: athrow
    //   3862: aconst_null
    //   3863: athrow
    //   3864: aconst_null
    //   3865: athrow
    //   3866: aconst_null
    //   3867: athrow
    //   3868: aconst_null
    //   3869: athrow
    //   3870: aconst_null
    //   3871: athrow
    //   3872: aconst_null
    //   3873: athrow
    //   3874: aconst_null
    //   3875: athrow
    //   3876: aconst_null
    //   3877: athrow
    //   3878: aconst_null
    //   3879: athrow
    //   3880: aconst_null
    //   3881: athrow
    //   3882: aconst_null
    //   3883: athrow
    //   3884: aconst_null
    //   3885: athrow
    //   3886: aconst_null
    //   3887: athrow
    //   3888: aconst_null
    //   3889: athrow
    //   3890: aconst_null
    //   3891: athrow
    //   3892: aconst_null
    //   3893: athrow
    //   3894: aconst_null
    //   3895: athrow
    //   3896: aconst_null
    //   3897: athrow
    //   3898: aconst_null
    //   3899: athrow
    //   3900: aconst_null
    //   3901: athrow
    //   3902: aconst_null
    //   3903: athrow
    //   3904: aconst_null
    //   3905: athrow
    //   3906: aconst_null
    //   3907: athrow
    //   3908: aconst_null
    //   3909: athrow
    //   3910: aconst_null
    //   3911: athrow
    //   3912: aconst_null
    //   3913: athrow
    //   3914: aconst_null
    //   3915: athrow
    //   3916: aconst_null
    //   3917: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3804	0	this	Lbigname/zprestige/webhack/features/modules/Hud/CompactInfo;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\CompactInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */