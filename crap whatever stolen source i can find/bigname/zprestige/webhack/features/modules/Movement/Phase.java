package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Bind;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Phase extends Module {
  public Setting<Bind> right;
  
  public Setting<Integer> tickDelay;
  
  public Setting<Double> speed;
  
  public Setting<Bind> left;
  
  public Setting<Bind> up;
  
  public static Phase INSTANCE;
  
  public Setting<Boolean> twodelay;
  
  public Setting<Bind> down;
  
  public Phase() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -1354933350
    //   9: l2i
    //   10: ldc 737533257
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1765290611
    //   19: l2i
    //   20: ldc 565892157
    //   22: ixor
    //   23: ldc2_w 210898315
    //   26: l2i
    //   27: ldc 152131768
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 3486, -2125736992 -> 16, -1291957117 -> 56
    //   56: aload_0
    //   57: ldc '遹㌒逨㶼徫绡๿蹺'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w 1159953135
    //   68: l2i
    //   69: ldc 1922763954
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1176954683
    //   78: l2i
    //   79: ldc -1645698812
    //   81: ixor
    //   82: ldc2_w 1945781662
    //   85: l2i
    //   86: ldc 635492521
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, 779308918 -> 75, 1638067050 -> 3502
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '遙㌛逪㶤徫纵฿踣̀⢔ਫ嶀'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w -69914707
    //   130: l2i
    //   131: ldc 187195710
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -373513808
    //   140: l2i
    //   141: ldc 483660994
    //   143: ixor
    //   144: ldc2_w -38491515
    //   147: l2i
    //   148: ldc 949041581
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 3496, 810362458 -> 180, 903404987 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w 144138046
    //   192: l2i
    //   193: ldc -613215542
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -87970353
    //   202: l2i
    //   203: ldc 2049138374
    //   205: ixor
    //   206: ldc2_w 1146548005
    //   209: l2i
    //   210: ldc 21622300
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 3420, -1761915699 -> 199, -973213136 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1457520353
    //   246: l2i
    //   247: ldc 1457520352
    //   249: ixor
    //   250: ldc2_w 1928895028
    //   253: l2i
    //   254: ldc 1928895028
    //   256: ixor
    //   257: ldc2_w 415552010
    //   260: l2i
    //   261: ldc 415552010
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w 972089530
    //   273: l2i
    //   274: ldc 1969974871
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1489126462
    //   283: l2i
    //   284: ldc 336396041
    //   286: ixor
    //   287: ldc2_w -1478941776
    //   290: l2i
    //   291: ldc 1024381133
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 3442, -702986166 -> 320, -699632240 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -15270397
    //   332: l2i
    //   333: ldc -272629421
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1315818097
    //   342: l2i
    //   343: ldc -1903437764
    //   345: ixor
    //   346: ldc2_w 185403891
    //   349: l2i
    //   350: ldc -527966070
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -77851095 -> 3428, 997461351 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w 1159679112
    //   390: l2i
    //   391: ldc -1094669393
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 149031137
    //   400: l2i
    //   401: ldc 473051681
    //   403: ixor
    //   404: ldc2_w 478279548
    //   407: l2i
    //   408: ldc 2101419234
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 3414, -1709241159 -> 397, 1964036446 -> 440
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '逛㌷逮㶻徯绬'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w -993698119
    //   456: l2i
    //   457: ldc 34034497
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 1993611634
    //   466: l2i
    //   467: ldc 1052900442
    //   469: ixor
    //   470: ldc2_w -1355062321
    //   473: l2i
    //   474: ldc 2046042328
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -593430505 -> 463, 269307631 -> 3466
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -1987507169
    //   510: l2i
    //   511: ldc -1987507170
    //   513: ixor
    //   514: getstatic Perryc.c : I
    //   517: iflt -> 530
    //   520: ldc2_w 23302582
    //   523: l2i
    //   524: ldc -1513587264
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -1494081532
    //   533: l2i
    //   534: ldc -1866270761
    //   536: ixor
    //   537: ldc2_w -1993917004
    //   540: l2i
    //   541: ldc 1812765779
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 572, 1098927505 -> 3474, 1572055125 -> 530
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.1 : I
    //   578: ifeq -> 591
    //   581: ldc2_w 1434659492
    //   584: l2i
    //   585: ldc 1023786401
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w -746336086
    //   594: l2i
    //   595: ldc -1784206611
    //   597: ixor
    //   598: ldc2_w -462624122
    //   601: l2i
    //   602: ldc -1501018030
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 632, -924945618 -> 591, 711079377 -> 3488
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.0 : I
    //   638: ifle -> 651
    //   641: ldc2_w 1294844485
    //   644: l2i
    //   645: ldc 1646170379
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w 1016679417
    //   654: l2i
    //   655: ldc -1538270541
    //   657: ixor
    //   658: ldc2_w 1193213679
    //   661: l2i
    //   662: ldc 762416503
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 692, 950692337 -> 651, 1163665622 -> 3468
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.0 : I
    //   698: ifle -> 711
    //   701: ldc2_w 1167773905
    //   704: l2i
    //   705: ldc -1921376149
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -1995652201
    //   714: l2i
    //   715: ldc -967060576
    //   717: ixor
    //   718: ldc2_w 691522150
    //   721: l2i
    //   722: ldc 1449260917
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 752, -1929684052 -> 711, -1212756567 -> 3440
    //   752: putfield twodelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 771
    //   761: ldc2_w 1628579230
    //   764: l2i
    //   765: ldc -617782700
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w 498860757
    //   774: l2i
    //   775: ldc 1894219075
    //   777: ixor
    //   778: ldc2_w 1920965517
    //   781: l2i
    //   782: ldc -718265776
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 3406, -904608181 -> 812, 493944343 -> 771
    //   812: aload_0
    //   813: getstatic Perryc.c : I
    //   816: iflt -> 829
    //   819: ldc2_w -1495073051
    //   822: l2i
    //   823: ldc 1326407442
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w -688438813
    //   832: l2i
    //   833: ldc 2035796566
    //   835: ixor
    //   836: ldc2_w -1829504547
    //   839: l2i
    //   840: ldc -923624516
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 872, -1276329066 -> 3438, 2118658861 -> 829
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc '遽㌚逨㶼徊绰๵蹺'
    //   879: getstatic Perryc.0 : I
    //   882: ifle -> 895
    //   885: ldc2_w -477950104
    //   888: l2i
    //   889: ldc 1439330458
    //   891: ixor
    //   892: goto -> 902
    //   895: ldc2_w -1792117558
    //   898: l2i
    //   899: ldc 1086149166
    //   901: ixor
    //   902: ldc2_w -512745955
    //   905: l2i
    //   906: ldc -1333604794
    //   908: ixor
    //   909: ixor
    //   910: lookupswitch default -> 3490, -2073954625 -> 936, -407130199 -> 895
    //   936: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   939: ldc2_w -957658547
    //   942: l2i
    //   943: ldc -957658548
    //   945: ixor
    //   946: getstatic Perryc.c : I
    //   949: iflt -> 962
    //   952: ldc2_w -1657058477
    //   955: l2i
    //   956: ldc -1945807805
    //   958: ixor
    //   959: goto -> 969
    //   962: ldc2_w 538067320
    //   965: l2i
    //   966: ldc -242439893
    //   968: ixor
    //   969: ldc2_w 820067270
    //   972: l2i
    //   973: ldc -1936463781
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 3422, -1387475827 -> 962, 1844198350 -> 1004
    //   1004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1007: ldc2_w 273170672
    //   1010: l2i
    //   1011: ldc 273170672
    //   1013: ixor
    //   1014: getstatic Perryc.0 : I
    //   1017: ifle -> 1030
    //   1020: ldc2_w 53770720
    //   1023: l2i
    //   1024: ldc -129971045
    //   1026: ixor
    //   1027: goto -> 1037
    //   1030: ldc2_w 1587703679
    //   1033: l2i
    //   1034: ldc 956118823
    //   1036: ixor
    //   1037: ldc2_w 1251918434
    //   1040: l2i
    //   1041: ldc 1632024412
    //   1043: ixor
    //   1044: ixor
    //   1045: lookupswitch default -> 3484, -793984955 -> 1030, 1300704614 -> 1072
    //   1072: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1075: ldc2_w 230661381
    //   1078: l2i
    //   1079: ldc 230661421
    //   1081: ixor
    //   1082: getstatic Perryc.1 : I
    //   1085: ifeq -> 1098
    //   1088: ldc2_w 1152009921
    //   1091: l2i
    //   1092: ldc -1331952565
    //   1094: ixor
    //   1095: goto -> 1106
    //   1098: ldc2_w 44654673
    //   1101: l2i
    //   1102: ldc_w -1253058721
    //   1105: ixor
    //   1106: ldc2_w 149413592
    //   1109: l2i
    //   1110: ldc_w -14490639
    //   1113: ixor
    //   1114: ixor
    //   1115: lookupswitch default -> 1140, -764088773 -> 1098, 66289571 -> 3458
    //   1140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1143: getstatic Perryc.1 : I
    //   1146: ifeq -> 1160
    //   1149: ldc2_w 116919290
    //   1152: l2i
    //   1153: ldc_w -997132371
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w 1220896617
    //   1163: l2i
    //   1164: ldc_w -643597248
    //   1167: ixor
    //   1168: ldc2_w -1485959963
    //   1171: l2i
    //   1172: ldc_w 1691635923
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 3416, 30580833 -> 1160, 1390167839 -> 1204
    //   1204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1207: getstatic Perryc.1 : I
    //   1210: ifeq -> 1224
    //   1213: ldc2_w -487150448
    //   1216: l2i
    //   1217: ldc_w -47609774
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w -81608240
    //   1227: l2i
    //   1228: ldc_w 1639288196
    //   1231: ixor
    //   1232: ldc2_w 177410589
    //   1235: l2i
    //   1236: ldc_w 1105060729
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 3408, -774259408 -> 1268, 1418843558 -> 1224
    //   1268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1271: getstatic Perryc.1 : I
    //   1274: ifeq -> 1288
    //   1277: ldc2_w 24267757
    //   1280: l2i
    //   1281: ldc_w -1073764388
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w -658219550
    //   1291: l2i
    //   1292: ldc_w -1086716733
    //   1295: ixor
    //   1296: ldc2_w -1225516150
    //   1299: l2i
    //   1300: ldc_w -1994240597
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 3454, -2124695024 -> 1288, 1479020288 -> 1332
    //   1332: putfield tickDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1335: getstatic Perryc.c : I
    //   1338: iflt -> 1352
    //   1341: ldc2_w 1814997250
    //   1344: l2i
    //   1345: ldc_w 1323395917
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w 1050480323
    //   1355: l2i
    //   1356: ldc_w -1944022904
    //   1359: ixor
    //   1360: ldc2_w 905233975
    //   1363: l2i
    //   1364: ldc_w -1434596790
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 3400, -1119433166 -> 1352, 758420022 -> 1396
    //   1396: aload_0
    //   1397: getstatic Perryc.0 : I
    //   1400: ifle -> 1414
    //   1403: ldc2_w 323626099
    //   1406: l2i
    //   1407: ldc_w 1002406822
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w 257543177
    //   1417: l2i
    //   1418: ldc_w -705110392
    //   1421: ixor
    //   1422: ldc2_w 108258677
    //   1425: l2i
    //   1426: ldc_w -363317451
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1456, -992053867 -> 3446, 1830110807 -> 1414
    //   1456: aload_0
    //   1457: new bigname/zprestige/webhack/features/setting/Setting
    //   1460: dup
    //   1461: ldc_w '遺㌃逮㶲循'
    //   1464: getstatic Perryc.0 : I
    //   1467: ifle -> 1481
    //   1470: ldc2_w 1950714267
    //   1473: l2i
    //   1474: ldc_w 1318086650
    //   1477: ixor
    //   1478: goto -> 1489
    //   1481: ldc2_w 59609011
    //   1484: l2i
    //   1485: ldc_w 1669971264
    //   1488: ixor
    //   1489: ldc2_w 653667914
    //   1492: l2i
    //   1493: ldc_w -1748391826
    //   1496: ixor
    //   1497: ixor
    //   1498: lookupswitch default -> 1524, -1947572155 -> 3460, 628651160 -> 1481
    //   1524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1527: ldc2_w 0.03358730075264565
    //   1530: invokestatic doubleToLongBits : (D)J
    //   1533: ldc2_w 9203442679069165943
    //   1536: lxor
    //   1537: invokestatic longBitsToDouble : (J)D
    //   1540: getstatic Perryc.c : I
    //   1543: iflt -> 1557
    //   1546: ldc2_w -1298271306
    //   1549: l2i
    //   1550: ldc_w 405075640
    //   1553: ixor
    //   1554: goto -> 1565
    //   1557: ldc2_w 560180595
    //   1560: l2i
    //   1561: ldc_w 1963049580
    //   1564: ixor
    //   1565: ldc2_w 836695904
    //   1568: l2i
    //   1569: ldc_w 1385532793
    //   1572: ixor
    //   1573: ixor
    //   1574: lookupswitch default -> 1600, -906854633 -> 3494, -323068015 -> 1557
    //   1600: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1603: ldc2_w 9.414638698752047E307
    //   1606: invokestatic doubleToLongBits : (D)J
    //   1609: ldc2_w 9214578368222903045
    //   1612: lxor
    //   1613: invokestatic longBitsToDouble : (J)D
    //   1616: getstatic Perryc.0 : I
    //   1619: ifle -> 1633
    //   1622: ldc2_w -7452452
    //   1625: l2i
    //   1626: ldc_w -371512181
    //   1629: ixor
    //   1630: goto -> 1641
    //   1633: ldc2_w -819626961
    //   1636: l2i
    //   1637: ldc_w -1538909526
    //   1640: ixor
    //   1641: ldc2_w -923218869
    //   1644: l2i
    //   1645: ldc_w 1512037655
    //   1648: ixor
    //   1649: ixor
    //   1650: lookupswitch default -> 3450, -2068679413 -> 1633, -108759079 -> 1676
    //   1676: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1679: ldc2_w 0.22220365968905356
    //   1682: invokestatic doubleToLongBits : (D)J
    //   1685: ldc2_w 9211111569083416433
    //   1688: lxor
    //   1689: invokestatic longBitsToDouble : (J)D
    //   1692: getstatic Perryc.1 : I
    //   1695: ifeq -> 1709
    //   1698: ldc2_w -2101109625
    //   1701: l2i
    //   1702: ldc_w 1600818363
    //   1705: ixor
    //   1706: goto -> 1717
    //   1709: ldc2_w 1097704905
    //   1712: l2i
    //   1713: ldc_w 236868717
    //   1716: ixor
    //   1717: ldc2_w -1849781164
    //   1720: l2i
    //   1721: ldc_w 1830054845
    //   1724: ixor
    //   1725: ixor
    //   1726: lookupswitch default -> 3410, -1277620659 -> 1752, 553906133 -> 1709
    //   1752: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1755: getstatic Perryc.1 : I
    //   1758: ifeq -> 1772
    //   1761: ldc2_w -898035119
    //   1764: l2i
    //   1765: ldc_w 217414952
    //   1768: ixor
    //   1769: goto -> 1780
    //   1772: ldc2_w -1743162817
    //   1775: l2i
    //   1776: ldc_w -2074086065
    //   1779: ixor
    //   1780: ldc2_w 1907883434
    //   1783: l2i
    //   1784: ldc_w -1541538747
    //   1787: ixor
    //   1788: ixor
    //   1789: lookupswitch default -> 3470, -907245921 -> 1816, 321285782 -> 1772
    //   1816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1819: getstatic Perryc.0 : I
    //   1822: ifle -> 1836
    //   1825: ldc2_w -343587704
    //   1828: l2i
    //   1829: ldc_w 618576001
    //   1832: ixor
    //   1833: goto -> 1844
    //   1836: ldc2_w 436498452
    //   1839: l2i
    //   1840: ldc_w -505128740
    //   1843: ixor
    //   1844: ldc2_w -1209510603
    //   1847: l2i
    //   1848: ldc_w 1681358814
    //   1851: ixor
    //   1852: ixor
    //   1853: lookupswitch default -> 3412, 478467810 -> 1836, 675217955 -> 1880
    //   1880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1883: getstatic Perryc.c : I
    //   1886: iflt -> 1900
    //   1889: ldc2_w -1468291268
    //   1892: l2i
    //   1893: ldc_w 144248632
    //   1896: ixor
    //   1897: goto -> 1908
    //   1900: ldc2_w 1348422296
    //   1903: l2i
    //   1904: ldc_w -306145928
    //   1907: ixor
    //   1908: ldc2_w -779223362
    //   1911: l2i
    //   1912: ldc_w 1621761126
    //   1915: ixor
    //   1916: ixor
    //   1917: lookupswitch default -> 3402, 213400888 -> 1944, 298142428 -> 1900
    //   1944: putfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1947: getstatic Perryc.0 : I
    //   1950: ifle -> 1964
    //   1953: ldc2_w -1084872488
    //   1956: l2i
    //   1957: ldc_w 1093987605
    //   1960: ixor
    //   1961: goto -> 1972
    //   1964: ldc2_w -1754305234
    //   1967: l2i
    //   1968: ldc_w 675039111
    //   1971: ixor
    //   1972: ldc2_w -37618836
    //   1975: l2i
    //   1976: ldc_w 1021050140
    //   1979: ixor
    //   1980: ixor
    //   1981: lookupswitch default -> 3498, 1064879037 -> 1964, 2118724825 -> 2008
    //   2008: aload_0
    //   2009: new bigname/zprestige/webhack/features/setting/Setting
    //   2012: dup
    //   2013: ldc_w '遥㌖逭㶣'
    //   2016: getstatic Perryc.1 : I
    //   2019: ifeq -> 2033
    //   2022: ldc2_w 1592336156
    //   2025: l2i
    //   2026: ldc_w 478986678
    //   2029: ixor
    //   2030: goto -> 2041
    //   2033: ldc2_w 86541914
    //   2036: l2i
    //   2037: ldc_w -1832664605
    //   2040: ixor
    //   2041: ldc2_w 1127779424
    //   2044: l2i
    //   2045: ldc_w 2004802591
    //   2048: ixor
    //   2049: ixor
    //   2050: lookupswitch default -> 3462, -1548937274 -> 2076, 1982041813 -> 2033
    //   2076: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2079: ldc2_w 675652225
    //   2082: l2i
    //   2083: ldc_w 675652170
    //   2086: ixor
    //   2087: getstatic Perryc.0 : I
    //   2090: ifle -> 2104
    //   2093: ldc2_w -1800707064
    //   2096: l2i
    //   2097: ldc_w -638585696
    //   2100: ixor
    //   2101: goto -> 2112
    //   2104: ldc2_w -2049108124
    //   2107: l2i
    //   2108: ldc_w 1381984997
    //   2111: ixor
    //   2112: ldc2_w -208112451
    //   2115: l2i
    //   2116: ldc_w 480962610
    //   2119: ixor
    //   2120: ixor
    //   2121: lookupswitch default -> 2148, -1569321945 -> 3478, 1960736241 -> 2104
    //   2148: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2151: getstatic Perryc.1 : I
    //   2154: ifeq -> 2168
    //   2157: ldc2_w -657435640
    //   2160: l2i
    //   2161: ldc_w 677753472
    //   2164: ixor
    //   2165: goto -> 2176
    //   2168: ldc2_w -812873991
    //   2171: l2i
    //   2172: ldc_w -1836200973
    //   2175: ixor
    //   2176: ldc2_w -82290864
    //   2179: l2i
    //   2180: ldc_w -1190718652
    //   2183: ixor
    //   2184: ixor
    //   2185: lookupswitch default -> 2212, -1297440100 -> 3448, 2111265452 -> 2168
    //   2212: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2215: getstatic Perryc.0 : I
    //   2218: ifle -> 2232
    //   2221: ldc2_w 1113496270
    //   2224: l2i
    //   2225: ldc_w -819866826
    //   2228: ixor
    //   2229: goto -> 2240
    //   2232: ldc2_w -1368762882
    //   2235: l2i
    //   2236: ldc_w -2099805413
    //   2239: ixor
    //   2240: ldc2_w -2109651973
    //   2243: l2i
    //   2244: ldc_w 1969752946
    //   2247: ixor
    //   2248: ixor
    //   2249: lookupswitch default -> 3404, -611017108 -> 2276, 2052456817 -> 2232
    //   2276: putfield left : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2279: getstatic Perryc.c : I
    //   2282: iflt -> 2296
    //   2285: ldc2_w -1772240149
    //   2288: l2i
    //   2289: ldc_w 395091921
    //   2292: ixor
    //   2293: goto -> 2304
    //   2296: ldc2_w 123504819
    //   2299: l2i
    //   2300: ldc_w 897141267
    //   2303: ixor
    //   2304: ldc2_w 113870391
    //   2307: l2i
    //   2308: ldc_w -1296951532
    //   2311: ixor
    //   2312: ixor
    //   2313: lookupswitch default -> 2340, -1275557086 -> 2296, 900385817 -> 3444
    //   2340: aload_0
    //   2341: new bigname/zprestige/webhack/features/setting/Setting
    //   2344: dup
    //   2345: ldc_w '遻㌚逬㶿徺'
    //   2348: getstatic Perryc.0 : I
    //   2351: ifle -> 2365
    //   2354: ldc2_w -1092218068
    //   2357: l2i
    //   2358: ldc_w -1665492272
    //   2361: ixor
    //   2362: goto -> 2373
    //   2365: ldc2_w -794177335
    //   2368: l2i
    //   2369: ldc_w 2108640879
    //   2372: ixor
    //   2373: ldc2_w 1556913454
    //   2376: l2i
    //   2377: ldc_w -644687972
    //   2380: ixor
    //   2381: ixor
    //   2382: lookupswitch default -> 2408, -1492991154 -> 3426, -912963262 -> 2365
    //   2408: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2411: ldc2_w -205204092
    //   2414: l2i
    //   2415: ldc_w -205204151
    //   2418: ixor
    //   2419: getstatic Perryc.1 : I
    //   2422: ifeq -> 2436
    //   2425: ldc2_w -421475459
    //   2428: l2i
    //   2429: ldc_w -83800248
    //   2432: ixor
    //   2433: goto -> 2444
    //   2436: ldc2_w 1133150054
    //   2439: l2i
    //   2440: ldc_w 1989672151
    //   2443: ixor
    //   2444: ldc2_w -689887962
    //   2447: l2i
    //   2448: ldc_w -753647262
    //   2451: ixor
    //   2452: ixor
    //   2453: lookupswitch default -> 2480, -118309546 -> 2436, 404021361 -> 3456
    //   2480: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2483: getstatic Perryc.1 : I
    //   2486: ifeq -> 2500
    //   2489: ldc2_w 294988730
    //   2492: l2i
    //   2493: ldc_w 252018096
    //   2496: ixor
    //   2497: goto -> 2508
    //   2500: ldc2_w -256307884
    //   2503: l2i
    //   2504: ldc_w -1939099584
    //   2507: ixor
    //   2508: ldc2_w 1582710295
    //   2511: l2i
    //   2512: ldc_w -693809034
    //   2515: ixor
    //   2516: ixor
    //   2517: lookupswitch default -> 3480, -1771882389 -> 2500, -199109771 -> 2544
    //   2544: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2547: getstatic Perryc.0 : I
    //   2550: ifle -> 2564
    //   2553: ldc2_w -105701420
    //   2556: l2i
    //   2557: ldc_w -611227590
    //   2560: ixor
    //   2561: goto -> 2572
    //   2564: ldc2_w -1618155584
    //   2567: l2i
    //   2568: ldc_w 1840154971
    //   2571: ixor
    //   2572: ldc2_w -214486883
    //   2575: l2i
    //   2576: ldc_w -804283183
    //   2579: ixor
    //   2580: ixor
    //   2581: lookupswitch default -> 3476, -786775337 -> 2608, 18537378 -> 2564
    //   2608: putfield right : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2611: getstatic Perryc.1 : I
    //   2614: ifeq -> 2628
    //   2617: ldc2_w -1003914202
    //   2620: l2i
    //   2621: ldc_w 1283155513
    //   2624: ixor
    //   2625: goto -> 2636
    //   2628: ldc2_w -1594982687
    //   2631: l2i
    //   2632: ldc_w 964282159
    //   2635: ixor
    //   2636: ldc2_w -1986953079
    //   2639: l2i
    //   2640: ldc_w 564285927
    //   2643: ixor
    //   2644: ixor
    //   2645: lookupswitch default -> 3464, 543279985 -> 2628, 832858272 -> 2672
    //   2672: aload_0
    //   2673: new bigname/zprestige/webhack/features/setting/Setting
    //   2676: dup
    //   2677: ldc_w '遭㌜逼㶹'
    //   2680: getstatic Perryc.1 : I
    //   2683: ifeq -> 2697
    //   2686: ldc2_w -1474730830
    //   2689: l2i
    //   2690: ldc_w -142460743
    //   2693: ixor
    //   2694: goto -> 2705
    //   2697: ldc2_w 728965630
    //   2700: l2i
    //   2701: ldc_w 1386326680
    //   2704: ixor
    //   2705: ldc2_w 1865891912
    //   2708: l2i
    //   2709: ldc_w -470616148
    //   2712: ixor
    //   2713: ixor
    //   2714: lookupswitch default -> 2740, -900529860 -> 2697, -748753937 -> 3430
    //   2740: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2743: ldc2_w -629037151
    //   2746: l2i
    //   2747: ldc_w -629037199
    //   2750: ixor
    //   2751: getstatic Perryc.1 : I
    //   2754: ifeq -> 2768
    //   2757: ldc2_w -663827717
    //   2760: l2i
    //   2761: ldc_w -39520955
    //   2764: ixor
    //   2765: goto -> 2776
    //   2768: ldc2_w -1194713375
    //   2771: l2i
    //   2772: ldc_w -1854816627
    //   2775: ixor
    //   2776: ldc2_w -1007601733
    //   2779: l2i
    //   2780: ldc_w -1236070590
    //   2783: ixor
    //   2784: ixor
    //   2785: lookupswitch default -> 2812, 1337568970 -> 2768, 1348994887 -> 3452
    //   2812: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2815: getstatic Perryc.c : I
    //   2818: iflt -> 2832
    //   2821: ldc2_w 174672213
    //   2824: l2i
    //   2825: ldc_w 1559692723
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w 1326735221
    //   2835: l2i
    //   2836: ldc_w 1994401543
    //   2839: ixor
    //   2840: ldc2_w -829232724
    //   2843: l2i
    //   2844: ldc_w -195681205
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 3436, 53523861 -> 2876, 1817870593 -> 2832
    //   2876: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2879: getstatic Perryc.0 : I
    //   2882: ifle -> 2896
    //   2885: ldc2_w 698726188
    //   2888: l2i
    //   2889: ldc_w 2058810954
    //   2892: ixor
    //   2893: goto -> 2904
    //   2896: ldc2_w 523384993
    //   2899: l2i
    //   2900: ldc_w 959423722
    //   2903: ixor
    //   2904: ldc2_w -531392429
    //   2907: l2i
    //   2908: ldc_w 1994254611
    //   2911: ixor
    //   2912: ixor
    //   2913: lookupswitch default -> 2940, -979554266 -> 3492, 212885417 -> 2896
    //   2940: putfield down : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2943: getstatic Perryc.1 : I
    //   2946: ifeq -> 2960
    //   2949: ldc2_w -541279908
    //   2952: l2i
    //   2953: ldc_w -2110629730
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w -536759005
    //   2963: l2i
    //   2964: ldc_w -1664137779
    //   2967: ixor
    //   2968: ldc2_w -928292038
    //   2971: l2i
    //   2972: ldc_w -814206734
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 3432, 1516089866 -> 2960, 2065539878 -> 3004
    //   3004: aload_0
    //   3005: new bigname/zprestige/webhack/features/setting/Setting
    //   3008: dup
    //   3009: ldc_w '遼㌃'
    //   3012: getstatic Perryc.c : I
    //   3015: iflt -> 3029
    //   3018: ldc2_w -1658184410
    //   3021: l2i
    //   3022: ldc_w -209776850
    //   3025: ixor
    //   3026: goto -> 3037
    //   3029: ldc2_w -1251869303
    //   3032: l2i
    //   3033: ldc_w -1725496333
    //   3036: ixor
    //   3037: ldc2_w -1644822055
    //   3040: l2i
    //   3041: ldc_w -1282388441
    //   3044: ixor
    //   3045: ixor
    //   3046: lookupswitch default -> 3434, 35697028 -> 3072, 1077108214 -> 3029
    //   3072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3075: ldc2_w -21337119
    //   3078: l2i
    //   3079: ldc_w -21337303
    //   3082: ixor
    //   3083: getstatic Perryc.0 : I
    //   3086: ifle -> 3100
    //   3089: ldc2_w -538285234
    //   3092: l2i
    //   3093: ldc_w 2035281982
    //   3096: ixor
    //   3097: goto -> 3108
    //   3100: ldc2_w -1498711662
    //   3103: l2i
    //   3104: ldc_w -1070320613
    //   3107: ixor
    //   3108: ldc2_w 432210194
    //   3111: l2i
    //   3112: ldc_w 158103111
    //   3115: ixor
    //   3116: ixor
    //   3117: lookupswitch default -> 3500, -1240798171 -> 3100, 1982872284 -> 3144
    //   3144: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3147: getstatic Perryc.c : I
    //   3150: iflt -> 3164
    //   3153: ldc2_w 1023893292
    //   3156: l2i
    //   3157: ldc_w 1116105405
    //   3160: ixor
    //   3161: goto -> 3172
    //   3164: ldc2_w 1575224246
    //   3167: l2i
    //   3168: ldc_w -129268821
    //   3171: ixor
    //   3172: ldc2_w -610838188
    //   3175: l2i
    //   3176: ldc_w -1533354593
    //   3179: ixor
    //   3180: ixor
    //   3181: lookupswitch default -> 3418, -626916138 -> 3208, 9220442 -> 3164
    //   3208: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3211: getstatic Perryc.0 : I
    //   3214: ifle -> 3228
    //   3217: ldc2_w -110526258
    //   3220: l2i
    //   3221: ldc_w -195483785
    //   3224: ixor
    //   3225: goto -> 3236
    //   3228: ldc2_w 306290165
    //   3231: l2i
    //   3232: ldc_w -399832047
    //   3235: ixor
    //   3236: ldc2_w 614325362
    //   3239: l2i
    //   3240: ldc_w -1266288659
    //   3243: ixor
    //   3244: ixor
    //   3245: lookupswitch default -> 3482, -1658287066 -> 3228, 1785903739 -> 3272
    //   3272: putfield up : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3275: getstatic Perryc.0 : I
    //   3278: ifle -> 3292
    //   3281: ldc2_w -1472114128
    //   3284: l2i
    //   3285: ldc_w 324903950
    //   3288: ixor
    //   3289: goto -> 3300
    //   3292: ldc2_w 1825991449
    //   3295: l2i
    //   3296: ldc_w -345129344
    //   3299: ixor
    //   3300: ldc2_w 1098681162
    //   3303: l2i
    //   3304: ldc_w 620012893
    //   3307: ixor
    //   3308: ixor
    //   3309: lookupswitch default -> 3424, -560670679 -> 3292, -499909746 -> 3336
    //   3336: aload_0
    //   3337: getstatic Perryc.0 : I
    //   3340: ifle -> 3354
    //   3343: ldc2_w 1600812267
    //   3346: l2i
    //   3347: ldc_w 326140501
    //   3350: ixor
    //   3351: goto -> 3362
    //   3354: ldc2_w -782626511
    //   3357: l2i
    //   3358: ldc_w 1253081161
    //   3361: ixor
    //   3362: ldc2_w 1014526702
    //   3365: l2i
    //   3366: ldc_w 1279654785
    //   3369: ixor
    //   3370: ixor
    //   3371: lookupswitch default -> 3396, 1009221585 -> 3472, 1104975421 -> 3354
    //   3396: invokespecial setInstance : ()V
    //   3399: return
    //   3400: aconst_null
    //   3401: athrow
    //   3402: aconst_null
    //   3403: athrow
    //   3404: aconst_null
    //   3405: athrow
    //   3406: aconst_null
    //   3407: athrow
    //   3408: aconst_null
    //   3409: athrow
    //   3410: aconst_null
    //   3411: athrow
    //   3412: aconst_null
    //   3413: athrow
    //   3414: aconst_null
    //   3415: athrow
    //   3416: aconst_null
    //   3417: athrow
    //   3418: aconst_null
    //   3419: athrow
    //   3420: aconst_null
    //   3421: athrow
    //   3422: aconst_null
    //   3423: athrow
    //   3424: aconst_null
    //   3425: athrow
    //   3426: aconst_null
    //   3427: athrow
    //   3428: aconst_null
    //   3429: athrow
    //   3430: aconst_null
    //   3431: athrow
    //   3432: aconst_null
    //   3433: athrow
    //   3434: aconst_null
    //   3435: athrow
    //   3436: aconst_null
    //   3437: athrow
    //   3438: aconst_null
    //   3439: athrow
    //   3440: aconst_null
    //   3441: athrow
    //   3442: aconst_null
    //   3443: athrow
    //   3444: aconst_null
    //   3445: athrow
    //   3446: aconst_null
    //   3447: athrow
    //   3448: aconst_null
    //   3449: athrow
    //   3450: aconst_null
    //   3451: athrow
    //   3452: aconst_null
    //   3453: athrow
    //   3454: aconst_null
    //   3455: athrow
    //   3456: aconst_null
    //   3457: athrow
    //   3458: aconst_null
    //   3459: athrow
    //   3460: aconst_null
    //   3461: athrow
    //   3462: aconst_null
    //   3463: athrow
    //   3464: aconst_null
    //   3465: athrow
    //   3466: aconst_null
    //   3467: athrow
    //   3468: aconst_null
    //   3469: athrow
    //   3470: aconst_null
    //   3471: athrow
    //   3472: aconst_null
    //   3473: athrow
    //   3474: aconst_null
    //   3475: athrow
    //   3476: aconst_null
    //   3477: athrow
    //   3478: aconst_null
    //   3479: athrow
    //   3480: aconst_null
    //   3481: athrow
    //   3482: aconst_null
    //   3483: athrow
    //   3484: aconst_null
    //   3485: athrow
    //   3486: aconst_null
    //   3487: athrow
    //   3488: aconst_null
    //   3489: athrow
    //   3490: aconst_null
    //   3491: athrow
    //   3492: aconst_null
    //   3493: athrow
    //   3494: aconst_null
    //   3495: athrow
    //   3496: aconst_null
    //   3497: athrow
    //   3498: aconst_null
    //   3499: athrow
    //   3500: aconst_null
    //   3501: athrow
    //   3502: aconst_null
    //   3503: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3400	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Phase;
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Movement/Phase
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 21
    //   10: ldc2_w -1197636507
    //   13: l2i
    //   14: ldc_w 50681927
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w -674256015
    //   24: l2i
    //   25: ldc_w -496090346
    //   28: ixor
    //   29: ldc2_w -979994844
    //   32: l2i
    //   33: ldc_w 257070435
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 134, -10155488 -> 64, 1901870693 -> 21
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w 2019542114
    //   76: l2i
    //   77: ldc_w -1611765090
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w 1534990073
    //   87: l2i
    //   88: ldc_w -720120977
    //   91: ixor
    //   92: ldc2_w 1701179158
    //   95: l2i
    //   96: ldc_w 352794517
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 132, -1747749249 -> 84, -32563947 -> 128
    //   128: putstatic bigname/zprestige/webhack/features/modules/Movement/Phase.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Phase;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  @SubscribeEvent
  public void onPacketReceive(PacketEvent.Receive paramReceive) {
    Perry1.4S(this, (int)1566283770L ^ 0x594F0314, paramReceive);
  }
  
  public static Phase getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 387967803
    //   33: l2i
    //   34: ldc_w 439222753
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1402501074
    //   44: l2i
    //   45: ldc_w -2119804512
    //   48: ixor
    //   49: ldc2_w -904635486
    //   52: l2i
    //   53: ldc_w -635230977
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 350, -1039576785 -> 84, 486970759 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Phase;
    //   87: ifnonnull -> 101
    //   90: ldc2_w 497250369
    //   93: l2i
    //   94: ldc_w 2020967376
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -2038668053
    //   104: l2i
    //   105: ldc_w -475359363
    //   108: ixor
    //   109: ldc2_w -1431607091
    //   112: l2i
    //   113: ldc_w 905154663
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, -91354309 -> 140, -91354308 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Movement/Phase
    //   143: dup
    //   144: getstatic Perryc.1 : I
    //   147: ifeq -> 161
    //   150: ldc2_w 1296080654
    //   153: l2i
    //   154: ldc_w 617573922
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 536207936
    //   164: l2i
    //   165: ldc_w 322109278
    //   168: ixor
    //   169: ldc2_w 338017633
    //   172: l2i
    //   173: ldc_w -690268848
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 344, -1418651363 -> 161, -835062481 -> 204
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w 1452707844
    //   224: l2i
    //   225: ldc_w -1149838842
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1192492232
    //   235: l2i
    //   236: ldc_w 1458872531
    //   239: ixor
    //   240: ldc2_w -1975595949
    //   243: l2i
    //   244: ldc_w 716843786
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 348, 1298443611 -> 232, 1318864050 -> 276
    //   276: putstatic bigname/zprestige/webhack/features/modules/Movement/Phase.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Phase;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w 678863660
    //   288: l2i
    //   289: ldc_w 1439230289
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -453584504
    //   299: l2i
    //   300: ldc_w -1959380906
    //   303: ixor
    //   304: ldc2_w -355279093
    //   307: l2i
    //   308: ldc_w 1555426668
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 346, -874940390 -> 296, -643312711 -> 340
    //   340: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Phase;
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
    //   8	20	361	java/lang/ArrayIndexOutOfBoundsException
    //   207	214	214	finally
    //   207	214	207	finally
    //   208	214	207	finally
    //   208	214	3	finally
    //   208	214	214	finally
    //   361	369	361	java/lang/RuntimeException
    //   377	379	3	finally
  }
  
  public void onDisable() {
    Perry1.3C(this, (int)831112849L ^ 0x40E991E2);
  }
  
  public static BlockPos getPlayerPos() {
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
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 17473
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 17465
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 17457
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc_w 187847305
    //   27: i2l
    //   28: ldc2_w 187847305
    //   31: lxor
    //   32: getstatic Perryc.1 : I
    //   35: ifeq -> 49
    //   38: ldc2_w -259554632
    //   41: l2i
    //   42: ldc_w -1747906722
    //   45: ixor
    //   46: goto -> 57
    //   49: ldc2_w 2038646100
    //   52: l2i
    //   53: ldc_w 400463052
    //   56: ixor
    //   57: ldc2_w -247396514
    //   60: l2i
    //   61: ldc_w 1553628731
    //   64: ixor
    //   65: ixor
    //   66: lookupswitch default -> 92, -896666493 -> 17378, 1047228237 -> 49
    //   92: lstore_1
    //   93: getstatic Perryc.0 : I
    //   96: ifle -> 110
    //   99: ldc2_w -1024290291
    //   102: l2i
    //   103: ldc_w -123715077
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w 542279943
    //   113: l2i
    //   114: ldc_w 750433495
    //   117: ixor
    //   118: ldc2_w -99111659
    //   121: l2i
    //   122: ldc_w 1942612468
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 152, -1282631913 -> 17098, -879266919 -> 110
    //   152: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w -1449643482
    //   164: l2i
    //   165: ldc_w -1565236319
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 1608061144
    //   175: l2i
    //   176: ldc_w 538671531
    //   179: ixor
    //   180: ldc2_w 743812561
    //   183: l2i
    //   184: ldc_w -327323733
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 17128, -1075139831 -> 216, -888892419 -> 172
    //   216: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   219: ldc2_w -2044708498
    //   222: l2i
    //   223: ldc_w -2044708497
    //   226: ixor
    //   227: getstatic Perryc.1 : I
    //   230: ifeq -> 244
    //   233: ldc2_w 859948140
    //   236: l2i
    //   237: ldc_w -1630904425
    //   240: ixor
    //   241: goto -> 252
    //   244: ldc2_w -1534257677
    //   247: l2i
    //   248: ldc_w -64248511
    //   251: ixor
    //   252: ldc2_w 1338981272
    //   255: l2i
    //   256: ldc_w 1929683220
    //   259: ixor
    //   260: ixor
    //   261: lookupswitch default -> 288, -1858076297 -> 17110, 1162188070 -> 244
    //   288: putfield field_70145_X : Z
    //   291: getstatic Perryc.1 : I
    //   294: ifeq -> 308
    //   297: ldc2_w -2002334239
    //   300: l2i
    //   301: ldc_w 1878821475
    //   304: ixor
    //   305: goto -> 316
    //   308: ldc2_w -2072985118
    //   311: l2i
    //   312: ldc_w -2011947463
    //   315: ixor
    //   316: ldc2_w -1914025238
    //   319: l2i
    //   320: ldc_w 1433055509
    //   323: ixor
    //   324: ixor
    //   325: lookupswitch default -> 17418, -723246044 -> 352, 1071299709 -> 308
    //   352: aload_0
    //   353: getstatic Perryc.0 : I
    //   356: ifle -> 370
    //   359: ldc2_w -873182621
    //   362: l2i
    //   363: ldc_w -212506463
    //   366: ixor
    //   367: goto -> 378
    //   370: ldc2_w 710763543
    //   373: l2i
    //   374: ldc_w 341125107
    //   377: ixor
    //   378: ldc2_w 495168527
    //   381: l2i
    //   382: ldc_w -1045894857
    //   385: ixor
    //   386: ixor
    //   387: lookupswitch default -> 412, -460691462 -> 17112, 764287728 -> 370
    //   412: getfield tickDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   415: getstatic Perryc.c : I
    //   418: iflt -> 432
    //   421: ldc2_w 330346594
    //   424: l2i
    //   425: ldc_w 1319899556
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w 1215021031
    //   435: l2i
    //   436: ldc_w -1197848445
    //   439: ixor
    //   440: ldc2_w -1016896791
    //   443: l2i
    //   444: ldc_w 2048048602
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 476, -981845506 -> 432, -462586123 -> 17244
    //   476: goto -> 480
    //   479: athrow
    //   480: invokevirtual getValue : ()Ljava/lang/Object;
    //   483: goto -> 487
    //   486: athrow
    //   487: checkcast java/lang/Integer
    //   490: getstatic Perryc.1 : I
    //   493: ifeq -> 507
    //   496: ldc2_w 620660875
    //   499: l2i
    //   500: ldc_w 140989043
    //   503: ixor
    //   504: goto -> 515
    //   507: ldc2_w 607854536
    //   510: l2i
    //   511: ldc_w 1820245726
    //   514: ixor
    //   515: ldc2_w 874983517
    //   518: l2i
    //   519: ldc_w -14423285
    //   522: ixor
    //   523: ixor
    //   524: lookupswitch default -> 17410, -2092860864 -> 552, -409140818 -> 507
    //   552: goto -> 556
    //   555: athrow
    //   556: invokevirtual intValue : ()I
    //   559: goto -> 563
    //   562: athrow
    //   563: ifle -> 577
    //   566: ldc2_w 1538202633
    //   569: l2i
    //   570: ldc_w -1637542658
    //   573: ixor
    //   574: goto -> 585
    //   577: ldc2_w 700306345
    //   580: l2i
    //   581: ldc_w -327689391
    //   584: ixor
    //   585: ldc2_w -28008552
    //   588: l2i
    //   589: ldc_w 1172676008
    //   592: ixor
    //   593: ixor
    //   594: tableswitch default -> 566, 2121992903 -> 616, 2121992904 -> 1457
    //   616: getstatic Perryc.c : I
    //   619: iflt -> 633
    //   622: ldc2_w -1136000952
    //   625: l2i
    //   626: ldc_w -736190126
    //   629: ixor
    //   630: goto -> 641
    //   633: ldc2_w -446569728
    //   636: l2i
    //   637: ldc_w -398549566
    //   640: ixor
    //   641: ldc2_w 396738774
    //   644: l2i
    //   645: ldc_w -623036761
    //   648: ixor
    //   649: ixor
    //   650: lookupswitch default -> 17064, -1523820693 -> 633, -1071150925 -> 676
    //   676: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w 184968202
    //   688: l2i
    //   689: ldc_w 901932906
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -488310326
    //   699: l2i
    //   700: ldc_w -2041200699
    //   703: ixor
    //   704: ldc2_w -1282910187
    //   707: l2i
    //   708: ldc_w 955449722
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 17158, -1245750769 -> 696, -271966368 -> 740
    //   740: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   743: getstatic Perryc.1 : I
    //   746: ifeq -> 760
    //   749: ldc2_w 568637592
    //   752: l2i
    //   753: ldc_w -80936074
    //   756: ixor
    //   757: goto -> 768
    //   760: ldc2_w 760936763
    //   763: l2i
    //   764: ldc_w 2004559208
    //   767: ixor
    //   768: ldc2_w 800377188
    //   771: l2i
    //   772: ldc_w -1172055161
    //   775: ixor
    //   776: ixor
    //   777: lookupswitch default -> 804, -1158074450 -> 760, 1331603725 -> 17082
    //   804: getfield field_70173_aa : I
    //   807: getstatic Perryc.0 : I
    //   810: ifle -> 824
    //   813: ldc2_w -652072172
    //   816: l2i
    //   817: ldc_w -1364312266
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -2105589942
    //   827: l2i
    //   828: ldc_w 610858603
    //   831: ixor
    //   832: ldc2_w -60398108
    //   835: l2i
    //   836: ldc_w -1678810713
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 868, 268767329 -> 17068, 777926950 -> 824
    //   868: aload_0
    //   869: getstatic Perryc.1 : I
    //   872: ifeq -> 886
    //   875: ldc2_w -1064215096
    //   878: l2i
    //   879: ldc_w 847267375
    //   882: ixor
    //   883: goto -> 894
    //   886: ldc2_w -2025114145
    //   889: l2i
    //   890: ldc_w 151128195
    //   893: ixor
    //   894: ldc2_w -116938645
    //   897: l2i
    //   898: ldc_w -911946400
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, -1028489492 -> 17002, 623757851 -> 886
    //   928: getfield tickDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   931: getstatic Perryc.c : I
    //   934: iflt -> 948
    //   937: ldc2_w -1836850379
    //   940: l2i
    //   941: ldc_w 1840330311
    //   944: ixor
    //   945: goto -> 956
    //   948: ldc2_w 1753102038
    //   951: l2i
    //   952: ldc_w 1510919266
    //   955: ixor
    //   956: ldc2_w -1573658749
    //   959: l2i
    //   960: ldc_w -1876674750
    //   963: ixor
    //   964: ixor
    //   965: lookupswitch default -> 17218, -853197389 -> 948, 6754933 -> 992
    //   992: goto -> 996
    //   995: athrow
    //   996: invokevirtual getValue : ()Ljava/lang/Object;
    //   999: goto -> 1003
    //   1002: athrow
    //   1003: checkcast java/lang/Integer
    //   1006: getstatic Perryc.c : I
    //   1009: iflt -> 1023
    //   1012: ldc2_w -2078631806
    //   1015: l2i
    //   1016: ldc_w 1768490658
    //   1019: ixor
    //   1020: goto -> 1031
    //   1023: ldc2_w -1082723949
    //   1026: l2i
    //   1027: ldc_w 573130665
    //   1030: ixor
    //   1031: ldc2_w -2008705984
    //   1034: l2i
    //   1035: ldc_w 848412582
    //   1038: ixor
    //   1039: ixor
    //   1040: lookupswitch default -> 1068, 601000956 -> 1023, 1470608838 -> 17220
    //   1068: goto -> 1072
    //   1071: athrow
    //   1072: invokevirtual intValue : ()I
    //   1075: goto -> 1079
    //   1078: athrow
    //   1079: irem
    //   1080: ifeq -> 1094
    //   1083: ldc2_w 1840241775
    //   1086: l2i
    //   1087: ldc_w -308842123
    //   1090: ixor
    //   1091: goto -> 1102
    //   1094: ldc2_w 365704462
    //   1097: l2i
    //   1098: ldc_w -1779132393
    //   1101: ixor
    //   1102: ldc2_w 364147273
    //   1105: l2i
    //   1106: ldc_w -1102070170
    //   1109: ixor
    //   1110: ixor
    //   1111: tableswitch default -> 1083, 734224693 -> 1132, 734224694 -> 1457
    //   1132: getstatic Perryc.0 : I
    //   1135: ifle -> 1149
    //   1138: ldc2_w 342203549
    //   1141: l2i
    //   1142: ldc_w -346220345
    //   1145: ixor
    //   1146: goto -> 1157
    //   1149: ldc2_w 914883619
    //   1152: l2i
    //   1153: ldc_w -1683859534
    //   1156: ixor
    //   1157: ldc2_w -1227801968
    //   1160: l2i
    //   1161: ldc_w 2040017653
    //   1164: ixor
    //   1165: ixor
    //   1166: lookupswitch default -> 1192, 601851000 -> 1149, 812747839 -> 17320
    //   1192: aload_0
    //   1193: getstatic Perryc.0 : I
    //   1196: ifle -> 1210
    //   1199: ldc2_w -1111218529
    //   1202: l2i
    //   1203: ldc_w -1192813015
    //   1206: ixor
    //   1207: goto -> 1218
    //   1210: ldc2_w -1549954059
    //   1213: l2i
    //   1214: ldc_w 1363839453
    //   1217: ixor
    //   1218: ldc2_w -1043968062
    //   1221: l2i
    //   1222: ldc_w 1831414280
    //   1225: ixor
    //   1226: ixor
    //   1227: lookupswitch default -> 1252, -1446224516 -> 17182, -212800240 -> 1210
    //   1252: getfield twodelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1255: getstatic Perryc.1 : I
    //   1258: ifeq -> 1272
    //   1261: ldc2_w 207607932
    //   1264: l2i
    //   1265: ldc_w 2014158606
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w 1690870691
    //   1275: l2i
    //   1276: ldc_w -1715877381
    //   1279: ixor
    //   1280: ldc2_w 1719551642
    //   1283: l2i
    //   1284: ldc_w -1743886961
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 1316, -1977457561 -> 17354, 1793496582 -> 1272
    //   1316: goto -> 1320
    //   1319: athrow
    //   1320: invokevirtual getValue : ()Ljava/lang/Object;
    //   1323: goto -> 1327
    //   1326: athrow
    //   1327: checkcast java/lang/Boolean
    //   1330: getstatic Perryc.1 : I
    //   1333: ifeq -> 1347
    //   1336: ldc2_w -1060449888
    //   1339: l2i
    //   1340: ldc_w -513256078
    //   1343: ixor
    //   1344: goto -> 1355
    //   1347: ldc2_w 1138391657
    //   1350: l2i
    //   1351: ldc_w 1863448584
    //   1354: ixor
    //   1355: ldc2_w -175730750
    //   1358: l2i
    //   1359: ldc_w 765488526
    //   1362: ixor
    //   1363: ixor
    //   1364: lookupswitch default -> 1392, -108763490 -> 17154, 2044212081 -> 1347
    //   1392: goto -> 1396
    //   1395: athrow
    //   1396: invokevirtual booleanValue : ()Z
    //   1399: goto -> 1403
    //   1402: athrow
    //   1403: ifeq -> 1417
    //   1406: ldc2_w -332874625
    //   1409: l2i
    //   1410: ldc_w 732116237
    //   1413: ixor
    //   1414: goto -> 1425
    //   1417: ldc2_w -1757066977
    //   1420: l2i
    //   1421: ldc_w 1355726958
    //   1424: ixor
    //   1425: ldc2_w 1758126175
    //   1428: l2i
    //   1429: ldc_w -2095593252
    //   1432: ixor
    //   1433: ixor
    //   1434: tableswitch default -> 1406, 743875057 -> 1456, 743875058 -> 1457
    //   1456: return
    //   1457: getstatic Perryc.c : I
    //   1460: iflt -> 1474
    //   1463: ldc2_w 1541865050
    //   1466: l2i
    //   1467: ldc_w 215793444
    //   1470: ixor
    //   1471: goto -> 1482
    //   1474: ldc2_w -458315623
    //   1477: l2i
    //   1478: ldc_w -312990872
    //   1481: ixor
    //   1482: ldc2_w 1446829203
    //   1485: l2i
    //   1486: ldc_w -1285375256
    //   1489: ixor
    //   1490: ixor
    //   1491: lookupswitch default -> 1516, -1302059259 -> 17042, -729797926 -> 1474
    //   1516: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   1519: getstatic Perryc.1 : I
    //   1522: ifeq -> 1536
    //   1525: ldc2_w -1485539427
    //   1528: l2i
    //   1529: ldc_w 796822221
    //   1532: ixor
    //   1533: goto -> 1544
    //   1536: ldc2_w 558791130
    //   1539: l2i
    //   1540: ldc_w -568510636
    //   1543: ixor
    //   1544: ldc2_w 1636692074
    //   1547: l2i
    //   1548: ldc_w -2003106611
    //   1551: ixor
    //   1552: ixor
    //   1553: lookupswitch default -> 1580, -1734933126 -> 1536, 1629227511 -> 17210
    //   1580: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1583: getstatic Perryc.1 : I
    //   1586: ifeq -> 1600
    //   1589: ldc2_w 2016372160
    //   1592: l2i
    //   1593: ldc_w 712345014
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w -657433215
    //   1603: l2i
    //   1604: ldc_w -1979490562
    //   1607: ixor
    //   1608: ldc2_w 576128948
    //   1611: l2i
    //   1612: ldc_w -1343507861
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 1644, -538552919 -> 17164, 1715103915 -> 1600
    //   1644: getfield field_70177_z : F
    //   1647: ldc_w 1.9457396
    //   1650: invokestatic floatToIntBits : (F)I
    //   1653: ldc_w 2102201855
    //   1656: ixor
    //   1657: invokestatic intBitsToFloat : (I)F
    //   1660: fadd
    //   1661: ldc_w 11.782119
    //   1664: invokestatic floatToIntBits : (F)I
    //   1667: ldc_w 2126283663
    //   1670: ixor
    //   1671: invokestatic intBitsToFloat : (I)F
    //   1674: fmul
    //   1675: f2d
    //   1676: getstatic Perryc.1 : I
    //   1679: ifeq -> 1693
    //   1682: ldc2_w -1613855775
    //   1685: l2i
    //   1686: ldc_w 393970664
    //   1689: ixor
    //   1690: goto -> 1701
    //   1693: ldc2_w 1725367276
    //   1696: l2i
    //   1697: ldc_w 1798424633
    //   1700: ixor
    //   1701: ldc2_w 282026094
    //   1704: l2i
    //   1705: ldc_w -1135943693
    //   1708: ixor
    //   1709: ixor
    //   1710: lookupswitch default -> 17394, -1587317688 -> 1736, 607174548 -> 1693
    //   1736: dstore_3
    //   1737: ldc2_w 1.2964161498893817E308
    //   1740: invokestatic doubleToLongBits : (D)J
    //   1743: ldc2_w 9216356828545196692
    //   1746: lxor
    //   1747: invokestatic longBitsToDouble : (J)D
    //   1750: getstatic Perryc.0 : I
    //   1753: ifle -> 1767
    //   1756: ldc2_w -1527783732
    //   1759: l2i
    //   1760: ldc_w 1460445550
    //   1763: ixor
    //   1764: goto -> 1775
    //   1767: ldc2_w 1478776266
    //   1770: l2i
    //   1771: ldc_w 801560924
    //   1774: ixor
    //   1775: ldc2_w -1865629569
    //   1778: l2i
    //   1779: ldc_w -211491399
    //   1782: ixor
    //   1783: ixor
    //   1784: lookupswitch default -> 17408, -1874109852 -> 1767, 340437328 -> 1812
    //   1812: dstore #9
    //   1814: ldc2_w 1.538018228681859E308
    //   1817: invokestatic doubleToLongBits : (D)J
    //   1820: ldc2_w 9217567356650267387
    //   1823: lxor
    //   1824: invokestatic longBitsToDouble : (J)D
    //   1827: getstatic Perryc.1 : I
    //   1830: ifeq -> 1844
    //   1833: ldc2_w 1242816608
    //   1836: l2i
    //   1837: ldc_w 2024584395
    //   1840: ixor
    //   1841: goto -> 1852
    //   1844: ldc2_w 2097974245
    //   1847: l2i
    //   1848: ldc_w 1129421209
    //   1851: ixor
    //   1852: ldc2_w 700194364
    //   1855: l2i
    //   1856: ldc_w -1946018272
    //   1859: ixor
    //   1860: ixor
    //   1861: lookupswitch default -> 1888, -1761520457 -> 17170, -1376204563 -> 1844
    //   1888: dstore #11
    //   1890: getstatic Perryc.0 : I
    //   1893: ifle -> 1907
    //   1896: ldc2_w 2109834682
    //   1899: l2i
    //   1900: ldc_w 1034577905
    //   1903: ixor
    //   1904: goto -> 1915
    //   1907: ldc2_w -195380503
    //   1910: l2i
    //   1911: ldc_w -823130019
    //   1914: ixor
    //   1915: ldc2_w 447721943
    //   1918: l2i
    //   1919: ldc_w -216906459
    //   1922: ixor
    //   1923: ixor
    //   1924: lookupswitch default -> 17332, -1445587271 -> 1907, -753449402 -> 1952
    //   1952: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w 185784885
    //   1964: l2i
    //   1965: ldc_w 759774668
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w -2067036690
    //   1975: l2i
    //   1976: ldc_w 970227137
    //   1979: ixor
    //   1980: ldc2_w 968854190
    //   1983: l2i
    //   1984: ldc_w 457699477
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 2016, 77831618 -> 17224, 1780114352 -> 1972
    //   2016: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   2019: getstatic Perryc.0 : I
    //   2022: ifle -> 2036
    //   2025: ldc2_w -851086061
    //   2028: l2i
    //   2029: ldc_w 1227554054
    //   2032: ixor
    //   2033: goto -> 2044
    //   2036: ldc2_w -685615735
    //   2039: l2i
    //   2040: ldc_w -1966677910
    //   2043: ixor
    //   2044: ldc2_w 1163638810
    //   2047: l2i
    //   2048: ldc_w 398000814
    //   2051: ixor
    //   2052: ixor
    //   2053: lookupswitch default -> 16996, -695389535 -> 2036, 252055383 -> 2080
    //   2080: getfield field_74370_x : Lnet/minecraft/client/settings/KeyBinding;
    //   2083: getstatic Perryc.0 : I
    //   2086: ifle -> 2100
    //   2089: ldc2_w -343886225
    //   2092: l2i
    //   2093: ldc_w -1048606174
    //   2096: ixor
    //   2097: goto -> 2108
    //   2100: ldc2_w 1043203654
    //   2103: l2i
    //   2104: ldc_w -1329987742
    //   2107: ixor
    //   2108: ldc2_w -1389236489
    //   2111: l2i
    //   2112: ldc_w -265936155
    //   2115: ixor
    //   2116: ixor
    //   2117: lookupswitch default -> 2144, 1591603629 -> 2100, 2011754591 -> 17200
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokevirtual func_151470_d : ()Z
    //   2151: goto -> 2155
    //   2154: athrow
    //   2155: ifeq -> 2169
    //   2158: ldc2_w 858471637
    //   2161: l2i
    //   2162: ldc_w 904239870
    //   2165: ixor
    //   2166: goto -> 2177
    //   2169: ldc2_w -1482992653
    //   2172: l2i
    //   2173: ldc_w -1588202017
    //   2176: ixor
    //   2177: ldc2_w 240358936
    //   2180: l2i
    //   2181: ldc_w -524307104
    //   2184: ixor
    //   2185: ixor
    //   2186: tableswitch default -> 2158, -400390829 -> 2208, -400390828 -> 2486
    //   2208: getstatic Perryc.1 : I
    //   2211: ifeq -> 2225
    //   2214: ldc2_w 1150373604
    //   2217: l2i
    //   2218: ldc_w -2140906495
    //   2221: ixor
    //   2222: goto -> 2233
    //   2225: ldc2_w -1753353753
    //   2228: l2i
    //   2229: ldc_w 257149050
    //   2232: ixor
    //   2233: ldc2_w 207598381
    //   2236: l2i
    //   2237: ldc_w -1985715354
    //   2240: ixor
    //   2241: ixor
    //   2242: lookupswitch default -> 17338, 500558294 -> 2268, 1091486382 -> 2225
    //   2268: dload #9
    //   2270: ldc2_w 1.3101711528183377
    //   2273: invokestatic doubleToLongBits : (D)J
    //   2276: ldc2_w 9197043638337029935
    //   2279: lxor
    //   2280: invokestatic longBitsToDouble : (J)D
    //   2283: dsub
    //   2284: getstatic Perryc.c : I
    //   2287: iflt -> 2301
    //   2290: ldc2_w -207235369
    //   2293: l2i
    //   2294: ldc_w -411434935
    //   2297: ixor
    //   2298: goto -> 2309
    //   2301: ldc2_w 1303392345
    //   2304: l2i
    //   2305: ldc_w -2061472063
    //   2308: ixor
    //   2309: ldc2_w 546779105
    //   2312: l2i
    //   2313: ldc_w -1808579385
    //   2316: ixor
    //   2317: ixor
    //   2318: lookupswitch default -> 17208, -1602503240 -> 2301, 2083796414 -> 2344
    //   2344: dstore #9
    //   2346: getstatic Perryc.1 : I
    //   2349: ifeq -> 2363
    //   2352: ldc2_w -1331859373
    //   2355: l2i
    //   2356: ldc_w 1256377658
    //   2359: ixor
    //   2360: goto -> 2371
    //   2363: ldc2_w 1863861948
    //   2366: l2i
    //   2367: ldc_w -1895099840
    //   2370: ixor
    //   2371: ldc2_w -425963854
    //   2374: l2i
    //   2375: ldc_w 1104810621
    //   2378: ixor
    //   2379: ixor
    //   2380: lookupswitch default -> 2408, -461516113 -> 2363, 1564074406 -> 17018
    //   2408: dload #11
    //   2410: ldc2_w 164.74945911032952
    //   2413: invokestatic doubleToLongBits : (D)J
    //   2416: ldc2_w 9193139846106583487
    //   2419: lxor
    //   2420: invokestatic longBitsToDouble : (J)D
    //   2423: dadd
    //   2424: getstatic Perryc.0 : I
    //   2427: ifle -> 2441
    //   2430: ldc2_w 984889467
    //   2433: l2i
    //   2434: ldc_w 1081370634
    //   2437: ixor
    //   2438: goto -> 2449
    //   2441: ldc2_w 1083035598
    //   2444: l2i
    //   2445: ldc_w 1099363041
    //   2448: ixor
    //   2449: ldc2_w 1446990627
    //   2452: l2i
    //   2453: ldc_w 163962693
    //   2456: ixor
    //   2457: ixor
    //   2458: lookupswitch default -> 17260, 624614423 -> 2441, 1592897865 -> 2484
    //   2484: dstore #11
    //   2486: getstatic Perryc.1 : I
    //   2489: ifeq -> 2503
    //   2492: ldc2_w 1315221520
    //   2495: l2i
    //   2496: ldc_w 2069239983
    //   2499: ixor
    //   2500: goto -> 2511
    //   2503: ldc2_w -754711477
    //   2506: l2i
    //   2507: ldc_w 589315764
    //   2510: ixor
    //   2511: ldc2_w 793153487
    //   2514: l2i
    //   2515: ldc_w 19316350
    //   2518: ixor
    //   2519: ixor
    //   2520: lookupswitch default -> 2548, 458397966 -> 17188, 1102601912 -> 2503
    //   2548: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   2551: getstatic Perryc.1 : I
    //   2554: ifeq -> 2568
    //   2557: ldc2_w 800287607
    //   2560: l2i
    //   2561: ldc_w -483352504
    //   2564: ixor
    //   2565: goto -> 2576
    //   2568: ldc2_w -1030446480
    //   2571: l2i
    //   2572: ldc_w -1189859863
    //   2575: ixor
    //   2576: ldc2_w -722374352
    //   2579: l2i
    //   2580: ldc_w 277953780
    //   2583: ixor
    //   2584: ixor
    //   2585: lookupswitch default -> 17106, -1075789219 -> 2612, 149128955 -> 2568
    //   2612: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   2615: getstatic Perryc.c : I
    //   2618: iflt -> 2632
    //   2621: ldc2_w -467324154
    //   2624: l2i
    //   2625: ldc_w -1412032905
    //   2628: ixor
    //   2629: goto -> 2640
    //   2632: ldc2_w 880957604
    //   2635: l2i
    //   2636: ldc_w -644936944
    //   2639: ixor
    //   2640: ldc2_w -1331124607
    //   2643: l2i
    //   2644: ldc_w -1932873361
    //   2647: ixor
    //   2648: ixor
    //   2649: lookupswitch default -> 2676, -1910300411 -> 2632, 1938895519 -> 17372
    //   2676: getfield field_74366_z : Lnet/minecraft/client/settings/KeyBinding;
    //   2679: getstatic Perryc.1 : I
    //   2682: ifeq -> 2696
    //   2685: ldc2_w -601308473
    //   2688: l2i
    //   2689: ldc_w -1815345005
    //   2692: ixor
    //   2693: goto -> 2704
    //   2696: ldc2_w -313065721
    //   2699: l2i
    //   2700: ldc_w 1693953561
    //   2703: ixor
    //   2704: ldc2_w 1853663015
    //   2707: l2i
    //   2708: ldc_w 996553952
    //   2711: ixor
    //   2712: ixor
    //   2713: lookupswitch default -> 17420, -591674663 -> 2740, 452876691 -> 2696
    //   2740: goto -> 2744
    //   2743: athrow
    //   2744: invokevirtual func_151470_d : ()Z
    //   2747: goto -> 2751
    //   2750: athrow
    //   2751: ifeq -> 2765
    //   2754: ldc2_w 523739862
    //   2757: l2i
    //   2758: ldc_w 72661639
    //   2761: ixor
    //   2762: goto -> 2773
    //   2765: ldc2_w 2113406593
    //   2768: l2i
    //   2769: ldc_w 1721442001
    //   2772: ixor
    //   2773: ldc2_w -1470028487
    //   2776: l2i
    //   2777: ldc_w -623972494
    //   2780: ixor
    //   2781: ixor
    //   2782: tableswitch default -> 2754, 1775030810 -> 2804, 1775030811 -> 3082
    //   2804: getstatic Perryc.1 : I
    //   2807: ifeq -> 2821
    //   2810: ldc2_w 870422913
    //   2813: l2i
    //   2814: ldc_w 46570486
    //   2817: ixor
    //   2818: goto -> 2829
    //   2821: ldc2_w -354502371
    //   2824: l2i
    //   2825: ldc_w 1914426313
    //   2828: ixor
    //   2829: ldc2_w -1727193276
    //   2832: l2i
    //   2833: ldc_w 339401538
    //   2836: ixor
    //   2837: ixor
    //   2838: lookupswitch default -> 2864, -1661047653 -> 2821, -1139751311 -> 17268
    //   2864: dload #9
    //   2866: ldc2_w 0.015165160132690174
    //   2869: invokestatic doubleToLongBits : (D)J
    //   2872: ldc2_w 9212551645592277679
    //   2875: lxor
    //   2876: invokestatic longBitsToDouble : (J)D
    //   2879: dadd
    //   2880: getstatic Perryc.0 : I
    //   2883: ifle -> 2897
    //   2886: ldc2_w 1454824112
    //   2889: l2i
    //   2890: ldc_w 1308953199
    //   2893: ixor
    //   2894: goto -> 2905
    //   2897: ldc2_w -1865082115
    //   2900: l2i
    //   2901: ldc_w 2070735936
    //   2904: ixor
    //   2905: ldc2_w 788541223
    //   2908: l2i
    //   2909: ldc_w 446324259
    //   2912: ixor
    //   2913: ixor
    //   2914: lookupswitch default -> 17264, -568096839 -> 2940, 757703131 -> 2897
    //   2940: dstore #9
    //   2942: getstatic Perryc.c : I
    //   2945: iflt -> 2959
    //   2948: ldc2_w -2136139635
    //   2951: l2i
    //   2952: ldc_w 1614162945
    //   2955: ixor
    //   2956: goto -> 2967
    //   2959: ldc2_w 1176367495
    //   2962: l2i
    //   2963: ldc_w -1541263534
    //   2966: ixor
    //   2967: ldc2_w -208461518
    //   2970: l2i
    //   2971: ldc_w 372116447
    //   2974: ixor
    //   2975: ixor
    //   2976: lookupswitch default -> 3004, -855135592 -> 2959, 86384225 -> 17280
    //   3004: dload #11
    //   3006: ldc2_w 7.960086390247451
    //   3009: invokestatic doubleToLongBits : (D)J
    //   3012: ldc2_w 9218823498497903164
    //   3015: lxor
    //   3016: invokestatic longBitsToDouble : (J)D
    //   3019: dadd
    //   3020: getstatic Perryc.c : I
    //   3023: iflt -> 3037
    //   3026: ldc2_w 1865570308
    //   3029: l2i
    //   3030: ldc_w -627126508
    //   3033: ixor
    //   3034: goto -> 3045
    //   3037: ldc2_w 190477150
    //   3040: l2i
    //   3041: ldc_w -693373026
    //   3044: ixor
    //   3045: ldc2_w 1241900167
    //   3048: l2i
    //   3049: ldc_w 614840230
    //   3052: ixor
    //   3053: ixor
    //   3054: lookupswitch default -> 3080, -619920335 -> 17432, -327093372 -> 3037
    //   3080: dstore #11
    //   3082: getstatic Perryc.c : I
    //   3085: iflt -> 3099
    //   3088: ldc2_w -692250133
    //   3091: l2i
    //   3092: ldc_w -1301768270
    //   3095: ixor
    //   3096: goto -> 3107
    //   3099: ldc2_w 129264156
    //   3102: l2i
    //   3103: ldc_w -1486240410
    //   3106: ixor
    //   3107: ldc2_w 567627028
    //   3110: l2i
    //   3111: ldc_w -753902175
    //   3114: ixor
    //   3115: ixor
    //   3116: lookupswitch default -> 3144, -1777295636 -> 17340, -246410916 -> 3099
    //   3144: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   3147: getstatic Perryc.0 : I
    //   3150: ifle -> 3164
    //   3153: ldc2_w 1566215985
    //   3156: l2i
    //   3157: ldc_w 793310357
    //   3160: ixor
    //   3161: goto -> 3172
    //   3164: ldc2_w 1196489170
    //   3167: l2i
    //   3168: ldc_w -1928403748
    //   3171: ixor
    //   3172: ldc2_w -114570237
    //   3175: l2i
    //   3176: ldc_w 1822164027
    //   3179: ixor
    //   3180: ixor
    //   3181: lookupswitch default -> 17032, -408570980 -> 3164, 1609159990 -> 3208
    //   3208: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   3211: getstatic Perryc.0 : I
    //   3214: ifle -> 3228
    //   3217: ldc2_w -1901685644
    //   3220: l2i
    //   3221: ldc_w -1548291607
    //   3224: ixor
    //   3225: goto -> 3236
    //   3228: ldc2_w -1088773835
    //   3231: l2i
    //   3232: ldc_w 967135736
    //   3235: ixor
    //   3236: ldc2_w 186021706
    //   3239: l2i
    //   3240: ldc_w -287413971
    //   3243: ixor
    //   3244: ixor
    //   3245: lookupswitch default -> 17376, -925336582 -> 3228, 1668804266 -> 3272
    //   3272: getfield field_74368_y : Lnet/minecraft/client/settings/KeyBinding;
    //   3275: getstatic Perryc.0 : I
    //   3278: ifle -> 3292
    //   3281: ldc2_w 932886809
    //   3284: l2i
    //   3285: ldc_w 1274124331
    //   3288: ixor
    //   3289: goto -> 3300
    //   3292: ldc2_w -1911216023
    //   3295: l2i
    //   3296: ldc_w 1568914904
    //   3299: ixor
    //   3300: ldc2_w 1612320355
    //   3303: l2i
    //   3304: ldc_w -2062311901
    //   3307: ixor
    //   3308: ixor
    //   3309: lookupswitch default -> 3336, -1721585294 -> 16980, 1890534065 -> 3292
    //   3336: goto -> 3340
    //   3339: athrow
    //   3340: invokevirtual func_151470_d : ()Z
    //   3343: goto -> 3347
    //   3346: athrow
    //   3347: ifeq -> 3361
    //   3350: ldc2_w 690539609
    //   3353: l2i
    //   3354: ldc_w 418543459
    //   3357: ixor
    //   3358: goto -> 3369
    //   3361: ldc2_w -88495226
    //   3364: l2i
    //   3365: ldc_w -882700097
    //   3368: ixor
    //   3369: ldc2_w 1629390089
    //   3372: l2i
    //   3373: ldc_w -2094246286
    //   3376: ixor
    //   3377: ixor
    //   3378: tableswitch default -> 3350, -739743679 -> 3400, -739743678 -> 3678
    //   3400: getstatic Perryc.c : I
    //   3403: iflt -> 3417
    //   3406: ldc2_w -1691465270
    //   3409: l2i
    //   3410: ldc_w 1188926263
    //   3413: ixor
    //   3414: goto -> 3425
    //   3417: ldc2_w -160518599
    //   3420: l2i
    //   3421: ldc_w -1390416595
    //   3424: ixor
    //   3425: ldc2_w 863585636
    //   3428: l2i
    //   3429: ldc_w 659104321
    //   3432: ixor
    //   3433: ixor
    //   3434: lookupswitch default -> 3460, -909918760 -> 17166, 1324424857 -> 3417
    //   3460: dload #9
    //   3462: ldc2_w 0.008863374566065481
    //   3465: invokestatic doubleToLongBits : (D)J
    //   3468: ldc2_w 9215674312984742097
    //   3471: lxor
    //   3472: invokestatic longBitsToDouble : (J)D
    //   3475: dadd
    //   3476: getstatic Perryc.0 : I
    //   3479: ifle -> 3493
    //   3482: ldc2_w 1335602659
    //   3485: l2i
    //   3486: ldc_w -1028551259
    //   3489: ixor
    //   3490: goto -> 3501
    //   3493: ldc2_w -1300965790
    //   3496: l2i
    //   3497: ldc_w 276290557
    //   3500: ixor
    //   3501: ldc2_w -1135550993
    //   3504: l2i
    //   3505: ldc_w -462690430
    //   3508: ixor
    //   3509: ixor
    //   3510: lookupswitch default -> 3536, -2131251850 -> 3493, -720299477 -> 17442
    //   3536: dstore #9
    //   3538: getstatic Perryc.c : I
    //   3541: iflt -> 3555
    //   3544: ldc2_w -743714416
    //   3547: l2i
    //   3548: ldc_w 1030331574
    //   3551: ixor
    //   3552: goto -> 3563
    //   3555: ldc2_w -436779471
    //   3558: l2i
    //   3559: ldc_w -441443503
    //   3562: ixor
    //   3563: ldc2_w 2018785728
    //   3566: l2i
    //   3567: ldc_w 1201434609
    //   3570: ixor
    //   3571: ixor
    //   3572: lookupswitch default -> 3600, -918573980 -> 3555, -787866857 -> 17148
    //   3600: dload #11
    //   3602: ldc2_w 14.407553410901846
    //   3605: invokestatic doubleToLongBits : (D)J
    //   3608: ldc2_w 9213468369866876083
    //   3611: lxor
    //   3612: invokestatic longBitsToDouble : (J)D
    //   3615: dadd
    //   3616: getstatic Perryc.c : I
    //   3619: iflt -> 3633
    //   3622: ldc2_w 1491663003
    //   3625: l2i
    //   3626: ldc_w -1398662777
    //   3629: ixor
    //   3630: goto -> 3641
    //   3633: ldc2_w 1146930843
    //   3636: l2i
    //   3637: ldc_w 2072186910
    //   3640: ixor
    //   3641: ldc2_w 388064802
    //   3644: l2i
    //   3645: ldc_w 1053305640
    //   3648: ixor
    //   3649: ixor
    //   3650: lookupswitch default -> 17130, -576476138 -> 3633, 372677519 -> 3676
    //   3676: dstore #11
    //   3678: getstatic Perryc.c : I
    //   3681: iflt -> 3695
    //   3684: ldc2_w -704644403
    //   3687: l2i
    //   3688: ldc_w -596348904
    //   3691: ixor
    //   3692: goto -> 3703
    //   3695: ldc2_w 1925042692
    //   3698: l2i
    //   3699: ldc_w 561392285
    //   3702: ixor
    //   3703: ldc2_w -1840874259
    //   3706: l2i
    //   3707: ldc_w -999022709
    //   3710: ixor
    //   3711: ixor
    //   3712: lookupswitch default -> 17050, 100244479 -> 3740, 1606019507 -> 3695
    //   3740: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   3743: getstatic Perryc.c : I
    //   3746: iflt -> 3760
    //   3749: ldc2_w -1467356377
    //   3752: l2i
    //   3753: ldc_w 90058567
    //   3756: ixor
    //   3757: goto -> 3768
    //   3760: ldc2_w 438593994
    //   3763: l2i
    //   3764: ldc_w -1047949908
    //   3767: ixor
    //   3768: ldc2_w -1429842502
    //   3771: l2i
    //   3772: ldc_w -1191213190
    //   3775: ixor
    //   3776: ixor
    //   3777: lookupswitch default -> 3804, -1074915680 -> 17440, -847360899 -> 3760
    //   3804: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   3807: getstatic Perryc.1 : I
    //   3810: ifeq -> 3824
    //   3813: ldc2_w -1259541579
    //   3816: l2i
    //   3817: ldc_w -661758139
    //   3820: ixor
    //   3821: goto -> 3832
    //   3824: ldc2_w -1092467792
    //   3827: l2i
    //   3828: ldc_w 1056480180
    //   3831: ixor
    //   3832: ldc2_w -455013449
    //   3835: l2i
    //   3836: ldc_w -369948349
    //   3839: ixor
    //   3840: ixor
    //   3841: lookupswitch default -> 3868, -1096732143 -> 3824, 1634776580 -> 17052
    //   3868: getfield field_74351_w : Lnet/minecraft/client/settings/KeyBinding;
    //   3871: getstatic Perryc.0 : I
    //   3874: ifle -> 3888
    //   3877: ldc2_w 1317211451
    //   3880: l2i
    //   3881: ldc_w -452210360
    //   3884: ixor
    //   3885: goto -> 3896
    //   3888: ldc2_w 1097281034
    //   3891: l2i
    //   3892: ldc_w 1665446774
    //   3895: ixor
    //   3896: ldc2_w 656817543
    //   3899: l2i
    //   3900: ldc_w -1345553856
    //   3903: ixor
    //   3904: ixor
    //   3905: lookupswitch default -> 17198, -1429611845 -> 3932, 593664948 -> 3888
    //   3932: goto -> 3936
    //   3935: athrow
    //   3936: invokevirtual func_151470_d : ()Z
    //   3939: goto -> 3943
    //   3942: athrow
    //   3943: ifeq -> 3957
    //   3946: ldc2_w 892264569
    //   3949: l2i
    //   3950: ldc_w 1363606383
    //   3953: ixor
    //   3954: goto -> 3965
    //   3957: ldc2_w 575380756
    //   3960: l2i
    //   3961: ldc_w 1176733185
    //   3964: ixor
    //   3965: ldc2_w -1547471440
    //   3968: l2i
    //   3969: ldc_w -1779139869
    //   3972: ixor
    //   3973: ixor
    //   3974: tableswitch default -> 3946, 1381962821 -> 3996, 1381962822 -> 4134
    //   3996: getstatic Perryc.1 : I
    //   3999: ifeq -> 4013
    //   4002: ldc2_w 509828693
    //   4005: l2i
    //   4006: ldc_w 436770983
    //   4009: ixor
    //   4010: goto -> 4021
    //   4013: ldc2_w 1750378932
    //   4016: l2i
    //   4017: ldc_w -1805459296
    //   4020: ixor
    //   4021: ldc2_w -1887766542
    //   4024: l2i
    //   4025: ldc_w -1523545019
    //   4028: ixor
    //   4029: ixor
    //   4030: lookupswitch default -> 4056, 336575604 -> 4013, 773963077 -> 17424
    //   4056: dload #11
    //   4058: ldc2_w 4.474434052388906
    //   4061: invokestatic doubleToLongBits : (D)J
    //   4064: ldc2_w 9214899002855422454
    //   4067: lxor
    //   4068: invokestatic longBitsToDouble : (J)D
    //   4071: dadd
    //   4072: getstatic Perryc.c : I
    //   4075: iflt -> 4089
    //   4078: ldc2_w -1916214240
    //   4081: l2i
    //   4082: ldc_w -1912974922
    //   4085: ixor
    //   4086: goto -> 4097
    //   4089: ldc2_w 1608231333
    //   4092: l2i
    //   4093: ldc_w -1691758533
    //   4096: ixor
    //   4097: ldc2_w 1289654233
    //   4100: l2i
    //   4101: ldc_w -1731347895
    //   4104: ixor
    //   4105: ixor
    //   4106: lookupswitch default -> 4132, -736002042 -> 17134, 1237245709 -> 4089
    //   4132: dstore #11
    //   4134: getstatic Perryc.c : I
    //   4137: iflt -> 4151
    //   4140: ldc2_w 665395836
    //   4143: l2i
    //   4144: ldc_w 961048905
    //   4147: ixor
    //   4148: goto -> 4159
    //   4151: ldc2_w -2131966141
    //   4154: l2i
    //   4155: ldc_w -1446314466
    //   4158: ixor
    //   4159: ldc2_w -1557679536
    //   4162: l2i
    //   4163: ldc_w 682864205
    //   4166: ixor
    //   4167: ixor
    //   4168: lookupswitch default -> 17344, -1787474136 -> 4151, -1565383360 -> 4196
    //   4196: dload #11
    //   4198: ldc2_w 6.493059509649152E307
    //   4201: invokestatic doubleToLongBits : (D)J
    //   4204: ldc2_w 9211864230559740927
    //   4207: lxor
    //   4208: invokestatic longBitsToDouble : (J)D
    //   4211: dcmpl
    //   4212: ifle -> 4226
    //   4215: ldc2_w 1099566452
    //   4218: l2i
    //   4219: ldc_w -1334965743
    //   4222: ixor
    //   4223: goto -> 4234
    //   4226: ldc2_w -1688470485
    //   4229: l2i
    //   4230: ldc_w 1790966607
    //   4233: ixor
    //   4234: ldc2_w -122562353
    //   4237: l2i
    //   4238: ldc_w -2065177720
    //   4241: ixor
    //   4242: ixor
    //   4243: tableswitch default -> 4215, -1917699038 -> 4264, -1917699037 -> 4529
    //   4264: getstatic Perryc.1 : I
    //   4267: ifeq -> 4281
    //   4270: ldc2_w -1185994664
    //   4273: l2i
    //   4274: ldc_w -1258411111
    //   4277: ixor
    //   4278: goto -> 4289
    //   4281: ldc2_w -1683297937
    //   4284: l2i
    //   4285: ldc_w -640468723
    //   4288: ixor
    //   4289: ldc2_w 216051992
    //   4292: l2i
    //   4293: ldc_w -1023728104
    //   4296: ixor
    //   4297: ixor
    //   4298: lookupswitch default -> 4324, -1012230975 -> 17006, 648742905 -> 4281
    //   4324: dload_3
    //   4325: getstatic Perryc.c : I
    //   4328: iflt -> 4342
    //   4331: ldc2_w -109828761
    //   4334: l2i
    //   4335: ldc_w 1437545919
    //   4338: ixor
    //   4339: goto -> 4350
    //   4342: ldc2_w 824605675
    //   4345: l2i
    //   4346: ldc_w 802071529
    //   4349: ixor
    //   4350: ldc2_w -607594241
    //   4353: l2i
    //   4354: ldc_w -139017048
    //   4357: ixor
    //   4358: ixor
    //   4359: lookupswitch default -> 4384, -2136666993 -> 16990, 163714627 -> 4342
    //   4384: dload #9
    //   4386: getstatic Perryc.c : I
    //   4389: iflt -> 4403
    //   4392: ldc2_w -733647761
    //   4395: l2i
    //   4396: ldc_w -2079303664
    //   4399: ixor
    //   4400: goto -> 4411
    //   4403: ldc2_w -1211773938
    //   4406: l2i
    //   4407: ldc_w 722339287
    //   4410: ixor
    //   4411: ldc2_w 809205143
    //   4414: l2i
    //   4415: ldc_w -1504529942
    //   4418: ixor
    //   4419: ixor
    //   4420: lookupswitch default -> 4448, -1834131051 -> 4403, -969082878 -> 17028
    //   4448: dload #11
    //   4450: ddiv
    //   4451: ldc2_w 0.19281710829988927
    //   4454: invokestatic doubleToLongBits : (D)J
    //   4457: ldc2_w 9204863112105226159
    //   4460: lxor
    //   4461: invokestatic longBitsToDouble : (J)D
    //   4464: drem
    //   4465: dadd
    //   4466: getstatic Perryc.0 : I
    //   4469: ifle -> 4483
    //   4472: ldc2_w 1217336253
    //   4475: l2i
    //   4476: ldc_w -1833855737
    //   4479: ixor
    //   4480: goto -> 4491
    //   4483: ldc2_w -1337684232
    //   4486: l2i
    //   4487: ldc_w -100431328
    //   4490: ixor
    //   4491: ldc2_w -1811494722
    //   4494: l2i
    //   4495: ldc_w 396253614
    //   4498: ixor
    //   4499: ixor
    //   4500: lookupswitch default -> 17398, -908094008 -> 4528, 1504057258 -> 4483
    //   4528: dstore_3
    //   4529: getstatic Perryc.c : I
    //   4532: iflt -> 4546
    //   4535: ldc2_w -725834260
    //   4538: l2i
    //   4539: ldc_w 1475778306
    //   4542: ixor
    //   4543: goto -> 4554
    //   4546: ldc2_w -1857998816
    //   4549: l2i
    //   4550: ldc_w -2010123150
    //   4553: ixor
    //   4554: ldc2_w 631130572
    //   4557: l2i
    //   4558: ldc_w -172346108
    //   4561: ixor
    //   4562: ixor
    //   4563: lookupswitch default -> 17066, -917849958 -> 4588, 1399737894 -> 4546
    //   4588: dload_3
    //   4589: ldc2_w 5.943832988418712E307
    //   4592: invokestatic doubleToLongBits : (D)J
    //   4595: ldc2_w 9211313859351577005
    //   4598: lxor
    //   4599: invokestatic longBitsToDouble : (J)D
    //   4602: dcmpg
    //   4603: ifge -> 4617
    //   4606: ldc2_w -573042084
    //   4609: l2i
    //   4610: ldc_w -345641815
    //   4613: ixor
    //   4614: goto -> 4625
    //   4617: ldc2_w 632939653
    //   4620: l2i
    //   4621: ldc_w 319036019
    //   4624: ixor
    //   4625: ldc2_w -206364683
    //   4628: l2i
    //   4629: ldc_w -1845598355
    //   4632: ixor
    //   4633: ixor
    //   4634: tableswitch default -> 4606, 1425049197 -> 4656, 1425049198 -> 4793
    //   4656: ldc2_w 0.024617077490556225
    //   4659: invokestatic doubleToLongBits : (D)J
    //   4662: ldc2_w 9218786214826142441
    //   4665: lxor
    //   4666: invokestatic longBitsToDouble : (J)D
    //   4669: getstatic Perryc.0 : I
    //   4672: ifle -> 4686
    //   4675: ldc2_w 1032755346
    //   4678: l2i
    //   4679: ldc_w 925253131
    //   4682: ixor
    //   4683: goto -> 4694
    //   4686: ldc2_w -1311655669
    //   4689: l2i
    //   4690: ldc_w -1371957322
    //   4693: ixor
    //   4694: ldc2_w 2093473593
    //   4697: l2i
    //   4698: ldc_w -951683409
    //   4701: ixor
    //   4702: ixor
    //   4703: lookupswitch default -> 4728, -1322709233 -> 17308, 726094872 -> 4686
    //   4728: dload_3
    //   4729: dsub
    //   4730: getstatic Perryc.c : I
    //   4733: iflt -> 4747
    //   4736: ldc2_w 2099457231
    //   4739: l2i
    //   4740: ldc_w -1400181403
    //   4743: ixor
    //   4744: goto -> 4755
    //   4747: ldc2_w 1354060762
    //   4750: l2i
    //   4751: ldc_w 519110505
    //   4754: ixor
    //   4755: ldc2_w -558774784
    //   4758: l2i
    //   4759: ldc_w 488923743
    //   4762: ixor
    //   4763: ixor
    //   4764: lookupswitch default -> 17046, -1915746068 -> 4792, 305948149 -> 4747
    //   4792: dstore_3
    //   4793: getstatic Perryc.0 : I
    //   4796: ifle -> 4810
    //   4799: ldc2_w -628672242
    //   4802: l2i
    //   4803: ldc_w 1364786634
    //   4806: ixor
    //   4807: goto -> 4818
    //   4810: ldc2_w -827357094
    //   4813: l2i
    //   4814: ldc_w -1808701001
    //   4817: ixor
    //   4818: ldc2_w 1869094152
    //   4821: l2i
    //   4822: ldc_w 1005002697
    //   4825: ixor
    //   4826: ixor
    //   4827: lookupswitch default -> 17212, -548354555 -> 4810, 236053292 -> 4852
    //   4852: dload_3
    //   4853: ldc2_w 0.02553111274540481
    //   4856: invokestatic doubleToLongBits : (D)J
    //   4859: ldc2_w 9217923767644620750
    //   4862: lxor
    //   4863: invokestatic longBitsToDouble : (J)D
    //   4866: dcmpl
    //   4867: ifle -> 4881
    //   4870: ldc2_w -1939793290
    //   4873: l2i
    //   4874: ldc_w 1139348771
    //   4877: ixor
    //   4878: goto -> 4889
    //   4881: ldc2_w 1990726908
    //   4884: l2i
    //   4885: ldc_w -1189078104
    //   4888: ixor
    //   4889: ldc2_w 988007815
    //   4892: l2i
    //   4893: ldc_w -1521220968
    //   4896: ixor
    //   4897: ixor
    //   4898: tableswitch default -> 4870, 1346355274 -> 4920, 1346355275 -> 5057
    //   4920: getstatic Perryc.0 : I
    //   4923: ifle -> 4937
    //   4926: ldc2_w -84379373
    //   4929: l2i
    //   4930: ldc_w -1670944848
    //   4933: ixor
    //   4934: goto -> 4945
    //   4937: ldc2_w -1831141457
    //   4940: l2i
    //   4941: ldc_w 272299269
    //   4944: ixor
    //   4945: ldc2_w 1011885059
    //   4948: l2i
    //   4949: ldc_w 1274527277
    //   4952: ixor
    //   4953: ixor
    //   4954: lookupswitch default -> 17292, -179859324 -> 4980, 288916621 -> 4937
    //   4980: dload_3
    //   4981: ldc2_w 0.01857730851425252
    //   4984: invokestatic doubleToLongBits : (D)J
    //   4987: ldc2_w 9215937062221434777
    //   4990: lxor
    //   4991: invokestatic longBitsToDouble : (J)D
    //   4994: drem
    //   4995: getstatic Perryc.1 : I
    //   4998: ifeq -> 5012
    //   5001: ldc2_w -1658872883
    //   5004: l2i
    //   5005: ldc_w 1247324064
    //   5008: ixor
    //   5009: goto -> 5020
    //   5012: ldc2_w 337120868
    //   5015: l2i
    //   5016: ldc_w -1211186836
    //   5019: ixor
    //   5020: ldc2_w -2034730220
    //   5023: l2i
    //   5024: ldc_w -169507390
    //   5027: ixor
    //   5028: ixor
    //   5029: lookupswitch default -> 5056, -1541750085 -> 17074, -437294393 -> 5012
    //   5056: dstore_3
    //   5057: getstatic Perryc.0 : I
    //   5060: ifle -> 5074
    //   5063: ldc2_w 1057193715
    //   5066: l2i
    //   5067: ldc_w 837737104
    //   5070: ixor
    //   5071: goto -> 5082
    //   5074: ldc2_w -664771942
    //   5077: l2i
    //   5078: ldc_w -742278762
    //   5081: ixor
    //   5082: ldc2_w -1916190325
    //   5085: l2i
    //   5086: ldc_w -3559518
    //   5089: ixor
    //   5090: ixor
    //   5091: lookupswitch default -> 17012, 2040608037 -> 5116, 2095925834 -> 5074
    //   5116: dload_3
    //   5117: getstatic Perryc.1 : I
    //   5120: ifeq -> 5134
    //   5123: ldc2_w 1082764694
    //   5126: l2i
    //   5127: ldc_w -520041544
    //   5130: ixor
    //   5131: goto -> 5142
    //   5134: ldc2_w -1235143408
    //   5137: l2i
    //   5138: ldc_w -787167676
    //   5141: ixor
    //   5142: ldc2_w 1576173194
    //   5145: l2i
    //   5146: ldc_w 683602498
    //   5149: ixor
    //   5150: ixor
    //   5151: lookupswitch default -> 17302, -725226778 -> 5134, 305758108 -> 5176
    //   5176: goto -> 5180
    //   5179: athrow
    //   5180: invokestatic toRadians : (D)D
    //   5183: goto -> 5187
    //   5186: athrow
    //   5187: getstatic Perryc.1 : I
    //   5190: ifeq -> 5204
    //   5193: ldc2_w -1749241684
    //   5196: l2i
    //   5197: ldc_w -405087329
    //   5200: ixor
    //   5201: goto -> 5212
    //   5204: ldc2_w -1899862051
    //   5207: l2i
    //   5208: ldc_w -864363537
    //   5211: ixor
    //   5212: ldc2_w -2122013854
    //   5215: l2i
    //   5216: ldc_w -2008954026
    //   5219: ixor
    //   5220: ixor
    //   5221: lookupswitch default -> 5248, -1126128264 -> 5204, 2040726279 -> 16992
    //   5248: goto -> 5252
    //   5251: athrow
    //   5252: invokestatic cos : (D)D
    //   5255: goto -> 5259
    //   5258: athrow
    //   5259: getstatic Perryc.0 : I
    //   5262: ifle -> 5276
    //   5265: ldc2_w -1611963389
    //   5268: l2i
    //   5269: ldc_w 694104174
    //   5272: ixor
    //   5273: goto -> 5284
    //   5276: ldc2_w -2145773827
    //   5279: l2i
    //   5280: ldc_w 234145752
    //   5283: ixor
    //   5284: ldc2_w 121452887
    //   5287: l2i
    //   5288: ldc_w 806206002
    //   5291: ixor
    //   5292: ixor
    //   5293: lookupswitch default -> 17306, -2122000632 -> 5276, -1159835072 -> 5320
    //   5320: dstore #5
    //   5322: getstatic Perryc.1 : I
    //   5325: ifeq -> 5339
    //   5328: ldc2_w 1535358545
    //   5331: l2i
    //   5332: ldc_w -1395772359
    //   5335: ixor
    //   5336: goto -> 5347
    //   5339: ldc2_w -1701628186
    //   5342: l2i
    //   5343: ldc_w -1523197062
    //   5346: ixor
    //   5347: ldc2_w -1866580992
    //   5350: l2i
    //   5351: ldc_w 1593143251
    //   5354: ixor
    //   5355: ixor
    //   5356: lookupswitch default -> 5384, -179618274 -> 5339, 956748219 -> 17426
    //   5384: dload_3
    //   5385: getstatic Perryc.1 : I
    //   5388: ifeq -> 5402
    //   5391: ldc2_w -871098896
    //   5394: l2i
    //   5395: ldc_w -1255061709
    //   5398: ixor
    //   5399: goto -> 5410
    //   5402: ldc2_w 1596993833
    //   5405: l2i
    //   5406: ldc_w -220222936
    //   5409: ixor
    //   5410: ldc2_w 1717527278
    //   5413: l2i
    //   5414: ldc_w -2094656913
    //   5417: ixor
    //   5418: ixor
    //   5419: lookupswitch default -> 17374, -1671683518 -> 5402, 1217850240 -> 5444
    //   5444: goto -> 5448
    //   5447: athrow
    //   5448: invokestatic toRadians : (D)D
    //   5451: goto -> 5455
    //   5454: athrow
    //   5455: getstatic Perryc.c : I
    //   5458: iflt -> 5472
    //   5461: ldc2_w -1763901998
    //   5464: l2i
    //   5465: ldc_w -809250954
    //   5468: ixor
    //   5469: goto -> 5480
    //   5472: ldc2_w 529858946
    //   5475: l2i
    //   5476: ldc_w 1401648883
    //   5479: ixor
    //   5480: ldc2_w -790914098
    //   5483: l2i
    //   5484: ldc_w -2017064651
    //   5487: ixor
    //   5488: ixor
    //   5489: lookupswitch default -> 5516, -897704765 -> 5472, 235053151 -> 17326
    //   5516: goto -> 5520
    //   5519: athrow
    //   5520: invokestatic sin : (D)D
    //   5523: goto -> 5527
    //   5526: athrow
    //   5527: getstatic Perryc.c : I
    //   5530: iflt -> 5544
    //   5533: ldc2_w 473474944
    //   5536: l2i
    //   5537: ldc_w 626246235
    //   5540: ixor
    //   5541: goto -> 5552
    //   5544: ldc2_w -28441233
    //   5547: l2i
    //   5548: ldc_w 1817448431
    //   5551: ixor
    //   5552: ldc2_w -137075845
    //   5555: l2i
    //   5556: ldc_w -1143255463
    //   5559: ixor
    //   5560: ixor
    //   5561: lookupswitch default -> 17438, -569038942 -> 5588, 1969506553 -> 5544
    //   5588: dstore #7
    //   5590: getstatic Perryc.0 : I
    //   5593: ifle -> 5607
    //   5596: ldc2_w -336623725
    //   5599: l2i
    //   5600: ldc_w -196333052
    //   5603: ixor
    //   5604: goto -> 5615
    //   5607: ldc2_w -1141972597
    //   5610: l2i
    //   5611: ldc_w 748104816
    //   5614: ixor
    //   5615: ldc2_w -1754967557
    //   5618: l2i
    //   5619: ldc_w -1836572024
    //   5622: ixor
    //   5623: ixor
    //   5624: lookupswitch default -> 5652, -337326394 -> 5607, 441370340 -> 17160
    //   5652: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   5655: getstatic Perryc.c : I
    //   5658: iflt -> 5672
    //   5661: ldc2_w 1918674771
    //   5664: l2i
    //   5665: ldc_w -1462676452
    //   5668: ixor
    //   5669: goto -> 5680
    //   5672: ldc2_w -1609862337
    //   5675: l2i
    //   5676: ldc_w -1626029728
    //   5679: ixor
    //   5680: ldc2_w 1933848511
    //   5683: l2i
    //   5684: ldc_w 86476731
    //   5687: ixor
    //   5688: ixor
    //   5689: lookupswitch default -> 17310, -1393665205 -> 5672, 1232869979 -> 5716
    //   5716: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   5719: getstatic Perryc.0 : I
    //   5722: ifle -> 5736
    //   5725: ldc2_w -2015716145
    //   5728: l2i
    //   5729: ldc_w -1390955471
    //   5732: ixor
    //   5733: goto -> 5744
    //   5736: ldc2_w -1982582801
    //   5739: l2i
    //   5740: ldc_w -740260286
    //   5743: ixor
    //   5744: ldc2_w 1351332156
    //   5747: l2i
    //   5748: ldc_w 385940617
    //   5751: ixor
    //   5752: ixor
    //   5753: lookupswitch default -> 5780, 1088077658 -> 5736, 1833329995 -> 17136
    //   5780: getfield field_74351_w : Lnet/minecraft/client/settings/KeyBinding;
    //   5783: getstatic Perryc.0 : I
    //   5786: ifle -> 5800
    //   5789: ldc2_w -452855013
    //   5792: l2i
    //   5793: ldc_w -1076178412
    //   5796: ixor
    //   5797: goto -> 5808
    //   5800: ldc2_w 384142996
    //   5803: l2i
    //   5804: ldc_w 1918921493
    //   5807: ixor
    //   5808: ldc2_w 1514003476
    //   5811: l2i
    //   5812: ldc_w 2017776162
    //   5815: ixor
    //   5816: ixor
    //   5817: lookupswitch default -> 16982, 1190980535 -> 5844, 2023892793 -> 5800
    //   5844: goto -> 5848
    //   5847: athrow
    //   5848: invokevirtual func_151470_d : ()Z
    //   5851: goto -> 5855
    //   5854: athrow
    //   5855: ifne -> 5869
    //   5858: ldc2_w 415769327
    //   5861: l2i
    //   5862: ldc_w -730326275
    //   5865: ixor
    //   5866: goto -> 5877
    //   5869: ldc2_w -2003999440
    //   5872: l2i
    //   5873: ldc_w 1144872237
    //   5876: ixor
    //   5877: ldc2_w 641210912
    //   5880: l2i
    //   5881: ldc_w -1695019563
    //   5884: ixor
    //   5885: ixor
    //   5886: tableswitch default -> 5858, 1886400487 -> 5908, 1886400488 -> 6856
    //   5908: getstatic Perryc.1 : I
    //   5911: ifeq -> 5925
    //   5914: ldc2_w 1545758127
    //   5917: l2i
    //   5918: ldc_w -1938966826
    //   5921: ixor
    //   5922: goto -> 5933
    //   5925: ldc2_w 316575012
    //   5928: l2i
    //   5929: ldc_w -273671292
    //   5932: ixor
    //   5933: ldc2_w 819754605
    //   5936: l2i
    //   5937: ldc_w 1878427687
    //   5940: ixor
    //   5941: ixor
    //   5942: lookupswitch default -> 5968, -1889194701 -> 17428, -117238907 -> 5925
    //   5968: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   5971: getstatic Perryc.c : I
    //   5974: iflt -> 5988
    //   5977: ldc2_w -911031081
    //   5980: l2i
    //   5981: ldc_w -2075979693
    //   5984: ixor
    //   5985: goto -> 5996
    //   5988: ldc2_w -2015215136
    //   5991: l2i
    //   5992: ldc_w -237285337
    //   5995: ixor
    //   5996: ldc2_w -947397637
    //   5999: l2i
    //   6000: ldc_w 1739860814
    //   6003: ixor
    //   6004: ixor
    //   6005: lookupswitch default -> 17020, -703929998 -> 6032, -306043855 -> 5988
    //   6032: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   6035: getstatic Perryc.1 : I
    //   6038: ifeq -> 6052
    //   6041: ldc2_w 543666235
    //   6044: l2i
    //   6045: ldc_w 1494671204
    //   6048: ixor
    //   6049: goto -> 6060
    //   6052: ldc2_w -773765939
    //   6055: l2i
    //   6056: ldc_w 2075268335
    //   6059: ixor
    //   6060: ldc2_w -1943927811
    //   6063: l2i
    //   6064: ldc_w -36537750
    //   6067: ixor
    //   6068: ixor
    //   6069: lookupswitch default -> 17444, -610063947 -> 6096, 142677704 -> 6052
    //   6096: getfield field_74370_x : Lnet/minecraft/client/settings/KeyBinding;
    //   6099: getstatic Perryc.0 : I
    //   6102: ifle -> 6116
    //   6105: ldc2_w 1943619987
    //   6108: l2i
    //   6109: ldc_w 1372600909
    //   6112: ixor
    //   6113: goto -> 6124
    //   6116: ldc2_w -762447607
    //   6119: l2i
    //   6120: ldc_w -144808634
    //   6123: ixor
    //   6124: ldc2_w 1309959900
    //   6127: l2i
    //   6128: ldc_w -1424012000
    //   6131: ixor
    //   6132: ixor
    //   6133: lookupswitch default -> 17116, -1059539021 -> 6160, -956147678 -> 6116
    //   6160: goto -> 6164
    //   6163: athrow
    //   6164: invokevirtual func_151470_d : ()Z
    //   6167: goto -> 6171
    //   6170: athrow
    //   6171: ifne -> 6185
    //   6174: ldc2_w -662397429
    //   6177: l2i
    //   6178: ldc_w 1739534315
    //   6181: ixor
    //   6182: goto -> 6193
    //   6185: ldc2_w -411644317
    //   6188: l2i
    //   6189: ldc_w 1482522496
    //   6192: ixor
    //   6193: ldc2_w -1215877900
    //   6196: l2i
    //   6197: ldc_w 1388790941
    //   6200: ixor
    //   6201: ixor
    //   6202: tableswitch default -> 6174, 1517017481 -> 6224, 1517017482 -> 6856
    //   6224: getstatic Perryc.1 : I
    //   6227: ifeq -> 6241
    //   6230: ldc2_w -1519431696
    //   6233: l2i
    //   6234: ldc_w -1375931304
    //   6237: ixor
    //   6238: goto -> 6249
    //   6241: ldc2_w 687821514
    //   6244: l2i
    //   6245: ldc_w 1269313052
    //   6248: ixor
    //   6249: ldc2_w -83968616
    //   6252: l2i
    //   6253: ldc_w -1815960342
    //   6256: ixor
    //   6257: ixor
    //   6258: lookupswitch default -> 6284, -829404983 -> 6241, 1638900442 -> 17184
    //   6284: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   6287: getstatic Perryc.1 : I
    //   6290: ifeq -> 6304
    //   6293: ldc2_w -1049575301
    //   6296: l2i
    //   6297: ldc_w 754741654
    //   6300: ixor
    //   6301: goto -> 6312
    //   6304: ldc2_w -1886703245
    //   6307: l2i
    //   6308: ldc_w 2110781317
    //   6311: ixor
    //   6312: ldc2_w 143410466
    //   6315: l2i
    //   6316: ldc_w 251542335
    //   6319: ixor
    //   6320: ixor
    //   6321: lookupswitch default -> 6348, -335622160 -> 17412, 934636155 -> 6304
    //   6348: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   6351: getstatic Perryc.0 : I
    //   6354: ifle -> 6368
    //   6357: ldc2_w 1747204736
    //   6360: l2i
    //   6361: ldc_w -117976885
    //   6364: ixor
    //   6365: goto -> 6376
    //   6368: ldc2_w 2096067436
    //   6371: l2i
    //   6372: ldc_w -2061317715
    //   6375: ixor
    //   6376: ldc2_w 1480467911
    //   6379: l2i
    //   6380: ldc_w 1156568450
    //   6383: ixor
    //   6384: ixor
    //   6385: lookupswitch default -> 6412, -1946019314 -> 17060, 374613423 -> 6368
    //   6412: getfield field_74366_z : Lnet/minecraft/client/settings/KeyBinding;
    //   6415: getstatic Perryc.c : I
    //   6418: iflt -> 6432
    //   6421: ldc2_w 1015330156
    //   6424: l2i
    //   6425: ldc_w 592513311
    //   6428: ixor
    //   6429: goto -> 6440
    //   6432: ldc2_w 967260741
    //   6435: l2i
    //   6436: ldc_w -1303113691
    //   6439: ixor
    //   6440: ldc2_w 2066303933
    //   6443: l2i
    //   6444: ldc_w 535131027
    //   6447: ixor
    //   6448: ixor
    //   6449: lookupswitch default -> 6476, 524808001 -> 6432, 2065269853 -> 17286
    //   6476: goto -> 6480
    //   6479: athrow
    //   6480: invokevirtual func_151470_d : ()Z
    //   6483: goto -> 6487
    //   6486: athrow
    //   6487: ifne -> 6501
    //   6490: ldc2_w 1036955587
    //   6493: l2i
    //   6494: ldc_w 1205215938
    //   6497: ixor
    //   6498: goto -> 6509
    //   6501: ldc2_w 1132234444
    //   6504: l2i
    //   6505: ldc_w 962857932
    //   6508: ixor
    //   6509: ldc2_w 1342738396
    //   6512: l2i
    //   6513: ldc_w 147862283
    //   6516: ixor
    //   6517: ixor
    //   6518: tableswitch default -> 6490, 583021014 -> 6540, 583021015 -> 6856
    //   6540: getstatic Perryc.0 : I
    //   6543: ifle -> 6557
    //   6546: ldc2_w 155916122
    //   6549: l2i
    //   6550: ldc_w -1246998825
    //   6553: ixor
    //   6554: goto -> 6565
    //   6557: ldc2_w 1739325712
    //   6560: l2i
    //   6561: ldc_w 1752907562
    //   6564: ixor
    //   6565: ldc2_w -1352457661
    //   6568: l2i
    //   6569: ldc_w -315099493
    //   6572: ixor
    //   6573: ixor
    //   6574: lookupswitch default -> 6600, -1954015008 -> 6557, -21787307 -> 17396
    //   6600: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   6603: getstatic Perryc.1 : I
    //   6606: ifeq -> 6620
    //   6609: ldc2_w 369144150
    //   6612: l2i
    //   6613: ldc_w -330351904
    //   6616: ixor
    //   6617: goto -> 6628
    //   6620: ldc2_w 134558863
    //   6623: l2i
    //   6624: ldc_w 1403365494
    //   6627: ixor
    //   6628: ldc2_w 1991691814
    //   6631: l2i
    //   6632: ldc_w -1658253397
    //   6635: ixor
    //   6636: ixor
    //   6637: lookupswitch default -> 17446, -1338024588 -> 6664, 298863163 -> 6620
    //   6664: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   6667: getstatic Perryc.c : I
    //   6670: iflt -> 6684
    //   6673: ldc2_w -2141583598
    //   6676: l2i
    //   6677: ldc_w -549314880
    //   6680: ixor
    //   6681: goto -> 6692
    //   6684: ldc2_w 266056685
    //   6687: l2i
    //   6688: ldc_w 1325802919
    //   6691: ixor
    //   6692: ldc2_w 1702506329
    //   6695: l2i
    //   6696: ldc_w -754985535
    //   6699: ixor
    //   6700: ixor
    //   6701: lookupswitch default -> 6728, -392305846 -> 17276, 2068402397 -> 6684
    //   6728: getfield field_74368_y : Lnet/minecraft/client/settings/KeyBinding;
    //   6731: getstatic Perryc.1 : I
    //   6734: ifeq -> 6748
    //   6737: ldc2_w 689049307
    //   6740: l2i
    //   6741: ldc_w -1717429234
    //   6744: ixor
    //   6745: goto -> 6756
    //   6748: ldc2_w -713513484
    //   6751: l2i
    //   6752: ldc_w -1060824853
    //   6755: ixor
    //   6756: ldc2_w -1671302839
    //   6759: l2i
    //   6760: ldc_w -1176763540
    //   6763: ixor
    //   6764: ixor
    //   6765: lookupswitch default -> 6792, -1794252560 -> 17040, -1549897438 -> 6748
    //   6792: goto -> 6796
    //   6795: athrow
    //   6796: invokevirtual func_151470_d : ()Z
    //   6799: goto -> 6803
    //   6802: athrow
    //   6803: ifeq -> 6817
    //   6806: ldc2_w 2022568911
    //   6809: l2i
    //   6810: ldc_w -1450652608
    //   6813: ixor
    //   6814: goto -> 6825
    //   6817: ldc2_w 1306812316
    //   6820: l2i
    //   6821: ldc_w -1662951406
    //   6824: ixor
    //   6825: ldc2_w -1955669804
    //   6828: l2i
    //   6829: ldc_w 753006099
    //   6832: ixor
    //   6833: ixor
    //   6834: tableswitch default -> 6806, 1988759880 -> 6856, 1988759881 -> 7943
    //   6856: getstatic Perryc.c : I
    //   6859: iflt -> 6873
    //   6862: ldc2_w -540777191
    //   6865: l2i
    //   6866: ldc_w 1888941656
    //   6869: ixor
    //   6870: goto -> 6881
    //   6873: ldc2_w 210798512
    //   6876: l2i
    //   6877: ldc_w -322204020
    //   6880: ixor
    //   6881: ldc2_w 1848492935
    //   6884: l2i
    //   6885: ldc_w 891505287
    //   6888: ixor
    //   6889: ixor
    //   6890: lookupswitch default -> 6916, -280911273 -> 6873, -195290559 -> 17150
    //   6916: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   6919: getstatic Perryc.0 : I
    //   6922: ifle -> 6936
    //   6925: ldc2_w -256527197
    //   6928: l2i
    //   6929: ldc_w 992937547
    //   6932: ixor
    //   6933: goto -> 6944
    //   6936: ldc2_w -2099134897
    //   6939: l2i
    //   6940: ldc_w 407104021
    //   6943: ixor
    //   6944: ldc2_w -1752506326
    //   6947: l2i
    //   6948: ldc_w -2099588958
    //   6951: ixor
    //   6952: ixor
    //   6953: lookupswitch default -> 6980, -557153696 -> 17146, 1519848637 -> 6936
    //   6980: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6983: getstatic Perryc.c : I
    //   6986: iflt -> 7000
    //   6989: ldc2_w -1759759806
    //   6992: l2i
    //   6993: ldc_w 1382764936
    //   6996: ixor
    //   6997: goto -> 7008
    //   7000: ldc2_w 680731089
    //   7003: l2i
    //   7004: ldc_w 291459442
    //   7007: ixor
    //   7008: ldc2_w -1919542224
    //   7011: l2i
    //   7012: ldc_w 1147119573
    //   7015: ixor
    //   7016: ixor
    //   7017: lookupswitch default -> 17048, -268055738 -> 7044, 213833775 -> 7000
    //   7044: dload #5
    //   7046: getstatic Perryc.1 : I
    //   7049: ifeq -> 7063
    //   7052: ldc2_w 166374886
    //   7055: l2i
    //   7056: ldc_w 467766166
    //   7059: ixor
    //   7060: goto -> 7071
    //   7063: ldc2_w -106735894
    //   7066: l2i
    //   7067: ldc_w 1413181949
    //   7070: ixor
    //   7071: ldc2_w -311684423
    //   7074: l2i
    //   7075: ldc_w -1003635719
    //   7078: ixor
    //   7079: ixor
    //   7080: lookupswitch default -> 17108, -2066117033 -> 7108, 994742064 -> 7063
    //   7108: aload_0
    //   7109: getstatic Perryc.0 : I
    //   7112: ifle -> 7126
    //   7115: ldc2_w -221953304
    //   7118: l2i
    //   7119: ldc_w -977350382
    //   7122: ixor
    //   7123: goto -> 7134
    //   7126: ldc2_w 945864999
    //   7129: l2i
    //   7130: ldc_w -1369597491
    //   7133: ixor
    //   7134: ldc2_w -664379660
    //   7137: l2i
    //   7138: ldc_w -1414401988
    //   7141: ixor
    //   7142: ixor
    //   7143: lookupswitch default -> 7168, -428883633 -> 7126, 1152138546 -> 17190
    //   7168: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7171: getstatic Perryc.1 : I
    //   7174: ifeq -> 7188
    //   7177: ldc2_w -1612491644
    //   7180: l2i
    //   7181: ldc_w 283130771
    //   7184: ixor
    //   7185: goto -> 7196
    //   7188: ldc2_w -981861479
    //   7191: l2i
    //   7192: ldc_w -2044518856
    //   7195: ixor
    //   7196: ldc2_w 1329093244
    //   7199: l2i
    //   7200: ldc_w 2070294652
    //   7203: ixor
    //   7204: ixor
    //   7205: lookupswitch default -> 17054, -1151531753 -> 7188, 1996787617 -> 7232
    //   7232: goto -> 7236
    //   7235: athrow
    //   7236: invokevirtual getValue : ()Ljava/lang/Object;
    //   7239: goto -> 7243
    //   7242: athrow
    //   7243: checkcast java/lang/Double
    //   7246: getstatic Perryc.c : I
    //   7249: iflt -> 7263
    //   7252: ldc2_w -2117508448
    //   7255: l2i
    //   7256: ldc_w 1947947800
    //   7259: ixor
    //   7260: goto -> 7271
    //   7263: ldc2_w 462418238
    //   7266: l2i
    //   7267: ldc_w 985565881
    //   7270: ixor
    //   7271: ldc2_w 279417689
    //   7274: l2i
    //   7275: ldc_w 643050301
    //   7278: ixor
    //   7279: ixor
    //   7280: lookupswitch default -> 16984, -1021212196 -> 7263, 398640099 -> 7308
    //   7308: goto -> 7312
    //   7311: athrow
    //   7312: invokevirtual doubleValue : ()D
    //   7315: goto -> 7319
    //   7318: athrow
    //   7319: ldc2_w 0.01025315661411866
    //   7322: invokestatic doubleToLongBits : (D)J
    //   7325: ldc2_w 9213801455510949393
    //   7328: lxor
    //   7329: invokestatic longBitsToDouble : (J)D
    //   7332: ddiv
    //   7333: dmul
    //   7334: getstatic Perryc.1 : I
    //   7337: ifeq -> 7351
    //   7340: ldc2_w 1363448264
    //   7343: l2i
    //   7344: ldc_w -1272818249
    //   7347: ixor
    //   7348: goto -> 7359
    //   7351: ldc2_w -1234604210
    //   7354: l2i
    //   7355: ldc_w 1890424235
    //   7358: ixor
    //   7359: ldc2_w -905669489
    //   7362: l2i
    //   7363: ldc_w 1379126826
    //   7366: ixor
    //   7367: ixor
    //   7368: lookupswitch default -> 7396, -1627089712 -> 7351, 2102501082 -> 17324
    //   7396: putfield field_70159_w : D
    //   7399: getstatic Perryc.c : I
    //   7402: iflt -> 7416
    //   7405: ldc2_w -233923616
    //   7408: l2i
    //   7409: ldc_w 334513432
    //   7412: ixor
    //   7413: goto -> 7424
    //   7416: ldc2_w -819216994
    //   7419: l2i
    //   7420: ldc_w 1001383410
    //   7423: ixor
    //   7424: ldc2_w 1448496787
    //   7427: l2i
    //   7428: ldc_w -422589299
    //   7431: ixor
    //   7432: ixor
    //   7433: lookupswitch default -> 7460, -650309082 -> 7416, 1365728486 -> 17058
    //   7460: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   7463: getstatic Perryc.c : I
    //   7466: iflt -> 7480
    //   7469: ldc2_w -1342640671
    //   7472: l2i
    //   7473: ldc_w -2046379210
    //   7476: ixor
    //   7477: goto -> 7488
    //   7480: ldc2_w 389476232
    //   7483: l2i
    //   7484: ldc_w -1387621099
    //   7487: ixor
    //   7488: ldc2_w -1010643967
    //   7491: l2i
    //   7492: ldc_w -233224383
    //   7495: ixor
    //   7496: ixor
    //   7497: lookupswitch default -> 7524, -302176312 -> 7480, 405134743 -> 17144
    //   7524: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7527: getstatic Perryc.c : I
    //   7530: iflt -> 7544
    //   7533: ldc2_w 1020960282
    //   7536: l2i
    //   7537: ldc_w -571742737
    //   7540: ixor
    //   7541: goto -> 7552
    //   7544: ldc2_w -581305147
    //   7547: l2i
    //   7548: ldc_w -417460568
    //   7551: ixor
    //   7552: ldc2_w 887697429
    //   7555: l2i
    //   7556: ldc_w -1515398791
    //   7559: ixor
    //   7560: ixor
    //   7561: lookupswitch default -> 17102, -1425925375 -> 7588, 1886687897 -> 7544
    //   7588: dload #7
    //   7590: getstatic Perryc.c : I
    //   7593: iflt -> 7607
    //   7596: ldc2_w -15449120
    //   7599: l2i
    //   7600: ldc_w -1835812671
    //   7603: ixor
    //   7604: goto -> 7615
    //   7607: ldc2_w -1700127923
    //   7610: l2i
    //   7611: ldc_w 376700251
    //   7614: ixor
    //   7615: ldc2_w 444484356
    //   7618: l2i
    //   7619: ldc_w -1753081805
    //   7622: ixor
    //   7623: ixor
    //   7624: lookupswitch default -> 7652, -528766954 -> 17174, 1937338556 -> 7607
    //   7652: aload_0
    //   7653: getstatic Perryc.c : I
    //   7656: iflt -> 7670
    //   7659: ldc2_w 1278295506
    //   7662: l2i
    //   7663: ldc_w 245910752
    //   7666: ixor
    //   7667: goto -> 7678
    //   7670: ldc2_w 126282100
    //   7673: l2i
    //   7674: ldc_w 1122441708
    //   7677: ixor
    //   7678: ldc2_w 1698847315
    //   7681: l2i
    //   7682: ldc_w -2005005590
    //   7685: ixor
    //   7686: ixor
    //   7687: lookupswitch default -> 17266, -1470259167 -> 7712, -1348132469 -> 7670
    //   7712: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7715: getstatic Perryc.1 : I
    //   7718: ifeq -> 7732
    //   7721: ldc2_w 2031935182
    //   7724: l2i
    //   7725: ldc_w 1234423890
    //   7728: ixor
    //   7729: goto -> 7740
    //   7732: ldc2_w 1308422055
    //   7735: l2i
    //   7736: ldc_w 980766227
    //   7739: ixor
    //   7740: ldc2_w -1612486757
    //   7743: l2i
    //   7744: ldc_w -134721383
    //   7747: ixor
    //   7748: ixor
    //   7749: lookupswitch default -> 17296, 529700534 -> 7776, 1486109086 -> 7732
    //   7776: goto -> 7780
    //   7779: athrow
    //   7780: invokevirtual getValue : ()Ljava/lang/Object;
    //   7783: goto -> 7787
    //   7786: athrow
    //   7787: checkcast java/lang/Double
    //   7790: getstatic Perryc.0 : I
    //   7793: ifle -> 7807
    //   7796: ldc2_w 1923218468
    //   7799: l2i
    //   7800: ldc_w 368448208
    //   7803: ixor
    //   7804: goto -> 7815
    //   7807: ldc2_w 1148611583
    //   7810: l2i
    //   7811: ldc_w -334860632
    //   7814: ixor
    //   7815: ldc2_w 1844710964
    //   7818: l2i
    //   7819: ldc_w -96988192
    //   7822: ixor
    //   7823: ixor
    //   7824: lookupswitch default -> 7852, -258215136 -> 17176, 1073623872 -> 7807
    //   7852: goto -> 7856
    //   7855: athrow
    //   7856: invokevirtual doubleValue : ()D
    //   7859: goto -> 7863
    //   7862: athrow
    //   7863: ldc2_w 0.011553645414278469
    //   7866: invokestatic doubleToLongBits : (D)J
    //   7869: ldc2_w 9213988186309630381
    //   7872: lxor
    //   7873: invokestatic longBitsToDouble : (J)D
    //   7876: ddiv
    //   7877: dmul
    //   7878: getstatic Perryc.1 : I
    //   7881: ifeq -> 7895
    //   7884: ldc2_w 2028031772
    //   7887: l2i
    //   7888: ldc_w -1816251377
    //   7891: ixor
    //   7892: goto -> 7903
    //   7895: ldc2_w -1619558475
    //   7898: l2i
    //   7899: ldc_w -1721510424
    //   7902: ixor
    //   7903: ldc2_w 935482163
    //   7906: l2i
    //   7907: ldc_w -190782920
    //   7910: ixor
    //   7911: ixor
    //   7912: lookupswitch default -> 17090, -982115498 -> 7940, 675138072 -> 7895
    //   7940: putfield field_70179_y : D
    //   7943: getstatic Perryc.c : I
    //   7946: iflt -> 7960
    //   7949: ldc2_w -1791151426
    //   7952: l2i
    //   7953: ldc_w -447004321
    //   7956: ixor
    //   7957: goto -> 7968
    //   7960: ldc2_w 39949903
    //   7963: l2i
    //   7964: ldc_w 496839578
    //   7967: ixor
    //   7968: ldc2_w -911377783
    //   7971: l2i
    //   7972: ldc_w -1358272808
    //   7975: ixor
    //   7976: ixor
    //   7977: lookupswitch default -> 8004, -1302890215 -> 7960, 381775792 -> 17358
    //   8004: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   8007: getstatic Perryc.1 : I
    //   8010: ifeq -> 8024
    //   8013: ldc2_w -629517235
    //   8016: l2i
    //   8017: ldc_w -1727769839
    //   8020: ixor
    //   8021: goto -> 8032
    //   8024: ldc2_w -1647400884
    //   8027: l2i
    //   8028: ldc_w 134695491
    //   8031: ixor
    //   8032: ldc2_w -1125062019
    //   8035: l2i
    //   8036: ldc_w -674878370
    //   8039: ixor
    //   8040: ixor
    //   8041: lookupswitch default -> 17084, -16833492 -> 8068, 675856767 -> 8024
    //   8068: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8071: ldc2_w 1.0099888880092555E308
    //   8074: invokestatic doubleToLongBits : (D)J
    //   8077: ldc2_w 9214921707405936309
    //   8080: lxor
    //   8081: invokestatic longBitsToDouble : (J)D
    //   8084: getstatic Perryc.1 : I
    //   8087: ifeq -> 8101
    //   8090: ldc2_w 885258212
    //   8093: l2i
    //   8094: ldc_w 428346815
    //   8097: ixor
    //   8098: goto -> 8109
    //   8101: ldc2_w -2087834281
    //   8104: l2i
    //   8105: ldc_w -150592232
    //   8108: ixor
    //   8109: ldc2_w 1930085467
    //   8112: l2i
    //   8113: ldc_w 1547968002
    //   8116: ixor
    //   8117: ixor
    //   8118: lookupswitch default -> 17030, 33890306 -> 8101, 1539756566 -> 8144
    //   8144: putfield field_70181_x : D
    //   8147: ldc2_w 1627629716
    //   8150: l2i
    //   8151: ldc_w 1627629716
    //   8154: ixor
    //   8155: getstatic Perryc.1 : I
    //   8158: ifeq -> 8172
    //   8161: ldc2_w 137297823
    //   8164: l2i
    //   8165: ldc_w 741826595
    //   8168: ixor
    //   8169: goto -> 8180
    //   8172: ldc2_w -746557061
    //   8175: l2i
    //   8176: ldc_w 783327411
    //   8179: ixor
    //   8180: ldc2_w 1318547501
    //   8183: l2i
    //   8184: ldc_w -2144227167
    //   8187: ixor
    //   8188: ixor
    //   8189: lookupswitch default -> 8216, -356557008 -> 17222, 843440310 -> 8172
    //   8216: istore #13
    //   8218: getstatic Perryc.1 : I
    //   8221: ifeq -> 8235
    //   8224: ldc2_w -458190026
    //   8227: l2i
    //   8228: ldc_w 764622549
    //   8231: ixor
    //   8232: goto -> 8243
    //   8235: ldc2_w 302347372
    //   8238: l2i
    //   8239: ldc_w 1034063327
    //   8242: ixor
    //   8243: ldc2_w 1343410492
    //   8246: l2i
    //   8247: ldc_w 104650119
    //   8250: ixor
    //   8251: ixor
    //   8252: lookupswitch default -> 17192, -1626496680 -> 8235, 2039086344 -> 8280
    //   8280: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   8283: getstatic Perryc.c : I
    //   8286: iflt -> 8300
    //   8289: ldc2_w 967832103
    //   8292: l2i
    //   8293: ldc_w -1180135071
    //   8296: ixor
    //   8297: goto -> 8308
    //   8300: ldc2_w 1623716907
    //   8303: l2i
    //   8304: ldc_w -2132847632
    //   8307: ixor
    //   8308: ldc2_w 1884357944
    //   8311: l2i
    //   8312: ldc_w 1496617199
    //   8315: ixor
    //   8316: ixor
    //   8317: lookupswitch default -> 8344, -1453132143 -> 17126, -906592943 -> 8300
    //   8344: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8347: ldc2_w 476945831
    //   8350: l2i
    //   8351: ldc_w 476945830
    //   8354: ixor
    //   8355: getstatic Perryc.1 : I
    //   8358: ifeq -> 8372
    //   8361: ldc2_w -1303499819
    //   8364: l2i
    //   8365: ldc_w 1556522439
    //   8368: ixor
    //   8369: goto -> 8380
    //   8372: ldc2_w -942975826
    //   8375: l2i
    //   8376: ldc_w -1680572540
    //   8379: ixor
    //   8380: ldc2_w -71981992
    //   8383: l2i
    //   8384: ldc_w 1683870696
    //   8387: ixor
    //   8388: ixor
    //   8389: lookupswitch default -> 8416, 422540332 -> 8372, 1902180770 -> 17216
    //   8416: putfield field_70145_X : Z
    //   8419: getstatic Perryc.0 : I
    //   8422: ifle -> 8436
    //   8425: ldc2_w 1225295763
    //   8428: l2i
    //   8429: ldc_w -1065287441
    //   8432: ixor
    //   8433: goto -> 8444
    //   8436: ldc2_w -2003924451
    //   8439: l2i
    //   8440: ldc_w -1722267260
    //   8443: ixor
    //   8444: ldc2_w 2087299039
    //   8447: l2i
    //   8448: ldc_w -1426994565
    //   8451: ixor
    //   8452: ixor
    //   8453: lookupswitch default -> 17242, -951144899 -> 8480, 1595009752 -> 8436
    //   8480: iload #13
    //   8482: ifeq -> 8496
    //   8485: ldc2_w 673165663
    //   8488: l2i
    //   8489: ldc_w 1956255135
    //   8492: ixor
    //   8493: goto -> 8504
    //   8496: ldc2_w 1197945070
    //   8499: l2i
    //   8500: ldc_w 467833903
    //   8503: ixor
    //   8504: ldc2_w -685508709
    //   8507: l2i
    //   8508: ldc_w 1828177933
    //   8511: ixor
    //   8512: ixor
    //   8513: tableswitch default -> 8485, -414082218 -> 8536, -414082217 -> 11591
    //   8536: getstatic Perryc.c : I
    //   8539: iflt -> 8553
    //   8542: ldc2_w 2033470048
    //   8545: l2i
    //   8546: ldc_w 2042035976
    //   8549: ixor
    //   8550: goto -> 8561
    //   8553: ldc2_w -2051612149
    //   8556: l2i
    //   8557: ldc_w -616894563
    //   8560: ixor
    //   8561: ldc2_w -625389838
    //   8564: l2i
    //   8565: ldc_w -1955948926
    //   8568: ixor
    //   8569: ixor
    //   8570: lookupswitch default -> 17096, 257938918 -> 8596, 1364290840 -> 8553
    //   8596: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   8599: getstatic Perryc.c : I
    //   8602: iflt -> 8616
    //   8605: ldc2_w 663346974
    //   8608: l2i
    //   8609: ldc_w 712324891
    //   8612: ixor
    //   8613: goto -> 8624
    //   8616: ldc2_w 1085432303
    //   8619: l2i
    //   8620: ldc_w 1689429682
    //   8623: ixor
    //   8624: ldc2_w -2072417071
    //   8627: l2i
    //   8628: ldc_w 1222196966
    //   8631: ixor
    //   8632: ixor
    //   8633: lookupswitch default -> 8660, -1050887630 -> 17262, 565918988 -> 8616
    //   8660: goto -> 8664
    //   8663: athrow
    //   8664: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   8667: goto -> 8671
    //   8670: athrow
    //   8671: new net/minecraft/network/play/client/CPacketPlayer$Position
    //   8674: dup
    //   8675: getstatic Perryc.1 : I
    //   8678: ifeq -> 8692
    //   8681: ldc2_w 2007662736
    //   8684: l2i
    //   8685: ldc_w -1156970702
    //   8688: ixor
    //   8689: goto -> 8700
    //   8692: ldc2_w -828418710
    //   8695: l2i
    //   8696: ldc_w -1083058916
    //   8699: ixor
    //   8700: ldc2_w 1545478353
    //   8703: l2i
    //   8704: ldc_w 302533877
    //   8707: ixor
    //   8708: ixor
    //   8709: lookupswitch default -> 8736, -2101941370 -> 17034, 282388972 -> 8692
    //   8736: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   8739: getstatic Perryc.1 : I
    //   8742: ifeq -> 8756
    //   8745: ldc2_w 1875124664
    //   8748: l2i
    //   8749: ldc_w -1863292019
    //   8752: ixor
    //   8753: goto -> 8764
    //   8756: ldc2_w -689944572
    //   8759: l2i
    //   8760: ldc_w 1297023518
    //   8763: ixor
    //   8764: ldc2_w 1388094193
    //   8767: l2i
    //   8768: ldc_w 236764898
    //   8771: ixor
    //   8772: ixor
    //   8773: lookupswitch default -> 17226, -1550559706 -> 8756, -955296247 -> 8800
    //   8800: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8803: getstatic Perryc.1 : I
    //   8806: ifeq -> 8820
    //   8809: ldc2_w -1572719504
    //   8812: l2i
    //   8813: ldc_w 1195505156
    //   8816: ixor
    //   8817: goto -> 8828
    //   8820: ldc2_w -140312842
    //   8823: l2i
    //   8824: ldc_w -1419031142
    //   8827: ixor
    //   8828: ldc2_w -1753942377
    //   8831: l2i
    //   8832: ldc_w -338570404
    //   8835: ixor
    //   8836: ixor
    //   8837: lookupswitch default -> 8864, -1717114945 -> 17234, -928054165 -> 8820
    //   8864: getfield field_70165_t : D
    //   8867: getstatic Perryc.c : I
    //   8870: iflt -> 8884
    //   8873: ldc2_w -1020323460
    //   8876: l2i
    //   8877: ldc_w 1707472491
    //   8880: ixor
    //   8881: goto -> 8892
    //   8884: ldc2_w 1827308731
    //   8887: l2i
    //   8888: ldc_w 1110752572
    //   8891: ixor
    //   8892: ldc2_w 111204389
    //   8895: l2i
    //   8896: ldc_w 1188192957
    //   8899: ixor
    //   8900: ixor
    //   8901: lookupswitch default -> 17346, -426224241 -> 8884, 1856799519 -> 8928
    //   8928: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   8931: getstatic Perryc.c : I
    //   8934: iflt -> 8948
    //   8937: ldc2_w -1655699633
    //   8940: l2i
    //   8941: ldc_w -2018297425
    //   8944: ixor
    //   8945: goto -> 8956
    //   8948: ldc2_w 1110290093
    //   8951: l2i
    //   8952: ldc_w -2080112218
    //   8955: ixor
    //   8956: ldc2_w 1148342236
    //   8959: l2i
    //   8960: ldc_w -665759039
    //   8963: ixor
    //   8964: ixor
    //   8965: lookupswitch default -> 8992, -2034228227 -> 17078, 1941586909 -> 8948
    //   8992: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8995: getstatic Perryc.c : I
    //   8998: iflt -> 9012
    //   9001: ldc2_w -275991859
    //   9004: l2i
    //   9005: ldc_w -464664246
    //   9008: ixor
    //   9009: goto -> 9020
    //   9012: ldc2_w 471292580
    //   9015: l2i
    //   9016: ldc_w -330495590
    //   9019: ixor
    //   9020: ldc2_w 1518031724
    //   9023: l2i
    //   9024: ldc_w -1059528091
    //   9027: ixor
    //   9028: ixor
    //   9029: lookupswitch default -> 9056, -1855796594 -> 17036, -1052118565 -> 9012
    //   9056: getfield field_70159_w : D
    //   9059: dadd
    //   9060: getstatic Perryc.0 : I
    //   9063: ifle -> 9077
    //   9066: ldc2_w 1950127238
    //   9069: l2i
    //   9070: ldc_w 1285347290
    //   9073: ixor
    //   9074: goto -> 9085
    //   9077: ldc2_w -1747740485
    //   9080: l2i
    //   9081: ldc_w -1079876096
    //   9084: ixor
    //   9085: ldc2_w -1096701053
    //   9088: l2i
    //   9089: ldc_w -1777496045
    //   9092: ixor
    //   9093: ixor
    //   9094: lookupswitch default -> 17062, 14533931 -> 9120, 269252812 -> 9077
    //   9120: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   9123: getstatic Perryc.c : I
    //   9126: iflt -> 9140
    //   9129: ldc2_w -1061335595
    //   9132: l2i
    //   9133: ldc_w 541470539
    //   9136: ixor
    //   9137: goto -> 9148
    //   9140: ldc2_w 243205371
    //   9143: l2i
    //   9144: ldc_w 305294403
    //   9147: ixor
    //   9148: ldc2_w 366450145
    //   9151: l2i
    //   9152: ldc_w 317447109
    //   9155: ixor
    //   9156: ixor
    //   9157: lookupswitch default -> 17104, -406377286 -> 9140, 460400284 -> 9184
    //   9184: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9187: getstatic Perryc.1 : I
    //   9190: ifeq -> 9204
    //   9193: ldc2_w -919873248
    //   9196: l2i
    //   9197: ldc_w -1471685150
    //   9200: ixor
    //   9201: goto -> 9212
    //   9204: ldc2_w 1180333684
    //   9207: l2i
    //   9208: ldc_w 1264163090
    //   9211: ixor
    //   9212: ldc2_w 1117555988
    //   9215: l2i
    //   9216: ldc_w 2069868728
    //   9219: ixor
    //   9220: ixor
    //   9221: lookupswitch default -> 9248, -247976582 -> 9204, 1487878510 -> 17314
    //   9248: getfield field_70163_u : D
    //   9251: getstatic Perryc.1 : I
    //   9254: ifeq -> 9268
    //   9257: ldc2_w 1227309104
    //   9260: l2i
    //   9261: ldc_w 1942401892
    //   9264: ixor
    //   9265: goto -> 9276
    //   9268: ldc2_w 1220091677
    //   9271: l2i
    //   9272: ldc_w 717986651
    //   9275: ixor
    //   9276: ldc2_w 748321128
    //   9279: l2i
    //   9280: ldc_w 2136669966
    //   9283: ixor
    //   9284: ixor
    //   9285: lookupswitch default -> 17138, 833749536 -> 9312, 1763800370 -> 9268
    //   9312: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   9315: getstatic Perryc.c : I
    //   9318: iflt -> 9332
    //   9321: ldc2_w 1762996813
    //   9324: l2i
    //   9325: ldc_w -709567875
    //   9328: ixor
    //   9329: goto -> 9340
    //   9332: ldc2_w 790010610
    //   9335: l2i
    //   9336: ldc_w 507612148
    //   9339: ixor
    //   9340: ldc2_w 2115825154
    //   9343: l2i
    //   9344: ldc_w -635062354
    //   9347: ixor
    //   9348: ixor
    //   9349: lookupswitch default -> 9376, 412660124 -> 17070, 1107597745 -> 9332
    //   9376: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9379: getstatic Perryc.1 : I
    //   9382: ifeq -> 9396
    //   9385: ldc2_w 1709614541
    //   9388: l2i
    //   9389: ldc_w -1424448359
    //   9392: ixor
    //   9393: goto -> 9404
    //   9396: ldc2_w -467548384
    //   9399: l2i
    //   9400: ldc_w -61316960
    //   9403: ixor
    //   9404: ldc2_w 1107281415
    //   9407: l2i
    //   9408: ldc_w -391050729
    //   9411: ixor
    //   9412: ixor
    //   9413: lookupswitch default -> 17122, -1321768048 -> 9440, 1739640132 -> 9396
    //   9440: getfield field_70163_u : D
    //   9443: ldc2_w -13.40881711116384
    //   9446: invokestatic doubleToLongBits : (D)J
    //   9449: ldc2_w 9206920562116817795
    //   9452: lxor
    //   9453: invokestatic longBitsToDouble : (J)D
    //   9456: dcmpg
    //   9457: ifge -> 9471
    //   9460: ldc2_w -1834183223
    //   9463: l2i
    //   9464: ldc_w -1926099926
    //   9467: ixor
    //   9468: goto -> 9479
    //   9471: ldc2_w 493034893
    //   9474: l2i
    //   9475: ldc_w 50168943
    //   9478: ixor
    //   9479: ldc2_w 605050583
    //   9482: l2i
    //   9483: ldc_w -1667437858
    //   9486: ixor
    //   9487: ixor
    //   9488: tableswitch default -> 9460, -1491982870 -> 9512, -1491982869 -> 9800
    //   9512: getstatic Perryc.c : I
    //   9515: iflt -> 9529
    //   9518: ldc2_w 476680655
    //   9521: l2i
    //   9522: ldc_w -1431390642
    //   9525: ixor
    //   9526: goto -> 9537
    //   9529: ldc2_w -1454406920
    //   9532: l2i
    //   9533: ldc_w 287624936
    //   9536: ixor
    //   9537: ldc2_w 1067977881
    //   9540: l2i
    //   9541: ldc_w -1496405185
    //   9544: ixor
    //   9545: ixor
    //   9546: lookupswitch default -> 17288, 554560438 -> 9572, 799113255 -> 9529
    //   9572: aload_0
    //   9573: getstatic Perryc.0 : I
    //   9576: ifle -> 9590
    //   9579: ldc2_w -1362272058
    //   9582: l2i
    //   9583: ldc_w 2121551201
    //   9586: ixor
    //   9587: goto -> 9598
    //   9590: ldc2_w -1796515980
    //   9593: l2i
    //   9594: ldc_w -349273843
    //   9597: ixor
    //   9598: ldc2_w 935973305
    //   9601: l2i
    //   9602: ldc_w 1047326836
    //   9605: ixor
    //   9606: ixor
    //   9607: lookupswitch default -> 17312, -652473238 -> 9590, 1986066356 -> 9632
    //   9632: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9635: getstatic Perryc.1 : I
    //   9638: ifeq -> 9652
    //   9641: ldc2_w -306035125
    //   9644: l2i
    //   9645: ldc_w 638403192
    //   9648: ixor
    //   9649: goto -> 9660
    //   9652: ldc2_w -412226160
    //   9655: l2i
    //   9656: ldc_w -1322606582
    //   9659: ixor
    //   9660: ldc2_w 1593743882
    //   9663: l2i
    //   9664: ldc_w -1306465080
    //   9667: ixor
    //   9668: ixor
    //   9669: lookupswitch default -> 9696, 482003208 -> 9652, 655454961 -> 17422
    //   9696: goto -> 9700
    //   9699: athrow
    //   9700: invokevirtual getValue : ()Ljava/lang/Object;
    //   9703: goto -> 9707
    //   9706: athrow
    //   9707: checkcast java/lang/Double
    //   9710: getstatic Perryc.c : I
    //   9713: iflt -> 9727
    //   9716: ldc2_w -1353098260
    //   9719: l2i
    //   9720: ldc_w -676196635
    //   9723: ixor
    //   9724: goto -> 9735
    //   9727: ldc2_w 977062616
    //   9730: l2i
    //   9731: ldc_w 1067246875
    //   9734: ixor
    //   9735: ldc2_w 1907830035
    //   9738: l2i
    //   9739: ldc_w 1619641955
    //   9742: ixor
    //   9743: ixor
    //   9744: lookupswitch default -> 9772, 1690602036 -> 9727, 1775615609 -> 17430
    //   9772: goto -> 9776
    //   9775: athrow
    //   9776: invokevirtual doubleValue : ()D
    //   9779: goto -> 9783
    //   9782: athrow
    //   9783: ldc2_w 0.02501449933048795
    //   9786: invokestatic doubleToLongBits : (D)J
    //   9789: ldc2_w 9205530702478800707
    //   9792: lxor
    //   9793: invokestatic longBitsToDouble : (J)D
    //   9796: ddiv
    //   9797: goto -> 9813
    //   9800: ldc2_w 6.780487304365335E307
    //   9803: invokestatic doubleToLongBits : (D)J
    //   9806: ldc2_w 9212152257405719591
    //   9809: lxor
    //   9810: invokestatic longBitsToDouble : (J)D
    //   9813: dadd
    //   9814: getstatic Perryc.c : I
    //   9817: iflt -> 9831
    //   9820: ldc2_w -1707161234
    //   9823: l2i
    //   9824: ldc_w 370738367
    //   9827: ixor
    //   9828: goto -> 9839
    //   9831: ldc2_w -1616042862
    //   9834: l2i
    //   9835: ldc_w -1300768852
    //   9838: ixor
    //   9839: ldc2_w 651495027
    //   9842: l2i
    //   9843: ldc_w 1159397347
    //   9846: ixor
    //   9847: ixor
    //   9848: lookupswitch default -> 17270, -269994943 -> 9831, 1310001838 -> 9876
    //   9876: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   9879: getstatic Perryc.1 : I
    //   9882: ifeq -> 9896
    //   9885: ldc2_w 1080929357
    //   9888: l2i
    //   9889: ldc_w -587415081
    //   9892: ixor
    //   9893: goto -> 9904
    //   9896: ldc2_w -1647149058
    //   9899: l2i
    //   9900: ldc_w 1591439982
    //   9903: ixor
    //   9904: ldc2_w 1300447853
    //   9907: l2i
    //   9908: ldc_w 1792288649
    //   9911: ixor
    //   9912: ixor
    //   9913: lookupswitch default -> 9940, -1818406845 -> 9896, -1144649602 -> 17316
    //   9940: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   9943: getstatic Perryc.0 : I
    //   9946: ifle -> 9960
    //   9949: ldc2_w -1877031620
    //   9952: l2i
    //   9953: ldc_w 1675925071
    //   9956: ixor
    //   9957: goto -> 9968
    //   9960: ldc2_w 1028912739
    //   9963: l2i
    //   9964: ldc_w -239575382
    //   9967: ixor
    //   9968: ldc2_w 527361104
    //   9971: l2i
    //   9972: ldc_w 1901948475
    //   9975: ixor
    //   9976: ixor
    //   9977: lookupswitch default -> 10004, -1852168205 -> 9960, -1647716072 -> 17202
    //   10004: getfield field_74314_A : Lnet/minecraft/client/settings/KeyBinding;
    //   10007: getstatic Perryc.0 : I
    //   10010: ifle -> 10024
    //   10013: ldc2_w 1799431608
    //   10016: l2i
    //   10017: ldc_w 795642215
    //   10020: ixor
    //   10021: goto -> 10032
    //   10024: ldc2_w -76411325
    //   10027: l2i
    //   10028: ldc_w 590604688
    //   10031: ixor
    //   10032: ldc2_w 877352315
    //   10035: l2i
    //   10036: ldc_w -1332373392
    //   10039: ixor
    //   10040: ixor
    //   10041: lookupswitch default -> 10068, -1191064804 -> 10024, -1057791532 -> 17434
    //   10068: goto -> 10072
    //   10071: athrow
    //   10072: invokevirtual func_151470_d : ()Z
    //   10075: goto -> 10079
    //   10078: athrow
    //   10079: ifeq -> 10093
    //   10082: ldc2_w 38518113
    //   10085: l2i
    //   10086: ldc_w 1978609628
    //   10089: ixor
    //   10090: goto -> 10101
    //   10093: ldc2_w 1950875124
    //   10096: l2i
    //   10097: ldc_w 65236810
    //   10100: ixor
    //   10101: ldc2_w 2020134348
    //   10104: l2i
    //   10105: ldc_w -1333940112
    //   10108: ixor
    //   10109: ixor
    //   10110: tableswitch default -> 10082, -1078857983 -> 10132, -1078857982 -> 10420
    //   10132: getstatic Perryc.c : I
    //   10135: iflt -> 10149
    //   10138: ldc2_w 1937856144
    //   10141: l2i
    //   10142: ldc_w -34967082
    //   10145: ixor
    //   10146: goto -> 10157
    //   10149: ldc2_w -1018790514
    //   10152: l2i
    //   10153: ldc_w 1716903013
    //   10156: ixor
    //   10157: ldc2_w 839373476
    //   10160: l2i
    //   10161: ldc_w -1571769293
    //   10164: ixor
    //   10165: ixor
    //   10166: lookupswitch default -> 17248, 507265489 -> 10149, 893699964 -> 10192
    //   10192: aload_0
    //   10193: getstatic Perryc.0 : I
    //   10196: ifle -> 10210
    //   10199: ldc2_w 1103674867
    //   10202: l2i
    //   10203: ldc_w -1098752193
    //   10206: ixor
    //   10207: goto -> 10218
    //   10210: ldc2_w 52532168
    //   10213: l2i
    //   10214: ldc_w 243988375
    //   10217: ixor
    //   10218: ldc2_w -716020007
    //   10221: l2i
    //   10222: ldc_w -1199863618
    //   10225: ixor
    //   10226: ixor
    //   10227: lookupswitch default -> 17282, -1839002453 -> 10210, 1619167800 -> 10252
    //   10252: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10255: getstatic Perryc.1 : I
    //   10258: ifeq -> 10272
    //   10261: ldc2_w -1314494665
    //   10264: l2i
    //   10265: ldc_w -747216388
    //   10268: ixor
    //   10269: goto -> 10280
    //   10272: ldc2_w 131525759
    //   10275: l2i
    //   10276: ldc_w -844233598
    //   10279: ixor
    //   10280: ldc2_w -298377924
    //   10283: l2i
    //   10284: ldc_w 1177841871
    //   10287: ixor
    //   10288: ixor
    //   10289: lookupswitch default -> 17024, -892114120 -> 10272, 1652262158 -> 10316
    //   10316: goto -> 10320
    //   10319: athrow
    //   10320: invokevirtual getValue : ()Ljava/lang/Object;
    //   10323: goto -> 10327
    //   10326: athrow
    //   10327: checkcast java/lang/Double
    //   10330: getstatic Perryc.c : I
    //   10333: iflt -> 10347
    //   10336: ldc2_w 935501135
    //   10339: l2i
    //   10340: ldc_w 884994676
    //   10343: ixor
    //   10344: goto -> 10355
    //   10347: ldc2_w 1235372640
    //   10350: l2i
    //   10351: ldc_w 353586512
    //   10354: ixor
    //   10355: ldc2_w 901364044
    //   10358: l2i
    //   10359: ldc_w 1280640409
    //   10362: ixor
    //   10363: ixor
    //   10364: lookupswitch default -> 17172, 626899941 -> 10392, 2056377326 -> 10347
    //   10392: goto -> 10396
    //   10395: athrow
    //   10396: invokevirtual doubleValue : ()D
    //   10399: goto -> 10403
    //   10402: athrow
    //   10403: ldc2_w 0.06613561898976583
    //   10406: invokestatic doubleToLongBits : (D)J
    //   10409: ldc2_w 9217160086347671848
    //   10412: lxor
    //   10413: invokestatic longBitsToDouble : (J)D
    //   10416: ddiv
    //   10417: goto -> 10433
    //   10420: ldc2_w 6.435322811196582E307
    //   10423: invokestatic doubleToLongBits : (D)J
    //   10426: ldc2_w 9211806373527615917
    //   10429: lxor
    //   10430: invokestatic longBitsToDouble : (J)D
    //   10433: dadd
    //   10434: getstatic Perryc.1 : I
    //   10437: ifeq -> 10451
    //   10440: ldc2_w -966740366
    //   10443: l2i
    //   10444: ldc_w 860004616
    //   10447: ixor
    //   10448: goto -> 10459
    //   10451: ldc2_w -1984911713
    //   10454: l2i
    //   10455: ldc_w 645746768
    //   10458: ixor
    //   10459: ldc2_w 245895090
    //   10462: l2i
    //   10463: ldc_w -985783109
    //   10466: ixor
    //   10467: ixor
    //   10468: lookupswitch default -> 10496, 640223943 -> 10451, 1051999347 -> 17044
    //   10496: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   10499: getstatic Perryc.0 : I
    //   10502: ifle -> 10516
    //   10505: ldc2_w -40811618
    //   10508: l2i
    //   10509: ldc_w 1160354505
    //   10512: ixor
    //   10513: goto -> 10524
    //   10516: ldc2_w -1115925051
    //   10519: l2i
    //   10520: ldc_w 106786535
    //   10523: ixor
    //   10524: ldc2_w -419413005
    //   10527: l2i
    //   10528: ldc_w -216834007
    //   10531: ixor
    //   10532: ixor
    //   10533: lookupswitch default -> 17256, -1398015347 -> 10516, -1355671304 -> 10560
    //   10560: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   10563: getstatic Perryc.c : I
    //   10566: iflt -> 10580
    //   10569: ldc2_w -425478307
    //   10572: l2i
    //   10573: ldc_w 330315318
    //   10576: ixor
    //   10577: goto -> 10588
    //   10580: ldc2_w -1034617505
    //   10583: l2i
    //   10584: ldc_w 440288234
    //   10587: ixor
    //   10588: ldc2_w -1021478277
    //   10591: l2i
    //   10592: ldc_w 1736581766
    //   10595: ixor
    //   10596: ixor
    //   10597: lookupswitch default -> 17278, 1368185238 -> 10580, 2096490056 -> 10624
    //   10624: getfield field_74311_E : Lnet/minecraft/client/settings/KeyBinding;
    //   10627: getstatic Perryc.c : I
    //   10630: iflt -> 10644
    //   10633: ldc2_w -978166974
    //   10636: l2i
    //   10637: ldc_w 835666663
    //   10640: ixor
    //   10641: goto -> 10652
    //   10644: ldc2_w -463383123
    //   10647: l2i
    //   10648: ldc_w 437437693
    //   10651: ixor
    //   10652: ldc2_w -1296215088
    //   10655: l2i
    //   10656: ldc_w -519607101
    //   10659: ixor
    //   10660: ixor
    //   10661: lookupswitch default -> 17236, -1480120650 -> 10644, -1379291581 -> 10688
    //   10688: goto -> 10692
    //   10691: athrow
    //   10692: invokevirtual func_151470_d : ()Z
    //   10695: goto -> 10699
    //   10698: athrow
    //   10699: ifeq -> 10713
    //   10702: ldc2_w -795683349
    //   10705: l2i
    //   10706: ldc_w -1309414160
    //   10709: ixor
    //   10710: goto -> 10721
    //   10713: ldc2_w 1700288576
    //   10716: l2i
    //   10717: ldc_w 70869348
    //   10720: ixor
    //   10721: ldc2_w -1987767651
    //   10724: l2i
    //   10725: ldc_w 2033826137
    //   10728: ixor
    //   10729: ixor
    //   10730: tableswitch default -> 10702, -1847749921 -> 10752, -1847749920 -> 11040
    //   10752: getstatic Perryc.0 : I
    //   10755: ifle -> 10769
    //   10758: ldc2_w -589000138
    //   10761: l2i
    //   10762: ldc_w 170772992
    //   10765: ixor
    //   10766: goto -> 10777
    //   10769: ldc2_w -447061053
    //   10772: l2i
    //   10773: ldc_w 1382358963
    //   10776: ixor
    //   10777: ldc2_w 2133868342
    //   10780: l2i
    //   10781: ldc_w 1244195494
    //   10784: ixor
    //   10785: ixor
    //   10786: lookupswitch default -> 17388, -2111329824 -> 10812, -472805978 -> 10769
    //   10812: aload_0
    //   10813: getstatic Perryc.c : I
    //   10816: iflt -> 10830
    //   10819: ldc2_w -1845974280
    //   10822: l2i
    //   10823: ldc_w -958921805
    //   10826: ixor
    //   10827: goto -> 10838
    //   10830: ldc2_w 87871405
    //   10833: l2i
    //   10834: ldc_w -1101327275
    //   10837: ixor
    //   10838: ldc2_w -769957900
    //   10841: l2i
    //   10842: ldc_w -175535808
    //   10845: ixor
    //   10846: ixor
    //   10847: lookupswitch default -> 17342, -1661661876 -> 10872, 1890746367 -> 10830
    //   10872: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10875: getstatic Perryc.c : I
    //   10878: iflt -> 10892
    //   10881: ldc2_w 1366587206
    //   10884: l2i
    //   10885: ldc_w -590386671
    //   10888: ixor
    //   10889: goto -> 10900
    //   10892: ldc2_w -1933560831
    //   10895: l2i
    //   10896: ldc_w 326883651
    //   10899: ixor
    //   10900: ldc2_w -1268304558
    //   10903: l2i
    //   10904: ldc_w 945770051
    //   10907: ixor
    //   10908: ixor
    //   10909: lookupswitch default -> 17406, 25388614 -> 10892, 327390803 -> 10936
    //   10936: goto -> 10940
    //   10939: athrow
    //   10940: invokevirtual getValue : ()Ljava/lang/Object;
    //   10943: goto -> 10947
    //   10946: athrow
    //   10947: checkcast java/lang/Double
    //   10950: getstatic Perryc.c : I
    //   10953: iflt -> 10967
    //   10956: ldc2_w -579143182
    //   10959: l2i
    //   10960: ldc_w 617629762
    //   10963: ixor
    //   10964: goto -> 10975
    //   10967: ldc2_w 201826849
    //   10970: l2i
    //   10971: ldc_w -1715358621
    //   10974: ixor
    //   10975: ldc2_w 936825484
    //   10978: l2i
    //   10979: ldc_w -295552773
    //   10982: ixor
    //   10983: ixor
    //   10984: lookupswitch default -> 11012, -17485563 -> 10967, 538860487 -> 17010
    //   11012: goto -> 11016
    //   11015: athrow
    //   11016: invokevirtual doubleValue : ()D
    //   11019: goto -> 11023
    //   11022: athrow
    //   11023: ldc2_w 0.009880882436254736
    //   11026: invokestatic doubleToLongBits : (D)J
    //   11029: ldc2_w 9213586854058314817
    //   11032: lxor
    //   11033: invokestatic longBitsToDouble : (J)D
    //   11036: ddiv
    //   11037: goto -> 11053
    //   11040: ldc2_w 1.3440306805757576E308
    //   11043: invokestatic doubleToLongBits : (D)J
    //   11046: ldc2_w 9216595397384892469
    //   11049: lxor
    //   11050: invokestatic longBitsToDouble : (J)D
    //   11053: dsub
    //   11054: getstatic Perryc.c : I
    //   11057: iflt -> 11071
    //   11060: ldc2_w -2075463209
    //   11063: l2i
    //   11064: ldc_w -188389457
    //   11067: ixor
    //   11068: goto -> 11079
    //   11071: ldc2_w 1379697848
    //   11074: l2i
    //   11075: ldc_w 1019044130
    //   11078: ixor
    //   11079: ldc2_w -1897747341
    //   11082: l2i
    //   11083: ldc_w -1742389887
    //   11086: ixor
    //   11087: ixor
    //   11088: lookupswitch default -> 11116, -160141732 -> 11071, 1715996554 -> 17214
    //   11116: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   11119: getstatic Perryc.1 : I
    //   11122: ifeq -> 11136
    //   11125: ldc2_w -1693994799
    //   11128: l2i
    //   11129: ldc_w -1370977850
    //   11132: ixor
    //   11133: goto -> 11144
    //   11136: ldc2_w -264103505
    //   11139: l2i
    //   11140: ldc_w 858881372
    //   11143: ixor
    //   11144: ldc2_w -226591647
    //   11147: l2i
    //   11148: ldc_w -1561776925
    //   11151: ixor
    //   11152: ixor
    //   11153: lookupswitch default -> 11180, -746116901 -> 11136, 1708681621 -> 17004
    //   11180: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11183: getstatic Perryc.0 : I
    //   11186: ifle -> 11200
    //   11189: ldc2_w 1827087008
    //   11192: l2i
    //   11193: ldc_w -1925102488
    //   11196: ixor
    //   11197: goto -> 11208
    //   11200: ldc2_w 2077972439
    //   11203: l2i
    //   11204: ldc_w -319894353
    //   11207: ixor
    //   11208: ldc2_w 1812169439
    //   11211: l2i
    //   11212: ldc_w -565326814
    //   11215: ixor
    //   11216: ixor
    //   11217: lookupswitch default -> 11244, 1025892350 -> 11200, 1407723573 -> 17186
    //   11244: getfield field_70161_v : D
    //   11247: getstatic Perryc.0 : I
    //   11250: ifle -> 11264
    //   11253: ldc2_w 982045245
    //   11256: l2i
    //   11257: ldc_w -1852054365
    //   11260: ixor
    //   11261: goto -> 11272
    //   11264: ldc2_w 1274037111
    //   11267: l2i
    //   11268: ldc_w -683561579
    //   11271: ixor
    //   11272: ldc2_w -795008293
    //   11275: l2i
    //   11276: ldc_w 1505668740
    //   11279: ixor
    //   11280: ixor
    //   11281: lookupswitch default -> 11308, 573618881 -> 17092, 1912409666 -> 11264
    //   11308: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   11311: getstatic Perryc.0 : I
    //   11314: ifle -> 11328
    //   11317: ldc2_w 1063195368
    //   11320: l2i
    //   11321: ldc_w 109091189
    //   11324: ixor
    //   11325: goto -> 11336
    //   11328: ldc2_w -1963907860
    //   11331: l2i
    //   11332: ldc_w -1049015095
    //   11335: ixor
    //   11336: ldc2_w 1596341997
    //   11339: l2i
    //   11340: ldc_w -312131096
    //   11343: ixor
    //   11344: ixor
    //   11345: lookupswitch default -> 17380, -1952648040 -> 11328, -104130784 -> 11372
    //   11372: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11375: getstatic Perryc.1 : I
    //   11378: ifeq -> 11392
    //   11381: ldc2_w 479195361
    //   11384: l2i
    //   11385: ldc_w -1698781589
    //   11388: ixor
    //   11389: goto -> 11400
    //   11392: ldc2_w -987778494
    //   11395: l2i
    //   11396: ldc_w -165787908
    //   11399: ixor
    //   11400: ldc2_w -488616586
    //   11403: l2i
    //   11404: ldc_w 695796095
    //   11407: ixor
    //   11408: ixor
    //   11409: lookupswitch default -> 11436, -358450083 -> 11392, 1302862467 -> 17076
    //   11436: getfield field_70179_y : D
    //   11439: dadd
    //   11440: ldc2_w -844317821
    //   11443: l2i
    //   11444: ldc_w -844317821
    //   11447: ixor
    //   11448: getstatic Perryc.c : I
    //   11451: iflt -> 11465
    //   11454: ldc2_w 623402614
    //   11457: l2i
    //   11458: ldc_w 506097540
    //   11461: ixor
    //   11462: goto -> 11473
    //   11465: ldc2_w 851667753
    //   11468: l2i
    //   11469: ldc_w 1941384620
    //   11472: ixor
    //   11473: ldc2_w -542957559
    //   11476: l2i
    //   11477: ldc_w 480438048
    //   11480: ixor
    //   11481: ixor
    //   11482: lookupswitch default -> 11508, -133957925 -> 17240, 1063292197 -> 11465
    //   11508: goto -> 11512
    //   11511: athrow
    //   11512: invokespecial <init> : (DDDZ)V
    //   11515: goto -> 11519
    //   11518: athrow
    //   11519: getstatic Perryc.1 : I
    //   11522: ifeq -> 11536
    //   11525: ldc2_w -783429369
    //   11528: l2i
    //   11529: ldc_w -776195174
    //   11532: ixor
    //   11533: goto -> 11544
    //   11536: ldc2_w 1076726570
    //   11539: l2i
    //   11540: ldc_w -1726092844
    //   11543: ixor
    //   11544: ldc2_w 1767849626
    //   11547: l2i
    //   11548: ldc_w -1898892142
    //   11551: ixor
    //   11552: ixor
    //   11553: lookupswitch default -> 11580, -411047787 -> 16986, 1652277984 -> 11536
    //   11580: goto -> 11584
    //   11583: athrow
    //   11584: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   11587: goto -> 11591
    //   11590: athrow
    //   11591: getstatic Perryc.0 : I
    //   11594: ifle -> 11608
    //   11597: ldc2_w 1299664626
    //   11600: l2i
    //   11601: ldc_w -1699442588
    //   11604: ixor
    //   11605: goto -> 11616
    //   11608: ldc2_w 1310041207
    //   11611: l2i
    //   11612: ldc_w 231444808
    //   11615: ixor
    //   11616: ldc2_w 857731859
    //   11619: l2i
    //   11620: ldc_w 1197386321
    //   11623: ixor
    //   11624: ixor
    //   11625: lookupswitch default -> 11652, -1551726636 -> 17436, -1340489688 -> 11608
    //   11652: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   11655: getstatic Perryc.0 : I
    //   11658: ifle -> 11672
    //   11661: ldc2_w 1839283371
    //   11664: l2i
    //   11665: ldc_w -883440177
    //   11668: ixor
    //   11669: goto -> 11680
    //   11672: ldc2_w 1628525009
    //   11675: l2i
    //   11676: ldc_w -487936498
    //   11679: ixor
    //   11680: ldc2_w 1675423367
    //   11683: l2i
    //   11684: ldc_w -699974453
    //   11687: ixor
    //   11688: ixor
    //   11689: lookupswitch default -> 17402, 325921576 -> 11672, 912272787 -> 11716
    //   11716: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11719: ldc2_w -441693393
    //   11722: l2i
    //   11723: ldc_w -441693394
    //   11726: ixor
    //   11727: getstatic Perryc.1 : I
    //   11730: ifeq -> 11744
    //   11733: ldc2_w 494334307
    //   11736: l2i
    //   11737: ldc_w -1643949703
    //   11740: ixor
    //   11741: goto -> 11752
    //   11744: ldc2_w -1759645153
    //   11747: l2i
    //   11748: ldc_w -998561095
    //   11751: ixor
    //   11752: ldc2_w 1870674748
    //   11755: l2i
    //   11756: ldc_w 580011308
    //   11759: ixor
    //   11760: ixor
    //   11761: lookupswitch default -> 11788, -832053750 -> 17384, 1622114275 -> 11744
    //   11788: putfield field_70145_X : Z
    //   11791: getstatic Perryc.c : I
    //   11794: iflt -> 11808
    //   11797: ldc2_w -747930281
    //   11800: l2i
    //   11801: ldc_w 1846582333
    //   11804: ixor
    //   11805: goto -> 11816
    //   11808: ldc2_w -1267562949
    //   11811: l2i
    //   11812: ldc_w -231000137
    //   11815: ixor
    //   11816: ldc2_w -1799546137
    //   11819: l2i
    //   11820: ldc_w 437670260
    //   11823: ixor
    //   11824: ixor
    //   11825: lookupswitch default -> 16998, -924648929 -> 11852, 869313273 -> 11808
    //   11852: iload #13
    //   11854: ifeq -> 11868
    //   11857: ldc2_w -874978933
    //   11860: l2i
    //   11861: ldc_w 1834708618
    //   11864: ixor
    //   11865: goto -> 11876
    //   11868: ldc2_w -436425796
    //   11871: l2i
    //   11872: ldc_w 1132405950
    //   11875: ixor
    //   11876: ldc2_w -1392175863
    //   11879: l2i
    //   11880: ldc_w -1683565323
    //   11883: ixor
    //   11884: ixor
    //   11885: tableswitch default -> 11857, -1876930819 -> 11908, -1876930818 -> 13171
    //   11908: getstatic Perryc.0 : I
    //   11911: ifle -> 11925
    //   11914: ldc2_w -926671886
    //   11917: l2i
    //   11918: ldc_w 1504330869
    //   11921: ixor
    //   11922: goto -> 11933
    //   11925: ldc2_w 453453926
    //   11928: l2i
    //   11929: ldc_w -1678946289
    //   11932: ixor
    //   11933: ldc2_w 1607227822
    //   11936: l2i
    //   11937: ldc_w -597810756
    //   11940: ixor
    //   11941: ixor
    //   11942: lookupswitch default -> 17352, 58196091 -> 11968, 318515093 -> 11925
    //   11968: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   11971: getstatic Perryc.c : I
    //   11974: iflt -> 11988
    //   11977: ldc2_w -1635499158
    //   11980: l2i
    //   11981: ldc_w -383226440
    //   11984: ixor
    //   11985: goto -> 11996
    //   11988: ldc2_w -1734180932
    //   11991: l2i
    //   11992: ldc_w 527110393
    //   11995: ixor
    //   11996: ldc2_w 1746787400
    //   11999: l2i
    //   12000: ldc_w 318252043
    //   12003: ixor
    //   12004: ixor
    //   12005: lookupswitch default -> 17370, -47409402 -> 12032, 222942865 -> 11988
    //   12032: goto -> 12036
    //   12035: athrow
    //   12036: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   12039: goto -> 12043
    //   12042: athrow
    //   12043: new net/minecraft/network/play/client/CPacketPlayer$Position
    //   12046: dup
    //   12047: getstatic Perryc.0 : I
    //   12050: ifle -> 12064
    //   12053: ldc2_w 262610449
    //   12056: l2i
    //   12057: ldc_w -2114047593
    //   12060: ixor
    //   12061: goto -> 12072
    //   12064: ldc2_w 412333760
    //   12067: l2i
    //   12068: ldc_w -1819530047
    //   12071: ixor
    //   12072: ldc2_w -1656766811
    //   12075: l2i
    //   12076: ldc_w -187248604
    //   12079: ixor
    //   12080: ixor
    //   12081: lookupswitch default -> 12108, -407879417 -> 17318, 62851277 -> 12064
    //   12108: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   12111: getstatic Perryc.0 : I
    //   12114: ifle -> 12128
    //   12117: ldc2_w 421059054
    //   12120: l2i
    //   12121: ldc_w 130545786
    //   12124: ixor
    //   12125: goto -> 12136
    //   12128: ldc2_w -1846327826
    //   12131: l2i
    //   12132: ldc_w -2109129693
    //   12135: ixor
    //   12136: ldc2_w -1081457979
    //   12139: l2i
    //   12140: ldc_w -1834897186
    //   12143: ixor
    //   12144: ixor
    //   12145: lookupswitch default -> 17168, 871682959 -> 12128, 1049725910 -> 12172
    //   12172: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12175: getstatic Perryc.0 : I
    //   12178: ifle -> 12192
    //   12181: ldc2_w -805788065
    //   12184: l2i
    //   12185: ldc_w 1204693610
    //   12188: ixor
    //   12189: goto -> 12200
    //   12192: ldc2_w 581549339
    //   12195: l2i
    //   12196: ldc_w 1814455640
    //   12199: ixor
    //   12200: ldc2_w 1952544843
    //   12203: l2i
    //   12204: ldc_w 424910067
    //   12207: ixor
    //   12208: ixor
    //   12209: lookupswitch default -> 17016, -452695923 -> 12192, 599604475 -> 12236
    //   12236: getfield field_70165_t : D
    //   12239: getstatic Perryc.0 : I
    //   12242: ifle -> 12256
    //   12245: ldc2_w -597384246
    //   12248: l2i
    //   12249: ldc_w 1552443019
    //   12252: ixor
    //   12253: goto -> 12264
    //   12256: ldc2_w 600773834
    //   12259: l2i
    //   12260: ldc_w -2094909067
    //   12263: ixor
    //   12264: ldc2_w -1731893044
    //   12267: l2i
    //   12268: ldc_w 2125116856
    //   12271: ixor
    //   12272: ixor
    //   12273: lookupswitch default -> 17008, 1182986443 -> 12300, 1719867445 -> 12256
    //   12300: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   12303: getstatic Perryc.1 : I
    //   12306: ifeq -> 12320
    //   12309: ldc2_w 1999932454
    //   12312: l2i
    //   12313: ldc_w 1599619129
    //   12316: ixor
    //   12317: goto -> 12328
    //   12320: ldc2_w 334449557
    //   12323: l2i
    //   12324: ldc_w 82015191
    //   12327: ixor
    //   12328: ldc2_w -564964864
    //   12331: l2i
    //   12332: ldc_w 2028549929
    //   12335: ixor
    //   12336: ixor
    //   12337: lookupswitch default -> 12364, -1898534602 -> 17360, 120672785 -> 12320
    //   12364: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12367: getstatic Perryc.0 : I
    //   12370: ifle -> 12384
    //   12373: ldc2_w -562752133
    //   12376: l2i
    //   12377: ldc_w 1654412973
    //   12380: ixor
    //   12381: goto -> 12392
    //   12384: ldc2_w -280949234
    //   12387: l2i
    //   12388: ldc_w 1792396149
    //   12391: ixor
    //   12392: ldc2_w 1656134616
    //   12395: l2i
    //   12396: ldc_w 1874778835
    //   12399: ixor
    //   12400: ixor
    //   12401: lookupswitch default -> 17364, -2003008400 -> 12428, -1310653731 -> 12384
    //   12428: getfield field_70159_w : D
    //   12431: dadd
    //   12432: getstatic Perryc.0 : I
    //   12435: ifle -> 12449
    //   12438: ldc2_w 2145846243
    //   12441: l2i
    //   12442: ldc_w 1341101797
    //   12445: ixor
    //   12446: goto -> 12457
    //   12449: ldc2_w 293610570
    //   12452: l2i
    //   12453: ldc_w 1938726901
    //   12456: ixor
    //   12457: ldc2_w -821194427
    //   12460: l2i
    //   12461: ldc_w 1262801821
    //   12464: ixor
    //   12465: ixor
    //   12466: lookupswitch default -> 12492, -1270753314 -> 17180, -940669269 -> 12449
    //   12492: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   12495: getstatic Perryc.0 : I
    //   12498: ifle -> 12512
    //   12501: ldc2_w 13035471
    //   12504: l2i
    //   12505: ldc_w 1206362646
    //   12508: ixor
    //   12509: goto -> 12520
    //   12512: ldc2_w -1969278566
    //   12515: l2i
    //   12516: ldc_w 479560478
    //   12519: ixor
    //   12520: ldc2_w 2116983699
    //   12523: l2i
    //   12524: ldc_w -1799645759
    //   12527: ixor
    //   12528: ixor
    //   12529: lookupswitch default -> 17118, -1380693109 -> 12512, 2090843350 -> 12556
    //   12556: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12559: getstatic Perryc.1 : I
    //   12562: ifeq -> 12576
    //   12565: ldc2_w 17939836
    //   12568: l2i
    //   12569: ldc_w -1012962136
    //   12572: ixor
    //   12573: goto -> 12584
    //   12576: ldc2_w 1726913719
    //   12579: l2i
    //   12580: ldc_w 42906776
    //   12583: ixor
    //   12584: ldc2_w 62471293
    //   12587: l2i
    //   12588: ldc_w -1339828048
    //   12591: ixor
    //   12592: ixor
    //   12593: lookupswitch default -> 12620, 148455880 -> 12576, 1897149721 -> 17290
    //   12620: getfield field_70163_u : D
    //   12623: ldc2_w 3.249020141765267E-5
    //   12626: invokestatic doubleToLongBits : (D)J
    //   12629: ldc2_w 9215915573424872913
    //   12632: lxor
    //   12633: invokestatic longBitsToDouble : (J)D
    //   12636: dsub
    //   12637: getstatic Perryc.c : I
    //   12640: iflt -> 12654
    //   12643: ldc2_w -1005146949
    //   12646: l2i
    //   12647: ldc_w -1990485471
    //   12650: ixor
    //   12651: goto -> 12662
    //   12654: ldc2_w 506655289
    //   12657: l2i
    //   12658: ldc_w -635993509
    //   12661: ixor
    //   12662: ldc2_w 138951586
    //   12665: l2i
    //   12666: ldc_w -381655147
    //   12669: ixor
    //   12670: ixor
    //   12671: lookupswitch default -> 12696, -1728392387 -> 12654, -1404736851 -> 17392
    //   12696: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   12699: getstatic Perryc.c : I
    //   12702: iflt -> 12716
    //   12705: ldc2_w -893182590
    //   12708: l2i
    //   12709: ldc_w -949919426
    //   12712: ixor
    //   12713: goto -> 12724
    //   12716: ldc2_w -2131602580
    //   12719: l2i
    //   12720: ldc_w 570362683
    //   12723: ixor
    //   12724: ldc2_w -205039751
    //   12727: l2i
    //   12728: ldc_w -903449960
    //   12731: ixor
    //   12732: ixor
    //   12733: lookupswitch default -> 12760, 876829021 -> 17072, 1729063184 -> 12716
    //   12760: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12763: getstatic Perryc.1 : I
    //   12766: ifeq -> 12780
    //   12769: ldc2_w -1638201833
    //   12772: l2i
    //   12773: ldc_w -1781529338
    //   12776: ixor
    //   12777: goto -> 12788
    //   12780: ldc2_w -1478682573
    //   12783: l2i
    //   12784: ldc_w -1745916280
    //   12787: ixor
    //   12788: ldc2_w -1118801091
    //   12791: l2i
    //   12792: ldc_w -1919430323
    //   12795: ixor
    //   12796: ixor
    //   12797: lookupswitch default -> 17156, 16110795 -> 12824, 994877793 -> 12780
    //   12824: getfield field_70161_v : D
    //   12827: getstatic Perryc.1 : I
    //   12830: ifeq -> 12844
    //   12833: ldc2_w -154762686
    //   12836: l2i
    //   12837: ldc_w 1074650353
    //   12840: ixor
    //   12841: goto -> 12852
    //   12844: ldc2_w 1718642937
    //   12847: l2i
    //   12848: ldc_w -237973754
    //   12851: ixor
    //   12852: ldc2_w 226574602
    //   12855: l2i
    //   12856: ldc_w 994016914
    //   12859: ixor
    //   12860: ixor
    //   12861: lookupswitch default -> 17294, -2139791061 -> 12844, -1591830425 -> 12888
    //   12888: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   12891: getstatic Perryc.1 : I
    //   12894: ifeq -> 12908
    //   12897: ldc2_w -314098727
    //   12900: l2i
    //   12901: ldc_w -1349699592
    //   12904: ixor
    //   12905: goto -> 12916
    //   12908: ldc2_w -97692041
    //   12911: l2i
    //   12912: ldc_w 1708215482
    //   12915: ixor
    //   12916: ldc2_w 1298745284
    //   12919: l2i
    //   12920: ldc_w -1688149317
    //   12923: ixor
    //   12924: ixor
    //   12925: lookupswitch default -> 17348, -1799116450 -> 12908, 1240842162 -> 12952
    //   12952: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   12955: getstatic Perryc.c : I
    //   12958: iflt -> 12972
    //   12961: ldc2_w 1853263019
    //   12964: l2i
    //   12965: ldc_w 1704593647
    //   12968: ixor
    //   12969: goto -> 12980
    //   12972: ldc2_w 386207018
    //   12975: l2i
    //   12976: ldc_w -1771344001
    //   12979: ixor
    //   12980: ldc2_w -1483614931
    //   12983: l2i
    //   12984: ldc_w 1823708083
    //   12987: ixor
    //   12988: ixor
    //   12989: lookupswitch default -> 13016, -1284921323 -> 12972, -1060191526 -> 17232
    //   13016: getfield field_70179_y : D
    //   13019: dadd
    //   13020: ldc2_w -12605031
    //   13023: l2i
    //   13024: ldc_w -12605032
    //   13027: ixor
    //   13028: getstatic Perryc.c : I
    //   13031: iflt -> 13045
    //   13034: ldc2_w -1238195262
    //   13037: l2i
    //   13038: ldc_w -944515421
    //   13041: ixor
    //   13042: goto -> 13053
    //   13045: ldc2_w 1951362803
    //   13048: l2i
    //   13049: ldc_w 155608069
    //   13052: ixor
    //   13053: ldc2_w -187165491
    //   13056: l2i
    //   13057: ldc_w -2051150939
    //   13060: ixor
    //   13061: ixor
    //   13062: lookupswitch default -> 17298, 14977545 -> 13045, 208467358 -> 13088
    //   13088: goto -> 13092
    //   13091: athrow
    //   13092: invokespecial <init> : (DDDZ)V
    //   13095: goto -> 13099
    //   13098: athrow
    //   13099: getstatic Perryc.0 : I
    //   13102: ifle -> 13116
    //   13105: ldc2_w -235978147
    //   13108: l2i
    //   13109: ldc_w 958698002
    //   13112: ixor
    //   13113: goto -> 13124
    //   13116: ldc2_w -1153829556
    //   13119: l2i
    //   13120: ldc_w -33536169
    //   13123: ixor
    //   13124: ldc2_w 1258412304
    //   13127: l2i
    //   13128: ldc_w -509138162
    //   13131: ixor
    //   13132: ixor
    //   13133: lookupswitch default -> 13160, -1807133809 -> 13116, 1651319377 -> 17100
    //   13160: goto -> 13164
    //   13163: athrow
    //   13164: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   13167: goto -> 13171
    //   13170: athrow
    //   13171: ldc2_w 2.543230383198926E307
    //   13174: invokestatic doubleToLongBits : (D)J
    //   13177: ldc2_w 9205951100584144111
    //   13180: lxor
    //   13181: invokestatic longBitsToDouble : (J)D
    //   13184: getstatic Perryc.c : I
    //   13187: iflt -> 13201
    //   13190: ldc2_w 1776148377
    //   13193: l2i
    //   13194: ldc_w -1897843252
    //   13197: ixor
    //   13198: goto -> 13209
    //   13201: ldc2_w -2100468335
    //   13204: l2i
    //   13205: ldc_w -1108771093
    //   13208: ixor
    //   13209: ldc2_w -462291987
    //   13212: l2i
    //   13213: ldc_w 909594227
    //   13216: ixor
    //   13217: ixor
    //   13218: lookupswitch default -> 17120, -312299804 -> 13244, 897212363 -> 13201
    //   13244: dstore #14
    //   13246: ldc2_w 2.5821382111481004E307
    //   13249: invokestatic doubleToLongBits : (D)J
    //   13252: ldc2_w 9206029078421876519
    //   13255: lxor
    //   13256: invokestatic longBitsToDouble : (J)D
    //   13259: getstatic Perryc.0 : I
    //   13262: ifle -> 13276
    //   13265: ldc2_w -385508576
    //   13268: l2i
    //   13269: ldc_w -31825771
    //   13272: ixor
    //   13273: goto -> 13284
    //   13276: ldc2_w -1266424507
    //   13279: l2i
    //   13280: ldc_w 1648983603
    //   13283: ixor
    //   13284: ldc2_w -1575932635
    //   13287: l2i
    //   13288: ldc_w -1915003195
    //   13291: ixor
    //   13292: ixor
    //   13293: lookupswitch default -> 13320, -1878602243 -> 13276, 953518165 -> 17304
    //   13320: dstore #16
    //   13322: ldc2_w 5.152846287894056E307
    //   13325: invokestatic doubleToLongBits : (D)J
    //   13328: ldc2_w 9210521224092387301
    //   13331: lxor
    //   13332: invokestatic longBitsToDouble : (J)D
    //   13335: getstatic Perryc.0 : I
    //   13338: ifle -> 13352
    //   13341: ldc2_w -531158171
    //   13344: l2i
    //   13345: ldc_w -743638019
    //   13348: ixor
    //   13349: goto -> 13360
    //   13352: ldc2_w 1491168367
    //   13355: l2i
    //   13356: ldc_w -40730021
    //   13359: ixor
    //   13360: ldc2_w 1940236822
    //   13363: l2i
    //   13364: ldc_w 1857917988
    //   13367: ixor
    //   13368: ixor
    //   13369: lookupswitch default -> 13396, -51192764 -> 13352, 786689706 -> 17336
    //   13396: dstore #18
    //   13398: getstatic Perryc.c : I
    //   13401: iflt -> 13415
    //   13404: ldc2_w 508494008
    //   13407: l2i
    //   13408: ldc_w -957148259
    //   13411: ixor
    //   13412: goto -> 13423
    //   13415: ldc2_w 229651537
    //   13418: l2i
    //   13419: ldc_w 621636941
    //   13422: ixor
    //   13423: ldc2_w -1892443680
    //   13426: l2i
    //   13427: ldc_w 806224672
    //   13430: ixor
    //   13431: ixor
    //   13432: lookupswitch default -> 17386, -1753168932 -> 13460, 1736542693 -> 13415
    //   13460: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   13463: getstatic Perryc.c : I
    //   13466: iflt -> 13480
    //   13469: ldc2_w -1753061541
    //   13472: l2i
    //   13473: ldc_w 1479594140
    //   13476: ixor
    //   13477: goto -> 13488
    //   13480: ldc2_w -1374596443
    //   13483: l2i
    //   13484: ldc_w -415087963
    //   13487: ixor
    //   13488: ldc2_w 58516826
    //   13491: l2i
    //   13492: ldc_w -1387255167
    //   13495: ixor
    //   13496: ixor
    //   13497: lookupswitch default -> 13524, -142712204 -> 13480, 1637775388 -> 17400
    //   13524: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   13527: getstatic Perryc.0 : I
    //   13530: ifle -> 13544
    //   13533: ldc2_w -1540573933
    //   13536: l2i
    //   13537: ldc_w -1926726545
    //   13540: ixor
    //   13541: goto -> 13552
    //   13544: ldc2_w 1083166994
    //   13547: l2i
    //   13548: ldc_w 680826047
    //   13551: ixor
    //   13552: ldc2_w -971663152
    //   13555: l2i
    //   13556: ldc_w -2133461452
    //   13559: ixor
    //   13560: ixor
    //   13561: lookupswitch default -> 13588, 874047178 -> 13544, 1875158936 -> 17140
    //   13588: getfield field_74311_E : Lnet/minecraft/client/settings/KeyBinding;
    //   13591: getstatic Perryc.1 : I
    //   13594: ifeq -> 13608
    //   13597: ldc2_w -281061501
    //   13600: l2i
    //   13601: ldc_w -1244088183
    //   13604: ixor
    //   13605: goto -> 13616
    //   13608: ldc2_w -1851585174
    //   13611: l2i
    //   13612: ldc_w -122629040
    //   13615: ixor
    //   13616: ldc2_w -266785028
    //   13619: l2i
    //   13620: ldc_w 2081682186
    //   13623: ixor
    //   13624: ixor
    //   13625: lookupswitch default -> 13652, -689097988 -> 17350, 573706166 -> 13608
    //   13652: goto -> 13656
    //   13655: athrow
    //   13656: invokevirtual func_151470_d : ()Z
    //   13659: goto -> 13663
    //   13662: athrow
    //   13663: ifeq -> 13677
    //   13666: ldc2_w 715961046
    //   13669: l2i
    //   13670: ldc_w -403861542
    //   13673: ixor
    //   13674: goto -> 13685
    //   13677: ldc2_w -1901953721
    //   13680: l2i
    //   13681: ldc_w 1138966600
    //   13684: ixor
    //   13685: ldc2_w 885672336
    //   13688: l2i
    //   13689: ldc_w -1096581475
    //   13692: ixor
    //   13693: ixor
    //   13694: tableswitch default -> 13666, 1193806337 -> 13716, 1193806338 -> 13790
    //   13716: ldc2_w -104.62048460055554
    //   13719: invokestatic doubleToLongBits : (D)J
    //   13722: ldc2_w 9217223250089264049
    //   13725: lxor
    //   13726: invokestatic longBitsToDouble : (J)D
    //   13729: getstatic Perryc.1 : I
    //   13732: ifeq -> 13746
    //   13735: ldc2_w 1231577946
    //   13738: l2i
    //   13739: ldc_w 2013669657
    //   13742: ixor
    //   13743: goto -> 13754
    //   13746: ldc2_w -1839926465
    //   13749: l2i
    //   13750: ldc_w -1883070669
    //   13753: ixor
    //   13754: ldc2_w -632458056
    //   13757: l2i
    //   13758: ldc_w 1907140153
    //   13761: ixor
    //   13762: ixor
    //   13763: lookupswitch default -> 17416, -1701865278 -> 13746, -1233666419 -> 13788
    //   13788: dstore #16
    //   13790: getstatic Perryc.0 : I
    //   13793: ifle -> 13807
    //   13796: ldc2_w 1216767655
    //   13799: l2i
    //   13800: ldc_w 1748078341
    //   13803: ixor
    //   13804: goto -> 13815
    //   13807: ldc2_w -682805806
    //   13810: l2i
    //   13811: ldc_w -537768947
    //   13814: ixor
    //   13815: ldc2_w 683224337
    //   13818: l2i
    //   13819: ldc_w 2088689021
    //   13822: ixor
    //   13823: ixor
    //   13824: lookupswitch default -> 13852, 1573115524 -> 13807, 1953503694 -> 17228
    //   13852: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   13855: getstatic Perryc.1 : I
    //   13858: ifeq -> 13872
    //   13861: ldc2_w -1301185141
    //   13864: l2i
    //   13865: ldc_w -554022774
    //   13868: ixor
    //   13869: goto -> 13880
    //   13872: ldc2_w 570149937
    //   13875: l2i
    //   13876: ldc_w 503315511
    //   13879: ixor
    //   13880: ldc2_w -1610168131
    //   13883: l2i
    //   13884: ldc_w 423573899
    //   13887: ixor
    //   13888: ixor
    //   13889: lookupswitch default -> 17194, -2059550416 -> 13916, -709704649 -> 13872
    //   13916: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   13919: getstatic Perryc.1 : I
    //   13922: ifeq -> 13936
    //   13925: ldc2_w -2005061202
    //   13928: l2i
    //   13929: ldc_w 933220238
    //   13932: ixor
    //   13933: goto -> 13944
    //   13936: ldc2_w -1839801284
    //   13939: l2i
    //   13940: ldc_w -1548130924
    //   13943: ixor
    //   13944: ldc2_w -988316024
    //   13947: l2i
    //   13948: ldc_w 1349794903
    //   13951: ixor
    //   13952: ixor
    //   13953: lookupswitch default -> 13980, 563166937 -> 13936, 713145599 -> 17368
    //   13980: getfield field_74314_A : Lnet/minecraft/client/settings/KeyBinding;
    //   13983: getstatic Perryc.0 : I
    //   13986: ifle -> 14000
    //   13989: ldc2_w 820418165
    //   13992: l2i
    //   13993: ldc_w 1343239393
    //   13996: ixor
    //   13997: goto -> 14008
    //   14000: ldc2_w 1366127675
    //   14003: l2i
    //   14004: ldc_w 39035577
    //   14007: ixor
    //   14008: ldc2_w -788136620
    //   14011: l2i
    //   14012: ldc_w -388428528
    //   14015: ixor
    //   14016: ixor
    //   14017: lookupswitch default -> 14044, 585394619 -> 14000, 1495945936 -> 17124
    //   14044: goto -> 14048
    //   14047: athrow
    //   14048: invokevirtual func_151470_d : ()Z
    //   14051: goto -> 14055
    //   14054: athrow
    //   14055: ifeq -> 14069
    //   14058: ldc2_w 236415533
    //   14061: l2i
    //   14062: ldc_w 491406694
    //   14065: ixor
    //   14066: goto -> 14077
    //   14069: ldc2_w 1119527788
    //   14072: l2i
    //   14073: ldc_w 1374129190
    //   14076: ixor
    //   14077: ldc2_w -280839487
    //   14080: l2i
    //   14081: ldc_w 1612863152
    //   14084: ixor
    //   14085: ixor
    //   14086: tableswitch default -> 14058, -1673673926 -> 14108, -1673673925 -> 14182
    //   14108: ldc2_w 123.24760621680876
    //   14111: invokestatic doubleToLongBits : (D)J
    //   14114: ldc2_w 9218534017245044407
    //   14117: lxor
    //   14118: invokestatic longBitsToDouble : (J)D
    //   14121: getstatic Perryc.1 : I
    //   14124: ifeq -> 14138
    //   14127: ldc2_w -277080949
    //   14130: l2i
    //   14131: ldc_w -66367916
    //   14134: ixor
    //   14135: goto -> 14146
    //   14138: ldc2_w -212532801
    //   14141: l2i
    //   14142: ldc_w 747895950
    //   14145: ixor
    //   14146: ldc2_w -693348901
    //   14149: l2i
    //   14150: ldc_w -231825653
    //   14153: ixor
    //   14154: ixor
    //   14155: lookupswitch default -> 14180, -1004617609 -> 14138, 938840079 -> 17246
    //   14180: dstore #16
    //   14182: getstatic Perryc.c : I
    //   14185: iflt -> 14199
    //   14188: ldc2_w -411272747
    //   14191: l2i
    //   14192: ldc_w 2044077571
    //   14195: ixor
    //   14196: goto -> 14207
    //   14199: ldc2_w -117312390
    //   14202: l2i
    //   14203: ldc_w 205871881
    //   14206: ixor
    //   14207: ldc2_w -2037412169
    //   14210: l2i
    //   14211: ldc_w 899040656
    //   14214: ixor
    //   14215: ixor
    //   14216: lookupswitch default -> 16994, 766743793 -> 14199, 1180525652 -> 14244
    //   14244: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   14247: getstatic Perryc.c : I
    //   14250: iflt -> 14264
    //   14253: ldc2_w 1428941215
    //   14256: l2i
    //   14257: ldc_w 1712339525
    //   14260: ixor
    //   14261: goto -> 14272
    //   14264: ldc2_w -755404603
    //   14267: l2i
    //   14268: ldc_w -43986958
    //   14271: ixor
    //   14272: ldc2_w 760164649
    //   14275: l2i
    //   14276: ldc_w -858429093
    //   14279: ixor
    //   14280: ixor
    //   14281: lookupswitch default -> 14308, -1600007441 -> 14264, -761164888 -> 17114
    //   14308: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   14311: getstatic Perryc.0 : I
    //   14314: ifle -> 14328
    //   14317: ldc2_w 1695392275
    //   14320: l2i
    //   14321: ldc_w 1452724315
    //   14324: ixor
    //   14325: goto -> 14336
    //   14328: ldc2_w -1578023187
    //   14331: l2i
    //   14332: ldc_w 1062988342
    //   14335: ixor
    //   14336: ldc2_w 760620392
    //   14339: l2i
    //   14340: ldc_w -1986926114
    //   14343: ixor
    //   14344: ixor
    //   14345: lookupswitch default -> 14372, -2074013788 -> 14328, -1755529474 -> 17254
    //   14372: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   14375: getstatic Perryc.c : I
    //   14378: iflt -> 14392
    //   14381: ldc2_w -106018543
    //   14384: l2i
    //   14385: ldc_w 1980830287
    //   14388: ixor
    //   14389: goto -> 14400
    //   14392: ldc2_w 291712317
    //   14395: l2i
    //   14396: ldc_w 2033158565
    //   14399: ixor
    //   14400: ldc2_w 916421143
    //   14403: l2i
    //   14404: ldc_w 1703242000
    //   14407: ixor
    //   14408: ixor
    //   14409: lookupswitch default -> 17404, -593147815 -> 14392, 995538847 -> 14436
    //   14436: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   14439: getstatic Perryc.c : I
    //   14442: iflt -> 14456
    //   14445: ldc2_w 1420992731
    //   14448: l2i
    //   14449: ldc_w -156732719
    //   14452: ixor
    //   14453: goto -> 14464
    //   14456: ldc2_w 1992265476
    //   14459: l2i
    //   14460: ldc_w 2005086862
    //   14463: ixor
    //   14464: ldc2_w 146249357
    //   14467: l2i
    //   14468: ldc_w -1049770510
    //   14471: ixor
    //   14472: ixor
    //   14473: lookupswitch default -> 17080, -924389643 -> 14500, 1807778165 -> 14456
    //   14500: getfield field_70165_t : D
    //   14503: getstatic Perryc.0 : I
    //   14506: ifle -> 14520
    //   14509: ldc2_w 551034187
    //   14512: l2i
    //   14513: ldc_w 1380390875
    //   14516: ixor
    //   14517: goto -> 14528
    //   14520: ldc2_w -216740050
    //   14523: l2i
    //   14524: ldc_w 1814963043
    //   14527: ixor
    //   14528: ldc2_w 133193429
    //   14531: l2i
    //   14532: ldc_w 1145175613
    //   14535: ixor
    //   14536: ixor
    //   14537: lookupswitch default -> 17000, -594850651 -> 14564, 825141880 -> 14520
    //   14564: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   14567: getstatic Perryc.1 : I
    //   14570: ifeq -> 14584
    //   14573: ldc2_w 502198713
    //   14576: l2i
    //   14577: ldc_w -1004014796
    //   14580: ixor
    //   14581: goto -> 14592
    //   14584: ldc2_w 1203433029
    //   14587: l2i
    //   14588: ldc_w -985739252
    //   14591: ixor
    //   14592: ldc2_w -644949586
    //   14595: l2i
    //   14596: ldc_w -417824665
    //   14599: ixor
    //   14600: ixor
    //   14601: lookupswitch default -> 17238, -1139644544 -> 14628, -413181116 -> 14584
    //   14628: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   14631: getstatic Perryc.1 : I
    //   14634: ifeq -> 14648
    //   14637: ldc2_w -1714962496
    //   14640: l2i
    //   14641: ldc_w -1900525519
    //   14644: ixor
    //   14645: goto -> 14656
    //   14648: ldc2_w 987310000
    //   14651: l2i
    //   14652: ldc_w -1785140332
    //   14655: ixor
    //   14656: ldc2_w 1337320722
    //   14659: l2i
    //   14660: ldc_w 1676666824
    //   14663: ixor
    //   14664: ixor
    //   14665: lookupswitch default -> 14692, 588538211 -> 14648, 992343339 -> 17056
    //   14692: getfield field_70163_u : D
    //   14695: getstatic Perryc.0 : I
    //   14698: ifle -> 14712
    //   14701: ldc2_w -396006053
    //   14704: l2i
    //   14705: ldc_w 55218754
    //   14708: ixor
    //   14709: goto -> 14720
    //   14712: ldc2_w 47841382
    //   14715: l2i
    //   14716: ldc_w -319110444
    //   14719: ixor
    //   14720: ldc2_w 697018798
    //   14723: l2i
    //   14724: ldc_w -1932237567
    //   14727: ixor
    //   14728: ixor
    //   14729: lookupswitch default -> 14756, -1084057641 -> 14712, 1315976118 -> 17204
    //   14756: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   14759: getstatic Perryc.c : I
    //   14762: iflt -> 14776
    //   14765: ldc2_w -488118398
    //   14768: l2i
    //   14769: ldc_w -1799471034
    //   14772: ixor
    //   14773: goto -> 14784
    //   14776: ldc2_w -1944172262
    //   14779: l2i
    //   14780: ldc_w 1600663310
    //   14783: ixor
    //   14784: ldc2_w 1256456755
    //   14787: l2i
    //   14788: ldc_w -1288678356
    //   14791: ixor
    //   14792: ixor
    //   14793: lookupswitch default -> 17230, -1886522917 -> 14776, 715272203 -> 14820
    //   14820: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   14823: getstatic Perryc.c : I
    //   14826: iflt -> 14840
    //   14829: ldc2_w -1565498569
    //   14832: l2i
    //   14833: ldc_w 396549183
    //   14836: ixor
    //   14837: goto -> 14848
    //   14840: ldc2_w 1394542662
    //   14843: l2i
    //   14844: ldc_w 1916601879
    //   14847: ixor
    //   14848: ldc2_w -1676036299
    //   14851: l2i
    //   14852: ldc_w 858008946
    //   14855: ixor
    //   14856: ixor
    //   14857: lookupswitch default -> 17274, -1910533098 -> 14884, 439297359 -> 14840
    //   14884: getfield field_70161_v : D
    //   14887: getstatic Perryc.1 : I
    //   14890: ifeq -> 14904
    //   14893: ldc2_w -1108245928
    //   14896: l2i
    //   14897: ldc_w 1406315767
    //   14900: ixor
    //   14901: goto -> 14912
    //   14904: ldc2_w -1299910429
    //   14907: l2i
    //   14908: ldc_w 1617420762
    //   14911: ixor
    //   14912: ldc2_w -2129640271
    //   14915: l2i
    //   14916: ldc_w 711603551
    //   14919: ixor
    //   14920: ixor
    //   14921: lookupswitch default -> 14948, -345121201 -> 14904, 1163484993 -> 17322
    //   14948: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   14951: getstatic Perryc.0 : I
    //   14954: ifle -> 14968
    //   14957: ldc2_w -755010622
    //   14960: l2i
    //   14961: ldc_w -802887038
    //   14964: ixor
    //   14965: goto -> 14976
    //   14968: ldc2_w 704936331
    //   14971: l2i
    //   14972: ldc_w -60375373
    //   14975: ixor
    //   14976: ldc2_w -1492797095
    //   14979: l2i
    //   14980: ldc_w -1174356577
    //   14983: ixor
    //   14984: ixor
    //   14985: lookupswitch default -> 15012, -66687465 -> 14968, 534683014 -> 17196
    //   15012: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15015: getstatic Perryc.c : I
    //   15018: iflt -> 15032
    //   15021: ldc2_w 2092317932
    //   15024: l2i
    //   15025: ldc_w 140088922
    //   15028: ixor
    //   15029: goto -> 15040
    //   15032: ldc2_w 323209094
    //   15035: l2i
    //   15036: ldc_w -1190316493
    //   15039: ixor
    //   15040: ldc2_w 1028754853
    //   15043: l2i
    //   15044: ldc_w -370934475
    //   15047: ixor
    //   15048: ixor
    //   15049: lookupswitch default -> 17356, -1604462042 -> 15032, 2130477349 -> 15076
    //   15076: getfield field_70177_z : F
    //   15079: getstatic Perryc.c : I
    //   15082: iflt -> 15096
    //   15085: ldc2_w -38916450
    //   15088: l2i
    //   15089: ldc_w 583749195
    //   15092: ixor
    //   15093: goto -> 15104
    //   15096: ldc2_w 127083192
    //   15099: l2i
    //   15100: ldc_w -452855039
    //   15103: ixor
    //   15104: ldc2_w -612014329
    //   15107: l2i
    //   15108: ldc_w 768862077
    //   15111: ixor
    //   15112: ixor
    //   15113: lookupswitch default -> 15140, 403487435 -> 15096, 691265711 -> 17132
    //   15140: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   15143: getstatic Perryc.0 : I
    //   15146: ifle -> 15160
    //   15149: ldc2_w 718259581
    //   15152: l2i
    //   15153: ldc_w 20579063
    //   15156: ixor
    //   15157: goto -> 15168
    //   15160: ldc2_w -819098408
    //   15163: l2i
    //   15164: ldc_w -1243765735
    //   15167: ixor
    //   15168: ldc2_w 878877479
    //   15171: l2i
    //   15172: ldc_w -762648235
    //   15175: ixor
    //   15176: ixor
    //   15177: lookupswitch default -> 17284, -1676125517 -> 15204, -853690888 -> 15160
    //   15204: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15207: getstatic Perryc.0 : I
    //   15210: ifle -> 15224
    //   15213: ldc2_w -703199224
    //   15216: l2i
    //   15217: ldc_w 1960024639
    //   15220: ixor
    //   15221: goto -> 15232
    //   15224: ldc2_w -614992491
    //   15227: l2i
    //   15228: ldc_w -1435642297
    //   15231: ixor
    //   15232: ldc2_w -1986428486
    //   15235: l2i
    //   15236: ldc_w -761572223
    //   15239: ixor
    //   15240: ixor
    //   15241: lookupswitch default -> 15268, -104380660 -> 17206, 640225721 -> 15224
    //   15268: getfield field_70125_A : F
    //   15271: getstatic Perryc.c : I
    //   15274: iflt -> 15288
    //   15277: ldc2_w 27413070
    //   15280: l2i
    //   15281: ldc_w 144159107
    //   15284: ixor
    //   15285: goto -> 15296
    //   15288: ldc2_w -215204749
    //   15291: l2i
    //   15292: ldc_w -940815398
    //   15295: ixor
    //   15296: ldc2_w 1418560507
    //   15299: l2i
    //   15300: ldc_w -1536393910
    //   15303: ixor
    //   15304: ixor
    //   15305: lookupswitch default -> 15332, -103545476 -> 17250, 1496245489 -> 15288
    //   15332: goto -> 15336
    //   15335: athrow
    //   15336: invokevirtual func_70012_b : (DDDFF)V
    //   15339: goto -> 15343
    //   15342: athrow
    //   15343: getstatic Perryc.c : I
    //   15346: iflt -> 15360
    //   15349: ldc2_w -1042354217
    //   15352: l2i
    //   15353: ldc_w 5225504
    //   15356: ixor
    //   15357: goto -> 15368
    //   15360: ldc2_w -1043685784
    //   15363: l2i
    //   15364: ldc_w -941335778
    //   15367: ixor
    //   15368: ldc2_w -1989082471
    //   15371: l2i
    //   15372: ldc_w -1719401416
    //   15375: ixor
    //   15376: ixor
    //   15377: lookupswitch default -> 15404, -781953706 -> 17022, 2086502134 -> 15360
    //   15404: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   15407: getstatic Perryc.1 : I
    //   15410: ifeq -> 15424
    //   15413: ldc2_w -53207149
    //   15416: l2i
    //   15417: ldc_w 2069251499
    //   15420: ixor
    //   15421: goto -> 15432
    //   15424: ldc2_w -1027961932
    //   15427: l2i
    //   15428: ldc_w -22543603
    //   15431: ixor
    //   15432: ldc2_w -1736161241
    //   15435: l2i
    //   15436: ldc_w 15163955
    //   15439: ixor
    //   15440: ixor
    //   15441: lookupswitch default -> 15468, -1857293030 -> 15424, 534868012 -> 17014
    //   15468: goto -> 15472
    //   15471: athrow
    //   15472: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   15475: goto -> 15479
    //   15478: athrow
    //   15479: new net/minecraft/network/play/client/CPacketPlayer$Position
    //   15482: dup
    //   15483: getstatic Perryc.c : I
    //   15486: iflt -> 15500
    //   15489: ldc2_w 740191639
    //   15492: l2i
    //   15493: ldc_w 1842143495
    //   15496: ixor
    //   15497: goto -> 15508
    //   15500: ldc2_w -655550497
    //   15503: l2i
    //   15504: ldc_w -1402792802
    //   15507: ixor
    //   15508: ldc2_w -1757363786
    //   15511: l2i
    //   15512: ldc_w 2025457648
    //   15515: ixor
    //   15516: ixor
    //   15517: lookupswitch default -> 17328, -1686846201 -> 15544, -1373091114 -> 15500
    //   15544: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   15547: getstatic Perryc.c : I
    //   15550: iflt -> 15564
    //   15553: ldc2_w 1665957826
    //   15556: l2i
    //   15557: ldc_w 164939108
    //   15560: ixor
    //   15561: goto -> 15572
    //   15564: ldc2_w 192231527
    //   15567: l2i
    //   15568: ldc_w 1034899019
    //   15571: ixor
    //   15572: ldc2_w 461400284
    //   15575: l2i
    //   15576: ldc_w 741997144
    //   15579: ixor
    //   15580: ixor
    //   15581: lookupswitch default -> 15608, 825880315 -> 15564, 1562454050 -> 17088
    //   15608: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15611: getstatic Perryc.0 : I
    //   15614: ifle -> 15628
    //   15617: ldc2_w 576375533
    //   15620: l2i
    //   15621: ldc_w 1013773883
    //   15624: ixor
    //   15625: goto -> 15636
    //   15628: ldc2_w 812951721
    //   15631: l2i
    //   15632: ldc_w 1175765413
    //   15635: ixor
    //   15636: ldc2_w 1241179519
    //   15639: l2i
    //   15640: ldc_w -1516680796
    //   15643: ixor
    //   15644: ixor
    //   15645: lookupswitch default -> 17038, -1711028777 -> 15672, -229273587 -> 15628
    //   15672: getfield field_70165_t : D
    //   15675: getstatic Perryc.1 : I
    //   15678: ifeq -> 15692
    //   15681: ldc2_w 1746474480
    //   15684: l2i
    //   15685: ldc_w 1456001333
    //   15688: ixor
    //   15689: goto -> 15700
    //   15692: ldc2_w -1066916944
    //   15695: l2i
    //   15696: ldc_w -1992113083
    //   15699: ixor
    //   15700: ldc2_w -2002849791
    //   15703: l2i
    //   15704: ldc_w 80073194
    //   15707: ixor
    //   15708: ixor
    //   15709: lookupswitch default -> 17162, -1299520210 -> 15692, -982399458 -> 15736
    //   15736: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   15739: getstatic Perryc.0 : I
    //   15742: ifle -> 15756
    //   15745: ldc2_w -1333368806
    //   15748: l2i
    //   15749: ldc_w -342108915
    //   15752: ixor
    //   15753: goto -> 15764
    //   15756: ldc2_w -731800163
    //   15759: l2i
    //   15760: ldc_w 1739597559
    //   15763: ixor
    //   15764: ldc2_w 1627587053
    //   15767: l2i
    //   15768: ldc_w 1235792632
    //   15771: ixor
    //   15772: ixor
    //   15773: lookupswitch default -> 15800, 1361527804 -> 15756, 1941310978 -> 17178
    //   15800: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15803: getstatic Perryc.1 : I
    //   15806: ifeq -> 15820
    //   15809: ldc2_w 303946689
    //   15812: l2i
    //   15813: ldc_w 715870771
    //   15816: ixor
    //   15817: goto -> 15828
    //   15820: ldc2_w 1822190788
    //   15823: l2i
    //   15824: ldc_w 602492350
    //   15827: ixor
    //   15828: ldc2_w 2007015356
    //   15831: l2i
    //   15832: ldc_w -354238873
    //   15835: ixor
    //   15836: ixor
    //   15837: lookupswitch default -> 15864, -1510692823 -> 17330, 462618687 -> 15820
    //   15864: getfield field_70163_u : D
    //   15867: getstatic Perryc.c : I
    //   15870: iflt -> 15884
    //   15873: ldc2_w -1413309377
    //   15876: l2i
    //   15877: ldc_w -105949205
    //   15880: ixor
    //   15881: goto -> 15892
    //   15884: ldc2_w 1088438021
    //   15887: l2i
    //   15888: ldc_w 1542003574
    //   15891: ixor
    //   15892: ldc2_w 1988027183
    //   15895: l2i
    //   15896: ldc_w -2146828373
    //   15899: ixor
    //   15900: ixor
    //   15901: lookupswitch default -> 15928, -1541744816 -> 17272, -1315574644 -> 15884
    //   15928: getstatic bigname/zprestige/webhack/features/modules/Movement/Phase.mc : Lnet/minecraft/client/Minecraft;
    //   15931: getstatic Perryc.1 : I
    //   15934: ifeq -> 15948
    //   15937: ldc2_w -1645537061
    //   15940: l2i
    //   15941: ldc_w -1784198982
    //   15944: ixor
    //   15945: goto -> 15956
    //   15948: ldc2_w 1097569977
    //   15951: l2i
    //   15952: ldc_w 1463443426
    //   15955: ixor
    //   15956: ldc2_w -1287287324
    //   15959: l2i
    //   15960: ldc_w -1568104893
    //   15963: ixor
    //   15964: ixor
    //   15965: lookupswitch default -> 17300, 127720188 -> 15992, 427901894 -> 15948
    //   15992: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15995: getstatic Perryc.c : I
    //   15998: iflt -> 16012
    //   16001: ldc2_w 481113208
    //   16004: l2i
    //   16005: ldc_w 1016823079
    //   16008: ixor
    //   16009: goto -> 16020
    //   16012: ldc2_w -239843790
    //   16015: l2i
    //   16016: ldc_w 206904972
    //   16019: ixor
    //   16020: ldc2_w 1183431787
    //   16023: l2i
    //   16024: ldc_w 622613738
    //   16027: ixor
    //   16028: ixor
    //   16029: lookupswitch default -> 17026, -1636519873 -> 16056, 1134797278 -> 16012
    //   16056: getfield field_70161_v : D
    //   16059: ldc2_w -635249180
    //   16062: l2i
    //   16063: ldc_w -635249180
    //   16066: ixor
    //   16067: getstatic Perryc.1 : I
    //   16070: ifeq -> 16084
    //   16073: ldc2_w -1237942441
    //   16076: l2i
    //   16077: ldc_w -850356018
    //   16080: ixor
    //   16081: goto -> 16092
    //   16084: ldc2_w -868217030
    //   16087: l2i
    //   16088: ldc_w -1350859671
    //   16091: ixor
    //   16092: ldc2_w 146971083
    //   16095: l2i
    //   16096: ldc_w -681117268
    //   16099: ixor
    //   16100: ixor
    //   16101: lookupswitch default -> 16128, -1530755074 -> 16988, -306631607 -> 16084
    //   16128: goto -> 16132
    //   16131: athrow
    //   16132: invokespecial <init> : (DDDZ)V
    //   16135: goto -> 16139
    //   16138: athrow
    //   16139: getstatic Perryc.c : I
    //   16142: iflt -> 16156
    //   16145: ldc2_w -14926315
    //   16148: l2i
    //   16149: ldc_w -2113498862
    //   16152: ixor
    //   16153: goto -> 16164
    //   16156: ldc2_w -1051944016
    //   16159: l2i
    //   16160: ldc_w -1580967213
    //   16163: ixor
    //   16164: ldc2_w 595571769
    //   16167: l2i
    //   16168: ldc_w -1277793414
    //   16171: ixor
    //   16172: ixor
    //   16173: lookupswitch default -> 17258, -307007420 -> 16156, -266265056 -> 16200
    //   16200: goto -> 16204
    //   16203: athrow
    //   16204: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   16207: goto -> 16211
    //   16210: athrow
    //   16211: goto -> 16979
    //   16214: getstatic Perryc.1 : I
    //   16217: ifeq -> 16231
    //   16220: ldc2_w 1319792410
    //   16223: l2i
    //   16224: ldc_w -864154935
    //   16227: ixor
    //   16228: goto -> 16239
    //   16231: ldc2_w 141625571
    //   16234: l2i
    //   16235: ldc_w -816376358
    //   16238: ixor
    //   16239: ldc2_w 591658053
    //   16242: l2i
    //   16243: ldc_w 1423687246
    //   16246: ixor
    //   16247: ixor
    //   16248: lookupswitch default -> 16276, -1896518969 -> 16231, -179558440 -> 17390
    //   16276: astore_3
    //   16277: new java/lang/StringBuilder
    //   16280: dup
    //   16281: getstatic Perryc.c : I
    //   16284: iflt -> 16298
    //   16287: ldc2_w 2032896470
    //   16290: l2i
    //   16291: ldc_w 357654402
    //   16294: ixor
    //   16295: goto -> 16306
    //   16298: ldc2_w 445517766
    //   16301: l2i
    //   16302: ldc_w -1159478181
    //   16305: ixor
    //   16306: ldc2_w -1110570470
    //   16309: l2i
    //   16310: ldc_w -728457548
    //   16313: ixor
    //   16314: ixor
    //   16315: lookupswitch default -> 16340, -1972642776 -> 16298, 86000378 -> 17334
    //   16340: goto -> 16344
    //   16343: athrow
    //   16344: invokespecial <init> : ()V
    //   16347: goto -> 16351
    //   16350: athrow
    //   16351: ldc_w '邎㌐逎さ勛绰๩莐ษ⢜੧嶚粚諅ഫ辗䡘꫎侰'
    //   16354: getstatic Perryc.0 : I
    //   16357: ifle -> 16371
    //   16360: ldc2_w -189214778
    //   16363: l2i
    //   16364: ldc_w 871828042
    //   16367: ixor
    //   16368: goto -> 16379
    //   16371: ldc2_w -1657595871
    //   16374: l2i
    //   16375: ldc_w -350928717
    //   16378: ixor
    //   16379: ldc2_w 345935672
    //   16382: l2i
    //   16383: ldc_w 1686146066
    //   16386: ixor
    //   16387: ixor
    //   16388: lookupswitch default -> 16416, -1574785078 -> 16371, -1219377498 -> 17414
    //   16416: goto -> 16420
    //   16419: athrow
    //   16420: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16423: goto -> 16427
    //   16426: athrow
    //   16427: getstatic Perryc.0 : I
    //   16430: ifle -> 16444
    //   16433: ldc2_w -1743797157
    //   16436: l2i
    //   16437: ldc_w 482468976
    //   16440: ixor
    //   16441: goto -> 16452
    //   16444: ldc2_w -1820516132
    //   16447: l2i
    //   16448: ldc_w 338259110
    //   16451: ixor
    //   16452: ldc2_w -1004210812
    //   16455: l2i
    //   16456: ldc_w 1532813211
    //   16459: ixor
    //   16460: ixor
    //   16461: lookupswitch default -> 16488, 464914996 -> 17142, 1290854342 -> 16444
    //   16488: goto -> 16492
    //   16491: athrow
    //   16492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16495: goto -> 16499
    //   16498: athrow
    //   16499: getstatic Perryc.0 : I
    //   16502: ifle -> 16516
    //   16505: ldc2_w -1691884749
    //   16508: l2i
    //   16509: ldc_w -1802869306
    //   16512: ixor
    //   16513: goto -> 16524
    //   16516: ldc2_w -1752384285
    //   16519: l2i
    //   16520: ldc_w 939558480
    //   16523: ixor
    //   16524: ldc2_w -1001548951
    //   16527: l2i
    //   16528: ldc_w 845549992
    //   16531: ixor
    //   16532: ixor
    //   16533: lookupswitch default -> 16560, -108657612 -> 17382, 207303478 -> 16516
    //   16560: aload_3
    //   16561: getstatic Perryc.0 : I
    //   16564: ifle -> 16578
    //   16567: ldc2_w 1583865832
    //   16570: l2i
    //   16571: ldc_w 473980812
    //   16574: ixor
    //   16575: goto -> 16586
    //   16578: ldc2_w 379472413
    //   16581: l2i
    //   16582: ldc_w -1103287928
    //   16585: ixor
    //   16586: ldc2_w 2037835641
    //   16589: l2i
    //   16590: ldc_w -1688276813
    //   16593: ixor
    //   16594: ixor
    //   16595: lookupswitch default -> 16620, -1609590866 -> 17366, 1491640699 -> 16578
    //   16620: goto -> 16624
    //   16623: athrow
    //   16624: invokevirtual getMessage : ()Ljava/lang/String;
    //   16627: goto -> 16631
    //   16630: athrow
    //   16631: getstatic Perryc.1 : I
    //   16634: ifeq -> 16648
    //   16637: ldc2_w -2135149239
    //   16640: l2i
    //   16641: ldc_w 522194124
    //   16644: ixor
    //   16645: goto -> 16656
    //   16648: ldc2_w 1593724145
    //   16651: l2i
    //   16652: ldc_w 1544359176
    //   16655: ixor
    //   16656: ldc2_w -1306046379
    //   16659: l2i
    //   16660: ldc_w -592857661
    //   16663: ixor
    //   16664: ixor
    //   16665: lookupswitch default -> 16692, -250422253 -> 17152, 1218641568 -> 16648
    //   16692: goto -> 16696
    //   16695: athrow
    //   16696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16699: goto -> 16703
    //   16702: athrow
    //   16703: getstatic Perryc.0 : I
    //   16706: ifle -> 16720
    //   16709: ldc2_w -446344333
    //   16712: l2i
    //   16713: ldc_w -274627454
    //   16716: ixor
    //   16717: goto -> 16728
    //   16720: ldc2_w 1939422341
    //   16723: l2i
    //   16724: ldc_w 1466329729
    //   16727: ixor
    //   16728: ldc2_w 49582221
    //   16731: l2i
    //   16732: ldc_w -1504727447
    //   16735: ixor
    //   16736: ixor
    //   16737: lookupswitch default -> 17086, -2143000352 -> 16764, -1367348971 -> 16720
    //   16764: goto -> 16768
    //   16767: athrow
    //   16768: invokevirtual toString : ()Ljava/lang/String;
    //   16771: goto -> 16775
    //   16774: athrow
    //   16775: getstatic Perryc.1 : I
    //   16778: ifeq -> 16792
    //   16781: ldc2_w -2104797839
    //   16784: l2i
    //   16785: ldc_w -1641346150
    //   16788: ixor
    //   16789: goto -> 16800
    //   16792: ldc2_w -62350198
    //   16795: l2i
    //   16796: ldc_w 549019535
    //   16799: ixor
    //   16800: ldc2_w 229348562
    //   16803: l2i
    //   16804: ldc_w -812560949
    //   16807: ixor
    //   16808: ixor
    //   16809: lookupswitch default -> 16836, -560297998 -> 17252, 1282564212 -> 16792
    //   16836: goto -> 16840
    //   16839: athrow
    //   16840: invokestatic sendMessage : (Ljava/lang/String;)V
    //   16843: goto -> 16847
    //   16846: athrow
    //   16847: getstatic Perryc.1 : I
    //   16850: ifeq -> 16864
    //   16853: ldc2_w -1574352846
    //   16856: l2i
    //   16857: ldc_w 1770438178
    //   16860: ixor
    //   16861: goto -> 16872
    //   16864: ldc2_w -962865267
    //   16867: l2i
    //   16868: ldc_w 1885353992
    //   16871: ixor
    //   16872: ldc2_w 279532397
    //   16875: l2i
    //   16876: ldc_w -735395734
    //   16879: ixor
    //   16880: ixor
    //   16881: lookupswitch default -> 16908, 115313423 -> 16864, 254567703 -> 17362
    //   16908: aload_0
    //   16909: getstatic Perryc.1 : I
    //   16912: ifeq -> 16926
    //   16915: ldc2_w -1978335497
    //   16918: l2i
    //   16919: ldc_w -531909310
    //   16922: ixor
    //   16923: goto -> 16934
    //   16926: ldc2_w 562065122
    //   16929: l2i
    //   16930: ldc_w -1751742430
    //   16933: ixor
    //   16934: ldc2_w 1741590055
    //   16937: l2i
    //   16938: ldc_w 52293074
    //   16941: ixor
    //   16942: ixor
    //   16943: lookupswitch default -> 17094, -758807243 -> 16968, 244066368 -> 16926
    //   16968: goto -> 16972
    //   16971: athrow
    //   16972: invokevirtual disable : ()V
    //   16975: goto -> 16979
    //   16978: athrow
    //   16979: return
    //   16980: aconst_null
    //   16981: athrow
    //   16982: aconst_null
    //   16983: athrow
    //   16984: aconst_null
    //   16985: athrow
    //   16986: aconst_null
    //   16987: athrow
    //   16988: aconst_null
    //   16989: athrow
    //   16990: aconst_null
    //   16991: athrow
    //   16992: aconst_null
    //   16993: athrow
    //   16994: aconst_null
    //   16995: athrow
    //   16996: aconst_null
    //   16997: athrow
    //   16998: aconst_null
    //   16999: athrow
    //   17000: aconst_null
    //   17001: athrow
    //   17002: aconst_null
    //   17003: athrow
    //   17004: aconst_null
    //   17005: athrow
    //   17006: aconst_null
    //   17007: athrow
    //   17008: aconst_null
    //   17009: athrow
    //   17010: aconst_null
    //   17011: athrow
    //   17012: aconst_null
    //   17013: athrow
    //   17014: aconst_null
    //   17015: athrow
    //   17016: aconst_null
    //   17017: athrow
    //   17018: aconst_null
    //   17019: athrow
    //   17020: aconst_null
    //   17021: athrow
    //   17022: aconst_null
    //   17023: athrow
    //   17024: aconst_null
    //   17025: athrow
    //   17026: aconst_null
    //   17027: athrow
    //   17028: aconst_null
    //   17029: athrow
    //   17030: aconst_null
    //   17031: athrow
    //   17032: aconst_null
    //   17033: athrow
    //   17034: aconst_null
    //   17035: athrow
    //   17036: aconst_null
    //   17037: athrow
    //   17038: aconst_null
    //   17039: athrow
    //   17040: aconst_null
    //   17041: athrow
    //   17042: aconst_null
    //   17043: athrow
    //   17044: aconst_null
    //   17045: athrow
    //   17046: aconst_null
    //   17047: athrow
    //   17048: aconst_null
    //   17049: athrow
    //   17050: aconst_null
    //   17051: athrow
    //   17052: aconst_null
    //   17053: athrow
    //   17054: aconst_null
    //   17055: athrow
    //   17056: aconst_null
    //   17057: athrow
    //   17058: aconst_null
    //   17059: athrow
    //   17060: aconst_null
    //   17061: athrow
    //   17062: aconst_null
    //   17063: athrow
    //   17064: aconst_null
    //   17065: athrow
    //   17066: aconst_null
    //   17067: athrow
    //   17068: aconst_null
    //   17069: athrow
    //   17070: aconst_null
    //   17071: athrow
    //   17072: aconst_null
    //   17073: athrow
    //   17074: aconst_null
    //   17075: athrow
    //   17076: aconst_null
    //   17077: athrow
    //   17078: aconst_null
    //   17079: athrow
    //   17080: aconst_null
    //   17081: athrow
    //   17082: aconst_null
    //   17083: athrow
    //   17084: aconst_null
    //   17085: athrow
    //   17086: aconst_null
    //   17087: athrow
    //   17088: aconst_null
    //   17089: athrow
    //   17090: aconst_null
    //   17091: athrow
    //   17092: aconst_null
    //   17093: athrow
    //   17094: aconst_null
    //   17095: athrow
    //   17096: aconst_null
    //   17097: athrow
    //   17098: aconst_null
    //   17099: athrow
    //   17100: aconst_null
    //   17101: athrow
    //   17102: aconst_null
    //   17103: athrow
    //   17104: aconst_null
    //   17105: athrow
    //   17106: aconst_null
    //   17107: athrow
    //   17108: aconst_null
    //   17109: athrow
    //   17110: aconst_null
    //   17111: athrow
    //   17112: aconst_null
    //   17113: athrow
    //   17114: aconst_null
    //   17115: athrow
    //   17116: aconst_null
    //   17117: athrow
    //   17118: aconst_null
    //   17119: athrow
    //   17120: aconst_null
    //   17121: athrow
    //   17122: aconst_null
    //   17123: athrow
    //   17124: aconst_null
    //   17125: athrow
    //   17126: aconst_null
    //   17127: athrow
    //   17128: aconst_null
    //   17129: athrow
    //   17130: aconst_null
    //   17131: athrow
    //   17132: aconst_null
    //   17133: athrow
    //   17134: aconst_null
    //   17135: athrow
    //   17136: aconst_null
    //   17137: athrow
    //   17138: aconst_null
    //   17139: athrow
    //   17140: aconst_null
    //   17141: athrow
    //   17142: aconst_null
    //   17143: athrow
    //   17144: aconst_null
    //   17145: athrow
    //   17146: aconst_null
    //   17147: athrow
    //   17148: aconst_null
    //   17149: athrow
    //   17150: aconst_null
    //   17151: athrow
    //   17152: aconst_null
    //   17153: athrow
    //   17154: aconst_null
    //   17155: athrow
    //   17156: aconst_null
    //   17157: athrow
    //   17158: aconst_null
    //   17159: athrow
    //   17160: aconst_null
    //   17161: athrow
    //   17162: aconst_null
    //   17163: athrow
    //   17164: aconst_null
    //   17165: athrow
    //   17166: aconst_null
    //   17167: athrow
    //   17168: aconst_null
    //   17169: athrow
    //   17170: aconst_null
    //   17171: athrow
    //   17172: aconst_null
    //   17173: athrow
    //   17174: aconst_null
    //   17175: athrow
    //   17176: aconst_null
    //   17177: athrow
    //   17178: aconst_null
    //   17179: athrow
    //   17180: aconst_null
    //   17181: athrow
    //   17182: aconst_null
    //   17183: athrow
    //   17184: aconst_null
    //   17185: athrow
    //   17186: aconst_null
    //   17187: athrow
    //   17188: aconst_null
    //   17189: athrow
    //   17190: aconst_null
    //   17191: athrow
    //   17192: aconst_null
    //   17193: athrow
    //   17194: aconst_null
    //   17195: athrow
    //   17196: aconst_null
    //   17197: athrow
    //   17198: aconst_null
    //   17199: athrow
    //   17200: aconst_null
    //   17201: athrow
    //   17202: aconst_null
    //   17203: athrow
    //   17204: aconst_null
    //   17205: athrow
    //   17206: aconst_null
    //   17207: athrow
    //   17208: aconst_null
    //   17209: athrow
    //   17210: aconst_null
    //   17211: athrow
    //   17212: aconst_null
    //   17213: athrow
    //   17214: aconst_null
    //   17215: athrow
    //   17216: aconst_null
    //   17217: athrow
    //   17218: aconst_null
    //   17219: athrow
    //   17220: aconst_null
    //   17221: athrow
    //   17222: aconst_null
    //   17223: athrow
    //   17224: aconst_null
    //   17225: athrow
    //   17226: aconst_null
    //   17227: athrow
    //   17228: aconst_null
    //   17229: athrow
    //   17230: aconst_null
    //   17231: athrow
    //   17232: aconst_null
    //   17233: athrow
    //   17234: aconst_null
    //   17235: athrow
    //   17236: aconst_null
    //   17237: athrow
    //   17238: aconst_null
    //   17239: athrow
    //   17240: aconst_null
    //   17241: athrow
    //   17242: aconst_null
    //   17243: athrow
    //   17244: aconst_null
    //   17245: athrow
    //   17246: aconst_null
    //   17247: athrow
    //   17248: aconst_null
    //   17249: athrow
    //   17250: aconst_null
    //   17251: athrow
    //   17252: aconst_null
    //   17253: athrow
    //   17254: aconst_null
    //   17255: athrow
    //   17256: aconst_null
    //   17257: athrow
    //   17258: aconst_null
    //   17259: athrow
    //   17260: aconst_null
    //   17261: athrow
    //   17262: aconst_null
    //   17263: athrow
    //   17264: aconst_null
    //   17265: athrow
    //   17266: aconst_null
    //   17267: athrow
    //   17268: aconst_null
    //   17269: athrow
    //   17270: aconst_null
    //   17271: athrow
    //   17272: aconst_null
    //   17273: athrow
    //   17274: aconst_null
    //   17275: athrow
    //   17276: aconst_null
    //   17277: athrow
    //   17278: aconst_null
    //   17279: athrow
    //   17280: aconst_null
    //   17281: athrow
    //   17282: aconst_null
    //   17283: athrow
    //   17284: aconst_null
    //   17285: athrow
    //   17286: aconst_null
    //   17287: athrow
    //   17288: aconst_null
    //   17289: athrow
    //   17290: aconst_null
    //   17291: athrow
    //   17292: aconst_null
    //   17293: athrow
    //   17294: aconst_null
    //   17295: athrow
    //   17296: aconst_null
    //   17297: athrow
    //   17298: aconst_null
    //   17299: athrow
    //   17300: aconst_null
    //   17301: athrow
    //   17302: aconst_null
    //   17303: athrow
    //   17304: aconst_null
    //   17305: athrow
    //   17306: aconst_null
    //   17307: athrow
    //   17308: aconst_null
    //   17309: athrow
    //   17310: aconst_null
    //   17311: athrow
    //   17312: aconst_null
    //   17313: athrow
    //   17314: aconst_null
    //   17315: athrow
    //   17316: aconst_null
    //   17317: athrow
    //   17318: aconst_null
    //   17319: athrow
    //   17320: aconst_null
    //   17321: athrow
    //   17322: aconst_null
    //   17323: athrow
    //   17324: aconst_null
    //   17325: athrow
    //   17326: aconst_null
    //   17327: athrow
    //   17328: aconst_null
    //   17329: athrow
    //   17330: aconst_null
    //   17331: athrow
    //   17332: aconst_null
    //   17333: athrow
    //   17334: aconst_null
    //   17335: athrow
    //   17336: aconst_null
    //   17337: athrow
    //   17338: aconst_null
    //   17339: athrow
    //   17340: aconst_null
    //   17341: athrow
    //   17342: aconst_null
    //   17343: athrow
    //   17344: aconst_null
    //   17345: athrow
    //   17346: aconst_null
    //   17347: athrow
    //   17348: aconst_null
    //   17349: athrow
    //   17350: aconst_null
    //   17351: athrow
    //   17352: aconst_null
    //   17353: athrow
    //   17354: aconst_null
    //   17355: athrow
    //   17356: aconst_null
    //   17357: athrow
    //   17358: aconst_null
    //   17359: athrow
    //   17360: aconst_null
    //   17361: athrow
    //   17362: aconst_null
    //   17363: athrow
    //   17364: aconst_null
    //   17365: athrow
    //   17366: aconst_null
    //   17367: athrow
    //   17368: aconst_null
    //   17369: athrow
    //   17370: aconst_null
    //   17371: athrow
    //   17372: aconst_null
    //   17373: athrow
    //   17374: aconst_null
    //   17375: athrow
    //   17376: aconst_null
    //   17377: athrow
    //   17378: aconst_null
    //   17379: athrow
    //   17380: aconst_null
    //   17381: athrow
    //   17382: aconst_null
    //   17383: athrow
    //   17384: aconst_null
    //   17385: athrow
    //   17386: aconst_null
    //   17387: athrow
    //   17388: aconst_null
    //   17389: athrow
    //   17390: aconst_null
    //   17391: athrow
    //   17392: aconst_null
    //   17393: athrow
    //   17394: aconst_null
    //   17395: athrow
    //   17396: aconst_null
    //   17397: athrow
    //   17398: aconst_null
    //   17399: athrow
    //   17400: aconst_null
    //   17401: athrow
    //   17402: aconst_null
    //   17403: athrow
    //   17404: aconst_null
    //   17405: athrow
    //   17406: aconst_null
    //   17407: athrow
    //   17408: aconst_null
    //   17409: athrow
    //   17410: aconst_null
    //   17411: athrow
    //   17412: aconst_null
    //   17413: athrow
    //   17414: aconst_null
    //   17415: athrow
    //   17416: aconst_null
    //   17417: athrow
    //   17418: aconst_null
    //   17419: athrow
    //   17420: aconst_null
    //   17421: athrow
    //   17422: aconst_null
    //   17423: athrow
    //   17424: aconst_null
    //   17425: athrow
    //   17426: aconst_null
    //   17427: athrow
    //   17428: aconst_null
    //   17429: athrow
    //   17430: aconst_null
    //   17431: athrow
    //   17432: aconst_null
    //   17433: athrow
    //   17434: aconst_null
    //   17435: athrow
    //   17436: aconst_null
    //   17437: athrow
    //   17438: aconst_null
    //   17439: athrow
    //   17440: aconst_null
    //   17441: athrow
    //   17442: aconst_null
    //   17443: athrow
    //   17444: aconst_null
    //   17445: athrow
    //   17446: aconst_null
    //   17447: athrow
    //   17448: pop
    //   17449: goto -> 24
    //   17452: pop
    //   17453: aconst_null
    //   17454: goto -> 17448
    //   17457: dup
    //   17458: ifnull -> 17448
    //   17461: checkcast java/lang/Throwable
    //   17464: athrow
    //   17465: dup
    //   17466: ifnull -> 17452
    //   17469: checkcast java/lang/Throwable
    //   17472: athrow
    //   17473: aconst_null
    //   17474: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1737	14474	3	yaw	D
    //   5322	10889	5	xDir	D
    //   5590	10621	7	zDir	D
    //   1814	14397	9	dO_numer	D
    //   1890	14321	11	dO_denom	D
    //   8218	7993	13	yes	Z
    //   13246	2965	14	dx	D
    //   13322	2889	16	dy	D
    //   13398	2813	18	dz	D
    //   16277	702	3	e	Ljava/lang/Exception;
    //   24	16956	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Phase;
    //   93	16887	1	last	J
    // Exception table:
    //   from	to	target	type
    //   8	20	17457	finally
    //   93	1456	16214	java/lang/Exception
    //   479	486	486	finally
    //   479	486	479	java/lang/NullPointerException
    //   480	486	479	finally
    //   480	486	486	finally
    //   480	486	479	finally
    //   555	562	562	finally
    //   555	562	562	finally
    //   555	562	555	finally
    //   556	562	3	finally
    //   556	562	562	java/lang/AssertionError
    //   995	1002	1002	finally
    //   995	1002	1002	java/lang/AssertionError
    //   996	1002	995	java/util/ConcurrentModificationException
    //   996	1002	995	java/lang/NullPointerException
    //   996	1002	1002	java/lang/IndexOutOfBoundsException
    //   1071	1078	1078	finally
    //   1071	1078	1071	finally
    //   1071	1078	1071	finally
    //   1072	1078	1071	java/lang/RuntimeException
    //   1072	1078	3	finally
    //   1319	1326	1326	finally
    //   1319	1326	1319	java/lang/ClassCastException
    //   1320	1326	1319	finally
    //   1320	1326	1326	finally
    //   1320	1326	1319	java/lang/IllegalArgumentException
    //   1395	1402	1402	finally
    //   1395	1402	3	java/lang/NegativeArraySizeException
    //   1395	1402	3	finally
    //   1396	1402	1395	finally
    //   1396	1402	1402	finally
    //   1457	5179	16214	java/lang/Exception
    //   2147	2154	2154	finally
    //   2147	2154	2154	finally
    //   2147	2154	3	finally
    //   2147	2154	2154	java/lang/IllegalStateException
    //   2148	2154	2147	java/lang/ClassCastException
    //   2743	2750	2750	finally
    //   2743	2750	3	finally
    //   2743	2750	2750	finally
    //   2744	2750	3	java/lang/AssertionError
    //   2744	2750	2743	finally
    //   3339	3346	3346	finally
    //   3339	3346	3346	finally
    //   3339	3346	3346	finally
    //   3340	3346	3339	java/lang/ClassCastException
    //   3340	3346	3339	finally
    //   3935	3942	3942	finally
    //   3935	3942	3942	java/lang/RuntimeException
    //   3935	3942	3935	java/lang/ClassCastException
    //   3936	3942	3	finally
    //   3936	3942	3	java/lang/StringIndexOutOfBoundsException
    //   5180	5186	5186	finally
    //   5180	5186	3	finally
    //   5180	5186	5186	java/lang/ArrayIndexOutOfBoundsException
    //   5180	5186	5186	java/lang/RuntimeException
    //   5180	5186	3	java/lang/NullPointerException
    //   5180	6479	16214	java/lang/Exception
    //   5251	5258	5258	finally
    //   5251	5258	3	finally
    //   5251	5258	5258	finally
    //   5251	5258	5258	java/lang/ClassCastException
    //   5252	5258	5251	java/lang/UnsupportedOperationException
    //   5447	5454	5454	finally
    //   5447	5454	3	java/lang/ArithmeticException
    //   5448	5454	5454	java/lang/UnsupportedOperationException
    //   5448	5454	5447	java/lang/NegativeArraySizeException
    //   5448	5454	3	finally
    //   5519	5526	5526	finally
    //   5519	5526	5526	java/lang/ClassCastException
    //   5519	5526	3	java/lang/NegativeArraySizeException
    //   5519	5526	5519	java/lang/IllegalArgumentException
    //   5520	5526	5526	finally
    //   5847	5854	5854	finally
    //   5847	5854	3	java/lang/StringIndexOutOfBoundsException
    //   5847	5854	5847	java/lang/UnsupportedOperationException
    //   5848	5854	5854	finally
    //   5848	5854	3	java/lang/RuntimeException
    //   6163	6170	6170	finally
    //   6163	6170	6163	finally
    //   6163	6170	6170	java/lang/ArithmeticException
    //   6163	6170	6170	finally
    //   6164	6170	3	java/lang/ArithmeticException
    //   6480	6486	6486	finally
    //   6480	6486	3	java/lang/NumberFormatException
    //   6480	6486	3	java/lang/UnsupportedOperationException
    //   6480	6486	6486	java/lang/ArrayIndexOutOfBoundsException
    //   6480	6486	6486	java/lang/NullPointerException
    //   6480	10319	16214	java/lang/Exception
    //   6795	6802	6802	finally
    //   6795	6802	6795	java/lang/NullPointerException
    //   6795	6802	3	finally
    //   6796	6802	6795	java/lang/ClassCastException
    //   6796	6802	3	finally
    //   7235	7242	7242	finally
    //   7235	7242	7242	java/lang/ArrayIndexOutOfBoundsException
    //   7236	7242	7235	finally
    //   7236	7242	7235	java/lang/AssertionError
    //   7236	7242	7235	finally
    //   7311	7318	7318	finally
    //   7311	7318	3	java/lang/ArrayIndexOutOfBoundsException
    //   7311	7318	7311	finally
    //   7312	7318	3	java/lang/IndexOutOfBoundsException
    //   7312	7318	3	java/lang/ArithmeticException
    //   7779	7786	7786	finally
    //   7779	7786	7779	java/util/NoSuchElementException
    //   7779	7786	7786	finally
    //   7780	7786	7779	java/lang/RuntimeException
    //   7780	7786	7779	java/lang/NegativeArraySizeException
    //   7855	7862	7862	finally
    //   7855	7862	7855	java/lang/IllegalArgumentException
    //   7855	7862	7855	finally
    //   7856	7862	7855	finally
    //   7856	7862	7862	finally
    //   8663	8670	8670	finally
    //   8663	8670	8670	finally
    //   8663	8670	8670	finally
    //   8663	8670	3	java/lang/NumberFormatException
    //   8663	8670	8663	java/lang/IllegalStateException
    //   9699	9706	9706	finally
    //   9699	9706	3	finally
    //   9699	9706	3	java/util/ConcurrentModificationException
    //   9699	9706	9699	java/lang/AssertionError
    //   9700	9706	3	finally
    //   9775	9782	9782	finally
    //   9775	9782	3	java/lang/IllegalStateException
    //   9775	9782	3	finally
    //   9775	9782	9775	finally
    //   9776	9782	9775	finally
    //   10071	10078	10078	finally
    //   10071	10078	10071	finally
    //   10072	10078	10078	finally
    //   10072	10078	10078	finally
    //   10072	10078	3	java/lang/IndexOutOfBoundsException
    //   10320	10326	10326	finally
    //   10320	10326	3	finally
    //   10320	10326	3	finally
    //   10320	10326	10326	java/lang/NullPointerException
    //   10320	10326	3	finally
    //   10320	10395	16214	java/lang/Exception
    //   10396	10402	10402	finally
    //   10396	10402	3	java/lang/NumberFormatException
    //   10396	10402	3	finally
    //   10396	10402	10402	java/lang/NegativeArraySizeException
    //   10396	10402	3	java/lang/IndexOutOfBoundsException
    //   10396	10691	16214	java/lang/Exception
    //   10692	10698	10698	finally
    //   10692	10698	3	finally
    //   10692	10698	3	finally
    //   10692	10698	10698	java/lang/StringIndexOutOfBoundsException
    //   10692	10698	10698	finally
    //   10692	11015	16214	java/lang/Exception
    //   10939	10946	10946	finally
    //   10939	10946	10946	finally
    //   10939	10946	3	java/lang/RuntimeException
    //   10939	10946	10939	java/lang/ClassCastException
    //   10940	10946	3	finally
    //   11016	11022	11022	finally
    //   11016	11022	3	finally
    //   11016	11022	11022	finally
    //   11016	11022	3	finally
    //   11016	11022	11022	finally
    //   11016	11511	16214	java/lang/Exception
    //   11512	11518	11518	finally
    //   11512	11518	3	java/lang/IndexOutOfBoundsException
    //   11512	11518	3	java/util/NoSuchElementException
    //   11512	11518	11518	finally
    //   11512	11518	3	java/lang/AssertionError
    //   11512	13163	16214	java/lang/Exception
    //   11583	11590	11590	finally
    //   11583	11590	11583	java/util/NoSuchElementException
    //   11584	11590	3	finally
    //   11584	11590	11590	java/lang/RuntimeException
    //   11584	11590	11583	java/lang/AssertionError
    //   12035	12042	12042	finally
    //   12035	12042	3	java/lang/ClassCastException
    //   12036	12042	12035	java/util/ConcurrentModificationException
    //   12036	12042	12035	finally
    //   12036	12042	12035	finally
    //   13091	13098	13098	finally
    //   13091	13098	3	finally
    //   13091	13098	13098	finally
    //   13091	13098	13091	finally
    //   13092	13098	13098	finally
    //   13164	13170	13170	finally
    //   13164	13170	3	java/lang/IndexOutOfBoundsException
    //   13164	13170	3	finally
    //   13164	13170	3	java/lang/EnumConstantNotPresentException
    //   13164	13170	13170	java/util/ConcurrentModificationException
    //   13164	16211	16214	java/lang/Exception
    //   13655	13662	13662	finally
    //   13655	13662	13662	java/lang/StringIndexOutOfBoundsException
    //   13656	13662	3	java/lang/IllegalStateException
    //   13656	13662	13655	java/lang/NullPointerException
    //   13656	13662	13662	java/util/ConcurrentModificationException
    //   14047	14054	14054	finally
    //   14048	14054	14047	finally
    //   14048	14054	14054	finally
    //   14048	14054	14047	finally
    //   14048	14054	3	java/lang/ArithmeticException
    //   15335	15342	15342	finally
    //   15335	15342	15335	java/lang/AssertionError
    //   15335	15342	15335	java/lang/NumberFormatException
    //   15336	15342	15342	java/lang/UnsupportedOperationException
    //   15336	15342	3	finally
    //   15471	15478	15478	finally
    //   15471	15478	3	java/lang/NegativeArraySizeException
    //   15471	15478	15478	java/lang/IllegalArgumentException
    //   15471	15478	3	java/lang/IndexOutOfBoundsException
    //   15471	15478	15471	java/lang/AssertionError
    //   16131	16138	16138	finally
    //   16131	16138	16131	java/lang/AssertionError
    //   16132	16138	3	java/lang/NumberFormatException
    //   16132	16138	16131	java/lang/ArrayIndexOutOfBoundsException
    //   16132	16138	3	java/util/NoSuchElementException
    //   16203	16210	16210	finally
    //   16203	16210	16203	finally
    //   16203	16210	16203	java/util/NoSuchElementException
    //   16203	16210	16203	finally
    //   16204	16210	3	finally
    //   16343	16350	16350	finally
    //   16343	16350	3	java/lang/IndexOutOfBoundsException
    //   16343	16350	16343	finally
    //   16344	16350	16343	java/lang/StringIndexOutOfBoundsException
    //   16344	16350	16350	java/lang/IllegalStateException
    //   16420	16426	16426	finally
    //   16420	16426	16426	java/lang/NullPointerException
    //   16420	16426	3	finally
    //   16420	16426	16426	java/lang/EnumConstantNotPresentException
    //   16420	16426	16426	finally
    //   16491	16498	16498	finally
    //   16492	16498	3	java/lang/NegativeArraySizeException
    //   16492	16498	16498	finally
    //   16492	16498	16498	java/util/NoSuchElementException
    //   16492	16498	16491	java/lang/ArrayIndexOutOfBoundsException
    //   16623	16630	16630	finally
    //   16624	16630	16623	finally
    //   16624	16630	16623	finally
    //   16624	16630	3	finally
    //   16624	16630	3	finally
    //   16696	16702	16702	finally
    //   16696	16702	3	java/lang/AssertionError
    //   16696	16702	3	java/lang/IndexOutOfBoundsException
    //   16696	16702	3	finally
    //   16696	16702	3	finally
    //   16767	16774	16774	finally
    //   16767	16774	3	finally
    //   16767	16774	16774	finally
    //   16767	16774	3	java/lang/AssertionError
    //   16768	16774	16767	finally
    //   16840	16846	16846	finally
    //   16840	16846	16846	finally
    //   16840	16846	3	java/lang/StringIndexOutOfBoundsException
    //   16840	16846	16846	finally
    //   16840	16846	3	finally
    //   16971	16978	16978	finally
    //   16971	16978	3	java/lang/IllegalStateException
    //   16972	16978	16971	java/lang/NumberFormatException
    //   16972	16978	3	finally
    //   16972	16978	16978	finally
    //   17457	17465	17457	finally
    //   17473	17475	3	finally
  }
  
  public void setInstance() {
    Perry1.44(this, (int)-511550325L ^ 0x831A2FC5);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\Phase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */