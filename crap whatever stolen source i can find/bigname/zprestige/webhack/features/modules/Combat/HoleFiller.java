package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import com.google.common.eventbus.Subscribe;
import java.util.List;
import net.minecraft.util.math.BlockPos;

public class HoleFiller extends Module {
  public Setting<Integer> bpt;
  
  public Setting<Integer> green;
  
  public Setting<Boolean> packet;
  
  public static BlockPos[] surroundOffset;
  
  public Setting<Integer> red;
  
  public Setting<Integer> alpha;
  
  public Setting<Float> range;
  
  public Setting<Boolean> rotate;
  
  public int color;
  
  public BlockPos renderPos;
  
  public Setting<Float> distance;
  
  public int blockSlot;
  
  public int placeAmount;
  
  public Setting<Integer> blue;
  
  public boolean isSneaking;
  
  public HoleFiller() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -107461644
    //   9: l2i
    //   10: ldc 304916373
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1348356289
    //   19: l2i
    //   20: ldc -640908041
    //   22: ixor
    //   23: ldc2_w -724783584
    //   26: l2i
    //   27: ldc 1154215421
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 323351702 -> 16, 2075371452 -> 5914
    //   56: aload_0
    //   57: ldc '飉㌜颿㶲♠癔๵蹦窪'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -596956003
    //   68: l2i
    //   69: ldc 950446529
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 703770577
    //   78: l2i
    //   79: ldc 1097207106
    //   81: ixor
    //   82: ldc2_w 201397819
    //   85: l2i
    //   86: ldc 143321001
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -532253490 -> 5942, 1191997674 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '飧㌖颺㶤♂癓๳'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 1266117904
    //   130: l2i
    //   131: ldc -328844741
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 943199983
    //   140: l2i
    //   141: ldc 633927651
    //   143: ixor
    //   144: ldc2_w -1968221842
    //   147: l2i
    //   148: ldc -980494562
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 5818, -399453861 -> 137, 1389455228 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w -825834183
    //   192: l2i
    //   193: ldc 1018376021
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1012943229
    //   202: l2i
    //   203: ldc 386788561
    //   205: ixor
    //   206: ldc2_w 1392859504
    //   209: l2i
    //   210: ldc -1298595715
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 5954, 334082913 -> 199, 890110815 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -287445731
    //   246: l2i
    //   247: ldc -287445732
    //   249: ixor
    //   250: ldc2_w -995644471
    //   253: l2i
    //   254: ldc -995644471
    //   256: ixor
    //   257: ldc2_w -1273499776
    //   260: l2i
    //   261: ldc -1273499776
    //   263: ixor
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w 733825237
    //   273: l2i
    //   274: ldc 668401273
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1080561024
    //   283: l2i
    //   284: ldc 1884140266
    //   286: ixor
    //   287: ldc2_w -1038718956
    //   290: l2i
    //   291: ldc -1681128940
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 5820, -1778374038 -> 320, 1437719724 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w 178062801
    //   332: l2i
    //   333: ldc -1862675934
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -932930877
    //   342: l2i
    //   343: ldc 1495281846
    //   345: ixor
    //   346: ldc2_w 682133109
    //   349: l2i
    //   350: ldc -295320315
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 5900, 1468655877 -> 380, 1554617475 -> 339
    //   380: aload_0
    //   381: aconst_null
    //   382: getstatic Perryc.1 : I
    //   385: ifeq -> 398
    //   388: ldc2_w -1074188023
    //   391: l2i
    //   392: ldc -1401076133
    //   394: ixor
    //   395: goto -> 405
    //   398: ldc2_w -1346233406
    //   401: l2i
    //   402: ldc 1304777686
    //   404: ixor
    //   405: ldc2_w -219275173
    //   408: l2i
    //   409: ldc 905347186
    //   411: ixor
    //   412: ixor
    //   413: lookupswitch default -> 5950, -727918725 -> 398, 622848061 -> 440
    //   440: putfield renderPos : Lnet/minecraft/util/math/BlockPos;
    //   443: getstatic Perryc.0 : I
    //   446: ifle -> 459
    //   449: ldc2_w 409440145
    //   452: l2i
    //   453: ldc 2108255331
    //   455: ixor
    //   456: goto -> 466
    //   459: ldc2_w 208777762
    //   462: l2i
    //   463: ldc -330633408
    //   465: ixor
    //   466: ldc2_w 222331700
    //   469: l2i
    //   470: ldc 1653881
    //   472: ixor
    //   473: ixor
    //   474: lookupswitch default -> 500, 54652985 -> 459, 1754750143 -> 5962
    //   500: aload_0
    //   501: getstatic Perryc.c : I
    //   504: iflt -> 517
    //   507: ldc2_w -1414872668
    //   510: l2i
    //   511: ldc -2042236197
    //   513: ixor
    //   514: goto -> 524
    //   517: ldc2_w 819449206
    //   520: l2i
    //   521: ldc 1350761028
    //   523: ixor
    //   524: ldc2_w 157699394
    //   527: l2i
    //   528: ldc 1243844214
    //   530: ixor
    //   531: ixor
    //   532: lookupswitch default -> 5868, 588313606 -> 560, 1856696395 -> 517
    //   560: aload_0
    //   561: new bigname/zprestige/webhack/features/setting/Setting
    //   564: dup
    //   565: ldc '飓㌖颷'
    //   567: getstatic Perryc.0 : I
    //   570: ifle -> 583
    //   573: ldc2_w 857599093
    //   576: l2i
    //   577: ldc 1469294689
    //   579: ixor
    //   580: goto -> 590
    //   583: ldc2_w 1165308402
    //   586: l2i
    //   587: ldc 803806859
    //   589: ixor
    //   590: ldc2_w -1393017751
    //   593: l2i
    //   594: ldc 1384190171
    //   596: ixor
    //   597: ixor
    //   598: lookupswitch default -> 5872, -1796930613 -> 624, -1695061850 -> 583
    //   624: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   627: ldc2_w -646047349
    //   630: l2i
    //   631: ldc -646047372
    //   633: ixor
    //   634: getstatic Perryc.0 : I
    //   637: ifle -> 650
    //   640: ldc2_w -1004628001
    //   643: l2i
    //   644: ldc -1044828192
    //   646: ixor
    //   647: goto -> 657
    //   650: ldc2_w 1261090235
    //   653: l2i
    //   654: ldc -422868549
    //   656: ixor
    //   657: ldc2_w -2007940275
    //   660: l2i
    //   661: ldc 820972553
    //   663: ixor
    //   664: ixor
    //   665: lookupswitch default -> 692, -1122371717 -> 5934, 576053442 -> 650
    //   692: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   695: ldc2_w -1512031708
    //   698: l2i
    //   699: ldc -1512031708
    //   701: ixor
    //   702: getstatic Perryc.0 : I
    //   705: ifle -> 718
    //   708: ldc2_w -487701117
    //   711: l2i
    //   712: ldc 1641668915
    //   714: ixor
    //   715: goto -> 725
    //   718: ldc2_w -653850246
    //   721: l2i
    //   722: ldc -579530437
    //   724: ixor
    //   725: ldc2_w 843340458
    //   728: l2i
    //   729: ldc 1401574773
    //   731: ixor
    //   732: ixor
    //   733: lookupswitch default -> 760, -1907050976 -> 718, -486954129 -> 5846
    //   760: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   763: ldc2_w -1805552405
    //   766: l2i
    //   767: ldc -1805552620
    //   769: ixor
    //   770: getstatic Perryc.0 : I
    //   773: ifle -> 786
    //   776: ldc2_w -492810045
    //   779: l2i
    //   780: ldc -1834914445
    //   782: ixor
    //   783: goto -> 793
    //   786: ldc2_w 1314261681
    //   789: l2i
    //   790: ldc 1572835233
    //   792: ixor
    //   793: ldc2_w -1898117546
    //   796: l2i
    //   797: ldc -1776425192
    //   799: ixor
    //   800: ixor
    //   801: lookupswitch default -> 828, 381330307 -> 786, 1757535486 -> 5936
    //   828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   831: getstatic Perryc.0 : I
    //   834: ifle -> 847
    //   837: ldc2_w -892555181
    //   840: l2i
    //   841: ldc 718984585
    //   843: ixor
    //   844: goto -> 854
    //   847: ldc2_w 1276328510
    //   850: l2i
    //   851: ldc -852469014
    //   853: ixor
    //   854: ldc2_w -2012105007
    //   857: l2i
    //   858: ldc 996369905
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 888, 1304802882 -> 847, 1399109370 -> 5922
    //   888: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   891: getstatic Perryc.0 : I
    //   894: ifle -> 907
    //   897: ldc2_w 340368344
    //   900: l2i
    //   901: ldc 1211154201
    //   903: ixor
    //   904: goto -> 914
    //   907: ldc2_w -1646997607
    //   910: l2i
    //   911: ldc 1030336711
    //   913: ixor
    //   914: ldc2_w 1998913636
    //   917: l2i
    //   918: ldc 2012423432
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 948, 1518728673 -> 907, 1554973101 -> 5876
    //   948: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   951: getstatic Perryc.0 : I
    //   954: ifle -> 967
    //   957: ldc2_w 1984231498
    //   960: l2i
    //   961: ldc -272740987
    //   963: ixor
    //   964: goto -> 974
    //   967: ldc2_w -1116792770
    //   970: l2i
    //   971: ldc -368353902
    //   973: ixor
    //   974: ldc2_w -508459362
    //   977: l2i
    //   978: ldc 1646842749
    //   980: ixor
    //   981: ixor
    //   982: lookupswitch default -> 5888, -721612721 -> 1008, 442753068 -> 967
    //   1008: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1011: getstatic Perryc.c : I
    //   1014: iflt -> 1027
    //   1017: ldc2_w 1144382861
    //   1020: l2i
    //   1021: ldc -1620244667
    //   1023: ixor
    //   1024: goto -> 1034
    //   1027: ldc2_w 1879116428
    //   1030: l2i
    //   1031: ldc 516265430
    //   1033: ixor
    //   1034: ldc2_w 1759996499
    //   1037: l2i
    //   1038: ldc -440274277
    //   1040: ixor
    //   1041: ixor
    //   1042: lookupswitch default -> 1068, 164528316 -> 1027, 1451129344 -> 5812
    //   1068: aload_0
    //   1069: getstatic Perryc.c : I
    //   1072: iflt -> 1085
    //   1075: ldc2_w -1558548096
    //   1078: l2i
    //   1079: ldc -770465602
    //   1081: ixor
    //   1082: goto -> 1093
    //   1085: ldc2_w -864158305
    //   1088: l2i
    //   1089: ldc_w -148780435
    //   1092: ixor
    //   1093: ldc2_w -494463805
    //   1096: l2i
    //   1097: ldc_w 532446777
    //   1100: ixor
    //   1101: ixor
    //   1102: lookupswitch default -> 1128, -1942832188 -> 5834, -119175807 -> 1085
    //   1128: aload_0
    //   1129: new bigname/zprestige/webhack/features/setting/Setting
    //   1132: dup
    //   1133: ldc_w '飆㌁颶㶲♈'
    //   1136: getstatic Perryc.c : I
    //   1139: iflt -> 1153
    //   1142: ldc2_w 1190931373
    //   1145: l2i
    //   1146: ldc_w 2072253111
    //   1149: ixor
    //   1150: goto -> 1161
    //   1153: ldc2_w 1315270603
    //   1156: l2i
    //   1157: ldc_w -1663104353
    //   1160: ixor
    //   1161: ldc2_w -288854549
    //   1164: l2i
    //   1165: ldc_w -1827476552
    //   1168: ixor
    //   1169: ixor
    //   1170: lookupswitch default -> 1196, -869808098 -> 1153, 1084407625 -> 5864
    //   1196: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1199: ldc2_w -854591917
    //   1202: l2i
    //   1203: ldc_w -854591828
    //   1206: ixor
    //   1207: getstatic Perryc.0 : I
    //   1210: ifle -> 1224
    //   1213: ldc2_w 1536695771
    //   1216: l2i
    //   1217: ldc_w -2085649017
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w 1470558219
    //   1227: l2i
    //   1228: ldc_w 1220367424
    //   1231: ixor
    //   1232: ldc2_w -1259455348
    //   1235: l2i
    //   1236: ldc_w 1789583111
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 5860, -1050720320 -> 1268, 108231639 -> 1224
    //   1268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1271: ldc2_w -2135665086
    //   1274: l2i
    //   1275: ldc_w -2135665086
    //   1278: ixor
    //   1279: getstatic Perryc.1 : I
    //   1282: ifeq -> 1296
    //   1285: ldc2_w -666931531
    //   1288: l2i
    //   1289: ldc_w -1834683815
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w 1234484661
    //   1299: l2i
    //   1300: ldc_w 1843888691
    //   1303: ixor
    //   1304: ldc2_w -304454768
    //   1307: l2i
    //   1308: ldc_w 1338412842
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 5836, -2039491780 -> 1340, -393777066 -> 1296
    //   1340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1343: ldc2_w 77971610
    //   1346: l2i
    //   1347: ldc_w 77971557
    //   1350: ixor
    //   1351: getstatic Perryc.1 : I
    //   1354: ifeq -> 1368
    //   1357: ldc2_w -1549769181
    //   1360: l2i
    //   1361: ldc_w -24465048
    //   1364: ixor
    //   1365: goto -> 1376
    //   1368: ldc2_w 579895846
    //   1371: l2i
    //   1372: ldc_w -1242102156
    //   1375: ixor
    //   1376: ldc2_w 709049947
    //   1379: l2i
    //   1380: ldc_w 1449353311
    //   1383: ixor
    //   1384: ixor
    //   1385: lookupswitch default -> 1412, 260059265 -> 1368, 554338639 -> 5956
    //   1412: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1415: getstatic Perryc.0 : I
    //   1418: ifle -> 1432
    //   1421: ldc2_w 614257707
    //   1424: l2i
    //   1425: ldc_w 1952612343
    //   1428: ixor
    //   1429: goto -> 1440
    //   1432: ldc2_w 716705471
    //   1435: l2i
    //   1436: ldc_w -10126558
    //   1439: ixor
    //   1440: ldc2_w 1120594452
    //   1443: l2i
    //   1444: ldc_w -847493480
    //   1447: ixor
    //   1448: ixor
    //   1449: lookupswitch default -> 1476, -1188156573 -> 1432, -548927664 -> 5884
    //   1476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1479: getstatic Perryc.c : I
    //   1482: iflt -> 1496
    //   1485: ldc2_w 1547921223
    //   1488: l2i
    //   1489: ldc_w -1864346863
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w 1771631716
    //   1499: l2i
    //   1500: ldc_w 1735015442
    //   1503: ixor
    //   1504: ldc2_w 835134567
    //   1507: l2i
    //   1508: ldc_w -1352851651
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 5930, -1872170196 -> 1540, 1379471116 -> 1496
    //   1540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1543: getstatic Perryc.c : I
    //   1546: iflt -> 1560
    //   1549: ldc2_w -1247454249
    //   1552: l2i
    //   1553: ldc_w 1447184874
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w 885801190
    //   1563: l2i
    //   1564: ldc_w -1903696002
    //   1567: ixor
    //   1568: ldc2_w 166990289
    //   1571: l2i
    //   1572: ldc_w -1691666441
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 5898, 680821182 -> 1604, 1899508763 -> 1560
    //   1604: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1607: getstatic Perryc.c : I
    //   1610: iflt -> 1624
    //   1613: ldc2_w 5085708
    //   1616: l2i
    //   1617: ldc_w -592120228
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w -856210020
    //   1627: l2i
    //   1628: ldc_w -406367955
    //   1631: ixor
    //   1632: ldc2_w -714664903
    //   1635: l2i
    //   1636: ldc_w 1409772143
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 5904, -1437570329 -> 1668, 1570312710 -> 1624
    //   1668: aload_0
    //   1669: getstatic Perryc.0 : I
    //   1672: ifle -> 1686
    //   1675: ldc2_w 366462198
    //   1678: l2i
    //   1679: ldc_w -1182649892
    //   1682: ixor
    //   1683: goto -> 1694
    //   1686: ldc2_w -1702598601
    //   1689: l2i
    //   1690: ldc_w -1558505502
    //   1693: ixor
    //   1694: ldc2_w 1376928639
    //   1697: l2i
    //   1698: ldc_w -1860858214
    //   1701: ixor
    //   1702: ixor
    //   1703: lookupswitch default -> 5848, -90656208 -> 1728, 1867659471 -> 1686
    //   1728: aload_0
    //   1729: new bigname/zprestige/webhack/features/setting/Setting
    //   1732: dup
    //   1733: ldc_w '飃㌟颦㶲'
    //   1736: getstatic Perryc.c : I
    //   1739: iflt -> 1753
    //   1742: ldc2_w -819287116
    //   1745: l2i
    //   1746: ldc_w -1211647403
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -1517344265
    //   1756: l2i
    //   1757: ldc_w -370082717
    //   1760: ixor
    //   1761: ldc2_w 1019318390
    //   1764: l2i
    //   1765: ldc_w 365486531
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 1796, 809632574 -> 1753, 1373921364 -> 5826
    //   1796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1799: ldc2_w 132810059
    //   1802: l2i
    //   1803: ldc_w 132810164
    //   1806: ixor
    //   1807: getstatic Perryc.1 : I
    //   1810: ifeq -> 1824
    //   1813: ldc2_w -386575101
    //   1816: l2i
    //   1817: ldc_w 309246650
    //   1820: ixor
    //   1821: goto -> 1832
    //   1824: ldc2_w 6155453
    //   1827: l2i
    //   1828: ldc_w 1625531018
    //   1831: ixor
    //   1832: ldc2_w 1524966136
    //   1835: l2i
    //   1836: ldc_w -948295350
    //   1839: ixor
    //   1840: ixor
    //   1841: lookupswitch default -> 5932, -48151163 -> 1868, 1728373771 -> 1824
    //   1868: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1871: ldc2_w -1767388289
    //   1874: l2i
    //   1875: ldc_w -1767388289
    //   1878: ixor
    //   1879: getstatic Perryc.c : I
    //   1882: iflt -> 1896
    //   1885: ldc2_w -887324202
    //   1888: l2i
    //   1889: ldc_w -1037127709
    //   1892: ixor
    //   1893: goto -> 1904
    //   1896: ldc2_w -1233679820
    //   1899: l2i
    //   1900: ldc_w -946244584
    //   1903: ixor
    //   1904: ldc2_w 643023259
    //   1907: l2i
    //   1908: ldc_w 1384218737
    //   1911: ixor
    //   1912: ixor
    //   1913: lookupswitch default -> 5924, 87867334 -> 1940, 2111860703 -> 1896
    //   1940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1943: ldc2_w -2105007616
    //   1946: l2i
    //   1947: ldc_w -2105007361
    //   1950: ixor
    //   1951: getstatic Perryc.c : I
    //   1954: iflt -> 1968
    //   1957: ldc2_w -142140562
    //   1960: l2i
    //   1961: ldc_w -1694007969
    //   1964: ixor
    //   1965: goto -> 1976
    //   1968: ldc2_w -650847968
    //   1971: l2i
    //   1972: ldc_w -1659854018
    //   1975: ixor
    //   1976: ldc2_w 1451452079
    //   1979: l2i
    //   1980: ldc_w 91244907
    //   1983: ixor
    //   1984: ixor
    //   1985: lookupswitch default -> 5874, 399988186 -> 2012, 1064520181 -> 1968
    //   2012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2015: getstatic Perryc.1 : I
    //   2018: ifeq -> 2032
    //   2021: ldc2_w -248987932
    //   2024: l2i
    //   2025: ldc_w -640611367
    //   2028: ixor
    //   2029: goto -> 2040
    //   2032: ldc2_w -1096620222
    //   2035: l2i
    //   2036: ldc_w -2146629420
    //   2039: ixor
    //   2040: ldc2_w 1094692362
    //   2043: l2i
    //   2044: ldc_w 1239597292
    //   2047: ixor
    //   2048: ixor
    //   2049: lookupswitch default -> 5974, 539286491 -> 2032, 913473904 -> 2076
    //   2076: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2079: getstatic Perryc.c : I
    //   2082: iflt -> 2096
    //   2085: ldc2_w 1959003580
    //   2088: l2i
    //   2089: ldc_w -1245285095
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w 1341967264
    //   2099: l2i
    //   2100: ldc_w 805148990
    //   2103: ixor
    //   2104: ldc2_w 1516331619
    //   2107: l2i
    //   2108: ldc_w 1840585957
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 2140, -153743837 -> 5912, 1448599651 -> 2096
    //   2140: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2143: getstatic Perryc.c : I
    //   2146: iflt -> 2160
    //   2149: ldc2_w 235211386
    //   2152: l2i
    //   2153: ldc_w -1940262500
    //   2156: ixor
    //   2157: goto -> 2168
    //   2160: ldc2_w 1168824373
    //   2163: l2i
    //   2164: ldc_w 693683884
    //   2167: ixor
    //   2168: ldc2_w -1862091787
    //   2171: l2i
    //   2172: ldc_w -1584794157
    //   2175: ixor
    //   2176: ixor
    //   2177: lookupswitch default -> 5842, -1294486080 -> 2160, 1551454399 -> 2204
    //   2204: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2207: getstatic Perryc.0 : I
    //   2210: ifle -> 2224
    //   2213: ldc2_w 1566877568
    //   2216: l2i
    //   2217: ldc_w -592984533
    //   2220: ixor
    //   2221: goto -> 2232
    //   2224: ldc2_w -1906464841
    //   2227: l2i
    //   2228: ldc_w 1961275980
    //   2231: ixor
    //   2232: ldc2_w -780514875
    //   2235: l2i
    //   2236: ldc_w 1555000167
    //   2239: ixor
    //   2240: ixor
    //   2241: lookupswitch default -> 5824, 202785545 -> 2224, 2003711833 -> 2268
    //   2268: aload_0
    //   2269: getstatic Perryc.c : I
    //   2272: iflt -> 2286
    //   2275: ldc2_w -684621666
    //   2278: l2i
    //   2279: ldc_w 1368427215
    //   2282: ixor
    //   2283: goto -> 2294
    //   2286: ldc2_w -1758827928
    //   2289: l2i
    //   2290: ldc_w -1872321141
    //   2293: ixor
    //   2294: ldc2_w -57427769
    //   2297: l2i
    //   2298: ldc_w 1775307660
    //   2301: ixor
    //   2302: ixor
    //   2303: lookupswitch default -> 2328, -1851436224 -> 2286, 333691162 -> 5952
    //   2328: aload_0
    //   2329: new bigname/zprestige/webhack/features/setting/Setting
    //   2332: dup
    //   2333: ldc_w '飀㌟颣㶿♇'
    //   2336: getstatic Perryc.0 : I
    //   2339: ifle -> 2353
    //   2342: ldc2_w -1862832405
    //   2345: l2i
    //   2346: ldc_w 2010958570
    //   2349: ixor
    //   2350: goto -> 2361
    //   2353: ldc2_w 1006480804
    //   2356: l2i
    //   2357: ldc_w 1001046579
    //   2360: ixor
    //   2361: ldc2_w 752419689
    //   2364: l2i
    //   2365: ldc_w -101305948
    //   2368: ixor
    //   2369: ixor
    //   2370: lookupswitch default -> 2396, -1217860602 -> 2353, 839161548 -> 5894
    //   2396: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2399: ldc2_w 442352380
    //   2402: l2i
    //   2403: ldc_w 442352131
    //   2406: ixor
    //   2407: getstatic Perryc.1 : I
    //   2410: ifeq -> 2424
    //   2413: ldc2_w 1977427243
    //   2416: l2i
    //   2417: ldc_w 1223966898
    //   2420: ixor
    //   2421: goto -> 2432
    //   2424: ldc2_w -1987159444
    //   2427: l2i
    //   2428: ldc_w 1429230210
    //   2431: ixor
    //   2432: ldc2_w -301495443
    //   2435: l2i
    //   2436: ldc_w -1937684468
    //   2439: ixor
    //   2440: ixor
    //   2441: lookupswitch default -> 5946, -1103574129 -> 2468, 1605347064 -> 2424
    //   2468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2471: ldc2_w 395743648
    //   2474: l2i
    //   2475: ldc_w 395743648
    //   2478: ixor
    //   2479: getstatic Perryc.c : I
    //   2482: iflt -> 2496
    //   2485: ldc2_w 1448848182
    //   2488: l2i
    //   2489: ldc_w -299177874
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w 1026722979
    //   2499: l2i
    //   2500: ldc_w 1009488292
    //   2503: ixor
    //   2504: ldc2_w -1407178737
    //   2507: l2i
    //   2508: ldc_w 1890438660
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 2540, -259708599 -> 2496, 1694278995 -> 5840
    //   2540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2543: ldc2_w 495078439
    //   2546: l2i
    //   2547: ldc_w 495078616
    //   2550: ixor
    //   2551: getstatic Perryc.0 : I
    //   2554: ifle -> 2568
    //   2557: ldc2_w 747380086
    //   2560: l2i
    //   2561: ldc_w 110446289
    //   2564: ixor
    //   2565: goto -> 2576
    //   2568: ldc2_w 1672902688
    //   2571: l2i
    //   2572: ldc_w -2016166550
    //   2575: ixor
    //   2576: ldc2_w -121411139
    //   2579: l2i
    //   2580: ldc_w -1049934047
    //   2583: ixor
    //   2584: ixor
    //   2585: lookupswitch default -> 2612, 330396987 -> 5918, 863762668 -> 2568
    //   2612: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2615: getstatic Perryc.1 : I
    //   2618: ifeq -> 2632
    //   2621: ldc2_w 876124305
    //   2624: l2i
    //   2625: ldc_w -646924113
    //   2628: ixor
    //   2629: goto -> 2640
    //   2632: ldc2_w -95046362
    //   2635: l2i
    //   2636: ldc_w 13659537
    //   2639: ixor
    //   2640: ldc2_w -1012963000
    //   2643: l2i
    //   2644: ldc_w -1816013939
    //   2647: ixor
    //   2648: ixor
    //   2649: lookupswitch default -> 5890, -1428462990 -> 2676, -1122592005 -> 2632
    //   2676: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2679: getstatic Perryc.0 : I
    //   2682: ifle -> 2696
    //   2685: ldc2_w -834475542
    //   2688: l2i
    //   2689: ldc_w 1492094690
    //   2692: ixor
    //   2693: goto -> 2704
    //   2696: ldc2_w -31127206
    //   2699: l2i
    //   2700: ldc_w -1493199122
    //   2703: ixor
    //   2704: ldc2_w 1791581481
    //   2707: l2i
    //   2708: ldc_w 1503628336
    //   2711: ixor
    //   2712: ixor
    //   2713: lookupswitch default -> 2740, -1510230511 -> 5838, -941065108 -> 2696
    //   2740: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2743: getstatic Perryc.1 : I
    //   2746: ifeq -> 2760
    //   2749: ldc2_w -2020297734
    //   2752: l2i
    //   2753: ldc_w 1397228201
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w -1073836450
    //   2763: l2i
    //   2764: ldc_w -1610562980
    //   2767: ixor
    //   2768: ldc2_w 534504096
    //   2771: l2i
    //   2772: ldc_w -225121241
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 2804, 965984212 -> 5878, 1638981067 -> 2760
    //   2804: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2807: getstatic Perryc.1 : I
    //   2810: ifeq -> 2824
    //   2813: ldc2_w -232445022
    //   2816: l2i
    //   2817: ldc_w -1310887847
    //   2820: ixor
    //   2821: goto -> 2832
    //   2824: ldc2_w 2058297905
    //   2827: l2i
    //   2828: ldc_w -1572605974
    //   2831: ixor
    //   2832: ldc2_w 847655114
    //   2835: l2i
    //   2836: ldc_w 1498427388
    //   2839: ixor
    //   2840: ixor
    //   2841: lookupswitch default -> 5814, -1287990547 -> 2868, 674120909 -> 2824
    //   2868: aload_0
    //   2869: getstatic Perryc.1 : I
    //   2872: ifeq -> 2886
    //   2875: ldc2_w -48404774
    //   2878: l2i
    //   2879: ldc_w 549777876
    //   2882: ixor
    //   2883: goto -> 2894
    //   2886: ldc2_w -499155256
    //   2889: l2i
    //   2890: ldc_w -1217111258
    //   2893: ixor
    //   2894: ldc2_w 459674912
    //   2897: l2i
    //   2898: ldc_w -1714365184
    //   2901: ixor
    //   2902: ixor
    //   2903: lookupswitch default -> 5926, -671224370 -> 2928, 1601134382 -> 2886
    //   2928: aload_0
    //   2929: new bigname/zprestige/webhack/features/setting/Setting
    //   2932: dup
    //   2933: ldc_w '飃㌟颼㶴♍癎ู蹦窪⁺ਓ唈煢﹅'
    //   2936: getstatic Perryc.1 : I
    //   2939: ifeq -> 2953
    //   2942: ldc2_w 687966303
    //   2945: l2i
    //   2946: ldc_w 954065844
    //   2949: ixor
    //   2950: goto -> 2961
    //   2953: ldc2_w 823220823
    //   2956: l2i
    //   2957: ldc_w -406683746
    //   2960: ixor
    //   2961: ldc2_w -1710042117
    //   2964: l2i
    //   2965: ldc_w -376264243
    //   2968: ixor
    //   2969: ixor
    //   2970: lookupswitch default -> 2996, -2063204321 -> 2953, 1650201053 -> 5902
    //   2996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2999: ldc2_w -427173912
    //   3002: l2i
    //   3003: ldc_w -427173918
    //   3006: ixor
    //   3007: getstatic Perryc.c : I
    //   3010: iflt -> 3024
    //   3013: ldc2_w 979019167
    //   3016: l2i
    //   3017: ldc_w -59263505
    //   3020: ixor
    //   3021: goto -> 3032
    //   3024: ldc2_w 1768725804
    //   3027: l2i
    //   3028: ldc_w -1246376149
    //   3031: ixor
    //   3032: ldc2_w -596743391
    //   3035: l2i
    //   3036: ldc_w -515217249
    //   3039: ixor
    //   3040: ixor
    //   3041: lookupswitch default -> 3068, -83291186 -> 5854, 375906702 -> 3024
    //   3068: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3071: ldc2_w 422356808
    //   3074: l2i
    //   3075: ldc_w 422356809
    //   3078: ixor
    //   3079: getstatic Perryc.1 : I
    //   3082: ifeq -> 3096
    //   3085: ldc2_w 62405537
    //   3088: l2i
    //   3089: ldc_w -1446939483
    //   3092: ixor
    //   3093: goto -> 3104
    //   3096: ldc2_w 1545699849
    //   3099: l2i
    //   3100: ldc_w -2054141088
    //   3103: ixor
    //   3104: ldc2_w 596771080
    //   3107: l2i
    //   3108: ldc_w -564410866
    //   3111: ixor
    //   3112: ixor
    //   3113: lookupswitch default -> 5972, 611847791 -> 3140, 1471186946 -> 3096
    //   3140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3143: ldc2_w -1111601509
    //   3146: l2i
    //   3147: ldc_w -1111601521
    //   3150: ixor
    //   3151: getstatic Perryc.1 : I
    //   3154: ifeq -> 3168
    //   3157: ldc2_w 1665172833
    //   3160: l2i
    //   3161: ldc_w -716052620
    //   3164: ixor
    //   3165: goto -> 3176
    //   3168: ldc2_w 1094063998
    //   3171: l2i
    //   3172: ldc_w -1846777685
    //   3175: ixor
    //   3176: ldc2_w -1401875949
    //   3179: l2i
    //   3180: ldc_w -437656281
    //   3183: ixor
    //   3184: ixor
    //   3185: lookupswitch default -> 3212, -650178539 -> 3168, -7760607 -> 5882
    //   3212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3215: getstatic Perryc.c : I
    //   3218: iflt -> 3232
    //   3221: ldc2_w -270338243
    //   3224: l2i
    //   3225: ldc_w 187078806
    //   3228: ixor
    //   3229: goto -> 3240
    //   3232: ldc2_w 1694410589
    //   3235: l2i
    //   3236: ldc_w -1524884169
    //   3239: ixor
    //   3240: ldc2_w 1628581570
    //   3243: l2i
    //   3244: ldc_w 1849940151
    //   3247: ixor
    //   3248: ixor
    //   3249: lookupswitch default -> 5920, -827110369 -> 3276, -342517282 -> 3232
    //   3276: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3279: getstatic Perryc.1 : I
    //   3282: ifeq -> 3296
    //   3285: ldc2_w 1279924855
    //   3288: l2i
    //   3289: ldc_w -1248807338
    //   3292: ixor
    //   3293: goto -> 3304
    //   3296: ldc2_w 718158879
    //   3299: l2i
    //   3300: ldc_w 2023907144
    //   3303: ixor
    //   3304: ldc2_w 2131030956
    //   3307: l2i
    //   3308: ldc_w 764623726
    //   3311: ixor
    //   3312: ixor
    //   3313: lookupswitch default -> 5908, -1420991261 -> 3296, 16493461 -> 3340
    //   3340: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3343: getstatic Perryc.c : I
    //   3346: iflt -> 3360
    //   3349: ldc2_w -1195581105
    //   3352: l2i
    //   3353: ldc_w -528783487
    //   3356: ixor
    //   3357: goto -> 3368
    //   3360: ldc2_w 1988840898
    //   3363: l2i
    //   3364: ldc_w 1601014789
    //   3367: ixor
    //   3368: ldc2_w 245322834
    //   3371: l2i
    //   3372: ldc_w -1449324286
    //   3375: ixor
    //   3376: ixor
    //   3377: lookupswitch default -> 5844, -1897626473 -> 3404, -3816546 -> 3360
    //   3404: putfield bpt : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3407: getstatic Perryc.0 : I
    //   3410: ifle -> 3424
    //   3413: ldc2_w 1232101371
    //   3416: l2i
    //   3417: ldc_w 107601039
    //   3420: ixor
    //   3421: goto -> 3432
    //   3424: ldc2_w 1454264292
    //   3427: l2i
    //   3428: ldc_w 778912759
    //   3431: ixor
    //   3432: ldc2_w -1271427432
    //   3435: l2i
    //   3436: ldc_w 1342631259
    //   3439: ixor
    //   3440: ixor
    //   3441: lookupswitch default -> 5828, -1661833264 -> 3468, -1423384393 -> 3424
    //   3468: aload_0
    //   3469: getstatic Perryc.1 : I
    //   3472: ifeq -> 3486
    //   3475: ldc2_w 625051503
    //   3478: l2i
    //   3479: ldc_w -2023918286
    //   3482: ixor
    //   3483: goto -> 3494
    //   3486: ldc2_w 1555330968
    //   3489: l2i
    //   3490: ldc_w -1812444473
    //   3493: ixor
    //   3494: ldc2_w 1678427351
    //   3497: l2i
    //   3498: ldc_w -289539225
    //   3501: ixor
    //   3502: ixor
    //   3503: lookupswitch default -> 5948, 682348013 -> 3486, 1174078191 -> 3528
    //   3528: aload_0
    //   3529: new bigname/zprestige/webhack/features/setting/Setting
    //   3532: dup
    //   3533: ldc_w '飓㌒颽㶰♃'
    //   3536: getstatic Perryc.c : I
    //   3539: iflt -> 3553
    //   3542: ldc2_w -244363435
    //   3545: l2i
    //   3546: ldc_w 801072312
    //   3549: ixor
    //   3550: goto -> 3561
    //   3553: ldc2_w -685227821
    //   3556: l2i
    //   3557: ldc_w 1044357457
    //   3560: ixor
    //   3561: ldc2_w -1886860690
    //   3564: l2i
    //   3565: ldc_w 1418513883
    //   3568: ixor
    //   3569: ixor
    //   3570: lookupswitch default -> 3596, -2089442156 -> 3553, 97791064 -> 5928
    //   3596: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3599: ldc_w 0.0131874075
    //   3602: invokestatic floatToIntBits : (F)I
    //   3605: ldc_w 2096631807
    //   3608: ixor
    //   3609: invokestatic intBitsToFloat : (I)F
    //   3612: getstatic Perryc.1 : I
    //   3615: ifeq -> 3629
    //   3618: ldc2_w -683969444
    //   3621: l2i
    //   3622: ldc_w 1446225891
    //   3625: ixor
    //   3626: goto -> 3637
    //   3629: ldc2_w -411769071
    //   3632: l2i
    //   3633: ldc_w 1987126242
    //   3636: ixor
    //   3637: ldc2_w 220601406
    //   3640: l2i
    //   3641: ldc_w 693490540
    //   3644: ixor
    //   3645: ixor
    //   3646: lookupswitch default -> 3672, -2123391201 -> 3629, -1518658323 -> 5822
    //   3672: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3675: ldc_w 7.553163
    //   3678: invokestatic floatToIntBits : (F)I
    //   3681: ldc_w 2138157955
    //   3684: ixor
    //   3685: invokestatic intBitsToFloat : (I)F
    //   3688: getstatic Perryc.c : I
    //   3691: iflt -> 3705
    //   3694: ldc2_w 1337310340
    //   3697: l2i
    //   3698: ldc_w -1833833183
    //   3701: ixor
    //   3702: goto -> 3713
    //   3705: ldc2_w 1081593165
    //   3708: l2i
    //   3709: ldc_w -153760101
    //   3712: ixor
    //   3713: ldc2_w -1204529796
    //   3716: l2i
    //   3717: ldc_w 2144866586
    //   3720: ixor
    //   3721: ixor
    //   3722: lookupswitch default -> 5958, 451417539 -> 3705, 1900955568 -> 3748
    //   3748: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3751: ldc_w 0.17509975
    //   3754: invokestatic floatToIntBits : (F)I
    //   3757: ldc_w 2129874265
    //   3760: ixor
    //   3761: invokestatic intBitsToFloat : (I)F
    //   3764: getstatic Perryc.0 : I
    //   3767: ifle -> 3781
    //   3770: ldc2_w -581504018
    //   3773: l2i
    //   3774: ldc_w 1168633214
    //   3777: ixor
    //   3778: goto -> 3789
    //   3781: ldc2_w 168431447
    //   3784: l2i
    //   3785: ldc_w 710751499
    //   3788: ixor
    //   3789: ldc2_w 2044362293
    //   3792: l2i
    //   3793: ldc_w 557734306
    //   3796: ixor
    //   3797: ixor
    //   3798: lookupswitch default -> 5886, -1072350969 -> 3781, 2025004491 -> 3824
    //   3824: invokestatic valueOf : (F)Ljava/lang/Float;
    //   3827: getstatic Perryc.1 : I
    //   3830: ifeq -> 3844
    //   3833: ldc2_w -1159384665
    //   3836: l2i
    //   3837: ldc_w -1613399518
    //   3840: ixor
    //   3841: goto -> 3852
    //   3844: ldc2_w -313069954
    //   3847: l2i
    //   3848: ldc_w 1067436058
    //   3851: ixor
    //   3852: ldc2_w 1132716798
    //   3855: l2i
    //   3856: ldc_w -142662858
    //   3859: ixor
    //   3860: ixor
    //   3861: lookupswitch default -> 3888, -1848866227 -> 5880, 1837079979 -> 3844
    //   3888: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3891: getstatic Perryc.0 : I
    //   3894: ifle -> 3908
    //   3897: ldc2_w -627776138
    //   3900: l2i
    //   3901: ldc_w -894176116
    //   3904: ixor
    //   3905: goto -> 3916
    //   3908: ldc2_w -159047892
    //   3911: l2i
    //   3912: ldc_w -712113670
    //   3915: ixor
    //   3916: ldc2_w 1453088404
    //   3919: l2i
    //   3920: ldc_w -630470793
    //   3923: ixor
    //   3924: ixor
    //   3925: lookupswitch default -> 3952, -1664055271 -> 5862, -947772371 -> 3908
    //   3952: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3955: getstatic Perryc.1 : I
    //   3958: ifeq -> 3972
    //   3961: ldc2_w 496814679
    //   3964: l2i
    //   3965: ldc_w -183935888
    //   3968: ixor
    //   3969: goto -> 3980
    //   3972: ldc2_w 162580109
    //   3975: l2i
    //   3976: ldc_w 420547995
    //   3979: ixor
    //   3980: ldc2_w -695949122
    //   3983: l2i
    //   3984: ldc_w 130082242
    //   3987: ixor
    //   3988: ixor
    //   3989: lookupswitch default -> 4016, -1017723852 -> 3972, 970054491 -> 5810
    //   4016: putfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4019: getstatic Perryc.c : I
    //   4022: iflt -> 4036
    //   4025: ldc2_w -1919135479
    //   4028: l2i
    //   4029: ldc_w -954058591
    //   4032: ixor
    //   4033: goto -> 4044
    //   4036: ldc2_w 1593191289
    //   4039: l2i
    //   4040: ldc_w 278335275
    //   4043: ixor
    //   4044: ldc2_w -251022559
    //   4047: l2i
    //   4048: ldc_w -1689630418
    //   4051: ixor
    //   4052: ixor
    //   4053: lookupswitch default -> 4080, -1550548043 -> 4036, 553489319 -> 5850
    //   4080: aload_0
    //   4081: getstatic Perryc.1 : I
    //   4084: ifeq -> 4098
    //   4087: ldc2_w -682714661
    //   4090: l2i
    //   4091: ldc_w -316191701
    //   4094: ixor
    //   4095: goto -> 4106
    //   4098: ldc2_w -414202171
    //   4101: l2i
    //   4102: ldc_w -533191813
    //   4105: ixor
    //   4106: ldc2_w -1181588671
    //   4109: l2i
    //   4110: ldc_w 385317903
    //   4113: ixor
    //   4114: ixor
    //   4115: lookupswitch default -> 4140, -1794323778 -> 5816, 452466488 -> 4098
    //   4140: aload_0
    //   4141: new bigname/zprestige/webhack/features/setting/Setting
    //   4144: dup
    //   4145: ldc_w '飒㌞颲㶥♒瘝๫蹭窿‿'
    //   4148: getstatic Perryc.c : I
    //   4151: iflt -> 4165
    //   4154: ldc2_w -389197610
    //   4157: l2i
    //   4158: ldc_w 2053379856
    //   4161: ixor
    //   4162: goto -> 4173
    //   4165: ldc2_w -1377853922
    //   4168: l2i
    //   4169: ldc_w -387416061
    //   4172: ixor
    //   4173: ldc2_w -591706648
    //   4176: l2i
    //   4177: ldc_w -2104662250
    //   4180: ixor
    //   4181: ixor
    //   4182: lookupswitch default -> 4208, -861969096 -> 5982, -257984384 -> 4165
    //   4208: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4211: ldc_w 0.04113632
    //   4214: invokestatic floatToIntBits : (F)I
    //   4217: ldc_w 2099805839
    //   4220: ixor
    //   4221: invokestatic intBitsToFloat : (I)F
    //   4224: getstatic Perryc.1 : I
    //   4227: ifeq -> 4241
    //   4230: ldc2_w 1055715834
    //   4233: l2i
    //   4234: ldc_w -567237971
    //   4237: ixor
    //   4238: goto -> 4249
    //   4241: ldc2_w -387155922
    //   4244: l2i
    //   4245: ldc_w 1433148800
    //   4248: ixor
    //   4249: ldc2_w -1942290293
    //   4252: l2i
    //   4253: ldc_w 1290933155
    //   4256: ixor
    //   4257: ixor
    //   4258: lookupswitch default -> 5892, 538263679 -> 4241, 2101966470 -> 4284
    //   4284: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4287: ldc_w 5.488775
    //   4290: invokestatic floatToIntBits : (F)I
    //   4293: ldc_w 2133828619
    //   4296: ixor
    //   4297: invokestatic intBitsToFloat : (I)F
    //   4300: getstatic Perryc.0 : I
    //   4303: ifle -> 4317
    //   4306: ldc2_w -106725406
    //   4309: l2i
    //   4310: ldc_w -927491279
    //   4313: ixor
    //   4314: goto -> 4325
    //   4317: ldc2_w 244640867
    //   4320: l2i
    //   4321: ldc_w -1886281812
    //   4324: ixor
    //   4325: ldc2_w 2002283742
    //   4328: l2i
    //   4329: ldc_w -1083832159
    //   4332: ixor
    //   4333: ixor
    //   4334: lookupswitch default -> 5832, -114655060 -> 4317, 1228609456 -> 4360
    //   4360: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4363: ldc_w 0.23544587
    //   4366: invokestatic floatToIntBits : (F)I
    //   4369: ldc_w 2123438265
    //   4372: ixor
    //   4373: invokestatic intBitsToFloat : (I)F
    //   4376: getstatic Perryc.c : I
    //   4379: iflt -> 4393
    //   4382: ldc2_w -422353426
    //   4385: l2i
    //   4386: ldc_w -1540140823
    //   4389: ixor
    //   4390: goto -> 4401
    //   4393: ldc2_w 1016538823
    //   4396: l2i
    //   4397: ldc_w 2106064635
    //   4400: ixor
    //   4401: ldc2_w 1337220998
    //   4404: l2i
    //   4405: ldc_w 593465080
    //   4408: ixor
    //   4409: ixor
    //   4410: lookupswitch default -> 5938, 771426626 -> 4436, 772531321 -> 4393
    //   4436: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4439: getstatic Perryc.0 : I
    //   4442: ifle -> 4456
    //   4445: ldc2_w -1563336062
    //   4448: l2i
    //   4449: ldc_w -1063091410
    //   4452: ixor
    //   4453: goto -> 4464
    //   4456: ldc2_w -382900630
    //   4459: l2i
    //   4460: ldc_w 1572519793
    //   4463: ixor
    //   4464: ldc2_w 1871187677
    //   4467: l2i
    //   4468: ldc_w 1681887358
    //   4471: ixor
    //   4472: ixor
    //   4473: lookupswitch default -> 5968, -1088403528 -> 4500, 1774485263 -> 4456
    //   4500: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4503: getstatic Perryc.1 : I
    //   4506: ifeq -> 4520
    //   4509: ldc2_w 640913920
    //   4512: l2i
    //   4513: ldc_w 1875334418
    //   4516: ixor
    //   4517: goto -> 4528
    //   4520: ldc2_w -450921862
    //   4523: l2i
    //   4524: ldc_w 165537705
    //   4527: ixor
    //   4528: ldc2_w 1699135766
    //   4531: l2i
    //   4532: ldc_w -50405150
    //   4535: ixor
    //   4536: ixor
    //   4537: lookupswitch default -> 5960, -800266522 -> 4520, 1970977831 -> 4564
    //   4564: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4567: getstatic Perryc.c : I
    //   4570: iflt -> 4584
    //   4573: ldc2_w 714027462
    //   4576: l2i
    //   4577: ldc_w 1918688700
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w 581387034
    //   4587: l2i
    //   4588: ldc_w 903886600
    //   4591: ixor
    //   4592: ldc2_w -2023415674
    //   4595: l2i
    //   4596: ldc_w 732622596
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 5978, -1148666992 -> 4628, -199482376 -> 4584
    //   4628: putfield distance : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4631: getstatic Perryc.0 : I
    //   4634: ifle -> 4648
    //   4637: ldc2_w 90843414
    //   4640: l2i
    //   4641: ldc_w 692556562
    //   4644: ixor
    //   4645: goto -> 4656
    //   4648: ldc2_w -2015669261
    //   4651: l2i
    //   4652: ldc_w 235414765
    //   4655: ixor
    //   4656: ldc2_w -488722189
    //   4659: l2i
    //   4660: ldc_w 1702868606
    //   4663: ixor
    //   4664: ixor
    //   4665: lookupswitch default -> 4692, -1416840055 -> 5906, 873531586 -> 4648
    //   4692: aload_0
    //   4693: getstatic Perryc.c : I
    //   4696: iflt -> 4710
    //   4699: ldc2_w -344831139
    //   4702: l2i
    //   4703: ldc_w 1805606451
    //   4706: ixor
    //   4707: goto -> 4718
    //   4710: ldc2_w 1989817193
    //   4713: l2i
    //   4714: ldc_w -464137137
    //   4717: ixor
    //   4718: ldc2_w 1942539604
    //   4721: l2i
    //   4722: ldc_w 1041547416
    //   4725: ixor
    //   4726: ixor
    //   4727: lookupswitch default -> 4752, -852420446 -> 5852, -421091838 -> 4710
    //   4752: aload_0
    //   4753: new bigname/zprestige/webhack/features/setting/Setting
    //   4756: dup
    //   4757: ldc_w '飓㌜颧㶶♒癘'
    //   4760: getstatic Perryc.1 : I
    //   4763: ifeq -> 4777
    //   4766: ldc2_w 31518921
    //   4769: l2i
    //   4770: ldc_w 1207486674
    //   4773: ixor
    //   4774: goto -> 4785
    //   4777: ldc2_w -1692330581
    //   4780: l2i
    //   4781: ldc_w 1437839711
    //   4784: ixor
    //   4785: ldc2_w -1320101734
    //   4788: l2i
    //   4789: ldc_w 848424234
    //   4792: ixor
    //   4793: ixor
    //   4794: lookupswitch default -> 4820, -1190360743 -> 4777, -975630933 -> 5966
    //   4820: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4823: ldc2_w -1219538255
    //   4826: l2i
    //   4827: ldc_w -1219538255
    //   4830: ixor
    //   4831: getstatic Perryc.1 : I
    //   4834: ifeq -> 4848
    //   4837: ldc2_w -593630407
    //   4840: l2i
    //   4841: ldc_w -1957502831
    //   4844: ixor
    //   4845: goto -> 4856
    //   4848: ldc2_w -859128666
    //   4851: l2i
    //   4852: ldc_w -1308442071
    //   4855: ixor
    //   4856: ldc2_w 1150777129
    //   4859: l2i
    //   4860: ldc_w 366141498
    //   4863: ixor
    //   4864: ixor
    //   4865: lookupswitch default -> 4892, 109747387 -> 5970, 288050672 -> 4848
    //   4892: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4895: getstatic Perryc.c : I
    //   4898: iflt -> 4912
    //   4901: ldc2_w -1391249808
    //   4904: l2i
    //   4905: ldc_w -852994704
    //   4908: ixor
    //   4909: goto -> 4920
    //   4912: ldc2_w -344835214
    //   4915: l2i
    //   4916: ldc_w -603218515
    //   4919: ixor
    //   4920: ldc2_w -1989363964
    //   4923: l2i
    //   4924: ldc_w 1024768790
    //   4927: ixor
    //   4928: ixor
    //   4929: lookupswitch default -> 5940, -2097042739 -> 4956, -733778158 -> 4912
    //   4956: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4959: getstatic Perryc.c : I
    //   4962: iflt -> 4976
    //   4965: ldc2_w -791403769
    //   4968: l2i
    //   4969: ldc_w 1537052027
    //   4972: ixor
    //   4973: goto -> 4984
    //   4976: ldc2_w -837185145
    //   4979: l2i
    //   4980: ldc_w 1720129938
    //   4983: ixor
    //   4984: ldc2_w -1901889294
    //   4987: l2i
    //   4988: ldc_w 1500634913
    //   4991: ixor
    //   4992: ixor
    //   4993: lookupswitch default -> 5866, 1553664431 -> 4976, 2135699398 -> 5020
    //   5020: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5023: getstatic Perryc.c : I
    //   5026: iflt -> 5040
    //   5029: ldc2_w -1503100038
    //   5032: l2i
    //   5033: ldc_w 1460230789
    //   5036: ixor
    //   5037: goto -> 5048
    //   5040: ldc2_w 1204732344
    //   5043: l2i
    //   5044: ldc_w -1025185357
    //   5047: ixor
    //   5048: ldc2_w 1981653993
    //   5051: l2i
    //   5052: ldc_w -1425902134
    //   5055: ixor
    //   5056: ixor
    //   5057: lookupswitch default -> 5964, 746459100 -> 5040, 1479933480 -> 5084
    //   5084: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5087: getstatic Perryc.1 : I
    //   5090: ifeq -> 5104
    //   5093: ldc2_w 462001286
    //   5096: l2i
    //   5097: ldc_w 556444213
    //   5100: ixor
    //   5101: goto -> 5112
    //   5104: ldc2_w -1709857896
    //   5107: l2i
    //   5108: ldc_w 785802377
    //   5111: ixor
    //   5112: ldc2_w -913200337
    //   5115: l2i
    //   5116: ldc_w 985998856
    //   5119: ixor
    //   5120: ixor
    //   5121: lookupswitch default -> 5976, -906513516 -> 5104, 1201097270 -> 5148
    //   5148: aload_0
    //   5149: getstatic Perryc.1 : I
    //   5152: ifeq -> 5166
    //   5155: ldc2_w 783367366
    //   5158: l2i
    //   5159: ldc_w 442197820
    //   5162: ixor
    //   5163: goto -> 5174
    //   5166: ldc2_w 1381354799
    //   5169: l2i
    //   5170: ldc_w -1891943417
    //   5173: ixor
    //   5174: ldc2_w 1057814240
    //   5177: l2i
    //   5178: ldc_w -486363726
    //   5181: ixor
    //   5182: ixor
    //   5183: lookupswitch default -> 5944, -387710808 -> 5166, 23112314 -> 5208
    //   5208: aload_0
    //   5209: new bigname/zprestige/webhack/features/setting/Setting
    //   5212: dup
    //   5213: ldc_w '飑㌒颰㶼♃癉'
    //   5216: getstatic Perryc.1 : I
    //   5219: ifeq -> 5233
    //   5222: ldc2_w -1308306732
    //   5225: l2i
    //   5226: ldc_w -1963914234
    //   5229: ixor
    //   5230: goto -> 5241
    //   5233: ldc2_w -1727174723
    //   5236: l2i
    //   5237: ldc_w -1153856309
    //   5240: ixor
    //   5241: ldc2_w 313385935
    //   5244: l2i
    //   5245: ldc_w -1232020524
    //   5248: ixor
    //   5249: ixor
    //   5250: lookupswitch default -> 5276, -1664555319 -> 5980, -678500141 -> 5233
    //   5276: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5279: ldc2_w -74582275
    //   5282: l2i
    //   5283: ldc_w -74582275
    //   5286: ixor
    //   5287: getstatic Perryc.1 : I
    //   5290: ifeq -> 5304
    //   5293: ldc2_w -102563536
    //   5296: l2i
    //   5297: ldc_w 160251790
    //   5300: ixor
    //   5301: goto -> 5312
    //   5304: ldc2_w 186115830
    //   5307: l2i
    //   5308: ldc_w -1035103347
    //   5311: ixor
    //   5312: ldc2_w 2107624071
    //   5315: l2i
    //   5316: ldc_w -537094892
    //   5319: ixor
    //   5320: ixor
    //   5321: lookupswitch default -> 5916, 1376608557 -> 5304, 1798908648 -> 5348
    //   5348: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5351: getstatic Perryc.1 : I
    //   5354: ifeq -> 5368
    //   5357: ldc2_w -2077737133
    //   5360: l2i
    //   5361: ldc_w 1352304789
    //   5364: ixor
    //   5365: goto -> 5376
    //   5368: ldc2_w -1426612953
    //   5371: l2i
    //   5372: ldc_w -1903281702
    //   5375: ixor
    //   5376: ldc2_w 347823015
    //   5379: l2i
    //   5380: ldc_w -1457340223
    //   5383: ixor
    //   5384: ixor
    //   5385: lookupswitch default -> 5412, 1425890591 -> 5368, 1764437152 -> 5856
    //   5412: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5415: getstatic Perryc.1 : I
    //   5418: ifeq -> 5432
    //   5421: ldc2_w 477059711
    //   5424: l2i
    //   5425: ldc_w 1156675638
    //   5428: ixor
    //   5429: goto -> 5440
    //   5432: ldc2_w 1847143267
    //   5435: l2i
    //   5436: ldc_w 373149713
    //   5439: ixor
    //   5440: ldc2_w -579773622
    //   5443: l2i
    //   5444: ldc_w -142874839
    //   5447: ixor
    //   5448: ixor
    //   5449: lookupswitch default -> 5476, -1111761139 -> 5432, 1922342442 -> 5910
    //   5476: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5479: getstatic Perryc.c : I
    //   5482: iflt -> 5496
    //   5485: ldc2_w -1092644027
    //   5488: l2i
    //   5489: ldc_w -35594249
    //   5492: ixor
    //   5493: goto -> 5504
    //   5496: ldc2_w 418029733
    //   5499: l2i
    //   5500: ldc_w -1645813310
    //   5503: ixor
    //   5504: ldc2_w 1688589761
    //   5507: l2i
    //   5508: ldc_w 1294063502
    //   5511: ixor
    //   5512: ixor
    //   5513: lookupswitch default -> 5540, 1141357722 -> 5496, 1790660349 -> 5830
    //   5540: putfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5543: getstatic Perryc.0 : I
    //   5546: ifle -> 5560
    //   5549: ldc2_w -1915428655
    //   5552: l2i
    //   5553: ldc_w 1695972805
    //   5556: ixor
    //   5557: goto -> 5568
    //   5560: ldc2_w -505468286
    //   5563: l2i
    //   5564: ldc_w 1955182796
    //   5567: ixor
    //   5568: ldc2_w -94073000
    //   5571: l2i
    //   5572: ldc_w 1217765416
    //   5575: ixor
    //   5576: ixor
    //   5577: lookupswitch default -> 5870, 665304382 -> 5604, 1513337444 -> 5560
    //   5604: aload_0
    //   5605: ldc2_w -295518250
    //   5608: l2i
    //   5609: ldc_w -295518250
    //   5612: ixor
    //   5613: getstatic Perryc.c : I
    //   5616: iflt -> 5630
    //   5619: ldc2_w 779564414
    //   5622: l2i
    //   5623: ldc_w -717304521
    //   5626: ixor
    //   5627: goto -> 5638
    //   5630: ldc2_w -1043841171
    //   5633: l2i
    //   5634: ldc_w 341763972
    //   5637: ixor
    //   5638: ldc2_w -1919840759
    //   5641: l2i
    //   5642: ldc_w 172472929
    //   5645: ixor
    //   5646: ixor
    //   5647: lookupswitch default -> 5808, 1379986561 -> 5672, 2090847265 -> 5630
    //   5672: putfield placeAmount : I
    //   5675: getstatic Perryc.1 : I
    //   5678: ifeq -> 5692
    //   5681: ldc2_w -936379382
    //   5684: l2i
    //   5685: ldc_w 878969653
    //   5688: ixor
    //   5689: goto -> 5700
    //   5692: ldc2_w -376721796
    //   5695: l2i
    //   5696: ldc_w -1896815754
    //   5699: ixor
    //   5700: ldc2_w 1268974044
    //   5703: l2i
    //   5704: ldc_w -1158277624
    //   5707: ixor
    //   5708: ixor
    //   5709: lookupswitch default -> 5858, -1775346978 -> 5736, 220129515 -> 5692
    //   5736: aload_0
    //   5737: ldc2_w -506863985
    //   5740: l2i
    //   5741: ldc_w 506863984
    //   5744: ixor
    //   5745: getstatic Perryc.0 : I
    //   5748: ifle -> 5762
    //   5751: ldc2_w 242741787
    //   5754: l2i
    //   5755: ldc_w -1165405973
    //   5758: ixor
    //   5759: goto -> 5770
    //   5762: ldc2_w -1160469785
    //   5765: l2i
    //   5766: ldc_w 1132976840
    //   5769: ixor
    //   5770: ldc2_w 215575909
    //   5773: l2i
    //   5774: ldc_w -169914520
    //   5777: ixor
    //   5778: ixor
    //   5779: lookupswitch default -> 5896, 5593634 -> 5804, 1308131581 -> 5762
    //   5804: putfield blockSlot : I
    //   5807: return
    //   5808: aconst_null
    //   5809: athrow
    //   5810: aconst_null
    //   5811: athrow
    //   5812: aconst_null
    //   5813: athrow
    //   5814: aconst_null
    //   5815: athrow
    //   5816: aconst_null
    //   5817: athrow
    //   5818: aconst_null
    //   5819: athrow
    //   5820: aconst_null
    //   5821: athrow
    //   5822: aconst_null
    //   5823: athrow
    //   5824: aconst_null
    //   5825: athrow
    //   5826: aconst_null
    //   5827: athrow
    //   5828: aconst_null
    //   5829: athrow
    //   5830: aconst_null
    //   5831: athrow
    //   5832: aconst_null
    //   5833: athrow
    //   5834: aconst_null
    //   5835: athrow
    //   5836: aconst_null
    //   5837: athrow
    //   5838: aconst_null
    //   5839: athrow
    //   5840: aconst_null
    //   5841: athrow
    //   5842: aconst_null
    //   5843: athrow
    //   5844: aconst_null
    //   5845: athrow
    //   5846: aconst_null
    //   5847: athrow
    //   5848: aconst_null
    //   5849: athrow
    //   5850: aconst_null
    //   5851: athrow
    //   5852: aconst_null
    //   5853: athrow
    //   5854: aconst_null
    //   5855: athrow
    //   5856: aconst_null
    //   5857: athrow
    //   5858: aconst_null
    //   5859: athrow
    //   5860: aconst_null
    //   5861: athrow
    //   5862: aconst_null
    //   5863: athrow
    //   5864: aconst_null
    //   5865: athrow
    //   5866: aconst_null
    //   5867: athrow
    //   5868: aconst_null
    //   5869: athrow
    //   5870: aconst_null
    //   5871: athrow
    //   5872: aconst_null
    //   5873: athrow
    //   5874: aconst_null
    //   5875: athrow
    //   5876: aconst_null
    //   5877: athrow
    //   5878: aconst_null
    //   5879: athrow
    //   5880: aconst_null
    //   5881: athrow
    //   5882: aconst_null
    //   5883: athrow
    //   5884: aconst_null
    //   5885: athrow
    //   5886: aconst_null
    //   5887: athrow
    //   5888: aconst_null
    //   5889: athrow
    //   5890: aconst_null
    //   5891: athrow
    //   5892: aconst_null
    //   5893: athrow
    //   5894: aconst_null
    //   5895: athrow
    //   5896: aconst_null
    //   5897: athrow
    //   5898: aconst_null
    //   5899: athrow
    //   5900: aconst_null
    //   5901: athrow
    //   5902: aconst_null
    //   5903: athrow
    //   5904: aconst_null
    //   5905: athrow
    //   5906: aconst_null
    //   5907: athrow
    //   5908: aconst_null
    //   5909: athrow
    //   5910: aconst_null
    //   5911: athrow
    //   5912: aconst_null
    //   5913: athrow
    //   5914: aconst_null
    //   5915: athrow
    //   5916: aconst_null
    //   5917: athrow
    //   5918: aconst_null
    //   5919: athrow
    //   5920: aconst_null
    //   5921: athrow
    //   5922: aconst_null
    //   5923: athrow
    //   5924: aconst_null
    //   5925: athrow
    //   5926: aconst_null
    //   5927: athrow
    //   5928: aconst_null
    //   5929: athrow
    //   5930: aconst_null
    //   5931: athrow
    //   5932: aconst_null
    //   5933: athrow
    //   5934: aconst_null
    //   5935: athrow
    //   5936: aconst_null
    //   5937: athrow
    //   5938: aconst_null
    //   5939: athrow
    //   5940: aconst_null
    //   5941: athrow
    //   5942: aconst_null
    //   5943: athrow
    //   5944: aconst_null
    //   5945: athrow
    //   5946: aconst_null
    //   5947: athrow
    //   5948: aconst_null
    //   5949: athrow
    //   5950: aconst_null
    //   5951: athrow
    //   5952: aconst_null
    //   5953: athrow
    //   5954: aconst_null
    //   5955: athrow
    //   5956: aconst_null
    //   5957: athrow
    //   5958: aconst_null
    //   5959: athrow
    //   5960: aconst_null
    //   5961: athrow
    //   5962: aconst_null
    //   5963: athrow
    //   5964: aconst_null
    //   5965: athrow
    //   5966: aconst_null
    //   5967: athrow
    //   5968: aconst_null
    //   5969: athrow
    //   5970: aconst_null
    //   5971: athrow
    //   5972: aconst_null
    //   5973: athrow
    //   5974: aconst_null
    //   5975: athrow
    //   5976: aconst_null
    //   5977: athrow
    //   5978: aconst_null
    //   5979: athrow
    //   5980: aconst_null
    //   5981: athrow
    //   5982: aconst_null
    //   5983: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5808	0	this	Lbigname/zprestige/webhack/features/modules/Combat/HoleFiller;
  }
  
  @Subscribe
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5289
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 5281
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5273
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -904389227
    //   33: l2i
    //   34: ldc_w 1056444674
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -941565362
    //   44: l2i
    //   45: ldc_w 352826059
    //   48: ixor
    //   49: ldc2_w 1547523267
    //   52: l2i
    //   53: ldc_w 1818891347
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -994620409 -> 5186, 63526603 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 1148705069
    //   94: l2i
    //   95: ldc_w 2083370622
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -896201754
    //   105: l2i
    //   106: ldc_w 821535311
    //   109: ixor
    //   110: ldc2_w 267987839
    //   113: l2i
    //   114: ldc_w 1574730056
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1600087747 -> 102, 1786723684 -> 5182
    //   144: goto -> 148
    //   147: athrow
    //   148: invokespecial check : ()Z
    //   151: goto -> 155
    //   154: athrow
    //   155: ifeq -> 169
    //   158: ldc2_w -75990207
    //   161: l2i
    //   162: ldc_w 547261483
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w -1132497762
    //   172: l2i
    //   173: ldc_w 1738114037
    //   176: ixor
    //   177: ldc2_w -197273560
    //   180: l2i
    //   181: ldc_w 368605404
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, 975394718 -> 208, 975394719 -> 5123
    //   208: ldc_w 0.1930676
    //   211: invokestatic floatToIntBits : (F)I
    //   214: ldc_w 2137371523
    //   217: ixor
    //   218: invokestatic intBitsToFloat : (I)F
    //   221: getstatic Perryc.1 : I
    //   224: ifeq -> 238
    //   227: ldc2_w -1855547498
    //   230: l2i
    //   231: ldc_w 1232464870
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w 124169316
    //   241: l2i
    //   242: ldc_w -1572297522
    //   245: ixor
    //   246: ldc2_w -1083470555
    //   249: l2i
    //   250: ldc_w 730688243
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 280, -283859085 -> 238, 1291164582 -> 5204
    //   280: goto -> 284
    //   283: athrow
    //   284: invokestatic getTarget : (F)Lnet/minecraft/entity/player/EntityPlayer;
    //   287: goto -> 291
    //   290: athrow
    //   291: getstatic Perryc.1 : I
    //   294: ifeq -> 308
    //   297: ldc2_w 1816175040
    //   300: l2i
    //   301: ldc_w 1222362235
    //   304: ixor
    //   305: goto -> 316
    //   308: ldc2_w 2024645798
    //   311: l2i
    //   312: ldc_w -106835305
    //   315: ixor
    //   316: ldc2_w -997979071
    //   319: l2i
    //   320: ldc_w -1748564537
    //   323: ixor
    //   324: ixor
    //   325: lookupswitch default -> 5174, -766541897 -> 352, 2010672189 -> 308
    //   352: astore_1
    //   353: getstatic Perryc.0 : I
    //   356: ifle -> 370
    //   359: ldc2_w -314683614
    //   362: l2i
    //   363: ldc_w 987987436
    //   366: ixor
    //   367: goto -> 378
    //   370: ldc2_w -1234576103
    //   373: l2i
    //   374: ldc_w -1858094817
    //   377: ixor
    //   378: ldc2_w 1733788018
    //   381: l2i
    //   382: ldc_w 709213278
    //   385: ixor
    //   386: ixor
    //   387: lookupswitch default -> 5136, -1697706014 -> 370, 1782864170 -> 412
    //   412: aload_1
    //   413: ifnonnull -> 427
    //   416: ldc2_w -1584038530
    //   419: l2i
    //   420: ldc_w 1426256739
    //   423: ixor
    //   424: goto -> 435
    //   427: ldc2_w 1017474230
    //   430: l2i
    //   431: ldc_w -936189270
    //   434: ixor
    //   435: ldc2_w -1913553822
    //   438: l2i
    //   439: ldc_w 2059208189
    //   442: ixor
    //   443: ixor
    //   444: tableswitch default -> 416, 64747394 -> 468, 64747395 -> 469
    //   468: return
    //   469: getstatic Perryc.c : I
    //   472: iflt -> 486
    //   475: ldc2_w 145588154
    //   478: l2i
    //   479: ldc_w -965001387
    //   482: ixor
    //   483: goto -> 494
    //   486: ldc2_w -1307423639
    //   489: l2i
    //   490: ldc_w 1277979046
    //   493: ixor
    //   494: ldc2_w -146172650
    //   497: l2i
    //   498: ldc_w 1900937046
    //   501: ixor
    //   502: ixor
    //   503: lookupswitch default -> 5150, 1221733039 -> 486, 2017087375 -> 528
    //   528: aload_1
    //   529: getstatic Perryc.0 : I
    //   532: ifle -> 546
    //   535: ldc2_w 81880753
    //   538: l2i
    //   539: ldc_w -1623827757
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w -896731931
    //   549: l2i
    //   550: ldc_w -54798653
    //   553: ixor
    //   554: ldc2_w -782637303
    //   557: l2i
    //   558: ldc_w -1380657252
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 588, -415625993 -> 5212, 765946603 -> 546
    //   588: goto -> 592
    //   591: athrow
    //   592: invokestatic isInHole : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   595: goto -> 599
    //   598: athrow
    //   599: ifeq -> 613
    //   602: ldc2_w 1358512850
    //   605: l2i
    //   606: ldc_w 702157842
    //   609: ixor
    //   610: goto -> 621
    //   613: ldc2_w 1060374338
    //   616: l2i
    //   617: ldc_w 1175933373
    //   620: ixor
    //   621: ldc2_w -1328980186
    //   624: l2i
    //   625: ldc_w 445662265
    //   628: ixor
    //   629: ixor
    //   630: tableswitch default -> 602, -746959393 -> 652, -746959392 -> 653
    //   652: return
    //   653: getstatic Perryc.0 : I
    //   656: ifle -> 670
    //   659: ldc2_w 23832943
    //   662: l2i
    //   663: ldc_w 493528435
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -2115562944
    //   673: l2i
    //   674: ldc_w 1408728917
    //   677: ixor
    //   678: ldc2_w 1420224338
    //   681: l2i
    //   682: ldc_w 487513068
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 712, -513342352 -> 670, 1437151394 -> 5238
    //   712: aload_0
    //   713: getstatic Perryc.1 : I
    //   716: ifeq -> 730
    //   719: ldc2_w 268039399
    //   722: l2i
    //   723: ldc_w -301702899
    //   726: ixor
    //   727: goto -> 738
    //   730: ldc2_w 2135809356
    //   733: l2i
    //   734: ldc_w -1413325667
    //   737: ixor
    //   738: ldc2_w -1590671798
    //   741: l2i
    //   742: ldc_w 1728903703
    //   745: ixor
    //   746: ixor
    //   747: lookupswitch default -> 772, -1116550191 -> 730, 666970551 -> 5176
    //   772: goto -> 776
    //   775: athrow
    //   776: invokevirtual calcHoles : ()Ljava/util/List;
    //   779: goto -> 783
    //   782: athrow
    //   783: getstatic Perryc.0 : I
    //   786: ifle -> 800
    //   789: ldc2_w -652440936
    //   792: l2i
    //   793: ldc_w 291797507
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w 1224149408
    //   803: l2i
    //   804: ldc_w 1473935799
    //   807: ixor
    //   808: ldc2_w -575928375
    //   811: l2i
    //   812: ldc_w -120295756
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 5226, -318727706 -> 800, 978655594 -> 844
    //   844: astore_2
    //   845: getstatic Perryc.1 : I
    //   848: ifeq -> 862
    //   851: ldc2_w -818449861
    //   854: l2i
    //   855: ldc_w 509481447
    //   858: ixor
    //   859: goto -> 870
    //   862: ldc2_w -1800669128
    //   865: l2i
    //   866: ldc_w 808452196
    //   869: ixor
    //   870: ldc2_w -737673201
    //   873: l2i
    //   874: ldc_w 624016607
    //   877: ixor
    //   878: ixor
    //   879: lookupswitch default -> 904, -293639925 -> 862, 542170892 -> 5250
    //   904: aload_2
    //   905: getstatic Perryc.c : I
    //   908: iflt -> 922
    //   911: ldc2_w -190215965
    //   914: l2i
    //   915: ldc_w 1303351379
    //   918: ixor
    //   919: goto -> 930
    //   922: ldc2_w 1953231642
    //   925: l2i
    //   926: ldc_w 636876690
    //   929: ixor
    //   930: ldc2_w -1512591581
    //   933: l2i
    //   934: ldc_w 2106933615
    //   937: ixor
    //   938: ixor
    //   939: lookupswitch default -> 964, -771343738 -> 922, 1631909628 -> 5222
    //   964: aload_1
    //   965: dup
    //   966: getstatic Perryc.c : I
    //   969: iflt -> 983
    //   972: ldc2_w -1536100101
    //   975: l2i
    //   976: ldc_w 1284299028
    //   979: ixor
    //   980: goto -> 991
    //   983: ldc2_w -414530247
    //   986: l2i
    //   987: ldc_w -170793634
    //   990: ixor
    //   991: ldc2_w -810653453
    //   994: l2i
    //   995: ldc_w -344245424
    //   998: ixor
    //   999: ixor
    //   1000: lookupswitch default -> 5180, -869698996 -> 983, 911111108 -> 1028
    //   1028: goto -> 1032
    //   1031: athrow
    //   1032: invokevirtual getClass : ()Ljava/lang/Class;
    //   1035: goto -> 1039
    //   1038: athrow
    //   1039: pop
    //   1040: <illegal opcode> applyAsDouble : (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/function/ToDoubleFunction;
    //   1045: getstatic Perryc.0 : I
    //   1048: ifle -> 1062
    //   1051: ldc2_w -505648165
    //   1054: l2i
    //   1055: ldc_w -1770786409
    //   1058: ixor
    //   1059: goto -> 1070
    //   1062: ldc2_w -487023993
    //   1065: l2i
    //   1066: ldc_w -1547906915
    //   1069: ixor
    //   1070: ldc2_w -437299264
    //   1073: l2i
    //   1074: ldc_w 1107370648
    //   1077: ixor
    //   1078: ixor
    //   1079: lookupswitch default -> 1104, -800985324 -> 5240, 421817802 -> 1062
    //   1104: goto -> 1108
    //   1107: athrow
    //   1108: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    //   1111: goto -> 1115
    //   1114: athrow
    //   1115: getstatic Perryc.c : I
    //   1118: iflt -> 1132
    //   1121: ldc2_w 1296405461
    //   1124: l2i
    //   1125: ldc_w -294899015
    //   1128: ixor
    //   1129: goto -> 1140
    //   1132: ldc2_w 1736957954
    //   1135: l2i
    //   1136: ldc_w -294200316
    //   1139: ixor
    //   1140: ldc2_w -1150002913
    //   1143: l2i
    //   1144: ldc_w 636433205
    //   1147: ixor
    //   1148: ixor
    //   1149: lookupswitch default -> 5244, 392844844 -> 1176, 1035127622 -> 1132
    //   1176: goto -> 1180
    //   1179: athrow
    //   1180: invokeinterface sort : (Ljava/util/Comparator;)V
    //   1185: goto -> 1189
    //   1188: athrow
    //   1189: getstatic Perryc.c : I
    //   1192: iflt -> 1206
    //   1195: ldc2_w -830208103
    //   1198: l2i
    //   1199: ldc_w 1621543117
    //   1202: ixor
    //   1203: goto -> 1214
    //   1206: ldc2_w -937858863
    //   1209: l2i
    //   1210: ldc_w 2130902739
    //   1213: ixor
    //   1214: ldc2_w -1133242300
    //   1217: l2i
    //   1218: ldc_w 1396753829
    //   1221: ixor
    //   1222: ixor
    //   1223: lookupswitch default -> 5206, 1091965621 -> 1206, 1479494627 -> 1248
    //   1248: aload_2
    //   1249: getstatic Perryc.0 : I
    //   1252: ifle -> 1266
    //   1255: ldc2_w 201710603
    //   1258: l2i
    //   1259: ldc_w -990587081
    //   1262: ixor
    //   1263: goto -> 1274
    //   1266: ldc2_w 29543493
    //   1269: l2i
    //   1270: ldc_w 1404128756
    //   1273: ixor
    //   1274: ldc2_w -97808408
    //   1277: l2i
    //   1278: ldc_w 831631970
    //   1281: ixor
    //   1282: ixor
    //   1283: lookupswitch default -> 1308, -171750836 -> 1266, 55260854 -> 5254
    //   1308: goto -> 1312
    //   1311: athrow
    //   1312: invokeinterface size : ()I
    //   1317: goto -> 1321
    //   1320: athrow
    //   1321: ifne -> 1335
    //   1324: ldc2_w -679461405
    //   1327: l2i
    //   1328: ldc_w -788336541
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w -697430919
    //   1338: l2i
    //   1339: ldc_w -789790216
    //   1342: ixor
    //   1343: ldc2_w -1170719528
    //   1346: l2i
    //   1347: ldc_w 1724874374
    //   1350: ixor
    //   1351: ixor
    //   1352: tableswitch default -> 1324, -629829666 -> 1376, -629829665 -> 1377
    //   1376: return
    //   1377: getstatic Perryc.1 : I
    //   1380: ifeq -> 1394
    //   1383: ldc2_w 190496615
    //   1386: l2i
    //   1387: ldc_w -275863307
    //   1390: ixor
    //   1391: goto -> 1402
    //   1394: ldc2_w -1325803997
    //   1397: l2i
    //   1398: ldc_w 733854213
    //   1401: ixor
    //   1402: ldc2_w -1949472519
    //   1405: l2i
    //   1406: ldc_w 433881999
    //   1409: ixor
    //   1410: ixor
    //   1411: lookupswitch default -> 1436, 1056133306 -> 1394, 1992686820 -> 5128
    //   1436: aload_0
    //   1437: pop
    //   1438: getstatic Perryc.1 : I
    //   1441: ifeq -> 1455
    //   1444: ldc2_w 1288517811
    //   1447: l2i
    //   1448: ldc_w -1606961103
    //   1451: ixor
    //   1452: goto -> 1463
    //   1455: ldc2_w 2111588612
    //   1458: l2i
    //   1459: ldc_w 413344477
    //   1462: ixor
    //   1463: ldc2_w 1047999418
    //   1466: l2i
    //   1467: ldc_w -2095593248
    //   1470: ixor
    //   1471: ixor
    //   1472: lookupswitch default -> 5152, -669020029 -> 1500, 1369078744 -> 1455
    //   1500: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   1503: getstatic Perryc.0 : I
    //   1506: ifle -> 1520
    //   1509: ldc2_w -816271928
    //   1512: l2i
    //   1513: ldc_w 1466381125
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w 382362636
    //   1523: l2i
    //   1524: ldc_w 346580147
    //   1527: ixor
    //   1528: ldc2_w 667694288
    //   1531: l2i
    //   1532: ldc_w -1651798759
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 1564, 578299716 -> 5188, 1098480393 -> 1520
    //   1564: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1567: getstatic Perryc.0 : I
    //   1570: ifle -> 1584
    //   1573: ldc2_w 1801278157
    //   1576: l2i
    //   1577: ldc_w 427432728
    //   1580: ixor
    //   1581: goto -> 1592
    //   1584: ldc2_w 1532804413
    //   1587: l2i
    //   1588: ldc_w -403924101
    //   1591: ixor
    //   1592: ldc2_w 1445832363
    //   1595: l2i
    //   1596: ldc_w 1979874600
    //   1599: ixor
    //   1600: ixor
    //   1601: lookupswitch default -> 5134, -1667236411 -> 1628, 1376293462 -> 1584
    //   1628: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   1631: getstatic Perryc.0 : I
    //   1634: ifle -> 1648
    //   1637: ldc2_w -1204238785
    //   1640: l2i
    //   1641: ldc_w -1292690341
    //   1644: ixor
    //   1645: goto -> 1656
    //   1648: ldc2_w -785182666
    //   1651: l2i
    //   1652: ldc_w 60619196
    //   1655: ixor
    //   1656: ldc2_w 1765361948
    //   1659: l2i
    //   1660: ldc_w -68244551
    //   1663: ixor
    //   1664: ixor
    //   1665: lookupswitch default -> 5208, -1742980927 -> 1648, 1081609007 -> 1692
    //   1692: getfield field_70461_c : I
    //   1695: getstatic Perryc.c : I
    //   1698: iflt -> 1712
    //   1701: ldc2_w 1830133622
    //   1704: l2i
    //   1705: ldc_w -194890739
    //   1708: ixor
    //   1709: goto -> 1720
    //   1712: ldc2_w -82918337
    //   1715: l2i
    //   1716: ldc_w -454409807
    //   1719: ixor
    //   1720: ldc2_w -1471838291
    //   1723: l2i
    //   1724: ldc_w -924987558
    //   1727: ixor
    //   1728: ixor
    //   1729: lookupswitch default -> 5166, -101719156 -> 1712, 2138885497 -> 1756
    //   1756: istore_3
    //   1757: getstatic Perryc.0 : I
    //   1760: ifle -> 1774
    //   1763: ldc2_w 1327746762
    //   1766: l2i
    //   1767: ldc_w -480913409
    //   1770: ixor
    //   1771: goto -> 1782
    //   1774: ldc2_w -1985757348
    //   1777: l2i
    //   1778: ldc_w 2127852447
    //   1781: ixor
    //   1782: ldc2_w -2132708731
    //   1785: l2i
    //   1786: ldc_w -1018896940
    //   1789: ixor
    //   1790: ixor
    //   1791: lookupswitch default -> 1816, -271337884 -> 5248, 326074181 -> 1774
    //   1816: aload_0
    //   1817: getstatic Perryc.1 : I
    //   1820: ifeq -> 1834
    //   1823: ldc2_w -64992000
    //   1826: l2i
    //   1827: ldc_w 1751327868
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w -1835912252
    //   1837: l2i
    //   1838: ldc_w -1669850859
    //   1841: ixor
    //   1842: ldc2_w -253926048
    //   1845: l2i
    //   1846: ldc_w 307891438
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 5198, -328383649 -> 1876, 1992556786 -> 1834
    //   1876: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   1879: getstatic Perryc.0 : I
    //   1882: ifle -> 1896
    //   1885: ldc2_w -321568290
    //   1888: l2i
    //   1889: ldc_w -1744265550
    //   1892: ixor
    //   1893: goto -> 1904
    //   1896: ldc2_w 950279434
    //   1899: l2i
    //   1900: ldc_w 1627227777
    //   1903: ixor
    //   1904: ldc2_w 2076326651
    //   1907: l2i
    //   1908: ldc_w 1613680260
    //   1911: ixor
    //   1912: ixor
    //   1913: lookupswitch default -> 5142, 1135964148 -> 1940, 1865493267 -> 1896
    //   1940: goto -> 1944
    //   1943: athrow
    //   1944: invokestatic func_150898_a : (Lnet/minecraft/block/Block;)Lnet/minecraft/item/Item;
    //   1947: goto -> 1951
    //   1950: athrow
    //   1951: getstatic Perryc.0 : I
    //   1954: ifle -> 1968
    //   1957: ldc2_w 1128463121
    //   1960: l2i
    //   1961: ldc_w -2136891591
    //   1964: ixor
    //   1965: goto -> 1976
    //   1968: ldc2_w 1025177092
    //   1971: l2i
    //   1972: ldc_w 1438890649
    //   1975: ixor
    //   1976: ldc2_w 2146301175
    //   1979: l2i
    //   1980: ldc_w -1894520646
    //   1983: ixor
    //   1984: ixor
    //   1985: lookupswitch default -> 2012, -234031670 -> 1968, 857569381 -> 5192
    //   2012: goto -> 2016
    //   2015: athrow
    //   2016: invokestatic getItemFromHotbar : (Lnet/minecraft/item/Item;)I
    //   2019: goto -> 2023
    //   2022: athrow
    //   2023: getstatic Perryc.1 : I
    //   2026: ifeq -> 2040
    //   2029: ldc2_w -1588545270
    //   2032: l2i
    //   2033: ldc_w 1310659933
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 1113689642
    //   2043: l2i
    //   2044: ldc_w -209079972
    //   2047: ixor
    //   2048: ldc2_w -681767087
    //   2051: l2i
    //   2052: ldc_w 340017005
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 2084, -1843704959 -> 2040, 743873643 -> 5230
    //   2084: putfield blockSlot : I
    //   2087: getstatic Perryc.c : I
    //   2090: iflt -> 2104
    //   2093: ldc2_w 1874230263
    //   2096: l2i
    //   2097: ldc_w 964123379
    //   2100: ixor
    //   2101: goto -> 2112
    //   2104: ldc2_w -1359668812
    //   2107: l2i
    //   2108: ldc_w 1939838181
    //   2111: ixor
    //   2112: ldc2_w -766312218
    //   2115: l2i
    //   2116: ldc_w -1833684119
    //   2119: ixor
    //   2120: ixor
    //   2121: lookupswitch default -> 5138, -1651654946 -> 2148, 371593867 -> 2104
    //   2148: aload_0
    //   2149: getstatic Perryc.c : I
    //   2152: iflt -> 2166
    //   2155: ldc2_w 1381691225
    //   2158: l2i
    //   2159: ldc_w -1605865724
    //   2162: ixor
    //   2163: goto -> 2174
    //   2166: ldc2_w -1768159683
    //   2169: l2i
    //   2170: ldc_w 219776983
    //   2173: ixor
    //   2174: ldc2_w -1833946884
    //   2177: l2i
    //   2178: ldc_w 1908786888
    //   2181: ixor
    //   2182: ixor
    //   2183: lookupswitch default -> 5124, 291993193 -> 2166, 2029025246 -> 2208
    //   2208: getfield blockSlot : I
    //   2211: ldc2_w -939049921
    //   2214: l2i
    //   2215: ldc_w 939049920
    //   2218: ixor
    //   2219: if_icmpne -> 2233
    //   2222: ldc2_w -831446225
    //   2225: l2i
    //   2226: ldc_w 432882617
    //   2229: ixor
    //   2230: goto -> 2241
    //   2233: ldc2_w -2102967219
    //   2236: l2i
    //   2237: ldc_w 1427842268
    //   2240: ixor
    //   2241: ldc2_w -562825556
    //   2244: l2i
    //   2245: ldc_w -660738783
    //   2248: ixor
    //   2249: ixor
    //   2250: tableswitch default -> 2222, -783123685 -> 2272, -783123684 -> 2273
    //   2272: return
    //   2273: aconst_null
    //   2274: getstatic Perryc.c : I
    //   2277: iflt -> 2291
    //   2280: ldc2_w 1804174866
    //   2283: l2i
    //   2284: ldc_w -1435238088
    //   2287: ixor
    //   2288: goto -> 2299
    //   2291: ldc2_w -40670265
    //   2294: l2i
    //   2295: ldc_w 654682228
    //   2298: ixor
    //   2299: ldc2_w -1766336198
    //   2302: l2i
    //   2303: ldc_w 1092529064
    //   2306: ixor
    //   2307: ixor
    //   2308: lookupswitch default -> 5156, 222277921 -> 2336, 374666680 -> 2291
    //   2336: astore #4
    //   2338: getstatic Perryc.0 : I
    //   2341: ifle -> 2355
    //   2344: ldc2_w 1941117397
    //   2347: l2i
    //   2348: ldc_w -1119479242
    //   2351: ixor
    //   2352: goto -> 2363
    //   2355: ldc2_w 987173856
    //   2358: l2i
    //   2359: ldc_w 1478946799
    //   2362: ixor
    //   2363: ldc2_w -43035929
    //   2366: l2i
    //   2367: ldc_w 1815134813
    //   2370: ixor
    //   2371: ixor
    //   2372: lookupswitch default -> 5232, -206672715 -> 2400, 1605014361 -> 2355
    //   2400: aload_2
    //   2401: getstatic Perryc.1 : I
    //   2404: ifeq -> 2418
    //   2407: ldc2_w -2136053079
    //   2410: l2i
    //   2411: ldc_w -971014914
    //   2414: ixor
    //   2415: goto -> 2426
    //   2418: ldc2_w -1305952332
    //   2421: l2i
    //   2422: ldc_w -1155513586
    //   2425: ixor
    //   2426: ldc2_w 1131103583
    //   2429: l2i
    //   2430: ldc_w 1800411683
    //   2433: ixor
    //   2434: ixor
    //   2435: lookupswitch default -> 2460, -1318730613 -> 2418, 1854556459 -> 5252
    //   2460: goto -> 2464
    //   2463: athrow
    //   2464: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2469: goto -> 2473
    //   2472: athrow
    //   2473: getstatic Perryc.0 : I
    //   2476: ifle -> 2490
    //   2479: ldc2_w -2032268378
    //   2482: l2i
    //   2483: ldc_w 1785501862
    //   2486: ixor
    //   2487: goto -> 2498
    //   2490: ldc2_w -65629101
    //   2493: l2i
    //   2494: ldc_w -1337115941
    //   2497: ixor
    //   2498: ldc2_w -669835595
    //   2501: l2i
    //   2502: ldc_w 1684561435
    //   2505: ixor
    //   2506: ixor
    //   2507: lookupswitch default -> 2532, -1250057250 -> 2490, 1355404206 -> 5168
    //   2532: astore #5
    //   2534: getstatic Perryc.c : I
    //   2537: iflt -> 2551
    //   2540: ldc2_w -743364561
    //   2543: l2i
    //   2544: ldc_w 1539916228
    //   2547: ixor
    //   2548: goto -> 2559
    //   2551: ldc2_w 1844525974
    //   2554: l2i
    //   2555: ldc_w -635289148
    //   2558: ixor
    //   2559: ldc2_w -1087351592
    //   2562: l2i
    //   2563: ldc_w 586701254
    //   2566: ixor
    //   2567: ixor
    //   2568: lookupswitch default -> 5164, 363881717 -> 2551, 706443084 -> 2596
    //   2596: aload #5
    //   2598: getstatic Perryc.c : I
    //   2601: iflt -> 2615
    //   2604: ldc2_w 1213334469
    //   2607: l2i
    //   2608: ldc_w 1889936479
    //   2611: ixor
    //   2612: goto -> 2623
    //   2615: ldc2_w 2067364079
    //   2618: l2i
    //   2619: ldc_w -1214599288
    //   2622: ixor
    //   2623: ldc2_w 1397652422
    //   2626: l2i
    //   2627: ldc_w 2121593184
    //   2630: ixor
    //   2631: ixor
    //   2632: lookupswitch default -> 5210, -510042687 -> 2660, 365866300 -> 2615
    //   2660: goto -> 2664
    //   2663: athrow
    //   2664: invokeinterface hasNext : ()Z
    //   2669: goto -> 2673
    //   2672: athrow
    //   2673: ifeq -> 2687
    //   2676: ldc2_w -1254787617
    //   2679: l2i
    //   2680: ldc_w -2080339755
    //   2683: ixor
    //   2684: goto -> 2695
    //   2687: ldc2_w 1197848898
    //   2690: l2i
    //   2691: ldc_w 1984971851
    //   2694: ixor
    //   2695: ldc2_w -368465740
    //   2698: l2i
    //   2699: ldc_w 879322135
    //   2702: ixor
    //   2703: ixor
    //   2704: tableswitch default -> 2676, -279629399 -> 2728, -279629398 -> 3933
    //   2728: getstatic Perryc.c : I
    //   2731: iflt -> 2745
    //   2734: ldc2_w -1300011781
    //   2737: l2i
    //   2738: ldc_w 141860202
    //   2741: ixor
    //   2742: goto -> 2753
    //   2745: ldc2_w -2023346864
    //   2748: l2i
    //   2749: ldc_w -26385475
    //   2752: ixor
    //   2753: ldc2_w 1456039417
    //   2756: l2i
    //   2757: ldc_w -2089728224
    //   2760: ixor
    //   2761: ixor
    //   2762: lookupswitch default -> 5200, -1397527500 -> 2788, 1867504456 -> 2745
    //   2788: aload #5
    //   2790: getstatic Perryc.c : I
    //   2793: iflt -> 2807
    //   2796: ldc2_w 2106888717
    //   2799: l2i
    //   2800: ldc_w -1849861758
    //   2803: ixor
    //   2804: goto -> 2815
    //   2807: ldc2_w -1519624944
    //   2810: l2i
    //   2811: ldc_w 995337684
    //   2814: ixor
    //   2815: ldc2_w 615655054
    //   2818: l2i
    //   2819: ldc_w 1318433214
    //   2822: ixor
    //   2823: ixor
    //   2824: lookupswitch default -> 2852, -2045879105 -> 5146, -189928331 -> 2807
    //   2852: goto -> 2856
    //   2855: athrow
    //   2856: invokeinterface next : ()Ljava/lang/Object;
    //   2861: goto -> 2865
    //   2864: athrow
    //   2865: checkcast net/minecraft/util/math/BlockPos
    //   2868: getstatic Perryc.1 : I
    //   2871: ifeq -> 2885
    //   2874: ldc2_w 1459835048
    //   2877: l2i
    //   2878: ldc_w 1785326430
    //   2881: ixor
    //   2882: goto -> 2893
    //   2885: ldc2_w 242768082
    //   2888: l2i
    //   2889: ldc_w -1890370548
    //   2892: ixor
    //   2893: ldc2_w 422764586
    //   2896: l2i
    //   2897: ldc_w -2118283143
    //   2900: ixor
    //   2901: ixor
    //   2902: lookupswitch default -> 5224, -1511666779 -> 2885, 430183565 -> 2928
    //   2928: astore #6
    //   2930: getstatic Perryc.c : I
    //   2933: iflt -> 2947
    //   2936: ldc2_w -624043275
    //   2939: l2i
    //   2940: ldc_w -1536809889
    //   2943: ixor
    //   2944: goto -> 2955
    //   2947: ldc2_w -999615717
    //   2950: l2i
    //   2951: ldc_w 302227148
    //   2954: ixor
    //   2955: ldc2_w -1021460857
    //   2958: l2i
    //   2959: ldc_w 274971942
    //   2962: ixor
    //   2963: ixor
    //   2964: lookupswitch default -> 2992, -1378484981 -> 5148, 1871433848 -> 2947
    //   2992: aload_1
    //   2993: getstatic Perryc.0 : I
    //   2996: ifle -> 3010
    //   2999: ldc2_w 1025591738
    //   3002: l2i
    //   3003: ldc_w 98278277
    //   3006: ixor
    //   3007: goto -> 3018
    //   3010: ldc2_w 155360270
    //   3013: l2i
    //   3014: ldc_w 114770109
    //   3017: ixor
    //   3018: ldc2_w -386169230
    //   3021: l2i
    //   3022: ldc_w 1049385227
    //   3025: ixor
    //   3026: ixor
    //   3027: lookupswitch default -> 5178, -639499318 -> 3052, -292745914 -> 3010
    //   3052: aload #6
    //   3054: getstatic Perryc.1 : I
    //   3057: ifeq -> 3071
    //   3060: ldc2_w -1841340052
    //   3063: l2i
    //   3064: ldc_w 650982161
    //   3067: ixor
    //   3068: goto -> 3079
    //   3071: ldc2_w -2097084199
    //   3074: l2i
    //   3075: ldc_w 1690985726
    //   3078: ixor
    //   3079: ldc2_w 1558971055
    //   3082: l2i
    //   3083: ldc_w 514222735
    //   3086: ixor
    //   3087: ixor
    //   3088: lookupswitch default -> 3116, -262288315 -> 3071, -155698595 -> 5158
    //   3116: goto -> 3120
    //   3119: athrow
    //   3120: invokevirtual func_177958_n : ()I
    //   3123: goto -> 3127
    //   3126: athrow
    //   3127: i2d
    //   3128: getstatic Perryc.c : I
    //   3131: iflt -> 3145
    //   3134: ldc2_w 112405436
    //   3137: l2i
    //   3138: ldc_w -2009334772
    //   3141: ixor
    //   3142: goto -> 3153
    //   3145: ldc2_w -1691053986
    //   3148: l2i
    //   3149: ldc_w 2037525123
    //   3152: ixor
    //   3153: ldc2_w 1223018408
    //   3156: l2i
    //   3157: ldc_w 1607746528
    //   3160: ixor
    //   3161: ixor
    //   3162: lookupswitch default -> 3188, -1715907592 -> 5190, 2102827655 -> 3145
    //   3188: aload #6
    //   3190: getstatic Perryc.1 : I
    //   3193: ifeq -> 3207
    //   3196: ldc2_w -1609726271
    //   3199: l2i
    //   3200: ldc_w -655856327
    //   3203: ixor
    //   3204: goto -> 3215
    //   3207: ldc2_w 1375248242
    //   3210: l2i
    //   3211: ldc_w -59715326
    //   3214: ixor
    //   3215: ldc2_w 73399250
    //   3218: l2i
    //   3219: ldc_w -1566314932
    //   3222: ixor
    //   3223: ixor
    //   3224: lookupswitch default -> 5236, -568721818 -> 3207, 192175086 -> 3252
    //   3252: goto -> 3256
    //   3255: athrow
    //   3256: invokevirtual func_177956_o : ()I
    //   3259: goto -> 3263
    //   3262: athrow
    //   3263: i2d
    //   3264: getstatic Perryc.0 : I
    //   3267: ifle -> 3281
    //   3270: ldc2_w -720353491
    //   3273: l2i
    //   3274: ldc_w 913419584
    //   3277: ixor
    //   3278: goto -> 3289
    //   3281: ldc2_w -1877991431
    //   3284: l2i
    //   3285: ldc_w -981749490
    //   3288: ixor
    //   3289: ldc2_w 170942260
    //   3292: l2i
    //   3293: ldc_w -1965945041
    //   3296: ixor
    //   3297: ixor
    //   3298: lookupswitch default -> 3324, -2127023790 -> 3281, 1669577334 -> 5154
    //   3324: aload #6
    //   3326: getstatic Perryc.0 : I
    //   3329: ifle -> 3343
    //   3332: ldc2_w 867440248
    //   3335: l2i
    //   3336: ldc_w -1407057992
    //   3339: ixor
    //   3340: goto -> 3351
    //   3343: ldc2_w 1465759111
    //   3346: l2i
    //   3347: ldc_w 871851021
    //   3350: ixor
    //   3351: ldc2_w -335859289
    //   3354: l2i
    //   3355: ldc_w -1678288230
    //   3358: ixor
    //   3359: ixor
    //   3360: lookupswitch default -> 3388, -275152131 -> 5218, 839265439 -> 3343
    //   3388: goto -> 3392
    //   3391: athrow
    //   3392: invokevirtual func_177952_p : ()I
    //   3395: goto -> 3399
    //   3398: athrow
    //   3399: i2d
    //   3400: getstatic Perryc.c : I
    //   3403: iflt -> 3417
    //   3406: ldc2_w -392125764
    //   3409: l2i
    //   3410: ldc_w -186139428
    //   3413: ixor
    //   3414: goto -> 3425
    //   3417: ldc2_w 671462228
    //   3420: l2i
    //   3421: ldc_w 856302899
    //   3424: ixor
    //   3425: ldc2_w -636701251
    //   3428: l2i
    //   3429: ldc_w -1853870184
    //   3432: ixor
    //   3433: ixor
    //   3434: lookupswitch default -> 5258, 1350765634 -> 3460, 1472955461 -> 3417
    //   3460: goto -> 3464
    //   3463: athrow
    //   3464: invokevirtual func_70011_f : (DDD)D
    //   3467: goto -> 3471
    //   3470: athrow
    //   3471: getstatic Perryc.c : I
    //   3474: iflt -> 3488
    //   3477: ldc2_w -388079418
    //   3480: l2i
    //   3481: ldc_w -1503747386
    //   3484: ixor
    //   3485: goto -> 3496
    //   3488: ldc2_w -526633887
    //   3491: l2i
    //   3492: ldc_w -1522882534
    //   3495: ixor
    //   3496: ldc2_w 635746995
    //   3499: l2i
    //   3500: ldc_w 902780785
    //   3503: ixor
    //   3504: ixor
    //   3505: lookupswitch default -> 3532, 1588277186 -> 5246, 2025326624 -> 3488
    //   3532: aload_0
    //   3533: getstatic Perryc.c : I
    //   3536: iflt -> 3550
    //   3539: ldc2_w 1693046394
    //   3542: l2i
    //   3543: ldc_w 1717440285
    //   3546: ixor
    //   3547: goto -> 3558
    //   3550: ldc2_w -2017114375
    //   3553: l2i
    //   3554: ldc_w 1986729000
    //   3557: ixor
    //   3558: ldc2_w 1957568527
    //   3561: l2i
    //   3562: ldc_w -428895835
    //   3565: ixor
    //   3566: ixor
    //   3567: lookupswitch default -> 3592, -1871288115 -> 5144, 1815517704 -> 3550
    //   3592: getfield distance : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3595: getstatic Perryc.0 : I
    //   3598: ifle -> 3612
    //   3601: ldc2_w -16637642
    //   3604: l2i
    //   3605: ldc_w 157435510
    //   3608: ixor
    //   3609: goto -> 3620
    //   3612: ldc2_w -1606103618
    //   3615: l2i
    //   3616: ldc_w -1941356342
    //   3619: ixor
    //   3620: ldc2_w 682292425
    //   3623: l2i
    //   3624: ldc_w 859767912
    //   3627: ixor
    //   3628: ixor
    //   3629: lookupswitch default -> 5214, -302671903 -> 3612, 932740565 -> 3656
    //   3656: goto -> 3660
    //   3659: athrow
    //   3660: invokevirtual getValue : ()Ljava/lang/Object;
    //   3663: goto -> 3667
    //   3666: athrow
    //   3667: checkcast java/lang/Float
    //   3670: getstatic Perryc.0 : I
    //   3673: ifle -> 3687
    //   3676: ldc2_w 6892066
    //   3679: l2i
    //   3680: ldc_w 1174915080
    //   3683: ixor
    //   3684: goto -> 3695
    //   3687: ldc2_w 1938729159
    //   3690: l2i
    //   3691: ldc_w 368082282
    //   3694: ixor
    //   3695: ldc2_w -1679725472
    //   3698: l2i
    //   3699: ldc_w 1967205659
    //   3702: ixor
    //   3703: ixor
    //   3704: lookupswitch default -> 3732, -1462852783 -> 5184, 1330453206 -> 3687
    //   3732: goto -> 3736
    //   3735: athrow
    //   3736: invokevirtual floatValue : ()F
    //   3739: goto -> 3743
    //   3742: athrow
    //   3743: f2d
    //   3744: dcmpl
    //   3745: iflt -> 3759
    //   3748: ldc2_w -1800062629
    //   3751: l2i
    //   3752: ldc_w -339846314
    //   3755: ixor
    //   3756: goto -> 3767
    //   3759: ldc2_w 1895460421
    //   3762: l2i
    //   3763: ldc_w 267455607
    //   3766: ixor
    //   3767: ldc2_w 2052512200
    //   3770: l2i
    //   3771: ldc_w -1360447846
    //   3774: ixor
    //   3775: ixor
    //   3776: tableswitch default -> 3748, -1414230689 -> 3800, -1414230688 -> 3803
    //   3800: goto -> 2534
    //   3803: getstatic Perryc.1 : I
    //   3806: ifeq -> 3820
    //   3809: ldc2_w -870623212
    //   3812: l2i
    //   3813: ldc_w -730751486
    //   3816: ixor
    //   3817: goto -> 3828
    //   3820: ldc2_w -1744903004
    //   3823: l2i
    //   3824: ldc_w -1018451029
    //   3827: ixor
    //   3828: ldc2_w 1418160508
    //   3831: l2i
    //   3832: ldc_w -1445815217
    //   3835: ixor
    //   3836: ixor
    //   3837: lookupswitch default -> 5260, -1444890052 -> 3864, -448842971 -> 3820
    //   3864: aload #6
    //   3866: getstatic Perryc.1 : I
    //   3869: ifeq -> 3883
    //   3872: ldc2_w -1545889260
    //   3875: l2i
    //   3876: ldc_w -2021546936
    //   3879: ixor
    //   3880: goto -> 3891
    //   3883: ldc2_w 737615720
    //   3886: l2i
    //   3887: ldc_w -1878505497
    //   3890: ixor
    //   3891: ldc2_w 377068414
    //   3894: l2i
    //   3895: ldc_w -933435470
    //   3898: ixor
    //   3899: ixor
    //   3900: lookupswitch default -> 3928, -92323184 -> 5202, 1357373521 -> 3883
    //   3928: astore #4
    //   3930: goto -> 2534
    //   3933: getstatic Perryc.1 : I
    //   3936: ifeq -> 3950
    //   3939: ldc2_w 723472252
    //   3942: l2i
    //   3943: ldc_w 2006880228
    //   3946: ixor
    //   3947: goto -> 3958
    //   3950: ldc2_w 1088866723
    //   3953: l2i
    //   3954: ldc_w 463808688
    //   3957: ixor
    //   3958: ldc2_w -98110148
    //   3961: l2i
    //   3962: ldc_w 1609780387
    //   3965: ixor
    //   3966: ixor
    //   3967: lookupswitch default -> 5220, -111904505 -> 3950, -23701364 -> 3992
    //   3992: aload #4
    //   3994: ifnull -> 4008
    //   3997: ldc2_w 1062707392
    //   4000: l2i
    //   4001: ldc_w -2061744209
    //   4004: ixor
    //   4005: goto -> 4016
    //   4008: ldc2_w -675694905
    //   4011: l2i
    //   4012: ldc_w 1844597161
    //   4015: ixor
    //   4016: ldc2_w 571926295
    //   4019: l2i
    //   4020: ldc_w 291310982
    //   4023: ixor
    //   4024: ixor
    //   4025: tableswitch default -> 3997, -1996485122 -> 4048, -1996485121 -> 5123
    //   4048: getstatic Perryc.c : I
    //   4051: iflt -> 4065
    //   4054: ldc2_w 1917682082
    //   4057: l2i
    //   4058: ldc_w -1899037269
    //   4061: ixor
    //   4062: goto -> 4073
    //   4065: ldc2_w 159802951
    //   4068: l2i
    //   4069: ldc_w 350856229
    //   4072: ixor
    //   4073: ldc2_w -1380106489
    //   4076: l2i
    //   4077: ldc_w -425581191
    //   4080: ixor
    //   4081: ixor
    //   4082: lookupswitch default -> 4108, -1214486921 -> 5194, -70248760 -> 4065
    //   4108: aload_0
    //   4109: pop
    //   4110: getstatic Perryc.c : I
    //   4113: iflt -> 4127
    //   4116: ldc2_w -1225272085
    //   4119: l2i
    //   4120: ldc_w -2058174880
    //   4123: ixor
    //   4124: goto -> 4135
    //   4127: ldc2_w 1899672018
    //   4130: l2i
    //   4131: ldc_w 1408631743
    //   4134: ixor
    //   4135: ldc2_w 1641059534
    //   4138: l2i
    //   4139: ldc_w -262882905
    //   4142: ixor
    //   4143: ixor
    //   4144: lookupswitch default -> 5132, -1574877214 -> 4127, -1287086332 -> 4172
    //   4172: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   4175: getstatic Perryc.1 : I
    //   4178: ifeq -> 4192
    //   4181: ldc2_w -1218870339
    //   4184: l2i
    //   4185: ldc_w -1833666144
    //   4188: ixor
    //   4189: goto -> 4200
    //   4192: ldc2_w 736535084
    //   4195: l2i
    //   4196: ldc_w 19987888
    //   4199: ixor
    //   4200: ldc2_w 1884460881
    //   4203: l2i
    //   4204: ldc_w -892300824
    //   4207: ixor
    //   4208: ixor
    //   4209: lookupswitch default -> 5262, -1873520347 -> 4236, -1620050780 -> 4192
    //   4236: goto -> 4240
    //   4239: athrow
    //   4240: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   4243: goto -> 4247
    //   4246: athrow
    //   4247: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   4250: dup
    //   4251: getstatic Perryc.0 : I
    //   4254: ifle -> 4268
    //   4257: ldc2_w -2121762470
    //   4260: l2i
    //   4261: ldc_w 2079496854
    //   4264: ixor
    //   4265: goto -> 4276
    //   4268: ldc2_w 1214455376
    //   4271: l2i
    //   4272: ldc_w -529542120
    //   4275: ixor
    //   4276: ldc2_w 1162599298
    //   4279: l2i
    //   4280: ldc_w 1716392777
    //   4283: ixor
    //   4284: ixor
    //   4285: lookupswitch default -> 4312, -645977337 -> 5126, 768840755 -> 4268
    //   4312: aload_0
    //   4313: getstatic Perryc.c : I
    //   4316: iflt -> 4330
    //   4319: ldc2_w -1410407435
    //   4322: l2i
    //   4323: ldc_w -2092860455
    //   4326: ixor
    //   4327: goto -> 4338
    //   4330: ldc2_w 1772339987
    //   4333: l2i
    //   4334: ldc_w 227346631
    //   4337: ixor
    //   4338: ldc2_w 828477807
    //   4341: l2i
    //   4342: ldc_w 623188229
    //   4345: ixor
    //   4346: ixor
    //   4347: lookupswitch default -> 4372, 1022038086 -> 5140, 1833505092 -> 4330
    //   4372: getfield blockSlot : I
    //   4375: getstatic Perryc.0 : I
    //   4378: ifle -> 4392
    //   4381: ldc2_w 2023046781
    //   4384: l2i
    //   4385: ldc_w 138129677
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w 1636632790
    //   4395: l2i
    //   4396: ldc_w 894124025
    //   4399: ixor
    //   4400: ldc2_w -1442160682
    //   4403: l2i
    //   4404: ldc_w 435332213
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 4436, -1403739877 -> 4392, -1017744173 -> 5228
    //   4436: goto -> 4440
    //   4439: athrow
    //   4440: invokespecial <init> : (I)V
    //   4443: goto -> 4447
    //   4446: athrow
    //   4447: getstatic Perryc.0 : I
    //   4450: ifle -> 4464
    //   4453: ldc2_w -282882784
    //   4456: l2i
    //   4457: ldc_w -997239937
    //   4460: ixor
    //   4461: goto -> 4472
    //   4464: ldc2_w 594892313
    //   4467: l2i
    //   4468: ldc_w 1201468791
    //   4471: ixor
    //   4472: ldc2_w 1071830178
    //   4475: l2i
    //   4476: ldc_w 1585841709
    //   4479: ixor
    //   4480: ixor
    //   4481: lookupswitch default -> 4508, 52545165 -> 4464, 1254624464 -> 5216
    //   4508: goto -> 4512
    //   4511: athrow
    //   4512: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   4515: goto -> 4519
    //   4518: athrow
    //   4519: getstatic Perryc.0 : I
    //   4522: ifle -> 4536
    //   4525: ldc2_w -2105530861
    //   4528: l2i
    //   4529: ldc_w 1815289493
    //   4532: ixor
    //   4533: goto -> 4544
    //   4536: ldc2_w 475090849
    //   4539: l2i
    //   4540: ldc_w -51498316
    //   4543: ixor
    //   4544: ldc2_w 711218577
    //   4547: l2i
    //   4548: ldc_w 296231891
    //   4551: ixor
    //   4552: ixor
    //   4553: lookupswitch default -> 4580, -713077052 -> 5170, 293908162 -> 4536
    //   4580: aload_0
    //   4581: getstatic Perryc.0 : I
    //   4584: ifle -> 4598
    //   4587: ldc2_w 915854824
    //   4590: l2i
    //   4591: ldc_w 47699957
    //   4594: ixor
    //   4595: goto -> 4606
    //   4598: ldc2_w 370087052
    //   4601: l2i
    //   4602: ldc_w -61833753
    //   4605: ixor
    //   4606: ldc2_w 691643657
    //   4609: l2i
    //   4610: ldc_w 1716080803
    //   4613: ixor
    //   4614: ixor
    //   4615: lookupswitch default -> 5172, -1523606335 -> 4640, 2066872247 -> 4598
    //   4640: aload #4
    //   4642: getstatic Perryc.c : I
    //   4645: iflt -> 4659
    //   4648: ldc2_w 1042683609
    //   4651: l2i
    //   4652: ldc_w -1961170617
    //   4655: ixor
    //   4656: goto -> 4667
    //   4659: ldc2_w 1780475072
    //   4662: l2i
    //   4663: ldc_w 2029442918
    //   4666: ixor
    //   4667: ldc2_w -906745815
    //   4670: l2i
    //   4671: ldc_w -2077503133
    //   4674: ixor
    //   4675: ixor
    //   4676: lookupswitch default -> 5160, -119339308 -> 4659, 1597426412 -> 4704
    //   4704: goto -> 4708
    //   4707: athrow
    //   4708: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   4711: goto -> 4715
    //   4714: athrow
    //   4715: getstatic Perryc.1 : I
    //   4718: ifeq -> 4732
    //   4721: ldc2_w -2099410466
    //   4724: l2i
    //   4725: ldc_w 247859443
    //   4728: ixor
    //   4729: goto -> 4740
    //   4732: ldc2_w -229362860
    //   4735: l2i
    //   4736: ldc_w -138080804
    //   4739: ixor
    //   4740: ldc2_w -1423053555
    //   4743: l2i
    //   4744: ldc_w -752080204
    //   4747: ixor
    //   4748: ixor
    //   4749: lookupswitch default -> 4776, -1777293732 -> 4732, -199604588 -> 5256
    //   4776: aload_0
    //   4777: pop
    //   4778: getstatic Perryc.0 : I
    //   4781: ifle -> 4795
    //   4784: ldc2_w 143182132
    //   4787: l2i
    //   4788: ldc_w 1001946334
    //   4791: ixor
    //   4792: goto -> 4803
    //   4795: ldc2_w 1087300527
    //   4798: l2i
    //   4799: ldc_w 765778484
    //   4802: ixor
    //   4803: ldc2_w 2003471807
    //   4806: l2i
    //   4807: ldc_w 1522289424
    //   4810: ixor
    //   4811: ixor
    //   4812: lookupswitch default -> 4840, 518419269 -> 5242, 1536082412 -> 4795
    //   4840: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   4843: getstatic Perryc.c : I
    //   4846: iflt -> 4860
    //   4849: ldc2_w -447368323
    //   4852: l2i
    //   4853: ldc_w 730697956
    //   4856: ixor
    //   4857: goto -> 4868
    //   4860: ldc2_w -2098055824
    //   4863: l2i
    //   4864: ldc_w 1494463676
    //   4867: ixor
    //   4868: ldc2_w 35808181
    //   4871: l2i
    //   4872: ldc_w -429136407
    //   4875: ixor
    //   4876: ixor
    //   4877: lookupswitch default -> 4904, -2104454432 -> 4860, 714188229 -> 5130
    //   4904: goto -> 4908
    //   4907: athrow
    //   4908: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   4911: goto -> 4915
    //   4914: athrow
    //   4915: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   4918: dup
    //   4919: getstatic Perryc.c : I
    //   4922: iflt -> 4936
    //   4925: ldc2_w -1607254842
    //   4928: l2i
    //   4929: ldc_w -1143285840
    //   4932: ixor
    //   4933: goto -> 4944
    //   4936: ldc2_w 1243934207
    //   4939: l2i
    //   4940: ldc_w 1932520278
    //   4943: ixor
    //   4944: ldc2_w -1927664434
    //   4947: l2i
    //   4948: ldc_w 62456299
    //   4951: ixor
    //   4952: ixor
    //   4953: lookupswitch default -> 5162, -1790261677 -> 4936, -1213715572 -> 4980
    //   4980: iload_3
    //   4981: getstatic Perryc.c : I
    //   4984: iflt -> 4998
    //   4987: ldc2_w -1617676635
    //   4990: l2i
    //   4991: ldc_w -1321483159
    //   4994: ixor
    //   4995: goto -> 5006
    //   4998: ldc2_w 1998797161
    //   5001: l2i
    //   5002: ldc_w 2136513969
    //   5005: ixor
    //   5006: ldc2_w -1906756007
    //   5009: l2i
    //   5010: ldc_w -1881559879
    //   5013: ixor
    //   5014: ixor
    //   5015: lookupswitch default -> 5234, 167460408 -> 5040, 791636012 -> 4998
    //   5040: goto -> 5044
    //   5043: athrow
    //   5044: invokespecial <init> : (I)V
    //   5047: goto -> 5051
    //   5050: athrow
    //   5051: getstatic Perryc.1 : I
    //   5054: ifeq -> 5068
    //   5057: ldc2_w -702496557
    //   5060: l2i
    //   5061: ldc_w -35202506
    //   5064: ixor
    //   5065: goto -> 5076
    //   5068: ldc2_w -867435883
    //   5071: l2i
    //   5072: ldc_w 1436930098
    //   5075: ixor
    //   5076: ldc2_w -291471555
    //   5079: l2i
    //   5080: ldc_w -1940159697
    //   5083: ixor
    //   5084: ixor
    //   5085: lookupswitch default -> 5112, 1228793591 -> 5196, 1513683925 -> 5068
    //   5112: goto -> 5116
    //   5115: athrow
    //   5116: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   5119: goto -> 5123
    //   5122: athrow
    //   5123: return
    //   5124: aconst_null
    //   5125: athrow
    //   5126: aconst_null
    //   5127: athrow
    //   5128: aconst_null
    //   5129: athrow
    //   5130: aconst_null
    //   5131: athrow
    //   5132: aconst_null
    //   5133: athrow
    //   5134: aconst_null
    //   5135: athrow
    //   5136: aconst_null
    //   5137: athrow
    //   5138: aconst_null
    //   5139: athrow
    //   5140: aconst_null
    //   5141: athrow
    //   5142: aconst_null
    //   5143: athrow
    //   5144: aconst_null
    //   5145: athrow
    //   5146: aconst_null
    //   5147: athrow
    //   5148: aconst_null
    //   5149: athrow
    //   5150: aconst_null
    //   5151: athrow
    //   5152: aconst_null
    //   5153: athrow
    //   5154: aconst_null
    //   5155: athrow
    //   5156: aconst_null
    //   5157: athrow
    //   5158: aconst_null
    //   5159: athrow
    //   5160: aconst_null
    //   5161: athrow
    //   5162: aconst_null
    //   5163: athrow
    //   5164: aconst_null
    //   5165: athrow
    //   5166: aconst_null
    //   5167: athrow
    //   5168: aconst_null
    //   5169: athrow
    //   5170: aconst_null
    //   5171: athrow
    //   5172: aconst_null
    //   5173: athrow
    //   5174: aconst_null
    //   5175: athrow
    //   5176: aconst_null
    //   5177: athrow
    //   5178: aconst_null
    //   5179: athrow
    //   5180: aconst_null
    //   5181: athrow
    //   5182: aconst_null
    //   5183: athrow
    //   5184: aconst_null
    //   5185: athrow
    //   5186: aconst_null
    //   5187: athrow
    //   5188: aconst_null
    //   5189: athrow
    //   5190: aconst_null
    //   5191: athrow
    //   5192: aconst_null
    //   5193: athrow
    //   5194: aconst_null
    //   5195: athrow
    //   5196: aconst_null
    //   5197: athrow
    //   5198: aconst_null
    //   5199: athrow
    //   5200: aconst_null
    //   5201: athrow
    //   5202: aconst_null
    //   5203: athrow
    //   5204: aconst_null
    //   5205: athrow
    //   5206: aconst_null
    //   5207: athrow
    //   5208: aconst_null
    //   5209: athrow
    //   5210: aconst_null
    //   5211: athrow
    //   5212: aconst_null
    //   5213: athrow
    //   5214: aconst_null
    //   5215: athrow
    //   5216: aconst_null
    //   5217: athrow
    //   5218: aconst_null
    //   5219: athrow
    //   5220: aconst_null
    //   5221: athrow
    //   5222: aconst_null
    //   5223: athrow
    //   5224: aconst_null
    //   5225: athrow
    //   5226: aconst_null
    //   5227: athrow
    //   5228: aconst_null
    //   5229: athrow
    //   5230: aconst_null
    //   5231: athrow
    //   5232: aconst_null
    //   5233: athrow
    //   5234: aconst_null
    //   5235: athrow
    //   5236: aconst_null
    //   5237: athrow
    //   5238: aconst_null
    //   5239: athrow
    //   5240: aconst_null
    //   5241: athrow
    //   5242: aconst_null
    //   5243: athrow
    //   5244: aconst_null
    //   5245: athrow
    //   5246: aconst_null
    //   5247: athrow
    //   5248: aconst_null
    //   5249: athrow
    //   5250: aconst_null
    //   5251: athrow
    //   5252: aconst_null
    //   5253: athrow
    //   5254: aconst_null
    //   5255: athrow
    //   5256: aconst_null
    //   5257: athrow
    //   5258: aconst_null
    //   5259: athrow
    //   5260: aconst_null
    //   5261: athrow
    //   5262: aconst_null
    //   5263: athrow
    //   5264: pop
    //   5265: goto -> 24
    //   5268: pop
    //   5269: aconst_null
    //   5270: goto -> 5264
    //   5273: dup
    //   5274: ifnull -> 5264
    //   5277: checkcast java/lang/Throwable
    //   5280: athrow
    //   5281: dup
    //   5282: ifnull -> 5268
    //   5285: checkcast java/lang/Throwable
    //   5288: athrow
    //   5289: aconst_null
    //   5290: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2930	1000	6	pos	Lnet/minecraft/util/math/BlockPos;
    //   353	4770	1	currentTarget	Lnet/minecraft/entity/player/EntityPlayer;
    //   845	4278	2	holes	Ljava/util/List;
    //   1757	3366	3	lastSlot	I
    //   2338	2785	4	hole	Lnet/minecraft/util/math/BlockPos;
    //   24	5100	0	this	Lbigname/zprestige/webhack/features/modules/Combat/HoleFiller;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   845	4278	2	holes	Ljava/util/List<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	5273	java/lang/ArithmeticException
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	java/lang/ArrayIndexOutOfBoundsException
    //   148	154	3	java/lang/ClassCastException
    //   283	290	290	finally
    //   283	290	290	finally
    //   283	290	3	finally
    //   283	290	290	java/util/ConcurrentModificationException
    //   283	290	283	java/lang/NegativeArraySizeException
    //   591	598	598	finally
    //   591	598	3	java/lang/ArrayIndexOutOfBoundsException
    //   591	598	3	finally
    //   591	598	591	finally
    //   592	598	598	java/lang/NegativeArraySizeException
    //   775	782	782	finally
    //   775	782	3	finally
    //   775	782	775	finally
    //   776	782	782	java/lang/ArithmeticException
    //   776	782	782	java/util/ConcurrentModificationException
    //   1031	1038	1038	finally
    //   1031	1038	1031	java/lang/StringIndexOutOfBoundsException
    //   1031	1038	1038	java/lang/NumberFormatException
    //   1032	1038	3	java/util/ConcurrentModificationException
    //   1032	1038	3	java/lang/ArithmeticException
    //   1107	1114	1114	finally
    //   1107	1114	1107	finally
    //   1107	1114	1107	java/lang/IndexOutOfBoundsException
    //   1107	1114	3	finally
    //   1108	1114	3	java/lang/UnsupportedOperationException
    //   1179	1188	1188	finally
    //   1179	1188	1179	finally
    //   1180	1188	1188	finally
    //   1180	1188	1179	finally
    //   1180	1188	1179	java/lang/AssertionError
    //   1311	1320	1320	finally
    //   1311	1320	1320	java/util/ConcurrentModificationException
    //   1311	1320	1311	finally
    //   1312	1320	1320	java/lang/IndexOutOfBoundsException
    //   1312	1320	3	finally
    //   1943	1950	1950	finally
    //   1943	1950	1943	finally
    //   1944	1950	1943	finally
    //   1944	1950	1950	finally
    //   1944	1950	1943	java/lang/ArrayIndexOutOfBoundsException
    //   2015	2022	2022	finally
    //   2015	2022	2015	finally
    //   2015	2022	3	finally
    //   2016	2022	3	finally
    //   2016	2022	2022	java/lang/NumberFormatException
    //   2463	2472	2472	finally
    //   2463	2472	2472	finally
    //   2463	2472	2463	java/util/ConcurrentModificationException
    //   2464	2472	2463	finally
    //   2464	2472	2463	finally
    //   2663	2672	2672	finally
    //   2663	2672	3	finally
    //   2663	2672	2663	finally
    //   2664	2672	3	finally
    //   2664	2672	2663	finally
    //   2855	2864	2864	finally
    //   2855	2864	2864	java/lang/StringIndexOutOfBoundsException
    //   2856	2864	2864	finally
    //   2856	2864	2864	finally
    //   2856	2864	2855	java/lang/NumberFormatException
    //   3120	3126	3126	finally
    //   3120	3126	3126	finally
    //   3120	3126	3126	java/lang/ArithmeticException
    //   3120	3126	3126	java/lang/NumberFormatException
    //   3120	3126	3126	java/lang/ArithmeticException
    //   3256	3262	3262	finally
    //   3256	3262	3262	java/lang/ArithmeticException
    //   3256	3262	3	finally
    //   3256	3262	3	java/util/ConcurrentModificationException
    //   3256	3262	3262	java/util/ConcurrentModificationException
    //   3391	3398	3398	finally
    //   3391	3398	3391	finally
    //   3391	3398	3	finally
    //   3392	3398	3391	finally
    //   3392	3398	3391	java/lang/NumberFormatException
    //   3463	3470	3470	finally
    //   3463	3470	3	finally
    //   3463	3470	3463	finally
    //   3464	3470	3470	finally
    //   3464	3470	3463	finally
    //   3659	3666	3666	finally
    //   3659	3666	3659	finally
    //   3659	3666	3659	java/lang/StringIndexOutOfBoundsException
    //   3659	3666	3	finally
    //   3660	3666	3659	finally
    //   3735	3742	3742	finally
    //   3735	3742	3735	finally
    //   3735	3742	3742	java/util/ConcurrentModificationException
    //   3736	3742	3735	java/lang/NegativeArraySizeException
    //   3736	3742	3735	finally
    //   4239	4246	4246	finally
    //   4239	4246	4239	java/lang/AssertionError
    //   4239	4246	4239	java/lang/ArrayIndexOutOfBoundsException
    //   4239	4246	3	java/lang/IndexOutOfBoundsException
    //   4240	4246	3	finally
    //   4440	4446	4446	finally
    //   4440	4446	3	finally
    //   4440	4446	4446	finally
    //   4440	4446	3	java/lang/EnumConstantNotPresentException
    //   4440	4446	3	finally
    //   4511	4518	4518	finally
    //   4512	4518	3	java/lang/NullPointerException
    //   4512	4518	3	java/lang/AssertionError
    //   4512	4518	3	java/lang/IllegalStateException
    //   4512	4518	4511	finally
    //   4707	4714	4714	finally
    //   4707	4714	4707	java/lang/StringIndexOutOfBoundsException
    //   4708	4714	3	java/lang/IllegalStateException
    //   4708	4714	3	java/lang/IllegalStateException
    //   4708	4714	3	java/lang/UnsupportedOperationException
    //   4907	4914	4914	finally
    //   4907	4914	3	finally
    //   4907	4914	4907	finally
    //   4907	4914	3	finally
    //   4908	4914	4914	java/lang/IllegalStateException
    //   5043	5050	5050	finally
    //   5043	5050	3	finally
    //   5043	5050	3	java/lang/IndexOutOfBoundsException
    //   5043	5050	5043	java/lang/StringIndexOutOfBoundsException
    //   5043	5050	5050	finally
    //   5115	5122	5122	finally
    //   5115	5122	5122	java/lang/AssertionError
    //   5115	5122	5115	finally
    //   5115	5122	5122	finally
    //   5116	5122	5122	java/lang/IllegalStateException
    //   5273	5281	5273	java/lang/NullPointerException
    //   5289	5291	3	java/lang/NumberFormatException
  }
  
  public boolean check() {
    return Perry1.4m(this, (int)891129630L ^ 0x4715FB95);
  }
  
  public List calcHoles() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6987
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 6979
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6971
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1832660313
    //   37: l2i
    //   38: ldc_w 1258068806
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 917241182
    //   48: l2i
    //   49: ldc_w 978862630
    //   52: ixor
    //   53: ldc2_w -2093208166
    //   56: l2i
    //   57: ldc_w 1382819604
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -208804419 -> 45, -158286703 -> 6936
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w -574581959
    //   108: l2i
    //   109: ldc_w 1292665726
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1644570563
    //   119: l2i
    //   120: ldc_w 613822395
    //   123: ixor
    //   124: ldc2_w 767449007
    //   127: l2i
    //   128: ldc_w 1007530571
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 6824, -2122320477 -> 116, -1461972382 -> 160
    //   160: astore_1
    //   161: getstatic Perryc.0 : I
    //   164: ifle -> 178
    //   167: ldc2_w -1300820842
    //   170: l2i
    //   171: ldc_w 727759864
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 1664148418
    //   181: l2i
    //   182: ldc_w 316975414
    //   185: ixor
    //   186: ldc2_w 387394240
    //   189: l2i
    //   190: ldc_w -1772682500
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 6892, -258710840 -> 220, 408395602 -> 178
    //   220: aload_0
    //   221: getstatic Perryc.0 : I
    //   224: ifle -> 238
    //   227: ldc2_w -2109637543
    //   230: l2i
    //   231: ldc_w 1765167975
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w 2035170541
    //   241: l2i
    //   242: ldc_w 1657107624
    //   245: ixor
    //   246: ldc2_w 464199816
    //   249: l2i
    //   250: ldc_w -1083394644
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 6798, -1085481631 -> 280, 1336982042 -> 238
    //   280: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -801250798
    //   292: l2i
    //   293: ldc_w 2085874000
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 102587777
    //   303: l2i
    //   304: ldc_w -1257331433
    //   307: ixor
    //   308: ldc2_w -1861917780
    //   311: l2i
    //   312: ldc_w -1746459470
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -1433645988 -> 6934, 1132704325 -> 300
    //   344: goto -> 348
    //   347: athrow
    //   348: invokevirtual getValue : ()Ljava/lang/Object;
    //   351: goto -> 355
    //   354: athrow
    //   355: checkcast java/lang/Float
    //   358: getstatic Perryc.1 : I
    //   361: ifeq -> 375
    //   364: ldc2_w -1205393805
    //   367: l2i
    //   368: ldc_w 577231279
    //   371: ixor
    //   372: goto -> 383
    //   375: ldc2_w 682436745
    //   378: l2i
    //   379: ldc_w -544900292
    //   382: ixor
    //   383: ldc2_w 791770169
    //   386: l2i
    //   387: ldc_w 1611119814
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 6888, -1205953718 -> 420, -713672925 -> 375
    //   420: goto -> 424
    //   423: athrow
    //   424: invokevirtual floatValue : ()F
    //   427: goto -> 431
    //   430: athrow
    //   431: ldc2_w 446042697
    //   434: l2i
    //   435: ldc_w 446042697
    //   438: ixor
    //   439: getstatic Perryc.0 : I
    //   442: ifle -> 456
    //   445: ldc2_w 1557622105
    //   448: l2i
    //   449: ldc_w -81419681
    //   452: ixor
    //   453: goto -> 464
    //   456: ldc2_w -300862959
    //   459: l2i
    //   460: ldc_w -1557067964
    //   463: ixor
    //   464: ldc2_w 1442797271
    //   467: l2i
    //   468: ldc_w 1309907901
    //   471: ixor
    //   472: ixor
    //   473: lookupswitch default -> 500, -1138883988 -> 6938, 1251170127 -> 456
    //   500: goto -> 504
    //   503: athrow
    //   504: invokestatic getCock : (FZ)Ljava/util/List;
    //   507: goto -> 511
    //   510: athrow
    //   511: getstatic Perryc.1 : I
    //   514: ifeq -> 528
    //   517: ldc2_w -825007656
    //   520: l2i
    //   521: ldc_w 1366988435
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w -1142267220
    //   531: l2i
    //   532: ldc_w -1255449897
    //   535: ixor
    //   536: ldc2_w -1245472501
    //   539: l2i
    //   540: ldc_w 52739005
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 6856, -1205462323 -> 572, 693032445 -> 528
    //   572: astore_2
    //   573: ldc2_w 1409694689
    //   576: l2i
    //   577: ldc_w 1409694689
    //   580: ixor
    //   581: getstatic Perryc.1 : I
    //   584: ifeq -> 598
    //   587: ldc2_w -1995096609
    //   590: l2i
    //   591: ldc_w 1284049461
    //   594: ixor
    //   595: goto -> 606
    //   598: ldc2_w -886687158
    //   601: l2i
    //   602: ldc_w 255413959
    //   605: ixor
    //   606: ldc2_w -2102820948
    //   609: l2i
    //   610: ldc_w 1514528022
    //   613: ixor
    //   614: ixor
    //   615: lookupswitch default -> 6954, 485742135 -> 640, 493917520 -> 598
    //   640: istore_3
    //   641: getstatic Perryc.1 : I
    //   644: ifeq -> 658
    //   647: ldc2_w -1964726988
    //   650: l2i
    //   651: ldc_w 1915938374
    //   654: ixor
    //   655: goto -> 666
    //   658: ldc2_w 103007233
    //   661: l2i
    //   662: ldc_w -1209158601
    //   665: ixor
    //   666: ldc2_w 650659535
    //   669: l2i
    //   670: ldc_w 1147411013
    //   673: ixor
    //   674: ixor
    //   675: lookupswitch default -> 6948, -1703272456 -> 658, -748540740 -> 700
    //   700: iload_3
    //   701: getstatic Perryc.0 : I
    //   704: ifle -> 718
    //   707: ldc2_w 1904964545
    //   710: l2i
    //   711: ldc_w 1513075670
    //   714: ixor
    //   715: goto -> 726
    //   718: ldc2_w 512742245
    //   721: l2i
    //   722: ldc_w 340027326
    //   725: ixor
    //   726: ldc2_w 1396519122
    //   729: l2i
    //   730: ldc_w 748924131
    //   733: ixor
    //   734: ixor
    //   735: lookupswitch default -> 6804, 1413110822 -> 718, 1968515306 -> 760
    //   760: aload_2
    //   761: getstatic Perryc.1 : I
    //   764: ifeq -> 778
    //   767: ldc2_w -2005027387
    //   770: l2i
    //   771: ldc_w -1096664915
    //   774: ixor
    //   775: goto -> 786
    //   778: ldc2_w -650922176
    //   781: l2i
    //   782: ldc_w -353010138
    //   785: ixor
    //   786: ldc2_w -977765442
    //   789: l2i
    //   790: ldc_w 1927082300
    //   793: ixor
    //   794: ixor
    //   795: lookupswitch default -> 6858, -2118449174 -> 778, -2069740572 -> 820
    //   820: goto -> 824
    //   823: athrow
    //   824: invokeinterface size : ()I
    //   829: goto -> 833
    //   832: athrow
    //   833: if_icmpge -> 847
    //   836: ldc2_w 440189384
    //   839: l2i
    //   840: ldc_w -1478827107
    //   843: ixor
    //   844: goto -> 855
    //   847: ldc2_w -1729620330
    //   850: l2i
    //   851: ldc_w 621688004
    //   854: ixor
    //   855: ldc2_w -1211764173
    //   858: l2i
    //   859: ldc_w 1246178189
    //   862: ixor
    //   863: ixor
    //   864: tableswitch default -> 836, 1080359915 -> 888, 1080359916 -> 6717
    //   888: getstatic Perryc.1 : I
    //   891: ifeq -> 905
    //   894: ldc2_w 358610952
    //   897: l2i
    //   898: ldc_w 654749774
    //   901: ixor
    //   902: goto -> 913
    //   905: ldc2_w 948250177
    //   908: l2i
    //   909: ldc_w 1540094330
    //   912: ixor
    //   913: ldc2_w -817394989
    //   916: l2i
    //   917: ldc_w -536890425
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 6810, 585199954 -> 905, 1945560623 -> 948
    //   948: aload_2
    //   949: getstatic Perryc.c : I
    //   952: iflt -> 966
    //   955: ldc2_w 4872498
    //   958: l2i
    //   959: ldc_w -707800054
    //   962: ixor
    //   963: goto -> 974
    //   966: ldc2_w 2102531828
    //   969: l2i
    //   970: ldc_w -1214348646
    //   973: ixor
    //   974: ldc2_w 357124457
    //   977: l2i
    //   978: ldc_w -1820016087
    //   981: ixor
    //   982: ixor
    //   983: lookupswitch default -> 1008, -319685078 -> 966, 1397229176 -> 6778
    //   1008: iload_3
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w 1999265404
    //   1018: l2i
    //   1019: ldc_w 540294602
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 417482201
    //   1029: l2i
    //   1030: ldc_w -859942759
    //   1033: ixor
    //   1034: ldc2_w 655940086
    //   1037: l2i
    //   1038: ldc_w -1728367683
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 6850, -386037251 -> 1026, 1807744779 -> 1068
    //   1068: goto -> 1072
    //   1071: athrow
    //   1072: invokeinterface get : (I)Ljava/lang/Object;
    //   1077: goto -> 1081
    //   1080: athrow
    //   1081: checkcast net/minecraft/util/math/BlockPos
    //   1084: getstatic Perryc.1 : I
    //   1087: ifeq -> 1101
    //   1090: ldc2_w -1112283720
    //   1093: l2i
    //   1094: ldc_w -523494027
    //   1097: ixor
    //   1098: goto -> 1109
    //   1101: ldc2_w 1181695994
    //   1104: l2i
    //   1105: ldc_w 1411531446
    //   1108: ixor
    //   1109: ldc2_w 1449903019
    //   1112: l2i
    //   1113: ldc_w -1482568731
    //   1116: ixor
    //   1117: ixor
    //   1118: lookupswitch default -> 6922, -1397362557 -> 1101, -477661950 -> 1144
    //   1144: astore #4
    //   1146: getstatic Perryc.1 : I
    //   1149: ifeq -> 1163
    //   1152: ldc2_w 1237881936
    //   1155: l2i
    //   1156: ldc_w -137432911
    //   1159: ixor
    //   1160: goto -> 1171
    //   1163: ldc2_w -1510566396
    //   1166: l2i
    //   1167: ldc_w 2127000579
    //   1170: ixor
    //   1171: ldc2_w 1077219961
    //   1174: l2i
    //   1175: ldc_w 1959042381
    //   1178: ixor
    //   1179: ixor
    //   1180: lookupswitch default -> 6790, -1963463723 -> 1163, -272601805 -> 1208
    //   1208: aload #4
    //   1210: ldc2_w 801595085
    //   1213: l2i
    //   1214: ldc_w 801595084
    //   1217: ixor
    //   1218: getstatic Perryc.c : I
    //   1221: iflt -> 1235
    //   1224: ldc2_w -710307835
    //   1227: l2i
    //   1228: ldc_w 1124736459
    //   1231: ixor
    //   1232: goto -> 1243
    //   1235: ldc2_w 428811547
    //   1238: l2i
    //   1239: ldc_w 2071450751
    //   1242: ixor
    //   1243: ldc2_w 31728632
    //   1246: l2i
    //   1247: ldc_w -1552210184
    //   1250: ixor
    //   1251: ixor
    //   1252: lookupswitch default -> 6942, -1066929052 -> 1280, 876382414 -> 1235
    //   1280: goto -> 1284
    //   1283: athrow
    //   1284: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   1287: goto -> 1291
    //   1290: athrow
    //   1291: ldc2_w -774422282
    //   1294: l2i
    //   1295: ldc_w -774422281
    //   1298: ixor
    //   1299: if_icmpeq -> 1313
    //   1302: ldc2_w -535783209
    //   1305: l2i
    //   1306: ldc_w -1433876079
    //   1309: ixor
    //   1310: goto -> 1321
    //   1313: ldc2_w -1851394401
    //   1316: l2i
    //   1317: ldc_w -616716326
    //   1320: ixor
    //   1321: ldc2_w -2084457633
    //   1324: l2i
    //   1325: ldc_w -2107752288
    //   1328: ixor
    //   1329: ixor
    //   1330: tableswitch default -> 1302, 1258791609 -> 1352, 1258791610 -> 6711
    //   1352: getstatic Perryc.0 : I
    //   1355: ifle -> 1369
    //   1358: ldc2_w 1025705532
    //   1361: l2i
    //   1362: ldc_w -1253215003
    //   1365: ixor
    //   1366: goto -> 1377
    //   1369: ldc2_w 1824223654
    //   1372: l2i
    //   1373: ldc_w -2076696514
    //   1376: ixor
    //   1377: ldc2_w 609507260
    //   1380: l2i
    //   1381: ldc_w 922918883
    //   1384: ixor
    //   1385: ixor
    //   1386: lookupswitch default -> 1412, -1690781050 -> 6840, 2009648319 -> 1369
    //   1412: aload_0
    //   1413: pop
    //   1414: getstatic Perryc.0 : I
    //   1417: ifle -> 1431
    //   1420: ldc2_w -288953194
    //   1423: l2i
    //   1424: ldc_w -417924857
    //   1427: ixor
    //   1428: goto -> 1439
    //   1431: ldc2_w -718472006
    //   1434: l2i
    //   1435: ldc_w 1968572410
    //   1438: ixor
    //   1439: ldc2_w 1723036009
    //   1442: l2i
    //   1443: ldc_w -652992680
    //   1446: ixor
    //   1447: ixor
    //   1448: lookupswitch default -> 1476, -1233683552 -> 6902, 1666331083 -> 1431
    //   1476: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   1479: getstatic Perryc.1 : I
    //   1482: ifeq -> 1496
    //   1485: ldc2_w -1534338560
    //   1488: l2i
    //   1489: ldc_w 345623321
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w 1291975231
    //   1499: l2i
    //   1500: ldc_w -628119140
    //   1503: ixor
    //   1504: ldc2_w 590011139
    //   1507: l2i
    //   1508: ldc_w 590503622
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 6946, -1751722394 -> 1540, -1341483812 -> 1496
    //   1540: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1543: getstatic Perryc.c : I
    //   1546: iflt -> 1560
    //   1549: ldc2_w -1001814229
    //   1552: l2i
    //   1553: ldc_w 7946797
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w -1565466573
    //   1563: l2i
    //   1564: ldc_w 272369151
    //   1567: ixor
    //   1568: ldc2_w 1176651626
    //   1571: l2i
    //   1572: ldc_w -30352418
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 6854, 178157944 -> 1604, 2082625970 -> 1560
    //   1604: aload #4
    //   1606: getstatic Perryc.1 : I
    //   1609: ifeq -> 1623
    //   1612: ldc2_w 207122548
    //   1615: l2i
    //   1616: ldc_w 1021872181
    //   1619: ixor
    //   1620: goto -> 1631
    //   1623: ldc2_w 137198284
    //   1626: l2i
    //   1627: ldc_w -623951288
    //   1630: ixor
    //   1631: ldc2_w 1507856746
    //   1634: l2i
    //   1635: ldc_w -915961159
    //   1638: ixor
    //   1639: ixor
    //   1640: lookupswitch default -> 1668, -1811999077 -> 1623, -1606982766 -> 6868
    //   1668: goto -> 1672
    //   1671: athrow
    //   1672: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1675: goto -> 1679
    //   1678: athrow
    //   1679: getstatic Perryc.0 : I
    //   1682: ifle -> 1696
    //   1685: ldc2_w 646150722
    //   1688: l2i
    //   1689: ldc_w -2050232353
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 582584937
    //   1699: l2i
    //   1700: ldc_w -1294547792
    //   1703: ixor
    //   1704: ldc2_w 843504077
    //   1707: l2i
    //   1708: ldc_w 2077891948
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, -1176921143 -> 1696, -355184324 -> 6872
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1749: goto -> 1753
    //   1752: athrow
    //   1753: getstatic Perryc.c : I
    //   1756: iflt -> 1770
    //   1759: ldc2_w -1265361850
    //   1762: l2i
    //   1763: ldc_w 1224051692
    //   1766: ixor
    //   1767: goto -> 1778
    //   1770: ldc2_w 158131555
    //   1773: l2i
    //   1774: ldc_w -695908026
    //   1777: ixor
    //   1778: ldc2_w 1625696487
    //   1781: l2i
    //   1782: ldc_w 1957277650
    //   1785: ixor
    //   1786: ixor
    //   1787: lookupswitch default -> 6838, -878302448 -> 1812, -399634273 -> 1770
    //   1812: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   1815: getstatic Perryc.c : I
    //   1818: iflt -> 1832
    //   1821: ldc2_w -553922776
    //   1824: l2i
    //   1825: ldc_w -2072821673
    //   1828: ixor
    //   1829: goto -> 1840
    //   1832: ldc2_w -583511365
    //   1835: l2i
    //   1836: ldc_w 285842064
    //   1839: ixor
    //   1840: ldc2_w 590654688
    //   1843: l2i
    //   1844: ldc_w -336292248
    //   1847: ixor
    //   1848: ixor
    //   1849: lookupswitch default -> 6884, -1840728585 -> 1832, 82965155 -> 1876
    //   1876: goto -> 1880
    //   1879: athrow
    //   1880: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1883: goto -> 1887
    //   1886: athrow
    //   1887: ifeq -> 1901
    //   1890: ldc2_w 543479177
    //   1893: l2i
    //   1894: ldc_w 360189941
    //   1897: ixor
    //   1898: goto -> 1909
    //   1901: ldc2_w -1366319039
    //   1904: l2i
    //   1905: ldc_w -1684833730
    //   1908: ixor
    //   1909: ldc2_w -215696376
    //   1912: l2i
    //   1913: ldc_w -204515355
    //   1916: ixor
    //   1917: ixor
    //   1918: tableswitch default -> 1890, 905392529 -> 1940, 905392530 -> 6711
    //   1940: getstatic Perryc.c : I
    //   1943: iflt -> 1957
    //   1946: ldc2_w 317917702
    //   1949: l2i
    //   1950: ldc_w 1323090854
    //   1953: ixor
    //   1954: goto -> 1965
    //   1957: ldc2_w -169467612
    //   1960: l2i
    //   1961: ldc_w -387342016
    //   1964: ixor
    //   1965: ldc2_w 1968722313
    //   1968: l2i
    //   1969: ldc_w 432755888
    //   1972: ixor
    //   1973: ixor
    //   1974: lookupswitch default -> 6894, 817679513 -> 1957, 1906083165 -> 2000
    //   2000: aload_0
    //   2001: pop
    //   2002: getstatic Perryc.c : I
    //   2005: iflt -> 2019
    //   2008: ldc2_w 1800852452
    //   2011: l2i
    //   2012: ldc_w -549926831
    //   2015: ixor
    //   2016: goto -> 2027
    //   2019: ldc2_w 72578880
    //   2022: l2i
    //   2023: ldc_w -1185880785
    //   2026: ixor
    //   2027: ldc2_w -909567850
    //   2030: l2i
    //   2031: ldc_w 1284908599
    //   2034: ixor
    //   2035: ixor
    //   2036: lookupswitch default -> 2064, -1419608420 -> 2019, 825304340 -> 6842
    //   2064: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   2067: getstatic Perryc.0 : I
    //   2070: ifle -> 2084
    //   2073: ldc2_w -1546328993
    //   2076: l2i
    //   2077: ldc_w 559212561
    //   2080: ixor
    //   2081: goto -> 2092
    //   2084: ldc2_w -2051170890
    //   2087: l2i
    //   2088: ldc_w -1817291730
    //   2091: ixor
    //   2092: ldc2_w -309994575
    //   2095: l2i
    //   2096: ldc_w -1557237286
    //   2099: ixor
    //   2100: ixor
    //   2101: lookupswitch default -> 2128, -1650917800 -> 2084, -869554651 -> 6852
    //   2128: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2131: getstatic Perryc.0 : I
    //   2134: ifle -> 2148
    //   2137: ldc2_w 1981677532
    //   2140: l2i
    //   2141: ldc_w 2123952519
    //   2144: ixor
    //   2145: goto -> 2156
    //   2148: ldc2_w 1975188037
    //   2151: l2i
    //   2152: ldc_w 1951209927
    //   2155: ixor
    //   2156: ldc2_w 636459377
    //   2159: l2i
    //   2160: ldc_w -1911804658
    //   2163: ixor
    //   2164: ixor
    //   2165: lookupswitch default -> 6784, -1553548764 -> 2148, -1441507331 -> 2192
    //   2192: aload #4
    //   2194: ldc2_w 276175157
    //   2197: l2i
    //   2198: ldc_w 276175157
    //   2201: ixor
    //   2202: ldc2_w -54469486
    //   2205: l2i
    //   2206: ldc_w -54469485
    //   2209: ixor
    //   2210: ldc2_w -1724561437
    //   2213: l2i
    //   2214: ldc_w -1724561437
    //   2217: ixor
    //   2218: getstatic Perryc.c : I
    //   2221: iflt -> 2235
    //   2224: ldc2_w -1909657582
    //   2227: l2i
    //   2228: ldc_w -595506648
    //   2231: ixor
    //   2232: goto -> 2243
    //   2235: ldc2_w -1222410691
    //   2238: l2i
    //   2239: ldc_w -869623945
    //   2242: ixor
    //   2243: ldc2_w 331871806
    //   2246: l2i
    //   2247: ldc_w -1152408286
    //   2250: ixor
    //   2251: ixor
    //   2252: lookupswitch default -> 6926, -746472874 -> 2280, -98178778 -> 2235
    //   2280: goto -> 2284
    //   2283: athrow
    //   2284: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   2287: goto -> 2291
    //   2290: athrow
    //   2291: getstatic Perryc.0 : I
    //   2294: ifle -> 2308
    //   2297: ldc2_w 175422003
    //   2300: l2i
    //   2301: ldc_w 1600013855
    //   2304: ixor
    //   2305: goto -> 2316
    //   2308: ldc2_w -1254559623
    //   2311: l2i
    //   2312: ldc_w 1988601836
    //   2315: ixor
    //   2316: ldc2_w 724618255
    //   2319: l2i
    //   2320: ldc_w 1491901959
    //   2323: ixor
    //   2324: ixor
    //   2325: lookupswitch default -> 2352, -919826862 -> 2308, 653700644 -> 6956
    //   2352: goto -> 2356
    //   2355: athrow
    //   2356: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2359: goto -> 2363
    //   2362: athrow
    //   2363: getstatic Perryc.0 : I
    //   2366: ifle -> 2380
    //   2369: ldc2_w 703685693
    //   2372: l2i
    //   2373: ldc_w 1550625114
    //   2376: ixor
    //   2377: goto -> 2388
    //   2380: ldc2_w 912540451
    //   2383: l2i
    //   2384: ldc_w 1408203100
    //   2387: ixor
    //   2388: ldc2_w -1853482199
    //   2391: l2i
    //   2392: ldc_w 725651887
    //   2395: ixor
    //   2396: ixor
    //   2397: lookupswitch default -> 2424, -816101407 -> 6918, 228822280 -> 2380
    //   2424: goto -> 2428
    //   2427: athrow
    //   2428: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2433: goto -> 2437
    //   2436: athrow
    //   2437: getstatic Perryc.0 : I
    //   2440: ifle -> 2454
    //   2443: ldc2_w -1674899061
    //   2446: l2i
    //   2447: ldc_w -1797975272
    //   2450: ixor
    //   2451: goto -> 2462
    //   2454: ldc2_w -1610372505
    //   2457: l2i
    //   2458: ldc_w 1104833927
    //   2461: ixor
    //   2462: ldc2_w -866669138
    //   2465: l2i
    //   2466: ldc_w 1462069909
    //   2469: ixor
    //   2470: ixor
    //   2471: lookupswitch default -> 2496, -1819490904 -> 6828, 874857776 -> 2454
    //   2496: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   2499: getstatic Perryc.c : I
    //   2502: iflt -> 2516
    //   2505: ldc2_w 2035345952
    //   2508: l2i
    //   2509: ldc_w -1779640328
    //   2512: ixor
    //   2513: goto -> 2524
    //   2516: ldc2_w -1396023567
    //   2519: l2i
    //   2520: ldc_w -1997595572
    //   2523: ixor
    //   2524: ldc2_w -268761844
    //   2527: l2i
    //   2528: ldc_w -1858178024
    //   2531: ixor
    //   2532: ixor
    //   2533: lookupswitch default -> 6816, -1837544244 -> 2516, 1524642729 -> 2560
    //   2560: goto -> 2564
    //   2563: athrow
    //   2564: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2567: goto -> 2571
    //   2570: athrow
    //   2571: ifeq -> 2585
    //   2574: ldc2_w 1893886508
    //   2577: l2i
    //   2578: ldc_w 1701939641
    //   2581: ixor
    //   2582: goto -> 2593
    //   2585: ldc2_w -1577507772
    //   2588: l2i
    //   2589: ldc_w -1268070448
    //   2592: ixor
    //   2593: ldc2_w -1013191816
    //   2596: l2i
    //   2597: ldc_w 625507873
    //   2600: ixor
    //   2601: ixor
    //   2602: tableswitch default -> 2574, -213879092 -> 2624, -213879091 -> 6711
    //   2624: getstatic Perryc.1 : I
    //   2627: ifeq -> 2641
    //   2630: ldc2_w 1960037586
    //   2633: l2i
    //   2634: ldc_w 975013492
    //   2637: ixor
    //   2638: goto -> 2649
    //   2641: ldc2_w -657742773
    //   2644: l2i
    //   2645: ldc_w -1207288761
    //   2648: ixor
    //   2649: ldc2_w -868828762
    //   2652: l2i
    //   2653: ldc_w 2013042295
    //   2656: ixor
    //   2657: ixor
    //   2658: lookupswitch default -> 6876, -619989027 -> 2684, -184261257 -> 2641
    //   2684: aload_0
    //   2685: pop
    //   2686: getstatic Perryc.0 : I
    //   2689: ifle -> 2703
    //   2692: ldc2_w 1169339209
    //   2695: l2i
    //   2696: ldc_w 1286818392
    //   2699: ixor
    //   2700: goto -> 2711
    //   2703: ldc2_w -1252600513
    //   2706: l2i
    //   2707: ldc_w 1454157851
    //   2710: ixor
    //   2711: ldc2_w 30196775
    //   2714: l2i
    //   2715: ldc_w -64268091
    //   2718: ixor
    //   2719: ixor
    //   2720: lookupswitch default -> 2748, -186227213 -> 6832, 1934665614 -> 2703
    //   2748: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   2751: getstatic Perryc.0 : I
    //   2754: ifle -> 2768
    //   2757: ldc2_w -212097687
    //   2760: l2i
    //   2761: ldc_w -144523673
    //   2764: ixor
    //   2765: goto -> 2776
    //   2768: ldc2_w 322770117
    //   2771: l2i
    //   2772: ldc_w 1368998540
    //   2775: ixor
    //   2776: ldc2_w -1917490130
    //   2779: l2i
    //   2780: ldc_w 114747232
    //   2783: ixor
    //   2784: ixor
    //   2785: lookupswitch default -> 6820, -1889890240 -> 2768, -909648633 -> 2812
    //   2812: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2815: getstatic Perryc.c : I
    //   2818: iflt -> 2832
    //   2821: ldc2_w -385551266
    //   2824: l2i
    //   2825: ldc_w 616588524
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w 1937959835
    //   2835: l2i
    //   2836: ldc_w 1126039959
    //   2839: ixor
    //   2840: ldc2_w -1903261880
    //   2843: l2i
    //   2844: ldc_w -1792063810
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 6882, -698003132 -> 2832, 725429242 -> 2876
    //   2876: aload #4
    //   2878: ldc2_w -507793400
    //   2881: l2i
    //   2882: ldc_w -507793400
    //   2885: ixor
    //   2886: ldc2_w -597387971
    //   2889: l2i
    //   2890: ldc_w -597387969
    //   2893: ixor
    //   2894: ldc2_w 2138425332
    //   2897: l2i
    //   2898: ldc_w 2138425332
    //   2901: ixor
    //   2902: getstatic Perryc.0 : I
    //   2905: ifle -> 2919
    //   2908: ldc2_w -262454249
    //   2911: l2i
    //   2912: ldc_w -303429613
    //   2915: ixor
    //   2916: goto -> 2927
    //   2919: ldc2_w 417580121
    //   2922: l2i
    //   2923: ldc_w 1812238280
    //   2926: ixor
    //   2927: ldc2_w -1771780164
    //   2930: l2i
    //   2931: ldc_w 252398315
    //   2934: ixor
    //   2935: ixor
    //   2936: lookupswitch default -> 6782, -2065776301 -> 2919, -309803322 -> 2964
    //   2964: goto -> 2968
    //   2967: athrow
    //   2968: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   2971: goto -> 2975
    //   2974: athrow
    //   2975: getstatic Perryc.1 : I
    //   2978: ifeq -> 2992
    //   2981: ldc2_w 129527994
    //   2984: l2i
    //   2985: ldc_w 430580715
    //   2988: ixor
    //   2989: goto -> 3000
    //   2992: ldc2_w -1283372759
    //   2995: l2i
    //   2996: ldc_w 192376818
    //   2999: ixor
    //   3000: ldc2_w -1079180325
    //   3003: l2i
    //   3004: ldc_w 567203016
    //   3007: ixor
    //   3008: ixor
    //   3009: lookupswitch default -> 6788, -2140044222 -> 2992, 647360968 -> 3036
    //   3036: goto -> 3040
    //   3039: athrow
    //   3040: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3043: goto -> 3047
    //   3046: athrow
    //   3047: getstatic Perryc.0 : I
    //   3050: ifle -> 3064
    //   3053: ldc2_w 2113591763
    //   3056: l2i
    //   3057: ldc_w -506289815
    //   3060: ixor
    //   3061: goto -> 3072
    //   3064: ldc2_w -707962251
    //   3067: l2i
    //   3068: ldc_w 426698538
    //   3071: ixor
    //   3072: ldc2_w 1548054087
    //   3075: l2i
    //   3076: ldc_w -2029475657
    //   3079: ixor
    //   3080: ixor
    //   3081: lookupswitch default -> 6950, 401505199 -> 3108, 1197850186 -> 3064
    //   3108: goto -> 3112
    //   3111: athrow
    //   3112: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   3117: goto -> 3121
    //   3120: athrow
    //   3121: getstatic Perryc.1 : I
    //   3124: ifeq -> 3138
    //   3127: ldc2_w 2036903774
    //   3130: l2i
    //   3131: ldc_w 75911813
    //   3134: ixor
    //   3135: goto -> 3146
    //   3138: ldc2_w -1793717432
    //   3141: l2i
    //   3142: ldc_w 67180306
    //   3145: ixor
    //   3146: ldc2_w 1455828129
    //   3149: l2i
    //   3150: ldc_w 1172121786
    //   3153: ixor
    //   3154: ixor
    //   3155: lookupswitch default -> 6878, -2113136575 -> 3180, 1861614016 -> 3138
    //   3180: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   3183: getstatic Perryc.0 : I
    //   3186: ifle -> 3200
    //   3189: ldc2_w 719194836
    //   3192: l2i
    //   3193: ldc_w -1003505978
    //   3196: ixor
    //   3197: goto -> 3208
    //   3200: ldc2_w -1410659275
    //   3203: l2i
    //   3204: ldc_w -748959852
    //   3207: ixor
    //   3208: ldc2_w -898933068
    //   3211: l2i
    //   3212: ldc_w -716458725
    //   3215: ixor
    //   3216: ixor
    //   3217: lookupswitch default -> 6906, -237938755 -> 3200, 1737498638 -> 3244
    //   3244: goto -> 3248
    //   3247: athrow
    //   3248: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3251: goto -> 3255
    //   3254: athrow
    //   3255: ifeq -> 3269
    //   3258: ldc2_w -262377743
    //   3261: l2i
    //   3262: ldc_w 1808687868
    //   3265: ixor
    //   3266: goto -> 3277
    //   3269: ldc2_w 297138489
    //   3272: l2i
    //   3273: ldc_w -1977092813
    //   3276: ixor
    //   3277: ldc2_w 1337148920
    //   3280: l2i
    //   3281: ldc_w 99920078
    //   3284: ixor
    //   3285: ixor
    //   3286: tableswitch default -> 3258, -774512325 -> 3308, -774512324 -> 6711
    //   3308: ldc2_w -766535093
    //   3311: l2i
    //   3312: ldc_w -766535094
    //   3315: ixor
    //   3316: getstatic Perryc.1 : I
    //   3319: ifeq -> 3333
    //   3322: ldc2_w 245943675
    //   3325: l2i
    //   3326: ldc_w -1357057504
    //   3329: ixor
    //   3330: goto -> 3341
    //   3333: ldc2_w 463998855
    //   3336: l2i
    //   3337: ldc_w 1284787060
    //   3340: ixor
    //   3341: ldc2_w -261171916
    //   3344: l2i
    //   3345: ldc_w 612432178
    //   3348: ixor
    //   3349: ixor
    //   3350: lookupswitch default -> 3376, -1671288869 -> 3333, 1968837469 -> 6924
    //   3376: istore #5
    //   3378: getstatic Perryc.0 : I
    //   3381: ifle -> 3395
    //   3384: ldc2_w -1532546274
    //   3387: l2i
    //   3388: ldc_w 221394554
    //   3391: ixor
    //   3392: goto -> 3403
    //   3395: ldc2_w -928049538
    //   3398: l2i
    //   3399: ldc_w -110982117
    //   3402: ixor
    //   3403: ldc2_w 562643656
    //   3406: l2i
    //   3407: ldc_w 312610963
    //   3410: ixor
    //   3411: ixor
    //   3412: lookupswitch default -> 6952, -1698801857 -> 3395, 48678974 -> 3440
    //   3440: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.surroundOffset : [Lnet/minecraft/util/math/BlockPos;
    //   3443: getstatic Perryc.0 : I
    //   3446: ifle -> 3460
    //   3449: ldc2_w -1459823055
    //   3452: l2i
    //   3453: ldc_w 116463828
    //   3456: ixor
    //   3457: goto -> 3468
    //   3460: ldc2_w -1913174297
    //   3463: l2i
    //   3464: ldc_w 2044141774
    //   3467: ixor
    //   3468: ldc2_w 2076610446
    //   3471: l2i
    //   3472: ldc_w -1104189392
    //   3475: ixor
    //   3476: ixor
    //   3477: lookupswitch default -> 6806, 835289495 -> 3504, 1810112859 -> 3460
    //   3504: astore #6
    //   3506: getstatic Perryc.0 : I
    //   3509: ifle -> 3523
    //   3512: ldc2_w 250057639
    //   3515: l2i
    //   3516: ldc_w -813936176
    //   3519: ixor
    //   3520: goto -> 3531
    //   3523: ldc2_w -229844191
    //   3526: l2i
    //   3527: ldc_w -852173724
    //   3530: ixor
    //   3531: ldc2_w -651884768
    //   3534: l2i
    //   3535: ldc_w -1070480991
    //   3538: ixor
    //   3539: ixor
    //   3540: lookupswitch default -> 3568, -661715722 -> 6796, -499607436 -> 3523
    //   3568: aload #6
    //   3570: arraylength
    //   3571: getstatic Perryc.c : I
    //   3574: iflt -> 3588
    //   3577: ldc2_w 1864202329
    //   3580: l2i
    //   3581: ldc_w -1016497431
    //   3584: ixor
    //   3585: goto -> 3596
    //   3588: ldc2_w -2081163861
    //   3591: l2i
    //   3592: ldc_w 109453883
    //   3595: ixor
    //   3596: ldc2_w -1199224838
    //   3599: l2i
    //   3600: ldc_w 427363756
    //   3603: ixor
    //   3604: ixor
    //   3605: lookupswitch default -> 3632, 227035366 -> 6886, 1855052012 -> 3588
    //   3632: istore #7
    //   3634: ldc2_w 1606790997
    //   3637: l2i
    //   3638: ldc_w 1606790997
    //   3641: ixor
    //   3642: getstatic Perryc.c : I
    //   3645: iflt -> 3659
    //   3648: ldc2_w -1903490901
    //   3651: l2i
    //   3652: ldc_w -1809936235
    //   3655: ixor
    //   3656: goto -> 3667
    //   3659: ldc2_w -1244353530
    //   3662: l2i
    //   3663: ldc_w 603943645
    //   3666: ixor
    //   3667: ldc2_w -1466311697
    //   3670: l2i
    //   3671: ldc_w 1838600931
    //   3674: ixor
    //   3675: ixor
    //   3676: lookupswitch default -> 3704, -1242004670 -> 3659, -543518414 -> 6830
    //   3704: istore #8
    //   3706: getstatic Perryc.c : I
    //   3709: iflt -> 3723
    //   3712: ldc2_w 886179558
    //   3715: l2i
    //   3716: ldc_w -440872987
    //   3719: ixor
    //   3720: goto -> 3731
    //   3723: ldc2_w 1817346645
    //   3726: l2i
    //   3727: ldc_w -112547202
    //   3730: ixor
    //   3731: ldc2_w -1359588051
    //   3734: l2i
    //   3735: ldc_w -1799860949
    //   3738: ixor
    //   3739: ixor
    //   3740: lookupswitch default -> 3768, -503012190 -> 3723, -349908731 -> 6930
    //   3768: iload #8
    //   3770: getstatic Perryc.1 : I
    //   3773: ifeq -> 3787
    //   3776: ldc2_w 1486649353
    //   3779: l2i
    //   3780: ldc_w -1627410085
    //   3783: ixor
    //   3784: goto -> 3795
    //   3787: ldc2_w 1784920019
    //   3790: l2i
    //   3791: ldc_w 214222586
    //   3794: ixor
    //   3795: ldc2_w -543280838
    //   3798: l2i
    //   3799: ldc_w 1276979029
    //   3802: ixor
    //   3803: ixor
    //   3804: lookupswitch default -> 6794, -182163642 -> 3832, 1440800573 -> 3787
    //   3832: iload #7
    //   3834: if_icmpge -> 3848
    //   3837: ldc2_w -2139620403
    //   3840: l2i
    //   3841: ldc_w 1622601073
    //   3844: ixor
    //   3845: goto -> 3856
    //   3848: ldc2_w -200278786
    //   3851: l2i
    //   3852: ldc_w 349104705
    //   3855: ixor
    //   3856: ldc2_w -1231707589
    //   3859: l2i
    //   3860: ldc_w 391668594
    //   3863: ixor
    //   3864: ixor
    //   3865: tableswitch default -> 3837, 1091360757 -> 3888, 1091360758 -> 5116
    //   3888: getstatic Perryc.0 : I
    //   3891: ifle -> 3905
    //   3894: ldc2_w 417902994
    //   3897: l2i
    //   3898: ldc_w -1247598414
    //   3901: ixor
    //   3902: goto -> 3913
    //   3905: ldc2_w -101644539
    //   3908: l2i
    //   3909: ldc_w 1508434499
    //   3912: ixor
    //   3913: ldc2_w -1192037340
    //   3916: l2i
    //   3917: ldc_w 543891220
    //   3920: ixor
    //   3921: ixor
    //   3922: lookupswitch default -> 6898, 902984208 -> 3905, 947916406 -> 3948
    //   3948: aload #6
    //   3950: getstatic Perryc.0 : I
    //   3953: ifle -> 3967
    //   3956: ldc2_w 1960849314
    //   3959: l2i
    //   3960: ldc_w -1826803741
    //   3963: ixor
    //   3964: goto -> 3975
    //   3967: ldc2_w -1368293728
    //   3970: l2i
    //   3971: ldc_w -267466598
    //   3974: ixor
    //   3975: ldc2_w 375475043
    //   3978: l2i
    //   3979: ldc_w -190710808
    //   3982: ixor
    //   3983: ixor
    //   3984: lookupswitch default -> 4012, -1069396589 -> 3967, 87929034 -> 6812
    //   4012: iload #8
    //   4014: aaload
    //   4015: getstatic Perryc.0 : I
    //   4018: ifle -> 4032
    //   4021: ldc2_w -1476206324
    //   4024: l2i
    //   4025: ldc_w -522097210
    //   4028: ixor
    //   4029: goto -> 4040
    //   4032: ldc2_w 843951548
    //   4035: l2i
    //   4036: ldc_w -1494574967
    //   4039: ixor
    //   4040: ldc2_w 1108004502
    //   4043: l2i
    //   4044: ldc_w -1808241755
    //   4047: ixor
    //   4048: ixor
    //   4049: lookupswitch default -> 4076, -1630459399 -> 6846, -482437571 -> 4032
    //   4076: astore #9
    //   4078: getstatic Perryc.c : I
    //   4081: iflt -> 4095
    //   4084: ldc2_w -1781354043
    //   4087: l2i
    //   4088: ldc_w -206710678
    //   4091: ixor
    //   4092: goto -> 4103
    //   4095: ldc2_w -101068942
    //   4098: l2i
    //   4099: ldc_w 1180213856
    //   4102: ixor
    //   4103: ldc2_w 1272632619
    //   4106: l2i
    //   4107: ldc_w 293203717
    //   4110: ixor
    //   4111: ixor
    //   4112: lookupswitch default -> 6814, -452831428 -> 4140, 1021072257 -> 4095
    //   4140: aload_0
    //   4141: pop
    //   4142: getstatic Perryc.0 : I
    //   4145: ifle -> 4159
    //   4148: ldc2_w -1010054944
    //   4151: l2i
    //   4152: ldc_w 694618611
    //   4155: ixor
    //   4156: goto -> 4167
    //   4159: ldc2_w -150962753
    //   4162: l2i
    //   4163: ldc_w -656858155
    //   4166: ixor
    //   4167: ldc2_w -967388671
    //   4170: l2i
    //   4171: ldc_w 1720372398
    //   4174: ixor
    //   4175: ixor
    //   4176: lookupswitch default -> 6958, -1895481147 -> 4204, 1248911292 -> 4159
    //   4204: getstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.mc : Lnet/minecraft/client/Minecraft;
    //   4207: getstatic Perryc.c : I
    //   4210: iflt -> 4224
    //   4213: ldc2_w 917685310
    //   4216: l2i
    //   4217: ldc_w 1827016088
    //   4220: ixor
    //   4221: goto -> 4232
    //   4224: ldc2_w 1750465589
    //   4227: l2i
    //   4228: ldc_w -576301196
    //   4231: ixor
    //   4232: ldc2_w -1207960242
    //   4235: l2i
    //   4236: ldc_w 1435822459
    //   4239: ixor
    //   4240: ixor
    //   4241: lookupswitch default -> 6866, -1203774061 -> 4224, 1469628276 -> 4268
    //   4268: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   4271: getstatic Perryc.c : I
    //   4274: iflt -> 4288
    //   4277: ldc2_w -886550388
    //   4280: l2i
    //   4281: ldc_w 1339153068
    //   4284: ixor
    //   4285: goto -> 4296
    //   4288: ldc2_w -1865486771
    //   4291: l2i
    //   4292: ldc_w 1076598662
    //   4295: ixor
    //   4296: ldc2_w -1803821980
    //   4299: l2i
    //   4300: ldc_w -1902155764
    //   4303: ixor
    //   4304: ixor
    //   4305: lookupswitch default -> 6928, -1642250680 -> 4288, -905851485 -> 4332
    //   4332: aload #4
    //   4334: getstatic Perryc.c : I
    //   4337: iflt -> 4351
    //   4340: ldc2_w -2091304320
    //   4343: l2i
    //   4344: ldc_w -116671067
    //   4347: ixor
    //   4348: goto -> 4359
    //   4351: ldc2_w -94011074
    //   4354: l2i
    //   4355: ldc_w -1595841159
    //   4358: ixor
    //   4359: ldc2_w 183945249
    //   4362: l2i
    //   4363: ldc_w 1537886352
    //   4366: ixor
    //   4367: ixor
    //   4368: lookupswitch default -> 4396, -1564856456 -> 4351, 722339732 -> 6908
    //   4396: aload #9
    //   4398: getstatic Perryc.0 : I
    //   4401: ifle -> 4415
    //   4404: ldc2_w 883873678
    //   4407: l2i
    //   4408: ldc_w -397183175
    //   4411: ixor
    //   4412: goto -> 4423
    //   4415: ldc2_w 629115462
    //   4418: l2i
    //   4419: ldc_w 402465442
    //   4422: ixor
    //   4423: ldc2_w 1685517809
    //   4426: l2i
    //   4427: ldc_w 529547028
    //   4430: ixor
    //   4431: ixor
    //   4432: lookupswitch default -> 4460, -2062190842 -> 4415, -1491375534 -> 6786
    //   4460: goto -> 4464
    //   4463: athrow
    //   4464: invokevirtual func_177971_a : (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
    //   4467: goto -> 4471
    //   4470: athrow
    //   4471: getstatic Perryc.0 : I
    //   4474: ifle -> 4488
    //   4477: ldc2_w -1366284161
    //   4480: l2i
    //   4481: ldc_w 1750272100
    //   4484: ixor
    //   4485: goto -> 4496
    //   4488: ldc2_w 302147436
    //   4491: l2i
    //   4492: ldc_w 245802717
    //   4495: ixor
    //   4496: ldc2_w -1618176200
    //   4499: l2i
    //   4500: ldc_w -2013260779
    //   4503: ixor
    //   4504: ixor
    //   4505: lookupswitch default -> 6848, -783310026 -> 4488, 187187868 -> 4532
    //   4532: goto -> 4536
    //   4535: athrow
    //   4536: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   4539: goto -> 4543
    //   4542: athrow
    //   4543: getstatic Perryc.1 : I
    //   4546: ifeq -> 4560
    //   4549: ldc2_w -589709788
    //   4552: l2i
    //   4553: ldc_w -2015101761
    //   4556: ixor
    //   4557: goto -> 4568
    //   4560: ldc2_w 1977459334
    //   4563: l2i
    //   4564: ldc_w -1849613271
    //   4567: ixor
    //   4568: ldc2_w 1770728409
    //   4571: l2i
    //   4572: ldc_w 106757396
    //   4575: ixor
    //   4576: ixor
    //   4577: lookupswitch default -> 6960, -1949609886 -> 4604, 887985238 -> 4560
    //   4604: goto -> 4608
    //   4607: athrow
    //   4608: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   4613: goto -> 4617
    //   4616: athrow
    //   4617: getstatic Perryc.c : I
    //   4620: iflt -> 4634
    //   4623: ldc2_w 734080019
    //   4626: l2i
    //   4627: ldc_w -1926784749
    //   4630: ixor
    //   4631: goto -> 4642
    //   4634: ldc2_w -828863525
    //   4637: l2i
    //   4638: ldc_w -1736350621
    //   4641: ixor
    //   4642: ldc2_w 1990589112
    //   4645: l2i
    //   4646: ldc_w 437373339
    //   4649: ixor
    //   4650: ixor
    //   4651: lookupswitch default -> 6802, -900561373 -> 4634, 984472731 -> 4676
    //   4676: astore #10
    //   4678: getstatic Perryc.c : I
    //   4681: iflt -> 4695
    //   4684: ldc2_w 1680884344
    //   4687: l2i
    //   4688: ldc_w 425526720
    //   4691: ixor
    //   4692: goto -> 4703
    //   4695: ldc2_w -550803116
    //   4698: l2i
    //   4699: ldc_w 542620857
    //   4702: ixor
    //   4703: ldc2_w -568752093
    //   4706: l2i
    //   4707: ldc_w 287494653
    //   4710: ixor
    //   4711: ixor
    //   4712: lookupswitch default -> 6826, -1302978970 -> 4695, 809995315 -> 4740
    //   4740: aload #10
    //   4742: getstatic Perryc.0 : I
    //   4745: ifle -> 4759
    //   4748: ldc2_w 980745126
    //   4751: l2i
    //   4752: ldc_w -1664199296
    //   4755: ixor
    //   4756: goto -> 4767
    //   4759: ldc2_w 531796551
    //   4762: l2i
    //   4763: ldc_w 1685354055
    //   4766: ixor
    //   4767: ldc2_w -662785915
    //   4770: l2i
    //   4771: ldc_w 899054539
    //   4774: ixor
    //   4775: ixor
    //   4776: lookupswitch default -> 4804, -597392771 -> 4759, 1263691112 -> 6900
    //   4804: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   4807: if_acmpeq -> 4821
    //   4810: ldc2_w 728538075
    //   4813: l2i
    //   4814: ldc_w -1562906542
    //   4817: ixor
    //   4818: goto -> 4829
    //   4821: ldc2_w 1526787001
    //   4824: l2i
    //   4825: ldc_w -759463873
    //   4828: ixor
    //   4829: ldc2_w -564939476
    //   4832: l2i
    //   4833: ldc_w 284397042
    //   4836: ixor
    //   4837: ixor
    //   4838: tableswitch default -> 4810, 1192973143 -> 4860, 1192973144 -> 5110
    //   4860: getstatic Perryc.c : I
    //   4863: iflt -> 4877
    //   4866: ldc2_w 2012698663
    //   4869: l2i
    //   4870: ldc_w -1051996399
    //   4873: ixor
    //   4874: goto -> 4885
    //   4877: ldc2_w -1550721251
    //   4880: l2i
    //   4881: ldc_w 6607247
    //   4884: ixor
    //   4885: ldc2_w 381463424
    //   4888: l2i
    //   4889: ldc_w -974256052
    //   4892: ixor
    //   4893: ixor
    //   4894: lookupswitch default -> 6910, 1710109946 -> 4877, 1890037086 -> 4920
    //   4920: aload #10
    //   4922: getstatic Perryc.c : I
    //   4925: iflt -> 4939
    //   4928: ldc2_w -1461661182
    //   4931: l2i
    //   4932: ldc_w 125488123
    //   4935: ixor
    //   4936: goto -> 4947
    //   4939: ldc2_w -766398583
    //   4942: l2i
    //   4943: ldc_w -1899860965
    //   4946: ixor
    //   4947: ldc2_w 2071735821
    //   4950: l2i
    //   4951: ldc_w 849724816
    //   4954: ixor
    //   4955: ixor
    //   4956: lookupswitch default -> 6912, -431754652 -> 4939, 357181455 -> 4984
    //   4984: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   4987: if_acmpeq -> 5001
    //   4990: ldc2_w 146899074
    //   4993: l2i
    //   4994: ldc_w -2003695995
    //   4997: ixor
    //   4998: goto -> 5009
    //   5001: ldc2_w 381254895
    //   5004: l2i
    //   5005: ldc_w -1762985237
    //   5008: ixor
    //   5009: ldc2_w 1315252441
    //   5012: l2i
    //   5013: ldc_w 751201715
    //   5016: ixor
    //   5017: ixor
    //   5018: tableswitch default -> 4990, -487537811 -> 5040, -487537810 -> 5110
    //   5040: ldc2_w 239278775
    //   5043: l2i
    //   5044: ldc_w 239278775
    //   5047: ixor
    //   5048: getstatic Perryc.0 : I
    //   5051: ifle -> 5065
    //   5054: ldc2_w -44231157
    //   5057: l2i
    //   5058: ldc_w 211473737
    //   5061: ixor
    //   5062: goto -> 5073
    //   5065: ldc2_w -526453455
    //   5068: l2i
    //   5069: ldc_w 1614432618
    //   5072: ixor
    //   5073: ldc2_w 1038001702
    //   5076: l2i
    //   5077: ldc_w -1134165601
    //   5080: ixor
    //   5081: ixor
    //   5082: lookupswitch default -> 6818, 18619362 -> 5108, 1887397115 -> 5065
    //   5108: istore #5
    //   5110: iinc #8, 1
    //   5113: goto -> 3706
    //   5116: getstatic Perryc.c : I
    //   5119: iflt -> 5133
    //   5122: ldc2_w 1265160344
    //   5125: l2i
    //   5126: ldc_w -56444689
    //   5129: ixor
    //   5130: goto -> 5141
    //   5133: ldc2_w -203154832
    //   5136: l2i
    //   5137: ldc_w 2001145594
    //   5140: ixor
    //   5141: ldc2_w 733873859
    //   5144: l2i
    //   5145: ldc_w -1635272096
    //   5148: ixor
    //   5149: ixor
    //   5150: lookupswitch default -> 5176, 49534164 -> 6940, 1432063433 -> 5133
    //   5176: iload #5
    //   5178: ifeq -> 5192
    //   5181: ldc2_w -2098696963
    //   5184: l2i
    //   5185: ldc_w 430971997
    //   5188: ixor
    //   5189: goto -> 5200
    //   5192: ldc2_w -339278697
    //   5195: l2i
    //   5196: ldc_w 1889498164
    //   5199: ixor
    //   5200: ldc2_w -60809783
    //   5203: l2i
    //   5204: ldc_w -666636816
    //   5207: ixor
    //   5208: ixor
    //   5209: tableswitch default -> 5181, -1082425191 -> 5232, -1082425190 -> 5428
    //   5232: getstatic Perryc.0 : I
    //   5235: ifle -> 5249
    //   5238: ldc2_w 1381904480
    //   5241: l2i
    //   5242: ldc_w -1677225650
    //   5245: ixor
    //   5246: goto -> 5257
    //   5249: ldc2_w 1095592308
    //   5252: l2i
    //   5253: ldc_w 503407522
    //   5256: ixor
    //   5257: ldc2_w 493917542
    //   5260: l2i
    //   5261: ldc_w -1683999218
    //   5264: ixor
    //   5265: ixor
    //   5266: lookupswitch default -> 6932, -644044354 -> 5292, 1216938566 -> 5249
    //   5292: aload_1
    //   5293: getstatic Perryc.c : I
    //   5296: iflt -> 5310
    //   5299: ldc2_w -1064387772
    //   5302: l2i
    //   5303: ldc_w 31349340
    //   5306: ixor
    //   5307: goto -> 5318
    //   5310: ldc2_w 886840308
    //   5313: l2i
    //   5314: ldc_w -1709998220
    //   5317: ixor
    //   5318: ldc2_w 1951999735
    //   5321: l2i
    //   5322: ldc_w -1649823204
    //   5325: ixor
    //   5326: ixor
    //   5327: lookupswitch default -> 5352, -141850384 -> 5310, 681604595 -> 6874
    //   5352: aload #4
    //   5354: getstatic Perryc.c : I
    //   5357: iflt -> 5371
    //   5360: ldc2_w -572656386
    //   5363: l2i
    //   5364: ldc_w -2032995683
    //   5367: ixor
    //   5368: goto -> 5379
    //   5371: ldc2_w 1350817595
    //   5374: l2i
    //   5375: ldc_w 421239210
    //   5378: ixor
    //   5379: ldc2_w 1746110333
    //   5382: l2i
    //   5383: ldc_w 833201127
    //   5386: ixor
    //   5387: ixor
    //   5388: lookupswitch default -> 6890, 45425401 -> 5371, 270690827 -> 5416
    //   5416: goto -> 5420
    //   5419: athrow
    //   5420: invokevirtual add : (Ljava/lang/Object;)Z
    //   5423: goto -> 5427
    //   5426: athrow
    //   5427: pop
    //   5428: getstatic Perryc.1 : I
    //   5431: ifeq -> 5445
    //   5434: ldc2_w 1193097444
    //   5437: l2i
    //   5438: ldc_w -341646266
    //   5441: ixor
    //   5442: goto -> 5453
    //   5445: ldc2_w -1071220481
    //   5448: l2i
    //   5449: ldc_w 830684616
    //   5452: ixor
    //   5453: ldc2_w 133038932
    //   5456: l2i
    //   5457: ldc_w 529531384
    //   5460: ixor
    //   5461: ixor
    //   5462: lookupswitch default -> 5488, -1262363122 -> 6834, 860542197 -> 5445
    //   5488: aload_0
    //   5489: getstatic Perryc.c : I
    //   5492: iflt -> 5506
    //   5495: ldc2_w -387763384
    //   5498: l2i
    //   5499: ldc_w -1474365143
    //   5502: ixor
    //   5503: goto -> 5514
    //   5506: ldc2_w -373295334
    //   5509: l2i
    //   5510: ldc_w -1735843728
    //   5513: ixor
    //   5514: ldc2_w -1849792507
    //   5517: l2i
    //   5518: ldc_w -708783783
    //   5521: ixor
    //   5522: ixor
    //   5523: lookupswitch default -> 5548, 75723581 -> 6904, 371692046 -> 5506
    //   5548: goto -> 5552
    //   5551: athrow
    //   5552: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   5555: goto -> 5559
    //   5558: athrow
    //   5559: getstatic Perryc.1 : I
    //   5562: ifeq -> 5576
    //   5565: ldc2_w 1766834673
    //   5568: l2i
    //   5569: ldc_w 1249266556
    //   5572: ixor
    //   5573: goto -> 5584
    //   5576: ldc2_w -125340451
    //   5579: l2i
    //   5580: ldc_w -366450043
    //   5583: ixor
    //   5584: ldc2_w -958957474
    //   5587: l2i
    //   5588: ldc_w 1184026142
    //   5591: ixor
    //   5592: ixor
    //   5593: lookupswitch default -> 6870, -1830115304 -> 5620, -1552139059 -> 5576
    //   5620: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5623: getstatic Perryc.1 : I
    //   5626: ifeq -> 5640
    //   5629: ldc2_w -1179783353
    //   5632: l2i
    //   5633: ldc_w -776915582
    //   5636: ixor
    //   5637: goto -> 5648
    //   5640: ldc2_w -1377545466
    //   5643: l2i
    //   5644: ldc_w 568977303
    //   5647: ixor
    //   5648: ldc2_w 485033685
    //   5651: l2i
    //   5652: ldc_w -1627477291
    //   5655: ixor
    //   5656: ixor
    //   5657: lookupswitch default -> 6860, -368347451 -> 5640, 236591249 -> 5684
    //   5684: goto -> 5688
    //   5687: athrow
    //   5688: invokevirtual getValue : ()Ljava/lang/Object;
    //   5691: goto -> 5695
    //   5694: athrow
    //   5695: checkcast java/lang/Integer
    //   5698: getstatic Perryc.1 : I
    //   5701: ifeq -> 5715
    //   5704: ldc2_w 2132582251
    //   5707: l2i
    //   5708: ldc_w 1847431748
    //   5711: ixor
    //   5712: goto -> 5723
    //   5715: ldc2_w 155537286
    //   5718: l2i
    //   5719: ldc_w 1730336167
    //   5722: ixor
    //   5723: ldc2_w 1360658067
    //   5726: l2i
    //   5727: ldc_w 816333497
    //   5730: ixor
    //   5731: ixor
    //   5732: lookupswitch default -> 5760, 254047595 -> 5715, 1890627845 -> 6800
    //   5760: goto -> 5764
    //   5763: athrow
    //   5764: invokevirtual intValue : ()I
    //   5767: goto -> 5771
    //   5770: athrow
    //   5771: getstatic Perryc.0 : I
    //   5774: ifle -> 5788
    //   5777: ldc2_w -606522208
    //   5780: l2i
    //   5781: ldc_w -482695748
    //   5784: ixor
    //   5785: goto -> 5796
    //   5788: ldc2_w -293840566
    //   5791: l2i
    //   5792: ldc_w -1082777721
    //   5795: ixor
    //   5796: ldc2_w -831246311
    //   5799: l2i
    //   5800: ldc_w -389429178
    //   5803: ixor
    //   5804: ixor
    //   5805: lookupswitch default -> 5832, -1014487743 -> 5788, 509503811 -> 6864
    //   5832: goto -> 5836
    //   5835: athrow
    //   5836: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   5839: goto -> 5843
    //   5842: athrow
    //   5843: getstatic Perryc.1 : I
    //   5846: ifeq -> 5860
    //   5849: ldc2_w -1426426268
    //   5852: l2i
    //   5853: ldc_w -629358033
    //   5856: ixor
    //   5857: goto -> 5868
    //   5860: ldc2_w 1839655962
    //   5863: l2i
    //   5864: ldc_w 773669360
    //   5867: ixor
    //   5868: ldc2_w -1297245658
    //   5871: l2i
    //   5872: ldc_w 1455559720
    //   5875: ixor
    //   5876: ixor
    //   5877: lookupswitch default -> 5904, -1796654523 -> 6862, -436104405 -> 5860
    //   5904: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5907: getstatic Perryc.c : I
    //   5910: iflt -> 5924
    //   5913: ldc2_w -2117771506
    //   5916: l2i
    //   5917: ldc_w 97114469
    //   5920: ixor
    //   5921: goto -> 5932
    //   5924: ldc2_w 1112063562
    //   5927: l2i
    //   5928: ldc_w 1588034319
    //   5931: ixor
    //   5932: ldc2_w -1824200470
    //   5935: l2i
    //   5936: ldc_w 466494158
    //   5939: ixor
    //   5940: ixor
    //   5941: lookupswitch default -> 5968, -1313666682 -> 5924, 210127951 -> 6914
    //   5968: goto -> 5972
    //   5971: athrow
    //   5972: invokevirtual getValue : ()Ljava/lang/Object;
    //   5975: goto -> 5979
    //   5978: athrow
    //   5979: checkcast java/lang/Integer
    //   5982: getstatic Perryc.0 : I
    //   5985: ifle -> 5999
    //   5988: ldc2_w 1475261126
    //   5991: l2i
    //   5992: ldc_w -708971886
    //   5995: ixor
    //   5996: goto -> 6007
    //   5999: ldc2_w 1512942685
    //   6002: l2i
    //   6003: ldc_w -1615677736
    //   6006: ixor
    //   6007: ldc2_w 1494237498
    //   6010: l2i
    //   6011: ldc_w -1219003258
    //   6014: ixor
    //   6015: ixor
    //   6016: lookupswitch default -> 6044, 1809427551 -> 5999, 1813282280 -> 6780
    //   6044: goto -> 6048
    //   6047: athrow
    //   6048: invokevirtual intValue : ()I
    //   6051: goto -> 6055
    //   6054: athrow
    //   6055: getstatic Perryc.c : I
    //   6058: iflt -> 6072
    //   6061: ldc2_w -1000259935
    //   6064: l2i
    //   6065: ldc_w -1317421140
    //   6068: ixor
    //   6069: goto -> 6080
    //   6072: ldc2_w 1435000844
    //   6075: l2i
    //   6076: ldc_w -262204293
    //   6079: ixor
    //   6080: ldc2_w -1938429213
    //   6083: l2i
    //   6084: ldc_w 1094183
    //   6087: ixor
    //   6088: ixor
    //   6089: lookupswitch default -> 6116, -109192759 -> 6944, 514001887 -> 6072
    //   6116: goto -> 6120
    //   6119: athrow
    //   6120: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   6123: goto -> 6127
    //   6126: athrow
    //   6127: getstatic Perryc.1 : I
    //   6130: ifeq -> 6144
    //   6133: ldc2_w 1993076746
    //   6136: l2i
    //   6137: ldc_w -49899954
    //   6140: ixor
    //   6141: goto -> 6152
    //   6144: ldc2_w -612814787
    //   6147: l2i
    //   6148: ldc_w 1973673826
    //   6151: ixor
    //   6152: ldc2_w 483397706
    //   6155: l2i
    //   6156: ldc_w -1802428792
    //   6159: ixor
    //   6160: ixor
    //   6161: lookupswitch default -> 6188, -347436890 -> 6144, 59533446 -> 6920
    //   6188: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6191: getstatic Perryc.c : I
    //   6194: iflt -> 6208
    //   6197: ldc2_w 1274996930
    //   6200: l2i
    //   6201: ldc_w 787145323
    //   6204: ixor
    //   6205: goto -> 6216
    //   6208: ldc2_w -1961422193
    //   6211: l2i
    //   6212: ldc_w 1879913180
    //   6215: ixor
    //   6216: ldc2_w -1163741840
    //   6219: l2i
    //   6220: ldc_w -543365708
    //   6223: ixor
    //   6224: ixor
    //   6225: lookupswitch default -> 6252, 2775661 -> 6916, 166918317 -> 6208
    //   6252: goto -> 6256
    //   6255: athrow
    //   6256: invokevirtual getValue : ()Ljava/lang/Object;
    //   6259: goto -> 6263
    //   6262: athrow
    //   6263: checkcast java/lang/Integer
    //   6266: getstatic Perryc.0 : I
    //   6269: ifle -> 6283
    //   6272: ldc2_w -362351032
    //   6275: l2i
    //   6276: ldc_w -59136867
    //   6279: ixor
    //   6280: goto -> 6291
    //   6283: ldc2_w -783746828
    //   6286: l2i
    //   6287: ldc_w -2085967479
    //   6290: ixor
    //   6291: ldc2_w 1357240346
    //   6294: l2i
    //   6295: ldc_w -1835234456
    //   6298: ixor
    //   6299: ixor
    //   6300: lookupswitch default -> 6328, -1125802861 -> 6283, -731512409 -> 6792
    //   6328: goto -> 6332
    //   6331: athrow
    //   6332: invokevirtual intValue : ()I
    //   6335: goto -> 6339
    //   6338: athrow
    //   6339: getstatic Perryc.1 : I
    //   6342: ifeq -> 6356
    //   6345: ldc2_w -1064787276
    //   6348: l2i
    //   6349: ldc_w 1362471849
    //   6352: ixor
    //   6353: goto -> 6364
    //   6356: ldc2_w 653549685
    //   6359: l2i
    //   6360: ldc_w 1641735321
    //   6363: ixor
    //   6364: ldc2_w 2091089882
    //   6367: l2i
    //   6368: ldc_w 1974880479
    //   6371: ixor
    //   6372: ixor
    //   6373: lookupswitch default -> 6400, -1733804520 -> 6822, 1826010517 -> 6356
    //   6400: goto -> 6404
    //   6403: athrow
    //   6404: invokestatic toRGBA : (III)I
    //   6407: goto -> 6411
    //   6410: athrow
    //   6411: getstatic Perryc.0 : I
    //   6414: ifle -> 6428
    //   6417: ldc2_w -2091102197
    //   6420: l2i
    //   6421: ldc_w 1430440510
    //   6424: ixor
    //   6425: goto -> 6436
    //   6428: ldc2_w 1615153572
    //   6431: l2i
    //   6432: ldc_w -537120374
    //   6435: ixor
    //   6436: ldc2_w 939548586
    //   6439: l2i
    //   6440: ldc_w -555704916
    //   6443: ixor
    //   6444: ixor
    //   6445: lookupswitch default -> 6836, 821975091 -> 6428, 1499052584 -> 6472
    //   6472: putfield color : I
    //   6475: getstatic Perryc.c : I
    //   6478: iflt -> 6492
    //   6481: ldc2_w 419201537
    //   6484: l2i
    //   6485: ldc_w 47581882
    //   6488: ixor
    //   6489: goto -> 6500
    //   6492: ldc2_w -1005710717
    //   6495: l2i
    //   6496: ldc_w -817548160
    //   6499: ixor
    //   6500: ldc2_w 1040282102
    //   6503: l2i
    //   6504: ldc_w -866398663
    //   6507: ixor
    //   6508: ixor
    //   6509: lookupswitch default -> 6536, -395298956 -> 6844, 686520435 -> 6492
    //   6536: aload #4
    //   6538: getstatic Perryc.c : I
    //   6541: iflt -> 6555
    //   6544: ldc2_w -880106712
    //   6547: l2i
    //   6548: ldc_w -1465906212
    //   6551: ixor
    //   6552: goto -> 6563
    //   6555: ldc2_w -150946081
    //   6558: l2i
    //   6559: ldc_w -1810360472
    //   6562: ixor
    //   6563: ldc2_w 2105377082
    //   6566: l2i
    //   6567: ldc_w 1122331975
    //   6570: ixor
    //   6571: ixor
    //   6572: lookupswitch default -> 6600, -2019199419 -> 6555, 1555186825 -> 6896
    //   6600: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   6603: ldc_w 12.895583
    //   6606: invokestatic floatToIntBits : (F)I
    //   6609: ldc_w 2127451215
    //   6612: ixor
    //   6613: invokestatic intBitsToFloat : (I)F
    //   6616: ldc2_w 1770224374
    //   6619: l2i
    //   6620: ldc_w 1770224375
    //   6623: ixor
    //   6624: ldc2_w -1370355307
    //   6627: l2i
    //   6628: ldc_w -1370355308
    //   6631: ixor
    //   6632: ldc2_w -1831740205
    //   6635: l2i
    //   6636: ldc_w -1831740206
    //   6639: ixor
    //   6640: getstatic Perryc.0 : I
    //   6643: ifle -> 6657
    //   6646: ldc2_w -1498042133
    //   6649: l2i
    //   6650: ldc_w 1462273364
    //   6653: ixor
    //   6654: goto -> 6665
    //   6657: ldc2_w 1021285362
    //   6660: l2i
    //   6661: ldc_w -1269569605
    //   6664: ixor
    //   6665: ldc2_w 1588606825
    //   6668: l2i
    //   6669: ldc_w 1363055715
    //   6672: ixor
    //   6673: ixor
    //   6674: lookupswitch default -> 6700, -32270667 -> 6880, 1084536122 -> 6657
    //   6700: goto -> 6704
    //   6703: athrow
    //   6704: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;FZZI)V
    //   6707: goto -> 6711
    //   6710: athrow
    //   6711: iinc #3, 1
    //   6714: goto -> 641
    //   6717: getstatic Perryc.c : I
    //   6720: iflt -> 6734
    //   6723: ldc2_w -1226213792
    //   6726: l2i
    //   6727: ldc_w 2068983794
    //   6730: ixor
    //   6731: goto -> 6742
    //   6734: ldc2_w 611907375
    //   6737: l2i
    //   6738: ldc_w 521416980
    //   6741: ixor
    //   6742: ldc2_w -920805838
    //   6745: l2i
    //   6746: ldc_w 1030492768
    //   6749: ixor
    //   6750: ixor
    //   6751: lookupswitch default -> 6776, 969594304 -> 6808, 1029660521 -> 6734
    //   6776: aload_1
    //   6777: areturn
    //   6778: aconst_null
    //   6779: athrow
    //   6780: aconst_null
    //   6781: athrow
    //   6782: aconst_null
    //   6783: athrow
    //   6784: aconst_null
    //   6785: athrow
    //   6786: aconst_null
    //   6787: athrow
    //   6788: aconst_null
    //   6789: athrow
    //   6790: aconst_null
    //   6791: athrow
    //   6792: aconst_null
    //   6793: athrow
    //   6794: aconst_null
    //   6795: athrow
    //   6796: aconst_null
    //   6797: athrow
    //   6798: aconst_null
    //   6799: athrow
    //   6800: aconst_null
    //   6801: athrow
    //   6802: aconst_null
    //   6803: athrow
    //   6804: aconst_null
    //   6805: athrow
    //   6806: aconst_null
    //   6807: athrow
    //   6808: aconst_null
    //   6809: athrow
    //   6810: aconst_null
    //   6811: athrow
    //   6812: aconst_null
    //   6813: athrow
    //   6814: aconst_null
    //   6815: athrow
    //   6816: aconst_null
    //   6817: athrow
    //   6818: aconst_null
    //   6819: athrow
    //   6820: aconst_null
    //   6821: athrow
    //   6822: aconst_null
    //   6823: athrow
    //   6824: aconst_null
    //   6825: athrow
    //   6826: aconst_null
    //   6827: athrow
    //   6828: aconst_null
    //   6829: athrow
    //   6830: aconst_null
    //   6831: athrow
    //   6832: aconst_null
    //   6833: athrow
    //   6834: aconst_null
    //   6835: athrow
    //   6836: aconst_null
    //   6837: athrow
    //   6838: aconst_null
    //   6839: athrow
    //   6840: aconst_null
    //   6841: athrow
    //   6842: aconst_null
    //   6843: athrow
    //   6844: aconst_null
    //   6845: athrow
    //   6846: aconst_null
    //   6847: athrow
    //   6848: aconst_null
    //   6849: athrow
    //   6850: aconst_null
    //   6851: athrow
    //   6852: aconst_null
    //   6853: athrow
    //   6854: aconst_null
    //   6855: athrow
    //   6856: aconst_null
    //   6857: athrow
    //   6858: aconst_null
    //   6859: athrow
    //   6860: aconst_null
    //   6861: athrow
    //   6862: aconst_null
    //   6863: athrow
    //   6864: aconst_null
    //   6865: athrow
    //   6866: aconst_null
    //   6867: athrow
    //   6868: aconst_null
    //   6869: athrow
    //   6870: aconst_null
    //   6871: athrow
    //   6872: aconst_null
    //   6873: athrow
    //   6874: aconst_null
    //   6875: athrow
    //   6876: aconst_null
    //   6877: athrow
    //   6878: aconst_null
    //   6879: athrow
    //   6880: aconst_null
    //   6881: athrow
    //   6882: aconst_null
    //   6883: athrow
    //   6884: aconst_null
    //   6885: athrow
    //   6886: aconst_null
    //   6887: athrow
    //   6888: aconst_null
    //   6889: athrow
    //   6890: aconst_null
    //   6891: athrow
    //   6892: aconst_null
    //   6893: athrow
    //   6894: aconst_null
    //   6895: athrow
    //   6896: aconst_null
    //   6897: athrow
    //   6898: aconst_null
    //   6899: athrow
    //   6900: aconst_null
    //   6901: athrow
    //   6902: aconst_null
    //   6903: athrow
    //   6904: aconst_null
    //   6905: athrow
    //   6906: aconst_null
    //   6907: athrow
    //   6908: aconst_null
    //   6909: athrow
    //   6910: aconst_null
    //   6911: athrow
    //   6912: aconst_null
    //   6913: athrow
    //   6914: aconst_null
    //   6915: athrow
    //   6916: aconst_null
    //   6917: athrow
    //   6918: aconst_null
    //   6919: athrow
    //   6920: aconst_null
    //   6921: athrow
    //   6922: aconst_null
    //   6923: athrow
    //   6924: aconst_null
    //   6925: athrow
    //   6926: aconst_null
    //   6927: athrow
    //   6928: aconst_null
    //   6929: athrow
    //   6930: aconst_null
    //   6931: athrow
    //   6932: aconst_null
    //   6933: athrow
    //   6934: aconst_null
    //   6935: athrow
    //   6936: aconst_null
    //   6937: athrow
    //   6938: aconst_null
    //   6939: athrow
    //   6940: aconst_null
    //   6941: athrow
    //   6942: aconst_null
    //   6943: athrow
    //   6944: aconst_null
    //   6945: athrow
    //   6946: aconst_null
    //   6947: athrow
    //   6948: aconst_null
    //   6949: athrow
    //   6950: aconst_null
    //   6951: athrow
    //   6952: aconst_null
    //   6953: athrow
    //   6954: aconst_null
    //   6955: athrow
    //   6956: aconst_null
    //   6957: athrow
    //   6958: aconst_null
    //   6959: athrow
    //   6960: aconst_null
    //   6961: athrow
    //   6962: pop
    //   6963: goto -> 24
    //   6966: pop
    //   6967: aconst_null
    //   6968: goto -> 6962
    //   6971: dup
    //   6972: ifnull -> 6962
    //   6975: checkcast java/lang/Throwable
    //   6978: athrow
    //   6979: dup
    //   6980: ifnull -> 6966
    //   6983: checkcast java/lang/Throwable
    //   6986: athrow
    //   6987: aconst_null
    //   6988: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   4678	432	10	block	Lnet/minecraft/block/Block;
    //   4078	1032	9	offset	Lnet/minecraft/util/math/BlockPos;
    //   3378	3333	5	isSafe	Z
    //   1146	5565	4	pos	Lnet/minecraft/util/math/BlockPos;
    //   641	6076	3	i	I
    //   24	6754	0	this	Lbigname/zprestige/webhack/features/modules/Combat/HoleFiller;
    //   161	6617	1	safeSpots	Ljava/util/ArrayList;
    //   573	6205	2	positions	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	6617	1	safeSpots	Ljava/util/ArrayList<Lnet/minecraft/util/math/BlockPos;>;
    //   573	6205	2	positions	Ljava/util/List<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	6971	finally
    //   91	98	98	finally
    //   91	98	91	finally
    //   91	98	3	finally
    //   92	98	91	finally
    //   92	98	98	finally
    //   347	354	354	finally
    //   347	354	3	finally
    //   347	354	347	finally
    //   347	354	3	finally
    //   347	354	354	java/lang/UnsupportedOperationException
    //   423	430	430	finally
    //   423	430	423	finally
    //   423	430	3	finally
    //   424	430	430	finally
    //   424	430	430	finally
    //   503	510	510	finally
    //   503	510	3	java/lang/NumberFormatException
    //   503	510	503	finally
    //   504	510	503	finally
    //   504	510	503	finally
    //   824	832	832	finally
    //   824	832	832	finally
    //   824	832	832	finally
    //   824	832	3	finally
    //   824	832	3	java/lang/EnumConstantNotPresentException
    //   1071	1080	1080	finally
    //   1071	1080	1071	finally
    //   1071	1080	1080	finally
    //   1072	1080	1071	java/lang/EnumConstantNotPresentException
    //   1072	1080	3	finally
    //   1283	1290	1290	finally
    //   1283	1290	1283	finally
    //   1284	1290	1283	java/lang/NullPointerException
    //   1284	1290	1290	finally
    //   1284	1290	3	finally
    //   1671	1678	1678	finally
    //   1671	1678	1671	java/lang/ArithmeticException
    //   1671	1678	1671	java/lang/UnsupportedOperationException
    //   1671	1678	1671	java/lang/IllegalArgumentException
    //   1672	1678	1678	java/lang/IllegalStateException
    //   1743	1752	1752	finally
    //   1743	1752	3	java/lang/UnsupportedOperationException
    //   1743	1752	1752	java/lang/NullPointerException
    //   1743	1752	1752	finally
    //   1743	1752	1743	java/lang/ArithmeticException
    //   1880	1886	1886	finally
    //   1880	1886	1886	java/lang/StringIndexOutOfBoundsException
    //   1880	1886	3	finally
    //   1880	1886	3	finally
    //   1880	1886	1886	java/lang/IndexOutOfBoundsException
    //   2283	2290	2290	finally
    //   2283	2290	2283	java/lang/ArithmeticException
    //   2283	2290	3	java/util/NoSuchElementException
    //   2284	2290	2290	finally
    //   2284	2290	2283	finally
    //   2355	2362	2362	finally
    //   2355	2362	2362	finally
    //   2356	2362	2355	finally
    //   2356	2362	3	java/lang/StringIndexOutOfBoundsException
    //   2356	2362	2362	java/lang/ArithmeticException
    //   2427	2436	2436	finally
    //   2427	2436	2427	finally
    //   2427	2436	3	finally
    //   2428	2436	2436	finally
    //   2428	2436	2427	finally
    //   2563	2570	2570	finally
    //   2563	2570	2570	finally
    //   2564	2570	3	java/lang/IllegalArgumentException
    //   2564	2570	3	finally
    //   2564	2570	2563	java/util/ConcurrentModificationException
    //   2967	2974	2974	finally
    //   2967	2974	2974	finally
    //   2967	2974	2967	finally
    //   2968	2974	2974	java/lang/IndexOutOfBoundsException
    //   2968	2974	2967	java/util/NoSuchElementException
    //   3040	3046	3046	finally
    //   3040	3046	3046	finally
    //   3040	3046	3	finally
    //   3040	3046	3046	java/lang/UnsupportedOperationException
    //   3040	3046	3046	java/lang/EnumConstantNotPresentException
    //   3111	3120	3120	finally
    //   3111	3120	3111	java/util/NoSuchElementException
    //   3111	3120	3120	java/util/NoSuchElementException
    //   3112	3120	3111	finally
    //   3112	3120	3	java/lang/IndexOutOfBoundsException
    //   3248	3254	3254	finally
    //   3248	3254	3	java/lang/NullPointerException
    //   3248	3254	3254	java/lang/IndexOutOfBoundsException
    //   3248	3254	3	finally
    //   3248	3254	3254	java/lang/ArithmeticException
    //   4464	4470	4470	finally
    //   4464	4470	4470	java/lang/IndexOutOfBoundsException
    //   4464	4470	4470	finally
    //   4464	4470	3	java/lang/NumberFormatException
    //   4464	4470	4470	finally
    //   4535	4542	4542	finally
    //   4535	4542	3	finally
    //   4535	4542	3	java/lang/ClassCastException
    //   4535	4542	3	finally
    //   4536	4542	4535	finally
    //   4607	4616	4616	finally
    //   4608	4616	4616	finally
    //   4608	4616	4607	finally
    //   4608	4616	4607	finally
    //   4608	4616	4616	java/lang/StringIndexOutOfBoundsException
    //   5420	5426	5426	finally
    //   5420	5426	5426	java/lang/IllegalStateException
    //   5420	5426	3	java/lang/ArithmeticException
    //   5420	5426	3	java/lang/RuntimeException
    //   5420	5426	5426	java/lang/UnsupportedOperationException
    //   5551	5558	5558	finally
    //   5551	5558	3	java/lang/ClassCastException
    //   5552	5558	5558	java/lang/UnsupportedOperationException
    //   5552	5558	5551	finally
    //   5552	5558	5551	java/lang/ArithmeticException
    //   5687	5694	5694	finally
    //   5688	5694	3	finally
    //   5688	5694	5687	java/util/NoSuchElementException
    //   5688	5694	5687	finally
    //   5688	5694	5694	finally
    //   5763	5770	5770	finally
    //   5763	5770	5770	java/util/ConcurrentModificationException
    //   5764	5770	5770	finally
    //   5764	5770	3	finally
    //   5764	5770	5763	finally
    //   5835	5842	5842	finally
    //   5835	5842	3	finally
    //   5835	5842	5842	finally
    //   5836	5842	5835	finally
    //   5836	5842	3	finally
    //   5971	5978	5978	finally
    //   5972	5978	5971	java/lang/IllegalArgumentException
    //   5972	5978	3	finally
    //   5972	5978	3	java/util/NoSuchElementException
    //   5972	5978	3	java/lang/ArrayIndexOutOfBoundsException
    //   6047	6054	6054	finally
    //   6047	6054	6047	finally
    //   6047	6054	3	finally
    //   6047	6054	3	finally
    //   6048	6054	3	finally
    //   6119	6126	6126	finally
    //   6119	6126	6126	finally
    //   6120	6126	6119	java/lang/StringIndexOutOfBoundsException
    //   6120	6126	3	finally
    //   6120	6126	6126	java/lang/ArithmeticException
    //   6255	6262	6262	finally
    //   6255	6262	6262	java/lang/ArrayIndexOutOfBoundsException
    //   6255	6262	6255	java/util/NoSuchElementException
    //   6256	6262	6255	finally
    //   6256	6262	6255	java/lang/RuntimeException
    //   6331	6338	6338	finally
    //   6331	6338	3	java/lang/AssertionError
    //   6331	6338	6331	java/util/ConcurrentModificationException
    //   6331	6338	6338	finally
    //   6331	6338	3	finally
    //   6404	6410	6410	finally
    //   6404	6410	6410	finally
    //   6404	6410	6410	finally
    //   6404	6410	3	java/lang/IllegalArgumentException
    //   6404	6410	3	java/util/NoSuchElementException
    //   6703	6710	6710	finally
    //   6704	6710	3	finally
    //   6704	6710	3	finally
    //   6704	6710	6710	finally
    //   6704	6710	6703	finally
    //   6971	6979	6971	finally
    //   6987	6989	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public void placeBlock(BlockPos paramBlockPos) {
    Perry1.60(this, (int)118684566L ^ 0x29476B8E, paramBlockPos);
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -1566765362
    //   3: l2i
    //   4: ldc_w -1566765362
    //   7: ixor
    //   8: ldc2_w 88241374
    //   11: l2i
    //   12: ldc_w 88241375
    //   15: ixor
    //   16: getstatic Perryc.0 : I
    //   19: ifle -> 33
    //   22: ldc2_w -344596445
    //   25: l2i
    //   26: ldc_w 940298750
    //   29: ixor
    //   30: goto -> 41
    //   33: ldc2_w -1287525506
    //   36: l2i
    //   37: ldc_w -11693778
    //   40: ixor
    //   41: ldc2_w -150971067
    //   44: l2i
    //   45: ldc_w -1986689134
    //   48: ixor
    //   49: ixor
    //   50: lookupswitch default -> 76, -1377047798 -> 210, 1073160397 -> 33
    //   76: invokestatic getOffsets : (IZ)[Lnet/minecraft/util/math/Vec3d;
    //   79: getstatic Perryc.c : I
    //   82: iflt -> 96
    //   85: ldc2_w -1044043801
    //   88: l2i
    //   89: ldc_w -1142334013
    //   92: ixor
    //   93: goto -> 104
    //   96: ldc2_w 1492913780
    //   99: l2i
    //   100: ldc_w 1543875098
    //   103: ixor
    //   104: ldc2_w -943948383
    //   107: l2i
    //   108: ldc_w 967214052
    //   111: ixor
    //   112: ixor
    //   113: lookupswitch default -> 208, -2076801951 -> 96, -85763541 -> 140
    //   140: invokestatic toBlockPos : ([Lnet/minecraft/util/math/Vec3d;)[Lnet/minecraft/util/math/BlockPos;
    //   143: getstatic Perryc.1 : I
    //   146: ifeq -> 160
    //   149: ldc2_w -771185680
    //   152: l2i
    //   153: ldc_w -523715895
    //   156: ixor
    //   157: goto -> 168
    //   160: ldc2_w 1591270890
    //   163: l2i
    //   164: ldc_w -1357407260
    //   167: ixor
    //   168: ldc2_w -464552127
    //   171: l2i
    //   172: ldc_w 1768907058
    //   175: ixor
    //   176: ixor
    //   177: lookupswitch default -> 212, -1075837110 -> 160, 2096060541 -> 204
    //   204: putstatic bigname/zprestige/webhack/features/modules/Combat/HoleFiller.surroundOffset : [Lnet/minecraft/util/math/BlockPos;
    //   207: return
    //   208: aconst_null
    //   209: athrow
    //   210: aconst_null
    //   211: athrow
    //   212: aconst_null
    //   213: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\HoleFiller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */