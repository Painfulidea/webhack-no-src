package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.List;
import java.util.Map;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AntiPiston extends Module {
  public boolean hasOffhand;
  
  public int blocksThisTick;
  
  public Setting<Integer> blocksPerTick;
  
  public Setting<Boolean> extra;
  
  public Setting<Integer> delay;
  
  public Timer timer;
  
  public Map<BlockPos, Integer> retries;
  
  public BlockPos renderPos;
  
  public static AntiPiston INSTANCE;
  
  public Setting<Boolean> rotate;
  
  public boolean isSneaking;
  
  public Setting<Boolean> extraExtra;
  
  public Timer offTimer;
  
  public Setting<Boolean> packet;
  
  public Timer retryTimer;
  
  public void doPlacements() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3478
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3470
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3462
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 1178348273
    //   33: l2i
    //   34: ldc 1960200061
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -188464882
    //   43: l2i
    //   44: ldc -152920151
    //   46: ixor
    //   47: ldc2_w 308918320
    //   50: l2i
    //   51: ldc 633667820
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 3381, 88528208 -> 40, 898262651 -> 80
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -1230098897
    //   90: l2i
    //   91: ldc -948734634
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -2042705104
    //   100: l2i
    //   101: ldc 1626485265
    //   103: ixor
    //   104: ldc2_w 149316140
    //   107: l2i
    //   108: ldc -1180434647
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1063729540 -> 3383, -1015468961 -> 97
    //   140: goto -> 144
    //   143: athrow
    //   144: invokespecial check : ()Z
    //   147: goto -> 151
    //   150: athrow
    //   151: ifeq -> 164
    //   154: ldc2_w -1650809585
    //   157: l2i
    //   158: ldc -1793372426
    //   160: ixor
    //   161: goto -> 171
    //   164: ldc2_w 823129988
    //   167: l2i
    //   168: ldc 965614716
    //   170: ixor
    //   171: ldc2_w -1035300156
    //   174: l2i
    //   175: ldc 244719035
    //   177: ixor
    //   178: ixor
    //   179: tableswitch default -> 154, -1000512378 -> 200, -1000512377 -> 201
    //   200: return
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -1967263022
    //   210: l2i
    //   211: ldc -154139544
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1144761399
    //   220: l2i
    //   221: ldc -169473274
    //   223: ixor
    //   224: ldc2_w 1515019016
    //   227: l2i
    //   228: ldc -891249825
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -493819752 -> 217, -322947347 -> 3409
    //   260: aload_0
    //   261: getstatic Perryc.c : I
    //   264: iflt -> 277
    //   267: ldc2_w -688754381
    //   270: l2i
    //   271: ldc -1010858421
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w -1662760539
    //   280: l2i
    //   281: ldc 2051408681
    //   283: ixor
    //   284: ldc2_w -935098976
    //   287: l2i
    //   288: ldc 1633936486
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 320, -2116447293 -> 277, -1133668674 -> 3365
    //   320: goto -> 324
    //   323: athrow
    //   324: invokespecial getPositions : ()Ljava/util/List;
    //   327: goto -> 331
    //   330: athrow
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w -1443423855
    //   340: l2i
    //   341: ldc 1844148667
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1065766652
    //   350: l2i
    //   351: ldc -1763966131
    //   353: ixor
    //   354: ldc2_w 1888512961
    //   357: l2i
    //   358: ldc -636681381
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 3429, -63382829 -> 388, 1853950128 -> 347
    //   388: goto -> 392
    //   391: athrow
    //   392: invokeinterface iterator : ()Ljava/util/Iterator;
    //   397: goto -> 401
    //   400: athrow
    //   401: getstatic Perryc.c : I
    //   404: iflt -> 417
    //   407: ldc2_w -555895882
    //   410: l2i
    //   411: ldc 1256144876
    //   413: ixor
    //   414: goto -> 424
    //   417: ldc2_w -552888838
    //   420: l2i
    //   421: ldc -1060469137
    //   423: ixor
    //   424: ldc2_w -1447815130
    //   427: l2i
    //   428: ldc 1227591992
    //   430: ixor
    //   431: ixor
    //   432: lookupswitch default -> 460, -370773628 -> 417, 1956447556 -> 3385
    //   460: astore_1
    //   461: getstatic Perryc.0 : I
    //   464: ifle -> 477
    //   467: ldc2_w -1044607149
    //   470: l2i
    //   471: ldc 1842802993
    //   473: ixor
    //   474: goto -> 484
    //   477: ldc2_w -1736178932
    //   480: l2i
    //   481: ldc 2131975514
    //   483: ixor
    //   484: ldc2_w 1546480637
    //   487: l2i
    //   488: ldc -173865044
    //   490: ixor
    //   491: ixor
    //   492: lookupswitch default -> 520, 98832947 -> 3447, 1614156432 -> 477
    //   520: aload_1
    //   521: getstatic Perryc.0 : I
    //   524: ifle -> 537
    //   527: ldc2_w 20715897
    //   530: l2i
    //   531: ldc 173661587
    //   533: ixor
    //   534: goto -> 544
    //   537: ldc2_w -1215131391
    //   540: l2i
    //   541: ldc 216657537
    //   543: ixor
    //   544: ldc2_w -1128016277
    //   547: l2i
    //   548: ldc 2055687052
    //   550: ixor
    //   551: ixor
    //   552: lookupswitch default -> 3389, -853452531 -> 537, 2101338727 -> 580
    //   580: goto -> 584
    //   583: athrow
    //   584: invokeinterface hasNext : ()Z
    //   589: goto -> 593
    //   592: athrow
    //   593: ifeq -> 606
    //   596: ldc2_w -156166644
    //   599: l2i
    //   600: ldc 1029527830
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w -2037036095
    //   609: l2i
    //   610: ldc 1299776730
    //   612: ixor
    //   613: ldc2_w 2101607914
    //   616: l2i
    //   617: ldc -315403912
    //   619: ixor
    //   620: ixor
    //   621: tableswitch default -> 596, 1537008520 -> 644, 1537008521 -> 3362
    //   644: getstatic Perryc.c : I
    //   647: iflt -> 660
    //   650: ldc2_w 1406016187
    //   653: l2i
    //   654: ldc -1573124162
    //   656: ixor
    //   657: goto -> 667
    //   660: ldc2_w 108002959
    //   663: l2i
    //   664: ldc 1977802408
    //   666: ixor
    //   667: ldc2_w -1553101971
    //   670: l2i
    //   671: ldc -1638027952
    //   673: ixor
    //   674: ixor
    //   675: lookupswitch default -> 700, -1861261025 -> 660, -859686088 -> 3423
    //   700: aload_1
    //   701: getstatic Perryc.1 : I
    //   704: ifeq -> 717
    //   707: ldc2_w -837436395
    //   710: l2i
    //   711: ldc -1740301822
    //   713: ixor
    //   714: goto -> 724
    //   717: ldc2_w 920007030
    //   720: l2i
    //   721: ldc 765129846
    //   723: ixor
    //   724: ldc2_w -725136190
    //   727: l2i
    //   728: ldc 52284863
    //   730: ixor
    //   731: ixor
    //   732: lookupswitch default -> 3431, -2121652374 -> 717, -862567299 -> 760
    //   760: goto -> 764
    //   763: athrow
    //   764: invokeinterface next : ()Ljava/lang/Object;
    //   769: goto -> 773
    //   772: athrow
    //   773: checkcast net/minecraft/util/math/BlockPos
    //   776: getstatic Perryc.c : I
    //   779: iflt -> 792
    //   782: ldc2_w -1484320104
    //   785: l2i
    //   786: ldc 576201614
    //   788: ixor
    //   789: goto -> 799
    //   792: ldc2_w -1553836238
    //   795: l2i
    //   796: ldc 1210675824
    //   798: ixor
    //   799: ldc2_w 1914278695
    //   802: l2i
    //   803: ldc -960072090
    //   805: ixor
    //   806: ixor
    //   807: lookupswitch default -> 3371, 822137943 -> 792, 1603584003 -> 832
    //   832: astore_2
    //   833: getstatic Perryc.c : I
    //   836: iflt -> 849
    //   839: ldc2_w -1267247714
    //   842: l2i
    //   843: ldc 1043448483
    //   845: ixor
    //   846: goto -> 856
    //   849: ldc2_w 1952621234
    //   852: l2i
    //   853: ldc -2003521160
    //   855: ixor
    //   856: ldc2_w 1356788591
    //   859: l2i
    //   860: ldc 1995248022
    //   862: ixor
    //   863: ixor
    //   864: lookupswitch default -> 3425, -1401588284 -> 849, -624561869 -> 892
    //   892: aload_2
    //   893: ldc2_w -191046933
    //   896: l2i
    //   897: ldc -191046933
    //   899: ixor
    //   900: getstatic Perryc.c : I
    //   903: iflt -> 916
    //   906: ldc2_w -1394279909
    //   909: l2i
    //   910: ldc 1611508110
    //   912: ixor
    //   913: goto -> 923
    //   916: ldc2_w -1399214756
    //   919: l2i
    //   920: ldc 1508175471
    //   922: ixor
    //   923: ldc2_w -580313408
    //   926: l2i
    //   927: ldc -1579599092
    //   929: ixor
    //   930: ixor
    //   931: lookupswitch default -> 3369, -1983027457 -> 956, -1336314279 -> 916
    //   956: goto -> 960
    //   959: athrow
    //   960: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   963: goto -> 967
    //   966: athrow
    //   967: getstatic Perryc.c : I
    //   970: iflt -> 983
    //   973: ldc2_w -835892241
    //   976: l2i
    //   977: ldc 1918401333
    //   979: ixor
    //   980: goto -> 990
    //   983: ldc2_w 5857869
    //   986: l2i
    //   987: ldc -314525003
    //   989: ixor
    //   990: ldc2_w 290077307
    //   993: l2i
    //   994: ldc -969237181
    //   996: ixor
    //   997: ixor
    //   998: lookupswitch default -> 1024, -1788866295 -> 983, 1795528674 -> 3437
    //   1024: istore_3
    //   1025: getstatic Perryc.0 : I
    //   1028: ifle -> 1041
    //   1031: ldc2_w 1680025766
    //   1034: l2i
    //   1035: ldc -1160559351
    //   1037: ixor
    //   1038: goto -> 1049
    //   1041: ldc2_w 382273853
    //   1044: l2i
    //   1045: ldc_w 1823346530
    //   1048: ixor
    //   1049: ldc2_w 1663480855
    //   1052: l2i
    //   1053: ldc_w -1430522555
    //   1056: ixor
    //   1057: ixor
    //   1058: lookupswitch default -> 1084, 393030909 -> 3375, 1454688152 -> 1041
    //   1084: iload_3
    //   1085: ldc2_w -1970674360
    //   1088: l2i
    //   1089: ldc_w -1970674359
    //   1092: ixor
    //   1093: if_icmpne -> 1107
    //   1096: ldc2_w -1450063153
    //   1099: l2i
    //   1100: ldc_w 1180398114
    //   1103: ixor
    //   1104: goto -> 1115
    //   1107: ldc2_w -1389745694
    //   1110: l2i
    //   1111: ldc_w 1122013454
    //   1114: ixor
    //   1115: ldc2_w 1118934466
    //   1118: l2i
    //   1119: ldc_w -1071407035
    //   1122: ixor
    //   1123: ixor
    //   1124: tableswitch default -> 1096, 1834519914 -> 1148, 1834519915 -> 3038
    //   1148: getstatic Perryc.1 : I
    //   1151: ifeq -> 1165
    //   1154: ldc2_w -1625439093
    //   1157: l2i
    //   1158: ldc_w -1671125221
    //   1161: ixor
    //   1162: goto -> 1173
    //   1165: ldc2_w -772301831
    //   1168: l2i
    //   1169: ldc_w 1511917922
    //   1172: ixor
    //   1173: ldc2_w -173447189
    //   1176: l2i
    //   1177: ldc_w 1716866128
    //   1180: ixor
    //   1181: ixor
    //   1182: lookupswitch default -> 1208, -1870313429 -> 3401, -826648143 -> 1165
    //   1208: aload_0
    //   1209: getstatic Perryc.0 : I
    //   1212: ifle -> 1226
    //   1215: ldc2_w 1574897575
    //   1218: l2i
    //   1219: ldc_w -2115976509
    //   1222: ixor
    //   1223: goto -> 1234
    //   1226: ldc2_w 1365634087
    //   1229: l2i
    //   1230: ldc_w 1601504552
    //   1233: ixor
    //   1234: ldc2_w 799975470
    //   1237: l2i
    //   1238: ldc_w -453785207
    //   1241: ixor
    //   1242: ixor
    //   1243: lookupswitch default -> 3439, -984774488 -> 1268, 392340675 -> 1226
    //   1268: getfield retries : Ljava/util/Map;
    //   1271: getstatic Perryc.1 : I
    //   1274: ifeq -> 1288
    //   1277: ldc2_w -1159416623
    //   1280: l2i
    //   1281: ldc_w 389604880
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w -816182020
    //   1291: l2i
    //   1292: ldc_w 1995668871
    //   1295: ixor
    //   1296: ldc2_w -1696102818
    //   1299: l2i
    //   1300: ldc_w 1353369295
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1332, 1074877319 -> 1288, 1737560656 -> 3413
    //   1332: aload_2
    //   1333: getstatic Perryc.0 : I
    //   1336: ifle -> 1350
    //   1339: ldc2_w 111504455
    //   1342: l2i
    //   1343: ldc_w 130041522
    //   1346: ixor
    //   1347: goto -> 1358
    //   1350: ldc2_w 317484249
    //   1353: l2i
    //   1354: ldc_w -993051384
    //   1357: ixor
    //   1358: ldc2_w 221060321
    //   1361: l2i
    //   1362: ldc_w 357379133
    //   1365: ixor
    //   1366: ixor
    //   1367: lookupswitch default -> 3419, -834445043 -> 1392, 419764777 -> 1350
    //   1392: goto -> 1396
    //   1395: athrow
    //   1396: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1401: goto -> 1405
    //   1404: athrow
    //   1405: ifnull -> 1419
    //   1408: ldc2_w 1626371068
    //   1411: l2i
    //   1412: ldc_w -302964442
    //   1415: ixor
    //   1416: goto -> 1427
    //   1419: ldc2_w -1014450332
    //   1422: l2i
    //   1423: ldc_w 1317660095
    //   1426: ixor
    //   1427: ldc2_w 580275252
    //   1430: l2i
    //   1431: ldc_w 576644628
    //   1434: ixor
    //   1435: ixor
    //   1436: tableswitch default -> 1408, -1916143366 -> 1460, -1916143365 -> 1852
    //   1460: getstatic Perryc.c : I
    //   1463: iflt -> 1477
    //   1466: ldc2_w -200890895
    //   1469: l2i
    //   1470: ldc_w -1002903141
    //   1473: ixor
    //   1474: goto -> 1485
    //   1477: ldc2_w 935822869
    //   1480: l2i
    //   1481: ldc_w -139317436
    //   1484: ixor
    //   1485: ldc2_w 144345242
    //   1488: l2i
    //   1489: ldc_w -1268925828
    //   1492: ixor
    //   1493: ixor
    //   1494: lookupswitch default -> 1520, -1929806196 -> 3363, 637449121 -> 1477
    //   1520: aload_0
    //   1521: getstatic Perryc.1 : I
    //   1524: ifeq -> 1538
    //   1527: ldc2_w -14100712
    //   1530: l2i
    //   1531: ldc_w 879936711
    //   1534: ixor
    //   1535: goto -> 1546
    //   1538: ldc2_w -1872866249
    //   1541: l2i
    //   1542: ldc_w -1663502962
    //   1545: ixor
    //   1546: ldc2_w -504376064
    //   1549: l2i
    //   1550: ldc_w 949810052
    //   1553: ixor
    //   1554: ixor
    //   1555: lookupswitch default -> 3377, -705329347 -> 1580, 304690523 -> 1538
    //   1580: getfield retries : Ljava/util/Map;
    //   1583: getstatic Perryc.0 : I
    //   1586: ifle -> 1600
    //   1589: ldc2_w 1543618099
    //   1592: l2i
    //   1593: ldc_w 80958480
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 980333213
    //   1603: l2i
    //   1604: ldc_w 2099536872
    //   1607: ixor
    //   1608: ldc2_w 1312247313
    //   1611: l2i
    //   1612: ldc_w -1514882913
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 3395, -1396103173 -> 1644, -1286529875 -> 1600
    //   1644: aload_2
    //   1645: getstatic Perryc.0 : I
    //   1648: ifle -> 1662
    //   1651: ldc2_w -1603751446
    //   1654: l2i
    //   1655: ldc_w 75031176
    //   1658: ixor
    //   1659: goto -> 1670
    //   1662: ldc2_w 476830433
    //   1665: l2i
    //   1666: ldc_w 1899026554
    //   1669: ixor
    //   1670: ldc2_w 1868274868
    //   1673: l2i
    //   1674: ldc_w 1202864373
    //   1677: ixor
    //   1678: ixor
    //   1679: lookupswitch default -> 3421, -1929801949 -> 1662, 1169350362 -> 1704
    //   1704: goto -> 1708
    //   1707: athrow
    //   1708: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1713: goto -> 1717
    //   1716: athrow
    //   1717: checkcast java/lang/Integer
    //   1720: getstatic Perryc.c : I
    //   1723: iflt -> 1737
    //   1726: ldc2_w 999038771
    //   1729: l2i
    //   1730: ldc_w -333411224
    //   1733: ixor
    //   1734: goto -> 1745
    //   1737: ldc2_w 507972418
    //   1740: l2i
    //   1741: ldc_w -276468964
    //   1744: ixor
    //   1745: ldc2_w 1326703080
    //   1748: l2i
    //   1749: ldc_w 690064072
    //   1752: ixor
    //   1753: ixor
    //   1754: lookupswitch default -> 1780, -1314981765 -> 3415, 1470341531 -> 1737
    //   1780: goto -> 1784
    //   1783: athrow
    //   1784: invokevirtual intValue : ()I
    //   1787: goto -> 1791
    //   1790: athrow
    //   1791: ldc2_w -982537479
    //   1794: l2i
    //   1795: ldc_w -982537475
    //   1798: ixor
    //   1799: if_icmpge -> 1813
    //   1802: ldc2_w 399985583
    //   1805: l2i
    //   1806: ldc_w 1290946186
    //   1809: ixor
    //   1810: goto -> 1821
    //   1813: ldc2_w 1119645521
    //   1816: l2i
    //   1817: ldc_w 429482613
    //   1820: ixor
    //   1821: ldc2_w 504975006
    //   1824: l2i
    //   1825: ldc_w 1407789913
    //   1828: ixor
    //   1829: ixor
    //   1830: tableswitch default -> 1802, 383084770 -> 1852, 383084771 -> 3038
    //   1852: getstatic Perryc.c : I
    //   1855: iflt -> 1869
    //   1858: ldc2_w 111350628
    //   1861: l2i
    //   1862: ldc_w -476367983
    //   1865: ixor
    //   1866: goto -> 1877
    //   1869: ldc2_w -1256847242
    //   1872: l2i
    //   1873: ldc_w 733082859
    //   1876: ixor
    //   1877: ldc2_w 1919270696
    //   1880: l2i
    //   1881: ldc_w -1307638524
    //   1884: ixor
    //   1885: ixor
    //   1886: lookupswitch default -> 1912, -120871161 -> 1869, 626170585 -> 3441
    //   1912: aload_0
    //   1913: getstatic Perryc.1 : I
    //   1916: ifeq -> 1930
    //   1919: ldc2_w 1405996378
    //   1922: l2i
    //   1923: ldc_w -724397893
    //   1926: ixor
    //   1927: goto -> 1938
    //   1930: ldc2_w -360048601
    //   1933: l2i
    //   1934: ldc_w -444748211
    //   1937: ixor
    //   1938: ldc2_w -776058739
    //   1941: l2i
    //   1942: ldc_w 1253250299
    //   1945: ixor
    //   1946: ixor
    //   1947: lookupswitch default -> 1972, 448404311 -> 1930, 470942103 -> 3391
    //   1972: aload_2
    //   1973: getstatic Perryc.1 : I
    //   1976: ifeq -> 1990
    //   1979: ldc2_w 1459165442
    //   1982: l2i
    //   1983: ldc_w -547283982
    //   1986: ixor
    //   1987: goto -> 1998
    //   1990: ldc2_w -994991005
    //   1993: l2i
    //   1994: ldc_w 1694273608
    //   1997: ixor
    //   1998: ldc2_w 53924639
    //   2001: l2i
    //   2002: ldc_w -1729080260
    //   2005: ixor
    //   2006: ixor
    //   2007: lookupswitch default -> 2032, -1514304580 -> 1990, 308184531 -> 3393
    //   2032: goto -> 2036
    //   2035: athrow
    //   2036: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   2039: goto -> 2043
    //   2042: athrow
    //   2043: getstatic Perryc.1 : I
    //   2046: ifeq -> 2060
    //   2049: ldc2_w -2146716423
    //   2052: l2i
    //   2053: ldc_w 870818422
    //   2056: ixor
    //   2057: goto -> 2068
    //   2060: ldc2_w -290562010
    //   2063: l2i
    //   2064: ldc_w -124472307
    //   2067: ixor
    //   2068: ldc2_w -631336461
    //   2071: l2i
    //   2072: ldc_w 183914856
    //   2075: ixor
    //   2076: ixor
    //   2077: lookupswitch default -> 3443, -963504976 -> 2104, 1665455636 -> 2060
    //   2104: aload_0
    //   2105: getstatic Perryc.1 : I
    //   2108: ifeq -> 2122
    //   2111: ldc2_w 1757519801
    //   2114: l2i
    //   2115: ldc_w -1770632437
    //   2118: ixor
    //   2119: goto -> 2130
    //   2122: ldc2_w -129794665
    //   2125: l2i
    //   2126: ldc_w -1574132838
    //   2129: ixor
    //   2130: ldc2_w -40258418
    //   2133: l2i
    //   2134: ldc_w -1208880679
    //   2137: ixor
    //   2138: ixor
    //   2139: lookupswitch default -> 2164, -1441469972 -> 2122, -1260416539 -> 3367
    //   2164: getfield retries : Ljava/util/Map;
    //   2167: getstatic Perryc.0 : I
    //   2170: ifle -> 2184
    //   2173: ldc2_w 327636124
    //   2176: l2i
    //   2177: ldc_w 845847517
    //   2180: ixor
    //   2181: goto -> 2192
    //   2184: ldc2_w 1590056362
    //   2187: l2i
    //   2188: ldc_w -521811753
    //   2191: ixor
    //   2192: ldc2_w 618297762
    //   2195: l2i
    //   2196: ldc_w -623444874
    //   2199: ixor
    //   2200: ixor
    //   2201: lookupswitch default -> 2228, -538883435 -> 3405, 1019476274 -> 2184
    //   2228: aload_2
    //   2229: getstatic Perryc.c : I
    //   2232: iflt -> 2246
    //   2235: ldc2_w 2047350053
    //   2238: l2i
    //   2239: ldc_w 1954706283
    //   2242: ixor
    //   2243: goto -> 2254
    //   2246: ldc2_w -64974748
    //   2249: l2i
    //   2250: ldc_w 2084290699
    //   2253: ixor
    //   2254: ldc2_w 755266416
    //   2257: l2i
    //   2258: ldc_w 225252072
    //   2261: ixor
    //   2262: ixor
    //   2263: lookupswitch default -> 3407, -1603128969 -> 2288, 786630614 -> 2246
    //   2288: aload_0
    //   2289: getstatic Perryc.c : I
    //   2292: iflt -> 2306
    //   2295: ldc2_w -2117100344
    //   2298: l2i
    //   2299: ldc_w -1422210486
    //   2302: ixor
    //   2303: goto -> 2314
    //   2306: ldc2_w -2079169036
    //   2309: l2i
    //   2310: ldc_w 1764253007
    //   2313: ixor
    //   2314: ldc2_w -918074339
    //   2317: l2i
    //   2318: ldc_w 289295920
    //   2321: ixor
    //   2322: ixor
    //   2323: lookupswitch default -> 2348, -781498054 -> 2306, -225684305 -> 3373
    //   2348: getfield retries : Ljava/util/Map;
    //   2351: getstatic Perryc.0 : I
    //   2354: ifle -> 2368
    //   2357: ldc2_w 300971988
    //   2360: l2i
    //   2361: ldc_w -1865119726
    //   2364: ixor
    //   2365: goto -> 2376
    //   2368: ldc2_w -1563099197
    //   2371: l2i
    //   2372: ldc_w 2026556784
    //   2375: ixor
    //   2376: ldc2_w 1023461790
    //   2379: l2i
    //   2380: ldc_w 1355166645
    //   2383: ixor
    //   2384: ixor
    //   2385: lookupswitch default -> 2412, -983552740 -> 2368, -320731667 -> 3451
    //   2412: aload_2
    //   2413: getstatic Perryc.0 : I
    //   2416: ifle -> 2430
    //   2419: ldc2_w -764381313
    //   2422: l2i
    //   2423: ldc_w 935676205
    //   2426: ixor
    //   2427: goto -> 2438
    //   2430: ldc2_w -835748913
    //   2433: l2i
    //   2434: ldc_w -840767930
    //   2437: ixor
    //   2438: ldc2_w -1392980044
    //   2441: l2i
    //   2442: ldc_w -1986820431
    //   2445: ixor
    //   2446: ixor
    //   2447: lookupswitch default -> 2472, -1059162281 -> 3433, 718005085 -> 2430
    //   2472: goto -> 2476
    //   2475: athrow
    //   2476: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2481: goto -> 2485
    //   2484: athrow
    //   2485: ifnonnull -> 2499
    //   2488: ldc2_w -836119225
    //   2491: l2i
    //   2492: ldc_w -7872550
    //   2495: ixor
    //   2496: goto -> 2507
    //   2499: ldc2_w -1570975669
    //   2502: l2i
    //   2503: ldc_w -1812800823
    //   2506: ixor
    //   2507: ldc2_w 609977331
    //   2510: l2i
    //   2511: ldc_w -1722975423
    //   2514: ixor
    //   2515: ixor
    //   2516: tableswitch default -> 2488, -1934036433 -> 2540, -1934036432 -> 2551
    //   2540: ldc2_w -301385765
    //   2543: l2i
    //   2544: ldc_w -301385766
    //   2547: ixor
    //   2548: goto -> 2892
    //   2551: getstatic Perryc.c : I
    //   2554: iflt -> 2568
    //   2557: ldc2_w -1772070505
    //   2560: l2i
    //   2561: ldc_w 161658704
    //   2564: ixor
    //   2565: goto -> 2576
    //   2568: ldc2_w 1744115348
    //   2571: l2i
    //   2572: ldc_w -1573717397
    //   2575: ixor
    //   2576: ldc2_w 413590356
    //   2579: l2i
    //   2580: ldc_w -935957036
    //   2583: ixor
    //   2584: ixor
    //   2585: lookupswitch default -> 2612, -812645164 -> 2568, 1330798663 -> 3397
    //   2612: aload_0
    //   2613: getstatic Perryc.c : I
    //   2616: iflt -> 2630
    //   2619: ldc2_w -1638316402
    //   2622: l2i
    //   2623: ldc_w 1869446734
    //   2626: ixor
    //   2627: goto -> 2638
    //   2630: ldc2_w -864292072
    //   2633: l2i
    //   2634: ldc_w 1747168613
    //   2637: ixor
    //   2638: ldc2_w 49353433
    //   2641: l2i
    //   2642: ldc_w -781973411
    //   2645: ixor
    //   2646: ixor
    //   2647: lookupswitch default -> 2672, 580985412 -> 3435, 697219006 -> 2630
    //   2672: getfield retries : Ljava/util/Map;
    //   2675: getstatic Perryc.1 : I
    //   2678: ifeq -> 2692
    //   2681: ldc2_w -1757960437
    //   2684: l2i
    //   2685: ldc_w 1136173461
    //   2688: ixor
    //   2689: goto -> 2700
    //   2692: ldc2_w -1433345578
    //   2695: l2i
    //   2696: ldc_w -1693363224
    //   2699: ixor
    //   2700: ldc2_w 474349568
    //   2703: l2i
    //   2704: ldc_w -1485736149
    //   2707: ixor
    //   2708: ixor
    //   2709: lookupswitch default -> 3399, -1967733483 -> 2736, 1874358709 -> 2692
    //   2736: aload_2
    //   2737: getstatic Perryc.0 : I
    //   2740: ifle -> 2754
    //   2743: ldc2_w 879780271
    //   2746: l2i
    //   2747: ldc_w 398169864
    //   2750: ixor
    //   2751: goto -> 2762
    //   2754: ldc2_w 596909864
    //   2757: l2i
    //   2758: ldc_w 430798538
    //   2761: ixor
    //   2762: ldc2_w 1121225646
    //   2765: l2i
    //   2766: ldc_w 1707618265
    //   2769: ixor
    //   2770: ixor
    //   2771: lookupswitch default -> 3387, 81220304 -> 2754, 489016725 -> 2796
    //   2796: goto -> 2800
    //   2799: athrow
    //   2800: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2805: goto -> 2809
    //   2808: athrow
    //   2809: checkcast java/lang/Integer
    //   2812: getstatic Perryc.0 : I
    //   2815: ifle -> 2829
    //   2818: ldc2_w 1700780427
    //   2821: l2i
    //   2822: ldc_w 1023144939
    //   2825: ixor
    //   2826: goto -> 2837
    //   2829: ldc2_w 297515923
    //   2832: l2i
    //   2833: ldc_w 1432954534
    //   2836: ixor
    //   2837: ldc2_w 979803129
    //   2840: l2i
    //   2841: ldc_w 1098804733
    //   2844: ixor
    //   2845: ixor
    //   2846: lookupswitch default -> 3379, 582802532 -> 2829, 1070230321 -> 2872
    //   2872: goto -> 2876
    //   2875: athrow
    //   2876: invokevirtual intValue : ()I
    //   2879: goto -> 2883
    //   2882: athrow
    //   2883: ldc2_w -1480802701
    //   2886: l2i
    //   2887: ldc_w -1480802702
    //   2890: ixor
    //   2891: iadd
    //   2892: getstatic Perryc.c : I
    //   2895: iflt -> 2909
    //   2898: ldc2_w 1747025639
    //   2901: l2i
    //   2902: ldc_w 524157579
    //   2905: ixor
    //   2906: goto -> 2917
    //   2909: ldc2_w -1420169788
    //   2912: l2i
    //   2913: ldc_w 237399029
    //   2916: ixor
    //   2917: ldc2_w 828688573
    //   2920: l2i
    //   2921: ldc_w 822256025
    //   2924: ixor
    //   2925: ixor
    //   2926: lookupswitch default -> 3403, -1525027051 -> 2952, 2004424008 -> 2909
    //   2952: goto -> 2956
    //   2955: athrow
    //   2956: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2959: goto -> 2963
    //   2962: athrow
    //   2963: getstatic Perryc.c : I
    //   2966: iflt -> 2980
    //   2969: ldc2_w -1683609978
    //   2972: l2i
    //   2973: ldc_w 1702905685
    //   2976: ixor
    //   2977: goto -> 2988
    //   2980: ldc2_w -518126393
    //   2983: l2i
    //   2984: ldc_w 1966773435
    //   2987: ixor
    //   2988: ldc2_w -1223941803
    //   2991: l2i
    //   2992: ldc_w 704915904
    //   2995: ixor
    //   2996: ixor
    //   2997: lookupswitch default -> 3427, 153917673 -> 3024, 1663985990 -> 2980
    //   3024: goto -> 3028
    //   3027: athrow
    //   3028: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3033: goto -> 3037
    //   3036: athrow
    //   3037: pop
    //   3038: getstatic Perryc.1 : I
    //   3041: ifeq -> 3055
    //   3044: ldc2_w -701540681
    //   3047: l2i
    //   3048: ldc_w 1771345983
    //   3051: ixor
    //   3052: goto -> 3063
    //   3055: ldc2_w -167439734
    //   3058: l2i
    //   3059: ldc_w -1977786873
    //   3062: ixor
    //   3063: ldc2_w -1890257781
    //   3066: l2i
    //   3067: ldc_w -365536433
    //   3070: ixor
    //   3071: ixor
    //   3072: lookupswitch default -> 3449, -623287988 -> 3055, 427483977 -> 3100
    //   3100: iload_3
    //   3101: ldc2_w -671009684
    //   3104: l2i
    //   3105: ldc_w -671009681
    //   3108: ixor
    //   3109: if_icmpeq -> 3123
    //   3112: ldc2_w 1560496767
    //   3115: l2i
    //   3116: ldc_w -188667863
    //   3119: ixor
    //   3120: goto -> 3131
    //   3123: ldc2_w 401727209
    //   3126: l2i
    //   3127: ldc_w -1103905604
    //   3130: ixor
    //   3131: ldc2_w -660716363
    //   3134: l2i
    //   3135: ldc_w -18939286
    //   3138: ixor
    //   3139: ixor
    //   3140: tableswitch default -> 3112, -1887230839 -> 3164, -1887230838 -> 3167
    //   3164: goto -> 461
    //   3167: getstatic Perryc.c : I
    //   3170: iflt -> 3184
    //   3173: ldc2_w -1594725747
    //   3176: l2i
    //   3177: ldc_w -1744544761
    //   3180: ixor
    //   3181: goto -> 3192
    //   3184: ldc2_w -1085022704
    //   3187: l2i
    //   3188: ldc_w 976581715
    //   3191: ixor
    //   3192: ldc2_w 1117841236
    //   3195: l2i
    //   3196: ldc_w -155996845
    //   3199: ixor
    //   3200: ixor
    //   3201: lookupswitch default -> 3445, -1931117427 -> 3184, 829808708 -> 3228
    //   3228: aload_0
    //   3229: getstatic Perryc.1 : I
    //   3232: ifeq -> 3246
    //   3235: ldc2_w -388242068
    //   3238: l2i
    //   3239: ldc_w 474224295
    //   3242: ixor
    //   3243: goto -> 3254
    //   3246: ldc2_w -1373326429
    //   3249: l2i
    //   3250: ldc_w 983133868
    //   3253: ixor
    //   3254: ldc2_w 691797059
    //   3257: l2i
    //   3258: ldc_w 1973831807
    //   3261: ixor
    //   3262: ixor
    //   3263: lookupswitch default -> 3417, -1476245513 -> 3246, -937400013 -> 3288
    //   3288: aload_2
    //   3289: getstatic Perryc.1 : I
    //   3292: ifeq -> 3306
    //   3295: ldc2_w 591965098
    //   3298: l2i
    //   3299: ldc_w -861864829
    //   3302: ixor
    //   3303: goto -> 3314
    //   3306: ldc2_w 643795119
    //   3309: l2i
    //   3310: ldc_w -499215362
    //   3313: ixor
    //   3314: ldc2_w 1725769462
    //   3317: l2i
    //   3318: ldc_w 487608181
    //   3321: ixor
    //   3322: ixor
    //   3323: lookupswitch default -> 3348, -1809498454 -> 3411, 10263999 -> 3306
    //   3348: goto -> 3352
    //   3351: athrow
    //   3352: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   3355: goto -> 3359
    //   3358: athrow
    //   3359: goto -> 461
    //   3362: return
    //   3363: aconst_null
    //   3364: athrow
    //   3365: aconst_null
    //   3366: athrow
    //   3367: aconst_null
    //   3368: athrow
    //   3369: aconst_null
    //   3370: athrow
    //   3371: aconst_null
    //   3372: athrow
    //   3373: aconst_null
    //   3374: athrow
    //   3375: aconst_null
    //   3376: athrow
    //   3377: aconst_null
    //   3378: athrow
    //   3379: aconst_null
    //   3380: athrow
    //   3381: aconst_null
    //   3382: athrow
    //   3383: aconst_null
    //   3384: athrow
    //   3385: aconst_null
    //   3386: athrow
    //   3387: aconst_null
    //   3388: athrow
    //   3389: aconst_null
    //   3390: athrow
    //   3391: aconst_null
    //   3392: athrow
    //   3393: aconst_null
    //   3394: athrow
    //   3395: aconst_null
    //   3396: athrow
    //   3397: aconst_null
    //   3398: athrow
    //   3399: aconst_null
    //   3400: athrow
    //   3401: aconst_null
    //   3402: athrow
    //   3403: aconst_null
    //   3404: athrow
    //   3405: aconst_null
    //   3406: athrow
    //   3407: aconst_null
    //   3408: athrow
    //   3409: aconst_null
    //   3410: athrow
    //   3411: aconst_null
    //   3412: athrow
    //   3413: aconst_null
    //   3414: athrow
    //   3415: aconst_null
    //   3416: athrow
    //   3417: aconst_null
    //   3418: athrow
    //   3419: aconst_null
    //   3420: athrow
    //   3421: aconst_null
    //   3422: athrow
    //   3423: aconst_null
    //   3424: athrow
    //   3425: aconst_null
    //   3426: athrow
    //   3427: aconst_null
    //   3428: athrow
    //   3429: aconst_null
    //   3430: athrow
    //   3431: aconst_null
    //   3432: athrow
    //   3433: aconst_null
    //   3434: athrow
    //   3435: aconst_null
    //   3436: athrow
    //   3437: aconst_null
    //   3438: athrow
    //   3439: aconst_null
    //   3440: athrow
    //   3441: aconst_null
    //   3442: athrow
    //   3443: aconst_null
    //   3444: athrow
    //   3445: aconst_null
    //   3446: athrow
    //   3447: aconst_null
    //   3448: athrow
    //   3449: aconst_null
    //   3450: athrow
    //   3451: aconst_null
    //   3452: athrow
    //   3453: pop
    //   3454: goto -> 24
    //   3457: pop
    //   3458: aconst_null
    //   3459: goto -> 3453
    //   3462: dup
    //   3463: ifnull -> 3453
    //   3466: checkcast java/lang/Throwable
    //   3469: athrow
    //   3470: dup
    //   3471: ifnull -> 3457
    //   3474: checkcast java/lang/Throwable
    //   3477: athrow
    //   3478: aconst_null
    //   3479: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1025	2334	3	placeability	I
    //   833	2526	2	position	Lnet/minecraft/util/math/BlockPos;
    //   24	3339	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    // Exception table:
    //   from	to	target	type
    //   8	20	3462	finally
    //   143	150	150	finally
    //   143	150	150	java/lang/IllegalStateException
    //   143	150	143	finally
    //   144	150	3	java/lang/IndexOutOfBoundsException
    //   144	150	150	java/util/ConcurrentModificationException
    //   323	330	330	finally
    //   323	330	323	finally
    //   323	330	323	java/lang/StringIndexOutOfBoundsException
    //   324	330	323	java/lang/IndexOutOfBoundsException
    //   324	330	3	java/lang/UnsupportedOperationException
    //   391	400	400	finally
    //   391	400	391	java/lang/IndexOutOfBoundsException
    //   391	400	391	java/lang/IllegalStateException
    //   392	400	400	java/lang/UnsupportedOperationException
    //   392	400	400	finally
    //   583	592	592	finally
    //   583	592	583	java/lang/EnumConstantNotPresentException
    //   583	592	592	finally
    //   583	592	3	finally
    //   583	592	3	java/util/ConcurrentModificationException
    //   763	772	772	finally
    //   763	772	763	java/lang/ArithmeticException
    //   763	772	763	finally
    //   764	772	763	java/lang/IllegalArgumentException
    //   764	772	772	java/lang/NegativeArraySizeException
    //   959	966	966	finally
    //   959	966	3	java/lang/NullPointerException
    //   959	966	966	finally
    //   960	966	959	finally
    //   960	966	3	java/lang/AssertionError
    //   1395	1404	1404	finally
    //   1395	1404	1395	finally
    //   1395	1404	3	finally
    //   1395	1404	3	java/lang/RuntimeException
    //   1396	1404	1395	java/lang/RuntimeException
    //   1707	1716	1716	finally
    //   1707	1716	1716	java/lang/ClassCastException
    //   1707	1716	1716	java/lang/AssertionError
    //   1708	1716	1707	java/lang/ArrayIndexOutOfBoundsException
    //   1708	1716	3	java/lang/StringIndexOutOfBoundsException
    //   1784	1790	1790	finally
    //   1784	1790	1790	java/lang/EnumConstantNotPresentException
    //   1784	1790	3	finally
    //   1784	1790	3	java/lang/ArrayIndexOutOfBoundsException
    //   1784	1790	1790	finally
    //   2035	2042	2042	finally
    //   2035	2042	3	finally
    //   2035	2042	3	java/lang/RuntimeException
    //   2035	2042	2035	java/lang/ClassCastException
    //   2036	2042	2035	finally
    //   2476	2484	2484	finally
    //   2476	2484	2484	java/lang/IllegalStateException
    //   2476	2484	2484	finally
    //   2476	2484	3	java/lang/RuntimeException
    //   2476	2484	3	finally
    //   2799	2808	2808	finally
    //   2799	2808	2799	java/lang/IllegalArgumentException
    //   2799	2808	2799	java/lang/UnsupportedOperationException
    //   2800	2808	2808	finally
    //   2800	2808	2808	java/lang/ArrayIndexOutOfBoundsException
    //   2875	2882	2882	finally
    //   2875	2882	2875	finally
    //   2875	2882	2882	finally
    //   2876	2882	2882	finally
    //   2876	2882	2875	finally
    //   2955	2962	2962	finally
    //   2955	2962	3	java/lang/StringIndexOutOfBoundsException
    //   2955	2962	2955	finally
    //   2955	2962	3	java/lang/NullPointerException
    //   2956	2962	2955	finally
    //   3027	3036	3036	finally
    //   3027	3036	3	java/lang/ArithmeticException
    //   3027	3036	3036	java/lang/ArithmeticException
    //   3028	3036	3036	java/lang/AssertionError
    //   3028	3036	3027	java/lang/ArrayIndexOutOfBoundsException
    //   3351	3358	3358	finally
    //   3351	3358	3358	finally
    //   3351	3358	3358	java/lang/NullPointerException
    //   3351	3358	3351	java/lang/StringIndexOutOfBoundsException
    //   3352	3358	3351	finally
    //   3462	3470	3462	finally
    //   3478	3480	3	java/lang/NullPointerException
  }
  
  public static AntiPiston getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -437356581
    //   33: l2i
    //   34: ldc_w -416641767
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -897585993
    //   44: l2i
    //   45: ldc_w -386640817
    //   48: ixor
    //   49: ldc2_w 944360217
    //   52: l2i
    //   53: ldc_w -364107611
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -792651394 -> 344, -466318300 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   87: ifnonnull -> 101
    //   90: ldc2_w -1252585414
    //   93: l2i
    //   94: ldc_w 968087387
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w 1436799492
    //   104: l2i
    //   105: ldc_w -649652894
    //   108: ixor
    //   109: ldc2_w -1362459889
    //   112: l2i
    //   113: ldc_w -1175849307
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, -1681411381 -> 140, -1681411380 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Combat/AntiPiston
    //   143: dup
    //   144: getstatic Perryc.0 : I
    //   147: ifle -> 161
    //   150: ldc2_w 2088514689
    //   153: l2i
    //   154: ldc_w -426747468
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 318252572
    //   164: l2i
    //   165: ldc_w -181149173
    //   168: ixor
    //   169: ldc2_w 933344488
    //   172: l2i
    //   173: ldc_w -203039614
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 204, 477218412 -> 161, 1588069727 -> 348
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 232
    //   221: ldc2_w -1263092436
    //   224: l2i
    //   225: ldc_w 1463424953
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1259956178
    //   235: l2i
    //   236: ldc_w 1940792446
    //   239: ixor
    //   240: ldc2_w 1518330087
    //   243: l2i
    //   244: ldc_w 166375444
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -1340474778 -> 350, 1533462500 -> 232
    //   276: putstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w 1195447706
    //   288: l2i
    //   289: ldc_w -107311905
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 1831093430
    //   299: l2i
    //   300: ldc_w -28167731
    //   303: ixor
    //   304: ldc2_w 504422469
    //   307: l2i
    //   308: ldc_w 287486885
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 346, -1673255269 -> 340, -1310078299 -> 296
    //   340: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   343: areturn
    //   344: aconst_null
    //   345: athrow
    //   346: aconst_null
    //   347: athrow
    //   348: aconst_null
    //   349: athrow
    //   350: aconst_null
    //   351: athrow
    //   352: pop
    //   353: goto -> 24
    //   356: pop
    //   357: aconst_null
    //   358: goto -> 352
    //   361: dup
    //   362: ifnull -> 352
    //   365: checkcast java/lang/Throwable
    //   368: athrow
    //   369: dup
    //   370: ifnull -> 356
    //   373: checkcast java/lang/Throwable
    //   376: athrow
    //   377: aconst_null
    //   378: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	361	java/lang/NumberFormatException
    //   207	214	214	finally
    //   207	214	3	finally
    //   207	214	207	java/lang/UnsupportedOperationException
    //   208	214	207	java/lang/AssertionError
    //   208	214	214	finally
    //   361	369	361	finally
    //   377	379	3	java/lang/IllegalArgumentException
  }
  
  public AntiPiston() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -2136460585
    //   9: l2i
    //   10: ldc_w 826888645
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 239309414
    //   20: l2i
    //   21: ldc_w 2106303873
    //   24: ixor
    //   25: ldc2_w 1875894396
    //   28: l2i
    //   29: ldc_w 1252452444
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 4738, -1802998990 -> 17, 1453408199 -> 60
    //   60: aload_0
    //   61: ldc_w '昭㌝晲㶾핛袹๪᮵蹬覛'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 517153492
    //   73: l2i
    //   74: ldc_w -393448272
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 906949510
    //   84: l2i
    //   85: ldc_w 817939866
    //   88: ixor
    //   89: ldc2_w -2057422937
    //   92: l2i
    //   93: ldc_w -1264792040
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -945967141 -> 4746, 200041678 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '昮㌊晣㷷핻袹๪᮵蹬覛'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -120930306
    //   139: l2i
    //   140: ldc_w -974882834
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1346134098
    //   150: l2i
    //   151: ldc_w -1750129442
    //   154: ixor
    //   155: ldc2_w 1185327925
    //   158: l2i
    //   159: ldc_w 1281662278
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -775718935 -> 147, 938278499 -> 4794
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -910365532
    //   204: l2i
    //   205: ldc_w -990115132
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -283538947
    //   215: l2i
    //   216: ldc_w -1163008576
    //   219: ixor
    //   220: ldc2_w 1719536285
    //   223: l2i
    //   224: ldc_w -1595618864
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 4814, -1825656976 -> 256, -874896083 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1373496512
    //   262: l2i
    //   263: ldc_w 1373496513
    //   266: ixor
    //   267: ldc2_w -1892697029
    //   270: l2i
    //   271: ldc_w -1892697029
    //   274: ixor
    //   275: ldc2_w 1876373472
    //   278: l2i
    //   279: ldc_w 1876373473
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -185787934
    //   292: l2i
    //   293: ldc_w -598933054
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1251032358
    //   303: l2i
    //   304: ldc_w -1686599166
    //   307: ixor
    //   308: ldc2_w 972814077
    //   311: l2i
    //   312: ldc_w 1745286834
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 4750, 2036144239 -> 300, 2146125975 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -1452563153
    //   356: l2i
    //   357: ldc_w 1369643417
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1408598082
    //   367: l2i
    //   368: ldc_w 267078290
    //   371: ixor
    //   372: ldc2_w 276063782
    //   375: l2i
    //   376: ldc_w -289315178
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, 60724954 -> 364, 108903430 -> 4742
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 2141845009
    //   418: l2i
    //   419: ldc_w -1951323067
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1819276253
    //   429: l2i
    //   430: ldc_w 161713238
    //   433: ixor
    //   434: ldc2_w -52080326
    //   437: l2i
    //   438: ldc_w -821159062
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -940339196 -> 4856, -187601363 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '昮㌟晩㶴할袣้ᮤ蹱覡?ਤꯟ'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w -632958764
    //   485: l2i
    //   486: ldc_w 561132624
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 442064904
    //   496: l2i
    //   497: ldc_w 129279547
    //   500: ixor
    //   501: ldc2_w -2050254259
    //   504: l2i
    //   505: ldc_w 654686167
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 4828, -1088164951 -> 536, 1509542174 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1676597790
    //   542: l2i
    //   543: ldc_w 1676597782
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 540052374
    //   556: l2i
    //   557: ldc_w 1952101933
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1428770490
    //   567: l2i
    //   568: ldc_w 665571973
    //   571: ixor
    //   572: ldc2_w 1428764551
    //   575: l2i
    //   576: ldc_w 1293810096
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -150816379 -> 564, 1281291148 -> 4752
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w -1428317632
    //   614: l2i
    //   615: ldc_w -1428317631
    //   618: ixor
    //   619: getstatic Perryc.1 : I
    //   622: ifeq -> 636
    //   625: ldc2_w -921880068
    //   628: l2i
    //   629: ldc_w 2043796798
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w -697694648
    //   639: l2i
    //   640: ldc_w 1780385005
    //   643: ixor
    //   644: ldc2_w 1656566890
    //   647: l2i
    //   648: ldc_w -1627103226
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 4850, 1104008905 -> 680, 1298509998 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w -1511289835
    //   686: l2i
    //   687: ldc_w -1511289855
    //   690: ixor
    //   691: getstatic Perryc.c : I
    //   694: iflt -> 708
    //   697: ldc2_w 775181195
    //   700: l2i
    //   701: ldc_w -1494619262
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 1867700764
    //   711: l2i
    //   712: ldc_w 1234260355
    //   715: ixor
    //   716: ldc2_w -627859406
    //   719: l2i
    //   720: ldc_w 228441162
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -14799218 -> 708, 1607705713 -> 4798
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w -1724476508
    //   764: l2i
    //   765: ldc_w -2115918381
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 506607067
    //   775: l2i
    //   776: ldc_w 25758603
    //   779: ixor
    //   780: ldc2_w 46427383
    //   783: l2i
    //   784: ldc_w 594738657
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 4776, 962701153 -> 772, 1041084230 -> 816
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.c : I
    //   822: iflt -> 836
    //   825: ldc2_w 2057123193
    //   828: l2i
    //   829: ldc_w 600537892
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 1194228475
    //   839: l2i
    //   840: ldc_w -1552856971
    //   843: ixor
    //   844: ldc2_w -1500595741
    //   847: l2i
    //   848: ldc_w 1122783324
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 4822, -1120622622 -> 836, 4053809 -> 880
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w 842549316
    //   892: l2i
    //   893: ldc_w -1334265376
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -936459177
    //   903: l2i
    //   904: ldc_w -361334214
    //   907: ixor
    //   908: ldc2_w 879859442
    //   911: l2i
    //   912: ldc_w 670778671
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, -1849023879 -> 4838, -935874689 -> 900
    //   944: putfield blocksPerTick : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.c : I
    //   950: iflt -> 964
    //   953: ldc2_w 513326824
    //   956: l2i
    //   957: ldc_w 1634166535
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 358225120
    //   967: l2i
    //   968: ldc_w 136855227
    //   971: ixor
    //   972: ldc2_w -1232807911
    //   975: l2i
    //   976: ldc_w -248476506
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 4858, 944475472 -> 964, 1522958052 -> 1008
    //   1008: aload_0
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w -1640148681
    //   1018: l2i
    //   1019: ldc_w -460400443
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w -5971679
    //   1029: l2i
    //   1030: ldc_w 174793949
    //   1033: ixor
    //   1034: ldc2_w 1169602966
    //   1037: l2i
    //   1038: ldc_w 1835191629
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 4802, -585387737 -> 1068, 1382546729 -> 1026
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '昨㌖晪㶶핲'
    //   1076: getstatic Perryc.c : I
    //   1079: iflt -> 1093
    //   1082: ldc2_w -1842731738
    //   1085: l2i
    //   1086: ldc_w 546982366
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w -1227334377
    //   1096: l2i
    //   1097: ldc_w -626070080
    //   1100: ixor
    //   1101: ldc2_w 427498136
    //   1104: l2i
    //   1105: ldc_w 1474885399
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, -64781961 -> 4842, 277041787 -> 1093
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w 1538632719
    //   1142: l2i
    //   1143: ldc_w 1538632719
    //   1146: ixor
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w 391704924
    //   1156: l2i
    //   1157: ldc_w 474768880
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -1663092320
    //   1167: l2i
    //   1168: ldc_w 2138587868
    //   1171: ixor
    //   1172: ldc2_w -2000953727
    //   1175: l2i
    //   1176: ldc_w -1333469584
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 4782, -610763891 -> 1208, 858494045 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w 1175426087
    //   1214: l2i
    //   1215: ldc_w 1175426087
    //   1218: ixor
    //   1219: getstatic Perryc.0 : I
    //   1222: ifle -> 1236
    //   1225: ldc2_w -1455024348
    //   1228: l2i
    //   1229: ldc_w -27393212
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w 867554661
    //   1239: l2i
    //   1240: ldc_w 1477034171
    //   1243: ixor
    //   1244: ldc2_w -221531050
    //   1247: l2i
    //   1248: ldc_w 214725842
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 4740, -1782852262 -> 1280, -1457531676 -> 1236
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w -2143411730
    //   1286: l2i
    //   1287: ldc_w -2143411948
    //   1290: ixor
    //   1291: getstatic Perryc.0 : I
    //   1294: ifle -> 1308
    //   1297: ldc2_w -1153637740
    //   1300: l2i
    //   1301: ldc_w 618169892
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w 1836661475
    //   1311: l2i
    //   1312: ldc_w 2096684059
    //   1315: ixor
    //   1316: ldc2_w -2143920408
    //   1319: l2i
    //   1320: ldc_w 1037092151
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -237968727 -> 1308, 570621807 -> 4770
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.c : I
    //   1358: iflt -> 1372
    //   1361: ldc2_w 291097815
    //   1364: l2i
    //   1365: ldc_w 792602280
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w -450314871
    //   1375: l2i
    //   1376: ldc_w 1413782598
    //   1379: ixor
    //   1380: ldc2_w 1089525820
    //   1383: l2i
    //   1384: ldc_w -344985734
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 1416, -1778852551 -> 4784, -1332642309 -> 1372
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -35645919
    //   1428: l2i
    //   1429: ldc_w 1813151583
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w -264507168
    //   1439: l2i
    //   1440: ldc_w -1774758931
    //   1443: ixor
    //   1444: ldc2_w -513626998
    //   1447: l2i
    //   1448: ldc_w 55334841
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1480, -1077135570 -> 1436, 1943835213 -> 4844
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.c : I
    //   1486: iflt -> 1500
    //   1489: ldc2_w -1677576823
    //   1492: l2i
    //   1493: ldc_w -978134590
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w -445308031
    //   1503: l2i
    //   1504: ldc_w -1991158450
    //   1507: ixor
    //   1508: ldc2_w 194550647
    //   1511: l2i
    //   1512: ldc_w -1346619054
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, -40612242 -> 4766, 1192135175 -> 1500
    //   1544: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.0 : I
    //   1550: ifle -> 1564
    //   1553: ldc2_w 1315852655
    //   1556: l2i
    //   1557: ldc_w -227606747
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w 794280284
    //   1567: l2i
    //   1568: ldc_w 1314099124
    //   1571: ixor
    //   1572: ldc2_w -947135343
    //   1575: l2i
    //   1576: ldc_w 1623656304
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, 457995691 -> 4808, 543508915 -> 1564
    //   1608: aload_0
    //   1609: getstatic Perryc.c : I
    //   1612: iflt -> 1626
    //   1615: ldc2_w 1912357795
    //   1618: l2i
    //   1619: ldc_w 999248226
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w 1163423240
    //   1629: l2i
    //   1630: ldc_w 86175131
    //   1633: ixor
    //   1634: ldc2_w -2104122113
    //   1637: l2i
    //   1638: ldc_w -2080294636
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, 8524645 -> 1626, 1290243882 -> 4832
    //   1668: aload_0
    //   1669: new bigname/zprestige/webhack/features/setting/Setting
    //   1672: dup
    //   1673: ldc_w '显㌜晲㶶핿袵'
    //   1676: getstatic Perryc.c : I
    //   1679: iflt -> 1693
    //   1682: ldc2_w 2112941617
    //   1685: l2i
    //   1686: ldc_w -61601850
    //   1689: ixor
    //   1690: goto -> 1701
    //   1693: ldc2_w 523296319
    //   1696: l2i
    //   1697: ldc_w -72004098
    //   1700: ixor
    //   1701: ldc2_w -1973085667
    //   1704: l2i
    //   1705: ldc_w -1008676839
    //   1708: ixor
    //   1709: ixor
    //   1710: lookupswitch default -> 4730, -1392485947 -> 1736, -937352205 -> 1693
    //   1736: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1739: ldc2_w 606456029
    //   1742: l2i
    //   1743: ldc_w 606456028
    //   1746: ixor
    //   1747: getstatic Perryc.0 : I
    //   1750: ifle -> 1764
    //   1753: ldc2_w -699496161
    //   1756: l2i
    //   1757: ldc_w -1973635200
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w -1322764585
    //   1767: l2i
    //   1768: ldc_w -1509294214
    //   1771: ixor
    //   1772: ldc2_w -1636398106
    //   1775: l2i
    //   1776: ldc_w -404996292
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 4848, 632851013 -> 1764, 1854635383 -> 1808
    //   1808: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1811: getstatic Perryc.1 : I
    //   1814: ifeq -> 1828
    //   1817: ldc2_w -147743231
    //   1820: l2i
    //   1821: ldc_w -1535724161
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w 1170568598
    //   1831: l2i
    //   1832: ldc_w -2115287083
    //   1835: ixor
    //   1836: ldc2_w 1882216940
    //   1839: l2i
    //   1840: ldc_w -883016869
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 1872, -452442512 -> 1828, -399947319 -> 4768
    //   1872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1875: getstatic Perryc.0 : I
    //   1878: ifle -> 1892
    //   1881: ldc2_w -372983476
    //   1884: l2i
    //   1885: ldc_w -615279755
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w -471301284
    //   1895: l2i
    //   1896: ldc_w 345570244
    //   1899: ixor
    //   1900: ldc2_w -1678993842
    //   1903: l2i
    //   1904: ldc_w -1107830367
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 1936, -126048619 -> 1892, 344745430 -> 4734
    //   1936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1939: getstatic Perryc.c : I
    //   1942: iflt -> 1956
    //   1945: ldc2_w 1756819116
    //   1948: l2i
    //   1949: ldc_w 1249278183
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w -1611467536
    //   1959: l2i
    //   1960: ldc_w 362185795
    //   1963: ixor
    //   1964: ldc2_w -820213388
    //   1967: l2i
    //   1968: ldc_w 1855969957
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 4860, -2092710502 -> 1956, 736568162 -> 2000
    //   2000: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2003: getstatic Perryc.1 : I
    //   2006: ifeq -> 2020
    //   2009: ldc2_w -788096429
    //   2012: l2i
    //   2013: ldc_w -678487317
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 245157652
    //   2023: l2i
    //   2024: ldc_w -1648383736
    //   2027: ixor
    //   2028: ldc2_w -652100611
    //   2031: l2i
    //   2032: ldc_w -997959787
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 4804, -1903785356 -> 2064, 455896272 -> 2020
    //   2064: aload_0
    //   2065: getstatic Perryc.c : I
    //   2068: iflt -> 2082
    //   2071: ldc2_w -2115248996
    //   2074: l2i
    //   2075: ldc_w -1172159363
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w -1317874032
    //   2085: l2i
    //   2086: ldc_w -861772181
    //   2089: ixor
    //   2090: ldc2_w -1682964992
    //   2093: l2i
    //   2094: ldc_w -1351387128
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 2124, -560314885 -> 2082, 253042409 -> 4756
    //   2124: aload_0
    //   2125: new bigname/zprestige/webhack/features/setting/Setting
    //   2128: dup
    //   2129: ldc_w '昼㌒晥㶼핮袤้ᮭ蹢視?'
    //   2132: getstatic Perryc.1 : I
    //   2135: ifeq -> 2149
    //   2138: ldc2_w 998829119
    //   2141: l2i
    //   2142: ldc_w -2015118013
    //   2145: ixor
    //   2146: goto -> 2157
    //   2149: ldc2_w 1111598743
    //   2152: l2i
    //   2153: ldc_w -2143648811
    //   2156: ixor
    //   2157: ldc2_w 344794290
    //   2160: l2i
    //   2161: ldc_w 1048054460
    //   2164: ixor
    //   2165: ixor
    //   2166: lookupswitch default -> 2192, -1767997582 -> 4786, -115716339 -> 2149
    //   2192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2195: ldc2_w -372204483
    //   2198: l2i
    //   2199: ldc_w -372204483
    //   2202: ixor
    //   2203: getstatic Perryc.1 : I
    //   2206: ifeq -> 2220
    //   2209: ldc2_w -1854647509
    //   2212: l2i
    //   2213: ldc_w -390998775
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w -69598275
    //   2223: l2i
    //   2224: ldc_w -1218184275
    //   2227: ixor
    //   2228: ldc2_w 628640432
    //   2231: l2i
    //   2232: ldc_w -1375772306
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 4724, -1002515506 -> 2264, -247288324 -> 2220
    //   2264: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2267: getstatic Perryc.c : I
    //   2270: iflt -> 2284
    //   2273: ldc2_w -572268507
    //   2276: l2i
    //   2277: ldc_w 1385411060
    //   2280: ixor
    //   2281: goto -> 2292
    //   2284: ldc2_w 81610102
    //   2287: l2i
    //   2288: ldc_w 406806958
    //   2291: ixor
    //   2292: ldc2_w 227623595
    //   2295: l2i
    //   2296: ldc_w -1829826002
    //   2299: ixor
    //   2300: ixor
    //   2301: lookupswitch default -> 2328, 269353300 -> 4790, 1667816777 -> 2284
    //   2328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2331: getstatic Perryc.0 : I
    //   2334: ifle -> 2348
    //   2337: ldc2_w -591279092
    //   2340: l2i
    //   2341: ldc_w 420508709
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w 745006738
    //   2351: l2i
    //   2352: ldc_w -11887622
    //   2355: ixor
    //   2356: ldc2_w -1948334518
    //   2359: l2i
    //   2360: ldc_w -1841135672
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 4810, -894319382 -> 2392, -598933077 -> 2348
    //   2392: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2395: getstatic Perryc.c : I
    //   2398: iflt -> 2412
    //   2401: ldc2_w 1688115554
    //   2404: l2i
    //   2405: ldc_w 441201777
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w 1693702517
    //   2415: l2i
    //   2416: ldc_w 1243709573
    //   2419: ixor
    //   2420: ldc2_w -884039209
    //   2423: l2i
    //   2424: ldc_w 235840403
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 4764, -1148014761 -> 2412, -342729804 -> 2456
    //   2456: putfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2459: getstatic Perryc.c : I
    //   2462: iflt -> 2476
    //   2465: ldc2_w 1458129951
    //   2468: l2i
    //   2469: ldc_w 2024509496
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w 487767001
    //   2479: l2i
    //   2480: ldc_w 242290946
    //   2483: ixor
    //   2484: ldc2_w -1538999738
    //   2487: l2i
    //   2488: ldc_w 1350167060
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 2520, -1295589734 -> 2476, -629175179 -> 4846
    //   2520: aload_0
    //   2521: getstatic Perryc.0 : I
    //   2524: ifle -> 2538
    //   2527: ldc2_w 386840027
    //   2530: l2i
    //   2531: ldc_w 258560794
    //   2534: ixor
    //   2535: goto -> 2546
    //   2538: ldc2_w -1470558880
    //   2541: l2i
    //   2542: ldc_w 980065510
    //   2545: ixor
    //   2546: ldc2_w 942074620
    //   2549: l2i
    //   2550: ldc_w 1717321151
    //   2553: ixor
    //   2554: ixor
    //   2555: lookupswitch default -> 2580, 1176318338 -> 4852, 2024122228 -> 2538
    //   2580: aload_0
    //   2581: new bigname/zprestige/webhack/features/setting/Setting
    //   2584: dup
    //   2585: ldc_w '昩㌋晲㶥핪'
    //   2588: getstatic Perryc.1 : I
    //   2591: ifeq -> 2605
    //   2594: ldc2_w -1142690140
    //   2597: l2i
    //   2598: ldc_w 2144811740
    //   2601: ixor
    //   2602: goto -> 2613
    //   2605: ldc2_w -977316167
    //   2608: l2i
    //   2609: ldc_w 1000070184
    //   2612: ixor
    //   2613: ldc2_w 1759532814
    //   2616: l2i
    //   2617: ldc_w -2093543251
    //   2620: ixor
    //   2621: ixor
    //   2622: lookupswitch default -> 2648, 602357965 -> 2605, 803443675 -> 4840
    //   2648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2651: ldc2_w -104431893
    //   2654: l2i
    //   2655: ldc_w -104431893
    //   2658: ixor
    //   2659: getstatic Perryc.c : I
    //   2662: iflt -> 2676
    //   2665: ldc2_w -1161541745
    //   2668: l2i
    //   2669: ldc_w 596315187
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -1257813331
    //   2679: l2i
    //   2680: ldc_w -343587553
    //   2683: ixor
    //   2684: ldc2_w -1004576700
    //   2687: l2i
    //   2688: ldc_w 79058677
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 4812, -1641334525 -> 2720, 1508277517 -> 2676
    //   2720: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2723: getstatic Perryc.1 : I
    //   2726: ifeq -> 2740
    //   2729: ldc2_w -928568207
    //   2732: l2i
    //   2733: ldc_w 356467110
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w 1013846342
    //   2743: l2i
    //   2744: ldc_w -357461403
    //   2747: ixor
    //   2748: ldc2_w -150130904
    //   2751: l2i
    //   2752: ldc_w -141049884
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 2784, -587006693 -> 4834, 2144920216 -> 2740
    //   2784: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2787: getstatic Perryc.0 : I
    //   2790: ifle -> 2804
    //   2793: ldc2_w -791186958
    //   2796: l2i
    //   2797: ldc_w 62765305
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -1804580286
    //   2807: l2i
    //   2808: ldc_w -1155808944
    //   2811: ixor
    //   2812: ldc2_w 9544405
    //   2815: l2i
    //   2816: ldc_w -643311991
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 4816, -161611954 -> 2848, 173849943 -> 2804
    //   2848: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2851: getstatic Perryc.1 : I
    //   2854: ifeq -> 2868
    //   2857: ldc2_w -493219542
    //   2860: l2i
    //   2861: ldc_w -1581809979
    //   2864: ixor
    //   2865: goto -> 2876
    //   2868: ldc2_w -891719345
    //   2871: l2i
    //   2872: ldc_w -152089224
    //   2875: ixor
    //   2876: ldc2_w -20071304
    //   2879: l2i
    //   2880: ldc_w 425562590
    //   2883: ixor
    //   2884: ixor
    //   2885: lookupswitch default -> 4788, -1531100599 -> 2868, -609873519 -> 2912
    //   2912: putfield extra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2915: getstatic Perryc.c : I
    //   2918: iflt -> 2932
    //   2921: ldc2_w -1031618181
    //   2924: l2i
    //   2925: ldc_w 51939691
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w -229320916
    //   2935: l2i
    //   2936: ldc_w -1040066147
    //   2939: ixor
    //   2940: ldc2_w -242450706
    //   2943: l2i
    //   2944: ldc_w -1053051098
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 2976, -2008113825 -> 2932, -248675880 -> 4762
    //   2976: aload_0
    //   2977: getstatic Perryc.0 : I
    //   2980: ifle -> 2994
    //   2983: ldc2_w -1380400840
    //   2986: l2i
    //   2987: ldc_w -1853361619
    //   2990: ixor
    //   2991: goto -> 3002
    //   2994: ldc2_w 383424510
    //   2997: l2i
    //   2998: ldc_w 1731575770
    //   3001: ixor
    //   3002: ldc2_w 1545376494
    //   3005: l2i
    //   3006: ldc_w 1042997012
    //   3009: ixor
    //   3010: ixor
    //   3011: lookupswitch default -> 4792, 333014494 -> 3036, 1577680623 -> 2994
    //   3036: aload_0
    //   3037: new bigname/zprestige/webhack/features/setting/Setting
    //   3040: dup
    //   3041: ldc_w '昩㌋晲㶥핪袕๡᮵蹱覔'
    //   3044: getstatic Perryc.1 : I
    //   3047: ifeq -> 3061
    //   3050: ldc2_w -1191215569
    //   3053: l2i
    //   3054: ldc_w -1297581980
    //   3057: ixor
    //   3058: goto -> 3069
    //   3061: ldc2_w -454062183
    //   3064: l2i
    //   3065: ldc_w 1701936851
    //   3068: ixor
    //   3069: ldc2_w -741305000
    //   3072: l2i
    //   3073: ldc_w 1148961705
    //   3076: ixor
    //   3077: ixor
    //   3078: lookupswitch default -> 3104, -1644408646 -> 4758, 285678895 -> 3061
    //   3104: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3107: ldc2_w 1986785312
    //   3110: l2i
    //   3111: ldc_w 1986785312
    //   3114: ixor
    //   3115: getstatic Perryc.1 : I
    //   3118: ifeq -> 3132
    //   3121: ldc2_w 718181866
    //   3124: l2i
    //   3125: ldc_w -162993773
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w -1352338196
    //   3135: l2i
    //   3136: ldc_w -2000591396
    //   3139: ixor
    //   3140: ldc2_w 1264816557
    //   3143: l2i
    //   3144: ldc_w -1515339735
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 4732, -915685196 -> 3176, 843591165 -> 3132
    //   3176: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3179: getstatic Perryc.0 : I
    //   3182: ifle -> 3196
    //   3185: ldc2_w -239794601
    //   3188: l2i
    //   3189: ldc_w -968811056
    //   3192: ixor
    //   3193: goto -> 3204
    //   3196: ldc2_w 363328554
    //   3199: l2i
    //   3200: ldc_w 1969161544
    //   3203: ixor
    //   3204: ldc2_w -2090522010
    //   3207: l2i
    //   3208: ldc_w 1423744923
    //   3211: ixor
    //   3212: ixor
    //   3213: lookupswitch default -> 4854, -1220459361 -> 3240, -531779974 -> 3196
    //   3240: aload_0
    //   3241: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;)Ljava/util/function/Predicate;
    //   3246: getstatic Perryc.c : I
    //   3249: iflt -> 3263
    //   3252: ldc2_w -1778490692
    //   3255: l2i
    //   3256: ldc_w -1538673960
    //   3259: ixor
    //   3260: goto -> 3271
    //   3263: ldc2_w -1443307484
    //   3266: l2i
    //   3267: ldc_w -1794059478
    //   3270: ixor
    //   3271: ldc2_w 1799150942
    //   3274: l2i
    //   3275: ldc_w -336816995
    //   3278: ixor
    //   3279: ixor
    //   3280: lookupswitch default -> 3308, -1318610521 -> 4748, -468248039 -> 3263
    //   3308: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3311: getstatic Perryc.c : I
    //   3314: iflt -> 3328
    //   3317: ldc2_w 404319529
    //   3320: l2i
    //   3321: ldc_w 644479307
    //   3324: ixor
    //   3325: goto -> 3336
    //   3328: ldc2_w -1607486322
    //   3331: l2i
    //   3332: ldc_w 2057208971
    //   3335: ixor
    //   3336: ldc2_w -1676572245
    //   3339: l2i
    //   3340: ldc_w 1685548144
    //   3343: ixor
    //   3344: ixor
    //   3345: lookupswitch default -> 3372, -971607623 -> 4760, -386144577 -> 3328
    //   3372: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3375: getstatic Perryc.c : I
    //   3378: iflt -> 3392
    //   3381: ldc2_w -147250377
    //   3384: l2i
    //   3385: ldc_w -614994866
    //   3388: ixor
    //   3389: goto -> 3400
    //   3392: ldc2_w 687862133
    //   3395: l2i
    //   3396: ldc_w 1607650127
    //   3399: ixor
    //   3400: ldc2_w -1125004553
    //   3403: l2i
    //   3404: ldc_w 1525740480
    //   3407: ixor
    //   3408: ixor
    //   3409: lookupswitch default -> 3436, -1735761319 -> 3392, -898632114 -> 4806
    //   3436: putfield extraExtra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3439: getstatic Perryc.1 : I
    //   3442: ifeq -> 3456
    //   3445: ldc2_w 947454465
    //   3448: l2i
    //   3449: ldc_w 1200006299
    //   3452: ixor
    //   3453: goto -> 3464
    //   3456: ldc2_w -746615268
    //   3459: l2i
    //   3460: ldc_w 457655027
    //   3463: ixor
    //   3464: ldc2_w -333811213
    //   3467: l2i
    //   3468: ldc_w 607251695
    //   3471: ixor
    //   3472: ixor
    //   3473: lookupswitch default -> 3500, -1403060696 -> 3456, -1210827898 -> 4774
    //   3500: aload_0
    //   3501: new bigname/zprestige/webhack/util/Timer
    //   3504: dup
    //   3505: getstatic Perryc.1 : I
    //   3508: ifeq -> 3522
    //   3511: ldc2_w 1650276759
    //   3514: l2i
    //   3515: ldc_w 2146846971
    //   3518: ixor
    //   3519: goto -> 3530
    //   3522: ldc2_w -139265062
    //   3525: l2i
    //   3526: ldc_w 895748721
    //   3529: ixor
    //   3530: ldc2_w -849729274
    //   3533: l2i
    //   3534: ldc_w -2132027828
    //   3537: ixor
    //   3538: ixor
    //   3539: lookupswitch default -> 3564, 1343917606 -> 4862, 1951922114 -> 3522
    //   3564: invokespecial <init> : ()V
    //   3567: getstatic Perryc.1 : I
    //   3570: ifeq -> 3584
    //   3573: ldc2_w 907895180
    //   3576: l2i
    //   3577: ldc_w -242867573
    //   3580: ixor
    //   3581: goto -> 3592
    //   3584: ldc2_w -611105329
    //   3587: l2i
    //   3588: ldc_w 1936360406
    //   3591: ixor
    //   3592: ldc2_w 2101084900
    //   3595: l2i
    //   3596: ldc_w -920816674
    //   3599: ixor
    //   3600: ixor
    //   3601: lookupswitch default -> 4866, 483964707 -> 3628, 1941582397 -> 3584
    //   3628: putfield offTimer : Lbigname/zprestige/webhack/util/Timer;
    //   3631: getstatic Perryc.c : I
    //   3634: iflt -> 3648
    //   3637: ldc2_w -2013040465
    //   3640: l2i
    //   3641: ldc_w 1584608457
    //   3644: ixor
    //   3645: goto -> 3656
    //   3648: ldc2_w 1763475766
    //   3651: l2i
    //   3652: ldc_w 970646839
    //   3655: ixor
    //   3656: ldc2_w 1987651039
    //   3659: l2i
    //   3660: ldc_w -851232001
    //   3663: ixor
    //   3664: ixor
    //   3665: lookupswitch default -> 4772, -335774943 -> 3692, 1833589574 -> 3648
    //   3692: aload_0
    //   3693: new bigname/zprestige/webhack/util/Timer
    //   3696: dup
    //   3697: getstatic Perryc.c : I
    //   3700: iflt -> 3714
    //   3703: ldc2_w -1616964567
    //   3706: l2i
    //   3707: ldc_w 663153788
    //   3710: ixor
    //   3711: goto -> 3722
    //   3714: ldc2_w -233835319
    //   3717: l2i
    //   3718: ldc_w -1383433146
    //   3721: ixor
    //   3722: ldc2_w 172038798
    //   3725: l2i
    //   3726: ldc_w 1606619694
    //   3729: ixor
    //   3730: ixor
    //   3731: lookupswitch default -> 3756, -308547339 -> 4818, 1858963625 -> 3714
    //   3756: invokespecial <init> : ()V
    //   3759: getstatic Perryc.c : I
    //   3762: iflt -> 3776
    //   3765: ldc2_w -2004456152
    //   3768: l2i
    //   3769: ldc_w 1351005968
    //   3772: ixor
    //   3773: goto -> 3784
    //   3776: ldc2_w 1299768278
    //   3779: l2i
    //   3780: ldc_w -1537553248
    //   3783: ixor
    //   3784: ldc2_w 968887154
    //   3787: l2i
    //   3788: ldc_w -1590697315
    //   3791: ixor
    //   3792: ixor
    //   3793: lookupswitch default -> 4728, 1089418199 -> 3776, 1909311129 -> 3820
    //   3820: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   3823: getstatic Perryc.0 : I
    //   3826: ifle -> 3840
    //   3829: ldc2_w 930802388
    //   3832: l2i
    //   3833: ldc_w 729342630
    //   3836: ixor
    //   3837: goto -> 3848
    //   3840: ldc2_w -1103038355
    //   3843: l2i
    //   3844: ldc_w -1035377367
    //   3847: ixor
    //   3848: ldc2_w 523727399
    //   3851: l2i
    //   3852: ldc_w 924874251
    //   3855: ixor
    //   3856: ixor
    //   3857: lookupswitch default -> 4744, 873794654 -> 3840, 1411291496 -> 3884
    //   3884: aload_0
    //   3885: new java/util/HashMap
    //   3888: dup
    //   3889: getstatic Perryc.0 : I
    //   3892: ifle -> 3906
    //   3895: ldc2_w -2092822055
    //   3898: l2i
    //   3899: ldc_w 1513449287
    //   3902: ixor
    //   3903: goto -> 3914
    //   3906: ldc2_w -2023867047
    //   3909: l2i
    //   3910: ldc_w -1449125976
    //   3913: ixor
    //   3914: ldc2_w 1452298600
    //   3917: l2i
    //   3918: ldc_w 92503307
    //   3921: ixor
    //   3922: ixor
    //   3923: lookupswitch default -> 4736, -1973134595 -> 3906, 2112685714 -> 3948
    //   3948: invokespecial <init> : ()V
    //   3951: getstatic Perryc.c : I
    //   3954: iflt -> 3968
    //   3957: ldc2_w 158461252
    //   3960: l2i
    //   3961: ldc_w 1437888038
    //   3964: ixor
    //   3965: goto -> 3976
    //   3968: ldc2_w -1603150144
    //   3971: l2i
    //   3972: ldc_w 1618533857
    //   3975: ixor
    //   3976: ldc2_w -2070802615
    //   3979: l2i
    //   3980: ldc_w 47643627
    //   3983: ixor
    //   3984: ixor
    //   3985: lookupswitch default -> 4012, -629049408 -> 4836, -478436833 -> 3968
    //   4012: putfield retries : Ljava/util/Map;
    //   4015: getstatic Perryc.c : I
    //   4018: iflt -> 4032
    //   4021: ldc2_w 846515378
    //   4024: l2i
    //   4025: ldc_w 1762587988
    //   4028: ixor
    //   4029: goto -> 4040
    //   4032: ldc2_w 1100757788
    //   4035: l2i
    //   4036: ldc_w -1854733402
    //   4039: ixor
    //   4040: ldc2_w 665384429
    //   4043: l2i
    //   4044: ldc_w -1498587770
    //   4047: ixor
    //   4048: ixor
    //   4049: lookupswitch default -> 4830, -629173875 -> 4032, 1374326993 -> 4076
    //   4076: aload_0
    //   4077: new bigname/zprestige/webhack/util/Timer
    //   4080: dup
    //   4081: getstatic Perryc.c : I
    //   4084: iflt -> 4098
    //   4087: ldc2_w -1388693441
    //   4090: l2i
    //   4091: ldc_w 165671304
    //   4094: ixor
    //   4095: goto -> 4106
    //   4098: ldc2_w -301343555
    //   4101: l2i
    //   4102: ldc_w 1366989173
    //   4105: ixor
    //   4106: ldc2_w 1911762162
    //   4109: l2i
    //   4110: ldc_w -1227036732
    //   4113: ixor
    //   4114: ixor
    //   4115: lookupswitch default -> 4140, -935433163 -> 4098, 1674183297 -> 4824
    //   4140: invokespecial <init> : ()V
    //   4143: getstatic Perryc.c : I
    //   4146: iflt -> 4160
    //   4149: ldc2_w -757780047
    //   4152: l2i
    //   4153: ldc_w -389017165
    //   4156: ixor
    //   4157: goto -> 4168
    //   4160: ldc2_w -1613871936
    //   4163: l2i
    //   4164: ldc_w -95933511
    //   4167: ixor
    //   4168: ldc2_w -1040745382
    //   4171: l2i
    //   4172: ldc_w 1222259427
    //   4175: ixor
    //   4176: ixor
    //   4177: lookupswitch default -> 4820, -1289195845 -> 4160, -324329024 -> 4204
    //   4204: putfield retryTimer : Lbigname/zprestige/webhack/util/Timer;
    //   4207: getstatic Perryc.0 : I
    //   4210: ifle -> 4224
    //   4213: ldc2_w -1179661037
    //   4216: l2i
    //   4217: ldc_w 681249062
    //   4220: ixor
    //   4221: goto -> 4232
    //   4224: ldc2_w -1776051480
    //   4227: l2i
    //   4228: ldc_w -1722189849
    //   4231: ixor
    //   4232: ldc2_w 194219163
    //   4235: l2i
    //   4236: ldc_w -1530049245
    //   4239: ixor
    //   4240: ixor
    //   4241: lookupswitch default -> 4826, -1608241993 -> 4268, 1047135629 -> 4224
    //   4268: aload_0
    //   4269: ldc2_w -1502112619
    //   4272: l2i
    //   4273: ldc_w -1502112619
    //   4276: ixor
    //   4277: getstatic Perryc.c : I
    //   4280: iflt -> 4294
    //   4283: ldc2_w 1541934035
    //   4286: l2i
    //   4287: ldc_w -782697446
    //   4290: ixor
    //   4291: goto -> 4302
    //   4294: ldc2_w -579122337
    //   4297: l2i
    //   4298: ldc_w -295579924
    //   4301: ixor
    //   4302: ldc2_w -1598754975
    //   4305: l2i
    //   4306: ldc_w -177330900
    //   4309: ixor
    //   4310: ixor
    //   4311: lookupswitch default -> 4800, -546685564 -> 4294, 1723879422 -> 4336
    //   4336: putfield blocksThisTick : I
    //   4339: getstatic Perryc.c : I
    //   4342: iflt -> 4356
    //   4345: ldc2_w -1427850793
    //   4348: l2i
    //   4349: ldc_w 1665270995
    //   4352: ixor
    //   4353: goto -> 4364
    //   4356: ldc2_w 2006897695
    //   4359: l2i
    //   4360: ldc_w -1086382032
    //   4363: ixor
    //   4364: ldc2_w -1954936971
    //   4367: l2i
    //   4368: ldc_w -845897842
    //   4371: ixor
    //   4372: ixor
    //   4373: lookupswitch default -> 4400, -1891097089 -> 4780, 1534009516 -> 4356
    //   4400: aload_0
    //   4401: ldc2_w 1921617128
    //   4404: l2i
    //   4405: ldc_w 1921617128
    //   4408: ixor
    //   4409: getstatic Perryc.c : I
    //   4412: iflt -> 4426
    //   4415: ldc2_w -439677063
    //   4418: l2i
    //   4419: ldc_w -718605764
    //   4422: ixor
    //   4423: goto -> 4434
    //   4426: ldc2_w 413670756
    //   4429: l2i
    //   4430: ldc_w -2095905851
    //   4433: ixor
    //   4434: ldc2_w -1204374652
    //   4437: l2i
    //   4438: ldc_w -2125082057
    //   4441: ixor
    //   4442: ixor
    //   4443: lookupswitch default -> 4468, -200587030 -> 4426, 159554806 -> 4754
    //   4468: putfield hasOffhand : Z
    //   4471: getstatic Perryc.0 : I
    //   4474: ifle -> 4488
    //   4477: ldc2_w 1833810347
    //   4480: l2i
    //   4481: ldc_w -60734101
    //   4484: ixor
    //   4485: goto -> 4496
    //   4488: ldc2_w 1452986224
    //   4491: l2i
    //   4492: ldc_w -310356828
    //   4495: ixor
    //   4496: ldc2_w 737260967
    //   4499: l2i
    //   4500: ldc_w 1947544482
    //   4503: ixor
    //   4504: ixor
    //   4505: lookupswitch default -> 4532, -1893163456 -> 4488, -825728315 -> 4778
    //   4532: aload_0
    //   4533: aconst_null
    //   4534: getstatic Perryc.c : I
    //   4537: iflt -> 4551
    //   4540: ldc2_w 943455211
    //   4543: l2i
    //   4544: ldc_w 932205099
    //   4547: ixor
    //   4548: goto -> 4559
    //   4551: ldc2_w -550678802
    //   4554: l2i
    //   4555: ldc_w 2143726319
    //   4558: ixor
    //   4559: ldc2_w -615834535
    //   4562: l2i
    //   4563: ldc_w -189882450
    //   4566: ixor
    //   4567: ixor
    //   4568: lookupswitch default -> 4796, -1894881290 -> 4596, 541993527 -> 4551
    //   4596: putfield renderPos : Lnet/minecraft/util/math/BlockPos;
    //   4599: getstatic Perryc.0 : I
    //   4602: ifle -> 4616
    //   4605: ldc2_w 801671240
    //   4608: l2i
    //   4609: ldc_w -1674250797
    //   4612: ixor
    //   4613: goto -> 4624
    //   4616: ldc2_w -263488579
    //   4619: l2i
    //   4620: ldc_w 532491230
    //   4623: ixor
    //   4624: ldc2_w 1898327729
    //   4627: l2i
    //   4628: ldc_w -1071393636
    //   4631: ixor
    //   4632: ixor
    //   4633: lookupswitch default -> 4864, 49907638 -> 4616, 1593027150 -> 4660
    //   4660: aload_0
    //   4661: getstatic Perryc.1 : I
    //   4664: ifeq -> 4678
    //   4667: ldc2_w 2049069282
    //   4670: l2i
    //   4671: ldc_w -249095082
    //   4674: ixor
    //   4675: goto -> 4686
    //   4678: ldc2_w 1096452492
    //   4681: l2i
    //   4682: ldc_w -499594085
    //   4685: ixor
    //   4686: ldc2_w 134063045
    //   4689: l2i
    //   4690: ldc_w 2046269545
    //   4693: ixor
    //   4694: ixor
    //   4695: lookupswitch default -> 4720, -183535848 -> 4726, 588920347 -> 4678
    //   4720: invokespecial setInstance : ()V
    //   4723: return
    //   4724: aconst_null
    //   4725: athrow
    //   4726: aconst_null
    //   4727: athrow
    //   4728: aconst_null
    //   4729: athrow
    //   4730: aconst_null
    //   4731: athrow
    //   4732: aconst_null
    //   4733: athrow
    //   4734: aconst_null
    //   4735: athrow
    //   4736: aconst_null
    //   4737: athrow
    //   4738: aconst_null
    //   4739: athrow
    //   4740: aconst_null
    //   4741: athrow
    //   4742: aconst_null
    //   4743: athrow
    //   4744: aconst_null
    //   4745: athrow
    //   4746: aconst_null
    //   4747: athrow
    //   4748: aconst_null
    //   4749: athrow
    //   4750: aconst_null
    //   4751: athrow
    //   4752: aconst_null
    //   4753: athrow
    //   4754: aconst_null
    //   4755: athrow
    //   4756: aconst_null
    //   4757: athrow
    //   4758: aconst_null
    //   4759: athrow
    //   4760: aconst_null
    //   4761: athrow
    //   4762: aconst_null
    //   4763: athrow
    //   4764: aconst_null
    //   4765: athrow
    //   4766: aconst_null
    //   4767: athrow
    //   4768: aconst_null
    //   4769: athrow
    //   4770: aconst_null
    //   4771: athrow
    //   4772: aconst_null
    //   4773: athrow
    //   4774: aconst_null
    //   4775: athrow
    //   4776: aconst_null
    //   4777: athrow
    //   4778: aconst_null
    //   4779: athrow
    //   4780: aconst_null
    //   4781: athrow
    //   4782: aconst_null
    //   4783: athrow
    //   4784: aconst_null
    //   4785: athrow
    //   4786: aconst_null
    //   4787: athrow
    //   4788: aconst_null
    //   4789: athrow
    //   4790: aconst_null
    //   4791: athrow
    //   4792: aconst_null
    //   4793: athrow
    //   4794: aconst_null
    //   4795: athrow
    //   4796: aconst_null
    //   4797: athrow
    //   4798: aconst_null
    //   4799: athrow
    //   4800: aconst_null
    //   4801: athrow
    //   4802: aconst_null
    //   4803: athrow
    //   4804: aconst_null
    //   4805: athrow
    //   4806: aconst_null
    //   4807: athrow
    //   4808: aconst_null
    //   4809: athrow
    //   4810: aconst_null
    //   4811: athrow
    //   4812: aconst_null
    //   4813: athrow
    //   4814: aconst_null
    //   4815: athrow
    //   4816: aconst_null
    //   4817: athrow
    //   4818: aconst_null
    //   4819: athrow
    //   4820: aconst_null
    //   4821: athrow
    //   4822: aconst_null
    //   4823: athrow
    //   4824: aconst_null
    //   4825: athrow
    //   4826: aconst_null
    //   4827: athrow
    //   4828: aconst_null
    //   4829: athrow
    //   4830: aconst_null
    //   4831: athrow
    //   4832: aconst_null
    //   4833: athrow
    //   4834: aconst_null
    //   4835: athrow
    //   4836: aconst_null
    //   4837: athrow
    //   4838: aconst_null
    //   4839: athrow
    //   4840: aconst_null
    //   4841: athrow
    //   4842: aconst_null
    //   4843: athrow
    //   4844: aconst_null
    //   4845: athrow
    //   4846: aconst_null
    //   4847: athrow
    //   4848: aconst_null
    //   4849: athrow
    //   4850: aconst_null
    //   4851: athrow
    //   4852: aconst_null
    //   4853: athrow
    //   4854: aconst_null
    //   4855: athrow
    //   4856: aconst_null
    //   4857: athrow
    //   4858: aconst_null
    //   4859: athrow
    //   4860: aconst_null
    //   4861: athrow
    //   4862: aconst_null
    //   4863: athrow
    //   4864: aconst_null
    //   4865: athrow
    //   4866: aconst_null
    //   4867: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	4724	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Combat/AntiPiston
    //   3: dup
    //   4: getstatic Perryc.0 : I
    //   7: ifle -> 21
    //   10: ldc2_w -1360919357
    //   13: l2i
    //   14: ldc_w -1931257871
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w -290835748
    //   24: l2i
    //   25: ldc_w -271568249
    //   28: ixor
    //   29: ldc2_w -1595541239
    //   32: l2i
    //   33: ldc_w -430350875
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 134, 1204200631 -> 64, 1690171358 -> 21
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w 1694270833
    //   76: l2i
    //   77: ldc_w 1925258141
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -962140588
    //   87: l2i
    //   88: ldc_w -1596704289
    //   91: ixor
    //   92: ldc2_w 372974086
    //   95: l2i
    //   96: ldc_w -1412450055
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 132, -1412889581 -> 84, -611957388 -> 128
    //   128: putstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public boolean check() {
    return Perry1.4o(this, (int)1888445175L ^ 0x51993692);
  }
  
  public void onTick() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1915
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1907
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1899
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 571478724
    //   33: l2i
    //   34: ldc_w -1640825698
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1621721400
    //   44: l2i
    //   45: ldc_w -1818953517
    //   48: ixor
    //   49: ldc2_w -192324557
    //   52: l2i
    //   53: ldc_w -1080116567
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -147519296 -> 1874, 1109641871 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 496832547
    //   94: l2i
    //   95: ldc_w 951189652
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1932315334
    //   105: l2i
    //   106: ldc_w -1672080958
    //   109: ixor
    //   110: ldc2_w 558022361
    //   113: l2i
    //   114: ldc_w 1766043836
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1862, 1485056669 -> 144, 1831739090 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual isOn : ()Z
    //   151: goto -> 155
    //   154: athrow
    //   155: ifeq -> 169
    //   158: ldc2_w 171552028
    //   161: l2i
    //   162: ldc_w 1092964090
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w 20352904
    //   172: l2i
    //   173: ldc_w 1244294255
    //   176: ixor
    //   177: ldc2_w -2070066466
    //   180: l2i
    //   181: ldc_w -2076045778
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, 1271113494 -> 208, 1271113495 -> 1843
    //   208: getstatic Perryc.0 : I
    //   211: ifle -> 225
    //   214: ldc2_w -768290921
    //   217: l2i
    //   218: ldc_w 944994931
    //   221: ixor
    //   222: goto -> 233
    //   225: ldc2_w -792660431
    //   228: l2i
    //   229: ldc_w -1495199759
    //   232: ixor
    //   233: ldc2_w -47208831
    //   236: l2i
    //   237: ldc_w 1516938383
    //   240: ixor
    //   241: ixor
    //   242: lookupswitch default -> 1846, -781911090 -> 268, 1294120938 -> 225
    //   268: aload_0
    //   269: getstatic Perryc.1 : I
    //   272: ifeq -> 286
    //   275: ldc2_w 260042596
    //   278: l2i
    //   279: ldc_w 373797735
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w 558024341
    //   289: l2i
    //   290: ldc_w -1949035192
    //   293: ixor
    //   294: ldc2_w -602829114
    //   297: l2i
    //   298: ldc_w -1256246278
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 328, 1882644799 -> 1876, 1893142521 -> 286
    //   328: getfield blocksPerTick : Lbigname/zprestige/webhack/features/setting/Setting;
    //   331: getstatic Perryc.1 : I
    //   334: ifeq -> 348
    //   337: ldc2_w 694909402
    //   340: l2i
    //   341: ldc_w -524070583
    //   344: ixor
    //   345: goto -> 356
    //   348: ldc2_w -431109688
    //   351: l2i
    //   352: ldc_w 1608770069
    //   355: ixor
    //   356: ldc2_w -1133912438
    //   359: l2i
    //   360: ldc_w 459220075
    //   363: ixor
    //   364: ixor
    //   365: lookupswitch default -> 1860, 513331516 -> 392, 1855902322 -> 348
    //   392: goto -> 396
    //   395: athrow
    //   396: invokevirtual getValue : ()Ljava/lang/Object;
    //   399: goto -> 403
    //   402: athrow
    //   403: checkcast java/lang/Integer
    //   406: getstatic Perryc.0 : I
    //   409: ifle -> 423
    //   412: ldc2_w -2085995701
    //   415: l2i
    //   416: ldc_w 444793119
    //   419: ixor
    //   420: goto -> 431
    //   423: ldc2_w 41025448
    //   426: l2i
    //   427: ldc_w 807423596
    //   430: ixor
    //   431: ldc2_w 457029918
    //   434: l2i
    //   435: ldc_w -210961031
    //   438: ixor
    //   439: ixor
    //   440: lookupswitch default -> 468, 1903722035 -> 1888, 2090539611 -> 423
    //   468: goto -> 472
    //   471: athrow
    //   472: invokevirtual intValue : ()I
    //   475: goto -> 479
    //   478: athrow
    //   479: ldc2_w 1939178555
    //   482: l2i
    //   483: ldc_w 1939178554
    //   486: ixor
    //   487: if_icmpne -> 501
    //   490: ldc2_w -626672308
    //   493: l2i
    //   494: ldc_w 1896029823
    //   497: ixor
    //   498: goto -> 509
    //   501: ldc2_w 859630155
    //   504: l2i
    //   505: ldc_w -1734719113
    //   508: ixor
    //   509: ldc2_w 1819346456
    //   512: l2i
    //   513: ldc_w 219551420
    //   516: ixor
    //   517: ixor
    //   518: tableswitch default -> 490, -893275241 -> 540, -893275240 -> 864
    //   540: getstatic Perryc.0 : I
    //   543: ifle -> 557
    //   546: ldc2_w 1997398867
    //   549: l2i
    //   550: ldc_w 1849583427
    //   553: ixor
    //   554: goto -> 565
    //   557: ldc2_w -1781216110
    //   560: l2i
    //   561: ldc_w 1648594033
    //   564: ixor
    //   565: ldc2_w -1099137415
    //   568: l2i
    //   569: ldc_w -955958905
    //   572: ixor
    //   573: ixor
    //   574: lookupswitch default -> 1848, -1897003235 -> 600, 1615512558 -> 557
    //   600: aload_0
    //   601: getstatic Perryc.1 : I
    //   604: ifeq -> 618
    //   607: ldc2_w 723177521
    //   610: l2i
    //   611: ldc_w -612832891
    //   614: ixor
    //   615: goto -> 626
    //   618: ldc2_w 817685278
    //   621: l2i
    //   622: ldc_w -740166312
    //   625: ixor
    //   626: ldc2_w -388854095
    //   629: l2i
    //   630: ldc_w -1668718515
    //   633: ixor
    //   634: ixor
    //   635: lookupswitch default -> 660, -2076584120 -> 1886, -945131397 -> 618
    //   660: getfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   663: getstatic Perryc.c : I
    //   666: iflt -> 680
    //   669: ldc2_w 309229484
    //   672: l2i
    //   673: ldc_w 1567540606
    //   676: ixor
    //   677: goto -> 688
    //   680: ldc2_w 556310234
    //   683: l2i
    //   684: ldc_w -438044252
    //   687: ixor
    //   688: ldc2_w 238760032
    //   691: l2i
    //   692: ldc_w -569253717
    //   695: ixor
    //   696: ixor
    //   697: lookupswitch default -> 1872, -1624612327 -> 680, 350336949 -> 724
    //   724: goto -> 728
    //   727: athrow
    //   728: invokevirtual getValue : ()Ljava/lang/Object;
    //   731: goto -> 735
    //   734: athrow
    //   735: checkcast java/lang/Boolean
    //   738: getstatic Perryc.1 : I
    //   741: ifeq -> 755
    //   744: ldc2_w 163327885
    //   747: l2i
    //   748: ldc_w 629220562
    //   751: ixor
    //   752: goto -> 763
    //   755: ldc2_w -386267697
    //   758: l2i
    //   759: ldc_w 799473006
    //   762: ixor
    //   763: ldc2_w -1376958605
    //   766: l2i
    //   767: ldc_w -528451848
    //   770: ixor
    //   771: ixor
    //   772: lookupswitch default -> 1866, -1976448726 -> 800, 1632647892 -> 755
    //   800: goto -> 804
    //   803: athrow
    //   804: invokevirtual booleanValue : ()Z
    //   807: goto -> 811
    //   810: athrow
    //   811: ifne -> 825
    //   814: ldc2_w -922552917
    //   817: l2i
    //   818: ldc_w -1894477616
    //   821: ixor
    //   822: goto -> 833
    //   825: ldc2_w 1448534769
    //   828: l2i
    //   829: ldc_w 272664459
    //   832: ixor
    //   833: ldc2_w 216334952
    //   836: l2i
    //   837: ldc_w 1786645851
    //   840: ixor
    //   841: ixor
    //   842: tableswitch default -> 814, 546138696 -> 864, 546138697 -> 1843
    //   864: getstatic Perryc.0 : I
    //   867: ifle -> 881
    //   870: ldc2_w 1381275145
    //   873: l2i
    //   874: ldc_w -388332632
    //   877: ixor
    //   878: goto -> 889
    //   881: ldc2_w 537358100
    //   884: l2i
    //   885: ldc_w -1177754334
    //   888: ixor
    //   889: ldc2_w -110516706
    //   892: l2i
    //   893: ldc_w -694109895
    //   896: ixor
    //   897: ixor
    //   898: lookupswitch default -> 924, -1895577400 -> 881, -1790506362 -> 1844
    //   924: aload_0
    //   925: getstatic Perryc.1 : I
    //   928: ifeq -> 942
    //   931: ldc2_w 173597823
    //   934: l2i
    //   935: ldc_w -1629680112
    //   938: ixor
    //   939: goto -> 950
    //   942: ldc2_w 961413023
    //   945: l2i
    //   946: ldc_w 1262152829
    //   949: ixor
    //   950: ldc2_w -552175636
    //   953: l2i
    //   954: ldc_w -697500739
    //   957: ixor
    //   958: ixor
    //   959: lookupswitch default -> 1878, -1644206530 -> 942, 2064490419 -> 984
    //   984: goto -> 988
    //   987: athrow
    //   988: invokespecial doPlacements : ()V
    //   991: goto -> 995
    //   994: athrow
    //   995: getstatic Perryc.1 : I
    //   998: ifeq -> 1012
    //   1001: ldc2_w 901620516
    //   1004: l2i
    //   1005: ldc_w -537706579
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w -479384221
    //   1015: l2i
    //   1016: ldc_w 727935511
    //   1019: ixor
    //   1020: ldc2_w -642610234
    //   1023: l2i
    //   1024: ldc_w 1829174583
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1852, 1593502328 -> 1012, 2092577157 -> 1056
    //   1056: aload_0
    //   1057: getstatic Perryc.0 : I
    //   1060: ifle -> 1074
    //   1063: ldc2_w -245399094
    //   1066: l2i
    //   1067: ldc_w 1534641577
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w 1317103565
    //   1077: l2i
    //   1078: ldc_w 2100576038
    //   1081: ixor
    //   1082: ldc2_w 1628749174
    //   1085: l2i
    //   1086: ldc_w -309754135
    //   1089: ixor
    //   1090: ixor
    //   1091: lookupswitch default -> 1856, -1087872140 -> 1116, 649756668 -> 1074
    //   1116: getfield extra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1119: getstatic Perryc.0 : I
    //   1122: ifle -> 1136
    //   1125: ldc2_w 2008130158
    //   1128: l2i
    //   1129: ldc_w -114964180
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w 516128326
    //   1139: l2i
    //   1140: ldc_w 2112111032
    //   1143: ixor
    //   1144: ldc2_w 721020320
    //   1147: l2i
    //   1148: ldc_w 1847206574
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1180, -898126772 -> 1850, 316290507 -> 1136
    //   1180: goto -> 1184
    //   1183: athrow
    //   1184: invokevirtual getValue : ()Ljava/lang/Object;
    //   1187: goto -> 1191
    //   1190: athrow
    //   1191: checkcast java/lang/Boolean
    //   1194: getstatic Perryc.1 : I
    //   1197: ifeq -> 1211
    //   1200: ldc2_w 523137992
    //   1203: l2i
    //   1204: ldc_w -1524328972
    //   1207: ixor
    //   1208: goto -> 1219
    //   1211: ldc2_w 829181560
    //   1214: l2i
    //   1215: ldc_w 2120083326
    //   1218: ixor
    //   1219: ldc2_w -1960281047
    //   1222: l2i
    //   1223: ldc_w 1377259279
    //   1226: ixor
    //   1227: ixor
    //   1228: lookupswitch default -> 1854, -1777427936 -> 1256, 1664472346 -> 1211
    //   1256: goto -> 1260
    //   1259: athrow
    //   1260: invokevirtual booleanValue : ()Z
    //   1263: goto -> 1267
    //   1266: athrow
    //   1267: ifeq -> 1281
    //   1270: ldc2_w 670161573
    //   1273: l2i
    //   1274: ldc_w -1977919727
    //   1277: ixor
    //   1278: goto -> 1289
    //   1281: ldc2_w 1129411640
    //   1284: l2i
    //   1285: ldc_w -289670769
    //   1288: ixor
    //   1289: ldc2_w -195725112
    //   1292: l2i
    //   1293: ldc_w -15411879
    //   1296: ixor
    //   1297: ixor
    //   1298: tableswitch default -> 1270, -1498734555 -> 1320, -1498734554 -> 1321
    //   1320: return
    //   1321: getstatic Perryc.c : I
    //   1324: iflt -> 1338
    //   1327: ldc2_w 1381030358
    //   1330: l2i
    //   1331: ldc_w 1875493262
    //   1334: ixor
    //   1335: goto -> 1346
    //   1338: ldc2_w 695597398
    //   1341: l2i
    //   1342: ldc_w -180361192
    //   1345: ixor
    //   1346: ldc2_w -936607051
    //   1349: l2i
    //   1350: ldc_w 1294453708
    //   1353: ixor
    //   1354: ixor
    //   1355: lookupswitch default -> 1380, -1198370527 -> 1870, -226355594 -> 1338
    //   1380: aload_0
    //   1381: pop
    //   1382: getstatic Perryc.1 : I
    //   1385: ifeq -> 1399
    //   1388: ldc2_w 785813534
    //   1391: l2i
    //   1392: ldc_w -1084417056
    //   1395: ixor
    //   1396: goto -> 1407
    //   1399: ldc2_w -873314703
    //   1402: l2i
    //   1403: ldc_w -865429841
    //   1406: ixor
    //   1407: ldc2_w -1634805505
    //   1410: l2i
    //   1411: ldc_w -170223320
    //   1414: ixor
    //   1415: ixor
    //   1416: lookupswitch default -> 1858, -85997015 -> 1399, 1825345801 -> 1444
    //   1444: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   1447: getstatic Perryc.0 : I
    //   1450: ifle -> 1464
    //   1453: ldc2_w 797126609
    //   1456: l2i
    //   1457: ldc_w -735034862
    //   1460: ixor
    //   1461: goto -> 1472
    //   1464: ldc2_w 865697308
    //   1467: l2i
    //   1468: ldc_w 1975129977
    //   1471: ixor
    //   1472: ldc2_w 2104486155
    //   1475: l2i
    //   1476: ldc_w 1512432992
    //   1479: ixor
    //   1480: ixor
    //   1481: lookupswitch default -> 1508, -896430515 -> 1464, -587636312 -> 1884
    //   1508: getfield extraExtra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1511: getstatic Perryc.0 : I
    //   1514: ifle -> 1528
    //   1517: ldc2_w 532466034
    //   1520: l2i
    //   1521: ldc_w -876755950
    //   1524: ixor
    //   1525: goto -> 1536
    //   1528: ldc2_w -303853567
    //   1531: l2i
    //   1532: ldc_w -1711610018
    //   1535: ixor
    //   1536: ldc2_w 539629844
    //   1539: l2i
    //   1540: ldc_w -1073731104
    //   1543: ixor
    //   1544: ixor
    //   1545: lookupswitch default -> 1572, -1652348458 -> 1528, 875249044 -> 1864
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual getValue : ()Ljava/lang/Object;
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: checkcast java/lang/Boolean
    //   1586: getstatic Perryc.c : I
    //   1589: iflt -> 1603
    //   1592: ldc2_w 1942915185
    //   1595: l2i
    //   1596: ldc_w 1495110194
    //   1599: ixor
    //   1600: goto -> 1611
    //   1603: ldc2_w 537947322
    //   1606: l2i
    //   1607: ldc_w -1055964134
    //   1610: ixor
    //   1611: ldc2_w 649384216
    //   1614: l2i
    //   1615: ldc_w 1146169140
    //   1618: ixor
    //   1619: ixor
    //   1620: lookupswitch default -> 1868, -2080711028 -> 1648, 1211559023 -> 1603
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual booleanValue : ()Z
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: ifeq -> 1673
    //   1662: ldc2_w 729491325
    //   1665: l2i
    //   1666: ldc_w 2127477255
    //   1669: ixor
    //   1670: goto -> 1681
    //   1673: ldc2_w -395563609
    //   1676: l2i
    //   1677: ldc_w -1109806882
    //   1680: ixor
    //   1681: ldc2_w 2053723063
    //   1684: l2i
    //   1685: ldc_w -732624404
    //   1688: ixor
    //   1689: ixor
    //   1690: tableswitch default -> 1662, -74856671 -> 1712, -74856670 -> 1843
    //   1712: getstatic Perryc.1 : I
    //   1715: ifeq -> 1729
    //   1718: ldc2_w 561700052
    //   1721: l2i
    //   1722: ldc_w 2088378936
    //   1725: ixor
    //   1726: goto -> 1737
    //   1729: ldc2_w 126281984
    //   1732: l2i
    //   1733: ldc_w 961315662
    //   1736: ixor
    //   1737: ldc2_w -17319880
    //   1740: l2i
    //   1741: ldc_w -22535951
    //   1744: ixor
    //   1745: ixor
    //   1746: lookupswitch default -> 1880, 1050014343 -> 1772, 1566533157 -> 1729
    //   1772: aload_0
    //   1773: getstatic Perryc.1 : I
    //   1776: ifeq -> 1790
    //   1779: ldc2_w -926173510
    //   1782: l2i
    //   1783: ldc_w -892055573
    //   1786: ixor
    //   1787: goto -> 1798
    //   1790: ldc2_w 275235474
    //   1793: l2i
    //   1794: ldc_w 1046235111
    //   1797: ixor
    //   1798: ldc2_w 1638654725
    //   1801: l2i
    //   1802: ldc_w 616727701
    //   1805: ixor
    //   1806: ixor
    //   1807: lookupswitch default -> 1832, -663409982 -> 1790, 1198956225 -> 1882
    //   1832: goto -> 1836
    //   1835: athrow
    //   1836: invokevirtual disable : ()V
    //   1839: goto -> 1843
    //   1842: athrow
    //   1843: return
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: aconst_null
    //   1853: athrow
    //   1854: aconst_null
    //   1855: athrow
    //   1856: aconst_null
    //   1857: athrow
    //   1858: aconst_null
    //   1859: athrow
    //   1860: aconst_null
    //   1861: athrow
    //   1862: aconst_null
    //   1863: athrow
    //   1864: aconst_null
    //   1865: athrow
    //   1866: aconst_null
    //   1867: athrow
    //   1868: aconst_null
    //   1869: athrow
    //   1870: aconst_null
    //   1871: athrow
    //   1872: aconst_null
    //   1873: athrow
    //   1874: aconst_null
    //   1875: athrow
    //   1876: aconst_null
    //   1877: athrow
    //   1878: aconst_null
    //   1879: athrow
    //   1880: aconst_null
    //   1881: athrow
    //   1882: aconst_null
    //   1883: athrow
    //   1884: aconst_null
    //   1885: athrow
    //   1886: aconst_null
    //   1887: athrow
    //   1888: aconst_null
    //   1889: athrow
    //   1890: pop
    //   1891: goto -> 24
    //   1894: pop
    //   1895: aconst_null
    //   1896: goto -> 1890
    //   1899: dup
    //   1900: ifnull -> 1890
    //   1903: checkcast java/lang/Throwable
    //   1906: athrow
    //   1907: dup
    //   1908: ifnull -> 1894
    //   1911: checkcast java/lang/Throwable
    //   1914: athrow
    //   1915: aconst_null
    //   1916: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1820	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    // Exception table:
    //   from	to	target	type
    //   8	20	1899	finally
    //   147	154	154	finally
    //   147	154	154	finally
    //   148	154	147	java/util/ConcurrentModificationException
    //   148	154	147	finally
    //   148	154	3	java/util/ConcurrentModificationException
    //   395	402	402	finally
    //   395	402	402	java/lang/ArithmeticException
    //   395	402	402	finally
    //   395	402	3	finally
    //   395	402	395	finally
    //   471	478	478	finally
    //   471	478	471	java/lang/NumberFormatException
    //   471	478	3	java/lang/IndexOutOfBoundsException
    //   472	478	3	finally
    //   472	478	3	finally
    //   727	734	734	finally
    //   727	734	734	finally
    //   728	734	3	java/lang/IndexOutOfBoundsException
    //   728	734	727	java/lang/ArrayIndexOutOfBoundsException
    //   728	734	727	finally
    //   803	810	810	finally
    //   804	810	810	finally
    //   804	810	810	java/lang/IndexOutOfBoundsException
    //   804	810	803	java/lang/EnumConstantNotPresentException
    //   804	810	3	finally
    //   987	994	994	finally
    //   987	994	994	finally
    //   987	994	3	finally
    //   988	994	3	finally
    //   988	994	987	finally
    //   1183	1190	1190	finally
    //   1183	1190	1183	java/lang/IllegalStateException
    //   1183	1190	1183	finally
    //   1183	1190	3	finally
    //   1184	1190	3	finally
    //   1260	1266	1266	finally
    //   1260	1266	1266	finally
    //   1260	1266	3	java/lang/ArrayIndexOutOfBoundsException
    //   1260	1266	3	java/lang/StringIndexOutOfBoundsException
    //   1260	1266	3	java/lang/NumberFormatException
    //   1575	1582	1582	finally
    //   1575	1582	3	finally
    //   1576	1582	3	java/lang/AssertionError
    //   1576	1582	3	finally
    //   1576	1582	1575	java/util/NoSuchElementException
    //   1651	1658	1658	finally
    //   1651	1658	3	finally
    //   1651	1658	1658	java/lang/IllegalArgumentException
    //   1652	1658	1651	java/lang/NullPointerException
    //   1652	1658	1658	finally
    //   1835	1842	1842	finally
    //   1835	1842	1842	java/lang/ArrayIndexOutOfBoundsException
    //   1836	1842	1835	finally
    //   1836	1842	1835	java/lang/StringIndexOutOfBoundsException
    //   1836	1842	3	java/lang/EnumConstantNotPresentException
    //   1899	1907	1899	java/lang/UnsupportedOperationException
    //   1915	1917	3	java/util/NoSuchElementException
  }
  
  public void onDisable() {
    Perry1.3B(this, (int)559037664L ^ 0x50B1098E);
  }
  
  public List getPositions() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 13165
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 13157
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 13149
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -1072046307
    //   37: l2i
    //   38: ldc_w 1632626755
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1107764329
    //   48: l2i
    //   49: ldc_w 1679797691
    //   52: ixor
    //   53: ldc2_w -783515682
    //   56: l2i
    //   57: ldc_w -1187551156
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 13122, -1315151426 -> 88, -919789364 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w 970455749
    //   108: l2i
    //   109: ldc_w 1813760649
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 167492394
    //   119: l2i
    //   120: ldc_w -194372844
    //   123: ixor
    //   124: ldc2_w 971659166
    //   127: l2i
    //   128: ldc_w 23809558
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 13038, -988759626 -> 160, 1833773508 -> 116
    //   160: astore_1
    //   161: getstatic Perryc.0 : I
    //   164: ifle -> 178
    //   167: ldc2_w 348585489
    //   170: l2i
    //   171: ldc_w -953773244
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w -2066774872
    //   181: l2i
    //   182: ldc_w -1727234809
    //   185: ixor
    //   186: ldc2_w 976540601
    //   189: l2i
    //   190: ldc_w -896702253
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 220, 593090111 -> 13090, 903845274 -> 178
    //   220: aload_1
    //   221: new net/minecraft/util/math/BlockPos
    //   224: dup
    //   225: getstatic Perryc.1 : I
    //   228: ifeq -> 242
    //   231: ldc2_w 1553140070
    //   234: l2i
    //   235: ldc_w -597092757
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -971275715
    //   245: l2i
    //   246: ldc_w -344852671
    //   249: ixor
    //   250: ldc2_w -1380903038
    //   253: l2i
    //   254: ldc_w 638691323
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 13068, -1496660731 -> 284, 190492532 -> 242
    //   284: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   287: getstatic Perryc.1 : I
    //   290: ifeq -> 304
    //   293: ldc2_w 345159618
    //   296: l2i
    //   297: ldc_w 1470939902
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 1784632755
    //   307: l2i
    //   308: ldc_w -1191715839
    //   311: ixor
    //   312: ldc2_w -1384100746
    //   315: l2i
    //   316: ldc_w -1121345217
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, 1322941374 -> 304, 1402443893 -> 12948
    //   348: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   351: getstatic Perryc.1 : I
    //   354: ifeq -> 368
    //   357: ldc2_w -914760232
    //   360: l2i
    //   361: ldc_w -581996901
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w -2083331360
    //   371: l2i
    //   372: ldc_w 1021217720
    //   375: ixor
    //   376: ldc2_w -1694351471
    //   379: l2i
    //   380: ldc_w -1313598338
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 12880, -1782955337 -> 412, 1048615084 -> 368
    //   412: getfield field_70165_t : D
    //   415: getstatic Perryc.0 : I
    //   418: ifle -> 432
    //   421: ldc2_w 997063986
    //   424: l2i
    //   425: ldc_w -1851960253
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w -885873995
    //   435: l2i
    //   436: ldc_w -1475368699
    //   439: ixor
    //   440: ldc2_w 1756514186
    //   443: l2i
    //   444: ldc_w -1008060351
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 476, 27842234 -> 12906, 1427710549 -> 432
    //   476: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   479: getstatic Perryc.c : I
    //   482: iflt -> 496
    //   485: ldc2_w -2050530093
    //   488: l2i
    //   489: ldc_w -1905655934
    //   492: ixor
    //   493: goto -> 504
    //   496: ldc2_w 1337882890
    //   499: l2i
    //   500: ldc_w 1738220112
    //   503: ixor
    //   504: ldc2_w 1993743037
    //   507: l2i
    //   508: ldc_w -1189530807
    //   511: ixor
    //   512: ixor
    //   513: lookupswitch default -> 12888, -1000230235 -> 496, -404065618 -> 540
    //   540: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   543: getstatic Perryc.c : I
    //   546: iflt -> 560
    //   549: ldc2_w -531228837
    //   552: l2i
    //   553: ldc_w 1862172308
    //   556: ixor
    //   557: goto -> 568
    //   560: ldc2_w -2036186133
    //   563: l2i
    //   564: ldc_w -184969093
    //   567: ixor
    //   568: ldc2_w 913754838
    //   571: l2i
    //   572: ldc_w 1492116890
    //   575: ixor
    //   576: ixor
    //   577: lookupswitch default -> 12776, -533641597 -> 560, 482538716 -> 604
    //   604: getfield field_70163_u : D
    //   607: ldc2_w 0.1637090553971405
    //   610: invokestatic doubleToLongBits : (D)J
    //   613: ldc2_w 9209004078858678479
    //   616: lxor
    //   617: invokestatic longBitsToDouble : (J)D
    //   620: dadd
    //   621: getstatic Perryc.1 : I
    //   624: ifeq -> 638
    //   627: ldc2_w -2049525700
    //   630: l2i
    //   631: ldc_w 1252797410
    //   634: ixor
    //   635: goto -> 646
    //   638: ldc2_w -1085459329
    //   641: l2i
    //   642: ldc_w 205496803
    //   645: ixor
    //   646: ldc2_w 1703802167
    //   649: l2i
    //   650: ldc_w 1962491628
    //   653: ixor
    //   654: ixor
    //   655: lookupswitch default -> 13032, -1576640953 -> 680, -569485307 -> 638
    //   680: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   683: getstatic Perryc.1 : I
    //   686: ifeq -> 700
    //   689: ldc2_w -51394389
    //   692: l2i
    //   693: ldc_w 1557493237
    //   696: ixor
    //   697: goto -> 708
    //   700: ldc2_w -2075671593
    //   703: l2i
    //   704: ldc_w -1794322992
    //   707: ixor
    //   708: ldc2_w 1729091831
    //   711: l2i
    //   712: ldc_w -170374923
    //   715: ixor
    //   716: ixor
    //   717: lookupswitch default -> 12826, -2086887931 -> 744, 854404444 -> 700
    //   744: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   747: getstatic Perryc.0 : I
    //   750: ifle -> 764
    //   753: ldc2_w -559265672
    //   756: l2i
    //   757: ldc_w -1147224612
    //   760: ixor
    //   761: goto -> 772
    //   764: ldc2_w 1678954993
    //   767: l2i
    //   768: ldc_w 1583283024
    //   771: ixor
    //   772: ldc2_w 1890824856
    //   775: l2i
    //   776: ldc_w -242658650
    //   779: ixor
    //   780: ixor
    //   781: lookupswitch default -> 13034, -1149842785 -> 808, -468839014 -> 764
    //   808: getfield field_70161_v : D
    //   811: getstatic Perryc.1 : I
    //   814: ifeq -> 828
    //   817: ldc2_w -2022220276
    //   820: l2i
    //   821: ldc_w 1710856975
    //   824: ixor
    //   825: goto -> 836
    //   828: ldc2_w 2142993202
    //   831: l2i
    //   832: ldc_w -1466584765
    //   835: ixor
    //   836: ldc2_w -454815591
    //   839: l2i
    //   840: ldc_w -774117638
    //   843: ixor
    //   844: ixor
    //   845: lookupswitch default -> 12884, -676252832 -> 828, -502186990 -> 872
    //   872: goto -> 876
    //   875: athrow
    //   876: invokespecial <init> : (DDD)V
    //   879: goto -> 883
    //   882: athrow
    //   883: getstatic Perryc.0 : I
    //   886: ifle -> 900
    //   889: ldc2_w 1246478630
    //   892: l2i
    //   893: ldc_w 327979500
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 1033624303
    //   903: l2i
    //   904: ldc_w -2613021
    //   907: ixor
    //   908: ldc2_w 1696968999
    //   911: l2i
    //   912: ldc_w 913887562
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, 177877159 -> 13020, 2024999180 -> 900
    //   944: goto -> 948
    //   947: athrow
    //   948: invokevirtual add : (Ljava/lang/Object;)Z
    //   951: goto -> 955
    //   954: athrow
    //   955: pop
    //   956: getstatic Perryc.c : I
    //   959: iflt -> 973
    //   962: ldc2_w 595297410
    //   965: l2i
    //   966: ldc_w -2025018194
    //   969: ixor
    //   970: goto -> 981
    //   973: ldc2_w -1144924063
    //   976: l2i
    //   977: ldc_w -533697256
    //   980: ixor
    //   981: ldc2_w 545199427
    //   984: l2i
    //   985: ldc_w 932109075
    //   988: ixor
    //   989: ixor
    //   990: lookupswitch default -> 1016, -1278810500 -> 12846, 1083334028 -> 973
    //   1016: aload_1
    //   1017: ldc2_w 1441141087
    //   1020: l2i
    //   1021: ldc_w 1441141087
    //   1024: ixor
    //   1025: getstatic Perryc.c : I
    //   1028: iflt -> 1042
    //   1031: ldc2_w 1963919665
    //   1034: l2i
    //   1035: ldc_w -1532711303
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w -1809570264
    //   1045: l2i
    //   1046: ldc_w -863254823
    //   1049: ixor
    //   1050: ldc2_w 2006136381
    //   1053: l2i
    //   1054: ldc_w -475005114
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 1084, -1606681589 -> 1042, 1167552051 -> 12932
    //   1084: goto -> 1088
    //   1087: athrow
    //   1088: invokevirtual get : (I)Ljava/lang/Object;
    //   1091: goto -> 1095
    //   1094: athrow
    //   1095: checkcast net/minecraft/util/math/BlockPos
    //   1098: ldc2_w -2112899237
    //   1101: l2i
    //   1102: ldc_w -2112899237
    //   1105: ixor
    //   1106: getstatic Perryc.1 : I
    //   1109: ifeq -> 1123
    //   1112: ldc2_w -1346378597
    //   1115: l2i
    //   1116: ldc_w -278767519
    //   1119: ixor
    //   1120: goto -> 1131
    //   1123: ldc2_w 943384019
    //   1126: l2i
    //   1127: ldc_w -1456094875
    //   1130: ixor
    //   1131: ldc2_w 2040079353
    //   1134: l2i
    //   1135: ldc_w 1075379188
    //   1138: ixor
    //   1139: ixor
    //   1140: lookupswitch default -> 13098, -1467024197 -> 1168, 2036098295 -> 1123
    //   1168: goto -> 1172
    //   1171: athrow
    //   1172: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   1175: goto -> 1179
    //   1178: athrow
    //   1179: getstatic Perryc.0 : I
    //   1182: ifle -> 1196
    //   1185: ldc2_w -122829871
    //   1188: l2i
    //   1189: ldc_w 318311399
    //   1192: ixor
    //   1193: goto -> 1204
    //   1196: ldc2_w -37030051
    //   1199: l2i
    //   1200: ldc_w -1602425103
    //   1203: ixor
    //   1204: ldc2_w 2005271453
    //   1207: l2i
    //   1208: ldc_w -2030602134
    //   1211: ixor
    //   1212: ixor
    //   1213: lookupswitch default -> 13110, -1396219301 -> 1240, 455455681 -> 1196
    //   1240: istore_2
    //   1241: getstatic Perryc.c : I
    //   1244: iflt -> 1258
    //   1247: ldc2_w -1969396149
    //   1250: l2i
    //   1251: ldc_w -1699506600
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w -1788394692
    //   1261: l2i
    //   1262: ldc_w 1379430253
    //   1265: ixor
    //   1266: ldc2_w 1666451772
    //   1269: l2i
    //   1270: ldc_w 1835014697
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 1300, -447998127 -> 1258, 505078534 -> 12900
    //   1300: iload_2
    //   1301: tableswitch default -> 12496, 0 -> 1332, 1 -> 1470, 2 -> 1826, 3 -> 1408
    //   1332: new java/util/ArrayList
    //   1335: dup
    //   1336: getstatic Perryc.c : I
    //   1339: iflt -> 1353
    //   1342: ldc2_w -420056640
    //   1345: l2i
    //   1346: ldc_w -1809921156
    //   1349: ixor
    //   1350: goto -> 1361
    //   1353: ldc2_w 1240513018
    //   1356: l2i
    //   1357: ldc_w -328801818
    //   1360: ixor
    //   1361: ldc2_w -1119037509
    //   1364: l2i
    //   1365: ldc_w -1013495909
    //   1368: ixor
    //   1369: ixor
    //   1370: lookupswitch default -> 1396, 204679836 -> 13076, 1632334569 -> 1353
    //   1396: goto -> 1400
    //   1399: athrow
    //   1400: invokespecial <init> : ()V
    //   1403: goto -> 1407
    //   1406: athrow
    //   1407: areturn
    //   1408: getstatic Perryc.0 : I
    //   1411: ifle -> 1425
    //   1414: ldc2_w -343572114
    //   1417: l2i
    //   1418: ldc_w -129275041
    //   1421: ixor
    //   1422: goto -> 1433
    //   1425: ldc2_w -318371623
    //   1428: l2i
    //   1429: ldc_w -1901902850
    //   1432: ixor
    //   1433: ldc2_w -475076072
    //   1436: l2i
    //   1437: ldc_w -1471564645
    //   1440: ixor
    //   1441: ixor
    //   1442: lookupswitch default -> 12778, 675419556 -> 1468, 1479128242 -> 1425
    //   1468: aload_1
    //   1469: areturn
    //   1470: getstatic Perryc.0 : I
    //   1473: ifle -> 1487
    //   1476: ldc2_w -1433505735
    //   1479: l2i
    //   1480: ldc_w 693253947
    //   1483: ixor
    //   1484: goto -> 1495
    //   1487: ldc2_w -194429885
    //   1490: l2i
    //   1491: ldc_w -262013232
    //   1494: ixor
    //   1495: ldc2_w 763882097
    //   1498: l2i
    //   1499: ldc_w 935513170
    //   1502: ixor
    //   1503: ixor
    //   1504: lookupswitch default -> 13002, -1718001375 -> 1487, 508421296 -> 1532
    //   1532: aload_1
    //   1533: ldc2_w 1628454264
    //   1536: l2i
    //   1537: ldc_w 1628454264
    //   1540: ixor
    //   1541: getstatic Perryc.c : I
    //   1544: iflt -> 1558
    //   1547: ldc2_w -1931291140
    //   1550: l2i
    //   1551: ldc_w 242420656
    //   1554: ixor
    //   1555: goto -> 1566
    //   1558: ldc2_w 1816491757
    //   1561: l2i
    //   1562: ldc_w -1365380522
    //   1565: ixor
    //   1566: ldc2_w -2097397433
    //   1569: l2i
    //   1570: ldc_w -1245563653
    //   1573: ixor
    //   1574: ixor
    //   1575: lookupswitch default -> 1600, -1897344881 -> 1558, -1246778384 -> 12878
    //   1600: goto -> 1604
    //   1603: athrow
    //   1604: invokevirtual get : (I)Ljava/lang/Object;
    //   1607: goto -> 1611
    //   1610: athrow
    //   1611: checkcast net/minecraft/util/math/BlockPos
    //   1614: ldc2_w -503080361
    //   1617: l2i
    //   1618: ldc_w -503080361
    //   1621: ixor
    //   1622: ldc2_w 1763279464
    //   1625: l2i
    //   1626: ldc_w 1763279464
    //   1629: ixor
    //   1630: getstatic Perryc.c : I
    //   1633: iflt -> 1647
    //   1636: ldc2_w 2096722631
    //   1639: l2i
    //   1640: ldc_w 523551669
    //   1643: ixor
    //   1644: goto -> 1655
    //   1647: ldc2_w 1879610907
    //   1650: l2i
    //   1651: ldc_w -384683933
    //   1654: ixor
    //   1655: ldc2_w -39397246
    //   1658: l2i
    //   1659: ldc_w 1312731696
    //   1662: ixor
    //   1663: ixor
    //   1664: lookupswitch default -> 13060, -799679552 -> 1647, 713215178 -> 1692
    //   1692: goto -> 1696
    //   1695: athrow
    //   1696: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;ZZ)I
    //   1699: goto -> 1703
    //   1702: athrow
    //   1703: ldc2_w 887410194
    //   1706: l2i
    //   1707: ldc_w 887410193
    //   1710: ixor
    //   1711: if_icmpne -> 1725
    //   1714: ldc2_w -1619474021
    //   1717: l2i
    //   1718: ldc_w -1940167014
    //   1721: ixor
    //   1722: goto -> 1733
    //   1725: ldc2_w 487011045
    //   1728: l2i
    //   1729: ldc_w 237280743
    //   1732: ixor
    //   1733: ldc2_w 1093798131
    //   1736: l2i
    //   1737: ldc_w 218117243
    //   1740: ixor
    //   1741: ixor
    //   1742: tableswitch default -> 1714, 1594987401 -> 1764, 1594987402 -> 1826
    //   1764: getstatic Perryc.1 : I
    //   1767: ifeq -> 1781
    //   1770: ldc2_w -1644704369
    //   1773: l2i
    //   1774: ldc_w -596937908
    //   1777: ixor
    //   1778: goto -> 1789
    //   1781: ldc2_w 1211639770
    //   1784: l2i
    //   1785: ldc_w -2005367992
    //   1788: ixor
    //   1789: ldc2_w 205594373
    //   1792: l2i
    //   1793: ldc_w -1985761328
    //   1796: ixor
    //   1797: ixor
    //   1798: lookupswitch default -> 1824, -1636454852 -> 1781, -998371818 -> 12798
    //   1824: aload_1
    //   1825: areturn
    //   1826: getstatic Perryc.0 : I
    //   1829: ifle -> 1843
    //   1832: ldc2_w -972854143
    //   1835: l2i
    //   1836: ldc_w -852986295
    //   1839: ixor
    //   1840: goto -> 1851
    //   1843: ldc2_w 802960944
    //   1846: l2i
    //   1847: ldc_w -2110571091
    //   1850: ixor
    //   1851: ldc2_w 493899123
    //   1854: l2i
    //   1855: ldc_w -729358164
    //   1858: ixor
    //   1859: ixor
    //   1860: lookupswitch default -> 12890, -1025657065 -> 1843, 1679402562 -> 1888
    //   1888: aload_1
    //   1889: new net/minecraft/util/math/BlockPos
    //   1892: dup
    //   1893: getstatic Perryc.1 : I
    //   1896: ifeq -> 1910
    //   1899: ldc2_w -1498773386
    //   1902: l2i
    //   1903: ldc_w 156020492
    //   1906: ixor
    //   1907: goto -> 1918
    //   1910: ldc2_w -1184581716
    //   1913: l2i
    //   1914: ldc_w 844586462
    //   1917: ixor
    //   1918: ldc2_w -589012383
    //   1921: l2i
    //   1922: ldc_w -966190053
    //   1925: ixor
    //   1926: ixor
    //   1927: lookupswitch default -> 1952, -1251256064 -> 12958, -821141932 -> 1910
    //   1952: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w -258523455
    //   1964: l2i
    //   1965: ldc_w 618409682
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 13645501
    //   1975: l2i
    //   1976: ldc_w 1465904719
    //   1979: ixor
    //   1980: ldc2_w -408552927
    //   1983: l2i
    //   1984: ldc_w -1484182805
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 2016, -1805139751 -> 12874, 1976874035 -> 1972
    //   2016: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2019: getstatic Perryc.0 : I
    //   2022: ifle -> 2036
    //   2025: ldc2_w -195737615
    //   2028: l2i
    //   2029: ldc_w -1137368658
    //   2032: ixor
    //   2033: goto -> 2044
    //   2036: ldc2_w -866382529
    //   2039: l2i
    //   2040: ldc_w 1826613736
    //   2043: ixor
    //   2044: ldc2_w -923386294
    //   2047: l2i
    //   2048: ldc_w 786000667
    //   2051: ixor
    //   2052: ixor
    //   2053: lookupswitch default -> 12806, -1370541298 -> 2036, 1185722758 -> 2080
    //   2080: getfield field_70165_t : D
    //   2083: ldc2_w 11.66732989951459
    //   2086: invokestatic doubleToLongBits : (D)J
    //   2089: ldc2_w 9211925761168776643
    //   2092: lxor
    //   2093: invokestatic longBitsToDouble : (J)D
    //   2096: dadd
    //   2097: getstatic Perryc.0 : I
    //   2100: ifle -> 2114
    //   2103: ldc2_w -310251942
    //   2106: l2i
    //   2107: ldc_w 92535530
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w -682588922
    //   2117: l2i
    //   2118: ldc_w 2109467532
    //   2121: ixor
    //   2122: ldc2_w 102747250
    //   2125: l2i
    //   2126: ldc_w 1347426903
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 2156, -1102200171 -> 12964, 2007398251 -> 2114
    //   2156: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   2159: getstatic Perryc.c : I
    //   2162: iflt -> 2176
    //   2165: ldc2_w 826502120
    //   2168: l2i
    //   2169: ldc_w 1169638311
    //   2172: ixor
    //   2173: goto -> 2184
    //   2176: ldc2_w 583751136
    //   2179: l2i
    //   2180: ldc_w 159419912
    //   2183: ixor
    //   2184: ldc2_w -1740563687
    //   2187: l2i
    //   2188: ldc_w 29529528
    //   2191: ixor
    //   2192: ixor
    //   2193: lookupswitch default -> 2220, -1196766211 -> 2176, -310925586 -> 12960
    //   2220: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2223: getstatic Perryc.c : I
    //   2226: iflt -> 2240
    //   2229: ldc2_w 1507896382
    //   2232: l2i
    //   2233: ldc_w -2028342984
    //   2236: ixor
    //   2237: goto -> 2248
    //   2240: ldc2_w -2072245289
    //   2243: l2i
    //   2244: ldc_w 1783402090
    //   2247: ixor
    //   2248: ldc2_w 151250431
    //   2251: l2i
    //   2252: ldc_w -304625507
    //   2255: ixor
    //   2256: ixor
    //   2257: lookupswitch default -> 2284, -1781198116 -> 2240, 976056420 -> 12818
    //   2284: getfield field_70163_u : D
    //   2287: ldc2_w 4.60655179632591
    //   2290: invokestatic doubleToLongBits : (D)J
    //   2293: ldc2_w 9215047754211013384
    //   2296: lxor
    //   2297: invokestatic longBitsToDouble : (J)D
    //   2300: dadd
    //   2301: getstatic Perryc.1 : I
    //   2304: ifeq -> 2318
    //   2307: ldc2_w 1555394743
    //   2310: l2i
    //   2311: ldc_w -911728697
    //   2314: ixor
    //   2315: goto -> 2326
    //   2318: ldc2_w 564769676
    //   2321: l2i
    //   2322: ldc_w -542772169
    //   2325: ixor
    //   2326: ldc2_w 241813176
    //   2329: l2i
    //   2330: ldc_w 1644644457
    //   2333: ixor
    //   2334: ixor
    //   2335: lookupswitch default -> 2360, -109846111 -> 12894, 965487234 -> 2318
    //   2360: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   2363: getstatic Perryc.1 : I
    //   2366: ifeq -> 2380
    //   2369: ldc2_w 1870378615
    //   2372: l2i
    //   2373: ldc_w -957664215
    //   2376: ixor
    //   2377: goto -> 2388
    //   2380: ldc2_w -52478929
    //   2383: l2i
    //   2384: ldc_w 487599395
    //   2387: ixor
    //   2388: ldc2_w 232748772
    //   2391: l2i
    //   2392: ldc_w -1168311443
    //   2395: ixor
    //   2396: ixor
    //   2397: lookupswitch default -> 2424, 504565719 -> 12916, 1519380172 -> 2380
    //   2424: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2427: getstatic Perryc.c : I
    //   2430: iflt -> 2444
    //   2433: ldc2_w 467858311
    //   2436: l2i
    //   2437: ldc_w -895574737
    //   2440: ixor
    //   2441: goto -> 2452
    //   2444: ldc2_w 2045758187
    //   2447: l2i
    //   2448: ldc_w 252191904
    //   2451: ixor
    //   2452: ldc2_w 225868068
    //   2455: l2i
    //   2456: ldc_w -1669624567
    //   2459: ixor
    //   2460: ixor
    //   2461: lookupswitch default -> 2488, 596872394 -> 2444, 1081186949 -> 12946
    //   2488: getfield field_70161_v : D
    //   2491: getstatic Perryc.1 : I
    //   2494: ifeq -> 2508
    //   2497: ldc2_w 568240516
    //   2500: l2i
    //   2501: ldc_w -1987775583
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -1552381307
    //   2511: l2i
    //   2512: ldc_w 749761927
    //   2515: ixor
    //   2516: ldc2_w -396182534
    //   2519: l2i
    //   2520: ldc_w 1540524099
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 13022, 468347292 -> 2508, 1014549691 -> 2552
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokespecial <init> : (DDD)V
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: getstatic Perryc.1 : I
    //   2566: ifeq -> 2580
    //   2569: ldc2_w 1104972982
    //   2572: l2i
    //   2573: ldc_w 152921263
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w -792158260
    //   2583: l2i
    //   2584: ldc_w 464265098
    //   2587: ixor
    //   2588: ldc2_w 44939111
    //   2591: l2i
    //   2592: ldc_w -974414235
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 13054, -1886928613 -> 2580, 203598148 -> 2624
    //   2624: goto -> 2628
    //   2627: athrow
    //   2628: invokevirtual add : (Ljava/lang/Object;)Z
    //   2631: goto -> 2635
    //   2634: athrow
    //   2635: pop
    //   2636: getstatic Perryc.0 : I
    //   2639: ifle -> 2653
    //   2642: ldc2_w 1232945288
    //   2645: l2i
    //   2646: ldc_w 2102956050
    //   2649: ixor
    //   2650: goto -> 2661
    //   2653: ldc2_w 1777599288
    //   2656: l2i
    //   2657: ldc_w -1370929189
    //   2660: ixor
    //   2661: ldc2_w 171706539
    //   2664: l2i
    //   2665: ldc_w 411928611
    //   2668: ixor
    //   2669: ixor
    //   2670: lookupswitch default -> 2696, 647254034 -> 12988, 1965230812 -> 2653
    //   2696: aload_1
    //   2697: new net/minecraft/util/math/BlockPos
    //   2700: dup
    //   2701: getstatic Perryc.1 : I
    //   2704: ifeq -> 2718
    //   2707: ldc2_w -890775574
    //   2710: l2i
    //   2711: ldc_w 1689290491
    //   2714: ixor
    //   2715: goto -> 2726
    //   2718: ldc2_w -1000159462
    //   2721: l2i
    //   2722: ldc_w -1412031494
    //   2725: ixor
    //   2726: ldc2_w -1342993791
    //   2729: l2i
    //   2730: ldc_w 1765094101
    //   2733: ixor
    //   2734: ixor
    //   2735: lookupswitch default -> 12898, -1452120908 -> 2760, 1754392901 -> 2718
    //   2760: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   2763: getstatic Perryc.0 : I
    //   2766: ifle -> 2780
    //   2769: ldc2_w 1750297320
    //   2772: l2i
    //   2773: ldc_w -1803475724
    //   2776: ixor
    //   2777: goto -> 2788
    //   2780: ldc2_w -904028205
    //   2783: l2i
    //   2784: ldc_w -1004137161
    //   2787: ixor
    //   2788: ldc2_w -1599174006
    //   2791: l2i
    //   2792: ldc_w -990964937
    //   2795: ixor
    //   2796: ixor
    //   2797: lookupswitch default -> 12782, -1735141471 -> 2780, 1786385241 -> 2824
    //   2824: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2827: getstatic Perryc.c : I
    //   2830: iflt -> 2844
    //   2833: ldc2_w 550982867
    //   2836: l2i
    //   2837: ldc_w -1009220866
    //   2840: ixor
    //   2841: goto -> 2852
    //   2844: ldc2_w 13674758
    //   2847: l2i
    //   2848: ldc_w -1461563360
    //   2851: ixor
    //   2852: ldc2_w -1919415466
    //   2855: l2i
    //   2856: ldc_w -1457217595
    //   2859: ixor
    //   2860: ixor
    //   2861: lookupswitch default -> 2888, -1187484180 -> 2844, -944553282 -> 12808
    //   2888: getfield field_70165_t : D
    //   2891: ldc2_w -21.910484655900998
    //   2894: invokestatic doubleToLongBits : (D)J
    //   2897: ldc2_w 9207021291876162247
    //   2900: lxor
    //   2901: invokestatic longBitsToDouble : (J)D
    //   2904: dadd
    //   2905: getstatic Perryc.0 : I
    //   2908: ifle -> 2922
    //   2911: ldc2_w 107885209
    //   2914: l2i
    //   2915: ldc_w -2099468021
    //   2918: ixor
    //   2919: goto -> 2930
    //   2922: ldc2_w -1888095351
    //   2925: l2i
    //   2926: ldc_w 1915501206
    //   2929: ixor
    //   2930: ldc2_w 672838600
    //   2933: l2i
    //   2934: ldc_w -2038014815
    //   2937: ixor
    //   2938: ixor
    //   2939: lookupswitch default -> 2964, 707687675 -> 13080, 1630018448 -> 2922
    //   2964: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   2967: getstatic Perryc.1 : I
    //   2970: ifeq -> 2984
    //   2973: ldc2_w 1689096247
    //   2976: l2i
    //   2977: ldc_w -841024626
    //   2980: ixor
    //   2981: goto -> 2992
    //   2984: ldc2_w 2115972952
    //   2987: l2i
    //   2988: ldc_w -958433771
    //   2991: ixor
    //   2992: ldc2_w -282204355
    //   2995: l2i
    //   2996: ldc_w -306395226
    //   2999: ixor
    //   3000: ixor
    //   3001: lookupswitch default -> 13136, -1411232990 -> 2984, -1169065514 -> 3028
    //   3028: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3031: getstatic Perryc.1 : I
    //   3034: ifeq -> 3048
    //   3037: ldc2_w -1990341576
    //   3040: l2i
    //   3041: ldc_w -1046976463
    //   3044: ixor
    //   3045: goto -> 3056
    //   3048: ldc2_w 684054813
    //   3051: l2i
    //   3052: ldc_w 787370652
    //   3055: ixor
    //   3056: ldc2_w -1190432701
    //   3059: l2i
    //   3060: ldc_w -979409475
    //   3063: ixor
    //   3064: ixor
    //   3065: lookupswitch default -> 3092, -1387034 -> 3048, 877769207 -> 12774
    //   3092: getfield field_70163_u : D
    //   3095: ldc2_w 5.7560454793215206
    //   3098: invokestatic doubleToLongBits : (D)J
    //   3101: ldc2_w 9216341969041614327
    //   3104: lxor
    //   3105: invokestatic longBitsToDouble : (J)D
    //   3108: dadd
    //   3109: getstatic Perryc.c : I
    //   3112: iflt -> 3126
    //   3115: ldc2_w 2101727772
    //   3118: l2i
    //   3119: ldc_w 885840834
    //   3122: ixor
    //   3123: goto -> 3134
    //   3126: ldc2_w -1459738863
    //   3129: l2i
    //   3130: ldc_w 1218120529
    //   3133: ixor
    //   3134: ldc2_w 265185755
    //   3137: l2i
    //   3138: ldc_w 361482342
    //   3141: ixor
    //   3142: ixor
    //   3143: lookupswitch default -> 13100, -98529795 -> 3168, 1405921379 -> 3126
    //   3168: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   3171: getstatic Perryc.1 : I
    //   3174: ifeq -> 3188
    //   3177: ldc2_w 212303388
    //   3180: l2i
    //   3181: ldc_w 1318773674
    //   3184: ixor
    //   3185: goto -> 3196
    //   3188: ldc2_w -2060530911
    //   3191: l2i
    //   3192: ldc_w -26563539
    //   3195: ixor
    //   3196: ldc2_w -131820999
    //   3199: l2i
    //   3200: ldc_w 1549151016
    //   3203: ixor
    //   3204: ixor
    //   3205: lookupswitch default -> 3232, -431020889 -> 12992, 1682056918 -> 3188
    //   3232: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3235: getstatic Perryc.c : I
    //   3238: iflt -> 3252
    //   3241: ldc2_w -790676301
    //   3244: l2i
    //   3245: ldc_w -812842866
    //   3248: ixor
    //   3249: goto -> 3260
    //   3252: ldc2_w 1490245753
    //   3255: l2i
    //   3256: ldc_w -1714548111
    //   3259: ixor
    //   3260: ldc2_w -1390841128
    //   3263: l2i
    //   3264: ldc_w 542495114
    //   3267: ixor
    //   3268: ixor
    //   3269: lookupswitch default -> 3296, -1843486865 -> 13116, -613939283 -> 3252
    //   3296: getfield field_70161_v : D
    //   3299: getstatic Perryc.1 : I
    //   3302: ifeq -> 3316
    //   3305: ldc2_w -1884605467
    //   3308: l2i
    //   3309: ldc_w -615559903
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w 850552445
    //   3319: l2i
    //   3320: ldc_w 614347826
    //   3323: ixor
    //   3324: ldc2_w -1004065997
    //   3327: l2i
    //   3328: ldc_w -767044252
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, -1541602154 -> 3316, 1115979923 -> 13010
    //   3360: goto -> 3364
    //   3363: athrow
    //   3364: invokespecial <init> : (DDD)V
    //   3367: goto -> 3371
    //   3370: athrow
    //   3371: getstatic Perryc.0 : I
    //   3374: ifle -> 3388
    //   3377: ldc2_w 350865830
    //   3380: l2i
    //   3381: ldc_w -2122927238
    //   3384: ixor
    //   3385: goto -> 3396
    //   3388: ldc2_w -1562288688
    //   3391: l2i
    //   3392: ldc_w 199645311
    //   3395: ixor
    //   3396: ldc2_w -704611108
    //   3399: l2i
    //   3400: ldc_w 1252341616
    //   3403: ixor
    //   3404: ixor
    //   3405: lookupswitch default -> 13086, 154808688 -> 3388, 899829251 -> 3432
    //   3432: goto -> 3436
    //   3435: athrow
    //   3436: invokevirtual add : (Ljava/lang/Object;)Z
    //   3439: goto -> 3443
    //   3442: athrow
    //   3443: pop
    //   3444: getstatic Perryc.c : I
    //   3447: iflt -> 3461
    //   3450: ldc2_w 870421630
    //   3453: l2i
    //   3454: ldc_w 1341645657
    //   3457: ixor
    //   3458: goto -> 3469
    //   3461: ldc2_w 1953218736
    //   3464: l2i
    //   3465: ldc_w -679977564
    //   3468: ixor
    //   3469: ldc2_w -814857915
    //   3472: l2i
    //   3473: ldc_w -717257046
    //   3476: ixor
    //   3477: ixor
    //   3478: lookupswitch default -> 3504, -496409002 -> 3461, 1715974344 -> 12770
    //   3504: aload_1
    //   3505: new net/minecraft/util/math/BlockPos
    //   3508: dup
    //   3509: getstatic Perryc.1 : I
    //   3512: ifeq -> 3526
    //   3515: ldc2_w -1351794520
    //   3518: l2i
    //   3519: ldc_w -785982526
    //   3522: ixor
    //   3523: goto -> 3534
    //   3526: ldc2_w 440296858
    //   3529: l2i
    //   3530: ldc_w -2023786538
    //   3533: ixor
    //   3534: ldc2_w 1900452706
    //   3537: l2i
    //   3538: ldc_w -2057159119
    //   3541: ixor
    //   3542: ixor
    //   3543: lookupswitch default -> 3568, -1972421063 -> 12780, -1259985935 -> 3526
    //   3568: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   3571: getstatic Perryc.0 : I
    //   3574: ifle -> 3588
    //   3577: ldc2_w 886364508
    //   3580: l2i
    //   3581: ldc_w -290610901
    //   3584: ixor
    //   3585: goto -> 3596
    //   3588: ldc2_w 2127793680
    //   3591: l2i
    //   3592: ldc_w 1044439844
    //   3595: ixor
    //   3596: ldc2_w -1558844897
    //   3599: l2i
    //   3600: ldc_w 656353064
    //   3603: ixor
    //   3604: ixor
    //   3605: lookupswitch default -> 3632, 656459005 -> 3588, 1584641344 -> 13114
    //   3632: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3635: getstatic Perryc.1 : I
    //   3638: ifeq -> 3652
    //   3641: ldc2_w -1050143827
    //   3644: l2i
    //   3645: ldc_w -778539877
    //   3648: ixor
    //   3649: goto -> 3660
    //   3652: ldc2_w -1861371865
    //   3655: l2i
    //   3656: ldc_w 109939817
    //   3659: ixor
    //   3660: ldc2_w 500025005
    //   3663: l2i
    //   3664: ldc_w 1023458050
    //   3667: ixor
    //   3668: ixor
    //   3669: lookupswitch default -> 3696, -391093574 -> 3652, 809304729 -> 13078
    //   3696: getfield field_70165_t : D
    //   3699: getstatic Perryc.1 : I
    //   3702: ifeq -> 3716
    //   3705: ldc2_w -582534243
    //   3708: l2i
    //   3709: ldc_w 1211484501
    //   3712: ixor
    //   3713: goto -> 3724
    //   3716: ldc2_w 372284652
    //   3719: l2i
    //   3720: ldc_w -435795744
    //   3723: ixor
    //   3724: ldc2_w -1162122702
    //   3727: l2i
    //   3728: ldc_w 1065534872
    //   3731: ixor
    //   3732: ixor
    //   3733: lookupswitch default -> 12896, 273374562 -> 3716, 1963948966 -> 3760
    //   3760: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   3763: getstatic Perryc.0 : I
    //   3766: ifle -> 3780
    //   3769: ldc2_w 54154125
    //   3772: l2i
    //   3773: ldc_w 616495155
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w -593773016
    //   3783: l2i
    //   3784: ldc_w -381293055
    //   3787: ixor
    //   3788: ldc2_w 1710800270
    //   3791: l2i
    //   3792: ldc_w -296842580
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 12820, -1405969252 -> 3780, -1100454133 -> 3824
    //   3824: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3827: getstatic Perryc.0 : I
    //   3830: ifle -> 3844
    //   3833: ldc2_w 668832672
    //   3836: l2i
    //   3837: ldc_w 1459558837
    //   3840: ixor
    //   3841: goto -> 3852
    //   3844: ldc2_w -919768316
    //   3847: l2i
    //   3848: ldc_w -1453983296
    //   3851: ixor
    //   3852: ldc2_w -1985418370
    //   3855: l2i
    //   3856: ldc_w -1129307357
    //   3859: ixor
    //   3860: ixor
    //   3861: lookupswitch default -> 3888, 1144668744 -> 12930, 1322210273 -> 3844
    //   3888: getfield field_70163_u : D
    //   3891: ldc2_w 6.128555899442318
    //   3894: invokestatic doubleToLongBits : (D)J
    //   3897: ldc2_w 9216761378488926240
    //   3900: lxor
    //   3901: invokestatic longBitsToDouble : (J)D
    //   3904: dadd
    //   3905: getstatic Perryc.c : I
    //   3908: iflt -> 3922
    //   3911: ldc2_w 1294913458
    //   3914: l2i
    //   3915: ldc_w 1019461563
    //   3918: ixor
    //   3919: goto -> 3930
    //   3922: ldc2_w -557293897
    //   3925: l2i
    //   3926: ldc_w 1609008300
    //   3929: ixor
    //   3930: ldc2_w -69331161
    //   3933: l2i
    //   3934: ldc_w -376678377
    //   3937: ixor
    //   3938: ixor
    //   3939: lookupswitch default -> 12854, -1820486357 -> 3964, 1673477945 -> 3922
    //   3964: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   3967: getstatic Perryc.0 : I
    //   3970: ifle -> 3984
    //   3973: ldc2_w -602552415
    //   3976: l2i
    //   3977: ldc_w 480646199
    //   3980: ixor
    //   3981: goto -> 3992
    //   3984: ldc2_w -153018070
    //   3987: l2i
    //   3988: ldc_w 892225790
    //   3991: ixor
    //   3992: ldc2_w 1840734229
    //   3995: l2i
    //   3996: ldc_w -1188200145
    //   3999: ixor
    //   4000: ixor
    //   4001: lookupswitch default -> 4028, 79210853 -> 3984, 338244268 -> 12862
    //   4028: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4031: getstatic Perryc.0 : I
    //   4034: ifle -> 4048
    //   4037: ldc2_w -1066401300
    //   4040: l2i
    //   4041: ldc_w 1096740632
    //   4044: ixor
    //   4045: goto -> 4056
    //   4048: ldc2_w -1628386487
    //   4051: l2i
    //   4052: ldc_w 1229698788
    //   4055: ixor
    //   4056: ldc2_w -1042888829
    //   4059: l2i
    //   4060: ldc_w 490303462
    //   4063: ixor
    //   4064: ixor
    //   4065: lookupswitch default -> 4092, 1572947601 -> 12924, 1898207095 -> 4048
    //   4092: getfield field_70161_v : D
    //   4095: ldc2_w 22.382870634050132
    //   4098: invokestatic doubleToLongBits : (D)J
    //   4101: ldc2_w 9207154256708360215
    //   4104: lxor
    //   4105: invokestatic longBitsToDouble : (J)D
    //   4108: dadd
    //   4109: getstatic Perryc.0 : I
    //   4112: ifle -> 4126
    //   4115: ldc2_w 1288829518
    //   4118: l2i
    //   4119: ldc_w -1398490941
    //   4122: ixor
    //   4123: goto -> 4134
    //   4126: ldc2_w -582464360
    //   4129: l2i
    //   4130: ldc_w 472561531
    //   4133: ixor
    //   4134: ldc2_w 704193309
    //   4137: l2i
    //   4138: ldc_w 1238590607
    //   4141: ixor
    //   4142: ixor
    //   4143: lookupswitch default -> 12982, -2141256417 -> 4126, -1589068687 -> 4168
    //   4168: goto -> 4172
    //   4171: athrow
    //   4172: invokespecial <init> : (DDD)V
    //   4175: goto -> 4179
    //   4178: athrow
    //   4179: getstatic Perryc.c : I
    //   4182: iflt -> 4196
    //   4185: ldc2_w -333892770
    //   4188: l2i
    //   4189: ldc_w -1178994451
    //   4192: ixor
    //   4193: goto -> 4204
    //   4196: ldc2_w -105125848
    //   4199: l2i
    //   4200: ldc_w -1694340950
    //   4203: ixor
    //   4204: ldc2_w 1026638857
    //   4207: l2i
    //   4208: ldc_w 31127525
    //   4211: ixor
    //   4212: ixor
    //   4213: lookupswitch default -> 4240, 307918418 -> 4196, 1766553695 -> 13028
    //   4240: goto -> 4244
    //   4243: athrow
    //   4244: invokevirtual add : (Ljava/lang/Object;)Z
    //   4247: goto -> 4251
    //   4250: athrow
    //   4251: pop
    //   4252: getstatic Perryc.0 : I
    //   4255: ifle -> 4269
    //   4258: ldc2_w 1216214634
    //   4261: l2i
    //   4262: ldc_w 388965050
    //   4265: ixor
    //   4266: goto -> 4277
    //   4269: ldc2_w 1952967949
    //   4272: l2i
    //   4273: ldc_w 1769995727
    //   4276: ixor
    //   4277: ldc2_w 1306481651
    //   4280: l2i
    //   4281: ldc_w -1821726112
    //   4284: ixor
    //   4285: ixor
    //   4286: lookupswitch default -> 4312, -2115556029 -> 13108, 813945191 -> 4269
    //   4312: aload_1
    //   4313: new net/minecraft/util/math/BlockPos
    //   4316: dup
    //   4317: getstatic Perryc.0 : I
    //   4320: ifle -> 4334
    //   4323: ldc2_w 832036465
    //   4326: l2i
    //   4327: ldc_w -97983221
    //   4330: ixor
    //   4331: goto -> 4342
    //   4334: ldc2_w 2118502967
    //   4337: l2i
    //   4338: ldc_w -1608325631
    //   4341: ixor
    //   4342: ldc2_w -1050550805
    //   4345: l2i
    //   4346: ldc_w 884388694
    //   4349: ixor
    //   4350: ixor
    //   4351: lookupswitch default -> 4376, 379733565 -> 4334, 1047025095 -> 12952
    //   4376: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   4379: getstatic Perryc.0 : I
    //   4382: ifle -> 4396
    //   4385: ldc2_w -274957444
    //   4388: l2i
    //   4389: ldc_w -1296086552
    //   4392: ixor
    //   4393: goto -> 4404
    //   4396: ldc2_w -1399343939
    //   4399: l2i
    //   4400: ldc_w -44094079
    //   4403: ixor
    //   4404: ldc2_w -358014757
    //   4407: l2i
    //   4408: ldc_w 1998950092
    //   4411: ixor
    //   4412: ixor
    //   4413: lookupswitch default -> 13004, -1062232957 -> 4396, -867944661 -> 4440
    //   4440: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4443: getstatic Perryc.c : I
    //   4446: iflt -> 4460
    //   4449: ldc2_w -782212884
    //   4452: l2i
    //   4453: ldc_w -1609198903
    //   4456: ixor
    //   4457: goto -> 4468
    //   4460: ldc2_w 1228665996
    //   4463: l2i
    //   4464: ldc_w 2118341288
    //   4467: ixor
    //   4468: ldc2_w -437616776
    //   4471: l2i
    //   4472: ldc_w -933528504
    //   4475: ixor
    //   4476: ixor
    //   4477: lookupswitch default -> 12918, 449422612 -> 4504, 1556410645 -> 4460
    //   4504: getfield field_70165_t : D
    //   4507: getstatic Perryc.1 : I
    //   4510: ifeq -> 4524
    //   4513: ldc2_w -1918436975
    //   4516: l2i
    //   4517: ldc_w -1230148115
    //   4520: ixor
    //   4521: goto -> 4532
    //   4524: ldc2_w 2043508497
    //   4527: l2i
    //   4528: ldc_w -1406720217
    //   4531: ixor
    //   4532: ldc2_w -1437213122
    //   4535: l2i
    //   4536: ldc_w -658699438
    //   4539: ixor
    //   4540: ixor
    //   4541: lookupswitch default -> 4568, -439964202 -> 4524, 1239630096 -> 12860
    //   4568: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   4571: getstatic Perryc.1 : I
    //   4574: ifeq -> 4588
    //   4577: ldc2_w -1056875413
    //   4580: l2i
    //   4581: ldc_w 955982110
    //   4584: ixor
    //   4585: goto -> 4596
    //   4588: ldc2_w 734268312
    //   4591: l2i
    //   4592: ldc_w -11517254
    //   4595: ixor
    //   4596: ldc2_w 2105822996
    //   4599: l2i
    //   4600: ldc_w -834169065
    //   4603: ixor
    //   4604: ixor
    //   4605: lookupswitch default -> 12822, 1245291894 -> 4588, 1733792033 -> 4632
    //   4632: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4635: getstatic Perryc.c : I
    //   4638: iflt -> 4652
    //   4641: ldc2_w 245173400
    //   4644: l2i
    //   4645: ldc_w 96877412
    //   4648: ixor
    //   4649: goto -> 4660
    //   4652: ldc2_w -1361651533
    //   4655: l2i
    //   4656: ldc_w 1724539038
    //   4659: ixor
    //   4660: ldc2_w -1465267520
    //   4663: l2i
    //   4664: ldc_w 1548893923
    //   4667: ixor
    //   4668: ixor
    //   4669: lookupswitch default -> 12856, -6241313 -> 4652, 1021791246 -> 4696
    //   4696: getfield field_70163_u : D
    //   4699: ldc2_w 12.476295665340418
    //   4702: invokestatic doubleToLongBits : (D)J
    //   4705: ldc2_w 9212381168408967729
    //   4708: lxor
    //   4709: invokestatic longBitsToDouble : (J)D
    //   4712: dadd
    //   4713: getstatic Perryc.c : I
    //   4716: iflt -> 4730
    //   4719: ldc2_w -1043001052
    //   4722: l2i
    //   4723: ldc_w -664066762
    //   4726: ixor
    //   4727: goto -> 4738
    //   4730: ldc2_w 577315720
    //   4733: l2i
    //   4734: ldc_w -1014745510
    //   4737: ixor
    //   4738: ldc2_w -513652777
    //   4741: l2i
    //   4742: ldc_w 1764402882
    //   4745: ixor
    //   4746: ixor
    //   4747: lookupswitch default -> 12832, -1846094585 -> 4730, 1772483783 -> 4772
    //   4772: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   4775: getstatic Perryc.1 : I
    //   4778: ifeq -> 4792
    //   4781: ldc2_w 438489023
    //   4784: l2i
    //   4785: ldc_w -874230040
    //   4788: ixor
    //   4789: goto -> 4800
    //   4792: ldc2_w 612456677
    //   4795: l2i
    //   4796: ldc_w -203037701
    //   4799: ixor
    //   4800: ldc2_w 430145693
    //   4803: l2i
    //   4804: ldc_w 1770221871
    //   4807: ixor
    //   4808: ixor
    //   4809: lookupswitch default -> 4836, -1578733339 -> 13124, 1420313651 -> 4792
    //   4836: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4839: getstatic Perryc.0 : I
    //   4842: ifle -> 4856
    //   4845: ldc2_w 1695296924
    //   4848: l2i
    //   4849: ldc_w -639157290
    //   4852: ixor
    //   4853: goto -> 4864
    //   4856: ldc2_w 1351417885
    //   4859: l2i
    //   4860: ldc_w -1244540054
    //   4863: ixor
    //   4864: ldc2_w 69734698
    //   4867: l2i
    //   4868: ldc_w 1909699399
    //   4871: ixor
    //   4872: ixor
    //   4873: lookupswitch default -> 13066, -1868074726 -> 4900, -921652185 -> 4856
    //   4900: getfield field_70161_v : D
    //   4903: ldc2_w -23.881396512456188
    //   4906: invokestatic doubleToLongBits : (D)J
    //   4909: ldc2_w 9207576054245084875
    //   4912: lxor
    //   4913: invokestatic longBitsToDouble : (J)D
    //   4916: dadd
    //   4917: getstatic Perryc.1 : I
    //   4920: ifeq -> 4934
    //   4923: ldc2_w -869620037
    //   4926: l2i
    //   4927: ldc_w 529410814
    //   4930: ixor
    //   4931: goto -> 4942
    //   4934: ldc2_w -1774681795
    //   4937: l2i
    //   4938: ldc_w 1507914145
    //   4941: ixor
    //   4942: ldc2_w -1814333976
    //   4945: l2i
    //   4946: ldc_w -1817855200
    //   4949: ixor
    //   4950: ixor
    //   4951: lookupswitch default -> 4976, -1400855080 -> 4934, -740670835 -> 12772
    //   4976: goto -> 4980
    //   4979: athrow
    //   4980: invokespecial <init> : (DDD)V
    //   4983: goto -> 4987
    //   4986: athrow
    //   4987: getstatic Perryc.c : I
    //   4990: iflt -> 5004
    //   4993: ldc2_w -562681530
    //   4996: l2i
    //   4997: ldc_w 901970031
    //   5000: ixor
    //   5001: goto -> 5012
    //   5004: ldc2_w 881457844
    //   5007: l2i
    //   5008: ldc_w 1606213832
    //   5011: ixor
    //   5012: ldc2_w -1005835025
    //   5015: l2i
    //   5016: ldc_w -2055038987
    //   5019: ixor
    //   5020: ixor
    //   5021: lookupswitch default -> 12986, -1439012301 -> 5004, 716939622 -> 5048
    //   5048: goto -> 5052
    //   5051: athrow
    //   5052: invokevirtual add : (Ljava/lang/Object;)Z
    //   5055: goto -> 5059
    //   5058: athrow
    //   5059: pop
    //   5060: getstatic Perryc.0 : I
    //   5063: ifle -> 5077
    //   5066: ldc2_w -853346253
    //   5069: l2i
    //   5070: ldc_w 331431962
    //   5073: ixor
    //   5074: goto -> 5085
    //   5077: ldc2_w -1021460161
    //   5080: l2i
    //   5081: ldc_w -2066895706
    //   5084: ixor
    //   5085: ldc2_w -424181433
    //   5088: l2i
    //   5089: ldc_w -714764431
    //   5092: ixor
    //   5093: ixor
    //   5094: lookupswitch default -> 5120, -1578992832 -> 5077, -315509217 -> 13012
    //   5120: aload_0
    //   5121: getstatic Perryc.0 : I
    //   5124: ifle -> 5138
    //   5127: ldc2_w -1218479006
    //   5130: l2i
    //   5131: ldc_w 856096412
    //   5134: ixor
    //   5135: goto -> 5146
    //   5138: ldc2_w 1130748407
    //   5141: l2i
    //   5142: ldc_w -1178462681
    //   5145: ixor
    //   5146: ldc2_w 1636009044
    //   5149: l2i
    //   5150: ldc_w 214133452
    //   5153: ixor
    //   5154: ixor
    //   5155: lookupswitch default -> 5180, -384209818 -> 12788, 1784269646 -> 5138
    //   5180: getfield extra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5183: getstatic Perryc.1 : I
    //   5186: ifeq -> 5200
    //   5189: ldc2_w 457568735
    //   5192: l2i
    //   5193: ldc_w -1156021303
    //   5196: ixor
    //   5197: goto -> 5208
    //   5200: ldc2_w 1922306023
    //   5203: l2i
    //   5204: ldc_w 1289043074
    //   5207: ixor
    //   5208: ldc2_w -1746231125
    //   5211: l2i
    //   5212: ldc_w -1324230267
    //   5215: ixor
    //   5216: ixor
    //   5217: lookupswitch default -> 5244, -2035938504 -> 13064, 182335342 -> 5200
    //   5244: goto -> 5248
    //   5247: athrow
    //   5248: invokevirtual getValue : ()Ljava/lang/Object;
    //   5251: goto -> 5255
    //   5254: athrow
    //   5255: checkcast java/lang/Boolean
    //   5258: getstatic Perryc.1 : I
    //   5261: ifeq -> 5275
    //   5264: ldc2_w -1309541383
    //   5267: l2i
    //   5268: ldc_w -2113106620
    //   5271: ixor
    //   5272: goto -> 5283
    //   5275: ldc2_w -1966351526
    //   5278: l2i
    //   5279: ldc_w -873477357
    //   5282: ixor
    //   5283: ldc2_w 1637467477
    //   5286: l2i
    //   5287: ldc_w -1481580175
    //   5290: ixor
    //   5291: ixor
    //   5292: lookupswitch default -> 5320, -170634599 -> 12842, 1761685275 -> 5275
    //   5320: goto -> 5324
    //   5323: athrow
    //   5324: invokevirtual booleanValue : ()Z
    //   5327: goto -> 5331
    //   5330: athrow
    //   5331: ifeq -> 5345
    //   5334: ldc2_w 1998597210
    //   5337: l2i
    //   5338: ldc_w -1875633549
    //   5341: ixor
    //   5342: goto -> 5353
    //   5345: ldc2_w 1561694522
    //   5348: l2i
    //   5349: ldc_w -1174296804
    //   5352: ixor
    //   5353: ldc2_w -1145783973
    //   5356: l2i
    //   5357: ldc_w -337041099
    //   5360: ixor
    //   5361: ixor
    //   5362: tableswitch default -> 5334, -1219910073 -> 5384, -1219910072 -> 8616
    //   5384: getstatic Perryc.0 : I
    //   5387: ifle -> 5401
    //   5390: ldc2_w 975205899
    //   5393: l2i
    //   5394: ldc_w 626222124
    //   5397: ixor
    //   5398: goto -> 5409
    //   5401: ldc2_w 1367353115
    //   5404: l2i
    //   5405: ldc_w 1261067805
    //   5408: ixor
    //   5409: ldc2_w 957316409
    //   5412: l2i
    //   5413: ldc_w -1412607151
    //   5416: ixor
    //   5417: ixor
    //   5418: lookupswitch default -> 5444, -1917764529 -> 12954, 752471815 -> 5401
    //   5444: aload_1
    //   5445: new net/minecraft/util/math/BlockPos
    //   5448: dup
    //   5449: getstatic Perryc.0 : I
    //   5452: ifle -> 5466
    //   5455: ldc2_w 1490580226
    //   5458: l2i
    //   5459: ldc_w 1990401680
    //   5462: ixor
    //   5463: goto -> 5474
    //   5466: ldc2_w -14419323
    //   5469: l2i
    //   5470: ldc_w -1134202539
    //   5473: ixor
    //   5474: ldc2_w -1607858551
    //   5477: l2i
    //   5478: ldc_w 1271372617
    //   5481: ixor
    //   5482: ixor
    //   5483: lookupswitch default -> 5508, -1011915154 -> 5466, -979963822 -> 12814
    //   5508: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   5511: getstatic Perryc.1 : I
    //   5514: ifeq -> 5528
    //   5517: ldc2_w -2043787569
    //   5520: l2i
    //   5521: ldc_w -96649360
    //   5524: ixor
    //   5525: goto -> 5536
    //   5528: ldc2_w -2011326319
    //   5531: l2i
    //   5532: ldc_w -1222453981
    //   5535: ixor
    //   5536: ldc2_w -817875060
    //   5539: l2i
    //   5540: ldc_w -1103033907
    //   5543: ixor
    //   5544: ixor
    //   5545: lookupswitch default -> 13056, 219301886 -> 5528, 1312715763 -> 5572
    //   5572: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5575: getstatic Perryc.0 : I
    //   5578: ifle -> 5592
    //   5581: ldc2_w 155216380
    //   5584: l2i
    //   5585: ldc_w 1420061033
    //   5588: ixor
    //   5589: goto -> 5600
    //   5592: ldc2_w -1119834648
    //   5595: l2i
    //   5596: ldc_w 1686238987
    //   5599: ixor
    //   5600: ldc2_w 1610251262
    //   5603: l2i
    //   5604: ldc_w -1371192363
    //   5607: ixor
    //   5608: ixor
    //   5609: lookupswitch default -> 5636, -1403307842 -> 12962, 1100248871 -> 5592
    //   5636: getfield field_70165_t : D
    //   5639: ldc2_w 13.384844443254098
    //   5642: invokestatic doubleToLongBits : (D)J
    //   5645: ldc2_w 9212892635901175225
    //   5648: lxor
    //   5649: invokestatic longBitsToDouble : (J)D
    //   5652: dadd
    //   5653: getstatic Perryc.0 : I
    //   5656: ifle -> 5670
    //   5659: ldc2_w -2055376038
    //   5662: l2i
    //   5663: ldc_w -1717282870
    //   5666: ixor
    //   5667: goto -> 5678
    //   5670: ldc2_w 2086867109
    //   5673: l2i
    //   5674: ldc_w -660304250
    //   5677: ixor
    //   5678: ldc2_w -1806120769
    //   5681: l2i
    //   5682: ldc_w -1756682734
    //   5685: ixor
    //   5686: ixor
    //   5687: lookupswitch default -> 5712, 533383741 -> 12920, 756190998 -> 5670
    //   5712: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   5715: getstatic Perryc.0 : I
    //   5718: ifle -> 5732
    //   5721: ldc2_w 1118387501
    //   5724: l2i
    //   5725: ldc_w -2093519338
    //   5728: ixor
    //   5729: goto -> 5740
    //   5732: ldc2_w -463164706
    //   5735: l2i
    //   5736: ldc_w -863163141
    //   5739: ixor
    //   5740: ldc2_w -1891516996
    //   5743: l2i
    //   5744: ldc_w -655396364
    //   5747: ixor
    //   5748: ixor
    //   5749: lookupswitch default -> 5776, -1775198349 -> 12868, 831645764 -> 5732
    //   5776: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5779: getstatic Perryc.0 : I
    //   5782: ifle -> 5796
    //   5785: ldc2_w 1435923702
    //   5788: l2i
    //   5789: ldc_w -1881776997
    //   5792: ixor
    //   5793: goto -> 5804
    //   5796: ldc2_w 889161469
    //   5799: l2i
    //   5800: ldc_w -1528425340
    //   5803: ixor
    //   5804: ldc2_w 1249068478
    //   5807: l2i
    //   5808: ldc_w 505969245
    //   5811: ixor
    //   5812: ixor
    //   5813: lookupswitch default -> 5840, -1910827122 -> 12922, -1848913363 -> 5796
    //   5840: getfield field_70163_u : D
    //   5843: ldc2_w 0.8002847963234282
    //   5846: invokestatic doubleToLongBits : (D)J
    //   5849: ldc2_w 9217069562593689249
    //   5852: lxor
    //   5853: invokestatic longBitsToDouble : (J)D
    //   5856: dadd
    //   5857: getstatic Perryc.1 : I
    //   5860: ifeq -> 5874
    //   5863: ldc2_w -1375449654
    //   5866: l2i
    //   5867: ldc_w 1161761457
    //   5870: ixor
    //   5871: goto -> 5882
    //   5874: ldc2_w 100674353
    //   5877: l2i
    //   5878: ldc_w 1688685426
    //   5881: ixor
    //   5882: ldc2_w -1107151099
    //   5885: l2i
    //   5886: ldc_w 1543796441
    //   5889: ixor
    //   5890: ixor
    //   5891: lookupswitch default -> 5916, 155000487 -> 12970, 1556427995 -> 5874
    //   5916: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   5919: getstatic Perryc.c : I
    //   5922: iflt -> 5936
    //   5925: ldc2_w 1006527959
    //   5928: l2i
    //   5929: ldc_w 1052951706
    //   5932: ixor
    //   5933: goto -> 5944
    //   5936: ldc2_w 1040605057
    //   5939: l2i
    //   5940: ldc_w 559935950
    //   5943: ixor
    //   5944: ldc2_w 1285841547
    //   5947: l2i
    //   5948: ldc_w -703045662
    //   5951: ixor
    //   5952: ixor
    //   5953: lookupswitch default -> 5980, -1618961372 -> 13006, 759088993 -> 5936
    //   5980: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5983: getstatic Perryc.c : I
    //   5986: iflt -> 6000
    //   5989: ldc2_w -910607640
    //   5992: l2i
    //   5993: ldc_w 1239776567
    //   5996: ixor
    //   5997: goto -> 6008
    //   6000: ldc2_w 465745274
    //   6003: l2i
    //   6004: ldc_w -1743428323
    //   6007: ixor
    //   6008: ldc2_w -1883418128
    //   6011: l2i
    //   6012: ldc_w 1403262665
    //   6015: ixor
    //   6016: ixor
    //   6017: lookupswitch default -> 12972, 1548026086 -> 6000, 1607374686 -> 6044
    //   6044: getfield field_70161_v : D
    //   6047: getstatic Perryc.0 : I
    //   6050: ifle -> 6064
    //   6053: ldc2_w 1193460959
    //   6056: l2i
    //   6057: ldc_w 1617807343
    //   6060: ixor
    //   6061: goto -> 6072
    //   6064: ldc2_w -1435346102
    //   6067: l2i
    //   6068: ldc_w -2025766967
    //   6071: ixor
    //   6072: ldc2_w -475774159
    //   6075: l2i
    //   6076: ldc_w -1035397607
    //   6079: ixor
    //   6080: ixor
    //   6081: lookupswitch default -> 12802, 111302168 -> 6064, 215888299 -> 6108
    //   6108: goto -> 6112
    //   6111: athrow
    //   6112: invokespecial <init> : (DDD)V
    //   6115: goto -> 6119
    //   6118: athrow
    //   6119: getstatic Perryc.c : I
    //   6122: iflt -> 6136
    //   6125: ldc2_w 531310831
    //   6128: l2i
    //   6129: ldc_w 1658489898
    //   6132: ixor
    //   6133: goto -> 6144
    //   6136: ldc2_w 650337865
    //   6139: l2i
    //   6140: ldc_w 1087858649
    //   6143: ixor
    //   6144: ldc2_w -958451814
    //   6147: l2i
    //   6148: ldc_w 818993775
    //   6151: ixor
    //   6152: ixor
    //   6153: lookupswitch default -> 12934, -1954655952 -> 6136, -1877226395 -> 6180
    //   6180: goto -> 6184
    //   6183: athrow
    //   6184: invokevirtual add : (Ljava/lang/Object;)Z
    //   6187: goto -> 6191
    //   6190: athrow
    //   6191: pop
    //   6192: getstatic Perryc.1 : I
    //   6195: ifeq -> 6209
    //   6198: ldc2_w 605488553
    //   6201: l2i
    //   6202: ldc_w 526207615
    //   6205: ixor
    //   6206: goto -> 6217
    //   6209: ldc2_w -2145610614
    //   6212: l2i
    //   6213: ldc_w 491115632
    //   6216: ixor
    //   6217: ldc2_w -2014091137
    //   6220: l2i
    //   6221: ldc_w 407696540
    //   6224: ixor
    //   6225: ixor
    //   6226: lookupswitch default -> 12800, -1527393483 -> 6209, 48684057 -> 6252
    //   6252: aload_1
    //   6253: new net/minecraft/util/math/BlockPos
    //   6256: dup
    //   6257: getstatic Perryc.1 : I
    //   6260: ifeq -> 6274
    //   6263: ldc2_w 1074660067
    //   6266: l2i
    //   6267: ldc_w 1168942862
    //   6270: ixor
    //   6271: goto -> 6282
    //   6274: ldc2_w -1596786839
    //   6277: l2i
    //   6278: ldc_w -1504632496
    //   6281: ixor
    //   6282: ldc2_w -1986782665
    //   6285: l2i
    //   6286: ldc_w -714200840
    //   6289: ixor
    //   6290: ixor
    //   6291: lookupswitch default -> 6316, 371057244 -> 6274, 1498978082 -> 12914
    //   6316: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   6319: getstatic Perryc.c : I
    //   6322: iflt -> 6336
    //   6325: ldc2_w -2140796723
    //   6328: l2i
    //   6329: ldc_w 547217084
    //   6332: ixor
    //   6333: goto -> 6344
    //   6336: ldc2_w -1706185988
    //   6339: l2i
    //   6340: ldc_w -74867214
    //   6343: ixor
    //   6344: ldc2_w -1168027762
    //   6347: l2i
    //   6348: ldc_w -1251058601
    //   6351: ixor
    //   6352: ixor
    //   6353: lookupswitch default -> 12840, -1342913112 -> 6336, 1858806999 -> 6380
    //   6380: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6383: getstatic Perryc.c : I
    //   6386: iflt -> 6400
    //   6389: ldc2_w -676837261
    //   6392: l2i
    //   6393: ldc_w 1980326368
    //   6396: ixor
    //   6397: goto -> 6408
    //   6400: ldc2_w 1066370014
    //   6403: l2i
    //   6404: ldc_w 1071122383
    //   6407: ixor
    //   6408: ldc2_w -779357654
    //   6411: l2i
    //   6412: ldc_w 1824445983
    //   6415: ixor
    //   6416: ixor
    //   6417: lookupswitch default -> 6444, -233389148 -> 6400, 479464870 -> 12794
    //   6444: getfield field_70165_t : D
    //   6447: ldc2_w -28.81879203901688
    //   6450: invokestatic doubleToLongBits : (D)J
    //   6453: ldc2_w 9208965807535934843
    //   6456: lxor
    //   6457: invokestatic longBitsToDouble : (J)D
    //   6460: dadd
    //   6461: getstatic Perryc.0 : I
    //   6464: ifle -> 6478
    //   6467: ldc2_w 888611793
    //   6470: l2i
    //   6471: ldc_w -1557360788
    //   6474: ixor
    //   6475: goto -> 6486
    //   6478: ldc2_w 1144758314
    //   6481: l2i
    //   6482: ldc_w -1265292955
    //   6485: ixor
    //   6486: ldc2_w 1067174846
    //   6489: l2i
    //   6490: ldc_w -718049466
    //   6493: ixor
    //   6494: ixor
    //   6495: lookupswitch default -> 6520, -224924330 -> 6478, 2104690757 -> 13106
    //   6520: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   6523: getstatic Perryc.1 : I
    //   6526: ifeq -> 6540
    //   6529: ldc2_w -225559777
    //   6532: l2i
    //   6533: ldc_w 1178936759
    //   6536: ixor
    //   6537: goto -> 6548
    //   6540: ldc2_w 1579294150
    //   6543: l2i
    //   6544: ldc_w 1413030622
    //   6547: ixor
    //   6548: ldc2_w 1536711686
    //   6551: l2i
    //   6552: ldc_w -452500538
    //   6555: ixor
    //   6556: ixor
    //   6557: lookupswitch default -> 6584, -2132985660 -> 6540, 173285736 -> 13082
    //   6584: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6587: getstatic Perryc.1 : I
    //   6590: ifeq -> 6604
    //   6593: ldc2_w -1326781201
    //   6596: l2i
    //   6597: ldc_w 1346396610
    //   6600: ixor
    //   6601: goto -> 6612
    //   6604: ldc2_w 325814403
    //   6607: l2i
    //   6608: ldc_w 433088299
    //   6611: ixor
    //   6612: ldc2_w 1644827562
    //   6615: l2i
    //   6616: ldc_w 158225020
    //   6619: ixor
    //   6620: ixor
    //   6621: lookupswitch default -> 13088, -1949381381 -> 6604, 1642049150 -> 6648
    //   6648: getfield field_70163_u : D
    //   6651: ldc2_w 0.2480287701811624
    //   6654: invokestatic doubleToLongBits : (D)J
    //   6657: ldc2_w 9209790216933643691
    //   6660: lxor
    //   6661: invokestatic longBitsToDouble : (J)D
    //   6664: dadd
    //   6665: getstatic Perryc.c : I
    //   6668: iflt -> 6682
    //   6671: ldc2_w -606172697
    //   6674: l2i
    //   6675: ldc_w -1160127746
    //   6678: ixor
    //   6679: goto -> 6690
    //   6682: ldc2_w 1012907653
    //   6685: l2i
    //   6686: ldc_w -746361742
    //   6689: ixor
    //   6690: ldc2_w 1110749440
    //   6693: l2i
    //   6694: ldc_w 1478035398
    //   6697: ixor
    //   6698: ixor
    //   6699: lookupswitch default -> 6724, 1032238224 -> 6682, 2066408927 -> 12926
    //   6724: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   6727: getstatic Perryc.c : I
    //   6730: iflt -> 6744
    //   6733: ldc2_w 948416291
    //   6736: l2i
    //   6737: ldc_w 1054951021
    //   6740: ixor
    //   6741: goto -> 6752
    //   6744: ldc2_w 899321348
    //   6747: l2i
    //   6748: ldc_w -2114459348
    //   6751: ixor
    //   6752: ldc2_w -462144990
    //   6755: l2i
    //   6756: ldc_w -1182911179
    //   6759: ixor
    //   6760: ixor
    //   6761: lookupswitch default -> 12904, -379099073 -> 6788, 1533863513 -> 6744
    //   6788: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6791: getstatic Perryc.c : I
    //   6794: iflt -> 6808
    //   6797: ldc2_w -1031258902
    //   6800: l2i
    //   6801: ldc_w -1499367980
    //   6804: ixor
    //   6805: goto -> 6816
    //   6808: ldc2_w 2074626637
    //   6811: l2i
    //   6812: ldc_w -2009016760
    //   6815: ixor
    //   6816: ldc2_w -1653350840
    //   6819: l2i
    //   6820: ldc_w -477455071
    //   6823: ixor
    //   6824: ixor
    //   6825: lookupswitch default -> 13016, -1928208532 -> 6852, 449841751 -> 6808
    //   6852: getfield field_70161_v : D
    //   6855: getstatic Perryc.0 : I
    //   6858: ifle -> 6872
    //   6861: ldc2_w -1851124543
    //   6864: l2i
    //   6865: ldc_w 557386310
    //   6868: ixor
    //   6869: goto -> 6880
    //   6872: ldc2_w -249559129
    //   6875: l2i
    //   6876: ldc_w -1792845523
    //   6879: ixor
    //   6880: ldc2_w -1958231408
    //   6883: l2i
    //   6884: ldc_w 487698415
    //   6887: ixor
    //   6888: ixor
    //   6889: lookupswitch default -> 13062, -229297163 -> 6916, 650474488 -> 6872
    //   6916: goto -> 6920
    //   6919: athrow
    //   6920: invokespecial <init> : (DDD)V
    //   6923: goto -> 6927
    //   6926: athrow
    //   6927: getstatic Perryc.0 : I
    //   6930: ifle -> 6944
    //   6933: ldc2_w 538908901
    //   6936: l2i
    //   6937: ldc_w 96535059
    //   6940: ixor
    //   6941: goto -> 6952
    //   6944: ldc2_w 650715909
    //   6947: l2i
    //   6948: ldc_w -2459259
    //   6951: ixor
    //   6952: ldc2_w -561684566
    //   6955: l2i
    //   6956: ldc_w 1677435537
    //   6959: ixor
    //   6960: ixor
    //   6961: lookupswitch default -> 13018, -1734285363 -> 6944, 1684907963 -> 6988
    //   6988: goto -> 6992
    //   6991: athrow
    //   6992: invokevirtual add : (Ljava/lang/Object;)Z
    //   6995: goto -> 6999
    //   6998: athrow
    //   6999: pop
    //   7000: getstatic Perryc.c : I
    //   7003: iflt -> 7017
    //   7006: ldc2_w 808851267
    //   7009: l2i
    //   7010: ldc_w -497985694
    //   7013: ixor
    //   7014: goto -> 7025
    //   7017: ldc2_w -830115524
    //   7020: l2i
    //   7021: ldc_w 1784511225
    //   7024: ixor
    //   7025: ldc2_w 1266705188
    //   7028: l2i
    //   7029: ldc_w 833571650
    //   7032: ixor
    //   7033: ixor
    //   7034: lookupswitch default -> 12848, -1471649721 -> 7017, -554228829 -> 7060
    //   7060: aload_1
    //   7061: new net/minecraft/util/math/BlockPos
    //   7064: dup
    //   7065: getstatic Perryc.c : I
    //   7068: iflt -> 7082
    //   7071: ldc2_w 1872393419
    //   7074: l2i
    //   7075: ldc_w 1876628496
    //   7078: ixor
    //   7079: goto -> 7090
    //   7082: ldc2_w -1468334105
    //   7085: l2i
    //   7086: ldc_w -1540682974
    //   7089: ixor
    //   7090: ldc2_w 426468005
    //   7093: l2i
    //   7094: ldc_w 1324946029
    //   7097: ixor
    //   7098: ixor
    //   7099: lookupswitch default -> 13036, 1473450003 -> 7082, 1539539981 -> 7124
    //   7124: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   7127: getstatic Perryc.c : I
    //   7130: iflt -> 7144
    //   7133: ldc2_w 457871145
    //   7136: l2i
    //   7137: ldc_w -1997332134
    //   7140: ixor
    //   7141: goto -> 7152
    //   7144: ldc2_w -2100927683
    //   7147: l2i
    //   7148: ldc_w 217932786
    //   7151: ixor
    //   7152: ldc2_w 1509852767
    //   7155: l2i
    //   7156: ldc_w 243481292
    //   7159: ixor
    //   7160: ixor
    //   7161: lookupswitch default -> 13024, -993783072 -> 7144, -649675684 -> 7188
    //   7188: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7191: getstatic Perryc.c : I
    //   7194: iflt -> 7208
    //   7197: ldc2_w 177773994
    //   7200: l2i
    //   7201: ldc_w -318349993
    //   7204: ixor
    //   7205: goto -> 7216
    //   7208: ldc2_w -931337386
    //   7211: l2i
    //   7212: ldc_w -1832677171
    //   7215: ixor
    //   7216: ldc2_w -87332538
    //   7219: l2i
    //   7220: ldc_w -620168340
    //   7223: ixor
    //   7224: ixor
    //   7225: lookupswitch default -> 13102, -966962473 -> 7208, 2071783857 -> 7252
    //   7252: getfield field_70165_t : D
    //   7255: getstatic Perryc.1 : I
    //   7258: ifeq -> 7272
    //   7261: ldc2_w 1824526939
    //   7264: l2i
    //   7265: ldc_w -722175523
    //   7268: ixor
    //   7269: goto -> 7280
    //   7272: ldc2_w 1279532389
    //   7275: l2i
    //   7276: ldc_w -683981028
    //   7279: ixor
    //   7280: ldc2_w -1242743388
    //   7283: l2i
    //   7284: ldc_w -926618349
    //   7287: ixor
    //   7288: ixor
    //   7289: lookupswitch default -> 12908, -987907279 -> 7272, -430535986 -> 7316
    //   7316: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   7319: getstatic Perryc.1 : I
    //   7322: ifeq -> 7336
    //   7325: ldc2_w -1892530909
    //   7328: l2i
    //   7329: ldc_w 203280437
    //   7332: ixor
    //   7333: goto -> 7344
    //   7336: ldc2_w 1497261045
    //   7339: l2i
    //   7340: ldc_w -93857096
    //   7343: ixor
    //   7344: ldc2_w 901892361
    //   7347: l2i
    //   7348: ldc_w -1998475908
    //   7351: ixor
    //   7352: ixor
    //   7353: lookupswitch default -> 12956, 511302968 -> 7380, 1041232227 -> 7336
    //   7380: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7383: getstatic Perryc.c : I
    //   7386: iflt -> 7400
    //   7389: ldc2_w -1035410345
    //   7392: l2i
    //   7393: ldc_w 923622268
    //   7396: ixor
    //   7397: goto -> 7408
    //   7400: ldc2_w 1618522885
    //   7403: l2i
    //   7404: ldc_w -2142967632
    //   7407: ixor
    //   7408: ldc2_w -867140679
    //   7411: l2i
    //   7412: ldc_w -1129673217
    //   7415: ixor
    //   7416: ixor
    //   7417: lookupswitch default -> 7444, -2051061395 -> 12816, 1349400642 -> 7400
    //   7444: getfield field_70163_u : D
    //   7447: ldc2_w 0.9381775048796838
    //   7450: invokestatic doubleToLongBits : (D)J
    //   7453: ldc2_w 9218311589695431371
    //   7456: lxor
    //   7457: invokestatic longBitsToDouble : (J)D
    //   7460: dadd
    //   7461: getstatic Perryc.1 : I
    //   7464: ifeq -> 7478
    //   7467: ldc2_w 845760763
    //   7470: l2i
    //   7471: ldc_w 671649077
    //   7474: ixor
    //   7475: goto -> 7486
    //   7478: ldc2_w 968155522
    //   7481: l2i
    //   7482: ldc_w 1451870571
    //   7485: ixor
    //   7486: ldc2_w 2048330035
    //   7489: l2i
    //   7490: ldc_w -327131060
    //   7493: ixor
    //   7494: ixor
    //   7495: lookupswitch default -> 7520, -1929990991 -> 13058, 1364411661 -> 7478
    //   7520: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   7523: getstatic Perryc.c : I
    //   7526: iflt -> 7540
    //   7529: ldc2_w 1140289128
    //   7532: l2i
    //   7533: ldc_w 958982667
    //   7536: ixor
    //   7537: goto -> 7548
    //   7540: ldc2_w 299590266
    //   7543: l2i
    //   7544: ldc_w 183653658
    //   7547: ixor
    //   7548: ldc2_w 1743717148
    //   7551: l2i
    //   7552: ldc_w 1545981188
    //   7555: ixor
    //   7556: ixor
    //   7557: lookupswitch default -> 7584, -546969554 -> 7540, 1091914363 -> 12966
    //   7584: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7587: getstatic Perryc.0 : I
    //   7590: ifle -> 7604
    //   7593: ldc2_w 1967611258
    //   7596: l2i
    //   7597: ldc_w -902773169
    //   7600: ixor
    //   7601: goto -> 7612
    //   7604: ldc2_w 2114385075
    //   7607: l2i
    //   7608: ldc_w 1939898700
    //   7611: ixor
    //   7612: ldc2_w 2014307266
    //   7615: l2i
    //   7616: ldc_w -1099380108
    //   7619: ixor
    //   7620: ixor
    //   7621: lookupswitch default -> 12838, -875471799 -> 7648, 2030088835 -> 7604
    //   7648: getfield field_70161_v : D
    //   7651: ldc2_w 12.468271652704741
    //   7654: invokestatic doubleToLongBits : (D)J
    //   7657: ldc2_w 9212376651291428223
    //   7660: lxor
    //   7661: invokestatic longBitsToDouble : (J)D
    //   7664: dadd
    //   7665: getstatic Perryc.0 : I
    //   7668: ifle -> 7682
    //   7671: ldc2_w -1515384724
    //   7674: l2i
    //   7675: ldc_w 661842569
    //   7678: ixor
    //   7679: goto -> 7690
    //   7682: ldc2_w -1393517597
    //   7685: l2i
    //   7686: ldc_w 532848673
    //   7689: ixor
    //   7690: ldc2_w -769733980
    //   7693: l2i
    //   7694: ldc_w 1769390231
    //   7697: ixor
    //   7698: ixor
    //   7699: lookupswitch default -> 7724, 968356054 -> 13094, 1514226020 -> 7682
    //   7724: goto -> 7728
    //   7727: athrow
    //   7728: invokespecial <init> : (DDD)V
    //   7731: goto -> 7735
    //   7734: athrow
    //   7735: getstatic Perryc.c : I
    //   7738: iflt -> 7752
    //   7741: ldc2_w -1015233785
    //   7744: l2i
    //   7745: ldc_w 891841144
    //   7748: ixor
    //   7749: goto -> 7760
    //   7752: ldc2_w 222678544
    //   7755: l2i
    //   7756: ldc_w -6298172
    //   7759: ixor
    //   7760: ldc2_w 353115991
    //   7763: l2i
    //   7764: ldc_w -1924329730
    //   7767: ixor
    //   7768: ixor
    //   7769: lookupswitch default -> 7796, 676647531 -> 7752, 1846917334 -> 12950
    //   7796: goto -> 7800
    //   7799: athrow
    //   7800: invokevirtual add : (Ljava/lang/Object;)Z
    //   7803: goto -> 7807
    //   7806: athrow
    //   7807: pop
    //   7808: getstatic Perryc.1 : I
    //   7811: ifeq -> 7825
    //   7814: ldc2_w 171908384
    //   7817: l2i
    //   7818: ldc_w 876919398
    //   7821: ixor
    //   7822: goto -> 7833
    //   7825: ldc2_w -1506124550
    //   7828: l2i
    //   7829: ldc_w 1330374999
    //   7832: ixor
    //   7833: ldc2_w 1220267086
    //   7836: l2i
    //   7837: ldc_w -1575252241
    //   7840: ixor
    //   7841: ixor
    //   7842: lookupswitch default -> 7868, -1094866051 -> 7825, -723786265 -> 13096
    //   7868: aload_1
    //   7869: new net/minecraft/util/math/BlockPos
    //   7872: dup
    //   7873: getstatic Perryc.c : I
    //   7876: iflt -> 7890
    //   7879: ldc2_w 1704880785
    //   7882: l2i
    //   7883: ldc_w -1212569182
    //   7886: ixor
    //   7887: goto -> 7898
    //   7890: ldc2_w -1336988472
    //   7893: l2i
    //   7894: ldc_w -485632256
    //   7897: ixor
    //   7898: ldc2_w 487577003
    //   7901: l2i
    //   7902: ldc_w -1460418572
    //   7905: ixor
    //   7906: ixor
    //   7907: lookupswitch default -> 7932, 1742459244 -> 12936, 2070322661 -> 7890
    //   7932: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   7935: getstatic Perryc.c : I
    //   7938: iflt -> 7952
    //   7941: ldc2_w 1656956720
    //   7944: l2i
    //   7945: ldc_w -1004311847
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w -1785596371
    //   7955: l2i
    //   7956: ldc_w -843535005
    //   7959: ixor
    //   7960: ldc2_w 673320827
    //   7963: l2i
    //   7964: ldc_w -406077355
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 12866, -1748986784 -> 7996, 1762230983 -> 7952
    //   7996: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7999: getstatic Perryc.0 : I
    //   8002: ifle -> 8016
    //   8005: ldc2_w -1745399065
    //   8008: l2i
    //   8009: ldc_w -443605325
    //   8012: ixor
    //   8013: goto -> 8024
    //   8016: ldc2_w 1498906448
    //   8019: l2i
    //   8020: ldc_w -297857309
    //   8023: ixor
    //   8024: ldc2_w 1948754247
    //   8027: l2i
    //   8028: ldc_w -1970823677
    //   8031: ixor
    //   8032: ixor
    //   8033: lookupswitch default -> 13072, -1931971824 -> 8016, 1237864183 -> 8060
    //   8060: getfield field_70165_t : D
    //   8063: getstatic Perryc.1 : I
    //   8066: ifeq -> 8080
    //   8069: ldc2_w -19914282
    //   8072: l2i
    //   8073: ldc_w -533517880
    //   8076: ixor
    //   8077: goto -> 8088
    //   8080: ldc2_w -2117936959
    //   8083: l2i
    //   8084: ldc_w -1719965702
    //   8087: ixor
    //   8088: ldc2_w 1950057228
    //   8091: l2i
    //   8092: ldc_w -1823868066
    //   8095: ixor
    //   8096: ixor
    //   8097: lookupswitch default -> 12852, -107909044 -> 8080, -3422359 -> 8124
    //   8124: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   8127: getstatic Perryc.c : I
    //   8130: iflt -> 8144
    //   8133: ldc2_w 714051118
    //   8136: l2i
    //   8137: ldc_w -1105044761
    //   8140: ixor
    //   8141: goto -> 8152
    //   8144: ldc2_w -1220901096
    //   8147: l2i
    //   8148: ldc_w 2026479353
    //   8151: ixor
    //   8152: ldc2_w 742584709
    //   8155: l2i
    //   8156: ldc_w 1297162224
    //   8159: ixor
    //   8160: ixor
    //   8161: lookupswitch default -> 8188, -172082500 -> 13014, 1014178444 -> 8144
    //   8188: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8191: getstatic Perryc.c : I
    //   8194: iflt -> 8208
    //   8197: ldc2_w 62919902
    //   8200: l2i
    //   8201: ldc_w 555935073
    //   8204: ixor
    //   8205: goto -> 8216
    //   8208: ldc2_w -1979966160
    //   8211: l2i
    //   8212: ldc_w -924509926
    //   8215: ixor
    //   8216: ldc2_w 1708616013
    //   8219: l2i
    //   8220: ldc_w 1800312743
    //   8223: ixor
    //   8224: ixor
    //   8225: lookupswitch default -> 12978, 746262357 -> 8208, 1333852864 -> 8252
    //   8252: getfield field_70163_u : D
    //   8255: ldc2_w 0.5105552368677004
    //   8258: invokestatic doubleToLongBits : (D)J
    //   8261: ldc2_w 9214459910721683182
    //   8264: lxor
    //   8265: invokestatic longBitsToDouble : (J)D
    //   8268: dadd
    //   8269: getstatic Perryc.c : I
    //   8272: iflt -> 8286
    //   8275: ldc2_w 566811974
    //   8278: l2i
    //   8279: ldc_w -465060530
    //   8282: ixor
    //   8283: goto -> 8294
    //   8286: ldc2_w 2111412096
    //   8289: l2i
    //   8290: ldc_w -1194269215
    //   8293: ixor
    //   8294: ldc2_w 1508759355
    //   8297: l2i
    //   8298: ldc_w 1107390596
    //   8301: ixor
    //   8302: ixor
    //   8303: lookupswitch default -> 12836, -563886153 -> 8286, -555362850 -> 8328
    //   8328: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   8331: getstatic Perryc.0 : I
    //   8334: ifle -> 8348
    //   8337: ldc2_w -179892947
    //   8340: l2i
    //   8341: ldc_w 78456830
    //   8344: ixor
    //   8345: goto -> 8356
    //   8348: ldc2_w 896410715
    //   8351: l2i
    //   8352: ldc_w 2106417517
    //   8355: ixor
    //   8356: ldc2_w 1395157321
    //   8359: l2i
    //   8360: ldc_w -1286953851
    //   8363: ixor
    //   8364: ixor
    //   8365: lookupswitch default -> 8392, -1645308631 -> 8348, 294184735 -> 12876
    //   8392: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8395: getstatic Perryc.1 : I
    //   8398: ifeq -> 8412
    //   8401: ldc2_w 713530030
    //   8404: l2i
    //   8405: ldc_w -1609713743
    //   8408: ixor
    //   8409: goto -> 8420
    //   8412: ldc2_w -2030607205
    //   8415: l2i
    //   8416: ldc_w 968499149
    //   8419: ixor
    //   8420: ldc2_w -66579869
    //   8423: l2i
    //   8424: ldc_w 1144854987
    //   8427: ixor
    //   8428: ixor
    //   8429: lookupswitch default -> 13104, 125333758 -> 8456, 851388087 -> 8412
    //   8456: getfield field_70161_v : D
    //   8459: ldc2_w -8.981013408917198
    //   8462: invokestatic doubleToLongBits : (D)J
    //   8465: ldc2_w 9210413499425519939
    //   8468: lxor
    //   8469: invokestatic longBitsToDouble : (J)D
    //   8472: dadd
    //   8473: getstatic Perryc.1 : I
    //   8476: ifeq -> 8490
    //   8479: ldc2_w 83181318
    //   8482: l2i
    //   8483: ldc_w 1620439701
    //   8486: ixor
    //   8487: goto -> 8498
    //   8490: ldc2_w 769065559
    //   8493: l2i
    //   8494: ldc_w -1350857987
    //   8497: ixor
    //   8498: ldc2_w 1704191500
    //   8501: l2i
    //   8502: ldc_w -1774696873
    //   8505: ixor
    //   8506: ixor
    //   8507: lookupswitch default -> 13128, -1748275768 -> 8490, 1896294641 -> 8532
    //   8532: goto -> 8536
    //   8535: athrow
    //   8536: invokespecial <init> : (DDD)V
    //   8539: goto -> 8543
    //   8542: athrow
    //   8543: getstatic Perryc.1 : I
    //   8546: ifeq -> 8560
    //   8549: ldc2_w -82840434
    //   8552: l2i
    //   8553: ldc_w 371350175
    //   8556: ixor
    //   8557: goto -> 8568
    //   8560: ldc2_w -1536308295
    //   8563: l2i
    //   8564: ldc_w 912176598
    //   8567: ixor
    //   8568: ldc2_w 1425177652
    //   8571: l2i
    //   8572: ldc_w 1155752828
    //   8575: ixor
    //   8576: ixor
    //   8577: lookupswitch default -> 12810, -2111676121 -> 8604, -46354087 -> 8560
    //   8604: goto -> 8608
    //   8607: athrow
    //   8608: invokevirtual add : (Ljava/lang/Object;)Z
    //   8611: goto -> 8615
    //   8614: athrow
    //   8615: pop
    //   8616: getstatic Perryc.0 : I
    //   8619: ifle -> 8633
    //   8622: ldc2_w 426235664
    //   8625: l2i
    //   8626: ldc_w 1785430978
    //   8629: ixor
    //   8630: goto -> 8641
    //   8633: ldc2_w -1607912680
    //   8636: l2i
    //   8637: ldc_w 1612389006
    //   8640: ixor
    //   8641: ldc2_w -229184190
    //   8644: l2i
    //   8645: ldc_w 1376670846
    //   8648: ixor
    //   8649: ixor
    //   8650: lookupswitch default -> 8676, -749408786 -> 13070, 2044138185 -> 8633
    //   8676: aload_0
    //   8677: getstatic Perryc.1 : I
    //   8680: ifeq -> 8694
    //   8683: ldc2_w -193252142
    //   8686: l2i
    //   8687: ldc_w -1741223381
    //   8690: ixor
    //   8691: goto -> 8702
    //   8694: ldc2_w 2046292684
    //   8697: l2i
    //   8698: ldc_w 2083432005
    //   8701: ixor
    //   8702: ldc2_w 487849621
    //   8705: l2i
    //   8706: ldc_w -166519525
    //   8709: ixor
    //   8710: ixor
    //   8711: lookupswitch default -> 13042, -2025005705 -> 8694, -287721721 -> 8736
    //   8736: getfield extraExtra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8739: getstatic Perryc.1 : I
    //   8742: ifeq -> 8756
    //   8745: ldc2_w 298092067
    //   8748: l2i
    //   8749: ldc_w 772664516
    //   8752: ixor
    //   8753: goto -> 8764
    //   8756: ldc2_w -342344370
    //   8759: l2i
    //   8760: ldc_w -2097549589
    //   8763: ixor
    //   8764: ldc2_w 248710579
    //   8767: l2i
    //   8768: ldc_w 2051418245
    //   8771: ixor
    //   8772: ixor
    //   8773: lookupswitch default -> 13044, 502595219 -> 8800, 1264338897 -> 8756
    //   8800: goto -> 8804
    //   8803: athrow
    //   8804: invokevirtual getValue : ()Ljava/lang/Object;
    //   8807: goto -> 8811
    //   8810: athrow
    //   8811: checkcast java/lang/Boolean
    //   8814: getstatic Perryc.1 : I
    //   8817: ifeq -> 8831
    //   8820: ldc2_w 154755729
    //   8823: l2i
    //   8824: ldc_w 1385747394
    //   8827: ixor
    //   8828: goto -> 8839
    //   8831: ldc2_w 151723167
    //   8834: l2i
    //   8835: ldc_w -2079913169
    //   8838: ixor
    //   8839: ldc2_w 368690955
    //   8842: l2i
    //   8843: ldc_w 1578320652
    //   8846: ixor
    //   8847: ixor
    //   8848: lookupswitch default -> 8876, -1071716141 -> 8831, 273364308 -> 12910
    //   8876: goto -> 8880
    //   8879: athrow
    //   8880: invokevirtual booleanValue : ()Z
    //   8883: goto -> 8887
    //   8886: athrow
    //   8887: ifeq -> 8901
    //   8890: ldc2_w 735006851
    //   8893: l2i
    //   8894: ldc_w 1146529270
    //   8897: ixor
    //   8898: goto -> 8909
    //   8901: ldc2_w -22276385
    //   8904: l2i
    //   8905: ldc_w -1858739287
    //   8908: ixor
    //   8909: ldc2_w -948342062
    //   8912: l2i
    //   8913: ldc_w -593625150
    //   8916: ixor
    //   8917: ixor
    //   8918: tableswitch default -> 8890, 1954379877 -> 8940, 1954379878 -> 12496
    //   8940: getstatic Perryc.0 : I
    //   8943: ifle -> 8957
    //   8946: ldc2_w 1157610185
    //   8949: l2i
    //   8950: ldc_w 1677097860
    //   8953: ixor
    //   8954: goto -> 8965
    //   8957: ldc2_w 92739578
    //   8960: l2i
    //   8961: ldc_w -1649339721
    //   8964: ixor
    //   8965: ldc2_w 1255471847
    //   8968: l2i
    //   8969: ldc_w -564142710
    //   8972: ixor
    //   8973: ixor
    //   8974: lookupswitch default -> 9000, -1283267040 -> 13130, 229455964 -> 8957
    //   9000: aload_0
    //   9001: getstatic Perryc.1 : I
    //   9004: ifeq -> 9018
    //   9007: ldc2_w 1589560400
    //   9010: l2i
    //   9011: ldc_w -266019042
    //   9014: ixor
    //   9015: goto -> 9026
    //   9018: ldc2_w -1795661476
    //   9021: l2i
    //   9022: ldc_w -773457401
    //   9025: ixor
    //   9026: ldc2_w -897021842
    //   9029: l2i
    //   9030: ldc_w -1446538560
    //   9033: ixor
    //   9034: ixor
    //   9035: lookupswitch default -> 12928, -841678368 -> 9018, 642941429 -> 9060
    //   9060: getfield extra : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9063: getstatic Perryc.c : I
    //   9066: iflt -> 9080
    //   9069: ldc2_w 1407080081
    //   9072: l2i
    //   9073: ldc_w -2058983038
    //   9076: ixor
    //   9077: goto -> 9088
    //   9080: ldc2_w 261550173
    //   9083: l2i
    //   9084: ldc_w -1074029151
    //   9087: ixor
    //   9088: ldc2_w 90387327
    //   9091: l2i
    //   9092: ldc_w -1355684961
    //   9095: ixor
    //   9096: ixor
    //   9097: lookupswitch default -> 9124, 176316854 -> 9080, 2093674483 -> 12976
    //   9124: goto -> 9128
    //   9127: athrow
    //   9128: invokevirtual getValue : ()Ljava/lang/Object;
    //   9131: goto -> 9135
    //   9134: athrow
    //   9135: checkcast java/lang/Boolean
    //   9138: getstatic Perryc.0 : I
    //   9141: ifle -> 9155
    //   9144: ldc2_w 941479201
    //   9147: l2i
    //   9148: ldc_w 830652980
    //   9151: ixor
    //   9152: goto -> 9163
    //   9155: ldc2_w -1840165069
    //   9158: l2i
    //   9159: ldc_w 2091814285
    //   9162: ixor
    //   9163: ldc2_w -2011156329
    //   9166: l2i
    //   9167: ldc_w -983333679
    //   9170: ixor
    //   9171: ixor
    //   9172: lookupswitch default -> 13084, -1547929864 -> 9200, 1155310419 -> 9155
    //   9200: goto -> 9204
    //   9203: athrow
    //   9204: invokevirtual booleanValue : ()Z
    //   9207: goto -> 9211
    //   9210: athrow
    //   9211: ifeq -> 9225
    //   9214: ldc2_w 879920419
    //   9217: l2i
    //   9218: ldc_w -1634414768
    //   9221: ixor
    //   9222: goto -> 9233
    //   9225: ldc2_w -2028224126
    //   9228: l2i
    //   9229: ldc_w 771591152
    //   9232: ixor
    //   9233: ldc2_w -1266040245
    //   9236: l2i
    //   9237: ldc_w 744852558
    //   9240: ixor
    //   9241: ixor
    //   9242: tableswitch default -> 9214, 839517302 -> 9264, 839517303 -> 12496
    //   9264: getstatic Perryc.1 : I
    //   9267: ifeq -> 9281
    //   9270: ldc2_w -1838005539
    //   9273: l2i
    //   9274: ldc_w -813142098
    //   9277: ixor
    //   9278: goto -> 9289
    //   9281: ldc2_w 1986983614
    //   9284: l2i
    //   9285: ldc_w -519152029
    //   9288: ixor
    //   9289: ldc2_w -1058235731
    //   9292: l2i
    //   9293: ldc_w -403296028
    //   9296: ixor
    //   9297: ixor
    //   9298: lookupswitch default -> 9324, -984395724 -> 9281, 2061535034 -> 12790
    //   9324: aload_1
    //   9325: new net/minecraft/util/math/BlockPos
    //   9328: dup
    //   9329: getstatic Perryc.c : I
    //   9332: iflt -> 9346
    //   9335: ldc2_w -2124726045
    //   9338: l2i
    //   9339: ldc_w 1332684807
    //   9342: ixor
    //   9343: goto -> 9354
    //   9346: ldc2_w -1693902857
    //   9349: l2i
    //   9350: ldc_w 422790695
    //   9353: ixor
    //   9354: ldc2_w -1797751016
    //   9357: l2i
    //   9358: ldc_w 685134220
    //   9361: ixor
    //   9362: ixor
    //   9363: lookupswitch default -> 9388, 82867328 -> 9346, 1916421744 -> 13132
    //   9388: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   9391: getstatic Perryc.0 : I
    //   9394: ifle -> 9408
    //   9397: ldc2_w 1428626329
    //   9400: l2i
    //   9401: ldc_w -1342122027
    //   9404: ixor
    //   9405: goto -> 9416
    //   9408: ldc2_w -680978861
    //   9411: l2i
    //   9412: ldc_w -446294069
    //   9415: ixor
    //   9416: ldc2_w 93417436
    //   9419: l2i
    //   9420: ldc_w 1211301655
    //   9423: ixor
    //   9424: ixor
    //   9425: lookupswitch default -> 9452, -1985775983 -> 9408, -1467720569 -> 12872
    //   9452: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9455: getstatic Perryc.0 : I
    //   9458: ifle -> 9472
    //   9461: ldc2_w 1391443725
    //   9464: l2i
    //   9465: ldc_w -1441851327
    //   9468: ixor
    //   9469: goto -> 9480
    //   9472: ldc2_w 69504464
    //   9475: l2i
    //   9476: ldc_w 18785239
    //   9479: ixor
    //   9480: ldc2_w -1256101395
    //   9483: l2i
    //   9484: ldc_w -1066336080
    //   9487: ixor
    //   9488: ixor
    //   9489: lookupswitch default -> 9516, -1917792751 -> 12990, -250302946 -> 9472
    //   9516: getfield field_70165_t : D
    //   9519: ldc2_w 0.0422265237729924
    //   9522: invokestatic doubleToLongBits : (D)J
    //   9525: ldc2_w 9197932322878516735
    //   9528: lxor
    //   9529: invokestatic longBitsToDouble : (J)D
    //   9532: dadd
    //   9533: getstatic Perryc.0 : I
    //   9536: ifle -> 9550
    //   9539: ldc2_w 1252374122
    //   9542: l2i
    //   9543: ldc_w -803699530
    //   9546: ixor
    //   9547: goto -> 9558
    //   9550: ldc2_w -1518443131
    //   9553: l2i
    //   9554: ldc_w -192891819
    //   9557: ixor
    //   9558: ldc2_w 730944141
    //   9561: l2i
    //   9562: ldc_w -802495797
    //   9565: ixor
    //   9566: ixor
    //   9567: lookupswitch default -> 12912, -1438293610 -> 9592, 1627816602 -> 9550
    //   9592: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   9595: getstatic Perryc.0 : I
    //   9598: ifle -> 9612
    //   9601: ldc2_w -1757433386
    //   9604: l2i
    //   9605: ldc_w -560180077
    //   9608: ixor
    //   9609: goto -> 9620
    //   9612: ldc2_w 1050474325
    //   9615: l2i
    //   9616: ldc_w 886188118
    //   9619: ixor
    //   9620: ldc2_w 2110759973
    //   9623: l2i
    //   9624: ldc_w -568620381
    //   9627: ixor
    //   9628: ixor
    //   9629: lookupswitch default -> 9656, -361247805 -> 12804, 1896288886 -> 9612
    //   9656: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9659: getstatic Perryc.0 : I
    //   9662: ifle -> 9676
    //   9665: ldc2_w -100621929
    //   9668: l2i
    //   9669: ldc_w 80179557
    //   9672: ixor
    //   9673: goto -> 9684
    //   9676: ldc2_w 29897313
    //   9679: l2i
    //   9680: ldc_w -422968566
    //   9683: ixor
    //   9684: ldc2_w 487916832
    //   9687: l2i
    //   9688: ldc_w 257102522
    //   9691: ixor
    //   9692: ixor
    //   9693: lookupswitch default -> 9720, -891481185 -> 9676, -327039128 -> 13120
    //   9720: getfield field_70163_u : D
    //   9723: ldc2_w 10.946546921167643
    //   9726: invokestatic doubleToLongBits : (D)J
    //   9729: ldc2_w 9211519996424689355
    //   9732: lxor
    //   9733: invokestatic longBitsToDouble : (J)D
    //   9736: dadd
    //   9737: getstatic Perryc.0 : I
    //   9740: ifle -> 9754
    //   9743: ldc2_w 1813039628
    //   9746: l2i
    //   9747: ldc_w -2113967364
    //   9750: ixor
    //   9751: goto -> 9762
    //   9754: ldc2_w -678566564
    //   9757: l2i
    //   9758: ldc_w -180038847
    //   9761: ixor
    //   9762: ldc2_w 1322727574
    //   9765: l2i
    //   9766: ldc_w 1779727923
    //   9769: ixor
    //   9770: ixor
    //   9771: lookupswitch default -> 9796, -1771194445 -> 9754, -919804331 -> 12968
    //   9796: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   9799: getstatic Perryc.c : I
    //   9802: iflt -> 9816
    //   9805: ldc2_w -723105987
    //   9808: l2i
    //   9809: ldc_w 555486267
    //   9812: ixor
    //   9813: goto -> 9824
    //   9816: ldc2_w -710680631
    //   9819: l2i
    //   9820: ldc_w 1561943328
    //   9823: ixor
    //   9824: ldc2_w -296592289
    //   9827: l2i
    //   9828: ldc_w -2103908934
    //   9831: ixor
    //   9832: ixor
    //   9833: lookupswitch default -> 9860, -1724845341 -> 13040, 618931076 -> 9816
    //   9860: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9863: getstatic Perryc.1 : I
    //   9866: ifeq -> 9880
    //   9869: ldc2_w 651892362
    //   9872: l2i
    //   9873: ldc_w 898155426
    //   9876: ixor
    //   9877: goto -> 9888
    //   9880: ldc2_w 1450065734
    //   9883: l2i
    //   9884: ldc_w -15348497
    //   9887: ixor
    //   9888: ldc2_w 977678149
    //   9891: l2i
    //   9892: ldc_w 1370921090
    //   9895: ixor
    //   9896: ixor
    //   9897: lookupswitch default -> 9924, -1537028873 -> 9880, 2023973615 -> 12870
    //   9924: getfield field_70161_v : D
    //   9927: getstatic Perryc.c : I
    //   9930: iflt -> 9944
    //   9933: ldc2_w -1591723919
    //   9936: l2i
    //   9937: ldc_w -933395100
    //   9940: ixor
    //   9941: goto -> 9952
    //   9944: ldc2_w -459032109
    //   9947: l2i
    //   9948: ldc_w 1584572061
    //   9951: ixor
    //   9952: ldc2_w -261197672
    //   9955: l2i
    //   9956: ldc_w 705509320
    //   9959: ixor
    //   9960: ixor
    //   9961: lookupswitch default -> 12828, -1289815483 -> 9944, 1622300702 -> 9988
    //   9988: goto -> 9992
    //   9991: athrow
    //   9992: invokespecial <init> : (DDD)V
    //   9995: goto -> 9999
    //   9998: athrow
    //   9999: getstatic Perryc.0 : I
    //   10002: ifle -> 10016
    //   10005: ldc2_w -794657206
    //   10008: l2i
    //   10009: ldc_w -767116197
    //   10012: ixor
    //   10013: goto -> 10024
    //   10016: ldc2_w -1197125919
    //   10019: l2i
    //   10020: ldc_w -523184337
    //   10023: ixor
    //   10024: ldc2_w -610489247
    //   10027: l2i
    //   10028: ldc_w 1409230129
    //   10031: ixor
    //   10032: ixor
    //   10033: lookupswitch default -> 10060, -1970844863 -> 12938, -836097200 -> 10016
    //   10060: goto -> 10064
    //   10063: athrow
    //   10064: invokevirtual add : (Ljava/lang/Object;)Z
    //   10067: goto -> 10071
    //   10070: athrow
    //   10071: pop
    //   10072: getstatic Perryc.0 : I
    //   10075: ifle -> 10089
    //   10078: ldc2_w -538723583
    //   10081: l2i
    //   10082: ldc_w 2093966891
    //   10085: ixor
    //   10086: goto -> 10097
    //   10089: ldc2_w -674765649
    //   10092: l2i
    //   10093: ldc_w -175061232
    //   10096: ixor
    //   10097: ldc2_w 132882576
    //   10100: l2i
    //   10101: ldc_w 198784300
    //   10104: ixor
    //   10105: ixor
    //   10106: lookupswitch default -> 12974, -1356969834 -> 10089, 778417667 -> 10132
    //   10132: aload_1
    //   10133: new net/minecraft/util/math/BlockPos
    //   10136: dup
    //   10137: getstatic Perryc.c : I
    //   10140: iflt -> 10154
    //   10143: ldc2_w -1118756338
    //   10146: l2i
    //   10147: ldc_w -641209364
    //   10150: ixor
    //   10151: goto -> 10162
    //   10154: ldc2_w -988437811
    //   10157: l2i
    //   10158: ldc_w 1349497092
    //   10161: ixor
    //   10162: ldc2_w 201777319
    //   10165: l2i
    //   10166: ldc_w 1966260523
    //   10169: ixor
    //   10170: ixor
    //   10171: lookupswitch default -> 12996, -330419643 -> 10196, 497215598 -> 10154
    //   10196: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   10199: getstatic Perryc.c : I
    //   10202: iflt -> 10216
    //   10205: ldc2_w -1006979186
    //   10208: l2i
    //   10209: ldc_w 1032936026
    //   10212: ixor
    //   10213: goto -> 10224
    //   10216: ldc2_w -174324726
    //   10219: l2i
    //   10220: ldc_w 101147495
    //   10223: ixor
    //   10224: ldc2_w 922683784
    //   10227: l2i
    //   10228: ldc_w 1654745694
    //   10231: ixor
    //   10232: ixor
    //   10233: lookupswitch default -> 10260, -1846605897 -> 10216, -1439330814 -> 12858
    //   10260: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10263: getstatic Perryc.0 : I
    //   10266: ifle -> 10280
    //   10269: ldc2_w 1102013483
    //   10272: l2i
    //   10273: ldc_w 743720044
    //   10276: ixor
    //   10277: goto -> 10288
    //   10280: ldc2_w -858086221
    //   10283: l2i
    //   10284: ldc_w -433862068
    //   10287: ixor
    //   10288: ldc2_w 247453078
    //   10291: l2i
    //   10292: ldc_w 383887094
    //   10295: ixor
    //   10296: ixor
    //   10297: lookupswitch default -> 10324, 930464666 -> 10280, 1973768999 -> 12892
    //   10324: getfield field_70165_t : D
    //   10327: ldc2_w -0.09912128812803166
    //   10330: invokestatic doubleToLongBits : (D)J
    //   10333: ldc2_w 9203492880630999023
    //   10336: lxor
    //   10337: invokestatic longBitsToDouble : (J)D
    //   10340: dadd
    //   10341: getstatic Perryc.1 : I
    //   10344: ifeq -> 10358
    //   10347: ldc2_w 1103409794
    //   10350: l2i
    //   10351: ldc_w -548265205
    //   10354: ixor
    //   10355: goto -> 10366
    //   10358: ldc2_w -1706968516
    //   10361: l2i
    //   10362: ldc_w -787391401
    //   10365: ixor
    //   10366: ldc2_w 1747174300
    //   10369: l2i
    //   10370: ldc_w -1536418224
    //   10373: ixor
    //   10374: ixor
    //   10375: lookupswitch default -> 13008, -2027996249 -> 10400, 1389972549 -> 10358
    //   10400: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   10403: getstatic Perryc.c : I
    //   10406: iflt -> 10420
    //   10409: ldc2_w -1199130919
    //   10412: l2i
    //   10413: ldc_w 772317634
    //   10416: ixor
    //   10417: goto -> 10428
    //   10420: ldc2_w -742480956
    //   10423: l2i
    //   10424: ldc_w -1982579249
    //   10427: ixor
    //   10428: ldc2_w -1924845856
    //   10431: l2i
    //   10432: ldc_w 1907907074
    //   10435: ixor
    //   10436: ixor
    //   10437: lookupswitch default -> 12984, -1499993367 -> 10464, 1785947129 -> 10420
    //   10464: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10467: getstatic Perryc.1 : I
    //   10470: ifeq -> 10484
    //   10473: ldc2_w -475982889
    //   10476: l2i
    //   10477: ldc_w -245741451
    //   10480: ixor
    //   10481: goto -> 10492
    //   10484: ldc2_w -1100711999
    //   10487: l2i
    //   10488: ldc_w -319364285
    //   10491: ixor
    //   10492: ldc2_w -1896416736
    //   10495: l2i
    //   10496: ldc_w -1128223227
    //   10499: ixor
    //   10500: ixor
    //   10501: lookupswitch default -> 12850, 550309767 -> 10484, 1621409959 -> 10528
    //   10528: getfield field_70163_u : D
    //   10531: ldc2_w 5.947254524320818
    //   10534: invokestatic doubleToLongBits : (D)J
    //   10537: ldc2_w 9216557251287566503
    //   10540: lxor
    //   10541: invokestatic longBitsToDouble : (J)D
    //   10544: dadd
    //   10545: getstatic Perryc.c : I
    //   10548: iflt -> 10562
    //   10551: ldc2_w -1187268471
    //   10554: l2i
    //   10555: ldc_w 1217736613
    //   10558: ixor
    //   10559: goto -> 10570
    //   10562: ldc2_w -676535486
    //   10565: l2i
    //   10566: ldc_w 1485164005
    //   10569: ixor
    //   10570: ldc2_w 1525575278
    //   10573: l2i
    //   10574: ldc_w -1911024888
    //   10577: ixor
    //   10578: ixor
    //   10579: lookupswitch default -> 13074, 626584138 -> 10562, 1541362625 -> 10604
    //   10604: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   10607: getstatic Perryc.c : I
    //   10610: iflt -> 10624
    //   10613: ldc2_w -1186522084
    //   10616: l2i
    //   10617: ldc_w 1390034545
    //   10620: ixor
    //   10621: goto -> 10632
    //   10624: ldc2_w -569397017
    //   10627: l2i
    //   10628: ldc_w -1715343936
    //   10631: ixor
    //   10632: ldc2_w -874688106
    //   10635: l2i
    //   10636: ldc_w -1525389209
    //   10639: ixor
    //   10640: ixor
    //   10641: lookupswitch default -> 10668, -2058085476 -> 13126, -1905423763 -> 10624
    //   10668: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10671: getstatic Perryc.0 : I
    //   10674: ifle -> 10688
    //   10677: ldc2_w 434743890
    //   10680: l2i
    //   10681: ldc_w 584681556
    //   10684: ixor
    //   10685: goto -> 10696
    //   10688: ldc2_w -1280441509
    //   10691: l2i
    //   10692: ldc_w -1903820830
    //   10695: ixor
    //   10696: ldc2_w 783547734
    //   10699: l2i
    //   10700: ldc_w 1474943755
    //   10703: ixor
    //   10704: ixor
    //   10705: lookupswitch default -> 10732, -1471914230 -> 10688, 1114244187 -> 12942
    //   10732: getfield field_70161_v : D
    //   10735: getstatic Perryc.1 : I
    //   10738: ifeq -> 10752
    //   10741: ldc2_w -1017554816
    //   10744: l2i
    //   10745: ldc_w -1680463902
    //   10748: ixor
    //   10749: goto -> 10760
    //   10752: ldc2_w 924172304
    //   10755: l2i
    //   10756: ldc_w -123849364
    //   10759: ixor
    //   10760: ldc2_w -1578597178
    //   10763: l2i
    //   10764: ldc_w -109744672
    //   10767: ixor
    //   10768: ixor
    //   10769: lookupswitch default -> 12792, -1760158630 -> 10796, 1218116 -> 10752
    //   10796: goto -> 10800
    //   10799: athrow
    //   10800: invokespecial <init> : (DDD)V
    //   10803: goto -> 10807
    //   10806: athrow
    //   10807: getstatic Perryc.0 : I
    //   10810: ifle -> 10824
    //   10813: ldc2_w 420784117
    //   10816: l2i
    //   10817: ldc_w 737283007
    //   10820: ixor
    //   10821: goto -> 10832
    //   10824: ldc2_w -261356486
    //   10827: l2i
    //   10828: ldc_w -925079480
    //   10831: ixor
    //   10832: ldc2_w 287021862
    //   10835: l2i
    //   10836: ldc_w -1821340633
    //   10839: ixor
    //   10840: ixor
    //   10841: lookupswitch default -> 10868, -1332888757 -> 12844, -742498686 -> 10824
    //   10868: goto -> 10872
    //   10871: athrow
    //   10872: invokevirtual add : (Ljava/lang/Object;)Z
    //   10875: goto -> 10879
    //   10878: athrow
    //   10879: pop
    //   10880: getstatic Perryc.1 : I
    //   10883: ifeq -> 10897
    //   10886: ldc2_w 646820952
    //   10889: l2i
    //   10890: ldc_w 1098912904
    //   10893: ixor
    //   10894: goto -> 10905
    //   10897: ldc2_w 1722607330
    //   10900: l2i
    //   10901: ldc_w 1176885150
    //   10904: ixor
    //   10905: ldc2_w -378999657
    //   10908: l2i
    //   10909: ldc_w -1692053880
    //   10912: ixor
    //   10913: ixor
    //   10914: lookupswitch default -> 10940, -2001232726 -> 10897, 356516559 -> 13000
    //   10940: aload_1
    //   10941: new net/minecraft/util/math/BlockPos
    //   10944: dup
    //   10945: getstatic Perryc.c : I
    //   10948: iflt -> 10962
    //   10951: ldc2_w 302893535
    //   10954: l2i
    //   10955: ldc_w -513689907
    //   10958: ixor
    //   10959: goto -> 10970
    //   10962: ldc2_w 2033412755
    //   10965: l2i
    //   10966: ldc_w -293287635
    //   10969: ixor
    //   10970: ldc2_w 909278145
    //   10973: l2i
    //   10974: ldc_w 83149282
    //   10977: ixor
    //   10978: ixor
    //   10979: lookupswitch default -> 12812, -1519314531 -> 11004, -1045773007 -> 10962
    //   11004: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   11007: getstatic Perryc.c : I
    //   11010: iflt -> 11024
    //   11013: ldc2_w 1429000442
    //   11016: l2i
    //   11017: ldc_w -1806034931
    //   11020: ixor
    //   11021: goto -> 11032
    //   11024: ldc2_w -1559412131
    //   11027: l2i
    //   11028: ldc_w 2119247320
    //   11031: ixor
    //   11032: ldc2_w -1536366707
    //   11035: l2i
    //   11036: ldc_w 2094963593
    //   11039: ixor
    //   11040: ixor
    //   11041: lookupswitch default -> 11068, -128894182 -> 11024, 432321779 -> 13112
    //   11068: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11071: getstatic Perryc.0 : I
    //   11074: ifle -> 11088
    //   11077: ldc2_w -1787520550
    //   11080: l2i
    //   11081: ldc_w 148194345
    //   11084: ixor
    //   11085: goto -> 11096
    //   11088: ldc2_w 1077175643
    //   11091: l2i
    //   11092: ldc_w -126062955
    //   11095: ixor
    //   11096: ldc2_w -1368977080
    //   11099: l2i
    //   11100: ldc_w 1370604738
    //   11103: ixor
    //   11104: ixor
    //   11105: lookupswitch default -> 13134, 1201593924 -> 11132, 1651968121 -> 11088
    //   11132: getfield field_70165_t : D
    //   11135: getstatic Perryc.c : I
    //   11138: iflt -> 11152
    //   11141: ldc2_w -485299968
    //   11144: l2i
    //   11145: ldc_w -1970961584
    //   11148: ixor
    //   11149: goto -> 11160
    //   11152: ldc2_w -1963922033
    //   11155: l2i
    //   11156: ldc_w -1521416008
    //   11159: ixor
    //   11160: ldc2_w -70001108
    //   11163: l2i
    //   11164: ldc_w 847210632
    //   11167: ixor
    //   11168: ixor
    //   11169: lookupswitch default -> 12784, -1606689548 -> 11152, -435334253 -> 11196
    //   11196: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   11199: getstatic Perryc.c : I
    //   11202: iflt -> 11216
    //   11205: ldc2_w -93240324
    //   11208: l2i
    //   11209: ldc_w 1910269619
    //   11212: ixor
    //   11213: goto -> 11224
    //   11216: ldc2_w -737729469
    //   11219: l2i
    //   11220: ldc_w 250051372
    //   11223: ixor
    //   11224: ldc2_w 1010529741
    //   11227: l2i
    //   11228: ldc_w 1828383093
    //   11231: ixor
    //   11232: ixor
    //   11233: lookupswitch default -> 12994, -1977498665 -> 11260, -613631497 -> 11216
    //   11260: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11263: getstatic Perryc.0 : I
    //   11266: ifle -> 11280
    //   11269: ldc2_w -1454236361
    //   11272: l2i
    //   11273: ldc_w -1251806152
    //   11276: ixor
    //   11277: goto -> 11288
    //   11280: ldc2_w -1033390232
    //   11283: l2i
    //   11284: ldc_w -401315237
    //   11287: ixor
    //   11288: ldc2_w 95825183
    //   11291: l2i
    //   11292: ldc_w -886991318
    //   11295: ixor
    //   11296: ixor
    //   11297: lookupswitch default -> 11324, -1292688221 -> 11280, -760786374 -> 13118
    //   11324: getfield field_70163_u : D
    //   11327: ldc2_w 6.712396515128127
    //   11330: invokestatic doubleToLongBits : (D)J
    //   11333: ldc2_w 9217418724583737832
    //   11336: lxor
    //   11337: invokestatic longBitsToDouble : (J)D
    //   11340: dadd
    //   11341: getstatic Perryc.0 : I
    //   11344: ifle -> 11358
    //   11347: ldc2_w 106287590
    //   11350: l2i
    //   11351: ldc_w -1630730776
    //   11354: ixor
    //   11355: goto -> 11366
    //   11358: ldc2_w 363976456
    //   11361: l2i
    //   11362: ldc_w 1262071744
    //   11365: ixor
    //   11366: ldc2_w -1243762804
    //   11369: l2i
    //   11370: ldc_w 718298149
    //   11373: ixor
    //   11374: ixor
    //   11375: lookupswitch default -> 11400, -1801199535 -> 11358, 127215527 -> 13026
    //   11400: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   11403: getstatic Perryc.0 : I
    //   11406: ifle -> 11420
    //   11409: ldc2_w -1102573349
    //   11412: l2i
    //   11413: ldc_w 1109261628
    //   11416: ixor
    //   11417: goto -> 11428
    //   11420: ldc2_w 159831599
    //   11423: l2i
    //   11424: ldc_w 834210921
    //   11427: ixor
    //   11428: ldc2_w 1443391129
    //   11431: l2i
    //   11432: ldc_w 212710198
    //   11435: ixor
    //   11436: ixor
    //   11437: lookupswitch default -> 12864, -1494206392 -> 11420, 1654263785 -> 11464
    //   11464: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11467: getstatic Perryc.c : I
    //   11470: iflt -> 11484
    //   11473: ldc2_w -660421824
    //   11476: l2i
    //   11477: ldc_w -1423611656
    //   11480: ixor
    //   11481: goto -> 11492
    //   11484: ldc2_w 1431814102
    //   11487: l2i
    //   11488: ldc_w 908313531
    //   11491: ixor
    //   11492: ldc2_w -604976035
    //   11495: l2i
    //   11496: ldc_w 561713166
    //   11499: ixor
    //   11500: ixor
    //   11501: lookupswitch default -> 11528, -1995671573 -> 12998, 2048606630 -> 11484
    //   11528: getfield field_70161_v : D
    //   11531: ldc2_w 0.19819393946183114
    //   11534: invokestatic doubleToLongBits : (D)J
    //   11537: ldc2_w 9207994727933182475
    //   11540: lxor
    //   11541: invokestatic longBitsToDouble : (J)D
    //   11544: dadd
    //   11545: getstatic Perryc.c : I
    //   11548: iflt -> 11562
    //   11551: ldc2_w 1784056429
    //   11554: l2i
    //   11555: ldc_w -403550892
    //   11558: ixor
    //   11559: goto -> 11570
    //   11562: ldc2_w -1984354295
    //   11565: l2i
    //   11566: ldc_w -1214828963
    //   11569: ixor
    //   11570: ldc2_w 52179814
    //   11573: l2i
    //   11574: ldc_w -1346002517
    //   11577: ixor
    //   11578: ixor
    //   11579: lookupswitch default -> 11604, 561862132 -> 12902, 1942556494 -> 11562
    //   11604: goto -> 11608
    //   11607: athrow
    //   11608: invokespecial <init> : (DDD)V
    //   11611: goto -> 11615
    //   11614: athrow
    //   11615: getstatic Perryc.c : I
    //   11618: iflt -> 11632
    //   11621: ldc2_w -1021060760
    //   11624: l2i
    //   11625: ldc_w 546080113
    //   11628: ixor
    //   11629: goto -> 11640
    //   11632: ldc2_w -1601293960
    //   11635: l2i
    //   11636: ldc_w -1289054221
    //   11639: ixor
    //   11640: ldc2_w 152745279
    //   11643: l2i
    //   11644: ldc_w 59892071
    //   11647: ixor
    //   11648: ixor
    //   11649: lookupswitch default -> 11676, -558929501 -> 11632, -383514559 -> 13050
    //   11676: goto -> 11680
    //   11679: athrow
    //   11680: invokevirtual add : (Ljava/lang/Object;)Z
    //   11683: goto -> 11687
    //   11686: athrow
    //   11687: pop
    //   11688: getstatic Perryc.c : I
    //   11691: iflt -> 11705
    //   11694: ldc2_w -2096176158
    //   11697: l2i
    //   11698: ldc_w 929286188
    //   11701: ixor
    //   11702: goto -> 11713
    //   11705: ldc2_w -1795367671
    //   11708: l2i
    //   11709: ldc_w -1850582527
    //   11712: ixor
    //   11713: ldc2_w -1642371106
    //   11716: l2i
    //   11717: ldc_w 1490841316
    //   11720: ixor
    //   11721: ixor
    //   11722: lookupswitch default -> 11748, -1294905015 -> 11705, 1923752692 -> 12980
    //   11748: aload_1
    //   11749: new net/minecraft/util/math/BlockPos
    //   11752: dup
    //   11753: getstatic Perryc.1 : I
    //   11756: ifeq -> 11770
    //   11759: ldc2_w -1562903079
    //   11762: l2i
    //   11763: ldc_w -314820478
    //   11766: ixor
    //   11767: goto -> 11778
    //   11770: ldc2_w -972635920
    //   11773: l2i
    //   11774: ldc_w -1706890767
    //   11777: ixor
    //   11778: ldc2_w -1354533992
    //   11781: l2i
    //   11782: ldc_w 1222804717
    //   11785: ixor
    //   11786: ixor
    //   11787: lookupswitch default -> 11812, -1471532498 -> 12944, 1149562010 -> 11770
    //   11812: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   11815: getstatic Perryc.c : I
    //   11818: iflt -> 11832
    //   11821: ldc2_w -1923085165
    //   11824: l2i
    //   11825: ldc_w 437216509
    //   11828: ixor
    //   11829: goto -> 11840
    //   11832: ldc2_w 783667051
    //   11835: l2i
    //   11836: ldc_w 284665296
    //   11839: ixor
    //   11840: ldc2_w 463470681
    //   11843: l2i
    //   11844: ldc_w 1413751341
    //   11847: ixor
    //   11848: ixor
    //   11849: lookupswitch default -> 13092, -661960166 -> 11832, 1906723023 -> 11876
    //   11876: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11879: getstatic Perryc.c : I
    //   11882: iflt -> 11896
    //   11885: ldc2_w -2113365622
    //   11888: l2i
    //   11889: ldc_w 1988748260
    //   11892: ixor
    //   11893: goto -> 11904
    //   11896: ldc2_w 344584856
    //   11899: l2i
    //   11900: ldc_w 650055690
    //   11903: ixor
    //   11904: ldc2_w -1322085182
    //   11907: l2i
    //   11908: ldc_w -383466267
    //   11911: ixor
    //   11912: ixor
    //   11913: lookupswitch default -> 12940, -1399379383 -> 11896, 1780527797 -> 11940
    //   11940: getfield field_70165_t : D
    //   11943: getstatic Perryc.c : I
    //   11946: iflt -> 11960
    //   11949: ldc2_w 727430701
    //   11952: l2i
    //   11953: ldc_w 1611040180
    //   11956: ixor
    //   11957: goto -> 11968
    //   11960: ldc2_w 1738862476
    //   11963: l2i
    //   11964: ldc_w -1725548141
    //   11967: ixor
    //   11968: ldc2_w -91430767
    //   11971: l2i
    //   11972: ldc_w -1459955116
    //   11975: ixor
    //   11976: ixor
    //   11977: lookupswitch default -> 12004, 422250844 -> 12882, 815543661 -> 11960
    //   12004: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   12007: getstatic Perryc.0 : I
    //   12010: ifle -> 12024
    //   12013: ldc2_w 486273818
    //   12016: l2i
    //   12017: ldc_w -1337204956
    //   12020: ixor
    //   12021: goto -> 12032
    //   12024: ldc2_w 1711803683
    //   12027: l2i
    //   12028: ldc_w -2127203843
    //   12031: ixor
    //   12032: ldc2_w -103757315
    //   12035: l2i
    //   12036: ldc_w 811331
    //   12039: ixor
    //   12040: ixor
    //   12041: lookupswitch default -> 13052, 518116448 -> 12068, 1433175168 -> 12024
    //   12068: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12071: getstatic Perryc.0 : I
    //   12074: ifle -> 12088
    //   12077: ldc2_w 1476209693
    //   12080: l2i
    //   12081: ldc_w -1299102933
    //   12084: ixor
    //   12085: goto -> 12096
    //   12088: ldc2_w -2121295350
    //   12091: l2i
    //   12092: ldc_w 1688230836
    //   12095: ixor
    //   12096: ldc2_w 358127846
    //   12099: l2i
    //   12100: ldc_w -276270872
    //   12103: ixor
    //   12104: ixor
    //   12105: lookupswitch default -> 12132, 532449080 -> 12830, 1976600234 -> 12088
    //   12132: getfield field_70163_u : D
    //   12135: ldc2_w 68.93088354246423
    //   12138: invokestatic doubleToLongBits : (D)J
    //   12141: ldc2_w 9196697419173122351
    //   12144: lxor
    //   12145: invokestatic longBitsToDouble : (J)D
    //   12148: dadd
    //   12149: getstatic Perryc.1 : I
    //   12152: ifeq -> 12166
    //   12155: ldc2_w -620039123
    //   12158: l2i
    //   12159: ldc_w 1955131116
    //   12162: ixor
    //   12163: goto -> 12174
    //   12166: ldc2_w -214143133
    //   12169: l2i
    //   12170: ldc_w -1917078143
    //   12173: ixor
    //   12174: ldc2_w -1624535611
    //   12177: l2i
    //   12178: ldc_w 1797900990
    //   12181: ixor
    //   12182: ixor
    //   12183: lookupswitch default -> 13046, -1970954855 -> 12208, 1535139258 -> 12166
    //   12208: getstatic bigname/zprestige/webhack/features/modules/Combat/AntiPiston.mc : Lnet/minecraft/client/Minecraft;
    //   12211: getstatic Perryc.c : I
    //   12214: iflt -> 12228
    //   12217: ldc2_w 413309626
    //   12220: l2i
    //   12221: ldc_w -62889140
    //   12224: ixor
    //   12225: goto -> 12236
    //   12228: ldc2_w 1758777300
    //   12231: l2i
    //   12232: ldc_w -1729315103
    //   12235: ixor
    //   12236: ldc2_w 1247256118
    //   12239: l2i
    //   12240: ldc_w 1581282141
    //   12243: ixor
    //   12244: ixor
    //   12245: lookupswitch default -> 12272, -1420511041 -> 12228, -252373859 -> 13030
    //   12272: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12275: getstatic Perryc.0 : I
    //   12278: ifle -> 12292
    //   12281: ldc2_w 842228237
    //   12284: l2i
    //   12285: ldc_w 1715037794
    //   12288: ixor
    //   12289: goto -> 12300
    //   12292: ldc2_w -1036646857
    //   12295: l2i
    //   12296: ldc_w 894988317
    //   12299: ixor
    //   12300: ldc2_w -1035067693
    //   12303: l2i
    //   12304: ldc_w 1873359707
    //   12307: ixor
    //   12308: ixor
    //   12309: lookupswitch default -> 12336, -575659986 -> 12292, -101897753 -> 12796
    //   12336: getfield field_70161_v : D
    //   12339: ldc2_w -0.6757840162157303
    //   12342: invokestatic doubleToLongBits : (D)J
    //   12345: ldc2_w 9215948159259888520
    //   12348: lxor
    //   12349: invokestatic longBitsToDouble : (J)D
    //   12352: dadd
    //   12353: getstatic Perryc.c : I
    //   12356: iflt -> 12370
    //   12359: ldc2_w 1898332506
    //   12362: l2i
    //   12363: ldc_w 1745785707
    //   12366: ixor
    //   12367: goto -> 12378
    //   12370: ldc2_w -570653151
    //   12373: l2i
    //   12374: ldc_w -330158362
    //   12377: ixor
    //   12378: ldc2_w 1713604489
    //   12381: l2i
    //   12382: ldc_w 661180536
    //   12385: ixor
    //   12386: ixor
    //   12387: lookupswitch default -> 12786, 1482917312 -> 12370, 1894121270 -> 12412
    //   12412: goto -> 12416
    //   12415: athrow
    //   12416: invokespecial <init> : (DDD)V
    //   12419: goto -> 12423
    //   12422: athrow
    //   12423: getstatic Perryc.c : I
    //   12426: iflt -> 12440
    //   12429: ldc2_w -206333187
    //   12432: l2i
    //   12433: ldc_w 1052590295
    //   12436: ixor
    //   12437: goto -> 12448
    //   12440: ldc2_w -1076866326
    //   12443: l2i
    //   12444: ldc_w -982984237
    //   12447: ixor
    //   12448: ldc2_w -141270829
    //   12451: l2i
    //   12452: ldc_w 1540156688
    //   12455: ixor
    //   12456: ixor
    //   12457: lookupswitch default -> 12484, 1239694238 -> 12440, 1633048553 -> 12886
    //   12484: goto -> 12488
    //   12487: athrow
    //   12488: invokevirtual add : (Ljava/lang/Object;)Z
    //   12491: goto -> 12495
    //   12494: athrow
    //   12495: pop
    //   12496: getstatic Perryc.0 : I
    //   12499: ifle -> 12513
    //   12502: ldc2_w -202839419
    //   12505: l2i
    //   12506: ldc_w -1636396213
    //   12509: ixor
    //   12510: goto -> 12521
    //   12513: ldc2_w -1276832028
    //   12516: l2i
    //   12517: ldc_w -1124514530
    //   12520: ixor
    //   12521: ldc2_w -790269754
    //   12524: l2i
    //   12525: ldc_w -1688392878
    //   12528: ixor
    //   12529: ixor
    //   12530: lookupswitch default -> 12834, 640033370 -> 12513, 1151600750 -> 12556
    //   12556: aload_1
    //   12557: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
    //   12562: getstatic Perryc.c : I
    //   12565: iflt -> 12579
    //   12568: ldc2_w -1253600231
    //   12571: l2i
    //   12572: ldc_w -1635646453
    //   12575: ixor
    //   12576: goto -> 12587
    //   12579: ldc2_w -985658883
    //   12582: l2i
    //   12583: ldc_w -1068007425
    //   12586: ixor
    //   12587: ldc2_w -1927775811
    //   12590: l2i
    //   12591: ldc_w 1748950431
    //   12594: ixor
    //   12595: ixor
    //   12596: lookupswitch default -> 12624, -834602296 -> 12579, -823970768 -> 12824
    //   12624: goto -> 12628
    //   12627: athrow
    //   12628: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    //   12631: goto -> 12635
    //   12634: athrow
    //   12635: getstatic Perryc.c : I
    //   12638: iflt -> 12652
    //   12641: ldc2_w -1938923804
    //   12644: l2i
    //   12645: ldc_w -643140458
    //   12648: ixor
    //   12649: goto -> 12660
    //   12652: ldc2_w -1668500830
    //   12655: l2i
    //   12656: ldc_w 361136362
    //   12659: ixor
    //   12660: ldc2_w 1273546066
    //   12663: l2i
    //   12664: ldc_w 1621522398
    //   12667: ixor
    //   12668: ixor
    //   12669: lookupswitch default -> 12696, -2021014349 -> 12652, 2123012350 -> 13048
    //   12696: goto -> 12700
    //   12699: athrow
    //   12700: invokevirtual sort : (Ljava/util/Comparator;)V
    //   12703: goto -> 12707
    //   12706: athrow
    //   12707: getstatic Perryc.1 : I
    //   12710: ifeq -> 12724
    //   12713: ldc2_w 1718072051
    //   12716: l2i
    //   12717: ldc_w -332761788
    //   12720: ixor
    //   12721: goto -> 12732
    //   12724: ldc2_w -1755409524
    //   12727: l2i
    //   12728: ldc_w -548657727
    //   12731: ixor
    //   12732: ldc2_w 1222664894
    //   12735: l2i
    //   12736: ldc_w 1697903041
    //   12739: ixor
    //   12740: ixor
    //   12741: lookupswitch default -> 13138, -1482795832 -> 12724, 1707156786 -> 12768
    //   12768: aload_1
    //   12769: areturn
    //   12770: aconst_null
    //   12771: athrow
    //   12772: aconst_null
    //   12773: athrow
    //   12774: aconst_null
    //   12775: athrow
    //   12776: aconst_null
    //   12777: athrow
    //   12778: aconst_null
    //   12779: athrow
    //   12780: aconst_null
    //   12781: athrow
    //   12782: aconst_null
    //   12783: athrow
    //   12784: aconst_null
    //   12785: athrow
    //   12786: aconst_null
    //   12787: athrow
    //   12788: aconst_null
    //   12789: athrow
    //   12790: aconst_null
    //   12791: athrow
    //   12792: aconst_null
    //   12793: athrow
    //   12794: aconst_null
    //   12795: athrow
    //   12796: aconst_null
    //   12797: athrow
    //   12798: aconst_null
    //   12799: athrow
    //   12800: aconst_null
    //   12801: athrow
    //   12802: aconst_null
    //   12803: athrow
    //   12804: aconst_null
    //   12805: athrow
    //   12806: aconst_null
    //   12807: athrow
    //   12808: aconst_null
    //   12809: athrow
    //   12810: aconst_null
    //   12811: athrow
    //   12812: aconst_null
    //   12813: athrow
    //   12814: aconst_null
    //   12815: athrow
    //   12816: aconst_null
    //   12817: athrow
    //   12818: aconst_null
    //   12819: athrow
    //   12820: aconst_null
    //   12821: athrow
    //   12822: aconst_null
    //   12823: athrow
    //   12824: aconst_null
    //   12825: athrow
    //   12826: aconst_null
    //   12827: athrow
    //   12828: aconst_null
    //   12829: athrow
    //   12830: aconst_null
    //   12831: athrow
    //   12832: aconst_null
    //   12833: athrow
    //   12834: aconst_null
    //   12835: athrow
    //   12836: aconst_null
    //   12837: athrow
    //   12838: aconst_null
    //   12839: athrow
    //   12840: aconst_null
    //   12841: athrow
    //   12842: aconst_null
    //   12843: athrow
    //   12844: aconst_null
    //   12845: athrow
    //   12846: aconst_null
    //   12847: athrow
    //   12848: aconst_null
    //   12849: athrow
    //   12850: aconst_null
    //   12851: athrow
    //   12852: aconst_null
    //   12853: athrow
    //   12854: aconst_null
    //   12855: athrow
    //   12856: aconst_null
    //   12857: athrow
    //   12858: aconst_null
    //   12859: athrow
    //   12860: aconst_null
    //   12861: athrow
    //   12862: aconst_null
    //   12863: athrow
    //   12864: aconst_null
    //   12865: athrow
    //   12866: aconst_null
    //   12867: athrow
    //   12868: aconst_null
    //   12869: athrow
    //   12870: aconst_null
    //   12871: athrow
    //   12872: aconst_null
    //   12873: athrow
    //   12874: aconst_null
    //   12875: athrow
    //   12876: aconst_null
    //   12877: athrow
    //   12878: aconst_null
    //   12879: athrow
    //   12880: aconst_null
    //   12881: athrow
    //   12882: aconst_null
    //   12883: athrow
    //   12884: aconst_null
    //   12885: athrow
    //   12886: aconst_null
    //   12887: athrow
    //   12888: aconst_null
    //   12889: athrow
    //   12890: aconst_null
    //   12891: athrow
    //   12892: aconst_null
    //   12893: athrow
    //   12894: aconst_null
    //   12895: athrow
    //   12896: aconst_null
    //   12897: athrow
    //   12898: aconst_null
    //   12899: athrow
    //   12900: aconst_null
    //   12901: athrow
    //   12902: aconst_null
    //   12903: athrow
    //   12904: aconst_null
    //   12905: athrow
    //   12906: aconst_null
    //   12907: athrow
    //   12908: aconst_null
    //   12909: athrow
    //   12910: aconst_null
    //   12911: athrow
    //   12912: aconst_null
    //   12913: athrow
    //   12914: aconst_null
    //   12915: athrow
    //   12916: aconst_null
    //   12917: athrow
    //   12918: aconst_null
    //   12919: athrow
    //   12920: aconst_null
    //   12921: athrow
    //   12922: aconst_null
    //   12923: athrow
    //   12924: aconst_null
    //   12925: athrow
    //   12926: aconst_null
    //   12927: athrow
    //   12928: aconst_null
    //   12929: athrow
    //   12930: aconst_null
    //   12931: athrow
    //   12932: aconst_null
    //   12933: athrow
    //   12934: aconst_null
    //   12935: athrow
    //   12936: aconst_null
    //   12937: athrow
    //   12938: aconst_null
    //   12939: athrow
    //   12940: aconst_null
    //   12941: athrow
    //   12942: aconst_null
    //   12943: athrow
    //   12944: aconst_null
    //   12945: athrow
    //   12946: aconst_null
    //   12947: athrow
    //   12948: aconst_null
    //   12949: athrow
    //   12950: aconst_null
    //   12951: athrow
    //   12952: aconst_null
    //   12953: athrow
    //   12954: aconst_null
    //   12955: athrow
    //   12956: aconst_null
    //   12957: athrow
    //   12958: aconst_null
    //   12959: athrow
    //   12960: aconst_null
    //   12961: athrow
    //   12962: aconst_null
    //   12963: athrow
    //   12964: aconst_null
    //   12965: athrow
    //   12966: aconst_null
    //   12967: athrow
    //   12968: aconst_null
    //   12969: athrow
    //   12970: aconst_null
    //   12971: athrow
    //   12972: aconst_null
    //   12973: athrow
    //   12974: aconst_null
    //   12975: athrow
    //   12976: aconst_null
    //   12977: athrow
    //   12978: aconst_null
    //   12979: athrow
    //   12980: aconst_null
    //   12981: athrow
    //   12982: aconst_null
    //   12983: athrow
    //   12984: aconst_null
    //   12985: athrow
    //   12986: aconst_null
    //   12987: athrow
    //   12988: aconst_null
    //   12989: athrow
    //   12990: aconst_null
    //   12991: athrow
    //   12992: aconst_null
    //   12993: athrow
    //   12994: aconst_null
    //   12995: athrow
    //   12996: aconst_null
    //   12997: athrow
    //   12998: aconst_null
    //   12999: athrow
    //   13000: aconst_null
    //   13001: athrow
    //   13002: aconst_null
    //   13003: athrow
    //   13004: aconst_null
    //   13005: athrow
    //   13006: aconst_null
    //   13007: athrow
    //   13008: aconst_null
    //   13009: athrow
    //   13010: aconst_null
    //   13011: athrow
    //   13012: aconst_null
    //   13013: athrow
    //   13014: aconst_null
    //   13015: athrow
    //   13016: aconst_null
    //   13017: athrow
    //   13018: aconst_null
    //   13019: athrow
    //   13020: aconst_null
    //   13021: athrow
    //   13022: aconst_null
    //   13023: athrow
    //   13024: aconst_null
    //   13025: athrow
    //   13026: aconst_null
    //   13027: athrow
    //   13028: aconst_null
    //   13029: athrow
    //   13030: aconst_null
    //   13031: athrow
    //   13032: aconst_null
    //   13033: athrow
    //   13034: aconst_null
    //   13035: athrow
    //   13036: aconst_null
    //   13037: athrow
    //   13038: aconst_null
    //   13039: athrow
    //   13040: aconst_null
    //   13041: athrow
    //   13042: aconst_null
    //   13043: athrow
    //   13044: aconst_null
    //   13045: athrow
    //   13046: aconst_null
    //   13047: athrow
    //   13048: aconst_null
    //   13049: athrow
    //   13050: aconst_null
    //   13051: athrow
    //   13052: aconst_null
    //   13053: athrow
    //   13054: aconst_null
    //   13055: athrow
    //   13056: aconst_null
    //   13057: athrow
    //   13058: aconst_null
    //   13059: athrow
    //   13060: aconst_null
    //   13061: athrow
    //   13062: aconst_null
    //   13063: athrow
    //   13064: aconst_null
    //   13065: athrow
    //   13066: aconst_null
    //   13067: athrow
    //   13068: aconst_null
    //   13069: athrow
    //   13070: aconst_null
    //   13071: athrow
    //   13072: aconst_null
    //   13073: athrow
    //   13074: aconst_null
    //   13075: athrow
    //   13076: aconst_null
    //   13077: athrow
    //   13078: aconst_null
    //   13079: athrow
    //   13080: aconst_null
    //   13081: athrow
    //   13082: aconst_null
    //   13083: athrow
    //   13084: aconst_null
    //   13085: athrow
    //   13086: aconst_null
    //   13087: athrow
    //   13088: aconst_null
    //   13089: athrow
    //   13090: aconst_null
    //   13091: athrow
    //   13092: aconst_null
    //   13093: athrow
    //   13094: aconst_null
    //   13095: athrow
    //   13096: aconst_null
    //   13097: athrow
    //   13098: aconst_null
    //   13099: athrow
    //   13100: aconst_null
    //   13101: athrow
    //   13102: aconst_null
    //   13103: athrow
    //   13104: aconst_null
    //   13105: athrow
    //   13106: aconst_null
    //   13107: athrow
    //   13108: aconst_null
    //   13109: athrow
    //   13110: aconst_null
    //   13111: athrow
    //   13112: aconst_null
    //   13113: athrow
    //   13114: aconst_null
    //   13115: athrow
    //   13116: aconst_null
    //   13117: athrow
    //   13118: aconst_null
    //   13119: athrow
    //   13120: aconst_null
    //   13121: athrow
    //   13122: aconst_null
    //   13123: athrow
    //   13124: aconst_null
    //   13125: athrow
    //   13126: aconst_null
    //   13127: athrow
    //   13128: aconst_null
    //   13129: athrow
    //   13130: aconst_null
    //   13131: athrow
    //   13132: aconst_null
    //   13133: athrow
    //   13134: aconst_null
    //   13135: athrow
    //   13136: aconst_null
    //   13137: athrow
    //   13138: aconst_null
    //   13139: athrow
    //   13140: pop
    //   13141: goto -> 24
    //   13144: pop
    //   13145: aconst_null
    //   13146: goto -> 13140
    //   13149: dup
    //   13150: ifnull -> 13140
    //   13153: checkcast java/lang/Throwable
    //   13156: athrow
    //   13157: dup
    //   13158: ifnull -> 13144
    //   13161: checkcast java/lang/Throwable
    //   13164: athrow
    //   13165: aconst_null
    //   13166: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	12746	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AntiPiston;
    //   161	12609	1	positions	Ljava/util/ArrayList;
    //   1241	11529	2	placeability	I
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	12609	1	positions	Ljava/util/ArrayList<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	13149	finally
    //   91	98	98	finally
    //   91	98	98	java/lang/ArrayIndexOutOfBoundsException
    //   91	98	3	finally
    //   92	98	3	finally
    //   92	98	91	java/util/ConcurrentModificationException
    //   875	882	882	finally
    //   875	882	875	java/lang/IllegalStateException
    //   875	882	3	finally
    //   875	882	882	finally
    //   876	882	3	finally
    //   948	954	954	finally
    //   948	954	954	java/lang/IllegalArgumentException
    //   948	954	3	finally
    //   948	954	954	java/lang/UnsupportedOperationException
    //   948	954	3	finally
    //   1087	1094	1094	finally
    //   1087	1094	3	finally
    //   1087	1094	1094	java/lang/ArrayIndexOutOfBoundsException
    //   1088	1094	1087	finally
    //   1088	1094	1087	java/lang/NegativeArraySizeException
    //   1171	1178	1178	finally
    //   1171	1178	1171	java/lang/IllegalArgumentException
    //   1171	1178	1178	java/lang/IndexOutOfBoundsException
    //   1171	1178	1178	java/lang/NegativeArraySizeException
    //   1171	1178	1178	finally
    //   1399	1406	1406	finally
    //   1399	1406	1406	java/lang/UnsupportedOperationException
    //   1399	1406	1406	java/lang/AssertionError
    //   1400	1406	1399	java/lang/AssertionError
    //   1400	1406	1399	java/lang/IllegalStateException
    //   1603	1610	1610	finally
    //   1603	1610	1603	finally
    //   1603	1610	1603	finally
    //   1604	1610	1603	finally
    //   1604	1610	1610	java/util/NoSuchElementException
    //   1695	1702	1702	finally
    //   1695	1702	1695	java/lang/EnumConstantNotPresentException
    //   1695	1702	1702	finally
    //   1696	1702	1695	java/lang/ArithmeticException
    //   1696	1702	3	finally
    //   2556	2562	2562	finally
    //   2556	2562	3	finally
    //   2556	2562	3	java/lang/UnsupportedOperationException
    //   2556	2562	2562	finally
    //   2556	2562	2562	finally
    //   2627	2634	2634	finally
    //   2627	2634	2627	java/util/ConcurrentModificationException
    //   2627	2634	2627	java/lang/NumberFormatException
    //   2627	2634	2634	finally
    //   2628	2634	2634	java/lang/ArrayIndexOutOfBoundsException
    //   3363	3370	3370	finally
    //   3363	3370	3	finally
    //   3364	3370	3363	finally
    //   3364	3370	3363	java/lang/RuntimeException
    //   3364	3370	3363	finally
    //   3435	3442	3442	finally
    //   3435	3442	3435	java/lang/ArrayIndexOutOfBoundsException
    //   3435	3442	3435	finally
    //   3435	3442	3435	java/lang/RuntimeException
    //   3436	3442	3435	finally
    //   4171	4178	4178	finally
    //   4172	4178	4171	java/lang/IllegalArgumentException
    //   4172	4178	4171	finally
    //   4172	4178	4171	finally
    //   4172	4178	4178	finally
    //   4243	4250	4250	finally
    //   4243	4250	4243	finally
    //   4243	4250	4243	finally
    //   4243	4250	4250	java/lang/ArithmeticException
    //   4244	4250	4243	java/util/NoSuchElementException
    //   4979	4986	4986	finally
    //   4979	4986	3	java/util/NoSuchElementException
    //   4979	4986	4979	java/lang/IndexOutOfBoundsException
    //   4980	4986	3	finally
    //   4980	4986	4986	java/lang/ClassCastException
    //   5051	5058	5058	finally
    //   5051	5058	5058	finally
    //   5051	5058	3	java/lang/IllegalStateException
    //   5052	5058	5051	finally
    //   5052	5058	5051	java/util/ConcurrentModificationException
    //   5247	5254	5254	finally
    //   5247	5254	3	java/lang/IllegalArgumentException
    //   5247	5254	5247	finally
    //   5247	5254	3	java/lang/NullPointerException
    //   5248	5254	5254	java/lang/ClassCastException
    //   5323	5330	5330	finally
    //   5323	5330	5323	finally
    //   5323	5330	5330	finally
    //   5324	5330	3	finally
    //   5324	5330	5323	finally
    //   6112	6118	6118	finally
    //   6112	6118	6118	finally
    //   6112	6118	3	java/util/ConcurrentModificationException
    //   6112	6118	6118	java/lang/AssertionError
    //   6112	6118	6118	java/lang/NumberFormatException
    //   6183	6190	6190	finally
    //   6183	6190	6190	finally
    //   6183	6190	6183	finally
    //   6183	6190	6183	finally
    //   6184	6190	6183	finally
    //   6919	6926	6926	finally
    //   6919	6926	6919	finally
    //   6919	6926	3	java/lang/ArithmeticException
    //   6920	6926	3	java/util/ConcurrentModificationException
    //   6920	6926	6926	java/lang/NegativeArraySizeException
    //   6991	6998	6998	finally
    //   6991	6998	6991	finally
    //   6991	6998	6998	java/util/NoSuchElementException
    //   6992	6998	6991	finally
    //   6992	6998	6991	finally
    //   7727	7734	7734	finally
    //   7728	7734	7727	finally
    //   7728	7734	7734	finally
    //   7728	7734	7734	java/lang/NumberFormatException
    //   7728	7734	3	java/lang/UnsupportedOperationException
    //   7799	7806	7806	finally
    //   7799	7806	3	java/lang/ClassCastException
    //   7799	7806	3	finally
    //   7800	7806	7799	java/lang/NegativeArraySizeException
    //   7800	7806	3	finally
    //   8535	8542	8542	finally
    //   8535	8542	3	finally
    //   8535	8542	8542	java/lang/UnsupportedOperationException
    //   8535	8542	8535	finally
    //   8536	8542	8535	java/lang/AssertionError
    //   8607	8614	8614	finally
    //   8607	8614	8607	finally
    //   8607	8614	8607	finally
    //   8607	8614	3	finally
    //   8608	8614	3	java/lang/IllegalStateException
    //   8803	8810	8810	finally
    //   8803	8810	3	finally
    //   8803	8810	8803	java/lang/IndexOutOfBoundsException
    //   8803	8810	3	java/lang/RuntimeException
    //   8804	8810	8810	java/lang/StringIndexOutOfBoundsException
    //   8879	8886	8886	finally
    //   8879	8886	8886	java/lang/IndexOutOfBoundsException
    //   8879	8886	3	finally
    //   8879	8886	8879	finally
    //   8880	8886	3	finally
    //   9127	9134	9134	finally
    //   9127	9134	9134	java/util/NoSuchElementException
    //   9127	9134	9127	java/lang/NegativeArraySizeException
    //   9127	9134	9134	java/lang/IndexOutOfBoundsException
    //   9128	9134	3	java/lang/StringIndexOutOfBoundsException
    //   9203	9210	9210	finally
    //   9203	9210	9203	java/lang/ArithmeticException
    //   9203	9210	9203	java/lang/NullPointerException
    //   9203	9210	3	java/lang/NullPointerException
    //   9203	9210	3	java/lang/UnsupportedOperationException
    //   9991	9998	9998	finally
    //   9991	9998	9998	java/lang/EnumConstantNotPresentException
    //   9991	9998	9991	finally
    //   9992	9998	9998	finally
    //   9992	9998	9998	java/lang/ArithmeticException
    //   10063	10070	10070	finally
    //   10063	10070	10063	java/util/NoSuchElementException
    //   10063	10070	10070	finally
    //   10063	10070	3	java/util/NoSuchElementException
    //   10064	10070	3	java/lang/ArrayIndexOutOfBoundsException
    //   10799	10806	10806	finally
    //   10799	10806	10806	finally
    //   10799	10806	10799	java/lang/StringIndexOutOfBoundsException
    //   10800	10806	10806	java/util/NoSuchElementException
    //   10800	10806	10799	java/lang/IndexOutOfBoundsException
    //   10871	10878	10878	finally
    //   10871	10878	10878	java/lang/RuntimeException
    //   10871	10878	3	java/util/ConcurrentModificationException
    //   10871	10878	10871	finally
    //   10872	10878	3	java/lang/StringIndexOutOfBoundsException
    //   11608	11614	11614	finally
    //   11608	11614	3	finally
    //   11608	11614	11614	java/lang/IllegalStateException
    //   11608	11614	11614	java/lang/ClassCastException
    //   11608	11614	3	finally
    //   11679	11686	11686	finally
    //   11679	11686	11679	java/lang/IllegalStateException
    //   11680	11686	11679	finally
    //   11680	11686	11679	java/lang/StringIndexOutOfBoundsException
    //   11680	11686	11686	java/lang/ArithmeticException
    //   12415	12422	12422	finally
    //   12415	12422	3	java/lang/IllegalStateException
    //   12416	12422	12422	java/lang/RuntimeException
    //   12416	12422	12415	java/lang/EnumConstantNotPresentException
    //   12416	12422	12422	finally
    //   12487	12494	12494	finally
    //   12487	12494	3	finally
    //   12487	12494	12487	java/util/NoSuchElementException
    //   12488	12494	12494	java/util/NoSuchElementException
    //   12488	12494	3	finally
    //   12627	12634	12634	finally
    //   12627	12634	12627	finally
    //   12627	12634	12627	java/lang/IllegalArgumentException
    //   12627	12634	12627	finally
    //   12627	12634	12634	finally
    //   12699	12706	12706	finally
    //   12699	12706	12699	finally
    //   12699	12706	12706	finally
    //   12700	12706	12699	java/lang/ArithmeticException
    //   12700	12706	12699	finally
    //   13149	13157	13149	finally
    //   13165	13167	3	java/util/NoSuchElementException
  }
  
  public void onEnable() {
    Perry1.3X(this, (int)-509605101L ^ 0xAC44DABA);
  }
  
  public void placeBlock(BlockPos pos) {
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
  
  public boolean lambda$new$0(Boolean paramBoolean) {
    return Perry1.2w(this, (int)612196435L ^ 0x71EE66E6, paramBoolean);
  }
  
  public void setInstance() {
    Perry1.40(this, (int)-1312086322L ^ 0xA3D7C249);
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(UpdateWalkingPlayerEvent event) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\AntiPiston.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */