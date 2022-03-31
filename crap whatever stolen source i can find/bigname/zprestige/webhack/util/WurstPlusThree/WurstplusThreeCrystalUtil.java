package bigname.zprestige.webhack.util.WurstPlusThree;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.util.Globals;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;

public class WurstplusThreeCrystalUtil implements Globals {
  public WurstplusThreeCrystalUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1675642096
    //   9: l2i
    //   10: ldc -973936143
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1578732035
    //   19: l2i
    //   20: ldc 261708361
    //   22: ixor
    //   23: ldc2_w 1117977194
    //   26: l2i
    //   27: ldc 1813841968
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 120, -2134843922 -> 56, -2001903781 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -2145935940
    //   66: l2i
    //   67: ldc -1878413001
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -258346853
    //   76: l2i
    //   77: ldc 467326648
    //   79: ixor
    //   80: ldc2_w 2035907106
    //   83: l2i
    //   84: ldc 2128211073
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -322719616 -> 116, 396278312 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil;
  }
  
  public static boolean rayTraceSolidCheck(Vec3d start, Vec3d end, boolean shouldIgnore) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 19278
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 19270
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 19262
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -407461182
    //   33: l2i
    //   34: ldc 350983927
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1533222231
    //   43: l2i
    //   44: ldc -240652033
    //   46: ixor
    //   47: ldc2_w 950055201
    //   50: l2i
    //   51: ldc -1997561648
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 19087, 445381721 -> 80, 1125262788 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w -1529493228
    //   90: l2i
    //   91: ldc 1824527764
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1458223672
    //   100: l2i
    //   101: ldc -232118855
    //   103: ixor
    //   104: ldc2_w 889385991
    //   107: l2i
    //   108: ldc -1189983770
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 19137, -684728944 -> 140, 1141203297 -> 97
    //   140: getfield field_72450_a : D
    //   143: getstatic Perryc.c : I
    //   146: iflt -> 159
    //   149: ldc2_w -646456517
    //   152: l2i
    //   153: ldc -1852174433
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1826197392
    //   162: l2i
    //   163: ldc 1638342737
    //   165: ixor
    //   166: ldc2_w 1031678061
    //   169: l2i
    //   170: ldc 920152929
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 18751, -114879699 -> 200, 1129027496 -> 159
    //   200: goto -> 204
    //   203: athrow
    //   204: invokestatic isNaN : (D)Z
    //   207: goto -> 211
    //   210: athrow
    //   211: ifne -> 224
    //   214: ldc2_w 981708721
    //   217: l2i
    //   218: ldc -807960089
    //   220: ixor
    //   221: goto -> 231
    //   224: ldc2_w -887769702
    //   227: l2i
    //   228: ldc 1044487117
    //   230: ixor
    //   231: ldc2_w 1313799611
    //   234: l2i
    //   235: ldc -1754182117
    //   237: ixor
    //   238: ixor
    //   239: tableswitch default -> 214, 745250294 -> 260, 745250295 -> 18740
    //   260: getstatic Perryc.c : I
    //   263: iflt -> 276
    //   266: ldc2_w 140576520
    //   269: l2i
    //   270: ldc -1214254254
    //   272: ixor
    //   273: goto -> 283
    //   276: ldc2_w -1094237606
    //   279: l2i
    //   280: ldc 1824860415
    //   282: ixor
    //   283: ldc2_w 1461441369
    //   286: l2i
    //   287: ldc -1442621123
    //   289: ixor
    //   290: ixor
    //   291: lookupswitch default -> 316, 1122401854 -> 19211, 1711590414 -> 276
    //   316: aload_0
    //   317: getstatic Perryc.c : I
    //   320: iflt -> 333
    //   323: ldc2_w -1722669339
    //   326: l2i
    //   327: ldc 1913931937
    //   329: ixor
    //   330: goto -> 340
    //   333: ldc2_w -323923891
    //   336: l2i
    //   337: ldc 1220599851
    //   339: ixor
    //   340: ldc2_w 663088911
    //   343: l2i
    //   344: ldc -714762550
    //   346: ixor
    //   347: ixor
    //   348: lookupswitch default -> 18841, 430315393 -> 333, 1452394915 -> 376
    //   376: getfield field_72448_b : D
    //   379: getstatic Perryc.0 : I
    //   382: ifle -> 395
    //   385: ldc2_w -1619240148
    //   388: l2i
    //   389: ldc 1395458026
    //   391: ixor
    //   392: goto -> 402
    //   395: ldc2_w -976143569
    //   398: l2i
    //   399: ldc -858037341
    //   401: ixor
    //   402: ldc2_w -1050028650
    //   405: l2i
    //   406: ldc -1819560010
    //   408: ixor
    //   409: ixor
    //   410: lookupswitch default -> 436, -1632450842 -> 19081, 556817316 -> 395
    //   436: goto -> 440
    //   439: athrow
    //   440: invokestatic isNaN : (D)Z
    //   443: goto -> 447
    //   446: athrow
    //   447: ifne -> 460
    //   450: ldc2_w -925676821
    //   453: l2i
    //   454: ldc -1428001124
    //   456: ixor
    //   457: goto -> 467
    //   460: ldc2_w 616748283
    //   463: l2i
    //   464: ldc 1190391949
    //   466: ixor
    //   467: ldc2_w 1747422112
    //   470: l2i
    //   471: ldc 1611177131
    //   473: ixor
    //   474: ixor
    //   475: tableswitch default -> 450, 1780364156 -> 496, 1780364157 -> 18740
    //   496: getstatic Perryc.c : I
    //   499: iflt -> 512
    //   502: ldc2_w -1400694051
    //   505: l2i
    //   506: ldc -1346546233
    //   508: ixor
    //   509: goto -> 519
    //   512: ldc2_w -912561181
    //   515: l2i
    //   516: ldc -1984694813
    //   518: ixor
    //   519: ldc2_w -1908512995
    //   522: l2i
    //   523: ldc 601982512
    //   525: ixor
    //   526: ixor
    //   527: lookupswitch default -> 18803, -1360941513 -> 512, -302547155 -> 552
    //   552: aload_0
    //   553: getstatic Perryc.c : I
    //   556: iflt -> 569
    //   559: ldc2_w 254372912
    //   562: l2i
    //   563: ldc -857172957
    //   565: ixor
    //   566: goto -> 576
    //   569: ldc2_w 1150673084
    //   572: l2i
    //   573: ldc 1498357669
    //   575: ixor
    //   576: ldc2_w 473768454
    //   579: l2i
    //   580: ldc 1145780476
    //   582: ixor
    //   583: ixor
    //   584: lookupswitch default -> 18893, -1682447639 -> 569, 1168958947 -> 612
    //   612: getfield field_72449_c : D
    //   615: getstatic Perryc.0 : I
    //   618: ifle -> 631
    //   621: ldc2_w 1869394416
    //   624: l2i
    //   625: ldc 1492631497
    //   627: ixor
    //   628: goto -> 638
    //   631: ldc2_w 699352389
    //   634: l2i
    //   635: ldc 1505941800
    //   637: ixor
    //   638: ldc2_w 25591161
    //   641: l2i
    //   642: ldc 548898587
    //   644: ixor
    //   645: ixor
    //   646: lookupswitch default -> 672, -562032111 -> 631, 380302427 -> 19159
    //   672: goto -> 676
    //   675: athrow
    //   676: invokestatic isNaN : (D)Z
    //   679: goto -> 683
    //   682: athrow
    //   683: ifne -> 696
    //   686: ldc2_w 532837096
    //   689: l2i
    //   690: ldc 1621057669
    //   692: ixor
    //   693: goto -> 703
    //   696: ldc2_w -1669314639
    //   699: l2i
    //   700: ldc -472033825
    //   702: ixor
    //   703: ldc2_w -1657495247
    //   706: l2i
    //   707: ldc -605735987
    //   709: ixor
    //   710: ixor
    //   711: tableswitch default -> 686, 965509265 -> 732, 965509266 -> 18740
    //   732: getstatic Perryc.0 : I
    //   735: ifle -> 748
    //   738: ldc2_w 1490802238
    //   741: l2i
    //   742: ldc -400153714
    //   744: ixor
    //   745: goto -> 755
    //   748: ldc2_w -1330850828
    //   751: l2i
    //   752: ldc -403315050
    //   754: ixor
    //   755: ldc2_w 1181935545
    //   758: l2i
    //   759: ldc 1742035489
    //   761: ixor
    //   762: ixor
    //   763: lookupswitch default -> 788, -1856354264 -> 18753, -1752977990 -> 748
    //   788: aload_1
    //   789: getstatic Perryc.c : I
    //   792: iflt -> 805
    //   795: ldc2_w 1941768083
    //   798: l2i
    //   799: ldc -1019117186
    //   801: ixor
    //   802: goto -> 812
    //   805: ldc2_w -1411584198
    //   808: l2i
    //   809: ldc -1674289966
    //   811: ixor
    //   812: ldc2_w 7955512
    //   815: l2i
    //   816: ldc 979842457
    //   818: ixor
    //   819: ixor
    //   820: lookupswitch default -> 848, -1964845236 -> 19001, -101801071 -> 805
    //   848: getfield field_72450_a : D
    //   851: getstatic Perryc.c : I
    //   854: iflt -> 867
    //   857: ldc2_w -923406796
    //   860: l2i
    //   861: ldc 1481958863
    //   863: ixor
    //   864: goto -> 874
    //   867: ldc2_w 935758406
    //   870: l2i
    //   871: ldc 628923216
    //   873: ixor
    //   874: ldc2_w 1460313087
    //   877: l2i
    //   878: ldc -757598818
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 908, 360474010 -> 19233, 1621814494 -> 867
    //   908: goto -> 912
    //   911: athrow
    //   912: invokestatic isNaN : (D)Z
    //   915: goto -> 919
    //   918: athrow
    //   919: ifne -> 932
    //   922: ldc2_w -1102743980
    //   925: l2i
    //   926: ldc 248546071
    //   928: ixor
    //   929: goto -> 939
    //   932: ldc2_w 916921263
    //   935: l2i
    //   936: ldc -2043482389
    //   938: ixor
    //   939: ldc2_w 1539015690
    //   942: l2i
    //   943: ldc -744064814
    //   945: ixor
    //   946: ixor
    //   947: tableswitch default -> 922, 948439451 -> 968, 948439452 -> 18740
    //   968: getstatic Perryc.1 : I
    //   971: ifeq -> 984
    //   974: ldc2_w 1038844560
    //   977: l2i
    //   978: ldc -1103095357
    //   980: ixor
    //   981: goto -> 991
    //   984: ldc2_w -1892754776
    //   987: l2i
    //   988: ldc 539653637
    //   990: ixor
    //   991: ldc2_w 2129934785
    //   994: l2i
    //   995: ldc -110849896
    //   997: ixor
    //   998: ixor
    //   999: lookupswitch default -> 1024, 70988298 -> 19225, 2009229434 -> 984
    //   1024: aload_1
    //   1025: getstatic Perryc.c : I
    //   1028: iflt -> 1041
    //   1031: ldc2_w -1764997998
    //   1034: l2i
    //   1035: ldc 232400567
    //   1037: ixor
    //   1038: goto -> 1048
    //   1041: ldc2_w -2083420656
    //   1044: l2i
    //   1045: ldc -770408395
    //   1047: ixor
    //   1048: ldc2_w -477760237
    //   1051: l2i
    //   1052: ldc_w -1171691279
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 1084, -1583502394 -> 1041, -1027932217 -> 18993
    //   1084: getfield field_72448_b : D
    //   1087: getstatic Perryc.c : I
    //   1090: iflt -> 1104
    //   1093: ldc2_w 555644746
    //   1096: l2i
    //   1097: ldc_w 1955548572
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w -16354572
    //   1107: l2i
    //   1108: ldc_w 888988347
    //   1111: ixor
    //   1112: ldc2_w 1280664282
    //   1115: l2i
    //   1116: ldc_w -60242793
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 1148, -441672549 -> 19161, 1331090055 -> 1104
    //   1148: goto -> 1152
    //   1151: athrow
    //   1152: invokestatic isNaN : (D)Z
    //   1155: goto -> 1159
    //   1158: athrow
    //   1159: ifne -> 1173
    //   1162: ldc2_w -1868132382
    //   1165: l2i
    //   1166: ldc_w -794067173
    //   1169: ixor
    //   1170: goto -> 1181
    //   1173: ldc2_w 100448429
    //   1176: l2i
    //   1177: ldc_w 1173440597
    //   1180: ixor
    //   1181: ldc2_w 1271302745
    //   1184: l2i
    //   1185: ldc_w -1919181186
    //   1188: ixor
    //   1189: ixor
    //   1190: tableswitch default -> 1162, -2041518882 -> 1212, -2041518881 -> 18740
    //   1212: getstatic Perryc.c : I
    //   1215: iflt -> 1229
    //   1218: ldc2_w 1945738913
    //   1221: l2i
    //   1222: ldc_w 839063922
    //   1225: ixor
    //   1226: goto -> 1237
    //   1229: ldc2_w 1239817629
    //   1232: l2i
    //   1233: ldc_w 1482656530
    //   1236: ixor
    //   1237: ldc2_w -1115749556
    //   1240: l2i
    //   1241: ldc_w -1305873844
    //   1244: ixor
    //   1245: ixor
    //   1246: lookupswitch default -> 19107, 519006095 -> 1272, 1319925459 -> 1229
    //   1272: aload_1
    //   1273: getstatic Perryc.c : I
    //   1276: iflt -> 1290
    //   1279: ldc2_w -1350075891
    //   1282: l2i
    //   1283: ldc_w -1408619722
    //   1286: ixor
    //   1287: goto -> 1298
    //   1290: ldc2_w -149636660
    //   1293: l2i
    //   1294: ldc_w 448324023
    //   1297: ixor
    //   1298: ldc2_w -1765946996
    //   1301: l2i
    //   1302: ldc_w 617254502
    //   1305: ixor
    //   1306: ixor
    //   1307: lookupswitch default -> 1332, -1309010223 -> 19051, 242922815 -> 1290
    //   1332: getfield field_72449_c : D
    //   1335: getstatic Perryc.1 : I
    //   1338: ifeq -> 1352
    //   1341: ldc2_w 113548645
    //   1344: l2i
    //   1345: ldc_w -1571254580
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w -1482375623
    //   1355: l2i
    //   1356: ldc_w -371476005
    //   1359: ixor
    //   1360: ldc2_w 253435148
    //   1363: l2i
    //   1364: ldc_w 1011755307
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 19141, -1748424818 -> 1352, 2099917765 -> 1396
    //   1396: goto -> 1400
    //   1399: athrow
    //   1400: invokestatic isNaN : (D)Z
    //   1403: goto -> 1407
    //   1406: athrow
    //   1407: ifne -> 1421
    //   1410: ldc2_w 642361000
    //   1413: l2i
    //   1414: ldc_w -42647897
    //   1417: ixor
    //   1418: goto -> 1429
    //   1421: ldc2_w -2121660080
    //   1424: l2i
    //   1425: ldc_w 1521914206
    //   1428: ixor
    //   1429: ldc2_w 13212684
    //   1432: l2i
    //   1433: ldc_w -1434911481
    //   1436: ixor
    //   1437: ixor
    //   1438: tableswitch default -> 1410, 1905129732 -> 1460, 1905129733 -> 18740
    //   1460: getstatic Perryc.c : I
    //   1463: iflt -> 1477
    //   1466: ldc2_w 280397361
    //   1469: l2i
    //   1470: ldc_w 93728778
    //   1473: ixor
    //   1474: goto -> 1485
    //   1477: ldc2_w 317930902
    //   1480: l2i
    //   1481: ldc_w 1943474322
    //   1484: ixor
    //   1485: ldc2_w 1432303375
    //   1488: l2i
    //   1489: ldc_w -230678234
    //   1492: ixor
    //   1493: ixor
    //   1494: lookupswitch default -> 1520, -1304453102 -> 19115, -379297432 -> 1477
    //   1520: aload_0
    //   1521: getstatic Perryc.1 : I
    //   1524: ifeq -> 1538
    //   1527: ldc2_w -12902179
    //   1530: l2i
    //   1531: ldc_w 1511905349
    //   1534: ixor
    //   1535: goto -> 1546
    //   1538: ldc2_w -1835161907
    //   1541: l2i
    //   1542: ldc_w -455390247
    //   1545: ixor
    //   1546: ldc2_w 742385631
    //   1549: l2i
    //   1550: ldc_w -1605408501
    //   1553: ixor
    //   1554: ixor
    //   1555: lookupswitch default -> 19125, -97098816 -> 1580, 693532236 -> 1538
    //   1580: getfield field_72450_a : D
    //   1583: getstatic Perryc.0 : I
    //   1586: ifle -> 1600
    //   1589: ldc2_w 2142457850
    //   1592: l2i
    //   1593: ldc_w -1922440210
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 1309030868
    //   1603: l2i
    //   1604: ldc_w 174614167
    //   1607: ixor
    //   1608: ldc2_w 348405266
    //   1611: l2i
    //   1612: ldc_w 79521242
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 19109, -492570660 -> 1600, 1410794635 -> 1644
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokestatic func_76128_c : (D)I
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: getstatic Perryc.c : I
    //   1658: iflt -> 1672
    //   1661: ldc2_w -692304286
    //   1664: l2i
    //   1665: ldc_w -771678327
    //   1668: ixor
    //   1669: goto -> 1680
    //   1672: ldc2_w 551541698
    //   1675: l2i
    //   1676: ldc_w 321324163
    //   1679: ixor
    //   1680: ldc2_w -1175144657
    //   1683: l2i
    //   1684: ldc_w 1527996261
    //   1687: ixor
    //   1688: ixor
    //   1689: lookupswitch default -> 1716, -430263903 -> 19019, 925515324 -> 1672
    //   1716: istore_3
    //   1717: getstatic Perryc.1 : I
    //   1720: ifeq -> 1734
    //   1723: ldc2_w -2035511675
    //   1726: l2i
    //   1727: ldc_w 53335229
    //   1730: ixor
    //   1731: goto -> 1742
    //   1734: ldc2_w 619722107
    //   1737: l2i
    //   1738: ldc_w 1280677526
    //   1741: ixor
    //   1742: ldc2_w -2085916723
    //   1745: l2i
    //   1746: ldc_w 803734424
    //   1749: ixor
    //   1750: ixor
    //   1751: lookupswitch default -> 1776, 637114762 -> 1734, 700593773 -> 18885
    //   1776: aload_0
    //   1777: getstatic Perryc.0 : I
    //   1780: ifle -> 1794
    //   1783: ldc2_w -286922940
    //   1786: l2i
    //   1787: ldc_w 1486783547
    //   1790: ixor
    //   1791: goto -> 1802
    //   1794: ldc2_w -988231388
    //   1797: l2i
    //   1798: ldc_w 442166546
    //   1801: ixor
    //   1802: ldc2_w -1947935839
    //   1805: l2i
    //   1806: ldc_w -984025224
    //   1809: ixor
    //   1810: ixor
    //   1811: lookupswitch default -> 18963, -1845622545 -> 1836, -121155674 -> 1794
    //   1836: getfield field_72448_b : D
    //   1839: getstatic Perryc.0 : I
    //   1842: ifle -> 1856
    //   1845: ldc2_w 2087800485
    //   1848: l2i
    //   1849: ldc_w -1450738419
    //   1852: ixor
    //   1853: goto -> 1864
    //   1856: ldc2_w -205616681
    //   1859: l2i
    //   1860: ldc_w 1705377292
    //   1863: ixor
    //   1864: ldc2_w -988272898
    //   1867: l2i
    //   1868: ldc_w 357170140
    //   1871: ixor
    //   1872: ixor
    //   1873: lookupswitch default -> 1900, -1987570593 -> 1856, 94891658 -> 19127
    //   1900: goto -> 1904
    //   1903: athrow
    //   1904: invokestatic func_76128_c : (D)I
    //   1907: goto -> 1911
    //   1910: athrow
    //   1911: getstatic Perryc.0 : I
    //   1914: ifle -> 1928
    //   1917: ldc2_w -1035748895
    //   1920: l2i
    //   1921: ldc_w -328356952
    //   1924: ixor
    //   1925: goto -> 1936
    //   1928: ldc2_w -678978753
    //   1931: l2i
    //   1932: ldc_w 961483728
    //   1935: ixor
    //   1936: ldc2_w -1423186720
    //   1939: l2i
    //   1940: ldc_w -101222567
    //   1943: ixor
    //   1944: ixor
    //   1945: lookupswitch default -> 1972, -1721030206 -> 1928, 2096267760 -> 19235
    //   1972: istore #4
    //   1974: getstatic Perryc.1 : I
    //   1977: ifeq -> 1991
    //   1980: ldc2_w -1940270550
    //   1983: l2i
    //   1984: ldc_w -348982220
    //   1987: ixor
    //   1988: goto -> 1999
    //   1991: ldc2_w -616427606
    //   1994: l2i
    //   1995: ldc_w -1196546659
    //   1998: ixor
    //   1999: ldc2_w 1474223871
    //   2002: l2i
    //   2003: ldc_w 477735258
    //   2006: ixor
    //   2007: ixor
    //   2008: lookupswitch default -> 2036, 485384187 -> 1991, 751587771 -> 18919
    //   2036: aload_0
    //   2037: getstatic Perryc.1 : I
    //   2040: ifeq -> 2054
    //   2043: ldc2_w -803177632
    //   2046: l2i
    //   2047: ldc_w 920852262
    //   2050: ixor
    //   2051: goto -> 2062
    //   2054: ldc2_w -237154172
    //   2057: l2i
    //   2058: ldc_w -1298917202
    //   2061: ixor
    //   2062: ldc2_w 1444754059
    //   2065: l2i
    //   2066: ldc_w 1217642885
    //   2069: ixor
    //   2070: ixor
    //   2071: lookupswitch default -> 2096, -129130680 -> 19199, 124053344 -> 2054
    //   2096: getfield field_72449_c : D
    //   2099: getstatic Perryc.1 : I
    //   2102: ifeq -> 2116
    //   2105: ldc2_w 1797179563
    //   2108: l2i
    //   2109: ldc_w 1574827848
    //   2112: ixor
    //   2113: goto -> 2124
    //   2116: ldc2_w 2095071884
    //   2119: l2i
    //   2120: ldc_w 200153736
    //   2123: ixor
    //   2124: ldc2_w 1252880669
    //   2127: l2i
    //   2128: ldc_w 446643104
    //   2131: ixor
    //   2132: ixor
    //   2133: lookupswitch default -> 18909, 658248377 -> 2160, 1727100254 -> 2116
    //   2160: goto -> 2164
    //   2163: athrow
    //   2164: invokestatic func_76128_c : (D)I
    //   2167: goto -> 2171
    //   2170: athrow
    //   2171: getstatic Perryc.1 : I
    //   2174: ifeq -> 2188
    //   2177: ldc2_w 1329827920
    //   2180: l2i
    //   2181: ldc_w 958498627
    //   2184: ixor
    //   2185: goto -> 2196
    //   2188: ldc2_w -1215289284
    //   2191: l2i
    //   2192: ldc_w -395570902
    //   2195: ixor
    //   2196: ldc2_w -1274903365
    //   2199: l2i
    //   2200: ldc_w 519212094
    //   2203: ixor
    //   2204: ixor
    //   2205: lookupswitch default -> 2232, -1871763520 -> 2188, -594403434 -> 19203
    //   2232: istore #5
    //   2234: getstatic Perryc.1 : I
    //   2237: ifeq -> 2251
    //   2240: ldc2_w 901940338
    //   2243: l2i
    //   2244: ldc_w -1158937658
    //   2247: ixor
    //   2248: goto -> 2259
    //   2251: ldc2_w -1281099615
    //   2254: l2i
    //   2255: ldc_w -73561421
    //   2258: ixor
    //   2259: ldc2_w -797817684
    //   2262: l2i
    //   2263: ldc_w -67278223
    //   2266: ixor
    //   2267: ixor
    //   2268: lookupswitch default -> 19013, -1532909207 -> 2251, 1672568015 -> 2296
    //   2296: aload_1
    //   2297: getstatic Perryc.c : I
    //   2300: iflt -> 2314
    //   2303: ldc2_w -1945622289
    //   2306: l2i
    //   2307: ldc_w -808647181
    //   2310: ixor
    //   2311: goto -> 2322
    //   2314: ldc2_w 459878218
    //   2317: l2i
    //   2318: ldc_w 268254089
    //   2321: ixor
    //   2322: ldc2_w 2020161875
    //   2325: l2i
    //   2326: ldc_w 286149127
    //   2329: ixor
    //   2330: ixor
    //   2331: lookupswitch default -> 18799, 715284040 -> 2314, 2113103767 -> 2356
    //   2356: getfield field_72450_a : D
    //   2359: getstatic Perryc.c : I
    //   2362: iflt -> 2376
    //   2365: ldc2_w -1927683270
    //   2368: l2i
    //   2369: ldc_w -1244315101
    //   2372: ixor
    //   2373: goto -> 2384
    //   2376: ldc2_w -1821325280
    //   2379: l2i
    //   2380: ldc_w 1158127234
    //   2383: ixor
    //   2384: ldc2_w 83552491
    //   2387: l2i
    //   2388: ldc_w 143100862
    //   2391: ixor
    //   2392: ixor
    //   2393: lookupswitch default -> 2420, 884064844 -> 18831, 920319010 -> 2376
    //   2420: goto -> 2424
    //   2423: athrow
    //   2424: invokestatic func_76128_c : (D)I
    //   2427: goto -> 2431
    //   2430: athrow
    //   2431: getstatic Perryc.c : I
    //   2434: iflt -> 2448
    //   2437: ldc2_w -927865841
    //   2440: l2i
    //   2441: ldc_w 1837393142
    //   2444: ixor
    //   2445: goto -> 2456
    //   2448: ldc2_w 1607639844
    //   2451: l2i
    //   2452: ldc_w -2098618837
    //   2455: ixor
    //   2456: ldc2_w 1572251364
    //   2459: l2i
    //   2460: ldc_w -1232785431
    //   2463: ixor
    //   2464: ixor
    //   2465: lookupswitch default -> 2492, 1309018612 -> 18809, 1855806468 -> 2448
    //   2492: istore #6
    //   2494: getstatic Perryc.1 : I
    //   2497: ifeq -> 2511
    //   2500: ldc2_w -641181300
    //   2503: l2i
    //   2504: ldc_w 414146647
    //   2507: ixor
    //   2508: goto -> 2519
    //   2511: ldc2_w -1337309261
    //   2514: l2i
    //   2515: ldc_w 878529322
    //   2518: ixor
    //   2519: ldc2_w -117255006
    //   2522: l2i
    //   2523: ldc_w 1604402218
    //   2526: ixor
    //   2527: ixor
    //   2528: lookupswitch default -> 19157, 582280209 -> 2556, 1740951891 -> 2511
    //   2556: aload_1
    //   2557: getstatic Perryc.c : I
    //   2560: iflt -> 2574
    //   2563: ldc2_w -1100180052
    //   2566: l2i
    //   2567: ldc_w -357943151
    //   2570: ixor
    //   2571: goto -> 2582
    //   2574: ldc2_w -568361239
    //   2577: l2i
    //   2578: ldc_w -351967539
    //   2581: ixor
    //   2582: ldc2_w 745703351
    //   2585: l2i
    //   2586: ldc_w -71872297
    //   2589: ixor
    //   2590: ixor
    //   2591: lookupswitch default -> 19179, -2096924067 -> 2574, -488648892 -> 2616
    //   2616: getfield field_72448_b : D
    //   2619: getstatic Perryc.1 : I
    //   2622: ifeq -> 2636
    //   2625: ldc2_w -1805216947
    //   2628: l2i
    //   2629: ldc_w 1353276966
    //   2632: ixor
    //   2633: goto -> 2644
    //   2636: ldc2_w 1371397047
    //   2639: l2i
    //   2640: ldc_w -1996626546
    //   2643: ixor
    //   2644: ldc2_w 643409391
    //   2647: l2i
    //   2648: ldc_w -1043086530
    //   2651: ixor
    //   2652: ixor
    //   2653: lookupswitch default -> 2680, -252208075 -> 2636, 591768506 -> 19105
    //   2680: goto -> 2684
    //   2683: athrow
    //   2684: invokestatic func_76128_c : (D)I
    //   2687: goto -> 2691
    //   2690: athrow
    //   2691: getstatic Perryc.0 : I
    //   2694: ifle -> 2708
    //   2697: ldc2_w -1717861514
    //   2700: l2i
    //   2701: ldc_w 1104424707
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w 455819578
    //   2711: l2i
    //   2712: ldc_w 385422736
    //   2715: ixor
    //   2716: ldc2_w 181911913
    //   2719: l2i
    //   2720: ldc_w 759747560
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 18889, -3096844 -> 2708, 709707307 -> 2752
    //   2752: istore #7
    //   2754: getstatic Perryc.0 : I
    //   2757: ifle -> 2771
    //   2760: ldc2_w -1057839588
    //   2763: l2i
    //   2764: ldc_w 1841264358
    //   2767: ixor
    //   2768: goto -> 2779
    //   2771: ldc2_w -735053507
    //   2774: l2i
    //   2775: ldc_w -1604653660
    //   2778: ixor
    //   2779: ldc2_w -2042232714
    //   2782: l2i
    //   2783: ldc_w 970511218
    //   2786: ixor
    //   2787: ixor
    //   2788: lookupswitch default -> 2816, -1715646080 -> 2771, 315819006 -> 18971
    //   2816: aload_1
    //   2817: getstatic Perryc.0 : I
    //   2820: ifle -> 2834
    //   2823: ldc2_w -1242681067
    //   2826: l2i
    //   2827: ldc_w -716041033
    //   2830: ixor
    //   2831: goto -> 2842
    //   2834: ldc2_w 489394013
    //   2837: l2i
    //   2838: ldc_w 2010153166
    //   2841: ixor
    //   2842: ldc2_w 2138088268
    //   2845: l2i
    //   2846: ldc_w -521950626
    //   2849: ixor
    //   2850: ixor
    //   2851: lookupswitch default -> 18811, -177731967 -> 2876, -13685584 -> 2834
    //   2876: getfield field_72449_c : D
    //   2879: getstatic Perryc.1 : I
    //   2882: ifeq -> 2896
    //   2885: ldc2_w -859963306
    //   2888: l2i
    //   2889: ldc_w -1720447993
    //   2892: ixor
    //   2893: goto -> 2904
    //   2896: ldc2_w 536231766
    //   2899: l2i
    //   2900: ldc_w -488707332
    //   2903: ixor
    //   2904: ldc2_w -1292846827
    //   2907: l2i
    //   2908: ldc_w 206276013
    //   2911: ixor
    //   2912: ixor
    //   2913: lookupswitch default -> 2940, -876746946 -> 2896, -344903447 -> 18943
    //   2940: goto -> 2944
    //   2943: athrow
    //   2944: invokestatic func_76128_c : (D)I
    //   2947: goto -> 2951
    //   2950: athrow
    //   2951: getstatic Perryc.0 : I
    //   2954: ifle -> 2968
    //   2957: ldc2_w 1865908831
    //   2960: l2i
    //   2961: ldc_w -2003249806
    //   2964: ixor
    //   2965: goto -> 2976
    //   2968: ldc2_w 1243828516
    //   2971: l2i
    //   2972: ldc_w 1745000992
    //   2975: ixor
    //   2976: ldc2_w -750157763
    //   2979: l2i
    //   2980: ldc_w 824954483
    //   2983: ixor
    //   2984: ixor
    //   2985: lookupswitch default -> 19065, -1069316790 -> 3012, 97327459 -> 2968
    //   3012: istore #8
    //   3014: new net/minecraft/util/math/BlockPos
    //   3017: dup
    //   3018: getstatic Perryc.0 : I
    //   3021: ifle -> 3035
    //   3024: ldc2_w 1647070882
    //   3027: l2i
    //   3028: ldc_w -1897854238
    //   3031: ixor
    //   3032: goto -> 3043
    //   3035: ldc2_w 1549395097
    //   3038: l2i
    //   3039: ldc_w -1832000079
    //   3042: ixor
    //   3043: ldc2_w -461256783
    //   3046: l2i
    //   3047: ldc_w 557756241
    //   3050: ixor
    //   3051: ixor
    //   3052: lookupswitch default -> 18941, 187394504 -> 3080, 695348384 -> 3035
    //   3080: iload_3
    //   3081: getstatic Perryc.0 : I
    //   3084: ifle -> 3098
    //   3087: ldc2_w -494557735
    //   3090: l2i
    //   3091: ldc_w -280462179
    //   3094: ixor
    //   3095: goto -> 3106
    //   3098: ldc2_w -951039690
    //   3101: l2i
    //   3102: ldc_w 522396315
    //   3105: ixor
    //   3106: ldc2_w 1874851384
    //   3109: l2i
    //   3110: ldc_w 1392573300
    //   3113: ixor
    //   3114: ixor
    //   3115: lookupswitch default -> 19183, -456366367 -> 3140, 829608968 -> 3098
    //   3140: iload #4
    //   3142: getstatic Perryc.1 : I
    //   3145: ifeq -> 3159
    //   3148: ldc2_w 1240625974
    //   3151: l2i
    //   3152: ldc_w 1589771495
    //   3155: ixor
    //   3156: goto -> 3167
    //   3159: ldc2_w 618370338
    //   3162: l2i
    //   3163: ldc_w 1251988014
    //   3166: ixor
    //   3167: ldc2_w -1320194184
    //   3170: l2i
    //   3171: ldc_w -71838176
    //   3174: ixor
    //   3175: ixor
    //   3176: lookupswitch default -> 18775, 616365652 -> 3204, 1573598857 -> 3159
    //   3204: iload #5
    //   3206: getstatic Perryc.1 : I
    //   3209: ifeq -> 3223
    //   3212: ldc2_w 1547320055
    //   3215: l2i
    //   3216: ldc_w 806663601
    //   3219: ixor
    //   3220: goto -> 3231
    //   3223: ldc2_w 1650940025
    //   3226: l2i
    //   3227: ldc_w -1751528765
    //   3230: ixor
    //   3231: ldc2_w 2007424463
    //   3234: l2i
    //   3235: ldc_w 2084354961
    //   3238: ixor
    //   3239: ixor
    //   3240: lookupswitch default -> 3268, 171904793 -> 3223, 1739909400 -> 19149
    //   3268: goto -> 3272
    //   3271: athrow
    //   3272: invokespecial <init> : (III)V
    //   3275: goto -> 3279
    //   3278: athrow
    //   3279: getstatic Perryc.0 : I
    //   3282: ifle -> 3296
    //   3285: ldc2_w 572670685
    //   3288: l2i
    //   3289: ldc_w 750612027
    //   3292: ixor
    //   3293: goto -> 3304
    //   3296: ldc2_w 782291879
    //   3299: l2i
    //   3300: ldc_w -672270319
    //   3303: ixor
    //   3304: ldc2_w -522949187
    //   3307: l2i
    //   3308: ldc_w -1295924001
    //   3311: ixor
    //   3312: ixor
    //   3313: lookupswitch default -> 3340, -440958467 -> 3296, 1552582020 -> 18833
    //   3340: astore #9
    //   3342: getstatic Perryc.1 : I
    //   3345: ifeq -> 3359
    //   3348: ldc2_w -799240103
    //   3351: l2i
    //   3352: ldc_w -785112931
    //   3355: ixor
    //   3356: goto -> 3367
    //   3359: ldc2_w 1702136310
    //   3362: l2i
    //   3363: ldc_w -1341422736
    //   3366: ixor
    //   3367: ldc2_w 1669380856
    //   3370: l2i
    //   3371: ldc_w -552096922
    //   3374: ixor
    //   3375: ixor
    //   3376: lookupswitch default -> 18787, -1107320486 -> 3359, 1776818968 -> 3404
    //   3404: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3407: getstatic Perryc.c : I
    //   3410: iflt -> 3424
    //   3413: ldc2_w 1910996778
    //   3416: l2i
    //   3417: ldc_w -148899813
    //   3420: ixor
    //   3421: goto -> 3432
    //   3424: ldc2_w -494226872
    //   3427: l2i
    //   3428: ldc_w -157442212
    //   3431: ixor
    //   3432: ldc2_w -1688100620
    //   3435: l2i
    //   3436: ldc_w -651176854
    //   3439: ixor
    //   3440: ixor
    //   3441: lookupswitch default -> 18899, -994643025 -> 3424, 1448696202 -> 3468
    //   3468: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3471: getstatic Perryc.0 : I
    //   3474: ifle -> 3488
    //   3477: ldc2_w -1373273343
    //   3480: l2i
    //   3481: ldc_w -1221059465
    //   3484: ixor
    //   3485: goto -> 3496
    //   3488: ldc2_w -71792095
    //   3491: l2i
    //   3492: ldc_w -263414853
    //   3495: ixor
    //   3496: ldc2_w -1506644829
    //   3499: l2i
    //   3500: ldc_w -1298421111
    //   3503: ixor
    //   3504: ixor
    //   3505: lookupswitch default -> 18771, 229923164 -> 3488, 526243760 -> 3532
    //   3532: aload #9
    //   3534: getstatic Perryc.0 : I
    //   3537: ifle -> 3551
    //   3540: ldc2_w 1122544123
    //   3543: l2i
    //   3544: ldc_w -37599014
    //   3547: ixor
    //   3548: goto -> 3559
    //   3551: ldc2_w -816287705
    //   3554: l2i
    //   3555: ldc_w -1095360003
    //   3558: ixor
    //   3559: ldc2_w 367231687
    //   3562: l2i
    //   3563: ldc_w -674246199
    //   3566: ixor
    //   3567: ixor
    //   3568: lookupswitch default -> 18901, -1279130924 -> 3596, 2097590831 -> 3551
    //   3596: goto -> 3600
    //   3599: athrow
    //   3600: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3603: goto -> 3607
    //   3606: athrow
    //   3607: getstatic Perryc.c : I
    //   3610: iflt -> 3624
    //   3613: ldc2_w 408069586
    //   3616: l2i
    //   3617: ldc_w 148119622
    //   3620: ixor
    //   3621: goto -> 3632
    //   3624: ldc2_w -1403904039
    //   3627: l2i
    //   3628: ldc_w 2136954130
    //   3631: ixor
    //   3632: ldc2_w 1033354532
    //   3635: l2i
    //   3636: ldc_w -705436594
    //   3639: ixor
    //   3640: ixor
    //   3641: lookupswitch default -> 18857, -119350018 -> 3624, 996742049 -> 3668
    //   3668: astore #10
    //   3670: getstatic Perryc.1 : I
    //   3673: ifeq -> 3687
    //   3676: ldc2_w 1920476888
    //   3679: l2i
    //   3680: ldc_w -61387454
    //   3683: ixor
    //   3684: goto -> 3695
    //   3687: ldc2_w -232277815
    //   3690: l2i
    //   3691: ldc_w -436479173
    //   3694: ixor
    //   3695: ldc2_w -467671833
    //   3698: l2i
    //   3699: ldc_w -1267658994
    //   3702: ixor
    //   3703: ixor
    //   3704: lookupswitch default -> 3732, -1136278464 -> 3687, -566132621 -> 19217
    //   3732: aload #10
    //   3734: getstatic Perryc.0 : I
    //   3737: ifle -> 3751
    //   3740: ldc2_w -1314660398
    //   3743: l2i
    //   3744: ldc_w 1886789504
    //   3747: ixor
    //   3748: goto -> 3759
    //   3751: ldc2_w -638323446
    //   3754: l2i
    //   3755: ldc_w -1147586712
    //   3758: ixor
    //   3759: ldc2_w -770928678
    //   3762: l2i
    //   3763: ldc_w -781852244
    //   3766: ixor
    //   3767: ixor
    //   3768: lookupswitch default -> 3796, -1027822044 -> 18779, 1772658883 -> 3751
    //   3796: goto -> 3800
    //   3799: athrow
    //   3800: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   3805: goto -> 3809
    //   3808: athrow
    //   3809: getstatic Perryc.1 : I
    //   3812: ifeq -> 3826
    //   3815: ldc2_w -1031533792
    //   3818: l2i
    //   3819: ldc_w 1402856500
    //   3822: ixor
    //   3823: goto -> 3834
    //   3826: ldc2_w -180876571
    //   3829: l2i
    //   3830: ldc_w 187437541
    //   3833: ixor
    //   3834: ldc2_w -2088537620
    //   3837: l2i
    //   3838: ldc_w 356574166
    //   3841: ixor
    //   3842: ixor
    //   3843: lookupswitch default -> 18981, 131759406 -> 3826, 1758955834 -> 3868
    //   3868: astore #11
    //   3870: getstatic Perryc.1 : I
    //   3873: ifeq -> 3887
    //   3876: ldc2_w 795804261
    //   3879: l2i
    //   3880: ldc_w 654842033
    //   3883: ixor
    //   3884: goto -> 3895
    //   3887: ldc2_w 1594618655
    //   3890: l2i
    //   3891: ldc_w -257713611
    //   3894: ixor
    //   3895: ldc2_w -595767433
    //   3898: l2i
    //   3899: ldc_w -779954537
    //   3902: ixor
    //   3903: ixor
    //   3904: lookupswitch default -> 19151, -1571295030 -> 3932, 93881140 -> 3887
    //   3932: aload #10
    //   3934: getstatic Perryc.c : I
    //   3937: iflt -> 3951
    //   3940: ldc2_w 787075933
    //   3943: l2i
    //   3944: ldc_w -1356921365
    //   3947: ixor
    //   3948: goto -> 3959
    //   3951: ldc2_w 51315497
    //   3954: l2i
    //   3955: ldc_w 904508152
    //   3958: ixor
    //   3959: ldc2_w -564165522
    //   3962: l2i
    //   3963: ldc_w 1430609710
    //   3966: ixor
    //   3967: ixor
    //   3968: lookupswitch default -> 18781, -1107531119 -> 3996, 183242230 -> 3951
    //   3996: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3999: getstatic Perryc.1 : I
    //   4002: ifeq -> 4016
    //   4005: ldc2_w -321525337
    //   4008: l2i
    //   4009: ldc_w -1169339913
    //   4012: ixor
    //   4013: goto -> 4024
    //   4016: ldc2_w -1983114321
    //   4019: l2i
    //   4020: ldc_w 1516736964
    //   4023: ixor
    //   4024: ldc2_w -1727378250
    //   4027: l2i
    //   4028: ldc_w 2060797661
    //   4031: ixor
    //   4032: ixor
    //   4033: lookupswitch default -> 19005, -1253594565 -> 4016, 812943360 -> 4060
    //   4060: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   4063: getstatic Perryc.c : I
    //   4066: iflt -> 4080
    //   4069: ldc2_w -22437668
    //   4072: l2i
    //   4073: ldc_w 1583540050
    //   4076: ixor
    //   4077: goto -> 4088
    //   4080: ldc2_w -334095445
    //   4083: l2i
    //   4084: ldc_w 1372947087
    //   4087: ixor
    //   4088: ldc2_w -420650080
    //   4091: l2i
    //   4092: ldc_w -781909756
    //   4095: ixor
    //   4096: ixor
    //   4097: lookupswitch default -> 4124, -1757207254 -> 18815, -1447552945 -> 4080
    //   4124: aload #9
    //   4126: getstatic Perryc.c : I
    //   4129: iflt -> 4143
    //   4132: ldc2_w 196175157
    //   4135: l2i
    //   4136: ldc_w -1734315436
    //   4139: ixor
    //   4140: goto -> 4151
    //   4143: ldc2_w -725478856
    //   4146: l2i
    //   4147: ldc_w 563399000
    //   4150: ixor
    //   4151: ldc2_w -2064397748
    //   4154: l2i
    //   4155: ldc_w 622428281
    //   4158: ixor
    //   4159: ixor
    //   4160: lookupswitch default -> 4188, -721388695 -> 4143, 855334228 -> 18829
    //   4188: goto -> 4192
    //   4191: athrow
    //   4192: invokeinterface func_185890_d : (Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;
    //   4197: goto -> 4201
    //   4200: athrow
    //   4201: getstatic Perryc.0 : I
    //   4204: ifle -> 4218
    //   4207: ldc2_w -496241362
    //   4210: l2i
    //   4211: ldc_w -792840235
    //   4214: ixor
    //   4215: goto -> 4226
    //   4218: ldc2_w -921199814
    //   4221: l2i
    //   4222: ldc_w -1923153377
    //   4225: ixor
    //   4226: ldc2_w 1082740903
    //   4229: l2i
    //   4230: ldc_w -326333841
    //   4233: ixor
    //   4234: ixor
    //   4235: lookupswitch default -> 4260, -1630529485 -> 18965, -1494192638 -> 4218
    //   4260: getstatic net/minecraft/block/Block.field_185506_k : Lnet/minecraft/util/math/AxisAlignedBB;
    //   4263: if_acmpeq -> 4277
    //   4266: ldc2_w 1647089684
    //   4269: l2i
    //   4270: ldc_w -1709970450
    //   4273: ixor
    //   4274: goto -> 4285
    //   4277: ldc2_w 1493851165
    //   4280: l2i
    //   4281: ldc_w -1590349856
    //   4284: ixor
    //   4285: ldc2_w -188150036
    //   4288: l2i
    //   4289: ldc_w 1090100517
    //   4292: ixor
    //   4293: ixor
    //   4294: tableswitch default -> 4266, 1276108851 -> 4316, 1276108852 -> 4965
    //   4316: getstatic Perryc.1 : I
    //   4319: ifeq -> 4333
    //   4322: ldc2_w 2118105151
    //   4325: l2i
    //   4326: ldc_w -1697639397
    //   4329: ixor
    //   4330: goto -> 4341
    //   4333: ldc2_w -289563805
    //   4336: l2i
    //   4337: ldc_w 1207954178
    //   4340: ixor
    //   4341: ldc2_w -738778648
    //   4344: l2i
    //   4345: ldc_w 2117875871
    //   4348: ixor
    //   4349: ixor
    //   4350: lookupswitch default -> 4376, -1236104524 -> 4333, 1227142483 -> 19067
    //   4376: aload #11
    //   4378: getstatic Perryc.0 : I
    //   4381: ifle -> 4395
    //   4384: ldc2_w 1071964441
    //   4387: l2i
    //   4388: ldc_w 1496004025
    //   4391: ixor
    //   4392: goto -> 4403
    //   4395: ldc2_w -1777260470
    //   4398: l2i
    //   4399: ldc_w 1424423606
    //   4402: ixor
    //   4403: ldc2_w 188936612
    //   4406: l2i
    //   4407: ldc_w -998990199
    //   4410: ixor
    //   4411: ixor
    //   4412: lookupswitch default -> 18953, -1443251315 -> 4395, 230800849 -> 4440
    //   4440: aload #10
    //   4442: ldc2_w -1037051191
    //   4445: l2i
    //   4446: ldc_w -1037051191
    //   4449: ixor
    //   4450: getstatic Perryc.c : I
    //   4453: iflt -> 4467
    //   4456: ldc2_w 1704689884
    //   4459: l2i
    //   4460: ldc_w 112109470
    //   4463: ixor
    //   4464: goto -> 4475
    //   4467: ldc2_w 366198961
    //   4470: l2i
    //   4471: ldc_w -573629256
    //   4474: ixor
    //   4475: ldc2_w -1636825859
    //   4478: l2i
    //   4479: ldc_w -1911199660
    //   4482: ixor
    //   4483: ixor
    //   4484: lookupswitch default -> 4512, 1934642155 -> 18881, 2131732203 -> 4467
    //   4512: goto -> 4516
    //   4515: athrow
    //   4516: invokevirtual func_176209_a : (Lnet/minecraft/block/state/IBlockState;Z)Z
    //   4519: goto -> 4523
    //   4522: athrow
    //   4523: ifeq -> 4537
    //   4526: ldc2_w 2090606618
    //   4529: l2i
    //   4530: ldc_w 1930787233
    //   4533: ixor
    //   4534: goto -> 4545
    //   4537: ldc2_w 901333851
    //   4540: l2i
    //   4541: ldc_w 976231137
    //   4544: ixor
    //   4545: ldc2_w -1429760150
    //   4548: l2i
    //   4549: ldc_w -1917117217
    //   4552: ixor
    //   4553: ixor
    //   4554: tableswitch default -> 4526, 687198734 -> 4576, 687198735 -> 4965
    //   4576: getstatic Perryc.c : I
    //   4579: iflt -> 4593
    //   4582: ldc2_w 1806718003
    //   4585: l2i
    //   4586: ldc_w -1288191063
    //   4589: ixor
    //   4590: goto -> 4601
    //   4593: ldc2_w 1443755035
    //   4596: l2i
    //   4597: ldc_w -1662857071
    //   4600: ixor
    //   4601: ldc2_w 888412048
    //   4604: l2i
    //   4605: ldc_w -1999760828
    //   4608: ixor
    //   4609: ixor
    //   4610: lookupswitch default -> 18985, 1690145358 -> 4593, 1993679198 -> 4636
    //   4636: goto -> 4640
    //   4639: athrow
    //   4640: invokestatic getBlocks : ()Ljava/util/List;
    //   4643: goto -> 4647
    //   4646: athrow
    //   4647: getstatic Perryc.c : I
    //   4650: iflt -> 4664
    //   4653: ldc2_w 1114561142
    //   4656: l2i
    //   4657: ldc_w -282760721
    //   4660: ixor
    //   4661: goto -> 4672
    //   4664: ldc2_w -948124580
    //   4667: l2i
    //   4668: ldc_w 871213757
    //   4671: ixor
    //   4672: ldc2_w 1311800103
    //   4675: l2i
    //   4676: ldc_w 2064007663
    //   4679: ixor
    //   4680: ixor
    //   4681: lookupswitch default -> 19189, -1736603311 -> 4664, -1045998551 -> 4708
    //   4708: aload #11
    //   4710: getstatic Perryc.1 : I
    //   4713: ifeq -> 4727
    //   4716: ldc2_w 1323635968
    //   4719: l2i
    //   4720: ldc_w 730160176
    //   4723: ixor
    //   4724: goto -> 4735
    //   4727: ldc2_w -1811302479
    //   4730: l2i
    //   4731: ldc_w -976204346
    //   4734: ixor
    //   4735: ldc2_w -382109426
    //   4738: l2i
    //   4739: ldc_w -430584376
    //   4742: ixor
    //   4743: ixor
    //   4744: lookupswitch default -> 4772, -1232273002 -> 4727, 1779236342 -> 18791
    //   4772: goto -> 4776
    //   4775: athrow
    //   4776: invokeinterface contains : (Ljava/lang/Object;)Z
    //   4781: goto -> 4785
    //   4784: athrow
    //   4785: ifne -> 4799
    //   4788: ldc2_w 1977523682
    //   4791: l2i
    //   4792: ldc_w 298678701
    //   4795: ixor
    //   4796: goto -> 4807
    //   4799: ldc2_w -1588280773
    //   4802: l2i
    //   4803: ldc_w -985192843
    //   4806: ixor
    //   4807: ldc2_w -1659348487
    //   4810: l2i
    //   4811: ldc_w 551482112
    //   4814: ixor
    //   4815: ixor
    //   4816: tableswitch default -> 4788, -640332106 -> 4840, -640332105 -> 4956
    //   4840: getstatic Perryc.0 : I
    //   4843: ifle -> 4857
    //   4846: ldc2_w 821214466
    //   4849: l2i
    //   4850: ldc_w 1613503364
    //   4853: ixor
    //   4854: goto -> 4865
    //   4857: ldc2_w -1739730210
    //   4860: l2i
    //   4861: ldc_w -163304336
    //   4864: ixor
    //   4865: ldc2_w -1423139896
    //   4868: l2i
    //   4869: ldc_w 962620394
    //   4872: ixor
    //   4873: ixor
    //   4874: lookupswitch default -> 4900, -1030596956 -> 19197, 1786201059 -> 4857
    //   4900: iload_2
    //   4901: ifne -> 4915
    //   4904: ldc2_w -1218313245
    //   4907: l2i
    //   4908: ldc_w -1386544960
    //   4911: ixor
    //   4912: goto -> 4923
    //   4915: ldc2_w -61658440
    //   4918: l2i
    //   4919: ldc_w -429250148
    //   4922: ixor
    //   4923: ldc2_w -865742565
    //   4926: l2i
    //   4927: ldc_w 601282219
    //   4930: ixor
    //   4931: ixor
    //   4932: tableswitch default -> 4904, -175504237 -> 4956, -175504236 -> 4965
    //   4956: ldc2_w 1675741332
    //   4959: l2i
    //   4960: ldc_w 1675741333
    //   4963: ixor
    //   4964: ireturn
    //   4965: getstatic Perryc.1 : I
    //   4968: ifeq -> 4982
    //   4971: ldc2_w -281778677
    //   4974: l2i
    //   4975: ldc_w 967309471
    //   4978: ixor
    //   4979: goto -> 4990
    //   4982: ldc2_w 2052283667
    //   4985: l2i
    //   4986: ldc_w 906996745
    //   4989: ixor
    //   4990: ldc2_w -1267820057
    //   4993: l2i
    //   4994: ldc_w -962403614
    //   4997: ixor
    //   4998: ixor
    //   4999: lookupswitch default -> 18763, -1537219183 -> 4982, 1049659935 -> 5024
    //   5024: aload_1
    //   5025: getstatic Perryc.c : I
    //   5028: iflt -> 5042
    //   5031: ldc2_w 553933348
    //   5034: l2i
    //   5035: ldc_w -1278710413
    //   5038: ixor
    //   5039: goto -> 5050
    //   5042: ldc2_w -1782986875
    //   5045: l2i
    //   5046: ldc_w -2136135879
    //   5049: ixor
    //   5050: ldc2_w -529311444
    //   5053: l2i
    //   5054: ldc_w 1358780361
    //   5057: ixor
    //   5058: ixor
    //   5059: lookupswitch default -> 5084, -1473653601 -> 5042, 574765490 -> 19043
    //   5084: getfield field_72450_a : D
    //   5087: getstatic Perryc.0 : I
    //   5090: ifle -> 5104
    //   5093: ldc2_w -787718547
    //   5096: l2i
    //   5097: ldc_w -1654757173
    //   5100: ixor
    //   5101: goto -> 5112
    //   5104: ldc2_w -1921502664
    //   5107: l2i
    //   5108: ldc_w -619602971
    //   5111: ixor
    //   5112: ldc2_w -302369410
    //   5115: l2i
    //   5116: ldc_w 159868694
    //   5119: ixor
    //   5120: ixor
    //   5121: lookupswitch default -> 5148, -1514700804 -> 5104, -1473289010 -> 18935
    //   5148: aload_0
    //   5149: getstatic Perryc.0 : I
    //   5152: ifle -> 5166
    //   5155: ldc2_w 942744218
    //   5158: l2i
    //   5159: ldc_w -835080617
    //   5162: ixor
    //   5163: goto -> 5174
    //   5166: ldc2_w 1312569190
    //   5169: l2i
    //   5170: ldc_w -1029066882
    //   5173: ixor
    //   5174: ldc2_w 701617303
    //   5177: l2i
    //   5178: ldc_w -1739208075
    //   5181: ixor
    //   5182: ixor
    //   5183: lookupswitch default -> 5208, -702967145 -> 5166, 1200394799 -> 18823
    //   5208: getfield field_72450_a : D
    //   5211: dsub
    //   5212: getstatic Perryc.1 : I
    //   5215: ifeq -> 5229
    //   5218: ldc2_w 1105092712
    //   5221: l2i
    //   5222: ldc_w -1357549620
    //   5225: ixor
    //   5226: goto -> 5237
    //   5229: ldc2_w 665089196
    //   5232: l2i
    //   5233: ldc_w -486233047
    //   5236: ixor
    //   5237: ldc2_w -1489707173
    //   5240: l2i
    //   5241: ldc_w 1799167954
    //   5244: ixor
    //   5245: ixor
    //   5246: lookupswitch default -> 5272, -276374639 -> 5229, 583192365 -> 19071
    //   5272: dstore #12
    //   5274: getstatic Perryc.c : I
    //   5277: iflt -> 5291
    //   5280: ldc2_w 1918046976
    //   5283: l2i
    //   5284: ldc_w 2090055686
    //   5287: ixor
    //   5288: goto -> 5299
    //   5291: ldc2_w 677081568
    //   5294: l2i
    //   5295: ldc_w 716402930
    //   5298: ixor
    //   5299: ldc2_w -254488245
    //   5302: l2i
    //   5303: ldc_w -1297187135
    //   5306: ixor
    //   5307: ixor
    //   5308: lookupswitch default -> 5336, 860710999 -> 5291, 1287259276 -> 19075
    //   5336: aload_1
    //   5337: getstatic Perryc.0 : I
    //   5340: ifle -> 5354
    //   5343: ldc2_w 1869968763
    //   5346: l2i
    //   5347: ldc_w 2086382532
    //   5350: ixor
    //   5351: goto -> 5362
    //   5354: ldc2_w -594367027
    //   5357: l2i
    //   5358: ldc_w 847092416
    //   5361: ixor
    //   5362: ldc2_w -114133637
    //   5365: l2i
    //   5366: ldc_w -1892631478
    //   5369: ixor
    //   5370: ixor
    //   5371: lookupswitch default -> 18995, -1729233348 -> 5396, 1697388430 -> 5354
    //   5396: getfield field_72448_b : D
    //   5399: getstatic Perryc.c : I
    //   5402: iflt -> 5416
    //   5405: ldc2_w -17603068
    //   5408: l2i
    //   5409: ldc_w 1359662912
    //   5412: ixor
    //   5413: goto -> 5424
    //   5416: ldc2_w 1081606256
    //   5419: l2i
    //   5420: ldc_w 1870535820
    //   5423: ixor
    //   5424: ldc2_w 458813129
    //   5427: l2i
    //   5428: ldc_w 1318472148
    //   5431: ixor
    //   5432: ixor
    //   5433: lookupswitch default -> 5460, -986492619 -> 5416, -97055143 -> 19221
    //   5460: aload_0
    //   5461: getstatic Perryc.c : I
    //   5464: iflt -> 5478
    //   5467: ldc2_w -2001491967
    //   5470: l2i
    //   5471: ldc_w -849765262
    //   5474: ixor
    //   5475: goto -> 5486
    //   5478: ldc2_w 1145040366
    //   5481: l2i
    //   5482: ldc_w -1434808630
    //   5485: ixor
    //   5486: ldc2_w -1049441143
    //   5489: l2i
    //   5490: ldc_w -728517409
    //   5493: ixor
    //   5494: ixor
    //   5495: lookupswitch default -> 5520, -1282465979 -> 5478, 1342917669 -> 19003
    //   5520: getfield field_72448_b : D
    //   5523: dsub
    //   5524: getstatic Perryc.0 : I
    //   5527: ifle -> 5541
    //   5530: ldc2_w -2096334448
    //   5533: l2i
    //   5534: ldc_w -76851244
    //   5537: ixor
    //   5538: goto -> 5549
    //   5541: ldc2_w -2043712697
    //   5544: l2i
    //   5545: ldc_w 1069706206
    //   5548: ixor
    //   5549: ldc2_w -2078454438
    //   5552: l2i
    //   5553: ldc_w 1695089191
    //   5556: ixor
    //   5557: ixor
    //   5558: lookupswitch default -> 5584, -1720491719 -> 19049, -1188082605 -> 5541
    //   5584: dstore #14
    //   5586: getstatic Perryc.1 : I
    //   5589: ifeq -> 5603
    //   5592: ldc2_w 41875512
    //   5595: l2i
    //   5596: ldc_w -1222466733
    //   5599: ixor
    //   5600: goto -> 5611
    //   5603: ldc2_w -237836201
    //   5606: l2i
    //   5607: ldc_w 555286851
    //   5610: ixor
    //   5611: ldc2_w 1132524392
    //   5614: l2i
    //   5615: ldc_w -114309039
    //   5618: ixor
    //   5619: ixor
    //   5620: lookupswitch default -> 5648, 267608146 -> 18987, 1807759613 -> 5603
    //   5648: aload_1
    //   5649: getstatic Perryc.c : I
    //   5652: iflt -> 5666
    //   5655: ldc2_w 1143731616
    //   5658: l2i
    //   5659: ldc_w 1123461867
    //   5662: ixor
    //   5663: goto -> 5674
    //   5666: ldc2_w -1472785608
    //   5669: l2i
    //   5670: ldc_w -173277605
    //   5673: ixor
    //   5674: ldc2_w -1712245320
    //   5677: l2i
    //   5678: ldc_w -60158849
    //   5681: ixor
    //   5682: ixor
    //   5683: lookupswitch default -> 5708, -364363607 -> 5666, 1665558156 -> 18867
    //   5708: getfield field_72449_c : D
    //   5711: getstatic Perryc.0 : I
    //   5714: ifle -> 5728
    //   5717: ldc2_w -177457699
    //   5720: l2i
    //   5721: ldc_w 1459651907
    //   5724: ixor
    //   5725: goto -> 5736
    //   5728: ldc2_w -2123724809
    //   5731: l2i
    //   5732: ldc_w -1099158217
    //   5735: ixor
    //   5736: ldc2_w -900360292
    //   5739: l2i
    //   5740: ldc_w 1198528463
    //   5743: ixor
    //   5744: ixor
    //   5745: lookupswitch default -> 5772, -2099392932 -> 5728, 793325773 -> 18929
    //   5772: aload_0
    //   5773: getstatic Perryc.c : I
    //   5776: iflt -> 5790
    //   5779: ldc2_w -349554876
    //   5782: l2i
    //   5783: ldc_w -323931277
    //   5786: ixor
    //   5787: goto -> 5798
    //   5790: ldc2_w 284568739
    //   5793: l2i
    //   5794: ldc_w 1228303022
    //   5797: ixor
    //   5798: ldc2_w 1557679414
    //   5801: l2i
    //   5802: ldc_w -1909238645
    //   5805: ixor
    //   5806: ixor
    //   5807: lookupswitch default -> 5832, -714072694 -> 19117, 1744326270 -> 5790
    //   5832: getfield field_72449_c : D
    //   5835: dsub
    //   5836: getstatic Perryc.1 : I
    //   5839: ifeq -> 5853
    //   5842: ldc2_w -2060014531
    //   5845: l2i
    //   5846: ldc_w -122753705
    //   5849: ixor
    //   5850: goto -> 5861
    //   5853: ldc2_w -912040756
    //   5856: l2i
    //   5857: ldc_w -1306640691
    //   5860: ixor
    //   5861: ldc2_w -449325647
    //   5864: l2i
    //   5865: ldc_w 1557349905
    //   5868: ixor
    //   5869: ixor
    //   5870: lookupswitch default -> 5896, -998452534 -> 18925, 1746330170 -> 5853
    //   5896: dstore #16
    //   5898: ldc2_w -1995330881
    //   5901: l2i
    //   5902: ldc_w -1995330953
    //   5905: ixor
    //   5906: getstatic Perryc.c : I
    //   5909: iflt -> 5923
    //   5912: ldc2_w -537551143
    //   5915: l2i
    //   5916: ldc_w 1635753733
    //   5919: ixor
    //   5920: goto -> 5931
    //   5923: ldc2_w 1418234871
    //   5926: l2i
    //   5927: ldc_w 1523562504
    //   5930: ixor
    //   5931: ldc2_w -995985471
    //   5934: l2i
    //   5935: ldc_w -1440735561
    //   5938: ixor
    //   5939: ixor
    //   5940: lookupswitch default -> 18755, -804755286 -> 5923, 1623546505 -> 5968
    //   5968: istore #18
    //   5970: getstatic Perryc.c : I
    //   5973: iflt -> 5987
    //   5976: ldc2_w 2110690984
    //   5979: l2i
    //   5980: ldc_w 309212153
    //   5983: ixor
    //   5984: goto -> 5995
    //   5987: ldc2_w -1467507835
    //   5990: l2i
    //   5991: ldc_w -2058175409
    //   5994: ixor
    //   5995: ldc2_w 2052235008
    //   5998: l2i
    //   5999: ldc_w 2933922
    //   6002: ixor
    //   6003: ixor
    //   6004: lookupswitch default -> 6032, 366935795 -> 18855, 1628750568 -> 5987
    //   6032: iload #18
    //   6034: iinc #18, -1
    //   6037: iflt -> 6051
    //   6040: ldc2_w 151415609
    //   6043: l2i
    //   6044: ldc_w 1301372438
    //   6047: ixor
    //   6048: goto -> 6059
    //   6051: ldc2_w 1149063159
    //   6054: l2i
    //   6055: ldc_w 15366873
    //   6058: ixor
    //   6059: ldc2_w -415763771
    //   6062: l2i
    //   6063: ldc_w 2108669758
    //   6066: ixor
    //   6067: ixor
    //   6068: tableswitch default -> 6040, -569411372 -> 6092, -569411371 -> 18740
    //   6092: getstatic Perryc.c : I
    //   6095: iflt -> 6109
    //   6098: ldc2_w 343491663
    //   6101: l2i
    //   6102: ldc_w 1366977383
    //   6105: ixor
    //   6106: goto -> 6117
    //   6109: ldc2_w -230503731
    //   6112: l2i
    //   6113: ldc_w -545105811
    //   6116: ixor
    //   6117: ldc2_w -296962639
    //   6120: l2i
    //   6121: ldc_w 768660087
    //   6124: ixor
    //   6125: ixor
    //   6126: lookupswitch default -> 19171, -2036381458 -> 6109, -295897754 -> 6152
    //   6152: aload_0
    //   6153: getstatic Perryc.c : I
    //   6156: iflt -> 6170
    //   6159: ldc2_w 1460949114
    //   6162: l2i
    //   6163: ldc_w 1900694871
    //   6166: ixor
    //   6167: goto -> 6178
    //   6170: ldc2_w -1486914983
    //   6173: l2i
    //   6174: ldc_w 1827010882
    //   6177: ixor
    //   6178: ldc2_w 188455191
    //   6181: l2i
    //   6182: ldc_w -825983374
    //   6185: ixor
    //   6186: ixor
    //   6187: lookupswitch default -> 6212, -475923896 -> 19173, 894855991 -> 6170
    //   6212: getfield field_72450_a : D
    //   6215: getstatic Perryc.c : I
    //   6218: iflt -> 6232
    //   6221: ldc2_w 1591036068
    //   6224: l2i
    //   6225: ldc_w 535547182
    //   6228: ixor
    //   6229: goto -> 6240
    //   6232: ldc2_w 175417391
    //   6235: l2i
    //   6236: ldc_w 1999728187
    //   6239: ixor
    //   6240: ldc2_w -1833098170
    //   6243: l2i
    //   6244: ldc_w 295295924
    //   6247: ixor
    //   6248: ixor
    //   6249: lookupswitch default -> 18907, -1038452104 -> 6232, -27182618 -> 6276
    //   6276: goto -> 6280
    //   6279: athrow
    //   6280: invokestatic isNaN : (D)Z
    //   6283: goto -> 6287
    //   6286: athrow
    //   6287: ifne -> 6301
    //   6290: ldc2_w 1476509186
    //   6293: l2i
    //   6294: ldc_w 2110066097
    //   6297: ixor
    //   6298: goto -> 6309
    //   6301: ldc2_w -432216212
    //   6304: l2i
    //   6305: ldc_w -1007135522
    //   6308: ixor
    //   6309: ldc2_w -1226675546
    //   6312: l2i
    //   6313: ldc_w -667722015
    //   6316: ixor
    //   6317: ixor
    //   6318: tableswitch default -> 6290, 1259702260 -> 6340, 1259702261 -> 6836
    //   6340: getstatic Perryc.1 : I
    //   6343: ifeq -> 6357
    //   6346: ldc2_w 1928962959
    //   6349: l2i
    //   6350: ldc_w -30482277
    //   6353: ixor
    //   6354: goto -> 6365
    //   6357: ldc2_w -858263267
    //   6360: l2i
    //   6361: ldc_w -1818396173
    //   6364: ixor
    //   6365: ldc2_w -937099502
    //   6368: l2i
    //   6369: ldc_w -1692108920
    //   6372: ixor
    //   6373: ixor
    //   6374: lookupswitch default -> 6400, -539505778 -> 18865, -298137103 -> 6357
    //   6400: aload_0
    //   6401: getstatic Perryc.0 : I
    //   6404: ifle -> 6418
    //   6407: ldc2_w -1196096301
    //   6410: l2i
    //   6411: ldc_w -1615480878
    //   6414: ixor
    //   6415: goto -> 6426
    //   6418: ldc2_w 1570291100
    //   6421: l2i
    //   6422: ldc_w -732732793
    //   6425: ixor
    //   6426: ldc2_w -410303766
    //   6429: l2i
    //   6430: ldc_w -2126367597
    //   6433: ixor
    //   6434: ixor
    //   6435: lookupswitch default -> 6460, 1103742328 -> 19021, 1708743544 -> 6418
    //   6460: getfield field_72448_b : D
    //   6463: getstatic Perryc.1 : I
    //   6466: ifeq -> 6480
    //   6469: ldc2_w -676751224
    //   6472: l2i
    //   6473: ldc_w -1200763868
    //   6476: ixor
    //   6477: goto -> 6488
    //   6480: ldc2_w 1889489953
    //   6483: l2i
    //   6484: ldc_w 1641897471
    //   6487: ixor
    //   6488: ldc2_w 1594566937
    //   6491: l2i
    //   6492: ldc_w 1621079960
    //   6495: ixor
    //   6496: ixor
    //   6497: lookupswitch default -> 6524, 1204537392 -> 6480, 1347471917 -> 18957
    //   6524: goto -> 6528
    //   6527: athrow
    //   6528: invokestatic isNaN : (D)Z
    //   6531: goto -> 6535
    //   6534: athrow
    //   6535: ifne -> 6549
    //   6538: ldc2_w -34261074
    //   6541: l2i
    //   6542: ldc_w 1988864086
    //   6545: ixor
    //   6546: goto -> 6557
    //   6549: ldc2_w -1545518811
    //   6552: l2i
    //   6553: ldc_w 681565916
    //   6556: ixor
    //   6557: ldc2_w 2083685229
    //   6560: l2i
    //   6561: ldc_w 1595302379
    //   6564: ixor
    //   6565: ixor
    //   6566: tableswitch default -> 6538, -1470464642 -> 6588, -1470464641 -> 6836
    //   6588: getstatic Perryc.1 : I
    //   6591: ifeq -> 6605
    //   6594: ldc2_w -1387644435
    //   6597: l2i
    //   6598: ldc_w -1877246712
    //   6601: ixor
    //   6602: goto -> 6613
    //   6605: ldc2_w 790546885
    //   6608: l2i
    //   6609: ldc_w -438602192
    //   6612: ixor
    //   6613: ldc2_w 131061779
    //   6616: l2i
    //   6617: ldc_w 432559299
    //   6620: ixor
    //   6621: ixor
    //   6622: lookupswitch default -> 18967, -725470427 -> 6648, 592889909 -> 6605
    //   6648: aload_0
    //   6649: getstatic Perryc.1 : I
    //   6652: ifeq -> 6666
    //   6655: ldc2_w 1054141783
    //   6658: l2i
    //   6659: ldc_w 363555216
    //   6662: ixor
    //   6663: goto -> 6674
    //   6666: ldc2_w 1231295197
    //   6669: l2i
    //   6670: ldc_w 1147539581
    //   6673: ixor
    //   6674: ldc2_w 666522123
    //   6677: l2i
    //   6678: ldc_w 41073640
    //   6681: ixor
    //   6682: ixor
    //   6683: lookupswitch default -> 6708, -115745025 -> 6666, 246902052 -> 19245
    //   6708: getfield field_72449_c : D
    //   6711: getstatic Perryc.0 : I
    //   6714: ifle -> 6728
    //   6717: ldc2_w 1096074721
    //   6720: l2i
    //   6721: ldc_w 597557935
    //   6724: ixor
    //   6725: goto -> 6736
    //   6728: ldc2_w -526185529
    //   6731: l2i
    //   6732: ldc_w 223590614
    //   6735: ixor
    //   6736: ldc2_w -1463948173
    //   6739: l2i
    //   6740: ldc_w -1167138880
    //   6743: ixor
    //   6744: ixor
    //   6745: lookupswitch default -> 18913, -14450526 -> 6772, 1880749309 -> 6728
    //   6772: goto -> 6776
    //   6775: athrow
    //   6776: invokestatic isNaN : (D)Z
    //   6779: goto -> 6783
    //   6782: athrow
    //   6783: ifeq -> 6797
    //   6786: ldc2_w -2053333441
    //   6789: l2i
    //   6790: ldc_w -1988623638
    //   6793: ixor
    //   6794: goto -> 6805
    //   6797: ldc2_w -1155824031
    //   6800: l2i
    //   6801: ldc_w -1208018253
    //   6804: ixor
    //   6805: ldc2_w 2085595042
    //   6808: l2i
    //   6809: ldc_w -1539875916
    //   6812: ixor
    //   6813: ixor
    //   6814: tableswitch default -> 6786, -727949117 -> 6836, -727949116 -> 6845
    //   6836: ldc2_w 2139268760
    //   6839: l2i
    //   6840: ldc_w 2139268760
    //   6843: ixor
    //   6844: ireturn
    //   6845: getstatic Perryc.1 : I
    //   6848: ifeq -> 6862
    //   6851: ldc2_w 461531860
    //   6854: l2i
    //   6855: ldc_w -666042104
    //   6858: ixor
    //   6859: goto -> 6870
    //   6862: ldc2_w -1575279191
    //   6865: l2i
    //   6866: ldc_w 1890692784
    //   6869: ixor
    //   6870: ldc2_w 1230835467
    //   6873: l2i
    //   6874: ldc_w 1725257589
    //   6877: ixor
    //   6878: ixor
    //   6879: lookupswitch default -> 6904, -330878046 -> 19037, 265631921 -> 6862
    //   6904: iload_3
    //   6905: getstatic Perryc.0 : I
    //   6908: ifle -> 6922
    //   6911: ldc2_w -48557568
    //   6914: l2i
    //   6915: ldc_w -105801545
    //   6918: ixor
    //   6919: goto -> 6930
    //   6922: ldc2_w -835826951
    //   6925: l2i
    //   6926: ldc_w 2067069965
    //   6929: ixor
    //   6930: ldc2_w 1681519140
    //   6933: l2i
    //   6934: ldc_w -773060366
    //   6937: ixor
    //   6938: ixor
    //   6939: lookupswitch default -> 18837, -1317048223 -> 6922, 13585442 -> 6964
    //   6964: iload #6
    //   6966: if_icmpne -> 6980
    //   6969: ldc2_w -1967064591
    //   6972: l2i
    //   6973: ldc_w -1136117955
    //   6976: ixor
    //   6977: goto -> 6988
    //   6980: ldc2_w -1364872116
    //   6983: l2i
    //   6984: ldc_w -1741849921
    //   6987: ixor
    //   6988: ldc2_w -1572359172
    //   6991: l2i
    //   6992: ldc_w -1108604433
    //   6995: ixor
    //   6996: ixor
    //   6997: tableswitch default -> 6969, 690189535 -> 7020, 690189536 -> 7389
    //   7020: getstatic Perryc.0 : I
    //   7023: ifle -> 7037
    //   7026: ldc2_w 824695453
    //   7029: l2i
    //   7030: ldc_w -1891853271
    //   7033: ixor
    //   7034: goto -> 7045
    //   7037: ldc2_w -1100003551
    //   7040: l2i
    //   7041: ldc_w 292856168
    //   7044: ixor
    //   7045: ldc2_w 414040799
    //   7048: l2i
    //   7049: ldc_w -179527352
    //   7052: ixor
    //   7053: ixor
    //   7054: lookupswitch default -> 7080, 558239239 -> 7037, 1408902435 -> 19099
    //   7080: iload #4
    //   7082: getstatic Perryc.c : I
    //   7085: iflt -> 7099
    //   7088: ldc2_w -2017984924
    //   7091: l2i
    //   7092: ldc_w -1095394290
    //   7095: ixor
    //   7096: goto -> 7107
    //   7099: ldc2_w 183378863
    //   7102: l2i
    //   7103: ldc_w 2034104617
    //   7106: ixor
    //   7107: ldc2_w 234477911
    //   7110: l2i
    //   7111: ldc_w -701154566
    //   7114: ixor
    //   7115: ixor
    //   7116: lookupswitch default -> 19237, -1474348757 -> 7144, -489782841 -> 7099
    //   7144: iload #7
    //   7146: if_icmpne -> 7160
    //   7149: ldc2_w -667583688
    //   7152: l2i
    //   7153: ldc_w 540928181
    //   7156: ixor
    //   7157: goto -> 7168
    //   7160: ldc2_w -1807075087
    //   7163: l2i
    //   7164: ldc_w 1816308605
    //   7167: ixor
    //   7168: ldc2_w -1833681968
    //   7171: l2i
    //   7172: ldc_w -852773661
    //   7175: ixor
    //   7176: ixor
    //   7177: tableswitch default -> 7149, -1483268930 -> 7200, -1483268929 -> 7389
    //   7200: getstatic Perryc.c : I
    //   7203: iflt -> 7217
    //   7206: ldc2_w 1723450431
    //   7209: l2i
    //   7210: ldc_w 1921386219
    //   7213: ixor
    //   7214: goto -> 7225
    //   7217: ldc2_w -1574874722
    //   7220: l2i
    //   7221: ldc_w -910723738
    //   7224: ixor
    //   7225: ldc2_w 1850364605
    //   7228: l2i
    //   7229: ldc_w 1154038494
    //   7232: ixor
    //   7233: ixor
    //   7234: lookupswitch default -> 7260, 1052551863 -> 19055, 1346976923 -> 7217
    //   7260: iload #5
    //   7262: getstatic Perryc.0 : I
    //   7265: ifle -> 7279
    //   7268: ldc2_w 495389809
    //   7271: l2i
    //   7272: ldc_w 2032043651
    //   7275: ixor
    //   7276: goto -> 7287
    //   7279: ldc2_w 1982485824
    //   7282: l2i
    //   7283: ldc_w 1522668201
    //   7286: ixor
    //   7287: ldc2_w 552121652
    //   7290: l2i
    //   7291: ldc_w -447182148
    //   7294: ixor
    //   7295: ixor
    //   7296: lookupswitch default -> 7324, -1591102086 -> 18979, 1935257266 -> 7279
    //   7324: iload #8
    //   7326: if_icmpne -> 7340
    //   7329: ldc2_w -1904594056
    //   7332: l2i
    //   7333: ldc_w 18632145
    //   7336: ixor
    //   7337: goto -> 7348
    //   7340: ldc2_w -1055123094
    //   7343: l2i
    //   7344: ldc_w 1316644828
    //   7347: ixor
    //   7348: ldc2_w -856836493
    //   7351: l2i
    //   7352: ldc_w -123624875
    //   7355: ixor
    //   7356: ixor
    //   7357: tableswitch default -> 7329, -1154848113 -> 7380, -1154848112 -> 7389
    //   7380: ldc2_w 106648820
    //   7383: l2i
    //   7384: ldc_w 106648820
    //   7387: ixor
    //   7388: ireturn
    //   7389: ldc2_w 1926615402
    //   7392: l2i
    //   7393: ldc_w 1926615403
    //   7396: ixor
    //   7397: getstatic Perryc.1 : I
    //   7400: ifeq -> 7414
    //   7403: ldc2_w 2103845427
    //   7406: l2i
    //   7407: ldc_w 1332834960
    //   7410: ixor
    //   7411: goto -> 7422
    //   7414: ldc2_w -323486605
    //   7417: l2i
    //   7418: ldc_w -560441365
    //   7421: ixor
    //   7422: ldc2_w 1559285235
    //   7425: l2i
    //   7426: ldc_w 2147165935
    //   7429: ixor
    //   7430: ixor
    //   7431: lookupswitch default -> 7456, 287095743 -> 18927, 1729345644 -> 7414
    //   7456: istore #19
    //   7458: ldc2_w -1633870680
    //   7461: l2i
    //   7462: ldc_w -1633870679
    //   7465: ixor
    //   7466: getstatic Perryc.1 : I
    //   7469: ifeq -> 7483
    //   7472: ldc2_w -272034497
    //   7475: l2i
    //   7476: ldc_w 208761789
    //   7479: ixor
    //   7480: goto -> 7491
    //   7483: ldc2_w 1382102685
    //   7486: l2i
    //   7487: ldc_w -1127228570
    //   7490: ixor
    //   7491: ldc2_w -1165062047
    //   7494: l2i
    //   7495: ldc_w 2035397101
    //   7498: ixor
    //   7499: ixor
    //   7500: lookupswitch default -> 18845, 543639310 -> 7483, 762432631 -> 7528
    //   7528: istore #20
    //   7530: ldc2_w 1806121393
    //   7533: l2i
    //   7534: ldc_w 1806121392
    //   7537: ixor
    //   7538: getstatic Perryc.c : I
    //   7541: iflt -> 7555
    //   7544: ldc2_w 1753662939
    //   7547: l2i
    //   7548: ldc_w -617825136
    //   7551: ixor
    //   7552: goto -> 7563
    //   7555: ldc2_w 1739009656
    //   7558: l2i
    //   7559: ldc_w 245983238
    //   7562: ixor
    //   7563: ldc2_w 444066851
    //   7566: l2i
    //   7567: ldc_w 1247143898
    //   7570: ixor
    //   7571: ixor
    //   7572: lookupswitch default -> 19025, -477597006 -> 7555, 959204743 -> 7600
    //   7600: istore #21
    //   7602: ldc2_w 0.0012313519896687316
    //   7605: invokestatic doubleToLongBits : (D)J
    //   7608: ldc2_w 9212980183657719827
    //   7611: lxor
    //   7612: invokestatic longBitsToDouble : (J)D
    //   7615: getstatic Perryc.c : I
    //   7618: iflt -> 7632
    //   7621: ldc2_w 544537664
    //   7624: l2i
    //   7625: ldc_w 780735255
    //   7628: ixor
    //   7629: goto -> 7640
    //   7632: ldc2_w -109858392
    //   7635: l2i
    //   7636: ldc_w 931020702
    //   7639: ixor
    //   7640: ldc2_w -529439071
    //   7643: l2i
    //   7644: ldc_w 477498033
    //   7647: ixor
    //   7648: ixor
    //   7649: lookupswitch default -> 18961, -218463417 -> 7632, 839574054 -> 7676
    //   7676: dstore #22
    //   7678: ldc2_w 0.001565023311231961
    //   7681: invokestatic doubleToLongBits : (D)J
    //   7684: ldc2_w 9211721813445061017
    //   7687: lxor
    //   7688: invokestatic longBitsToDouble : (J)D
    //   7691: getstatic Perryc.1 : I
    //   7694: ifeq -> 7708
    //   7697: ldc2_w 298048234
    //   7700: l2i
    //   7701: ldc_w 1200195782
    //   7704: ixor
    //   7705: goto -> 7716
    //   7708: ldc2_w -608481049
    //   7711: l2i
    //   7712: ldc_w -1732561991
    //   7715: ixor
    //   7716: ldc2_w 2031888082
    //   7719: l2i
    //   7720: ldc_w -1863733044
    //   7723: ixor
    //   7724: ixor
    //   7725: lookupswitch default -> 7752, -1407914840 -> 7708, -1077951438 -> 18859
    //   7752: dstore #24
    //   7754: ldc2_w 7.478773999044914E-4
    //   7757: invokestatic doubleToLongBits : (D)J
    //   7760: ldc2_w 9207532087889642871
    //   7763: lxor
    //   7764: invokestatic longBitsToDouble : (J)D
    //   7767: getstatic Perryc.0 : I
    //   7770: ifle -> 7784
    //   7773: ldc2_w 682494746
    //   7776: l2i
    //   7777: ldc_w -1140354727
    //   7780: ixor
    //   7781: goto -> 7792
    //   7784: ldc2_w -1368415715
    //   7787: l2i
    //   7788: ldc_w -2074624039
    //   7791: ixor
    //   7792: ldc2_w -1762919563
    //   7795: l2i
    //   7796: ldc_w 1457642153
    //   7799: ixor
    //   7800: ixor
    //   7801: lookupswitch default -> 18945, -365806568 -> 7828, 1420016543 -> 7784
    //   7828: dstore #26
    //   7830: ldc2_w 0.0022949997921811872
    //   7833: invokestatic doubleToLongBits : (D)J
    //   7836: ldc2_w 9218293352408540447
    //   7839: lxor
    //   7840: invokestatic longBitsToDouble : (J)D
    //   7843: getstatic Perryc.1 : I
    //   7846: ifeq -> 7860
    //   7849: ldc2_w -2143029258
    //   7852: l2i
    //   7853: ldc_w 1411087344
    //   7856: ixor
    //   7857: goto -> 7868
    //   7860: ldc2_w -1287338778
    //   7863: l2i
    //   7864: ldc_w -693015350
    //   7867: ixor
    //   7868: ldc2_w -451247352
    //   7871: l2i
    //   7872: ldc_w -1614333795
    //   7875: ixor
    //   7876: ixor
    //   7877: lookupswitch default -> 7904, -1367001197 -> 19169, 1087013807 -> 7860
    //   7904: dstore #28
    //   7906: ldc2_w 0.0011870017729990994
    //   7909: invokestatic doubleToLongBits : (D)J
    //   7912: ldc2_w 9213321012150967155
    //   7915: lxor
    //   7916: invokestatic longBitsToDouble : (J)D
    //   7919: getstatic Perryc.0 : I
    //   7922: ifle -> 7936
    //   7925: ldc2_w -519189280
    //   7928: l2i
    //   7929: ldc_w 952749860
    //   7932: ixor
    //   7933: goto -> 7944
    //   7936: ldc2_w -1096491729
    //   7939: l2i
    //   7940: ldc_w 1467915884
    //   7943: ixor
    //   7944: ldc2_w 699190477
    //   7947: l2i
    //   7948: ldc_w -1517764113
    //   7951: ixor
    //   7952: ixor
    //   7953: lookupswitch default -> 7980, -15228677 -> 7936, 1440747238 -> 19163
    //   7980: dstore #30
    //   7982: ldc2_w 8.332597015122148E-5
    //   7985: invokestatic doubleToLongBits : (D)J
    //   7988: ldc2_w 9194925374382724319
    //   7991: lxor
    //   7992: invokestatic longBitsToDouble : (J)D
    //   7995: getstatic Perryc.1 : I
    //   7998: ifeq -> 8012
    //   8001: ldc2_w 1972509568
    //   8004: l2i
    //   8005: ldc_w -1456142433
    //   8008: ixor
    //   8009: goto -> 8020
    //   8012: ldc2_w 615133058
    //   8015: l2i
    //   8016: ldc_w 635698985
    //   8019: ixor
    //   8020: ldc2_w -1224547052
    //   8023: l2i
    //   8024: ldc_w 741817030
    //   8027: ixor
    //   8028: ixor
    //   8029: lookupswitch default -> 18789, -1703145607 -> 8056, 1200800717 -> 8012
    //   8056: dstore #32
    //   8058: getstatic Perryc.0 : I
    //   8061: ifle -> 8075
    //   8064: ldc2_w -919767110
    //   8067: l2i
    //   8068: ldc_w -752737636
    //   8071: ixor
    //   8072: goto -> 8083
    //   8075: ldc2_w 1084716774
    //   8078: l2i
    //   8079: ldc_w -240330966
    //   8082: ixor
    //   8083: ldc2_w 1184210533
    //   8086: l2i
    //   8087: ldc_w -1969010194
    //   8090: ixor
    //   8091: ixor
    //   8092: lookupswitch default -> 8120, -1038547429 -> 8075, -700874067 -> 18801
    //   8120: iload #6
    //   8122: getstatic Perryc.0 : I
    //   8125: ifle -> 8139
    //   8128: ldc2_w -36556564
    //   8131: l2i
    //   8132: ldc_w -1005032661
    //   8135: ixor
    //   8136: goto -> 8147
    //   8139: ldc2_w 1945992084
    //   8142: l2i
    //   8143: ldc_w -1251550985
    //   8146: ixor
    //   8147: ldc2_w 765704383
    //   8150: l2i
    //   8151: ldc_w 307584745
    //   8154: ixor
    //   8155: ixor
    //   8156: lookupswitch default -> 8184, 104643985 -> 19227, 195231914 -> 8139
    //   8184: iload_3
    //   8185: if_icmple -> 8199
    //   8188: ldc2_w 2089204579
    //   8191: l2i
    //   8192: ldc_w -240498834
    //   8195: ixor
    //   8196: goto -> 8207
    //   8199: ldc2_w 201032548
    //   8202: l2i
    //   8203: ldc_w -2032697496
    //   8206: ixor
    //   8207: ldc2_w 243508463
    //   8210: l2i
    //   8211: ldc_w -1962783388
    //   8214: ixor
    //   8215: ixor
    //   8216: tableswitch default -> 8188, 145560966 -> 8240, 145560967 -> 8381
    //   8240: getstatic Perryc.1 : I
    //   8243: ifeq -> 8257
    //   8246: ldc2_w -1264520264
    //   8249: l2i
    //   8250: ldc_w 2100577563
    //   8253: ixor
    //   8254: goto -> 8265
    //   8257: ldc2_w -844176016
    //   8260: l2i
    //   8261: ldc_w -831672090
    //   8264: ixor
    //   8265: ldc2_w 364913684
    //   8268: l2i
    //   8269: ldc_w -253574861
    //   8272: ixor
    //   8273: ixor
    //   8274: lookupswitch default -> 8300, -1092443022 -> 8257, 750146436 -> 19111
    //   8300: iload_3
    //   8301: i2d
    //   8302: ldc2_w 45.57353164147724
    //   8305: invokestatic doubleToLongBits : (D)J
    //   8308: ldc2_w 9202764343469256407
    //   8311: lxor
    //   8312: invokestatic longBitsToDouble : (J)D
    //   8315: dadd
    //   8316: getstatic Perryc.0 : I
    //   8319: ifle -> 8333
    //   8322: ldc2_w 1274936173
    //   8325: l2i
    //   8326: ldc_w 1735413377
    //   8329: ixor
    //   8330: goto -> 8341
    //   8333: ldc2_w 77514216
    //   8336: l2i
    //   8337: ldc_w 1063931610
    //   8340: ixor
    //   8341: ldc2_w -1859585025
    //   8344: l2i
    //   8345: ldc_w 1946078606
    //   8348: ixor
    //   8349: ixor
    //   8350: lookupswitch default -> 8376, -832863331 -> 19241, 365463261 -> 8333
    //   8376: dstore #22
    //   8378: goto -> 8758
    //   8381: getstatic Perryc.1 : I
    //   8384: ifeq -> 8398
    //   8387: ldc2_w 760803103
    //   8390: l2i
    //   8391: ldc_w -225056401
    //   8394: ixor
    //   8395: goto -> 8406
    //   8398: ldc2_w -918818347
    //   8401: l2i
    //   8402: ldc_w -817127485
    //   8405: ixor
    //   8406: ldc2_w -882631598
    //   8409: l2i
    //   8410: ldc_w 1845083378
    //   8413: ixor
    //   8414: ixor
    //   8415: lookupswitch default -> 19079, -1595027786 -> 8440, 2035328720 -> 8398
    //   8440: iload #6
    //   8442: getstatic Perryc.1 : I
    //   8445: ifeq -> 8459
    //   8448: ldc2_w -1976046834
    //   8451: l2i
    //   8452: ldc_w 1758282602
    //   8455: ixor
    //   8456: goto -> 8467
    //   8459: ldc2_w -1942345675
    //   8462: l2i
    //   8463: ldc_w 1846830749
    //   8466: ixor
    //   8467: ldc2_w -1638805332
    //   8470: l2i
    //   8471: ldc_w 918538060
    //   8474: ixor
    //   8475: ixor
    //   8476: lookupswitch default -> 8504, 376678213 -> 8459, 1242873732 -> 18759
    //   8504: iload_3
    //   8505: if_icmpge -> 8519
    //   8508: ldc2_w -2072369133
    //   8511: l2i
    //   8512: ldc_w 1870469935
    //   8515: ixor
    //   8516: goto -> 8527
    //   8519: ldc2_w 1605240498
    //   8522: l2i
    //   8523: ldc_w -1263979121
    //   8526: ixor
    //   8527: ldc2_w -219199687
    //   8530: l2i
    //   8531: ldc_w -2017515873
    //   8534: ixor
    //   8535: ixor
    //   8536: tableswitch default -> 8508, -1638444390 -> 8560, -1638444389 -> 8689
    //   8560: getstatic Perryc.c : I
    //   8563: iflt -> 8577
    //   8566: ldc2_w 1813527168
    //   8569: l2i
    //   8570: ldc_w -1812312308
    //   8573: ixor
    //   8574: goto -> 8585
    //   8577: ldc2_w 676122267
    //   8580: l2i
    //   8581: ldc_w -350278377
    //   8584: ixor
    //   8585: ldc2_w -1587806852
    //   8588: l2i
    //   8589: ldc_w -1656379317
    //   8592: ixor
    //   8593: ixor
    //   8594: lookupswitch default -> 8620, -1891821625 -> 8577, -1006886725 -> 19031
    //   8620: iload_3
    //   8621: i2d
    //   8622: getstatic Perryc.1 : I
    //   8625: ifeq -> 8639
    //   8628: ldc2_w -1936572614
    //   8631: l2i
    //   8632: ldc_w 1367102312
    //   8635: ixor
    //   8636: goto -> 8647
    //   8639: ldc2_w -289435728
    //   8642: l2i
    //   8643: ldc_w -1000951240
    //   8646: ixor
    //   8647: ldc2_w -1858422988
    //   8650: l2i
    //   8651: ldc_w 858783079
    //   8654: ixor
    //   8655: ixor
    //   8656: lookupswitch default -> 8684, -47908834 -> 8639, 2147165697 -> 19207
    //   8684: dstore #22
    //   8686: goto -> 8758
    //   8689: ldc2_w 1167331736
    //   8692: l2i
    //   8693: ldc_w 1167331736
    //   8696: ixor
    //   8697: getstatic Perryc.1 : I
    //   8700: ifeq -> 8714
    //   8703: ldc2_w -865772789
    //   8706: l2i
    //   8707: ldc_w -451758418
    //   8710: ixor
    //   8711: goto -> 8722
    //   8714: ldc2_w -1557422410
    //   8717: l2i
    //   8718: ldc_w 2055063835
    //   8721: ixor
    //   8722: ldc2_w 855910863
    //   8725: l2i
    //   8726: ldc_w 1667002712
    //   8729: ixor
    //   8730: ixor
    //   8731: lookupswitch default -> 8756, 1667256365 -> 8714, 2033169714 -> 18903
    //   8756: istore #19
    //   8758: getstatic Perryc.c : I
    //   8761: iflt -> 8775
    //   8764: ldc2_w 1674212631
    //   8767: l2i
    //   8768: ldc_w 828661623
    //   8771: ixor
    //   8772: goto -> 8783
    //   8775: ldc2_w -1098909774
    //   8778: l2i
    //   8779: ldc_w -14345393
    //   8782: ixor
    //   8783: ldc2_w -1097418153
    //   8786: l2i
    //   8787: ldc_w 1906477127
    //   8790: ixor
    //   8791: ixor
    //   8792: lookupswitch default -> 19077, -1905336595 -> 8820, -1650845584 -> 8775
    //   8820: iload #7
    //   8822: getstatic Perryc.1 : I
    //   8825: ifeq -> 8839
    //   8828: ldc2_w 1290897621
    //   8831: l2i
    //   8832: ldc_w 1599913984
    //   8835: ixor
    //   8836: goto -> 8847
    //   8839: ldc2_w -995008196
    //   8842: l2i
    //   8843: ldc_w -133307487
    //   8846: ixor
    //   8847: ldc2_w -930403911
    //   8850: l2i
    //   8851: ldc_w -432013242
    //   8854: ixor
    //   8855: ixor
    //   8856: lookupswitch default -> 8884, 453544248 -> 8839, 1030119722 -> 19009
    //   8884: iload #4
    //   8886: if_icmple -> 8900
    //   8889: ldc2_w 443786527
    //   8892: l2i
    //   8893: ldc_w 1213690881
    //   8896: ixor
    //   8897: goto -> 8908
    //   8900: ldc2_w 1733050609
    //   8903: l2i
    //   8904: ldc_w 896045550
    //   8907: ixor
    //   8908: ldc2_w -292471812
    //   8911: l2i
    //   8912: ldc_w -331044776
    //   8915: ixor
    //   8916: ixor
    //   8917: tableswitch default -> 8889, 1357988538 -> 8940, 1357988539 -> 9081
    //   8940: getstatic Perryc.1 : I
    //   8943: ifeq -> 8957
    //   8946: ldc2_w -1100347402
    //   8949: l2i
    //   8950: ldc_w -399997754
    //   8953: ixor
    //   8954: goto -> 8965
    //   8957: ldc2_w 555869069
    //   8960: l2i
    //   8961: ldc_w 1967286242
    //   8964: ixor
    //   8965: ldc2_w 1447686226
    //   8968: l2i
    //   8969: ldc_w 1539539279
    //   8972: ixor
    //   8973: ixor
    //   8974: lookupswitch default -> 18835, 1508504946 -> 9000, 1539895853 -> 8957
    //   9000: iload #4
    //   9002: i2d
    //   9003: ldc2_w 4.901274590786499
    //   9006: invokestatic doubleToLongBits : (D)J
    //   9009: ldc2_w 9215379582577840959
    //   9012: lxor
    //   9013: invokestatic longBitsToDouble : (J)D
    //   9016: dadd
    //   9017: getstatic Perryc.1 : I
    //   9020: ifeq -> 9034
    //   9023: ldc2_w 1237179742
    //   9026: l2i
    //   9027: ldc_w -442025719
    //   9030: ixor
    //   9031: goto -> 9042
    //   9034: ldc2_w -279047553
    //   9037: l2i
    //   9038: ldc_w -1102853949
    //   9041: ixor
    //   9042: ldc2_w 745446742
    //   9045: l2i
    //   9046: ldc_w 271905309
    //   9049: ixor
    //   9050: ixor
    //   9051: lookupswitch default -> 9076, -1874818276 -> 18973, 383584551 -> 9034
    //   9076: dstore #24
    //   9078: goto -> 9458
    //   9081: getstatic Perryc.1 : I
    //   9084: ifeq -> 9098
    //   9087: ldc2_w -39590538
    //   9090: l2i
    //   9091: ldc_w -587232443
    //   9094: ixor
    //   9095: goto -> 9106
    //   9098: ldc2_w -1760722483
    //   9101: l2i
    //   9102: ldc_w 1316166454
    //   9105: ixor
    //   9106: ldc2_w 154838184
    //   9109: l2i
    //   9110: ldc_w -1802959574
    //   9113: ixor
    //   9114: ixor
    //   9115: lookupswitch default -> 9140, -1125134415 -> 18843, 34502184 -> 9098
    //   9140: iload #7
    //   9142: getstatic Perryc.c : I
    //   9145: iflt -> 9159
    //   9148: ldc2_w 789782428
    //   9151: l2i
    //   9152: ldc_w -445644393
    //   9155: ixor
    //   9156: goto -> 9167
    //   9159: ldc2_w 1867314188
    //   9162: l2i
    //   9163: ldc_w 1278901817
    //   9166: ixor
    //   9167: ldc2_w 1929022270
    //   9170: l2i
    //   9171: ldc_w 2022921520
    //   9174: ixor
    //   9175: ixor
    //   9176: lookupswitch default -> 9204, -1073037307 -> 18869, -702405303 -> 9159
    //   9204: iload #4
    //   9206: if_icmpge -> 9220
    //   9209: ldc2_w -1955772210
    //   9212: l2i
    //   9213: ldc_w 1967964693
    //   9216: ixor
    //   9217: goto -> 9228
    //   9220: ldc2_w -1348464498
    //   9223: l2i
    //   9224: ldc_w 1367448148
    //   9227: ixor
    //   9228: ldc2_w 1266206988
    //   9231: l2i
    //   9232: ldc_w -284323927
    //   9235: ixor
    //   9236: ixor
    //   9237: tableswitch default -> 9209, 1515506814 -> 9260, 1515506815 -> 9389
    //   9260: getstatic Perryc.1 : I
    //   9263: ifeq -> 9277
    //   9266: ldc2_w -2106248950
    //   9269: l2i
    //   9270: ldc_w -152761277
    //   9273: ixor
    //   9274: goto -> 9285
    //   9277: ldc2_w -55671797
    //   9280: l2i
    //   9281: ldc_w 1601095881
    //   9284: ixor
    //   9285: ldc2_w -361123361
    //   9288: l2i
    //   9289: ldc_w 339196679
    //   9292: ixor
    //   9293: ixor
    //   9294: lookupswitch default -> 9320, -1965148271 -> 18863, 1561506736 -> 9277
    //   9320: iload #4
    //   9322: i2d
    //   9323: getstatic Perryc.0 : I
    //   9326: ifle -> 9340
    //   9329: ldc2_w 10741236
    //   9332: l2i
    //   9333: ldc_w -1221264422
    //   9336: ixor
    //   9337: goto -> 9348
    //   9340: ldc2_w -435896279
    //   9343: l2i
    //   9344: ldc_w -529817272
    //   9347: ixor
    //   9348: ldc2_w 1230645893
    //   9351: l2i
    //   9352: ldc_w 926493114
    //   9355: ixor
    //   9356: ixor
    //   9357: lookupswitch default -> 9384, -906748655 -> 19027, 1916112419 -> 9340
    //   9384: dstore #24
    //   9386: goto -> 9458
    //   9389: ldc2_w 360722682
    //   9392: l2i
    //   9393: ldc_w 360722682
    //   9396: ixor
    //   9397: getstatic Perryc.0 : I
    //   9400: ifle -> 9414
    //   9403: ldc2_w -1401094960
    //   9406: l2i
    //   9407: ldc_w 1568716105
    //   9410: ixor
    //   9411: goto -> 9422
    //   9414: ldc2_w 724215695
    //   9417: l2i
    //   9418: ldc_w 684724400
    //   9421: ixor
    //   9422: ldc2_w -177243918
    //   9425: l2i
    //   9426: ldc_w -1684627859
    //   9429: ixor
    //   9430: ixor
    //   9431: lookupswitch default -> 19177, -1627017466 -> 9414, 1828934048 -> 9456
    //   9456: istore #20
    //   9458: getstatic Perryc.c : I
    //   9461: iflt -> 9475
    //   9464: ldc2_w 1280606105
    //   9467: l2i
    //   9468: ldc_w 169053574
    //   9471: ixor
    //   9472: goto -> 9483
    //   9475: ldc2_w 1446297531
    //   9478: l2i
    //   9479: ldc_w -66086470
    //   9482: ixor
    //   9483: ldc2_w 1629284584
    //   9486: l2i
    //   9487: ldc_w -1414979450
    //   9490: ixor
    //   9491: ixor
    //   9492: lookupswitch default -> 18911, -1930282383 -> 9475, 1619979887 -> 9520
    //   9520: iload #8
    //   9522: getstatic Perryc.c : I
    //   9525: iflt -> 9539
    //   9528: ldc2_w -1498763480
    //   9531: l2i
    //   9532: ldc_w 256432268
    //   9535: ixor
    //   9536: goto -> 9547
    //   9539: ldc2_w -1667954781
    //   9542: l2i
    //   9543: ldc_w -710134308
    //   9546: ixor
    //   9547: ldc2_w 371938900
    //   9550: l2i
    //   9551: ldc_w -177658033
    //   9554: ixor
    //   9555: ixor
    //   9556: lookupswitch default -> 9584, -994293938 -> 9539, 1252001471 -> 19059
    //   9584: iload #5
    //   9586: if_icmple -> 9600
    //   9589: ldc2_w 844534112
    //   9592: l2i
    //   9593: ldc_w 630387787
    //   9596: ixor
    //   9597: goto -> 9608
    //   9600: ldc2_w -1453773805
    //   9603: l2i
    //   9604: ldc_w -1096988359
    //   9607: ixor
    //   9608: ldc2_w -1843754875
    //   9611: l2i
    //   9612: ldc_w -39756132
    //   9615: ixor
    //   9616: ixor
    //   9617: tableswitch default -> 9589, 2021634866 -> 9640, 2021634867 -> 9781
    //   9640: getstatic Perryc.1 : I
    //   9643: ifeq -> 9657
    //   9646: ldc2_w -1572602550
    //   9649: l2i
    //   9650: ldc_w 1030790433
    //   9653: ixor
    //   9654: goto -> 9665
    //   9657: ldc2_w -1084866261
    //   9660: l2i
    //   9661: ldc_w -102451801
    //   9664: ixor
    //   9665: ldc2_w -2036016162
    //   9668: l2i
    //   9669: ldc_w 292119950
    //   9672: ixor
    //   9673: ixor
    //   9674: lookupswitch default -> 9700, 150920763 -> 18847, 363744063 -> 9657
    //   9700: iload #5
    //   9702: i2d
    //   9703: ldc2_w 4.235579114960769
    //   9706: invokestatic doubleToLongBits : (D)J
    //   9709: ldc2_w 9214630076103623214
    //   9712: lxor
    //   9713: invokestatic longBitsToDouble : (J)D
    //   9716: dadd
    //   9717: getstatic Perryc.1 : I
    //   9720: ifeq -> 9734
    //   9723: ldc2_w -1731364631
    //   9726: l2i
    //   9727: ldc_w 1394656571
    //   9730: ixor
    //   9731: goto -> 9742
    //   9734: ldc2_w 388485139
    //   9737: l2i
    //   9738: ldc_w 1607574214
    //   9741: ixor
    //   9742: ldc2_w -248190131
    //   9745: l2i
    //   9746: ldc_w 83192570
    //   9749: ixor
    //   9750: ixor
    //   9751: lookupswitch default -> 18793, -1120406686 -> 9776, 1043086437 -> 9734
    //   9776: dstore #26
    //   9778: goto -> 10158
    //   9781: getstatic Perryc.c : I
    //   9784: iflt -> 9798
    //   9787: ldc2_w -920186099
    //   9790: l2i
    //   9791: ldc_w 334246959
    //   9794: ixor
    //   9795: goto -> 9806
    //   9798: ldc2_w -97223981
    //   9801: l2i
    //   9802: ldc_w 459685445
    //   9805: ixor
    //   9806: ldc2_w -404266667
    //   9809: l2i
    //   9810: ldc_w -2117742507
    //   9813: ixor
    //   9814: ixor
    //   9815: lookupswitch default -> 18813, -2022640234 -> 9840, -1125542366 -> 9798
    //   9840: iload #8
    //   9842: getstatic Perryc.0 : I
    //   9845: ifle -> 9859
    //   9848: ldc2_w 646472171
    //   9851: l2i
    //   9852: ldc_w -920233231
    //   9855: ixor
    //   9856: goto -> 9867
    //   9859: ldc2_w -1179771511
    //   9862: l2i
    //   9863: ldc_w -220926897
    //   9866: ixor
    //   9867: ldc2_w -399756712
    //   9870: l2i
    //   9871: ldc_w 166420980
    //   9874: ixor
    //   9875: ixor
    //   9876: lookupswitch default -> 9904, -1700528007 -> 9859, 241789110 -> 19029
    //   9904: iload #5
    //   9906: if_icmpge -> 9920
    //   9909: ldc2_w -115806029
    //   9912: l2i
    //   9913: ldc_w -761671345
    //   9916: ixor
    //   9917: goto -> 9928
    //   9920: ldc2_w 476880885
    //   9923: l2i
    //   9924: ldc_w 938327566
    //   9927: ixor
    //   9928: ldc2_w -455807081
    //   9931: l2i
    //   9932: ldc_w -1066283856
    //   9935: ixor
    //   9936: ixor
    //   9937: tableswitch default -> 9909, 254018267 -> 9960, 254018268 -> 10089
    //   9960: getstatic Perryc.1 : I
    //   9963: ifeq -> 9977
    //   9966: ldc2_w -474796712
    //   9969: l2i
    //   9970: ldc_w -846041053
    //   9973: ixor
    //   9974: goto -> 9985
    //   9977: ldc2_w -726396806
    //   9980: l2i
    //   9981: ldc_w -965669330
    //   9984: ixor
    //   9985: ldc2_w -592106600
    //   9988: l2i
    //   9989: ldc_w -1426212281
    //   9992: ixor
    //   9993: ixor
    //   9994: lookupswitch default -> 10020, 953248957 -> 9977, 1483328676 -> 18849
    //   10020: iload #5
    //   10022: i2d
    //   10023: getstatic Perryc.1 : I
    //   10026: ifeq -> 10040
    //   10029: ldc2_w 1215934890
    //   10032: l2i
    //   10033: ldc_w -365407440
    //   10036: ixor
    //   10037: goto -> 10048
    //   10040: ldc2_w 759569404
    //   10043: l2i
    //   10044: ldc_w 1367537805
    //   10047: ixor
    //   10048: ldc2_w -1376217041
    //   10051: l2i
    //   10052: ldc_w -1522468581
    //   10055: ixor
    //   10056: ixor
    //   10057: lookupswitch default -> 10084, -1426488402 -> 19123, -1010068530 -> 10040
    //   10084: dstore #26
    //   10086: goto -> 10158
    //   10089: ldc2_w -519734976
    //   10092: l2i
    //   10093: ldc_w -519734976
    //   10096: ixor
    //   10097: getstatic Perryc.c : I
    //   10100: iflt -> 10114
    //   10103: ldc2_w 1190246972
    //   10106: l2i
    //   10107: ldc_w -1963273949
    //   10110: ixor
    //   10111: goto -> 10122
    //   10114: ldc2_w 109879713
    //   10117: l2i
    //   10118: ldc_w -644174323
    //   10121: ixor
    //   10122: ldc2_w -735535220
    //   10125: l2i
    //   10126: ldc_w 946021518
    //   10129: ixor
    //   10130: ixor
    //   10131: lookupswitch default -> 10156, -462361507 -> 10114, 541118493 -> 19131
    //   10156: istore #21
    //   10158: getstatic Perryc.c : I
    //   10161: iflt -> 10175
    //   10164: ldc2_w 1860495027
    //   10167: l2i
    //   10168: ldc_w 699260051
    //   10171: ixor
    //   10172: goto -> 10183
    //   10175: ldc2_w -715096433
    //   10178: l2i
    //   10179: ldc_w -2059510952
    //   10182: ixor
    //   10183: ldc2_w -1517907683
    //   10186: l2i
    //   10187: ldc_w 1828371637
    //   10190: ixor
    //   10191: ixor
    //   10192: lookupswitch default -> 19135, -1909123192 -> 10175, -1725822849 -> 10220
    //   10220: iload #19
    //   10222: ifeq -> 10236
    //   10225: ldc2_w 824280914
    //   10228: l2i
    //   10229: ldc_w -427273398
    //   10232: ixor
    //   10233: goto -> 10244
    //   10236: ldc2_w -1995081298
    //   10239: l2i
    //   10240: ldc_w 1589423543
    //   10243: ixor
    //   10244: ldc2_w -410582701
    //   10247: l2i
    //   10248: ldc_w -702502637
    //   10251: ixor
    //   10252: ixor
    //   10253: tableswitch default -> 10225, -435258280 -> 10276, -435258279 -> 10590
    //   10276: getstatic Perryc.1 : I
    //   10279: ifeq -> 10293
    //   10282: ldc2_w 781900953
    //   10285: l2i
    //   10286: ldc_w 1964902829
    //   10289: ixor
    //   10290: goto -> 10301
    //   10293: ldc2_w 1315768476
    //   10296: l2i
    //   10297: ldc_w 1488281779
    //   10300: ixor
    //   10301: ldc2_w -1818205056
    //   10304: l2i
    //   10305: ldc_w -790074343
    //   10308: ixor
    //   10309: ixor
    //   10310: lookupswitch default -> 10336, 416079277 -> 18795, 1097637798 -> 10293
    //   10336: dload #22
    //   10338: getstatic Perryc.1 : I
    //   10341: ifeq -> 10355
    //   10344: ldc2_w 988298024
    //   10347: l2i
    //   10348: ldc_w 2143277976
    //   10351: ixor
    //   10352: goto -> 10363
    //   10355: ldc2_w 1972519744
    //   10358: l2i
    //   10359: ldc_w 1852121490
    //   10362: ixor
    //   10363: ldc2_w -1571597277
    //   10366: l2i
    //   10367: ldc_w -663827130
    //   10370: ixor
    //   10371: ixor
    //   10372: lookupswitch default -> 10400, 1063940565 -> 18955, 2121411923 -> 10355
    //   10400: aload_0
    //   10401: getstatic Perryc.0 : I
    //   10404: ifle -> 10418
    //   10407: ldc2_w -351369688
    //   10410: l2i
    //   10411: ldc_w -1695119979
    //   10414: ixor
    //   10415: goto -> 10426
    //   10418: ldc2_w -1623511114
    //   10421: l2i
    //   10422: ldc_w 1017178785
    //   10425: ixor
    //   10426: ldc2_w 1423362147
    //   10429: l2i
    //   10430: ldc_w -516934908
    //   10433: ixor
    //   10434: ixor
    //   10435: lookupswitch default -> 10460, -1004603174 -> 19015, 2058684737 -> 10418
    //   10460: getfield field_72450_a : D
    //   10463: dsub
    //   10464: getstatic Perryc.c : I
    //   10467: iflt -> 10481
    //   10470: ldc2_w 966655543
    //   10473: l2i
    //   10474: ldc_w 14897291
    //   10477: ixor
    //   10478: goto -> 10489
    //   10481: ldc2_w -281802826
    //   10484: l2i
    //   10485: ldc_w -1495149457
    //   10488: ixor
    //   10489: ldc2_w 1814720585
    //   10492: l2i
    //   10493: ldc_w 1296407669
    //   10496: ixor
    //   10497: ixor
    //   10498: lookupswitch default -> 18757, 403784320 -> 10481, 1757036517 -> 10524
    //   10524: dload #12
    //   10526: ddiv
    //   10527: getstatic Perryc.0 : I
    //   10530: ifle -> 10544
    //   10533: ldc2_w 1748029139
    //   10536: l2i
    //   10537: ldc_w -1829553976
    //   10540: ixor
    //   10541: goto -> 10552
    //   10544: ldc2_w 505306958
    //   10547: l2i
    //   10548: ldc_w -941154884
    //   10551: ixor
    //   10552: ldc2_w 1715556090
    //   10555: l2i
    //   10556: ldc_w 2113112490
    //   10559: ixor
    //   10560: ixor
    //   10561: lookupswitch default -> 10588, -746521558 -> 10544, -512675509 -> 19073
    //   10588: dstore #28
    //   10590: getstatic Perryc.0 : I
    //   10593: ifle -> 10607
    //   10596: ldc2_w -401488484
    //   10599: l2i
    //   10600: ldc_w -1600457640
    //   10603: ixor
    //   10604: goto -> 10615
    //   10607: ldc2_w -656150392
    //   10610: l2i
    //   10611: ldc_w 1727298467
    //   10614: ixor
    //   10615: ldc2_w 1608299072
    //   10618: l2i
    //   10619: ldc_w 1261937669
    //   10622: ixor
    //   10623: ixor
    //   10624: lookupswitch default -> 10652, 767686779 -> 10607, 1549805441 -> 19239
    //   10652: iload #20
    //   10654: ifeq -> 10668
    //   10657: ldc2_w -83517715
    //   10660: l2i
    //   10661: ldc_w 1627641493
    //   10664: ixor
    //   10665: goto -> 10676
    //   10668: ldc2_w -1728311790
    //   10671: l2i
    //   10672: ldc_w 49956461
    //   10675: ixor
    //   10676: ldc2_w 1227328793
    //   10679: l2i
    //   10680: ldc_w -1341122702
    //   10683: ixor
    //   10684: ixor
    //   10685: tableswitch default -> 10657, 1664209427 -> 10708, 1664209428 -> 11022
    //   10708: getstatic Perryc.1 : I
    //   10711: ifeq -> 10725
    //   10714: ldc2_w -1484314595
    //   10717: l2i
    //   10718: ldc_w 1268251367
    //   10721: ixor
    //   10722: goto -> 10733
    //   10725: ldc2_w 1064860370
    //   10728: l2i
    //   10729: ldc_w 1498760581
    //   10732: ixor
    //   10733: ldc2_w -541761781
    //   10736: l2i
    //   10737: ldc_w 1156594158
    //   10740: ixor
    //   10741: ixor
    //   10742: lookupswitch default -> 10768, -100107453 -> 10725, 2002105375 -> 19251
    //   10768: dload #24
    //   10770: getstatic Perryc.c : I
    //   10773: iflt -> 10787
    //   10776: ldc2_w 1303488996
    //   10779: l2i
    //   10780: ldc_w 763092384
    //   10783: ixor
    //   10784: goto -> 10795
    //   10787: ldc2_w -1442507669
    //   10790: l2i
    //   10791: ldc_w 446454678
    //   10794: ixor
    //   10795: ldc2_w 62039081
    //   10798: l2i
    //   10799: ldc_w -2001010490
    //   10802: ixor
    //   10803: ixor
    //   10804: lookupswitch default -> 19153, -339488597 -> 10787, 999353106 -> 10832
    //   10832: aload_0
    //   10833: getstatic Perryc.c : I
    //   10836: iflt -> 10850
    //   10839: ldc2_w -1011341519
    //   10842: l2i
    //   10843: ldc_w -1219609610
    //   10846: ixor
    //   10847: goto -> 10858
    //   10850: ldc2_w -667773068
    //   10853: l2i
    //   10854: ldc_w 1564559450
    //   10857: ixor
    //   10858: ldc2_w -785863593
    //   10861: l2i
    //   10862: ldc_w -1114450439
    //   10865: ixor
    //   10866: ixor
    //   10867: lookupswitch default -> 10892, 407659881 -> 19139, 997929742 -> 10850
    //   10892: getfield field_72448_b : D
    //   10895: dsub
    //   10896: getstatic Perryc.c : I
    //   10899: iflt -> 10913
    //   10902: ldc2_w -1882470584
    //   10905: l2i
    //   10906: ldc_w -1142000511
    //   10909: ixor
    //   10910: goto -> 10921
    //   10913: ldc2_w 908046764
    //   10916: l2i
    //   10917: ldc_w 2002479407
    //   10920: ixor
    //   10921: ldc2_w 1884446165
    //   10924: l2i
    //   10925: ldc_w -986251671
    //   10928: ixor
    //   10929: ixor
    //   10930: lookupswitch default -> 18805, -2126442379 -> 10913, -199197889 -> 10956
    //   10956: dload #14
    //   10958: ddiv
    //   10959: getstatic Perryc.1 : I
    //   10962: ifeq -> 10976
    //   10965: ldc2_w 1304039655
    //   10968: l2i
    //   10969: ldc_w 1781416222
    //   10972: ixor
    //   10973: goto -> 10984
    //   10976: ldc2_w -265023070
    //   10979: l2i
    //   10980: ldc_w -2062009111
    //   10983: ixor
    //   10984: ldc2_w -479756918
    //   10987: l2i
    //   10988: ldc_w 1303689806
    //   10991: ixor
    //   10992: ixor
    //   10993: lookupswitch default -> 18991, -1991797187 -> 10976, -603985265 -> 11020
    //   11020: dstore #30
    //   11022: getstatic Perryc.0 : I
    //   11025: ifle -> 11039
    //   11028: ldc2_w 590230353
    //   11031: l2i
    //   11032: ldc_w 981757097
    //   11035: ixor
    //   11036: goto -> 11047
    //   11039: ldc2_w -878798157
    //   11042: l2i
    //   11043: ldc_w 1616396939
    //   11046: ixor
    //   11047: ldc2_w 2094810997
    //   11050: l2i
    //   11051: ldc_w 1069418761
    //   11054: ixor
    //   11055: ixor
    //   11056: lookupswitch default -> 19249, -391866812 -> 11084, 1523061124 -> 11039
    //   11084: iload #21
    //   11086: ifeq -> 11100
    //   11089: ldc2_w 855333978
    //   11092: l2i
    //   11093: ldc_w -1323131505
    //   11096: ixor
    //   11097: goto -> 11108
    //   11100: ldc2_w -1973162660
    //   11103: l2i
    //   11104: ldc_w 163196042
    //   11107: ixor
    //   11108: ldc2_w 124164006
    //   11111: l2i
    //   11112: ldc_w 348312558
    //   11115: ixor
    //   11116: ixor
    //   11117: tableswitch default -> 11089, -1870821987 -> 11140, -1870821986 -> 11454
    //   11140: getstatic Perryc.0 : I
    //   11143: ifle -> 11157
    //   11146: ldc2_w 876322548
    //   11149: l2i
    //   11150: ldc_w -612442710
    //   11153: ixor
    //   11154: goto -> 11165
    //   11157: ldc2_w -609133091
    //   11160: l2i
    //   11161: ldc_w -870030762
    //   11164: ixor
    //   11165: ldc2_w 244606378
    //   11168: l2i
    //   11169: ldc_w 1561721270
    //   11172: ixor
    //   11173: ixor
    //   11174: lookupswitch default -> 11200, -1127948478 -> 19033, 387058542 -> 11157
    //   11200: dload #26
    //   11202: getstatic Perryc.0 : I
    //   11205: ifle -> 11219
    //   11208: ldc2_w 1838927600
    //   11211: l2i
    //   11212: ldc_w 1156429144
    //   11215: ixor
    //   11216: goto -> 11227
    //   11219: ldc2_w 1078494509
    //   11222: l2i
    //   11223: ldc_w -1039057436
    //   11226: ixor
    //   11227: ldc2_w 1487733697
    //   11230: l2i
    //   11231: ldc_w -1078741980
    //   11234: ixor
    //   11235: ixor
    //   11236: lookupswitch default -> 18749, -831992755 -> 11219, 1699155756 -> 11264
    //   11264: aload_0
    //   11265: getstatic Perryc.0 : I
    //   11268: ifle -> 11282
    //   11271: ldc2_w 2030435068
    //   11274: l2i
    //   11275: ldc_w 1776812662
    //   11278: ixor
    //   11279: goto -> 11290
    //   11282: ldc2_w -739986891
    //   11285: l2i
    //   11286: ldc_w -1591252880
    //   11289: ixor
    //   11290: ldc2_w -98005127
    //   11293: l2i
    //   11294: ldc_w -2114798599
    //   11297: ixor
    //   11298: ixor
    //   11299: lookupswitch default -> 11324, 1086570774 -> 11282, 1798818826 -> 18783
    //   11324: getfield field_72449_c : D
    //   11327: dsub
    //   11328: getstatic Perryc.c : I
    //   11331: iflt -> 11345
    //   11334: ldc2_w 1414174742
    //   11337: l2i
    //   11338: ldc_w 900993147
    //   11341: ixor
    //   11342: goto -> 11353
    //   11345: ldc2_w 879431345
    //   11348: l2i
    //   11349: ldc_w 1907633784
    //   11352: ixor
    //   11353: ldc2_w 453964078
    //   11356: l2i
    //   11357: ldc_w 1826455227
    //   11360: ixor
    //   11361: ixor
    //   11362: lookupswitch default -> 19045, 372049912 -> 11345, 839692124 -> 11388
    //   11388: dload #16
    //   11390: ddiv
    //   11391: getstatic Perryc.c : I
    //   11394: iflt -> 11408
    //   11397: ldc2_w 1535964151
    //   11400: l2i
    //   11401: ldc_w 471685445
    //   11404: ixor
    //   11405: goto -> 11416
    //   11408: ldc2_w -956027856
    //   11411: l2i
    //   11412: ldc_w 408422010
    //   11415: ixor
    //   11416: ldc2_w 1320951094
    //   11419: l2i
    //   11420: ldc_w -1611541810
    //   11423: ixor
    //   11424: ixor
    //   11425: lookupswitch default -> 19085, -1763941046 -> 11408, 236053938 -> 11452
    //   11452: dstore #32
    //   11454: getstatic Perryc.0 : I
    //   11457: ifle -> 11471
    //   11460: ldc2_w -1551212115
    //   11463: l2i
    //   11464: ldc_w 523135669
    //   11467: ixor
    //   11468: goto -> 11479
    //   11471: ldc2_w 433281716
    //   11474: l2i
    //   11475: ldc_w -482238547
    //   11478: ixor
    //   11479: ldc2_w 1267867426
    //   11482: l2i
    //   11483: ldc_w -195234195
    //   11486: ixor
    //   11487: ixor
    //   11488: lookupswitch default -> 11516, -1432335229 -> 11471, 57336407 -> 19101
    //   11516: dload #28
    //   11518: ldc2_w 1.6759357096731455E308
    //   11521: invokestatic doubleToLongBits : (D)J
    //   11524: ldc2_w 9218258381279504575
    //   11527: lxor
    //   11528: invokestatic longBitsToDouble : (J)D
    //   11531: dcmpl
    //   11532: ifne -> 11546
    //   11535: ldc2_w -1284572157
    //   11538: l2i
    //   11539: ldc_w 901335788
    //   11542: ixor
    //   11543: goto -> 11554
    //   11546: ldc2_w 9055752
    //   11549: l2i
    //   11550: ldc_w -2040686364
    //   11553: ixor
    //   11554: ldc2_w -1563531959
    //   11557: l2i
    //   11558: ldc_w -2001741185
    //   11561: ixor
    //   11562: ixor
    //   11563: tableswitch default -> 11535, -1397356071 -> 11584, -1397356070 -> 11658
    //   11584: ldc2_w -82659.29128491665
    //   11587: invokestatic doubleToLongBits : (D)J
    //   11590: ldc2_w 9218332795783748672
    //   11593: lxor
    //   11594: invokestatic longBitsToDouble : (J)D
    //   11597: getstatic Perryc.c : I
    //   11600: iflt -> 11614
    //   11603: ldc2_w 1244882137
    //   11606: l2i
    //   11607: ldc_w 736484950
    //   11610: ixor
    //   11611: goto -> 11622
    //   11614: ldc2_w -212204776
    //   11617: l2i
    //   11618: ldc_w 1598627782
    //   11621: ixor
    //   11622: ldc2_w -1242029705
    //   11625: l2i
    //   11626: ldc_w -771598239
    //   11629: ixor
    //   11630: ixor
    //   11631: lookupswitch default -> 19119, -873896504 -> 11656, 103596953 -> 11614
    //   11656: dstore #28
    //   11658: getstatic Perryc.1 : I
    //   11661: ifeq -> 11675
    //   11664: ldc2_w -1594340417
    //   11667: l2i
    //   11668: ldc_w 739873756
    //   11671: ixor
    //   11672: goto -> 11683
    //   11675: ldc2_w 919569261
    //   11678: l2i
    //   11679: ldc_w -1937583263
    //   11682: ixor
    //   11683: ldc2_w 1769424964
    //   11686: l2i
    //   11687: ldc_w 1860652750
    //   11690: ixor
    //   11691: ixor
    //   11692: lookupswitch default -> 18969, -1955471639 -> 11675, -1109567866 -> 11720
    //   11720: dload #30
    //   11722: ldc2_w 1.3985316957649612E308
    //   11725: invokestatic doubleToLongBits : (D)J
    //   11728: ldc2_w 9216868470410468895
    //   11731: lxor
    //   11732: invokestatic longBitsToDouble : (J)D
    //   11735: dcmpl
    //   11736: ifne -> 11750
    //   11739: ldc2_w 789267965
    //   11742: l2i
    //   11743: ldc_w 122980844
    //   11746: ixor
    //   11747: goto -> 11758
    //   11750: ldc2_w -1272747894
    //   11753: l2i
    //   11754: ldc_w -1669553000
    //   11757: ixor
    //   11758: ldc2_w 798264240
    //   11761: l2i
    //   11762: ldc_w 1567407500
    //   11765: ixor
    //   11766: ixor
    //   11767: tableswitch default -> 11739, 1520957997 -> 11788, 1520957998 -> 11862
    //   11788: ldc2_w -114714.3228759321
    //   11791: invokestatic doubleToLongBits : (D)J
    //   11794: ldc2_w 9216114468787042108
    //   11797: lxor
    //   11798: invokestatic longBitsToDouble : (J)D
    //   11801: getstatic Perryc.1 : I
    //   11804: ifeq -> 11818
    //   11807: ldc2_w 1390096668
    //   11810: l2i
    //   11811: ldc_w -1551896744
    //   11814: ixor
    //   11815: goto -> 11826
    //   11818: ldc2_w 172727548
    //   11821: l2i
    //   11822: ldc_w -1519985923
    //   11825: ixor
    //   11826: ldc2_w 1480065202
    //   11829: l2i
    //   11830: ldc_w 744895631
    //   11833: ixor
    //   11834: ixor
    //   11835: lookupswitch default -> 11860, -2047153543 -> 18821, 521586521 -> 11818
    //   11860: dstore #30
    //   11862: getstatic Perryc.1 : I
    //   11865: ifeq -> 11879
    //   11868: ldc2_w -370811712
    //   11871: l2i
    //   11872: ldc_w -219057452
    //   11875: ixor
    //   11876: goto -> 11887
    //   11879: ldc2_w -234643770
    //   11882: l2i
    //   11883: ldc_w -760122371
    //   11886: ixor
    //   11887: ldc2_w -992563811
    //   11890: l2i
    //   11891: ldc_w 1168660807
    //   11894: ixor
    //   11895: ixor
    //   11896: lookupswitch default -> 11924, -1704305970 -> 19191, 1800262642 -> 11879
    //   11924: dload #32
    //   11926: ldc2_w 1.2857028783831644E308
    //   11929: invokestatic doubleToLongBits : (D)J
    //   11932: ldc2_w 9216303150545734326
    //   11935: lxor
    //   11936: invokestatic longBitsToDouble : (J)D
    //   11939: dcmpl
    //   11940: ifne -> 11954
    //   11943: ldc2_w -467632092
    //   11946: l2i
    //   11947: ldc_w -919164572
    //   11950: ixor
    //   11951: goto -> 11962
    //   11954: ldc2_w -393967128
    //   11957: l2i
    //   11958: ldc_w -980246359
    //   11961: ixor
    //   11962: ldc2_w -822064605
    //   11965: l2i
    //   11966: ldc_w 111257561
    //   11969: ixor
    //   11970: ixor
    //   11971: tableswitch default -> 11943, -457718598 -> 11992, -457718597 -> 12066
    //   11992: ldc2_w -11031.623855551796
    //   11995: invokestatic doubleToLongBits : (D)J
    //   11998: ldc2_w 9214291364423135007
    //   12001: lxor
    //   12002: invokestatic longBitsToDouble : (J)D
    //   12005: getstatic Perryc.1 : I
    //   12008: ifeq -> 12022
    //   12011: ldc2_w 1717844806
    //   12014: l2i
    //   12015: ldc_w -1304732986
    //   12018: ixor
    //   12019: goto -> 12030
    //   12022: ldc2_w 1682641722
    //   12025: l2i
    //   12026: ldc_w -292022530
    //   12029: ixor
    //   12030: ldc2_w -1617777439
    //   12033: l2i
    //   12034: ldc_w -1904208149
    //   12037: ixor
    //   12038: ixor
    //   12039: lookupswitch default -> 12064, -984753270 -> 19175, 551824847 -> 12022
    //   12064: dstore #32
    //   12066: getstatic Perryc.0 : I
    //   12069: ifle -> 12083
    //   12072: ldc2_w -1875868667
    //   12075: l2i
    //   12076: ldc_w 1944687490
    //   12079: ixor
    //   12080: goto -> 12091
    //   12083: ldc2_w -448455934
    //   12086: l2i
    //   12087: ldc_w -338252086
    //   12090: ixor
    //   12091: ldc2_w -1487497424
    //   12094: l2i
    //   12095: ldc_w 423691205
    //   12098: ixor
    //   12099: ixor
    //   12100: lookupswitch default -> 12128, 382053252 -> 12083, 1573815154 -> 18853
    //   12128: dload #28
    //   12130: getstatic Perryc.1 : I
    //   12133: ifeq -> 12147
    //   12136: ldc2_w 373238820
    //   12139: l2i
    //   12140: ldc_w 413208832
    //   12143: ixor
    //   12144: goto -> 12155
    //   12147: ldc2_w -2071305452
    //   12150: l2i
    //   12151: ldc_w -136542850
    //   12154: ixor
    //   12155: ldc2_w -197133768
    //   12158: l2i
    //   12159: ldc_w 1429911679
    //   12162: ixor
    //   12163: ixor
    //   12164: lookupswitch default -> 12192, -1348763805 -> 19097, 992272317 -> 12147
    //   12192: dload #30
    //   12194: dcmpg
    //   12195: ifge -> 12209
    //   12198: ldc2_w 145831240
    //   12201: l2i
    //   12202: ldc_w -846016586
    //   12205: ixor
    //   12206: goto -> 12217
    //   12209: ldc2_w 2030398549
    //   12212: l2i
    //   12213: ldc_w -1138321750
    //   12216: ixor
    //   12217: ldc2_w 1969310923
    //   12220: l2i
    //   12221: ldc_w 1699570795
    //   12224: ixor
    //   12225: ixor
    //   12226: tableswitch default -> 12198, -720383394 -> 12248, -720383393 -> 13512
    //   12248: getstatic Perryc.c : I
    //   12251: iflt -> 12265
    //   12254: ldc2_w 1809376133
    //   12257: l2i
    //   12258: ldc_w 1294013165
    //   12261: ixor
    //   12262: goto -> 12273
    //   12265: ldc2_w 1039574796
    //   12268: l2i
    //   12269: ldc_w 1171910902
    //   12272: ixor
    //   12273: ldc2_w 1943201106
    //   12276: l2i
    //   12277: ldc_w -209981267
    //   12280: ixor
    //   12281: ixor
    //   12282: lookupswitch default -> 12308, -1504648041 -> 19147, -1174017510 -> 12265
    //   12308: dload #28
    //   12310: getstatic Perryc.c : I
    //   12313: iflt -> 12327
    //   12316: ldc2_w -675098708
    //   12319: l2i
    //   12320: ldc_w 468082126
    //   12323: ixor
    //   12324: goto -> 12335
    //   12327: ldc2_w 233376762
    //   12330: l2i
    //   12331: ldc_w -370432764
    //   12334: ixor
    //   12335: ldc2_w -259004848
    //   12338: l2i
    //   12339: ldc_w 861084238
    //   12342: ixor
    //   12343: ixor
    //   12344: lookupswitch default -> 19215, 267939452 -> 12327, 668881632 -> 12372
    //   12372: dload #32
    //   12374: dcmpg
    //   12375: ifge -> 12389
    //   12378: ldc2_w -551406551
    //   12381: l2i
    //   12382: ldc_w -1066009148
    //   12385: ixor
    //   12386: goto -> 12397
    //   12389: ldc2_w -353791282
    //   12392: l2i
    //   12393: ldc_w -172074206
    //   12396: ixor
    //   12397: ldc2_w -258323806
    //   12400: l2i
    //   12401: ldc_w 1136744323
    //   12404: ixor
    //   12405: ixor
    //   12406: tableswitch default -> 12378, -1408445236 -> 12428, -1408445235 -> 13512
    //   12428: getstatic Perryc.c : I
    //   12431: iflt -> 12445
    //   12434: ldc2_w 1913809253
    //   12437: l2i
    //   12438: ldc_w 501331501
    //   12441: ixor
    //   12442: goto -> 12453
    //   12445: ldc2_w -1348972920
    //   12448: l2i
    //   12449: ldc_w -1301650582
    //   12452: ixor
    //   12453: ldc2_w -1497108533
    //   12456: l2i
    //   12457: ldc_w 1769141230
    //   12460: ixor
    //   12461: ixor
    //   12462: lookupswitch default -> 12488, -1606237331 -> 18797, -216837546 -> 12445
    //   12488: iload #6
    //   12490: getstatic Perryc.1 : I
    //   12493: ifeq -> 12507
    //   12496: ldc2_w -546194218
    //   12499: l2i
    //   12500: ldc_w -1161958532
    //   12503: ixor
    //   12504: goto -> 12515
    //   12507: ldc2_w 1114373502
    //   12510: l2i
    //   12511: ldc_w -527704279
    //   12514: ixor
    //   12515: ldc2_w 331576975
    //   12518: l2i
    //   12519: ldc_w -1223727575
    //   12522: ixor
    //   12523: ixor
    //   12524: lookupswitch default -> 19213, -1056946420 -> 12507, 103559921 -> 12552
    //   12552: iload_3
    //   12553: if_icmple -> 12567
    //   12556: ldc2_w -331474447
    //   12559: l2i
    //   12560: ldc_w -708567143
    //   12563: ixor
    //   12564: goto -> 12575
    //   12567: ldc2_w -452042928
    //   12570: l2i
    //   12571: ldc_w -587966145
    //   12574: ixor
    //   12575: ldc2_w -1991698900
    //   12578: l2i
    //   12579: ldc_w 1960967951
    //   12582: ixor
    //   12583: ixor
    //   12584: tableswitch default -> 12556, -1001197749 -> 12608, -1001197748 -> 12674
    //   12608: getstatic Perryc.1 : I
    //   12611: ifeq -> 12625
    //   12614: ldc2_w 1517149776
    //   12617: l2i
    //   12618: ldc_w -842785327
    //   12621: ixor
    //   12622: goto -> 12633
    //   12625: ldc2_w -1862916836
    //   12628: l2i
    //   12629: ldc_w -1097946177
    //   12632: ixor
    //   12633: ldc2_w -413548013
    //   12636: l2i
    //   12637: ldc_w 1587934216
    //   12640: ixor
    //   12641: ixor
    //   12642: lookupswitch default -> 19023, -1752909640 -> 12668, 777385370 -> 12625
    //   12668: getstatic net/minecraft/util/EnumFacing.WEST : Lnet/minecraft/util/EnumFacing;
    //   12671: goto -> 12739
    //   12674: getstatic Perryc.1 : I
    //   12677: ifeq -> 12691
    //   12680: ldc2_w -1929020356
    //   12683: l2i
    //   12684: ldc_w -357775802
    //   12687: ixor
    //   12688: goto -> 12699
    //   12691: ldc2_w -1141128719
    //   12694: l2i
    //   12695: ldc_w 203118409
    //   12698: ixor
    //   12699: ldc2_w -1053306011
    //   12702: l2i
    //   12703: ldc_w 570791794
    //   12706: ixor
    //   12707: ixor
    //   12708: lookupswitch default -> 12736, -2070151571 -> 18939, 1215411333 -> 12691
    //   12736: getstatic net/minecraft/util/EnumFacing.EAST : Lnet/minecraft/util/EnumFacing;
    //   12739: getstatic Perryc.0 : I
    //   12742: ifle -> 12756
    //   12745: ldc2_w -1725198400
    //   12748: l2i
    //   12749: ldc_w -1473111176
    //   12752: ixor
    //   12753: goto -> 12764
    //   12756: ldc2_w -1639760702
    //   12759: l2i
    //   12760: ldc_w 46510821
    //   12763: ixor
    //   12764: ldc2_w 1463862866
    //   12767: l2i
    //   12768: ldc_w -1075533176
    //   12771: ixor
    //   12772: ixor
    //   12773: lookupswitch default -> 12800, -1916093219 -> 12756, -641861534 -> 19181
    //   12800: astore #34
    //   12802: new net/minecraft/util/math/Vec3d
    //   12805: dup
    //   12806: getstatic Perryc.c : I
    //   12809: iflt -> 12823
    //   12812: ldc2_w 1138563377
    //   12815: l2i
    //   12816: ldc_w 1812506432
    //   12819: ixor
    //   12820: goto -> 12831
    //   12823: ldc2_w 1233673198
    //   12826: l2i
    //   12827: ldc_w -1629137737
    //   12830: ixor
    //   12831: ldc2_w -1662636981
    //   12834: l2i
    //   12835: ldc_w 1592164080
    //   12838: ixor
    //   12839: ixor
    //   12840: lookupswitch default -> 19167, -304747318 -> 12823, 359488994 -> 12868
    //   12868: dload #22
    //   12870: getstatic Perryc.0 : I
    //   12873: ifle -> 12887
    //   12876: ldc2_w -1360386865
    //   12879: l2i
    //   12880: ldc_w 1331974042
    //   12883: ixor
    //   12884: goto -> 12895
    //   12887: ldc2_w -984827953
    //   12890: l2i
    //   12891: ldc_w -499722777
    //   12894: ixor
    //   12895: ldc2_w 1792758428
    //   12898: l2i
    //   12899: ldc_w -976501959
    //   12902: ixor
    //   12903: ixor
    //   12904: lookupswitch default -> 12932, -704618529 -> 12887, 1319041776 -> 18989
    //   12932: aload_0
    //   12933: getstatic Perryc.c : I
    //   12936: iflt -> 12950
    //   12939: ldc2_w 873981728
    //   12942: l2i
    //   12943: ldc_w 217237279
    //   12946: ixor
    //   12947: goto -> 12958
    //   12950: ldc2_w 713720324
    //   12953: l2i
    //   12954: ldc_w -345414233
    //   12957: ixor
    //   12958: ldc2_w 1544078098
    //   12961: l2i
    //   12962: ldc_w 609231485
    //   12965: ixor
    //   12966: ixor
    //   12967: lookupswitch default -> 19061, -1178925364 -> 12992, 1086177616 -> 12950
    //   12992: getfield field_72448_b : D
    //   12995: getstatic Perryc.1 : I
    //   12998: ifeq -> 13012
    //   13001: ldc2_w 1207296935
    //   13004: l2i
    //   13005: ldc_w -1958406156
    //   13008: ixor
    //   13009: goto -> 13020
    //   13012: ldc2_w 1157222878
    //   13015: l2i
    //   13016: ldc_w 43563078
    //   13019: ixor
    //   13020: ldc2_w 1292852039
    //   13023: l2i
    //   13024: ldc_w -1293009210
    //   13027: ixor
    //   13028: ixor
    //   13029: lookupswitch default -> 18983, -1182790631 -> 13056, 860983762 -> 13012
    //   13056: dload #14
    //   13058: getstatic Perryc.0 : I
    //   13061: ifle -> 13075
    //   13064: ldc2_w 1622529634
    //   13067: l2i
    //   13068: ldc_w 886019160
    //   13071: ixor
    //   13072: goto -> 13083
    //   13075: ldc2_w -1527583824
    //   13078: l2i
    //   13079: ldc_w -238025236
    //   13082: ixor
    //   13083: ldc2_w -1063704138
    //   13086: l2i
    //   13087: ldc_w 1829775205
    //   13090: ixor
    //   13091: ixor
    //   13092: lookupswitch default -> 13120, -101495575 -> 18817, 167738994 -> 13075
    //   13120: dload #28
    //   13122: dmul
    //   13123: dadd
    //   13124: getstatic Perryc.c : I
    //   13127: iflt -> 13141
    //   13130: ldc2_w -1258399515
    //   13133: l2i
    //   13134: ldc_w -353552108
    //   13137: ixor
    //   13138: goto -> 13149
    //   13141: ldc2_w 2083708940
    //   13144: l2i
    //   13145: ldc_w -2106533670
    //   13148: ixor
    //   13149: ldc2_w 921956009
    //   13152: l2i
    //   13153: ldc_w -289086767
    //   13156: ixor
    //   13157: ixor
    //   13158: lookupswitch default -> 13184, -2044433015 -> 18937, -2013881092 -> 13141
    //   13184: aload_0
    //   13185: getstatic Perryc.0 : I
    //   13188: ifle -> 13202
    //   13191: ldc2_w 141555331
    //   13194: l2i
    //   13195: ldc_w -305147627
    //   13198: ixor
    //   13199: goto -> 13210
    //   13202: ldc2_w 564476713
    //   13205: l2i
    //   13206: ldc_w 1018753007
    //   13209: ixor
    //   13210: ldc2_w 921432009
    //   13213: l2i
    //   13214: ldc_w -1136480690
    //   13217: ixor
    //   13218: ixor
    //   13219: lookupswitch default -> 19011, -1749772991 -> 13244, 1862886929 -> 13202
    //   13244: getfield field_72449_c : D
    //   13247: getstatic Perryc.1 : I
    //   13250: ifeq -> 13264
    //   13253: ldc2_w -866361955
    //   13256: l2i
    //   13257: ldc_w 610863974
    //   13260: ixor
    //   13261: goto -> 13272
    //   13264: ldc2_w 387580511
    //   13267: l2i
    //   13268: ldc_w -2141541788
    //   13271: ixor
    //   13272: ldc2_w -648772314
    //   13275: l2i
    //   13276: ldc_w 1431790980
    //   13279: ixor
    //   13280: ixor
    //   13281: lookupswitch default -> 13308, -205463742 -> 13264, 1681307225 -> 18875
    //   13308: dload #16
    //   13310: getstatic Perryc.c : I
    //   13313: iflt -> 13327
    //   13316: ldc2_w -1483575538
    //   13319: l2i
    //   13320: ldc_w -650128086
    //   13323: ixor
    //   13324: goto -> 13335
    //   13327: ldc2_w -331473192
    //   13330: l2i
    //   13331: ldc_w 2093162425
    //   13334: ixor
    //   13335: ldc2_w 619745812
    //   13338: l2i
    //   13339: ldc_w -492264097
    //   13342: ixor
    //   13343: ixor
    //   13344: lookupswitch default -> 13372, -1191867025 -> 18887, -1149144652 -> 13327
    //   13372: dload #28
    //   13374: dmul
    //   13375: dadd
    //   13376: getstatic Perryc.1 : I
    //   13379: ifeq -> 13393
    //   13382: ldc2_w 1619745991
    //   13385: l2i
    //   13386: ldc_w -433786120
    //   13389: ixor
    //   13390: goto -> 13401
    //   13393: ldc2_w -109739779
    //   13396: l2i
    //   13397: ldc_w -362666852
    //   13400: ixor
    //   13401: ldc2_w 1421981333
    //   13404: l2i
    //   13405: ldc_w 1429215119
    //   13408: ixor
    //   13409: ixor
    //   13410: lookupswitch default -> 13436, -2023878875 -> 19091, 1816569172 -> 13393
    //   13436: goto -> 13440
    //   13439: athrow
    //   13440: invokespecial <init> : (DDD)V
    //   13443: goto -> 13447
    //   13446: athrow
    //   13447: getstatic Perryc.c : I
    //   13450: iflt -> 13464
    //   13453: ldc2_w 1729675716
    //   13456: l2i
    //   13457: ldc_w -1769263250
    //   13460: ixor
    //   13461: goto -> 13472
    //   13464: ldc2_w 937839004
    //   13467: l2i
    //   13468: ldc_w 1109697427
    //   13471: ixor
    //   13472: ldc2_w 1552430468
    //   13475: l2i
    //   13476: ldc_w 936783613
    //   13479: ixor
    //   13480: ixor
    //   13481: lookupswitch default -> 13508, -1697778221 -> 19165, 377927508 -> 13464
    //   13508: astore_0
    //   13509: goto -> 15857
    //   13512: getstatic Perryc.0 : I
    //   13515: ifle -> 13529
    //   13518: ldc2_w -625669018
    //   13521: l2i
    //   13522: ldc_w 1792711014
    //   13525: ixor
    //   13526: goto -> 13537
    //   13529: ldc2_w -1818181826
    //   13532: l2i
    //   13533: ldc_w -1451037729
    //   13536: ixor
    //   13537: ldc2_w 1546406291
    //   13540: l2i
    //   13541: ldc_w -462987043
    //   13544: ixor
    //   13545: ixor
    //   13546: lookupswitch default -> 18765, -2107015761 -> 13572, 136625230 -> 13529
    //   13572: dload #30
    //   13574: getstatic Perryc.0 : I
    //   13577: ifle -> 13591
    //   13580: ldc2_w 1963952094
    //   13583: l2i
    //   13584: ldc_w 1972811609
    //   13587: ixor
    //   13588: goto -> 13599
    //   13591: ldc2_w -1798741709
    //   13594: l2i
    //   13595: ldc_w -310144280
    //   13598: ixor
    //   13599: ldc2_w -421989040
    //   13602: l2i
    //   13603: ldc_w 1992076762
    //   13606: ixor
    //   13607: ixor
    //   13608: lookupswitch default -> 18785, -1862440947 -> 13591, -382817455 -> 13636
    //   13636: dload #32
    //   13638: dcmpg
    //   13639: ifge -> 13653
    //   13642: ldc2_w -1577966521
    //   13645: l2i
    //   13646: ldc_w -1199499381
    //   13649: ixor
    //   13650: goto -> 13661
    //   13653: ldc2_w -692317358
    //   13656: l2i
    //   13657: ldc_w -808509287
    //   13660: ixor
    //   13661: ldc2_w -57361343
    //   13664: l2i
    //   13665: ldc_w 1207418662
    //   13668: ixor
    //   13669: ixor
    //   13670: tableswitch default -> 13642, -1575997269 -> 13692, -1575997268 -> 14776
    //   13692: getstatic Perryc.1 : I
    //   13695: ifeq -> 13709
    //   13698: ldc2_w 22174191
    //   13701: l2i
    //   13702: ldc_w -2074930851
    //   13705: ixor
    //   13706: goto -> 13717
    //   13709: ldc2_w -628292874
    //   13712: l2i
    //   13713: ldc_w 419445716
    //   13716: ixor
    //   13717: ldc2_w 1243470778
    //   13720: l2i
    //   13721: ldc_w -1820714687
    //   13724: ixor
    //   13725: ixor
    //   13726: lookupswitch default -> 13752, -311816665 -> 13709, 1550223945 -> 18861
    //   13752: iload #7
    //   13754: getstatic Perryc.1 : I
    //   13757: ifeq -> 13771
    //   13760: ldc2_w 416812758
    //   13763: l2i
    //   13764: ldc_w -1009821560
    //   13767: ixor
    //   13768: goto -> 13779
    //   13771: ldc2_w -1270341601
    //   13774: l2i
    //   13775: ldc_w 570277509
    //   13778: ixor
    //   13779: ldc2_w -1397570162
    //   13782: l2i
    //   13783: ldc_w -1033399172
    //   13786: ixor
    //   13787: ixor
    //   13788: lookupswitch default -> 18917, -1245575252 -> 13771, -77541528 -> 13816
    //   13816: iload #4
    //   13818: if_icmple -> 13832
    //   13821: ldc2_w 1157587605
    //   13824: l2i
    //   13825: ldc_w -1362618430
    //   13828: ixor
    //   13829: goto -> 13840
    //   13832: ldc2_w -1854425825
    //   13835: l2i
    //   13836: ldc_w 2067841099
    //   13839: ixor
    //   13840: ldc2_w -1820715147
    //   13843: l2i
    //   13844: ldc_w -21810677
    //   13847: ixor
    //   13848: ixor
    //   13849: tableswitch default -> 13821, -2013376471 -> 13872, -2013376470 -> 13938
    //   13872: getstatic Perryc.1 : I
    //   13875: ifeq -> 13889
    //   13878: ldc2_w -516529265
    //   13881: l2i
    //   13882: ldc_w -606113090
    //   13885: ixor
    //   13886: goto -> 13897
    //   13889: ldc2_w -580082818
    //   13892: l2i
    //   13893: ldc_w -1362264200
    //   13896: ixor
    //   13897: ldc2_w 1986699614
    //   13900: l2i
    //   13901: ldc_w 1463114143
    //   13904: ixor
    //   13905: ixor
    //   13906: lookupswitch default -> 13932, -918065473 -> 13889, 464972272 -> 18895
    //   13932: getstatic net/minecraft/util/EnumFacing.DOWN : Lnet/minecraft/util/EnumFacing;
    //   13935: goto -> 14003
    //   13938: getstatic Perryc.0 : I
    //   13941: ifle -> 13955
    //   13944: ldc2_w -1688246718
    //   13947: l2i
    //   13948: ldc_w -748637716
    //   13951: ixor
    //   13952: goto -> 13963
    //   13955: ldc2_w 1625737265
    //   13958: l2i
    //   13959: ldc_w -904964052
    //   13962: ixor
    //   13963: ldc2_w 351830817
    //   13966: l2i
    //   13967: ldc_w -1888110531
    //   13970: ixor
    //   13971: ixor
    //   13972: lookupswitch default -> 18851, -743248718 -> 13955, 828680961 -> 14000
    //   14000: getstatic net/minecraft/util/EnumFacing.UP : Lnet/minecraft/util/EnumFacing;
    //   14003: getstatic Perryc.c : I
    //   14006: iflt -> 14020
    //   14009: ldc2_w -1688166420
    //   14012: l2i
    //   14013: ldc_w -2117574410
    //   14016: ixor
    //   14017: goto -> 14028
    //   14020: ldc2_w 55503165
    //   14023: l2i
    //   14024: ldc_w -422651781
    //   14027: ixor
    //   14028: ldc2_w 715122074
    //   14031: l2i
    //   14032: ldc_w -1069291291
    //   14035: ixor
    //   14036: ixor
    //   14037: lookupswitch default -> 18769, -260771227 -> 14020, 257702969 -> 14064
    //   14064: astore #34
    //   14066: new net/minecraft/util/math/Vec3d
    //   14069: dup
    //   14070: getstatic Perryc.0 : I
    //   14073: ifle -> 14087
    //   14076: ldc2_w -1426711704
    //   14079: l2i
    //   14080: ldc_w -1859077648
    //   14083: ixor
    //   14084: goto -> 14095
    //   14087: ldc2_w 1218863270
    //   14090: l2i
    //   14091: ldc_w -1872948118
    //   14094: ixor
    //   14095: ldc2_w -847295493
    //   14098: l2i
    //   14099: ldc_w 1853620272
    //   14102: ixor
    //   14103: ixor
    //   14104: lookupswitch default -> 14132, -1731860141 -> 18921, 660941369 -> 14087
    //   14132: aload_0
    //   14133: getstatic Perryc.0 : I
    //   14136: ifle -> 14150
    //   14139: ldc2_w 1942634906
    //   14142: l2i
    //   14143: ldc_w 523960445
    //   14146: ixor
    //   14147: goto -> 14158
    //   14150: ldc2_w -1484708608
    //   14153: l2i
    //   14154: ldc_w -772506727
    //   14157: ixor
    //   14158: ldc2_w 1804668867
    //   14161: l2i
    //   14162: ldc_w -1559605969
    //   14165: ixor
    //   14166: ixor
    //   14167: lookupswitch default -> 14192, -1539752504 -> 14150, -1536556277 -> 18959
    //   14192: getfield field_72450_a : D
    //   14195: getstatic Perryc.0 : I
    //   14198: ifle -> 14212
    //   14201: ldc2_w 990045943
    //   14204: l2i
    //   14205: ldc_w 1780898863
    //   14208: ixor
    //   14209: goto -> 14220
    //   14212: ldc2_w -444679770
    //   14215: l2i
    //   14216: ldc_w 1987013716
    //   14219: ixor
    //   14220: ldc2_w -1780536765
    //   14223: l2i
    //   14224: ldc_w 1807814341
    //   14227: ixor
    //   14228: ixor
    //   14229: lookupswitch default -> 14256, -1355112866 -> 18877, 1028671882 -> 14212
    //   14256: dload #12
    //   14258: getstatic Perryc.1 : I
    //   14261: ifeq -> 14275
    //   14264: ldc2_w 712788520
    //   14267: l2i
    //   14268: ldc_w -128751995
    //   14271: ixor
    //   14272: goto -> 14283
    //   14275: ldc2_w 1644430739
    //   14278: l2i
    //   14279: ldc_w -298776041
    //   14282: ixor
    //   14283: ldc2_w -1815968242
    //   14286: l2i
    //   14287: ldc_w -2133665896
    //   14290: ixor
    //   14291: ixor
    //   14292: lookupswitch default -> 14320, -1052803781 -> 18999, 1648498633 -> 14275
    //   14320: dload #30
    //   14322: dmul
    //   14323: dadd
    //   14324: getstatic Perryc.0 : I
    //   14327: ifle -> 14341
    //   14330: ldc2_w -1461596567
    //   14333: l2i
    //   14334: ldc_w -184313765
    //   14337: ixor
    //   14338: goto -> 14349
    //   14341: ldc2_w -539054917
    //   14344: l2i
    //   14345: ldc_w -1084528956
    //   14348: ixor
    //   14349: ldc2_w 1113408497
    //   14352: l2i
    //   14353: ldc_w 1812606069
    //   14356: ixor
    //   14357: ixor
    //   14358: lookupswitch default -> 19069, 1322427899 -> 14384, 1941256630 -> 14341
    //   14384: dload #24
    //   14386: getstatic Perryc.1 : I
    //   14389: ifeq -> 14403
    //   14392: ldc2_w 1763659314
    //   14395: l2i
    //   14396: ldc_w 373276296
    //   14399: ixor
    //   14400: goto -> 14411
    //   14403: ldc2_w -1482553388
    //   14406: l2i
    //   14407: ldc_w -475249797
    //   14410: ixor
    //   14411: ldc2_w -1517915730
    //   14414: l2i
    //   14415: ldc_w -1005291973
    //   14418: ixor
    //   14419: ixor
    //   14420: lookupswitch default -> 19103, 515045167 -> 14403, 630997818 -> 14448
    //   14448: aload_0
    //   14449: getstatic Perryc.c : I
    //   14452: iflt -> 14466
    //   14455: ldc2_w 849324656
    //   14458: l2i
    //   14459: ldc_w 62311266
    //   14462: ixor
    //   14463: goto -> 14474
    //   14466: ldc2_w -1974593675
    //   14469: l2i
    //   14470: ldc_w -1404447948
    //   14473: ixor
    //   14474: ldc2_w 15953530
    //   14477: l2i
    //   14478: ldc_w 445365542
    //   14481: ixor
    //   14482: ixor
    //   14483: lookupswitch default -> 14508, 726774350 -> 19219, 1851898728 -> 14466
    //   14508: getfield field_72449_c : D
    //   14511: getstatic Perryc.c : I
    //   14514: iflt -> 14528
    //   14517: ldc2_w 38314515
    //   14520: l2i
    //   14521: ldc_w 694078023
    //   14524: ixor
    //   14525: goto -> 14536
    //   14528: ldc2_w -994155818
    //   14531: l2i
    //   14532: ldc_w 457829909
    //   14535: ixor
    //   14536: ldc2_w -1122062563
    //   14539: l2i
    //   14540: ldc_w -1034110083
    //   14543: ixor
    //   14544: ixor
    //   14545: lookupswitch default -> 18773, -1598711645 -> 14572, 1414822964 -> 14528
    //   14572: dload #16
    //   14574: getstatic Perryc.1 : I
    //   14577: ifeq -> 14591
    //   14580: ldc2_w -1388935142
    //   14583: l2i
    //   14584: ldc_w 1638662182
    //   14587: ixor
    //   14588: goto -> 14599
    //   14591: ldc2_w 2009715027
    //   14594: l2i
    //   14595: ldc_w -198927407
    //   14598: ixor
    //   14599: ldc2_w 1448061278
    //   14602: l2i
    //   14603: ldc_w 59917332
    //   14606: ixor
    //   14607: ixor
    //   14608: lookupswitch default -> 14636, -1723374218 -> 18931, 1107834809 -> 14591
    //   14636: dload #30
    //   14638: dmul
    //   14639: dadd
    //   14640: getstatic Perryc.0 : I
    //   14643: ifle -> 14657
    //   14646: ldc2_w 1393142000
    //   14649: l2i
    //   14650: ldc_w -2064777674
    //   14653: ixor
    //   14654: goto -> 14665
    //   14657: ldc2_w -1236578284
    //   14660: l2i
    //   14661: ldc_w -737385082
    //   14664: ixor
    //   14665: ldc2_w -2138255089
    //   14668: l2i
    //   14669: ldc_w 213584476
    //   14672: ixor
    //   14673: ixor
    //   14674: lookupswitch default -> 18923, -294588735 -> 14700, 1540590997 -> 14657
    //   14700: goto -> 14704
    //   14703: athrow
    //   14704: invokespecial <init> : (DDD)V
    //   14707: goto -> 14711
    //   14710: athrow
    //   14711: getstatic Perryc.c : I
    //   14714: iflt -> 14728
    //   14717: ldc2_w -616117739
    //   14720: l2i
    //   14721: ldc_w -45034089
    //   14724: ixor
    //   14725: goto -> 14736
    //   14728: ldc2_w 1270752716
    //   14731: l2i
    //   14732: ldc_w 1840086935
    //   14735: ixor
    //   14736: ldc2_w 694009136
    //   14739: l2i
    //   14740: ldc_w -2032727519
    //   14743: ixor
    //   14744: ixor
    //   14745: lookupswitch default -> 18977, -1986400950 -> 14772, -1986221933 -> 14728
    //   14772: astore_0
    //   14773: goto -> 15857
    //   14776: getstatic Perryc.0 : I
    //   14779: ifle -> 14793
    //   14782: ldc2_w -1917574887
    //   14785: l2i
    //   14786: ldc_w 666002595
    //   14789: ixor
    //   14790: goto -> 14801
    //   14793: ldc2_w -1265429035
    //   14796: l2i
    //   14797: ldc_w -143032140
    //   14800: ixor
    //   14801: ldc2_w 1570491355
    //   14804: l2i
    //   14805: ldc_w 1278377396
    //   14808: ixor
    //   14809: ixor
    //   14810: lookupswitch default -> 14836, -1146096683 -> 19229, -455665963 -> 14793
    //   14836: iload #8
    //   14838: getstatic Perryc.c : I
    //   14841: iflt -> 14855
    //   14844: ldc2_w -1604875612
    //   14847: l2i
    //   14848: ldc_w 909104566
    //   14851: ixor
    //   14852: goto -> 14863
    //   14855: ldc2_w -2046840311
    //   14858: l2i
    //   14859: ldc_w 1502716649
    //   14862: ixor
    //   14863: ldc2_w -771969670
    //   14866: l2i
    //   14867: ldc_w 1598343327
    //   14870: ixor
    //   14871: ixor
    //   14872: lookupswitch default -> 18767, 415251191 -> 14855, 1389786373 -> 14900
    //   14900: iload #5
    //   14902: if_icmple -> 14916
    //   14905: ldc2_w 1511037972
    //   14908: l2i
    //   14909: ldc_w 643301149
    //   14912: ixor
    //   14913: goto -> 14924
    //   14916: ldc2_w -1000739670
    //   14919: l2i
    //   14920: ldc_w -1205956692
    //   14923: ixor
    //   14924: ldc2_w 849423051
    //   14927: l2i
    //   14928: ldc_w 540408789
    //   14931: ixor
    //   14932: ixor
    //   14933: tableswitch default -> 14905, 1859367447 -> 14956, 1859367448 -> 15022
    //   14956: getstatic Perryc.0 : I
    //   14959: ifle -> 14973
    //   14962: ldc2_w 1304035392
    //   14965: l2i
    //   14966: ldc_w 1580181089
    //   14969: ixor
    //   14970: goto -> 14981
    //   14973: ldc2_w -1861119345
    //   14976: l2i
    //   14977: ldc_w -315012530
    //   14980: ixor
    //   14981: ldc2_w -1123157496
    //   14984: l2i
    //   14985: ldc_w 1889864997
    //   14988: ixor
    //   14989: ixor
    //   14990: lookupswitch default -> 15016, -1299510406 -> 14973, -566406900 -> 18777
    //   15016: getstatic net/minecraft/util/EnumFacing.NORTH : Lnet/minecraft/util/EnumFacing;
    //   15019: goto -> 15087
    //   15022: getstatic Perryc.1 : I
    //   15025: ifeq -> 15039
    //   15028: ldc2_w 1556675351
    //   15031: l2i
    //   15032: ldc_w -1063122352
    //   15035: ixor
    //   15036: goto -> 15047
    //   15039: ldc2_w -1904580784
    //   15042: l2i
    //   15043: ldc_w 946054290
    //   15046: ixor
    //   15047: ldc2_w 2133498252
    //   15050: l2i
    //   15051: ldc_w -1991335164
    //   15054: ixor
    //   15055: ixor
    //   15056: lookupswitch default -> 19155, 1081997642 -> 15084, 1779354575 -> 15039
    //   15084: getstatic net/minecraft/util/EnumFacing.SOUTH : Lnet/minecraft/util/EnumFacing;
    //   15087: getstatic Perryc.0 : I
    //   15090: ifle -> 15104
    //   15093: ldc2_w -1341292807
    //   15096: l2i
    //   15097: ldc_w 188075515
    //   15100: ixor
    //   15101: goto -> 15112
    //   15104: ldc2_w -1896202735
    //   15107: l2i
    //   15108: ldc_w 1329582987
    //   15111: ixor
    //   15112: ldc2_w 1944303149
    //   15115: l2i
    //   15116: ldc_w 1600447880
    //   15119: ixor
    //   15120: ixor
    //   15121: lookupswitch default -> 19231, -1749032793 -> 15104, -314393025 -> 15148
    //   15148: astore #34
    //   15150: new net/minecraft/util/math/Vec3d
    //   15153: dup
    //   15154: getstatic Perryc.1 : I
    //   15157: ifeq -> 15171
    //   15160: ldc2_w -93446962
    //   15163: l2i
    //   15164: ldc_w -955440995
    //   15167: ixor
    //   15168: goto -> 15179
    //   15171: ldc2_w -897410054
    //   15174: l2i
    //   15175: ldc_w -1242105050
    //   15178: ixor
    //   15179: ldc2_w 1150296661
    //   15182: l2i
    //   15183: ldc_w -632112651
    //   15186: ixor
    //   15187: ixor
    //   15188: lookupswitch default -> 15216, -1549686797 -> 18819, 1224730481 -> 15171
    //   15216: aload_0
    //   15217: getstatic Perryc.1 : I
    //   15220: ifeq -> 15234
    //   15223: ldc2_w 1555783255
    //   15226: l2i
    //   15227: ldc_w -1343778705
    //   15230: ixor
    //   15231: goto -> 15242
    //   15234: ldc2_w 1525176526
    //   15237: l2i
    //   15238: ldc_w -152058865
    //   15241: ixor
    //   15242: ldc2_w -96021117
    //   15245: l2i
    //   15246: ldc_w -1492976892
    //   15249: ixor
    //   15250: ixor
    //   15251: lookupswitch default -> 19063, -1374101313 -> 15234, -247221690 -> 15276
    //   15276: getfield field_72450_a : D
    //   15279: getstatic Perryc.1 : I
    //   15282: ifeq -> 15296
    //   15285: ldc2_w -1222332955
    //   15288: l2i
    //   15289: ldc_w 1246657089
    //   15292: ixor
    //   15293: goto -> 15304
    //   15296: ldc2_w 1131429433
    //   15299: l2i
    //   15300: ldc_w 2124819872
    //   15303: ixor
    //   15304: ldc2_w -369444656
    //   15307: l2i
    //   15308: ldc_w -1568106395
    //   15311: ixor
    //   15312: ixor
    //   15313: lookupswitch default -> 19195, -1239877871 -> 15296, 1990472492 -> 15340
    //   15340: dload #12
    //   15342: getstatic Perryc.1 : I
    //   15345: ifeq -> 15359
    //   15348: ldc2_w 1327253615
    //   15351: l2i
    //   15352: ldc_w 224432723
    //   15355: ixor
    //   15356: goto -> 15367
    //   15359: ldc2_w 799579035
    //   15362: l2i
    //   15363: ldc_w 2066474185
    //   15366: ixor
    //   15367: ldc2_w -811163473
    //   15370: l2i
    //   15371: ldc_w -177344765
    //   15374: ixor
    //   15375: ixor
    //   15376: lookupswitch default -> 15404, 1220430787 -> 15359, 2025297296 -> 18879
    //   15404: dload #32
    //   15406: dmul
    //   15407: dadd
    //   15408: getstatic Perryc.1 : I
    //   15411: ifeq -> 15425
    //   15414: ldc2_w 587073055
    //   15417: l2i
    //   15418: ldc_w -1248441936
    //   15421: ixor
    //   15422: goto -> 15433
    //   15425: ldc2_w 1819993400
    //   15428: l2i
    //   15429: ldc_w -1858536906
    //   15432: ixor
    //   15433: ldc2_w -1552477093
    //   15436: l2i
    //   15437: ldc_w 491112538
    //   15440: ixor
    //   15441: ixor
    //   15442: lookupswitch default -> 15468, 422140477 -> 15425, 693801902 -> 19201
    //   15468: aload_0
    //   15469: getstatic Perryc.0 : I
    //   15472: ifle -> 15486
    //   15475: ldc2_w -1182060168
    //   15478: l2i
    //   15479: ldc_w 1557596734
    //   15482: ixor
    //   15483: goto -> 15494
    //   15486: ldc2_w -1996847966
    //   15489: l2i
    //   15490: ldc_w 800249050
    //   15493: ixor
    //   15494: ldc2_w 906236890
    //   15497: l2i
    //   15498: ldc_w -1205996878
    //   15501: ixor
    //   15502: ixor
    //   15503: lookupswitch default -> 19053, 693219600 -> 15528, 1799739950 -> 15486
    //   15528: getfield field_72448_b : D
    //   15531: getstatic Perryc.0 : I
    //   15534: ifle -> 15548
    //   15537: ldc2_w 1069081510
    //   15540: l2i
    //   15541: ldc_w -2108546400
    //   15544: ixor
    //   15545: goto -> 15556
    //   15548: ldc2_w 115096714
    //   15551: l2i
    //   15552: ldc_w 355718645
    //   15555: ixor
    //   15556: ldc2_w 25432565
    //   15559: l2i
    //   15560: ldc_w 1846554367
    //   15563: ixor
    //   15564: ixor
    //   15565: lookupswitch default -> 15592, -763429364 -> 19113, 1226357020 -> 15548
    //   15592: dload #14
    //   15594: getstatic Perryc.1 : I
    //   15597: ifeq -> 15611
    //   15600: ldc2_w 1898699862
    //   15603: l2i
    //   15604: ldc_w 525016333
    //   15607: ixor
    //   15608: goto -> 15619
    //   15611: ldc2_w 686735233
    //   15614: l2i
    //   15615: ldc_w 381601939
    //   15618: ixor
    //   15619: ldc2_w 2075159102
    //   15622: l2i
    //   15623: ldc_w -1411844695
    //   15626: ixor
    //   15627: ixor
    //   15628: lookupswitch default -> 15656, -1106747700 -> 18891, -208566469 -> 15611
    //   15656: dload #32
    //   15658: dmul
    //   15659: dadd
    //   15660: getstatic Perryc.1 : I
    //   15663: ifeq -> 15677
    //   15666: ldc2_w -316619351
    //   15669: l2i
    //   15670: ldc_w 1724773848
    //   15673: ixor
    //   15674: goto -> 15685
    //   15677: ldc2_w 167430954
    //   15680: l2i
    //   15681: ldc_w 957837296
    //   15684: ixor
    //   15685: ldc2_w 1329028123
    //   15688: l2i
    //   15689: ldc_w -1169099049
    //   15692: ixor
    //   15693: ixor
    //   15694: lookupswitch default -> 19145, -980808170 -> 15720, 2123012797 -> 15677
    //   15720: dload #26
    //   15722: getstatic Perryc.c : I
    //   15725: iflt -> 15739
    //   15728: ldc2_w 2002176367
    //   15731: l2i
    //   15732: ldc_w -659530930
    //   15735: ixor
    //   15736: goto -> 15747
    //   15739: ldc2_w 1476773509
    //   15742: l2i
    //   15743: ldc_w 984682502
    //   15746: ixor
    //   15747: ldc2_w 1709335847
    //   15750: l2i
    //   15751: ldc_w 1732147441
    //   15754: ixor
    //   15755: ixor
    //   15756: lookupswitch default -> 15784, -1388670985 -> 19247, -138843083 -> 15739
    //   15784: goto -> 15788
    //   15787: athrow
    //   15788: invokespecial <init> : (DDD)V
    //   15791: goto -> 15795
    //   15794: athrow
    //   15795: getstatic Perryc.c : I
    //   15798: iflt -> 15812
    //   15801: ldc2_w -855873971
    //   15804: l2i
    //   15805: ldc_w -1655581792
    //   15808: ixor
    //   15809: goto -> 15820
    //   15812: ldc2_w 516544173
    //   15815: l2i
    //   15816: ldc_w 614597735
    //   15819: ixor
    //   15820: ldc2_w -905998399
    //   15823: l2i
    //   15824: ldc_w 1447906081
    //   15827: ixor
    //   15828: ixor
    //   15829: lookupswitch default -> 15856, -2101104739 -> 15812, -836800243 -> 19193
    //   15856: astore_0
    //   15857: getstatic Perryc.0 : I
    //   15860: ifle -> 15874
    //   15863: ldc2_w 1552809035
    //   15866: l2i
    //   15867: ldc_w 429858708
    //   15870: ixor
    //   15871: goto -> 15882
    //   15874: ldc2_w -1359535053
    //   15877: l2i
    //   15878: ldc_w -871436643
    //   15881: ixor
    //   15882: ldc2_w -880092103
    //   15885: l2i
    //   15886: ldc_w 1059201177
    //   15889: ixor
    //   15890: ixor
    //   15891: lookupswitch default -> 18905, -1773062642 -> 15916, -1313202305 -> 15874
    //   15916: aload_0
    //   15917: getstatic Perryc.c : I
    //   15920: iflt -> 15934
    //   15923: ldc2_w -1611406633
    //   15926: l2i
    //   15927: ldc_w 1616459896
    //   15930: ixor
    //   15931: goto -> 15942
    //   15934: ldc2_w -1351821624
    //   15937: l2i
    //   15938: ldc_w 1114972761
    //   15941: ixor
    //   15942: ldc2_w -1504699288
    //   15945: l2i
    //   15946: ldc_w -550365818
    //   15949: ixor
    //   15950: ixor
    //   15951: lookupswitch default -> 15976, -2033659071 -> 19205, -1097013741 -> 15934
    //   15976: getfield field_72450_a : D
    //   15979: getstatic Perryc.0 : I
    //   15982: ifle -> 15996
    //   15985: ldc2_w 1397872210
    //   15988: l2i
    //   15989: ldc_w -1622537641
    //   15992: ixor
    //   15993: goto -> 16004
    //   15996: ldc2_w -430592908
    //   15999: l2i
    //   16000: ldc_w -1569976284
    //   16003: ixor
    //   16004: ldc2_w 1763053735
    //   16007: l2i
    //   16008: ldc_w 1637179111
    //   16011: ixor
    //   16012: ixor
    //   16013: lookupswitch default -> 16040, -996634043 -> 18933, 1775009904 -> 15996
    //   16040: goto -> 16044
    //   16043: athrow
    //   16044: invokestatic func_76128_c : (D)I
    //   16047: goto -> 16051
    //   16050: athrow
    //   16051: getstatic Perryc.1 : I
    //   16054: ifeq -> 16068
    //   16057: ldc2_w -1842633591
    //   16060: l2i
    //   16061: ldc_w 311418974
    //   16064: ixor
    //   16065: goto -> 16076
    //   16068: ldc2_w 1404903752
    //   16071: l2i
    //   16072: ldc_w -1675331064
    //   16075: ixor
    //   16076: ldc2_w 1430520140
    //   16079: l2i
    //   16080: ldc_w -1921801979
    //   16083: ixor
    //   16084: ixor
    //   16085: lookupswitch default -> 16112, 117735243 -> 16068, 1486087326 -> 18883
    //   16112: aload #34
    //   16114: getstatic Perryc.1 : I
    //   16117: ifeq -> 16131
    //   16120: ldc2_w 1676549726
    //   16123: l2i
    //   16124: ldc_w 1782134805
    //   16127: ixor
    //   16128: goto -> 16139
    //   16131: ldc2_w 715824049
    //   16134: l2i
    //   16135: ldc_w 1117352842
    //   16138: ixor
    //   16139: ldc2_w 1996565946
    //   16142: l2i
    //   16143: ldc_w -1150166520
    //   16146: ixor
    //   16147: ixor
    //   16148: lookupswitch default -> 18997, -1539104887 -> 16176, -978857479 -> 16131
    //   16176: getstatic net/minecraft/util/EnumFacing.EAST : Lnet/minecraft/util/EnumFacing;
    //   16179: if_acmpne -> 16193
    //   16182: ldc2_w -2044220757
    //   16185: l2i
    //   16186: ldc_w 1618444716
    //   16189: ixor
    //   16190: goto -> 16201
    //   16193: ldc2_w -2115530683
    //   16196: l2i
    //   16197: ldc_w 1740094277
    //   16200: ixor
    //   16201: ldc2_w 1262353179
    //   16204: l2i
    //   16205: ldc_w -1622623057
    //   16208: ixor
    //   16209: ixor
    //   16210: tableswitch default -> 16182, 841313459 -> 16232, 841313460 -> 16243
    //   16232: ldc2_w 266374628
    //   16235: l2i
    //   16236: ldc_w 266374629
    //   16239: ixor
    //   16240: goto -> 16251
    //   16243: ldc2_w 1926099689
    //   16246: l2i
    //   16247: ldc_w 1926099689
    //   16250: ixor
    //   16251: isub
    //   16252: getstatic Perryc.0 : I
    //   16255: ifle -> 16269
    //   16258: ldc2_w 232849965
    //   16261: l2i
    //   16262: ldc_w -1369492792
    //   16265: ixor
    //   16266: goto -> 16277
    //   16269: ldc2_w -382038408
    //   16272: l2i
    //   16273: ldc_w 946892053
    //   16276: ixor
    //   16277: ldc2_w 1307123157
    //   16280: l2i
    //   16281: ldc_w 454918702
    //   16284: ixor
    //   16285: ixor
    //   16286: lookupswitch default -> 19017, -2017559402 -> 16312, -179654882 -> 16269
    //   16312: istore_3
    //   16313: getstatic Perryc.1 : I
    //   16316: ifeq -> 16330
    //   16319: ldc2_w -1227966936
    //   16322: l2i
    //   16323: ldc_w 217249686
    //   16326: ixor
    //   16327: goto -> 16338
    //   16330: ldc2_w 922169670
    //   16333: l2i
    //   16334: ldc_w -952663276
    //   16337: ixor
    //   16338: ldc2_w 611375130
    //   16341: l2i
    //   16342: ldc_w 279644448
    //   16345: ixor
    //   16346: ixor
    //   16347: lookupswitch default -> 19083, -1897426812 -> 16330, -988060824 -> 16372
    //   16372: aload_0
    //   16373: getstatic Perryc.1 : I
    //   16376: ifeq -> 16390
    //   16379: ldc2_w 767248086
    //   16382: l2i
    //   16383: ldc_w -337254617
    //   16386: ixor
    //   16387: goto -> 16398
    //   16390: ldc2_w -784027149
    //   16393: l2i
    //   16394: ldc_w 2122244244
    //   16397: ixor
    //   16398: ldc2_w -300577994
    //   16401: l2i
    //   16402: ldc_w -1147131141
    //   16405: ixor
    //   16406: ixor
    //   16407: lookupswitch default -> 16432, -1813315524 -> 18947, 890301756 -> 16390
    //   16432: getfield field_72448_b : D
    //   16435: getstatic Perryc.0 : I
    //   16438: ifle -> 16452
    //   16441: ldc2_w 797628474
    //   16444: l2i
    //   16445: ldc_w -1003006435
    //   16448: ixor
    //   16449: goto -> 16460
    //   16452: ldc2_w 63778692
    //   16455: l2i
    //   16456: ldc_w -1910243911
    //   16459: ixor
    //   16460: ldc2_w -1559043412
    //   16463: l2i
    //   16464: ldc_w -458651415
    //   16467: ixor
    //   16468: ixor
    //   16469: lookupswitch default -> 19039, -1408834462 -> 16452, -900351880 -> 16496
    //   16496: goto -> 16500
    //   16499: athrow
    //   16500: invokestatic func_76128_c : (D)I
    //   16503: goto -> 16507
    //   16506: athrow
    //   16507: getstatic Perryc.c : I
    //   16510: iflt -> 16524
    //   16513: ldc2_w -1953536546
    //   16516: l2i
    //   16517: ldc_w -1201271016
    //   16520: ixor
    //   16521: goto -> 16532
    //   16524: ldc2_w 1389542005
    //   16527: l2i
    //   16528: ldc_w 1542961591
    //   16531: ixor
    //   16532: ldc2_w -376173406
    //   16535: l2i
    //   16536: ldc_w -416141359
    //   16539: ixor
    //   16540: ixor
    //   16541: lookupswitch default -> 16568, -1126770726 -> 16524, 1028606389 -> 18949
    //   16568: aload #34
    //   16570: getstatic Perryc.c : I
    //   16573: iflt -> 16587
    //   16576: ldc2_w 1538268573
    //   16579: l2i
    //   16580: ldc_w 566561828
    //   16583: ixor
    //   16584: goto -> 16595
    //   16587: ldc2_w -1607854713
    //   16590: l2i
    //   16591: ldc_w 1652397979
    //   16594: ixor
    //   16595: ldc2_w -583557887
    //   16598: l2i
    //   16599: ldc_w 2110545036
    //   16602: ixor
    //   16603: ixor
    //   16604: lookupswitch default -> 19143, -628174796 -> 16587, 1655456657 -> 16632
    //   16632: getstatic net/minecraft/util/EnumFacing.UP : Lnet/minecraft/util/EnumFacing;
    //   16635: if_acmpne -> 16649
    //   16638: ldc2_w -1945644640
    //   16641: l2i
    //   16642: ldc_w 1121130341
    //   16645: ixor
    //   16646: goto -> 16657
    //   16649: ldc2_w 211988883
    //   16652: l2i
    //   16653: ldc_w -1032423593
    //   16656: ixor
    //   16657: ldc2_w -228806962
    //   16660: l2i
    //   16661: ldc_w -424395597
    //   16664: ixor
    //   16665: ixor
    //   16666: tableswitch default -> 16638, -633580360 -> 16688, -633580359 -> 16699
    //   16688: ldc2_w 1703868440
    //   16691: l2i
    //   16692: ldc_w 1703868441
    //   16695: ixor
    //   16696: goto -> 16707
    //   16699: ldc2_w 718117176
    //   16702: l2i
    //   16703: ldc_w 718117176
    //   16706: ixor
    //   16707: isub
    //   16708: getstatic Perryc.0 : I
    //   16711: ifle -> 16725
    //   16714: ldc2_w -1690403770
    //   16717: l2i
    //   16718: ldc_w -1417283693
    //   16721: ixor
    //   16722: goto -> 16733
    //   16725: ldc2_w 201738851
    //   16728: l2i
    //   16729: ldc_w -886757070
    //   16732: ixor
    //   16733: ldc2_w 553321382
    //   16736: l2i
    //   16737: ldc_w 1952244861
    //   16740: ixor
    //   16741: ixor
    //   16742: lookupswitch default -> 16768, -1113117846 -> 16725, 1679584270 -> 18897
    //   16768: istore #4
    //   16770: getstatic Perryc.c : I
    //   16773: iflt -> 16787
    //   16776: ldc2_w -330361660
    //   16779: l2i
    //   16780: ldc_w -548661929
    //   16783: ixor
    //   16784: goto -> 16795
    //   16787: ldc2_w -1193479594
    //   16790: l2i
    //   16791: ldc_w -1707385565
    //   16794: ixor
    //   16795: ldc2_w 1571604153
    //   16798: l2i
    //   16799: ldc_w -1826766861
    //   16802: ixor
    //   16803: ixor
    //   16804: lookupswitch default -> 16832, -38635303 -> 19007, 1310432011 -> 16787
    //   16832: aload_0
    //   16833: getstatic Perryc.0 : I
    //   16836: ifle -> 16850
    //   16839: ldc2_w -305500838
    //   16842: l2i
    //   16843: ldc_w 1357508019
    //   16846: ixor
    //   16847: goto -> 16858
    //   16850: ldc2_w 803250155
    //   16853: l2i
    //   16854: ldc_w 1621432750
    //   16857: ixor
    //   16858: ldc2_w -2137717589
    //   16861: l2i
    //   16862: ldc_w -1803370128
    //   16865: ixor
    //   16866: ixor
    //   16867: lookupswitch default -> 19093, -1456192206 -> 16850, 1532117918 -> 16892
    //   16892: getfield field_72449_c : D
    //   16895: getstatic Perryc.1 : I
    //   16898: ifeq -> 16912
    //   16901: ldc2_w 721053709
    //   16904: l2i
    //   16905: ldc_w 312810219
    //   16908: ixor
    //   16909: goto -> 16920
    //   16912: ldc2_w -1836231052
    //   16915: l2i
    //   16916: ldc_w -634192734
    //   16919: ixor
    //   16920: ldc2_w -943372396
    //   16923: l2i
    //   16924: ldc_w 1740172789
    //   16927: ixor
    //   16928: ixor
    //   16929: lookupswitch default -> 16956, -1742546809 -> 18827, 1679663739 -> 16912
    //   16956: goto -> 16960
    //   16959: athrow
    //   16960: invokestatic func_76128_c : (D)I
    //   16963: goto -> 16967
    //   16966: athrow
    //   16967: getstatic Perryc.0 : I
    //   16970: ifle -> 16984
    //   16973: ldc2_w 143854698
    //   16976: l2i
    //   16977: ldc_w -690979252
    //   16980: ixor
    //   16981: goto -> 16992
    //   16984: ldc2_w 1938551197
    //   16987: l2i
    //   16988: ldc_w -2096992652
    //   16991: ixor
    //   16992: ldc2_w 693448054
    //   16995: l2i
    //   16996: ldc_w 1801928037
    //   16999: ixor
    //   17000: ixor
    //   17001: lookupswitch default -> 19057, -1670290891 -> 16984, -1296330758 -> 17028
    //   17028: aload #34
    //   17030: getstatic Perryc.c : I
    //   17033: iflt -> 17047
    //   17036: ldc2_w 1921830123
    //   17039: l2i
    //   17040: ldc_w -461114339
    //   17043: ixor
    //   17044: goto -> 17055
    //   17047: ldc2_w -501060405
    //   17050: l2i
    //   17051: ldc_w 1132869337
    //   17054: ixor
    //   17055: ldc2_w -1325426889
    //   17058: l2i
    //   17059: ldc_w -946837779
    //   17062: ixor
    //   17063: ixor
    //   17064: lookupswitch default -> 19121, -691295288 -> 17092, -513750740 -> 17047
    //   17092: getstatic net/minecraft/util/EnumFacing.SOUTH : Lnet/minecraft/util/EnumFacing;
    //   17095: if_acmpne -> 17109
    //   17098: ldc2_w -406682122
    //   17101: l2i
    //   17102: ldc_w 385234900
    //   17105: ixor
    //   17106: goto -> 17117
    //   17109: ldc2_w -429387787
    //   17112: l2i
    //   17113: ldc_w 391953864
    //   17116: ixor
    //   17117: ldc2_w -2042717154
    //   17120: l2i
    //   17121: ldc_w 822465331
    //   17124: ixor
    //   17125: ixor
    //   17126: tableswitch default -> 17098, 1175452943 -> 17148, 1175452944 -> 17159
    //   17148: ldc2_w -1821106808
    //   17151: l2i
    //   17152: ldc_w -1821106807
    //   17155: ixor
    //   17156: goto -> 17167
    //   17159: ldc2_w 2102492244
    //   17162: l2i
    //   17163: ldc_w 2102492244
    //   17166: ixor
    //   17167: isub
    //   17168: getstatic Perryc.1 : I
    //   17171: ifeq -> 17185
    //   17174: ldc2_w 1382116780
    //   17177: l2i
    //   17178: ldc_w 283689964
    //   17181: ixor
    //   17182: goto -> 17193
    //   17185: ldc2_w -2129362701
    //   17188: l2i
    //   17189: ldc_w -1271090871
    //   17192: ixor
    //   17193: ldc2_w 1555704289
    //   17196: l2i
    //   17197: ldc_w -258531127
    //   17200: ixor
    //   17201: ixor
    //   17202: lookupswitch default -> 17228, -291199128 -> 19185, 1802637081 -> 17185
    //   17228: istore #5
    //   17230: new net/minecraft/util/math/BlockPos
    //   17233: dup
    //   17234: getstatic Perryc.1 : I
    //   17237: ifeq -> 17251
    //   17240: ldc2_w 430643031
    //   17243: l2i
    //   17244: ldc_w -690684642
    //   17247: ixor
    //   17248: goto -> 17259
    //   17251: ldc2_w -1652609727
    //   17254: l2i
    //   17255: ldc_w 114792932
    //   17258: ixor
    //   17259: ldc2_w -1743675555
    //   17262: l2i
    //   17263: ldc_w -579241056
    //   17266: ixor
    //   17267: ixor
    //   17268: lookupswitch default -> 17296, -1978200396 -> 18825, 818132905 -> 17251
    //   17296: iload_3
    //   17297: getstatic Perryc.0 : I
    //   17300: ifle -> 17314
    //   17303: ldc2_w 775007638
    //   17306: l2i
    //   17307: ldc_w -870846958
    //   17310: ixor
    //   17311: goto -> 17322
    //   17314: ldc2_w -1510296753
    //   17317: l2i
    //   17318: ldc_w 382554343
    //   17321: ixor
    //   17322: ldc2_w -1769320832
    //   17325: l2i
    //   17326: ldc_w -456527468
    //   17329: ixor
    //   17330: ixor
    //   17331: lookupswitch default -> 17356, -1872364400 -> 18871, 2041144441 -> 17314
    //   17356: iload #4
    //   17358: getstatic Perryc.1 : I
    //   17361: ifeq -> 17375
    //   17364: ldc2_w -1535659592
    //   17367: l2i
    //   17368: ldc_w 1384144666
    //   17371: ixor
    //   17372: goto -> 17383
    //   17375: ldc2_w 833790890
    //   17378: l2i
    //   17379: ldc_w -334906962
    //   17382: ixor
    //   17383: ldc2_w -110370968
    //   17386: l2i
    //   17387: ldc_w -785103166
    //   17390: ixor
    //   17391: ixor
    //   17392: lookupswitch default -> 17420, -559384824 -> 19187, -80729673 -> 17375
    //   17420: iload #5
    //   17422: getstatic Perryc.0 : I
    //   17425: ifle -> 17439
    //   17428: ldc2_w 1859350032
    //   17431: l2i
    //   17432: ldc_w -463506768
    //   17435: ixor
    //   17436: goto -> 17447
    //   17439: ldc2_w 858993175
    //   17442: l2i
    //   17443: ldc_w 1555066536
    //   17446: ixor
    //   17447: ldc2_w -671521723
    //   17450: l2i
    //   17451: ldc_w -957944752
    //   17454: ixor
    //   17455: ixor
    //   17456: lookupswitch default -> 17484, -1684826955 -> 19223, 1366609133 -> 17439
    //   17484: goto -> 17488
    //   17487: athrow
    //   17488: invokespecial <init> : (III)V
    //   17491: goto -> 17495
    //   17494: athrow
    //   17495: getstatic Perryc.1 : I
    //   17498: ifeq -> 17512
    //   17501: ldc2_w -871618236
    //   17504: l2i
    //   17505: ldc_w -721431323
    //   17508: ixor
    //   17509: goto -> 17520
    //   17512: ldc2_w -966202757
    //   17515: l2i
    //   17516: ldc_w -100783492
    //   17519: ixor
    //   17520: ldc2_w 1674748475
    //   17523: l2i
    //   17524: ldc_w 1865686690
    //   17527: ixor
    //   17528: ixor
    //   17529: lookupswitch default -> 19041, 336937272 -> 17512, 863009950 -> 17556
    //   17556: astore #9
    //   17558: getstatic Perryc.1 : I
    //   17561: ifeq -> 17575
    //   17564: ldc2_w 647845333
    //   17567: l2i
    //   17568: ldc_w 279412254
    //   17571: ixor
    //   17572: goto -> 17583
    //   17575: ldc2_w 563291369
    //   17578: l2i
    //   17579: ldc_w -107788601
    //   17582: ixor
    //   17583: ldc2_w -361672348
    //   17586: l2i
    //   17587: ldc_w 1666714245
    //   17590: ixor
    //   17591: ixor
    //   17592: lookupswitch default -> 17620, -1089245142 -> 18915, 1290435944 -> 17575
    //   17620: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil.mc : Lnet/minecraft/client/Minecraft;
    //   17623: getstatic Perryc.1 : I
    //   17626: ifeq -> 17640
    //   17629: ldc2_w -1196957911
    //   17632: l2i
    //   17633: ldc_w -1970857106
    //   17636: ixor
    //   17637: goto -> 17648
    //   17640: ldc2_w 1502102085
    //   17643: l2i
    //   17644: ldc_w -1644871139
    //   17647: ixor
    //   17648: ldc2_w 1131004030
    //   17651: l2i
    //   17652: ldc_w -1920834353
    //   17655: ixor
    //   17656: ixor
    //   17657: lookupswitch default -> 17684, -53780234 -> 18761, 1282652813 -> 17640
    //   17684: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   17687: getstatic Perryc.0 : I
    //   17690: ifle -> 17704
    //   17693: ldc2_w 1348305212
    //   17696: l2i
    //   17697: ldc_w -544192004
    //   17700: ixor
    //   17701: goto -> 17712
    //   17704: ldc2_w 226850874
    //   17707: l2i
    //   17708: ldc_w -376806446
    //   17711: ixor
    //   17712: ldc2_w 2032195811
    //   17715: l2i
    //   17716: ldc_w -739044991
    //   17719: ixor
    //   17720: ixor
    //   17721: lookupswitch default -> 19095, 622723490 -> 17704, 1323094666 -> 17748
    //   17748: aload #9
    //   17750: getstatic Perryc.c : I
    //   17753: iflt -> 17767
    //   17756: ldc2_w 2085367380
    //   17759: l2i
    //   17760: ldc_w 1360775309
    //   17763: ixor
    //   17764: goto -> 17775
    //   17767: ldc2_w -1180649368
    //   17770: l2i
    //   17771: ldc_w 1897081797
    //   17774: ixor
    //   17775: ldc2_w -52804130
    //   17778: l2i
    //   17779: ldc_w 1978113535
    //   17782: ixor
    //   17783: ixor
    //   17784: lookupswitch default -> 17812, -1536540936 -> 19035, 1989116420 -> 17767
    //   17812: goto -> 17816
    //   17815: athrow
    //   17816: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   17819: goto -> 17823
    //   17822: athrow
    //   17823: getstatic Perryc.0 : I
    //   17826: ifle -> 17840
    //   17829: ldc2_w -1553419592
    //   17832: l2i
    //   17833: ldc_w 2123523108
    //   17836: ixor
    //   17837: goto -> 17848
    //   17840: ldc2_w -1873162203
    //   17843: l2i
    //   17844: ldc_w 476026132
    //   17847: ixor
    //   17848: ldc2_w -1122904754
    //   17851: l2i
    //   17852: ldc_w -562829000
    //   17855: ixor
    //   17856: ixor
    //   17857: lookupswitch default -> 19133, -1097274646 -> 17840, -278628025 -> 17884
    //   17884: astore #10
    //   17886: getstatic Perryc.c : I
    //   17889: iflt -> 17903
    //   17892: ldc2_w -1820929521
    //   17895: l2i
    //   17896: ldc_w 2085880082
    //   17899: ixor
    //   17900: goto -> 17911
    //   17903: ldc2_w -1172633455
    //   17906: l2i
    //   17907: ldc_w 62817759
    //   17910: ixor
    //   17911: ldc2_w -1918988504
    //   17914: l2i
    //   17915: ldc_w 1487091194
    //   17918: ixor
    //   17919: ixor
    //   17920: lookupswitch default -> 19243, 975137231 -> 17903, 1821915036 -> 17948
    //   17948: aload #10
    //   17950: getstatic Perryc.1 : I
    //   17953: ifeq -> 17967
    //   17956: ldc2_w 1647605294
    //   17959: l2i
    //   17960: ldc_w 1869000886
    //   17963: ixor
    //   17964: goto -> 17975
    //   17967: ldc2_w 1102081636
    //   17970: l2i
    //   17971: ldc_w 2100591205
    //   17974: ixor
    //   17975: ldc2_w -1695049962
    //   17978: l2i
    //   17979: ldc_w -1348897710
    //   17982: ixor
    //   17983: ixor
    //   17984: lookupswitch default -> 18012, -575294425 -> 17967, 943465948 -> 19129
    //   18012: goto -> 18016
    //   18015: athrow
    //   18016: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   18021: goto -> 18025
    //   18024: athrow
    //   18025: getstatic Perryc.0 : I
    //   18028: ifle -> 18042
    //   18031: ldc2_w 1134344132
    //   18034: l2i
    //   18035: ldc_w -2106588694
    //   18038: ixor
    //   18039: goto -> 18050
    //   18042: ldc2_w -1152273043
    //   18045: l2i
    //   18046: ldc_w 1113412727
    //   18049: ixor
    //   18050: ldc2_w 1878639747
    //   18053: l2i
    //   18054: ldc_w 395905335
    //   18057: ixor
    //   18058: ixor
    //   18059: lookupswitch default -> 19089, -2123617106 -> 18084, -1181975654 -> 18042
    //   18084: astore #11
    //   18086: getstatic Perryc.1 : I
    //   18089: ifeq -> 18103
    //   18092: ldc2_w 864292673
    //   18095: l2i
    //   18096: ldc_w -1282431118
    //   18099: ixor
    //   18100: goto -> 18111
    //   18103: ldc2_w -136894391
    //   18106: l2i
    //   18107: ldc_w 1654513529
    //   18110: ixor
    //   18111: ldc2_w 771968563
    //   18114: l2i
    //   18115: ldc_w 1700922119
    //   18118: ixor
    //   18119: ixor
    //   18120: lookupswitch default -> 18148, -1685534051 -> 18103, -882187001 -> 18807
    //   18148: aload #11
    //   18150: getstatic Perryc.0 : I
    //   18153: ifle -> 18167
    //   18156: ldc2_w 84951518
    //   18159: l2i
    //   18160: ldc_w -1050525294
    //   18163: ixor
    //   18164: goto -> 18175
    //   18167: ldc2_w 351969386
    //   18170: l2i
    //   18171: ldc_w -105303998
    //   18174: ixor
    //   18175: ldc2_w -985661122
    //   18178: l2i
    //   18179: ldc_w -1228866389
    //   18182: ixor
    //   18183: ixor
    //   18184: lookupswitch default -> 18873, -1631359555 -> 18212, -1208812071 -> 18167
    //   18212: aload #10
    //   18214: ldc2_w 2106975201
    //   18217: l2i
    //   18218: ldc_w 2106975201
    //   18221: ixor
    //   18222: getstatic Perryc.1 : I
    //   18225: ifeq -> 18239
    //   18228: ldc2_w 1665770340
    //   18231: l2i
    //   18232: ldc_w 2107115677
    //   18235: ixor
    //   18236: goto -> 18247
    //   18239: ldc2_w -1924139785
    //   18242: l2i
    //   18243: ldc_w -401579877
    //   18246: ixor
    //   18247: ldc2_w -623970748
    //   18250: l2i
    //   18251: ldc_w 277578471
    //   18254: ixor
    //   18255: ixor
    //   18256: lookupswitch default -> 19047, -1357193009 -> 18284, -728440998 -> 18239
    //   18284: goto -> 18288
    //   18287: athrow
    //   18288: invokevirtual func_176209_a : (Lnet/minecraft/block/state/IBlockState;Z)Z
    //   18291: goto -> 18295
    //   18294: athrow
    //   18295: ifeq -> 18309
    //   18298: ldc2_w 1042210923
    //   18301: l2i
    //   18302: ldc_w -118152339
    //   18305: ixor
    //   18306: goto -> 18317
    //   18309: ldc2_w 607122392
    //   18312: l2i
    //   18313: ldc_w -490458927
    //   18316: ixor
    //   18317: ldc2_w 663365636
    //   18320: l2i
    //   18321: ldc_w 235522053
    //   18324: ixor
    //   18325: ixor
    //   18326: tableswitch default -> 18298, -278387961 -> 18348, -278387960 -> 18737
    //   18348: getstatic Perryc.c : I
    //   18351: iflt -> 18365
    //   18354: ldc2_w -1076592543
    //   18357: l2i
    //   18358: ldc_w -29248630
    //   18361: ixor
    //   18362: goto -> 18373
    //   18365: ldc2_w 1383875666
    //   18368: l2i
    //   18369: ldc_w 348055108
    //   18372: ixor
    //   18373: ldc2_w -1157619352
    //   18376: l2i
    //   18377: ldc_w 1920241494
    //   18380: ixor
    //   18381: ixor
    //   18382: lookupswitch default -> 18975, -1998479915 -> 18365, -1883894744 -> 18408
    //   18408: goto -> 18412
    //   18411: athrow
    //   18412: invokestatic getBlocks : ()Ljava/util/List;
    //   18415: goto -> 18419
    //   18418: athrow
    //   18419: getstatic Perryc.0 : I
    //   18422: ifle -> 18436
    //   18425: ldc2_w -472265401
    //   18428: l2i
    //   18429: ldc_w 857774747
    //   18432: ixor
    //   18433: goto -> 18444
    //   18436: ldc2_w -1140396964
    //   18439: l2i
    //   18440: ldc_w 1071425583
    //   18443: ixor
    //   18444: ldc2_w -68162331
    //   18447: l2i
    //   18448: ldc_w -1804706324
    //   18451: ixor
    //   18452: ixor
    //   18453: lookupswitch default -> 19209, -1082595627 -> 18436, -329517702 -> 18480
    //   18480: aload #11
    //   18482: getstatic Perryc.1 : I
    //   18485: ifeq -> 18499
    //   18488: ldc2_w 1368126250
    //   18491: l2i
    //   18492: ldc_w 1115267495
    //   18495: ixor
    //   18496: goto -> 18507
    //   18499: ldc2_w 1888133486
    //   18502: l2i
    //   18503: ldc_w 18909794
    //   18506: ixor
    //   18507: ldc2_w -629492956
    //   18510: l2i
    //   18511: ldc_w -1752362682
    //   18514: ixor
    //   18515: ixor
    //   18516: lookupswitch default -> 18544, 1540820996 -> 18499, 1577447663 -> 18951
    //   18544: goto -> 18548
    //   18547: athrow
    //   18548: invokeinterface contains : (Ljava/lang/Object;)Z
    //   18553: goto -> 18557
    //   18556: athrow
    //   18557: ifne -> 18571
    //   18560: ldc2_w 323027498
    //   18563: l2i
    //   18564: ldc_w -801032713
    //   18567: ixor
    //   18568: goto -> 18579
    //   18571: ldc2_w 932348068
    //   18574: l2i
    //   18575: ldc_w -191711368
    //   18578: ixor
    //   18579: ldc2_w 1118338759
    //   18582: l2i
    //   18583: ldc_w -538624518
    //   18586: ixor
    //   18587: ixor
    //   18588: tableswitch default -> 18560, 1582134496 -> 18612, 1582134497 -> 18728
    //   18612: getstatic Perryc.1 : I
    //   18615: ifeq -> 18629
    //   18618: ldc2_w 1390618166
    //   18621: l2i
    //   18622: ldc_w -538002424
    //   18625: ixor
    //   18626: goto -> 18637
    //   18629: ldc2_w 486663230
    //   18632: l2i
    //   18633: ldc_w 712412043
    //   18636: ixor
    //   18637: ldc2_w 1362417304
    //   18640: l2i
    //   18641: ldc_w -1447596131
    //   18644: ixor
    //   18645: ixor
    //   18646: lookupswitch default -> 18839, -806037840 -> 18672, 1972249403 -> 18629
    //   18672: iload_2
    //   18673: ifne -> 18687
    //   18676: ldc2_w 1579210989
    //   18679: l2i
    //   18680: ldc_w 802681417
    //   18683: ixor
    //   18684: goto -> 18695
    //   18687: ldc2_w -169193008
    //   18690: l2i
    //   18691: ldc_w -2078442635
    //   18694: ixor
    //   18695: ldc2_w -308407563
    //   18698: l2i
    //   18699: ldc_w -1581951247
    //   18702: ixor
    //   18703: ixor
    //   18704: tableswitch default -> 18676, 1037856416 -> 18728, 1037856417 -> 18737
    //   18728: ldc2_w -1244744203
    //   18731: l2i
    //   18732: ldc_w -1244744204
    //   18735: ixor
    //   18736: ireturn
    //   18737: goto -> 5970
    //   18740: ldc2_w 1149726523
    //   18743: l2i
    //   18744: ldc_w 1149726523
    //   18747: ixor
    //   18748: ireturn
    //   18749: aconst_null
    //   18750: athrow
    //   18751: aconst_null
    //   18752: athrow
    //   18753: aconst_null
    //   18754: athrow
    //   18755: aconst_null
    //   18756: athrow
    //   18757: aconst_null
    //   18758: athrow
    //   18759: aconst_null
    //   18760: athrow
    //   18761: aconst_null
    //   18762: athrow
    //   18763: aconst_null
    //   18764: athrow
    //   18765: aconst_null
    //   18766: athrow
    //   18767: aconst_null
    //   18768: athrow
    //   18769: aconst_null
    //   18770: athrow
    //   18771: aconst_null
    //   18772: athrow
    //   18773: aconst_null
    //   18774: athrow
    //   18775: aconst_null
    //   18776: athrow
    //   18777: aconst_null
    //   18778: athrow
    //   18779: aconst_null
    //   18780: athrow
    //   18781: aconst_null
    //   18782: athrow
    //   18783: aconst_null
    //   18784: athrow
    //   18785: aconst_null
    //   18786: athrow
    //   18787: aconst_null
    //   18788: athrow
    //   18789: aconst_null
    //   18790: athrow
    //   18791: aconst_null
    //   18792: athrow
    //   18793: aconst_null
    //   18794: athrow
    //   18795: aconst_null
    //   18796: athrow
    //   18797: aconst_null
    //   18798: athrow
    //   18799: aconst_null
    //   18800: athrow
    //   18801: aconst_null
    //   18802: athrow
    //   18803: aconst_null
    //   18804: athrow
    //   18805: aconst_null
    //   18806: athrow
    //   18807: aconst_null
    //   18808: athrow
    //   18809: aconst_null
    //   18810: athrow
    //   18811: aconst_null
    //   18812: athrow
    //   18813: aconst_null
    //   18814: athrow
    //   18815: aconst_null
    //   18816: athrow
    //   18817: aconst_null
    //   18818: athrow
    //   18819: aconst_null
    //   18820: athrow
    //   18821: aconst_null
    //   18822: athrow
    //   18823: aconst_null
    //   18824: athrow
    //   18825: aconst_null
    //   18826: athrow
    //   18827: aconst_null
    //   18828: athrow
    //   18829: aconst_null
    //   18830: athrow
    //   18831: aconst_null
    //   18832: athrow
    //   18833: aconst_null
    //   18834: athrow
    //   18835: aconst_null
    //   18836: athrow
    //   18837: aconst_null
    //   18838: athrow
    //   18839: aconst_null
    //   18840: athrow
    //   18841: aconst_null
    //   18842: athrow
    //   18843: aconst_null
    //   18844: athrow
    //   18845: aconst_null
    //   18846: athrow
    //   18847: aconst_null
    //   18848: athrow
    //   18849: aconst_null
    //   18850: athrow
    //   18851: aconst_null
    //   18852: athrow
    //   18853: aconst_null
    //   18854: athrow
    //   18855: aconst_null
    //   18856: athrow
    //   18857: aconst_null
    //   18858: athrow
    //   18859: aconst_null
    //   18860: athrow
    //   18861: aconst_null
    //   18862: athrow
    //   18863: aconst_null
    //   18864: athrow
    //   18865: aconst_null
    //   18866: athrow
    //   18867: aconst_null
    //   18868: athrow
    //   18869: aconst_null
    //   18870: athrow
    //   18871: aconst_null
    //   18872: athrow
    //   18873: aconst_null
    //   18874: athrow
    //   18875: aconst_null
    //   18876: athrow
    //   18877: aconst_null
    //   18878: athrow
    //   18879: aconst_null
    //   18880: athrow
    //   18881: aconst_null
    //   18882: athrow
    //   18883: aconst_null
    //   18884: athrow
    //   18885: aconst_null
    //   18886: athrow
    //   18887: aconst_null
    //   18888: athrow
    //   18889: aconst_null
    //   18890: athrow
    //   18891: aconst_null
    //   18892: athrow
    //   18893: aconst_null
    //   18894: athrow
    //   18895: aconst_null
    //   18896: athrow
    //   18897: aconst_null
    //   18898: athrow
    //   18899: aconst_null
    //   18900: athrow
    //   18901: aconst_null
    //   18902: athrow
    //   18903: aconst_null
    //   18904: athrow
    //   18905: aconst_null
    //   18906: athrow
    //   18907: aconst_null
    //   18908: athrow
    //   18909: aconst_null
    //   18910: athrow
    //   18911: aconst_null
    //   18912: athrow
    //   18913: aconst_null
    //   18914: athrow
    //   18915: aconst_null
    //   18916: athrow
    //   18917: aconst_null
    //   18918: athrow
    //   18919: aconst_null
    //   18920: athrow
    //   18921: aconst_null
    //   18922: athrow
    //   18923: aconst_null
    //   18924: athrow
    //   18925: aconst_null
    //   18926: athrow
    //   18927: aconst_null
    //   18928: athrow
    //   18929: aconst_null
    //   18930: athrow
    //   18931: aconst_null
    //   18932: athrow
    //   18933: aconst_null
    //   18934: athrow
    //   18935: aconst_null
    //   18936: athrow
    //   18937: aconst_null
    //   18938: athrow
    //   18939: aconst_null
    //   18940: athrow
    //   18941: aconst_null
    //   18942: athrow
    //   18943: aconst_null
    //   18944: athrow
    //   18945: aconst_null
    //   18946: athrow
    //   18947: aconst_null
    //   18948: athrow
    //   18949: aconst_null
    //   18950: athrow
    //   18951: aconst_null
    //   18952: athrow
    //   18953: aconst_null
    //   18954: athrow
    //   18955: aconst_null
    //   18956: athrow
    //   18957: aconst_null
    //   18958: athrow
    //   18959: aconst_null
    //   18960: athrow
    //   18961: aconst_null
    //   18962: athrow
    //   18963: aconst_null
    //   18964: athrow
    //   18965: aconst_null
    //   18966: athrow
    //   18967: aconst_null
    //   18968: athrow
    //   18969: aconst_null
    //   18970: athrow
    //   18971: aconst_null
    //   18972: athrow
    //   18973: aconst_null
    //   18974: athrow
    //   18975: aconst_null
    //   18976: athrow
    //   18977: aconst_null
    //   18978: athrow
    //   18979: aconst_null
    //   18980: athrow
    //   18981: aconst_null
    //   18982: athrow
    //   18983: aconst_null
    //   18984: athrow
    //   18985: aconst_null
    //   18986: athrow
    //   18987: aconst_null
    //   18988: athrow
    //   18989: aconst_null
    //   18990: athrow
    //   18991: aconst_null
    //   18992: athrow
    //   18993: aconst_null
    //   18994: athrow
    //   18995: aconst_null
    //   18996: athrow
    //   18997: aconst_null
    //   18998: athrow
    //   18999: aconst_null
    //   19000: athrow
    //   19001: aconst_null
    //   19002: athrow
    //   19003: aconst_null
    //   19004: athrow
    //   19005: aconst_null
    //   19006: athrow
    //   19007: aconst_null
    //   19008: athrow
    //   19009: aconst_null
    //   19010: athrow
    //   19011: aconst_null
    //   19012: athrow
    //   19013: aconst_null
    //   19014: athrow
    //   19015: aconst_null
    //   19016: athrow
    //   19017: aconst_null
    //   19018: athrow
    //   19019: aconst_null
    //   19020: athrow
    //   19021: aconst_null
    //   19022: athrow
    //   19023: aconst_null
    //   19024: athrow
    //   19025: aconst_null
    //   19026: athrow
    //   19027: aconst_null
    //   19028: athrow
    //   19029: aconst_null
    //   19030: athrow
    //   19031: aconst_null
    //   19032: athrow
    //   19033: aconst_null
    //   19034: athrow
    //   19035: aconst_null
    //   19036: athrow
    //   19037: aconst_null
    //   19038: athrow
    //   19039: aconst_null
    //   19040: athrow
    //   19041: aconst_null
    //   19042: athrow
    //   19043: aconst_null
    //   19044: athrow
    //   19045: aconst_null
    //   19046: athrow
    //   19047: aconst_null
    //   19048: athrow
    //   19049: aconst_null
    //   19050: athrow
    //   19051: aconst_null
    //   19052: athrow
    //   19053: aconst_null
    //   19054: athrow
    //   19055: aconst_null
    //   19056: athrow
    //   19057: aconst_null
    //   19058: athrow
    //   19059: aconst_null
    //   19060: athrow
    //   19061: aconst_null
    //   19062: athrow
    //   19063: aconst_null
    //   19064: athrow
    //   19065: aconst_null
    //   19066: athrow
    //   19067: aconst_null
    //   19068: athrow
    //   19069: aconst_null
    //   19070: athrow
    //   19071: aconst_null
    //   19072: athrow
    //   19073: aconst_null
    //   19074: athrow
    //   19075: aconst_null
    //   19076: athrow
    //   19077: aconst_null
    //   19078: athrow
    //   19079: aconst_null
    //   19080: athrow
    //   19081: aconst_null
    //   19082: athrow
    //   19083: aconst_null
    //   19084: athrow
    //   19085: aconst_null
    //   19086: athrow
    //   19087: aconst_null
    //   19088: athrow
    //   19089: aconst_null
    //   19090: athrow
    //   19091: aconst_null
    //   19092: athrow
    //   19093: aconst_null
    //   19094: athrow
    //   19095: aconst_null
    //   19096: athrow
    //   19097: aconst_null
    //   19098: athrow
    //   19099: aconst_null
    //   19100: athrow
    //   19101: aconst_null
    //   19102: athrow
    //   19103: aconst_null
    //   19104: athrow
    //   19105: aconst_null
    //   19106: athrow
    //   19107: aconst_null
    //   19108: athrow
    //   19109: aconst_null
    //   19110: athrow
    //   19111: aconst_null
    //   19112: athrow
    //   19113: aconst_null
    //   19114: athrow
    //   19115: aconst_null
    //   19116: athrow
    //   19117: aconst_null
    //   19118: athrow
    //   19119: aconst_null
    //   19120: athrow
    //   19121: aconst_null
    //   19122: athrow
    //   19123: aconst_null
    //   19124: athrow
    //   19125: aconst_null
    //   19126: athrow
    //   19127: aconst_null
    //   19128: athrow
    //   19129: aconst_null
    //   19130: athrow
    //   19131: aconst_null
    //   19132: athrow
    //   19133: aconst_null
    //   19134: athrow
    //   19135: aconst_null
    //   19136: athrow
    //   19137: aconst_null
    //   19138: athrow
    //   19139: aconst_null
    //   19140: athrow
    //   19141: aconst_null
    //   19142: athrow
    //   19143: aconst_null
    //   19144: athrow
    //   19145: aconst_null
    //   19146: athrow
    //   19147: aconst_null
    //   19148: athrow
    //   19149: aconst_null
    //   19150: athrow
    //   19151: aconst_null
    //   19152: athrow
    //   19153: aconst_null
    //   19154: athrow
    //   19155: aconst_null
    //   19156: athrow
    //   19157: aconst_null
    //   19158: athrow
    //   19159: aconst_null
    //   19160: athrow
    //   19161: aconst_null
    //   19162: athrow
    //   19163: aconst_null
    //   19164: athrow
    //   19165: aconst_null
    //   19166: athrow
    //   19167: aconst_null
    //   19168: athrow
    //   19169: aconst_null
    //   19170: athrow
    //   19171: aconst_null
    //   19172: athrow
    //   19173: aconst_null
    //   19174: athrow
    //   19175: aconst_null
    //   19176: athrow
    //   19177: aconst_null
    //   19178: athrow
    //   19179: aconst_null
    //   19180: athrow
    //   19181: aconst_null
    //   19182: athrow
    //   19183: aconst_null
    //   19184: athrow
    //   19185: aconst_null
    //   19186: athrow
    //   19187: aconst_null
    //   19188: athrow
    //   19189: aconst_null
    //   19190: athrow
    //   19191: aconst_null
    //   19192: athrow
    //   19193: aconst_null
    //   19194: athrow
    //   19195: aconst_null
    //   19196: athrow
    //   19197: aconst_null
    //   19198: athrow
    //   19199: aconst_null
    //   19200: athrow
    //   19201: aconst_null
    //   19202: athrow
    //   19203: aconst_null
    //   19204: athrow
    //   19205: aconst_null
    //   19206: athrow
    //   19207: aconst_null
    //   19208: athrow
    //   19209: aconst_null
    //   19210: athrow
    //   19211: aconst_null
    //   19212: athrow
    //   19213: aconst_null
    //   19214: athrow
    //   19215: aconst_null
    //   19216: athrow
    //   19217: aconst_null
    //   19218: athrow
    //   19219: aconst_null
    //   19220: athrow
    //   19221: aconst_null
    //   19222: athrow
    //   19223: aconst_null
    //   19224: athrow
    //   19225: aconst_null
    //   19226: athrow
    //   19227: aconst_null
    //   19228: athrow
    //   19229: aconst_null
    //   19230: athrow
    //   19231: aconst_null
    //   19232: athrow
    //   19233: aconst_null
    //   19234: athrow
    //   19235: aconst_null
    //   19236: athrow
    //   19237: aconst_null
    //   19238: athrow
    //   19239: aconst_null
    //   19240: athrow
    //   19241: aconst_null
    //   19242: athrow
    //   19243: aconst_null
    //   19244: athrow
    //   19245: aconst_null
    //   19246: athrow
    //   19247: aconst_null
    //   19248: athrow
    //   19249: aconst_null
    //   19250: athrow
    //   19251: aconst_null
    //   19252: athrow
    //   19253: pop
    //   19254: goto -> 24
    //   19257: pop
    //   19258: aconst_null
    //   19259: goto -> 19253
    //   19262: dup
    //   19263: ifnull -> 19253
    //   19266: checkcast java/lang/Throwable
    //   19269: athrow
    //   19270: dup
    //   19271: ifnull -> 19257
    //   19274: checkcast java/lang/Throwable
    //   19277: athrow
    //   19278: aconst_null
    //   19279: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   12802	710	34	facing	Lnet/minecraft/util/EnumFacing;
    //   14066	710	34	facing	Lnet/minecraft/util/EnumFacing;
    //   7458	11279	19	unboundedX	Z
    //   7530	11207	20	unboundedY	Z
    //   7602	11135	21	unboundedZ	Z
    //   7678	11059	22	stepX	D
    //   7754	10983	24	stepY	D
    //   7830	10907	26	stepZ	D
    //   7906	10831	28	deltaX	D
    //   7982	10755	30	deltaY	D
    //   8058	10679	32	deltaZ	D
    //   15150	3587	34	facing	Lnet/minecraft/util/EnumFacing;
    //   1717	17023	3	currX	I
    //   1974	16766	4	currY	I
    //   2234	16506	5	currZ	I
    //   2494	16246	6	endX	I
    //   2754	15986	7	endY	I
    //   3014	15726	8	endZ	I
    //   3342	15398	9	blockPos	Lnet/minecraft/util/math/BlockPos;
    //   3670	15070	10	blockState	Lnet/minecraft/block/state/IBlockState;
    //   3870	14870	11	block	Lnet/minecraft/block/Block;
    //   5274	13466	12	seDeltaX	D
    //   5586	13154	14	seDeltaY	D
    //   5898	12842	16	seDeltaZ	D
    //   5970	12770	18	steps	I
    //   24	18725	0	start	Lnet/minecraft/util/math/Vec3d;
    //   24	18725	1	end	Lnet/minecraft/util/math/Vec3d;
    //   24	18725	2	shouldIgnore	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	19262	finally
    //   203	210	210	finally
    //   203	210	203	java/lang/NumberFormatException
    //   203	210	203	finally
    //   203	210	210	finally
    //   204	210	203	finally
    //   439	446	446	finally
    //   439	446	439	finally
    //   439	446	3	java/lang/UnsupportedOperationException
    //   439	446	439	java/lang/IllegalArgumentException
    //   440	446	3	finally
    //   675	682	682	finally
    //   675	682	682	java/lang/RuntimeException
    //   675	682	682	finally
    //   675	682	675	finally
    //   676	682	682	java/lang/ArithmeticException
    //   911	918	918	finally
    //   911	918	911	java/lang/RuntimeException
    //   912	918	918	java/lang/ArithmeticException
    //   912	918	918	finally
    //   912	918	918	finally
    //   1151	1158	1158	finally
    //   1151	1158	1158	java/lang/ArithmeticException
    //   1151	1158	1151	java/lang/NegativeArraySizeException
    //   1152	1158	1151	java/lang/ArrayIndexOutOfBoundsException
    //   1152	1158	3	finally
    //   1399	1406	1406	finally
    //   1399	1406	3	java/lang/IllegalArgumentException
    //   1399	1406	3	java/lang/AssertionError
    //   1399	1406	3	finally
    //   1399	1406	1399	java/lang/IllegalArgumentException
    //   1647	1654	1654	finally
    //   1647	1654	3	finally
    //   1647	1654	3	java/lang/RuntimeException
    //   1648	1654	1647	java/lang/IllegalArgumentException
    //   1648	1654	1654	java/lang/RuntimeException
    //   1903	1910	1910	finally
    //   1903	1910	3	java/lang/RuntimeException
    //   1903	1910	1910	finally
    //   1903	1910	3	finally
    //   1904	1910	1903	java/lang/NullPointerException
    //   2163	2170	2170	finally
    //   2163	2170	2163	finally
    //   2163	2170	2170	java/lang/RuntimeException
    //   2163	2170	2163	java/lang/ArrayIndexOutOfBoundsException
    //   2164	2170	2170	java/util/ConcurrentModificationException
    //   2423	2430	2430	finally
    //   2423	2430	2423	finally
    //   2423	2430	2430	finally
    //   2424	2430	2430	finally
    //   2424	2430	2423	finally
    //   2683	2690	2690	finally
    //   2683	2690	2690	finally
    //   2683	2690	2683	finally
    //   2684	2690	2683	finally
    //   2684	2690	3	java/util/ConcurrentModificationException
    //   2943	2950	2950	finally
    //   2943	2950	2950	finally
    //   2943	2950	2950	java/lang/NullPointerException
    //   2944	2950	2943	finally
    //   2944	2950	3	java/lang/NumberFormatException
    //   3271	3278	3278	finally
    //   3271	3278	3278	java/lang/NumberFormatException
    //   3271	3278	3	finally
    //   3271	3278	3271	java/lang/IndexOutOfBoundsException
    //   3272	3278	3	finally
    //   3600	3606	3606	finally
    //   3600	3606	3	java/lang/UnsupportedOperationException
    //   3600	3606	3	finally
    //   3600	3606	3	java/lang/NegativeArraySizeException
    //   3600	3606	3606	java/lang/AssertionError
    //   3799	3808	3808	finally
    //   3799	3808	3799	java/lang/ArrayIndexOutOfBoundsException
    //   3799	3808	3	java/lang/RuntimeException
    //   3799	3808	3799	finally
    //   3800	3808	3799	finally
    //   4191	4200	4200	finally
    //   4191	4200	4200	finally
    //   4192	4200	3	java/lang/StringIndexOutOfBoundsException
    //   4192	4200	4191	java/lang/ArithmeticException
    //   4192	4200	4191	finally
    //   4515	4522	4522	finally
    //   4515	4522	4522	java/lang/IllegalArgumentException
    //   4515	4522	4515	finally
    //   4516	4522	3	java/lang/AssertionError
    //   4516	4522	3	java/lang/NumberFormatException
    //   4639	4646	4646	finally
    //   4639	4646	4639	finally
    //   4639	4646	3	finally
    //   4640	4646	4639	finally
    //   4640	4646	3	java/lang/EnumConstantNotPresentException
    //   4776	4784	4784	finally
    //   4776	4784	3	finally
    //   4776	4784	4784	finally
    //   4776	4784	4784	java/lang/RuntimeException
    //   4776	4784	3	java/lang/IllegalStateException
    //   6279	6286	6286	finally
    //   6279	6286	6279	java/lang/IllegalStateException
    //   6280	6286	6279	java/lang/NullPointerException
    //   6280	6286	3	java/lang/IllegalArgumentException
    //   6280	6286	3	finally
    //   6527	6534	6534	finally
    //   6527	6534	6527	finally
    //   6527	6534	6534	java/lang/UnsupportedOperationException
    //   6528	6534	6527	finally
    //   6528	6534	6527	java/lang/IndexOutOfBoundsException
    //   6775	6782	6782	finally
    //   6775	6782	3	finally
    //   6775	6782	6782	java/lang/ClassCastException
    //   6776	6782	3	finally
    //   6776	6782	6775	java/lang/NullPointerException
    //   13439	13446	13446	finally
    //   13439	13446	13439	finally
    //   13439	13446	13439	java/lang/ArrayIndexOutOfBoundsException
    //   13439	13446	13439	java/lang/ArrayIndexOutOfBoundsException
    //   13440	13446	13446	finally
    //   14703	14710	14710	finally
    //   14703	14710	14710	java/lang/RuntimeException
    //   14704	14710	14703	java/lang/EnumConstantNotPresentException
    //   14704	14710	3	finally
    //   14704	14710	14710	finally
    //   15788	15794	15794	finally
    //   15788	15794	15794	java/lang/UnsupportedOperationException
    //   15788	15794	15794	finally
    //   15788	15794	15794	java/util/ConcurrentModificationException
    //   15788	15794	3	java/lang/ClassCastException
    //   16044	16050	16050	finally
    //   16044	16050	3	java/lang/NegativeArraySizeException
    //   16044	16050	16050	java/lang/UnsupportedOperationException
    //   16044	16050	16050	java/lang/StringIndexOutOfBoundsException
    //   16044	16050	3	finally
    //   16500	16506	16506	finally
    //   16500	16506	16506	finally
    //   16500	16506	3	java/lang/NumberFormatException
    //   16500	16506	3	finally
    //   16500	16506	3	finally
    //   16959	16966	16966	finally
    //   16959	16966	16959	finally
    //   16959	16966	16959	finally
    //   16959	16966	3	finally
    //   16960	16966	16959	finally
    //   17488	17494	17494	finally
    //   17488	17494	3	finally
    //   17488	17494	17494	java/lang/ClassCastException
    //   17488	17494	17494	java/lang/ArithmeticException
    //   17488	17494	3	finally
    //   17815	17822	17822	finally
    //   17815	17822	17822	java/lang/ArithmeticException
    //   17815	17822	17815	finally
    //   17815	17822	3	finally
    //   17816	17822	17815	finally
    //   18015	18024	18024	finally
    //   18015	18024	18015	finally
    //   18015	18024	18015	finally
    //   18015	18024	3	java/lang/ArithmeticException
    //   18016	18024	18024	java/lang/AssertionError
    //   18287	18294	18294	finally
    //   18287	18294	18294	finally
    //   18287	18294	3	finally
    //   18288	18294	18294	java/lang/UnsupportedOperationException
    //   18288	18294	18287	finally
    //   18411	18418	18418	finally
    //   18411	18418	3	java/lang/NumberFormatException
    //   18411	18418	18411	java/util/ConcurrentModificationException
    //   18411	18418	18418	finally
    //   18411	18418	18411	finally
    //   18547	18556	18556	finally
    //   18547	18556	3	java/lang/NegativeArraySizeException
    //   18547	18556	18547	java/lang/IllegalStateException
    //   18548	18556	3	java/lang/RuntimeException
    //   18548	18556	18547	finally
    //   19262	19270	19262	java/lang/StringIndexOutOfBoundsException
    //   19278	19280	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static double calculateXOffset(AxisAlignedBB paramAxisAlignedBB1, double paramDouble, AxisAlignedBB paramAxisAlignedBB2) {
    return Perry1.1j(null, (int)-1208200314L ^ 0xE9161229, paramAxisAlignedBB1, paramDouble, paramAxisAlignedBB2);
  }
  
  public static EntityPlayer placeValue(double x, double y, double z, EntityPlayer entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6032
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 6024
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6016
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 605776145
    //   33: l2i
    //   34: ldc_w -1361854902
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -871630153
    //   44: l2i
    //   45: ldc_w -1543006476
    //   48: ixor
    //   49: ldc2_w 1580999589
    //   52: l2i
    //   53: ldc_w -1221115703
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 5939, -2130243793 -> 84, 1673770039 -> 41
    //   84: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w 1751807869
    //   96: l2i
    //   97: ldc_w -1209221170
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -1465867748
    //   107: l2i
    //   108: ldc_w -1030417783
    //   111: ixor
    //   112: ldc2_w 1171746063
    //   115: l2i
    //   116: ldc_w 258316427
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -1791738569 -> 5911, 1668216915 -> 104
    //   148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w 1111535649
    //   160: l2i
    //   161: ldc_w 1486868646
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -320133354
    //   171: l2i
    //   172: ldc_w -302041550
    //   175: ixor
    //   176: ldc2_w -1013357248
    //   179: l2i
    //   180: ldc_w -1582132977
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, -753149218 -> 168, 2029294792 -> 5863
    //   212: aload #6
    //   214: getstatic Perryc.c : I
    //   217: iflt -> 231
    //   220: ldc2_w -1659823824
    //   223: l2i
    //   224: ldc_w 1847249513
    //   227: ixor
    //   228: goto -> 239
    //   231: ldc2_w 1181564483
    //   234: l2i
    //   235: ldc_w 780318594
    //   238: ixor
    //   239: ldc2_w 108884924
    //   242: l2i
    //   243: ldc_w -1508079103
    //   246: ixor
    //   247: ixor
    //   248: lookupswitch default -> 5923, -930189188 -> 276, 1399466724 -> 231
    //   276: aload #6
    //   278: getstatic Perryc.c : I
    //   281: iflt -> 295
    //   284: ldc2_w 1231647618
    //   287: l2i
    //   288: ldc_w 20363048
    //   291: ixor
    //   292: goto -> 303
    //   295: ldc2_w 1971667496
    //   298: l2i
    //   299: ldc_w 265992726
    //   302: ixor
    //   303: ldc2_w -1574390384
    //   306: l2i
    //   307: ldc_w -940156652
    //   310: ixor
    //   311: ixor
    //   312: lookupswitch default -> 5933, 528553146 -> 340, 763439150 -> 295
    //   340: goto -> 344
    //   343: athrow
    //   344: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   347: goto -> 351
    //   350: athrow
    //   351: getstatic Perryc.c : I
    //   354: iflt -> 368
    //   357: ldc2_w 766241902
    //   360: l2i
    //   361: ldc_w -2066523236
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w 391202445
    //   371: l2i
    //   372: ldc_w 1082067647
    //   375: ixor
    //   376: ldc2_w 1319963300
    //   379: l2i
    //   380: ldc_w -655294162
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 5853, -1049475144 -> 412, 1059372152 -> 368
    //   412: dload_0
    //   413: getstatic Perryc.1 : I
    //   416: ifeq -> 430
    //   419: ldc2_w -1218416611
    //   422: l2i
    //   423: ldc_w 679309742
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w 550507932
    //   433: l2i
    //   434: ldc_w 1978461450
    //   437: ixor
    //   438: ldc2_w 210264382
    //   441: l2i
    //   442: ldc_w -1720540970
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 5987, -1060750978 -> 472, 182960219 -> 430
    //   472: dload_2
    //   473: getstatic Perryc.c : I
    //   476: iflt -> 490
    //   479: ldc2_w 93103196
    //   482: l2i
    //   483: ldc_w -984734903
    //   486: ixor
    //   487: goto -> 498
    //   490: ldc2_w -1033556757
    //   493: l2i
    //   494: ldc_w 1281048492
    //   497: ixor
    //   498: ldc2_w 1597591622
    //   501: l2i
    //   502: ldc_w -1887684404
    //   505: ixor
    //   506: ixor
    //   507: lookupswitch default -> 532, -1761003759 -> 490, 277344159 -> 5895
    //   532: dload #4
    //   534: getstatic Perryc.c : I
    //   537: iflt -> 551
    //   540: ldc2_w -537307874
    //   543: l2i
    //   544: ldc_w 46357169
    //   547: ixor
    //   548: goto -> 559
    //   551: ldc2_w 1895750973
    //   554: l2i
    //   555: ldc_w 1051171482
    //   558: ixor
    //   559: ldc2_w 1333904834
    //   562: l2i
    //   563: ldc_w -469343604
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, 401992082 -> 551, 1992141025 -> 5951
    //   596: goto -> 600
    //   599: athrow
    //   600: invokevirtual func_72321_a : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   603: goto -> 607
    //   606: athrow
    //   607: getstatic Perryc.c : I
    //   610: iflt -> 624
    //   613: ldc2_w 539866103
    //   616: l2i
    //   617: ldc_w -1088701929
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -1243796654
    //   627: l2i
    //   628: ldc_w 22489613
    //   631: ixor
    //   632: ldc2_w 1361846300
    //   635: l2i
    //   636: ldc_w 1303908525
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, -2086520495 -> 5921, 580822052 -> 624
    //   668: goto -> 672
    //   671: athrow
    //   672: invokevirtual func_184144_a : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w 1068919077
    //   688: l2i
    //   689: ldc_w -1972171640
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 2029755132
    //   699: l2i
    //   700: ldc_w -21793268
    //   703: ixor
    //   704: ldc2_w -152609561
    //   707: l2i
    //   708: ldc_w 152750889
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 740, -1950377944 -> 696, 1245246051 -> 5879
    //   740: astore #7
    //   742: getstatic Perryc.1 : I
    //   745: ifeq -> 759
    //   748: ldc2_w 590411931
    //   751: l2i
    //   752: ldc_w 717925132
    //   755: ixor
    //   756: goto -> 767
    //   759: ldc2_w -1221589168
    //   762: l2i
    //   763: ldc_w -162464102
    //   766: ixor
    //   767: ldc2_w 1449159977
    //   770: l2i
    //   771: ldc_w -1152528147
    //   774: ixor
    //   775: ixor
    //   776: lookupswitch default -> 804, -455610797 -> 5907, 1313503810 -> 759
    //   804: dload_2
    //   805: ldc2_w 1.113273477311493E308
    //   808: invokestatic doubleToLongBits : (D)J
    //   811: ldc2_w 9215439206670826473
    //   814: lxor
    //   815: invokestatic longBitsToDouble : (J)D
    //   818: dcmpl
    //   819: ifeq -> 833
    //   822: ldc2_w 1164977136
    //   825: l2i
    //   826: ldc_w 1187023325
    //   829: ixor
    //   830: goto -> 841
    //   833: ldc2_w 771129461
    //   836: l2i
    //   837: ldc_w 776350299
    //   840: ixor
    //   841: ldc2_w 515705052
    //   844: l2i
    //   845: ldc_w 212245516
    //   848: ixor
    //   849: ixor
    //   850: tableswitch default -> 822, 296435453 -> 872, 296435454 -> 2423
    //   872: ldc2_w 1951498687
    //   875: l2i
    //   876: ldc_w 1951498687
    //   879: ixor
    //   880: getstatic Perryc.0 : I
    //   883: ifle -> 897
    //   886: ldc2_w 752581114
    //   889: l2i
    //   890: ldc_w 659624756
    //   893: ixor
    //   894: goto -> 905
    //   897: ldc2_w 1962062274
    //   900: l2i
    //   901: ldc_w -635404652
    //   904: ixor
    //   905: ldc2_w -403845564
    //   908: l2i
    //   909: ldc_w 2005626321
    //   912: ixor
    //   913: ixor
    //   914: lookupswitch default -> 5959, -1678980773 -> 897, 1052011715 -> 940
    //   940: istore #8
    //   942: getstatic Perryc.1 : I
    //   945: ifeq -> 959
    //   948: ldc2_w -1609088107
    //   951: l2i
    //   952: ldc_w 1759545787
    //   955: ixor
    //   956: goto -> 967
    //   959: ldc2_w 1397026011
    //   962: l2i
    //   963: ldc_w 1692610226
    //   966: ixor
    //   967: ldc2_w -1879457571
    //   970: l2i
    //   971: ldc_w 1268039593
    //   974: ixor
    //   975: ixor
    //   976: lookupswitch default -> 1004, 211465562 -> 5867, 1906313707 -> 959
    //   1004: aload #7
    //   1006: getstatic Perryc.c : I
    //   1009: iflt -> 1023
    //   1012: ldc2_w 533406807
    //   1015: l2i
    //   1016: ldc_w 532290012
    //   1019: ixor
    //   1020: goto -> 1031
    //   1023: ldc2_w -1548390513
    //   1026: l2i
    //   1027: ldc_w 1636551961
    //   1030: ixor
    //   1031: ldc2_w -890999865
    //   1034: l2i
    //   1035: ldc_w 814441725
    //   1038: ixor
    //   1039: ixor
    //   1040: lookupswitch default -> 1068, -98684239 -> 5881, 168648481 -> 1023
    //   1068: goto -> 1072
    //   1071: athrow
    //   1072: invokeinterface size : ()I
    //   1077: goto -> 1081
    //   1080: athrow
    //   1081: getstatic Perryc.c : I
    //   1084: iflt -> 1098
    //   1087: ldc2_w -1295768269
    //   1090: l2i
    //   1091: ldc_w -309490902
    //   1094: ixor
    //   1095: goto -> 1106
    //   1098: ldc2_w 60949169
    //   1101: l2i
    //   1102: ldc_w -751566841
    //   1105: ixor
    //   1106: ldc2_w -1788981385
    //   1109: l2i
    //   1110: ldc_w -18955758
    //   1113: ixor
    //   1114: ixor
    //   1115: lookupswitch default -> 5909, -1156149293 -> 1140, 885597052 -> 1098
    //   1140: istore #9
    //   1142: getstatic Perryc.1 : I
    //   1145: ifeq -> 1159
    //   1148: ldc2_w 1431273027
    //   1151: l2i
    //   1152: ldc_w -1131354543
    //   1155: ixor
    //   1156: goto -> 1167
    //   1159: ldc2_w -133435284
    //   1162: l2i
    //   1163: ldc_w -1353437575
    //   1166: ixor
    //   1167: ldc2_w -1201563178
    //   1170: l2i
    //   1171: ldc_w -193472454
    //   1174: ixor
    //   1175: ixor
    //   1176: lookupswitch default -> 5935, -1513498114 -> 1159, 457809913 -> 1204
    //   1204: iload #8
    //   1206: getstatic Perryc.0 : I
    //   1209: ifle -> 1223
    //   1212: ldc2_w 782728425
    //   1215: l2i
    //   1216: ldc_w -669868191
    //   1219: ixor
    //   1220: goto -> 1231
    //   1223: ldc2_w 1277582628
    //   1226: l2i
    //   1227: ldc_w -1946825976
    //   1230: ixor
    //   1231: ldc2_w -1018737502
    //   1234: l2i
    //   1235: ldc_w -1053094562
    //   1238: ixor
    //   1239: ixor
    //   1240: lookupswitch default -> 1268, -909180587 -> 1223, -188112268 -> 5953
    //   1268: iload #9
    //   1270: if_icmpge -> 1284
    //   1273: ldc2_w -1359374333
    //   1276: l2i
    //   1277: ldc_w -345521124
    //   1280: ixor
    //   1281: goto -> 1292
    //   1284: ldc2_w 209062242
    //   1287: l2i
    //   1288: ldc_w 1239963002
    //   1291: ixor
    //   1292: ldc2_w 1347085890
    //   1295: l2i
    //   1296: ldc_w -491057882
    //   1299: ixor
    //   1300: ixor
    //   1301: tableswitch default -> 1273, -143673477 -> 1324, -143673476 -> 1863
    //   1324: getstatic Perryc.c : I
    //   1327: iflt -> 1341
    //   1330: ldc2_w -816835255
    //   1333: l2i
    //   1334: ldc_w -524413506
    //   1337: ixor
    //   1338: goto -> 1349
    //   1341: ldc2_w 1333453162
    //   1344: l2i
    //   1345: ldc_w 726480658
    //   1348: ixor
    //   1349: ldc2_w -204591465
    //   1352: l2i
    //   1353: ldc_w 1160855089
    //   1356: ixor
    //   1357: ixor
    //   1358: lookupswitch default -> 5913, -1726934959 -> 1341, -758593826 -> 1384
    //   1384: aload #7
    //   1386: getstatic Perryc.0 : I
    //   1389: ifle -> 1403
    //   1392: ldc2_w 96610451
    //   1395: l2i
    //   1396: ldc_w 1142672448
    //   1399: ixor
    //   1400: goto -> 1411
    //   1403: ldc2_w -2085340095
    //   1406: l2i
    //   1407: ldc_w 50308532
    //   1410: ixor
    //   1411: ldc2_w 1164025940
    //   1414: l2i
    //   1415: ldc_w 2027234874
    //   1418: ixor
    //   1419: ixor
    //   1420: lookupswitch default -> 5937, -1124130917 -> 1448, 2087543485 -> 1403
    //   1448: iload #8
    //   1450: getstatic Perryc.1 : I
    //   1453: ifeq -> 1467
    //   1456: ldc2_w -1840284405
    //   1459: l2i
    //   1460: ldc_w -1259119929
    //   1463: ixor
    //   1464: goto -> 1475
    //   1467: ldc2_w 1622752698
    //   1470: l2i
    //   1471: ldc_w -277271636
    //   1474: ixor
    //   1475: ldc2_w -748450983
    //   1478: l2i
    //   1479: ldc_w -1670415494
    //   1482: ixor
    //   1483: ixor
    //   1484: lookupswitch default -> 1512, -85348502 -> 1467, 1773197295 -> 5883
    //   1512: goto -> 1516
    //   1515: athrow
    //   1516: invokeinterface get : (I)Ljava/lang/Object;
    //   1521: goto -> 1525
    //   1524: athrow
    //   1525: checkcast net/minecraft/util/math/AxisAlignedBB
    //   1528: getstatic Perryc.0 : I
    //   1531: ifle -> 1545
    //   1534: ldc2_w 373193012
    //   1537: l2i
    //   1538: ldc_w 1438631025
    //   1541: ixor
    //   1542: goto -> 1553
    //   1545: ldc2_w -1333538921
    //   1548: l2i
    //   1549: ldc_w 166856113
    //   1552: ixor
    //   1553: ldc2_w 961387603
    //   1556: l2i
    //   1557: ldc_w -1282356065
    //   1560: ixor
    //   1561: ixor
    //   1562: lookupswitch default -> 1588, -916656759 -> 5947, 1372520049 -> 1545
    //   1588: aload #6
    //   1590: getstatic Perryc.c : I
    //   1593: iflt -> 1607
    //   1596: ldc2_w 33672465
    //   1599: l2i
    //   1600: ldc_w -749496416
    //   1603: ixor
    //   1604: goto -> 1615
    //   1607: ldc2_w -1707920446
    //   1610: l2i
    //   1611: ldc_w 304078485
    //   1614: ixor
    //   1615: ldc2_w -255619522
    //   1618: l2i
    //   1619: ldc_w -1940996241
    //   1622: ixor
    //   1623: ixor
    //   1624: lookupswitch default -> 1652, -1377866784 -> 5977, -793211554 -> 1607
    //   1652: goto -> 1656
    //   1655: athrow
    //   1656: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   1659: goto -> 1663
    //   1662: athrow
    //   1663: getstatic Perryc.0 : I
    //   1666: ifle -> 1680
    //   1669: ldc2_w -1860841647
    //   1672: l2i
    //   1673: ldc_w -2054323695
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w -1989071288
    //   1683: l2i
    //   1684: ldc_w 1433391666
    //   1687: ixor
    //   1688: ldc2_w -1564716962
    //   1691: l2i
    //   1692: ldc_w -79322090
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 1724, -1347439195 -> 1680, 1298249992 -> 5859
    //   1724: dload_2
    //   1725: getstatic Perryc.c : I
    //   1728: iflt -> 1742
    //   1731: ldc2_w -1727261296
    //   1734: l2i
    //   1735: ldc_w 1676984040
    //   1738: ixor
    //   1739: goto -> 1750
    //   1742: ldc2_w 1920944278
    //   1745: l2i
    //   1746: ldc_w 1673486654
    //   1749: ixor
    //   1750: ldc2_w 387300609
    //   1753: l2i
    //   1754: ldc_w 1774200634
    //   1757: ixor
    //   1758: ixor
    //   1759: lookupswitch default -> 1784, -2077413053 -> 5997, 2081081494 -> 1742
    //   1784: goto -> 1788
    //   1787: athrow
    //   1788: invokevirtual func_72323_b : (Lnet/minecraft/util/math/AxisAlignedBB;D)D
    //   1791: goto -> 1795
    //   1794: athrow
    //   1795: getstatic Perryc.0 : I
    //   1798: ifle -> 1812
    //   1801: ldc2_w -1244546786
    //   1804: l2i
    //   1805: ldc_w 1582242984
    //   1808: ixor
    //   1809: goto -> 1820
    //   1812: ldc2_w -553042834
    //   1815: l2i
    //   1816: ldc_w 669032754
    //   1819: ixor
    //   1820: ldc2_w -304510307
    //   1823: l2i
    //   1824: ldc_w 49081645
    //   1827: ixor
    //   1828: ixor
    //   1829: lookupswitch default -> 5861, 78365190 -> 1812, 400358124 -> 1856
    //   1856: dstore_2
    //   1857: iinc #8, 1
    //   1860: goto -> 1142
    //   1863: getstatic Perryc.1 : I
    //   1866: ifeq -> 1880
    //   1869: ldc2_w -399897762
    //   1872: l2i
    //   1873: ldc_w -1827191831
    //   1876: ixor
    //   1877: goto -> 1888
    //   1880: ldc2_w 83771747
    //   1883: l2i
    //   1884: ldc_w -1034580799
    //   1887: ixor
    //   1888: ldc2_w -1465368886
    //   1891: l2i
    //   1892: ldc_w -2089612506
    //   1895: ixor
    //   1896: ixor
    //   1897: lookupswitch default -> 1924, -1971015066 -> 1880, 1357282651 -> 5917
    //   1924: dload_2
    //   1925: ldc2_w 5.910010036111921E307
    //   1928: invokestatic doubleToLongBits : (D)J
    //   1931: ldc2_w 9211279965906149323
    //   1934: lxor
    //   1935: invokestatic longBitsToDouble : (J)D
    //   1938: dcmpl
    //   1939: ifeq -> 1953
    //   1942: ldc2_w -1820885823
    //   1945: l2i
    //   1946: ldc_w -1486261205
    //   1949: ixor
    //   1950: goto -> 1961
    //   1953: ldc2_w -68469948
    //   1956: l2i
    //   1957: ldc_w -806014035
    //   1960: ixor
    //   1961: ldc2_w 2096309416
    //   1964: l2i
    //   1965: ldc_w -1672903509
    //   1968: ixor
    //   1969: ixor
    //   1970: tableswitch default -> 1942, -727406359 -> 1992, -727406358 -> 2423
    //   1992: getstatic Perryc.1 : I
    //   1995: ifeq -> 2009
    //   1998: ldc2_w -1820515592
    //   2001: l2i
    //   2002: ldc_w -920667084
    //   2005: ixor
    //   2006: goto -> 2017
    //   2009: ldc2_w -1265315977
    //   2012: l2i
    //   2013: ldc_w 1532013009
    //   2016: ixor
    //   2017: ldc2_w 474516821
    //   2020: l2i
    //   2021: ldc_w 317704419
    //   2024: ixor
    //   2025: ixor
    //   2026: lookupswitch default -> 2052, 529395941 -> 2009, 1422252922 -> 5989
    //   2052: aload #6
    //   2054: getstatic Perryc.0 : I
    //   2057: ifle -> 2071
    //   2060: ldc2_w 1240590920
    //   2063: l2i
    //   2064: ldc_w 1015266816
    //   2067: ixor
    //   2068: goto -> 2079
    //   2071: ldc2_w 1259164905
    //   2074: l2i
    //   2075: ldc_w 842602191
    //   2078: ixor
    //   2079: ldc2_w 1924664357
    //   2082: l2i
    //   2083: ldc_w 118396824
    //   2086: ixor
    //   2087: ixor
    //   2088: lookupswitch default -> 2116, -1675351003 -> 2071, 12898293 -> 5897
    //   2116: aload #6
    //   2118: getstatic Perryc.c : I
    //   2121: iflt -> 2135
    //   2124: ldc2_w -1726281094
    //   2127: l2i
    //   2128: ldc_w 1187021966
    //   2131: ixor
    //   2132: goto -> 2143
    //   2135: ldc2_w -1529775567
    //   2138: l2i
    //   2139: ldc_w 2053740801
    //   2142: ixor
    //   2143: ldc2_w -807898341
    //   2146: l2i
    //   2147: ldc_w 577675689
    //   2150: ixor
    //   2151: ixor
    //   2152: lookupswitch default -> 5899, 846027846 -> 2135, 856568194 -> 2180
    //   2180: goto -> 2184
    //   2183: athrow
    //   2184: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   2187: goto -> 2191
    //   2190: athrow
    //   2191: ldc2_w 1.7160350412477133E307
    //   2194: invokestatic doubleToLongBits : (D)J
    //   2197: ldc2_w 9203228885359223551
    //   2200: lxor
    //   2201: invokestatic longBitsToDouble : (J)D
    //   2204: getstatic Perryc.c : I
    //   2207: iflt -> 2221
    //   2210: ldc2_w -2114737530
    //   2213: l2i
    //   2214: ldc_w -2124030022
    //   2217: ixor
    //   2218: goto -> 2229
    //   2221: ldc2_w 1695898410
    //   2224: l2i
    //   2225: ldc_w -1606431114
    //   2228: ixor
    //   2229: ldc2_w 975110091
    //   2232: l2i
    //   2233: ldc_w 637005499
    //   2236: ixor
    //   2237: ixor
    //   2238: lookupswitch default -> 5983, -624720852 -> 2264, 528442444 -> 2221
    //   2264: dload_2
    //   2265: ldc2_w 1.2250489006931383E308
    //   2268: invokestatic doubleToLongBits : (D)J
    //   2271: ldc2_w 9215999248588246725
    //   2274: lxor
    //   2275: invokestatic longBitsToDouble : (J)D
    //   2278: getstatic Perryc.1 : I
    //   2281: ifeq -> 2295
    //   2284: ldc2_w -1230879797
    //   2287: l2i
    //   2288: ldc_w 1179883119
    //   2291: ixor
    //   2292: goto -> 2303
    //   2295: ldc2_w -2133363297
    //   2298: l2i
    //   2299: ldc_w 862623173
    //   2302: ixor
    //   2303: ldc2_w 593134681
    //   2306: l2i
    //   2307: ldc_w -585220320
    //   2310: ixor
    //   2311: ixor
    //   2312: lookupswitch default -> 2340, 246771421 -> 5885, 1461307868 -> 2295
    //   2340: goto -> 2344
    //   2343: athrow
    //   2344: invokevirtual func_72317_d : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   2347: goto -> 2351
    //   2350: athrow
    //   2351: getstatic Perryc.1 : I
    //   2354: ifeq -> 2368
    //   2357: ldc2_w -845860994
    //   2360: l2i
    //   2361: ldc_w 188306723
    //   2364: ixor
    //   2365: goto -> 2376
    //   2368: ldc2_w -1404152093
    //   2371: l2i
    //   2372: ldc_w -937513468
    //   2375: ixor
    //   2376: ldc2_w 354799934
    //   2379: l2i
    //   2380: ldc_w 325802457
    //   2383: ixor
    //   2384: ixor
    //   2385: lookupswitch default -> 2412, -1960824239 -> 2368, -1058868550 -> 5993
    //   2412: goto -> 2416
    //   2415: athrow
    //   2416: invokevirtual func_174826_a : (Lnet/minecraft/util/math/AxisAlignedBB;)V
    //   2419: goto -> 2423
    //   2422: athrow
    //   2423: getstatic Perryc.c : I
    //   2426: iflt -> 2440
    //   2429: ldc2_w -1030772795
    //   2432: l2i
    //   2433: ldc_w -922876925
    //   2436: ixor
    //   2437: goto -> 2448
    //   2440: ldc2_w 220796209
    //   2443: l2i
    //   2444: ldc_w 601750462
    //   2447: ixor
    //   2448: ldc2_w 851253944
    //   2451: l2i
    //   2452: ldc_w 1369880347
    //   2455: ixor
    //   2456: ixor
    //   2457: lookupswitch default -> 5957, 1307525932 -> 2484, 1768558181 -> 2440
    //   2484: dload_0
    //   2485: ldc2_w 1.0893713057405032E308
    //   2488: invokestatic doubleToLongBits : (D)J
    //   2491: ldc2_w 9215319446730831264
    //   2494: lxor
    //   2495: invokestatic longBitsToDouble : (J)D
    //   2498: dcmpl
    //   2499: ifeq -> 2513
    //   2502: ldc2_w 1336135489
    //   2505: l2i
    //   2506: ldc_w -391896567
    //   2509: ixor
    //   2510: goto -> 2521
    //   2513: ldc2_w 419573436
    //   2516: l2i
    //   2517: ldc_w -1106918411
    //   2520: ixor
    //   2521: ldc2_w 972631059
    //   2524: l2i
    //   2525: ldc_w 1225510825
    //   2528: ixor
    //   2529: ixor
    //   2530: tableswitch default -> 2502, -671805710 -> 2552, -671805709 -> 4103
    //   2552: ldc2_w -2082744033
    //   2555: l2i
    //   2556: ldc_w -2082744033
    //   2559: ixor
    //   2560: getstatic Perryc.1 : I
    //   2563: ifeq -> 2577
    //   2566: ldc2_w -1940343678
    //   2569: l2i
    //   2570: ldc_w 65887984
    //   2573: ixor
    //   2574: goto -> 2585
    //   2577: ldc2_w 841382380
    //   2580: l2i
    //   2581: ldc_w 1035241929
    //   2584: ixor
    //   2585: ldc2_w -1938597241
    //   2588: l2i
    //   2589: ldc_w 415126204
    //   2592: ixor
    //   2593: ixor
    //   2594: lookupswitch default -> 2620, 460907081 -> 5999, 772494759 -> 2577
    //   2620: istore #8
    //   2622: getstatic Perryc.c : I
    //   2625: iflt -> 2639
    //   2628: ldc2_w 977576585
    //   2631: l2i
    //   2632: ldc_w 956137892
    //   2635: ixor
    //   2636: goto -> 2647
    //   2639: ldc2_w 1864784449
    //   2642: l2i
    //   2643: ldc_w 1347369619
    //   2646: ixor
    //   2647: ldc2_w -964082657
    //   2650: l2i
    //   2651: ldc_w -995038635
    //   2654: ixor
    //   2655: ixor
    //   2656: lookupswitch default -> 2684, -639238367 -> 2639, 8424807 -> 5969
    //   2684: aload #7
    //   2686: getstatic Perryc.1 : I
    //   2689: ifeq -> 2703
    //   2692: ldc2_w -2070913966
    //   2695: l2i
    //   2696: ldc_w 1287101624
    //   2699: ixor
    //   2700: goto -> 2711
    //   2703: ldc2_w -1121709855
    //   2706: l2i
    //   2707: ldc_w 483488324
    //   2710: ixor
    //   2711: ldc2_w 813490970
    //   2714: l2i
    //   2715: ldc_w -161671824
    //   2718: ixor
    //   2719: ixor
    //   2720: lookupswitch default -> 2748, -263850373 -> 2703, 235288192 -> 5891
    //   2748: goto -> 2752
    //   2751: athrow
    //   2752: invokeinterface size : ()I
    //   2757: goto -> 2761
    //   2760: athrow
    //   2761: getstatic Perryc.0 : I
    //   2764: ifle -> 2778
    //   2767: ldc2_w -2000640612
    //   2770: l2i
    //   2771: ldc_w -1018171483
    //   2774: ixor
    //   2775: goto -> 2786
    //   2778: ldc2_w -1340989115
    //   2781: l2i
    //   2782: ldc_w 893981830
    //   2785: ixor
    //   2786: ldc2_w -1212557684
    //   2789: l2i
    //   2790: ldc_w 668945448
    //   2793: ixor
    //   2794: ixor
    //   2795: lookupswitch default -> 5925, -605433699 -> 2778, 356364135 -> 2820
    //   2820: istore #9
    //   2822: getstatic Perryc.1 : I
    //   2825: ifeq -> 2839
    //   2828: ldc2_w -178014250
    //   2831: l2i
    //   2832: ldc_w -1788495405
    //   2835: ixor
    //   2836: goto -> 2847
    //   2839: ldc2_w 1595989851
    //   2842: l2i
    //   2843: ldc_w -2101199651
    //   2846: ixor
    //   2847: ldc2_w 972620996
    //   2850: l2i
    //   2851: ldc_w 1404092128
    //   2854: ixor
    //   2855: ixor
    //   2856: lookupswitch default -> 2884, 172995617 -> 5865, 1548751127 -> 2839
    //   2884: iload #8
    //   2886: getstatic Perryc.0 : I
    //   2889: ifle -> 2903
    //   2892: ldc2_w 1581672425
    //   2895: l2i
    //   2896: ldc_w -1667370306
    //   2899: ixor
    //   2900: goto -> 2911
    //   2903: ldc2_w 1173988306
    //   2906: l2i
    //   2907: ldc_w 1891726135
    //   2910: ixor
    //   2911: ldc2_w 1046808592
    //   2914: l2i
    //   2915: ldc_w -575850245
    //   2918: ixor
    //   2919: ixor
    //   2920: lookupswitch default -> 2948, -1525179766 -> 2903, 554935740 -> 5991
    //   2948: iload #9
    //   2950: if_icmpge -> 2964
    //   2953: ldc2_w 532433865
    //   2956: l2i
    //   2957: ldc_w -282458136
    //   2960: ixor
    //   2961: goto -> 2972
    //   2964: ldc2_w -473705527
    //   2967: l2i
    //   2968: ldc_w 324378601
    //   2971: ixor
    //   2972: ldc2_w -1812699526
    //   2975: l2i
    //   2976: ldc_w -115052349
    //   2979: ixor
    //   2980: ixor
    //   2981: tableswitch default -> 2953, -1706665320 -> 3004, -1706665319 -> 3543
    //   3004: getstatic Perryc.1 : I
    //   3007: ifeq -> 3021
    //   3010: ldc2_w 709477401
    //   3013: l2i
    //   3014: ldc_w -82830865
    //   3017: ixor
    //   3018: goto -> 3029
    //   3021: ldc2_w 488541163
    //   3024: l2i
    //   3025: ldc_w -660083317
    //   3028: ixor
    //   3029: ldc2_w 1634996613
    //   3032: l2i
    //   3033: ldc_w -1973756628
    //   3036: ixor
    //   3037: ixor
    //   3038: lookupswitch default -> 3064, -118468201 -> 3021, 980881759 -> 5941
    //   3064: aload #6
    //   3066: getstatic Perryc.0 : I
    //   3069: ifle -> 3083
    //   3072: ldc2_w 1968416336
    //   3075: l2i
    //   3076: ldc_w 422747454
    //   3079: ixor
    //   3080: goto -> 3091
    //   3083: ldc2_w 1227420446
    //   3086: l2i
    //   3087: ldc_w 925094431
    //   3090: ixor
    //   3091: ldc2_w -1840434483
    //   3094: l2i
    //   3095: ldc_w -406566280
    //   3098: ixor
    //   3099: ixor
    //   3100: lookupswitch default -> 3128, -321534796 -> 3083, 434652123 -> 5875
    //   3128: goto -> 3132
    //   3131: athrow
    //   3132: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   3135: goto -> 3139
    //   3138: athrow
    //   3139: getstatic Perryc.c : I
    //   3142: iflt -> 3156
    //   3145: ldc2_w 188244046
    //   3148: l2i
    //   3149: ldc_w -1588861427
    //   3152: ixor
    //   3153: goto -> 3164
    //   3156: ldc2_w -1372249602
    //   3159: l2i
    //   3160: ldc_w -441792365
    //   3163: ixor
    //   3164: ldc2_w 1822739350
    //   3167: l2i
    //   3168: ldc_w -1912877739
    //   3171: ixor
    //   3172: ixor
    //   3173: lookupswitch default -> 5927, -1430196306 -> 3200, 1261207680 -> 3156
    //   3200: dload_0
    //   3201: getstatic Perryc.0 : I
    //   3204: ifle -> 3218
    //   3207: ldc2_w -217732562
    //   3210: l2i
    //   3211: ldc_w 1783447664
    //   3214: ixor
    //   3215: goto -> 3226
    //   3218: ldc2_w 2050078969
    //   3221: l2i
    //   3222: ldc_w 1772902256
    //   3225: ixor
    //   3226: ldc2_w 1157780201
    //   3229: l2i
    //   3230: ldc_w 304413691
    //   3233: ixor
    //   3234: ixor
    //   3235: lookupswitch default -> 3260, -831634612 -> 5981, 343116683 -> 3218
    //   3260: aload #7
    //   3262: getstatic Perryc.0 : I
    //   3265: ifle -> 3279
    //   3268: ldc2_w 553298034
    //   3271: l2i
    //   3272: ldc_w -154938234
    //   3275: ixor
    //   3276: goto -> 3287
    //   3279: ldc2_w -803291109
    //   3282: l2i
    //   3283: ldc_w -1152787266
    //   3286: ixor
    //   3287: ldc2_w 612733316
    //   3290: l2i
    //   3291: ldc_w -1078338120
    //   3294: ixor
    //   3295: ixor
    //   3296: lookupswitch default -> 5893, -261402471 -> 3324, 1292185800 -> 3279
    //   3324: iload #8
    //   3326: getstatic Perryc.1 : I
    //   3329: ifeq -> 3343
    //   3332: ldc2_w 1924578897
    //   3335: l2i
    //   3336: ldc_w 574593007
    //   3339: ixor
    //   3340: goto -> 3351
    //   3343: ldc2_w -1425910386
    //   3346: l2i
    //   3347: ldc_w -1291448031
    //   3350: ixor
    //   3351: ldc2_w 51035011
    //   3354: l2i
    //   3355: ldc_w -1568595495
    //   3358: ixor
    //   3359: ixor
    //   3360: lookupswitch default -> 5901, -1181753611 -> 3388, -251481116 -> 3343
    //   3388: goto -> 3392
    //   3391: athrow
    //   3392: invokeinterface get : (I)Ljava/lang/Object;
    //   3397: goto -> 3401
    //   3400: athrow
    //   3401: checkcast net/minecraft/util/math/AxisAlignedBB
    //   3404: getstatic Perryc.c : I
    //   3407: iflt -> 3421
    //   3410: ldc2_w -1403030366
    //   3413: l2i
    //   3414: ldc_w 1314801506
    //   3417: ixor
    //   3418: goto -> 3429
    //   3421: ldc2_w 1108016536
    //   3424: l2i
    //   3425: ldc_w -1425418421
    //   3428: ixor
    //   3429: ldc2_w -675523566
    //   3432: l2i
    //   3433: ldc_w 1216124607
    //   3436: ixor
    //   3437: ixor
    //   3438: lookupswitch default -> 6001, 1992550526 -> 3464, 2109862253 -> 3421
    //   3464: goto -> 3468
    //   3467: athrow
    //   3468: invokestatic calculateXOffset : (Lnet/minecraft/util/math/AxisAlignedBB;DLnet/minecraft/util/math/AxisAlignedBB;)D
    //   3471: goto -> 3475
    //   3474: athrow
    //   3475: getstatic Perryc.1 : I
    //   3478: ifeq -> 3492
    //   3481: ldc2_w -176098345
    //   3484: l2i
    //   3485: ldc_w -2013105848
    //   3488: ixor
    //   3489: goto -> 3500
    //   3492: ldc2_w -358438143
    //   3495: l2i
    //   3496: ldc_w 1357027131
    //   3499: ixor
    //   3500: ldc2_w -595728671
    //   3503: l2i
    //   3504: ldc_w 1311326423
    //   3507: ixor
    //   3508: ixor
    //   3509: lookupswitch default -> 3536, -271178583 -> 5929, 1195346225 -> 3492
    //   3536: dstore_0
    //   3537: iinc #8, 1
    //   3540: goto -> 2822
    //   3543: getstatic Perryc.0 : I
    //   3546: ifle -> 3560
    //   3549: ldc2_w -100700350
    //   3552: l2i
    //   3553: ldc_w -1827203270
    //   3556: ixor
    //   3557: goto -> 3568
    //   3560: ldc2_w 1313956701
    //   3563: l2i
    //   3564: ldc_w 1485468929
    //   3567: ixor
    //   3568: ldc2_w 766405337
    //   3571: l2i
    //   3572: ldc_w 209682016
    //   3575: ixor
    //   3576: ixor
    //   3577: lookupswitch default -> 3604, -340499211 -> 3560, 1262054593 -> 5887
    //   3604: dload_0
    //   3605: ldc2_w 8.930934982218251E306
    //   3608: invokestatic doubleToLongBits : (D)J
    //   3611: ldc2_w 9199006478389845983
    //   3614: lxor
    //   3615: invokestatic longBitsToDouble : (J)D
    //   3618: dcmpl
    //   3619: ifeq -> 3633
    //   3622: ldc2_w -124098605
    //   3625: l2i
    //   3626: ldc_w 364542084
    //   3629: ixor
    //   3630: goto -> 3641
    //   3633: ldc2_w 1306349105
    //   3636: l2i
    //   3637: ldc_w -1594011271
    //   3640: ixor
    //   3641: ldc2_w 1580539922
    //   3644: l2i
    //   3645: ldc_w -1476928374
    //   3648: ixor
    //   3649: ixor
    //   3650: tableswitch default -> 3622, 350413775 -> 3672, 350413776 -> 4103
    //   3672: getstatic Perryc.c : I
    //   3675: iflt -> 3689
    //   3678: ldc2_w 1822062238
    //   3681: l2i
    //   3682: ldc_w 333894413
    //   3685: ixor
    //   3686: goto -> 3697
    //   3689: ldc2_w 120115734
    //   3692: l2i
    //   3693: ldc_w -1582873643
    //   3696: ixor
    //   3697: ldc2_w -769696268
    //   3700: l2i
    //   3701: ldc_w 1558883237
    //   3704: ixor
    //   3705: ixor
    //   3706: lookupswitch default -> 5871, -242658366 -> 3689, 679110546 -> 3732
    //   3732: aload #6
    //   3734: getstatic Perryc.c : I
    //   3737: iflt -> 3751
    //   3740: ldc2_w 883103517
    //   3743: l2i
    //   3744: ldc_w -1620700044
    //   3747: ixor
    //   3748: goto -> 3759
    //   3751: ldc2_w 114050941
    //   3754: l2i
    //   3755: ldc_w 248752540
    //   3758: ixor
    //   3759: ldc2_w -1957433542
    //   3762: l2i
    //   3763: ldc_w -1687607214
    //   3766: ixor
    //   3767: ixor
    //   3768: lookupswitch default -> 5973, -1140866047 -> 3751, 405088649 -> 3796
    //   3796: aload #6
    //   3798: getstatic Perryc.c : I
    //   3801: iflt -> 3815
    //   3804: ldc2_w -639844261
    //   3807: l2i
    //   3808: ldc_w -929486892
    //   3811: ixor
    //   3812: goto -> 3823
    //   3815: ldc2_w -1323012227
    //   3818: l2i
    //   3819: ldc_w 664180986
    //   3822: ixor
    //   3823: ldc2_w -1967209506
    //   3826: l2i
    //   3827: ldc_w -1977762496
    //   3830: ixor
    //   3831: ixor
    //   3832: lookupswitch default -> 3860, 300325137 -> 5975, 1842808040 -> 3815
    //   3860: goto -> 3864
    //   3863: athrow
    //   3864: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   3867: goto -> 3871
    //   3870: athrow
    //   3871: getstatic Perryc.0 : I
    //   3874: ifle -> 3888
    //   3877: ldc2_w 1441106026
    //   3880: l2i
    //   3881: ldc_w 1647953270
    //   3884: ixor
    //   3885: goto -> 3896
    //   3888: ldc2_w 317832585
    //   3891: l2i
    //   3892: ldc_w 2027800289
    //   3895: ixor
    //   3896: ldc2_w 614686385
    //   3899: l2i
    //   3900: ldc_w 1667435567
    //   3903: ixor
    //   3904: ixor
    //   3905: lookupswitch default -> 5915, 770451958 -> 3932, 1880891266 -> 3888
    //   3932: dload_0
    //   3933: ldc2_w 1.4140863078008858E308
    //   3936: invokestatic doubleToLongBits : (D)J
    //   3939: ldc2_w 9216946405563705432
    //   3942: lxor
    //   3943: invokestatic longBitsToDouble : (J)D
    //   3946: ldc2_w 6.491376210086133E307
    //   3949: invokestatic doubleToLongBits : (D)J
    //   3952: ldc2_w 9211862543751878617
    //   3955: lxor
    //   3956: invokestatic longBitsToDouble : (J)D
    //   3959: getstatic Perryc.c : I
    //   3962: iflt -> 3976
    //   3965: ldc2_w 2108938802
    //   3968: l2i
    //   3969: ldc_w 776556770
    //   3972: ixor
    //   3973: goto -> 3984
    //   3976: ldc2_w -497757924
    //   3979: l2i
    //   3980: ldc_w 502934869
    //   3983: ixor
    //   3984: ldc2_w -514579011
    //   3987: l2i
    //   3988: ldc_w -132687309
    //   3991: ixor
    //   3992: ixor
    //   3993: lookupswitch default -> 5967, -420641849 -> 4020, 1253700958 -> 3976
    //   4020: goto -> 4024
    //   4023: athrow
    //   4024: invokevirtual func_72317_d : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   4027: goto -> 4031
    //   4030: athrow
    //   4031: getstatic Perryc.c : I
    //   4034: iflt -> 4048
    //   4037: ldc2_w -1732484660
    //   4040: l2i
    //   4041: ldc_w -1070566893
    //   4044: ixor
    //   4045: goto -> 4056
    //   4048: ldc2_w 655533477
    //   4051: l2i
    //   4052: ldc_w 2116289917
    //   4055: ixor
    //   4056: ldc2_w 1315585477
    //   4059: l2i
    //   4060: ldc_w 559527341
    //   4063: ixor
    //   4064: ixor
    //   4065: lookupswitch default -> 5889, 906307760 -> 4092, 935304119 -> 4048
    //   4092: goto -> 4096
    //   4095: athrow
    //   4096: invokevirtual func_174826_a : (Lnet/minecraft/util/math/AxisAlignedBB;)V
    //   4099: goto -> 4103
    //   4102: athrow
    //   4103: getstatic Perryc.c : I
    //   4106: iflt -> 4120
    //   4109: ldc2_w -2073103254
    //   4112: l2i
    //   4113: ldc_w 406785962
    //   4116: ixor
    //   4117: goto -> 4128
    //   4120: ldc2_w 137516529
    //   4123: l2i
    //   4124: ldc_w -1573593488
    //   4127: ixor
    //   4128: ldc2_w -772450497
    //   4131: l2i
    //   4132: ldc_w -1684460845
    //   4135: ixor
    //   4136: ixor
    //   4137: lookupswitch default -> 5961, -700611028 -> 4120, -529861011 -> 4164
    //   4164: dload #4
    //   4166: ldc2_w 1.0209722051234481E308
    //   4169: invokestatic doubleToLongBits : (D)J
    //   4172: ldc2_w 9214976738447556834
    //   4175: lxor
    //   4176: invokestatic longBitsToDouble : (J)D
    //   4179: dcmpl
    //   4180: ifeq -> 4194
    //   4183: ldc2_w -1087450649
    //   4186: l2i
    //   4187: ldc_w 1212736155
    //   4190: ixor
    //   4191: goto -> 4202
    //   4194: ldc2_w 1305321445
    //   4197: l2i
    //   4198: ldc_w -1163154278
    //   4201: ixor
    //   4202: ldc2_w -610283935
    //   4205: l2i
    //   4206: ldc_w 1829034288
    //   4209: ixor
    //   4210: ixor
    //   4211: tableswitch default -> 4183, 1107108909 -> 4232, 1107108910 -> 5787
    //   4232: ldc2_w -708241677
    //   4235: l2i
    //   4236: ldc_w -708241677
    //   4239: ixor
    //   4240: getstatic Perryc.c : I
    //   4243: iflt -> 4257
    //   4246: ldc2_w -1383394164
    //   4249: l2i
    //   4250: ldc_w 1270421589
    //   4253: ixor
    //   4254: goto -> 4265
    //   4257: ldc2_w 958544405
    //   4260: l2i
    //   4261: ldc_w 36052762
    //   4264: ixor
    //   4265: ldc2_w -313985755
    //   4268: l2i
    //   4269: ldc_w 596386098
    //   4272: ixor
    //   4273: ixor
    //   4274: lookupswitch default -> 4300, -411867557 -> 4257, 687265998 -> 5943
    //   4300: istore #8
    //   4302: getstatic Perryc.0 : I
    //   4305: ifle -> 4319
    //   4308: ldc2_w -1550652374
    //   4311: l2i
    //   4312: ldc_w -2135983393
    //   4315: ixor
    //   4316: goto -> 4327
    //   4319: ldc2_w 326472482
    //   4322: l2i
    //   4323: ldc_w -1255033806
    //   4326: ixor
    //   4327: ldc2_w 1628490515
    //   4330: l2i
    //   4331: ldc_w 1201222796
    //   4334: ixor
    //   4335: ixor
    //   4336: lookupswitch default -> 4364, 95709546 -> 5985, 213539231 -> 4319
    //   4364: aload #7
    //   4366: getstatic Perryc.1 : I
    //   4369: ifeq -> 4383
    //   4372: ldc2_w 1479500581
    //   4375: l2i
    //   4376: ldc_w -636835349
    //   4379: ixor
    //   4380: goto -> 4391
    //   4383: ldc2_w -558541124
    //   4386: l2i
    //   4387: ldc_w -1514035619
    //   4390: ixor
    //   4391: ldc2_w 543319933
    //   4394: l2i
    //   4395: ldc_w -1081318300
    //   4398: ixor
    //   4399: ixor
    //   4400: lookupswitch default -> 5965, -459607048 -> 4428, 499894743 -> 4383
    //   4428: goto -> 4432
    //   4431: athrow
    //   4432: invokeinterface size : ()I
    //   4437: goto -> 4441
    //   4440: athrow
    //   4441: getstatic Perryc.1 : I
    //   4444: ifeq -> 4458
    //   4447: ldc2_w -2105081719
    //   4450: l2i
    //   4451: ldc_w -1495537698
    //   4454: ixor
    //   4455: goto -> 4466
    //   4458: ldc2_w 1487167515
    //   4461: l2i
    //   4462: ldc_w -1112651235
    //   4465: ixor
    //   4466: ldc2_w 2020286854
    //   4469: l2i
    //   4470: ldc_w 1366345691
    //   4473: ixor
    //   4474: ixor
    //   4475: lookupswitch default -> 5919, -871248805 -> 4500, 222757130 -> 4458
    //   4500: istore #9
    //   4502: getstatic Perryc.0 : I
    //   4505: ifle -> 4519
    //   4508: ldc2_w -626801910
    //   4511: l2i
    //   4512: ldc_w -2033177136
    //   4515: ixor
    //   4516: goto -> 4527
    //   4519: ldc2_w -1100577183
    //   4522: l2i
    //   4523: ldc_w 1338469433
    //   4526: ixor
    //   4527: ldc2_w 1774509726
    //   4530: l2i
    //   4531: ldc_w 1210685369
    //   4534: ixor
    //   4535: ixor
    //   4536: lookupswitch default -> 4564, 1278451441 -> 4519, 2107549693 -> 5979
    //   4564: iload #8
    //   4566: getstatic Perryc.1 : I
    //   4569: ifeq -> 4583
    //   4572: ldc2_w -2139511276
    //   4575: l2i
    //   4576: ldc_w 442896075
    //   4579: ixor
    //   4580: goto -> 4591
    //   4583: ldc2_w 450852221
    //   4586: l2i
    //   4587: ldc_w -736720706
    //   4590: ixor
    //   4591: ldc2_w 1754778869
    //   4594: l2i
    //   4595: ldc_w -51939779
    //   4598: ixor
    //   4599: ixor
    //   4600: lookupswitch default -> 4628, 242160151 -> 5995, 1319793341 -> 4583
    //   4628: iload #9
    //   4630: if_icmpge -> 4644
    //   4633: ldc2_w -691453031
    //   4636: l2i
    //   4637: ldc_w 2138540722
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w -1994510048
    //   4647: l2i
    //   4648: ldc_w 547420168
    //   4651: ixor
    //   4652: ldc2_w 884567871
    //   4655: l2i
    //   4656: ldc_w -334070243
    //   4659: ixor
    //   4660: ixor
    //   4661: tableswitch default -> 4633, 1896994825 -> 4684, 1896994826 -> 5228
    //   4684: getstatic Perryc.c : I
    //   4687: iflt -> 4701
    //   4690: ldc2_w -342177788
    //   4693: l2i
    //   4694: ldc_w 706358241
    //   4697: ixor
    //   4698: goto -> 4709
    //   4701: ldc2_w 306774643
    //   4704: l2i
    //   4705: ldc_w 72768976
    //   4708: ixor
    //   4709: ldc2_w -978195842
    //   4712: l2i
    //   4713: ldc_w 1080968277
    //   4716: ixor
    //   4717: ixor
    //   4718: lookupswitch default -> 5949, -1816071800 -> 4744, 1147096526 -> 4701
    //   4744: aload #6
    //   4746: getstatic Perryc.1 : I
    //   4749: ifeq -> 4763
    //   4752: ldc2_w -1609632519
    //   4755: l2i
    //   4756: ldc_w -982723437
    //   4759: ixor
    //   4760: goto -> 4771
    //   4763: ldc2_w -2135984662
    //   4766: l2i
    //   4767: ldc_w 821606496
    //   4770: ixor
    //   4771: ldc2_w -901276173
    //   4774: l2i
    //   4775: ldc_w 438417587
    //   4778: ixor
    //   4779: ixor
    //   4780: lookupswitch default -> 5851, -1258027734 -> 4763, 1613883594 -> 4808
    //   4808: goto -> 4812
    //   4811: athrow
    //   4812: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   4815: goto -> 4819
    //   4818: athrow
    //   4819: getstatic Perryc.0 : I
    //   4822: ifle -> 4836
    //   4825: ldc2_w -1239453964
    //   4828: l2i
    //   4829: ldc_w -624656888
    //   4832: ixor
    //   4833: goto -> 4844
    //   4836: ldc2_w -1438967587
    //   4839: l2i
    //   4840: ldc_w 50323272
    //   4843: ixor
    //   4844: ldc2_w 635076732
    //   4847: l2i
    //   4848: ldc_w -1446089921
    //   4851: ixor
    //   4852: ixor
    //   4853: lookupswitch default -> 4880, -523240513 -> 5903, 1758853453 -> 4836
    //   4880: dload #4
    //   4882: getstatic Perryc.c : I
    //   4885: iflt -> 4899
    //   4888: ldc2_w 312616631
    //   4891: l2i
    //   4892: ldc_w -1027379078
    //   4895: ixor
    //   4896: goto -> 4907
    //   4899: ldc2_w -203077524
    //   4902: l2i
    //   4903: ldc_w -1334989966
    //   4906: ixor
    //   4907: ldc2_w -1053334860
    //   4910: l2i
    //   4911: ldc_w 667412179
    //   4914: ixor
    //   4915: ixor
    //   4916: lookupswitch default -> 4944, -193177085 -> 4899, 915526314 -> 6005
    //   4944: aload #7
    //   4946: getstatic Perryc.0 : I
    //   4949: ifle -> 4963
    //   4952: ldc2_w 313347337
    //   4955: l2i
    //   4956: ldc_w 1615424713
    //   4959: ixor
    //   4960: goto -> 4971
    //   4963: ldc2_w -1129671946
    //   4966: l2i
    //   4967: ldc_w 1392513618
    //   4970: ixor
    //   4971: ldc2_w -1152197589
    //   4974: l2i
    //   4975: ldc_w -130637130
    //   4978: ixor
    //   4979: ixor
    //   4980: lookupswitch default -> 5931, -1395720647 -> 5008, 830496605 -> 4963
    //   5008: iload #8
    //   5010: getstatic Perryc.0 : I
    //   5013: ifle -> 5027
    //   5016: ldc2_w 2031852974
    //   5019: l2i
    //   5020: ldc_w -1174161020
    //   5023: ixor
    //   5024: goto -> 5035
    //   5027: ldc2_w -227328965
    //   5030: l2i
    //   5031: ldc_w 509661672
    //   5034: ixor
    //   5035: ldc2_w 923201258
    //   5038: l2i
    //   5039: ldc_w -1555720794
    //   5042: ixor
    //   5043: ixor
    //   5044: lookupswitch default -> 5072, 1465605990 -> 5877, 1755981298 -> 5027
    //   5072: goto -> 5076
    //   5075: athrow
    //   5076: invokeinterface get : (I)Ljava/lang/Object;
    //   5081: goto -> 5085
    //   5084: athrow
    //   5085: checkcast net/minecraft/util/math/AxisAlignedBB
    //   5088: getstatic Perryc.c : I
    //   5091: iflt -> 5105
    //   5094: ldc2_w 410295620
    //   5097: l2i
    //   5098: ldc_w -397020997
    //   5101: ixor
    //   5102: goto -> 5113
    //   5105: ldc2_w 407815636
    //   5108: l2i
    //   5109: ldc_w 1264453410
    //   5112: ixor
    //   5113: ldc2_w 445317703
    //   5116: l2i
    //   5117: ldc_w 64505858
    //   5120: ixor
    //   5121: ixor
    //   5122: lookupswitch default -> 5148, -378394694 -> 5945, 2085461648 -> 5105
    //   5148: goto -> 5152
    //   5151: athrow
    //   5152: invokestatic calculateZOffset : (Lnet/minecraft/util/math/AxisAlignedBB;DLnet/minecraft/util/math/AxisAlignedBB;)D
    //   5155: goto -> 5159
    //   5158: athrow
    //   5159: getstatic Perryc.c : I
    //   5162: iflt -> 5176
    //   5165: ldc2_w -468391738
    //   5168: l2i
    //   5169: ldc_w 1558124386
    //   5172: ixor
    //   5173: goto -> 5184
    //   5176: ldc2_w 10733897
    //   5179: l2i
    //   5180: ldc_w -1187536100
    //   5183: ixor
    //   5184: ldc2_w 317941643
    //   5187: l2i
    //   5188: ldc_w 370623087
    //   5191: ixor
    //   5192: ixor
    //   5193: lookupswitch default -> 5220, -1137714624 -> 5971, 504776576 -> 5176
    //   5220: dstore #4
    //   5222: iinc #8, 1
    //   5225: goto -> 4502
    //   5228: getstatic Perryc.1 : I
    //   5231: ifeq -> 5245
    //   5234: ldc2_w 1851205365
    //   5237: l2i
    //   5238: ldc_w 1087723675
    //   5241: ixor
    //   5242: goto -> 5253
    //   5245: ldc2_w -345236652
    //   5248: l2i
    //   5249: ldc_w 232253692
    //   5252: ixor
    //   5253: ldc2_w 2042955156
    //   5256: l2i
    //   5257: ldc_w -864260408
    //   5260: ixor
    //   5261: ixor
    //   5262: lookupswitch default -> 5288, -1690626766 -> 6003, -1002593066 -> 5245
    //   5288: dload #4
    //   5290: ldc2_w 3.471478321238602E307
    //   5293: invokestatic doubleToLongBits : (D)J
    //   5296: ldc2_w 9207811465731806799
    //   5299: lxor
    //   5300: invokestatic longBitsToDouble : (J)D
    //   5303: dcmpl
    //   5304: ifeq -> 5318
    //   5307: ldc2_w 775445922
    //   5310: l2i
    //   5311: ldc_w 1794260448
    //   5314: ixor
    //   5315: goto -> 5326
    //   5318: ldc2_w -217049186
    //   5321: l2i
    //   5322: ldc_w -1210419233
    //   5325: ixor
    //   5326: ldc2_w 1677796149
    //   5329: l2i
    //   5330: ldc_w -1814763642
    //   5333: ixor
    //   5334: ixor
    //   5335: tableswitch default -> 5307, -1289771791 -> 5356, -1289771790 -> 5787
    //   5356: getstatic Perryc.1 : I
    //   5359: ifeq -> 5373
    //   5362: ldc2_w -839133841
    //   5365: l2i
    //   5366: ldc_w 601312859
    //   5369: ixor
    //   5370: goto -> 5381
    //   5373: ldc2_w 1993972595
    //   5376: l2i
    //   5377: ldc_w -1687986550
    //   5380: ixor
    //   5381: ldc2_w -2053079281
    //   5384: l2i
    //   5385: ldc_w 890383604
    //   5388: ixor
    //   5389: ixor
    //   5390: lookupswitch default -> 5416, -802470470 -> 5373, 1587464399 -> 5963
    //   5416: aload #6
    //   5418: getstatic Perryc.c : I
    //   5421: iflt -> 5435
    //   5424: ldc2_w -2066512499
    //   5427: l2i
    //   5428: ldc_w -750343138
    //   5431: ixor
    //   5432: goto -> 5443
    //   5435: ldc2_w -1344433597
    //   5438: l2i
    //   5439: ldc_w 148397931
    //   5442: ixor
    //   5443: ldc2_w 1288954669
    //   5446: l2i
    //   5447: ldc_w -1020566989
    //   5450: ixor
    //   5451: ixor
    //   5452: lookupswitch default -> 5480, -2119962611 -> 5435, -663902067 -> 5855
    //   5480: aload #6
    //   5482: getstatic Perryc.1 : I
    //   5485: ifeq -> 5499
    //   5488: ldc2_w -1260025248
    //   5491: l2i
    //   5492: ldc_w 125375743
    //   5495: ixor
    //   5496: goto -> 5507
    //   5499: ldc2_w -1273754108
    //   5502: l2i
    //   5503: ldc_w 1445741611
    //   5506: ixor
    //   5507: ldc2_w 1820485580
    //   5510: l2i
    //   5511: ldc_w 841697685
    //   5514: ixor
    //   5515: ixor
    //   5516: lookupswitch default -> 5544, -415299182 -> 5499, -315248442 -> 5857
    //   5544: goto -> 5548
    //   5547: athrow
    //   5548: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   5551: goto -> 5555
    //   5554: athrow
    //   5555: ldc2_w 1.0235081208456982E308
    //   5558: invokestatic doubleToLongBits : (D)J
    //   5561: ldc2_w 9214989444452692291
    //   5564: lxor
    //   5565: invokestatic longBitsToDouble : (J)D
    //   5568: ldc2_w 1.6578284422665297E308
    //   5571: invokestatic doubleToLongBits : (D)J
    //   5574: ldc2_w 9218167656248448172
    //   5577: lxor
    //   5578: invokestatic longBitsToDouble : (J)D
    //   5581: getstatic Perryc.c : I
    //   5584: iflt -> 5598
    //   5587: ldc2_w 638873775
    //   5590: l2i
    //   5591: ldc_w 306033434
    //   5594: ixor
    //   5595: goto -> 5606
    //   5598: ldc2_w 1966095192
    //   5601: l2i
    //   5602: ldc_w 1098247607
    //   5605: ixor
    //   5606: ldc2_w -1773635213
    //   5609: l2i
    //   5610: ldc_w 777454778
    //   5613: ixor
    //   5614: ixor
    //   5615: lookupswitch default -> 5905, -1942569348 -> 5598, -1940215002 -> 5640
    //   5640: dload #4
    //   5642: getstatic Perryc.0 : I
    //   5645: ifle -> 5659
    //   5648: ldc2_w 1026843289
    //   5651: l2i
    //   5652: ldc_w 1897185067
    //   5655: ixor
    //   5656: goto -> 5667
    //   5659: ldc2_w -1822580899
    //   5662: l2i
    //   5663: ldc_w 1435541981
    //   5666: ixor
    //   5667: ldc2_w -86140548
    //   5670: l2i
    //   5671: ldc_w -1982334323
    //   5674: ixor
    //   5675: ixor
    //   5676: lookupswitch default -> 5873, -1245225615 -> 5704, 1059765827 -> 5659
    //   5704: goto -> 5708
    //   5707: athrow
    //   5708: invokevirtual func_72317_d : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   5711: goto -> 5715
    //   5714: athrow
    //   5715: getstatic Perryc.1 : I
    //   5718: ifeq -> 5732
    //   5721: ldc2_w 5073887
    //   5724: l2i
    //   5725: ldc_w 2006123034
    //   5728: ixor
    //   5729: goto -> 5740
    //   5732: ldc2_w -359869663
    //   5735: l2i
    //   5736: ldc_w -1904837035
    //   5739: ixor
    //   5740: ldc2_w 979951966
    //   5743: l2i
    //   5744: ldc_w 1694798322
    //   5747: ixor
    //   5748: ixor
    //   5749: lookupswitch default -> 5776, 682760553 -> 5869, 1076907413 -> 5732
    //   5776: goto -> 5780
    //   5779: athrow
    //   5780: invokevirtual func_174826_a : (Lnet/minecraft/util/math/AxisAlignedBB;)V
    //   5783: goto -> 5787
    //   5786: athrow
    //   5787: getstatic Perryc.0 : I
    //   5790: ifle -> 5804
    //   5793: ldc2_w -1498493945
    //   5796: l2i
    //   5797: ldc_w 124227203
    //   5800: ixor
    //   5801: goto -> 5812
    //   5804: ldc2_w 1537870716
    //   5807: l2i
    //   5808: ldc_w 7384751
    //   5811: ixor
    //   5812: ldc2_w 1345432318
    //   5815: l2i
    //   5816: ldc_w 2095576252
    //   5819: ixor
    //   5820: ixor
    //   5821: lookupswitch default -> 5848, -1927340858 -> 5955, 351937116 -> 5804
    //   5848: aload #6
    //   5850: areturn
    //   5851: aconst_null
    //   5852: athrow
    //   5853: aconst_null
    //   5854: athrow
    //   5855: aconst_null
    //   5856: athrow
    //   5857: aconst_null
    //   5858: athrow
    //   5859: aconst_null
    //   5860: athrow
    //   5861: aconst_null
    //   5862: athrow
    //   5863: aconst_null
    //   5864: athrow
    //   5865: aconst_null
    //   5866: athrow
    //   5867: aconst_null
    //   5868: athrow
    //   5869: aconst_null
    //   5870: athrow
    //   5871: aconst_null
    //   5872: athrow
    //   5873: aconst_null
    //   5874: athrow
    //   5875: aconst_null
    //   5876: athrow
    //   5877: aconst_null
    //   5878: athrow
    //   5879: aconst_null
    //   5880: athrow
    //   5881: aconst_null
    //   5882: athrow
    //   5883: aconst_null
    //   5884: athrow
    //   5885: aconst_null
    //   5886: athrow
    //   5887: aconst_null
    //   5888: athrow
    //   5889: aconst_null
    //   5890: athrow
    //   5891: aconst_null
    //   5892: athrow
    //   5893: aconst_null
    //   5894: athrow
    //   5895: aconst_null
    //   5896: athrow
    //   5897: aconst_null
    //   5898: athrow
    //   5899: aconst_null
    //   5900: athrow
    //   5901: aconst_null
    //   5902: athrow
    //   5903: aconst_null
    //   5904: athrow
    //   5905: aconst_null
    //   5906: athrow
    //   5907: aconst_null
    //   5908: athrow
    //   5909: aconst_null
    //   5910: athrow
    //   5911: aconst_null
    //   5912: athrow
    //   5913: aconst_null
    //   5914: athrow
    //   5915: aconst_null
    //   5916: athrow
    //   5917: aconst_null
    //   5918: athrow
    //   5919: aconst_null
    //   5920: athrow
    //   5921: aconst_null
    //   5922: athrow
    //   5923: aconst_null
    //   5924: athrow
    //   5925: aconst_null
    //   5926: athrow
    //   5927: aconst_null
    //   5928: athrow
    //   5929: aconst_null
    //   5930: athrow
    //   5931: aconst_null
    //   5932: athrow
    //   5933: aconst_null
    //   5934: athrow
    //   5935: aconst_null
    //   5936: athrow
    //   5937: aconst_null
    //   5938: athrow
    //   5939: aconst_null
    //   5940: athrow
    //   5941: aconst_null
    //   5942: athrow
    //   5943: aconst_null
    //   5944: athrow
    //   5945: aconst_null
    //   5946: athrow
    //   5947: aconst_null
    //   5948: athrow
    //   5949: aconst_null
    //   5950: athrow
    //   5951: aconst_null
    //   5952: athrow
    //   5953: aconst_null
    //   5954: athrow
    //   5955: aconst_null
    //   5956: athrow
    //   5957: aconst_null
    //   5958: athrow
    //   5959: aconst_null
    //   5960: athrow
    //   5961: aconst_null
    //   5962: athrow
    //   5963: aconst_null
    //   5964: athrow
    //   5965: aconst_null
    //   5966: athrow
    //   5967: aconst_null
    //   5968: athrow
    //   5969: aconst_null
    //   5970: athrow
    //   5971: aconst_null
    //   5972: athrow
    //   5973: aconst_null
    //   5974: athrow
    //   5975: aconst_null
    //   5976: athrow
    //   5977: aconst_null
    //   5978: athrow
    //   5979: aconst_null
    //   5980: athrow
    //   5981: aconst_null
    //   5982: athrow
    //   5983: aconst_null
    //   5984: athrow
    //   5985: aconst_null
    //   5986: athrow
    //   5987: aconst_null
    //   5988: athrow
    //   5989: aconst_null
    //   5990: athrow
    //   5991: aconst_null
    //   5992: athrow
    //   5993: aconst_null
    //   5994: athrow
    //   5995: aconst_null
    //   5996: athrow
    //   5997: aconst_null
    //   5998: athrow
    //   5999: aconst_null
    //   6000: athrow
    //   6001: aconst_null
    //   6002: athrow
    //   6003: aconst_null
    //   6004: athrow
    //   6005: aconst_null
    //   6006: athrow
    //   6007: pop
    //   6008: goto -> 24
    //   6011: pop
    //   6012: aconst_null
    //   6013: goto -> 6007
    //   6016: dup
    //   6017: ifnull -> 6007
    //   6020: checkcast java/lang/Throwable
    //   6023: athrow
    //   6024: dup
    //   6025: ifnull -> 6011
    //   6028: checkcast java/lang/Throwable
    //   6031: athrow
    //   6032: aconst_null
    //   6033: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1142	721	9	l	I
    //   942	1481	8	k	I
    //   2822	721	9	l5	I
    //   2622	1481	8	j5	I
    //   4502	726	9	i6	I
    //   4302	1485	8	k5	I
    //   24	5827	0	x	D
    //   24	5827	2	y	D
    //   24	5827	4	z	D
    //   24	5827	6	entity	Lnet/minecraft/entity/player/EntityPlayer;
    //   742	5109	7	list1	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   742	5109	7	list1	Ljava/util/List<Lnet/minecraft/util/math/AxisAlignedBB;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	6016	finally
    //   343	350	350	finally
    //   343	350	3	finally
    //   343	350	350	finally
    //   344	350	343	finally
    //   344	350	3	java/lang/ArrayIndexOutOfBoundsException
    //   599	606	606	finally
    //   599	606	599	java/lang/ClassCastException
    //   599	606	599	finally
    //   600	606	606	java/lang/StringIndexOutOfBoundsException
    //   600	606	606	finally
    //   671	678	678	finally
    //   671	678	671	finally
    //   671	678	671	finally
    //   672	678	678	finally
    //   672	678	678	finally
    //   1071	1080	1080	finally
    //   1071	1080	3	finally
    //   1071	1080	1071	finally
    //   1072	1080	1080	java/lang/NullPointerException
    //   1072	1080	3	java/lang/ArithmeticException
    //   1515	1524	1524	finally
    //   1515	1524	3	finally
    //   1515	1524	1515	java/lang/ClassCastException
    //   1515	1524	1524	finally
    //   1516	1524	1524	java/lang/StringIndexOutOfBoundsException
    //   1656	1662	1662	finally
    //   1656	1662	1662	finally
    //   1656	1662	1662	java/lang/AssertionError
    //   1656	1662	1662	java/lang/IllegalArgumentException
    //   1656	1662	3	java/lang/ArrayIndexOutOfBoundsException
    //   1787	1794	1794	finally
    //   1787	1794	1787	java/util/NoSuchElementException
    //   1787	1794	1787	finally
    //   1787	1794	1794	finally
    //   1788	1794	3	finally
    //   2183	2190	2190	finally
    //   2183	2190	2183	finally
    //   2183	2190	2183	java/lang/EnumConstantNotPresentException
    //   2183	2190	2183	finally
    //   2184	2190	2183	finally
    //   2344	2350	2350	finally
    //   2344	2350	3	finally
    //   2344	2350	2350	finally
    //   2344	2350	3	java/lang/ArrayIndexOutOfBoundsException
    //   2344	2350	2350	java/lang/IllegalArgumentException
    //   2416	2422	2422	finally
    //   2416	2422	2422	java/lang/RuntimeException
    //   2416	2422	3	finally
    //   2416	2422	3	java/lang/RuntimeException
    //   2416	2422	2422	java/lang/IndexOutOfBoundsException
    //   2751	2760	2760	finally
    //   2751	2760	2751	java/lang/NullPointerException
    //   2751	2760	2751	java/lang/ArithmeticException
    //   2751	2760	2751	finally
    //   2752	2760	2751	finally
    //   3131	3138	3138	finally
    //   3131	3138	3131	java/lang/NegativeArraySizeException
    //   3131	3138	3131	java/lang/NullPointerException
    //   3132	3138	3131	finally
    //   3132	3138	3138	finally
    //   3391	3400	3400	finally
    //   3391	3400	3	java/lang/NumberFormatException
    //   3392	3400	3391	finally
    //   3392	3400	3	java/lang/StringIndexOutOfBoundsException
    //   3392	3400	3391	finally
    //   3467	3474	3474	finally
    //   3467	3474	3	finally
    //   3468	3474	3474	finally
    //   3468	3474	3474	finally
    //   3468	3474	3467	finally
    //   3863	3870	3870	finally
    //   3863	3870	3863	finally
    //   3864	3870	3870	java/lang/EnumConstantNotPresentException
    //   3864	3870	3863	finally
    //   3864	3870	3	java/lang/ClassCastException
    //   4023	4030	4030	finally
    //   4023	4030	4030	java/lang/IndexOutOfBoundsException
    //   4023	4030	4023	finally
    //   4024	4030	3	java/lang/NumberFormatException
    //   4024	4030	4023	finally
    //   4095	4102	4102	finally
    //   4095	4102	4102	java/lang/NullPointerException
    //   4095	4102	4102	java/lang/StringIndexOutOfBoundsException
    //   4096	4102	4102	finally
    //   4096	4102	4095	finally
    //   4432	4440	4440	finally
    //   4432	4440	3	finally
    //   4432	4440	3	java/lang/StringIndexOutOfBoundsException
    //   4432	4440	3	finally
    //   4432	4440	3	java/lang/IllegalStateException
    //   4811	4818	4818	finally
    //   4811	4818	4818	finally
    //   4811	4818	4818	java/lang/RuntimeException
    //   4811	4818	4811	finally
    //   4812	4818	4818	finally
    //   5075	5084	5084	finally
    //   5076	5084	3	java/lang/UnsupportedOperationException
    //   5076	5084	3	finally
    //   5076	5084	3	java/lang/AssertionError
    //   5076	5084	5075	java/lang/ClassCastException
    //   5151	5158	5158	finally
    //   5151	5158	5151	finally
    //   5151	5158	5151	java/lang/EnumConstantNotPresentException
    //   5152	5158	5158	finally
    //   5152	5158	3	finally
    //   5547	5554	5554	finally
    //   5547	5554	5554	java/lang/AssertionError
    //   5547	5554	5554	java/lang/EnumConstantNotPresentException
    //   5547	5554	5547	finally
    //   5547	5554	5547	finally
    //   5707	5714	5714	finally
    //   5707	5714	3	finally
    //   5707	5714	5714	finally
    //   5708	5714	5707	java/lang/NumberFormatException
    //   5708	5714	5714	java/lang/RuntimeException
    //   5779	5786	5786	finally
    //   5779	5786	5779	finally
    //   5779	5786	3	java/lang/RuntimeException
    //   5779	5786	3	java/lang/NumberFormatException
    //   5780	5786	5779	finally
    //   6016	6024	6016	java/util/NoSuchElementException
    //   6032	6034	3	java/lang/IllegalArgumentException
  }
  
  public static double calculateZOffset(AxisAlignedBB paramAxisAlignedBB1, double paramDouble, AxisAlignedBB paramAxisAlignedBB2) {
    return Perry1.1j(null, (int)33394906L ^ 0x5F17D176, paramAxisAlignedBB1, paramDouble, paramAxisAlignedBB2);
  }
  
  public static List possiblePlacePositions(float placeRange, boolean specialEntityCheck, boolean oneDot15) {
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
  
  public static float getBlastReduction(EntityLivingBase paramEntityLivingBase, float paramFloat, Explosion paramExplosion) {
    return Perry1.5K(null, (int)1977062840L ^ 0x7657EBB4, paramEntityLivingBase, paramFloat, paramExplosion);
  }
  
  public static float calculateDamage(Entity crystal, Entity target, boolean shouldIgnore) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 721
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 713
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 705
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1415820968
    //   33: l2i
    //   34: ldc_w -1001045909
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -502658901
    //   44: l2i
    //   45: ldc_w -1959909184
    //   48: ixor
    //   49: ldc2_w 1647745660
    //   52: l2i
    //   53: ldc_w -299722939
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 472054778 -> 678, 1025967501 -> 41
    //   84: aload_1
    //   85: new net/minecraft/util/math/Vec3d
    //   88: dup
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w -1249030779
    //   98: l2i
    //   99: ldc_w 283766319
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -1557671534
    //   109: l2i
    //   110: ldc_w 18879130
    //   113: ixor
    //   114: ldc2_w 2062134926
    //   117: l2i
    //   118: ldc_w 695418147
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 692, -241348443 -> 148, -151113721 -> 106
    //   148: aload_0
    //   149: getstatic Perryc.0 : I
    //   152: ifle -> 166
    //   155: ldc2_w -442384255
    //   158: l2i
    //   159: ldc_w 2013718102
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w 107872021
    //   169: l2i
    //   170: ldc_w -1204980404
    //   173: ixor
    //   174: ldc2_w -12187283
    //   177: l2i
    //   178: ldc_w -755358930
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 208, -1340404588 -> 688, -782750442 -> 166
    //   208: getfield field_70165_t : D
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w 1100156601
    //   220: l2i
    //   221: ldc_w -1584727885
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w 1321967644
    //   231: l2i
    //   232: ldc_w 2056270217
    //   235: ixor
    //   236: ldc2_w -1030852420
    //   239: l2i
    //   240: ldc_w -600169508
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 272, -1138506676 -> 228, -22174358 -> 684
    //   272: aload_0
    //   273: getstatic Perryc.0 : I
    //   276: ifle -> 290
    //   279: ldc2_w 707789531
    //   282: l2i
    //   283: ldc_w -694291907
    //   286: ixor
    //   287: goto -> 298
    //   290: ldc2_w -1836075510
    //   293: l2i
    //   294: ldc_w 1214530482
    //   297: ixor
    //   298: ldc2_w -1665323146
    //   301: l2i
    //   302: ldc_w -1290336943
    //   305: ixor
    //   306: ixor
    //   307: lookupswitch default -> 332, -754459967 -> 686, 209207276 -> 290
    //   332: getfield field_70163_u : D
    //   335: getstatic Perryc.1 : I
    //   338: ifeq -> 352
    //   341: ldc2_w 361585898
    //   344: l2i
    //   345: ldc_w 2014845925
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 1892354680
    //   355: l2i
    //   356: ldc_w 507706676
    //   359: ixor
    //   360: ldc2_w -1518837521
    //   363: l2i
    //   364: ldc_w -1221399360
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 680, 2093185891 -> 396, 2145372960 -> 352
    //   396: aload_0
    //   397: getstatic Perryc.1 : I
    //   400: ifeq -> 414
    //   403: ldc2_w -1574117820
    //   406: l2i
    //   407: ldc_w 351885961
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w 1288129574
    //   417: l2i
    //   418: ldc_w 2043664235
    //   421: ixor
    //   422: ldc2_w 987425300
    //   425: l2i
    //   426: ldc_w 1179098394
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 694, -901188669 -> 414, 1234562115 -> 456
    //   456: getfield field_70161_v : D
    //   459: getstatic Perryc.0 : I
    //   462: ifle -> 476
    //   465: ldc2_w 202189059
    //   468: l2i
    //   469: ldc_w 1394368787
    //   472: ixor
    //   473: goto -> 484
    //   476: ldc2_w -1327172534
    //   479: l2i
    //   480: ldc_w 1260151192
    //   483: ixor
    //   484: ldc2_w 1202885772
    //   487: l2i
    //   488: ldc_w 1105334026
    //   491: ixor
    //   492: ixor
    //   493: lookupswitch default -> 520, -672680605 -> 476, 1497486230 -> 690
    //   520: goto -> 524
    //   523: athrow
    //   524: invokespecial <init> : (DDD)V
    //   527: goto -> 531
    //   530: athrow
    //   531: ldc_w 1.7523879
    //   534: invokestatic floatToIntBits : (F)I
    //   537: ldc_w 2132823615
    //   540: ixor
    //   541: invokestatic intBitsToFloat : (I)F
    //   544: getstatic Perryc.c : I
    //   547: iflt -> 561
    //   550: ldc2_w 434503081
    //   553: l2i
    //   554: ldc_w -1666096259
    //   557: ixor
    //   558: goto -> 569
    //   561: ldc2_w -1035292980
    //   564: l2i
    //   565: ldc_w 1437505818
    //   568: ixor
    //   569: ldc2_w 1021799873
    //   572: l2i
    //   573: ldc_w 2055803353
    //   576: ixor
    //   577: ixor
    //   578: lookupswitch default -> 604, -1296177753 -> 561, -1019551028 -> 676
    //   604: iload_2
    //   605: getstatic Perryc.0 : I
    //   608: ifle -> 622
    //   611: ldc2_w 823848776
    //   614: l2i
    //   615: ldc_w -324977634
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w 1952195745
    //   625: l2i
    //   626: ldc_w 1543463024
    //   629: ixor
    //   630: ldc2_w -1069546044
    //   633: l2i
    //   634: ldc_w -630920195
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 664, -945865361 -> 682, 1106170164 -> 622
    //   664: goto -> 668
    //   667: athrow
    //   668: invokestatic getExplosionDamage : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;FZ)F
    //   671: goto -> 675
    //   674: athrow
    //   675: freturn
    //   676: aconst_null
    //   677: athrow
    //   678: aconst_null
    //   679: athrow
    //   680: aconst_null
    //   681: athrow
    //   682: aconst_null
    //   683: athrow
    //   684: aconst_null
    //   685: athrow
    //   686: aconst_null
    //   687: athrow
    //   688: aconst_null
    //   689: athrow
    //   690: aconst_null
    //   691: athrow
    //   692: aconst_null
    //   693: athrow
    //   694: aconst_null
    //   695: athrow
    //   696: pop
    //   697: goto -> 24
    //   700: pop
    //   701: aconst_null
    //   702: goto -> 696
    //   705: dup
    //   706: ifnull -> 696
    //   709: checkcast java/lang/Throwable
    //   712: athrow
    //   713: dup
    //   714: ifnull -> 700
    //   717: checkcast java/lang/Throwable
    //   720: athrow
    //   721: aconst_null
    //   722: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	652	0	crystal	Lnet/minecraft/entity/Entity;
    //   24	652	1	target	Lnet/minecraft/entity/Entity;
    //   24	652	2	shouldIgnore	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	705	java/lang/AssertionError
    //   523	530	530	finally
    //   523	530	530	finally
    //   523	530	530	finally
    //   523	530	523	java/lang/StringIndexOutOfBoundsException
    //   524	530	523	java/lang/ArrayIndexOutOfBoundsException
    //   667	674	674	finally
    //   667	674	667	java/util/ConcurrentModificationException
    //   668	674	3	finally
    //   668	674	667	finally
    //   668	674	674	finally
    //   705	713	705	finally
    //   721	723	3	java/lang/IndexOutOfBoundsException
  }
  
  public static boolean lambda$possiblePlacePositions$1(boolean paramBoolean1, boolean paramBoolean2, BlockPos paramBlockPos) {
    return Perry1.0p(null, (int)-2068992421L ^ 0x846B579B, paramBoolean1, paramBoolean2, paramBlockPos);
  }
  
  public static List getSphere(BlockPos pos, float r, int h, boolean hollow, boolean sphere, int plus_y) {
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
  
  public static float calculateDamage(BlockPos pos, Entity target, boolean shouldIgnore) {
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
  
  public static Entity getPredictedPosition(Entity entity, double x) {
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
  
  public static float getDamageFromDifficulty(float damage, EnumDifficulty difficulty) {
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
  
  public static boolean lambda$possiblePlacePositions$0(BlockPos paramBlockPos) {
    return Perry1.6m(null, (int)-440774001L ^ 0xDAE1AAAD, paramBlockPos);
  }
  
  public static boolean isOnGround(double x, double y, double z, Entity entity) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2403
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2395
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2387
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -372267565
    //   33: l2i
    //   34: ldc_w -1687086746
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1537494140
    //   44: l2i
    //   45: ldc_w 1430223522
    //   48: ixor
    //   49: ldc2_w -937832016
    //   52: l2i
    //   53: ldc_w 1087220707
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2376, -93665562 -> 41, 2041623413 -> 84
    //   84: dload_2
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -1967971568
    //   94: l2i
    //   95: ldc_w -1021853605
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1039409211
    //   105: l2i
    //   106: ldc_w -1831049204
    //   109: ixor
    //   110: ldc2_w 142112502
    //   113: l2i
    //   114: ldc_w 1088744153
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2370, -407579624 -> 144, 20479844 -> 102
    //   144: dstore #7
    //   146: getstatic Perryc.1 : I
    //   149: ifeq -> 163
    //   152: ldc2_w 455137922
    //   155: l2i
    //   156: ldc_w -766820331
    //   159: ixor
    //   160: goto -> 171
    //   163: ldc2_w 1031418219
    //   166: l2i
    //   167: ldc_w -1335077954
    //   170: ixor
    //   171: ldc2_w -1303266183
    //   174: l2i
    //   175: ldc_w 863104788
    //   178: ixor
    //   179: ixor
    //   180: lookupswitch default -> 208, 645433406 -> 163, 1212926458 -> 2346
    //   208: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeCrystalUtil.mc : Lnet/minecraft/client/Minecraft;
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w -1983649970
    //   220: l2i
    //   221: ldc_w 1764452137
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w -578876479
    //   231: l2i
    //   232: ldc_w 33669205
    //   235: ixor
    //   236: ldc2_w -1970985244
    //   239: l2i
    //   240: ldc_w -4466313
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 2320, -1781104652 -> 228, -1438632953 -> 272
    //   272: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   275: getstatic Perryc.1 : I
    //   278: ifeq -> 292
    //   281: ldc2_w -1951983404
    //   284: l2i
    //   285: ldc_w 1679517345
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w 2031279712
    //   295: l2i
    //   296: ldc_w 256410261
    //   299: ixor
    //   300: ldc2_w -458142974
    //   303: l2i
    //   304: ldc_w 2025561161
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 2366, -363820098 -> 336, 1941350718 -> 292
    //   336: aload #6
    //   338: getstatic Perryc.c : I
    //   341: iflt -> 355
    //   344: ldc2_w -1475016515
    //   347: l2i
    //   348: ldc_w -820685505
    //   351: ixor
    //   352: goto -> 363
    //   355: ldc2_w -1347905354
    //   358: l2i
    //   359: ldc_w 527212653
    //   362: ixor
    //   363: ldc2_w 216065973
    //   366: l2i
    //   367: ldc_w -1152988795
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 400, -794397774 -> 2332, -343085593 -> 355
    //   400: aload #6
    //   402: getstatic Perryc.1 : I
    //   405: ifeq -> 419
    //   408: ldc2_w 36206115
    //   411: l2i
    //   412: ldc_w 627589645
    //   415: ixor
    //   416: goto -> 427
    //   419: ldc2_w 780820447
    //   422: l2i
    //   423: ldc_w -1061682154
    //   426: ixor
    //   427: ldc2_w -964542937
    //   430: l2i
    //   431: ldc_w 625667590
    //   434: ixor
    //   435: ixor
    //   436: lookupswitch default -> 2326, -997661681 -> 419, 234523624 -> 464
    //   464: goto -> 468
    //   467: athrow
    //   468: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   471: goto -> 475
    //   474: athrow
    //   475: getstatic Perryc.1 : I
    //   478: ifeq -> 492
    //   481: ldc2_w 1759882098
    //   484: l2i
    //   485: ldc_w 1492902807
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -1884834692
    //   495: l2i
    //   496: ldc_w -209622225
    //   499: ixor
    //   500: ldc2_w -1654040810
    //   503: l2i
    //   504: ldc_w 1861641648
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, -1014924733 -> 2348, 739294625 -> 492
    //   536: dload_0
    //   537: getstatic Perryc.1 : I
    //   540: ifeq -> 554
    //   543: ldc2_w -93375228
    //   546: l2i
    //   547: ldc_w -1576193694
    //   550: ixor
    //   551: goto -> 562
    //   554: ldc2_w -159744736
    //   557: l2i
    //   558: ldc_w -451076552
    //   561: ixor
    //   562: ldc2_w 1936897870
    //   565: l2i
    //   566: ldc_w -1050484917
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 2322, -1586033891 -> 596, -361599901 -> 554
    //   596: dload_2
    //   597: getstatic Perryc.c : I
    //   600: iflt -> 614
    //   603: ldc2_w -1339610355
    //   606: l2i
    //   607: ldc_w -390158752
    //   610: ixor
    //   611: goto -> 622
    //   614: ldc2_w -2011649862
    //   617: l2i
    //   618: ldc_w 1544284556
    //   621: ixor
    //   622: ldc2_w 2079651398
    //   625: l2i
    //   626: ldc_w 1767164960
    //   629: ixor
    //   630: ixor
    //   631: lookupswitch default -> 656, 1245296395 -> 2336, 1866729167 -> 614
    //   656: dload #4
    //   658: getstatic Perryc.1 : I
    //   661: ifeq -> 675
    //   664: ldc2_w -210449485
    //   667: l2i
    //   668: ldc_w -504815351
    //   671: ixor
    //   672: goto -> 683
    //   675: ldc2_w -571291476
    //   678: l2i
    //   679: ldc_w -1460170288
    //   682: ixor
    //   683: ldc2_w -440032981
    //   686: l2i
    //   687: ldc_w -49885081
    //   690: ixor
    //   691: ixor
    //   692: lookupswitch default -> 2360, 173972470 -> 675, 1841702960 -> 720
    //   720: goto -> 724
    //   723: athrow
    //   724: invokevirtual func_72321_a : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   727: goto -> 731
    //   730: athrow
    //   731: getstatic Perryc.c : I
    //   734: iflt -> 748
    //   737: ldc2_w -628660081
    //   740: l2i
    //   741: ldc_w -1161160477
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w 639029252
    //   751: l2i
    //   752: ldc_w 680360560
    //   755: ixor
    //   756: ldc2_w -1973505109
    //   759: l2i
    //   760: ldc_w -1967244965
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 792, -1056005771 -> 748, 1622014620 -> 2354
    //   792: goto -> 796
    //   795: athrow
    //   796: invokevirtual func_184144_a : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   799: goto -> 803
    //   802: athrow
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w -380052940
    //   812: l2i
    //   813: ldc_w -1198698907
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -1378005343
    //   823: l2i
    //   824: ldc_w -1957442179
    //   827: ixor
    //   828: ldc2_w 1891006265
    //   831: l2i
    //   832: ldc_w 409918916
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 864, 319945594 -> 820, 957169324 -> 2328
    //   864: astore #9
    //   866: getstatic Perryc.c : I
    //   869: iflt -> 883
    //   872: ldc2_w -1596025961
    //   875: l2i
    //   876: ldc_w -411114257
    //   879: ixor
    //   880: goto -> 891
    //   883: ldc2_w 2028366552
    //   886: l2i
    //   887: ldc_w -1934320363
    //   890: ixor
    //   891: ldc2_w -2127262833
    //   894: l2i
    //   895: ldc_w 1325192081
    //   898: ixor
    //   899: ixor
    //   900: lookupswitch default -> 2316, -2006438042 -> 883, 999993299 -> 928
    //   928: dload_2
    //   929: ldc2_w 3.3863144913507777E307
    //   932: invokestatic doubleToLongBits : (D)J
    //   935: ldc2_w 9207640783078528435
    //   938: lxor
    //   939: invokestatic longBitsToDouble : (J)D
    //   942: dcmpl
    //   943: ifeq -> 957
    //   946: ldc2_w -505993353
    //   949: l2i
    //   950: ldc_w -1448715306
    //   953: ixor
    //   954: goto -> 965
    //   957: ldc2_w 214047659
    //   960: l2i
    //   961: ldc_w 1152608011
    //   964: ixor
    //   965: ldc2_w -152191501
    //   968: l2i
    //   969: ldc_w -330229000
    //   972: ixor
    //   973: ixor
    //   974: tableswitch default -> 946, 1389222826 -> 996, 1389222827 -> 1987
    //   996: ldc2_w 424215789
    //   999: l2i
    //   1000: ldc_w 424215789
    //   1003: ixor
    //   1004: getstatic Perryc.0 : I
    //   1007: ifle -> 1021
    //   1010: ldc2_w 161091901
    //   1013: l2i
    //   1014: ldc_w 654955868
    //   1017: ixor
    //   1018: goto -> 1029
    //   1021: ldc2_w 46458242
    //   1024: l2i
    //   1025: ldc_w -1758917221
    //   1028: ixor
    //   1029: ldc2_w -2090216311
    //   1032: l2i
    //   1033: ldc_w -1676452943
    //   1036: ixor
    //   1037: ixor
    //   1038: lookupswitch default -> 2344, -1969789151 -> 1064, 837372761 -> 1021
    //   1064: istore #10
    //   1066: getstatic Perryc.c : I
    //   1069: iflt -> 1083
    //   1072: ldc2_w -100732277
    //   1075: l2i
    //   1076: ldc_w -1977566231
    //   1079: ixor
    //   1080: goto -> 1091
    //   1083: ldc2_w -592913344
    //   1086: l2i
    //   1087: ldc_w -1629083214
    //   1090: ixor
    //   1091: ldc2_w 2140394671
    //   1094: l2i
    //   1095: ldc_w 145758500
    //   1098: ixor
    //   1099: ixor
    //   1100: lookupswitch default -> 2362, 83723497 -> 1083, 896350329 -> 1128
    //   1128: aload #9
    //   1130: getstatic Perryc.c : I
    //   1133: iflt -> 1147
    //   1136: ldc2_w -1390852375
    //   1139: l2i
    //   1140: ldc_w -2104162818
    //   1143: ixor
    //   1144: goto -> 1155
    //   1147: ldc2_w -1960968630
    //   1150: l2i
    //   1151: ldc_w 682218134
    //   1154: ixor
    //   1155: ldc2_w 1469837833
    //   1158: l2i
    //   1159: ldc_w -448853784
    //   1162: ixor
    //   1163: ixor
    //   1164: lookupswitch default -> 2338, -1658275338 -> 1147, 286316093 -> 1192
    //   1192: goto -> 1196
    //   1195: athrow
    //   1196: invokeinterface size : ()I
    //   1201: goto -> 1205
    //   1204: athrow
    //   1205: getstatic Perryc.0 : I
    //   1208: ifle -> 1222
    //   1211: ldc2_w 1513997950
    //   1214: l2i
    //   1215: ldc_w 1607964987
    //   1218: ixor
    //   1219: goto -> 1230
    //   1222: ldc2_w 499372824
    //   1225: l2i
    //   1226: ldc_w -1193076305
    //   1229: ixor
    //   1230: ldc2_w 341993386
    //   1233: l2i
    //   1234: ldc_w 1519774795
    //   1237: ixor
    //   1238: ixor
    //   1239: lookupswitch default -> 2318, -338214570 -> 1264, 1260246180 -> 1222
    //   1264: istore #11
    //   1266: getstatic Perryc.c : I
    //   1269: iflt -> 1283
    //   1272: ldc2_w 882224400
    //   1275: l2i
    //   1276: ldc_w 185701860
    //   1279: ixor
    //   1280: goto -> 1291
    //   1283: ldc2_w 733080470
    //   1286: l2i
    //   1287: ldc_w 1348486753
    //   1290: ixor
    //   1291: ldc2_w 566283427
    //   1294: l2i
    //   1295: ldc_w -485331225
    //   1298: ixor
    //   1299: ixor
    //   1300: lookupswitch default -> 2356, -1190981709 -> 1328, -44655952 -> 1283
    //   1328: iload #10
    //   1330: getstatic Perryc.0 : I
    //   1333: ifle -> 1347
    //   1336: ldc2_w 2144752518
    //   1339: l2i
    //   1340: ldc_w -1119376389
    //   1343: ixor
    //   1344: goto -> 1355
    //   1347: ldc2_w 133665233
    //   1350: l2i
    //   1351: ldc_w 1009146531
    //   1354: ixor
    //   1355: ldc2_w -164354489
    //   1358: l2i
    //   1359: ldc_w 1702584562
    //   1362: ixor
    //   1363: ixor
    //   1364: lookupswitch default -> 1392, 6654196 -> 1347, 1373552328 -> 2352
    //   1392: iload #11
    //   1394: if_icmpge -> 1408
    //   1397: ldc2_w 901851135
    //   1400: l2i
    //   1401: ldc_w -650894869
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w -984249279
    //   1411: l2i
    //   1412: ldc_w 698387028
    //   1415: ixor
    //   1416: ldc2_w 1618218861
    //   1419: l2i
    //   1420: ldc_w -851721541
    //   1423: ixor
    //   1424: ixor
    //   1425: tableswitch default -> 1397, 1102760898 -> 1448, 1102760899 -> 1987
    //   1448: getstatic Perryc.1 : I
    //   1451: ifeq -> 1465
    //   1454: ldc2_w -480592245
    //   1457: l2i
    //   1458: ldc_w -1609075589
    //   1461: ixor
    //   1462: goto -> 1473
    //   1465: ldc2_w -1251451967
    //   1468: l2i
    //   1469: ldc_w -397468774
    //   1472: ixor
    //   1473: ldc2_w 699397622
    //   1476: l2i
    //   1477: ldc_w 1710835619
    //   1480: ixor
    //   1481: ixor
    //   1482: lookupswitch default -> 1508, 253458597 -> 2330, 1279394927 -> 1465
    //   1508: aload #9
    //   1510: getstatic Perryc.c : I
    //   1513: iflt -> 1527
    //   1516: ldc2_w 752991109
    //   1519: l2i
    //   1520: ldc_w 495169371
    //   1523: ixor
    //   1524: goto -> 1535
    //   1527: ldc2_w 2004274882
    //   1530: l2i
    //   1531: ldc_w 1623966979
    //   1534: ixor
    //   1535: ldc2_w 464144627
    //   1538: l2i
    //   1539: ldc_w -1228435685
    //   1542: ixor
    //   1543: ixor
    //   1544: lookupswitch default -> 2372, -1676684490 -> 1527, -1160721367 -> 1572
    //   1572: iload #10
    //   1574: getstatic Perryc.0 : I
    //   1577: ifle -> 1591
    //   1580: ldc2_w 1874685606
    //   1583: l2i
    //   1584: ldc_w 1962048150
    //   1587: ixor
    //   1588: goto -> 1599
    //   1591: ldc2_w 1411576131
    //   1594: l2i
    //   1595: ldc_w 693319805
    //   1598: ixor
    //   1599: ldc2_w 1147720553
    //   1602: l2i
    //   1603: ldc_w -47487514
    //   1606: ixor
    //   1607: ixor
    //   1608: lookupswitch default -> 1636, -1576230209 -> 2340, 2608957 -> 1591
    //   1636: goto -> 1640
    //   1639: athrow
    //   1640: invokeinterface get : (I)Ljava/lang/Object;
    //   1645: goto -> 1649
    //   1648: athrow
    //   1649: checkcast net/minecraft/util/math/AxisAlignedBB
    //   1652: getstatic Perryc.0 : I
    //   1655: ifle -> 1669
    //   1658: ldc2_w -590215779
    //   1661: l2i
    //   1662: ldc_w 2055345665
    //   1665: ixor
    //   1666: goto -> 1677
    //   1669: ldc2_w -1206480122
    //   1672: l2i
    //   1673: ldc_w -1915523958
    //   1676: ixor
    //   1677: ldc2_w 1592263591
    //   1680: l2i
    //   1681: ldc_w 914600338
    //   1684: ixor
    //   1685: ixor
    //   1686: lookupswitch default -> 1712, -834952791 -> 2364, 55790198 -> 1669
    //   1712: aload #6
    //   1714: getstatic Perryc.c : I
    //   1717: iflt -> 1731
    //   1720: ldc2_w 1575857782
    //   1723: l2i
    //   1724: ldc_w 283610943
    //   1727: ixor
    //   1728: goto -> 1739
    //   1731: ldc2_w 1375798313
    //   1734: l2i
    //   1735: ldc_w -1564251022
    //   1738: ixor
    //   1739: ldc2_w 1494852534
    //   1742: l2i
    //   1743: ldc_w -1972990114
    //   1746: ixor
    //   1747: ixor
    //   1748: lookupswitch default -> 1776, -1636495967 -> 2324, 582546012 -> 1731
    //   1776: goto -> 1780
    //   1779: athrow
    //   1780: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   1783: goto -> 1787
    //   1786: athrow
    //   1787: getstatic Perryc.1 : I
    //   1790: ifeq -> 1804
    //   1793: ldc2_w -1455151998
    //   1796: l2i
    //   1797: ldc_w 384217552
    //   1800: ixor
    //   1801: goto -> 1812
    //   1804: ldc2_w 1157028910
    //   1807: l2i
    //   1808: ldc_w 2001932530
    //   1811: ixor
    //   1812: ldc2_w -1789876250
    //   1815: l2i
    //   1816: ldc_w -1654180990
    //   1819: ixor
    //   1820: ixor
    //   1821: lookupswitch default -> 1848, -1592276119 -> 1804, -1214971594 -> 2358
    //   1848: dload_2
    //   1849: getstatic Perryc.c : I
    //   1852: iflt -> 1866
    //   1855: ldc2_w -1636752703
    //   1858: l2i
    //   1859: ldc_w -1915802507
    //   1862: ixor
    //   1863: goto -> 1874
    //   1866: ldc2_w -1200352351
    //   1869: l2i
    //   1870: ldc_w 1134985345
    //   1873: ixor
    //   1874: ldc2_w 875216354
    //   1877: l2i
    //   1878: ldc_w 814923240
    //   1881: ixor
    //   1882: ixor
    //   1883: lookupswitch default -> 2342, -9792726 -> 1908, 386272958 -> 1866
    //   1908: goto -> 1912
    //   1911: athrow
    //   1912: invokevirtual func_72323_b : (Lnet/minecraft/util/math/AxisAlignedBB;D)D
    //   1915: goto -> 1919
    //   1918: athrow
    //   1919: getstatic Perryc.0 : I
    //   1922: ifle -> 1936
    //   1925: ldc2_w -1766960457
    //   1928: l2i
    //   1929: ldc_w 757997786
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w -1580105423
    //   1939: l2i
    //   1940: ldc_w 1369094950
    //   1943: ixor
    //   1944: ldc2_w 756158730
    //   1947: l2i
    //   1948: ldc_w -25678628
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 2350, 589367233 -> 1980, 1760186299 -> 1936
    //   1980: dstore_2
    //   1981: iinc #10, 1
    //   1984: goto -> 1266
    //   1987: getstatic Perryc.c : I
    //   1990: iflt -> 2004
    //   1993: ldc2_w 18106462
    //   1996: l2i
    //   1997: ldc_w -361960272
    //   2000: ixor
    //   2001: goto -> 2012
    //   2004: ldc2_w -1440517348
    //   2007: l2i
    //   2008: ldc_w -1715229648
    //   2011: ixor
    //   2012: ldc2_w 1911388539
    //   2015: l2i
    //   2016: ldc_w -2064359337
    //   2019: ixor
    //   2020: ixor
    //   2021: lookupswitch default -> 2048, 509722050 -> 2368, 1801161186 -> 2004
    //   2048: dload #7
    //   2050: getstatic Perryc.1 : I
    //   2053: ifeq -> 2067
    //   2056: ldc2_w -390769490
    //   2059: l2i
    //   2060: ldc_w -1493443041
    //   2063: ixor
    //   2064: goto -> 2075
    //   2067: ldc2_w -1716601293
    //   2070: l2i
    //   2071: ldc_w -1612896197
    //   2074: ixor
    //   2075: ldc2_w -1271414155
    //   2078: l2i
    //   2079: ldc_w -1130538147
    //   2082: ixor
    //   2083: ixor
    //   2084: lookupswitch default -> 2334, 249106208 -> 2112, 1189352345 -> 2067
    //   2112: dload_2
    //   2113: dcmpl
    //   2114: ifeq -> 2128
    //   2117: ldc2_w 1126652252
    //   2120: l2i
    //   2121: ldc_w -1808174304
    //   2124: ixor
    //   2125: goto -> 2136
    //   2128: ldc2_w 1546550121
    //   2131: l2i
    //   2132: ldc_w -1959767788
    //   2135: ixor
    //   2136: ldc2_w -868023382
    //   2139: l2i
    //   2140: ldc_w -1723564524
    //   2143: ixor
    //   2144: ixor
    //   2145: tableswitch default -> 2117, -2112268350 -> 2168, -2112268349 -> 2307
    //   2168: getstatic Perryc.0 : I
    //   2171: ifle -> 2185
    //   2174: ldc2_w -571852605
    //   2177: l2i
    //   2178: ldc_w -2035505287
    //   2181: ixor
    //   2182: goto -> 2193
    //   2185: ldc2_w -2069910925
    //   2188: l2i
    //   2189: ldc_w -62438468
    //   2192: ixor
    //   2193: ldc2_w 501622790
    //   2196: l2i
    //   2197: ldc_w 2013138955
    //   2200: ixor
    //   2201: ixor
    //   2202: lookupswitch default -> 2374, 314626498 -> 2228, 828286903 -> 2185
    //   2228: dload #7
    //   2230: ldc2_w 6.013485765125261E307
    //   2233: invokestatic doubleToLongBits : (D)J
    //   2236: ldc2_w 9211383657297208023
    //   2239: lxor
    //   2240: invokestatic longBitsToDouble : (J)D
    //   2243: dcmpg
    //   2244: ifge -> 2258
    //   2247: ldc2_w 1926672213
    //   2250: l2i
    //   2251: ldc_w 1521675339
    //   2254: ixor
    //   2255: goto -> 2266
    //   2258: ldc2_w 1426656834
    //   2261: l2i
    //   2262: ldc_w 2104315231
    //   2265: ixor
    //   2266: ldc2_w 1503384121
    //   2269: l2i
    //   2270: ldc_w 1283795590
    //   2273: ixor
    //   2274: ixor
    //   2275: tableswitch default -> 2247, 1031453601 -> 2296, 1031453602 -> 2307
    //   2296: ldc2_w 1988421434
    //   2299: l2i
    //   2300: ldc_w 1988421435
    //   2303: ixor
    //   2304: goto -> 2315
    //   2307: ldc2_w 810533453
    //   2310: l2i
    //   2311: ldc_w 810533453
    //   2314: ixor
    //   2315: ireturn
    //   2316: aconst_null
    //   2317: athrow
    //   2318: aconst_null
    //   2319: athrow
    //   2320: aconst_null
    //   2321: athrow
    //   2322: aconst_null
    //   2323: athrow
    //   2324: aconst_null
    //   2325: athrow
    //   2326: aconst_null
    //   2327: athrow
    //   2328: aconst_null
    //   2329: athrow
    //   2330: aconst_null
    //   2331: athrow
    //   2332: aconst_null
    //   2333: athrow
    //   2334: aconst_null
    //   2335: athrow
    //   2336: aconst_null
    //   2337: athrow
    //   2338: aconst_null
    //   2339: athrow
    //   2340: aconst_null
    //   2341: athrow
    //   2342: aconst_null
    //   2343: athrow
    //   2344: aconst_null
    //   2345: athrow
    //   2346: aconst_null
    //   2347: athrow
    //   2348: aconst_null
    //   2349: athrow
    //   2350: aconst_null
    //   2351: athrow
    //   2352: aconst_null
    //   2353: athrow
    //   2354: aconst_null
    //   2355: athrow
    //   2356: aconst_null
    //   2357: athrow
    //   2358: aconst_null
    //   2359: athrow
    //   2360: aconst_null
    //   2361: athrow
    //   2362: aconst_null
    //   2363: athrow
    //   2364: aconst_null
    //   2365: athrow
    //   2366: aconst_null
    //   2367: athrow
    //   2368: aconst_null
    //   2369: athrow
    //   2370: aconst_null
    //   2371: athrow
    //   2372: aconst_null
    //   2373: athrow
    //   2374: aconst_null
    //   2375: athrow
    //   2376: aconst_null
    //   2377: athrow
    //   2378: pop
    //   2379: goto -> 24
    //   2382: pop
    //   2383: aconst_null
    //   2384: goto -> 2378
    //   2387: dup
    //   2388: ifnull -> 2378
    //   2391: checkcast java/lang/Throwable
    //   2394: athrow
    //   2395: dup
    //   2396: ifnull -> 2382
    //   2399: checkcast java/lang/Throwable
    //   2402: athrow
    //   2403: aconst_null
    //   2404: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1266	721	11	l	I
    //   1066	921	10	k	I
    //   24	2292	0	x	D
    //   24	2292	2	y	D
    //   24	2292	4	z	D
    //   24	2292	6	entity	Lnet/minecraft/entity/Entity;
    //   146	2170	7	d3	D
    //   866	1450	9	list1	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   866	1450	9	list1	Ljava/util/List<Lnet/minecraft/util/math/AxisAlignedBB;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2387	java/lang/NullPointerException
    //   467	474	474	finally
    //   467	474	467	finally
    //   467	474	467	finally
    //   467	474	467	finally
    //   467	474	467	java/lang/RuntimeException
    //   723	730	730	finally
    //   723	730	3	finally
    //   724	730	3	java/util/ConcurrentModificationException
    //   724	730	723	finally
    //   724	730	3	java/lang/IllegalArgumentException
    //   795	802	802	finally
    //   795	802	795	java/lang/AssertionError
    //   795	802	802	java/lang/RuntimeException
    //   795	802	3	java/lang/UnsupportedOperationException
    //   796	802	795	finally
    //   1196	1204	1204	finally
    //   1196	1204	1204	java/lang/IllegalStateException
    //   1196	1204	3	java/lang/AssertionError
    //   1196	1204	1204	finally
    //   1196	1204	3	java/lang/NumberFormatException
    //   1639	1648	1648	finally
    //   1639	1648	1639	java/lang/IllegalStateException
    //   1639	1648	1639	java/lang/AssertionError
    //   1640	1648	1648	finally
    //   1640	1648	1648	java/lang/AssertionError
    //   1779	1786	1786	finally
    //   1779	1786	3	finally
    //   1779	1786	3	finally
    //   1780	1786	1779	finally
    //   1780	1786	1779	finally
    //   1911	1918	1918	finally
    //   1911	1918	3	java/lang/AssertionError
    //   1911	1918	1911	java/lang/EnumConstantNotPresentException
    //   1911	1918	1911	finally
    //   1912	1918	3	java/lang/UnsupportedOperationException
    //   2387	2395	2387	java/lang/RuntimeException
    //   2403	2405	3	finally
  }
  
  public static float getExplosionDamage(Entity targetEntity, Vec3d explosionPosition, float explosionPower, boolean shouldIgnore) {
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
  
  public static float getDamageMultiplied(float paramFloat) {
    return Perry1.0J(null, (int)-874835974L ^ 0xEE081FEE, paramFloat);
  }
  
  public static Boolean getArmourFucker(EntityPlayer player, float percent) {
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
  
  public static List getBlocks() {
    return Perry1.59(null, (int)-802750076L ^ 0x99C3A11F);
  }
  
  public static boolean canPlaceCrystal(BlockPos blockPos, boolean specialEntityCheck, boolean onepointThirteen) {
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
  
  public static boolean canSeePos(BlockPos pos) {
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
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreeCrystalUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */