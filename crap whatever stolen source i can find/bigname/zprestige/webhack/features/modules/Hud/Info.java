package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.item.ItemStack;

public class Info extends Module {
  public Setting<Integer> TpsX;
  
  public Setting<Integer> TpsY;
  
  public Setting<Integer> crystalY;
  
  public Setting<Integer> SpeedX;
  
  public Setting<Boolean> crystals;
  
  public Setting<Boolean> fps;
  
  public Setting<Boolean> exp;
  
  public Setting<Integer> FpsX;
  
  public Setting<Integer> crystalX;
  
  public Setting<Boolean> time;
  
  public Setting<Integer> expY;
  
  public Setting<Integer> SpeedY;
  
  public Setting<Integer> PingY;
  
  public Setting<Boolean> ping;
  
  public Setting<Boolean> gapples;
  
  public Setting<Integer> GapplesX;
  
  public Setting<Integer> FpsY;
  
  public Setting<Integer> GapplesY;
  
  public Setting<Integer> expX;
  
  public Setting<Integer> TimeY;
  
  public Setting<Integer> TimeX;
  
  public Setting<Boolean> speed;
  
  public Setting<Integer> PingX;
  
  public Setting<Boolean> tps;
  
  public int color;
  
  public boolean lambda$new$15(Object paramObject) {
    return Perry1.1x(this, (int)-931611711L ^ 0xF739C2B4, paramObject);
  }
  
  public boolean lambda$new$4(Object paramObject) {
    return Perry1.1w(this, (int)-373342377L ^ 0xA97BE8C4, paramObject);
  }
  
  public static boolean lambda$onRender2D$16(ItemStack paramItemStack) {
    return Perry1.0B(null, (int)44015950L ^ 0x3DBF1197, paramItemStack);
  }
  
  public Info() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 52777315
    //   9: l2i
    //   10: ldc 1878637844
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 293461576
    //   19: l2i
    //   20: ldc 1105597499
    //   22: ixor
    //   23: ldc2_w 2102145913
    //   26: l2i
    //   27: ldc -2092952654
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1831809860 -> 14742, 1392767516 -> 16
    //   56: aload_0
    //   57: ldc '겿㌝곺㶸'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w 1891856204
    //   68: l2i
    //   69: ldc -1265823232
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -905170527
    //   78: l2i
    //   79: ldc -1825345135
    //   81: ixor
    //   82: ldc2_w 69455334
    //   85: l2i
    //   86: ldc -1894779924
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 14708, -770474438 -> 116, 1331839814 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '겲㌚곯㶧ᨙ䈫๠턨踣䛭ᑝ਴愂無숍ㇺ辑璜Ꜣݽ⍩価䘒䛾䗆ᣍ৛'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w 2118576956
    //   130: l2i
    //   131: ldc 1942167862
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1101818213
    //   140: l2i
    //   141: ldc -914066853
    //   143: ixor
    //   144: ldc2_w -1836158060
    //   147: l2i
    //   148: ldc 1730232497
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -131401425 -> 14664, 542482573 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w 1268048950
    //   192: l2i
    //   193: ldc 1468115533
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1284673270
    //   202: l2i
    //   203: ldc -2109897711
    //   205: ixor
    //   206: ldc2_w 1418650800
    //   209: l2i
    //   210: ldc -163804456
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 15048, -1096343533 -> 199, 1813865615 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -1346305657
    //   246: l2i
    //   247: ldc -1346305658
    //   249: ixor
    //   250: ldc2_w -1920578190
    //   253: l2i
    //   254: ldc -1920578190
    //   256: ixor
    //   257: ldc2_w 560424955
    //   260: l2i
    //   261: ldc 560424955
    //   263: ixor
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w -2041494745
    //   273: l2i
    //   274: ldc -1245386756
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1921180277
    //   283: l2i
    //   284: ldc -1974381804
    //   286: ixor
    //   287: ldc2_w 1903591186
    //   290: l2i
    //   291: ldc -170762523
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 14784, -1221491412 -> 280, 2088210582 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w 1756013383
    //   332: l2i
    //   333: ldc 2007556197
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 146548140
    //   342: l2i
    //   343: ldc -1678430871
    //   345: ixor
    //   346: ldc2_w 928844872
    //   349: l2i
    //   350: ldc 1223075298
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 14996, -319643281 -> 380, 1622796936 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w -868691742
    //   390: l2i
    //   391: ldc 459934785
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -1720066695
    //   400: l2i
    //   401: ldc 2145869903
    //   403: ixor
    //   404: ldc2_w -352226293
    //   407: l2i
    //   408: ldc 1178689081
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, 1549907252 -> 397, 2048063121 -> 14694
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '결㌃곯'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w -1177028427
    //   456: l2i
    //   457: ldc 1585209379
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -960130180
    //   466: l2i
    //   467: ldc 2038870597
    //   469: ixor
    //   470: ldc2_w 511408533
    //   473: l2i
    //   474: ldc -877176795
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, 845658406 -> 14762, 1441953075 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -1049989457
    //   510: l2i
    //   511: ldc -1049989458
    //   513: ixor
    //   514: getstatic Perryc.0 : I
    //   517: ifle -> 530
    //   520: ldc2_w -427513214
    //   523: l2i
    //   524: ldc 1661622570
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -1694068777
    //   533: l2i
    //   534: ldc 1794381131
    //   536: ixor
    //   537: ldc2_w 629270335
    //   540: l2i
    //   541: ldc 227443459
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 14690, -1384015980 -> 530, -637665632 -> 572
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.0 : I
    //   578: ifle -> 591
    //   581: ldc2_w 435023938
    //   584: l2i
    //   585: ldc 48438314
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w -42762282
    //   594: l2i
    //   595: ldc -1695920039
    //   597: ixor
    //   598: ldc2_w -536169196
    //   601: l2i
    //   602: ldc 405044689
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 14646, -1615337654 -> 632, -484432723 -> 591
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.c : I
    //   638: iflt -> 651
    //   641: ldc2_w 89945784
    //   644: l2i
    //   645: ldc 1894437472
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w -700864712
    //   654: l2i
    //   655: ldc 1626325682
    //   657: ixor
    //   658: ldc2_w 1237055164
    //   661: l2i
    //   662: ldc 1842220167
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 14632, -1834770511 -> 692, 1371758307 -> 651
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.1 : I
    //   698: ifeq -> 711
    //   701: ldc2_w -1642136852
    //   704: l2i
    //   705: ldc -2112736774
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -1099032969
    //   714: l2i
    //   715: ldc -995868114
    //   717: ixor
    //   718: ldc2_w -60023435
    //   721: l2i
    //   722: ldc 1447974902
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 14842, -1238466155 -> 711, -789045542 -> 752
    //   752: putfield fps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.c : I
    //   758: iflt -> 771
    //   761: ldc2_w 454309834
    //   764: l2i
    //   765: ldc -664569290
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w -188915056
    //   774: l2i
    //   775: ldc -1864808238
    //   777: ixor
    //   778: ldc2_w -124952330
    //   781: l2i
    //   782: ldc -749543488
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 14800, -391580982 -> 771, 1337693556 -> 812
    //   812: aload_0
    //   813: getstatic Perryc.0 : I
    //   816: ifle -> 829
    //   819: ldc2_w 811932559
    //   822: l2i
    //   823: ldc -1181982875
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w -1280111831
    //   832: l2i
    //   833: ldc 1213500466
    //   835: ixor
    //   836: ldc2_w -1741400823
    //   839: l2i
    //   840: ldc -29900552
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 872, -269823717 -> 14986, 197683146 -> 829
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc '결㌃곯㶏'
    //   879: getstatic Perryc.1 : I
    //   882: ifeq -> 895
    //   885: ldc2_w -613459542
    //   888: l2i
    //   889: ldc 210516740
    //   891: ixor
    //   892: goto -> 903
    //   895: ldc2_w 432175019
    //   898: l2i
    //   899: ldc_w 1812156238
    //   902: ixor
    //   903: ldc2_w -2144465668
    //   906: l2i
    //   907: ldc_w -963317820
    //   910: ixor
    //   911: ixor
    //   912: lookupswitch default -> 940, -1856405098 -> 14864, -1445026059 -> 895
    //   940: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   943: ldc2_w 1980780929
    //   946: l2i
    //   947: ldc_w 1980780929
    //   950: ixor
    //   951: getstatic Perryc.0 : I
    //   954: ifle -> 968
    //   957: ldc2_w 2114001504
    //   960: l2i
    //   961: ldc_w 398620590
    //   964: ixor
    //   965: goto -> 976
    //   968: ldc2_w 1681120694
    //   971: l2i
    //   972: ldc_w 1026447090
    //   975: ixor
    //   976: ldc2_w -231441356
    //   979: l2i
    //   980: ldc_w -1547476225
    //   983: ixor
    //   984: ixor
    //   985: lookupswitch default -> 1012, -1179973035 -> 968, 942961413 -> 15064
    //   1012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1015: ldc2_w -1718837970
    //   1018: l2i
    //   1019: ldc_w -1718837970
    //   1022: ixor
    //   1023: getstatic Perryc.0 : I
    //   1026: ifle -> 1040
    //   1029: ldc2_w 1303554171
    //   1032: l2i
    //   1033: ldc_w 1378769561
    //   1036: ixor
    //   1037: goto -> 1048
    //   1040: ldc2_w 439646171
    //   1043: l2i
    //   1044: ldc_w 1407184168
    //   1047: ixor
    //   1048: ldc2_w 2068961735
    //   1051: l2i
    //   1052: ldc_w -2113223750
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 1084, -633932229 -> 1040, -423106401 -> 15020
    //   1084: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1087: ldc2_w 1061081061
    //   1090: l2i
    //   1091: ldc_w 1061080161
    //   1094: ixor
    //   1095: getstatic Perryc.1 : I
    //   1098: ifeq -> 1112
    //   1101: ldc2_w 602484543
    //   1104: l2i
    //   1105: ldc_w -396464434
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -817294973
    //   1115: l2i
    //   1116: ldc_w -1105002314
    //   1119: ixor
    //   1120: ldc2_w 1755345360
    //   1123: l2i
    //   1124: ldc_w 1750240997
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 14868, -884621628 -> 1112, 1905847808 -> 1156
    //   1156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1159: getstatic Perryc.c : I
    //   1162: iflt -> 1176
    //   1165: ldc2_w -2004826770
    //   1168: l2i
    //   1169: ldc_w 1726984630
    //   1172: ixor
    //   1173: goto -> 1184
    //   1176: ldc2_w 1761250368
    //   1179: l2i
    //   1180: ldc_w 1500178473
    //   1183: ixor
    //   1184: ldc2_w -2078543306
    //   1187: l2i
    //   1188: ldc_w -294210719
    //   1191: ixor
    //   1192: ixor
    //   1193: lookupswitch default -> 14822, -2080230001 -> 1176, 1543316798 -> 1220
    //   1220: aload_0
    //   1221: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   1226: getstatic Perryc.0 : I
    //   1229: ifle -> 1243
    //   1232: ldc2_w -829879735
    //   1235: l2i
    //   1236: ldc_w -1964106327
    //   1239: ixor
    //   1240: goto -> 1251
    //   1243: ldc2_w -1247264942
    //   1246: l2i
    //   1247: ldc_w -660907896
    //   1250: ixor
    //   1251: ldc2_w 681154565
    //   1254: l2i
    //   1255: ldc_w 1030513510
    //   1258: ixor
    //   1259: ixor
    //   1260: lookupswitch default -> 14932, 1368583299 -> 1243, 2026282169 -> 1288
    //   1288: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w -461051322
    //   1300: l2i
    //   1301: ldc_w -1767326266
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w -610189327
    //   1311: l2i
    //   1312: ldc_w -941222512
    //   1315: ixor
    //   1316: ldc2_w 956878100
    //   1319: l2i
    //   1320: ldc_w -1859129399
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -928243208 -> 1308, -636783267 -> 14908
    //   1352: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1355: getstatic Perryc.c : I
    //   1358: iflt -> 1372
    //   1361: ldc2_w -152476268
    //   1364: l2i
    //   1365: ldc_w -322789895
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 2006762190
    //   1375: l2i
    //   1376: ldc_w 545403147
    //   1379: ixor
    //   1380: ldc2_w 1313464622
    //   1383: l2i
    //   1384: ldc_w -238898583
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 1416, -1516197078 -> 14874, -53820529 -> 1372
    //   1416: putfield FpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -668227747
    //   1428: l2i
    //   1429: ldc_w -1707970605
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 1908581841
    //   1439: l2i
    //   1440: ldc_w 1786218974
    //   1443: ixor
    //   1444: ldc2_w 521874949
    //   1447: l2i
    //   1448: ldc_w -1095491445
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 14988, -1172692351 -> 1480, -474561024 -> 1436
    //   1480: aload_0
    //   1481: getstatic Perryc.c : I
    //   1484: iflt -> 1498
    //   1487: ldc2_w -72667313
    //   1490: l2i
    //   1491: ldc_w 424535457
    //   1494: ixor
    //   1495: goto -> 1506
    //   1498: ldc2_w -757711922
    //   1501: l2i
    //   1502: ldc_w 1725012742
    //   1505: ixor
    //   1506: ldc2_w 2128987363
    //   1509: l2i
    //   1510: ldc_w -429209904
    //   1513: ixor
    //   1514: ixor
    //   1515: lookupswitch default -> 14952, 747152123 -> 1540, 2053753053 -> 1498
    //   1540: aload_0
    //   1541: new bigname/zprestige/webhack/features/setting/Setting
    //   1544: dup
    //   1545: ldc_w '결㌃곯㶎'
    //   1548: getstatic Perryc.c : I
    //   1551: iflt -> 1565
    //   1554: ldc2_w -789604714
    //   1557: l2i
    //   1558: ldc_w 242103572
    //   1561: ixor
    //   1562: goto -> 1573
    //   1565: ldc2_w 1522047424
    //   1568: l2i
    //   1569: ldc_w -417302940
    //   1572: ixor
    //   1573: ldc2_w 1313729569
    //   1576: l2i
    //   1577: ldc_w 70015740
    //   1580: ixor
    //   1581: ixor
    //   1582: lookupswitch default -> 15038, -1797253793 -> 1565, -134653575 -> 1608
    //   1608: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1611: ldc2_w 1471200360
    //   1614: l2i
    //   1615: ldc_w 1471200354
    //   1618: ixor
    //   1619: getstatic Perryc.1 : I
    //   1622: ifeq -> 1636
    //   1625: ldc2_w 1726916782
    //   1628: l2i
    //   1629: ldc_w -438548914
    //   1632: ixor
    //   1633: goto -> 1644
    //   1636: ldc2_w -548192621
    //   1639: l2i
    //   1640: ldc_w 1662666773
    //   1643: ixor
    //   1644: ldc2_w 351568772
    //   1647: l2i
    //   1648: ldc_w 1002520587
    //   1651: ixor
    //   1652: ixor
    //   1653: lookupswitch default -> 14878, -1820543735 -> 1680, -1408815761 -> 1636
    //   1680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1683: ldc2_w 1400626771
    //   1686: l2i
    //   1687: ldc_w 1400626771
    //   1690: ixor
    //   1691: getstatic Perryc.1 : I
    //   1694: ifeq -> 1708
    //   1697: ldc2_w -872433077
    //   1700: l2i
    //   1701: ldc_w 948586832
    //   1704: ixor
    //   1705: goto -> 1716
    //   1708: ldc2_w -1532607940
    //   1711: l2i
    //   1712: ldc_w 1660037990
    //   1715: ixor
    //   1716: ldc2_w 2146752947
    //   1719: l2i
    //   1720: ldc_w 366616775
    //   1723: ixor
    //   1724: ixor
    //   1725: lookupswitch default -> 14652, -1722086801 -> 1708, -1401253842 -> 1752
    //   1752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1755: ldc2_w 209229333
    //   1758: l2i
    //   1759: ldc_w 209228807
    //   1762: ixor
    //   1763: getstatic Perryc.0 : I
    //   1766: ifle -> 1780
    //   1769: ldc2_w -850457037
    //   1772: l2i
    //   1773: ldc_w -311493991
    //   1776: ixor
    //   1777: goto -> 1788
    //   1780: ldc2_w 1680465993
    //   1783: l2i
    //   1784: ldc_w 1239069727
    //   1787: ixor
    //   1788: ldc2_w 1750297739
    //   1791: l2i
    //   1792: ldc_w -2017685520
    //   1795: ixor
    //   1796: ixor
    //   1797: lookupswitch default -> 14740, -1038305491 -> 1824, -808577071 -> 1780
    //   1824: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1827: getstatic Perryc.1 : I
    //   1830: ifeq -> 1844
    //   1833: ldc2_w 1801135637
    //   1836: l2i
    //   1837: ldc_w 525811217
    //   1840: ixor
    //   1841: goto -> 1852
    //   1844: ldc2_w -1567409340
    //   1847: l2i
    //   1848: ldc_w 771217279
    //   1851: ixor
    //   1852: ldc2_w 1602231287
    //   1855: l2i
    //   1856: ldc_w -1837296440
    //   1859: ixor
    //   1860: ixor
    //   1861: lookupswitch default -> 14934, -1175382213 -> 1844, 1117381380 -> 1888
    //   1888: aload_0
    //   1889: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   1894: getstatic Perryc.c : I
    //   1897: iflt -> 1911
    //   1900: ldc2_w 1384434022
    //   1903: l2i
    //   1904: ldc_w -1486964050
    //   1907: ixor
    //   1908: goto -> 1919
    //   1911: ldc2_w -762336065
    //   1914: l2i
    //   1915: ldc_w 991149223
    //   1918: ixor
    //   1919: ldc2_w 1720853389
    //   1922: l2i
    //   1923: ldc_w -349151873
    //   1926: ixor
    //   1927: ixor
    //   1928: lookupswitch default -> 14884, 1681813226 -> 1956, 2021133626 -> 1911
    //   1956: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1959: getstatic Perryc.c : I
    //   1962: iflt -> 1976
    //   1965: ldc2_w 1714042842
    //   1968: l2i
    //   1969: ldc_w -1041600465
    //   1972: ixor
    //   1973: goto -> 1984
    //   1976: ldc2_w 1568643021
    //   1979: l2i
    //   1980: ldc_w 1629779368
    //   1983: ixor
    //   1984: ldc2_w -1531451057
    //   1987: l2i
    //   1988: ldc_w -1168033333
    //   1991: ixor
    //   1992: ixor
    //   1993: lookupswitch default -> 14818, -1189701775 -> 1976, 579678945 -> 2020
    //   2020: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2023: getstatic Perryc.c : I
    //   2026: iflt -> 2040
    //   2029: ldc2_w 1613247173
    //   2032: l2i
    //   2033: ldc_w 952486086
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 1349266034
    //   2043: l2i
    //   2044: ldc_w -1846539852
    //   2047: ixor
    //   2048: ldc2_w -940245190
    //   2051: l2i
    //   2052: ldc_w 304835406
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 2084, -1926074761 -> 14794, -1259408481 -> 2040
    //   2084: putfield FpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2087: getstatic Perryc.c : I
    //   2090: iflt -> 2104
    //   2093: ldc2_w 1102133820
    //   2096: l2i
    //   2097: ldc_w 599896242
    //   2100: ixor
    //   2101: goto -> 2112
    //   2104: ldc2_w 1048847592
    //   2107: l2i
    //   2108: ldc_w 1341247413
    //   2111: ixor
    //   2112: ldc2_w -690961154
    //   2115: l2i
    //   2116: ldc_w 1492466825
    //   2119: ixor
    //   2120: ixor
    //   2121: lookupswitch default -> 15024, -329944327 -> 2104, -11529430 -> 2148
    //   2148: aload_0
    //   2149: getstatic Perryc.0 : I
    //   2152: ifle -> 2166
    //   2155: ldc2_w -463623510
    //   2158: l2i
    //   2159: ldc_w 646942261
    //   2162: ixor
    //   2163: goto -> 2174
    //   2166: ldc2_w 321089009
    //   2169: l2i
    //   2170: ldc_w 2109398428
    //   2173: ixor
    //   2174: ldc2_w -1869932040
    //   2177: l2i
    //   2178: ldc_w -632192701
    //   2181: ixor
    //   2182: ixor
    //   2183: lookupswitch default -> 2208, -2012693468 -> 15000, 2003272035 -> 2166
    //   2208: aload_0
    //   2209: new bigname/zprestige/webhack/features/setting/Setting
    //   2212: dup
    //   2213: ldc_w '겢㌃곯'
    //   2216: getstatic Perryc.0 : I
    //   2219: ifle -> 2233
    //   2222: ldc2_w 2076697815
    //   2225: l2i
    //   2226: ldc_w 1375216583
    //   2229: ixor
    //   2230: goto -> 2241
    //   2233: ldc2_w 1188286124
    //   2236: l2i
    //   2237: ldc_w -1483611082
    //   2240: ixor
    //   2241: ldc2_w 1299603135
    //   2244: l2i
    //   2245: ldc_w -1363261183
    //   2248: ixor
    //   2249: ixor
    //   2250: lookupswitch default -> 14992, -906506066 -> 2233, 42614052 -> 2276
    //   2276: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2279: ldc2_w 1554123377
    //   2282: l2i
    //   2283: ldc_w 1554123376
    //   2286: ixor
    //   2287: getstatic Perryc.1 : I
    //   2290: ifeq -> 2304
    //   2293: ldc2_w -1447202978
    //   2296: l2i
    //   2297: ldc_w -629660996
    //   2300: ixor
    //   2301: goto -> 2312
    //   2304: ldc2_w -1193538319
    //   2307: l2i
    //   2308: ldc_w -1863713859
    //   2311: ixor
    //   2312: ldc2_w 898046386
    //   2315: l2i
    //   2316: ldc_w 618083894
    //   2319: ixor
    //   2320: ixor
    //   2321: lookupswitch default -> 14834, 962975944 -> 2348, 1653957222 -> 2304
    //   2348: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2351: getstatic Perryc.c : I
    //   2354: iflt -> 2368
    //   2357: ldc2_w -937539639
    //   2360: l2i
    //   2361: ldc_w -853778161
    //   2364: ixor
    //   2365: goto -> 2376
    //   2368: ldc2_w -818494492
    //   2371: l2i
    //   2372: ldc_w 905403685
    //   2375: ixor
    //   2376: ldc2_w -2011054834
    //   2379: l2i
    //   2380: ldc_w 455141689
    //   2383: ixor
    //   2384: ixor
    //   2385: lookupswitch default -> 2412, -1778158863 -> 14702, 185468820 -> 2368
    //   2412: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2415: getstatic Perryc.0 : I
    //   2418: ifle -> 2432
    //   2421: ldc2_w -107071193
    //   2424: l2i
    //   2425: ldc_w -146957610
    //   2428: ixor
    //   2429: goto -> 2440
    //   2432: ldc2_w -1703961084
    //   2435: l2i
    //   2436: ldc_w 67547774
    //   2439: ixor
    //   2440: ldc2_w 288334284
    //   2443: l2i
    //   2444: ldc_w -456443420
    //   2447: ixor
    //   2448: ixor
    //   2449: lookupswitch default -> 14966, -79217703 -> 2432, 1804448850 -> 2476
    //   2476: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2479: getstatic Perryc.0 : I
    //   2482: ifle -> 2496
    //   2485: ldc2_w 618384440
    //   2488: l2i
    //   2489: ldc_w -810145736
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w -1801803667
    //   2499: l2i
    //   2500: ldc_w 1147757207
    //   2503: ixor
    //   2504: ldc2_w -1506895823
    //   2507: l2i
    //   2508: ldc_w 1361385126
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 2540, -1141438010 -> 2496, 476474007 -> 14998
    //   2540: putfield tps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2543: getstatic Perryc.0 : I
    //   2546: ifle -> 2560
    //   2549: ldc2_w 1714868552
    //   2552: l2i
    //   2553: ldc_w 131219377
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w 865261847
    //   2563: l2i
    //   2564: ldc_w -592932197
    //   2567: ixor
    //   2568: ldc2_w 660203033
    //   2571: l2i
    //   2572: ldc_w -527408749
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 2604, -1506973325 -> 14636, 1256310541 -> 2560
    //   2604: aload_0
    //   2605: getstatic Perryc.1 : I
    //   2608: ifeq -> 2622
    //   2611: ldc2_w 424211516
    //   2614: l2i
    //   2615: ldc_w -1410585858
    //   2618: ixor
    //   2619: goto -> 2630
    //   2622: ldc2_w 897217929
    //   2625: l2i
    //   2626: ldc_w 1570052850
    //   2629: ixor
    //   2630: ldc2_w 549331359
    //   2633: l2i
    //   2634: ldc_w -1767709631
    //   2637: ixor
    //   2638: ixor
    //   2639: lookupswitch default -> 14682, -554456411 -> 2664, 79174428 -> 2622
    //   2664: aload_0
    //   2665: new bigname/zprestige/webhack/features/setting/Setting
    //   2668: dup
    //   2669: ldc_w '겢㌃곯㶏'
    //   2672: getstatic Perryc.1 : I
    //   2675: ifeq -> 2689
    //   2678: ldc2_w -1332239221
    //   2681: l2i
    //   2682: ldc_w 542033163
    //   2685: ixor
    //   2686: goto -> 2697
    //   2689: ldc2_w -445775702
    //   2692: l2i
    //   2693: ldc_w 1396099945
    //   2696: ixor
    //   2697: ldc2_w 1167239129
    //   2700: l2i
    //   2701: ldc_w -733826886
    //   2704: ixor
    //   2705: ixor
    //   2706: lookupswitch default -> 14798, 17397475 -> 2689, 663280800 -> 2732
    //   2732: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2735: ldc2_w 1764082479
    //   2738: l2i
    //   2739: ldc_w 1764082479
    //   2742: ixor
    //   2743: getstatic Perryc.0 : I
    //   2746: ifle -> 2760
    //   2749: ldc2_w -1768735193
    //   2752: l2i
    //   2753: ldc_w 2064233943
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w -769871774
    //   2763: l2i
    //   2764: ldc_w -89663634
    //   2767: ixor
    //   2768: ldc2_w 1434226546
    //   2771: l2i
    //   2772: ldc_w 2049751761
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 2804, -1932878428 -> 2760, -1026900397 -> 15030
    //   2804: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2807: ldc2_w -1689209158
    //   2810: l2i
    //   2811: ldc_w -1689209158
    //   2814: ixor
    //   2815: getstatic Perryc.0 : I
    //   2818: ifle -> 2832
    //   2821: ldc2_w 992652243
    //   2824: l2i
    //   2825: ldc_w -481675325
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -1837086488
    //   2835: l2i
    //   2836: ldc_w 1306482173
    //   2839: ixor
    //   2840: ldc2_w -2116518683
    //   2843: l2i
    //   2844: ldc_w -613412106
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 15046, -2100760061 -> 2832, -2047380730 -> 2876
    //   2876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2879: ldc2_w -799931911
    //   2882: l2i
    //   2883: ldc_w -799931779
    //   2886: ixor
    //   2887: getstatic Perryc.c : I
    //   2890: iflt -> 2904
    //   2893: ldc2_w 1375874631
    //   2896: l2i
    //   2897: ldc_w 1290413232
    //   2900: ixor
    //   2901: goto -> 2912
    //   2904: ldc2_w -1611463090
    //   2907: l2i
    //   2908: ldc_w -1504628772
    //   2911: ixor
    //   2912: ldc2_w -1731767956
    //   2915: l2i
    //   2916: ldc_w -717176638
    //   2919: ixor
    //   2920: ixor
    //   2921: lookupswitch default -> 14716, 1399823193 -> 2904, 1948629052 -> 2948
    //   2948: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2951: getstatic Perryc.1 : I
    //   2954: ifeq -> 2968
    //   2957: ldc2_w 488741410
    //   2960: l2i
    //   2961: ldc_w 188480151
    //   2964: ixor
    //   2965: goto -> 2976
    //   2968: ldc2_w 1004974282
    //   2971: l2i
    //   2972: ldc_w 1896579884
    //   2975: ixor
    //   2976: ldc2_w 855115821
    //   2979: l2i
    //   2980: ldc_w -814432063
    //   2983: ixor
    //   2984: ixor
    //   2985: lookupswitch default -> 3012, -1969093691 -> 2968, -342448039 -> 14922
    //   3012: aload_0
    //   3013: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   3018: getstatic Perryc.1 : I
    //   3021: ifeq -> 3035
    //   3024: ldc2_w -1327231443
    //   3027: l2i
    //   3028: ldc_w 982634103
    //   3031: ixor
    //   3032: goto -> 3043
    //   3035: ldc2_w 959626624
    //   3038: l2i
    //   3039: ldc_w -1979095034
    //   3042: ixor
    //   3043: ldc2_w -556418323
    //   3046: l2i
    //   3047: ldc_w -1292322602
    //   3050: ixor
    //   3051: ixor
    //   3052: lookupswitch default -> 3080, -1539593621 -> 3035, -430390687 -> 14898
    //   3080: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3083: getstatic Perryc.1 : I
    //   3086: ifeq -> 3100
    //   3089: ldc2_w 1891054918
    //   3092: l2i
    //   3093: ldc_w 1587826623
    //   3096: ixor
    //   3097: goto -> 3108
    //   3100: ldc2_w 777165080
    //   3103: l2i
    //   3104: ldc_w -1163554521
    //   3107: ixor
    //   3108: ldc2_w 1990206537
    //   3111: l2i
    //   3112: ldc_w 774146306
    //   3115: ixor
    //   3116: ixor
    //   3117: lookupswitch default -> 3144, -1599988987 -> 3100, 1989662642 -> 14854
    //   3144: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3147: getstatic Perryc.c : I
    //   3150: iflt -> 3164
    //   3153: ldc2_w -1233022307
    //   3156: l2i
    //   3157: ldc_w -1588801469
    //   3160: ixor
    //   3161: goto -> 3172
    //   3164: ldc2_w 651480841
    //   3167: l2i
    //   3168: ldc_w 962072893
    //   3171: ixor
    //   3172: ldc2_w -494263657
    //   3175: l2i
    //   3176: ldc_w -1853103906
    //   3179: ixor
    //   3180: ixor
    //   3181: lookupswitch default -> 14774, 1691123863 -> 3164, 1821187197 -> 3208
    //   3208: putfield TpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3211: getstatic Perryc.0 : I
    //   3214: ifle -> 3228
    //   3217: ldc2_w 1544503095
    //   3220: l2i
    //   3221: ldc_w -77329412
    //   3224: ixor
    //   3225: goto -> 3236
    //   3228: ldc2_w 1169069939
    //   3231: l2i
    //   3232: ldc_w 94833131
    //   3235: ixor
    //   3236: ldc2_w 1170879693
    //   3239: l2i
    //   3240: ldc_w -1007338192
    //   3243: ixor
    //   3244: ixor
    //   3245: lookupswitch default -> 14766, -969500827 -> 3272, 559168822 -> 3228
    //   3272: aload_0
    //   3273: getstatic Perryc.1 : I
    //   3276: ifeq -> 3290
    //   3279: ldc2_w -699331197
    //   3282: l2i
    //   3283: ldc_w -87830506
    //   3286: ixor
    //   3287: goto -> 3298
    //   3290: ldc2_w -108393841
    //   3293: l2i
    //   3294: ldc_w -1451703882
    //   3297: ixor
    //   3298: ldc2_w -1328665640
    //   3301: l2i
    //   3302: ldc_w 1149652525
    //   3305: ixor
    //   3306: ixor
    //   3307: lookupswitch default -> 3332, -656754592 -> 14886, 997010893 -> 3290
    //   3332: aload_0
    //   3333: new bigname/zprestige/webhack/features/setting/Setting
    //   3336: dup
    //   3337: ldc_w '겢㌃곯㶎'
    //   3340: getstatic Perryc.1 : I
    //   3343: ifeq -> 3357
    //   3346: ldc2_w -2032879173
    //   3349: l2i
    //   3350: ldc_w -1093806689
    //   3353: ixor
    //   3354: goto -> 3365
    //   3357: ldc2_w 608056870
    //   3360: l2i
    //   3361: ldc_w 2018087447
    //   3364: ixor
    //   3365: ldc2_w -648824380
    //   3368: l2i
    //   3369: ldc_w -330132749
    //   3372: ixor
    //   3373: ixor
    //   3374: lookupswitch default -> 3400, 219694867 -> 14752, 1978517157 -> 3357
    //   3400: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3403: ldc2_w 1526535920
    //   3406: l2i
    //   3407: ldc_w 1526535908
    //   3410: ixor
    //   3411: getstatic Perryc.0 : I
    //   3414: ifle -> 3428
    //   3417: ldc2_w 272371529
    //   3420: l2i
    //   3421: ldc_w -1769359099
    //   3424: ixor
    //   3425: goto -> 3436
    //   3428: ldc2_w 1418073038
    //   3431: l2i
    //   3432: ldc_w 2070920689
    //   3435: ixor
    //   3436: ldc2_w -813110930
    //   3439: l2i
    //   3440: ldc_w 628514158
    //   3443: ixor
    //   3444: ixor
    //   3445: lookupswitch default -> 14936, -988341697 -> 3472, 1816855116 -> 3428
    //   3472: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3475: ldc2_w 1296096885
    //   3478: l2i
    //   3479: ldc_w 1296096885
    //   3482: ixor
    //   3483: getstatic Perryc.1 : I
    //   3486: ifeq -> 3500
    //   3489: ldc2_w -660636074
    //   3492: l2i
    //   3493: ldc_w 1326055415
    //   3496: ixor
    //   3497: goto -> 3508
    //   3500: ldc2_w -679085790
    //   3503: l2i
    //   3504: ldc_w -1214090507
    //   3507: ixor
    //   3508: ldc2_w -1472041525
    //   3511: l2i
    //   3512: ldc_w 1603226797
    //   3515: ixor
    //   3516: ixor
    //   3517: lookupswitch default -> 3544, -2005519356 -> 3500, 1616617671 -> 14660
    //   3544: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3547: ldc2_w 332517189
    //   3550: l2i
    //   3551: ldc_w 332516695
    //   3554: ixor
    //   3555: getstatic Perryc.c : I
    //   3558: iflt -> 3572
    //   3561: ldc2_w 711297116
    //   3564: l2i
    //   3565: ldc_w -170954217
    //   3568: ixor
    //   3569: goto -> 3580
    //   3572: ldc2_w 523143151
    //   3575: l2i
    //   3576: ldc_w -1462830495
    //   3579: ixor
    //   3580: ldc2_w -74410456
    //   3583: l2i
    //   3584: ldc_w -1343021495
    //   3587: ixor
    //   3588: ixor
    //   3589: lookupswitch default -> 3616, -1949732310 -> 14744, 1970481500 -> 3572
    //   3616: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3619: getstatic Perryc.1 : I
    //   3622: ifeq -> 3636
    //   3625: ldc2_w -1314853980
    //   3628: l2i
    //   3629: ldc_w -1544771783
    //   3632: ixor
    //   3633: goto -> 3644
    //   3636: ldc2_w 1035168148
    //   3639: l2i
    //   3640: ldc_w -1804370590
    //   3643: ixor
    //   3644: ldc2_w 2077696742
    //   3647: l2i
    //   3648: ldc_w -526423966
    //   3651: ixor
    //   3652: ixor
    //   3653: lookupswitch default -> 3680, -1996224999 -> 15022, 537711448 -> 3636
    //   3680: aload_0
    //   3681: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   3686: getstatic Perryc.0 : I
    //   3689: ifle -> 3703
    //   3692: ldc2_w -1437019656
    //   3695: l2i
    //   3696: ldc_w -1779176599
    //   3699: ixor
    //   3700: goto -> 3711
    //   3703: ldc2_w -5649531
    //   3706: l2i
    //   3707: ldc_w 241477296
    //   3710: ixor
    //   3711: ldc2_w 124391094
    //   3714: l2i
    //   3715: ldc_w 421723536
    //   3718: ixor
    //   3719: ixor
    //   3720: lookupswitch default -> 3748, 568576439 -> 14976, 1027235823 -> 3703
    //   3748: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3751: getstatic Perryc.c : I
    //   3754: iflt -> 3768
    //   3757: ldc2_w 1451151878
    //   3760: l2i
    //   3761: ldc_w -1739201775
    //   3764: ixor
    //   3765: goto -> 3776
    //   3768: ldc2_w -624604875
    //   3771: l2i
    //   3772: ldc_w 1417441450
    //   3775: ixor
    //   3776: ldc2_w -1257186691
    //   3779: l2i
    //   3780: ldc_w 547169399
    //   3783: ixor
    //   3784: ixor
    //   3785: lookupswitch default -> 3812, -1085786769 -> 3768, 1537658653 -> 14924
    //   3812: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3815: getstatic Perryc.0 : I
    //   3818: ifle -> 3832
    //   3821: ldc2_w 1388023442
    //   3824: l2i
    //   3825: ldc_w 559792266
    //   3828: ixor
    //   3829: goto -> 3840
    //   3832: ldc2_w -1476818627
    //   3835: l2i
    //   3836: ldc_w -1825659784
    //   3839: ixor
    //   3840: ldc2_w 533147114
    //   3843: l2i
    //   3844: ldc_w 1980207201
    //   3847: ixor
    //   3848: ixor
    //   3849: lookupswitch default -> 14802, 438760339 -> 3832, 1561825486 -> 3876
    //   3876: putfield TpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3879: getstatic Perryc.1 : I
    //   3882: ifeq -> 3896
    //   3885: ldc2_w -463612421
    //   3888: l2i
    //   3889: ldc_w -723576226
    //   3892: ixor
    //   3893: goto -> 3904
    //   3896: ldc2_w -712012284
    //   3899: l2i
    //   3900: ldc_w -1728144569
    //   3903: ixor
    //   3904: ldc2_w -711039852
    //   3907: l2i
    //   3908: ldc_w -1453202374
    //   3911: ixor
    //   3912: ixor
    //   3913: lookupswitch default -> 3940, 1283280651 -> 14770, 1748170033 -> 3896
    //   3940: aload_0
    //   3941: getstatic Perryc.0 : I
    //   3944: ifle -> 3958
    //   3947: ldc2_w -163516937
    //   3950: l2i
    //   3951: ldc_w 1417688132
    //   3954: ixor
    //   3955: goto -> 3966
    //   3958: ldc2_w -1124341757
    //   3961: l2i
    //   3962: ldc_w -1925616655
    //   3965: ixor
    //   3966: ldc2_w 1647168461
    //   3969: l2i
    //   3970: ldc_w -1676522263
    //   3973: ixor
    //   3974: ixor
    //   3975: lookupswitch default -> 4000, 689004692 -> 3958, 1560239767 -> 14672
    //   4000: aload_0
    //   4001: new bigname/zprestige/webhack/features/setting/Setting
    //   4004: dup
    //   4005: ldc_w '겦㌚곲㶰'
    //   4008: getstatic Perryc.1 : I
    //   4011: ifeq -> 4025
    //   4014: ldc2_w 1727546270
    //   4017: l2i
    //   4018: ldc_w 79288477
    //   4021: ixor
    //   4022: goto -> 4033
    //   4025: ldc2_w 474396332
    //   4028: l2i
    //   4029: ldc_w -1914727517
    //   4032: ixor
    //   4033: ldc2_w -544154161
    //   4036: l2i
    //   4037: ldc_w -1905616925
    //   4040: ixor
    //   4041: ixor
    //   4042: lookupswitch default -> 14812, -1067225309 -> 4068, 867946799 -> 4025
    //   4068: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4071: ldc2_w -1396431488
    //   4074: l2i
    //   4075: ldc_w -1396431487
    //   4078: ixor
    //   4079: getstatic Perryc.1 : I
    //   4082: ifeq -> 4096
    //   4085: ldc2_w -1499159988
    //   4088: l2i
    //   4089: ldc_w 75911934
    //   4092: ixor
    //   4093: goto -> 4104
    //   4096: ldc2_w 1982780193
    //   4099: l2i
    //   4100: ldc_w -1440992110
    //   4103: ixor
    //   4104: ldc2_w -1645854788
    //   4107: l2i
    //   4108: ldc_w 1873586098
    //   4111: ixor
    //   4112: ixor
    //   4113: lookupswitch default -> 14676, 779648957 -> 4140, 1349019836 -> 4096
    //   4140: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4143: getstatic Perryc.0 : I
    //   4146: ifle -> 4160
    //   4149: ldc2_w 905746042
    //   4152: l2i
    //   4153: ldc_w -1951158910
    //   4156: ixor
    //   4157: goto -> 4168
    //   4160: ldc2_w -432013868
    //   4163: l2i
    //   4164: ldc_w 266833276
    //   4167: ixor
    //   4168: ldc2_w -1178966938
    //   4171: l2i
    //   4172: ldc_w 1210480334
    //   4175: ixor
    //   4176: ixor
    //   4177: lookupswitch default -> 4204, 216517412 -> 4160, 1339238736 -> 14890
    //   4204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4207: getstatic Perryc.1 : I
    //   4210: ifeq -> 4224
    //   4213: ldc2_w -1899042808
    //   4216: l2i
    //   4217: ldc_w -299166715
    //   4220: ixor
    //   4221: goto -> 4232
    //   4224: ldc2_w -2001454110
    //   4227: l2i
    //   4228: ldc_w 1757847780
    //   4231: ixor
    //   4232: ldc2_w 669704752
    //   4235: l2i
    //   4236: ldc_w 1008949320
    //   4239: ixor
    //   4240: ixor
    //   4241: lookupswitch default -> 14894, -71622274 -> 4268, 2066499189 -> 4224
    //   4268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4271: getstatic Perryc.c : I
    //   4274: iflt -> 4288
    //   4277: ldc2_w 291396298
    //   4280: l2i
    //   4281: ldc_w -752950890
    //   4284: ixor
    //   4285: goto -> 4296
    //   4288: ldc2_w -886641157
    //   4291: l2i
    //   4292: ldc_w 733640578
    //   4295: ixor
    //   4296: ldc2_w -2048790112
    //   4299: l2i
    //   4300: ldc_w 490685701
    //   4303: ixor
    //   4304: ixor
    //   4305: lookupswitch default -> 14726, 1520308217 -> 4288, 2017603292 -> 4332
    //   4332: putfield ping : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4335: getstatic Perryc.1 : I
    //   4338: ifeq -> 4352
    //   4341: ldc2_w -591970682
    //   4344: l2i
    //   4345: ldc_w -510104748
    //   4348: ixor
    //   4349: goto -> 4360
    //   4352: ldc2_w 1109402840
    //   4355: l2i
    //   4356: ldc_w -1260948958
    //   4359: ixor
    //   4360: ldc2_w -857081767
    //   4363: l2i
    //   4364: ldc_w -1350243889
    //   4367: ixor
    //   4368: ixor
    //   4369: lookupswitch default -> 14746, -1785051284 -> 4396, 1581401156 -> 4352
    //   4396: aload_0
    //   4397: getstatic Perryc.c : I
    //   4400: iflt -> 4414
    //   4403: ldc2_w 520154436
    //   4406: l2i
    //   4407: ldc_w 565223886
    //   4410: ixor
    //   4411: goto -> 4422
    //   4414: ldc2_w -304254992
    //   4417: l2i
    //   4418: ldc_w -288621777
    //   4421: ixor
    //   4422: ldc2_w -14959906
    //   4425: l2i
    //   4426: ldc_w 796458663
    //   4429: ixor
    //   4430: ixor
    //   4431: lookupswitch default -> 4456, -288159501 -> 14814, 1663454893 -> 4414
    //   4456: aload_0
    //   4457: new bigname/zprestige/webhack/features/setting/Setting
    //   4460: dup
    //   4461: ldc_w '겦㌚곲㶰ᨭ'
    //   4464: getstatic Perryc.0 : I
    //   4467: ifle -> 4481
    //   4470: ldc2_w 2047356331
    //   4473: l2i
    //   4474: ldc_w -1273411175
    //   4477: ixor
    //   4478: goto -> 4489
    //   4481: ldc2_w 688714387
    //   4484: l2i
    //   4485: ldc_w 710585156
    //   4488: ixor
    //   4489: ldc2_w 1387357307
    //   4492: l2i
    //   4493: ldc_w -1522566930
    //   4496: ixor
    //   4497: ixor
    //   4498: lookupswitch default -> 4524, -720181399 -> 4481, 966752423 -> 14760
    //   4524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4527: ldc2_w -973263219
    //   4530: l2i
    //   4531: ldc_w -973263219
    //   4534: ixor
    //   4535: getstatic Perryc.0 : I
    //   4538: ifle -> 4552
    //   4541: ldc2_w -1243038919
    //   4544: l2i
    //   4545: ldc_w -1635267478
    //   4548: ixor
    //   4549: goto -> 4560
    //   4552: ldc2_w 1885707471
    //   4555: l2i
    //   4556: ldc_w 919758174
    //   4559: ixor
    //   4560: ldc2_w 45559652
    //   4563: l2i
    //   4564: ldc_w -380763911
    //   4567: ixor
    //   4568: ixor
    //   4569: lookupswitch default -> 4596, -1063888690 -> 14866, 553831881 -> 4552
    //   4596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4599: ldc2_w -1804669669
    //   4602: l2i
    //   4603: ldc_w -1804669669
    //   4606: ixor
    //   4607: getstatic Perryc.0 : I
    //   4610: ifle -> 4624
    //   4613: ldc2_w -2103061963
    //   4616: l2i
    //   4617: ldc_w 629454249
    //   4620: ixor
    //   4621: goto -> 4632
    //   4624: ldc2_w -1406744605
    //   4627: l2i
    //   4628: ldc_w -282713883
    //   4631: ixor
    //   4632: ldc2_w 1326653487
    //   4635: l2i
    //   4636: ldc_w 1748347573
    //   4639: ixor
    //   4640: ixor
    //   4641: lookupswitch default -> 14856, -2146964218 -> 4624, 1680240028 -> 4668
    //   4668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4671: ldc2_w -1472553756
    //   4674: l2i
    //   4675: ldc_w -1472553120
    //   4678: ixor
    //   4679: getstatic Perryc.c : I
    //   4682: iflt -> 4696
    //   4685: ldc2_w -1990776810
    //   4688: l2i
    //   4689: ldc_w 1135181807
    //   4692: ixor
    //   4693: goto -> 4704
    //   4696: ldc2_w 1265212480
    //   4699: l2i
    //   4700: ldc_w -53666142
    //   4703: ixor
    //   4704: ldc2_w -857109397
    //   4707: l2i
    //   4708: ldc_w 413442637
    //   4711: ixor
    //   4712: ixor
    //   4713: lookupswitch default -> 4740, 515078623 -> 14946, 1755940683 -> 4696
    //   4740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4743: getstatic Perryc.1 : I
    //   4746: ifeq -> 4760
    //   4749: ldc2_w 963185739
    //   4752: l2i
    //   4753: ldc_w -1192214318
    //   4756: ixor
    //   4757: goto -> 4768
    //   4760: ldc2_w 1226884262
    //   4763: l2i
    //   4764: ldc_w -31933582
    //   4767: ixor
    //   4768: ldc2_w -185389381
    //   4771: l2i
    //   4772: ldc_w -207411039
    //   4775: ixor
    //   4776: ixor
    //   4777: lookupswitch default -> 14704, -2033628541 -> 4760, -1335330354 -> 4804
    //   4804: aload_0
    //   4805: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   4810: getstatic Perryc.1 : I
    //   4813: ifeq -> 4827
    //   4816: ldc2_w -465908300
    //   4819: l2i
    //   4820: ldc_w 1097334982
    //   4823: ixor
    //   4824: goto -> 4835
    //   4827: ldc2_w -734664043
    //   4830: l2i
    //   4831: ldc_w -1930364726
    //   4834: ixor
    //   4835: ldc2_w -1889102156
    //   4838: l2i
    //   4839: ldc_w 505179223
    //   4842: ixor
    //   4843: ixor
    //   4844: lookupswitch default -> 14974, -910169924 -> 4872, 875050897 -> 4827
    //   4872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4875: getstatic Perryc.1 : I
    //   4878: ifeq -> 4892
    //   4881: ldc2_w -1530650201
    //   4884: l2i
    //   4885: ldc_w -1188663412
    //   4888: ixor
    //   4889: goto -> 4900
    //   4892: ldc2_w 644840071
    //   4895: l2i
    //   4896: ldc_w 525490725
    //   4899: ixor
    //   4900: ldc2_w -1168358600
    //   4903: l2i
    //   4904: ldc_w 869210253
    //   4907: ixor
    //   4908: ixor
    //   4909: lookupswitch default -> 14964, -1804528226 -> 4892, -1330742505 -> 4936
    //   4936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4939: getstatic Perryc.0 : I
    //   4942: ifle -> 4956
    //   4945: ldc2_w -721987049
    //   4948: l2i
    //   4949: ldc_w -1987767026
    //   4952: ixor
    //   4953: goto -> 4964
    //   4956: ldc2_w 1896656406
    //   4959: l2i
    //   4960: ldc_w -458556104
    //   4963: ixor
    //   4964: ldc2_w 1979823919
    //   4967: l2i
    //   4968: ldc_w -1361092803
    //   4971: ixor
    //   4972: ixor
    //   4973: lookupswitch default -> 14698, -2052282613 -> 4956, 1299757884 -> 5000
    //   5000: putfield PingX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5003: getstatic Perryc.0 : I
    //   5006: ifle -> 5020
    //   5009: ldc2_w 1105317583
    //   5012: l2i
    //   5013: ldc_w 1311089984
    //   5016: ixor
    //   5017: goto -> 5028
    //   5020: ldc2_w -1332027768
    //   5023: l2i
    //   5024: ldc_w 330845197
    //   5027: ixor
    //   5028: ldc2_w 1586982492
    //   5031: l2i
    //   5032: ldc_w 116595939
    //   5035: ixor
    //   5036: ixor
    //   5037: lookupswitch default -> 14852, -79241158 -> 5064, 1470110000 -> 5020
    //   5064: aload_0
    //   5065: getstatic Perryc.0 : I
    //   5068: ifle -> 5082
    //   5071: ldc2_w -1012396760
    //   5074: l2i
    //   5075: ldc_w -2073554591
    //   5078: ixor
    //   5079: goto -> 5090
    //   5082: ldc2_w -441439147
    //   5085: l2i
    //   5086: ldc_w -1572647978
    //   5089: ixor
    //   5090: ldc2_w -1376413725
    //   5093: l2i
    //   5094: ldc_w 83024463
    //   5097: ixor
    //   5098: ixor
    //   5099: lookupswitch default -> 14732, -288927259 -> 5082, -285988305 -> 5124
    //   5124: aload_0
    //   5125: new bigname/zprestige/webhack/features/setting/Setting
    //   5128: dup
    //   5129: ldc_w '겦㌚곲㶰ᨬ'
    //   5132: getstatic Perryc.0 : I
    //   5135: ifle -> 5149
    //   5138: ldc2_w 721745016
    //   5141: l2i
    //   5142: ldc_w -476830675
    //   5145: ixor
    //   5146: goto -> 5157
    //   5149: ldc2_w -1214678742
    //   5152: l2i
    //   5153: ldc_w -2052746823
    //   5156: ixor
    //   5157: ldc2_w -939838846
    //   5160: l2i
    //   5161: ldc_w 1034771474
    //   5164: ixor
    //   5165: ixor
    //   5166: lookupswitch default -> 14838, -932542973 -> 5192, 851885765 -> 5149
    //   5192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5195: ldc2_w 1709532648
    //   5198: l2i
    //   5199: ldc_w 1709532662
    //   5202: ixor
    //   5203: getstatic Perryc.1 : I
    //   5206: ifeq -> 5220
    //   5209: ldc2_w -857668147
    //   5212: l2i
    //   5213: ldc_w -2091166414
    //   5216: ixor
    //   5217: goto -> 5228
    //   5220: ldc2_w 57740553
    //   5223: l2i
    //   5224: ldc_w 2072519946
    //   5227: ixor
    //   5228: ldc2_w -1657877334
    //   5231: l2i
    //   5232: ldc_w -1102861230
    //   5235: ixor
    //   5236: ixor
    //   5237: lookupswitch default -> 5264, -136473801 -> 5220, 1826041863 -> 14728
    //   5264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5267: ldc2_w -1197427273
    //   5270: l2i
    //   5271: ldc_w -1197427273
    //   5274: ixor
    //   5275: getstatic Perryc.c : I
    //   5278: iflt -> 5292
    //   5281: ldc2_w -1367588754
    //   5284: l2i
    //   5285: ldc_w -1076617326
    //   5288: ixor
    //   5289: goto -> 5300
    //   5292: ldc2_w -1878156251
    //   5295: l2i
    //   5296: ldc_w 1414514360
    //   5299: ixor
    //   5300: ldc2_w 1114383660
    //   5303: l2i
    //   5304: ldc_w -1562939765
    //   5307: ixor
    //   5308: ixor
    //   5309: lookupswitch default -> 5336, -1062472359 -> 5292, -250407845 -> 14796
    //   5336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5339: ldc2_w -88978499
    //   5342: l2i
    //   5343: ldc_w -88979025
    //   5346: ixor
    //   5347: getstatic Perryc.0 : I
    //   5350: ifle -> 5364
    //   5353: ldc2_w -766185153
    //   5356: l2i
    //   5357: ldc_w -1272629004
    //   5360: ixor
    //   5361: goto -> 5372
    //   5364: ldc2_w -1297021638
    //   5367: l2i
    //   5368: ldc_w -1603725627
    //   5371: ixor
    //   5372: ldc2_w -915573085
    //   5375: l2i
    //   5376: ldc_w 473321068
    //   5379: ixor
    //   5380: ixor
    //   5381: lookupswitch default -> 15028, -1289031420 -> 5364, -947705040 -> 5408
    //   5408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5411: getstatic Perryc.c : I
    //   5414: iflt -> 5428
    //   5417: ldc2_w -2134465978
    //   5420: l2i
    //   5421: ldc_w 400066819
    //   5424: ixor
    //   5425: goto -> 5436
    //   5428: ldc2_w 1738089809
    //   5431: l2i
    //   5432: ldc_w 170842360
    //   5435: ixor
    //   5436: ldc2_w 2013662319
    //   5439: l2i
    //   5440: ldc_w -1830600076
    //   5443: ixor
    //   5444: ixor
    //   5445: lookupswitch default -> 15004, -2024623182 -> 5472, 2113627486 -> 5428
    //   5472: aload_0
    //   5473: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   5478: getstatic Perryc.1 : I
    //   5481: ifeq -> 5495
    //   5484: ldc2_w 675115630
    //   5487: l2i
    //   5488: ldc_w -1455766879
    //   5491: ixor
    //   5492: goto -> 5503
    //   5495: ldc2_w -1159005140
    //   5498: l2i
    //   5499: ldc_w 1980654295
    //   5502: ixor
    //   5503: ldc2_w 1941856121
    //   5506: l2i
    //   5507: ldc_w 1875345742
    //   5510: ixor
    //   5511: ixor
    //   5512: lookupswitch default -> 5540, -1652658440 -> 15006, 827844879 -> 5495
    //   5540: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5543: getstatic Perryc.c : I
    //   5546: iflt -> 5560
    //   5549: ldc2_w 1175445412
    //   5552: l2i
    //   5553: ldc_w 1931479476
    //   5556: ixor
    //   5557: goto -> 5568
    //   5560: ldc2_w 1667462323
    //   5563: l2i
    //   5564: ldc_w -1788476676
    //   5567: ixor
    //   5568: ldc2_w -246764636
    //   5571: l2i
    //   5572: ldc_w -1182578901
    //   5575: ixor
    //   5576: ixor
    //   5577: lookupswitch default -> 5604, 1027577078 -> 5560, 2112240287 -> 14880
    //   5604: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5607: getstatic Perryc.c : I
    //   5610: iflt -> 5624
    //   5613: ldc2_w 547179724
    //   5616: l2i
    //   5617: ldc_w 1808107170
    //   5620: ixor
    //   5621: goto -> 5632
    //   5624: ldc2_w 1970266985
    //   5627: l2i
    //   5628: ldc_w 1214690160
    //   5631: ixor
    //   5632: ldc2_w -519848857
    //   5635: l2i
    //   5636: ldc_w -2013603872
    //   5639: ixor
    //   5640: ixor
    //   5641: lookupswitch default -> 14926, 765567465 -> 5624, 1542470558 -> 5668
    //   5668: putfield PingY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5671: getstatic Perryc.c : I
    //   5674: iflt -> 5688
    //   5677: ldc2_w -165304678
    //   5680: l2i
    //   5681: ldc_w 53279806
    //   5684: ixor
    //   5685: goto -> 5696
    //   5688: ldc2_w -1548551945
    //   5691: l2i
    //   5692: ldc_w 87288815
    //   5695: ixor
    //   5696: ldc2_w -1817488886
    //   5699: l2i
    //   5700: ldc_w -1132823967
    //   5703: ixor
    //   5704: ixor
    //   5705: lookupswitch default -> 5732, -1346053497 -> 5688, -623349041 -> 14916
    //   5732: aload_0
    //   5733: getstatic Perryc.c : I
    //   5736: iflt -> 5750
    //   5739: ldc2_w -761806103
    //   5742: l2i
    //   5743: ldc_w 894345265
    //   5746: ixor
    //   5747: goto -> 5758
    //   5750: ldc2_w 1000073933
    //   5753: l2i
    //   5754: ldc_w -1700238689
    //   5757: ixor
    //   5758: ldc2_w 1547410700
    //   5761: l2i
    //   5762: ldc_w 1569293676
    //   5765: ixor
    //   5766: ixor
    //   5767: lookupswitch default -> 14942, -1602119630 -> 5792, -429163848 -> 5750
    //   5792: aload_0
    //   5793: new bigname/zprestige/webhack/features/setting/Setting
    //   5796: dup
    //   5797: ldc_w '겥㌃곹㶲ᨑ'
    //   5800: getstatic Perryc.1 : I
    //   5803: ifeq -> 5817
    //   5806: ldc2_w 1048457952
    //   5809: l2i
    //   5810: ldc_w 1065638996
    //   5813: ixor
    //   5814: goto -> 5825
    //   5817: ldc2_w 2120255070
    //   5820: l2i
    //   5821: ldc_w -994405820
    //   5824: ixor
    //   5825: ldc2_w -791864192
    //   5828: l2i
    //   5829: ldc_w 678986697
    //   5832: ixor
    //   5833: ixor
    //   5834: lookupswitch default -> 14772, -112201219 -> 5817, 1114606419 -> 5860
    //   5860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5863: ldc2_w -412971479
    //   5866: l2i
    //   5867: ldc_w -412971480
    //   5870: ixor
    //   5871: getstatic Perryc.1 : I
    //   5874: ifeq -> 5888
    //   5877: ldc2_w 2028965802
    //   5880: l2i
    //   5881: ldc_w 202649497
    //   5884: ixor
    //   5885: goto -> 5896
    //   5888: ldc2_w 856049512
    //   5891: l2i
    //   5892: ldc_w 1730672782
    //   5895: ixor
    //   5896: ldc2_w 1995559270
    //   5899: l2i
    //   5900: ldc_w 408861505
    //   5903: ixor
    //   5904: ixor
    //   5905: lookupswitch default -> 5932, 181585464 -> 5888, 441764372 -> 14882
    //   5932: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5935: getstatic Perryc.c : I
    //   5938: iflt -> 5952
    //   5941: ldc2_w -1240936665
    //   5944: l2i
    //   5945: ldc_w -692342043
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w -394875352
    //   5955: l2i
    //   5956: ldc_w 1683265187
    //   5959: ixor
    //   5960: ldc2_w 1238279247
    //   5963: l2i
    //   5964: ldc_w -769629219
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 15066, -77743536 -> 5952, 399310617 -> 5996
    //   5996: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5999: getstatic Perryc.c : I
    //   6002: iflt -> 6016
    //   6005: ldc2_w -1922085971
    //   6008: l2i
    //   6009: ldc_w 178439193
    //   6012: ixor
    //   6013: goto -> 6024
    //   6016: ldc2_w -1918827097
    //   6019: l2i
    //   6020: ldc_w 85289019
    //   6023: ixor
    //   6024: ldc2_w -1712882095
    //   6027: l2i
    //   6028: ldc_w 1538738223
    //   6031: ixor
    //   6032: ixor
    //   6033: lookupswitch default -> 15016, 1167964618 -> 6016, 1256479714 -> 6060
    //   6060: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6063: getstatic Perryc.1 : I
    //   6066: ifeq -> 6080
    //   6069: ldc2_w -1209386660
    //   6072: l2i
    //   6073: ldc_w 236229812
    //   6076: ixor
    //   6077: goto -> 6088
    //   6080: ldc2_w -139639710
    //   6083: l2i
    //   6084: ldc_w 1413010334
    //   6087: ixor
    //   6088: ldc2_w -1078812922
    //   6091: l2i
    //   6092: ldc_w -106595962
    //   6095: ixor
    //   6096: ixor
    //   6097: lookupswitch default -> 6124, -1579496521 -> 6080, -1488024 -> 14670
    //   6124: putfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6127: getstatic Perryc.c : I
    //   6130: iflt -> 6144
    //   6133: ldc2_w 1948885233
    //   6136: l2i
    //   6137: ldc_w -344418177
    //   6140: ixor
    //   6141: goto -> 6152
    //   6144: ldc2_w 1129046599
    //   6147: l2i
    //   6148: ldc_w 1781273274
    //   6151: ixor
    //   6152: ldc2_w 1140687807
    //   6155: l2i
    //   6156: ldc_w 2037242164
    //   6159: ixor
    //   6160: ixor
    //   6161: lookupswitch default -> 14730, -1514053115 -> 6144, 334998134 -> 6188
    //   6188: aload_0
    //   6189: getstatic Perryc.1 : I
    //   6192: ifeq -> 6206
    //   6195: ldc2_w 469441228
    //   6198: l2i
    //   6199: ldc_w 92646771
    //   6202: ixor
    //   6203: goto -> 6214
    //   6206: ldc2_w 1254741223
    //   6209: l2i
    //   6210: ldc_w 1398929244
    //   6213: ixor
    //   6214: ldc2_w -1359669392
    //   6217: l2i
    //   6218: ldc_w -438228684
    //   6221: ixor
    //   6222: ixor
    //   6223: lookupswitch default -> 6248, 825508047 -> 6206, 1433045499 -> 14736
    //   6248: aload_0
    //   6249: new bigname/zprestige/webhack/features/setting/Setting
    //   6252: dup
    //   6253: ldc_w '겥㌃곹㶲ᨑ䈒'
    //   6256: getstatic Perryc.0 : I
    //   6259: ifle -> 6273
    //   6262: ldc2_w -1741070133
    //   6265: l2i
    //   6266: ldc_w 1562157372
    //   6269: ixor
    //   6270: goto -> 6281
    //   6273: ldc2_w -1220006942
    //   6276: l2i
    //   6277: ldc_w 984803260
    //   6280: ixor
    //   6281: ldc2_w 87385666
    //   6284: l2i
    //   6285: ldc_w -249951196
    //   6288: ixor
    //   6289: ixor
    //   6290: lookupswitch default -> 14734, 822782865 -> 6273, 2044044856 -> 6316
    //   6316: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6319: ldc2_w 1934154333
    //   6322: l2i
    //   6323: ldc_w 1934154333
    //   6326: ixor
    //   6327: getstatic Perryc.0 : I
    //   6330: ifle -> 6344
    //   6333: ldc2_w -34583307
    //   6336: l2i
    //   6337: ldc_w -1811723744
    //   6340: ixor
    //   6341: goto -> 6352
    //   6344: ldc2_w -865611056
    //   6347: l2i
    //   6348: ldc_w 1459948582
    //   6351: ixor
    //   6352: ldc2_w 1277304561
    //   6355: l2i
    //   6356: ldc_w -738563560
    //   6359: ixor
    //   6360: ixor
    //   6361: lookupswitch default -> 15072, -164924868 -> 6344, 79342111 -> 6388
    //   6388: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6391: ldc2_w 313040610
    //   6394: l2i
    //   6395: ldc_w 313040610
    //   6398: ixor
    //   6399: getstatic Perryc.0 : I
    //   6402: ifle -> 6416
    //   6405: ldc2_w -1036398484
    //   6408: l2i
    //   6409: ldc_w -1942188904
    //   6412: ixor
    //   6413: goto -> 6424
    //   6416: ldc2_w -699951218
    //   6419: l2i
    //   6420: ldc_w 1467498127
    //   6423: ixor
    //   6424: ldc2_w -1252587346
    //   6427: l2i
    //   6428: ldc_w -1731381715
    //   6431: ixor
    //   6432: ixor
    //   6433: lookupswitch default -> 14984, -1398433918 -> 6460, 1671389815 -> 6416
    //   6460: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6463: ldc2_w -181510661
    //   6466: l2i
    //   6467: ldc_w -181510529
    //   6470: ixor
    //   6471: getstatic Perryc.0 : I
    //   6474: ifle -> 6488
    //   6477: ldc2_w 1315605513
    //   6480: l2i
    //   6481: ldc_w 180950360
    //   6484: ixor
    //   6485: goto -> 6496
    //   6488: ldc2_w -757517593
    //   6491: l2i
    //   6492: ldc_w -1797977159
    //   6495: ixor
    //   6496: ldc2_w -1358488802
    //   6499: l2i
    //   6500: ldc_w 366328370
    //   6503: ixor
    //   6504: ixor
    //   6505: lookupswitch default -> 6532, -108324126 -> 6488, -26134403 -> 14910
    //   6532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6535: getstatic Perryc.0 : I
    //   6538: ifle -> 6552
    //   6541: ldc2_w -1184770585
    //   6544: l2i
    //   6545: ldc_w 634374393
    //   6548: ixor
    //   6549: goto -> 6560
    //   6552: ldc2_w -1795373286
    //   6555: l2i
    //   6556: ldc_w -786603370
    //   6559: ixor
    //   6560: ldc2_w 1430472403
    //   6563: l2i
    //   6564: ldc_w 1648296705
    //   6567: ixor
    //   6568: ixor
    //   6569: lookupswitch default -> 6596, -1482858830 -> 6552, -1412278068 -> 14808
    //   6596: aload_0
    //   6597: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   6602: getstatic Perryc.1 : I
    //   6605: ifeq -> 6619
    //   6608: ldc2_w 1871492659
    //   6611: l2i
    //   6612: ldc_w -763177638
    //   6615: ixor
    //   6616: goto -> 6627
    //   6619: ldc2_w -928905934
    //   6622: l2i
    //   6623: ldc_w -99298812
    //   6626: ixor
    //   6627: ldc2_w -1292331053
    //   6630: l2i
    //   6631: ldc_w 1545971166
    //   6634: ixor
    //   6635: ixor
    //   6636: lookupswitch default -> 6664, 1406357860 -> 14688, 1795447370 -> 6619
    //   6664: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6667: getstatic Perryc.0 : I
    //   6670: ifle -> 6684
    //   6673: ldc2_w -112003568
    //   6676: l2i
    //   6677: ldc_w -496169063
    //   6680: ixor
    //   6681: goto -> 6692
    //   6684: ldc2_w -1270584063
    //   6687: l2i
    //   6688: ldc_w -489794455
    //   6691: ixor
    //   6692: ldc2_w -17138401
    //   6695: l2i
    //   6696: ldc_w -240278165
    //   6699: ixor
    //   6700: ixor
    //   6701: lookupswitch default -> 14648, 342368765 -> 6684, 1507713308 -> 6728
    //   6728: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6731: getstatic Perryc.c : I
    //   6734: iflt -> 6748
    //   6737: ldc2_w 1039544160
    //   6740: l2i
    //   6741: ldc_w -912352033
    //   6744: ixor
    //   6745: goto -> 6756
    //   6748: ldc2_w 287440108
    //   6751: l2i
    //   6752: ldc_w 1473897450
    //   6755: ixor
    //   6756: ldc2_w -1948858615
    //   6759: l2i
    //   6760: ldc_w -2123308305
    //   6763: ixor
    //   6764: ixor
    //   6765: lookupswitch default -> 14804, -20015527 -> 6748, 1281243872 -> 6792
    //   6792: putfield SpeedX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6795: getstatic Perryc.0 : I
    //   6798: ifle -> 6812
    //   6801: ldc2_w 387865467
    //   6804: l2i
    //   6805: ldc_w -498887809
    //   6808: ixor
    //   6809: goto -> 6820
    //   6812: ldc2_w 397290981
    //   6815: l2i
    //   6816: ldc_w -84449923
    //   6819: ixor
    //   6820: ldc2_w -418347257
    //   6823: l2i
    //   6824: ldc_w -639551460
    //   6827: ixor
    //   6828: ixor
    //   6829: lookupswitch default -> 6856, -877889761 -> 14722, 1493778432 -> 6812
    //   6856: aload_0
    //   6857: getstatic Perryc.1 : I
    //   6860: ifeq -> 6874
    //   6863: ldc2_w -1744201504
    //   6866: l2i
    //   6867: ldc_w 323024717
    //   6870: ixor
    //   6871: goto -> 6882
    //   6874: ldc2_w 587164695
    //   6877: l2i
    //   6878: ldc_w -1555694203
    //   6881: ixor
    //   6882: ldc2_w 452898933
    //   6885: l2i
    //   6886: ldc_w -1593394287
    //   6889: ixor
    //   6890: ixor
    //   6891: lookupswitch default -> 6916, -1389778312 -> 6874, 816931913 -> 15056
    //   6916: aload_0
    //   6917: new bigname/zprestige/webhack/features/setting/Setting
    //   6920: dup
    //   6921: ldc_w '겥㌃곹㶲ᨑ䈓'
    //   6924: getstatic Perryc.c : I
    //   6927: iflt -> 6941
    //   6930: ldc2_w -1707610951
    //   6933: l2i
    //   6934: ldc_w -1831069926
    //   6937: ixor
    //   6938: goto -> 6949
    //   6941: ldc2_w 605248656
    //   6944: l2i
    //   6945: ldc_w 1398283988
    //   6948: ixor
    //   6949: ldc2_w -2129602581
    //   6952: l2i
    //   6953: ldc_w -1803139100
    //   6956: ixor
    //   6957: ixor
    //   6958: lookupswitch default -> 14756, 494758828 -> 6941, 1658704459 -> 6984
    //   6984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6987: ldc2_w 1643278366
    //   6990: l2i
    //   6991: ldc_w 1643278390
    //   6994: ixor
    //   6995: getstatic Perryc.1 : I
    //   6998: ifeq -> 7012
    //   7001: ldc2_w 931825745
    //   7004: l2i
    //   7005: ldc_w 836484450
    //   7008: ixor
    //   7009: goto -> 7020
    //   7012: ldc2_w 1166725930
    //   7015: l2i
    //   7016: ldc_w -1549446994
    //   7019: ixor
    //   7020: ldc2_w -1055994207
    //   7023: l2i
    //   7024: ldc_w 1701364829
    //   7027: ixor
    //   7028: ixor
    //   7029: lookupswitch default -> 7056, -1573437489 -> 14920, 852128288 -> 7012
    //   7056: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7059: ldc2_w -265233901
    //   7062: l2i
    //   7063: ldc_w -265233901
    //   7066: ixor
    //   7067: getstatic Perryc.1 : I
    //   7070: ifeq -> 7084
    //   7073: ldc2_w 1086759561
    //   7076: l2i
    //   7077: ldc_w 426049916
    //   7080: ixor
    //   7081: goto -> 7092
    //   7084: ldc2_w -1807104702
    //   7087: l2i
    //   7088: ldc_w -995958202
    //   7091: ixor
    //   7092: ldc2_w -359860704
    //   7095: l2i
    //   7096: ldc_w 154221865
    //   7099: ixor
    //   7100: ixor
    //   7101: lookupswitch default -> 14792, -1286149107 -> 7128, -1172412164 -> 7084
    //   7128: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7131: ldc2_w 534214332
    //   7134: l2i
    //   7135: ldc_w 534213806
    //   7138: ixor
    //   7139: getstatic Perryc.c : I
    //   7142: iflt -> 7156
    //   7145: ldc2_w -296413278
    //   7148: l2i
    //   7149: ldc_w 13203522
    //   7152: ixor
    //   7153: goto -> 7164
    //   7156: ldc2_w -1870127865
    //   7159: l2i
    //   7160: ldc_w -826446103
    //   7163: ixor
    //   7164: ldc2_w -1144491949
    //   7167: l2i
    //   7168: ldc_w 1643513221
    //   7171: ixor
    //   7172: ixor
    //   7173: lookupswitch default -> 7200, 883038774 -> 14970, 1256535874 -> 7156
    //   7200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7203: getstatic Perryc.0 : I
    //   7206: ifle -> 7220
    //   7209: ldc2_w 2088873424
    //   7212: l2i
    //   7213: ldc_w 1201779365
    //   7216: ixor
    //   7217: goto -> 7228
    //   7220: ldc2_w -908541210
    //   7223: l2i
    //   7224: ldc_w 1693644903
    //   7227: ixor
    //   7228: ldc2_w -2057215652
    //   7231: l2i
    //   7232: ldc_w -1942535745
    //   7235: ixor
    //   7236: ixor
    //   7237: lookupswitch default -> 7264, 846610326 -> 14712, 2012855395 -> 7220
    //   7264: aload_0
    //   7265: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   7270: getstatic Perryc.0 : I
    //   7273: ifle -> 7287
    //   7276: ldc2_w 762844086
    //   7279: l2i
    //   7280: ldc_w -2076036107
    //   7283: ixor
    //   7284: goto -> 7295
    //   7287: ldc2_w 1105064176
    //   7290: l2i
    //   7291: ldc_w 1359368601
    //   7294: ixor
    //   7295: ldc2_w 1698571656
    //   7298: l2i
    //   7299: ldc_w -1977780967
    //   7302: ixor
    //   7303: ixor
    //   7304: lookupswitch default -> 7332, 1176072402 -> 14994, 1737454773 -> 7287
    //   7332: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7335: getstatic Perryc.1 : I
    //   7338: ifeq -> 7352
    //   7341: ldc2_w -1229388740
    //   7344: l2i
    //   7345: ldc_w 1706791394
    //   7348: ixor
    //   7349: goto -> 7360
    //   7352: ldc2_w 2005236818
    //   7355: l2i
    //   7356: ldc_w -1270328362
    //   7359: ixor
    //   7360: ldc2_w 891267955
    //   7363: l2i
    //   7364: ldc_w 184242010
    //   7367: ixor
    //   7368: ixor
    //   7369: lookupswitch default -> 7396, -2002256911 -> 7352, -320441865 -> 14904
    //   7396: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7399: getstatic Perryc.0 : I
    //   7402: ifle -> 7416
    //   7405: ldc2_w 2060028981
    //   7408: l2i
    //   7409: ldc_w 2025365724
    //   7412: ixor
    //   7413: goto -> 7424
    //   7416: ldc2_w -300398549
    //   7419: l2i
    //   7420: ldc_w 107000455
    //   7423: ixor
    //   7424: ldc2_w -643826861
    //   7427: l2i
    //   7428: ldc_w -2078052886
    //   7431: ixor
    //   7432: ixor
    //   7433: lookupswitch default -> 7460, 1607318096 -> 14776, 2100660295 -> 7416
    //   7460: putfield SpeedY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7463: getstatic Perryc.c : I
    //   7466: iflt -> 7480
    //   7469: ldc2_w 1603684779
    //   7472: l2i
    //   7473: ldc_w 1408557891
    //   7476: ixor
    //   7477: goto -> 7488
    //   7480: ldc2_w 1213722363
    //   7483: l2i
    //   7484: ldc_w 535918231
    //   7487: ixor
    //   7488: ldc2_w 2087953183
    //   7491: l2i
    //   7492: ldc_w -771085189
    //   7495: ixor
    //   7496: ixor
    //   7497: lookupswitch default -> 14958, -1575279220 -> 7480, -102820088 -> 7524
    //   7524: aload_0
    //   7525: getstatic Perryc.c : I
    //   7528: iflt -> 7542
    //   7531: ldc2_w -2023758779
    //   7534: l2i
    //   7535: ldc_w -1544465979
    //   7538: ixor
    //   7539: goto -> 7550
    //   7542: ldc2_w -206404952
    //   7545: l2i
    //   7546: ldc_w -1765444039
    //   7549: ixor
    //   7550: ldc2_w 289870763
    //   7553: l2i
    //   7554: ldc_w 1985063071
    //   7557: ixor
    //   7558: ixor
    //   7559: lookupswitch default -> 7584, -322239231 -> 7542, 1136135860 -> 14978
    //   7584: aload_0
    //   7585: new bigname/zprestige/webhack/features/setting/Setting
    //   7588: dup
    //   7589: ldc_w '겢㌚곱㶲'
    //   7592: getstatic Perryc.c : I
    //   7595: iflt -> 7609
    //   7598: ldc2_w -2113202746
    //   7601: l2i
    //   7602: ldc_w 844871065
    //   7605: ixor
    //   7606: goto -> 7617
    //   7609: ldc2_w 1170739720
    //   7612: l2i
    //   7613: ldc_w -197781251
    //   7616: ixor
    //   7617: ldc2_w -2018350315
    //   7620: l2i
    //   7621: ldc_w -265355416
    //   7624: ixor
    //   7625: ixor
    //   7626: lookupswitch default -> 7652, -1489364618 -> 7609, -942918622 -> 14950
    //   7652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7655: ldc2_w 509181468
    //   7658: l2i
    //   7659: ldc_w 509181469
    //   7662: ixor
    //   7663: getstatic Perryc.0 : I
    //   7666: ifle -> 7680
    //   7669: ldc2_w -1455324543
    //   7672: l2i
    //   7673: ldc_w 1376788990
    //   7676: ixor
    //   7677: goto -> 7688
    //   7680: ldc2_w 1952876462
    //   7683: l2i
    //   7684: ldc_w -1170482122
    //   7687: ixor
    //   7688: ldc2_w 779256856
    //   7691: l2i
    //   7692: ldc_w -1752567094
    //   7695: ixor
    //   7696: ixor
    //   7697: lookupswitch default -> 14638, 1118492077 -> 7680, 2007379274 -> 7724
    //   7724: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7727: getstatic Perryc.0 : I
    //   7730: ifle -> 7744
    //   7733: ldc2_w -1405270720
    //   7736: l2i
    //   7737: ldc_w -279764566
    //   7740: ixor
    //   7741: goto -> 7752
    //   7744: ldc2_w -842804453
    //   7747: l2i
    //   7748: ldc_w 2137472382
    //   7751: ixor
    //   7752: ldc2_w 284706319
    //   7755: l2i
    //   7756: ldc_w 2017387641
    //   7759: ixor
    //   7760: ixor
    //   7761: lookupswitch default -> 14650, -631092205 -> 7788, 732481180 -> 7744
    //   7788: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   7791: getstatic Perryc.c : I
    //   7794: iflt -> 7808
    //   7797: ldc2_w -1272555296
    //   7800: l2i
    //   7801: ldc_w 752836899
    //   7804: ixor
    //   7805: goto -> 7816
    //   7808: ldc2_w -62231806
    //   7811: l2i
    //   7812: ldc_w 1290643733
    //   7815: ixor
    //   7816: ldc2_w 2119282512
    //   7819: l2i
    //   7820: ldc_w -986617831
    //   7823: ixor
    //   7824: ixor
    //   7825: lookupswitch default -> 7852, 323134648 -> 7808, 597294730 -> 14782
    //   7852: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7855: getstatic Perryc.c : I
    //   7858: iflt -> 7872
    //   7861: ldc2_w -2002563992
    //   7864: l2i
    //   7865: ldc_w 1305481440
    //   7868: ixor
    //   7869: goto -> 7880
    //   7872: ldc2_w -799373204
    //   7875: l2i
    //   7876: ldc_w 15876293
    //   7879: ixor
    //   7880: ldc2_w 1123065359
    //   7883: l2i
    //   7884: ldc_w 446985610
    //   7887: ixor
    //   7888: ixor
    //   7889: lookupswitch default -> 15002, -1996741844 -> 7916, -1658341619 -> 7872
    //   7916: putfield time : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7919: getstatic Perryc.1 : I
    //   7922: ifeq -> 7936
    //   7925: ldc2_w -1298352927
    //   7928: l2i
    //   7929: ldc_w 365593413
    //   7932: ixor
    //   7933: goto -> 7944
    //   7936: ldc2_w 792305080
    //   7939: l2i
    //   7940: ldc_w -180122174
    //   7943: ixor
    //   7944: ldc2_w 48467773
    //   7947: l2i
    //   7948: ldc_w 2058376937
    //   7951: ixor
    //   7952: ixor
    //   7953: lookupswitch default -> 14816, -1574319698 -> 7980, -553259408 -> 7936
    //   7980: aload_0
    //   7981: getstatic Perryc.1 : I
    //   7984: ifeq -> 7998
    //   7987: ldc2_w 905473601
    //   7990: l2i
    //   7991: ldc_w -1367218802
    //   7994: ixor
    //   7995: goto -> 8006
    //   7998: ldc2_w 2100913635
    //   8001: l2i
    //   8002: ldc_w 419561569
    //   8005: ixor
    //   8006: ldc2_w 22923451
    //   8009: l2i
    //   8010: ldc_w -615953724
    //   8013: ixor
    //   8014: ixor
    //   8015: lookupswitch default -> 15044, -1104156675 -> 8040, 1097664944 -> 7998
    //   8040: aload_0
    //   8041: new bigname/zprestige/webhack/features/setting/Setting
    //   8044: dup
    //   8045: ldc_w '겢㌚곱㶲ᨭ'
    //   8048: getstatic Perryc.0 : I
    //   8051: ifle -> 8065
    //   8054: ldc2_w 381207211
    //   8057: l2i
    //   8058: ldc_w -1246489173
    //   8061: ixor
    //   8062: goto -> 8073
    //   8065: ldc2_w -816301552
    //   8068: l2i
    //   8069: ldc_w 1352345747
    //   8072: ixor
    //   8073: ldc2_w -659489801
    //   8076: l2i
    //   8077: ldc_w 42425605
    //   8080: ixor
    //   8081: ixor
    //   8082: lookupswitch default -> 8108, -1411713367 -> 8065, 2033938930 -> 15042
    //   8108: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8111: ldc2_w -1382712671
    //   8114: l2i
    //   8115: ldc_w -1382712671
    //   8118: ixor
    //   8119: getstatic Perryc.c : I
    //   8122: iflt -> 8136
    //   8125: ldc2_w -325672660
    //   8128: l2i
    //   8129: ldc_w 1275514901
    //   8132: ixor
    //   8133: goto -> 8144
    //   8136: ldc2_w -1647851647
    //   8139: l2i
    //   8140: ldc_w 1256815532
    //   8143: ixor
    //   8144: ldc2_w 850906888
    //   8147: l2i
    //   8148: ldc_w 1382166465
    //   8151: ixor
    //   8152: ixor
    //   8153: lookupswitch default -> 8180, -1069182480 -> 14666, 1133109626 -> 8136
    //   8180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8183: ldc2_w -1082070197
    //   8186: l2i
    //   8187: ldc_w -1082070197
    //   8190: ixor
    //   8191: getstatic Perryc.c : I
    //   8194: iflt -> 8208
    //   8197: ldc2_w -602275068
    //   8200: l2i
    //   8201: ldc_w -711811819
    //   8204: ixor
    //   8205: goto -> 8216
    //   8208: ldc2_w 97148805
    //   8211: l2i
    //   8212: ldc_w -1894672734
    //   8215: ixor
    //   8216: ldc2_w -701946919
    //   8219: l2i
    //   8220: ldc_w 1508192814
    //   8223: ixor
    //   8224: ixor
    //   8225: lookupswitch default -> 14706, -2042327066 -> 8208, 85448912 -> 8252
    //   8252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8255: ldc2_w -285566424
    //   8258: l2i
    //   8259: ldc_w -285566548
    //   8262: ixor
    //   8263: getstatic Perryc.1 : I
    //   8266: ifeq -> 8280
    //   8269: ldc2_w 990566747
    //   8272: l2i
    //   8273: ldc_w -371285566
    //   8276: ixor
    //   8277: goto -> 8288
    //   8280: ldc2_w -2135582692
    //   8283: l2i
    //   8284: ldc_w 648345740
    //   8287: ixor
    //   8288: ldc2_w -1786376705
    //   8291: l2i
    //   8292: ldc_w 2105191133
    //   8295: ixor
    //   8296: ixor
    //   8297: lookupswitch default -> 8324, -598474862 -> 8280, 975757243 -> 14686
    //   8324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8327: getstatic Perryc.c : I
    //   8330: iflt -> 8344
    //   8333: ldc2_w -564140492
    //   8336: l2i
    //   8337: ldc_w -213778474
    //   8340: ixor
    //   8341: goto -> 8352
    //   8344: ldc2_w -1679381109
    //   8347: l2i
    //   8348: ldc_w 635790446
    //   8351: ixor
    //   8352: ldc2_w -2068488880
    //   8355: l2i
    //   8356: ldc_w 1497290605
    //   8359: ixor
    //   8360: ixor
    //   8361: lookupswitch default -> 14832, -258632737 -> 8344, 1669874648 -> 8388
    //   8388: aload_0
    //   8389: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   8394: getstatic Perryc.0 : I
    //   8397: ifle -> 8411
    //   8400: ldc2_w -743913553
    //   8403: l2i
    //   8404: ldc_w -879562683
    //   8407: ixor
    //   8408: goto -> 8419
    //   8411: ldc2_w -1034839572
    //   8414: l2i
    //   8415: ldc_w 794098656
    //   8418: ixor
    //   8419: ldc2_w 1306081472
    //   8422: l2i
    //   8423: ldc_w 1503574782
    //   8426: ixor
    //   8427: ixor
    //   8428: lookupswitch default -> 8456, 209565140 -> 14870, 875032837 -> 8411
    //   8456: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8459: getstatic Perryc.1 : I
    //   8462: ifeq -> 8476
    //   8465: ldc2_w -1858870584
    //   8468: l2i
    //   8469: ldc_w 1202734294
    //   8472: ixor
    //   8473: goto -> 8484
    //   8476: ldc2_w 252268779
    //   8479: l2i
    //   8480: ldc_w 1176241582
    //   8483: ixor
    //   8484: ldc2_w -1012721810
    //   8487: l2i
    //   8488: ldc_w 632095805
    //   8491: ixor
    //   8492: ixor
    //   8493: lookupswitch default -> 8520, 376579304 -> 8476, 814593357 -> 14634
    //   8520: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8523: getstatic Perryc.1 : I
    //   8526: ifeq -> 8540
    //   8529: ldc2_w 584665829
    //   8532: l2i
    //   8533: ldc_w 430669924
    //   8536: ixor
    //   8537: goto -> 8548
    //   8540: ldc2_w 787217203
    //   8543: l2i
    //   8544: ldc_w -844270550
    //   8547: ixor
    //   8548: ldc2_w 2122795618
    //   8551: l2i
    //   8552: ldc_w -1878358058
    //   8555: ixor
    //   8556: ixor
    //   8557: lookupswitch default -> 14892, -704706763 -> 8540, 231424685 -> 8584
    //   8584: putfield TimeX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8587: getstatic Perryc.0 : I
    //   8590: ifle -> 8604
    //   8593: ldc2_w 1666008195
    //   8596: l2i
    //   8597: ldc_w 1492333343
    //   8600: ixor
    //   8601: goto -> 8612
    //   8604: ldc2_w -438454503
    //   8607: l2i
    //   8608: ldc_w -1287672554
    //   8611: ixor
    //   8612: ldc2_w -1447789742
    //   8615: l2i
    //   8616: ldc_w -541008964
    //   8619: ixor
    //   8620: ixor
    //   8621: lookupswitch default -> 14754, 546749153 -> 8648, 1305139058 -> 8604
    //   8648: aload_0
    //   8649: getstatic Perryc.c : I
    //   8652: iflt -> 8666
    //   8655: ldc2_w 1750100298
    //   8658: l2i
    //   8659: ldc_w -1446948220
    //   8662: ixor
    //   8663: goto -> 8674
    //   8666: ldc2_w -863170749
    //   8669: l2i
    //   8670: ldc_w 128439936
    //   8673: ixor
    //   8674: ldc2_w 1768517680
    //   8677: l2i
    //   8678: ldc_w -28448496
    //   8681: ixor
    //   8682: ixor
    //   8683: lookupswitch default -> 14948, 1454744302 -> 8666, 1544437987 -> 8708
    //   8708: aload_0
    //   8709: new bigname/zprestige/webhack/features/setting/Setting
    //   8712: dup
    //   8713: ldc_w '겢㌚곱㶲ᨬ'
    //   8716: getstatic Perryc.1 : I
    //   8719: ifeq -> 8733
    //   8722: ldc2_w 1672099384
    //   8725: l2i
    //   8726: ldc_w 1400463869
    //   8729: ixor
    //   8730: goto -> 8741
    //   8733: ldc2_w -1681715081
    //   8736: l2i
    //   8737: ldc_w -1512463519
    //   8740: ixor
    //   8741: ldc2_w -1365519299
    //   8744: l2i
    //   8745: ldc_w 1076746862
    //   8748: ixor
    //   8749: ixor
    //   8750: lookupswitch default -> 8776, -2112085034 -> 8733, -563783274 -> 14944
    //   8776: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8779: ldc2_w 957375843
    //   8782: l2i
    //   8783: ldc_w 957375825
    //   8786: ixor
    //   8787: getstatic Perryc.0 : I
    //   8790: ifle -> 8804
    //   8793: ldc2_w 1700444192
    //   8796: l2i
    //   8797: ldc_w -882001632
    //   8800: ixor
    //   8801: goto -> 8812
    //   8804: ldc2_w -22561217
    //   8807: l2i
    //   8808: ldc_w 1204969482
    //   8811: ixor
    //   8812: ldc2_w -1913241305
    //   8815: l2i
    //   8816: ldc_w 1370871865
    //   8819: ixor
    //   8820: ixor
    //   8821: lookupswitch default -> 14764, 1698055979 -> 8848, 1920243742 -> 8804
    //   8848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8851: ldc2_w 129078687
    //   8854: l2i
    //   8855: ldc_w 129078687
    //   8858: ixor
    //   8859: getstatic Perryc.0 : I
    //   8862: ifle -> 8876
    //   8865: ldc2_w 1812665508
    //   8868: l2i
    //   8869: ldc_w 2119812879
    //   8872: ixor
    //   8873: goto -> 8884
    //   8876: ldc2_w 506104989
    //   8879: l2i
    //   8880: ldc_w -2125006689
    //   8883: ixor
    //   8884: ldc2_w 797964764
    //   8887: l2i
    //   8888: ldc_w 1643657145
    //   8891: ixor
    //   8892: ixor
    //   8893: lookupswitch default -> 8920, 1545936334 -> 14710, 1761308938 -> 8876
    //   8920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8923: ldc2_w 1699240788
    //   8926: l2i
    //   8927: ldc_w 1699240262
    //   8930: ixor
    //   8931: getstatic Perryc.1 : I
    //   8934: ifeq -> 8948
    //   8937: ldc2_w -1528675119
    //   8940: l2i
    //   8941: ldc_w -1304778745
    //   8944: ixor
    //   8945: goto -> 8956
    //   8948: ldc2_w 1558712517
    //   8951: l2i
    //   8952: ldc_w -808746637
    //   8955: ixor
    //   8956: ldc2_w -1753607493
    //   8959: l2i
    //   8960: ldc_w 1838980681
    //   8963: ixor
    //   8964: ixor
    //   8965: lookupswitch default -> 14914, -331456476 -> 8948, 1774525764 -> 8992
    //   8992: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8995: getstatic Perryc.0 : I
    //   8998: ifle -> 9012
    //   9001: ldc2_w -1703781030
    //   9004: l2i
    //   9005: ldc_w -1131840827
    //   9008: ixor
    //   9009: goto -> 9020
    //   9012: ldc2_w -1140891528
    //   9015: l2i
    //   9016: ldc_w 181106276
    //   9019: ixor
    //   9020: ldc2_w -423891283
    //   9023: l2i
    //   9024: ldc_w -309983847
    //   9027: ixor
    //   9028: ixor
    //   9029: lookupswitch default -> 9056, 768003243 -> 15054, 1330080776 -> 9012
    //   9056: aload_0
    //   9057: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   9062: getstatic Perryc.1 : I
    //   9065: ifeq -> 9079
    //   9068: ldc2_w 1888145512
    //   9071: l2i
    //   9072: ldc_w 1929025532
    //   9075: ixor
    //   9076: goto -> 9087
    //   9079: ldc2_w 1068714383
    //   9082: l2i
    //   9083: ldc_w 2021364805
    //   9086: ixor
    //   9087: ldc2_w 1356013447
    //   9090: l2i
    //   9091: ldc_w 611667052
    //   9094: ixor
    //   9095: ixor
    //   9096: lookupswitch default -> 14962, 862883361 -> 9124, 1993741439 -> 9079
    //   9124: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9127: getstatic Perryc.c : I
    //   9130: iflt -> 9144
    //   9133: ldc2_w -762762697
    //   9136: l2i
    //   9137: ldc_w 913180957
    //   9140: ixor
    //   9141: goto -> 9152
    //   9144: ldc2_w 364116134
    //   9147: l2i
    //   9148: ldc_w 1245240301
    //   9151: ixor
    //   9152: ldc2_w 623419462
    //   9155: l2i
    //   9156: ldc_w -730240628
    //   9159: ixor
    //   9160: ixor
    //   9161: lookupswitch default -> 9188, -600056642 -> 9144, 364309216 -> 15010
    //   9188: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9191: getstatic Perryc.0 : I
    //   9194: ifle -> 9208
    //   9197: ldc2_w 1614480630
    //   9200: l2i
    //   9201: ldc_w -744038551
    //   9204: ixor
    //   9205: goto -> 9216
    //   9208: ldc2_w -1623886715
    //   9211: l2i
    //   9212: ldc_w 817041113
    //   9215: ixor
    //   9216: ldc2_w -155081870
    //   9219: l2i
    //   9220: ldc_w 1756532372
    //   9223: ixor
    //   9224: ixor
    //   9225: lookupswitch default -> 15034, 770635385 -> 9208, 838162362 -> 9252
    //   9252: putfield TimeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9255: getstatic Perryc.0 : I
    //   9258: ifle -> 9272
    //   9261: ldc2_w 285113446
    //   9264: l2i
    //   9265: ldc_w -1496461924
    //   9268: ixor
    //   9269: goto -> 9280
    //   9272: ldc2_w 1238479928
    //   9275: l2i
    //   9276: ldc_w 2011240226
    //   9279: ixor
    //   9280: ldc2_w -373850683
    //   9283: l2i
    //   9284: ldc_w 480062903
    //   9287: ixor
    //   9288: ixor
    //   9289: lookupswitch default -> 14938, -887426200 -> 9316, 1125769608 -> 9272
    //   9316: aload_0
    //   9317: getstatic Perryc.0 : I
    //   9320: ifle -> 9334
    //   9323: ldc2_w -837127559
    //   9326: l2i
    //   9327: ldc_w -110305178
    //   9330: ixor
    //   9331: goto -> 9342
    //   9334: ldc2_w 1533295787
    //   9337: l2i
    //   9338: ldc_w 1134418650
    //   9341: ixor
    //   9342: ldc2_w 1011156862
    //   9345: l2i
    //   9346: ldc_w 1807927940
    //   9349: ixor
    //   9350: ixor
    //   9351: lookupswitch default -> 14806, 1333668747 -> 9376, 1626431461 -> 9334
    //   9376: aload_0
    //   9377: new bigname/zprestige/webhack/features/setting/Setting
    //   9380: dup
    //   9381: ldc_w '겵㌁곥㶤ᨁ䈫๵턨'
    //   9384: getstatic Perryc.c : I
    //   9387: iflt -> 9401
    //   9390: ldc2_w -1155278892
    //   9393: l2i
    //   9394: ldc_w 1133929330
    //   9397: ixor
    //   9398: goto -> 9409
    //   9401: ldc2_w 847385819
    //   9404: l2i
    //   9405: ldc_w 181854479
    //   9408: ixor
    //   9409: ldc2_w 1864380508
    //   9412: l2i
    //   9413: ldc_w 1171873817
    //   9416: ixor
    //   9417: ixor
    //   9418: lookupswitch default -> 9444, -766712605 -> 14700, 1956111243 -> 9401
    //   9444: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9447: ldc2_w -221618114
    //   9450: l2i
    //   9451: ldc_w -221618113
    //   9454: ixor
    //   9455: getstatic Perryc.0 : I
    //   9458: ifle -> 9472
    //   9461: ldc2_w 2132534557
    //   9464: l2i
    //   9465: ldc_w 1440518574
    //   9468: ixor
    //   9469: goto -> 9480
    //   9472: ldc2_w 1316238313
    //   9475: l2i
    //   9476: ldc_w -572758510
    //   9479: ixor
    //   9480: ldc2_w 279424957
    //   9483: l2i
    //   9484: ldc_w 395449726
    //   9487: ixor
    //   9488: ixor
    //   9489: lookupswitch default -> 9516, 770887280 -> 14640, 820587816 -> 9472
    //   9516: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9519: getstatic Perryc.0 : I
    //   9522: ifle -> 9536
    //   9525: ldc2_w -1027215342
    //   9528: l2i
    //   9529: ldc_w 721764159
    //   9532: ixor
    //   9533: goto -> 9544
    //   9536: ldc2_w -1636519990
    //   9539: l2i
    //   9540: ldc_w 466452658
    //   9543: ixor
    //   9544: ldc2_w -245658930
    //   9547: l2i
    //   9548: ldc_w -6989436
    //   9551: ixor
    //   9552: ixor
    //   9553: lookupswitch default -> 15040, -1955070926 -> 9580, -418505625 -> 9536
    //   9580: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   9583: getstatic Perryc.0 : I
    //   9586: ifle -> 9600
    //   9589: ldc2_w 1849260861
    //   9592: l2i
    //   9593: ldc_w -1945693631
    //   9596: ixor
    //   9597: goto -> 9608
    //   9600: ldc2_w -267844181
    //   9603: l2i
    //   9604: ldc_w 1743379850
    //   9607: ixor
    //   9608: ldc2_w -685717883
    //   9611: l2i
    //   9612: ldc_w 1881222357
    //   9615: ixor
    //   9616: ixor
    //   9617: lookupswitch default -> 9644, -119479497 -> 9600, 1161790252 -> 15008
    //   9644: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9647: getstatic Perryc.1 : I
    //   9650: ifeq -> 9664
    //   9653: ldc2_w 1843365542
    //   9656: l2i
    //   9657: ldc_w 1766036893
    //   9660: ixor
    //   9661: goto -> 9672
    //   9664: ldc2_w 8517352
    //   9667: l2i
    //   9668: ldc_w -1244962689
    //   9671: ixor
    //   9672: ldc2_w 270361184
    //   9675: l2i
    //   9676: ldc_w 955900996
    //   9679: ixor
    //   9680: ixor
    //   9681: lookupswitch default -> 9708, 746099999 -> 14980, 1594645959 -> 9664
    //   9708: putfield crystals : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9711: getstatic Perryc.1 : I
    //   9714: ifeq -> 9728
    //   9717: ldc2_w -1340049551
    //   9720: l2i
    //   9721: ldc_w -1725798742
    //   9724: ixor
    //   9725: goto -> 9736
    //   9728: ldc2_w -1709162293
    //   9731: l2i
    //   9732: ldc_w -1347679091
    //   9735: ixor
    //   9736: ldc2_w 2103012703
    //   9739: l2i
    //   9740: ldc_w -1793634498
    //   9743: ixor
    //   9744: ixor
    //   9745: lookupswitch default -> 9772, -1051970630 -> 15014, 445893043 -> 9728
    //   9772: aload_0
    //   9773: getstatic Perryc.c : I
    //   9776: iflt -> 9790
    //   9779: ldc2_w -423317157
    //   9782: l2i
    //   9783: ldc_w 1153052395
    //   9786: ixor
    //   9787: goto -> 9798
    //   9790: ldc2_w -1573286611
    //   9793: l2i
    //   9794: ldc_w 2094838856
    //   9797: ixor
    //   9798: ldc2_w -1545870468
    //   9801: l2i
    //   9802: ldc_w -772943668
    //   9805: ixor
    //   9806: ixor
    //   9807: lookupswitch default -> 9832, -800543744 -> 14642, 32129790 -> 9790
    //   9832: aload_0
    //   9833: new bigname/zprestige/webhack/features/setting/Setting
    //   9836: dup
    //   9837: ldc_w '겵㌁곥㶤ᨁ䈫๵턃'
    //   9840: getstatic Perryc.c : I
    //   9843: iflt -> 9857
    //   9846: ldc2_w 1187420945
    //   9849: l2i
    //   9850: ldc_w 671620578
    //   9853: ixor
    //   9854: goto -> 9865
    //   9857: ldc2_w -619664048
    //   9860: l2i
    //   9861: ldc_w -12223784
    //   9864: ixor
    //   9865: ldc2_w -1040005792
    //   9868: l2i
    //   9869: ldc_w -1540525436
    //   9872: ixor
    //   9873: ixor
    //   9874: lookupswitch default -> 14900, 148975895 -> 9857, 1115316332 -> 9900
    //   9900: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9903: ldc2_w 1730664761
    //   9906: l2i
    //   9907: ldc_w 1730664761
    //   9910: ixor
    //   9911: getstatic Perryc.0 : I
    //   9914: ifle -> 9928
    //   9917: ldc2_w -632494518
    //   9920: l2i
    //   9921: ldc_w -770988508
    //   9924: ixor
    //   9925: goto -> 9936
    //   9928: ldc2_w 513908566
    //   9931: l2i
    //   9932: ldc_w 180356725
    //   9935: ixor
    //   9936: ldc2_w -386726418
    //   9939: l2i
    //   9940: ldc_w 930510202
    //   9943: ixor
    //   9944: ixor
    //   9945: lookupswitch default -> 9972, -675139334 -> 14828, 880974005 -> 9928
    //   9972: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9975: ldc2_w 2017583168
    //   9978: l2i
    //   9979: ldc_w 2017583168
    //   9982: ixor
    //   9983: getstatic Perryc.0 : I
    //   9986: ifle -> 10000
    //   9989: ldc2_w -504136516
    //   9992: l2i
    //   9993: ldc_w 1309480194
    //   9996: ixor
    //   9997: goto -> 10008
    //   10000: ldc2_w 1847187654
    //   10003: l2i
    //   10004: ldc_w 954743115
    //   10007: ixor
    //   10008: ldc2_w -26109972
    //   10011: l2i
    //   10012: ldc_w -1478816850
    //   10015: ixor
    //   10016: ixor
    //   10017: lookupswitch default -> 14972, -162204164 -> 10000, 257654223 -> 10044
    //   10044: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10047: ldc2_w 1763161419
    //   10050: l2i
    //   10051: ldc_w 1763161807
    //   10054: ixor
    //   10055: getstatic Perryc.0 : I
    //   10058: ifle -> 10072
    //   10061: ldc2_w -1315750606
    //   10064: l2i
    //   10065: ldc_w 337567804
    //   10068: ixor
    //   10069: goto -> 10080
    //   10072: ldc2_w -1415968059
    //   10075: l2i
    //   10076: ldc_w 83006005
    //   10079: ixor
    //   10080: ldc2_w -1271958823
    //   10083: l2i
    //   10084: ldc_w -1673936647
    //   10087: ixor
    //   10088: ixor
    //   10089: lookupswitch default -> 14940, -2021774640 -> 10116, -1919193298 -> 10072
    //   10116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10119: getstatic Perryc.0 : I
    //   10122: ifle -> 10136
    //   10125: ldc2_w -597011589
    //   10128: l2i
    //   10129: ldc_w 286575718
    //   10132: ixor
    //   10133: goto -> 10144
    //   10136: ldc2_w -1195091328
    //   10139: l2i
    //   10140: ldc_w -1681817045
    //   10143: ixor
    //   10144: ldc2_w -1303268064
    //   10147: l2i
    //   10148: ldc_w -316520465
    //   10151: ixor
    //   10152: ixor
    //   10153: lookupswitch default -> 14674, -1844613678 -> 10136, 2088118884 -> 10180
    //   10180: aload_0
    //   10181: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   10186: getstatic Perryc.0 : I
    //   10189: ifle -> 10203
    //   10192: ldc2_w -1222924572
    //   10195: l2i
    //   10196: ldc_w 1192154262
    //   10199: ixor
    //   10200: goto -> 10211
    //   10203: ldc2_w -1569818206
    //   10206: l2i
    //   10207: ldc_w 1121906425
    //   10210: ixor
    //   10211: ldc2_w 1981092230
    //   10214: l2i
    //   10215: ldc_w -1064259659
    //   10218: ixor
    //   10219: ixor
    //   10220: lookupswitch default -> 10248, 1183894593 -> 15058, 1680690482 -> 10203
    //   10248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10251: getstatic Perryc.0 : I
    //   10254: ifle -> 10268
    //   10257: ldc2_w -1489185804
    //   10260: l2i
    //   10261: ldc_w -958548350
    //   10264: ixor
    //   10265: goto -> 10276
    //   10268: ldc2_w 626900984
    //   10271: l2i
    //   10272: ldc_w 113794341
    //   10275: ixor
    //   10276: ldc2_w -1298040967
    //   10279: l2i
    //   10280: ldc_w -2075877255
    //   10283: ixor
    //   10284: ixor
    //   10285: lookupswitch default -> 10312, 333660373 -> 10268, 1459925622 -> 15062
    //   10312: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10315: getstatic Perryc.1 : I
    //   10318: ifeq -> 10332
    //   10321: ldc2_w -1165564553
    //   10324: l2i
    //   10325: ldc_w 59681848
    //   10328: ixor
    //   10329: goto -> 10340
    //   10332: ldc2_w 1054225254
    //   10335: l2i
    //   10336: ldc_w -1824232593
    //   10339: ixor
    //   10340: ldc2_w 615725756
    //   10343: l2i
    //   10344: ldc_w 1559200908
    //   10347: ixor
    //   10348: ixor
    //   10349: lookupswitch default -> 10376, -1051396225 -> 14780, -464512968 -> 10332
    //   10376: putfield crystalX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10379: getstatic Perryc.1 : I
    //   10382: ifeq -> 10396
    //   10385: ldc2_w -569255056
    //   10388: l2i
    //   10389: ldc_w -1065385558
    //   10392: ixor
    //   10393: goto -> 10404
    //   10396: ldc2_w 1947620321
    //   10399: l2i
    //   10400: ldc_w 1367898869
    //   10403: ixor
    //   10404: ldc2_w -1584846758
    //   10407: l2i
    //   10408: ldc_w 1456526015
    //   10411: ixor
    //   10412: ixor
    //   10413: lookupswitch default -> 15026, -758656015 -> 10440, -382230465 -> 10396
    //   10440: aload_0
    //   10441: getstatic Perryc.1 : I
    //   10444: ifeq -> 10458
    //   10447: ldc2_w -1718665455
    //   10450: l2i
    //   10451: ldc_w -761518946
    //   10454: ixor
    //   10455: goto -> 10466
    //   10458: ldc2_w -959703848
    //   10461: l2i
    //   10462: ldc_w 1336973944
    //   10465: ixor
    //   10466: ldc2_w 2050980367
    //   10469: l2i
    //   10470: ldc_w -1203907491
    //   10473: ixor
    //   10474: ixor
    //   10475: lookupswitch default -> 10500, -1995328035 -> 14860, 636820582 -> 10458
    //   10500: aload_0
    //   10501: new bigname/zprestige/webhack/features/setting/Setting
    //   10504: dup
    //   10505: ldc_w '겵㌁곥㶤ᨁ䈫๵턂'
    //   10508: getstatic Perryc.0 : I
    //   10511: ifle -> 10525
    //   10514: ldc2_w -2008703087
    //   10517: l2i
    //   10518: ldc_w 74423198
    //   10521: ixor
    //   10522: goto -> 10533
    //   10525: ldc2_w -1039312058
    //   10528: l2i
    //   10529: ldc_w 1489509904
    //   10532: ixor
    //   10533: ldc2_w -685158356
    //   10536: l2i
    //   10537: ldc_w -2019206495
    //   10540: ixor
    //   10541: ixor
    //   10542: lookupswitch default -> 10568, -593097086 -> 15068, -381593090 -> 10525
    //   10568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10571: ldc2_w -1487206613
    //   10574: l2i
    //   10575: ldc_w -1487206633
    //   10578: ixor
    //   10579: getstatic Perryc.c : I
    //   10582: iflt -> 10596
    //   10585: ldc2_w -634089905
    //   10588: l2i
    //   10589: ldc_w 1248694993
    //   10592: ixor
    //   10593: goto -> 10604
    //   10596: ldc2_w -1112116614
    //   10599: l2i
    //   10600: ldc_w 1152156965
    //   10603: ixor
    //   10604: ldc2_w -734974425
    //   10607: l2i
    //   10608: ldc_w -1513963237
    //   10611: ixor
    //   10612: ixor
    //   10613: lookupswitch default -> 14826, -1997989789 -> 10640, -508890206 -> 10596
    //   10640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10643: ldc2_w 2014521891
    //   10646: l2i
    //   10647: ldc_w 2014521891
    //   10650: ixor
    //   10651: getstatic Perryc.1 : I
    //   10654: ifeq -> 10668
    //   10657: ldc2_w -2136151144
    //   10660: l2i
    //   10661: ldc_w -1519868643
    //   10664: ixor
    //   10665: goto -> 10676
    //   10668: ldc2_w -1979950584
    //   10671: l2i
    //   10672: ldc_w -1103389357
    //   10675: ixor
    //   10676: ldc2_w -1333717985
    //   10679: l2i
    //   10680: ldc_w 1938431408
    //   10683: ixor
    //   10684: ixor
    //   10685: lookupswitch default -> 10712, -422623446 -> 14960, 1928517099 -> 10668
    //   10712: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10715: ldc2_w 561420568
    //   10718: l2i
    //   10719: ldc_w 561421066
    //   10722: ixor
    //   10723: getstatic Perryc.c : I
    //   10726: iflt -> 10740
    //   10729: ldc2_w -1732107208
    //   10732: l2i
    //   10733: ldc_w -119821493
    //   10736: ixor
    //   10737: goto -> 10748
    //   10740: ldc2_w 1772958304
    //   10743: l2i
    //   10744: ldc_w -1795878039
    //   10747: ixor
    //   10748: ldc2_w -1969639768
    //   10751: l2i
    //   10752: ldc_w 1365038383
    //   10755: ixor
    //   10756: ixor
    //   10757: lookupswitch default -> 14720, -1143147276 -> 10740, 647846542 -> 10784
    //   10784: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10787: getstatic Perryc.0 : I
    //   10790: ifle -> 10804
    //   10793: ldc2_w -1591802467
    //   10796: l2i
    //   10797: ldc_w -1886440428
    //   10800: ixor
    //   10801: goto -> 10812
    //   10804: ldc2_w -525289354
    //   10807: l2i
    //   10808: ldc_w 1761881050
    //   10811: ixor
    //   10812: ldc2_w -406147408
    //   10815: l2i
    //   10816: ldc_w 1362861051
    //   10819: ixor
    //   10820: ixor
    //   10821: lookupswitch default -> 10848, -1738472254 -> 14758, 1517769713 -> 10804
    //   10848: aload_0
    //   10849: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   10854: getstatic Perryc.1 : I
    //   10857: ifeq -> 10871
    //   10860: ldc2_w 1501205135
    //   10863: l2i
    //   10864: ldc_w 1739415975
    //   10867: ixor
    //   10868: goto -> 10879
    //   10871: ldc2_w -1078188735
    //   10874: l2i
    //   10875: ldc_w 1857146523
    //   10878: ixor
    //   10879: ldc2_w -616315260
    //   10882: l2i
    //   10883: ldc_w -1179037773
    //   10886: ixor
    //   10887: ixor
    //   10888: lookupswitch default -> 10916, -832448176 -> 10871, 1546484255 -> 14678
    //   10916: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10919: getstatic Perryc.0 : I
    //   10922: ifle -> 10936
    //   10925: ldc2_w 1032161130
    //   10928: l2i
    //   10929: ldc_w -353738471
    //   10932: ixor
    //   10933: goto -> 10944
    //   10936: ldc2_w 1053048296
    //   10939: l2i
    //   10940: ldc_w -923805828
    //   10943: ixor
    //   10944: ldc2_w -1469395853
    //   10947: l2i
    //   10948: ldc_w 1201835318
    //   10951: ixor
    //   10952: ixor
    //   10953: lookupswitch default -> 14902, 434351057 -> 10980, 950511414 -> 10936
    //   10980: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10983: getstatic Perryc.c : I
    //   10986: iflt -> 11000
    //   10989: ldc2_w 43402513
    //   10992: l2i
    //   10993: ldc_w 1467164287
    //   10996: ixor
    //   10997: goto -> 11008
    //   11000: ldc2_w 2021594051
    //   11003: l2i
    //   11004: ldc_w -1719743770
    //   11007: ixor
    //   11008: ldc2_w 1894776039
    //   11011: l2i
    //   11012: ldc_w 294575429
    //   11015: ixor
    //   11016: ixor
    //   11017: lookupswitch default -> 14654, -2141128569 -> 11044, 881083084 -> 11000
    //   11044: putfield crystalY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11047: getstatic Perryc.c : I
    //   11050: iflt -> 11064
    //   11053: ldc2_w -1834663447
    //   11056: l2i
    //   11057: ldc_w -1784960496
    //   11060: ixor
    //   11061: goto -> 11072
    //   11064: ldc2_w -640954289
    //   11067: l2i
    //   11068: ldc_w -2138927639
    //   11071: ixor
    //   11072: ldc2_w 789484035
    //   11075: l2i
    //   11076: ldc_w 1130560450
    //   11079: ixor
    //   11080: ixor
    //   11081: lookupswitch default -> 14718, 891630695 -> 11108, 1800569400 -> 11064
    //   11108: aload_0
    //   11109: getstatic Perryc.0 : I
    //   11112: ifle -> 11126
    //   11115: ldc2_w -1181201359
    //   11118: l2i
    //   11119: ldc_w 613811477
    //   11122: ixor
    //   11123: goto -> 11134
    //   11126: ldc2_w -1298920040
    //   11129: l2i
    //   11130: ldc_w 807167488
    //   11133: ixor
    //   11134: ldc2_w -834326831
    //   11137: l2i
    //   11138: ldc_w -1340485834
    //   11141: ixor
    //   11142: ixor
    //   11143: lookupswitch default -> 15032, -481122109 -> 11126, -53179777 -> 11168
    //   11168: aload_0
    //   11169: new bigname/zprestige/webhack/features/setting/Setting
    //   11172: dup
    //   11173: ldc_w '겳㌋곬'
    //   11176: getstatic Perryc.0 : I
    //   11179: ifle -> 11193
    //   11182: ldc2_w -1443089206
    //   11185: l2i
    //   11186: ldc_w -1186588196
    //   11189: ixor
    //   11190: goto -> 11201
    //   11193: ldc2_w -1311498480
    //   11196: l2i
    //   11197: ldc_w 1047513342
    //   11200: ixor
    //   11201: ldc2_w 1819776160
    //   11204: l2i
    //   11205: ldc_w -885730904
    //   11208: ixor
    //   11209: ixor
    //   11210: lookupswitch default -> 11236, -1359475770 -> 11193, -1208391650 -> 15036
    //   11236: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11239: ldc2_w 1293293196
    //   11242: l2i
    //   11243: ldc_w 1293293197
    //   11246: ixor
    //   11247: getstatic Perryc.0 : I
    //   11250: ifle -> 11264
    //   11253: ldc2_w -846412603
    //   11256: l2i
    //   11257: ldc_w -1885303408
    //   11260: ixor
    //   11261: goto -> 11272
    //   11264: ldc2_w 571920502
    //   11267: l2i
    //   11268: ldc_w -2023174976
    //   11271: ixor
    //   11272: ldc2_w -781902512
    //   11275: l2i
    //   11276: ldc_w -1848332786
    //   11279: ixor
    //   11280: ixor
    //   11281: lookupswitch default -> 14830, -439373848 -> 11308, 43907595 -> 11264
    //   11308: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11311: getstatic Perryc.0 : I
    //   11314: ifle -> 11328
    //   11317: ldc2_w -1041216114
    //   11320: l2i
    //   11321: ldc_w 1924898864
    //   11324: ixor
    //   11325: goto -> 11336
    //   11328: ldc2_w -316833373
    //   11331: l2i
    //   11332: ldc_w 2051871357
    //   11335: ixor
    //   11336: ldc2_w -1125359285
    //   11339: l2i
    //   11340: ldc_w -864412831
    //   11343: ixor
    //   11344: ixor
    //   11345: lookupswitch default -> 14748, -1008887916 -> 11328, -406394380 -> 11372
    //   11372: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   11375: getstatic Perryc.0 : I
    //   11378: ifle -> 11392
    //   11381: ldc2_w -2100244331
    //   11384: l2i
    //   11385: ldc_w 5647991
    //   11388: ixor
    //   11389: goto -> 11400
    //   11392: ldc2_w -1505491897
    //   11395: l2i
    //   11396: ldc_w -752342833
    //   11399: ixor
    //   11400: ldc2_w 1355361488
    //   11403: l2i
    //   11404: ldc_w -1668149499
    //   11407: ixor
    //   11408: ixor
    //   11409: lookupswitch default -> 11436, -1471258363 -> 11392, 1323162935 -> 14840
    //   11436: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11439: getstatic Perryc.c : I
    //   11442: iflt -> 11456
    //   11445: ldc2_w -1998111968
    //   11448: l2i
    //   11449: ldc_w 474404956
    //   11452: ixor
    //   11453: goto -> 11464
    //   11456: ldc2_w -1389315824
    //   11459: l2i
    //   11460: ldc_w 2136912912
    //   11463: ixor
    //   11464: ldc2_w 1510113231
    //   11467: l2i
    //   11468: ldc_w -1049774122
    //   11471: ixor
    //   11472: ixor
    //   11473: lookupswitch default -> 15012, 265169765 -> 11456, 1224852761 -> 11500
    //   11500: putfield exp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11503: getstatic Perryc.c : I
    //   11506: iflt -> 11520
    //   11509: ldc2_w -837085061
    //   11512: l2i
    //   11513: ldc_w -965507704
    //   11516: ixor
    //   11517: goto -> 11528
    //   11520: ldc2_w -363846202
    //   11523: l2i
    //   11524: ldc_w 1549688821
    //   11527: ixor
    //   11528: ldc2_w 1830124847
    //   11531: l2i
    //   11532: ldc_w -1337488049
    //   11535: ixor
    //   11536: ixor
    //   11537: lookupswitch default -> 11564, -717591149 -> 14824, 1700451119 -> 11520
    //   11564: aload_0
    //   11565: getstatic Perryc.1 : I
    //   11568: ifeq -> 11582
    //   11571: ldc2_w -1028965645
    //   11574: l2i
    //   11575: ldc_w -1742432899
    //   11578: ixor
    //   11579: goto -> 11590
    //   11582: ldc2_w -90475385
    //   11585: l2i
    //   11586: ldc_w 1395870233
    //   11589: ixor
    //   11590: ldc2_w 367778201
    //   11593: l2i
    //   11594: ldc_w 1839027277
    //   11597: ixor
    //   11598: ixor
    //   11599: lookupswitch default -> 14668, -773934262 -> 11624, 586752602 -> 11582
    //   11624: aload_0
    //   11625: new bigname/zprestige/webhack/features/setting/Setting
    //   11628: dup
    //   11629: ldc_w '겳㌋곬㶏'
    //   11632: getstatic Perryc.c : I
    //   11635: iflt -> 11649
    //   11638: ldc2_w -1280664191
    //   11641: l2i
    //   11642: ldc_w 905915745
    //   11645: ixor
    //   11646: goto -> 11657
    //   11649: ldc2_w 783143366
    //   11652: l2i
    //   11653: ldc_w 1526243853
    //   11656: ixor
    //   11657: ldc2_w 770551081
    //   11660: l2i
    //   11661: ldc_w -1577675808
    //   11664: ixor
    //   11665: ixor
    //   11666: lookupswitch default -> 11692, -469801733 -> 11649, 172920361 -> 15018
    //   11692: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11695: ldc2_w -1823901583
    //   11698: l2i
    //   11699: ldc_w -1823901583
    //   11702: ixor
    //   11703: getstatic Perryc.c : I
    //   11706: iflt -> 11720
    //   11709: ldc2_w -487419388
    //   11712: l2i
    //   11713: ldc_w 843668243
    //   11716: ixor
    //   11717: goto -> 11728
    //   11720: ldc2_w -1495583688
    //   11723: l2i
    //   11724: ldc_w 821749151
    //   11727: ixor
    //   11728: ldc2_w 440256263
    //   11731: l2i
    //   11732: ldc_w 459303428
    //   11735: ixor
    //   11736: ixor
    //   11737: lookupswitch default -> 11764, -773430252 -> 14850, 1372446999 -> 11720
    //   11764: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11767: ldc2_w -2058880986
    //   11770: l2i
    //   11771: ldc_w -2058880986
    //   11774: ixor
    //   11775: getstatic Perryc.c : I
    //   11778: iflt -> 11792
    //   11781: ldc2_w 1263965816
    //   11784: l2i
    //   11785: ldc_w 1877017125
    //   11788: ixor
    //   11789: goto -> 11800
    //   11792: ldc2_w -2061979120
    //   11795: l2i
    //   11796: ldc_w 423443830
    //   11799: ixor
    //   11800: ldc2_w 270830615
    //   11803: l2i
    //   11804: ldc_w 1017639136
    //   11807: ixor
    //   11808: ixor
    //   11809: lookupswitch default -> 15050, -1331235951 -> 11836, 137685162 -> 11792
    //   11836: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11839: ldc2_w -930503203
    //   11842: l2i
    //   11843: ldc_w -930503079
    //   11846: ixor
    //   11847: getstatic Perryc.0 : I
    //   11850: ifle -> 11864
    //   11853: ldc2_w 910496838
    //   11856: l2i
    //   11857: ldc_w 1648572504
    //   11860: ixor
    //   11861: goto -> 11872
    //   11864: ldc2_w -928441938
    //   11867: l2i
    //   11868: ldc_w 1662658237
    //   11871: ixor
    //   11872: ldc2_w -869656905
    //   11875: l2i
    //   11876: ldc_w 81890195
    //   11879: ixor
    //   11880: ixor
    //   11881: lookupswitch default -> 11908, -1777030008 -> 11864, -1664241350 -> 14930
    //   11908: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11911: getstatic Perryc.1 : I
    //   11914: ifeq -> 11928
    //   11917: ldc2_w 751600140
    //   11920: l2i
    //   11921: ldc_w -1495430252
    //   11924: ixor
    //   11925: goto -> 11936
    //   11928: ldc2_w 2085239078
    //   11931: l2i
    //   11932: ldc_w 636811320
    //   11935: ixor
    //   11936: ldc2_w -1778782485
    //   11939: l2i
    //   11940: ldc_w -1048366543
    //   11943: ixor
    //   11944: ixor
    //   11945: lookupswitch default -> 11972, -1728692913 -> 11928, -563358398 -> 14858
    //   11972: aload_0
    //   11973: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   11978: getstatic Perryc.1 : I
    //   11981: ifeq -> 11995
    //   11984: ldc2_w -1746526794
    //   11987: l2i
    //   11988: ldc_w 1748443962
    //   11991: ixor
    //   11992: goto -> 12003
    //   11995: ldc2_w 1342188512
    //   11998: l2i
    //   11999: ldc_w -2020436186
    //   12002: ixor
    //   12003: ldc2_w 374620232
    //   12006: l2i
    //   12007: ldc_w 2057977375
    //   12010: ixor
    //   12011: ixor
    //   12012: lookupswitch default -> 12040, -1825619749 -> 14888, -1066538089 -> 11995
    //   12040: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12043: getstatic Perryc.1 : I
    //   12046: ifeq -> 12060
    //   12049: ldc2_w -1866675325
    //   12052: l2i
    //   12053: ldc_w -1082899065
    //   12056: ixor
    //   12057: goto -> 12068
    //   12060: ldc2_w -1441920713
    //   12063: l2i
    //   12064: ldc_w -386014827
    //   12067: ixor
    //   12068: ldc2_w -570234236
    //   12071: l2i
    //   12072: ldc_w 1588148709
    //   12075: ixor
    //   12076: ixor
    //   12077: lookupswitch default -> 14912, -1352442523 -> 12060, -1034404925 -> 12104
    //   12104: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12107: getstatic Perryc.c : I
    //   12110: iflt -> 12124
    //   12113: ldc2_w -807248503
    //   12116: l2i
    //   12117: ldc_w -1562004768
    //   12120: ixor
    //   12121: goto -> 12132
    //   12124: ldc2_w 1977110084
    //   12127: l2i
    //   12128: ldc_w 525201301
    //   12131: ixor
    //   12132: ldc2_w 1243843092
    //   12135: l2i
    //   12136: ldc_w 451614876
    //   12139: ixor
    //   12140: ixor
    //   12141: lookupswitch default -> 12168, 537549539 -> 12124, 1037008353 -> 14844
    //   12168: putfield expX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12171: getstatic Perryc.c : I
    //   12174: iflt -> 12188
    //   12177: ldc2_w 650074340
    //   12180: l2i
    //   12181: ldc_w -768320899
    //   12184: ixor
    //   12185: goto -> 12196
    //   12188: ldc2_w -1041553290
    //   12191: l2i
    //   12192: ldc_w 1485054029
    //   12195: ixor
    //   12196: ldc2_w -841006680
    //   12199: l2i
    //   12200: ldc_w 759648960
    //   12203: ixor
    //   12204: ixor
    //   12205: lookupswitch default -> 14820, 336794097 -> 12188, 2046237523 -> 12232
    //   12232: aload_0
    //   12233: getstatic Perryc.c : I
    //   12236: iflt -> 12250
    //   12239: ldc2_w -662632758
    //   12242: l2i
    //   12243: ldc_w -676552543
    //   12246: ixor
    //   12247: goto -> 12258
    //   12250: ldc2_w -231697984
    //   12253: l2i
    //   12254: ldc_w 1820556663
    //   12257: ixor
    //   12258: ldc2_w 800246562
    //   12261: l2i
    //   12262: ldc_w -919588130
    //   12265: ixor
    //   12266: ixor
    //   12267: lookupswitch default -> 12292, -374382697 -> 14906, 965914615 -> 12250
    //   12292: aload_0
    //   12293: new bigname/zprestige/webhack/features/setting/Setting
    //   12296: dup
    //   12297: ldc_w '겳㌋곬㶎'
    //   12300: getstatic Perryc.1 : I
    //   12303: ifeq -> 12317
    //   12306: ldc2_w 143732401
    //   12309: l2i
    //   12310: ldc_w -646483611
    //   12313: ixor
    //   12314: goto -> 12325
    //   12317: ldc2_w -146571060
    //   12320: l2i
    //   12321: ldc_w -1660451060
    //   12324: ixor
    //   12325: ldc2_w -77846999
    //   12328: l2i
    //   12329: ldc_w -970690131
    //   12332: ixor
    //   12333: ixor
    //   12334: lookupswitch default -> 14982, -325187504 -> 12317, 1463570500 -> 12360
    //   12360: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12363: ldc2_w 1400576126
    //   12366: l2i
    //   12367: ldc_w 1400576056
    //   12370: ixor
    //   12371: getstatic Perryc.c : I
    //   12374: iflt -> 12388
    //   12377: ldc2_w 787094777
    //   12380: l2i
    //   12381: ldc_w -1667976783
    //   12384: ixor
    //   12385: goto -> 12396
    //   12388: ldc2_w -1936948802
    //   12391: l2i
    //   12392: ldc_w 1156861212
    //   12395: ixor
    //   12396: ldc2_w 2131687067
    //   12399: l2i
    //   12400: ldc_w -367943888
    //   12403: ixor
    //   12404: ixor
    //   12405: lookupswitch default -> 14738, 660718819 -> 12388, 1567073545 -> 12432
    //   12432: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12435: ldc2_w -1783282261
    //   12438: l2i
    //   12439: ldc_w -1783282261
    //   12442: ixor
    //   12443: getstatic Perryc.c : I
    //   12446: iflt -> 12460
    //   12449: ldc2_w 422569112
    //   12452: l2i
    //   12453: ldc_w 102923633
    //   12456: ixor
    //   12457: goto -> 12468
    //   12460: ldc2_w -1857480856
    //   12463: l2i
    //   12464: ldc_w 77906236
    //   12467: ixor
    //   12468: ldc2_w -726725883
    //   12471: l2i
    //   12472: ldc_w 2081886160
    //   12475: ixor
    //   12476: ixor
    //   12477: lookupswitch default -> 12504, -1212834500 -> 14696, -805520900 -> 12460
    //   12504: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12507: ldc2_w -1340638556
    //   12510: l2i
    //   12511: ldc_w -1340639050
    //   12514: ixor
    //   12515: getstatic Perryc.0 : I
    //   12518: ifle -> 12532
    //   12521: ldc2_w -1581217404
    //   12524: l2i
    //   12525: ldc_w 682709774
    //   12528: ixor
    //   12529: goto -> 12540
    //   12532: ldc2_w 1796438026
    //   12535: l2i
    //   12536: ldc_w 1576555663
    //   12539: ixor
    //   12540: ldc2_w -1637543369
    //   12543: l2i
    //   12544: ldc_w 885271361
    //   12547: ixor
    //   12548: ixor
    //   12549: lookupswitch default -> 12576, 178835729 -> 12532, 600892412 -> 14786
    //   12576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12579: getstatic Perryc.c : I
    //   12582: iflt -> 12596
    //   12585: ldc2_w -1265309186
    //   12588: l2i
    //   12589: ldc_w -1176527798
    //   12592: ixor
    //   12593: goto -> 12604
    //   12596: ldc2_w -1531596616
    //   12599: l2i
    //   12600: ldc_w 1416143933
    //   12603: ixor
    //   12604: ldc2_w 902572610
    //   12607: l2i
    //   12608: ldc_w -1686209841
    //   12611: ixor
    //   12612: ixor
    //   12613: lookupswitch default -> 14872, -1543953095 -> 12596, 1584350216 -> 12640
    //   12640: aload_0
    //   12641: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   12646: getstatic Perryc.1 : I
    //   12649: ifeq -> 12663
    //   12652: ldc2_w 1641449265
    //   12655: l2i
    //   12656: ldc_w -836277985
    //   12659: ixor
    //   12660: goto -> 12671
    //   12663: ldc2_w -1029139438
    //   12666: l2i
    //   12667: ldc_w 520179181
    //   12670: ixor
    //   12671: ldc2_w 247773798
    //   12674: l2i
    //   12675: ldc_w -1594888460
    //   12678: ixor
    //   12679: ixor
    //   12680: lookupswitch default -> 14656, 31111868 -> 12663, 1937935725 -> 12708
    //   12708: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12711: getstatic Perryc.1 : I
    //   12714: ifeq -> 12728
    //   12717: ldc2_w -392188277
    //   12720: l2i
    //   12721: ldc_w -100957979
    //   12724: ixor
    //   12725: goto -> 12736
    //   12728: ldc2_w -689477444
    //   12731: l2i
    //   12732: ldc_w -149938226
    //   12735: ixor
    //   12736: ldc2_w 1934526771
    //   12739: l2i
    //   12740: ldc_w 1512328261
    //   12743: ixor
    //   12744: ixor
    //   12745: lookupswitch default -> 12772, -1119401054 -> 12728, 940501784 -> 14848
    //   12772: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12775: getstatic Perryc.c : I
    //   12778: iflt -> 12792
    //   12781: ldc2_w -239021871
    //   12784: l2i
    //   12785: ldc_w -1078317199
    //   12788: ixor
    //   12789: goto -> 12800
    //   12792: ldc2_w 925195484
    //   12795: l2i
    //   12796: ldc_w 1646345017
    //   12799: ixor
    //   12800: ldc2_w -2073078154
    //   12803: l2i
    //   12804: ldc_w -969488427
    //   12807: ixor
    //   12808: ixor
    //   12809: lookupswitch default -> 12836, -216310057 -> 12792, 203648515 -> 14714
    //   12836: putfield expY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12839: getstatic Perryc.c : I
    //   12842: iflt -> 12856
    //   12845: ldc2_w 478380847
    //   12848: l2i
    //   12849: ldc_w -1561930057
    //   12852: ixor
    //   12853: goto -> 12864
    //   12856: ldc2_w 869190680
    //   12859: l2i
    //   12860: ldc_w 94627330
    //   12863: ixor
    //   12864: ldc2_w -1999935262
    //   12867: l2i
    //   12868: ldc_w 1763720168
    //   12871: ixor
    //   12872: ixor
    //   12873: lookupswitch default -> 14896, -679053040 -> 12900, 1603143314 -> 12856
    //   12900: aload_0
    //   12901: getstatic Perryc.1 : I
    //   12904: ifeq -> 12918
    //   12907: ldc2_w 1252633269
    //   12910: l2i
    //   12911: ldc_w 953958087
    //   12914: ixor
    //   12915: goto -> 12926
    //   12918: ldc2_w -1096651031
    //   12921: l2i
    //   12922: ldc_w 1250161062
    //   12925: ixor
    //   12926: ldc2_w -2006042473
    //   12929: l2i
    //   12930: ldc_w 674196869
    //   12933: ixor
    //   12934: ixor
    //   12935: lookupswitch default -> 14918, -768294560 -> 12918, 1415629405 -> 12960
    //   12960: aload_0
    //   12961: new bigname/zprestige/webhack/features/setting/Setting
    //   12964: dup
    //   12965: ldc_w '겱㌒곬㶧ᨙ䈯๪'
    //   12968: getstatic Perryc.1 : I
    //   12971: ifeq -> 12985
    //   12974: ldc2_w -701421139
    //   12977: l2i
    //   12978: ldc_w -1079157167
    //   12981: ixor
    //   12982: goto -> 12993
    //   12985: ldc2_w 1670381643
    //   12988: l2i
    //   12989: ldc_w -1734862134
    //   12992: ixor
    //   12993: ldc2_w 1662858802
    //   12996: l2i
    //   12997: ldc_w 835852419
    //   13000: ixor
    //   13001: ixor
    //   13002: lookupswitch default -> 13028, -1025444693 -> 12985, 995318093 -> 14876
    //   13028: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13031: ldc2_w 1254448653
    //   13034: l2i
    //   13035: ldc_w 1254448652
    //   13038: ixor
    //   13039: getstatic Perryc.0 : I
    //   13042: ifle -> 13056
    //   13045: ldc2_w 1019983239
    //   13048: l2i
    //   13049: ldc_w -1507963149
    //   13052: ixor
    //   13053: goto -> 13064
    //   13056: ldc2_w -1822600058
    //   13059: l2i
    //   13060: ldc_w 838714579
    //   13063: ixor
    //   13064: ldc2_w -2047145781
    //   13067: l2i
    //   13068: ldc_w 1721805480
    //   13071: ixor
    //   13072: ixor
    //   13073: lookupswitch default -> 13100, -127607251 -> 13056, 2039372055 -> 14990
    //   13100: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   13103: getstatic Perryc.1 : I
    //   13106: ifeq -> 13120
    //   13109: ldc2_w 1386731075
    //   13112: l2i
    //   13113: ldc_w 620641866
    //   13116: ixor
    //   13117: goto -> 13128
    //   13120: ldc2_w 763201518
    //   13123: l2i
    //   13124: ldc_w 2143837872
    //   13127: ixor
    //   13128: ldc2_w -240162783
    //   13131: l2i
    //   13132: ldc_w 297772947
    //   13135: ixor
    //   13136: ixor
    //   13137: lookupswitch default -> 13164, -1773590597 -> 14644, -62949547 -> 13120
    //   13164: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   13167: getstatic Perryc.c : I
    //   13170: iflt -> 13184
    //   13173: ldc2_w 1457443261
    //   13176: l2i
    //   13177: ldc_w 1790707217
    //   13180: ixor
    //   13181: goto -> 13192
    //   13184: ldc2_w 307017920
    //   13187: l2i
    //   13188: ldc_w -1348634186
    //   13191: ixor
    //   13192: ldc2_w 1055480169
    //   13195: l2i
    //   13196: ldc_w -1924776813
    //   13199: ixor
    //   13200: ixor
    //   13201: lookupswitch default -> 13228, -1882344874 -> 15052, 175591182 -> 13184
    //   13228: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13231: getstatic Perryc.1 : I
    //   13234: ifeq -> 13248
    //   13237: ldc2_w 1750321421
    //   13240: l2i
    //   13241: ldc_w 874376765
    //   13244: ixor
    //   13245: goto -> 13256
    //   13248: ldc2_w -387879146
    //   13251: l2i
    //   13252: ldc_w -1605021290
    //   13255: ixor
    //   13256: ldc2_w -833286510
    //   13259: l2i
    //   13260: ldc_w -382703112
    //   13263: ixor
    //   13264: ixor
    //   13265: lookupswitch default -> 15070, 1875991018 -> 13292, 2066432090 -> 13248
    //   13292: putfield gapples : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13295: getstatic Perryc.c : I
    //   13298: iflt -> 13312
    //   13301: ldc2_w 975932161
    //   13304: l2i
    //   13305: ldc_w 1178053831
    //   13308: ixor
    //   13309: goto -> 13320
    //   13312: ldc2_w 1793732947
    //   13315: l2i
    //   13316: ldc_w -1253843166
    //   13319: ixor
    //   13320: ldc2_w -886170761
    //   13323: l2i
    //   13324: ldc_w 1408462213
    //   13327: ixor
    //   13328: ixor
    //   13329: lookupswitch default -> 13356, -1354747712 -> 13312, -457092812 -> 14928
    //   13356: aload_0
    //   13357: getstatic Perryc.c : I
    //   13360: iflt -> 13374
    //   13363: ldc2_w 657205432
    //   13366: l2i
    //   13367: ldc_w 1233556740
    //   13370: ixor
    //   13371: goto -> 13382
    //   13374: ldc2_w 312864758
    //   13377: l2i
    //   13378: ldc_w -1627646304
    //   13381: ixor
    //   13382: ldc2_w -278106922
    //   13385: l2i
    //   13386: ldc_w -1717374137
    //   13389: ixor
    //   13390: ixor
    //   13391: lookupswitch default -> 13416, -258698963 -> 13374, 409215533 -> 14956
    //   13416: aload_0
    //   13417: new bigname/zprestige/webhack/features/setting/Setting
    //   13420: dup
    //   13421: ldc_w '겱㌒곬㶧ᨙ䈯๪턃'
    //   13424: getstatic Perryc.1 : I
    //   13427: ifeq -> 13441
    //   13430: ldc2_w 761374703
    //   13433: l2i
    //   13434: ldc_w -1909310159
    //   13437: ixor
    //   13438: goto -> 13449
    //   13441: ldc2_w 1015349490
    //   13444: l2i
    //   13445: ldc_w -1464771875
    //   13448: ixor
    //   13449: ldc2_w 464649763
    //   13452: l2i
    //   13453: ldc_w 1562682636
    //   13456: ixor
    //   13457: ixor
    //   13458: lookupswitch default -> 13484, -439959055 -> 14788, 1562374783 -> 13441
    //   13484: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13487: ldc2_w 1062642441
    //   13490: l2i
    //   13491: ldc_w 1062642441
    //   13494: ixor
    //   13495: getstatic Perryc.1 : I
    //   13498: ifeq -> 13512
    //   13501: ldc2_w -1361537519
    //   13504: l2i
    //   13505: ldc_w -1070977455
    //   13508: ixor
    //   13509: goto -> 13520
    //   13512: ldc2_w 1736832731
    //   13515: l2i
    //   13516: ldc_w 1172043457
    //   13519: ixor
    //   13520: ldc2_w -1630396000
    //   13523: l2i
    //   13524: ldc_w -749628667
    //   13527: ixor
    //   13528: ixor
    //   13529: lookupswitch default -> 13556, -2097246093 -> 13512, 594610917 -> 14778
    //   13556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13559: ldc2_w 519555253
    //   13562: l2i
    //   13563: ldc_w 519555253
    //   13566: ixor
    //   13567: getstatic Perryc.c : I
    //   13570: iflt -> 13584
    //   13573: ldc2_w -2118203010
    //   13576: l2i
    //   13577: ldc_w 1716419121
    //   13580: ixor
    //   13581: goto -> 13592
    //   13584: ldc2_w 211047660
    //   13587: l2i
    //   13588: ldc_w -858831039
    //   13591: ixor
    //   13592: ldc2_w 748808488
    //   13595: l2i
    //   13596: ldc_w 291254970
    //   13599: ixor
    //   13600: ixor
    //   13601: lookupswitch default -> 13628, -636655395 -> 14768, -171746415 -> 13584
    //   13628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13631: ldc2_w 915887168
    //   13634: l2i
    //   13635: ldc_w 915888068
    //   13638: ixor
    //   13639: getstatic Perryc.c : I
    //   13642: iflt -> 13656
    //   13645: ldc2_w -399192981
    //   13648: l2i
    //   13649: ldc_w 34561824
    //   13652: ixor
    //   13653: goto -> 13664
    //   13656: ldc2_w 73548671
    //   13659: l2i
    //   13660: ldc_w -845981533
    //   13663: ixor
    //   13664: ldc2_w 2101043758
    //   13667: l2i
    //   13668: ldc_w -1148016929
    //   13671: ixor
    //   13672: ixor
    //   13673: lookupswitch default -> 14680, 257482541 -> 13700, 747788218 -> 13656
    //   13700: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13703: getstatic Perryc.0 : I
    //   13706: ifle -> 13720
    //   13709: ldc2_w 1206336033
    //   13712: l2i
    //   13713: ldc_w -1647616168
    //   13716: ixor
    //   13717: goto -> 13728
    //   13720: ldc2_w 1639167356
    //   13723: l2i
    //   13724: ldc_w 27476160
    //   13727: ixor
    //   13728: ldc2_w -44285256
    //   13731: l2i
    //   13732: ldc_w 2085788382
    //   13735: ixor
    //   13736: ixor
    //   13737: lookupswitch default -> 14846, -518115878 -> 13764, 1529003295 -> 13720
    //   13764: aload_0
    //   13765: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   13770: getstatic Perryc.1 : I
    //   13773: ifeq -> 13787
    //   13776: ldc2_w 2036978041
    //   13779: l2i
    //   13780: ldc_w -1391827059
    //   13783: ixor
    //   13784: goto -> 13795
    //   13787: ldc2_w -1803624825
    //   13790: l2i
    //   13791: ldc_w 1040022470
    //   13794: ixor
    //   13795: ldc2_w 1051248345
    //   13798: l2i
    //   13799: ldc_w 1179610236
    //   13802: ixor
    //   13803: ixor
    //   13804: lookupswitch default -> 15060, -1400628143 -> 13787, -781971484 -> 13832
    //   13832: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13835: getstatic Perryc.0 : I
    //   13838: ifle -> 13852
    //   13841: ldc2_w -1753219062
    //   13844: l2i
    //   13845: ldc_w 446158457
    //   13848: ixor
    //   13849: goto -> 13860
    //   13852: ldc2_w 1384339988
    //   13855: l2i
    //   13856: ldc_w 1086771113
    //   13859: ixor
    //   13860: ldc2_w -765252475
    //   13863: l2i
    //   13864: ldc_w -905136334
    //   13867: ixor
    //   13868: ixor
    //   13869: lookupswitch default -> 14790, -1787277884 -> 13852, 170528266 -> 13896
    //   13896: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13899: getstatic Perryc.1 : I
    //   13902: ifeq -> 13916
    //   13905: ldc2_w -1480286788
    //   13908: l2i
    //   13909: ldc_w 982220605
    //   13912: ixor
    //   13913: goto -> 13924
    //   13916: ldc2_w 794263946
    //   13919: l2i
    //   13920: ldc_w -7468769
    //   13923: ixor
    //   13924: ldc2_w -1501996220
    //   13927: l2i
    //   13928: ldc_w -1941054944
    //   13931: ixor
    //   13932: ixor
    //   13933: lookupswitch default -> 14810, -1216650267 -> 13916, -85128719 -> 13960
    //   13960: putfield GapplesX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13963: getstatic Perryc.1 : I
    //   13966: ifeq -> 13980
    //   13969: ldc2_w -486470111
    //   13972: l2i
    //   13973: ldc_w 2068300837
    //   13976: ixor
    //   13977: goto -> 13988
    //   13980: ldc2_w -1874113796
    //   13983: l2i
    //   13984: ldc_w -104998368
    //   13987: ixor
    //   13988: ldc2_w 1585580715
    //   13991: l2i
    //   13992: ldc_w 472408446
    //   13995: ixor
    //   13996: ixor
    //   13997: lookupswitch default -> 14024, -669933347 -> 13980, -622026287 -> 14684
    //   14024: aload_0
    //   14025: getstatic Perryc.1 : I
    //   14028: ifeq -> 14042
    //   14031: ldc2_w -366081599
    //   14034: l2i
    //   14035: ldc_w -315354482
    //   14038: ixor
    //   14039: goto -> 14050
    //   14042: ldc2_w -461128691
    //   14045: l2i
    //   14046: ldc_w -1833897421
    //   14049: ixor
    //   14050: ldc2_w 81467150
    //   14053: l2i
    //   14054: ldc_w -850610249
    //   14057: ixor
    //   14058: ixor
    //   14059: lookupswitch default -> 14724, -1079710073 -> 14084, -829572106 -> 14042
    //   14084: aload_0
    //   14085: new bigname/zprestige/webhack/features/setting/Setting
    //   14088: dup
    //   14089: ldc_w '겱㌒곬㶧ᨙ䈯๪턂'
    //   14092: getstatic Perryc.c : I
    //   14095: iflt -> 14109
    //   14098: ldc2_w 1065202453
    //   14101: l2i
    //   14102: ldc_w -1553747257
    //   14105: ixor
    //   14106: goto -> 14117
    //   14109: ldc2_w -1834935458
    //   14112: l2i
    //   14113: ldc_w 1309074605
    //   14116: ixor
    //   14117: ldc2_w -667490794
    //   14120: l2i
    //   14121: ldc_w -2054767359
    //   14124: ixor
    //   14125: ixor
    //   14126: lookupswitch default -> 14152, -1810226740 -> 14109, -1045538107 -> 14862
    //   14152: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14155: ldc2_w 798200019
    //   14158: l2i
    //   14159: ldc_w 798199939
    //   14162: ixor
    //   14163: getstatic Perryc.1 : I
    //   14166: ifeq -> 14180
    //   14169: ldc2_w -1825598766
    //   14172: l2i
    //   14173: ldc_w 1460066441
    //   14176: ixor
    //   14177: goto -> 14188
    //   14180: ldc2_w -1042528227
    //   14183: l2i
    //   14184: ldc_w -1945652886
    //   14187: ixor
    //   14188: ldc2_w 19073752
    //   14191: l2i
    //   14192: ldc_w -1953238585
    //   14195: ixor
    //   14196: ixor
    //   14197: lookupswitch default -> 14750, -949288344 -> 14224, 1318695236 -> 14180
    //   14224: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14227: ldc2_w -529895253
    //   14230: l2i
    //   14231: ldc_w -529895253
    //   14234: ixor
    //   14235: getstatic Perryc.0 : I
    //   14238: ifle -> 14252
    //   14241: ldc2_w -440853848
    //   14244: l2i
    //   14245: ldc_w 624343171
    //   14248: ixor
    //   14249: goto -> 14260
    //   14252: ldc2_w -2076121788
    //   14255: l2i
    //   14256: ldc_w 23607628
    //   14259: ixor
    //   14260: ldc2_w 2085179125
    //   14263: l2i
    //   14264: ldc_w 943030425
    //   14267: ixor
    //   14268: ixor
    //   14269: lookupswitch default -> 14836, -2064421817 -> 14252, -1051454876 -> 14296
    //   14296: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14299: ldc2_w 497821804
    //   14302: l2i
    //   14303: ldc_w 497822334
    //   14306: ixor
    //   14307: getstatic Perryc.0 : I
    //   14310: ifle -> 14324
    //   14313: ldc2_w 940272919
    //   14316: l2i
    //   14317: ldc_w -1265554189
    //   14320: ixor
    //   14321: goto -> 14332
    //   14324: ldc2_w 130538787
    //   14327: l2i
    //   14328: ldc_w -1307245303
    //   14331: ixor
    //   14332: ldc2_w -1833787203
    //   14335: l2i
    //   14336: ldc_w -1987439611
    //   14339: ixor
    //   14340: ixor
    //   14341: lookupswitch default -> 14368, -1750928036 -> 14692, 589854423 -> 14324
    //   14368: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14371: getstatic Perryc.c : I
    //   14374: iflt -> 14388
    //   14377: ldc2_w 1445822583
    //   14380: l2i
    //   14381: ldc_w 1424006473
    //   14384: ixor
    //   14385: goto -> 14396
    //   14388: ldc2_w 793919921
    //   14391: l2i
    //   14392: ldc_w -801244674
    //   14395: ixor
    //   14396: ldc2_w 130303746
    //   14399: l2i
    //   14400: ldc_w -602963804
    //   14403: ixor
    //   14404: ixor
    //   14405: lookupswitch default -> 14968, -653862248 -> 14388, 614760425 -> 14432
    //   14432: aload_0
    //   14433: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Info;)Ljava/util/function/Predicate;
    //   14438: getstatic Perryc.0 : I
    //   14441: ifle -> 14455
    //   14444: ldc2_w -887360332
    //   14447: l2i
    //   14448: ldc_w 1009631274
    //   14451: ixor
    //   14452: goto -> 14463
    //   14455: ldc2_w 696969749
    //   14458: l2i
    //   14459: ldc_w -1932348234
    //   14462: ixor
    //   14463: ldc2_w -1527324928
    //   14466: l2i
    //   14467: ldc_w -232325141
    //   14470: ixor
    //   14471: ixor
    //   14472: lookupswitch default -> 14500, -1578757003 -> 14658, 1265738416 -> 14455
    //   14500: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14503: getstatic Perryc.1 : I
    //   14506: ifeq -> 14520
    //   14509: ldc2_w -1338176688
    //   14512: l2i
    //   14513: ldc_w 1337144402
    //   14516: ixor
    //   14517: goto -> 14528
    //   14520: ldc2_w 789233746
    //   14523: l2i
    //   14524: ldc_w -1290079956
    //   14527: ixor
    //   14528: ldc2_w -487119368
    //   14531: l2i
    //   14532: ldc_w 2014564038
    //   14535: ixor
    //   14536: ixor
    //   14537: lookupswitch default -> 14564, -589893726 -> 14520, 1701499964 -> 14954
    //   14564: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14567: getstatic Perryc.0 : I
    //   14570: ifle -> 14584
    //   14573: ldc2_w -1360889555
    //   14576: l2i
    //   14577: ldc_w 376868837
    //   14580: ixor
    //   14581: goto -> 14592
    //   14584: ldc2_w 1280350198
    //   14587: l2i
    //   14588: ldc_w -1761439257
    //   14591: ixor
    //   14592: ldc2_w 1490128980
    //   14595: l2i
    //   14596: ldc_w 320425160
    //   14599: ixor
    //   14600: ixor
    //   14601: lookupswitch default -> 14662, -1868899699 -> 14628, -212063660 -> 14584
    //   14628: putfield GapplesY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14631: return
    //   14632: aconst_null
    //   14633: athrow
    //   14634: aconst_null
    //   14635: athrow
    //   14636: aconst_null
    //   14637: athrow
    //   14638: aconst_null
    //   14639: athrow
    //   14640: aconst_null
    //   14641: athrow
    //   14642: aconst_null
    //   14643: athrow
    //   14644: aconst_null
    //   14645: athrow
    //   14646: aconst_null
    //   14647: athrow
    //   14648: aconst_null
    //   14649: athrow
    //   14650: aconst_null
    //   14651: athrow
    //   14652: aconst_null
    //   14653: athrow
    //   14654: aconst_null
    //   14655: athrow
    //   14656: aconst_null
    //   14657: athrow
    //   14658: aconst_null
    //   14659: athrow
    //   14660: aconst_null
    //   14661: athrow
    //   14662: aconst_null
    //   14663: athrow
    //   14664: aconst_null
    //   14665: athrow
    //   14666: aconst_null
    //   14667: athrow
    //   14668: aconst_null
    //   14669: athrow
    //   14670: aconst_null
    //   14671: athrow
    //   14672: aconst_null
    //   14673: athrow
    //   14674: aconst_null
    //   14675: athrow
    //   14676: aconst_null
    //   14677: athrow
    //   14678: aconst_null
    //   14679: athrow
    //   14680: aconst_null
    //   14681: athrow
    //   14682: aconst_null
    //   14683: athrow
    //   14684: aconst_null
    //   14685: athrow
    //   14686: aconst_null
    //   14687: athrow
    //   14688: aconst_null
    //   14689: athrow
    //   14690: aconst_null
    //   14691: athrow
    //   14692: aconst_null
    //   14693: athrow
    //   14694: aconst_null
    //   14695: athrow
    //   14696: aconst_null
    //   14697: athrow
    //   14698: aconst_null
    //   14699: athrow
    //   14700: aconst_null
    //   14701: athrow
    //   14702: aconst_null
    //   14703: athrow
    //   14704: aconst_null
    //   14705: athrow
    //   14706: aconst_null
    //   14707: athrow
    //   14708: aconst_null
    //   14709: athrow
    //   14710: aconst_null
    //   14711: athrow
    //   14712: aconst_null
    //   14713: athrow
    //   14714: aconst_null
    //   14715: athrow
    //   14716: aconst_null
    //   14717: athrow
    //   14718: aconst_null
    //   14719: athrow
    //   14720: aconst_null
    //   14721: athrow
    //   14722: aconst_null
    //   14723: athrow
    //   14724: aconst_null
    //   14725: athrow
    //   14726: aconst_null
    //   14727: athrow
    //   14728: aconst_null
    //   14729: athrow
    //   14730: aconst_null
    //   14731: athrow
    //   14732: aconst_null
    //   14733: athrow
    //   14734: aconst_null
    //   14735: athrow
    //   14736: aconst_null
    //   14737: athrow
    //   14738: aconst_null
    //   14739: athrow
    //   14740: aconst_null
    //   14741: athrow
    //   14742: aconst_null
    //   14743: athrow
    //   14744: aconst_null
    //   14745: athrow
    //   14746: aconst_null
    //   14747: athrow
    //   14748: aconst_null
    //   14749: athrow
    //   14750: aconst_null
    //   14751: athrow
    //   14752: aconst_null
    //   14753: athrow
    //   14754: aconst_null
    //   14755: athrow
    //   14756: aconst_null
    //   14757: athrow
    //   14758: aconst_null
    //   14759: athrow
    //   14760: aconst_null
    //   14761: athrow
    //   14762: aconst_null
    //   14763: athrow
    //   14764: aconst_null
    //   14765: athrow
    //   14766: aconst_null
    //   14767: athrow
    //   14768: aconst_null
    //   14769: athrow
    //   14770: aconst_null
    //   14771: athrow
    //   14772: aconst_null
    //   14773: athrow
    //   14774: aconst_null
    //   14775: athrow
    //   14776: aconst_null
    //   14777: athrow
    //   14778: aconst_null
    //   14779: athrow
    //   14780: aconst_null
    //   14781: athrow
    //   14782: aconst_null
    //   14783: athrow
    //   14784: aconst_null
    //   14785: athrow
    //   14786: aconst_null
    //   14787: athrow
    //   14788: aconst_null
    //   14789: athrow
    //   14790: aconst_null
    //   14791: athrow
    //   14792: aconst_null
    //   14793: athrow
    //   14794: aconst_null
    //   14795: athrow
    //   14796: aconst_null
    //   14797: athrow
    //   14798: aconst_null
    //   14799: athrow
    //   14800: aconst_null
    //   14801: athrow
    //   14802: aconst_null
    //   14803: athrow
    //   14804: aconst_null
    //   14805: athrow
    //   14806: aconst_null
    //   14807: athrow
    //   14808: aconst_null
    //   14809: athrow
    //   14810: aconst_null
    //   14811: athrow
    //   14812: aconst_null
    //   14813: athrow
    //   14814: aconst_null
    //   14815: athrow
    //   14816: aconst_null
    //   14817: athrow
    //   14818: aconst_null
    //   14819: athrow
    //   14820: aconst_null
    //   14821: athrow
    //   14822: aconst_null
    //   14823: athrow
    //   14824: aconst_null
    //   14825: athrow
    //   14826: aconst_null
    //   14827: athrow
    //   14828: aconst_null
    //   14829: athrow
    //   14830: aconst_null
    //   14831: athrow
    //   14832: aconst_null
    //   14833: athrow
    //   14834: aconst_null
    //   14835: athrow
    //   14836: aconst_null
    //   14837: athrow
    //   14838: aconst_null
    //   14839: athrow
    //   14840: aconst_null
    //   14841: athrow
    //   14842: aconst_null
    //   14843: athrow
    //   14844: aconst_null
    //   14845: athrow
    //   14846: aconst_null
    //   14847: athrow
    //   14848: aconst_null
    //   14849: athrow
    //   14850: aconst_null
    //   14851: athrow
    //   14852: aconst_null
    //   14853: athrow
    //   14854: aconst_null
    //   14855: athrow
    //   14856: aconst_null
    //   14857: athrow
    //   14858: aconst_null
    //   14859: athrow
    //   14860: aconst_null
    //   14861: athrow
    //   14862: aconst_null
    //   14863: athrow
    //   14864: aconst_null
    //   14865: athrow
    //   14866: aconst_null
    //   14867: athrow
    //   14868: aconst_null
    //   14869: athrow
    //   14870: aconst_null
    //   14871: athrow
    //   14872: aconst_null
    //   14873: athrow
    //   14874: aconst_null
    //   14875: athrow
    //   14876: aconst_null
    //   14877: athrow
    //   14878: aconst_null
    //   14879: athrow
    //   14880: aconst_null
    //   14881: athrow
    //   14882: aconst_null
    //   14883: athrow
    //   14884: aconst_null
    //   14885: athrow
    //   14886: aconst_null
    //   14887: athrow
    //   14888: aconst_null
    //   14889: athrow
    //   14890: aconst_null
    //   14891: athrow
    //   14892: aconst_null
    //   14893: athrow
    //   14894: aconst_null
    //   14895: athrow
    //   14896: aconst_null
    //   14897: athrow
    //   14898: aconst_null
    //   14899: athrow
    //   14900: aconst_null
    //   14901: athrow
    //   14902: aconst_null
    //   14903: athrow
    //   14904: aconst_null
    //   14905: athrow
    //   14906: aconst_null
    //   14907: athrow
    //   14908: aconst_null
    //   14909: athrow
    //   14910: aconst_null
    //   14911: athrow
    //   14912: aconst_null
    //   14913: athrow
    //   14914: aconst_null
    //   14915: athrow
    //   14916: aconst_null
    //   14917: athrow
    //   14918: aconst_null
    //   14919: athrow
    //   14920: aconst_null
    //   14921: athrow
    //   14922: aconst_null
    //   14923: athrow
    //   14924: aconst_null
    //   14925: athrow
    //   14926: aconst_null
    //   14927: athrow
    //   14928: aconst_null
    //   14929: athrow
    //   14930: aconst_null
    //   14931: athrow
    //   14932: aconst_null
    //   14933: athrow
    //   14934: aconst_null
    //   14935: athrow
    //   14936: aconst_null
    //   14937: athrow
    //   14938: aconst_null
    //   14939: athrow
    //   14940: aconst_null
    //   14941: athrow
    //   14942: aconst_null
    //   14943: athrow
    //   14944: aconst_null
    //   14945: athrow
    //   14946: aconst_null
    //   14947: athrow
    //   14948: aconst_null
    //   14949: athrow
    //   14950: aconst_null
    //   14951: athrow
    //   14952: aconst_null
    //   14953: athrow
    //   14954: aconst_null
    //   14955: athrow
    //   14956: aconst_null
    //   14957: athrow
    //   14958: aconst_null
    //   14959: athrow
    //   14960: aconst_null
    //   14961: athrow
    //   14962: aconst_null
    //   14963: athrow
    //   14964: aconst_null
    //   14965: athrow
    //   14966: aconst_null
    //   14967: athrow
    //   14968: aconst_null
    //   14969: athrow
    //   14970: aconst_null
    //   14971: athrow
    //   14972: aconst_null
    //   14973: athrow
    //   14974: aconst_null
    //   14975: athrow
    //   14976: aconst_null
    //   14977: athrow
    //   14978: aconst_null
    //   14979: athrow
    //   14980: aconst_null
    //   14981: athrow
    //   14982: aconst_null
    //   14983: athrow
    //   14984: aconst_null
    //   14985: athrow
    //   14986: aconst_null
    //   14987: athrow
    //   14988: aconst_null
    //   14989: athrow
    //   14990: aconst_null
    //   14991: athrow
    //   14992: aconst_null
    //   14993: athrow
    //   14994: aconst_null
    //   14995: athrow
    //   14996: aconst_null
    //   14997: athrow
    //   14998: aconst_null
    //   14999: athrow
    //   15000: aconst_null
    //   15001: athrow
    //   15002: aconst_null
    //   15003: athrow
    //   15004: aconst_null
    //   15005: athrow
    //   15006: aconst_null
    //   15007: athrow
    //   15008: aconst_null
    //   15009: athrow
    //   15010: aconst_null
    //   15011: athrow
    //   15012: aconst_null
    //   15013: athrow
    //   15014: aconst_null
    //   15015: athrow
    //   15016: aconst_null
    //   15017: athrow
    //   15018: aconst_null
    //   15019: athrow
    //   15020: aconst_null
    //   15021: athrow
    //   15022: aconst_null
    //   15023: athrow
    //   15024: aconst_null
    //   15025: athrow
    //   15026: aconst_null
    //   15027: athrow
    //   15028: aconst_null
    //   15029: athrow
    //   15030: aconst_null
    //   15031: athrow
    //   15032: aconst_null
    //   15033: athrow
    //   15034: aconst_null
    //   15035: athrow
    //   15036: aconst_null
    //   15037: athrow
    //   15038: aconst_null
    //   15039: athrow
    //   15040: aconst_null
    //   15041: athrow
    //   15042: aconst_null
    //   15043: athrow
    //   15044: aconst_null
    //   15045: athrow
    //   15046: aconst_null
    //   15047: athrow
    //   15048: aconst_null
    //   15049: athrow
    //   15050: aconst_null
    //   15051: athrow
    //   15052: aconst_null
    //   15053: athrow
    //   15054: aconst_null
    //   15055: athrow
    //   15056: aconst_null
    //   15057: athrow
    //   15058: aconst_null
    //   15059: athrow
    //   15060: aconst_null
    //   15061: athrow
    //   15062: aconst_null
    //   15063: athrow
    //   15064: aconst_null
    //   15065: athrow
    //   15066: aconst_null
    //   15067: athrow
    //   15068: aconst_null
    //   15069: athrow
    //   15070: aconst_null
    //   15071: athrow
    //   15072: aconst_null
    //   15073: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	14632	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Info;
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.1O(this, (int)1575870799L ^ 0x19364C57, paramObject);
  }
  
  public static boolean lambda$onRender2D$18(ItemStack paramItemStack) {
    return Perry1.0w(null, (int)-903513211L ^ 0x9C9C460E, paramItemStack);
  }
  
  public boolean lambda$new$7(Object paramObject) {
    return Perry1.1K(this, (int)-62971162L ^ 0xF753F98C, paramObject);
  }
  
  public boolean lambda$new$6(Object paramObject) {
    return Perry1.1Z(this, (int)-1014568167L ^ 0xD23B722B, paramObject);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.1B(this, (int)2078673130L ^ 0x7FF941BD, paramObject);
  }
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.1A(this, (int)71065315L ^ 0x2210368, paramObject);
  }
  
  public boolean lambda$new$3(Object paramObject) {
    return Perry1.21(this, (int)1063497799L ^ 0x46C32DA4, paramObject);
  }
  
  public void onRender2D(Render2DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 31636
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 31628
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 31620
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w -1454990870
    //   37: l2i
    //   38: ldc_w -1770376393
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -983137023
    //   48: l2i
    //   49: ldc_w 1990476656
    //   52: ixor
    //   53: ldc2_w 1157078604
    //   56: l2i
    //   57: ldc_w -565609519
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -2091585981 -> 45, -1518186688 -> 31497
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: ldc_w '결㌃곯拢'
    //   102: getstatic Perryc.0 : I
    //   105: ifle -> 119
    //   108: ldc2_w 645893132
    //   111: l2i
    //   112: ldc_w -1571278523
    //   115: ixor
    //   116: goto -> 127
    //   119: ldc2_w -287759853
    //   122: l2i
    //   123: ldc_w 1173356658
    //   126: ixor
    //   127: ldc2_w 1237110541
    //   130: l2i
    //   131: ldc_w -1952294683
    //   134: ixor
    //   135: ixor
    //   136: lookupswitch default -> 31529, 1178151585 -> 119, 1765258633 -> 164
    //   164: goto -> 168
    //   167: athrow
    //   168: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   171: goto -> 175
    //   174: athrow
    //   175: getstatic Perryc.c : I
    //   178: iflt -> 192
    //   181: ldc2_w 2135249124
    //   184: l2i
    //   185: ldc_w 1709054615
    //   188: ixor
    //   189: goto -> 200
    //   192: ldc2_w -1623900048
    //   195: l2i
    //   196: ldc_w -1746365279
    //   199: ixor
    //   200: ldc2_w -1331181167
    //   203: l2i
    //   204: ldc_w 735301179
    //   207: ixor
    //   208: ixor
    //   209: lookupswitch default -> 31251, -2115023399 -> 192, -1817586821 -> 236
    //   236: goto -> 240
    //   239: athrow
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: goto -> 247
    //   246: athrow
    //   247: getstatic Perryc.1 : I
    //   250: ifeq -> 264
    //   253: ldc2_w 396839728
    //   256: l2i
    //   257: ldc_w 1755138723
    //   260: ixor
    //   261: goto -> 272
    //   264: ldc2_w -1659880860
    //   267: l2i
    //   268: ldc_w -1664253065
    //   271: ixor
    //   272: ldc2_w 1031017910
    //   275: l2i
    //   276: ldc_w 2128534706
    //   279: ixor
    //   280: ixor
    //   281: lookupswitch default -> 30795, 1016121495 -> 264, 1115123735 -> 308
    //   308: goto -> 312
    //   311: athrow
    //   312: invokestatic getFpsStatus : ()Ljava/lang/String;
    //   315: goto -> 319
    //   318: athrow
    //   319: getstatic Perryc.1 : I
    //   322: ifeq -> 336
    //   325: ldc2_w -977028929
    //   328: l2i
    //   329: ldc_w -856983112
    //   332: ixor
    //   333: goto -> 344
    //   336: ldc2_w -2078379976
    //   339: l2i
    //   340: ldc_w -28729641
    //   343: ixor
    //   344: ldc2_w 1180253983
    //   347: l2i
    //   348: ldc_w 2117130143
    //   351: ixor
    //   352: ixor
    //   353: lookupswitch default -> 380, -263501929 -> 336, 826354055 -> 31169
    //   380: goto -> 384
    //   383: athrow
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: goto -> 391
    //   390: athrow
    //   391: getstatic Perryc.0 : I
    //   394: ifle -> 408
    //   397: ldc2_w -1041685551
    //   400: l2i
    //   401: ldc_w 458652022
    //   404: ixor
    //   405: goto -> 416
    //   408: ldc2_w 701328304
    //   411: l2i
    //   412: ldc_w 435879793
    //   415: ixor
    //   416: ldc2_w -900919314
    //   419: l2i
    //   420: ldc_w 1374006607
    //   423: ixor
    //   424: ixor
    //   425: lookupswitch default -> 452, -1659129740 -> 408, 1092089862 -> 31059
    //   452: goto -> 456
    //   455: athrow
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: goto -> 463
    //   462: athrow
    //   463: getstatic Perryc.c : I
    //   466: iflt -> 480
    //   469: ldc2_w -1831792440
    //   472: l2i
    //   473: ldc_w 2037007003
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w 489454293
    //   483: l2i
    //   484: ldc_w 319678549
    //   487: ixor
    //   488: ldc2_w 662935198
    //   491: l2i
    //   492: ldc_w 1914111202
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -1104166865 -> 31277, 318660410 -> 480
    //   524: astore_2
    //   525: new java/lang/StringBuilder
    //   528: dup
    //   529: getstatic Perryc.0 : I
    //   532: ifle -> 546
    //   535: ldc2_w 912376747
    //   538: l2i
    //   539: ldc_w 2093658682
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w 408558128
    //   549: l2i
    //   550: ldc_w 105627621
    //   553: ixor
    //   554: ldc2_w -1384343148
    //   557: l2i
    //   558: ldc_w 1540805961
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 31475, -1140769460 -> 546, -390338296 -> 588
    //   588: goto -> 592
    //   591: athrow
    //   592: invokespecial <init> : ()V
    //   595: goto -> 599
    //   598: athrow
    //   599: ldc_w '겢㌃곯拢'
    //   602: getstatic Perryc.0 : I
    //   605: ifle -> 619
    //   608: ldc2_w -463830782
    //   611: l2i
    //   612: ldc_w -177386083
    //   615: ixor
    //   616: goto -> 627
    //   619: ldc2_w -240504404
    //   622: l2i
    //   623: ldc_w 1692893987
    //   626: ixor
    //   627: ldc2_w 300800483
    //   630: l2i
    //   631: ldc_w -52461424
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 664, -66742804 -> 31011, 1490913955 -> 619
    //   664: goto -> 668
    //   667: athrow
    //   668: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   671: goto -> 675
    //   674: athrow
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w -1652622248
    //   684: l2i
    //   685: ldc_w -103771109
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -670888471
    //   695: l2i
    //   696: ldc_w 1022714082
    //   699: ixor
    //   700: ldc2_w 627888797
    //   703: l2i
    //   704: ldc_w -1217525623
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -1415800145 -> 692, -156454313 -> 30977
    //   736: goto -> 740
    //   739: athrow
    //   740: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   743: goto -> 747
    //   746: athrow
    //   747: getstatic Perryc.c : I
    //   750: iflt -> 764
    //   753: ldc2_w 548145586
    //   756: l2i
    //   757: ldc_w -509887854
    //   760: ixor
    //   761: goto -> 772
    //   764: ldc2_w 1066688418
    //   767: l2i
    //   768: ldc_w -1931204650
    //   771: ixor
    //   772: ldc2_w 350034794
    //   775: l2i
    //   776: ldc_w 1534753098
    //   779: ixor
    //   780: ixor
    //   781: lookupswitch default -> 808, -1903111936 -> 30985, 2099242090 -> 764
    //   808: goto -> 812
    //   811: athrow
    //   812: invokestatic getTpsStatus : ()Ljava/lang/String;
    //   815: goto -> 819
    //   818: athrow
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w -1840915413
    //   828: l2i
    //   829: ldc_w 339305267
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 747129672
    //   839: l2i
    //   840: ldc_w 311242811
    //   843: ixor
    //   844: ldc2_w 1055434739
    //   847: l2i
    //   848: ldc_w -1025065964
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, 1497437531 -> 836, 2054333695 -> 31459
    //   880: goto -> 884
    //   883: athrow
    //   884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   887: goto -> 891
    //   890: athrow
    //   891: getstatic Perryc.c : I
    //   894: iflt -> 908
    //   897: ldc2_w -1206389632
    //   900: l2i
    //   901: ldc_w -1390695679
    //   904: ixor
    //   905: goto -> 916
    //   908: ldc2_w -117544719
    //   911: l2i
    //   912: ldc_w 213382832
    //   915: ixor
    //   916: ldc2_w 1449152876
    //   919: l2i
    //   920: ldc_w 1048211281
    //   923: ixor
    //   924: ixor
    //   925: lookupswitch default -> 952, -1176358852 -> 908, 2098618812 -> 31541
    //   952: goto -> 956
    //   955: athrow
    //   956: invokevirtual toString : ()Ljava/lang/String;
    //   959: goto -> 963
    //   962: athrow
    //   963: getstatic Perryc.1 : I
    //   966: ifeq -> 980
    //   969: ldc2_w -1543823583
    //   972: l2i
    //   973: ldc_w 2097334512
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w -1255083220
    //   983: l2i
    //   984: ldc_w 1495892465
    //   987: ixor
    //   988: ldc2_w -1646318974
    //   991: l2i
    //   992: ldc_w 1055578926
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, -787472501 -> 980, 2110531197 -> 31189
    //   1024: astore_3
    //   1025: new java/lang/StringBuilder
    //   1028: dup
    //   1029: getstatic Perryc.0 : I
    //   1032: ifle -> 1046
    //   1035: ldc2_w -1353657427
    //   1038: l2i
    //   1039: ldc_w -701069634
    //   1042: ixor
    //   1043: goto -> 1054
    //   1046: ldc2_w -1507057880
    //   1049: l2i
    //   1050: ldc_w 932541269
    //   1053: ixor
    //   1054: ldc2_w 1464141978
    //   1057: l2i
    //   1058: ldc_w 1164759279
    //   1061: ixor
    //   1062: ixor
    //   1063: lookupswitch default -> 1088, -437611506 -> 1046, 1800375654 -> 31137
    //   1088: goto -> 1092
    //   1091: athrow
    //   1092: invokespecial <init> : ()V
    //   1095: goto -> 1099
    //   1098: athrow
    //   1099: ldc_w '겦㌚곲报䂠'
    //   1102: getstatic Perryc.1 : I
    //   1105: ifeq -> 1119
    //   1108: ldc2_w 1680809656
    //   1111: l2i
    //   1112: ldc_w -1752370769
    //   1115: ixor
    //   1116: goto -> 1127
    //   1119: ldc2_w -326675162
    //   1122: l2i
    //   1123: ldc_w 39756705
    //   1126: ixor
    //   1127: ldc2_w -832330272
    //   1130: l2i
    //   1131: ldc_w 687375721
    //   1134: ixor
    //   1135: ixor
    //   1136: lookupswitch default -> 1164, -1509650772 -> 1119, 356044702 -> 31273
    //   1164: goto -> 1168
    //   1167: athrow
    //   1168: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1171: goto -> 1175
    //   1174: athrow
    //   1175: getstatic Perryc.1 : I
    //   1178: ifeq -> 1192
    //   1181: ldc2_w -1666165286
    //   1184: l2i
    //   1185: ldc_w -1785942227
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w -1194548986
    //   1195: l2i
    //   1196: ldc_w 356100275
    //   1199: ixor
    //   1200: ldc2_w 258835002
    //   1203: l2i
    //   1204: ldc_w -1144987993
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 1236, -1114528150 -> 30887, 582659289 -> 1192
    //   1236: goto -> 1240
    //   1239: athrow
    //   1240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1243: goto -> 1247
    //   1246: athrow
    //   1247: getstatic Perryc.0 : I
    //   1250: ifle -> 1264
    //   1253: ldc2_w -1169507630
    //   1256: l2i
    //   1257: ldc_w 329039261
    //   1260: ixor
    //   1261: goto -> 1272
    //   1264: ldc2_w -1191738955
    //   1267: l2i
    //   1268: ldc_w -1182375271
    //   1271: ixor
    //   1272: ldc2_w -543637576
    //   1275: l2i
    //   1276: ldc_w 876472783
    //   1279: ixor
    //   1280: ixor
    //   1281: lookupswitch default -> 31327, -355158693 -> 1308, 1114853688 -> 1264
    //   1308: goto -> 1312
    //   1311: athrow
    //   1312: invokestatic getPingSatus : ()Ljava/lang/String;
    //   1315: goto -> 1319
    //   1318: athrow
    //   1319: getstatic Perryc.1 : I
    //   1322: ifeq -> 1336
    //   1325: ldc2_w -1107056976
    //   1328: l2i
    //   1329: ldc_w -1075662548
    //   1332: ixor
    //   1333: goto -> 1344
    //   1336: ldc2_w 1770691948
    //   1339: l2i
    //   1340: ldc_w 1994146153
    //   1343: ixor
    //   1344: ldc2_w 480836464
    //   1347: l2i
    //   1348: ldc_w 941182974
    //   1351: ixor
    //   1352: ixor
    //   1353: lookupswitch default -> 1380, -1190079168 -> 1336, 626041618 -> 31185
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: getstatic Perryc.1 : I
    //   1394: ifeq -> 1408
    //   1397: ldc2_w 790488580
    //   1400: l2i
    //   1401: ldc_w 25761141
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w 40933671
    //   1411: l2i
    //   1412: ldc_w -1226797016
    //   1415: ixor
    //   1416: ldc2_w 1778852697
    //   1419: l2i
    //   1420: ldc_w -1713199256
    //   1423: ixor
    //   1424: ixor
    //   1425: lookupswitch default -> 31097, -579766464 -> 1408, 1198886206 -> 1452
    //   1452: goto -> 1456
    //   1455: athrow
    //   1456: invokevirtual toString : ()Ljava/lang/String;
    //   1459: goto -> 1463
    //   1462: athrow
    //   1463: getstatic Perryc.0 : I
    //   1466: ifle -> 1480
    //   1469: ldc2_w -2142132910
    //   1472: l2i
    //   1473: ldc_w 1622167923
    //   1476: ixor
    //   1477: goto -> 1488
    //   1480: ldc2_w -1088739281
    //   1483: l2i
    //   1484: ldc_w 20287855
    //   1487: ixor
    //   1488: ldc2_w -1470780910
    //   1491: l2i
    //   1492: ldc_w -1711668047
    //   1495: ixor
    //   1496: ixor
    //   1497: lookupswitch default -> 31297, -1887365149 -> 1524, -783394174 -> 1480
    //   1524: astore #4
    //   1526: new java/lang/StringBuilder
    //   1529: dup
    //   1530: getstatic Perryc.0 : I
    //   1533: ifle -> 1547
    //   1536: ldc2_w -813064381
    //   1539: l2i
    //   1540: ldc_w 389239961
    //   1543: ixor
    //   1544: goto -> 1555
    //   1547: ldc2_w 1209297435
    //   1550: l2i
    //   1551: ldc_w 541961809
    //   1554: ixor
    //   1555: ldc2_w 553081637
    //   1558: l2i
    //   1559: ldc_w 1197419246
    //   1562: ixor
    //   1563: ixor
    //   1564: lookupswitch default -> 31231, -1089291759 -> 1547, 267498881 -> 1592
    //   1592: goto -> 1596
    //   1595: athrow
    //   1596: invokespecial <init> : ()V
    //   1599: goto -> 1603
    //   1602: athrow
    //   1603: ldc_w '겥㌃곹抧䃤䉰ู'
    //   1606: getstatic Perryc.0 : I
    //   1609: ifle -> 1623
    //   1612: ldc2_w -648515031
    //   1615: l2i
    //   1616: ldc_w 1194021115
    //   1619: ixor
    //   1620: goto -> 1631
    //   1623: ldc2_w -1881393884
    //   1626: l2i
    //   1627: ldc_w 1896325590
    //   1630: ixor
    //   1631: ldc2_w 1943059531
    //   1634: l2i
    //   1635: ldc_w 1185561641
    //   1638: ixor
    //   1639: ixor
    //   1640: lookupswitch default -> 1668, -1425431888 -> 31317, 392436565 -> 1623
    //   1668: goto -> 1672
    //   1671: athrow
    //   1672: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1675: goto -> 1679
    //   1678: athrow
    //   1679: getstatic Perryc.1 : I
    //   1682: ifeq -> 1696
    //   1685: ldc2_w 255408773
    //   1688: l2i
    //   1689: ldc_w -1704070978
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 86738743
    //   1699: l2i
    //   1700: ldc_w 1083350425
    //   1703: ixor
    //   1704: ldc2_w -1118929729
    //   1707: l2i
    //   1708: ldc_w -1158888075
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, -1829342223 -> 31303, 1425056915 -> 1696
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: getstatic Perryc.c : I
    //   1754: iflt -> 1768
    //   1757: ldc2_w 1093194900
    //   1760: l2i
    //   1761: ldc_w -1609596597
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w 1147904829
    //   1771: l2i
    //   1772: ldc_w -1917871097
    //   1775: ixor
    //   1776: ldc2_w -293022572
    //   1779: l2i
    //   1780: ldc_w 1420816154
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 31377, 1526754897 -> 1768, 1944257716 -> 1812
    //   1812: getstatic bigname/zprestige/webhack/WebHack.speedManager : Lbigname/zprestige/webhack/manager/SpeedManager;
    //   1815: getstatic Perryc.0 : I
    //   1818: ifle -> 1832
    //   1821: ldc2_w 310819072
    //   1824: l2i
    //   1825: ldc_w 680275862
    //   1828: ixor
    //   1829: goto -> 1840
    //   1832: ldc2_w 1650384203
    //   1835: l2i
    //   1836: ldc_w -383089647
    //   1839: ixor
    //   1840: ldc2_w -1788071587
    //   1843: l2i
    //   1844: ldc_w -665192435
    //   1847: ixor
    //   1848: ixor
    //   1849: lookupswitch default -> 31255, -968781814 -> 1876, 2000641990 -> 1832
    //   1876: goto -> 1880
    //   1879: athrow
    //   1880: invokevirtual getSpeedKpH : ()D
    //   1883: goto -> 1887
    //   1886: athrow
    //   1887: getstatic Perryc.0 : I
    //   1890: ifle -> 1904
    //   1893: ldc2_w -981828926
    //   1896: l2i
    //   1897: ldc_w 983858164
    //   1900: ixor
    //   1901: goto -> 1912
    //   1904: ldc2_w 2027938915
    //   1907: l2i
    //   1908: ldc_w 717549752
    //   1911: ixor
    //   1912: ldc2_w 438158238
    //   1915: l2i
    //   1916: ldc_w 600174368
    //   1919: ixor
    //   1920: ixor
    //   1921: lookupswitch default -> 1948, -972673656 -> 31123, -42251930 -> 1904
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1955: goto -> 1959
    //   1958: athrow
    //   1959: ldc_w '곖㌘곱拭䃨'
    //   1962: getstatic Perryc.c : I
    //   1965: iflt -> 1979
    //   1968: ldc2_w -1728748452
    //   1971: l2i
    //   1972: ldc_w 1955914470
    //   1975: ixor
    //   1976: goto -> 1987
    //   1979: ldc2_w 2110786967
    //   1982: l2i
    //   1983: ldc_w -505116250
    //   1986: ixor
    //   1987: ldc2_w -1918233962
    //   1990: l2i
    //   1991: ldc_w -1660397451
    //   1994: ixor
    //   1995: ixor
    //   1996: lookupswitch default -> 2024, -1360771628 -> 1979, -54277031 -> 31353
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: getstatic Perryc.c : I
    //   2038: iflt -> 2052
    //   2041: ldc2_w -1800062016
    //   2044: l2i
    //   2045: ldc_w -130172233
    //   2048: ixor
    //   2049: goto -> 2060
    //   2052: ldc2_w -229623008
    //   2055: l2i
    //   2056: ldc_w 294343476
    //   2059: ixor
    //   2060: ldc2_w -58977556
    //   2063: l2i
    //   2064: ldc_w -1826248191
    //   2067: ixor
    //   2068: ixor
    //   2069: lookupswitch default -> 2096, 64043418 -> 30979, 449882643 -> 2052
    //   2096: goto -> 2100
    //   2099: athrow
    //   2100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2103: goto -> 2107
    //   2106: athrow
    //   2107: getstatic Perryc.1 : I
    //   2110: ifeq -> 2124
    //   2113: ldc2_w 234695415
    //   2116: l2i
    //   2117: ldc_w 1683019307
    //   2120: ixor
    //   2121: goto -> 2132
    //   2124: ldc2_w 275637373
    //   2127: l2i
    //   2128: ldc_w 467879248
    //   2131: ixor
    //   2132: ldc2_w -1064244666
    //   2135: l2i
    //   2136: ldc_w 1633695121
    //   2139: ixor
    //   2140: ixor
    //   2141: lookupswitch default -> 30877, -1434550534 -> 2168, -933420277 -> 2124
    //   2168: goto -> 2172
    //   2171: athrow
    //   2172: invokevirtual toString : ()Ljava/lang/String;
    //   2175: goto -> 2179
    //   2178: athrow
    //   2179: getstatic Perryc.c : I
    //   2182: iflt -> 2196
    //   2185: ldc2_w 520443059
    //   2188: l2i
    //   2189: ldc_w -137610108
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w -1041321654
    //   2199: l2i
    //   2200: ldc_w 963131110
    //   2203: ixor
    //   2204: ldc2_w -1699498898
    //   2207: l2i
    //   2208: ldc_w -1332191908
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 30783, -1025343227 -> 2196, -760385890 -> 2240
    //   2240: astore #5
    //   2242: new java/lang/StringBuilder
    //   2245: dup
    //   2246: getstatic Perryc.0 : I
    //   2249: ifle -> 2263
    //   2252: ldc2_w -281115125
    //   2255: l2i
    //   2256: ldc_w 1777697171
    //   2259: ixor
    //   2260: goto -> 2271
    //   2263: ldc2_w -1832599253
    //   2266: l2i
    //   2267: ldc_w 461346200
    //   2270: ixor
    //   2271: ldc2_w 466175609
    //   2274: l2i
    //   2275: ldc_w -1382641349
    //   2278: ixor
    //   2279: ixor
    //   2280: lookupswitch default -> 2308, -1447369339 -> 2263, 815059162 -> 31339
    //   2308: goto -> 2312
    //   2311: athrow
    //   2312: invokespecial <init> : ()V
    //   2315: goto -> 2319
    //   2318: athrow
    //   2319: ldc_w '겵㌁곥抱䃴䈫๵턨턬ᱞ'
    //   2322: getstatic Perryc.1 : I
    //   2325: ifeq -> 2339
    //   2328: ldc2_w -1378770717
    //   2331: l2i
    //   2332: ldc_w -737678622
    //   2335: ixor
    //   2336: goto -> 2347
    //   2339: ldc2_w -1048814584
    //   2342: l2i
    //   2343: ldc_w 541487862
    //   2346: ixor
    //   2347: ldc2_w 931114087
    //   2350: l2i
    //   2351: ldc_w -601780810
    //   2354: ixor
    //   2355: ixor
    //   2356: lookupswitch default -> 2384, -1836553264 -> 30967, -532137079 -> 2339
    //   2384: goto -> 2388
    //   2387: athrow
    //   2388: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2391: goto -> 2395
    //   2394: athrow
    //   2395: getstatic Perryc.c : I
    //   2398: iflt -> 2412
    //   2401: ldc2_w 1793129838
    //   2404: l2i
    //   2405: ldc_w -1778275991
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w -969459438
    //   2415: l2i
    //   2416: ldc_w 11460699
    //   2419: ixor
    //   2420: ldc2_w -933430064
    //   2423: l2i
    //   2424: ldc_w 1063774434
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 30805, 198852661 -> 2412, 832753019 -> 2456
    //   2456: goto -> 2460
    //   2459: athrow
    //   2460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2463: goto -> 2467
    //   2466: athrow
    //   2467: getstatic Perryc.c : I
    //   2470: iflt -> 2484
    //   2473: ldc2_w -343489713
    //   2476: l2i
    //   2477: ldc_w -1485517135
    //   2480: ixor
    //   2481: goto -> 2492
    //   2484: ldc2_w 335401972
    //   2487: l2i
    //   2488: ldc_w 799136873
    //   2491: ixor
    //   2492: ldc2_w -180949037
    //   2495: l2i
    //   2496: ldc_w 492949002
    //   2499: ixor
    //   2500: ixor
    //   2501: lookupswitch default -> 2528, -1532679129 -> 31415, 1614420740 -> 2484
    //   2528: getstatic bigname/zprestige/webhack/features/modules/Hud/Info.mc : Lnet/minecraft/client/Minecraft;
    //   2531: getstatic Perryc.0 : I
    //   2534: ifle -> 2548
    //   2537: ldc2_w 1612670466
    //   2540: l2i
    //   2541: ldc_w 800086128
    //   2544: ixor
    //   2545: goto -> 2556
    //   2548: ldc2_w 947723460
    //   2551: l2i
    //   2552: ldc_w -1416490245
    //   2555: ixor
    //   2556: ldc2_w 1656791598
    //   2559: l2i
    //   2560: ldc_w 1118673550
    //   2563: ixor
    //   2564: ixor
    //   2565: lookupswitch default -> 31333, -1283311969 -> 2592, 1874986706 -> 2548
    //   2592: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2595: getstatic Perryc.c : I
    //   2598: iflt -> 2612
    //   2601: ldc2_w 1381589924
    //   2604: l2i
    //   2605: ldc_w -1890489727
    //   2608: ixor
    //   2609: goto -> 2620
    //   2612: ldc2_w 224640975
    //   2615: l2i
    //   2616: ldc_w -307707462
    //   2619: ixor
    //   2620: ldc2_w 2054867596
    //   2623: l2i
    //   2624: ldc_w 1381893758
    //   2627: ixor
    //   2628: ixor
    //   2629: lookupswitch default -> 2656, -181615145 -> 30861, 1551969789 -> 2612
    //   2656: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   2659: getstatic Perryc.c : I
    //   2662: iflt -> 2676
    //   2665: ldc2_w 556255422
    //   2668: l2i
    //   2669: ldc_w -1390182246
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -1910030923
    //   2679: l2i
    //   2680: ldc_w 1742303451
    //   2683: ixor
    //   2684: ldc2_w 307604188
    //   2687: l2i
    //   2688: ldc_w 2015057481
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 31461, -2085572101 -> 2720, -431311695 -> 2676
    //   2720: getfield field_70462_a : Lnet/minecraft/util/NonNullList;
    //   2723: getstatic Perryc.c : I
    //   2726: iflt -> 2740
    //   2729: ldc2_w -819969693
    //   2732: l2i
    //   2733: ldc_w -966615276
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w -281059313
    //   2743: l2i
    //   2744: ldc_w 613672359
    //   2747: ixor
    //   2748: ldc2_w 1006655237
    //   2751: l2i
    //   2752: ldc_w 903326171
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 31565, -1032094858 -> 2784, 9773225 -> 2740
    //   2784: goto -> 2788
    //   2787: athrow
    //   2788: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   2791: goto -> 2795
    //   2794: athrow
    //   2795: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   2800: getstatic Perryc.c : I
    //   2803: iflt -> 2817
    //   2806: ldc2_w 1775081690
    //   2809: l2i
    //   2810: ldc_w -916744534
    //   2813: ixor
    //   2814: goto -> 2825
    //   2817: ldc2_w -673617476
    //   2820: l2i
    //   2821: ldc_w 1964398340
    //   2824: ixor
    //   2825: ldc2_w -94595577
    //   2828: l2i
    //   2829: ldc_w -50487628
    //   2832: ixor
    //   2833: ixor
    //   2834: lookupswitch default -> 2860, -1506343229 -> 31183, 1685648770 -> 2817
    //   2860: goto -> 2864
    //   2863: athrow
    //   2864: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   2869: goto -> 2873
    //   2872: athrow
    //   2873: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   2878: getstatic Perryc.0 : I
    //   2881: ifle -> 2895
    //   2884: ldc2_w -2145277873
    //   2887: l2i
    //   2888: ldc_w 1675797646
    //   2891: ixor
    //   2892: goto -> 2903
    //   2895: ldc2_w 916054783
    //   2898: l2i
    //   2899: ldc_w -622293107
    //   2902: ixor
    //   2903: ldc2_w 1984911369
    //   2906: l2i
    //   2907: ldc_w -932906684
    //   2910: ixor
    //   2911: ixor
    //   2912: lookupswitch default -> 31043, 1381682239 -> 2940, 1575529868 -> 2895
    //   2940: goto -> 2944
    //   2943: athrow
    //   2944: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   2949: goto -> 2953
    //   2952: athrow
    //   2953: getstatic Perryc.c : I
    //   2956: iflt -> 2970
    //   2959: ldc2_w 1814080506
    //   2962: l2i
    //   2963: ldc_w 1492596087
    //   2966: ixor
    //   2967: goto -> 2978
    //   2970: ldc2_w -1569711176
    //   2973: l2i
    //   2974: ldc_w -568869635
    //   2977: ixor
    //   2978: ldc2_w -2018414883
    //   2981: l2i
    //   2982: ldc_w -575943505
    //   2985: ixor
    //   2986: ixor
    //   2987: lookupswitch default -> 30839, 645727543 -> 3012, 1858944255 -> 2970
    //   3012: goto -> 3016
    //   3015: athrow
    //   3016: invokeinterface sum : ()I
    //   3021: goto -> 3025
    //   3024: athrow
    //   3025: getstatic Perryc.c : I
    //   3028: iflt -> 3042
    //   3031: ldc2_w 2007752409
    //   3034: l2i
    //   3035: ldc_w 246727852
    //   3038: ixor
    //   3039: goto -> 3050
    //   3042: ldc2_w -35810227
    //   3045: l2i
    //   3046: ldc_w -1824298068
    //   3049: ixor
    //   3050: ldc2_w -802418533
    //   3053: l2i
    //   3054: ldc_w -1845678571
    //   3057: ixor
    //   3058: ixor
    //   3059: lookupswitch default -> 31003, 793756015 -> 3084, 953033979 -> 3042
    //   3084: goto -> 3088
    //   3087: athrow
    //   3088: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3091: goto -> 3095
    //   3094: athrow
    //   3095: getstatic Perryc.1 : I
    //   3098: ifeq -> 3112
    //   3101: ldc2_w -1847604998
    //   3104: l2i
    //   3105: ldc_w 181628762
    //   3108: ixor
    //   3109: goto -> 3120
    //   3112: ldc2_w 1509321377
    //   3115: l2i
    //   3116: ldc_w 1521679798
    //   3119: ixor
    //   3120: ldc2_w 1986971269
    //   3123: l2i
    //   3124: ldc_w -788682904
    //   3127: ixor
    //   3128: ixor
    //   3129: lookupswitch default -> 30849, -1512573190 -> 3156, 1033881165 -> 3112
    //   3156: goto -> 3160
    //   3159: athrow
    //   3160: invokevirtual toString : ()Ljava/lang/String;
    //   3163: goto -> 3167
    //   3166: athrow
    //   3167: getstatic Perryc.0 : I
    //   3170: ifle -> 3184
    //   3173: ldc2_w 1583481522
    //   3176: l2i
    //   3177: ldc_w 623012488
    //   3180: ixor
    //   3181: goto -> 3192
    //   3184: ldc2_w 1982180884
    //   3187: l2i
    //   3188: ldc_w 1474690387
    //   3191: ixor
    //   3192: ldc2_w -1508829241
    //   3195: l2i
    //   3196: ldc_w 972632887
    //   3199: ixor
    //   3200: ixor
    //   3201: lookupswitch default -> 30949, -1104644169 -> 3228, -458732342 -> 3184
    //   3228: astore #6
    //   3230: new java/lang/StringBuilder
    //   3233: dup
    //   3234: getstatic Perryc.0 : I
    //   3237: ifle -> 3251
    //   3240: ldc2_w 266143154
    //   3243: l2i
    //   3244: ldc_w 741223210
    //   3247: ixor
    //   3248: goto -> 3259
    //   3251: ldc2_w -1214485637
    //   3254: l2i
    //   3255: ldc_w 1809317353
    //   3258: ixor
    //   3259: ldc2_w -1082297318
    //   3262: l2i
    //   3263: ldc_w -1986252976
    //   3266: ixor
    //   3267: ixor
    //   3268: lookupswitch default -> 3296, 353531346 -> 31061, 1611487698 -> 3251
    //   3296: goto -> 3300
    //   3299: athrow
    //   3300: invokespecial <init> : ()V
    //   3303: goto -> 3307
    //   3306: athrow
    //   3307: ldc_w '겳㌋곬拸䂠'
    //   3310: getstatic Perryc.c : I
    //   3313: iflt -> 3327
    //   3316: ldc2_w 1865095252
    //   3319: l2i
    //   3320: ldc_w 885282339
    //   3323: ixor
    //   3324: goto -> 3335
    //   3327: ldc2_w 925847428
    //   3330: l2i
    //   3331: ldc_w 749289904
    //   3334: ixor
    //   3335: ldc2_w -1017741769
    //   3338: l2i
    //   3339: ldc_w -1404193168
    //   3342: ixor
    //   3343: ixor
    //   3344: lookupswitch default -> 3372, -370405304 -> 3327, 888440368 -> 31239
    //   3372: goto -> 3376
    //   3375: athrow
    //   3376: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3379: goto -> 3383
    //   3382: athrow
    //   3383: getstatic Perryc.1 : I
    //   3386: ifeq -> 3400
    //   3389: ldc2_w -671850243
    //   3392: l2i
    //   3393: ldc_w 1048663476
    //   3396: ixor
    //   3397: goto -> 3408
    //   3400: ldc2_w 1745696438
    //   3403: l2i
    //   3404: ldc_w -594710316
    //   3407: ixor
    //   3408: ldc2_w -1459449281
    //   3411: l2i
    //   3412: ldc_w 432749922
    //   3415: ixor
    //   3416: ixor
    //   3417: lookupswitch default -> 31247, 71952703 -> 3444, 1505532436 -> 3400
    //   3444: goto -> 3448
    //   3447: athrow
    //   3448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3451: goto -> 3455
    //   3454: athrow
    //   3455: getstatic Perryc.0 : I
    //   3458: ifle -> 3472
    //   3461: ldc2_w -1208398421
    //   3464: l2i
    //   3465: ldc_w -2074831899
    //   3468: ixor
    //   3469: goto -> 3480
    //   3472: ldc2_w 204436219
    //   3475: l2i
    //   3476: ldc_w 502403231
    //   3479: ixor
    //   3480: ldc2_w -2082872904
    //   3483: l2i
    //   3484: ldc_w -734956993
    //   3487: ixor
    //   3488: ixor
    //   3489: lookupswitch default -> 3516, 475981011 -> 3472, 1682263497 -> 31191
    //   3516: getstatic bigname/zprestige/webhack/features/modules/Hud/Info.mc : Lnet/minecraft/client/Minecraft;
    //   3519: getstatic Perryc.1 : I
    //   3522: ifeq -> 3536
    //   3525: ldc2_w 1704329522
    //   3528: l2i
    //   3529: ldc_w -205612631
    //   3532: ixor
    //   3533: goto -> 3544
    //   3536: ldc2_w -1973576588
    //   3539: l2i
    //   3540: ldc_w 385350900
    //   3543: ixor
    //   3544: ldc2_w -338139282
    //   3547: l2i
    //   3548: ldc_w 1504351031
    //   3551: ixor
    //   3552: ixor
    //   3553: lookupswitch default -> 31505, 609905858 -> 3536, 785945817 -> 3580
    //   3580: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3583: getstatic Perryc.c : I
    //   3586: iflt -> 3600
    //   3589: ldc2_w 350015201
    //   3592: l2i
    //   3593: ldc_w 2013621751
    //   3596: ixor
    //   3597: goto -> 3608
    //   3600: ldc2_w -1364810979
    //   3603: l2i
    //   3604: ldc_w 931864194
    //   3607: ixor
    //   3608: ldc2_w -1248952134
    //   3611: l2i
    //   3612: ldc_w -239406460
    //   3615: ixor
    //   3616: ixor
    //   3617: lookupswitch default -> 3644, 543134382 -> 3600, 686674216 -> 31091
    //   3644: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   3647: getstatic Perryc.c : I
    //   3650: iflt -> 3664
    //   3653: ldc2_w 583390559
    //   3656: l2i
    //   3657: ldc_w 1069021343
    //   3660: ixor
    //   3661: goto -> 3672
    //   3664: ldc2_w 66423448
    //   3667: l2i
    //   3668: ldc_w -1803134842
    //   3671: ixor
    //   3672: ldc2_w -611598507
    //   3675: l2i
    //   3676: ldc_w 128087710
    //   3679: ixor
    //   3680: ixor
    //   3681: lookupswitch default -> 30871, -1050942453 -> 3664, 1264196565 -> 3708
    //   3708: getfield field_70462_a : Lnet/minecraft/util/NonNullList;
    //   3711: getstatic Perryc.1 : I
    //   3714: ifeq -> 3728
    //   3717: ldc2_w -1016993849
    //   3720: l2i
    //   3721: ldc_w 1703172790
    //   3724: ixor
    //   3725: goto -> 3736
    //   3728: ldc2_w -1247316818
    //   3731: l2i
    //   3732: ldc_w -1959752620
    //   3735: ixor
    //   3736: ldc2_w -2105263661
    //   3739: l2i
    //   3740: ldc_w 926492145
    //   3743: ixor
    //   3744: ixor
    //   3745: lookupswitch default -> 3772, 324575571 -> 31349, 1024667037 -> 3728
    //   3772: goto -> 3776
    //   3775: athrow
    //   3776: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   3779: goto -> 3783
    //   3782: athrow
    //   3783: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   3788: getstatic Perryc.1 : I
    //   3791: ifeq -> 3805
    //   3794: ldc2_w 1823355736
    //   3797: l2i
    //   3798: ldc_w -25597275
    //   3801: ixor
    //   3802: goto -> 3813
    //   3805: ldc2_w -1927018500
    //   3808: l2i
    //   3809: ldc_w -910238874
    //   3812: ixor
    //   3813: ldc2_w 1087237520
    //   3816: l2i
    //   3817: ldc_w 1466904919
    //   3820: ixor
    //   3821: ixor
    //   3822: lookupswitch default -> 3848, -2055895750 -> 31095, 1022703275 -> 3805
    //   3848: goto -> 3852
    //   3851: athrow
    //   3852: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   3857: goto -> 3861
    //   3860: athrow
    //   3861: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   3866: getstatic Perryc.1 : I
    //   3869: ifeq -> 3883
    //   3872: ldc2_w 1510639231
    //   3875: l2i
    //   3876: ldc_w -29925281
    //   3879: ixor
    //   3880: goto -> 3891
    //   3883: ldc2_w 62363740
    //   3886: l2i
    //   3887: ldc_w -504897203
    //   3890: ixor
    //   3891: ldc2_w 1988145479
    //   3894: l2i
    //   3895: ldc_w 832714354
    //   3898: ixor
    //   3899: ixor
    //   3900: lookupswitch default -> 30843, -1519190492 -> 3928, -484482795 -> 3883
    //   3928: goto -> 3932
    //   3931: athrow
    //   3932: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   3937: goto -> 3941
    //   3940: athrow
    //   3941: getstatic Perryc.0 : I
    //   3944: ifle -> 3958
    //   3947: ldc2_w -735678548
    //   3950: l2i
    //   3951: ldc_w 1772511149
    //   3954: ixor
    //   3955: goto -> 3966
    //   3958: ldc2_w 194255282
    //   3961: l2i
    //   3962: ldc_w -1840361512
    //   3965: ixor
    //   3966: ldc2_w 1708358547
    //   3969: l2i
    //   3970: ldc_w -187829191
    //   3973: ixor
    //   3974: ixor
    //   3975: lookupswitch default -> 31307, 147118528 -> 4000, 748601259 -> 3958
    //   4000: goto -> 4004
    //   4003: athrow
    //   4004: invokeinterface sum : ()I
    //   4009: goto -> 4013
    //   4012: athrow
    //   4013: getstatic Perryc.0 : I
    //   4016: ifle -> 4030
    //   4019: ldc2_w 982788871
    //   4022: l2i
    //   4023: ldc_w -522782465
    //   4026: ixor
    //   4027: goto -> 4038
    //   4030: ldc2_w 1679480429
    //   4033: l2i
    //   4034: ldc_w -1136402271
    //   4037: ixor
    //   4038: ldc2_w -684290287
    //   4041: l2i
    //   4042: ldc_w -1097211720
    //   4045: ixor
    //   4046: ixor
    //   4047: lookupswitch default -> 31087, -1309255323 -> 4072, -1276265391 -> 4030
    //   4072: goto -> 4076
    //   4075: athrow
    //   4076: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4079: goto -> 4083
    //   4082: athrow
    //   4083: getstatic Perryc.0 : I
    //   4086: ifle -> 4100
    //   4089: ldc2_w -1396896303
    //   4092: l2i
    //   4093: ldc_w 762781962
    //   4096: ixor
    //   4097: goto -> 4108
    //   4100: ldc2_w -1141908836
    //   4103: l2i
    //   4104: ldc_w 654547088
    //   4107: ixor
    //   4108: ldc2_w 395305778
    //   4111: l2i
    //   4112: ldc_w 179563470
    //   4115: ixor
    //   4116: ixor
    //   4117: lookupswitch default -> 31021, -2117055760 -> 4144, -1661590489 -> 4100
    //   4144: goto -> 4148
    //   4147: athrow
    //   4148: invokevirtual toString : ()Ljava/lang/String;
    //   4151: goto -> 4155
    //   4154: athrow
    //   4155: getstatic Perryc.0 : I
    //   4158: ifle -> 4172
    //   4161: ldc2_w 606360752
    //   4164: l2i
    //   4165: ldc_w 1445596542
    //   4168: ixor
    //   4169: goto -> 4180
    //   4172: ldc2_w -1648339688
    //   4175: l2i
    //   4176: ldc_w 267513517
    //   4179: ixor
    //   4180: ldc2_w -2096038512
    //   4183: l2i
    //   4184: ldc_w -308690472
    //   4187: ixor
    //   4188: ixor
    //   4189: lookupswitch default -> 4216, -448794064 -> 4172, 478635398 -> 30797
    //   4216: astore #7
    //   4218: new java/lang/StringBuilder
    //   4221: dup
    //   4222: getstatic Perryc.1 : I
    //   4225: ifeq -> 4239
    //   4228: ldc2_w 582356409
    //   4231: l2i
    //   4232: ldc_w -356503491
    //   4235: ixor
    //   4236: goto -> 4247
    //   4239: ldc2_w -45292915
    //   4242: l2i
    //   4243: ldc_w 407962213
    //   4246: ixor
    //   4247: ldc2_w -188483067
    //   4250: l2i
    //   4251: ldc_w 1222087385
    //   4254: ixor
    //   4255: ixor
    //   4256: lookupswitch default -> 4284, 1224617325 -> 4239, 1952601432 -> 31545
    //   4284: goto -> 4288
    //   4287: athrow
    //   4288: invokespecial <init> : ()V
    //   4291: goto -> 4295
    //   4294: athrow
    //   4295: ldc_w '겱㌒곬抲䃬䈯๪텡턶'
    //   4298: getstatic Perryc.1 : I
    //   4301: ifeq -> 4315
    //   4304: ldc2_w 665471166
    //   4307: l2i
    //   4308: ldc_w -1239505924
    //   4311: ixor
    //   4312: goto -> 4323
    //   4315: ldc2_w 965630821
    //   4318: l2i
    //   4319: ldc_w 1296139081
    //   4322: ixor
    //   4323: ldc2_w -2046431104
    //   4326: l2i
    //   4327: ldc_w -1476584114
    //   4330: ixor
    //   4331: ixor
    //   4332: lookupswitch default -> 4360, -1337194868 -> 31101, -1226446879 -> 4315
    //   4360: goto -> 4364
    //   4363: athrow
    //   4364: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4367: goto -> 4371
    //   4370: athrow
    //   4371: getstatic Perryc.1 : I
    //   4374: ifeq -> 4388
    //   4377: ldc2_w -371873083
    //   4380: l2i
    //   4381: ldc_w -1868254730
    //   4384: ixor
    //   4385: goto -> 4396
    //   4388: ldc2_w -401151228
    //   4391: l2i
    //   4392: ldc_w -1679963443
    //   4395: ixor
    //   4396: ldc2_w -145499532
    //   4399: l2i
    //   4400: ldc_w -57033421
    //   4403: ixor
    //   4404: ixor
    //   4405: lookupswitch default -> 31193, 1924889716 -> 4388, 2013349518 -> 4432
    //   4432: goto -> 4436
    //   4435: athrow
    //   4436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4439: goto -> 4443
    //   4442: athrow
    //   4443: getstatic Perryc.0 : I
    //   4446: ifle -> 4460
    //   4449: ldc2_w -1993737925
    //   4452: l2i
    //   4453: ldc_w 1341661864
    //   4456: ixor
    //   4457: goto -> 4468
    //   4460: ldc2_w 510190703
    //   4463: l2i
    //   4464: ldc_w 1050542719
    //   4467: ixor
    //   4468: ldc2_w -2111970846
    //   4471: l2i
    //   4472: ldc_w -57422374
    //   4475: ixor
    //   4476: ixor
    //   4477: lookupswitch default -> 31093, -1201670229 -> 4460, 1584974376 -> 4504
    //   4504: getstatic bigname/zprestige/webhack/features/modules/Hud/Info.mc : Lnet/minecraft/client/Minecraft;
    //   4507: getstatic Perryc.0 : I
    //   4510: ifle -> 4524
    //   4513: ldc2_w 2062199048
    //   4516: l2i
    //   4517: ldc_w -1587624670
    //   4520: ixor
    //   4521: goto -> 4532
    //   4524: ldc2_w -1035317295
    //   4527: l2i
    //   4528: ldc_w 148106026
    //   4531: ixor
    //   4532: ldc2_w 1065692792
    //   4535: l2i
    //   4536: ldc_w 1997336623
    //   4539: ixor
    //   4540: ixor
    //   4541: lookupswitch default -> 31329, -2112849236 -> 4568, -1824673155 -> 4524
    //   4568: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4571: getstatic Perryc.c : I
    //   4574: iflt -> 4588
    //   4577: ldc2_w 1777297974
    //   4580: l2i
    //   4581: ldc_w -1483996865
    //   4584: ixor
    //   4585: goto -> 4596
    //   4588: ldc2_w -259195866
    //   4591: l2i
    //   4592: ldc_w -162876998
    //   4595: ixor
    //   4596: ldc2_w -805502068
    //   4599: l2i
    //   4600: ldc_w 1120143908
    //   4603: ixor
    //   4604: ixor
    //   4605: lookupswitch default -> 4632, 589060303 -> 4588, 1129996961 -> 31479
    //   4632: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   4635: getstatic Perryc.0 : I
    //   4638: ifle -> 4652
    //   4641: ldc2_w -1203854854
    //   4644: l2i
    //   4645: ldc_w 72779977
    //   4648: ixor
    //   4649: goto -> 4660
    //   4652: ldc2_w -415139139
    //   4655: l2i
    //   4656: ldc_w -1981540301
    //   4659: ixor
    //   4660: ldc2_w 987855820
    //   4663: l2i
    //   4664: ldc_w -488267730
    //   4667: ixor
    //   4668: ixor
    //   4669: lookupswitch default -> 4696, -2086115811 -> 4652, 1684861649 -> 31145
    //   4696: getfield field_70462_a : Lnet/minecraft/util/NonNullList;
    //   4699: getstatic Perryc.1 : I
    //   4702: ifeq -> 4716
    //   4705: ldc2_w -1949939175
    //   4708: l2i
    //   4709: ldc_w -608233489
    //   4712: ixor
    //   4713: goto -> 4724
    //   4716: ldc2_w 1523252624
    //   4719: l2i
    //   4720: ldc_w -1238165654
    //   4723: ixor
    //   4724: ldc2_w -1526105025
    //   4727: l2i
    //   4728: ldc_w 1522637102
    //   4731: ixor
    //   4732: ixor
    //   4733: lookupswitch default -> 4760, -1347307289 -> 31553, -1088940373 -> 4716
    //   4760: goto -> 4764
    //   4763: athrow
    //   4764: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   4767: goto -> 4771
    //   4770: athrow
    //   4771: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   4776: getstatic Perryc.1 : I
    //   4779: ifeq -> 4793
    //   4782: ldc2_w -2024699044
    //   4785: l2i
    //   4786: ldc_w 4934832
    //   4789: ixor
    //   4790: goto -> 4801
    //   4793: ldc2_w -112079423
    //   4796: l2i
    //   4797: ldc_w 723910468
    //   4800: ixor
    //   4801: ldc2_w 910832224
    //   4804: l2i
    //   4805: ldc_w -738615924
    //   4808: ixor
    //   4809: ixor
    //   4810: lookupswitch default -> 31577, 935828841 -> 4836, 1655269376 -> 4793
    //   4836: goto -> 4840
    //   4839: athrow
    //   4840: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   4845: goto -> 4849
    //   4848: athrow
    //   4849: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   4854: getstatic Perryc.c : I
    //   4857: iflt -> 4871
    //   4860: ldc2_w -185402759
    //   4863: l2i
    //   4864: ldc_w 162549457
    //   4867: ixor
    //   4868: goto -> 4879
    //   4871: ldc2_w -1342635480
    //   4874: l2i
    //   4875: ldc_w -1787988291
    //   4878: ixor
    //   4879: ldc2_w 456392961
    //   4882: l2i
    //   4883: ldc_w -1181992341
    //   4886: ixor
    //   4887: ixor
    //   4888: lookupswitch default -> 4916, -1004246033 -> 4871, 1610256322 -> 31491
    //   4916: goto -> 4920
    //   4919: athrow
    //   4920: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   4925: goto -> 4929
    //   4928: athrow
    //   4929: getstatic Perryc.c : I
    //   4932: iflt -> 4946
    //   4935: ldc2_w -205786388
    //   4938: l2i
    //   4939: ldc_w -650968046
    //   4942: ixor
    //   4943: goto -> 4954
    //   4946: ldc2_w 1544135442
    //   4949: l2i
    //   4950: ldc_w -1673792197
    //   4953: ixor
    //   4954: ldc2_w -1024926829
    //   4957: l2i
    //   4958: ldc_w -799138333
    //   4961: ixor
    //   4962: ixor
    //   4963: lookupswitch default -> 4988, -1299853947 -> 4946, 943599758 -> 31187
    //   4988: goto -> 4992
    //   4991: athrow
    //   4992: invokeinterface sum : ()I
    //   4997: goto -> 5001
    //   5000: athrow
    //   5001: getstatic Perryc.c : I
    //   5004: iflt -> 5018
    //   5007: ldc2_w 99882290
    //   5010: l2i
    //   5011: ldc_w 1630832875
    //   5014: ixor
    //   5015: goto -> 5026
    //   5018: ldc2_w -1807301868
    //   5021: l2i
    //   5022: ldc_w 831480671
    //   5025: ixor
    //   5026: ldc2_w -512935249
    //   5029: l2i
    //   5030: ldc_w -1652049788
    //   5033: ixor
    //   5034: ixor
    //   5035: lookupswitch default -> 30971, -652008864 -> 5060, 405413874 -> 5018
    //   5060: goto -> 5064
    //   5063: athrow
    //   5064: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   5067: goto -> 5071
    //   5070: athrow
    //   5071: getstatic Perryc.c : I
    //   5074: iflt -> 5088
    //   5077: ldc2_w 1926936075
    //   5080: l2i
    //   5081: ldc_w -800628058
    //   5084: ixor
    //   5085: goto -> 5096
    //   5088: ldc2_w -1441341298
    //   5091: l2i
    //   5092: ldc_w 710919255
    //   5095: ixor
    //   5096: ldc2_w 511570614
    //   5099: l2i
    //   5100: ldc_w -1546963704
    //   5103: ixor
    //   5104: ixor
    //   5105: lookupswitch default -> 5132, -2106224936 -> 5088, 522916627 -> 30853
    //   5132: goto -> 5136
    //   5135: athrow
    //   5136: invokevirtual toString : ()Ljava/lang/String;
    //   5139: goto -> 5143
    //   5142: athrow
    //   5143: getstatic Perryc.1 : I
    //   5146: ifeq -> 5160
    //   5149: ldc2_w -2051715891
    //   5152: l2i
    //   5153: ldc_w -1193550115
    //   5156: ixor
    //   5157: goto -> 5168
    //   5160: ldc2_w -1403509880
    //   5163: l2i
    //   5164: ldc_w 510768939
    //   5167: ixor
    //   5168: ldc2_w 735968596
    //   5171: l2i
    //   5172: ldc_w 1956552454
    //   5175: ixor
    //   5176: ixor
    //   5177: lookupswitch default -> 5204, 125910672 -> 5160, 1647177794 -> 31559
    //   5204: astore #8
    //   5206: new java/lang/StringBuilder
    //   5209: dup
    //   5210: getstatic Perryc.1 : I
    //   5213: ifeq -> 5227
    //   5216: ldc2_w 302133843
    //   5219: l2i
    //   5220: ldc_w 808299157
    //   5223: ixor
    //   5224: goto -> 5235
    //   5227: ldc2_w 786011014
    //   5230: l2i
    //   5231: ldc_w 1321710484
    //   5234: ixor
    //   5235: ldc2_w 274798890
    //   5238: l2i
    //   5239: ldc_w 2126280193
    //   5242: ixor
    //   5243: ixor
    //   5244: lookupswitch default -> 31413, 247680825 -> 5272, 1290991597 -> 5227
    //   5272: goto -> 5276
    //   5275: athrow
    //   5276: invokespecial <init> : ()V
    //   5279: goto -> 5283
    //   5282: athrow
    //   5283: ldc_w '겢㌚곱抧䂺䉪'
    //   5286: getstatic Perryc.0 : I
    //   5289: ifle -> 5303
    //   5292: ldc2_w -2016086889
    //   5295: l2i
    //   5296: ldc_w 1039559765
    //   5299: ixor
    //   5300: goto -> 5311
    //   5303: ldc2_w 505950129
    //   5306: l2i
    //   5307: ldc_w 385098691
    //   5310: ixor
    //   5311: ldc2_w 1625529000
    //   5314: l2i
    //   5315: ldc_w 59799514
    //   5318: ixor
    //   5319: ixor
    //   5320: lookupswitch default -> 5348, -1293176196 -> 5303, -648972880 -> 31561
    //   5348: goto -> 5352
    //   5351: athrow
    //   5352: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5355: goto -> 5359
    //   5358: athrow
    //   5359: getstatic Perryc.0 : I
    //   5362: ifle -> 5376
    //   5365: ldc2_w -1530753806
    //   5368: l2i
    //   5369: ldc_w 2029949941
    //   5372: ixor
    //   5373: goto -> 5384
    //   5376: ldc2_w 1693417742
    //   5379: l2i
    //   5380: ldc_w 1919000542
    //   5383: ixor
    //   5384: ldc2_w 756420273
    //   5387: l2i
    //   5388: ldc_w -2065003516
    //   5391: ixor
    //   5392: ixor
    //   5393: lookupswitch default -> 31223, -1083007899 -> 5420, 1975557554 -> 5376
    //   5420: goto -> 5424
    //   5423: athrow
    //   5424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5427: goto -> 5431
    //   5430: athrow
    //   5431: new java/text/SimpleDateFormat
    //   5434: dup
    //   5435: ldc_w '겞㍉곱抯䂠䈫'
    //   5438: getstatic Perryc.0 : I
    //   5441: ifle -> 5455
    //   5444: ldc2_w 1086326675
    //   5447: l2i
    //   5448: ldc_w 1806176899
    //   5451: ixor
    //   5452: goto -> 5463
    //   5455: ldc2_w -23985847
    //   5458: l2i
    //   5459: ldc_w 617103670
    //   5462: ixor
    //   5463: ldc2_w -1383114737
    //   5466: l2i
    //   5467: ldc_w 288151448
    //   5470: ixor
    //   5471: ixor
    //   5472: lookupswitch default -> 5500, -1748264313 -> 31055, -178249428 -> 5455
    //   5500: goto -> 5504
    //   5503: athrow
    //   5504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5507: goto -> 5511
    //   5510: athrow
    //   5511: getstatic Perryc.0 : I
    //   5514: ifle -> 5528
    //   5517: ldc2_w -1874554080
    //   5520: l2i
    //   5521: ldc_w 1238857718
    //   5524: ixor
    //   5525: goto -> 5536
    //   5528: ldc2_w -1188683769
    //   5531: l2i
    //   5532: ldc_w -1300921699
    //   5535: ixor
    //   5536: ldc2_w 1368468584
    //   5539: l2i
    //   5540: ldc_w 528965571
    //   5543: ixor
    //   5544: ixor
    //   5545: lookupswitch default -> 31335, -1752852611 -> 5528, 1162203441 -> 5572
    //   5572: goto -> 5576
    //   5575: athrow
    //   5576: invokespecial <init> : (Ljava/lang/String;)V
    //   5579: goto -> 5583
    //   5582: athrow
    //   5583: new java/util/Date
    //   5586: dup
    //   5587: getstatic Perryc.0 : I
    //   5590: ifle -> 5604
    //   5593: ldc2_w -1987125093
    //   5596: l2i
    //   5597: ldc_w -1164352973
    //   5600: ixor
    //   5601: goto -> 5612
    //   5604: ldc2_w -1912520194
    //   5607: l2i
    //   5608: ldc_w -248751621
    //   5611: ixor
    //   5612: ldc2_w 363266803
    //   5615: l2i
    //   5616: ldc_w -1339890281
    //   5619: ixor
    //   5620: ixor
    //   5621: lookupswitch default -> 30917, -1768790580 -> 5604, -626458783 -> 5648
    //   5648: goto -> 5652
    //   5651: athrow
    //   5652: invokespecial <init> : ()V
    //   5655: goto -> 5659
    //   5658: athrow
    //   5659: getstatic Perryc.0 : I
    //   5662: ifle -> 5676
    //   5665: ldc2_w -1919329647
    //   5668: l2i
    //   5669: ldc_w -483701873
    //   5672: ixor
    //   5673: goto -> 5684
    //   5676: ldc2_w 1883372037
    //   5679: l2i
    //   5680: ldc_w -1690580890
    //   5683: ixor
    //   5684: ldc2_w 604339119
    //   5687: l2i
    //   5688: ldc_w 506695194
    //   5691: ixor
    //   5692: ixor
    //   5693: lookupswitch default -> 5720, 1134892600 -> 5676, 1417995435 -> 31153
    //   5720: goto -> 5724
    //   5723: athrow
    //   5724: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   5727: goto -> 5731
    //   5730: athrow
    //   5731: getstatic Perryc.1 : I
    //   5734: ifeq -> 5748
    //   5737: ldc2_w 1795824349
    //   5740: l2i
    //   5741: ldc_w 1599236205
    //   5744: ixor
    //   5745: goto -> 5756
    //   5748: ldc2_w 2141120518
    //   5751: l2i
    //   5752: ldc_w 1805113996
    //   5755: ixor
    //   5756: ldc2_w 1363522964
    //   5759: l2i
    //   5760: ldc_w -536249494
    //   5763: ixor
    //   5764: ixor
    //   5765: lookupswitch default -> 30955, -2062238642 -> 5748, -1522140044 -> 5792
    //   5792: goto -> 5796
    //   5795: athrow
    //   5796: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5799: goto -> 5803
    //   5802: athrow
    //   5803: getstatic Perryc.1 : I
    //   5806: ifeq -> 5820
    //   5809: ldc2_w 597591263
    //   5812: l2i
    //   5813: ldc_w 37943701
    //   5816: ixor
    //   5817: goto -> 5828
    //   5820: ldc2_w -1235023438
    //   5823: l2i
    //   5824: ldc_w 828522221
    //   5827: ixor
    //   5828: ldc2_w -630352161
    //   5831: l2i
    //   5832: ldc_w 776398880
    //   5835: ixor
    //   5836: ixor
    //   5837: lookupswitch default -> 5864, -705231947 -> 31379, 557149416 -> 5820
    //   5864: goto -> 5868
    //   5867: athrow
    //   5868: invokevirtual toString : ()Ljava/lang/String;
    //   5871: goto -> 5875
    //   5874: athrow
    //   5875: getstatic Perryc.0 : I
    //   5878: ifle -> 5892
    //   5881: ldc2_w 81506668
    //   5884: l2i
    //   5885: ldc_w 86928976
    //   5888: ixor
    //   5889: goto -> 5900
    //   5892: ldc2_w 743780020
    //   5895: l2i
    //   5896: ldc_w -933174209
    //   5899: ixor
    //   5900: ldc2_w -13121338
    //   5903: l2i
    //   5904: ldc_w -2099753493
    //   5907: ixor
    //   5908: ixor
    //   5909: lookupswitch default -> 31389, -1713746010 -> 5936, 2082101777 -> 5892
    //   5936: astore #9
    //   5938: getstatic Perryc.0 : I
    //   5941: ifle -> 5955
    //   5944: ldc2_w -145942840
    //   5947: l2i
    //   5948: ldc_w 1870524779
    //   5951: ixor
    //   5952: goto -> 5963
    //   5955: ldc2_w 2102423569
    //   5958: l2i
    //   5959: ldc_w 1943966825
    //   5962: ixor
    //   5963: ldc2_w 2085540889
    //   5966: l2i
    //   5967: ldc_w -573470886
    //   5970: ixor
    //   5971: ixor
    //   5972: lookupswitch default -> 31481, -1357793477 -> 6000, 967816416 -> 5955
    //   6000: aload_0
    //   6001: getstatic Perryc.0 : I
    //   6004: ifle -> 6018
    //   6007: ldc2_w -720182425
    //   6010: l2i
    //   6011: ldc_w 561038152
    //   6014: ixor
    //   6015: goto -> 6026
    //   6018: ldc2_w 1039917038
    //   6021: l2i
    //   6022: ldc_w -1479226271
    //   6025: ixor
    //   6026: ldc2_w 1470637481
    //   6029: l2i
    //   6030: ldc_w -394114636
    //   6033: ixor
    //   6034: ixor
    //   6035: lookupswitch default -> 6060, -1538327192 -> 6018, 1263029298 -> 31455
    //   6060: goto -> 6064
    //   6063: athrow
    //   6064: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   6067: goto -> 6071
    //   6070: athrow
    //   6071: getstatic Perryc.1 : I
    //   6074: ifeq -> 6088
    //   6077: ldc2_w -636619449
    //   6080: l2i
    //   6081: ldc_w 1059981203
    //   6084: ixor
    //   6085: goto -> 6096
    //   6088: ldc2_w -1672599291
    //   6091: l2i
    //   6092: ldc_w 1463689240
    //   6095: ixor
    //   6096: ldc2_w 1541033097
    //   6099: l2i
    //   6100: ldc_w -602714782
    //   6103: ixor
    //   6104: ixor
    //   6105: lookupswitch default -> 31049, 1287194870 -> 6132, 1659564863 -> 6088
    //   6132: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6135: getstatic Perryc.1 : I
    //   6138: ifeq -> 6152
    //   6141: ldc2_w -749931389
    //   6144: l2i
    //   6145: ldc_w 1540122642
    //   6148: ixor
    //   6149: goto -> 6160
    //   6152: ldc2_w 300943532
    //   6155: l2i
    //   6156: ldc_w 319182465
    //   6159: ixor
    //   6160: ldc2_w -1832158600
    //   6163: l2i
    //   6164: ldc_w -121876047
    //   6167: ixor
    //   6168: ixor
    //   6169: lookupswitch default -> 31471, -487082152 -> 6152, 1753314788 -> 6196
    //   6196: goto -> 6200
    //   6199: athrow
    //   6200: invokevirtual getValue : ()Ljava/lang/Object;
    //   6203: goto -> 6207
    //   6206: athrow
    //   6207: checkcast java/lang/Integer
    //   6210: getstatic Perryc.c : I
    //   6213: iflt -> 6227
    //   6216: ldc2_w 1279144761
    //   6219: l2i
    //   6220: ldc_w 1639365090
    //   6223: ixor
    //   6224: goto -> 6235
    //   6227: ldc2_w 845475834
    //   6230: l2i
    //   6231: ldc_w -708181393
    //   6234: ixor
    //   6235: ldc2_w 1841307277
    //   6238: l2i
    //   6239: ldc_w 1870020452
    //   6242: ixor
    //   6243: ixor
    //   6244: lookupswitch default -> 31605, -451359620 -> 6272, 792636210 -> 6227
    //   6272: goto -> 6276
    //   6275: athrow
    //   6276: invokevirtual intValue : ()I
    //   6279: goto -> 6283
    //   6282: athrow
    //   6283: getstatic Perryc.0 : I
    //   6286: ifle -> 6300
    //   6289: ldc2_w -996594066
    //   6292: l2i
    //   6293: ldc_w 1937955781
    //   6296: ixor
    //   6297: goto -> 6308
    //   6300: ldc2_w -1881763276
    //   6303: l2i
    //   6304: ldc_w 72822545
    //   6307: ixor
    //   6308: ldc2_w 1619951234
    //   6311: l2i
    //   6312: ldc_w -1660304138
    //   6315: ixor
    //   6316: ixor
    //   6317: lookupswitch default -> 30777, 1251758047 -> 6300, 1980106577 -> 6344
    //   6344: goto -> 6348
    //   6347: athrow
    //   6348: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   6351: goto -> 6355
    //   6354: athrow
    //   6355: getstatic Perryc.0 : I
    //   6358: ifle -> 6372
    //   6361: ldc2_w -1133172921
    //   6364: l2i
    //   6365: ldc_w -420917897
    //   6368: ixor
    //   6369: goto -> 6380
    //   6372: ldc2_w 305534342
    //   6375: l2i
    //   6376: ldc_w 819301838
    //   6379: ixor
    //   6380: ldc2_w -1467492888
    //   6383: l2i
    //   6384: ldc_w 1620433025
    //   6387: ixor
    //   6388: ixor
    //   6389: lookupswitch default -> 31465, -1836161191 -> 6372, -353266399 -> 6416
    //   6416: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6419: getstatic Perryc.c : I
    //   6422: iflt -> 6436
    //   6425: ldc2_w 524029695
    //   6428: l2i
    //   6429: ldc_w 1243197853
    //   6432: ixor
    //   6433: goto -> 6444
    //   6436: ldc2_w -1408001270
    //   6439: l2i
    //   6440: ldc_w 1910798039
    //   6443: ixor
    //   6444: ldc2_w 1487609
    //   6447: l2i
    //   6448: ldc_w 865225602
    //   6451: ixor
    //   6452: ixor
    //   6453: lookupswitch default -> 6480, 526973169 -> 6436, 1721845273 -> 30859
    //   6480: goto -> 6484
    //   6483: athrow
    //   6484: invokevirtual getValue : ()Ljava/lang/Object;
    //   6487: goto -> 6491
    //   6490: athrow
    //   6491: checkcast java/lang/Integer
    //   6494: getstatic Perryc.0 : I
    //   6497: ifle -> 6511
    //   6500: ldc2_w -251020764
    //   6503: l2i
    //   6504: ldc_w -770616547
    //   6507: ixor
    //   6508: goto -> 6519
    //   6511: ldc2_w 403557175
    //   6514: l2i
    //   6515: ldc_w 645389613
    //   6518: ixor
    //   6519: ldc2_w 1600928839
    //   6522: l2i
    //   6523: ldc_w -1587020881
    //   6526: ixor
    //   6527: ixor
    //   6528: lookupswitch default -> 6556, -1466214826 -> 6511, -585945391 -> 31419
    //   6556: goto -> 6560
    //   6559: athrow
    //   6560: invokevirtual intValue : ()I
    //   6563: goto -> 6567
    //   6566: athrow
    //   6567: getstatic Perryc.1 : I
    //   6570: ifeq -> 6584
    //   6573: ldc2_w -1096652881
    //   6576: l2i
    //   6577: ldc_w -654641720
    //   6580: ixor
    //   6581: goto -> 6592
    //   6584: ldc2_w -502500581
    //   6587: l2i
    //   6588: ldc_w -1548389487
    //   6591: ixor
    //   6592: ldc2_w 1786674479
    //   6595: l2i
    //   6596: ldc_w 833829794
    //   6599: ixor
    //   6600: ixor
    //   6601: lookupswitch default -> 6628, 1033229546 -> 31125, 1512518197 -> 6584
    //   6628: goto -> 6632
    //   6631: athrow
    //   6632: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   6635: goto -> 6639
    //   6638: athrow
    //   6639: getstatic Perryc.1 : I
    //   6642: ifeq -> 6656
    //   6645: ldc2_w 2087990704
    //   6648: l2i
    //   6649: ldc_w 2079466567
    //   6652: ixor
    //   6653: goto -> 6664
    //   6656: ldc2_w 39679730
    //   6659: l2i
    //   6660: ldc_w 1164599278
    //   6663: ixor
    //   6664: ldc2_w 381419876
    //   6667: l2i
    //   6668: ldc_w -1348511641
    //   6671: ixor
    //   6672: ixor
    //   6673: lookupswitch default -> 30959, -1096464140 -> 6656, -32215009 -> 6700
    //   6700: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6703: getstatic Perryc.c : I
    //   6706: iflt -> 6720
    //   6709: ldc2_w -1928263490
    //   6712: l2i
    //   6713: ldc_w 1415534507
    //   6716: ixor
    //   6717: goto -> 6728
    //   6720: ldc2_w 1712459521
    //   6723: l2i
    //   6724: ldc_w 492003280
    //   6727: ixor
    //   6728: ldc2_w 2099942276
    //   6731: l2i
    //   6732: ldc_w 895106312
    //   6735: ixor
    //   6736: ixor
    //   6737: lookupswitch default -> 6764, -2021077129 -> 6720, -1858145895 -> 30961
    //   6764: goto -> 6768
    //   6767: athrow
    //   6768: invokevirtual getValue : ()Ljava/lang/Object;
    //   6771: goto -> 6775
    //   6774: athrow
    //   6775: checkcast java/lang/Integer
    //   6778: getstatic Perryc.1 : I
    //   6781: ifeq -> 6795
    //   6784: ldc2_w 394479148
    //   6787: l2i
    //   6788: ldc_w 162628558
    //   6791: ixor
    //   6792: goto -> 6803
    //   6795: ldc2_w -1052531206
    //   6798: l2i
    //   6799: ldc_w -1710286354
    //   6802: ixor
    //   6803: ldc2_w -725930351
    //   6806: l2i
    //   6807: ldc_w -979778794
    //   6810: ixor
    //   6811: ixor
    //   6812: lookupswitch default -> 31587, 252717157 -> 6795, 1248743827 -> 6840
    //   6840: goto -> 6844
    //   6843: athrow
    //   6844: invokevirtual intValue : ()I
    //   6847: goto -> 6851
    //   6850: athrow
    //   6851: getstatic Perryc.0 : I
    //   6854: ifle -> 6868
    //   6857: ldc2_w 2135585428
    //   6860: l2i
    //   6861: ldc_w -1153632018
    //   6864: ixor
    //   6865: goto -> 6876
    //   6868: ldc2_w -1443513894
    //   6871: l2i
    //   6872: ldc_w -1888294949
    //   6875: ixor
    //   6876: ldc2_w -2031136595
    //   6879: l2i
    //   6880: ldc_w -996143150
    //   6883: ixor
    //   6884: ixor
    //   6885: lookupswitch default -> 6912, -2043030267 -> 31547, -445957455 -> 6868
    //   6912: goto -> 6916
    //   6915: athrow
    //   6916: invokestatic toRGBA : (III)I
    //   6919: goto -> 6923
    //   6922: athrow
    //   6923: getstatic Perryc.0 : I
    //   6926: ifle -> 6940
    //   6929: ldc2_w 961893146
    //   6932: l2i
    //   6933: ldc_w -1700693946
    //   6936: ixor
    //   6937: goto -> 6948
    //   6940: ldc2_w 1158710211
    //   6943: l2i
    //   6944: ldc_w -1854214525
    //   6947: ixor
    //   6948: ldc2_w -1031584424
    //   6951: l2i
    //   6952: ldc_w -1629644738
    //   6955: ixor
    //   6956: ixor
    //   6957: lookupswitch default -> 6984, -5573062 -> 31015, 885227213 -> 6940
    //   6984: putfield color : I
    //   6987: ldc2_w 820490630
    //   6990: l2i
    //   6991: ldc_w 820490636
    //   6994: ixor
    //   6995: getstatic Perryc.c : I
    //   6998: iflt -> 7012
    //   7001: ldc2_w 1519617022
    //   7004: l2i
    //   7005: ldc_w -2051687283
    //   7008: ixor
    //   7009: goto -> 7020
    //   7012: ldc2_w -1075944742
    //   7015: l2i
    //   7016: ldc_w 1698971897
    //   7019: ixor
    //   7020: ldc2_w -927029777
    //   7023: l2i
    //   7024: ldc_w -454571300
    //   7027: ixor
    //   7028: ixor
    //   7029: lookupswitch default -> 30821, -209760192 -> 7012, -154972912 -> 7056
    //   7056: istore #10
    //   7058: ldc2_w 1178653960
    //   7061: l2i
    //   7062: ldc_w 1178653961
    //   7065: ixor
    //   7066: newarray int
    //   7068: dup
    //   7069: ldc2_w -1734360768
    //   7072: l2i
    //   7073: ldc_w -1734360768
    //   7076: ixor
    //   7077: ldc2_w 1216094104
    //   7080: l2i
    //   7081: ldc_w 1216094105
    //   7084: ixor
    //   7085: iastore
    //   7086: getstatic Perryc.1 : I
    //   7089: ifeq -> 7103
    //   7092: ldc2_w -293578957
    //   7095: l2i
    //   7096: ldc_w 1438748559
    //   7099: ixor
    //   7100: goto -> 7111
    //   7103: ldc2_w -1824771474
    //   7106: l2i
    //   7107: ldc_w -1413155773
    //   7110: ixor
    //   7111: ldc2_w 1519541746
    //   7114: l2i
    //   7115: ldc_w 800011637
    //   7118: ixor
    //   7119: ixor
    //   7120: lookupswitch default -> 31249, -830689221 -> 7103, 1304800938 -> 7148
    //   7148: astore #11
    //   7150: getstatic Perryc.1 : I
    //   7153: ifeq -> 7167
    //   7156: ldc2_w 1879692931
    //   7159: l2i
    //   7160: ldc_w -1445137119
    //   7163: ixor
    //   7164: goto -> 7175
    //   7167: ldc2_w 1540820214
    //   7170: l2i
    //   7171: ldc_w -1511421030
    //   7174: ixor
    //   7175: ldc2_w -34721028
    //   7178: l2i
    //   7179: ldc_w 58827956
    //   7182: ixor
    //   7183: ixor
    //   7184: lookupswitch default -> 31359, 5312804 -> 7212, 666547690 -> 7167
    //   7212: goto -> 7216
    //   7215: athrow
    //   7216: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   7219: goto -> 7223
    //   7222: athrow
    //   7223: getstatic Perryc.0 : I
    //   7226: ifle -> 7240
    //   7229: ldc2_w -1079853377
    //   7232: l2i
    //   7233: ldc_w 1027931099
    //   7236: ixor
    //   7237: goto -> 7248
    //   7240: ldc2_w -1001590184
    //   7243: l2i
    //   7244: ldc_w -426453461
    //   7247: ixor
    //   7248: ldc2_w -1042691650
    //   7251: l2i
    //   7252: ldc_w 1054482243
    //   7255: ixor
    //   7256: ixor
    //   7257: lookupswitch default -> 7284, 161109714 -> 7240, 2112197529 -> 31305
    //   7284: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7287: getstatic Perryc.0 : I
    //   7290: ifle -> 7304
    //   7293: ldc2_w -409554973
    //   7296: l2i
    //   7297: ldc_w 488805823
    //   7300: ixor
    //   7301: goto -> 7312
    //   7304: ldc2_w -1888824894
    //   7307: l2i
    //   7308: ldc_w 766326567
    //   7311: ixor
    //   7312: ldc2_w -387733911
    //   7315: l2i
    //   7316: ldc_w 1278728675
    //   7319: ixor
    //   7320: ixor
    //   7321: lookupswitch default -> 31549, 101947759 -> 7348, 1583367638 -> 7304
    //   7348: goto -> 7352
    //   7351: athrow
    //   7352: invokevirtual getValue : ()Ljava/lang/Object;
    //   7355: goto -> 7359
    //   7358: athrow
    //   7359: checkcast java/lang/Boolean
    //   7362: getstatic Perryc.1 : I
    //   7365: ifeq -> 7379
    //   7368: ldc2_w -727763231
    //   7371: l2i
    //   7372: ldc_w -512647581
    //   7375: ixor
    //   7376: goto -> 7387
    //   7379: ldc2_w -1996907483
    //   7382: l2i
    //   7383: ldc_w 647188032
    //   7386: ixor
    //   7387: ldc2_w 1351346939
    //   7390: l2i
    //   7391: ldc_w 1619292965
    //   7394: ixor
    //   7395: ixor
    //   7396: lookupswitch default -> 7424, -1206469314 -> 7379, 98644316 -> 30993
    //   7424: goto -> 7428
    //   7427: athrow
    //   7428: invokevirtual booleanValue : ()Z
    //   7431: goto -> 7435
    //   7434: athrow
    //   7435: ifeq -> 7449
    //   7438: ldc2_w 1493252521
    //   7441: l2i
    //   7442: ldc_w 406629188
    //   7445: ixor
    //   7446: goto -> 7457
    //   7449: ldc2_w 466249649
    //   7452: l2i
    //   7453: ldc_w 1526199645
    //   7456: ixor
    //   7457: ldc2_w 1405236941
    //   7460: l2i
    //   7461: ldc_w 1068535900
    //   7464: ixor
    //   7465: ixor
    //   7466: tableswitch default -> 7438, 760165500 -> 7488, 760165501 -> 20497
    //   7488: getstatic Perryc.c : I
    //   7491: iflt -> 7505
    //   7494: ldc2_w -1555354564
    //   7497: l2i
    //   7498: ldc_w 1185244344
    //   7501: ixor
    //   7502: goto -> 7513
    //   7505: ldc2_w 1012015328
    //   7508: l2i
    //   7509: ldc_w 1051513708
    //   7512: ixor
    //   7513: ldc2_w -1178283888
    //   7516: l2i
    //   7517: ldc_w -427784318
    //   7520: ixor
    //   7521: ixor
    //   7522: lookupswitch default -> 7548, -1163255914 -> 30787, 1594026515 -> 7505
    //   7548: goto -> 7552
    //   7551: athrow
    //   7552: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   7555: goto -> 7559
    //   7558: athrow
    //   7559: getstatic Perryc.c : I
    //   7562: iflt -> 7576
    //   7565: ldc2_w -573885552
    //   7568: l2i
    //   7569: ldc_w -1548015547
    //   7572: ixor
    //   7573: goto -> 7584
    //   7576: ldc2_w 658952182
    //   7579: l2i
    //   7580: ldc_w 1256805582
    //   7583: ixor
    //   7584: ldc2_w -781942997
    //   7587: l2i
    //   7588: ldc_w 136668671
    //   7591: ixor
    //   7592: ixor
    //   7593: lookupswitch default -> 30973, -1489960703 -> 7576, -1259437588 -> 7620
    //   7620: getfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7623: getstatic Perryc.c : I
    //   7626: iflt -> 7640
    //   7629: ldc2_w 35849708
    //   7632: l2i
    //   7633: ldc_w 1907892318
    //   7636: ixor
    //   7637: goto -> 7648
    //   7640: ldc2_w -1099137610
    //   7643: l2i
    //   7644: ldc_w 813623863
    //   7647: ixor
    //   7648: ldc2_w -237819839
    //   7651: l2i
    //   7652: ldc_w -1370486642
    //   7655: ixor
    //   7656: ixor
    //   7657: lookupswitch default -> 31323, -780028082 -> 7684, 739771773 -> 7640
    //   7684: goto -> 7688
    //   7687: athrow
    //   7688: invokevirtual getValue : ()Ljava/lang/Object;
    //   7691: goto -> 7695
    //   7694: athrow
    //   7695: getstatic Perryc.c : I
    //   7698: iflt -> 7712
    //   7701: ldc2_w -1699420293
    //   7704: l2i
    //   7705: ldc_w 1306196935
    //   7708: ixor
    //   7709: goto -> 7720
    //   7712: ldc2_w -106983312
    //   7715: l2i
    //   7716: ldc_w -153991316
    //   7719: ixor
    //   7720: ldc2_w 27518217
    //   7723: l2i
    //   7724: ldc_w -817048252
    //   7727: ixor
    //   7728: ixor
    //   7729: lookupswitch default -> 31029, -1046288559 -> 7756, 427896049 -> 7712
    //   7756: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   7759: if_acmpne -> 7773
    //   7762: ldc2_w 1474630946
    //   7765: l2i
    //   7766: ldc_w 106609453
    //   7769: ixor
    //   7770: goto -> 7781
    //   7773: ldc2_w 1834934586
    //   7776: l2i
    //   7777: ldc_w 1021398838
    //   7780: ixor
    //   7781: ldc2_w 923277936
    //   7784: l2i
    //   7785: ldc_w -1496636654
    //   7788: ixor
    //   7789: ixor
    //   7790: tableswitch default -> 7762, -1065576595 -> 7812, -1065576594 -> 30746
    //   7812: getstatic Perryc.c : I
    //   7815: iflt -> 7829
    //   7818: ldc2_w 1662672819
    //   7821: l2i
    //   7822: ldc_w -727306855
    //   7825: ixor
    //   7826: goto -> 7837
    //   7829: ldc2_w -327956130
    //   7832: l2i
    //   7833: ldc_w -1436180677
    //   7836: ixor
    //   7837: ldc2_w -2010040146
    //   7840: l2i
    //   7841: ldc_w 425172055
    //   7844: ixor
    //   7845: ixor
    //   7846: lookupswitch default -> 30911, -680463716 -> 7872, 651876051 -> 7829
    //   7872: aload_0
    //   7873: getstatic Perryc.1 : I
    //   7876: ifeq -> 7890
    //   7879: ldc2_w -1299152712
    //   7882: l2i
    //   7883: ldc_w 1101067659
    //   7886: ixor
    //   7887: goto -> 7898
    //   7890: ldc2_w -429019298
    //   7893: l2i
    //   7894: ldc_w 65440723
    //   7897: ixor
    //   7898: ldc2_w -791068056
    //   7901: l2i
    //   7902: ldc_w -1883901993
    //   7905: ixor
    //   7906: ixor
    //   7907: lookupswitch default -> 7932, -1403201396 -> 30809, 1594704614 -> 7890
    //   7932: getfield fps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7935: getstatic Perryc.0 : I
    //   7938: ifle -> 7952
    //   7941: ldc2_w -979718913
    //   7944: l2i
    //   7945: ldc_w -2087132394
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w -109172729
    //   7955: l2i
    //   7956: ldc_w 480465134
    //   7959: ixor
    //   7960: ldc2_w 1536985843
    //   7963: l2i
    //   7964: ldc_w 1343889834
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 7996, -1736825795 -> 7952, 1300554928 -> 30753
    //   7996: goto -> 8000
    //   7999: athrow
    //   8000: invokevirtual getValue : ()Ljava/lang/Object;
    //   8003: goto -> 8007
    //   8006: athrow
    //   8007: checkcast java/lang/Boolean
    //   8010: getstatic Perryc.0 : I
    //   8013: ifle -> 8027
    //   8016: ldc2_w -119999462
    //   8019: l2i
    //   8020: ldc_w -940799416
    //   8023: ixor
    //   8024: goto -> 8035
    //   8027: ldc2_w 65641904
    //   8030: l2i
    //   8031: ldc_w 1918271451
    //   8034: ixor
    //   8035: ldc2_w 1678885846
    //   8038: l2i
    //   8039: ldc_w -1977795382
    //   8042: ixor
    //   8043: ixor
    //   8044: lookupswitch default -> 8072, -784826034 -> 31045, -775933867 -> 8027
    //   8072: goto -> 8076
    //   8075: athrow
    //   8076: invokevirtual booleanValue : ()Z
    //   8079: goto -> 8083
    //   8082: athrow
    //   8083: ifeq -> 8097
    //   8086: ldc2_w 1545611911
    //   8089: l2i
    //   8090: ldc_w 1405965342
    //   8093: ixor
    //   8094: goto -> 8105
    //   8097: ldc2_w -659669491
    //   8100: l2i
    //   8101: ldc_w -683458411
    //   8104: ixor
    //   8105: ldc2_w -1008218495
    //   8108: l2i
    //   8109: ldc_w -916674430
    //   8112: ixor
    //   8113: ixor
    //   8114: tableswitch default -> 8086, 89528474 -> 8136, 89528475 -> 9374
    //   8136: getstatic Perryc.1 : I
    //   8139: ifeq -> 8153
    //   8142: ldc2_w -1321532802
    //   8145: l2i
    //   8146: ldc_w -783098631
    //   8149: ixor
    //   8150: goto -> 8161
    //   8153: ldc2_w 2107775055
    //   8156: l2i
    //   8157: ldc_w 480918472
    //   8160: ixor
    //   8161: ldc2_w 1065382196
    //   8164: l2i
    //   8165: ldc_w 1031094397
    //   8168: ixor
    //   8169: ixor
    //   8170: lookupswitch default -> 8196, -1295247773 -> 8153, 1654452174 -> 31019
    //   8196: aload_0
    //   8197: getstatic Perryc.1 : I
    //   8200: ifeq -> 8214
    //   8203: ldc2_w 955820004
    //   8206: l2i
    //   8207: ldc_w 443145763
    //   8210: ixor
    //   8211: goto -> 8222
    //   8214: ldc2_w 1587698701
    //   8217: l2i
    //   8218: ldc_w 1571731724
    //   8221: ixor
    //   8222: ldc2_w 440578896
    //   8225: l2i
    //   8226: ldc_w -730361815
    //   8229: ixor
    //   8230: ixor
    //   8231: lookupswitch default -> 31147, -851851656 -> 8256, -324773186 -> 8214
    //   8256: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   8259: getstatic Perryc.c : I
    //   8262: iflt -> 8276
    //   8265: ldc2_w -198643995
    //   8268: l2i
    //   8269: ldc_w -1750988472
    //   8272: ixor
    //   8273: goto -> 8284
    //   8276: ldc2_w 190165888
    //   8279: l2i
    //   8280: ldc_w -1270502767
    //   8283: ixor
    //   8284: ldc2_w -2064645143
    //   8287: l2i
    //   8288: ldc_w -1360503531
    //   8291: ixor
    //   8292: ixor
    //   8293: lookupswitch default -> 8320, 1234352465 -> 31295, 1633403593 -> 8276
    //   8320: aload_2
    //   8321: getstatic Perryc.0 : I
    //   8324: ifle -> 8338
    //   8327: ldc2_w -157007074
    //   8330: l2i
    //   8331: ldc_w 1267634492
    //   8334: ixor
    //   8335: goto -> 8346
    //   8338: ldc2_w 479752824
    //   8341: l2i
    //   8342: ldc_w 1440357835
    //   8345: ixor
    //   8346: ldc2_w -240240442
    //   8349: l2i
    //   8350: ldc_w -1920441086
    //   8353: ixor
    //   8354: ixor
    //   8355: lookupswitch default -> 31163, -1056141338 -> 8338, 895758967 -> 8380
    //   8380: aload_0
    //   8381: getstatic Perryc.0 : I
    //   8384: ifle -> 8398
    //   8387: ldc2_w -86000186
    //   8390: l2i
    //   8391: ldc_w -1790488063
    //   8394: ixor
    //   8395: goto -> 8406
    //   8398: ldc2_w -1507585906
    //   8401: l2i
    //   8402: ldc_w 1903594093
    //   8405: ixor
    //   8406: ldc2_w -687646614
    //   8409: l2i
    //   8410: ldc_w 1770459634
    //   8413: ixor
    //   8414: ixor
    //   8415: lookupswitch default -> 31253, -786651553 -> 8398, 1775686523 -> 8440
    //   8440: getfield FpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8443: getstatic Perryc.c : I
    //   8446: iflt -> 8460
    //   8449: ldc2_w -188875232
    //   8452: l2i
    //   8453: ldc_w 912527270
    //   8456: ixor
    //   8457: goto -> 8468
    //   8460: ldc2_w -146877207
    //   8463: l2i
    //   8464: ldc_w -1573113339
    //   8467: ixor
    //   8468: ldc2_w -568529673
    //   8471: l2i
    //   8472: ldc_w -1209229896
    //   8475: ixor
    //   8476: ixor
    //   8477: lookupswitch default -> 8504, -1423343415 -> 31573, 889437656 -> 8460
    //   8504: goto -> 8508
    //   8507: athrow
    //   8508: invokevirtual getValue : ()Ljava/lang/Object;
    //   8511: goto -> 8515
    //   8514: athrow
    //   8515: checkcast java/lang/Integer
    //   8518: getstatic Perryc.0 : I
    //   8521: ifle -> 8535
    //   8524: ldc2_w 1499990733
    //   8527: l2i
    //   8528: ldc_w -1338779931
    //   8531: ixor
    //   8532: goto -> 8543
    //   8535: ldc2_w -308924614
    //   8538: l2i
    //   8539: ldc_w 1386197816
    //   8542: ixor
    //   8543: ldc2_w 2045733742
    //   8546: l2i
    //   8547: ldc_w -60578163
    //   8550: ixor
    //   8551: ixor
    //   8552: lookupswitch default -> 31221, 981815777 -> 8580, 1826034123 -> 8535
    //   8580: goto -> 8584
    //   8583: athrow
    //   8584: invokevirtual intValue : ()I
    //   8587: goto -> 8591
    //   8590: athrow
    //   8591: i2f
    //   8592: getstatic Perryc.1 : I
    //   8595: ifeq -> 8609
    //   8598: ldc2_w -1643372565
    //   8601: l2i
    //   8602: ldc_w -926627722
    //   8605: ixor
    //   8606: goto -> 8617
    //   8609: ldc2_w 1339544274
    //   8612: l2i
    //   8613: ldc_w -182765253
    //   8616: ixor
    //   8617: ldc2_w -1174303556
    //   8620: l2i
    //   8621: ldc_w 1559804108
    //   8624: ixor
    //   8625: ixor
    //   8626: lookupswitch default -> 31361, -1338907667 -> 8609, 1547034521 -> 8652
    //   8652: aload_0
    //   8653: getstatic Perryc.1 : I
    //   8656: ifeq -> 8670
    //   8659: ldc2_w -1224427204
    //   8662: l2i
    //   8663: ldc_w 1627690002
    //   8666: ixor
    //   8667: goto -> 8678
    //   8670: ldc2_w -1197313329
    //   8673: l2i
    //   8674: ldc_w 1380780793
    //   8677: ixor
    //   8678: ldc2_w -617955722
    //   8681: l2i
    //   8682: ldc_w 831830087
    //   8685: ixor
    //   8686: ixor
    //   8687: lookupswitch default -> 8712, -1591597906 -> 8670, 1019095839 -> 31467
    //   8712: getfield FpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8715: getstatic Perryc.c : I
    //   8718: iflt -> 8732
    //   8721: ldc2_w -1028667268
    //   8724: l2i
    //   8725: ldc_w -1809997710
    //   8728: ixor
    //   8729: goto -> 8740
    //   8732: ldc2_w -386846034
    //   8735: l2i
    //   8736: ldc_w 139102758
    //   8739: ixor
    //   8740: ldc2_w 2074788069
    //   8743: l2i
    //   8744: ldc_w -1904997665
    //   8747: ixor
    //   8748: ixor
    //   8749: lookupswitch default -> 8776, -1553161676 -> 30759, -226701738 -> 8732
    //   8776: goto -> 8780
    //   8779: athrow
    //   8780: invokevirtual getValue : ()Ljava/lang/Object;
    //   8783: goto -> 8787
    //   8786: athrow
    //   8787: checkcast java/lang/Integer
    //   8790: getstatic Perryc.0 : I
    //   8793: ifle -> 8807
    //   8796: ldc2_w 324082910
    //   8799: l2i
    //   8800: ldc_w -1323576191
    //   8803: ixor
    //   8804: goto -> 8815
    //   8807: ldc2_w 687624347
    //   8810: l2i
    //   8811: ldc_w -779673194
    //   8814: ixor
    //   8815: ldc2_w -254158669
    //   8818: l2i
    //   8819: ldc_w 1701063591
    //   8822: ixor
    //   8823: ixor
    //   8824: lookupswitch default -> 31381, 938949451 -> 8807, 1824948761 -> 8852
    //   8852: goto -> 8856
    //   8855: athrow
    //   8856: invokevirtual intValue : ()I
    //   8859: goto -> 8863
    //   8862: athrow
    //   8863: i2f
    //   8864: getstatic Perryc.c : I
    //   8867: iflt -> 8881
    //   8870: ldc2_w 1045379093
    //   8873: l2i
    //   8874: ldc_w -1948237864
    //   8877: ixor
    //   8878: goto -> 8889
    //   8881: ldc2_w 1156361611
    //   8884: l2i
    //   8885: ldc_w 259730501
    //   8888: ixor
    //   8889: ldc2_w 49155820
    //   8892: l2i
    //   8893: ldc_w -1810504904
    //   8896: ixor
    //   8897: ixor
    //   8898: lookupswitch default -> 8924, -729882989 -> 8881, 592767513 -> 30937
    //   8924: goto -> 8928
    //   8927: athrow
    //   8928: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   8931: goto -> 8935
    //   8934: athrow
    //   8935: getstatic Perryc.1 : I
    //   8938: ifeq -> 8952
    //   8941: ldc2_w 1270049116
    //   8944: l2i
    //   8945: ldc_w -1526897025
    //   8948: ixor
    //   8949: goto -> 8960
    //   8952: ldc2_w -457188484
    //   8955: l2i
    //   8956: ldc_w 630834505
    //   8959: ixor
    //   8960: ldc2_w -1872930522
    //   8963: l2i
    //   8964: ldc_w -331127383
    //   8967: ixor
    //   8968: ixor
    //   8969: lookupswitch default -> 30873, -1823460436 -> 8952, -1120394566 -> 8996
    //   8996: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8999: getstatic Perryc.0 : I
    //   9002: ifle -> 9016
    //   9005: ldc2_w 243379405
    //   9008: l2i
    //   9009: ldc_w -179554548
    //   9012: ixor
    //   9013: goto -> 9024
    //   9016: ldc2_w -233941462
    //   9019: l2i
    //   9020: ldc_w 2038365209
    //   9023: ixor
    //   9024: ldc2_w -1866614696
    //   9027: l2i
    //   9028: ldc_w -365190289
    //   9031: ixor
    //   9032: ixor
    //   9033: lookupswitch default -> 31425, -2125758218 -> 9016, -235491068 -> 9060
    //   9060: goto -> 9064
    //   9063: athrow
    //   9064: invokevirtual getValue : ()Ljava/lang/Object;
    //   9067: goto -> 9071
    //   9070: athrow
    //   9071: checkcast java/lang/Integer
    //   9074: getstatic Perryc.c : I
    //   9077: iflt -> 9091
    //   9080: ldc2_w 1525408185
    //   9083: l2i
    //   9084: ldc_w 845299037
    //   9087: ixor
    //   9088: goto -> 9099
    //   9091: ldc2_w 1038743220
    //   9094: l2i
    //   9095: ldc_w -957835739
    //   9098: ixor
    //   9099: ldc2_w 1710154085
    //   9102: l2i
    //   9103: ldc_w 283933606
    //   9106: ixor
    //   9107: ixor
    //   9108: lookupswitch default -> 9136, 322388423 -> 9091, 495666727 -> 31079
    //   9136: goto -> 9140
    //   9139: athrow
    //   9140: invokevirtual intValue : ()I
    //   9143: goto -> 9147
    //   9146: athrow
    //   9147: getstatic Perryc.1 : I
    //   9150: ifeq -> 9164
    //   9153: ldc2_w -1027023790
    //   9156: l2i
    //   9157: ldc_w -1645805919
    //   9160: ixor
    //   9161: goto -> 9172
    //   9164: ldc2_w -346914850
    //   9167: l2i
    //   9168: ldc_w 423447464
    //   9171: ixor
    //   9172: ldc2_w 1681538239
    //   9175: l2i
    //   9176: ldc_w -1061472975
    //   9179: ixor
    //   9180: ixor
    //   9181: lookupswitch default -> 30921, -72406147 -> 9164, 1458454008 -> 9208
    //   9208: goto -> 9212
    //   9211: athrow
    //   9212: invokestatic rainbow : (I)Ljava/awt/Color;
    //   9215: goto -> 9219
    //   9218: athrow
    //   9219: getstatic Perryc.c : I
    //   9222: iflt -> 9236
    //   9225: ldc2_w 45279431
    //   9228: l2i
    //   9229: ldc_w 1430236865
    //   9232: ixor
    //   9233: goto -> 9244
    //   9236: ldc2_w -639810238
    //   9239: l2i
    //   9240: ldc_w -1042729810
    //   9243: ixor
    //   9244: ldc2_w -286998976
    //   9247: l2i
    //   9248: ldc_w 1448105788
    //   9251: ixor
    //   9252: ixor
    //   9253: lookupswitch default -> 9280, -281432198 -> 31041, 1550756649 -> 9236
    //   9280: goto -> 9284
    //   9283: athrow
    //   9284: invokevirtual getRGB : ()I
    //   9287: goto -> 9291
    //   9290: athrow
    //   9291: ldc2_w 1044949536
    //   9294: l2i
    //   9295: ldc_w 1044949537
    //   9298: ixor
    //   9299: getstatic Perryc.c : I
    //   9302: iflt -> 9316
    //   9305: ldc2_w 1151025834
    //   9308: l2i
    //   9309: ldc_w 236529610
    //   9312: ixor
    //   9313: goto -> 9324
    //   9316: ldc2_w -1698835458
    //   9319: l2i
    //   9320: ldc_w 1281352771
    //   9323: ixor
    //   9324: ldc2_w 883342687
    //   9327: l2i
    //   9328: ldc_w 185502937
    //   9331: ixor
    //   9332: ixor
    //   9333: lookupswitch default -> 9360, -1561865300 -> 9316, 1965708518 -> 30983
    //   9360: goto -> 9364
    //   9363: athrow
    //   9364: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   9367: goto -> 9371
    //   9370: athrow
    //   9371: iinc #10, 12
    //   9374: getstatic Perryc.0 : I
    //   9377: ifle -> 9391
    //   9380: ldc2_w 1987910373
    //   9383: l2i
    //   9384: ldc_w -27384489
    //   9387: ixor
    //   9388: goto -> 9399
    //   9391: ldc2_w -524494688
    //   9394: l2i
    //   9395: ldc_w 2039992579
    //   9398: ixor
    //   9399: ldc2_w 841841862
    //   9402: l2i
    //   9403: ldc_w 1318089086
    //   9406: ixor
    //   9407: ixor
    //   9408: lookupswitch default -> 30895, -443153381 -> 9436, -190959094 -> 9391
    //   9436: aload_0
    //   9437: getstatic Perryc.c : I
    //   9440: iflt -> 9454
    //   9443: ldc2_w 2057259669
    //   9446: l2i
    //   9447: ldc_w 894466948
    //   9450: ixor
    //   9451: goto -> 9462
    //   9454: ldc2_w -1338887591
    //   9457: l2i
    //   9458: ldc_w -923022354
    //   9461: ixor
    //   9462: ldc2_w -1416523114
    //   9465: l2i
    //   9466: ldc_w -359946492
    //   9469: ixor
    //   9470: ixor
    //   9471: lookupswitch default -> 9496, 248841347 -> 30897, 872719194 -> 9454
    //   9496: getfield tps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9499: getstatic Perryc.0 : I
    //   9502: ifle -> 9516
    //   9505: ldc2_w -1841039910
    //   9508: l2i
    //   9509: ldc_w -991675228
    //   9512: ixor
    //   9513: goto -> 9524
    //   9516: ldc2_w -772479549
    //   9519: l2i
    //   9520: ldc_w 862503011
    //   9523: ixor
    //   9524: ldc2_w -933571713
    //   9527: l2i
    //   9528: ldc_w -1431211367
    //   9531: ixor
    //   9532: ixor
    //   9533: lookupswitch default -> 9560, -1730290073 -> 9516, 877422744 -> 30779
    //   9560: goto -> 9564
    //   9563: athrow
    //   9564: invokevirtual getValue : ()Ljava/lang/Object;
    //   9567: goto -> 9571
    //   9570: athrow
    //   9571: checkcast java/lang/Boolean
    //   9574: getstatic Perryc.0 : I
    //   9577: ifle -> 9591
    //   9580: ldc2_w 1790366246
    //   9583: l2i
    //   9584: ldc_w 359534284
    //   9587: ixor
    //   9588: goto -> 9599
    //   9591: ldc2_w 1844635532
    //   9594: l2i
    //   9595: ldc_w -2002592775
    //   9598: ixor
    //   9599: ldc2_w -2126500648
    //   9602: l2i
    //   9603: ldc_w 228929944
    //   9606: ixor
    //   9607: ixor
    //   9608: lookupswitch default -> 31263, -214056534 -> 9591, 1773478197 -> 9636
    //   9636: goto -> 9640
    //   9639: athrow
    //   9640: invokevirtual booleanValue : ()Z
    //   9643: goto -> 9647
    //   9646: athrow
    //   9647: ifeq -> 9661
    //   9650: ldc2_w 1024517387
    //   9653: l2i
    //   9654: ldc_w 12148586
    //   9657: ixor
    //   9658: goto -> 9669
    //   9661: ldc2_w -1407215602
    //   9664: l2i
    //   9665: ldc_w -1850334610
    //   9668: ixor
    //   9669: ldc2_w 1035484007
    //   9672: l2i
    //   9673: ldc_w 159479002
    //   9676: ixor
    //   9677: ixor
    //   9678: tableswitch default -> 9650, 160495068 -> 9700, 160495069 -> 10938
    //   9700: getstatic Perryc.0 : I
    //   9703: ifle -> 9717
    //   9706: ldc2_w -1943904375
    //   9709: l2i
    //   9710: ldc_w -1020972982
    //   9713: ixor
    //   9714: goto -> 9725
    //   9717: ldc2_w 1693025288
    //   9720: l2i
    //   9721: ldc_w -607866283
    //   9724: ixor
    //   9725: ldc2_w -50863585
    //   9728: l2i
    //   9729: ldc_w 883844391
    //   9732: ixor
    //   9733: ixor
    //   9734: lookupswitch default -> 31199, -2023823109 -> 9717, 2004136293 -> 9760
    //   9760: aload_0
    //   9761: getstatic Perryc.c : I
    //   9764: iflt -> 9778
    //   9767: ldc2_w -2129209380
    //   9770: l2i
    //   9771: ldc_w 293832619
    //   9774: ixor
    //   9775: goto -> 9786
    //   9778: ldc2_w 338378382
    //   9781: l2i
    //   9782: ldc_w -293240536
    //   9785: ixor
    //   9786: ldc2_w 181675636
    //   9789: l2i
    //   9790: ldc_w -911381737
    //   9793: ixor
    //   9794: ixor
    //   9795: lookupswitch default -> 9820, 1303870221 -> 9778, 1407982868 -> 31085
    //   9820: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   9823: getstatic Perryc.0 : I
    //   9826: ifle -> 9840
    //   9829: ldc2_w -1551403249
    //   9832: l2i
    //   9833: ldc_w 2063871047
    //   9836: ixor
    //   9837: goto -> 9848
    //   9840: ldc2_w 1767615273
    //   9843: l2i
    //   9844: ldc_w -613649292
    //   9847: ixor
    //   9848: ldc2_w 477127411
    //   9851: l2i
    //   9852: ldc_w -1510093608
    //   9855: ixor
    //   9856: ixor
    //   9857: lookupswitch default -> 31311, 196768118 -> 9884, 1628370275 -> 9840
    //   9884: aload_3
    //   9885: getstatic Perryc.0 : I
    //   9888: ifle -> 9902
    //   9891: ldc2_w -366917260
    //   9894: l2i
    //   9895: ldc_w 2102494620
    //   9898: ixor
    //   9899: goto -> 9910
    //   9902: ldc2_w -839546268
    //   9905: l2i
    //   9906: ldc_w -1499078489
    //   9909: ixor
    //   9910: ldc2_w -1386022696
    //   9913: l2i
    //   9914: ldc_w -1102283436
    //   9917: ixor
    //   9918: ixor
    //   9919: lookupswitch default -> 9944, -2074195612 -> 31325, 553608671 -> 9902
    //   9944: aload_0
    //   9945: getstatic Perryc.0 : I
    //   9948: ifle -> 9962
    //   9951: ldc2_w 1581924702
    //   9954: l2i
    //   9955: ldc_w 1616238526
    //   9958: ixor
    //   9959: goto -> 9970
    //   9962: ldc2_w -1191430205
    //   9965: l2i
    //   9966: ldc_w -382306300
    //   9969: ixor
    //   9970: ldc2_w -1873880489
    //   9973: l2i
    //   9974: ldc_w -1622602366
    //   9977: ixor
    //   9978: ixor
    //   9979: lookupswitch default -> 10004, -693936031 -> 9962, 823673141 -> 30775
    //   10004: getfield TpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10007: getstatic Perryc.1 : I
    //   10010: ifeq -> 10024
    //   10013: ldc2_w 1652484603
    //   10016: l2i
    //   10017: ldc_w 666644928
    //   10020: ixor
    //   10021: goto -> 10032
    //   10024: ldc2_w -1058280479
    //   10027: l2i
    //   10028: ldc_w 1051463470
    //   10031: ixor
    //   10032: ldc2_w 2097069287
    //   10035: l2i
    //   10036: ldc_w -176929946
    //   10039: ixor
    //   10040: ixor
    //   10041: lookupswitch default -> 10068, -867686470 -> 31203, 1022612996 -> 10024
    //   10068: goto -> 10072
    //   10071: athrow
    //   10072: invokevirtual getValue : ()Ljava/lang/Object;
    //   10075: goto -> 10079
    //   10078: athrow
    //   10079: checkcast java/lang/Integer
    //   10082: getstatic Perryc.c : I
    //   10085: iflt -> 10099
    //   10088: ldc2_w -2007324262
    //   10091: l2i
    //   10092: ldc_w -1434982402
    //   10095: ixor
    //   10096: goto -> 10107
    //   10099: ldc2_w -344715134
    //   10102: l2i
    //   10103: ldc_w -1565640642
    //   10106: ixor
    //   10107: ldc2_w -2015676729
    //   10110: l2i
    //   10111: ldc_w -565945156
    //   10114: ixor
    //   10115: ixor
    //   10116: lookupswitch default -> 31081, 272974535 -> 10144, 2075272223 -> 10099
    //   10144: goto -> 10148
    //   10147: athrow
    //   10148: invokevirtual intValue : ()I
    //   10151: goto -> 10155
    //   10154: athrow
    //   10155: i2f
    //   10156: getstatic Perryc.1 : I
    //   10159: ifeq -> 10173
    //   10162: ldc2_w -1353410541
    //   10165: l2i
    //   10166: ldc_w -360800204
    //   10169: ixor
    //   10170: goto -> 10181
    //   10173: ldc2_w 67557978
    //   10176: l2i
    //   10177: ldc_w -6905805
    //   10180: ixor
    //   10181: ldc2_w 1545156684
    //   10184: l2i
    //   10185: ldc_w 2126264439
    //   10188: ixor
    //   10189: ixor
    //   10190: lookupswitch default -> 30851, -650806702 -> 10216, 1737439260 -> 10173
    //   10216: aload_0
    //   10217: getstatic Perryc.c : I
    //   10220: iflt -> 10234
    //   10223: ldc2_w 1216958977
    //   10226: l2i
    //   10227: ldc_w -1974365466
    //   10230: ixor
    //   10231: goto -> 10242
    //   10234: ldc2_w 1773569064
    //   10237: l2i
    //   10238: ldc_w 365289365
    //   10241: ixor
    //   10242: ldc2_w 2086153241
    //   10245: l2i
    //   10246: ldc_w 972361575
    //   10249: ixor
    //   10250: ixor
    //   10251: lookupswitch default -> 31343, -2022317159 -> 10234, 970881219 -> 10276
    //   10276: getfield TpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10279: getstatic Perryc.c : I
    //   10282: iflt -> 10296
    //   10285: ldc2_w 1590977701
    //   10288: l2i
    //   10289: ldc_w -1434716102
    //   10292: ixor
    //   10293: goto -> 10304
    //   10296: ldc2_w -694292910
    //   10299: l2i
    //   10300: ldc_w 1026211588
    //   10303: ixor
    //   10304: ldc2_w -895905538
    //   10307: l2i
    //   10308: ldc_w -1207264469
    //   10311: ixor
    //   10312: ixor
    //   10313: lookupswitch default -> 10340, -2042849462 -> 30919, -1059138201 -> 10296
    //   10340: goto -> 10344
    //   10343: athrow
    //   10344: invokevirtual getValue : ()Ljava/lang/Object;
    //   10347: goto -> 10351
    //   10350: athrow
    //   10351: checkcast java/lang/Integer
    //   10354: getstatic Perryc.0 : I
    //   10357: ifle -> 10371
    //   10360: ldc2_w 1087135718
    //   10363: l2i
    //   10364: ldc_w -476572661
    //   10367: ixor
    //   10368: goto -> 10379
    //   10371: ldc2_w 560766754
    //   10374: l2i
    //   10375: ldc_w -1651562260
    //   10378: ixor
    //   10379: ldc2_w 506949824
    //   10382: l2i
    //   10383: ldc_w -294516428
    //   10386: ixor
    //   10387: ixor
    //   10388: lookupswitch default -> 10416, -263012230 -> 10371, 1393635865 -> 31533
    //   10416: goto -> 10420
    //   10419: athrow
    //   10420: invokevirtual intValue : ()I
    //   10423: goto -> 10427
    //   10426: athrow
    //   10427: i2f
    //   10428: getstatic Perryc.0 : I
    //   10431: ifle -> 10445
    //   10434: ldc2_w -2061651570
    //   10437: l2i
    //   10438: ldc_w -2084580093
    //   10441: ixor
    //   10442: goto -> 10453
    //   10445: ldc2_w 1028901459
    //   10448: l2i
    //   10449: ldc_w -1852728813
    //   10452: ixor
    //   10453: ldc2_w -297157347
    //   10456: l2i
    //   10457: ldc_w -1176659907
    //   10460: ixor
    //   10461: ixor
    //   10462: lookupswitch default -> 31367, -78219936 -> 10488, 1362510253 -> 10445
    //   10488: goto -> 10492
    //   10491: athrow
    //   10492: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   10495: goto -> 10499
    //   10498: athrow
    //   10499: getstatic Perryc.1 : I
    //   10502: ifeq -> 10516
    //   10505: ldc2_w -1823965626
    //   10508: l2i
    //   10509: ldc_w -2079959551
    //   10512: ixor
    //   10513: goto -> 10524
    //   10516: ldc2_w -1389446245
    //   10519: l2i
    //   10520: ldc_w -601979030
    //   10523: ixor
    //   10524: ldc2_w -2091305882
    //   10527: l2i
    //   10528: ldc_w 1782338694
    //   10531: ixor
    //   10532: ixor
    //   10533: lookupswitch default -> 30817, -1739236335 -> 10560, -30717785 -> 10516
    //   10560: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10563: getstatic Perryc.c : I
    //   10566: iflt -> 10580
    //   10569: ldc2_w -34799992
    //   10572: l2i
    //   10573: ldc_w -1611031789
    //   10576: ixor
    //   10577: goto -> 10588
    //   10580: ldc2_w -326511798
    //   10583: l2i
    //   10584: ldc_w -123702474
    //   10587: ixor
    //   10588: ldc2_w 2068779212
    //   10591: l2i
    //   10592: ldc_w 740793647
    //   10595: ixor
    //   10596: ixor
    //   10597: lookupswitch default -> 10624, 897443960 -> 31543, 1032713931 -> 10580
    //   10624: goto -> 10628
    //   10627: athrow
    //   10628: invokevirtual getValue : ()Ljava/lang/Object;
    //   10631: goto -> 10635
    //   10634: athrow
    //   10635: checkcast java/lang/Integer
    //   10638: getstatic Perryc.c : I
    //   10641: iflt -> 10655
    //   10644: ldc2_w 2078544106
    //   10647: l2i
    //   10648: ldc_w -1646270356
    //   10651: ixor
    //   10652: goto -> 10663
    //   10655: ldc2_w -702155657
    //   10658: l2i
    //   10659: ldc_w 1215211766
    //   10662: ixor
    //   10663: ldc2_w -1346777648
    //   10666: l2i
    //   10667: ldc_w -1663991595
    //   10670: ixor
    //   10671: ixor
    //   10672: lookupswitch default -> 31499, -1390210684 -> 10700, -715934333 -> 10655
    //   10700: goto -> 10704
    //   10703: athrow
    //   10704: invokevirtual intValue : ()I
    //   10707: goto -> 10711
    //   10710: athrow
    //   10711: getstatic Perryc.0 : I
    //   10714: ifle -> 10728
    //   10717: ldc2_w 1395899807
    //   10720: l2i
    //   10721: ldc_w -218307405
    //   10724: ixor
    //   10725: goto -> 10736
    //   10728: ldc2_w 1320432094
    //   10731: l2i
    //   10732: ldc_w 1200863762
    //   10735: ixor
    //   10736: ldc2_w -1577515254
    //   10739: l2i
    //   10740: ldc_w -203839410
    //   10743: ixor
    //   10744: ixor
    //   10745: lookupswitch default -> 10772, -202377624 -> 30813, 204526024 -> 10728
    //   10772: goto -> 10776
    //   10775: athrow
    //   10776: invokestatic rainbow : (I)Ljava/awt/Color;
    //   10779: goto -> 10783
    //   10782: athrow
    //   10783: getstatic Perryc.0 : I
    //   10786: ifle -> 10800
    //   10789: ldc2_w -803348952
    //   10792: l2i
    //   10793: ldc_w 1528461808
    //   10796: ixor
    //   10797: goto -> 10808
    //   10800: ldc2_w -1076762491
    //   10803: l2i
    //   10804: ldc_w 1901335633
    //   10807: ixor
    //   10808: ldc2_w -994486686
    //   10811: l2i
    //   10812: ldc_w 2082834225
    //   10815: ixor
    //   10816: ixor
    //   10817: lookupswitch default -> 31521, 865826443 -> 10800, 1981361543 -> 10844
    //   10844: goto -> 10848
    //   10847: athrow
    //   10848: invokevirtual getRGB : ()I
    //   10851: goto -> 10855
    //   10854: athrow
    //   10855: ldc2_w -947728236
    //   10858: l2i
    //   10859: ldc_w -947728235
    //   10862: ixor
    //   10863: getstatic Perryc.c : I
    //   10866: iflt -> 10880
    //   10869: ldc2_w 723020337
    //   10872: l2i
    //   10873: ldc_w -1166637912
    //   10876: ixor
    //   10877: goto -> 10888
    //   10880: ldc2_w 1346134110
    //   10883: l2i
    //   10884: ldc_w 462733713
    //   10887: ixor
    //   10888: ldc2_w 550466920
    //   10891: l2i
    //   10892: ldc_w 1377518868
    //   10895: ixor
    //   10896: ixor
    //   10897: lookupswitch default -> 10924, -474292507 -> 30891, 2121026544 -> 10880
    //   10924: goto -> 10928
    //   10927: athrow
    //   10928: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   10931: goto -> 10935
    //   10934: athrow
    //   10935: iinc #10, 12
    //   10938: getstatic Perryc.1 : I
    //   10941: ifeq -> 10955
    //   10944: ldc2_w -1959685587
    //   10947: l2i
    //   10948: ldc_w 1930399222
    //   10951: ixor
    //   10952: goto -> 10963
    //   10955: ldc2_w 507316614
    //   10958: l2i
    //   10959: ldc_w -1323886043
    //   10962: ixor
    //   10963: ldc2_w -1158999156
    //   10966: l2i
    //   10967: ldc_w -912766053
    //   10970: ixor
    //   10971: ixor
    //   10972: lookupswitch default -> 31201, -1957869620 -> 10955, -598127692 -> 11000
    //   11000: aload_0
    //   11001: getstatic Perryc.c : I
    //   11004: iflt -> 11018
    //   11007: ldc2_w -353356257
    //   11010: l2i
    //   11011: ldc_w 1570224918
    //   11014: ixor
    //   11015: goto -> 11026
    //   11018: ldc2_w -1957206612
    //   11021: l2i
    //   11022: ldc_w -177843243
    //   11025: ixor
    //   11026: ldc2_w -538630385
    //   11029: l2i
    //   11030: ldc_w 1827837390
    //   11033: ixor
    //   11034: ixor
    //   11035: lookupswitch default -> 11060, -878125651 -> 11018, 74465224 -> 30931
    //   11060: getfield ping : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11063: getstatic Perryc.c : I
    //   11066: iflt -> 11080
    //   11069: ldc2_w 1499172403
    //   11072: l2i
    //   11073: ldc_w 305084055
    //   11076: ixor
    //   11077: goto -> 11088
    //   11080: ldc2_w -1624029037
    //   11083: l2i
    //   11084: ldc_w 386211606
    //   11087: ixor
    //   11088: ldc2_w 1429851512
    //   11091: l2i
    //   11092: ldc_w -2053565559
    //   11095: ixor
    //   11096: ixor
    //   11097: lookupswitch default -> 11124, -1680578987 -> 31449, 983067316 -> 11080
    //   11124: goto -> 11128
    //   11127: athrow
    //   11128: invokevirtual getValue : ()Ljava/lang/Object;
    //   11131: goto -> 11135
    //   11134: athrow
    //   11135: checkcast java/lang/Boolean
    //   11138: getstatic Perryc.0 : I
    //   11141: ifle -> 11155
    //   11144: ldc2_w 251831989
    //   11147: l2i
    //   11148: ldc_w -1351241308
    //   11151: ixor
    //   11152: goto -> 11163
    //   11155: ldc2_w 239819364
    //   11158: l2i
    //   11159: ldc_w -1785935477
    //   11162: ixor
    //   11163: ldc2_w -2052275689
    //   11166: l2i
    //   11167: ldc_w 1868574849
    //   11170: ixor
    //   11171: ixor
    //   11172: lookupswitch default -> 11200, -5417551 -> 11155, 1253827975 -> 31269
    //   11200: goto -> 11204
    //   11203: athrow
    //   11204: invokevirtual booleanValue : ()Z
    //   11207: goto -> 11211
    //   11210: athrow
    //   11211: ifeq -> 11225
    //   11214: ldc2_w 1927879511
    //   11217: l2i
    //   11218: ldc_w -794717527
    //   11221: ixor
    //   11222: goto -> 11233
    //   11225: ldc2_w -636836402
    //   11228: l2i
    //   11229: ldc_w 2017602611
    //   11232: ixor
    //   11233: ldc2_w 577986744
    //   11236: l2i
    //   11237: ldc_w -76290709
    //   11240: ixor
    //   11241: ixor
    //   11242: tableswitch default -> 11214, 2068319277 -> 11264, 2068319278 -> 12506
    //   11264: getstatic Perryc.c : I
    //   11267: iflt -> 11281
    //   11270: ldc2_w -1722907284
    //   11273: l2i
    //   11274: ldc_w -1432508966
    //   11277: ixor
    //   11278: goto -> 11289
    //   11281: ldc2_w -1969676809
    //   11284: l2i
    //   11285: ldc_w -1659120919
    //   11288: ixor
    //   11289: ldc2_w 1459982889
    //   11292: l2i
    //   11293: ldc_w -657827809
    //   11296: ixor
    //   11297: ixor
    //   11298: lookupswitch default -> 11324, -1138955648 -> 30747, 1475400930 -> 11281
    //   11324: aload_0
    //   11325: getstatic Perryc.0 : I
    //   11328: ifle -> 11342
    //   11331: ldc2_w 1798000129
    //   11334: l2i
    //   11335: ldc_w 290065146
    //   11338: ixor
    //   11339: goto -> 11350
    //   11342: ldc2_w 1990408398
    //   11345: l2i
    //   11346: ldc_w 2064259681
    //   11349: ixor
    //   11350: ldc2_w 227050026
    //   11353: l2i
    //   11354: ldc_w -980730187
    //   11357: ixor
    //   11358: ixor
    //   11359: lookupswitch default -> 11384, -1302136732 -> 31429, 166365360 -> 11342
    //   11384: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   11387: getstatic Perryc.1 : I
    //   11390: ifeq -> 11404
    //   11393: ldc2_w 1322169279
    //   11396: l2i
    //   11397: ldc_w -1598180965
    //   11400: ixor
    //   11401: goto -> 11412
    //   11404: ldc2_w -1889306707
    //   11407: l2i
    //   11408: ldc_w 1442689980
    //   11411: ixor
    //   11412: ldc2_w -737464723
    //   11415: l2i
    //   11416: ldc_w 1488593575
    //   11419: ixor
    //   11420: ixor
    //   11421: lookupswitch default -> 11448, 1656884974 -> 31397, 1665926595 -> 11404
    //   11448: aload #4
    //   11450: getstatic Perryc.1 : I
    //   11453: ifeq -> 11467
    //   11456: ldc2_w 198803538
    //   11459: l2i
    //   11460: ldc_w 1193531270
    //   11463: ixor
    //   11464: goto -> 11475
    //   11467: ldc2_w 499895731
    //   11470: l2i
    //   11471: ldc_w -748253291
    //   11474: ixor
    //   11475: ldc2_w 1263403027
    //   11478: l2i
    //   11479: ldc_w -1106789039
    //   11482: ixor
    //   11483: ixor
    //   11484: lookupswitch default -> 31601, -1179391338 -> 11467, 1004863332 -> 11512
    //   11512: aload_0
    //   11513: getstatic Perryc.c : I
    //   11516: iflt -> 11530
    //   11519: ldc2_w -1376561982
    //   11522: l2i
    //   11523: ldc_w -1398584715
    //   11526: ixor
    //   11527: goto -> 11538
    //   11530: ldc2_w -81251377
    //   11533: l2i
    //   11534: ldc_w 2068875343
    //   11537: ixor
    //   11538: ldc2_w 1908910299
    //   11541: l2i
    //   11542: ldc_w 1323199216
    //   11545: ixor
    //   11546: ixor
    //   11547: lookupswitch default -> 11572, 389590022 -> 11530, 1045027996 -> 31493
    //   11572: getfield PingX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11575: getstatic Perryc.0 : I
    //   11578: ifle -> 11592
    //   11581: ldc2_w 1238319320
    //   11584: l2i
    //   11585: ldc_w 938043720
    //   11588: ixor
    //   11589: goto -> 11600
    //   11592: ldc2_w -56690644
    //   11595: l2i
    //   11596: ldc_w 1963088271
    //   11599: ixor
    //   11600: ldc2_w -1072949437
    //   11603: l2i
    //   11604: ldc_w 183761709
    //   11607: ixor
    //   11608: ixor
    //   11609: lookupswitch default -> 30749, -1260796418 -> 11592, 1130581453 -> 11636
    //   11636: goto -> 11640
    //   11639: athrow
    //   11640: invokevirtual getValue : ()Ljava/lang/Object;
    //   11643: goto -> 11647
    //   11646: athrow
    //   11647: checkcast java/lang/Integer
    //   11650: getstatic Perryc.0 : I
    //   11653: ifle -> 11667
    //   11656: ldc2_w 1596263702
    //   11659: l2i
    //   11660: ldc_w 700162311
    //   11663: ixor
    //   11664: goto -> 11675
    //   11667: ldc2_w -680224090
    //   11670: l2i
    //   11671: ldc_w 1949276821
    //   11674: ixor
    //   11675: ldc2_w -1525495416
    //   11678: l2i
    //   11679: ldc_w 968372148
    //   11682: ixor
    //   11683: ixor
    //   11684: lookupswitch default -> 11712, -1718401282 -> 11667, -365671891 -> 31563
    //   11712: goto -> 11716
    //   11715: athrow
    //   11716: invokevirtual intValue : ()I
    //   11719: goto -> 11723
    //   11722: athrow
    //   11723: i2f
    //   11724: getstatic Perryc.1 : I
    //   11727: ifeq -> 11741
    //   11730: ldc2_w -1692811578
    //   11733: l2i
    //   11734: ldc_w 530537894
    //   11737: ixor
    //   11738: goto -> 11749
    //   11741: ldc2_w -1315051575
    //   11744: l2i
    //   11745: ldc_w -1700605594
    //   11748: ixor
    //   11749: ldc2_w 332800554
    //   11752: l2i
    //   11753: ldc_w 249727335
    //   11756: ixor
    //   11757: ixor
    //   11758: lookupswitch default -> 11784, -1716369363 -> 30885, 1021606320 -> 11741
    //   11784: aload_0
    //   11785: getstatic Perryc.c : I
    //   11788: iflt -> 11802
    //   11791: ldc2_w 2088554139
    //   11794: l2i
    //   11795: ldc_w -1707950757
    //   11798: ixor
    //   11799: goto -> 11810
    //   11802: ldc2_w -1741822168
    //   11805: l2i
    //   11806: ldc_w -1824480263
    //   11809: ixor
    //   11810: ldc2_w -27949288
    //   11813: l2i
    //   11814: ldc_w 420194625
    //   11817: ixor
    //   11818: ixor
    //   11819: lookupswitch default -> 11844, 17849753 -> 31477, 80642515 -> 11802
    //   11844: getfield PingY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11847: getstatic Perryc.0 : I
    //   11850: ifle -> 11864
    //   11853: ldc2_w -1207400875
    //   11856: l2i
    //   11857: ldc_w 1527222007
    //   11860: ixor
    //   11861: goto -> 11872
    //   11864: ldc2_w 1507696192
    //   11867: l2i
    //   11868: ldc_w 1646900490
    //   11871: ixor
    //   11872: ldc2_w 69886580
    //   11875: l2i
    //   11876: ldc_w -1875584493
    //   11879: ixor
    //   11880: ixor
    //   11881: lookupswitch default -> 11908, -1650012602 -> 11864, 1997648069 -> 31443
    //   11908: goto -> 11912
    //   11911: athrow
    //   11912: invokevirtual getValue : ()Ljava/lang/Object;
    //   11915: goto -> 11919
    //   11918: athrow
    //   11919: checkcast java/lang/Integer
    //   11922: getstatic Perryc.c : I
    //   11925: iflt -> 11939
    //   11928: ldc2_w -997236623
    //   11931: l2i
    //   11932: ldc_w -1990946314
    //   11935: ixor
    //   11936: goto -> 11947
    //   11939: ldc2_w -1082133608
    //   11942: l2i
    //   11943: ldc_w 623327508
    //   11946: ixor
    //   11947: ldc2_w -687748201
    //   11950: l2i
    //   11951: ldc_w -1958703683
    //   11954: ixor
    //   11955: ixor
    //   11956: lookupswitch default -> 30909, -971404122 -> 11984, 295352237 -> 11939
    //   11984: goto -> 11988
    //   11987: athrow
    //   11988: invokevirtual intValue : ()I
    //   11991: goto -> 11995
    //   11994: athrow
    //   11995: i2f
    //   11996: getstatic Perryc.1 : I
    //   11999: ifeq -> 12013
    //   12002: ldc2_w 1329815652
    //   12005: l2i
    //   12006: ldc_w -547027817
    //   12009: ixor
    //   12010: goto -> 12021
    //   12013: ldc2_w -376352224
    //   12016: l2i
    //   12017: ldc_w -1686449412
    //   12020: ixor
    //   12021: ldc2_w 1561517388
    //   12024: l2i
    //   12025: ldc_w 1082444050
    //   12028: ixor
    //   12029: ixor
    //   12030: lookupswitch default -> 12056, -1917816659 -> 31391, 1851558097 -> 12013
    //   12056: goto -> 12060
    //   12059: athrow
    //   12060: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   12063: goto -> 12067
    //   12066: athrow
    //   12067: getstatic Perryc.0 : I
    //   12070: ifle -> 12084
    //   12073: ldc2_w 460680764
    //   12076: l2i
    //   12077: ldc_w -243483399
    //   12080: ixor
    //   12081: goto -> 12092
    //   12084: ldc2_w 1403695059
    //   12087: l2i
    //   12088: ldc_w 1932356942
    //   12091: ixor
    //   12092: ldc2_w 1759244494
    //   12095: l2i
    //   12096: ldc_w -1482790043
    //   12099: ixor
    //   12100: ixor
    //   12101: lookupswitch default -> 12128, -1099909044 -> 12084, 625756526 -> 31345
    //   12128: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12131: getstatic Perryc.1 : I
    //   12134: ifeq -> 12148
    //   12137: ldc2_w -205348179
    //   12140: l2i
    //   12141: ldc_w 639738396
    //   12144: ixor
    //   12145: goto -> 12156
    //   12148: ldc2_w -1708231222
    //   12151: l2i
    //   12152: ldc_w 777592415
    //   12155: ixor
    //   12156: ldc2_w -307889013
    //   12159: l2i
    //   12160: ldc_w -1892875216
    //   12163: ixor
    //   12164: ixor
    //   12165: lookupswitch default -> 31607, -1217660918 -> 12148, -687893714 -> 12192
    //   12192: goto -> 12196
    //   12195: athrow
    //   12196: invokevirtual getValue : ()Ljava/lang/Object;
    //   12199: goto -> 12203
    //   12202: athrow
    //   12203: checkcast java/lang/Integer
    //   12206: getstatic Perryc.0 : I
    //   12209: ifle -> 12223
    //   12212: ldc2_w -359969545
    //   12215: l2i
    //   12216: ldc_w 1473059951
    //   12219: ixor
    //   12220: goto -> 12231
    //   12223: ldc2_w 2104539788
    //   12226: l2i
    //   12227: ldc_w -1650467077
    //   12230: ixor
    //   12231: ldc2_w -245773769
    //   12234: l2i
    //   12235: ldc_w -2091386705
    //   12238: ixor
    //   12239: ixor
    //   12240: lookupswitch default -> 31495, -1830725905 -> 12268, -817339904 -> 12223
    //   12268: goto -> 12272
    //   12271: athrow
    //   12272: invokevirtual intValue : ()I
    //   12275: goto -> 12279
    //   12278: athrow
    //   12279: getstatic Perryc.c : I
    //   12282: iflt -> 12296
    //   12285: ldc2_w 1747599788
    //   12288: l2i
    //   12289: ldc_w -107444046
    //   12292: ixor
    //   12293: goto -> 12304
    //   12296: ldc2_w -2090766335
    //   12299: l2i
    //   12300: ldc_w -1931680365
    //   12303: ixor
    //   12304: ldc2_w 1273331823
    //   12307: l2i
    //   12308: ldc_w -1549323845
    //   12311: ixor
    //   12312: ixor
    //   12313: lookupswitch default -> 31487, -402709434 -> 12340, 2045802698 -> 12296
    //   12340: goto -> 12344
    //   12343: athrow
    //   12344: invokestatic rainbow : (I)Ljava/awt/Color;
    //   12347: goto -> 12351
    //   12350: athrow
    //   12351: getstatic Perryc.0 : I
    //   12354: ifle -> 12368
    //   12357: ldc2_w 485544893
    //   12360: l2i
    //   12361: ldc_w -175632353
    //   12364: ixor
    //   12365: goto -> 12376
    //   12368: ldc2_w 1210258333
    //   12371: l2i
    //   12372: ldc_w 1292448364
    //   12375: ixor
    //   12376: ldc2_w 2147454454
    //   12379: l2i
    //   12380: ldc_w -973361956
    //   12383: ixor
    //   12384: ixor
    //   12385: lookupswitch default -> 12412, 124739060 -> 12368, 1400693384 -> 30863
    //   12412: goto -> 12416
    //   12415: athrow
    //   12416: invokevirtual getRGB : ()I
    //   12419: goto -> 12423
    //   12422: athrow
    //   12423: ldc2_w -773603271
    //   12426: l2i
    //   12427: ldc_w -773603272
    //   12430: ixor
    //   12431: getstatic Perryc.c : I
    //   12434: iflt -> 12448
    //   12437: ldc2_w -1608933361
    //   12440: l2i
    //   12441: ldc_w -1072039669
    //   12444: ixor
    //   12445: goto -> 12456
    //   12448: ldc2_w -2064794265
    //   12451: l2i
    //   12452: ldc_w 553731998
    //   12455: ixor
    //   12456: ldc2_w 1707702772
    //   12459: l2i
    //   12460: ldc_w 1970036629
    //   12463: ixor
    //   12464: ixor
    //   12465: lookupswitch default -> 30883, -1253450600 -> 12492, 1889894245 -> 12448
    //   12492: goto -> 12496
    //   12495: athrow
    //   12496: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   12499: goto -> 12503
    //   12502: athrow
    //   12503: iinc #10, 12
    //   12506: getstatic Perryc.0 : I
    //   12509: ifle -> 12523
    //   12512: ldc2_w -1134866994
    //   12515: l2i
    //   12516: ldc_w -1989900577
    //   12519: ixor
    //   12520: goto -> 12531
    //   12523: ldc2_w 298155170
    //   12526: l2i
    //   12527: ldc_w 1499989956
    //   12530: ixor
    //   12531: ldc2_w 441473424
    //   12534: l2i
    //   12535: ldc_w 763977118
    //   12538: ixor
    //   12539: ixor
    //   12540: lookupswitch default -> 12568, 48680735 -> 31401, 1745669908 -> 12523
    //   12568: aload_0
    //   12569: getstatic Perryc.1 : I
    //   12572: ifeq -> 12586
    //   12575: ldc2_w -1510114937
    //   12578: l2i
    //   12579: ldc_w 975496523
    //   12582: ixor
    //   12583: goto -> 12594
    //   12586: ldc2_w 494867326
    //   12589: l2i
    //   12590: ldc_w 1954628233
    //   12593: ixor
    //   12594: ldc2_w -1800903496
    //   12597: l2i
    //   12598: ldc_w -894310829
    //   12601: ixor
    //   12602: ixor
    //   12603: lookupswitch default -> 31275, -1044373977 -> 12586, 937939740 -> 12628
    //   12628: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12631: getstatic Perryc.c : I
    //   12634: iflt -> 12648
    //   12637: ldc2_w 1652274150
    //   12640: l2i
    //   12641: ldc_w 549490772
    //   12644: ixor
    //   12645: goto -> 12656
    //   12648: ldc2_w -200074446
    //   12651: l2i
    //   12652: ldc_w -1810692381
    //   12655: ixor
    //   12656: ldc2_w 1502942446
    //   12659: l2i
    //   12660: ldc_w -1397327987
    //   12663: ixor
    //   12664: ixor
    //   12665: lookupswitch default -> 12692, -1214758703 -> 31593, -127851286 -> 12648
    //   12692: goto -> 12696
    //   12695: athrow
    //   12696: invokevirtual getValue : ()Ljava/lang/Object;
    //   12699: goto -> 12703
    //   12702: athrow
    //   12703: checkcast java/lang/Boolean
    //   12706: getstatic Perryc.0 : I
    //   12709: ifle -> 12723
    //   12712: ldc2_w -1379548088
    //   12715: l2i
    //   12716: ldc_w -2021471057
    //   12719: ixor
    //   12720: goto -> 12731
    //   12723: ldc2_w -570498736
    //   12726: l2i
    //   12727: ldc_w -566236090
    //   12730: ixor
    //   12731: ldc2_w 1371716340
    //   12734: l2i
    //   12735: ldc_w -493750823
    //   12738: ixor
    //   12739: ixor
    //   12740: lookupswitch default -> 30965, -1726724150 -> 12723, -1332592069 -> 12768
    //   12768: goto -> 12772
    //   12771: athrow
    //   12772: invokevirtual booleanValue : ()Z
    //   12775: goto -> 12779
    //   12778: athrow
    //   12779: ifeq -> 12793
    //   12782: ldc2_w 647140709
    //   12785: l2i
    //   12786: ldc_w -855383870
    //   12789: ixor
    //   12790: goto -> 12801
    //   12793: ldc2_w 1858410952
    //   12796: l2i
    //   12797: ldc_w -2058064786
    //   12800: ixor
    //   12801: ldc2_w -856349004
    //   12804: l2i
    //   12805: ldc_w 1212380769
    //   12808: ixor
    //   12809: ixor
    //   12810: tableswitch default -> 12782, 1864836466 -> 12832, 1864836467 -> 14074
    //   12832: getstatic Perryc.c : I
    //   12835: iflt -> 12849
    //   12838: ldc2_w 797019917
    //   12841: l2i
    //   12842: ldc_w 826800607
    //   12845: ixor
    //   12846: goto -> 12857
    //   12849: ldc2_w 1343701296
    //   12852: l2i
    //   12853: ldc_w 338523672
    //   12856: ixor
    //   12857: ldc2_w -856890897
    //   12860: l2i
    //   12861: ldc_w 1235793041
    //   12864: ixor
    //   12865: ixor
    //   12866: lookupswitch default -> 31299, -1685970004 -> 12849, -1048681898 -> 12892
    //   12892: aload_0
    //   12893: getstatic Perryc.1 : I
    //   12896: ifeq -> 12910
    //   12899: ldc2_w 1028109309
    //   12902: l2i
    //   12903: ldc_w 2078021865
    //   12906: ixor
    //   12907: goto -> 12918
    //   12910: ldc2_w 825886689
    //   12913: l2i
    //   12914: ldc_w 698769566
    //   12917: ixor
    //   12918: ldc2_w -813515245
    //   12921: l2i
    //   12922: ldc_w -126068402
    //   12925: ixor
    //   12926: ixor
    //   12927: lookupswitch default -> 12952, -1391866845 -> 12910, 1902464073 -> 30761
    //   12952: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   12955: getstatic Perryc.0 : I
    //   12958: ifle -> 12972
    //   12961: ldc2_w 764046688
    //   12964: l2i
    //   12965: ldc_w -1562324156
    //   12968: ixor
    //   12969: goto -> 12980
    //   12972: ldc2_w -621870216
    //   12975: l2i
    //   12976: ldc_w 1112886241
    //   12979: ixor
    //   12980: ldc2_w 2075045527
    //   12983: l2i
    //   12984: ldc_w -1025151043
    //   12987: ixor
    //   12988: ixor
    //   12989: lookupswitch default -> 13016, -720605155 -> 12972, 908164878 -> 30845
    //   13016: aload #5
    //   13018: getstatic Perryc.0 : I
    //   13021: ifle -> 13035
    //   13024: ldc2_w 1126793825
    //   13027: l2i
    //   13028: ldc_w -608539357
    //   13031: ixor
    //   13032: goto -> 13043
    //   13035: ldc2_w -1784037870
    //   13038: l2i
    //   13039: ldc_w -1515585968
    //   13042: ixor
    //   13043: ldc2_w 1773629480
    //   13046: l2i
    //   13047: ldc_w 1526931960
    //   13050: ixor
    //   13051: ixor
    //   13052: lookupswitch default -> 30769, -1440235886 -> 13035, 45355410 -> 13080
    //   13080: aload_0
    //   13081: getstatic Perryc.c : I
    //   13084: iflt -> 13098
    //   13087: ldc2_w 1796826072
    //   13090: l2i
    //   13091: ldc_w 707977901
    //   13094: ixor
    //   13095: goto -> 13106
    //   13098: ldc2_w 1599657660
    //   13101: l2i
    //   13102: ldc_w 295374925
    //   13105: ixor
    //   13106: ldc2_w -1599502994
    //   13109: l2i
    //   13110: ldc_w 469628823
    //   13113: ixor
    //   13114: ixor
    //   13115: lookupswitch default -> 31387, -174607352 -> 13140, -92277876 -> 13098
    //   13140: getfield SpeedX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13143: getstatic Perryc.c : I
    //   13146: iflt -> 13160
    //   13149: ldc2_w 88128887
    //   13152: l2i
    //   13153: ldc_w 388564903
    //   13156: ixor
    //   13157: goto -> 13168
    //   13160: ldc2_w 833836243
    //   13163: l2i
    //   13164: ldc_w 412497424
    //   13167: ixor
    //   13168: ldc2_w 1959756762
    //   13171: l2i
    //   13172: ldc_w 1035185621
    //   13175: ixor
    //   13176: ixor
    //   13177: lookupswitch default -> 31047, 1528141023 -> 13160, 1616465100 -> 13204
    //   13204: goto -> 13208
    //   13207: athrow
    //   13208: invokevirtual getValue : ()Ljava/lang/Object;
    //   13211: goto -> 13215
    //   13214: athrow
    //   13215: checkcast java/lang/Integer
    //   13218: getstatic Perryc.c : I
    //   13221: iflt -> 13235
    //   13224: ldc2_w 577897899
    //   13227: l2i
    //   13228: ldc_w -1094056750
    //   13231: ixor
    //   13232: goto -> 13243
    //   13235: ldc2_w -320104619
    //   13238: l2i
    //   13239: ldc_w 1323149564
    //   13242: ixor
    //   13243: ldc2_w 1168799431
    //   13246: l2i
    //   13247: ldc_w -1355497443
    //   13250: ixor
    //   13251: ixor
    //   13252: lookupswitch default -> 31135, 1219004787 -> 13280, 1982248867 -> 13235
    //   13280: goto -> 13284
    //   13283: athrow
    //   13284: invokevirtual intValue : ()I
    //   13287: goto -> 13291
    //   13290: athrow
    //   13291: i2f
    //   13292: getstatic Perryc.0 : I
    //   13295: ifle -> 13309
    //   13298: ldc2_w -998584669
    //   13301: l2i
    //   13302: ldc_w 66962001
    //   13305: ixor
    //   13306: goto -> 13317
    //   13309: ldc2_w 1283945923
    //   13312: l2i
    //   13313: ldc_w -651682173
    //   13316: ixor
    //   13317: ldc2_w -190434044
    //   13320: l2i
    //   13321: ldc_w -481217070
    //   13324: ixor
    //   13325: ixor
    //   13326: lookupswitch default -> 30933, -2108134506 -> 13352, -797963228 -> 13309
    //   13352: aload_0
    //   13353: getstatic Perryc.0 : I
    //   13356: ifle -> 13370
    //   13359: ldc2_w 1432055847
    //   13362: l2i
    //   13363: ldc_w -1721815099
    //   13366: ixor
    //   13367: goto -> 13378
    //   13370: ldc2_w -736176240
    //   13373: l2i
    //   13374: ldc_w -889845909
    //   13377: ixor
    //   13378: ldc2_w -1009973886
    //   13381: l2i
    //   13382: ldc_w 1549256526
    //   13385: ixor
    //   13386: ixor
    //   13387: lookupswitch default -> 30827, -2123230665 -> 13412, 1402903854 -> 13370
    //   13412: getfield SpeedY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13415: getstatic Perryc.c : I
    //   13418: iflt -> 13432
    //   13421: ldc2_w 1327258721
    //   13424: l2i
    //   13425: ldc_w 507134813
    //   13428: ixor
    //   13429: goto -> 13440
    //   13432: ldc2_w 229000246
    //   13435: l2i
    //   13436: ldc_w -1705711046
    //   13439: ixor
    //   13440: ldc2_w 783370864
    //   13443: l2i
    //   13444: ldc_w -1719665372
    //   13447: ixor
    //   13448: ixor
    //   13449: lookupswitch default -> 13476, -420960152 -> 30923, 1418185633 -> 13432
    //   13476: goto -> 13480
    //   13479: athrow
    //   13480: invokevirtual getValue : ()Ljava/lang/Object;
    //   13483: goto -> 13487
    //   13486: athrow
    //   13487: checkcast java/lang/Integer
    //   13490: getstatic Perryc.0 : I
    //   13493: ifle -> 13507
    //   13496: ldc2_w -1853271722
    //   13499: l2i
    //   13500: ldc_w 1550040301
    //   13503: ixor
    //   13504: goto -> 13515
    //   13507: ldc2_w 1811551631
    //   13510: l2i
    //   13511: ldc_w 594094029
    //   13514: ixor
    //   13515: ldc2_w 310494539
    //   13518: l2i
    //   13519: ldc_w 1244280914
    //   13522: ixor
    //   13523: ixor
    //   13524: lookupswitch default -> 13552, -1790898014 -> 31033, 1252000647 -> 13507
    //   13552: goto -> 13556
    //   13555: athrow
    //   13556: invokevirtual intValue : ()I
    //   13559: goto -> 13563
    //   13562: athrow
    //   13563: i2f
    //   13564: getstatic Perryc.c : I
    //   13567: iflt -> 13581
    //   13570: ldc2_w -418778874
    //   13573: l2i
    //   13574: ldc_w -1511874414
    //   13577: ixor
    //   13578: goto -> 13589
    //   13581: ldc2_w -1805411365
    //   13584: l2i
    //   13585: ldc_w -390288295
    //   13588: ixor
    //   13589: ldc2_w -1213498216
    //   13592: l2i
    //   13593: ldc_w -1978565436
    //   13596: ixor
    //   13597: ixor
    //   13598: lookupswitch default -> 30757, 1097152478 -> 13624, 2136035784 -> 13581
    //   13624: goto -> 13628
    //   13627: athrow
    //   13628: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   13631: goto -> 13635
    //   13634: athrow
    //   13635: getstatic Perryc.c : I
    //   13638: iflt -> 13652
    //   13641: ldc2_w -789340843
    //   13644: l2i
    //   13645: ldc_w -14790322
    //   13648: ixor
    //   13649: goto -> 13660
    //   13652: ldc2_w 502866510
    //   13655: l2i
    //   13656: ldc_w 1818763603
    //   13659: ixor
    //   13660: ldc2_w -819865662
    //   13663: l2i
    //   13664: ldc_w -515735054
    //   13667: ixor
    //   13668: ixor
    //   13669: lookupswitch default -> 13696, 26122795 -> 30969, 1408515967 -> 13652
    //   13696: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13699: getstatic Perryc.c : I
    //   13702: iflt -> 13716
    //   13705: ldc2_w 278780005
    //   13708: l2i
    //   13709: ldc_w 1391113952
    //   13712: ixor
    //   13713: goto -> 13724
    //   13716: ldc2_w -2070337873
    //   13719: l2i
    //   13720: ldc_w 692511072
    //   13723: ixor
    //   13724: ldc2_w 423706484
    //   13727: l2i
    //   13728: ldc_w -1865029819
    //   13731: ixor
    //   13732: ixor
    //   13733: lookupswitch default -> 13760, -874269004 -> 31225, 1641429060 -> 13716
    //   13760: goto -> 13764
    //   13763: athrow
    //   13764: invokevirtual getValue : ()Ljava/lang/Object;
    //   13767: goto -> 13771
    //   13770: athrow
    //   13771: checkcast java/lang/Integer
    //   13774: getstatic Perryc.0 : I
    //   13777: ifle -> 13791
    //   13780: ldc2_w -373805165
    //   13783: l2i
    //   13784: ldc_w 481918834
    //   13787: ixor
    //   13788: goto -> 13799
    //   13791: ldc2_w 58186174
    //   13794: l2i
    //   13795: ldc_w 2427735
    //   13798: ixor
    //   13799: ldc2_w -481447388
    //   13802: l2i
    //   13803: ldc_w -1131543637
    //   13806: ixor
    //   13807: ixor
    //   13808: lookupswitch default -> 31595, -1430068882 -> 13791, 1553032038 -> 13836
    //   13836: goto -> 13840
    //   13839: athrow
    //   13840: invokevirtual intValue : ()I
    //   13843: goto -> 13847
    //   13846: athrow
    //   13847: getstatic Perryc.c : I
    //   13850: iflt -> 13864
    //   13853: ldc2_w -1319615140
    //   13856: l2i
    //   13857: ldc_w 280382750
    //   13860: ixor
    //   13861: goto -> 13872
    //   13864: ldc2_w -1113625628
    //   13867: l2i
    //   13868: ldc_w 297686909
    //   13871: ixor
    //   13872: ldc2_w -819703739
    //   13875: l2i
    //   13876: ldc_w -1912577260
    //   13879: ixor
    //   13880: ixor
    //   13881: lookupswitch default -> 13908, -1501022475 -> 13864, -523617517 -> 30867
    //   13908: goto -> 13912
    //   13911: athrow
    //   13912: invokestatic rainbow : (I)Ljava/awt/Color;
    //   13915: goto -> 13919
    //   13918: athrow
    //   13919: getstatic Perryc.0 : I
    //   13922: ifle -> 13936
    //   13925: ldc2_w 1621225519
    //   13928: l2i
    //   13929: ldc_w -995369274
    //   13932: ixor
    //   13933: goto -> 13944
    //   13936: ldc2_w -91989336
    //   13939: l2i
    //   13940: ldc_w 177363090
    //   13943: ixor
    //   13944: ldc2_w 1081422492
    //   13947: l2i
    //   13948: ldc_w 1888132228
    //   13951: ixor
    //   13952: ixor
    //   13953: lookupswitch default -> 13980, -1795849999 -> 31539, 715932556 -> 13936
    //   13980: goto -> 13984
    //   13983: athrow
    //   13984: invokevirtual getRGB : ()I
    //   13987: goto -> 13991
    //   13990: athrow
    //   13991: ldc2_w -1205895548
    //   13994: l2i
    //   13995: ldc_w -1205895547
    //   13998: ixor
    //   13999: getstatic Perryc.c : I
    //   14002: iflt -> 14016
    //   14005: ldc2_w 66254068
    //   14008: l2i
    //   14009: ldc_w 1997188860
    //   14012: ixor
    //   14013: goto -> 14024
    //   14016: ldc2_w -945117318
    //   14019: l2i
    //   14020: ldc_w -1642416142
    //   14023: ixor
    //   14024: ldc2_w 987910462
    //   14027: l2i
    //   14028: ldc_w 26169728
    //   14031: ixor
    //   14032: ixor
    //   14033: lookupswitch default -> 31133, 1335188150 -> 14016, 1658654774 -> 14060
    //   14060: goto -> 14064
    //   14063: athrow
    //   14064: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   14067: goto -> 14071
    //   14070: athrow
    //   14071: iinc #10, 12
    //   14074: getstatic Perryc.c : I
    //   14077: iflt -> 14091
    //   14080: ldc2_w -636934698
    //   14083: l2i
    //   14084: ldc_w -1182871661
    //   14087: ixor
    //   14088: goto -> 14099
    //   14091: ldc2_w 1613193356
    //   14094: l2i
    //   14095: ldc_w -317315678
    //   14098: ixor
    //   14099: ldc2_w -1969785969
    //   14102: l2i
    //   14103: ldc_w 1296123860
    //   14106: ixor
    //   14107: ixor
    //   14108: lookupswitch default -> 14136, -1532895714 -> 31287, -933008425 -> 14091
    //   14136: aload_0
    //   14137: getstatic Perryc.0 : I
    //   14140: ifle -> 14154
    //   14143: ldc2_w 1592665926
    //   14146: l2i
    //   14147: ldc_w -746787536
    //   14150: ixor
    //   14151: goto -> 14162
    //   14154: ldc2_w 1278912964
    //   14157: l2i
    //   14158: ldc_w -1374948238
    //   14161: ixor
    //   14162: ldc2_w 1068529349
    //   14165: l2i
    //   14166: ldc_w -1534402681
    //   14169: ixor
    //   14170: ixor
    //   14171: lookupswitch default -> 30957, 380134196 -> 14154, 2030826740 -> 14196
    //   14196: getfield time : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14199: getstatic Perryc.1 : I
    //   14202: ifeq -> 14216
    //   14205: ldc2_w 1341736905
    //   14208: l2i
    //   14209: ldc_w -1295726957
    //   14212: ixor
    //   14213: goto -> 14224
    //   14216: ldc2_w 1324800395
    //   14219: l2i
    //   14220: ldc_w 802930048
    //   14223: ixor
    //   14224: ldc2_w -1705910475
    //   14227: l2i
    //   14228: ldc_w -894351634
    //   14231: ixor
    //   14232: ixor
    //   14233: lookupswitch default -> 30793, -1378019199 -> 14216, 835583440 -> 14260
    //   14260: goto -> 14264
    //   14263: athrow
    //   14264: invokevirtual getValue : ()Ljava/lang/Object;
    //   14267: goto -> 14271
    //   14270: athrow
    //   14271: checkcast java/lang/Boolean
    //   14274: getstatic Perryc.0 : I
    //   14277: ifle -> 14291
    //   14280: ldc2_w 1965330116
    //   14283: l2i
    //   14284: ldc_w 594085389
    //   14287: ixor
    //   14288: goto -> 14299
    //   14291: ldc2_w -386897307
    //   14294: l2i
    //   14295: ldc_w 1681604433
    //   14298: ixor
    //   14299: ldc2_w -1957318538
    //   14302: l2i
    //   14303: ldc_w -1459604263
    //   14306: ixor
    //   14307: ixor
    //   14308: lookupswitch default -> 14336, 1605761124 -> 14291, 1947733094 -> 31103
    //   14336: goto -> 14340
    //   14339: athrow
    //   14340: invokevirtual booleanValue : ()Z
    //   14343: goto -> 14347
    //   14346: athrow
    //   14347: ifeq -> 14361
    //   14350: ldc2_w -266694638
    //   14353: l2i
    //   14354: ldc_w -1079189420
    //   14357: ixor
    //   14358: goto -> 14369
    //   14361: ldc2_w 1810194814
    //   14364: l2i
    //   14365: ldc_w 609423679
    //   14368: ixor
    //   14369: ldc2_w -1217058360
    //   14372: l2i
    //   14373: ldc_w -1532207731
    //   14376: ixor
    //   14377: ixor
    //   14378: tableswitch default -> 14350, 1550779395 -> 14400, 1550779396 -> 15793
    //   14400: getstatic Perryc.c : I
    //   14403: iflt -> 14417
    //   14406: ldc2_w 510840418
    //   14409: l2i
    //   14410: ldc_w -753198678
    //   14413: ixor
    //   14414: goto -> 14425
    //   14417: ldc2_w -36519076
    //   14420: l2i
    //   14421: ldc_w 599454560
    //   14424: ixor
    //   14425: ldc2_w -2063498429
    //   14428: l2i
    //   14429: ldc_w 1653222718
    //   14432: ixor
    //   14433: ixor
    //   14434: lookupswitch default -> 31267, 719485365 -> 14417, 971218497 -> 14460
    //   14460: aload_0
    //   14461: getstatic Perryc.1 : I
    //   14464: ifeq -> 14478
    //   14467: ldc2_w 2072492641
    //   14470: l2i
    //   14471: ldc_w 1845432357
    //   14474: ixor
    //   14475: goto -> 14486
    //   14478: ldc2_w -956784437
    //   14481: l2i
    //   14482: ldc_w -1254988055
    //   14485: ixor
    //   14486: ldc2_w -564232871
    //   14489: l2i
    //   14490: ldc_w 187195552
    //   14493: ixor
    //   14494: ixor
    //   14495: lookupswitch default -> 31503, -1497572389 -> 14520, -1022445635 -> 14478
    //   14520: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   14523: getstatic Perryc.c : I
    //   14526: iflt -> 14540
    //   14529: ldc2_w 173937293
    //   14532: l2i
    //   14533: ldc_w 1693083075
    //   14536: ixor
    //   14537: goto -> 14548
    //   14540: ldc2_w -1608124425
    //   14543: l2i
    //   14544: ldc_w 301347673
    //   14547: ixor
    //   14548: ldc2_w 1999266089
    //   14551: l2i
    //   14552: ldc_w 1190810142
    //   14555: ixor
    //   14556: ixor
    //   14557: lookupswitch default -> 30837, -2147223655 -> 14584, 1600406649 -> 14540
    //   14584: aload #9
    //   14586: getstatic Perryc.c : I
    //   14589: iflt -> 14603
    //   14592: ldc2_w -1203420150
    //   14595: l2i
    //   14596: ldc_w 842982107
    //   14599: ixor
    //   14600: goto -> 14611
    //   14603: ldc2_w 1474309265
    //   14606: l2i
    //   14607: ldc_w -1979002125
    //   14610: ixor
    //   14611: ldc2_w -1899139437
    //   14614: l2i
    //   14615: ldc_w 771801173
    //   14618: ixor
    //   14619: ixor
    //   14620: lookupswitch default -> 31579, 716572695 -> 14603, 2099728548 -> 14648
    //   14648: aload_0
    //   14649: getstatic Perryc.1 : I
    //   14652: ifeq -> 14666
    //   14655: ldc2_w -331909574
    //   14658: l2i
    //   14659: ldc_w 884088386
    //   14662: ixor
    //   14663: goto -> 14674
    //   14666: ldc2_w -318148306
    //   14669: l2i
    //   14670: ldc_w -347745786
    //   14673: ixor
    //   14674: ldc2_w 791336567
    //   14677: l2i
    //   14678: ldc_w 575942238
    //   14681: ixor
    //   14682: ixor
    //   14683: lookupswitch default -> 14708, -704933807 -> 30811, 2030297064 -> 14666
    //   14708: getfield TimeX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14711: getstatic Perryc.0 : I
    //   14714: ifle -> 14728
    //   14717: ldc2_w -805651836
    //   14720: l2i
    //   14721: ldc_w -1169558161
    //   14724: ixor
    //   14725: goto -> 14736
    //   14728: ldc2_w 508621912
    //   14731: l2i
    //   14732: ldc_w -23719531
    //   14735: ixor
    //   14736: ldc2_w -1829597723
    //   14739: l2i
    //   14740: ldc_w -1734511443
    //   14743: ixor
    //   14744: ixor
    //   14745: lookupswitch default -> 30815, -358015867 -> 14772, 2145171107 -> 14728
    //   14772: goto -> 14776
    //   14775: athrow
    //   14776: invokevirtual getValue : ()Ljava/lang/Object;
    //   14779: goto -> 14783
    //   14782: athrow
    //   14783: checkcast java/lang/Integer
    //   14786: getstatic Perryc.c : I
    //   14789: iflt -> 14803
    //   14792: ldc2_w 1520584526
    //   14795: l2i
    //   14796: ldc_w -57587149
    //   14799: ixor
    //   14800: goto -> 14811
    //   14803: ldc2_w 1846263892
    //   14806: l2i
    //   14807: ldc_w -295383726
    //   14810: ixor
    //   14811: ldc2_w 1101737400
    //   14814: l2i
    //   14815: ldc_w -837517406
    //   14818: ixor
    //   14819: ixor
    //   14820: lookupswitch default -> 31583, 265314076 -> 14848, 697065319 -> 14803
    //   14848: goto -> 14852
    //   14851: athrow
    //   14852: invokevirtual intValue : ()I
    //   14855: goto -> 14859
    //   14858: athrow
    //   14859: i2f
    //   14860: getstatic Perryc.0 : I
    //   14863: ifle -> 14877
    //   14866: ldc2_w -1217062737
    //   14869: l2i
    //   14870: ldc_w -1697719542
    //   14873: ixor
    //   14874: goto -> 14885
    //   14877: ldc2_w -85003555
    //   14880: l2i
    //   14881: ldc_w -1268776249
    //   14884: ixor
    //   14885: ldc2_w 1130161525
    //   14888: l2i
    //   14889: ldc_w 484920444
    //   14892: ixor
    //   14893: ixor
    //   14894: lookupswitch default -> 30943, 288708883 -> 14920, 1912629932 -> 14877
    //   14920: aload_0
    //   14921: getstatic Perryc.c : I
    //   14924: iflt -> 14938
    //   14927: ldc2_w -600313593
    //   14930: l2i
    //   14931: ldc_w 530000212
    //   14934: ixor
    //   14935: goto -> 14946
    //   14938: ldc2_w -111596608
    //   14941: l2i
    //   14942: ldc_w -322567492
    //   14945: ixor
    //   14946: ldc2_w 201343947
    //   14949: l2i
    //   14950: ldc_w -485157154
    //   14953: ixor
    //   14954: ixor
    //   14955: lookupswitch default -> 14980, -1754046193 -> 14938, 750095686 -> 31589
    //   14980: getfield TimeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14983: getstatic Perryc.c : I
    //   14986: iflt -> 15000
    //   14989: ldc2_w -523728434
    //   14992: l2i
    //   14993: ldc_w -1509518690
    //   14996: ixor
    //   14997: goto -> 15008
    //   15000: ldc2_w -858116342
    //   15003: l2i
    //   15004: ldc_w -1295174940
    //   15007: ixor
    //   15008: ldc2_w -219874569
    //   15011: l2i
    //   15012: ldc_w 162321637
    //   15015: ixor
    //   15016: ixor
    //   15017: lookupswitch default -> 15044, -1115278014 -> 30767, 1270368443 -> 15000
    //   15044: goto -> 15048
    //   15047: athrow
    //   15048: invokevirtual getValue : ()Ljava/lang/Object;
    //   15051: goto -> 15055
    //   15054: athrow
    //   15055: checkcast java/lang/Integer
    //   15058: getstatic Perryc.0 : I
    //   15061: ifle -> 15075
    //   15064: ldc2_w 534807321
    //   15067: l2i
    //   15068: ldc_w -1912081396
    //   15071: ixor
    //   15072: goto -> 15083
    //   15075: ldc2_w 151822475
    //   15078: l2i
    //   15079: ldc_w 468571302
    //   15082: ixor
    //   15083: ldc2_w 952797103
    //   15086: l2i
    //   15087: ldc_w -324488749
    //   15090: ixor
    //   15091: ixor
    //   15092: lookupswitch default -> 15120, -2113315762 -> 15075, 1166360937 -> 31177
    //   15120: goto -> 15124
    //   15123: athrow
    //   15124: invokevirtual intValue : ()I
    //   15127: goto -> 15131
    //   15130: athrow
    //   15131: i2f
    //   15132: getstatic Perryc.1 : I
    //   15135: ifeq -> 15149
    //   15138: ldc2_w 523758656
    //   15141: l2i
    //   15142: ldc_w 1474645905
    //   15145: ixor
    //   15146: goto -> 15157
    //   15149: ldc2_w 1012805179
    //   15152: l2i
    //   15153: ldc_w -617426543
    //   15156: ixor
    //   15157: ldc2_w 415245440
    //   15160: l2i
    //   15161: ldc_w -825689022
    //   15164: ixor
    //   15165: ixor
    //   15166: lookupswitch default -> 15192, -1629848813 -> 30879, -844755335 -> 15149
    //   15192: goto -> 15196
    //   15195: athrow
    //   15196: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   15199: goto -> 15203
    //   15202: athrow
    //   15203: getstatic Perryc.0 : I
    //   15206: ifle -> 15220
    //   15209: ldc2_w -1020713270
    //   15212: l2i
    //   15213: ldc_w 1975808417
    //   15216: ixor
    //   15217: goto -> 15228
    //   15220: ldc2_w 712666497
    //   15223: l2i
    //   15224: ldc_w 851640972
    //   15227: ixor
    //   15228: ldc2_w -2037830501
    //   15231: l2i
    //   15232: ldc_w 735757388
    //   15235: ixor
    //   15236: ixor
    //   15237: lookupswitch default -> 31423, -1242920998 -> 15264, 465485756 -> 15220
    //   15264: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15267: getstatic Perryc.0 : I
    //   15270: ifle -> 15284
    //   15273: ldc2_w 398122495
    //   15276: l2i
    //   15277: ldc_w -738233577
    //   15280: ixor
    //   15281: goto -> 15292
    //   15284: ldc2_w 648810914
    //   15287: l2i
    //   15288: ldc_w -1920184532
    //   15291: ixor
    //   15292: ldc2_w 443577531
    //   15295: l2i
    //   15296: ldc_w -1607986963
    //   15299: ixor
    //   15300: ixor
    //   15301: lookupswitch default -> 31071, 293092056 -> 15328, 2115881662 -> 15284
    //   15328: goto -> 15332
    //   15331: athrow
    //   15332: invokevirtual getValue : ()Ljava/lang/Object;
    //   15335: goto -> 15339
    //   15338: athrow
    //   15339: checkcast java/lang/Integer
    //   15342: getstatic Perryc.0 : I
    //   15345: ifle -> 15359
    //   15348: ldc2_w 150484293
    //   15351: l2i
    //   15352: ldc_w 107315480
    //   15355: ixor
    //   15356: goto -> 15367
    //   15359: ldc2_w 1697936830
    //   15362: l2i
    //   15363: ldc_w -1786716468
    //   15366: ixor
    //   15367: ldc2_w 882483273
    //   15370: l2i
    //   15371: ldc_w 870747043
    //   15374: ixor
    //   15375: ixor
    //   15376: lookupswitch default -> 15404, -1265952498 -> 15359, 165846967 -> 31113
    //   15404: goto -> 15408
    //   15407: athrow
    //   15408: invokevirtual intValue : ()I
    //   15411: goto -> 15415
    //   15414: athrow
    //   15415: getstatic Perryc.c : I
    //   15418: iflt -> 15432
    //   15421: ldc2_w -106090968
    //   15424: l2i
    //   15425: ldc_w -372041950
    //   15428: ixor
    //   15429: goto -> 15440
    //   15432: ldc2_w 211944661
    //   15435: l2i
    //   15436: ldc_w -1279131193
    //   15439: ixor
    //   15440: ldc2_w 432398652
    //   15443: l2i
    //   15444: ldc_w -1251464874
    //   15447: ixor
    //   15448: ixor
    //   15449: lookupswitch default -> 15476, -1126960800 -> 31197, -265463532 -> 15432
    //   15476: goto -> 15480
    //   15479: athrow
    //   15480: invokestatic rainbow : (I)Ljava/awt/Color;
    //   15483: goto -> 15487
    //   15486: athrow
    //   15487: getstatic Perryc.0 : I
    //   15490: ifle -> 15504
    //   15493: ldc2_w 71404828
    //   15496: l2i
    //   15497: ldc_w 456191100
    //   15500: ixor
    //   15501: goto -> 15512
    //   15504: ldc2_w 1397604995
    //   15507: l2i
    //   15508: ldc_w -1761952550
    //   15511: ixor
    //   15512: ldc2_w 415705138
    //   15515: l2i
    //   15516: ldc_w 1670732756
    //   15519: ixor
    //   15520: ixor
    //   15521: lookupswitch default -> 15548, 82605491 -> 15504, 1680020102 -> 30945
    //   15548: goto -> 15552
    //   15551: athrow
    //   15552: invokevirtual getRGB : ()I
    //   15555: goto -> 15559
    //   15558: athrow
    //   15559: ldc2_w 1026415116
    //   15562: l2i
    //   15563: ldc_w 1026415117
    //   15566: ixor
    //   15567: getstatic Perryc.c : I
    //   15570: iflt -> 15584
    //   15573: ldc2_w 700358578
    //   15576: l2i
    //   15577: ldc_w -449908817
    //   15580: ixor
    //   15581: goto -> 15592
    //   15584: ldc2_w -1148091817
    //   15587: l2i
    //   15588: ldc_w 123835309
    //   15591: ixor
    //   15592: ldc2_w -54845841
    //   15595: l2i
    //   15596: ldc_w 1143127930
    //   15599: ixor
    //   15600: ixor
    //   15601: lookupswitch default -> 15628, -318449944 -> 15584, 1946800392 -> 31585
    //   15628: goto -> 15632
    //   15631: athrow
    //   15632: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   15635: goto -> 15639
    //   15638: athrow
    //   15639: getstatic Perryc.c : I
    //   15642: iflt -> 15656
    //   15645: ldc2_w 1222636269
    //   15648: l2i
    //   15649: ldc_w 1146064396
    //   15652: ixor
    //   15653: goto -> 15664
    //   15656: ldc2_w -307637902
    //   15659: l2i
    //   15660: ldc_w -1077166649
    //   15663: ixor
    //   15664: ldc2_w -1497651327
    //   15667: l2i
    //   15668: ldc_w 352352272
    //   15671: ixor
    //   15672: ixor
    //   15673: lookupswitch default -> 31405, -1087659152 -> 15656, -505826524 -> 15700
    //   15700: aload #11
    //   15702: ldc2_w -344851791
    //   15705: l2i
    //   15706: ldc_w -344851791
    //   15709: ixor
    //   15710: getstatic Perryc.c : I
    //   15713: iflt -> 15727
    //   15716: ldc2_w 173078969
    //   15719: l2i
    //   15720: ldc_w 667346623
    //   15723: ixor
    //   15724: goto -> 15735
    //   15727: ldc2_w 2133111453
    //   15730: l2i
    //   15731: ldc_w -421664063
    //   15734: ixor
    //   15735: ldc2_w -1698957331
    //   15738: l2i
    //   15739: ldc_w 2123469985
    //   15742: ixor
    //   15743: ixor
    //   15744: lookupswitch default -> 31063, -910394294 -> 15727, 2110995216 -> 15772
    //   15772: aload #11
    //   15774: ldc2_w 1025407870
    //   15777: l2i
    //   15778: ldc_w 1025407870
    //   15781: ixor
    //   15782: iaload
    //   15783: ldc2_w 127354722
    //   15786: l2i
    //   15787: ldc_w 127354723
    //   15790: ixor
    //   15791: iadd
    //   15792: iastore
    //   15793: getstatic Perryc.1 : I
    //   15796: ifeq -> 15810
    //   15799: ldc2_w 1362967745
    //   15802: l2i
    //   15803: ldc_w 2040310186
    //   15806: ixor
    //   15807: goto -> 15818
    //   15810: ldc2_w -284752701
    //   15813: l2i
    //   15814: ldc_w -88544375
    //   15817: ixor
    //   15818: ldc2_w 1858996365
    //   15821: l2i
    //   15822: ldc_w -406994603
    //   15825: ixor
    //   15826: ixor
    //   15827: lookupswitch default -> 31209, -1664342382 -> 15852, -1580049229 -> 15810
    //   15852: aload_0
    //   15853: getstatic Perryc.1 : I
    //   15856: ifeq -> 15870
    //   15859: ldc2_w 1481499099
    //   15862: l2i
    //   15863: ldc_w 718023840
    //   15866: ixor
    //   15867: goto -> 15878
    //   15870: ldc2_w -1909581895
    //   15873: l2i
    //   15874: ldc_w -786251163
    //   15877: ixor
    //   15878: ldc2_w -1043858018
    //   15881: l2i
    //   15882: ldc_w -1284275033
    //   15885: ixor
    //   15886: ixor
    //   15887: lookupswitch default -> 15912, 3519554 -> 31383, 1325645909 -> 15870
    //   15912: getfield crystals : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15915: getstatic Perryc.c : I
    //   15918: iflt -> 15932
    //   15921: ldc2_w -1605064288
    //   15924: l2i
    //   15925: ldc_w -1125689389
    //   15928: ixor
    //   15929: goto -> 15940
    //   15932: ldc2_w -1704041529
    //   15935: l2i
    //   15936: ldc_w -640508029
    //   15939: ixor
    //   15940: ldc2_w 1546673582
    //   15943: l2i
    //   15944: ldc_w 393943679
    //   15947: ixor
    //   15948: ixor
    //   15949: lookupswitch default -> 15976, -2061205597 -> 15932, 1475918242 -> 31373
    //   15976: goto -> 15980
    //   15979: athrow
    //   15980: invokevirtual getValue : ()Ljava/lang/Object;
    //   15983: goto -> 15987
    //   15986: athrow
    //   15987: checkcast java/lang/Boolean
    //   15990: getstatic Perryc.c : I
    //   15993: iflt -> 16007
    //   15996: ldc2_w 1246969938
    //   15999: l2i
    //   16000: ldc_w -1576444396
    //   16003: ixor
    //   16004: goto -> 16015
    //   16007: ldc2_w -679151815
    //   16010: l2i
    //   16011: ldc_w -1449592552
    //   16014: ixor
    //   16015: ldc2_w -1887243491
    //   16018: l2i
    //   16019: ldc_w 1057625736
    //   16022: ixor
    //   16023: ixor
    //   16024: lookupswitch default -> 16052, 637592776 -> 16007, 1490222035 -> 31037
    //   16052: goto -> 16056
    //   16055: athrow
    //   16056: invokevirtual booleanValue : ()Z
    //   16059: goto -> 16063
    //   16062: athrow
    //   16063: ifeq -> 16077
    //   16066: ldc2_w 1818938519
    //   16069: l2i
    //   16070: ldc_w 1071343041
    //   16073: ixor
    //   16074: goto -> 16085
    //   16077: ldc2_w 844827635
    //   16080: l2i
    //   16081: ldc_w 1642767018
    //   16084: ixor
    //   16085: ldc2_w -1611639310
    //   16088: l2i
    //   16089: ldc_w 1154309795
    //   16092: ixor
    //   16093: ixor
    //   16094: tableswitch default -> 16066, -2004049401 -> 16116, -2004049400 -> 17358
    //   16116: getstatic Perryc.0 : I
    //   16119: ifle -> 16133
    //   16122: ldc2_w -649579263
    //   16125: l2i
    //   16126: ldc_w 27141924
    //   16129: ixor
    //   16130: goto -> 16141
    //   16133: ldc2_w -1467360378
    //   16136: l2i
    //   16137: ldc_w -65782902
    //   16140: ixor
    //   16141: ldc2_w -435952007
    //   16144: l2i
    //   16145: ldc_w -276102872
    //   16148: ixor
    //   16149: ixor
    //   16150: lookupswitch default -> 16176, -782305932 -> 31523, 581426748 -> 16133
    //   16176: aload_0
    //   16177: getstatic Perryc.0 : I
    //   16180: ifle -> 16194
    //   16183: ldc2_w -576862543
    //   16186: l2i
    //   16187: ldc_w 300418616
    //   16190: ixor
    //   16191: goto -> 16202
    //   16194: ldc2_w -699586091
    //   16197: l2i
    //   16198: ldc_w 2128172120
    //   16201: ixor
    //   16202: ldc2_w -1640027356
    //   16205: l2i
    //   16206: ldc_w -402834576
    //   16209: ixor
    //   16210: ixor
    //   16211: lookupswitch default -> 16236, -1506908336 -> 16194, -1246244643 -> 31355
    //   16236: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   16239: getstatic Perryc.c : I
    //   16242: iflt -> 16256
    //   16245: ldc2_w -1743488170
    //   16248: l2i
    //   16249: ldc_w 1670322631
    //   16252: ixor
    //   16253: goto -> 16264
    //   16256: ldc2_w -1036429187
    //   16259: l2i
    //   16260: ldc_w -371437524
    //   16263: ixor
    //   16264: ldc2_w -1529037101
    //   16267: l2i
    //   16268: ldc_w -1605740755
    //   16271: ixor
    //   16272: ixor
    //   16273: lookupswitch default -> 31157, -15889553 -> 16256, 796123567 -> 16300
    //   16300: aload #6
    //   16302: getstatic Perryc.c : I
    //   16305: iflt -> 16319
    //   16308: ldc2_w 1318830717
    //   16311: l2i
    //   16312: ldc_w 895678381
    //   16315: ixor
    //   16316: goto -> 16327
    //   16319: ldc2_w -422355952
    //   16322: l2i
    //   16323: ldc_w 454278346
    //   16326: ixor
    //   16327: ldc2_w 1165780310
    //   16330: l2i
    //   16331: ldc_w -2069207781
    //   16334: ixor
    //   16335: ixor
    //   16336: lookupswitch default -> 16364, -1171311203 -> 31205, 1600339860 -> 16319
    //   16364: aload_0
    //   16365: getstatic Perryc.c : I
    //   16368: iflt -> 16382
    //   16371: ldc2_w 1795831272
    //   16374: l2i
    //   16375: ldc_w -2084872516
    //   16378: ixor
    //   16379: goto -> 16390
    //   16382: ldc2_w 238724075
    //   16385: l2i
    //   16386: ldc_w -1507310255
    //   16389: ixor
    //   16390: ldc2_w -982604837
    //   16393: l2i
    //   16394: ldc_w 1431541581
    //   16397: ixor
    //   16398: ixor
    //   16399: lookupswitch default -> 31301, 942658092 -> 16424, 2022465474 -> 16382
    //   16424: getfield crystalX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16427: getstatic Perryc.1 : I
    //   16430: ifeq -> 16444
    //   16433: ldc2_w 1980859589
    //   16436: l2i
    //   16437: ldc_w -481846480
    //   16440: ixor
    //   16441: goto -> 16452
    //   16444: ldc2_w -959965391
    //   16447: l2i
    //   16448: ldc_w -1297680355
    //   16451: ixor
    //   16452: ldc2_w -231108549
    //   16455: l2i
    //   16456: ldc_w 475512883
    //   16459: ixor
    //   16460: ixor
    //   16461: lookupswitch default -> 16488, 542172276 -> 16444, 2067288061 -> 31445
    //   16488: goto -> 16492
    //   16491: athrow
    //   16492: invokevirtual getValue : ()Ljava/lang/Object;
    //   16495: goto -> 16499
    //   16498: athrow
    //   16499: checkcast java/lang/Integer
    //   16502: getstatic Perryc.1 : I
    //   16505: ifeq -> 16519
    //   16508: ldc2_w -1444190834
    //   16511: l2i
    //   16512: ldc_w 911438371
    //   16515: ixor
    //   16516: goto -> 16527
    //   16519: ldc2_w -603149019
    //   16522: l2i
    //   16523: ldc_w -927725556
    //   16526: ixor
    //   16527: ldc2_w 1681357194
    //   16530: l2i
    //   16531: ldc_w 1121282239
    //   16534: ixor
    //   16535: ixor
    //   16536: lookupswitch default -> 31557, -1185282408 -> 16519, 844805148 -> 16564
    //   16564: goto -> 16568
    //   16567: athrow
    //   16568: invokevirtual intValue : ()I
    //   16571: goto -> 16575
    //   16574: athrow
    //   16575: i2f
    //   16576: getstatic Perryc.c : I
    //   16579: iflt -> 16593
    //   16582: ldc2_w -373068398
    //   16585: l2i
    //   16586: ldc_w 308866966
    //   16589: ixor
    //   16590: goto -> 16601
    //   16593: ldc2_w 1325523758
    //   16596: l2i
    //   16597: ldc_w -1796725683
    //   16600: ixor
    //   16601: ldc2_w 584823431
    //   16604: l2i
    //   16605: ldc_w 1179238065
    //   16608: ixor
    //   16609: ixor
    //   16610: lookupswitch default -> 31421, -1623617998 -> 16593, -1082406059 -> 16636
    //   16636: aload_0
    //   16637: getstatic Perryc.1 : I
    //   16640: ifeq -> 16654
    //   16643: ldc2_w -1888481133
    //   16646: l2i
    //   16647: ldc_w -672433869
    //   16650: ixor
    //   16651: goto -> 16662
    //   16654: ldc2_w 1417733682
    //   16657: l2i
    //   16658: ldc_w -734931344
    //   16661: ixor
    //   16662: ldc2_w 209207806
    //   16665: l2i
    //   16666: ldc_w 1053888914
    //   16669: ixor
    //   16670: ixor
    //   16671: lookupswitch default -> 16696, -1522272593 -> 16654, 1781676492 -> 31555
    //   16696: getfield crystalY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16699: getstatic Perryc.1 : I
    //   16702: ifeq -> 16716
    //   16705: ldc2_w -435804652
    //   16708: l2i
    //   16709: ldc_w 559683008
    //   16712: ixor
    //   16713: goto -> 16724
    //   16716: ldc2_w -592511686
    //   16719: l2i
    //   16720: ldc_w 800276215
    //   16723: ixor
    //   16724: ldc2_w 1861741864
    //   16727: l2i
    //   16728: ldc_w -96015116
    //   16731: ixor
    //   16732: ixor
    //   16733: lookupswitch default -> 16760, -1138351099 -> 16716, 1407922696 -> 31457
    //   16760: goto -> 16764
    //   16763: athrow
    //   16764: invokevirtual getValue : ()Ljava/lang/Object;
    //   16767: goto -> 16771
    //   16770: athrow
    //   16771: checkcast java/lang/Integer
    //   16774: getstatic Perryc.c : I
    //   16777: iflt -> 16791
    //   16780: ldc2_w -613076918
    //   16783: l2i
    //   16784: ldc_w -74837334
    //   16787: ixor
    //   16788: goto -> 16799
    //   16791: ldc2_w 311904614
    //   16794: l2i
    //   16795: ldc_w 1498425453
    //   16798: ixor
    //   16799: ldc2_w -2036764591
    //   16802: l2i
    //   16803: ldc_w -861273667
    //   16806: ixor
    //   16807: ixor
    //   16808: lookupswitch default -> 16836, -278502656 -> 16791, 1791775500 -> 31271
    //   16836: goto -> 16840
    //   16839: athrow
    //   16840: invokevirtual intValue : ()I
    //   16843: goto -> 16847
    //   16846: athrow
    //   16847: i2f
    //   16848: getstatic Perryc.c : I
    //   16851: iflt -> 16865
    //   16854: ldc2_w 2124110185
    //   16857: l2i
    //   16858: ldc_w -869756680
    //   16861: ixor
    //   16862: goto -> 16873
    //   16865: ldc2_w 639569480
    //   16868: l2i
    //   16869: ldc_w 1248063446
    //   16872: ixor
    //   16873: ldc2_w -1752277742
    //   16876: l2i
    //   16877: ldc_w 1764450971
    //   16880: ixor
    //   16881: ixor
    //   16882: lookupswitch default -> 16908, 404725362 -> 16865, 1276573208 -> 31119
    //   16908: goto -> 16912
    //   16911: athrow
    //   16912: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   16915: goto -> 16919
    //   16918: athrow
    //   16919: getstatic Perryc.c : I
    //   16922: iflt -> 16936
    //   16925: ldc2_w -1144158482
    //   16928: l2i
    //   16929: ldc_w -2037679511
    //   16932: ixor
    //   16933: goto -> 16944
    //   16936: ldc2_w -830358856
    //   16939: l2i
    //   16940: ldc_w 838189868
    //   16943: ixor
    //   16944: ldc2_w 989072800
    //   16947: l2i
    //   16948: ldc_w 682954050
    //   16951: ixor
    //   16952: ixor
    //   16953: lookupswitch default -> 16980, 789052517 -> 30823, 1620182699 -> 16936
    //   16980: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16983: getstatic Perryc.1 : I
    //   16986: ifeq -> 17000
    //   16989: ldc2_w -1891697892
    //   16992: l2i
    //   16993: ldc_w -1937393129
    //   16996: ixor
    //   16997: goto -> 17008
    //   17000: ldc2_w -455730657
    //   17003: l2i
    //   17004: ldc_w -1370707557
    //   17007: ixor
    //   17008: ldc2_w -1136105654
    //   17011: l2i
    //   17012: ldc_w 449444441
    //   17015: ixor
    //   17016: ixor
    //   17017: lookupswitch default -> 17044, -1522869224 -> 31407, -1391883710 -> 17000
    //   17044: goto -> 17048
    //   17047: athrow
    //   17048: invokevirtual getValue : ()Ljava/lang/Object;
    //   17051: goto -> 17055
    //   17054: athrow
    //   17055: checkcast java/lang/Integer
    //   17058: getstatic Perryc.1 : I
    //   17061: ifeq -> 17075
    //   17064: ldc2_w 496425204
    //   17067: l2i
    //   17068: ldc_w 1830205577
    //   17071: ixor
    //   17072: goto -> 17083
    //   17075: ldc2_w -1291139290
    //   17078: l2i
    //   17079: ldc_w 1390112766
    //   17082: ixor
    //   17083: ldc2_w -120378355
    //   17086: l2i
    //   17087: ldc_w -1508776523
    //   17090: ixor
    //   17091: ixor
    //   17092: lookupswitch default -> 31357, -1089248928 -> 17120, 776120773 -> 17075
    //   17120: goto -> 17124
    //   17123: athrow
    //   17124: invokevirtual intValue : ()I
    //   17127: goto -> 17131
    //   17130: athrow
    //   17131: getstatic Perryc.0 : I
    //   17134: ifle -> 17148
    //   17137: ldc2_w 150278469
    //   17140: l2i
    //   17141: ldc_w -1974842468
    //   17144: ixor
    //   17145: goto -> 17156
    //   17148: ldc2_w 1591243371
    //   17151: l2i
    //   17152: ldc_w -659496272
    //   17155: ixor
    //   17156: ldc2_w 732411638
    //   17159: l2i
    //   17160: ldc_w 722913351
    //   17163: ixor
    //   17164: ixor
    //   17165: lookupswitch default -> 30857, -2113002392 -> 17148, -2032538006 -> 17192
    //   17192: goto -> 17196
    //   17195: athrow
    //   17196: invokestatic rainbow : (I)Ljava/awt/Color;
    //   17199: goto -> 17203
    //   17202: athrow
    //   17203: getstatic Perryc.0 : I
    //   17206: ifle -> 17220
    //   17209: ldc2_w -947841244
    //   17212: l2i
    //   17213: ldc_w -1879577648
    //   17216: ixor
    //   17217: goto -> 17228
    //   17220: ldc2_w -180755848
    //   17223: l2i
    //   17224: ldc_w -1217798601
    //   17227: ixor
    //   17228: ldc2_w -828269990
    //   17231: l2i
    //   17232: ldc_w -406144976
    //   17235: ixor
    //   17236: ixor
    //   17237: lookupswitch default -> 17264, 1554699506 -> 17220, 1629347486 -> 31143
    //   17264: goto -> 17268
    //   17267: athrow
    //   17268: invokevirtual getRGB : ()I
    //   17271: goto -> 17275
    //   17274: athrow
    //   17275: ldc2_w -1881944622
    //   17278: l2i
    //   17279: ldc_w -1881944621
    //   17282: ixor
    //   17283: getstatic Perryc.c : I
    //   17286: iflt -> 17300
    //   17289: ldc2_w 248501774
    //   17292: l2i
    //   17293: ldc_w -1087626783
    //   17296: ixor
    //   17297: goto -> 17308
    //   17300: ldc2_w 13116900
    //   17303: l2i
    //   17304: ldc_w -459733954
    //   17307: ixor
    //   17308: ldc2_w -157221551
    //   17311: l2i
    //   17312: ldc_w -1467975327
    //   17315: ixor
    //   17316: ixor
    //   17317: lookupswitch default -> 31089, -1166957078 -> 17344, -272403489 -> 17300
    //   17344: goto -> 17348
    //   17347: athrow
    //   17348: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   17351: goto -> 17355
    //   17354: athrow
    //   17355: iinc #10, 12
    //   17358: getstatic Perryc.0 : I
    //   17361: ifle -> 17375
    //   17364: ldc2_w 529567913
    //   17367: l2i
    //   17368: ldc_w -629323737
    //   17371: ixor
    //   17372: goto -> 17383
    //   17375: ldc2_w 1629564803
    //   17378: l2i
    //   17379: ldc_w -2058135909
    //   17382: ixor
    //   17383: ldc2_w -30212202
    //   17386: l2i
    //   17387: ldc_w -169529542
    //   17390: ixor
    //   17391: ixor
    //   17392: lookupswitch default -> 31159, -835057630 -> 17375, -274355788 -> 17420
    //   17420: aload_0
    //   17421: getstatic Perryc.c : I
    //   17424: iflt -> 17438
    //   17427: ldc2_w -1758889995
    //   17430: l2i
    //   17431: ldc_w 126173710
    //   17434: ixor
    //   17435: goto -> 17446
    //   17438: ldc2_w 19152827
    //   17441: l2i
    //   17442: ldc_w -16821622
    //   17445: ixor
    //   17446: ldc2_w 680189555
    //   17449: l2i
    //   17450: ldc_w 1183991719
    //   17453: ixor
    //   17454: ixor
    //   17455: lookupswitch default -> 31013, -1849428763 -> 17480, -21713873 -> 17438
    //   17480: getfield exp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17483: getstatic Perryc.c : I
    //   17486: iflt -> 17500
    //   17489: ldc2_w 259353156
    //   17492: l2i
    //   17493: ldc_w -651595578
    //   17496: ixor
    //   17497: goto -> 17508
    //   17500: ldc2_w 1615238337
    //   17503: l2i
    //   17504: ldc_w -270946603
    //   17507: ixor
    //   17508: ldc2_w -1713261464
    //   17511: l2i
    //   17512: ldc_w 1336669106
    //   17515: ixor
    //   17516: ixor
    //   17517: lookupswitch default -> 17544, 1465688 -> 31527, 870769821 -> 17500
    //   17544: goto -> 17548
    //   17547: athrow
    //   17548: invokevirtual getValue : ()Ljava/lang/Object;
    //   17551: goto -> 17555
    //   17554: athrow
    //   17555: checkcast java/lang/Boolean
    //   17558: getstatic Perryc.0 : I
    //   17561: ifle -> 17575
    //   17564: ldc2_w 1629719831
    //   17567: l2i
    //   17568: ldc_w 1906874909
    //   17571: ixor
    //   17572: goto -> 17583
    //   17575: ldc2_w -1499116936
    //   17578: l2i
    //   17579: ldc_w -75044301
    //   17582: ixor
    //   17583: ldc2_w 1816364859
    //   17586: l2i
    //   17587: ldc_w 1122781869
    //   17590: ixor
    //   17591: ixor
    //   17592: lookupswitch default -> 31261, 1042602652 -> 17575, 1938583005 -> 17620
    //   17620: goto -> 17624
    //   17623: athrow
    //   17624: invokevirtual booleanValue : ()Z
    //   17627: goto -> 17631
    //   17630: athrow
    //   17631: ifeq -> 17645
    //   17634: ldc2_w -1794893838
    //   17637: l2i
    //   17638: ldc_w 76054065
    //   17641: ixor
    //   17642: goto -> 17653
    //   17645: ldc2_w 584547258
    //   17648: l2i
    //   17649: ldc_w -1285877128
    //   17652: ixor
    //   17653: ldc2_w 623216481
    //   17656: l2i
    //   17657: ldc_w 1146902392
    //   17660: ixor
    //   17661: ixor
    //   17662: tableswitch default -> 17634, -252331558 -> 17684, -252331557 -> 18926
    //   17684: getstatic Perryc.1 : I
    //   17687: ifeq -> 17701
    //   17690: ldc2_w 2127522081
    //   17693: l2i
    //   17694: ldc_w -1857436013
    //   17697: ixor
    //   17698: goto -> 17709
    //   17701: ldc2_w -1329840861
    //   17704: l2i
    //   17705: ldc_w 59669752
    //   17708: ixor
    //   17709: ldc2_w 385687012
    //   17712: l2i
    //   17713: ldc_w -93384766
    //   17716: ixor
    //   17717: ixor
    //   17718: lookupswitch default -> 31599, 51690900 -> 17701, 1604342781 -> 17744
    //   17744: aload_0
    //   17745: getstatic Perryc.c : I
    //   17748: iflt -> 17762
    //   17751: ldc2_w 868466892
    //   17754: l2i
    //   17755: ldc_w -15300144
    //   17758: ixor
    //   17759: goto -> 17770
    //   17762: ldc2_w -971959389
    //   17765: l2i
    //   17766: ldc_w -396212003
    //   17769: ixor
    //   17770: ldc2_w -71868360
    //   17773: l2i
    //   17774: ldc_w -245354033
    //   17777: ixor
    //   17778: ixor
    //   17779: lookupswitch default -> 31435, -972941077 -> 17762, 614730377 -> 17804
    //   17804: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   17807: getstatic Perryc.1 : I
    //   17810: ifeq -> 17824
    //   17813: ldc2_w -1024807888
    //   17816: l2i
    //   17817: ldc_w 1050771830
    //   17820: ixor
    //   17821: goto -> 17832
    //   17824: ldc2_w 1040187865
    //   17827: l2i
    //   17828: ldc_w 1877177984
    //   17831: ixor
    //   17832: ldc2_w 983183924
    //   17835: l2i
    //   17836: ldc_w -652032780
    //   17839: ixor
    //   17840: ixor
    //   17841: lookupswitch default -> 17868, -1286479490 -> 17824, 536075142 -> 31369
    //   17868: aload #7
    //   17870: getstatic Perryc.0 : I
    //   17873: ifle -> 17887
    //   17876: ldc2_w -1617417047
    //   17879: l2i
    //   17880: ldc_w -2062120347
    //   17883: ixor
    //   17884: goto -> 17895
    //   17887: ldc2_w 277201662
    //   17890: l2i
    //   17891: ldc_w -6667346
    //   17894: ixor
    //   17895: ldc2_w 227737307
    //   17898: l2i
    //   17899: ldc_w -1659210002
    //   17902: ixor
    //   17903: ixor
    //   17904: lookupswitch default -> 17932, -1979306247 -> 31227, 1547238140 -> 17887
    //   17932: aload_0
    //   17933: getstatic Perryc.1 : I
    //   17936: ifeq -> 17950
    //   17939: ldc2_w -1617084701
    //   17942: l2i
    //   17943: ldc_w 934045680
    //   17946: ixor
    //   17947: goto -> 17958
    //   17950: ldc2_w 1404933449
    //   17953: l2i
    //   17954: ldc_w 875070119
    //   17957: ixor
    //   17958: ldc2_w 1098147042
    //   17961: l2i
    //   17962: ldc_w -1817801274
    //   17965: ixor
    //   17966: ixor
    //   17967: lookupswitch default -> 17992, -1231786237 -> 17950, 2061742135 -> 30913
    //   17992: getfield expX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17995: getstatic Perryc.c : I
    //   17998: iflt -> 18012
    //   18001: ldc2_w 641673339
    //   18004: l2i
    //   18005: ldc_w 458590444
    //   18008: ixor
    //   18009: goto -> 18020
    //   18012: ldc2_w 1954957773
    //   18015: l2i
    //   18016: ldc_w -1004367965
    //   18019: ixor
    //   18020: ldc2_w 1862708070
    //   18023: l2i
    //   18024: ldc_w -1210287696
    //   18027: ixor
    //   18028: ixor
    //   18029: lookupswitch default -> 31393, -441421247 -> 18012, 1753093304 -> 18056
    //   18056: goto -> 18060
    //   18059: athrow
    //   18060: invokevirtual getValue : ()Ljava/lang/Object;
    //   18063: goto -> 18067
    //   18066: athrow
    //   18067: checkcast java/lang/Integer
    //   18070: getstatic Perryc.1 : I
    //   18073: ifeq -> 18087
    //   18076: ldc2_w -1226399905
    //   18079: l2i
    //   18080: ldc_w 314563709
    //   18083: ixor
    //   18084: goto -> 18095
    //   18087: ldc2_w 1361046903
    //   18090: l2i
    //   18091: ldc_w 1698659011
    //   18094: ixor
    //   18095: ldc2_w 305231604
    //   18098: l2i
    //   18099: ldc_w -1675565349
    //   18102: ixor
    //   18103: ixor
    //   18104: lookupswitch default -> 18132, 709415693 -> 30751, 1224005367 -> 18087
    //   18132: goto -> 18136
    //   18135: athrow
    //   18136: invokevirtual intValue : ()I
    //   18139: goto -> 18143
    //   18142: athrow
    //   18143: i2f
    //   18144: getstatic Perryc.1 : I
    //   18147: ifeq -> 18161
    //   18150: ldc2_w 1576998497
    //   18153: l2i
    //   18154: ldc_w 742665982
    //   18157: ixor
    //   18158: goto -> 18169
    //   18161: ldc2_w 1288595366
    //   18164: l2i
    //   18165: ldc_w 169490006
    //   18168: ixor
    //   18169: ldc2_w 634596705
    //   18172: l2i
    //   18173: ldc_w 1170495311
    //   18176: ixor
    //   18177: ixor
    //   18178: lookupswitch default -> 31149, 296501937 -> 18161, 650324958 -> 18204
    //   18204: aload_0
    //   18205: getstatic Perryc.0 : I
    //   18208: ifle -> 18222
    //   18211: ldc2_w 713678571
    //   18214: l2i
    //   18215: ldc_w -1246544175
    //   18218: ixor
    //   18219: goto -> 18230
    //   18222: ldc2_w 738051319
    //   18225: l2i
    //   18226: ldc_w -256948676
    //   18229: ixor
    //   18230: ldc2_w -203405697
    //   18233: l2i
    //   18234: ldc_w -663957718
    //   18237: ixor
    //   18238: ixor
    //   18239: lookupswitch default -> 18264, -1263113873 -> 31437, 276974134 -> 18222
    //   18264: getfield expY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18267: getstatic Perryc.c : I
    //   18270: iflt -> 18284
    //   18273: ldc2_w 1708569591
    //   18276: l2i
    //   18277: ldc_w 701605977
    //   18280: ixor
    //   18281: goto -> 18292
    //   18284: ldc2_w -2096143178
    //   18287: l2i
    //   18288: ldc_w -570620226
    //   18291: ixor
    //   18292: ldc2_w 1440951491
    //   18295: l2i
    //   18296: ldc_w 393010433
    //   18299: ixor
    //   18300: ixor
    //   18301: lookupswitch default -> 31165, 243853932 -> 18284, 477991882 -> 18328
    //   18328: goto -> 18332
    //   18331: athrow
    //   18332: invokevirtual getValue : ()Ljava/lang/Object;
    //   18335: goto -> 18339
    //   18338: athrow
    //   18339: checkcast java/lang/Integer
    //   18342: getstatic Perryc.1 : I
    //   18345: ifeq -> 18359
    //   18348: ldc2_w 531056372
    //   18351: l2i
    //   18352: ldc_w 1875986964
    //   18355: ixor
    //   18356: goto -> 18367
    //   18359: ldc2_w 1244516349
    //   18362: l2i
    //   18363: ldc_w -1917208673
    //   18366: ixor
    //   18367: ldc2_w -1899766422
    //   18370: l2i
    //   18371: ldc_w -2025630290
    //   18374: ixor
    //   18375: ixor
    //   18376: lookupswitch default -> 31243, -837488474 -> 18404, 2046198820 -> 18359
    //   18404: goto -> 18408
    //   18407: athrow
    //   18408: invokevirtual intValue : ()I
    //   18411: goto -> 18415
    //   18414: athrow
    //   18415: i2f
    //   18416: getstatic Perryc.1 : I
    //   18419: ifeq -> 18433
    //   18422: ldc2_w -520065842
    //   18425: l2i
    //   18426: ldc_w 196804232
    //   18429: ixor
    //   18430: goto -> 18441
    //   18433: ldc2_w -423594356
    //   18436: l2i
    //   18437: ldc_w -424782846
    //   18440: ixor
    //   18441: ldc2_w 506744247
    //   18444: l2i
    //   18445: ldc_w 927108991
    //   18448: ixor
    //   18449: ixor
    //   18450: lookupswitch default -> 30975, -1010020210 -> 18433, 689496134 -> 18476
    //   18476: goto -> 18480
    //   18479: athrow
    //   18480: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   18483: goto -> 18487
    //   18486: athrow
    //   18487: getstatic Perryc.0 : I
    //   18490: ifle -> 18504
    //   18493: ldc2_w -1150127787
    //   18496: l2i
    //   18497: ldc_w -285039687
    //   18500: ixor
    //   18501: goto -> 18512
    //   18504: ldc2_w 205477337
    //   18507: l2i
    //   18508: ldc_w -1262967832
    //   18511: ixor
    //   18512: ldc2_w -1150312024
    //   18515: l2i
    //   18516: ldc_w 267914257
    //   18519: ixor
    //   18520: ixor
    //   18521: lookupswitch default -> 31281, -521699499 -> 18504, 202398600 -> 18548
    //   18548: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18551: getstatic Perryc.0 : I
    //   18554: ifle -> 18568
    //   18557: ldc2_w -1697698247
    //   18560: l2i
    //   18561: ldc_w 1040951594
    //   18564: ixor
    //   18565: goto -> 18576
    //   18568: ldc2_w -1696958913
    //   18571: l2i
    //   18572: ldc_w 1843348798
    //   18575: ixor
    //   18576: ldc2_w 1419543517
    //   18579: l2i
    //   18580: ldc_w -1541479022
    //   18583: ixor
    //   18584: ixor
    //   18585: lookupswitch default -> 30901, 126309710 -> 18612, 1413931356 -> 18568
    //   18612: goto -> 18616
    //   18615: athrow
    //   18616: invokevirtual getValue : ()Ljava/lang/Object;
    //   18619: goto -> 18623
    //   18622: athrow
    //   18623: checkcast java/lang/Integer
    //   18626: getstatic Perryc.1 : I
    //   18629: ifeq -> 18643
    //   18632: ldc2_w -1949231807
    //   18635: l2i
    //   18636: ldc_w 2098924828
    //   18639: ixor
    //   18640: goto -> 18651
    //   18643: ldc2_w 2081449872
    //   18646: l2i
    //   18647: ldc_w -1340458912
    //   18650: ixor
    //   18651: ldc2_w -667655478
    //   18654: l2i
    //   18655: ldc_w -918373535
    //   18658: ixor
    //   18659: ixor
    //   18660: lookupswitch default -> 18688, -407059978 -> 31141, 1816304563 -> 18643
    //   18688: goto -> 18692
    //   18691: athrow
    //   18692: invokevirtual intValue : ()I
    //   18695: goto -> 18699
    //   18698: athrow
    //   18699: getstatic Perryc.1 : I
    //   18702: ifeq -> 18716
    //   18705: ldc2_w -1013739977
    //   18708: l2i
    //   18709: ldc_w -1913996098
    //   18712: ixor
    //   18713: goto -> 18724
    //   18716: ldc2_w 1136909287
    //   18719: l2i
    //   18720: ldc_w 2018384281
    //   18723: ixor
    //   18724: ldc2_w -766014543
    //   18727: l2i
    //   18728: ldc_w -1082733642
    //   18731: ixor
    //   18732: ixor
    //   18733: lookupswitch default -> 31233, 592999054 -> 18716, 1454146169 -> 18760
    //   18760: goto -> 18764
    //   18763: athrow
    //   18764: invokestatic rainbow : (I)Ljava/awt/Color;
    //   18767: goto -> 18771
    //   18770: athrow
    //   18771: getstatic Perryc.1 : I
    //   18774: ifeq -> 18788
    //   18777: ldc2_w -30810057
    //   18780: l2i
    //   18781: ldc_w -1060986777
    //   18784: ixor
    //   18785: goto -> 18796
    //   18788: ldc2_w -2108533144
    //   18791: l2i
    //   18792: ldc_w -1494827017
    //   18795: ixor
    //   18796: ldc2_w 660138900
    //   18799: l2i
    //   18800: ldc_w -312770690
    //   18803: ixor
    //   18804: ixor
    //   18805: lookupswitch default -> 18832, -186067782 -> 31569, 1815530132 -> 18788
    //   18832: goto -> 18836
    //   18835: athrow
    //   18836: invokevirtual getRGB : ()I
    //   18839: goto -> 18843
    //   18842: athrow
    //   18843: ldc2_w 1921452529
    //   18846: l2i
    //   18847: ldc_w 1921452528
    //   18850: ixor
    //   18851: getstatic Perryc.c : I
    //   18854: iflt -> 18868
    //   18857: ldc2_w 2051795974
    //   18860: l2i
    //   18861: ldc_w -890984083
    //   18864: ixor
    //   18865: goto -> 18876
    //   18868: ldc2_w 1980989967
    //   18871: l2i
    //   18872: ldc_w -363822886
    //   18875: ixor
    //   18876: ldc2_w 948295716
    //   18879: l2i
    //   18880: ldc_w 1884947046
    //   18883: ixor
    //   18884: ixor
    //   18885: lookupswitch default -> 18912, -126836951 -> 30771, 2146672451 -> 18868
    //   18912: goto -> 18916
    //   18915: athrow
    //   18916: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   18919: goto -> 18923
    //   18922: athrow
    //   18923: iinc #10, 12
    //   18926: getstatic Perryc.0 : I
    //   18929: ifle -> 18943
    //   18932: ldc2_w 702170902
    //   18935: l2i
    //   18936: ldc_w -479025026
    //   18939: ixor
    //   18940: goto -> 18951
    //   18943: ldc2_w -221324669
    //   18946: l2i
    //   18947: ldc_w 1239794709
    //   18950: ixor
    //   18951: ldc2_w -509035768
    //   18954: l2i
    //   18955: ldc_w 316343526
    //   18958: ixor
    //   18959: ixor
    //   18960: lookupswitch default -> 31115, 970674310 -> 18943, 1213768056 -> 18988
    //   18988: aload_0
    //   18989: getstatic Perryc.0 : I
    //   18992: ifle -> 19006
    //   18995: ldc2_w 997141736
    //   18998: l2i
    //   18999: ldc_w -1876150155
    //   19002: ixor
    //   19003: goto -> 19014
    //   19006: ldc2_w 638992540
    //   19009: l2i
    //   19010: ldc_w 1777083022
    //   19013: ixor
    //   19014: ldc2_w 607001644
    //   19017: l2i
    //   19018: ldc_w 1038828734
    //   19021: ixor
    //   19022: ixor
    //   19023: lookupswitch default -> 31237, -1299821553 -> 19006, 1446984320 -> 19048
    //   19048: getfield gapples : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19051: getstatic Perryc.c : I
    //   19054: iflt -> 19068
    //   19057: ldc2_w -1007588755
    //   19060: l2i
    //   19061: ldc_w -439014882
    //   19064: ixor
    //   19065: goto -> 19076
    //   19068: ldc2_w 1547994846
    //   19071: l2i
    //   19072: ldc_w -616063792
    //   19075: ixor
    //   19076: ldc2_w 968639116
    //   19079: l2i
    //   19080: ldc_w -848956472
    //   19083: ixor
    //   19084: ixor
    //   19085: lookupswitch default -> 19112, -755109577 -> 31509, 1353132167 -> 19068
    //   19112: goto -> 19116
    //   19115: athrow
    //   19116: invokevirtual getValue : ()Ljava/lang/Object;
    //   19119: goto -> 19123
    //   19122: athrow
    //   19123: checkcast java/lang/Boolean
    //   19126: getstatic Perryc.1 : I
    //   19129: ifeq -> 19143
    //   19132: ldc2_w 916323949
    //   19135: l2i
    //   19136: ldc_w 704259379
    //   19139: ixor
    //   19140: goto -> 19151
    //   19143: ldc2_w -1561716084
    //   19146: l2i
    //   19147: ldc_w 1609817695
    //   19150: ixor
    //   19151: ldc2_w 371571057
    //   19154: l2i
    //   19155: ldc_w 1389445303
    //   19158: ixor
    //   19159: ixor
    //   19160: lookupswitch default -> 19188, -2018426845 -> 19143, 1536369304 -> 31453
    //   19188: goto -> 19192
    //   19191: athrow
    //   19192: invokevirtual booleanValue : ()Z
    //   19195: goto -> 19199
    //   19198: athrow
    //   19199: ifeq -> 19213
    //   19202: ldc2_w 1594866269
    //   19205: l2i
    //   19206: ldc_w 1790135515
    //   19209: ixor
    //   19210: goto -> 19221
    //   19213: ldc2_w 282416023
    //   19216: l2i
    //   19217: ldc_w 627680528
    //   19220: ixor
    //   19221: ldc2_w -994615929
    //   19224: l2i
    //   19225: ldc_w 1961742979
    //   19228: ixor
    //   19229: ixor
    //   19230: tableswitch default -> 19202, -2048493182 -> 19252, -2048493181 -> 30746
    //   19252: getstatic Perryc.1 : I
    //   19255: ifeq -> 19269
    //   19258: ldc2_w -1474143682
    //   19261: l2i
    //   19262: ldc_w 1493172472
    //   19265: ixor
    //   19266: goto -> 19277
    //   19269: ldc2_w 1125363308
    //   19272: l2i
    //   19273: ldc_w -1670502428
    //   19276: ixor
    //   19277: ldc2_w 342902562
    //   19280: l2i
    //   19281: ldc_w -505957706
    //   19284: ixor
    //   19285: ixor
    //   19286: lookupswitch default -> 31347, 75870034 -> 19269, 718961692 -> 19312
    //   19312: aload_0
    //   19313: getstatic Perryc.c : I
    //   19316: iflt -> 19330
    //   19319: ldc2_w -1244161424
    //   19322: l2i
    //   19323: ldc_w 782583598
    //   19326: ixor
    //   19327: goto -> 19338
    //   19330: ldc2_w 1828886739
    //   19333: l2i
    //   19334: ldc_w 1864248286
    //   19337: ixor
    //   19338: ldc2_w -30556483
    //   19341: l2i
    //   19342: ldc_w -1955020144
    //   19345: ixor
    //   19346: ixor
    //   19347: lookupswitch default -> 30963, -299392653 -> 19330, 2001325856 -> 19372
    //   19372: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   19375: getstatic Perryc.0 : I
    //   19378: ifle -> 19392
    //   19381: ldc2_w -1374710833
    //   19384: l2i
    //   19385: ldc_w 940918471
    //   19388: ixor
    //   19389: goto -> 19400
    //   19392: ldc2_w -453737534
    //   19395: l2i
    //   19396: ldc_w -1667081241
    //   19399: ixor
    //   19400: ldc2_w 1469023303
    //   19403: l2i
    //   19404: ldc_w 923409700
    //   19407: ixor
    //   19408: ixor
    //   19409: lookupswitch default -> 30927, -157332373 -> 19392, 416497990 -> 19436
    //   19436: aload #8
    //   19438: getstatic Perryc.c : I
    //   19441: iflt -> 19455
    //   19444: ldc2_w -1440301181
    //   19447: l2i
    //   19448: ldc_w 843836014
    //   19451: ixor
    //   19452: goto -> 19463
    //   19455: ldc2_w 1156232329
    //   19458: l2i
    //   19459: ldc_w -340223860
    //   19462: ixor
    //   19463: ldc2_w 46145298
    //   19466: l2i
    //   19467: ldc_w 488807687
    //   19470: ixor
    //   19471: ixor
    //   19472: lookupswitch default -> 19500, -2020616200 -> 31463, 1296821219 -> 19455
    //   19500: aload_0
    //   19501: getstatic Perryc.c : I
    //   19504: iflt -> 19518
    //   19507: ldc2_w 707978970
    //   19510: l2i
    //   19511: ldc_w 2114587708
    //   19514: ixor
    //   19515: goto -> 19526
    //   19518: ldc2_w -1181393395
    //   19521: l2i
    //   19522: ldc_w -1872955078
    //   19525: ixor
    //   19526: ldc2_w 1764449594
    //   19529: l2i
    //   19530: ldc_w 2028891797
    //   19533: ixor
    //   19534: ixor
    //   19535: lookupswitch default -> 19560, -302382253 -> 19518, 1174264137 -> 30799
    //   19560: getfield GapplesX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19563: getstatic Perryc.0 : I
    //   19566: ifle -> 19580
    //   19569: ldc2_w 709009495
    //   19572: l2i
    //   19573: ldc_w 1630610049
    //   19576: ixor
    //   19577: goto -> 19588
    //   19580: ldc2_w -301743942
    //   19583: l2i
    //   19584: ldc_w -1026515063
    //   19587: ixor
    //   19588: ldc2_w 222818879
    //   19591: l2i
    //   19592: ldc_w -409587331
    //   19595: ixor
    //   19596: ixor
    //   19597: lookupswitch default -> 31291, -1583201900 -> 19580, -972907407 -> 19624
    //   19624: goto -> 19628
    //   19627: athrow
    //   19628: invokevirtual getValue : ()Ljava/lang/Object;
    //   19631: goto -> 19635
    //   19634: athrow
    //   19635: checkcast java/lang/Integer
    //   19638: getstatic Perryc.c : I
    //   19641: iflt -> 19655
    //   19644: ldc2_w 31420790
    //   19647: l2i
    //   19648: ldc_w 565653663
    //   19651: ixor
    //   19652: goto -> 19663
    //   19655: ldc2_w 1381380033
    //   19658: l2i
    //   19659: ldc_w -52770050
    //   19662: ixor
    //   19663: ldc2_w -1209890017
    //   19666: l2i
    //   19667: ldc_w 1923710860
    //   19670: ixor
    //   19671: ixor
    //   19672: lookupswitch default -> 19700, -2020968334 -> 19655, -450644614 -> 30999
    //   19700: goto -> 19704
    //   19703: athrow
    //   19704: invokevirtual intValue : ()I
    //   19707: goto -> 19711
    //   19710: athrow
    //   19711: i2f
    //   19712: getstatic Perryc.1 : I
    //   19715: ifeq -> 19729
    //   19718: ldc2_w 873759623
    //   19721: l2i
    //   19722: ldc_w -506794954
    //   19725: ixor
    //   19726: goto -> 19737
    //   19729: ldc2_w -478483083
    //   19732: l2i
    //   19733: ldc_w -2040596674
    //   19736: ixor
    //   19737: ldc2_w -796165819
    //   19740: l2i
    //   19741: ldc_w -269739709
    //   19744: ixor
    //   19745: ixor
    //   19746: lookupswitch default -> 19772, -1330089401 -> 19729, -356970569 -> 30869
    //   19772: aload_0
    //   19773: getstatic Perryc.c : I
    //   19776: iflt -> 19790
    //   19779: ldc2_w -25443321
    //   19782: l2i
    //   19783: ldc_w -925431484
    //   19786: ixor
    //   19787: goto -> 19798
    //   19790: ldc2_w -1362861998
    //   19793: l2i
    //   19794: ldc_w -1436071557
    //   19797: ixor
    //   19798: ldc2_w 1855395434
    //   19801: l2i
    //   19802: ldc_w 1133430936
    //   19805: ixor
    //   19806: ixor
    //   19807: lookupswitch default -> 31065, 464851889 -> 19790, 700119003 -> 19832
    //   19832: getfield GapplesY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19835: getstatic Perryc.0 : I
    //   19838: ifle -> 19852
    //   19841: ldc2_w -1774264119
    //   19844: l2i
    //   19845: ldc_w 1512380051
    //   19848: ixor
    //   19849: goto -> 19860
    //   19852: ldc2_w 1189503959
    //   19855: l2i
    //   19856: ldc_w -1548985711
    //   19859: ixor
    //   19860: ldc2_w -791369510
    //   19863: l2i
    //   19864: ldc_w 1726323740
    //   19867: ixor
    //   19868: ixor
    //   19869: lookupswitch default -> 19896, 407946913 -> 19852, 2049622684 -> 30893
    //   19896: goto -> 19900
    //   19899: athrow
    //   19900: invokevirtual getValue : ()Ljava/lang/Object;
    //   19903: goto -> 19907
    //   19906: athrow
    //   19907: checkcast java/lang/Integer
    //   19910: getstatic Perryc.c : I
    //   19913: iflt -> 19927
    //   19916: ldc2_w -1743072306
    //   19919: l2i
    //   19920: ldc_w -953122911
    //   19923: ixor
    //   19924: goto -> 19935
    //   19927: ldc2_w -1213057967
    //   19930: l2i
    //   19931: ldc_w 1498366904
    //   19934: ixor
    //   19935: ldc2_w -1392313990
    //   19938: l2i
    //   19939: ldc_w -416752831
    //   19942: ixor
    //   19943: ixor
    //   19944: lookupswitch default -> 19972, -166524975 -> 19927, 352357972 -> 31567
    //   19972: goto -> 19976
    //   19975: athrow
    //   19976: invokevirtual intValue : ()I
    //   19979: goto -> 19983
    //   19982: athrow
    //   19983: i2f
    //   19984: getstatic Perryc.1 : I
    //   19987: ifeq -> 20001
    //   19990: ldc2_w -447112820
    //   19993: l2i
    //   19994: ldc_w 403628858
    //   19997: ixor
    //   19998: goto -> 20009
    //   20001: ldc2_w -1871478455
    //   20004: l2i
    //   20005: ldc_w -1898528990
    //   20008: ixor
    //   20009: ldc2_w -1761885889
    //   20012: l2i
    //   20013: ldc_w 1178359926
    //   20016: ixor
    //   20017: ixor
    //   20018: lookupswitch default -> 20044, -1910498841 -> 20001, 764470271 -> 31039
    //   20044: goto -> 20048
    //   20047: athrow
    //   20048: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   20051: goto -> 20055
    //   20054: athrow
    //   20055: getstatic Perryc.0 : I
    //   20058: ifle -> 20072
    //   20061: ldc2_w 1520126458
    //   20064: l2i
    //   20065: ldc_w -1280200467
    //   20068: ixor
    //   20069: goto -> 20080
    //   20072: ldc2_w 22611952
    //   20075: l2i
    //   20076: ldc_w 528853021
    //   20079: ixor
    //   20080: ldc2_w 1041411584
    //   20083: l2i
    //   20084: ldc_w -223317480
    //   20087: ixor
    //   20088: ixor
    //   20089: lookupswitch default -> 31591, -763464715 -> 20116, 629679375 -> 20072
    //   20116: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20119: getstatic Perryc.1 : I
    //   20122: ifeq -> 20136
    //   20125: ldc2_w 76946655
    //   20128: l2i
    //   20129: ldc_w 1941468649
    //   20132: ixor
    //   20133: goto -> 20144
    //   20136: ldc2_w 914172756
    //   20139: l2i
    //   20140: ldc_w 16345373
    //   20143: ixor
    //   20144: ldc2_w -1482563747
    //   20147: l2i
    //   20148: ldc_w 1014891748
    //   20151: ixor
    //   20152: ixor
    //   20153: lookupswitch default -> 31283, -1386505744 -> 20180, -319704433 -> 20136
    //   20180: goto -> 20184
    //   20183: athrow
    //   20184: invokevirtual getValue : ()Ljava/lang/Object;
    //   20187: goto -> 20191
    //   20190: athrow
    //   20191: checkcast java/lang/Integer
    //   20194: getstatic Perryc.1 : I
    //   20197: ifeq -> 20211
    //   20200: ldc2_w -311421901
    //   20203: l2i
    //   20204: ldc_w 841085397
    //   20207: ixor
    //   20208: goto -> 20219
    //   20211: ldc2_w -721398651
    //   20214: l2i
    //   20215: ldc_w -1386739979
    //   20218: ixor
    //   20219: ldc2_w 1727192073
    //   20222: l2i
    //   20223: ldc_w -357404642
    //   20226: ixor
    //   20227: ixor
    //   20228: lookupswitch default -> 20256, -746705332 -> 20211, 1393641969 -> 30907
    //   20256: goto -> 20260
    //   20259: athrow
    //   20260: invokevirtual intValue : ()I
    //   20263: goto -> 20267
    //   20266: athrow
    //   20267: getstatic Perryc.c : I
    //   20270: iflt -> 20284
    //   20273: ldc2_w -771131061
    //   20276: l2i
    //   20277: ldc_w 1916350881
    //   20280: ixor
    //   20281: goto -> 20292
    //   20284: ldc2_w 1908626546
    //   20287: l2i
    //   20288: ldc_w 1791154263
    //   20291: ixor
    //   20292: ldc2_w 1048440994
    //   20295: l2i
    //   20296: ldc_w 2023884557
    //   20299: ixor
    //   20300: ixor
    //   20301: lookupswitch default -> 20328, -671652696 -> 20284, -420495547 -> 30889
    //   20328: goto -> 20332
    //   20331: athrow
    //   20332: invokestatic rainbow : (I)Ljava/awt/Color;
    //   20335: goto -> 20339
    //   20338: athrow
    //   20339: getstatic Perryc.1 : I
    //   20342: ifeq -> 20356
    //   20345: ldc2_w -662212045
    //   20348: l2i
    //   20349: ldc_w -1805241580
    //   20352: ixor
    //   20353: goto -> 20364
    //   20356: ldc2_w -78172576
    //   20359: l2i
    //   20360: ldc_w -1552534369
    //   20363: ixor
    //   20364: ldc2_w -751336829
    //   20367: l2i
    //   20368: ldc_w -1819163078
    //   20371: ixor
    //   20372: ixor
    //   20373: lookupswitch default -> 20400, -490433389 -> 20356, 205981086 -> 31025
    //   20400: goto -> 20404
    //   20403: athrow
    //   20404: invokevirtual getRGB : ()I
    //   20407: goto -> 20411
    //   20410: athrow
    //   20411: ldc2_w -494674073
    //   20414: l2i
    //   20415: ldc_w -494674074
    //   20418: ixor
    //   20419: getstatic Perryc.0 : I
    //   20422: ifle -> 20436
    //   20425: ldc2_w -1286076228
    //   20428: l2i
    //   20429: ldc_w 113790698
    //   20432: ixor
    //   20433: goto -> 20444
    //   20436: ldc2_w 1240541481
    //   20439: l2i
    //   20440: ldc_w 1209192279
    //   20443: ixor
    //   20444: ldc2_w 860942797
    //   20447: l2i
    //   20448: ldc_w -1289629893
    //   20451: ixor
    //   20452: ixor
    //   20453: lookupswitch default -> 20480, -1510679948 -> 20436, 903968928 -> 31411
    //   20480: goto -> 20484
    //   20483: athrow
    //   20484: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   20487: goto -> 20491
    //   20490: athrow
    //   20491: iinc #10, 12
    //   20494: goto -> 30746
    //   20497: getstatic Perryc.1 : I
    //   20500: ifeq -> 20514
    //   20503: ldc2_w -947802914
    //   20506: l2i
    //   20507: ldc_w 956705798
    //   20510: ixor
    //   20511: goto -> 20522
    //   20514: ldc2_w 545732411
    //   20517: l2i
    //   20518: ldc_w -301233546
    //   20521: ixor
    //   20522: ldc2_w 674064002
    //   20525: l2i
    //   20526: ldc_w 1696940628
    //   20529: ixor
    //   20530: ixor
    //   20531: lookupswitch default -> 20556, -1282431986 -> 30785, -845012798 -> 20514
    //   20556: aload_0
    //   20557: getstatic Perryc.c : I
    //   20560: iflt -> 20574
    //   20563: ldc2_w 81621398
    //   20566: l2i
    //   20567: ldc_w -2083400561
    //   20570: ixor
    //   20571: goto -> 20582
    //   20574: ldc2_w -1638195403
    //   20577: l2i
    //   20578: ldc_w 526558878
    //   20581: ixor
    //   20582: ldc2_w -864885599
    //   20585: l2i
    //   20586: ldc_w -1586728525
    //   20589: ixor
    //   20590: ixor
    //   20591: lookupswitch default -> 31031, -367906805 -> 20574, -332976967 -> 20616
    //   20616: getfield fps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20619: getstatic Perryc.c : I
    //   20622: iflt -> 20636
    //   20625: ldc2_w -1462346601
    //   20628: l2i
    //   20629: ldc_w 1847840406
    //   20632: ixor
    //   20633: goto -> 20644
    //   20636: ldc2_w 1005805373
    //   20639: l2i
    //   20640: ldc_w -1818497345
    //   20643: ixor
    //   20644: ldc2_w 726248733
    //   20647: l2i
    //   20648: ldc_w -1913873217
    //   20651: ixor
    //   20652: ixor
    //   20653: lookupswitch default -> 31451, 248348704 -> 20680, 1615897507 -> 20636
    //   20680: goto -> 20684
    //   20683: athrow
    //   20684: invokevirtual getValue : ()Ljava/lang/Object;
    //   20687: goto -> 20691
    //   20690: athrow
    //   20691: checkcast java/lang/Boolean
    //   20694: getstatic Perryc.0 : I
    //   20697: ifle -> 20711
    //   20700: ldc2_w -1945001162
    //   20703: l2i
    //   20704: ldc_w -1475411907
    //   20707: ixor
    //   20708: goto -> 20719
    //   20711: ldc2_w -1574407128
    //   20714: l2i
    //   20715: ldc_w 1774299780
    //   20718: ixor
    //   20719: ldc2_w 299234913
    //   20722: l2i
    //   20723: ldc_w -1035742633
    //   20726: ixor
    //   20727: ixor
    //   20728: lookupswitch default -> 31337, -142047427 -> 20711, 411040410 -> 20756
    //   20756: goto -> 20760
    //   20759: athrow
    //   20760: invokevirtual booleanValue : ()Z
    //   20763: goto -> 20767
    //   20766: athrow
    //   20767: ifeq -> 20781
    //   20770: ldc2_w -1952831359
    //   20773: l2i
    //   20774: ldc_w -1953149324
    //   20777: ixor
    //   20778: goto -> 20789
    //   20781: ldc2_w 703069160
    //   20784: l2i
    //   20785: ldc_w 703110428
    //   20788: ixor
    //   20789: ldc2_w 1760306322
    //   20792: l2i
    //   20793: ldc_w 1713901659
    //   20796: ixor
    //   20797: ixor
    //   20798: tableswitch default -> 20770, 248205884 -> 20820, 248205885 -> 21754
    //   20820: getstatic Perryc.1 : I
    //   20823: ifeq -> 20837
    //   20826: ldc2_w -1634317827
    //   20829: l2i
    //   20830: ldc_w -203026670
    //   20833: ixor
    //   20834: goto -> 20845
    //   20837: ldc2_w -1246328212
    //   20840: l2i
    //   20841: ldc_w 1174742780
    //   20844: ixor
    //   20845: ldc2_w 718337333
    //   20848: l2i
    //   20849: ldc_w 765130175
    //   20852: ixor
    //   20853: ixor
    //   20854: lookupswitch default -> 30997, -184964070 -> 20880, 1782204005 -> 20837
    //   20880: aload_0
    //   20881: getstatic Perryc.1 : I
    //   20884: ifeq -> 20898
    //   20887: ldc2_w -1640940597
    //   20890: l2i
    //   20891: ldc_w 672254865
    //   20894: ixor
    //   20895: goto -> 20906
    //   20898: ldc2_w -1054233169
    //   20901: l2i
    //   20902: ldc_w 175361529
    //   20905: ixor
    //   20906: ldc2_w -1178494618
    //   20909: l2i
    //   20910: ldc_w -1921988479
    //   20913: ixor
    //   20914: ixor
    //   20915: lookupswitch default -> 20940, -2104385091 -> 31077, 1423830551 -> 20898
    //   20940: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   20943: getstatic Perryc.c : I
    //   20946: iflt -> 20960
    //   20949: ldc2_w -255851626
    //   20952: l2i
    //   20953: ldc_w 1970628782
    //   20956: ixor
    //   20957: goto -> 20968
    //   20960: ldc2_w 1802846152
    //   20963: l2i
    //   20964: ldc_w -1176304653
    //   20967: ixor
    //   20968: ldc2_w -1818965093
    //   20971: l2i
    //   20972: ldc_w -1786896360
    //   20975: ixor
    //   20976: ixor
    //   20977: lookupswitch default -> 31017, -2090893125 -> 20960, -730015816 -> 21004
    //   21004: aload_2
    //   21005: getstatic Perryc.0 : I
    //   21008: ifle -> 21022
    //   21011: ldc2_w 2118863531
    //   21014: l2i
    //   21015: ldc_w 2032269751
    //   21018: ixor
    //   21019: goto -> 21030
    //   21022: ldc2_w -1628557856
    //   21025: l2i
    //   21026: ldc_w -450746276
    //   21029: ixor
    //   21030: ldc2_w 46188378
    //   21033: l2i
    //   21034: ldc_w 1778201812
    //   21037: ixor
    //   21038: ixor
    //   21039: lookupswitch default -> 21064, 1451632383 -> 21022, 1817657490 -> 31001
    //   21064: aload_0
    //   21065: getstatic Perryc.0 : I
    //   21068: ifle -> 21082
    //   21071: ldc2_w -290197319
    //   21074: l2i
    //   21075: ldc_w 1487006221
    //   21078: ixor
    //   21079: goto -> 21090
    //   21082: ldc2_w -12342447
    //   21085: l2i
    //   21086: ldc_w -166504589
    //   21089: ixor
    //   21090: ldc2_w -1467343256
    //   21093: l2i
    //   21094: ldc_w 1944878116
    //   21097: ixor
    //   21098: ixor
    //   21099: lookupswitch default -> 21124, -1974889445 -> 21082, 1836349688 -> 30773
    //   21124: getfield FpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21127: getstatic Perryc.0 : I
    //   21130: ifle -> 21144
    //   21133: ldc2_w 1427458123
    //   21136: l2i
    //   21137: ldc_w 251072197
    //   21140: ixor
    //   21141: goto -> 21152
    //   21144: ldc2_w 1521568694
    //   21147: l2i
    //   21148: ldc_w 505291533
    //   21151: ixor
    //   21152: ldc2_w 1907978461
    //   21155: l2i
    //   21156: ldc_w -367514544
    //   21159: ixor
    //   21160: ixor
    //   21161: lookupswitch default -> 31155, -1069344253 -> 21144, -552717258 -> 21188
    //   21188: goto -> 21192
    //   21191: athrow
    //   21192: invokevirtual getValue : ()Ljava/lang/Object;
    //   21195: goto -> 21199
    //   21198: athrow
    //   21199: checkcast java/lang/Integer
    //   21202: getstatic Perryc.c : I
    //   21205: iflt -> 21219
    //   21208: ldc2_w -393998457
    //   21211: l2i
    //   21212: ldc_w -1409722935
    //   21215: ixor
    //   21216: goto -> 21227
    //   21219: ldc2_w 1137864201
    //   21222: l2i
    //   21223: ldc_w -155464516
    //   21226: ixor
    //   21227: ldc2_w -374952033
    //   21230: l2i
    //   21231: ldc_w -571332893
    //   21234: ixor
    //   21235: ixor
    //   21236: lookupswitch default -> 21264, 464852536 -> 21219, 1999229746 -> 31219
    //   21264: goto -> 21268
    //   21267: athrow
    //   21268: invokevirtual intValue : ()I
    //   21271: goto -> 21275
    //   21274: athrow
    //   21275: i2f
    //   21276: getstatic Perryc.1 : I
    //   21279: ifeq -> 21293
    //   21282: ldc2_w -1257566365
    //   21285: l2i
    //   21286: ldc_w 2054305093
    //   21289: ixor
    //   21290: goto -> 21301
    //   21293: ldc2_w -2084730878
    //   21296: l2i
    //   21297: ldc_w -333207378
    //   21300: ixor
    //   21301: ldc2_w 223467494
    //   21304: l2i
    //   21305: ldc_w 938390549
    //   21308: ixor
    //   21309: ixor
    //   21310: lookupswitch default -> 21336, -171550251 -> 31409, -57851103 -> 21293
    //   21336: aload_0
    //   21337: getstatic Perryc.0 : I
    //   21340: ifle -> 21354
    //   21343: ldc2_w -2062856203
    //   21346: l2i
    //   21347: ldc_w -834658761
    //   21350: ixor
    //   21351: goto -> 21362
    //   21354: ldc2_w 1762816584
    //   21357: l2i
    //   21358: ldc_w 900008298
    //   21361: ixor
    //   21362: ldc2_w 1426381363
    //   21365: l2i
    //   21366: ldc_w 141443358
    //   21369: ixor
    //   21370: ixor
    //   21371: lookupswitch default -> 30951, 31318031 -> 21396, 371313391 -> 21354
    //   21396: getfield FpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21399: getstatic Perryc.0 : I
    //   21402: ifle -> 21416
    //   21405: ldc2_w 853951303
    //   21408: l2i
    //   21409: ldc_w -1147679779
    //   21412: ixor
    //   21413: goto -> 21424
    //   21416: ldc2_w 339477698
    //   21419: l2i
    //   21420: ldc_w 165140079
    //   21423: ixor
    //   21424: ldc2_w -1580334679
    //   21427: l2i
    //   21428: ldc_w -890114011
    //   21431: ixor
    //   21432: ixor
    //   21433: lookupswitch default -> 21460, -1971163652 -> 21416, -498173674 -> 31213
    //   21460: goto -> 21464
    //   21463: athrow
    //   21464: invokevirtual getValue : ()Ljava/lang/Object;
    //   21467: goto -> 21471
    //   21470: athrow
    //   21471: checkcast java/lang/Integer
    //   21474: getstatic Perryc.1 : I
    //   21477: ifeq -> 21491
    //   21480: ldc2_w 2060529459
    //   21483: l2i
    //   21484: ldc_w 667778260
    //   21487: ixor
    //   21488: goto -> 21499
    //   21491: ldc2_w -193980086
    //   21494: l2i
    //   21495: ldc_w 99488071
    //   21498: ixor
    //   21499: ldc2_w -857789057
    //   21502: l2i
    //   21503: ldc_w 1110420393
    //   21506: ixor
    //   21507: ixor
    //   21508: lookupswitch default -> 30865, -739453647 -> 21491, 2137951963 -> 21536
    //   21536: goto -> 21540
    //   21539: athrow
    //   21540: invokevirtual intValue : ()I
    //   21543: goto -> 21547
    //   21546: athrow
    //   21547: i2f
    //   21548: getstatic Perryc.c : I
    //   21551: iflt -> 21565
    //   21554: ldc2_w 351768777
    //   21557: l2i
    //   21558: ldc_w 1007544496
    //   21561: ixor
    //   21562: goto -> 21573
    //   21565: ldc2_w 397761449
    //   21568: l2i
    //   21569: ldc_w -1742413476
    //   21572: ixor
    //   21573: ldc2_w -1001675257
    //   21576: l2i
    //   21577: ldc_w 1272425737
    //   21580: ixor
    //   21581: ixor
    //   21582: lookupswitch default -> 31257, -1486457993 -> 21565, 897531 -> 21608
    //   21608: aload_0
    //   21609: getstatic Perryc.1 : I
    //   21612: ifeq -> 21626
    //   21615: ldc2_w -2047747469
    //   21618: l2i
    //   21619: ldc_w -552518150
    //   21622: ixor
    //   21623: goto -> 21634
    //   21626: ldc2_w 1247412409
    //   21629: l2i
    //   21630: ldc_w 2039346615
    //   21633: ixor
    //   21634: ldc2_w -662965308
    //   21637: l2i
    //   21638: ldc_w 1517987938
    //   21641: ixor
    //   21642: ixor
    //   21643: lookupswitch default -> 30875, -1311330648 -> 21668, -656294865 -> 21626
    //   21668: getfield color : I
    //   21671: ldc2_w 756715193
    //   21674: l2i
    //   21675: ldc_w 756715192
    //   21678: ixor
    //   21679: getstatic Perryc.1 : I
    //   21682: ifeq -> 21696
    //   21685: ldc2_w 214330696
    //   21688: l2i
    //   21689: ldc_w -782702260
    //   21692: ixor
    //   21693: goto -> 21704
    //   21696: ldc2_w -848428133
    //   21699: l2i
    //   21700: ldc_w -954203387
    //   21703: ixor
    //   21704: ldc2_w 1939058288
    //   21707: l2i
    //   21708: ldc_w 1381796089
    //   21711: ixor
    //   21712: ixor
    //   21713: lookupswitch default -> 21740, -61758835 -> 31597, 1375686504 -> 21696
    //   21740: goto -> 21744
    //   21743: athrow
    //   21744: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   21747: goto -> 21751
    //   21750: athrow
    //   21751: iinc #10, 12
    //   21754: getstatic Perryc.0 : I
    //   21757: ifle -> 21771
    //   21760: ldc2_w -407648418
    //   21763: l2i
    //   21764: ldc_w 2028440484
    //   21767: ixor
    //   21768: goto -> 21779
    //   21771: ldc2_w -1008866380
    //   21774: l2i
    //   21775: ldc_w -98299945
    //   21778: ixor
    //   21779: ldc2_w 2062842886
    //   21782: l2i
    //   21783: ldc_w -1657280449
    //   21786: ixor
    //   21787: ixor
    //   21788: lookupswitch default -> 31129, -566595494 -> 21816, 2023217347 -> 21771
    //   21816: aload_0
    //   21817: getstatic Perryc.0 : I
    //   21820: ifle -> 21834
    //   21823: ldc2_w 10837011
    //   21826: l2i
    //   21827: ldc_w 758260142
    //   21830: ixor
    //   21831: goto -> 21842
    //   21834: ldc2_w 40640576
    //   21837: l2i
    //   21838: ldc_w -1366975171
    //   21841: ixor
    //   21842: ldc2_w 1602417843
    //   21845: l2i
    //   21846: ldc_w -1147872069
    //   21849: ixor
    //   21850: ixor
    //   21851: lookupswitch default -> 21876, -914270795 -> 30987, 878852192 -> 21834
    //   21876: getfield tps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21879: getstatic Perryc.0 : I
    //   21882: ifle -> 21896
    //   21885: ldc2_w -471474824
    //   21888: l2i
    //   21889: ldc_w 1090913355
    //   21892: ixor
    //   21893: goto -> 21904
    //   21896: ldc2_w -1055170173
    //   21899: l2i
    //   21900: ldc_w -363191089
    //   21903: ixor
    //   21904: ldc2_w 823171772
    //   21907: l2i
    //   21908: ldc_w 1368069824
    //   21911: ixor
    //   21912: ixor
    //   21913: lookupswitch default -> 31229, -1032301233 -> 21896, 1272629552 -> 21940
    //   21940: goto -> 21944
    //   21943: athrow
    //   21944: invokevirtual getValue : ()Ljava/lang/Object;
    //   21947: goto -> 21951
    //   21950: athrow
    //   21951: checkcast java/lang/Boolean
    //   21954: getstatic Perryc.c : I
    //   21957: iflt -> 21971
    //   21960: ldc2_w 1674156218
    //   21963: l2i
    //   21964: ldc_w 66747109
    //   21967: ixor
    //   21968: goto -> 21979
    //   21971: ldc2_w -1843506029
    //   21974: l2i
    //   21975: ldc_w -927922167
    //   21978: ixor
    //   21979: ldc2_w -1662782550
    //   21982: l2i
    //   21983: ldc_w 1298115252
    //   21986: ixor
    //   21987: ixor
    //   21988: lookupswitch default -> 22016, -1315980479 -> 31427, 524718266 -> 21971
    //   22016: goto -> 22020
    //   22019: athrow
    //   22020: invokevirtual booleanValue : ()Z
    //   22023: goto -> 22027
    //   22026: athrow
    //   22027: ifeq -> 22041
    //   22030: ldc2_w -1193803373
    //   22033: l2i
    //   22034: ldc_w -1564347681
    //   22037: ixor
    //   22038: goto -> 22049
    //   22041: ldc2_w -299816989
    //   22044: l2i
    //   22045: ldc_w -197602132
    //   22048: ixor
    //   22049: ldc2_w -519272093
    //   22052: l2i
    //   22053: ldc_w -442273510
    //   22056: ixor
    //   22057: ixor
    //   22058: tableswitch default -> 22030, 515246901 -> 22080, 515246902 -> 23014
    //   22080: getstatic Perryc.0 : I
    //   22083: ifle -> 22097
    //   22086: ldc2_w -1451329658
    //   22089: l2i
    //   22090: ldc_w 1409028752
    //   22093: ixor
    //   22094: goto -> 22105
    //   22097: ldc2_w 937282371
    //   22100: l2i
    //   22101: ldc_w -1589503006
    //   22104: ixor
    //   22105: ldc2_w 1613702794
    //   22108: l2i
    //   22109: ldc_w 1354456142
    //   22112: ixor
    //   22113: ixor
    //   22114: lookupswitch default -> 30803, -1509184923 -> 22140, -904519726 -> 22097
    //   22140: aload_0
    //   22141: getstatic Perryc.1 : I
    //   22144: ifeq -> 22158
    //   22147: ldc2_w -531869743
    //   22150: l2i
    //   22151: ldc_w 180158792
    //   22154: ixor
    //   22155: goto -> 22166
    //   22158: ldc2_w 1956119776
    //   22161: l2i
    //   22162: ldc_w 623136075
    //   22165: ixor
    //   22166: ldc2_w -1994153112
    //   22169: l2i
    //   22170: ldc_w 159880945
    //   22173: ixor
    //   22174: ixor
    //   22175: lookupswitch default -> 22200, -1851149724 -> 22158, 1783986944 -> 31375
    //   22200: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   22203: getstatic Perryc.0 : I
    //   22206: ifle -> 22220
    //   22209: ldc2_w 988592731
    //   22212: l2i
    //   22213: ldc_w -1245750219
    //   22216: ixor
    //   22217: goto -> 22228
    //   22220: ldc2_w -116326786
    //   22223: l2i
    //   22224: ldc_w 1898058491
    //   22227: ixor
    //   22228: ldc2_w -1510120484
    //   22231: l2i
    //   22232: ldc_w 1008739917
    //   22235: ixor
    //   22236: ixor
    //   22237: lookupswitch default -> 31053, 300919060 -> 22264, 378446847 -> 22220
    //   22264: aload_3
    //   22265: getstatic Perryc.c : I
    //   22268: iflt -> 22282
    //   22271: ldc2_w -1450030919
    //   22274: l2i
    //   22275: ldc_w -1669342207
    //   22278: ixor
    //   22279: goto -> 22290
    //   22282: ldc2_w -905143630
    //   22285: l2i
    //   22286: ldc_w 206079025
    //   22289: ixor
    //   22290: ldc2_w -1004502762
    //   22293: l2i
    //   22294: ldc_w -170404626
    //   22297: ixor
    //   22298: ixor
    //   22299: lookupswitch default -> 31433, -139244677 -> 22324, 68862272 -> 22282
    //   22324: aload_0
    //   22325: getstatic Perryc.c : I
    //   22328: iflt -> 22342
    //   22331: ldc2_w -517228791
    //   22334: l2i
    //   22335: ldc_w -1160043287
    //   22338: ixor
    //   22339: goto -> 22350
    //   22342: ldc2_w 585222421
    //   22345: l2i
    //   22346: ldc_w -554913101
    //   22349: ixor
    //   22350: ldc2_w 1844769278
    //   22353: l2i
    //   22354: ldc_w -833333744
    //   22357: ixor
    //   22358: ixor
    //   22359: lookupswitch default -> 22384, -181040687 -> 22342, -128961522 -> 31519
    //   22384: getfield TpsX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22387: getstatic Perryc.1 : I
    //   22390: ifeq -> 22404
    //   22393: ldc2_w 30245787
    //   22396: l2i
    //   22397: ldc_w -378519170
    //   22400: ixor
    //   22401: goto -> 22412
    //   22404: ldc2_w -1293934679
    //   22407: l2i
    //   22408: ldc_w -448103011
    //   22411: ixor
    //   22412: ldc2_w 1265001215
    //   22415: l2i
    //   22416: ldc_w -319649757
    //   22419: ixor
    //   22420: ixor
    //   22421: lookupswitch default -> 31511, -264337176 -> 22448, 1328097337 -> 22404
    //   22448: goto -> 22452
    //   22451: athrow
    //   22452: invokevirtual getValue : ()Ljava/lang/Object;
    //   22455: goto -> 22459
    //   22458: athrow
    //   22459: checkcast java/lang/Integer
    //   22462: getstatic Perryc.0 : I
    //   22465: ifle -> 22479
    //   22468: ldc2_w -2050948451
    //   22471: l2i
    //   22472: ldc_w -1661374681
    //   22475: ixor
    //   22476: goto -> 22487
    //   22479: ldc2_w 1195143037
    //   22482: l2i
    //   22483: ldc_w 670436045
    //   22486: ixor
    //   22487: ldc2_w 274325824
    //   22490: l2i
    //   22491: ldc_w -1039911359
    //   22494: ixor
    //   22495: ixor
    //   22496: lookupswitch default -> 22524, -1820016605 -> 22479, -882525509 -> 31431
    //   22524: goto -> 22528
    //   22527: athrow
    //   22528: invokevirtual intValue : ()I
    //   22531: goto -> 22535
    //   22534: athrow
    //   22535: i2f
    //   22536: getstatic Perryc.1 : I
    //   22539: ifeq -> 22553
    //   22542: ldc2_w 782044037
    //   22545: l2i
    //   22546: ldc_w -1629683379
    //   22549: ixor
    //   22550: goto -> 22561
    //   22553: ldc2_w -932357795
    //   22556: l2i
    //   22557: ldc_w 901874859
    //   22560: ixor
    //   22561: ldc2_w 375784584
    //   22564: l2i
    //   22565: ldc_w -95927749
    //   22568: ixor
    //   22569: ixor
    //   22570: lookupswitch default -> 22596, -1316232172 -> 22553, 1550732411 -> 30781
    //   22596: aload_0
    //   22597: getstatic Perryc.0 : I
    //   22600: ifle -> 22614
    //   22603: ldc2_w 1138212541
    //   22606: l2i
    //   22607: ldc_w -95316810
    //   22610: ixor
    //   22611: goto -> 22622
    //   22614: ldc2_w 365722079
    //   22617: l2i
    //   22618: ldc_w 1608904184
    //   22621: ixor
    //   22622: ldc2_w -222931947
    //   22625: l2i
    //   22626: ldc_w 2113519506
    //   22629: ixor
    //   22630: ixor
    //   22631: lookupswitch default -> 31319, -983138400 -> 22656, 919191948 -> 22614
    //   22656: getfield TpsY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22659: getstatic Perryc.c : I
    //   22662: iflt -> 22676
    //   22665: ldc2_w -404532593
    //   22668: l2i
    //   22669: ldc_w 1860773096
    //   22672: ixor
    //   22673: goto -> 22684
    //   22676: ldc2_w -227190038
    //   22679: l2i
    //   22680: ldc_w 2019068983
    //   22683: ixor
    //   22684: ldc2_w -519803631
    //   22687: l2i
    //   22688: ldc_w 1054828273
    //   22691: ixor
    //   22692: ixor
    //   22693: lookupswitch default -> 31057, 1442241853 -> 22720, 1456569735 -> 22676
    //   22720: goto -> 22724
    //   22723: athrow
    //   22724: invokevirtual getValue : ()Ljava/lang/Object;
    //   22727: goto -> 22731
    //   22730: athrow
    //   22731: checkcast java/lang/Integer
    //   22734: getstatic Perryc.c : I
    //   22737: iflt -> 22751
    //   22740: ldc2_w 1879905196
    //   22743: l2i
    //   22744: ldc_w -1497930488
    //   22747: ixor
    //   22748: goto -> 22759
    //   22751: ldc2_w -1694077923
    //   22754: l2i
    //   22755: ldc_w -481209750
    //   22758: ixor
    //   22759: ldc2_w 153508323
    //   22762: l2i
    //   22763: ldc_w 1174801324
    //   22766: ixor
    //   22767: ixor
    //   22768: lookupswitch default -> 30991, -1717951253 -> 22751, 930573368 -> 22796
    //   22796: goto -> 22800
    //   22799: athrow
    //   22800: invokevirtual intValue : ()I
    //   22803: goto -> 22807
    //   22806: athrow
    //   22807: i2f
    //   22808: getstatic Perryc.0 : I
    //   22811: ifle -> 22825
    //   22814: ldc2_w -1087183527
    //   22817: l2i
    //   22818: ldc_w 210234981
    //   22821: ixor
    //   22822: goto -> 22833
    //   22825: ldc2_w -48205264
    //   22828: l2i
    //   22829: ldc_w 1285702423
    //   22832: ixor
    //   22833: ldc2_w 974959874
    //   22836: l2i
    //   22837: ldc_w 2013197452
    //   22840: ixor
    //   22841: ixor
    //   22842: lookupswitch default -> 31513, -60788567 -> 22868, -27833678 -> 22825
    //   22868: aload_0
    //   22869: getstatic Perryc.c : I
    //   22872: iflt -> 22886
    //   22875: ldc2_w 714241894
    //   22878: l2i
    //   22879: ldc_w -873947090
    //   22882: ixor
    //   22883: goto -> 22894
    //   22886: ldc2_w -2147389393
    //   22889: l2i
    //   22890: ldc_w 1192579484
    //   22893: ixor
    //   22894: ldc2_w 912078086
    //   22897: l2i
    //   22898: ldc_w 919187337
    //   22901: ixor
    //   22902: ixor
    //   22903: lookupswitch default -> 22928, -504476217 -> 30765, 1778638012 -> 22886
    //   22928: getfield color : I
    //   22931: ldc2_w -316769725
    //   22934: l2i
    //   22935: ldc_w -316769726
    //   22938: ixor
    //   22939: getstatic Perryc.0 : I
    //   22942: ifle -> 22956
    //   22945: ldc2_w 206304366
    //   22948: l2i
    //   22949: ldc_w -206017560
    //   22952: ixor
    //   22953: goto -> 22964
    //   22956: ldc2_w 987896515
    //   22959: l2i
    //   22960: ldc_w -1687066917
    //   22963: ixor
    //   22964: ldc2_w 1530176239
    //   22967: l2i
    //   22968: ldc_w 18665835
    //   22971: ixor
    //   22972: ixor
    //   22973: lookupswitch default -> 31051, -1512313854 -> 22956, -71626852 -> 23000
    //   23000: goto -> 23004
    //   23003: athrow
    //   23004: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   23007: goto -> 23011
    //   23010: athrow
    //   23011: iinc #10, 12
    //   23014: getstatic Perryc.0 : I
    //   23017: ifle -> 23031
    //   23020: ldc2_w 1866577068
    //   23023: l2i
    //   23024: ldc_w 240533041
    //   23027: ixor
    //   23028: goto -> 23039
    //   23031: ldc2_w -1522929305
    //   23034: l2i
    //   23035: ldc_w 459368968
    //   23038: ixor
    //   23039: ldc2_w -1926822329
    //   23042: l2i
    //   23043: ldc_w -567599919
    //   23046: ixor
    //   23047: ixor
    //   23048: lookupswitch default -> 31341, -313228807 -> 23076, 840667147 -> 23031
    //   23076: aload_0
    //   23077: getstatic Perryc.c : I
    //   23080: iflt -> 23094
    //   23083: ldc2_w 104773094
    //   23086: l2i
    //   23087: ldc_w 934138438
    //   23090: ixor
    //   23091: goto -> 23102
    //   23094: ldc2_w -1520079294
    //   23097: l2i
    //   23098: ldc_w 1830916818
    //   23101: ixor
    //   23102: ldc2_w 1796648504
    //   23105: l2i
    //   23106: ldc_w 1774956290
    //   23109: ixor
    //   23110: ixor
    //   23111: lookupswitch default -> 23136, 79511128 -> 23094, 860776090 -> 30829
    //   23136: getfield ping : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23139: getstatic Perryc.1 : I
    //   23142: ifeq -> 23156
    //   23145: ldc2_w -1715085977
    //   23148: l2i
    //   23149: ldc_w 1366588905
    //   23152: ixor
    //   23153: goto -> 23164
    //   23156: ldc2_w 874531316
    //   23159: l2i
    //   23160: ldc_w -2112857969
    //   23163: ixor
    //   23164: ldc2_w -397052489
    //   23167: l2i
    //   23168: ldc_w 1922303573
    //   23171: ixor
    //   23172: ixor
    //   23173: lookupswitch default -> 23200, -1589243177 -> 23156, 1383125868 -> 31485
    //   23200: goto -> 23204
    //   23203: athrow
    //   23204: invokevirtual getValue : ()Ljava/lang/Object;
    //   23207: goto -> 23211
    //   23210: athrow
    //   23211: checkcast java/lang/Boolean
    //   23214: getstatic Perryc.c : I
    //   23217: iflt -> 23231
    //   23220: ldc2_w -80092118
    //   23223: l2i
    //   23224: ldc_w 242186998
    //   23227: ixor
    //   23228: goto -> 23239
    //   23231: ldc2_w -733844335
    //   23234: l2i
    //   23235: ldc_w 1872079912
    //   23238: ixor
    //   23239: ldc2_w -668344571
    //   23242: l2i
    //   23243: ldc_w -2090368872
    //   23246: ixor
    //   23247: ixor
    //   23248: lookupswitch default -> 30789, -1374109375 -> 23231, -526803164 -> 23276
    //   23276: goto -> 23280
    //   23279: athrow
    //   23280: invokevirtual booleanValue : ()Z
    //   23283: goto -> 23287
    //   23286: athrow
    //   23287: ifeq -> 23301
    //   23290: ldc2_w 1099463409
    //   23293: l2i
    //   23294: ldc_w -67789802
    //   23297: ixor
    //   23298: goto -> 23309
    //   23301: ldc2_w -1381831482
    //   23304: l2i
    //   23305: ldc_w 400493088
    //   23308: ixor
    //   23309: ldc2_w -89728156
    //   23312: l2i
    //   23313: ldc_w 614105355
    //   23316: ixor
    //   23317: ixor
    //   23318: tableswitch default -> 23290, 1682029704 -> 23340, 1682029705 -> 24278
    //   23340: getstatic Perryc.1 : I
    //   23343: ifeq -> 23357
    //   23346: ldc2_w 96424164
    //   23349: l2i
    //   23350: ldc_w -424909555
    //   23353: ixor
    //   23354: goto -> 23365
    //   23357: ldc2_w -1452880653
    //   23360: l2i
    //   23361: ldc_w 1688019100
    //   23364: ixor
    //   23365: ldc2_w -1149049443
    //   23368: l2i
    //   23369: ldc_w -374629386
    //   23372: ixor
    //   23373: ixor
    //   23374: lookupswitch default -> 23400, -1321579646 -> 31285, 1986784764 -> 23357
    //   23400: aload_0
    //   23401: getstatic Perryc.1 : I
    //   23404: ifeq -> 23418
    //   23407: ldc2_w -804038792
    //   23410: l2i
    //   23411: ldc_w -1910376436
    //   23414: ixor
    //   23415: goto -> 23426
    //   23418: ldc2_w -163369299
    //   23421: l2i
    //   23422: ldc_w -1653041682
    //   23425: ixor
    //   23426: ldc2_w -1988185384
    //   23429: l2i
    //   23430: ldc_w -1717330218
    //   23433: ixor
    //   23434: ixor
    //   23435: lookupswitch default -> 31195, 1324319610 -> 23418, 2078709581 -> 23460
    //   23460: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   23463: getstatic Perryc.0 : I
    //   23466: ifle -> 23480
    //   23469: ldc2_w -1866374228
    //   23472: l2i
    //   23473: ldc_w 1346219031
    //   23476: ixor
    //   23477: goto -> 23488
    //   23480: ldc2_w 1011067153
    //   23483: l2i
    //   23484: ldc_w 973544310
    //   23487: ixor
    //   23488: ldc2_w 1632850245
    //   23491: l2i
    //   23492: ldc_w -845244472
    //   23495: ixor
    //   23496: ixor
    //   23497: lookupswitch default -> 30847, -1433832214 -> 23524, 1815152950 -> 23480
    //   23524: aload #4
    //   23526: getstatic Perryc.1 : I
    //   23529: ifeq -> 23543
    //   23532: ldc2_w -2011678418
    //   23535: l2i
    //   23536: ldc_w 694261415
    //   23539: ixor
    //   23540: goto -> 23551
    //   23543: ldc2_w -2032482452
    //   23546: l2i
    //   23547: ldc_w 2109961211
    //   23550: ixor
    //   23551: ldc2_w 1881834228
    //   23554: l2i
    //   23555: ldc_w 1243644559
    //   23558: ixor
    //   23559: ixor
    //   23560: lookupswitch default -> 23588, -1686917134 -> 31293, 1824235554 -> 23543
    //   23588: aload_0
    //   23589: getstatic Perryc.c : I
    //   23592: iflt -> 23606
    //   23595: ldc2_w -1827663199
    //   23598: l2i
    //   23599: ldc_w 1269709252
    //   23602: ixor
    //   23603: goto -> 23614
    //   23606: ldc2_w 814545898
    //   23609: l2i
    //   23610: ldc_w 2145585239
    //   23613: ixor
    //   23614: ldc2_w -2106339320
    //   23617: l2i
    //   23618: ldc_w 391003657
    //   23621: ixor
    //   23622: ixor
    //   23623: lookupswitch default -> 30905, -632152644 -> 23648, 1300481380 -> 23606
    //   23648: getfield PingX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23651: getstatic Perryc.0 : I
    //   23654: ifle -> 23668
    //   23657: ldc2_w 1502865214
    //   23660: l2i
    //   23661: ldc_w 692902417
    //   23664: ixor
    //   23665: goto -> 23676
    //   23668: ldc2_w 9578928
    //   23671: l2i
    //   23672: ldc_w -1140291084
    //   23675: ixor
    //   23676: ldc2_w 753126425
    //   23679: l2i
    //   23680: ldc_w -522549743
    //   23683: ixor
    //   23684: ixor
    //   23685: lookupswitch default -> 31279, -1125746905 -> 23668, 1889790540 -> 23712
    //   23712: goto -> 23716
    //   23715: athrow
    //   23716: invokevirtual getValue : ()Ljava/lang/Object;
    //   23719: goto -> 23723
    //   23722: athrow
    //   23723: checkcast java/lang/Integer
    //   23726: getstatic Perryc.1 : I
    //   23729: ifeq -> 23743
    //   23732: ldc2_w -1996918212
    //   23735: l2i
    //   23736: ldc_w -443469728
    //   23739: ixor
    //   23740: goto -> 23751
    //   23743: ldc2_w -535774691
    //   23746: l2i
    //   23747: ldc_w -1933966671
    //   23750: ixor
    //   23751: ldc2_w 2132269347
    //   23754: l2i
    //   23755: ldc_w 1853670014
    //   23758: ixor
    //   23759: ixor
    //   23760: lookupswitch default -> 23788, 217957676 -> 23743, 2080594177 -> 31217
    //   23788: goto -> 23792
    //   23791: athrow
    //   23792: invokevirtual intValue : ()I
    //   23795: goto -> 23799
    //   23798: athrow
    //   23799: i2f
    //   23800: getstatic Perryc.1 : I
    //   23803: ifeq -> 23817
    //   23806: ldc2_w 1702784535
    //   23809: l2i
    //   23810: ldc_w 1423997488
    //   23813: ixor
    //   23814: goto -> 23825
    //   23817: ldc2_w -589639600
    //   23820: l2i
    //   23821: ldc_w -1926199927
    //   23824: ixor
    //   23825: ldc2_w 1140516673
    //   23828: l2i
    //   23829: ldc_w -607182920
    //   23832: ixor
    //   23833: ixor
    //   23834: lookupswitch default -> 31215, -1448350498 -> 23817, -908088032 -> 23860
    //   23860: aload_0
    //   23861: getstatic Perryc.0 : I
    //   23864: ifle -> 23878
    //   23867: ldc2_w 1382347820
    //   23870: l2i
    //   23871: ldc_w -1648181934
    //   23874: ixor
    //   23875: goto -> 23886
    //   23878: ldc2_w 162839467
    //   23881: l2i
    //   23882: ldc_w 562748445
    //   23885: ixor
    //   23886: ldc2_w -1377454335
    //   23889: l2i
    //   23890: ldc_w -1829386617
    //   23893: ixor
    //   23894: ixor
    //   23895: lookupswitch default -> 23920, -256493320 -> 31531, 1489105858 -> 23878
    //   23920: getfield PingY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23923: getstatic Perryc.1 : I
    //   23926: ifeq -> 23940
    //   23929: ldc2_w 1208818863
    //   23932: l2i
    //   23933: ldc_w -1835865758
    //   23936: ixor
    //   23937: goto -> 23948
    //   23940: ldc2_w -885815964
    //   23943: l2i
    //   23944: ldc_w -1247010109
    //   23947: ixor
    //   23948: ldc2_w -401888237
    //   23951: l2i
    //   23952: ldc_w 577521048
    //   23955: ixor
    //   23956: ixor
    //   23957: lookupswitch default -> 31517, -1258795476 -> 23984, 284695622 -> 23940
    //   23984: goto -> 23988
    //   23987: athrow
    //   23988: invokevirtual getValue : ()Ljava/lang/Object;
    //   23991: goto -> 23995
    //   23994: athrow
    //   23995: checkcast java/lang/Integer
    //   23998: getstatic Perryc.0 : I
    //   24001: ifle -> 24015
    //   24004: ldc2_w -1971251402
    //   24007: l2i
    //   24008: ldc_w -990595765
    //   24011: ixor
    //   24012: goto -> 24023
    //   24015: ldc2_w -1636471063
    //   24018: l2i
    //   24019: ldc_w -1661999496
    //   24022: ixor
    //   24023: ldc2_w -889706210
    //   24026: l2i
    //   24027: ldc_w 2111841853
    //   24030: ixor
    //   24031: ixor
    //   24032: lookupswitch default -> 31109, -1249736782 -> 24060, -110252706 -> 24015
    //   24060: goto -> 24064
    //   24063: athrow
    //   24064: invokevirtual intValue : ()I
    //   24067: goto -> 24071
    //   24070: athrow
    //   24071: i2f
    //   24072: getstatic Perryc.c : I
    //   24075: iflt -> 24089
    //   24078: ldc2_w -760865370
    //   24081: l2i
    //   24082: ldc_w 549293291
    //   24085: ixor
    //   24086: goto -> 24097
    //   24089: ldc2_w 1222689262
    //   24092: l2i
    //   24093: ldc_w 866346669
    //   24096: ixor
    //   24097: ldc2_w -1579960499
    //   24100: l2i
    //   24101: ldc_w -1529186182
    //   24104: ixor
    //   24105: ixor
    //   24106: lookupswitch default -> 24132, -284517538 -> 24089, -149791110 -> 31167
    //   24132: aload_0
    //   24133: getstatic Perryc.c : I
    //   24136: iflt -> 24150
    //   24139: ldc2_w -731479473
    //   24142: l2i
    //   24143: ldc_w -34484100
    //   24146: ixor
    //   24147: goto -> 24158
    //   24150: ldc2_w 1063630528
    //   24153: l2i
    //   24154: ldc_w -1489959053
    //   24157: ixor
    //   24158: ldc2_w -308732329
    //   24161: l2i
    //   24162: ldc_w -1198404324
    //   24165: ixor
    //   24166: ixor
    //   24167: lookupswitch default -> 30953, -849583368 -> 24192, 2090828152 -> 24150
    //   24192: getfield color : I
    //   24195: ldc2_w -1348899507
    //   24198: l2i
    //   24199: ldc_w -1348899508
    //   24202: ixor
    //   24203: getstatic Perryc.1 : I
    //   24206: ifeq -> 24220
    //   24209: ldc2_w -1741502224
    //   24212: l2i
    //   24213: ldc_w 46110796
    //   24216: ixor
    //   24217: goto -> 24228
    //   24220: ldc2_w -620480770
    //   24223: l2i
    //   24224: ldc_w 462601119
    //   24227: ixor
    //   24228: ldc2_w 1331597963
    //   24231: l2i
    //   24232: ldc_w -1611040668
    //   24235: ixor
    //   24236: ixor
    //   24237: lookupswitch default -> 24264, 1135276426 -> 24220, 1244314195 -> 30939
    //   24264: goto -> 24268
    //   24267: athrow
    //   24268: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   24271: goto -> 24275
    //   24274: athrow
    //   24275: iinc #10, 12
    //   24278: getstatic Perryc.1 : I
    //   24281: ifeq -> 24295
    //   24284: ldc2_w 1595523207
    //   24287: l2i
    //   24288: ldc_w 2136695729
    //   24291: ixor
    //   24292: goto -> 24303
    //   24295: ldc2_w 1301836100
    //   24298: l2i
    //   24299: ldc_w -2096603061
    //   24302: ixor
    //   24303: ldc2_w -1815906274
    //   24306: l2i
    //   24307: ldc_w 1563579504
    //   24310: ixor
    //   24311: ixor
    //   24312: lookupswitch default -> 31107, -290222248 -> 24295, 6372705 -> 24340
    //   24340: aload_0
    //   24341: getstatic Perryc.c : I
    //   24344: iflt -> 24358
    //   24347: ldc2_w 2059322264
    //   24350: l2i
    //   24351: ldc_w -2144739032
    //   24354: ixor
    //   24355: goto -> 24366
    //   24358: ldc2_w -1909900437
    //   24361: l2i
    //   24362: ldc_w -270929631
    //   24365: ixor
    //   24366: ldc2_w -618158925
    //   24369: l2i
    //   24370: ldc_w -684867107
    //   24373: ixor
    //   24374: ixor
    //   24375: lookupswitch default -> 31351, -157464610 -> 24358, 1845145380 -> 24400
    //   24400: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24403: getstatic Perryc.1 : I
    //   24406: ifeq -> 24420
    //   24409: ldc2_w 884685235
    //   24412: l2i
    //   24413: ldc_w 459756548
    //   24416: ixor
    //   24417: goto -> 24428
    //   24420: ldc2_w -1870666190
    //   24423: l2i
    //   24424: ldc_w -1393794391
    //   24427: ixor
    //   24428: ldc2_w 57862430
    //   24431: l2i
    //   24432: ldc_w -444347146
    //   24435: ixor
    //   24436: ixor
    //   24437: lookupswitch default -> 30935, -919779233 -> 24420, -631070349 -> 24464
    //   24464: goto -> 24468
    //   24467: athrow
    //   24468: invokevirtual getValue : ()Ljava/lang/Object;
    //   24471: goto -> 24475
    //   24474: athrow
    //   24475: checkcast java/lang/Boolean
    //   24478: getstatic Perryc.1 : I
    //   24481: ifeq -> 24495
    //   24484: ldc2_w 1290832540
    //   24487: l2i
    //   24488: ldc_w 14692953
    //   24491: ixor
    //   24492: goto -> 24503
    //   24495: ldc2_w -1659725633
    //   24498: l2i
    //   24499: ldc_w -736999617
    //   24502: ixor
    //   24503: ldc2_w -806314821
    //   24506: l2i
    //   24507: ldc_w -1244938653
    //   24510: ixor
    //   24511: ixor
    //   24512: lookupswitch default -> 24540, -1136614074 -> 24495, 908827165 -> 31073
    //   24540: goto -> 24544
    //   24543: athrow
    //   24544: invokevirtual booleanValue : ()Z
    //   24547: goto -> 24551
    //   24550: athrow
    //   24551: ifeq -> 24565
    //   24554: ldc2_w -313151262
    //   24557: l2i
    //   24558: ldc_w 389804542
    //   24561: ixor
    //   24562: goto -> 24573
    //   24565: ldc2_w 888306109
    //   24568: l2i
    //   24569: ldc_w -828622682
    //   24572: ixor
    //   24573: ldc2_w 1563503138
    //   24576: l2i
    //   24577: ldc_w 1753299869
    //   24580: ixor
    //   24581: ixor
    //   24582: tableswitch default -> 24554, -807513949 -> 24604, -807513948 -> 25542
    //   24604: getstatic Perryc.c : I
    //   24607: iflt -> 24621
    //   24610: ldc2_w 558257310
    //   24613: l2i
    //   24614: ldc_w 631946353
    //   24617: ixor
    //   24618: goto -> 24629
    //   24621: ldc2_w -546308557
    //   24624: l2i
    //   24625: ldc_w -1447134047
    //   24628: ixor
    //   24629: ldc2_w 423786895
    //   24632: l2i
    //   24633: ldc_w 54277211
    //   24636: ixor
    //   24637: ixor
    //   24638: lookupswitch default -> 30941, 512927035 -> 24621, 1823461190 -> 24664
    //   24664: aload_0
    //   24665: getstatic Perryc.1 : I
    //   24668: ifeq -> 24682
    //   24671: ldc2_w -141839387
    //   24674: l2i
    //   24675: ldc_w 1179009310
    //   24678: ixor
    //   24679: goto -> 24690
    //   24682: ldc2_w -78559380
    //   24685: l2i
    //   24686: ldc_w 1417971430
    //   24689: ixor
    //   24690: ldc2_w -1922383793
    //   24693: l2i
    //   24694: ldc_w 69152228
    //   24697: ixor
    //   24698: ixor
    //   24699: lookupswitch default -> 30807, 648031265 -> 24724, 951590736 -> 24682
    //   24724: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   24727: getstatic Perryc.c : I
    //   24730: iflt -> 24744
    //   24733: ldc2_w 716349116
    //   24736: l2i
    //   24737: ldc_w -1142572116
    //   24740: ixor
    //   24741: goto -> 24752
    //   24744: ldc2_w -1312205839
    //   24747: l2i
    //   24748: ldc_w -1821601299
    //   24751: ixor
    //   24752: ldc2_w -1275124440
    //   24755: l2i
    //   24756: ldc_w 275385177
    //   24759: ixor
    //   24760: ixor
    //   24761: lookupswitch default -> 24788, 851577697 -> 31241, 1458350288 -> 24744
    //   24788: aload #5
    //   24790: getstatic Perryc.c : I
    //   24793: iflt -> 24807
    //   24796: ldc2_w -319820882
    //   24799: l2i
    //   24800: ldc_w 247869847
    //   24803: ixor
    //   24804: goto -> 24815
    //   24807: ldc2_w 373638090
    //   24810: l2i
    //   24811: ldc_w -1968553981
    //   24814: ixor
    //   24815: ldc2_w -506865407
    //   24818: l2i
    //   24819: ldc_w -213839573
    //   24822: ixor
    //   24823: ixor
    //   24824: lookupswitch default -> 24852, -257879533 -> 31313, 1733523255 -> 24807
    //   24852: aload_0
    //   24853: getstatic Perryc.0 : I
    //   24856: ifle -> 24870
    //   24859: ldc2_w -1204218932
    //   24862: l2i
    //   24863: ldc_w 403570830
    //   24866: ixor
    //   24867: goto -> 24878
    //   24870: ldc2_w 1684252357
    //   24873: l2i
    //   24874: ldc_w 1657233386
    //   24877: ixor
    //   24878: ldc2_w -1645177118
    //   24881: l2i
    //   24882: ldc_w -1385462191
    //   24885: ixor
    //   24886: ixor
    //   24887: lookupswitch default -> 30855, -1867774991 -> 24870, 910158236 -> 24912
    //   24912: getfield SpeedX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24915: getstatic Perryc.0 : I
    //   24918: ifle -> 24932
    //   24921: ldc2_w 1864170449
    //   24924: l2i
    //   24925: ldc_w -162945525
    //   24928: ixor
    //   24929: goto -> 24940
    //   24932: ldc2_w 111622956
    //   24935: l2i
    //   24936: ldc_w -341910386
    //   24939: ixor
    //   24940: ldc2_w -887858044
    //   24943: l2i
    //   24944: ldc_w 1551595636
    //   24947: ixor
    //   24948: ixor
    //   24949: lookupswitch default -> 24976, 238713130 -> 31131, 666285028 -> 24932
    //   24976: goto -> 24980
    //   24979: athrow
    //   24980: invokevirtual getValue : ()Ljava/lang/Object;
    //   24983: goto -> 24987
    //   24986: athrow
    //   24987: checkcast java/lang/Integer
    //   24990: getstatic Perryc.0 : I
    //   24993: ifle -> 25007
    //   24996: ldc2_w -1802020616
    //   24999: l2i
    //   25000: ldc_w 1905702595
    //   25003: ixor
    //   25004: goto -> 25015
    //   25007: ldc2_w -872111104
    //   25010: l2i
    //   25011: ldc_w -1093304156
    //   25014: ixor
    //   25015: ldc2_w -1103149039
    //   25018: l2i
    //   25019: ldc_w 976779117
    //   25022: ixor
    //   25023: ixor
    //   25024: lookupswitch default -> 25052, 1269709514 -> 25007, 1627836743 -> 31609
    //   25052: goto -> 25056
    //   25055: athrow
    //   25056: invokevirtual intValue : ()I
    //   25059: goto -> 25063
    //   25062: athrow
    //   25063: i2f
    //   25064: getstatic Perryc.0 : I
    //   25067: ifle -> 25081
    //   25070: ldc2_w -274140964
    //   25073: l2i
    //   25074: ldc_w -927760803
    //   25077: ixor
    //   25078: goto -> 25089
    //   25081: ldc2_w -22872563
    //   25084: l2i
    //   25085: ldc_w -1952042623
    //   25088: ixor
    //   25089: ldc2_w -2042119984
    //   25092: l2i
    //   25093: ldc_w -1210386235
    //   25096: ixor
    //   25097: ixor
    //   25098: lookupswitch default -> 30925, 377933460 -> 25081, 1150914457 -> 25124
    //   25124: aload_0
    //   25125: getstatic Perryc.0 : I
    //   25128: ifle -> 25142
    //   25131: ldc2_w 1316769794
    //   25134: l2i
    //   25135: ldc_w 1071998454
    //   25138: ixor
    //   25139: goto -> 25150
    //   25142: ldc2_w -1212956277
    //   25145: l2i
    //   25146: ldc_w 1440847812
    //   25149: ixor
    //   25150: ldc2_w 1304199861
    //   25153: l2i
    //   25154: ldc_w -750667234
    //   25157: ixor
    //   25158: ixor
    //   25159: lookupswitch default -> 25184, -278655649 -> 31083, 2107126251 -> 25142
    //   25184: getfield SpeedY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25187: getstatic Perryc.1 : I
    //   25190: ifeq -> 25204
    //   25193: ldc2_w 769727007
    //   25196: l2i
    //   25197: ldc_w 1466899120
    //   25200: ixor
    //   25201: goto -> 25212
    //   25204: ldc2_w -849032821
    //   25207: l2i
    //   25208: ldc_w 2008687678
    //   25211: ixor
    //   25212: ldc2_w 2109888843
    //   25215: l2i
    //   25216: ldc_w 761862958
    //   25219: ixor
    //   25220: ixor
    //   25221: lookupswitch default -> 31535, -361386032 -> 25248, 707085002 -> 25204
    //   25248: goto -> 25252
    //   25251: athrow
    //   25252: invokevirtual getValue : ()Ljava/lang/Object;
    //   25255: goto -> 25259
    //   25258: athrow
    //   25259: checkcast java/lang/Integer
    //   25262: getstatic Perryc.1 : I
    //   25265: ifeq -> 25279
    //   25268: ldc2_w -526690601
    //   25271: l2i
    //   25272: ldc_w 464067292
    //   25275: ixor
    //   25276: goto -> 25287
    //   25279: ldc2_w -506847475
    //   25282: l2i
    //   25283: ldc_w -802997505
    //   25286: ixor
    //   25287: ldc2_w -756183975
    //   25290: l2i
    //   25291: ldc_w 879065921
    //   25294: ixor
    //   25295: ixor
    //   25296: lookupswitch default -> 31515, -681454870 -> 25324, 498776851 -> 25279
    //   25324: goto -> 25328
    //   25327: athrow
    //   25328: invokevirtual intValue : ()I
    //   25331: goto -> 25335
    //   25334: athrow
    //   25335: i2f
    //   25336: getstatic Perryc.c : I
    //   25339: iflt -> 25353
    //   25342: ldc2_w 322683920
    //   25345: l2i
    //   25346: ldc_w -507112834
    //   25349: ixor
    //   25350: goto -> 25361
    //   25353: ldc2_w 443264553
    //   25356: l2i
    //   25357: ldc_w 474129933
    //   25360: ixor
    //   25361: ldc2_w -1827964637
    //   25364: l2i
    //   25365: ldc_w -278937591
    //   25368: ixor
    //   25369: ixor
    //   25370: lookupswitch default -> 25396, -1901498556 -> 31603, 1139306835 -> 25353
    //   25396: aload_0
    //   25397: getstatic Perryc.c : I
    //   25400: iflt -> 25414
    //   25403: ldc2_w -1765662591
    //   25406: l2i
    //   25407: ldc_w -1248624556
    //   25410: ixor
    //   25411: goto -> 25422
    //   25414: ldc2_w -1157473573
    //   25417: l2i
    //   25418: ldc_w 642452113
    //   25421: ixor
    //   25422: ldc2_w 717929270
    //   25425: l2i
    //   25426: ldc_w -546130535
    //   25429: ixor
    //   25430: ixor
    //   25431: lookupswitch default -> 25456, -839014663 -> 25414, -689328518 -> 31181
    //   25456: getfield color : I
    //   25459: ldc2_w 2119563065
    //   25462: l2i
    //   25463: ldc_w 2119563064
    //   25466: ixor
    //   25467: getstatic Perryc.c : I
    //   25470: iflt -> 25484
    //   25473: ldc2_w 429559954
    //   25476: l2i
    //   25477: ldc_w -297927615
    //   25480: ixor
    //   25481: goto -> 25492
    //   25484: ldc2_w 2042881721
    //   25487: l2i
    //   25488: ldc_w -1524445920
    //   25491: ixor
    //   25492: ldc2_w 102948855
    //   25495: l2i
    //   25496: ldc_w 1222466052
    //   25499: ixor
    //   25500: ixor
    //   25501: lookupswitch default -> 31441, -1843483030 -> 25528, -1185355488 -> 25484
    //   25528: goto -> 25532
    //   25531: athrow
    //   25532: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   25535: goto -> 25539
    //   25538: athrow
    //   25539: iinc #10, 12
    //   25542: getstatic Perryc.0 : I
    //   25545: ifle -> 25559
    //   25548: ldc2_w -2084425029
    //   25551: l2i
    //   25552: ldc_w 1386985862
    //   25555: ixor
    //   25556: goto -> 25567
    //   25559: ldc2_w -1809603460
    //   25562: l2i
    //   25563: ldc_w -518526880
    //   25566: ixor
    //   25567: ldc2_w -581510364
    //   25570: l2i
    //   25571: ldc_w 2083673115
    //   25574: ixor
    //   25575: ixor
    //   25576: lookupswitch default -> 31211, -732904669 -> 25604, 1879901186 -> 25559
    //   25604: aload_0
    //   25605: getstatic Perryc.1 : I
    //   25608: ifeq -> 25622
    //   25611: ldc2_w 2116904605
    //   25614: l2i
    //   25615: ldc_w -1418801344
    //   25618: ixor
    //   25619: goto -> 25630
    //   25622: ldc2_w -1443377979
    //   25625: l2i
    //   25626: ldc_w 551777592
    //   25629: ixor
    //   25630: ldc2_w -1033275265
    //   25633: l2i
    //   25634: ldc_w -121419011
    //   25637: ixor
    //   25638: ixor
    //   25639: lookupswitch default -> 25664, -461977478 -> 25622, -269903009 -> 31069
    //   25664: getfield time : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25667: getstatic Perryc.1 : I
    //   25670: ifeq -> 25684
    //   25673: ldc2_w -1069409358
    //   25676: l2i
    //   25677: ldc_w -1629492583
    //   25680: ixor
    //   25681: goto -> 25692
    //   25684: ldc2_w -23957918
    //   25687: l2i
    //   25688: ldc_w 2068662526
    //   25691: ixor
    //   25692: ldc2_w -1368268270
    //   25695: l2i
    //   25696: ldc_w -1431663839
    //   25699: ixor
    //   25700: ixor
    //   25701: lookupswitch default -> 25728, -853784219 -> 25684, 1514575896 -> 31075
    //   25728: goto -> 25732
    //   25731: athrow
    //   25732: invokevirtual getValue : ()Ljava/lang/Object;
    //   25735: goto -> 25739
    //   25738: athrow
    //   25739: checkcast java/lang/Boolean
    //   25742: getstatic Perryc.c : I
    //   25745: iflt -> 25759
    //   25748: ldc2_w 2014468616
    //   25751: l2i
    //   25752: ldc_w -326128553
    //   25755: ixor
    //   25756: goto -> 25767
    //   25759: ldc2_w -1248002171
    //   25762: l2i
    //   25763: ldc_w 1547964230
    //   25766: ixor
    //   25767: ldc2_w -98384537
    //   25770: l2i
    //   25771: ldc_w -1701724671
    //   25774: ixor
    //   25775: ixor
    //   25776: lookupswitch default -> 25804, -198275783 -> 31371, 1759783147 -> 25759
    //   25804: goto -> 25808
    //   25807: athrow
    //   25808: invokevirtual booleanValue : ()Z
    //   25811: goto -> 25815
    //   25814: athrow
    //   25815: ifeq -> 25829
    //   25818: ldc2_w -1202591286
    //   25821: l2i
    //   25822: ldc_w -1726029578
    //   25825: ixor
    //   25826: goto -> 25837
    //   25829: ldc2_w 2020363724
    //   25832: l2i
    //   25833: ldc_w 1495483633
    //   25836: ixor
    //   25837: ldc2_w -1147715363
    //   25840: l2i
    //   25841: ldc_w -368742587
    //   25844: ixor
    //   25845: ixor
    //   25846: tableswitch default -> 25818, 1893541540 -> 25868, 1893541541 -> 26957
    //   25868: getstatic Perryc.1 : I
    //   25871: ifeq -> 25885
    //   25874: ldc2_w -1826203927
    //   25877: l2i
    //   25878: ldc_w 1913834834
    //   25881: ixor
    //   25882: goto -> 25893
    //   25885: ldc2_w 1549738767
    //   25888: l2i
    //   25889: ldc_w -416018642
    //   25892: ixor
    //   25893: ldc2_w 565095073
    //   25896: l2i
    //   25897: ldc_w -143179724
    //   25900: ixor
    //   25901: ixor
    //   25902: lookupswitch default -> 30763, 938307886 -> 25885, 1840432820 -> 25928
    //   25928: aload_0
    //   25929: getstatic Perryc.c : I
    //   25932: iflt -> 25946
    //   25935: ldc2_w -1126554202
    //   25938: l2i
    //   25939: ldc_w 646904894
    //   25942: ixor
    //   25943: goto -> 25954
    //   25946: ldc2_w 586071759
    //   25949: l2i
    //   25950: ldc_w 1185421899
    //   25953: ixor
    //   25954: ldc2_w 406442746
    //   25957: l2i
    //   25958: ldc_w 317221230
    //   25961: ixor
    //   25962: ixor
    //   25963: lookupswitch default -> 31575, -1870306804 -> 25946, 1855397648 -> 25988
    //   25988: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   25991: getstatic Perryc.1 : I
    //   25994: ifeq -> 26008
    //   25997: ldc2_w 638423318
    //   26000: l2i
    //   26001: ldc_w -744466029
    //   26004: ixor
    //   26005: goto -> 26016
    //   26008: ldc2_w 1734217996
    //   26011: l2i
    //   26012: ldc_w 833037112
    //   26015: ixor
    //   26016: ldc2_w -242403613
    //   26019: l2i
    //   26020: ldc_w -1432833174
    //   26023: ixor
    //   26024: ixor
    //   26025: lookupswitch default -> 26052, -1363653364 -> 30929, 1785274662 -> 26008
    //   26052: aload #9
    //   26054: getstatic Perryc.0 : I
    //   26057: ifle -> 26071
    //   26060: ldc2_w -870932799
    //   26063: l2i
    //   26064: ldc_w -2114362389
    //   26067: ixor
    //   26068: goto -> 26079
    //   26071: ldc2_w -265041046
    //   26074: l2i
    //   26075: ldc_w 1356837099
    //   26078: ixor
    //   26079: ldc2_w -1753663023
    //   26082: l2i
    //   26083: ldc_w 294440105
    //   26086: ixor
    //   26087: ixor
    //   26088: lookupswitch default -> 26116, -1213331398 -> 26071, -887486382 -> 30899
    //   26116: aload_0
    //   26117: getstatic Perryc.1 : I
    //   26120: ifeq -> 26134
    //   26123: ldc2_w 1503731646
    //   26126: l2i
    //   26127: ldc_w -1950439262
    //   26130: ixor
    //   26131: goto -> 26142
    //   26134: ldc2_w 1752655700
    //   26137: l2i
    //   26138: ldc_w 561405513
    //   26141: ixor
    //   26142: ldc2_w 872947953
    //   26145: l2i
    //   26146: ldc_w -298167493
    //   26149: ixor
    //   26150: ixor
    //   26151: lookupswitch default -> 26176, 137217238 -> 31265, 1850076672 -> 26134
    //   26176: getfield TimeX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26179: getstatic Perryc.c : I
    //   26182: iflt -> 26196
    //   26185: ldc2_w 1601995660
    //   26188: l2i
    //   26189: ldc_w 1307647979
    //   26192: ixor
    //   26193: goto -> 26204
    //   26196: ldc2_w 825435604
    //   26199: l2i
    //   26200: ldc_w 857940462
    //   26203: ixor
    //   26204: ldc2_w -601136630
    //   26207: l2i
    //   26208: ldc_w -1581751417
    //   26211: ixor
    //   26212: ixor
    //   26213: lookupswitch default -> 26240, -1197521925 -> 26196, 1864277482 -> 31473
    //   26240: goto -> 26244
    //   26243: athrow
    //   26244: invokevirtual getValue : ()Ljava/lang/Object;
    //   26247: goto -> 26251
    //   26250: athrow
    //   26251: checkcast java/lang/Integer
    //   26254: getstatic Perryc.0 : I
    //   26257: ifle -> 26271
    //   26260: ldc2_w -317766140
    //   26263: l2i
    //   26264: ldc_w -1473259653
    //   26267: ixor
    //   26268: goto -> 26279
    //   26271: ldc2_w -297477347
    //   26274: l2i
    //   26275: ldc_w -737029258
    //   26278: ixor
    //   26279: ldc2_w 1641593387
    //   26282: l2i
    //   26283: ldc_w 933257917
    //   26286: ixor
    //   26287: ixor
    //   26288: lookupswitch default -> 31175, 324553193 -> 26271, 1814941949 -> 26316
    //   26316: goto -> 26320
    //   26319: athrow
    //   26320: invokevirtual intValue : ()I
    //   26323: goto -> 26327
    //   26326: athrow
    //   26327: i2f
    //   26328: getstatic Perryc.1 : I
    //   26331: ifeq -> 26345
    //   26334: ldc2_w 1892747596
    //   26337: l2i
    //   26338: ldc_w -1718512415
    //   26341: ixor
    //   26342: goto -> 26353
    //   26345: ldc2_w 213017590
    //   26348: l2i
    //   26349: ldc_w -2000327475
    //   26352: ixor
    //   26353: ldc2_w 123865038
    //   26356: l2i
    //   26357: ldc_w 211574576
    //   26360: ixor
    //   26361: ixor
    //   26362: lookupswitch default -> 26388, -490814125 -> 31507, -203777391 -> 26345
    //   26388: aload_0
    //   26389: getstatic Perryc.1 : I
    //   26392: ifeq -> 26406
    //   26395: ldc2_w -1543670083
    //   26398: l2i
    //   26399: ldc_w 1106738207
    //   26402: ixor
    //   26403: goto -> 26414
    //   26406: ldc2_w -1180158831
    //   26409: l2i
    //   26410: ldc_w -870336526
    //   26413: ixor
    //   26414: ldc2_w 277287906
    //   26417: l2i
    //   26418: ldc_w 973109393
    //   26421: ixor
    //   26422: ixor
    //   26423: lookupswitch default -> 26448, -930258479 -> 31023, 919316204 -> 26406
    //   26448: getfield TimeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26451: getstatic Perryc.c : I
    //   26454: iflt -> 26468
    //   26457: ldc2_w -2123152158
    //   26460: l2i
    //   26461: ldc_w 1420869039
    //   26464: ixor
    //   26465: goto -> 26476
    //   26468: ldc2_w -1461553123
    //   26471: l2i
    //   26472: ldc_w 1386651393
    //   26475: ixor
    //   26476: ldc2_w 1606773016
    //   26479: l2i
    //   26480: ldc_w -2114784065
    //   26483: ixor
    //   26484: ixor
    //   26485: lookupswitch default -> 26512, 200565994 -> 31259, 1621353550 -> 26468
    //   26512: goto -> 26516
    //   26515: athrow
    //   26516: invokevirtual getValue : ()Ljava/lang/Object;
    //   26519: goto -> 26523
    //   26522: athrow
    //   26523: checkcast java/lang/Integer
    //   26526: getstatic Perryc.1 : I
    //   26529: ifeq -> 26543
    //   26532: ldc2_w -1178173734
    //   26535: l2i
    //   26536: ldc_w -107448337
    //   26539: ixor
    //   26540: goto -> 26551
    //   26543: ldc2_w 1571335908
    //   26546: l2i
    //   26547: ldc_w -2047241841
    //   26550: ixor
    //   26551: ldc2_w -917244954
    //   26554: l2i
    //   26555: ldc_w 826602144
    //   26558: ixor
    //   26559: ixor
    //   26560: lookupswitch default -> 26588, -1203173261 -> 31207, -786153754 -> 26543
    //   26588: goto -> 26592
    //   26591: athrow
    //   26592: invokevirtual intValue : ()I
    //   26595: goto -> 26599
    //   26598: athrow
    //   26599: i2f
    //   26600: getstatic Perryc.c : I
    //   26603: iflt -> 26617
    //   26606: ldc2_w -527698176
    //   26609: l2i
    //   26610: ldc_w -1029080947
    //   26613: ixor
    //   26614: goto -> 26625
    //   26617: ldc2_w 1561823991
    //   26620: l2i
    //   26621: ldc_w -2046954922
    //   26624: ixor
    //   26625: ldc2_w 501636581
    //   26628: l2i
    //   26629: ldc_w 418699204
    //   26632: ixor
    //   26633: ixor
    //   26634: lookupswitch default -> 31395, -570887552 -> 26660, 657458604 -> 26617
    //   26660: aload_0
    //   26661: getstatic Perryc.0 : I
    //   26664: ifle -> 26678
    //   26667: ldc2_w -1855101590
    //   26670: l2i
    //   26671: ldc_w 1249361370
    //   26674: ixor
    //   26675: goto -> 26686
    //   26678: ldc2_w -785945186
    //   26681: l2i
    //   26682: ldc_w 1170904475
    //   26685: ixor
    //   26686: ldc2_w 673477374
    //   26689: l2i
    //   26690: ldc_w -1845036477
    //   26693: ixor
    //   26694: ixor
    //   26695: lookupswitch default -> 30947, 785346744 -> 26720, 1631080461 -> 26678
    //   26720: getfield color : I
    //   26723: ldc2_w -725929288
    //   26726: l2i
    //   26727: ldc_w -725929287
    //   26730: ixor
    //   26731: getstatic Perryc.1 : I
    //   26734: ifeq -> 26748
    //   26737: ldc2_w 1533255159
    //   26740: l2i
    //   26741: ldc_w 2010441532
    //   26744: ixor
    //   26745: goto -> 26756
    //   26748: ldc2_w 277772120
    //   26751: l2i
    //   26752: ldc_w -336544101
    //   26755: ixor
    //   26756: ldc2_w -2045732223
    //   26759: l2i
    //   26760: ldc_w -1263226648
    //   26763: ixor
    //   26764: ixor
    //   26765: lookupswitch default -> 30819, -908401750 -> 26792, 504582306 -> 26748
    //   26792: goto -> 26796
    //   26795: athrow
    //   26796: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   26799: goto -> 26803
    //   26802: athrow
    //   26803: getstatic Perryc.1 : I
    //   26806: ifeq -> 26820
    //   26809: ldc2_w 1026162097
    //   26812: l2i
    //   26813: ldc_w -1682068065
    //   26816: ixor
    //   26817: goto -> 26828
    //   26820: ldc2_w -101156067
    //   26823: l2i
    //   26824: ldc_w 1168577732
    //   26827: ixor
    //   26828: ldc2_w -619768908
    //   26831: l2i
    //   26832: ldc_w -745578345
    //   26835: ixor
    //   26836: ixor
    //   26837: lookupswitch default -> 31171, -1374412019 -> 26820, -1260446470 -> 26864
    //   26864: aload #11
    //   26866: ldc2_w -1361918253
    //   26869: l2i
    //   26870: ldc_w -1361918253
    //   26873: ixor
    //   26874: getstatic Perryc.c : I
    //   26877: iflt -> 26891
    //   26880: ldc2_w -384603115
    //   26883: l2i
    //   26884: ldc_w -568239150
    //   26887: ixor
    //   26888: goto -> 26899
    //   26891: ldc2_w 414373928
    //   26894: l2i
    //   26895: ldc_w 850334508
    //   26898: ixor
    //   26899: ldc2_w -1263031738
    //   26902: l2i
    //   26903: ldc_w -1268737475
    //   26906: ixor
    //   26907: ixor
    //   26908: lookupswitch default -> 31179, 717945727 -> 26936, 937756604 -> 26891
    //   26936: aload #11
    //   26938: ldc2_w 208241469
    //   26941: l2i
    //   26942: ldc_w 208241469
    //   26945: ixor
    //   26946: iaload
    //   26947: ldc2_w 1011443722
    //   26950: l2i
    //   26951: ldc_w 1011443723
    //   26954: ixor
    //   26955: iadd
    //   26956: iastore
    //   26957: getstatic Perryc.1 : I
    //   26960: ifeq -> 26974
    //   26963: ldc2_w 569308837
    //   26966: l2i
    //   26967: ldc_w 495984565
    //   26970: ixor
    //   26971: goto -> 26982
    //   26974: ldc2_w 425828016
    //   26977: l2i
    //   26978: ldc_w -1689018607
    //   26981: ixor
    //   26982: ldc2_w -603878994
    //   26985: l2i
    //   26986: ldc_w -1435591758
    //   26989: ixor
    //   26990: ixor
    //   26991: lookupswitch default -> 31363, -195226691 -> 27016, 1242692364 -> 26974
    //   27016: aload_0
    //   27017: getstatic Perryc.c : I
    //   27020: iflt -> 27034
    //   27023: ldc2_w 1679395798
    //   27026: l2i
    //   27027: ldc_w -181010225
    //   27030: ixor
    //   27031: goto -> 27042
    //   27034: ldc2_w 1341143004
    //   27037: l2i
    //   27038: ldc_w 830087441
    //   27041: ixor
    //   27042: ldc2_w -23984549
    //   27045: l2i
    //   27046: ldc_w -945466683
    //   27049: ixor
    //   27050: ixor
    //   27051: lookupswitch default -> 27076, -1474764921 -> 31439, 67417935 -> 27034
    //   27076: getfield crystals : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27079: getstatic Perryc.0 : I
    //   27082: ifle -> 27096
    //   27085: ldc2_w 1128441140
    //   27088: l2i
    //   27089: ldc_w 2117997128
    //   27092: ixor
    //   27093: goto -> 27104
    //   27096: ldc2_w 4547561
    //   27099: l2i
    //   27100: ldc_w -309061523
    //   27103: ixor
    //   27104: ldc2_w -9052092
    //   27107: l2i
    //   27108: ldc_w -773746881
    //   27111: ixor
    //   27112: ixor
    //   27113: lookupswitch default -> 31469, -1018882817 -> 27140, 334026759 -> 27096
    //   27140: goto -> 27144
    //   27143: athrow
    //   27144: invokevirtual getValue : ()Ljava/lang/Object;
    //   27147: goto -> 27151
    //   27150: athrow
    //   27151: checkcast java/lang/Boolean
    //   27154: getstatic Perryc.1 : I
    //   27157: ifeq -> 27171
    //   27160: ldc2_w 835258471
    //   27163: l2i
    //   27164: ldc_w 1339468458
    //   27167: ixor
    //   27168: goto -> 27179
    //   27171: ldc2_w 1366380284
    //   27174: l2i
    //   27175: ldc_w 260149413
    //   27178: ixor
    //   27179: ldc2_w -1383330574
    //   27182: l2i
    //   27183: ldc_w 592097311
    //   27186: ixor
    //   27187: ixor
    //   27188: lookupswitch default -> 31005, -801742156 -> 27216, -254206432 -> 27171
    //   27216: goto -> 27220
    //   27219: athrow
    //   27220: invokevirtual booleanValue : ()Z
    //   27223: goto -> 27227
    //   27226: athrow
    //   27227: ifeq -> 27241
    //   27230: ldc2_w -1059137316
    //   27233: l2i
    //   27234: ldc_w 2056957715
    //   27237: ixor
    //   27238: goto -> 27249
    //   27241: ldc2_w -1648359688
    //   27244: l2i
    //   27245: ldc_w 662991158
    //   27248: ixor
    //   27249: ldc2_w 519084548
    //   27252: l2i
    //   27253: ldc_w -1624598203
    //   27256: ixor
    //   27257: ixor
    //   27258: tableswitch default -> 27230, 1000240270 -> 27280, 1000240271 -> 28218
    //   27280: getstatic Perryc.1 : I
    //   27283: ifeq -> 27297
    //   27286: ldc2_w 1081239320
    //   27289: l2i
    //   27290: ldc_w 1624592659
    //   27293: ixor
    //   27294: goto -> 27305
    //   27297: ldc2_w -124471701
    //   27300: l2i
    //   27301: ldc_w -1718755122
    //   27304: ixor
    //   27305: ldc2_w -1040951336
    //   27308: l2i
    //   27309: ldc_w -527852052
    //   27312: ixor
    //   27313: ixor
    //   27314: lookupswitch default -> 27340, -1250396665 -> 27297, 31128639 -> 31111
    //   27340: aload_0
    //   27341: getstatic Perryc.c : I
    //   27344: iflt -> 27358
    //   27347: ldc2_w -758728682
    //   27350: l2i
    //   27351: ldc_w -1615439675
    //   27354: ixor
    //   27355: goto -> 27366
    //   27358: ldc2_w 213190658
    //   27361: l2i
    //   27362: ldc_w -1164971138
    //   27365: ixor
    //   27366: ldc2_w 1319444775
    //   27369: l2i
    //   27370: ldc_w 220661061
    //   27373: ixor
    //   27374: ixor
    //   27375: lookupswitch default -> 27400, -1485778660 -> 27358, 250791089 -> 30903
    //   27400: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   27403: getstatic Perryc.0 : I
    //   27406: ifle -> 27420
    //   27409: ldc2_w 2115044106
    //   27412: l2i
    //   27413: ldc_w -1290746966
    //   27416: ixor
    //   27417: goto -> 27428
    //   27420: ldc2_w 1576487747
    //   27423: l2i
    //   27424: ldc_w 1449238758
    //   27427: ixor
    //   27428: ldc2_w 514498316
    //   27431: l2i
    //   27432: ldc_w 2131626814
    //   27435: ixor
    //   27436: ixor
    //   27437: lookupswitch default -> 30989, -1398451054 -> 27420, 1781694359 -> 27464
    //   27464: aload #6
    //   27466: getstatic Perryc.c : I
    //   27469: iflt -> 27483
    //   27472: ldc2_w 135415135
    //   27475: l2i
    //   27476: ldc_w 2063401715
    //   27479: ixor
    //   27480: goto -> 27491
    //   27483: ldc2_w -438562921
    //   27486: l2i
    //   27487: ldc_w 321294324
    //   27490: ixor
    //   27491: ldc2_w -1972782561
    //   27494: l2i
    //   27495: ldc_w -733206392
    //   27498: ixor
    //   27499: ixor
    //   27500: lookupswitch default -> 27528, -808494827 -> 27483, 751490363 -> 31151
    //   27528: aload_0
    //   27529: getstatic Perryc.1 : I
    //   27532: ifeq -> 27546
    //   27535: ldc2_w 1408028942
    //   27538: l2i
    //   27539: ldc_w -941203287
    //   27542: ixor
    //   27543: goto -> 27554
    //   27546: ldc2_w -905726097
    //   27549: l2i
    //   27550: ldc_w 131531170
    //   27553: ixor
    //   27554: ldc2_w -500662633
    //   27557: l2i
    //   27558: ldc_w -318091187
    //   27561: ixor
    //   27562: ixor
    //   27563: lookupswitch default -> 27588, -1691836547 -> 31309, -1510949787 -> 27546
    //   27588: getfield crystalX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27591: getstatic Perryc.0 : I
    //   27594: ifle -> 27608
    //   27597: ldc2_w 474978126
    //   27600: l2i
    //   27601: ldc_w 426821855
    //   27604: ixor
    //   27605: goto -> 27616
    //   27608: ldc2_w 231735348
    //   27611: l2i
    //   27612: ldc_w 44450280
    //   27615: ixor
    //   27616: ldc2_w 1615354170
    //   27619: l2i
    //   27620: ldc_w -1154328060
    //   27623: ixor
    //   27624: ixor
    //   27625: lookupswitch default -> 27652, -1478302120 -> 27608, -565879633 -> 31525
    //   27652: goto -> 27656
    //   27655: athrow
    //   27656: invokevirtual getValue : ()Ljava/lang/Object;
    //   27659: goto -> 27663
    //   27662: athrow
    //   27663: checkcast java/lang/Integer
    //   27666: getstatic Perryc.0 : I
    //   27669: ifle -> 27683
    //   27672: ldc2_w -12466746
    //   27675: l2i
    //   27676: ldc_w -1148776920
    //   27679: ixor
    //   27680: goto -> 27691
    //   27683: ldc2_w -1087313587
    //   27686: l2i
    //   27687: ldc_w -2084151802
    //   27690: ixor
    //   27691: ldc2_w -181805452
    //   27694: l2i
    //   27695: ldc_w -1225511695
    //   27698: ixor
    //   27699: ixor
    //   27700: lookupswitch default -> 27728, -483388573 -> 27683, 119224683 -> 31537
    //   27728: goto -> 27732
    //   27731: athrow
    //   27732: invokevirtual intValue : ()I
    //   27735: goto -> 27739
    //   27738: athrow
    //   27739: i2f
    //   27740: getstatic Perryc.c : I
    //   27743: iflt -> 27757
    //   27746: ldc2_w -421065121
    //   27749: l2i
    //   27750: ldc_w 1382057225
    //   27753: ixor
    //   27754: goto -> 27765
    //   27757: ldc2_w -1664418443
    //   27760: l2i
    //   27761: ldc_w 811484443
    //   27764: ixor
    //   27765: ldc2_w -272472770
    //   27768: l2i
    //   27769: ldc_w 1647674628
    //   27772: ixor
    //   27773: ixor
    //   27774: lookupswitch default -> 31551, 560158804 -> 27800, 963668844 -> 27757
    //   27800: aload_0
    //   27801: getstatic Perryc.c : I
    //   27804: iflt -> 27818
    //   27807: ldc2_w -1937483886
    //   27810: l2i
    //   27811: ldc_w -1951574873
    //   27814: ixor
    //   27815: goto -> 27826
    //   27818: ldc2_w -498962272
    //   27821: l2i
    //   27822: ldc_w -632701624
    //   27825: ixor
    //   27826: ldc2_w -874792438
    //   27829: l2i
    //   27830: ldc_w -11292332
    //   27833: ixor
    //   27834: ixor
    //   27835: lookupswitch default -> 27860, -1006622425 -> 27818, 866191467 -> 31581
    //   27860: getfield crystalY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27863: getstatic Perryc.c : I
    //   27866: iflt -> 27880
    //   27869: ldc2_w -407752212
    //   27872: l2i
    //   27873: ldc_w 1496029555
    //   27876: ixor
    //   27877: goto -> 27888
    //   27880: ldc2_w -1481570471
    //   27883: l2i
    //   27884: ldc_w 108061238
    //   27887: ixor
    //   27888: ldc2_w -309089819
    //   27891: l2i
    //   27892: ldc_w 1709406799
    //   27895: ixor
    //   27896: ixor
    //   27897: lookupswitch default -> 30835, 699479749 -> 27924, 921271093 -> 27880
    //   27924: goto -> 27928
    //   27927: athrow
    //   27928: invokevirtual getValue : ()Ljava/lang/Object;
    //   27931: goto -> 27935
    //   27934: athrow
    //   27935: checkcast java/lang/Integer
    //   27938: getstatic Perryc.c : I
    //   27941: iflt -> 27955
    //   27944: ldc2_w 1877553380
    //   27947: l2i
    //   27948: ldc_w -541044792
    //   27951: ixor
    //   27952: goto -> 27963
    //   27955: ldc2_w 237351281
    //   27958: l2i
    //   27959: ldc_w -596466931
    //   27962: ixor
    //   27963: ldc2_w 1558419815
    //   27966: l2i
    //   27967: ldc_w -65222524
    //   27970: ixor
    //   27971: ixor
    //   27972: lookupswitch default -> 30915, 282472143 -> 27955, 1923629983 -> 28000
    //   28000: goto -> 28004
    //   28003: athrow
    //   28004: invokevirtual intValue : ()I
    //   28007: goto -> 28011
    //   28010: athrow
    //   28011: i2f
    //   28012: getstatic Perryc.c : I
    //   28015: iflt -> 28029
    //   28018: ldc2_w 822958859
    //   28021: l2i
    //   28022: ldc_w 1697738768
    //   28025: ixor
    //   28026: goto -> 28037
    //   28029: ldc2_w 617867835
    //   28032: l2i
    //   28033: ldc_w 1744449702
    //   28036: ixor
    //   28037: ldc2_w 1163016526
    //   28040: l2i
    //   28041: ldc_w 342982642
    //   28044: ixor
    //   28045: ixor
    //   28046: lookupswitch default -> 31027, 85945767 -> 28029, 302685217 -> 28072
    //   28072: aload_0
    //   28073: getstatic Perryc.c : I
    //   28076: iflt -> 28090
    //   28079: ldc2_w 680077481
    //   28082: l2i
    //   28083: ldc_w 203227510
    //   28086: ixor
    //   28087: goto -> 28098
    //   28090: ldc2_w 894085365
    //   28093: l2i
    //   28094: ldc_w -1219796906
    //   28097: ixor
    //   28098: ldc2_w -71403604
    //   28101: l2i
    //   28102: ldc_w 705896715
    //   28105: ixor
    //   28106: ixor
    //   28107: lookupswitch default -> 28132, -180781192 -> 31571, 423790862 -> 28090
    //   28132: getfield color : I
    //   28135: ldc2_w 838333789
    //   28138: l2i
    //   28139: ldc_w 838333788
    //   28142: ixor
    //   28143: getstatic Perryc.c : I
    //   28146: iflt -> 28160
    //   28149: ldc2_w -1411485042
    //   28152: l2i
    //   28153: ldc_w -2092144180
    //   28156: ixor
    //   28157: goto -> 28168
    //   28160: ldc2_w 649133897
    //   28163: l2i
    //   28164: ldc_w 144623073
    //   28167: ixor
    //   28168: ldc2_w -332314056
    //   28171: l2i
    //   28172: ldc_w -654126525
    //   28175: ixor
    //   28176: ixor
    //   28177: lookupswitch default -> 28204, 497124153 -> 31321, 1529078950 -> 28160
    //   28204: goto -> 28208
    //   28207: athrow
    //   28208: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   28211: goto -> 28215
    //   28214: athrow
    //   28215: iinc #10, 12
    //   28218: getstatic Perryc.0 : I
    //   28221: ifle -> 28235
    //   28224: ldc2_w 1021997684
    //   28227: l2i
    //   28228: ldc_w 797157652
    //   28231: ixor
    //   28232: goto -> 28243
    //   28235: ldc2_w -2049021008
    //   28238: l2i
    //   28239: ldc_w 1667545571
    //   28242: ixor
    //   28243: ldc2_w 902708385
    //   28246: l2i
    //   28247: ldc_w -1691447308
    //   28250: ixor
    //   28251: ixor
    //   28252: lookupswitch default -> 30981, -1115068363 -> 28235, 1213882630 -> 28280
    //   28280: aload_0
    //   28281: getstatic Perryc.c : I
    //   28284: iflt -> 28298
    //   28287: ldc2_w 643410021
    //   28290: l2i
    //   28291: ldc_w 1585469438
    //   28294: ixor
    //   28295: goto -> 28306
    //   28298: ldc2_w -1602269955
    //   28301: l2i
    //   28302: ldc_w 1039521289
    //   28305: ixor
    //   28306: ldc2_w 763930878
    //   28309: l2i
    //   28310: ldc_w -1809848675
    //   28313: ixor
    //   28314: ixor
    //   28315: lookupswitch default -> 30825, -1051807240 -> 28298, 605934743 -> 28340
    //   28340: getfield exp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   28343: getstatic Perryc.1 : I
    //   28346: ifeq -> 28360
    //   28349: ldc2_w -225251124
    //   28352: l2i
    //   28353: ldc_w 633329772
    //   28356: ixor
    //   28357: goto -> 28368
    //   28360: ldc2_w -1643778478
    //   28363: l2i
    //   28364: ldc_w 975208068
    //   28367: ixor
    //   28368: ldc2_w -1989881483
    //   28371: l2i
    //   28372: ldc_w -791783401
    //   28375: ixor
    //   28376: ixor
    //   28377: lookupswitch default -> 31009, -1903713854 -> 28360, -40953420 -> 28404
    //   28404: goto -> 28408
    //   28407: athrow
    //   28408: invokevirtual getValue : ()Ljava/lang/Object;
    //   28411: goto -> 28415
    //   28414: athrow
    //   28415: checkcast java/lang/Boolean
    //   28418: getstatic Perryc.c : I
    //   28421: iflt -> 28435
    //   28424: ldc2_w -1927919635
    //   28427: l2i
    //   28428: ldc_w -2043017186
    //   28431: ixor
    //   28432: goto -> 28443
    //   28435: ldc2_w 2056648404
    //   28438: l2i
    //   28439: ldc_w 1829427207
    //   28442: ixor
    //   28443: ldc2_w -1542176175
    //   28446: l2i
    //   28447: ldc_w 2118490735
    //   28450: ixor
    //   28451: ixor
    //   28452: lookupswitch default -> 28480, -1834649507 -> 28435, -780298291 -> 30791
    //   28480: goto -> 28484
    //   28483: athrow
    //   28484: invokevirtual booleanValue : ()Z
    //   28487: goto -> 28491
    //   28490: athrow
    //   28491: ifeq -> 28505
    //   28494: ldc2_w 1712687203
    //   28497: l2i
    //   28498: ldc_w 1824931130
    //   28501: ixor
    //   28502: goto -> 28513
    //   28505: ldc2_w 251417863
    //   28508: l2i
    //   28509: ldc_w 70246495
    //   28512: ixor
    //   28513: ldc2_w 652876814
    //   28516: l2i
    //   28517: ldc_w 1996349745
    //   28520: ixor
    //   28521: ixor
    //   28522: tableswitch default -> 28494, 1522813030 -> 28544, 1522813031 -> 29482
    //   28544: getstatic Perryc.c : I
    //   28547: iflt -> 28561
    //   28550: ldc2_w 657298740
    //   28553: l2i
    //   28554: ldc_w 43500666
    //   28557: ixor
    //   28558: goto -> 28569
    //   28561: ldc2_w -2132633011
    //   28564: l2i
    //   28565: ldc_w 2001212429
    //   28568: ixor
    //   28569: ldc2_w -1409762584
    //   28572: l2i
    //   28573: ldc_w 1800520908
    //   28576: ixor
    //   28577: ixor
    //   28578: lookupswitch default -> 30833, -451727510 -> 28561, 923005028 -> 28604
    //   28604: aload_0
    //   28605: getstatic Perryc.0 : I
    //   28608: ifle -> 28622
    //   28611: ldc2_w 2112526925
    //   28614: l2i
    //   28615: ldc_w -950751492
    //   28618: ixor
    //   28619: goto -> 28630
    //   28622: ldc2_w 92217081
    //   28625: l2i
    //   28626: ldc_w 1233532897
    //   28629: ixor
    //   28630: ldc2_w -1907474051
    //   28633: l2i
    //   28634: ldc_w -1538601246
    //   28637: ixor
    //   28638: ixor
    //   28639: lookupswitch default -> 31121, -1866810578 -> 28622, 1727899271 -> 28664
    //   28664: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   28667: getstatic Perryc.1 : I
    //   28670: ifeq -> 28684
    //   28673: ldc2_w -2030843108
    //   28676: l2i
    //   28677: ldc_w 1716475614
    //   28680: ixor
    //   28681: goto -> 28692
    //   28684: ldc2_w -1779079694
    //   28687: l2i
    //   28688: ldc_w 709772644
    //   28691: ixor
    //   28692: ldc2_w 851992301
    //   28695: l2i
    //   28696: ldc_w 1167653350
    //   28699: ixor
    //   28700: ixor
    //   28701: lookupswitch default -> 28728, -1746126135 -> 31289, 684732111 -> 28684
    //   28728: aload #7
    //   28730: getstatic Perryc.c : I
    //   28733: iflt -> 28747
    //   28736: ldc2_w 470431709
    //   28739: l2i
    //   28740: ldc_w -370422929
    //   28743: ixor
    //   28744: goto -> 28755
    //   28747: ldc2_w -1507686500
    //   28750: l2i
    //   28751: ldc_w -723994084
    //   28754: ixor
    //   28755: ldc2_w -1433288079
    //   28758: l2i
    //   28759: ldc_w 1748808215
    //   28762: ixor
    //   28763: ixor
    //   28764: lookupswitch default -> 28792, -56541413 -> 28747, 927763668 -> 31489
    //   28792: aload_0
    //   28793: getstatic Perryc.c : I
    //   28796: iflt -> 28810
    //   28799: ldc2_w -247497985
    //   28802: l2i
    //   28803: ldc_w 1102566999
    //   28806: ixor
    //   28807: goto -> 28818
    //   28810: ldc2_w 1325287825
    //   28813: l2i
    //   28814: ldc_w -781263967
    //   28817: ixor
    //   28818: ldc2_w 700305748
    //   28821: l2i
    //   28822: ldc_w -1885750812
    //   28825: ixor
    //   28826: ixor
    //   28827: lookupswitch default -> 28852, -322213692 -> 28810, 380421144 -> 30881
    //   28852: getfield expX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   28855: getstatic Perryc.c : I
    //   28858: iflt -> 28872
    //   28861: ldc2_w -397278478
    //   28864: l2i
    //   28865: ldc_w 1585184797
    //   28868: ixor
    //   28869: goto -> 28880
    //   28872: ldc2_w 896035740
    //   28875: l2i
    //   28876: ldc_w 702075414
    //   28879: ixor
    //   28880: ldc2_w 140832641
    //   28883: l2i
    //   28884: ldc_w -760976411
    //   28887: ixor
    //   28888: ixor
    //   28889: lookupswitch default -> 31417, -965722642 -> 28916, 1827571339 -> 28872
    //   28916: goto -> 28920
    //   28919: athrow
    //   28920: invokevirtual getValue : ()Ljava/lang/Object;
    //   28923: goto -> 28927
    //   28926: athrow
    //   28927: checkcast java/lang/Integer
    //   28930: getstatic Perryc.0 : I
    //   28933: ifle -> 28947
    //   28936: ldc2_w -637241795
    //   28939: l2i
    //   28940: ldc_w -1867579672
    //   28943: ixor
    //   28944: goto -> 28955
    //   28947: ldc2_w 1198775905
    //   28950: l2i
    //   28951: ldc_w -691393570
    //   28954: ixor
    //   28955: ldc2_w -518792432
    //   28958: l2i
    //   28959: ldc_w -1619780968
    //   28962: ixor
    //   28963: ixor
    //   28964: lookupswitch default -> 31403, -270650313 -> 28992, 885868893 -> 28947
    //   28992: goto -> 28996
    //   28995: athrow
    //   28996: invokevirtual intValue : ()I
    //   28999: goto -> 29003
    //   29002: athrow
    //   29003: i2f
    //   29004: getstatic Perryc.1 : I
    //   29007: ifeq -> 29021
    //   29010: ldc2_w 1680870192
    //   29013: l2i
    //   29014: ldc_w -285639599
    //   29017: ixor
    //   29018: goto -> 29029
    //   29021: ldc2_w -1597847987
    //   29024: l2i
    //   29025: ldc_w -1761636390
    //   29028: ixor
    //   29029: ldc2_w -1031180740
    //   29032: l2i
    //   29033: ldc_w 59554373
    //   29036: ixor
    //   29037: ixor
    //   29038: lookupswitch default -> 29064, 1271702296 -> 31385, 1716463201 -> 29021
    //   29064: aload_0
    //   29065: getstatic Perryc.c : I
    //   29068: iflt -> 29082
    //   29071: ldc2_w 1779354774
    //   29074: l2i
    //   29075: ldc_w 1778071206
    //   29078: ixor
    //   29079: goto -> 29090
    //   29082: ldc2_w 437873116
    //   29085: l2i
    //   29086: ldc_w 837328707
    //   29089: ixor
    //   29090: ldc2_w -1465446830
    //   29093: l2i
    //   29094: ldc_w 136415842
    //   29097: ixor
    //   29098: ixor
    //   29099: lookupswitch default -> 29124, -1552712192 -> 31245, 1526040485 -> 29082
    //   29124: getfield expY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   29127: getstatic Perryc.1 : I
    //   29130: ifeq -> 29144
    //   29133: ldc2_w 1964700443
    //   29136: l2i
    //   29137: ldc_w 1689691959
    //   29140: ixor
    //   29141: goto -> 29152
    //   29144: ldc2_w -39328923
    //   29147: l2i
    //   29148: ldc_w 1599113124
    //   29151: ixor
    //   29152: ldc2_w -1342456791
    //   29155: l2i
    //   29156: ldc_w 1856607858
    //   29159: ixor
    //   29160: ixor
    //   29161: lookupswitch default -> 31365, -788627849 -> 29144, 1671777946 -> 29188
    //   29188: goto -> 29192
    //   29191: athrow
    //   29192: invokevirtual getValue : ()Ljava/lang/Object;
    //   29195: goto -> 29199
    //   29198: athrow
    //   29199: checkcast java/lang/Integer
    //   29202: getstatic Perryc.1 : I
    //   29205: ifeq -> 29219
    //   29208: ldc2_w 1987401727
    //   29211: l2i
    //   29212: ldc_w 1442691213
    //   29215: ixor
    //   29216: goto -> 29227
    //   29219: ldc2_w -1505739749
    //   29222: l2i
    //   29223: ldc_w 242663237
    //   29226: ixor
    //   29227: ldc2_w 1234433922
    //   29230: l2i
    //   29231: ldc_w -921450129
    //   29234: ixor
    //   29235: ixor
    //   29236: lookupswitch default -> 29264, -1559703137 -> 30995, -164882903 -> 29219
    //   29264: goto -> 29268
    //   29267: athrow
    //   29268: invokevirtual intValue : ()I
    //   29271: goto -> 29275
    //   29274: athrow
    //   29275: i2f
    //   29276: getstatic Perryc.c : I
    //   29279: iflt -> 29293
    //   29282: ldc2_w 1418212776
    //   29285: l2i
    //   29286: ldc_w 779722436
    //   29289: ixor
    //   29290: goto -> 29301
    //   29293: ldc2_w -949976966
    //   29296: l2i
    //   29297: ldc_w 1653607863
    //   29300: ixor
    //   29301: ldc2_w 170328666
    //   29304: l2i
    //   29305: ldc_w 886337830
    //   29308: ixor
    //   29309: ixor
    //   29310: lookupswitch default -> 31161, -1694237007 -> 29336, 1141037072 -> 29293
    //   29336: aload_0
    //   29337: getstatic Perryc.0 : I
    //   29340: ifle -> 29354
    //   29343: ldc2_w -193679912
    //   29346: l2i
    //   29347: ldc_w 1593520731
    //   29350: ixor
    //   29351: goto -> 29362
    //   29354: ldc2_w -1660459420
    //   29357: l2i
    //   29358: ldc_w 1992353053
    //   29361: ixor
    //   29362: ldc2_w -1518011469
    //   29365: l2i
    //   29366: ldc_w 1663294471
    //   29369: ixor
    //   29370: ixor
    //   29371: lookupswitch default -> 29396, -1316346275 -> 29354, 1814607927 -> 31173
    //   29396: getfield color : I
    //   29399: ldc2_w 417837712
    //   29402: l2i
    //   29403: ldc_w 417837713
    //   29406: ixor
    //   29407: getstatic Perryc.1 : I
    //   29410: ifeq -> 29424
    //   29413: ldc2_w 1783064843
    //   29416: l2i
    //   29417: ldc_w -287991955
    //   29420: ixor
    //   29421: goto -> 29432
    //   29424: ldc2_w -1176330642
    //   29427: l2i
    //   29428: ldc_w 1963122012
    //   29431: ixor
    //   29432: ldc2_w 2121081521
    //   29435: l2i
    //   29436: ldc_w -1535084123
    //   29439: ixor
    //   29440: ixor
    //   29441: lookupswitch default -> 29468, -226711811 -> 29424, 1585423730 -> 31105
    //   29468: goto -> 29472
    //   29471: athrow
    //   29472: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   29475: goto -> 29479
    //   29478: athrow
    //   29479: iinc #10, 12
    //   29482: getstatic Perryc.c : I
    //   29485: iflt -> 29499
    //   29488: ldc2_w -1580288405
    //   29491: l2i
    //   29492: ldc_w -200388939
    //   29495: ixor
    //   29496: goto -> 29507
    //   29499: ldc2_w 287573073
    //   29502: l2i
    //   29503: ldc_w -817595558
    //   29506: ixor
    //   29507: ldc2_w -358403270
    //   29510: l2i
    //   29511: ldc_w -1450512016
    //   29514: ixor
    //   29515: ixor
    //   29516: lookupswitch default -> 29544, -172409920 -> 29499, 384383636 -> 31483
    //   29544: aload_0
    //   29545: getstatic Perryc.1 : I
    //   29548: ifeq -> 29562
    //   29551: ldc2_w 944803959
    //   29554: l2i
    //   29555: ldc_w -1236362869
    //   29558: ixor
    //   29559: goto -> 29570
    //   29562: ldc2_w 560837171
    //   29565: l2i
    //   29566: ldc_w -426817046
    //   29569: ixor
    //   29570: ldc2_w -59202079
    //   29573: l2i
    //   29574: ldc_w -811993258
    //   29577: ixor
    //   29578: ixor
    //   29579: lookupswitch default -> 29604, -1107338421 -> 30801, -516381728 -> 29562
    //   29604: getfield gapples : Lbigname/zprestige/webhack/features/setting/Setting;
    //   29607: getstatic Perryc.0 : I
    //   29610: ifle -> 29624
    //   29613: ldc2_w 1358631753
    //   29616: l2i
    //   29617: ldc_w 417537283
    //   29620: ixor
    //   29621: goto -> 29632
    //   29624: ldc2_w -146169558
    //   29627: l2i
    //   29628: ldc_w -450537222
    //   29631: ixor
    //   29632: ldc2_w 521199636
    //   29635: l2i
    //   29636: ldc_w 162507657
    //   29639: ixor
    //   29640: ixor
    //   29641: lookupswitch default -> 31235, 80982605 -> 29668, 1588020695 -> 29624
    //   29668: goto -> 29672
    //   29671: athrow
    //   29672: invokevirtual getValue : ()Ljava/lang/Object;
    //   29675: goto -> 29679
    //   29678: athrow
    //   29679: checkcast java/lang/Boolean
    //   29682: getstatic Perryc.1 : I
    //   29685: ifeq -> 29699
    //   29688: ldc2_w 1058891940
    //   29691: l2i
    //   29692: ldc_w -768531570
    //   29695: ixor
    //   29696: goto -> 29707
    //   29699: ldc2_w -798129635
    //   29702: l2i
    //   29703: ldc_w -675340942
    //   29706: ixor
    //   29707: ldc2_w -323432302
    //   29710: l2i
    //   29711: ldc_w 670252154
    //   29714: ixor
    //   29715: ixor
    //   29716: lookupswitch default -> 31399, -862358649 -> 29744, 644327362 -> 29699
    //   29744: goto -> 29748
    //   29747: athrow
    //   29748: invokevirtual booleanValue : ()Z
    //   29751: goto -> 29755
    //   29754: athrow
    //   29755: ifeq -> 29769
    //   29758: ldc2_w 551873098
    //   29761: l2i
    //   29762: ldc_w 95634065
    //   29765: ixor
    //   29766: goto -> 29777
    //   29769: ldc2_w 735760487
    //   29772: l2i
    //   29773: ldc_w 244152499
    //   29776: ixor
    //   29777: ldc2_w 1191775146
    //   29780: l2i
    //   29781: ldc_w -49388138
    //   29784: ixor
    //   29785: ixor
    //   29786: tableswitch default -> 29758, -1622096153 -> 29808, -1622096152 -> 30746
    //   29808: getstatic Perryc.c : I
    //   29811: iflt -> 29825
    //   29814: ldc2_w -1317183293
    //   29817: l2i
    //   29818: ldc_w 1593612860
    //   29821: ixor
    //   29822: goto -> 29833
    //   29825: ldc2_w 1412653898
    //   29828: l2i
    //   29829: ldc_w -1591133014
    //   29832: ixor
    //   29833: ldc2_w 2036211067
    //   29836: l2i
    //   29837: ldc_w 2034109224
    //   29840: ixor
    //   29841: ixor
    //   29842: lookupswitch default -> 31117, -270406484 -> 29825, -176535117 -> 29868
    //   29868: aload_0
    //   29869: getstatic Perryc.0 : I
    //   29872: ifle -> 29886
    //   29875: ldc2_w 577538787
    //   29878: l2i
    //   29879: ldc_w 242656993
    //   29882: ixor
    //   29883: goto -> 29894
    //   29886: ldc2_w 58825018
    //   29889: l2i
    //   29890: ldc_w -1489008998
    //   29893: ixor
    //   29894: ldc2_w -2066821712
    //   29897: l2i
    //   29898: ldc_w -129470565
    //   29901: ixor
    //   29902: ixor
    //   29903: lookupswitch default -> 30841, -667370101 -> 29928, 1352437289 -> 29886
    //   29928: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   29931: getstatic Perryc.c : I
    //   29934: iflt -> 29948
    //   29937: ldc2_w 739377683
    //   29940: l2i
    //   29941: ldc_w 867181550
    //   29944: ixor
    //   29945: goto -> 29956
    //   29948: ldc2_w -530553300
    //   29951: l2i
    //   29952: ldc_w 1546522553
    //   29955: ixor
    //   29956: ldc2_w 1683233092
    //   29959: l2i
    //   29960: ldc_w 172564852
    //   29963: ixor
    //   29964: ixor
    //   29965: lookupswitch default -> 29992, 165119420 -> 29948, 1908349389 -> 30755
    //   29992: aload #8
    //   29994: getstatic Perryc.c : I
    //   29997: iflt -> 30011
    //   30000: ldc2_w 791299730
    //   30003: l2i
    //   30004: ldc_w -956028989
    //   30007: ixor
    //   30008: goto -> 30019
    //   30011: ldc2_w -654981341
    //   30014: l2i
    //   30015: ldc_w -908869313
    //   30018: ixor
    //   30019: ldc2_w -908208238
    //   30022: l2i
    //   30023: ldc_w 1815809791
    //   30026: ixor
    //   30027: ixor
    //   30028: lookupswitch default -> 31139, -1262428303 -> 30056, 1304999996 -> 30011
    //   30056: aload_0
    //   30057: getstatic Perryc.0 : I
    //   30060: ifle -> 30074
    //   30063: ldc2_w 1278367674
    //   30066: l2i
    //   30067: ldc_w -1274850767
    //   30070: ixor
    //   30071: goto -> 30082
    //   30074: ldc2_w 1722095464
    //   30077: l2i
    //   30078: ldc_w 1385211334
    //   30081: ixor
    //   30082: ldc2_w 39144985
    //   30085: l2i
    //   30086: ldc_w 1510610972
    //   30089: ixor
    //   30090: ixor
    //   30091: lookupswitch default -> 30116, -1603382386 -> 31127, 775901954 -> 30074
    //   30116: getfield GapplesX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   30119: getstatic Perryc.c : I
    //   30122: iflt -> 30136
    //   30125: ldc2_w 723473580
    //   30128: l2i
    //   30129: ldc_w 1224814852
    //   30132: ixor
    //   30133: goto -> 30144
    //   30136: ldc2_w 297155325
    //   30139: l2i
    //   30140: ldc_w 1589457583
    //   30143: ixor
    //   30144: ldc2_w -2029180172
    //   30147: l2i
    //   30148: ldc_w 1504392683
    //   30151: ixor
    //   30152: ixor
    //   30153: lookupswitch default -> 30180, -2018898468 -> 30136, -1128760649 -> 31099
    //   30180: goto -> 30184
    //   30183: athrow
    //   30184: invokevirtual getValue : ()Ljava/lang/Object;
    //   30187: goto -> 30191
    //   30190: athrow
    //   30191: checkcast java/lang/Integer
    //   30194: getstatic Perryc.0 : I
    //   30197: ifle -> 30211
    //   30200: ldc2_w -1774960929
    //   30203: l2i
    //   30204: ldc_w -1546597576
    //   30207: ixor
    //   30208: goto -> 30219
    //   30211: ldc2_w -1887982838
    //   30214: l2i
    //   30215: ldc_w 101503403
    //   30218: ixor
    //   30219: ldc2_w -254143255
    //   30222: l2i
    //   30223: ldc_w -624430276
    //   30226: ixor
    //   30227: ixor
    //   30228: lookupswitch default -> 31331, -1553556108 -> 30256, 536416818 -> 30211
    //   30256: goto -> 30260
    //   30259: athrow
    //   30260: invokevirtual intValue : ()I
    //   30263: goto -> 30267
    //   30266: athrow
    //   30267: i2f
    //   30268: getstatic Perryc.1 : I
    //   30271: ifeq -> 30285
    //   30274: ldc2_w 1385173576
    //   30277: l2i
    //   30278: ldc_w 848286070
    //   30281: ixor
    //   30282: goto -> 30293
    //   30285: ldc2_w 1297339228
    //   30288: l2i
    //   30289: ldc_w 1739873914
    //   30292: ixor
    //   30293: ldc2_w 64307434
    //   30296: l2i
    //   30297: ldc_w -512092906
    //   30300: ixor
    //   30301: ixor
    //   30302: lookupswitch default -> 31035, -2102356286 -> 30285, -934749990 -> 30328
    //   30328: aload_0
    //   30329: getstatic Perryc.1 : I
    //   30332: ifeq -> 30346
    //   30335: ldc2_w 1396642765
    //   30338: l2i
    //   30339: ldc_w -117068573
    //   30342: ixor
    //   30343: goto -> 30354
    //   30346: ldc2_w 468489175
    //   30349: l2i
    //   30350: ldc_w 1131569290
    //   30353: ixor
    //   30354: ldc2_w 1909512023
    //   30357: l2i
    //   30358: ldc_w 361406666
    //   30361: ixor
    //   30362: ixor
    //   30363: lookupswitch default -> 31501, -832517965 -> 30346, 1019512000 -> 30388
    //   30388: getfield GapplesY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   30391: getstatic Perryc.c : I
    //   30394: iflt -> 30408
    //   30397: ldc2_w -904748093
    //   30400: l2i
    //   30401: ldc_w -1699816362
    //   30404: ixor
    //   30405: goto -> 30416
    //   30408: ldc2_w -949813993
    //   30411: l2i
    //   30412: ldc_w 507200078
    //   30415: ixor
    //   30416: ldc2_w 1059175166
    //   30419: l2i
    //   30420: ldc_w 1251968140
    //   30423: ixor
    //   30424: ixor
    //   30425: lookupswitch default -> 31447, -1394114261 -> 30452, 620904935 -> 30408
    //   30452: goto -> 30456
    //   30455: athrow
    //   30456: invokevirtual getValue : ()Ljava/lang/Object;
    //   30459: goto -> 30463
    //   30462: athrow
    //   30463: checkcast java/lang/Integer
    //   30466: getstatic Perryc.1 : I
    //   30469: ifeq -> 30483
    //   30472: ldc2_w -2117544814
    //   30475: l2i
    //   30476: ldc_w 601014294
    //   30479: ixor
    //   30480: goto -> 30491
    //   30483: ldc2_w -1293963575
    //   30486: l2i
    //   30487: ldc_w 1702993979
    //   30490: ixor
    //   30491: ldc2_w -21140573
    //   30494: l2i
    //   30495: ldc_w 611264447
    //   30498: ixor
    //   30499: ixor
    //   30500: lookupswitch default -> 30528, 386554119 -> 30483, 2026395800 -> 31007
    //   30528: goto -> 30532
    //   30531: athrow
    //   30532: invokevirtual intValue : ()I
    //   30535: goto -> 30539
    //   30538: athrow
    //   30539: i2f
    //   30540: getstatic Perryc.c : I
    //   30543: iflt -> 30557
    //   30546: ldc2_w 556905809
    //   30549: l2i
    //   30550: ldc_w 338271954
    //   30553: ixor
    //   30554: goto -> 30565
    //   30557: ldc2_w 385024806
    //   30560: l2i
    //   30561: ldc_w -1587610709
    //   30564: ixor
    //   30565: ldc2_w 1638079392
    //   30568: l2i
    //   30569: ldc_w 1878422061
    //   30572: ixor
    //   30573: ixor
    //   30574: lookupswitch default -> 30831, -1174892288 -> 30600, 994918926 -> 30557
    //   30600: aload_0
    //   30601: getstatic Perryc.0 : I
    //   30604: ifle -> 30618
    //   30607: ldc2_w 25921684
    //   30610: l2i
    //   30611: ldc_w 1376208841
    //   30614: ixor
    //   30615: goto -> 30626
    //   30618: ldc2_w -1376024114
    //   30621: l2i
    //   30622: ldc_w 2120326802
    //   30625: ixor
    //   30626: ldc2_w 904358858
    //   30629: l2i
    //   30630: ldc_w -1063047890
    //   30633: ixor
    //   30634: ixor
    //   30635: lookupswitch default -> 31067, -1496806983 -> 30618, 652104120 -> 30660
    //   30660: getfield color : I
    //   30663: ldc2_w -1218205294
    //   30666: l2i
    //   30667: ldc_w -1218205293
    //   30670: ixor
    //   30671: getstatic Perryc.0 : I
    //   30674: ifle -> 30688
    //   30677: ldc2_w 2039170101
    //   30680: l2i
    //   30681: ldc_w 121099485
    //   30684: ixor
    //   30685: goto -> 30696
    //   30688: ldc2_w -19457484
    //   30691: l2i
    //   30692: ldc_w -1651757590
    //   30695: ixor
    //   30696: ldc2_w 98260839
    //   30699: l2i
    //   30700: ldc_w -2039957895
    //   30703: ixor
    //   30704: ixor
    //   30705: lookupswitch default -> 30732, -714116171 -> 30688, -49319434 -> 31315
    //   30732: goto -> 30736
    //   30735: athrow
    //   30736: invokevirtual drawString : (Ljava/lang/String;FFIZ)V
    //   30739: goto -> 30743
    //   30742: athrow
    //   30743: iinc #10, 12
    //   30746: return
    //   30747: aconst_null
    //   30748: athrow
    //   30749: aconst_null
    //   30750: athrow
    //   30751: aconst_null
    //   30752: athrow
    //   30753: aconst_null
    //   30754: athrow
    //   30755: aconst_null
    //   30756: athrow
    //   30757: aconst_null
    //   30758: athrow
    //   30759: aconst_null
    //   30760: athrow
    //   30761: aconst_null
    //   30762: athrow
    //   30763: aconst_null
    //   30764: athrow
    //   30765: aconst_null
    //   30766: athrow
    //   30767: aconst_null
    //   30768: athrow
    //   30769: aconst_null
    //   30770: athrow
    //   30771: aconst_null
    //   30772: athrow
    //   30773: aconst_null
    //   30774: athrow
    //   30775: aconst_null
    //   30776: athrow
    //   30777: aconst_null
    //   30778: athrow
    //   30779: aconst_null
    //   30780: athrow
    //   30781: aconst_null
    //   30782: athrow
    //   30783: aconst_null
    //   30784: athrow
    //   30785: aconst_null
    //   30786: athrow
    //   30787: aconst_null
    //   30788: athrow
    //   30789: aconst_null
    //   30790: athrow
    //   30791: aconst_null
    //   30792: athrow
    //   30793: aconst_null
    //   30794: athrow
    //   30795: aconst_null
    //   30796: athrow
    //   30797: aconst_null
    //   30798: athrow
    //   30799: aconst_null
    //   30800: athrow
    //   30801: aconst_null
    //   30802: athrow
    //   30803: aconst_null
    //   30804: athrow
    //   30805: aconst_null
    //   30806: athrow
    //   30807: aconst_null
    //   30808: athrow
    //   30809: aconst_null
    //   30810: athrow
    //   30811: aconst_null
    //   30812: athrow
    //   30813: aconst_null
    //   30814: athrow
    //   30815: aconst_null
    //   30816: athrow
    //   30817: aconst_null
    //   30818: athrow
    //   30819: aconst_null
    //   30820: athrow
    //   30821: aconst_null
    //   30822: athrow
    //   30823: aconst_null
    //   30824: athrow
    //   30825: aconst_null
    //   30826: athrow
    //   30827: aconst_null
    //   30828: athrow
    //   30829: aconst_null
    //   30830: athrow
    //   30831: aconst_null
    //   30832: athrow
    //   30833: aconst_null
    //   30834: athrow
    //   30835: aconst_null
    //   30836: athrow
    //   30837: aconst_null
    //   30838: athrow
    //   30839: aconst_null
    //   30840: athrow
    //   30841: aconst_null
    //   30842: athrow
    //   30843: aconst_null
    //   30844: athrow
    //   30845: aconst_null
    //   30846: athrow
    //   30847: aconst_null
    //   30848: athrow
    //   30849: aconst_null
    //   30850: athrow
    //   30851: aconst_null
    //   30852: athrow
    //   30853: aconst_null
    //   30854: athrow
    //   30855: aconst_null
    //   30856: athrow
    //   30857: aconst_null
    //   30858: athrow
    //   30859: aconst_null
    //   30860: athrow
    //   30861: aconst_null
    //   30862: athrow
    //   30863: aconst_null
    //   30864: athrow
    //   30865: aconst_null
    //   30866: athrow
    //   30867: aconst_null
    //   30868: athrow
    //   30869: aconst_null
    //   30870: athrow
    //   30871: aconst_null
    //   30872: athrow
    //   30873: aconst_null
    //   30874: athrow
    //   30875: aconst_null
    //   30876: athrow
    //   30877: aconst_null
    //   30878: athrow
    //   30879: aconst_null
    //   30880: athrow
    //   30881: aconst_null
    //   30882: athrow
    //   30883: aconst_null
    //   30884: athrow
    //   30885: aconst_null
    //   30886: athrow
    //   30887: aconst_null
    //   30888: athrow
    //   30889: aconst_null
    //   30890: athrow
    //   30891: aconst_null
    //   30892: athrow
    //   30893: aconst_null
    //   30894: athrow
    //   30895: aconst_null
    //   30896: athrow
    //   30897: aconst_null
    //   30898: athrow
    //   30899: aconst_null
    //   30900: athrow
    //   30901: aconst_null
    //   30902: athrow
    //   30903: aconst_null
    //   30904: athrow
    //   30905: aconst_null
    //   30906: athrow
    //   30907: aconst_null
    //   30908: athrow
    //   30909: aconst_null
    //   30910: athrow
    //   30911: aconst_null
    //   30912: athrow
    //   30913: aconst_null
    //   30914: athrow
    //   30915: aconst_null
    //   30916: athrow
    //   30917: aconst_null
    //   30918: athrow
    //   30919: aconst_null
    //   30920: athrow
    //   30921: aconst_null
    //   30922: athrow
    //   30923: aconst_null
    //   30924: athrow
    //   30925: aconst_null
    //   30926: athrow
    //   30927: aconst_null
    //   30928: athrow
    //   30929: aconst_null
    //   30930: athrow
    //   30931: aconst_null
    //   30932: athrow
    //   30933: aconst_null
    //   30934: athrow
    //   30935: aconst_null
    //   30936: athrow
    //   30937: aconst_null
    //   30938: athrow
    //   30939: aconst_null
    //   30940: athrow
    //   30941: aconst_null
    //   30942: athrow
    //   30943: aconst_null
    //   30944: athrow
    //   30945: aconst_null
    //   30946: athrow
    //   30947: aconst_null
    //   30948: athrow
    //   30949: aconst_null
    //   30950: athrow
    //   30951: aconst_null
    //   30952: athrow
    //   30953: aconst_null
    //   30954: athrow
    //   30955: aconst_null
    //   30956: athrow
    //   30957: aconst_null
    //   30958: athrow
    //   30959: aconst_null
    //   30960: athrow
    //   30961: aconst_null
    //   30962: athrow
    //   30963: aconst_null
    //   30964: athrow
    //   30965: aconst_null
    //   30966: athrow
    //   30967: aconst_null
    //   30968: athrow
    //   30969: aconst_null
    //   30970: athrow
    //   30971: aconst_null
    //   30972: athrow
    //   30973: aconst_null
    //   30974: athrow
    //   30975: aconst_null
    //   30976: athrow
    //   30977: aconst_null
    //   30978: athrow
    //   30979: aconst_null
    //   30980: athrow
    //   30981: aconst_null
    //   30982: athrow
    //   30983: aconst_null
    //   30984: athrow
    //   30985: aconst_null
    //   30986: athrow
    //   30987: aconst_null
    //   30988: athrow
    //   30989: aconst_null
    //   30990: athrow
    //   30991: aconst_null
    //   30992: athrow
    //   30993: aconst_null
    //   30994: athrow
    //   30995: aconst_null
    //   30996: athrow
    //   30997: aconst_null
    //   30998: athrow
    //   30999: aconst_null
    //   31000: athrow
    //   31001: aconst_null
    //   31002: athrow
    //   31003: aconst_null
    //   31004: athrow
    //   31005: aconst_null
    //   31006: athrow
    //   31007: aconst_null
    //   31008: athrow
    //   31009: aconst_null
    //   31010: athrow
    //   31011: aconst_null
    //   31012: athrow
    //   31013: aconst_null
    //   31014: athrow
    //   31015: aconst_null
    //   31016: athrow
    //   31017: aconst_null
    //   31018: athrow
    //   31019: aconst_null
    //   31020: athrow
    //   31021: aconst_null
    //   31022: athrow
    //   31023: aconst_null
    //   31024: athrow
    //   31025: aconst_null
    //   31026: athrow
    //   31027: aconst_null
    //   31028: athrow
    //   31029: aconst_null
    //   31030: athrow
    //   31031: aconst_null
    //   31032: athrow
    //   31033: aconst_null
    //   31034: athrow
    //   31035: aconst_null
    //   31036: athrow
    //   31037: aconst_null
    //   31038: athrow
    //   31039: aconst_null
    //   31040: athrow
    //   31041: aconst_null
    //   31042: athrow
    //   31043: aconst_null
    //   31044: athrow
    //   31045: aconst_null
    //   31046: athrow
    //   31047: aconst_null
    //   31048: athrow
    //   31049: aconst_null
    //   31050: athrow
    //   31051: aconst_null
    //   31052: athrow
    //   31053: aconst_null
    //   31054: athrow
    //   31055: aconst_null
    //   31056: athrow
    //   31057: aconst_null
    //   31058: athrow
    //   31059: aconst_null
    //   31060: athrow
    //   31061: aconst_null
    //   31062: athrow
    //   31063: aconst_null
    //   31064: athrow
    //   31065: aconst_null
    //   31066: athrow
    //   31067: aconst_null
    //   31068: athrow
    //   31069: aconst_null
    //   31070: athrow
    //   31071: aconst_null
    //   31072: athrow
    //   31073: aconst_null
    //   31074: athrow
    //   31075: aconst_null
    //   31076: athrow
    //   31077: aconst_null
    //   31078: athrow
    //   31079: aconst_null
    //   31080: athrow
    //   31081: aconst_null
    //   31082: athrow
    //   31083: aconst_null
    //   31084: athrow
    //   31085: aconst_null
    //   31086: athrow
    //   31087: aconst_null
    //   31088: athrow
    //   31089: aconst_null
    //   31090: athrow
    //   31091: aconst_null
    //   31092: athrow
    //   31093: aconst_null
    //   31094: athrow
    //   31095: aconst_null
    //   31096: athrow
    //   31097: aconst_null
    //   31098: athrow
    //   31099: aconst_null
    //   31100: athrow
    //   31101: aconst_null
    //   31102: athrow
    //   31103: aconst_null
    //   31104: athrow
    //   31105: aconst_null
    //   31106: athrow
    //   31107: aconst_null
    //   31108: athrow
    //   31109: aconst_null
    //   31110: athrow
    //   31111: aconst_null
    //   31112: athrow
    //   31113: aconst_null
    //   31114: athrow
    //   31115: aconst_null
    //   31116: athrow
    //   31117: aconst_null
    //   31118: athrow
    //   31119: aconst_null
    //   31120: athrow
    //   31121: aconst_null
    //   31122: athrow
    //   31123: aconst_null
    //   31124: athrow
    //   31125: aconst_null
    //   31126: athrow
    //   31127: aconst_null
    //   31128: athrow
    //   31129: aconst_null
    //   31130: athrow
    //   31131: aconst_null
    //   31132: athrow
    //   31133: aconst_null
    //   31134: athrow
    //   31135: aconst_null
    //   31136: athrow
    //   31137: aconst_null
    //   31138: athrow
    //   31139: aconst_null
    //   31140: athrow
    //   31141: aconst_null
    //   31142: athrow
    //   31143: aconst_null
    //   31144: athrow
    //   31145: aconst_null
    //   31146: athrow
    //   31147: aconst_null
    //   31148: athrow
    //   31149: aconst_null
    //   31150: athrow
    //   31151: aconst_null
    //   31152: athrow
    //   31153: aconst_null
    //   31154: athrow
    //   31155: aconst_null
    //   31156: athrow
    //   31157: aconst_null
    //   31158: athrow
    //   31159: aconst_null
    //   31160: athrow
    //   31161: aconst_null
    //   31162: athrow
    //   31163: aconst_null
    //   31164: athrow
    //   31165: aconst_null
    //   31166: athrow
    //   31167: aconst_null
    //   31168: athrow
    //   31169: aconst_null
    //   31170: athrow
    //   31171: aconst_null
    //   31172: athrow
    //   31173: aconst_null
    //   31174: athrow
    //   31175: aconst_null
    //   31176: athrow
    //   31177: aconst_null
    //   31178: athrow
    //   31179: aconst_null
    //   31180: athrow
    //   31181: aconst_null
    //   31182: athrow
    //   31183: aconst_null
    //   31184: athrow
    //   31185: aconst_null
    //   31186: athrow
    //   31187: aconst_null
    //   31188: athrow
    //   31189: aconst_null
    //   31190: athrow
    //   31191: aconst_null
    //   31192: athrow
    //   31193: aconst_null
    //   31194: athrow
    //   31195: aconst_null
    //   31196: athrow
    //   31197: aconst_null
    //   31198: athrow
    //   31199: aconst_null
    //   31200: athrow
    //   31201: aconst_null
    //   31202: athrow
    //   31203: aconst_null
    //   31204: athrow
    //   31205: aconst_null
    //   31206: athrow
    //   31207: aconst_null
    //   31208: athrow
    //   31209: aconst_null
    //   31210: athrow
    //   31211: aconst_null
    //   31212: athrow
    //   31213: aconst_null
    //   31214: athrow
    //   31215: aconst_null
    //   31216: athrow
    //   31217: aconst_null
    //   31218: athrow
    //   31219: aconst_null
    //   31220: athrow
    //   31221: aconst_null
    //   31222: athrow
    //   31223: aconst_null
    //   31224: athrow
    //   31225: aconst_null
    //   31226: athrow
    //   31227: aconst_null
    //   31228: athrow
    //   31229: aconst_null
    //   31230: athrow
    //   31231: aconst_null
    //   31232: athrow
    //   31233: aconst_null
    //   31234: athrow
    //   31235: aconst_null
    //   31236: athrow
    //   31237: aconst_null
    //   31238: athrow
    //   31239: aconst_null
    //   31240: athrow
    //   31241: aconst_null
    //   31242: athrow
    //   31243: aconst_null
    //   31244: athrow
    //   31245: aconst_null
    //   31246: athrow
    //   31247: aconst_null
    //   31248: athrow
    //   31249: aconst_null
    //   31250: athrow
    //   31251: aconst_null
    //   31252: athrow
    //   31253: aconst_null
    //   31254: athrow
    //   31255: aconst_null
    //   31256: athrow
    //   31257: aconst_null
    //   31258: athrow
    //   31259: aconst_null
    //   31260: athrow
    //   31261: aconst_null
    //   31262: athrow
    //   31263: aconst_null
    //   31264: athrow
    //   31265: aconst_null
    //   31266: athrow
    //   31267: aconst_null
    //   31268: athrow
    //   31269: aconst_null
    //   31270: athrow
    //   31271: aconst_null
    //   31272: athrow
    //   31273: aconst_null
    //   31274: athrow
    //   31275: aconst_null
    //   31276: athrow
    //   31277: aconst_null
    //   31278: athrow
    //   31279: aconst_null
    //   31280: athrow
    //   31281: aconst_null
    //   31282: athrow
    //   31283: aconst_null
    //   31284: athrow
    //   31285: aconst_null
    //   31286: athrow
    //   31287: aconst_null
    //   31288: athrow
    //   31289: aconst_null
    //   31290: athrow
    //   31291: aconst_null
    //   31292: athrow
    //   31293: aconst_null
    //   31294: athrow
    //   31295: aconst_null
    //   31296: athrow
    //   31297: aconst_null
    //   31298: athrow
    //   31299: aconst_null
    //   31300: athrow
    //   31301: aconst_null
    //   31302: athrow
    //   31303: aconst_null
    //   31304: athrow
    //   31305: aconst_null
    //   31306: athrow
    //   31307: aconst_null
    //   31308: athrow
    //   31309: aconst_null
    //   31310: athrow
    //   31311: aconst_null
    //   31312: athrow
    //   31313: aconst_null
    //   31314: athrow
    //   31315: aconst_null
    //   31316: athrow
    //   31317: aconst_null
    //   31318: athrow
    //   31319: aconst_null
    //   31320: athrow
    //   31321: aconst_null
    //   31322: athrow
    //   31323: aconst_null
    //   31324: athrow
    //   31325: aconst_null
    //   31326: athrow
    //   31327: aconst_null
    //   31328: athrow
    //   31329: aconst_null
    //   31330: athrow
    //   31331: aconst_null
    //   31332: athrow
    //   31333: aconst_null
    //   31334: athrow
    //   31335: aconst_null
    //   31336: athrow
    //   31337: aconst_null
    //   31338: athrow
    //   31339: aconst_null
    //   31340: athrow
    //   31341: aconst_null
    //   31342: athrow
    //   31343: aconst_null
    //   31344: athrow
    //   31345: aconst_null
    //   31346: athrow
    //   31347: aconst_null
    //   31348: athrow
    //   31349: aconst_null
    //   31350: athrow
    //   31351: aconst_null
    //   31352: athrow
    //   31353: aconst_null
    //   31354: athrow
    //   31355: aconst_null
    //   31356: athrow
    //   31357: aconst_null
    //   31358: athrow
    //   31359: aconst_null
    //   31360: athrow
    //   31361: aconst_null
    //   31362: athrow
    //   31363: aconst_null
    //   31364: athrow
    //   31365: aconst_null
    //   31366: athrow
    //   31367: aconst_null
    //   31368: athrow
    //   31369: aconst_null
    //   31370: athrow
    //   31371: aconst_null
    //   31372: athrow
    //   31373: aconst_null
    //   31374: athrow
    //   31375: aconst_null
    //   31376: athrow
    //   31377: aconst_null
    //   31378: athrow
    //   31379: aconst_null
    //   31380: athrow
    //   31381: aconst_null
    //   31382: athrow
    //   31383: aconst_null
    //   31384: athrow
    //   31385: aconst_null
    //   31386: athrow
    //   31387: aconst_null
    //   31388: athrow
    //   31389: aconst_null
    //   31390: athrow
    //   31391: aconst_null
    //   31392: athrow
    //   31393: aconst_null
    //   31394: athrow
    //   31395: aconst_null
    //   31396: athrow
    //   31397: aconst_null
    //   31398: athrow
    //   31399: aconst_null
    //   31400: athrow
    //   31401: aconst_null
    //   31402: athrow
    //   31403: aconst_null
    //   31404: athrow
    //   31405: aconst_null
    //   31406: athrow
    //   31407: aconst_null
    //   31408: athrow
    //   31409: aconst_null
    //   31410: athrow
    //   31411: aconst_null
    //   31412: athrow
    //   31413: aconst_null
    //   31414: athrow
    //   31415: aconst_null
    //   31416: athrow
    //   31417: aconst_null
    //   31418: athrow
    //   31419: aconst_null
    //   31420: athrow
    //   31421: aconst_null
    //   31422: athrow
    //   31423: aconst_null
    //   31424: athrow
    //   31425: aconst_null
    //   31426: athrow
    //   31427: aconst_null
    //   31428: athrow
    //   31429: aconst_null
    //   31430: athrow
    //   31431: aconst_null
    //   31432: athrow
    //   31433: aconst_null
    //   31434: athrow
    //   31435: aconst_null
    //   31436: athrow
    //   31437: aconst_null
    //   31438: athrow
    //   31439: aconst_null
    //   31440: athrow
    //   31441: aconst_null
    //   31442: athrow
    //   31443: aconst_null
    //   31444: athrow
    //   31445: aconst_null
    //   31446: athrow
    //   31447: aconst_null
    //   31448: athrow
    //   31449: aconst_null
    //   31450: athrow
    //   31451: aconst_null
    //   31452: athrow
    //   31453: aconst_null
    //   31454: athrow
    //   31455: aconst_null
    //   31456: athrow
    //   31457: aconst_null
    //   31458: athrow
    //   31459: aconst_null
    //   31460: athrow
    //   31461: aconst_null
    //   31462: athrow
    //   31463: aconst_null
    //   31464: athrow
    //   31465: aconst_null
    //   31466: athrow
    //   31467: aconst_null
    //   31468: athrow
    //   31469: aconst_null
    //   31470: athrow
    //   31471: aconst_null
    //   31472: athrow
    //   31473: aconst_null
    //   31474: athrow
    //   31475: aconst_null
    //   31476: athrow
    //   31477: aconst_null
    //   31478: athrow
    //   31479: aconst_null
    //   31480: athrow
    //   31481: aconst_null
    //   31482: athrow
    //   31483: aconst_null
    //   31484: athrow
    //   31485: aconst_null
    //   31486: athrow
    //   31487: aconst_null
    //   31488: athrow
    //   31489: aconst_null
    //   31490: athrow
    //   31491: aconst_null
    //   31492: athrow
    //   31493: aconst_null
    //   31494: athrow
    //   31495: aconst_null
    //   31496: athrow
    //   31497: aconst_null
    //   31498: athrow
    //   31499: aconst_null
    //   31500: athrow
    //   31501: aconst_null
    //   31502: athrow
    //   31503: aconst_null
    //   31504: athrow
    //   31505: aconst_null
    //   31506: athrow
    //   31507: aconst_null
    //   31508: athrow
    //   31509: aconst_null
    //   31510: athrow
    //   31511: aconst_null
    //   31512: athrow
    //   31513: aconst_null
    //   31514: athrow
    //   31515: aconst_null
    //   31516: athrow
    //   31517: aconst_null
    //   31518: athrow
    //   31519: aconst_null
    //   31520: athrow
    //   31521: aconst_null
    //   31522: athrow
    //   31523: aconst_null
    //   31524: athrow
    //   31525: aconst_null
    //   31526: athrow
    //   31527: aconst_null
    //   31528: athrow
    //   31529: aconst_null
    //   31530: athrow
    //   31531: aconst_null
    //   31532: athrow
    //   31533: aconst_null
    //   31534: athrow
    //   31535: aconst_null
    //   31536: athrow
    //   31537: aconst_null
    //   31538: athrow
    //   31539: aconst_null
    //   31540: athrow
    //   31541: aconst_null
    //   31542: athrow
    //   31543: aconst_null
    //   31544: athrow
    //   31545: aconst_null
    //   31546: athrow
    //   31547: aconst_null
    //   31548: athrow
    //   31549: aconst_null
    //   31550: athrow
    //   31551: aconst_null
    //   31552: athrow
    //   31553: aconst_null
    //   31554: athrow
    //   31555: aconst_null
    //   31556: athrow
    //   31557: aconst_null
    //   31558: athrow
    //   31559: aconst_null
    //   31560: athrow
    //   31561: aconst_null
    //   31562: athrow
    //   31563: aconst_null
    //   31564: athrow
    //   31565: aconst_null
    //   31566: athrow
    //   31567: aconst_null
    //   31568: athrow
    //   31569: aconst_null
    //   31570: athrow
    //   31571: aconst_null
    //   31572: athrow
    //   31573: aconst_null
    //   31574: athrow
    //   31575: aconst_null
    //   31576: athrow
    //   31577: aconst_null
    //   31578: athrow
    //   31579: aconst_null
    //   31580: athrow
    //   31581: aconst_null
    //   31582: athrow
    //   31583: aconst_null
    //   31584: athrow
    //   31585: aconst_null
    //   31586: athrow
    //   31587: aconst_null
    //   31588: athrow
    //   31589: aconst_null
    //   31590: athrow
    //   31591: aconst_null
    //   31592: athrow
    //   31593: aconst_null
    //   31594: athrow
    //   31595: aconst_null
    //   31596: athrow
    //   31597: aconst_null
    //   31598: athrow
    //   31599: aconst_null
    //   31600: athrow
    //   31601: aconst_null
    //   31602: athrow
    //   31603: aconst_null
    //   31604: athrow
    //   31605: aconst_null
    //   31606: athrow
    //   31607: aconst_null
    //   31608: athrow
    //   31609: aconst_null
    //   31610: athrow
    //   31611: pop
    //   31612: goto -> 24
    //   31615: pop
    //   31616: aconst_null
    //   31617: goto -> 31611
    //   31620: dup
    //   31621: ifnull -> 31611
    //   31624: checkcast java/lang/Throwable
    //   31627: athrow
    //   31628: dup
    //   31629: ifnull -> 31615
    //   31632: checkcast java/lang/Throwable
    //   31635: athrow
    //   31636: aconst_null
    //   31637: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	30723	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Info;
    //   24	30723	1	event	Lbigname/zprestige/webhack/event/events/Render2DEvent;
    //   525	30222	2	FPS	Ljava/lang/String;
    //   1025	29722	3	TPS	Ljava/lang/String;
    //   1526	29221	4	PING	Ljava/lang/String;
    //   2242	28505	5	Speed	Ljava/lang/String;
    //   3230	27517	6	Crystals	Ljava/lang/String;
    //   4218	26529	7	Exp	Ljava/lang/String;
    //   5206	25541	8	Gapples	Ljava/lang/String;
    //   5938	24809	9	str	Ljava/lang/String;
    //   7058	23689	10	y	I
    //   7150	23597	11	counter1	[I
    // Exception table:
    //   from	to	target	type
    //   8	20	31620	java/lang/ArithmeticException
    //   91	98	98	finally
    //   91	98	3	finally
    //   91	98	91	java/util/NoSuchElementException
    //   92	98	91	finally
    //   92	98	91	java/util/NoSuchElementException
    //   167	174	174	finally
    //   167	174	167	finally
    //   167	174	174	java/lang/EnumConstantNotPresentException
    //   167	174	167	java/lang/UnsupportedOperationException
    //   168	174	174	java/lang/RuntimeException
    //   239	246	246	finally
    //   239	246	3	java/lang/AssertionError
    //   240	246	3	java/util/NoSuchElementException
    //   240	246	239	finally
    //   240	246	246	finally
    //   311	318	318	finally
    //   311	318	318	finally
    //   311	318	318	java/lang/IllegalStateException
    //   312	318	318	finally
    //   312	318	311	finally
    //   384	390	390	finally
    //   384	390	390	java/lang/IndexOutOfBoundsException
    //   384	390	390	java/lang/NegativeArraySizeException
    //   384	390	390	java/lang/ClassCastException
    //   384	390	3	java/lang/IllegalArgumentException
    //   456	462	462	finally
    //   456	462	462	finally
    //   456	462	3	java/lang/IllegalArgumentException
    //   456	462	3	java/lang/ArrayIndexOutOfBoundsException
    //   456	462	462	finally
    //   591	598	598	finally
    //   591	598	598	finally
    //   591	598	591	java/lang/IllegalArgumentException
    //   591	598	591	finally
    //   592	598	3	finally
    //   667	674	674	finally
    //   667	674	667	java/util/ConcurrentModificationException
    //   667	674	667	java/util/NoSuchElementException
    //   667	674	3	java/lang/UnsupportedOperationException
    //   668	674	3	finally
    //   739	746	746	finally
    //   739	746	739	finally
    //   739	746	746	java/lang/ArrayIndexOutOfBoundsException
    //   740	746	3	java/lang/StringIndexOutOfBoundsException
    //   740	746	746	finally
    //   811	818	818	finally
    //   811	818	818	java/lang/NullPointerException
    //   811	818	818	finally
    //   812	818	811	java/lang/NumberFormatException
    //   812	818	811	finally
    //   883	890	890	finally
    //   883	890	3	finally
    //   883	890	3	finally
    //   884	890	883	finally
    //   884	890	3	java/lang/ArrayIndexOutOfBoundsException
    //   955	962	962	finally
    //   955	962	3	java/lang/ClassCastException
    //   955	962	962	finally
    //   955	962	955	finally
    //   956	962	955	finally
    //   1091	1098	1098	finally
    //   1091	1098	3	finally
    //   1091	1098	1091	finally
    //   1091	1098	1098	finally
    //   1092	1098	3	java/lang/IllegalArgumentException
    //   1167	1174	1174	finally
    //   1167	1174	1167	java/lang/NumberFormatException
    //   1167	1174	3	finally
    //   1167	1174	1167	finally
    //   1168	1174	3	finally
    //   1239	1246	1246	finally
    //   1240	1246	1246	finally
    //   1240	1246	1246	java/util/NoSuchElementException
    //   1240	1246	1239	java/lang/IndexOutOfBoundsException
    //   1240	1246	3	java/lang/AssertionError
    //   1311	1318	1318	finally
    //   1311	1318	1318	java/lang/IndexOutOfBoundsException
    //   1311	1318	1311	finally
    //   1312	1318	1318	finally
    //   1312	1318	1318	finally
    //   1383	1390	1390	finally
    //   1383	1390	1383	java/lang/NegativeArraySizeException
    //   1384	1390	1390	java/lang/UnsupportedOperationException
    //   1384	1390	3	java/lang/EnumConstantNotPresentException
    //   1384	1390	1390	finally
    //   1455	1462	1462	finally
    //   1455	1462	3	finally
    //   1455	1462	1455	java/util/NoSuchElementException
    //   1455	1462	1462	finally
    //   1456	1462	1462	finally
    //   1595	1602	1602	finally
    //   1595	1602	1595	java/lang/ClassCastException
    //   1595	1602	1595	java/util/ConcurrentModificationException
    //   1596	1602	1595	finally
    //   1596	1602	3	finally
    //   1671	1678	1678	finally
    //   1671	1678	1671	finally
    //   1671	1678	3	finally
    //   1671	1678	1678	finally
    //   1671	1678	1678	finally
    //   1744	1750	1750	finally
    //   1744	1750	1750	finally
    //   1744	1750	1750	finally
    //   1744	1750	3	java/lang/IndexOutOfBoundsException
    //   1744	1750	3	finally
    //   1879	1886	1886	finally
    //   1879	1886	3	finally
    //   1880	1886	3	finally
    //   1880	1886	1886	java/lang/ArrayIndexOutOfBoundsException
    //   1880	1886	1879	java/lang/ArrayIndexOutOfBoundsException
    //   1952	1958	1958	finally
    //   1952	1958	1958	finally
    //   1952	1958	1958	finally
    //   1952	1958	3	finally
    //   1952	1958	1958	finally
    //   2028	2034	2034	finally
    //   2028	2034	3	finally
    //   2028	2034	2034	finally
    //   2028	2034	2034	finally
    //   2028	2034	3	finally
    //   2100	2106	2106	finally
    //   2100	2106	3	finally
    //   2100	2106	2106	java/lang/ClassCastException
    //   2100	2106	3	finally
    //   2100	2106	3	finally
    //   2171	2178	2178	finally
    //   2171	2178	2178	java/lang/UnsupportedOperationException
    //   2172	2178	2178	java/util/ConcurrentModificationException
    //   2172	2178	2171	finally
    //   2172	2178	2178	finally
    //   2311	2318	2318	finally
    //   2311	2318	3	finally
    //   2311	2318	2311	finally
    //   2312	2318	2311	java/lang/NumberFormatException
    //   2312	2318	2318	java/lang/ArrayIndexOutOfBoundsException
    //   2387	2394	2394	finally
    //   2387	2394	2394	finally
    //   2387	2394	2387	java/lang/IllegalStateException
    //   2388	2394	2387	java/lang/StringIndexOutOfBoundsException
    //   2388	2394	3	java/lang/ArithmeticException
    //   2459	2466	2466	finally
    //   2459	2466	2459	finally
    //   2459	2466	2459	finally
    //   2460	2466	2459	finally
    //   2460	2466	2466	finally
    //   2787	2794	2794	finally
    //   2787	2794	2787	java/lang/IllegalStateException
    //   2788	2794	2794	finally
    //   2788	2794	2787	java/lang/EnumConstantNotPresentException
    //   2788	2794	3	java/lang/ClassCastException
    //   2863	2872	2872	finally
    //   2863	2872	2863	finally
    //   2863	2872	2872	java/lang/NullPointerException
    //   2863	2872	2863	finally
    //   2864	2872	3	finally
    //   2943	2952	2952	finally
    //   2943	2952	3	finally
    //   2944	2952	2943	java/lang/NumberFormatException
    //   2944	2952	2952	java/lang/ArithmeticException
    //   2944	2952	2952	java/lang/ArrayIndexOutOfBoundsException
    //   3015	3024	3024	finally
    //   3015	3024	3024	java/lang/NullPointerException
    //   3015	3024	3	java/lang/NegativeArraySizeException
    //   3016	3024	3015	java/lang/RuntimeException
    //   3016	3024	3024	java/lang/NumberFormatException
    //   3087	3094	3094	finally
    //   3087	3094	3094	finally
    //   3088	3094	3	finally
    //   3088	3094	3	java/lang/IndexOutOfBoundsException
    //   3088	3094	3087	java/lang/AssertionError
    //   3159	3166	3166	finally
    //   3159	3166	3159	java/lang/UnsupportedOperationException
    //   3160	3166	3166	java/util/NoSuchElementException
    //   3160	3166	3159	java/lang/IllegalStateException
    //   3160	3166	3166	java/lang/RuntimeException
    //   3299	3306	3306	finally
    //   3299	3306	3299	java/lang/StringIndexOutOfBoundsException
    //   3300	3306	3	java/lang/ClassCastException
    //   3300	3306	3306	java/lang/StringIndexOutOfBoundsException
    //   3300	3306	3	finally
    //   3375	3382	3382	finally
    //   3375	3382	3375	java/lang/UnsupportedOperationException
    //   3375	3382	3	finally
    //   3375	3382	3375	finally
    //   3375	3382	3382	finally
    //   3447	3454	3454	finally
    //   3447	3454	3447	java/lang/StringIndexOutOfBoundsException
    //   3447	3454	3447	java/lang/IllegalStateException
    //   3448	3454	3	java/lang/IllegalArgumentException
    //   3448	3454	3	finally
    //   3775	3782	3782	finally
    //   3775	3782	3782	finally
    //   3775	3782	3775	java/lang/AssertionError
    //   3775	3782	3782	java/lang/IllegalArgumentException
    //   3776	3782	3	java/lang/IndexOutOfBoundsException
    //   3851	3860	3860	finally
    //   3851	3860	3860	java/util/ConcurrentModificationException
    //   3851	3860	3851	finally
    //   3852	3860	3860	java/lang/StringIndexOutOfBoundsException
    //   3852	3860	3851	finally
    //   3932	3940	3940	finally
    //   3932	3940	3940	finally
    //   3932	3940	3	java/lang/StringIndexOutOfBoundsException
    //   3932	3940	3	java/lang/ArithmeticException
    //   3932	3940	3	java/util/ConcurrentModificationException
    //   4003	4012	4012	finally
    //   4003	4012	4003	java/lang/UnsupportedOperationException
    //   4003	4012	4003	java/lang/NullPointerException
    //   4003	4012	3	finally
    //   4004	4012	4003	java/lang/StringIndexOutOfBoundsException
    //   4075	4082	4082	finally
    //   4075	4082	3	finally
    //   4075	4082	4082	finally
    //   4076	4082	4075	finally
    //   4076	4082	4075	finally
    //   4147	4154	4154	finally
    //   4147	4154	4154	java/lang/NullPointerException
    //   4147	4154	4147	finally
    //   4148	4154	4154	java/lang/StringIndexOutOfBoundsException
    //   4148	4154	4154	java/lang/ArrayIndexOutOfBoundsException
    //   4287	4294	4294	finally
    //   4287	4294	4287	finally
    //   4287	4294	4287	java/lang/AssertionError
    //   4287	4294	4294	java/lang/UnsupportedOperationException
    //   4288	4294	4287	java/lang/ArrayIndexOutOfBoundsException
    //   4363	4370	4370	finally
    //   4364	4370	3	java/lang/NegativeArraySizeException
    //   4364	4370	4363	finally
    //   4364	4370	4370	java/lang/IllegalStateException
    //   4364	4370	4370	finally
    //   4435	4442	4442	finally
    //   4435	4442	4435	finally
    //   4435	4442	4442	finally
    //   4436	4442	4435	finally
    //   4436	4442	3	java/lang/NegativeArraySizeException
    //   4763	4770	4770	finally
    //   4763	4770	4770	finally
    //   4763	4770	4763	java/lang/StringIndexOutOfBoundsException
    //   4764	4770	3	finally
    //   4764	4770	4770	finally
    //   4839	4848	4848	finally
    //   4839	4848	4839	finally
    //   4839	4848	4839	finally
    //   4840	4848	3	java/util/ConcurrentModificationException
    //   4840	4848	4839	finally
    //   4919	4928	4928	finally
    //   4919	4928	4919	finally
    //   4919	4928	3	finally
    //   4920	4928	4928	java/lang/EnumConstantNotPresentException
    //   4920	4928	4928	java/lang/ClassCastException
    //   4991	5000	5000	finally
    //   4991	5000	3	java/lang/NumberFormatException
    //   4991	5000	4991	finally
    //   4992	5000	4991	java/lang/NullPointerException
    //   4992	5000	3	java/lang/NegativeArraySizeException
    //   5063	5070	5070	finally
    //   5063	5070	5063	java/lang/NegativeArraySizeException
    //   5063	5070	5063	finally
    //   5063	5070	5070	finally
    //   5063	5070	5070	java/lang/ArrayIndexOutOfBoundsException
    //   5136	5142	5142	finally
    //   5136	5142	5142	finally
    //   5136	5142	3	finally
    //   5136	5142	3	java/lang/NullPointerException
    //   5136	5142	3	java/lang/ClassCastException
    //   5275	5282	5282	finally
    //   5275	5282	5282	finally
    //   5275	5282	3	finally
    //   5276	5282	5275	java/lang/IllegalStateException
    //   5276	5282	3	finally
    //   5351	5358	5358	finally
    //   5351	5358	5358	java/lang/StringIndexOutOfBoundsException
    //   5351	5358	5351	finally
    //   5352	5358	5351	java/lang/RuntimeException
    //   5352	5358	5351	java/lang/UnsupportedOperationException
    //   5423	5430	5430	finally
    //   5423	5430	5430	finally
    //   5423	5430	5423	java/lang/NumberFormatException
    //   5424	5430	5430	finally
    //   5424	5430	3	finally
    //   5503	5510	5510	finally
    //   5503	5510	5510	java/lang/RuntimeException
    //   5503	5510	5510	finally
    //   5504	5510	5503	java/lang/ClassCastException
    //   5504	5510	5503	java/lang/AssertionError
    //   5575	5582	5582	finally
    //   5575	5582	5575	finally
    //   5575	5582	5582	java/lang/EnumConstantNotPresentException
    //   5575	5582	3	java/util/NoSuchElementException
    //   5576	5582	3	java/lang/RuntimeException
    //   5651	5658	5658	finally
    //   5651	5658	5658	finally
    //   5651	5658	5651	java/lang/StringIndexOutOfBoundsException
    //   5651	5658	5651	finally
    //   5652	5658	3	finally
    //   5723	5730	5730	finally
    //   5723	5730	3	finally
    //   5723	5730	5730	finally
    //   5724	5730	3	finally
    //   5724	5730	5723	java/lang/EnumConstantNotPresentException
    //   5795	5802	5802	finally
    //   5795	5802	5802	finally
    //   5795	5802	5802	java/lang/NullPointerException
    //   5795	5802	3	java/lang/ArithmeticException
    //   5796	5802	5795	java/lang/EnumConstantNotPresentException
    //   5867	5874	5874	finally
    //   5867	5874	3	finally
    //   5867	5874	5874	finally
    //   5867	5874	5867	java/lang/UnsupportedOperationException
    //   5868	5874	3	finally
    //   6063	6070	6070	finally
    //   6063	6070	3	finally
    //   6063	6070	6070	java/lang/NegativeArraySizeException
    //   6064	6070	6063	java/lang/NumberFormatException
    //   6064	6070	6070	finally
    //   6200	6206	6206	finally
    //   6200	6206	6206	finally
    //   6200	6206	6206	finally
    //   6200	6206	6206	java/lang/EnumConstantNotPresentException
    //   6200	6206	3	finally
    //   6275	6282	6282	finally
    //   6275	6282	6275	finally
    //   6275	6282	6275	finally
    //   6276	6282	6282	finally
    //   6276	6282	3	finally
    //   6347	6354	6354	finally
    //   6347	6354	6354	finally
    //   6347	6354	3	java/lang/StringIndexOutOfBoundsException
    //   6347	6354	3	finally
    //   6348	6354	6347	finally
    //   6483	6490	6490	finally
    //   6483	6490	6483	java/lang/IllegalStateException
    //   6483	6490	3	finally
    //   6484	6490	6490	java/lang/ArithmeticException
    //   6484	6490	6490	java/lang/IllegalStateException
    //   6559	6566	6566	finally
    //   6559	6566	6559	finally
    //   6559	6566	3	java/lang/ClassCastException
    //   6560	6566	6566	finally
    //   6560	6566	3	java/lang/ArithmeticException
    //   6631	6638	6638	finally
    //   6631	6638	3	finally
    //   6631	6638	6638	java/lang/StringIndexOutOfBoundsException
    //   6632	6638	6631	finally
    //   6632	6638	6631	java/lang/EnumConstantNotPresentException
    //   6768	6774	6774	finally
    //   6768	6774	6774	finally
    //   6768	6774	6774	finally
    //   6768	6774	6774	java/lang/NullPointerException
    //   6768	6774	3	java/lang/EnumConstantNotPresentException
    //   6843	6850	6850	finally
    //   6843	6850	6843	java/lang/IllegalStateException
    //   6844	6850	6850	java/lang/RuntimeException
    //   6844	6850	6843	finally
    //   6844	6850	6843	finally
    //   6915	6922	6922	finally
    //   6915	6922	3	java/lang/AssertionError
    //   6916	6922	3	finally
    //   6916	6922	6915	java/lang/NumberFormatException
    //   6916	6922	6915	finally
    //   7215	7222	7222	finally
    //   7215	7222	7215	finally
    //   7215	7222	3	finally
    //   7215	7222	3	java/util/ConcurrentModificationException
    //   7216	7222	7222	finally
    //   7351	7358	7358	finally
    //   7351	7358	7351	java/util/NoSuchElementException
    //   7351	7358	3	java/lang/AssertionError
    //   7352	7358	7358	finally
    //   7352	7358	3	finally
    //   7427	7434	7434	finally
    //   7427	7434	7427	finally
    //   7428	7434	7434	java/util/ConcurrentModificationException
    //   7428	7434	7434	finally
    //   7428	7434	3	java/lang/IllegalArgumentException
    //   7551	7558	7558	finally
    //   7551	7558	7551	finally
    //   7551	7558	7551	java/lang/IndexOutOfBoundsException
    //   7551	7558	7551	java/lang/UnsupportedOperationException
    //   7552	7558	7558	finally
    //   7688	7694	7694	finally
    //   7688	7694	3	finally
    //   7688	7694	3	java/lang/IllegalStateException
    //   7688	7694	3	finally
    //   7688	7694	3	java/lang/NegativeArraySizeException
    //   7999	8006	8006	finally
    //   7999	8006	8006	java/lang/IndexOutOfBoundsException
    //   7999	8006	7999	finally
    //   8000	8006	3	finally
    //   8000	8006	3	java/lang/ArrayIndexOutOfBoundsException
    //   8076	8082	8082	finally
    //   8076	8082	8082	finally
    //   8076	8082	8082	java/lang/IllegalArgumentException
    //   8076	8082	3	finally
    //   8076	8082	3	finally
    //   8507	8514	8514	finally
    //   8507	8514	8507	java/lang/NegativeArraySizeException
    //   8507	8514	8514	java/util/NoSuchElementException
    //   8507	8514	8514	finally
    //   8508	8514	8507	java/lang/UnsupportedOperationException
    //   8583	8590	8590	finally
    //   8583	8590	3	finally
    //   8583	8590	8590	finally
    //   8583	8590	8583	finally
    //   8583	8590	3	finally
    //   8779	8786	8786	finally
    //   8779	8786	8786	finally
    //   8779	8786	3	java/lang/NegativeArraySizeException
    //   8779	8786	8779	java/lang/AssertionError
    //   8780	8786	8779	java/lang/IllegalStateException
    //   8855	8862	8862	finally
    //   8855	8862	3	finally
    //   8855	8862	8862	finally
    //   8856	8862	8855	java/lang/NumberFormatException
    //   8856	8862	8855	java/util/NoSuchElementException
    //   8927	8934	8934	finally
    //   8927	8934	8927	finally
    //   8927	8934	8927	java/lang/RuntimeException
    //   8928	8934	8927	finally
    //   8928	8934	8934	java/lang/NullPointerException
    //   9063	9070	9070	finally
    //   9063	9070	3	java/util/NoSuchElementException
    //   9063	9070	3	finally
    //   9063	9070	9063	finally
    //   9064	9070	9070	java/lang/NumberFormatException
    //   9139	9146	9146	finally
    //   9139	9146	9139	finally
    //   9139	9146	9146	java/lang/RuntimeException
    //   9139	9146	9146	finally
    //   9140	9146	9139	finally
    //   9212	9218	9218	finally
    //   9212	9218	9218	finally
    //   9212	9218	9218	java/lang/ClassCastException
    //   9212	9218	9218	java/util/NoSuchElementException
    //   9212	9218	9218	java/lang/IllegalArgumentException
    //   9283	9290	9290	finally
    //   9283	9290	3	java/util/NoSuchElementException
    //   9284	9290	9283	finally
    //   9284	9290	9283	java/util/ConcurrentModificationException
    //   9284	9290	9290	java/lang/ArrayIndexOutOfBoundsException
    //   9363	9370	9370	finally
    //   9363	9370	3	finally
    //   9363	9370	9363	java/lang/RuntimeException
    //   9363	9370	3	java/util/NoSuchElementException
    //   9364	9370	9363	java/lang/IndexOutOfBoundsException
    //   9564	9570	9570	finally
    //   9564	9570	3	java/lang/NumberFormatException
    //   9564	9570	9570	java/lang/StringIndexOutOfBoundsException
    //   9564	9570	3	java/lang/NumberFormatException
    //   9564	9570	9570	finally
    //   9639	9646	9646	finally
    //   9639	9646	9646	java/lang/UnsupportedOperationException
    //   9639	9646	3	finally
    //   9640	9646	3	finally
    //   9640	9646	9639	finally
    //   10071	10078	10078	finally
    //   10071	10078	3	java/lang/AssertionError
    //   10071	10078	10071	java/lang/EnumConstantNotPresentException
    //   10071	10078	10071	finally
    //   10072	10078	10078	java/lang/NegativeArraySizeException
    //   10147	10154	10154	finally
    //   10147	10154	10154	finally
    //   10148	10154	3	java/lang/ArrayIndexOutOfBoundsException
    //   10148	10154	10147	finally
    //   10148	10154	3	java/lang/IndexOutOfBoundsException
    //   10343	10350	10350	finally
    //   10343	10350	10343	finally
    //   10344	10350	3	finally
    //   10344	10350	3	finally
    //   10344	10350	10350	finally
    //   10419	10426	10426	finally
    //   10419	10426	10426	finally
    //   10419	10426	3	java/lang/NullPointerException
    //   10419	10426	10426	finally
    //   10420	10426	10419	java/lang/AssertionError
    //   10491	10498	10498	finally
    //   10491	10498	3	java/lang/NullPointerException
    //   10492	10498	10491	java/lang/EnumConstantNotPresentException
    //   10492	10498	10498	finally
    //   10492	10498	10498	java/lang/ClassCastException
    //   10627	10634	10634	finally
    //   10627	10634	10627	java/lang/EnumConstantNotPresentException
    //   10627	10634	10627	java/lang/AssertionError
    //   10627	10634	10634	java/lang/ArrayIndexOutOfBoundsException
    //   10627	10634	10634	java/util/NoSuchElementException
    //   10703	10710	10710	finally
    //   10703	10710	3	java/lang/EnumConstantNotPresentException
    //   10703	10710	3	java/lang/RuntimeException
    //   10703	10710	10703	java/lang/NumberFormatException
    //   10704	10710	10710	finally
    //   10775	10782	10782	finally
    //   10775	10782	10782	java/lang/IllegalStateException
    //   10775	10782	10775	finally
    //   10775	10782	10775	java/util/ConcurrentModificationException
    //   10775	10782	10782	finally
    //   10847	10854	10854	finally
    //   10847	10854	10854	finally
    //   10847	10854	10847	finally
    //   10848	10854	10854	java/lang/NumberFormatException
    //   10848	10854	10854	finally
    //   10927	10934	10934	finally
    //   10927	10934	10934	finally
    //   10927	10934	10934	finally
    //   10927	10934	10934	java/lang/ClassCastException
    //   10928	10934	10927	finally
    //   11127	11134	11134	finally
    //   11127	11134	11127	finally
    //   11127	11134	3	java/lang/NegativeArraySizeException
    //   11128	11134	11127	java/util/ConcurrentModificationException
    //   11128	11134	3	java/lang/NegativeArraySizeException
    //   11203	11210	11210	finally
    //   11203	11210	11203	finally
    //   11203	11210	11203	finally
    //   11204	11210	3	finally
    //   11204	11210	11210	finally
    //   11640	11646	11646	finally
    //   11640	11646	3	java/lang/NegativeArraySizeException
    //   11640	11646	3	finally
    //   11640	11646	3	java/lang/ArrayIndexOutOfBoundsException
    //   11640	11646	11646	finally
    //   11715	11722	11722	finally
    //   11715	11722	11715	java/lang/ArrayIndexOutOfBoundsException
    //   11715	11722	11715	java/util/ConcurrentModificationException
    //   11716	11722	11715	finally
    //   11716	11722	3	java/lang/ClassCastException
    //   11911	11918	11918	finally
    //   11911	11918	11911	java/lang/NegativeArraySizeException
    //   11912	11918	11911	finally
    //   11912	11918	11918	finally
    //   11912	11918	3	java/lang/ClassCastException
    //   11987	11994	11994	finally
    //   11987	11994	11987	java/lang/ClassCastException
    //   11987	11994	11987	java/lang/NullPointerException
    //   11987	11994	3	java/lang/IndexOutOfBoundsException
    //   11988	11994	11994	finally
    //   12060	12066	12066	finally
    //   12060	12066	12066	java/lang/RuntimeException
    //   12060	12066	12066	java/lang/NullPointerException
    //   12060	12066	12066	java/lang/EnumConstantNotPresentException
    //   12060	12066	3	finally
    //   12195	12202	12202	finally
    //   12195	12202	3	finally
    //   12196	12202	3	java/lang/ClassCastException
    //   12196	12202	3	finally
    //   12196	12202	12195	finally
    //   12271	12278	12278	finally
    //   12271	12278	12271	java/lang/IndexOutOfBoundsException
    //   12272	12278	12271	finally
    //   12272	12278	12271	finally
    //   12272	12278	12278	finally
    //   12343	12350	12350	finally
    //   12343	12350	3	java/lang/StringIndexOutOfBoundsException
    //   12344	12350	3	finally
    //   12344	12350	12343	java/lang/NegativeArraySizeException
    //   12344	12350	12343	java/lang/IllegalArgumentException
    //   12415	12422	12422	finally
    //   12415	12422	3	java/lang/StringIndexOutOfBoundsException
    //   12415	12422	3	finally
    //   12415	12422	12415	finally
    //   12416	12422	12422	finally
    //   12495	12502	12502	finally
    //   12495	12502	3	java/lang/NumberFormatException
    //   12496	12502	3	java/util/ConcurrentModificationException
    //   12496	12502	12495	java/lang/ArithmeticException
    //   12496	12502	3	java/lang/UnsupportedOperationException
    //   12695	12702	12702	finally
    //   12695	12702	3	java/util/NoSuchElementException
    //   12695	12702	12695	finally
    //   12696	12702	12702	java/util/NoSuchElementException
    //   12696	12702	12702	finally
    //   12772	12778	12778	finally
    //   12772	12778	3	java/lang/IllegalArgumentException
    //   12772	12778	3	finally
    //   12772	12778	3	finally
    //   12772	12778	12778	java/lang/IndexOutOfBoundsException
    //   13208	13214	13214	finally
    //   13208	13214	13214	java/util/ConcurrentModificationException
    //   13208	13214	13214	finally
    //   13208	13214	3	finally
    //   13208	13214	13214	java/lang/StringIndexOutOfBoundsException
    //   13283	13290	13290	finally
    //   13283	13290	3	finally
    //   13283	13290	13283	java/lang/ArrayIndexOutOfBoundsException
    //   13283	13290	13290	finally
    //   13284	13290	13283	finally
    //   13479	13486	13486	finally
    //   13479	13486	13479	finally
    //   13479	13486	13486	java/lang/AssertionError
    //   13480	13486	13486	java/util/NoSuchElementException
    //   13480	13486	3	finally
    //   13555	13562	13562	finally
    //   13555	13562	13555	java/lang/UnsupportedOperationException
    //   13555	13562	3	java/util/ConcurrentModificationException
    //   13555	13562	13562	java/lang/ArithmeticException
    //   13556	13562	3	java/lang/UnsupportedOperationException
    //   13627	13634	13634	finally
    //   13627	13634	13627	java/lang/IndexOutOfBoundsException
    //   13627	13634	13634	java/lang/ArithmeticException
    //   13628	13634	13627	java/lang/EnumConstantNotPresentException
    //   13628	13634	13627	finally
    //   13763	13770	13770	finally
    //   13763	13770	13770	java/lang/NumberFormatException
    //   13764	13770	13763	java/lang/StringIndexOutOfBoundsException
    //   13764	13770	13763	finally
    //   13764	13770	3	java/lang/AssertionError
    //   13839	13846	13846	finally
    //   13839	13846	13839	java/util/ConcurrentModificationException
    //   13840	13846	13839	finally
    //   13840	13846	13846	java/util/NoSuchElementException
    //   13840	13846	13839	finally
    //   13911	13918	13918	finally
    //   13911	13918	13911	finally
    //   13912	13918	13911	finally
    //   13912	13918	3	finally
    //   13912	13918	13918	java/lang/UnsupportedOperationException
    //   13983	13990	13990	finally
    //   13983	13990	3	finally
    //   13983	13990	3	finally
    //   13983	13990	13983	java/lang/ArrayIndexOutOfBoundsException
    //   13984	13990	3	finally
    //   14063	14070	14070	finally
    //   14063	14070	14063	finally
    //   14063	14070	14070	finally
    //   14064	14070	14063	java/lang/ClassCastException
    //   14064	14070	3	finally
    //   14263	14270	14270	finally
    //   14263	14270	14263	java/lang/ArithmeticException
    //   14263	14270	14270	finally
    //   14264	14270	14263	finally
    //   14264	14270	3	java/lang/IllegalStateException
    //   14339	14346	14346	finally
    //   14339	14346	14346	java/util/NoSuchElementException
    //   14339	14346	14346	java/lang/AssertionError
    //   14339	14346	14339	java/lang/IllegalArgumentException
    //   14340	14346	14339	finally
    //   14775	14782	14782	finally
    //   14775	14782	14782	finally
    //   14775	14782	14782	java/util/NoSuchElementException
    //   14775	14782	14775	finally
    //   14776	14782	3	java/lang/EnumConstantNotPresentException
    //   14851	14858	14858	finally
    //   14851	14858	14858	java/lang/IndexOutOfBoundsException
    //   14852	14858	3	finally
    //   14852	14858	14858	finally
    //   14852	14858	14851	finally
    //   15047	15054	15054	finally
    //   15047	15054	15047	finally
    //   15048	15054	15054	finally
    //   15048	15054	15047	java/util/NoSuchElementException
    //   15048	15054	15047	finally
    //   15123	15130	15130	finally
    //   15123	15130	3	finally
    //   15123	15130	3	java/lang/StringIndexOutOfBoundsException
    //   15124	15130	15123	finally
    //   15124	15130	15130	java/lang/ArithmeticException
    //   15195	15202	15202	finally
    //   15195	15202	15202	finally
    //   15195	15202	3	finally
    //   15196	15202	15195	java/lang/IndexOutOfBoundsException
    //   15196	15202	15202	java/lang/RuntimeException
    //   15331	15338	15338	finally
    //   15331	15338	15331	finally
    //   15332	15338	3	java/lang/EnumConstantNotPresentException
    //   15332	15338	3	finally
    //   15332	15338	15338	finally
    //   15407	15414	15414	finally
    //   15407	15414	15407	finally
    //   15407	15414	15414	java/lang/IllegalArgumentException
    //   15408	15414	15414	finally
    //   15408	15414	15414	java/util/ConcurrentModificationException
    //   15479	15486	15486	finally
    //   15479	15486	15479	finally
    //   15479	15486	3	java/lang/NumberFormatException
    //   15480	15486	3	finally
    //   15480	15486	15479	finally
    //   15552	15558	15558	finally
    //   15552	15558	3	finally
    //   15552	15558	15558	java/lang/NullPointerException
    //   15552	15558	3	java/lang/ArrayIndexOutOfBoundsException
    //   15552	15558	15558	java/lang/ArithmeticException
    //   15631	15638	15638	finally
    //   15631	15638	15638	java/lang/NullPointerException
    //   15631	15638	3	finally
    //   15631	15638	15631	finally
    //   15631	15638	3	finally
    //   15979	15986	15986	finally
    //   15979	15986	15979	java/lang/ArithmeticException
    //   15980	15986	15986	java/lang/RuntimeException
    //   15980	15986	15986	java/lang/IllegalStateException
    //   15980	15986	15979	finally
    //   16055	16062	16062	finally
    //   16055	16062	16055	finally
    //   16055	16062	3	finally
    //   16055	16062	16062	java/lang/ArithmeticException
    //   16056	16062	3	java/lang/NegativeArraySizeException
    //   16491	16498	16498	finally
    //   16491	16498	3	finally
    //   16491	16498	16491	finally
    //   16492	16498	3	java/lang/AssertionError
    //   16492	16498	16498	finally
    //   16567	16574	16574	finally
    //   16567	16574	3	finally
    //   16567	16574	16567	finally
    //   16567	16574	16567	finally
    //   16568	16574	3	finally
    //   16763	16770	16770	finally
    //   16763	16770	16770	finally
    //   16763	16770	16770	finally
    //   16763	16770	16763	java/lang/StringIndexOutOfBoundsException
    //   16763	16770	16770	java/lang/RuntimeException
    //   16839	16846	16846	finally
    //   16839	16846	3	finally
    //   16840	16846	16839	finally
    //   16840	16846	16839	finally
    //   16840	16846	3	java/lang/AssertionError
    //   16912	16918	16918	finally
    //   16912	16918	3	finally
    //   16912	16918	16918	finally
    //   16912	16918	16918	finally
    //   16912	16918	3	java/lang/AssertionError
    //   17047	17054	17054	finally
    //   17047	17054	17054	java/lang/IllegalStateException
    //   17047	17054	17054	finally
    //   17048	17054	17054	finally
    //   17048	17054	17047	finally
    //   17124	17130	17130	finally
    //   17124	17130	3	java/lang/NumberFormatException
    //   17124	17130	3	finally
    //   17124	17130	17130	java/lang/NegativeArraySizeException
    //   17124	17130	3	java/lang/RuntimeException
    //   17195	17202	17202	finally
    //   17195	17202	17195	finally
    //   17196	17202	17195	java/lang/IllegalStateException
    //   17196	17202	17202	java/lang/NegativeArraySizeException
    //   17196	17202	3	java/lang/RuntimeException
    //   17267	17274	17274	finally
    //   17267	17274	17267	finally
    //   17267	17274	17267	java/lang/RuntimeException
    //   17268	17274	17274	java/lang/NullPointerException
    //   17268	17274	17267	finally
    //   17347	17354	17354	finally
    //   17347	17354	3	java/lang/NullPointerException
    //   17348	17354	3	java/lang/EnumConstantNotPresentException
    //   17348	17354	17347	java/util/ConcurrentModificationException
    //   17348	17354	17347	java/lang/RuntimeException
    //   17547	17554	17554	finally
    //   17547	17554	17547	finally
    //   17547	17554	17547	finally
    //   17548	17554	17554	finally
    //   17548	17554	17554	java/lang/IllegalArgumentException
    //   17623	17630	17630	finally
    //   17623	17630	3	finally
    //   17623	17630	17630	finally
    //   17624	17630	17623	finally
    //   17624	17630	17630	finally
    //   18059	18066	18066	finally
    //   18059	18066	18066	java/lang/IndexOutOfBoundsException
    //   18059	18066	18059	finally
    //   18059	18066	3	finally
    //   18060	18066	18066	finally
    //   18135	18142	18142	finally
    //   18135	18142	3	java/lang/RuntimeException
    //   18135	18142	18135	finally
    //   18135	18142	18142	finally
    //   18136	18142	3	finally
    //   18332	18338	18338	finally
    //   18332	18338	18338	finally
    //   18332	18338	3	finally
    //   18332	18338	18338	java/util/ConcurrentModificationException
    //   18332	18338	18338	java/lang/RuntimeException
    //   18407	18414	18414	finally
    //   18407	18414	18407	java/lang/IllegalArgumentException
    //   18407	18414	18414	finally
    //   18407	18414	18414	finally
    //   18407	18414	18407	java/lang/ClassCastException
    //   18479	18486	18486	finally
    //   18479	18486	18486	java/lang/IllegalArgumentException
    //   18479	18486	18486	finally
    //   18480	18486	18479	java/lang/NumberFormatException
    //   18480	18486	18479	java/lang/ClassCastException
    //   18615	18622	18622	finally
    //   18615	18622	18615	java/util/NoSuchElementException
    //   18615	18622	18622	java/lang/ArithmeticException
    //   18616	18622	18622	finally
    //   18616	18622	18615	finally
    //   18691	18698	18698	finally
    //   18691	18698	18691	finally
    //   18691	18698	3	java/lang/IllegalArgumentException
    //   18692	18698	18698	java/lang/ArrayIndexOutOfBoundsException
    //   18692	18698	3	java/util/ConcurrentModificationException
    //   18763	18770	18770	finally
    //   18763	18770	3	finally
    //   18763	18770	3	java/lang/UnsupportedOperationException
    //   18763	18770	18770	finally
    //   18763	18770	18763	java/lang/RuntimeException
    //   18836	18842	18842	finally
    //   18836	18842	3	java/lang/EnumConstantNotPresentException
    //   18836	18842	3	java/lang/NegativeArraySizeException
    //   18836	18842	3	finally
    //   18836	18842	18842	finally
    //   18916	18922	18922	finally
    //   18916	18922	18922	finally
    //   18916	18922	3	java/lang/RuntimeException
    //   18916	18922	18922	finally
    //   18916	18922	18922	java/util/NoSuchElementException
    //   19115	19122	19122	finally
    //   19115	19122	19115	finally
    //   19115	19122	3	java/lang/ClassCastException
    //   19116	19122	19122	java/lang/UnsupportedOperationException
    //   19116	19122	19122	java/lang/AssertionError
    //   19191	19198	19198	finally
    //   19191	19198	19198	java/lang/StringIndexOutOfBoundsException
    //   19191	19198	19191	finally
    //   19191	19198	19198	finally
    //   19192	19198	19198	java/util/ConcurrentModificationException
    //   19628	19634	19634	finally
    //   19628	19634	19634	java/lang/UnsupportedOperationException
    //   19628	19634	3	java/lang/EnumConstantNotPresentException
    //   19628	19634	19634	finally
    //   19628	19634	19634	java/lang/IllegalArgumentException
    //   19703	19710	19710	finally
    //   19703	19710	19703	java/lang/NumberFormatException
    //   19703	19710	19710	finally
    //   19703	19710	19710	java/lang/NumberFormatException
    //   19704	19710	19710	java/lang/NegativeArraySizeException
    //   19899	19906	19906	finally
    //   19899	19906	19899	finally
    //   19899	19906	19899	finally
    //   19899	19906	3	finally
    //   19900	19906	3	finally
    //   19976	19982	19982	finally
    //   19976	19982	3	java/lang/NumberFormatException
    //   19976	19982	3	finally
    //   19976	19982	3	finally
    //   19976	19982	3	java/lang/EnumConstantNotPresentException
    //   20047	20054	20054	finally
    //   20047	20054	3	java/lang/NegativeArraySizeException
    //   20048	20054	3	java/lang/ArrayIndexOutOfBoundsException
    //   20048	20054	20054	java/lang/UnsupportedOperationException
    //   20048	20054	20047	java/lang/NullPointerException
    //   20183	20190	20190	finally
    //   20183	20190	20183	java/lang/ClassCastException
    //   20183	20190	3	finally
    //   20184	20190	20190	finally
    //   20184	20190	20190	finally
    //   20259	20266	20266	finally
    //   20260	20266	3	finally
    //   20260	20266	3	finally
    //   20260	20266	3	finally
    //   20260	20266	20259	java/lang/IllegalArgumentException
    //   20331	20338	20338	finally
    //   20331	20338	20331	java/lang/EnumConstantNotPresentException
    //   20332	20338	20331	finally
    //   20332	20338	3	finally
    //   20332	20338	20331	java/util/NoSuchElementException
    //   20403	20410	20410	finally
    //   20403	20410	20410	java/lang/ArrayIndexOutOfBoundsException
    //   20403	20410	3	java/util/NoSuchElementException
    //   20403	20410	20410	java/lang/RuntimeException
    //   20404	20410	20403	finally
    //   20483	20490	20490	finally
    //   20483	20490	3	finally
    //   20484	20490	3	finally
    //   20484	20490	20490	finally
    //   20484	20490	20483	java/lang/AssertionError
    //   20683	20690	20690	finally
    //   20683	20690	20690	java/lang/NullPointerException
    //   20683	20690	20683	finally
    //   20683	20690	20683	java/lang/IllegalStateException
    //   20684	20690	20683	finally
    //   20759	20766	20766	finally
    //   20759	20766	3	finally
    //   20759	20766	20766	java/lang/UnsupportedOperationException
    //   20760	20766	20759	finally
    //   20760	20766	3	finally
    //   21191	21198	21198	finally
    //   21191	21198	21191	finally
    //   21191	21198	3	java/lang/IllegalArgumentException
    //   21191	21198	21191	java/util/NoSuchElementException
    //   21192	21198	3	java/lang/EnumConstantNotPresentException
    //   21267	21274	21274	finally
    //   21267	21274	21274	finally
    //   21267	21274	21267	finally
    //   21267	21274	21274	java/util/ConcurrentModificationException
    //   21268	21274	21274	java/lang/ClassCastException
    //   21464	21470	21470	finally
    //   21464	21470	3	finally
    //   21464	21470	21470	java/lang/UnsupportedOperationException
    //   21464	21470	3	finally
    //   21464	21470	3	java/lang/UnsupportedOperationException
    //   21539	21546	21546	finally
    //   21539	21546	21546	finally
    //   21539	21546	3	finally
    //   21539	21546	21539	finally
    //   21540	21546	21539	java/lang/ArithmeticException
    //   21743	21750	21750	finally
    //   21743	21750	21743	finally
    //   21743	21750	3	finally
    //   21744	21750	21743	java/lang/AssertionError
    //   21744	21750	21743	finally
    //   21943	21950	21950	finally
    //   21943	21950	3	java/lang/NumberFormatException
    //   21944	21950	21950	java/lang/IllegalArgumentException
    //   21944	21950	21943	finally
    //   21944	21950	21950	finally
    //   22019	22026	22026	finally
    //   22019	22026	3	java/lang/IllegalArgumentException
    //   22019	22026	3	java/lang/NumberFormatException
    //   22019	22026	22019	java/lang/RuntimeException
    //   22020	22026	22019	finally
    //   22451	22458	22458	finally
    //   22451	22458	3	finally
    //   22452	22458	22451	java/lang/AssertionError
    //   22452	22458	22451	finally
    //   22452	22458	3	java/lang/StringIndexOutOfBoundsException
    //   22527	22534	22534	finally
    //   22528	22534	3	finally
    //   22528	22534	22534	java/lang/IllegalStateException
    //   22528	22534	22527	java/lang/UnsupportedOperationException
    //   22528	22534	22527	finally
    //   22723	22730	22730	finally
    //   22723	22730	22730	finally
    //   22724	22730	22723	java/lang/EnumConstantNotPresentException
    //   22724	22730	22723	finally
    //   22724	22730	22723	finally
    //   22800	22806	22806	finally
    //   22800	22806	22806	finally
    //   22800	22806	3	finally
    //   22800	22806	3	java/lang/NullPointerException
    //   22800	22806	3	java/util/ConcurrentModificationException
    //   23003	23010	23010	finally
    //   23003	23010	23010	java/lang/StringIndexOutOfBoundsException
    //   23003	23010	23003	java/lang/IllegalArgumentException
    //   23003	23010	23010	finally
    //   23004	23010	23003	java/lang/IndexOutOfBoundsException
    //   23203	23210	23210	finally
    //   23203	23210	3	java/lang/ArithmeticException
    //   23203	23210	23203	java/lang/NullPointerException
    //   23204	23210	3	java/lang/IllegalArgumentException
    //   23204	23210	3	java/lang/AssertionError
    //   23280	23286	23286	finally
    //   23280	23286	3	finally
    //   23280	23286	3	java/lang/NegativeArraySizeException
    //   23280	23286	23286	java/lang/NumberFormatException
    //   23280	23286	3	java/lang/UnsupportedOperationException
    //   23716	23722	23722	finally
    //   23716	23722	23722	finally
    //   23716	23722	3	java/lang/IndexOutOfBoundsException
    //   23716	23722	3	java/lang/StringIndexOutOfBoundsException
    //   23716	23722	3	java/lang/IndexOutOfBoundsException
    //   23791	23798	23798	finally
    //   23791	23798	23791	java/util/ConcurrentModificationException
    //   23791	23798	3	finally
    //   23792	23798	23791	finally
    //   23792	23798	23798	java/lang/RuntimeException
    //   23987	23994	23994	finally
    //   23987	23994	23987	java/lang/IllegalStateException
    //   23987	23994	23987	java/lang/StringIndexOutOfBoundsException
    //   23988	23994	23994	finally
    //   23988	23994	23994	finally
    //   24063	24070	24070	finally
    //   24063	24070	24063	finally
    //   24063	24070	24063	java/lang/EnumConstantNotPresentException
    //   24063	24070	24070	finally
    //   24064	24070	24063	finally
    //   24267	24274	24274	finally
    //   24267	24274	24274	finally
    //   24267	24274	24267	finally
    //   24268	24274	24267	java/util/ConcurrentModificationException
    //   24268	24274	24267	finally
    //   24467	24474	24474	finally
    //   24467	24474	24474	java/lang/NegativeArraySizeException
    //   24467	24474	24474	finally
    //   24468	24474	24467	java/lang/ArithmeticException
    //   24468	24474	24474	java/lang/AssertionError
    //   24543	24550	24550	finally
    //   24543	24550	24543	finally
    //   24543	24550	24543	finally
    //   24544	24550	24543	java/util/NoSuchElementException
    //   24544	24550	24550	java/lang/ClassCastException
    //   24979	24986	24986	finally
    //   24979	24986	24986	java/lang/IllegalArgumentException
    //   24980	24986	24986	java/lang/IndexOutOfBoundsException
    //   24980	24986	24979	finally
    //   24980	24986	3	finally
    //   25055	25062	25062	finally
    //   25055	25062	25055	java/lang/NumberFormatException
    //   25055	25062	3	java/lang/StringIndexOutOfBoundsException
    //   25055	25062	3	java/lang/NumberFormatException
    //   25056	25062	25062	java/lang/ArrayIndexOutOfBoundsException
    //   25252	25258	25258	finally
    //   25252	25258	3	finally
    //   25252	25258	3	java/lang/NegativeArraySizeException
    //   25252	25258	25258	finally
    //   25252	25258	3	java/lang/AssertionError
    //   25327	25334	25334	finally
    //   25327	25334	3	java/lang/NumberFormatException
    //   25327	25334	25327	java/util/ConcurrentModificationException
    //   25328	25334	3	java/lang/NullPointerException
    //   25328	25334	3	java/lang/ArrayIndexOutOfBoundsException
    //   25531	25538	25538	finally
    //   25531	25538	3	java/lang/RuntimeException
    //   25531	25538	3	finally
    //   25531	25538	25531	java/lang/IllegalArgumentException
    //   25532	25538	25538	finally
    //   25731	25738	25738	finally
    //   25731	25738	3	finally
    //   25731	25738	25731	finally
    //   25731	25738	25738	java/lang/ArithmeticException
    //   25732	25738	25731	java/lang/ArithmeticException
    //   25807	25814	25814	finally
    //   25807	25814	25807	java/lang/AssertionError
    //   25807	25814	25814	java/lang/ArithmeticException
    //   25808	25814	3	java/lang/NegativeArraySizeException
    //   25808	25814	3	finally
    //   26243	26250	26250	finally
    //   26243	26250	26250	finally
    //   26243	26250	3	java/lang/ClassCastException
    //   26243	26250	26243	finally
    //   26244	26250	26250	java/util/NoSuchElementException
    //   26319	26326	26326	finally
    //   26319	26326	26319	java/lang/RuntimeException
    //   26319	26326	3	finally
    //   26320	26326	3	java/lang/IllegalStateException
    //   26320	26326	26326	java/lang/NegativeArraySizeException
    //   26515	26522	26522	finally
    //   26515	26522	3	finally
    //   26516	26522	3	finally
    //   26516	26522	26522	java/lang/IllegalArgumentException
    //   26516	26522	26515	java/lang/ArrayIndexOutOfBoundsException
    //   26591	26598	26598	finally
    //   26591	26598	26598	finally
    //   26591	26598	26591	finally
    //   26592	26598	26591	finally
    //   26592	26598	3	finally
    //   26796	26802	26802	finally
    //   26796	26802	3	java/lang/ArithmeticException
    //   26796	26802	26802	finally
    //   26796	26802	3	java/lang/AssertionError
    //   26796	26802	26802	finally
    //   27143	27150	27150	finally
    //   27143	27150	27150	java/lang/ArrayIndexOutOfBoundsException
    //   27143	27150	3	java/lang/NegativeArraySizeException
    //   27144	27150	27143	finally
    //   27144	27150	27150	finally
    //   27219	27226	27226	finally
    //   27219	27226	27219	java/util/ConcurrentModificationException
    //   27219	27226	27226	java/lang/NegativeArraySizeException
    //   27220	27226	27219	finally
    //   27220	27226	27219	finally
    //   27655	27662	27662	finally
    //   27655	27662	3	finally
    //   27655	27662	27662	java/lang/ArrayIndexOutOfBoundsException
    //   27655	27662	27655	finally
    //   27656	27662	27662	finally
    //   27731	27738	27738	finally
    //   27731	27738	27738	finally
    //   27731	27738	27738	java/lang/ArithmeticException
    //   27732	27738	27731	java/lang/StringIndexOutOfBoundsException
    //   27732	27738	3	finally
    //   27927	27934	27934	finally
    //   27927	27934	3	java/lang/NegativeArraySizeException
    //   27927	27934	27934	finally
    //   27927	27934	27934	finally
    //   27928	27934	27927	java/lang/StringIndexOutOfBoundsException
    //   28003	28010	28010	finally
    //   28003	28010	3	finally
    //   28003	28010	3	java/lang/ArithmeticException
    //   28003	28010	28003	java/lang/NullPointerException
    //   28004	28010	28010	java/util/ConcurrentModificationException
    //   28208	28214	28214	finally
    //   28208	28214	28214	finally
    //   28208	28214	28214	java/util/NoSuchElementException
    //   28208	28214	3	java/lang/NullPointerException
    //   28208	28214	28214	java/lang/NullPointerException
    //   28407	28414	28414	finally
    //   28407	28414	28407	java/util/NoSuchElementException
    //   28408	28414	3	java/lang/NumberFormatException
    //   28408	28414	3	finally
    //   28408	28414	28414	java/lang/IllegalArgumentException
    //   28483	28490	28490	finally
    //   28483	28490	28490	java/lang/ClassCastException
    //   28483	28490	3	java/lang/NumberFormatException
    //   28483	28490	28483	finally
    //   28484	28490	28483	java/util/NoSuchElementException
    //   28919	28926	28926	finally
    //   28919	28926	3	finally
    //   28919	28926	28919	finally
    //   28920	28926	3	finally
    //   28920	28926	28926	java/lang/IllegalStateException
    //   28995	29002	29002	finally
    //   28995	29002	29002	finally
    //   28995	29002	29002	finally
    //   28996	29002	28995	java/lang/AssertionError
    //   28996	29002	3	java/lang/NullPointerException
    //   29191	29198	29198	finally
    //   29191	29198	29191	java/lang/UnsupportedOperationException
    //   29191	29198	29191	finally
    //   29191	29198	3	finally
    //   29192	29198	29198	java/lang/ClassCastException
    //   29267	29274	29274	finally
    //   29267	29274	29267	java/lang/IllegalArgumentException
    //   29268	29274	29267	java/lang/NullPointerException
    //   29268	29274	29274	java/util/NoSuchElementException
    //   29268	29274	3	java/util/ConcurrentModificationException
    //   29472	29478	29478	finally
    //   29472	29478	29478	finally
    //   29472	29478	29478	java/lang/NullPointerException
    //   29472	29478	3	java/lang/UnsupportedOperationException
    //   29472	29478	29478	java/lang/StringIndexOutOfBoundsException
    //   29672	29678	29678	finally
    //   29672	29678	3	finally
    //   29672	29678	3	finally
    //   29672	29678	3	java/lang/EnumConstantNotPresentException
    //   29672	29678	3	finally
    //   29748	29754	29754	finally
    //   29748	29754	3	finally
    //   29748	29754	29754	java/lang/ArithmeticException
    //   29748	29754	3	java/lang/IllegalStateException
    //   29748	29754	29754	java/lang/IllegalStateException
    //   30184	30190	30190	finally
    //   30184	30190	3	java/util/ConcurrentModificationException
    //   30184	30190	3	finally
    //   30184	30190	3	finally
    //   30184	30190	30190	java/lang/IndexOutOfBoundsException
    //   30259	30266	30266	finally
    //   30259	30266	3	java/lang/IllegalStateException
    //   30260	30266	30259	java/util/ConcurrentModificationException
    //   30260	30266	30259	finally
    //   30260	30266	3	finally
    //   30455	30462	30462	finally
    //   30455	30462	30462	java/lang/IndexOutOfBoundsException
    //   30455	30462	30455	finally
    //   30455	30462	30462	finally
    //   30455	30462	30462	java/lang/ArrayIndexOutOfBoundsException
    //   30531	30538	30538	finally
    //   30532	30538	30531	finally
    //   30532	30538	30531	finally
    //   30532	30538	3	finally
    //   30532	30538	3	java/lang/StringIndexOutOfBoundsException
    //   30735	30742	30742	finally
    //   30735	30742	30735	java/lang/AssertionError
    //   30736	30742	30735	finally
    //   30736	30742	3	java/lang/IndexOutOfBoundsException
    //   30736	30742	30735	finally
    //   31620	31628	31620	finally
    //   31636	31638	3	java/lang/ArithmeticException
  }
  
  public boolean lambda$new$2(Object paramObject) {
    return Perry1.1T(this, (int)37165359L ^ 0x89DB6F3, paramObject);
  }
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.25(this, (int)-1771008911L ^ 0xFE2E3601, paramObject);
  }
  
  public boolean lambda$new$11(Object paramObject) {
    return Perry1.1C(this, (int)1814403116L ^ 0x5BE83280, paramObject);
  }
  
  public boolean lambda$new$5(Object paramObject) {
    return Perry1.1M(this, (int)1462344576L ^ 0x23744C1F, paramObject);
  }
  
  public static boolean lambda$onRender2D$17(ItemStack paramItemStack) {
    return Perry1.0s(null, (int)1612721821L ^ 0x6FC82339, paramItemStack);
  }
  
  public boolean lambda$new$13(Object paramObject) {
    return Perry1.1Y(this, (int)1494272912L ^ 0x6403D8C5, paramObject);
  }
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.1T(this, (int)-1535363300L ^ 0xAED698C3, paramObject);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.27(this, (int)-498559058L ^ 0xC37D8F67, paramObject);
  }
  
  public boolean lambda$new$14(Object paramObject) {
    return Perry1.23(this, (int)-878672721L ^ 0xA79082D1, paramObject);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Info.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */