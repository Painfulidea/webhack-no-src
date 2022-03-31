package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class Step extends Module {
  public double[] twoFiveOffset;
  
  public double[] selectedPositions;
  
  public double[] fourBlockPositions;
  
  public double[] futurePositions;
  
  public Setting<Integer> stepHeight;
  
  public double[] twoblockPositions;
  
  public Setting<Boolean> vanilla;
  
  public double[] oneblockPositions;
  
  public static Step instance;
  
  public int packets;
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.1S(this, (int)-1097550835L ^ 0xDACD3C3A, paramObject);
  }
  
  public String getDisplayInfo() {
    return Perry1.g(this, (int)314035731L ^ 0x4AECE5BA);
  }
  
  public Step() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1892571196
    //   9: l2i
    //   10: ldc 2108593831
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1562162702
    //   19: l2i
    //   20: ldc 1101982732
    //   22: ixor
    //   23: ldc2_w 92774697
    //   26: l2i
    //   27: ldc -775425012
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 3596, 652174406 -> 16, 923660507 -> 56
    //   56: aload_0
    //   57: ldc 'ꚵ㌇ꛩ㶧'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w 584771089
    //   68: l2i
    //   69: ldc 632092535
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1483635091
    //   78: l2i
    //   79: ldc -1609162387
    //   81: ixor
    //   82: ldc2_w 1503215920
    //   85: l2i
    //   86: ldc 2141137274
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 3564, -562155340 -> 116, 561019180 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc 'ꚵ㌇ꛩ㶧ᖥ䠯๩?蹺䤔ḝਪ歟煬'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w 302387424
    //   130: l2i
    //   131: ldc 1943518359
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1843692638
    //   140: l2i
    //   141: ldc -46013516
    //   143: ixor
    //   144: ldc2_w 2125970859
    //   147: l2i
    //   148: ldc 714880163
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 3602, -997265694 -> 180, 905586047 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w -1979858855
    //   192: l2i
    //   193: ldc 1678489764
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1389786315
    //   202: l2i
    //   203: ldc -294346804
    //   205: ixor
    //   206: ldc2_w -715871889
    //   209: l2i
    //   210: ldc 945674075
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 3606, 16713417 -> 199, 1370199347 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -501844051
    //   246: l2i
    //   247: ldc -501844052
    //   249: ixor
    //   250: ldc2_w -299001850
    //   253: l2i
    //   254: ldc -299001850
    //   256: ixor
    //   257: ldc2_w 650714826
    //   260: l2i
    //   261: ldc 650714826
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 108515934
    //   273: l2i
    //   274: ldc 1553934629
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 387611245
    //   283: l2i
    //   284: ldc 466085858
    //   286: ixor
    //   287: ldc2_w -2027683044
    //   290: l2i
    //   291: ldc -1817025156
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -843055467 -> 280, 1316920603 -> 3556
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -1145173637
    //   332: l2i
    //   333: ldc 1556685656
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1347054684
    //   342: l2i
    //   343: ldc 1015312479
    //   345: ixor
    //   346: ldc2_w 1257819413
    //   349: l2i
    //   350: ldc -1077781324
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, 153444950 -> 339, 307084162 -> 3548
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w -1628819626
    //   390: l2i
    //   391: ldc -941617425
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -57854329
    //   400: l2i
    //   401: ldc 442825779
    //   403: ixor
    //   404: ldc2_w 685366714
    //   407: l2i
    //   408: ldc -150966213
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -2032956360 -> 3562, -1296540520 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc 'ꚰ㌒ꛢ㶾ᗩ䠶๸'
    //   447: getstatic Perryc.c : I
    //   450: iflt -> 463
    //   453: ldc2_w 1427737046
    //   456: l2i
    //   457: ldc -1188042545
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 959090552
    //   466: l2i
    //   467: ldc -545942185
    //   469: ixor
    //   470: ldc2_w 790774931
    //   473: l2i
    //   474: ldc 1612811941
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 3608, -1556763857 -> 463, -1453535207 -> 504
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w 368888840
    //   510: l2i
    //   511: ldc 368888840
    //   513: ixor
    //   514: getstatic Perryc.c : I
    //   517: iflt -> 530
    //   520: ldc2_w -64711447
    //   523: l2i
    //   524: ldc 1637899102
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w 309942712
    //   533: l2i
    //   534: ldc -340563893
    //   536: ixor
    //   537: ldc2_w -772951107
    //   540: l2i
    //   541: ldc -1297500112
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 3590, -1701954946 -> 572, -20921286 -> 530
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.1 : I
    //   578: ifeq -> 591
    //   581: ldc2_w -1911662259
    //   584: l2i
    //   585: ldc -1161732311
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w 1917063245
    //   594: l2i
    //   595: ldc -1601238523
    //   597: ixor
    //   598: ldc2_w 187333885
    //   601: l2i
    //   602: ldc -1293142193
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 3572, -1928770090 -> 591, 1796035066 -> 632
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.c : I
    //   638: iflt -> 651
    //   641: ldc2_w -1907604269
    //   644: l2i
    //   645: ldc 1884791070
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w 1301351055
    //   654: l2i
    //   655: ldc -1535236255
    //   657: ixor
    //   658: ldc2_w -1505584848
    //   661: l2i
    //   662: ldc -1773897605
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 3582, -836959098 -> 651, -638989147 -> 692
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.c : I
    //   698: iflt -> 711
    //   701: ldc2_w -129242404
    //   704: l2i
    //   705: ldc 1844028430
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -1825449071
    //   714: l2i
    //   715: ldc -1595777351
    //   717: ixor
    //   718: ldc2_w 1449690649
    //   721: l2i
    //   722: ldc -1428316575
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 3584, -815358640 -> 752, 1763137194 -> 711
    //   752: putfield vanilla : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 771
    //   761: ldc2_w 26123120
    //   764: l2i
    //   765: ldc 1392271552
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w 1239575413
    //   774: l2i
    //   775: ldc 1195344044
    //   777: ixor
    //   778: ldc2_w 424406397
    //   781: l2i
    //   782: ldc -1521984746
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 3546, -1294049870 -> 812, -277787173 -> 771
    //   812: aload_0
    //   813: getstatic Perryc.1 : I
    //   816: ifeq -> 829
    //   819: ldc2_w 2089593948
    //   822: l2i
    //   823: ldc 1867649166
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w 1107120802
    //   832: l2i
    //   833: ldc 1627426445
    //   835: ixor
    //   836: ldc2_w -2042331178
    //   839: l2i
    //   840: ldc 1263479109
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 3592, -556406207 -> 829, -302609732 -> 872
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc 'ꚮ㌖ꛥ㶰ᗭ䠮'
    //   879: getstatic Perryc.0 : I
    //   882: ifle -> 895
    //   885: ldc2_w -1630635619
    //   888: l2i
    //   889: ldc 807211882
    //   891: ixor
    //   892: goto -> 902
    //   895: ldc2_w -1477149783
    //   898: l2i
    //   899: ldc -1273774638
    //   901: ixor
    //   902: ldc2_w 494211311
    //   905: l2i
    //   906: ldc -158709517
    //   908: ixor
    //   909: ixor
    //   910: lookupswitch default -> 936, -593557026 -> 895, 1160524523 -> 3586
    //   936: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   939: ldc2_w -165337002
    //   942: l2i
    //   943: ldc -165337004
    //   945: ixor
    //   946: getstatic Perryc.1 : I
    //   949: ifeq -> 962
    //   952: ldc2_w 1939085210
    //   955: l2i
    //   956: ldc -1733987611
    //   958: ixor
    //   959: goto -> 969
    //   962: ldc2_w 631095834
    //   965: l2i
    //   966: ldc -391762173
    //   968: ixor
    //   969: ldc2_w -1548103925
    //   972: l2i
    //   973: ldc 2085797562
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 3540, 315661480 -> 1004, 886707406 -> 962
    //   1004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1007: ldc2_w 1977980932
    //   1010: l2i
    //   1011: ldc_w 1977980933
    //   1014: ixor
    //   1015: getstatic Perryc.1 : I
    //   1018: ifeq -> 1032
    //   1021: ldc2_w -568247162
    //   1024: l2i
    //   1025: ldc_w 1529709441
    //   1028: ixor
    //   1029: goto -> 1040
    //   1032: ldc2_w -1332879832
    //   1035: l2i
    //   1036: ldc_w 1330294094
    //   1039: ixor
    //   1040: ldc2_w 809521945
    //   1043: l2i
    //   1044: ldc_w -1514930358
    //   1047: ixor
    //   1048: ixor
    //   1049: lookupswitch default -> 3552, 285152084 -> 1032, 1781849909 -> 1076
    //   1076: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1079: ldc2_w 2119168635
    //   1082: l2i
    //   1083: ldc_w 2119168639
    //   1086: ixor
    //   1087: getstatic Perryc.1 : I
    //   1090: ifeq -> 1104
    //   1093: ldc2_w -239691147
    //   1096: l2i
    //   1097: ldc_w 1662291710
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w 1842216473
    //   1107: l2i
    //   1108: ldc_w 1998963557
    //   1111: ixor
    //   1112: ldc2_w 1800628734
    //   1115: l2i
    //   1116: ldc_w 933852190
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 1148, -833091221 -> 3558, 1070869605 -> 1104
    //   1148: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1151: getstatic Perryc.c : I
    //   1154: iflt -> 1168
    //   1157: ldc2_w 378091161
    //   1160: l2i
    //   1161: ldc_w -1399289788
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w 1077493288
    //   1171: l2i
    //   1172: ldc_w -157524368
    //   1175: ixor
    //   1176: ldc2_w 1518200080
    //   1179: l2i
    //   1180: ldc_w 710768995
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 1212, -902749522 -> 3566, 648777541 -> 1168
    //   1212: aload_0
    //   1213: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Step;)Ljava/util/function/Predicate;
    //   1218: getstatic Perryc.0 : I
    //   1221: ifle -> 1235
    //   1224: ldc2_w -425579015
    //   1227: l2i
    //   1228: ldc_w 1358224289
    //   1231: ixor
    //   1232: goto -> 1243
    //   1235: ldc2_w -1085985181
    //   1238: l2i
    //   1239: ldc_w -1572376544
    //   1242: ixor
    //   1243: ldc2_w 1707669234
    //   1246: l2i
    //   1247: ldc_w 1466337513
    //   1250: ixor
    //   1251: ixor
    //   1252: lookupswitch default -> 3550, -2064086973 -> 1235, 799809624 -> 1280
    //   1280: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1283: getstatic Perryc.c : I
    //   1286: iflt -> 1300
    //   1289: ldc2_w -40005211
    //   1292: l2i
    //   1293: ldc_w 1567702898
    //   1296: ixor
    //   1297: goto -> 1308
    //   1300: ldc2_w -817959314
    //   1303: l2i
    //   1304: ldc_w -539850715
    //   1307: ixor
    //   1308: ldc2_w -1839056689
    //   1311: l2i
    //   1312: ldc_w 1774794989
    //   1315: ixor
    //   1316: ixor
    //   1317: lookupswitch default -> 1344, 528103294 -> 1300, 1531424501 -> 3594
    //   1344: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1347: getstatic Perryc.1 : I
    //   1350: ifeq -> 1364
    //   1353: ldc2_w 836059752
    //   1356: l2i
    //   1357: ldc_w -1061298612
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w 1359194065
    //   1367: l2i
    //   1368: ldc_w 1847806525
    //   1371: ixor
    //   1372: ldc2_w -486883545
    //   1375: l2i
    //   1376: ldc_w 1290830631
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 1408, -217304147 -> 1364, 1600299044 -> 3588
    //   1408: putfield stepHeight : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1411: getstatic Perryc.c : I
    //   1414: iflt -> 1428
    //   1417: ldc2_w 2035841629
    //   1420: l2i
    //   1421: ldc_w -111116124
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w -290366687
    //   1431: l2i
    //   1432: ldc_w -2007129507
    //   1435: ixor
    //   1436: ldc2_w 631373251
    //   1439: l2i
    //   1440: ldc_w -537273166
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, 490006219 -> 1428, 2053168008 -> 3600
    //   1472: aload_0
    //   1473: ldc2_w 359680765
    //   1476: l2i
    //   1477: ldc_w 359680767
    //   1480: ixor
    //   1481: newarray double
    //   1483: dup
    //   1484: ldc2_w -1366323402
    //   1487: l2i
    //   1488: ldc_w -1366323402
    //   1491: ixor
    //   1492: ldc2_w 22.729949018607925
    //   1495: invokestatic doubleToLongBits : (D)J
    //   1498: ldc2_w 9217843255885877753
    //   1501: lxor
    //   1502: invokestatic longBitsToDouble : (J)D
    //   1505: dastore
    //   1506: dup
    //   1507: ldc2_w 753108882
    //   1510: l2i
    //   1511: ldc_w 753108883
    //   1514: ixor
    //   1515: ldc2_w 3.901945087742579
    //   1518: invokestatic doubleToLongBits : (D)J
    //   1521: ldc2_w 9216395837380567880
    //   1524: lxor
    //   1525: invokestatic longBitsToDouble : (J)D
    //   1528: dastore
    //   1529: getstatic Perryc.0 : I
    //   1532: ifle -> 1546
    //   1535: ldc2_w -1328767597
    //   1538: l2i
    //   1539: ldc_w 64063217
    //   1542: ixor
    //   1543: goto -> 1554
    //   1546: ldc2_w -317863965
    //   1549: l2i
    //   1550: ldc_w 637624863
    //   1553: ixor
    //   1554: ldc2_w -1503453396
    //   1557: l2i
    //   1558: ldc_w 655031936
    //   1561: ixor
    //   1562: ixor
    //   1563: lookupswitch default -> 1588, 846527182 -> 3604, 867454589 -> 1546
    //   1588: putfield oneblockPositions : [D
    //   1591: getstatic Perryc.0 : I
    //   1594: ifle -> 1608
    //   1597: ldc2_w -2018477338
    //   1600: l2i
    //   1601: ldc_w 224875289
    //   1604: ixor
    //   1605: goto -> 1616
    //   1608: ldc2_w 1228565688
    //   1611: l2i
    //   1612: ldc_w 925243237
    //   1615: ixor
    //   1616: ldc2_w 1543639653
    //   1619: l2i
    //   1620: ldc_w -1169854414
    //   1623: ixor
    //   1624: ixor
    //   1625: lookupswitch default -> 3544, -1738860150 -> 1652, 1821395880 -> 1608
    //   1652: aload_0
    //   1653: ldc2_w 1654140387
    //   1656: l2i
    //   1657: ldc_w 1654140393
    //   1660: ixor
    //   1661: newarray double
    //   1663: dup
    //   1664: ldc2_w 1541150860
    //   1667: l2i
    //   1668: ldc_w 1541150860
    //   1671: ixor
    //   1672: ldc2_w 17.560727626792573
    //   1675: invokestatic doubleToLongBits : (D)J
    //   1678: ldc2_w 9216640905071202359
    //   1681: lxor
    //   1682: invokestatic longBitsToDouble : (J)D
    //   1685: dastore
    //   1686: dup
    //   1687: ldc2_w 1369235504
    //   1690: l2i
    //   1691: ldc_w 1369235505
    //   1694: ixor
    //   1695: ldc2_w 27.588143416921195
    //   1698: invokestatic doubleToLongBits : (D)J
    //   1701: ldc2_w 9210871210557376707
    //   1704: lxor
    //   1705: invokestatic longBitsToDouble : (J)D
    //   1708: dastore
    //   1709: dup
    //   1710: ldc2_w -1658640972
    //   1713: l2i
    //   1714: ldc_w -1658640970
    //   1717: ixor
    //   1718: ldc2_w 3.08487727920338
    //   1721: invokestatic doubleToLongBits : (D)J
    //   1724: ldc2_w 9216807764055216346
    //   1727: lxor
    //   1728: invokestatic longBitsToDouble : (J)D
    //   1731: dastore
    //   1732: dup
    //   1733: ldc2_w 1152833574
    //   1736: l2i
    //   1737: ldc_w 1152833573
    //   1740: ixor
    //   1741: ldc2_w 2.1524740892172494
    //   1744: invokestatic doubleToLongBits : (D)J
    //   1747: ldc2_w 9212963187740274019
    //   1750: lxor
    //   1751: invokestatic longBitsToDouble : (J)D
    //   1754: dastore
    //   1755: dup
    //   1756: ldc2_w -245572799
    //   1759: l2i
    //   1760: ldc_w -245572795
    //   1763: ixor
    //   1764: ldc2_w 3.7634920150624307
    //   1767: invokestatic doubleToLongBits : (D)J
    //   1770: ldc2_w 9215654554462214307
    //   1773: lxor
    //   1774: invokestatic longBitsToDouble : (J)D
    //   1777: dastore
    //   1778: dup
    //   1779: ldc2_w 669023751
    //   1782: l2i
    //   1783: ldc_w 669023746
    //   1786: ixor
    //   1787: ldc2_w 24.61336122689842
    //   1790: invokestatic doubleToLongBits : (D)J
    //   1793: ldc2_w 9208192561930300235
    //   1796: lxor
    //   1797: invokestatic longBitsToDouble : (J)D
    //   1800: dastore
    //   1801: dup
    //   1802: ldc2_w -766017308
    //   1805: l2i
    //   1806: ldc_w -766017310
    //   1809: ixor
    //   1810: ldc2_w 20.02675937605079
    //   1813: invokestatic doubleToLongBits : (D)J
    //   1816: ldc2_w 9206071795225017711
    //   1819: lxor
    //   1820: invokestatic longBitsToDouble : (J)D
    //   1823: dastore
    //   1824: dup
    //   1825: ldc2_w -751876406
    //   1828: l2i
    //   1829: ldc_w -751876403
    //   1832: ixor
    //   1833: ldc2_w 5.227664365259325
    //   1836: invokestatic doubleToLongBits : (D)J
    //   1839: ldc2_w 9218296246803269220
    //   1842: lxor
    //   1843: invokestatic longBitsToDouble : (J)D
    //   1846: dastore
    //   1847: dup
    //   1848: ldc2_w 768623095
    //   1851: l2i
    //   1852: ldc_w 768623103
    //   1855: ixor
    //   1856: ldc2_w 7.607059457849402
    //   1859: invokestatic doubleToLongBits : (D)J
    //   1862: ldc2_w 9216381405995606536
    //   1865: lxor
    //   1866: invokestatic longBitsToDouble : (J)D
    //   1869: dastore
    //   1870: dup
    //   1871: ldc2_w -1206802301
    //   1874: l2i
    //   1875: ldc_w -1206802294
    //   1878: ixor
    //   1879: ldc2_w 14.249740005564716
    //   1882: invokestatic doubleToLongBits : (D)J
    //   1885: ldc2_w 9212895391975854279
    //   1888: lxor
    //   1889: invokestatic longBitsToDouble : (J)D
    //   1892: dastore
    //   1893: getstatic Perryc.1 : I
    //   1896: ifeq -> 1910
    //   1899: ldc2_w -1771538799
    //   1902: l2i
    //   1903: ldc_w 1914661044
    //   1906: ixor
    //   1907: goto -> 1918
    //   1910: ldc2_w 1076640540
    //   1913: l2i
    //   1914: ldc_w -192552083
    //   1917: ixor
    //   1918: ldc2_w -27322634
    //   1921: l2i
    //   1922: ldc_w 1028402916
    //   1925: ixor
    //   1926: ixor
    //   1927: lookupswitch default -> 1952, -541400412 -> 1910, 660874807 -> 3570
    //   1952: putfield twoblockPositions : [D
    //   1955: getstatic Perryc.c : I
    //   1958: iflt -> 1972
    //   1961: ldc2_w -1107763045
    //   1964: l2i
    //   1965: ldc_w 815406621
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w -894512701
    //   1975: l2i
    //   1976: ldc_w 2134730562
    //   1979: ixor
    //   1980: ldc2_w 1538326195
    //   1983: l2i
    //   1984: ldc_w 479350403
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 3576, -901755210 -> 1972, -223279439 -> 2016
    //   2016: aload_0
    //   2017: ldc2_w 454356137
    //   2020: l2i
    //   2021: ldc_w 454356129
    //   2024: ixor
    //   2025: newarray double
    //   2027: dup
    //   2028: ldc2_w -1210934677
    //   2031: l2i
    //   2032: ldc_w -1210934677
    //   2035: ixor
    //   2036: ldc2_w 31.25947090074341
    //   2039: invokestatic doubleToLongBits : (D)J
    //   2042: ldc2_w 9215951617584303621
    //   2045: lxor
    //   2046: invokestatic longBitsToDouble : (J)D
    //   2049: dastore
    //   2050: dup
    //   2051: ldc2_w 400547833
    //   2054: l2i
    //   2055: ldc_w 400547832
    //   2058: ixor
    //   2059: ldc2_w 24.78382033908201
    //   2062: invokestatic doubleToLongBits : (D)J
    //   2065: ldc2_w 9209928767684633353
    //   2068: lxor
    //   2069: invokestatic longBitsToDouble : (J)D
    //   2072: dastore
    //   2073: dup
    //   2074: ldc2_w -641131780
    //   2077: l2i
    //   2078: ldc_w -641131778
    //   2081: ixor
    //   2082: ldc2_w 2.617222141649776
    //   2085: invokestatic doubleToLongBits : (D)J
    //   2088: ldc2_w 9214603328192338422
    //   2091: lxor
    //   2092: invokestatic longBitsToDouble : (J)D
    //   2095: dastore
    //   2096: dup
    //   2097: ldc2_w 91051746
    //   2100: l2i
    //   2101: ldc_w 91051745
    //   2104: ixor
    //   2105: ldc2_w 2.4530499986605925
    //   2108: invokestatic doubleToLongBits : (D)J
    //   2111: ldc2_w 9215435981646406042
    //   2114: lxor
    //   2115: invokestatic longBitsToDouble : (J)D
    //   2118: dastore
    //   2119: dup
    //   2120: ldc2_w -1898787443
    //   2123: l2i
    //   2124: ldc_w -1898787447
    //   2127: ixor
    //   2128: ldc2_w 1785.6522961344276
    //   2131: invokestatic doubleToLongBits : (D)J
    //   2134: ldc2_w 9184856519257644671
    //   2137: lxor
    //   2138: invokestatic longBitsToDouble : (J)D
    //   2141: dastore
    //   2142: dup
    //   2143: ldc2_w 1087148992
    //   2146: l2i
    //   2147: ldc_w 1087148997
    //   2150: ixor
    //   2151: ldc2_w 29.979329040178765
    //   2154: invokestatic doubleToLongBits : (D)J
    //   2157: ldc2_w 9209481484398041119
    //   2160: lxor
    //   2161: invokestatic longBitsToDouble : (J)D
    //   2164: dastore
    //   2165: dup
    //   2166: ldc2_w 1909082340
    //   2169: l2i
    //   2170: ldc_w 1909082338
    //   2173: ixor
    //   2174: ldc2_w 81.1301818086742
    //   2177: invokestatic doubleToLongBits : (D)J
    //   2180: ldc2_w 9197330549908668863
    //   2183: lxor
    //   2184: invokestatic longBitsToDouble : (J)D
    //   2187: dastore
    //   2188: dup
    //   2189: ldc2_w 78894009
    //   2192: l2i
    //   2193: ldc_w 78894014
    //   2196: ixor
    //   2197: ldc2_w 5.099530969200355
    //   2200: invokestatic doubleToLongBits : (D)J
    //   2203: ldc2_w 9215073665519117453
    //   2206: lxor
    //   2207: invokestatic longBitsToDouble : (J)D
    //   2210: dastore
    //   2211: getstatic Perryc.1 : I
    //   2214: ifeq -> 2228
    //   2217: ldc2_w -160454093
    //   2220: l2i
    //   2221: ldc_w -98683194
    //   2224: ixor
    //   2225: goto -> 2236
    //   2228: ldc2_w 1739177801
    //   2231: l2i
    //   2232: ldc_w 1858363701
    //   2235: ixor
    //   2236: ldc2_w 821716073
    //   2239: l2i
    //   2240: ldc_w -443460517
    //   2243: ixor
    //   2244: ixor
    //   2245: lookupswitch default -> 3580, -652563257 -> 2228, -603525554 -> 2272
    //   2272: putfield futurePositions : [D
    //   2275: getstatic Perryc.c : I
    //   2278: iflt -> 2292
    //   2281: ldc2_w -310097777
    //   2284: l2i
    //   2285: ldc_w -1096605130
    //   2288: ixor
    //   2289: goto -> 2300
    //   2292: ldc2_w 1204676896
    //   2295: l2i
    //   2296: ldc_w 413826617
    //   2299: ixor
    //   2300: ldc2_w -2062485383
    //   2303: l2i
    //   2304: ldc_w -998023491
    //   2307: ixor
    //   2308: ixor
    //   2309: lookupswitch default -> 3574, 313838717 -> 2292, 519320029 -> 2336
    //   2336: aload_0
    //   2337: ldc2_w 387022624
    //   2340: l2i
    //   2341: ldc_w 387022634
    //   2344: ixor
    //   2345: newarray double
    //   2347: dup
    //   2348: ldc2_w 523392281
    //   2351: l2i
    //   2352: ldc_w 523392281
    //   2355: ixor
    //   2356: ldc2_w 2.735335193408752
    //   2359: invokestatic doubleToLongBits : (D)J
    //   2362: ldc2_w 9214033628408413569
    //   2365: lxor
    //   2366: invokestatic longBitsToDouble : (J)D
    //   2369: dastore
    //   2370: dup
    //   2371: ldc2_w -24206894
    //   2374: l2i
    //   2375: ldc_w -24206893
    //   2378: ixor
    //   2379: ldc2_w 21.369036502400743
    //   2382: invokestatic doubleToLongBits : (D)J
    //   2385: ldc2_w 9214113981040186485
    //   2388: lxor
    //   2389: invokestatic longBitsToDouble : (J)D
    //   2392: dastore
    //   2393: dup
    //   2394: ldc2_w 532498285
    //   2397: l2i
    //   2398: ldc_w 532498287
    //   2401: ixor
    //   2402: ldc2_w 12.11233640245337
    //   2405: invokestatic doubleToLongBits : (D)J
    //   2408: ldc2_w 9209412298317335955
    //   2411: lxor
    //   2412: invokestatic longBitsToDouble : (J)D
    //   2415: dastore
    //   2416: dup
    //   2417: ldc2_w -137798760
    //   2420: l2i
    //   2421: ldc_w -137798757
    //   2424: ixor
    //   2425: ldc2_w 27.87309466594954
    //   2428: invokestatic doubleToLongBits : (D)J
    //   2431: ldc2_w 9212381873438010087
    //   2434: lxor
    //   2435: invokestatic longBitsToDouble : (J)D
    //   2438: dastore
    //   2439: dup
    //   2440: ldc2_w -2019107288
    //   2443: l2i
    //   2444: ldc_w -2019107284
    //   2447: ixor
    //   2448: ldc2_w 4.468522966385765
    //   2451: invokestatic doubleToLongBits : (D)J
    //   2454: ldc2_w 9214793478825837604
    //   2457: lxor
    //   2458: invokestatic longBitsToDouble : (J)D
    //   2461: dastore
    //   2462: dup
    //   2463: ldc2_w -974949286
    //   2466: l2i
    //   2467: ldc_w -974949281
    //   2470: ixor
    //   2471: ldc2_w 25.238362622467115
    //   2474: invokestatic doubleToLongBits : (D)J
    //   2477: ldc2_w 9208962606538546951
    //   2480: lxor
    //   2481: invokestatic longBitsToDouble : (J)D
    //   2484: dastore
    //   2485: dup
    //   2486: ldc2_w 333542700
    //   2489: l2i
    //   2490: ldc_w 333542698
    //   2493: ixor
    //   2494: ldc2_w 7.6939485285281055
    //   2497: invokestatic doubleToLongBits : (D)J
    //   2500: ldc2_w 9215675515525092849
    //   2503: lxor
    //   2504: invokestatic longBitsToDouble : (J)D
    //   2507: dastore
    //   2508: dup
    //   2509: ldc2_w -2038929290
    //   2512: l2i
    //   2513: ldc_w -2038929295
    //   2516: ixor
    //   2517: ldc2_w 7.405843264995108
    //   2520: invokestatic doubleToLongBits : (D)J
    //   2523: ldc2_w 9214497852388689739
    //   2526: lxor
    //   2527: invokestatic longBitsToDouble : (J)D
    //   2530: dastore
    //   2531: dup
    //   2532: ldc2_w -624327929
    //   2535: l2i
    //   2536: ldc_w -624327921
    //   2539: ixor
    //   2540: ldc2_w 0.4803295031093268
    //   2543: invokestatic doubleToLongBits : (D)J
    //   2546: ldc2_w 9213972718026676571
    //   2549: lxor
    //   2550: invokestatic longBitsToDouble : (J)D
    //   2553: dastore
    //   2554: dup
    //   2555: ldc2_w -1802390212
    //   2558: l2i
    //   2559: ldc_w -1802390219
    //   2562: ixor
    //   2563: ldc2_w 13.71343457316035
    //   2566: invokestatic doubleToLongBits : (D)J
    //   2569: ldc2_w 9211530662321361725
    //   2572: lxor
    //   2573: invokestatic longBitsToDouble : (J)D
    //   2576: dastore
    //   2577: getstatic Perryc.c : I
    //   2580: iflt -> 2594
    //   2583: ldc2_w 300053115
    //   2586: l2i
    //   2587: ldc_w 481143005
    //   2590: ixor
    //   2591: goto -> 2602
    //   2594: ldc2_w -560972175
    //   2597: l2i
    //   2598: ldc_w 104824771
    //   2601: ixor
    //   2602: ldc2_w -1922412961
    //   2605: l2i
    //   2606: ldc_w -1527510722
    //   2609: ixor
    //   2610: ixor
    //   2611: lookupswitch default -> 3598, -248445229 -> 2636, 617717191 -> 2594
    //   2636: putfield twoFiveOffset : [D
    //   2639: getstatic Perryc.c : I
    //   2642: iflt -> 2656
    //   2645: ldc2_w -1891991662
    //   2648: l2i
    //   2649: ldc_w 891161541
    //   2652: ixor
    //   2653: goto -> 2664
    //   2656: ldc2_w -1924870159
    //   2659: l2i
    //   2660: ldc_w 1791118902
    //   2663: ixor
    //   2664: ldc2_w -250633195
    //   2667: l2i
    //   2668: ldc_w 1241738489
    //   2671: ixor
    //   2672: ixor
    //   2673: lookupswitch default -> 2700, -206816598 -> 2656, 19446971 -> 3554
    //   2700: aload_0
    //   2701: ldc2_w -1036557523
    //   2704: l2i
    //   2705: ldc_w -1036557509
    //   2708: ixor
    //   2709: newarray double
    //   2711: dup
    //   2712: ldc2_w -1793782121
    //   2715: l2i
    //   2716: ldc_w -1793782121
    //   2719: ixor
    //   2720: ldc2_w 23.097315693641324
    //   2723: invokestatic doubleToLongBits : (D)J
    //   2726: ldc2_w 9218298538025150808
    //   2729: lxor
    //   2730: invokestatic longBitsToDouble : (J)D
    //   2733: dastore
    //   2734: dup
    //   2735: ldc2_w -1434790811
    //   2738: l2i
    //   2739: ldc_w -1434790812
    //   2742: ixor
    //   2743: ldc2_w 2.5288080525519216
    //   2746: invokestatic doubleToLongBits : (D)J
    //   2749: ldc2_w 9217970399160089514
    //   2752: lxor
    //   2753: invokestatic longBitsToDouble : (J)D
    //   2756: dastore
    //   2757: dup
    //   2758: ldc2_w 1222751586
    //   2761: l2i
    //   2762: ldc_w 1222751584
    //   2765: ixor
    //   2766: ldc2_w 2.9374865215448733
    //   2769: invokestatic doubleToLongBits : (D)J
    //   2772: ldc2_w 9215304976622719680
    //   2775: lxor
    //   2776: invokestatic longBitsToDouble : (J)D
    //   2779: dastore
    //   2780: dup
    //   2781: ldc2_w 1347179846
    //   2784: l2i
    //   2785: ldc_w 1347179845
    //   2788: ixor
    //   2789: ldc2_w 24.506565326196164
    //   2792: invokestatic doubleToLongBits : (D)J
    //   2795: ldc2_w 9212342035896071297
    //   2798: lxor
    //   2799: invokestatic longBitsToDouble : (J)D
    //   2802: dastore
    //   2803: dup
    //   2804: ldc2_w 1654054141
    //   2807: l2i
    //   2808: ldc_w 1654054137
    //   2811: ixor
    //   2812: ldc2_w 3.4847763057406254
    //   2815: invokestatic doubleToLongBits : (D)J
    //   2818: ldc2_w 9216383672659512366
    //   2821: lxor
    //   2822: invokestatic longBitsToDouble : (J)D
    //   2825: dastore
    //   2826: dup
    //   2827: ldc2_w 1695264410
    //   2830: l2i
    //   2831: ldc_w 1695264415
    //   2834: ixor
    //   2835: ldc2_w 12.059016414045269
    //   2838: invokestatic doubleToLongBits : (D)J
    //   2841: ldc2_w 9213030166102675337
    //   2844: lxor
    //   2845: invokestatic longBitsToDouble : (J)D
    //   2848: dastore
    //   2849: dup
    //   2850: ldc2_w 354939821
    //   2853: l2i
    //   2854: ldc_w 354939819
    //   2857: ixor
    //   2858: ldc2_w 4.667175248727611
    //   2861: invokestatic doubleToLongBits : (D)J
    //   2864: ldc2_w 9215939461969658457
    //   2867: lxor
    //   2868: invokestatic longBitsToDouble : (J)D
    //   2871: dastore
    //   2872: dup
    //   2873: ldc2_w 1951704981
    //   2876: l2i
    //   2877: ldc_w 1951704978
    //   2880: ixor
    //   2881: ldc2_w 13.576042537007954
    //   2884: invokestatic doubleToLongBits : (D)J
    //   2887: ldc2_w 9213739939759874379
    //   2890: lxor
    //   2891: invokestatic longBitsToDouble : (J)D
    //   2894: dastore
    //   2895: dup
    //   2896: ldc2_w 1693070850
    //   2899: l2i
    //   2900: ldc_w 1693070858
    //   2903: ixor
    //   2904: ldc2_w 6.990903563185075
    //   2907: invokestatic doubleToLongBits : (D)J
    //   2910: ldc2_w 9216489429808148191
    //   2913: lxor
    //   2914: invokestatic longBitsToDouble : (J)D
    //   2917: dastore
    //   2918: dup
    //   2919: ldc2_w -400569318
    //   2922: l2i
    //   2923: ldc_w -400569325
    //   2926: ixor
    //   2927: ldc2_w 16.57944902846719
    //   2930: invokestatic doubleToLongBits : (D)J
    //   2933: ldc2_w 9208313315196229947
    //   2936: lxor
    //   2937: invokestatic longBitsToDouble : (J)D
    //   2940: dastore
    //   2941: dup
    //   2942: ldc2_w -259783131
    //   2945: l2i
    //   2946: ldc_w -259783121
    //   2949: ixor
    //   2950: ldc2_w 6.710225972031381
    //   2953: invokestatic doubleToLongBits : (D)J
    //   2956: ldc2_w 9215208922030655545
    //   2959: lxor
    //   2960: invokestatic longBitsToDouble : (J)D
    //   2963: dastore
    //   2964: dup
    //   2965: ldc2_w 1711685162
    //   2968: l2i
    //   2969: ldc_w 1711685153
    //   2972: ixor
    //   2973: ldc2_w 22.72239568406248
    //   2976: invokestatic doubleToLongBits : (D)J
    //   2979: ldc2_w 9207854116171921283
    //   2982: lxor
    //   2983: invokestatic longBitsToDouble : (J)D
    //   2986: dastore
    //   2987: dup
    //   2988: ldc2_w 1203068943
    //   2991: l2i
    //   2992: ldc_w 1203068931
    //   2995: ixor
    //   2996: ldc2_w 0.5809163508276065
    //   2999: invokestatic doubleToLongBits : (D)J
    //   3002: ldc2_w 9215271701052506964
    //   3005: lxor
    //   3006: invokestatic longBitsToDouble : (J)D
    //   3009: dastore
    //   3010: dup
    //   3011: ldc2_w -401890474
    //   3014: l2i
    //   3015: ldc_w -401890469
    //   3018: ixor
    //   3019: ldc2_w 0.04216683079606146
    //   3022: invokestatic doubleToLongBits : (D)J
    //   3025: ldc2_w 9198056321044508351
    //   3028: lxor
    //   3029: invokestatic longBitsToDouble : (J)D
    //   3032: dastore
    //   3033: dup
    //   3034: ldc2_w -1863707169
    //   3037: l2i
    //   3038: ldc_w -1863707183
    //   3041: ixor
    //   3042: ldc2_w 0.04584165512297343
    //   3045: invokestatic doubleToLongBits : (D)J
    //   3048: ldc2_w 9197485330042868943
    //   3051: lxor
    //   3052: invokestatic longBitsToDouble : (J)D
    //   3055: dastore
    //   3056: dup
    //   3057: ldc2_w -2086714467
    //   3060: l2i
    //   3061: ldc_w -2086714478
    //   3064: ixor
    //   3065: ldc2_w 0.16426433243741195
    //   3068: invokestatic doubleToLongBits : (D)J
    //   3071: ldc2_w 9206267955389460419
    //   3074: lxor
    //   3075: invokestatic longBitsToDouble : (J)D
    //   3078: dastore
    //   3079: dup
    //   3080: ldc2_w -2032519858
    //   3083: l2i
    //   3084: ldc_w -2032519842
    //   3087: ixor
    //   3088: ldc2_w 0.20742351834985265
    //   3091: invokestatic doubleToLongBits : (D)J
    //   3094: ldc2_w 9209728093541775495
    //   3097: lxor
    //   3098: invokestatic longBitsToDouble : (J)D
    //   3101: dastore
    //   3102: dup
    //   3103: ldc2_w 935707253
    //   3106: l2i
    //   3107: ldc_w 935707236
    //   3110: ixor
    //   3111: ldc2_w 0.9575214790183169
    //   3114: invokestatic doubleToLongBits : (D)J
    //   3117: ldc2_w 9217373646689178400
    //   3120: lxor
    //   3121: invokestatic longBitsToDouble : (J)D
    //   3124: dastore
    //   3125: dup
    //   3126: ldc2_w 1984362131
    //   3129: l2i
    //   3130: ldc_w 1984362113
    //   3133: ixor
    //   3134: ldc2_w 0.23237217236567453
    //   3137: invokestatic doubleToLongBits : (D)J
    //   3140: ldc2_w 9208327883701150551
    //   3143: lxor
    //   3144: invokestatic longBitsToDouble : (J)D
    //   3147: dastore
    //   3148: dup
    //   3149: ldc2_w -1040639774
    //   3152: l2i
    //   3153: ldc_w -1040639759
    //   3156: ixor
    //   3157: ldc2_w 0.26245159708629257
    //   3160: invokestatic doubleToLongBits : (D)J
    //   3163: ldc2_w 9212502358090610437
    //   3166: lxor
    //   3167: invokestatic longBitsToDouble : (J)D
    //   3170: dastore
    //   3171: dup
    //   3172: ldc2_w 1810644765
    //   3175: l2i
    //   3176: ldc_w 1810644745
    //   3179: ixor
    //   3180: ldc2_w 0.51950917852349
    //   3183: invokestatic doubleToLongBits : (D)J
    //   3186: ldc2_w 9217467969455441014
    //   3189: lxor
    //   3190: invokestatic longBitsToDouble : (J)D
    //   3193: dastore
    //   3194: dup
    //   3195: ldc2_w 434469006
    //   3198: l2i
    //   3199: ldc_w 434469019
    //   3202: ixor
    //   3203: ldc2_w 0.6655524199087487
    //   3206: invokestatic doubleToLongBits : (D)J
    //   3209: ldc2_w 9218372107612929672
    //   3212: lxor
    //   3213: invokestatic longBitsToDouble : (J)D
    //   3216: dastore
    //   3217: getstatic Perryc.0 : I
    //   3220: ifle -> 3234
    //   3223: ldc2_w 1273755702
    //   3226: l2i
    //   3227: ldc_w 1558531275
    //   3230: ixor
    //   3231: goto -> 3242
    //   3234: ldc2_w 466187131
    //   3237: l2i
    //   3238: ldc_w 1336072176
    //   3241: ixor
    //   3242: ldc2_w 1148801717
    //   3245: l2i
    //   3246: ldc_w 1558961399
    //   3249: ixor
    //   3250: ixor
    //   3251: lookupswitch default -> 3276, 261896895 -> 3578, 1053098242 -> 3234
    //   3276: putfield fourBlockPositions : [D
    //   3279: getstatic Perryc.1 : I
    //   3282: ifeq -> 3296
    //   3285: ldc2_w -38533943
    //   3288: l2i
    //   3289: ldc_w -1310279546
    //   3292: ixor
    //   3293: goto -> 3304
    //   3296: ldc2_w 1698371646
    //   3299: l2i
    //   3300: ldc_w 1647006452
    //   3303: ixor
    //   3304: ldc2_w 1216723644
    //   3307: l2i
    //   3308: ldc_w -686657268
    //   3311: ixor
    //   3312: ixor
    //   3313: lookupswitch default -> 3568, -1735949958 -> 3340, -742033409 -> 3296
    //   3340: aload_0
    //   3341: ldc2_w -1732393711
    //   3344: l2i
    //   3345: ldc_w -1732393711
    //   3348: ixor
    //   3349: newarray double
    //   3351: getstatic Perryc.1 : I
    //   3354: ifeq -> 3368
    //   3357: ldc2_w -2118991535
    //   3360: l2i
    //   3361: ldc_w -1619448627
    //   3364: ixor
    //   3365: goto -> 3376
    //   3368: ldc2_w 42604402
    //   3371: l2i
    //   3372: ldc_w 760766299
    //   3375: ixor
    //   3376: ldc2_w 1982081964
    //   3379: l2i
    //   3380: ldc_w -880556633
    //   3383: ixor
    //   3384: ixor
    //   3385: lookupswitch default -> 3610, -1837783518 -> 3412, -1553202281 -> 3368
    //   3412: putfield selectedPositions : [D
    //   3415: getstatic Perryc.0 : I
    //   3418: ifle -> 3432
    //   3421: ldc2_w -1253972366
    //   3424: l2i
    //   3425: ldc_w 1190129690
    //   3428: ixor
    //   3429: goto -> 3440
    //   3432: ldc2_w 1079161459
    //   3435: l2i
    //   3436: ldc_w -315484136
    //   3439: ixor
    //   3440: ldc2_w -511505168
    //   3443: l2i
    //   3444: ldc_w 1498939112
    //   3447: ixor
    //   3448: ixor
    //   3449: lookupswitch default -> 3560, 364140659 -> 3476, 1266345072 -> 3432
    //   3476: aload_0
    //   3477: getstatic Perryc.c : I
    //   3480: iflt -> 3494
    //   3483: ldc2_w 1667984731
    //   3486: l2i
    //   3487: ldc_w 1520151886
    //   3490: ixor
    //   3491: goto -> 3502
    //   3494: ldc2_w -1631504861
    //   3497: l2i
    //   3498: ldc_w 1199159474
    //   3501: ixor
    //   3502: ldc2_w 493179432
    //   3505: l2i
    //   3506: ldc_w 1954974731
    //   3509: ixor
    //   3510: ixor
    //   3511: lookupswitch default -> 3542, -1336192846 -> 3536, 1343430198 -> 3494
    //   3536: putstatic bigname/zprestige/webhack/features/modules/Movement/Step.instance : Lbigname/zprestige/webhack/features/modules/Movement/Step;
    //   3539: return
    //   3540: aconst_null
    //   3541: athrow
    //   3542: aconst_null
    //   3543: athrow
    //   3544: aconst_null
    //   3545: athrow
    //   3546: aconst_null
    //   3547: athrow
    //   3548: aconst_null
    //   3549: athrow
    //   3550: aconst_null
    //   3551: athrow
    //   3552: aconst_null
    //   3553: athrow
    //   3554: aconst_null
    //   3555: athrow
    //   3556: aconst_null
    //   3557: athrow
    //   3558: aconst_null
    //   3559: athrow
    //   3560: aconst_null
    //   3561: athrow
    //   3562: aconst_null
    //   3563: athrow
    //   3564: aconst_null
    //   3565: athrow
    //   3566: aconst_null
    //   3567: athrow
    //   3568: aconst_null
    //   3569: athrow
    //   3570: aconst_null
    //   3571: athrow
    //   3572: aconst_null
    //   3573: athrow
    //   3574: aconst_null
    //   3575: athrow
    //   3576: aconst_null
    //   3577: athrow
    //   3578: aconst_null
    //   3579: athrow
    //   3580: aconst_null
    //   3581: athrow
    //   3582: aconst_null
    //   3583: athrow
    //   3584: aconst_null
    //   3585: athrow
    //   3586: aconst_null
    //   3587: athrow
    //   3588: aconst_null
    //   3589: athrow
    //   3590: aconst_null
    //   3591: athrow
    //   3592: aconst_null
    //   3593: athrow
    //   3594: aconst_null
    //   3595: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3540	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Step;
  }
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 8635
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 8627
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 8619
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1899650425
    //   33: l2i
    //   34: ldc_w -1734108343
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1794366054
    //   44: l2i
    //   45: ldc_w 436119657
    //   48: ixor
    //   49: ldc2_w -1520385317
    //   52: l2i
    //   53: ldc_w -2014633906
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -888003419 -> 8442, -802116375 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -1170465554
    //   94: l2i
    //   95: ldc_w -494200064
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 684591683
    //   105: l2i
    //   106: ldc_w 477140816
    //   109: ixor
    //   110: ldc2_w 1887331791
    //   113: l2i
    //   114: ldc_w -1118543450
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 8496, -1784872057 -> 102, -107701894 -> 144
    //   144: getfield vanilla : Lbigname/zprestige/webhack/features/setting/Setting;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w 1870036750
    //   156: l2i
    //   157: ldc_w 1520084038
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 167041245
    //   167: l2i
    //   168: ldc_w -1718900014
    //   171: ixor
    //   172: ldc2_w -303089971
    //   175: l2i
    //   176: ldc_w -763835606
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 8452, -1343713304 -> 208, 175842991 -> 164
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getValue : ()Ljava/lang/Object;
    //   215: goto -> 219
    //   218: athrow
    //   219: checkcast java/lang/Boolean
    //   222: getstatic Perryc.0 : I
    //   225: ifle -> 239
    //   228: ldc2_w -1327010343
    //   231: l2i
    //   232: ldc_w 283583979
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w -986449016
    //   242: l2i
    //   243: ldc_w -1469989330
    //   246: ixor
    //   247: ldc2_w -211585458
    //   250: l2i
    //   251: ldc_w 1862952871
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 284, -1895765986 -> 239, 1013537243 -> 8518
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual booleanValue : ()Z
    //   291: goto -> 295
    //   294: athrow
    //   295: ifeq -> 309
    //   298: ldc2_w 902798263
    //   301: l2i
    //   302: ldc_w -1855724974
    //   305: ixor
    //   306: goto -> 317
    //   309: ldc2_w -972789423
    //   312: l2i
    //   313: ldc_w 1655181483
    //   316: ixor
    //   317: ldc2_w -586441560
    //   320: l2i
    //   321: ldc_w 403260450
    //   324: ixor
    //   325: ixor
    //   326: tableswitch default -> 298, 1638834543 -> 348, 1638834544 -> 812
    //   348: getstatic Perryc.0 : I
    //   351: ifle -> 365
    //   354: ldc2_w -1804663807
    //   357: l2i
    //   358: ldc_w 144881754
    //   361: ixor
    //   362: goto -> 373
    //   365: ldc2_w 446314377
    //   368: l2i
    //   369: ldc_w 506027567
    //   372: ixor
    //   373: ldc2_w 966140079
    //   376: l2i
    //   377: ldc_w -960297763
    //   380: ixor
    //   381: ixor
    //   382: lookupswitch default -> 8534, -68792876 -> 408, 1670944809 -> 365
    //   408: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   411: getstatic Perryc.0 : I
    //   414: ifle -> 428
    //   417: ldc2_w -1281036496
    //   420: l2i
    //   421: ldc_w -1713514945
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -148802418
    //   431: l2i
    //   432: ldc_w 1513087961
    //   435: ixor
    //   436: ldc2_w -1691348066
    //   439: l2i
    //   440: ldc_w -412612407
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 8590, -782857216 -> 472, 1445012056 -> 428
    //   472: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w -1056012720
    //   484: l2i
    //   485: ldc_w -1628044577
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 9680263
    //   495: l2i
    //   496: ldc_w -1120711424
    //   499: ixor
    //   500: ldc2_w 1417598611
    //   503: l2i
    //   504: ldc_w -1047003910
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 8524, -904810778 -> 492, 675926766 -> 536
    //   536: aload_0
    //   537: getstatic Perryc.1 : I
    //   540: ifeq -> 554
    //   543: ldc2_w -545258895
    //   546: l2i
    //   547: ldc_w 731990615
    //   550: ixor
    //   551: goto -> 562
    //   554: ldc2_w 193474452
    //   557: l2i
    //   558: ldc_w -380684353
    //   561: ixor
    //   562: ldc2_w 1940787590
    //   565: l2i
    //   566: ldc_w -261248892
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 8406, 1627693353 -> 596, 2011361572 -> 554
    //   596: getfield stepHeight : Lbigname/zprestige/webhack/features/setting/Setting;
    //   599: getstatic Perryc.0 : I
    //   602: ifle -> 616
    //   605: ldc2_w 1292892953
    //   608: l2i
    //   609: ldc_w 642603350
    //   612: ixor
    //   613: goto -> 624
    //   616: ldc2_w 214689740
    //   619: l2i
    //   620: ldc_w -469358426
    //   623: ixor
    //   624: ldc2_w 1496064592
    //   627: l2i
    //   628: ldc_w 163656666
    //   631: ixor
    //   632: ixor
    //   633: lookupswitch default -> 660, 1001370565 -> 8564, 1130037167 -> 616
    //   660: goto -> 664
    //   663: athrow
    //   664: invokevirtual getValue : ()Ljava/lang/Object;
    //   667: goto -> 671
    //   670: athrow
    //   671: checkcast java/lang/Integer
    //   674: getstatic Perryc.c : I
    //   677: iflt -> 691
    //   680: ldc2_w -1269775724
    //   683: l2i
    //   684: ldc_w -1232571675
    //   687: ixor
    //   688: goto -> 699
    //   691: ldc2_w -995113883
    //   694: l2i
    //   695: ldc_w 1931321365
    //   698: ixor
    //   699: ldc2_w 1083952904
    //   702: l2i
    //   703: ldc_w -684992383
    //   706: ixor
    //   707: ixor
    //   708: lookupswitch default -> 8434, -1788303368 -> 691, 537031673 -> 736
    //   736: goto -> 740
    //   739: athrow
    //   740: invokevirtual floatValue : ()F
    //   743: goto -> 747
    //   746: athrow
    //   747: getstatic Perryc.1 : I
    //   750: ifeq -> 764
    //   753: ldc2_w 574237125
    //   756: l2i
    //   757: ldc_w 396209564
    //   760: ixor
    //   761: goto -> 772
    //   764: ldc2_w -1714880246
    //   767: l2i
    //   768: ldc_w 346029088
    //   771: ixor
    //   772: ldc2_w -393024826
    //   775: l2i
    //   776: ldc_w -1340275786
    //   779: ixor
    //   780: ixor
    //   781: lookupswitch default -> 808, -332641967 -> 764, 1831365929 -> 8584
    //   808: putfield field_70138_W : F
    //   811: return
    //   812: getstatic Perryc.c : I
    //   815: iflt -> 829
    //   818: ldc2_w 1192443134
    //   821: l2i
    //   822: ldc_w -2026692603
    //   825: ixor
    //   826: goto -> 837
    //   829: ldc2_w -1947139103
    //   832: l2i
    //   833: ldc_w -378394709
    //   836: ixor
    //   837: ldc2_w -1819985760
    //   840: l2i
    //   841: ldc_w -288838984
    //   844: ixor
    //   845: ixor
    //   846: lookupswitch default -> 872, -1275426379 -> 829, -1116893469 -> 8396
    //   872: aload_0
    //   873: getstatic Perryc.1 : I
    //   876: ifeq -> 890
    //   879: ldc2_w -1411044100
    //   882: l2i
    //   883: ldc_w -893975531
    //   886: ixor
    //   887: goto -> 898
    //   890: ldc2_w 1815628641
    //   893: l2i
    //   894: ldc_w -1826818535
    //   897: ixor
    //   898: ldc2_w 1013864520
    //   901: l2i
    //   902: ldc_w -155441957
    //   905: ixor
    //   906: ixor
    //   907: lookupswitch default -> 932, -1417653126 -> 8580, -514152084 -> 890
    //   932: getfield stepHeight : Lbigname/zprestige/webhack/features/setting/Setting;
    //   935: getstatic Perryc.1 : I
    //   938: ifeq -> 952
    //   941: ldc2_w 122858031
    //   944: l2i
    //   945: ldc_w -738232081
    //   948: ixor
    //   949: goto -> 960
    //   952: ldc2_w 233012622
    //   955: l2i
    //   956: ldc_w -140948199
    //   959: ixor
    //   960: ldc2_w -1923523696
    //   963: l2i
    //   964: ldc_w -1264338661
    //   967: ixor
    //   968: ixor
    //   969: lookupswitch default -> 996, -313053109 -> 8418, 1367023431 -> 952
    //   996: goto -> 1000
    //   999: athrow
    //   1000: invokevirtual getValue : ()Ljava/lang/Object;
    //   1003: goto -> 1007
    //   1006: athrow
    //   1007: checkcast java/lang/Integer
    //   1010: getstatic Perryc.1 : I
    //   1013: ifeq -> 1027
    //   1016: ldc2_w -20910722
    //   1019: l2i
    //   1020: ldc_w 1430648261
    //   1023: ixor
    //   1024: goto -> 1035
    //   1027: ldc2_w 519192307
    //   1030: l2i
    //   1031: ldc_w 597142648
    //   1034: ixor
    //   1035: ldc2_w 1697575933
    //   1038: l2i
    //   1039: ldc_w 2066116512
    //   1042: ixor
    //   1043: ixor
    //   1044: lookupswitch default -> 8520, -1249016602 -> 1027, 594349782 -> 1072
    //   1072: goto -> 1076
    //   1075: athrow
    //   1076: invokevirtual intValue : ()I
    //   1079: goto -> 1083
    //   1082: athrow
    //   1083: tableswitch default -> 2115, 1 -> 1112, 2 -> 1362, 3 -> 1618, 4 -> 1867
    //   1112: getstatic Perryc.0 : I
    //   1115: ifle -> 1129
    //   1118: ldc2_w -1360595604
    //   1121: l2i
    //   1122: ldc_w -1554696752
    //   1125: ixor
    //   1126: goto -> 1137
    //   1129: ldc2_w -1598739227
    //   1132: l2i
    //   1133: ldc_w 1690103079
    //   1136: ixor
    //   1137: ldc2_w -237443799
    //   1140: l2i
    //   1141: ldc_w -1440588499
    //   1144: ixor
    //   1145: ixor
    //   1146: lookupswitch default -> 8456, -1611433530 -> 1172, 1447655608 -> 1129
    //   1172: aload_0
    //   1173: getstatic Perryc.0 : I
    //   1176: ifle -> 1190
    //   1179: ldc2_w -639240050
    //   1182: l2i
    //   1183: ldc_w 1353316272
    //   1186: ixor
    //   1187: goto -> 1198
    //   1190: ldc2_w 883611520
    //   1193: l2i
    //   1194: ldc_w -377193380
    //   1197: ixor
    //   1198: ldc2_w -130347302
    //   1201: l2i
    //   1202: ldc_w 1351307768
    //   1205: ixor
    //   1206: ixor
    //   1207: lookupswitch default -> 1232, 570183708 -> 8464, 1574605871 -> 1190
    //   1232: aload_0
    //   1233: getstatic Perryc.c : I
    //   1236: iflt -> 1250
    //   1239: ldc2_w 2115360550
    //   1242: l2i
    //   1243: ldc_w 1861116343
    //   1246: ixor
    //   1247: goto -> 1258
    //   1250: ldc2_w -337150707
    //   1253: l2i
    //   1254: ldc_w 1268004921
    //   1257: ixor
    //   1258: ldc2_w 2054789779
    //   1261: l2i
    //   1262: ldc_w -153006660
    //   1265: ixor
    //   1266: ixor
    //   1267: lookupswitch default -> 1292, -1671208514 -> 8594, -1251853288 -> 1250
    //   1292: getfield oneblockPositions : [D
    //   1295: getstatic Perryc.c : I
    //   1298: iflt -> 1312
    //   1301: ldc2_w 929922185
    //   1304: l2i
    //   1305: ldc_w 622530959
    //   1308: ixor
    //   1309: goto -> 1320
    //   1312: ldc2_w -1465299791
    //   1315: l2i
    //   1316: ldc_w -1421528860
    //   1319: ixor
    //   1320: ldc2_w 1976623458
    //   1323: l2i
    //   1324: ldc_w 535895314
    //   1327: ixor
    //   1328: ixor
    //   1329: lookupswitch default -> 1356, 1147331451 -> 1312, 2019004790 -> 8502
    //   1356: putfield selectedPositions : [D
    //   1359: goto -> 2115
    //   1362: getstatic Perryc.1 : I
    //   1365: ifeq -> 1379
    //   1368: ldc2_w -1171923615
    //   1371: l2i
    //   1372: ldc_w -1692605423
    //   1375: ixor
    //   1376: goto -> 1387
    //   1379: ldc2_w -209737325
    //   1382: l2i
    //   1383: ldc_w 1795142581
    //   1386: ixor
    //   1387: ldc2_w 362036998
    //   1390: l2i
    //   1391: ldc_w -1511524320
    //   1394: ixor
    //   1395: ixor
    //   1396: lookupswitch default -> 8582, -1857356202 -> 1379, 703847680 -> 1424
    //   1424: aload_0
    //   1425: getstatic Perryc.1 : I
    //   1428: ifeq -> 1442
    //   1431: ldc2_w -112990620
    //   1434: l2i
    //   1435: ldc_w -1784844635
    //   1438: ixor
    //   1439: goto -> 1450
    //   1442: ldc2_w 1593295276
    //   1445: l2i
    //   1446: ldc_w -91491474
    //   1449: ixor
    //   1450: ldc2_w 984592232
    //   1453: l2i
    //   1454: ldc_w 693251758
    //   1457: ixor
    //   1458: ixor
    //   1459: lookupswitch default -> 8438, -1216236796 -> 1484, 2133002503 -> 1442
    //   1484: aload_0
    //   1485: getstatic Perryc.c : I
    //   1488: iflt -> 1502
    //   1491: ldc2_w -4999268
    //   1494: l2i
    //   1495: ldc_w 1966073056
    //   1498: ixor
    //   1499: goto -> 1510
    //   1502: ldc2_w 947504799
    //   1505: l2i
    //   1506: ldc_w 1290923074
    //   1509: ixor
    //   1510: ldc2_w 403415587
    //   1513: l2i
    //   1514: ldc_w 2122822363
    //   1517: ixor
    //   1518: ixor
    //   1519: lookupswitch default -> 1544, -334478460 -> 8550, 1793691475 -> 1502
    //   1544: getfield futurePositions : [D
    //   1547: checkcast [D
    //   1550: getstatic Perryc.c : I
    //   1553: iflt -> 1567
    //   1556: ldc2_w 619591732
    //   1559: l2i
    //   1560: ldc_w 2111131109
    //   1563: ixor
    //   1564: goto -> 1575
    //   1567: ldc2_w -1285522197
    //   1570: l2i
    //   1571: ldc_w 1783686675
    //   1574: ixor
    //   1575: ldc2_w -1550559800
    //   1578: l2i
    //   1579: ldc_w 608739004
    //   1582: ixor
    //   1583: ixor
    //   1584: lookupswitch default -> 1612, -1781587034 -> 1567, -555237723 -> 8560
    //   1612: putfield selectedPositions : [D
    //   1615: goto -> 2115
    //   1618: getstatic Perryc.0 : I
    //   1621: ifle -> 1635
    //   1624: ldc2_w -692536758
    //   1627: l2i
    //   1628: ldc_w 1900027678
    //   1631: ixor
    //   1632: goto -> 1643
    //   1635: ldc2_w -733503805
    //   1638: l2i
    //   1639: ldc_w -2056897443
    //   1642: ixor
    //   1643: ldc2_w -950337847
    //   1646: l2i
    //   1647: ldc_w 306069137
    //   1650: ixor
    //   1651: ixor
    //   1652: lookupswitch default -> 1680, -249904885 -> 1635, 1922852108 -> 8458
    //   1680: aload_0
    //   1681: getstatic Perryc.c : I
    //   1684: iflt -> 1698
    //   1687: ldc2_w -278165307
    //   1690: l2i
    //   1691: ldc_w -724985476
    //   1694: ixor
    //   1695: goto -> 1706
    //   1698: ldc2_w 1050409610
    //   1701: l2i
    //   1702: ldc_w 1194348885
    //   1705: ixor
    //   1706: ldc2_w -1525899945
    //   1709: l2i
    //   1710: ldc_w 1637292964
    //   1713: ixor
    //   1714: ixor
    //   1715: lookupswitch default -> 8498, -1120916180 -> 1740, -13002934 -> 1698
    //   1740: aload_0
    //   1741: getstatic Perryc.c : I
    //   1744: iflt -> 1758
    //   1747: ldc2_w 795398393
    //   1750: l2i
    //   1751: ldc_w 1412503581
    //   1754: ixor
    //   1755: goto -> 1766
    //   1758: ldc2_w 1567337011
    //   1761: l2i
    //   1762: ldc_w -2018799237
    //   1765: ixor
    //   1766: ldc2_w -393580303
    //   1769: l2i
    //   1770: ldc_w 1108400528
    //   1773: ixor
    //   1774: ixor
    //   1775: lookupswitch default -> 8428, -775724667 -> 1758, 1884983849 -> 1800
    //   1800: getfield twoFiveOffset : [D
    //   1803: getstatic Perryc.0 : I
    //   1806: ifle -> 1820
    //   1809: ldc2_w 1544524335
    //   1812: l2i
    //   1813: ldc_w -2056601578
    //   1816: ixor
    //   1817: goto -> 1828
    //   1820: ldc2_w 1657028584
    //   1823: l2i
    //   1824: ldc_w -1575418689
    //   1827: ixor
    //   1828: ldc2_w -1502567264
    //   1831: l2i
    //   1832: ldc_w 743340017
    //   1835: ixor
    //   1836: ixor
    //   1837: lookupswitch default -> 8608, 1256450054 -> 1864, 1398505832 -> 1820
    //   1864: putfield selectedPositions : [D
    //   1867: getstatic Perryc.c : I
    //   1870: iflt -> 1884
    //   1873: ldc2_w -1022316370
    //   1876: l2i
    //   1877: ldc_w -2102555944
    //   1880: ixor
    //   1881: goto -> 1892
    //   1884: ldc2_w 199668572
    //   1887: l2i
    //   1888: ldc_w -1288768563
    //   1891: ixor
    //   1892: ldc2_w -1498821605
    //   1895: l2i
    //   1896: ldc_w 2122130642
    //   1899: ixor
    //   1900: ixor
    //   1901: lookupswitch default -> 1928, -1721118017 -> 8470, 923180853 -> 1884
    //   1928: aload_0
    //   1929: getstatic Perryc.0 : I
    //   1932: ifle -> 1946
    //   1935: ldc2_w -1422901187
    //   1938: l2i
    //   1939: ldc_w -1872059756
    //   1942: ixor
    //   1943: goto -> 1954
    //   1946: ldc2_w -1472299266
    //   1949: l2i
    //   1950: ldc_w -611698127
    //   1953: ixor
    //   1954: ldc2_w 176417836
    //   1957: l2i
    //   1958: ldc_w -1023432332
    //   1961: ixor
    //   1962: ixor
    //   1963: lookupswitch default -> 8376, -1144520297 -> 1988, -215570447 -> 1946
    //   1988: aload_0
    //   1989: getstatic Perryc.c : I
    //   1992: iflt -> 2006
    //   1995: ldc2_w 261982157
    //   1998: l2i
    //   1999: ldc_w 279900978
    //   2002: ixor
    //   2003: goto -> 2014
    //   2006: ldc2_w -201178310
    //   2009: l2i
    //   2010: ldc_w -629984044
    //   2013: ixor
    //   2014: ldc2_w 1215848925
    //   2017: l2i
    //   2018: ldc_w 1078974244
    //   2021: ixor
    //   2022: ixor
    //   2023: lookupswitch default -> 8526, 386187782 -> 2006, 642171159 -> 2048
    //   2048: getfield fourBlockPositions : [D
    //   2051: getstatic Perryc.0 : I
    //   2054: ifle -> 2068
    //   2057: ldc2_w -561558505
    //   2060: l2i
    //   2061: ldc_w 648772067
    //   2064: ixor
    //   2065: goto -> 2076
    //   2068: ldc2_w 2042630498
    //   2071: l2i
    //   2072: ldc_w -761126242
    //   2075: ixor
    //   2076: ldc2_w -2050727893
    //   2079: l2i
    //   2080: ldc_w -1671388377
    //   2083: ixor
    //   2084: ixor
    //   2085: lookupswitch default -> 8576, -1295585040 -> 2112, -511117576 -> 2068
    //   2112: putfield selectedPositions : [D
    //   2115: getstatic Perryc.c : I
    //   2118: iflt -> 2132
    //   2121: ldc2_w -1740675505
    //   2124: l2i
    //   2125: ldc_w 2032887474
    //   2128: ixor
    //   2129: goto -> 2140
    //   2132: ldc2_w -823143465
    //   2135: l2i
    //   2136: ldc_w 143741272
    //   2139: ixor
    //   2140: ldc2_w 1707780357
    //   2143: l2i
    //   2144: ldc_w -1848348000
    //   2147: ixor
    //   2148: ixor
    //   2149: lookupswitch default -> 2176, 353033048 -> 8390, 1171489412 -> 2132
    //   2176: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   2179: getstatic Perryc.0 : I
    //   2182: ifle -> 2196
    //   2185: ldc2_w -1630638586
    //   2188: l2i
    //   2189: ldc_w 417476924
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w -1376610085
    //   2199: l2i
    //   2200: ldc_w -1113455869
    //   2203: ixor
    //   2204: ldc2_w 302745601
    //   2207: l2i
    //   2208: ldc_w -2649126
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 2240, 676569875 -> 2196, 1810908385 -> 8538
    //   2240: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2243: getstatic Perryc.1 : I
    //   2246: ifeq -> 2260
    //   2249: ldc2_w -803575086
    //   2252: l2i
    //   2253: ldc_w -987122751
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w 927272783
    //   2263: l2i
    //   2264: ldc_w -1279356789
    //   2267: ixor
    //   2268: ldc2_w 1255225031
    //   2271: l2i
    //   2272: ldc_w 1777837530
    //   2275: ixor
    //   2276: ixor
    //   2277: lookupswitch default -> 2304, 20065412 -> 2260, 907364878 -> 8588
    //   2304: getfield field_70123_F : Z
    //   2307: ifeq -> 2321
    //   2310: ldc2_w -872680259
    //   2313: l2i
    //   2314: ldc_w -655553921
    //   2317: ixor
    //   2318: goto -> 2329
    //   2321: ldc2_w 619479375
    //   2324: l2i
    //   2325: ldc_w 939163522
    //   2328: ixor
    //   2329: ldc2_w 742660713
    //   2332: l2i
    //   2333: ldc_w 21228364
    //   2336: ixor
    //   2337: ixor
    //   2338: tableswitch default -> 2310, 1041305575 -> 2360, 1041305576 -> 2803
    //   2360: getstatic Perryc.c : I
    //   2363: iflt -> 2377
    //   2366: ldc2_w -1751824139
    //   2369: l2i
    //   2370: ldc_w 1700216426
    //   2373: ixor
    //   2374: goto -> 2385
    //   2377: ldc2_w -1431082473
    //   2380: l2i
    //   2381: ldc_w -781620005
    //   2384: ixor
    //   2385: ldc2_w -815776043
    //   2388: l2i
    //   2389: ldc_w 621288894
    //   2392: ixor
    //   2393: ixor
    //   2394: lookupswitch default -> 2420, -919953462 -> 2377, 413816308 -> 8388
    //   2420: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   2423: getstatic Perryc.1 : I
    //   2426: ifeq -> 2440
    //   2429: ldc2_w -1025856296
    //   2432: l2i
    //   2433: ldc_w 1798644457
    //   2436: ixor
    //   2437: goto -> 2448
    //   2440: ldc2_w -1347680418
    //   2443: l2i
    //   2444: ldc_w -363975592
    //   2447: ixor
    //   2448: ldc2_w 577557945
    //   2451: l2i
    //   2452: ldc_w 2078501547
    //   2455: ixor
    //   2456: ixor
    //   2457: lookupswitch default -> 8540, -262131421 -> 2440, 476943380 -> 2484
    //   2484: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2487: getstatic Perryc.1 : I
    //   2490: ifeq -> 2504
    //   2493: ldc2_w 678701962
    //   2496: l2i
    //   2497: ldc_w 1187582435
    //   2500: ixor
    //   2501: goto -> 2512
    //   2504: ldc2_w 2076564723
    //   2507: l2i
    //   2508: ldc_w -1214495312
    //   2511: ixor
    //   2512: ldc2_w -1872013983
    //   2515: l2i
    //   2516: ldc_w -1172713644
    //   2519: ixor
    //   2520: ixor
    //   2521: lookupswitch default -> 8546, -433388682 -> 2548, 1154457692 -> 2504
    //   2548: getfield field_70122_E : Z
    //   2551: ifeq -> 2565
    //   2554: ldc2_w 2105003438
    //   2557: l2i
    //   2558: ldc_w -1985845121
    //   2561: ixor
    //   2562: goto -> 2573
    //   2565: ldc2_w 1785045824
    //   2568: l2i
    //   2569: ldc_w -1632631150
    //   2572: ixor
    //   2573: ldc2_w -654989623
    //   2576: l2i
    //   2577: ldc_w 1073425753
    //   2580: ixor
    //   2581: ixor
    //   2582: tableswitch default -> 2554, 333131329 -> 2604, 333131330 -> 2803
    //   2604: getstatic Perryc.c : I
    //   2607: iflt -> 2621
    //   2610: ldc2_w -316643897
    //   2613: l2i
    //   2614: ldc_w 1104179061
    //   2617: ixor
    //   2618: goto -> 2629
    //   2621: ldc2_w 1750539875
    //   2624: l2i
    //   2625: ldc_w -777128731
    //   2628: ixor
    //   2629: ldc2_w -1918453867
    //   2632: l2i
    //   2633: ldc_w 1274150060
    //   2636: ixor
    //   2637: ixor
    //   2638: lookupswitch default -> 8432, 1789346187 -> 2621, 2142085567 -> 2664
    //   2664: aload_0
    //   2665: dup
    //   2666: getstatic Perryc.1 : I
    //   2669: ifeq -> 2683
    //   2672: ldc2_w 1006915031
    //   2675: l2i
    //   2676: ldc_w -511055594
    //   2679: ixor
    //   2680: goto -> 2691
    //   2683: ldc2_w -618941039
    //   2686: l2i
    //   2687: ldc_w 1997398620
    //   2690: ixor
    //   2691: ldc2_w 393620348
    //   2694: l2i
    //   2695: ldc_w -1120766715
    //   2698: ixor
    //   2699: ixor
    //   2700: lookupswitch default -> 2728, -786251889 -> 2683, 2009725624 -> 8474
    //   2728: getfield packets : I
    //   2731: ldc2_w 548781745
    //   2734: l2i
    //   2735: ldc_w 548781744
    //   2738: ixor
    //   2739: iadd
    //   2740: getstatic Perryc.1 : I
    //   2743: ifeq -> 2757
    //   2746: ldc2_w 1839286999
    //   2749: l2i
    //   2750: ldc_w 1734729080
    //   2753: ixor
    //   2754: goto -> 2765
    //   2757: ldc2_w -5780901
    //   2760: l2i
    //   2761: ldc_w 1846140664
    //   2764: ixor
    //   2765: ldc2_w -785986821
    //   2768: l2i
    //   2769: ldc_w -303722337
    //   2772: ixor
    //   2773: ixor
    //   2774: lookupswitch default -> 8402, -1385345337 -> 2800, 906481099 -> 2757
    //   2800: putfield packets : I
    //   2803: getstatic Perryc.1 : I
    //   2806: ifeq -> 2820
    //   2809: ldc2_w 1163448897
    //   2812: l2i
    //   2813: ldc_w -1879085728
    //   2816: ixor
    //   2817: goto -> 2828
    //   2820: ldc2_w -2121811729
    //   2823: l2i
    //   2824: ldc_w 1047432561
    //   2827: ixor
    //   2828: ldc2_w -642923309
    //   2831: l2i
    //   2832: ldc_w -1044462594
    //   2835: ixor
    //   2836: ixor
    //   2837: lookupswitch default -> 2864, -759908340 -> 8476, 2008428888 -> 2820
    //   2864: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   2867: getstatic Perryc.0 : I
    //   2870: ifle -> 2884
    //   2873: ldc2_w -720233329
    //   2876: l2i
    //   2877: ldc_w 582507050
    //   2880: ixor
    //   2881: goto -> 2892
    //   2884: ldc2_w 152218399
    //   2887: l2i
    //   2888: ldc_w 1933486650
    //   2891: ixor
    //   2892: ldc2_w -939619275
    //   2895: l2i
    //   2896: ldc_w 813519882
    //   2899: ixor
    //   2900: ixor
    //   2901: lookupswitch default -> 8570, -1917855462 -> 2928, 2727578 -> 2884
    //   2928: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2931: getstatic Perryc.1 : I
    //   2934: ifeq -> 2948
    //   2937: ldc2_w 486196899
    //   2940: l2i
    //   2941: ldc_w 1553508912
    //   2944: ixor
    //   2945: goto -> 2956
    //   2948: ldc2_w 514311411
    //   2951: l2i
    //   2952: ldc_w 1628814240
    //   2955: ixor
    //   2956: ldc2_w 816408569
    //   2959: l2i
    //   2960: ldc_w 1409649921
    //   2963: ixor
    //   2964: ixor
    //   2965: lookupswitch default -> 2992, 617514603 -> 8400, 1502662227 -> 2948
    //   2992: getfield field_70122_E : Z
    //   2995: ifeq -> 3009
    //   2998: ldc2_w -1238967552
    //   3001: l2i
    //   3002: ldc_w 2092865083
    //   3005: ixor
    //   3006: goto -> 3017
    //   3009: ldc2_w -93324078
    //   3012: l2i
    //   3013: ldc_w 821539306
    //   3016: ixor
    //   3017: ldc2_w -868890136
    //   3020: l2i
    //   3021: ldc_w -1972812550
    //   3024: ixor
    //   3025: ixor
    //   3026: tableswitch default -> 2998, -1933262807 -> 3048, -1933262806 -> 8375
    //   3048: getstatic Perryc.1 : I
    //   3051: ifeq -> 3065
    //   3054: ldc2_w -2041945387
    //   3057: l2i
    //   3058: ldc_w -1800804450
    //   3061: ixor
    //   3062: goto -> 3073
    //   3065: ldc2_w 974833842
    //   3068: l2i
    //   3069: ldc_w 797560099
    //   3072: ixor
    //   3073: ldc2_w -1149515203
    //   3076: l2i
    //   3077: ldc_w -66702280
    //   3080: ixor
    //   3081: ixor
    //   3082: lookupswitch default -> 8466, 1391393684 -> 3108, 1436449614 -> 3065
    //   3108: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   3111: getstatic Perryc.0 : I
    //   3114: ifle -> 3128
    //   3117: ldc2_w 1499821508
    //   3120: l2i
    //   3121: ldc_w 1629474960
    //   3124: ixor
    //   3125: goto -> 3136
    //   3128: ldc2_w -153751478
    //   3131: l2i
    //   3132: ldc_w -967288046
    //   3135: ixor
    //   3136: ldc2_w 1825166680
    //   3139: l2i
    //   3140: ldc_w 1514176284
    //   3143: ixor
    //   3144: ixor
    //   3145: lookupswitch default -> 8454, 100925724 -> 3172, 250810128 -> 3128
    //   3172: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3175: getstatic Perryc.0 : I
    //   3178: ifle -> 3192
    //   3181: ldc2_w 802811527
    //   3184: l2i
    //   3185: ldc_w 1226362640
    //   3188: ixor
    //   3189: goto -> 3200
    //   3192: ldc2_w 695513573
    //   3195: l2i
    //   3196: ldc_w -249934259
    //   3199: ixor
    //   3200: ldc2_w -479179763
    //   3203: l2i
    //   3204: ldc_w -496356030
    //   3207: ixor
    //   3208: ixor
    //   3209: lookupswitch default -> 8548, -646674713 -> 3236, 1742428376 -> 3192
    //   3236: getstatic net/minecraft/block/material/Material.field_151586_h : Lnet/minecraft/block/material/Material;
    //   3239: getstatic Perryc.c : I
    //   3242: iflt -> 3256
    //   3245: ldc2_w -1985809348
    //   3248: l2i
    //   3249: ldc_w 1480264406
    //   3252: ixor
    //   3253: goto -> 3264
    //   3256: ldc2_w 1939495161
    //   3259: l2i
    //   3260: ldc_w 1043968757
    //   3263: ixor
    //   3264: ldc2_w -1134344431
    //   3267: l2i
    //   3268: ldc_w -202481061
    //   3271: ixor
    //   3272: ixor
    //   3273: lookupswitch default -> 3300, -1642800224 -> 8558, 2084216160 -> 3256
    //   3300: goto -> 3304
    //   3303: athrow
    //   3304: invokevirtual func_70055_a : (Lnet/minecraft/block/material/Material;)Z
    //   3307: goto -> 3311
    //   3310: athrow
    //   3311: ifne -> 3325
    //   3314: ldc2_w -824626748
    //   3317: l2i
    //   3318: ldc_w -256984700
    //   3321: ixor
    //   3322: goto -> 3333
    //   3325: ldc2_w 1005494296
    //   3328: l2i
    //   3329: ldc_w 93923419
    //   3332: ixor
    //   3333: ldc2_w -1203007637
    //   3336: l2i
    //   3337: ldc_w -168922150
    //   3340: ixor
    //   3341: ixor
    //   3342: tableswitch default -> 3314, 1943172337 -> 3364, 1943172338 -> 8375
    //   3364: getstatic Perryc.c : I
    //   3367: iflt -> 3381
    //   3370: ldc2_w -341922959
    //   3373: l2i
    //   3374: ldc_w 1904395473
    //   3377: ixor
    //   3378: goto -> 3389
    //   3381: ldc2_w -1618693823
    //   3384: l2i
    //   3385: ldc_w -680303368
    //   3388: ixor
    //   3389: ldc2_w -1841651479
    //   3392: l2i
    //   3393: ldc_w -1419927067
    //   3396: ixor
    //   3397: ixor
    //   3398: lookupswitch default -> 8572, -1552191828 -> 3381, 1905317045 -> 3424
    //   3424: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   3427: getstatic Perryc.1 : I
    //   3430: ifeq -> 3444
    //   3433: ldc2_w -357883187
    //   3436: l2i
    //   3437: ldc_w 248456512
    //   3440: ixor
    //   3441: goto -> 3452
    //   3444: ldc2_w 84837198
    //   3447: l2i
    //   3448: ldc_w 436843087
    //   3451: ixor
    //   3452: ldc2_w -215015071
    //   3455: l2i
    //   3456: ldc_w 1188022804
    //   3459: ixor
    //   3460: ixor
    //   3461: lookupswitch default -> 8562, -1427645836 -> 3488, 1367665912 -> 3444
    //   3488: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3491: getstatic Perryc.0 : I
    //   3494: ifle -> 3508
    //   3497: ldc2_w -1368220473
    //   3500: l2i
    //   3501: ldc_w 698562516
    //   3504: ixor
    //   3505: goto -> 3516
    //   3508: ldc2_w -1718054045
    //   3511: l2i
    //   3512: ldc_w -962581879
    //   3515: ixor
    //   3516: ldc2_w -690508594
    //   3519: l2i
    //   3520: ldc_w -1148648112
    //   3523: ixor
    //   3524: ixor
    //   3525: lookupswitch default -> 8448, -359726451 -> 3508, 845549684 -> 3552
    //   3552: getstatic net/minecraft/block/material/Material.field_151587_i : Lnet/minecraft/block/material/Material;
    //   3555: getstatic Perryc.c : I
    //   3558: iflt -> 3572
    //   3561: ldc2_w -226311557
    //   3564: l2i
    //   3565: ldc_w 411637693
    //   3568: ixor
    //   3569: goto -> 3580
    //   3572: ldc2_w -1835654039
    //   3575: l2i
    //   3576: ldc_w 577298424
    //   3579: ixor
    //   3580: ldc2_w -1606924830
    //   3583: l2i
    //   3584: ldc_w 1438617679
    //   3587: ixor
    //   3588: ixor
    //   3589: lookupswitch default -> 8500, 529268843 -> 3572, 1165569596 -> 3616
    //   3616: goto -> 3620
    //   3619: athrow
    //   3620: invokevirtual func_70055_a : (Lnet/minecraft/block/material/Material;)Z
    //   3623: goto -> 3627
    //   3626: athrow
    //   3627: ifne -> 3641
    //   3630: ldc2_w -560094811
    //   3633: l2i
    //   3634: ldc_w -638845628
    //   3637: ixor
    //   3638: goto -> 3649
    //   3641: ldc2_w 1882396535
    //   3644: l2i
    //   3645: ldc_w 2001030037
    //   3648: ixor
    //   3649: ldc2_w 504581843
    //   3652: l2i
    //   3653: ldc_w 147108327
    //   3656: ixor
    //   3657: ixor
    //   3658: tableswitch default -> 3630, 295805909 -> 3680, 295805910 -> 8375
    //   3680: getstatic Perryc.c : I
    //   3683: iflt -> 3697
    //   3686: ldc2_w 663329337
    //   3689: l2i
    //   3690: ldc_w 1366401050
    //   3693: ixor
    //   3694: goto -> 3705
    //   3697: ldc2_w -1969769753
    //   3700: l2i
    //   3701: ldc_w -2017307181
    //   3704: ixor
    //   3705: ldc2_w 371018810
    //   3708: l2i
    //   3709: ldc_w 944141922
    //   3712: ixor
    //   3713: ixor
    //   3714: lookupswitch default -> 3740, -787442347 -> 3697, 1487077499 -> 8528
    //   3740: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   3743: getstatic Perryc.c : I
    //   3746: iflt -> 3760
    //   3749: ldc2_w 1518446771
    //   3752: l2i
    //   3753: ldc_w -720924146
    //   3756: ixor
    //   3757: goto -> 3768
    //   3760: ldc2_w -198270946
    //   3763: l2i
    //   3764: ldc_w 1234419353
    //   3767: ixor
    //   3768: ldc2_w -173341776
    //   3771: l2i
    //   3772: ldc_w 940217207
    //   3775: ixor
    //   3776: ixor
    //   3777: lookupswitch default -> 8398, 1109895802 -> 3760, 1880919616 -> 3804
    //   3804: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3807: getstatic Perryc.0 : I
    //   3810: ifle -> 3824
    //   3813: ldc2_w -341628516
    //   3816: l2i
    //   3817: ldc_w -1478934022
    //   3820: ixor
    //   3821: goto -> 3832
    //   3824: ldc2_w -959167300
    //   3827: l2i
    //   3828: ldc_w 1476292990
    //   3831: ixor
    //   3832: ldc2_w 1807983702
    //   3835: l2i
    //   3836: ldc_w -913052570
    //   3839: ixor
    //   3840: ixor
    //   3841: lookupswitch default -> 8544, -299229098 -> 3824, 863665650 -> 3868
    //   3868: getfield field_70124_G : Z
    //   3871: ifeq -> 3885
    //   3874: ldc2_w 627144058
    //   3877: l2i
    //   3878: ldc_w 1520125215
    //   3881: ixor
    //   3882: goto -> 3893
    //   3885: ldc2_w 870765979
    //   3888: l2i
    //   3889: ldc_w 1276962273
    //   3892: ixor
    //   3893: ldc2_w 1069888759
    //   3896: l2i
    //   3897: ldc_w 17124765
    //   3900: ixor
    //   3901: ixor
    //   3902: tableswitch default -> 3874, 1094338831 -> 3924, 1094338832 -> 8375
    //   3924: getstatic Perryc.0 : I
    //   3927: ifle -> 3941
    //   3930: ldc2_w 1075338459
    //   3933: l2i
    //   3934: ldc_w -648371526
    //   3937: ixor
    //   3938: goto -> 3949
    //   3941: ldc2_w -515005684
    //   3944: l2i
    //   3945: ldc_w -1318480467
    //   3948: ixor
    //   3949: ldc2_w 446319847
    //   3952: l2i
    //   3953: ldc_w -1655023684
    //   3956: ixor
    //   3957: ixor
    //   3958: lookupswitch default -> 8410, -672911878 -> 3984, 511894842 -> 3941
    //   3984: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   3987: getstatic Perryc.0 : I
    //   3990: ifle -> 4004
    //   3993: ldc2_w 1579195632
    //   3996: l2i
    //   3997: ldc_w 671183977
    //   4000: ixor
    //   4001: goto -> 4012
    //   4004: ldc2_w -1561711376
    //   4007: l2i
    //   4008: ldc_w 185229439
    //   4011: ixor
    //   4012: ldc2_w -478694908
    //   4015: l2i
    //   4016: ldc_w 1176522656
    //   4019: ixor
    //   4020: ixor
    //   4021: lookupswitch default -> 4048, -1524230866 -> 4004, -747236035 -> 8478
    //   4048: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4051: getstatic Perryc.0 : I
    //   4054: ifle -> 4068
    //   4057: ldc2_w 962395414
    //   4060: l2i
    //   4061: ldc_w 885854844
    //   4064: ixor
    //   4065: goto -> 4076
    //   4068: ldc2_w -660460952
    //   4071: l2i
    //   4072: ldc_w 1630962896
    //   4075: ixor
    //   4076: ldc2_w 571318212
    //   4079: l2i
    //   4080: ldc_w 651132666
    //   4083: ixor
    //   4084: ixor
    //   4085: lookupswitch default -> 4112, 47272763 -> 4068, 156438100 -> 8556
    //   4112: getfield field_70143_R : F
    //   4115: ldc_w 2.854309E38
    //   4118: invokestatic floatToIntBits : (F)I
    //   4121: ldc_w 2136390654
    //   4124: ixor
    //   4125: invokestatic intBitsToFloat : (I)F
    //   4128: fcmpl
    //   4129: ifne -> 4143
    //   4132: ldc2_w -1164956497
    //   4135: l2i
    //   4136: ldc_w -473242199
    //   4139: ixor
    //   4140: goto -> 4151
    //   4143: ldc2_w 1459961973
    //   4146: l2i
    //   4147: ldc_w 241142130
    //   4150: ixor
    //   4151: ldc2_w 1299802266
    //   4154: l2i
    //   4155: ldc_w 764232558
    //   4158: ixor
    //   4159: ixor
    //   4160: tableswitch default -> 4132, 967762674 -> 4184, 967762675 -> 8375
    //   4184: getstatic Perryc.1 : I
    //   4187: ifeq -> 4201
    //   4190: ldc2_w -145299413
    //   4193: l2i
    //   4194: ldc_w -1315542541
    //   4197: ixor
    //   4198: goto -> 4209
    //   4201: ldc2_w 2048738036
    //   4204: l2i
    //   4205: ldc_w 383628880
    //   4208: ixor
    //   4209: ldc2_w 1154255588
    //   4212: l2i
    //   4213: ldc_w -1380234319
    //   4216: ixor
    //   4217: ixor
    //   4218: lookupswitch default -> 4244, -1710123276 -> 4201, -1346944883 -> 8574
    //   4244: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   4247: getstatic Perryc.c : I
    //   4250: iflt -> 4264
    //   4253: ldc2_w -1979901623
    //   4256: l2i
    //   4257: ldc_w -1568122065
    //   4260: ixor
    //   4261: goto -> 4272
    //   4264: ldc2_w -1947710589
    //   4267: l2i
    //   4268: ldc_w 1849979306
    //   4271: ixor
    //   4272: ldc2_w 1433073691
    //   4275: l2i
    //   4276: ldc_w 967225407
    //   4279: ixor
    //   4280: ixor
    //   4281: lookupswitch default -> 8554, -1990168051 -> 4308, 1203309122 -> 4264
    //   4308: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   4311: getstatic Perryc.1 : I
    //   4314: ifeq -> 4328
    //   4317: ldc2_w -1779151692
    //   4320: l2i
    //   4321: ldc_w -1966845114
    //   4324: ixor
    //   4325: goto -> 4336
    //   4328: ldc2_w -829559555
    //   4331: l2i
    //   4332: ldc_w 1727194617
    //   4335: ixor
    //   4336: ldc2_w -581710207
    //   4339: l2i
    //   4340: ldc_w 1133472011
    //   4343: ixor
    //   4344: ixor
    //   4345: lookupswitch default -> 8596, -2115192712 -> 4328, 916696718 -> 4372
    //   4372: getfield field_74314_A : Lnet/minecraft/client/settings/KeyBinding;
    //   4375: getstatic Perryc.1 : I
    //   4378: ifeq -> 4392
    //   4381: ldc2_w 599897051
    //   4384: l2i
    //   4385: ldc_w 1582073673
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w -1360707604
    //   4395: l2i
    //   4396: ldc_w -423588014
    //   4399: ixor
    //   4400: ldc2_w 1020336233
    //   4403: l2i
    //   4404: ldc_w -1712992970
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 4436, -658906675 -> 8424, -13202007 -> 4392
    //   4436: getfield field_74513_e : Z
    //   4439: ifne -> 4453
    //   4442: ldc2_w 1627982563
    //   4445: l2i
    //   4446: ldc_w -1004173001
    //   4449: ixor
    //   4450: goto -> 4461
    //   4453: ldc2_w 1169845083
    //   4456: l2i
    //   4457: ldc_w -526980980
    //   4460: ixor
    //   4461: ldc2_w -1607496573
    //   4464: l2i
    //   4465: ldc_w -1989378002
    //   4468: ixor
    //   4469: ixor
    //   4470: tableswitch default -> 4442, -1938845831 -> 4492, -1938845830 -> 8375
    //   4492: getstatic Perryc.c : I
    //   4495: iflt -> 4509
    //   4498: ldc2_w 1279700569
    //   4501: l2i
    //   4502: ldc_w -1260755465
    //   4505: ixor
    //   4506: goto -> 4517
    //   4509: ldc2_w -1125942744
    //   4512: l2i
    //   4513: ldc_w -427968589
    //   4516: ixor
    //   4517: ldc2_w 295059386
    //   4520: l2i
    //   4521: ldc_w 620186717
    //   4524: ixor
    //   4525: ixor
    //   4526: lookupswitch default -> 4552, -839010231 -> 8378, 380586948 -> 4509
    //   4552: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   4555: getstatic Perryc.0 : I
    //   4558: ifle -> 4572
    //   4561: ldc2_w -444300706
    //   4564: l2i
    //   4565: ldc_w -1687422019
    //   4568: ixor
    //   4569: goto -> 4580
    //   4572: ldc2_w -1318595805
    //   4575: l2i
    //   4576: ldc_w 815255280
    //   4579: ixor
    //   4580: ldc2_w -278223253
    //   4583: l2i
    //   4584: ldc_w 914637533
    //   4587: ixor
    //   4588: ixor
    //   4589: lookupswitch default -> 8566, -1493066411 -> 4572, 1478424933 -> 4616
    //   4616: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4619: getstatic Perryc.0 : I
    //   4622: ifle -> 4636
    //   4625: ldc2_w -272510142
    //   4628: l2i
    //   4629: ldc_w 1524084216
    //   4632: ixor
    //   4633: goto -> 4644
    //   4636: ldc2_w 1954390602
    //   4639: l2i
    //   4640: ldc_w 1275049280
    //   4643: ixor
    //   4644: ldc2_w 1832342613
    //   4647: l2i
    //   4648: ldc_w -942924720
    //   4651: ixor
    //   4652: ixor
    //   4653: lookupswitch default -> 8592, -1787207921 -> 4680, 535639743 -> 4636
    //   4680: getfield field_70123_F : Z
    //   4683: ifeq -> 4697
    //   4686: ldc2_w -1156530482
    //   4689: l2i
    //   4690: ldc_w 204322692
    //   4693: ixor
    //   4694: goto -> 4705
    //   4697: ldc2_w 1156917473
    //   4700: l2i
    //   4701: ldc_w -204987820
    //   4704: ixor
    //   4705: ldc2_w 977507041
    //   4708: l2i
    //   4709: ldc_w 108253780
    //   4712: ixor
    //   4713: ixor
    //   4714: tableswitch default -> 4686, -1962063361 -> 4736, -1962063360 -> 8375
    //   4736: getstatic Perryc.0 : I
    //   4739: ifle -> 4753
    //   4742: ldc2_w -16023528
    //   4745: l2i
    //   4746: ldc_w -1660282268
    //   4749: ixor
    //   4750: goto -> 4761
    //   4753: ldc2_w 1525136407
    //   4756: l2i
    //   4757: ldc_w -1908838589
    //   4760: ixor
    //   4761: ldc2_w 689455483
    //   4764: l2i
    //   4765: ldc_w 509973949
    //   4768: ixor
    //   4769: ixor
    //   4770: lookupswitch default -> 4796, 277460909 -> 4753, 1434209978 -> 8604
    //   4796: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   4799: getstatic Perryc.0 : I
    //   4802: ifle -> 4816
    //   4805: ldc2_w -2130184501
    //   4808: l2i
    //   4809: ldc_w 660256905
    //   4812: ixor
    //   4813: goto -> 4824
    //   4816: ldc2_w -1199692402
    //   4819: l2i
    //   4820: ldc_w -217790446
    //   4823: ixor
    //   4824: ldc2_w -2070289927
    //   4827: l2i
    //   4828: ldc_w -728196316
    //   4831: ixor
    //   4832: ixor
    //   4833: lookupswitch default -> 8386, -161729377 -> 4816, 461084481 -> 4860
    //   4860: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4863: getstatic Perryc.c : I
    //   4866: iflt -> 4880
    //   4869: ldc2_w 1196873568
    //   4872: l2i
    //   4873: ldc_w -1777270246
    //   4876: ixor
    //   4877: goto -> 4888
    //   4880: ldc2_w -1549226606
    //   4883: l2i
    //   4884: ldc_w 2025476517
    //   4887: ixor
    //   4888: ldc2_w 1748521124
    //   4891: l2i
    //   4892: ldc_w 338466036
    //   4895: ixor
    //   4896: ixor
    //   4897: lookupswitch default -> 8416, -1492764569 -> 4924, -1387065046 -> 4880
    //   4924: goto -> 4928
    //   4927: athrow
    //   4928: invokevirtual func_70617_f_ : ()Z
    //   4931: goto -> 4935
    //   4934: athrow
    //   4935: ifne -> 4949
    //   4938: ldc2_w -1329877423
    //   4941: l2i
    //   4942: ldc_w -1802433737
    //   4945: ixor
    //   4946: goto -> 4957
    //   4949: ldc2_w 342453
    //   4952: l2i
    //   4953: ldc_w 607100114
    //   4956: ixor
    //   4957: ldc2_w -1233897808
    //   4960: l2i
    //   4961: ldc_w 1360743446
    //   4964: ixor
    //   4965: ixor
    //   4966: tableswitch default -> 4938, -1018830912 -> 4988, -1018830911 -> 8375
    //   4988: getstatic Perryc.c : I
    //   4991: iflt -> 5005
    //   4994: ldc2_w 1635343641
    //   4997: l2i
    //   4998: ldc_w -606737747
    //   5001: ixor
    //   5002: goto -> 5013
    //   5005: ldc2_w -132278966
    //   5008: l2i
    //   5009: ldc_w -1849638956
    //   5012: ixor
    //   5013: ldc2_w -708806268
    //   5016: l2i
    //   5017: ldc_w 1088636847
    //   5020: ixor
    //   5021: ixor
    //   5022: lookupswitch default -> 5048, -1455401927 -> 5005, 797936031 -> 8532
    //   5048: aload_0
    //   5049: getstatic Perryc.c : I
    //   5052: iflt -> 5066
    //   5055: ldc2_w 9580756
    //   5058: l2i
    //   5059: ldc_w -1773813595
    //   5062: ixor
    //   5063: goto -> 5074
    //   5066: ldc2_w 330329747
    //   5069: l2i
    //   5070: ldc_w 1364839345
    //   5073: ixor
    //   5074: ldc2_w 1646029345
    //   5077: l2i
    //   5078: ldc_w 309241218
    //   5081: ixor
    //   5082: ixor
    //   5083: lookupswitch default -> 5108, -607851551 -> 5066, -425377838 -> 8480
    //   5108: getfield packets : I
    //   5111: getstatic Perryc.c : I
    //   5114: iflt -> 5128
    //   5117: ldc2_w -216639470
    //   5120: l2i
    //   5121: ldc_w 795126818
    //   5124: ixor
    //   5125: goto -> 5136
    //   5128: ldc2_w 1824511011
    //   5131: l2i
    //   5132: ldc_w 1974913982
    //   5135: ixor
    //   5136: ldc2_w 629455769
    //   5139: l2i
    //   5140: ldc_w -694786723
    //   5143: ixor
    //   5144: ixor
    //   5145: lookupswitch default -> 8568, -367279783 -> 5172, 794831604 -> 5128
    //   5172: aload_0
    //   5173: getstatic Perryc.1 : I
    //   5176: ifeq -> 5190
    //   5179: ldc2_w -1967776932
    //   5182: l2i
    //   5183: ldc_w -989900827
    //   5186: ixor
    //   5187: goto -> 5198
    //   5190: ldc2_w 815238460
    //   5193: l2i
    //   5194: ldc_w -973165329
    //   5197: ixor
    //   5198: ldc2_w 1450772527
    //   5201: l2i
    //   5202: ldc_w 1637257835
    //   5205: ixor
    //   5206: ixor
    //   5207: lookupswitch default -> 5232, 480501616 -> 5190, 2040975101 -> 8578
    //   5232: getfield selectedPositions : [D
    //   5235: arraylength
    //   5236: ldc2_w -639623163
    //   5239: l2i
    //   5240: ldc_w -639623161
    //   5243: ixor
    //   5244: isub
    //   5245: if_icmpgt -> 5259
    //   5248: ldc2_w -1525463737
    //   5251: l2i
    //   5252: ldc_w 980636852
    //   5255: ixor
    //   5256: goto -> 5267
    //   5259: ldc2_w 975207399
    //   5262: l2i
    //   5263: ldc_w -1522505195
    //   5266: ixor
    //   5267: ldc2_w 538197979
    //   5270: l2i
    //   5271: ldc_w -284461228
    //   5274: ixor
    //   5275: ixor
    //   5276: tableswitch default -> 5248, 1350523260 -> 5300, 1350523261 -> 5476
    //   5300: getstatic Perryc.1 : I
    //   5303: ifeq -> 5317
    //   5306: ldc2_w -1219811420
    //   5309: l2i
    //   5310: ldc_w 270389297
    //   5313: ixor
    //   5314: goto -> 5325
    //   5317: ldc2_w -1266704350
    //   5320: l2i
    //   5321: ldc_w -1714580991
    //   5324: ixor
    //   5325: ldc2_w -2047676336
    //   5328: l2i
    //   5329: ldc_w -1357113724
    //   5332: ixor
    //   5333: ixor
    //   5334: lookupswitch default -> 8522, -1917316799 -> 5317, 123524343 -> 5360
    //   5360: aload_0
    //   5361: getstatic Perryc.1 : I
    //   5364: ifeq -> 5378
    //   5367: ldc2_w 1735661421
    //   5370: l2i
    //   5371: ldc_w 1204638011
    //   5374: ixor
    //   5375: goto -> 5386
    //   5378: ldc2_w 766267850
    //   5381: l2i
    //   5382: ldc_w -761508388
    //   5385: ixor
    //   5386: ldc2_w -456357187
    //   5389: l2i
    //   5390: ldc_w -1985701412
    //   5393: ixor
    //   5394: ixor
    //   5395: lookupswitch default -> 5420, 1288086505 -> 5378, 1305564471 -> 8504
    //   5420: getfield packets : I
    //   5423: ifle -> 5437
    //   5426: ldc2_w 290801069
    //   5429: l2i
    //   5430: ldc_w -303283537
    //   5433: ixor
    //   5434: goto -> 5445
    //   5437: ldc2_w 688864077
    //   5440: l2i
    //   5441: ldc_w -709477304
    //   5444: ixor
    //   5445: ldc2_w 605784732
    //   5448: l2i
    //   5449: ldc_w 2114053477
    //   5452: ixor
    //   5453: ixor
    //   5454: tableswitch default -> 5426, -1499240197 -> 5476, -1499240196 -> 8375
    //   5476: getstatic Perryc.1 : I
    //   5479: ifeq -> 5493
    //   5482: ldc2_w 1237082044
    //   5485: l2i
    //   5486: ldc_w 662074409
    //   5489: ixor
    //   5490: goto -> 5501
    //   5493: ldc2_w 786257317
    //   5496: l2i
    //   5497: ldc_w -719605810
    //   5500: ixor
    //   5501: ldc2_w 1216636305
    //   5504: l2i
    //   5505: ldc_w -410471132
    //   5508: ixor
    //   5509: ixor
    //   5510: lookupswitch default -> 5536, -1043924192 -> 8600, -842314632 -> 5493
    //   5536: aload_0
    //   5537: getstatic Perryc.1 : I
    //   5540: ifeq -> 5554
    //   5543: ldc2_w -669876183
    //   5546: l2i
    //   5547: ldc_w -1249524937
    //   5550: ixor
    //   5551: goto -> 5562
    //   5554: ldc2_w 264215118
    //   5557: l2i
    //   5558: ldc_w -1702140721
    //   5561: ixor
    //   5562: ldc2_w 2104428705
    //   5565: l2i
    //   5566: ldc_w -2023772210
    //   5569: ixor
    //   5570: ixor
    //   5571: lookupswitch default -> 8536, -1750604687 -> 5554, 1862556142 -> 5596
    //   5596: getfield selectedPositions : [D
    //   5599: getstatic Perryc.1 : I
    //   5602: ifeq -> 5616
    //   5605: ldc2_w 680457487
    //   5608: l2i
    //   5609: ldc_w 778957561
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w 979564330
    //   5619: l2i
    //   5620: ldc_w -561792552
    //   5623: ixor
    //   5624: ldc2_w 1408807538
    //   5627: l2i
    //   5628: ldc_w -793618857
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 5660, -2133881150 -> 5616, -2052463661 -> 8516
    //   5660: astore_1
    //   5661: getstatic Perryc.0 : I
    //   5664: ifle -> 5678
    //   5667: ldc2_w -306367508
    //   5670: l2i
    //   5671: ldc_w -2040143623
    //   5674: ixor
    //   5675: goto -> 5686
    //   5678: ldc2_w 1868716871
    //   5681: l2i
    //   5682: ldc_w -1710139328
    //   5685: ixor
    //   5686: ldc2_w -122822298
    //   5689: l2i
    //   5690: ldc_w -259194625
    //   5693: ixor
    //   5694: ixor
    //   5695: lookupswitch default -> 5720, 100319299 -> 5678, 1677210252 -> 8486
    //   5720: aload_1
    //   5721: arraylength
    //   5722: getstatic Perryc.1 : I
    //   5725: ifeq -> 5739
    //   5728: ldc2_w 727785117
    //   5731: l2i
    //   5732: ldc_w -106193165
    //   5735: ixor
    //   5736: goto -> 5747
    //   5739: ldc2_w -205913561
    //   5742: l2i
    //   5743: ldc_w 1148108173
    //   5746: ixor
    //   5747: ldc2_w -944558754
    //   5750: l2i
    //   5751: ldc_w 704637620
    //   5754: ixor
    //   5755: ixor
    //   5756: lookupswitch default -> 8472, 1015433092 -> 5739, 1503164480 -> 5784
    //   5784: istore_2
    //   5785: ldc2_w 1076968659
    //   5788: l2i
    //   5789: ldc_w 1076968659
    //   5792: ixor
    //   5793: getstatic Perryc.0 : I
    //   5796: ifle -> 5810
    //   5799: ldc2_w 1115670521
    //   5802: l2i
    //   5803: ldc_w -729675350
    //   5806: ixor
    //   5807: goto -> 5818
    //   5810: ldc2_w 1079802467
    //   5813: l2i
    //   5814: ldc_w 1157512664
    //   5817: ixor
    //   5818: ldc2_w 75968207
    //   5821: l2i
    //   5822: ldc_w -1144461744
    //   5825: ixor
    //   5826: ixor
    //   5827: lookupswitch default -> 8482, -1142059228 -> 5852, 699533004 -> 5810
    //   5852: istore_3
    //   5853: getstatic Perryc.c : I
    //   5856: iflt -> 5870
    //   5859: ldc2_w 33012797
    //   5862: l2i
    //   5863: ldc_w -821197707
    //   5866: ixor
    //   5867: goto -> 5878
    //   5870: ldc2_w 1037034207
    //   5873: l2i
    //   5874: ldc_w -1097273633
    //   5877: ixor
    //   5878: ldc2_w 1236564321
    //   5881: l2i
    //   5882: ldc_w -165671664
    //   5885: ixor
    //   5886: ixor
    //   5887: lookupswitch default -> 5912, -1952734884 -> 5870, 1903053881 -> 8508
    //   5912: iload_3
    //   5913: getstatic Perryc.1 : I
    //   5916: ifeq -> 5930
    //   5919: ldc2_w -395802886
    //   5922: l2i
    //   5923: ldc_w -2108993316
    //   5926: ixor
    //   5927: goto -> 5938
    //   5930: ldc2_w -277989420
    //   5933: l2i
    //   5934: ldc_w -327288927
    //   5937: ixor
    //   5938: ldc2_w -1101699013
    //   5941: l2i
    //   5942: ldc_w 1383616117
    //   5945: ixor
    //   5946: ixor
    //   5947: lookupswitch default -> 8514, -2045841304 -> 5930, -281090501 -> 5972
    //   5972: iload_2
    //   5973: if_icmpge -> 5987
    //   5976: ldc2_w -754073060
    //   5979: l2i
    //   5980: ldc_w -1282057813
    //   5983: ixor
    //   5984: goto -> 5995
    //   5987: ldc2_w -281221369
    //   5990: l2i
    //   5991: ldc_w -1885045577
    //   5994: ixor
    //   5995: ldc2_w -1514638559
    //   5998: l2i
    //   5999: ldc_w -489744995
    //   6002: ixor
    //   6003: ixor
    //   6004: tableswitch default -> 5976, 670039307 -> 6028, 670039308 -> 7209
    //   6028: getstatic Perryc.1 : I
    //   6031: ifeq -> 6045
    //   6034: ldc2_w 2096318210
    //   6037: l2i
    //   6038: ldc_w -1099243521
    //   6041: ixor
    //   6042: goto -> 6053
    //   6045: ldc2_w -213841322
    //   6048: l2i
    //   6049: ldc_w -1207582770
    //   6052: ixor
    //   6053: ldc2_w 563705512
    //   6056: l2i
    //   6057: ldc_w 379051920
    //   6060: ixor
    //   6061: ixor
    //   6062: lookupswitch default -> 6088, -175689275 -> 8484, 1461487339 -> 6045
    //   6088: aload_1
    //   6089: getstatic Perryc.c : I
    //   6092: iflt -> 6106
    //   6095: ldc2_w 1427949389
    //   6098: l2i
    //   6099: ldc_w -1834679742
    //   6102: ixor
    //   6103: goto -> 6114
    //   6106: ldc2_w -644352989
    //   6109: l2i
    //   6110: ldc_w -772903453
    //   6113: ixor
    //   6114: ldc2_w 1533056938
    //   6117: l2i
    //   6118: ldc_w 1870665007
    //   6121: ixor
    //   6122: ixor
    //   6123: lookupswitch default -> 6148, -725924245 -> 6106, -212252790 -> 8598
    //   6148: iload_3
    //   6149: daload
    //   6150: getstatic Perryc.1 : I
    //   6153: ifeq -> 6167
    //   6156: ldc2_w 1531331713
    //   6159: l2i
    //   6160: ldc_w 1286244421
    //   6163: ixor
    //   6164: goto -> 6175
    //   6167: ldc2_w 650668323
    //   6170: l2i
    //   6171: ldc_w 783217959
    //   6174: ixor
    //   6175: ldc2_w -1000117039
    //   6178: l2i
    //   6179: ldc_w 1074603122
    //   6182: ixor
    //   6183: ixor
    //   6184: lookupswitch default -> 8530, -1945578329 -> 6212, -1820162969 -> 6167
    //   6212: dstore #4
    //   6214: getstatic Perryc.1 : I
    //   6217: ifeq -> 6231
    //   6220: ldc2_w 268821740
    //   6223: l2i
    //   6224: ldc_w -144787731
    //   6227: ixor
    //   6228: goto -> 6239
    //   6231: ldc2_w -203980556
    //   6234: l2i
    //   6235: ldc_w -319256072
    //   6238: ixor
    //   6239: ldc2_w 1092602989
    //   6242: l2i
    //   6243: ldc_w -1729448211
    //   6246: ixor
    //   6247: ixor
    //   6248: lookupswitch default -> 8404, -958762100 -> 6276, 1051601025 -> 6231
    //   6276: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   6279: getstatic Perryc.c : I
    //   6282: iflt -> 6296
    //   6285: ldc2_w 674731993
    //   6288: l2i
    //   6289: ldc_w 1399958454
    //   6292: ixor
    //   6293: goto -> 6304
    //   6296: ldc2_w -1333517915
    //   6299: l2i
    //   6300: ldc_w 596736706
    //   6303: ixor
    //   6304: ldc2_w 550551946
    //   6307: l2i
    //   6308: ldc_w 306513805
    //   6311: ixor
    //   6312: ixor
    //   6313: lookupswitch default -> 6340, -345615136 -> 6296, 1238628968 -> 8408
    //   6340: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6343: getstatic Perryc.c : I
    //   6346: iflt -> 6360
    //   6349: ldc2_w -532674723
    //   6352: l2i
    //   6353: ldc_w -855724166
    //   6356: ixor
    //   6357: goto -> 6368
    //   6360: ldc2_w -508602058
    //   6363: l2i
    //   6364: ldc_w -1560914002
    //   6367: ixor
    //   6368: ldc2_w -640530859
    //   6371: l2i
    //   6372: ldc_w -1583917904
    //   6375: ixor
    //   6376: ixor
    //   6377: lookupswitch default -> 8436, 991698045 -> 6404, 1425783490 -> 6360
    //   6404: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   6407: new net/minecraft/network/play/client/CPacketPlayer$Position
    //   6410: dup
    //   6411: getstatic Perryc.1 : I
    //   6414: ifeq -> 6428
    //   6417: ldc2_w 271619764
    //   6420: l2i
    //   6421: ldc_w -1543780136
    //   6424: ixor
    //   6425: goto -> 6436
    //   6428: ldc2_w 2075160519
    //   6431: l2i
    //   6432: ldc_w -904226952
    //   6435: ixor
    //   6436: ldc2_w 1930854688
    //   6439: l2i
    //   6440: ldc_w -1295213657
    //   6443: ixor
    //   6444: ixor
    //   6445: lookupswitch default -> 8414, 1886446136 -> 6472, 1913734379 -> 6428
    //   6472: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   6475: getstatic Perryc.c : I
    //   6478: iflt -> 6492
    //   6481: ldc2_w -115639210
    //   6484: l2i
    //   6485: ldc_w 1835516849
    //   6488: ixor
    //   6489: goto -> 6500
    //   6492: ldc2_w 487666191
    //   6495: l2i
    //   6496: ldc_w 2089324388
    //   6499: ixor
    //   6500: ldc2_w 946620236
    //   6503: l2i
    //   6504: ldc_w 1939880459
    //   6507: ixor
    //   6508: ixor
    //   6509: lookupswitch default -> 8552, -542063968 -> 6492, 710262828 -> 6536
    //   6536: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6539: getstatic Perryc.1 : I
    //   6542: ifeq -> 6556
    //   6545: ldc2_w -2063600558
    //   6548: l2i
    //   6549: ldc_w 1877823686
    //   6552: ixor
    //   6553: goto -> 6564
    //   6556: ldc2_w -1665171857
    //   6559: l2i
    //   6560: ldc_w 286990816
    //   6563: ixor
    //   6564: ldc2_w 95715290
    //   6567: l2i
    //   6568: ldc_w -1018335956
    //   6571: ixor
    //   6572: ixor
    //   6573: lookupswitch default -> 8380, 770422370 -> 6556, 1264405881 -> 6600
    //   6600: getfield field_70165_t : D
    //   6603: getstatic Perryc.0 : I
    //   6606: ifle -> 6620
    //   6609: ldc2_w 1556297002
    //   6612: l2i
    //   6613: ldc_w 888670106
    //   6616: ixor
    //   6617: goto -> 6628
    //   6620: ldc2_w 1996025623
    //   6623: l2i
    //   6624: ldc_w -1826873009
    //   6627: ixor
    //   6628: ldc2_w 1265408483
    //   6631: l2i
    //   6632: ldc_w -1269065237
    //   6635: ixor
    //   6636: ixor
    //   6637: lookupswitch default -> 6664, -1760808264 -> 8392, -1264865889 -> 6620
    //   6664: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   6667: getstatic Perryc.c : I
    //   6670: iflt -> 6684
    //   6673: ldc2_w -2032136034
    //   6676: l2i
    //   6677: ldc_w -1820644063
    //   6680: ixor
    //   6681: goto -> 6692
    //   6684: ldc2_w -865227569
    //   6687: l2i
    //   6688: ldc_w 690253338
    //   6691: ixor
    //   6692: ldc2_w -2099971283
    //   6695: l2i
    //   6696: ldc_w 1949747144
    //   6699: ixor
    //   6700: ixor
    //   6701: lookupswitch default -> 8444, -478609062 -> 6684, 330038832 -> 6728
    //   6728: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6731: getstatic Perryc.1 : I
    //   6734: ifeq -> 6748
    //   6737: ldc2_w -1353859515
    //   6740: l2i
    //   6741: ldc_w -266414318
    //   6744: ixor
    //   6745: goto -> 6756
    //   6748: ldc2_w -1699390871
    //   6751: l2i
    //   6752: ldc_w -172812540
    //   6755: ixor
    //   6756: ldc2_w -460034201
    //   6759: l2i
    //   6760: ldc_w 656613424
    //   6763: ixor
    //   6764: ixor
    //   6765: lookupswitch default -> 6792, -1662769664 -> 8450, 547809426 -> 6748
    //   6792: getfield field_70163_u : D
    //   6795: getstatic Perryc.0 : I
    //   6798: ifle -> 6812
    //   6801: ldc2_w 495303182
    //   6804: l2i
    //   6805: ldc_w -2084903526
    //   6808: ixor
    //   6809: goto -> 6820
    //   6812: ldc2_w 1178932584
    //   6815: l2i
    //   6816: ldc_w 632515669
    //   6819: ixor
    //   6820: ldc2_w 408945738
    //   6823: l2i
    //   6824: ldc_w 1940227944
    //   6827: ixor
    //   6828: ixor
    //   6829: lookupswitch default -> 8422, -168108874 -> 6812, 137624095 -> 6856
    //   6856: dload #4
    //   6858: dadd
    //   6859: getstatic Perryc.0 : I
    //   6862: ifle -> 6876
    //   6865: ldc2_w -1035965277
    //   6868: l2i
    //   6869: ldc_w 1083537403
    //   6872: ixor
    //   6873: goto -> 6884
    //   6876: ldc2_w -2069679435
    //   6879: l2i
    //   6880: ldc_w -1084476412
    //   6883: ixor
    //   6884: ldc2_w -1802019671
    //   6887: l2i
    //   6888: ldc_w -1712380883
    //   6891: ixor
    //   6892: ixor
    //   6893: lookupswitch default -> 6920, -1884462116 -> 8606, 1105261865 -> 6876
    //   6920: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   6923: getstatic Perryc.1 : I
    //   6926: ifeq -> 6940
    //   6929: ldc2_w 1749763790
    //   6932: l2i
    //   6933: ldc_w -707943872
    //   6936: ixor
    //   6937: goto -> 6948
    //   6940: ldc2_w -2052335328
    //   6943: l2i
    //   6944: ldc_w 412370308
    //   6947: ixor
    //   6948: ldc2_w 1203139571
    //   6951: l2i
    //   6952: ldc_w -1002108055
    //   6955: ixor
    //   6956: ixor
    //   6957: lookupswitch default -> 6984, 119970568 -> 6940, 1047895060 -> 8510
    //   6984: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6987: getstatic Perryc.1 : I
    //   6990: ifeq -> 7004
    //   6993: ldc2_w -541225507
    //   6996: l2i
    //   6997: ldc_w 2021074686
    //   7000: ixor
    //   7001: goto -> 7012
    //   7004: ldc2_w -1698662298
    //   7007: l2i
    //   7008: ldc_w 2089067603
    //   7011: ixor
    //   7012: ldc2_w 2015460816
    //   7015: l2i
    //   7016: ldc_w 194347246
    //   7019: ixor
    //   7020: ixor
    //   7021: lookupswitch default -> 8602, -1779425013 -> 7048, -729917923 -> 7004
    //   7048: getfield field_70161_v : D
    //   7051: ldc2_w 161663630
    //   7054: l2i
    //   7055: ldc_w 161663631
    //   7058: ixor
    //   7059: getstatic Perryc.c : I
    //   7062: iflt -> 7076
    //   7065: ldc2_w 1830969473
    //   7068: l2i
    //   7069: ldc_w -628193393
    //   7072: ixor
    //   7073: goto -> 7084
    //   7076: ldc2_w 1900301216
    //   7079: l2i
    //   7080: ldc_w 792124266
    //   7083: ixor
    //   7084: ldc2_w -1972864420
    //   7087: l2i
    //   7088: ldc_w 353183866
    //   7091: ixor
    //   7092: ixor
    //   7093: lookupswitch default -> 8394, -1055407380 -> 7120, 684307752 -> 7076
    //   7120: goto -> 7124
    //   7123: athrow
    //   7124: invokespecial <init> : (DDDZ)V
    //   7127: goto -> 7131
    //   7130: athrow
    //   7131: getstatic Perryc.0 : I
    //   7134: ifle -> 7148
    //   7137: ldc2_w 172407121
    //   7140: l2i
    //   7141: ldc_w -878600265
    //   7144: ixor
    //   7145: goto -> 7156
    //   7148: ldc2_w 2120640729
    //   7151: l2i
    //   7152: ldc_w 1347095656
    //   7155: ixor
    //   7156: ldc2_w -237674341
    //   7159: l2i
    //   7160: ldc_w -919176722
    //   7163: ixor
    //   7164: ixor
    //   7165: lookupswitch default -> 7192, -593371388 -> 7148, -117162093 -> 8440
    //   7192: goto -> 7196
    //   7195: athrow
    //   7196: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   7199: goto -> 7203
    //   7202: athrow
    //   7203: iinc #3, 1
    //   7206: goto -> 5853
    //   7209: getstatic Perryc.0 : I
    //   7212: ifle -> 7226
    //   7215: ldc2_w 1096475915
    //   7218: l2i
    //   7219: ldc_w 1036329340
    //   7222: ixor
    //   7223: goto -> 7234
    //   7226: ldc2_w -1447923631
    //   7229: l2i
    //   7230: ldc_w -1274645100
    //   7233: ixor
    //   7234: ldc2_w -1408149717
    //   7237: l2i
    //   7238: ldc_w -980586649
    //   7241: ixor
    //   7242: ixor
    //   7243: lookupswitch default -> 8420, 352582715 -> 7226, 1948794249 -> 7268
    //   7268: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   7271: getstatic Perryc.1 : I
    //   7274: ifeq -> 7288
    //   7277: ldc2_w 1964231776
    //   7280: l2i
    //   7281: ldc_w 1445390136
    //   7284: ixor
    //   7285: goto -> 7296
    //   7288: ldc2_w 1519913204
    //   7291: l2i
    //   7292: ldc_w 1561636934
    //   7295: ixor
    //   7296: ldc2_w 1481426658
    //   7299: l2i
    //   7300: ldc_w -1470823992
    //   7303: ixor
    //   7304: ixor
    //   7305: lookupswitch default -> 8468, -752030606 -> 7288, -141197416 -> 7332
    //   7332: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7335: getstatic Perryc.0 : I
    //   7338: ifle -> 7352
    //   7341: ldc2_w 1676477605
    //   7344: l2i
    //   7345: ldc_w 793078308
    //   7348: ixor
    //   7349: goto -> 7360
    //   7352: ldc2_w -147058322
    //   7355: l2i
    //   7356: ldc_w -1584905412
    //   7359: ixor
    //   7360: ldc2_w 1761328773
    //   7363: l2i
    //   7364: ldc_w -569590433
    //   7367: ixor
    //   7368: ixor
    //   7369: lookupswitch default -> 7396, -94409381 -> 8384, 1298951450 -> 7352
    //   7396: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   7399: getstatic Perryc.c : I
    //   7402: iflt -> 7416
    //   7405: ldc2_w 110307150
    //   7408: l2i
    //   7409: ldc_w -146142371
    //   7412: ixor
    //   7413: goto -> 7424
    //   7416: ldc2_w 840123659
    //   7419: l2i
    //   7420: ldc_w 457756851
    //   7423: ixor
    //   7424: ldc2_w -942910337
    //   7427: l2i
    //   7428: ldc_w -1657909229
    //   7431: ixor
    //   7432: ixor
    //   7433: lookupswitch default -> 8542, -1422186369 -> 7416, 1941541332 -> 7460
    //   7460: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7463: getstatic Perryc.0 : I
    //   7466: ifle -> 7480
    //   7469: ldc2_w -1335662135
    //   7472: l2i
    //   7473: ldc_w 1562860818
    //   7476: ixor
    //   7477: goto -> 7488
    //   7480: ldc2_w 1332348523
    //   7483: l2i
    //   7484: ldc_w -1423828366
    //   7487: ixor
    //   7488: ldc2_w 1207057882
    //   7491: l2i
    //   7492: ldc_w 620545134
    //   7495: ixor
    //   7496: ixor
    //   7497: lookupswitch default -> 8382, -2025396819 -> 7524, -1907700369 -> 7480
    //   7524: getfield field_70165_t : D
    //   7527: getstatic Perryc.1 : I
    //   7530: ifeq -> 7544
    //   7533: ldc2_w -307128807
    //   7536: l2i
    //   7537: ldc_w 1484264934
    //   7540: ixor
    //   7541: goto -> 7552
    //   7544: ldc2_w -131804066
    //   7547: l2i
    //   7548: ldc_w -1301044358
    //   7551: ixor
    //   7552: ldc2_w 928931190
    //   7555: l2i
    //   7556: ldc_w -1906828882
    //   7559: ixor
    //   7560: ixor
    //   7561: lookupswitch default -> 7588, 214943527 -> 8460, 1832972720 -> 7544
    //   7588: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   7591: getstatic Perryc.c : I
    //   7594: iflt -> 7608
    //   7597: ldc2_w 453833953
    //   7600: l2i
    //   7601: ldc_w -838111496
    //   7604: ixor
    //   7605: goto -> 7616
    //   7608: ldc2_w -16471594
    //   7611: l2i
    //   7612: ldc_w -1253754495
    //   7615: ixor
    //   7616: ldc2_w -1011970823
    //   7619: l2i
    //   7620: ldc_w 1958569857
    //   7623: ixor
    //   7624: ixor
    //   7625: lookupswitch default -> 8490, -44926161 -> 7652, 1645506913 -> 7608
    //   7652: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7655: getstatic Perryc.1 : I
    //   7658: ifeq -> 7672
    //   7661: ldc2_w -1624874011
    //   7664: l2i
    //   7665: ldc_w -952868946
    //   7668: ixor
    //   7669: goto -> 7680
    //   7672: ldc2_w -636620327
    //   7675: l2i
    //   7676: ldc_w 1624425056
    //   7679: ixor
    //   7680: ldc2_w -1626719443
    //   7683: l2i
    //   7684: ldc_w -1939861131
    //   7687: ixor
    //   7688: ixor
    //   7689: lookupswitch default -> 8426, -1447749151 -> 7716, 1266161171 -> 7672
    //   7716: getfield field_70163_u : D
    //   7719: getstatic Perryc.1 : I
    //   7722: ifeq -> 7736
    //   7725: ldc2_w 1313217885
    //   7728: l2i
    //   7729: ldc_w 2110218073
    //   7732: ixor
    //   7733: goto -> 7744
    //   7736: ldc2_w -1795591041
    //   7739: l2i
    //   7740: ldc_w 101817651
    //   7743: ixor
    //   7744: ldc2_w -637066229
    //   7747: l2i
    //   7748: ldc_w -2073077354
    //   7751: ixor
    //   7752: ixor
    //   7753: lookupswitch default -> 7780, 413823973 -> 7736, 1844002713 -> 8488
    //   7780: aload_0
    //   7781: getstatic Perryc.c : I
    //   7784: iflt -> 7798
    //   7787: ldc2_w 208438764
    //   7790: l2i
    //   7791: ldc_w -264549806
    //   7794: ixor
    //   7795: goto -> 7806
    //   7798: ldc2_w -460288787
    //   7801: l2i
    //   7802: ldc_w 1652751631
    //   7805: ixor
    //   7806: ldc2_w -841615356
    //   7809: l2i
    //   7810: ldc_w -922903941
    //   7813: ixor
    //   7814: ixor
    //   7815: lookupswitch default -> 7840, -109072959 -> 8506, 1296367588 -> 7798
    //   7840: getfield selectedPositions : [D
    //   7843: getstatic Perryc.1 : I
    //   7846: ifeq -> 7860
    //   7849: ldc2_w 921921552
    //   7852: l2i
    //   7853: ldc_w 1244363670
    //   7856: ixor
    //   7857: goto -> 7868
    //   7860: ldc2_w 1675019576
    //   7863: l2i
    //   7864: ldc_w 234291686
    //   7867: ixor
    //   7868: ldc2_w -1900930199
    //   7871: l2i
    //   7872: ldc_w -24652752
    //   7875: ixor
    //   7876: ixor
    //   7877: lookupswitch default -> 7904, 216915167 -> 8462, 653650228 -> 7860
    //   7904: aload_0
    //   7905: getstatic Perryc.0 : I
    //   7908: ifle -> 7922
    //   7911: ldc2_w 446405507
    //   7914: l2i
    //   7915: ldc_w -1477335831
    //   7918: ixor
    //   7919: goto -> 7930
    //   7922: ldc2_w -1718230650
    //   7925: l2i
    //   7926: ldc_w -1222748886
    //   7929: ixor
    //   7930: ldc2_w 1176050477
    //   7933: l2i
    //   7934: ldc_w 754457780
    //   7937: ixor
    //   7938: ixor
    //   7939: lookupswitch default -> 8586, -678741773 -> 7922, 1147843381 -> 7964
    //   7964: getfield selectedPositions : [D
    //   7967: arraylength
    //   7968: ldc2_w -2062939684
    //   7971: l2i
    //   7972: ldc_w -2062939683
    //   7975: ixor
    //   7976: isub
    //   7977: daload
    //   7978: dadd
    //   7979: getstatic Perryc.1 : I
    //   7982: ifeq -> 7996
    //   7985: ldc2_w -646174133
    //   7988: l2i
    //   7989: ldc_w -2125062940
    //   7992: ixor
    //   7993: goto -> 8004
    //   7996: ldc2_w 565875000
    //   7999: l2i
    //   8000: ldc_w 1838273059
    //   8003: ixor
    //   8004: ldc2_w -2008098788
    //   8007: l2i
    //   8008: ldc_w 160664475
    //   8011: ixor
    //   8012: ixor
    //   8013: lookupswitch default -> 8040, -638098136 -> 8446, 265492994 -> 7996
    //   8040: getstatic bigname/zprestige/webhack/features/modules/Movement/Step.mc : Lnet/minecraft/client/Minecraft;
    //   8043: getstatic Perryc.1 : I
    //   8046: ifeq -> 8060
    //   8049: ldc2_w 480928867
    //   8052: l2i
    //   8053: ldc_w -892893257
    //   8056: ixor
    //   8057: goto -> 8068
    //   8060: ldc2_w 2115470783
    //   8063: l2i
    //   8064: ldc_w 1867455400
    //   8067: ixor
    //   8068: ldc2_w 202052005
    //   8071: l2i
    //   8072: ldc_w -1655074484
    //   8075: ixor
    //   8076: ixor
    //   8077: lookupswitch default -> 8412, -2146820354 -> 8104, 1195336509 -> 8060
    //   8104: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8107: getstatic Perryc.1 : I
    //   8110: ifeq -> 8124
    //   8113: ldc2_w 1598068494
    //   8116: l2i
    //   8117: ldc_w -1621042935
    //   8120: ixor
    //   8121: goto -> 8132
    //   8124: ldc2_w 1910391338
    //   8127: l2i
    //   8128: ldc_w -1841289291
    //   8131: ixor
    //   8132: ldc2_w 33194144
    //   8135: l2i
    //   8136: ldc_w -1608753154
    //   8139: ixor
    //   8140: ixor
    //   8141: lookupswitch default -> 8492, 1115208385 -> 8168, 1640403289 -> 8124
    //   8168: getfield field_70161_v : D
    //   8171: getstatic Perryc.1 : I
    //   8174: ifeq -> 8188
    //   8177: ldc2_w -1917704793
    //   8180: l2i
    //   8181: ldc_w 543683269
    //   8184: ixor
    //   8185: goto -> 8196
    //   8188: ldc2_w -788437012
    //   8191: l2i
    //   8192: ldc_w -1418183411
    //   8195: ixor
    //   8196: ldc2_w -1928370015
    //   8199: l2i
    //   8200: ldc_w -22725809
    //   8203: ixor
    //   8204: ixor
    //   8205: lookupswitch default -> 8494, -562068340 -> 8188, 164825359 -> 8232
    //   8232: goto -> 8236
    //   8235: athrow
    //   8236: invokevirtual func_70107_b : (DDD)V
    //   8239: goto -> 8243
    //   8242: athrow
    //   8243: getstatic Perryc.1 : I
    //   8246: ifeq -> 8260
    //   8249: ldc2_w -307929730
    //   8252: l2i
    //   8253: ldc_w 50280965
    //   8256: ixor
    //   8257: goto -> 8268
    //   8260: ldc2_w 1750317406
    //   8263: l2i
    //   8264: ldc_w 1558351286
    //   8267: ixor
    //   8268: ldc2_w -1038171844
    //   8271: l2i
    //   8272: ldc_w 396822491
    //   8275: ixor
    //   8276: ixor
    //   8277: lookupswitch default -> 8512, -519507441 -> 8304, 987996572 -> 8260
    //   8304: aload_0
    //   8305: ldc2_w 1198636499
    //   8308: l2i
    //   8309: ldc_w 1198636499
    //   8312: ixor
    //   8313: getstatic Perryc.0 : I
    //   8316: ifle -> 8330
    //   8319: ldc2_w 1728974107
    //   8322: l2i
    //   8323: ldc_w 513398406
    //   8326: ixor
    //   8327: goto -> 8338
    //   8330: ldc2_w -1184977097
    //   8333: l2i
    //   8334: ldc_w -1986698460
    //   8337: ixor
    //   8338: ldc2_w -1727957399
    //   8341: l2i
    //   8342: ldc_w 1247565561
    //   8345: ixor
    //   8346: ixor
    //   8347: lookupswitch default -> 8372, -1429538035 -> 8430, -1005299356 -> 8330
    //   8372: putfield packets : I
    //   8375: return
    //   8376: aconst_null
    //   8377: athrow
    //   8378: aconst_null
    //   8379: athrow
    //   8380: aconst_null
    //   8381: athrow
    //   8382: aconst_null
    //   8383: athrow
    //   8384: aconst_null
    //   8385: athrow
    //   8386: aconst_null
    //   8387: athrow
    //   8388: aconst_null
    //   8389: athrow
    //   8390: aconst_null
    //   8391: athrow
    //   8392: aconst_null
    //   8393: athrow
    //   8394: aconst_null
    //   8395: athrow
    //   8396: aconst_null
    //   8397: athrow
    //   8398: aconst_null
    //   8399: athrow
    //   8400: aconst_null
    //   8401: athrow
    //   8402: aconst_null
    //   8403: athrow
    //   8404: aconst_null
    //   8405: athrow
    //   8406: aconst_null
    //   8407: athrow
    //   8408: aconst_null
    //   8409: athrow
    //   8410: aconst_null
    //   8411: athrow
    //   8412: aconst_null
    //   8413: athrow
    //   8414: aconst_null
    //   8415: athrow
    //   8416: aconst_null
    //   8417: athrow
    //   8418: aconst_null
    //   8419: athrow
    //   8420: aconst_null
    //   8421: athrow
    //   8422: aconst_null
    //   8423: athrow
    //   8424: aconst_null
    //   8425: athrow
    //   8426: aconst_null
    //   8427: athrow
    //   8428: aconst_null
    //   8429: athrow
    //   8430: aconst_null
    //   8431: athrow
    //   8432: aconst_null
    //   8433: athrow
    //   8434: aconst_null
    //   8435: athrow
    //   8436: aconst_null
    //   8437: athrow
    //   8438: aconst_null
    //   8439: athrow
    //   8440: aconst_null
    //   8441: athrow
    //   8442: aconst_null
    //   8443: athrow
    //   8444: aconst_null
    //   8445: athrow
    //   8446: aconst_null
    //   8447: athrow
    //   8448: aconst_null
    //   8449: athrow
    //   8450: aconst_null
    //   8451: athrow
    //   8452: aconst_null
    //   8453: athrow
    //   8454: aconst_null
    //   8455: athrow
    //   8456: aconst_null
    //   8457: athrow
    //   8458: aconst_null
    //   8459: athrow
    //   8460: aconst_null
    //   8461: athrow
    //   8462: aconst_null
    //   8463: athrow
    //   8464: aconst_null
    //   8465: athrow
    //   8466: aconst_null
    //   8467: athrow
    //   8468: aconst_null
    //   8469: athrow
    //   8470: aconst_null
    //   8471: athrow
    //   8472: aconst_null
    //   8473: athrow
    //   8474: aconst_null
    //   8475: athrow
    //   8476: aconst_null
    //   8477: athrow
    //   8478: aconst_null
    //   8479: athrow
    //   8480: aconst_null
    //   8481: athrow
    //   8482: aconst_null
    //   8483: athrow
    //   8484: aconst_null
    //   8485: athrow
    //   8486: aconst_null
    //   8487: athrow
    //   8488: aconst_null
    //   8489: athrow
    //   8490: aconst_null
    //   8491: athrow
    //   8492: aconst_null
    //   8493: athrow
    //   8494: aconst_null
    //   8495: athrow
    //   8496: aconst_null
    //   8497: athrow
    //   8498: aconst_null
    //   8499: athrow
    //   8500: aconst_null
    //   8501: athrow
    //   8502: aconst_null
    //   8503: athrow
    //   8504: aconst_null
    //   8505: athrow
    //   8506: aconst_null
    //   8507: athrow
    //   8508: aconst_null
    //   8509: athrow
    //   8510: aconst_null
    //   8511: athrow
    //   8512: aconst_null
    //   8513: athrow
    //   8514: aconst_null
    //   8515: athrow
    //   8516: aconst_null
    //   8517: athrow
    //   8518: aconst_null
    //   8519: athrow
    //   8520: aconst_null
    //   8521: athrow
    //   8522: aconst_null
    //   8523: athrow
    //   8524: aconst_null
    //   8525: athrow
    //   8526: aconst_null
    //   8527: athrow
    //   8528: aconst_null
    //   8529: athrow
    //   8530: aconst_null
    //   8531: athrow
    //   8532: aconst_null
    //   8533: athrow
    //   8534: aconst_null
    //   8535: athrow
    //   8536: aconst_null
    //   8537: athrow
    //   8538: aconst_null
    //   8539: athrow
    //   8540: aconst_null
    //   8541: athrow
    //   8542: aconst_null
    //   8543: athrow
    //   8544: aconst_null
    //   8545: athrow
    //   8546: aconst_null
    //   8547: athrow
    //   8548: aconst_null
    //   8549: athrow
    //   8550: aconst_null
    //   8551: athrow
    //   8552: aconst_null
    //   8553: athrow
    //   8554: aconst_null
    //   8555: athrow
    //   8556: aconst_null
    //   8557: athrow
    //   8558: aconst_null
    //   8559: athrow
    //   8560: aconst_null
    //   8561: athrow
    //   8562: aconst_null
    //   8563: athrow
    //   8564: aconst_null
    //   8565: athrow
    //   8566: aconst_null
    //   8567: athrow
    //   8568: aconst_null
    //   8569: athrow
    //   8570: aconst_null
    //   8571: athrow
    //   8572: aconst_null
    //   8573: athrow
    //   8574: aconst_null
    //   8575: athrow
    //   8576: aconst_null
    //   8577: athrow
    //   8578: aconst_null
    //   8579: athrow
    //   8580: aconst_null
    //   8581: athrow
    //   8582: aconst_null
    //   8583: athrow
    //   8584: aconst_null
    //   8585: athrow
    //   8586: aconst_null
    //   8587: athrow
    //   8588: aconst_null
    //   8589: athrow
    //   8590: aconst_null
    //   8591: athrow
    //   8592: aconst_null
    //   8593: athrow
    //   8594: aconst_null
    //   8595: athrow
    //   8596: aconst_null
    //   8597: athrow
    //   8598: aconst_null
    //   8599: athrow
    //   8600: aconst_null
    //   8601: athrow
    //   8602: aconst_null
    //   8603: athrow
    //   8604: aconst_null
    //   8605: athrow
    //   8606: aconst_null
    //   8607: athrow
    //   8608: aconst_null
    //   8609: athrow
    //   8610: pop
    //   8611: goto -> 24
    //   8614: pop
    //   8615: aconst_null
    //   8616: goto -> 8610
    //   8619: dup
    //   8620: ifnull -> 8610
    //   8623: checkcast java/lang/Throwable
    //   8626: athrow
    //   8627: dup
    //   8628: ifnull -> 8614
    //   8631: checkcast java/lang/Throwable
    //   8634: athrow
    //   8635: aconst_null
    //   8636: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   6214	989	4	position	D
    //   24	8352	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Step;
    // Exception table:
    //   from	to	target	type
    //   8	20	8619	finally
    //   211	218	218	finally
    //   211	218	3	finally
    //   211	218	218	java/lang/ArrayIndexOutOfBoundsException
    //   211	218	218	java/lang/NumberFormatException
    //   212	218	211	finally
    //   288	294	294	finally
    //   288	294	294	java/util/NoSuchElementException
    //   288	294	3	java/lang/ClassCastException
    //   288	294	294	finally
    //   288	294	294	java/lang/EnumConstantNotPresentException
    //   663	670	670	finally
    //   663	670	663	finally
    //   663	670	663	java/lang/IndexOutOfBoundsException
    //   663	670	663	finally
    //   664	670	670	finally
    //   739	746	746	finally
    //   739	746	739	java/lang/AssertionError
    //   739	746	3	finally
    //   740	746	739	finally
    //   740	746	3	java/lang/NullPointerException
    //   999	1006	1006	finally
    //   999	1006	1006	finally
    //   1000	1006	999	java/lang/RuntimeException
    //   1000	1006	999	finally
    //   1000	1006	3	finally
    //   1075	1082	1082	finally
    //   1075	1082	1075	finally
    //   1075	1082	1075	finally
    //   1076	1082	1082	finally
    //   1076	1082	1082	finally
    //   3303	3310	3310	finally
    //   3303	3310	3310	java/lang/StringIndexOutOfBoundsException
    //   3303	3310	3	finally
    //   3304	3310	3303	finally
    //   3304	3310	3303	java/lang/ArithmeticException
    //   3619	3626	3626	finally
    //   3619	3626	3	java/lang/ArithmeticException
    //   3620	3626	3619	finally
    //   3620	3626	3	java/lang/ClassCastException
    //   3620	3626	3	java/lang/ArrayIndexOutOfBoundsException
    //   4927	4934	4934	finally
    //   4927	4934	4934	java/lang/ArithmeticException
    //   4927	4934	3	java/util/ConcurrentModificationException
    //   4927	4934	4927	finally
    //   4928	4934	4934	finally
    //   7123	7130	7130	finally
    //   7123	7130	3	java/lang/ArithmeticException
    //   7123	7130	7123	java/lang/RuntimeException
    //   7123	7130	3	java/lang/ClassCastException
    //   7124	7130	7130	finally
    //   7195	7202	7202	finally
    //   7195	7202	7202	java/lang/ArithmeticException
    //   7195	7202	7195	finally
    //   7196	7202	3	finally
    //   7196	7202	7202	finally
    //   8235	8242	8242	finally
    //   8235	8242	8235	java/lang/IllegalArgumentException
    //   8236	8242	8235	java/lang/ArrayIndexOutOfBoundsException
    //   8236	8242	3	java/lang/ArrayIndexOutOfBoundsException
    //   8236	8242	8242	java/util/ConcurrentModificationException
    //   8619	8627	8619	java/lang/NullPointerException
    //   8635	8637	3	java/lang/RuntimeException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onToggle() {
    Perry1.48(this, (int)-409271739L ^ 0xB46F871B);
  }
  
  public static Step getInstance() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\Step.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */