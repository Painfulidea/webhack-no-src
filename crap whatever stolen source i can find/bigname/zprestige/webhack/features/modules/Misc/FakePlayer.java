package bigname.zprestige.webhack.features.modules.Misc;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.client.entity.EntityOtherPlayerMP;

public class FakePlayer extends Module {
  public static FakePlayer INSTANCE;
  
  public int entityId;
  
  public String name;
  
  public Setting<Boolean> copyInv;
  
  public EntityOtherPlayerMP _fakePlayer;
  
  public void onEnable() {
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
  
  public void setInstance() {
    Perry1.3T(this, (int)1561050759L ^ 0x76A4BC85);
  }
  
  public FakePlayer() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -888250183
    //   9: l2i
    //   10: ldc_w 770025935
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -164335141
    //   20: l2i
    //   21: ldc_w 661819279
    //   24: ixor
    //   25: ldc2_w -1177124759
    //   28: l2i
    //   29: ldc_w -876369575
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 1596, -1795235770 -> 17, -1554786460 -> 60
    //   60: aload_0
    //   61: ldc_w 'ᕝ㌜ᔏ㶀ꋍ﯍๑棇蹠︽궝਴?煳'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -456776565
    //   73: l2i
    //   74: ldc_w 1686378173
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -361378758
    //   84: l2i
    //   85: ldc_w 357401456
    //   88: ixor
    //   89: ldc2_w 1322654042
    //   92: l2i
    //   93: ldc_w 1114605084
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 1604, -1929663120 -> 81, -209596404 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: getstatic Perryc.1 : I
    //   130: ifeq -> 144
    //   133: ldc2_w 40432958
    //   136: l2i
    //   137: ldc_w -1211910098
    //   140: ixor
    //   141: goto -> 152
    //   144: ldc2_w -779197153
    //   147: l2i
    //   148: ldc_w 749823686
    //   151: ixor
    //   152: ldc2_w 1531019656
    //   155: l2i
    //   156: ldc_w 1469755308
    //   159: ixor
    //   160: ixor
    //   161: lookupswitch default -> 188, -1183816908 -> 1602, 1289080796 -> 144
    //   188: putfield name : Ljava/lang/String;
    //   191: getstatic Perryc.0 : I
    //   194: ifle -> 208
    //   197: ldc2_w -705392759
    //   200: l2i
    //   201: ldc_w 78480127
    //   204: ixor
    //   205: goto -> 216
    //   208: ldc2_w -138015271
    //   211: l2i
    //   212: ldc_w 1886578900
    //   215: ixor
    //   216: ldc2_w -1247861133
    //   219: l2i
    //   220: ldc_w -192079714
    //   223: ixor
    //   224: ixor
    //   225: lookupswitch default -> 1614, -1874119781 -> 208, -962143264 -> 252
    //   252: aload_0
    //   253: ldc2_w 10430371
    //   256: l2i
    //   257: ldc_w -10429953
    //   260: ixor
    //   261: getstatic Perryc.0 : I
    //   264: ifle -> 278
    //   267: ldc2_w 1552775700
    //   270: l2i
    //   271: ldc_w -1860935966
    //   274: ixor
    //   275: goto -> 286
    //   278: ldc2_w -1804230223
    //   281: l2i
    //   282: ldc_w -975822033
    //   285: ixor
    //   286: ldc2_w 22242796
    //   289: l2i
    //   290: ldc_w -1891399751
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 1598, -541892405 -> 320, 1133102755 -> 278
    //   320: putfield entityId : I
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 340
    //   329: ldc2_w -850799730
    //   332: l2i
    //   333: ldc_w 1717744780
    //   336: ixor
    //   337: goto -> 348
    //   340: ldc2_w -66078061
    //   343: l2i
    //   344: ldc_w -148090394
    //   347: ixor
    //   348: ldc2_w 1266992159
    //   351: l2i
    //   352: ldc_w -762169820
    //   355: ixor
    //   356: ixor
    //   357: lookupswitch default -> 1592, -1842013874 -> 384, 842896697 -> 340
    //   384: aload_0
    //   385: ldc_w 'ᕕ㌒ᔊ㶲ꋸ﯃๸棟蹦︤'
    //   388: getstatic Perryc.c : I
    //   391: iflt -> 405
    //   394: ldc2_w -1817295912
    //   397: l2i
    //   398: ldc_w 1294268567
    //   401: ixor
    //   402: goto -> 413
    //   405: ldc2_w 1767211281
    //   408: l2i
    //   409: ldc_w 131558279
    //   412: ixor
    //   413: ldc2_w 672361192
    //   416: l2i
    //   417: ldc_w 1689637658
    //   420: ixor
    //   421: ixor
    //   422: lookupswitch default -> 448, -1962098387 -> 405, -1842609475 -> 1584
    //   448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   451: ldc_w 'ᕀ㌃ᔀ㶠ꋆﯜู棇踣︐궩ਬ?煑竌蠗辆쵣ꝼ뾠骞侾￮䛾ﴊ䅋ᣝ끼⥜焱瀳'
    //   454: getstatic Perryc.0 : I
    //   457: ifle -> 471
    //   460: ldc2_w 1398602372
    //   463: l2i
    //   464: ldc_w -1573870541
    //   467: ixor
    //   468: goto -> 479
    //   471: ldc2_w -783957063
    //   474: l2i
    //   475: ldc_w 2013370587
    //   478: ixor
    //   479: ldc2_w 402777038
    //   482: l2i
    //   483: ldc_w 1391225169
    //   486: ixor
    //   487: ixor
    //   488: lookupswitch default -> 516, -1149119448 -> 1622, -419047838 -> 471
    //   516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   519: getstatic Perryc.c : I
    //   522: iflt -> 536
    //   525: ldc2_w 1006364521
    //   528: l2i
    //   529: ldc_w -1863543980
    //   532: ixor
    //   533: goto -> 544
    //   536: ldc2_w -1918654172
    //   539: l2i
    //   540: ldc_w 1660148989
    //   543: ixor
    //   544: ldc2_w 1671652620
    //   547: l2i
    //   548: ldc_w -1278897956
    //   551: ixor
    //   552: ixor
    //   553: lookupswitch default -> 1608, 1060536329 -> 580, 2071036397 -> 536
    //   580: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MISC : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   583: ldc2_w -234246802
    //   586: l2i
    //   587: ldc_w -234246802
    //   590: ixor
    //   591: ldc2_w -832942457
    //   594: l2i
    //   595: ldc_w -832942457
    //   598: ixor
    //   599: ldc2_w 1708955965
    //   602: l2i
    //   603: ldc_w 1708955965
    //   606: ixor
    //   607: getstatic Perryc.c : I
    //   610: iflt -> 624
    //   613: ldc2_w -38441958
    //   616: l2i
    //   617: ldc_w 1780336375
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -542132383
    //   627: l2i
    //   628: ldc_w -1411298819
    //   631: ixor
    //   632: ldc2_w -1801696670
    //   635: l2i
    //   636: ldc_w 274464557
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, -808946790 -> 624, 326049698 -> 1600
    //   668: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   671: getstatic Perryc.0 : I
    //   674: ifle -> 688
    //   677: ldc2_w -491559434
    //   680: l2i
    //   681: ldc_w -444071668
    //   684: ixor
    //   685: goto -> 696
    //   688: ldc2_w 1875735828
    //   691: l2i
    //   692: ldc_w -1675680108
    //   695: ixor
    //   696: ldc2_w 1612458989
    //   699: l2i
    //   700: ldc_w -2140340619
    //   703: ixor
    //   704: ixor
    //   705: lookupswitch default -> 1618, -414469790 -> 688, 329418264 -> 732
    //   732: aload_0
    //   733: ldc_w 'ᕝ㌜ᔏ㶀ꋍ﯍๑棇蹠︽궝਴?煳'
    //   736: getstatic Perryc.1 : I
    //   739: ifeq -> 753
    //   742: ldc2_w 1058340120
    //   745: l2i
    //   746: ldc_w 424713707
    //   749: ixor
    //   750: goto -> 761
    //   753: ldc2_w 311524872
    //   756: l2i
    //   757: ldc_w -1711779497
    //   760: ixor
    //   761: ldc2_w 1359709177
    //   764: l2i
    //   765: ldc_w 935335787
    //   768: ixor
    //   769: ixor
    //   770: lookupswitch default -> 1594, -308102195 -> 796, 1083176033 -> 753
    //   796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   799: getstatic Perryc.0 : I
    //   802: ifle -> 816
    //   805: ldc2_w -873597743
    //   808: l2i
    //   809: ldc_w 1814236062
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w 1883440895
    //   819: l2i
    //   820: ldc_w -2066505444
    //   823: ixor
    //   824: ldc2_w 1042338787
    //   827: l2i
    //   828: ldc_w -1475382055
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 1616, 836851829 -> 816, 1656684761 -> 860
    //   860: putfield name : Ljava/lang/String;
    //   863: getstatic Perryc.c : I
    //   866: iflt -> 880
    //   869: ldc2_w 1245320597
    //   872: l2i
    //   873: ldc_w 1703988245
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w 1112965554
    //   883: l2i
    //   884: ldc_w -138820212
    //   887: ixor
    //   888: ldc2_w -1798187020
    //   891: l2i
    //   892: ldc_w 878136270
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 924, -1892923974 -> 1590, 132004563 -> 880
    //   924: aload_0
    //   925: getstatic Perryc.c : I
    //   928: iflt -> 942
    //   931: ldc2_w 522242425
    //   934: l2i
    //   935: ldc_w -457797867
    //   938: ixor
    //   939: goto -> 950
    //   942: ldc2_w -1530928188
    //   945: l2i
    //   946: ldc_w 1474687628
    //   949: ixor
    //   950: ldc2_w 1563748790
    //   953: l2i
    //   954: ldc_w 1217606172
    //   957: ixor
    //   958: ixor
    //   959: lookupswitch default -> 984, -298738234 -> 1580, 81127503 -> 942
    //   984: aload_0
    //   985: new bigname/zprestige/webhack/features/setting/Setting
    //   988: dup
    //   989: ldc_w 'ᕐ㌜ᔑ㶮ꊈﯦ๷棐蹦︸궼ਨ?煸'
    //   992: getstatic Perryc.c : I
    //   995: iflt -> 1009
    //   998: ldc2_w -2024798389
    //   1001: l2i
    //   1002: ldc_w 230923658
    //   1005: ixor
    //   1006: goto -> 1017
    //   1009: ldc2_w 400248690
    //   1012: l2i
    //   1013: ldc_w -23414218
    //   1016: ixor
    //   1017: ldc2_w 2086643622
    //   1020: l2i
    //   1021: ldc_w -1308036206
    //   1024: ixor
    //   1025: ixor
    //   1026: lookupswitch default -> 1610, 655794544 -> 1052, 1153748725 -> 1009
    //   1052: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1055: ldc2_w -1046372026
    //   1058: l2i
    //   1059: ldc_w -1046372025
    //   1062: ixor
    //   1063: getstatic Perryc.1 : I
    //   1066: ifeq -> 1080
    //   1069: ldc2_w -794167571
    //   1072: l2i
    //   1073: ldc_w 544431347
    //   1076: ixor
    //   1077: goto -> 1088
    //   1080: ldc2_w -1225753745
    //   1083: l2i
    //   1084: ldc_w 324713239
    //   1087: ixor
    //   1088: ldc2_w -50099307
    //   1091: l2i
    //   1092: ldc_w -1251938976
    //   1095: ixor
    //   1096: ixor
    //   1097: lookupswitch default -> 1124, -1195782933 -> 1620, -773097210 -> 1080
    //   1124: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1127: getstatic Perryc.0 : I
    //   1130: ifle -> 1144
    //   1133: ldc2_w 1026422891
    //   1136: l2i
    //   1137: ldc_w -310271298
    //   1140: ixor
    //   1141: goto -> 1152
    //   1144: ldc2_w -1650263642
    //   1147: l2i
    //   1148: ldc_w -1568168308
    //   1151: ixor
    //   1152: ldc2_w 104617952
    //   1155: l2i
    //   1156: ldc_w -981354227
    //   1159: ixor
    //   1160: ixor
    //   1161: lookupswitch default -> 1188, 319927352 -> 1576, 1070900780 -> 1144
    //   1188: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1191: getstatic Perryc.1 : I
    //   1194: ifeq -> 1208
    //   1197: ldc2_w 136239777
    //   1200: l2i
    //   1201: ldc_w 54339646
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w 1680990983
    //   1211: l2i
    //   1212: ldc_w -1787026732
    //   1215: ixor
    //   1216: ldc2_w -291232957
    //   1219: l2i
    //   1220: ldc_w 109296035
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1586, -486250369 -> 1208, 426400563 -> 1252
    //   1252: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1255: getstatic Perryc.0 : I
    //   1258: ifle -> 1272
    //   1261: ldc2_w 2113825623
    //   1264: l2i
    //   1265: ldc_w 1176371690
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w -1982369861
    //   1275: l2i
    //   1276: ldc_w -100481202
    //   1279: ixor
    //   1280: ldc2_w 1894096597
    //   1283: l2i
    //   1284: ldc_w -2002838435
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 1606, -1951454595 -> 1316, -1013258187 -> 1272
    //   1316: putfield copyInv : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1319: getstatic Perryc.0 : I
    //   1322: ifle -> 1336
    //   1325: ldc2_w -663210982
    //   1328: l2i
    //   1329: ldc_w -250385680
    //   1332: ixor
    //   1333: goto -> 1344
    //   1336: ldc2_w -1995279213
    //   1339: l2i
    //   1340: ldc_w 938628684
    //   1343: ixor
    //   1344: ldc2_w -311939639
    //   1347: l2i
    //   1348: ldc_w -676605603
    //   1351: ixor
    //   1352: ixor
    //   1353: lookupswitch default -> 1582, -2078024117 -> 1380, 329818750 -> 1336
    //   1380: aload_0
    //   1381: ldc2_w -1717792534
    //   1384: l2i
    //   1385: ldc_w 1717792438
    //   1388: ixor
    //   1389: getstatic Perryc.0 : I
    //   1392: ifle -> 1406
    //   1395: ldc2_w 1860605707
    //   1398: l2i
    //   1399: ldc_w 1379793002
    //   1402: ixor
    //   1403: goto -> 1414
    //   1406: ldc2_w -1035459117
    //   1409: l2i
    //   1410: ldc_w -509904223
    //   1413: ixor
    //   1414: ldc2_w -636659294
    //   1417: l2i
    //   1418: ldc_w -902447030
    //   1421: ixor
    //   1422: ixor
    //   1423: lookupswitch default -> 1448, 250362603 -> 1406, 753137289 -> 1588
    //   1448: putfield entityId : I
    //   1451: getstatic Perryc.0 : I
    //   1454: ifle -> 1468
    //   1457: ldc2_w -1425906573
    //   1460: l2i
    //   1461: ldc_w -99600291
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w 493100273
    //   1471: l2i
    //   1472: ldc_w 2100411484
    //   1475: ixor
    //   1476: ldc2_w 1585324732
    //   1479: l2i
    //   1480: ldc_w -964905865
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 1512, -921646363 -> 1612, 1876239166 -> 1468
    //   1512: aload_0
    //   1513: getstatic Perryc.1 : I
    //   1516: ifeq -> 1530
    //   1519: ldc2_w -776122525
    //   1522: l2i
    //   1523: ldc_w -2039813042
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w 519668190
    //   1533: l2i
    //   1534: ldc_w 1055218278
    //   1537: ixor
    //   1538: ldc2_w 702321384
    //   1541: l2i
    //   1542: ldc_w 377155687
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 1572, -283956919 -> 1530, 1752285602 -> 1578
    //   1572: invokespecial setInstance : ()V
    //   1575: return
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
    //   1618: aconst_null
    //   1619: athrow
    //   1620: aconst_null
    //   1621: athrow
    //   1622: aconst_null
    //   1623: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   323	1253	0	this	Lbigname/zprestige/webhack/features/modules/Misc/FakePlayer;
  }
  
  public static FakePlayer getInstance() {
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
  
  public void onDisable() {
    Perry1.3k(this, (int)-310859975L ^ 0xF53BF87F);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Misc/FakePlayer
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 21
    //   10: ldc2_w -1620064407
    //   13: l2i
    //   14: ldc_w -834584527
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w 1633104786
    //   24: l2i
    //   25: ldc_w 1803768963
    //   28: ixor
    //   29: ldc2_w 878435279
    //   32: l2i
    //   33: ldc_w 23970425
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 134, 1071808167 -> 64, 1679335150 -> 21
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w -670737436
    //   76: l2i
    //   77: ldc_w -234304641
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -624771523
    //   87: l2i
    //   88: ldc_w -1216382988
    //   91: ixor
    //   92: ldc2_w 2086506760
    //   95: l2i
    //   96: ldc_w 479219805
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -936524117 -> 84, 1254117838 -> 132
    //   128: putstatic bigname/zprestige/webhack/features/modules/Misc/FakePlayer.INSTANCE : Lbigname/zprestige/webhack/features/modules/Misc/FakePlayer;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Misc\FakePlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */