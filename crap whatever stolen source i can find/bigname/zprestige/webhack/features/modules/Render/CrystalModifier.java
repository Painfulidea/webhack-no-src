package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class CrystalModifier extends Module {
  public static CrystalModifier INSTANCE;
  
  public Setting<Integer> red;
  
  public Setting<Integer> blue;
  
  public Setting<Integer> green;
  
  public Setting<Float> lineWidth;
  
  public Setting<Float> scale;
  
  public Setting<Boolean> crystalChams;
  
  public Setting<Integer> speed;
  
  public Setting<Integer> crystalAlpha;
  
  public Setting<Boolean> rainbow;
  
  public Setting<Boolean> crystalWireframe;
  
  public Setting<Integer> saturation;
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.2c(this, (int)1829315232L ^ 0x299354A5, paramObject);
  }
  
  public boolean lambda$new$5(Object paramObject) {
    return Perry1.1V(this, (int)1763515893L ^ 0xBFED3D4, paramObject);
  }
  
  public boolean lambda$new$3(Object paramObject) {
    return Perry1.1u(this, (int)-591146667L ^ 0xA1CC7895, paramObject);
  }
  
  public CrystalModifier() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -573307424
    //   9: l2i
    //   10: ldc -1625568629
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1114848570
    //   19: l2i
    //   20: ldc -808968387
    //   22: ixor
    //   23: ldc2_w -1583103844
    //   26: l2i
    //   27: ldc 1120423287
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 7218, -1583070592 -> 16, 1859170284 -> 56
    //   56: aload_0
    //   57: ldc '疅㌁痕㶤섑鬛๵ࠦ蹬鷿쵴ਡ롷煤᤟'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -1308870283
    //   68: l2i
    //   69: ldc 1316109242
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 497737190
    //   78: l2i
    //   79: ldc 305898209
    //   81: ixor
    //   82: ldc2_w -410955134
    //   85: l2i
    //   86: ldc -1489619401
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -1086757254 -> 7064, 730547966 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '疳㌁疌㶺섐鬗'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 1285814026
    //   130: l2i
    //   131: ldc -2023198236
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1748527244
    //   140: l2i
    //   141: ldc 1264302138
    //   143: ixor
    //   144: ldc2_w -1388830893
    //   147: l2i
    //   148: ldc 360401036
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -598084142 -> 137, 1938346289 -> 7026
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w -270636507
    //   192: l2i
    //   193: ldc 896868448
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -801537562
    //   202: l2i
    //   203: ldc 1551911212
    //   205: ixor
    //   206: ldc2_w 1899431198
    //   209: l2i
    //   210: ldc -1130296936
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, 389891779 -> 7180, 1864287190 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 421532111
    //   246: l2i
    //   247: ldc 421532110
    //   249: ixor
    //   250: ldc2_w 1548177320
    //   253: l2i
    //   254: ldc 1548177320
    //   256: ixor
    //   257: ldc2_w -1723335411
    //   260: l2i
    //   261: ldc -1723335411
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w -2108630969
    //   273: l2i
    //   274: ldc 1600289227
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1356991126
    //   283: l2i
    //   284: ldc 1717211123
    //   286: ixor
    //   287: ldc2_w 1727142761
    //   290: l2i
    //   291: ldc -1232862406
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1114911022 -> 280, 222607839 -> 7078
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -655931562
    //   332: l2i
    //   333: ldc -386787227
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -808892003
    //   342: l2i
    //   343: ldc 1031630949
    //   345: ixor
    //   346: ldc2_w -586441924
    //   349: l2i
    //   350: ldc 313163840
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -4963249 -> 7208, 1811443026 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w 957744193
    //   390: l2i
    //   391: ldc -638492423
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -1137372176
    //   400: l2i
    //   401: ldc 2020506148
    //   403: ixor
    //   404: ldc2_w -587573629
    //   407: l2i
    //   408: ldc -1166551870
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 7202, -2039814407 -> 397, -1562973291 -> 440
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '疅㌁痕㶤섑鬛๵ࡋ蹀鷳쵼ਪ롭'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w -1226698763
    //   456: l2i
    //   457: ldc -475998300
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 1562422669
    //   466: l2i
    //   467: ldc 616694200
    //   469: ixor
    //   470: ldc2_w 1141230863
    //   473: l2i
    //   474: ldc -328826632
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 7042, -780017214 -> 504, -48130650 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -1022865173
    //   510: l2i
    //   511: ldc -1022865173
    //   513: ixor
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w 1098042736
    //   523: l2i
    //   524: ldc 2130098540
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w 1926959138
    //   533: l2i
    //   534: ldc -626375457
    //   536: ixor
    //   537: ldc2_w 2026132684
    //   540: l2i
    //   541: ldc -1791523802
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 7196, -763910922 -> 530, 1166181399 -> 572
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.0 : I
    //   578: ifle -> 591
    //   581: ldc2_w -1547655724
    //   584: l2i
    //   585: ldc -105272980
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w -1779085774
    //   594: l2i
    //   595: ldc -1812919981
    //   597: ixor
    //   598: ldc2_w -567842292
    //   601: l2i
    //   602: ldc 2109253362
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 7138, -1516532833 -> 632, -102318010 -> 591
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.c : I
    //   638: iflt -> 651
    //   641: ldc2_w -1655081362
    //   644: l2i
    //   645: ldc -464059485
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w 623613931
    //   654: l2i
    //   655: ldc -753092965
    //   657: ixor
    //   658: ldc2_w -1270766954
    //   661: l2i
    //   662: ldc 1188416833
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 7176, -1952835046 -> 651, 77811367 -> 692
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.1 : I
    //   698: ifeq -> 711
    //   701: ldc2_w 1194442556
    //   704: l2i
    //   705: ldc 126454114
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -1413314633
    //   714: l2i
    //   715: ldc 835831575
    //   717: ixor
    //   718: ldc2_w -1941963023
    //   721: l2i
    //   722: ldc 1488367325
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 7212, -1808701838 -> 711, 1318719628 -> 752
    //   752: putfield crystalChams : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 771
    //   761: ldc2_w 370152222
    //   764: l2i
    //   765: ldc -1004775971
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w -1845749431
    //   774: l2i
    //   775: ldc -953175970
    //   777: ixor
    //   778: ldc2_w -59766747
    //   781: l2i
    //   782: ldc -1522902771
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 7126, -1958340629 -> 771, 261748799 -> 812
    //   812: aload_0
    //   813: getstatic Perryc.c : I
    //   816: iflt -> 829
    //   819: ldc2_w -352774643
    //   822: l2i
    //   823: ldc 975635764
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w -561028383
    //   832: l2i
    //   833: ldc 1008176909
    //   835: ixor
    //   836: ldc2_w 1037501958
    //   839: l2i
    //   840: ldc 2011348295
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 7170, -1695831944 -> 829, -1465035091 -> 872
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc '疅㌁痕㶤섑鬛๵ࡋ蹔鷲쵯ਢ롸煳ᤌ辚'
    //   879: getstatic Perryc.0 : I
    //   882: ifle -> 895
    //   885: ldc2_w -1835742332
    //   888: l2i
    //   889: ldc -828099557
    //   891: ixor
    //   892: goto -> 902
    //   895: ldc2_w 1375489335
    //   898: l2i
    //   899: ldc -1529651762
    //   901: ixor
    //   902: ldc2_w 1960649023
    //   905: l2i
    //   906: ldc -1069405140
    //   908: ixor
    //   909: ixor
    //   910: lookupswitch default -> 7036, -391122292 -> 895, 1102061034 -> 936
    //   936: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   939: ldc2_w -848597510
    //   942: l2i
    //   943: ldc -848597510
    //   945: ixor
    //   946: getstatic Perryc.0 : I
    //   949: ifle -> 962
    //   952: ldc2_w -1979996050
    //   955: l2i
    //   956: ldc 1200333237
    //   958: ixor
    //   959: goto -> 970
    //   962: ldc2_w 1415371303
    //   965: l2i
    //   966: ldc_w 2029581433
    //   969: ixor
    //   970: ldc2_w 583860424
    //   973: l2i
    //   974: ldc_w 1231395601
    //   977: ixor
    //   978: ixor
    //   979: lookupswitch default -> 1004, -1588724641 -> 962, -1512533502 -> 7012
    //   1004: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1007: getstatic Perryc.c : I
    //   1010: iflt -> 1024
    //   1013: ldc2_w 1270165207
    //   1016: l2i
    //   1017: ldc_w -577705654
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w 1405338341
    //   1027: l2i
    //   1028: ldc_w -153077800
    //   1031: ixor
    //   1032: ldc2_w -139965175
    //   1035: l2i
    //   1036: ldc_w -262357572
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 1068, -1848559832 -> 7046, -138461605 -> 1024
    //   1068: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1071: getstatic Perryc.1 : I
    //   1074: ifeq -> 1088
    //   1077: ldc2_w -2001146088
    //   1080: l2i
    //   1081: ldc_w 1632827401
    //   1084: ixor
    //   1085: goto -> 1096
    //   1088: ldc2_w 1981619486
    //   1091: l2i
    //   1092: ldc_w -1950244573
    //   1095: ixor
    //   1096: ldc2_w 1504973890
    //   1099: l2i
    //   1100: ldc_w -1462059597
    //   1103: ixor
    //   1104: ixor
    //   1105: lookupswitch default -> 7076, 212997580 -> 1132, 411352800 -> 1088
    //   1132: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1135: getstatic Perryc.c : I
    //   1138: iflt -> 1152
    //   1141: ldc2_w 817251843
    //   1144: l2i
    //   1145: ldc_w 983189118
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w 1787856073
    //   1155: l2i
    //   1156: ldc_w 292228281
    //   1159: ixor
    //   1160: ldc2_w 1399063841
    //   1163: l2i
    //   1164: ldc_w 909986246
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 7134, 513983639 -> 1196, 1869958298 -> 1152
    //   1196: putfield crystalWireframe : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1199: getstatic Perryc.1 : I
    //   1202: ifeq -> 1216
    //   1205: ldc2_w -1023201670
    //   1208: l2i
    //   1209: ldc_w -1559024461
    //   1212: ixor
    //   1213: goto -> 1224
    //   1216: ldc2_w -159787157
    //   1219: l2i
    //   1220: ldc_w -1931636354
    //   1223: ixor
    //   1224: ldc2_w -894516444
    //   1227: l2i
    //   1228: ldc_w -832183182
    //   1231: ixor
    //   1232: ixor
    //   1233: lookupswitch default -> 1260, 923717335 -> 1216, 1692083615 -> 7198
    //   1260: aload_0
    //   1261: getstatic Perryc.c : I
    //   1264: iflt -> 1278
    //   1267: ldc2_w 1851678600
    //   1270: l2i
    //   1271: ldc_w 1633996998
    //   1274: ixor
    //   1275: goto -> 1286
    //   1278: ldc2_w 687375156
    //   1281: l2i
    //   1282: ldc_w -1017615882
    //   1285: ixor
    //   1286: ldc2_w 1776743582
    //   1289: l2i
    //   1290: ldc_w 204454254
    //   1293: ixor
    //   1294: ixor
    //   1295: lookupswitch default -> 1320, 776124956 -> 1278, 1794359998 -> 7182
    //   1320: aload_0
    //   1321: new bigname/zprestige/webhack/features/setting/Setting
    //   1324: dup
    //   1325: ldc_w '疕㌐痍㶻섀'
    //   1328: getstatic Perryc.c : I
    //   1331: iflt -> 1345
    //   1334: ldc2_w 520375066
    //   1337: l2i
    //   1338: ldc_w -1841764878
    //   1341: ixor
    //   1342: goto -> 1353
    //   1345: ldc2_w -1594511028
    //   1348: l2i
    //   1349: ldc_w -571131482
    //   1352: ixor
    //   1353: ldc2_w -309898071
    //   1356: l2i
    //   1357: ldc_w 1696476984
    //   1360: ixor
    //   1361: ixor
    //   1362: lookupswitch default -> 7220, -174460037 -> 1388, 94754169 -> 1345
    //   1388: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1391: ldc_w 34.895565
    //   1394: invokestatic floatToIntBits : (F)I
    //   1397: ldc_w 2106299663
    //   1400: ixor
    //   1401: invokestatic intBitsToFloat : (I)F
    //   1404: getstatic Perryc.c : I
    //   1407: iflt -> 1421
    //   1410: ldc2_w 396309231
    //   1413: l2i
    //   1414: ldc_w -1417121596
    //   1417: ixor
    //   1418: goto -> 1429
    //   1421: ldc2_w 566464519
    //   1424: l2i
    //   1425: ldc_w 801660001
    //   1428: ixor
    //   1429: ldc2_w 138059350
    //   1432: l2i
    //   1433: ldc_w 1389119165
    //   1436: ixor
    //   1437: ixor
    //   1438: lookupswitch default -> 1464, -1968184477 -> 1421, -421422400 -> 7024
    //   1464: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1467: ldc_w 254.22098
    //   1470: invokestatic floatToIntBits : (F)I
    //   1473: ldc_w 2125657183
    //   1476: ixor
    //   1477: invokestatic intBitsToFloat : (I)F
    //   1480: getstatic Perryc.0 : I
    //   1483: ifle -> 1497
    //   1486: ldc2_w -1622788557
    //   1489: l2i
    //   1490: ldc_w 627786418
    //   1493: ixor
    //   1494: goto -> 1505
    //   1497: ldc2_w -611291846
    //   1500: l2i
    //   1501: ldc_w 2090940004
    //   1504: ixor
    //   1505: ldc2_w 1416577146
    //   1508: l2i
    //   1509: ldc_w -2040073179
    //   1512: ixor
    //   1513: ixor
    //   1514: lookupswitch default -> 1540, 1599747385 -> 1497, 1747239134 -> 7188
    //   1540: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1543: ldc_w 0.41962138
    //   1546: invokestatic floatToIntBits : (F)I
    //   1549: ldc_w 2128009373
    //   1552: ixor
    //   1553: invokestatic intBitsToFloat : (I)F
    //   1556: getstatic Perryc.1 : I
    //   1559: ifeq -> 1573
    //   1562: ldc2_w 462029264
    //   1565: l2i
    //   1566: ldc_w -1659395024
    //   1569: ixor
    //   1570: goto -> 1581
    //   1573: ldc2_w 1845803661
    //   1576: l2i
    //   1577: ldc_w 1223654860
    //   1580: ixor
    //   1581: ldc2_w -1287924859
    //   1584: l2i
    //   1585: ldc_w -1566729201
    //   1588: ixor
    //   1589: ixor
    //   1590: lookupswitch default -> 7112, -1757681046 -> 1573, 927828171 -> 1616
    //   1616: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1619: getstatic Perryc.c : I
    //   1622: iflt -> 1636
    //   1625: ldc2_w 1831929314
    //   1628: l2i
    //   1629: ldc_w -1770283268
    //   1632: ixor
    //   1633: goto -> 1644
    //   1636: ldc2_w 1935258520
    //   1639: l2i
    //   1640: ldc_w -1642097131
    //   1643: ixor
    //   1644: ldc2_w -1249597883
    //   1647: l2i
    //   1648: ldc_w -1062033853
    //   1651: ixor
    //   1652: ixor
    //   1653: lookupswitch default -> 1680, -1904436456 -> 7080, 2082542769 -> 1636
    //   1680: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1683: getstatic Perryc.c : I
    //   1686: iflt -> 1700
    //   1689: ldc2_w 460363497
    //   1692: l2i
    //   1693: ldc_w -1675670806
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w -2015376939
    //   1703: l2i
    //   1704: ldc_w -669774308
    //   1707: ixor
    //   1708: ldc2_w 195602612
    //   1711: l2i
    //   1712: ldc_w -1838518989
    //   1715: ixor
    //   1716: ixor
    //   1717: lookupswitch default -> 1744, -902117078 -> 1700, 514660740 -> 7186
    //   1744: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1747: getstatic Perryc.0 : I
    //   1750: ifle -> 1764
    //   1753: ldc2_w -1561515925
    //   1756: l2i
    //   1757: ldc_w 1110092209
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 677890095
    //   1767: l2i
    //   1768: ldc_w -814401733
    //   1771: ixor
    //   1772: ldc2_w -1467502251
    //   1775: l2i
    //   1776: ldc_w 825698340
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 1808, -327674545 -> 1764, 2037848235 -> 7136
    //   1808: putfield scale : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1811: getstatic Perryc.0 : I
    //   1814: ifle -> 1828
    //   1817: ldc2_w -16482635
    //   1820: l2i
    //   1821: ldc_w -1389672681
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w 529936476
    //   1831: l2i
    //   1832: ldc_w 1765468947
    //   1835: ixor
    //   1836: ldc2_w 41328315
    //   1839: l2i
    //   1840: ldc_w 1568701099
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 1872, -932664233 -> 1828, 232381874 -> 7172
    //   1872: aload_0
    //   1873: getstatic Perryc.1 : I
    //   1876: ifeq -> 1890
    //   1879: ldc2_w 444909226
    //   1882: l2i
    //   1883: ldc_w -667959384
    //   1886: ixor
    //   1887: goto -> 1898
    //   1890: ldc2_w -168205330
    //   1893: l2i
    //   1894: ldc_w -331254247
    //   1897: ixor
    //   1898: ldc2_w -752643251
    //   1901: l2i
    //   1902: ldc_w 1765840873
    //   1905: ixor
    //   1906: ixor
    //   1907: lookupswitch default -> 7106, -1545924269 -> 1932, 2026405286 -> 1890
    //   1932: aload_0
    //   1933: new bigname/zprestige/webhack/features/setting/Setting
    //   1936: dup
    //   1937: ldc_w '疊㌚痂㶲섒鬓๽ࠟ蹫'
    //   1940: getstatic Perryc.1 : I
    //   1943: ifeq -> 1957
    //   1946: ldc2_w 1896596912
    //   1949: l2i
    //   1950: ldc_w -1474170899
    //   1953: ixor
    //   1954: goto -> 1965
    //   1957: ldc2_w 1690080121
    //   1960: l2i
    //   1961: ldc_w 1839207350
    //   1964: ixor
    //   1965: ldc2_w 1281965716
    //   1968: l2i
    //   1969: ldc_w 731018856
    //   1972: ixor
    //   1973: ixor
    //   1974: lookupswitch default -> 2000, -1594909959 -> 1957, -1093573983 -> 7118
    //   2000: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2003: ldc_w 15.192977
    //   2006: invokestatic floatToIntBits : (F)I
    //   2009: ldc_w 2129860207
    //   2012: ixor
    //   2013: invokestatic intBitsToFloat : (I)F
    //   2016: getstatic Perryc.1 : I
    //   2019: ifeq -> 2033
    //   2022: ldc2_w 483568327
    //   2025: l2i
    //   2026: ldc_w -259586167
    //   2029: ixor
    //   2030: goto -> 2041
    //   2033: ldc2_w -1885378135
    //   2036: l2i
    //   2037: ldc_w -1543111972
    //   2040: ixor
    //   2041: ldc2_w 1189149925
    //   2044: l2i
    //   2045: ldc_w -1689223766
    //   2048: ixor
    //   2049: ixor
    //   2050: lookupswitch default -> 2076, -1138574534 -> 2033, 837102593 -> 7154
    //   2076: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2079: ldc_w 93.7881
    //   2082: invokestatic floatToIntBits : (F)I
    //   2085: ldc_w 2138529615
    //   2088: ixor
    //   2089: invokestatic intBitsToFloat : (I)F
    //   2092: getstatic Perryc.c : I
    //   2095: iflt -> 2109
    //   2098: ldc2_w -334282272
    //   2101: l2i
    //   2102: ldc_w 1754478214
    //   2105: ixor
    //   2106: goto -> 2117
    //   2109: ldc2_w 506864766
    //   2112: l2i
    //   2113: ldc_w 508381398
    //   2116: ixor
    //   2117: ldc2_w -593860468
    //   2120: l2i
    //   2121: ldc_w 557704016
    //   2124: ixor
    //   2125: ixor
    //   2126: lookupswitch default -> 7178, -35854476 -> 2152, 2032663738 -> 2109
    //   2152: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2155: ldc_w 0.42025146
    //   2158: invokestatic floatToIntBits : (F)I
    //   2161: ldc_w 2123836211
    //   2164: ixor
    //   2165: invokestatic intBitsToFloat : (I)F
    //   2168: getstatic Perryc.c : I
    //   2171: iflt -> 2185
    //   2174: ldc2_w 1752097
    //   2177: l2i
    //   2178: ldc_w -465788547
    //   2181: ixor
    //   2182: goto -> 2193
    //   2185: ldc2_w -661140028
    //   2188: l2i
    //   2189: ldc_w -28772132
    //   2192: ixor
    //   2193: ldc2_w -812344713
    //   2196: l2i
    //   2197: ldc_w -71207050
    //   2200: ixor
    //   2201: ixor
    //   2202: lookupswitch default -> 7094, -797708195 -> 2185, 311089177 -> 2228
    //   2228: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2231: getstatic Perryc.c : I
    //   2234: iflt -> 2248
    //   2237: ldc2_w 1131234325
    //   2240: l2i
    //   2241: ldc_w 741000440
    //   2244: ixor
    //   2245: goto -> 2256
    //   2248: ldc2_w 855678838
    //   2251: l2i
    //   2252: ldc_w 1714819528
    //   2255: ixor
    //   2256: ldc2_w 1669023744
    //   2259: l2i
    //   2260: ldc_w -1687555317
    //   2263: ixor
    //   2264: ixor
    //   2265: lookupswitch default -> 7066, -1756021786 -> 2248, -1390135883 -> 2292
    //   2292: aload_0
    //   2293: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   2298: getstatic Perryc.1 : I
    //   2301: ifeq -> 2315
    //   2304: ldc2_w -1132116207
    //   2307: l2i
    //   2308: ldc_w 751240505
    //   2311: ixor
    //   2312: goto -> 2323
    //   2315: ldc2_w 288680331
    //   2318: l2i
    //   2319: ldc_w -1630840214
    //   2322: ixor
    //   2323: ldc2_w 750104199
    //   2326: l2i
    //   2327: ldc_w -93626890
    //   2330: ixor
    //   2331: ixor
    //   2332: lookupswitch default -> 7194, 1184674137 -> 2315, 1495351440 -> 2360
    //   2360: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2363: getstatic Perryc.1 : I
    //   2366: ifeq -> 2380
    //   2369: ldc2_w -1852139094
    //   2372: l2i
    //   2373: ldc_w 382108026
    //   2376: ixor
    //   2377: goto -> 2388
    //   2380: ldc2_w -797078255
    //   2383: l2i
    //   2384: ldc_w -2031600300
    //   2387: ixor
    //   2388: ldc2_w 2145094361
    //   2391: l2i
    //   2392: ldc_w 209357511
    //   2395: ixor
    //   2396: ixor
    //   2397: lookupswitch default -> 7062, -184739634 -> 2380, 624210011 -> 2424
    //   2424: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2427: getstatic Perryc.0 : I
    //   2430: ifle -> 2444
    //   2433: ldc2_w 1973439099
    //   2436: l2i
    //   2437: ldc_w -1785579944
    //   2440: ixor
    //   2441: goto -> 2452
    //   2444: ldc2_w 984960165
    //   2447: l2i
    //   2448: ldc_w -317344309
    //   2451: ixor
    //   2452: ldc2_w 1186130500
    //   2455: l2i
    //   2456: ldc_w -980344188
    //   2459: ixor
    //   2460: ixor
    //   2461: lookupswitch default -> 7152, 1417884078 -> 2488, 1662104803 -> 2444
    //   2488: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2491: getstatic Perryc.1 : I
    //   2494: ifeq -> 2508
    //   2497: ldc2_w 248759414
    //   2500: l2i
    //   2501: ldc_w -914132029
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w 1345216643
    //   2511: l2i
    //   2512: ldc_w 2063980117
    //   2515: ixor
    //   2516: ldc2_w 1035702315
    //   2519: l2i
    //   2520: ldc_w 47776066
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 7114, -130930980 -> 2508, 340338623 -> 2552
    //   2552: aload_0
    //   2553: getstatic Perryc.c : I
    //   2556: iflt -> 2570
    //   2559: ldc2_w -119325515
    //   2562: l2i
    //   2563: ldc_w 1828684753
    //   2566: ixor
    //   2567: goto -> 2578
    //   2570: ldc2_w 1878346720
    //   2573: l2i
    //   2574: ldc_w 806726233
    //   2577: ixor
    //   2578: ldc2_w -1212092409
    //   2581: l2i
    //   2582: ldc_w -1990153821
    //   2585: ixor
    //   2586: ixor
    //   2587: lookupswitch default -> 2612, -1430460736 -> 7132, -860958891 -> 2570
    //   2612: aload_0
    //   2613: new bigname/zprestige/webhack/features/setting/Setting
    //   2616: dup
    //   2617: ldc_w '疔㌒病㶹섇鬕๮'
    //   2620: getstatic Perryc.1 : I
    //   2623: ifeq -> 2637
    //   2626: ldc2_w -1210755272
    //   2629: l2i
    //   2630: ldc_w 84242344
    //   2633: ixor
    //   2634: goto -> 2645
    //   2637: ldc2_w 1911058521
    //   2640: l2i
    //   2641: ldc_w 571733005
    //   2644: ixor
    //   2645: ldc2_w -279124845
    //   2648: l2i
    //   2649: ldc_w 1025375846
    //   2652: ixor
    //   2653: ixor
    //   2654: lookupswitch default -> 2680, -543342039 -> 2637, 1620124261 -> 7034
    //   2680: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2683: ldc2_w 867301016
    //   2686: l2i
    //   2687: ldc_w 867301016
    //   2690: ixor
    //   2691: getstatic Perryc.1 : I
    //   2694: ifeq -> 2708
    //   2697: ldc2_w -23028156
    //   2700: l2i
    //   2701: ldc_w 1807619626
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w -1640267555
    //   2711: l2i
    //   2712: ldc_w 423564933
    //   2715: ixor
    //   2716: ldc2_w -735400555
    //   2719: l2i
    //   2720: ldc_w 562335528
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 7146, 1622190803 -> 2708, 1923790053 -> 2752
    //   2752: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2755: getstatic Perryc.1 : I
    //   2758: ifeq -> 2772
    //   2761: ldc2_w -854555024
    //   2764: l2i
    //   2765: ldc_w -30299754
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w 105132405
    //   2775: l2i
    //   2776: ldc_w -1476135932
    //   2779: ixor
    //   2780: ldc2_w 755153743
    //   2783: l2i
    //   2784: ldc_w -878491618
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 2816, -712975177 -> 7160, -301724791 -> 2772
    //   2816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2819: getstatic Perryc.1 : I
    //   2822: ifeq -> 2836
    //   2825: ldc2_w 1172713519
    //   2828: l2i
    //   2829: ldc_w 340648687
    //   2832: ixor
    //   2833: goto -> 2844
    //   2836: ldc2_w 86132047
    //   2839: l2i
    //   2840: ldc_w 417470393
    //   2843: ixor
    //   2844: ldc2_w -425734081
    //   2847: l2i
    //   2848: ldc_w 941104009
    //   2851: ixor
    //   2852: ixor
    //   2853: lookupswitch default -> 7048, -1892935306 -> 2836, -1018717888 -> 2880
    //   2880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2883: getstatic Perryc.1 : I
    //   2886: ifeq -> 2900
    //   2889: ldc2_w 798173610
    //   2892: l2i
    //   2893: ldc_w -1125612986
    //   2896: ixor
    //   2897: goto -> 2908
    //   2900: ldc2_w 104582487
    //   2903: l2i
    //   2904: ldc_w 280275970
    //   2907: ixor
    //   2908: ldc2_w -106505525
    //   2911: l2i
    //   2912: ldc_w -1265053592
    //   2915: ixor
    //   2916: ixor
    //   2917: lookupswitch default -> 7044, -565862065 -> 2900, 1538354166 -> 2944
    //   2944: putfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2947: getstatic Perryc.1 : I
    //   2950: ifeq -> 2964
    //   2953: ldc2_w 332132907
    //   2956: l2i
    //   2957: ldc_w -732097950
    //   2960: ixor
    //   2961: goto -> 2972
    //   2964: ldc2_w 1706439598
    //   2967: l2i
    //   2968: ldc_w 1607455507
    //   2971: ixor
    //   2972: ldc2_w -1367267744
    //   2975: l2i
    //   2976: ldc_w 1751648083
    //   2979: ixor
    //   2980: ixor
    //   2981: lookupswitch default -> 3008, 25149818 -> 7052, 876549298 -> 2964
    //   3008: aload_0
    //   3009: getstatic Perryc.c : I
    //   3012: iflt -> 3026
    //   3015: ldc2_w -2145912721
    //   3018: l2i
    //   3019: ldc_w 1861854129
    //   3022: ixor
    //   3023: goto -> 3034
    //   3026: ldc2_w -2099747788
    //   3029: l2i
    //   3030: ldc_w -588052670
    //   3033: ixor
    //   3034: ldc2_w -830636199
    //   3037: l2i
    //   3038: ldc_w -301477776
    //   3041: ixor
    //   3042: ixor
    //   3043: lookupswitch default -> 7130, -829098761 -> 3026, 2119289951 -> 3068
    //   3068: aload_0
    //   3069: new bigname/zprestige/webhack/features/setting/Setting
    //   3072: dup
    //   3073: ldc_w '疕㌒痘㶢섗鬛๭ࠂ蹬鷵'
    //   3076: getstatic Perryc.0 : I
    //   3079: ifle -> 3093
    //   3082: ldc2_w 1887970608
    //   3085: l2i
    //   3086: ldc_w -1413464412
    //   3089: ixor
    //   3090: goto -> 3101
    //   3093: ldc2_w 1150352351
    //   3096: l2i
    //   3097: ldc_w 1267102550
    //   3100: ixor
    //   3101: ldc2_w 1026663480
    //   3104: l2i
    //   3105: ldc_w 581053395
    //   3108: ixor
    //   3109: ixor
    //   3110: lookupswitch default -> 3136, -992242561 -> 7140, 1255285080 -> 3093
    //   3136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3139: ldc2_w -365591166
    //   3142: l2i
    //   3143: ldc_w -365591120
    //   3146: ixor
    //   3147: getstatic Perryc.1 : I
    //   3150: ifeq -> 3164
    //   3153: ldc2_w -188333779
    //   3156: l2i
    //   3157: ldc_w 575738410
    //   3160: ixor
    //   3161: goto -> 3172
    //   3164: ldc2_w 1648003612
    //   3167: l2i
    //   3168: ldc_w 163732724
    //   3171: ixor
    //   3172: ldc2_w 1665295697
    //   3175: l2i
    //   3176: ldc_w -1153366634
    //   3179: ixor
    //   3180: ixor
    //   3181: lookupswitch default -> 3208, -465350246 -> 3164, 244593600 -> 7124
    //   3208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3211: ldc2_w 142554023
    //   3214: l2i
    //   3215: ldc_w 142554023
    //   3218: ixor
    //   3219: getstatic Perryc.1 : I
    //   3222: ifeq -> 3236
    //   3225: ldc2_w 1228148387
    //   3228: l2i
    //   3229: ldc_w 1138735733
    //   3232: ixor
    //   3233: goto -> 3244
    //   3236: ldc2_w 1837754956
    //   3239: l2i
    //   3240: ldc_w -378681452
    //   3243: ixor
    //   3244: ldc2_w 163206004
    //   3247: l2i
    //   3248: ldc_w 35342168
    //   3251: ixor
    //   3252: ixor
    //   3253: lookupswitch default -> 7038, -1891288588 -> 3280, 21668090 -> 3236
    //   3280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3283: ldc2_w -160245537
    //   3286: l2i
    //   3287: ldc_w -160245573
    //   3290: ixor
    //   3291: getstatic Perryc.1 : I
    //   3294: ifeq -> 3308
    //   3297: ldc2_w 651541336
    //   3300: l2i
    //   3301: ldc_w -512668275
    //   3304: ixor
    //   3305: goto -> 3316
    //   3308: ldc2_w 337969128
    //   3311: l2i
    //   3312: ldc_w -1578686147
    //   3315: ixor
    //   3316: ldc2_w -1433253051
    //   3319: l2i
    //   3320: ldc_w -1100304737
    //   3323: ixor
    //   3324: ixor
    //   3325: lookupswitch default -> 3352, -748940529 -> 7156, 205269713 -> 3308
    //   3352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3355: getstatic Perryc.c : I
    //   3358: iflt -> 3372
    //   3361: ldc2_w 437350285
    //   3364: l2i
    //   3365: ldc_w -1258583046
    //   3368: ixor
    //   3369: goto -> 3380
    //   3372: ldc2_w -484919200
    //   3375: l2i
    //   3376: ldc_w 1019888015
    //   3379: ixor
    //   3380: ldc2_w -1324279165
    //   3383: l2i
    //   3384: ldc_w -424751010
    //   3387: ixor
    //   3388: ixor
    //   3389: lookupswitch default -> 3416, -111858006 -> 7168, 356022762 -> 3372
    //   3416: aload_0
    //   3417: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   3422: getstatic Perryc.0 : I
    //   3425: ifle -> 3439
    //   3428: ldc2_w -359386831
    //   3431: l2i
    //   3432: ldc_w -1878165490
    //   3435: ixor
    //   3436: goto -> 3447
    //   3439: ldc2_w 850371099
    //   3442: l2i
    //   3443: ldc_w 352274325
    //   3446: ixor
    //   3447: ldc2_w 1775266834
    //   3450: l2i
    //   3451: ldc_w -96801698
    //   3454: ixor
    //   3455: ixor
    //   3456: lookupswitch default -> 7174, -1246075454 -> 3484, -378287757 -> 3439
    //   3484: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3487: getstatic Perryc.1 : I
    //   3490: ifeq -> 3504
    //   3493: ldc2_w -253430965
    //   3496: l2i
    //   3497: ldc_w 1675709509
    //   3500: ixor
    //   3501: goto -> 3512
    //   3504: ldc2_w -340883614
    //   3507: l2i
    //   3508: ldc_w -134412067
    //   3511: ixor
    //   3512: ldc2_w 1317198047
    //   3515: l2i
    //   3516: ldc_w 1251940926
    //   3519: ixor
    //   3520: ixor
    //   3521: lookupswitch default -> 3548, -1760002577 -> 7102, 2055408210 -> 3504
    //   3548: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3551: getstatic Perryc.0 : I
    //   3554: ifle -> 3568
    //   3557: ldc2_w -1826990548
    //   3560: l2i
    //   3561: ldc_w 741358814
    //   3564: ixor
    //   3565: goto -> 3576
    //   3568: ldc2_w 1138273306
    //   3571: l2i
    //   3572: ldc_w -1565542395
    //   3575: ixor
    //   3576: ldc2_w 869970065
    //   3579: l2i
    //   3580: ldc_w -1885230857
    //   3583: ixor
    //   3584: ixor
    //   3585: lookupswitch default -> 7216, 55669396 -> 3568, 1561070713 -> 3612
    //   3612: putfield saturation : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3615: getstatic Perryc.0 : I
    //   3618: ifle -> 3632
    //   3621: ldc2_w 1070993207
    //   3624: l2i
    //   3625: ldc_w 1998554471
    //   3628: ixor
    //   3629: goto -> 3640
    //   3632: ldc2_w 1896342495
    //   3635: l2i
    //   3636: ldc_w -1509917410
    //   3639: ixor
    //   3640: ldc2_w -773257239
    //   3643: l2i
    //   3644: ldc_w -906758925
    //   3647: ixor
    //   3648: ixor
    //   3649: lookupswitch default -> 7020, -820154917 -> 3676, 1356036426 -> 3632
    //   3676: aload_0
    //   3677: getstatic Perryc.c : I
    //   3680: iflt -> 3694
    //   3683: ldc2_w 1650065012
    //   3686: l2i
    //   3687: ldc_w 374019765
    //   3690: ixor
    //   3691: goto -> 3702
    //   3694: ldc2_w 416116701
    //   3697: l2i
    //   3698: ldc_w 2120693398
    //   3701: ixor
    //   3702: ldc2_w -654879347
    //   3705: l2i
    //   3706: ldc_w -1781796762
    //   3709: ixor
    //   3710: ixor
    //   3711: lookupswitch default -> 7120, 731315360 -> 3736, 959335722 -> 3694
    //   3736: aload_0
    //   3737: new bigname/zprestige/webhack/features/setting/Setting
    //   3740: dup
    //   3741: ldc_w '疕㌃痉㶲섁'
    //   3744: getstatic Perryc.0 : I
    //   3747: ifle -> 3761
    //   3750: ldc2_w 1695305232
    //   3753: l2i
    //   3754: ldc_w -750647438
    //   3757: ixor
    //   3758: goto -> 3769
    //   3761: ldc2_w 911772705
    //   3764: l2i
    //   3765: ldc_w 1947578637
    //   3768: ixor
    //   3769: ldc2_w 1795095674
    //   3772: l2i
    //   3773: ldc_w -1930954693
    //   3776: ixor
    //   3777: ixor
    //   3778: lookupswitch default -> 3804, -456573982 -> 3761, 1347898659 -> 7072
    //   3804: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3807: ldc2_w -1104517961
    //   3810: l2i
    //   3811: ldc_w -1104517985
    //   3814: ixor
    //   3815: getstatic Perryc.1 : I
    //   3818: ifeq -> 3832
    //   3821: ldc2_w 857227083
    //   3824: l2i
    //   3825: ldc_w 1486880646
    //   3828: ixor
    //   3829: goto -> 3840
    //   3832: ldc2_w 1776230953
    //   3835: l2i
    //   3836: ldc_w -1197684774
    //   3839: ixor
    //   3840: ldc2_w -920971753
    //   3843: l2i
    //   3844: ldc_w 243781335
    //   3847: ixor
    //   3848: ixor
    //   3849: lookupswitch default -> 7084, -1407510515 -> 3832, 383728947 -> 3876
    //   3876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3879: ldc2_w -569779199
    //   3882: l2i
    //   3883: ldc_w -569779200
    //   3886: ixor
    //   3887: getstatic Perryc.0 : I
    //   3890: ifle -> 3904
    //   3893: ldc2_w -778162770
    //   3896: l2i
    //   3897: ldc_w -1444507756
    //   3900: ixor
    //   3901: goto -> 3912
    //   3904: ldc2_w -1589352441
    //   3907: l2i
    //   3908: ldc_w -1377167200
    //   3911: ixor
    //   3912: ldc2_w 1576689694
    //   3915: l2i
    //   3916: ldc_w 1342484192
    //   3919: ixor
    //   3920: ixor
    //   3921: lookupswitch default -> 3948, 208825797 -> 3904, 1971743940 -> 7108
    //   3948: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3951: ldc2_w 1415020941
    //   3954: l2i
    //   3955: ldc_w 1415021033
    //   3958: ixor
    //   3959: getstatic Perryc.0 : I
    //   3962: ifle -> 3976
    //   3965: ldc2_w -165080339
    //   3968: l2i
    //   3969: ldc_w 1589281950
    //   3972: ixor
    //   3973: goto -> 3984
    //   3976: ldc2_w -1108308606
    //   3979: l2i
    //   3980: ldc_w -222861871
    //   3983: ixor
    //   3984: ldc2_w 568275523
    //   3987: l2i
    //   3988: ldc_w 1910036678
    //   3991: ixor
    //   3992: ixor
    //   3993: lookupswitch default -> 7110, -124486410 -> 3976, 524288726 -> 4020
    //   4020: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4023: getstatic Perryc.1 : I
    //   4026: ifeq -> 4040
    //   4029: ldc2_w -503510715
    //   4032: l2i
    //   4033: ldc_w 474356591
    //   4036: ixor
    //   4037: goto -> 4048
    //   4040: ldc2_w -739942963
    //   4043: l2i
    //   4044: ldc_w 2077914513
    //   4047: ixor
    //   4048: ldc2_w 2017985072
    //   4051: l2i
    //   4052: ldc_w 140647128
    //   4055: ixor
    //   4056: ixor
    //   4057: lookupswitch default -> 7014, -1919874366 -> 4040, -669699916 -> 4084
    //   4084: aload_0
    //   4085: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   4090: getstatic Perryc.0 : I
    //   4093: ifle -> 4107
    //   4096: ldc2_w 289383308
    //   4099: l2i
    //   4100: ldc_w -1990511000
    //   4103: ixor
    //   4104: goto -> 4115
    //   4107: ldc2_w -809927103
    //   4110: l2i
    //   4111: ldc_w 1997226978
    //   4114: ixor
    //   4115: ldc2_w 861247907
    //   4118: l2i
    //   4119: ldc_w -33255018
    //   4122: ixor
    //   4123: ixor
    //   4124: lookupswitch default -> 4152, -566384999 -> 4107, 1429577169 -> 7190
    //   4152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4155: getstatic Perryc.0 : I
    //   4158: ifle -> 4172
    //   4161: ldc2_w 1504078562
    //   4164: l2i
    //   4165: ldc_w 355150863
    //   4168: ixor
    //   4169: goto -> 4180
    //   4172: ldc2_w 1246506661
    //   4175: l2i
    //   4176: ldc_w -1529342163
    //   4179: ixor
    //   4180: ldc2_w -1406861563
    //   4183: l2i
    //   4184: ldc_w 1075999526
    //   4187: ixor
    //   4188: ixor
    //   4189: lookupswitch default -> 7210, -1601451314 -> 4172, 43169195 -> 4216
    //   4216: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4219: getstatic Perryc.c : I
    //   4222: iflt -> 4236
    //   4225: ldc2_w -936835513
    //   4228: l2i
    //   4229: ldc_w 756621727
    //   4232: ixor
    //   4233: goto -> 4244
    //   4236: ldc2_w -567250516
    //   4239: l2i
    //   4240: ldc_w -134905702
    //   4243: ixor
    //   4244: ldc2_w -2050512666
    //   4247: l2i
    //   4248: ldc_w -1945132533
    //   4251: ixor
    //   4252: ixor
    //   4253: lookupswitch default -> 7054, -319279819 -> 4236, 537787355 -> 4280
    //   4280: putfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4283: getstatic Perryc.0 : I
    //   4286: ifle -> 4300
    //   4289: ldc2_w 629853294
    //   4292: l2i
    //   4293: ldc_w 251038003
    //   4296: ixor
    //   4297: goto -> 4308
    //   4300: ldc2_w 683733642
    //   4303: l2i
    //   4304: ldc_w -1354038515
    //   4307: ixor
    //   4308: ldc2_w -1753874188
    //   4311: l2i
    //   4312: ldc_w 522166452
    //   4315: ixor
    //   4316: ixor
    //   4317: lookupswitch default -> 7022, -1558846179 -> 4300, 266490311 -> 4344
    //   4344: aload_0
    //   4345: getstatic Perryc.0 : I
    //   4348: ifle -> 4362
    //   4351: ldc2_w -1652962554
    //   4354: l2i
    //   4355: ldc_w -562218505
    //   4358: ixor
    //   4359: goto -> 4370
    //   4362: ldc2_w 974242821
    //   4365: l2i
    //   4366: ldc_w 908310115
    //   4369: ixor
    //   4370: ldc2_w 885001656
    //   4373: l2i
    //   4374: ldc_w 1758965337
    //   4377: ixor
    //   4378: ixor
    //   4379: lookupswitch default -> 4404, -1445785066 -> 4362, 521359632 -> 7088
    //   4404: aload_0
    //   4405: new bigname/zprestige/webhack/features/setting/Setting
    //   4408: dup
    //   4409: ldc_w '疔㌖痈'
    //   4412: getstatic Perryc.0 : I
    //   4415: ifle -> 4429
    //   4418: ldc2_w -1562571554
    //   4421: l2i
    //   4422: ldc_w -1145016909
    //   4425: ixor
    //   4426: goto -> 4437
    //   4429: ldc2_w 1120547074
    //   4432: l2i
    //   4433: ldc_w -1134797200
    //   4436: ixor
    //   4437: ldc2_w 1087176768
    //   4440: l2i
    //   4441: ldc_w 2038081
    //   4444: ixor
    //   4445: ixor
    //   4446: lookupswitch default -> 4472, -759922967 -> 4429, 1506769004 -> 7214
    //   4472: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4475: ldc2_w 1042718095
    //   4478: l2i
    //   4479: ldc_w 1042718095
    //   4482: ixor
    //   4483: getstatic Perryc.1 : I
    //   4486: ifeq -> 4500
    //   4489: ldc2_w 1004524349
    //   4492: l2i
    //   4493: ldc_w -1096153955
    //   4496: ixor
    //   4497: goto -> 4508
    //   4500: ldc2_w 547304414
    //   4503: l2i
    //   4504: ldc_w -1007275423
    //   4507: ixor
    //   4508: ldc2_w -1406045920
    //   4511: l2i
    //   4512: ldc_w 1383325362
    //   4515: ixor
    //   4516: ixor
    //   4517: lookupswitch default -> 4544, -1765480454 -> 4500, 2067232818 -> 7204
    //   4544: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4547: ldc2_w 88236511
    //   4550: l2i
    //   4551: ldc_w 88236511
    //   4554: ixor
    //   4555: getstatic Perryc.0 : I
    //   4558: ifle -> 4572
    //   4561: ldc2_w 1965663804
    //   4564: l2i
    //   4565: ldc_w -2136748918
    //   4568: ixor
    //   4569: goto -> 4580
    //   4572: ldc2_w 818753555
    //   4575: l2i
    //   4576: ldc_w 1996015750
    //   4579: ixor
    //   4580: ldc2_w 1568111439
    //   4583: l2i
    //   4584: ldc_w -2004179937
    //   4587: ixor
    //   4588: ixor
    //   4589: lookupswitch default -> 7056, -1815599163 -> 4616, 544716262 -> 4572
    //   4616: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4619: ldc2_w 16723745
    //   4622: l2i
    //   4623: ldc_w 16723934
    //   4626: ixor
    //   4627: getstatic Perryc.c : I
    //   4630: iflt -> 4644
    //   4633: ldc2_w 785516901
    //   4636: l2i
    //   4637: ldc_w 463863373
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w -564595657
    //   4647: l2i
    //   4648: ldc_w -1865408937
    //   4651: ixor
    //   4652: ldc2_w -1905784659
    //   4655: l2i
    //   4656: ldc_w -1291009882
    //   4659: ixor
    //   4660: ixor
    //   4661: lookupswitch default -> 4688, 135479075 -> 7058, 1370402777 -> 4644
    //   4688: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4691: getstatic Perryc.0 : I
    //   4694: ifle -> 4708
    //   4697: ldc2_w 7924773
    //   4700: l2i
    //   4701: ldc_w 1630821601
    //   4704: ixor
    //   4705: goto -> 4716
    //   4708: ldc2_w -2129030904
    //   4711: l2i
    //   4712: ldc_w -1113280265
    //   4715: ixor
    //   4716: ldc2_w 410767125
    //   4719: l2i
    //   4720: ldc_w 2027834472
    //   4723: ixor
    //   4724: ixor
    //   4725: lookupswitch default -> 4752, -1882752071 -> 4708, 32060345 -> 7192
    //   4752: aload_0
    //   4753: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   4758: getstatic Perryc.1 : I
    //   4761: ifeq -> 4775
    //   4764: ldc2_w -1551929075
    //   4767: l2i
    //   4768: ldc_w -1734424066
    //   4771: ixor
    //   4772: goto -> 4783
    //   4775: ldc2_w -650180407
    //   4778: l2i
    //   4779: ldc_w -1785690364
    //   4782: ixor
    //   4783: ldc2_w -716744373
    //   4786: l2i
    //   4787: ldc_w 2072052037
    //   4790: ixor
    //   4791: ixor
    //   4792: lookupswitch default -> 4820, -1987675069 -> 4775, -1792548611 -> 7128
    //   4820: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4823: getstatic Perryc.0 : I
    //   4826: ifle -> 4840
    //   4829: ldc2_w -1324866294
    //   4832: l2i
    //   4833: ldc_w -1772070988
    //   4836: ixor
    //   4837: goto -> 4848
    //   4840: ldc2_w -925823268
    //   4843: l2i
    //   4844: ldc_w 278795323
    //   4847: ixor
    //   4848: ldc2_w -25275952
    //   4851: l2i
    //   4852: ldc_w 2137333400
    //   4855: ixor
    //   4856: ixor
    //   4857: lookupswitch default -> 4884, -1978786089 -> 4840, -1502396938 -> 7184
    //   4884: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4887: getstatic Perryc.1 : I
    //   4890: ifeq -> 4904
    //   4893: ldc2_w 1884213150
    //   4896: l2i
    //   4897: ldc_w -1096591922
    //   4900: ixor
    //   4901: goto -> 4912
    //   4904: ldc2_w -785201712
    //   4907: l2i
    //   4908: ldc_w 1855218853
    //   4911: ixor
    //   4912: ldc2_w 498341372
    //   4915: l2i
    //   4916: ldc_w 929624239
    //   4919: ixor
    //   4920: ixor
    //   4921: lookupswitch default -> 4948, -466518269 -> 7164, -357138930 -> 4904
    //   4948: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4951: getstatic Perryc.0 : I
    //   4954: ifle -> 4968
    //   4957: ldc2_w 1678383915
    //   4960: l2i
    //   4961: ldc_w -76144686
    //   4964: ixor
    //   4965: goto -> 4976
    //   4968: ldc2_w -898516211
    //   4971: l2i
    //   4972: ldc_w -1096188500
    //   4975: ixor
    //   4976: ldc2_w -1219817258
    //   4979: l2i
    //   4980: ldc_w -1369091461
    //   4983: ixor
    //   4984: ixor
    //   4985: lookupswitch default -> 7068, -2041428396 -> 4968, 1844872204 -> 5012
    //   5012: aload_0
    //   5013: getstatic Perryc.0 : I
    //   5016: ifle -> 5030
    //   5019: ldc2_w -780339806
    //   5022: l2i
    //   5023: ldc_w 335162598
    //   5026: ixor
    //   5027: goto -> 5038
    //   5030: ldc2_w -1130708414
    //   5033: l2i
    //   5034: ldc_w 1913438069
    //   5037: ixor
    //   5038: ldc2_w 71911920
    //   5041: l2i
    //   5042: ldc_w -1185934608
    //   5045: ixor
    //   5046: ixor
    //   5047: lookupswitch default -> 5072, 642351679 -> 5030, 2141160004 -> 7122
    //   5072: aload_0
    //   5073: new bigname/zprestige/webhack/features/setting/Setting
    //   5076: dup
    //   5077: ldc_w '疁㌁痉㶲섋'
    //   5080: getstatic Perryc.0 : I
    //   5083: ifle -> 5097
    //   5086: ldc2_w 126371275
    //   5089: l2i
    //   5090: ldc_w 1581251685
    //   5093: ixor
    //   5094: goto -> 5105
    //   5097: ldc2_w 1209181250
    //   5100: l2i
    //   5101: ldc_w 2144768189
    //   5104: ixor
    //   5105: ldc2_w 1800774215
    //   5108: l2i
    //   5109: ldc_w -1744633289
    //   5112: ixor
    //   5113: ixor
    //   5114: lookupswitch default -> 5140, -1807570011 -> 5097, -1428088354 -> 7100
    //   5140: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5143: ldc2_w 657454043
    //   5146: l2i
    //   5147: ldc_w 657453860
    //   5150: ixor
    //   5151: getstatic Perryc.0 : I
    //   5154: ifle -> 5168
    //   5157: ldc2_w 1977648467
    //   5160: l2i
    //   5161: ldc_w 1176456593
    //   5164: ixor
    //   5165: goto -> 5176
    //   5168: ldc2_w 250290522
    //   5171: l2i
    //   5172: ldc_w 1023896622
    //   5175: ixor
    //   5176: ldc2_w -1322780441
    //   5179: l2i
    //   5180: ldc_w -1678511778
    //   5183: ixor
    //   5184: ixor
    //   5185: lookupswitch default -> 7206, 422297979 -> 5168, 423118029 -> 5212
    //   5212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5215: ldc2_w 226428645
    //   5218: l2i
    //   5219: ldc_w 226428645
    //   5222: ixor
    //   5223: getstatic Perryc.c : I
    //   5226: iflt -> 5240
    //   5229: ldc2_w 567364907
    //   5232: l2i
    //   5233: ldc_w 280379111
    //   5236: ixor
    //   5237: goto -> 5248
    //   5240: ldc2_w 1159768613
    //   5243: l2i
    //   5244: ldc_w 572421589
    //   5247: ixor
    //   5248: ldc2_w -246203860
    //   5251: l2i
    //   5252: ldc_w -1577858400
    //   5255: ixor
    //   5256: ixor
    //   5257: lookupswitch default -> 5284, -1345386873 -> 5240, 1640465216 -> 7096
    //   5284: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5287: ldc2_w 1693257210
    //   5290: l2i
    //   5291: ldc_w 1693256965
    //   5294: ixor
    //   5295: getstatic Perryc.c : I
    //   5298: iflt -> 5312
    //   5301: ldc2_w -1831859241
    //   5304: l2i
    //   5305: ldc_w -20204975
    //   5308: ixor
    //   5309: goto -> 5320
    //   5312: ldc2_w -18179670
    //   5315: l2i
    //   5316: ldc_w -627840427
    //   5319: ixor
    //   5320: ldc2_w 880483294
    //   5323: l2i
    //   5324: ldc_w 1282663115
    //   5327: ixor
    //   5328: ixor
    //   5329: lookupswitch default -> 5356, -1248639618 -> 5312, 336806035 -> 7150
    //   5356: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5359: getstatic Perryc.1 : I
    //   5362: ifeq -> 5376
    //   5365: ldc2_w 1780311851
    //   5368: l2i
    //   5369: ldc_w -920947365
    //   5372: ixor
    //   5373: goto -> 5384
    //   5376: ldc2_w 866833260
    //   5379: l2i
    //   5380: ldc_w 175928223
    //   5383: ixor
    //   5384: ldc2_w 291650756
    //   5387: l2i
    //   5388: ldc_w -1305270948
    //   5391: ixor
    //   5392: ixor
    //   5393: lookupswitch default -> 7200, -1702381205 -> 5420, 5704680 -> 5376
    //   5420: aload_0
    //   5421: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   5426: getstatic Perryc.c : I
    //   5429: iflt -> 5443
    //   5432: ldc2_w -1179273019
    //   5435: l2i
    //   5436: ldc_w 197538480
    //   5439: ixor
    //   5440: goto -> 5451
    //   5443: ldc2_w -500347875
    //   5446: l2i
    //   5447: ldc_w 543959090
    //   5450: ixor
    //   5451: ldc2_w 746218433
    //   5454: l2i
    //   5455: ldc_w -1038194926
    //   5458: ixor
    //   5459: ixor
    //   5460: lookupswitch default -> 5488, -75370620 -> 5443, 1545047718 -> 7016
    //   5488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5491: getstatic Perryc.0 : I
    //   5494: ifle -> 5508
    //   5497: ldc2_w 263557117
    //   5500: l2i
    //   5501: ldc_w -200592608
    //   5504: ixor
    //   5505: goto -> 5516
    //   5508: ldc2_w -488599632
    //   5511: l2i
    //   5512: ldc_w -658918996
    //   5515: ixor
    //   5516: ldc2_w -908107137
    //   5519: l2i
    //   5520: ldc_w -1114689594
    //   5523: ixor
    //   5524: ixor
    //   5525: lookupswitch default -> 7070, -1880166044 -> 5508, 1309242277 -> 5552
    //   5552: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5555: getstatic Perryc.1 : I
    //   5558: ifeq -> 5572
    //   5561: ldc2_w -1982732022
    //   5564: l2i
    //   5565: ldc_w 444389845
    //   5568: ixor
    //   5569: goto -> 5580
    //   5572: ldc2_w -1630986349
    //   5575: l2i
    //   5576: ldc_w -254140562
    //   5579: ixor
    //   5580: ldc2_w -895800847
    //   5583: l2i
    //   5584: ldc_w 941128221
    //   5587: ixor
    //   5588: ixor
    //   5589: lookupswitch default -> 7060, -1668263151 -> 5616, 1630430003 -> 5572
    //   5616: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5619: getstatic Perryc.0 : I
    //   5622: ifle -> 5636
    //   5625: ldc2_w -1739067047
    //   5628: l2i
    //   5629: ldc_w 1537712178
    //   5632: ixor
    //   5633: goto -> 5644
    //   5636: ldc2_w 1921369503
    //   5639: l2i
    //   5640: ldc_w 174163795
    //   5643: ixor
    //   5644: ldc2_w 1860884116
    //   5647: l2i
    //   5648: ldc_w 1010337436
    //   5651: ixor
    //   5652: ixor
    //   5653: lookupswitch default -> 7162, -1860042397 -> 5636, 708186820 -> 5680
    //   5680: aload_0
    //   5681: getstatic Perryc.0 : I
    //   5684: ifle -> 5698
    //   5687: ldc2_w 689800217
    //   5690: l2i
    //   5691: ldc_w 213785607
    //   5694: ixor
    //   5695: goto -> 5706
    //   5698: ldc2_w -1113826417
    //   5701: l2i
    //   5702: ldc_w -1896147923
    //   5705: ixor
    //   5706: ldc2_w -340741270
    //   5709: l2i
    //   5710: ldc_w 2028812715
    //   5713: ixor
    //   5714: ixor
    //   5715: lookupswitch default -> 5740, -1224863009 -> 7018, -216172043 -> 5698
    //   5740: aload_0
    //   5741: new bigname/zprestige/webhack/features/setting/Setting
    //   5744: dup
    //   5745: ldc_w '疄㌟痙㶲'
    //   5748: getstatic Perryc.0 : I
    //   5751: ifle -> 5765
    //   5754: ldc2_w 354570094
    //   5757: l2i
    //   5758: ldc_w 845282206
    //   5761: ixor
    //   5762: goto -> 5773
    //   5765: ldc2_w -1452903057
    //   5768: l2i
    //   5769: ldc_w 891166239
    //   5772: ixor
    //   5773: ldc2_w 1712825237
    //   5776: l2i
    //   5777: ldc_w 1004675583
    //   5780: ixor
    //   5781: ixor
    //   5782: lookupswitch default -> 7074, -1047664358 -> 5808, 2058761882 -> 5765
    //   5808: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5811: ldc2_w 1179918082
    //   5814: l2i
    //   5815: ldc_w 1179918082
    //   5818: ixor
    //   5819: getstatic Perryc.c : I
    //   5822: iflt -> 5836
    //   5825: ldc2_w 210280223
    //   5828: l2i
    //   5829: ldc_w -1885541645
    //   5832: ixor
    //   5833: goto -> 5844
    //   5836: ldc2_w 852503570
    //   5839: l2i
    //   5840: ldc_w 101145477
    //   5843: ixor
    //   5844: ldc2_w 1061527328
    //   5847: l2i
    //   5848: ldc_w 1277756423
    //   5851: ixor
    //   5852: ixor
    //   5853: lookupswitch default -> 5880, -370484224 -> 5836, -260510005 -> 7104
    //   5880: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5883: ldc2_w -1496829492
    //   5886: l2i
    //   5887: ldc_w -1496829492
    //   5890: ixor
    //   5891: getstatic Perryc.c : I
    //   5894: iflt -> 5908
    //   5897: ldc2_w 1651120791
    //   5900: l2i
    //   5901: ldc_w 685773173
    //   5904: ixor
    //   5905: goto -> 5916
    //   5908: ldc2_w -1125479296
    //   5911: l2i
    //   5912: ldc_w 919967475
    //   5915: ixor
    //   5916: ldc2_w -1395101797
    //   5919: l2i
    //   5920: ldc_w 594478291
    //   5923: ixor
    //   5924: ixor
    //   5925: lookupswitch default -> 5952, -1829892012 -> 5908, -985833302 -> 7142
    //   5952: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5955: ldc2_w -1870058895
    //   5958: l2i
    //   5959: ldc_w -1870058866
    //   5962: ixor
    //   5963: getstatic Perryc.c : I
    //   5966: iflt -> 5980
    //   5969: ldc2_w 346257298
    //   5972: l2i
    //   5973: ldc_w 606273967
    //   5976: ixor
    //   5977: goto -> 5988
    //   5980: ldc2_w -2776523
    //   5983: l2i
    //   5984: ldc_w -461069134
    //   5987: ixor
    //   5988: ldc2_w 1261292956
    //   5991: l2i
    //   5992: ldc_w -643882479
    //   5995: ixor
    //   5996: ixor
    //   5997: lookupswitch default -> 7082, -1981552374 -> 6024, -1573742160 -> 5980
    //   6024: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6027: getstatic Perryc.0 : I
    //   6030: ifle -> 6044
    //   6033: ldc2_w 360098175
    //   6036: l2i
    //   6037: ldc_w -1519170709
    //   6040: ixor
    //   6041: goto -> 6052
    //   6044: ldc2_w 2068091567
    //   6047: l2i
    //   6048: ldc_w -697670584
    //   6051: ixor
    //   6052: ldc2_w 1674201068
    //   6055: l2i
    //   6056: ldc_w -576704088
    //   6059: ixor
    //   6060: ixor
    //   6061: lookupswitch default -> 7144, 242193488 -> 6044, 323256483 -> 6088
    //   6088: aload_0
    //   6089: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;)Ljava/util/function/Predicate;
    //   6094: getstatic Perryc.c : I
    //   6097: iflt -> 6111
    //   6100: ldc2_w 1137852611
    //   6103: l2i
    //   6104: ldc_w 1631624644
    //   6107: ixor
    //   6108: goto -> 6119
    //   6111: ldc2_w -545764538
    //   6114: l2i
    //   6115: ldc_w -1585091374
    //   6118: ixor
    //   6119: ldc2_w -1277156157
    //   6122: l2i
    //   6123: ldc_w -2009309805
    //   6126: ixor
    //   6127: ixor
    //   6128: lookupswitch default -> 7098, 424584279 -> 6111, 1159814852 -> 6156
    //   6156: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6159: getstatic Perryc.1 : I
    //   6162: ifeq -> 6176
    //   6165: ldc2_w 1409007838
    //   6168: l2i
    //   6169: ldc_w 1064058578
    //   6172: ixor
    //   6173: goto -> 6184
    //   6176: ldc2_w 1314758508
    //   6179: l2i
    //   6180: ldc_w -332868411
    //   6183: ixor
    //   6184: ldc2_w -1122249522
    //   6187: l2i
    //   6188: ldc_w -1810453867
    //   6191: ixor
    //   6192: ixor
    //   6193: lookupswitch default -> 7166, -1955056142 -> 6220, 1167753303 -> 6176
    //   6220: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6223: getstatic Perryc.0 : I
    //   6226: ifle -> 6240
    //   6229: ldc2_w -1271158583
    //   6232: l2i
    //   6233: ldc_w 313974254
    //   6236: ixor
    //   6237: goto -> 6248
    //   6240: ldc2_w 350369316
    //   6243: l2i
    //   6244: ldc_w 1834870252
    //   6247: ixor
    //   6248: ldc2_w -652703186
    //   6251: l2i
    //   6252: ldc_w 1936581350
    //   6255: ixor
    //   6256: ixor
    //   6257: lookupswitch default -> 6284, 217587183 -> 7032, 1663722725 -> 6240
    //   6284: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6287: getstatic Perryc.1 : I
    //   6290: ifeq -> 6304
    //   6293: ldc2_w -68677178
    //   6296: l2i
    //   6297: ldc_w 1902394195
    //   6300: ixor
    //   6301: goto -> 6312
    //   6304: ldc2_w -1177846006
    //   6307: l2i
    //   6308: ldc_w -1332089087
    //   6311: ixor
    //   6312: ldc2_w 1686383782
    //   6315: l2i
    //   6316: ldc_w 809915961
    //   6319: ixor
    //   6320: ixor
    //   6321: lookupswitch default -> 7028, -565293046 -> 6304, 1569778324 -> 6348
    //   6348: aload_0
    //   6349: getstatic Perryc.0 : I
    //   6352: ifle -> 6366
    //   6355: ldc2_w -2134980978
    //   6358: l2i
    //   6359: ldc_w 1375037109
    //   6362: ixor
    //   6363: goto -> 6374
    //   6366: ldc2_w 600871524
    //   6369: l2i
    //   6370: ldc_w 711159418
    //   6373: ixor
    //   6374: ldc2_w -1895134361
    //   6377: l2i
    //   6378: ldc_w 319820508
    //   6381: ixor
    //   6382: ixor
    //   6383: lookupswitch default -> 7116, -1784060507 -> 6408, 1297168768 -> 6366
    //   6408: aload_0
    //   6409: new bigname/zprestige/webhack/features/setting/Setting
    //   6412: dup
    //   6413: ldc_w '疅㌁痕㶤섑鬛๵ࡋ蹂鷷쵭ਯ롿'
    //   6416: getstatic Perryc.1 : I
    //   6419: ifeq -> 6433
    //   6422: ldc2_w -891463617
    //   6425: l2i
    //   6426: ldc_w 683101980
    //   6429: ixor
    //   6430: goto -> 6441
    //   6433: ldc2_w 922493652
    //   6436: l2i
    //   6437: ldc_w -1202598002
    //   6440: ixor
    //   6441: ldc2_w 1290150672
    //   6444: l2i
    //   6445: ldc_w -1135208714
    //   6448: ixor
    //   6449: ixor
    //   6450: lookupswitch default -> 7092, 316285637 -> 6433, 2115885244 -> 6476
    //   6476: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6479: ldc2_w -1171182524
    //   6482: l2i
    //   6483: ldc_w -1171182405
    //   6486: ixor
    //   6487: getstatic Perryc.c : I
    //   6490: iflt -> 6504
    //   6493: ldc2_w 1946081487
    //   6496: l2i
    //   6497: ldc_w 2141718588
    //   6500: ixor
    //   6501: goto -> 6512
    //   6504: ldc2_w -1011743420
    //   6507: l2i
    //   6508: ldc_w 162788099
    //   6511: ixor
    //   6512: ldc2_w 1144133966
    //   6515: l2i
    //   6516: ldc_w 43640813
    //   6519: ixor
    //   6520: ixor
    //   6521: lookupswitch default -> 6548, -1501719659 -> 6504, 1258106448 -> 7222
    //   6548: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6551: ldc2_w 556053584
    //   6554: l2i
    //   6555: ldc_w 556053584
    //   6558: ixor
    //   6559: getstatic Perryc.c : I
    //   6562: iflt -> 6576
    //   6565: ldc2_w 218773456
    //   6568: l2i
    //   6569: ldc_w -819555004
    //   6572: ixor
    //   6573: goto -> 6584
    //   6576: ldc2_w 491553721
    //   6579: l2i
    //   6580: ldc_w -1623472695
    //   6583: ixor
    //   6584: ldc2_w 1089225326
    //   6587: l2i
    //   6588: ldc_w -1216654193
    //   6591: ixor
    //   6592: ixor
    //   6593: lookupswitch default -> 6620, -525334287 -> 6576, 901493877 -> 7030
    //   6620: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6623: ldc2_w 555636237
    //   6626: l2i
    //   6627: ldc_w 555636466
    //   6630: ixor
    //   6631: getstatic Perryc.0 : I
    //   6634: ifle -> 6648
    //   6637: ldc2_w -423767499
    //   6640: l2i
    //   6641: ldc_w 28751034
    //   6644: ixor
    //   6645: goto -> 6656
    //   6648: ldc2_w -1503540476
    //   6651: l2i
    //   6652: ldc_w 186822891
    //   6655: ixor
    //   6656: ldc2_w 585045843
    //   6659: l2i
    //   6660: ldc_w -461511148
    //   6663: ixor
    //   6664: ixor
    //   6665: lookupswitch default -> 6692, 564762568 -> 7050, 1554203444 -> 6648
    //   6692: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6695: getstatic Perryc.1 : I
    //   6698: ifeq -> 6712
    //   6701: ldc2_w 2031631033
    //   6704: l2i
    //   6705: ldc_w -603057528
    //   6708: ixor
    //   6709: goto -> 6720
    //   6712: ldc2_w 2072823341
    //   6715: l2i
    //   6716: ldc_w -115157972
    //   6719: ixor
    //   6720: ldc2_w -1215757345
    //   6723: l2i
    //   6724: ldc_w 1074349889
    //   6727: ixor
    //   6728: ixor
    //   6729: lookupswitch default -> 6756, -824416194 -> 6712, 1385589935 -> 7158
    //   6756: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   6759: getstatic Perryc.0 : I
    //   6762: ifle -> 6776
    //   6765: ldc2_w -1640402994
    //   6768: l2i
    //   6769: ldc_w -1726944596
    //   6772: ixor
    //   6773: goto -> 6784
    //   6776: ldc2_w 769169103
    //   6779: l2i
    //   6780: ldc_w -979050337
    //   6783: ixor
    //   6784: ldc2_w 482561698
    //   6787: l2i
    //   6788: ldc_w 246641727
    //   6791: ixor
    //   6792: ixor
    //   6793: lookupswitch default -> 7086, -99857203 -> 6820, 358203391 -> 6776
    //   6820: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6823: getstatic Perryc.0 : I
    //   6826: ifle -> 6840
    //   6829: ldc2_w 543435897
    //   6832: l2i
    //   6833: ldc_w 1567161464
    //   6836: ixor
    //   6837: goto -> 6848
    //   6840: ldc2_w -890738857
    //   6843: l2i
    //   6844: ldc_w -1971744328
    //   6847: ixor
    //   6848: ldc2_w -482179573
    //   6851: l2i
    //   6852: ldc_w 740196913
    //   6855: ixor
    //   6856: ixor
    //   6857: lookupswitch default -> 7148, -1882328363 -> 6884, -1303325637 -> 6840
    //   6884: putfield crystalAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6887: getstatic Perryc.0 : I
    //   6890: ifle -> 6904
    //   6893: ldc2_w 778403098
    //   6896: l2i
    //   6897: ldc_w -234567974
    //   6900: ixor
    //   6901: goto -> 6912
    //   6904: ldc2_w 1110936744
    //   6907: l2i
    //   6908: ldc_w -487129538
    //   6911: ixor
    //   6912: ldc2_w -1863751998
    //   6915: l2i
    //   6916: ldc_w -1240454179
    //   6919: ixor
    //   6920: ixor
    //   6921: lookupswitch default -> 7090, -2043134071 -> 6948, -90638625 -> 6904
    //   6948: aload_0
    //   6949: getstatic Perryc.0 : I
    //   6952: ifle -> 6966
    //   6955: ldc2_w 509923165
    //   6958: l2i
    //   6959: ldc_w -357793546
    //   6962: ixor
    //   6963: goto -> 6974
    //   6966: ldc2_w -1579661291
    //   6969: l2i
    //   6970: ldc_w 1228068750
    //   6973: ixor
    //   6974: ldc2_w 1745251816
    //   6977: l2i
    //   6978: ldc_w -1836803334
    //   6981: ixor
    //   6982: ixor
    //   6983: lookupswitch default -> 7008, -1732481945 -> 6966, 239777977 -> 7040
    //   7008: putstatic bigname/zprestige/webhack/features/modules/Render/CrystalModifier.INSTANCE : Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;
    //   7011: return
    //   7012: aconst_null
    //   7013: athrow
    //   7014: aconst_null
    //   7015: athrow
    //   7016: aconst_null
    //   7017: athrow
    //   7018: aconst_null
    //   7019: athrow
    //   7020: aconst_null
    //   7021: athrow
    //   7022: aconst_null
    //   7023: athrow
    //   7024: aconst_null
    //   7025: athrow
    //   7026: aconst_null
    //   7027: athrow
    //   7028: aconst_null
    //   7029: athrow
    //   7030: aconst_null
    //   7031: athrow
    //   7032: aconst_null
    //   7033: athrow
    //   7034: aconst_null
    //   7035: athrow
    //   7036: aconst_null
    //   7037: athrow
    //   7038: aconst_null
    //   7039: athrow
    //   7040: aconst_null
    //   7041: athrow
    //   7042: aconst_null
    //   7043: athrow
    //   7044: aconst_null
    //   7045: athrow
    //   7046: aconst_null
    //   7047: athrow
    //   7048: aconst_null
    //   7049: athrow
    //   7050: aconst_null
    //   7051: athrow
    //   7052: aconst_null
    //   7053: athrow
    //   7054: aconst_null
    //   7055: athrow
    //   7056: aconst_null
    //   7057: athrow
    //   7058: aconst_null
    //   7059: athrow
    //   7060: aconst_null
    //   7061: athrow
    //   7062: aconst_null
    //   7063: athrow
    //   7064: aconst_null
    //   7065: athrow
    //   7066: aconst_null
    //   7067: athrow
    //   7068: aconst_null
    //   7069: athrow
    //   7070: aconst_null
    //   7071: athrow
    //   7072: aconst_null
    //   7073: athrow
    //   7074: aconst_null
    //   7075: athrow
    //   7076: aconst_null
    //   7077: athrow
    //   7078: aconst_null
    //   7079: athrow
    //   7080: aconst_null
    //   7081: athrow
    //   7082: aconst_null
    //   7083: athrow
    //   7084: aconst_null
    //   7085: athrow
    //   7086: aconst_null
    //   7087: athrow
    //   7088: aconst_null
    //   7089: athrow
    //   7090: aconst_null
    //   7091: athrow
    //   7092: aconst_null
    //   7093: athrow
    //   7094: aconst_null
    //   7095: athrow
    //   7096: aconst_null
    //   7097: athrow
    //   7098: aconst_null
    //   7099: athrow
    //   7100: aconst_null
    //   7101: athrow
    //   7102: aconst_null
    //   7103: athrow
    //   7104: aconst_null
    //   7105: athrow
    //   7106: aconst_null
    //   7107: athrow
    //   7108: aconst_null
    //   7109: athrow
    //   7110: aconst_null
    //   7111: athrow
    //   7112: aconst_null
    //   7113: athrow
    //   7114: aconst_null
    //   7115: athrow
    //   7116: aconst_null
    //   7117: athrow
    //   7118: aconst_null
    //   7119: athrow
    //   7120: aconst_null
    //   7121: athrow
    //   7122: aconst_null
    //   7123: athrow
    //   7124: aconst_null
    //   7125: athrow
    //   7126: aconst_null
    //   7127: athrow
    //   7128: aconst_null
    //   7129: athrow
    //   7130: aconst_null
    //   7131: athrow
    //   7132: aconst_null
    //   7133: athrow
    //   7134: aconst_null
    //   7135: athrow
    //   7136: aconst_null
    //   7137: athrow
    //   7138: aconst_null
    //   7139: athrow
    //   7140: aconst_null
    //   7141: athrow
    //   7142: aconst_null
    //   7143: athrow
    //   7144: aconst_null
    //   7145: athrow
    //   7146: aconst_null
    //   7147: athrow
    //   7148: aconst_null
    //   7149: athrow
    //   7150: aconst_null
    //   7151: athrow
    //   7152: aconst_null
    //   7153: athrow
    //   7154: aconst_null
    //   7155: athrow
    //   7156: aconst_null
    //   7157: athrow
    //   7158: aconst_null
    //   7159: athrow
    //   7160: aconst_null
    //   7161: athrow
    //   7162: aconst_null
    //   7163: athrow
    //   7164: aconst_null
    //   7165: athrow
    //   7166: aconst_null
    //   7167: athrow
    //   7168: aconst_null
    //   7169: athrow
    //   7170: aconst_null
    //   7171: athrow
    //   7172: aconst_null
    //   7173: athrow
    //   7174: aconst_null
    //   7175: athrow
    //   7176: aconst_null
    //   7177: athrow
    //   7178: aconst_null
    //   7179: athrow
    //   7180: aconst_null
    //   7181: athrow
    //   7182: aconst_null
    //   7183: athrow
    //   7184: aconst_null
    //   7185: athrow
    //   7186: aconst_null
    //   7187: athrow
    //   7188: aconst_null
    //   7189: athrow
    //   7190: aconst_null
    //   7191: athrow
    //   7192: aconst_null
    //   7193: athrow
    //   7194: aconst_null
    //   7195: athrow
    //   7196: aconst_null
    //   7197: athrow
    //   7198: aconst_null
    //   7199: athrow
    //   7200: aconst_null
    //   7201: athrow
    //   7202: aconst_null
    //   7203: athrow
    //   7204: aconst_null
    //   7205: athrow
    //   7206: aconst_null
    //   7207: athrow
    //   7208: aconst_null
    //   7209: athrow
    //   7210: aconst_null
    //   7211: athrow
    //   7212: aconst_null
    //   7213: athrow
    //   7214: aconst_null
    //   7215: athrow
    //   7216: aconst_null
    //   7217: athrow
    //   7218: aconst_null
    //   7219: athrow
    //   7220: aconst_null
    //   7221: athrow
    //   7222: aconst_null
    //   7223: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	7012	0	this	Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.22(this, (int)85844984L ^ 0x51010859, paramObject);
  }
  
  public void onRenderModel(ModelBase base, Entity entity, float limbSwing, float limbSwingAmount, float age, float headYaw, float headPitch, float scale) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4503
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 4495
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4487
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -204266166
    //   33: l2i
    //   34: ldc_w 1431852433
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 544890284
    //   44: l2i
    //   45: ldc_w -820677572
    //   48: ixor
    //   49: ldc2_w 1231805228
    //   52: l2i
    //   53: ldc_w -1154478662
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 585661947 -> 41, 1422960205 -> 4394
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.c : I
    //   98: iflt -> 112
    //   101: ldc2_w 211911538
    //   104: l2i
    //   105: ldc_w 1811089086
    //   108: ixor
    //   109: goto -> 120
    //   112: ldc2_w -134339308
    //   115: l2i
    //   116: ldc_w 603091724
    //   119: ixor
    //   120: ldc2_w 214601879
    //   123: l2i
    //   124: ldc_w -1149129536
    //   127: ixor
    //   128: ixor
    //   129: lookupswitch default -> 156, -1593381017 -> 112, -803620453 -> 4452
    //   156: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   159: getstatic Perryc.c : I
    //   162: iflt -> 176
    //   165: ldc2_w 2022479902
    //   168: l2i
    //   169: ldc_w -353807058
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w 513498471
    //   179: l2i
    //   180: ldc_w 1893599185
    //   183: ixor
    //   184: ldc2_w 1883515758
    //   187: l2i
    //   188: ldc_w -393510214
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 4416, -158665886 -> 220, 178939108 -> 176
    //   220: goto -> 224
    //   223: athrow
    //   224: invokevirtual getValue : ()Ljava/lang/Object;
    //   227: goto -> 231
    //   230: athrow
    //   231: checkcast java/lang/Integer
    //   234: getstatic Perryc.1 : I
    //   237: ifeq -> 251
    //   240: ldc2_w -2086134187
    //   243: l2i
    //   244: ldc_w -78503387
    //   247: ixor
    //   248: goto -> 259
    //   251: ldc2_w 240350758
    //   254: l2i
    //   255: ldc_w -1005078820
    //   258: ixor
    //   259: ldc2_w -804088197
    //   262: l2i
    //   263: ldc_w -742472170
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -519197375 -> 251, 2069261341 -> 4412
    //   296: goto -> 300
    //   299: athrow
    //   300: invokevirtual intValue : ()I
    //   303: goto -> 307
    //   306: athrow
    //   307: getstatic Perryc.c : I
    //   310: iflt -> 324
    //   313: ldc2_w 1387848777
    //   316: l2i
    //   317: ldc_w 1001719362
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w -1194833760
    //   327: l2i
    //   328: ldc_w 1492497692
    //   331: ixor
    //   332: ldc2_w 1550120021
    //   335: l2i
    //   336: ldc_w 2082033019
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 4420, -1069529966 -> 368, 1232100133 -> 324
    //   368: goto -> 372
    //   371: athrow
    //   372: invokestatic rainbow : (I)Ljava/awt/Color;
    //   375: goto -> 379
    //   378: athrow
    //   379: getstatic Perryc.c : I
    //   382: iflt -> 396
    //   385: ldc2_w -1201357294
    //   388: l2i
    //   389: ldc_w 237884931
    //   392: ixor
    //   393: goto -> 404
    //   396: ldc2_w -2051145566
    //   399: l2i
    //   400: ldc_w 79728029
    //   403: ixor
    //   404: ldc2_w -1246111471
    //   407: l2i
    //   408: ldc_w -107618323
    //   411: ixor
    //   412: ixor
    //   413: lookupswitch default -> 4372, -850228285 -> 440, -94015763 -> 396
    //   440: astore #9
    //   442: new java/awt/Color
    //   445: dup
    //   446: getstatic Perryc.c : I
    //   449: iflt -> 463
    //   452: ldc2_w -632420866
    //   455: l2i
    //   456: ldc_w 1817688826
    //   459: ixor
    //   460: goto -> 471
    //   463: ldc2_w -1018162325
    //   466: l2i
    //   467: ldc_w 177772012
    //   470: ixor
    //   471: ldc2_w 1142423904
    //   474: l2i
    //   475: ldc_w 1169071090
    //   478: ixor
    //   479: ixor
    //   480: lookupswitch default -> 4380, -1213258346 -> 463, -931259371 -> 508
    //   508: aload_0
    //   509: getstatic Perryc.c : I
    //   512: iflt -> 526
    //   515: ldc2_w -806213057
    //   518: l2i
    //   519: ldc_w 2129241649
    //   522: ixor
    //   523: goto -> 534
    //   526: ldc2_w 391450574
    //   529: l2i
    //   530: ldc_w 2109196842
    //   533: ixor
    //   534: ldc2_w -338729176
    //   537: l2i
    //   538: ldc_w 1191597220
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 568, -566063434 -> 526, 500350850 -> 4414
    //   568: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   571: getstatic Perryc.c : I
    //   574: iflt -> 588
    //   577: ldc2_w 465373672
    //   580: l2i
    //   581: ldc_w 2147319668
    //   584: ixor
    //   585: goto -> 596
    //   588: ldc2_w 1581896445
    //   591: l2i
    //   592: ldc_w -36974079
    //   595: ixor
    //   596: ldc2_w 209279737
    //   599: l2i
    //   600: ldc_w -1867054196
    //   603: ixor
    //   604: ixor
    //   605: lookupswitch default -> 632, -518388476 -> 588, -124899351 -> 4418
    //   632: goto -> 636
    //   635: athrow
    //   636: invokevirtual getValue : ()Ljava/lang/Object;
    //   639: goto -> 643
    //   642: athrow
    //   643: checkcast java/lang/Integer
    //   646: getstatic Perryc.0 : I
    //   649: ifle -> 663
    //   652: ldc2_w -434862840
    //   655: l2i
    //   656: ldc_w -2019849017
    //   659: ixor
    //   660: goto -> 671
    //   663: ldc2_w -1338581390
    //   666: l2i
    //   667: ldc_w -1069022578
    //   670: ixor
    //   671: ldc2_w -460489634
    //   674: l2i
    //   675: ldc_w 2062338360
    //   678: ixor
    //   679: ixor
    //   680: lookupswitch default -> 708, -588763809 -> 663, -1131351 -> 4360
    //   708: goto -> 712
    //   711: athrow
    //   712: invokevirtual intValue : ()I
    //   715: goto -> 719
    //   718: athrow
    //   719: getstatic Perryc.c : I
    //   722: iflt -> 736
    //   725: ldc2_w 423902492
    //   728: l2i
    //   729: ldc_w 1273683245
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 843878243
    //   739: l2i
    //   740: ldc_w -1621940824
    //   743: ixor
    //   744: ldc2_w 1186192370
    //   747: l2i
    //   748: ldc_w 676432740
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 4476, -1006765475 -> 780, 1011658919 -> 736
    //   780: aload_0
    //   781: getstatic Perryc.1 : I
    //   784: ifeq -> 798
    //   787: ldc2_w 1511887953
    //   790: l2i
    //   791: ldc_w 1759511397
    //   794: ixor
    //   795: goto -> 806
    //   798: ldc2_w -948435177
    //   801: l2i
    //   802: ldc_w 583257104
    //   805: ixor
    //   806: ldc2_w 754918594
    //   809: l2i
    //   810: ldc_w -1922085660
    //   813: ixor
    //   814: ixor
    //   815: lookupswitch default -> 4468, -1821507822 -> 798, 1143710497 -> 840
    //   840: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   843: getstatic Perryc.1 : I
    //   846: ifeq -> 860
    //   849: ldc2_w -1927271505
    //   852: l2i
    //   853: ldc_w 2114323307
    //   856: ixor
    //   857: goto -> 868
    //   860: ldc2_w 1159471490
    //   863: l2i
    //   864: ldc_w -586745847
    //   867: ixor
    //   868: ldc2_w -1761695667
    //   871: l2i
    //   872: ldc_w 832435116
    //   875: ixor
    //   876: ixor
    //   877: lookupswitch default -> 4382, 1064927850 -> 904, 1413837605 -> 860
    //   904: goto -> 908
    //   907: athrow
    //   908: invokevirtual getValue : ()Ljava/lang/Object;
    //   911: goto -> 915
    //   914: athrow
    //   915: checkcast java/lang/Integer
    //   918: getstatic Perryc.c : I
    //   921: iflt -> 935
    //   924: ldc2_w -557518865
    //   927: l2i
    //   928: ldc_w -2039246845
    //   931: ixor
    //   932: goto -> 943
    //   935: ldc2_w -1023941980
    //   938: l2i
    //   939: ldc_w -986538524
    //   942: ixor
    //   943: ldc2_w -1487593928
    //   946: l2i
    //   947: ldc_w -590491039
    //   950: ixor
    //   951: ixor
    //   952: lookupswitch default -> 4384, 590328757 -> 935, 2086515481 -> 980
    //   980: goto -> 984
    //   983: athrow
    //   984: invokevirtual intValue : ()I
    //   987: goto -> 991
    //   990: athrow
    //   991: getstatic Perryc.1 : I
    //   994: ifeq -> 1008
    //   997: ldc2_w 190645534
    //   1000: l2i
    //   1001: ldc_w 590837578
    //   1004: ixor
    //   1005: goto -> 1016
    //   1008: ldc2_w -40911121
    //   1011: l2i
    //   1012: ldc_w -1764289819
    //   1015: ixor
    //   1016: ldc2_w 243567866
    //   1019: l2i
    //   1020: ldc_w -1211322626
    //   1023: ixor
    //   1024: ixor
    //   1025: lookupswitch default -> 1052, -1860022192 -> 4456, -31468008 -> 1008
    //   1052: aload_0
    //   1053: getstatic Perryc.0 : I
    //   1056: ifle -> 1070
    //   1059: ldc2_w 1315588006
    //   1062: l2i
    //   1063: ldc_w -811738981
    //   1066: ixor
    //   1067: goto -> 1078
    //   1070: ldc2_w -1545099307
    //   1073: l2i
    //   1074: ldc_w 1051180375
    //   1077: ixor
    //   1078: ldc2_w 2015011974
    //   1081: l2i
    //   1082: ldc_w 1168849279
    //   1085: ixor
    //   1086: ixor
    //   1087: lookupswitch default -> 4404, -1594783877 -> 1112, -1136262460 -> 1070
    //   1112: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1115: getstatic Perryc.c : I
    //   1118: iflt -> 1132
    //   1121: ldc2_w -1218864902
    //   1124: l2i
    //   1125: ldc_w -47273681
    //   1128: ixor
    //   1129: goto -> 1140
    //   1132: ldc2_w -1103366995
    //   1135: l2i
    //   1136: ldc_w -1467683621
    //   1139: ixor
    //   1140: ldc2_w 1640333225
    //   1143: l2i
    //   1144: ldc_w 1462201584
    //   1147: ixor
    //   1148: ixor
    //   1149: lookupswitch default -> 1176, -1521014468 -> 1132, 2090148492 -> 4462
    //   1176: goto -> 1180
    //   1179: athrow
    //   1180: invokevirtual getValue : ()Ljava/lang/Object;
    //   1183: goto -> 1187
    //   1186: athrow
    //   1187: checkcast java/lang/Integer
    //   1190: getstatic Perryc.1 : I
    //   1193: ifeq -> 1207
    //   1196: ldc2_w 1120485836
    //   1199: l2i
    //   1200: ldc_w 1316546197
    //   1203: ixor
    //   1204: goto -> 1215
    //   1207: ldc2_w 114925457
    //   1210: l2i
    //   1211: ldc_w -946375755
    //   1214: ixor
    //   1215: ldc2_w -1053034080
    //   1218: l2i
    //   1219: ldc_w 320899897
    //   1222: ixor
    //   1223: ixor
    //   1224: lookupswitch default -> 4474, -559229504 -> 1207, 324378301 -> 1252
    //   1252: goto -> 1256
    //   1255: athrow
    //   1256: invokevirtual intValue : ()I
    //   1259: goto -> 1263
    //   1262: athrow
    //   1263: ldc2_w -402566708
    //   1266: l2i
    //   1267: ldc_w -402566861
    //   1270: ixor
    //   1271: getstatic Perryc.0 : I
    //   1274: ifle -> 1288
    //   1277: ldc2_w -67979692
    //   1280: l2i
    //   1281: ldc_w -1533471118
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w 69395992
    //   1291: l2i
    //   1292: ldc_w 1853342297
    //   1295: ixor
    //   1296: ldc2_w -812214051
    //   1299: l2i
    //   1300: ldc_w 2044321550
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1332, -1895201582 -> 1288, -383457291 -> 4368
    //   1332: goto -> 1336
    //   1335: athrow
    //   1336: invokespecial <init> : (IIII)V
    //   1339: goto -> 1343
    //   1342: athrow
    //   1343: getstatic Perryc.0 : I
    //   1346: ifle -> 1360
    //   1349: ldc2_w -792362797
    //   1352: l2i
    //   1353: ldc_w 881474595
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w -1515431123
    //   1363: l2i
    //   1364: ldc_w 184493911
    //   1367: ixor
    //   1368: ldc2_w -1613871029
    //   1371: l2i
    //   1372: ldc_w 647774900
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 1404, -589855471 -> 1360, 1562228239 -> 4454
    //   1404: astore #10
    //   1406: ldc2_w 1730305366
    //   1409: l2i
    //   1410: ldc_w 1731044009
    //   1413: ixor
    //   1414: getstatic Perryc.1 : I
    //   1417: ifeq -> 1431
    //   1420: ldc2_w 77930176
    //   1423: l2i
    //   1424: ldc_w -1647732198
    //   1427: ixor
    //   1428: goto -> 1439
    //   1431: ldc2_w 166266580
    //   1434: l2i
    //   1435: ldc_w 1765985163
    //   1438: ixor
    //   1439: ldc2_w -1216938008
    //   1442: l2i
    //   1443: ldc_w 110856901
    //   1446: ixor
    //   1447: ixor
    //   1448: lookupswitch default -> 4386, -783894414 -> 1476, 679604727 -> 1431
    //   1476: goto -> 1480
    //   1479: athrow
    //   1480: invokestatic glPushAttrib : (I)V
    //   1483: goto -> 1487
    //   1486: athrow
    //   1487: ldc2_w -661622511
    //   1490: l2i
    //   1491: ldc_w -661621479
    //   1494: ixor
    //   1495: ldc2_w 1684813337
    //   1498: l2i
    //   1499: ldc_w 1684811032
    //   1502: ixor
    //   1503: getstatic Perryc.1 : I
    //   1506: ifeq -> 1520
    //   1509: ldc2_w 1642024840
    //   1512: l2i
    //   1513: ldc_w -376025614
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w 616802839
    //   1523: l2i
    //   1524: ldc_w -330047380
    //   1527: ixor
    //   1528: ldc2_w 1483281697
    //   1531: l2i
    //   1532: ldc_w -284068818
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 1564, 1060201333 -> 4364, 1803239205 -> 1520
    //   1564: goto -> 1568
    //   1567: athrow
    //   1568: invokestatic glPolygonMode : (II)V
    //   1571: goto -> 1575
    //   1574: athrow
    //   1575: ldc2_w 288766159
    //   1578: l2i
    //   1579: ldc_w 288765230
    //   1582: ixor
    //   1583: getstatic Perryc.1 : I
    //   1586: ifeq -> 1600
    //   1589: ldc2_w -1848706720
    //   1592: l2i
    //   1593: ldc_w -1324546141
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 2089293718
    //   1603: l2i
    //   1604: ldc_w 66897904
    //   1607: ixor
    //   1608: ldc2_w -861501355
    //   1611: l2i
    //   1612: ldc_w -1874269479
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 1644, -527092823 -> 1600, 2083363919 -> 4428
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokestatic glDisable : (I)V
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: ldc2_w -1129583624
    //   1658: l2i
    //   1659: ldc_w -1129586520
    //   1662: ixor
    //   1663: getstatic Perryc.c : I
    //   1666: iflt -> 1680
    //   1669: ldc2_w -1674550930
    //   1672: l2i
    //   1673: ldc_w -17393467
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w 1358329581
    //   1683: l2i
    //   1684: ldc_w 486896946
    //   1687: ixor
    //   1688: ldc2_w -1737647
    //   1691: l2i
    //   1692: ldc_w 1357717925
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 4408, -842095521 -> 1680, -486842837 -> 1724
    //   1724: goto -> 1728
    //   1727: athrow
    //   1728: invokestatic glDisable : (I)V
    //   1731: goto -> 1735
    //   1734: athrow
    //   1735: getstatic Perryc.c : I
    //   1738: iflt -> 1752
    //   1741: ldc2_w 1185494133
    //   1744: l2i
    //   1745: ldc_w -1659758325
    //   1748: ixor
    //   1749: goto -> 1760
    //   1752: ldc2_w 757568409
    //   1755: l2i
    //   1756: ldc_w 1638450406
    //   1759: ixor
    //   1760: ldc2_w 210105082
    //   1763: l2i
    //   1764: ldc_w -2072742123
    //   1767: ixor
    //   1768: ixor
    //   1769: lookupswitch default -> 4460, -998321520 -> 1796, 1397401745 -> 1752
    //   1796: aload_2
    //   1797: instanceof net/minecraft/entity/player/EntityPlayer
    //   1800: ifeq -> 1814
    //   1803: ldc2_w -589282462
    //   1806: l2i
    //   1807: ldc_w 517533692
    //   1810: ixor
    //   1811: goto -> 1822
    //   1814: ldc2_w 144565942
    //   1817: l2i
    //   1818: ldc_w -895137239
    //   1821: ixor
    //   1822: ldc2_w -1250478663
    //   1825: l2i
    //   1826: ldc_w -1021254647
    //   1829: ixor
    //   1830: ixor
    //   1831: tableswitch default -> 1803, -1267761874 -> 1852, -1267761873 -> 1931
    //   1852: ldc2_w -500483935
    //   1855: l2i
    //   1856: ldc_w -500485168
    //   1859: ixor
    //   1860: getstatic Perryc.1 : I
    //   1863: ifeq -> 1877
    //   1866: ldc2_w -1589580981
    //   1869: l2i
    //   1870: ldc_w 963400580
    //   1873: ixor
    //   1874: goto -> 1885
    //   1877: ldc2_w 1801283676
    //   1880: l2i
    //   1881: ldc_w -1887676411
    //   1884: ixor
    //   1885: ldc2_w -1030835695
    //   1888: l2i
    //   1889: ldc_w 673995485
    //   1892: ixor
    //   1893: ixor
    //   1894: lookupswitch default -> 1920, -144227041 -> 1877, 1921929219 -> 4444
    //   1920: goto -> 1924
    //   1923: athrow
    //   1924: invokestatic glDisable : (I)V
    //   1927: goto -> 1931
    //   1930: athrow
    //   1931: ldc2_w -436126498
    //   1934: l2i
    //   1935: ldc_w -436127746
    //   1938: ixor
    //   1939: getstatic Perryc.1 : I
    //   1942: ifeq -> 1956
    //   1945: ldc2_w -1555845252
    //   1948: l2i
    //   1949: ldc_w 251623496
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w 1386463215
    //   1959: l2i
    //   1960: ldc_w 1084217968
    //   1963: ixor
    //   1964: ldc2_w 367720359
    //   1967: l2i
    //   1968: ldc_w -1222735000
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 4432, -1329063600 -> 2000, 256420859 -> 1956
    //   2000: goto -> 2004
    //   2003: athrow
    //   2004: invokestatic glEnable : (I)V
    //   2007: goto -> 2011
    //   2010: athrow
    //   2011: ldc2_w 1854488225
    //   2014: l2i
    //   2015: ldc_w 1854485827
    //   2018: ixor
    //   2019: getstatic Perryc.c : I
    //   2022: iflt -> 2036
    //   2025: ldc2_w 414962410
    //   2028: l2i
    //   2029: ldc_w -948089538
    //   2032: ixor
    //   2033: goto -> 2044
    //   2036: ldc2_w -540851404
    //   2039: l2i
    //   2040: ldc_w 1902787756
    //   2043: ixor
    //   2044: ldc2_w 333042720
    //   2047: l2i
    //   2048: ldc_w -1976035840
    //   2051: ixor
    //   2052: ixor
    //   2053: lookupswitch default -> 2080, 73991773 -> 2036, 1176985076 -> 4406
    //   2080: goto -> 2084
    //   2083: athrow
    //   2084: invokestatic glEnable : (I)V
    //   2087: goto -> 2091
    //   2090: athrow
    //   2091: ldc2_w -325237237
    //   2094: l2i
    //   2095: ldc_w -325237495
    //   2098: ixor
    //   2099: ldc2_w -620171577
    //   2102: l2i
    //   2103: ldc_w -620171836
    //   2106: ixor
    //   2107: getstatic Perryc.c : I
    //   2110: iflt -> 2124
    //   2113: ldc2_w -465789081
    //   2116: l2i
    //   2117: ldc_w -1101351537
    //   2120: ixor
    //   2121: goto -> 2132
    //   2124: ldc2_w -50954296
    //   2127: l2i
    //   2128: ldc_w 107783609
    //   2131: ixor
    //   2132: ldc2_w -774121926
    //   2135: l2i
    //   2136: ldc_w -595004432
    //   2139: ixor
    //   2140: ixor
    //   2141: lookupswitch default -> 2168, -1479975194 -> 2124, 1463095074 -> 4378
    //   2168: goto -> 2172
    //   2171: athrow
    //   2172: invokestatic glBlendFunc : (II)V
    //   2175: goto -> 2179
    //   2178: athrow
    //   2179: getstatic Perryc.1 : I
    //   2182: ifeq -> 2196
    //   2185: ldc2_w 708272834
    //   2188: l2i
    //   2189: ldc_w -1503965863
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w -1954797
    //   2199: l2i
    //   2200: ldc_w -1860759678
    //   2203: ixor
    //   2204: ldc2_w 1439748592
    //   2207: l2i
    //   2208: ldc_w -283501993
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 4424, -734009290 -> 2240, 916907068 -> 2196
    //   2240: aload_2
    //   2241: instanceof net/minecraft/entity/player/EntityPlayer
    //   2244: ifeq -> 2258
    //   2247: ldc2_w 1719932237
    //   2250: l2i
    //   2251: ldc_w 901868898
    //   2254: ixor
    //   2255: goto -> 2266
    //   2258: ldc2_w 1684112119
    //   2261: l2i
    //   2262: ldc_w 925170215
    //   2265: ixor
    //   2266: ldc2_w 1915273976
    //   2269: l2i
    //   2270: ldc_w 866999720
    //   2273: ixor
    //   2274: ixor
    //   2275: tableswitch default -> 2247, 314632063 -> 2296, 314632064 -> 2698
    //   2296: getstatic Perryc.0 : I
    //   2299: ifle -> 2313
    //   2302: ldc2_w 1307471576
    //   2305: l2i
    //   2306: ldc_w 1553545921
    //   2309: ixor
    //   2310: goto -> 2321
    //   2313: ldc2_w -1553008649
    //   2316: l2i
    //   2317: ldc_w -1529486470
    //   2320: ixor
    //   2321: ldc2_w 1986084422
    //   2324: l2i
    //   2325: ldc_w -1887687175
    //   2328: ixor
    //   2329: ixor
    //   2330: lookupswitch default -> 4436, -395688026 -> 2313, -22673614 -> 2356
    //   2356: getstatic bigname/zprestige/webhack/WebHack.friendManager : Lbigname/zprestige/webhack/manager/FriendManager;
    //   2359: getstatic Perryc.c : I
    //   2362: iflt -> 2376
    //   2365: ldc2_w 2058883373
    //   2368: l2i
    //   2369: ldc_w -16560006
    //   2372: ixor
    //   2373: goto -> 2384
    //   2376: ldc2_w 385174184
    //   2379: l2i
    //   2380: ldc_w 340094629
    //   2383: ixor
    //   2384: ldc2_w -385826769
    //   2387: l2i
    //   2388: ldc_w -1225279508
    //   2391: ixor
    //   2392: ixor
    //   2393: lookupswitch default -> 2420, -632539500 -> 4374, -615120023 -> 2376
    //   2420: aload_2
    //   2421: getstatic Perryc.c : I
    //   2424: iflt -> 2438
    //   2427: ldc2_w 854233876
    //   2430: l2i
    //   2431: ldc_w -1555437548
    //   2434: ixor
    //   2435: goto -> 2446
    //   2438: ldc2_w -1246000469
    //   2441: l2i
    //   2442: ldc_w -463286678
    //   2445: ixor
    //   2446: ldc2_w -876638119
    //   2449: l2i
    //   2450: ldc_w 1892715188
    //   2453: ixor
    //   2454: ixor
    //   2455: lookupswitch default -> 2480, -1004770453 -> 2438, 718037485 -> 4434
    //   2480: goto -> 2484
    //   2483: athrow
    //   2484: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   2487: goto -> 2491
    //   2490: athrow
    //   2491: getstatic Perryc.c : I
    //   2494: iflt -> 2508
    //   2497: ldc2_w 805052335
    //   2500: l2i
    //   2501: ldc_w 739570259
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w 1646394403
    //   2511: l2i
    //   2512: ldc_w 616618218
    //   2515: ixor
    //   2516: ldc2_w 1440335679
    //   2519: l2i
    //   2520: ldc_w -1493688411
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 4402, -1245643693 -> 2552, -255249050 -> 2508
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokevirtual isFriend : (Ljava/lang/String;)Z
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: ifeq -> 2577
    //   2566: ldc2_w 574751145
    //   2569: l2i
    //   2570: ldc_w 2098231084
    //   2573: ixor
    //   2574: goto -> 2585
    //   2577: ldc2_w -1302989001
    //   2580: l2i
    //   2581: ldc_w -318275151
    //   2584: ixor
    //   2585: ldc2_w 1866846206
    //   2588: l2i
    //   2589: ldc_w -1978666502
    //   2592: ixor
    //   2593: ixor
    //   2594: tableswitch default -> 2566, -1172813695 -> 2616, -1172813694 -> 2698
    //   2616: ldc2_w -475076043
    //   2619: l2i
    //   2620: ldc_w 486222552
    //   2623: ixor
    //   2624: getstatic Perryc.c : I
    //   2627: iflt -> 2641
    //   2630: ldc2_w -527090095
    //   2633: l2i
    //   2634: ldc_w 2045070470
    //   2637: ixor
    //   2638: goto -> 2649
    //   2641: ldc2_w -1122770993
    //   2644: l2i
    //   2645: ldc_w -725896674
    //   2648: ixor
    //   2649: ldc2_w 2040856552
    //   2652: l2i
    //   2653: ldc_w -1942120012
    //   2656: ixor
    //   2657: ixor
    //   2658: lookupswitch default -> 2684, -1841378435 -> 2641, 1827214475 -> 4448
    //   2684: goto -> 2688
    //   2687: athrow
    //   2688: invokestatic color : (I)V
    //   2691: goto -> 2695
    //   2694: athrow
    //   2695: goto -> 3371
    //   2698: getstatic Perryc.1 : I
    //   2701: ifeq -> 2715
    //   2704: ldc2_w -225612781
    //   2707: l2i
    //   2708: ldc_w 683703736
    //   2711: ixor
    //   2712: goto -> 2723
    //   2715: ldc2_w -2135381054
    //   2718: l2i
    //   2719: ldc_w 1172075428
    //   2722: ixor
    //   2723: ldc2_w -1650936868
    //   2726: l2i
    //   2727: ldc_w -1686068033
    //   2730: ixor
    //   2731: ixor
    //   2732: lookupswitch default -> 4464, -1015230715 -> 2760, -598407480 -> 2715
    //   2760: aload_0
    //   2761: getstatic Perryc.1 : I
    //   2764: ifeq -> 2778
    //   2767: ldc2_w 377470523
    //   2770: l2i
    //   2771: ldc_w -621409699
    //   2774: ixor
    //   2775: goto -> 2786
    //   2778: ldc2_w 1349883857
    //   2781: l2i
    //   2782: ldc_w -344386981
    //   2785: ixor
    //   2786: ldc2_w -975151803
    //   2789: l2i
    //   2790: ldc_w -1468464220
    //   2793: ixor
    //   2794: ixor
    //   2795: lookupswitch default -> 4362, -1592726905 -> 2778, -694822037 -> 2820
    //   2820: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2823: getstatic Perryc.0 : I
    //   2826: ifle -> 2840
    //   2829: ldc2_w 151998007
    //   2832: l2i
    //   2833: ldc_w 183892115
    //   2836: ixor
    //   2837: goto -> 2848
    //   2840: ldc2_w 919741997
    //   2843: l2i
    //   2844: ldc_w 203306969
    //   2847: ixor
    //   2848: ldc2_w 245258935
    //   2851: l2i
    //   2852: ldc_w 889631192
    //   2855: ixor
    //   2856: ixor
    //   2857: lookupswitch default -> 2884, -320434583 -> 2840, 945970635 -> 4446
    //   2884: goto -> 2888
    //   2887: athrow
    //   2888: invokevirtual getValue : ()Ljava/lang/Object;
    //   2891: goto -> 2895
    //   2894: athrow
    //   2895: checkcast java/lang/Boolean
    //   2898: getstatic Perryc.0 : I
    //   2901: ifle -> 2915
    //   2904: ldc2_w 1159308615
    //   2907: l2i
    //   2908: ldc_w 2017486849
    //   2911: ixor
    //   2912: goto -> 2923
    //   2915: ldc2_w -420262240
    //   2918: l2i
    //   2919: ldc_w -1633743885
    //   2922: ixor
    //   2923: ldc2_w 120872254
    //   2926: l2i
    //   2927: ldc_w -874962772
    //   2930: ixor
    //   2931: ixor
    //   2932: lookupswitch default -> 2960, -239816492 -> 4426, 1394060161 -> 2915
    //   2960: goto -> 2964
    //   2963: athrow
    //   2964: invokevirtual booleanValue : ()Z
    //   2967: goto -> 2971
    //   2970: athrow
    //   2971: ifeq -> 2985
    //   2974: ldc2_w 2013644206
    //   2977: l2i
    //   2978: ldc_w -1304764709
    //   2981: ixor
    //   2982: goto -> 2993
    //   2985: ldc2_w -1659828298
    //   2988: l2i
    //   2989: ldc_w 1462639810
    //   2992: ixor
    //   2993: ldc2_w -1739436160
    //   2996: l2i
    //   2997: ldc_w 2040025721
    //   3000: ixor
    //   3001: ixor
    //   3002: tableswitch default -> 2974, 737478284 -> 3024, 737478285 -> 3162
    //   3024: getstatic Perryc.0 : I
    //   3027: ifle -> 3041
    //   3030: ldc2_w 326884832
    //   3033: l2i
    //   3034: ldc_w 796189433
    //   3037: ixor
    //   3038: goto -> 3049
    //   3041: ldc2_w 487684641
    //   3044: l2i
    //   3045: ldc_w 1623917715
    //   3048: ixor
    //   3049: ldc2_w -1892674558
    //   3052: l2i
    //   3053: ldc_w -316967652
    //   3056: ixor
    //   3057: ixor
    //   3058: lookupswitch default -> 4470, 535895980 -> 3084, 1579441671 -> 3041
    //   3084: aload #9
    //   3086: getstatic Perryc.0 : I
    //   3089: ifle -> 3103
    //   3092: ldc2_w -1230650967
    //   3095: l2i
    //   3096: ldc_w 580681077
    //   3099: ixor
    //   3100: goto -> 3111
    //   3103: ldc2_w -1097699318
    //   3106: l2i
    //   3107: ldc_w -345896965
    //   3110: ixor
    //   3111: ldc2_w 744556514
    //   3114: l2i
    //   3115: ldc_w -1760586923
    //   3118: ixor
    //   3119: ixor
    //   3120: lookupswitch default -> 4396, -291577018 -> 3148, 794241131 -> 3103
    //   3148: goto -> 3152
    //   3151: athrow
    //   3152: invokevirtual getRGB : ()I
    //   3155: goto -> 3159
    //   3158: athrow
    //   3159: goto -> 3299
    //   3162: getstatic Perryc.1 : I
    //   3165: ifeq -> 3179
    //   3168: ldc2_w -1540949742
    //   3171: l2i
    //   3172: ldc_w -372855523
    //   3175: ixor
    //   3176: goto -> 3187
    //   3179: ldc2_w -2118478129
    //   3182: l2i
    //   3183: ldc_w 584175082
    //   3186: ixor
    //   3187: ldc2_w -225908598
    //   3190: l2i
    //   3191: ldc_w 1316220134
    //   3194: ixor
    //   3195: ixor
    //   3196: lookupswitch default -> 3224, -249868189 -> 4458, 303197455 -> 3179
    //   3224: aload #10
    //   3226: getstatic Perryc.1 : I
    //   3229: ifeq -> 3243
    //   3232: ldc2_w -2115034250
    //   3235: l2i
    //   3236: ldc_w -1305895955
    //   3239: ixor
    //   3240: goto -> 3251
    //   3243: ldc2_w 22667737
    //   3246: l2i
    //   3247: ldc_w 1841724599
    //   3250: ixor
    //   3251: ldc2_w -1542446510
    //   3254: l2i
    //   3255: ldc_w 1803239642
    //   3258: ixor
    //   3259: ixor
    //   3260: lookupswitch default -> 3288, -55715309 -> 4376, 463274457 -> 3243
    //   3288: goto -> 3292
    //   3291: athrow
    //   3292: invokevirtual getRGB : ()I
    //   3295: goto -> 3299
    //   3298: athrow
    //   3299: getstatic Perryc.0 : I
    //   3302: ifle -> 3316
    //   3305: ldc2_w -355576866
    //   3308: l2i
    //   3309: ldc_w -1556182600
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w 1030655211
    //   3319: l2i
    //   3320: ldc_w 1020261233
    //   3323: ixor
    //   3324: ldc2_w -1104434029
    //   3327: l2i
    //   3328: ldc_w 1126879887
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, -1259232134 -> 4442, 1447196652 -> 3316
    //   3360: goto -> 3364
    //   3363: athrow
    //   3364: invokestatic color : (I)V
    //   3367: goto -> 3371
    //   3370: athrow
    //   3371: getstatic Perryc.c : I
    //   3374: iflt -> 3388
    //   3377: ldc2_w 590910927
    //   3380: l2i
    //   3381: ldc_w 2073743283
    //   3384: ixor
    //   3385: goto -> 3396
    //   3388: ldc2_w 238028521
    //   3391: l2i
    //   3392: ldc_w 1297821552
    //   3395: ixor
    //   3396: ldc2_w -1773625946
    //   3399: l2i
    //   3400: ldc_w -65888102
    //   3403: ixor
    //   3404: ixor
    //   3405: lookupswitch default -> 4392, 691082405 -> 3432, 855140160 -> 3388
    //   3432: aload_0
    //   3433: getstatic Perryc.c : I
    //   3436: iflt -> 3450
    //   3439: ldc2_w -1360580007
    //   3442: l2i
    //   3443: ldc_w -1931209518
    //   3446: ixor
    //   3447: goto -> 3458
    //   3450: ldc2_w 2045898402
    //   3453: l2i
    //   3454: ldc_w 1717651326
    //   3457: ixor
    //   3458: ldc2_w 572929769
    //   3461: l2i
    //   3462: ldc_w 949265070
    //   3465: ixor
    //   3466: ixor
    //   3467: lookupswitch default -> 3492, 89319435 -> 3450, 951169740 -> 4450
    //   3492: getfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3495: getstatic Perryc.c : I
    //   3498: iflt -> 3512
    //   3501: ldc2_w 1210346755
    //   3504: l2i
    //   3505: ldc_w -1212268361
    //   3508: ixor
    //   3509: goto -> 3520
    //   3512: ldc2_w -154753335
    //   3515: l2i
    //   3516: ldc_w -960338746
    //   3519: ixor
    //   3520: ldc2_w 632447021
    //   3523: l2i
    //   3524: ldc_w 1087002020
    //   3527: ixor
    //   3528: ixor
    //   3529: lookupswitch default -> 3556, -1696458691 -> 4390, -297626415 -> 3512
    //   3556: goto -> 3560
    //   3559: athrow
    //   3560: invokevirtual getValue : ()Ljava/lang/Object;
    //   3563: goto -> 3567
    //   3566: athrow
    //   3567: checkcast java/lang/Float
    //   3570: getstatic Perryc.c : I
    //   3573: iflt -> 3587
    //   3576: ldc2_w 401920905
    //   3579: l2i
    //   3580: ldc_w -1114238823
    //   3583: ixor
    //   3584: goto -> 3595
    //   3587: ldc2_w -726992584
    //   3590: l2i
    //   3591: ldc_w 1727644754
    //   3594: ixor
    //   3595: ldc2_w -1947116399
    //   3598: l2i
    //   3599: ldc_w 1392100674
    //   3602: ixor
    //   3603: ixor
    //   3604: lookupswitch default -> 4422, 1801168057 -> 3632, 1936349891 -> 3587
    //   3632: goto -> 3636
    //   3635: athrow
    //   3636: invokevirtual floatValue : ()F
    //   3639: goto -> 3643
    //   3642: athrow
    //   3643: getstatic Perryc.c : I
    //   3646: iflt -> 3660
    //   3649: ldc2_w -939076948
    //   3652: l2i
    //   3653: ldc_w -766631264
    //   3656: ixor
    //   3657: goto -> 3668
    //   3660: ldc2_w -1644561388
    //   3663: l2i
    //   3664: ldc_w -1196543472
    //   3667: ixor
    //   3668: ldc2_w -1692250652
    //   3671: l2i
    //   3672: ldc_w -730746348
    //   3675: ixor
    //   3676: ixor
    //   3677: lookupswitch default -> 4366, 1427836924 -> 3660, 1778659828 -> 3704
    //   3704: goto -> 3708
    //   3707: athrow
    //   3708: invokestatic glLineWidth : (F)V
    //   3711: goto -> 3715
    //   3714: athrow
    //   3715: getstatic Perryc.1 : I
    //   3718: ifeq -> 3732
    //   3721: ldc2_w -774240090
    //   3724: l2i
    //   3725: ldc_w 1751716917
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w -1659559620
    //   3735: l2i
    //   3736: ldc_w -507226851
    //   3739: ixor
    //   3740: ldc2_w 207868565
    //   3743: l2i
    //   3744: ldc_w -1296538057
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 3776, 124299313 -> 4370, 1932303695 -> 3732
    //   3776: aload_1
    //   3777: getstatic Perryc.1 : I
    //   3780: ifeq -> 3794
    //   3783: ldc2_w 1808652482
    //   3786: l2i
    //   3787: ldc_w -1921254241
    //   3790: ixor
    //   3791: goto -> 3802
    //   3794: ldc2_w 307071272
    //   3797: l2i
    //   3798: ldc_w -1773883358
    //   3801: ixor
    //   3802: ldc2_w 650517217
    //   3805: l2i
    //   3806: ldc_w 658540269
    //   3809: ixor
    //   3810: ixor
    //   3811: lookupswitch default -> 4398, -2054183674 -> 3836, -416237487 -> 3794
    //   3836: aload_2
    //   3837: getstatic Perryc.c : I
    //   3840: iflt -> 3854
    //   3843: ldc2_w 131821613
    //   3846: l2i
    //   3847: ldc_w -1158110080
    //   3850: ixor
    //   3851: goto -> 3862
    //   3854: ldc2_w 1994258039
    //   3857: l2i
    //   3858: ldc_w 783895578
    //   3861: ixor
    //   3862: ldc2_w 131707884
    //   3865: l2i
    //   3866: ldc_w 362558939
    //   3869: ixor
    //   3870: ixor
    //   3871: lookupswitch default -> 4438, -1352248678 -> 3854, 1243692122 -> 3896
    //   3896: fload_3
    //   3897: getstatic Perryc.1 : I
    //   3900: ifeq -> 3914
    //   3903: ldc2_w 1225436120
    //   3906: l2i
    //   3907: ldc_w -835830843
    //   3910: ixor
    //   3911: goto -> 3922
    //   3914: ldc2_w 342513347
    //   3917: l2i
    //   3918: ldc_w -638699000
    //   3921: ixor
    //   3922: ldc2_w -1779481837
    //   3925: l2i
    //   3926: ldc_w -1064035987
    //   3929: ixor
    //   3930: ixor
    //   3931: lookupswitch default -> 3956, -1343198820 -> 3914, -765474205 -> 4410
    //   3956: fload #4
    //   3958: getstatic Perryc.1 : I
    //   3961: ifeq -> 3975
    //   3964: ldc2_w -12020260
    //   3967: l2i
    //   3968: ldc_w -909496286
    //   3971: ixor
    //   3972: goto -> 3983
    //   3975: ldc2_w -833984693
    //   3978: l2i
    //   3979: ldc_w -1324517869
    //   3982: ixor
    //   3983: ldc2_w -1761396068
    //   3986: l2i
    //   3987: ldc_w -1754909594
    //   3990: ixor
    //   3991: ixor
    //   3992: lookupswitch default -> 4472, 921152260 -> 3975, 2132942754 -> 4020
    //   4020: fload #5
    //   4022: getstatic Perryc.0 : I
    //   4025: ifle -> 4039
    //   4028: ldc2_w -945571444
    //   4031: l2i
    //   4032: ldc_w 1509283483
    //   4035: ixor
    //   4036: goto -> 4047
    //   4039: ldc2_w 919482885
    //   4042: l2i
    //   4043: ldc_w 916730459
    //   4046: ixor
    //   4047: ldc2_w -1212210052
    //   4050: l2i
    //   4051: ldc_w 1465078698
    //   4054: ixor
    //   4055: ixor
    //   4056: lookupswitch default -> 4084, 229722854 -> 4039, 2126125249 -> 4466
    //   4084: fload #6
    //   4086: getstatic Perryc.c : I
    //   4089: iflt -> 4103
    //   4092: ldc2_w -137840537
    //   4095: l2i
    //   4096: ldc_w -1674859845
    //   4099: ixor
    //   4100: goto -> 4111
    //   4103: ldc2_w -238055489
    //   4106: l2i
    //   4107: ldc_w -906058176
    //   4110: ixor
    //   4111: ldc2_w -342076427
    //   4114: l2i
    //   4115: ldc_w 2007234188
    //   4118: ixor
    //   4119: ixor
    //   4120: lookupswitch default -> 4148, -1951856487 -> 4103, -136530011 -> 4388
    //   4148: fload #7
    //   4150: getstatic Perryc.c : I
    //   4153: iflt -> 4167
    //   4156: ldc2_w -944292443
    //   4159: l2i
    //   4160: ldc_w 1435561166
    //   4163: ixor
    //   4164: goto -> 4175
    //   4167: ldc2_w 1253398538
    //   4170: l2i
    //   4171: ldc_w 515891381
    //   4174: ixor
    //   4175: ldc2_w -428574416
    //   4178: l2i
    //   4179: ldc_w 137720484
    //   4182: ixor
    //   4183: ixor
    //   4184: lookupswitch default -> 4212, -2012690983 -> 4167, 2087115519 -> 4430
    //   4212: fload #8
    //   4214: getstatic Perryc.1 : I
    //   4217: ifeq -> 4231
    //   4220: ldc2_w 625314136
    //   4223: l2i
    //   4224: ldc_w -1769496273
    //   4227: ixor
    //   4228: goto -> 4239
    //   4231: ldc2_w -1305244445
    //   4234: l2i
    //   4235: ldc_w -1783679768
    //   4238: ixor
    //   4239: ldc2_w -380481165
    //   4242: l2i
    //   4243: ldc_w 583807668
    //   4246: ixor
    //   4247: ixor
    //   4248: lookupswitch default -> 4400, -335356980 -> 4276, 2019314608 -> 4231
    //   4276: goto -> 4280
    //   4279: athrow
    //   4280: invokevirtual func_78088_a : (Lnet/minecraft/entity/Entity;FFFFFF)V
    //   4283: goto -> 4287
    //   4286: athrow
    //   4287: getstatic Perryc.c : I
    //   4290: iflt -> 4304
    //   4293: ldc2_w -164794174
    //   4296: l2i
    //   4297: ldc_w 1738043679
    //   4300: ixor
    //   4301: goto -> 4312
    //   4304: ldc2_w -355840807
    //   4307: l2i
    //   4308: ldc_w 1385361063
    //   4311: ixor
    //   4312: ldc2_w -683829577
    //   4315: l2i
    //   4316: ldc_w -1895097642
    //   4319: ixor
    //   4320: ixor
    //   4321: lookupswitch default -> 4348, -2081602044 -> 4304, -914125380 -> 4440
    //   4348: goto -> 4352
    //   4351: athrow
    //   4352: invokestatic glPopAttrib : ()V
    //   4355: goto -> 4359
    //   4358: athrow
    //   4359: return
    //   4360: aconst_null
    //   4361: athrow
    //   4362: aconst_null
    //   4363: athrow
    //   4364: aconst_null
    //   4365: athrow
    //   4366: aconst_null
    //   4367: athrow
    //   4368: aconst_null
    //   4369: athrow
    //   4370: aconst_null
    //   4371: athrow
    //   4372: aconst_null
    //   4373: athrow
    //   4374: aconst_null
    //   4375: athrow
    //   4376: aconst_null
    //   4377: athrow
    //   4378: aconst_null
    //   4379: athrow
    //   4380: aconst_null
    //   4381: athrow
    //   4382: aconst_null
    //   4383: athrow
    //   4384: aconst_null
    //   4385: athrow
    //   4386: aconst_null
    //   4387: athrow
    //   4388: aconst_null
    //   4389: athrow
    //   4390: aconst_null
    //   4391: athrow
    //   4392: aconst_null
    //   4393: athrow
    //   4394: aconst_null
    //   4395: athrow
    //   4396: aconst_null
    //   4397: athrow
    //   4398: aconst_null
    //   4399: athrow
    //   4400: aconst_null
    //   4401: athrow
    //   4402: aconst_null
    //   4403: athrow
    //   4404: aconst_null
    //   4405: athrow
    //   4406: aconst_null
    //   4407: athrow
    //   4408: aconst_null
    //   4409: athrow
    //   4410: aconst_null
    //   4411: athrow
    //   4412: aconst_null
    //   4413: athrow
    //   4414: aconst_null
    //   4415: athrow
    //   4416: aconst_null
    //   4417: athrow
    //   4418: aconst_null
    //   4419: athrow
    //   4420: aconst_null
    //   4421: athrow
    //   4422: aconst_null
    //   4423: athrow
    //   4424: aconst_null
    //   4425: athrow
    //   4426: aconst_null
    //   4427: athrow
    //   4428: aconst_null
    //   4429: athrow
    //   4430: aconst_null
    //   4431: athrow
    //   4432: aconst_null
    //   4433: athrow
    //   4434: aconst_null
    //   4435: athrow
    //   4436: aconst_null
    //   4437: athrow
    //   4438: aconst_null
    //   4439: athrow
    //   4440: aconst_null
    //   4441: athrow
    //   4442: aconst_null
    //   4443: athrow
    //   4444: aconst_null
    //   4445: athrow
    //   4446: aconst_null
    //   4447: athrow
    //   4448: aconst_null
    //   4449: athrow
    //   4450: aconst_null
    //   4451: athrow
    //   4452: aconst_null
    //   4453: athrow
    //   4454: aconst_null
    //   4455: athrow
    //   4456: aconst_null
    //   4457: athrow
    //   4458: aconst_null
    //   4459: athrow
    //   4460: aconst_null
    //   4461: athrow
    //   4462: aconst_null
    //   4463: athrow
    //   4464: aconst_null
    //   4465: athrow
    //   4466: aconst_null
    //   4467: athrow
    //   4468: aconst_null
    //   4469: athrow
    //   4470: aconst_null
    //   4471: athrow
    //   4472: aconst_null
    //   4473: athrow
    //   4474: aconst_null
    //   4475: athrow
    //   4476: aconst_null
    //   4477: athrow
    //   4478: pop
    //   4479: goto -> 24
    //   4482: pop
    //   4483: aconst_null
    //   4484: goto -> 4478
    //   4487: dup
    //   4488: ifnull -> 4478
    //   4491: checkcast java/lang/Throwable
    //   4494: athrow
    //   4495: dup
    //   4496: ifnull -> 4482
    //   4499: checkcast java/lang/Throwable
    //   4502: athrow
    //   4503: aconst_null
    //   4504: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4336	0	this	Lbigname/zprestige/webhack/features/modules/Render/CrystalModifier;
    //   24	4336	1	base	Lnet/minecraft/client/model/ModelBase;
    //   24	4336	2	entity	Lnet/minecraft/entity/Entity;
    //   24	4336	3	limbSwing	F
    //   24	4336	4	limbSwingAmount	F
    //   24	4336	5	age	F
    //   24	4336	6	headYaw	F
    //   24	4336	7	headPitch	F
    //   24	4336	8	scale	F
    //   442	3918	9	rainbowColor	Ljava/awt/Color;
    //   1406	2954	10	color	Ljava/awt/Color;
    // Exception table:
    //   from	to	target	type
    //   8	20	4487	finally
    //   87	94	94	finally
    //   87	94	94	java/util/NoSuchElementException
    //   88	94	87	java/lang/StringIndexOutOfBoundsException
    //   88	94	87	finally
    //   88	94	87	java/lang/IllegalArgumentException
    //   224	230	230	finally
    //   224	230	3	finally
    //   224	230	230	finally
    //   224	230	230	java/lang/IllegalArgumentException
    //   224	230	3	java/lang/IndexOutOfBoundsException
    //   299	306	306	finally
    //   299	306	3	java/util/NoSuchElementException
    //   299	306	306	finally
    //   299	306	299	finally
    //   300	306	299	java/lang/NumberFormatException
    //   371	378	378	finally
    //   371	378	371	finally
    //   371	378	378	finally
    //   372	378	371	finally
    //   372	378	378	finally
    //   636	642	642	finally
    //   636	642	642	java/lang/EnumConstantNotPresentException
    //   636	642	642	finally
    //   636	642	3	finally
    //   636	642	3	finally
    //   712	718	718	finally
    //   712	718	718	finally
    //   712	718	718	java/lang/IndexOutOfBoundsException
    //   712	718	3	finally
    //   712	718	3	finally
    //   908	914	914	finally
    //   908	914	914	finally
    //   908	914	914	finally
    //   908	914	3	finally
    //   908	914	914	java/lang/ArrayIndexOutOfBoundsException
    //   983	990	990	finally
    //   983	990	983	java/lang/IllegalArgumentException
    //   983	990	3	finally
    //   983	990	3	finally
    //   984	990	3	java/lang/NegativeArraySizeException
    //   1179	1186	1186	finally
    //   1180	1186	3	finally
    //   1180	1186	3	finally
    //   1180	1186	1179	finally
    //   1180	1186	1179	java/lang/RuntimeException
    //   1255	1262	1262	finally
    //   1255	1262	3	java/lang/NullPointerException
    //   1256	1262	1255	finally
    //   1256	1262	3	finally
    //   1256	1262	1255	java/lang/ClassCastException
    //   1335	1342	1342	finally
    //   1335	1342	1335	finally
    //   1336	1342	1335	finally
    //   1336	1342	1335	finally
    //   1336	1342	1342	java/lang/IllegalStateException
    //   1479	1486	1486	finally
    //   1479	1486	1486	java/lang/ArithmeticException
    //   1479	1486	1479	java/util/ConcurrentModificationException
    //   1479	1486	1479	java/util/NoSuchElementException
    //   1479	1486	1486	finally
    //   1567	1574	1574	finally
    //   1567	1574	3	java/lang/UnsupportedOperationException
    //   1567	1574	1567	finally
    //   1568	1574	1574	finally
    //   1568	1574	3	java/lang/ClassCastException
    //   1648	1654	1654	finally
    //   1648	1654	3	finally
    //   1648	1654	1654	finally
    //   1648	1654	1654	java/lang/EnumConstantNotPresentException
    //   1648	1654	3	finally
    //   1728	1734	1734	finally
    //   1728	1734	3	finally
    //   1728	1734	1734	java/lang/EnumConstantNotPresentException
    //   1728	1734	1734	java/lang/NegativeArraySizeException
    //   1728	1734	3	finally
    //   1923	1930	1930	finally
    //   1923	1930	1930	java/lang/EnumConstantNotPresentException
    //   1924	1930	1930	java/lang/NumberFormatException
    //   1924	1930	1923	finally
    //   1924	1930	1923	java/lang/AssertionError
    //   2003	2010	2010	finally
    //   2003	2010	2010	finally
    //   2003	2010	2003	java/lang/ArithmeticException
    //   2004	2010	3	java/util/ConcurrentModificationException
    //   2004	2010	3	finally
    //   2083	2090	2090	finally
    //   2083	2090	2083	java/lang/ArrayIndexOutOfBoundsException
    //   2083	2090	2090	java/lang/NegativeArraySizeException
    //   2083	2090	2090	java/util/NoSuchElementException
    //   2084	2090	3	java/lang/AssertionError
    //   2172	2178	2178	finally
    //   2172	2178	3	java/lang/ClassCastException
    //   2172	2178	2178	finally
    //   2172	2178	2178	java/lang/NullPointerException
    //   2172	2178	2178	java/lang/RuntimeException
    //   2483	2490	2490	finally
    //   2483	2490	2490	finally
    //   2483	2490	2483	finally
    //   2484	2490	2483	java/lang/ClassCastException
    //   2484	2490	3	java/util/NoSuchElementException
    //   2556	2562	2562	finally
    //   2556	2562	3	java/lang/IndexOutOfBoundsException
    //   2556	2562	3	java/lang/IllegalArgumentException
    //   2556	2562	3	java/lang/EnumConstantNotPresentException
    //   2556	2562	2562	java/lang/RuntimeException
    //   2688	2694	2694	finally
    //   2688	2694	3	finally
    //   2688	2694	2694	finally
    //   2688	2694	2694	finally
    //   2688	2694	3	finally
    //   2887	2894	2894	finally
    //   2887	2894	2887	finally
    //   2888	2894	2887	finally
    //   2888	2894	3	finally
    //   2888	2894	3	finally
    //   2963	2970	2970	finally
    //   2963	2970	3	finally
    //   2963	2970	3	finally
    //   2964	2970	2963	finally
    //   2964	2970	2970	finally
    //   3151	3158	3158	finally
    //   3151	3158	3158	java/lang/AssertionError
    //   3151	3158	3151	java/lang/IllegalArgumentException
    //   3152	3158	3	finally
    //   3152	3158	3	finally
    //   3291	3298	3298	finally
    //   3291	3298	3291	finally
    //   3292	3298	3	java/lang/NegativeArraySizeException
    //   3292	3298	3298	java/lang/IllegalArgumentException
    //   3292	3298	3291	java/lang/StringIndexOutOfBoundsException
    //   3363	3370	3370	finally
    //   3363	3370	3	java/lang/NullPointerException
    //   3364	3370	3	java/lang/StringIndexOutOfBoundsException
    //   3364	3370	3363	java/util/NoSuchElementException
    //   3364	3370	3363	java/lang/IllegalStateException
    //   3559	3566	3566	finally
    //   3560	3566	3559	java/lang/ClassCastException
    //   3560	3566	3566	java/lang/RuntimeException
    //   3560	3566	3	java/lang/IndexOutOfBoundsException
    //   3560	3566	3	finally
    //   3635	3642	3642	finally
    //   3635	3642	3635	java/lang/NullPointerException
    //   3635	3642	3	java/lang/NumberFormatException
    //   3635	3642	3642	finally
    //   3636	3642	3635	finally
    //   3707	3714	3714	finally
    //   3707	3714	3714	java/lang/AssertionError
    //   3707	3714	3707	finally
    //   3707	3714	3	java/lang/RuntimeException
    //   3708	3714	3	java/lang/UnsupportedOperationException
    //   4280	4286	4286	finally
    //   4280	4286	3	finally
    //   4280	4286	4286	java/util/NoSuchElementException
    //   4280	4286	4286	java/lang/IllegalArgumentException
    //   4280	4286	4286	java/lang/EnumConstantNotPresentException
    //   4351	4358	4358	finally
    //   4351	4358	4351	java/lang/ClassCastException
    //   4352	4358	3	finally
    //   4352	4358	4358	java/lang/IllegalStateException
    //   4352	4358	3	finally
    //   4487	4495	4487	java/lang/ArrayIndexOutOfBoundsException
    //   4503	4505	3	java/lang/NumberFormatException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public boolean lambda$new$4(Object paramObject) {
    return Perry1.2c(this, (int)1621196135L ^ 0x243B0B61, paramObject);
  }
  
  public boolean lambda$new$2(Object paramObject) {
    return Perry1.1C(this, (int)-640933827L ^ 0xEE018A9E, paramObject);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\CrystalModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */