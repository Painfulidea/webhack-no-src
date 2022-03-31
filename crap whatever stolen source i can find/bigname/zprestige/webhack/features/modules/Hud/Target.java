package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.HashMap;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Target extends Module {
  public static HashMap<String, Integer> TotemPopContainer;
  
  public Setting<Integer> blue;
  
  public Setting<Integer> backgroundAlpha;
  
  public int startcolor1;
  
  public Setting<Integer> red;
  
  public Setting<Integer> targetHudX;
  
  public Setting<Boolean> targetHudBackground;
  
  public int endcolor1;
  
  public static Target INSTANCE;
  
  public Setting<Integer> green;
  
  public Setting<Integer> targetHudY;
  
  public BlockPos traceToBlock(float partialTicks, float yaw, Entity player) {
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
  
  public static Target getInstance() {
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
  
  public Target() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -1341178531
    //   9: l2i
    //   10: ldc_w -64504490
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -421967119
    //   20: l2i
    //   21: ldc_w -2115768308
    //   24: ixor
    //   25: ldc2_w -848931565
    //   28: l2i
    //   29: ldc_w -1431313594
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 4650, 15928488 -> 60, 736179806 -> 17
    //   60: aload_0
    //   61: ldc_w '냁㌒낍㶰㹷幝'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -668075205
    //   73: l2i
    //   74: ldc_w -841653848
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -2075737618
    //   84: l2i
    //   85: ldc_w -925374198
    //   88: ixor
    //   89: ldc2_w -1654553752
    //   92: l2i
    //   93: ldc_w -1479677198
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -2059615929 -> 81, 794096393 -> 4684
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '냑㌚낌㶧㹾幈๠쵋踣抸࠯ਵ紪煤'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -855233654
    //   139: l2i
    //   140: ldc_w -1333719160
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -395636747
    //   150: l2i
    //   151: ldc_w -1981063085
    //   154: ixor
    //   155: ldc2_w 1007047093
    //   158: l2i
    //   159: ldc_w -948413463
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 4596, -2030490018 -> 147, -1694603782 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 1107183106
    //   204: l2i
    //   205: ldc_w -1573926845
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1197349129
    //   215: l2i
    //   216: ldc_w -1349966987
    //   219: ixor
    //   220: ldc2_w -195619185
    //   223: l2i
    //   224: ldc_w 832508180
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, 392855660 -> 212, 639207898 -> 4634
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 347205507
    //   262: l2i
    //   263: ldc_w 347205507
    //   266: ixor
    //   267: ldc2_w -900234779
    //   270: l2i
    //   271: ldc_w -900234779
    //   274: ixor
    //   275: ldc2_w 489539987
    //   278: l2i
    //   279: ldc_w 489539986
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -1245549478
    //   292: l2i
    //   293: ldc_w 649162072
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -122880186
    //   303: l2i
    //   304: ldc_w 1380581738
    //   307: ixor
    //   308: ldc2_w -619713531
    //   311: l2i
    //   312: ldc_w -686814710
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -1620252915 -> 4668, 413811299 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 514666929
    //   356: l2i
    //   357: ldc_w -858585376
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1963465328
    //   367: l2i
    //   368: ldc_w 12771085
    //   371: ixor
    //   372: ldc2_w 1467142759
    //   375: l2i
    //   376: ldc_w 447274707
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 4598, -1616626715 -> 364, -940624343 -> 408
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w -1875309057
    //   418: l2i
    //   419: ldc_w 2090850725
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -1969575111
    //   429: l2i
    //   430: ldc_w -357986720
    //   433: ixor
    //   434: ldc2_w 60500914
    //   437: l2i
    //   438: ldc_w 998973225
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 4722, -726212415 -> 426, 1478693314 -> 468
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '냁㌒낍㶰㹷幝๑쵍蹧抮࠯ਤ紦煦⶟辊棶Ꝫ'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 2097539652
    //   485: l2i
    //   486: ldc_w -202878280
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1126050521
    //   496: l2i
    //   497: ldc_w -323487520
    //   500: ixor
    //   501: ldc2_w 1521117840
    //   504: l2i
    //   505: ldc_w 1623340596
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 4640, -1266293672 -> 493, 1782477155 -> 536
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -125677804
    //   542: l2i
    //   543: ldc_w -125677803
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 1582541535
    //   556: l2i
    //   557: ldc_w 193185581
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1855646217
    //   567: l2i
    //   568: ldc_w 1540211626
    //   571: ixor
    //   572: ldc2_w 201976637
    //   575: l2i
    //   576: ldc_w 1169050788
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 4600, -2096139836 -> 608, 477612651 -> 564
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.c : I
    //   614: iflt -> 628
    //   617: ldc2_w 1807973311
    //   620: l2i
    //   621: ldc_w -1491851393
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w 1637426997
    //   631: l2i
    //   632: ldc_w 1624443054
    //   635: ixor
    //   636: ldc2_w 1663512468
    //   639: l2i
    //   640: ldc_w 188718893
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 4726, -1529877383 -> 628, 1767022370 -> 672
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w -904468448
    //   684: l2i
    //   685: ldc_w 1363061214
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1875469717
    //   695: l2i
    //   696: ldc_w -796871583
    //   699: ixor
    //   700: ldc2_w 1295702703
    //   703: l2i
    //   704: ldc_w -922086528
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 4674, 521701585 -> 692, 997791963 -> 736
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.c : I
    //   742: iflt -> 756
    //   745: ldc2_w 1410108771
    //   748: l2i
    //   749: ldc_w 43879838
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -1239906829
    //   759: l2i
    //   760: ldc_w 2019755970
    //   763: ixor
    //   764: ldc2_w 2052120434
    //   767: l2i
    //   768: ldc_w 1423797172
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 4718, -520734985 -> 800, 2015147067 -> 756
    //   800: putfield targetHudBackground : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.1 : I
    //   806: ifeq -> 820
    //   809: ldc2_w -2083090316
    //   812: l2i
    //   813: ldc_w -1743259767
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 429154844
    //   823: l2i
    //   824: ldc_w -394285342
    //   827: ixor
    //   828: ldc2_w -1614170068
    //   831: l2i
    //   832: ldc_w 616398336
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 864, -1609621436 -> 820, -1598709295 -> 4664
    //   864: aload_0
    //   865: getstatic Perryc.0 : I
    //   868: ifle -> 882
    //   871: ldc2_w -1061918731
    //   874: l2i
    //   875: ldc_w 808461011
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w 1550140710
    //   885: l2i
    //   886: ldc_w -168319091
    //   889: ixor
    //   890: ldc2_w 161823965
    //   893: l2i
    //   894: ldc_w 2040946104
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, -2138627005 -> 4670, 1897761733 -> 882
    //   924: aload_0
    //   925: new bigname/zprestige/webhack/features/setting/Setting
    //   928: dup
    //   929: ldc_w '냗㌒난㶼㹵幛๶쵍蹭抈࡮ਆ紡煱ⶑ'
    //   932: getstatic Perryc.0 : I
    //   935: ifle -> 949
    //   938: ldc2_w 1821614473
    //   941: l2i
    //   942: ldc_w -1758433144
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 479594602
    //   952: l2i
    //   953: ldc_w -1088945419
    //   956: ixor
    //   957: ldc2_w -1686792833
    //   960: l2i
    //   961: ldc_w 641440493
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 4708, 515900685 -> 992, 1189994131 -> 949
    //   992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   995: ldc2_w -1361871305
    //   998: l2i
    //   999: ldc_w -1361871209
    //   1002: ixor
    //   1003: getstatic Perryc.1 : I
    //   1006: ifeq -> 1020
    //   1009: ldc2_w -321305445
    //   1012: l2i
    //   1013: ldc_w 272975157
    //   1016: ixor
    //   1017: goto -> 1028
    //   1020: ldc2_w 1453312910
    //   1023: l2i
    //   1024: ldc_w -1338432545
    //   1027: ixor
    //   1028: ldc2_w -1810249555
    //   1031: l2i
    //   1032: ldc_w 1863441257
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 4666, 127144554 -> 1020, 498006933 -> 1064
    //   1064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1067: ldc2_w 1284116374
    //   1070: l2i
    //   1071: ldc_w 1284116374
    //   1074: ixor
    //   1075: getstatic Perryc.c : I
    //   1078: iflt -> 1092
    //   1081: ldc2_w 1055822721
    //   1084: l2i
    //   1085: ldc_w 540086704
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w -1012322885
    //   1095: l2i
    //   1096: ldc_w -1068571509
    //   1099: ixor
    //   1100: ldc2_w 2042519606
    //   1103: l2i
    //   1104: ldc_w 632774341
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 4696, 1121369282 -> 1092, 1609496515 -> 1136
    //   1136: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1139: ldc2_w -984891977
    //   1142: l2i
    //   1143: ldc_w -984892088
    //   1146: ixor
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w 1657963655
    //   1156: l2i
    //   1157: ldc_w 151910309
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 658234229
    //   1167: l2i
    //   1168: ldc_w 251531148
    //   1171: ixor
    //   1172: ldc2_w -1097538919
    //   1175: l2i
    //   1176: ldc_w 1400880868
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 4612, -2043400353 -> 1164, -1003583356 -> 1208
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w -1497567799
    //   1220: l2i
    //   1221: ldc_w 170824277
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w -2130847995
    //   1231: l2i
    //   1232: ldc_w 1899877646
    //   1235: ixor
    //   1236: ldc2_w -684348381
    //   1239: l2i
    //   1240: ldc_w 128510088
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 4652, 559761056 -> 1272, 2081372983 -> 1228
    //   1272: aload_0
    //   1273: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/Target;)Ljava/util/function/Predicate;
    //   1278: getstatic Perryc.c : I
    //   1281: iflt -> 1295
    //   1284: ldc2_w 1670152226
    //   1287: l2i
    //   1288: ldc_w 1094101562
    //   1291: ixor
    //   1292: goto -> 1303
    //   1295: ldc2_w 1334701758
    //   1298: l2i
    //   1299: ldc_w 2044232393
    //   1302: ixor
    //   1303: ldc2_w -2090171465
    //   1306: l2i
    //   1307: ldc_w -1953558668
    //   1310: ixor
    //   1311: ixor
    //   1312: lookupswitch default -> 4642, 710911707 -> 1295, 1051779252 -> 1340
    //   1340: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1343: getstatic Perryc.0 : I
    //   1346: ifle -> 1360
    //   1349: ldc2_w 508401308
    //   1352: l2i
    //   1353: ldc_w 1040987742
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w 1090953166
    //   1363: l2i
    //   1364: ldc_w 640159266
    //   1367: ixor
    //   1368: ldc2_w -1338794349
    //   1371: l2i
    //   1372: ldc_w 701518018
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 4638, -1180537197 -> 1360, -20095043 -> 1404
    //   1404: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1407: getstatic Perryc.1 : I
    //   1410: ifeq -> 1424
    //   1413: ldc2_w 2137028349
    //   1416: l2i
    //   1417: ldc_w -1668882033
    //   1420: ixor
    //   1421: goto -> 1432
    //   1424: ldc2_w -989667405
    //   1427: l2i
    //   1428: ldc_w -1183387933
    //   1431: ixor
    //   1432: ldc2_w 681515806
    //   1435: l2i
    //   1436: ldc_w -456510942
    //   1439: ixor
    //   1440: ixor
    //   1441: lookupswitch default -> 1468, -799587792 -> 1424, 800308814 -> 4656
    //   1468: putfield backgroundAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1471: getstatic Perryc.0 : I
    //   1474: ifle -> 1488
    //   1477: ldc2_w -420634588
    //   1480: l2i
    //   1481: ldc_w -269093735
    //   1484: ixor
    //   1485: goto -> 1496
    //   1488: ldc2_w 518624778
    //   1491: l2i
    //   1492: ldc_w -93263706
    //   1495: ixor
    //   1496: ldc2_w 302211732
    //   1499: l2i
    //   1500: ldc_w -567023403
    //   1503: ixor
    //   1504: ixor
    //   1505: lookupswitch default -> 1532, -987177220 -> 4694, 459712618 -> 1488
    //   1532: aload_0
    //   1533: getstatic Perryc.0 : I
    //   1536: ifle -> 1550
    //   1539: ldc2_w -1412706521
    //   1542: l2i
    //   1543: ldc_w -1285737752
    //   1546: ixor
    //   1547: goto -> 1558
    //   1550: ldc2_w 14236753
    //   1553: l2i
    //   1554: ldc_w 1640838720
    //   1557: ixor
    //   1558: ldc2_w 746288887
    //   1561: l2i
    //   1562: ldc_w -931081675
    //   1565: ixor
    //   1566: ixor
    //   1567: lookupswitch default -> 4614, -2047889709 -> 1592, -59942643 -> 1550
    //   1592: aload_0
    //   1593: new bigname/zprestige/webhack/features/setting/Setting
    //   1596: dup
    //   1597: ldc_w '냁㌒낍㶰㹷幝๑쵍蹧抴'
    //   1600: getstatic Perryc.0 : I
    //   1603: ifle -> 1617
    //   1606: ldc2_w -2058059086
    //   1609: l2i
    //   1610: ldc_w -806352208
    //   1613: ixor
    //   1614: goto -> 1625
    //   1617: ldc2_w 1306446085
    //   1620: l2i
    //   1621: ldc_w 247101250
    //   1624: ixor
    //   1625: ldc2_w 938217729
    //   1628: l2i
    //   1629: ldc_w -1991832460
    //   1632: ixor
    //   1633: ixor
    //   1634: lookupswitch default -> 1660, -200305289 -> 4672, 2025110936 -> 1617
    //   1660: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1663: ldc2_w 155073256
    //   1666: l2i
    //   1667: ldc_w 155073256
    //   1670: ixor
    //   1671: getstatic Perryc.0 : I
    //   1674: ifle -> 1688
    //   1677: ldc2_w 1851944919
    //   1680: l2i
    //   1681: ldc_w -1111046583
    //   1684: ixor
    //   1685: goto -> 1696
    //   1688: ldc2_w -1276157015
    //   1691: l2i
    //   1692: ldc_w 1595693260
    //   1695: ixor
    //   1696: ldc2_w -756392266
    //   1699: l2i
    //   1700: ldc_w -763522035
    //   1703: ixor
    //   1704: ixor
    //   1705: lookupswitch default -> 1732, -1368893119 -> 1688, -751607003 -> 4728
    //   1732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1735: ldc2_w -90087097
    //   1738: l2i
    //   1739: ldc_w -90087097
    //   1742: ixor
    //   1743: getstatic Perryc.1 : I
    //   1746: ifeq -> 1760
    //   1749: ldc2_w 1635803228
    //   1752: l2i
    //   1753: ldc_w -1871390692
    //   1756: ixor
    //   1757: goto -> 1768
    //   1760: ldc2_w 320957526
    //   1763: l2i
    //   1764: ldc_w -711389764
    //   1767: ixor
    //   1768: ldc2_w 1175044944
    //   1771: l2i
    //   1772: ldc_w -1135553945
    //   1775: ixor
    //   1776: ixor
    //   1777: lookupswitch default -> 4606, 195930487 -> 1760, 1021407453 -> 1804
    //   1804: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1807: ldc2_w -1964654950
    //   1810: l2i
    //   1811: ldc_w -1964655246
    //   1814: ixor
    //   1815: getstatic Perryc.c : I
    //   1818: iflt -> 1832
    //   1821: ldc2_w 2073337003
    //   1824: l2i
    //   1825: ldc_w 838388839
    //   1828: ixor
    //   1829: goto -> 1840
    //   1832: ldc2_w -1286308272
    //   1835: l2i
    //   1836: ldc_w 160187255
    //   1839: ixor
    //   1840: ldc2_w -1020462395
    //   1843: l2i
    //   1844: ldc_w 568969332
    //   1847: ixor
    //   1848: ixor
    //   1849: lookupswitch default -> 4618, -1465294211 -> 1832, 1478299542 -> 1876
    //   1876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1879: getstatic Perryc.c : I
    //   1882: iflt -> 1896
    //   1885: ldc2_w 1340334523
    //   1888: l2i
    //   1889: ldc_w 658202516
    //   1892: ixor
    //   1893: goto -> 1904
    //   1896: ldc2_w -2073945499
    //   1899: l2i
    //   1900: ldc_w -491238430
    //   1903: ixor
    //   1904: ldc2_w -1690858724
    //   1907: l2i
    //   1908: ldc_w -547946426
    //   1911: ixor
    //   1912: ixor
    //   1913: lookupswitch default -> 4626, 582671069 -> 1940, 750269813 -> 1896
    //   1940: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1943: getstatic Perryc.0 : I
    //   1946: ifle -> 1960
    //   1949: ldc2_w 2069428706
    //   1952: l2i
    //   1953: ldc_w 2089177743
    //   1956: ixor
    //   1957: goto -> 1968
    //   1960: ldc2_w -1643313417
    //   1963: l2i
    //   1964: ldc_w 984451922
    //   1967: ixor
    //   1968: ldc2_w 1642641379
    //   1971: l2i
    //   1972: ldc_w -1943102560
    //   1975: ixor
    //   1976: ixor
    //   1977: lookupswitch default -> 4658, -367491282 -> 1960, 1231462886 -> 2004
    //   2004: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2007: getstatic Perryc.1 : I
    //   2010: ifeq -> 2024
    //   2013: ldc2_w 1719578263
    //   2016: l2i
    //   2017: ldc_w 850964975
    //   2020: ixor
    //   2021: goto -> 2032
    //   2024: ldc2_w 1842955591
    //   2027: l2i
    //   2028: ldc_w -1089910022
    //   2031: ixor
    //   2032: ldc2_w 69467967
    //   2035: l2i
    //   2036: ldc_w -62296238
    //   2039: ixor
    //   2040: ixor
    //   2041: lookupswitch default -> 4688, -1397977323 -> 2024, 716873680 -> 2068
    //   2068: putfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2071: getstatic Perryc.1 : I
    //   2074: ifeq -> 2088
    //   2077: ldc2_w 1632590717
    //   2080: l2i
    //   2081: ldc_w 283266778
    //   2084: ixor
    //   2085: goto -> 2096
    //   2088: ldc2_w -621411979
    //   2091: l2i
    //   2092: ldc_w 1080519504
    //   2095: ixor
    //   2096: ldc2_w -2122569966
    //   2099: l2i
    //   2100: ldc_w -233155592
    //   2103: ixor
    //   2104: ixor
    //   2105: lookupswitch default -> 2132, 46883149 -> 4692, 241726640 -> 2088
    //   2132: aload_0
    //   2133: getstatic Perryc.1 : I
    //   2136: ifeq -> 2150
    //   2139: ldc2_w 857545895
    //   2142: l2i
    //   2143: ldc_w 2130165169
    //   2146: ixor
    //   2147: goto -> 2158
    //   2150: ldc2_w 1777440063
    //   2153: l2i
    //   2154: ldc_w -960910537
    //   2157: ixor
    //   2158: ldc2_w 1046311711
    //   2161: l2i
    //   2162: ldc_w -734046190
    //   2165: ixor
    //   2166: ixor
    //   2167: lookupswitch default -> 4628, -1484223973 -> 2150, 1160385797 -> 2192
    //   2192: aload_0
    //   2193: new bigname/zprestige/webhack/features/setting/Setting
    //   2196: dup
    //   2197: ldc_w '냁㌒낍㶰㹷幝๑쵍蹧抵'
    //   2200: getstatic Perryc.c : I
    //   2203: iflt -> 2217
    //   2206: ldc2_w 1849302430
    //   2209: l2i
    //   2210: ldc_w 126736026
    //   2213: ixor
    //   2214: goto -> 2225
    //   2217: ldc2_w 918238373
    //   2220: l2i
    //   2221: ldc_w -1026224280
    //   2224: ixor
    //   2225: ldc2_w -1794532181
    //   2228: l2i
    //   2229: ldc_w -1073399632
    //   2232: ixor
    //   2233: ixor
    //   2234: lookupswitch default -> 4620, -1587372074 -> 2260, 1018916639 -> 2217
    //   2260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2263: ldc2_w -1221462340
    //   2266: l2i
    //   2267: ldc_w -1221462340
    //   2270: ixor
    //   2271: getstatic Perryc.0 : I
    //   2274: ifle -> 2288
    //   2277: ldc2_w 1480068304
    //   2280: l2i
    //   2281: ldc_w -172427832
    //   2284: ixor
    //   2285: goto -> 2296
    //   2288: ldc2_w -1400068114
    //   2291: l2i
    //   2292: ldc_w 1346904156
    //   2295: ixor
    //   2296: ldc2_w 1780403975
    //   2299: l2i
    //   2300: ldc_w -306968230
    //   2303: ixor
    //   2304: ixor
    //   2305: lookupswitch default -> 4680, 707411781 -> 2288, 2070823407 -> 2332
    //   2332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2335: ldc2_w 8073427
    //   2338: l2i
    //   2339: ldc_w 8073427
    //   2342: ixor
    //   2343: getstatic Perryc.0 : I
    //   2346: ifle -> 2360
    //   2349: ldc2_w -1028924830
    //   2352: l2i
    //   2353: ldc_w -589812646
    //   2356: ixor
    //   2357: goto -> 2368
    //   2360: ldc2_w -667750535
    //   2363: l2i
    //   2364: ldc_w -164737572
    //   2367: ixor
    //   2368: ldc2_w 2044991261
    //   2371: l2i
    //   2372: ldc_w -3530755
    //   2375: ixor
    //   2376: ixor
    //   2377: lookupswitch default -> 2404, -1738670376 -> 4710, -229045328 -> 2360
    //   2404: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2407: ldc2_w -1826557215
    //   2410: l2i
    //   2411: ldc_w -1826557687
    //   2414: ixor
    //   2415: getstatic Perryc.c : I
    //   2418: iflt -> 2432
    //   2421: ldc2_w -594444583
    //   2424: l2i
    //   2425: ldc_w -1642381881
    //   2428: ixor
    //   2429: goto -> 2440
    //   2432: ldc2_w 891341678
    //   2435: l2i
    //   2436: ldc_w 2017494249
    //   2439: ixor
    //   2440: ldc2_w 916325779
    //   2443: l2i
    //   2444: ldc_w 982609553
    //   2447: ixor
    //   2448: ixor
    //   2449: lookupswitch default -> 4702, 1097802885 -> 2476, 1317349404 -> 2432
    //   2476: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2479: getstatic Perryc.c : I
    //   2482: iflt -> 2496
    //   2485: ldc2_w -1313502465
    //   2488: l2i
    //   2489: ldc_w 1207855737
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w -595165414
    //   2499: l2i
    //   2500: ldc_w -336509551
    //   2503: ixor
    //   2504: ldc2_w 1002246225
    //   2507: l2i
    //   2508: ldc_w 1876387803
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 4676, -1574856948 -> 2496, 1662864641 -> 2540
    //   2540: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2543: getstatic Perryc.1 : I
    //   2546: ifeq -> 2560
    //   2549: ldc2_w -124900085
    //   2552: l2i
    //   2553: ldc_w -1249444146
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w 1150688846
    //   2563: l2i
    //   2564: ldc_w 1190109363
    //   2567: ixor
    //   2568: ldc2_w -135890926
    //   2571: l2i
    //   2572: ldc_w -854177056
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 4644, 948538383 -> 2604, 2012799287 -> 2560
    //   2604: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2607: getstatic Perryc.c : I
    //   2610: iflt -> 2624
    //   2613: ldc2_w -1010239670
    //   2616: l2i
    //   2617: ldc_w -2101083295
    //   2620: ixor
    //   2621: goto -> 2632
    //   2624: ldc2_w 870809940
    //   2627: l2i
    //   2628: ldc_w -1791984175
    //   2631: ixor
    //   2632: ldc2_w 2037221295
    //   2635: l2i
    //   2636: ldc_w -1603178826
    //   2639: ixor
    //   2640: ixor
    //   2641: lookupswitch default -> 2668, -1743774414 -> 4700, -258013873 -> 2624
    //   2668: putfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2671: getstatic Perryc.1 : I
    //   2674: ifeq -> 2688
    //   2677: ldc2_w -92385706
    //   2680: l2i
    //   2681: ldc_w 1366572154
    //   2684: ixor
    //   2685: goto -> 2696
    //   2688: ldc2_w -761112150
    //   2691: l2i
    //   2692: ldc_w -508725626
    //   2695: ixor
    //   2696: ldc2_w 1233067217
    //   2699: l2i
    //   2700: ldc_w -1475562392
    //   2703: ixor
    //   2704: ixor
    //   2705: lookupswitch default -> 4720, -763590763 -> 2732, 1249499797 -> 2688
    //   2732: aload_0
    //   2733: getstatic Perryc.c : I
    //   2736: iflt -> 2750
    //   2739: ldc2_w -1700651855
    //   2742: l2i
    //   2743: ldc_w -1355117721
    //   2746: ixor
    //   2747: goto -> 2758
    //   2750: ldc2_w 748641432
    //   2753: l2i
    //   2754: ldc_w 184769116
    //   2757: ixor
    //   2758: ldc2_w -2027725058
    //   2761: l2i
    //   2762: ldc_w 1534727504
    //   2765: ixor
    //   2766: ixor
    //   2767: lookupswitch default -> 4660, -373171080 -> 2750, -70955670 -> 2792
    //   2792: aload_0
    //   2793: new bigname/zprestige/webhack/features/setting/Setting
    //   2796: dup
    //   2797: ldc_w '냗㌒난㶼㹵幛๶쵍蹭抈ࡣਕ紨煥'
    //   2800: getstatic Perryc.0 : I
    //   2803: ifle -> 2817
    //   2806: ldc2_w -336535751
    //   2809: l2i
    //   2810: ldc_w 1499687850
    //   2813: ixor
    //   2814: goto -> 2825
    //   2817: ldc2_w 1555114788
    //   2820: l2i
    //   2821: ldc_w -1504480761
    //   2824: ixor
    //   2825: ldc2_w 163062709
    //   2828: l2i
    //   2829: ldc_w -2035347584
    //   2832: ixor
    //   2833: ixor
    //   2834: lookupswitch default -> 4716, 1032100006 -> 2817, 1979020566 -> 2860
    //   2860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2863: ldc2_w -1079534225
    //   2866: l2i
    //   2867: ldc_w -1079534213
    //   2870: ixor
    //   2871: getstatic Perryc.c : I
    //   2874: iflt -> 2888
    //   2877: ldc2_w -528132471
    //   2880: l2i
    //   2881: ldc_w 1706645216
    //   2884: ixor
    //   2885: goto -> 2896
    //   2888: ldc2_w -135081150
    //   2891: l2i
    //   2892: ldc_w -320676946
    //   2895: ixor
    //   2896: ldc2_w 1628003153
    //   2899: l2i
    //   2900: ldc_w -1481635792
    //   2903: ixor
    //   2904: ixor
    //   2905: lookupswitch default -> 4632, -576103539 -> 2932, 1132811016 -> 2888
    //   2932: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2935: ldc2_w -1343854705
    //   2938: l2i
    //   2939: ldc_w -1343854705
    //   2942: ixor
    //   2943: getstatic Perryc.1 : I
    //   2946: ifeq -> 2960
    //   2949: ldc2_w -1830256727
    //   2952: l2i
    //   2953: ldc_w -1139689532
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w 1424321390
    //   2963: l2i
    //   2964: ldc_w -1183481858
    //   2967: ixor
    //   2968: ldc2_w -974916398
    //   2971: l2i
    //   2972: ldc_w -2120763191
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 3004, -1176137710 -> 2960, 1787659382 -> 4712
    //   3004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3007: ldc2_w -1278026423
    //   3010: l2i
    //   3011: ldc_w -1278026314
    //   3014: ixor
    //   3015: getstatic Perryc.1 : I
    //   3018: ifeq -> 3032
    //   3021: ldc2_w -1428031844
    //   3024: l2i
    //   3025: ldc_w 1696039016
    //   3028: ixor
    //   3029: goto -> 3040
    //   3032: ldc2_w -1048022762
    //   3035: l2i
    //   3036: ldc_w 586351426
    //   3039: ixor
    //   3040: ldc2_w -724534679
    //   3043: l2i
    //   3044: ldc_w 2021302478
    //   3047: ixor
    //   3048: ixor
    //   3049: lookupswitch default -> 3076, 226458208 -> 3032, 1667017811 -> 4714
    //   3076: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3079: getstatic Perryc.c : I
    //   3082: iflt -> 3096
    //   3085: ldc2_w 368858026
    //   3088: l2i
    //   3089: ldc_w -1884205254
    //   3092: ixor
    //   3093: goto -> 3104
    //   3096: ldc2_w 1558757245
    //   3099: l2i
    //   3100: ldc_w -1869214467
    //   3103: ixor
    //   3104: ldc2_w 1516726174
    //   3107: l2i
    //   3108: ldc_w 707309383
    //   3111: ixor
    //   3112: ixor
    //   3113: lookupswitch default -> 4646, -1137607847 -> 3140, -368913335 -> 3096
    //   3140: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3143: getstatic Perryc.0 : I
    //   3146: ifle -> 3160
    //   3149: ldc2_w -1923521282
    //   3152: l2i
    //   3153: ldc_w -1334343739
    //   3156: ixor
    //   3157: goto -> 3168
    //   3160: ldc2_w 1717027959
    //   3163: l2i
    //   3164: ldc_w -635963139
    //   3167: ixor
    //   3168: ldc2_w 727151351
    //   3171: l2i
    //   3172: ldc_w -1774121578
    //   3175: ixor
    //   3176: ixor
    //   3177: lookupswitch default -> 3204, -2143773606 -> 4622, -697826224 -> 3160
    //   3204: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3207: getstatic Perryc.c : I
    //   3210: iflt -> 3224
    //   3213: ldc2_w -1971186239
    //   3216: l2i
    //   3217: ldc_w -1719802161
    //   3220: ixor
    //   3221: goto -> 3232
    //   3224: ldc2_w 685896804
    //   3227: l2i
    //   3228: ldc_w 1821091971
    //   3231: ixor
    //   3232: ldc2_w 1447461246
    //   3235: l2i
    //   3236: ldc_w -677341456
    //   3239: ixor
    //   3240: ixor
    //   3241: lookupswitch default -> 3268, -1843796864 -> 4678, 501953344 -> 3224
    //   3268: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3271: getstatic Perryc.c : I
    //   3274: iflt -> 3288
    //   3277: ldc2_w -368225745
    //   3280: l2i
    //   3281: ldc_w 250568112
    //   3284: ixor
    //   3285: goto -> 3296
    //   3288: ldc2_w -1835157378
    //   3291: l2i
    //   3292: ldc_w -1036964674
    //   3295: ixor
    //   3296: ldc2_w -1335711308
    //   3299: l2i
    //   3300: ldc_w 431678887
    //   3303: ixor
    //   3304: ixor
    //   3305: lookupswitch default -> 4624, -109782829 -> 3332, 1295664012 -> 3288
    //   3332: aload_0
    //   3333: getstatic Perryc.c : I
    //   3336: iflt -> 3350
    //   3339: ldc2_w 144544993
    //   3342: l2i
    //   3343: ldc_w -1239325972
    //   3346: ixor
    //   3347: goto -> 3358
    //   3350: ldc2_w -997098572
    //   3353: l2i
    //   3354: ldc_w 711675352
    //   3357: ixor
    //   3358: ldc2_w -1413633181
    //   3361: l2i
    //   3362: ldc_w -719863203
    //   3365: ixor
    //   3366: ixor
    //   3367: lookupswitch default -> 4682, -1873780910 -> 3392, -1072259277 -> 3350
    //   3392: aload_0
    //   3393: new bigname/zprestige/webhack/features/setting/Setting
    //   3396: dup
    //   3397: ldc_w '냗㌒난㶼㹵幛๶쵍蹭抈ࡣ਀紿煤⶞'
    //   3400: getstatic Perryc.c : I
    //   3403: iflt -> 3417
    //   3406: ldc2_w 191293904
    //   3409: l2i
    //   3410: ldc_w -521128012
    //   3413: ixor
    //   3414: goto -> 3425
    //   3417: ldc2_w 1762349177
    //   3420: l2i
    //   3421: ldc_w -966170472
    //   3424: ixor
    //   3425: ldc2_w -38513839
    //   3428: l2i
    //   3429: ldc_w -1367721617
    //   3432: ixor
    //   3433: ixor
    //   3434: lookupswitch default -> 3460, -1202146214 -> 4724, -519397473 -> 3417
    //   3460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3463: ldc2_w 1981513739
    //   3466: l2i
    //   3467: ldc_w 1981513759
    //   3470: ixor
    //   3471: getstatic Perryc.1 : I
    //   3474: ifeq -> 3488
    //   3477: ldc2_w 140321767
    //   3480: l2i
    //   3481: ldc_w 2145631901
    //   3484: ixor
    //   3485: goto -> 3496
    //   3488: ldc2_w 862375525
    //   3491: l2i
    //   3492: ldc_w 427275448
    //   3495: ixor
    //   3496: ldc2_w -1311713226
    //   3499: l2i
    //   3500: ldc_w 172309419
    //   3503: ixor
    //   3504: ixor
    //   3505: lookupswitch default -> 4662, -1853580992 -> 3532, -869564697 -> 3488
    //   3532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3535: ldc2_w 1978366609
    //   3538: l2i
    //   3539: ldc_w 1978366609
    //   3542: ixor
    //   3543: getstatic Perryc.0 : I
    //   3546: ifle -> 3560
    //   3549: ldc2_w -617833793
    //   3552: l2i
    //   3553: ldc_w 2130022543
    //   3556: ixor
    //   3557: goto -> 3568
    //   3560: ldc2_w 1873896679
    //   3563: l2i
    //   3564: ldc_w 1864827690
    //   3567: ixor
    //   3568: ldc2_w 2017344355
    //   3571: l2i
    //   3572: ldc_w 1011881731
    //   3575: ixor
    //   3576: ixor
    //   3577: lookupswitch default -> 3604, -508090800 -> 4602, 1858626533 -> 3560
    //   3604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3607: ldc2_w -296331614
    //   3610: l2i
    //   3611: ldc_w -296331683
    //   3614: ixor
    //   3615: getstatic Perryc.1 : I
    //   3618: ifeq -> 3632
    //   3621: ldc2_w -890744988
    //   3624: l2i
    //   3625: ldc_w -426355162
    //   3628: ixor
    //   3629: goto -> 3640
    //   3632: ldc2_w 20032603
    //   3635: l2i
    //   3636: ldc_w 1153910301
    //   3639: ixor
    //   3640: ldc2_w -1092050580
    //   3643: l2i
    //   3644: ldc_w 1965493813
    //   3647: ixor
    //   3648: ixor
    //   3649: lookupswitch default -> 4630, -1908849377 -> 3676, -407783909 -> 3632
    //   3676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3679: getstatic Perryc.c : I
    //   3682: iflt -> 3696
    //   3685: ldc2_w 744271110
    //   3688: l2i
    //   3689: ldc_w -675405904
    //   3692: ixor
    //   3693: goto -> 3704
    //   3696: ldc2_w 1949025433
    //   3699: l2i
    //   3700: ldc_w 1048019196
    //   3703: ixor
    //   3704: ldc2_w 285382353
    //   3707: l2i
    //   3708: ldc_w 2117691279
    //   3711: ixor
    //   3712: ixor
    //   3713: lookupswitch default -> 3740, -1797700632 -> 4704, -77245388 -> 3696
    //   3740: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3743: getstatic Perryc.0 : I
    //   3746: ifle -> 3760
    //   3749: ldc2_w -418992475
    //   3752: l2i
    //   3753: ldc_w 1766978104
    //   3756: ixor
    //   3757: goto -> 3768
    //   3760: ldc2_w -660304816
    //   3763: l2i
    //   3764: ldc_w -1383185646
    //   3767: ixor
    //   3768: ldc2_w -1234701024
    //   3771: l2i
    //   3772: ldc_w -993855660
    //   3775: ixor
    //   3776: ixor
    //   3777: lookupswitch default -> 4732, -51224855 -> 3760, 126864694 -> 3804
    //   3804: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3807: getstatic Perryc.c : I
    //   3810: iflt -> 3824
    //   3813: ldc2_w 1555875525
    //   3816: l2i
    //   3817: ldc_w 1485511245
    //   3820: ixor
    //   3821: goto -> 3832
    //   3824: ldc2_w -1324316465
    //   3827: l2i
    //   3828: ldc_w -885328926
    //   3831: ixor
    //   3832: ldc2_w -71409071
    //   3835: l2i
    //   3836: ldc_w 627029121
    //   3839: ixor
    //   3840: ixor
    //   3841: lookupswitch default -> 3868, -623506856 -> 4616, 939520816 -> 3824
    //   3868: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3871: getstatic Perryc.c : I
    //   3874: iflt -> 3888
    //   3877: ldc2_w -107154505
    //   3880: l2i
    //   3881: ldc_w 547831851
    //   3884: ixor
    //   3885: goto -> 3896
    //   3888: ldc2_w -909992849
    //   3891: l2i
    //   3892: ldc_w -930914854
    //   3895: ixor
    //   3896: ldc2_w -819464440
    //   3899: l2i
    //   3900: ldc_w -1604675876
    //   3903: ixor
    //   3904: ixor
    //   3905: lookupswitch default -> 3932, -1658292325 -> 3888, -1236872632 -> 4636
    //   3932: aload_0
    //   3933: getstatic Perryc.1 : I
    //   3936: ifeq -> 3950
    //   3939: ldc2_w -1109895365
    //   3942: l2i
    //   3943: ldc_w -1992056682
    //   3946: ixor
    //   3947: goto -> 3958
    //   3950: ldc2_w 1693605071
    //   3953: l2i
    //   3954: ldc_w 517615625
    //   3957: ixor
    //   3958: ldc2_w 2052212399
    //   3961: l2i
    //   3962: ldc_w -939740740
    //   3965: ixor
    //   3966: ixor
    //   3967: lookupswitch default -> 4698, -1993015106 -> 3950, -947479595 -> 3992
    //   3992: aload_0
    //   3993: new bigname/zprestige/webhack/features/setting/Setting
    //   3996: dup
    //   3997: ldc_w '냗㌒난㶼㹵幛๶쵍蹭抈ࡣਅ紡煴'
    //   4000: getstatic Perryc.c : I
    //   4003: iflt -> 4017
    //   4006: ldc2_w -1618824170
    //   4009: l2i
    //   4010: ldc_w -1414988004
    //   4013: ixor
    //   4014: goto -> 4025
    //   4017: ldc2_w -1069208622
    //   4020: l2i
    //   4021: ldc_w 235148679
    //   4024: ixor
    //   4025: ldc2_w 1534738942
    //   4028: l2i
    //   4029: ldc_w 403271438
    //   4032: ixor
    //   4033: ixor
    //   4034: lookupswitch default -> 4060, 786180207 -> 4017, 2002347514 -> 4690
    //   4060: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4063: ldc2_w 1075152979
    //   4066: l2i
    //   4067: ldc_w 1075152967
    //   4070: ixor
    //   4071: getstatic Perryc.1 : I
    //   4074: ifeq -> 4088
    //   4077: ldc2_w 1922782156
    //   4080: l2i
    //   4081: ldc_w -2045372257
    //   4084: ixor
    //   4085: goto -> 4096
    //   4088: ldc2_w 187090501
    //   4091: l2i
    //   4092: ldc_w 2072681330
    //   4095: ixor
    //   4096: ldc2_w -640040613
    //   4099: l2i
    //   4100: ldc_w -1294636625
    //   4103: ixor
    //   4104: ixor
    //   4105: lookupswitch default -> 4604, -1618877529 -> 4088, 463533507 -> 4132
    //   4132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4135: ldc2_w -1075951234
    //   4138: l2i
    //   4139: ldc_w -1075951234
    //   4142: ixor
    //   4143: getstatic Perryc.0 : I
    //   4146: ifle -> 4160
    //   4149: ldc2_w -1269589917
    //   4152: l2i
    //   4153: ldc_w 150103798
    //   4156: ixor
    //   4157: goto -> 4168
    //   4160: ldc2_w 1543382693
    //   4163: l2i
    //   4164: ldc_w -1622411555
    //   4167: ixor
    //   4168: ldc2_w -331087228
    //   4171: l2i
    //   4172: ldc_w -76133388
    //   4175: ixor
    //   4176: ixor
    //   4177: lookupswitch default -> 4654, -1416382491 -> 4160, -746088184 -> 4204
    //   4204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4207: ldc2_w -1212531020
    //   4210: l2i
    //   4211: ldc_w -1212531125
    //   4214: ixor
    //   4215: getstatic Perryc.0 : I
    //   4218: ifle -> 4232
    //   4221: ldc2_w -1220944390
    //   4224: l2i
    //   4225: ldc_w -886814622
    //   4228: ixor
    //   4229: goto -> 4240
    //   4232: ldc2_w -2056706467
    //   4235: l2i
    //   4236: ldc_w 2050967783
    //   4239: ixor
    //   4240: ldc2_w -1911726350
    //   4243: l2i
    //   4244: ldc_w -1321913055
    //   4247: ixor
    //   4248: ixor
    //   4249: lookupswitch default -> 4276, -1306789027 -> 4232, 1126563403 -> 4686
    //   4276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4279: getstatic Perryc.0 : I
    //   4282: ifle -> 4296
    //   4285: ldc2_w 1833952672
    //   4288: l2i
    //   4289: ldc_w 964942082
    //   4292: ixor
    //   4293: goto -> 4304
    //   4296: ldc2_w -1310562277
    //   4299: l2i
    //   4300: ldc_w 1526511396
    //   4303: ixor
    //   4304: ldc2_w 127312081
    //   4307: l2i
    //   4308: ldc_w -1863388529
    //   4311: ixor
    //   4312: ixor
    //   4313: lookupswitch default -> 4340, -1011585284 -> 4608, -116198460 -> 4296
    //   4340: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4343: getstatic Perryc.0 : I
    //   4346: ifle -> 4360
    //   4349: ldc2_w -1909197716
    //   4352: l2i
    //   4353: ldc_w -40565537
    //   4356: ixor
    //   4357: goto -> 4368
    //   4360: ldc2_w 1834921739
    //   4363: l2i
    //   4364: ldc_w 882467941
    //   4367: ixor
    //   4368: ldc2_w 1516318521
    //   4371: l2i
    //   4372: ldc_w 2127841517
    //   4375: ixor
    //   4376: ixor
    //   4377: lookupswitch default -> 4404, 1109532328 -> 4360, 1460901735 -> 4648
    //   4404: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4407: getstatic Perryc.c : I
    //   4410: iflt -> 4424
    //   4413: ldc2_w 1934318195
    //   4416: l2i
    //   4417: ldc_w -287710257
    //   4420: ixor
    //   4421: goto -> 4432
    //   4424: ldc2_w 1369832171
    //   4427: l2i
    //   4428: ldc_w 839769764
    //   4431: ixor
    //   4432: ldc2_w -2043837597
    //   4435: l2i
    //   4436: ldc_w 215945418
    //   4439: ixor
    //   4440: ixor
    //   4441: lookupswitch default -> 4468, -813823418 -> 4424, 392178197 -> 4610
    //   4468: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4471: getstatic Perryc.1 : I
    //   4474: ifeq -> 4488
    //   4477: ldc2_w -710078305
    //   4480: l2i
    //   4481: ldc_w 632020894
    //   4484: ixor
    //   4485: goto -> 4496
    //   4488: ldc2_w 118331122
    //   4491: l2i
    //   4492: ldc_w -1763537613
    //   4495: ixor
    //   4496: ldc2_w 1044559902
    //   4499: l2i
    //   4500: ldc_w -1177144407
    //   4503: ixor
    //   4504: ixor
    //   4505: lookupswitch default -> 4532, -1172775767 -> 4488, 2006074550 -> 4730
    //   4532: aload_0
    //   4533: getstatic Perryc.1 : I
    //   4536: ifeq -> 4550
    //   4539: ldc2_w -1884826276
    //   4542: l2i
    //   4543: ldc_w -1125113377
    //   4546: ixor
    //   4547: goto -> 4558
    //   4550: ldc2_w -226655232
    //   4553: l2i
    //   4554: ldc_w 1046511904
    //   4557: ixor
    //   4558: ldc2_w 32951519
    //   4561: l2i
    //   4562: ldc_w -23691148
    //   4565: ixor
    //   4566: ixor
    //   4567: lookupswitch default -> 4592, -868763608 -> 4706, -304274639 -> 4550
    //   4592: invokespecial setInstance : ()V
    //   4595: return
    //   4596: aconst_null
    //   4597: athrow
    //   4598: aconst_null
    //   4599: athrow
    //   4600: aconst_null
    //   4601: athrow
    //   4602: aconst_null
    //   4603: athrow
    //   4604: aconst_null
    //   4605: athrow
    //   4606: aconst_null
    //   4607: athrow
    //   4608: aconst_null
    //   4609: athrow
    //   4610: aconst_null
    //   4611: athrow
    //   4612: aconst_null
    //   4613: athrow
    //   4614: aconst_null
    //   4615: athrow
    //   4616: aconst_null
    //   4617: athrow
    //   4618: aconst_null
    //   4619: athrow
    //   4620: aconst_null
    //   4621: athrow
    //   4622: aconst_null
    //   4623: athrow
    //   4624: aconst_null
    //   4625: athrow
    //   4626: aconst_null
    //   4627: athrow
    //   4628: aconst_null
    //   4629: athrow
    //   4630: aconst_null
    //   4631: athrow
    //   4632: aconst_null
    //   4633: athrow
    //   4634: aconst_null
    //   4635: athrow
    //   4636: aconst_null
    //   4637: athrow
    //   4638: aconst_null
    //   4639: athrow
    //   4640: aconst_null
    //   4641: athrow
    //   4642: aconst_null
    //   4643: athrow
    //   4644: aconst_null
    //   4645: athrow
    //   4646: aconst_null
    //   4647: athrow
    //   4648: aconst_null
    //   4649: athrow
    //   4650: aconst_null
    //   4651: athrow
    //   4652: aconst_null
    //   4653: athrow
    //   4654: aconst_null
    //   4655: athrow
    //   4656: aconst_null
    //   4657: athrow
    //   4658: aconst_null
    //   4659: athrow
    //   4660: aconst_null
    //   4661: athrow
    //   4662: aconst_null
    //   4663: athrow
    //   4664: aconst_null
    //   4665: athrow
    //   4666: aconst_null
    //   4667: athrow
    //   4668: aconst_null
    //   4669: athrow
    //   4670: aconst_null
    //   4671: athrow
    //   4672: aconst_null
    //   4673: athrow
    //   4674: aconst_null
    //   4675: athrow
    //   4676: aconst_null
    //   4677: athrow
    //   4678: aconst_null
    //   4679: athrow
    //   4680: aconst_null
    //   4681: athrow
    //   4682: aconst_null
    //   4683: athrow
    //   4684: aconst_null
    //   4685: athrow
    //   4686: aconst_null
    //   4687: athrow
    //   4688: aconst_null
    //   4689: athrow
    //   4690: aconst_null
    //   4691: athrow
    //   4692: aconst_null
    //   4693: athrow
    //   4694: aconst_null
    //   4695: athrow
    //   4696: aconst_null
    //   4697: athrow
    //   4698: aconst_null
    //   4699: athrow
    //   4700: aconst_null
    //   4701: athrow
    //   4702: aconst_null
    //   4703: athrow
    //   4704: aconst_null
    //   4705: athrow
    //   4706: aconst_null
    //   4707: athrow
    //   4708: aconst_null
    //   4709: athrow
    //   4710: aconst_null
    //   4711: athrow
    //   4712: aconst_null
    //   4713: athrow
    //   4714: aconst_null
    //   4715: athrow
    //   4716: aconst_null
    //   4717: athrow
    //   4718: aconst_null
    //   4719: athrow
    //   4720: aconst_null
    //   4721: athrow
    //   4722: aconst_null
    //   4723: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	4596	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Target;
  }
  
  public void drawTargetHud(float partialTicks, EntityPlayer player) {
    // Byte code:
    //   0: goto -> 13
    //   3: dup
    //   4: ifnonnull -> 12
    //   7: goto_w -> 35634
    //   12: athrow
    //   13: aconst_null
    //   14: getstatic Perryc.0 : I
    //   17: ifle -> 25
    //   20: goto_w -> 35626
    //   25: pop
    //   26: aconst_null
    //   27: goto_w -> 35618
    //   32: nop
    //   33: nop
    //   34: nop
    //   35: athrow
    //   36: ldc_w ''
    //   39: getstatic Perryc.c : I
    //   42: iflt -> 56
    //   45: ldc2_w 1193468519
    //   48: l2i
    //   49: ldc_w 1593091864
    //   52: ixor
    //   53: goto -> 64
    //   56: ldc2_w -316646845
    //   59: l2i
    //   60: ldc_w 1949326688
    //   63: ixor
    //   64: ldc2_w -1867727227
    //   67: l2i
    //   68: ldc_w 178177829
    //   71: ixor
    //   72: ixor
    //   73: lookupswitch default -> 35073, -2082194209 -> 56, 52592259 -> 100
    //   100: astore_3
    //   101: getstatic Perryc.c : I
    //   104: iflt -> 118
    //   107: ldc2_w -869668077
    //   110: l2i
    //   111: ldc_w 300488796
    //   114: ixor
    //   115: goto -> 126
    //   118: ldc2_w -1950911851
    //   121: l2i
    //   122: ldc_w -405873703
    //   125: ixor
    //   126: ldc2_w -1911497231
    //   129: l2i
    //   130: ldc_w -230928880
    //   133: ixor
    //   134: ixor
    //   135: lookupswitch default -> 35533, -1578344274 -> 118, 274021037 -> 160
    //   160: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   163: getstatic Perryc.c : I
    //   166: iflt -> 180
    //   169: ldc2_w -1818825300
    //   172: l2i
    //   173: ldc_w 864374009
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w 72215531
    //   183: l2i
    //   184: ldc_w 978628229
    //   187: ixor
    //   188: ldc2_w -786166829
    //   191: l2i
    //   192: ldc_w 1460774848
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 34991, -1205016195 -> 224, 640027974 -> 180
    //   224: goto -> 228
    //   227: athrow
    //   228: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   231: goto -> 235
    //   234: athrow
    //   235: getstatic Perryc.1 : I
    //   238: ifeq -> 252
    //   241: ldc2_w 1475112099
    //   244: l2i
    //   245: ldc_w -1107842685
    //   248: ixor
    //   249: goto -> 260
    //   252: ldc2_w -1567785590
    //   255: l2i
    //   256: ldc_w 191744980
    //   259: ixor
    //   260: ldc2_w -1654803069
    //   263: l2i
    //   264: ldc_w 304214351
    //   267: ixor
    //   268: ixor
    //   269: lookupswitch default -> 35361, 647819922 -> 296, 1701282284 -> 252
    //   296: goto -> 300
    //   299: athrow
    //   300: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   303: goto -> 307
    //   306: athrow
    //   307: checkcast net/minecraft/client/network/NetHandlerPlayClient
    //   310: getstatic Perryc.c : I
    //   313: iflt -> 327
    //   316: ldc2_w 1919043862
    //   319: l2i
    //   320: ldc_w -2124562739
    //   323: ixor
    //   324: goto -> 335
    //   327: ldc2_w 877629232
    //   330: l2i
    //   331: ldc_w -727816911
    //   334: ixor
    //   335: ldc2_w -1746685626
    //   338: l2i
    //   339: ldc_w 1534020630
    //   342: ixor
    //   343: ixor
    //   344: lookupswitch default -> 372, 1068698251 -> 35121, 1202684661 -> 327
    //   372: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   375: getstatic Perryc.1 : I
    //   378: ifeq -> 392
    //   381: ldc2_w 1039531069
    //   384: l2i
    //   385: ldc_w -1224673232
    //   388: ixor
    //   389: goto -> 400
    //   392: ldc2_w 1928337110
    //   395: l2i
    //   396: ldc_w 2101996604
    //   399: ixor
    //   400: ldc2_w 297021142
    //   403: l2i
    //   404: ldc_w 70833868
    //   407: ixor
    //   408: ixor
    //   409: lookupswitch default -> 436, -1619395561 -> 34773, 465395736 -> 392
    //   436: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   439: getstatic Perryc.0 : I
    //   442: ifle -> 456
    //   445: ldc2_w 2015394458
    //   448: l2i
    //   449: ldc_w 2043510637
    //   452: ixor
    //   453: goto -> 464
    //   456: ldc2_w 571773863
    //   459: l2i
    //   460: ldc_w -920579894
    //   463: ixor
    //   464: ldc2_w -2009989283
    //   467: l2i
    //   468: ldc_w -617699639
    //   471: ixor
    //   472: ixor
    //   473: lookupswitch default -> 35453, -1205150983 -> 500, 1391615075 -> 456
    //   500: goto -> 504
    //   503: athrow
    //   504: invokevirtual func_110124_au : ()Ljava/util/UUID;
    //   507: goto -> 511
    //   510: athrow
    //   511: getstatic Perryc.c : I
    //   514: iflt -> 528
    //   517: ldc2_w -401697402
    //   520: l2i
    //   521: ldc_w -410863565
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w -377889505
    //   531: l2i
    //   532: ldc_w -2079136981
    //   535: ixor
    //   536: ldc2_w 304152733
    //   539: l2i
    //   540: ldc_w 1463541491
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 34783, 678551642 -> 572, 1251406811 -> 528
    //   572: goto -> 576
    //   575: athrow
    //   576: invokevirtual func_175102_a : (Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
    //   579: goto -> 583
    //   582: athrow
    //   583: getstatic Perryc.1 : I
    //   586: ifeq -> 600
    //   589: ldc2_w -1107187325
    //   592: l2i
    //   593: ldc_w -549718965
    //   596: ixor
    //   597: goto -> 608
    //   600: ldc2_w -530583752
    //   603: l2i
    //   604: ldc_w 282487988
    //   607: ixor
    //   608: ldc2_w 925973375
    //   611: l2i
    //   612: ldc_w 43482488
    //   615: ixor
    //   616: ixor
    //   617: lookupswitch default -> 35213, -986724981 -> 644, 1419516879 -> 600
    //   644: goto -> 648
    //   647: athrow
    //   648: invokevirtual func_178853_c : ()I
    //   651: goto -> 655
    //   654: athrow
    //   655: getstatic Perryc.0 : I
    //   658: ifle -> 672
    //   661: ldc2_w -185262327
    //   664: l2i
    //   665: ldc_w -546329130
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w 738618449
    //   675: l2i
    //   676: ldc_w -188501954
    //   679: ixor
    //   680: ldc2_w -720175492
    //   683: l2i
    //   684: ldc_w 2044411144
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 716, -2024574549 -> 35307, -642880297 -> 672
    //   716: istore #4
    //   718: new java/lang/StringBuilder
    //   721: dup
    //   722: getstatic Perryc.c : I
    //   725: iflt -> 739
    //   728: ldc2_w -26743196
    //   731: l2i
    //   732: ldc_w 1207640357
    //   735: ixor
    //   736: goto -> 747
    //   739: ldc2_w -1570165994
    //   742: l2i
    //   743: ldc_w -547922328
    //   746: ixor
    //   747: ldc2_w -166063159
    //   750: l2i
    //   751: ldc_w -511477605
    //   754: ixor
    //   755: ixor
    //   756: lookupswitch default -> 784, -1563510224 -> 739, -1375362029 -> 34889
    //   784: goto -> 788
    //   787: athrow
    //   788: invokespecial <init> : ()V
    //   791: goto -> 795
    //   794: athrow
    //   795: getstatic Perryc.0 : I
    //   798: ifle -> 812
    //   801: ldc2_w -1346532002
    //   804: l2i
    //   805: ldc_w -33178012
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w -1147184568
    //   815: l2i
    //   816: ldc_w 289838754
    //   819: ixor
    //   820: ldc2_w -2578023
    //   823: l2i
    //   824: ldc_w 1676179210
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 856, -2125021112 -> 812, -846664279 -> 34835
    //   856: aload_3
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w -2071781613
    //   866: l2i
    //   867: ldc_w 510672706
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 773522843
    //   877: l2i
    //   878: ldc_w -1444284738
    //   881: ixor
    //   882: ldc2_w -1962270754
    //   885: l2i
    //   886: ldc_w 824086661
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 916, 552054538 -> 34967, 1553567734 -> 874
    //   916: goto -> 920
    //   919: athrow
    //   920: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: goto -> 927
    //   926: athrow
    //   927: getstatic Perryc.0 : I
    //   930: ifle -> 944
    //   933: ldc2_w -1669327136
    //   936: l2i
    //   937: ldc_w -1261650449
    //   940: ixor
    //   941: goto -> 952
    //   944: ldc2_w -26973127
    //   947: l2i
    //   948: ldc_w 1035461671
    //   951: ixor
    //   952: ldc2_w 2000104118
    //   955: l2i
    //   956: ldc_w -649927672
    //   959: ixor
    //   960: ixor
    //   961: lookupswitch default -> 988, -2043058767 -> 35455, 866517777 -> 944
    //   988: iload #4
    //   990: getstatic Perryc.c : I
    //   993: iflt -> 1007
    //   996: ldc2_w -1854333225
    //   999: l2i
    //   1000: ldc_w -657822784
    //   1003: ixor
    //   1004: goto -> 1015
    //   1007: ldc2_w -1418449007
    //   1010: l2i
    //   1011: ldc_w 1702360827
    //   1014: ixor
    //   1015: ldc2_w 517402433
    //   1018: l2i
    //   1019: ldc_w 1766226705
    //   1022: ixor
    //   1023: ixor
    //   1024: lookupswitch default -> 35149, -1181528774 -> 1052, 1042538823 -> 1007
    //   1052: goto -> 1056
    //   1055: athrow
    //   1056: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1059: goto -> 1063
    //   1062: athrow
    //   1063: ldc_w ''
    //   1066: getstatic Perryc.1 : I
    //   1069: ifeq -> 1083
    //   1072: ldc2_w -573402695
    //   1075: l2i
    //   1076: ldc_w -558122146
    //   1079: ixor
    //   1080: goto -> 1091
    //   1083: ldc2_w 1381149537
    //   1086: l2i
    //   1087: ldc_w -1291068899
    //   1090: ixor
    //   1091: ldc2_w -307337678
    //   1094: l2i
    //   1095: ldc_w -316106807
    //   1098: ixor
    //   1099: ixor
    //   1100: lookupswitch default -> 1128, 66050844 -> 35503, 830766902 -> 1083
    //   1128: goto -> 1132
    //   1131: athrow
    //   1132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1135: goto -> 1139
    //   1138: athrow
    //   1139: getstatic Perryc.0 : I
    //   1142: ifle -> 1156
    //   1145: ldc2_w 179090911
    //   1148: l2i
    //   1149: ldc_w -99486747
    //   1152: ixor
    //   1153: goto -> 1164
    //   1156: ldc2_w 643757758
    //   1159: l2i
    //   1160: ldc_w -1191800305
    //   1163: ixor
    //   1164: ldc2_w -311071350
    //   1167: l2i
    //   1168: ldc_w -932282501
    //   1171: ixor
    //   1172: ixor
    //   1173: lookupswitch default -> 1200, -710519605 -> 35259, 387035740 -> 1156
    //   1200: goto -> 1204
    //   1203: athrow
    //   1204: invokevirtual toString : ()Ljava/lang/String;
    //   1207: goto -> 1211
    //   1210: athrow
    //   1211: getstatic Perryc.1 : I
    //   1214: ifeq -> 1228
    //   1217: ldc2_w -1104746464
    //   1220: l2i
    //   1221: ldc_w -1392508905
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w -1600986309
    //   1231: l2i
    //   1232: ldc_w 1874640396
    //   1235: ixor
    //   1236: ldc2_w 1404921298
    //   1239: l2i
    //   1240: ldc_w -1281480135
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, -217733156 -> 35337, 657982836 -> 1228
    //   1272: astore_3
    //   1273: goto -> 1338
    //   1276: getstatic Perryc.0 : I
    //   1279: ifle -> 1293
    //   1282: ldc2_w 1687804020
    //   1285: l2i
    //   1286: ldc_w 2076934010
    //   1289: ixor
    //   1290: goto -> 1301
    //   1293: ldc2_w -203017454
    //   1296: l2i
    //   1297: ldc_w 1411812028
    //   1300: ixor
    //   1301: ldc2_w 1007412038
    //   1304: l2i
    //   1305: ldc_w -1018455516
    //   1308: ixor
    //   1309: ixor
    //   1310: lookupswitch default -> 35597, -535634324 -> 1293, 1484832972 -> 1336
    //   1336: astore #4
    //   1338: getstatic Perryc.1 : I
    //   1341: ifeq -> 1355
    //   1344: ldc2_w 1143986480
    //   1347: l2i
    //   1348: ldc_w -634448861
    //   1351: ixor
    //   1352: goto -> 1363
    //   1355: ldc2_w -1690532651
    //   1358: l2i
    //   1359: ldc_w 317599713
    //   1362: ixor
    //   1363: ldc2_w -174226321
    //   1366: l2i
    //   1367: ldc_w -1926557511
    //   1370: ixor
    //   1371: ixor
    //   1372: lookupswitch default -> 34805, -424257083 -> 1355, -245088286 -> 1400
    //   1400: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   1403: ifnull -> 1417
    //   1406: ldc2_w 1448623785
    //   1409: l2i
    //   1410: ldc_w -766264063
    //   1413: ixor
    //   1414: goto -> 1425
    //   1417: ldc2_w 1514244678
    //   1420: l2i
    //   1421: ldc_w -565573151
    //   1424: ixor
    //   1425: ldc2_w -2038301931
    //   1428: l2i
    //   1429: ldc_w -439285926
    //   1432: ixor
    //   1433: ixor
    //   1434: tableswitch default -> 1406, -413433881 -> 1456, -413433880 -> 1522
    //   1456: getstatic Perryc.1 : I
    //   1459: ifeq -> 1473
    //   1462: ldc2_w 124920325
    //   1465: l2i
    //   1466: ldc_w 939749273
    //   1469: ixor
    //   1470: goto -> 1481
    //   1473: ldc2_w -1120926472
    //   1476: l2i
    //   1477: ldc_w 1016832426
    //   1480: ixor
    //   1481: ldc2_w -30742847
    //   1484: l2i
    //   1485: ldc_w 2108548826
    //   1488: ixor
    //   1489: ixor
    //   1490: lookupswitch default -> 1516, -1940687345 -> 1473, -1124708985 -> 35443
    //   1516: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   1519: goto -> 1783
    //   1522: getstatic Perryc.0 : I
    //   1525: ifle -> 1539
    //   1528: ldc2_w -415173954
    //   1531: l2i
    //   1532: ldc_w 1567038171
    //   1535: ixor
    //   1536: goto -> 1547
    //   1539: ldc2_w 988357549
    //   1542: l2i
    //   1543: ldc_w 251174730
    //   1546: ixor
    //   1547: ldc2_w 1639856926
    //   1550: l2i
    //   1551: ldc_w -542927865
    //   1554: ixor
    //   1555: ixor
    //   1556: lookupswitch default -> 1584, 70928252 -> 35545, 528605144 -> 1539
    //   1584: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   1587: instanceof net/minecraft/entity/player/EntityPlayer
    //   1590: ifeq -> 1604
    //   1593: ldc2_w -2054576939
    //   1596: l2i
    //   1597: ldc_w 444432744
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 279211823
    //   1607: l2i
    //   1608: ldc_w -1890563435
    //   1611: ixor
    //   1612: ldc2_w -1481822494
    //   1615: l2i
    //   1616: ldc_w 147899604
    //   1619: ixor
    //   1620: ixor
    //   1621: tableswitch default -> 1593, 814337931 -> 1644, 814337932 -> 1713
    //   1644: getstatic Perryc.0 : I
    //   1647: ifle -> 1661
    //   1650: ldc2_w 1709524648
    //   1653: l2i
    //   1654: ldc_w -270333031
    //   1657: ixor
    //   1658: goto -> 1669
    //   1661: ldc2_w 78280773
    //   1664: l2i
    //   1665: ldc_w -935528087
    //   1668: ixor
    //   1669: ldc2_w -816909368
    //   1672: l2i
    //   1673: ldc_w 465662777
    //   1676: ixor
    //   1677: ixor
    //   1678: lookupswitch default -> 35351, 404292061 -> 1704, 1586089408 -> 1661
    //   1704: getstatic bigname/zprestige/webhack/features/modules/Combat/Killaura.target : Lnet/minecraft/entity/Entity;
    //   1707: checkcast net/minecraft/entity/player/EntityPlayer
    //   1710: goto -> 1783
    //   1713: getstatic Perryc.c : I
    //   1716: iflt -> 1730
    //   1719: ldc2_w 326628006
    //   1722: l2i
    //   1723: ldc_w 615731876
    //   1726: ixor
    //   1727: goto -> 1738
    //   1730: ldc2_w 103545328
    //   1733: l2i
    //   1734: ldc_w 1248019230
    //   1737: ixor
    //   1738: ldc2_w 1646858816
    //   1741: l2i
    //   1742: ldc_w -1193387591
    //   1745: ixor
    //   1746: ixor
    //   1747: lookupswitch default -> 1772, -315364357 -> 34847, -179509442 -> 1730
    //   1772: goto -> 1776
    //   1775: athrow
    //   1776: invokestatic getClosestEnemy : ()Lnet/minecraft/entity/player/EntityPlayer;
    //   1779: goto -> 1783
    //   1782: athrow
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 853677905
    //   1792: l2i
    //   1793: ldc_w 848286835
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -1999260844
    //   1803: l2i
    //   1804: ldc_w 1669500229
    //   1807: ixor
    //   1808: ldc2_w 1235973045
    //   1811: l2i
    //   1812: ldc_w -2074884937
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 35049, -845843424 -> 1800, 649038099 -> 1844
    //   1844: astore #4
    //   1846: getstatic Perryc.1 : I
    //   1849: ifeq -> 1863
    //   1852: ldc2_w 1572032536
    //   1855: l2i
    //   1856: ldc_w -754322871
    //   1859: ixor
    //   1860: goto -> 1871
    //   1863: ldc2_w 1052722349
    //   1866: l2i
    //   1867: ldc_w 935650505
    //   1870: ixor
    //   1871: ldc2_w -583304196
    //   1874: l2i
    //   1875: ldc_w 1166846674
    //   1878: ixor
    //   1879: ixor
    //   1880: lookupswitch default -> 34711, -1848872630 -> 1908, 369980287 -> 1863
    //   1908: aload #4
    //   1910: ifnonnull -> 1924
    //   1913: ldc2_w 646779359
    //   1916: l2i
    //   1917: ldc_w 345329978
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w -1768269831
    //   1927: l2i
    //   1928: ldc_w -1534978275
    //   1931: ixor
    //   1932: ldc2_w 1819505531
    //   1935: l2i
    //   1936: ldc_w -1313103610
    //   1939: ixor
    //   1940: ixor
    //   1941: tableswitch default -> 1913, -271543656 -> 1964, -271543655 -> 1965
    //   1964: return
    //   1965: getstatic Perryc.1 : I
    //   1968: ifeq -> 1982
    //   1971: ldc2_w -1196641222
    //   1974: l2i
    //   1975: ldc_w -126531222
    //   1978: ixor
    //   1979: goto -> 1990
    //   1982: ldc2_w 1834341490
    //   1985: l2i
    //   1986: ldc_w 816255568
    //   1989: ixor
    //   1990: ldc2_w -1744866742
    //   1993: l2i
    //   1994: ldc_w -900455585
    //   1997: ixor
    //   1998: ixor
    //   1999: lookupswitch default -> 2024, -1832357486 -> 1982, 494054469 -> 35209
    //   2024: aload #4
    //   2026: ifnull -> 2040
    //   2029: ldc2_w 969755963
    //   2032: l2i
    //   2033: ldc_w -997139703
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 354605855
    //   2043: l2i
    //   2044: ldc_w -394310356
    //   2047: ixor
    //   2048: ldc2_w 1000101900
    //   2051: l2i
    //   2052: ldc_w -1225443402
    //   2055: ixor
    //   2056: ixor
    //   2057: tableswitch default -> 2029, 1882519944 -> 2080, 1882519945 -> 34690
    //   2080: getstatic Perryc.0 : I
    //   2083: ifle -> 2097
    //   2086: ldc2_w 424277804
    //   2089: l2i
    //   2090: ldc_w 1882670451
    //   2093: ixor
    //   2094: goto -> 2105
    //   2097: ldc2_w -1173434523
    //   2100: l2i
    //   2101: ldc_w -1611742339
    //   2104: ixor
    //   2105: ldc2_w 826638135
    //   2108: l2i
    //   2109: ldc_w 2052828421
    //   2112: ixor
    //   2113: ixor
    //   2114: lookupswitch default -> 35107, 576741485 -> 2097, 1862196778 -> 2140
    //   2140: aload_0
    //   2141: getstatic Perryc.c : I
    //   2144: iflt -> 2158
    //   2147: ldc2_w -1195173955
    //   2150: l2i
    //   2151: ldc_w 1924505219
    //   2154: ixor
    //   2155: goto -> 2166
    //   2158: ldc2_w 1737854420
    //   2161: l2i
    //   2162: ldc_w -226449187
    //   2165: ixor
    //   2166: ldc2_w -827674976
    //   2169: l2i
    //   2170: ldc_w -349943406
    //   2173: ixor
    //   2174: ixor
    //   2175: lookupswitch default -> 2200, -268931572 -> 35171, 2007186790 -> 2158
    //   2200: getfield targetHudBackground : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2203: getstatic Perryc.c : I
    //   2206: iflt -> 2220
    //   2209: ldc2_w -592474795
    //   2212: l2i
    //   2213: ldc_w -636295385
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w 233637056
    //   2223: l2i
    //   2224: ldc_w -821011381
    //   2227: ixor
    //   2228: ldc2_w 289342862
    //   2231: l2i
    //   2232: ldc_w -1843618161
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 35255, -2053181069 -> 2220, 1105118090 -> 2264
    //   2264: goto -> 2268
    //   2267: athrow
    //   2268: invokevirtual getValue : ()Ljava/lang/Object;
    //   2271: goto -> 2275
    //   2274: athrow
    //   2275: checkcast java/lang/Boolean
    //   2278: getstatic Perryc.1 : I
    //   2281: ifeq -> 2295
    //   2284: ldc2_w -2026631106
    //   2287: l2i
    //   2288: ldc_w -539596433
    //   2291: ixor
    //   2292: goto -> 2303
    //   2295: ldc2_w -276585452
    //   2298: l2i
    //   2299: ldc_w 1349833956
    //   2302: ixor
    //   2303: ldc2_w 1162102340
    //   2306: l2i
    //   2307: ldc_w 1301414973
    //   2310: ixor
    //   2311: ixor
    //   2312: lookupswitch default -> 2340, -246481849 -> 2295, 1345600296 -> 35055
    //   2340: goto -> 2344
    //   2343: athrow
    //   2344: invokevirtual booleanValue : ()Z
    //   2347: goto -> 2351
    //   2350: athrow
    //   2351: ifeq -> 2365
    //   2354: ldc2_w -497716834
    //   2357: l2i
    //   2358: ldc_w 735714770
    //   2361: ixor
    //   2362: goto -> 2373
    //   2365: ldc2_w 298364597
    //   2368: l2i
    //   2369: ldc_w -666385690
    //   2372: ixor
    //   2373: ldc2_w -1031561231
    //   2376: l2i
    //   2377: ldc_w -2090704750
    //   2380: ixor
    //   2381: ixor
    //   2382: tableswitch default -> 2354, -2006019281 -> 2404, -2006019280 -> 8247
    //   2404: getstatic Perryc.1 : I
    //   2407: ifeq -> 2421
    //   2410: ldc2_w -1372605016
    //   2413: l2i
    //   2414: ldc_w -227095547
    //   2417: ixor
    //   2418: goto -> 2429
    //   2421: ldc2_w -580296743
    //   2424: l2i
    //   2425: ldc_w -1498539213
    //   2428: ixor
    //   2429: ldc2_w 2101161349
    //   2432: l2i
    //   2433: ldc_w -1018095392
    //   2436: ixor
    //   2437: ixor
    //   2438: lookupswitch default -> 35391, -978620017 -> 2464, -499823416 -> 2421
    //   2464: aload #4
    //   2466: getstatic Perryc.0 : I
    //   2469: ifle -> 2483
    //   2472: ldc2_w 1538707768
    //   2475: l2i
    //   2476: ldc_w 821807373
    //   2479: ixor
    //   2480: goto -> 2491
    //   2483: ldc2_w -410689093
    //   2486: l2i
    //   2487: ldc_w 791577872
    //   2490: ixor
    //   2491: ldc2_w -1540059718
    //   2494: l2i
    //   2495: ldc_w -1855861548
    //   2498: ixor
    //   2499: ixor
    //   2500: lookupswitch default -> 34945, -33643067 -> 2528, 1578654043 -> 2483
    //   2528: goto -> 2532
    //   2531: athrow
    //   2532: invokevirtual func_110143_aJ : ()F
    //   2535: goto -> 2539
    //   2538: athrow
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w -324750604
    //   2548: l2i
    //   2549: ldc_w -1796745014
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w 577862001
    //   2559: l2i
    //   2560: ldc_w -792402419
    //   2563: ixor
    //   2564: ldc2_w -460570726
    //   2567: l2i
    //   2568: ldc_w -1066720574
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 35067, -699235804 -> 2600, 1554282342 -> 2556
    //   2600: aload #4
    //   2602: getstatic Perryc.0 : I
    //   2605: ifle -> 2619
    //   2608: ldc2_w 1631402472
    //   2611: l2i
    //   2612: ldc_w 417328333
    //   2615: ixor
    //   2616: goto -> 2627
    //   2619: ldc2_w -1356676617
    //   2622: l2i
    //   2623: ldc_w -1235333606
    //   2626: ixor
    //   2627: ldc2_w -1555642973
    //   2630: l2i
    //   2631: ldc_w -1912020221
    //   2634: ixor
    //   2635: ixor
    //   2636: lookupswitch default -> 34883, 875735373 -> 2664, 1420620677 -> 2619
    //   2664: goto -> 2668
    //   2667: athrow
    //   2668: invokevirtual func_110139_bj : ()F
    //   2671: goto -> 2675
    //   2674: athrow
    //   2675: fadd
    //   2676: getstatic Perryc.1 : I
    //   2679: ifeq -> 2693
    //   2682: ldc2_w -663835251
    //   2685: l2i
    //   2686: ldc_w 1819226511
    //   2689: ixor
    //   2690: goto -> 2701
    //   2693: ldc2_w 255059480
    //   2696: l2i
    //   2697: ldc_w 1488457111
    //   2700: ixor
    //   2701: ldc2_w -715314552
    //   2704: l2i
    //   2705: ldc_w -986945075
    //   2708: ixor
    //   2709: ixor
    //   2710: lookupswitch default -> 2736, -1536106681 -> 35347, 1387876706 -> 2693
    //   2736: fstore #5
    //   2738: getstatic Perryc.c : I
    //   2741: iflt -> 2755
    //   2744: ldc2_w 873776635
    //   2747: l2i
    //   2748: ldc_w -864583648
    //   2751: ixor
    //   2752: goto -> 2763
    //   2755: ldc2_w -1277389648
    //   2758: l2i
    //   2759: ldc_w 234518558
    //   2762: ixor
    //   2763: ldc2_w 55205160
    //   2766: l2i
    //   2767: ldc_w -1716958033
    //   2770: ixor
    //   2771: ixor
    //   2772: lookupswitch default -> 34705, 616955177 -> 2800, 1652577372 -> 2755
    //   2800: fload #5
    //   2802: ldc_w 0.2973213
    //   2805: invokestatic floatToIntBits : (F)I
    //   2808: ldc_w 2090613375
    //   2811: ixor
    //   2812: invokestatic intBitsToFloat : (I)F
    //   2815: fcmpl
    //   2816: iflt -> 2830
    //   2819: ldc2_w 439784263
    //   2822: l2i
    //   2823: ldc_w 1206197681
    //   2826: ixor
    //   2827: goto -> 2838
    //   2830: ldc2_w -11642565
    //   2833: l2i
    //   2834: ldc_w -1566713908
    //   2837: ixor
    //   2838: ldc2_w 994605659
    //   2841: l2i
    //   2842: ldc_w 715311227
    //   2845: ixor
    //   2846: ixor
    //   2847: tableswitch default -> 2819, 1278819542 -> 2868, 1278819543 -> 2974
    //   2868: ldc2_w -1768418850
    //   2871: l2i
    //   2872: ldc_w -1768418850
    //   2875: ixor
    //   2876: ldc2_w 1639291874
    //   2879: l2i
    //   2880: ldc_w 1639291677
    //   2883: ixor
    //   2884: ldc2_w -119914066
    //   2887: l2i
    //   2888: ldc_w -119914066
    //   2891: ixor
    //   2892: ldc2_w 848801680
    //   2895: l2i
    //   2896: ldc_w 848801647
    //   2899: ixor
    //   2900: getstatic Perryc.0 : I
    //   2903: ifle -> 2917
    //   2906: ldc2_w -1002444523
    //   2909: l2i
    //   2910: ldc_w -517109426
    //   2913: ixor
    //   2914: goto -> 2925
    //   2917: ldc2_w 1812189443
    //   2920: l2i
    //   2921: ldc_w 540655316
    //   2924: ixor
    //   2925: ldc2_w 1247186290
    //   2928: l2i
    //   2929: ldc_w 1220411070
    //   2932: ixor
    //   2933: ixor
    //   2934: lookupswitch default -> 35427, 670634903 -> 2917, 1322327067 -> 2960
    //   2960: goto -> 2964
    //   2963: athrow
    //   2964: invokestatic toRGBA : (IIII)I
    //   2967: goto -> 2971
    //   2970: athrow
    //   2971: goto -> 4495
    //   2974: getstatic Perryc.1 : I
    //   2977: ifeq -> 2991
    //   2980: ldc2_w 865921876
    //   2983: l2i
    //   2984: ldc_w -1018630980
    //   2987: ixor
    //   2988: goto -> 2999
    //   2991: ldc2_w 314538933
    //   2994: l2i
    //   2995: ldc_w 1676270367
    //   2998: ixor
    //   2999: ldc2_w -23393495
    //   3002: l2i
    //   3003: ldc_w -720241903
    //   3006: ixor
    //   3007: ixor
    //   3008: lookupswitch default -> 3036, -637434238 -> 2991, -614533168 -> 34861
    //   3036: fload #5
    //   3038: ldc_w 0.011268741
    //   3041: invokestatic floatToIntBits : (F)I
    //   3044: ldc_w 2110300295
    //   3047: ixor
    //   3048: invokestatic intBitsToFloat : (I)F
    //   3051: fcmpl
    //   3052: iflt -> 3066
    //   3055: ldc2_w 1640404888
    //   3058: l2i
    //   3059: ldc_w 117326991
    //   3062: ixor
    //   3063: goto -> 3074
    //   3066: ldc2_w -400520773
    //   3069: l2i
    //   3070: ldc_w -1894229329
    //   3073: ixor
    //   3074: ldc2_w -417311715
    //   3077: l2i
    //   3078: ldc_w -149103997
    //   3081: ixor
    //   3082: ixor
    //   3083: tableswitch default -> 3055, 1996774793 -> 3104, 1996774794 -> 3210
    //   3104: ldc2_w 583433754
    //   3107: l2i
    //   3108: ldc_w 583433868
    //   3111: ixor
    //   3112: ldc2_w 720532109
    //   3115: l2i
    //   3116: ldc_w 720532082
    //   3119: ixor
    //   3120: ldc2_w 1187505858
    //   3123: l2i
    //   3124: ldc_w 1187505858
    //   3127: ixor
    //   3128: ldc2_w -776408416
    //   3131: l2i
    //   3132: ldc_w -776408481
    //   3135: ixor
    //   3136: getstatic Perryc.c : I
    //   3139: iflt -> 3153
    //   3142: ldc2_w 570875377
    //   3145: l2i
    //   3146: ldc_w 122307944
    //   3149: ixor
    //   3150: goto -> 3161
    //   3153: ldc2_w 377095825
    //   3156: l2i
    //   3157: ldc_w 796368311
    //   3160: ixor
    //   3161: ldc2_w 1127950008
    //   3164: l2i
    //   3165: ldc_w 1924378882
    //   3168: ixor
    //   3169: ixor
    //   3170: lookupswitch default -> 3196, 348393251 -> 35537, 1152148949 -> 3153
    //   3196: goto -> 3200
    //   3199: athrow
    //   3200: invokestatic toRGBA : (IIII)I
    //   3203: goto -> 3207
    //   3206: athrow
    //   3207: goto -> 4495
    //   3210: getstatic Perryc.1 : I
    //   3213: ifeq -> 3227
    //   3216: ldc2_w -158602814
    //   3219: l2i
    //   3220: ldc_w -186913941
    //   3223: ixor
    //   3224: goto -> 3235
    //   3227: ldc2_w 1787616554
    //   3230: l2i
    //   3231: ldc_w 1870773057
    //   3234: ixor
    //   3235: ldc2_w 1155812466
    //   3238: l2i
    //   3239: ldc_w -545366391
    //   3242: ixor
    //   3243: ixor
    //   3244: lookupswitch default -> 3272, -1714810798 -> 34827, 1644172555 -> 3227
    //   3272: fload #5
    //   3274: ldc_w 0.7956453
    //   3277: invokestatic floatToIntBits : (F)I
    //   3280: ldc_w 2122559337
    //   3283: ixor
    //   3284: invokestatic intBitsToFloat : (I)F
    //   3287: fcmpl
    //   3288: ifle -> 3302
    //   3291: ldc2_w 1235658010
    //   3294: l2i
    //   3295: ldc_w -834519781
    //   3298: ixor
    //   3299: goto -> 3310
    //   3302: ldc2_w -1656488604
    //   3305: l2i
    //   3306: ldc_w 447178106
    //   3309: ixor
    //   3310: ldc2_w 317887810
    //   3313: l2i
    //   3314: ldc_w -2034028948
    //   3317: ixor
    //   3318: ixor
    //   3319: tableswitch default -> 3291, 332735279 -> 3340, 332735280 -> 3446
    //   3340: ldc2_w 676936016
    //   3343: l2i
    //   3344: ldc_w 676935963
    //   3347: ixor
    //   3348: ldc2_w 335665379
    //   3351: l2i
    //   3352: ldc_w 335665180
    //   3355: ixor
    //   3356: ldc2_w 317463265
    //   3359: l2i
    //   3360: ldc_w 317463265
    //   3363: ixor
    //   3364: ldc2_w 537768205
    //   3367: l2i
    //   3368: ldc_w 537768434
    //   3371: ixor
    //   3372: getstatic Perryc.1 : I
    //   3375: ifeq -> 3389
    //   3378: ldc2_w -406379930
    //   3381: l2i
    //   3382: ldc_w 1285569010
    //   3385: ixor
    //   3386: goto -> 3397
    //   3389: ldc2_w 2089695058
    //   3392: l2i
    //   3393: ldc_w -1413940496
    //   3396: ixor
    //   3397: ldc2_w -1430070914
    //   3400: l2i
    //   3401: ldc_w 388947061
    //   3404: ixor
    //   3405: ixor
    //   3406: lookupswitch default -> 3432, 378216095 -> 34747, 1939335614 -> 3389
    //   3432: goto -> 3436
    //   3435: athrow
    //   3436: invokestatic toRGBA : (IIII)I
    //   3439: goto -> 3443
    //   3442: athrow
    //   3443: goto -> 4495
    //   3446: getstatic Perryc.c : I
    //   3449: iflt -> 3463
    //   3452: ldc2_w -2092846382
    //   3455: l2i
    //   3456: ldc_w -645660529
    //   3459: ixor
    //   3460: goto -> 3471
    //   3463: ldc2_w 192413978
    //   3466: l2i
    //   3467: ldc_w 529436925
    //   3470: ixor
    //   3471: ldc2_w -468496156
    //   3474: l2i
    //   3475: ldc_w 2061317566
    //   3478: ixor
    //   3479: ixor
    //   3480: lookupswitch default -> 35187, -1975978819 -> 3508, -1005857017 -> 3463
    //   3508: fload #5
    //   3510: ldc_w 0.024345426
    //   3513: invokestatic floatToIntBits : (F)I
    //   3516: ldc_w 2103930895
    //   3519: ixor
    //   3520: invokestatic intBitsToFloat : (I)F
    //   3523: fcmpl
    //   3524: ifle -> 3538
    //   3527: ldc2_w -1077878889
    //   3530: l2i
    //   3531: ldc_w -302018264
    //   3534: ixor
    //   3535: goto -> 3546
    //   3538: ldc2_w -1354157319
    //   3541: l2i
    //   3542: ldc_w -42566567
    //   3545: ixor
    //   3546: ldc2_w 1620043849
    //   3549: l2i
    //   3550: ldc_w -600531463
    //   3553: ixor
    //   3554: ixor
    //   3555: tableswitch default -> 3527, -293324017 -> 3576, -293324016 -> 3682
    //   3576: ldc2_w -966489489
    //   3579: l2i
    //   3580: ldc_w -966489456
    //   3583: ixor
    //   3584: ldc2_w -844330123
    //   3587: l2i
    //   3588: ldc_w -844330102
    //   3591: ixor
    //   3592: ldc2_w -1882175128
    //   3595: l2i
    //   3596: ldc_w -1882175128
    //   3599: ixor
    //   3600: ldc2_w -868845232
    //   3603: l2i
    //   3604: ldc_w -868845137
    //   3607: ixor
    //   3608: getstatic Perryc.0 : I
    //   3611: ifle -> 3625
    //   3614: ldc2_w -2041456720
    //   3617: l2i
    //   3618: ldc_w -355502940
    //   3621: ixor
    //   3622: goto -> 3633
    //   3625: ldc2_w -178586234
    //   3628: l2i
    //   3629: ldc_w 1353840254
    //   3632: ixor
    //   3633: ldc2_w 1920308330
    //   3636: l2i
    //   3637: ldc_w -1604253268
    //   3640: ixor
    //   3641: ixor
    //   3642: lookupswitch default -> 34965, -1098236206 -> 3625, 2013238846 -> 3668
    //   3668: goto -> 3672
    //   3671: athrow
    //   3672: invokestatic toRGBA : (IIII)I
    //   3675: goto -> 3679
    //   3678: athrow
    //   3679: goto -> 4495
    //   3682: getstatic Perryc.0 : I
    //   3685: ifle -> 3699
    //   3688: ldc2_w 674110161
    //   3691: l2i
    //   3692: ldc_w -904293675
    //   3695: ixor
    //   3696: goto -> 3707
    //   3699: ldc2_w -1964468613
    //   3702: l2i
    //   3703: ldc_w -1659101384
    //   3706: ixor
    //   3707: ldc2_w 1492270102
    //   3710: l2i
    //   3711: ldc_w 2021925711
    //   3714: ixor
    //   3715: ixor
    //   3716: lookupswitch default -> 3744, -1035888803 -> 35041, -590059679 -> 3699
    //   3744: fload #5
    //   3746: ldc_w 1.2561039
    //   3749: invokestatic floatToIntBits : (F)I
    //   3752: ldc_w 2127611907
    //   3755: ixor
    //   3756: invokestatic intBitsToFloat : (I)F
    //   3759: fcmpl
    //   3760: ifle -> 3774
    //   3763: ldc2_w -384936581
    //   3766: l2i
    //   3767: ldc_w -85612625
    //   3770: ixor
    //   3771: goto -> 3782
    //   3774: ldc2_w -1013635582
    //   3777: l2i
    //   3778: ldc_w -796994343
    //   3781: ixor
    //   3782: ldc2_w 23374156
    //   3785: l2i
    //   3786: ldc_w 310249103
    //   3789: ixor
    //   3790: ixor
    //   3791: tableswitch default -> 3763, 15818007 -> 3812, 15818008 -> 3918
    //   3812: ldc2_w -789854931
    //   3815: l2i
    //   3816: ldc_w -789854766
    //   3819: ixor
    //   3820: ldc2_w -1796347361
    //   3823: l2i
    //   3824: ldc_w -1796347177
    //   3827: ixor
    //   3828: ldc2_w 58635381
    //   3831: l2i
    //   3832: ldc_w 58635381
    //   3835: ixor
    //   3836: ldc2_w 2143887016
    //   3839: l2i
    //   3840: ldc_w 2143886935
    //   3843: ixor
    //   3844: getstatic Perryc.c : I
    //   3847: iflt -> 3861
    //   3850: ldc2_w 401180371
    //   3853: l2i
    //   3854: ldc_w -1007727343
    //   3857: ixor
    //   3858: goto -> 3869
    //   3861: ldc2_w -2092247505
    //   3864: l2i
    //   3865: ldc_w -268078242
    //   3868: ixor
    //   3869: ldc2_w -802998045
    //   3872: l2i
    //   3873: ldc_w -235489252
    //   3876: ixor
    //   3877: ixor
    //   3878: lookupswitch default -> 3904, -1743615582 -> 3861, -170702019 -> 35293
    //   3904: goto -> 3908
    //   3907: athrow
    //   3908: invokestatic toRGBA : (IIII)I
    //   3911: goto -> 3915
    //   3914: athrow
    //   3915: goto -> 4495
    //   3918: getstatic Perryc.1 : I
    //   3921: ifeq -> 3935
    //   3924: ldc2_w -446423434
    //   3927: l2i
    //   3928: ldc_w -1594470030
    //   3931: ixor
    //   3932: goto -> 3943
    //   3935: ldc2_w -593728174
    //   3938: l2i
    //   3939: ldc_w -2099726416
    //   3942: ixor
    //   3943: ldc2_w 738225439
    //   3946: l2i
    //   3947: ldc_w 2091629969
    //   3950: ixor
    //   3951: ixor
    //   3952: lookupswitch default -> 3980, -820682372 -> 3935, 356097930 -> 35403
    //   3980: fload #5
    //   3982: ldc_w 0.19179843
    //   3985: invokestatic floatToIntBits : (F)I
    //   3988: ldc_w 2137286351
    //   3991: ixor
    //   3992: invokestatic intBitsToFloat : (I)F
    //   3995: fcmpl
    //   3996: ifle -> 4010
    //   3999: ldc2_w 1997339453
    //   4002: l2i
    //   4003: ldc_w 322865078
    //   4006: ixor
    //   4007: goto -> 4018
    //   4010: ldc2_w 533937286
    //   4013: l2i
    //   4014: ldc_w 2078359564
    //   4017: ixor
    //   4018: ldc2_w 1047282342
    //   4021: l2i
    //   4022: ldc_w 529938605
    //   4025: ixor
    //   4026: ixor
    //   4027: tableswitch default -> 3999, 1170736768 -> 4048, 1170736769 -> 4154
    //   4048: ldc2_w -1156755265
    //   4051: l2i
    //   4052: ldc_w -1156755392
    //   4055: ixor
    //   4056: ldc2_w -610147795
    //   4059: l2i
    //   4060: ldc_w -610147653
    //   4063: ixor
    //   4064: ldc2_w -396003401
    //   4067: l2i
    //   4068: ldc_w -396003401
    //   4071: ixor
    //   4072: ldc2_w 309611294
    //   4075: l2i
    //   4076: ldc_w 309611489
    //   4079: ixor
    //   4080: getstatic Perryc.0 : I
    //   4083: ifle -> 4097
    //   4086: ldc2_w 1234938781
    //   4089: l2i
    //   4090: ldc_w -247723448
    //   4093: ixor
    //   4094: goto -> 4105
    //   4097: ldc2_w -1815529684
    //   4100: l2i
    //   4101: ldc_w -213808035
    //   4104: ixor
    //   4105: ldc2_w -1700175545
    //   4108: l2i
    //   4109: ldc_w -921362382
    //   4112: ixor
    //   4113: ixor
    //   4114: lookupswitch default -> 35267, -350494560 -> 4097, 859109892 -> 4140
    //   4140: goto -> 4144
    //   4143: athrow
    //   4144: invokestatic toRGBA : (IIII)I
    //   4147: goto -> 4151
    //   4150: athrow
    //   4151: goto -> 4495
    //   4154: getstatic Perryc.1 : I
    //   4157: ifeq -> 4171
    //   4160: ldc2_w -921157934
    //   4163: l2i
    //   4164: ldc_w 1768043584
    //   4167: ixor
    //   4168: goto -> 4179
    //   4171: ldc2_w 2116385934
    //   4174: l2i
    //   4175: ldc_w -1071634292
    //   4178: ixor
    //   4179: ldc2_w 403121496
    //   4182: l2i
    //   4183: ldc_w -373877666
    //   4186: ixor
    //   4187: ixor
    //   4188: lookupswitch default -> 4216, -1674169240 -> 4171, 1372208020 -> 35181
    //   4216: fload #5
    //   4218: ldc_w 0.46787927
    //   4221: invokestatic floatToIntBits : (F)I
    //   4224: ldc_w 2119142879
    //   4227: ixor
    //   4228: invokestatic intBitsToFloat : (I)F
    //   4231: fcmpl
    //   4232: ifle -> 4246
    //   4235: ldc2_w -1888456235
    //   4238: l2i
    //   4239: ldc_w -1997098711
    //   4242: ixor
    //   4243: goto -> 4254
    //   4246: ldc2_w 2063890955
    //   4249: l2i
    //   4250: ldc_w 2088942320
    //   4253: ixor
    //   4254: ldc2_w 1143935132
    //   4257: l2i
    //   4258: ldc_w -1553086989
    //   4261: ixor
    //   4262: ixor
    //   4263: tableswitch default -> 4235, -524020333 -> 4284, -524020332 -> 4390
    //   4284: ldc2_w -1734266016
    //   4287: l2i
    //   4288: ldc_w -1734265953
    //   4291: ixor
    //   4292: ldc2_w -444464664
    //   4295: l2i
    //   4296: ldc_w -444464678
    //   4299: ixor
    //   4300: ldc2_w 1715375398
    //   4303: l2i
    //   4304: ldc_w 1715375398
    //   4307: ixor
    //   4308: ldc2_w -1095028659
    //   4311: l2i
    //   4312: ldc_w -1095028558
    //   4315: ixor
    //   4316: getstatic Perryc.c : I
    //   4319: iflt -> 4333
    //   4322: ldc2_w -1243409319
    //   4325: l2i
    //   4326: ldc_w 1397765885
    //   4329: ixor
    //   4330: goto -> 4341
    //   4333: ldc2_w -724513287
    //   4336: l2i
    //   4337: ldc_w 1557719883
    //   4340: ixor
    //   4341: ldc2_w 1608605022
    //   4344: l2i
    //   4345: ldc_w 696275473
    //   4348: ixor
    //   4349: ixor
    //   4350: lookupswitch default -> 4376, -1865273877 -> 35603, 233293597 -> 4333
    //   4376: goto -> 4380
    //   4379: athrow
    //   4380: invokestatic toRGBA : (IIII)I
    //   4383: goto -> 4387
    //   4386: athrow
    //   4387: goto -> 4495
    //   4390: ldc2_w 1538697367
    //   4393: l2i
    //   4394: ldc_w 1538697320
    //   4397: ixor
    //   4398: ldc2_w 304314543
    //   4401: l2i
    //   4402: ldc_w 304314543
    //   4405: ixor
    //   4406: ldc2_w -319159370
    //   4409: l2i
    //   4410: ldc_w -319159370
    //   4413: ixor
    //   4414: ldc2_w 1009386189
    //   4417: l2i
    //   4418: ldc_w 1009386034
    //   4421: ixor
    //   4422: getstatic Perryc.1 : I
    //   4425: ifeq -> 4439
    //   4428: ldc2_w -1481719714
    //   4431: l2i
    //   4432: ldc_w -1690434145
    //   4435: ixor
    //   4436: goto -> 4447
    //   4439: ldc2_w -724602725
    //   4442: l2i
    //   4443: ldc_w 1354635626
    //   4446: ixor
    //   4447: ldc2_w 262850268
    //   4450: l2i
    //   4451: ldc_w -4576850
    //   4454: ixor
    //   4455: ixor
    //   4456: lookupswitch default -> 4484, -1356825919 -> 4439, -864015693 -> 34975
    //   4484: goto -> 4488
    //   4487: athrow
    //   4488: invokestatic toRGBA : (IIII)I
    //   4491: goto -> 4495
    //   4494: athrow
    //   4495: getstatic Perryc.c : I
    //   4498: iflt -> 4512
    //   4501: ldc2_w -1017657546
    //   4504: l2i
    //   4505: ldc_w -1390622826
    //   4508: ixor
    //   4509: goto -> 4520
    //   4512: ldc2_w 199417565
    //   4515: l2i
    //   4516: ldc_w -915075134
    //   4519: ixor
    //   4520: ldc2_w -1852942158
    //   4523: l2i
    //   4524: ldc_w 1186796760
    //   4527: ixor
    //   4528: ixor
    //   4529: lookupswitch default -> 35281, -1183298358 -> 4512, 363109749 -> 4556
    //   4556: istore #6
    //   4558: getstatic Perryc.0 : I
    //   4561: ifle -> 4575
    //   4564: ldc2_w 12134492
    //   4567: l2i
    //   4568: ldc_w -1783744768
    //   4571: ixor
    //   4572: goto -> 4583
    //   4575: ldc2_w -169839998
    //   4578: l2i
    //   4579: ldc_w -767809059
    //   4582: ixor
    //   4583: ldc2_w 1815858408
    //   4586: l2i
    //   4587: ldc_w -1211940827
    //   4590: ixor
    //   4591: ixor
    //   4592: lookupswitch default -> 35203, -64694382 -> 4620, 1324323729 -> 4575
    //   4620: aload_0
    //   4621: getstatic Perryc.1 : I
    //   4624: ifeq -> 4638
    //   4627: ldc2_w 1483182748
    //   4630: l2i
    //   4631: ldc_w 1076186938
    //   4634: ixor
    //   4635: goto -> 4646
    //   4638: ldc2_w -1938138974
    //   4641: l2i
    //   4642: ldc_w -166582120
    //   4645: ixor
    //   4646: ldc2_w -778236437
    //   4649: l2i
    //   4650: ldc_w 1503005037
    //   4653: ixor
    //   4654: ixor
    //   4655: lookupswitch default -> 35117, -1874208480 -> 4638, -228363076 -> 4680
    //   4680: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4683: getstatic Perryc.c : I
    //   4686: iflt -> 4700
    //   4689: ldc2_w 37036265
    //   4692: l2i
    //   4693: ldc_w 1094457767
    //   4696: ixor
    //   4697: goto -> 4708
    //   4700: ldc2_w 601502054
    //   4703: l2i
    //   4704: ldc_w -1110274397
    //   4707: ixor
    //   4708: ldc2_w 720076715
    //   4711: l2i
    //   4712: ldc_w -636201567
    //   4715: ixor
    //   4716: ixor
    //   4717: lookupswitch default -> 4744, -1275718844 -> 35599, 1486636734 -> 4700
    //   4744: goto -> 4748
    //   4747: athrow
    //   4748: invokevirtual getValue : ()Ljava/lang/Object;
    //   4751: goto -> 4755
    //   4754: athrow
    //   4755: checkcast java/lang/Integer
    //   4758: getstatic Perryc.1 : I
    //   4761: ifeq -> 4775
    //   4764: ldc2_w 715284062
    //   4767: l2i
    //   4768: ldc_w 649504078
    //   4771: ixor
    //   4772: goto -> 4783
    //   4775: ldc2_w -1715131208
    //   4778: l2i
    //   4779: ldc_w -1172588093
    //   4782: ixor
    //   4783: ldc2_w 1159966303
    //   4786: l2i
    //   4787: ldc_w -1125205704
    //   4790: ixor
    //   4791: ixor
    //   4792: lookupswitch default -> 4820, -578933150 -> 4775, -170267529 -> 35561
    //   4820: goto -> 4824
    //   4823: athrow
    //   4824: invokevirtual intValue : ()I
    //   4827: goto -> 4831
    //   4830: athrow
    //   4831: getstatic Perryc.0 : I
    //   4834: ifle -> 4848
    //   4837: ldc2_w -1199532907
    //   4840: l2i
    //   4841: ldc_w 323127146
    //   4844: ixor
    //   4845: goto -> 4856
    //   4848: ldc2_w -1738588592
    //   4851: l2i
    //   4852: ldc_w -537782199
    //   4855: ixor
    //   4856: ldc2_w 1232851666
    //   4859: l2i
    //   4860: ldc_w 912535333
    //   4863: ixor
    //   4864: ixor
    //   4865: lookupswitch default -> 4892, -1668948193 -> 4848, -723653112 -> 35251
    //   4892: aload_0
    //   4893: getstatic Perryc.0 : I
    //   4896: ifle -> 4910
    //   4899: ldc2_w -1909586005
    //   4902: l2i
    //   4903: ldc_w -1618568587
    //   4906: ixor
    //   4907: goto -> 4918
    //   4910: ldc2_w 233441391
    //   4913: l2i
    //   4914: ldc_w -1445866139
    //   4917: ixor
    //   4918: ldc2_w -486847520
    //   4921: l2i
    //   4922: ldc_w -537208552
    //   4925: ixor
    //   4926: ixor
    //   4927: lookupswitch default -> 35323, -1724231694 -> 4952, 749276966 -> 4910
    //   4952: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4955: getstatic Perryc.1 : I
    //   4958: ifeq -> 4972
    //   4961: ldc2_w 430793464
    //   4964: l2i
    //   4965: ldc_w -1542893671
    //   4968: ixor
    //   4969: goto -> 4980
    //   4972: ldc2_w 2004256420
    //   4975: l2i
    //   4976: ldc_w -1444843972
    //   4979: ixor
    //   4980: ldc2_w -453085420
    //   4983: l2i
    //   4984: ldc_w -1616511484
    //   4987: ixor
    //   4988: ixor
    //   4989: lookupswitch default -> 35371, -1513332344 -> 5016, -956324751 -> 4972
    //   5016: goto -> 5020
    //   5019: athrow
    //   5020: invokevirtual getValue : ()Ljava/lang/Object;
    //   5023: goto -> 5027
    //   5026: athrow
    //   5027: checkcast java/lang/Integer
    //   5030: getstatic Perryc.c : I
    //   5033: iflt -> 5047
    //   5036: ldc2_w -1391473586
    //   5039: l2i
    //   5040: ldc_w -428473465
    //   5043: ixor
    //   5044: goto -> 5055
    //   5047: ldc2_w -791255797
    //   5050: l2i
    //   5051: ldc_w -679489409
    //   5054: ixor
    //   5055: ldc2_w -1294341415
    //   5058: l2i
    //   5059: ldc_w 2036214549
    //   5062: ixor
    //   5063: ixor
    //   5064: lookupswitch default -> 5092, -2130833915 -> 35237, 125600394 -> 5047
    //   5092: goto -> 5096
    //   5095: athrow
    //   5096: invokevirtual intValue : ()I
    //   5099: goto -> 5103
    //   5102: athrow
    //   5103: ldc2_w 1266615146
    //   5106: l2i
    //   5107: ldc_w 1266615232
    //   5110: ixor
    //   5111: ldc2_w -1316621619
    //   5114: l2i
    //   5115: ldc_w -1316621673
    //   5118: ixor
    //   5119: getstatic Perryc.0 : I
    //   5122: ifle -> 5136
    //   5125: ldc2_w -51158239
    //   5128: l2i
    //   5129: ldc_w -217522498
    //   5132: ixor
    //   5133: goto -> 5144
    //   5136: ldc2_w -814373764
    //   5139: l2i
    //   5140: ldc_w 1129382860
    //   5143: ixor
    //   5144: ldc2_w -1256113365
    //   5147: l2i
    //   5148: ldc_w -1081790345
    //   5151: ixor
    //   5152: ixor
    //   5153: lookupswitch default -> 5180, 90158787 -> 35011, 198884728 -> 5136
    //   5180: aload_0
    //   5181: getstatic Perryc.1 : I
    //   5184: ifeq -> 5198
    //   5187: ldc2_w -2078304313
    //   5190: l2i
    //   5191: ldc_w -846862047
    //   5194: ixor
    //   5195: goto -> 5206
    //   5198: ldc2_w -1729921961
    //   5201: l2i
    //   5202: ldc_w -628783411
    //   5205: ixor
    //   5206: ldc2_w -1489282243
    //   5209: l2i
    //   5210: ldc_w 1314758569
    //   5213: ixor
    //   5214: ixor
    //   5215: lookupswitch default -> 35393, -1594049934 -> 5198, -1426047474 -> 5240
    //   5240: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5243: getstatic Perryc.c : I
    //   5246: iflt -> 5260
    //   5249: ldc2_w -719951846
    //   5252: l2i
    //   5253: ldc_w 96628132
    //   5256: ixor
    //   5257: goto -> 5268
    //   5260: ldc2_w 1114839991
    //   5263: l2i
    //   5264: ldc_w -669600463
    //   5267: ixor
    //   5268: ldc2_w 1484826076
    //   5271: l2i
    //   5272: ldc_w 342729638
    //   5275: ixor
    //   5276: ixor
    //   5277: lookupswitch default -> 5304, -1673985084 -> 35467, 711859049 -> 5260
    //   5304: goto -> 5308
    //   5307: athrow
    //   5308: invokevirtual getValue : ()Ljava/lang/Object;
    //   5311: goto -> 5315
    //   5314: athrow
    //   5315: checkcast java/lang/Integer
    //   5318: getstatic Perryc.0 : I
    //   5321: ifle -> 5335
    //   5324: ldc2_w 1065282985
    //   5327: l2i
    //   5328: ldc_w -1372876223
    //   5331: ixor
    //   5332: goto -> 5343
    //   5335: ldc2_w 774741852
    //   5338: l2i
    //   5339: ldc_w 952315476
    //   5342: ixor
    //   5343: ldc2_w -1767428380
    //   5346: l2i
    //   5347: ldc_w 1959268959
    //   5350: ixor
    //   5351: ixor
    //   5352: lookupswitch default -> 5380, 89893972 -> 5335, 1933198163 -> 35061
    //   5380: goto -> 5384
    //   5383: athrow
    //   5384: invokevirtual intValue : ()I
    //   5387: goto -> 5391
    //   5390: athrow
    //   5391: getstatic Perryc.c : I
    //   5394: iflt -> 5408
    //   5397: ldc2_w 279846157
    //   5400: l2i
    //   5401: ldc_w 2103609964
    //   5404: ixor
    //   5405: goto -> 5416
    //   5408: ldc2_w -749743216
    //   5411: l2i
    //   5412: ldc_w -977138953
    //   5415: ixor
    //   5416: ldc2_w -859024647
    //   5419: l2i
    //   5420: ldc_w 717678000
    //   5423: ixor
    //   5424: ixor
    //   5425: lookupswitch default -> 5452, -1949949912 -> 34817, 427108247 -> 5408
    //   5452: aload_0
    //   5453: getstatic Perryc.1 : I
    //   5456: ifeq -> 5470
    //   5459: ldc2_w 818242736
    //   5462: l2i
    //   5463: ldc_w 1031878641
    //   5466: ixor
    //   5467: goto -> 5478
    //   5470: ldc2_w -2119089341
    //   5473: l2i
    //   5474: ldc_w 375571315
    //   5477: ixor
    //   5478: ldc2_w -637377906
    //   5481: l2i
    //   5482: ldc_w -200038032
    //   5485: ixor
    //   5486: ixor
    //   5487: lookupswitch default -> 5512, 592812223 -> 35329, 2138334265 -> 5470
    //   5512: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5515: getstatic Perryc.c : I
    //   5518: iflt -> 5532
    //   5521: ldc2_w 1975503878
    //   5524: l2i
    //   5525: ldc_w -537603795
    //   5528: ixor
    //   5529: goto -> 5540
    //   5532: ldc2_w -1792527468
    //   5535: l2i
    //   5536: ldc_w -1678990785
    //   5539: ixor
    //   5540: ldc2_w -2128216832
    //   5543: l2i
    //   5544: ldc_w -842619511
    //   5547: ixor
    //   5548: ixor
    //   5549: lookupswitch default -> 5576, -425179742 -> 35319, 782543182 -> 5532
    //   5576: goto -> 5580
    //   5579: athrow
    //   5580: invokevirtual getValue : ()Ljava/lang/Object;
    //   5583: goto -> 5587
    //   5586: athrow
    //   5587: checkcast java/lang/Integer
    //   5590: getstatic Perryc.0 : I
    //   5593: ifle -> 5607
    //   5596: ldc2_w 299371119
    //   5599: l2i
    //   5600: ldc_w 1792239932
    //   5603: ixor
    //   5604: goto -> 5615
    //   5607: ldc2_w 1315560773
    //   5610: l2i
    //   5611: ldc_w 1609313856
    //   5614: ixor
    //   5615: ldc2_w 2013306496
    //   5618: l2i
    //   5619: ldc_w -330958432
    //   5622: ixor
    //   5623: ixor
    //   5624: lookupswitch default -> 5652, -280099725 -> 34881, -34381810 -> 5607
    //   5652: goto -> 5656
    //   5655: athrow
    //   5656: invokevirtual intValue : ()I
    //   5659: goto -> 5663
    //   5662: athrow
    //   5663: getstatic Perryc.0 : I
    //   5666: ifle -> 5680
    //   5669: ldc2_w 1341031447
    //   5672: l2i
    //   5673: ldc_w 393535100
    //   5676: ixor
    //   5677: goto -> 5688
    //   5680: ldc2_w -663962364
    //   5683: l2i
    //   5684: ldc_w -832497975
    //   5687: ixor
    //   5688: ldc2_w 953546317
    //   5691: l2i
    //   5692: ldc_w -2101230871
    //   5695: ixor
    //   5696: ixor
    //   5697: lookupswitch default -> 35339, -1407606935 -> 5724, -493982001 -> 5680
    //   5724: aload_0
    //   5725: getstatic Perryc.1 : I
    //   5728: ifeq -> 5742
    //   5731: ldc2_w -391029240
    //   5734: l2i
    //   5735: ldc_w -1611177866
    //   5738: ixor
    //   5739: goto -> 5750
    //   5742: ldc2_w -1259746863
    //   5745: l2i
    //   5746: ldc_w 852642500
    //   5749: ixor
    //   5750: ldc2_w -1064079869
    //   5753: l2i
    //   5754: ldc_w 1348461707
    //   5757: ixor
    //   5758: ixor
    //   5759: lookupswitch default -> 5784, -2022958286 -> 5742, -410340106 -> 35095
    //   5784: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5787: getstatic Perryc.c : I
    //   5790: iflt -> 5804
    //   5793: ldc2_w -1215033541
    //   5796: l2i
    //   5797: ldc_w 149510961
    //   5800: ixor
    //   5801: goto -> 5812
    //   5804: ldc2_w -480809993
    //   5807: l2i
    //   5808: ldc_w -944912428
    //   5811: ixor
    //   5812: ldc2_w 1832939389
    //   5815: l2i
    //   5816: ldc_w 1902834919
    //   5819: ixor
    //   5820: ixor
    //   5821: lookupswitch default -> 35373, -1554526320 -> 5804, 953169849 -> 5848
    //   5848: goto -> 5852
    //   5851: athrow
    //   5852: invokevirtual getValue : ()Ljava/lang/Object;
    //   5855: goto -> 5859
    //   5858: athrow
    //   5859: checkcast java/lang/Integer
    //   5862: getstatic Perryc.c : I
    //   5865: iflt -> 5879
    //   5868: ldc2_w 74173863
    //   5871: l2i
    //   5872: ldc_w 2100284930
    //   5875: ixor
    //   5876: goto -> 5887
    //   5879: ldc2_w -955940596
    //   5882: l2i
    //   5883: ldc_w 1830440374
    //   5886: ixor
    //   5887: ldc2_w 569097111
    //   5890: l2i
    //   5891: ldc_w 489942308
    //   5894: ixor
    //   5895: ixor
    //   5896: lookupswitch default -> 35305, -1765303799 -> 5924, 1167873302 -> 5879
    //   5924: goto -> 5928
    //   5927: athrow
    //   5928: invokevirtual intValue : ()I
    //   5931: goto -> 5935
    //   5934: athrow
    //   5935: getstatic Perryc.0 : I
    //   5938: ifle -> 5952
    //   5941: ldc2_w 306406932
    //   5944: l2i
    //   5945: ldc_w 381359176
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w -367869043
    //   5955: l2i
    //   5956: ldc_w 773610163
    //   5959: ixor
    //   5960: ldc2_w -936606087
    //   5963: l2i
    //   5964: ldc_w 1352830488
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 5996, -1669957059 -> 35355, 1063087608 -> 5952
    //   5996: aload_0
    //   5997: getstatic Perryc.1 : I
    //   6000: ifeq -> 6014
    //   6003: ldc2_w -380250724
    //   6006: l2i
    //   6007: ldc_w 1488626737
    //   6010: ixor
    //   6011: goto -> 6022
    //   6014: ldc2_w -1469472724
    //   6017: l2i
    //   6018: ldc_w 2056465000
    //   6021: ixor
    //   6022: ldc2_w -937034941
    //   6025: l2i
    //   6026: ldc_w -1655668911
    //   6029: ixor
    //   6030: ixor
    //   6031: lookupswitch default -> 35469, -2020667818 -> 6056, -459606593 -> 6014
    //   6056: getfield backgroundAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6059: getstatic Perryc.1 : I
    //   6062: ifeq -> 6076
    //   6065: ldc2_w 2083904664
    //   6068: l2i
    //   6069: ldc_w 723028839
    //   6072: ixor
    //   6073: goto -> 6084
    //   6076: ldc2_w 1464628639
    //   6079: l2i
    //   6080: ldc_w -176405328
    //   6083: ixor
    //   6084: ldc2_w 2049818514
    //   6087: l2i
    //   6088: ldc_w 1203833235
    //   6091: ixor
    //   6092: ixor
    //   6093: lookupswitch default -> 35429, -1612937426 -> 6120, 1791091198 -> 6076
    //   6120: goto -> 6124
    //   6123: athrow
    //   6124: invokevirtual getValue : ()Ljava/lang/Object;
    //   6127: goto -> 6131
    //   6130: athrow
    //   6131: checkcast java/lang/Integer
    //   6134: getstatic Perryc.c : I
    //   6137: iflt -> 6151
    //   6140: ldc2_w -818422189
    //   6143: l2i
    //   6144: ldc_w -1337959300
    //   6147: ixor
    //   6148: goto -> 6159
    //   6151: ldc2_w 1750184776
    //   6154: l2i
    //   6155: ldc_w 1529072546
    //   6158: ixor
    //   6159: ldc2_w -1005120341
    //   6162: l2i
    //   6163: ldc_w 279937426
    //   6166: ixor
    //   6167: ixor
    //   6168: lookupswitch default -> 34955, -1412491498 -> 6151, -406131245 -> 6196
    //   6196: goto -> 6200
    //   6199: athrow
    //   6200: invokevirtual intValue : ()I
    //   6203: goto -> 6207
    //   6206: athrow
    //   6207: getstatic Perryc.0 : I
    //   6210: ifle -> 6224
    //   6213: ldc2_w 1410996694
    //   6216: l2i
    //   6217: ldc_w 1649862650
    //   6220: ixor
    //   6221: goto -> 6232
    //   6224: ldc2_w -1594408235
    //   6227: l2i
    //   6228: ldc_w -942816924
    //   6231: ixor
    //   6232: ldc2_w 2042190619
    //   6235: l2i
    //   6236: ldc_w 1459260011
    //   6239: ixor
    //   6240: ixor
    //   6241: lookupswitch default -> 6268, -1531673322 -> 6224, 420425564 -> 35519
    //   6268: goto -> 6272
    //   6271: athrow
    //   6272: invokestatic toRGBA : (IIII)I
    //   6275: goto -> 6279
    //   6278: athrow
    //   6279: getstatic Perryc.0 : I
    //   6282: ifle -> 6296
    //   6285: ldc2_w -846419677
    //   6288: l2i
    //   6289: ldc_w -189343488
    //   6292: ixor
    //   6293: goto -> 6304
    //   6296: ldc2_w -2009986520
    //   6299: l2i
    //   6300: ldc_w 522597803
    //   6303: ixor
    //   6304: ldc2_w -1332313310
    //   6307: l2i
    //   6308: ldc_w -1986250150
    //   6311: ixor
    //   6312: ixor
    //   6313: lookupswitch default -> 34879, -1373731077 -> 6340, 3197275 -> 6296
    //   6340: goto -> 6344
    //   6343: athrow
    //   6344: invokestatic drawRectangleCorrectly : (IIIII)V
    //   6347: goto -> 6351
    //   6350: athrow
    //   6351: getstatic Perryc.0 : I
    //   6354: ifle -> 6368
    //   6357: ldc2_w -469171767
    //   6360: l2i
    //   6361: ldc_w -1927821157
    //   6364: ixor
    //   6365: goto -> 6376
    //   6368: ldc2_w 1903640120
    //   6371: l2i
    //   6372: ldc_w 1443347543
    //   6375: ixor
    //   6376: ldc2_w 763113488
    //   6379: l2i
    //   6380: ldc_w -1435551079
    //   6383: ixor
    //   6384: ixor
    //   6385: lookupswitch default -> 6412, -301087781 -> 34987, 1772865053 -> 6368
    //   6412: aload_0
    //   6413: getstatic Perryc.0 : I
    //   6416: ifle -> 6430
    //   6419: ldc2_w 926103390
    //   6422: l2i
    //   6423: ldc_w -1526398131
    //   6426: ixor
    //   6427: goto -> 6438
    //   6430: ldc2_w 246095645
    //   6433: l2i
    //   6434: ldc_w 1600281012
    //   6437: ixor
    //   6438: ldc2_w -1344156421
    //   6441: l2i
    //   6442: ldc_w -544527242
    //   6445: ixor
    //   6446: ixor
    //   6447: lookupswitch default -> 6472, -497232738 -> 34787, -492231216 -> 6430
    //   6472: iload #6
    //   6474: getstatic Perryc.1 : I
    //   6477: ifeq -> 6491
    //   6480: ldc2_w 1824738327
    //   6483: l2i
    //   6484: ldc_w -550923990
    //   6487: ixor
    //   6488: goto -> 6499
    //   6491: ldc2_w -787577871
    //   6494: l2i
    //   6495: ldc_w 420754046
    //   6498: ixor
    //   6499: ldc2_w -1845756473
    //   6502: l2i
    //   6503: ldc_w 1371210496
    //   6506: ixor
    //   6507: ixor
    //   6508: lookupswitch default -> 6536, -2131403528 -> 6491, 1940530170 -> 34893
    //   6536: putfield startcolor1 : I
    //   6539: getstatic Perryc.c : I
    //   6542: iflt -> 6556
    //   6545: ldc2_w -681849036
    //   6548: l2i
    //   6549: ldc_w -376048275
    //   6552: ixor
    //   6553: goto -> 6564
    //   6556: ldc2_w 1615585710
    //   6559: l2i
    //   6560: ldc_w -1780339524
    //   6563: ixor
    //   6564: ldc2_w -972509479
    //   6567: l2i
    //   6568: ldc_w 1728257335
    //   6571: ixor
    //   6572: ixor
    //   6573: lookupswitch default -> 35141, -1614444105 -> 6556, 1419935484 -> 6600
    //   6600: aload_0
    //   6601: getstatic Perryc.1 : I
    //   6604: ifeq -> 6618
    //   6607: ldc2_w 810851171
    //   6610: l2i
    //   6611: ldc_w 1392973797
    //   6614: ixor
    //   6615: goto -> 6626
    //   6618: ldc2_w -1581035520
    //   6621: l2i
    //   6622: ldc_w 748366627
    //   6625: ixor
    //   6626: ldc2_w 2113657794
    //   6629: l2i
    //   6630: ldc_w 1444388764
    //   6633: ixor
    //   6634: ixor
    //   6635: lookupswitch default -> 35035, -1498136707 -> 6660, 1220528344 -> 6618
    //   6660: iload #6
    //   6662: getstatic Perryc.c : I
    //   6665: iflt -> 6679
    //   6668: ldc2_w -1528017232
    //   6671: l2i
    //   6672: ldc_w -1903374964
    //   6675: ixor
    //   6676: goto -> 6687
    //   6679: ldc2_w -129387600
    //   6682: l2i
    //   6683: ldc_w 630368873
    //   6686: ixor
    //   6687: ldc2_w -958240996
    //   6690: l2i
    //   6691: ldc_w -743814588
    //   6694: ixor
    //   6695: ixor
    //   6696: lookupswitch default -> 6724, 415104773 -> 6679, 1059630692 -> 35433
    //   6724: putfield endcolor1 : I
    //   6727: getstatic Perryc.1 : I
    //   6730: ifeq -> 6744
    //   6733: ldc2_w 1970099292
    //   6736: l2i
    //   6737: ldc_w 508148839
    //   6740: ixor
    //   6741: goto -> 6752
    //   6744: ldc2_w -149815237
    //   6747: l2i
    //   6748: ldc_w 1348106788
    //   6751: ixor
    //   6752: ldc2_w -1446378448
    //   6755: l2i
    //   6756: ldc_w -699087680
    //   6759: ixor
    //   6760: ixor
    //   6761: lookupswitch default -> 35327, -657016081 -> 6788, 347744459 -> 6744
    //   6788: aload_0
    //   6789: getstatic Perryc.1 : I
    //   6792: ifeq -> 6806
    //   6795: ldc2_w -682697152
    //   6798: l2i
    //   6799: ldc_w 1836450094
    //   6802: ixor
    //   6803: goto -> 6814
    //   6806: ldc2_w 695366419
    //   6809: l2i
    //   6810: ldc_w 316654842
    //   6813: ixor
    //   6814: ldc2_w -2036271755
    //   6817: l2i
    //   6818: ldc_w -324052328
    //   6821: ixor
    //   6822: ixor
    //   6823: lookupswitch default -> 35291, -801673085 -> 6806, 1369577476 -> 6848
    //   6848: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6851: getstatic Perryc.0 : I
    //   6854: ifle -> 6868
    //   6857: ldc2_w 220771305
    //   6860: l2i
    //   6861: ldc_w -1139617693
    //   6864: ixor
    //   6865: goto -> 6876
    //   6868: ldc2_w 47203191
    //   6871: l2i
    //   6872: ldc_w 1506098285
    //   6875: ixor
    //   6876: ldc2_w -860336168
    //   6879: l2i
    //   6880: ldc_w -321765847
    //   6883: ixor
    //   6884: ixor
    //   6885: lookupswitch default -> 6912, -1857023365 -> 34919, 162925308 -> 6868
    //   6912: goto -> 6916
    //   6915: athrow
    //   6916: invokevirtual getValue : ()Ljava/lang/Object;
    //   6919: goto -> 6923
    //   6922: athrow
    //   6923: checkcast java/lang/Integer
    //   6926: getstatic Perryc.0 : I
    //   6929: ifle -> 6943
    //   6932: ldc2_w 1558381042
    //   6935: l2i
    //   6936: ldc_w -623977881
    //   6939: ixor
    //   6940: goto -> 6951
    //   6943: ldc2_w 1442001326
    //   6946: l2i
    //   6947: ldc_w 1926928057
    //   6950: ixor
    //   6951: ldc2_w 233759409
    //   6954: l2i
    //   6955: ldc_w -1071557030
    //   6958: ixor
    //   6959: ixor
    //   6960: lookupswitch default -> 6988, 1273130878 -> 34901, 1955972645 -> 6943
    //   6988: goto -> 6992
    //   6991: athrow
    //   6992: invokevirtual intValue : ()I
    //   6995: goto -> 6999
    //   6998: athrow
    //   6999: i2d
    //   7000: getstatic Perryc.c : I
    //   7003: iflt -> 7017
    //   7006: ldc2_w -327829901
    //   7009: l2i
    //   7010: ldc_w -845653193
    //   7013: ixor
    //   7014: goto -> 7025
    //   7017: ldc2_w -102644266
    //   7020: l2i
    //   7021: ldc_w -1241400173
    //   7024: ixor
    //   7025: ldc2_w 571138551
    //   7028: l2i
    //   7029: ldc_w 825450473
    //   7032: ixor
    //   7033: ixor
    //   7034: lookupswitch default -> 7060, 651084144 -> 7017, 852775770 -> 35331
    //   7060: aload_0
    //   7061: getstatic Perryc.c : I
    //   7064: iflt -> 7078
    //   7067: ldc2_w -91807900
    //   7070: l2i
    //   7071: ldc_w 168193591
    //   7074: ixor
    //   7075: goto -> 7086
    //   7078: ldc2_w -377168629
    //   7081: l2i
    //   7082: ldc_w 83141612
    //   7085: ixor
    //   7086: ldc2_w 18084903
    //   7089: l2i
    //   7090: ldc_w -1467681425
    //   7093: ixor
    //   7094: ixor
    //   7095: lookupswitch default -> 7120, -128466792 -> 7078, 1494642715 -> 35063
    //   7120: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7123: getstatic Perryc.0 : I
    //   7126: ifle -> 7140
    //   7129: ldc2_w -1792362295
    //   7132: l2i
    //   7133: ldc_w 1206646871
    //   7136: ixor
    //   7137: goto -> 7148
    //   7140: ldc2_w -1814499970
    //   7143: l2i
    //   7144: ldc_w -151539211
    //   7147: ixor
    //   7148: ldc2_w -1098659163
    //   7151: l2i
    //   7152: ldc_w 767785844
    //   7155: ixor
    //   7156: ixor
    //   7157: lookupswitch default -> 34885, -160436902 -> 7184, 1099034959 -> 7140
    //   7184: goto -> 7188
    //   7187: athrow
    //   7188: invokevirtual getValue : ()Ljava/lang/Object;
    //   7191: goto -> 7195
    //   7194: athrow
    //   7195: checkcast java/lang/Integer
    //   7198: getstatic Perryc.0 : I
    //   7201: ifle -> 7215
    //   7204: ldc2_w 1202690547
    //   7207: l2i
    //   7208: ldc_w -883245435
    //   7211: ixor
    //   7212: goto -> 7223
    //   7215: ldc2_w 436014512
    //   7218: l2i
    //   7219: ldc_w 1303260031
    //   7222: ixor
    //   7223: ldc2_w 520944903
    //   7226: l2i
    //   7227: ldc_w 1540173623
    //   7230: ixor
    //   7231: ixor
    //   7232: lookupswitch default -> 35135, -936053434 -> 7215, 278066431 -> 7260
    //   7260: goto -> 7264
    //   7263: athrow
    //   7264: invokevirtual intValue : ()I
    //   7267: goto -> 7271
    //   7270: athrow
    //   7271: i2d
    //   7272: ldc2_w 0.117896192252892
    //   7275: invokestatic doubleToLongBits : (D)J
    //   7278: ldc2_w 9217512129002508748
    //   7281: lxor
    //   7282: invokestatic longBitsToDouble : (J)D
    //   7285: dadd
    //   7286: getstatic Perryc.0 : I
    //   7289: ifle -> 7303
    //   7292: ldc2_w -2107336421
    //   7295: l2i
    //   7296: ldc_w -1589749266
    //   7299: ixor
    //   7300: goto -> 7311
    //   7303: ldc2_w -403208876
    //   7306: l2i
    //   7307: ldc_w 7409457
    //   7310: ixor
    //   7311: ldc2_w 1508409831
    //   7314: l2i
    //   7315: ldc_w 677550142
    //   7318: ixor
    //   7319: ixor
    //   7320: lookupswitch default -> 7348, 1389418796 -> 35517, 1751085855 -> 7303
    //   7348: aload_0
    //   7349: getstatic Perryc.0 : I
    //   7352: ifle -> 7366
    //   7355: ldc2_w 1379539178
    //   7358: l2i
    //   7359: ldc_w -1037948778
    //   7362: ixor
    //   7363: goto -> 7374
    //   7366: ldc2_w -2132910322
    //   7369: l2i
    //   7370: ldc_w -71083716
    //   7373: ixor
    //   7374: ldc2_w 1532786095
    //   7377: l2i
    //   7378: ldc_w -1449913009
    //   7381: ixor
    //   7382: ixor
    //   7383: lookupswitch default -> 7408, 484115135 -> 7366, 1657819292 -> 34829
    //   7408: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7411: getstatic Perryc.1 : I
    //   7414: ifeq -> 7428
    //   7417: ldc2_w 306058704
    //   7420: l2i
    //   7421: ldc_w -853954158
    //   7424: ixor
    //   7425: goto -> 7436
    //   7428: ldc2_w 1134671024
    //   7431: l2i
    //   7432: ldc_w 211919918
    //   7435: ixor
    //   7436: ldc2_w 669764465
    //   7439: l2i
    //   7440: ldc_w -1450037873
    //   7443: ixor
    //   7444: ixor
    //   7445: lookupswitch default -> 7472, 544037646 -> 7428, 1365131964 -> 35043
    //   7472: goto -> 7476
    //   7475: athrow
    //   7476: invokevirtual getValue : ()Ljava/lang/Object;
    //   7479: goto -> 7483
    //   7482: athrow
    //   7483: checkcast java/lang/Integer
    //   7486: getstatic Perryc.0 : I
    //   7489: ifle -> 7503
    //   7492: ldc2_w 667064900
    //   7495: l2i
    //   7496: ldc_w -263591438
    //   7499: ixor
    //   7500: goto -> 7511
    //   7503: ldc2_w -1733346031
    //   7506: l2i
    //   7507: ldc_w 2046355312
    //   7510: ixor
    //   7511: ldc2_w 1920018150
    //   7514: l2i
    //   7515: ldc_w -756200838
    //   7518: ixor
    //   7519: ixor
    //   7520: lookupswitch default -> 7548, 412928655 -> 7503, 1998004010 -> 35573
    //   7548: goto -> 7552
    //   7551: athrow
    //   7552: invokevirtual intValue : ()I
    //   7555: goto -> 7559
    //   7558: athrow
    //   7559: i2d
    //   7560: getstatic Perryc.c : I
    //   7563: iflt -> 7577
    //   7566: ldc2_w 341186603
    //   7569: l2i
    //   7570: ldc_w -389481800
    //   7573: ixor
    //   7574: goto -> 7585
    //   7577: ldc2_w 1529346226
    //   7580: l2i
    //   7581: ldc_w -2030200664
    //   7584: ixor
    //   7585: ldc2_w -227663957
    //   7588: l2i
    //   7589: ldc_w 206840034
    //   7592: ixor
    //   7593: ixor
    //   7594: lookupswitch default -> 35207, 44359130 -> 7577, 601907027 -> 7620
    //   7620: fload #5
    //   7622: f2d
    //   7623: ldc2_w 0.19778488561756832
    //   7626: invokestatic doubleToLongBits : (D)J
    //   7629: ldc2_w 9213153785509486825
    //   7632: lxor
    //   7633: invokestatic longBitsToDouble : (J)D
    //   7636: dmul
    //   7637: dadd
    //   7638: getstatic Perryc.0 : I
    //   7641: ifle -> 7655
    //   7644: ldc2_w 187021997
    //   7647: l2i
    //   7648: ldc_w -367882692
    //   7651: ixor
    //   7652: goto -> 7663
    //   7655: ldc2_w 716903769
    //   7658: l2i
    //   7659: ldc_w 327923082
    //   7662: ixor
    //   7663: ldc2_w 545364532
    //   7666: l2i
    //   7667: ldc_w -1032426345
    //   7670: ixor
    //   7671: ixor
    //   7672: lookupswitch default -> 35233, -607693200 -> 7700, 62964274 -> 7655
    //   7700: aload_0
    //   7701: getstatic Perryc.0 : I
    //   7704: ifle -> 7718
    //   7707: ldc2_w -537214449
    //   7710: l2i
    //   7711: ldc_w 2062833600
    //   7714: ixor
    //   7715: goto -> 7726
    //   7718: ldc2_w 666874585
    //   7721: l2i
    //   7722: ldc_w 1704139196
    //   7725: ixor
    //   7726: ldc2_w -540135605
    //   7729: l2i
    //   7730: ldc_w -562197994
    //   7733: ixor
    //   7734: ixor
    //   7735: lookupswitch default -> 7760, -1531105134 -> 34795, -151837209 -> 7718
    //   7760: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7763: getstatic Perryc.0 : I
    //   7766: ifle -> 7780
    //   7769: ldc2_w -1112304344
    //   7772: l2i
    //   7773: ldc_w 1031312930
    //   7776: ixor
    //   7777: goto -> 7788
    //   7780: ldc2_w -1951579137
    //   7783: l2i
    //   7784: ldc_w -1961604984
    //   7787: ixor
    //   7788: ldc2_w 1731426741
    //   7791: l2i
    //   7792: ldc_w 2023068468
    //   7795: ixor
    //   7796: ixor
    //   7797: lookupswitch default -> 35461, -1620186741 -> 7780, 522183158 -> 7824
    //   7824: goto -> 7828
    //   7827: athrow
    //   7828: invokevirtual getValue : ()Ljava/lang/Object;
    //   7831: goto -> 7835
    //   7834: athrow
    //   7835: checkcast java/lang/Integer
    //   7838: getstatic Perryc.0 : I
    //   7841: ifle -> 7855
    //   7844: ldc2_w 1405710962
    //   7847: l2i
    //   7848: ldc_w 1114929496
    //   7851: ixor
    //   7852: goto -> 7863
    //   7855: ldc2_w -857422975
    //   7858: l2i
    //   7859: ldc_w -1405923899
    //   7862: ixor
    //   7863: ldc2_w -316413185
    //   7866: l2i
    //   7867: ldc_w 1736533515
    //   7870: ixor
    //   7871: ixor
    //   7872: lookupswitch default -> 34703, -1692432418 -> 7855, -361430352 -> 7900
    //   7900: goto -> 7904
    //   7903: athrow
    //   7904: invokevirtual intValue : ()I
    //   7907: goto -> 7911
    //   7910: athrow
    //   7911: i2d
    //   7912: ldc2_w 0.11176000075518151
    //   7915: invokestatic doubleToLongBits : (D)J
    //   7918: ldc2_w 9216950333271285934
    //   7921: lxor
    //   7922: invokestatic longBitsToDouble : (J)D
    //   7925: dadd
    //   7926: getstatic Perryc.c : I
    //   7929: iflt -> 7943
    //   7932: ldc2_w 2037856349
    //   7935: l2i
    //   7936: ldc_w 1252181657
    //   7939: ixor
    //   7940: goto -> 7951
    //   7943: ldc2_w 1303479385
    //   7946: l2i
    //   7947: ldc_w -722732837
    //   7950: ixor
    //   7951: ldc2_w -260167375
    //   7954: l2i
    //   7955: ldc_w -661975203
    //   7958: ixor
    //   7959: ixor
    //   7960: lookupswitch default -> 7988, 455137448 -> 34713, 1318498279 -> 7943
    //   7988: aload_0
    //   7989: getstatic Perryc.c : I
    //   7992: iflt -> 8006
    //   7995: ldc2_w -1827936607
    //   7998: l2i
    //   7999: ldc_w -1261847797
    //   8002: ixor
    //   8003: goto -> 8014
    //   8006: ldc2_w -858420225
    //   8009: l2i
    //   8010: ldc_w 1519587393
    //   8013: ixor
    //   8014: ldc2_w -523003884
    //   8017: l2i
    //   8018: ldc_w 232428398
    //   8021: ixor
    //   8022: ixor
    //   8023: lookupswitch default -> 35409, -892643632 -> 8006, 2068811972 -> 8048
    //   8048: getfield startcolor1 : I
    //   8051: getstatic Perryc.c : I
    //   8054: iflt -> 8068
    //   8057: ldc2_w -1242867943
    //   8060: l2i
    //   8061: ldc_w 660468516
    //   8064: ixor
    //   8065: goto -> 8076
    //   8068: ldc2_w -1282009910
    //   8071: l2i
    //   8072: ldc_w 1916571376
    //   8075: ixor
    //   8076: ldc2_w 1035620212
    //   8079: l2i
    //   8080: ldc_w -1582870996
    //   8083: ixor
    //   8084: ixor
    //   8085: lookupswitch default -> 35109, 246130021 -> 8068, 1572313954 -> 8112
    //   8112: aload_0
    //   8113: getstatic Perryc.1 : I
    //   8116: ifeq -> 8130
    //   8119: ldc2_w -739888804
    //   8122: l2i
    //   8123: ldc_w 243566879
    //   8126: ixor
    //   8127: goto -> 8138
    //   8130: ldc2_w -1744570966
    //   8133: l2i
    //   8134: ldc_w -971610728
    //   8137: ixor
    //   8138: ldc2_w 569673098
    //   8141: l2i
    //   8142: ldc_w -883666667
    //   8145: ixor
    //   8146: ixor
    //   8147: lookupswitch default -> 34855, -1263188819 -> 8172, 935488732 -> 8130
    //   8172: getfield endcolor1 : I
    //   8175: getstatic Perryc.1 : I
    //   8178: ifeq -> 8192
    //   8181: ldc2_w 967878108
    //   8184: l2i
    //   8185: ldc_w -1228467614
    //   8188: ixor
    //   8189: goto -> 8200
    //   8192: ldc2_w -1966304199
    //   8195: l2i
    //   8196: ldc_w -660225426
    //   8199: ixor
    //   8200: ldc2_w 148723428
    //   8203: l2i
    //   8204: ldc_w -768256121
    //   8207: ixor
    //   8208: ixor
    //   8209: lookupswitch default -> 8236, 29046531 -> 8192, 1436530397 -> 35179
    //   8236: goto -> 8240
    //   8239: athrow
    //   8240: invokestatic drawGradientSideways : (DDDDII)V
    //   8243: goto -> 8247
    //   8246: athrow
    //   8247: getstatic Perryc.0 : I
    //   8250: ifle -> 8264
    //   8253: ldc2_w -1400640000
    //   8256: l2i
    //   8257: ldc_w 604406771
    //   8260: ixor
    //   8261: goto -> 8272
    //   8264: ldc2_w 43646731
    //   8267: l2i
    //   8268: ldc_w 88968676
    //   8271: ixor
    //   8272: ldc2_w 1213497980
    //   8275: l2i
    //   8276: ldc_w 842646316
    //   8279: ixor
    //   8280: ixor
    //   8281: lookupswitch default -> 35003, -219665245 -> 8264, 2109289407 -> 8308
    //   8308: goto -> 8312
    //   8311: athrow
    //   8312: invokestatic func_179101_C : ()V
    //   8315: goto -> 8319
    //   8318: athrow
    //   8319: getstatic Perryc.c : I
    //   8322: iflt -> 8336
    //   8325: ldc2_w 957160954
    //   8328: l2i
    //   8329: ldc_w 46572301
    //   8332: ixor
    //   8333: goto -> 8344
    //   8336: ldc2_w -137064679
    //   8339: l2i
    //   8340: ldc_w -1082115319
    //   8343: ixor
    //   8344: ldc2_w 732775336
    //   8347: l2i
    //   8348: ldc_w -1394512726
    //   8351: ixor
    //   8352: ixor
    //   8353: lookupswitch default -> 34849, -1131965963 -> 8336, -820471022 -> 8380
    //   8380: getstatic net/minecraft/client/renderer/OpenGlHelper.field_77476_b : I
    //   8383: getstatic Perryc.1 : I
    //   8386: ifeq -> 8400
    //   8389: ldc2_w -616624773
    //   8392: l2i
    //   8393: ldc_w -1100445021
    //   8396: ixor
    //   8397: goto -> 8408
    //   8400: ldc2_w -706696761
    //   8403: l2i
    //   8404: ldc_w -483136888
    //   8407: ixor
    //   8408: ldc2_w -1552855837
    //   8411: l2i
    //   8412: ldc_w -1978503376
    //   8415: ixor
    //   8416: ixor
    //   8417: lookupswitch default -> 8444, -1275551207 -> 8400, 1278518283 -> 34715
    //   8444: goto -> 8448
    //   8447: athrow
    //   8448: invokestatic func_179138_g : (I)V
    //   8451: goto -> 8455
    //   8454: athrow
    //   8455: getstatic Perryc.0 : I
    //   8458: ifle -> 8472
    //   8461: ldc2_w -286287974
    //   8464: l2i
    //   8465: ldc_w -350280954
    //   8468: ixor
    //   8469: goto -> 8480
    //   8472: ldc2_w 1424076614
    //   8475: l2i
    //   8476: ldc_w -1600529309
    //   8479: ixor
    //   8480: ldc2_w 993325764
    //   8483: l2i
    //   8484: ldc_w 731331746
    //   8487: ixor
    //   8488: ixor
    //   8489: lookupswitch default -> 8516, -1663567782 -> 8472, 357792506 -> 34935
    //   8516: goto -> 8520
    //   8519: athrow
    //   8520: invokestatic func_179090_x : ()V
    //   8523: goto -> 8527
    //   8526: athrow
    //   8527: getstatic Perryc.1 : I
    //   8530: ifeq -> 8544
    //   8533: ldc2_w -1423394910
    //   8536: l2i
    //   8537: ldc_w 957182754
    //   8540: ixor
    //   8541: goto -> 8552
    //   8544: ldc2_w -436256337
    //   8547: l2i
    //   8548: ldc_w 14368828
    //   8551: ixor
    //   8552: ldc2_w 1635692318
    //   8555: l2i
    //   8556: ldc_w 1866870413
    //   8559: ixor
    //   8560: ixor
    //   8561: lookupswitch default -> 35151, -1675803373 -> 8544, -350453760 -> 8588
    //   8588: getstatic net/minecraft/client/renderer/OpenGlHelper.field_77478_a : I
    //   8591: getstatic Perryc.1 : I
    //   8594: ifeq -> 8608
    //   8597: ldc2_w -1318661400
    //   8600: l2i
    //   8601: ldc_w -839650311
    //   8604: ixor
    //   8605: goto -> 8616
    //   8608: ldc2_w -1409958303
    //   8611: l2i
    //   8612: ldc_w 1115294830
    //   8615: ixor
    //   8616: ldc2_w -1349195884
    //   8619: l2i
    //   8620: ldc_w 813825994
    //   8623: ixor
    //   8624: ixor
    //   8625: lookupswitch default -> 8652, -1848973844 -> 8608, -478135985 -> 35091
    //   8652: goto -> 8656
    //   8655: athrow
    //   8656: invokestatic func_179138_g : (I)V
    //   8659: goto -> 8663
    //   8662: athrow
    //   8663: ldc_w 11.420039
    //   8666: invokestatic floatToIntBits : (F)I
    //   8669: ldc_w 2125903995
    //   8672: ixor
    //   8673: invokestatic intBitsToFloat : (I)F
    //   8676: ldc_w 26.695112
    //   8679: invokestatic floatToIntBits : (F)I
    //   8682: ldc_w 2119536535
    //   8685: ixor
    //   8686: invokestatic intBitsToFloat : (I)F
    //   8689: ldc_w 6.029853
    //   8692: invokestatic floatToIntBits : (F)I
    //   8695: ldc_w 2134963342
    //   8698: ixor
    //   8699: invokestatic intBitsToFloat : (I)F
    //   8702: ldc_w 4.3531437
    //   8705: invokestatic floatToIntBits : (F)I
    //   8708: ldc_w 2131447028
    //   8711: ixor
    //   8712: invokestatic intBitsToFloat : (I)F
    //   8715: getstatic Perryc.c : I
    //   8718: iflt -> 8732
    //   8721: ldc2_w 1210052075
    //   8724: l2i
    //   8725: ldc_w -140887502
    //   8728: ixor
    //   8729: goto -> 8740
    //   8732: ldc2_w 1870708063
    //   8735: l2i
    //   8736: ldc_w 2102229878
    //   8739: ixor
    //   8740: ldc2_w -1748811886
    //   8743: l2i
    //   8744: ldc_w -1601329324
    //   8747: ixor
    //   8748: ixor
    //   8749: lookupswitch default -> 35549, -1999941857 -> 8732, 629366511 -> 8776
    //   8776: goto -> 8780
    //   8779: athrow
    //   8780: invokestatic func_179131_c : (FFFF)V
    //   8783: goto -> 8787
    //   8786: athrow
    //   8787: getstatic Perryc.0 : I
    //   8790: ifle -> 8804
    //   8793: ldc2_w 834632986
    //   8796: l2i
    //   8797: ldc_w -960720637
    //   8800: ixor
    //   8801: goto -> 8812
    //   8804: ldc2_w 2138224320
    //   8807: l2i
    //   8808: ldc_w -1794835925
    //   8811: ixor
    //   8812: ldc2_w 1510841017
    //   8815: l2i
    //   8816: ldc_w -587752693
    //   8819: ixor
    //   8820: ixor
    //   8821: lookupswitch default -> 34927, 1821134169 -> 8848, 1912204715 -> 8804
    //   8848: aload_0
    //   8849: getstatic Perryc.c : I
    //   8852: iflt -> 8866
    //   8855: ldc2_w -1816814313
    //   8858: l2i
    //   8859: ldc_w 1392393354
    //   8862: ixor
    //   8863: goto -> 8874
    //   8866: ldc2_w 150389629
    //   8869: l2i
    //   8870: ldc_w -1558159956
    //   8873: ixor
    //   8874: ldc2_w -387055898
    //   8877: l2i
    //   8878: ldc_w -2055293446
    //   8881: ixor
    //   8882: ixor
    //   8883: lookupswitch default -> 35163, -1395070335 -> 8866, -968501811 -> 8908
    //   8908: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8911: getstatic Perryc.1 : I
    //   8914: ifeq -> 8928
    //   8917: ldc2_w 2067080300
    //   8920: l2i
    //   8921: ldc_w 1770743560
    //   8924: ixor
    //   8925: goto -> 8936
    //   8928: ldc2_w -1031923629
    //   8931: l2i
    //   8932: ldc_w 14975264
    //   8935: ixor
    //   8936: ldc2_w -791090361
    //   8939: l2i
    //   8940: ldc_w -398013169
    //   8943: ixor
    //   8944: ixor
    //   8945: lookupswitch default -> 8972, 607439599 -> 8928, 706766124 -> 35015
    //   8972: goto -> 8976
    //   8975: athrow
    //   8976: invokevirtual getValue : ()Ljava/lang/Object;
    //   8979: goto -> 8983
    //   8982: athrow
    //   8983: checkcast java/lang/Integer
    //   8986: getstatic Perryc.0 : I
    //   8989: ifle -> 9003
    //   8992: ldc2_w -381386340
    //   8995: l2i
    //   8996: ldc_w -327771168
    //   8999: ixor
    //   9000: goto -> 9011
    //   9003: ldc2_w -1003975974
    //   9006: l2i
    //   9007: ldc_w 1083676093
    //   9010: ixor
    //   9011: ldc2_w -1622841144
    //   9014: l2i
    //   9015: ldc_w -931714591
    //   9018: ixor
    //   9019: ixor
    //   9020: lookupswitch default -> 9048, -1983806482 -> 9003, 1375755093 -> 35065
    //   9048: goto -> 9052
    //   9051: athrow
    //   9052: invokevirtual intValue : ()I
    //   9055: goto -> 9059
    //   9058: athrow
    //   9059: ldc2_w 1728659433
    //   9062: l2i
    //   9063: ldc_w 1728659447
    //   9066: ixor
    //   9067: iadd
    //   9068: getstatic Perryc.0 : I
    //   9071: ifle -> 9085
    //   9074: ldc2_w 55457559
    //   9077: l2i
    //   9078: ldc_w 1129718008
    //   9081: ixor
    //   9082: goto -> 9093
    //   9085: ldc2_w -2125677872
    //   9088: l2i
    //   9089: ldc_w 809626453
    //   9092: ixor
    //   9093: ldc2_w -1121240779
    //   9096: l2i
    //   9097: ldc_w 457572554
    //   9100: ixor
    //   9101: ixor
    //   9102: lookupswitch default -> 9128, -428528112 -> 34733, 1757551424 -> 9085
    //   9128: aload_0
    //   9129: getstatic Perryc.0 : I
    //   9132: ifle -> 9146
    //   9135: ldc2_w -1315140125
    //   9138: l2i
    //   9139: ldc_w -211747842
    //   9142: ixor
    //   9143: goto -> 9154
    //   9146: ldc2_w 486708103
    //   9149: l2i
    //   9150: ldc_w 1621515000
    //   9153: ixor
    //   9154: ldc2_w -427605193
    //   9157: l2i
    //   9158: ldc_w -1021709341
    //   9161: ixor
    //   9162: ixor
    //   9163: lookupswitch default -> 34763, 1480489387 -> 9188, 1734788809 -> 9146
    //   9188: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9191: getstatic Perryc.c : I
    //   9194: iflt -> 9208
    //   9197: ldc2_w 1359358473
    //   9200: l2i
    //   9201: ldc_w -176767817
    //   9204: ixor
    //   9205: goto -> 9216
    //   9208: ldc2_w 506952123
    //   9211: l2i
    //   9212: ldc_w 1513075949
    //   9215: ixor
    //   9216: ldc2_w -1035943355
    //   9219: l2i
    //   9220: ldc_w 965087261
    //   9223: ixor
    //   9224: ixor
    //   9225: lookupswitch default -> 34759, -1075962098 -> 9252, 1605780710 -> 9208
    //   9252: goto -> 9256
    //   9255: athrow
    //   9256: invokevirtual getValue : ()Ljava/lang/Object;
    //   9259: goto -> 9263
    //   9262: athrow
    //   9263: checkcast java/lang/Integer
    //   9266: getstatic Perryc.1 : I
    //   9269: ifeq -> 9283
    //   9272: ldc2_w -378737016
    //   9275: l2i
    //   9276: ldc_w 822601567
    //   9279: ixor
    //   9280: goto -> 9291
    //   9283: ldc2_w 925864304
    //   9286: l2i
    //   9287: ldc_w 1750308167
    //   9290: ixor
    //   9291: ldc2_w 654921577
    //   9294: l2i
    //   9295: ldc_w 405597255
    //   9298: ixor
    //   9299: ixor
    //   9300: lookupswitch default -> 9328, -414274823 -> 35139, 1374304382 -> 9283
    //   9328: goto -> 9332
    //   9331: athrow
    //   9332: invokevirtual intValue : ()I
    //   9335: goto -> 9339
    //   9338: athrow
    //   9339: ldc2_w 1352223165
    //   9342: l2i
    //   9343: ldc_w 1352223105
    //   9346: ixor
    //   9347: iadd
    //   9348: ldc2_w 1588207512
    //   9351: l2i
    //   9352: ldc_w 1588207494
    //   9355: ixor
    //   9356: ldc_w 1.4078516E38
    //   9359: invokestatic floatToIntBits : (F)I
    //   9362: ldc_w 2127811705
    //   9365: ixor
    //   9366: invokestatic intBitsToFloat : (I)F
    //   9369: ldc_w 4.6503585E37
    //   9372: invokestatic floatToIntBits : (F)I
    //   9375: ldc_w 2114711823
    //   9378: ixor
    //   9379: invokestatic intBitsToFloat : (I)F
    //   9382: getstatic Perryc.1 : I
    //   9385: ifeq -> 9399
    //   9388: ldc2_w 2090174876
    //   9391: l2i
    //   9392: ldc_w -613757654
    //   9395: ixor
    //   9396: goto -> 9407
    //   9399: ldc2_w 85205793
    //   9402: l2i
    //   9403: ldc_w 620582310
    //   9406: ixor
    //   9407: ldc2_w 1131409351
    //   9410: l2i
    //   9411: ldc_w -1785691828
    //   9414: ixor
    //   9415: ixor
    //   9416: lookupswitch default -> 34869, -149546996 -> 9444, 1895836221 -> 9399
    //   9444: aload #4
    //   9446: getstatic Perryc.1 : I
    //   9449: ifeq -> 9463
    //   9452: ldc2_w -623327414
    //   9455: l2i
    //   9456: ldc_w 1631616036
    //   9459: ixor
    //   9460: goto -> 9471
    //   9463: ldc2_w 1654540584
    //   9466: l2i
    //   9467: ldc_w 404070807
    //   9470: ixor
    //   9471: ldc2_w -340758589
    //   9474: l2i
    //   9475: ldc_w 725986518
    //   9478: ixor
    //   9479: ixor
    //   9480: lookupswitch default -> 9508, -1523892060 -> 9463, 2070771835 -> 35471
    //   9508: goto -> 9512
    //   9511: athrow
    //   9512: invokestatic func_147046_a : (IIIFFLnet/minecraft/entity/EntityLivingBase;)V
    //   9515: goto -> 9519
    //   9518: athrow
    //   9519: goto -> 9723
    //   9522: getstatic Perryc.1 : I
    //   9525: ifeq -> 9539
    //   9528: ldc2_w -1531792671
    //   9531: l2i
    //   9532: ldc_w 803936050
    //   9535: ixor
    //   9536: goto -> 9547
    //   9539: ldc2_w -544280107
    //   9542: l2i
    //   9543: ldc_w -22791293
    //   9546: ixor
    //   9547: ldc2_w -1839176824
    //   9550: l2i
    //   9551: ldc_w -1149104546
    //   9554: ixor
    //   9555: ixor
    //   9556: lookupswitch default -> 34725, -1564751867 -> 9539, 147367808 -> 9584
    //   9584: astore #5
    //   9586: getstatic Perryc.1 : I
    //   9589: ifeq -> 9603
    //   9592: ldc2_w -1037063797
    //   9595: l2i
    //   9596: ldc_w -1493453421
    //   9599: ixor
    //   9600: goto -> 9611
    //   9603: ldc2_w -116769569
    //   9606: l2i
    //   9607: ldc_w -588780687
    //   9610: ixor
    //   9611: ldc2_w 1779438945
    //   9614: l2i
    //   9615: ldc_w 2120892859
    //   9618: ixor
    //   9619: ixor
    //   9620: lookupswitch default -> 35093, 832013172 -> 9648, 1890470082 -> 9603
    //   9648: aload #5
    //   9650: getstatic Perryc.1 : I
    //   9653: ifeq -> 9667
    //   9656: ldc2_w 1722747324
    //   9659: l2i
    //   9660: ldc_w -864727125
    //   9663: ixor
    //   9664: goto -> 9675
    //   9667: ldc2_w 1162814655
    //   9670: l2i
    //   9671: ldc_w 1855985393
    //   9674: ixor
    //   9675: ldc2_w 594666429
    //   9678: l2i
    //   9679: ldc_w -489091563
    //   9682: ixor
    //   9683: ixor
    //   9684: lookupswitch default -> 34753, -364388378 -> 9712, 1802677183 -> 9667
    //   9712: goto -> 9716
    //   9715: athrow
    //   9716: invokevirtual printStackTrace : ()V
    //   9719: goto -> 9723
    //   9722: athrow
    //   9723: getstatic Perryc.1 : I
    //   9726: ifeq -> 9740
    //   9729: ldc2_w -123816848
    //   9732: l2i
    //   9733: ldc_w -463608940
    //   9736: ixor
    //   9737: goto -> 9748
    //   9740: ldc2_w 613595078
    //   9743: l2i
    //   9744: ldc_w 1803666272
    //   9747: ixor
    //   9748: ldc2_w -188462079
    //   9751: l2i
    //   9752: ldc_w -2123694076
    //   9755: ixor
    //   9756: ixor
    //   9757: lookupswitch default -> 34929, 985413795 -> 9784, 1768692705 -> 9740
    //   9784: aload #4
    //   9786: getstatic Perryc.c : I
    //   9789: iflt -> 9803
    //   9792: ldc2_w -1629737162
    //   9795: l2i
    //   9796: ldc_w 44913799
    //   9799: ixor
    //   9800: goto -> 9811
    //   9803: ldc2_w 345265775
    //   9806: l2i
    //   9807: ldc_w -1766763787
    //   9810: ixor
    //   9811: ldc2_w 1260887395
    //   9814: l2i
    //   9815: ldc_w -960797050
    //   9818: ixor
    //   9819: ixor
    //   9820: lookupswitch default -> 9848, 300777556 -> 34731, 1191858270 -> 9803
    //   9848: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   9851: getstatic Perryc.1 : I
    //   9854: ifeq -> 9868
    //   9857: ldc2_w 302192144
    //   9860: l2i
    //   9861: ldc_w -872014852
    //   9864: ixor
    //   9865: goto -> 9876
    //   9868: ldc2_w 514441977
    //   9871: l2i
    //   9872: ldc_w -1668783661
    //   9875: ixor
    //   9876: ldc2_w -348907698
    //   9879: l2i
    //   9880: ldc_w -680605338
    //   9883: ixor
    //   9884: ixor
    //   9885: lookupswitch default -> 9912, -497036348 -> 35221, 228853410 -> 9868
    //   9912: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9915: getstatic Perryc.1 : I
    //   9918: ifeq -> 9932
    //   9921: ldc2_w -1864378502
    //   9924: l2i
    //   9925: ldc_w 2001594505
    //   9928: ixor
    //   9929: goto -> 9940
    //   9932: ldc2_w -649415920
    //   9935: l2i
    //   9936: ldc_w -410387489
    //   9939: ixor
    //   9940: ldc2_w -1629090883
    //   9943: l2i
    //   9944: ldc_w -2102839418
    //   9947: ixor
    //   9948: ixor
    //   9949: lookupswitch default -> 35481, -69401656 -> 9932, 579630324 -> 9976
    //   9976: goto -> 9980
    //   9979: athrow
    //   9980: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   9983: goto -> 9987
    //   9986: athrow
    //   9987: f2i
    //   9988: getstatic Perryc.1 : I
    //   9991: ifeq -> 10005
    //   9994: ldc2_w -1086991001
    //   9997: l2i
    //   9998: ldc_w 1834936513
    //   10001: ixor
    //   10002: goto -> 10013
    //   10005: ldc2_w 37941836
    //   10008: l2i
    //   10009: ldc_w 488674323
    //   10012: ixor
    //   10013: ldc2_w 555063444
    //   10016: l2i
    //   10017: ldc_w -162060243
    //   10020: ixor
    //   10021: ixor
    //   10022: lookupswitch default -> 10048, -45213324 -> 10005, 86609183 -> 34767
    //   10048: istore #5
    //   10050: getstatic Perryc.0 : I
    //   10053: ifle -> 10067
    //   10056: ldc2_w 939186296
    //   10059: l2i
    //   10060: ldc_w 705003131
    //   10063: ixor
    //   10064: goto -> 10075
    //   10067: ldc2_w 482496263
    //   10070: l2i
    //   10071: ldc_w -1456212091
    //   10074: ixor
    //   10075: ldc2_w 1377495592
    //   10078: l2i
    //   10079: ldc_w 1501359369
    //   10082: ixor
    //   10083: ixor
    //   10084: lookupswitch default -> 35463, -1097351261 -> 10112, 379167010 -> 10067
    //   10112: goto -> 10116
    //   10115: athrow
    //   10116: invokestatic func_179091_B : ()V
    //   10119: goto -> 10123
    //   10122: athrow
    //   10123: getstatic Perryc.0 : I
    //   10126: ifle -> 10140
    //   10129: ldc2_w -1917833752
    //   10132: l2i
    //   10133: ldc_w -1483712484
    //   10136: ixor
    //   10137: goto -> 10148
    //   10140: ldc2_w -1206027208
    //   10143: l2i
    //   10144: ldc_w 260110181
    //   10147: ixor
    //   10148: ldc2_w 472864812
    //   10151: l2i
    //   10152: ldc_w -536155409
    //   10155: ixor
    //   10156: ixor
    //   10157: lookupswitch default -> 34957, -704264393 -> 10140, 1270364574 -> 10184
    //   10184: goto -> 10188
    //   10187: athrow
    //   10188: invokestatic func_179098_w : ()V
    //   10191: goto -> 10195
    //   10194: athrow
    //   10195: getstatic Perryc.c : I
    //   10198: iflt -> 10212
    //   10201: ldc2_w -934755156
    //   10204: l2i
    //   10205: ldc_w 374061911
    //   10208: ixor
    //   10209: goto -> 10220
    //   10212: ldc2_w 492472404
    //   10215: l2i
    //   10216: ldc_w -1871839511
    //   10219: ixor
    //   10220: ldc2_w 1895269375
    //   10223: l2i
    //   10224: ldc_w -1967424394
    //   10227: ixor
    //   10228: ixor
    //   10229: lookupswitch default -> 35195, 609190002 -> 10212, 2004584756 -> 10256
    //   10256: goto -> 10260
    //   10259: athrow
    //   10260: invokestatic func_179147_l : ()V
    //   10263: goto -> 10267
    //   10266: athrow
    //   10267: ldc2_w -2054886690
    //   10270: l2i
    //   10271: ldc_w -2054886948
    //   10274: ixor
    //   10275: ldc2_w 170499528
    //   10278: l2i
    //   10279: ldc_w 170499787
    //   10282: ixor
    //   10283: ldc2_w -1043656690
    //   10286: l2i
    //   10287: ldc_w -1043656689
    //   10290: ixor
    //   10291: ldc2_w 2037664747
    //   10294: l2i
    //   10295: ldc_w 2037664747
    //   10298: ixor
    //   10299: getstatic Perryc.0 : I
    //   10302: ifle -> 10316
    //   10305: ldc2_w -1081206638
    //   10308: l2i
    //   10309: ldc_w -606733464
    //   10312: ixor
    //   10313: goto -> 10324
    //   10316: ldc2_w 1851876036
    //   10319: l2i
    //   10320: ldc_w 1891646527
    //   10323: ixor
    //   10324: ldc2_w 270707023
    //   10327: l2i
    //   10328: ldc_w 1820290343
    //   10331: ixor
    //   10332: ixor
    //   10333: lookupswitch default -> 34777, 403056530 -> 10316, 1660721811 -> 10360
    //   10360: goto -> 10364
    //   10363: athrow
    //   10364: invokestatic func_179120_a : (IIII)V
    //   10367: goto -> 10371
    //   10370: athrow
    //   10371: getstatic Perryc.0 : I
    //   10374: ifle -> 10388
    //   10377: ldc2_w -653260681
    //   10380: l2i
    //   10381: ldc_w 1923834058
    //   10384: ixor
    //   10385: goto -> 10396
    //   10388: ldc2_w 1296494897
    //   10391: l2i
    //   10392: ldc_w 1633688274
    //   10395: ixor
    //   10396: ldc2_w -658637343
    //   10399: l2i
    //   10400: ldc_w 2014265125
    //   10403: ixor
    //   10404: ixor
    //   10405: lookupswitch default -> 10432, 185182841 -> 34793, 1021004152 -> 10388
    //   10432: aload_0
    //   10433: getstatic Perryc.0 : I
    //   10436: ifle -> 10450
    //   10439: ldc2_w 1096727245
    //   10442: l2i
    //   10443: ldc_w 2119838713
    //   10446: ixor
    //   10447: goto -> 10458
    //   10450: ldc2_w -1763550029
    //   10453: l2i
    //   10454: ldc_w 293438370
    //   10457: ixor
    //   10458: ldc2_w 1198945622
    //   10461: l2i
    //   10462: ldc_w 83429878
    //   10465: ixor
    //   10466: ixor
    //   10467: lookupswitch default -> 34897, -1005542479 -> 10492, 2089545108 -> 10450
    //   10492: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   10495: getstatic Perryc.c : I
    //   10498: iflt -> 10512
    //   10501: ldc2_w 865012219
    //   10504: l2i
    //   10505: ldc_w 865864671
    //   10508: ixor
    //   10509: goto -> 10520
    //   10512: ldc2_w -1675456920
    //   10515: l2i
    //   10516: ldc_w -761997266
    //   10519: ixor
    //   10520: ldc2_w -204951469
    //   10523: l2i
    //   10524: ldc_w 2143531459
    //   10527: ixor
    //   10528: ixor
    //   10529: lookupswitch default -> 10556, -1944583244 -> 35593, 1263347508 -> 10512
    //   10556: aload #4
    //   10558: getstatic Perryc.1 : I
    //   10561: ifeq -> 10575
    //   10564: ldc2_w -207084172
    //   10567: l2i
    //   10568: ldc_w -1879152024
    //   10571: ixor
    //   10572: goto -> 10583
    //   10575: ldc2_w 473133659
    //   10578: l2i
    //   10579: ldc_w -399362191
    //   10582: ixor
    //   10583: ldc2_w -1775562357
    //   10586: l2i
    //   10587: ldc_w -1333218882
    //   10590: ixor
    //   10591: ixor
    //   10592: lookupswitch default -> 10620, -95647107 -> 10575, 1526066985 -> 35553
    //   10620: goto -> 10624
    //   10623: athrow
    //   10624: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   10627: goto -> 10631
    //   10630: athrow
    //   10631: getstatic Perryc.c : I
    //   10634: iflt -> 10648
    //   10637: ldc2_w -967861828
    //   10640: l2i
    //   10641: ldc_w -2139525448
    //   10644: ixor
    //   10645: goto -> 10656
    //   10648: ldc2_w 890926521
    //   10651: l2i
    //   10652: ldc_w 275866267
    //   10655: ixor
    //   10656: ldc2_w 1312972896
    //   10659: l2i
    //   10660: ldc_w 1442157217
    //   10663: ixor
    //   10664: ixor
    //   10665: lookupswitch default -> 34833, 1054664163 -> 10692, 1568736709 -> 10648
    //   10692: aload_0
    //   10693: getstatic Perryc.c : I
    //   10696: iflt -> 10710
    //   10699: ldc2_w -596436440
    //   10702: l2i
    //   10703: ldc_w 2012587466
    //   10706: ixor
    //   10707: goto -> 10718
    //   10710: ldc2_w 427865026
    //   10713: l2i
    //   10714: ldc_w 2092669939
    //   10717: ixor
    //   10718: ldc2_w -24202886
    //   10721: l2i
    //   10722: ldc_w 1674244604
    //   10725: ixor
    //   10726: ixor
    //   10727: lookupswitch default -> 34729, -125867849 -> 10752, 918749028 -> 10710
    //   10752: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10755: getstatic Perryc.0 : I
    //   10758: ifle -> 10772
    //   10761: ldc2_w 1054992072
    //   10764: l2i
    //   10765: ldc_w -2108798234
    //   10768: ixor
    //   10769: goto -> 10780
    //   10772: ldc2_w 920865844
    //   10775: l2i
    //   10776: ldc_w 776533685
    //   10779: ixor
    //   10780: ldc2_w 364786003
    //   10783: l2i
    //   10784: ldc_w 871084335
    //   10787: ixor
    //   10788: ixor
    //   10789: lookupswitch default -> 10816, -1694880686 -> 35425, 989938266 -> 10772
    //   10816: goto -> 10820
    //   10819: athrow
    //   10820: invokevirtual getValue : ()Ljava/lang/Object;
    //   10823: goto -> 10827
    //   10826: athrow
    //   10827: checkcast java/lang/Integer
    //   10830: getstatic Perryc.0 : I
    //   10833: ifle -> 10847
    //   10836: ldc2_w 499780119
    //   10839: l2i
    //   10840: ldc_w -840505416
    //   10843: ixor
    //   10844: goto -> 10855
    //   10847: ldc2_w -784610296
    //   10850: l2i
    //   10851: ldc_w 38801937
    //   10854: ixor
    //   10855: ldc2_w -993606776
    //   10858: l2i
    //   10859: ldc_w 1572664176
    //   10862: ixor
    //   10863: ixor
    //   10864: lookupswitch default -> 35387, 1230429527 -> 10847, 1242689249 -> 10892
    //   10892: goto -> 10896
    //   10895: athrow
    //   10896: invokevirtual intValue : ()I
    //   10899: goto -> 10903
    //   10902: athrow
    //   10903: ldc2_w -1890437777
    //   10906: l2i
    //   10907: ldc_w -1890437805
    //   10910: ixor
    //   10911: iadd
    //   10912: i2f
    //   10913: getstatic Perryc.1 : I
    //   10916: ifeq -> 10930
    //   10919: ldc2_w -764691697
    //   10922: l2i
    //   10923: ldc_w 991966466
    //   10926: ixor
    //   10927: goto -> 10938
    //   10930: ldc2_w 1857282426
    //   10933: l2i
    //   10934: ldc_w 1150276279
    //   10937: ixor
    //   10938: ldc2_w 1920913065
    //   10941: l2i
    //   10942: ldc_w -1096831917
    //   10945: ixor
    //   10946: ixor
    //   10947: lookupswitch default -> 10972, 631958775 -> 34865, 861491624 -> 10930
    //   10972: aload_0
    //   10973: getstatic Perryc.1 : I
    //   10976: ifeq -> 10990
    //   10979: ldc2_w -109968423
    //   10982: l2i
    //   10983: ldc_w -1632558170
    //   10986: ixor
    //   10987: goto -> 10998
    //   10990: ldc2_w 1447177520
    //   10993: l2i
    //   10994: ldc_w 232416329
    //   10997: ixor
    //   10998: ldc2_w 1632749440
    //   11001: l2i
    //   11002: ldc_w 498936221
    //   11005: ixor
    //   11006: ixor
    //   11007: lookupswitch default -> 11032, 170848795 -> 10990, 456117858 -> 35261
    //   11032: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11035: getstatic Perryc.c : I
    //   11038: iflt -> 11052
    //   11041: ldc2_w -1202961402
    //   11044: l2i
    //   11045: ldc_w 764923148
    //   11048: ixor
    //   11049: goto -> 11060
    //   11052: ldc2_w -323997750
    //   11055: l2i
    //   11056: ldc_w -148870724
    //   11059: ixor
    //   11060: ldc2_w -1904592804
    //   11063: l2i
    //   11064: ldc_w -620130303
    //   11067: ixor
    //   11068: ixor
    //   11069: lookupswitch default -> 11096, -1971594520 -> 11052, -1062723241 -> 34807
    //   11096: goto -> 11100
    //   11099: athrow
    //   11100: invokevirtual getValue : ()Ljava/lang/Object;
    //   11103: goto -> 11107
    //   11106: athrow
    //   11107: checkcast java/lang/Integer
    //   11110: getstatic Perryc.0 : I
    //   11113: ifle -> 11127
    //   11116: ldc2_w -1443396998
    //   11119: l2i
    //   11120: ldc_w -1131779830
    //   11123: ixor
    //   11124: goto -> 11135
    //   11127: ldc2_w -1890658660
    //   11130: l2i
    //   11131: ldc_w 1072246969
    //   11134: ixor
    //   11135: ldc2_w -1496670803
    //   11138: l2i
    //   11139: ldc_w 1875705658
    //   11142: ixor
    //   11143: ixor
    //   11144: lookupswitch default -> 35523, -595883545 -> 11127, 2040628402 -> 11172
    //   11172: goto -> 11176
    //   11175: athrow
    //   11176: invokevirtual intValue : ()I
    //   11179: goto -> 11183
    //   11182: athrow
    //   11183: ldc2_w 2126853888
    //   11186: l2i
    //   11187: ldc_w 2126853898
    //   11190: ixor
    //   11191: iadd
    //   11192: i2f
    //   11193: ldc2_w -522264128
    //   11196: l2i
    //   11197: ldc_w -522264257
    //   11200: ixor
    //   11201: ldc2_w 1530572246
    //   11204: l2i
    //   11205: ldc_w 1530572073
    //   11208: ixor
    //   11209: ldc2_w -2089709641
    //   11212: l2i
    //   11213: ldc_w -2089709752
    //   11216: ixor
    //   11217: ldc2_w 1307036313
    //   11220: l2i
    //   11221: ldc_w 1307036262
    //   11224: ixor
    //   11225: getstatic Perryc.c : I
    //   11228: iflt -> 11242
    //   11231: ldc2_w 1197444204
    //   11234: l2i
    //   11235: ldc_w 1525510119
    //   11238: ixor
    //   11239: goto -> 11250
    //   11242: ldc2_w 1335168137
    //   11245: l2i
    //   11246: ldc_w 631429893
    //   11249: ixor
    //   11250: ldc2_w 580767382
    //   11253: l2i
    //   11254: ldc_w 446108617
    //   11257: ixor
    //   11258: ixor
    //   11259: lookupswitch default -> 34947, 632831700 -> 11242, 1379732179 -> 11284
    //   11284: goto -> 11288
    //   11287: athrow
    //   11288: invokestatic toRGBA : (IIII)I
    //   11291: goto -> 11295
    //   11294: athrow
    //   11295: getstatic Perryc.c : I
    //   11298: iflt -> 11312
    //   11301: ldc2_w 335374972
    //   11304: l2i
    //   11305: ldc_w 1091695083
    //   11308: ixor
    //   11309: goto -> 11320
    //   11312: ldc2_w -820722045
    //   11315: l2i
    //   11316: ldc_w 117407780
    //   11319: ixor
    //   11320: ldc2_w 1246514689
    //   11323: l2i
    //   11324: ldc_w -2124177221
    //   11327: ixor
    //   11328: ixor
    //   11329: lookupswitch default -> 35509, -1715243731 -> 11312, 46442525 -> 11356
    //   11356: goto -> 11360
    //   11359: athrow
    //   11360: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   11363: goto -> 11367
    //   11366: athrow
    //   11367: getstatic Perryc.1 : I
    //   11370: ifeq -> 11384
    //   11373: ldc2_w -595154898
    //   11376: l2i
    //   11377: ldc_w -1008276498
    //   11380: ixor
    //   11381: goto -> 11392
    //   11384: ldc2_w -2027626040
    //   11387: l2i
    //   11388: ldc_w 373537444
    //   11391: ixor
    //   11392: ldc2_w -993729068
    //   11395: l2i
    //   11396: ldc_w -1785398594
    //   11399: ixor
    //   11400: ixor
    //   11401: lookupswitch default -> 11428, 1311792298 -> 34971, 1786099442 -> 11384
    //   11428: aload #4
    //   11430: getstatic Perryc.1 : I
    //   11433: ifeq -> 11447
    //   11436: ldc2_w 324924481
    //   11439: l2i
    //   11440: ldc_w 1662279403
    //   11443: ixor
    //   11444: goto -> 11455
    //   11447: ldc2_w 1712902643
    //   11450: l2i
    //   11451: ldc_w -607936406
    //   11454: ixor
    //   11455: ldc2_w 504463691
    //   11458: l2i
    //   11459: ldc_w -332080500
    //   11462: ixor
    //   11463: ixor
    //   11464: lookupswitch default -> 35173, -2106789523 -> 11447, 1342057054 -> 11492
    //   11492: goto -> 11496
    //   11495: athrow
    //   11496: invokestatic isInHole : (Lnet/minecraft/entity/Entity;)Z
    //   11499: goto -> 11503
    //   11502: athrow
    //   11503: ifne -> 11517
    //   11506: ldc2_w 788799744
    //   11509: l2i
    //   11510: ldc_w 7881548
    //   11513: ixor
    //   11514: goto -> 11525
    //   11517: ldc2_w -1078026101
    //   11520: l2i
    //   11521: ldc_w -1866284348
    //   11524: ixor
    //   11525: ldc2_w 635698121
    //   11528: l2i
    //   11529: ldc_w 1044226684
    //   11532: ixor
    //   11533: ixor
    //   11534: tableswitch default -> 11506, 883047417 -> 11556, 883047418 -> 13382
    //   11556: ldc_w '냃㌆낑ꬂ결幈๻쵔ᣖ'
    //   11559: getstatic Perryc.c : I
    //   11562: iflt -> 11576
    //   11565: ldc2_w 2004079716
    //   11568: l2i
    //   11569: ldc_w 212497017
    //   11572: ixor
    //   11573: goto -> 11584
    //   11576: ldc2_w -1627787228
    //   11579: l2i
    //   11580: ldc_w -1791681962
    //   11583: ixor
    //   11584: ldc2_w -1247721459
    //   11587: l2i
    //   11588: ldc_w -774356084
    //   11591: ixor
    //   11592: ixor
    //   11593: lookupswitch default -> 11620, -341809634 -> 11576, 530623900 -> 34989
    //   11620: goto -> 11624
    //   11623: athrow
    //   11624: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11627: goto -> 11631
    //   11630: athrow
    //   11631: getstatic Perryc.1 : I
    //   11634: ifeq -> 11648
    //   11637: ldc2_w 2142119725
    //   11640: l2i
    //   11641: ldc_w -1296330693
    //   11644: ixor
    //   11645: goto -> 11656
    //   11648: ldc2_w 602276608
    //   11651: l2i
    //   11652: ldc_w -501617766
    //   11655: ixor
    //   11656: ldc2_w -581890823
    //   11659: l2i
    //   11660: ldc_w 2140291447
    //   11663: ixor
    //   11664: ixor
    //   11665: lookupswitch default -> 11692, 265977912 -> 11648, 1876359832 -> 34995
    //   11692: astore #6
    //   11694: ldc2_w -1298831009
    //   11697: l2i
    //   11698: ldc_w -1298830944
    //   11701: ixor
    //   11702: ldc2_w 1965330931
    //   11705: l2i
    //   11706: ldc_w 1965330931
    //   11709: ixor
    //   11710: ldc2_w -1499820182
    //   11713: l2i
    //   11714: ldc_w -1499820182
    //   11717: ixor
    //   11718: ldc2_w -1705842405
    //   11721: l2i
    //   11722: ldc_w -1705842204
    //   11725: ixor
    //   11726: getstatic Perryc.0 : I
    //   11729: ifle -> 11743
    //   11732: ldc2_w -364803703
    //   11735: l2i
    //   11736: ldc_w -1047061478
    //   11739: ixor
    //   11740: goto -> 11751
    //   11743: ldc2_w -674768679
    //   11746: l2i
    //   11747: ldc_w -420940608
    //   11750: ixor
    //   11751: ldc2_w 315881384
    //   11754: l2i
    //   11755: ldc_w 1076545700
    //   11758: ixor
    //   11759: ixor
    //   11760: lookupswitch default -> 11788, -1075427353 -> 11743, 2033167007 -> 35235
    //   11788: goto -> 11792
    //   11791: athrow
    //   11792: invokestatic toRGBA : (IIII)I
    //   11795: goto -> 11799
    //   11798: athrow
    //   11799: getstatic Perryc.1 : I
    //   11802: ifeq -> 11816
    //   11805: ldc2_w 1869855325
    //   11808: l2i
    //   11809: ldc_w -933912531
    //   11812: ixor
    //   11813: goto -> 11824
    //   11816: ldc2_w -379337016
    //   11819: l2i
    //   11820: ldc_w 974614993
    //   11823: ixor
    //   11824: ldc2_w -2121842160
    //   11827: l2i
    //   11828: ldc_w 632643787
    //   11831: ixor
    //   11832: ixor
    //   11833: lookupswitch default -> 11860, -124573907 -> 11816, 51656875 -> 35315
    //   11860: istore #7
    //   11862: getstatic Perryc.0 : I
    //   11865: ifle -> 11879
    //   11868: ldc2_w 550196712
    //   11871: l2i
    //   11872: ldc_w 1020570717
    //   11875: ixor
    //   11876: goto -> 11887
    //   11879: ldc2_w 1892313075
    //   11882: l2i
    //   11883: ldc_w 1673539690
    //   11886: ixor
    //   11887: ldc2_w -2018923419
    //   11890: l2i
    //   11891: ldc_w -11682855
    //   11894: ixor
    //   11895: ixor
    //   11896: lookupswitch default -> 35183, 1694232073 -> 11879, 1810776101 -> 11924
    //   11924: aload_0
    //   11925: getstatic Perryc.c : I
    //   11928: iflt -> 11942
    //   11931: ldc2_w -471047820
    //   11934: l2i
    //   11935: ldc_w -2094457365
    //   11938: ixor
    //   11939: goto -> 11950
    //   11942: ldc2_w -317150377
    //   11945: l2i
    //   11946: ldc_w -1064254247
    //   11949: ixor
    //   11950: ldc2_w 1946056176
    //   11953: l2i
    //   11954: ldc_w -328910653
    //   11957: ixor
    //   11958: ixor
    //   11959: lookupswitch default -> 11984, -10604116 -> 34735, 351995899 -> 11942
    //   11984: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   11987: new java/lang/StringBuilder
    //   11990: dup
    //   11991: getstatic Perryc.c : I
    //   11994: iflt -> 12008
    //   11997: ldc2_w 1560833057
    //   12000: l2i
    //   12001: ldc_w -1426620364
    //   12004: ixor
    //   12005: goto -> 12016
    //   12008: ldc2_w 137874900
    //   12011: l2i
    //   12012: ldc_w 190545066
    //   12015: ixor
    //   12016: ldc2_w 1793636504
    //   12019: l2i
    //   12020: ldc_w -1790157286
    //   12023: ixor
    //   12024: ixor
    //   12025: lookupswitch default -> 12052, 140184215 -> 35559, 715267457 -> 12008
    //   12052: goto -> 12056
    //   12055: athrow
    //   12056: invokespecial <init> : ()V
    //   12059: goto -> 12063
    //   12062: athrow
    //   12063: ldc_w ''
    //   12066: getstatic Perryc.0 : I
    //   12069: ifle -> 12083
    //   12072: ldc2_w 988922330
    //   12075: l2i
    //   12076: ldc_w -145745090
    //   12079: ixor
    //   12080: goto -> 12091
    //   12083: ldc2_w -1841625207
    //   12086: l2i
    //   12087: ldc_w 1489614145
    //   12090: ixor
    //   12091: ldc2_w 1206633923
    //   12094: l2i
    //   12095: ldc_w 1717291845
    //   12098: ixor
    //   12099: ixor
    //   12100: lookupswitch default -> 34853, -347947954 -> 12128, -334375838 -> 12083
    //   12128: goto -> 12132
    //   12131: athrow
    //   12132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12135: goto -> 12139
    //   12138: athrow
    //   12139: getstatic Perryc.1 : I
    //   12142: ifeq -> 12156
    //   12145: ldc2_w 2019378583
    //   12148: l2i
    //   12149: ldc_w -851892671
    //   12152: ixor
    //   12153: goto -> 12164
    //   12156: ldc2_w -1661569722
    //   12159: l2i
    //   12160: ldc_w 1070474945
    //   12163: ixor
    //   12164: ldc2_w 1544642847
    //   12167: l2i
    //   12168: ldc_w 922223094
    //   12171: ixor
    //   12172: ixor
    //   12173: lookupswitch default -> 12200, -544406721 -> 34717, -420796518 -> 12156
    //   12200: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   12203: getstatic Perryc.c : I
    //   12206: iflt -> 12220
    //   12209: ldc2_w 1062795808
    //   12212: l2i
    //   12213: ldc_w 2123403437
    //   12216: ixor
    //   12217: goto -> 12228
    //   12220: ldc2_w 1011713983
    //   12223: l2i
    //   12224: ldc_w -1477986810
    //   12227: ixor
    //   12228: ldc2_w -1101080788
    //   12231: l2i
    //   12232: ldc_w -1735596874
    //   12235: ixor
    //   12236: ixor
    //   12237: lookupswitch default -> 35411, -1116208605 -> 12264, 1729779991 -> 12220
    //   12264: goto -> 12268
    //   12267: athrow
    //   12268: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   12271: goto -> 12275
    //   12274: athrow
    //   12275: getstatic Perryc.1 : I
    //   12278: ifeq -> 12292
    //   12281: ldc2_w -1031373853
    //   12284: l2i
    //   12285: ldc_w 201221716
    //   12288: ixor
    //   12289: goto -> 12300
    //   12292: ldc2_w 303034002
    //   12295: l2i
    //   12296: ldc_w -1605382245
    //   12299: ixor
    //   12300: ldc2_w -495350142
    //   12303: l2i
    //   12304: ldc_w -1369445318
    //   12307: ixor
    //   12308: ixor
    //   12309: lookupswitch default -> 12336, -2057404657 -> 35031, 1591551393 -> 12292
    //   12336: aload #6
    //   12338: getstatic Perryc.c : I
    //   12341: iflt -> 12355
    //   12344: ldc2_w -513628440
    //   12347: l2i
    //   12348: ldc_w 1932472426
    //   12351: ixor
    //   12352: goto -> 12363
    //   12355: ldc2_w 1615280925
    //   12358: l2i
    //   12359: ldc_w 2050063329
    //   12362: ixor
    //   12363: ldc2_w 804439635
    //   12366: l2i
    //   12367: ldc_w 1713245390
    //   12370: ixor
    //   12371: ixor
    //   12372: lookupswitch default -> 35379, -610182113 -> 12355, 1402636897 -> 12400
    //   12400: goto -> 12404
    //   12403: athrow
    //   12404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12407: goto -> 12411
    //   12410: athrow
    //   12411: getstatic Perryc.0 : I
    //   12414: ifle -> 12428
    //   12417: ldc2_w 1214142830
    //   12420: l2i
    //   12421: ldc_w -1253458865
    //   12424: ixor
    //   12425: goto -> 12436
    //   12428: ldc2_w -553546464
    //   12431: l2i
    //   12432: ldc_w 169197778
    //   12435: ixor
    //   12436: ldc2_w 783588465
    //   12439: l2i
    //   12440: ldc_w -1800674348
    //   12443: ixor
    //   12444: ixor
    //   12445: lookupswitch default -> 35023, 1191746180 -> 12428, 1863004759 -> 12472
    //   12472: goto -> 12476
    //   12475: athrow
    //   12476: invokevirtual toString : ()Ljava/lang/String;
    //   12479: goto -> 12483
    //   12482: athrow
    //   12483: getstatic Perryc.0 : I
    //   12486: ifle -> 12500
    //   12489: ldc2_w 1182239963
    //   12492: l2i
    //   12493: ldc_w -230076569
    //   12496: ixor
    //   12497: goto -> 12508
    //   12500: ldc2_w -836820578
    //   12503: l2i
    //   12504: ldc_w -1671954732
    //   12507: ixor
    //   12508: ldc2_w 2091014215
    //   12511: l2i
    //   12512: ldc_w -150294165
    //   12515: ixor
    //   12516: ixor
    //   12517: lookupswitch default -> 35193, -639617434 -> 12544, 1066805904 -> 12500
    //   12544: aload_0
    //   12545: getstatic Perryc.0 : I
    //   12548: ifle -> 12562
    //   12551: ldc2_w 1505265425
    //   12554: l2i
    //   12555: ldc_w -1382883205
    //   12558: ixor
    //   12559: goto -> 12570
    //   12562: ldc2_w -1744267906
    //   12565: l2i
    //   12566: ldc_w -609311
    //   12569: ixor
    //   12570: ldc2_w 409716092
    //   12573: l2i
    //   12574: ldc_w -2088887669
    //   12577: ixor
    //   12578: ixor
    //   12579: lookupswitch default -> 35435, -51644056 -> 12604, 1866447005 -> 12562
    //   12604: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12607: getstatic Perryc.0 : I
    //   12610: ifle -> 12624
    //   12613: ldc2_w -601884162
    //   12616: l2i
    //   12617: ldc_w -1180776626
    //   12620: ixor
    //   12621: goto -> 12632
    //   12624: ldc2_w 2048511913
    //   12627: l2i
    //   12628: ldc_w 1939966297
    //   12631: ixor
    //   12632: ldc2_w -1716117788
    //   12635: l2i
    //   12636: ldc_w -433937418
    //   12639: ixor
    //   12640: ixor
    //   12641: lookupswitch default -> 12668, -1482107142 -> 12624, 437617570 -> 34933
    //   12668: goto -> 12672
    //   12671: athrow
    //   12672: invokevirtual getValue : ()Ljava/lang/Object;
    //   12675: goto -> 12679
    //   12678: athrow
    //   12679: checkcast java/lang/Integer
    //   12682: getstatic Perryc.c : I
    //   12685: iflt -> 12699
    //   12688: ldc2_w -583176675
    //   12691: l2i
    //   12692: ldc_w -363190376
    //   12695: ixor
    //   12696: goto -> 12707
    //   12699: ldc2_w -602363189
    //   12702: l2i
    //   12703: ldc_w -2124621479
    //   12706: ixor
    //   12707: ldc2_w -1402617850
    //   12710: l2i
    //   12711: ldc_w 578022890
    //   12714: ixor
    //   12715: ixor
    //   12716: lookupswitch default -> 34707, -1183751063 -> 12699, -749576578 -> 12744
    //   12744: goto -> 12748
    //   12747: athrow
    //   12748: invokevirtual intValue : ()I
    //   12751: goto -> 12755
    //   12754: athrow
    //   12755: ldc2_w 1483799158
    //   12758: l2i
    //   12759: ldc_w 1483799114
    //   12762: ixor
    //   12763: iadd
    //   12764: i2f
    //   12765: getstatic Perryc.1 : I
    //   12768: ifeq -> 12782
    //   12771: ldc2_w 1469146383
    //   12774: l2i
    //   12775: ldc_w 84564868
    //   12778: ixor
    //   12779: goto -> 12790
    //   12782: ldc2_w 52568684
    //   12785: l2i
    //   12786: ldc_w 1256932898
    //   12789: ixor
    //   12790: ldc2_w 771677805
    //   12793: l2i
    //   12794: ldc_w 1418891710
    //   12797: ixor
    //   12798: ixor
    //   12799: lookupswitch default -> 12824, -998716698 -> 12782, 737636696 -> 35215
    //   12824: aload_0
    //   12825: getstatic Perryc.1 : I
    //   12828: ifeq -> 12842
    //   12831: ldc2_w 1796119271
    //   12834: l2i
    //   12835: ldc_w -809622428
    //   12838: ixor
    //   12839: goto -> 12850
    //   12842: ldc2_w 370239997
    //   12845: l2i
    //   12846: ldc_w 679938860
    //   12849: ixor
    //   12850: ldc2_w 1753671880
    //   12853: l2i
    //   12854: ldc_w -1228512601
    //   12857: ixor
    //   12858: ixor
    //   12859: lookupswitch default -> 12884, -329917685 -> 12842, 2062562540 -> 34913
    //   12884: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12887: getstatic Perryc.c : I
    //   12890: iflt -> 12904
    //   12893: ldc2_w 686029336
    //   12896: l2i
    //   12897: ldc_w -1174018271
    //   12900: ixor
    //   12901: goto -> 12912
    //   12904: ldc2_w 763086515
    //   12907: l2i
    //   12908: ldc_w -706303365
    //   12911: ixor
    //   12912: ldc2_w 643957559
    //   12915: l2i
    //   12916: ldc_w -422618403
    //   12919: ixor
    //   12920: ixor
    //   12921: lookupswitch default -> 12948, 1297222820 -> 12904, 1380664531 -> 34867
    //   12948: goto -> 12952
    //   12951: athrow
    //   12952: invokevirtual getValue : ()Ljava/lang/Object;
    //   12955: goto -> 12959
    //   12958: athrow
    //   12959: checkcast java/lang/Integer
    //   12962: getstatic Perryc.0 : I
    //   12965: ifle -> 12979
    //   12968: ldc2_w -1945244975
    //   12971: l2i
    //   12972: ldc_w 716380821
    //   12975: ixor
    //   12976: goto -> 12987
    //   12979: ldc2_w 1595858251
    //   12982: l2i
    //   12983: ldc_w -586054703
    //   12986: ixor
    //   12987: ldc2_w 1664362295
    //   12990: l2i
    //   12991: ldc_w 418641232
    //   12994: ixor
    //   12995: ixor
    //   12996: lookupswitch default -> 35223, -579263965 -> 12979, -104297219 -> 13024
    //   13024: goto -> 13028
    //   13027: athrow
    //   13028: invokevirtual intValue : ()I
    //   13031: goto -> 13035
    //   13034: athrow
    //   13035: getstatic Perryc.1 : I
    //   13038: ifeq -> 13052
    //   13041: ldc2_w 273651869
    //   13044: l2i
    //   13045: ldc_w -61294534
    //   13048: ixor
    //   13049: goto -> 13060
    //   13052: ldc2_w -121963069
    //   13055: l2i
    //   13056: ldc_w -1046861278
    //   13059: ixor
    //   13060: ldc2_w -1287515950
    //   13063: l2i
    //   13064: ldc_w 227162972
    //   13067: ixor
    //   13068: ixor
    //   13069: lookupswitch default -> 35075, -2014774161 -> 13096, 1390349097 -> 13052
    //   13096: aload_0
    //   13097: getstatic Perryc.0 : I
    //   13100: ifle -> 13114
    //   13103: ldc2_w 261961499
    //   13106: l2i
    //   13107: ldc_w -2088896058
    //   13110: ixor
    //   13111: goto -> 13122
    //   13114: ldc2_w -2002925463
    //   13117: l2i
    //   13118: ldc_w 1531354346
    //   13121: ixor
    //   13122: ldc2_w -190563060
    //   13125: l2i
    //   13126: ldc_w 1230780168
    //   13129: ixor
    //   13130: ixor
    //   13131: lookupswitch default -> 34693, 823706841 -> 13114, 1847811719 -> 13156
    //   13156: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   13159: getstatic Perryc.1 : I
    //   13162: ifeq -> 13176
    //   13165: ldc2_w -1760161361
    //   13168: l2i
    //   13169: ldc_w 323421674
    //   13172: ixor
    //   13173: goto -> 13184
    //   13176: ldc2_w 1899905164
    //   13179: l2i
    //   13180: ldc_w 1100800641
    //   13183: ixor
    //   13184: ldc2_w 1088341654
    //   13187: l2i
    //   13188: ldc_w 714986067
    //   13191: ixor
    //   13192: ixor
    //   13193: lookupswitch default -> 34973, -300810112 -> 13176, 1524741832 -> 13220
    //   13220: goto -> 13224
    //   13223: athrow
    //   13224: invokevirtual getFontHeight : ()I
    //   13227: goto -> 13231
    //   13230: athrow
    //   13231: iadd
    //   13232: ldc2_w -1055745148
    //   13235: l2i
    //   13236: ldc_w -1055745108
    //   13239: ixor
    //   13240: iadd
    //   13241: i2f
    //   13242: getstatic Perryc.0 : I
    //   13245: ifle -> 13259
    //   13248: ldc2_w -2099758906
    //   13251: l2i
    //   13252: ldc_w 1309089423
    //   13255: ixor
    //   13256: goto -> 13267
    //   13259: ldc2_w 731635115
    //   13262: l2i
    //   13263: ldc_w 783081733
    //   13266: ixor
    //   13267: ldc2_w -25558085
    //   13270: l2i
    //   13271: ldc_w -1236328141
    //   13274: ixor
    //   13275: ixor
    //   13276: lookupswitch default -> 34939, -2065038143 -> 13259, 1291984422 -> 13304
    //   13304: iload #7
    //   13306: getstatic Perryc.c : I
    //   13309: iflt -> 13323
    //   13312: ldc2_w -299628712
    //   13315: l2i
    //   13316: ldc_w -1960272052
    //   13319: ixor
    //   13320: goto -> 13331
    //   13323: ldc2_w 814232551
    //   13326: l2i
    //   13327: ldc_w -1279221919
    //   13330: ixor
    //   13331: ldc2_w 287880194
    //   13334: l2i
    //   13335: ldc_w 790035857
    //   13338: ixor
    //   13339: ixor
    //   13340: lookupswitch default -> 13368, 1443140488 -> 13323, 1530057095 -> 34905
    //   13368: goto -> 13372
    //   13371: athrow
    //   13372: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   13375: goto -> 13379
    //   13378: athrow
    //   13379: goto -> 15203
    //   13382: ldc_w '냆㌒낙ꬂ'
    //   13385: getstatic Perryc.0 : I
    //   13388: ifle -> 13402
    //   13391: ldc2_w -1821718696
    //   13394: l2i
    //   13395: ldc_w 1386612451
    //   13398: ixor
    //   13399: goto -> 13410
    //   13402: ldc2_w -920016045
    //   13405: l2i
    //   13406: ldc_w 1051167406
    //   13409: ixor
    //   13410: ldc2_w -1694573229
    //   13413: l2i
    //   13414: ldc_w -1962412668
    //   13417: ixor
    //   13418: ixor
    //   13419: lookupswitch default -> 13444, -801773204 -> 34809, -449114869 -> 13402
    //   13444: goto -> 13448
    //   13447: athrow
    //   13448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13451: goto -> 13455
    //   13454: athrow
    //   13455: getstatic Perryc.1 : I
    //   13458: ifeq -> 13472
    //   13461: ldc2_w 729431788
    //   13464: l2i
    //   13465: ldc_w -527944145
    //   13468: ixor
    //   13469: goto -> 13480
    //   13472: ldc2_w -1317074260
    //   13475: l2i
    //   13476: ldc_w 1136297694
    //   13479: ixor
    //   13480: ldc2_w -1165120590
    //   13483: l2i
    //   13484: ldc_w 581472378
    //   13487: ixor
    //   13488: ixor
    //   13489: lookupswitch default -> 13516, -85395407 -> 13472, 1406612235 -> 35457
    //   13516: astore #6
    //   13518: ldc2_w -1053865178
    //   13521: l2i
    //   13522: ldc_w -1053865178
    //   13525: ixor
    //   13526: ldc2_w 102266358
    //   13529: l2i
    //   13530: ldc_w 102266121
    //   13533: ixor
    //   13534: ldc2_w -446573533
    //   13537: l2i
    //   13538: ldc_w -446573533
    //   13541: ixor
    //   13542: ldc2_w 26773300
    //   13545: l2i
    //   13546: ldc_w 26773451
    //   13549: ixor
    //   13550: getstatic Perryc.c : I
    //   13553: iflt -> 13567
    //   13556: ldc2_w 1590668789
    //   13559: l2i
    //   13560: ldc_w -2001594840
    //   13563: ixor
    //   13564: goto -> 13575
    //   13567: ldc2_w 1497632597
    //   13570: l2i
    //   13571: ldc_w -1767348695
    //   13574: ixor
    //   13575: ldc2_w -2017257365
    //   13578: l2i
    //   13579: ldc_w 1719338594
    //   13582: ixor
    //   13583: ixor
    //   13584: lookupswitch default -> 35479, 777287541 -> 13612, 935699924 -> 13567
    //   13612: goto -> 13616
    //   13615: athrow
    //   13616: invokestatic toRGBA : (IIII)I
    //   13619: goto -> 13623
    //   13622: athrow
    //   13623: getstatic Perryc.0 : I
    //   13626: ifle -> 13640
    //   13629: ldc2_w 1550565179
    //   13632: l2i
    //   13633: ldc_w 186516802
    //   13636: ixor
    //   13637: goto -> 13648
    //   13640: ldc2_w 1776134967
    //   13643: l2i
    //   13644: ldc_w -644066425
    //   13647: ixor
    //   13648: ldc2_w -213202148
    //   13651: l2i
    //   13652: ldc_w 401264441
    //   13655: ixor
    //   13656: ixor
    //   13657: lookupswitch default -> 13684, -1277837732 -> 35565, 413513516 -> 13640
    //   13684: istore #7
    //   13686: getstatic Perryc.0 : I
    //   13689: ifle -> 13703
    //   13692: ldc2_w -41017176
    //   13695: l2i
    //   13696: ldc_w -72259323
    //   13699: ixor
    //   13700: goto -> 13711
    //   13703: ldc2_w -1586033793
    //   13706: l2i
    //   13707: ldc_w 634868563
    //   13710: ixor
    //   13711: ldc2_w -499406426
    //   13714: l2i
    //   13715: ldc_w 1666445172
    //   13718: ixor
    //   13719: ixor
    //   13720: lookupswitch default -> 13748, -2024337537 -> 35079, -1948590889 -> 13703
    //   13748: aload_0
    //   13749: getstatic Perryc.1 : I
    //   13752: ifeq -> 13766
    //   13755: ldc2_w 64209465
    //   13758: l2i
    //   13759: ldc_w -1308993558
    //   13762: ixor
    //   13763: goto -> 13774
    //   13766: ldc2_w 1557663683
    //   13769: l2i
    //   13770: ldc_w -1795190380
    //   13773: ixor
    //   13774: ldc2_w 757662229
    //   13777: l2i
    //   13778: ldc_w 905982953
    //   13781: ixor
    //   13782: ixor
    //   13783: lookupswitch default -> 13808, -1459575761 -> 35369, -6469406 -> 13766
    //   13808: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   13811: new java/lang/StringBuilder
    //   13814: dup
    //   13815: getstatic Perryc.c : I
    //   13818: iflt -> 13832
    //   13821: ldc2_w 372491414
    //   13824: l2i
    //   13825: ldc_w 2021773361
    //   13828: ixor
    //   13829: goto -> 13840
    //   13832: ldc2_w -465911727
    //   13835: l2i
    //   13836: ldc_w -1944714899
    //   13839: ixor
    //   13840: ldc2_w 1238507550
    //   13843: l2i
    //   13844: ldc_w -1184231599
    //   13847: ixor
    //   13848: ixor
    //   13849: lookupswitch default -> 35465, -1735070093 -> 13876, -1643496472 -> 13832
    //   13876: goto -> 13880
    //   13879: athrow
    //   13880: invokespecial <init> : ()V
    //   13883: goto -> 13887
    //   13886: athrow
    //   13887: ldc_w ''
    //   13890: getstatic Perryc.c : I
    //   13893: iflt -> 13907
    //   13896: ldc2_w 1855709803
    //   13899: l2i
    //   13900: ldc_w -1051379751
    //   13903: ixor
    //   13904: goto -> 13915
    //   13907: ldc2_w 99348451
    //   13910: l2i
    //   13911: ldc_w -970885695
    //   13914: ixor
    //   13915: ldc2_w 1642532402
    //   13918: l2i
    //   13919: ldc_w -566617869
    //   13922: ixor
    //   13923: ixor
    //   13924: lookupswitch default -> 13952, -265601383 -> 13907, 269730675 -> 34815
    //   13952: goto -> 13956
    //   13955: athrow
    //   13956: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13959: goto -> 13963
    //   13962: athrow
    //   13963: getstatic Perryc.1 : I
    //   13966: ifeq -> 13980
    //   13969: ldc2_w -1403270692
    //   13972: l2i
    //   13973: ldc_w -109802747
    //   13976: ixor
    //   13977: goto -> 13988
    //   13980: ldc2_w -762559755
    //   13983: l2i
    //   13984: ldc_w -1137420233
    //   13987: ixor
    //   13988: ldc2_w 2010576366
    //   13991: l2i
    //   13992: ldc_w -1990796690
    //   13995: ixor
    //   13996: ixor
    //   13997: lookupswitch default -> 34837, -1875364542 -> 14024, -1414566567 -> 13980
    //   14024: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   14027: getstatic Perryc.c : I
    //   14030: iflt -> 14044
    //   14033: ldc2_w -1059783281
    //   14036: l2i
    //   14037: ldc_w 1109107248
    //   14040: ixor
    //   14041: goto -> 14052
    //   14044: ldc2_w 1833366581
    //   14047: l2i
    //   14048: ldc_w -472348599
    //   14051: ixor
    //   14052: ldc2_w 1664181223
    //   14055: l2i
    //   14056: ldc_w 677869230
    //   14059: ixor
    //   14060: ixor
    //   14061: lookupswitch default -> 35487, -976721611 -> 14088, -912700682 -> 14044
    //   14088: goto -> 14092
    //   14091: athrow
    //   14092: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   14095: goto -> 14099
    //   14098: athrow
    //   14099: getstatic Perryc.c : I
    //   14102: iflt -> 14116
    //   14105: ldc2_w -93096867
    //   14108: l2i
    //   14109: ldc_w -491726354
    //   14112: ixor
    //   14113: goto -> 14124
    //   14116: ldc2_w -65054062
    //   14119: l2i
    //   14120: ldc_w -1733613788
    //   14123: ixor
    //   14124: ldc2_w -1881918077
    //   14127: l2i
    //   14128: ldc_w -2041168692
    //   14131: ixor
    //   14132: ixor
    //   14133: lookupswitch default -> 14160, 275007751 -> 14116, 289514748 -> 35295
    //   14160: aload #6
    //   14162: getstatic Perryc.1 : I
    //   14165: ifeq -> 14179
    //   14168: ldc2_w -1112194693
    //   14171: l2i
    //   14172: ldc_w -170702293
    //   14175: ixor
    //   14176: goto -> 14187
    //   14179: ldc2_w -121748730
    //   14182: l2i
    //   14183: ldc_w -1307841109
    //   14186: ixor
    //   14187: ldc2_w 205916505
    //   14190: l2i
    //   14191: ldc_w 951083792
    //   14194: ixor
    //   14195: ixor
    //   14196: lookupswitch default -> 35083, 2089836825 -> 14179, 2118370532 -> 14224
    //   14224: goto -> 14228
    //   14227: athrow
    //   14228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14231: goto -> 14235
    //   14234: athrow
    //   14235: getstatic Perryc.0 : I
    //   14238: ifle -> 14252
    //   14241: ldc2_w -62398499
    //   14244: l2i
    //   14245: ldc_w 193122230
    //   14248: ixor
    //   14249: goto -> 14260
    //   14252: ldc2_w -2093844145
    //   14255: l2i
    //   14256: ldc_w -1648175457
    //   14259: ixor
    //   14260: ldc2_w -2130225341
    //   14263: l2i
    //   14264: ldc_w -922088233
    //   14267: ixor
    //   14268: ixor
    //   14269: lookupswitch default -> 14296, -1141025699 -> 14252, -1077392385 -> 34803
    //   14296: goto -> 14300
    //   14299: athrow
    //   14300: invokevirtual toString : ()Ljava/lang/String;
    //   14303: goto -> 14307
    //   14306: athrow
    //   14307: getstatic Perryc.1 : I
    //   14310: ifeq -> 14324
    //   14313: ldc2_w -1633490250
    //   14316: l2i
    //   14317: ldc_w -495787558
    //   14320: ixor
    //   14321: goto -> 14332
    //   14324: ldc2_w -1875274565
    //   14327: l2i
    //   14328: ldc_w -1273637703
    //   14331: ixor
    //   14332: ldc2_w -1411129741
    //   14335: l2i
    //   14336: ldc_w -286893365
    //   14339: ixor
    //   14340: ixor
    //   14341: lookupswitch default -> 35357, 970297300 -> 14324, 1630127290 -> 14368
    //   14368: aload_0
    //   14369: getstatic Perryc.0 : I
    //   14372: ifle -> 14386
    //   14375: ldc2_w -266646102
    //   14378: l2i
    //   14379: ldc_w -489062144
    //   14382: ixor
    //   14383: goto -> 14394
    //   14386: ldc2_w 419010518
    //   14389: l2i
    //   14390: ldc_w -2086136356
    //   14393: ixor
    //   14394: ldc2_w -2078307157
    //   14397: l2i
    //   14398: ldc_w 523191425
    //   14401: ixor
    //   14402: ixor
    //   14403: lookupswitch default -> 34887, -1980627840 -> 14386, 6375968 -> 14428
    //   14428: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14431: getstatic Perryc.0 : I
    //   14434: ifle -> 14448
    //   14437: ldc2_w 282955284
    //   14440: l2i
    //   14441: ldc_w 383501588
    //   14444: ixor
    //   14445: goto -> 14456
    //   14448: ldc2_w 322219590
    //   14451: l2i
    //   14452: ldc_w -1046649388
    //   14455: ixor
    //   14456: ldc2_w -2134628115
    //   14459: l2i
    //   14460: ldc_w 420956893
    //   14463: ixor
    //   14464: ixor
    //   14465: lookupswitch default -> 35419, -1613420240 -> 14448, 1266330018 -> 14492
    //   14492: goto -> 14496
    //   14495: athrow
    //   14496: invokevirtual getValue : ()Ljava/lang/Object;
    //   14499: goto -> 14503
    //   14502: athrow
    //   14503: checkcast java/lang/Integer
    //   14506: getstatic Perryc.c : I
    //   14509: iflt -> 14523
    //   14512: ldc2_w -783952954
    //   14515: l2i
    //   14516: ldc_w 1749889922
    //   14519: ixor
    //   14520: goto -> 14531
    //   14523: ldc2_w -65268237
    //   14526: l2i
    //   14527: ldc_w -1439780094
    //   14530: ixor
    //   14531: ldc2_w -15131219
    //   14534: l2i
    //   14535: ldc_w 2078906254
    //   14538: ixor
    //   14539: ixor
    //   14540: lookupswitch default -> 35271, -759026478 -> 14568, 1039690343 -> 14523
    //   14568: goto -> 14572
    //   14571: athrow
    //   14572: invokevirtual intValue : ()I
    //   14575: goto -> 14579
    //   14578: athrow
    //   14579: ldc2_w 967231098
    //   14582: l2i
    //   14583: ldc_w 967231046
    //   14586: ixor
    //   14587: iadd
    //   14588: i2f
    //   14589: getstatic Perryc.0 : I
    //   14592: ifle -> 14606
    //   14595: ldc2_w 761313751
    //   14598: l2i
    //   14599: ldc_w 1533377883
    //   14602: ixor
    //   14603: goto -> 14614
    //   14606: ldc2_w -1404126246
    //   14609: l2i
    //   14610: ldc_w -1639667471
    //   14613: ixor
    //   14614: ldc2_w 1131246472
    //   14617: l2i
    //   14618: ldc_w -175267842
    //   14621: ixor
    //   14622: ixor
    //   14623: lookupswitch default -> 14648, -1823873317 -> 14606, -1058723590 -> 34859
    //   14648: aload_0
    //   14649: getstatic Perryc.1 : I
    //   14652: ifeq -> 14666
    //   14655: ldc2_w 712830018
    //   14658: l2i
    //   14659: ldc_w -1347200330
    //   14662: ixor
    //   14663: goto -> 14674
    //   14666: ldc2_w 134546520
    //   14669: l2i
    //   14670: ldc_w -1406353743
    //   14673: ixor
    //   14674: ldc2_w -1591292834
    //   14677: l2i
    //   14678: ldc_w -1189150212
    //   14681: ixor
    //   14682: ixor
    //   14683: lookupswitch default -> 35253, -1644790954 -> 14666, -1139771573 -> 14708
    //   14708: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14711: getstatic Perryc.1 : I
    //   14714: ifeq -> 14728
    //   14717: ldc2_w 1836592866
    //   14720: l2i
    //   14721: ldc_w -1582435652
    //   14724: ixor
    //   14725: goto -> 14736
    //   14728: ldc2_w 1942872536
    //   14731: l2i
    //   14732: ldc_w -630962403
    //   14735: ixor
    //   14736: ldc2_w 11777977
    //   14739: l2i
    //   14740: ldc_w -435282764
    //   14743: ixor
    //   14744: ixor
    //   14745: lookupswitch default -> 14772, -1931265601 -> 14728, 711489363 -> 35097
    //   14772: goto -> 14776
    //   14775: athrow
    //   14776: invokevirtual getValue : ()Ljava/lang/Object;
    //   14779: goto -> 14783
    //   14782: athrow
    //   14783: checkcast java/lang/Integer
    //   14786: getstatic Perryc.1 : I
    //   14789: ifeq -> 14803
    //   14792: ldc2_w -1642678635
    //   14795: l2i
    //   14796: ldc_w 1528957016
    //   14799: ixor
    //   14800: goto -> 14811
    //   14803: ldc2_w -2046440912
    //   14806: l2i
    //   14807: ldc_w -434798496
    //   14810: ixor
    //   14811: ldc2_w -1603188041
    //   14814: l2i
    //   14815: ldc_w -553584539
    //   14818: ixor
    //   14819: ixor
    //   14820: lookupswitch default -> 34981, -1169880033 -> 14803, 526514306 -> 14848
    //   14848: goto -> 14852
    //   14851: athrow
    //   14852: invokevirtual intValue : ()I
    //   14855: goto -> 14859
    //   14858: athrow
    //   14859: getstatic Perryc.c : I
    //   14862: iflt -> 14876
    //   14865: ldc2_w 1619395023
    //   14868: l2i
    //   14869: ldc_w 1443002568
    //   14872: ixor
    //   14873: goto -> 14884
    //   14876: ldc2_w -1797854851
    //   14879: l2i
    //   14880: ldc_w -685680029
    //   14883: ixor
    //   14884: ldc2_w 1248700754
    //   14887: l2i
    //   14888: ldc_w 1451509517
    //   14891: ixor
    //   14892: ixor
    //   14893: lookupswitch default -> 34695, 711825240 -> 14876, 1595825473 -> 14920
    //   14920: aload_0
    //   14921: getstatic Perryc.1 : I
    //   14924: ifeq -> 14938
    //   14927: ldc2_w -565477706
    //   14930: l2i
    //   14931: ldc_w -2135898181
    //   14934: ixor
    //   14935: goto -> 14946
    //   14938: ldc2_w -1509530348
    //   14941: l2i
    //   14942: ldc_w 865893339
    //   14945: ixor
    //   14946: ldc2_w -11748973
    //   14949: l2i
    //   14950: ldc_w -551251384
    //   14953: ixor
    //   14954: ixor
    //   14955: lookupswitch default -> 14980, 164781744 -> 14938, 2123600598 -> 34993
    //   14980: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   14983: getstatic Perryc.0 : I
    //   14986: ifle -> 15000
    //   14989: ldc2_w 818665876
    //   14992: l2i
    //   14993: ldc_w 1708187250
    //   14996: ixor
    //   14997: goto -> 15008
    //   15000: ldc2_w -598041034
    //   15003: l2i
    //   15004: ldc_w 1222772126
    //   15007: ixor
    //   15008: ldc2_w -1240233953
    //   15011: l2i
    //   15012: ldc_w 2139882047
    //   15015: ixor
    //   15016: ixor
    //   15017: lookupswitch default -> 35009, -1669034554 -> 15000, 1562841480 -> 15044
    //   15044: goto -> 15048
    //   15047: athrow
    //   15048: invokevirtual getFontHeight : ()I
    //   15051: goto -> 15055
    //   15054: athrow
    //   15055: iadd
    //   15056: ldc2_w -165741736
    //   15059: l2i
    //   15060: ldc_w -165741712
    //   15063: ixor
    //   15064: iadd
    //   15065: i2f
    //   15066: getstatic Perryc.0 : I
    //   15069: ifle -> 15083
    //   15072: ldc2_w -1666824664
    //   15075: l2i
    //   15076: ldc_w -1448246433
    //   15079: ixor
    //   15080: goto -> 15091
    //   15083: ldc2_w 1188267043
    //   15086: l2i
    //   15087: ldc_w -1180740308
    //   15090: ixor
    //   15091: ldc2_w 1051396515
    //   15094: l2i
    //   15095: ldc_w 1595654939
    //   15098: ixor
    //   15099: ixor
    //   15100: lookupswitch default -> 34749, -1627645001 -> 15128, 1421545423 -> 15083
    //   15128: iload #7
    //   15130: getstatic Perryc.0 : I
    //   15133: ifle -> 15147
    //   15136: ldc2_w -190792985
    //   15139: l2i
    //   15140: ldc_w -1841171270
    //   15143: ixor
    //   15144: goto -> 15155
    //   15147: ldc2_w 1291097401
    //   15150: l2i
    //   15151: ldc_w 1783306571
    //   15154: ixor
    //   15155: ldc2_w 1094312426
    //   15158: l2i
    //   15159: ldc_w -881358015
    //   15162: ixor
    //   15163: ixor
    //   15164: lookupswitch default -> 15192, -324066058 -> 35123, 371807011 -> 15147
    //   15192: goto -> 15196
    //   15195: athrow
    //   15196: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   15199: goto -> 15203
    //   15202: athrow
    //   15203: getstatic Perryc.c : I
    //   15206: iflt -> 15220
    //   15209: ldc2_w 456016338
    //   15212: l2i
    //   15213: ldc_w 1850351324
    //   15216: ixor
    //   15217: goto -> 15228
    //   15220: ldc2_w -73678835
    //   15223: l2i
    //   15224: ldc_w 457442842
    //   15227: ixor
    //   15228: ldc2_w -1616161255
    //   15231: l2i
    //   15232: ldc_w -1073480720
    //   15235: ixor
    //   15236: ixor
    //   15237: lookupswitch default -> 15264, 718074599 -> 35577, 1321753530 -> 15220
    //   15264: aload #4
    //   15266: getstatic Perryc.0 : I
    //   15269: ifle -> 15283
    //   15272: ldc2_w -1379730052
    //   15275: l2i
    //   15276: ldc_w -1111039851
    //   15279: ixor
    //   15280: goto -> 15291
    //   15283: ldc2_w -1085106249
    //   15286: l2i
    //   15287: ldc_w 298536251
    //   15290: ixor
    //   15291: ldc2_w 22329788
    //   15294: l2i
    //   15295: ldc_w -1685806201
    //   15298: ixor
    //   15299: ixor
    //   15300: lookupswitch default -> 35231, -1965815854 -> 15283, 877248695 -> 15328
    //   15328: goto -> 15332
    //   15331: athrow
    //   15332: invokevirtual func_110143_aJ : ()F
    //   15335: goto -> 15339
    //   15338: athrow
    //   15339: getstatic Perryc.1 : I
    //   15342: ifeq -> 15356
    //   15345: ldc2_w -945563515
    //   15348: l2i
    //   15349: ldc_w -169975532
    //   15352: ixor
    //   15353: goto -> 15364
    //   15356: ldc2_w 1288770959
    //   15359: l2i
    //   15360: ldc_w 606848629
    //   15363: ixor
    //   15364: ldc2_w 32563925
    //   15367: l2i
    //   15368: ldc_w 809820913
    //   15371: ixor
    //   15372: ixor
    //   15373: lookupswitch default -> 15400, 63551925 -> 35265, 1929388291 -> 15356
    //   15400: aload #4
    //   15402: getstatic Perryc.0 : I
    //   15405: ifle -> 15419
    //   15408: ldc2_w 1011844011
    //   15411: l2i
    //   15412: ldc_w -978053419
    //   15415: ixor
    //   15416: goto -> 15427
    //   15419: ldc2_w -1449839112
    //   15422: l2i
    //   15423: ldc_w -1150363401
    //   15426: ixor
    //   15427: ldc2_w 1220899680
    //   15430: l2i
    //   15431: ldc_w 2059164905
    //   15434: ixor
    //   15435: ixor
    //   15436: lookupswitch default -> 15464, -880624905 -> 35581, 2026423027 -> 15419
    //   15464: goto -> 15468
    //   15467: athrow
    //   15468: invokevirtual func_110139_bj : ()F
    //   15471: goto -> 15475
    //   15474: athrow
    //   15475: fadd
    //   15476: getstatic Perryc.1 : I
    //   15479: ifeq -> 15493
    //   15482: ldc2_w -1187580827
    //   15485: l2i
    //   15486: ldc_w 1489020858
    //   15489: ixor
    //   15490: goto -> 15501
    //   15493: ldc2_w 1880448184
    //   15496: l2i
    //   15497: ldc_w -1234378457
    //   15500: ixor
    //   15501: ldc2_w -28513525
    //   15504: l2i
    //   15505: ldc_w -917268897
    //   15508: ixor
    //   15509: ixor
    //   15510: lookupswitch default -> 15536, -689361269 -> 35551, 581287390 -> 15493
    //   15536: fstore #6
    //   15538: getstatic Perryc.1 : I
    //   15541: ifeq -> 15555
    //   15544: ldc2_w -1745005159
    //   15547: l2i
    //   15548: ldc_w -702118688
    //   15551: ixor
    //   15552: goto -> 15563
    //   15555: ldc2_w -1035753115
    //   15558: l2i
    //   15559: ldc_w 1051264683
    //   15562: ixor
    //   15563: ldc2_w 583021818
    //   15566: l2i
    //   15567: ldc_w -1257453020
    //   15570: ixor
    //   15571: ixor
    //   15572: lookupswitch default -> 15600, -1539480215 -> 15555, -703123545 -> 34959
    //   15600: fload #6
    //   15602: ldc_w 0.030706337
    //   15605: invokestatic floatToIntBits : (F)I
    //   15608: ldc_w 2130676699
    //   15611: ixor
    //   15612: invokestatic intBitsToFloat : (I)F
    //   15615: fcmpl
    //   15616: iflt -> 15630
    //   15619: ldc2_w 227448684
    //   15622: l2i
    //   15623: ldc_w 365544035
    //   15626: ixor
    //   15627: goto -> 15638
    //   15630: ldc2_w 1708448781
    //   15633: l2i
    //   15634: ldc_w 2106820867
    //   15637: ixor
    //   15638: ldc2_w -1520770785
    //   15641: l2i
    //   15642: ldc_w -2128680888
    //   15645: ixor
    //   15646: ixor
    //   15647: tableswitch default -> 15619, 1006853208 -> 15668, 1006853209 -> 15774
    //   15668: ldc2_w 1076701887
    //   15671: l2i
    //   15672: ldc_w 1076701887
    //   15675: ixor
    //   15676: ldc2_w -2104858022
    //   15679: l2i
    //   15680: ldc_w -2104857947
    //   15683: ixor
    //   15684: ldc2_w -1818185053
    //   15687: l2i
    //   15688: ldc_w -1818185053
    //   15691: ixor
    //   15692: ldc2_w -331335557
    //   15695: l2i
    //   15696: ldc_w -331335548
    //   15699: ixor
    //   15700: getstatic Perryc.0 : I
    //   15703: ifle -> 15717
    //   15706: ldc2_w 909938521
    //   15709: l2i
    //   15710: ldc_w 1396528610
    //   15713: ixor
    //   15714: goto -> 15725
    //   15717: ldc2_w -1785957942
    //   15720: l2i
    //   15721: ldc_w -2039846982
    //   15724: ixor
    //   15725: ldc2_w -1509479940
    //   15728: l2i
    //   15729: ldc_w -364142511
    //   15732: ixor
    //   15733: ixor
    //   15734: lookupswitch default -> 15760, 692933398 -> 35025, 1975307790 -> 15717
    //   15760: goto -> 15764
    //   15763: athrow
    //   15764: invokestatic toRGBA : (IIII)I
    //   15767: goto -> 15771
    //   15770: athrow
    //   15771: goto -> 17295
    //   15774: getstatic Perryc.c : I
    //   15777: iflt -> 15791
    //   15780: ldc2_w -799884260
    //   15783: l2i
    //   15784: ldc_w 1050747615
    //   15787: ixor
    //   15788: goto -> 15799
    //   15791: ldc2_w 16636704
    //   15794: l2i
    //   15795: ldc_w -2053180616
    //   15798: ixor
    //   15799: ldc2_w 1128381658
    //   15802: l2i
    //   15803: ldc_w -1139946658
    //   15806: ixor
    //   15807: ixor
    //   15808: lookupswitch default -> 35189, 297789767 -> 15791, 2049925020 -> 15836
    //   15836: fload #6
    //   15838: ldc_w 0.5011299
    //   15841: invokestatic floatToIntBits : (F)I
    //   15844: ldc_w 2129676813
    //   15847: ixor
    //   15848: invokestatic intBitsToFloat : (I)F
    //   15851: fcmpl
    //   15852: iflt -> 15866
    //   15855: ldc2_w 590777395
    //   15858: l2i
    //   15859: ldc_w -20078931
    //   15862: ixor
    //   15863: goto -> 15874
    //   15866: ldc2_w 747019331
    //   15869: l2i
    //   15870: ldc_w -243429666
    //   15873: ixor
    //   15874: ldc2_w -1929192137
    //   15877: l2i
    //   15878: ldc_w -1933227348
    //   15881: ixor
    //   15882: ixor
    //   15883: tableswitch default -> 15855, -600013563 -> 15904, -600013562 -> 16010
    //   15904: ldc2_w -1811007317
    //   15907: l2i
    //   15908: ldc_w -1811007427
    //   15911: ixor
    //   15912: ldc2_w -1110506634
    //   15915: l2i
    //   15916: ldc_w -1110506615
    //   15919: ixor
    //   15920: ldc2_w 2123507493
    //   15923: l2i
    //   15924: ldc_w 2123507493
    //   15927: ixor
    //   15928: ldc2_w 1536790591
    //   15931: l2i
    //   15932: ldc_w 1536790720
    //   15935: ixor
    //   15936: getstatic Perryc.0 : I
    //   15939: ifle -> 15953
    //   15942: ldc2_w 2052684824
    //   15945: l2i
    //   15946: ldc_w 1389399112
    //   15949: ixor
    //   15950: goto -> 15961
    //   15953: ldc2_w 220695085
    //   15956: l2i
    //   15957: ldc_w 827702377
    //   15960: ixor
    //   15961: ldc2_w -1048508260
    //   15964: l2i
    //   15965: ldc_w 1714092208
    //   15968: ixor
    //   15969: ixor
    //   15970: lookupswitch default -> 35405, -1893597060 -> 15953, -1680226712 -> 15996
    //   15996: goto -> 16000
    //   15999: athrow
    //   16000: invokestatic toRGBA : (IIII)I
    //   16003: goto -> 16007
    //   16006: athrow
    //   16007: goto -> 17295
    //   16010: getstatic Perryc.0 : I
    //   16013: ifle -> 16027
    //   16016: ldc2_w 238266816
    //   16019: l2i
    //   16020: ldc_w 335943463
    //   16023: ixor
    //   16024: goto -> 16035
    //   16027: ldc2_w 1053040684
    //   16030: l2i
    //   16031: ldc_w 1490334727
    //   16034: ixor
    //   16035: ldc2_w 1481064361
    //   16038: l2i
    //   16039: ldc_w 1253557163
    //   16042: ixor
    //   16043: ixor
    //   16044: lookupswitch default -> 16072, -1873862018 -> 16027, 147145445 -> 35105
    //   16072: fload #6
    //   16074: ldc_w 0.3055639
    //   16077: invokestatic floatToIntBits : (F)I
    //   16080: ldc_w 2136240863
    //   16083: ixor
    //   16084: invokestatic intBitsToFloat : (I)F
    //   16087: fcmpl
    //   16088: ifle -> 16102
    //   16091: ldc2_w -612382523
    //   16094: l2i
    //   16095: ldc_w 1252392182
    //   16098: ixor
    //   16099: goto -> 16110
    //   16102: ldc2_w -623047818
    //   16105: l2i
    //   16106: ldc_w 1258766170
    //   16109: ixor
    //   16110: ldc2_w -2124981595
    //   16113: l2i
    //   16114: ldc_w -1492132167
    //   16117: ixor
    //   16118: ixor
    //   16119: tableswitch default -> 16091, -1216171985 -> 16140, -1216171984 -> 16246
    //   16140: ldc2_w 1686244030
    //   16143: l2i
    //   16144: ldc_w 1686244085
    //   16147: ixor
    //   16148: ldc2_w 637275234
    //   16151: l2i
    //   16152: ldc_w 637275293
    //   16155: ixor
    //   16156: ldc2_w -1888222000
    //   16159: l2i
    //   16160: ldc_w -1888222000
    //   16163: ixor
    //   16164: ldc2_w 387536366
    //   16167: l2i
    //   16168: ldc_w 387536145
    //   16171: ixor
    //   16172: getstatic Perryc.1 : I
    //   16175: ifeq -> 16189
    //   16178: ldc2_w 1795016653
    //   16181: l2i
    //   16182: ldc_w -1564184327
    //   16185: ixor
    //   16186: goto -> 16197
    //   16189: ldc2_w 1686071441
    //   16192: l2i
    //   16193: ldc_w -1753866119
    //   16196: ixor
    //   16197: ldc2_w 978873820
    //   16200: l2i
    //   16201: ldc_w 1199967563
    //   16204: ixor
    //   16205: ixor
    //   16206: lookupswitch default -> 16232, -1243097181 -> 35047, 2115179776 -> 16189
    //   16232: goto -> 16236
    //   16235: athrow
    //   16236: invokestatic toRGBA : (IIII)I
    //   16239: goto -> 16243
    //   16242: athrow
    //   16243: goto -> 17295
    //   16246: getstatic Perryc.0 : I
    //   16249: ifle -> 16263
    //   16252: ldc2_w -1700155203
    //   16255: l2i
    //   16256: ldc_w -1575322480
    //   16259: ixor
    //   16260: goto -> 16271
    //   16263: ldc2_w -1977119430
    //   16266: l2i
    //   16267: ldc_w -1656408273
    //   16270: ixor
    //   16271: ldc2_w -171180665
    //   16274: l2i
    //   16275: ldc_w 1602641112
    //   16278: ixor
    //   16279: ixor
    //   16280: lookupswitch default -> 34891, -1828819598 -> 16263, -1120986294 -> 16308
    //   16308: fload #6
    //   16310: ldc_w 0.70040196
    //   16313: invokestatic floatToIntBits : (F)I
    //   16316: ldc_w 2123582859
    //   16319: ixor
    //   16320: invokestatic intBitsToFloat : (I)F
    //   16323: fcmpl
    //   16324: ifle -> 16338
    //   16327: ldc2_w 1904570650
    //   16330: l2i
    //   16331: ldc_w -1431381487
    //   16334: ixor
    //   16335: goto -> 16346
    //   16338: ldc2_w 378794408
    //   16341: l2i
    //   16342: ldc_w -843556190
    //   16345: ixor
    //   16346: ldc2_w 1707747068
    //   16349: l2i
    //   16350: ldc_w -719935881
    //   16353: ixor
    //   16354: ixor
    //   16355: tableswitch default -> 16327, 1811360640 -> 16376, 1811360641 -> 16482
    //   16376: ldc2_w 859429310
    //   16379: l2i
    //   16380: ldc_w 859429185
    //   16383: ixor
    //   16384: ldc2_w 2011775779
    //   16387: l2i
    //   16388: ldc_w 2011775964
    //   16391: ixor
    //   16392: ldc2_w 1259784346
    //   16395: l2i
    //   16396: ldc_w 1259784346
    //   16399: ixor
    //   16400: ldc2_w 2144671091
    //   16403: l2i
    //   16404: ldc_w 2144671116
    //   16407: ixor
    //   16408: getstatic Perryc.c : I
    //   16411: iflt -> 16425
    //   16414: ldc2_w 1464739064
    //   16417: l2i
    //   16418: ldc_w -216223869
    //   16421: ixor
    //   16422: goto -> 16433
    //   16425: ldc2_w 2000817647
    //   16428: l2i
    //   16429: ldc_w -189939261
    //   16432: ixor
    //   16433: ldc2_w 1661068171
    //   16436: l2i
    //   16437: ldc_w 1655579950
    //   16440: ixor
    //   16441: ixor
    //   16442: lookupswitch default -> 35129, -2109732215 -> 16468, -1510126114 -> 16425
    //   16468: goto -> 16472
    //   16471: athrow
    //   16472: invokestatic toRGBA : (IIII)I
    //   16475: goto -> 16479
    //   16478: athrow
    //   16479: goto -> 17295
    //   16482: getstatic Perryc.0 : I
    //   16485: ifle -> 16499
    //   16488: ldc2_w 202959597
    //   16491: l2i
    //   16492: ldc_w -1655466353
    //   16495: ixor
    //   16496: goto -> 16507
    //   16499: ldc2_w -1643552438
    //   16502: l2i
    //   16503: ldc_w 1339569674
    //   16506: ixor
    //   16507: ldc2_w -433406728
    //   16510: l2i
    //   16511: ldc_w -466767298
    //   16514: ixor
    //   16515: ixor
    //   16516: lookupswitch default -> 16544, -1846378988 -> 16499, -1823706460 -> 35477
    //   16544: fload #6
    //   16546: ldc_w 0.2405429
    //   16549: invokestatic floatToIntBits : (F)I
    //   16552: ldc_w 2131120353
    //   16555: ixor
    //   16556: invokestatic intBitsToFloat : (I)F
    //   16559: fcmpl
    //   16560: ifle -> 16574
    //   16563: ldc2_w 1332350572
    //   16566: l2i
    //   16567: ldc_w 507611562
    //   16570: ixor
    //   16571: goto -> 16582
    //   16574: ldc2_w -1556396153
    //   16577: l2i
    //   16578: ldc_w -233783232
    //   16581: ixor
    //   16582: ldc2_w 2033331488
    //   16585: l2i
    //   16586: ldc_w 294200948
    //   16589: ixor
    //   16590: ixor
    //   16591: tableswitch default -> 16563, 965774482 -> 16612, 965774483 -> 16718
    //   16612: ldc2_w 1203087945
    //   16615: l2i
    //   16616: ldc_w 1203088054
    //   16619: ixor
    //   16620: ldc2_w -1585252069
    //   16623: l2i
    //   16624: ldc_w -1585251885
    //   16627: ixor
    //   16628: ldc2_w -1666263056
    //   16631: l2i
    //   16632: ldc_w -1666263056
    //   16635: ixor
    //   16636: ldc2_w -1872215849
    //   16639: l2i
    //   16640: ldc_w -1872216024
    //   16643: ixor
    //   16644: getstatic Perryc.0 : I
    //   16647: ifle -> 16661
    //   16650: ldc2_w 316073959
    //   16653: l2i
    //   16654: ldc_w 544547292
    //   16657: ixor
    //   16658: goto -> 16669
    //   16661: ldc2_w 753451440
    //   16664: l2i
    //   16665: ldc_w 1751388598
    //   16668: ixor
    //   16669: ldc2_w -1803948037
    //   16672: l2i
    //   16673: ldc_w 567167639
    //   16676: ixor
    //   16677: ixor
    //   16678: lookupswitch default -> 16704, -2028706985 -> 35303, 1352772618 -> 16661
    //   16704: goto -> 16708
    //   16707: athrow
    //   16708: invokestatic toRGBA : (IIII)I
    //   16711: goto -> 16715
    //   16714: athrow
    //   16715: goto -> 17295
    //   16718: getstatic Perryc.0 : I
    //   16721: ifle -> 16735
    //   16724: ldc2_w -1382090837
    //   16727: l2i
    //   16728: ldc_w 179385388
    //   16731: ixor
    //   16732: goto -> 16743
    //   16735: ldc2_w -1669520748
    //   16738: l2i
    //   16739: ldc_w 551443875
    //   16742: ixor
    //   16743: ldc2_w 1325443331
    //   16746: l2i
    //   16747: ldc_w 167260790
    //   16750: ixor
    //   16751: ixor
    //   16752: lookupswitch default -> 34745, -505980686 -> 16735, -94641086 -> 16780
    //   16780: fload #6
    //   16782: ldc_w 0.24299753
    //   16785: invokestatic floatToIntBits : (F)I
    //   16788: ldc_w 2136527960
    //   16791: ixor
    //   16792: invokestatic intBitsToFloat : (I)F
    //   16795: fcmpl
    //   16796: ifle -> 16810
    //   16799: ldc2_w 629537424
    //   16802: l2i
    //   16803: ldc_w 840609237
    //   16806: ixor
    //   16807: goto -> 16818
    //   16810: ldc2_w 824448074
    //   16813: l2i
    //   16814: ldc_w 649806608
    //   16817: ixor
    //   16818: ldc2_w -1995242877
    //   16821: l2i
    //   16822: ldc_w -550662231
    //   16825: ixor
    //   16826: ixor
    //   16827: tableswitch default -> 16799, 1101126255 -> 16848, 1101126256 -> 16954
    //   16848: ldc2_w -1574694630
    //   16851: l2i
    //   16852: ldc_w -1574694427
    //   16855: ixor
    //   16856: ldc2_w 1571072427
    //   16859: l2i
    //   16860: ldc_w 1571072317
    //   16863: ixor
    //   16864: ldc2_w -886418022
    //   16867: l2i
    //   16868: ldc_w -886418022
    //   16871: ixor
    //   16872: ldc2_w -1289315830
    //   16875: l2i
    //   16876: ldc_w -1289315595
    //   16879: ixor
    //   16880: getstatic Perryc.0 : I
    //   16883: ifle -> 16897
    //   16886: ldc2_w 533630629
    //   16889: l2i
    //   16890: ldc_w 1838355015
    //   16893: ixor
    //   16894: goto -> 16905
    //   16897: ldc2_w -882223308
    //   16900: l2i
    //   16901: ldc_w -1338640894
    //   16904: ixor
    //   16905: ldc2_w -1792794302
    //   16908: l2i
    //   16909: ldc_w 1087189609
    //   16912: ixor
    //   16913: ixor
    //   16914: lookupswitch default -> 16940, -1481338935 -> 35325, 262756245 -> 16897
    //   16940: goto -> 16944
    //   16943: athrow
    //   16944: invokestatic toRGBA : (IIII)I
    //   16947: goto -> 16951
    //   16950: athrow
    //   16951: goto -> 17295
    //   16954: getstatic Perryc.0 : I
    //   16957: ifle -> 16971
    //   16960: ldc2_w -451442231
    //   16963: l2i
    //   16964: ldc_w 444819104
    //   16967: ixor
    //   16968: goto -> 16979
    //   16971: ldc2_w 1936160099
    //   16974: l2i
    //   16975: ldc_w -2080448765
    //   16978: ixor
    //   16979: ldc2_w -189315178
    //   16982: l2i
    //   16983: ldc_w -1974921382
    //   16986: ixor
    //   16987: ixor
    //   16988: lookupswitch default -> 17016, -2123710555 -> 35263, -1572740413 -> 16971
    //   17016: fload #6
    //   17018: ldc_w 0.05007353
    //   17021: invokestatic floatToIntBits : (F)I
    //   17024: ldc_w 2112690663
    //   17027: ixor
    //   17028: invokestatic intBitsToFloat : (I)F
    //   17031: fcmpl
    //   17032: ifle -> 17046
    //   17035: ldc2_w -1995434398
    //   17038: l2i
    //   17039: ldc_w 656507651
    //   17042: ixor
    //   17043: goto -> 17054
    //   17046: ldc2_w -1779930410
    //   17049: l2i
    //   17050: ldc_w 1004142516
    //   17053: ixor
    //   17054: ldc2_w -1556550363
    //   17057: l2i
    //   17058: ldc_w -624636431
    //   17061: ixor
    //   17062: ixor
    //   17063: tableswitch default -> 17035, -674384459 -> 17084, -674384458 -> 17190
    //   17084: ldc2_w 872043466
    //   17087: l2i
    //   17088: ldc_w 872043317
    //   17091: ixor
    //   17092: ldc2_w 1732282115
    //   17095: l2i
    //   17096: ldc_w 1732282161
    //   17099: ixor
    //   17100: ldc2_w -832621379
    //   17103: l2i
    //   17104: ldc_w -832621379
    //   17107: ixor
    //   17108: ldc2_w 1515257174
    //   17111: l2i
    //   17112: ldc_w 1515257257
    //   17115: ixor
    //   17116: getstatic Perryc.1 : I
    //   17119: ifeq -> 17133
    //   17122: ldc2_w -35732264
    //   17125: l2i
    //   17126: ldc_w 928898150
    //   17129: ixor
    //   17130: goto -> 17141
    //   17133: ldc2_w 1336564211
    //   17136: l2i
    //   17137: ldc_w 665777634
    //   17140: ixor
    //   17141: ldc2_w 1871892597
    //   17144: l2i
    //   17145: ldc_w -1589587241
    //   17148: ixor
    //   17149: ixor
    //   17150: lookupswitch default -> 17176, -1060660413 -> 17133, 72423964 -> 35069
    //   17176: goto -> 17180
    //   17179: athrow
    //   17180: invokestatic toRGBA : (IIII)I
    //   17183: goto -> 17187
    //   17186: athrow
    //   17187: goto -> 17295
    //   17190: ldc2_w -252855350
    //   17193: l2i
    //   17194: ldc_w -252855499
    //   17197: ixor
    //   17198: ldc2_w 573953905
    //   17201: l2i
    //   17202: ldc_w 573953905
    //   17205: ixor
    //   17206: ldc2_w 266705048
    //   17209: l2i
    //   17210: ldc_w 266705048
    //   17213: ixor
    //   17214: ldc2_w 100402048
    //   17217: l2i
    //   17218: ldc_w 100402047
    //   17221: ixor
    //   17222: getstatic Perryc.c : I
    //   17225: iflt -> 17239
    //   17228: ldc2_w 1093033583
    //   17231: l2i
    //   17232: ldc_w 1889495071
    //   17235: ixor
    //   17236: goto -> 17247
    //   17239: ldc2_w -1240062693
    //   17242: l2i
    //   17243: ldc_w -587794951
    //   17246: ixor
    //   17247: ldc2_w 2129667266
    //   17250: l2i
    //   17251: ldc_w -1774517625
    //   17254: ixor
    //   17255: ixor
    //   17256: lookupswitch default -> 34741, -2111048025 -> 17284, -646836171 -> 17239
    //   17284: goto -> 17288
    //   17287: athrow
    //   17288: invokestatic toRGBA : (IIII)I
    //   17291: goto -> 17295
    //   17294: athrow
    //   17295: getstatic Perryc.1 : I
    //   17298: ifeq -> 17312
    //   17301: ldc2_w -2045597134
    //   17304: l2i
    //   17305: ldc_w 1809616706
    //   17308: ixor
    //   17309: goto -> 17320
    //   17312: ldc2_w 1785279343
    //   17315: l2i
    //   17316: ldc_w 1473316588
    //   17319: ixor
    //   17320: ldc2_w -411719097
    //   17323: l2i
    //   17324: ldc_w 654320804
    //   17327: ixor
    //   17328: ixor
    //   17329: lookupswitch default -> 17356, -1454372581 -> 17312, 767273875 -> 35491
    //   17356: istore #7
    //   17358: new java/text/DecimalFormat
    //   17361: dup
    //   17362: ldc_w '낶㍐냑ꭄ'
    //   17365: getstatic Perryc.c : I
    //   17368: iflt -> 17382
    //   17371: ldc2_w -2141703829
    //   17374: l2i
    //   17375: ldc_w 2029297934
    //   17378: ixor
    //   17379: goto -> 17390
    //   17382: ldc2_w 928102421
    //   17385: l2i
    //   17386: ldc_w 1194215385
    //   17389: ixor
    //   17390: ldc2_w -4831673
    //   17393: l2i
    //   17394: ldc_w 146545621
    //   17397: ixor
    //   17398: ixor
    //   17399: lookupswitch default -> 35513, -2022333858 -> 17424, 262589943 -> 17382
    //   17424: goto -> 17428
    //   17427: athrow
    //   17428: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17431: goto -> 17435
    //   17434: athrow
    //   17435: getstatic Perryc.c : I
    //   17438: iflt -> 17452
    //   17441: ldc2_w -1046298307
    //   17444: l2i
    //   17445: ldc_w -1729110323
    //   17448: ixor
    //   17449: goto -> 17460
    //   17452: ldc2_w 2010395796
    //   17455: l2i
    //   17456: ldc_w 132520253
    //   17459: ixor
    //   17460: ldc2_w -2139847378
    //   17463: l2i
    //   17464: ldc_w -942347968
    //   17467: ixor
    //   17468: ixor
    //   17469: lookupswitch default -> 35113, 518878110 -> 17452, 932331975 -> 17496
    //   17496: goto -> 17500
    //   17499: athrow
    //   17500: invokespecial <init> : (Ljava/lang/String;)V
    //   17503: goto -> 17507
    //   17506: athrow
    //   17507: getstatic Perryc.c : I
    //   17510: iflt -> 17524
    //   17513: ldc2_w -2031646791
    //   17516: l2i
    //   17517: ldc_w 1452997199
    //   17520: ixor
    //   17521: goto -> 17532
    //   17524: ldc2_w 923750082
    //   17527: l2i
    //   17528: ldc_w 255021799
    //   17531: ixor
    //   17532: ldc2_w 729549981
    //   17535: l2i
    //   17536: ldc_w -861111988
    //   17539: ixor
    //   17540: ixor
    //   17541: lookupswitch default -> 17568, -1525883216 -> 17524, 934086695 -> 34949
    //   17568: astore #8
    //   17570: getstatic Perryc.c : I
    //   17573: iflt -> 17587
    //   17576: ldc2_w -222323960
    //   17579: l2i
    //   17580: ldc_w -1469594172
    //   17583: ixor
    //   17584: goto -> 17595
    //   17587: ldc2_w -1835983552
    //   17590: l2i
    //   17591: ldc_w 2100860395
    //   17594: ixor
    //   17595: ldc2_w -1668603924
    //   17598: l2i
    //   17599: ldc_w 1074076527
    //   17602: ixor
    //   17603: ixor
    //   17604: lookupswitch default -> 35199, -2041161137 -> 17587, 858229800 -> 17632
    //   17632: aload_0
    //   17633: getstatic Perryc.0 : I
    //   17636: ifle -> 17650
    //   17639: ldc2_w 992899625
    //   17642: l2i
    //   17643: ldc_w 1493884759
    //   17646: ixor
    //   17647: goto -> 17658
    //   17650: ldc2_w -2077364170
    //   17653: l2i
    //   17654: ldc_w -2096241261
    //   17657: ixor
    //   17658: ldc2_w 490263256
    //   17661: l2i
    //   17662: ldc_w 1413968662
    //   17665: ixor
    //   17666: ixor
    //   17667: lookupswitch default -> 35165, 727387312 -> 17650, 1314894955 -> 17692
    //   17692: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   17695: ldc_w ''
    //   17698: getstatic Perryc.1 : I
    //   17701: ifeq -> 17715
    //   17704: ldc2_w -1064404306
    //   17707: l2i
    //   17708: ldc_w 78595703
    //   17711: ixor
    //   17712: goto -> 17723
    //   17715: ldc2_w 763509502
    //   17718: l2i
    //   17719: ldc_w 1743972399
    //   17722: ixor
    //   17723: ldc2_w -958495279
    //   17726: l2i
    //   17727: ldc_w 1466924089
    //   17730: ixor
    //   17731: ixor
    //   17732: lookupswitch default -> 17760, 1435551025 -> 34699, 1982266043 -> 17715
    //   17760: aload_0
    //   17761: getstatic Perryc.1 : I
    //   17764: ifeq -> 17778
    //   17767: ldc2_w 1231680807
    //   17770: l2i
    //   17771: ldc_w -652732411
    //   17774: ixor
    //   17775: goto -> 17786
    //   17778: ldc2_w -1221622610
    //   17781: l2i
    //   17782: ldc_w -974788480
    //   17785: ixor
    //   17786: ldc2_w -1975319554
    //   17789: l2i
    //   17790: ldc_w 561303618
    //   17793: ixor
    //   17794: ixor
    //   17795: lookupswitch default -> 17820, -1120655323 -> 17778, 994459294 -> 35375
    //   17820: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17823: getstatic Perryc.c : I
    //   17826: iflt -> 17840
    //   17829: ldc2_w 1997129806
    //   17832: l2i
    //   17833: ldc_w 135347934
    //   17836: ixor
    //   17837: goto -> 17848
    //   17840: ldc2_w 634735733
    //   17843: l2i
    //   17844: ldc_w -1444361567
    //   17847: ixor
    //   17848: ldc2_w -304433565
    //   17851: l2i
    //   17852: ldc_w -1650105899
    //   17855: ixor
    //   17856: ixor
    //   17857: lookupswitch default -> 17884, 258416934 -> 35269, 1230423929 -> 17840
    //   17884: goto -> 17888
    //   17887: athrow
    //   17888: invokevirtual getValue : ()Ljava/lang/Object;
    //   17891: goto -> 17895
    //   17894: athrow
    //   17895: checkcast java/lang/Integer
    //   17898: getstatic Perryc.c : I
    //   17901: iflt -> 17915
    //   17904: ldc2_w -1789305326
    //   17907: l2i
    //   17908: ldc_w 122662202
    //   17911: ixor
    //   17912: goto -> 17923
    //   17915: ldc2_w -1031602445
    //   17918: l2i
    //   17919: ldc_w 839071795
    //   17922: ixor
    //   17923: ldc2_w 738728847
    //   17926: l2i
    //   17927: ldc_w 49787214
    //   17930: ixor
    //   17931: ixor
    //   17932: lookupswitch default -> 35413, -1125557783 -> 17915, -562140159 -> 17960
    //   17960: goto -> 17964
    //   17963: athrow
    //   17964: invokevirtual intValue : ()I
    //   17967: goto -> 17971
    //   17970: athrow
    //   17971: ldc2_w -41006343
    //   17974: l2i
    //   17975: ldc_w -41006395
    //   17978: ixor
    //   17979: iadd
    //   17980: getstatic Perryc.0 : I
    //   17983: ifle -> 17997
    //   17986: ldc2_w 1545396664
    //   17989: l2i
    //   17990: ldc_w 924143098
    //   17993: ixor
    //   17994: goto -> 18005
    //   17997: ldc2_w 134554412
    //   18000: l2i
    //   18001: ldc_w -509310638
    //   18004: ixor
    //   18005: ldc2_w 101197907
    //   18008: l2i
    //   18009: ldc_w 842368218
    //   18012: ixor
    //   18013: ixor
    //   18014: lookupswitch default -> 18040, 1597243595 -> 34961, 1717216585 -> 17997
    //   18040: aload_0
    //   18041: getstatic Perryc.1 : I
    //   18044: ifeq -> 18058
    //   18047: ldc2_w 345180107
    //   18050: l2i
    //   18051: ldc_w 1560860946
    //   18054: ixor
    //   18055: goto -> 18066
    //   18058: ldc2_w -285793848
    //   18061: l2i
    //   18062: ldc_w -839932770
    //   18065: ixor
    //   18066: ldc2_w -1601718453
    //   18069: l2i
    //   18070: ldc_w 1862053860
    //   18073: ixor
    //   18074: ixor
    //   18075: lookupswitch default -> 18100, -2015312266 -> 34785, -1301335814 -> 18058
    //   18100: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   18103: ldc_w ''
    //   18106: getstatic Perryc.0 : I
    //   18109: ifle -> 18123
    //   18112: ldc2_w 820548450
    //   18115: l2i
    //   18116: ldc_w -2034118784
    //   18119: ixor
    //   18120: goto -> 18131
    //   18123: ldc2_w -876248407
    //   18126: l2i
    //   18127: ldc_w 216267516
    //   18130: ixor
    //   18131: ldc2_w 872959628
    //   18134: l2i
    //   18135: ldc_w 687189880
    //   18138: ixor
    //   18139: ixor
    //   18140: lookupswitch default -> 34909, -1428898538 -> 18123, -606365279 -> 18168
    //   18168: goto -> 18172
    //   18171: athrow
    //   18172: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   18175: goto -> 18179
    //   18178: athrow
    //   18179: iadd
    //   18180: i2f
    //   18181: getstatic Perryc.1 : I
    //   18184: ifeq -> 18198
    //   18187: ldc2_w -1209824584
    //   18190: l2i
    //   18191: ldc_w 1417429582
    //   18194: ixor
    //   18195: goto -> 18206
    //   18198: ldc2_w 1568965490
    //   18201: l2i
    //   18202: ldc_w -2044315925
    //   18205: ixor
    //   18206: ldc2_w 1223055395
    //   18209: l2i
    //   18210: ldc_w 1920986232
    //   18213: ixor
    //   18214: ixor
    //   18215: lookupswitch default -> 18240, -653886291 -> 35239, -416949525 -> 18198
    //   18240: aload_0
    //   18241: getstatic Perryc.c : I
    //   18244: iflt -> 18258
    //   18247: ldc2_w 362584101
    //   18250: l2i
    //   18251: ldc_w 253927880
    //   18254: ixor
    //   18255: goto -> 18266
    //   18258: ldc2_w 2096697768
    //   18261: l2i
    //   18262: ldc_w -1199541187
    //   18265: ixor
    //   18266: ldc2_w -1695858846
    //   18269: l2i
    //   18270: ldc_w -1273235581
    //   18273: ixor
    //   18274: ixor
    //   18275: lookupswitch default -> 35029, -360075916 -> 18300, 877588748 -> 18258
    //   18300: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18303: getstatic Perryc.c : I
    //   18306: iflt -> 18320
    //   18309: ldc2_w 240840171
    //   18312: l2i
    //   18313: ldc_w 1776847990
    //   18316: ixor
    //   18317: goto -> 18328
    //   18320: ldc2_w 1171136729
    //   18323: l2i
    //   18324: ldc_w -1509204694
    //   18327: ixor
    //   18328: ldc2_w 433828941
    //   18331: l2i
    //   18332: ldc_w 1133644485
    //   18335: ixor
    //   18336: ixor
    //   18337: lookupswitch default -> 35017, -1181957253 -> 18364, 1039916821 -> 18320
    //   18364: goto -> 18368
    //   18367: athrow
    //   18368: invokevirtual getValue : ()Ljava/lang/Object;
    //   18371: goto -> 18375
    //   18374: athrow
    //   18375: checkcast java/lang/Integer
    //   18378: getstatic Perryc.c : I
    //   18381: iflt -> 18395
    //   18384: ldc2_w 139930971
    //   18387: l2i
    //   18388: ldc_w -52004270
    //   18391: ixor
    //   18392: goto -> 18403
    //   18395: ldc2_w -692988547
    //   18398: l2i
    //   18399: ldc_w -1602490479
    //   18402: ixor
    //   18403: ldc2_w 717382905
    //   18406: l2i
    //   18407: ldc_w -2001842832
    //   18410: ixor
    //   18411: ixor
    //   18412: lookupswitch default -> 35087, -727313563 -> 18440, 1457356416 -> 18395
    //   18440: goto -> 18444
    //   18443: athrow
    //   18444: invokevirtual intValue : ()I
    //   18447: goto -> 18451
    //   18450: athrow
    //   18451: ldc2_w 1115076133
    //   18454: l2i
    //   18455: ldc_w 1115076143
    //   18458: ixor
    //   18459: iadd
    //   18460: i2f
    //   18461: getstatic Perryc.0 : I
    //   18464: ifle -> 18478
    //   18467: ldc2_w -2121838840
    //   18470: l2i
    //   18471: ldc_w 648042316
    //   18474: ixor
    //   18475: goto -> 18486
    //   18478: ldc2_w 1301820920
    //   18481: l2i
    //   18482: ldc_w 810258747
    //   18485: ixor
    //   18486: ldc2_w 888628690
    //   18489: l2i
    //   18490: ldc_w 836970412
    //   18493: ixor
    //   18494: ixor
    //   18495: lookupswitch default -> 35377, -1573692870 -> 18478, 2026366653 -> 18520
    //   18520: iload #7
    //   18522: getstatic Perryc.1 : I
    //   18525: ifeq -> 18539
    //   18528: ldc2_w -1466147747
    //   18531: l2i
    //   18532: ldc_w 966659640
    //   18535: ixor
    //   18536: goto -> 18547
    //   18539: ldc2_w -960242352
    //   18542: l2i
    //   18543: ldc_w -87494826
    //   18546: ixor
    //   18547: ldc2_w -725224845
    //   18550: l2i
    //   18551: ldc_w -1388550296
    //   18554: ixor
    //   18555: ixor
    //   18556: lookupswitch default -> 34857, -386152578 -> 18539, 1173530397 -> 18584
    //   18584: goto -> 18588
    //   18587: athrow
    //   18588: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   18591: goto -> 18595
    //   18594: athrow
    //   18595: getstatic Perryc.c : I
    //   18598: iflt -> 18612
    //   18601: ldc2_w 1608125265
    //   18604: l2i
    //   18605: ldc_w 327682771
    //   18608: ixor
    //   18609: goto -> 18620
    //   18612: ldc2_w 1386081244
    //   18615: l2i
    //   18616: ldc_w -1445889142
    //   18619: ixor
    //   18620: ldc2_w -185601569
    //   18623: l2i
    //   18624: ldc_w -758761975
    //   18627: ixor
    //   18628: ixor
    //   18629: lookupswitch default -> 18656, 1175982283 -> 18612, 1786496596 -> 35191
    //   18656: aload #4
    //   18658: getstatic Perryc.1 : I
    //   18661: ifeq -> 18675
    //   18664: ldc2_w 1833989951
    //   18667: l2i
    //   18668: ldc_w 928282230
    //   18671: ixor
    //   18672: goto -> 18683
    //   18675: ldc2_w -946193077
    //   18678: l2i
    //   18679: ldc_w 736248417
    //   18682: ixor
    //   18683: ldc2_w 1877985959
    //   18686: l2i
    //   18687: ldc_w 1451121415
    //   18690: ixor
    //   18691: ixor
    //   18692: lookupswitch default -> 35543, -706089334 -> 18720, 1670746345 -> 18675
    //   18720: goto -> 18724
    //   18723: athrow
    //   18724: invokestatic isFakePlayer : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   18727: goto -> 18731
    //   18730: athrow
    //   18731: ifeq -> 18745
    //   18734: ldc2_w 522260452
    //   18737: l2i
    //   18738: ldc_w -403154653
    //   18741: ixor
    //   18742: goto -> 18753
    //   18745: ldc2_w -711024336
    //   18748: l2i
    //   18749: ldc_w 759691254
    //   18752: ixor
    //   18753: ldc2_w 1707485348
    //   18756: l2i
    //   18757: ldc_w -834156357
    //   18760: ixor
    //   18761: ixor
    //   18762: tableswitch default -> 18734, 1398322904 -> 18784, 1398322905 -> 18795
    //   18784: ldc2_w 907554593
    //   18787: l2i
    //   18788: ldc_w 907554593
    //   18791: ixor
    //   18792: goto -> 19619
    //   18795: getstatic Perryc.1 : I
    //   18798: ifeq -> 18812
    //   18801: ldc2_w 859354795
    //   18804: l2i
    //   18805: ldc_w 1518051426
    //   18808: ixor
    //   18809: goto -> 18820
    //   18812: ldc2_w -1259177054
    //   18815: l2i
    //   18816: ldc_w 1605077693
    //   18819: ixor
    //   18820: ldc2_w -1138727084
    //   18823: l2i
    //   18824: ldc_w -1884205568
    //   18827: ixor
    //   18828: ixor
    //   18829: lookupswitch default -> 35359, -657926069 -> 18856, 1523728285 -> 18812
    //   18856: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   18859: getstatic Perryc.1 : I
    //   18862: ifeq -> 18876
    //   18865: ldc2_w -802034050
    //   18868: l2i
    //   18869: ldc_w 566000285
    //   18872: ixor
    //   18873: goto -> 18884
    //   18876: ldc2_w -1335742343
    //   18879: l2i
    //   18880: ldc_w -2093711146
    //   18883: ixor
    //   18884: ldc2_w 941806021
    //   18887: l2i
    //   18888: ldc_w 777750833
    //   18891: ixor
    //   18892: ixor
    //   18893: lookupswitch default -> 35133, -403387369 -> 18876, 623896667 -> 18920
    //   18920: goto -> 18924
    //   18923: athrow
    //   18924: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   18927: goto -> 18931
    //   18930: athrow
    //   18931: getstatic Perryc.0 : I
    //   18934: ifle -> 18948
    //   18937: ldc2_w 616772671
    //   18940: l2i
    //   18941: ldc_w 248850759
    //   18944: ixor
    //   18945: goto -> 18956
    //   18948: ldc2_w -1353675776
    //   18951: l2i
    //   18952: ldc_w 98761108
    //   18955: ixor
    //   18956: ldc2_w -215187859
    //   18959: l2i
    //   18960: ldc_w 700655953
    //   18963: ixor
    //   18964: ixor
    //   18965: lookupswitch default -> 35595, -252097980 -> 18948, 1885151912 -> 18992
    //   18992: aload #4
    //   18994: getstatic Perryc.0 : I
    //   18997: ifle -> 19011
    //   19000: ldc2_w -307418372
    //   19003: l2i
    //   19004: ldc_w -2067070763
    //   19007: ixor
    //   19008: goto -> 19019
    //   19011: ldc2_w 524058022
    //   19014: l2i
    //   19015: ldc_w 1152765858
    //   19018: ixor
    //   19019: ldc2_w -782948282
    //   19022: l2i
    //   19023: ldc_w 80068408
    //   19026: ixor
    //   19027: ixor
    //   19028: lookupswitch default -> 19056, -1124680361 -> 35051, 1349581896 -> 19011
    //   19056: goto -> 19060
    //   19059: athrow
    //   19060: invokevirtual func_110124_au : ()Ljava/util/UUID;
    //   19063: goto -> 19067
    //   19066: athrow
    //   19067: getstatic Perryc.0 : I
    //   19070: ifle -> 19084
    //   19073: ldc2_w -1281703334
    //   19076: l2i
    //   19077: ldc_w -945691076
    //   19080: ixor
    //   19081: goto -> 19092
    //   19084: ldc2_w -1531103170
    //   19087: l2i
    //   19088: ldc_w -662053874
    //   19091: ixor
    //   19092: ldc2_w 1773411777
    //   19095: l2i
    //   19096: ldc_w -1815637732
    //   19099: ixor
    //   19100: ixor
    //   19101: lookupswitch default -> 19128, -1907840837 -> 34963, 281771976 -> 19084
    //   19128: goto -> 19132
    //   19131: athrow
    //   19132: invokevirtual func_175102_a : (Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
    //   19135: goto -> 19139
    //   19138: athrow
    //   19139: ifnonnull -> 19153
    //   19142: ldc2_w -1710091740
    //   19145: l2i
    //   19146: ldc_w 635935564
    //   19149: ixor
    //   19150: goto -> 19161
    //   19153: ldc2_w 2094083754
    //   19156: l2i
    //   19157: ldc_w -1021007933
    //   19160: ixor
    //   19161: ldc2_w 2119062406
    //   19164: l2i
    //   19165: ldc_w 53536058
    //   19168: ixor
    //   19169: ixor
    //   19170: tableswitch default -> 19142, -1031061548 -> 19192, -1031061547 -> 19203
    //   19192: ldc2_w 833817387
    //   19195: l2i
    //   19196: ldc_w 833817387
    //   19199: ixor
    //   19200: goto -> 19619
    //   19203: getstatic Perryc.0 : I
    //   19206: ifle -> 19220
    //   19209: ldc2_w 1940854362
    //   19212: l2i
    //   19213: ldc_w -43287430
    //   19216: ixor
    //   19217: goto -> 19228
    //   19220: ldc2_w 1547275652
    //   19223: l2i
    //   19224: ldc_w 203725887
    //   19227: ixor
    //   19228: ldc2_w -1877950612
    //   19231: l2i
    //   19232: ldc_w 1262840653
    //   19235: ixor
    //   19236: ixor
    //   19237: lookupswitch default -> 19264, 109010300 -> 19220, 1435614721 -> 35131
    //   19264: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   19267: getstatic Perryc.0 : I
    //   19270: ifle -> 19284
    //   19273: ldc2_w 1250598454
    //   19276: l2i
    //   19277: ldc_w 1490954296
    //   19280: ixor
    //   19281: goto -> 19292
    //   19284: ldc2_w 881402434
    //   19287: l2i
    //   19288: ldc_w 944864386
    //   19291: ixor
    //   19292: ldc2_w -1991091529
    //   19295: l2i
    //   19296: ldc_w -541905423
    //   19299: ixor
    //   19300: ixor
    //   19301: lookupswitch default -> 19328, -1297679278 -> 19284, 1152762184 -> 35111
    //   19328: goto -> 19332
    //   19331: athrow
    //   19332: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   19335: goto -> 19339
    //   19338: athrow
    //   19339: getstatic Perryc.0 : I
    //   19342: ifle -> 19356
    //   19345: ldc2_w -358094854
    //   19348: l2i
    //   19349: ldc_w 830107558
    //   19352: ixor
    //   19353: goto -> 19364
    //   19356: ldc2_w -1504610251
    //   19359: l2i
    //   19360: ldc_w -198510721
    //   19363: ixor
    //   19364: ldc2_w 668673870
    //   19367: l2i
    //   19368: ldc_w 1136546002
    //   19371: ixor
    //   19372: ixor
    //   19373: lookupswitch default -> 34841, -1078394944 -> 19356, 907999446 -> 19400
    //   19400: aload #4
    //   19402: getstatic Perryc.c : I
    //   19405: iflt -> 19419
    //   19408: ldc2_w -425558755
    //   19411: l2i
    //   19412: ldc_w 677632083
    //   19415: ixor
    //   19416: goto -> 19427
    //   19419: ldc2_w -756370483
    //   19422: l2i
    //   19423: ldc_w -1515608272
    //   19426: ixor
    //   19427: ldc2_w -550381819
    //   19430: l2i
    //   19431: ldc_w 1843120781
    //   19434: ixor
    //   19435: ixor
    //   19436: lookupswitch default -> 19464, 307152745 -> 19419, 2083240134 -> 35081
    //   19464: goto -> 19468
    //   19467: athrow
    //   19468: invokevirtual func_110124_au : ()Ljava/util/UUID;
    //   19471: goto -> 19475
    //   19474: athrow
    //   19475: getstatic Perryc.0 : I
    //   19478: ifle -> 19492
    //   19481: ldc2_w -2104285464
    //   19484: l2i
    //   19485: ldc_w 1575060968
    //   19488: ixor
    //   19489: goto -> 19500
    //   19492: ldc2_w -767024208
    //   19495: l2i
    //   19496: ldc_w -1503323008
    //   19499: ixor
    //   19500: ldc2_w 79811198
    //   19503: l2i
    //   19504: ldc_w -354556478
    //   19507: ixor
    //   19508: ixor
    //   19509: lookupswitch default -> 19536, 829330620 -> 35539, 1925137352 -> 19492
    //   19536: goto -> 19540
    //   19539: athrow
    //   19540: invokevirtual func_175102_a : (Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
    //   19543: goto -> 19547
    //   19546: athrow
    //   19547: getstatic Perryc.1 : I
    //   19550: ifeq -> 19564
    //   19553: ldc2_w -777703456
    //   19556: l2i
    //   19557: ldc_w 1838517704
    //   19560: ixor
    //   19561: goto -> 19572
    //   19564: ldc2_w 1503598917
    //   19567: l2i
    //   19568: ldc_w -229727664
    //   19571: ixor
    //   19572: ldc2_w -1669180314
    //   19575: l2i
    //   19576: ldc_w 609555685
    //   19579: ixor
    //   19580: ixor
    //   19581: lookupswitch default -> 19608, -786604212 -> 19564, 82305707 -> 35039
    //   19608: goto -> 19612
    //   19611: athrow
    //   19612: invokevirtual func_178853_c : ()I
    //   19615: goto -> 19619
    //   19618: athrow
    //   19619: getstatic Perryc.0 : I
    //   19622: ifle -> 19636
    //   19625: ldc2_w -452410461
    //   19628: l2i
    //   19629: ldc_w -1955307911
    //   19632: ixor
    //   19633: goto -> 19644
    //   19636: ldc2_w 1869323171
    //   19639: l2i
    //   19640: ldc_w -365523939
    //   19643: ixor
    //   19644: ldc2_w -563316296
    //   19647: l2i
    //   19648: ldc_w -729443823
    //   19651: ixor
    //   19652: ixor
    //   19653: lookupswitch default -> 19680, 1078758362 -> 19636, 1687516787 -> 34873
    //   19680: goto -> 19684
    //   19683: athrow
    //   19684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19687: goto -> 19691
    //   19690: athrow
    //   19691: getstatic Perryc.1 : I
    //   19694: ifeq -> 19708
    //   19697: ldc2_w -2062035862
    //   19700: l2i
    //   19701: ldc_w 128814540
    //   19704: ixor
    //   19705: goto -> 19716
    //   19708: ldc2_w 376641203
    //   19711: l2i
    //   19712: ldc_w -1565189408
    //   19715: ixor
    //   19716: ldc2_w 2056390557
    //   19719: l2i
    //   19720: ldc_w 1786784029
    //   19723: ixor
    //   19724: ixor
    //   19725: lookupswitch default -> 35499, -1834453210 -> 19708, -1529601325 -> 19752
    //   19752: astore #9
    //   19754: getstatic Perryc.1 : I
    //   19757: ifeq -> 19771
    //   19760: ldc2_w -456871542
    //   19763: l2i
    //   19764: ldc_w -2025164539
    //   19767: ixor
    //   19768: goto -> 19779
    //   19771: ldc2_w -670935052
    //   19774: l2i
    //   19775: ldc_w 1799992347
    //   19778: ixor
    //   19779: ldc2_w 566031306
    //   19782: l2i
    //   19783: ldc_w -1358767898
    //   19786: ixor
    //   19787: ixor
    //   19788: lookupswitch default -> 19816, -315561053 -> 34941, 1980852547 -> 19771
    //   19816: aload #9
    //   19818: getstatic Perryc.1 : I
    //   19821: ifeq -> 19835
    //   19824: ldc2_w -506812510
    //   19827: l2i
    //   19828: ldc_w 666735562
    //   19831: ixor
    //   19832: goto -> 19843
    //   19835: ldc2_w -2099513493
    //   19838: l2i
    //   19839: ldc_w 1560901052
    //   19842: ixor
    //   19843: ldc2_w 275567229
    //   19846: l2i
    //   19847: ldc_w -1057090207
    //   19850: ixor
    //   19851: ixor
    //   19852: lookupswitch default -> 19880, 384168820 -> 35415, 454099047 -> 19835
    //   19880: goto -> 19884
    //   19883: athrow
    //   19884: invokevirtual intValue : ()I
    //   19887: goto -> 19891
    //   19890: athrow
    //   19891: ldc2_w -2126263671
    //   19894: l2i
    //   19895: ldc_w -2126263571
    //   19898: ixor
    //   19899: if_icmplt -> 19913
    //   19902: ldc2_w 71026775
    //   19905: l2i
    //   19906: ldc_w -783345712
    //   19909: ixor
    //   19910: goto -> 19921
    //   19913: ldc2_w -192524932
    //   19916: l2i
    //   19917: ldc_w 569545466
    //   19920: ixor
    //   19921: ldc2_w -915410706
    //   19924: l2i
    //   19925: ldc_w -2012749235
    //   19928: ixor
    //   19929: ixor
    //   19930: tableswitch default -> 19902, -1810051804 -> 19952, -1810051803 -> 20058
    //   19952: ldc2_w -9149337
    //   19955: l2i
    //   19956: ldc_w -9149337
    //   19959: ixor
    //   19960: ldc2_w 32117016
    //   19963: l2i
    //   19964: ldc_w 32117223
    //   19967: ixor
    //   19968: ldc2_w -187141211
    //   19971: l2i
    //   19972: ldc_w -187141211
    //   19975: ixor
    //   19976: ldc2_w 644796855
    //   19979: l2i
    //   19980: ldc_w 644796744
    //   19983: ixor
    //   19984: getstatic Perryc.1 : I
    //   19987: ifeq -> 20001
    //   19990: ldc2_w 1376260972
    //   19993: l2i
    //   19994: ldc_w -1331961775
    //   19997: ixor
    //   19998: goto -> 20009
    //   20001: ldc2_w 1877446177
    //   20004: l2i
    //   20005: ldc_w 1163204532
    //   20008: ixor
    //   20009: ldc2_w -667514926
    //   20012: l2i
    //   20013: ldc_w 1891819298
    //   20016: ixor
    //   20017: ixor
    //   20018: lookupswitch default -> 35525, -2109292187 -> 20044, 1248308173 -> 20001
    //   20044: goto -> 20048
    //   20047: athrow
    //   20048: invokestatic toRGBA : (IIII)I
    //   20051: goto -> 20055
    //   20054: athrow
    //   20055: goto -> 20467
    //   20058: getstatic Perryc.c : I
    //   20061: iflt -> 20075
    //   20064: ldc2_w 1502968388
    //   20067: l2i
    //   20068: ldc_w -113231489
    //   20071: ixor
    //   20072: goto -> 20083
    //   20075: ldc2_w 492164404
    //   20078: l2i
    //   20079: ldc_w -1297999069
    //   20082: ixor
    //   20083: ldc2_w 1235652322
    //   20086: l2i
    //   20087: ldc_w 940476912
    //   20090: ixor
    //   20091: ixor
    //   20092: lookupswitch default -> 20120, -780319703 -> 35005, 1492697785 -> 20075
    //   20120: aload #9
    //   20122: getstatic Perryc.0 : I
    //   20125: ifle -> 20139
    //   20128: ldc2_w -826324727
    //   20131: l2i
    //   20132: ldc_w 1303234791
    //   20135: ixor
    //   20136: goto -> 20147
    //   20139: ldc2_w -1937403459
    //   20142: l2i
    //   20143: ldc_w 1156096306
    //   20146: ixor
    //   20147: ldc2_w -2104997397
    //   20150: l2i
    //   20151: ldc_w 526628851
    //   20154: ixor
    //   20155: ixor
    //   20156: lookupswitch default -> 35563, 519667702 -> 20139, 1434898071 -> 20184
    //   20184: goto -> 20188
    //   20187: athrow
    //   20188: invokevirtual intValue : ()I
    //   20191: goto -> 20195
    //   20194: athrow
    //   20195: ldc2_w 753261441
    //   20198: l2i
    //   20199: ldc_w 753261491
    //   20202: ixor
    //   20203: if_icmple -> 20217
    //   20206: ldc2_w -1420658515
    //   20209: l2i
    //   20210: ldc_w 1570672857
    //   20213: ixor
    //   20214: goto -> 20225
    //   20217: ldc2_w -548144576
    //   20220: l2i
    //   20221: ldc_w 698290739
    //   20224: ixor
    //   20225: ldc2_w -1840745128
    //   20228: l2i
    //   20229: ldc_w 824992695
    //   20232: ixor
    //   20233: ixor
    //   20234: tableswitch default -> 20206, 1437138587 -> 20256, 1437138588 -> 20362
    //   20256: ldc2_w 45713040
    //   20259: l2i
    //   20260: ldc_w 45713007
    //   20263: ixor
    //   20264: ldc2_w 1104842338
    //   20267: l2i
    //   20268: ldc_w 1104842397
    //   20271: ixor
    //   20272: ldc2_w 969956388
    //   20275: l2i
    //   20276: ldc_w 969956388
    //   20279: ixor
    //   20280: ldc2_w -800247681
    //   20283: l2i
    //   20284: ldc_w -800247680
    //   20287: ixor
    //   20288: getstatic Perryc.0 : I
    //   20291: ifle -> 20305
    //   20294: ldc2_w -1261724133
    //   20297: l2i
    //   20298: ldc_w -582282113
    //   20301: ixor
    //   20302: goto -> 20313
    //   20305: ldc2_w -290684824
    //   20308: l2i
    //   20309: ldc_w 1667359638
    //   20312: ixor
    //   20313: ldc2_w 1802149881
    //   20316: l2i
    //   20317: ldc_w 378516295
    //   20320: ixor
    //   20321: ixor
    //   20322: lookupswitch default -> 20348, -1697368845 -> 20305, 342206170 -> 35185
    //   20348: goto -> 20352
    //   20351: athrow
    //   20352: invokestatic toRGBA : (IIII)I
    //   20355: goto -> 20359
    //   20358: athrow
    //   20359: goto -> 20467
    //   20362: ldc2_w -113634867
    //   20365: l2i
    //   20366: ldc_w -113635022
    //   20369: ixor
    //   20370: ldc2_w -1728082746
    //   20373: l2i
    //   20374: ldc_w -1728082887
    //   20377: ixor
    //   20378: ldc2_w -1110615705
    //   20381: l2i
    //   20382: ldc_w -1110615656
    //   20385: ixor
    //   20386: ldc2_w -1564720434
    //   20389: l2i
    //   20390: ldc_w -1564720591
    //   20393: ixor
    //   20394: getstatic Perryc.1 : I
    //   20397: ifeq -> 20411
    //   20400: ldc2_w -980298104
    //   20403: l2i
    //   20404: ldc_w 1784003625
    //   20407: ixor
    //   20408: goto -> 20419
    //   20411: ldc2_w 924399195
    //   20414: l2i
    //   20415: ldc_w 1690909525
    //   20418: ixor
    //   20419: ldc2_w 139291965
    //   20422: l2i
    //   20423: ldc_w 1748627872
    //   20426: ixor
    //   20427: ixor
    //   20428: lookupswitch default -> 34943, -810486212 -> 20411, 866423187 -> 20456
    //   20456: goto -> 20460
    //   20459: athrow
    //   20460: invokestatic toRGBA : (IIII)I
    //   20463: goto -> 20467
    //   20466: athrow
    //   20467: getstatic Perryc.0 : I
    //   20470: ifle -> 20484
    //   20473: ldc2_w 1511538374
    //   20476: l2i
    //   20477: ldc_w -1272707935
    //   20480: ixor
    //   20481: goto -> 20492
    //   20484: ldc2_w 424884107
    //   20487: l2i
    //   20488: ldc_w 1673859532
    //   20491: ixor
    //   20492: ldc2_w -1835074010
    //   20495: l2i
    //   20496: ldc_w -382111043
    //   20499: ixor
    //   20500: ixor
    //   20501: lookupswitch default -> 35297, -1784957188 -> 20484, 20032220 -> 20528
    //   20528: istore #10
    //   20530: getstatic Perryc.1 : I
    //   20533: ifeq -> 20547
    //   20536: ldc2_w 296989690
    //   20539: l2i
    //   20540: ldc_w 853051725
    //   20543: ixor
    //   20544: goto -> 20555
    //   20547: ldc2_w 1329781877
    //   20550: l2i
    //   20551: ldc_w -1005529267
    //   20554: ixor
    //   20555: ldc2_w -74537421
    //   20558: l2i
    //   20559: ldc_w -927325945
    //   20562: ixor
    //   20563: ixor
    //   20564: lookupswitch default -> 20592, -1232099633 -> 20547, 274709891 -> 34931
    //   20592: iload #5
    //   20594: ldc2_w -1082055435
    //   20597: l2i
    //   20598: ldc_w -1082055440
    //   20601: ixor
    //   20602: if_icmpgt -> 20616
    //   20605: ldc2_w 1182775908
    //   20608: l2i
    //   20609: ldc_w -617128035
    //   20612: ixor
    //   20613: goto -> 20624
    //   20616: ldc2_w 569550861
    //   20619: l2i
    //   20620: ldc_w -1128641033
    //   20623: ixor
    //   20624: ldc2_w -2000168429
    //   20627: l2i
    //   20628: ldc_w -1390249909
    //   20631: ixor
    //   20632: ixor
    //   20633: tableswitch default -> 20605, -1196603487 -> 20656, -1196603486 -> 20762
    //   20656: ldc2_w 968315672
    //   20659: l2i
    //   20660: ldc_w 968315879
    //   20663: ixor
    //   20664: ldc2_w 2027071635
    //   20667: l2i
    //   20668: ldc_w 2027071635
    //   20671: ixor
    //   20672: ldc2_w 626174318
    //   20675: l2i
    //   20676: ldc_w 626174318
    //   20679: ixor
    //   20680: ldc2_w 1179227639
    //   20683: l2i
    //   20684: ldc_w 1179227400
    //   20687: ixor
    //   20688: getstatic Perryc.0 : I
    //   20691: ifle -> 20705
    //   20694: ldc2_w -1796197336
    //   20697: l2i
    //   20698: ldc_w -57640189
    //   20701: ixor
    //   20702: goto -> 20713
    //   20705: ldc2_w -1507451416
    //   20708: l2i
    //   20709: ldc_w -165191810
    //   20712: ixor
    //   20713: ldc2_w 204925073
    //   20716: l2i
    //   20717: ldc_w -2018763218
    //   20720: ixor
    //   20721: ixor
    //   20722: lookupswitch default -> 20748, -1969937959 -> 20705, -470107756 -> 34999
    //   20748: goto -> 20752
    //   20751: athrow
    //   20752: invokestatic toRGBA : (IIII)I
    //   20755: goto -> 20759
    //   20758: athrow
    //   20759: goto -> 22027
    //   20762: getstatic Perryc.c : I
    //   20765: iflt -> 20779
    //   20768: ldc2_w 1100230329
    //   20771: l2i
    //   20772: ldc_w -1062967818
    //   20775: ixor
    //   20776: goto -> 20787
    //   20779: ldc2_w -2007020621
    //   20782: l2i
    //   20783: ldc_w 1427247031
    //   20786: ixor
    //   20787: ldc2_w -2104520104
    //   20790: l2i
    //   20791: ldc_w -2093129044
    //   20794: ixor
    //   20795: ixor
    //   20796: lookupswitch default -> 35021, -2138915909 -> 20779, -587221776 -> 20824
    //   20824: iload #5
    //   20826: ldc2_w 1397087408
    //   20829: l2i
    //   20830: ldc_w 1397087418
    //   20833: ixor
    //   20834: if_icmpge -> 20848
    //   20837: ldc2_w -1110488497
    //   20840: l2i
    //   20841: ldc_w 1771218340
    //   20844: ixor
    //   20845: goto -> 20856
    //   20848: ldc2_w -2086700431
    //   20851: l2i
    //   20852: ldc_w 1472370073
    //   20855: ixor
    //   20856: ldc2_w -1637188220
    //   20859: l2i
    //   20860: ldc_w 491926134
    //   20863: ixor
    //   20864: ixor
    //   20865: tableswitch default -> 20837, 1466277913 -> 20888, 1466277914 -> 20994
    //   20888: ldc2_w -608184969
    //   20891: l2i
    //   20892: ldc_w -608184952
    //   20895: ixor
    //   20896: ldc2_w 2116232786
    //   20899: l2i
    //   20900: ldc_w 2116232758
    //   20903: ixor
    //   20904: ldc2_w 456897925
    //   20907: l2i
    //   20908: ldc_w 456897925
    //   20911: ixor
    //   20912: ldc2_w 226294638
    //   20915: l2i
    //   20916: ldc_w 226294673
    //   20919: ixor
    //   20920: getstatic Perryc.c : I
    //   20923: iflt -> 20937
    //   20926: ldc2_w 1406511329
    //   20929: l2i
    //   20930: ldc_w -1055897021
    //   20933: ixor
    //   20934: goto -> 20945
    //   20937: ldc2_w -758915353
    //   20940: l2i
    //   20941: ldc_w -681309801
    //   20944: ixor
    //   20945: ldc2_w 1306843137
    //   20948: l2i
    //   20949: ldc_w -1108080654
    //   20952: ixor
    //   20953: ixor
    //   20954: lookupswitch default -> 20980, -1196658372 -> 20937, 1658142033 -> 34765
    //   20980: goto -> 20984
    //   20983: athrow
    //   20984: invokestatic toRGBA : (IIII)I
    //   20987: goto -> 20991
    //   20990: athrow
    //   20991: goto -> 22027
    //   20994: getstatic Perryc.c : I
    //   20997: iflt -> 21011
    //   21000: ldc2_w -285646474
    //   21003: l2i
    //   21004: ldc_w 637611770
    //   21007: ixor
    //   21008: goto -> 21019
    //   21011: ldc2_w 1473240594
    //   21014: l2i
    //   21015: ldc_w 566600843
    //   21018: ixor
    //   21019: ldc2_w 229962634
    //   21022: l2i
    //   21023: ldc_w -1904482299
    //   21026: ixor
    //   21027: ixor
    //   21028: lookupswitch default -> 21056, 1261917187 -> 35483, 1529936257 -> 21011
    //   21056: iload #5
    //   21058: ldc2_w 641133920
    //   21061: l2i
    //   21062: ldc_w 641133940
    //   21065: ixor
    //   21066: if_icmpge -> 21080
    //   21069: ldc2_w -439796812
    //   21072: l2i
    //   21073: ldc_w -1593354000
    //   21076: ixor
    //   21077: goto -> 21088
    //   21080: ldc2_w 1342077870
    //   21083: l2i
    //   21084: ldc_w 187701481
    //   21087: ixor
    //   21088: ldc2_w 1016205500
    //   21091: l2i
    //   21092: ldc_w -1070065895
    //   21095: ixor
    //   21096: ixor
    //   21097: tableswitch default -> 21069, -1201380127 -> 21120, -1201380126 -> 21226
    //   21120: ldc2_w -121089518
    //   21123: l2i
    //   21124: ldc_w -121089299
    //   21127: ixor
    //   21128: ldc2_w -2010822968
    //   21131: l2i
    //   21132: ldc_w -2010823074
    //   21135: ixor
    //   21136: ldc2_w -1885453473
    //   21139: l2i
    //   21140: ldc_w -1885453473
    //   21143: ixor
    //   21144: ldc2_w -750362588
    //   21147: l2i
    //   21148: ldc_w -750362405
    //   21151: ixor
    //   21152: getstatic Perryc.c : I
    //   21155: iflt -> 21169
    //   21158: ldc2_w 1085102044
    //   21161: l2i
    //   21162: ldc_w 29578854
    //   21165: ixor
    //   21166: goto -> 21177
    //   21169: ldc2_w -1429059058
    //   21172: l2i
    //   21173: ldc_w -1108630522
    //   21176: ixor
    //   21177: ldc2_w 1786974658
    //   21180: l2i
    //   21181: ldc_w 869820826
    //   21184: ixor
    //   21185: ixor
    //   21186: lookupswitch default -> 35137, 406157794 -> 21169, 1315083856 -> 21212
    //   21212: goto -> 21216
    //   21215: athrow
    //   21216: invokestatic toRGBA : (IIII)I
    //   21219: goto -> 21223
    //   21222: athrow
    //   21223: goto -> 22027
    //   21226: getstatic Perryc.0 : I
    //   21229: ifle -> 21243
    //   21232: ldc2_w 1651633350
    //   21235: l2i
    //   21236: ldc_w -1016146852
    //   21239: ixor
    //   21240: goto -> 21251
    //   21243: ldc2_w -1862425147
    //   21246: l2i
    //   21247: ldc_w 62704323
    //   21250: ixor
    //   21251: ldc2_w -1318753593
    //   21254: l2i
    //   21255: ldc_w -680915230
    //   21258: ixor
    //   21259: ixor
    //   21260: lookupswitch default -> 21288, -955228993 -> 34727, 1405594586 -> 21243
    //   21288: iload #5
    //   21290: ldc2_w 1301571635
    //   21293: l2i
    //   21294: ldc_w 1301571629
    //   21297: ixor
    //   21298: if_icmpge -> 21312
    //   21301: ldc2_w -1162326712
    //   21304: l2i
    //   21305: ldc_w -1867746117
    //   21308: ixor
    //   21309: goto -> 21320
    //   21312: ldc2_w 742817111
    //   21315: l2i
    //   21316: ldc_w 106054821
    //   21319: ixor
    //   21320: ldc2_w 659113959
    //   21323: l2i
    //   21324: ldc_w -1700752832
    //   21327: ixor
    //   21328: ixor
    //   21329: tableswitch default -> 21301, -1744966572 -> 21352, -1744966571 -> 21458
    //   21352: ldc2_w -146041683
    //   21355: l2i
    //   21356: ldc_w -146041774
    //   21359: ixor
    //   21360: ldc2_w 861170817
    //   21363: l2i
    //   21364: ldc_w 861170761
    //   21367: ixor
    //   21368: ldc2_w -2005958432
    //   21371: l2i
    //   21372: ldc_w -2005958432
    //   21375: ixor
    //   21376: ldc2_w -975506328
    //   21379: l2i
    //   21380: ldc_w -975506281
    //   21383: ixor
    //   21384: getstatic Perryc.0 : I
    //   21387: ifle -> 21401
    //   21390: ldc2_w 1253707469
    //   21393: l2i
    //   21394: ldc_w 1783085950
    //   21397: ixor
    //   21398: goto -> 21409
    //   21401: ldc2_w 1145980710
    //   21404: l2i
    //   21405: ldc_w 1847850659
    //   21408: ixor
    //   21409: ldc2_w -1304015584
    //   21412: l2i
    //   21413: ldc_w -1616699357
    //   21416: ixor
    //   21417: ixor
    //   21418: lookupswitch default -> 21444, -961790466 -> 21401, 219732144 -> 34701
    //   21444: goto -> 21448
    //   21447: athrow
    //   21448: invokestatic toRGBA : (IIII)I
    //   21451: goto -> 21455
    //   21454: athrow
    //   21455: goto -> 22027
    //   21458: getstatic Perryc.1 : I
    //   21461: ifeq -> 21475
    //   21464: ldc2_w 476699635
    //   21467: l2i
    //   21468: ldc_w -2046563986
    //   21471: ixor
    //   21472: goto -> 21483
    //   21475: ldc2_w -1905089463
    //   21478: l2i
    //   21479: ldc_w 417780611
    //   21482: ixor
    //   21483: ldc2_w -966325410
    //   21486: l2i
    //   21487: ldc_w 538634767
    //   21490: ixor
    //   21491: ixor
    //   21492: lookupswitch default -> 35439, 1894356635 -> 21520, 2081936332 -> 21475
    //   21520: iload #5
    //   21522: ldc2_w -955796098
    //   21525: l2i
    //   21526: ldc_w -955796148
    //   21529: ixor
    //   21530: if_icmpge -> 21544
    //   21533: ldc2_w -1738358433
    //   21536: l2i
    //   21537: ldc_w -2027009021
    //   21540: ixor
    //   21541: goto -> 21552
    //   21544: ldc2_w -1603105521
    //   21547: l2i
    //   21548: ldc_w -1086455732
    //   21551: ixor
    //   21552: ldc2_w -1547985666
    //   21555: l2i
    //   21556: ldc_w -873195699
    //   21559: ixor
    //   21560: ixor
    //   21561: tableswitch default -> 21533, 1996687087 -> 21584, 1996687088 -> 21690
    //   21584: ldc2_w -475819722
    //   21587: l2i
    //   21588: ldc_w -475819575
    //   21591: ixor
    //   21592: ldc2_w 2004139887
    //   21595: l2i
    //   21596: ldc_w 2004139920
    //   21599: ixor
    //   21600: ldc2_w 1454254234
    //   21603: l2i
    //   21604: ldc_w 1454254234
    //   21607: ixor
    //   21608: ldc2_w 967269506
    //   21611: l2i
    //   21612: ldc_w 967269501
    //   21615: ixor
    //   21616: getstatic Perryc.c : I
    //   21619: iflt -> 21633
    //   21622: ldc2_w -452303380
    //   21625: l2i
    //   21626: ldc_w 212092637
    //   21629: ixor
    //   21630: goto -> 21641
    //   21633: ldc2_w -846758890
    //   21636: l2i
    //   21637: ldc_w -1201504513
    //   21640: ixor
    //   21641: ldc2_w -2097886387
    //   21644: l2i
    //   21645: ldc_w -455502489
    //   21648: ixor
    //   21649: ixor
    //   21650: lookupswitch default -> 21676, -1887208165 -> 35459, 1035439479 -> 21633
    //   21676: goto -> 21680
    //   21679: athrow
    //   21680: invokestatic toRGBA : (IIII)I
    //   21683: goto -> 21687
    //   21686: athrow
    //   21687: goto -> 22027
    //   21690: getstatic Perryc.c : I
    //   21693: iflt -> 21707
    //   21696: ldc2_w -120098261
    //   21699: l2i
    //   21700: ldc_w 1037201935
    //   21703: ixor
    //   21704: goto -> 21715
    //   21707: ldc2_w -1846377199
    //   21710: l2i
    //   21711: ldc_w -1287967368
    //   21714: ixor
    //   21715: ldc2_w -482708924
    //   21718: l2i
    //   21719: ldc_w 1101682693
    //   21722: ixor
    //   21723: ixor
    //   21724: lookupswitch default -> 21752, -254173996 -> 21707, 1737828965 -> 35365
    //   21752: iload #5
    //   21754: ldc2_w 877276674
    //   21757: l2i
    //   21758: ldc_w 877276774
    //   21761: ixor
    //   21762: if_icmpge -> 21776
    //   21765: ldc2_w -1316143999
    //   21768: l2i
    //   21769: ldc_w 2035458525
    //   21772: ixor
    //   21773: goto -> 21784
    //   21776: ldc2_w -835730015
    //   21779: l2i
    //   21780: ldc_w 116414714
    //   21783: ixor
    //   21784: ldc2_w 1828273941
    //   21787: l2i
    //   21788: ldc_w 2023933858
    //   21791: ixor
    //   21792: ixor
    //   21793: tableswitch default -> 21765, -595302933 -> 21816, -595302932 -> 21922
    //   21816: ldc2_w 2023207708
    //   21819: l2i
    //   21820: ldc_w 2023207818
    //   21823: ixor
    //   21824: ldc2_w -26127267
    //   21827: l2i
    //   21828: ldc_w -26127198
    //   21831: ixor
    //   21832: ldc2_w -1330426692
    //   21835: l2i
    //   21836: ldc_w -1330426692
    //   21839: ixor
    //   21840: ldc2_w 747413243
    //   21843: l2i
    //   21844: ldc_w 747412996
    //   21847: ixor
    //   21848: getstatic Perryc.c : I
    //   21851: iflt -> 21865
    //   21854: ldc2_w -1158806476
    //   21857: l2i
    //   21858: ldc_w -1154020418
    //   21861: ixor
    //   21862: goto -> 21873
    //   21865: ldc2_w 301696601
    //   21868: l2i
    //   21869: ldc_w 1018207371
    //   21872: ixor
    //   21873: ldc2_w -1435106883
    //   21876: l2i
    //   21877: ldc_w 1420180610
    //   21880: ixor
    //   21881: ixor
    //   21882: lookupswitch default -> 35589, -744806419 -> 21908, -16174411 -> 21865
    //   21908: goto -> 21912
    //   21911: athrow
    //   21912: invokestatic toRGBA : (IIII)I
    //   21915: goto -> 21919
    //   21918: athrow
    //   21919: goto -> 22027
    //   21922: ldc2_w -199661462
    //   21925: l2i
    //   21926: ldc_w -199661419
    //   21929: ixor
    //   21930: ldc2_w -615459110
    //   21933: l2i
    //   21934: ldc_w -615459291
    //   21937: ixor
    //   21938: ldc2_w -239536706
    //   21941: l2i
    //   21942: ldc_w -239536831
    //   21945: ixor
    //   21946: ldc2_w 908583752
    //   21949: l2i
    //   21950: ldc_w 908583863
    //   21953: ixor
    //   21954: getstatic Perryc.0 : I
    //   21957: ifle -> 21971
    //   21960: ldc2_w 368069927
    //   21963: l2i
    //   21964: ldc_w -1515401686
    //   21967: ixor
    //   21968: goto -> 21979
    //   21971: ldc2_w 197864508
    //   21974: l2i
    //   21975: ldc_w -1317323840
    //   21978: ixor
    //   21979: ldc2_w 982604609
    //   21982: l2i
    //   21983: ldc_w -2123696524
    //   21986: ixor
    //   21987: ixor
    //   21988: lookupswitch default -> 35363, 21740233 -> 22016, 195505720 -> 21971
    //   22016: goto -> 22020
    //   22019: athrow
    //   22020: invokestatic toRGBA : (IIII)I
    //   22023: goto -> 22027
    //   22026: athrow
    //   22027: getstatic Perryc.0 : I
    //   22030: ifle -> 22044
    //   22033: ldc2_w 114665621
    //   22036: l2i
    //   22037: ldc_w -1326587410
    //   22040: ixor
    //   22041: goto -> 22052
    //   22044: ldc2_w -324281186
    //   22047: l2i
    //   22048: ldc_w -588604269
    //   22051: ixor
    //   22052: ldc2_w 651856551
    //   22055: l2i
    //   22056: ldc_w -767574895
    //   22059: ixor
    //   22060: ixor
    //   22061: lookupswitch default -> 34911, -995854789 -> 22088, 1121812301 -> 22044
    //   22088: istore #11
    //   22090: getstatic Perryc.1 : I
    //   22093: ifeq -> 22107
    //   22096: ldc2_w -733501067
    //   22099: l2i
    //   22100: ldc_w -892665831
    //   22103: ixor
    //   22104: goto -> 22115
    //   22107: ldc2_w -771743586
    //   22110: l2i
    //   22111: ldc_w -973595448
    //   22114: ixor
    //   22115: ldc2_w -532660968
    //   22118: l2i
    //   22119: ldc_w 982915394
    //   22122: ixor
    //   22123: ixor
    //   22124: lookupswitch default -> 22152, -1000698570 -> 35219, -586352362 -> 22107
    //   22152: aload_0
    //   22153: getstatic Perryc.c : I
    //   22156: iflt -> 22170
    //   22159: ldc2_w 133490443
    //   22162: l2i
    //   22163: ldc_w -1906348154
    //   22166: ixor
    //   22167: goto -> 22178
    //   22170: ldc2_w 1365425443
    //   22173: l2i
    //   22174: ldc_w -1501230944
    //   22177: ixor
    //   22178: ldc2_w 159402864
    //   22181: l2i
    //   22182: ldc_w -588141023
    //   22185: ixor
    //   22186: ixor
    //   22187: lookupswitch default -> 34761, 580276434 -> 22212, 1557818844 -> 22170
    //   22212: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   22215: new java/lang/StringBuilder
    //   22218: dup
    //   22219: getstatic Perryc.1 : I
    //   22222: ifeq -> 22236
    //   22225: ldc2_w -437415254
    //   22228: l2i
    //   22229: ldc_w -990289990
    //   22232: ixor
    //   22233: goto -> 22244
    //   22236: ldc2_w 292398313
    //   22239: l2i
    //   22240: ldc_w 1085127521
    //   22243: ixor
    //   22244: ldc2_w 977488672
    //   22247: l2i
    //   22248: ldc_w 1598835307
    //   22251: ixor
    //   22252: ixor
    //   22253: lookupswitch default -> 22280, -788283001 -> 22236, 1142672475 -> 35489
    //   22280: goto -> 22284
    //   22283: athrow
    //   22284: invokespecial <init> : ()V
    //   22287: goto -> 22291
    //   22290: athrow
    //   22291: ldc_w '냝㌖낞ꬋ겶幁ร촘'
    //   22294: getstatic Perryc.0 : I
    //   22297: ifle -> 22311
    //   22300: ldc2_w -949004182
    //   22303: l2i
    //   22304: ldc_w 1427724474
    //   22307: ixor
    //   22308: goto -> 22319
    //   22311: ldc2_w 2075049500
    //   22314: l2i
    //   22315: ldc_w 627229481
    //   22318: ixor
    //   22319: ldc2_w -1109687799
    //   22322: l2i
    //   22323: ldc_w -2141080719
    //   22326: ixor
    //   22327: ixor
    //   22328: lookupswitch default -> 22356, -1345572440 -> 35579, 968368373 -> 22311
    //   22356: goto -> 22360
    //   22359: athrow
    //   22360: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   22363: goto -> 22367
    //   22366: athrow
    //   22367: getstatic Perryc.1 : I
    //   22370: ifeq -> 22384
    //   22373: ldc2_w -1159721983
    //   22376: l2i
    //   22377: ldc_w 1780013291
    //   22380: ixor
    //   22381: goto -> 22392
    //   22384: ldc2_w 780666490
    //   22387: l2i
    //   22388: ldc_w -532361971
    //   22391: ixor
    //   22392: ldc2_w 1522032390
    //   22395: l2i
    //   22396: ldc_w -376834029
    //   22399: ixor
    //   22400: ixor
    //   22401: lookupswitch default -> 35389, 1674146815 -> 22384, 2113760354 -> 22428
    //   22428: goto -> 22432
    //   22431: athrow
    //   22432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22435: goto -> 22439
    //   22438: athrow
    //   22439: getstatic Perryc.1 : I
    //   22442: ifeq -> 22456
    //   22445: ldc2_w -320703941
    //   22448: l2i
    //   22449: ldc_w -2074093366
    //   22452: ixor
    //   22453: goto -> 22464
    //   22456: ldc2_w 2127806630
    //   22459: l2i
    //   22460: ldc_w -1298731830
    //   22463: ixor
    //   22464: ldc2_w -1264146284
    //   22467: l2i
    //   22468: ldc_w -1207564811
    //   22471: ixor
    //   22472: ixor
    //   22473: lookupswitch default -> 34755, -1058701043 -> 22500, 1679624080 -> 22456
    //   22500: fload #6
    //   22502: getstatic Perryc.c : I
    //   22505: iflt -> 22519
    //   22508: ldc2_w 1607420451
    //   22511: l2i
    //   22512: ldc_w -26323477
    //   22515: ixor
    //   22516: goto -> 22527
    //   22519: ldc2_w -1278910429
    //   22522: l2i
    //   22523: ldc_w -1595673363
    //   22526: ixor
    //   22527: ldc2_w -1578429341
    //   22530: l2i
    //   22531: ldc_w 819191644
    //   22534: ixor
    //   22535: ixor
    //   22536: lookupswitch default -> 22564, 800007548 -> 22519, 815387895 -> 34843
    //   22564: goto -> 22568
    //   22567: athrow
    //   22568: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   22571: goto -> 22575
    //   22574: athrow
    //   22575: getstatic Perryc.c : I
    //   22578: iflt -> 22592
    //   22581: ldc2_w -1255180829
    //   22584: l2i
    //   22585: ldc_w -151694461
    //   22588: ixor
    //   22589: goto -> 22600
    //   22592: ldc2_w -492410749
    //   22595: l2i
    //   22596: ldc_w -87543760
    //   22599: ixor
    //   22600: ldc2_w -615755551
    //   22603: l2i
    //   22604: ldc_w -1963464916
    //   22607: ixor
    //   22608: ixor
    //   22609: lookupswitch default -> 22636, -913857649 -> 22592, 308384173 -> 34863
    //   22636: goto -> 22640
    //   22639: athrow
    //   22640: invokevirtual toString : ()Ljava/lang/String;
    //   22643: goto -> 22647
    //   22646: athrow
    //   22647: getstatic Perryc.c : I
    //   22650: iflt -> 22664
    //   22653: ldc2_w -573952503
    //   22656: l2i
    //   22657: ldc_w -1747289041
    //   22660: ixor
    //   22661: goto -> 22672
    //   22664: ldc2_w 1882434589
    //   22667: l2i
    //   22668: ldc_w 1792089423
    //   22671: ixor
    //   22672: ldc2_w 127959693
    //   22675: l2i
    //   22676: ldc_w -1158833490
    //   22679: ixor
    //   22680: ixor
    //   22681: lookupswitch default -> 22708, -144881147 -> 35521, 1144953932 -> 22664
    //   22708: aload_0
    //   22709: getstatic Perryc.0 : I
    //   22712: ifle -> 22726
    //   22715: ldc2_w 1802612951
    //   22718: l2i
    //   22719: ldc_w -368150555
    //   22722: ixor
    //   22723: goto -> 22734
    //   22726: ldc2_w 1996258039
    //   22729: l2i
    //   22730: ldc_w 1306448633
    //   22733: ixor
    //   22734: ldc2_w -206242792
    //   22737: l2i
    //   22738: ldc_w 1683316007
    //   22741: ixor
    //   22742: ixor
    //   22743: lookupswitch default -> 22768, -71556697 -> 22726, 379479565 -> 35197
    //   22768: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22771: getstatic Perryc.0 : I
    //   22774: ifle -> 22788
    //   22777: ldc2_w -1204014822
    //   22780: l2i
    //   22781: ldc_w 1109867354
    //   22784: ixor
    //   22785: goto -> 22796
    //   22788: ldc2_w 1016197162
    //   22791: l2i
    //   22792: ldc_w -1882728163
    //   22795: ixor
    //   22796: ldc2_w 776834622
    //   22799: l2i
    //   22800: ldc_w 519511893
    //   22803: ixor
    //   22804: ixor
    //   22805: lookupswitch default -> 35205, -2081638308 -> 22832, -895378645 -> 22788
    //   22832: goto -> 22836
    //   22835: athrow
    //   22836: invokevirtual getValue : ()Ljava/lang/Object;
    //   22839: goto -> 22843
    //   22842: athrow
    //   22843: checkcast java/lang/Integer
    //   22846: getstatic Perryc.c : I
    //   22849: iflt -> 22863
    //   22852: ldc2_w 2126908827
    //   22855: l2i
    //   22856: ldc_w 1241117233
    //   22859: ixor
    //   22860: goto -> 22871
    //   22863: ldc2_w -378289132
    //   22866: l2i
    //   22867: ldc_w 1873191458
    //   22870: ixor
    //   22871: ldc2_w -2105912680
    //   22874: l2i
    //   22875: ldc_w 796536234
    //   22878: ixor
    //   22879: ixor
    //   22880: lookupswitch default -> 35497, -1707114344 -> 22863, 735385860 -> 22908
    //   22908: goto -> 22912
    //   22911: athrow
    //   22912: invokevirtual intValue : ()I
    //   22915: goto -> 22919
    //   22918: athrow
    //   22919: ldc2_w -1888684695
    //   22922: l2i
    //   22923: ldc_w -1888684715
    //   22926: ixor
    //   22927: iadd
    //   22928: i2f
    //   22929: getstatic Perryc.0 : I
    //   22932: ifle -> 22946
    //   22935: ldc2_w -618813715
    //   22938: l2i
    //   22939: ldc_w -716325766
    //   22942: ixor
    //   22943: goto -> 22954
    //   22946: ldc2_w 1785353471
    //   22949: l2i
    //   22950: ldc_w 1677311934
    //   22953: ixor
    //   22954: ldc2_w 1333779907
    //   22957: l2i
    //   22958: ldc_w 1347385733
    //   22961: ixor
    //   22962: ixor
    //   22963: lookupswitch default -> 34743, 291552977 -> 22946, 379801351 -> 22988
    //   22988: aload_0
    //   22989: getstatic Perryc.0 : I
    //   22992: ifle -> 23006
    //   22995: ldc2_w 1720011998
    //   22998: l2i
    //   22999: ldc_w 1156572904
    //   23002: ixor
    //   23003: goto -> 23014
    //   23006: ldc2_w -811735453
    //   23009: l2i
    //   23010: ldc_w -1759050964
    //   23013: ixor
    //   23014: ldc2_w 1473803029
    //   23017: l2i
    //   23018: ldc_w -1749738825
    //   23021: ixor
    //   23022: ixor
    //   23023: lookupswitch default -> 23048, -2017765204 -> 23006, -502807660 -> 35591
    //   23048: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23051: getstatic Perryc.1 : I
    //   23054: ifeq -> 23068
    //   23057: ldc2_w 731062827
    //   23060: l2i
    //   23061: ldc_w 1759424908
    //   23064: ixor
    //   23065: goto -> 23076
    //   23068: ldc2_w 1472753748
    //   23071: l2i
    //   23072: ldc_w 851861301
    //   23075: ixor
    //   23076: ldc2_w -1705536044
    //   23079: l2i
    //   23080: ldc_w -1465286736
    //   23083: ixor
    //   23084: ixor
    //   23085: lookupswitch default -> 23112, -2093268078 -> 23068, 1907587523 -> 35001
    //   23112: goto -> 23116
    //   23115: athrow
    //   23116: invokevirtual getValue : ()Ljava/lang/Object;
    //   23119: goto -> 23123
    //   23122: athrow
    //   23123: checkcast java/lang/Integer
    //   23126: getstatic Perryc.0 : I
    //   23129: ifle -> 23143
    //   23132: ldc2_w -1093322820
    //   23135: l2i
    //   23136: ldc_w 1163372986
    //   23139: ixor
    //   23140: goto -> 23151
    //   23143: ldc2_w -954858836
    //   23146: l2i
    //   23147: ldc_w -774140894
    //   23150: ixor
    //   23151: ldc2_w 830779259
    //   23154: l2i
    //   23155: ldc_w 261515215
    //   23158: ixor
    //   23159: ixor
    //   23160: lookupswitch default -> 23188, -980396366 -> 35345, 2144414996 -> 23143
    //   23188: goto -> 23192
    //   23191: athrow
    //   23192: invokevirtual intValue : ()I
    //   23195: goto -> 23199
    //   23198: athrow
    //   23199: getstatic Perryc.c : I
    //   23202: iflt -> 23216
    //   23205: ldc2_w -354769750
    //   23208: l2i
    //   23209: ldc_w 1227031759
    //   23212: ixor
    //   23213: goto -> 23224
    //   23216: ldc2_w 24973783
    //   23219: l2i
    //   23220: ldc_w -1527904930
    //   23223: ixor
    //   23224: ldc2_w 1123860313
    //   23227: l2i
    //   23228: ldc_w -107388165
    //   23231: ixor
    //   23232: ixor
    //   23233: lookupswitch default -> 35053, 412908999 -> 23216, 519489835 -> 23260
    //   23260: aload_0
    //   23261: getstatic Perryc.1 : I
    //   23264: ifeq -> 23278
    //   23267: ldc2_w 375153941
    //   23270: l2i
    //   23271: ldc_w -967317925
    //   23274: ixor
    //   23275: goto -> 23286
    //   23278: ldc2_w 1649478057
    //   23281: l2i
    //   23282: ldc_w -527193902
    //   23285: ixor
    //   23286: ldc2_w -2078875738
    //   23289: l2i
    //   23290: ldc_w 1401738541
    //   23293: ixor
    //   23294: ixor
    //   23295: lookupswitch default -> 34821, 126978501 -> 23278, 1431874544 -> 23320
    //   23320: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   23323: getstatic Perryc.1 : I
    //   23326: ifeq -> 23340
    //   23329: ldc2_w -679110199
    //   23332: l2i
    //   23333: ldc_w -565683380
    //   23336: ixor
    //   23337: goto -> 23348
    //   23340: ldc2_w -26943462
    //   23343: l2i
    //   23344: ldc_w 348141105
    //   23347: ixor
    //   23348: ldc2_w 1644817996
    //   23351: l2i
    //   23352: ldc_w -1284063343
    //   23355: ixor
    //   23356: ixor
    //   23357: lookupswitch default -> 34983, -659385512 -> 23340, 1004242934 -> 23384
    //   23384: goto -> 23388
    //   23387: athrow
    //   23388: invokevirtual getFontHeight : ()I
    //   23391: goto -> 23395
    //   23394: athrow
    //   23395: iadd
    //   23396: ldc2_w 798314387
    //   23399: l2i
    //   23400: ldc_w 798314393
    //   23403: ixor
    //   23404: iadd
    //   23405: i2f
    //   23406: getstatic Perryc.1 : I
    //   23409: ifeq -> 23423
    //   23412: ldc2_w -1248928753
    //   23415: l2i
    //   23416: ldc_w 1066413183
    //   23419: ixor
    //   23420: goto -> 23431
    //   23423: ldc2_w -174174607
    //   23426: l2i
    //   23427: ldc_w -140660213
    //   23430: ixor
    //   23431: ldc2_w 1043799246
    //   23434: l2i
    //   23435: ldc_w 558786270
    //   23438: ixor
    //   23439: ixor
    //   23440: lookupswitch default -> 35013, -1788376480 -> 23423, 494569066 -> 23468
    //   23468: iload #7
    //   23470: getstatic Perryc.1 : I
    //   23473: ifeq -> 23487
    //   23476: ldc2_w -2001661806
    //   23479: l2i
    //   23480: ldc_w 37190524
    //   23483: ixor
    //   23484: goto -> 23495
    //   23487: ldc2_w -2127270603
    //   23490: l2i
    //   23491: ldc_w 21699920
    //   23494: ixor
    //   23495: ldc2_w 944281807
    //   23498: l2i
    //   23499: ldc_w 454449647
    //   23502: ixor
    //   23503: ixor
    //   23504: lookupswitch default -> 23532, -1894899249 -> 23487, -1445418290 -> 34985
    //   23532: goto -> 23536
    //   23535: athrow
    //   23536: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   23539: goto -> 23543
    //   23542: athrow
    //   23543: getstatic Perryc.c : I
    //   23546: iflt -> 23560
    //   23549: ldc2_w 1711377720
    //   23552: l2i
    //   23553: ldc_w -952760809
    //   23556: ixor
    //   23557: goto -> 23568
    //   23560: ldc2_w -1406674717
    //   23563: l2i
    //   23564: ldc_w -24506066
    //   23567: ixor
    //   23568: ldc2_w 1769766896
    //   23571: l2i
    //   23572: ldc_w -2043529147
    //   23575: ixor
    //   23576: ixor
    //   23577: lookupswitch default -> 23604, 340823482 -> 23560, 1316605082 -> 35585
    //   23604: aload_0
    //   23605: getstatic Perryc.1 : I
    //   23608: ifeq -> 23622
    //   23611: ldc2_w 866925974
    //   23614: l2i
    //   23615: ldc_w -371418713
    //   23618: ixor
    //   23619: goto -> 23630
    //   23622: ldc2_w -1178736380
    //   23625: l2i
    //   23626: ldc_w -180347081
    //   23629: ixor
    //   23630: ldc2_w 2510101
    //   23633: l2i
    //   23634: ldc_w -2086780226
    //   23637: ixor
    //   23638: ixor
    //   23639: lookupswitch default -> 35085, -817497704 -> 23664, 1506323354 -> 23622
    //   23664: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   23667: new java/lang/StringBuilder
    //   23670: dup
    //   23671: getstatic Perryc.1 : I
    //   23674: ifeq -> 23688
    //   23677: ldc2_w 1368415892
    //   23680: l2i
    //   23681: ldc_w 309400346
    //   23684: ixor
    //   23685: goto -> 23696
    //   23688: ldc2_w 1125672000
    //   23691: l2i
    //   23692: ldc_w 1203578475
    //   23695: ixor
    //   23696: ldc2_w 1624692339
    //   23699: l2i
    //   23700: ldc_w -394413894
    //   23703: ixor
    //   23704: ixor
    //   23705: lookupswitch default -> 23732, -1078585351 -> 23688, -884333753 -> 35071
    //   23732: goto -> 23736
    //   23735: athrow
    //   23736: invokespecial <init> : ()V
    //   23739: goto -> 23743
    //   23742: athrow
    //   23743: ldc_w '냅㌚낑꬀곸帉'
    //   23746: getstatic Perryc.1 : I
    //   23749: ifeq -> 23763
    //   23752: ldc2_w -98473147
    //   23755: l2i
    //   23756: ldc_w -1630566151
    //   23759: ixor
    //   23760: goto -> 23771
    //   23763: ldc2_w -305328600
    //   23766: l2i
    //   23767: ldc_w -1922362405
    //   23770: ixor
    //   23771: ldc2_w 1101359373
    //   23774: l2i
    //   23775: ldc_w -316478628
    //   23778: ixor
    //   23779: ixor
    //   23780: lookupswitch default -> 35511, -932617747 -> 23763, -870211678 -> 23808
    //   23808: goto -> 23812
    //   23811: athrow
    //   23812: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   23815: goto -> 23819
    //   23818: athrow
    //   23819: getstatic Perryc.c : I
    //   23822: iflt -> 23836
    //   23825: ldc2_w -623586800
    //   23828: l2i
    //   23829: ldc_w -1526880037
    //   23832: ixor
    //   23833: goto -> 23844
    //   23836: ldc2_w 423808686
    //   23839: l2i
    //   23840: ldc_w -744166803
    //   23843: ixor
    //   23844: ldc2_w -23420926
    //   23847: l2i
    //   23848: ldc_w -1442492044
    //   23851: ixor
    //   23852: ixor
    //   23853: lookupswitch default -> 23880, -818028896 -> 23836, 716606397 -> 34851
    //   23880: goto -> 23884
    //   23883: athrow
    //   23884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23887: goto -> 23891
    //   23890: athrow
    //   23891: getstatic Perryc.0 : I
    //   23894: ifle -> 23908
    //   23897: ldc2_w -12202590
    //   23900: l2i
    //   23901: ldc_w 998466049
    //   23904: ixor
    //   23905: goto -> 23916
    //   23908: ldc2_w 1500153916
    //   23911: l2i
    //   23912: ldc_w -168757432
    //   23915: ixor
    //   23916: ldc2_w 1928314155
    //   23919: l2i
    //   23920: ldc_w -403933042
    //   23923: ixor
    //   23924: ixor
    //   23925: lookupswitch default -> 23952, 175700558 -> 23908, 1371892230 -> 34823
    //   23952: aload_3
    //   23953: getstatic Perryc.1 : I
    //   23956: ifeq -> 23970
    //   23959: ldc2_w -1457112339
    //   23962: l2i
    //   23963: ldc_w -1671318724
    //   23966: ixor
    //   23967: goto -> 23978
    //   23970: ldc2_w -958218713
    //   23973: l2i
    //   23974: ldc_w 859413496
    //   23977: ixor
    //   23978: ldc2_w -888258668
    //   23981: l2i
    //   23982: ldc_w 900834359
    //   23985: ixor
    //   23986: ixor
    //   23987: lookupswitch default -> 24012, -872934798 -> 35177, 1062520846 -> 23970
    //   24012: goto -> 24016
    //   24015: athrow
    //   24016: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24019: goto -> 24023
    //   24022: athrow
    //   24023: getstatic Perryc.0 : I
    //   24026: ifle -> 24040
    //   24029: ldc2_w 1484773765
    //   24032: l2i
    //   24033: ldc_w 761446463
    //   24036: ixor
    //   24037: goto -> 24048
    //   24040: ldc2_w -834284968
    //   24043: l2i
    //   24044: ldc_w 1388727084
    //   24047: ixor
    //   24048: ldc2_w 1883272575
    //   24051: l2i
    //   24052: ldc_w -387325619
    //   24055: ixor
    //   24056: ixor
    //   24057: lookupswitch default -> 34771, -306934392 -> 24040, 69864774 -> 24084
    //   24084: goto -> 24088
    //   24087: athrow
    //   24088: invokevirtual toString : ()Ljava/lang/String;
    //   24091: goto -> 24095
    //   24094: athrow
    //   24095: getstatic Perryc.0 : I
    //   24098: ifle -> 24112
    //   24101: ldc2_w 1006911397
    //   24104: l2i
    //   24105: ldc_w 2009924542
    //   24108: ixor
    //   24109: goto -> 24120
    //   24112: ldc2_w 1306416651
    //   24115: l2i
    //   24116: ldc_w 901672409
    //   24119: ixor
    //   24120: ldc2_w 1301367238
    //   24123: l2i
    //   24124: ldc_w 1167071130
    //   24127: ixor
    //   24128: ixor
    //   24129: lookupswitch default -> 24156, -1126808391 -> 24112, 1137205831 -> 35495
    //   24156: aload_0
    //   24157: getstatic Perryc.1 : I
    //   24160: ifeq -> 24174
    //   24163: ldc2_w 1220472927
    //   24166: l2i
    //   24167: ldc_w 1385774712
    //   24170: ixor
    //   24171: goto -> 24182
    //   24174: ldc2_w -1178498700
    //   24177: l2i
    //   24178: ldc_w 2131057104
    //   24181: ixor
    //   24182: ldc2_w 1734017148
    //   24185: l2i
    //   24186: ldc_w -480747973
    //   24189: ixor
    //   24190: ixor
    //   24191: lookupswitch default -> 35321, -1641770912 -> 24174, 1120374499 -> 24216
    //   24216: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24219: getstatic Perryc.0 : I
    //   24222: ifle -> 24236
    //   24225: ldc2_w -1005150058
    //   24228: l2i
    //   24229: ldc_w 2008858277
    //   24232: ixor
    //   24233: goto -> 24244
    //   24236: ldc2_w -1353141928
    //   24239: l2i
    //   24240: ldc_w -479869947
    //   24243: ixor
    //   24244: ldc2_w 69313859
    //   24247: l2i
    //   24248: ldc_w -1892320291
    //   24251: ixor
    //   24252: ixor
    //   24253: lookupswitch default -> 35423, -953570365 -> 24280, 952025261 -> 24236
    //   24280: goto -> 24284
    //   24283: athrow
    //   24284: invokevirtual getValue : ()Ljava/lang/Object;
    //   24287: goto -> 24291
    //   24290: athrow
    //   24291: checkcast java/lang/Integer
    //   24294: getstatic Perryc.1 : I
    //   24297: ifeq -> 24311
    //   24300: ldc2_w 1075603302
    //   24303: l2i
    //   24304: ldc_w -1491145501
    //   24307: ixor
    //   24308: goto -> 24319
    //   24311: ldc2_w 544570857
    //   24314: l2i
    //   24315: ldc_w -950956355
    //   24318: ixor
    //   24319: ldc2_w -1561408586
    //   24322: l2i
    //   24323: ldc_w 408121346
    //   24326: ixor
    //   24327: ixor
    //   24328: lookupswitch default -> 24356, 1572810801 -> 35299, 1711081656 -> 24311
    //   24356: goto -> 24360
    //   24359: athrow
    //   24360: invokevirtual intValue : ()I
    //   24363: goto -> 24367
    //   24366: athrow
    //   24367: ldc2_w -234904023
    //   24370: l2i
    //   24371: ldc_w -234904043
    //   24374: ixor
    //   24375: iadd
    //   24376: i2f
    //   24377: getstatic Perryc.c : I
    //   24380: iflt -> 24394
    //   24383: ldc2_w -490454453
    //   24386: l2i
    //   24387: ldc_w -372867929
    //   24390: ixor
    //   24391: goto -> 24402
    //   24394: ldc2_w 475321537
    //   24397: l2i
    //   24398: ldc_w 549154748
    //   24401: ixor
    //   24402: ldc2_w 219996605
    //   24405: l2i
    //   24406: ldc_w 1844766382
    //   24409: ixor
    //   24410: ixor
    //   24411: lookupswitch default -> 35119, 1544010862 -> 24436, 1810512383 -> 24394
    //   24436: aload_0
    //   24437: getstatic Perryc.0 : I
    //   24440: ifle -> 24454
    //   24443: ldc2_w 386699991
    //   24446: l2i
    //   24447: ldc_w 1624590351
    //   24450: ixor
    //   24451: goto -> 24462
    //   24454: ldc2_w 1708937607
    //   24457: l2i
    //   24458: ldc_w -1744844538
    //   24461: ixor
    //   24462: ldc2_w 257205119
    //   24465: l2i
    //   24466: ldc_w -900450959
    //   24469: ixor
    //   24470: ixor
    //   24471: lookupswitch default -> 24496, -1846834201 -> 24454, -1294381866 -> 34797
    //   24496: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24499: getstatic Perryc.c : I
    //   24502: iflt -> 24516
    //   24505: ldc2_w -1656810629
    //   24508: l2i
    //   24509: ldc_w -683563342
    //   24512: ixor
    //   24513: goto -> 24524
    //   24516: ldc2_w 258276681
    //   24519: l2i
    //   24520: ldc_w -2102623214
    //   24523: ixor
    //   24524: ldc2_w -1763656741
    //   24527: l2i
    //   24528: ldc_w -1652611322
    //   24531: ixor
    //   24532: ixor
    //   24533: lookupswitch default -> 24560, 1089970175 -> 24516, 1105275156 -> 35089
    //   24560: goto -> 24564
    //   24563: athrow
    //   24564: invokevirtual getValue : ()Ljava/lang/Object;
    //   24567: goto -> 24571
    //   24570: athrow
    //   24571: checkcast java/lang/Integer
    //   24574: getstatic Perryc.1 : I
    //   24577: ifeq -> 24591
    //   24580: ldc2_w 1186514564
    //   24583: l2i
    //   24584: ldc_w 1183102063
    //   24587: ixor
    //   24588: goto -> 24599
    //   24591: ldc2_w 101465745
    //   24594: l2i
    //   24595: ldc_w -1465820517
    //   24598: ixor
    //   24599: ldc2_w -176294570
    //   24602: l2i
    //   24603: ldc_w 143066994
    //   24606: ixor
    //   24607: ixor
    //   24608: lookupswitch default -> 35397, -37322545 -> 24591, 1398249006 -> 24636
    //   24636: goto -> 24640
    //   24639: athrow
    //   24640: invokevirtual intValue : ()I
    //   24643: goto -> 24647
    //   24646: athrow
    //   24647: getstatic Perryc.c : I
    //   24650: iflt -> 24664
    //   24653: ldc2_w -502788893
    //   24656: l2i
    //   24657: ldc_w 1113573262
    //   24660: ixor
    //   24661: goto -> 24672
    //   24664: ldc2_w -547149506
    //   24667: l2i
    //   24668: ldc_w 730151648
    //   24671: ixor
    //   24672: ldc2_w -1655218230
    //   24675: l2i
    //   24676: ldc_w -199114550
    //   24679: ixor
    //   24680: ixor
    //   24681: lookupswitch default -> 35099, -1651471138 -> 24708, -920562579 -> 24664
    //   24708: aload_0
    //   24709: getstatic Perryc.c : I
    //   24712: iflt -> 24726
    //   24715: ldc2_w 2086698564
    //   24718: l2i
    //   24719: ldc_w 300694000
    //   24722: ixor
    //   24723: goto -> 24734
    //   24726: ldc2_w -1592674259
    //   24729: l2i
    //   24730: ldc_w -1620981969
    //   24733: ixor
    //   24734: ldc2_w -1481915543
    //   24737: l2i
    //   24738: ldc_w -1480936537
    //   24741: ixor
    //   24742: ixor
    //   24743: lookupswitch default -> 24768, 1565176195 -> 24726, 1839019898 -> 35567
    //   24768: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   24771: getstatic Perryc.c : I
    //   24774: iflt -> 24788
    //   24777: ldc2_w 1832669287
    //   24780: l2i
    //   24781: ldc_w 2098534552
    //   24784: ixor
    //   24785: goto -> 24796
    //   24788: ldc2_w 323250537
    //   24791: l2i
    //   24792: ldc_w 1143958757
    //   24795: ixor
    //   24796: ldc2_w -338142781
    //   24799: l2i
    //   24800: ldc_w 1469467023
    //   24803: ixor
    //   24804: ixor
    //   24805: lookupswitch default -> 35037, -1402513229 -> 24788, -349891136 -> 24832
    //   24832: goto -> 24836
    //   24835: athrow
    //   24836: invokevirtual getFontHeight : ()I
    //   24839: goto -> 24843
    //   24842: athrow
    //   24843: iadd
    //   24844: ldc2_w -1712710004
    //   24847: l2i
    //   24848: ldc_w -1712709992
    //   24851: ixor
    //   24852: iadd
    //   24853: i2f
    //   24854: getstatic Perryc.c : I
    //   24857: iflt -> 24871
    //   24860: ldc2_w -569343625
    //   24863: l2i
    //   24864: ldc_w -1114597021
    //   24867: ixor
    //   24868: goto -> 24879
    //   24871: ldc2_w 1252108633
    //   24874: l2i
    //   24875: ldc_w 1786370775
    //   24878: ixor
    //   24879: ldc2_w 590005159
    //   24882: l2i
    //   24883: ldc_w 1835046156
    //   24886: ixor
    //   24887: ixor
    //   24888: lookupswitch default -> 34723, 768233151 -> 24871, 1855071525 -> 24916
    //   24916: iload #10
    //   24918: getstatic Perryc.1 : I
    //   24921: ifeq -> 24935
    //   24924: ldc2_w 1988661021
    //   24927: l2i
    //   24928: ldc_w -1141683010
    //   24931: ixor
    //   24932: goto -> 24943
    //   24935: ldc2_w 1667274444
    //   24938: l2i
    //   24939: ldc_w 602060082
    //   24942: ixor
    //   24943: ldc2_w -117447844
    //   24946: l2i
    //   24947: ldc_w 1022075123
    //   24950: ixor
    //   24951: ixor
    //   24952: lookupswitch default -> 35431, -2070519727 -> 24980, 158302220 -> 24935
    //   24980: goto -> 24984
    //   24983: athrow
    //   24984: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   24987: goto -> 24991
    //   24990: athrow
    //   24991: getstatic Perryc.1 : I
    //   24994: ifeq -> 25008
    //   24997: ldc2_w 1278076677
    //   25000: l2i
    //   25001: ldc_w -815559453
    //   25004: ixor
    //   25005: goto -> 25016
    //   25008: ldc2_w -1782592269
    //   25011: l2i
    //   25012: ldc_w 2069553373
    //   25015: ixor
    //   25016: ldc2_w -966851539
    //   25019: l2i
    //   25020: ldc_w 796643845
    //   25023: ixor
    //   25024: ixor
    //   25025: lookupswitch default -> 34953, 130152966 -> 25052, 1785380302 -> 25008
    //   25052: aload_0
    //   25053: getstatic Perryc.0 : I
    //   25056: ifle -> 25070
    //   25059: ldc2_w -1891606596
    //   25062: l2i
    //   25063: ldc_w 2112401737
    //   25066: ixor
    //   25067: goto -> 25078
    //   25070: ldc2_w -538383809
    //   25073: l2i
    //   25074: ldc_w 1252990243
    //   25077: ixor
    //   25078: ldc2_w -661914487
    //   25081: l2i
    //   25082: ldc_w -453042278
    //   25085: ixor
    //   25086: ixor
    //   25087: lookupswitch default -> 25112, -824439322 -> 35019, 261378047 -> 25070
    //   25112: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   25115: new java/lang/StringBuilder
    //   25118: dup
    //   25119: getstatic Perryc.1 : I
    //   25122: ifeq -> 25136
    //   25125: ldc2_w 1274609610
    //   25128: l2i
    //   25129: ldc_w 1497868958
    //   25132: ixor
    //   25133: goto -> 25144
    //   25136: ldc2_w 823437510
    //   25139: l2i
    //   25140: ldc_w -1146361621
    //   25143: ixor
    //   25144: ldc2_w 445991156
    //   25147: l2i
    //   25148: ldc_w 553600765
    //   25151: ixor
    //   25152: ixor
    //   25153: lookupswitch default -> 35417, -1328198108 -> 25180, 685071197 -> 25136
    //   25180: goto -> 25184
    //   25183: athrow
    //   25184: invokespecial <init> : ()V
    //   25187: goto -> 25191
    //   25190: athrow
    //   25191: ldc_w '냑㌚낌ꬓ겣幇๺쵝ᢉ'
    //   25194: getstatic Perryc.0 : I
    //   25197: ifle -> 25211
    //   25200: ldc2_w 2007863641
    //   25203: l2i
    //   25204: ldc_w 19284431
    //   25207: ixor
    //   25208: goto -> 25219
    //   25211: ldc2_w -970860730
    //   25214: l2i
    //   25215: ldc_w -615621072
    //   25218: ixor
    //   25219: ldc2_w 571550652
    //   25222: l2i
    //   25223: ldc_w 2078176563
    //   25226: ixor
    //   25227: ixor
    //   25228: lookupswitch default -> 34813, 793021977 -> 25211, 1151391737 -> 25256
    //   25256: goto -> 25260
    //   25259: athrow
    //   25260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   25263: goto -> 25267
    //   25266: athrow
    //   25267: getstatic Perryc.1 : I
    //   25270: ifeq -> 25284
    //   25273: ldc2_w 1626407574
    //   25276: l2i
    //   25277: ldc_w -2067706955
    //   25280: ixor
    //   25281: goto -> 25292
    //   25284: ldc2_w 454090954
    //   25287: l2i
    //   25288: ldc_w 996349843
    //   25291: ixor
    //   25292: ldc2_w 969864842
    //   25295: l2i
    //   25296: ldc_w -1569696754
    //   25299: ixor
    //   25300: ixor
    //   25301: lookupswitch default -> 35301, -1144171043 -> 25328, 2140072871 -> 25284
    //   25328: goto -> 25332
    //   25331: athrow
    //   25332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25335: goto -> 25339
    //   25338: athrow
    //   25339: getstatic Perryc.1 : I
    //   25342: ifeq -> 25356
    //   25345: ldc2_w -2092863357
    //   25348: l2i
    //   25349: ldc_w -1073989600
    //   25352: ixor
    //   25353: goto -> 25364
    //   25356: ldc2_w 1817351276
    //   25359: l2i
    //   25360: ldc_w -576592040
    //   25363: ixor
    //   25364: ldc2_w 1570239779
    //   25367: l2i
    //   25368: ldc_w 856405339
    //   25371: ixor
    //   25372: ixor
    //   25373: lookupswitch default -> 25400, 462311256 -> 25356, 1377896667 -> 34811
    //   25400: iload #5
    //   25402: getstatic Perryc.0 : I
    //   25405: ifle -> 25419
    //   25408: ldc2_w -418888852
    //   25411: l2i
    //   25412: ldc_w 581393060
    //   25415: ixor
    //   25416: goto -> 25427
    //   25419: ldc2_w 956041655
    //   25422: l2i
    //   25423: ldc_w 731332610
    //   25426: ixor
    //   25427: ldc2_w 881913610
    //   25430: l2i
    //   25431: ldc_w -1564359750
    //   25434: ixor
    //   25435: ixor
    //   25436: lookupswitch default -> 34691, -2059770619 -> 25464, 1409168760 -> 25419
    //   25464: goto -> 25468
    //   25467: athrow
    //   25468: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   25471: goto -> 25475
    //   25474: athrow
    //   25475: getstatic Perryc.c : I
    //   25478: iflt -> 25492
    //   25481: ldc2_w -194214477
    //   25484: l2i
    //   25485: ldc_w -2103236614
    //   25488: ixor
    //   25489: goto -> 25500
    //   25492: ldc2_w 1160385702
    //   25495: l2i
    //   25496: ldc_w 346327895
    //   25499: ixor
    //   25500: ldc2_w -262473546
    //   25503: l2i
    //   25504: ldc_w 221495106
    //   25507: ixor
    //   25508: ixor
    //   25509: lookupswitch default -> 25536, -1951996483 -> 35245, -1376091973 -> 25492
    //   25536: goto -> 25540
    //   25539: athrow
    //   25540: invokevirtual toString : ()Ljava/lang/String;
    //   25543: goto -> 25547
    //   25546: athrow
    //   25547: getstatic Perryc.1 : I
    //   25550: ifeq -> 25564
    //   25553: ldc2_w -105765639
    //   25556: l2i
    //   25557: ldc_w -645152532
    //   25560: ixor
    //   25561: goto -> 25572
    //   25564: ldc2_w -674429794
    //   25567: l2i
    //   25568: ldc_w 1407756218
    //   25571: ixor
    //   25572: ldc2_w -704219262
    //   25575: l2i
    //   25576: ldc_w 2070250801
    //   25579: ixor
    //   25580: ixor
    //   25581: lookupswitch default -> 25608, -1923475802 -> 35317, -122042320 -> 25564
    //   25608: aload_0
    //   25609: getstatic Perryc.0 : I
    //   25612: ifle -> 25626
    //   25615: ldc2_w -45584260
    //   25618: l2i
    //   25619: ldc_w -159200742
    //   25622: ixor
    //   25623: goto -> 25634
    //   25626: ldc2_w 332331485
    //   25629: l2i
    //   25630: ldc_w 1342928666
    //   25633: ixor
    //   25634: ldc2_w 1819130226
    //   25637: l2i
    //   25638: ldc_w 1313433693
    //   25641: ixor
    //   25642: ixor
    //   25643: lookupswitch default -> 35349, 703490889 -> 25626, 1642160104 -> 25668
    //   25668: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25671: getstatic Perryc.0 : I
    //   25674: ifle -> 25688
    //   25677: ldc2_w -1242372959
    //   25680: l2i
    //   25681: ldc_w -1350729224
    //   25684: ixor
    //   25685: goto -> 25696
    //   25688: ldc2_w 665779502
    //   25691: l2i
    //   25692: ldc_w 1870067582
    //   25695: ixor
    //   25696: ldc2_w -1654241937
    //   25699: l2i
    //   25700: ldc_w 1723815357
    //   25703: ixor
    //   25704: ixor
    //   25705: lookupswitch default -> 25732, -514427509 -> 35441, 1141502270 -> 25688
    //   25732: goto -> 25736
    //   25735: athrow
    //   25736: invokevirtual getValue : ()Ljava/lang/Object;
    //   25739: goto -> 25743
    //   25742: athrow
    //   25743: checkcast java/lang/Integer
    //   25746: getstatic Perryc.0 : I
    //   25749: ifle -> 25763
    //   25752: ldc2_w 1300915771
    //   25755: l2i
    //   25756: ldc_w 1699194155
    //   25759: ixor
    //   25760: goto -> 25771
    //   25763: ldc2_w -888026783
    //   25766: l2i
    //   25767: ldc_w -1896258911
    //   25770: ixor
    //   25771: ldc2_w -1891554700
    //   25774: l2i
    //   25775: ldc_w -1816378951
    //   25778: ixor
    //   25779: ixor
    //   25780: lookupswitch default -> 35249, 875604189 -> 25763, 1494597645 -> 25808
    //   25808: goto -> 25812
    //   25811: athrow
    //   25812: invokevirtual intValue : ()I
    //   25815: goto -> 25819
    //   25818: athrow
    //   25819: ldc2_w 1157381115
    //   25822: l2i
    //   25823: ldc_w 1157381063
    //   25826: ixor
    //   25827: iadd
    //   25828: i2f
    //   25829: getstatic Perryc.c : I
    //   25832: iflt -> 25846
    //   25835: ldc2_w 303615131
    //   25838: l2i
    //   25839: ldc_w -1006063321
    //   25842: ixor
    //   25843: goto -> 25854
    //   25846: ldc2_w -2024635051
    //   25849: l2i
    //   25850: ldc_w -525189928
    //   25853: ixor
    //   25854: ldc2_w -947308729
    //   25857: l2i
    //   25858: ldc_w -1773054356
    //   25861: ixor
    //   25862: ixor
    //   25863: lookupswitch default -> 35167, -2016928617 -> 25846, 909695142 -> 25888
    //   25888: aload_0
    //   25889: getstatic Perryc.c : I
    //   25892: iflt -> 25906
    //   25895: ldc2_w 1652183560
    //   25898: l2i
    //   25899: ldc_w -2034918127
    //   25902: ixor
    //   25903: goto -> 25914
    //   25906: ldc2_w 86744111
    //   25909: l2i
    //   25910: ldc_w 1333153528
    //   25913: ixor
    //   25914: ldc2_w -479495115
    //   25917: l2i
    //   25918: ldc_w -1430305498
    //   25921: ixor
    //   25922: ixor
    //   25923: lookupswitch default -> 25948, -1390676470 -> 35437, 1145710068 -> 25906
    //   25948: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25951: getstatic Perryc.c : I
    //   25954: iflt -> 25968
    //   25957: ldc2_w -567795980
    //   25960: l2i
    //   25961: ldc_w 224171454
    //   25964: ixor
    //   25965: goto -> 25976
    //   25968: ldc2_w -40028743
    //   25971: l2i
    //   25972: ldc_w -1015389184
    //   25975: ixor
    //   25976: ldc2_w -234421329
    //   25979: l2i
    //   25980: ldc_w 2138665815
    //   25983: ixor
    //   25984: ixor
    //   25985: lookupswitch default -> 35541, -1281810111 -> 26012, 1577778098 -> 25968
    //   26012: goto -> 26016
    //   26015: athrow
    //   26016: invokevirtual getValue : ()Ljava/lang/Object;
    //   26019: goto -> 26023
    //   26022: athrow
    //   26023: checkcast java/lang/Integer
    //   26026: getstatic Perryc.0 : I
    //   26029: ifle -> 26043
    //   26032: ldc2_w 1152819854
    //   26035: l2i
    //   26036: ldc_w -1929995519
    //   26039: ixor
    //   26040: goto -> 26051
    //   26043: ldc2_w -1522920809
    //   26046: l2i
    //   26047: ldc_w 1477476250
    //   26050: ixor
    //   26051: ldc2_w 1712555426
    //   26054: l2i
    //   26055: ldc_w -967481382
    //   26058: ixor
    //   26059: ixor
    //   26060: lookupswitch default -> 26088, -1811721172 -> 26043, 1745279991 -> 35289
    //   26088: goto -> 26092
    //   26091: athrow
    //   26092: invokevirtual intValue : ()I
    //   26095: goto -> 26099
    //   26098: athrow
    //   26099: getstatic Perryc.0 : I
    //   26102: ifle -> 26116
    //   26105: ldc2_w 1753757645
    //   26108: l2i
    //   26109: ldc_w -1404123339
    //   26112: ixor
    //   26113: goto -> 26124
    //   26116: ldc2_w 709501276
    //   26119: l2i
    //   26120: ldc_w -2072327983
    //   26123: ixor
    //   26124: ldc2_w -410463146
    //   26127: l2i
    //   26128: ldc_w 84699357
    //   26131: ixor
    //   26132: ixor
    //   26133: lookupswitch default -> 35143, 641879155 -> 26116, 1286886662 -> 26160
    //   26160: aload_0
    //   26161: getstatic Perryc.0 : I
    //   26164: ifle -> 26178
    //   26167: ldc2_w 1450663325
    //   26170: l2i
    //   26171: ldc_w -1836825141
    //   26174: ixor
    //   26175: goto -> 26186
    //   26178: ldc2_w 1702727667
    //   26181: l2i
    //   26182: ldc_w -972101438
    //   26185: ixor
    //   26186: ldc2_w 482419066
    //   26189: l2i
    //   26190: ldc_w -115622624
    //   26193: ixor
    //   26194: ixor
    //   26195: lookupswitch default -> 26220, -634568788 -> 26178, 556368908 -> 34979
    //   26220: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   26223: getstatic Perryc.c : I
    //   26226: iflt -> 26240
    //   26229: ldc2_w 8721432
    //   26232: l2i
    //   26233: ldc_w -57329091
    //   26236: ixor
    //   26237: goto -> 26248
    //   26240: ldc2_w 13649864
    //   26243: l2i
    //   26244: ldc_w -1158195721
    //   26247: ixor
    //   26248: ldc2_w -1162833358
    //   26251: l2i
    //   26252: ldc_w -1765301593
    //   26255: ixor
    //   26256: ixor
    //   26257: lookupswitch default -> 26284, -798548304 -> 35159, 633336189 -> 26240
    //   26284: goto -> 26288
    //   26287: athrow
    //   26288: invokevirtual getFontHeight : ()I
    //   26291: goto -> 26295
    //   26294: athrow
    //   26295: iadd
    //   26296: ldc2_w -117130430
    //   26299: l2i
    //   26300: ldc_w -117130404
    //   26303: ixor
    //   26304: iadd
    //   26305: i2f
    //   26306: getstatic Perryc.0 : I
    //   26309: ifle -> 26323
    //   26312: ldc2_w 632757560
    //   26315: l2i
    //   26316: ldc_w -1751777724
    //   26319: ixor
    //   26320: goto -> 26331
    //   26323: ldc2_w 179187809
    //   26326: l2i
    //   26327: ldc_w -1033401542
    //   26330: ixor
    //   26331: ldc2_w -885281509
    //   26334: l2i
    //   26335: ldc_w -931409208
    //   26338: ixor
    //   26339: ixor
    //   26340: lookupswitch default -> 35421, -1318937425 -> 26323, -880163704 -> 26368
    //   26368: iload #11
    //   26370: getstatic Perryc.c : I
    //   26373: iflt -> 26387
    //   26376: ldc2_w -1760384821
    //   26379: l2i
    //   26380: ldc_w 768050236
    //   26383: ixor
    //   26384: goto -> 26395
    //   26387: ldc2_w -1954871377
    //   26390: l2i
    //   26391: ldc_w 2035759173
    //   26394: ixor
    //   26395: ldc2_w -1789099799
    //   26398: l2i
    //   26399: ldc_w 220790287
    //   26402: ixor
    //   26403: ixor
    //   26404: lookupswitch default -> 35381, 580997649 -> 26387, 1784168716 -> 26432
    //   26432: goto -> 26436
    //   26435: athrow
    //   26436: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   26439: goto -> 26443
    //   26442: athrow
    //   26443: getstatic Perryc.0 : I
    //   26446: ifle -> 26460
    //   26449: ldc2_w 1206107447
    //   26452: l2i
    //   26453: ldc_w -615918225
    //   26456: ixor
    //   26457: goto -> 26468
    //   26460: ldc2_w 1883325036
    //   26463: l2i
    //   26464: ldc_w 1134257847
    //   26467: ixor
    //   26468: ldc2_w -1270574738
    //   26471: l2i
    //   26472: ldc_w -605651954
    //   26475: ixor
    //   26476: ixor
    //   26477: lookupswitch default -> 34769, -217545416 -> 26460, 1551419835 -> 26504
    //   26504: aload_0
    //   26505: getstatic Perryc.c : I
    //   26508: iflt -> 26522
    //   26511: ldc2_w 731579268
    //   26514: l2i
    //   26515: ldc_w -1991040321
    //   26518: ixor
    //   26519: goto -> 26530
    //   26522: ldc2_w 2108559727
    //   26525: l2i
    //   26526: ldc_w 108249974
    //   26529: ixor
    //   26530: ldc2_w 894862091
    //   26533: l2i
    //   26534: ldc_w -1853718569
    //   26537: ixor
    //   26538: ixor
    //   26539: lookupswitch default -> 26564, 102555111 -> 34977, 328669290 -> 26522
    //   26564: fload_1
    //   26565: getstatic Perryc.1 : I
    //   26568: ifeq -> 26582
    //   26571: ldc2_w 2133708710
    //   26574: l2i
    //   26575: ldc_w 1268913161
    //   26578: ixor
    //   26579: goto -> 26590
    //   26582: ldc2_w -597860451
    //   26585: l2i
    //   26586: ldc_w -1277636871
    //   26589: ixor
    //   26590: ldc2_w -188211175
    //   26593: l2i
    //   26594: ldc_w 1034421518
    //   26597: ixor
    //   26598: ixor
    //   26599: lookupswitch default -> 34915, -1494895501 -> 26624, -34603336 -> 26582
    //   26624: aload #4
    //   26626: getstatic Perryc.0 : I
    //   26629: ifle -> 26643
    //   26632: ldc2_w -548471148
    //   26635: l2i
    //   26636: ldc_w 956052884
    //   26639: ixor
    //   26640: goto -> 26651
    //   26643: ldc2_w 1301027580
    //   26646: l2i
    //   26647: ldc_w -1308717884
    //   26650: ixor
    //   26651: ldc2_w 207314677
    //   26654: l2i
    //   26655: ldc_w -1723745802
    //   26658: ixor
    //   26659: ixor
    //   26660: lookupswitch default -> 26688, 1482634697 -> 26643, 1923623939 -> 35201
    //   26688: aload_0
    //   26689: getstatic Perryc.1 : I
    //   26692: ifeq -> 26706
    //   26695: ldc2_w 1060585752
    //   26698: l2i
    //   26699: ldc_w 1613810908
    //   26702: ixor
    //   26703: goto -> 26714
    //   26706: ldc2_w 486966261
    //   26709: l2i
    //   26710: ldc_w 494673786
    //   26713: ixor
    //   26714: ldc2_w 1935895828
    //   26717: l2i
    //   26718: ldc_w -814763854
    //   26721: ixor
    //   26722: ixor
    //   26723: lookupswitch default -> 34917, -1133100759 -> 26748, -485797790 -> 26706
    //   26748: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26751: getstatic Perryc.1 : I
    //   26754: ifeq -> 26768
    //   26757: ldc2_w 1160956526
    //   26760: l2i
    //   26761: ldc_w -1575718819
    //   26764: ixor
    //   26765: goto -> 26776
    //   26768: ldc2_w -1444019676
    //   26771: l2i
    //   26772: ldc_w 308574219
    //   26775: ixor
    //   26776: ldc2_w 967567676
    //   26779: l2i
    //   26780: ldc_w 99242466
    //   26783: ixor
    //   26784: ixor
    //   26785: lookupswitch default -> 35341, -2016689423 -> 26812, -614006035 -> 26768
    //   26812: goto -> 26816
    //   26815: athrow
    //   26816: invokevirtual getValue : ()Ljava/lang/Object;
    //   26819: goto -> 26823
    //   26822: athrow
    //   26823: checkcast java/lang/Integer
    //   26826: getstatic Perryc.1 : I
    //   26829: ifeq -> 26843
    //   26832: ldc2_w -2114509867
    //   26835: l2i
    //   26836: ldc_w -815386203
    //   26839: ixor
    //   26840: goto -> 26851
    //   26843: ldc2_w -1876879375
    //   26846: l2i
    //   26847: ldc_w -752101420
    //   26850: ixor
    //   26851: ldc2_w 850724046
    //   26854: l2i
    //   26855: ldc_w 1113174086
    //   26858: ixor
    //   26859: ixor
    //   26860: lookupswitch default -> 34951, 870741165 -> 26888, 1048422136 -> 26843
    //   26888: goto -> 26892
    //   26891: athrow
    //   26892: invokevirtual intValue : ()I
    //   26895: goto -> 26899
    //   26898: athrow
    //   26899: ldc2_w 835164185
    //   26902: l2i
    //   26903: ldc_w 835164257
    //   26906: ixor
    //   26907: iadd
    //   26908: getstatic Perryc.c : I
    //   26911: iflt -> 26925
    //   26914: ldc2_w 905619208
    //   26917: l2i
    //   26918: ldc_w -1627877988
    //   26921: ixor
    //   26922: goto -> 26933
    //   26925: ldc2_w -687638588
    //   26928: l2i
    //   26929: ldc_w -575332274
    //   26932: ixor
    //   26933: ldc2_w -395166030
    //   26936: l2i
    //   26937: ldc_w 273121942
    //   26940: ixor
    //   26941: ixor
    //   26942: lookupswitch default -> 34789, -226235474 -> 26968, 1396151984 -> 26925
    //   26968: aload_0
    //   26969: getstatic Perryc.1 : I
    //   26972: ifeq -> 26986
    //   26975: ldc2_w 696370416
    //   26978: l2i
    //   26979: ldc_w 1529000486
    //   26982: ixor
    //   26983: goto -> 26994
    //   26986: ldc2_w -1556585508
    //   26989: l2i
    //   26990: ldc_w 926001230
    //   26993: ixor
    //   26994: ldc2_w 1749849774
    //   26997: l2i
    //   26998: ldc_w 1159528338
    //   27001: ixor
    //   27002: ixor
    //   27003: lookupswitch default -> 35407, -1185307986 -> 27028, 1609768938 -> 26986
    //   27028: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27031: getstatic Perryc.1 : I
    //   27034: ifeq -> 27048
    //   27037: ldc2_w -352899500
    //   27040: l2i
    //   27041: ldc_w 2125358896
    //   27044: ixor
    //   27045: goto -> 27056
    //   27048: ldc2_w -1196030335
    //   27051: l2i
    //   27052: ldc_w 407287753
    //   27055: ixor
    //   27056: ldc2_w -2039652057
    //   27059: l2i
    //   27060: ldc_w -617533725
    //   27063: ixor
    //   27064: ixor
    //   27065: lookupswitch default -> 27092, -922417504 -> 35103, -421499117 -> 27048
    //   27092: goto -> 27096
    //   27095: athrow
    //   27096: invokevirtual getValue : ()Ljava/lang/Object;
    //   27099: goto -> 27103
    //   27102: athrow
    //   27103: checkcast java/lang/Integer
    //   27106: getstatic Perryc.0 : I
    //   27109: ifle -> 27123
    //   27112: ldc2_w 1951855095
    //   27115: l2i
    //   27116: ldc_w -1088207354
    //   27119: ixor
    //   27120: goto -> 27131
    //   27123: ldc2_w -1287481800
    //   27126: l2i
    //   27127: ldc_w 38531730
    //   27130: ixor
    //   27131: ldc2_w 2094673796
    //   27134: l2i
    //   27135: ldc_w 39799586
    //   27138: ixor
    //   27139: ixor
    //   27140: lookupswitch default -> 34779, -1242508457 -> 27123, -812908532 -> 27168
    //   27168: goto -> 27172
    //   27171: athrow
    //   27172: invokevirtual intValue : ()I
    //   27175: goto -> 27179
    //   27178: athrow
    //   27179: ldc2_w -1714420787
    //   27182: l2i
    //   27183: ldc_w -1714420754
    //   27186: ixor
    //   27187: iadd
    //   27188: getstatic Perryc.0 : I
    //   27191: ifle -> 27205
    //   27194: ldc2_w -1916549377
    //   27197: l2i
    //   27198: ldc_w 1168175319
    //   27201: ixor
    //   27202: goto -> 27213
    //   27205: ldc2_w 1481603122
    //   27208: l2i
    //   27209: ldc_w 1721348577
    //   27212: ixor
    //   27213: ldc2_w 210006371
    //   27216: l2i
    //   27217: ldc_w -515830888
    //   27220: ixor
    //   27221: ixor
    //   27222: lookupswitch default -> 27248, 631655635 -> 35575, 1926050640 -> 27205
    //   27248: goto -> 27252
    //   27251: athrow
    //   27252: invokevirtual drawOverlay : (FLnet/minecraft/entity/Entity;II)V
    //   27255: goto -> 27259
    //   27258: athrow
    //   27259: getstatic Perryc.c : I
    //   27262: iflt -> 27276
    //   27265: ldc2_w 197101184
    //   27268: l2i
    //   27269: ldc_w 1493535447
    //   27272: ixor
    //   27273: goto -> 27284
    //   27276: ldc2_w -1089812279
    //   27279: l2i
    //   27280: ldc_w -373524177
    //   27283: ixor
    //   27284: ldc2_w -496869368
    //   27287: l2i
    //   27288: ldc_w 878754573
    //   27291: ixor
    //   27292: ixor
    //   27293: lookupswitch default -> 34721, -2135659805 -> 27320, -2068261038 -> 27276
    //   27320: goto -> 27324
    //   27323: athrow
    //   27324: invokestatic func_179098_w : ()V
    //   27327: goto -> 27331
    //   27330: athrow
    //   27331: ldc2_w -1211655248
    //   27334: l2i
    //   27335: ldc_w -1211655248
    //   27338: ixor
    //   27339: getstatic Perryc.1 : I
    //   27342: ifeq -> 27356
    //   27345: ldc2_w -263832318
    //   27348: l2i
    //   27349: ldc_w 2116101600
    //   27352: ixor
    //   27353: goto -> 27364
    //   27356: ldc2_w -839095292
    //   27359: l2i
    //   27360: ldc_w 1974393488
    //   27363: ixor
    //   27364: ldc2_w 1015029888
    //   27367: l2i
    //   27368: ldc_w -1455066367
    //   27371: ixor
    //   27372: ixor
    //   27373: lookupswitch default -> 35335, 463620963 -> 27356, 764929301 -> 27400
    //   27400: istore #12
    //   27402: getstatic Perryc.c : I
    //   27405: iflt -> 27419
    //   27408: ldc2_w -728597958
    //   27411: l2i
    //   27412: ldc_w -415434966
    //   27415: ixor
    //   27416: goto -> 27427
    //   27419: ldc2_w -83590775
    //   27422: l2i
    //   27423: ldc_w 1754803722
    //   27426: ixor
    //   27427: ldc2_w 380974792
    //   27430: l2i
    //   27431: ldc_w 842755471
    //   27434: ixor
    //   27435: ixor
    //   27436: lookupswitch default -> 34799, -1223494460 -> 27464, 388027991 -> 27419
    //   27464: aload_0
    //   27465: getstatic Perryc.c : I
    //   27468: iflt -> 27482
    //   27471: ldc2_w -529539679
    //   27474: l2i
    //   27475: ldc_w 705859214
    //   27478: ixor
    //   27479: goto -> 27490
    //   27482: ldc2_w 278178364
    //   27485: l2i
    //   27486: ldc_w -965714075
    //   27489: ixor
    //   27490: ldc2_w -1273329959
    //   27493: l2i
    //   27494: ldc_w -529671959
    //   27497: ixor
    //   27498: ixor
    //   27499: lookupswitch default -> 34819, -2104251543 -> 27524, -1643508449 -> 27482
    //   27524: getfield targetHudX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27527: getstatic Perryc.0 : I
    //   27530: ifle -> 27544
    //   27533: ldc2_w 68749697
    //   27536: l2i
    //   27537: ldc_w 1153153413
    //   27540: ixor
    //   27541: goto -> 27552
    //   27544: ldc2_w 1410304535
    //   27547: l2i
    //   27548: ldc_w -1594237982
    //   27551: ixor
    //   27552: ldc2_w 956947299
    //   27555: l2i
    //   27556: ldc_w 1390918189
    //   27559: ixor
    //   27560: ixor
    //   27561: lookupswitch default -> 35555, -1625804613 -> 27588, 726454602 -> 27544
    //   27588: goto -> 27592
    //   27591: athrow
    //   27592: invokevirtual getValue : ()Ljava/lang/Object;
    //   27595: goto -> 27599
    //   27598: athrow
    //   27599: checkcast java/lang/Integer
    //   27602: getstatic Perryc.1 : I
    //   27605: ifeq -> 27619
    //   27608: ldc2_w 652990724
    //   27611: l2i
    //   27612: ldc_w 236558993
    //   27615: ixor
    //   27616: goto -> 27627
    //   27619: ldc2_w 472867041
    //   27622: l2i
    //   27623: ldc_w 1654098908
    //   27626: ixor
    //   27627: ldc2_w 831065185
    //   27630: l2i
    //   27631: ldc_w -311540725
    //   27634: ixor
    //   27635: ixor
    //   27636: lookupswitch default -> 35587, -1570790569 -> 27664, -199947265 -> 27619
    //   27664: goto -> 27668
    //   27667: athrow
    //   27668: invokevirtual intValue : ()I
    //   27671: goto -> 27675
    //   27674: athrow
    //   27675: ldc2_w 2048654610
    //   27678: l2i
    //   27679: ldc_w 2048654624
    //   27682: ixor
    //   27683: iadd
    //   27684: getstatic Perryc.0 : I
    //   27687: ifle -> 27701
    //   27690: ldc2_w 1073983653
    //   27693: l2i
    //   27694: ldc_w -538944061
    //   27697: ixor
    //   27698: goto -> 27709
    //   27701: ldc2_w 400957791
    //   27704: l2i
    //   27705: ldc_w -326518147
    //   27708: ixor
    //   27709: ldc2_w -1047830557
    //   27712: l2i
    //   27713: ldc_w -1852079072
    //   27716: ixor
    //   27717: ixor
    //   27718: lookupswitch default -> 27744, -806144347 -> 35515, 1697554062 -> 27701
    //   27744: istore #13
    //   27746: getstatic Perryc.1 : I
    //   27749: ifeq -> 27763
    //   27752: ldc2_w -1275450996
    //   27755: l2i
    //   27756: ldc_w 1913422112
    //   27759: ixor
    //   27760: goto -> 27771
    //   27763: ldc2_w -930603135
    //   27766: l2i
    //   27767: ldc_w 1371093640
    //   27770: ixor
    //   27771: ldc2_w 583581103
    //   27774: l2i
    //   27775: ldc_w 1754777832
    //   27778: ixor
    //   27779: ixor
    //   27780: lookupswitch default -> 35147, -1951801877 -> 27763, -747745202 -> 27808
    //   27808: aload_0
    //   27809: getstatic Perryc.0 : I
    //   27812: ifle -> 27826
    //   27815: ldc2_w 1962329078
    //   27818: l2i
    //   27819: ldc_w -1016844922
    //   27822: ixor
    //   27823: goto -> 27834
    //   27826: ldc2_w -238959193
    //   27829: l2i
    //   27830: ldc_w -140344186
    //   27833: ixor
    //   27834: ldc2_w 1242456145
    //   27837: l2i
    //   27838: ldc_w -447853466
    //   27841: ixor
    //   27842: ixor
    //   27843: lookupswitch default -> 27868, 416465479 -> 35217, 2113529365 -> 27826
    //   27868: getfield targetHudY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27871: getstatic Perryc.0 : I
    //   27874: ifle -> 27888
    //   27877: ldc2_w 1237745257
    //   27880: l2i
    //   27881: ldc_w -1387952764
    //   27884: ixor
    //   27885: goto -> 27896
    //   27888: ldc2_w 800495484
    //   27891: l2i
    //   27892: ldc_w -1049032530
    //   27895: ixor
    //   27896: ldc2_w -1690004569
    //   27899: l2i
    //   27900: ldc_w 84751707
    //   27903: ixor
    //   27904: ixor
    //   27905: lookupswitch default -> 35227, 1887844654 -> 27932, 2060082449 -> 27888
    //   27932: goto -> 27936
    //   27935: athrow
    //   27936: invokevirtual getValue : ()Ljava/lang/Object;
    //   27939: goto -> 27943
    //   27942: athrow
    //   27943: checkcast java/lang/Integer
    //   27946: getstatic Perryc.c : I
    //   27949: iflt -> 27963
    //   27952: ldc2_w -323496217
    //   27955: l2i
    //   27956: ldc_w -1069590553
    //   27959: ixor
    //   27960: goto -> 27971
    //   27963: ldc2_w -1625916492
    //   27966: l2i
    //   27967: ldc_w 1315421687
    //   27970: ixor
    //   27971: ldc2_w 1520037507
    //   27974: l2i
    //   27975: ldc_w -1672577246
    //   27978: ixor
    //   27979: ixor
    //   27980: lookupswitch default -> 28008, -1583320989 -> 27963, -362868575 -> 35601
    //   28008: goto -> 28012
    //   28011: athrow
    //   28012: invokevirtual intValue : ()I
    //   28015: goto -> 28019
    //   28018: athrow
    //   28019: getstatic Perryc.c : I
    //   28022: iflt -> 28036
    //   28025: ldc2_w -2082652363
    //   28028: l2i
    //   28029: ldc_w 939968452
    //   28032: ixor
    //   28033: goto -> 28044
    //   28036: ldc2_w -1664934797
    //   28039: l2i
    //   28040: ldc_w -468031081
    //   28043: ixor
    //   28044: ldc2_w 1418490035
    //   28047: l2i
    //   28048: ldc_w -897683440
    //   28051: ixor
    //   28052: ixor
    //   28053: lookupswitch default -> 28080, -332520314 -> 28036, 623507538 -> 35101
    //   28080: aload_0
    //   28081: getstatic Perryc.0 : I
    //   28084: ifle -> 28098
    //   28087: ldc2_w -1026851397
    //   28090: l2i
    //   28091: ldc_w -169165064
    //   28094: ixor
    //   28095: goto -> 28106
    //   28098: ldc2_w -653353370
    //   28101: l2i
    //   28102: ldc_w 1104896206
    //   28105: ixor
    //   28106: ldc2_w 1888055694
    //   28109: l2i
    //   28110: ldc_w -612491660
    //   28113: ixor
    //   28114: ixor
    //   28115: lookupswitch default -> 35333, -1663652679 -> 28098, 857903442 -> 28140
    //   28140: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   28143: getstatic Perryc.c : I
    //   28146: iflt -> 28160
    //   28149: ldc2_w 1219447336
    //   28152: l2i
    //   28153: ldc_w -746615674
    //   28156: ixor
    //   28157: goto -> 28168
    //   28160: ldc2_w -1349196896
    //   28163: l2i
    //   28164: ldc_w -475619316
    //   28167: ixor
    //   28168: ldc2_w -905798537
    //   28171: l2i
    //   28172: ldc_w 1085589265
    //   28175: ixor
    //   28176: ixor
    //   28177: lookupswitch default -> 34937, -964421430 -> 28204, 291937736 -> 28160
    //   28204: goto -> 28208
    //   28207: athrow
    //   28208: invokevirtual getFontHeight : ()I
    //   28211: goto -> 28215
    //   28214: athrow
    //   28215: ldc2_w -1048117278
    //   28218: l2i
    //   28219: ldc_w -1048117279
    //   28222: ixor
    //   28223: imul
    //   28224: iadd
    //   28225: ldc2_w 817962883
    //   28228: l2i
    //   28229: ldc_w 817962927
    //   28232: ixor
    //   28233: iadd
    //   28234: getstatic Perryc.1 : I
    //   28237: ifeq -> 28251
    //   28240: ldc2_w -1410115635
    //   28243: l2i
    //   28244: ldc_w 1150342011
    //   28247: ixor
    //   28248: goto -> 28259
    //   28251: ldc2_w 791685355
    //   28254: l2i
    //   28255: ldc_w 1146081023
    //   28258: ixor
    //   28259: ldc2_w 861579020
    //   28262: l2i
    //   28263: ldc_w -55641171
    //   28266: ixor
    //   28267: ixor
    //   28268: lookupswitch default -> 35241, -1534346571 -> 28296, 546822167 -> 28251
    //   28296: istore #14
    //   28298: getstatic Perryc.0 : I
    //   28301: ifle -> 28315
    //   28304: ldc2_w -118739066
    //   28307: l2i
    //   28308: ldc_w 868318353
    //   28311: ixor
    //   28312: goto -> 28323
    //   28315: ldc2_w 1319516154
    //   28318: l2i
    //   28319: ldc_w 680798983
    //   28322: ixor
    //   28323: ldc2_w -627350081
    //   28326: l2i
    //   28327: ldc_w -849956519
    //   28330: ixor
    //   28331: ixor
    //   28332: lookupswitch default -> 28360, -1120142906 -> 28315, -589264911 -> 35353
    //   28360: aload #4
    //   28362: getstatic Perryc.0 : I
    //   28365: ifle -> 28379
    //   28368: ldc2_w -987842750
    //   28371: l2i
    //   28372: ldc_w -286980150
    //   28375: ixor
    //   28376: goto -> 28387
    //   28379: ldc2_w -1974918710
    //   28382: l2i
    //   28383: ldc_w 675232576
    //   28386: ixor
    //   28387: ldc2_w 447253705
    //   28390: l2i
    //   28391: ldc_w -1752624938
    //   28394: ixor
    //   28395: ixor
    //   28396: lookupswitch default -> 35571, -1495651177 -> 28379, 794265237 -> 28424
    //   28424: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   28427: getstatic Perryc.1 : I
    //   28430: ifeq -> 28444
    //   28433: ldc2_w 1276644648
    //   28436: l2i
    //   28437: ldc_w 849300923
    //   28440: ixor
    //   28441: goto -> 28452
    //   28444: ldc2_w 319232205
    //   28447: l2i
    //   28448: ldc_w -2027821035
    //   28451: ixor
    //   28452: ldc2_w -1856137656
    //   28455: l2i
    //   28456: ldc_w 1598315805
    //   28459: ixor
    //   28460: ixor
    //   28461: lookupswitch default -> 28488, -1331786810 -> 34895, -130596396 -> 28444
    //   28488: getfield field_70460_b : Lnet/minecraft/util/NonNullList;
    //   28491: getstatic Perryc.1 : I
    //   28494: ifeq -> 28508
    //   28497: ldc2_w -1336387326
    //   28500: l2i
    //   28501: ldc_w 2142834643
    //   28504: ixor
    //   28505: goto -> 28516
    //   28508: ldc2_w -691569873
    //   28511: l2i
    //   28512: ldc_w 310870810
    //   28515: ixor
    //   28516: ldc2_w -467088287
    //   28519: l2i
    //   28520: ldc_w -1491585750
    //   28523: ixor
    //   28524: ixor
    //   28525: lookupswitch default -> 35547, -2022702722 -> 28552, -1932415078 -> 28508
    //   28552: goto -> 28556
    //   28555: athrow
    //   28556: invokevirtual iterator : ()Ljava/util/Iterator;
    //   28559: goto -> 28563
    //   28562: athrow
    //   28563: getstatic Perryc.1 : I
    //   28566: ifeq -> 28580
    //   28569: ldc2_w -1599173116
    //   28572: l2i
    //   28573: ldc_w 2028413579
    //   28576: ixor
    //   28577: goto -> 28588
    //   28580: ldc2_w -1644448792
    //   28583: l2i
    //   28584: ldc_w 1362287943
    //   28587: ixor
    //   28588: ldc2_w -419618706
    //   28591: l2i
    //   28592: ldc_w 1793284272
    //   28595: ixor
    //   28596: ixor
    //   28597: lookupswitch default -> 28624, -1597510151 -> 28580, 1415042129 -> 34899
    //   28624: astore #15
    //   28626: getstatic Perryc.0 : I
    //   28629: ifle -> 28643
    //   28632: ldc2_w -669018260
    //   28635: l2i
    //   28636: ldc_w -698412687
    //   28639: ixor
    //   28640: goto -> 28651
    //   28643: ldc2_w -1413732618
    //   28646: l2i
    //   28647: ldc_w 290047286
    //   28650: ixor
    //   28651: ldc2_w -696657630
    //   28654: l2i
    //   28655: ldc_w -1493967891
    //   28658: ixor
    //   28659: ixor
    //   28660: lookupswitch default -> 34871, -897588977 -> 28688, 2127201490 -> 28643
    //   28688: aload #15
    //   28690: getstatic Perryc.0 : I
    //   28693: ifle -> 28707
    //   28696: ldc2_w -23952683
    //   28699: l2i
    //   28700: ldc_w 1681860944
    //   28703: ixor
    //   28704: goto -> 28715
    //   28707: ldc2_w -495457980
    //   28710: l2i
    //   28711: ldc_w 573972410
    //   28714: ixor
    //   28715: ldc2_w -1348090779
    //   28718: l2i
    //   28719: ldc_w 1160042012
    //   28722: ixor
    //   28723: ixor
    //   28724: lookupswitch default -> 28752, -898395616 -> 28707, 1881979388 -> 35007
    //   28752: goto -> 28756
    //   28755: athrow
    //   28756: invokeinterface hasNext : ()Z
    //   28761: goto -> 28765
    //   28764: athrow
    //   28765: ifeq -> 28779
    //   28768: ldc2_w -1210457640
    //   28771: l2i
    //   28772: ldc_w -1382828710
    //   28775: ixor
    //   28776: goto -> 28787
    //   28779: ldc2_w 291351094
    //   28782: l2i
    //   28783: ldc_w 186121907
    //   28786: ixor
    //   28787: ldc2_w -1636648154
    //   28790: l2i
    //   28791: ldc_w -1744250345
    //   28794: ixor
    //   28795: ixor
    //   28796: tableswitch default -> 28768, 472921523 -> 28820, 472921524 -> 34690
    //   28820: getstatic Perryc.1 : I
    //   28823: ifeq -> 28837
    //   28826: ldc2_w 1822800648
    //   28829: l2i
    //   28830: ldc_w -497546411
    //   28833: ixor
    //   28834: goto -> 28845
    //   28837: ldc2_w 333407499
    //   28840: l2i
    //   28841: ldc_w 1783558415
    //   28844: ixor
    //   28845: ldc2_w 547104030
    //   28848: l2i
    //   28849: ldc_w -434696858
    //   28852: ixor
    //   28853: ixor
    //   28854: lookupswitch default -> 28880, 908237142 -> 28837, 1215731749 -> 34839
    //   28880: aload #15
    //   28882: getstatic Perryc.c : I
    //   28885: iflt -> 28899
    //   28888: ldc2_w -254932558
    //   28891: l2i
    //   28892: ldc_w 43055507
    //   28895: ixor
    //   28896: goto -> 28907
    //   28899: ldc2_w 2092869797
    //   28902: l2i
    //   28903: ldc_w -281313501
    //   28906: ixor
    //   28907: ldc2_w 1505890014
    //   28910: l2i
    //   28911: ldc_w -1167495126
    //   28914: ixor
    //   28915: ixor
    //   28916: lookupswitch default -> 35527, 301305557 -> 28899, 1882106226 -> 28944
    //   28944: goto -> 28948
    //   28947: athrow
    //   28948: invokeinterface next : ()Ljava/lang/Object;
    //   28953: goto -> 28957
    //   28956: athrow
    //   28957: checkcast net/minecraft/item/ItemStack
    //   28960: getstatic Perryc.1 : I
    //   28963: ifeq -> 28977
    //   28966: ldc2_w 679605263
    //   28969: l2i
    //   28970: ldc_w -729060273
    //   28973: ixor
    //   28974: goto -> 28985
    //   28977: ldc2_w -748999517
    //   28980: l2i
    //   28981: ldc_w 755547302
    //   28984: ixor
    //   28985: ldc2_w 658635246
    //   28988: l2i
    //   28989: ldc_w 705088559
    //   28992: ixor
    //   28993: ixor
    //   28994: lookupswitch default -> 29020, -246567551 -> 35505, 1703122793 -> 28977
    //   29020: astore #16
    //   29022: iinc #12, 1
    //   29025: getstatic Perryc.0 : I
    //   29028: ifle -> 29042
    //   29031: ldc2_w -1712912324
    //   29034: l2i
    //   29035: ldc_w -573689739
    //   29038: ixor
    //   29039: goto -> 29050
    //   29042: ldc2_w 1409871943
    //   29045: l2i
    //   29046: ldc_w -1906806799
    //   29049: ixor
    //   29050: ldc2_w -2062434356
    //   29053: l2i
    //   29054: ldc_w -1877925397
    //   29057: ixor
    //   29058: ixor
    //   29059: lookupswitch default -> 29084, 293131072 -> 29042, 1361684078 -> 35445
    //   29084: aload #16
    //   29086: getstatic Perryc.1 : I
    //   29089: ifeq -> 29103
    //   29092: ldc2_w 1625250167
    //   29095: l2i
    //   29096: ldc_w 1792068768
    //   29099: ixor
    //   29100: goto -> 29111
    //   29103: ldc2_w 989257228
    //   29106: l2i
    //   29107: ldc_w 1740484971
    //   29110: ixor
    //   29111: ldc2_w 1419154337
    //   29114: l2i
    //   29115: ldc_w 1580858031
    //   29118: ixor
    //   29119: ixor
    //   29120: lookupswitch default -> 29148, 10550489 -> 35229, 1175381080 -> 29103
    //   29148: goto -> 29152
    //   29151: athrow
    //   29152: invokevirtual func_190926_b : ()Z
    //   29155: goto -> 29159
    //   29158: athrow
    //   29159: ifeq -> 29173
    //   29162: ldc2_w 1167131082
    //   29165: l2i
    //   29166: ldc_w -2015436141
    //   29169: ixor
    //   29170: goto -> 29181
    //   29173: ldc2_w 1686741783
    //   29176: l2i
    //   29177: ldc_w -1496956849
    //   29180: ixor
    //   29181: ldc2_w -572163893
    //   29184: l2i
    //   29185: ldc_w 345398646
    //   29188: ixor
    //   29189: ixor
    //   29190: tableswitch default -> 29162, 188532452 -> 29212, 188532453 -> 29215
    //   29212: goto -> 28626
    //   29215: getstatic Perryc.0 : I
    //   29218: ifle -> 29232
    //   29221: ldc2_w 1379833458
    //   29224: l2i
    //   29225: ldc_w -674875837
    //   29228: ixor
    //   29229: goto -> 29240
    //   29232: ldc2_w -463718758
    //   29235: l2i
    //   29236: ldc_w 1517545278
    //   29239: ixor
    //   29240: ldc2_w 44493700
    //   29243: l2i
    //   29244: ldc_w 1928221373
    //   29247: ixor
    //   29248: ixor
    //   29249: lookupswitch default -> 29276, -982951691 -> 29232, -173008632 -> 34969
    //   29276: iload #13
    //   29278: ldc2_w -189472942
    //   29281: l2i
    //   29282: ldc_w -189473016
    //   29285: ixor
    //   29286: isub
    //   29287: ldc2_w -1870038991
    //   29290: l2i
    //   29291: ldc_w -1870038984
    //   29294: ixor
    //   29295: getstatic Perryc.1 : I
    //   29298: ifeq -> 29312
    //   29301: ldc2_w 1827419242
    //   29304: l2i
    //   29305: ldc_w 2128752543
    //   29308: ixor
    //   29309: goto -> 29320
    //   29312: ldc2_w 1468665720
    //   29315: l2i
    //   29316: ldc_w -1820437040
    //   29319: ixor
    //   29320: ldc2_w 1823888391
    //   29323: l2i
    //   29324: ldc_w -2144410578
    //   29327: ixor
    //   29328: ixor
    //   29329: lookupswitch default -> 29356, -1543562536 -> 29312, -23680036 -> 34751
    //   29356: iload #12
    //   29358: isub
    //   29359: ldc2_w -2079722611
    //   29362: l2i
    //   29363: ldc_w -2079722599
    //   29366: ixor
    //   29367: imul
    //   29368: iadd
    //   29369: ldc2_w -1285351460
    //   29372: l2i
    //   29373: ldc_w -1285351458
    //   29376: ixor
    //   29377: iadd
    //   29378: getstatic Perryc.0 : I
    //   29381: ifle -> 29395
    //   29384: ldc2_w 1908667029
    //   29387: l2i
    //   29388: ldc_w -1351732896
    //   29391: ixor
    //   29392: goto -> 29403
    //   29395: ldc2_w 1905872756
    //   29398: l2i
    //   29399: ldc_w 1314023469
    //   29402: ixor
    //   29403: ldc2_w 1747186689
    //   29406: l2i
    //   29407: ldc_w -299755041
    //   29410: ixor
    //   29411: ixor
    //   29412: lookupswitch default -> 35057, -1177892217 -> 29440, 1487679019 -> 29395
    //   29440: istore #17
    //   29442: getstatic Perryc.0 : I
    //   29445: ifle -> 29459
    //   29448: ldc2_w -1319021001
    //   29451: l2i
    //   29452: ldc_w 984462074
    //   29455: ixor
    //   29456: goto -> 29467
    //   29459: ldc2_w 1627826418
    //   29462: l2i
    //   29463: ldc_w -214214648
    //   29466: ixor
    //   29467: ldc2_w 314430946
    //   29470: l2i
    //   29471: ldc_w -1629249779
    //   29474: ixor
    //   29475: ixor
    //   29476: lookupswitch default -> 29504, -1720923864 -> 29459, 127053346 -> 35161
    //   29504: goto -> 29508
    //   29507: athrow
    //   29508: invokestatic func_179126_j : ()V
    //   29511: goto -> 29515
    //   29514: athrow
    //   29515: getstatic Perryc.0 : I
    //   29518: ifle -> 29532
    //   29521: ldc2_w 1519036967
    //   29524: l2i
    //   29525: ldc_w -1836880379
    //   29528: ixor
    //   29529: goto -> 29540
    //   29532: ldc2_w -2011514339
    //   29535: l2i
    //   29536: ldc_w -1588475925
    //   29539: ixor
    //   29540: ldc2_w 775340289
    //   29543: l2i
    //   29544: ldc_w -1109617257
    //   29547: ixor
    //   29548: ixor
    //   29549: lookupswitch default -> 35059, -1163843232 -> 29576, 1541640372 -> 29532
    //   29576: getstatic bigname/zprestige/webhack/util/RenderUtil.itemRender : Lnet/minecraft/client/renderer/RenderItem;
    //   29579: ldc_w 0.014249362
    //   29582: invokestatic floatToIntBits : (F)I
    //   29585: ldc_w 2132899368
    //   29588: ixor
    //   29589: invokestatic intBitsToFloat : (I)F
    //   29592: getstatic Perryc.c : I
    //   29595: iflt -> 29609
    //   29598: ldc2_w 1985411657
    //   29601: l2i
    //   29602: ldc_w -571920289
    //   29605: ixor
    //   29606: goto -> 29617
    //   29609: ldc2_w 596053345
    //   29612: l2i
    //   29613: ldc_w -576592949
    //   29616: ixor
    //   29617: ldc2_w 970161479
    //   29620: l2i
    //   29621: ldc_w 1232433849
    //   29624: ixor
    //   29625: ixor
    //   29626: lookupswitch default -> 29652, -619067928 -> 34831, 293093390 -> 29609
    //   29652: putfield field_77023_b : F
    //   29655: getstatic Perryc.c : I
    //   29658: iflt -> 29672
    //   29661: ldc2_w -588927660
    //   29664: l2i
    //   29665: ldc_w 671610354
    //   29668: ixor
    //   29669: goto -> 29680
    //   29672: ldc2_w 237461981
    //   29675: l2i
    //   29676: ldc_w 1112992420
    //   29679: ixor
    //   29680: ldc2_w -644999121
    //   29683: l2i
    //   29684: ldc_w -1497342630
    //   29687: ixor
    //   29688: ixor
    //   29689: lookupswitch default -> 34719, -1951654445 -> 29672, 859819532 -> 29716
    //   29716: getstatic bigname/zprestige/webhack/util/RenderUtil.itemRender : Lnet/minecraft/client/renderer/RenderItem;
    //   29719: getstatic Perryc.1 : I
    //   29722: ifeq -> 29736
    //   29725: ldc2_w -1529242481
    //   29728: l2i
    //   29729: ldc_w 1268327770
    //   29732: ixor
    //   29733: goto -> 29744
    //   29736: ldc2_w 1780687368
    //   29739: l2i
    //   29740: ldc_w -544089691
    //   29743: ixor
    //   29744: ldc2_w -2024379257
    //   29747: l2i
    //   29748: ldc_w -692145310
    //   29751: ixor
    //   29752: ixor
    //   29753: lookupswitch default -> 29780, -1096260048 -> 35507, 959262083 -> 29736
    //   29780: aload #16
    //   29782: getstatic Perryc.0 : I
    //   29785: ifle -> 29799
    //   29788: ldc2_w 4022352
    //   29791: l2i
    //   29792: ldc_w 1419530580
    //   29795: ixor
    //   29796: goto -> 29807
    //   29799: ldc2_w -375690094
    //   29802: l2i
    //   29803: ldc_w 279075674
    //   29806: ixor
    //   29807: ldc2_w 1331507131
    //   29810: l2i
    //   29811: ldc_w -204901151
    //   29814: ixor
    //   29815: ixor
    //   29816: lookupswitch default -> 35367, -399152546 -> 29799, 1168993426 -> 29844
    //   29844: iload #13
    //   29846: ldc2_w 272909840
    //   29849: l2i
    //   29850: ldc_w 272909958
    //   29853: ixor
    //   29854: isub
    //   29855: ldc2_w 1715087446
    //   29858: l2i
    //   29859: ldc_w 1715087455
    //   29862: ixor
    //   29863: getstatic Perryc.0 : I
    //   29866: ifle -> 29880
    //   29869: ldc2_w -542280958
    //   29872: l2i
    //   29873: ldc_w 733265772
    //   29876: ixor
    //   29877: goto -> 29888
    //   29880: ldc2_w -583078397
    //   29883: l2i
    //   29884: ldc_w -1696433054
    //   29887: ixor
    //   29888: ldc2_w -861111298
    //   29891: l2i
    //   29892: ldc_w -132609089
    //   29895: ixor
    //   29896: ixor
    //   29897: lookupswitch default -> 29924, -1062388689 -> 35309, -22511571 -> 29880
    //   29924: iload #12
    //   29926: isub
    //   29927: ldc2_w 1092913171
    //   29930: l2i
    //   29931: ldc_w 1092913159
    //   29934: ixor
    //   29935: imul
    //   29936: iadd
    //   29937: ldc2_w -1105189371
    //   29940: l2i
    //   29941: ldc_w -1105189369
    //   29944: ixor
    //   29945: iadd
    //   29946: getstatic Perryc.c : I
    //   29949: iflt -> 29963
    //   29952: ldc2_w 1022506945
    //   29955: l2i
    //   29956: ldc_w -1933910293
    //   29959: ixor
    //   29960: goto -> 29971
    //   29963: ldc2_w 1382439380
    //   29966: l2i
    //   29967: ldc_w 345448006
    //   29970: ixor
    //   29971: ldc2_w 1834017415
    //   29974: l2i
    //   29975: ldc_w 777216236
    //   29978: ixor
    //   29979: ixor
    //   29980: lookupswitch default -> 35277, -213161151 -> 29963, 99796473 -> 30008
    //   30008: iload #14
    //   30010: getstatic Perryc.0 : I
    //   30013: ifle -> 30027
    //   30016: ldc2_w 1040610254
    //   30019: l2i
    //   30020: ldc_w 2145311354
    //   30023: ixor
    //   30024: goto -> 30035
    //   30027: ldc2_w -1290373669
    //   30030: l2i
    //   30031: ldc_w 453118649
    //   30034: ixor
    //   30035: ldc2_w -1523482351
    //   30038: l2i
    //   30039: ldc_w 1232159260
    //   30042: ixor
    //   30043: ixor
    //   30044: lookupswitch default -> 35401, -1382520135 -> 30027, 1146403951 -> 30072
    //   30072: goto -> 30076
    //   30075: athrow
    //   30076: invokevirtual func_180450_b : (Lnet/minecraft/item/ItemStack;II)V
    //   30079: goto -> 30083
    //   30082: athrow
    //   30083: getstatic Perryc.1 : I
    //   30086: ifeq -> 30100
    //   30089: ldc2_w -19629502
    //   30092: l2i
    //   30093: ldc_w 724996660
    //   30096: ixor
    //   30097: goto -> 30108
    //   30100: ldc2_w 548957984
    //   30103: l2i
    //   30104: ldc_w -765957200
    //   30107: ixor
    //   30108: ldc2_w -1731271637
    //   30111: l2i
    //   30112: ldc_w 237843961
    //   30115: ixor
    //   30116: ixor
    //   30117: lookupswitch default -> 30144, -1291612316 -> 30100, 1124153764 -> 34709
    //   30144: getstatic bigname/zprestige/webhack/util/RenderUtil.itemRender : Lnet/minecraft/client/renderer/RenderItem;
    //   30147: getstatic Perryc.1 : I
    //   30150: ifeq -> 30164
    //   30153: ldc2_w -2138842535
    //   30156: l2i
    //   30157: ldc_w -1177909359
    //   30160: ixor
    //   30161: goto -> 30172
    //   30164: ldc2_w 727624502
    //   30167: l2i
    //   30168: ldc_w 773746216
    //   30171: ixor
    //   30172: ldc2_w 385507387
    //   30175: l2i
    //   30176: ldc_w -1073127481
    //   30179: ixor
    //   30180: ixor
    //   30181: lookupswitch default -> 30208, -2040421244 -> 30164, -272997836 -> 35473
    //   30208: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   30211: getstatic Perryc.1 : I
    //   30214: ifeq -> 30228
    //   30217: ldc2_w 1857863591
    //   30220: l2i
    //   30221: ldc_w -1360411509
    //   30224: ixor
    //   30225: goto -> 30236
    //   30228: ldc2_w 199206642
    //   30231: l2i
    //   30232: ldc_w 1894716936
    //   30235: ixor
    //   30236: ldc2_w -2004157435
    //   30239: l2i
    //   30240: ldc_w -1244149882
    //   30243: ixor
    //   30244: ixor
    //   30245: lookupswitch default -> 30272, -49790801 -> 34875, 849565824 -> 30228
    //   30272: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   30275: getstatic Perryc.1 : I
    //   30278: ifeq -> 30292
    //   30281: ldc2_w 1448859118
    //   30284: l2i
    //   30285: ldc_w -1483121209
    //   30288: ixor
    //   30289: goto -> 30300
    //   30292: ldc2_w -457584618
    //   30295: l2i
    //   30296: ldc_w -1328253634
    //   30299: ixor
    //   30300: ldc2_w -642405352
    //   30303: l2i
    //   30304: ldc_w 1642713977
    //   30307: ixor
    //   30308: ixor
    //   30309: lookupswitch default -> 35447, -332277175 -> 30336, 1235154760 -> 30292
    //   30336: aload #16
    //   30338: getstatic Perryc.1 : I
    //   30341: ifeq -> 30355
    //   30344: ldc2_w -344184370
    //   30347: l2i
    //   30348: ldc_w -932678741
    //   30351: ixor
    //   30352: goto -> 30363
    //   30355: ldc2_w -766565572
    //   30358: l2i
    //   30359: ldc_w 1308671592
    //   30362: ixor
    //   30363: ldc2_w -251763136
    //   30366: l2i
    //   30367: ldc_w 1315224871
    //   30370: ixor
    //   30371: ixor
    //   30372: lookupswitch default -> 35283, -1651605246 -> 30355, 584402483 -> 30400
    //   30400: iload #13
    //   30402: ldc2_w 291109286
    //   30405: l2i
    //   30406: ldc_w 291109168
    //   30409: ixor
    //   30410: isub
    //   30411: ldc2_w -767285246
    //   30414: l2i
    //   30415: ldc_w -767285237
    //   30418: ixor
    //   30419: getstatic Perryc.c : I
    //   30422: iflt -> 30436
    //   30425: ldc2_w -1887164141
    //   30428: l2i
    //   30429: ldc_w 886479671
    //   30432: ixor
    //   30433: goto -> 30444
    //   30436: ldc2_w 2069064585
    //   30439: l2i
    //   30440: ldc_w 2055737790
    //   30443: ixor
    //   30444: ldc2_w 1992629648
    //   30447: l2i
    //   30448: ldc_w 850847467
    //   30451: ixor
    //   30452: ixor
    //   30453: lookupswitch default -> 30480, -14595745 -> 35535, 1438392915 -> 30436
    //   30480: iload #12
    //   30482: isub
    //   30483: ldc2_w -506461898
    //   30486: l2i
    //   30487: ldc_w -506461918
    //   30490: ixor
    //   30491: imul
    //   30492: iadd
    //   30493: ldc2_w 2025857962
    //   30496: l2i
    //   30497: ldc_w 2025857960
    //   30500: ixor
    //   30501: iadd
    //   30502: getstatic Perryc.1 : I
    //   30505: ifeq -> 30519
    //   30508: ldc2_w 1467453009
    //   30511: l2i
    //   30512: ldc_w -629882695
    //   30515: ixor
    //   30516: goto -> 30527
    //   30519: ldc2_w 857886440
    //   30522: l2i
    //   30523: ldc_w -1527038975
    //   30526: ixor
    //   30527: ldc2_w 1500467248
    //   30530: l2i
    //   30531: ldc_w 2122463400
    //   30534: ixor
    //   30535: ixor
    //   30536: lookupswitch default -> 30564, -1427233168 -> 35155, 641045688 -> 30519
    //   30564: iload #14
    //   30566: ldc_w ''
    //   30569: getstatic Perryc.0 : I
    //   30572: ifle -> 30586
    //   30575: ldc2_w -1349536354
    //   30578: l2i
    //   30579: ldc_w -1205973975
    //   30582: ixor
    //   30583: goto -> 30594
    //   30586: ldc2_w -2082152530
    //   30589: l2i
    //   30590: ldc_w -1190801775
    //   30593: ixor
    //   30594: ldc2_w -387896778
    //   30597: l2i
    //   30598: ldc_w 1711351027
    //   30601: ixor
    //   30602: ixor
    //   30603: lookupswitch default -> 30628, -1720584334 -> 35285, -567173733 -> 30586
    //   30628: goto -> 30632
    //   30631: athrow
    //   30632: invokevirtual func_180453_a : (Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V
    //   30635: goto -> 30639
    //   30638: athrow
    //   30639: getstatic Perryc.0 : I
    //   30642: ifle -> 30656
    //   30645: ldc2_w -877978052
    //   30648: l2i
    //   30649: ldc_w -916228880
    //   30652: ixor
    //   30653: goto -> 30664
    //   30656: ldc2_w 900264865
    //   30659: l2i
    //   30660: ldc_w -1856167450
    //   30663: ixor
    //   30664: ldc2_w 451775263
    //   30667: l2i
    //   30668: ldc_w -900596782
    //   30671: ixor
    //   30672: ixor
    //   30673: lookupswitch default -> 30700, -764143103 -> 35225, -7077485 -> 30656
    //   30700: getstatic bigname/zprestige/webhack/util/RenderUtil.itemRender : Lnet/minecraft/client/renderer/RenderItem;
    //   30703: ldc_w 6.9249334E37
    //   30706: invokestatic floatToIntBits : (F)I
    //   30709: ldc_w 2119197631
    //   30712: ixor
    //   30713: invokestatic intBitsToFloat : (I)F
    //   30716: getstatic Perryc.0 : I
    //   30719: ifle -> 30733
    //   30722: ldc2_w 1630518323
    //   30725: l2i
    //   30726: ldc_w -956460358
    //   30729: ixor
    //   30730: goto -> 30741
    //   30733: ldc2_w -565948271
    //   30736: l2i
    //   30737: ldc_w 1273070136
    //   30740: ixor
    //   30741: ldc2_w -1677278246
    //   30744: l2i
    //   30745: ldc_w 1995156882
    //   30748: ixor
    //   30749: ixor
    //   30750: lookupswitch default -> 30776, 1295990977 -> 34697, 1552351708 -> 30733
    //   30776: putfield field_77023_b : F
    //   30779: getstatic Perryc.1 : I
    //   30782: ifeq -> 30796
    //   30785: ldc2_w -1118230248
    //   30788: l2i
    //   30789: ldc_w -946560824
    //   30792: ixor
    //   30793: goto -> 30804
    //   30796: ldc2_w 1926788773
    //   30799: l2i
    //   30800: ldc_w -744400732
    //   30803: ixor
    //   30804: ldc2_w 1680158566
    //   30807: l2i
    //   30808: ldc_w 864102356
    //   30811: ixor
    //   30812: ixor
    //   30813: lookupswitch default -> 30840, -1461510692 -> 30796, 761889122 -> 35045
    //   30840: goto -> 30844
    //   30843: athrow
    //   30844: invokestatic func_179098_w : ()V
    //   30847: goto -> 30851
    //   30850: athrow
    //   30851: getstatic Perryc.c : I
    //   30854: iflt -> 30868
    //   30857: ldc2_w 1860953128
    //   30860: l2i
    //   30861: ldc_w 1362638778
    //   30864: ixor
    //   30865: goto -> 30876
    //   30868: ldc2_w -1794308633
    //   30871: l2i
    //   30872: ldc_w 1954626056
    //   30875: ixor
    //   30876: ldc2_w 854256484
    //   30879: l2i
    //   30880: ldc_w -1936755975
    //   30883: ixor
    //   30884: ixor
    //   30885: lookupswitch default -> 30912, -2118759921 -> 34739, 752253209 -> 30868
    //   30912: goto -> 30916
    //   30915: athrow
    //   30916: invokestatic func_179140_f : ()V
    //   30919: goto -> 30923
    //   30922: athrow
    //   30923: getstatic Perryc.1 : I
    //   30926: ifeq -> 30940
    //   30929: ldc2_w 1585896838
    //   30932: l2i
    //   30933: ldc_w 1340791207
    //   30936: ixor
    //   30937: goto -> 30948
    //   30940: ldc2_w 1402249845
    //   30943: l2i
    //   30944: ldc_w 160591649
    //   30947: ixor
    //   30948: ldc2_w 689274994
    //   30951: l2i
    //   30952: ldc_w -295554472
    //   30955: ixor
    //   30956: ixor
    //   30957: lookupswitch default -> 30984, -702826997 -> 35343, 278096717 -> 30940
    //   30984: goto -> 30988
    //   30987: athrow
    //   30988: invokestatic func_179097_i : ()V
    //   30991: goto -> 30995
    //   30994: athrow
    //   30995: getstatic Perryc.c : I
    //   30998: iflt -> 31012
    //   31001: ldc2_w 1413824210
    //   31004: l2i
    //   31005: ldc_w 1405631059
    //   31008: ixor
    //   31009: goto -> 31020
    //   31012: ldc2_w 47189658
    //   31015: l2i
    //   31016: ldc_w -1739710415
    //   31019: ixor
    //   31020: ldc2_w -235403721
    //   31023: l2i
    //   31024: ldc_w -2019567260
    //   31027: ixor
    //   31028: ixor
    //   31029: lookupswitch default -> 31056, -733821564 -> 31012, 1911217106 -> 34781
    //   31056: aload #16
    //   31058: getstatic Perryc.1 : I
    //   31061: ifeq -> 31075
    //   31064: ldc2_w 2120693477
    //   31067: l2i
    //   31068: ldc_w -573888328
    //   31071: ixor
    //   31072: goto -> 31083
    //   31075: ldc2_w 1286496016
    //   31078: l2i
    //   31079: ldc_w -1188749649
    //   31082: ixor
    //   31083: ldc2_w 732513265
    //   31086: l2i
    //   31087: ldc_w 829997909
    //   31090: ixor
    //   31091: ixor
    //   31092: lookupswitch default -> 31120, -1182949639 -> 35531, 144463480 -> 31075
    //   31120: goto -> 31124
    //   31123: athrow
    //   31124: invokevirtual func_190916_E : ()I
    //   31127: goto -> 31131
    //   31130: athrow
    //   31131: ldc2_w 2133391160
    //   31134: l2i
    //   31135: ldc_w 2133391161
    //   31138: ixor
    //   31139: if_icmple -> 31153
    //   31142: ldc2_w -1213890873
    //   31145: l2i
    //   31146: ldc_w -2061833145
    //   31149: ixor
    //   31150: goto -> 31161
    //   31153: ldc2_w 1471766707
    //   31156: l2i
    //   31157: ldc_w 1694954034
    //   31160: ixor
    //   31161: ldc2_w -825450875
    //   31164: l2i
    //   31165: ldc_w 1111718677
    //   31168: ixor
    //   31169: ixor
    //   31170: tableswitch default -> 31142, -1104120048 -> 31192, -1104120047 -> 31626
    //   31192: new java/lang/StringBuilder
    //   31195: dup
    //   31196: getstatic Perryc.c : I
    //   31199: iflt -> 31213
    //   31202: ldc2_w -1356183122
    //   31205: l2i
    //   31206: ldc_w 878111690
    //   31209: ixor
    //   31210: goto -> 31221
    //   31213: ldc2_w -805964095
    //   31216: l2i
    //   31217: ldc_w 8348299
    //   31220: ixor
    //   31221: ldc2_w 1012240119
    //   31224: l2i
    //   31225: ldc_w 1626011120
    //   31228: ixor
    //   31229: ixor
    //   31230: lookupswitch default -> 35313, -1825181875 -> 31256, -943466141 -> 31213
    //   31256: goto -> 31260
    //   31259: athrow
    //   31260: invokespecial <init> : ()V
    //   31263: goto -> 31267
    //   31266: athrow
    //   31267: getstatic Perryc.c : I
    //   31270: iflt -> 31284
    //   31273: ldc2_w -1547699459
    //   31276: l2i
    //   31277: ldc_w -1398424025
    //   31280: ixor
    //   31281: goto -> 31292
    //   31284: ldc2_w -2062388709
    //   31287: l2i
    //   31288: ldc_w -762151155
    //   31291: ixor
    //   31292: ldc2_w -2107044352
    //   31295: l2i
    //   31296: ldc_w -1902819661
    //   31299: ixor
    //   31300: ixor
    //   31301: lookupswitch default -> 34925, 65408105 -> 31284, 1534870949 -> 31328
    //   31328: aload #16
    //   31330: getstatic Perryc.c : I
    //   31333: iflt -> 31347
    //   31336: ldc2_w 1798380364
    //   31339: l2i
    //   31340: ldc_w 1894051184
    //   31343: ixor
    //   31344: goto -> 31355
    //   31347: ldc2_w 449358501
    //   31350: l2i
    //   31351: ldc_w -638335578
    //   31354: ixor
    //   31355: ldc2_w -2101218212
    //   31358: l2i
    //   31359: ldc_w 678032032
    //   31362: ixor
    //   31363: ixor
    //   31364: lookupswitch default -> 35077, -1317146432 -> 31347, 1771268607 -> 31392
    //   31392: goto -> 31396
    //   31395: athrow
    //   31396: invokevirtual func_190916_E : ()I
    //   31399: goto -> 31403
    //   31402: athrow
    //   31403: getstatic Perryc.c : I
    //   31406: iflt -> 31420
    //   31409: ldc2_w -1551090935
    //   31412: l2i
    //   31413: ldc_w -1343839047
    //   31416: ixor
    //   31417: goto -> 31428
    //   31420: ldc2_w -1546305439
    //   31423: l2i
    //   31424: ldc_w -1017070897
    //   31427: ixor
    //   31428: ldc2_w -792940022
    //   31431: l2i
    //   31432: ldc_w 1371313625
    //   31435: ixor
    //   31436: ixor
    //   31437: lookupswitch default -> 31464, -1922385821 -> 35027, 206695501 -> 31420
    //   31464: goto -> 31468
    //   31467: athrow
    //   31468: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   31471: goto -> 31475
    //   31474: athrow
    //   31475: ldc_w ''
    //   31478: getstatic Perryc.1 : I
    //   31481: ifeq -> 31495
    //   31484: ldc2_w 237042474
    //   31487: l2i
    //   31488: ldc_w 1148523036
    //   31491: ixor
    //   31492: goto -> 31503
    //   31495: ldc2_w -347497457
    //   31498: l2i
    //   31499: ldc_w -1438981022
    //   31502: ixor
    //   31503: ldc2_w 1947616328
    //   31506: l2i
    //   31507: ldc_w 2141903001
    //   31510: ixor
    //   31511: ixor
    //   31512: lookupswitch default -> 35125, 1105819111 -> 31495, 1255138492 -> 31540
    //   31540: goto -> 31544
    //   31543: athrow
    //   31544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31547: goto -> 31551
    //   31550: athrow
    //   31551: getstatic Perryc.c : I
    //   31554: iflt -> 31568
    //   31557: ldc2_w 894379526
    //   31560: l2i
    //   31561: ldc_w -828609814
    //   31564: ixor
    //   31565: goto -> 31576
    //   31568: ldc2_w -1320449909
    //   31571: l2i
    //   31572: ldc_w -1161957511
    //   31575: ixor
    //   31576: ldc2_w -1900459248
    //   31579: l2i
    //   31580: ldc_w 2001588556
    //   31583: ixor
    //   31584: ixor
    //   31585: lookupswitch default -> 34903, -234685010 -> 31612, 36165296 -> 31568
    //   31612: goto -> 31616
    //   31615: athrow
    //   31616: invokevirtual toString : ()Ljava/lang/String;
    //   31619: goto -> 31623
    //   31622: athrow
    //   31623: goto -> 31629
    //   31626: ldc_w ''
    //   31629: getstatic Perryc.1 : I
    //   31632: ifeq -> 31646
    //   31635: ldc2_w -185997949
    //   31638: l2i
    //   31639: ldc_w 1043542524
    //   31642: ixor
    //   31643: goto -> 31654
    //   31646: ldc2_w 1025198366
    //   31649: l2i
    //   31650: ldc_w -410977554
    //   31653: ixor
    //   31654: ldc2_w -1462499875
    //   31657: l2i
    //   31658: ldc_w -250224247
    //   31661: ixor
    //   31662: ixor
    //   31663: lookupswitch default -> 35243, -2091231324 -> 31688, -1826934741 -> 31646
    //   31688: astore #18
    //   31690: getstatic Perryc.0 : I
    //   31693: ifle -> 31707
    //   31696: ldc2_w -1602234762
    //   31699: l2i
    //   31700: ldc_w 170381226
    //   31703: ixor
    //   31704: goto -> 31715
    //   31707: ldc2_w -2080466720
    //   31710: l2i
    //   31711: ldc_w -94916777
    //   31714: ixor
    //   31715: ldc2_w -1197919459
    //   31718: l2i
    //   31719: ldc_w -245823919
    //   31722: ixor
    //   31723: ixor
    //   31724: lookupswitch default -> 31752, -1821655569 -> 31707, -476566384 -> 35557
    //   31752: aload_0
    //   31753: getstatic Perryc.c : I
    //   31756: iflt -> 31770
    //   31759: ldc2_w 1731175553
    //   31762: l2i
    //   31763: ldc_w 339740970
    //   31766: ixor
    //   31767: goto -> 31778
    //   31770: ldc2_w 1607331261
    //   31773: l2i
    //   31774: ldc_w 752905908
    //   31777: ixor
    //   31778: ldc2_w -1981837316
    //   31781: l2i
    //   31782: ldc_w 497581821
    //   31785: ixor
    //   31786: ixor
    //   31787: lookupswitch default -> 31812, -417833814 -> 34791, 540940258 -> 31770
    //   31812: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   31815: getstatic Perryc.0 : I
    //   31818: ifle -> 31832
    //   31821: ldc2_w 652158884
    //   31824: l2i
    //   31825: ldc_w -480435791
    //   31828: ixor
    //   31829: goto -> 31840
    //   31832: ldc2_w 1708160410
    //   31835: l2i
    //   31836: ldc_w -1328403803
    //   31839: ixor
    //   31840: ldc2_w -847298680
    //   31843: l2i
    //   31844: ldc_w 1571611139
    //   31847: ixor
    //   31848: ixor
    //   31849: lookupswitch default -> 35279, 1171358388 -> 31876, 1431427998 -> 31832
    //   31876: aload #18
    //   31878: getstatic Perryc.1 : I
    //   31881: ifeq -> 31895
    //   31884: ldc2_w 78773941
    //   31887: l2i
    //   31888: ldc_w -265420540
    //   31891: ixor
    //   31892: goto -> 31903
    //   31895: ldc2_w 1872903293
    //   31898: l2i
    //   31899: ldc_w -1459354856
    //   31902: ixor
    //   31903: ldc2_w -14695437
    //   31906: l2i
    //   31907: ldc_w 1772326798
    //   31910: ixor
    //   31911: ixor
    //   31912: lookupswitch default -> 34997, 1343910680 -> 31940, 1646506956 -> 31895
    //   31940: iload #17
    //   31942: ldc2_w 1403161181
    //   31945: l2i
    //   31946: ldc_w 1403161199
    //   31949: ixor
    //   31950: isub
    //   31951: getstatic Perryc.1 : I
    //   31954: ifeq -> 31968
    //   31957: ldc2_w 432438366
    //   31960: l2i
    //   31961: ldc_w 497993881
    //   31964: ixor
    //   31965: goto -> 31976
    //   31968: ldc2_w 743593606
    //   31971: l2i
    //   31972: ldc_w -823636120
    //   31975: ixor
    //   31976: ldc2_w -2087986361
    //   31979: l2i
    //   31980: ldc_w 337734385
    //   31983: ixor
    //   31984: ixor
    //   31985: lookupswitch default -> 32012, -1816001167 -> 35569, -757676213 -> 31968
    //   32012: aload_0
    //   32013: getstatic Perryc.1 : I
    //   32016: ifeq -> 32030
    //   32019: ldc2_w 304796559
    //   32022: l2i
    //   32023: ldc_w -2099985998
    //   32026: ixor
    //   32027: goto -> 32038
    //   32030: ldc2_w 451725177
    //   32033: l2i
    //   32034: ldc_w 893318741
    //   32037: ixor
    //   32038: ldc2_w -790497771
    //   32041: l2i
    //   32042: ldc_w -644511977
    //   32045: ixor
    //   32046: ixor
    //   32047: lookupswitch default -> 32072, -1718983873 -> 35383, 691701980 -> 32030
    //   32072: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   32075: getstatic Perryc.0 : I
    //   32078: ifle -> 32092
    //   32081: ldc2_w 909987520
    //   32084: l2i
    //   32085: ldc_w 1373674778
    //   32088: ixor
    //   32089: goto -> 32100
    //   32092: ldc2_w 471945300
    //   32095: l2i
    //   32096: ldc_w 889775372
    //   32099: ixor
    //   32100: ldc2_w -300606436
    //   32103: l2i
    //   32104: ldc_w 115204817
    //   32107: ixor
    //   32108: ixor
    //   32109: lookupswitch default -> 35273, -1894437609 -> 32092, -1042199659 -> 32136
    //   32136: aload #18
    //   32138: getstatic Perryc.0 : I
    //   32141: ifle -> 32155
    //   32144: ldc2_w -1089814659
    //   32147: l2i
    //   32148: ldc_w 202490025
    //   32151: ixor
    //   32152: goto -> 32163
    //   32155: ldc2_w 661350473
    //   32158: l2i
    //   32159: ldc_w -751585313
    //   32162: ixor
    //   32163: ldc2_w 984653482
    //   32166: l2i
    //   32167: ldc_w 1038105682
    //   32170: ixor
    //   32171: ixor
    //   32172: lookupswitch default -> 35475, -1270096596 -> 32155, -217547410 -> 32200
    //   32200: goto -> 32204
    //   32203: athrow
    //   32204: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   32207: goto -> 32211
    //   32210: athrow
    //   32211: isub
    //   32212: i2f
    //   32213: getstatic Perryc.1 : I
    //   32216: ifeq -> 32230
    //   32219: ldc2_w 516870188
    //   32222: l2i
    //   32223: ldc_w -553494877
    //   32226: ixor
    //   32227: goto -> 32238
    //   32230: ldc2_w -2145782880
    //   32233: l2i
    //   32234: ldc_w 1649117990
    //   32237: ixor
    //   32238: ldc2_w 1507504071
    //   32241: l2i
    //   32242: ldc_w -1741938708
    //   32245: ixor
    //   32246: ixor
    //   32247: lookupswitch default -> 32272, -1667829132 -> 32230, 3815076 -> 35485
    //   32272: iload #14
    //   32274: ldc2_w -1896413164
    //   32277: l2i
    //   32278: ldc_w -1896413155
    //   32281: ixor
    //   32282: iadd
    //   32283: i2f
    //   32284: ldc2_w -2002528864
    //   32287: l2i
    //   32288: ldc_w -2007225761
    //   32291: ixor
    //   32292: getstatic Perryc.c : I
    //   32295: iflt -> 32309
    //   32298: ldc2_w -477722573
    //   32301: l2i
    //   32302: ldc_w -945481826
    //   32305: ixor
    //   32306: goto -> 32317
    //   32309: ldc2_w -1696835482
    //   32312: l2i
    //   32313: ldc_w -152955098
    //   32316: ixor
    //   32317: ldc2_w 116467562
    //   32320: l2i
    //   32321: ldc_w 1763696594
    //   32324: ixor
    //   32325: ixor
    //   32326: lookupswitch default -> 35605, 64010232 -> 32352, 1271752469 -> 32309
    //   32352: goto -> 32356
    //   32355: athrow
    //   32356: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   32359: goto -> 32363
    //   32362: athrow
    //   32363: ldc2_w 2058874796
    //   32366: l2i
    //   32367: ldc_w 2058874796
    //   32370: ixor
    //   32371: getstatic Perryc.c : I
    //   32374: iflt -> 32388
    //   32377: ldc2_w 1490680338
    //   32380: l2i
    //   32381: ldc_w 1158047628
    //   32384: ixor
    //   32385: goto -> 32396
    //   32388: ldc2_w 1253541832
    //   32391: l2i
    //   32392: ldc_w -23665651
    //   32395: ixor
    //   32396: ldc2_w -835560095
    //   32399: l2i
    //   32400: ldc_w -815245428
    //   32403: ixor
    //   32404: ixor
    //   32405: lookupswitch default -> 34921, -1250203352 -> 32432, 478517107 -> 32388
    //   32432: istore #19
    //   32434: getstatic Perryc.0 : I
    //   32437: ifle -> 32451
    //   32440: ldc2_w 1164636243
    //   32443: l2i
    //   32444: ldc_w 429238804
    //   32447: ixor
    //   32448: goto -> 32459
    //   32451: ldc2_w 142752206
    //   32454: l2i
    //   32455: ldc_w -575902704
    //   32458: ixor
    //   32459: ldc2_w -353455327
    //   32462: l2i
    //   32463: ldc_w 1958455464
    //   32466: ixor
    //   32467: ixor
    //   32468: lookupswitch default -> 35257, -1029029426 -> 32451, 1266372183 -> 32496
    //   32496: aload #16
    //   32498: getstatic Perryc.0 : I
    //   32501: ifle -> 32515
    //   32504: ldc2_w -389625047
    //   32507: l2i
    //   32508: ldc_w 693645602
    //   32511: ixor
    //   32512: goto -> 32523
    //   32515: ldc2_w -1193245120
    //   32518: l2i
    //   32519: ldc_w -93171914
    //   32522: ixor
    //   32523: ldc2_w -1665604001
    //   32526: l2i
    //   32527: ldc_w -1629768024
    //   32530: ixor
    //   32531: ixor
    //   32532: lookupswitch default -> 32560, -1667356158 -> 32515, -1006785796 -> 35449
    //   32560: goto -> 32564
    //   32563: athrow
    //   32564: invokevirtual func_77958_k : ()I
    //   32567: goto -> 32571
    //   32570: athrow
    //   32571: i2f
    //   32572: getstatic Perryc.c : I
    //   32575: iflt -> 32589
    //   32578: ldc2_w 1861003612
    //   32581: l2i
    //   32582: ldc_w -1863126076
    //   32585: ixor
    //   32586: goto -> 32597
    //   32589: ldc2_w -1652356987
    //   32592: l2i
    //   32593: ldc_w 1357586053
    //   32596: ixor
    //   32597: ldc2_w 1370136025
    //   32600: l2i
    //   32601: ldc_w -2120577409
    //   32604: ixor
    //   32605: ixor
    //   32606: lookupswitch default -> 32632, 774785342 -> 35529, 1141867473 -> 32589
    //   32632: aload #16
    //   32634: getstatic Perryc.c : I
    //   32637: iflt -> 32651
    //   32640: ldc2_w 1446851136
    //   32643: l2i
    //   32644: ldc_w 397913865
    //   32647: ixor
    //   32648: goto -> 32659
    //   32651: ldc2_w 126933000
    //   32654: l2i
    //   32655: ldc_w 1736799058
    //   32658: ixor
    //   32659: ldc2_w 989947777
    //   32662: l2i
    //   32663: ldc_w -1654017762
    //   32666: ixor
    //   32667: ixor
    //   32668: lookupswitch default -> 35399, -964854331 -> 32696, -404599850 -> 32651
    //   32696: goto -> 32700
    //   32699: athrow
    //   32700: invokevirtual func_77952_i : ()I
    //   32703: goto -> 32707
    //   32706: athrow
    //   32707: i2f
    //   32708: fsub
    //   32709: getstatic Perryc.c : I
    //   32712: iflt -> 32726
    //   32715: ldc2_w 1807988473
    //   32718: l2i
    //   32719: ldc_w 1641435622
    //   32722: ixor
    //   32723: goto -> 32734
    //   32726: ldc2_w -1361623588
    //   32729: l2i
    //   32730: ldc_w -1062210722
    //   32733: ixor
    //   32734: ldc2_w 417152163
    //   32737: l2i
    //   32738: ldc_w -1229442629
    //   32741: ixor
    //   32742: ixor
    //   32743: lookupswitch default -> 35127, -1536103929 -> 32726, -1071793254 -> 32768
    //   32768: aload #16
    //   32770: getstatic Perryc.1 : I
    //   32773: ifeq -> 32787
    //   32776: ldc2_w -260086311
    //   32779: l2i
    //   32780: ldc_w 952351724
    //   32783: ixor
    //   32784: goto -> 32795
    //   32787: ldc2_w -1388119848
    //   32790: l2i
    //   32791: ldc_w 251019270
    //   32794: ixor
    //   32795: ldc2_w 342292721
    //   32798: l2i
    //   32799: ldc_w -2112941275
    //   32802: ixor
    //   32803: ixor
    //   32804: lookupswitch default -> 32832, 826216479 -> 32787, 1591031265 -> 35145
    //   32832: goto -> 32836
    //   32835: athrow
    //   32836: invokevirtual func_77958_k : ()I
    //   32839: goto -> 32843
    //   32842: athrow
    //   32843: i2f
    //   32844: fdiv
    //   32845: getstatic Perryc.1 : I
    //   32848: ifeq -> 32862
    //   32851: ldc2_w 456636670
    //   32854: l2i
    //   32855: ldc_w -405798904
    //   32858: ixor
    //   32859: goto -> 32870
    //   32862: ldc2_w -610885919
    //   32865: l2i
    //   32866: ldc_w 768932007
    //   32869: ixor
    //   32870: ldc2_w -885266212
    //   32873: l2i
    //   32874: ldc_w 1678129233
    //   32877: ixor
    //   32878: ixor
    //   32879: lookupswitch default -> 32904, 640130714 -> 32862, 1406822523 -> 34845
    //   32904: fstore #20
    //   32906: ldc_w 223.58592
    //   32909: invokestatic floatToIntBits : (F)I
    //   32912: ldc_w 2095027711
    //   32915: ixor
    //   32916: invokestatic intBitsToFloat : (I)F
    //   32919: getstatic Perryc.1 : I
    //   32922: ifeq -> 32936
    //   32925: ldc2_w 1512514743
    //   32928: l2i
    //   32929: ldc_w -1986282839
    //   32932: ixor
    //   32933: goto -> 32944
    //   32936: ldc2_w 1233996298
    //   32939: l2i
    //   32940: ldc_w 1561735912
    //   32943: ixor
    //   32944: ldc2_w -1681577450
    //   32947: l2i
    //   32948: ldc_w 706911720
    //   32951: ixor
    //   32952: ixor
    //   32953: lookupswitch default -> 32980, -1651458823 -> 32936, 1650141664 -> 35311
    //   32980: fload #20
    //   32982: fsub
    //   32983: getstatic Perryc.0 : I
    //   32986: ifle -> 33000
    //   32989: ldc2_w -342994936
    //   32992: l2i
    //   32993: ldc_w 469644550
    //   32996: ixor
    //   32997: goto -> 33008
    //   33000: ldc2_w -684346389
    //   33003: l2i
    //   33004: ldc_w -852942263
    //   33007: ixor
    //   33008: ldc2_w 1470942105
    //   33011: l2i
    //   33012: ldc_w -1018589459
    //   33015: ixor
    //   33016: ixor
    //   33017: lookupswitch default -> 33044, 1687494778 -> 35247, 1737719163 -> 33000
    //   33044: fstore #21
    //   33046: ldc2_w 1330343627
    //   33049: l2i
    //   33050: ldc_w 1330343599
    //   33053: ixor
    //   33054: getstatic Perryc.0 : I
    //   33057: ifle -> 33071
    //   33060: ldc2_w -327076806
    //   33063: l2i
    //   33064: ldc_w 312802070
    //   33067: ixor
    //   33068: goto -> 33079
    //   33071: ldc2_w -102590658
    //   33074: l2i
    //   33075: ldc_w -723658148
    //   33078: ixor
    //   33079: ldc2_w 656178028
    //   33082: l2i
    //   33083: ldc_w -1215127689
    //   33086: ixor
    //   33087: ixor
    //   33088: lookupswitch default -> 33116, -670649370 -> 33071, 1856711479 -> 35153
    //   33116: fload #21
    //   33118: ldc_w 0.11382502
    //   33121: invokestatic floatToIntBits : (F)I
    //   33124: ldc_w 2132876568
    //   33127: ixor
    //   33128: invokestatic intBitsToFloat : (I)F
    //   33131: fmul
    //   33132: f2i
    //   33133: isub
    //   33134: getstatic Perryc.1 : I
    //   33137: ifeq -> 33151
    //   33140: ldc2_w -2040336072
    //   33143: l2i
    //   33144: ldc_w 2046748246
    //   33147: ixor
    //   33148: goto -> 33159
    //   33151: ldc2_w -1913486301
    //   33154: l2i
    //   33155: ldc_w 969503725
    //   33158: ixor
    //   33159: ldc2_w -1450295304
    //   33162: l2i
    //   33163: ldc_w 1098152136
    //   33166: ixor
    //   33167: ixor
    //   33168: lookupswitch default -> 34825, 392581214 -> 33151, 1556197630 -> 33196
    //   33196: istore #19
    //   33198: getstatic Perryc.1 : I
    //   33201: ifeq -> 33215
    //   33204: ldc2_w -587250053
    //   33207: l2i
    //   33208: ldc_w 304468977
    //   33211: ixor
    //   33212: goto -> 33223
    //   33215: ldc2_w 1708026688
    //   33218: l2i
    //   33219: ldc_w -1085434514
    //   33222: ixor
    //   33223: ldc2_w -2047067508
    //   33226: l2i
    //   33227: ldc_w 1254582481
    //   33230: ixor
    //   33231: ixor
    //   33232: lookupswitch default -> 33260, -1890544309 -> 33215, 31573975 -> 35395
    //   33260: aload_0
    //   33261: getstatic Perryc.1 : I
    //   33264: ifeq -> 33278
    //   33267: ldc2_w -1663962452
    //   33270: l2i
    //   33271: ldc_w -1281225255
    //   33274: ixor
    //   33275: goto -> 33286
    //   33278: ldc2_w -341696534
    //   33281: l2i
    //   33282: ldc_w 1798997758
    //   33285: ixor
    //   33286: ldc2_w 583421338
    //   33289: l2i
    //   33290: ldc_w -175925088
    //   33293: ixor
    //   33294: ixor
    //   33295: lookupswitch default -> 34757, -130667953 -> 33278, 1474120750 -> 33320
    //   33320: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   33323: new java/lang/StringBuilder
    //   33326: dup
    //   33327: getstatic Perryc.1 : I
    //   33330: ifeq -> 33344
    //   33333: ldc2_w 863058747
    //   33336: l2i
    //   33337: ldc_w -1300212136
    //   33340: ixor
    //   33341: goto -> 33352
    //   33344: ldc2_w 566430023
    //   33347: l2i
    //   33348: ldc_w 1857588420
    //   33351: ixor
    //   33352: ldc2_w 1774178533
    //   33355: l2i
    //   33356: ldc_w 1957795211
    //   33359: ixor
    //   33360: ixor
    //   33361: lookupswitch default -> 33388, -1660999667 -> 35033, 1091461442 -> 33344
    //   33388: goto -> 33392
    //   33391: athrow
    //   33392: invokespecial <init> : ()V
    //   33395: goto -> 33399
    //   33398: athrow
    //   33399: getstatic Perryc.0 : I
    //   33402: ifle -> 33416
    //   33405: ldc2_w -717774584
    //   33408: l2i
    //   33409: ldc_w 1938373883
    //   33412: ixor
    //   33413: goto -> 33424
    //   33416: ldc2_w 1913685892
    //   33419: l2i
    //   33420: ldc_w -1370310350
    //   33423: ixor
    //   33424: ldc2_w -1209039109
    //   33427: l2i
    //   33428: ldc_w -1390908892
    //   33431: ixor
    //   33432: ixor
    //   33433: lookupswitch default -> 33460, -1136037588 -> 35287, 2004779094 -> 33416
    //   33460: iload #19
    //   33462: getstatic Perryc.1 : I
    //   33465: ifeq -> 33479
    //   33468: ldc2_w -1218267927
    //   33471: l2i
    //   33472: ldc_w 1560081249
    //   33475: ixor
    //   33476: goto -> 33487
    //   33479: ldc2_w -38418791
    //   33482: l2i
    //   33483: ldc_w -241692436
    //   33486: ixor
    //   33487: ldc2_w 812639162
    //   33490: l2i
    //   33491: ldc_w -533836015
    //   33494: ixor
    //   33495: ixor
    //   33496: lookupswitch default -> 33524, 1004530467 -> 34877, 1855404244 -> 33479
    //   33524: goto -> 33528
    //   33527: athrow
    //   33528: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   33531: goto -> 33535
    //   33534: athrow
    //   33535: ldc_w ''
    //   33538: getstatic Perryc.c : I
    //   33541: iflt -> 33555
    //   33544: ldc2_w -1656466141
    //   33547: l2i
    //   33548: ldc_w -1364551667
    //   33551: ixor
    //   33552: goto -> 33563
    //   33555: ldc2_w 1836728633
    //   33558: l2i
    //   33559: ldc_w -280111922
    //   33562: ixor
    //   33563: ldc2_w 1410392676
    //   33566: l2i
    //   33567: ldc_w -1086973555
    //   33570: ixor
    //   33571: ixor
    //   33572: lookupswitch default -> 33600, -1439922705 -> 33555, -657967417 -> 34775
    //   33600: goto -> 33604
    //   33603: athrow
    //   33604: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33607: goto -> 33611
    //   33610: athrow
    //   33611: getstatic Perryc.c : I
    //   33614: iflt -> 33628
    //   33617: ldc2_w -1823473049
    //   33620: l2i
    //   33621: ldc_w 1938567907
    //   33624: ixor
    //   33625: goto -> 33636
    //   33628: ldc2_w 684619708
    //   33631: l2i
    //   33632: ldc_w 662618749
    //   33635: ixor
    //   33636: ldc2_w -1771779566
    //   33639: l2i
    //   33640: ldc_w 338023462
    //   33643: ixor
    //   33644: ixor
    //   33645: lookupswitch default -> 35583, -1913541643 -> 33672, 1654468272 -> 33628
    //   33672: goto -> 33676
    //   33675: athrow
    //   33676: invokevirtual toString : ()Ljava/lang/String;
    //   33679: goto -> 33683
    //   33682: athrow
    //   33683: getstatic Perryc.0 : I
    //   33686: ifle -> 33700
    //   33689: ldc2_w 1598117216
    //   33692: l2i
    //   33693: ldc_w 1247023958
    //   33696: ixor
    //   33697: goto -> 33708
    //   33700: ldc2_w -635885750
    //   33703: l2i
    //   33704: ldc_w -1829268178
    //   33707: ixor
    //   33708: ldc2_w -1924047961
    //   33711: l2i
    //   33712: ldc_w 87543686
    //   33715: ixor
    //   33716: ixor
    //   33717: lookupswitch default -> 35157, -1653353961 -> 33700, -1064819131 -> 33744
    //   33744: iload #17
    //   33746: ldc2_w 740949864
    //   33749: l2i
    //   33750: ldc_w 740949829
    //   33753: ixor
    //   33754: isub
    //   33755: getstatic Perryc.1 : I
    //   33758: ifeq -> 33772
    //   33761: ldc2_w 784316930
    //   33764: l2i
    //   33765: ldc_w -2051376543
    //   33768: ixor
    //   33769: goto -> 33780
    //   33772: ldc2_w 1123938300
    //   33775: l2i
    //   33776: ldc_w -1942973257
    //   33779: ixor
    //   33780: ldc2_w -1845475272
    //   33783: l2i
    //   33784: ldc_w -2041955267
    //   33787: ixor
    //   33788: ixor
    //   33789: lookupswitch default -> 34907, -1085295514 -> 33772, -628682930 -> 33816
    //   33816: aload_0
    //   33817: getstatic Perryc.c : I
    //   33820: iflt -> 33834
    //   33823: ldc2_w 1884367861
    //   33826: l2i
    //   33827: ldc_w 73098485
    //   33830: ixor
    //   33831: goto -> 33842
    //   33834: ldc2_w -2136986386
    //   33837: l2i
    //   33838: ldc_w -633468921
    //   33841: ixor
    //   33842: ldc2_w 11655367
    //   33845: l2i
    //   33846: ldc_w 2058750369
    //   33849: ixor
    //   33850: ixor
    //   33851: lookupswitch default -> 34737, 235773542 -> 33834, 546960783 -> 33876
    //   33876: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   33879: new java/lang/StringBuilder
    //   33882: dup
    //   33883: getstatic Perryc.0 : I
    //   33886: ifle -> 33900
    //   33889: ldc2_w 1134445948
    //   33892: l2i
    //   33893: ldc_w -1683232720
    //   33896: ixor
    //   33897: goto -> 33908
    //   33900: ldc2_w 629586781
    //   33903: l2i
    //   33904: ldc_w 668909434
    //   33907: ixor
    //   33908: ldc2_w 27303727
    //   33911: l2i
    //   33912: ldc_w -468506234
    //   33915: ixor
    //   33916: ixor
    //   33917: lookupswitch default -> 33944, 466524057 -> 33900, 1032199141 -> 35175
    //   33944: goto -> 33948
    //   33947: athrow
    //   33948: invokespecial <init> : ()V
    //   33951: goto -> 33955
    //   33954: athrow
    //   33955: getstatic Perryc.c : I
    //   33958: iflt -> 33972
    //   33961: ldc2_w 683020655
    //   33964: l2i
    //   33965: ldc_w -804941584
    //   33968: ixor
    //   33969: goto -> 33980
    //   33972: ldc2_w 1981521047
    //   33975: l2i
    //   33976: ldc_w 863995049
    //   33979: ixor
    //   33980: ldc2_w 1893890594
    //   33983: l2i
    //   33984: ldc_w 931267146
    //   33987: ixor
    //   33988: ixor
    //   33989: lookupswitch default -> 34016, -1076626953 -> 35493, 1283623746 -> 33972
    //   34016: iload #19
    //   34018: getstatic Perryc.c : I
    //   34021: iflt -> 34035
    //   34024: ldc2_w -63035806
    //   34027: l2i
    //   34028: ldc_w -1031828383
    //   34031: ixor
    //   34032: goto -> 34043
    //   34035: ldc2_w 220812612
    //   34038: l2i
    //   34039: ldc_w 1730713594
    //   34042: ixor
    //   34043: ldc2_w 808683934
    //   34046: l2i
    //   34047: ldc_w -697327465
    //   34050: ixor
    //   34051: ixor
    //   34052: lookupswitch default -> 34080, -1374067899 -> 34035, -669154550 -> 34923
    //   34080: goto -> 34084
    //   34083: athrow
    //   34084: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   34087: goto -> 34091
    //   34090: athrow
    //   34091: ldc_w ''
    //   34094: getstatic Perryc.1 : I
    //   34097: ifeq -> 34111
    //   34100: ldc2_w 534164421
    //   34103: l2i
    //   34104: ldc_w -242916574
    //   34107: ixor
    //   34108: goto -> 34119
    //   34111: ldc2_w -37821626
    //   34114: l2i
    //   34115: ldc_w 397246655
    //   34118: ixor
    //   34119: ldc2_w 1653074381
    //   34122: l2i
    //   34123: ldc_w -583705043
    //   34126: ixor
    //   34127: ixor
    //   34128: lookupswitch default -> 34156, 1373726471 -> 35211, 2123840798 -> 34111
    //   34156: goto -> 34160
    //   34159: athrow
    //   34160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34163: goto -> 34167
    //   34166: athrow
    //   34167: getstatic Perryc.c : I
    //   34170: iflt -> 34184
    //   34173: ldc2_w -1610335467
    //   34176: l2i
    //   34177: ldc_w -1349742557
    //   34180: ixor
    //   34181: goto -> 34192
    //   34184: ldc2_w 379040644
    //   34187: l2i
    //   34188: ldc_w 733176515
    //   34191: ixor
    //   34192: ldc2_w -871038486
    //   34195: l2i
    //   34196: ldc_w -924807362
    //   34199: ixor
    //   34200: ixor
    //   34201: lookupswitch default -> 34228, -1501176798 -> 34184, 192751074 -> 35501
    //   34228: goto -> 34232
    //   34231: athrow
    //   34232: invokevirtual toString : ()Ljava/lang/String;
    //   34235: goto -> 34239
    //   34238: athrow
    //   34239: getstatic Perryc.c : I
    //   34242: iflt -> 34256
    //   34245: ldc2_w 1357964008
    //   34248: l2i
    //   34249: ldc_w 1059397646
    //   34252: ixor
    //   34253: goto -> 34264
    //   34256: ldc2_w -1680577140
    //   34259: l2i
    //   34260: ldc_w -364547443
    //   34263: ixor
    //   34264: ldc2_w 1086944092
    //   34267: l2i
    //   34268: ldc_w 661885309
    //   34271: ixor
    //   34272: ixor
    //   34273: lookupswitch default -> 34801, 141500615 -> 34256, 371981600 -> 34300
    //   34300: goto -> 34304
    //   34303: athrow
    //   34304: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   34307: goto -> 34311
    //   34310: athrow
    //   34311: isub
    //   34312: i2f
    //   34313: getstatic Perryc.1 : I
    //   34316: ifeq -> 34330
    //   34319: ldc2_w -1656555256
    //   34322: l2i
    //   34323: ldc_w 848851109
    //   34326: ixor
    //   34327: goto -> 34338
    //   34330: ldc2_w 1314564734
    //   34333: l2i
    //   34334: ldc_w -1285948583
    //   34337: ixor
    //   34338: ldc2_w -421158830
    //   34341: l2i
    //   34342: ldc_w -1867298056
    //   34345: ixor
    //   34346: ixor
    //   34347: lookupswitch default -> 35451, -1957315699 -> 34372, -645111033 -> 34330
    //   34372: iload #14
    //   34374: ldc2_w 1009840572
    //   34377: l2i
    //   34378: ldc_w 1009840569
    //   34381: ixor
    //   34382: isub
    //   34383: i2f
    //   34384: getstatic Perryc.c : I
    //   34387: iflt -> 34401
    //   34390: ldc2_w -1549305174
    //   34393: l2i
    //   34394: ldc_w -1426950729
    //   34397: ixor
    //   34398: goto -> 34409
    //   34401: ldc2_w -106877353
    //   34404: l2i
    //   34405: ldc_w -1447939779
    //   34408: ixor
    //   34409: ldc2_w 1354820560
    //   34412: l2i
    //   34413: ldc_w 1048064564
    //   34416: ixor
    //   34417: ixor
    //   34418: lookupswitch default -> 34444, -663622857 -> 34401, 1743640313 -> 35385
    //   34444: fload #21
    //   34446: ldc_w 0.014226901
    //   34449: invokestatic floatToIntBits : (F)I
    //   34452: ldc_w 2132154355
    //   34455: ixor
    //   34456: invokestatic intBitsToFloat : (I)F
    //   34459: fmul
    //   34460: f2i
    //   34461: getstatic Perryc.0 : I
    //   34464: ifle -> 34478
    //   34467: ldc2_w 1119464844
    //   34470: l2i
    //   34471: ldc_w 428216634
    //   34474: ixor
    //   34475: goto -> 34486
    //   34478: ldc2_w 1723686789
    //   34481: l2i
    //   34482: ldc_w 1990543117
    //   34485: ixor
    //   34486: ldc2_w 513913810
    //   34489: l2i
    //   34490: ldc_w 640001321
    //   34493: ixor
    //   34494: ixor
    //   34495: lookupswitch default -> 35169, 681315955 -> 34520, 1673243213 -> 34478
    //   34520: fload #20
    //   34522: ldc_w 0.009705488
    //   34525: invokestatic floatToIntBits : (F)I
    //   34528: ldc_w 2136998852
    //   34531: ixor
    //   34532: invokestatic intBitsToFloat : (I)F
    //   34535: fmul
    //   34536: f2i
    //   34537: ldc2_w -692380377
    //   34540: l2i
    //   34541: ldc_w -692380377
    //   34544: ixor
    //   34545: getstatic Perryc.1 : I
    //   34548: ifeq -> 34562
    //   34551: ldc2_w 1669269038
    //   34554: l2i
    //   34555: ldc_w 627550821
    //   34558: ixor
    //   34559: goto -> 34570
    //   34562: ldc2_w 719275869
    //   34565: l2i
    //   34566: ldc_w -1720129285
    //   34569: ixor
    //   34570: ldc2_w -1688924020
    //   34573: l2i
    //   34574: ldc_w 604122124
    //   34577: ixor
    //   34578: ixor
    //   34579: lookupswitch default -> 35115, -112226101 -> 34562, 217092902 -> 34604
    //   34604: goto -> 34608
    //   34607: athrow
    //   34608: invokestatic toRGBA : (III)I
    //   34611: goto -> 34615
    //   34614: athrow
    //   34615: getstatic Perryc.0 : I
    //   34618: ifle -> 34632
    //   34621: ldc2_w 61487029
    //   34624: l2i
    //   34625: ldc_w 1622283493
    //   34628: ixor
    //   34629: goto -> 34640
    //   34632: ldc2_w 869108184
    //   34635: l2i
    //   34636: ldc_w 906546290
    //   34639: ixor
    //   34640: ldc2_w -1146508223
    //   34643: l2i
    //   34644: ldc_w 1388407560
    //   34647: ixor
    //   34648: ixor
    //   34649: lookupswitch default -> 34676, -1972313063 -> 35275, 462215290 -> 34632
    //   34676: goto -> 34680
    //   34679: athrow
    //   34680: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   34683: goto -> 34687
    //   34686: athrow
    //   34687: goto -> 28626
    //   34690: return
    //   34691: aconst_null
    //   34692: athrow
    //   34693: aconst_null
    //   34694: athrow
    //   34695: aconst_null
    //   34696: athrow
    //   34697: aconst_null
    //   34698: athrow
    //   34699: aconst_null
    //   34700: athrow
    //   34701: aconst_null
    //   34702: athrow
    //   34703: aconst_null
    //   34704: athrow
    //   34705: aconst_null
    //   34706: athrow
    //   34707: aconst_null
    //   34708: athrow
    //   34709: aconst_null
    //   34710: athrow
    //   34711: aconst_null
    //   34712: athrow
    //   34713: aconst_null
    //   34714: athrow
    //   34715: aconst_null
    //   34716: athrow
    //   34717: aconst_null
    //   34718: athrow
    //   34719: aconst_null
    //   34720: athrow
    //   34721: aconst_null
    //   34722: athrow
    //   34723: aconst_null
    //   34724: athrow
    //   34725: aconst_null
    //   34726: athrow
    //   34727: aconst_null
    //   34728: athrow
    //   34729: aconst_null
    //   34730: athrow
    //   34731: aconst_null
    //   34732: athrow
    //   34733: aconst_null
    //   34734: athrow
    //   34735: aconst_null
    //   34736: athrow
    //   34737: aconst_null
    //   34738: athrow
    //   34739: aconst_null
    //   34740: athrow
    //   34741: aconst_null
    //   34742: athrow
    //   34743: aconst_null
    //   34744: athrow
    //   34745: aconst_null
    //   34746: athrow
    //   34747: aconst_null
    //   34748: athrow
    //   34749: aconst_null
    //   34750: athrow
    //   34751: aconst_null
    //   34752: athrow
    //   34753: aconst_null
    //   34754: athrow
    //   34755: aconst_null
    //   34756: athrow
    //   34757: aconst_null
    //   34758: athrow
    //   34759: aconst_null
    //   34760: athrow
    //   34761: aconst_null
    //   34762: athrow
    //   34763: aconst_null
    //   34764: athrow
    //   34765: aconst_null
    //   34766: athrow
    //   34767: aconst_null
    //   34768: athrow
    //   34769: aconst_null
    //   34770: athrow
    //   34771: aconst_null
    //   34772: athrow
    //   34773: aconst_null
    //   34774: athrow
    //   34775: aconst_null
    //   34776: athrow
    //   34777: aconst_null
    //   34778: athrow
    //   34779: aconst_null
    //   34780: athrow
    //   34781: aconst_null
    //   34782: athrow
    //   34783: aconst_null
    //   34784: athrow
    //   34785: aconst_null
    //   34786: athrow
    //   34787: aconst_null
    //   34788: athrow
    //   34789: aconst_null
    //   34790: athrow
    //   34791: aconst_null
    //   34792: athrow
    //   34793: aconst_null
    //   34794: athrow
    //   34795: aconst_null
    //   34796: athrow
    //   34797: aconst_null
    //   34798: athrow
    //   34799: aconst_null
    //   34800: athrow
    //   34801: aconst_null
    //   34802: athrow
    //   34803: aconst_null
    //   34804: athrow
    //   34805: aconst_null
    //   34806: athrow
    //   34807: aconst_null
    //   34808: athrow
    //   34809: aconst_null
    //   34810: athrow
    //   34811: aconst_null
    //   34812: athrow
    //   34813: aconst_null
    //   34814: athrow
    //   34815: aconst_null
    //   34816: athrow
    //   34817: aconst_null
    //   34818: athrow
    //   34819: aconst_null
    //   34820: athrow
    //   34821: aconst_null
    //   34822: athrow
    //   34823: aconst_null
    //   34824: athrow
    //   34825: aconst_null
    //   34826: athrow
    //   34827: aconst_null
    //   34828: athrow
    //   34829: aconst_null
    //   34830: athrow
    //   34831: aconst_null
    //   34832: athrow
    //   34833: aconst_null
    //   34834: athrow
    //   34835: aconst_null
    //   34836: athrow
    //   34837: aconst_null
    //   34838: athrow
    //   34839: aconst_null
    //   34840: athrow
    //   34841: aconst_null
    //   34842: athrow
    //   34843: aconst_null
    //   34844: athrow
    //   34845: aconst_null
    //   34846: athrow
    //   34847: aconst_null
    //   34848: athrow
    //   34849: aconst_null
    //   34850: athrow
    //   34851: aconst_null
    //   34852: athrow
    //   34853: aconst_null
    //   34854: athrow
    //   34855: aconst_null
    //   34856: athrow
    //   34857: aconst_null
    //   34858: athrow
    //   34859: aconst_null
    //   34860: athrow
    //   34861: aconst_null
    //   34862: athrow
    //   34863: aconst_null
    //   34864: athrow
    //   34865: aconst_null
    //   34866: athrow
    //   34867: aconst_null
    //   34868: athrow
    //   34869: aconst_null
    //   34870: athrow
    //   34871: aconst_null
    //   34872: athrow
    //   34873: aconst_null
    //   34874: athrow
    //   34875: aconst_null
    //   34876: athrow
    //   34877: aconst_null
    //   34878: athrow
    //   34879: aconst_null
    //   34880: athrow
    //   34881: aconst_null
    //   34882: athrow
    //   34883: aconst_null
    //   34884: athrow
    //   34885: aconst_null
    //   34886: athrow
    //   34887: aconst_null
    //   34888: athrow
    //   34889: aconst_null
    //   34890: athrow
    //   34891: aconst_null
    //   34892: athrow
    //   34893: aconst_null
    //   34894: athrow
    //   34895: aconst_null
    //   34896: athrow
    //   34897: aconst_null
    //   34898: athrow
    //   34899: aconst_null
    //   34900: athrow
    //   34901: aconst_null
    //   34902: athrow
    //   34903: aconst_null
    //   34904: athrow
    //   34905: aconst_null
    //   34906: athrow
    //   34907: aconst_null
    //   34908: athrow
    //   34909: aconst_null
    //   34910: athrow
    //   34911: aconst_null
    //   34912: athrow
    //   34913: aconst_null
    //   34914: athrow
    //   34915: aconst_null
    //   34916: athrow
    //   34917: aconst_null
    //   34918: athrow
    //   34919: aconst_null
    //   34920: athrow
    //   34921: aconst_null
    //   34922: athrow
    //   34923: aconst_null
    //   34924: athrow
    //   34925: aconst_null
    //   34926: athrow
    //   34927: aconst_null
    //   34928: athrow
    //   34929: aconst_null
    //   34930: athrow
    //   34931: aconst_null
    //   34932: athrow
    //   34933: aconst_null
    //   34934: athrow
    //   34935: aconst_null
    //   34936: athrow
    //   34937: aconst_null
    //   34938: athrow
    //   34939: aconst_null
    //   34940: athrow
    //   34941: aconst_null
    //   34942: athrow
    //   34943: aconst_null
    //   34944: athrow
    //   34945: aconst_null
    //   34946: athrow
    //   34947: aconst_null
    //   34948: athrow
    //   34949: aconst_null
    //   34950: athrow
    //   34951: aconst_null
    //   34952: athrow
    //   34953: aconst_null
    //   34954: athrow
    //   34955: aconst_null
    //   34956: athrow
    //   34957: aconst_null
    //   34958: athrow
    //   34959: aconst_null
    //   34960: athrow
    //   34961: aconst_null
    //   34962: athrow
    //   34963: aconst_null
    //   34964: athrow
    //   34965: aconst_null
    //   34966: athrow
    //   34967: aconst_null
    //   34968: athrow
    //   34969: aconst_null
    //   34970: athrow
    //   34971: aconst_null
    //   34972: athrow
    //   34973: aconst_null
    //   34974: athrow
    //   34975: aconst_null
    //   34976: athrow
    //   34977: aconst_null
    //   34978: athrow
    //   34979: aconst_null
    //   34980: athrow
    //   34981: aconst_null
    //   34982: athrow
    //   34983: aconst_null
    //   34984: athrow
    //   34985: aconst_null
    //   34986: athrow
    //   34987: aconst_null
    //   34988: athrow
    //   34989: aconst_null
    //   34990: athrow
    //   34991: aconst_null
    //   34992: athrow
    //   34993: aconst_null
    //   34994: athrow
    //   34995: aconst_null
    //   34996: athrow
    //   34997: aconst_null
    //   34998: athrow
    //   34999: aconst_null
    //   35000: athrow
    //   35001: aconst_null
    //   35002: athrow
    //   35003: aconst_null
    //   35004: athrow
    //   35005: aconst_null
    //   35006: athrow
    //   35007: aconst_null
    //   35008: athrow
    //   35009: aconst_null
    //   35010: athrow
    //   35011: aconst_null
    //   35012: athrow
    //   35013: aconst_null
    //   35014: athrow
    //   35015: aconst_null
    //   35016: athrow
    //   35017: aconst_null
    //   35018: athrow
    //   35019: aconst_null
    //   35020: athrow
    //   35021: aconst_null
    //   35022: athrow
    //   35023: aconst_null
    //   35024: athrow
    //   35025: aconst_null
    //   35026: athrow
    //   35027: aconst_null
    //   35028: athrow
    //   35029: aconst_null
    //   35030: athrow
    //   35031: aconst_null
    //   35032: athrow
    //   35033: aconst_null
    //   35034: athrow
    //   35035: aconst_null
    //   35036: athrow
    //   35037: aconst_null
    //   35038: athrow
    //   35039: aconst_null
    //   35040: athrow
    //   35041: aconst_null
    //   35042: athrow
    //   35043: aconst_null
    //   35044: athrow
    //   35045: aconst_null
    //   35046: athrow
    //   35047: aconst_null
    //   35048: athrow
    //   35049: aconst_null
    //   35050: athrow
    //   35051: aconst_null
    //   35052: athrow
    //   35053: aconst_null
    //   35054: athrow
    //   35055: aconst_null
    //   35056: athrow
    //   35057: aconst_null
    //   35058: athrow
    //   35059: aconst_null
    //   35060: athrow
    //   35061: aconst_null
    //   35062: athrow
    //   35063: aconst_null
    //   35064: athrow
    //   35065: aconst_null
    //   35066: athrow
    //   35067: aconst_null
    //   35068: athrow
    //   35069: aconst_null
    //   35070: athrow
    //   35071: aconst_null
    //   35072: athrow
    //   35073: aconst_null
    //   35074: athrow
    //   35075: aconst_null
    //   35076: athrow
    //   35077: aconst_null
    //   35078: athrow
    //   35079: aconst_null
    //   35080: athrow
    //   35081: aconst_null
    //   35082: athrow
    //   35083: aconst_null
    //   35084: athrow
    //   35085: aconst_null
    //   35086: athrow
    //   35087: aconst_null
    //   35088: athrow
    //   35089: aconst_null
    //   35090: athrow
    //   35091: aconst_null
    //   35092: athrow
    //   35093: aconst_null
    //   35094: athrow
    //   35095: aconst_null
    //   35096: athrow
    //   35097: aconst_null
    //   35098: athrow
    //   35099: aconst_null
    //   35100: athrow
    //   35101: aconst_null
    //   35102: athrow
    //   35103: aconst_null
    //   35104: athrow
    //   35105: aconst_null
    //   35106: athrow
    //   35107: aconst_null
    //   35108: athrow
    //   35109: aconst_null
    //   35110: athrow
    //   35111: aconst_null
    //   35112: athrow
    //   35113: aconst_null
    //   35114: athrow
    //   35115: aconst_null
    //   35116: athrow
    //   35117: aconst_null
    //   35118: athrow
    //   35119: aconst_null
    //   35120: athrow
    //   35121: aconst_null
    //   35122: athrow
    //   35123: aconst_null
    //   35124: athrow
    //   35125: aconst_null
    //   35126: athrow
    //   35127: aconst_null
    //   35128: athrow
    //   35129: aconst_null
    //   35130: athrow
    //   35131: aconst_null
    //   35132: athrow
    //   35133: aconst_null
    //   35134: athrow
    //   35135: aconst_null
    //   35136: athrow
    //   35137: aconst_null
    //   35138: athrow
    //   35139: aconst_null
    //   35140: athrow
    //   35141: aconst_null
    //   35142: athrow
    //   35143: aconst_null
    //   35144: athrow
    //   35145: aconst_null
    //   35146: athrow
    //   35147: aconst_null
    //   35148: athrow
    //   35149: aconst_null
    //   35150: athrow
    //   35151: aconst_null
    //   35152: athrow
    //   35153: aconst_null
    //   35154: athrow
    //   35155: aconst_null
    //   35156: athrow
    //   35157: aconst_null
    //   35158: athrow
    //   35159: aconst_null
    //   35160: athrow
    //   35161: aconst_null
    //   35162: athrow
    //   35163: aconst_null
    //   35164: athrow
    //   35165: aconst_null
    //   35166: athrow
    //   35167: aconst_null
    //   35168: athrow
    //   35169: aconst_null
    //   35170: athrow
    //   35171: aconst_null
    //   35172: athrow
    //   35173: aconst_null
    //   35174: athrow
    //   35175: aconst_null
    //   35176: athrow
    //   35177: aconst_null
    //   35178: athrow
    //   35179: aconst_null
    //   35180: athrow
    //   35181: aconst_null
    //   35182: athrow
    //   35183: aconst_null
    //   35184: athrow
    //   35185: aconst_null
    //   35186: athrow
    //   35187: aconst_null
    //   35188: athrow
    //   35189: aconst_null
    //   35190: athrow
    //   35191: aconst_null
    //   35192: athrow
    //   35193: aconst_null
    //   35194: athrow
    //   35195: aconst_null
    //   35196: athrow
    //   35197: aconst_null
    //   35198: athrow
    //   35199: aconst_null
    //   35200: athrow
    //   35201: aconst_null
    //   35202: athrow
    //   35203: aconst_null
    //   35204: athrow
    //   35205: aconst_null
    //   35206: athrow
    //   35207: aconst_null
    //   35208: athrow
    //   35209: aconst_null
    //   35210: athrow
    //   35211: aconst_null
    //   35212: athrow
    //   35213: aconst_null
    //   35214: athrow
    //   35215: aconst_null
    //   35216: athrow
    //   35217: aconst_null
    //   35218: athrow
    //   35219: aconst_null
    //   35220: athrow
    //   35221: aconst_null
    //   35222: athrow
    //   35223: aconst_null
    //   35224: athrow
    //   35225: aconst_null
    //   35226: athrow
    //   35227: aconst_null
    //   35228: athrow
    //   35229: aconst_null
    //   35230: athrow
    //   35231: aconst_null
    //   35232: athrow
    //   35233: aconst_null
    //   35234: athrow
    //   35235: aconst_null
    //   35236: athrow
    //   35237: aconst_null
    //   35238: athrow
    //   35239: aconst_null
    //   35240: athrow
    //   35241: aconst_null
    //   35242: athrow
    //   35243: aconst_null
    //   35244: athrow
    //   35245: aconst_null
    //   35246: athrow
    //   35247: aconst_null
    //   35248: athrow
    //   35249: aconst_null
    //   35250: athrow
    //   35251: aconst_null
    //   35252: athrow
    //   35253: aconst_null
    //   35254: athrow
    //   35255: aconst_null
    //   35256: athrow
    //   35257: aconst_null
    //   35258: athrow
    //   35259: aconst_null
    //   35260: athrow
    //   35261: aconst_null
    //   35262: athrow
    //   35263: aconst_null
    //   35264: athrow
    //   35265: aconst_null
    //   35266: athrow
    //   35267: aconst_null
    //   35268: athrow
    //   35269: aconst_null
    //   35270: athrow
    //   35271: aconst_null
    //   35272: athrow
    //   35273: aconst_null
    //   35274: athrow
    //   35275: aconst_null
    //   35276: athrow
    //   35277: aconst_null
    //   35278: athrow
    //   35279: aconst_null
    //   35280: athrow
    //   35281: aconst_null
    //   35282: athrow
    //   35283: aconst_null
    //   35284: athrow
    //   35285: aconst_null
    //   35286: athrow
    //   35287: aconst_null
    //   35288: athrow
    //   35289: aconst_null
    //   35290: athrow
    //   35291: aconst_null
    //   35292: athrow
    //   35293: aconst_null
    //   35294: athrow
    //   35295: aconst_null
    //   35296: athrow
    //   35297: aconst_null
    //   35298: athrow
    //   35299: aconst_null
    //   35300: athrow
    //   35301: aconst_null
    //   35302: athrow
    //   35303: aconst_null
    //   35304: athrow
    //   35305: aconst_null
    //   35306: athrow
    //   35307: aconst_null
    //   35308: athrow
    //   35309: aconst_null
    //   35310: athrow
    //   35311: aconst_null
    //   35312: athrow
    //   35313: aconst_null
    //   35314: athrow
    //   35315: aconst_null
    //   35316: athrow
    //   35317: aconst_null
    //   35318: athrow
    //   35319: aconst_null
    //   35320: athrow
    //   35321: aconst_null
    //   35322: athrow
    //   35323: aconst_null
    //   35324: athrow
    //   35325: aconst_null
    //   35326: athrow
    //   35327: aconst_null
    //   35328: athrow
    //   35329: aconst_null
    //   35330: athrow
    //   35331: aconst_null
    //   35332: athrow
    //   35333: aconst_null
    //   35334: athrow
    //   35335: aconst_null
    //   35336: athrow
    //   35337: aconst_null
    //   35338: athrow
    //   35339: aconst_null
    //   35340: athrow
    //   35341: aconst_null
    //   35342: athrow
    //   35343: aconst_null
    //   35344: athrow
    //   35345: aconst_null
    //   35346: athrow
    //   35347: aconst_null
    //   35348: athrow
    //   35349: aconst_null
    //   35350: athrow
    //   35351: aconst_null
    //   35352: athrow
    //   35353: aconst_null
    //   35354: athrow
    //   35355: aconst_null
    //   35356: athrow
    //   35357: aconst_null
    //   35358: athrow
    //   35359: aconst_null
    //   35360: athrow
    //   35361: aconst_null
    //   35362: athrow
    //   35363: aconst_null
    //   35364: athrow
    //   35365: aconst_null
    //   35366: athrow
    //   35367: aconst_null
    //   35368: athrow
    //   35369: aconst_null
    //   35370: athrow
    //   35371: aconst_null
    //   35372: athrow
    //   35373: aconst_null
    //   35374: athrow
    //   35375: aconst_null
    //   35376: athrow
    //   35377: aconst_null
    //   35378: athrow
    //   35379: aconst_null
    //   35380: athrow
    //   35381: aconst_null
    //   35382: athrow
    //   35383: aconst_null
    //   35384: athrow
    //   35385: aconst_null
    //   35386: athrow
    //   35387: aconst_null
    //   35388: athrow
    //   35389: aconst_null
    //   35390: athrow
    //   35391: aconst_null
    //   35392: athrow
    //   35393: aconst_null
    //   35394: athrow
    //   35395: aconst_null
    //   35396: athrow
    //   35397: aconst_null
    //   35398: athrow
    //   35399: aconst_null
    //   35400: athrow
    //   35401: aconst_null
    //   35402: athrow
    //   35403: aconst_null
    //   35404: athrow
    //   35405: aconst_null
    //   35406: athrow
    //   35407: aconst_null
    //   35408: athrow
    //   35409: aconst_null
    //   35410: athrow
    //   35411: aconst_null
    //   35412: athrow
    //   35413: aconst_null
    //   35414: athrow
    //   35415: aconst_null
    //   35416: athrow
    //   35417: aconst_null
    //   35418: athrow
    //   35419: aconst_null
    //   35420: athrow
    //   35421: aconst_null
    //   35422: athrow
    //   35423: aconst_null
    //   35424: athrow
    //   35425: aconst_null
    //   35426: athrow
    //   35427: aconst_null
    //   35428: athrow
    //   35429: aconst_null
    //   35430: athrow
    //   35431: aconst_null
    //   35432: athrow
    //   35433: aconst_null
    //   35434: athrow
    //   35435: aconst_null
    //   35436: athrow
    //   35437: aconst_null
    //   35438: athrow
    //   35439: aconst_null
    //   35440: athrow
    //   35441: aconst_null
    //   35442: athrow
    //   35443: aconst_null
    //   35444: athrow
    //   35445: aconst_null
    //   35446: athrow
    //   35447: aconst_null
    //   35448: athrow
    //   35449: aconst_null
    //   35450: athrow
    //   35451: aconst_null
    //   35452: athrow
    //   35453: aconst_null
    //   35454: athrow
    //   35455: aconst_null
    //   35456: athrow
    //   35457: aconst_null
    //   35458: athrow
    //   35459: aconst_null
    //   35460: athrow
    //   35461: aconst_null
    //   35462: athrow
    //   35463: aconst_null
    //   35464: athrow
    //   35465: aconst_null
    //   35466: athrow
    //   35467: aconst_null
    //   35468: athrow
    //   35469: aconst_null
    //   35470: athrow
    //   35471: aconst_null
    //   35472: athrow
    //   35473: aconst_null
    //   35474: athrow
    //   35475: aconst_null
    //   35476: athrow
    //   35477: aconst_null
    //   35478: athrow
    //   35479: aconst_null
    //   35480: athrow
    //   35481: aconst_null
    //   35482: athrow
    //   35483: aconst_null
    //   35484: athrow
    //   35485: aconst_null
    //   35486: athrow
    //   35487: aconst_null
    //   35488: athrow
    //   35489: aconst_null
    //   35490: athrow
    //   35491: aconst_null
    //   35492: athrow
    //   35493: aconst_null
    //   35494: athrow
    //   35495: aconst_null
    //   35496: athrow
    //   35497: aconst_null
    //   35498: athrow
    //   35499: aconst_null
    //   35500: athrow
    //   35501: aconst_null
    //   35502: athrow
    //   35503: aconst_null
    //   35504: athrow
    //   35505: aconst_null
    //   35506: athrow
    //   35507: aconst_null
    //   35508: athrow
    //   35509: aconst_null
    //   35510: athrow
    //   35511: aconst_null
    //   35512: athrow
    //   35513: aconst_null
    //   35514: athrow
    //   35515: aconst_null
    //   35516: athrow
    //   35517: aconst_null
    //   35518: athrow
    //   35519: aconst_null
    //   35520: athrow
    //   35521: aconst_null
    //   35522: athrow
    //   35523: aconst_null
    //   35524: athrow
    //   35525: aconst_null
    //   35526: athrow
    //   35527: aconst_null
    //   35528: athrow
    //   35529: aconst_null
    //   35530: athrow
    //   35531: aconst_null
    //   35532: athrow
    //   35533: aconst_null
    //   35534: athrow
    //   35535: aconst_null
    //   35536: athrow
    //   35537: aconst_null
    //   35538: athrow
    //   35539: aconst_null
    //   35540: athrow
    //   35541: aconst_null
    //   35542: athrow
    //   35543: aconst_null
    //   35544: athrow
    //   35545: aconst_null
    //   35546: athrow
    //   35547: aconst_null
    //   35548: athrow
    //   35549: aconst_null
    //   35550: athrow
    //   35551: aconst_null
    //   35552: athrow
    //   35553: aconst_null
    //   35554: athrow
    //   35555: aconst_null
    //   35556: athrow
    //   35557: aconst_null
    //   35558: athrow
    //   35559: aconst_null
    //   35560: athrow
    //   35561: aconst_null
    //   35562: athrow
    //   35563: aconst_null
    //   35564: athrow
    //   35565: aconst_null
    //   35566: athrow
    //   35567: aconst_null
    //   35568: athrow
    //   35569: aconst_null
    //   35570: athrow
    //   35571: aconst_null
    //   35572: athrow
    //   35573: aconst_null
    //   35574: athrow
    //   35575: aconst_null
    //   35576: athrow
    //   35577: aconst_null
    //   35578: athrow
    //   35579: aconst_null
    //   35580: athrow
    //   35581: aconst_null
    //   35582: athrow
    //   35583: aconst_null
    //   35584: athrow
    //   35585: aconst_null
    //   35586: athrow
    //   35587: aconst_null
    //   35588: athrow
    //   35589: aconst_null
    //   35590: athrow
    //   35591: aconst_null
    //   35592: athrow
    //   35593: aconst_null
    //   35594: athrow
    //   35595: aconst_null
    //   35596: athrow
    //   35597: aconst_null
    //   35598: athrow
    //   35599: aconst_null
    //   35600: athrow
    //   35601: aconst_null
    //   35602: athrow
    //   35603: aconst_null
    //   35604: athrow
    //   35605: aconst_null
    //   35606: athrow
    //   35607: pop
    //   35608: goto_w -> 36
    //   35613: pop
    //   35614: aconst_null
    //   35615: goto -> 35607
    //   35618: dup
    //   35619: ifnull -> 35607
    //   35622: checkcast java/lang/Throwable
    //   35625: athrow
    //   35626: dup
    //   35627: ifnull -> 35613
    //   35630: checkcast java/lang/Throwable
    //   35633: athrow
    //   35634: aconst_null
    //   35635: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   718	555	4	responseTime	I
    //   2738	5509	5	healthLine	F
    //   4558	3689	6	lineColor	I
    //   9586	137	5	e	Ljava/lang/Exception;
    //   11694	1685	6	hole	Ljava/lang/String;
    //   11862	1517	7	color	I
    //   13518	1685	6	hole	Ljava/lang/String;
    //   13686	1517	7	color	I
    //   29442	5245	17	x	I
    //   31690	2997	18	s	Ljava/lang/String;
    //   32434	2253	19	dmg	I
    //   32906	1781	20	green	F
    //   33046	1641	21	red	F
    //   29022	5665	16	is	Lnet/minecraft/item/ItemStack;
    //   10050	24640	5	distance	I
    //   15538	19152	6	healthLine	F
    //   17358	17332	7	lineColor	I
    //   17570	17120	8	df	Ljava/text/DecimalFormat;
    //   19754	14936	9	ping	Ljava/lang/Integer;
    //   20530	14160	10	color	I
    //   22090	12600	11	distancecolor	I
    //   27402	7288	12	iteration	I
    //   27746	6944	13	i	I
    //   28298	6392	14	y	I
    //   36	34655	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Target;
    //   36	34655	1	partialTicks	F
    //   36	34655	2	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   101	34590	3	pingStr	Ljava/lang/String;
    //   1846	32845	4	target	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   13	32	35618	finally
    //   101	227	1276	java/lang/Exception
    //   228	234	234	finally
    //   228	234	3	java/lang/StringIndexOutOfBoundsException
    //   228	234	234	java/lang/NumberFormatException
    //   228	234	234	java/util/ConcurrentModificationException
    //   228	234	234	finally
    //   228	503	1276	java/lang/Exception
    //   299	306	306	finally
    //   299	306	299	finally
    //   299	306	299	java/lang/UnsupportedOperationException
    //   300	306	299	java/lang/ArithmeticException
    //   300	306	306	finally
    //   504	510	510	finally
    //   504	510	510	finally
    //   504	510	3	java/lang/ArrayIndexOutOfBoundsException
    //   504	510	510	java/lang/IndexOutOfBoundsException
    //   504	510	510	java/lang/EnumConstantNotPresentException
    //   504	575	1276	java/lang/Exception
    //   576	582	582	finally
    //   576	582	3	java/lang/AssertionError
    //   576	582	582	finally
    //   576	582	582	java/lang/ArrayIndexOutOfBoundsException
    //   576	582	3	finally
    //   576	647	1276	java/lang/Exception
    //   648	654	654	finally
    //   648	654	3	java/lang/StringIndexOutOfBoundsException
    //   648	654	3	java/lang/AssertionError
    //   648	654	654	finally
    //   648	654	654	java/lang/StringIndexOutOfBoundsException
    //   648	919	1276	java/lang/Exception
    //   787	794	794	finally
    //   787	794	794	java/lang/StringIndexOutOfBoundsException
    //   787	794	794	java/lang/AssertionError
    //   787	794	794	finally
    //   788	794	787	java/lang/IllegalStateException
    //   920	926	926	finally
    //   920	926	926	java/lang/ArithmeticException
    //   920	926	926	java/lang/EnumConstantNotPresentException
    //   920	926	926	finally
    //   920	926	3	java/lang/ArithmeticException
    //   920	1203	1276	java/lang/Exception
    //   1055	1062	1062	finally
    //   1055	1062	3	java/lang/IndexOutOfBoundsException
    //   1055	1062	1055	java/lang/RuntimeException
    //   1056	1062	1055	finally
    //   1056	1062	1062	finally
    //   1131	1138	1138	finally
    //   1131	1138	3	finally
    //   1132	1138	3	java/lang/ArrayIndexOutOfBoundsException
    //   1132	1138	3	finally
    //   1132	1138	1131	finally
    //   1204	1210	1210	finally
    //   1204	1210	3	finally
    //   1204	1210	1210	java/lang/EnumConstantNotPresentException
    //   1204	1210	3	finally
    //   1204	1210	1210	java/lang/UnsupportedOperationException
    //   1204	1273	1276	java/lang/Exception
    //   1775	1782	1782	finally
    //   1775	1782	1782	java/lang/RuntimeException
    //   1775	1782	3	java/lang/NumberFormatException
    //   1775	1782	3	java/lang/IllegalStateException
    //   1775	1782	1775	finally
    //   2267	2274	2274	finally
    //   2267	2274	3	finally
    //   2267	2274	2267	finally
    //   2268	2274	2274	java/lang/EnumConstantNotPresentException
    //   2268	2274	2274	java/lang/IllegalStateException
    //   2344	2350	2350	finally
    //   2344	2350	3	java/lang/UnsupportedOperationException
    //   2344	2350	2350	finally
    //   2344	2350	2350	finally
    //   2344	2350	2350	java/lang/StringIndexOutOfBoundsException
    //   2531	2538	2538	finally
    //   2531	2538	3	java/util/ConcurrentModificationException
    //   2531	2538	2531	finally
    //   2531	2538	2531	finally
    //   2532	2538	2538	java/lang/NegativeArraySizeException
    //   2667	2674	2674	finally
    //   2667	2674	2667	java/lang/ArithmeticException
    //   2667	2674	2667	java/lang/NullPointerException
    //   2668	2674	2667	java/util/ConcurrentModificationException
    //   2668	2674	2667	java/lang/RuntimeException
    //   2963	2970	2970	finally
    //   2963	2970	2970	java/lang/IndexOutOfBoundsException
    //   2964	2970	3	finally
    //   2964	2970	2963	finally
    //   2964	2970	3	finally
    //   3199	3206	3206	finally
    //   3199	3206	3	finally
    //   3199	3206	3206	finally
    //   3200	3206	3199	java/lang/RuntimeException
    //   3200	3206	3	finally
    //   3435	3442	3442	finally
    //   3436	3442	3435	java/lang/IllegalStateException
    //   3436	3442	3	finally
    //   3436	3442	3435	finally
    //   3436	3442	3435	java/lang/IndexOutOfBoundsException
    //   3672	3678	3678	finally
    //   3672	3678	3	java/lang/NullPointerException
    //   3672	3678	3678	java/lang/ArrayIndexOutOfBoundsException
    //   3672	3678	3678	java/lang/ArithmeticException
    //   3672	3678	3	finally
    //   3907	3914	3914	finally
    //   3907	3914	3	java/lang/IndexOutOfBoundsException
    //   3908	3914	3	java/lang/IllegalStateException
    //   3908	3914	3907	java/lang/ArrayIndexOutOfBoundsException
    //   3908	3914	3914	finally
    //   4143	4150	4150	finally
    //   4143	4150	4150	finally
    //   4143	4150	4143	java/lang/IllegalStateException
    //   4143	4150	4150	finally
    //   4143	4150	3	finally
    //   4379	4386	4386	finally
    //   4379	4386	4379	java/lang/StringIndexOutOfBoundsException
    //   4379	4386	4379	finally
    //   4380	4386	3	java/lang/NullPointerException
    //   4380	4386	3	finally
    //   4487	4494	4494	finally
    //   4487	4494	3	java/lang/IllegalArgumentException
    //   4487	4494	4494	finally
    //   4488	4494	3	finally
    //   4488	4494	4487	java/lang/RuntimeException
    //   4748	4754	4754	finally
    //   4748	4754	3	finally
    //   4748	4754	3	java/lang/NegativeArraySizeException
    //   4748	4754	3	finally
    //   4748	4754	3	finally
    //   4823	4830	4830	finally
    //   4823	4830	4830	finally
    //   4824	4830	4823	finally
    //   4824	4830	4830	finally
    //   4824	4830	4823	finally
    //   5019	5026	5026	finally
    //   5019	5026	5026	java/lang/IndexOutOfBoundsException
    //   5019	5026	3	java/lang/ArithmeticException
    //   5020	5026	5019	java/util/ConcurrentModificationException
    //   5020	5026	5019	finally
    //   5095	5102	5102	finally
    //   5095	5102	5095	java/util/ConcurrentModificationException
    //   5095	5102	5102	java/lang/ArrayIndexOutOfBoundsException
    //   5096	5102	5095	java/lang/StringIndexOutOfBoundsException
    //   5096	5102	5102	java/lang/IllegalStateException
    //   5308	5314	5314	finally
    //   5308	5314	5314	finally
    //   5308	5314	5314	java/lang/NullPointerException
    //   5308	5314	3	java/lang/NegativeArraySizeException
    //   5308	5314	3	java/util/NoSuchElementException
    //   5384	5390	5390	finally
    //   5384	5390	3	java/lang/RuntimeException
    //   5384	5390	5390	finally
    //   5384	5390	5390	finally
    //   5384	5390	5390	java/lang/StringIndexOutOfBoundsException
    //   5579	5586	5586	finally
    //   5579	5586	5586	java/lang/ClassCastException
    //   5580	5586	5579	java/lang/RuntimeException
    //   5580	5586	5579	java/lang/ArrayIndexOutOfBoundsException
    //   5580	5586	5586	java/lang/NumberFormatException
    //   5655	5662	5662	finally
    //   5655	5662	3	java/lang/ArrayIndexOutOfBoundsException
    //   5655	5662	5662	java/lang/UnsupportedOperationException
    //   5655	5662	5655	java/lang/StringIndexOutOfBoundsException
    //   5656	5662	5655	java/lang/NullPointerException
    //   5851	5858	5858	finally
    //   5851	5858	5858	finally
    //   5851	5858	5851	finally
    //   5852	5858	5851	finally
    //   5852	5858	5851	finally
    //   5928	5934	5934	finally
    //   5928	5934	3	java/lang/ArithmeticException
    //   5928	5934	5934	java/util/NoSuchElementException
    //   5928	5934	5934	java/lang/NullPointerException
    //   5928	5934	3	finally
    //   6124	6130	6130	finally
    //   6124	6130	3	finally
    //   6124	6130	3	java/lang/RuntimeException
    //   6124	6130	6130	finally
    //   6124	6130	6130	finally
    //   6200	6206	6206	finally
    //   6200	6206	3	finally
    //   6200	6206	6206	finally
    //   6200	6206	3	java/lang/NumberFormatException
    //   6200	6206	6206	java/lang/NullPointerException
    //   6271	6278	6278	finally
    //   6271	6278	3	java/lang/NumberFormatException
    //   6271	6278	6271	java/lang/EnumConstantNotPresentException
    //   6271	6278	6271	java/lang/ArithmeticException
    //   6272	6278	6278	finally
    //   6344	6350	6350	finally
    //   6344	6350	6350	java/lang/NullPointerException
    //   6344	6350	6350	finally
    //   6344	6350	6350	finally
    //   6344	6350	6350	finally
    //   6915	6922	6922	finally
    //   6916	6922	6922	java/lang/AssertionError
    //   6916	6922	6915	finally
    //   6916	6922	6922	java/lang/IllegalStateException
    //   6916	6922	6915	finally
    //   6991	6998	6998	finally
    //   6991	6998	6991	finally
    //   6991	6998	6998	java/lang/StringIndexOutOfBoundsException
    //   6992	6998	3	java/lang/EnumConstantNotPresentException
    //   6992	6998	3	java/lang/IndexOutOfBoundsException
    //   7188	7194	7194	finally
    //   7188	7194	3	finally
    //   7188	7194	7194	java/lang/UnsupportedOperationException
    //   7188	7194	3	finally
    //   7188	7194	7194	finally
    //   7263	7270	7270	finally
    //   7263	7270	7263	java/lang/NullPointerException
    //   7263	7270	3	finally
    //   7263	7270	7263	finally
    //   7264	7270	7263	java/lang/UnsupportedOperationException
    //   7475	7482	7482	finally
    //   7475	7482	7482	java/lang/EnumConstantNotPresentException
    //   7475	7482	7475	finally
    //   7476	7482	3	java/lang/IllegalArgumentException
    //   7476	7482	7475	finally
    //   7551	7558	7558	finally
    //   7551	7558	7551	java/lang/NumberFormatException
    //   7551	7558	3	java/util/ConcurrentModificationException
    //   7552	7558	7551	java/lang/NullPointerException
    //   7552	7558	7551	finally
    //   7827	7834	7834	finally
    //   7827	7834	7827	finally
    //   7828	7834	7834	finally
    //   7828	7834	7834	finally
    //   7828	7834	3	finally
    //   7903	7910	7910	finally
    //   7903	7910	7910	java/lang/EnumConstantNotPresentException
    //   7903	7910	7910	finally
    //   7904	7910	7903	finally
    //   7904	7910	7910	finally
    //   8239	8246	8246	finally
    //   8239	8246	8246	java/lang/AssertionError
    //   8240	8246	8239	java/lang/RuntimeException
    //   8240	8246	3	java/lang/NumberFormatException
    //   8240	8246	8246	finally
    //   8311	8318	8318	finally
    //   8311	8318	3	finally
    //   8311	8318	3	java/lang/IllegalStateException
    //   8312	8318	3	finally
    //   8312	8318	8311	java/lang/AssertionError
    //   8447	8454	8454	finally
    //   8447	8454	8447	java/lang/UnsupportedOperationException
    //   8447	8454	8447	finally
    //   8447	8454	8454	finally
    //   8448	8454	8454	java/lang/ArithmeticException
    //   8520	8526	8526	finally
    //   8520	8526	3	java/lang/ArithmeticException
    //   8520	8526	8526	java/util/ConcurrentModificationException
    //   8520	8526	3	java/lang/StringIndexOutOfBoundsException
    //   8520	8526	3	java/lang/NegativeArraySizeException
    //   8655	8662	8662	finally
    //   8655	8662	8655	java/lang/ClassCastException
    //   8656	8662	3	finally
    //   8656	8662	8655	finally
    //   8656	8662	8662	java/lang/ArithmeticException
    //   8779	8786	8786	finally
    //   8779	8786	8786	java/lang/IndexOutOfBoundsException
    //   8779	8786	8779	finally
    //   8780	8786	3	java/lang/AssertionError
    //   8780	8786	8786	finally
    //   8787	8975	9522	java/lang/Exception
    //   8976	8982	8982	finally
    //   8976	8982	8982	java/lang/NumberFormatException
    //   8976	8982	3	finally
    //   8976	8982	8982	finally
    //   8976	8982	3	java/lang/IllegalStateException
    //   8976	9255	9522	java/lang/Exception
    //   9051	9058	9058	finally
    //   9051	9058	9058	finally
    //   9052	9058	9051	java/lang/NumberFormatException
    //   9052	9058	9051	finally
    //   9052	9058	3	java/util/ConcurrentModificationException
    //   9256	9262	9262	finally
    //   9256	9262	3	finally
    //   9256	9262	9262	finally
    //   9256	9262	3	finally
    //   9256	9262	9262	java/lang/IndexOutOfBoundsException
    //   9256	9519	9522	java/lang/Exception
    //   9331	9338	9338	finally
    //   9331	9338	9338	finally
    //   9332	9338	3	finally
    //   9332	9338	9331	finally
    //   9332	9338	9331	java/lang/ClassCastException
    //   9511	9518	9518	finally
    //   9511	9518	9518	finally
    //   9511	9518	9518	finally
    //   9511	9518	3	java/lang/IllegalArgumentException
    //   9512	9518	9511	finally
    //   9715	9722	9722	finally
    //   9715	9722	9715	java/lang/RuntimeException
    //   9716	9722	9715	java/lang/EnumConstantNotPresentException
    //   9716	9722	9715	java/lang/UnsupportedOperationException
    //   9716	9722	9722	finally
    //   9979	9986	9986	finally
    //   9979	9986	9986	java/lang/NegativeArraySizeException
    //   9980	9986	9986	java/lang/IndexOutOfBoundsException
    //   9980	9986	9979	finally
    //   9980	9986	9986	java/util/ConcurrentModificationException
    //   10115	10122	10122	finally
    //   10115	10122	10122	java/util/ConcurrentModificationException
    //   10115	10122	10115	java/util/ConcurrentModificationException
    //   10115	10122	10122	finally
    //   10116	10122	3	java/lang/AssertionError
    //   10187	10194	10194	finally
    //   10187	10194	10187	java/lang/StringIndexOutOfBoundsException
    //   10188	10194	3	java/lang/UnsupportedOperationException
    //   10188	10194	10194	java/lang/IllegalArgumentException
    //   10188	10194	10187	java/lang/ArithmeticException
    //   10260	10266	10266	finally
    //   10260	10266	3	java/lang/ArrayIndexOutOfBoundsException
    //   10260	10266	10266	java/lang/NullPointerException
    //   10260	10266	10266	java/lang/ClassCastException
    //   10260	10266	3	java/lang/AssertionError
    //   10363	10370	10370	finally
    //   10363	10370	10363	java/lang/IllegalStateException
    //   10364	10370	10370	java/lang/UnsupportedOperationException
    //   10364	10370	3	java/lang/IllegalArgumentException
    //   10364	10370	10363	java/lang/UnsupportedOperationException
    //   10623	10630	10630	finally
    //   10623	10630	3	finally
    //   10623	10630	3	java/lang/StringIndexOutOfBoundsException
    //   10623	10630	10630	java/lang/ClassCastException
    //   10624	10630	10623	finally
    //   10819	10826	10826	finally
    //   10819	10826	10819	finally
    //   10819	10826	3	finally
    //   10819	10826	10826	java/lang/NullPointerException
    //   10820	10826	10826	finally
    //   10895	10902	10902	finally
    //   10895	10902	10902	java/util/ConcurrentModificationException
    //   10895	10902	3	finally
    //   10896	10902	10895	finally
    //   10896	10902	3	java/lang/ArithmeticException
    //   11100	11106	11106	finally
    //   11100	11106	3	finally
    //   11100	11106	11106	java/lang/IllegalStateException
    //   11100	11106	3	java/lang/NumberFormatException
    //   11100	11106	11106	finally
    //   11176	11182	11182	finally
    //   11176	11182	11182	finally
    //   11176	11182	11182	java/util/NoSuchElementException
    //   11176	11182	11182	java/lang/IllegalStateException
    //   11176	11182	3	finally
    //   11288	11294	11294	finally
    //   11288	11294	11294	java/lang/AssertionError
    //   11288	11294	11294	finally
    //   11288	11294	11294	finally
    //   11288	11294	3	finally
    //   11359	11366	11366	finally
    //   11359	11366	3	java/lang/IllegalArgumentException
    //   11359	11366	11359	finally
    //   11360	11366	3	finally
    //   11360	11366	3	java/lang/NumberFormatException
    //   11495	11502	11502	finally
    //   11495	11502	11495	finally
    //   11495	11502	3	finally
    //   11496	11502	11495	java/lang/NegativeArraySizeException
    //   11496	11502	11495	finally
    //   11623	11630	11630	finally
    //   11623	11630	3	finally
    //   11623	11630	3	java/util/ConcurrentModificationException
    //   11624	11630	11630	java/lang/ClassCastException
    //   11624	11630	11623	java/lang/RuntimeException
    //   11791	11798	11798	finally
    //   11791	11798	3	java/lang/ArithmeticException
    //   11791	11798	11798	finally
    //   11792	11798	3	java/lang/IndexOutOfBoundsException
    //   11792	11798	11791	finally
    //   12055	12062	12062	finally
    //   12055	12062	3	java/lang/RuntimeException
    //   12055	12062	12055	finally
    //   12055	12062	12055	java/lang/StringIndexOutOfBoundsException
    //   12056	12062	3	java/util/NoSuchElementException
    //   12131	12138	12138	finally
    //   12131	12138	12138	finally
    //   12131	12138	3	java/lang/EnumConstantNotPresentException
    //   12132	12138	12138	finally
    //   12132	12138	12131	java/lang/AssertionError
    //   12267	12274	12274	finally
    //   12267	12274	12267	finally
    //   12268	12274	12267	java/lang/ClassCastException
    //   12268	12274	12267	java/util/NoSuchElementException
    //   12268	12274	12267	finally
    //   12403	12410	12410	finally
    //   12404	12410	12403	finally
    //   12404	12410	12403	java/lang/IllegalStateException
    //   12404	12410	12410	java/lang/EnumConstantNotPresentException
    //   12404	12410	12410	finally
    //   12475	12482	12482	finally
    //   12475	12482	12482	finally
    //   12475	12482	12475	finally
    //   12476	12482	12482	java/lang/RuntimeException
    //   12476	12482	12482	finally
    //   12672	12678	12678	finally
    //   12672	12678	12678	java/lang/NumberFormatException
    //   12672	12678	12678	java/lang/AssertionError
    //   12672	12678	12678	finally
    //   12672	12678	3	finally
    //   12747	12754	12754	finally
    //   12747	12754	12747	finally
    //   12748	12754	12747	finally
    //   12748	12754	12747	finally
    //   12748	12754	3	finally
    //   12951	12958	12958	finally
    //   12951	12958	12958	finally
    //   12951	12958	12958	java/lang/StringIndexOutOfBoundsException
    //   12952	12958	3	finally
    //   12952	12958	12951	java/lang/NullPointerException
    //   13027	13034	13034	finally
    //   13027	13034	13034	finally
    //   13027	13034	3	java/lang/EnumConstantNotPresentException
    //   13028	13034	13034	finally
    //   13028	13034	13027	finally
    //   13223	13230	13230	finally
    //   13223	13230	3	finally
    //   13223	13230	3	finally
    //   13223	13230	13223	finally
    //   13224	13230	13230	java/lang/UnsupportedOperationException
    //   13371	13378	13378	finally
    //   13371	13378	3	finally
    //   13371	13378	13378	java/lang/StringIndexOutOfBoundsException
    //   13372	13378	13371	finally
    //   13372	13378	13371	finally
    //   13447	13454	13454	finally
    //   13447	13454	13447	java/lang/RuntimeException
    //   13447	13454	3	finally
    //   13447	13454	13447	java/util/NoSuchElementException
    //   13448	13454	13447	java/lang/RuntimeException
    //   13616	13622	13622	finally
    //   13616	13622	3	finally
    //   13616	13622	3	java/lang/NullPointerException
    //   13616	13622	13622	java/util/ConcurrentModificationException
    //   13616	13622	13622	java/lang/StringIndexOutOfBoundsException
    //   13879	13886	13886	finally
    //   13879	13886	13879	java/lang/IllegalStateException
    //   13879	13886	3	finally
    //   13879	13886	3	java/lang/NumberFormatException
    //   13880	13886	13879	finally
    //   13955	13962	13962	finally
    //   13955	13962	13962	finally
    //   13955	13962	3	java/lang/StringIndexOutOfBoundsException
    //   13956	13962	13955	finally
    //   13956	13962	13962	java/lang/IllegalStateException
    //   14092	14098	14098	finally
    //   14092	14098	3	java/lang/ArrayIndexOutOfBoundsException
    //   14092	14098	14098	finally
    //   14092	14098	3	java/lang/StringIndexOutOfBoundsException
    //   14092	14098	14098	finally
    //   14227	14234	14234	finally
    //   14227	14234	14227	java/lang/UnsupportedOperationException
    //   14227	14234	3	finally
    //   14228	14234	14234	java/lang/AssertionError
    //   14228	14234	3	java/lang/UnsupportedOperationException
    //   14300	14306	14306	finally
    //   14300	14306	3	java/lang/IllegalArgumentException
    //   14300	14306	14306	finally
    //   14300	14306	14306	finally
    //   14300	14306	3	finally
    //   14495	14502	14502	finally
    //   14495	14502	3	finally
    //   14495	14502	14495	java/lang/ArithmeticException
    //   14495	14502	14502	java/lang/AssertionError
    //   14495	14502	14502	java/lang/EnumConstantNotPresentException
    //   14571	14578	14578	finally
    //   14571	14578	14571	java/lang/ArrayIndexOutOfBoundsException
    //   14571	14578	14578	finally
    //   14572	14578	14571	java/lang/ClassCastException
    //   14572	14578	3	finally
    //   14775	14782	14782	finally
    //   14775	14782	3	finally
    //   14775	14782	14775	finally
    //   14776	14782	3	java/lang/IndexOutOfBoundsException
    //   14776	14782	14775	java/lang/AssertionError
    //   14851	14858	14858	finally
    //   14851	14858	14858	java/lang/NullPointerException
    //   14851	14858	14858	java/lang/StringIndexOutOfBoundsException
    //   14852	14858	14851	finally
    //   14852	14858	14851	java/lang/EnumConstantNotPresentException
    //   15048	15054	15054	finally
    //   15048	15054	3	finally
    //   15048	15054	15054	java/lang/AssertionError
    //   15048	15054	15054	java/lang/ClassCastException
    //   15048	15054	3	java/lang/NumberFormatException
    //   15196	15202	15202	finally
    //   15196	15202	15202	java/util/ConcurrentModificationException
    //   15196	15202	15202	finally
    //   15196	15202	3	finally
    //   15196	15202	15202	java/util/ConcurrentModificationException
    //   15331	15338	15338	finally
    //   15331	15338	15338	java/lang/UnsupportedOperationException
    //   15331	15338	15331	finally
    //   15331	15338	15331	finally
    //   15332	15338	15331	finally
    //   15467	15474	15474	finally
    //   15467	15474	15467	finally
    //   15467	15474	3	finally
    //   15468	15474	15467	finally
    //   15468	15474	3	finally
    //   15764	15770	15770	finally
    //   15764	15770	3	finally
    //   15764	15770	15770	java/lang/ClassCastException
    //   15764	15770	15770	finally
    //   15764	15770	15770	finally
    //   15999	16006	16006	finally
    //   15999	16006	16006	java/lang/EnumConstantNotPresentException
    //   16000	16006	16006	java/lang/IllegalArgumentException
    //   16000	16006	16006	finally
    //   16000	16006	15999	java/lang/ClassCastException
    //   16235	16242	16242	finally
    //   16235	16242	16242	finally
    //   16236	16242	3	finally
    //   16236	16242	16242	java/lang/StringIndexOutOfBoundsException
    //   16236	16242	16235	finally
    //   16472	16478	16478	finally
    //   16472	16478	16478	java/lang/NullPointerException
    //   16472	16478	16478	java/lang/ArithmeticException
    //   16472	16478	3	finally
    //   16472	16478	16478	java/lang/NullPointerException
    //   16707	16714	16714	finally
    //   16707	16714	16707	finally
    //   16708	16714	16714	java/lang/AssertionError
    //   16708	16714	3	java/lang/AssertionError
    //   16708	16714	16707	java/lang/NumberFormatException
    //   16943	16950	16950	finally
    //   16943	16950	16943	java/lang/AssertionError
    //   16943	16950	16943	java/util/NoSuchElementException
    //   16944	16950	3	java/lang/IndexOutOfBoundsException
    //   16944	16950	3	java/lang/NumberFormatException
    //   17179	17186	17186	finally
    //   17179	17186	17186	finally
    //   17179	17186	17179	finally
    //   17179	17186	3	java/lang/AssertionError
    //   17180	17186	17186	finally
    //   17287	17294	17294	finally
    //   17288	17294	17287	finally
    //   17288	17294	17287	finally
    //   17288	17294	3	finally
    //   17288	17294	3	java/lang/NumberFormatException
    //   17428	17434	17434	finally
    //   17428	17434	17434	java/lang/AssertionError
    //   17428	17434	3	finally
    //   17428	17434	17434	java/util/ConcurrentModificationException
    //   17428	17434	17434	java/lang/ArithmeticException
    //   17499	17506	17506	finally
    //   17500	17506	3	java/lang/AssertionError
    //   17500	17506	3	java/lang/IllegalArgumentException
    //   17500	17506	17499	finally
    //   17500	17506	17499	java/lang/AssertionError
    //   17887	17894	17894	finally
    //   17887	17894	17894	java/lang/ArrayIndexOutOfBoundsException
    //   17888	17894	3	finally
    //   17888	17894	17887	java/lang/UnsupportedOperationException
    //   17888	17894	17887	finally
    //   17963	17970	17970	finally
    //   17963	17970	17963	finally
    //   17964	17970	17970	finally
    //   17964	17970	17970	java/lang/NegativeArraySizeException
    //   17964	17970	17970	finally
    //   18172	18178	18178	finally
    //   18172	18178	18178	java/lang/IllegalArgumentException
    //   18172	18178	3	finally
    //   18172	18178	3	finally
    //   18172	18178	18178	finally
    //   18367	18374	18374	finally
    //   18367	18374	18374	java/util/NoSuchElementException
    //   18367	18374	18367	finally
    //   18368	18374	18374	finally
    //   18368	18374	3	finally
    //   18443	18450	18450	finally
    //   18443	18450	18450	java/lang/IllegalStateException
    //   18444	18450	18443	finally
    //   18444	18450	3	finally
    //   18444	18450	18450	java/util/ConcurrentModificationException
    //   18587	18594	18594	finally
    //   18587	18594	18587	java/lang/AssertionError
    //   18587	18594	3	java/lang/IllegalStateException
    //   18588	18594	18594	finally
    //   18588	18594	18594	finally
    //   18723	18730	18730	finally
    //   18723	18730	3	java/lang/NullPointerException
    //   18724	18730	3	java/util/ConcurrentModificationException
    //   18724	18730	18723	finally
    //   18724	18730	3	java/lang/NullPointerException
    //   18923	18930	18930	finally
    //   18923	18930	18930	finally
    //   18923	18930	18923	java/lang/ClassCastException
    //   18923	18930	18930	finally
    //   18924	18930	3	java/lang/ClassCastException
    //   19060	19066	19066	finally
    //   19060	19066	19066	java/lang/EnumConstantNotPresentException
    //   19060	19066	3	finally
    //   19060	19066	3	finally
    //   19060	19066	3	java/lang/IllegalArgumentException
    //   19131	19138	19138	finally
    //   19131	19138	19131	finally
    //   19131	19138	3	finally
    //   19131	19138	19131	java/lang/NegativeArraySizeException
    //   19132	19138	19138	java/lang/IndexOutOfBoundsException
    //   19331	19338	19338	finally
    //   19331	19338	19331	java/lang/IndexOutOfBoundsException
    //   19331	19338	19331	finally
    //   19331	19338	19338	finally
    //   19332	19338	19331	java/lang/ArithmeticException
    //   19467	19474	19474	finally
    //   19467	19474	19467	java/lang/NegativeArraySizeException
    //   19467	19474	19467	finally
    //   19467	19474	19467	java/lang/NegativeArraySizeException
    //   19467	19474	19474	java/lang/NullPointerException
    //   19540	19546	19546	finally
    //   19540	19546	19546	finally
    //   19540	19546	19546	finally
    //   19540	19546	3	java/lang/StringIndexOutOfBoundsException
    //   19540	19546	3	java/lang/RuntimeException
    //   19611	19618	19618	finally
    //   19611	19618	3	java/lang/UnsupportedOperationException
    //   19611	19618	19618	java/lang/NumberFormatException
    //   19612	19618	3	java/lang/NegativeArraySizeException
    //   19612	19618	19611	java/util/NoSuchElementException
    //   19684	19690	19690	finally
    //   19684	19690	3	finally
    //   19684	19690	19690	java/lang/NegativeArraySizeException
    //   19684	19690	3	finally
    //   19684	19690	19690	finally
    //   19883	19890	19890	finally
    //   19883	19890	19890	finally
    //   19883	19890	19883	finally
    //   19884	19890	19883	finally
    //   19884	19890	3	java/lang/UnsupportedOperationException
    //   20047	20054	20054	finally
    //   20047	20054	20047	finally
    //   20048	20054	3	java/lang/UnsupportedOperationException
    //   20048	20054	3	java/lang/NumberFormatException
    //   20048	20054	20047	java/lang/AssertionError
    //   20187	20194	20194	finally
    //   20187	20194	20194	finally
    //   20188	20194	20187	java/lang/ClassCastException
    //   20188	20194	20194	finally
    //   20188	20194	20187	finally
    //   20351	20358	20358	finally
    //   20351	20358	20351	java/lang/ArithmeticException
    //   20351	20358	20351	java/util/NoSuchElementException
    //   20351	20358	20358	finally
    //   20352	20358	20358	java/util/ConcurrentModificationException
    //   20459	20466	20466	finally
    //   20459	20466	20459	finally
    //   20459	20466	20459	finally
    //   20459	20466	20466	java/lang/StringIndexOutOfBoundsException
    //   20460	20466	3	finally
    //   20751	20758	20758	finally
    //   20751	20758	3	finally
    //   20751	20758	20751	java/lang/StringIndexOutOfBoundsException
    //   20752	20758	3	finally
    //   20752	20758	20751	java/lang/NullPointerException
    //   20983	20990	20990	finally
    //   20983	20990	20983	java/util/ConcurrentModificationException
    //   20984	20990	20990	java/util/ConcurrentModificationException
    //   20984	20990	20983	java/lang/ArrayIndexOutOfBoundsException
    //   20984	20990	3	finally
    //   21215	21222	21222	finally
    //   21215	21222	3	java/lang/NegativeArraySizeException
    //   21216	21222	21222	finally
    //   21216	21222	3	finally
    //   21216	21222	21215	java/lang/NumberFormatException
    //   21447	21454	21454	finally
    //   21447	21454	21454	finally
    //   21447	21454	21454	finally
    //   21447	21454	21454	finally
    //   21447	21454	21447	finally
    //   21679	21686	21686	finally
    //   21679	21686	21679	finally
    //   21679	21686	21679	java/lang/NumberFormatException
    //   21680	21686	3	finally
    //   21680	21686	3	finally
    //   21911	21918	21918	finally
    //   21911	21918	21911	finally
    //   21911	21918	3	java/lang/IndexOutOfBoundsException
    //   21912	21918	3	finally
    //   21912	21918	21918	finally
    //   22019	22026	22026	finally
    //   22020	22026	22026	finally
    //   22020	22026	22019	finally
    //   22020	22026	22019	finally
    //   22020	22026	22019	finally
    //   22284	22290	22290	finally
    //   22284	22290	3	finally
    //   22284	22290	22290	java/lang/AssertionError
    //   22284	22290	3	java/lang/IndexOutOfBoundsException
    //   22284	22290	3	java/lang/UnsupportedOperationException
    //   22359	22366	22366	finally
    //   22359	22366	22359	finally
    //   22360	22366	22366	finally
    //   22360	22366	22359	java/lang/NumberFormatException
    //   22360	22366	22359	finally
    //   22431	22438	22438	finally
    //   22431	22438	22431	java/lang/NumberFormatException
    //   22431	22438	22431	java/lang/NegativeArraySizeException
    //   22431	22438	3	finally
    //   22431	22438	3	finally
    //   22568	22574	22574	finally
    //   22568	22574	22574	java/lang/ClassCastException
    //   22568	22574	22574	finally
    //   22568	22574	3	finally
    //   22568	22574	3	java/lang/UnsupportedOperationException
    //   22639	22646	22646	finally
    //   22639	22646	22639	java/lang/IndexOutOfBoundsException
    //   22639	22646	22639	finally
    //   22639	22646	22646	finally
    //   22639	22646	22639	finally
    //   22835	22842	22842	finally
    //   22835	22842	22835	java/lang/RuntimeException
    //   22835	22842	22842	finally
    //   22836	22842	22835	java/lang/NumberFormatException
    //   22836	22842	3	java/lang/AssertionError
    //   22911	22918	22918	finally
    //   22911	22918	22911	java/lang/NegativeArraySizeException
    //   22911	22918	3	finally
    //   22912	22918	22911	java/util/ConcurrentModificationException
    //   22912	22918	3	finally
    //   23115	23122	23122	finally
    //   23115	23122	23122	java/lang/ArithmeticException
    //   23115	23122	23115	finally
    //   23116	23122	3	finally
    //   23116	23122	23115	java/util/ConcurrentModificationException
    //   23192	23198	23198	finally
    //   23192	23198	3	finally
    //   23192	23198	23198	java/lang/EnumConstantNotPresentException
    //   23192	23198	3	finally
    //   23192	23198	3	finally
    //   23387	23394	23394	finally
    //   23387	23394	3	finally
    //   23387	23394	3	java/util/ConcurrentModificationException
    //   23387	23394	23387	java/util/ConcurrentModificationException
    //   23388	23394	3	finally
    //   23535	23542	23542	finally
    //   23535	23542	3	java/lang/AssertionError
    //   23536	23542	23542	java/lang/NullPointerException
    //   23536	23542	23542	java/util/NoSuchElementException
    //   23536	23542	23535	finally
    //   23735	23742	23742	finally
    //   23735	23742	23742	finally
    //   23735	23742	23742	java/util/ConcurrentModificationException
    //   23736	23742	23742	java/lang/NullPointerException
    //   23736	23742	23735	java/lang/ArrayIndexOutOfBoundsException
    //   23811	23818	23818	finally
    //   23812	23818	23818	finally
    //   23812	23818	23811	java/lang/ArithmeticException
    //   23812	23818	23811	java/lang/EnumConstantNotPresentException
    //   23812	23818	3	finally
    //   23883	23890	23890	finally
    //   23883	23890	23890	java/lang/NullPointerException
    //   23884	23890	23883	finally
    //   23884	23890	3	finally
    //   23884	23890	3	java/lang/ClassCastException
    //   24015	24022	24022	finally
    //   24015	24022	24022	finally
    //   24015	24022	24022	finally
    //   24016	24022	24015	java/lang/StringIndexOutOfBoundsException
    //   24016	24022	24022	finally
    //   24087	24094	24094	finally
    //   24087	24094	24094	java/lang/IllegalStateException
    //   24087	24094	24087	java/lang/StringIndexOutOfBoundsException
    //   24087	24094	24087	finally
    //   24088	24094	3	finally
    //   24283	24290	24290	finally
    //   24283	24290	3	finally
    //   24283	24290	24283	java/lang/ArithmeticException
    //   24284	24290	3	java/lang/EnumConstantNotPresentException
    //   24284	24290	24290	finally
    //   24359	24366	24366	finally
    //   24359	24366	3	finally
    //   24360	24366	3	finally
    //   24360	24366	3	java/util/NoSuchElementException
    //   24360	24366	24359	finally
    //   24563	24570	24570	finally
    //   24563	24570	3	java/lang/EnumConstantNotPresentException
    //   24563	24570	24570	java/lang/EnumConstantNotPresentException
    //   24564	24570	3	finally
    //   24564	24570	24563	java/util/NoSuchElementException
    //   24639	24646	24646	finally
    //   24640	24646	24646	finally
    //   24640	24646	3	java/lang/NumberFormatException
    //   24640	24646	24639	finally
    //   24640	24646	3	java/lang/IndexOutOfBoundsException
    //   24836	24842	24842	finally
    //   24836	24842	24842	finally
    //   24836	24842	3	finally
    //   24836	24842	3	finally
    //   24836	24842	24842	finally
    //   24983	24990	24990	finally
    //   24983	24990	24990	java/lang/NullPointerException
    //   24983	24990	24983	java/lang/NullPointerException
    //   24983	24990	24990	java/lang/RuntimeException
    //   24984	24990	3	finally
    //   25183	25190	25190	finally
    //   25183	25190	25190	finally
    //   25184	25190	25183	java/lang/IllegalArgumentException
    //   25184	25190	25183	finally
    //   25184	25190	3	finally
    //   25259	25266	25266	finally
    //   25259	25266	25259	java/lang/NumberFormatException
    //   25259	25266	25266	java/lang/RuntimeException
    //   25259	25266	25266	finally
    //   25260	25266	25266	finally
    //   25331	25338	25338	finally
    //   25331	25338	25338	finally
    //   25332	25338	3	java/lang/RuntimeException
    //   25332	25338	25331	java/lang/EnumConstantNotPresentException
    //   25332	25338	3	java/lang/IllegalArgumentException
    //   25467	25474	25474	finally
    //   25467	25474	3	finally
    //   25468	25474	25467	java/lang/StringIndexOutOfBoundsException
    //   25468	25474	25467	finally
    //   25468	25474	3	java/lang/RuntimeException
    //   25540	25546	25546	finally
    //   25540	25546	25546	java/lang/StringIndexOutOfBoundsException
    //   25540	25546	3	finally
    //   25540	25546	3	finally
    //   25540	25546	3	finally
    //   25735	25742	25742	finally
    //   25735	25742	25742	finally
    //   25736	25742	25735	java/lang/StringIndexOutOfBoundsException
    //   25736	25742	25735	java/lang/IllegalArgumentException
    //   25736	25742	25735	finally
    //   25811	25818	25818	finally
    //   25811	25818	25818	java/lang/NullPointerException
    //   25812	25818	25818	java/util/NoSuchElementException
    //   25812	25818	25811	java/lang/UnsupportedOperationException
    //   25812	25818	3	java/lang/StringIndexOutOfBoundsException
    //   26015	26022	26022	finally
    //   26015	26022	26022	finally
    //   26015	26022	26015	finally
    //   26016	26022	26022	java/lang/NegativeArraySizeException
    //   26016	26022	3	finally
    //   26091	26098	26098	finally
    //   26091	26098	26098	java/util/ConcurrentModificationException
    //   26091	26098	26091	finally
    //   26091	26098	3	java/lang/StringIndexOutOfBoundsException
    //   26092	26098	26091	finally
    //   26287	26294	26294	finally
    //   26287	26294	3	finally
    //   26287	26294	3	finally
    //   26287	26294	26287	finally
    //   26288	26294	26294	java/lang/RuntimeException
    //   26435	26442	26442	finally
    //   26435	26442	26442	java/util/ConcurrentModificationException
    //   26435	26442	26442	java/lang/AssertionError
    //   26435	26442	26435	java/lang/NumberFormatException
    //   26435	26442	26442	finally
    //   26815	26822	26822	finally
    //   26815	26822	3	java/lang/NumberFormatException
    //   26816	26822	26822	java/lang/NegativeArraySizeException
    //   26816	26822	3	finally
    //   26816	26822	26815	java/lang/NumberFormatException
    //   26891	26898	26898	finally
    //   26891	26898	3	java/util/ConcurrentModificationException
    //   26891	26898	26891	java/lang/AssertionError
    //   26891	26898	26898	finally
    //   26892	26898	26891	java/util/ConcurrentModificationException
    //   27095	27102	27102	finally
    //   27095	27102	27102	java/lang/ClassCastException
    //   27095	27102	27095	java/lang/AssertionError
    //   27095	27102	27095	java/util/ConcurrentModificationException
    //   27096	27102	27102	java/lang/AssertionError
    //   27172	27178	27178	finally
    //   27172	27178	27178	java/lang/UnsupportedOperationException
    //   27172	27178	3	java/lang/IndexOutOfBoundsException
    //   27172	27178	27178	finally
    //   27172	27178	3	finally
    //   27251	27258	27258	finally
    //   27251	27258	27258	finally
    //   27251	27258	27258	java/lang/StringIndexOutOfBoundsException
    //   27252	27258	27258	finally
    //   27252	27258	27251	finally
    //   27323	27330	27330	finally
    //   27323	27330	27330	finally
    //   27323	27330	27323	finally
    //   27323	27330	27330	finally
    //   27324	27330	27330	java/lang/ClassCastException
    //   27591	27598	27598	finally
    //   27591	27598	27591	finally
    //   27592	27598	27598	java/lang/NegativeArraySizeException
    //   27592	27598	3	finally
    //   27592	27598	27591	java/lang/NullPointerException
    //   27667	27674	27674	finally
    //   27667	27674	3	java/lang/IllegalArgumentException
    //   27667	27674	27674	finally
    //   27667	27674	3	finally
    //   27668	27674	27667	java/lang/NegativeArraySizeException
    //   27936	27942	27942	finally
    //   27936	27942	27942	java/lang/ArrayIndexOutOfBoundsException
    //   27936	27942	3	finally
    //   27936	27942	27942	finally
    //   27936	27942	3	java/lang/StringIndexOutOfBoundsException
    //   28011	28018	28018	finally
    //   28011	28018	28011	java/lang/NullPointerException
    //   28011	28018	3	java/lang/ClassCastException
    //   28012	28018	28011	finally
    //   28012	28018	3	java/lang/NegativeArraySizeException
    //   28207	28214	28214	finally
    //   28207	28214	28207	java/lang/ArithmeticException
    //   28207	28214	28207	java/lang/AssertionError
    //   28207	28214	3	finally
    //   28207	28214	3	finally
    //   28555	28562	28562	finally
    //   28555	28562	28555	java/lang/ArithmeticException
    //   28556	28562	3	finally
    //   28556	28562	28562	java/lang/ArrayIndexOutOfBoundsException
    //   28556	28562	28555	java/lang/NegativeArraySizeException
    //   28755	28764	28764	finally
    //   28755	28764	28764	finally
    //   28755	28764	3	java/lang/NegativeArraySizeException
    //   28755	28764	3	finally
    //   28755	28764	28755	finally
    //   28948	28956	28956	finally
    //   28948	28956	3	java/lang/IndexOutOfBoundsException
    //   28948	28956	28956	finally
    //   28948	28956	3	finally
    //   28948	28956	3	java/lang/UnsupportedOperationException
    //   29151	29158	29158	finally
    //   29151	29158	29158	java/lang/EnumConstantNotPresentException
    //   29152	29158	3	finally
    //   29152	29158	29151	java/lang/NullPointerException
    //   29152	29158	29151	finally
    //   29507	29514	29514	finally
    //   29507	29514	3	finally
    //   29507	29514	3	finally
    //   29507	29514	29507	finally
    //   29508	29514	29514	java/lang/IllegalArgumentException
    //   30075	30082	30082	finally
    //   30075	30082	3	finally
    //   30076	30082	30082	finally
    //   30076	30082	30075	java/lang/IllegalStateException
    //   30076	30082	30082	finally
    //   30631	30638	30638	finally
    //   30631	30638	30631	java/lang/IllegalStateException
    //   30632	30638	30631	finally
    //   30632	30638	30638	java/lang/IllegalStateException
    //   30632	30638	3	java/lang/UnsupportedOperationException
    //   30843	30850	30850	finally
    //   30843	30850	30843	finally
    //   30843	30850	30843	finally
    //   30843	30850	30850	finally
    //   30844	30850	3	finally
    //   30915	30922	30922	finally
    //   30915	30922	30915	finally
    //   30915	30922	30922	java/lang/IndexOutOfBoundsException
    //   30915	30922	30915	finally
    //   30915	30922	30915	java/lang/IndexOutOfBoundsException
    //   30988	30994	30994	finally
    //   30988	30994	3	java/util/ConcurrentModificationException
    //   30988	30994	3	finally
    //   30988	30994	30994	java/lang/ArrayIndexOutOfBoundsException
    //   30988	30994	30994	finally
    //   31123	31130	31130	finally
    //   31123	31130	3	finally
    //   31123	31130	31123	finally
    //   31124	31130	31130	finally
    //   31124	31130	31130	finally
    //   31260	31266	31266	finally
    //   31260	31266	3	java/lang/ClassCastException
    //   31260	31266	3	finally
    //   31260	31266	31266	finally
    //   31260	31266	31266	finally
    //   31396	31402	31402	finally
    //   31396	31402	3	finally
    //   31396	31402	3	java/lang/IndexOutOfBoundsException
    //   31396	31402	31402	java/lang/ArithmeticException
    //   31396	31402	3	java/util/NoSuchElementException
    //   31467	31474	31474	finally
    //   31467	31474	31474	finally
    //   31467	31474	31467	java/lang/IllegalArgumentException
    //   31467	31474	3	finally
    //   31468	31474	31474	finally
    //   31543	31550	31550	finally
    //   31543	31550	31543	java/util/ConcurrentModificationException
    //   31544	31550	3	java/lang/IllegalStateException
    //   31544	31550	31543	finally
    //   31544	31550	3	finally
    //   31615	31622	31622	finally
    //   31615	31622	31622	java/lang/UnsupportedOperationException
    //   31615	31622	31622	finally
    //   31615	31622	31622	java/lang/StringIndexOutOfBoundsException
    //   31616	31622	31615	java/lang/ClassCastException
    //   32203	32210	32210	finally
    //   32203	32210	32203	finally
    //   32203	32210	3	java/lang/NullPointerException
    //   32203	32210	32210	finally
    //   32204	32210	3	java/lang/IllegalStateException
    //   32355	32362	32362	finally
    //   32355	32362	3	finally
    //   32356	32362	32355	finally
    //   32356	32362	3	finally
    //   32356	32362	32362	finally
    //   32563	32570	32570	finally
    //   32564	32570	32563	finally
    //   32564	32570	32563	java/lang/NegativeArraySizeException
    //   32564	32570	32570	java/lang/StringIndexOutOfBoundsException
    //   32564	32570	32563	java/lang/NegativeArraySizeException
    //   32699	32706	32706	finally
    //   32699	32706	32706	finally
    //   32699	32706	32699	finally
    //   32700	32706	32706	java/lang/IllegalStateException
    //   32700	32706	32706	finally
    //   32836	32842	32842	finally
    //   32836	32842	32842	finally
    //   32836	32842	3	finally
    //   32836	32842	3	java/lang/AssertionError
    //   32836	32842	32842	finally
    //   33391	33398	33398	finally
    //   33391	33398	33391	finally
    //   33391	33398	3	java/lang/ArrayIndexOutOfBoundsException
    //   33392	33398	33398	finally
    //   33392	33398	33398	java/lang/NullPointerException
    //   33527	33534	33534	finally
    //   33527	33534	3	java/lang/RuntimeException
    //   33527	33534	33527	finally
    //   33527	33534	33527	java/lang/ArithmeticException
    //   33528	33534	3	java/lang/RuntimeException
    //   33603	33610	33610	finally
    //   33604	33610	3	finally
    //   33604	33610	33610	finally
    //   33604	33610	33610	java/lang/IndexOutOfBoundsException
    //   33604	33610	33603	finally
    //   33675	33682	33682	finally
    //   33675	33682	3	finally
    //   33675	33682	33675	finally
    //   33675	33682	33675	java/lang/UnsupportedOperationException
    //   33676	33682	3	java/util/ConcurrentModificationException
    //   33947	33954	33954	finally
    //   33947	33954	33947	java/lang/ArithmeticException
    //   33948	33954	3	java/lang/NumberFormatException
    //   33948	33954	33947	java/lang/IllegalArgumentException
    //   33948	33954	3	finally
    //   34083	34090	34090	finally
    //   34083	34090	3	finally
    //   34084	34090	34090	java/lang/IndexOutOfBoundsException
    //   34084	34090	34083	java/lang/ClassCastException
    //   34084	34090	34090	java/util/NoSuchElementException
    //   34159	34166	34166	finally
    //   34159	34166	34159	finally
    //   34159	34166	34166	java/lang/RuntimeException
    //   34159	34166	34166	java/lang/AssertionError
    //   34160	34166	34166	finally
    //   34231	34238	34238	finally
    //   34231	34238	34231	finally
    //   34231	34238	34238	java/lang/RuntimeException
    //   34232	34238	3	java/util/NoSuchElementException
    //   34232	34238	34231	finally
    //   34303	34310	34310	finally
    //   34304	34310	34303	finally
    //   34304	34310	34310	finally
    //   34304	34310	34303	finally
    //   34304	34310	3	finally
    //   34608	34614	34614	finally
    //   34608	34614	3	finally
    //   34608	34614	34614	java/lang/StringIndexOutOfBoundsException
    //   34608	34614	3	finally
    //   34608	34614	3	java/util/NoSuchElementException
    //   34679	34686	34686	finally
    //   34679	34686	34679	java/lang/IllegalStateException
    //   34679	34686	3	finally
    //   34680	34686	34679	java/lang/ClassCastException
    //   34680	34686	34679	java/lang/NumberFormatException
    //   35618	35626	35618	java/lang/IllegalArgumentException
    //   35634	35636	3	finally
  }
  
  public int getBlockDamage(BlockPos pos) {
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
  
  public void onRender2D(Render2DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 571
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 563
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 555
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 158019248
    //   33: l2i
    //   34: ldc_w -1005906610
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 104474729
    //   44: l2i
    //   45: ldc_w -821362739
    //   48: ixor
    //   49: ldc2_w -898732313
    //   52: l2i
    //   53: ldc_w 429741678
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 512951159 -> 538, 1714953637 -> 41
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifeq -> 109
    //   98: ldc2_w 1216835112
    //   101: l2i
    //   102: ldc_w 1885496015
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 1083266004
    //   112: l2i
    //   113: ldc_w 2020892466
    //   116: ixor
    //   117: ldc2_w 515017359
    //   120: l2i
    //   121: ldc_w 835557840
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, 395976632 -> 148, 395976633 -> 149
    //   148: return
    //   149: getstatic Perryc.1 : I
    //   152: ifeq -> 166
    //   155: ldc2_w 1581811047
    //   158: l2i
    //   159: ldc_w 1584427301
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w 1764655323
    //   169: l2i
    //   170: ldc_w -134300041
    //   173: ixor
    //   174: ldc2_w 297599782
    //   177: l2i
    //   178: ldc_w 498512313
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 208, 204687069 -> 540, 1566217120 -> 166
    //   208: aload_0
    //   209: getstatic Perryc.c : I
    //   212: iflt -> 226
    //   215: ldc2_w 588716169
    //   218: l2i
    //   219: ldc_w 1846633681
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 1333383258
    //   229: l2i
    //   230: ldc_w 1443232875
    //   233: ixor
    //   234: ldc2_w 203380662
    //   237: l2i
    //   238: ldc_w 2068622383
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -668446807 -> 226, 978683841 -> 534
    //   268: aload_1
    //   269: getstatic Perryc.0 : I
    //   272: ifle -> 286
    //   275: ldc2_w -1900706230
    //   278: l2i
    //   279: ldc_w 1529440918
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w -1832792475
    //   289: l2i
    //   290: ldc_w 1822076307
    //   293: ixor
    //   294: ldc2_w -1778010630
    //   297: l2i
    //   298: ldc_w -1254517038
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 328, -2005513638 -> 286, -157233164 -> 536
    //   328: getfield partialTicks : F
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 348
    //   337: ldc2_w -874116525
    //   340: l2i
    //   341: ldc_w -1446079699
    //   344: ixor
    //   345: goto -> 356
    //   348: ldc2_w -657776715
    //   351: l2i
    //   352: ldc_w 622508877
    //   355: ixor
    //   356: ldc2_w -2087217919
    //   359: l2i
    //   360: ldc_w -1492285305
    //   363: ixor
    //   364: ixor
    //   365: lookupswitch default -> 542, -649348738 -> 392, 1186104568 -> 348
    //   392: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   395: getstatic Perryc.c : I
    //   398: iflt -> 412
    //   401: ldc2_w -1916412854
    //   404: l2i
    //   405: ldc_w -2029521991
    //   408: ixor
    //   409: goto -> 420
    //   412: ldc2_w 675388999
    //   415: l2i
    //   416: ldc_w -19444603
    //   419: ixor
    //   420: ldc2_w 899081877
    //   423: l2i
    //   424: ldc_w -270547403
    //   427: ixor
    //   428: ixor
    //   429: lookupswitch default -> 544, -796192941 -> 412, 216003170 -> 456
    //   456: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   459: getstatic Perryc.0 : I
    //   462: ifle -> 476
    //   465: ldc2_w 1003310852
    //   468: l2i
    //   469: ldc_w -1041562421
    //   472: ixor
    //   473: goto -> 484
    //   476: ldc2_w 1573638803
    //   479: l2i
    //   480: ldc_w -778715748
    //   483: ixor
    //   484: ldc2_w 615958505
    //   487: l2i
    //   488: ldc_w -1125789754
    //   491: ixor
    //   492: ixor
    //   493: lookupswitch default -> 532, 336422688 -> 520, 1651852256 -> 476
    //   520: goto -> 524
    //   523: athrow
    //   524: invokevirtual drawTargetHud : (FLnet/minecraft/entity/player/EntityPlayer;)V
    //   527: goto -> 531
    //   530: athrow
    //   531: return
    //   532: aconst_null
    //   533: athrow
    //   534: aconst_null
    //   535: athrow
    //   536: aconst_null
    //   537: athrow
    //   538: aconst_null
    //   539: athrow
    //   540: aconst_null
    //   541: athrow
    //   542: aconst_null
    //   543: athrow
    //   544: aconst_null
    //   545: athrow
    //   546: pop
    //   547: goto -> 24
    //   550: pop
    //   551: aconst_null
    //   552: goto -> 546
    //   555: dup
    //   556: ifnull -> 546
    //   559: checkcast java/lang/Throwable
    //   562: athrow
    //   563: dup
    //   564: ifnull -> 550
    //   567: checkcast java/lang/Throwable
    //   570: athrow
    //   571: aconst_null
    //   572: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	508	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Target;
    //   24	508	1	event	Lbigname/zprestige/webhack/event/events/Render2DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	555	java/lang/AssertionError
    //   87	94	94	finally
    //   87	94	3	finally
    //   87	94	94	java/lang/NullPointerException
    //   88	94	87	finally
    //   88	94	87	finally
    //   523	530	530	finally
    //   523	530	530	java/lang/NegativeArraySizeException
    //   523	530	530	java/lang/UnsupportedOperationException
    //   524	530	3	java/lang/IndexOutOfBoundsException
    //   524	530	523	java/lang/UnsupportedOperationException
    //   555	563	555	java/util/NoSuchElementException
    //   571	573	3	finally
  }
  
  public void drawBlock(Block block, float x, float y) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1877
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1869
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1861
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/item/ItemStack
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w 2134954118
    //   37: l2i
    //   38: ldc_w -1295240030
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1919035526
    //   48: l2i
    //   49: ldc_w 2056259959
    //   52: ixor
    //   53: ldc2_w -227145108
    //   56: l2i
    //   57: ldc_w -1350942534
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 1830, -1870614798 -> 45, -1442736933 -> 88
    //   88: aload_1
    //   89: getstatic Perryc.0 : I
    //   92: ifle -> 106
    //   95: ldc2_w -1833374840
    //   98: l2i
    //   99: ldc_w -905561151
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -1533449280
    //   109: l2i
    //   110: ldc_w -2116356481
    //   113: ixor
    //   114: ldc2_w -765865343
    //   117: l2i
    //   118: ldc_w -1825086661
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 1808, 433086963 -> 106, 1680681989 -> 148
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : (Lnet/minecraft/block/Block;)V
    //   155: goto -> 159
    //   158: athrow
    //   159: getstatic Perryc.0 : I
    //   162: ifle -> 176
    //   165: ldc2_w 585487547
    //   168: l2i
    //   169: ldc_w 930086852
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w -810949512
    //   179: l2i
    //   180: ldc_w 1425658927
    //   183: ixor
    //   184: ldc2_w 1091472550
    //   187: l2i
    //   188: ldc_w -2035910454
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 220, -769466605 -> 1820, -250331729 -> 176
    //   220: astore #4
    //   222: getstatic Perryc.1 : I
    //   225: ifeq -> 239
    //   228: ldc2_w -554632257
    //   231: l2i
    //   232: ldc_w -2026778529
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w 899576168
    //   242: l2i
    //   243: sipush #17860
    //   246: ixor
    //   247: ldc2_w 1709996810
    //   250: l2i
    //   251: ldc_w 1301472574
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 284, 1908389332 -> 1810, 2047300361 -> 239
    //   284: goto -> 288
    //   287: athrow
    //   288: invokestatic func_179094_E : ()V
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.1 : I
    //   298: ifeq -> 312
    //   301: ldc2_w 1669192275
    //   304: l2i
    //   305: ldc_w -1320811171
    //   308: ixor
    //   309: goto -> 320
    //   312: ldc2_w -58219385
    //   315: l2i
    //   316: ldc_w 1723071071
    //   319: ixor
    //   320: ldc2_w 2029941006
    //   323: l2i
    //   324: ldc_w -996930749
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 356, 525994338 -> 312, 1850844483 -> 1844
    //   356: goto -> 360
    //   359: athrow
    //   360: invokestatic func_179147_l : ()V
    //   363: goto -> 367
    //   366: athrow
    //   367: ldc2_w 330208253
    //   370: l2i
    //   371: ldc_w 330207487
    //   374: ixor
    //   375: ldc2_w -1183373461
    //   378: l2i
    //   379: ldc_w -1183374232
    //   382: ixor
    //   383: ldc2_w 1298402384
    //   386: l2i
    //   387: ldc_w 1298402385
    //   390: ixor
    //   391: ldc2_w -1751761263
    //   394: l2i
    //   395: ldc_w -1751761263
    //   398: ixor
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 1376055865
    //   408: l2i
    //   409: ldc_w -22934429
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -1595326648
    //   419: l2i
    //   420: ldc_w 1496690741
    //   423: ixor
    //   424: ldc2_w 246054997
    //   427: l2i
    //   428: ldc_w -233555408
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 460, 586668649 -> 416, 1343767615 -> 1826
    //   460: goto -> 464
    //   463: athrow
    //   464: invokestatic func_179120_a : (IIII)V
    //   467: goto -> 471
    //   470: athrow
    //   471: getstatic Perryc.0 : I
    //   474: ifle -> 488
    //   477: ldc2_w 130352183
    //   480: l2i
    //   481: ldc_w 1214083212
    //   484: ixor
    //   485: goto -> 496
    //   488: ldc2_w 1540370315
    //   491: l2i
    //   492: ldc_w -2113842293
    //   495: ixor
    //   496: ldc2_w -1229321194
    //   499: l2i
    //   500: ldc_w -649136880
    //   503: ixor
    //   504: ixor
    //   505: lookupswitch default -> 1824, -1239055098 -> 532, 543985085 -> 488
    //   532: goto -> 536
    //   535: athrow
    //   536: invokestatic func_74520_c : ()V
    //   539: goto -> 543
    //   542: athrow
    //   543: getstatic Perryc.0 : I
    //   546: ifle -> 560
    //   549: ldc2_w -159448395
    //   552: l2i
    //   553: ldc_w 119641736
    //   556: ixor
    //   557: goto -> 568
    //   560: ldc2_w 304502682
    //   563: l2i
    //   564: ldc_w -1979623757
    //   567: ixor
    //   568: ldc2_w -1828522759
    //   571: l2i
    //   572: ldc_w 1682673311
    //   575: ixor
    //   576: ixor
    //   577: lookupswitch default -> 604, -213715588 -> 560, 102231643 -> 1828
    //   604: fload_2
    //   605: getstatic Perryc.0 : I
    //   608: ifle -> 622
    //   611: ldc2_w 2088427295
    //   614: l2i
    //   615: ldc_w -174999480
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w -564588115
    //   625: l2i
    //   626: ldc_w -158496200
    //   629: ixor
    //   630: ldc2_w -1135392652
    //   633: l2i
    //   634: ldc_w 1380643562
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 1838, -959635189 -> 664, 1743969737 -> 622
    //   664: fload_3
    //   665: ldc_w 9.102339E36
    //   668: invokestatic floatToIntBits : (F)I
    //   671: ldc_w 2094735743
    //   674: ixor
    //   675: invokestatic intBitsToFloat : (I)F
    //   678: getstatic Perryc.1 : I
    //   681: ifeq -> 695
    //   684: ldc2_w 1805564401
    //   687: l2i
    //   688: ldc_w -1957414392
    //   691: ixor
    //   692: goto -> 703
    //   695: ldc2_w -1931950531
    //   698: l2i
    //   699: ldc_w 1066215435
    //   702: ixor
    //   703: ldc2_w -1410681080
    //   706: l2i
    //   707: ldc_w -1705084993
    //   710: ixor
    //   711: ixor
    //   712: lookupswitch default -> 740, -780254386 -> 1818, 1347738937 -> 695
    //   740: goto -> 744
    //   743: athrow
    //   744: invokestatic func_179109_b : (FFF)V
    //   747: goto -> 751
    //   750: athrow
    //   751: getstatic Perryc.c : I
    //   754: iflt -> 768
    //   757: ldc2_w 1365693284
    //   760: l2i
    //   761: ldc_w -1224182456
    //   764: ixor
    //   765: goto -> 776
    //   768: ldc2_w -903249555
    //   771: l2i
    //   772: ldc_w -1516658980
    //   775: ixor
    //   776: ldc2_w 260199191
    //   779: l2i
    //   780: ldc_w 1750052034
    //   783: ixor
    //   784: ixor
    //   785: lookupswitch default -> 812, -2120001031 -> 1840, 1191344166 -> 768
    //   812: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   815: getstatic Perryc.0 : I
    //   818: ifle -> 832
    //   821: ldc2_w 1309116323
    //   824: l2i
    //   825: ldc_w 1743567007
    //   828: ixor
    //   829: goto -> 840
    //   832: ldc2_w 1575807600
    //   835: l2i
    //   836: ldc_w 1895496581
    //   839: ixor
    //   840: ldc2_w -275437120
    //   843: l2i
    //   844: ldc_w 1446751015
    //   847: ixor
    //   848: ixor
    //   849: lookupswitch default -> 1834, -1874477605 -> 832, -1799843054 -> 876
    //   876: goto -> 880
    //   879: athrow
    //   880: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   883: goto -> 887
    //   886: athrow
    //   887: ldc_w 0.062187795
    //   890: invokestatic floatToIntBits : (F)I
    //   893: ldc_w 2122594465
    //   896: ixor
    //   897: invokestatic intBitsToFloat : (I)F
    //   900: getstatic Perryc.0 : I
    //   903: ifle -> 917
    //   906: ldc2_w -1439286841
    //   909: l2i
    //   910: ldc_w -472450966
    //   913: ixor
    //   914: goto -> 925
    //   917: ldc2_w -422305166
    //   920: l2i
    //   921: ldc_w 1039157706
    //   924: ixor
    //   925: ldc2_w 1546873340
    //   928: l2i
    //   929: ldc_w 1774424843
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, -1505405380 -> 917, 2081438554 -> 1814
    //   960: putfield field_77023_b : F
    //   963: getstatic Perryc.c : I
    //   966: iflt -> 980
    //   969: ldc2_w 233350842
    //   972: l2i
    //   973: ldc_w -1395955971
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w -1440098137
    //   983: l2i
    //   984: ldc_w 678707413
    //   987: ixor
    //   988: ldc2_w -36378044
    //   991: l2i
    //   992: ldc_w 121754417
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, 831986237 -> 980, 1538718002 -> 1812
    //   1024: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   1027: getstatic Perryc.c : I
    //   1030: iflt -> 1044
    //   1033: ldc2_w 668320327
    //   1036: l2i
    //   1037: ldc_w -82885525
    //   1040: ixor
    //   1041: goto -> 1052
    //   1044: ldc2_w -669303037
    //   1047: l2i
    //   1048: ldc_w 809160542
    //   1051: ixor
    //   1052: ldc2_w 2142495506
    //   1055: l2i
    //   1056: ldc_w -323015292
    //   1059: ixor
    //   1060: ixor
    //   1061: lookupswitch default -> 1088, -185584568 -> 1044, 1339443386 -> 1804
    //   1088: goto -> 1092
    //   1091: athrow
    //   1092: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   1095: goto -> 1099
    //   1098: athrow
    //   1099: getstatic Perryc.c : I
    //   1102: iflt -> 1116
    //   1105: ldc2_w -1007701048
    //   1108: l2i
    //   1109: ldc_w -727464540
    //   1112: ixor
    //   1113: goto -> 1124
    //   1116: ldc2_w -2015271031
    //   1119: l2i
    //   1120: ldc_w 728296330
    //   1123: ixor
    //   1124: ldc2_w 618257780
    //   1127: l2i
    //   1128: ldc_w -2071477216
    //   1131: ixor
    //   1132: ixor
    //   1133: lookupswitch default -> 1832, -1223528648 -> 1116, 215455063 -> 1160
    //   1160: aload #4
    //   1162: ldc2_w -1668945585
    //   1165: l2i
    //   1166: ldc_w -1668945585
    //   1169: ixor
    //   1170: ldc2_w -687068286
    //   1173: l2i
    //   1174: ldc_w -687068286
    //   1177: ixor
    //   1178: getstatic Perryc.1 : I
    //   1181: ifeq -> 1195
    //   1184: ldc2_w -739218904
    //   1187: l2i
    //   1188: ldc_w -1578167769
    //   1191: ixor
    //   1192: goto -> 1203
    //   1195: ldc2_w -1248066278
    //   1198: l2i
    //   1199: ldc_w 1692744400
    //   1202: ixor
    //   1203: ldc2_w -1091157673
    //   1206: l2i
    //   1207: ldc_w -761061398
    //   1210: ixor
    //   1211: ixor
    //   1212: lookupswitch default -> 1816, -1121164937 -> 1240, 508176050 -> 1195
    //   1240: goto -> 1244
    //   1243: athrow
    //   1244: invokevirtual func_180450_b : (Lnet/minecraft/item/ItemStack;II)V
    //   1247: goto -> 1251
    //   1250: athrow
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w -1547065078
    //   1260: l2i
    //   1261: ldc_w 1842470790
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w -264566794
    //   1271: l2i
    //   1272: ldc_w 1860835526
    //   1275: ixor
    //   1276: ldc2_w -667354938
    //   1279: l2i
    //   1280: ldc_w 655126529
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 1842, 825032267 -> 1268, 1642436599 -> 1312
    //   1312: getstatic bigname/zprestige/webhack/features/modules/Hud/Target.mc : Lnet/minecraft/client/Minecraft;
    //   1315: getstatic Perryc.0 : I
    //   1318: ifle -> 1332
    //   1321: ldc2_w 444406291
    //   1324: l2i
    //   1325: ldc_w -292717600
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w -578851174
    //   1335: l2i
    //   1336: ldc_w -147381000
    //   1339: ixor
    //   1340: ldc2_w 955355209
    //   1343: l2i
    //   1344: ldc_w 1656194474
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, -1363774448 -> 1806, 607122838 -> 1332
    //   1376: goto -> 1380
    //   1379: athrow
    //   1380: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   1383: goto -> 1387
    //   1386: athrow
    //   1387: ldc_w 2.6771414E38
    //   1390: invokestatic floatToIntBits : (F)I
    //   1393: ldc_w 2135517150
    //   1396: ixor
    //   1397: invokestatic intBitsToFloat : (I)F
    //   1400: getstatic Perryc.1 : I
    //   1403: ifeq -> 1417
    //   1406: ldc2_w -1416464038
    //   1409: l2i
    //   1410: ldc_w 530048300
    //   1413: ixor
    //   1414: goto -> 1425
    //   1417: ldc2_w -1296611882
    //   1420: l2i
    //   1421: ldc_w -1473800756
    //   1424: ixor
    //   1425: ldc2_w 2112410959
    //   1428: l2i
    //   1429: ldc_w 1492487406
    //   1432: ixor
    //   1433: ixor
    //   1434: lookupswitch default -> 1460, -1860647465 -> 1822, 354114029 -> 1417
    //   1460: putfield field_77023_b : F
    //   1463: getstatic Perryc.0 : I
    //   1466: ifle -> 1480
    //   1469: ldc2_w 1394451991
    //   1472: l2i
    //   1473: ldc_w -24272202
    //   1476: ixor
    //   1477: goto -> 1488
    //   1480: ldc2_w 208394517
    //   1483: l2i
    //   1484: ldc_w -208949830
    //   1487: ixor
    //   1488: ldc2_w 1193137132
    //   1491: l2i
    //   1492: ldc_w 1434921795
    //   1495: ixor
    //   1496: ixor
    //   1497: lookupswitch default -> 1848, -1089799154 -> 1480, -310735872 -> 1524
    //   1524: goto -> 1528
    //   1527: athrow
    //   1528: invokestatic func_74518_a : ()V
    //   1531: goto -> 1535
    //   1534: athrow
    //   1535: getstatic Perryc.1 : I
    //   1538: ifeq -> 1552
    //   1541: ldc2_w 1871274646
    //   1544: l2i
    //   1545: ldc_w 1183426527
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w -29616057
    //   1555: l2i
    //   1556: ldc_w -530801644
    //   1559: ixor
    //   1560: ldc2_w -1093012745
    //   1563: l2i
    //   1564: ldc_w 2049872103
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 1846, -627579325 -> 1596, -302536871 -> 1552
    //   1596: goto -> 1600
    //   1599: athrow
    //   1600: invokestatic func_179084_k : ()V
    //   1603: goto -> 1607
    //   1606: athrow
    //   1607: ldc_w 5.9715867
    //   1610: invokestatic floatToIntBits : (F)I
    //   1613: ldc_w 2134841149
    //   1616: ixor
    //   1617: invokestatic intBitsToFloat : (I)F
    //   1620: ldc_w 110.03588
    //   1623: invokestatic floatToIntBits : (F)I
    //   1626: ldc_w 2103186015
    //   1629: ixor
    //   1630: invokestatic intBitsToFloat : (I)F
    //   1633: ldc_w 5.8086424
    //   1636: invokestatic floatToIntBits : (F)I
    //   1639: ldc_w 2134499430
    //   1642: ixor
    //   1643: invokestatic intBitsToFloat : (I)F
    //   1646: ldc_w 6.783584
    //   1649: invokestatic floatToIntBits : (F)I
    //   1652: ldc_w 2136544031
    //   1655: ixor
    //   1656: invokestatic intBitsToFloat : (I)F
    //   1659: getstatic Perryc.0 : I
    //   1662: ifle -> 1676
    //   1665: ldc2_w -217115697
    //   1668: l2i
    //   1669: ldc_w 934505467
    //   1672: ixor
    //   1673: goto -> 1684
    //   1676: ldc2_w 588339261
    //   1679: l2i
    //   1680: ldc_w -1831845711
    //   1683: ixor
    //   1684: ldc2_w -987303565
    //   1687: l2i
    //   1688: ldc_w 1235238784
    //   1691: ixor
    //   1692: ixor
    //   1693: lookupswitch default -> 1720, 290825095 -> 1676, 1211807431 -> 1836
    //   1720: goto -> 1724
    //   1723: athrow
    //   1724: invokestatic func_179131_c : (FFFF)V
    //   1727: goto -> 1731
    //   1730: athrow
    //   1731: getstatic Perryc.0 : I
    //   1734: ifle -> 1748
    //   1737: ldc2_w -2053164320
    //   1740: l2i
    //   1741: ldc_w 496134307
    //   1744: ixor
    //   1745: goto -> 1756
    //   1748: ldc2_w 1894681901
    //   1751: l2i
    //   1752: ldc_w 1762787969
    //   1755: ixor
    //   1756: ldc2_w -917485749
    //   1759: l2i
    //   1760: ldc_w 996757307
    //   1763: ixor
    //   1764: ixor
    //   1765: lookupswitch default -> 1792, 1332234843 -> 1748, 1781813811 -> 1850
    //   1792: goto -> 1796
    //   1795: athrow
    //   1796: invokestatic func_179121_F : ()V
    //   1799: goto -> 1803
    //   1802: athrow
    //   1803: return
    //   1804: aconst_null
    //   1805: athrow
    //   1806: aconst_null
    //   1807: athrow
    //   1808: aconst_null
    //   1809: athrow
    //   1810: aconst_null
    //   1811: athrow
    //   1812: aconst_null
    //   1813: athrow
    //   1814: aconst_null
    //   1815: athrow
    //   1816: aconst_null
    //   1817: athrow
    //   1818: aconst_null
    //   1819: athrow
    //   1820: aconst_null
    //   1821: athrow
    //   1822: aconst_null
    //   1823: athrow
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aconst_null
    //   1827: athrow
    //   1828: aconst_null
    //   1829: athrow
    //   1830: aconst_null
    //   1831: athrow
    //   1832: aconst_null
    //   1833: athrow
    //   1834: aconst_null
    //   1835: athrow
    //   1836: aconst_null
    //   1837: athrow
    //   1838: aconst_null
    //   1839: athrow
    //   1840: aconst_null
    //   1841: athrow
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: pop
    //   1853: goto -> 24
    //   1856: pop
    //   1857: aconst_null
    //   1858: goto -> 1852
    //   1861: dup
    //   1862: ifnull -> 1852
    //   1865: checkcast java/lang/Throwable
    //   1868: athrow
    //   1869: dup
    //   1870: ifnull -> 1856
    //   1873: checkcast java/lang/Throwable
    //   1876: athrow
    //   1877: aconst_null
    //   1878: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1780	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Target;
    //   24	1780	1	block	Lnet/minecraft/block/Block;
    //   24	1780	2	x	F
    //   24	1780	3	y	F
    //   222	1582	4	stack	Lnet/minecraft/item/ItemStack;
    // Exception table:
    //   from	to	target	type
    //   8	20	1861	finally
    //   151	158	158	finally
    //   151	158	158	finally
    //   151	158	151	java/lang/IllegalStateException
    //   152	158	3	finally
    //   152	158	151	finally
    //   287	294	294	finally
    //   287	294	294	java/lang/NumberFormatException
    //   287	294	294	java/lang/EnumConstantNotPresentException
    //   287	294	287	finally
    //   288	294	287	java/lang/NullPointerException
    //   359	366	366	finally
    //   359	366	359	finally
    //   359	366	366	java/lang/NumberFormatException
    //   359	366	359	java/lang/IndexOutOfBoundsException
    //   360	366	366	finally
    //   463	470	470	finally
    //   463	470	3	java/lang/ArithmeticException
    //   464	470	3	finally
    //   464	470	3	java/lang/IllegalStateException
    //   464	470	463	finally
    //   535	542	542	finally
    //   535	542	535	finally
    //   536	542	3	java/lang/UnsupportedOperationException
    //   536	542	542	finally
    //   536	542	535	finally
    //   743	750	750	finally
    //   743	750	743	finally
    //   743	750	3	finally
    //   744	750	750	java/lang/ArrayIndexOutOfBoundsException
    //   744	750	750	java/lang/NullPointerException
    //   879	886	886	finally
    //   879	886	3	finally
    //   880	886	3	java/lang/NullPointerException
    //   880	886	3	finally
    //   880	886	879	java/util/ConcurrentModificationException
    //   1092	1098	1098	finally
    //   1092	1098	1098	java/lang/ArrayIndexOutOfBoundsException
    //   1092	1098	3	java/lang/EnumConstantNotPresentException
    //   1092	1098	1098	java/lang/ArrayIndexOutOfBoundsException
    //   1092	1098	1098	finally
    //   1243	1250	1250	finally
    //   1243	1250	1250	java/lang/NegativeArraySizeException
    //   1244	1250	1243	java/lang/ArithmeticException
    //   1244	1250	1243	finally
    //   1244	1250	1250	finally
    //   1380	1386	1386	finally
    //   1380	1386	3	java/lang/NumberFormatException
    //   1380	1386	3	java/lang/NumberFormatException
    //   1380	1386	3	finally
    //   1380	1386	1386	java/lang/IllegalArgumentException
    //   1528	1534	1534	finally
    //   1528	1534	1534	java/lang/NumberFormatException
    //   1528	1534	3	java/lang/NumberFormatException
    //   1528	1534	3	java/lang/ArithmeticException
    //   1528	1534	3	finally
    //   1599	1606	1606	finally
    //   1599	1606	1599	java/lang/EnumConstantNotPresentException
    //   1599	1606	1599	finally
    //   1600	1606	1599	java/lang/NumberFormatException
    //   1600	1606	3	finally
    //   1723	1730	1730	finally
    //   1723	1730	1730	java/lang/NumberFormatException
    //   1723	1730	1723	java/lang/IllegalStateException
    //   1723	1730	3	finally
    //   1724	1730	3	java/lang/ArithmeticException
    //   1795	1802	1802	finally
    //   1795	1802	1795	java/lang/EnumConstantNotPresentException
    //   1795	1802	3	finally
    //   1795	1802	1795	finally
    //   1796	1802	1795	finally
    //   1861	1869	1861	finally
    //   1877	1879	3	java/lang/NumberFormatException
  }
  
  public void setInstance() {
    Perry1.3w(this, (int)1510511983L ^ 0x6F6D5C6F);
  }
  
  public void drawOverlay(float partialTicks, Entity player, int x, int y) {
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
  
  static {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 21
    //   10: ldc2_w -146180884
    //   13: l2i
    //   14: ldc_w -1282247338
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w -1805960186
    //   24: l2i
    //   25: ldc_w 1565834242
    //   28: ixor
    //   29: ldc2_w -1908091623
    //   32: l2i
    //   33: ldc_w 524164629
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 270, -710817098 -> 21, 1484081928 -> 64
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.0 : I
    //   70: ifle -> 84
    //   73: ldc2_w -1454678805
    //   76: l2i
    //   77: ldc_w 732145797
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -1007745945
    //   87: l2i
    //   88: ldc_w 549133599
    //   91: ixor
    //   92: ldc2_w -1988279714
    //   95: l2i
    //   96: ldc_w -197164808
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -596759110 -> 84, -5622072 -> 266
    //   128: putstatic bigname/zprestige/webhack/features/modules/Hud/Target.TotemPopContainer : Ljava/util/HashMap;
    //   131: new bigname/zprestige/webhack/features/modules/Hud/Target
    //   134: dup
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 152
    //   141: ldc2_w 1973440924
    //   144: l2i
    //   145: ldc_w -36345817
    //   148: ixor
    //   149: goto -> 160
    //   152: ldc2_w -1611635661
    //   155: l2i
    //   156: ldc_w 98832359
    //   159: ixor
    //   160: ldc2_w 1690125507
    //   163: l2i
    //   164: ldc_w -1383701653
    //   167: ixor
    //   168: ixor
    //   169: lookupswitch default -> 268, 1095638547 -> 152, 1395608700 -> 196
    //   196: invokespecial <init> : ()V
    //   199: getstatic Perryc.c : I
    //   202: iflt -> 216
    //   205: ldc2_w 1971404594
    //   208: l2i
    //   209: ldc_w -1760336360
    //   212: ixor
    //   213: goto -> 224
    //   216: ldc2_w 1987045430
    //   219: l2i
    //   220: ldc_w 1366261927
    //   223: ixor
    //   224: ldc2_w 603161186
    //   227: l2i
    //   228: ldc_w 398634001
    //   231: ixor
    //   232: ixor
    //   233: lookupswitch default -> 260, -693930151 -> 264, -467730855 -> 216
    //   260: putstatic bigname/zprestige/webhack/features/modules/Hud/Target.INSTANCE : Lbigname/zprestige/webhack/features/modules/Hud/Target;
    //   263: return
    //   264: aconst_null
    //   265: athrow
    //   266: aconst_null
    //   267: athrow
    //   268: aconst_null
    //   269: athrow
    //   270: aconst_null
    //   271: athrow
  }
  
  public static EntityPlayer getClosestEnemy() {
    return Perry1.2i(null, (int)1215128881L ^ 0x3CC09F39);
  }
  
  @SubscribeEvent
  public void onReceivePacket(PacketEvent.Receive paramReceive) {
    Perry1.4S(this, (int)1545506143L ^ 0x580A19B2, paramReceive);
  }
  
  public boolean lambda$new$0(Integer paramInteger) {
    return Perry1.5A(this, (int)1006565477L ^ 0x5F83E740, paramInteger);
  }
  
  public Block getBlock(BlockPos paramBlockPos) {
    return Perry1.50(this, (int)1860800610L ^ 0x69B02193, paramBlockPos);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Target.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */