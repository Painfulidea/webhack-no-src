package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Killaura extends Module {
  public Setting<Boolean> tps;
  
  public Setting<Boolean> players;
  
  public Setting<Boolean> packet;
  
  public Timer timer;
  
  public Setting<Boolean> delay;
  
  public Setting<Boolean> animals;
  
  public static Entity target;
  
  public Setting<Boolean> rotate;
  
  public Setting<Float> range;
  
  public Setting<Float> raytrace;
  
  public Setting<Boolean> mobs;
  
  public Setting<Boolean> vehicles;
  
  public Setting<Boolean> onlySharp;
  
  public Setting<Boolean> projectiles;
  
  public Entity getTarget() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 8655
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 8647
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 8639
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: aconst_null
    //   25: getstatic Perryc.c : I
    //   28: iflt -> 41
    //   31: ldc2_w -1671762772
    //   34: l2i
    //   35: ldc 1513321202
    //   37: ixor
    //   38: goto -> 48
    //   41: ldc2_w 1599078111
    //   44: l2i
    //   45: ldc 1713565540
    //   47: ixor
    //   48: ldc2_w 1056991021
    //   51: l2i
    //   52: ldc -1199530225
    //   54: ixor
    //   55: ixor
    //   56: lookupswitch default -> 8426, -1091704423 -> 84, 1105815164 -> 41
    //   84: astore_1
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 101
    //   91: ldc2_w -2038316648
    //   94: l2i
    //   95: ldc 792314516
    //   97: ixor
    //   98: goto -> 108
    //   101: ldc2_w -878607888
    //   104: l2i
    //   105: ldc 1564705047
    //   107: ixor
    //   108: ldc2_w -455106973
    //   111: l2i
    //   112: ldc 1585641567
    //   114: ixor
    //   115: ixor
    //   116: lookupswitch default -> 8584, 333800752 -> 101, 750741211 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 161
    //   151: ldc2_w -686035832
    //   154: l2i
    //   155: ldc 1596250027
    //   157: ixor
    //   158: goto -> 168
    //   161: ldc2_w -1237000002
    //   164: l2i
    //   165: ldc 702820827
    //   167: ixor
    //   168: ldc2_w -1320186797
    //   171: l2i
    //   172: ldc -2068954097
    //   174: ixor
    //   175: ixor
    //   176: lookupswitch default -> 8608, -1438574279 -> 204, -1109462145 -> 161
    //   204: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   207: getstatic Perryc.1 : I
    //   210: ifeq -> 223
    //   213: ldc2_w -1164395808
    //   216: l2i
    //   217: ldc 1734939709
    //   219: ixor
    //   220: goto -> 230
    //   223: ldc2_w -313220464
    //   226: l2i
    //   227: ldc 1093326283
    //   229: ixor
    //   230: ldc2_w 1124679306
    //   233: l2i
    //   234: ldc 1431733902
    //   236: ixor
    //   237: ixor
    //   238: lookupswitch default -> 8518, -1172189345 -> 264, -877783335 -> 223
    //   264: goto -> 268
    //   267: athrow
    //   268: invokevirtual getValue : ()Ljava/lang/Object;
    //   271: goto -> 275
    //   274: athrow
    //   275: checkcast java/lang/Float
    //   278: getstatic Perryc.0 : I
    //   281: ifle -> 294
    //   284: ldc2_w -740769119
    //   287: l2i
    //   288: ldc 2017999066
    //   290: ixor
    //   291: goto -> 301
    //   294: ldc2_w -658798262
    //   297: l2i
    //   298: ldc 1251363006
    //   300: ixor
    //   301: ldc2_w -796813884
    //   304: l2i
    //   305: ldc 657658537
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 8616, 1545764118 -> 294, 1704937113 -> 336
    //   336: goto -> 340
    //   339: athrow
    //   340: invokevirtual floatValue : ()F
    //   343: goto -> 347
    //   346: athrow
    //   347: f2d
    //   348: getstatic Perryc.1 : I
    //   351: ifeq -> 364
    //   354: ldc2_w -778097371
    //   357: l2i
    //   358: ldc 2111484982
    //   360: ixor
    //   361: goto -> 371
    //   364: ldc2_w 75167304
    //   367: l2i
    //   368: ldc -1021761635
    //   370: ixor
    //   371: ldc2_w 1131951752
    //   374: l2i
    //   375: ldc -274258103
    //   377: ixor
    //   378: ixor
    //   379: lookupswitch default -> 8530, 10127570 -> 364, 1807532052 -> 404
    //   404: dstore_2
    //   405: ldc2_w 0.045099174627967975
    //   408: invokestatic doubleToLongBits : (D)J
    //   411: ldc2_w 9215797764052818480
    //   414: lxor
    //   415: invokestatic longBitsToDouble : (J)D
    //   418: getstatic Perryc.0 : I
    //   421: ifle -> 434
    //   424: ldc2_w 1197520535
    //   427: l2i
    //   428: ldc -215085886
    //   430: ixor
    //   431: goto -> 441
    //   434: ldc2_w 575815073
    //   437: l2i
    //   438: ldc -2002797818
    //   440: ixor
    //   441: ldc2_w 265460457
    //   444: l2i
    //   445: ldc -1404805764
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 476, 215704314 -> 434, 400063936 -> 8602
    //   476: dstore #4
    //   478: getstatic Perryc.1 : I
    //   481: ifeq -> 494
    //   484: ldc2_w 1611295085
    //   487: l2i
    //   488: ldc 726874290
    //   490: ixor
    //   491: goto -> 501
    //   494: ldc2_w 26017189
    //   497: l2i
    //   498: ldc 1322314732
    //   500: ixor
    //   501: ldc2_w 1306224025
    //   504: l2i
    //   505: ldc 680382875
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 8614, 705339979 -> 536, 772793821 -> 494
    //   536: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   539: getstatic Perryc.1 : I
    //   542: ifeq -> 555
    //   545: ldc2_w -1714737769
    //   548: l2i
    //   549: ldc 14090208
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w -70961971
    //   558: l2i
    //   559: ldc 540522043
    //   561: ixor
    //   562: ldc2_w 935224309
    //   565: l2i
    //   566: ldc 1234554104
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 8590, -1512493573 -> 596, -415859334 -> 555
    //   596: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   599: getstatic Perryc.c : I
    //   602: iflt -> 615
    //   605: ldc2_w -531052249
    //   608: l2i
    //   609: ldc -2061373320
    //   611: ixor
    //   612: goto -> 622
    //   615: ldc2_w 1997140870
    //   618: l2i
    //   619: ldc -242340582
    //   621: ixor
    //   622: ldc2_w 2012600900
    //   625: l2i
    //   626: ldc -1935123984
    //   628: ixor
    //   629: ixor
    //   630: lookupswitch default -> 656, -1641760021 -> 8504, 1682407065 -> 615
    //   656: getfield field_73010_i : Ljava/util/List;
    //   659: getstatic Perryc.0 : I
    //   662: ifle -> 675
    //   665: ldc2_w 2032173493
    //   668: l2i
    //   669: ldc 878281321
    //   671: ixor
    //   672: goto -> 682
    //   675: ldc2_w -1962348094
    //   678: l2i
    //   679: ldc -941297127
    //   681: ixor
    //   682: ldc2_w -891773183
    //   685: l2i
    //   686: ldc -1535876786
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 8524, 574684564 -> 716, 601226643 -> 675
    //   716: goto -> 720
    //   719: athrow
    //   720: invokeinterface iterator : ()Ljava/util/Iterator;
    //   725: goto -> 729
    //   728: athrow
    //   729: getstatic Perryc.1 : I
    //   732: ifeq -> 745
    //   735: ldc2_w 698971255
    //   738: l2i
    //   739: ldc 1797053960
    //   741: ixor
    //   742: goto -> 752
    //   745: ldc2_w 1653821228
    //   748: l2i
    //   749: ldc 1597704527
    //   751: ixor
    //   752: ldc2_w -1729475610
    //   755: l2i
    //   756: ldc 900257408
    //   758: ixor
    //   759: ixor
    //   760: lookupswitch default -> 8568, -1863656699 -> 788, -269011175 -> 745
    //   788: astore #6
    //   790: getstatic Perryc.1 : I
    //   793: ifeq -> 806
    //   796: ldc2_w -1157375513
    //   799: l2i
    //   800: ldc 1333667618
    //   802: ixor
    //   803: goto -> 813
    //   806: ldc2_w 661592959
    //   809: l2i
    //   810: ldc 1877050005
    //   812: ixor
    //   813: ldc2_w 452099602
    //   816: l2i
    //   817: ldc 1235849679
    //   819: ixor
    //   820: ixor
    //   821: lookupswitch default -> 8626, -1490677480 -> 806, 466974263 -> 848
    //   848: aload #6
    //   850: getstatic Perryc.1 : I
    //   853: ifeq -> 866
    //   856: ldc2_w -575392583
    //   859: l2i
    //   860: ldc 1023224390
    //   862: ixor
    //   863: goto -> 873
    //   866: ldc2_w -1774776810
    //   869: l2i
    //   870: ldc -1545876465
    //   872: ixor
    //   873: ldc2_w -1111979222
    //   876: l2i
    //   877: ldc 183408258
    //   879: ixor
    //   880: ixor
    //   881: lookupswitch default -> 908, 1444873047 -> 8456, 1758154282 -> 866
    //   908: goto -> 912
    //   911: athrow
    //   912: invokeinterface hasNext : ()Z
    //   917: goto -> 921
    //   920: athrow
    //   921: ifeq -> 935
    //   924: ldc2_w 1917139160
    //   927: l2i
    //   928: ldc_w 1621439739
    //   931: ixor
    //   932: goto -> 943
    //   935: ldc2_w -574020585
    //   938: l2i
    //   939: ldc_w -819386315
    //   942: ixor
    //   943: ldc2_w -1057141502
    //   946: l2i
    //   947: ldc_w 1177786969
    //   950: ixor
    //   951: ixor
    //   952: tableswitch default -> 924, -1808868488 -> 976, -1808868487 -> 8349
    //   976: getstatic Perryc.1 : I
    //   979: ifeq -> 993
    //   982: ldc2_w 881414482
    //   985: l2i
    //   986: ldc_w -1383708327
    //   989: ixor
    //   990: goto -> 1001
    //   993: ldc2_w 140547060
    //   996: l2i
    //   997: ldc_w -2112306177
    //   1000: ixor
    //   1001: ldc2_w -133250853
    //   1004: l2i
    //   1005: ldc_w -2057043078
    //   1008: ixor
    //   1009: ixor
    //   1010: lookupswitch default -> 8416, -463086678 -> 993, -149777494 -> 1036
    //   1036: aload #6
    //   1038: getstatic Perryc.1 : I
    //   1041: ifeq -> 1055
    //   1044: ldc2_w 869870778
    //   1047: l2i
    //   1048: ldc_w -618467385
    //   1051: ixor
    //   1052: goto -> 1063
    //   1055: ldc2_w -55657115
    //   1058: l2i
    //   1059: ldc_w 935099540
    //   1062: ixor
    //   1063: ldc2_w -1962032185
    //   1066: l2i
    //   1067: ldc_w 1094614063
    //   1070: ixor
    //   1071: ixor
    //   1072: lookupswitch default -> 8586, 18972185 -> 1100, 583564437 -> 1055
    //   1100: goto -> 1104
    //   1103: athrow
    //   1104: invokeinterface next : ()Ljava/lang/Object;
    //   1109: goto -> 1113
    //   1112: athrow
    //   1113: checkcast net/minecraft/entity/Entity
    //   1116: getstatic Perryc.1 : I
    //   1119: ifeq -> 1133
    //   1122: ldc2_w 1855222332
    //   1125: l2i
    //   1126: ldc_w -221097438
    //   1129: ixor
    //   1130: goto -> 1141
    //   1133: ldc2_w 326921943
    //   1136: l2i
    //   1137: ldc_w 1483775841
    //   1140: ixor
    //   1141: ldc2_w 1215355890
    //   1144: l2i
    //   1145: ldc_w -720745556
    //   1148: ixor
    //   1149: ixor
    //   1150: lookupswitch default -> 8470, -696884760 -> 1176, 20754496 -> 1133
    //   1176: astore #7
    //   1178: getstatic Perryc.c : I
    //   1181: iflt -> 1195
    //   1184: ldc2_w 60724272
    //   1187: l2i
    //   1188: ldc_w 1102753918
    //   1191: ixor
    //   1192: goto -> 1203
    //   1195: ldc2_w -1434747222
    //   1198: l2i
    //   1199: ldc_w -421744700
    //   1202: ixor
    //   1203: ldc2_w 606820989
    //   1206: l2i
    //   1207: ldc_w 96770249
    //   1210: ixor
    //   1211: ixor
    //   1212: lookupswitch default -> 1240, 308173728 -> 1195, 1674307322 -> 8532
    //   1240: aload_0
    //   1241: getstatic Perryc.c : I
    //   1244: iflt -> 1258
    //   1247: ldc2_w 179998626
    //   1250: l2i
    //   1251: ldc_w -1432190175
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w 721896383
    //   1261: l2i
    //   1262: ldc_w 749747056
    //   1265: ixor
    //   1266: ldc2_w -1497517820
    //   1269: l2i
    //   1270: ldc_w -1078795016
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 8604, -1189652097 -> 1258, 515386675 -> 1300
    //   1300: getfield players : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1303: getstatic Perryc.1 : I
    //   1306: ifeq -> 1320
    //   1309: ldc2_w -210632166
    //   1312: l2i
    //   1313: ldc_w 2096978687
    //   1316: ixor
    //   1317: goto -> 1328
    //   1320: ldc2_w 213973542
    //   1323: l2i
    //   1324: ldc_w 60940727
    //   1327: ixor
    //   1328: ldc2_w -901940299
    //   1331: l2i
    //   1332: ldc_w -624997000
    //   1335: ixor
    //   1336: ixor
    //   1337: lookupswitch default -> 1364, -1626509784 -> 8578, -1098086709 -> 1320
    //   1364: goto -> 1368
    //   1367: athrow
    //   1368: invokevirtual getValue : ()Ljava/lang/Object;
    //   1371: goto -> 1375
    //   1374: athrow
    //   1375: checkcast java/lang/Boolean
    //   1378: getstatic Perryc.0 : I
    //   1381: ifle -> 1395
    //   1384: ldc2_w -447141616
    //   1387: l2i
    //   1388: ldc_w 257721647
    //   1391: ixor
    //   1392: goto -> 1403
    //   1395: ldc2_w 650617326
    //   1398: l2i
    //   1399: ldc_w 1559058752
    //   1402: ixor
    //   1403: ldc2_w -1224219143
    //   1406: l2i
    //   1407: ldc_w 1418499571
    //   1410: ixor
    //   1411: ixor
    //   1412: lookupswitch default -> 8516, -1717466972 -> 1440, 160357429 -> 1395
    //   1440: goto -> 1444
    //   1443: athrow
    //   1444: invokevirtual booleanValue : ()Z
    //   1447: goto -> 1451
    //   1450: athrow
    //   1451: ifeq -> 1465
    //   1454: ldc2_w -770939167
    //   1457: l2i
    //   1458: ldc_w -449529364
    //   1461: ixor
    //   1462: goto -> 1473
    //   1465: ldc2_w 835534573
    //   1468: l2i
    //   1469: ldc_w 116777441
    //   1472: ixor
    //   1473: ldc2_w 1194593145
    //   1476: l2i
    //   1477: ldc_w 1967644830
    //   1480: ixor
    //   1481: ixor
    //   1482: tableswitch default -> 1454, 88814826 -> 1504, 88814827 -> 1624
    //   1504: getstatic Perryc.c : I
    //   1507: iflt -> 1521
    //   1510: ldc2_w -36989256
    //   1513: l2i
    //   1514: ldc_w 1228979521
    //   1517: ixor
    //   1518: goto -> 1529
    //   1521: ldc2_w 781956624
    //   1524: l2i
    //   1525: ldc_w 867483345
    //   1528: ixor
    //   1529: ldc2_w 1373628186
    //   1532: l2i
    //   1533: ldc_w -455836803
    //   1536: ixor
    //   1537: ixor
    //   1538: lookupswitch default -> 1564, 25212830 -> 8582, 1574596195 -> 1521
    //   1564: aload #7
    //   1566: instanceof net/minecraft/entity/player/EntityPlayer
    //   1569: ifne -> 1583
    //   1572: ldc2_w 139627104
    //   1575: l2i
    //   1576: ldc_w -2132377607
    //   1579: ixor
    //   1580: goto -> 1591
    //   1583: ldc2_w 1978955524
    //   1586: l2i
    //   1587: ldc_w -46103908
    //   1590: ixor
    //   1591: ldc2_w -792407836
    //   1594: l2i
    //   1595: ldc_w 1592560967
    //   1598: ixor
    //   1599: ixor
    //   1600: tableswitch default -> 1572, 110929978 -> 1624, 110929979 -> 3672
    //   1624: getstatic Perryc.c : I
    //   1627: iflt -> 1641
    //   1630: ldc2_w -338083917
    //   1633: l2i
    //   1634: ldc_w -299824370
    //   1637: ixor
    //   1638: goto -> 1649
    //   1641: ldc2_w 1009958622
    //   1644: l2i
    //   1645: ldc_w -1137737255
    //   1648: ixor
    //   1649: ldc2_w 1043901532
    //   1652: l2i
    //   1653: ldc_w 1503886908
    //   1656: ixor
    //   1657: ixor
    //   1658: lookupswitch default -> 1684, -2095971237 -> 1641, 1650714333 -> 8628
    //   1684: aload_0
    //   1685: getstatic Perryc.0 : I
    //   1688: ifle -> 1702
    //   1691: ldc2_w -1381521538
    //   1694: l2i
    //   1695: ldc_w 117742621
    //   1698: ixor
    //   1699: goto -> 1710
    //   1702: ldc2_w -221994330
    //   1705: l2i
    //   1706: ldc_w -1807266474
    //   1709: ixor
    //   1710: ldc2_w 2009501689
    //   1713: l2i
    //   1714: ldc_w -541758093
    //   1717: ixor
    //   1718: ixor
    //   1719: lookupswitch default -> 1744, -1100138956 -> 1702, 47241705 -> 8450
    //   1744: getfield animals : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1747: getstatic Perryc.0 : I
    //   1750: ifle -> 1764
    //   1753: ldc2_w -419653452
    //   1756: l2i
    //   1757: ldc_w 469565905
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 511857227
    //   1767: l2i
    //   1768: ldc_w -1341220083
    //   1771: ixor
    //   1772: ldc2_w -1198489696
    //   1775: l2i
    //   1776: ldc_w 545358982
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 1808, -145306385 -> 1764, 1695572547 -> 8442
    //   1808: goto -> 1812
    //   1811: athrow
    //   1812: invokevirtual getValue : ()Ljava/lang/Object;
    //   1815: goto -> 1819
    //   1818: athrow
    //   1819: checkcast java/lang/Boolean
    //   1822: getstatic Perryc.1 : I
    //   1825: ifeq -> 1839
    //   1828: ldc2_w -1936663979
    //   1831: l2i
    //   1832: ldc_w 2134996936
    //   1835: ixor
    //   1836: goto -> 1847
    //   1839: ldc2_w 1124287969
    //   1842: l2i
    //   1843: ldc_w -1200211883
    //   1846: ixor
    //   1847: ldc2_w -685478299
    //   1850: l2i
    //   1851: ldc_w -1805586444
    //   1854: ixor
    //   1855: ixor
    //   1856: lookupswitch default -> 1884, -1332401140 -> 8576, 79960016 -> 1839
    //   1884: goto -> 1888
    //   1887: athrow
    //   1888: invokevirtual booleanValue : ()Z
    //   1891: goto -> 1895
    //   1894: athrow
    //   1895: ifeq -> 1909
    //   1898: ldc2_w -1651587681
    //   1901: l2i
    //   1902: ldc_w -1877783146
    //   1905: ixor
    //   1906: goto -> 1917
    //   1909: ldc2_w -1605324944
    //   1912: l2i
    //   1913: ldc_w -1379063944
    //   1916: ixor
    //   1917: ldc2_w 268779910
    //   1920: l2i
    //   1921: ldc_w -409307401
    //   1924: ixor
    //   1925: ixor
    //   1926: tableswitch default -> 1898, -100483208 -> 1948, -100483207 -> 2136
    //   1948: getstatic Perryc.0 : I
    //   1951: ifle -> 1965
    //   1954: ldc2_w -1856390075
    //   1957: l2i
    //   1958: ldc_w -1578714759
    //   1961: ixor
    //   1962: goto -> 1973
    //   1965: ldc2_w -129329855
    //   1968: l2i
    //   1969: ldc_w 73862080
    //   1972: ixor
    //   1973: ldc2_w -1066176628
    //   1976: l2i
    //   1977: ldc_w -416672554
    //   1980: ixor
    //   1981: ixor
    //   1982: lookupswitch default -> 8430, -613095973 -> 2008, 400981606 -> 1965
    //   2008: aload #7
    //   2010: getstatic Perryc.c : I
    //   2013: iflt -> 2027
    //   2016: ldc2_w -710472976
    //   2019: l2i
    //   2020: ldc_w -765000844
    //   2023: ixor
    //   2024: goto -> 2035
    //   2027: ldc2_w -81505037
    //   2030: l2i
    //   2031: ldc_w 63735810
    //   2034: ixor
    //   2035: ldc2_w -1228769637
    //   2038: l2i
    //   2039: ldc_w -1722128667
    //   2042: ixor
    //   2043: ixor
    //   2044: lookupswitch default -> 8428, -680473457 -> 2072, 676862458 -> 2027
    //   2072: goto -> 2076
    //   2075: athrow
    //   2076: invokestatic isPassive : (Lnet/minecraft/entity/Entity;)Z
    //   2079: goto -> 2083
    //   2082: athrow
    //   2083: ifne -> 2097
    //   2086: ldc2_w 1452385136
    //   2089: l2i
    //   2090: ldc_w 1857791353
    //   2093: ixor
    //   2094: goto -> 2105
    //   2097: ldc2_w -308770721
    //   2100: l2i
    //   2101: ldc_w -709718441
    //   2104: ixor
    //   2105: ldc2_w -50710966
    //   2108: l2i
    //   2109: ldc_w 1783890953
    //   2112: ixor
    //   2113: ixor
    //   2114: tableswitch default -> 2086, -1367067574 -> 2136, -1367067573 -> 3672
    //   2136: getstatic Perryc.0 : I
    //   2139: ifle -> 2153
    //   2142: ldc2_w -923467831
    //   2145: l2i
    //   2146: ldc_w 1479992972
    //   2149: ixor
    //   2150: goto -> 2161
    //   2153: ldc2_w 1047848645
    //   2156: l2i
    //   2157: ldc_w -361589112
    //   2160: ixor
    //   2161: ldc2_w -13874740
    //   2164: l2i
    //   2165: ldc_w 1265533071
    //   2168: ixor
    //   2169: ixor
    //   2170: lookupswitch default -> 8492, 612421638 -> 2153, 1615116558 -> 2196
    //   2196: aload_0
    //   2197: getstatic Perryc.c : I
    //   2200: iflt -> 2214
    //   2203: ldc2_w 1059528551
    //   2206: l2i
    //   2207: ldc_w 651148771
    //   2210: ixor
    //   2211: goto -> 2222
    //   2214: ldc2_w 1726613468
    //   2217: l2i
    //   2218: ldc_w -1368291106
    //   2221: ixor
    //   2222: ldc2_w 514740797
    //   2225: l2i
    //   2226: ldc_w 1377491207
    //   2229: ixor
    //   2230: ixor
    //   2231: lookupswitch default -> 2256, -679610705 -> 2214, 1432103358 -> 8592
    //   2256: getfield mobs : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2259: getstatic Perryc.0 : I
    //   2262: ifle -> 2276
    //   2265: ldc2_w 134015889
    //   2268: l2i
    //   2269: ldc_w -886722449
    //   2272: ixor
    //   2273: goto -> 2284
    //   2276: ldc2_w 535926278
    //   2279: l2i
    //   2280: ldc_w 1990673820
    //   2283: ixor
    //   2284: ldc2_w -315886747
    //   2287: l2i
    //   2288: ldc_w -294801166
    //   2291: ixor
    //   2292: ixor
    //   2293: lookupswitch default -> 8560, -811657111 -> 2276, 1779470349 -> 2320
    //   2320: goto -> 2324
    //   2323: athrow
    //   2324: invokevirtual getValue : ()Ljava/lang/Object;
    //   2327: goto -> 2331
    //   2330: athrow
    //   2331: checkcast java/lang/Boolean
    //   2334: getstatic Perryc.1 : I
    //   2337: ifeq -> 2351
    //   2340: ldc2_w -156851635
    //   2343: l2i
    //   2344: ldc_w -1614946155
    //   2347: ixor
    //   2348: goto -> 2359
    //   2351: ldc2_w -265903808
    //   2354: l2i
    //   2355: ldc_w 1805872737
    //   2358: ixor
    //   2359: ldc2_w 1182021327
    //   2362: l2i
    //   2363: ldc_w 1875809271
    //   2366: ixor
    //   2367: ixor
    //   2368: lookupswitch default -> 8462, -1304466919 -> 2396, 1084352480 -> 2351
    //   2396: goto -> 2400
    //   2399: athrow
    //   2400: invokevirtual booleanValue : ()Z
    //   2403: goto -> 2407
    //   2406: athrow
    //   2407: ifeq -> 2421
    //   2410: ldc2_w 1900987815
    //   2413: l2i
    //   2414: ldc_w -580410932
    //   2417: ixor
    //   2418: goto -> 2429
    //   2421: ldc2_w -517935654
    //   2424: l2i
    //   2425: ldc_w 1292470704
    //   2428: ixor
    //   2429: ldc2_w -880627755
    //   2432: l2i
    //   2433: ldc_w 1626349086
    //   2436: ixor
    //   2437: ixor
    //   2438: tableswitch default -> 2410, 123458976 -> 2460, 123458977 -> 2648
    //   2460: getstatic Perryc.0 : I
    //   2463: ifle -> 2477
    //   2466: ldc2_w 715027832
    //   2469: l2i
    //   2470: ldc_w -1038845076
    //   2473: ixor
    //   2474: goto -> 2485
    //   2477: ldc2_w -515144841
    //   2480: l2i
    //   2481: ldc_w 1708917369
    //   2484: ixor
    //   2485: ldc2_w 2024516706
    //   2488: l2i
    //   2489: ldc_w -1166384812
    //   2492: ixor
    //   2493: ixor
    //   2494: lookupswitch default -> 2520, -1166600856 -> 2477, 710656802 -> 8418
    //   2520: aload #7
    //   2522: getstatic Perryc.0 : I
    //   2525: ifle -> 2539
    //   2528: ldc2_w -271428234
    //   2531: l2i
    //   2532: ldc_w -1818112331
    //   2535: ixor
    //   2536: goto -> 2547
    //   2539: ldc2_w 491079630
    //   2542: l2i
    //   2543: ldc_w -1420676490
    //   2546: ixor
    //   2547: ldc2_w -1043374313
    //   2550: l2i
    //   2551: ldc_w -307481991
    //   2554: ixor
    //   2555: ixor
    //   2556: lookupswitch default -> 8558, -1703667498 -> 2584, 1343289005 -> 2539
    //   2584: goto -> 2588
    //   2587: athrow
    //   2588: invokestatic isMobAggressive : (Lnet/minecraft/entity/Entity;)Z
    //   2591: goto -> 2595
    //   2594: athrow
    //   2595: ifne -> 2609
    //   2598: ldc2_w -757425146
    //   2601: l2i
    //   2602: ldc_w 1182862401
    //   2605: ixor
    //   2606: goto -> 2617
    //   2609: ldc2_w -1157881939
    //   2612: l2i
    //   2613: ldc_w 782733293
    //   2616: ixor
    //   2617: ldc2_w -1702984776
    //   2620: l2i
    //   2621: ldc_w 519428764
    //   2624: ixor
    //   2625: ixor
    //   2626: tableswitch default -> 2598, 282118499 -> 2648, 282118500 -> 3672
    //   2648: getstatic Perryc.0 : I
    //   2651: ifle -> 2665
    //   2654: ldc2_w 1589643891
    //   2657: l2i
    //   2658: ldc_w 1474890381
    //   2661: ixor
    //   2662: goto -> 2673
    //   2665: ldc2_w 1567468558
    //   2668: l2i
    //   2669: ldc_w 914112491
    //   2672: ixor
    //   2673: ldc2_w 517050175
    //   2676: l2i
    //   2677: ldc_w -1373960985
    //   2680: ixor
    //   2681: ixor
    //   2682: lookupswitch default -> 2708, -1679517126 -> 2665, -1176270042 -> 8446
    //   2708: aload_0
    //   2709: getstatic Perryc.c : I
    //   2712: iflt -> 2726
    //   2715: ldc2_w 1101163338
    //   2718: l2i
    //   2719: ldc_w 127063731
    //   2722: ixor
    //   2723: goto -> 2734
    //   2726: ldc2_w -411774274
    //   2729: l2i
    //   2730: ldc_w 537238551
    //   2733: ixor
    //   2734: ldc2_w -1512628757
    //   2737: l2i
    //   2738: ldc_w -233905868
    //   2741: ixor
    //   2742: ixor
    //   2743: lookupswitch default -> 8540, -1867992458 -> 2768, 300499238 -> 2726
    //   2768: getfield vehicles : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2771: getstatic Perryc.1 : I
    //   2774: ifeq -> 2788
    //   2777: ldc2_w 1557108239
    //   2780: l2i
    //   2781: ldc_w -238787270
    //   2784: ixor
    //   2785: goto -> 2796
    //   2788: ldc2_w -87892089
    //   2791: l2i
    //   2792: ldc_w -1338065817
    //   2795: ixor
    //   2796: ldc2_w -743634527
    //   2799: l2i
    //   2800: ldc_w -2024759702
    //   2803: ixor
    //   2804: ixor
    //   2805: lookupswitch default -> 2832, -1207237879 -> 2788, -101292802 -> 8410
    //   2832: goto -> 2836
    //   2835: athrow
    //   2836: invokevirtual getValue : ()Ljava/lang/Object;
    //   2839: goto -> 2843
    //   2842: athrow
    //   2843: checkcast java/lang/Boolean
    //   2846: getstatic Perryc.1 : I
    //   2849: ifeq -> 2863
    //   2852: ldc2_w -574326183
    //   2855: l2i
    //   2856: ldc_w -497101888
    //   2859: ixor
    //   2860: goto -> 2871
    //   2863: ldc2_w 774338928
    //   2866: l2i
    //   2867: ldc_w -1897626941
    //   2870: ixor
    //   2871: ldc2_w -73274483
    //   2874: l2i
    //   2875: ldc_w -1916182703
    //   2878: ixor
    //   2879: ixor
    //   2880: lookupswitch default -> 8494, -693416081 -> 2908, 1240603973 -> 2863
    //   2908: goto -> 2912
    //   2911: athrow
    //   2912: invokevirtual booleanValue : ()Z
    //   2915: goto -> 2919
    //   2918: athrow
    //   2919: ifeq -> 2933
    //   2922: ldc2_w -1928635329
    //   2925: l2i
    //   2926: ldc_w 426464775
    //   2929: ixor
    //   2930: goto -> 2941
    //   2933: ldc2_w 1731717922
    //   2936: l2i
    //   2937: ldc_w -212344549
    //   2940: ixor
    //   2941: ldc2_w -1389316240
    //   2944: l2i
    //   2945: ldc_w -1822401298
    //   2948: ixor
    //   2949: ixor
    //   2950: tableswitch default -> 2922, -1439637082 -> 2972, -1439637081 -> 3160
    //   2972: getstatic Perryc.0 : I
    //   2975: ifle -> 2989
    //   2978: ldc2_w -883122196
    //   2981: l2i
    //   2982: ldc_w -1930266081
    //   2985: ixor
    //   2986: goto -> 2997
    //   2989: ldc2_w -851011427
    //   2992: l2i
    //   2993: ldc_w 2130880574
    //   2996: ixor
    //   2997: ldc2_w -1731286056
    //   3000: l2i
    //   3001: ldc_w 987723618
    //   3004: ixor
    //   3005: ixor
    //   3006: lookupswitch default -> 3032, -440452791 -> 8606, 747398771 -> 2989
    //   3032: aload #7
    //   3034: getstatic Perryc.1 : I
    //   3037: ifeq -> 3051
    //   3040: ldc2_w -845281470
    //   3043: l2i
    //   3044: ldc_w -691789945
    //   3047: ixor
    //   3048: goto -> 3059
    //   3051: ldc2_w 1086778694
    //   3054: l2i
    //   3055: ldc_w 1505270279
    //   3058: ixor
    //   3059: ldc2_w 1311670530
    //   3062: l2i
    //   3063: ldc_w -2072488144
    //   3066: ixor
    //   3067: ixor
    //   3068: lookupswitch default -> 3096, -1992402705 -> 3051, -787689737 -> 8526
    //   3096: goto -> 3100
    //   3099: athrow
    //   3100: invokestatic isVehicle : (Lnet/minecraft/entity/Entity;)Z
    //   3103: goto -> 3107
    //   3106: athrow
    //   3107: ifne -> 3121
    //   3110: ldc2_w 510675246
    //   3113: l2i
    //   3114: ldc_w -737921080
    //   3117: ixor
    //   3118: goto -> 3129
    //   3121: ldc2_w -559845710
    //   3124: l2i
    //   3125: ldc_w 349507669
    //   3128: ixor
    //   3129: ldc2_w -43593370
    //   3132: l2i
    //   3133: ldc_w -329297268
    //   3136: ixor
    //   3137: ixor
    //   3138: tableswitch default -> 3110, -615645940 -> 3160, -615645939 -> 3672
    //   3160: getstatic Perryc.1 : I
    //   3163: ifeq -> 3177
    //   3166: ldc2_w -278608700
    //   3169: l2i
    //   3170: ldc_w -986666462
    //   3173: ixor
    //   3174: goto -> 3185
    //   3177: ldc2_w -2088750489
    //   3180: l2i
    //   3181: ldc_w -79724092
    //   3184: ixor
    //   3185: ldc2_w -1167092944
    //   3188: l2i
    //   3189: ldc_w 344433406
    //   3192: ixor
    //   3193: ixor
    //   3194: lookupswitch default -> 8610, -2068029656 -> 3177, -698908051 -> 3220
    //   3220: aload_0
    //   3221: getstatic Perryc.0 : I
    //   3224: ifle -> 3238
    //   3227: ldc2_w -1069316244
    //   3230: l2i
    //   3231: ldc_w 940977219
    //   3234: ixor
    //   3235: goto -> 3246
    //   3238: ldc2_w -1740428432
    //   3241: l2i
    //   3242: ldc_w 8076934
    //   3245: ixor
    //   3246: ldc2_w 274701697
    //   3249: l2i
    //   3250: ldc_w 469281634
    //   3253: ixor
    //   3254: ixor
    //   3255: lookupswitch default -> 8458, -1818287339 -> 3280, -202203700 -> 3238
    //   3280: getfield projectiles : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3283: getstatic Perryc.1 : I
    //   3286: ifeq -> 3300
    //   3289: ldc2_w -2012916418
    //   3292: l2i
    //   3293: ldc_w -1702918508
    //   3296: ixor
    //   3297: goto -> 3308
    //   3300: ldc2_w -86552639
    //   3303: l2i
    //   3304: ldc_w 1294438606
    //   3307: ixor
    //   3308: ldc2_w -1116511801
    //   3311: l2i
    //   3312: ldc_w -1621511565
    //   3315: ixor
    //   3316: ixor
    //   3317: lookupswitch default -> 8612, -1780872005 -> 3344, 810549278 -> 3300
    //   3344: goto -> 3348
    //   3347: athrow
    //   3348: invokevirtual getValue : ()Ljava/lang/Object;
    //   3351: goto -> 3355
    //   3354: athrow
    //   3355: checkcast java/lang/Boolean
    //   3358: getstatic Perryc.c : I
    //   3361: iflt -> 3375
    //   3364: ldc2_w 1996583302
    //   3367: l2i
    //   3368: ldc_w -302709722
    //   3371: ixor
    //   3372: goto -> 3383
    //   3375: ldc2_w -845152962
    //   3378: l2i
    //   3379: ldc_w -1692278901
    //   3382: ixor
    //   3383: ldc2_w 1598088908
    //   3386: l2i
    //   3387: ldc_w 673070876
    //   3390: ixor
    //   3391: ixor
    //   3392: lookupswitch default -> 8476, -307581840 -> 3375, 568392549 -> 3420
    //   3420: goto -> 3424
    //   3423: athrow
    //   3424: invokevirtual booleanValue : ()Z
    //   3427: goto -> 3431
    //   3430: athrow
    //   3431: ifeq -> 3445
    //   3434: ldc2_w -1538298541
    //   3437: l2i
    //   3438: ldc_w 1704956534
    //   3441: ixor
    //   3442: goto -> 3453
    //   3445: ldc2_w 1585963256
    //   3448: l2i
    //   3449: ldc_w -1621680162
    //   3452: ixor
    //   3453: ldc2_w 1600658686
    //   3456: l2i
    //   3457: ldc_w 1058776814
    //   3460: ixor
    //   3461: ixor
    //   3462: tableswitch default -> 3434, -1583135435 -> 3484, -1583135434 -> 790
    //   3484: getstatic Perryc.1 : I
    //   3487: ifeq -> 3501
    //   3490: ldc2_w -1143841972
    //   3493: l2i
    //   3494: ldc_w 1956113622
    //   3497: ixor
    //   3498: goto -> 3509
    //   3501: ldc2_w -1292298219
    //   3504: l2i
    //   3505: ldc_w 294151683
    //   3508: ixor
    //   3509: ldc2_w -459928395
    //   3512: l2i
    //   3513: ldc_w 326827283
    //   3516: ixor
    //   3517: ixor
    //   3518: lookupswitch default -> 8588, 950617660 -> 3501, 1419612080 -> 3544
    //   3544: aload #7
    //   3546: getstatic Perryc.c : I
    //   3549: iflt -> 3563
    //   3552: ldc2_w -1759862953
    //   3555: l2i
    //   3556: ldc_w -1034942698
    //   3559: ixor
    //   3560: goto -> 3571
    //   3563: ldc2_w -79951717
    //   3566: l2i
    //   3567: ldc_w 205499454
    //   3570: ixor
    //   3571: ldc2_w 175693947
    //   3574: l2i
    //   3575: ldc_w 1028935436
    //   3578: ixor
    //   3579: ixor
    //   3580: lookupswitch default -> 3608, -346572393 -> 3563, 1650865974 -> 8618
    //   3608: goto -> 3612
    //   3611: athrow
    //   3612: invokestatic isProjectile : (Lnet/minecraft/entity/Entity;)Z
    //   3615: goto -> 3619
    //   3618: athrow
    //   3619: ifeq -> 3633
    //   3622: ldc2_w -1981666380
    //   3625: l2i
    //   3626: ldc_w 884374575
    //   3629: ixor
    //   3630: goto -> 3641
    //   3633: ldc2_w -1402603621
    //   3636: l2i
    //   3637: ldc_w 288464899
    //   3640: ixor
    //   3641: ldc2_w -879329802
    //   3644: l2i
    //   3645: ldc_w -1499538004
    //   3648: ixor
    //   3649: ixor
    //   3650: tableswitch default -> 3622, -799213631 -> 3672, -799213630 -> 790
    //   3672: getstatic Perryc.0 : I
    //   3675: ifle -> 3689
    //   3678: ldc2_w -1291654689
    //   3681: l2i
    //   3682: ldc_w 2015756645
    //   3685: ixor
    //   3686: goto -> 3697
    //   3689: ldc2_w -130636178
    //   3692: l2i
    //   3693: ldc_w -999216171
    //   3696: ixor
    //   3697: ldc2_w 1235494689
    //   3700: l2i
    //   3701: ldc_w -2120425383
    //   3704: ixor
    //   3705: ixor
    //   3706: lookupswitch default -> 8562, -192984381 -> 3732, 52178882 -> 3689
    //   3732: aload #7
    //   3734: instanceof net/minecraft/entity/EntityLivingBase
    //   3737: ifeq -> 3751
    //   3740: ldc2_w -473774020
    //   3743: l2i
    //   3744: ldc_w -1480827571
    //   3747: ixor
    //   3748: goto -> 3759
    //   3751: ldc2_w -590499297
    //   3754: l2i
    //   3755: ldc_w -1733089439
    //   3758: ixor
    //   3759: ldc2_w 942526944
    //   3762: l2i
    //   3763: ldc_w -1295366906
    //   3766: ixor
    //   3767: ixor
    //   3768: tableswitch default -> 3740, -828833385 -> 3792, -828833384 -> 4043
    //   3792: getstatic Perryc.0 : I
    //   3795: ifle -> 3809
    //   3798: ldc2_w -1792236973
    //   3801: l2i
    //   3802: ldc_w 1093727938
    //   3805: ixor
    //   3806: goto -> 3817
    //   3809: ldc2_w 568661524
    //   3812: l2i
    //   3813: ldc_w -387269447
    //   3816: ixor
    //   3817: ldc2_w 137674994
    //   3820: l2i
    //   3821: ldc_w 1783485686
    //   3824: ixor
    //   3825: ixor
    //   3826: lookupswitch default -> 3852, -1234878315 -> 8488, 1779292457 -> 3809
    //   3852: aload #7
    //   3854: getstatic Perryc.0 : I
    //   3857: ifle -> 3871
    //   3860: ldc2_w 2073069726
    //   3863: l2i
    //   3864: ldc_w -1719348411
    //   3867: ixor
    //   3868: goto -> 3879
    //   3871: ldc2_w 1001488581
    //   3874: l2i
    //   3875: ldc_w -1004939316
    //   3878: ixor
    //   3879: ldc2_w 1101006301
    //   3882: l2i
    //   3883: ldc_w -1911707687
    //   3886: ixor
    //   3887: ixor
    //   3888: lookupswitch default -> 8596, 767162847 -> 3871, 805696781 -> 3916
    //   3916: dload_2
    //   3917: getstatic Perryc.0 : I
    //   3920: ifle -> 3934
    //   3923: ldc2_w -982265393
    //   3926: l2i
    //   3927: ldc_w -1751291619
    //   3930: ixor
    //   3931: goto -> 3942
    //   3934: ldc2_w -1376922462
    //   3937: l2i
    //   3938: ldc_w -1150076419
    //   3941: ixor
    //   3942: ldc2_w 1049032570
    //   3945: l2i
    //   3946: ldc_w -1881309463
    //   3949: ixor
    //   3950: ixor
    //   3951: lookupswitch default -> 8546, -1480235828 -> 3976, -474664639 -> 3934
    //   3976: goto -> 3980
    //   3979: athrow
    //   3980: invokestatic isntValid : (Lnet/minecraft/entity/Entity;D)Z
    //   3983: goto -> 3987
    //   3986: athrow
    //   3987: ifeq -> 4001
    //   3990: ldc2_w 1456154338
    //   3993: l2i
    //   3994: ldc_w -1687109277
    //   3997: ixor
    //   3998: goto -> 4009
    //   4001: ldc2_w 908969422
    //   4004: l2i
    //   4005: ldc_w -74046900
    //   4008: ixor
    //   4009: ldc2_w -616947667
    //   4012: l2i
    //   4013: ldc_w -158125999
    //   4016: ixor
    //   4017: ixor
    //   4018: tableswitch default -> 3990, -535627779 -> 4040, -535627778 -> 4043
    //   4040: goto -> 790
    //   4043: getstatic Perryc.1 : I
    //   4046: ifeq -> 4060
    //   4049: ldc2_w 2057508081
    //   4052: l2i
    //   4053: ldc_w 1345692340
    //   4056: ixor
    //   4057: goto -> 4068
    //   4060: ldc2_w 176214634
    //   4063: l2i
    //   4064: ldc_w 503601654
    //   4067: ixor
    //   4068: ldc2_w -752183877
    //   4071: l2i
    //   4072: ldc_w -310365105
    //   4075: ixor
    //   4076: ixor
    //   4077: lookupswitch default -> 8552, 339482545 -> 4060, 707668584 -> 4104
    //   4104: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   4107: getstatic Perryc.1 : I
    //   4110: ifeq -> 4124
    //   4113: ldc2_w -888437473
    //   4116: l2i
    //   4117: ldc_w -282041109
    //   4120: ixor
    //   4121: goto -> 4132
    //   4124: ldc2_w -1798148161
    //   4127: l2i
    //   4128: ldc_w 172302259
    //   4131: ixor
    //   4132: ldc2_w 1548462559
    //   4135: l2i
    //   4136: ldc_w -1319374041
    //   4139: ixor
    //   4140: ixor
    //   4141: lookupswitch default -> 4168, -919880948 -> 8506, -607830952 -> 4124
    //   4168: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4171: getstatic Perryc.0 : I
    //   4174: ifle -> 4188
    //   4177: ldc2_w 1943625267
    //   4180: l2i
    //   4181: ldc_w -1661282683
    //   4184: ixor
    //   4185: goto -> 4196
    //   4188: ldc2_w -591593377
    //   4191: l2i
    //   4192: ldc_w 1613164966
    //   4195: ixor
    //   4196: ldc2_w -1677035584
    //   4199: l2i
    //   4200: ldc_w -1774186679
    //   4203: ixor
    //   4204: ixor
    //   4205: lookupswitch default -> 4232, -610318432 -> 4188, -446042049 -> 8444
    //   4232: aload #7
    //   4234: getstatic Perryc.0 : I
    //   4237: ifle -> 4251
    //   4240: ldc2_w -254416542
    //   4243: l2i
    //   4244: ldc_w 1999493623
    //   4247: ixor
    //   4248: goto -> 4259
    //   4251: ldc2_w -305248732
    //   4254: l2i
    //   4255: ldc_w -855429947
    //   4258: ixor
    //   4259: ldc2_w 1710306133
    //   4262: l2i
    //   4263: ldc_w 381291082
    //   4266: ixor
    //   4267: ixor
    //   4268: lookupswitch default -> 4296, -865176005 -> 4251, -189593206 -> 8572
    //   4296: goto -> 4300
    //   4299: athrow
    //   4300: invokevirtual func_70685_l : (Lnet/minecraft/entity/Entity;)Z
    //   4303: goto -> 4307
    //   4306: athrow
    //   4307: ifne -> 4321
    //   4310: ldc2_w 549269074
    //   4313: l2i
    //   4314: ldc_w 839571382
    //   4317: ixor
    //   4318: goto -> 4329
    //   4321: ldc2_w -1926121699
    //   4324: l2i
    //   4325: ldc_w -1618587906
    //   4328: ixor
    //   4329: ldc2_w -1418395271
    //   4332: l2i
    //   4333: ldc_w -1142394482
    //   4336: ixor
    //   4337: ixor
    //   4338: tableswitch default -> 4310, 36342035 -> 4360, 36342036 -> 5211
    //   4360: getstatic Perryc.c : I
    //   4363: iflt -> 4377
    //   4366: ldc2_w -341302430
    //   4369: l2i
    //   4370: ldc_w 1047548204
    //   4373: ixor
    //   4374: goto -> 4385
    //   4377: ldc2_w -1024836872
    //   4380: l2i
    //   4381: ldc_w 239233077
    //   4384: ixor
    //   4385: ldc2_w -259695970
    //   4388: l2i
    //   4389: ldc_w 1939269638
    //   4392: ixor
    //   4393: ixor
    //   4394: lookupswitch default -> 8496, 1337712725 -> 4420, 1456193750 -> 4377
    //   4420: aload #7
    //   4422: getstatic Perryc.0 : I
    //   4425: ifle -> 4439
    //   4428: ldc2_w 932812577
    //   4431: l2i
    //   4432: ldc_w 1176309846
    //   4435: ixor
    //   4436: goto -> 4447
    //   4439: ldc2_w 455251287
    //   4442: l2i
    //   4443: ldc_w -1779673215
    //   4446: ixor
    //   4447: ldc2_w 2014496032
    //   4450: l2i
    //   4451: ldc_w -1928390745
    //   4454: ixor
    //   4455: ixor
    //   4456: lookupswitch default -> 8498, -2070325776 -> 4439, 2077429841 -> 4484
    //   4484: goto -> 4488
    //   4487: athrow
    //   4488: invokestatic canEntityFeetBeSeen : (Lnet/minecraft/entity/Entity;)Z
    //   4491: goto -> 4495
    //   4494: athrow
    //   4495: ifne -> 4509
    //   4498: ldc2_w 1151704939
    //   4501: l2i
    //   4502: ldc_w 1487780735
    //   4505: ixor
    //   4506: goto -> 4517
    //   4509: ldc2_w 55381859
    //   4512: l2i
    //   4513: ldc_w 524626806
    //   4516: ixor
    //   4517: ldc2_w 1553906007
    //   4520: l2i
    //   4521: ldc_w -1818297177
    //   4524: ixor
    //   4525: ixor
    //   4526: tableswitch default -> 4498, -754425372 -> 4548, -754425371 -> 5211
    //   4548: getstatic Perryc.c : I
    //   4551: iflt -> 4565
    //   4554: ldc2_w -894315867
    //   4557: l2i
    //   4558: ldc_w 20046422
    //   4561: ixor
    //   4562: goto -> 4573
    //   4565: ldc2_w -506633753
    //   4568: l2i
    //   4569: ldc_w 1745502160
    //   4572: ixor
    //   4573: ldc2_w 1112477931
    //   4576: l2i
    //   4577: ldc_w -844953282
    //   4580: ixor
    //   4581: ixor
    //   4582: lookupswitch default -> 4608, -1329875105 -> 4565, 1147939110 -> 8508
    //   4608: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   4611: getstatic Perryc.c : I
    //   4614: iflt -> 4628
    //   4617: ldc2_w 1721763979
    //   4620: l2i
    //   4621: ldc_w -1889214091
    //   4624: ixor
    //   4625: goto -> 4636
    //   4628: ldc2_w -1274197666
    //   4631: l2i
    //   4632: ldc_w 707641623
    //   4635: ixor
    //   4636: ldc2_w 971003402
    //   4639: l2i
    //   4640: ldc_w 544378873
    //   4643: ixor
    //   4644: ixor
    //   4645: lookupswitch default -> 4672, -262787059 -> 8464, -259210237 -> 4628
    //   4672: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4675: getstatic Perryc.1 : I
    //   4678: ifeq -> 4692
    //   4681: ldc2_w -1485875815
    //   4684: l2i
    //   4685: ldc_w 1048951471
    //   4688: ixor
    //   4689: goto -> 4700
    //   4692: ldc2_w -14578379
    //   4695: l2i
    //   4696: ldc_w -1160974790
    //   4699: ixor
    //   4700: ldc2_w 78375451
    //   4703: l2i
    //   4704: ldc_w 535226984
    //   4707: ixor
    //   4708: ixor
    //   4709: lookupswitch default -> 8570, -2102923451 -> 4692, 1587569532 -> 4736
    //   4736: aload #7
    //   4738: getstatic Perryc.1 : I
    //   4741: ifeq -> 4755
    //   4744: ldc2_w 875790746
    //   4747: l2i
    //   4748: ldc_w -1749460226
    //   4751: ixor
    //   4752: goto -> 4763
    //   4755: ldc2_w 138230975
    //   4758: l2i
    //   4759: ldc_w -1496006167
    //   4762: ixor
    //   4763: ldc2_w 431878294
    //   4766: l2i
    //   4767: ldc_w 313987056
    //   4770: ixor
    //   4771: ixor
    //   4772: lookupswitch default -> 4800, -1467997182 -> 8422, 1944719861 -> 4755
    //   4800: goto -> 4804
    //   4803: athrow
    //   4804: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   4807: goto -> 4811
    //   4810: athrow
    //   4811: getstatic Perryc.1 : I
    //   4814: ifeq -> 4828
    //   4817: ldc2_w 416870000
    //   4820: l2i
    //   4821: ldc_w 761872432
    //   4824: ixor
    //   4825: goto -> 4836
    //   4828: ldc2_w 111149599
    //   4831: l2i
    //   4832: ldc_w 577998049
    //   4835: ixor
    //   4836: ldc2_w -1418815550
    //   4839: l2i
    //   4840: ldc_w 688718174
    //   4843: ixor
    //   4844: ixor
    //   4845: lookupswitch default -> 4872, -1210959652 -> 8466, 2088700517 -> 4828
    //   4872: aload_0
    //   4873: getstatic Perryc.c : I
    //   4876: iflt -> 4890
    //   4879: ldc2_w 1448291494
    //   4882: l2i
    //   4883: ldc_w 1891528393
    //   4886: ixor
    //   4887: goto -> 4898
    //   4890: ldc2_w 2077515311
    //   4893: l2i
    //   4894: ldc_w -475326886
    //   4897: ixor
    //   4898: ldc2_w -1257497637
    //   4901: l2i
    //   4902: ldc_w 807331230
    //   4905: ixor
    //   4906: ixor
    //   4907: lookupswitch default -> 8528, -1543521238 -> 4890, 493729328 -> 4932
    //   4932: getfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4935: getstatic Perryc.1 : I
    //   4938: ifeq -> 4952
    //   4941: ldc2_w -61316767
    //   4944: l2i
    //   4945: ldc_w -177580438
    //   4948: ixor
    //   4949: goto -> 4960
    //   4952: ldc2_w 1720190415
    //   4955: l2i
    //   4956: ldc_w 740512266
    //   4959: ixor
    //   4960: ldc2_w 1460071019
    //   4963: l2i
    //   4964: ldc_w -2134322462
    //   4967: ixor
    //   4968: ixor
    //   4969: lookupswitch default -> 4996, -1895674539 -> 4952, -553906302 -> 8566
    //   4996: goto -> 5000
    //   4999: athrow
    //   5000: invokevirtual getValue : ()Ljava/lang/Object;
    //   5003: goto -> 5007
    //   5006: athrow
    //   5007: checkcast java/lang/Float
    //   5010: getstatic Perryc.1 : I
    //   5013: ifeq -> 5027
    //   5016: ldc2_w 598595251
    //   5019: l2i
    //   5020: ldc_w -476228233
    //   5023: ixor
    //   5024: goto -> 5035
    //   5027: ldc2_w 720397536
    //   5030: l2i
    //   5031: ldc_w 960975278
    //   5034: ixor
    //   5035: ldc2_w -431717909
    //   5038: l2i
    //   5039: ldc_w 150733292
    //   5042: ixor
    //   5043: ixor
    //   5044: lookupswitch default -> 5072, -243473536 -> 5027, 780665795 -> 8420
    //   5072: goto -> 5076
    //   5075: athrow
    //   5076: invokevirtual floatValue : ()F
    //   5079: goto -> 5083
    //   5082: athrow
    //   5083: f2d
    //   5084: getstatic Perryc.c : I
    //   5087: iflt -> 5101
    //   5090: ldc2_w 1702155757
    //   5093: l2i
    //   5094: ldc_w 673780009
    //   5097: ixor
    //   5098: goto -> 5109
    //   5101: ldc2_w -1867507059
    //   5104: l2i
    //   5105: ldc_w 682005776
    //   5108: ixor
    //   5109: ldc2_w 893695188
    //   5112: l2i
    //   5113: ldc_w 1585941007
    //   5116: ixor
    //   5117: ixor
    //   5118: lookupswitch default -> 8432, -740970170 -> 5144, 647952927 -> 5101
    //   5144: goto -> 5148
    //   5147: athrow
    //   5148: invokestatic square : (D)D
    //   5151: goto -> 5155
    //   5154: athrow
    //   5155: dcmpl
    //   5156: ifle -> 5170
    //   5159: ldc2_w -2100904000
    //   5162: l2i
    //   5163: ldc_w -856488186
    //   5166: ixor
    //   5167: goto -> 5178
    //   5170: ldc2_w 1282319608
    //   5173: l2i
    //   5174: ldc_w 39525439
    //   5177: ixor
    //   5178: ldc2_w 2074263536
    //   5181: l2i
    //   5182: ldc_w -1253343464
    //   5185: ixor
    //   5186: ixor
    //   5187: tableswitch default -> 5159, -2133034962 -> 5208, -2133034961 -> 5211
    //   5208: goto -> 790
    //   5211: getstatic Perryc.c : I
    //   5214: iflt -> 5228
    //   5217: ldc2_w -1804145710
    //   5220: l2i
    //   5221: ldc_w -733403913
    //   5224: ixor
    //   5225: goto -> 5236
    //   5228: ldc2_w 242346092
    //   5231: l2i
    //   5232: ldc_w 264507005
    //   5235: ixor
    //   5236: ldc2_w 2102973930
    //   5239: l2i
    //   5240: ldc_w -1417376732
    //   5243: ixor
    //   5244: ixor
    //   5245: lookupswitch default -> 5272, -1886018117 -> 5228, -1763469589 -> 8460
    //   5272: aload_1
    //   5273: ifnonnull -> 5287
    //   5276: ldc2_w 1790036366
    //   5279: l2i
    //   5280: ldc_w -875973013
    //   5283: ixor
    //   5284: goto -> 5295
    //   5287: ldc2_w 233477681
    //   5290: l2i
    //   5291: ldc_w -1399658027
    //   5294: ixor
    //   5295: ldc2_w 1343924224
    //   5298: l2i
    //   5299: ldc_w 1358228671
    //   5302: ixor
    //   5303: ixor
    //   5304: tableswitch default -> 5276, -1583989926 -> 5328, -1583989925 -> 5977
    //   5328: getstatic Perryc.1 : I
    //   5331: ifeq -> 5345
    //   5334: ldc2_w 742692184
    //   5337: l2i
    //   5338: ldc_w -2024125059
    //   5341: ixor
    //   5342: goto -> 5353
    //   5345: ldc2_w -1138892859
    //   5348: l2i
    //   5349: ldc_w 770856041
    //   5352: ixor
    //   5353: ldc2_w -1450036525
    //   5356: l2i
    //   5357: ldc_w -1714905004
    //   5360: ixor
    //   5361: ixor
    //   5362: lookupswitch default -> 8440, -1690023262 -> 5345, -1581967061 -> 5388
    //   5388: aload #7
    //   5390: getstatic Perryc.c : I
    //   5393: iflt -> 5407
    //   5396: ldc2_w 1723575772
    //   5399: l2i
    //   5400: ldc_w -526969139
    //   5403: ixor
    //   5404: goto -> 5415
    //   5407: ldc2_w -1710616430
    //   5410: l2i
    //   5411: ldc_w -1489385655
    //   5414: ixor
    //   5415: ldc2_w -688545298
    //   5418: l2i
    //   5419: ldc_w -2088231067
    //   5422: ixor
    //   5423: ixor
    //   5424: lookupswitch default -> 5452, -959724486 -> 5407, -749664870 -> 8580
    //   5452: astore_1
    //   5453: getstatic Perryc.c : I
    //   5456: iflt -> 5470
    //   5459: ldc2_w 1348142905
    //   5462: l2i
    //   5463: ldc_w 1719033804
    //   5466: ixor
    //   5467: goto -> 5478
    //   5470: ldc2_w 701625778
    //   5473: l2i
    //   5474: ldc_w 374116002
    //   5477: ixor
    //   5478: ldc2_w 1836383200
    //   5481: l2i
    //   5482: ldc_w 751697643
    //   5485: ixor
    //   5486: ixor
    //   5487: lookupswitch default -> 8448, 2006212094 -> 5470, 2116320795 -> 5512
    //   5512: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   5515: getstatic Perryc.1 : I
    //   5518: ifeq -> 5532
    //   5521: ldc2_w -1747928466
    //   5524: l2i
    //   5525: ldc_w 1677553266
    //   5528: ixor
    //   5529: goto -> 5540
    //   5532: ldc2_w 1657262887
    //   5535: l2i
    //   5536: ldc_w -19658013
    //   5539: ixor
    //   5540: ldc2_w 262019373
    //   5543: l2i
    //   5544: ldc_w -848172532
    //   5547: ixor
    //   5548: ixor
    //   5549: lookupswitch default -> 8514, 918693693 -> 5532, 1593584357 -> 5576
    //   5576: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5579: getstatic Perryc.0 : I
    //   5582: ifle -> 5596
    //   5585: ldc2_w -1155595526
    //   5588: l2i
    //   5589: ldc_w 1997001871
    //   5592: ixor
    //   5593: goto -> 5604
    //   5596: ldc2_w -1533887260
    //   5599: l2i
    //   5600: ldc_w -1291092256
    //   5603: ixor
    //   5604: ldc2_w -1276220205
    //   5607: l2i
    //   5608: ldc_w 1034811529
    //   5611: ixor
    //   5612: ixor
    //   5613: lookupswitch default -> 5640, -1059525897 -> 5596, 1113276975 -> 8564
    //   5640: aload #7
    //   5642: getstatic Perryc.c : I
    //   5645: iflt -> 5659
    //   5648: ldc2_w 1879657700
    //   5651: l2i
    //   5652: ldc_w -1943650404
    //   5655: ixor
    //   5656: goto -> 5667
    //   5659: ldc2_w 21241370
    //   5662: l2i
    //   5663: ldc_w -1338180241
    //   5666: ixor
    //   5667: ldc2_w -1942874950
    //   5670: l2i
    //   5671: ldc_w 1572551447
    //   5674: ixor
    //   5675: ixor
    //   5676: lookupswitch default -> 5704, 765877461 -> 8478, 1927232936 -> 5659
    //   5704: goto -> 5708
    //   5707: athrow
    //   5708: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   5711: goto -> 5715
    //   5714: athrow
    //   5715: getstatic Perryc.1 : I
    //   5718: ifeq -> 5732
    //   5721: ldc2_w -1606215128
    //   5724: l2i
    //   5725: ldc_w -1653193523
    //   5728: ixor
    //   5729: goto -> 5740
    //   5732: ldc2_w 1662833949
    //   5735: l2i
    //   5736: ldc_w -2023942505
    //   5739: ixor
    //   5740: ldc2_w 1234302002
    //   5743: l2i
    //   5744: ldc_w -542301333
    //   5747: ixor
    //   5748: ixor
    //   5749: lookupswitch default -> 8550, -1425438276 -> 5732, 1920799955 -> 5776
    //   5776: dstore_2
    //   5777: getstatic Perryc.1 : I
    //   5780: ifeq -> 5794
    //   5783: ldc2_w 1132535855
    //   5786: l2i
    //   5787: ldc_w -1850023396
    //   5790: ixor
    //   5791: goto -> 5802
    //   5794: ldc2_w 1292239542
    //   5797: l2i
    //   5798: ldc_w -407990368
    //   5801: ixor
    //   5802: ldc2_w 1802004186
    //   5805: l2i
    //   5806: ldc_w 866495749
    //   5809: ixor
    //   5810: ixor
    //   5811: lookupswitch default -> 5836, -1963587092 -> 8468, -40389038 -> 5794
    //   5836: aload #7
    //   5838: getstatic Perryc.1 : I
    //   5841: ifeq -> 5855
    //   5844: ldc2_w 2090576756
    //   5847: l2i
    //   5848: ldc_w -1909732344
    //   5851: ixor
    //   5852: goto -> 5863
    //   5855: ldc2_w 442933951
    //   5858: l2i
    //   5859: ldc_w -2011642758
    //   5862: ixor
    //   5863: ldc2_w 2052581347
    //   5866: l2i
    //   5867: ldc_w -562536981
    //   5870: ixor
    //   5871: ixor
    //   5872: lookupswitch default -> 8490, 911334605 -> 5900, 1453317492 -> 5855
    //   5900: goto -> 5904
    //   5903: athrow
    //   5904: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   5907: goto -> 5911
    //   5910: athrow
    //   5911: f2d
    //   5912: getstatic Perryc.c : I
    //   5915: iflt -> 5929
    //   5918: ldc2_w 186527229
    //   5921: l2i
    //   5922: ldc_w -913954752
    //   5925: ixor
    //   5926: goto -> 5937
    //   5929: ldc2_w 106788240
    //   5932: l2i
    //   5933: ldc_w -1336006423
    //   5936: ixor
    //   5937: ldc2_w -166825593
    //   5940: l2i
    //   5941: ldc_w -396454764
    //   5944: ixor
    //   5945: ixor
    //   5946: lookupswitch default -> 8480, -1470908310 -> 5972, -590815058 -> 5929
    //   5972: dstore #4
    //   5974: goto -> 790
    //   5977: getstatic Perryc.c : I
    //   5980: iflt -> 5994
    //   5983: ldc2_w 202282426
    //   5986: l2i
    //   5987: ldc_w -1322078867
    //   5990: ixor
    //   5991: goto -> 6002
    //   5994: ldc2_w -177449495
    //   5997: l2i
    //   5998: ldc_w 1636277475
    //   6001: ixor
    //   6002: ldc2_w -1568463663
    //   6005: l2i
    //   6006: ldc_w 140031396
    //   6009: ixor
    //   6010: ixor
    //   6011: lookupswitch default -> 8484, 401058210 -> 5994, 1043355775 -> 6036
    //   6036: aload #7
    //   6038: instanceof net/minecraft/entity/player/EntityPlayer
    //   6041: ifeq -> 6055
    //   6044: ldc2_w 203021909
    //   6047: l2i
    //   6048: ldc_w 1635318254
    //   6051: ixor
    //   6052: goto -> 6063
    //   6055: ldc2_w -185617988
    //   6058: l2i
    //   6059: ldc_w -1718708730
    //   6062: ixor
    //   6063: ldc2_w 355694715
    //   6066: l2i
    //   6067: ldc_w -572219470
    //   6070: ixor
    //   6071: ixor
    //   6072: tableswitch default -> 6044, -1514749838 -> 6096, -1514749837 -> 6420
    //   6096: getstatic Perryc.0 : I
    //   6099: ifle -> 6113
    //   6102: ldc2_w -1221359047
    //   6105: l2i
    //   6106: ldc_w 1994401504
    //   6109: ixor
    //   6110: goto -> 6121
    //   6113: ldc2_w 99529299
    //   6116: l2i
    //   6117: ldc_w 1085889996
    //   6120: ixor
    //   6121: ldc2_w -36513619
    //   6124: l2i
    //   6125: ldc_w 584161433
    //   6128: ixor
    //   6129: ixor
    //   6130: lookupswitch default -> 8412, -1705726037 -> 6156, 517008621 -> 6113
    //   6156: aload #7
    //   6158: checkcast net/minecraft/entity/player/EntityPlayer
    //   6161: ldc2_w -1836935077
    //   6164: l2i
    //   6165: ldc_w -1836935095
    //   6168: ixor
    //   6169: getstatic Perryc.c : I
    //   6172: iflt -> 6186
    //   6175: ldc2_w 828237605
    //   6178: l2i
    //   6179: ldc_w -1285531101
    //   6182: ixor
    //   6183: goto -> 6194
    //   6186: ldc2_w -71839070
    //   6189: l2i
    //   6190: ldc_w -1476841024
    //   6193: ixor
    //   6194: ldc2_w 2099927950
    //   6197: l2i
    //   6198: ldc_w 1188667968
    //   6201: ixor
    //   6202: ixor
    //   6203: lookupswitch default -> 8544, -1177664312 -> 6186, 1740446380 -> 6228
    //   6228: goto -> 6232
    //   6231: athrow
    //   6232: invokestatic isArmorLow : (Lnet/minecraft/entity/player/EntityPlayer;I)Z
    //   6235: goto -> 6239
    //   6238: athrow
    //   6239: ifeq -> 6253
    //   6242: ldc2_w -923369706
    //   6245: l2i
    //   6246: ldc_w 200722209
    //   6249: ixor
    //   6250: goto -> 6261
    //   6253: ldc2_w 1964660839
    //   6256: l2i
    //   6257: ldc_w -1239752623
    //   6260: ixor
    //   6261: ldc2_w 1725510060
    //   6264: l2i
    //   6265: ldc_w -483603611
    //   6268: ixor
    //   6269: ixor
    //   6270: tableswitch default -> 6242, 1190478590 -> 6292, 1190478591 -> 6420
    //   6292: getstatic Perryc.c : I
    //   6295: iflt -> 6309
    //   6298: ldc2_w -1724986624
    //   6301: l2i
    //   6302: ldc_w -1453249406
    //   6305: ixor
    //   6306: goto -> 6317
    //   6309: ldc2_w -526236515
    //   6312: l2i
    //   6313: ldc_w -1982082193
    //   6316: ixor
    //   6317: ldc2_w 1614050721
    //   6320: l2i
    //   6321: ldc_w -573976694
    //   6324: ixor
    //   6325: ixor
    //   6326: lookupswitch default -> 6352, -1917690455 -> 8474, 814958020 -> 6309
    //   6352: aload #7
    //   6354: getstatic Perryc.c : I
    //   6357: iflt -> 6371
    //   6360: ldc2_w 1529975701
    //   6363: l2i
    //   6364: ldc_w -1343333690
    //   6367: ixor
    //   6368: goto -> 6379
    //   6371: ldc2_w 1366909894
    //   6374: l2i
    //   6375: ldc_w 571618715
    //   6378: ixor
    //   6379: ldc2_w 222769285
    //   6382: l2i
    //   6383: ldc_w 1960213040
    //   6386: ixor
    //   6387: ixor
    //   6388: lookupswitch default -> 8434, -1924234266 -> 6371, 184163560 -> 6416
    //   6416: astore_1
    //   6417: goto -> 8349
    //   6420: getstatic Perryc.0 : I
    //   6423: ifle -> 6437
    //   6426: ldc2_w 375103854
    //   6429: l2i
    //   6430: ldc_w -1625608965
    //   6433: ixor
    //   6434: goto -> 6445
    //   6437: ldc2_w -621099570
    //   6440: l2i
    //   6441: ldc_w -984432567
    //   6444: ixor
    //   6445: ldc2_w -294430008
    //   6448: l2i
    //   6449: ldc_w -1234871432
    //   6452: ixor
    //   6453: ixor
    //   6454: lookupswitch default -> 6480, -782857179 -> 8556, 436928664 -> 6437
    //   6480: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   6483: getstatic Perryc.1 : I
    //   6486: ifeq -> 6500
    //   6489: ldc2_w 1903423267
    //   6492: l2i
    //   6493: ldc_w -397695757
    //   6496: ixor
    //   6497: goto -> 6508
    //   6500: ldc2_w -977556021
    //   6503: l2i
    //   6504: ldc_w -1335100478
    //   6507: ixor
    //   6508: ldc2_w -1894148434
    //   6511: l2i
    //   6512: ldc_w -94648687
    //   6515: ixor
    //   6516: ixor
    //   6517: lookupswitch default -> 8472, -327541777 -> 6500, 9569846 -> 6544
    //   6544: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6547: getstatic Perryc.1 : I
    //   6550: ifeq -> 6564
    //   6553: ldc2_w 348596498
    //   6556: l2i
    //   6557: ldc_w -1731432022
    //   6560: ixor
    //   6561: goto -> 6572
    //   6564: ldc2_w -1224970670
    //   6567: l2i
    //   6568: ldc_w 1968261250
    //   6571: ixor
    //   6572: ldc2_w -2018130268
    //   6575: l2i
    //   6576: ldc_w -1652780160
    //   6579: ixor
    //   6580: ixor
    //   6581: lookupswitch default -> 6608, -1765667428 -> 8542, -1512148595 -> 6564
    //   6608: aload #7
    //   6610: getstatic Perryc.0 : I
    //   6613: ifle -> 6627
    //   6616: ldc2_w 496387981
    //   6619: l2i
    //   6620: ldc_w -728332213
    //   6623: ixor
    //   6624: goto -> 6635
    //   6627: ldc2_w 1195445092
    //   6630: l2i
    //   6631: ldc_w -608174290
    //   6634: ixor
    //   6635: ldc2_w 1828132224
    //   6638: l2i
    //   6639: ldc_w 1168985012
    //   6642: ixor
    //   6643: ixor
    //   6644: lookupswitch default -> 8622, -1247499650 -> 6672, -530935310 -> 6627
    //   6672: goto -> 6676
    //   6675: athrow
    //   6676: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   6679: goto -> 6683
    //   6682: athrow
    //   6683: getstatic Perryc.c : I
    //   6686: iflt -> 6700
    //   6689: ldc2_w -1875307576
    //   6692: l2i
    //   6693: ldc_w -2121548433
    //   6696: ixor
    //   6697: goto -> 6708
    //   6700: ldc2_w -1203432366
    //   6703: l2i
    //   6704: ldc_w 2123818905
    //   6707: ixor
    //   6708: ldc2_w 1208508850
    //   6711: l2i
    //   6712: ldc_w -1438376751
    //   6715: ixor
    //   6716: ixor
    //   6717: lookupswitch default -> 8620, -201403452 -> 6700, 614436520 -> 6744
    //   6744: dload_2
    //   6745: dcmpg
    //   6746: ifge -> 6760
    //   6749: ldc2_w 1858340938
    //   6752: l2i
    //   6753: ldc_w 1661075495
    //   6756: ixor
    //   6757: goto -> 6768
    //   6760: ldc2_w -284386488
    //   6763: l2i
    //   6764: ldc_w -490040540
    //   6767: ixor
    //   6768: ldc2_w 585899383
    //   6771: l2i
    //   6772: ldc_w -1041391324
    //   6775: ixor
    //   6776: ixor
    //   6777: tableswitch default -> 6749, -288902082 -> 6800, -288902081 -> 7446
    //   6800: getstatic Perryc.1 : I
    //   6803: ifeq -> 6817
    //   6806: ldc2_w -804958338
    //   6809: l2i
    //   6810: ldc_w 959870933
    //   6813: ixor
    //   6814: goto -> 6825
    //   6817: ldc2_w -1230800601
    //   6820: l2i
    //   6821: ldc_w -346304504
    //   6824: ixor
    //   6825: ldc2_w 2143622524
    //   6828: l2i
    //   6829: ldc_w 858078102
    //   6832: ixor
    //   6833: ixor
    //   6834: lookupswitch default -> 8594, -1512892863 -> 6817, 286820293 -> 6860
    //   6860: aload #7
    //   6862: getstatic Perryc.0 : I
    //   6865: ifle -> 6879
    //   6868: ldc2_w 1503787493
    //   6871: l2i
    //   6872: ldc_w 148682202
    //   6875: ixor
    //   6876: goto -> 6887
    //   6879: ldc2_w 202231888
    //   6882: l2i
    //   6883: ldc_w -652896288
    //   6886: ixor
    //   6887: ldc2_w -476698390
    //   6890: l2i
    //   6891: ldc_w 780004688
    //   6894: ixor
    //   6895: ixor
    //   6896: lookupswitch default -> 6924, -1667855995 -> 8424, -1498037739 -> 6879
    //   6924: astore_1
    //   6925: getstatic Perryc.0 : I
    //   6928: ifle -> 6942
    //   6931: ldc2_w -800605973
    //   6934: l2i
    //   6935: ldc_w -2120043328
    //   6938: ixor
    //   6939: goto -> 6950
    //   6942: ldc2_w 123425659
    //   6945: l2i
    //   6946: ldc_w 663146039
    //   6949: ixor
    //   6950: ldc2_w -45380756
    //   6953: l2i
    //   6954: ldc_w 164488714
    //   6957: ixor
    //   6958: ixor
    //   6959: lookupswitch default -> 8486, -1520213683 -> 6942, -732172246 -> 6984
    //   6984: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   6987: getstatic Perryc.c : I
    //   6990: iflt -> 7004
    //   6993: ldc2_w -1647591816
    //   6996: l2i
    //   6997: ldc_w 837175280
    //   7000: ixor
    //   7001: goto -> 7012
    //   7004: ldc2_w 36977334
    //   7007: l2i
    //   7008: ldc_w 1452417518
    //   7011: ixor
    //   7012: ldc2_w 877720994
    //   7015: l2i
    //   7016: ldc_w 1421958099
    //   7019: ixor
    //   7020: ixor
    //   7021: lookupswitch default -> 7048, -1032398962 -> 7004, -860071943 -> 8534
    //   7048: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7051: getstatic Perryc.1 : I
    //   7054: ifeq -> 7068
    //   7057: ldc2_w -708773340
    //   7060: l2i
    //   7061: ldc_w -1797051632
    //   7064: ixor
    //   7065: goto -> 7076
    //   7068: ldc2_w 1324120061
    //   7071: l2i
    //   7072: ldc_w 1598487232
    //   7075: ixor
    //   7076: ldc2_w 1428962626
    //   7079: l2i
    //   7080: ldc_w 1817047868
    //   7083: ixor
    //   7084: ixor
    //   7085: lookupswitch default -> 8600, 684409667 -> 7112, 2017599306 -> 7068
    //   7112: aload #7
    //   7114: getstatic Perryc.0 : I
    //   7117: ifle -> 7131
    //   7120: ldc2_w -1260256650
    //   7123: l2i
    //   7124: ldc_w 348984548
    //   7127: ixor
    //   7128: goto -> 7139
    //   7131: ldc2_w 236836804
    //   7134: l2i
    //   7135: ldc_w -1485655881
    //   7138: ixor
    //   7139: ldc2_w -191693043
    //   7142: l2i
    //   7143: ldc_w 1209778923
    //   7146: ixor
    //   7147: ixor
    //   7148: lookupswitch default -> 8598, 367418005 -> 7176, 480652148 -> 7131
    //   7176: goto -> 7180
    //   7179: athrow
    //   7180: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   7183: goto -> 7187
    //   7186: athrow
    //   7187: getstatic Perryc.1 : I
    //   7190: ifeq -> 7204
    //   7193: ldc2_w -1732223603
    //   7196: l2i
    //   7197: ldc_w 1280260699
    //   7200: ixor
    //   7201: goto -> 7212
    //   7204: ldc2_w -1958736730
    //   7207: l2i
    //   7208: ldc_w -305180583
    //   7211: ixor
    //   7212: ldc2_w 304649556
    //   7215: l2i
    //   7216: ldc_w -563884843
    //   7219: ixor
    //   7220: ixor
    //   7221: lookupswitch default -> 8520, -1429994114 -> 7248, 415514199 -> 7204
    //   7248: dstore_2
    //   7249: getstatic Perryc.c : I
    //   7252: iflt -> 7266
    //   7255: ldc2_w 1402015139
    //   7258: l2i
    //   7259: ldc_w 996481046
    //   7262: ixor
    //   7263: goto -> 7274
    //   7266: ldc2_w -710034031
    //   7269: l2i
    //   7270: ldc_w -906741255
    //   7273: ixor
    //   7274: ldc2_w 860483094
    //   7277: l2i
    //   7278: ldc_w 1066998627
    //   7281: ixor
    //   7282: ixor
    //   7283: lookupswitch default -> 8436, 277442845 -> 7308, 1680138432 -> 7266
    //   7308: aload #7
    //   7310: getstatic Perryc.0 : I
    //   7313: ifle -> 7327
    //   7316: ldc2_w -1614935198
    //   7319: l2i
    //   7320: ldc_w 148583328
    //   7323: ixor
    //   7324: goto -> 7335
    //   7327: ldc2_w 250625982
    //   7330: l2i
    //   7331: ldc_w -1685459386
    //   7334: ixor
    //   7335: ldc2_w -1021548291
    //   7338: l2i
    //   7339: ldc_w -1504855647
    //   7342: ixor
    //   7343: ixor
    //   7344: lookupswitch default -> 7372, -1237686648 -> 7327, -231413346 -> 8512
    //   7372: goto -> 7376
    //   7375: athrow
    //   7376: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   7379: goto -> 7383
    //   7382: athrow
    //   7383: f2d
    //   7384: getstatic Perryc.0 : I
    //   7387: ifle -> 7401
    //   7390: ldc2_w -1011754310
    //   7393: l2i
    //   7394: ldc_w -1801351154
    //   7397: ixor
    //   7398: goto -> 7409
    //   7401: ldc2_w 1592264606
    //   7404: l2i
    //   7405: ldc_w -1667246355
    //   7408: ixor
    //   7409: ldc2_w -1351239862
    //   7412: l2i
    //   7413: ldc_w -1625973275
    //   7416: ixor
    //   7417: ixor
    //   7418: lookupswitch default -> 8482, -233309220 -> 7444, 1735417883 -> 7401
    //   7444: dstore #4
    //   7446: getstatic Perryc.1 : I
    //   7449: ifeq -> 7463
    //   7452: ldc2_w -2023272802
    //   7455: l2i
    //   7456: ldc_w 132300304
    //   7459: ixor
    //   7460: goto -> 7471
    //   7463: ldc2_w -1710243657
    //   7466: l2i
    //   7467: ldc_w 824954744
    //   7470: ixor
    //   7471: ldc2_w 2118959011
    //   7474: l2i
    //   7475: ldc_w 1793540677
    //   7478: ixor
    //   7479: ixor
    //   7480: lookupswitch default -> 7508, -1808921240 -> 8438, 1379542336 -> 7463
    //   7508: aload #7
    //   7510: getstatic Perryc.0 : I
    //   7513: ifle -> 7527
    //   7516: ldc2_w -1444053853
    //   7519: l2i
    //   7520: ldc_w -1219017441
    //   7523: ixor
    //   7524: goto -> 7535
    //   7527: ldc2_w -433727919
    //   7530: l2i
    //   7531: ldc_w -1245785177
    //   7534: ixor
    //   7535: ldc2_w 984477484
    //   7538: l2i
    //   7539: ldc_w -1152477005
    //   7542: ixor
    //   7543: ixor
    //   7544: lookupswitch default -> 8554, -1621537245 -> 7527, -763858327 -> 7572
    //   7572: goto -> 7576
    //   7575: athrow
    //   7576: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   7579: goto -> 7583
    //   7582: athrow
    //   7583: f2d
    //   7584: getstatic Perryc.1 : I
    //   7587: ifeq -> 7601
    //   7590: ldc2_w -1768593229
    //   7593: l2i
    //   7594: ldc_w -1768711470
    //   7597: ixor
    //   7598: goto -> 7609
    //   7601: ldc2_w -630719159
    //   7604: l2i
    //   7605: ldc_w 773525221
    //   7608: ixor
    //   7609: ldc2_w -1956017927
    //   7612: l2i
    //   7613: ldc_w -995654117
    //   7616: ixor
    //   7617: ixor
    //   7618: lookupswitch default -> 8452, -1145897650 -> 7644, 1338571907 -> 7601
    //   7644: dload #4
    //   7646: dcmpg
    //   7647: ifge -> 7661
    //   7650: ldc2_w -310698009
    //   7653: l2i
    //   7654: ldc_w -389900075
    //   7657: ixor
    //   7658: goto -> 7669
    //   7661: ldc2_w -173354243
    //   7664: l2i
    //   7665: ldc_w -267168320
    //   7668: ixor
    //   7669: ldc2_w -1923608661
    //   7672: l2i
    //   7673: ldc_w 535813166
    //   7676: ixor
    //   7677: ixor
    //   7678: tableswitch default -> 7650, -1760668489 -> 7700, -1760668488 -> 8346
    //   7700: getstatic Perryc.1 : I
    //   7703: ifeq -> 7717
    //   7706: ldc2_w 1588402565
    //   7709: l2i
    //   7710: ldc_w 500759144
    //   7713: ixor
    //   7714: goto -> 7725
    //   7717: ldc2_w -1829643528
    //   7720: l2i
    //   7721: ldc_w 1793175776
    //   7724: ixor
    //   7725: ldc2_w 1140944895
    //   7728: l2i
    //   7729: ldc_w 279688265
    //   7732: ixor
    //   7733: ixor
    //   7734: lookupswitch default -> 8454, -1397050962 -> 7760, 400504923 -> 7717
    //   7760: aload #7
    //   7762: getstatic Perryc.c : I
    //   7765: iflt -> 7779
    //   7768: ldc2_w -1032119026
    //   7771: l2i
    //   7772: ldc_w 568075446
    //   7775: ixor
    //   7776: goto -> 7787
    //   7779: ldc2_w -698648609
    //   7782: l2i
    //   7783: ldc_w 229760894
    //   7786: ixor
    //   7787: ldc2_w 1056308173
    //   7790: l2i
    //   7791: ldc_w -959279672
    //   7794: ixor
    //   7795: ixor
    //   7796: lookupswitch default -> 7824, 249093791 -> 7779, 461393853 -> 8536
    //   7824: astore_1
    //   7825: getstatic Perryc.c : I
    //   7828: iflt -> 7842
    //   7831: ldc2_w 641759513
    //   7834: l2i
    //   7835: ldc_w -1821283469
    //   7838: ixor
    //   7839: goto -> 7850
    //   7842: ldc2_w 1733967178
    //   7845: l2i
    //   7846: ldc_w -1411141677
    //   7849: ixor
    //   7850: ldc2_w 937135482
    //   7853: l2i
    //   7854: ldc_w -1958222600
    //   7857: ixor
    //   7858: ixor
    //   7859: lookupswitch default -> 7884, -367563951 -> 7842, 162364392 -> 8522
    //   7884: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   7887: getstatic Perryc.1 : I
    //   7890: ifeq -> 7904
    //   7893: ldc2_w -1407932857
    //   7896: l2i
    //   7897: ldc_w 729252614
    //   7900: ixor
    //   7901: goto -> 7912
    //   7904: ldc2_w 405101659
    //   7907: l2i
    //   7908: ldc_w 1331959967
    //   7911: ixor
    //   7912: ldc2_w 149816090
    //   7915: l2i
    //   7916: ldc_w 755994557
    //   7919: ixor
    //   7920: ixor
    //   7921: lookupswitch default -> 8502, -1568495130 -> 7904, 1923139683 -> 7948
    //   7948: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7951: getstatic Perryc.0 : I
    //   7954: ifle -> 7968
    //   7957: ldc2_w -1971692364
    //   7960: l2i
    //   7961: ldc_w -300550440
    //   7964: ixor
    //   7965: goto -> 7976
    //   7968: ldc2_w -1370778168
    //   7971: l2i
    //   7972: ldc_w 1853848400
    //   7975: ixor
    //   7976: ldc2_w 511413566
    //   7979: l2i
    //   7980: ldc_w -507344380
    //   7983: ixor
    //   7984: ixor
    //   7985: lookupswitch default -> 8012, -1680429738 -> 8538, -375028227 -> 7968
    //   8012: aload #7
    //   8014: getstatic Perryc.1 : I
    //   8017: ifeq -> 8031
    //   8020: ldc2_w -741805447
    //   8023: l2i
    //   8024: ldc_w 2139686134
    //   8027: ixor
    //   8028: goto -> 8039
    //   8031: ldc2_w -96605837
    //   8034: l2i
    //   8035: ldc_w -1749049450
    //   8038: ixor
    //   8039: ldc2_w 1008354850
    //   8042: l2i
    //   8043: ldc_w -60389032
    //   8046: ixor
    //   8047: ixor
    //   8048: lookupswitch default -> 8076, 1815951861 -> 8574, 2015782458 -> 8031
    //   8076: goto -> 8080
    //   8079: athrow
    //   8080: invokevirtual func_70068_e : (Lnet/minecraft/entity/Entity;)D
    //   8083: goto -> 8087
    //   8086: athrow
    //   8087: getstatic Perryc.c : I
    //   8090: iflt -> 8104
    //   8093: ldc2_w 99755797
    //   8096: l2i
    //   8097: ldc_w 89630615
    //   8100: ixor
    //   8101: goto -> 8112
    //   8104: ldc2_w -386089029
    //   8107: l2i
    //   8108: ldc_w 107287179
    //   8111: ixor
    //   8112: ldc2_w 327836619
    //   8115: l2i
    //   8116: ldc_w -704316654
    //   8119: ixor
    //   8120: ixor
    //   8121: lookupswitch default -> 8148, -987031461 -> 8624, 474814760 -> 8104
    //   8148: dstore_2
    //   8149: getstatic Perryc.0 : I
    //   8152: ifle -> 8166
    //   8155: ldc2_w -375996509
    //   8158: l2i
    //   8159: ldc_w -262166795
    //   8162: ixor
    //   8163: goto -> 8174
    //   8166: ldc2_w 1812421734
    //   8169: l2i
    //   8170: ldc_w 1851010514
    //   8173: ixor
    //   8174: ldc2_w -383031195
    //   8177: l2i
    //   8178: ldc_w 711104269
    //   8181: ixor
    //   8182: ixor
    //   8183: lookupswitch default -> 8548, -1055224100 -> 8208, -629086658 -> 8166
    //   8208: aload #7
    //   8210: getstatic Perryc.1 : I
    //   8213: ifeq -> 8227
    //   8216: ldc2_w -67763473
    //   8219: l2i
    //   8220: ldc_w -702690787
    //   8223: ixor
    //   8224: goto -> 8235
    //   8227: ldc2_w 258423068
    //   8230: l2i
    //   8231: ldc_w 1030511830
    //   8234: ixor
    //   8235: ldc2_w 277707138
    //   8238: l2i
    //   8239: ldc_w -2059675755
    //   8242: ixor
    //   8243: ixor
    //   8244: lookupswitch default -> 8272, -1201838363 -> 8500, 160521925 -> 8227
    //   8272: goto -> 8276
    //   8275: athrow
    //   8276: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   8279: goto -> 8283
    //   8282: athrow
    //   8283: f2d
    //   8284: getstatic Perryc.c : I
    //   8287: iflt -> 8301
    //   8290: ldc2_w -1398681889
    //   8293: l2i
    //   8294: ldc_w -1682946672
    //   8297: ixor
    //   8298: goto -> 8309
    //   8301: ldc2_w -1341406274
    //   8304: l2i
    //   8305: ldc_w -832655101
    //   8308: ixor
    //   8309: ldc2_w 1194361084
    //   8312: l2i
    //   8313: ldc_w 1832196098
    //   8316: ixor
    //   8317: ixor
    //   8318: lookupswitch default -> 8510, 487855025 -> 8301, 1414588995 -> 8344
    //   8344: dstore #4
    //   8346: goto -> 790
    //   8349: getstatic Perryc.1 : I
    //   8352: ifeq -> 8366
    //   8355: ldc2_w -1776261410
    //   8358: l2i
    //   8359: ldc_w 1140096616
    //   8362: ixor
    //   8363: goto -> 8374
    //   8366: ldc2_w -1297504514
    //   8369: l2i
    //   8370: ldc_w 1419739430
    //   8373: ixor
    //   8374: ldc2_w -1365419082
    //   8377: l2i
    //   8378: ldc_w 1873713972
    //   8381: ixor
    //   8382: ixor
    //   8383: lookupswitch default -> 8414, 350738484 -> 8366, 654698330 -> 8408
    //   8408: aload_1
    //   8409: areturn
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
    //   8610: aconst_null
    //   8611: athrow
    //   8612: aconst_null
    //   8613: athrow
    //   8614: aconst_null
    //   8615: athrow
    //   8616: aconst_null
    //   8617: athrow
    //   8618: aconst_null
    //   8619: athrow
    //   8620: aconst_null
    //   8621: athrow
    //   8622: aconst_null
    //   8623: athrow
    //   8624: aconst_null
    //   8625: athrow
    //   8626: aconst_null
    //   8627: athrow
    //   8628: aconst_null
    //   8629: athrow
    //   8630: pop
    //   8631: goto -> 24
    //   8634: pop
    //   8635: aconst_null
    //   8636: goto -> 8630
    //   8639: dup
    //   8640: ifnull -> 8630
    //   8643: checkcast java/lang/Throwable
    //   8646: athrow
    //   8647: dup
    //   8648: ifnull -> 8634
    //   8651: checkcast java/lang/Throwable
    //   8654: athrow
    //   8655: aconst_null
    //   8656: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1178	7168	7	entity	Lnet/minecraft/entity/Entity;
    //   24	8386	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Killaura;
    //   85	8325	1	target	Lnet/minecraft/entity/Entity;
    //   405	8005	2	distance	D
    //   478	7932	4	maxHealth	D
    // Exception table:
    //   from	to	target	type
    //   8	20	8639	java/lang/NegativeArraySizeException
    //   267	274	274	finally
    //   267	274	274	finally
    //   267	274	274	java/lang/ArrayIndexOutOfBoundsException
    //   267	274	267	java/lang/ArithmeticException
    //   268	274	267	finally
    //   339	346	346	finally
    //   339	346	346	finally
    //   340	346	339	java/lang/ArithmeticException
    //   340	346	346	finally
    //   340	346	3	finally
    //   719	728	728	finally
    //   719	728	728	finally
    //   719	728	3	finally
    //   719	728	728	finally
    //   720	728	719	finally
    //   911	920	920	finally
    //   911	920	920	finally
    //   911	920	911	java/lang/ArithmeticException
    //   912	920	3	java/lang/IllegalArgumentException
    //   912	920	3	finally
    //   1103	1112	1112	finally
    //   1103	1112	1103	finally
    //   1104	1112	3	finally
    //   1104	1112	3	finally
    //   1104	1112	1103	finally
    //   1367	1374	1374	finally
    //   1367	1374	1367	finally
    //   1367	1374	1367	java/lang/RuntimeException
    //   1367	1374	1367	finally
    //   1368	1374	3	finally
    //   1443	1450	1450	finally
    //   1443	1450	3	finally
    //   1444	1450	1443	finally
    //   1444	1450	1443	finally
    //   1444	1450	1450	java/lang/IndexOutOfBoundsException
    //   1811	1818	1818	finally
    //   1811	1818	3	java/lang/IndexOutOfBoundsException
    //   1811	1818	1811	finally
    //   1811	1818	3	java/lang/UnsupportedOperationException
    //   1812	1818	1818	java/lang/NullPointerException
    //   1888	1894	1894	finally
    //   1888	1894	3	java/lang/AssertionError
    //   1888	1894	3	finally
    //   1888	1894	1894	java/util/NoSuchElementException
    //   1888	1894	1894	finally
    //   2075	2082	2082	finally
    //   2075	2082	2075	java/lang/RuntimeException
    //   2075	2082	2082	finally
    //   2076	2082	3	java/lang/ArithmeticException
    //   2076	2082	2082	finally
    //   2324	2330	2330	finally
    //   2324	2330	3	finally
    //   2324	2330	2330	java/util/ConcurrentModificationException
    //   2324	2330	2330	finally
    //   2324	2330	3	java/lang/RuntimeException
    //   2399	2406	2406	finally
    //   2399	2406	2399	finally
    //   2399	2406	3	java/lang/ArithmeticException
    //   2399	2406	2406	java/util/ConcurrentModificationException
    //   2399	2406	3	finally
    //   2587	2594	2594	finally
    //   2587	2594	2594	finally
    //   2588	2594	2587	finally
    //   2588	2594	2587	java/lang/NegativeArraySizeException
    //   2588	2594	2594	finally
    //   2835	2842	2842	finally
    //   2835	2842	2835	finally
    //   2835	2842	2842	finally
    //   2835	2842	2835	java/lang/EnumConstantNotPresentException
    //   2836	2842	2835	finally
    //   2912	2918	2918	finally
    //   2912	2918	2918	finally
    //   2912	2918	2918	java/lang/IllegalStateException
    //   2912	2918	3	java/lang/IndexOutOfBoundsException
    //   2912	2918	2918	java/lang/IndexOutOfBoundsException
    //   3099	3106	3106	finally
    //   3099	3106	3106	java/lang/NegativeArraySizeException
    //   3099	3106	3099	finally
    //   3099	3106	3	finally
    //   3100	3106	3099	finally
    //   3347	3354	3354	finally
    //   3347	3354	3	finally
    //   3347	3354	3	finally
    //   3347	3354	3	java/lang/NumberFormatException
    //   3348	3354	3347	java/util/ConcurrentModificationException
    //   3423	3430	3430	finally
    //   3423	3430	3430	finally
    //   3423	3430	3430	java/lang/RuntimeException
    //   3424	3430	3423	finally
    //   3424	3430	3430	java/lang/RuntimeException
    //   3611	3618	3618	finally
    //   3611	3618	3618	java/lang/StringIndexOutOfBoundsException
    //   3611	3618	3	java/lang/IllegalArgumentException
    //   3612	3618	3611	finally
    //   3612	3618	3611	java/lang/NullPointerException
    //   3979	3986	3986	finally
    //   3979	3986	3986	java/lang/StringIndexOutOfBoundsException
    //   3980	3986	3979	java/util/ConcurrentModificationException
    //   3980	3986	3986	java/lang/UnsupportedOperationException
    //   3980	3986	3979	finally
    //   4299	4306	4306	finally
    //   4299	4306	3	java/lang/NullPointerException
    //   4299	4306	4299	finally
    //   4299	4306	4299	finally
    //   4300	4306	4299	finally
    //   4487	4494	4494	finally
    //   4487	4494	4487	finally
    //   4488	4494	4487	finally
    //   4488	4494	4494	java/lang/IllegalStateException
    //   4488	4494	4487	java/lang/AssertionError
    //   4803	4810	4810	finally
    //   4803	4810	4803	java/lang/ArrayIndexOutOfBoundsException
    //   4804	4810	4810	finally
    //   4804	4810	3	java/lang/ArrayIndexOutOfBoundsException
    //   4804	4810	4810	finally
    //   4999	5006	5006	finally
    //   4999	5006	3	java/lang/StringIndexOutOfBoundsException
    //   4999	5006	3	java/lang/StringIndexOutOfBoundsException
    //   5000	5006	5006	finally
    //   5000	5006	4999	java/lang/AssertionError
    //   5075	5082	5082	finally
    //   5075	5082	5075	finally
    //   5075	5082	5075	java/lang/IllegalStateException
    //   5076	5082	5075	java/lang/IllegalArgumentException
    //   5076	5082	5075	java/lang/ArithmeticException
    //   5147	5154	5154	finally
    //   5147	5154	5154	java/lang/RuntimeException
    //   5147	5154	5154	finally
    //   5148	5154	5147	java/lang/IllegalStateException
    //   5148	5154	3	finally
    //   5708	5714	5714	finally
    //   5708	5714	3	java/lang/EnumConstantNotPresentException
    //   5708	5714	5714	finally
    //   5708	5714	3	java/lang/ClassCastException
    //   5708	5714	3	finally
    //   5903	5910	5910	finally
    //   5903	5910	5910	java/lang/NullPointerException
    //   5904	5910	5903	java/lang/NumberFormatException
    //   5904	5910	5910	java/lang/UnsupportedOperationException
    //   5904	5910	5903	java/lang/ArrayIndexOutOfBoundsException
    //   6231	6238	6238	finally
    //   6231	6238	6231	java/lang/IllegalStateException
    //   6231	6238	3	finally
    //   6232	6238	6238	java/lang/StringIndexOutOfBoundsException
    //   6232	6238	6238	finally
    //   6675	6682	6682	finally
    //   6676	6682	3	java/lang/UnsupportedOperationException
    //   6676	6682	6675	finally
    //   6676	6682	3	finally
    //   6676	6682	3	java/lang/AssertionError
    //   7179	7186	7186	finally
    //   7179	7186	7179	finally
    //   7179	7186	7179	java/lang/StringIndexOutOfBoundsException
    //   7180	7186	3	finally
    //   7180	7186	3	java/lang/NumberFormatException
    //   7375	7382	7382	finally
    //   7375	7382	3	java/lang/IndexOutOfBoundsException
    //   7375	7382	7375	finally
    //   7375	7382	7375	java/util/NoSuchElementException
    //   7376	7382	3	finally
    //   7575	7582	7582	finally
    //   7575	7582	7575	java/lang/IndexOutOfBoundsException
    //   7575	7582	7582	finally
    //   7576	7582	3	java/lang/StringIndexOutOfBoundsException
    //   7576	7582	3	java/lang/IllegalStateException
    //   8079	8086	8086	finally
    //   8079	8086	8079	java/lang/UnsupportedOperationException
    //   8079	8086	8086	finally
    //   8080	8086	8086	finally
    //   8080	8086	3	java/lang/ClassCastException
    //   8275	8282	8282	finally
    //   8275	8282	3	java/lang/RuntimeException
    //   8275	8282	3	finally
    //   8275	8282	8275	java/lang/IllegalStateException
    //   8276	8282	8275	finally
    //   8639	8647	8639	java/lang/IndexOutOfBoundsException
    //   8655	8657	3	finally
  }
  
  public String getDisplayInfo() {
    return Perry1.8(this, (int)-1489847463L ^ 0xC50B940B);
  }
  
  public void onTick() {
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
  
  public void doKillaura() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3614
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3606
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3598
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1325660477
    //   33: l2i
    //   34: ldc_w -1104223142
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1306695616
    //   44: l2i
    //   45: ldc_w 99888965
    //   48: ixor
    //   49: ldc2_w -1827109901
    //   52: l2i
    //   53: ldc_w 139864367
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 3511, -749202855 -> 84, 1784919995 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 1351599203
    //   94: l2i
    //   95: ldc_w 1304167888
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1788809080
    //   105: l2i
    //   106: ldc_w -1988439633
    //   109: ixor
    //   110: ldc2_w -907815597
    //   113: l2i
    //   114: ldc_w -499186423
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -801743260 -> 102, 921637353 -> 3541
    //   144: getfield onlySharp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w -954450388
    //   156: l2i
    //   157: ldc_w 767736585
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 322499584
    //   167: l2i
    //   168: ldc_w 1926210493
    //   171: ixor
    //   172: ldc2_w 1784015375
    //   175: l2i
    //   176: ldc_w -34255257
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -1849974218 -> 164, 2105418061 -> 3543
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getValue : ()Ljava/lang/Object;
    //   215: goto -> 219
    //   218: athrow
    //   219: checkcast java/lang/Boolean
    //   222: getstatic Perryc.0 : I
    //   225: ifle -> 239
    //   228: ldc2_w -374693000
    //   231: l2i
    //   232: ldc_w -1573872797
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w -349727172
    //   242: l2i
    //   243: ldc_w -278587333
    //   246: ixor
    //   247: ldc2_w -1320632852
    //   250: l2i
    //   251: ldc_w 978778495
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 284, -1065059192 -> 3497, 207057357 -> 239
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual booleanValue : ()Z
    //   291: goto -> 295
    //   294: athrow
    //   295: ifeq -> 309
    //   298: ldc2_w -1748063161
    //   301: l2i
    //   302: ldc_w -1686752557
    //   305: ixor
    //   306: goto -> 317
    //   309: ldc2_w -6446098
    //   312: l2i
    //   313: ldc_w -215663235
    //   316: ixor
    //   317: ldc2_w 1153019251
    //   320: l2i
    //   321: ldc_w -310981332
    //   324: ixor
    //   325: ixor
    //   326: tableswitch default -> 298, -1518862645 -> 348, -1518862644 -> 664
    //   348: getstatic Perryc.1 : I
    //   351: ifeq -> 365
    //   354: ldc2_w 925311861
    //   357: l2i
    //   358: ldc_w -1643617769
    //   361: ixor
    //   362: goto -> 373
    //   365: ldc2_w -1272064539
    //   368: l2i
    //   369: ldc_w -1673650493
    //   372: ixor
    //   373: ldc2_w -1351517573
    //   376: l2i
    //   377: ldc_w 957181289
    //   380: ixor
    //   381: ixor
    //   382: lookupswitch default -> 408, 1062426224 -> 3527, 1210440357 -> 365
    //   408: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   411: getstatic Perryc.0 : I
    //   414: ifle -> 428
    //   417: ldc2_w -744049662
    //   420: l2i
    //   421: ldc_w -1651401829
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -1312828926
    //   431: l2i
    //   432: ldc_w -96422683
    //   435: ixor
    //   436: ldc2_w 1042512922
    //   439: l2i
    //   440: ldc_w -2065683012
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 3501, -247711935 -> 472, -185303489 -> 428
    //   472: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   475: getstatic Perryc.0 : I
    //   478: ifle -> 492
    //   481: ldc2_w -2103538167
    //   484: l2i
    //   485: ldc_w -453500123
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -444716368
    //   495: l2i
    //   496: ldc_w 446423817
    //   499: ixor
    //   500: ldc2_w -1783168205
    //   503: l2i
    //   504: ldc_w 281734122
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 3573, -484751883 -> 492, 2056790368 -> 536
    //   536: goto -> 540
    //   539: athrow
    //   540: invokestatic holdingWeapon : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   543: goto -> 547
    //   546: athrow
    //   547: ifne -> 561
    //   550: ldc2_w -630378168
    //   553: l2i
    //   554: ldc_w 1868644025
    //   557: ixor
    //   558: goto -> 569
    //   561: ldc2_w -238820887
    //   564: l2i
    //   565: ldc_w 1154477593
    //   568: ixor
    //   569: ldc2_w -494446691
    //   572: l2i
    //   573: ldc_w 484795294
    //   576: ixor
    //   577: ixor
    //   578: tableswitch default -> 550, 1265515506 -> 600, 1265515507 -> 664
    //   600: aconst_null
    //   601: getstatic Perryc.1 : I
    //   604: ifeq -> 618
    //   607: ldc2_w 998209725
    //   610: l2i
    //   611: ldc_w -1478465969
    //   614: ixor
    //   615: goto -> 626
    //   618: ldc2_w -1759868163
    //   621: l2i
    //   622: ldc_w 874503697
    //   625: ixor
    //   626: ldc2_w 1940512498
    //   629: l2i
    //   630: ldc_w 1736431768
    //   633: ixor
    //   634: ixor
    //   635: lookupswitch default -> 660, -2008475496 -> 3519, 1427222431 -> 618
    //   660: putstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   663: return
    //   664: getstatic Perryc.0 : I
    //   667: ifle -> 681
    //   670: ldc2_w -1036506773
    //   673: l2i
    //   674: ldc_w 1224737628
    //   677: ixor
    //   678: goto -> 689
    //   681: ldc2_w -1114979155
    //   684: l2i
    //   685: ldc_w -11809800
    //   688: ixor
    //   689: ldc2_w -71106945
    //   692: l2i
    //   693: ldc_w 457485090
    //   696: ixor
    //   697: ixor
    //   698: lookupswitch default -> 724, -631559634 -> 681, 1807646570 -> 3531
    //   724: aload_0
    //   725: getstatic Perryc.c : I
    //   728: iflt -> 742
    //   731: ldc2_w 427717606
    //   734: l2i
    //   735: ldc_w -1122830054
    //   738: ixor
    //   739: goto -> 750
    //   742: ldc2_w -2000254226
    //   745: l2i
    //   746: ldc_w -1391056656
    //   749: ixor
    //   750: ldc2_w -642061571
    //   753: l2i
    //   754: ldc_w 177079687
    //   757: ixor
    //   758: ixor
    //   759: lookupswitch default -> 3529, -152810140 -> 784, 2002281862 -> 742
    //   784: getfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   787: getstatic Perryc.0 : I
    //   790: ifle -> 804
    //   793: ldc2_w -1550590967
    //   796: l2i
    //   797: ldc_w 1977112211
    //   800: ixor
    //   801: goto -> 812
    //   804: ldc2_w -855412990
    //   807: l2i
    //   808: ldc_w 333140999
    //   811: ixor
    //   812: ldc2_w -1723906317
    //   815: l2i
    //   816: ldc_w 145335376
    //   819: ixor
    //   820: ixor
    //   821: lookupswitch default -> 3507, 1205692473 -> 804, 1330567590 -> 848
    //   848: goto -> 852
    //   851: athrow
    //   852: invokevirtual getValue : ()Ljava/lang/Object;
    //   855: goto -> 859
    //   858: athrow
    //   859: checkcast java/lang/Boolean
    //   862: getstatic Perryc.c : I
    //   865: iflt -> 879
    //   868: ldc2_w -1438136596
    //   871: l2i
    //   872: ldc_w -802599316
    //   875: ixor
    //   876: goto -> 887
    //   879: ldc2_w 1074491948
    //   882: l2i
    //   883: ldc_w -595409589
    //   886: ixor
    //   887: ldc2_w 199997084
    //   890: l2i
    //   891: ldc_w -872055394
    //   894: ixor
    //   895: ixor
    //   896: lookupswitch default -> 924, -1385926527 -> 879, -1115667582 -> 3517
    //   924: goto -> 928
    //   927: athrow
    //   928: invokevirtual booleanValue : ()Z
    //   931: goto -> 935
    //   934: athrow
    //   935: ifne -> 949
    //   938: ldc2_w -1131470599
    //   941: l2i
    //   942: ldc_w 1079727777
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w -1403333576
    //   952: l2i
    //   953: ldc_w 1351524961
    //   956: ixor
    //   957: ldc2_w 216805587
    //   960: l2i
    //   961: ldc_w -1572774957
    //   964: ixor
    //   965: ixor
    //   966: tableswitch default -> 938, 1383669080 -> 988, 1383669081 -> 999
    //   988: ldc2_w -1229862810
    //   991: l2i
    //   992: ldc_w -1229862810
    //   995: ixor
    //   996: goto -> 1677
    //   999: getstatic Perryc.1 : I
    //   1002: ifeq -> 1016
    //   1005: ldc2_w -1260235972
    //   1008: l2i
    //   1009: ldc_w 649931449
    //   1012: ixor
    //   1013: goto -> 1024
    //   1016: ldc2_w -1388663717
    //   1019: l2i
    //   1020: ldc_w 1999887318
    //   1023: ixor
    //   1024: ldc2_w -2096258308
    //   1027: l2i
    //   1028: ldc_w -2013164617
    //   1031: ixor
    //   1032: ixor
    //   1033: lookupswitch default -> 3575, -1722593074 -> 1016, -788177210 -> 1060
    //   1060: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.mc : Lnet/minecraft/client/Minecraft;
    //   1063: getstatic Perryc.0 : I
    //   1066: ifle -> 1080
    //   1069: ldc2_w -1392263198
    //   1072: l2i
    //   1073: ldc_w -675577082
    //   1076: ixor
    //   1077: goto -> 1088
    //   1080: ldc2_w 953427846
    //   1083: l2i
    //   1084: ldc_w 542234522
    //   1087: ixor
    //   1088: ldc2_w -876917645
    //   1091: l2i
    //   1092: ldc_w 194032655
    //   1095: ixor
    //   1096: ixor
    //   1097: lookupswitch default -> 3537, -1164721000 -> 1080, -659683232 -> 1124
    //   1124: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1127: getstatic Perryc.1 : I
    //   1130: ifeq -> 1144
    //   1133: ldc2_w -184524908
    //   1136: l2i
    //   1137: ldc_w -1866827820
    //   1140: ixor
    //   1141: goto -> 1152
    //   1144: ldc2_w -684737208
    //   1147: l2i
    //   1148: ldc_w 154508610
    //   1151: ixor
    //   1152: ldc2_w 319919152
    //   1155: l2i
    //   1156: ldc_w 680311905
    //   1159: ixor
    //   1160: ixor
    //   1161: lookupswitch default -> 3553, -444135333 -> 1188, 1579614225 -> 1144
    //   1188: goto -> 1192
    //   1191: athrow
    //   1192: invokestatic getCooldownByWeapon : (Lnet/minecraft/entity/player/EntityPlayer;)I
    //   1195: goto -> 1199
    //   1198: athrow
    //   1199: i2f
    //   1200: getstatic Perryc.0 : I
    //   1203: ifle -> 1217
    //   1206: ldc2_w -1813971951
    //   1209: l2i
    //   1210: ldc_w -1162685225
    //   1213: ixor
    //   1214: goto -> 1225
    //   1217: ldc2_w -2082625267
    //   1220: l2i
    //   1221: ldc_w -500897216
    //   1224: ixor
    //   1225: ldc2_w -455466359
    //   1228: l2i
    //   1229: ldc_w 1500445133
    //   1232: ixor
    //   1233: ixor
    //   1234: lookupswitch default -> 1260, -1796803710 -> 3505, 46722309 -> 1217
    //   1260: aload_0
    //   1261: getstatic Perryc.c : I
    //   1264: iflt -> 1278
    //   1267: ldc2_w 1497753262
    //   1270: l2i
    //   1271: ldc_w 631424858
    //   1274: ixor
    //   1275: goto -> 1286
    //   1278: ldc2_w 299900407
    //   1281: l2i
    //   1282: ldc_w 1304303307
    //   1285: ixor
    //   1286: ldc2_w -575143059
    //   1289: l2i
    //   1290: ldc_w -1123038153
    //   1293: ixor
    //   1294: ixor
    //   1295: lookupswitch default -> 1320, -1258561855 -> 1278, 475066030 -> 3555
    //   1320: getfield tps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1323: getstatic Perryc.c : I
    //   1326: iflt -> 1340
    //   1329: ldc2_w 833126111
    //   1332: l2i
    //   1333: ldc_w -1263139603
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w -1137984005
    //   1343: l2i
    //   1344: ldc_w -226220023
    //   1347: ixor
    //   1348: ldc2_w 1052868423
    //   1351: l2i
    //   1352: ldc_w 1718886815
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 1384, -575986454 -> 3509, 1597883565 -> 1340
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokevirtual getValue : ()Ljava/lang/Object;
    //   1391: goto -> 1395
    //   1394: athrow
    //   1395: checkcast java/lang/Boolean
    //   1398: getstatic Perryc.c : I
    //   1401: iflt -> 1415
    //   1404: ldc2_w -311531066
    //   1407: l2i
    //   1408: ldc_w 822864719
    //   1411: ixor
    //   1412: goto -> 1423
    //   1415: ldc2_w -1685292437
    //   1418: l2i
    //   1419: ldc_w 443722637
    //   1422: ixor
    //   1423: ldc2_w 112824370
    //   1426: l2i
    //   1427: ldc_w 683714901
    //   1430: ixor
    //   1431: ixor
    //   1432: lookupswitch default -> 3571, -1350047615 -> 1460, -232997906 -> 1415
    //   1460: goto -> 1464
    //   1463: athrow
    //   1464: invokevirtual booleanValue : ()Z
    //   1467: goto -> 1471
    //   1470: athrow
    //   1471: ifeq -> 1485
    //   1474: ldc2_w -533383618
    //   1477: l2i
    //   1478: ldc_w 1662630620
    //   1481: ixor
    //   1482: goto -> 1493
    //   1485: ldc2_w 1530027233
    //   1488: l2i
    //   1489: ldc_w -669069308
    //   1492: ixor
    //   1493: ldc2_w -1108734711
    //   1496: l2i
    //   1497: ldc_w 92734328
    //   1500: ixor
    //   1501: ixor
    //   1502: tableswitch default -> 1474, 994149011 -> 1524, 994149012 -> 1662
    //   1524: getstatic Perryc.c : I
    //   1527: iflt -> 1541
    //   1530: ldc2_w -1392487502
    //   1533: l2i
    //   1534: ldc_w 273374303
    //   1537: ixor
    //   1538: goto -> 1549
    //   1541: ldc2_w 1165350696
    //   1544: l2i
    //   1545: ldc_w -830317721
    //   1548: ixor
    //   1549: ldc2_w 322142792
    //   1552: l2i
    //   1553: ldc_w -477942559
    //   1556: ixor
    //   1557: ixor
    //   1558: lookupswitch default -> 1584, -1072390061 -> 1541, 1308336452 -> 3563
    //   1584: getstatic bigname/zprestige/webhack/WebHack.serverManager : Lbigname/zprestige/webhack/manager/ServerManager;
    //   1587: getstatic Perryc.c : I
    //   1590: iflt -> 1604
    //   1593: ldc2_w 678854261
    //   1596: l2i
    //   1597: ldc_w -1028186392
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 33643310
    //   1607: l2i
    //   1608: ldc_w 1149237256
    //   1611: ixor
    //   1612: ldc2_w 449074328
    //   1615: l2i
    //   1616: ldc_w -1335720059
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 3535, -321359813 -> 1648, 1080537984 -> 1604
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual getTpsFactor : ()F
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: goto -> 1675
    //   1662: ldc_w 6.302462
    //   1665: invokestatic floatToIntBits : (F)I
    //   1668: ldc_w 2135535045
    //   1671: ixor
    //   1672: invokestatic intBitsToFloat : (I)F
    //   1675: fmul
    //   1676: f2i
    //   1677: getstatic Perryc.c : I
    //   1680: iflt -> 1694
    //   1683: ldc2_w -891937680
    //   1686: l2i
    //   1687: ldc_w 1517615547
    //   1690: ixor
    //   1691: goto -> 1702
    //   1694: ldc2_w 767723578
    //   1697: l2i
    //   1698: ldc_w -748304425
    //   1701: ixor
    //   1702: ldc2_w 571191514
    //   1705: l2i
    //   1706: ldc_w 158879366
    //   1709: ixor
    //   1710: ixor
    //   1711: lookupswitch default -> 3545, -1143923817 -> 1694, -707481167 -> 1736
    //   1736: istore_1
    //   1737: getstatic Perryc.1 : I
    //   1740: ifeq -> 1754
    //   1743: ldc2_w 1674869137
    //   1746: l2i
    //   1747: ldc_w -670716641
    //   1750: ixor
    //   1751: goto -> 1762
    //   1754: ldc2_w -1465507278
    //   1757: l2i
    //   1758: ldc_w 893230083
    //   1761: ixor
    //   1762: ldc2_w 1505456529
    //   1765: l2i
    //   1766: ldc_w -772361779
    //   1769: ixor
    //   1770: ixor
    //   1771: lookupswitch default -> 3547, 366378605 -> 1796, 865866962 -> 1754
    //   1796: aload_0
    //   1797: getstatic Perryc.1 : I
    //   1800: ifeq -> 1814
    //   1803: ldc2_w -267183437
    //   1806: l2i
    //   1807: ldc_w -293780077
    //   1810: ixor
    //   1811: goto -> 1822
    //   1814: ldc2_w -952270208
    //   1817: l2i
    //   1818: ldc_w 1433544365
    //   1821: ixor
    //   1822: ldc2_w 864040978
    //   1825: l2i
    //   1826: ldc_w -1439920255
    //   1829: ixor
    //   1830: ixor
    //   1831: lookupswitch default -> 3585, -2017269581 -> 1814, 199431102 -> 1856
    //   1856: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   1859: getstatic Perryc.0 : I
    //   1862: ifle -> 1876
    //   1865: ldc2_w -1533381216
    //   1868: l2i
    //   1869: ldc_w 2094326616
    //   1872: ixor
    //   1873: goto -> 1884
    //   1876: ldc2_w 2011796016
    //   1879: l2i
    //   1880: ldc_w 1357419
    //   1883: ixor
    //   1884: ldc2_w 916614042
    //   1887: l2i
    //   1888: ldc_w 1929045873
    //   1891: ixor
    //   1892: ixor
    //   1893: lookupswitch default -> 1920, -1676273133 -> 3521, 617721455 -> 1876
    //   1920: iload_1
    //   1921: i2l
    //   1922: getstatic Perryc.1 : I
    //   1925: ifeq -> 1939
    //   1928: ldc2_w 927744915
    //   1931: l2i
    //   1932: ldc_w 1946779994
    //   1935: ixor
    //   1936: goto -> 1947
    //   1939: ldc2_w 2124870874
    //   1942: l2i
    //   1943: ldc_w 1911700739
    //   1946: ixor
    //   1947: ldc2_w -857224816
    //   1950: l2i
    //   1951: ldc_w 306214153
    //   1954: ixor
    //   1955: ixor
    //   1956: lookupswitch default -> 3513, -1646100912 -> 1939, -772573888 -> 1984
    //   1984: goto -> 1988
    //   1987: athrow
    //   1988: invokevirtual passedMs : (J)Z
    //   1991: goto -> 1995
    //   1994: athrow
    //   1995: ifne -> 2009
    //   1998: ldc2_w 841055473
    //   2001: l2i
    //   2002: ldc_w -236575225
    //   2005: ixor
    //   2006: goto -> 2017
    //   2009: ldc2_w 1234704689
    //   2012: l2i
    //   2013: ldc_w -1973468218
    //   2016: ixor
    //   2017: ldc2_w -1236571194
    //   2020: l2i
    //   2021: ldc_w 1784116952
    //   2024: ixor
    //   2025: ixor
    //   2026: tableswitch default -> 1998, 534464488 -> 2048, 534464489 -> 2049
    //   2048: return
    //   2049: getstatic Perryc.0 : I
    //   2052: ifle -> 2066
    //   2055: ldc2_w 972821386
    //   2058: l2i
    //   2059: ldc_w 1427683026
    //   2062: ixor
    //   2063: goto -> 2074
    //   2066: ldc2_w 1493007318
    //   2069: l2i
    //   2070: ldc_w 2026636281
    //   2073: ixor
    //   2074: ldc2_w -1574244291
    //   2077: l2i
    //   2078: ldc_w 1274157030
    //   2081: ixor
    //   2082: ixor
    //   2083: lookupswitch default -> 3533, -2059648381 -> 2066, -907436044 -> 2108
    //   2108: aload_0
    //   2109: getstatic Perryc.c : I
    //   2112: iflt -> 2126
    //   2115: ldc2_w -551997359
    //   2118: l2i
    //   2119: ldc_w -2014896049
    //   2122: ixor
    //   2123: goto -> 2134
    //   2126: ldc2_w -1594791322
    //   2129: l2i
    //   2130: ldc_w -1504326078
    //   2133: ixor
    //   2134: ldc2_w 1170424279
    //   2137: l2i
    //   2138: ldc_w -1727963157
    //   2141: ixor
    //   2142: ixor
    //   2143: lookupswitch default -> 3523, -2076439006 -> 2126, -630801896 -> 2168
    //   2168: goto -> 2172
    //   2171: athrow
    //   2172: invokespecial getTarget : ()Lnet/minecraft/entity/Entity;
    //   2175: goto -> 2179
    //   2178: athrow
    //   2179: getstatic Perryc.1 : I
    //   2182: ifeq -> 2196
    //   2185: ldc2_w -802747942
    //   2188: l2i
    //   2189: ldc_w 429758730
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w 1967781022
    //   2199: l2i
    //   2200: ldc_w -917208054
    //   2203: ixor
    //   2204: ldc2_w 2121951336
    //   2207: l2i
    //   2208: ldc_w 155335139
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 3557, -1098727077 -> 2196, -886759137 -> 2240
    //   2240: putstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   2243: getstatic Perryc.1 : I
    //   2246: ifeq -> 2260
    //   2249: ldc2_w 1561950059
    //   2252: l2i
    //   2253: ldc_w 2003387095
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w -2073404638
    //   2263: l2i
    //   2264: ldc_w 1484364021
    //   2267: ixor
    //   2268: ldc2_w 512146585
    //   2271: l2i
    //   2272: ldc_w -1762435785
    //   2275: ixor
    //   2276: ixor
    //   2277: lookupswitch default -> 2304, -1776986725 -> 2260, -1576676334 -> 3499
    //   2304: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   2307: ifnonnull -> 2321
    //   2310: ldc2_w 905091204
    //   2313: l2i
    //   2314: ldc_w 2043599986
    //   2317: ixor
    //   2318: goto -> 2329
    //   2321: ldc2_w -924401403
    //   2324: l2i
    //   2325: ldc_w -2066053646
    //   2328: ixor
    //   2329: ldc2_w 509761744
    //   2332: l2i
    //   2333: ldc_w -1503621530
    //   2336: ixor
    //   2337: ixor
    //   2338: tableswitch default -> 2310, -197225920 -> 2360, -197225919 -> 2361
    //   2360: return
    //   2361: getstatic Perryc.c : I
    //   2364: iflt -> 2378
    //   2367: ldc2_w -86250440
    //   2370: l2i
    //   2371: ldc_w 160868448
    //   2374: ixor
    //   2375: goto -> 2386
    //   2378: ldc2_w -585167203
    //   2381: l2i
    //   2382: ldc_w 850008465
    //   2385: ixor
    //   2386: ldc2_w -506990908
    //   2389: l2i
    //   2390: ldc_w -1177881893
    //   2393: ixor
    //   2394: ixor
    //   2395: lookupswitch default -> 3561, -1421846457 -> 2378, -1212675309 -> 2420
    //   2420: aload_0
    //   2421: getstatic Perryc.c : I
    //   2424: iflt -> 2438
    //   2427: ldc2_w 1446229403
    //   2430: l2i
    //   2431: ldc_w -1141376375
    //   2434: ixor
    //   2435: goto -> 2446
    //   2438: ldc2_w -1247983675
    //   2441: l2i
    //   2442: ldc_w -818623217
    //   2445: ixor
    //   2446: ldc2_w 981532344
    //   2449: l2i
    //   2450: ldc_w 610746736
    //   2453: ixor
    //   2454: ixor
    //   2455: lookupswitch default -> 2480, -215748390 -> 3503, 1660207806 -> 2438
    //   2480: getfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2483: getstatic Perryc.1 : I
    //   2486: ifeq -> 2500
    //   2489: ldc2_w -2137980268
    //   2492: l2i
    //   2493: ldc_w -1423068178
    //   2496: ixor
    //   2497: goto -> 2508
    //   2500: ldc2_w 2018087933
    //   2503: l2i
    //   2504: ldc_w 1465293902
    //   2507: ixor
    //   2508: ldc2_w -1894925924
    //   2511: l2i
    //   2512: ldc_w 1796330414
    //   2515: ixor
    //   2516: ixor
    //   2517: lookupswitch default -> 2544, -1598360147 -> 2500, -811541688 -> 3579
    //   2544: goto -> 2548
    //   2547: athrow
    //   2548: invokevirtual getValue : ()Ljava/lang/Object;
    //   2551: goto -> 2555
    //   2554: athrow
    //   2555: checkcast java/lang/Boolean
    //   2558: getstatic Perryc.c : I
    //   2561: iflt -> 2575
    //   2564: ldc2_w 1753995128
    //   2567: l2i
    //   2568: ldc_w 2013820441
    //   2571: ixor
    //   2572: goto -> 2583
    //   2575: ldc2_w -588984235
    //   2578: l2i
    //   2579: ldc_w 963503111
    //   2582: ixor
    //   2583: ldc2_w 1153306670
    //   2586: l2i
    //   2587: ldc_w -1835085726
    //   2590: ixor
    //   2591: ixor
    //   2592: lookupswitch default -> 2620, -1931364728 -> 2575, -962371283 -> 3549
    //   2620: goto -> 2624
    //   2623: athrow
    //   2624: invokevirtual booleanValue : ()Z
    //   2627: goto -> 2631
    //   2630: athrow
    //   2631: ifeq -> 2645
    //   2634: ldc2_w 1956900207
    //   2637: l2i
    //   2638: ldc_w 1840335190
    //   2641: ixor
    //   2642: goto -> 2653
    //   2645: ldc2_w -1403578263
    //   2648: l2i
    //   2649: ldc_w -1253720993
    //   2652: ixor
    //   2653: ldc2_w 1604561162
    //   2656: l2i
    //   2657: ldc_w -873058716
    //   2660: ixor
    //   2661: ixor
    //   2662: tableswitch default -> 2634, -1924717737 -> 2684, -1924717736 -> 2883
    //   2684: getstatic Perryc.1 : I
    //   2687: ifeq -> 2701
    //   2690: ldc2_w -468422361
    //   2693: l2i
    //   2694: ldc_w -1714662029
    //   2697: ixor
    //   2698: goto -> 2709
    //   2701: ldc2_w 751554105
    //   2704: l2i
    //   2705: ldc_w -521707759
    //   2708: ixor
    //   2709: ldc2_w 834863180
    //   2712: l2i
    //   2713: ldc_w -1467019171
    //   2716: ixor
    //   2717: ixor
    //   2718: lookupswitch default -> 3567, -460049339 -> 2701, 1432387897 -> 2744
    //   2744: getstatic bigname/zprestige/webhack/WebHack.rotationManager : Lbigname/zprestige/webhack/manager/RotationManager;
    //   2747: getstatic Perryc.1 : I
    //   2750: ifeq -> 2764
    //   2753: ldc2_w -373956687
    //   2756: l2i
    //   2757: ldc_w -2120132042
    //   2760: ixor
    //   2761: goto -> 2772
    //   2764: ldc2_w -2141383612
    //   2767: l2i
    //   2768: ldc_w -1791631544
    //   2771: ixor
    //   2772: ldc2_w -2102943873
    //   2775: l2i
    //   2776: ldc_w 2095048340
    //   2779: ixor
    //   2780: ixor
    //   2781: lookupswitch default -> 2808, -1771242388 -> 3587, 1568219265 -> 2764
    //   2808: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   2811: getstatic Perryc.0 : I
    //   2814: ifle -> 2828
    //   2817: ldc2_w -1976493202
    //   2820: l2i
    //   2821: ldc_w -1052135358
    //   2824: ixor
    //   2825: goto -> 2836
    //   2828: ldc2_w 224029238
    //   2831: l2i
    //   2832: ldc_w 916820055
    //   2835: ixor
    //   2836: ldc2_w -1840836572
    //   2839: l2i
    //   2840: ldc_w 1404348370
    //   2843: ixor
    //   2844: ixor
    //   2845: lookupswitch default -> 2872, -1970594598 -> 3525, -1130594041 -> 2828
    //   2872: goto -> 2876
    //   2875: athrow
    //   2876: invokevirtual lookAtEntity : (Lnet/minecraft/entity/Entity;)V
    //   2879: goto -> 2883
    //   2882: athrow
    //   2883: getstatic Perryc.1 : I
    //   2886: ifeq -> 2900
    //   2889: ldc2_w -2051528478
    //   2892: l2i
    //   2893: ldc_w -158505472
    //   2896: ixor
    //   2897: goto -> 2908
    //   2900: ldc2_w 154585192
    //   2903: l2i
    //   2904: ldc_w -1460174458
    //   2907: ixor
    //   2908: ldc2_w -1509808774
    //   2911: l2i
    //   2912: ldc_w -544319093
    //   2915: ixor
    //   2916: ixor
    //   2917: lookupswitch default -> 2944, 179909139 -> 3551, 563476749 -> 2900
    //   2944: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   2947: getstatic Perryc.1 : I
    //   2950: ifeq -> 2964
    //   2953: ldc2_w -1309477829
    //   2956: l2i
    //   2957: ldc_w -1271777583
    //   2960: ixor
    //   2961: goto -> 2972
    //   2964: ldc2_w -815397735
    //   2967: l2i
    //   2968: ldc_w -417809282
    //   2971: ixor
    //   2972: ldc2_w 728554208
    //   2975: l2i
    //   2976: ldc_w 289471267
    //   2979: ixor
    //   2980: ixor
    //   2981: lookupswitch default -> 3515, 307403044 -> 3008, 1072489257 -> 2964
    //   3008: aload_0
    //   3009: getstatic Perryc.c : I
    //   3012: iflt -> 3026
    //   3015: ldc2_w -319329576
    //   3018: l2i
    //   3019: ldc_w -2015837680
    //   3022: ixor
    //   3023: goto -> 3034
    //   3026: ldc2_w 1424619505
    //   3029: l2i
    //   3030: ldc_w 586648687
    //   3033: ixor
    //   3034: ldc2_w 1884279497
    //   3037: l2i
    //   3038: ldc_w -763330887
    //   3041: ixor
    //   3042: ixor
    //   3043: lookupswitch default -> 3565, -908065608 -> 3026, -724445202 -> 3068
    //   3068: getfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3071: getstatic Perryc.c : I
    //   3074: iflt -> 3088
    //   3077: ldc2_w -816963185
    //   3080: l2i
    //   3081: ldc_w -1308776037
    //   3084: ixor
    //   3085: goto -> 3096
    //   3088: ldc2_w -2089188220
    //   3091: l2i
    //   3092: ldc_w 51067601
    //   3095: ixor
    //   3096: ldc2_w 65088314
    //   3099: l2i
    //   3100: ldc_w -419601661
    //   3103: ixor
    //   3104: ixor
    //   3105: lookupswitch default -> 3569, -1682980819 -> 3088, 1701770860 -> 3132
    //   3132: goto -> 3136
    //   3135: athrow
    //   3136: invokevirtual getValue : ()Ljava/lang/Object;
    //   3139: goto -> 3143
    //   3142: athrow
    //   3143: checkcast java/lang/Boolean
    //   3146: getstatic Perryc.c : I
    //   3149: iflt -> 3163
    //   3152: ldc2_w 647221807
    //   3155: l2i
    //   3156: ldc_w 1937711274
    //   3159: ixor
    //   3160: goto -> 3171
    //   3163: ldc2_w -1381690871
    //   3166: l2i
    //   3167: ldc_w 299666003
    //   3170: ixor
    //   3171: ldc2_w 1661201703
    //   3174: l2i
    //   3175: ldc_w -1288041823
    //   3178: ixor
    //   3179: ixor
    //   3180: lookupswitch default -> 3539, -2049633021 -> 3163, 1816166364 -> 3208
    //   3208: goto -> 3212
    //   3211: athrow
    //   3212: invokevirtual booleanValue : ()Z
    //   3215: goto -> 3219
    //   3218: athrow
    //   3219: ldc2_w -526078706
    //   3222: l2i
    //   3223: ldc_w -526078705
    //   3226: ixor
    //   3227: getstatic Perryc.c : I
    //   3230: iflt -> 3244
    //   3233: ldc2_w 2045615791
    //   3236: l2i
    //   3237: ldc_w 841490536
    //   3240: ixor
    //   3241: goto -> 3252
    //   3244: ldc2_w 221176602
    //   3247: l2i
    //   3248: ldc_w -1658758383
    //   3251: ixor
    //   3252: ldc2_w -770020114
    //   3255: l2i
    //   3256: ldc_w 688863561
    //   3259: ixor
    //   3260: ixor
    //   3261: lookupswitch default -> 3288, -1328485536 -> 3581, -214654448 -> 3244
    //   3288: goto -> 3292
    //   3291: athrow
    //   3292: invokestatic attackEntity : (Lnet/minecraft/entity/Entity;ZZ)V
    //   3295: goto -> 3299
    //   3298: athrow
    //   3299: getstatic Perryc.c : I
    //   3302: iflt -> 3316
    //   3305: ldc2_w -1999856865
    //   3308: l2i
    //   3309: ldc_w -597778158
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w -330322942
    //   3319: l2i
    //   3320: ldc_w 1263790689
    //   3323: ixor
    //   3324: ldc2_w -270809363
    //   3327: l2i
    //   3328: ldc_w 697379803
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, -1831282885 -> 3577, -1605235054 -> 3316
    //   3360: aload_0
    //   3361: getstatic Perryc.0 : I
    //   3364: ifle -> 3378
    //   3367: ldc2_w 1274866975
    //   3370: l2i
    //   3371: ldc_w -870297783
    //   3374: ixor
    //   3375: goto -> 3386
    //   3378: ldc2_w 49826996
    //   3381: l2i
    //   3382: ldc_w -1471920288
    //   3385: ixor
    //   3386: ldc2_w -307458358
    //   3389: l2i
    //   3390: ldc_w 746491923
    //   3393: ixor
    //   3394: ixor
    //   3395: lookupswitch default -> 3420, -538937346 -> 3378, 1175370895 -> 3583
    //   3420: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   3423: getstatic Perryc.c : I
    //   3426: iflt -> 3440
    //   3429: ldc2_w -1623295245
    //   3432: l2i
    //   3433: ldc_w 1031101146
    //   3436: ixor
    //   3437: goto -> 3448
    //   3440: ldc2_w -1385041921
    //   3443: l2i
    //   3444: ldc_w 1598561543
    //   3447: ixor
    //   3448: ldc2_w -442434310
    //   3451: l2i
    //   3452: ldc_w 1449538982
    //   3455: ixor
    //   3456: ixor
    //   3457: lookupswitch default -> 3484, 294513013 -> 3559, 1072860334 -> 3440
    //   3484: goto -> 3488
    //   3487: athrow
    //   3488: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   3491: goto -> 3495
    //   3494: athrow
    //   3495: pop
    //   3496: return
    //   3497: aconst_null
    //   3498: athrow
    //   3499: aconst_null
    //   3500: athrow
    //   3501: aconst_null
    //   3502: athrow
    //   3503: aconst_null
    //   3504: athrow
    //   3505: aconst_null
    //   3506: athrow
    //   3507: aconst_null
    //   3508: athrow
    //   3509: aconst_null
    //   3510: athrow
    //   3511: aconst_null
    //   3512: athrow
    //   3513: aconst_null
    //   3514: athrow
    //   3515: aconst_null
    //   3516: athrow
    //   3517: aconst_null
    //   3518: athrow
    //   3519: aconst_null
    //   3520: athrow
    //   3521: aconst_null
    //   3522: athrow
    //   3523: aconst_null
    //   3524: athrow
    //   3525: aconst_null
    //   3526: athrow
    //   3527: aconst_null
    //   3528: athrow
    //   3529: aconst_null
    //   3530: athrow
    //   3531: aconst_null
    //   3532: athrow
    //   3533: aconst_null
    //   3534: athrow
    //   3535: aconst_null
    //   3536: athrow
    //   3537: aconst_null
    //   3538: athrow
    //   3539: aconst_null
    //   3540: athrow
    //   3541: aconst_null
    //   3542: athrow
    //   3543: aconst_null
    //   3544: athrow
    //   3545: aconst_null
    //   3546: athrow
    //   3547: aconst_null
    //   3548: athrow
    //   3549: aconst_null
    //   3550: athrow
    //   3551: aconst_null
    //   3552: athrow
    //   3553: aconst_null
    //   3554: athrow
    //   3555: aconst_null
    //   3556: athrow
    //   3557: aconst_null
    //   3558: athrow
    //   3559: aconst_null
    //   3560: athrow
    //   3561: aconst_null
    //   3562: athrow
    //   3563: aconst_null
    //   3564: athrow
    //   3565: aconst_null
    //   3566: athrow
    //   3567: aconst_null
    //   3568: athrow
    //   3569: aconst_null
    //   3570: athrow
    //   3571: aconst_null
    //   3572: athrow
    //   3573: aconst_null
    //   3574: athrow
    //   3575: aconst_null
    //   3576: athrow
    //   3577: aconst_null
    //   3578: athrow
    //   3579: aconst_null
    //   3580: athrow
    //   3581: aconst_null
    //   3582: athrow
    //   3583: aconst_null
    //   3584: athrow
    //   3585: aconst_null
    //   3586: athrow
    //   3587: aconst_null
    //   3588: athrow
    //   3589: pop
    //   3590: goto -> 24
    //   3593: pop
    //   3594: aconst_null
    //   3595: goto -> 3589
    //   3598: dup
    //   3599: ifnull -> 3589
    //   3602: checkcast java/lang/Throwable
    //   3605: athrow
    //   3606: dup
    //   3607: ifnull -> 3593
    //   3610: checkcast java/lang/Throwable
    //   3613: athrow
    //   3614: aconst_null
    //   3615: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3473	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Killaura;
    //   1737	1760	1	wait	I
    // Exception table:
    //   from	to	target	type
    //   8	20	3598	finally
    //   211	218	218	finally
    //   211	218	211	java/lang/ArrayIndexOutOfBoundsException
    //   211	218	218	java/lang/UnsupportedOperationException
    //   212	218	211	finally
    //   212	218	218	java/lang/EnumConstantNotPresentException
    //   288	294	294	finally
    //   288	294	3	finally
    //   288	294	294	java/lang/ArithmeticException
    //   288	294	294	java/lang/IllegalArgumentException
    //   288	294	294	java/lang/ClassCastException
    //   539	546	546	finally
    //   539	546	546	finally
    //   539	546	539	java/lang/StringIndexOutOfBoundsException
    //   540	546	546	finally
    //   540	546	546	finally
    //   851	858	858	finally
    //   851	858	858	java/lang/UnsupportedOperationException
    //   852	858	3	java/lang/IllegalStateException
    //   852	858	851	java/lang/ArithmeticException
    //   852	858	3	java/lang/IllegalArgumentException
    //   927	934	934	finally
    //   928	934	3	finally
    //   928	934	934	java/lang/ArithmeticException
    //   928	934	934	finally
    //   928	934	927	java/lang/ArrayIndexOutOfBoundsException
    //   1191	1198	1198	finally
    //   1191	1198	3	java/lang/StringIndexOutOfBoundsException
    //   1192	1198	3	finally
    //   1192	1198	1198	finally
    //   1192	1198	1191	finally
    //   1387	1394	1394	finally
    //   1387	1394	1387	finally
    //   1388	1394	1394	java/util/NoSuchElementException
    //   1388	1394	1394	finally
    //   1388	1394	1394	finally
    //   1463	1470	1470	finally
    //   1463	1470	3	java/lang/ClassCastException
    //   1463	1470	3	java/lang/ArrayIndexOutOfBoundsException
    //   1464	1470	1463	finally
    //   1464	1470	1463	java/lang/ArrayIndexOutOfBoundsException
    //   1651	1658	1658	finally
    //   1651	1658	1651	finally
    //   1651	1658	1658	java/lang/AssertionError
    //   1652	1658	1651	finally
    //   1652	1658	1658	finally
    //   1987	1994	1994	finally
    //   1987	1994	3	finally
    //   1987	1994	1987	finally
    //   1987	1994	1987	finally
    //   1988	1994	1994	java/lang/ClassCastException
    //   2171	2178	2178	finally
    //   2171	2178	2178	java/lang/NegativeArraySizeException
    //   2171	2178	3	finally
    //   2172	2178	2171	finally
    //   2172	2178	2171	finally
    //   2548	2554	2554	finally
    //   2548	2554	2554	finally
    //   2548	2554	3	java/lang/NullPointerException
    //   2548	2554	2554	java/lang/ClassCastException
    //   2548	2554	2554	finally
    //   2623	2630	2630	finally
    //   2623	2630	2623	finally
    //   2624	2630	3	java/util/NoSuchElementException
    //   2624	2630	3	java/lang/ArrayIndexOutOfBoundsException
    //   2624	2630	2630	java/lang/ArrayIndexOutOfBoundsException
    //   2876	2882	2882	finally
    //   2876	2882	2882	java/lang/AssertionError
    //   2876	2882	3	java/lang/UnsupportedOperationException
    //   2876	2882	3	java/lang/EnumConstantNotPresentException
    //   2876	2882	2882	java/lang/ArrayIndexOutOfBoundsException
    //   3135	3142	3142	finally
    //   3135	3142	3142	finally
    //   3136	3142	3135	java/lang/RuntimeException
    //   3136	3142	3	java/lang/NumberFormatException
    //   3136	3142	3135	finally
    //   3211	3218	3218	finally
    //   3211	3218	3	finally
    //   3212	3218	3211	finally
    //   3212	3218	3218	finally
    //   3212	3218	3	java/lang/AssertionError
    //   3291	3298	3298	finally
    //   3292	3298	3298	java/lang/IndexOutOfBoundsException
    //   3292	3298	3291	finally
    //   3292	3298	3	finally
    //   3292	3298	3298	finally
    //   3488	3494	3494	finally
    //   3488	3494	3	finally
    //   3488	3494	3494	java/lang/ArithmeticException
    //   3488	3494	3494	java/lang/IllegalStateException
    //   3488	3494	3494	java/lang/ArithmeticException
    //   3598	3606	3598	finally
    //   3614	3616	3	finally
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayerEvent(UpdateWalkingPlayerEvent event) {
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
  
  public Killaura() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 173721954
    //   9: l2i
    //   10: ldc_w -1661064195
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -2116686685
    //   20: l2i
    //   21: ldc_w -903262176
    //   24: ixor
    //   25: ldc2_w 1286224696
    //   28: l2i
    //   29: ldc_w -351078223
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 808637139 -> 17, 823927062 -> 6482
    //   60: aload_0
    //   61: ldc_w '㌚㶻厔િ๫馺'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 778024212
    //   73: l2i
    //   74: ldc_w 47767259
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1751070329
    //   84: l2i
    //   85: ldc_w 1174014821
    //   88: ixor
    //   89: ldc2_w -2521756
    //   92: l2i
    //   93: ldc_w 892242141
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 6542, -428841354 -> 81, -414043995 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '㌚㶻历૪๸馮蹱ཪ岃'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -1661818532
    //   139: l2i
    //   140: ldc_w -1733936924
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1190120259
    //   150: l2i
    //   151: ldc_w 393501413
    //   154: ixor
    //   155: ldc2_w -101186314
    //   158: l2i
    //   159: ldc_w -455347178
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 6394, 427254104 -> 147, 1287151942 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 374284654
    //   204: l2i
    //   205: ldc_w 212348630
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1595990445
    //   215: l2i
    //   216: ldc_w 665218220
    //   219: ixor
    //   220: ldc2_w -1491717087
    //   223: l2i
    //   224: ldc_w 1813659823
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -773096650 -> 6496, -666936548 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1109613135
    //   262: l2i
    //   263: ldc_w -1109613136
    //   266: ixor
    //   267: ldc2_w 1470619999
    //   270: l2i
    //   271: ldc_w 1470619999
    //   274: ixor
    //   275: ldc2_w 466587876
    //   278: l2i
    //   279: ldc_w 466587876
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 1218474252
    //   292: l2i
    //   293: ldc_w 1316473299
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1854491543
    //   303: l2i
    //   304: ldc_w -70755073
    //   307: ixor
    //   308: ldc2_w 1589132302
    //   311: l2i
    //   312: ldc_w 1609378107
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 6514, 126004714 -> 300, 1810628003 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -340473157
    //   356: l2i
    //   357: ldc_w -1681643090
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -985903388
    //   367: l2i
    //   368: ldc_w -1659276239
    //   371: ixor
    //   372: ldc2_w -1093143046
    //   375: l2i
    //   376: ldc_w -1519485351
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1655419772 -> 364, 1808361654 -> 6490
    //   408: aload_0
    //   409: new bigname/zprestige/webhack/util/Timer
    //   412: dup
    //   413: getstatic Perryc.c : I
    //   416: iflt -> 430
    //   419: ldc2_w 1464518888
    //   422: l2i
    //   423: ldc_w -355959511
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w 1544610296
    //   433: l2i
    //   434: ldc_w -1961225346
    //   437: ixor
    //   438: ldc2_w 753319415
    //   441: l2i
    //   442: ldc_w -452346633
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 472, -1055730823 -> 430, 1953346753 -> 6576
    //   472: invokespecial <init> : ()V
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w 268431072
    //   484: l2i
    //   485: ldc_w -430724382
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 922414532
    //   495: l2i
    //   496: ldc_w 170482938
    //   499: ixor
    //   500: ldc2_w -1892875796
    //   503: l2i
    //   504: ldc_w -1290281226
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, -711550184 -> 6520, 1095225600 -> 492
    //   536: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w 581930035
    //   548: l2i
    //   549: ldc_w -643375751
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w -1544634171
    //   559: l2i
    //   560: ldc_w 156999414
    //   563: ixor
    //   564: ldc2_w -1754864886
    //   567: l2i
    //   568: ldc_w 148024933
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 6468, 889262940 -> 600, 1690115109 -> 556
    //   600: aload_0
    //   601: getstatic Perryc.c : I
    //   604: iflt -> 618
    //   607: ldc2_w 865262189
    //   610: l2i
    //   611: ldc_w -1147736342
    //   614: ixor
    //   615: goto -> 626
    //   618: ldc2_w -136395242
    //   621: l2i
    //   622: ldc_w 1033802147
    //   625: ixor
    //   626: ldc2_w -155747272
    //   629: l2i
    //   630: ldc_w 1102070112
    //   633: ixor
    //   634: ixor
    //   635: lookupswitch default -> 6562, 1057163743 -> 618, 2101832429 -> 660
    //   660: aload_0
    //   661: new bigname/zprestige/webhack/features/setting/Setting
    //   664: dup
    //   665: ldc_w '㌒㶰厐'
    //   668: getstatic Perryc.0 : I
    //   671: ifle -> 685
    //   674: ldc2_w 744845276
    //   677: l2i
    //   678: ldc_w 342937613
    //   681: ixor
    //   682: goto -> 693
    //   685: ldc2_w -536826257
    //   688: l2i
    //   689: ldc_w -24918447
    //   692: ixor
    //   693: ldc2_w -1707634770
    //   696: l2i
    //   697: ldc_w 515924273
    //   700: ixor
    //   701: ixor
    //   702: lookupswitch default -> 6478, -1703639391 -> 728, -1126018738 -> 685
    //   728: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   731: ldc_w 0.4311777
    //   734: invokestatic floatToIntBits : (F)I
    //   737: ldc_w 2115814227
    //   740: ixor
    //   741: invokestatic intBitsToFloat : (I)F
    //   744: getstatic Perryc.0 : I
    //   747: ifle -> 761
    //   750: ldc2_w -472397024
    //   753: l2i
    //   754: ldc_w -1841466455
    //   757: ixor
    //   758: goto -> 769
    //   761: ldc2_w -1053766972
    //   764: l2i
    //   765: ldc_w -514411521
    //   768: ixor
    //   769: ldc2_w 776722156
    //   772: l2i
    //   773: ldc_w -649152536
    //   776: ixor
    //   777: ixor
    //   778: lookupswitch default -> 6470, -2031101555 -> 761, -681371585 -> 804
    //   804: invokestatic valueOf : (F)Ljava/lang/Float;
    //   807: ldc_w 2.9172482
    //   810: invokestatic floatToIntBits : (F)I
    //   813: ldc_w 2113304831
    //   816: ixor
    //   817: invokestatic intBitsToFloat : (I)F
    //   820: getstatic Perryc.0 : I
    //   823: ifle -> 837
    //   826: ldc2_w -1946357964
    //   829: l2i
    //   830: ldc_w -2033671725
    //   833: ixor
    //   834: goto -> 845
    //   837: ldc2_w 994489910
    //   840: l2i
    //   841: ldc_w -215718444
    //   844: ixor
    //   845: ldc2_w -1269053589
    //   848: l2i
    //   849: ldc_w 1068158813
    //   852: ixor
    //   853: ixor
    //   854: lookupswitch default -> 880, -2033891631 -> 6456, -2019006528 -> 837
    //   880: invokestatic valueOf : (F)Ljava/lang/Float;
    //   883: ldc_w 0.13375811
    //   886: invokestatic floatToIntBits : (F)I
    //   889: ldc_w 2129197027
    //   892: ixor
    //   893: invokestatic intBitsToFloat : (I)F
    //   896: getstatic Perryc.0 : I
    //   899: ifle -> 913
    //   902: ldc2_w -302569786
    //   905: l2i
    //   906: ldc_w -723496360
    //   909: ixor
    //   910: goto -> 921
    //   913: ldc2_w -1810441709
    //   916: l2i
    //   917: ldc_w -402175191
    //   920: ixor
    //   921: ldc2_w 693871707
    //   924: l2i
    //   925: ldc_w 72971681
    //   928: ixor
    //   929: ixor
    //   930: lookupswitch default -> 956, 336962916 -> 6528, 1303066290 -> 913
    //   956: invokestatic valueOf : (F)Ljava/lang/Float;
    //   959: getstatic Perryc.0 : I
    //   962: ifle -> 976
    //   965: ldc2_w -2130490287
    //   968: l2i
    //   969: ldc_w -1176906986
    //   972: ixor
    //   973: goto -> 984
    //   976: ldc2_w 290401138
    //   979: l2i
    //   980: ldc_w 471275652
    //   983: ixor
    //   984: ldc2_w -1626618303
    //   987: l2i
    //   988: ldc_w 121495319
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 6548, -1787942240 -> 1020, -1595111919 -> 976
    //   1020: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1023: getstatic Perryc.1 : I
    //   1026: ifeq -> 1040
    //   1029: ldc2_w 510232261
    //   1032: l2i
    //   1033: ldc_w -862943980
    //   1036: ixor
    //   1037: goto -> 1048
    //   1040: ldc2_w -726200716
    //   1043: l2i
    //   1044: ldc_w -146013233
    //   1047: ixor
    //   1048: ldc2_w 1557905931
    //   1051: l2i
    //   1052: ldc_w 1128561195
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 6530, -848905231 -> 1040, 1013233051 -> 1084
    //   1084: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1087: getstatic Perryc.0 : I
    //   1090: ifle -> 1104
    //   1093: ldc2_w -498420634
    //   1096: l2i
    //   1097: ldc_w 669443089
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w -403883006
    //   1107: l2i
    //   1108: ldc_w -1374214173
    //   1111: ixor
    //   1112: ldc2_w -1845535841
    //   1115: l2i
    //   1116: ldc_w -1336751028
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 6508, -469645404 -> 1104, 1750567986 -> 1148
    //   1148: putfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1151: getstatic Perryc.1 : I
    //   1154: ifeq -> 1168
    //   1157: ldc2_w -1146956883
    //   1160: l2i
    //   1161: ldc_w -51925334
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w 16582192
    //   1171: l2i
    //   1172: ldc_w 1098864602
    //   1175: ixor
    //   1176: ldc2_w 2020507868
    //   1179: l2i
    //   1180: ldc_w 84207903
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 1212, 976164036 -> 6552, 2029063434 -> 1168
    //   1212: aload_0
    //   1213: getstatic Perryc.0 : I
    //   1216: ifle -> 1230
    //   1219: ldc2_w -1069665413
    //   1222: l2i
    //   1223: ldc_w 1328635838
    //   1226: ixor
    //   1227: goto -> 1238
    //   1230: ldc2_w 1003171370
    //   1233: l2i
    //   1234: ldc_w -1754788378
    //   1237: ixor
    //   1238: ldc2_w 2042113268
    //   1241: l2i
    //   1242: ldc_w -1896918994
    //   1245: ixor
    //   1246: ixor
    //   1247: lookupswitch default -> 1272, 567504330 -> 1230, 2019037215 -> 6404
    //   1272: aload_0
    //   1273: new bigname/zprestige/webhack/features/setting/Setting
    //   1276: dup
    //   1277: ldc_w '㌚㶓厐દ๸馢'
    //   1280: getstatic Perryc.0 : I
    //   1283: ifle -> 1297
    //   1286: ldc2_w 2137173875
    //   1289: l2i
    //   1290: ldc_w 914316999
    //   1293: ixor
    //   1294: goto -> 1305
    //   1297: ldc2_w -861191072
    //   1300: l2i
    //   1301: ldc_w -1409839318
    //   1304: ixor
    //   1305: ldc2_w 746679401
    //   1308: l2i
    //   1309: ldc_w -648489135
    //   1312: ixor
    //   1313: ixor
    //   1314: lookupswitch default -> 1340, -1377909431 -> 1297, -1127986548 -> 6458
    //   1340: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1343: ldc2_w -244827350
    //   1346: l2i
    //   1347: ldc_w -244827349
    //   1350: ixor
    //   1351: getstatic Perryc.0 : I
    //   1354: ifle -> 1368
    //   1357: ldc2_w -645250367
    //   1360: l2i
    //   1361: ldc_w 463295292
    //   1364: ixor
    //   1365: goto -> 1376
    //   1368: ldc2_w -1162436236
    //   1371: l2i
    //   1372: ldc_w -1220493628
    //   1375: ixor
    //   1376: ldc2_w -49206638
    //   1379: l2i
    //   1380: ldc_w 430052831
    //   1383: ixor
    //   1384: ixor
    //   1385: lookupswitch default -> 1412, -194919920 -> 1368, 648294064 -> 6410
    //   1412: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1415: getstatic Perryc.1 : I
    //   1418: ifeq -> 1432
    //   1421: ldc2_w -731880238
    //   1424: l2i
    //   1425: ldc_w -131363681
    //   1428: ixor
    //   1429: goto -> 1440
    //   1432: ldc2_w 812714827
    //   1435: l2i
    //   1436: ldc_w 1447810177
    //   1439: ixor
    //   1440: ldc2_w -338103325
    //   1443: l2i
    //   1444: ldc_w -1503424374
    //   1447: ixor
    //   1448: ixor
    //   1449: lookupswitch default -> 6512, 729922723 -> 1476, 1643154212 -> 1432
    //   1476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1479: getstatic Perryc.1 : I
    //   1482: ifeq -> 1496
    //   1485: ldc2_w 1942802441
    //   1488: l2i
    //   1489: ldc_w -1470961966
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w 579298389
    //   1499: l2i
    //   1500: ldc_w 84414482
    //   1503: ixor
    //   1504: ldc2_w -1740684947
    //   1507: l2i
    //   1508: ldc_w -1831857337
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 6564, -781097743 -> 1496, 761276013 -> 1540
    //   1540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1543: getstatic Perryc.1 : I
    //   1546: ifeq -> 1560
    //   1549: ldc2_w -1660598296
    //   1552: l2i
    //   1553: ldc_w 1943355876
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w -317800243
    //   1563: l2i
    //   1564: ldc_w -1027213400
    //   1567: ixor
    //   1568: ldc2_w 433618824
    //   1571: l2i
    //   1572: ldc_w -1788440228
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 1604, -1018625452 -> 1560, 1651435736 -> 6538
    //   1604: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1607: getstatic Perryc.c : I
    //   1610: iflt -> 1624
    //   1613: ldc2_w 4694209
    //   1616: l2i
    //   1617: ldc_w -584839616
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w 2093435740
    //   1627: l2i
    //   1628: ldc_w 651760438
    //   1631: ixor
    //   1632: ldc2_w 779637202
    //   1635: l2i
    //   1636: ldc_w -176238076
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 6422, -2129077316 -> 1668, 107294039 -> 1624
    //   1668: aload_0
    //   1669: getstatic Perryc.c : I
    //   1672: iflt -> 1686
    //   1675: ldc2_w 883447316
    //   1678: l2i
    //   1679: ldc_w 1383261252
    //   1682: ixor
    //   1683: goto -> 1694
    //   1686: ldc2_w 259989714
    //   1689: l2i
    //   1690: ldc_w -620257870
    //   1693: ixor
    //   1694: ldc2_w 1403581017
    //   1697: l2i
    //   1698: ldc_w -904999972
    //   1701: ixor
    //   1702: ixor
    //   1703: lookupswitch default -> 6400, -8614955 -> 1686, 1306428645 -> 1728
    //   1728: aload_0
    //   1729: new bigname/zprestige/webhack/features/setting/Setting
    //   1732: dup
    //   1733: ldc_w '㌜㶶厁ય'
    //   1736: getstatic Perryc.1 : I
    //   1739: ifeq -> 1753
    //   1742: ldc2_w -397724907
    //   1745: l2i
    //   1746: ldc_w 782744266
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -877778953
    //   1756: l2i
    //   1757: ldc_w 318652729
    //   1760: ixor
    //   1761: ldc2_w -1074900705
    //   1764: l2i
    //   1765: ldc_w 532443487
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 6574, 1723771295 -> 1753, 2030192270 -> 1796
    //   1796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1799: ldc2_w 1126035420
    //   1802: l2i
    //   1803: ldc_w 1126035421
    //   1806: ixor
    //   1807: getstatic Perryc.0 : I
    //   1810: ifle -> 1824
    //   1813: ldc2_w -1757176854
    //   1816: l2i
    //   1817: ldc_w -1489792647
    //   1820: ixor
    //   1821: goto -> 1832
    //   1824: ldc2_w 165804888
    //   1827: l2i
    //   1828: ldc_w -266087352
    //   1831: ixor
    //   1832: ldc2_w 1514886448
    //   1835: l2i
    //   1836: ldc_w -637895418
    //   1839: ixor
    //   1840: ixor
    //   1841: lookupswitch default -> 1868, -1279188315 -> 6398, -378662205 -> 1824
    //   1868: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1871: getstatic Perryc.0 : I
    //   1874: ifle -> 1888
    //   1877: ldc2_w 556462752
    //   1880: l2i
    //   1881: ldc_w 1342749485
    //   1884: ixor
    //   1885: goto -> 1896
    //   1888: ldc2_w 663282741
    //   1891: l2i
    //   1892: ldc_w 1822578210
    //   1895: ixor
    //   1896: ldc2_w 208658662
    //   1899: l2i
    //   1900: ldc_w -1586054026
    //   1903: ixor
    //   1904: ixor
    //   1905: lookupswitch default -> 6442, -600107747 -> 1888, -432804217 -> 1932
    //   1932: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1935: getstatic Perryc.0 : I
    //   1938: ifle -> 1952
    //   1941: ldc2_w -1479695113
    //   1944: l2i
    //   1945: ldc_w -330828223
    //   1948: ixor
    //   1949: goto -> 1960
    //   1952: ldc2_w 1547069069
    //   1955: l2i
    //   1956: ldc_w 1382902551
    //   1959: ixor
    //   1960: ldc2_w 117505413
    //   1963: l2i
    //   1964: ldc_w 1820649086
    //   1967: ixor
    //   1968: ixor
    //   1969: lookupswitch default -> 6516, 537807181 -> 1952, 1709119073 -> 1996
    //   1996: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1999: getstatic Perryc.0 : I
    //   2002: ifle -> 2016
    //   2005: ldc2_w -422006463
    //   2008: l2i
    //   2009: ldc_w -1204085774
    //   2012: ixor
    //   2013: goto -> 2024
    //   2016: ldc2_w 1628921879
    //   2019: l2i
    //   2020: ldc_w 1115816838
    //   2023: ixor
    //   2024: ldc2_w -1399313929
    //   2027: l2i
    //   2028: ldc_w -1105770332
    //   2031: ixor
    //   2032: ixor
    //   2033: lookupswitch default -> 6474, 823788226 -> 2060, 1282198496 -> 2016
    //   2060: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2063: getstatic Perryc.c : I
    //   2066: iflt -> 2080
    //   2069: ldc2_w -1535423922
    //   2072: l2i
    //   2073: ldc_w -108664510
    //   2076: ixor
    //   2077: goto -> 2088
    //   2080: ldc2_w -1436142569
    //   2083: l2i
    //   2084: ldc_w -1517521939
    //   2087: ixor
    //   2088: ldc2_w 139283663
    //   2091: l2i
    //   2092: ldc_w -16485373
    //   2095: ixor
    //   2096: ixor
    //   2097: lookupswitch default -> 2124, -1430807616 -> 6532, -1319467722 -> 2080
    //   2124: aload_0
    //   2125: getstatic Perryc.1 : I
    //   2128: ifeq -> 2142
    //   2131: ldc2_w -2072592527
    //   2134: l2i
    //   2135: ldc_w 1365311488
    //   2138: ixor
    //   2139: goto -> 2150
    //   2142: ldc2_w 725973409
    //   2145: l2i
    //   2146: ldc_w 1698580872
    //   2149: ixor
    //   2150: ldc2_w 1988869983
    //   2153: l2i
    //   2154: ldc_w -1000947275
    //   2157: ixor
    //   2158: ixor
    //   2159: lookupswitch default -> 2184, 1680523470 -> 2142, 1741341083 -> 6522
    //   2184: aload_0
    //   2185: new bigname/zprestige/webhack/features/setting/Setting
    //   2188: dup
    //   2189: ldc_w '㌄㶥厑અ๷馷蹺'
    //   2192: getstatic Perryc.1 : I
    //   2195: ifeq -> 2209
    //   2198: ldc2_w -1789925434
    //   2201: l2i
    //   2202: ldc_w 82700410
    //   2205: ixor
    //   2206: goto -> 2217
    //   2209: ldc2_w 2001992124
    //   2212: l2i
    //   2213: ldc_w -697224929
    //   2216: ixor
    //   2217: ldc2_w 1417856885
    //   2220: l2i
    //   2221: ldc_w 933469652
    //   2224: ixor
    //   2225: ixor
    //   2226: lookupswitch default -> 6420, -1039953406 -> 2252, -226274019 -> 2209
    //   2252: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2255: ldc2_w 1762384672
    //   2258: l2i
    //   2259: ldc_w 1762384673
    //   2262: ixor
    //   2263: getstatic Perryc.c : I
    //   2266: iflt -> 2280
    //   2269: ldc2_w 811181618
    //   2272: l2i
    //   2273: ldc_w 1232309997
    //   2276: ixor
    //   2277: goto -> 2288
    //   2280: ldc2_w 959997749
    //   2283: l2i
    //   2284: ldc_w -1173673024
    //   2287: ixor
    //   2288: ldc2_w 92230751
    //   2291: l2i
    //   2292: ldc_w -34537953
    //   2295: ixor
    //   2296: ixor
    //   2297: lookupswitch default -> 6540, -2119859553 -> 2280, 2075977397 -> 2324
    //   2324: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2327: getstatic Perryc.0 : I
    //   2330: ifle -> 2344
    //   2333: ldc2_w -208324085
    //   2336: l2i
    //   2337: ldc_w -1149882542
    //   2340: ixor
    //   2341: goto -> 2352
    //   2344: ldc2_w -1006023474
    //   2347: l2i
    //   2348: ldc_w -1987769714
    //   2351: ixor
    //   2352: ldc2_w -1173323631
    //   2355: l2i
    //   2356: ldc_w -29060742
    //   2359: ixor
    //   2360: ixor
    //   2361: lookupswitch default -> 2388, 213320882 -> 6536, 1215157624 -> 2344
    //   2388: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2391: getstatic Perryc.0 : I
    //   2394: ifle -> 2408
    //   2397: ldc2_w -2035824365
    //   2400: l2i
    //   2401: ldc_w -1269383510
    //   2404: ixor
    //   2405: goto -> 2416
    //   2408: ldc2_w 906929201
    //   2411: l2i
    //   2412: ldc_w 1554249196
    //   2415: ixor
    //   2416: ldc2_w -1765667635
    //   2419: l2i
    //   2420: ldc_w -1273848549
    //   2423: ixor
    //   2424: ixor
    //   2425: lookupswitch default -> 2452, -354470697 -> 2408, 270657135 -> 6558
    //   2452: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2455: getstatic Perryc.c : I
    //   2458: iflt -> 2472
    //   2461: ldc2_w -2084436340
    //   2464: l2i
    //   2465: ldc_w 13608236
    //   2468: ixor
    //   2469: goto -> 2480
    //   2472: ldc2_w 109679923
    //   2475: l2i
    //   2476: ldc_w -945046792
    //   2479: ixor
    //   2480: ldc2_w -765593455
    //   2483: l2i
    //   2484: ldc_w -1997937841
    //   2487: ixor
    //   2488: ixor
    //   2489: lookupswitch default -> 6534, -1684655083 -> 2516, -642140034 -> 2472
    //   2516: putfield onlySharp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2519: getstatic Perryc.c : I
    //   2522: iflt -> 2536
    //   2525: ldc2_w 1761031680
    //   2528: l2i
    //   2529: ldc_w 836597267
    //   2532: ixor
    //   2533: goto -> 2544
    //   2536: ldc2_w -770339044
    //   2539: l2i
    //   2540: ldc_w 1671319002
    //   2543: ixor
    //   2544: ldc2_w 1667131670
    //   2547: l2i
    //   2548: ldc_w -1942849034
    //   2551: ixor
    //   2552: ixor
    //   2553: lookupswitch default -> 2580, -1311698685 -> 2536, -1236905741 -> 6436
    //   2580: aload_0
    //   2581: getstatic Perryc.0 : I
    //   2584: ifle -> 2598
    //   2587: ldc2_w -517155705
    //   2590: l2i
    //   2591: ldc_w -1757102025
    //   2594: ixor
    //   2595: goto -> 2606
    //   2598: ldc2_w 55825983
    //   2601: l2i
    //   2602: ldc_w 1877641125
    //   2605: ixor
    //   2606: ldc2_w 1874241176
    //   2609: l2i
    //   2610: ldc_w -1835487043
    //   2613: ixor
    //   2614: ixor
    //   2615: lookupswitch default -> 2640, -1958346091 -> 6480, 1740950632 -> 2598
    //   2640: aload_0
    //   2641: new bigname/zprestige/webhack/features/setting/Setting
    //   2644: dup
    //   2645: ldc_w '㌒㶣厇ફ๺馾'
    //   2648: getstatic Perryc.c : I
    //   2651: iflt -> 2665
    //   2654: ldc2_w 1809409662
    //   2657: l2i
    //   2658: ldc_w -1416728710
    //   2661: ixor
    //   2662: goto -> 2673
    //   2665: ldc2_w 594279202
    //   2668: l2i
    //   2669: ldc_w -1505788681
    //   2672: ixor
    //   2673: ldc2_w -313632658
    //   2676: l2i
    //   2677: ldc_w -712039001
    //   2680: ixor
    //   2681: ixor
    //   2682: lookupswitch default -> 6406, -1114244580 -> 2708, -124357427 -> 2665
    //   2708: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2711: ldc_w 1.3040756
    //   2714: invokestatic floatToIntBits : (F)I
    //   2717: ldc_w 2137451507
    //   2720: ixor
    //   2721: invokestatic intBitsToFloat : (I)F
    //   2724: getstatic Perryc.c : I
    //   2727: iflt -> 2741
    //   2730: ldc2_w 1340588385
    //   2733: l2i
    //   2734: ldc_w 303577613
    //   2737: ixor
    //   2738: goto -> 2749
    //   2741: ldc2_w -409885024
    //   2744: l2i
    //   2745: ldc_w 127382792
    //   2748: ixor
    //   2749: ldc2_w 1654487657
    //   2752: l2i
    //   2753: ldc_w 1695472899
    //   2756: ixor
    //   2757: ixor
    //   2758: lookupswitch default -> 6556, -409619262 -> 2784, 1517050886 -> 2741
    //   2784: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2787: ldc_w 135.8732
    //   2790: invokestatic floatToIntBits : (F)I
    //   2793: ldc_w 2127237959
    //   2796: ixor
    //   2797: invokestatic intBitsToFloat : (I)F
    //   2800: getstatic Perryc.0 : I
    //   2803: ifle -> 2817
    //   2806: ldc2_w 1360128190
    //   2809: l2i
    //   2810: ldc_w -448023502
    //   2813: ixor
    //   2814: goto -> 2825
    //   2817: ldc2_w -1524996663
    //   2820: l2i
    //   2821: ldc_w -1247534794
    //   2824: ixor
    //   2825: ldc2_w -2001668637
    //   2828: l2i
    //   2829: ldc_w -1541956618
    //   2832: ixor
    //   2833: ixor
    //   2834: lookupswitch default -> 6580, -1728236903 -> 2817, 1008282346 -> 2860
    //   2860: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2863: ldc_w 1.4134195
    //   2866: invokestatic floatToIntBits : (F)I
    //   2869: ldc_w 2136271598
    //   2872: ixor
    //   2873: invokestatic intBitsToFloat : (I)F
    //   2876: getstatic Perryc.0 : I
    //   2879: ifle -> 2893
    //   2882: ldc2_w -670633421
    //   2885: l2i
    //   2886: ldc_w -1851880796
    //   2889: ixor
    //   2890: goto -> 2901
    //   2893: ldc2_w 381199914
    //   2896: l2i
    //   2897: ldc_w -143818854
    //   2900: ixor
    //   2901: ldc2_w -509347686
    //   2904: l2i
    //   2905: ldc_w -625940631
    //   2908: ixor
    //   2909: ixor
    //   2910: lookupswitch default -> 6464, -624507325 -> 2936, 1921738596 -> 2893
    //   2936: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2939: ldc_w '㌒㶻叕ઘ๸馵蹤཮岃'
    //   2942: getstatic Perryc.c : I
    //   2945: iflt -> 2959
    //   2948: ldc2_w -940838181
    //   2951: l2i
    //   2952: ldc_w 1705627589
    //   2955: ixor
    //   2956: goto -> 2967
    //   2959: ldc2_w -1857128903
    //   2962: l2i
    //   2963: ldc_w 581010724
    //   2966: ixor
    //   2967: ldc2_w -1720766730
    //   2970: l2i
    //   2971: ldc_w 283155375
    //   2974: ixor
    //   2975: ixor
    //   2976: lookupswitch default -> 6454, 734890055 -> 2959, 979387972 -> 3004
    //   3004: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3007: getstatic Perryc.1 : I
    //   3010: ifeq -> 3024
    //   3013: ldc2_w 2147278855
    //   3016: l2i
    //   3017: ldc_w -1516902105
    //   3020: ixor
    //   3021: goto -> 3032
    //   3024: ldc2_w 1056696605
    //   3027: l2i
    //   3028: ldc_w -1256438815
    //   3031: ixor
    //   3032: ldc2_w -2098781426
    //   3035: l2i
    //   3036: ldc_w 360929481
    //   3039: ixor
    //   3040: ixor
    //   3041: lookupswitch default -> 6510, 478400827 -> 3068, 1292727015 -> 3024
    //   3068: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   3071: getstatic Perryc.1 : I
    //   3074: ifeq -> 3088
    //   3077: ldc2_w -999024286
    //   3080: l2i
    //   3081: ldc_w 860938794
    //   3084: ixor
    //   3085: goto -> 3096
    //   3088: ldc2_w -505788394
    //   3091: l2i
    //   3092: ldc_w -1330621507
    //   3095: ixor
    //   3096: ldc2_w 1726595098
    //   3099: l2i
    //   3100: ldc_w 792489950
    //   3103: ixor
    //   3104: ixor
    //   3105: lookupswitch default -> 6498, -1091480436 -> 3088, 415216751 -> 3132
    //   3132: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3135: getstatic Perryc.0 : I
    //   3138: ifle -> 3152
    //   3141: ldc2_w -1700494694
    //   3144: l2i
    //   3145: ldc_w 1815860004
    //   3148: ixor
    //   3149: goto -> 3160
    //   3152: ldc2_w 1397952215
    //   3155: l2i
    //   3156: ldc_w -1605390116
    //   3159: ixor
    //   3160: ldc2_w 1145356897
    //   3163: l2i
    //   3164: ldc_w -1243482266
    //   3167: ixor
    //   3168: ixor
    //   3169: lookupswitch default -> 3196, 121267385 -> 6560, 497783632 -> 3152
    //   3196: putfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3199: getstatic Perryc.1 : I
    //   3202: ifeq -> 3216
    //   3205: ldc2_w -574109389
    //   3208: l2i
    //   3209: ldc_w -1620943705
    //   3212: ixor
    //   3213: goto -> 3224
    //   3216: ldc2_w -1231296664
    //   3219: l2i
    //   3220: ldc_w 621653044
    //   3223: ixor
    //   3224: ldc2_w -1886197685
    //   3227: l2i
    //   3228: ldc_w -1784612374
    //   3231: ixor
    //   3232: ixor
    //   3233: lookupswitch default -> 6428, -1985717507 -> 3260, 1486324789 -> 3216
    //   3260: aload_0
    //   3261: getstatic Perryc.c : I
    //   3264: iflt -> 3278
    //   3267: ldc2_w -596243421
    //   3270: l2i
    //   3271: ldc_w -1347277945
    //   3274: ixor
    //   3275: goto -> 3286
    //   3278: ldc2_w -1695544980
    //   3281: l2i
    //   3282: ldc_w -2099650692
    //   3285: ixor
    //   3286: ldc2_w -451174629
    //   3289: l2i
    //   3290: ldc_w -317972031
    //   3293: ixor
    //   3294: ixor
    //   3295: lookupswitch default -> 6568, 272525514 -> 3320, 2077464958 -> 3278
    //   3320: aload_0
    //   3321: new bigname/zprestige/webhack/features/setting/Setting
    //   3324: dup
    //   3325: ldc_w '㌟㶮厐સ๪'
    //   3328: getstatic Perryc.1 : I
    //   3331: ifeq -> 3345
    //   3334: ldc2_w -464904268
    //   3337: l2i
    //   3338: ldc_w -1063345888
    //   3341: ixor
    //   3342: goto -> 3353
    //   3345: ldc2_w -1973364070
    //   3348: l2i
    //   3349: ldc_w 1221405702
    //   3352: ixor
    //   3353: ldc2_w -1067435699
    //   3356: l2i
    //   3357: ldc_w 1259169721
    //   3360: ixor
    //   3361: ixor
    //   3362: lookupswitch default -> 3388, -1346772896 -> 6438, 2002704138 -> 3345
    //   3388: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3391: ldc2_w -1453656905
    //   3394: l2i
    //   3395: ldc_w -1453656906
    //   3398: ixor
    //   3399: getstatic Perryc.c : I
    //   3402: iflt -> 3416
    //   3405: ldc2_w 1183588832
    //   3408: l2i
    //   3409: ldc_w 1670894075
    //   3412: ixor
    //   3413: goto -> 3424
    //   3416: ldc2_w 619729026
    //   3419: l2i
    //   3420: ldc_w -384640963
    //   3423: ixor
    //   3424: ldc2_w -641934623
    //   3427: l2i
    //   3428: ldc_w -1936001459
    //   3431: ixor
    //   3432: ixor
    //   3433: lookupswitch default -> 3460, -1481166598 -> 3416, 1883102391 -> 6418
    //   3460: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3463: getstatic Perryc.1 : I
    //   3466: ifeq -> 3480
    //   3469: ldc2_w -635023924
    //   3472: l2i
    //   3473: ldc_w 1819530347
    //   3476: ixor
    //   3477: goto -> 3488
    //   3480: ldc2_w 1126124755
    //   3483: l2i
    //   3484: ldc_w -744079315
    //   3487: ixor
    //   3488: ldc2_w 232315569
    //   3491: l2i
    //   3492: ldc_w 1966352370
    //   3495: ixor
    //   3496: ixor
    //   3497: lookupswitch default -> 6524, -826710812 -> 3480, -397020739 -> 3524
    //   3524: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3527: getstatic Perryc.0 : I
    //   3530: ifle -> 3544
    //   3533: ldc2_w -466134337
    //   3536: l2i
    //   3537: ldc_w -610191876
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w 1297932187
    //   3547: l2i
    //   3548: ldc_w -250727473
    //   3551: ixor
    //   3552: ldc2_w 1987508486
    //   3555: l2i
    //   3556: ldc_w 1099204866
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 3588, 140779335 -> 6446, 1465544451 -> 3544
    //   3588: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3591: getstatic Perryc.c : I
    //   3594: iflt -> 3608
    //   3597: ldc2_w 1684021728
    //   3600: l2i
    //   3601: ldc_w -121818166
    //   3604: ixor
    //   3605: goto -> 3616
    //   3608: ldc2_w 103390214
    //   3611: l2i
    //   3612: ldc_w 1154399279
    //   3615: ixor
    //   3616: ldc2_w 227268443
    //   3619: l2i
    //   3620: ldc_w 339070899
    //   3623: ixor
    //   3624: ixor
    //   3625: lookupswitch default -> 3652, -2057106750 -> 6424, -289024373 -> 3608
    //   3652: putfield players : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3655: getstatic Perryc.1 : I
    //   3658: ifeq -> 3672
    //   3661: ldc2_w -192763985
    //   3664: l2i
    //   3665: ldc_w -810235006
    //   3668: ixor
    //   3669: goto -> 3680
    //   3672: ldc2_w 693831649
    //   3675: l2i
    //   3676: ldc_w -816113829
    //   3679: ixor
    //   3680: ldc2_w -81099837
    //   3683: l2i
    //   3684: ldc_w 451735679
    //   3687: ixor
    //   3688: ixor
    //   3689: lookupswitch default -> 6582, -621797487 -> 3672, 130441990 -> 3716
    //   3716: aload_0
    //   3717: getstatic Perryc.c : I
    //   3720: iflt -> 3734
    //   3723: ldc2_w 459911274
    //   3726: l2i
    //   3727: ldc_w -204800832
    //   3730: ixor
    //   3731: goto -> 3742
    //   3734: ldc2_w 278781303
    //   3737: l2i
    //   3738: ldc_w 655611020
    //   3741: ixor
    //   3742: ldc2_w 717025653
    //   3745: l2i
    //   3746: ldc_w 186465045
    //   3749: ixor
    //   3750: ixor
    //   3751: lookupswitch default -> 6584, -922581302 -> 3734, 372229019 -> 3776
    //   3776: aload_0
    //   3777: new bigname/zprestige/webhack/features/setting/Setting
    //   3780: dup
    //   3781: ldc_w '㌜㶤'
    //   3784: getstatic Perryc.c : I
    //   3787: iflt -> 3801
    //   3790: ldc2_w -1405526288
    //   3793: l2i
    //   3794: ldc_w 1689790490
    //   3797: ixor
    //   3798: goto -> 3809
    //   3801: ldc2_w -1792101861
    //   3804: l2i
    //   3805: ldc_w 726234579
    //   3808: ixor
    //   3809: ldc2_w -1917730150
    //   3812: l2i
    //   3813: ldc_w -1180553762
    //   3816: ixor
    //   3817: ixor
    //   3818: lookupswitch default -> 6566, -1972098932 -> 3844, -57501266 -> 3801
    //   3844: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3847: ldc2_w -1742360219
    //   3850: l2i
    //   3851: ldc_w -1742360219
    //   3854: ixor
    //   3855: getstatic Perryc.c : I
    //   3858: iflt -> 3872
    //   3861: ldc2_w 330105327
    //   3864: l2i
    //   3865: ldc_w 1210119076
    //   3868: ixor
    //   3869: goto -> 3880
    //   3872: ldc2_w 265624909
    //   3875: l2i
    //   3876: ldc_w 1582486927
    //   3879: ixor
    //   3880: ldc2_w 774544518
    //   3883: l2i
    //   3884: ldc_w 1231191282
    //   3887: ixor
    //   3888: ixor
    //   3889: lookupswitch default -> 3916, 1019548223 -> 6440, 1947137913 -> 3872
    //   3916: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3919: getstatic Perryc.0 : I
    //   3922: ifle -> 3936
    //   3925: ldc2_w 815212971
    //   3928: l2i
    //   3929: ldc_w -528657434
    //   3932: ixor
    //   3933: goto -> 3944
    //   3936: ldc2_w 1255973161
    //   3939: l2i
    //   3940: ldc_w -1135238983
    //   3943: ixor
    //   3944: ldc2_w 547329190
    //   3947: l2i
    //   3948: ldc_w 718080925
    //   3951: ixor
    //   3952: ixor
    //   3953: lookupswitch default -> 6462, -625416842 -> 3936, -52715861 -> 3980
    //   3980: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3983: getstatic Perryc.0 : I
    //   3986: ifle -> 4000
    //   3989: ldc2_w 1965843828
    //   3992: l2i
    //   3993: ldc_w 1840746883
    //   3996: ixor
    //   3997: goto -> 4008
    //   4000: ldc2_w -1997439476
    //   4003: l2i
    //   4004: ldc_w 1178378908
    //   4007: ixor
    //   4008: ldc2_w -464841535
    //   4011: l2i
    //   4012: ldc_w 174784059
    //   4015: ixor
    //   4016: ixor
    //   4017: lookupswitch default -> 4044, -1057005691 -> 4000, -155574771 -> 6484
    //   4044: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4047: getstatic Perryc.c : I
    //   4050: iflt -> 4064
    //   4053: ldc2_w -1789662419
    //   4056: l2i
    //   4057: ldc_w -1724838875
    //   4060: ixor
    //   4061: goto -> 4072
    //   4064: ldc2_w -1090787808
    //   4067: l2i
    //   4068: ldc_w 823431676
    //   4071: ixor
    //   4072: ldc2_w 999994561
    //   4075: l2i
    //   4076: ldc_w 254889482
    //   4079: ixor
    //   4080: ixor
    //   4081: lookupswitch default -> 4108, 905917076 -> 4064, 952704451 -> 6392
    //   4108: putfield mobs : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4111: getstatic Perryc.1 : I
    //   4114: ifeq -> 4128
    //   4117: ldc2_w 1637363695
    //   4120: l2i
    //   4121: ldc_w -332570733
    //   4124: ixor
    //   4125: goto -> 4136
    //   4128: ldc2_w -375662544
    //   4131: l2i
    //   4132: ldc_w 222369153
    //   4135: ixor
    //   4136: ldc2_w 1535776369
    //   4139: l2i
    //   4140: ldc_w -1330329533
    //   4143: ixor
    //   4144: ixor
    //   4145: lookupswitch default -> 6466, 266605443 -> 4172, 1720430158 -> 4128
    //   4172: aload_0
    //   4173: getstatic Perryc.0 : I
    //   4176: ifle -> 4190
    //   4179: ldc2_w -1205172054
    //   4182: l2i
    //   4183: ldc_w -2004662927
    //   4186: ixor
    //   4187: goto -> 4198
    //   4190: ldc2_w 831595261
    //   4193: l2i
    //   4194: ldc_w -1339366950
    //   4197: ixor
    //   4198: ldc2_w -208917591
    //   4201: l2i
    //   4202: ldc_w 679687276
    //   4205: ixor
    //   4206: ixor
    //   4207: lookupswitch default -> 4232, -341388770 -> 6476, 1530368842 -> 4190
    //   4232: aload_0
    //   4233: new bigname/zprestige/webhack/features/setting/Setting
    //   4236: dup
    //   4237: ldc_w '㌝㶺厔દ๪'
    //   4240: getstatic Perryc.0 : I
    //   4243: ifle -> 4257
    //   4246: ldc2_w 631240910
    //   4249: l2i
    //   4250: ldc_w -307543853
    //   4253: ixor
    //   4254: goto -> 4265
    //   4257: ldc2_w 80746704
    //   4260: l2i
    //   4261: ldc_w 1257640209
    //   4264: ixor
    //   4265: ldc2_w 1150267457
    //   4268: l2i
    //   4269: ldc_w 1206723797
    //   4272: ixor
    //   4273: ixor
    //   4274: lookupswitch default -> 6402, -883544951 -> 4257, 1296342357 -> 4300
    //   4300: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4303: ldc2_w 19319483
    //   4306: l2i
    //   4307: ldc_w 19319483
    //   4310: ixor
    //   4311: getstatic Perryc.c : I
    //   4314: iflt -> 4328
    //   4317: ldc2_w 1594936463
    //   4320: l2i
    //   4321: ldc_w 1077055486
    //   4324: ixor
    //   4325: goto -> 4336
    //   4328: ldc2_w -466135329
    //   4331: l2i
    //   4332: ldc_w -600201056
    //   4335: ixor
    //   4336: ldc2_w 32648304
    //   4339: l2i
    //   4340: ldc_w 237628566
    //   4343: ixor
    //   4344: ixor
    //   4345: lookupswitch default -> 6554, 284787607 -> 4328, 936722073 -> 4372
    //   4372: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4375: getstatic Perryc.c : I
    //   4378: iflt -> 4392
    //   4381: ldc2_w 35723304
    //   4384: l2i
    //   4385: ldc_w 676574997
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w -1300678620
    //   4395: l2i
    //   4396: ldc_w -102402324
    //   4399: ixor
    //   4400: ldc2_w 176219889
    //   4403: l2i
    //   4404: ldc_w 597495132
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 4436, 57623696 -> 6550, 2005054876 -> 4392
    //   4436: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4439: getstatic Perryc.1 : I
    //   4442: ifeq -> 4456
    //   4445: ldc2_w 876429450
    //   4448: l2i
    //   4449: ldc_w -1482444542
    //   4452: ixor
    //   4453: goto -> 4464
    //   4456: ldc2_w -2054500334
    //   4459: l2i
    //   4460: ldc_w 373790540
    //   4463: ixor
    //   4464: ldc2_w -1182190639
    //   4467: l2i
    //   4468: ldc_w -1874136479
    //   4471: ixor
    //   4472: ixor
    //   4473: lookupswitch default -> 6448, -1173453074 -> 4500, -1168297928 -> 4456
    //   4500: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4503: getstatic Perryc.c : I
    //   4506: iflt -> 4520
    //   4509: ldc2_w -1638463302
    //   4512: l2i
    //   4513: ldc_w -753468569
    //   4516: ixor
    //   4517: goto -> 4528
    //   4520: ldc2_w 1196412342
    //   4523: l2i
    //   4524: ldc_w 1856836501
    //   4527: ixor
    //   4528: ldc2_w 1876941267
    //   4531: l2i
    //   4532: ldc_w 1746687012
    //   4535: ixor
    //   4536: ixor
    //   4537: lookupswitch default -> 4564, 885474431 -> 4520, 1250065962 -> 6500
    //   4564: putfield animals : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4567: getstatic Perryc.0 : I
    //   4570: ifle -> 4584
    //   4573: ldc2_w 1584083021
    //   4576: l2i
    //   4577: ldc_w -1678885811
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w -1697040423
    //   4587: l2i
    //   4588: ldc_w -1547580851
    //   4591: ixor
    //   4592: ldc2_w -242200381
    //   4595: l2i
    //   4596: ldc_w 1042637242
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 4628, -1183629862 -> 4584, 170933625 -> 6472
    //   4628: aload_0
    //   4629: getstatic Perryc.1 : I
    //   4632: ifeq -> 4646
    //   4635: ldc2_w -230446176
    //   4638: l2i
    //   4639: ldc_w -1708182560
    //   4642: ixor
    //   4643: goto -> 4654
    //   4646: ldc2_w 759497084
    //   4649: l2i
    //   4650: ldc_w -628033113
    //   4653: ixor
    //   4654: ldc2_w 1437555609
    //   4657: l2i
    //   4658: ldc_w -1164529358
    //   4661: ixor
    //   4662: ixor
    //   4663: lookupswitch default -> 4688, -2024443157 -> 6488, -965876892 -> 4646
    //   4688: aload_0
    //   4689: new bigname/zprestige/webhack/features/setting/Setting
    //   4692: dup
    //   4693: ldc_w '㌝㶾厁ણ๼馨'
    //   4696: getstatic Perryc.0 : I
    //   4699: ifle -> 4713
    //   4702: ldc2_w 1598143546
    //   4705: l2i
    //   4706: ldc_w 2104735469
    //   4709: ixor
    //   4710: goto -> 4721
    //   4713: ldc2_w -443924447
    //   4716: l2i
    //   4717: ldc_w 877183226
    //   4720: ixor
    //   4721: ldc2_w -686981394
    //   4724: l2i
    //   4725: ldc_w -1729584443
    //   4728: ixor
    //   4729: ixor
    //   4730: lookupswitch default -> 4756, -161626726 -> 4713, 1842861820 -> 6414
    //   4756: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4759: ldc2_w -2114765511
    //   4762: l2i
    //   4763: ldc_w -2114765511
    //   4766: ixor
    //   4767: getstatic Perryc.c : I
    //   4770: iflt -> 4784
    //   4773: ldc2_w 14191306
    //   4776: l2i
    //   4777: ldc_w 1671334911
    //   4780: ixor
    //   4781: goto -> 4792
    //   4784: ldc2_w -651905067
    //   4787: l2i
    //   4788: ldc_w -546937537
    //   4791: ixor
    //   4792: ldc2_w 202764783
    //   4795: l2i
    //   4796: ldc_w 1264496462
    //   4799: ixor
    //   4800: ixor
    //   4801: lookupswitch default -> 6570, 604856212 -> 4784, 1091144779 -> 4828
    //   4828: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4831: getstatic Perryc.c : I
    //   4834: iflt -> 4848
    //   4837: ldc2_w -1546992032
    //   4840: l2i
    //   4841: ldc_w -804882745
    //   4844: ixor
    //   4845: goto -> 4856
    //   4848: ldc2_w 1785069533
    //   4851: l2i
    //   4852: ldc_w -701206461
    //   4855: ixor
    //   4856: ldc2_w 2135275037
    //   4859: l2i
    //   4860: ldc_w 649133434
    //   4863: ixor
    //   4864: ixor
    //   4865: lookupswitch default -> 4892, 708443072 -> 6450, 948657356 -> 4848
    //   4892: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4895: getstatic Perryc.1 : I
    //   4898: ifeq -> 4912
    //   4901: ldc2_w -1110856
    //   4904: l2i
    //   4905: ldc_w -2084135963
    //   4908: ixor
    //   4909: goto -> 4920
    //   4912: ldc2_w 1570243063
    //   4915: l2i
    //   4916: ldc_w -1760883532
    //   4919: ixor
    //   4920: ldc2_w 1003234740
    //   4923: l2i
    //   4924: ldc_w -2117057115
    //   4927: ixor
    //   4928: ixor
    //   4929: lookupswitch default -> 4956, -969541812 -> 6432, 1428438353 -> 4912
    //   4956: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4959: getstatic Perryc.0 : I
    //   4962: ifle -> 4976
    //   4965: ldc2_w -248119604
    //   4968: l2i
    //   4969: ldc_w 766981873
    //   4972: ixor
    //   4973: goto -> 4984
    //   4976: ldc2_w 591801793
    //   4979: l2i
    //   4980: ldc_w 366979641
    //   4983: ixor
    //   4984: ldc2_w 216186931
    //   4987: l2i
    //   4988: ldc_w 284646458
    //   4991: ixor
    //   4992: ixor
    //   4993: lookupswitch default -> 6412, -1063824332 -> 4976, 713825265 -> 5020
    //   5020: putfield vehicles : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5023: getstatic Perryc.c : I
    //   5026: iflt -> 5040
    //   5029: ldc2_w 892952554
    //   5032: l2i
    //   5033: ldc_w 1534520099
    //   5036: ixor
    //   5037: goto -> 5048
    //   5040: ldc2_w 1943684015
    //   5043: l2i
    //   5044: ldc_w 723482154
    //   5047: ixor
    //   5048: ldc2_w 1710114547
    //   5051: l2i
    //   5052: ldc_w -210194403
    //   5055: ixor
    //   5056: ixor
    //   5057: lookupswitch default -> 6504, -833371285 -> 5084, -119979481 -> 5040
    //   5084: aload_0
    //   5085: getstatic Perryc.1 : I
    //   5088: ifeq -> 5102
    //   5091: ldc2_w -1852500136
    //   5094: l2i
    //   5095: ldc_w 995129951
    //   5098: ixor
    //   5099: goto -> 5110
    //   5102: ldc2_w -1460426338
    //   5105: l2i
    //   5106: ldc_w 1491325953
    //   5109: ixor
    //   5110: ldc2_w 1912828969
    //   5113: l2i
    //   5114: ldc_w 993661194
    //   5117: ixor
    //   5118: ixor
    //   5119: lookupswitch default -> 6452, -1188489028 -> 5144, -470022108 -> 5102
    //   5144: aload_0
    //   5145: new bigname/zprestige/webhack/features/setting/Setting
    //   5148: dup
    //   5149: ldc_w '㌁㶽厐઩๭馲蹯཮峞'
    //   5152: getstatic Perryc.1 : I
    //   5155: ifeq -> 5169
    //   5158: ldc2_w 398822721
    //   5161: l2i
    //   5162: ldc_w 1824901374
    //   5165: ixor
    //   5166: goto -> 5177
    //   5169: ldc2_w -849253823
    //   5172: l2i
    //   5173: ldc_w -838882336
    //   5176: ixor
    //   5177: ldc2_w 911061908
    //   5180: l2i
    //   5181: ldc_w -1542645553
    //   5184: ixor
    //   5185: ixor
    //   5186: lookupswitch default -> 5212, -381620508 -> 6444, 20078439 -> 5169
    //   5212: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5215: ldc2_w -234189520
    //   5218: l2i
    //   5219: ldc_w -234189520
    //   5222: ixor
    //   5223: getstatic Perryc.c : I
    //   5226: iflt -> 5240
    //   5229: ldc2_w 798342657
    //   5232: l2i
    //   5233: ldc_w 972615431
    //   5236: ixor
    //   5237: goto -> 5248
    //   5240: ldc2_w -560604489
    //   5243: l2i
    //   5244: ldc_w -1695154799
    //   5247: ixor
    //   5248: ldc2_w -1321539584
    //   5251: l2i
    //   5252: ldc_w -1599425451
    //   5255: ixor
    //   5256: ixor
    //   5257: lookupswitch default -> 5284, -2097858927 -> 5240, 134024531 -> 6572
    //   5284: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5287: getstatic Perryc.0 : I
    //   5290: ifle -> 5304
    //   5293: ldc2_w 675193207
    //   5296: l2i
    //   5297: ldc_w 1104076453
    //   5300: ixor
    //   5301: goto -> 5312
    //   5304: ldc2_w 34666015
    //   5307: l2i
    //   5308: ldc_w -950810107
    //   5311: ixor
    //   5312: ldc2_w -2132996887
    //   5315: l2i
    //   5316: ldc_w -469070039
    //   5319: ixor
    //   5320: ixor
    //   5321: lookupswitch default -> 5348, -1642944791 -> 5304, 220724242 -> 6408
    //   5348: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5351: getstatic Perryc.c : I
    //   5354: iflt -> 5368
    //   5357: ldc2_w -138382043
    //   5360: l2i
    //   5361: ldc_w 1431322612
    //   5364: ixor
    //   5365: goto -> 5376
    //   5368: ldc2_w 440206371
    //   5371: l2i
    //   5372: ldc_w -1904886120
    //   5375: ixor
    //   5376: ldc2_w -1862075297
    //   5379: l2i
    //   5380: ldc_w 2025464537
    //   5383: ixor
    //   5384: ixor
    //   5385: lookupswitch default -> 6506, 1260950615 -> 5368, 2112906301 -> 5412
    //   5412: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5415: getstatic Perryc.1 : I
    //   5418: ifeq -> 5432
    //   5421: ldc2_w -741712643
    //   5424: l2i
    //   5425: ldc_w -1097075580
    //   5428: ixor
    //   5429: goto -> 5440
    //   5432: ldc2_w 1166371039
    //   5435: l2i
    //   5436: ldc_w 813387633
    //   5439: ixor
    //   5440: ldc2_w -638092841
    //   5443: l2i
    //   5444: ldc_w -1250503448
    //   5447: ixor
    //   5448: ixor
    //   5449: lookupswitch default -> 6518, 30410054 -> 5432, 427788945 -> 5476
    //   5476: putfield projectiles : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5479: getstatic Perryc.1 : I
    //   5482: ifeq -> 5496
    //   5485: ldc2_w 1814679158
    //   5488: l2i
    //   5489: ldc_w -445704863
    //   5492: ixor
    //   5493: goto -> 5504
    //   5496: ldc2_w 332532846
    //   5499: l2i
    //   5500: ldc_w -1083292941
    //   5503: ixor
    //   5504: ldc2_w -590385031
    //   5507: l2i
    //   5508: ldc_w -416257566
    //   5511: ixor
    //   5512: ixor
    //   5513: lookupswitch default -> 5540, -1427153393 -> 5496, -1296448884 -> 6502
    //   5540: aload_0
    //   5541: getstatic Perryc.c : I
    //   5544: iflt -> 5558
    //   5547: ldc2_w -788147683
    //   5550: l2i
    //   5551: ldc_w 1404057448
    //   5554: ixor
    //   5555: goto -> 5566
    //   5558: ldc2_w -34007627
    //   5561: l2i
    //   5562: ldc_w 552832895
    //   5565: ixor
    //   5566: ldc2_w -1378486562
    //   5569: l2i
    //   5570: ldc_w 1696866581
    //   5573: ixor
    //   5574: ixor
    //   5575: lookupswitch default -> 5600, -1522816507 -> 5558, 1245983422 -> 6578
    //   5600: aload_0
    //   5601: new bigname/zprestige/webhack/features/setting/Setting
    //   5604: dup
    //   5605: ldc_w '㌃㶄厌ત๺'
    //   5608: getstatic Perryc.1 : I
    //   5611: ifeq -> 5625
    //   5614: ldc2_w 2035892107
    //   5617: l2i
    //   5618: ldc_w 994022470
    //   5621: ixor
    //   5622: goto -> 5633
    //   5625: ldc2_w -18734778
    //   5628: l2i
    //   5629: ldc_w 113818955
    //   5632: ixor
    //   5633: ldc2_w 1795289480
    //   5636: l2i
    //   5637: ldc_w 1450086467
    //   5640: ixor
    //   5641: ixor
    //   5642: lookupswitch default -> 6544, -985268794 -> 5668, 2131347974 -> 5625
    //   5668: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5671: ldc2_w 1268251044
    //   5674: l2i
    //   5675: ldc_w 1268251045
    //   5678: ixor
    //   5679: getstatic Perryc.0 : I
    //   5682: ifle -> 5696
    //   5685: ldc2_w -764195853
    //   5688: l2i
    //   5689: ldc_w 1939637275
    //   5692: ixor
    //   5693: goto -> 5704
    //   5696: ldc2_w 348480111
    //   5699: l2i
    //   5700: ldc_w -972297218
    //   5703: ixor
    //   5704: ldc2_w 1176523920
    //   5707: l2i
    //   5708: ldc_w 2071080714
    //   5711: ixor
    //   5712: ixor
    //   5713: lookupswitch default -> 5740, -1665289102 -> 6434, 1966701254 -> 5696
    //   5740: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5743: getstatic Perryc.0 : I
    //   5746: ifle -> 5760
    //   5749: ldc2_w 528277115
    //   5752: l2i
    //   5753: ldc_w 955877087
    //   5756: ixor
    //   5757: goto -> 5768
    //   5760: ldc2_w -601553836
    //   5763: l2i
    //   5764: ldc_w 607673787
    //   5767: ixor
    //   5768: ldc2_w 1186660669
    //   5771: l2i
    //   5772: ldc_w -1102611878
    //   5775: ixor
    //   5776: ixor
    //   5777: lookupswitch default -> 6426, -545709117 -> 5760, 14754440 -> 5804
    //   5804: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5807: getstatic Perryc.0 : I
    //   5810: ifle -> 5824
    //   5813: ldc2_w -513354832
    //   5816: l2i
    //   5817: ldc_w 1095104667
    //   5820: ixor
    //   5821: goto -> 5832
    //   5824: ldc2_w 2109997659
    //   5827: l2i
    //   5828: ldc_w 1082769486
    //   5831: ixor
    //   5832: ldc2_w -1907139838
    //   5835: l2i
    //   5836: ldc_w 664656696
    //   5839: ixor
    //   5840: ixor
    //   5841: lookupswitch default -> 5868, -160299240 -> 5824, 166570769 -> 6494
    //   5868: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5871: getstatic Perryc.c : I
    //   5874: iflt -> 5888
    //   5877: ldc2_w 1950254062
    //   5880: l2i
    //   5881: ldc_w 500112752
    //   5884: ixor
    //   5885: goto -> 5896
    //   5888: ldc2_w 668978266
    //   5891: l2i
    //   5892: ldc_w 299960288
    //   5895: ixor
    //   5896: ldc2_w 14118792
    //   5899: l2i
    //   5900: ldc_w 1611103845
    //   5903: ixor
    //   5904: ixor
    //   5905: lookupswitch default -> 6486, 153194355 -> 5888, 1458494039 -> 5932
    //   5932: putfield tps : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5935: getstatic Perryc.1 : I
    //   5938: ifeq -> 5952
    //   5941: ldc2_w 1222813878
    //   5944: l2i
    //   5945: ldc_w -352480330
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w -214199846
    //   5955: l2i
    //   5956: ldc_w 1925210263
    //   5959: ixor
    //   5960: ldc2_w 2123541994
    //   5963: l2i
    //   5964: ldc_w -313945004
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 6416, 304138483 -> 5996, 834929342 -> 5952
    //   5996: aload_0
    //   5997: getstatic Perryc.0 : I
    //   6000: ifle -> 6014
    //   6003: ldc2_w -1100935036
    //   6006: l2i
    //   6007: ldc_w -1159555393
    //   6010: ixor
    //   6011: goto -> 6022
    //   6014: ldc2_w 1388905828
    //   6017: l2i
    //   6018: ldc_w 1668318937
    //   6021: ixor
    //   6022: ldc2_w -1932440945
    //   6025: l2i
    //   6026: ldc_w 253610408
    //   6029: ixor
    //   6030: ixor
    //   6031: lookupswitch default -> 6430, -2024864484 -> 6014, -1300954982 -> 6056
    //   6056: aload_0
    //   6057: new bigname/zprestige/webhack/features/setting/Setting
    //   6060: dup
    //   6061: ldc_w '㌒㶼厐ા'
    //   6064: getstatic Perryc.0 : I
    //   6067: ifle -> 6081
    //   6070: ldc2_w 2065801054
    //   6073: l2i
    //   6074: ldc_w -434026517
    //   6077: ixor
    //   6078: goto -> 6089
    //   6081: ldc2_w -757889852
    //   6084: l2i
    //   6085: ldc_w 814779610
    //   6088: ixor
    //   6089: ldc2_w 1179846002
    //   6092: l2i
    //   6093: ldc_w 366157694
    //   6096: ixor
    //   6097: ixor
    //   6098: lookupswitch default -> 6396, -1312615918 -> 6124, -830422343 -> 6081
    //   6124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6127: ldc2_w 1238762905
    //   6130: l2i
    //   6131: ldc_w 1238762905
    //   6134: ixor
    //   6135: getstatic Perryc.c : I
    //   6138: iflt -> 6152
    //   6141: ldc2_w 496496549
    //   6144: l2i
    //   6145: ldc_w -812138723
    //   6148: ixor
    //   6149: goto -> 6160
    //   6152: ldc2_w -1623806907
    //   6155: l2i
    //   6156: ldc_w -423983514
    //   6159: ixor
    //   6160: ldc2_w -1471092465
    //   6163: l2i
    //   6164: ldc_w 137599535
    //   6167: ixor
    //   6168: ixor
    //   6169: lookupswitch default -> 6196, -1534507078 -> 6152, 1919099800 -> 6460
    //   6196: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   6199: getstatic Perryc.0 : I
    //   6202: ifle -> 6216
    //   6205: ldc2_w -127982311
    //   6208: l2i
    //   6209: ldc_w 973329762
    //   6212: ixor
    //   6213: goto -> 6224
    //   6216: ldc2_w -1856569535
    //   6219: l2i
    //   6220: ldc_w 375689677
    //   6223: ixor
    //   6224: ldc2_w -898282363
    //   6227: l2i
    //   6228: ldc_w 615211022
    //   6231: ixor
    //   6232: ixor
    //   6233: lookupswitch default -> 6260, 32843606 -> 6216, 746773744 -> 6546
    //   6260: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   6263: getstatic Perryc.c : I
    //   6266: iflt -> 6280
    //   6269: ldc2_w -2052017252
    //   6272: l2i
    //   6273: ldc_w 1037394727
    //   6276: ixor
    //   6277: goto -> 6288
    //   6280: ldc2_w 1075029610
    //   6283: l2i
    //   6284: ldc_w 594212551
    //   6287: ixor
    //   6288: ldc2_w 1771441918
    //   6291: l2i
    //   6292: ldc_w 598682405
    //   6295: ixor
    //   6296: ixor
    //   6297: lookupswitch default -> 6324, -228788896 -> 6492, 1771391444 -> 6280
    //   6324: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6327: getstatic Perryc.1 : I
    //   6330: ifeq -> 6344
    //   6333: ldc2_w -846112814
    //   6336: l2i
    //   6337: ldc_w 491521909
    //   6340: ixor
    //   6341: goto -> 6352
    //   6344: ldc2_w -1092409902
    //   6347: l2i
    //   6348: ldc_w -389239894
    //   6351: ixor
    //   6352: ldc2_w 1345382543
    //   6355: l2i
    //   6356: ldc_w -1988634853
    //   6359: ixor
    //   6360: ixor
    //   6361: lookupswitch default -> 6526, -1888964116 -> 6388, 161115955 -> 6344
    //   6388: putfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6391: return
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
    //   6514: aconst_null
    //   6515: athrow
    //   6516: aconst_null
    //   6517: athrow
    //   6518: aconst_null
    //   6519: athrow
    //   6520: aconst_null
    //   6521: athrow
    //   6522: aconst_null
    //   6523: athrow
    //   6524: aconst_null
    //   6525: athrow
    //   6526: aconst_null
    //   6527: athrow
    //   6528: aconst_null
    //   6529: athrow
    //   6530: aconst_null
    //   6531: athrow
    //   6532: aconst_null
    //   6533: athrow
    //   6534: aconst_null
    //   6535: athrow
    //   6536: aconst_null
    //   6537: athrow
    //   6538: aconst_null
    //   6539: athrow
    //   6540: aconst_null
    //   6541: athrow
    //   6542: aconst_null
    //   6543: athrow
    //   6544: aconst_null
    //   6545: athrow
    //   6546: aconst_null
    //   6547: athrow
    //   6548: aconst_null
    //   6549: athrow
    //   6550: aconst_null
    //   6551: athrow
    //   6552: aconst_null
    //   6553: athrow
    //   6554: aconst_null
    //   6555: athrow
    //   6556: aconst_null
    //   6557: athrow
    //   6558: aconst_null
    //   6559: athrow
    //   6560: aconst_null
    //   6561: athrow
    //   6562: aconst_null
    //   6563: athrow
    //   6564: aconst_null
    //   6565: athrow
    //   6566: aconst_null
    //   6567: athrow
    //   6568: aconst_null
    //   6569: athrow
    //   6570: aconst_null
    //   6571: athrow
    //   6572: aconst_null
    //   6573: athrow
    //   6574: aconst_null
    //   6575: athrow
    //   6576: aconst_null
    //   6577: athrow
    //   6578: aconst_null
    //   6579: athrow
    //   6580: aconst_null
    //   6581: athrow
    //   6582: aconst_null
    //   6583: athrow
    //   6584: aconst_null
    //   6585: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	6392	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Killaura;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\Killaura.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */