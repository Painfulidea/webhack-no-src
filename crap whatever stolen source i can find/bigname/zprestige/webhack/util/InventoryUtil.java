package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InventoryUtil implements Util {
  public static int findStackInventory(Item input, boolean withHotbar) {
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
  
  public static void switchToHotbarSlot(Class clazz, boolean silent) {
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
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static int convertHotbarToInv(int paramInt) {
    return Perry1.w(null, (int)3494221L ^ 0x2FD3A6EE, paramInt);
  }
  
  public static boolean isNull(ItemStack stack) {
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
  
  public static int findArmorSlot(EntityEquipmentSlot type, boolean binding, boolean withXCarry) {
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
  
  public static boolean isSlotEmpty(int paramInt) {
    return Perry1.u(null, (int)1656563528L ^ 0x17B8E6FE, paramInt);
  }
  
  public static List findEmptySlots(boolean withXCarry) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3517
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3509
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3501
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -1334117684
    //   37: l2i
    //   38: ldc_w -1592468381
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -989030910
    //   48: l2i
    //   49: ldc_w -1411643012
    //   52: ixor
    //   53: ldc2_w -2135687661
    //   56: l2i
    //   57: ldc_w 1007325941
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 3486, -1378399671 -> 45, -764808296 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w 1877551681
    //   108: l2i
    //   109: ldc_w -1313488976
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 1821554485
    //   119: l2i
    //   120: ldc_w 973234138
    //   123: ixor
    //   124: ldc2_w 2015009072
    //   127: l2i
    //   128: ldc_w 211731427
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -1428631774 -> 3418, 636790080 -> 116
    //   160: astore_1
    //   161: getstatic Perryc.c : I
    //   164: iflt -> 178
    //   167: ldc2_w 1249912630
    //   170: l2i
    //   171: ldc_w -2024801832
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w -290566585
    //   181: l2i
    //   182: ldc_w 655736200
    //   185: ixor
    //   186: ldc2_w 2007573797
    //   189: l2i
    //   190: ldc_w -842615928
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 3474, 1943299426 -> 220, 2006992963 -> 178
    //   220: goto -> 224
    //   223: athrow
    //   224: invokestatic getInventoryAndHotbarSlots : ()Ljava/util/Map;
    //   227: goto -> 231
    //   230: athrow
    //   231: getstatic Perryc.0 : I
    //   234: ifle -> 248
    //   237: ldc2_w -813535528
    //   240: l2i
    //   241: ldc_w -1799906757
    //   244: ixor
    //   245: goto -> 256
    //   248: ldc2_w -2029399177
    //   251: l2i
    //   252: ldc_w 158242177
    //   255: ixor
    //   256: ldc2_w -429309622
    //   259: l2i
    //   260: ldc_w -1510899801
    //   263: ixor
    //   264: ixor
    //   265: lookupswitch default -> 292, 414042638 -> 3426, 543558552 -> 248
    //   292: goto -> 296
    //   295: athrow
    //   296: invokeinterface entrySet : ()Ljava/util/Set;
    //   301: goto -> 305
    //   304: athrow
    //   305: getstatic Perryc.1 : I
    //   308: ifeq -> 322
    //   311: ldc2_w 1302044387
    //   314: l2i
    //   315: ldc_w 188747362
    //   318: ixor
    //   319: goto -> 330
    //   322: ldc2_w 738129449
    //   325: l2i
    //   326: ldc_w -485374467
    //   329: ixor
    //   330: ldc2_w -2143343779
    //   333: l2i
    //   334: ldc_w 2007792254
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 3428, -1320631902 -> 322, 1065116407 -> 364
    //   364: goto -> 368
    //   367: athrow
    //   368: invokeinterface iterator : ()Ljava/util/Iterator;
    //   373: goto -> 377
    //   376: athrow
    //   377: getstatic Perryc.c : I
    //   380: iflt -> 394
    //   383: ldc2_w -1795840506
    //   386: l2i
    //   387: ldc_w -1722937135
    //   390: ixor
    //   391: goto -> 402
    //   394: ldc2_w -940281207
    //   397: l2i
    //   398: ldc_w 79932271
    //   401: ixor
    //   402: ldc2_w 1606819581
    //   405: l2i
    //   406: ldc_w 782858318
    //   409: ixor
    //   410: ixor
    //   411: lookupswitch default -> 3452, -1302806699 -> 436, 2094321764 -> 394
    //   436: astore_2
    //   437: getstatic Perryc.1 : I
    //   440: ifeq -> 454
    //   443: ldc2_w 2033915609
    //   446: l2i
    //   447: ldc_w -809006051
    //   450: ixor
    //   451: goto -> 462
    //   454: ldc2_w -547899440
    //   457: l2i
    //   458: ldc_w 802094178
    //   461: ixor
    //   462: ldc2_w 239834715
    //   465: l2i
    //   466: ldc_w -75992279
    //   469: ixor
    //   470: ixor
    //   471: lookupswitch default -> 3432, 95071936 -> 496, 1137672118 -> 454
    //   496: aload_2
    //   497: getstatic Perryc.c : I
    //   500: iflt -> 514
    //   503: ldc2_w 1916279755
    //   506: l2i
    //   507: ldc_w 516933868
    //   510: ixor
    //   511: goto -> 522
    //   514: ldc2_w 722857616
    //   517: l2i
    //   518: ldc_w -1892576
    //   521: ixor
    //   522: ldc2_w 1625094690
    //   525: l2i
    //   526: ldc_w -789055813
    //   529: ixor
    //   530: ixor
    //   531: lookupswitch default -> 3442, -589504578 -> 514, 1692269865 -> 556
    //   556: goto -> 560
    //   559: athrow
    //   560: invokeinterface hasNext : ()Z
    //   565: goto -> 569
    //   568: athrow
    //   569: ifeq -> 583
    //   572: ldc2_w 1774814457
    //   575: l2i
    //   576: ldc_w 1118427365
    //   579: ixor
    //   580: goto -> 591
    //   583: ldc2_w -258771436
    //   586: l2i
    //   587: ldc_w -604820983
    //   590: ixor
    //   591: ldc2_w 171637922
    //   594: l2i
    //   595: ldc_w 1417867912
    //   598: ixor
    //   599: ixor
    //   600: tableswitch default -> 572, 1977111094 -> 624, 1977111095 -> 1667
    //   624: getstatic Perryc.1 : I
    //   627: ifeq -> 641
    //   630: ldc2_w 17996188
    //   633: l2i
    //   634: ldc_w 386581100
    //   637: ixor
    //   638: goto -> 649
    //   641: ldc2_w -516368522
    //   644: l2i
    //   645: ldc_w -2060870345
    //   648: ixor
    //   649: ldc2_w -1334470179
    //   652: l2i
    //   653: ldc_w 2007757231
    //   656: ixor
    //   657: ixor
    //   658: lookupswitch default -> 684, -1473136943 -> 641, -775539838 -> 3458
    //   684: aload_2
    //   685: getstatic Perryc.c : I
    //   688: iflt -> 702
    //   691: ldc2_w -576798558
    //   694: l2i
    //   695: ldc_w 1631723993
    //   698: ixor
    //   699: goto -> 710
    //   702: ldc2_w 1656084813
    //   705: l2i
    //   706: ldc_w -2086199963
    //   709: ixor
    //   710: ldc2_w -289154690
    //   713: l2i
    //   714: ldc_w -833605695
    //   717: ixor
    //   718: ixor
    //   719: lookupswitch default -> 744, -1672538172 -> 3478, 607252917 -> 702
    //   744: goto -> 748
    //   747: athrow
    //   748: invokeinterface next : ()Ljava/lang/Object;
    //   753: goto -> 757
    //   756: athrow
    //   757: checkcast java/util/Map$Entry
    //   760: getstatic Perryc.c : I
    //   763: iflt -> 777
    //   766: ldc2_w 1004958955
    //   769: l2i
    //   770: ldc_w -454295558
    //   773: ixor
    //   774: goto -> 785
    //   777: ldc2_w -144662864
    //   780: l2i
    //   781: ldc_w 1222696031
    //   784: ixor
    //   785: ldc2_w -1903340989
    //   788: l2i
    //   789: ldc_w -408297016
    //   792: ixor
    //   793: ixor
    //   794: lookupswitch default -> 3472, -1238812518 -> 777, -693833372 -> 820
    //   820: astore_3
    //   821: getstatic Perryc.1 : I
    //   824: ifeq -> 838
    //   827: ldc2_w -1391656731
    //   830: l2i
    //   831: ldc_w -1664807857
    //   834: ixor
    //   835: goto -> 846
    //   838: ldc2_w 1964281667
    //   841: l2i
    //   842: ldc_w 1618836105
    //   845: ixor
    //   846: ldc2_w 1897067796
    //   849: l2i
    //   850: ldc_w -1994788690
    //   853: ixor
    //   854: ixor
    //   855: lookupswitch default -> 3444, -909965040 -> 838, -312283024 -> 880
    //   880: aload_3
    //   881: getstatic Perryc.0 : I
    //   884: ifle -> 898
    //   887: ldc2_w 1171122821
    //   890: l2i
    //   891: ldc_w 1793211864
    //   894: ixor
    //   895: goto -> 906
    //   898: ldc2_w 1476382608
    //   901: l2i
    //   902: ldc_w 1328918745
    //   905: ixor
    //   906: ldc2_w -312402357
    //   909: l2i
    //   910: ldc_w -852212759
    //   913: ixor
    //   914: ixor
    //   915: lookupswitch default -> 940, 259689215 -> 3466, 360021795 -> 898
    //   940: goto -> 944
    //   943: athrow
    //   944: invokeinterface getValue : ()Ljava/lang/Object;
    //   949: goto -> 953
    //   952: athrow
    //   953: checkcast net/minecraft/item/ItemStack
    //   956: getstatic Perryc.1 : I
    //   959: ifeq -> 973
    //   962: ldc2_w -717873737
    //   965: l2i
    //   966: ldc_w -740394418
    //   969: ixor
    //   970: goto -> 981
    //   973: ldc2_w 897111922
    //   976: l2i
    //   977: ldc_w 393605892
    //   980: ixor
    //   981: ldc2_w 1344482631
    //   984: l2i
    //   985: ldc_w -2009343209
    //   988: ixor
    //   989: ixor
    //   990: lookupswitch default -> 1016, -554659415 -> 3406, 761284954 -> 973
    //   1016: getfield field_190928_g : Z
    //   1019: ifne -> 1033
    //   1022: ldc2_w 135148424
    //   1025: l2i
    //   1026: ldc_w 471975397
    //   1029: ixor
    //   1030: goto -> 1041
    //   1033: ldc2_w 80006681
    //   1036: l2i
    //   1037: ldc_w 283850871
    //   1040: ixor
    //   1041: ldc2_w -906529469
    //   1044: l2i
    //   1045: ldc_w 1418566179
    //   1048: ixor
    //   1049: ixor
    //   1050: tableswitch default -> 1022, -1990911731 -> 1072, -1990911730 -> 1399
    //   1072: getstatic Perryc.1 : I
    //   1075: ifeq -> 1089
    //   1078: ldc2_w -1993030064
    //   1081: l2i
    //   1082: ldc_w -604570550
    //   1085: ixor
    //   1086: goto -> 1097
    //   1089: ldc2_w -916524466
    //   1092: l2i
    //   1093: ldc_w -750944133
    //   1096: ixor
    //   1097: ldc2_w -1770442313
    //   1100: l2i
    //   1101: ldc_w 1155790211
    //   1104: ixor
    //   1105: ixor
    //   1106: lookupswitch default -> 1132, -2141651410 -> 3470, -2084808002 -> 1089
    //   1132: aload_3
    //   1133: getstatic Perryc.c : I
    //   1136: iflt -> 1150
    //   1139: ldc2_w -180985666
    //   1142: l2i
    //   1143: ldc_w -780505692
    //   1146: ixor
    //   1147: goto -> 1158
    //   1150: ldc2_w 648665736
    //   1153: l2i
    //   1154: ldc_w 2029946317
    //   1157: ixor
    //   1158: ldc2_w 1544690182
    //   1161: l2i
    //   1162: ldc_w -743227911
    //   1165: ixor
    //   1166: ixor
    //   1167: lookupswitch default -> 3440, -1410520347 -> 1150, -772376390 -> 1192
    //   1192: goto -> 1196
    //   1195: athrow
    //   1196: invokeinterface getValue : ()Ljava/lang/Object;
    //   1201: goto -> 1205
    //   1204: athrow
    //   1205: checkcast net/minecraft/item/ItemStack
    //   1208: getstatic Perryc.c : I
    //   1211: iflt -> 1225
    //   1214: ldc2_w 1946771012
    //   1217: l2i
    //   1218: ldc_w 287497502
    //   1221: ixor
    //   1222: goto -> 1233
    //   1225: ldc2_w -194361610
    //   1228: l2i
    //   1229: ldc_w 684057177
    //   1232: ixor
    //   1233: ldc2_w 525464251
    //   1236: l2i
    //   1237: ldc_w -1632630946
    //   1240: ixor
    //   1241: ixor
    //   1242: lookupswitch default -> 1268, -456493377 -> 3446, -426306849 -> 1225
    //   1268: goto -> 1272
    //   1271: athrow
    //   1272: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1275: goto -> 1279
    //   1278: athrow
    //   1279: getstatic Perryc.c : I
    //   1282: iflt -> 1296
    //   1285: ldc2_w -635726031
    //   1288: l2i
    //   1289: ldc_w 790853429
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w 1075578610
    //   1299: l2i
    //   1300: ldc_w 923096006
    //   1303: ixor
    //   1304: ldc2_w -1194160556
    //   1307: l2i
    //   1308: ldc_w -402815898
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 1340, -1441273290 -> 3412, 584135218 -> 1296
    //   1340: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   1343: if_acmpeq -> 1357
    //   1346: ldc2_w -1103754718
    //   1349: l2i
    //   1350: ldc_w -490339620
    //   1353: ixor
    //   1354: goto -> 1365
    //   1357: ldc2_w 1614389954
    //   1360: l2i
    //   1361: ldc_w 1019849275
    //   1364: ixor
    //   1365: ldc2_w 847933881
    //   1368: l2i
    //   1369: ldc_w -1207020244
    //   1372: ixor
    //   1373: ixor
    //   1374: tableswitch default -> 1346, -697029525 -> 1396, -697029524 -> 1399
    //   1396: goto -> 437
    //   1399: getstatic Perryc.1 : I
    //   1402: ifeq -> 1416
    //   1405: ldc2_w 837933215
    //   1408: l2i
    //   1409: ldc_w 192226981
    //   1412: ixor
    //   1413: goto -> 1424
    //   1416: ldc2_w 574722449
    //   1419: l2i
    //   1420: ldc_w -1085214855
    //   1423: ixor
    //   1424: ldc2_w 574558371
    //   1427: l2i
    //   1428: ldc_w 1951903393
    //   1431: ixor
    //   1432: ixor
    //   1433: lookupswitch default -> 3476, -881213206 -> 1460, 1827422264 -> 1416
    //   1460: aload_1
    //   1461: getstatic Perryc.c : I
    //   1464: iflt -> 1478
    //   1467: ldc2_w -1794836288
    //   1470: l2i
    //   1471: ldc_w 1687149645
    //   1474: ixor
    //   1475: goto -> 1486
    //   1478: ldc2_w -1234094854
    //   1481: l2i
    //   1482: ldc_w -597959263
    //   1485: ixor
    //   1486: ldc2_w 1872865369
    //   1489: l2i
    //   1490: ldc_w -978975497
    //   1493: ixor
    //   1494: ixor
    //   1495: lookupswitch default -> 1520, 1535936547 -> 3420, 1917418992 -> 1478
    //   1520: aload_3
    //   1521: getstatic Perryc.c : I
    //   1524: iflt -> 1538
    //   1527: ldc2_w -438535289
    //   1530: l2i
    //   1531: ldc_w -1965670975
    //   1534: ixor
    //   1535: goto -> 1546
    //   1538: ldc2_w -1164224678
    //   1541: l2i
    //   1542: ldc_w 2058538223
    //   1545: ixor
    //   1546: ldc2_w -2008151273
    //   1549: l2i
    //   1550: ldc_w 993020367
    //   1553: ixor
    //   1554: ixor
    //   1555: lookupswitch default -> 3422, -596376418 -> 1538, 1935137133 -> 1580
    //   1580: goto -> 1584
    //   1583: athrow
    //   1584: invokeinterface getKey : ()Ljava/lang/Object;
    //   1589: goto -> 1593
    //   1592: athrow
    //   1593: getstatic Perryc.c : I
    //   1596: iflt -> 1610
    //   1599: ldc2_w 911489688
    //   1602: l2i
    //   1603: ldc_w -1343884453
    //   1606: ixor
    //   1607: goto -> 1618
    //   1610: ldc2_w 119618478
    //   1613: l2i
    //   1614: ldc_w 1616473008
    //   1617: ixor
    //   1618: ldc2_w 2037502770
    //   1621: l2i
    //   1622: ldc_w -1321216088
    //   1625: ixor
    //   1626: ixor
    //   1627: lookupswitch default -> 1652, 1375718745 -> 3484, 1604301166 -> 1610
    //   1652: goto -> 1656
    //   1655: athrow
    //   1656: invokevirtual add : (Ljava/lang/Object;)Z
    //   1659: goto -> 1663
    //   1662: athrow
    //   1663: pop
    //   1664: goto -> 437
    //   1667: getstatic Perryc.0 : I
    //   1670: ifle -> 1684
    //   1673: ldc2_w 983438557
    //   1676: l2i
    //   1677: ldc_w 682863164
    //   1680: ixor
    //   1681: goto -> 1692
    //   1684: ldc2_w 1079729953
    //   1687: l2i
    //   1688: ldc_w -488411133
    //   1691: ixor
    //   1692: ldc2_w -791401088
    //   1695: l2i
    //   1696: ldc_w 1175792734
    //   1699: ixor
    //   1700: ixor
    //   1701: lookupswitch default -> 1728, -2064859329 -> 3456, 363286280 -> 1684
    //   1728: iload_0
    //   1729: ifeq -> 1743
    //   1732: ldc2_w -1684956921
    //   1735: l2i
    //   1736: ldc_w 1053942061
    //   1739: ixor
    //   1740: goto -> 1751
    //   1743: ldc2_w 617729968
    //   1746: l2i
    //   1747: ldc_w -2121156709
    //   1750: ixor
    //   1751: ldc2_w -475426702
    //   1754: l2i
    //   1755: ldc_w 1692336092
    //   1758: ixor
    //   1759: ixor
    //   1760: tableswitch default -> 1732, 574035844 -> 1784, 574035845 -> 3338
    //   1784: ldc2_w 626904873
    //   1787: l2i
    //   1788: ldc_w 626904872
    //   1791: ixor
    //   1792: getstatic Perryc.0 : I
    //   1795: ifle -> 1809
    //   1798: ldc2_w 1350556742
    //   1801: l2i
    //   1802: ldc_w -1540259225
    //   1805: ixor
    //   1806: goto -> 1817
    //   1809: ldc2_w 33012026
    //   1812: l2i
    //   1813: ldc_w -677145797
    //   1816: ixor
    //   1817: ldc2_w -140529535
    //   1820: l2i
    //   1821: ldc_w -913232398
    //   1824: ixor
    //   1825: ixor
    //   1826: lookupswitch default -> 1852, -1569637374 -> 1809, -901725358 -> 3402
    //   1852: istore_2
    //   1853: getstatic Perryc.c : I
    //   1856: iflt -> 1870
    //   1859: ldc2_w 532327072
    //   1862: l2i
    //   1863: ldc_w 2124023699
    //   1866: ixor
    //   1867: goto -> 1878
    //   1870: ldc2_w 1807387331
    //   1873: l2i
    //   1874: ldc_w 743627611
    //   1877: ixor
    //   1878: ldc2_w -815466650
    //   1881: l2i
    //   1882: ldc_w -2130122726
    //   1885: ixor
    //   1886: ixor
    //   1887: lookupswitch default -> 1912, 585048002 -> 1870, 793555535 -> 3416
    //   1912: iload_2
    //   1913: ldc2_w 1908053049
    //   1916: l2i
    //   1917: ldc_w 1908053052
    //   1920: ixor
    //   1921: if_icmpge -> 1935
    //   1924: ldc2_w 1831722311
    //   1927: l2i
    //   1928: ldc_w -2085191296
    //   1931: ixor
    //   1932: goto -> 1943
    //   1935: ldc2_w -1216972141
    //   1938: l2i
    //   1939: ldc_w 1508714071
    //   1942: ixor
    //   1943: ldc2_w -1790178563
    //   1946: l2i
    //   1947: ldc_w -1330619393
    //   1950: ixor
    //   1951: ixor
    //   1952: tableswitch default -> 1924, -882438715 -> 1976, -882438714 -> 3338
    //   1976: getstatic Perryc.1 : I
    //   1979: ifeq -> 1993
    //   1982: ldc2_w -1897106297
    //   1985: l2i
    //   1986: ldc_w -660926874
    //   1989: ixor
    //   1990: goto -> 2001
    //   1993: ldc2_w 917140958
    //   1996: l2i
    //   1997: ldc_w -118996527
    //   2000: ixor
    //   2001: ldc2_w -946632075
    //   2004: l2i
    //   2005: ldc_w -495776184
    //   2008: ixor
    //   2009: ixor
    //   2010: lookupswitch default -> 3480, -341659598 -> 2036, 1939341020 -> 1993
    //   2036: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2039: getstatic Perryc.0 : I
    //   2042: ifle -> 2056
    //   2045: ldc2_w -1147345034
    //   2048: l2i
    //   2049: ldc_w 340696822
    //   2052: ixor
    //   2053: goto -> 2064
    //   2056: ldc2_w 1620109241
    //   2059: l2i
    //   2060: ldc_w 478518613
    //   2063: ixor
    //   2064: ldc2_w -1917167684
    //   2067: l2i
    //   2068: ldc_w 898919766
    //   2071: ixor
    //   2072: ixor
    //   2073: lookupswitch default -> 2100, 402408298 -> 3436, 1296174600 -> 2056
    //   2100: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2103: getstatic Perryc.c : I
    //   2106: iflt -> 2120
    //   2109: ldc2_w 1453131465
    //   2112: l2i
    //   2113: ldc_w 1352030504
    //   2116: ixor
    //   2117: goto -> 2128
    //   2120: ldc2_w 1368432562
    //   2123: l2i
    //   2124: ldc_w 2103366069
    //   2127: ixor
    //   2128: ldc2_w 704410697
    //   2131: l2i
    //   2132: ldc_w 106185427
    //   2135: ixor
    //   2136: ixor
    //   2137: lookupswitch default -> 2164, 429129012 -> 2120, 698575227 -> 3410
    //   2164: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   2167: getstatic Perryc.c : I
    //   2170: iflt -> 2184
    //   2173: ldc2_w -170981423
    //   2176: l2i
    //   2177: ldc_w 1949513243
    //   2180: ixor
    //   2181: goto -> 2192
    //   2184: ldc2_w -1276198033
    //   2187: l2i
    //   2188: ldc_w 506600705
    //   2191: ixor
    //   2192: ldc2_w -2091110118
    //   2195: l2i
    //   2196: ldc_w -1895290807
    //   2199: ixor
    //   2200: ixor
    //   2201: lookupswitch default -> 3404, -1918359399 -> 2184, -1584871619 -> 2228
    //   2228: getfield field_75151_b : Ljava/util/List;
    //   2231: getstatic Perryc.c : I
    //   2234: iflt -> 2248
    //   2237: ldc2_w 1924848453
    //   2240: l2i
    //   2241: ldc_w -856657922
    //   2244: ixor
    //   2245: goto -> 2256
    //   2248: ldc2_w 496579129
    //   2251: l2i
    //   2252: ldc_w 375265775
    //   2255: ixor
    //   2256: ldc2_w 39882016
    //   2259: l2i
    //   2260: ldc_w 1480765038
    //   2263: ixor
    //   2264: ixor
    //   2265: lookupswitch default -> 3488, -462907403 -> 2248, 1373964440 -> 2292
    //   2292: iload_2
    //   2293: getstatic Perryc.0 : I
    //   2296: ifle -> 2310
    //   2299: ldc2_w -1940996501
    //   2302: l2i
    //   2303: ldc_w 44649858
    //   2306: ixor
    //   2307: goto -> 2318
    //   2310: ldc2_w -1059716017
    //   2313: l2i
    //   2314: ldc_w -338841147
    //   2317: ixor
    //   2318: ldc2_w -271091206
    //   2321: l2i
    //   2322: ldc_w 2035042931
    //   2325: ixor
    //   2326: ixor
    //   2327: lookupswitch default -> 2352, -717581639 -> 2310, 410828896 -> 3468
    //   2352: goto -> 2356
    //   2355: athrow
    //   2356: invokeinterface get : (I)Ljava/lang/Object;
    //   2361: goto -> 2365
    //   2364: athrow
    //   2365: checkcast net/minecraft/inventory/Slot
    //   2368: getstatic Perryc.1 : I
    //   2371: ifeq -> 2385
    //   2374: ldc2_w -1094977156
    //   2377: l2i
    //   2378: ldc_w 649147214
    //   2381: ixor
    //   2382: goto -> 2393
    //   2385: ldc2_w -1881097959
    //   2388: l2i
    //   2389: ldc_w 686922274
    //   2392: ixor
    //   2393: ldc2_w -1165112311
    //   2396: l2i
    //   2397: ldc_w 2136794307
    //   2400: ixor
    //   2401: ixor
    //   2402: lookupswitch default -> 2428, -1002961447 -> 2385, 1574691576 -> 3460
    //   2428: astore_3
    //   2429: getstatic Perryc.0 : I
    //   2432: ifle -> 2446
    //   2435: ldc2_w 498008358
    //   2438: l2i
    //   2439: ldc_w -2084427163
    //   2442: ixor
    //   2443: goto -> 2454
    //   2446: ldc2_w -624064128
    //   2449: l2i
    //   2450: ldc_w -729832998
    //   2453: ixor
    //   2454: ldc2_w -1815976334
    //   2457: l2i
    //   2458: ldc_w 11016700
    //   2461: ixor
    //   2462: ixor
    //   2463: lookupswitch default -> 2488, 218584269 -> 3430, 1650995367 -> 2446
    //   2488: aload_3
    //   2489: getstatic Perryc.0 : I
    //   2492: ifle -> 2506
    //   2495: ldc2_w -1415686490
    //   2498: l2i
    //   2499: ldc_w -646282206
    //   2502: ixor
    //   2503: goto -> 2514
    //   2506: ldc2_w -243260915
    //   2509: l2i
    //   2510: ldc_w 1568982338
    //   2513: ixor
    //   2514: ldc2_w -1022673748
    //   2517: l2i
    //   2518: ldc_w -1012716258
    //   2521: ixor
    //   2522: ixor
    //   2523: lookupswitch default -> 2548, 760111785 -> 2506, 1917633334 -> 3448
    //   2548: goto -> 2552
    //   2551: athrow
    //   2552: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   2555: goto -> 2559
    //   2558: athrow
    //   2559: getstatic Perryc.c : I
    //   2562: iflt -> 2576
    //   2565: ldc2_w -469695742
    //   2568: l2i
    //   2569: ldc_w 1018362312
    //   2572: ixor
    //   2573: goto -> 2584
    //   2576: ldc2_w -406019439
    //   2579: l2i
    //   2580: ldc_w -293101741
    //   2583: ixor
    //   2584: ldc2_w -490343607
    //   2587: l2i
    //   2588: ldc_w -1486426998
    //   2591: ixor
    //   2592: ixor
    //   2593: lookupswitch default -> 3462, -1659837175 -> 2576, 1290281473 -> 2620
    //   2620: astore #4
    //   2622: getstatic Perryc.0 : I
    //   2625: ifle -> 2639
    //   2628: ldc2_w -952234390
    //   2631: l2i
    //   2632: ldc_w 1485749581
    //   2635: ixor
    //   2636: goto -> 2647
    //   2639: ldc2_w 1245557323
    //   2642: l2i
    //   2643: ldc_w -1013047776
    //   2646: ixor
    //   2647: ldc2_w -1095176511
    //   2650: l2i
    //   2651: ldc_w -622350204
    //   2654: ixor
    //   2655: ixor
    //   2656: lookupswitch default -> 3482, -302190034 -> 2684, -68162206 -> 2639
    //   2684: aload #4
    //   2686: getstatic Perryc.c : I
    //   2689: iflt -> 2703
    //   2692: ldc2_w -1965048231
    //   2695: l2i
    //   2696: ldc_w 720267719
    //   2699: ixor
    //   2700: goto -> 2711
    //   2703: ldc2_w -1191333622
    //   2706: l2i
    //   2707: ldc_w -1847274922
    //   2710: ixor
    //   2711: ldc2_w -1326142665
    //   2714: l2i
    //   2715: ldc_w -600200330
    //   2718: ixor
    //   2719: ixor
    //   2720: lookupswitch default -> 2748, -855844897 -> 3408, 1628275744 -> 2703
    //   2748: goto -> 2752
    //   2751: athrow
    //   2752: invokevirtual func_190926_b : ()Z
    //   2755: goto -> 2759
    //   2758: athrow
    //   2759: ifne -> 2773
    //   2762: ldc2_w 1280773132
    //   2765: l2i
    //   2766: ldc_w 371954015
    //   2769: ixor
    //   2770: goto -> 2781
    //   2773: ldc2_w 1677222107
    //   2776: l2i
    //   2777: ldc_w 965016969
    //   2780: ixor
    //   2781: ldc2_w 1308768729
    //   2784: l2i
    //   2785: ldc_w 1259768540
    //   2788: ixor
    //   2789: ixor
    //   2790: tableswitch default -> 2762, 1600663126 -> 2812, 1600663127 -> 3067
    //   2812: getstatic Perryc.1 : I
    //   2815: ifeq -> 2829
    //   2818: ldc2_w 1491800884
    //   2821: l2i
    //   2822: ldc_w -1783424726
    //   2825: ixor
    //   2826: goto -> 2837
    //   2829: ldc2_w 2058068981
    //   2832: l2i
    //   2833: ldc_w 1941993723
    //   2836: ixor
    //   2837: ldc2_w -1038377246
    //   2840: l2i
    //   2841: ldc_w -1655352886
    //   2844: ixor
    //   2845: ixor
    //   2846: lookupswitch default -> 2872, -1844001482 -> 3424, 1713358973 -> 2829
    //   2872: aload #4
    //   2874: getstatic Perryc.c : I
    //   2877: iflt -> 2891
    //   2880: ldc2_w 436430892
    //   2883: l2i
    //   2884: ldc_w -340053354
    //   2887: ixor
    //   2888: goto -> 2899
    //   2891: ldc2_w -1162345471
    //   2894: l2i
    //   2895: ldc_w -605564770
    //   2898: ixor
    //   2899: ldc2_w 1399578722
    //   2902: l2i
    //   2903: ldc_w -751615330
    //   2906: ixor
    //   2907: ixor
    //   2908: lookupswitch default -> 3414, -519604637 -> 2936, 1910569030 -> 2891
    //   2936: goto -> 2940
    //   2939: athrow
    //   2940: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   2943: goto -> 2947
    //   2946: athrow
    //   2947: getstatic Perryc.0 : I
    //   2950: ifle -> 2964
    //   2953: ldc2_w 1978208580
    //   2956: l2i
    //   2957: ldc_w -1987508469
    //   2960: ixor
    //   2961: goto -> 2972
    //   2964: ldc2_w 1477513132
    //   2967: l2i
    //   2968: ldc_w -720183809
    //   2971: ixor
    //   2972: ldc2_w 1220759050
    //   2975: l2i
    //   2976: ldc_w -1380756293
    //   2979: ixor
    //   2980: ixor
    //   2981: lookupswitch default -> 3008, 420482302 -> 3454, 1932983234 -> 2964
    //   3008: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   3011: if_acmpeq -> 3025
    //   3014: ldc2_w 358463552
    //   3017: l2i
    //   3018: ldc_w -1276759835
    //   3021: ixor
    //   3022: goto -> 3033
    //   3025: ldc2_w 648171604
    //   3028: l2i
    //   3029: ldc_w -2145789714
    //   3032: ixor
    //   3033: ldc2_w -120696283
    //   3036: l2i
    //   3037: ldc_w 1832959503
    //   3040: ixor
    //   3041: ixor
    //   3042: tableswitch default -> 3014, 859137167 -> 3064, 859137168 -> 3067
    //   3064: goto -> 3332
    //   3067: getstatic Perryc.c : I
    //   3070: iflt -> 3084
    //   3073: ldc2_w -2088351119
    //   3076: l2i
    //   3077: ldc_w -1843308534
    //   3080: ixor
    //   3081: goto -> 3092
    //   3084: ldc2_w -1866871820
    //   3087: l2i
    //   3088: ldc_w -862935380
    //   3091: ixor
    //   3092: ldc2_w -382061964
    //   3095: l2i
    //   3096: ldc_w -1452840468
    //   3099: ixor
    //   3100: ixor
    //   3101: lookupswitch default -> 3128, 1093840631 -> 3084, 1375357411 -> 3490
    //   3128: aload_1
    //   3129: getstatic Perryc.1 : I
    //   3132: ifeq -> 3146
    //   3135: ldc2_w -30117805
    //   3138: l2i
    //   3139: ldc_w 2087681299
    //   3142: ixor
    //   3143: goto -> 3154
    //   3146: ldc2_w -534140133
    //   3149: l2i
    //   3150: ldc_w -2058612159
    //   3153: ixor
    //   3154: ldc2_w -773467377
    //   3157: l2i
    //   3158: ldc_w 1186553940
    //   3161: ixor
    //   3162: ixor
    //   3163: lookupswitch default -> 3188, -2038140634 -> 3146, 352828955 -> 3450
    //   3188: iload_2
    //   3189: getstatic Perryc.1 : I
    //   3192: ifeq -> 3206
    //   3195: ldc2_w 953535089
    //   3198: l2i
    //   3199: ldc_w -1111435227
    //   3202: ixor
    //   3203: goto -> 3214
    //   3206: ldc2_w 1863611389
    //   3209: l2i
    //   3210: ldc_w -1352454753
    //   3213: ixor
    //   3214: ldc2_w 103162656
    //   3217: l2i
    //   3218: ldc_w -1575876859
    //   3221: ixor
    //   3222: ixor
    //   3223: lookupswitch default -> 3248, 555824753 -> 3434, 2041273253 -> 3206
    //   3248: goto -> 3252
    //   3251: athrow
    //   3252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3255: goto -> 3259
    //   3258: athrow
    //   3259: getstatic Perryc.0 : I
    //   3262: ifle -> 3276
    //   3265: ldc2_w 1622987675
    //   3268: l2i
    //   3269: ldc_w 1359298142
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w -1401949501
    //   3279: l2i
    //   3280: ldc_w -1284913162
    //   3283: ixor
    //   3284: ldc2_w 2069189136
    //   3287: l2i
    //   3288: ldc_w 1022287856
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 3438, 1488828629 -> 3320, 1979867173 -> 3276
    //   3320: goto -> 3324
    //   3323: athrow
    //   3324: invokevirtual add : (Ljava/lang/Object;)Z
    //   3327: goto -> 3331
    //   3330: athrow
    //   3331: pop
    //   3332: iinc #2, 1
    //   3335: goto -> 1853
    //   3338: getstatic Perryc.1 : I
    //   3341: ifeq -> 3355
    //   3344: ldc2_w 1193818328
    //   3347: l2i
    //   3348: ldc_w -1695839005
    //   3351: ixor
    //   3352: goto -> 3363
    //   3355: ldc2_w 1472475460
    //   3358: l2i
    //   3359: ldc_w -1854572165
    //   3362: ixor
    //   3363: ldc2_w 1668557449
    //   3366: l2i
    //   3367: ldc_w -1858653666
    //   3370: ixor
    //   3371: ixor
    //   3372: lookupswitch default -> 3400, 796961964 -> 3464, 1926260432 -> 3355
    //   3400: aload_1
    //   3401: areturn
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
    //   3492: pop
    //   3493: goto -> 24
    //   3496: pop
    //   3497: aconst_null
    //   3498: goto -> 3492
    //   3501: dup
    //   3502: ifnull -> 3492
    //   3505: checkcast java/lang/Throwable
    //   3508: athrow
    //   3509: dup
    //   3510: ifnull -> 3496
    //   3513: checkcast java/lang/Throwable
    //   3516: athrow
    //   3517: aconst_null
    //   3518: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   821	843	3	entry	Ljava/util/Map$Entry;
    //   2429	903	3	craftingSlot	Lnet/minecraft/inventory/Slot;
    //   2622	710	4	craftingStack	Lnet/minecraft/item/ItemStack;
    //   1853	1485	2	i	I
    //   24	3378	0	withXCarry	Z
    //   161	3241	1	outPut	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   821	843	3	entry	Ljava/util/Map$Entry<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    //   161	3241	1	outPut	Ljava/util/ArrayList<Ljava/lang/Integer;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	3501	finally
    //   91	98	98	finally
    //   91	98	91	java/lang/AssertionError
    //   91	98	91	finally
    //   91	98	3	java/lang/IndexOutOfBoundsException
    //   92	98	91	java/lang/EnumConstantNotPresentException
    //   223	230	230	finally
    //   223	230	223	java/lang/EnumConstantNotPresentException
    //   223	230	3	java/lang/IllegalStateException
    //   224	230	223	finally
    //   224	230	223	java/lang/IllegalArgumentException
    //   295	304	304	finally
    //   295	304	295	finally
    //   295	304	295	finally
    //   295	304	304	java/lang/ArithmeticException
    //   296	304	304	finally
    //   368	376	376	finally
    //   368	376	3	java/lang/NumberFormatException
    //   368	376	3	java/lang/StringIndexOutOfBoundsException
    //   368	376	376	java/util/NoSuchElementException
    //   368	376	376	finally
    //   559	568	568	finally
    //   559	568	559	java/lang/NullPointerException
    //   560	568	3	finally
    //   560	568	559	finally
    //   560	568	568	finally
    //   747	756	756	finally
    //   747	756	3	finally
    //   747	756	756	java/lang/IndexOutOfBoundsException
    //   747	756	756	java/lang/IndexOutOfBoundsException
    //   748	756	747	finally
    //   943	952	952	finally
    //   943	952	3	java/lang/ArithmeticException
    //   943	952	3	java/lang/AssertionError
    //   943	952	952	finally
    //   944	952	943	finally
    //   1195	1204	1204	finally
    //   1195	1204	1195	finally
    //   1195	1204	1195	java/lang/ClassCastException
    //   1195	1204	3	finally
    //   1196	1204	1204	finally
    //   1271	1278	1278	finally
    //   1271	1278	3	finally
    //   1272	1278	1278	java/lang/ClassCastException
    //   1272	1278	1278	finally
    //   1272	1278	1271	java/lang/IllegalArgumentException
    //   1583	1592	1592	finally
    //   1583	1592	1592	java/lang/ArrayIndexOutOfBoundsException
    //   1584	1592	3	java/lang/NumberFormatException
    //   1584	1592	1583	finally
    //   1584	1592	3	finally
    //   1655	1662	1662	finally
    //   1655	1662	3	java/lang/EnumConstantNotPresentException
    //   1655	1662	3	finally
    //   1655	1662	1655	finally
    //   1656	1662	1662	finally
    //   2355	2364	2364	finally
    //   2355	2364	2355	java/lang/RuntimeException
    //   2356	2364	2355	finally
    //   2356	2364	2364	finally
    //   2356	2364	2355	finally
    //   2551	2558	2558	finally
    //   2551	2558	2551	java/lang/IndexOutOfBoundsException
    //   2551	2558	2558	java/lang/IllegalArgumentException
    //   2552	2558	2558	java/lang/ArrayIndexOutOfBoundsException
    //   2552	2558	2558	finally
    //   2751	2758	2758	finally
    //   2751	2758	2751	java/lang/IndexOutOfBoundsException
    //   2751	2758	2758	finally
    //   2751	2758	2758	java/util/ConcurrentModificationException
    //   2752	2758	3	java/lang/AssertionError
    //   2940	2946	2946	finally
    //   2940	2946	2946	finally
    //   2940	2946	3	finally
    //   2940	2946	3	java/lang/AssertionError
    //   2940	2946	3	java/lang/RuntimeException
    //   3252	3258	3258	finally
    //   3252	3258	3	finally
    //   3252	3258	3	finally
    //   3252	3258	3	java/lang/NumberFormatException
    //   3252	3258	3258	java/lang/NullPointerException
    //   3323	3330	3330	finally
    //   3323	3330	3330	finally
    //   3323	3330	3	finally
    //   3324	3330	3323	finally
    //   3324	3330	3323	finally
    //   3501	3509	3501	finally
    //   3517	3519	3	finally
  }
  
  public static int findItemInventorySlot(Item item, boolean offHand) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/concurrent/atomic/AtomicInteger
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -1361032285
    //   37: l2i
    //   38: ldc_w 1065689137
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 566649980
    //   48: l2i
    //   49: ldc_w -106852736
    //   52: ixor
    //   53: ldc2_w -1090941685
    //   56: l2i
    //   57: ldc_w -618319109
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -213939482 -> 45, -189148062 -> 2336
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w 1186190921
    //   108: l2i
    //   109: ldc_w -313231846
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 527698505
    //   119: l2i
    //   120: ldc_w 66371917
    //   123: ixor
    //   124: ldc2_w 1521275396
    //   127: l2i
    //   128: ldc_w 1165439290
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -1558601096 -> 116, -1271118995 -> 2306
    //   160: astore_2
    //   161: getstatic Perryc.1 : I
    //   164: ifeq -> 178
    //   167: ldc2_w -1705380587
    //   170: l2i
    //   171: ldc_w 331828998
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w -1103637614
    //   181: l2i
    //   182: ldc_w -1127875093
    //   185: ixor
    //   186: ldc2_w -75373590
    //   189: l2i
    //   190: ldc_w 681477215
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 2348, -772978228 -> 220, 1518460326 -> 178
    //   220: aload_2
    //   221: ldc2_w 1581358923
    //   224: l2i
    //   225: ldc_w -1581358924
    //   228: ixor
    //   229: getstatic Perryc.0 : I
    //   232: ifle -> 246
    //   235: ldc2_w -307369718
    //   238: l2i
    //   239: ldc_w -967032163
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w 2010332783
    //   249: l2i
    //   250: ldc_w -1186040985
    //   253: ixor
    //   254: ldc2_w -936318707
    //   257: l2i
    //   258: ldc_w 38697554
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 2320, -510707512 -> 246, 82042455 -> 288
    //   288: goto -> 292
    //   291: athrow
    //   292: invokevirtual set : (I)V
    //   295: goto -> 299
    //   298: athrow
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 316
    //   305: ldc2_w -1513147801
    //   308: l2i
    //   309: ldc_w -572914681
    //   312: ixor
    //   313: goto -> 324
    //   316: ldc2_w -1091195390
    //   319: l2i
    //   320: ldc_w -1356305539
    //   323: ixor
    //   324: ldc2_w 2029654695
    //   327: l2i
    //   328: ldc_w 355181081
    //   331: ixor
    //   332: ixor
    //   333: lookupswitch default -> 360, 365201118 -> 2324, 997715400 -> 316
    //   360: goto -> 364
    //   363: athrow
    //   364: invokestatic getInventoryAndHotbarSlots : ()Ljava/util/Map;
    //   367: goto -> 371
    //   370: athrow
    //   371: getstatic Perryc.0 : I
    //   374: ifle -> 388
    //   377: ldc2_w -1997149842
    //   380: l2i
    //   381: ldc_w 812242369
    //   384: ixor
    //   385: goto -> 396
    //   388: ldc2_w 1947362772
    //   391: l2i
    //   392: ldc_w 1034114509
    //   395: ixor
    //   396: ldc2_w 1623560699
    //   399: l2i
    //   400: ldc_w 524806475
    //   403: ixor
    //   404: ixor
    //   405: lookupswitch default -> 2292, -954317793 -> 388, 909330601 -> 432
    //   432: goto -> 436
    //   435: athrow
    //   436: invokeinterface entrySet : ()Ljava/util/Set;
    //   441: goto -> 445
    //   444: athrow
    //   445: getstatic Perryc.c : I
    //   448: iflt -> 462
    //   451: ldc2_w -2132890491
    //   454: l2i
    //   455: ldc_w -1183488902
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w 510916881
    //   465: l2i
    //   466: ldc_w 1777424711
    //   469: ixor
    //   470: ldc2_w -1502689703
    //   473: l2i
    //   474: ldc_w 1477194314
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 504, -1586766652 -> 462, -943112980 -> 2342
    //   504: goto -> 508
    //   507: athrow
    //   508: invokeinterface iterator : ()Ljava/util/Iterator;
    //   513: goto -> 517
    //   516: athrow
    //   517: getstatic Perryc.c : I
    //   520: iflt -> 534
    //   523: ldc2_w -933125373
    //   526: l2i
    //   527: ldc_w -1577446678
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w 1206804710
    //   537: l2i
    //   538: ldc_w -1885346901
    //   541: ixor
    //   542: ldc2_w -167168681
    //   545: l2i
    //   546: ldc_w 1284598980
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 2332, -754718598 -> 534, 1927928542 -> 576
    //   576: astore_3
    //   577: getstatic Perryc.c : I
    //   580: iflt -> 594
    //   583: ldc2_w 76566006
    //   586: l2i
    //   587: ldc_w 990407268
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w -1050665090
    //   597: l2i
    //   598: ldc_w -1545457364
    //   601: ixor
    //   602: ldc2_w 797961307
    //   605: l2i
    //   606: ldc_w 1997018757
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 2316, 973460620 -> 636, 1730141516 -> 594
    //   636: aload_3
    //   637: getstatic Perryc.1 : I
    //   640: ifeq -> 654
    //   643: ldc2_w -1433369221
    //   646: l2i
    //   647: ldc_w 375061424
    //   650: ixor
    //   651: goto -> 662
    //   654: ldc2_w -1813434733
    //   657: l2i
    //   658: ldc_w -1763761840
    //   661: ixor
    //   662: ldc2_w 764488470
    //   665: l2i
    //   666: ldc_w 1893979222
    //   669: ixor
    //   670: ixor
    //   671: lookupswitch default -> 696, -508001909 -> 2330, 1252170314 -> 654
    //   696: goto -> 700
    //   699: athrow
    //   700: invokeinterface hasNext : ()Z
    //   705: goto -> 709
    //   708: athrow
    //   709: ifeq -> 723
    //   712: ldc2_w -1731974454
    //   715: l2i
    //   716: ldc_w 519610785
    //   719: ixor
    //   720: goto -> 731
    //   723: ldc2_w -1443085876
    //   726: l2i
    //   727: ldc_w 801163942
    //   730: ixor
    //   731: ldc2_w 2048811566
    //   734: l2i
    //   735: ldc_w 1895992351
    //   738: ixor
    //   739: ixor
    //   740: tableswitch default -> 712, -1927256742 -> 764, -1927256741 -> 2160
    //   764: getstatic Perryc.c : I
    //   767: iflt -> 781
    //   770: ldc2_w 1801412250
    //   773: l2i
    //   774: ldc_w -1660128036
    //   777: ixor
    //   778: goto -> 789
    //   781: ldc2_w 1813602275
    //   784: l2i
    //   785: ldc_w -1430891037
    //   788: ixor
    //   789: ldc2_w 383940428
    //   792: l2i
    //   793: ldc_w -1200751843
    //   796: ixor
    //   797: ixor
    //   798: lookupswitch default -> 2328, 1490855447 -> 781, 1746962001 -> 824
    //   824: aload_3
    //   825: getstatic Perryc.1 : I
    //   828: ifeq -> 842
    //   831: ldc2_w -2111745033
    //   834: l2i
    //   835: ldc_w -1987584197
    //   838: ixor
    //   839: goto -> 850
    //   842: ldc2_w -1187003374
    //   845: l2i
    //   846: ldc_w 882294904
    //   849: ixor
    //   850: ldc2_w -297487250
    //   853: l2i
    //   854: ldc_w -1392379418
    //   857: ixor
    //   858: ixor
    //   859: lookupswitch default -> 884, 1222885700 -> 2310, 1667606238 -> 842
    //   884: goto -> 888
    //   887: athrow
    //   888: invokeinterface next : ()Ljava/lang/Object;
    //   893: goto -> 897
    //   896: athrow
    //   897: checkcast java/util/Map$Entry
    //   900: getstatic Perryc.c : I
    //   903: iflt -> 917
    //   906: ldc2_w -951341619
    //   909: l2i
    //   910: ldc_w 1443523910
    //   913: ixor
    //   914: goto -> 925
    //   917: ldc2_w -1364723778
    //   920: l2i
    //   921: ldc_w 1208813024
    //   924: ixor
    //   925: ldc2_w 199732716
    //   928: l2i
    //   929: ldc_w -744056977
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, 157158818 -> 917, 1224800776 -> 2294
    //   960: astore #4
    //   962: getstatic Perryc.1 : I
    //   965: ifeq -> 979
    //   968: ldc2_w 738580029
    //   971: l2i
    //   972: ldc_w 863543550
    //   975: ixor
    //   976: goto -> 987
    //   979: ldc2_w 1163668961
    //   982: l2i
    //   983: ldc_w 428741386
    //   986: ixor
    //   987: ldc2_w -907483007
    //   990: l2i
    //   991: ldc_w 1595410930
    //   994: ixor
    //   995: ixor
    //   996: lookupswitch default -> 2346, -1987209296 -> 979, -903684200 -> 1024
    //   1024: aload #4
    //   1026: getstatic Perryc.0 : I
    //   1029: ifle -> 1043
    //   1032: ldc2_w -660734509
    //   1035: l2i
    //   1036: ldc_w -1456834450
    //   1039: ixor
    //   1040: goto -> 1051
    //   1043: ldc2_w -933765148
    //   1046: l2i
    //   1047: ldc_w 801026279
    //   1050: ixor
    //   1051: ldc2_w 809962429
    //   1054: l2i
    //   1055: ldc_w -330889307
    //   1058: ixor
    //   1059: ixor
    //   1060: lookupswitch default -> 2334, -1380480603 -> 1043, 1005151003 -> 1088
    //   1088: goto -> 1092
    //   1091: athrow
    //   1092: invokeinterface getValue : ()Ljava/lang/Object;
    //   1097: goto -> 1101
    //   1100: athrow
    //   1101: checkcast net/minecraft/item/ItemStack
    //   1104: getstatic Perryc.1 : I
    //   1107: ifeq -> 1121
    //   1110: ldc2_w 116956730
    //   1113: l2i
    //   1114: ldc_w 1292732336
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w -1864236455
    //   1124: l2i
    //   1125: ldc_w -1487410683
    //   1128: ixor
    //   1129: ldc2_w 318380886
    //   1132: l2i
    //   1133: ldc_w -1718819150
    //   1136: ixor
    //   1137: ixor
    //   1138: lookupswitch default -> 2326, -1128065608 -> 1164, -1065098130 -> 1121
    //   1164: goto -> 1168
    //   1167: athrow
    //   1168: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1171: goto -> 1175
    //   1174: athrow
    //   1175: getstatic Perryc.c : I
    //   1178: iflt -> 1192
    //   1181: ldc2_w -1030914510
    //   1184: l2i
    //   1185: ldc_w 2075811737
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w -252626584
    //   1195: l2i
    //   1196: ldc_w 713654442
    //   1199: ixor
    //   1200: ldc2_w 771438266
    //   1203: l2i
    //   1204: ldc_w -1122794275
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 2302, 702518220 -> 1192, 1250954149 -> 1236
    //   1236: aload_0
    //   1237: if_acmpne -> 1251
    //   1240: ldc2_w -207032268
    //   1243: l2i
    //   1244: ldc_w -1922707726
    //   1247: ixor
    //   1248: goto -> 1259
    //   1251: ldc2_w -1577372697
    //   1254: l2i
    //   1255: ldc_w -550105824
    //   1258: ixor
    //   1259: ldc2_w 1998681303
    //   1262: l2i
    //   1263: ldc_w 662480793
    //   1266: ixor
    //   1267: ixor
    //   1268: tableswitch default -> 1240, 781249928 -> 1292, 781249929 -> 577
    //   1292: getstatic Perryc.c : I
    //   1295: iflt -> 1309
    //   1298: ldc2_w 763316140
    //   1301: l2i
    //   1302: ldc_w 423357875
    //   1305: ixor
    //   1306: goto -> 1317
    //   1309: ldc2_w -1911065373
    //   1312: l2i
    //   1313: ldc_w -701560744
    //   1316: ixor
    //   1317: ldc2_w -949460070
    //   1320: l2i
    //   1321: ldc_w 962184070
    //   1324: ixor
    //   1325: ixor
    //   1326: lookupswitch default -> 2338, -1509303129 -> 1352, -898299389 -> 1309
    //   1352: aload #4
    //   1354: getstatic Perryc.c : I
    //   1357: iflt -> 1371
    //   1360: ldc2_w -132370923
    //   1363: l2i
    //   1364: ldc_w -1266748857
    //   1367: ixor
    //   1368: goto -> 1379
    //   1371: ldc2_w 688056218
    //   1374: l2i
    //   1375: ldc_w -1835298067
    //   1378: ixor
    //   1379: ldc2_w -1588733384
    //   1382: l2i
    //   1383: ldc_w 1812797814
    //   1386: ixor
    //   1387: ixor
    //   1388: lookupswitch default -> 1416, -2128470244 -> 2344, 98533391 -> 1371
    //   1416: goto -> 1420
    //   1419: athrow
    //   1420: invokeinterface getKey : ()Ljava/lang/Object;
    //   1425: goto -> 1429
    //   1428: athrow
    //   1429: checkcast java/lang/Integer
    //   1432: getstatic Perryc.c : I
    //   1435: iflt -> 1449
    //   1438: ldc2_w -1352689497
    //   1441: l2i
    //   1442: ldc_w 6176003
    //   1445: ixor
    //   1446: goto -> 1457
    //   1449: ldc2_w -1717388654
    //   1452: l2i
    //   1453: ldc_w 316818092
    //   1456: ixor
    //   1457: ldc2_w -1985847088
    //   1460: l2i
    //   1461: ldc_w 666904808
    //   1464: ixor
    //   1465: ixor
    //   1466: lookupswitch default -> 1492, -2144221474 -> 1449, 23326108 -> 2318
    //   1492: goto -> 1496
    //   1495: athrow
    //   1496: invokevirtual intValue : ()I
    //   1499: goto -> 1503
    //   1502: athrow
    //   1503: ldc2_w -1300075483
    //   1506: l2i
    //   1507: ldc_w -1300075512
    //   1510: ixor
    //   1511: if_icmpne -> 1525
    //   1514: ldc2_w 1378791102
    //   1517: l2i
    //   1518: ldc_w -1647219649
    //   1521: ixor
    //   1522: goto -> 1533
    //   1525: ldc2_w -848231436
    //   1528: l2i
    //   1529: ldc_w 42910068
    //   1532: ixor
    //   1533: ldc2_w 1850325840
    //   1536: l2i
    //   1537: ldc_w 2145549083
    //   1540: ixor
    //   1541: ixor
    //   1542: tableswitch default -> 1514, -564919606 -> 1564, -564919605 -> 1683
    //   1564: getstatic Perryc.1 : I
    //   1567: ifeq -> 1581
    //   1570: ldc2_w -1089472537
    //   1573: l2i
    //   1574: ldc_w 955786713
    //   1577: ixor
    //   1578: goto -> 1589
    //   1581: ldc2_w 1656120892
    //   1584: l2i
    //   1585: ldc_w 94989891
    //   1588: ixor
    //   1589: ldc2_w -2038583863
    //   1592: l2i
    //   1593: ldc_w 1534649532
    //   1596: ixor
    //   1597: ixor
    //   1598: lookupswitch default -> 2296, -1172684534 -> 1624, 1525848907 -> 1581
    //   1624: iload_1
    //   1625: ifne -> 1639
    //   1628: ldc2_w -871562243
    //   1631: l2i
    //   1632: ldc_w 2073226179
    //   1635: ixor
    //   1636: goto -> 1647
    //   1639: ldc2_w -613485533
    //   1642: l2i
    //   1643: ldc_w 1827740700
    //   1646: ixor
    //   1647: ldc2_w -1078586844
    //   1650: l2i
    //   1651: ldc_w -200798900
    //   1654: ixor
    //   1655: ixor
    //   1656: tableswitch default -> 1628, -64882858 -> 1680, -64882857 -> 1683
    //   1680: goto -> 577
    //   1683: getstatic Perryc.1 : I
    //   1686: ifeq -> 1700
    //   1689: ldc2_w -116489193
    //   1692: l2i
    //   1693: ldc_w 1936576077
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w 242198813
    //   1703: l2i
    //   1704: ldc_w -512477968
    //   1707: ixor
    //   1708: ldc2_w 245615280
    //   1711: l2i
    //   1712: ldc_w -1216826468
    //   1715: ixor
    //   1716: ixor
    //   1717: lookupswitch default -> 2312, 867709814 -> 1700, 1455482049 -> 1744
    //   1744: aload_2
    //   1745: getstatic Perryc.1 : I
    //   1748: ifeq -> 1762
    //   1751: ldc2_w 1780413182
    //   1754: l2i
    //   1755: ldc_w -1290720548
    //   1758: ixor
    //   1759: goto -> 1770
    //   1762: ldc2_w 597835157
    //   1765: l2i
    //   1766: ldc_w 197212976
    //   1769: ixor
    //   1770: ldc2_w -524965266
    //   1773: l2i
    //   1774: ldc_w -1895572016
    //   1777: ixor
    //   1778: ixor
    //   1779: lookupswitch default -> 2340, -1229344868 -> 1762, 1205170459 -> 1804
    //   1804: aload #4
    //   1806: getstatic Perryc.1 : I
    //   1809: ifeq -> 1823
    //   1812: ldc2_w 29767020
    //   1815: l2i
    //   1816: ldc_w 1567366691
    //   1819: ixor
    //   1820: goto -> 1831
    //   1823: ldc2_w -87272274
    //   1826: l2i
    //   1827: ldc_w 165456609
    //   1830: ixor
    //   1831: ldc2_w -1137291864
    //   1834: l2i
    //   1835: ldc_w 261042493
    //   1838: ixor
    //   1839: ixor
    //   1840: lookupswitch default -> 2308, -283944998 -> 1823, 1084850906 -> 1868
    //   1868: goto -> 1872
    //   1871: athrow
    //   1872: invokeinterface getKey : ()Ljava/lang/Object;
    //   1877: goto -> 1881
    //   1880: athrow
    //   1881: checkcast java/lang/Integer
    //   1884: getstatic Perryc.c : I
    //   1887: iflt -> 1901
    //   1890: ldc2_w -755630576
    //   1893: l2i
    //   1894: ldc_w 2126907090
    //   1897: ixor
    //   1898: goto -> 1909
    //   1901: ldc2_w 191647483
    //   1904: l2i
    //   1905: ldc_w -1787174163
    //   1908: ixor
    //   1909: ldc2_w 1432170303
    //   1912: l2i
    //   1913: ldc_w 618689875
    //   1916: ixor
    //   1917: ixor
    //   1918: lookupswitch default -> 1944, -577854802 -> 2322, 323291143 -> 1901
    //   1944: goto -> 1948
    //   1947: athrow
    //   1948: invokevirtual intValue : ()I
    //   1951: goto -> 1955
    //   1954: athrow
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w 1536199295
    //   1964: l2i
    //   1965: ldc_w -943891829
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 1502110842
    //   1975: l2i
    //   1976: ldc_w 2132764279
    //   1979: ixor
    //   1980: ldc2_w -946508629
    //   1983: l2i
    //   1984: ldc_w 1424805964
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 2350, -1242644758 -> 2016, 257190931 -> 1972
    //   2016: goto -> 2020
    //   2019: athrow
    //   2020: invokevirtual set : (I)V
    //   2023: goto -> 2027
    //   2026: athrow
    //   2027: getstatic Perryc.1 : I
    //   2030: ifeq -> 2044
    //   2033: ldc2_w 1266776459
    //   2036: l2i
    //   2037: ldc_w 59017044
    //   2040: ixor
    //   2041: goto -> 2052
    //   2044: ldc2_w -720794645
    //   2047: l2i
    //   2048: ldc_w -724666314
    //   2051: ixor
    //   2052: ldc2_w 1410825240
    //   2055: l2i
    //   2056: ldc_w -2101698324
    //   2059: ixor
    //   2060: ixor
    //   2061: lookupswitch default -> 2298, -1633148373 -> 2044, -680906967 -> 2088
    //   2088: aload_2
    //   2089: getstatic Perryc.1 : I
    //   2092: ifeq -> 2106
    //   2095: ldc2_w -584804703
    //   2098: l2i
    //   2099: ldc_w -1330501483
    //   2102: ixor
    //   2103: goto -> 2114
    //   2106: ldc2_w 382600934
    //   2109: l2i
    //   2110: ldc_w -1262502640
    //   2113: ixor
    //   2114: ldc2_w 65770362
    //   2117: l2i
    //   2118: ldc_w -1912051167
    //   2121: ixor
    //   2122: ixor
    //   2123: lookupswitch default -> 2148, -1130978971 -> 2106, -529184913 -> 2314
    //   2148: goto -> 2152
    //   2151: athrow
    //   2152: invokevirtual get : ()I
    //   2155: goto -> 2159
    //   2158: athrow
    //   2159: ireturn
    //   2160: getstatic Perryc.0 : I
    //   2163: ifle -> 2177
    //   2166: ldc2_w 1594703509
    //   2169: l2i
    //   2170: ldc_w 591500456
    //   2173: ixor
    //   2174: goto -> 2185
    //   2177: ldc2_w 1518012656
    //   2180: l2i
    //   2181: ldc_w -597853722
    //   2184: ixor
    //   2185: ldc2_w 1042323685
    //   2188: l2i
    //   2189: ldc_w -1660115474
    //   2192: ixor
    //   2193: ixor
    //   2194: lookupswitch default -> 2300, -547317962 -> 2177, 621431837 -> 2220
    //   2220: aload_2
    //   2221: getstatic Perryc.c : I
    //   2224: iflt -> 2238
    //   2227: ldc2_w 1839128424
    //   2230: l2i
    //   2231: ldc_w 553035367
    //   2234: ixor
    //   2235: goto -> 2246
    //   2238: ldc2_w 1068116583
    //   2241: l2i
    //   2242: ldc_w -1016899043
    //   2245: ixor
    //   2246: ldc2_w -1118022759
    //   2249: l2i
    //   2250: ldc_w 573043265
    //   2253: ixor
    //   2254: ixor
    //   2255: lookupswitch default -> 2304, -770451241 -> 2238, 1672663458 -> 2280
    //   2280: goto -> 2284
    //   2283: athrow
    //   2284: invokevirtual get : ()I
    //   2287: goto -> 2291
    //   2290: athrow
    //   2291: ireturn
    //   2292: aconst_null
    //   2293: athrow
    //   2294: aconst_null
    //   2295: athrow
    //   2296: aconst_null
    //   2297: athrow
    //   2298: aconst_null
    //   2299: athrow
    //   2300: aconst_null
    //   2301: athrow
    //   2302: aconst_null
    //   2303: athrow
    //   2304: aconst_null
    //   2305: athrow
    //   2306: aconst_null
    //   2307: athrow
    //   2308: aconst_null
    //   2309: athrow
    //   2310: aconst_null
    //   2311: athrow
    //   2312: aconst_null
    //   2313: athrow
    //   2314: aconst_null
    //   2315: athrow
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
    //   2352: pop
    //   2353: goto -> 24
    //   2356: pop
    //   2357: aconst_null
    //   2358: goto -> 2352
    //   2361: dup
    //   2362: ifnull -> 2352
    //   2365: checkcast java/lang/Throwable
    //   2368: athrow
    //   2369: dup
    //   2370: ifnull -> 2356
    //   2373: checkcast java/lang/Throwable
    //   2376: athrow
    //   2377: aconst_null
    //   2378: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   962	1198	4	entry	Ljava/util/Map$Entry;
    //   24	2268	0	item	Lnet/minecraft/item/Item;
    //   24	2268	1	offHand	Z
    //   161	2131	2	slot	Ljava/util/concurrent/atomic/AtomicInteger;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   962	1198	4	entry	Ljava/util/Map$Entry<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2361	finally
    //   91	98	98	finally
    //   91	98	91	java/lang/IllegalStateException
    //   92	98	98	java/lang/StringIndexOutOfBoundsException
    //   92	98	3	java/lang/UnsupportedOperationException
    //   92	98	91	finally
    //   292	298	298	finally
    //   292	298	3	finally
    //   292	298	298	finally
    //   292	298	3	java/lang/StringIndexOutOfBoundsException
    //   292	298	3	java/lang/ClassCastException
    //   363	370	370	finally
    //   363	370	3	java/lang/ClassCastException
    //   363	370	363	finally
    //   363	370	3	finally
    //   364	370	363	finally
    //   435	444	444	finally
    //   435	444	3	finally
    //   435	444	3	java/lang/ArithmeticException
    //   435	444	435	finally
    //   436	444	444	java/lang/UnsupportedOperationException
    //   507	516	516	finally
    //   507	516	507	finally
    //   507	516	507	java/lang/NullPointerException
    //   508	516	516	finally
    //   508	516	507	finally
    //   699	708	708	finally
    //   699	708	699	java/lang/IndexOutOfBoundsException
    //   699	708	3	finally
    //   699	708	708	finally
    //   699	708	3	java/lang/UnsupportedOperationException
    //   887	896	896	finally
    //   887	896	887	finally
    //   887	896	3	finally
    //   887	896	3	java/lang/ArrayIndexOutOfBoundsException
    //   888	896	887	java/lang/IllegalStateException
    //   1091	1100	1100	finally
    //   1091	1100	3	java/lang/ClassCastException
    //   1091	1100	3	java/lang/AssertionError
    //   1092	1100	1091	java/util/NoSuchElementException
    //   1092	1100	3	finally
    //   1168	1174	1174	finally
    //   1168	1174	3	finally
    //   1168	1174	3	java/util/NoSuchElementException
    //   1168	1174	1174	finally
    //   1168	1174	3	finally
    //   1420	1428	1428	finally
    //   1420	1428	1428	java/lang/UnsupportedOperationException
    //   1420	1428	1428	java/lang/ArithmeticException
    //   1420	1428	3	finally
    //   1420	1428	3	java/lang/StringIndexOutOfBoundsException
    //   1495	1502	1502	finally
    //   1495	1502	1495	java/lang/IndexOutOfBoundsException
    //   1495	1502	1495	finally
    //   1495	1502	1502	finally
    //   1496	1502	3	finally
    //   1872	1880	1880	finally
    //   1872	1880	3	java/lang/IllegalStateException
    //   1872	1880	3	finally
    //   1872	1880	1880	java/lang/IllegalStateException
    //   1872	1880	1880	finally
    //   1947	1954	1954	finally
    //   1947	1954	1954	finally
    //   1948	1954	1947	finally
    //   1948	1954	1947	finally
    //   1948	1954	1954	finally
    //   2019	2026	2026	finally
    //   2019	2026	2026	java/lang/RuntimeException
    //   2019	2026	3	java/lang/ArrayIndexOutOfBoundsException
    //   2019	2026	2019	finally
    //   2020	2026	3	java/lang/UnsupportedOperationException
    //   2151	2158	2158	finally
    //   2151	2158	2151	finally
    //   2152	2158	2158	finally
    //   2152	2158	2151	java/lang/ArithmeticException
    //   2152	2158	3	finally
    //   2283	2290	2290	finally
    //   2283	2290	3	finally
    //   2283	2290	2290	finally
    //   2284	2290	2283	java/lang/StringIndexOutOfBoundsException
    //   2284	2290	3	java/lang/UnsupportedOperationException
    //   2361	2369	2361	java/util/NoSuchElementException
    //   2377	2379	3	finally
  }
  
  public static Map getInventorySlots(int currentI, int last) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1245
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1237
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1229
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/HashMap
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 2133969153
    //   37: l2i
    //   38: ldc_w 1009011199
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -740488263
    //   48: l2i
    //   49: ldc_w -112037314
    //   52: ixor
    //   53: ldc2_w 1052328567
    //   56: l2i
    //   57: ldc_w 1462642272
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -253015735 -> 45, 713221353 -> 1210
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w 2054802089
    //   108: l2i
    //   109: ldc_w 552850112
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1311309349
    //   119: l2i
    //   120: ldc_w 1025536466
    //   123: ixor
    //   124: ldc2_w -1513182608
    //   127: l2i
    //   128: ldc_w -729400800
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 1202, -37756839 -> 160, 734169145 -> 116
    //   160: astore_2
    //   161: getstatic Perryc.c : I
    //   164: iflt -> 178
    //   167: ldc2_w 1719590223
    //   170: l2i
    //   171: ldc_w 1181386571
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 1592033427
    //   181: l2i
    //   182: ldc_w 775323909
    //   185: ixor
    //   186: ldc2_w -2101646965
    //   189: l2i
    //   190: ldc_w -679721201
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 1214, 622145298 -> 220, 1976792192 -> 178
    //   220: iload_0
    //   221: getstatic Perryc.0 : I
    //   224: ifle -> 238
    //   227: ldc2_w -1558212832
    //   230: l2i
    //   231: ldc_w 1949572209
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w 1395458941
    //   241: l2i
    //   242: ldc_w -24600229
    //   245: ixor
    //   246: ldc2_w -1974751524
    //   249: l2i
    //   250: ldc_w 814027403
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 1196, 392896113 -> 280, 1843736326 -> 238
    //   280: istore_3
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 298
    //   287: ldc2_w -2049525640
    //   290: l2i
    //   291: ldc_w -772113824
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w -1135363741
    //   301: l2i
    //   302: ldc_w 1960260560
    //   305: ixor
    //   306: ldc2_w 1872223484
    //   309: l2i
    //   310: ldc_w 323631072
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, 686893316 -> 1204, 1644338463 -> 298
    //   340: iload_3
    //   341: getstatic Perryc.c : I
    //   344: iflt -> 358
    //   347: ldc2_w -361499996
    //   350: l2i
    //   351: ldc_w -1775356739
    //   354: ixor
    //   355: goto -> 366
    //   358: ldc2_w -555803882
    //   361: l2i
    //   362: ldc_w -466608813
    //   365: ixor
    //   366: ldc2_w -629943461
    //   369: l2i
    //   370: ldc_w -292128893
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 1186, 235578013 -> 400, 1220043457 -> 358
    //   400: iload_1
    //   401: if_icmpgt -> 415
    //   404: ldc2_w -924808576
    //   407: l2i
    //   408: ldc_w -322984973
    //   411: ixor
    //   412: goto -> 423
    //   415: ldc2_w 1283179559
    //   418: l2i
    //   419: ldc_w 1747250507
    //   422: ixor
    //   423: ldc2_w 1717160667
    //   426: l2i
    //   427: ldc_w 874945703
    //   430: ixor
    //   431: ixor
    //   432: tableswitch default -> 404, 1981841167 -> 456, 1981841168 -> 1122
    //   456: getstatic Perryc.c : I
    //   459: iflt -> 473
    //   462: ldc2_w 163494151
    //   465: l2i
    //   466: ldc_w 1433776600
    //   469: ixor
    //   470: goto -> 481
    //   473: ldc2_w 871846937
    //   476: l2i
    //   477: ldc_w -691581589
    //   480: ixor
    //   481: ldc2_w 108518960
    //   484: l2i
    //   485: ldc_w 15674204
    //   488: ixor
    //   489: ixor
    //   490: lookupswitch default -> 516, 1515453875 -> 1206, 2058825677 -> 473
    //   516: aload_2
    //   517: getstatic Perryc.0 : I
    //   520: ifle -> 534
    //   523: ldc2_w -93745940
    //   526: l2i
    //   527: ldc_w -2055329414
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w -526322124
    //   537: l2i
    //   538: ldc_w -1178400173
    //   541: ixor
    //   542: ldc2_w -1240824338
    //   545: l2i
    //   546: ldc_w 1995605253
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 1216, -1717830516 -> 576, -1074813571 -> 534
    //   576: iload_3
    //   577: getstatic Perryc.1 : I
    //   580: ifeq -> 594
    //   583: ldc2_w -43785791
    //   586: l2i
    //   587: ldc_w -912480572
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w -978171878
    //   597: l2i
    //   598: ldc_w -570241092
    //   601: ixor
    //   602: ldc2_w -1613702810
    //   605: l2i
    //   606: ldc_w -23916210
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 636, -1034982539 -> 594, 1438420781 -> 1218
    //   636: goto -> 640
    //   639: athrow
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: goto -> 647
    //   646: athrow
    //   647: getstatic Perryc.1 : I
    //   650: ifeq -> 664
    //   653: ldc2_w -1801528859
    //   656: l2i
    //   657: ldc_w -656729182
    //   660: ixor
    //   661: goto -> 672
    //   664: ldc2_w 1500075480
    //   667: l2i
    //   668: ldc_w 285932005
    //   671: ixor
    //   672: ldc2_w 1629533859
    //   675: l2i
    //   676: ldc_w -282275237
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 1190, -1035360577 -> 664, -965752635 -> 708
    //   708: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   711: getstatic Perryc.0 : I
    //   714: ifle -> 728
    //   717: ldc2_w -342320695
    //   720: l2i
    //   721: ldc_w 1597262928
    //   724: ixor
    //   725: goto -> 736
    //   728: ldc2_w -2082009323
    //   731: l2i
    //   732: ldc_w -1832835188
    //   735: ixor
    //   736: ldc2_w 904565624
    //   739: l2i
    //   740: ldc_w 491242926
    //   743: ixor
    //   744: ixor
    //   745: lookupswitch default -> 1192, -1677622449 -> 728, 965443151 -> 772
    //   772: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 792
    //   781: ldc2_w 105446077
    //   784: l2i
    //   785: ldc_w -693211435
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w -1863078565
    //   795: l2i
    //   796: ldc_w -1202627441
    //   799: ixor
    //   800: ldc2_w -84084658
    //   803: l2i
    //   804: ldc_w 239167506
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 836, -549481076 -> 792, 609944628 -> 1200
    //   836: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   839: getstatic Perryc.0 : I
    //   842: ifle -> 856
    //   845: ldc2_w 2056816125
    //   848: l2i
    //   849: ldc_w -194399445
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w -173231045
    //   859: l2i
    //   860: ldc_w -928915148
    //   863: ixor
    //   864: ldc2_w 1739415588
    //   867: l2i
    //   868: ldc_w -1813646953
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 1208, -918174532 -> 900, 2058987365 -> 856
    //   900: goto -> 904
    //   903: athrow
    //   904: invokevirtual func_75138_a : ()Lnet/minecraft/util/NonNullList;
    //   907: goto -> 911
    //   910: athrow
    //   911: getstatic Perryc.0 : I
    //   914: ifle -> 928
    //   917: ldc2_w -1221574576
    //   920: l2i
    //   921: ldc_w 988479473
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w 1569723112
    //   931: l2i
    //   932: ldc_w 474973357
    //   935: ixor
    //   936: ldc2_w 1520654616
    //   939: l2i
    //   940: ldc_w 1998534634
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 972, -1603874477 -> 1188, -588892112 -> 928
    //   972: iload_3
    //   973: getstatic Perryc.0 : I
    //   976: ifle -> 990
    //   979: ldc2_w 1675457948
    //   982: l2i
    //   983: ldc_w 2025608290
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w 480523552
    //   993: l2i
    //   994: ldc_w -1524476933
    //   997: ixor
    //   998: ldc2_w 717288071
    //   1001: l2i
    //   1002: ldc_w 1032842005
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 1212, -1362526391 -> 1032, 204355692 -> 990
    //   1032: goto -> 1036
    //   1035: athrow
    //   1036: invokevirtual get : (I)Ljava/lang/Object;
    //   1039: goto -> 1043
    //   1042: athrow
    //   1043: getstatic Perryc.0 : I
    //   1046: ifle -> 1060
    //   1049: ldc2_w -1482632993
    //   1052: l2i
    //   1053: ldc_w -166804932
    //   1056: ixor
    //   1057: goto -> 1068
    //   1060: ldc2_w -571312397
    //   1063: l2i
    //   1064: ldc_w -356398346
    //   1067: ixor
    //   1068: ldc2_w -2135830493
    //   1071: l2i
    //   1072: ldc_w -1808603171
    //   1075: ixor
    //   1076: ixor
    //   1077: lookupswitch default -> 1198, 598772731 -> 1104, 1160586525 -> 1060
    //   1104: goto -> 1108
    //   1107: athrow
    //   1108: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1111: goto -> 1115
    //   1114: athrow
    //   1115: pop
    //   1116: iinc #3, 1
    //   1119: goto -> 281
    //   1122: getstatic Perryc.1 : I
    //   1125: ifeq -> 1139
    //   1128: ldc2_w -514454261
    //   1131: l2i
    //   1132: ldc_w 1330708682
    //   1135: ixor
    //   1136: goto -> 1147
    //   1139: ldc2_w -2123664381
    //   1142: l2i
    //   1143: ldc_w 524381362
    //   1146: ixor
    //   1147: ldc2_w -1817089335
    //   1150: l2i
    //   1151: ldc_w 503623586
    //   1154: ixor
    //   1155: ixor
    //   1156: lookupswitch default -> 1194, 329244122 -> 1184, 598919338 -> 1139
    //   1184: aload_2
    //   1185: areturn
    //   1186: aconst_null
    //   1187: athrow
    //   1188: aconst_null
    //   1189: athrow
    //   1190: aconst_null
    //   1191: athrow
    //   1192: aconst_null
    //   1193: athrow
    //   1194: aconst_null
    //   1195: athrow
    //   1196: aconst_null
    //   1197: athrow
    //   1198: aconst_null
    //   1199: athrow
    //   1200: aconst_null
    //   1201: athrow
    //   1202: aconst_null
    //   1203: athrow
    //   1204: aconst_null
    //   1205: athrow
    //   1206: aconst_null
    //   1207: athrow
    //   1208: aconst_null
    //   1209: athrow
    //   1210: aconst_null
    //   1211: athrow
    //   1212: aconst_null
    //   1213: athrow
    //   1214: aconst_null
    //   1215: athrow
    //   1216: aconst_null
    //   1217: athrow
    //   1218: aconst_null
    //   1219: athrow
    //   1220: pop
    //   1221: goto -> 24
    //   1224: pop
    //   1225: aconst_null
    //   1226: goto -> 1220
    //   1229: dup
    //   1230: ifnull -> 1220
    //   1233: checkcast java/lang/Throwable
    //   1236: athrow
    //   1237: dup
    //   1238: ifnull -> 1224
    //   1241: checkcast java/lang/Throwable
    //   1244: athrow
    //   1245: aconst_null
    //   1246: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   281	841	3	current	I
    //   24	1162	0	currentI	I
    //   24	1162	1	last	I
    //   161	1025	2	fullInventorySlots	Ljava/util/HashMap;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	1025	2	fullInventorySlots	Ljava/util/HashMap<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	1229	finally
    //   91	98	98	finally
    //   91	98	91	finally
    //   91	98	3	finally
    //   92	98	91	finally
    //   92	98	98	java/lang/NullPointerException
    //   639	646	646	finally
    //   639	646	639	finally
    //   639	646	3	finally
    //   639	646	3	java/lang/NullPointerException
    //   639	646	639	finally
    //   904	910	910	finally
    //   904	910	910	java/lang/NullPointerException
    //   904	910	910	java/lang/IllegalArgumentException
    //   904	910	910	finally
    //   904	910	3	java/util/NoSuchElementException
    //   1035	1042	1042	finally
    //   1035	1042	1035	java/lang/AssertionError
    //   1035	1042	1035	finally
    //   1035	1042	1035	finally
    //   1036	1042	1035	java/lang/UnsupportedOperationException
    //   1107	1114	1114	finally
    //   1107	1114	1114	java/lang/EnumConstantNotPresentException
    //   1107	1114	1107	java/lang/StringIndexOutOfBoundsException
    //   1107	1114	3	finally
    //   1107	1114	3	finally
    //   1229	1237	1229	finally
    //   1245	1247	3	finally
  }
  
  public static boolean[] switchItem(boolean back, int lastHotbarSlot, boolean switchedItem, InventoryUtil$Switch mode, Class clazz) {
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
  
  public static int findStackInventory(Item paramItem) {
    return Perry1.4W(null, (int)1288095887L ^ 0x15FDA9D7, paramItem);
  }
  
  public static int findArmorSlot(EntityEquipmentSlot type, boolean binding) {
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
  
  public static int findHotbarBlock(Class paramClass) {
    return Perry1.05(null, (int)1964627284L ^ 0x1F6F5A07, paramClass);
  }
  
  public InventoryUtil() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1388759582
    //   9: l2i
    //   10: ldc_w -1289649780
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1606524509
    //   20: l2i
    //   21: ldc_w -167595810
    //   24: ixor
    //   25: ldc2_w -1856237728
    //   28: l2i
    //   29: ldc_w -318226209
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1649212371 -> 126, 693297118 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 1599980696
    //   70: l2i
    //   71: ldc_w 1050247319
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1756336033
    //   81: l2i
    //   82: ldc_w -1784858916
    //   85: ixor
    //   86: ldc2_w -1442318668
    //   89: l2i
    //   90: ldc_w 598786610
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -395087735 -> 124, 1611314822 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/InventoryUtil;
  }
  
  public static EntityEquipmentSlot getEquipmentFromSlot(int slot) {
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
  
  public static int findInventoryBlock(Class clazz, boolean offHand) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2447
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 2439
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2431
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/concurrent/atomic/AtomicInteger
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1135459720
    //   37: l2i
    //   38: ldc_w 344952754
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1199935164
    //   48: l2i
    //   49: ldc_w 887564348
    //   52: ixor
    //   53: ldc2_w 1095352745
    //   56: l2i
    //   57: ldc_w 125520536
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 2378, -286308613 -> 45, 894447025 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w -2040600395
    //   108: l2i
    //   109: ldc_w 1843197037
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 82939802
    //   119: l2i
    //   120: ldc_w -40120360
    //   123: ixor
    //   124: ldc2_w -664906267
    //   127: l2i
    //   128: ldc_w -1651880287
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 2420, -1370093668 -> 116, -1128375546 -> 160
    //   160: astore_2
    //   161: getstatic Perryc.0 : I
    //   164: ifle -> 178
    //   167: ldc2_w -1492109152
    //   170: l2i
    //   171: ldc_w -768377804
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 435343494
    //   181: l2i
    //   182: ldc_w 1792772878
    //   185: ixor
    //   186: ldc2_w -8222208
    //   189: l2i
    //   190: ldc_w 2085260482
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 2408, -253665974 -> 220, -152354218 -> 178
    //   220: aload_2
    //   221: ldc2_w 324056894
    //   224: l2i
    //   225: ldc_w -324056895
    //   228: ixor
    //   229: getstatic Perryc.c : I
    //   232: iflt -> 246
    //   235: ldc2_w 1197332957
    //   238: l2i
    //   239: ldc_w -1341486550
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w -2066642616
    //   249: l2i
    //   250: ldc_w -2124696596
    //   253: ixor
    //   254: ldc2_w -434690928
    //   257: l2i
    //   258: ldc_w 1401393911
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 288, -424996306 -> 246, 1120396688 -> 2406
    //   288: goto -> 292
    //   291: athrow
    //   292: invokevirtual set : (I)V
    //   295: goto -> 299
    //   298: athrow
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 316
    //   305: ldc2_w -1197638776
    //   308: l2i
    //   309: ldc_w 1117485103
    //   312: ixor
    //   313: goto -> 324
    //   316: ldc2_w -1742293750
    //   319: l2i
    //   320: ldc_w -796174948
    //   323: ixor
    //   324: ldc2_w 1122915461
    //   327: l2i
    //   328: ldc_w -1234772820
    //   331: ixor
    //   332: ixor
    //   333: lookupswitch default -> 2416, -1138399041 -> 360, 244222862 -> 316
    //   360: goto -> 364
    //   363: athrow
    //   364: invokestatic getInventoryAndHotbarSlots : ()Ljava/util/Map;
    //   367: goto -> 371
    //   370: athrow
    //   371: getstatic Perryc.c : I
    //   374: iflt -> 388
    //   377: ldc2_w 1085612918
    //   380: l2i
    //   381: ldc_w -1276433980
    //   384: ixor
    //   385: goto -> 396
    //   388: ldc2_w -315579813
    //   391: l2i
    //   392: ldc_w 825631116
    //   395: ixor
    //   396: ldc2_w -2136771492
    //   399: l2i
    //   400: ldc_w -792282195
    //   403: ixor
    //   404: ixor
    //   405: lookupswitch default -> 2410, -1939649498 -> 432, -1556363965 -> 388
    //   432: goto -> 436
    //   435: athrow
    //   436: invokeinterface entrySet : ()Ljava/util/Set;
    //   441: goto -> 445
    //   444: athrow
    //   445: getstatic Perryc.0 : I
    //   448: ifle -> 462
    //   451: ldc2_w -180331439
    //   454: l2i
    //   455: ldc_w -18799081
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w 29414177
    //   465: l2i
    //   466: ldc_w 1426846525
    //   469: ixor
    //   470: ldc2_w -303993032
    //   473: l2i
    //   474: ldc_w 1038326935
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 2414, -2067147853 -> 504, -610039319 -> 462
    //   504: goto -> 508
    //   507: athrow
    //   508: invokeinterface iterator : ()Ljava/util/Iterator;
    //   513: goto -> 517
    //   516: athrow
    //   517: getstatic Perryc.c : I
    //   520: iflt -> 534
    //   523: ldc2_w 1377123902
    //   526: l2i
    //   527: ldc_w -795044546
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w 1970801644
    //   537: l2i
    //   538: ldc_w -554071198
    //   541: ixor
    //   542: ldc2_w 1069071303
    //   545: l2i
    //   546: ldc_w 2140641125
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 576, -1029273694 -> 2404, 1088299244 -> 534
    //   576: astore_3
    //   577: getstatic Perryc.0 : I
    //   580: ifle -> 594
    //   583: ldc2_w 1537210805
    //   586: l2i
    //   587: ldc_w -730909563
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w 495857089
    //   597: l2i
    //   598: ldc_w -1893142003
    //   601: ixor
    //   602: ldc2_w -2079173042
    //   605: l2i
    //   606: ldc_w -125300093
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 636, -211121667 -> 2386, 1915143498 -> 594
    //   636: aload_3
    //   637: getstatic Perryc.0 : I
    //   640: ifle -> 654
    //   643: ldc2_w -459676983
    //   646: l2i
    //   647: ldc_w -137370279
    //   650: ixor
    //   651: goto -> 662
    //   654: ldc2_w -1234341506
    //   657: l2i
    //   658: ldc_w 1701160017
    //   661: ixor
    //   662: ldc2_w 1187885367
    //   665: l2i
    //   666: ldc_w 665812719
    //   669: ixor
    //   670: ixor
    //   671: lookupswitch default -> 2364, -1301669129 -> 696, 1916061768 -> 654
    //   696: goto -> 700
    //   699: athrow
    //   700: invokeinterface hasNext : ()Z
    //   705: goto -> 709
    //   708: athrow
    //   709: ifeq -> 723
    //   712: ldc2_w -884595979
    //   715: l2i
    //   716: ldc_w 595225888
    //   719: ixor
    //   720: goto -> 731
    //   723: ldc2_w 1787759121
    //   726: l2i
    //   727: ldc_w -2102180413
    //   730: ixor
    //   731: ldc2_w 684051450
    //   734: l2i
    //   735: ldc_w -899778228
    //   738: ixor
    //   739: ixor
    //   740: tableswitch default -> 712, 178781539 -> 764, 178781540 -> 2228
    //   764: getstatic Perryc.0 : I
    //   767: ifle -> 781
    //   770: ldc2_w -1634415357
    //   773: l2i
    //   774: ldc_w -1287273929
    //   777: ixor
    //   778: goto -> 789
    //   781: ldc2_w 752072246
    //   784: l2i
    //   785: ldc_w -1719139677
    //   788: ixor
    //   789: ldc2_w -2105505340
    //   792: l2i
    //   793: ldc_w 633914551
    //   796: ixor
    //   797: ixor
    //   798: lookupswitch default -> 2374, -1969667513 -> 781, 303299046 -> 824
    //   824: aload_3
    //   825: getstatic Perryc.c : I
    //   828: iflt -> 842
    //   831: ldc2_w -248651334
    //   834: l2i
    //   835: ldc_w 377794894
    //   838: ixor
    //   839: goto -> 850
    //   842: ldc2_w -1847945085
    //   845: l2i
    //   846: ldc_w -1072141170
    //   849: ixor
    //   850: ldc2_w 185167634
    //   853: l2i
    //   854: ldc_w -1111430536
    //   857: ixor
    //   858: ixor
    //   859: lookupswitch default -> 884, 141070059 -> 842, 1365300638 -> 2396
    //   884: goto -> 888
    //   887: athrow
    //   888: invokeinterface next : ()Ljava/lang/Object;
    //   893: goto -> 897
    //   896: athrow
    //   897: checkcast java/util/Map$Entry
    //   900: getstatic Perryc.c : I
    //   903: iflt -> 917
    //   906: ldc2_w 133847488
    //   909: l2i
    //   910: ldc_w 496724823
    //   913: ixor
    //   914: goto -> 925
    //   917: ldc2_w 1841794556
    //   920: l2i
    //   921: ldc_w 2090725510
    //   924: ixor
    //   925: ldc2_w 2076122230
    //   928: l2i
    //   929: ldc_w -1736933918
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, -106540285 -> 2370, 1658639087 -> 917
    //   960: astore #4
    //   962: getstatic Perryc.1 : I
    //   965: ifeq -> 979
    //   968: ldc2_w 479032245
    //   971: l2i
    //   972: ldc_w -204923196
    //   975: ixor
    //   976: goto -> 987
    //   979: ldc2_w -1905179044
    //   982: l2i
    //   983: ldc_w -188663322
    //   986: ixor
    //   987: ldc2_w 1415538110
    //   990: l2i
    //   991: ldc_w -1142902843
    //   994: ixor
    //   995: ixor
    //   996: lookupswitch default -> 1024, -1315842977 -> 979, 16492298 -> 2392
    //   1024: aload #4
    //   1026: getstatic Perryc.c : I
    //   1029: iflt -> 1043
    //   1032: ldc2_w -1182937194
    //   1035: l2i
    //   1036: ldc_w 1260061950
    //   1039: ixor
    //   1040: goto -> 1051
    //   1043: ldc2_w 522284607
    //   1046: l2i
    //   1047: ldc_w 1654285044
    //   1050: ixor
    //   1051: ldc2_w -1244301897
    //   1054: l2i
    //   1055: ldc_w 2118725232
    //   1058: ixor
    //   1059: ixor
    //   1060: lookupswitch default -> 1088, -421598545 -> 1043, 972722351 -> 2388
    //   1088: goto -> 1092
    //   1091: athrow
    //   1092: invokeinterface getValue : ()Ljava/lang/Object;
    //   1097: goto -> 1101
    //   1100: athrow
    //   1101: checkcast net/minecraft/item/ItemStack
    //   1104: getstatic Perryc.c : I
    //   1107: iflt -> 1121
    //   1110: ldc2_w 1643442670
    //   1113: l2i
    //   1114: ldc_w -1124951229
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w -981491012
    //   1124: l2i
    //   1125: ldc_w 774585318
    //   1128: ixor
    //   1129: ldc2_w 1192447988
    //   1132: l2i
    //   1133: ldc_w -1251700304
    //   1136: ixor
    //   1137: ixor
    //   1138: lookupswitch default -> 2390, 421742366 -> 1164, 795981033 -> 1121
    //   1164: goto -> 1168
    //   1167: athrow
    //   1168: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1171: goto -> 1175
    //   1174: athrow
    //   1175: getstatic Perryc.1 : I
    //   1178: ifeq -> 1192
    //   1181: ldc2_w -595027848
    //   1184: l2i
    //   1185: ldc_w -2041696452
    //   1188: ixor
    //   1189: goto -> 1200
    //   1192: ldc2_w -479903862
    //   1195: l2i
    //   1196: ldc_w 1620290118
    //   1199: ixor
    //   1200: ldc2_w -87407851
    //   1203: l2i
    //   1204: ldc_w -805374027
    //   1207: ixor
    //   1208: ixor
    //   1209: lookupswitch default -> 2368, -1228791444 -> 1236, 1878131684 -> 1192
    //   1236: aload_0
    //   1237: getstatic Perryc.0 : I
    //   1240: ifle -> 1254
    //   1243: ldc2_w -1169048047
    //   1246: l2i
    //   1247: ldc_w -1277780755
    //   1250: ixor
    //   1251: goto -> 1262
    //   1254: ldc2_w -851295630
    //   1257: l2i
    //   1258: ldc_w -803175087
    //   1261: ixor
    //   1262: ldc2_w -282918591
    //   1265: l2i
    //   1266: ldc_w -88952778
    //   1269: ixor
    //   1270: ixor
    //   1271: lookupswitch default -> 2360, 150173268 -> 1296, 471241611 -> 1254
    //   1296: goto -> 1300
    //   1299: athrow
    //   1300: invokestatic isBlock : (Lnet/minecraft/item/Item;Ljava/lang/Class;)Z
    //   1303: goto -> 1307
    //   1306: athrow
    //   1307: ifeq -> 1321
    //   1310: ldc2_w 2023918672
    //   1313: l2i
    //   1314: ldc_w 1079652135
    //   1317: ixor
    //   1318: goto -> 1329
    //   1321: ldc2_w 852888962
    //   1324: l2i
    //   1325: ldc_w 170831604
    //   1328: ixor
    //   1329: ldc2_w 1239637702
    //   1332: l2i
    //   1333: ldc_w -1100930283
    //   1336: ixor
    //   1337: ixor
    //   1338: tableswitch default -> 1310, -814031196 -> 1360, -814031195 -> 577
    //   1360: getstatic Perryc.0 : I
    //   1363: ifle -> 1377
    //   1366: ldc2_w -1974334127
    //   1369: l2i
    //   1370: ldc_w -1915575886
    //   1373: ixor
    //   1374: goto -> 1385
    //   1377: ldc2_w 80210723
    //   1380: l2i
    //   1381: ldc_w -1410556890
    //   1384: ixor
    //   1385: ldc2_w 713368627
    //   1388: l2i
    //   1389: ldc_w 320040345
    //   1392: ixor
    //   1393: ixor
    //   1394: lookupswitch default -> 1420, -80858152 -> 1377, 1041687881 -> 2418
    //   1420: aload #4
    //   1422: getstatic Perryc.0 : I
    //   1425: ifle -> 1439
    //   1428: ldc2_w -716203727
    //   1431: l2i
    //   1432: ldc_w 170567030
    //   1435: ixor
    //   1436: goto -> 1447
    //   1439: ldc2_w 1855502474
    //   1442: l2i
    //   1443: ldc_w 1340354653
    //   1446: ixor
    //   1447: ldc2_w -516630620
    //   1450: l2i
    //   1451: ldc_w 1797471558
    //   1454: ixor
    //   1455: ixor
    //   1456: lookupswitch default -> 1484, -970396534 -> 1439, 1433589413 -> 2394
    //   1484: goto -> 1488
    //   1487: athrow
    //   1488: invokeinterface getKey : ()Ljava/lang/Object;
    //   1493: goto -> 1497
    //   1496: athrow
    //   1497: checkcast java/lang/Integer
    //   1500: getstatic Perryc.1 : I
    //   1503: ifeq -> 1517
    //   1506: ldc2_w 1647448888
    //   1509: l2i
    //   1510: ldc_w 39910836
    //   1513: ixor
    //   1514: goto -> 1525
    //   1517: ldc2_w -1281886116
    //   1520: l2i
    //   1521: ldc_w 130187254
    //   1524: ixor
    //   1525: ldc2_w -1825238908
    //   1528: l2i
    //   1529: ldc_w 1237973472
    //   1532: ixor
    //   1533: ixor
    //   1534: lookupswitch default -> 2366, -1162999832 -> 1517, 1856597710 -> 1560
    //   1560: goto -> 1564
    //   1563: athrow
    //   1564: invokevirtual intValue : ()I
    //   1567: goto -> 1571
    //   1570: athrow
    //   1571: ldc2_w 1376514095
    //   1574: l2i
    //   1575: ldc_w 1376514050
    //   1578: ixor
    //   1579: if_icmpne -> 1593
    //   1582: ldc2_w 464456659
    //   1585: l2i
    //   1586: ldc_w 1250451429
    //   1589: ixor
    //   1590: goto -> 1601
    //   1593: ldc2_w -1996297808
    //   1596: l2i
    //   1597: ldc_w -668615289
    //   1600: ixor
    //   1601: ldc2_w 1755014685
    //   1604: l2i
    //   1605: ldc_w 556234055
    //   1608: ixor
    //   1609: ixor
    //   1610: tableswitch default -> 1582, 412829548 -> 1632, 412829549 -> 1751
    //   1632: getstatic Perryc.1 : I
    //   1635: ifeq -> 1649
    //   1638: ldc2_w 1165929118
    //   1641: l2i
    //   1642: ldc_w -389914166
    //   1645: ixor
    //   1646: goto -> 1657
    //   1649: ldc2_w 1958833058
    //   1652: l2i
    //   1653: ldc_w -466404973
    //   1656: ixor
    //   1657: ldc2_w -1828412628
    //   1660: l2i
    //   1661: ldc_w -2041498583
    //   1664: ixor
    //   1665: ixor
    //   1666: lookupswitch default -> 1692, -1192666031 -> 2362, 1877758076 -> 1649
    //   1692: iload_1
    //   1693: ifne -> 1707
    //   1696: ldc2_w -538255143
    //   1699: l2i
    //   1700: ldc_w 825175742
    //   1703: ixor
    //   1704: goto -> 1715
    //   1707: ldc2_w -452635087
    //   1710: l2i
    //   1711: ldc_w 197171285
    //   1714: ixor
    //   1715: ldc2_w 1754994104
    //   1718: l2i
    //   1719: ldc_w -1082131014
    //   1722: ixor
    //   1723: ixor
    //   1724: tableswitch default -> 1696, 958473829 -> 1748, 958473830 -> 1751
    //   1748: goto -> 577
    //   1751: getstatic Perryc.1 : I
    //   1754: ifeq -> 1768
    //   1757: ldc2_w 1660895924
    //   1760: l2i
    //   1761: ldc_w -312826995
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w 1548140476
    //   1771: l2i
    //   1772: ldc_w -299910255
    //   1775: ixor
    //   1776: ldc2_w -1717553743
    //   1779: l2i
    //   1780: ldc_w -1201419473
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 2384, -1818559821 -> 1812, -1369038937 -> 1768
    //   1812: aload_2
    //   1813: getstatic Perryc.0 : I
    //   1816: ifle -> 1830
    //   1819: ldc2_w -868131234
    //   1822: l2i
    //   1823: ldc_w -592382888
    //   1826: ixor
    //   1827: goto -> 1838
    //   1830: ldc2_w -870232325
    //   1833: l2i
    //   1834: ldc_w 1476937942
    //   1837: ixor
    //   1838: ldc2_w -1140175489
    //   1841: l2i
    //   1842: ldc_w 1267458283
    //   1845: ixor
    //   1846: ixor
    //   1847: lookupswitch default -> 2402, -412088430 -> 1830, 1671998393 -> 1872
    //   1872: aload #4
    //   1874: getstatic Perryc.1 : I
    //   1877: ifeq -> 1891
    //   1880: ldc2_w -359709180
    //   1883: l2i
    //   1884: ldc_w 35906561
    //   1887: ixor
    //   1888: goto -> 1899
    //   1891: ldc2_w 196054967
    //   1894: l2i
    //   1895: ldc_w 963725103
    //   1898: ixor
    //   1899: ldc2_w -478732682
    //   1902: l2i
    //   1903: ldc_w -206454118
    //   1906: ixor
    //   1907: ixor
    //   1908: lookupswitch default -> 2382, -127238423 -> 1891, 572003444 -> 1936
    //   1936: goto -> 1940
    //   1939: athrow
    //   1940: invokeinterface getKey : ()Ljava/lang/Object;
    //   1945: goto -> 1949
    //   1948: athrow
    //   1949: checkcast java/lang/Integer
    //   1952: getstatic Perryc.0 : I
    //   1955: ifle -> 1969
    //   1958: ldc2_w 863969695
    //   1961: l2i
    //   1962: ldc_w -1938624035
    //   1965: ixor
    //   1966: goto -> 1977
    //   1969: ldc2_w -1331241510
    //   1972: l2i
    //   1973: ldc_w 2118565142
    //   1976: ixor
    //   1977: ldc2_w -188316189
    //   1980: l2i
    //   1981: ldc_w 750830206
    //   1984: ixor
    //   1985: ixor
    //   1986: lookupswitch default -> 2398, 384182097 -> 2012, 1728813023 -> 1969
    //   2012: goto -> 2016
    //   2015: athrow
    //   2016: invokevirtual intValue : ()I
    //   2019: goto -> 2023
    //   2022: athrow
    //   2023: getstatic Perryc.1 : I
    //   2026: ifeq -> 2040
    //   2029: ldc2_w 536922509
    //   2032: l2i
    //   2033: ldc_w 1260839783
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w -369734798
    //   2043: l2i
    //   2044: ldc_w -1885269251
    //   2047: ixor
    //   2048: ldc2_w -102260834
    //   2051: l2i
    //   2052: ldc_w 1614282561
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 2400, -218740171 -> 2040, -7915184 -> 2084
    //   2084: goto -> 2088
    //   2087: athrow
    //   2088: invokevirtual set : (I)V
    //   2091: goto -> 2095
    //   2094: athrow
    //   2095: getstatic Perryc.1 : I
    //   2098: ifeq -> 2112
    //   2101: ldc2_w 2134679202
    //   2104: l2i
    //   2105: ldc_w 1381495713
    //   2108: ixor
    //   2109: goto -> 2120
    //   2112: ldc2_w 1699644992
    //   2115: l2i
    //   2116: ldc_w 208616717
    //   2119: ixor
    //   2120: ldc2_w 448548027
    //   2123: l2i
    //   2124: ldc_w 1875622619
    //   2127: ixor
    //   2128: ixor
    //   2129: lookupswitch default -> 2156, 1080108734 -> 2112, 1478269795 -> 2372
    //   2156: aload_2
    //   2157: getstatic Perryc.c : I
    //   2160: iflt -> 2174
    //   2163: ldc2_w -360883860
    //   2166: l2i
    //   2167: ldc_w 1814294592
    //   2170: ixor
    //   2171: goto -> 2182
    //   2174: ldc2_w -850228494
    //   2177: l2i
    //   2178: ldc_w 1036354633
    //   2181: ixor
    //   2182: ldc2_w -1665497467
    //   2185: l2i
    //   2186: ldc_w 1456676285
    //   2189: ixor
    //   2190: ixor
    //   2191: lookupswitch default -> 2216, -1480485457 -> 2174, 1278685716 -> 2376
    //   2216: goto -> 2220
    //   2219: athrow
    //   2220: invokevirtual get : ()I
    //   2223: goto -> 2227
    //   2226: athrow
    //   2227: ireturn
    //   2228: getstatic Perryc.c : I
    //   2231: iflt -> 2245
    //   2234: ldc2_w -136704992
    //   2237: l2i
    //   2238: ldc_w 1567385606
    //   2241: ixor
    //   2242: goto -> 2253
    //   2245: ldc2_w -239802607
    //   2248: l2i
    //   2249: ldc_w 1904068634
    //   2252: ixor
    //   2253: ldc2_w -278986817
    //   2256: l2i
    //   2257: ldc_w -651747085
    //   2260: ixor
    //   2261: ixor
    //   2262: lookupswitch default -> 2380, -1664107670 -> 2245, -1229918137 -> 2288
    //   2288: aload_2
    //   2289: getstatic Perryc.1 : I
    //   2292: ifeq -> 2306
    //   2295: ldc2_w -322787931
    //   2298: l2i
    //   2299: ldc_w 1998169790
    //   2302: ixor
    //   2303: goto -> 2314
    //   2306: ldc2_w 42559931
    //   2309: l2i
    //   2310: ldc_w -2122623702
    //   2313: ixor
    //   2314: ldc2_w 2082984501
    //   2317: l2i
    //   2318: ldc_w 489757289
    //   2321: ixor
    //   2322: ixor
    //   2323: lookupswitch default -> 2348, -87176377 -> 2412, 1654676464 -> 2306
    //   2348: goto -> 2352
    //   2351: athrow
    //   2352: invokevirtual get : ()I
    //   2355: goto -> 2359
    //   2358: athrow
    //   2359: ireturn
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
    //   2378: aconst_null
    //   2379: athrow
    //   2380: aconst_null
    //   2381: athrow
    //   2382: aconst_null
    //   2383: athrow
    //   2384: aconst_null
    //   2385: athrow
    //   2386: aconst_null
    //   2387: athrow
    //   2388: aconst_null
    //   2389: athrow
    //   2390: aconst_null
    //   2391: athrow
    //   2392: aconst_null
    //   2393: athrow
    //   2394: aconst_null
    //   2395: athrow
    //   2396: aconst_null
    //   2397: athrow
    //   2398: aconst_null
    //   2399: athrow
    //   2400: aconst_null
    //   2401: athrow
    //   2402: aconst_null
    //   2403: athrow
    //   2404: aconst_null
    //   2405: athrow
    //   2406: aconst_null
    //   2407: athrow
    //   2408: aconst_null
    //   2409: athrow
    //   2410: aconst_null
    //   2411: athrow
    //   2412: aconst_null
    //   2413: athrow
    //   2414: aconst_null
    //   2415: athrow
    //   2416: aconst_null
    //   2417: athrow
    //   2418: aconst_null
    //   2419: athrow
    //   2420: aconst_null
    //   2421: athrow
    //   2422: pop
    //   2423: goto -> 24
    //   2426: pop
    //   2427: aconst_null
    //   2428: goto -> 2422
    //   2431: dup
    //   2432: ifnull -> 2422
    //   2435: checkcast java/lang/Throwable
    //   2438: athrow
    //   2439: dup
    //   2440: ifnull -> 2426
    //   2443: checkcast java/lang/Throwable
    //   2446: athrow
    //   2447: aconst_null
    //   2448: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   962	1266	4	entry	Ljava/util/Map$Entry;
    //   24	2336	0	clazz	Ljava/lang/Class;
    //   24	2336	1	offHand	Z
    //   161	2199	2	slot	Ljava/util/concurrent/atomic/AtomicInteger;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   962	1266	4	entry	Ljava/util/Map$Entry<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2431	finally
    //   91	98	98	finally
    //   91	98	91	java/lang/IllegalStateException
    //   91	98	98	java/lang/NegativeArraySizeException
    //   91	98	91	java/lang/RuntimeException
    //   91	98	91	java/lang/ArrayIndexOutOfBoundsException
    //   291	298	298	finally
    //   291	298	3	java/lang/EnumConstantNotPresentException
    //   291	298	3	java/lang/UnsupportedOperationException
    //   291	298	291	java/lang/IndexOutOfBoundsException
    //   291	298	298	finally
    //   363	370	370	finally
    //   363	370	370	finally
    //   363	370	363	finally
    //   363	370	370	finally
    //   363	370	3	java/lang/NullPointerException
    //   436	444	444	finally
    //   436	444	3	finally
    //   436	444	444	finally
    //   436	444	3	finally
    //   436	444	444	java/lang/IllegalStateException
    //   508	516	516	finally
    //   508	516	3	java/lang/ArrayIndexOutOfBoundsException
    //   508	516	516	finally
    //   508	516	3	java/lang/AssertionError
    //   508	516	516	finally
    //   700	708	708	finally
    //   700	708	708	finally
    //   700	708	3	finally
    //   700	708	3	java/lang/StringIndexOutOfBoundsException
    //   700	708	708	java/lang/EnumConstantNotPresentException
    //   887	896	896	finally
    //   888	896	887	finally
    //   888	896	3	java/lang/UnsupportedOperationException
    //   888	896	3	java/lang/UnsupportedOperationException
    //   888	896	896	java/util/ConcurrentModificationException
    //   1091	1100	1100	finally
    //   1091	1100	3	finally
    //   1091	1100	3	java/lang/ClassCastException
    //   1092	1100	1091	java/lang/RuntimeException
    //   1092	1100	3	finally
    //   1167	1174	1174	finally
    //   1167	1174	1167	java/lang/NumberFormatException
    //   1167	1174	3	java/lang/ClassCastException
    //   1167	1174	1174	finally
    //   1167	1174	1174	finally
    //   1299	1306	1306	finally
    //   1299	1306	1306	java/lang/EnumConstantNotPresentException
    //   1299	1306	3	finally
    //   1299	1306	1299	finally
    //   1300	1306	1299	java/lang/UnsupportedOperationException
    //   1488	1496	1496	finally
    //   1488	1496	1496	java/lang/ArrayIndexOutOfBoundsException
    //   1488	1496	3	finally
    //   1488	1496	1496	finally
    //   1488	1496	1496	finally
    //   1563	1570	1570	finally
    //   1563	1570	1570	java/lang/IndexOutOfBoundsException
    //   1563	1570	1570	java/lang/AssertionError
    //   1563	1570	1563	java/lang/NumberFormatException
    //   1564	1570	3	java/lang/ArithmeticException
    //   1939	1948	1948	finally
    //   1939	1948	3	finally
    //   1939	1948	1948	finally
    //   1940	1948	1948	finally
    //   1940	1948	1939	java/lang/NegativeArraySizeException
    //   2015	2022	2022	finally
    //   2015	2022	2015	finally
    //   2015	2022	3	finally
    //   2015	2022	3	java/lang/ClassCastException
    //   2016	2022	2022	java/util/NoSuchElementException
    //   2087	2094	2094	finally
    //   2087	2094	2094	finally
    //   2088	2094	2094	finally
    //   2088	2094	2094	java/lang/StringIndexOutOfBoundsException
    //   2088	2094	2087	finally
    //   2219	2226	2226	finally
    //   2219	2226	2226	java/lang/NegativeArraySizeException
    //   2219	2226	2226	finally
    //   2219	2226	3	finally
    //   2220	2226	2219	java/lang/IllegalArgumentException
    //   2351	2358	2358	finally
    //   2352	2358	2351	java/lang/RuntimeException
    //   2352	2358	2358	java/lang/ArithmeticException
    //   2352	2358	2358	java/util/NoSuchElementException
    //   2352	2358	2351	java/lang/ArrayIndexOutOfBoundsException
    //   2431	2439	2431	finally
    //   2447	2449	3	java/lang/IllegalArgumentException
  }
  
  public static List getItemInventory(Item item) {
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
  
  public static void confirmSlot(int slot) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 993
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 985
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 977
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -996624276
    //   33: l2i
    //   34: ldc_w -646493758
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -417886569
    //   44: l2i
    //   45: ldc_w -1353489868
    //   48: ixor
    //   49: ldc2_w -1736727557
    //   52: l2i
    //   53: ldc_w -2121913037
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 68321126 -> 964, 978028522 -> 41
    //   84: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w -1897255008
    //   96: l2i
    //   97: ldc_w -465155118
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -1206245767
    //   107: l2i
    //   108: ldc_w -2095605652
    //   111: ixor
    //   112: ldc2_w 1182510232
    //   115: l2i
    //   116: ldc_w -1848832295
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 960, -1122318797 -> 104, -323281836 -> 148
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w -1519055798
    //   160: l2i
    //   161: ldc_w -1271791827
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1333314634
    //   171: l2i
    //   172: ldc_w -282447898
    //   175: ixor
    //   176: ldc2_w -1691878470
    //   179: l2i
    //   180: ldc_w -1236659191
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, 702672658 -> 168, 1009327316 -> 948
    //   212: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   215: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   218: dup
    //   219: getstatic Perryc.0 : I
    //   222: ifle -> 236
    //   225: ldc2_w 1804236367
    //   228: l2i
    //   229: ldc_w 547936442
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w 1113846430
    //   239: l2i
    //   240: ldc_w -1940548928
    //   243: ixor
    //   244: ldc2_w -1713928699
    //   247: l2i
    //   248: ldc_w -1855762163
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 280, -647546777 -> 236, 1133935101 -> 944
    //   280: iload_0
    //   281: getstatic Perryc.0 : I
    //   284: ifle -> 298
    //   287: ldc2_w -1566830013
    //   290: l2i
    //   291: ldc_w -1835263667
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 714716991
    //   301: l2i
    //   302: ldc_w 1570068816
    //   305: ixor
    //   306: ldc2_w -401230013
    //   309: l2i
    //   310: ldc_w -70144380
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, 600052425 -> 940, 640287669 -> 298
    //   340: goto -> 344
    //   343: athrow
    //   344: invokespecial <init> : (I)V
    //   347: goto -> 351
    //   350: athrow
    //   351: getstatic Perryc.c : I
    //   354: iflt -> 368
    //   357: ldc2_w -59984530
    //   360: l2i
    //   361: ldc_w 2082205695
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w -1645313692
    //   371: l2i
    //   372: ldc_w 721716755
    //   375: ixor
    //   376: ldc2_w -1135970464
    //   379: l2i
    //   380: ldc_w -430165531
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 412, -868404650 -> 368, -631170028 -> 954
    //   412: goto -> 416
    //   415: athrow
    //   416: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   419: goto -> 423
    //   422: athrow
    //   423: getstatic Perryc.0 : I
    //   426: ifle -> 440
    //   429: ldc2_w 1788976485
    //   432: l2i
    //   433: ldc_w -1187222749
    //   436: ixor
    //   437: goto -> 448
    //   440: ldc2_w 988536857
    //   443: l2i
    //   444: ldc_w 44450474
    //   447: ixor
    //   448: ldc2_w -1424862148
    //   451: l2i
    //   452: ldc_w -342451734
    //   455: ixor
    //   456: ixor
    //   457: lookupswitch default -> 966, -1827062896 -> 440, 2026467173 -> 484
    //   484: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   487: getstatic Perryc.0 : I
    //   490: ifle -> 504
    //   493: ldc2_w -2106190369
    //   496: l2i
    //   497: ldc_w 1959782874
    //   500: ixor
    //   501: goto -> 512
    //   504: ldc2_w -443350078
    //   507: l2i
    //   508: ldc_w -2020591820
    //   511: ixor
    //   512: ldc2_w -705833437
    //   515: l2i
    //   516: ldc_w -1901629732
    //   519: ixor
    //   520: ixor
    //   521: lookupswitch default -> 548, -1376566022 -> 952, -932555389 -> 504
    //   548: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   551: getstatic Perryc.0 : I
    //   554: ifle -> 568
    //   557: ldc2_w -705631920
    //   560: l2i
    //   561: ldc_w -1425801066
    //   564: ixor
    //   565: goto -> 576
    //   568: ldc2_w -435092661
    //   571: l2i
    //   572: ldc_w 64413985
    //   575: ixor
    //   576: ldc2_w 1152079378
    //   579: l2i
    //   580: ldc_w 914275657
    //   583: ixor
    //   584: ixor
    //   585: lookupswitch default -> 612, -2022335016 -> 568, 203489949 -> 956
    //   612: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   615: getstatic Perryc.c : I
    //   618: iflt -> 632
    //   621: ldc2_w 85645666
    //   624: l2i
    //   625: ldc_w 286897895
    //   628: ixor
    //   629: goto -> 640
    //   632: ldc2_w -1605516681
    //   635: l2i
    //   636: ldc_w -1411968532
    //   639: ixor
    //   640: ldc2_w 1297160568
    //   643: l2i
    //   644: ldc_w 1126904628
    //   647: ixor
    //   648: ixor
    //   649: lookupswitch default -> 676, -230132022 -> 632, 444155337 -> 962
    //   676: iload_0
    //   677: getstatic Perryc.1 : I
    //   680: ifeq -> 694
    //   683: ldc2_w 374999800
    //   686: l2i
    //   687: ldc_w 1208948096
    //   690: ixor
    //   691: goto -> 702
    //   694: ldc2_w -1916543516
    //   697: l2i
    //   698: ldc_w -1899430996
    //   701: ixor
    //   702: ldc2_w 939327520
    //   705: l2i
    //   706: ldc_w 1325446930
    //   709: ixor
    //   710: ixor
    //   711: lookupswitch default -> 736, -210600924 -> 694, 648587338 -> 942
    //   736: putfield field_70461_c : I
    //   739: getstatic Perryc.0 : I
    //   742: ifle -> 756
    //   745: ldc2_w 217183906
    //   748: l2i
    //   749: ldc_w 1507029078
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -1953072957
    //   759: l2i
    //   760: ldc_w 2064140025
    //   763: ixor
    //   764: ldc2_w -1495773313
    //   767: l2i
    //   768: ldc_w -1761528508
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, -484807186 -> 756, 1694235855 -> 958
    //   800: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w 1905859311
    //   812: l2i
    //   813: ldc_w 346081964
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -114565783
    //   823: l2i
    //   824: ldc_w -331992204
    //   827: ixor
    //   828: ldc2_w 1720762005
    //   831: l2i
    //   832: ldc_w 2031142049
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 946, 178099241 -> 864, 2058988151 -> 820
    //   864: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   867: getstatic Perryc.0 : I
    //   870: ifle -> 884
    //   873: ldc2_w -583807218
    //   876: l2i
    //   877: ldc_w 1650067205
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w 1096032659
    //   887: l2i
    //   888: ldc_w 1572063664
    //   891: ixor
    //   892: ldc2_w -132260670
    //   895: l2i
    //   896: ldc_w -1568254385
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 928, -437108090 -> 950, -141566903 -> 884
    //   928: goto -> 932
    //   931: athrow
    //   932: invokevirtual func_78765_e : ()V
    //   935: goto -> 939
    //   938: athrow
    //   939: return
    //   940: aconst_null
    //   941: athrow
    //   942: aconst_null
    //   943: athrow
    //   944: aconst_null
    //   945: athrow
    //   946: aconst_null
    //   947: athrow
    //   948: aconst_null
    //   949: athrow
    //   950: aconst_null
    //   951: athrow
    //   952: aconst_null
    //   953: athrow
    //   954: aconst_null
    //   955: athrow
    //   956: aconst_null
    //   957: athrow
    //   958: aconst_null
    //   959: athrow
    //   960: aconst_null
    //   961: athrow
    //   962: aconst_null
    //   963: athrow
    //   964: aconst_null
    //   965: athrow
    //   966: aconst_null
    //   967: athrow
    //   968: pop
    //   969: goto -> 24
    //   972: pop
    //   973: aconst_null
    //   974: goto -> 968
    //   977: dup
    //   978: ifnull -> 968
    //   981: checkcast java/lang/Throwable
    //   984: athrow
    //   985: dup
    //   986: ifnull -> 972
    //   989: checkcast java/lang/Throwable
    //   992: athrow
    //   993: aconst_null
    //   994: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	916	0	slot	I
    // Exception table:
    //   from	to	target	type
    //   8	20	977	java/lang/NullPointerException
    //   344	350	350	finally
    //   344	350	350	java/lang/IndexOutOfBoundsException
    //   344	350	3	finally
    //   344	350	3	java/lang/EnumConstantNotPresentException
    //   344	350	350	java/lang/ArrayIndexOutOfBoundsException
    //   415	422	422	finally
    //   415	422	422	java/util/NoSuchElementException
    //   415	422	3	finally
    //   416	422	415	finally
    //   416	422	415	java/lang/ClassCastException
    //   931	938	938	finally
    //   931	938	931	finally
    //   931	938	3	finally
    //   932	938	938	finally
    //   932	938	3	finally
    //   977	985	977	finally
    //   993	995	3	finally
  }
  
  public static void switchToHotbarSlot(int slot, boolean silent) {
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
  
  public static int findItemInventorySlot(Item item, boolean offHand, boolean withXCarry) {
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
  
  public static int getEmptyXCarry() {
    return Perry1.32(null, (int)-1908910045L ^ 0xAC9EE1E6);
  }
  
  public static int getItemHotbar(Item paramItem) {
    return Perry1.4W(null, (int)-1066829499L ^ 0x9952181E, paramItem);
  }
  
  public static boolean isBlock(Item paramItem, Class paramClass) {
    return Perry1.5J(null, (int)-117665863L ^ 0xDB13FB28, paramItem, paramClass);
  }
  
  public static Map getInventoryAndHotbarSlots() {
    return Perry1.0i(null, (int)-1812498740L ^ 0xB02526DC);
  }
  
  public static int findHotbarBlock(Block paramBlock) {
    return Perry1.6e(null, (int)942892967L ^ 0x37249AAF, paramBlock);
  }
  
  public static int findBlockSlotInventory(Class clazz, boolean offHand, boolean withXCarry) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3007
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 2999
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2991
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -2044757845
    //   33: l2i
    //   34: ldc_w -1175355437
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1034971303
    //   44: l2i
    //   45: ldc_w -2033540007
    //   48: ixor
    //   49: ldc2_w -1441018050
    //   52: l2i
    //   53: ldc_w -983073379
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2970, -737771939 -> 84, 1351792091 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -502877441
    //   94: l2i
    //   95: ldc_w 1235670229
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1876828934
    //   105: l2i
    //   106: ldc_w 1590766320
    //   109: ixor
    //   110: ldc2_w -685239077
    //   113: l2i
    //   114: ldc_w -1072329793
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1130497714 -> 2934, -991028606 -> 102
    //   144: iload_1
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w -514864841
    //   154: l2i
    //   155: ldc_w -258468906
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -1529612696
    //   165: l2i
    //   166: ldc_w 718827184
    //   169: ixor
    //   170: ldc2_w 2141187854
    //   173: l2i
    //   174: ldc_w -196751812
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 2908, -1710359597 -> 162, 97630698 -> 204
    //   204: goto -> 208
    //   207: athrow
    //   208: invokestatic findInventoryBlock : (Ljava/lang/Class;Z)I
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w -420862172
    //   224: l2i
    //   225: ldc_w -2135020857
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -31939268
    //   235: l2i
    //   236: ldc_w 376836049
    //   239: ixor
    //   240: ldc2_w -952950444
    //   243: l2i
    //   244: ldc_w 228877204
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 2980, -1396486365 -> 232, 586803245 -> 276
    //   276: istore_3
    //   277: getstatic Perryc.0 : I
    //   280: ifle -> 294
    //   283: ldc2_w -1432318717
    //   286: l2i
    //   287: ldc_w -497086478
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w -1212048127
    //   297: l2i
    //   298: ldc_w 1220198422
    //   301: ixor
    //   302: ldc2_w 810600985
    //   305: l2i
    //   306: ldc_w 1305085720
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 2920, -2099146730 -> 336, 895832048 -> 294
    //   336: iload_3
    //   337: ldc2_w 734069858
    //   340: l2i
    //   341: ldc_w -734069859
    //   344: ixor
    //   345: if_icmpne -> 359
    //   348: ldc2_w 597205281
    //   351: l2i
    //   352: ldc_w 840966928
    //   355: ixor
    //   356: goto -> 367
    //   359: ldc2_w -271827590
    //   362: l2i
    //   363: ldc_w -25903288
    //   366: ixor
    //   367: ldc2_w -454194864
    //   370: l2i
    //   371: ldc_w 1845927796
    //   374: ixor
    //   375: ixor
    //   376: tableswitch default -> 348, -1689021419 -> 400, -1689021418 -> 2843
    //   400: getstatic Perryc.1 : I
    //   403: ifeq -> 417
    //   406: ldc2_w -998486248
    //   409: l2i
    //   410: ldc_w -1288055458
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w 1988676928
    //   420: l2i
    //   421: ldc_w 1408823140
    //   424: ixor
    //   425: ldc2_w 236038143
    //   428: l2i
    //   429: ldc_w 492490455
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 2926, 909855500 -> 460, 1678701422 -> 417
    //   460: iload_2
    //   461: ifeq -> 475
    //   464: ldc2_w -1853885856
    //   467: l2i
    //   468: ldc_w -1756561176
    //   471: ixor
    //   472: goto -> 483
    //   475: ldc2_w -1325994800
    //   478: l2i
    //   479: ldc_w -1228661159
    //   482: ixor
    //   483: ldc2_w 1018915318
    //   486: l2i
    //   487: ldc_w -1031402050
    //   490: ixor
    //   491: ixor
    //   492: tableswitch default -> 464, -133196096 -> 516, -133196095 -> 2843
    //   516: ldc2_w 558643778
    //   519: l2i
    //   520: ldc_w 558643779
    //   523: ixor
    //   524: getstatic Perryc.1 : I
    //   527: ifeq -> 541
    //   530: ldc2_w -1385057456
    //   533: l2i
    //   534: ldc_w -1904667183
    //   537: ixor
    //   538: goto -> 549
    //   541: ldc2_w -677765322
    //   544: l2i
    //   545: ldc_w 743633217
    //   548: ixor
    //   549: ldc2_w 1642716902
    //   552: l2i
    //   553: ldc_w 897204963
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 2948, -1352961422 -> 584, 2006661764 -> 541
    //   584: istore #4
    //   586: getstatic Perryc.0 : I
    //   589: ifle -> 603
    //   592: ldc2_w -1330086960
    //   595: l2i
    //   596: ldc_w -2077489787
    //   599: ixor
    //   600: goto -> 611
    //   603: ldc2_w -1339227103
    //   606: l2i
    //   607: ldc_w -433166046
    //   610: ixor
    //   611: ldc2_w 1251502119
    //   614: l2i
    //   615: ldc_w -1585217047
    //   618: ixor
    //   619: ixor
    //   620: lookupswitch default -> 648, -544237669 -> 2966, 1506721421 -> 603
    //   648: iload #4
    //   650: ldc2_w 1748045106
    //   653: l2i
    //   654: ldc_w 1748045111
    //   657: ixor
    //   658: if_icmpge -> 672
    //   661: ldc2_w -1674363640
    //   664: l2i
    //   665: ldc_w -1248669848
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w 639429243
    //   675: l2i
    //   676: ldc_w 264050714
    //   679: ixor
    //   680: ldc2_w -1364936121
    //   683: l2i
    //   684: ldc_w -1075719525
    //   687: ixor
    //   688: ixor
    //   689: tableswitch default -> 661, 954505916 -> 712, 954505917 -> 2843
    //   712: getstatic Perryc.c : I
    //   715: iflt -> 729
    //   718: ldc2_w -41551290
    //   721: l2i
    //   722: ldc_w 1133482163
    //   725: ixor
    //   726: goto -> 737
    //   729: ldc2_w -435833789
    //   732: l2i
    //   733: ldc_w -514650593
    //   736: ixor
    //   737: ldc2_w 1355111333
    //   740: l2i
    //   741: ldc_w -718472411
    //   744: ixor
    //   745: ixor
    //   746: lookupswitch default -> 2938, -2101404964 -> 772, 1004784245 -> 729
    //   772: getstatic bigname/zprestige/webhack/util/InventoryUtil.mc : Lnet/minecraft/client/Minecraft;
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 792
    //   781: ldc2_w -1022806130
    //   784: l2i
    //   785: ldc_w -546919000
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w -1354706293
    //   795: l2i
    //   796: ldc_w -669142365
    //   799: ixor
    //   800: ldc2_w -682481826
    //   803: l2i
    //   804: ldc_w 113534590
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 836, -839263482 -> 2910, -303121279 -> 792
    //   836: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   839: getstatic Perryc.c : I
    //   842: iflt -> 856
    //   845: ldc2_w -18716177
    //   848: l2i
    //   849: ldc_w -915748420
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w -1343075220
    //   859: l2i
    //   860: ldc_w -1047775737
    //   863: ixor
    //   864: ldc2_w 960715147
    //   867: l2i
    //   868: ldc_w 160201222
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 2928, 122127326 -> 856, 1588681190 -> 900
    //   900: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   903: getstatic Perryc.c : I
    //   906: iflt -> 920
    //   909: ldc2_w 1549527834
    //   912: l2i
    //   913: ldc_w -610481592
    //   916: ixor
    //   917: goto -> 928
    //   920: ldc2_w -343649318
    //   923: l2i
    //   924: ldc_w 623776743
    //   927: ixor
    //   928: ldc2_w -436649133
    //   931: l2i
    //   932: ldc_w 236708256
    //   935: ixor
    //   936: ixor
    //   937: lookupswitch default -> 964, 126984944 -> 920, 1814397857 -> 2930
    //   964: getfield field_75151_b : Ljava/util/List;
    //   967: getstatic Perryc.0 : I
    //   970: ifle -> 984
    //   973: ldc2_w -184187026
    //   976: l2i
    //   977: ldc_w -150804862
    //   980: ixor
    //   981: goto -> 992
    //   984: ldc2_w 698031938
    //   987: l2i
    //   988: ldc_w -1833343428
    //   991: ixor
    //   992: ldc2_w -935524293
    //   995: l2i
    //   996: ldc_w 584105746
    //   999: ixor
    //   1000: ixor
    //   1001: lookupswitch default -> 2944, -387262779 -> 984, 1372573271 -> 1028
    //   1028: iload #4
    //   1030: getstatic Perryc.c : I
    //   1033: iflt -> 1047
    //   1036: ldc2_w 486640681
    //   1039: l2i
    //   1040: ldc_w 902279240
    //   1043: ixor
    //   1044: goto -> 1055
    //   1047: ldc2_w -231544786
    //   1050: l2i
    //   1051: ldc_w 1536314987
    //   1054: ixor
    //   1055: ldc2_w -2050031701
    //   1058: l2i
    //   1059: ldc_w 1302085925
    //   1062: ixor
    //   1063: ixor
    //   1064: lookupswitch default -> 2964, -527138065 -> 1047, 1643256011 -> 1092
    //   1092: goto -> 1096
    //   1095: athrow
    //   1096: invokeinterface get : (I)Ljava/lang/Object;
    //   1101: goto -> 1105
    //   1104: athrow
    //   1105: checkcast net/minecraft/inventory/Slot
    //   1108: getstatic Perryc.1 : I
    //   1111: ifeq -> 1125
    //   1114: ldc2_w -414273523
    //   1117: l2i
    //   1118: ldc_w -690710645
    //   1121: ixor
    //   1122: goto -> 1133
    //   1125: ldc2_w -351994223
    //   1128: l2i
    //   1129: ldc_w -40528375
    //   1132: ixor
    //   1133: ldc2_w 160022947
    //   1136: l2i
    //   1137: ldc_w 337417042
    //   1140: ixor
    //   1141: ixor
    //   1142: lookupswitch default -> 2972, 184826473 -> 1168, 739210615 -> 1125
    //   1168: astore #6
    //   1170: getstatic Perryc.c : I
    //   1173: iflt -> 1187
    //   1176: ldc2_w 1588389473
    //   1179: l2i
    //   1180: ldc_w 1871887172
    //   1183: ixor
    //   1184: goto -> 1195
    //   1187: ldc2_w -422044936
    //   1190: l2i
    //   1191: ldc_w 1580432690
    //   1194: ixor
    //   1195: ldc2_w 700218494
    //   1198: l2i
    //   1199: ldc_w 2094193884
    //   1202: ixor
    //   1203: ixor
    //   1204: lookupswitch default -> 1232, 1421155534 -> 1187, 1683029383 -> 2952
    //   1232: aload #6
    //   1234: getstatic Perryc.1 : I
    //   1237: ifeq -> 1251
    //   1240: ldc2_w 1348140380
    //   1243: l2i
    //   1244: ldc_w -765009534
    //   1247: ixor
    //   1248: goto -> 1259
    //   1251: ldc2_w -783741637
    //   1254: l2i
    //   1255: ldc_w -1125441629
    //   1258: ixor
    //   1259: ldc2_w -696632712
    //   1262: l2i
    //   1263: ldc_w 589759654
    //   1266: ixor
    //   1267: ixor
    //   1268: lookupswitch default -> 2912, -1728107450 -> 1296, 2002854400 -> 1251
    //   1296: goto -> 1300
    //   1299: athrow
    //   1300: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   1303: goto -> 1307
    //   1306: athrow
    //   1307: getstatic Perryc.c : I
    //   1310: iflt -> 1324
    //   1313: ldc2_w 1701263946
    //   1316: l2i
    //   1317: ldc_w -403543300
    //   1320: ixor
    //   1321: goto -> 1332
    //   1324: ldc2_w 48729333
    //   1327: l2i
    //   1328: ldc_w -516651531
    //   1331: ixor
    //   1332: ldc2_w -509972631
    //   1335: l2i
    //   1336: ldc_w -672630191
    //   1339: ixor
    //   1340: ixor
    //   1341: lookupswitch default -> 2906, -1259911794 -> 1324, -710861768 -> 1368
    //   1368: astore #7
    //   1370: getstatic Perryc.0 : I
    //   1373: ifle -> 1387
    //   1376: ldc2_w -1995077196
    //   1379: l2i
    //   1380: ldc_w -1734314589
    //   1383: ixor
    //   1384: goto -> 1395
    //   1387: ldc2_w -1475054740
    //   1390: l2i
    //   1391: ldc_w 1708312512
    //   1394: ixor
    //   1395: ldc2_w 78496459
    //   1398: l2i
    //   1399: ldc_w 955243030
    //   1402: ixor
    //   1403: ixor
    //   1404: lookupswitch default -> 2918, -242963343 -> 1432, 771220682 -> 1387
    //   1432: aload #7
    //   1434: getstatic Perryc.1 : I
    //   1437: ifeq -> 1451
    //   1440: ldc2_w -762848492
    //   1443: l2i
    //   1444: ldc_w -568412179
    //   1447: ixor
    //   1448: goto -> 1459
    //   1451: ldc2_w 536029212
    //   1454: l2i
    //   1455: ldc_w -2142922186
    //   1458: ixor
    //   1459: ldc2_w -754099183
    //   1462: l2i
    //   1463: ldc_w 141227679
    //   1466: ixor
    //   1467: ixor
    //   1468: lookupswitch default -> 2932, -671168905 -> 1451, 1154554020 -> 1496
    //   1496: goto -> 1500
    //   1499: athrow
    //   1500: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1503: goto -> 1507
    //   1506: athrow
    //   1507: getstatic Perryc.0 : I
    //   1510: ifle -> 1524
    //   1513: ldc2_w -2034253914
    //   1516: l2i
    //   1517: ldc_w -1380025265
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w -66410145
    //   1527: l2i
    //   1528: ldc_w -211033602
    //   1531: ixor
    //   1532: ldc2_w -746533720
    //   1535: l2i
    //   1536: ldc_w 789010126
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 2946, -679061105 -> 1524, -202976569 -> 1568
    //   1568: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   1571: if_acmpne -> 1585
    //   1574: ldc2_w -371087067
    //   1577: l2i
    //   1578: ldc_w 1368814671
    //   1581: ixor
    //   1582: goto -> 1593
    //   1585: ldc2_w -17674234
    //   1588: l2i
    //   1589: ldc_w 1183157613
    //   1592: ixor
    //   1593: ldc2_w 1607381880
    //   1596: l2i
    //   1597: ldc_w 859948500
    //   1600: ixor
    //   1601: ixor
    //   1602: tableswitch default -> 1574, -721900602 -> 1624, -721900601 -> 1627
    //   1624: goto -> 2837
    //   1627: getstatic Perryc.c : I
    //   1630: iflt -> 1644
    //   1633: ldc2_w 1429710770
    //   1636: l2i
    //   1637: ldc_w 2107841954
    //   1640: ixor
    //   1641: goto -> 1652
    //   1644: ldc2_w -1745652486
    //   1647: l2i
    //   1648: ldc_w -471148562
    //   1651: ixor
    //   1652: ldc2_w 124991564
    //   1655: l2i
    //   1656: ldc_w -742336614
    //   1659: ixor
    //   1660: ixor
    //   1661: lookupswitch default -> 1688, -64531002 -> 2936, 89368040 -> 1644
    //   1688: aload #7
    //   1690: getstatic Perryc.0 : I
    //   1693: ifle -> 1707
    //   1696: ldc2_w 226727533
    //   1699: l2i
    //   1700: ldc_w -1713294565
    //   1703: ixor
    //   1704: goto -> 1715
    //   1707: ldc2_w 520654249
    //   1710: l2i
    //   1711: ldc_w -589749025
    //   1714: ixor
    //   1715: ldc2_w 159284549
    //   1718: l2i
    //   1719: ldc_w -1839584057
    //   1722: ixor
    //   1723: ixor
    //   1724: lookupswitch default -> 2978, 256308468 -> 1707, 1492515060 -> 1752
    //   1752: goto -> 1756
    //   1755: athrow
    //   1756: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   1759: goto -> 1763
    //   1762: athrow
    //   1763: getstatic Perryc.0 : I
    //   1766: ifle -> 1780
    //   1769: ldc2_w 753092389
    //   1772: l2i
    //   1773: ldc_w -513854067
    //   1776: ixor
    //   1777: goto -> 1788
    //   1780: ldc2_w -597557215
    //   1783: l2i
    //   1784: ldc_w -2100828001
    //   1787: ixor
    //   1788: ldc2_w -1349477463
    //   1791: l2i
    //   1792: ldc_w -1541933221
    //   1795: ixor
    //   1796: ixor
    //   1797: lookupswitch default -> 2968, -969204134 -> 1780, 1428325452 -> 1824
    //   1824: astore #8
    //   1826: getstatic Perryc.c : I
    //   1829: iflt -> 1843
    //   1832: ldc2_w -2096753885
    //   1835: l2i
    //   1836: ldc_w -261376169
    //   1839: ixor
    //   1840: goto -> 1851
    //   1843: ldc2_w 1861972383
    //   1846: l2i
    //   1847: ldc_w 8572268
    //   1850: ixor
    //   1851: ldc2_w 517048857
    //   1854: l2i
    //   1855: ldc_w -1120158150
    //   1858: ixor
    //   1859: ixor
    //   1860: lookupswitch default -> 2940, -845969200 -> 1888, -796422057 -> 1843
    //   1888: aload_0
    //   1889: getstatic Perryc.0 : I
    //   1892: ifle -> 1906
    //   1895: ldc2_w -304430586
    //   1898: l2i
    //   1899: ldc_w -2092546388
    //   1902: ixor
    //   1903: goto -> 1914
    //   1906: ldc2_w -1870802229
    //   1909: l2i
    //   1910: ldc_w -590568352
    //   1913: ixor
    //   1914: ldc2_w 144846209
    //   1917: l2i
    //   1918: ldc_w 1812155080
    //   1921: ixor
    //   1922: ixor
    //   1923: lookupswitch default -> 1948, -397123819 -> 1906, 171828195 -> 2950
    //   1948: aload #8
    //   1950: getstatic Perryc.1 : I
    //   1953: ifeq -> 1967
    //   1956: ldc2_w -2074272840
    //   1959: l2i
    //   1960: ldc_w 1811612095
    //   1963: ixor
    //   1964: goto -> 1975
    //   1967: ldc2_w -1011531646
    //   1970: l2i
    //   1971: ldc_w -885889805
    //   1974: ixor
    //   1975: ldc2_w -2015191692
    //   1978: l2i
    //   1979: ldc_w 431161514
    //   1982: ixor
    //   1983: ixor
    //   1984: lookupswitch default -> 2958, -1764312657 -> 2012, 1912047577 -> 1967
    //   2012: goto -> 2016
    //   2015: athrow
    //   2016: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   2019: goto -> 2023
    //   2022: athrow
    //   2023: ifeq -> 2037
    //   2026: ldc2_w 1995310472
    //   2029: l2i
    //   2030: ldc_w -543623839
    //   2033: ixor
    //   2034: goto -> 2045
    //   2037: ldc2_w -1960255866
    //   2040: l2i
    //   2041: ldc_w 576597608
    //   2044: ixor
    //   2045: ldc2_w -333372649
    //   2048: l2i
    //   2049: ldc_w -1187840275
    //   2052: ixor
    //   2053: ixor
    //   2054: tableswitch default -> 2026, -60478189 -> 2076, -60478188 -> 2204
    //   2076: getstatic Perryc.0 : I
    //   2079: ifle -> 2093
    //   2082: ldc2_w 1991189758
    //   2085: l2i
    //   2086: ldc_w 108578781
    //   2089: ixor
    //   2090: goto -> 2101
    //   2093: ldc2_w 143397509
    //   2096: l2i
    //   2097: ldc_w 1003987036
    //   2100: ixor
    //   2101: ldc2_w -1166158681
    //   2104: l2i
    //   2105: ldc_w 963039980
    //   2108: ixor
    //   2109: ixor
    //   2110: lookupswitch default -> 2960, -1337936750 -> 2136, -204675736 -> 2093
    //   2136: iload #4
    //   2138: getstatic Perryc.1 : I
    //   2141: ifeq -> 2155
    //   2144: ldc2_w 2092713791
    //   2147: l2i
    //   2148: ldc_w 1804071588
    //   2151: ixor
    //   2152: goto -> 2163
    //   2155: ldc2_w 471599157
    //   2158: l2i
    //   2159: ldc_w -819196972
    //   2162: ixor
    //   2163: ldc2_w -56370893
    //   2166: l2i
    //   2167: ldc_w -1114772987
    //   2170: ixor
    //   2171: ixor
    //   2172: lookupswitch default -> 2200, 157889267 -> 2155, 1444251309 -> 2914
    //   2200: istore_3
    //   2201: goto -> 2837
    //   2204: getstatic Perryc.0 : I
    //   2207: ifle -> 2221
    //   2210: ldc2_w -190771411
    //   2213: l2i
    //   2214: ldc_w -634472461
    //   2217: ixor
    //   2218: goto -> 2229
    //   2221: ldc2_w 1485027066
    //   2224: l2i
    //   2225: ldc_w 962260532
    //   2228: ixor
    //   2229: ldc2_w -1192336998
    //   2232: l2i
    //   2233: ldc_w -384218403
    //   2236: ixor
    //   2237: ixor
    //   2238: lookupswitch default -> 2264, 183836026 -> 2221, 2138608537 -> 2942
    //   2264: aload #8
    //   2266: instanceof net/minecraft/item/ItemBlock
    //   2269: ifeq -> 2283
    //   2272: ldc2_w -1053866297
    //   2275: l2i
    //   2276: ldc_w -1006700855
    //   2279: ixor
    //   2280: goto -> 2291
    //   2283: ldc2_w 162991098
    //   2286: l2i
    //   2287: ldc_w 191282165
    //   2290: ixor
    //   2291: ldc2_w 1089951860
    //   2294: l2i
    //   2295: ldc_w 165466978
    //   2298: ixor
    //   2299: ixor
    //   2300: tableswitch default -> 2272, 1274690328 -> 2324, 1274690329 -> 2837
    //   2324: getstatic Perryc.c : I
    //   2327: iflt -> 2341
    //   2330: ldc2_w 726241586
    //   2333: l2i
    //   2334: ldc_w 684193708
    //   2337: ixor
    //   2338: goto -> 2349
    //   2341: ldc2_w 1449941200
    //   2344: l2i
    //   2345: ldc_w 214598835
    //   2348: ixor
    //   2349: ldc2_w -1148609220
    //   2352: l2i
    //   2353: ldc_w 1597485431
    //   2356: ixor
    //   2357: ixor
    //   2358: lookupswitch default -> 2384, -416265515 -> 2974, 1506568390 -> 2341
    //   2384: aload_0
    //   2385: getstatic Perryc.0 : I
    //   2388: ifle -> 2402
    //   2391: ldc2_w 80706863
    //   2394: l2i
    //   2395: ldc_w -1744006385
    //   2398: ixor
    //   2399: goto -> 2410
    //   2402: ldc2_w 594923556
    //   2405: l2i
    //   2406: ldc_w 501495148
    //   2409: ixor
    //   2410: ldc2_w -270393502
    //   2413: l2i
    //   2414: ldc_w -391446594
    //   2417: ixor
    //   2418: ixor
    //   2419: lookupswitch default -> 2444, -1685385476 -> 2916, -564109749 -> 2402
    //   2444: aload #8
    //   2446: checkcast net/minecraft/item/ItemBlock
    //   2449: getstatic Perryc.c : I
    //   2452: iflt -> 2466
    //   2455: ldc2_w -1550387341
    //   2458: l2i
    //   2459: ldc_w -1897285455
    //   2462: ixor
    //   2463: goto -> 2474
    //   2466: ldc2_w 1557287950
    //   2469: l2i
    //   2470: ldc_w -1141830474
    //   2473: ixor
    //   2474: ldc2_w 1973013664
    //   2477: l2i
    //   2478: ldc_w 526881482
    //   2481: ixor
    //   2482: ixor
    //   2483: lookupswitch default -> 2962, -1914894638 -> 2508, 1199641000 -> 2466
    //   2508: goto -> 2512
    //   2511: athrow
    //   2512: invokevirtual func_179223_d : ()Lnet/minecraft/block/Block;
    //   2515: goto -> 2519
    //   2518: athrow
    //   2519: dup
    //   2520: getstatic Perryc.1 : I
    //   2523: ifeq -> 2537
    //   2526: ldc2_w 136529584
    //   2529: l2i
    //   2530: ldc_w 567906880
    //   2533: ixor
    //   2534: goto -> 2545
    //   2537: ldc2_w -705716443
    //   2540: l2i
    //   2541: ldc_w -527418124
    //   2544: ixor
    //   2545: ldc2_w 882983179
    //   2548: l2i
    //   2549: ldc_w -1671154845
    //   2552: ixor
    //   2553: ixor
    //   2554: lookupswitch default -> 2954, -2126535016 -> 2537, -1648700999 -> 2580
    //   2580: astore #5
    //   2582: getstatic Perryc.1 : I
    //   2585: ifeq -> 2599
    //   2588: ldc2_w -1094249245
    //   2591: l2i
    //   2592: ldc_w -1822338583
    //   2595: ixor
    //   2596: goto -> 2607
    //   2599: ldc2_w -86705299
    //   2602: l2i
    //   2603: ldc_w -1904415590
    //   2606: ixor
    //   2607: ldc2_w 665601312
    //   2610: l2i
    //   2611: ldc_w -1452897691
    //   2614: ixor
    //   2615: ixor
    //   2616: lookupswitch default -> 2644, -1553167793 -> 2956, -1250953843 -> 2599
    //   2644: goto -> 2648
    //   2647: athrow
    //   2648: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   2651: goto -> 2655
    //   2654: athrow
    //   2655: ifne -> 2669
    //   2658: ldc2_w 49041413
    //   2661: l2i
    //   2662: ldc_w -720082249
    //   2665: ixor
    //   2666: goto -> 2677
    //   2669: ldc2_w 873226637
    //   2672: l2i
    //   2673: ldc_w -470525128
    //   2676: ixor
    //   2677: ldc2_w 1086921005
    //   2680: l2i
    //   2681: ldc_w 1437607700
    //   2684: ixor
    //   2685: ixor
    //   2686: tableswitch default -> 2658, -1031732085 -> 2708, -1031732084 -> 2711
    //   2708: goto -> 2837
    //   2711: getstatic Perryc.0 : I
    //   2714: ifle -> 2728
    //   2717: ldc2_w 1082880262
    //   2720: l2i
    //   2721: ldc_w -685941516
    //   2724: ixor
    //   2725: goto -> 2736
    //   2728: ldc2_w 1011932851
    //   2731: l2i
    //   2732: ldc_w -1048864874
    //   2735: ixor
    //   2736: ldc2_w 1385595183
    //   2739: l2i
    //   2740: ldc_w -396606514
    //   2743: ixor
    //   2744: ixor
    //   2745: lookupswitch default -> 2922, 761065235 -> 2728, 1205963716 -> 2772
    //   2772: iload #4
    //   2774: getstatic Perryc.c : I
    //   2777: iflt -> 2791
    //   2780: ldc2_w -1593852324
    //   2783: l2i
    //   2784: ldc_w -1183305995
    //   2787: ixor
    //   2788: goto -> 2799
    //   2791: ldc2_w -1720611989
    //   2794: l2i
    //   2795: ldc_w 1844648609
    //   2798: ixor
    //   2799: ldc2_w 1380186623
    //   2802: l2i
    //   2803: ldc_w 942414013
    //   2806: ixor
    //   2807: ixor
    //   2808: lookupswitch default -> 2924, -1628606328 -> 2836, 1944613355 -> 2791
    //   2836: istore_3
    //   2837: iinc #4, 1
    //   2840: goto -> 586
    //   2843: getstatic Perryc.1 : I
    //   2846: ifeq -> 2860
    //   2849: ldc2_w 1884643193
    //   2852: l2i
    //   2853: ldc_w -1947723258
    //   2856: ixor
    //   2857: goto -> 2868
    //   2860: ldc2_w 1396311508
    //   2863: l2i
    //   2864: ldc_w -59888204
    //   2867: ixor
    //   2868: ldc2_w -1275570909
    //   2871: l2i
    //   2872: ldc_w 2106702232
    //   2875: ixor
    //   2876: ixor
    //   2877: lookupswitch default -> 2976, 903129540 -> 2860, 1631438043 -> 2904
    //   2904: iload_3
    //   2905: ireturn
    //   2906: aconst_null
    //   2907: athrow
    //   2908: aconst_null
    //   2909: athrow
    //   2910: aconst_null
    //   2911: athrow
    //   2912: aconst_null
    //   2913: athrow
    //   2914: aconst_null
    //   2915: athrow
    //   2916: aconst_null
    //   2917: athrow
    //   2918: aconst_null
    //   2919: athrow
    //   2920: aconst_null
    //   2921: athrow
    //   2922: aconst_null
    //   2923: athrow
    //   2924: aconst_null
    //   2925: athrow
    //   2926: aconst_null
    //   2927: athrow
    //   2928: aconst_null
    //   2929: athrow
    //   2930: aconst_null
    //   2931: athrow
    //   2932: aconst_null
    //   2933: athrow
    //   2934: aconst_null
    //   2935: athrow
    //   2936: aconst_null
    //   2937: athrow
    //   2938: aconst_null
    //   2939: athrow
    //   2940: aconst_null
    //   2941: athrow
    //   2942: aconst_null
    //   2943: athrow
    //   2944: aconst_null
    //   2945: athrow
    //   2946: aconst_null
    //   2947: athrow
    //   2948: aconst_null
    //   2949: athrow
    //   2950: aconst_null
    //   2951: athrow
    //   2952: aconst_null
    //   2953: athrow
    //   2954: aconst_null
    //   2955: athrow
    //   2956: aconst_null
    //   2957: athrow
    //   2958: aconst_null
    //   2959: athrow
    //   2960: aconst_null
    //   2961: athrow
    //   2962: aconst_null
    //   2963: athrow
    //   2964: aconst_null
    //   2965: athrow
    //   2966: aconst_null
    //   2967: athrow
    //   2968: aconst_null
    //   2969: athrow
    //   2970: aconst_null
    //   2971: athrow
    //   2972: aconst_null
    //   2973: athrow
    //   2974: aconst_null
    //   2975: athrow
    //   2976: aconst_null
    //   2977: athrow
    //   2978: aconst_null
    //   2979: athrow
    //   2980: aconst_null
    //   2981: athrow
    //   2982: pop
    //   2983: goto -> 24
    //   2986: pop
    //   2987: aconst_null
    //   2988: goto -> 2982
    //   2991: dup
    //   2992: ifnull -> 2982
    //   2995: checkcast java/lang/Throwable
    //   2998: athrow
    //   2999: dup
    //   3000: ifnull -> 2986
    //   3003: checkcast java/lang/Throwable
    //   3006: athrow
    //   3007: aconst_null
    //   3008: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2582	255	5	block	Lnet/minecraft/block/Block;
    //   1170	1667	6	craftingSlot	Lnet/minecraft/inventory/Slot;
    //   1370	1467	7	craftingStack	Lnet/minecraft/item/ItemStack;
    //   1826	1011	8	craftingStackItem	Lnet/minecraft/item/Item;
    //   586	2257	4	i	I
    //   24	2882	0	clazz	Ljava/lang/Class;
    //   24	2882	1	offHand	Z
    //   24	2882	2	withXCarry	Z
    //   277	2629	3	slot	I
    // Exception table:
    //   from	to	target	type
    //   8	20	2991	finally
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	214	java/lang/NullPointerException
    //   208	214	3	finally
    //   208	214	214	java/lang/StringIndexOutOfBoundsException
    //   1095	1104	1104	finally
    //   1095	1104	1095	java/lang/NumberFormatException
    //   1095	1104	3	finally
    //   1096	1104	3	finally
    //   1096	1104	3	java/lang/AssertionError
    //   1300	1306	1306	finally
    //   1300	1306	3	java/lang/IllegalStateException
    //   1300	1306	1306	finally
    //   1300	1306	3	finally
    //   1300	1306	1306	java/lang/EnumConstantNotPresentException
    //   1499	1506	1506	finally
    //   1499	1506	3	java/lang/IllegalStateException
    //   1499	1506	3	finally
    //   1500	1506	1506	java/lang/IndexOutOfBoundsException
    //   1500	1506	1499	finally
    //   1755	1762	1762	finally
    //   1755	1762	1755	finally
    //   1756	1762	3	finally
    //   1756	1762	1755	finally
    //   1756	1762	3	finally
    //   2015	2022	2022	finally
    //   2015	2022	2015	finally
    //   2015	2022	3	finally
    //   2015	2022	3	java/lang/ClassCastException
    //   2016	2022	3	java/lang/NullPointerException
    //   2511	2518	2518	finally
    //   2511	2518	2518	java/lang/ClassCastException
    //   2511	2518	3	finally
    //   2512	2518	3	java/lang/NegativeArraySizeException
    //   2512	2518	2511	finally
    //   2647	2654	2654	finally
    //   2647	2654	2647	java/lang/UnsupportedOperationException
    //   2648	2654	3	finally
    //   2648	2654	2647	java/lang/EnumConstantNotPresentException
    //   2648	2654	2654	java/lang/ClassCastException
    //   2991	2999	2991	finally
    //   3007	3009	3	finally
  }
  
  public static boolean holdingItem(Class paramClass) {
    return Perry1.0C(null, (int)412127621L ^ 0x4CBA3A62, paramClass);
  }
  
  public static boolean[] switchItemToItem(boolean back, int lastHotbarSlot, boolean switchedItem, InventoryUtil$Switch mode, Item item) {
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
  
  public static boolean isInstanceOf(ItemStack stack, Class clazz) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1154
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1146
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1138
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1836699111
    //   33: l2i
    //   34: ldc_w 1118342930
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 304382954
    //   44: l2i
    //   45: ldc_w -2041831575
    //   48: ixor
    //   49: ldc2_w -418415080
    //   52: l2i
    //   53: ldc_w 2030673866
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 162162862 -> 41, 1311268057 -> 1115
    //   84: aload_0
    //   85: ifnonnull -> 99
    //   88: ldc2_w 294470851
    //   91: l2i
    //   92: ldc_w 1267083607
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w -926536412
    //   102: l2i
    //   103: ldc_w -1832042317
    //   106: ixor
    //   107: ldc2_w -1053245824
    //   110: l2i
    //   111: ldc_w 1455754153
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, -839460675 -> 140, -839460674 -> 149
    //   140: ldc2_w 1899765847
    //   143: l2i
    //   144: ldc_w 1899765847
    //   147: ixor
    //   148: ireturn
    //   149: getstatic Perryc.0 : I
    //   152: ifle -> 166
    //   155: ldc2_w -2100422793
    //   158: l2i
    //   159: ldc_w -1588035496
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w 400545080
    //   169: l2i
    //   170: ldc_w -844031917
    //   173: ixor
    //   174: ldc2_w -804764475
    //   177: l2i
    //   178: ldc_w -1020363258
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 1121, -917964888 -> 208, 816885228 -> 166
    //   208: aload_0
    //   209: getstatic Perryc.1 : I
    //   212: ifeq -> 226
    //   215: ldc2_w -1945437818
    //   218: l2i
    //   219: ldc_w -1602194388
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -631518883
    //   229: l2i
    //   230: ldc_w -552888051
    //   233: ixor
    //   234: ldc2_w 1835873595
    //   237: l2i
    //   238: ldc_w 1180128830
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 1107, 129035951 -> 226, 778711893 -> 268
    //   268: goto -> 272
    //   271: athrow
    //   272: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   275: goto -> 279
    //   278: athrow
    //   279: getstatic Perryc.c : I
    //   282: iflt -> 296
    //   285: ldc2_w 2143615244
    //   288: l2i
    //   289: ldc_w 957957396
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -1794842236
    //   299: l2i
    //   300: ldc_w 510238756
    //   303: ixor
    //   304: ldc2_w 507467714
    //   307: l2i
    //   308: ldc_w 963340846
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 1127, -1405518772 -> 340, 1636401652 -> 296
    //   340: astore_2
    //   341: getstatic Perryc.1 : I
    //   344: ifeq -> 358
    //   347: ldc2_w 565132478
    //   350: l2i
    //   351: ldc_w 2038456351
    //   354: ixor
    //   355: goto -> 366
    //   358: ldc2_w 159184867
    //   361: l2i
    //   362: ldc_w 1618336736
    //   365: ixor
    //   366: ldc2_w -2036588224
    //   369: l2i
    //   370: ldc_w 729963501
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 1113, -1005103442 -> 400, -181328372 -> 358
    //   400: aload_1
    //   401: getstatic Perryc.c : I
    //   404: iflt -> 418
    //   407: ldc2_w -297542238
    //   410: l2i
    //   411: ldc_w 316470735
    //   414: ixor
    //   415: goto -> 426
    //   418: ldc2_w -919547134
    //   421: l2i
    //   422: ldc_w 636668235
    //   425: ixor
    //   426: ldc2_w -927729670
    //   429: l2i
    //   430: ldc_w 1623405580
    //   433: ixor
    //   434: ixor
    //   435: lookupswitch default -> 460, -1904691248 -> 418, 1425009563 -> 1103
    //   460: aload_2
    //   461: getstatic Perryc.0 : I
    //   464: ifle -> 478
    //   467: ldc2_w 240482579
    //   470: l2i
    //   471: ldc_w 97173428
    //   474: ixor
    //   475: goto -> 486
    //   478: ldc2_w 898508870
    //   481: l2i
    //   482: ldc_w 125434608
    //   485: ixor
    //   486: ldc2_w -886991333
    //   489: l2i
    //   490: ldc_w -782359495
    //   493: ixor
    //   494: ixor
    //   495: lookupswitch default -> 1109, 299922565 -> 478, 680026260 -> 520
    //   520: goto -> 524
    //   523: athrow
    //   524: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   527: goto -> 531
    //   530: athrow
    //   531: ifeq -> 545
    //   534: ldc2_w -333283805
    //   537: l2i
    //   538: ldc_w -2003193938
    //   541: ixor
    //   542: goto -> 553
    //   545: ldc2_w 1315069140
    //   548: l2i
    //   549: ldc_w 718900570
    //   552: ixor
    //   553: ldc2_w -1832258229
    //   556: l2i
    //   557: ldc_w -1517446089
    //   560: ixor
    //   561: ixor
    //   562: tableswitch default -> 534, 1409267953 -> 584, 1409267954 -> 593
    //   584: ldc2_w 910741374
    //   587: l2i
    //   588: ldc_w 910741375
    //   591: ixor
    //   592: ireturn
    //   593: getstatic Perryc.1 : I
    //   596: ifeq -> 610
    //   599: ldc2_w -760295563
    //   602: l2i
    //   603: ldc_w -338213699
    //   606: ixor
    //   607: goto -> 618
    //   610: ldc2_w -118493632
    //   613: l2i
    //   614: ldc_w 551949717
    //   617: ixor
    //   618: ldc2_w -1001641577
    //   621: l2i
    //   622: ldc_w -779990032
    //   625: ixor
    //   626: ixor
    //   627: lookupswitch default -> 652, 750250415 -> 1123, 1504700718 -> 610
    //   652: aload_2
    //   653: instanceof net/minecraft/item/ItemBlock
    //   656: ifeq -> 670
    //   659: ldc2_w 1509026542
    //   662: l2i
    //   663: ldc_w -1784051375
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -2040884369
    //   673: l2i
    //   674: ldc_w 1241706671
    //   677: ixor
    //   678: ldc2_w -1285355193
    //   681: l2i
    //   682: ldc_w 1069062727
    //   685: ixor
    //   686: ixor
    //   687: tableswitch default -> 659, 1082388671 -> 708, 1082388672 -> 1092
    //   708: getstatic Perryc.1 : I
    //   711: ifeq -> 725
    //   714: ldc2_w 15493755
    //   717: l2i
    //   718: ldc_w 1305343237
    //   721: ixor
    //   722: goto -> 733
    //   725: ldc2_w -299959595
    //   728: l2i
    //   729: ldc_w -1157941427
    //   732: ixor
    //   733: ldc2_w -186551311
    //   736: l2i
    //   737: ldc_w 1102064665
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 768, -126828394 -> 1117, -116165342 -> 725
    //   768: aload_2
    //   769: getstatic Perryc.0 : I
    //   772: ifle -> 786
    //   775: ldc2_w -325729842
    //   778: l2i
    //   779: ldc_w 493180958
    //   782: ixor
    //   783: goto -> 794
    //   786: ldc2_w 366975373
    //   789: l2i
    //   790: ldc_w 1360487177
    //   793: ixor
    //   794: ldc2_w 925294910
    //   797: l2i
    //   798: ldc_w -1800364912
    //   801: ixor
    //   802: ixor
    //   803: lookupswitch default -> 1101, -413235414 -> 828, 1382474878 -> 786
    //   828: goto -> 832
    //   831: athrow
    //   832: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
    //   835: goto -> 839
    //   838: athrow
    //   839: getstatic Perryc.0 : I
    //   842: ifle -> 856
    //   845: ldc2_w -1747678097
    //   848: l2i
    //   849: ldc_w 227250098
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w -1580307394
    //   859: l2i
    //   860: ldc_w 1415015456
    //   863: ixor
    //   864: ldc2_w -845206773
    //   867: l2i
    //   868: ldc_w -621380100
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 900, -1925819094 -> 1111, -175821446 -> 856
    //   900: astore_3
    //   901: getstatic Perryc.0 : I
    //   904: ifle -> 918
    //   907: ldc2_w -1967944448
    //   910: l2i
    //   911: ldc_w -167538910
    //   914: ixor
    //   915: goto -> 926
    //   918: ldc2_w -1453300507
    //   921: l2i
    //   922: ldc_w 580146258
    //   925: ixor
    //   926: ldc2_w 66927130
    //   929: l2i
    //   930: ldc_w -813834951
    //   933: ixor
    //   934: ixor
    //   935: lookupswitch default -> 1125, -1338972927 -> 918, 1198839700 -> 960
    //   960: aload_1
    //   961: getstatic Perryc.0 : I
    //   964: ifle -> 978
    //   967: ldc2_w 569171777
    //   970: l2i
    //   971: ldc_w -2123428220
    //   974: ixor
    //   975: goto -> 986
    //   978: ldc2_w 645504608
    //   981: l2i
    //   982: ldc_w 503096604
    //   985: ixor
    //   986: ldc2_w 148668003
    //   989: l2i
    //   990: ldc_w 598526697
    //   993: ixor
    //   994: ixor
    //   995: lookupswitch default -> 1020, -1946983089 -> 1105, -1065931115 -> 978
    //   1020: aload_3
    //   1021: getstatic Perryc.c : I
    //   1024: iflt -> 1038
    //   1027: ldc2_w -962769604
    //   1030: l2i
    //   1031: ldc_w 493610706
    //   1034: ixor
    //   1035: goto -> 1046
    //   1038: ldc2_w 1850524335
    //   1041: l2i
    //   1042: ldc_w -2048038755
    //   1045: ixor
    //   1046: ldc2_w 1330906140
    //   1049: l2i
    //   1050: ldc_w 477481920
    //   1053: ixor
    //   1054: ixor
    //   1055: lookupswitch default -> 1119, -1999150030 -> 1038, -1199544850 -> 1080
    //   1080: goto -> 1084
    //   1083: athrow
    //   1084: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   1087: goto -> 1091
    //   1090: athrow
    //   1091: ireturn
    //   1092: ldc2_w -426086788
    //   1095: l2i
    //   1096: ldc_w -426086788
    //   1099: ixor
    //   1100: ireturn
    //   1101: aconst_null
    //   1102: athrow
    //   1103: aconst_null
    //   1104: athrow
    //   1105: aconst_null
    //   1106: athrow
    //   1107: aconst_null
    //   1108: athrow
    //   1109: aconst_null
    //   1110: athrow
    //   1111: aconst_null
    //   1112: athrow
    //   1113: aconst_null
    //   1114: athrow
    //   1115: aconst_null
    //   1116: athrow
    //   1117: aconst_null
    //   1118: athrow
    //   1119: aconst_null
    //   1120: athrow
    //   1121: aconst_null
    //   1122: athrow
    //   1123: aconst_null
    //   1124: athrow
    //   1125: aconst_null
    //   1126: athrow
    //   1127: aconst_null
    //   1128: athrow
    //   1129: pop
    //   1130: goto -> 24
    //   1133: pop
    //   1134: aconst_null
    //   1135: goto -> 1129
    //   1138: dup
    //   1139: ifnull -> 1129
    //   1142: checkcast java/lang/Throwable
    //   1145: athrow
    //   1146: dup
    //   1147: ifnull -> 1133
    //   1150: checkcast java/lang/Throwable
    //   1153: athrow
    //   1154: aconst_null
    //   1155: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   901	191	3	block	Lnet/minecraft/block/Block;
    //   24	1077	0	stack	Lnet/minecraft/item/ItemStack;
    //   24	1077	1	clazz	Ljava/lang/Class;
    //   341	760	2	item	Lnet/minecraft/item/Item;
    // Exception table:
    //   from	to	target	type
    //   8	20	1138	finally
    //   271	278	278	finally
    //   271	278	3	finally
    //   271	278	3	finally
    //   272	278	271	java/lang/IndexOutOfBoundsException
    //   272	278	278	finally
    //   523	530	530	finally
    //   523	530	530	finally
    //   523	530	523	finally
    //   523	530	3	java/lang/IllegalStateException
    //   524	530	523	finally
    //   831	838	838	finally
    //   832	838	838	finally
    //   832	838	3	finally
    //   832	838	831	java/lang/NullPointerException
    //   832	838	838	java/lang/EnumConstantNotPresentException
    //   1083	1090	1090	finally
    //   1083	1090	3	finally
    //   1084	1090	1083	finally
    //   1084	1090	1090	java/lang/ClassCastException
    //   1084	1090	3	finally
    //   1138	1146	1138	finally
    //   1154	1156	3	finally
  }
  
  public static boolean areStacksCompatible(ItemStack stack1, ItemStack stack2) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\InventoryUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */