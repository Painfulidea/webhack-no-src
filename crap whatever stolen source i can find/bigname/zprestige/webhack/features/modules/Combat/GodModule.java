package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GodModule extends Module {
  public Setting<Integer> rotations;
  
  public Setting<Boolean> rotate;
  
  public int rotationPacketsSpoofed;
  
  public float yaw;
  
  public int highestID;
  
  public Setting<Boolean> checkPos;
  
  public Setting<Boolean> entitycheck;
  
  public Setting<Boolean> antiIllegal;
  
  public boolean rotating;
  
  public Setting<Boolean> oneDot15;
  
  public Setting<Integer> attacks;
  
  public float pitch;
  
  public Setting<Boolean> render;
  
  public Setting<Integer> delay;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public GodModule() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -59776995
    //   9: l2i
    //   10: ldc 980670355
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -270594621
    //   19: l2i
    //   20: ldc -950031668
    //   22: ixor
    //   23: ldc2_w -1242882855
    //   26: l2i
    //   27: ldc 624479992
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 1239821884 -> 16, 1456465327 -> 5292
    //   56: aload_0
    //   57: ldc '憸㌜懱㶚촓輧๬᰾蹦'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -874804735
    //   68: l2i
    //   69: ldc 298571324
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1716941440
    //   78: l2i
    //   79: ldc 1966298093
    //   81: ixor
    //   82: ldc2_w 25569490
    //   85: l2i
    //   86: ldc -976199734
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, 398873620 -> 75, 507915045 -> 5262
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '憨㌜懢'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 974408745
    //   130: l2i
    //   131: ldc 468886224
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 465934399
    //   140: l2i
    //   141: ldc 1586033282
    //   143: ixor
    //   144: ldc2_w 1212145423
    //   147: l2i
    //   148: ldc -334702427
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -2049578669 -> 5320, -1478219244 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 1161161443
    //   192: l2i
    //   193: ldc 1195927304
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -598930522
    //   202: l2i
    //   203: ldc -2080338036
    //   205: ixor
    //   206: ldc2_w 545457289
    //   209: l2i
    //   210: ldc -1819684863
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1317578397 -> 5352, 801807344 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1229457097
    //   246: l2i
    //   247: ldc 1229457096
    //   249: ixor
    //   250: ldc2_w -1424332212
    //   253: l2i
    //   254: ldc -1424332212
    //   256: ixor
    //   257: ldc2_w 1771089707
    //   260: l2i
    //   261: ldc 1771089707
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 451661835
    //   273: l2i
    //   274: ldc 643337983
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 241896007
    //   283: l2i
    //   284: ldc -1031241118
    //   286: ixor
    //   287: ldc2_w -1584214393
    //   290: l2i
    //   291: ldc 1990463814
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 5238, -343572171 -> 280, 466966500 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w -1792260206
    //   332: l2i
    //   333: ldc -987511515
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1374040157
    //   342: l2i
    //   343: ldc -690801305
    //   345: ixor
    //   346: ldc2_w 1295580382
    //   349: l2i
    //   350: ldc -1258912395
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 5376, -2130410641 -> 380, -1446905060 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w -2013904973
    //   390: l2i
    //   391: ldc -1510772840
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 1022752215
    //   400: l2i
    //   401: ldc 1717226931
    //   403: ixor
    //   404: ldc2_w -1622053929
    //   407: l2i
    //   408: ldc 2119152558
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 5358, -1145970659 -> 440, -1021605806 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '憬㌃懺㶸촚輰'
    //   447: getstatic Perryc.c : I
    //   450: iflt -> 463
    //   453: ldc2_w 2009886891
    //   456: l2i
    //   457: ldc -514230221
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 664986300
    //   466: l2i
    //   467: ldc -2036194447
    //   469: ixor
    //   470: ldc2_w -992168251
    //   473: l2i
    //   474: ldc -708401555
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 5264, -2020665296 -> 463, -1340419739 -> 504
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w 1849210506
    //   510: l2i
    //   511: ldc 1849210507
    //   513: ixor
    //   514: getstatic Perryc.0 : I
    //   517: ifle -> 530
    //   520: ldc2_w -1192155705
    //   523: l2i
    //   524: ldc -561847575
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -238986510
    //   533: l2i
    //   534: ldc 1957430785
    //   536: ixor
    //   537: ldc2_w 911949435
    //   540: l2i
    //   541: ldc 637661206
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 572, -1597194191 -> 530, 1982400835 -> 5346
    //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   575: ldc2_w -918540706
    //   578: l2i
    //   579: ldc -918540705
    //   581: ixor
    //   582: getstatic Perryc.c : I
    //   585: iflt -> 598
    //   588: ldc2_w 1844249711
    //   591: l2i
    //   592: ldc 156752933
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w 395011505
    //   601: l2i
    //   602: ldc -1053840389
    //   604: ixor
    //   605: ldc2_w -813864488
    //   608: l2i
    //   609: ldc 1802117507
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 5360, -1062367215 -> 598, 1924367889 -> 640
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: ldc2_w -1119272302
    //   646: l2i
    //   647: ldc -1119272314
    //   649: ixor
    //   650: getstatic Perryc.c : I
    //   653: iflt -> 666
    //   656: ldc2_w 908793000
    //   659: l2i
    //   660: ldc -276528638
    //   662: ixor
    //   663: goto -> 673
    //   666: ldc2_w 1159088774
    //   669: l2i
    //   670: ldc 1703868685
    //   672: ixor
    //   673: ldc2_w 733372795
    //   676: l2i
    //   677: ldc -632183516
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 5350, -780175404 -> 708, 675828469 -> 666
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: getstatic Perryc.c : I
    //   714: iflt -> 727
    //   717: ldc2_w -1571428629
    //   720: l2i
    //   721: ldc -680256587
    //   723: ixor
    //   724: goto -> 734
    //   727: ldc2_w 1389249219
    //   730: l2i
    //   731: ldc 864116803
    //   733: ixor
    //   734: ldc2_w 1879155656
    //   737: l2i
    //   738: ldc 1070025633
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 5280, 780782313 -> 768, 988222775 -> 727
    //   768: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   771: getstatic Perryc.0 : I
    //   774: ifle -> 787
    //   777: ldc2_w 1246695803
    //   780: l2i
    //   781: ldc -1450753735
    //   783: ixor
    //   784: goto -> 794
    //   787: ldc2_w 1774016680
    //   790: l2i
    //   791: ldc -1525182181
    //   793: ixor
    //   794: ldc2_w -1115722986
    //   797: l2i
    //   798: ldc -1361268214
    //   800: ixor
    //   801: ixor
    //   802: lookupswitch default -> 5232, -553054033 -> 828, -261387938 -> 787
    //   828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   831: getstatic Perryc.1 : I
    //   834: ifeq -> 847
    //   837: ldc2_w -1435325503
    //   840: l2i
    //   841: ldc -1029335809
    //   843: ixor
    //   844: goto -> 854
    //   847: ldc2_w -482969223
    //   850: l2i
    //   851: ldc 1401452881
    //   853: ixor
    //   854: ldc2_w -1565639401
    //   857: l2i
    //   858: ldc -1452475444
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 5270, -1149450509 -> 888, 1662384613 -> 847
    //   888: putfield rotations : Lbigname/zprestige/webhack/features/setting/Setting;
    //   891: getstatic Perryc.c : I
    //   894: iflt -> 907
    //   897: ldc2_w 959286238
    //   900: l2i
    //   901: ldc -184208515
    //   903: ixor
    //   904: goto -> 914
    //   907: ldc2_w 1489227600
    //   910: l2i
    //   911: ldc -1276890913
    //   913: ixor
    //   914: ldc2_w -192183272
    //   917: l2i
    //   918: ldc -296989689
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 5380, -688951108 -> 907, -236963952 -> 948
    //   948: aload_0
    //   949: getstatic Perryc.1 : I
    //   952: ifeq -> 965
    //   955: ldc2_w -1617081317
    //   958: l2i
    //   959: ldc 348973022
    //   961: ixor
    //   962: goto -> 972
    //   965: ldc2_w -1438364277
    //   968: l2i
    //   969: ldc 1775312813
    //   971: ixor
    //   972: ldc2_w 912401979
    //   975: l2i
    //   976: ldc -93680443
    //   978: ixor
    //   979: ixor
    //   980: lookupswitch default -> 1008, 537545293 -> 965, 1197015355 -> 5382
    //   1008: aload_0
    //   1009: new bigname/zprestige/webhack/features/setting/Setting
    //   1012: dup
    //   1013: ldc '憭㌜懡㶶초輦'
    //   1015: getstatic Perryc.0 : I
    //   1018: ifle -> 1031
    //   1021: ldc2_w 180972849
    //   1024: l2i
    //   1025: ldc 1811297089
    //   1027: ixor
    //   1028: goto -> 1038
    //   1031: ldc2_w -543983956
    //   1034: l2i
    //   1035: ldc -1140752830
    //   1037: ixor
    //   1038: ldc2_w 2054095947
    //   1041: l2i
    //   1042: ldc -464437027
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 5334, -39039880 -> 1072, -16704794 -> 1031
    //   1072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1075: ldc2_w 1777696559
    //   1078: l2i
    //   1079: ldc 1777696559
    //   1081: ixor
    //   1082: getstatic Perryc.0 : I
    //   1085: ifle -> 1099
    //   1088: ldc2_w 699459458
    //   1091: l2i
    //   1092: ldc_w -190847372
    //   1095: ixor
    //   1096: goto -> 1107
    //   1099: ldc2_w 1336992687
    //   1102: l2i
    //   1103: ldc_w 35503724
    //   1106: ixor
    //   1107: ldc2_w 982331700
    //   1110: l2i
    //   1111: ldc_w 1042760188
    //   1114: ixor
    //   1115: ixor
    //   1116: lookupswitch default -> 1144, -1586567056 -> 1099, -645566146 -> 5290
    //   1144: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w 538282566
    //   1156: l2i
    //   1157: ldc_w -1831242373
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -1733243454
    //   1167: l2i
    //   1168: ldc_w 905314930
    //   1171: ixor
    //   1172: ldc2_w -1566409910
    //   1175: l2i
    //   1176: ldc_w -330700843
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 5348, -475180241 -> 1208, -64527454 -> 1164
    //   1208: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1211: getstatic Perryc.1 : I
    //   1214: ifeq -> 1228
    //   1217: ldc2_w 242229704
    //   1220: l2i
    //   1221: ldc_w 914498110
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w -1818567938
    //   1231: l2i
    //   1232: ldc_w 181615530
    //   1235: ixor
    //   1236: ldc2_w -831120551
    //   1239: l2i
    //   1240: ldc_w -1770222694
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, 743616661 -> 1228, 1626903349 -> 5268
    //   1272: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1275: getstatic Perryc.c : I
    //   1278: iflt -> 1292
    //   1281: ldc2_w 1755099943
    //   1284: l2i
    //   1285: ldc_w -2095736275
    //   1288: ixor
    //   1289: goto -> 1300
    //   1292: ldc2_w -735575027
    //   1295: l2i
    //   1296: ldc_w -99930598
    //   1299: ixor
    //   1300: ldc2_w -658134959
    //   1303: l2i
    //   1304: ldc_w -933895041
    //   1307: ixor
    //   1308: ixor
    //   1309: lookupswitch default -> 1336, -82221788 -> 5246, -15373389 -> 1292
    //   1336: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1339: getstatic Perryc.0 : I
    //   1342: ifle -> 1356
    //   1345: ldc2_w -863204799
    //   1348: l2i
    //   1349: ldc_w -1623044826
    //   1352: ixor
    //   1353: goto -> 1364
    //   1356: ldc2_w 1114581182
    //   1359: l2i
    //   1360: ldc_w -155936351
    //   1363: ixor
    //   1364: ldc2_w -1999575140
    //   1367: l2i
    //   1368: ldc_w 2019130237
    //   1371: ixor
    //   1372: ixor
    //   1373: lookupswitch default -> 1400, -1555604602 -> 5236, 148444632 -> 1356
    //   1400: aload_0
    //   1401: getstatic Perryc.1 : I
    //   1404: ifeq -> 1418
    //   1407: ldc2_w -1990345567
    //   1410: l2i
    //   1411: ldc_w 1552639634
    //   1414: ixor
    //   1415: goto -> 1426
    //   1418: ldc2_w 53406628
    //   1421: l2i
    //   1422: ldc_w 221695716
    //   1425: ixor
    //   1426: ldc2_w 1517034358
    //   1429: l2i
    //   1430: ldc_w -111232003
    //   1433: ixor
    //   1434: ixor
    //   1435: lookupswitch default -> 1460, -52420330 -> 1418, 1994685112 -> 5240
    //   1460: aload_0
    //   1461: new bigname/zprestige/webhack/features/setting/Setting
    //   1464: dup
    //   1465: ldc_w '憭㌖懻㶳촙輱'
    //   1468: getstatic Perryc.c : I
    //   1471: iflt -> 1485
    //   1474: ldc2_w 1692797055
    //   1477: l2i
    //   1478: ldc_w 1405446385
    //   1481: ixor
    //   1482: goto -> 1493
    //   1485: ldc2_w -1007314318
    //   1488: l2i
    //   1489: ldc_w -284454751
    //   1492: ixor
    //   1493: ldc2_w 935690838
    //   1496: l2i
    //   1497: ldc_w 1281918286
    //   1500: ixor
    //   1501: ixor
    //   1502: lookupswitch default -> 1528, -1214702898 -> 1485, 1284401046 -> 5284
    //   1528: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1531: ldc2_w -1485054942
    //   1534: l2i
    //   1535: ldc_w -1485054942
    //   1538: ixor
    //   1539: getstatic Perryc.0 : I
    //   1542: ifle -> 1556
    //   1545: ldc2_w -597998140
    //   1548: l2i
    //   1549: ldc_w -2104721236
    //   1552: ixor
    //   1553: goto -> 1564
    //   1556: ldc2_w 2012679361
    //   1559: l2i
    //   1560: ldc_w -1955604533
    //   1563: ixor
    //   1564: ldc2_w 891370799
    //   1567: l2i
    //   1568: ldc_w -28688651
    //   1571: ixor
    //   1572: ixor
    //   1573: lookupswitch default -> 5322, -1782790478 -> 1556, 938727632 -> 1600
    //   1600: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1603: getstatic Perryc.0 : I
    //   1606: ifle -> 1620
    //   1609: ldc2_w -2014929006
    //   1612: l2i
    //   1613: ldc_w 128306342
    //   1616: ixor
    //   1617: goto -> 1628
    //   1620: ldc2_w -2115792812
    //   1623: l2i
    //   1624: ldc_w -1656750895
    //   1627: ixor
    //   1628: ldc2_w 343026162
    //   1631: l2i
    //   1632: ldc_w 147204999
    //   1635: ixor
    //   1636: ixor
    //   1637: lookupswitch default -> 1664, -1661513407 -> 5254, -259169836 -> 1620
    //   1664: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1667: getstatic Perryc.c : I
    //   1670: iflt -> 1684
    //   1673: ldc2_w 1386900632
    //   1676: l2i
    //   1677: ldc_w 2142024532
    //   1680: ixor
    //   1681: goto -> 1692
    //   1684: ldc2_w -89528424
    //   1687: l2i
    //   1688: ldc_w 1028303465
    //   1691: ixor
    //   1692: ldc2_w -877845652
    //   1695: l2i
    //   1696: ldc_w -167795983
    //   1699: ixor
    //   1700: ixor
    //   1701: lookupswitch default -> 1728, -1944590546 -> 1684, 324296273 -> 5288
    //   1728: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1731: getstatic Perryc.1 : I
    //   1734: ifeq -> 1748
    //   1737: ldc2_w 1358080719
    //   1740: l2i
    //   1741: ldc_w 2141189215
    //   1744: ixor
    //   1745: goto -> 1756
    //   1748: ldc2_w 499037754
    //   1751: l2i
    //   1752: ldc_w -1293479189
    //   1755: ixor
    //   1756: ldc2_w 1942387472
    //   1759: l2i
    //   1760: ldc_w 1791951286
    //   1763: ixor
    //   1764: ixor
    //   1765: lookupswitch default -> 1792, -828230094 -> 1748, 912532534 -> 5282
    //   1792: putfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1795: getstatic Perryc.1 : I
    //   1798: ifeq -> 1812
    //   1801: ldc2_w 266400846
    //   1804: l2i
    //   1805: ldc_w 171785931
    //   1808: ixor
    //   1809: goto -> 1820
    //   1812: ldc2_w -2128564943
    //   1815: l2i
    //   1816: ldc_w 1589613668
    //   1819: ixor
    //   1820: ldc2_w -1640659836
    //   1823: l2i
    //   1824: ldc_w -2125833305
    //   1827: ixor
    //   1828: ixor
    //   1829: lookupswitch default -> 1856, -1377499740 -> 1812, 446829990 -> 5338
    //   1856: aload_0
    //   1857: getstatic Perryc.c : I
    //   1860: iflt -> 1874
    //   1863: ldc2_w 1672637064
    //   1866: l2i
    //   1867: ldc_w -740734418
    //   1870: ixor
    //   1871: goto -> 1882
    //   1874: ldc2_w -1461379773
    //   1877: l2i
    //   1878: ldc_w 841741221
    //   1881: ixor
    //   1882: ldc2_w -1080270650
    //   1885: l2i
    //   1886: ldc_w -1923196675
    //   1889: ixor
    //   1890: ixor
    //   1891: lookupswitch default -> 1916, -2102847331 -> 5384, 155282193 -> 1874
    //   1916: aload_0
    //   1917: new bigname/zprestige/webhack/features/setting/Setting
    //   1920: dup
    //   1921: ldc_w '憾㌝懡㶾촵輯๵᰷蹤釣?'
    //   1924: getstatic Perryc.0 : I
    //   1927: ifle -> 1941
    //   1930: ldc2_w -1557212970
    //   1933: l2i
    //   1934: ldc_w -1476229379
    //   1937: ixor
    //   1938: goto -> 1949
    //   1941: ldc2_w 18853757
    //   1944: l2i
    //   1945: ldc_w 2028020355
    //   1948: ixor
    //   1949: ldc2_w -2128403291
    //   1952: l2i
    //   1953: ldc_w 1544907040
    //   1956: ixor
    //   1957: ixor
    //   1958: lookupswitch default -> 1984, -702932050 -> 5276, 153614978 -> 1941
    //   1984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1987: ldc2_w 723383640
    //   1990: l2i
    //   1991: ldc_w 723383641
    //   1994: ixor
    //   1995: getstatic Perryc.0 : I
    //   1998: ifle -> 2012
    //   2001: ldc2_w -117766767
    //   2004: l2i
    //   2005: ldc_w 1611582326
    //   2008: ixor
    //   2009: goto -> 2020
    //   2012: ldc2_w 1426192415
    //   2015: l2i
    //   2016: ldc_w -1302122473
    //   2019: ixor
    //   2020: ldc2_w -1217191209
    //   2023: l2i
    //   2024: ldc_w -633885089
    //   2027: ixor
    //   2028: ixor
    //   2029: lookupswitch default -> 5370, -1977203584 -> 2056, -172932497 -> 2012
    //   2056: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2059: getstatic Perryc.0 : I
    //   2062: ifle -> 2076
    //   2065: ldc2_w 1210438704
    //   2068: l2i
    //   2069: ldc_w 792199100
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w 606542739
    //   2079: l2i
    //   2080: ldc_w -531217588
    //   2083: ixor
    //   2084: ldc2_w -860580494
    //   2087: l2i
    //   2088: ldc_w -227523921
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 5340, -88764670 -> 2120, 1507261521 -> 2076
    //   2120: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2123: getstatic Perryc.c : I
    //   2126: iflt -> 2140
    //   2129: ldc2_w 1756394168
    //   2132: l2i
    //   2133: ldc_w -1220503649
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w 1328049542
    //   2143: l2i
    //   2144: ldc_w -292406513
    //   2147: ixor
    //   2148: ldc2_w 371119689
    //   2151: l2i
    //   2152: ldc_w -492144924
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 2184, -535842788 -> 2140, 725894538 -> 5266
    //   2184: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2187: getstatic Perryc.1 : I
    //   2190: ifeq -> 2204
    //   2193: ldc2_w 1437033176
    //   2196: l2i
    //   2197: ldc_w 1513090174
    //   2200: ixor
    //   2201: goto -> 2212
    //   2204: ldc2_w -334957836
    //   2207: l2i
    //   2208: ldc_w -1129725339
    //   2211: ixor
    //   2212: ldc2_w -1019120821
    //   2215: l2i
    //   2216: ldc_w 299631734
    //   2219: ixor
    //   2220: ixor
    //   2221: lookupswitch default -> 5366, -2109978708 -> 2248, -585762405 -> 2204
    //   2248: putfield antiIllegal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2251: getstatic Perryc.c : I
    //   2254: iflt -> 2268
    //   2257: ldc2_w 112132368
    //   2260: l2i
    //   2261: ldc_w 1021985157
    //   2264: ixor
    //   2265: goto -> 2276
    //   2268: ldc2_w 1689326234
    //   2271: l2i
    //   2272: ldc_w -1937799715
    //   2275: ixor
    //   2276: ldc2_w -795326420
    //   2279: l2i
    //   2280: ldc_w 1025149838
    //   2283: ixor
    //   2284: ixor
    //   2285: lookupswitch default -> 2312, -674790601 -> 5244, -380946269 -> 2268
    //   2312: aload_0
    //   2313: getstatic Perryc.0 : I
    //   2316: ifle -> 2330
    //   2319: ldc2_w 91049398
    //   2322: l2i
    //   2323: ldc_w -1712655751
    //   2326: ixor
    //   2327: goto -> 2338
    //   2330: ldc2_w 244626827
    //   2333: l2i
    //   2334: ldc_w -652552090
    //   2337: ixor
    //   2338: ldc2_w 651386798
    //   2341: l2i
    //   2342: ldc_w 672405459
    //   2345: ixor
    //   2346: ixor
    //   2347: lookupswitch default -> 5250, -1841236046 -> 2330, -649517680 -> 2372
    //   2372: aload_0
    //   2373: new bigname/zprestige/webhack/features/setting/Setting
    //   2376: dup
    //   2377: ldc_w '憼㌛懰㶴촗輓๶ᰡ'
    //   2380: getstatic Perryc.0 : I
    //   2383: ifle -> 2397
    //   2386: ldc2_w 1021742062
    //   2389: l2i
    //   2390: ldc_w -42310957
    //   2393: ixor
    //   2394: goto -> 2405
    //   2397: ldc2_w -766682712
    //   2400: l2i
    //   2401: ldc_w -472948036
    //   2404: ixor
    //   2405: ldc2_w -1000381868
    //   2408: l2i
    //   2409: ldc_w 145564986
    //   2412: ixor
    //   2413: ixor
    //   2414: lookupswitch default -> 2440, 225357395 -> 5356, 1310045647 -> 2397
    //   2440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2443: ldc2_w -139777114
    //   2446: l2i
    //   2447: ldc_w -139777113
    //   2450: ixor
    //   2451: getstatic Perryc.1 : I
    //   2454: ifeq -> 2468
    //   2457: ldc2_w 1342702719
    //   2460: l2i
    //   2461: ldc_w 1970663992
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w 1018447988
    //   2471: l2i
    //   2472: ldc_w 2111058411
    //   2475: ixor
    //   2476: ldc2_w -1638597582
    //   2479: l2i
    //   2480: ldc_w -410363752
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 5300, 952032565 -> 2512, 1554207469 -> 2468
    //   2512: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2515: getstatic Perryc.c : I
    //   2518: iflt -> 2532
    //   2521: ldc2_w 1907192655
    //   2524: l2i
    //   2525: ldc_w -1329694342
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w 1596116930
    //   2535: l2i
    //   2536: ldc_w 1666671286
    //   2539: ixor
    //   2540: ldc2_w -1615862720
    //   2543: l2i
    //   2544: ldc_w -1884817877
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 2576, -786753442 -> 5242, 1059899037 -> 2532
    //   2576: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2579: getstatic Perryc.1 : I
    //   2582: ifeq -> 2596
    //   2585: ldc2_w 1139569776
    //   2588: l2i
    //   2589: ldc_w -17360604
    //   2592: ixor
    //   2593: goto -> 2604
    //   2596: ldc2_w 1772772649
    //   2599: l2i
    //   2600: ldc_w 296788964
    //   2603: ixor
    //   2604: ldc2_w -1590223476
    //   2607: l2i
    //   2608: ldc_w -1559434950
    //   2611: ixor
    //   2612: ixor
    //   2613: lookupswitch default -> 5260, -1088382494 -> 2596, 2048985723 -> 2640
    //   2640: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2643: getstatic Perryc.0 : I
    //   2646: ifle -> 2660
    //   2649: ldc2_w -818301028
    //   2652: l2i
    //   2653: ldc_w -420547427
    //   2656: ixor
    //   2657: goto -> 2668
    //   2660: ldc2_w -1641762736
    //   2663: l2i
    //   2664: ldc_w -914410515
    //   2667: ixor
    //   2668: ldc2_w -1493642836
    //   2671: l2i
    //   2672: ldc_w -698929680
    //   2675: ixor
    //   2676: ixor
    //   2677: lookupswitch default -> 2704, -1718464881 -> 2660, 1501085533 -> 5302
    //   2704: putfield checkPos : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2707: getstatic Perryc.c : I
    //   2710: iflt -> 2724
    //   2713: ldc2_w -390011805
    //   2716: l2i
    //   2717: ldc_w -1442475111
    //   2720: ixor
    //   2721: goto -> 2732
    //   2724: ldc2_w 1687005103
    //   2727: l2i
    //   2728: ldc_w 961963145
    //   2731: ixor
    //   2732: ldc2_w 1772980673
    //   2735: l2i
    //   2736: ldc_w 1592980532
    //   2739: ixor
    //   2740: ixor
    //   2741: lookupswitch default -> 2768, -1881323530 -> 2724, 1973029391 -> 5386
    //   2768: aload_0
    //   2769: getstatic Perryc.0 : I
    //   2772: ifle -> 2786
    //   2775: ldc2_w 2063259780
    //   2778: l2i
    //   2779: ldc_w 862487847
    //   2782: ixor
    //   2783: goto -> 2794
    //   2786: ldc2_w 401368146
    //   2789: l2i
    //   2790: ldc_w 113236563
    //   2793: ixor
    //   2794: ldc2_w -396413656
    //   2797: l2i
    //   2798: ldc_w -2086604920
    //   2801: ixor
    //   2802: ixor
    //   2803: lookupswitch default -> 2828, -900962293 -> 2786, 577603331 -> 5234
    //   2828: aload_0
    //   2829: new bigname/zprestige/webhack/features/setting/Setting
    //   2832: dup
    //   2833: ldc_w '懎㍝憤㷢'
    //   2836: getstatic Perryc.0 : I
    //   2839: ifle -> 2853
    //   2842: ldc2_w -1383798487
    //   2845: l2i
    //   2846: ldc_w -193764604
    //   2849: ixor
    //   2850: goto -> 2861
    //   2853: ldc2_w 784506138
    //   2856: l2i
    //   2857: ldc_w -1020727167
    //   2860: ixor
    //   2861: ldc2_w 947245264
    //   2864: l2i
    //   2865: ldc_w 1752345453
    //   2868: ixor
    //   2869: ixor
    //   2870: lookupswitch default -> 5314, -1108535770 -> 2896, 166785424 -> 2853
    //   2896: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2899: ldc2_w 1372167297
    //   2902: l2i
    //   2903: ldc_w 1372167297
    //   2906: ixor
    //   2907: getstatic Perryc.0 : I
    //   2910: ifle -> 2924
    //   2913: ldc2_w 941979498
    //   2916: l2i
    //   2917: ldc_w 103577186
    //   2920: ixor
    //   2921: goto -> 2932
    //   2924: ldc2_w -416162226
    //   2927: l2i
    //   2928: ldc_w -675150225
    //   2931: ixor
    //   2932: ldc2_w 1303017031
    //   2935: l2i
    //   2936: ldc_w -1845733343
    //   2939: ixor
    //   2940: ixor
    //   2941: lookupswitch default -> 5368, -497078418 -> 2924, -324667833 -> 2968
    //   2968: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2971: getstatic Perryc.c : I
    //   2974: iflt -> 2988
    //   2977: ldc2_w -123289458
    //   2980: l2i
    //   2981: ldc_w 861395430
    //   2984: ixor
    //   2985: goto -> 2996
    //   2988: ldc2_w -216575897
    //   2991: l2i
    //   2992: ldc_w -851958436
    //   2995: ixor
    //   2996: ldc2_w 1308898837
    //   2999: l2i
    //   3000: ldc_w -1647712313
    //   3003: ixor
    //   3004: ixor
    //   3005: lookupswitch default -> 5294, -303913751 -> 3032, 406636730 -> 2988
    //   3032: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3035: getstatic Perryc.0 : I
    //   3038: ifle -> 3052
    //   3041: ldc2_w 2109860037
    //   3044: l2i
    //   3045: ldc_w -806707874
    //   3048: ixor
    //   3049: goto -> 3060
    //   3052: ldc2_w 1659620154
    //   3055: l2i
    //   3056: ldc_w 1652847783
    //   3059: ixor
    //   3060: ldc2_w 1264634328
    //   3063: l2i
    //   3064: ldc_w -32650062
    //   3067: ixor
    //   3068: ixor
    //   3069: lookupswitch default -> 5308, -1258112265 -> 3096, 122056945 -> 3052
    //   3096: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3099: getstatic Perryc.c : I
    //   3102: iflt -> 3116
    //   3105: ldc2_w 846786876
    //   3108: l2i
    //   3109: ldc_w 156603150
    //   3112: ixor
    //   3113: goto -> 3124
    //   3116: ldc2_w -1125441651
    //   3119: l2i
    //   3120: ldc_w -337527771
    //   3123: ixor
    //   3124: ldc2_w -64597281
    //   3127: l2i
    //   3128: ldc_w -1915628284
    //   3131: ixor
    //   3132: ixor
    //   3133: lookupswitch default -> 3160, -395630378 -> 3116, 1255859689 -> 5272
    //   3160: putfield oneDot15 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3163: getstatic Perryc.0 : I
    //   3166: ifle -> 3180
    //   3169: ldc2_w -1556892444
    //   3172: l2i
    //   3173: ldc_w -156884439
    //   3176: ixor
    //   3177: goto -> 3188
    //   3180: ldc2_w 1487503292
    //   3183: l2i
    //   3184: ldc_w -2036728885
    //   3187: ixor
    //   3188: ldc2_w -623511079
    //   3191: l2i
    //   3192: ldc_w -1896583478
    //   3195: ixor
    //   3196: ixor
    //   3197: lookupswitch default -> 3224, -82233717 -> 3180, 28574174 -> 5312
    //   3224: aload_0
    //   3225: getstatic Perryc.1 : I
    //   3228: ifeq -> 3242
    //   3231: ldc2_w 1052859493
    //   3234: l2i
    //   3235: ldc_w 580411882
    //   3238: ixor
    //   3239: goto -> 3250
    //   3242: ldc2_w 1214844196
    //   3245: l2i
    //   3246: ldc_w -1256597654
    //   3249: ixor
    //   3250: ldc2_w -371548949
    //   3253: l2i
    //   3254: ldc_w -1930935003
    //   3257: ixor
    //   3258: ixor
    //   3259: lookupswitch default -> 5342, -1740504192 -> 3284, 2037113921 -> 3242
    //   3284: aload_0
    //   3285: new bigname/zprestige/webhack/features/setting/Setting
    //   3288: dup
    //   3289: ldc_w '憺㌝懡㶾초輺๚᰺蹦釡?'
    //   3292: getstatic Perryc.1 : I
    //   3295: ifeq -> 3309
    //   3298: ldc2_w -665103846
    //   3301: l2i
    //   3302: ldc_w 152375624
    //   3305: ixor
    //   3306: goto -> 3317
    //   3309: ldc2_w -973872828
    //   3312: l2i
    //   3313: ldc_w -1279390189
    //   3316: ixor
    //   3317: ldc2_w 886696148
    //   3320: l2i
    //   3321: ldc_w -123495504
    //   3324: ixor
    //   3325: ixor
    //   3326: lookupswitch default -> 5296, -1170760653 -> 3352, 489959478 -> 3309
    //   3352: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3355: ldc2_w 608511349
    //   3358: l2i
    //   3359: ldc_w 608511349
    //   3362: ixor
    //   3363: getstatic Perryc.c : I
    //   3366: iflt -> 3380
    //   3369: ldc2_w 1257589625
    //   3372: l2i
    //   3373: ldc_w -917755264
    //   3376: ixor
    //   3377: goto -> 3388
    //   3380: ldc2_w 1910133755
    //   3383: l2i
    //   3384: ldc_w 1397992336
    //   3387: ixor
    //   3388: ldc2_w 154225507
    //   3391: l2i
    //   3392: ldc_w -1943414680
    //   3395: ixor
    //   3396: ixor
    //   3397: lookupswitch default -> 5248, -1483642016 -> 3424, 111276786 -> 3380
    //   3424: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3427: getstatic Perryc.0 : I
    //   3430: ifle -> 3444
    //   3433: ldc2_w 1645320319
    //   3436: l2i
    //   3437: ldc_w 1705846878
    //   3440: ixor
    //   3441: goto -> 3452
    //   3444: ldc2_w 242609862
    //   3447: l2i
    //   3448: ldc_w -655680063
    //   3451: ixor
    //   3452: ldc2_w -1869948870
    //   3455: l2i
    //   3456: ldc_w 640225765
    //   3459: ixor
    //   3460: ixor
    //   3461: lookupswitch default -> 5274, -1323337218 -> 3444, 1614625496 -> 3488
    //   3488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3491: getstatic Perryc.c : I
    //   3494: iflt -> 3508
    //   3497: ldc2_w 913386820
    //   3500: l2i
    //   3501: ldc_w -29688026
    //   3504: ixor
    //   3505: goto -> 3516
    //   3508: ldc2_w 680543617
    //   3511: l2i
    //   3512: ldc_w 796396484
    //   3515: ixor
    //   3516: ldc2_w -30780448
    //   3519: l2i
    //   3520: ldc_w 81422567
    //   3523: ixor
    //   3524: ixor
    //   3525: lookupswitch default -> 5372, -48728766 -> 3552, 851175781 -> 3508
    //   3552: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3555: getstatic Perryc.1 : I
    //   3558: ifeq -> 3572
    //   3561: ldc2_w 3263477
    //   3564: l2i
    //   3565: ldc_w -2013731914
    //   3568: ixor
    //   3569: goto -> 3580
    //   3572: ldc2_w -571486957
    //   3575: l2i
    //   3576: ldc_w -984220296
    //   3579: ixor
    //   3580: ldc2_w -507758210
    //   3583: l2i
    //   3584: ldc_w 1576948141
    //   3587: ixor
    //   3588: ixor
    //   3589: lookupswitch default -> 3616, -913430917 -> 3572, 998981776 -> 5378
    //   3616: putfield entitycheck : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3619: getstatic Perryc.c : I
    //   3622: iflt -> 3636
    //   3625: ldc2_w -1578038724
    //   3628: l2i
    //   3629: ldc_w -1377875256
    //   3632: ixor
    //   3633: goto -> 3644
    //   3636: ldc2_w -995194238
    //   3639: l2i
    //   3640: ldc_w 885039355
    //   3643: ixor
    //   3644: ldc2_w -1386035413
    //   3647: l2i
    //   3648: ldc_w -671045104
    //   3651: ixor
    //   3652: ixor
    //   3653: lookupswitch default -> 5258, -2062792894 -> 3680, 2035035599 -> 3636
    //   3680: aload_0
    //   3681: getstatic Perryc.1 : I
    //   3684: ifeq -> 3698
    //   3687: ldc2_w -1923751109
    //   3690: l2i
    //   3691: ldc_w 377002515
    //   3694: ixor
    //   3695: goto -> 3706
    //   3698: ldc2_w 1583416472
    //   3701: l2i
    //   3702: ldc_w 2076807755
    //   3705: ixor
    //   3706: ldc2_w 1866068738
    //   3709: l2i
    //   3710: ldc_w -795118843
    //   3713: ixor
    //   3714: ixor
    //   3715: lookupswitch default -> 3740, -1099258958 -> 3698, 613415215 -> 5388
    //   3740: aload_0
    //   3741: new bigname/zprestige/webhack/features/setting/Setting
    //   3744: dup
    //   3745: ldc_w '憾㌇懡㶶촟輨๪'
    //   3748: getstatic Perryc.c : I
    //   3751: iflt -> 3765
    //   3754: ldc2_w 1818236483
    //   3757: l2i
    //   3758: ldc_w -2080166785
    //   3761: ixor
    //   3762: goto -> 3773
    //   3765: ldc2_w -252293493
    //   3768: l2i
    //   3769: ldc_w 144592947
    //   3772: ixor
    //   3773: ldc2_w 670889243
    //   3776: l2i
    //   3777: ldc_w 874686273
    //   3780: ixor
    //   3781: ixor
    //   3782: lookupswitch default -> 3808, -71473050 -> 5344, 219988970 -> 3765
    //   3808: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3811: ldc2_w 133008936
    //   3814: l2i
    //   3815: ldc_w 133008937
    //   3818: ixor
    //   3819: getstatic Perryc.c : I
    //   3822: iflt -> 3836
    //   3825: ldc2_w -754177544
    //   3828: l2i
    //   3829: ldc_w 1744264537
    //   3832: ixor
    //   3833: goto -> 3844
    //   3836: ldc2_w -438695064
    //   3839: l2i
    //   3840: ldc_w -1545606481
    //   3843: ixor
    //   3844: ldc2_w 370474979
    //   3847: l2i
    //   3848: ldc_w -1318306122
    //   3851: ixor
    //   3852: ixor
    //   3853: lookupswitch default -> 3880, 327398900 -> 5286, 934959497 -> 3836
    //   3880: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3883: ldc2_w 792813221
    //   3886: l2i
    //   3887: ldc_w 792813220
    //   3890: ixor
    //   3891: getstatic Perryc.c : I
    //   3894: iflt -> 3908
    //   3897: ldc2_w 1083400675
    //   3900: l2i
    //   3901: ldc_w 1686885026
    //   3904: ixor
    //   3905: goto -> 3916
    //   3908: ldc2_w -151953029
    //   3911: l2i
    //   3912: ldc_w 780187652
    //   3915: ixor
    //   3916: ldc2_w 1990285087
    //   3919: l2i
    //   3920: ldc_w -883285844
    //   3923: ixor
    //   3924: ixor
    //   3925: lookupswitch default -> 3952, -1713126158 -> 5310, 2045995807 -> 3908
    //   3952: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3955: ldc2_w -57451506
    //   3958: l2i
    //   3959: ldc_w -57451516
    //   3962: ixor
    //   3963: getstatic Perryc.c : I
    //   3966: iflt -> 3980
    //   3969: ldc2_w 217777635
    //   3972: l2i
    //   3973: ldc_w 457625253
    //   3976: ixor
    //   3977: goto -> 3988
    //   3980: ldc2_w 1286590422
    //   3983: l2i
    //   3984: ldc_w 311316454
    //   3987: ixor
    //   3988: ldc2_w -523447897
    //   3991: l2i
    //   3992: ldc_w -1593267297
    //   3995: ixor
    //   3996: ixor
    //   3997: lookupswitch default -> 5362, 535165448 -> 4024, 1450815870 -> 3980
    //   4024: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4027: getstatic Perryc.1 : I
    //   4030: ifeq -> 4044
    //   4033: ldc2_w 1612971999
    //   4036: l2i
    //   4037: ldc_w 1352148685
    //   4040: ixor
    //   4041: goto -> 4052
    //   4044: ldc2_w -878265963
    //   4047: l2i
    //   4048: ldc_w -685703434
    //   4051: ixor
    //   4052: ldc2_w -1336629299
    //   4055: l2i
    //   4056: ldc_w -205286229
    //   4059: ixor
    //   4060: ixor
    //   4061: lookupswitch default -> 5328, 1594979333 -> 4088, 1932323444 -> 4044
    //   4088: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4091: getstatic Perryc.1 : I
    //   4094: ifeq -> 4108
    //   4097: ldc2_w -80221465
    //   4100: l2i
    //   4101: ldc_w 1803781634
    //   4104: ixor
    //   4105: goto -> 4116
    //   4108: ldc2_w -2134939969
    //   4111: l2i
    //   4112: ldc_w -1792254246
    //   4115: ixor
    //   4116: ldc2_w 1510344451
    //   4119: l2i
    //   4120: ldc_w 1416688939
    //   4123: ixor
    //   4124: ixor
    //   4125: lookupswitch default -> 4152, -1631412531 -> 5324, -641217594 -> 4108
    //   4152: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4155: getstatic Perryc.c : I
    //   4158: iflt -> 4172
    //   4161: ldc2_w -1929220135
    //   4164: l2i
    //   4165: ldc_w -1839791702
    //   4168: ixor
    //   4169: goto -> 4180
    //   4172: ldc2_w -13416388
    //   4175: l2i
    //   4176: ldc_w 792388863
    //   4179: ixor
    //   4180: ldc2_w 667335759
    //   4183: l2i
    //   4184: ldc_w 2126821626
    //   4187: ixor
    //   4188: ixor
    //   4189: lookupswitch default -> 4216, 117769571 -> 4172, 1180134086 -> 5278
    //   4216: putfield attacks : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4219: getstatic Perryc.0 : I
    //   4222: ifle -> 4236
    //   4225: ldc2_w -31297738
    //   4228: l2i
    //   4229: ldc_w -1613554902
    //   4232: ixor
    //   4233: goto -> 4244
    //   4236: ldc2_w 1678943062
    //   4239: l2i
    //   4240: ldc_w 417666200
    //   4243: ixor
    //   4244: ldc2_w 737950013
    //   4247: l2i
    //   4248: ldc_w 226461621
    //   4251: ixor
    //   4252: ixor
    //   4253: lookupswitch default -> 4280, 1198705300 -> 5316, 1625425425 -> 4236
    //   4280: aload_0
    //   4281: getstatic Perryc.1 : I
    //   4284: ifeq -> 4298
    //   4287: ldc2_w 522671382
    //   4290: l2i
    //   4291: ldc_w -1824496199
    //   4294: ixor
    //   4295: goto -> 4306
    //   4298: ldc2_w -116479561
    //   4301: l2i
    //   4302: ldc_w -557845013
    //   4305: ixor
    //   4306: ldc2_w -1900562513
    //   4309: l2i
    //   4310: ldc_w 1304908607
    //   4313: ixor
    //   4314: ixor
    //   4315: lookupswitch default -> 4340, -1403760466 -> 4298, 1326961727 -> 5304
    //   4340: aload_0
    //   4341: new bigname/zprestige/webhack/features/setting/Setting
    //   4344: dup
    //   4345: ldc_w '憻㌖懹㶶촅'
    //   4348: getstatic Perryc.c : I
    //   4351: iflt -> 4365
    //   4354: ldc2_w -1478998061
    //   4357: l2i
    //   4358: ldc_w -1478518487
    //   4361: ixor
    //   4362: goto -> 4373
    //   4365: ldc2_w -310318330
    //   4368: l2i
    //   4369: ldc_w 288611760
    //   4372: ixor
    //   4373: ldc2_w -551661716
    //   4376: l2i
    //   4377: ldc_w -1527309820
    //   4380: ixor
    //   4381: ixor
    //   4382: lookupswitch default -> 4408, -2092798144 -> 4365, 2079230866 -> 5354
    //   4408: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4411: ldc2_w 42244205
    //   4414: l2i
    //   4415: ldc_w 42244205
    //   4418: ixor
    //   4419: getstatic Perryc.c : I
    //   4422: iflt -> 4436
    //   4425: ldc2_w -60916502
    //   4428: l2i
    //   4429: ldc_w 807562289
    //   4432: ixor
    //   4433: goto -> 4444
    //   4436: ldc2_w -1576053748
    //   4439: l2i
    //   4440: ldc_w 1646081847
    //   4443: ixor
    //   4444: ldc2_w -429346349
    //   4447: l2i
    //   4448: ldc_w -830887610
    //   4451: ixor
    //   4452: ixor
    //   4453: lookupswitch default -> 5298, -462616498 -> 4436, -402424914 -> 4480
    //   4480: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4483: ldc2_w 416611705
    //   4486: l2i
    //   4487: ldc_w 416611705
    //   4490: ixor
    //   4491: getstatic Perryc.0 : I
    //   4494: ifle -> 4508
    //   4497: ldc2_w 71596024
    //   4500: l2i
    //   4501: ldc_w -589733743
    //   4504: ixor
    //   4505: goto -> 4516
    //   4508: ldc2_w -156517074
    //   4511: l2i
    //   4512: ldc_w -1242831216
    //   4515: ixor
    //   4516: ldc2_w -2133353924
    //   4519: l2i
    //   4520: ldc_w 882339522
    //   4523: ixor
    //   4524: ixor
    //   4525: lookupswitch default -> 4552, -1261196279 -> 4508, 1826481047 -> 5364
    //   4552: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4555: ldc2_w 345391739
    //   4558: l2i
    //   4559: ldc_w 345391689
    //   4562: ixor
    //   4563: getstatic Perryc.1 : I
    //   4566: ifeq -> 4580
    //   4569: ldc2_w -1521666927
    //   4572: l2i
    //   4573: ldc_w 1108457945
    //   4576: ixor
    //   4577: goto -> 4588
    //   4580: ldc2_w -1370589834
    //   4583: l2i
    //   4584: ldc_w 1435768025
    //   4587: ixor
    //   4588: ldc2_w 1918608944
    //   4591: l2i
    //   4592: ldc_w -1305954941
    //   4595: ixor
    //   4596: ixor
    //   4597: lookupswitch default -> 4624, -1215481976 -> 4580, 657432315 -> 5374
    //   4624: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4627: getstatic Perryc.0 : I
    //   4630: ifle -> 4644
    //   4633: ldc2_w -1900725
    //   4636: l2i
    //   4637: ldc_w 636435153
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w 783217190
    //   4647: l2i
    //   4648: ldc_w -1151815294
    //   4651: ixor
    //   4652: ldc2_w -767149892
    //   4655: l2i
    //   4656: ldc_w 197769483
    //   4659: ixor
    //   4660: ixor
    //   4661: lookupswitch default -> 5330, 58868781 -> 4644, 1283047955 -> 4688
    //   4688: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4691: getstatic Perryc.0 : I
    //   4694: ifle -> 4708
    //   4697: ldc2_w 44242892
    //   4700: l2i
    //   4701: ldc_w -90077807
    //   4704: ixor
    //   4705: goto -> 4716
    //   4708: ldc2_w 1830822384
    //   4711: l2i
    //   4712: ldc_w 1133927015
    //   4715: ixor
    //   4716: ldc2_w 798474250
    //   4719: l2i
    //   4720: ldc_w 983355959
    //   4723: ixor
    //   4724: ixor
    //   4725: lookupswitch default -> 5318, -318144416 -> 4708, 1002269098 -> 4752
    //   4752: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4755: getstatic Perryc.0 : I
    //   4758: ifle -> 4772
    //   4761: ldc2_w 362130400
    //   4764: l2i
    //   4765: ldc_w -1202935430
    //   4768: ixor
    //   4769: goto -> 4780
    //   4772: ldc2_w -1668969402
    //   4775: l2i
    //   4776: ldc_w -1434690724
    //   4779: ixor
    //   4780: ldc2_w -1016102068
    //   4783: l2i
    //   4784: ldc_w -1379429486
    //   4787: ixor
    //   4788: ixor
    //   4789: lookupswitch default -> 4816, -1015999932 -> 5336, -745541547 -> 4772
    //   4816: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4819: getstatic Perryc.1 : I
    //   4822: ifeq -> 4836
    //   4825: ldc2_w 1981991257
    //   4828: l2i
    //   4829: ldc_w 878818759
    //   4832: ixor
    //   4833: goto -> 4844
    //   4836: ldc2_w 1347681390
    //   4839: l2i
    //   4840: ldc_w 1835901195
    //   4843: ixor
    //   4844: ldc2_w -462538051
    //   4847: l2i
    //   4848: ldc_w -108909169
    //   4851: ixor
    //   4852: ixor
    //   4853: lookupswitch default -> 4880, -1704057543 -> 4836, 1605331884 -> 5306
    //   4880: aload_0
    //   4881: ldc_w 1.8293211E37
    //   4884: invokestatic floatToIntBits : (F)I
    //   4887: ldc_w 2103194191
    //   4890: ixor
    //   4891: invokestatic intBitsToFloat : (I)F
    //   4894: getstatic Perryc.c : I
    //   4897: iflt -> 4911
    //   4900: ldc2_w -884407893
    //   4903: l2i
    //   4904: ldc_w -62348500
    //   4907: ixor
    //   4908: goto -> 4919
    //   4911: ldc2_w 1551489263
    //   4914: l2i
    //   4915: ldc_w 1262377184
    //   4918: ixor
    //   4919: ldc2_w 1000973850
    //   4922: l2i
    //   4923: ldc_w -826732846
    //   4926: ixor
    //   4927: ixor
    //   4928: lookupswitch default -> 4956, -1039070641 -> 5326, 609902999 -> 4911
    //   4956: putfield yaw : F
    //   4959: getstatic Perryc.0 : I
    //   4962: ifle -> 4976
    //   4965: ldc2_w -1351412729
    //   4968: l2i
    //   4969: ldc_w 2050899097
    //   4972: ixor
    //   4973: goto -> 4984
    //   4976: ldc2_w -593091350
    //   4979: l2i
    //   4980: ldc_w -1845066680
    //   4983: ixor
    //   4984: ldc2_w -1329908663
    //   4987: l2i
    //   4988: ldc_w 95348166
    //   4991: ixor
    //   4992: ixor
    //   4993: lookupswitch default -> 5256, -71995091 -> 5020, 1616443665 -> 4976
    //   5020: aload_0
    //   5021: ldc_w 1.2093092E38
    //   5024: invokestatic floatToIntBits : (F)I
    //   5027: ldc_w 2125853925
    //   5030: ixor
    //   5031: invokestatic intBitsToFloat : (I)F
    //   5034: getstatic Perryc.0 : I
    //   5037: ifle -> 5051
    //   5040: ldc2_w -1375115360
    //   5043: l2i
    //   5044: ldc_w 554134754
    //   5047: ixor
    //   5048: goto -> 5059
    //   5051: ldc2_w 2145660315
    //   5054: l2i
    //   5055: ldc_w -147998181
    //   5058: ixor
    //   5059: ldc2_w 582189181
    //   5062: l2i
    //   5063: ldc_w -724706948
    //   5066: ixor
    //   5067: ixor
    //   5068: lookupswitch default -> 5252, 2037404227 -> 5051, 2125975169 -> 5096
    //   5096: putfield pitch : F
    //   5099: getstatic Perryc.c : I
    //   5102: iflt -> 5116
    //   5105: ldc2_w 1318636433
    //   5108: l2i
    //   5109: ldc_w -1641652468
    //   5112: ixor
    //   5113: goto -> 5124
    //   5116: ldc2_w 2096022204
    //   5119: l2i
    //   5120: ldc_w 393566389
    //   5123: ixor
    //   5124: ldc2_w 2082195394
    //   5127: l2i
    //   5128: ldc_w 1861176121
    //   5131: ixor
    //   5132: ixor
    //   5133: lookupswitch default -> 5160, -1447129648 -> 5116, -1035331482 -> 5332
    //   5160: aload_0
    //   5161: ldc2_w 761487822
    //   5164: l2i
    //   5165: ldc_w -761456466
    //   5168: ixor
    //   5169: getstatic Perryc.1 : I
    //   5172: ifeq -> 5186
    //   5175: ldc2_w 100943949
    //   5178: l2i
    //   5179: ldc_w -146901268
    //   5182: ixor
    //   5183: goto -> 5194
    //   5186: ldc2_w 1790220615
    //   5189: l2i
    //   5190: ldc_w 1078834040
    //   5193: ixor
    //   5194: ldc2_w 283322847
    //   5197: l2i
    //   5198: ldc_w -305828110
    //   5201: ixor
    //   5202: ixor
    //   5203: lookupswitch default -> 5228, 203192716 -> 5390, 644149076 -> 5186
    //   5228: putfield highestID : I
    //   5231: return
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
    //   5264: aconst_null
    //   5265: athrow
    //   5266: aconst_null
    //   5267: athrow
    //   5268: aconst_null
    //   5269: athrow
    //   5270: aconst_null
    //   5271: athrow
    //   5272: aconst_null
    //   5273: athrow
    //   5274: aconst_null
    //   5275: athrow
    //   5276: aconst_null
    //   5277: athrow
    //   5278: aconst_null
    //   5279: athrow
    //   5280: aconst_null
    //   5281: athrow
    //   5282: aconst_null
    //   5283: athrow
    //   5284: aconst_null
    //   5285: athrow
    //   5286: aconst_null
    //   5287: athrow
    //   5288: aconst_null
    //   5289: athrow
    //   5290: aconst_null
    //   5291: athrow
    //   5292: aconst_null
    //   5293: athrow
    //   5294: aconst_null
    //   5295: athrow
    //   5296: aconst_null
    //   5297: athrow
    //   5298: aconst_null
    //   5299: athrow
    //   5300: aconst_null
    //   5301: athrow
    //   5302: aconst_null
    //   5303: athrow
    //   5304: aconst_null
    //   5305: athrow
    //   5306: aconst_null
    //   5307: athrow
    //   5308: aconst_null
    //   5309: athrow
    //   5310: aconst_null
    //   5311: athrow
    //   5312: aconst_null
    //   5313: athrow
    //   5314: aconst_null
    //   5315: athrow
    //   5316: aconst_null
    //   5317: athrow
    //   5318: aconst_null
    //   5319: athrow
    //   5320: aconst_null
    //   5321: athrow
    //   5322: aconst_null
    //   5323: athrow
    //   5324: aconst_null
    //   5325: athrow
    //   5326: aconst_null
    //   5327: athrow
    //   5328: aconst_null
    //   5329: athrow
    //   5330: aconst_null
    //   5331: athrow
    //   5332: aconst_null
    //   5333: athrow
    //   5334: aconst_null
    //   5335: athrow
    //   5336: aconst_null
    //   5337: athrow
    //   5338: aconst_null
    //   5339: athrow
    //   5340: aconst_null
    //   5341: athrow
    //   5342: aconst_null
    //   5343: athrow
    //   5344: aconst_null
    //   5345: athrow
    //   5346: aconst_null
    //   5347: athrow
    //   5348: aconst_null
    //   5349: athrow
    //   5350: aconst_null
    //   5351: athrow
    //   5352: aconst_null
    //   5353: athrow
    //   5354: aconst_null
    //   5355: athrow
    //   5356: aconst_null
    //   5357: athrow
    //   5358: aconst_null
    //   5359: athrow
    //   5360: aconst_null
    //   5361: athrow
    //   5362: aconst_null
    //   5363: athrow
    //   5364: aconst_null
    //   5365: athrow
    //   5366: aconst_null
    //   5367: athrow
    //   5368: aconst_null
    //   5369: athrow
    //   5370: aconst_null
    //   5371: athrow
    //   5372: aconst_null
    //   5373: athrow
    //   5374: aconst_null
    //   5375: athrow
    //   5376: aconst_null
    //   5377: athrow
    //   5378: aconst_null
    //   5379: athrow
    //   5380: aconst_null
    //   5381: athrow
    //   5382: aconst_null
    //   5383: athrow
    //   5384: aconst_null
    //   5385: athrow
    //   5386: aconst_null
    //   5387: athrow
    //   5388: aconst_null
    //   5389: athrow
    //   5390: aconst_null
    //   5391: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	5232	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
  }
  
  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public void onSendPacket(PacketEvent.Send event) {
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
  
  public void resetFields() {
    Perry1.3Z(this, (int)-1003884282L ^ 0x8C34D183);
  }
  
  public void onToggle() {
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
  
  public void onUpdate() {
    Perry1.3e(this, (int)1597990307L ^ 0x2456C255);
  }
  
  public boolean checkItem(ItemStack paramItemStack) {
    return Perry1.0v(this, (int)-2106944184L ^ 0x97818D44, paramItemStack);
  }
  
  public boolean checkPlayers() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1778
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1770
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1762
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1771465693
    //   33: l2i
    //   34: ldc_w -1347527363
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1997539454
    //   44: l2i
    //   45: ldc_w 1128659597
    //   48: ixor
    //   49: ldc2_w -1060572801
    //   52: l2i
    //   53: ldc_w -1519474231
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 1549898152 -> 1741, 1631282026 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -1677841242
    //   94: l2i
    //   95: ldc_w 418622200
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1826394277
    //   105: l2i
    //   106: ldc_w 119295988
    //   109: ixor
    //   110: ldc2_w -1399958166
    //   113: l2i
    //   114: ldc_w 1577701152
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1739, 1723382501 -> 144, 1904876564 -> 102
    //   144: getfield antiIllegal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   147: getstatic Perryc.1 : I
    //   150: ifeq -> 164
    //   153: ldc2_w 763918412
    //   156: l2i
    //   157: ldc_w -951693739
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -2104443361
    //   167: l2i
    //   168: ldc_w 1494793451
    //   171: ixor
    //   172: ldc2_w -335177208
    //   175: l2i
    //   176: ldc_w -425416569
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -1203318407 -> 164, -529595242 -> 1743
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getValue : ()Ljava/lang/Object;
    //   215: goto -> 219
    //   218: athrow
    //   219: checkcast java/lang/Boolean
    //   222: getstatic Perryc.c : I
    //   225: iflt -> 239
    //   228: ldc2_w -1932178364
    //   231: l2i
    //   232: ldc_w -1406634868
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w -1755347480
    //   242: l2i
    //   243: ldc_w 127223059
    //   246: ixor
    //   247: ldc2_w 2129897777
    //   250: l2i
    //   251: ldc_w -1207828314
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 1725, -435383969 -> 239, 1446734188 -> 284
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual booleanValue : ()Z
    //   291: goto -> 295
    //   294: athrow
    //   295: ifeq -> 309
    //   298: ldc2_w 1572318207
    //   301: l2i
    //   302: ldc_w -1540358497
    //   305: ixor
    //   306: goto -> 317
    //   309: ldc2_w -1089889504
    //   312: l2i
    //   313: ldc_w 1183960641
    //   316: ixor
    //   317: ldc2_w -1125572956
    //   320: l2i
    //   321: ldc_w 643946846
    //   324: ixor
    //   325: ixor
    //   326: tableswitch default -> 298, 1662030490 -> 348, 1662030491 -> 1700
    //   348: getstatic Perryc.c : I
    //   351: iflt -> 365
    //   354: ldc2_w 740926508
    //   357: l2i
    //   358: ldc_w -2112612253
    //   361: ixor
    //   362: goto -> 373
    //   365: ldc2_w -549190572
    //   368: l2i
    //   369: ldc_w 92179310
    //   372: ixor
    //   373: ldc2_w 1207410481
    //   376: l2i
    //   377: ldc_w -1725464938
    //   380: ixor
    //   381: ixor
    //   382: lookupswitch default -> 408, -1271294979 -> 365, 1894604264 -> 1717
    //   408: getstatic bigname/zprestige/webhack/features/modules/Combat/GodModule.mc : Lnet/minecraft/client/Minecraft;
    //   411: getstatic Perryc.c : I
    //   414: iflt -> 428
    //   417: ldc2_w 1573131611
    //   420: l2i
    //   421: ldc_w -605965407
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -663753506
    //   431: l2i
    //   432: ldc_w 1147769737
    //   435: ixor
    //   436: ldc2_w -578570896
    //   439: l2i
    //   440: ldc_w -1342135875
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -341396937 -> 1751, -17935484 -> 428
    //   472: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w 883845581
    //   484: l2i
    //   485: ldc_w -2020793384
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 1619776103
    //   495: l2i
    //   496: ldc_w -2016023345
    //   499: ixor
    //   500: ldc2_w -1954932166
    //   503: l2i
    //   504: ldc_w -204595784
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 1749, -1612039894 -> 536, -879276649 -> 492
    //   536: getfield field_73010_i : Ljava/util/List;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w -1679507276
    //   548: l2i
    //   549: ldc_w 843363511
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 405870004
    //   559: l2i
    //   560: ldc_w 1980019912
    //   563: ixor
    //   564: ldc2_w 337695696
    //   567: l2i
    //   568: ldc_w 689122710
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 1721, -1802270139 -> 556, 1392926522 -> 600
    //   600: goto -> 604
    //   603: athrow
    //   604: invokeinterface iterator : ()Ljava/util/Iterator;
    //   609: goto -> 613
    //   612: athrow
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w -639888731
    //   622: l2i
    //   623: ldc_w -189623573
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w -2025546302
    //   633: l2i
    //   634: ldc_w -1089866795
    //   637: ixor
    //   638: ldc2_w -721657735
    //   641: l2i
    //   642: ldc_w -506768026
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 1731, 226122504 -> 672, 408532305 -> 630
    //   672: astore_1
    //   673: getstatic Perryc.c : I
    //   676: iflt -> 690
    //   679: ldc2_w -1109306655
    //   682: l2i
    //   683: ldc_w -110007653
    //   686: ixor
    //   687: goto -> 698
    //   690: ldc2_w 1053738385
    //   693: l2i
    //   694: ldc_w 820291737
    //   697: ixor
    //   698: ldc2_w 2067490634
    //   701: l2i
    //   702: ldc_w -1721593389
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 732, -1496723741 -> 1733, 2108030688 -> 690
    //   732: aload_1
    //   733: getstatic Perryc.1 : I
    //   736: ifeq -> 750
    //   739: ldc2_w -463837064
    //   742: l2i
    //   743: ldc_w -459758820
    //   746: ixor
    //   747: goto -> 758
    //   750: ldc2_w -767181113
    //   753: l2i
    //   754: ldc_w -1426335785
    //   757: ixor
    //   758: ldc2_w -2114897316
    //   761: l2i
    //   762: ldc_w 1207806797
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 1735, -1095567359 -> 792, -959554955 -> 750
    //   792: goto -> 796
    //   795: athrow
    //   796: invokeinterface hasNext : ()Z
    //   801: goto -> 805
    //   804: athrow
    //   805: ifeq -> 819
    //   808: ldc2_w 630121956
    //   811: l2i
    //   812: ldc_w 1012578845
    //   815: ixor
    //   816: goto -> 827
    //   819: ldc2_w 1915556488
    //   822: l2i
    //   823: ldc_w 1811500406
    //   826: ixor
    //   827: ldc2_w -1684473198
    //   830: l2i
    //   831: ldc_w 1411999120
    //   834: ixor
    //   835: ixor
    //   836: tableswitch default -> 808, -697974533 -> 860, -697974532 -> 1700
    //   860: getstatic Perryc.1 : I
    //   863: ifeq -> 877
    //   866: ldc2_w 1097250991
    //   869: l2i
    //   870: ldc_w 44093185
    //   873: ixor
    //   874: goto -> 885
    //   877: ldc2_w -1891196381
    //   880: l2i
    //   881: ldc_w 780625352
    //   884: ixor
    //   885: ldc2_w -1171791461
    //   888: l2i
    //   889: ldc_w -1405585460
    //   892: ixor
    //   893: ixor
    //   894: lookupswitch default -> 920, 1440342521 -> 1723, 1570285060 -> 877
    //   920: aload_1
    //   921: getstatic Perryc.c : I
    //   924: iflt -> 938
    //   927: ldc2_w -306811965
    //   930: l2i
    //   931: ldc_w 1348269746
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 1072800065
    //   941: l2i
    //   942: ldc_w -435892466
    //   945: ixor
    //   946: ldc2_w -1793277801
    //   949: l2i
    //   950: ldc_w 724267644
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 1729, 64827290 -> 938, 1740823716 -> 980
    //   980: goto -> 984
    //   983: athrow
    //   984: invokeinterface next : ()Ljava/lang/Object;
    //   989: goto -> 993
    //   992: athrow
    //   993: checkcast net/minecraft/entity/player/EntityPlayer
    //   996: getstatic Perryc.c : I
    //   999: iflt -> 1013
    //   1002: ldc2_w 692147591
    //   1005: l2i
    //   1006: ldc_w 1163471037
    //   1009: ixor
    //   1010: goto -> 1021
    //   1013: ldc2_w -743980435
    //   1016: l2i
    //   1017: ldc_w 2011753644
    //   1020: ixor
    //   1021: ldc2_w -488372188
    //   1024: l2i
    //   1025: ldc_w 948898950
    //   1028: ixor
    //   1029: ixor
    //   1030: lookupswitch default -> 1056, -1233946216 -> 1719, 1298545667 -> 1013
    //   1056: astore_2
    //   1057: getstatic Perryc.c : I
    //   1060: iflt -> 1074
    //   1063: ldc2_w 916539616
    //   1066: l2i
    //   1067: ldc_w -1549136605
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w -992872885
    //   1077: l2i
    //   1078: ldc_w -871025653
    //   1081: ixor
    //   1082: ldc2_w 1267526188
    //   1085: l2i
    //   1086: ldc_w -1744767986
    //   1089: ixor
    //   1090: ixor
    //   1091: lookupswitch default -> 1711, -615981982 -> 1116, 1183276001 -> 1074
    //   1116: aload_0
    //   1117: getstatic Perryc.0 : I
    //   1120: ifle -> 1134
    //   1123: ldc2_w -628082640
    //   1126: l2i
    //   1127: ldc_w -2130007955
    //   1130: ixor
    //   1131: goto -> 1142
    //   1134: ldc2_w 621854664
    //   1137: l2i
    //   1138: ldc_w 1361103558
    //   1141: ixor
    //   1142: ldc2_w -632314359
    //   1145: l2i
    //   1146: ldc_w -1201589431
    //   1149: ixor
    //   1150: ixor
    //   1151: lookupswitch default -> 1176, -17442947 -> 1134, 968099101 -> 1713
    //   1176: aload_2
    //   1177: getstatic Perryc.1 : I
    //   1180: ifeq -> 1194
    //   1183: ldc2_w 1925836500
    //   1186: l2i
    //   1187: ldc_w 759109812
    //   1190: ixor
    //   1191: goto -> 1202
    //   1194: ldc2_w 212085170
    //   1197: l2i
    //   1198: ldc_w -1756839559
    //   1201: ixor
    //   1202: ldc2_w -1349338963
    //   1205: l2i
    //   1206: ldc_w -76048698
    //   1209: ixor
    //   1210: ixor
    //   1211: lookupswitch default -> 1236, -1298133567 -> 1194, 185849867 -> 1747
    //   1236: goto -> 1240
    //   1239: athrow
    //   1240: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   1243: goto -> 1247
    //   1246: athrow
    //   1247: getstatic Perryc.0 : I
    //   1250: ifle -> 1264
    //   1253: ldc2_w -1995396212
    //   1256: l2i
    //   1257: ldc_w 1394150595
    //   1260: ixor
    //   1261: goto -> 1272
    //   1264: ldc2_w -830459559
    //   1267: l2i
    //   1268: ldc_w -1239342952
    //   1271: ixor
    //   1272: ldc2_w 1927957172
    //   1275: l2i
    //   1276: ldc_w -1553039889
    //   1279: ixor
    //   1280: ixor
    //   1281: lookupswitch default -> 1308, 193826836 -> 1745, 1844986149 -> 1264
    //   1308: goto -> 1312
    //   1311: athrow
    //   1312: invokespecial checkItem : (Lnet/minecraft/item/ItemStack;)Z
    //   1315: goto -> 1319
    //   1318: athrow
    //   1319: ifne -> 1333
    //   1322: ldc2_w -1848151609
    //   1325: l2i
    //   1326: ldc_w 1965332016
    //   1329: ixor
    //   1330: goto -> 1341
    //   1333: ldc2_w -968500290
    //   1336: l2i
    //   1337: ldc_w 582368330
    //   1340: ixor
    //   1341: ldc2_w 118534529
    //   1344: l2i
    //   1345: ldc_w -95538117
    //   1348: ixor
    //   1349: ixor
    //   1350: tableswitch default -> 1322, 430793293 -> 1372, 430793294 -> 1691
    //   1372: getstatic Perryc.1 : I
    //   1375: ifeq -> 1389
    //   1378: ldc2_w -758984977
    //   1381: l2i
    //   1382: ldc_w 1096057151
    //   1385: ixor
    //   1386: goto -> 1397
    //   1389: ldc2_w 500948534
    //   1392: l2i
    //   1393: ldc_w -999668739
    //   1396: ixor
    //   1397: ldc2_w 897047726
    //   1400: l2i
    //   1401: ldc_w -581894591
    //   1404: ixor
    //   1405: ixor
    //   1406: lookupswitch default -> 1432, -814632524 -> 1389, 2075225407 -> 1709
    //   1432: aload_0
    //   1433: getstatic Perryc.c : I
    //   1436: iflt -> 1450
    //   1439: ldc2_w 297823171
    //   1442: l2i
    //   1443: ldc_w -872359598
    //   1446: ixor
    //   1447: goto -> 1458
    //   1450: ldc2_w 1507160482
    //   1453: l2i
    //   1454: ldc_w 190918003
    //   1457: ixor
    //   1458: ldc2_w -2146491826
    //   1461: l2i
    //   1462: ldc_w 739378740
    //   1465: ixor
    //   1466: ixor
    //   1467: lookupswitch default -> 1492, 1713715979 -> 1450, 1910347499 -> 1737
    //   1492: aload_2
    //   1493: getstatic Perryc.1 : I
    //   1496: ifeq -> 1510
    //   1499: ldc2_w 2120092204
    //   1502: l2i
    //   1503: ldc_w -1007063152
    //   1506: ixor
    //   1507: goto -> 1518
    //   1510: ldc2_w 294736538
    //   1513: l2i
    //   1514: ldc_w -6388254
    //   1517: ixor
    //   1518: ldc2_w 1104666996
    //   1521: l2i
    //   1522: ldc_w 147638250
    //   1525: ixor
    //   1526: ixor
    //   1527: lookupswitch default -> 1552, -983060461 -> 1510, -188988638 -> 1715
    //   1552: goto -> 1556
    //   1555: athrow
    //   1556: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   1559: goto -> 1563
    //   1562: athrow
    //   1563: getstatic Perryc.0 : I
    //   1566: ifle -> 1580
    //   1569: ldc2_w -2112333048
    //   1572: l2i
    //   1573: ldc_w -881018110
    //   1576: ixor
    //   1577: goto -> 1588
    //   1580: ldc2_w 498702336
    //   1583: l2i
    //   1584: ldc_w 584790490
    //   1587: ixor
    //   1588: ldc2_w -367624072
    //   1591: l2i
    //   1592: ldc_w 1315518505
    //   1595: ixor
    //   1596: ixor
    //   1597: lookupswitch default -> 1727, -1692593781 -> 1624, -316975013 -> 1580
    //   1624: goto -> 1628
    //   1627: athrow
    //   1628: invokespecial checkItem : (Lnet/minecraft/item/ItemStack;)Z
    //   1631: goto -> 1635
    //   1634: athrow
    //   1635: ifne -> 1649
    //   1638: ldc2_w 1062827887
    //   1641: l2i
    //   1642: ldc_w 935909688
    //   1645: ixor
    //   1646: goto -> 1657
    //   1649: ldc2_w -889671544
    //   1652: l2i
    //   1653: ldc_w -1033298216
    //   1656: ixor
    //   1657: ldc2_w 840792272
    //   1660: l2i
    //   1661: ldc_w 51322940
    //   1664: ixor
    //   1665: ixor
    //   1666: tableswitch default -> 1638, 964949691 -> 1688, 964949692 -> 1691
    //   1688: goto -> 673
    //   1691: ldc2_w -800263635
    //   1694: l2i
    //   1695: ldc_w -800263635
    //   1698: ixor
    //   1699: ireturn
    //   1700: ldc2_w -125505968
    //   1703: l2i
    //   1704: ldc_w -125505967
    //   1707: ixor
    //   1708: ireturn
    //   1709: aconst_null
    //   1710: athrow
    //   1711: aconst_null
    //   1712: athrow
    //   1713: aconst_null
    //   1714: athrow
    //   1715: aconst_null
    //   1716: athrow
    //   1717: aconst_null
    //   1718: athrow
    //   1719: aconst_null
    //   1720: athrow
    //   1721: aconst_null
    //   1722: athrow
    //   1723: aconst_null
    //   1724: athrow
    //   1725: aconst_null
    //   1726: athrow
    //   1727: aconst_null
    //   1728: athrow
    //   1729: aconst_null
    //   1730: athrow
    //   1731: aconst_null
    //   1732: athrow
    //   1733: aconst_null
    //   1734: athrow
    //   1735: aconst_null
    //   1736: athrow
    //   1737: aconst_null
    //   1738: athrow
    //   1739: aconst_null
    //   1740: athrow
    //   1741: aconst_null
    //   1742: athrow
    //   1743: aconst_null
    //   1744: athrow
    //   1745: aconst_null
    //   1746: athrow
    //   1747: aconst_null
    //   1748: athrow
    //   1749: aconst_null
    //   1750: athrow
    //   1751: aconst_null
    //   1752: athrow
    //   1753: pop
    //   1754: goto -> 24
    //   1757: pop
    //   1758: aconst_null
    //   1759: goto -> 1753
    //   1762: dup
    //   1763: ifnull -> 1753
    //   1766: checkcast java/lang/Throwable
    //   1769: athrow
    //   1770: dup
    //   1771: ifnull -> 1757
    //   1774: checkcast java/lang/Throwable
    //   1777: athrow
    //   1778: aconst_null
    //   1779: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1057	643	2	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	1685	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
    // Exception table:
    //   from	to	target	type
    //   8	20	1762	finally
    //   212	218	218	finally
    //   212	218	218	finally
    //   212	218	218	finally
    //   212	218	3	finally
    //   212	218	3	finally
    //   287	294	294	finally
    //   287	294	294	finally
    //   287	294	287	finally
    //   287	294	3	java/lang/IndexOutOfBoundsException
    //   288	294	294	finally
    //   603	612	612	finally
    //   603	612	3	finally
    //   603	612	603	java/lang/NegativeArraySizeException
    //   604	612	603	java/lang/AssertionError
    //   604	612	603	finally
    //   795	804	804	finally
    //   795	804	3	finally
    //   796	804	3	finally
    //   796	804	795	finally
    //   796	804	3	finally
    //   983	992	992	finally
    //   983	992	983	finally
    //   983	992	992	finally
    //   983	992	3	finally
    //   984	992	3	finally
    //   1239	1246	1246	finally
    //   1239	1246	1239	finally
    //   1239	1246	3	finally
    //   1239	1246	1239	finally
    //   1239	1246	3	finally
    //   1311	1318	1318	finally
    //   1311	1318	1318	finally
    //   1311	1318	1311	finally
    //   1312	1318	1311	finally
    //   1312	1318	1318	finally
    //   1555	1562	1562	finally
    //   1555	1562	3	finally
    //   1555	1562	3	finally
    //   1556	1562	1555	finally
    //   1556	1562	1562	finally
    //   1627	1634	1634	finally
    //   1627	1634	1627	finally
    //   1627	1634	1627	finally
    //   1628	1634	1627	java/lang/NullPointerException
    //   1628	1634	1634	finally
    //   1762	1770	1762	java/lang/NumberFormatException
    //   1778	1780	3	finally
  }
  
  public void attackID(BlockPos pos, int id) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1365
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1357
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1349
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -773290659
    //   33: l2i
    //   34: ldc_w 86439854
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -768231716
    //   44: l2i
    //   45: ldc_w -266476577
    //   48: ixor
    //   49: ldc2_w 1045105148
    //   52: l2i
    //   53: ldc_w 1833213088
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2017335377 -> 1316, 129118158 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/GodModule.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w -547563959
    //   96: l2i
    //   97: ldc_w -1154754389
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 261052731
    //   107: l2i
    //   108: ldc_w 1741975748
    //   111: ixor
    //   112: ldc2_w -1795446442
    //   115: l2i
    //   116: ldc_w 1663967093
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 1306, -1818052415 -> 104, -1618042916 -> 148
    //   148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w 263339695
    //   160: l2i
    //   161: ldc_w 170729493
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 1821716289
    //   171: l2i
    //   172: ldc_w -1999870322
    //   175: ixor
    //   176: ldc2_w -387256159
    //   179: l2i
    //   180: ldc_w -37760165
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 1304, -250844619 -> 212, 281689408 -> 168
    //   212: iload_2
    //   213: getstatic Perryc.c : I
    //   216: iflt -> 230
    //   219: ldc2_w -1833062020
    //   222: l2i
    //   223: ldc_w -2109856841
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 867988958
    //   233: l2i
    //   234: ldc_w -1370662054
    //   237: ixor
    //   238: ldc2_w -1150130368
    //   241: l2i
    //   242: ldc_w -1233170079
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 272, -1696912995 -> 230, 495887594 -> 1330
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual func_73045_a : (I)Lnet/minecraft/entity/Entity;
    //   279: goto -> 283
    //   282: athrow
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -1027978926
    //   292: l2i
    //   293: ldc_w -2107849981
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1997943417
    //   303: l2i
    //   304: ldc_w -1249057040
    //   307: ixor
    //   308: ldc2_w 775607088
    //   311: l2i
    //   312: ldc_w -280647365
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -2120617894 -> 1334, 1252680121 -> 300
    //   344: astore_3
    //   345: getstatic Perryc.1 : I
    //   348: ifeq -> 362
    //   351: ldc2_w 1682144862
    //   354: l2i
    //   355: ldc_w -2095492674
    //   358: ixor
    //   359: goto -> 370
    //   362: ldc2_w -518583164
    //   365: l2i
    //   366: ldc_w 1721668933
    //   369: ixor
    //   370: ldc2_w -945973647
    //   373: l2i
    //   374: ldc_w -1345388528
    //   377: ixor
    //   378: ixor
    //   379: lookupswitch default -> 404, -1895253631 -> 1312, 1441735827 -> 362
    //   404: aload_3
    //   405: ifnull -> 419
    //   408: ldc2_w -1693245251
    //   411: l2i
    //   412: ldc_w -1800667125
    //   415: ixor
    //   416: goto -> 427
    //   419: ldc2_w 1031034827
    //   422: l2i
    //   423: ldc_w 852195186
    //   426: ixor
    //   427: ldc2_w -1577642542
    //   430: l2i
    //   431: ldc_w 326082547
    //   434: ixor
    //   435: ixor
    //   436: tableswitch default -> 408, -1121473897 -> 460, -1121473896 -> 576
    //   460: getstatic Perryc.0 : I
    //   463: ifle -> 477
    //   466: ldc2_w -2039247860
    //   469: l2i
    //   470: ldc_w -1775371469
    //   473: ixor
    //   474: goto -> 485
    //   477: ldc2_w 844985593
    //   480: l2i
    //   481: ldc_w 773558824
    //   484: ixor
    //   485: ldc2_w 1883130470
    //   488: l2i
    //   489: ldc_w 161608118
    //   492: ixor
    //   493: ixor
    //   494: lookupswitch default -> 520, 1634143533 -> 477, 1774308591 -> 1314
    //   520: aload_3
    //   521: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   524: ifeq -> 538
    //   527: ldc2_w -107846289
    //   530: l2i
    //   531: ldc_w 371703629
    //   534: ixor
    //   535: goto -> 546
    //   538: ldc2_w -1289391789
    //   541: l2i
    //   542: ldc_w 1552984944
    //   545: ixor
    //   546: ldc2_w -1718367702
    //   549: l2i
    //   550: ldc_w -352338950
    //   553: ixor
    //   554: ixor
    //   555: tableswitch default -> 527, -1663456270 -> 576, -1663456269 -> 1303
    //   576: new bigname/zprestige/webhack/features/modules/Combat/GodModule$AttackThread
    //   579: dup
    //   580: getstatic Perryc.0 : I
    //   583: ifle -> 597
    //   586: ldc2_w -1853940861
    //   589: l2i
    //   590: ldc_w 175231862
    //   593: ixor
    //   594: goto -> 605
    //   597: ldc2_w -1150632576
    //   600: l2i
    //   601: ldc_w -1700467152
    //   604: ixor
    //   605: ldc2_w 1905087401
    //   608: l2i
    //   609: ldc_w 366361705
    //   612: ixor
    //   613: ixor
    //   614: lookupswitch default -> 1310, -11163851 -> 597, 1167408240 -> 640
    //   640: iload_2
    //   641: getstatic Perryc.c : I
    //   644: iflt -> 658
    //   647: ldc2_w 205603376
    //   650: l2i
    //   651: ldc_w 957289047
    //   654: ixor
    //   655: goto -> 666
    //   658: ldc2_w -415484285
    //   661: l2i
    //   662: ldc_w 840116539
    //   665: ixor
    //   666: ldc2_w 1774679781
    //   669: l2i
    //   670: ldc_w 1632320413
    //   673: ixor
    //   674: ixor
    //   675: lookupswitch default -> 1326, -576499008 -> 700, 1036131615 -> 658
    //   700: aload_1
    //   701: getstatic Perryc.0 : I
    //   704: ifle -> 718
    //   707: ldc2_w -395688582
    //   710: l2i
    //   711: ldc_w -1014196776
    //   714: ixor
    //   715: goto -> 726
    //   718: ldc2_w -1282589789
    //   721: l2i
    //   722: ldc_w -1688149103
    //   725: ixor
    //   726: ldc2_w -1446608518
    //   729: l2i
    //   730: ldc_w 944346075
    //   733: ixor
    //   734: ixor
    //   735: lookupswitch default -> 760, -1946860676 -> 718, -1167474173 -> 1336
    //   760: aload_0
    //   761: getstatic Perryc.0 : I
    //   764: ifle -> 778
    //   767: ldc2_w -610822891
    //   770: l2i
    //   771: ldc_w -981889057
    //   774: ixor
    //   775: goto -> 786
    //   778: ldc2_w -628233103
    //   781: l2i
    //   782: ldc_w -212144919
    //   785: ixor
    //   786: ldc2_w 1226434892
    //   789: l2i
    //   790: ldc_w -1220375323
    //   793: ixor
    //   794: ixor
    //   795: lookupswitch default -> 820, -524976285 -> 1308, 1465303082 -> 778
    //   820: getfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   823: getstatic Perryc.1 : I
    //   826: ifeq -> 840
    //   829: ldc2_w 459514886
    //   832: l2i
    //   833: ldc_w -1800518342
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 39103491
    //   843: l2i
    //   844: ldc_w 528771136
    //   847: ixor
    //   848: ldc2_w -256958104
    //   851: l2i
    //   852: ldc_w 1344386394
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 884, -858456585 -> 840, 792950030 -> 1318
    //   884: goto -> 888
    //   887: athrow
    //   888: invokevirtual getValue : ()Ljava/lang/Object;
    //   891: goto -> 895
    //   894: athrow
    //   895: checkcast java/lang/Integer
    //   898: getstatic Perryc.c : I
    //   901: iflt -> 915
    //   904: ldc2_w 1470215415
    //   907: l2i
    //   908: ldc_w 1291815019
    //   911: ixor
    //   912: goto -> 923
    //   915: ldc2_w 416743581
    //   918: l2i
    //   919: ldc_w -1986606453
    //   922: ixor
    //   923: ldc2_w 1271818765
    //   926: l2i
    //   927: ldc_w 2009144285
    //   930: ixor
    //   931: ixor
    //   932: lookupswitch default -> 960, -215039750 -> 915, 659639628 -> 1332
    //   960: goto -> 964
    //   963: athrow
    //   964: invokevirtual intValue : ()I
    //   967: goto -> 971
    //   970: athrow
    //   971: getstatic Perryc.1 : I
    //   974: ifeq -> 988
    //   977: ldc2_w 649161569
    //   980: l2i
    //   981: ldc_w 844771875
    //   984: ixor
    //   985: goto -> 996
    //   988: ldc2_w 2108568889
    //   991: l2i
    //   992: ldc_w -2077775668
    //   995: ixor
    //   996: ldc2_w 614175299
    //   999: l2i
    //   1000: ldc_w 2006526527
    //   1003: ixor
    //   1004: ixor
    //   1005: lookupswitch default -> 1032, 578748330 -> 988, 1206509886 -> 1328
    //   1032: aload_0
    //   1033: getstatic Perryc.c : I
    //   1036: iflt -> 1050
    //   1039: ldc2_w 1044628985
    //   1042: l2i
    //   1043: ldc_w -1147106625
    //   1046: ixor
    //   1047: goto -> 1058
    //   1050: ldc2_w 1537452323
    //   1053: l2i
    //   1054: ldc_w 1594401063
    //   1057: ixor
    //   1058: ldc2_w -1878082432
    //   1061: l2i
    //   1062: ldc_w -82784440
    //   1065: ixor
    //   1066: ixor
    //   1067: lookupswitch default -> 1092, -285393778 -> 1320, 925019866 -> 1050
    //   1092: goto -> 1096
    //   1095: athrow
    //   1096: invokespecial <init> : (ILnet/minecraft/util/math/BlockPos;ILbigname/zprestige/webhack/features/modules/Combat/GodModule;)V
    //   1099: goto -> 1103
    //   1102: athrow
    //   1103: getstatic Perryc.c : I
    //   1106: iflt -> 1120
    //   1109: ldc2_w 1794501847
    //   1112: l2i
    //   1113: ldc_w 1904236883
    //   1116: ixor
    //   1117: goto -> 1128
    //   1120: ldc2_w -1597345873
    //   1123: l2i
    //   1124: ldc_w -946351663
    //   1127: ixor
    //   1128: ldc2_w -1523786914
    //   1131: l2i
    //   1132: ldc_w 1986565816
    //   1135: ixor
    //   1136: ixor
    //   1137: lookupswitch default -> 1164, -936249246 -> 1324, 1670114703 -> 1120
    //   1164: astore #4
    //   1166: getstatic Perryc.1 : I
    //   1169: ifeq -> 1183
    //   1172: ldc2_w -1857846794
    //   1175: l2i
    //   1176: ldc_w -1338545493
    //   1179: ixor
    //   1180: goto -> 1191
    //   1183: ldc2_w 1858790537
    //   1186: l2i
    //   1187: ldc_w -1592438713
    //   1190: ixor
    //   1191: ldc2_w 141699368
    //   1194: l2i
    //   1195: ldc_w 1112416622
    //   1198: ixor
    //   1199: ixor
    //   1200: lookupswitch default -> 1338, -2048672632 -> 1228, 1799938843 -> 1183
    //   1228: aload #4
    //   1230: getstatic Perryc.1 : I
    //   1233: ifeq -> 1247
    //   1236: ldc2_w 1648458537
    //   1239: l2i
    //   1240: ldc_w 1724130083
    //   1243: ixor
    //   1244: goto -> 1255
    //   1247: ldc2_w 2101933404
    //   1250: l2i
    //   1251: ldc_w -2022279352
    //   1254: ixor
    //   1255: ldc2_w 114021232
    //   1258: l2i
    //   1259: ldc_w 1215023950
    //   1262: ixor
    //   1263: ixor
    //   1264: lookupswitch default -> 1322, -1264674262 -> 1292, 1243955252 -> 1247
    //   1292: goto -> 1296
    //   1295: athrow
    //   1296: invokevirtual start : ()V
    //   1299: goto -> 1303
    //   1302: athrow
    //   1303: return
    //   1304: aconst_null
    //   1305: athrow
    //   1306: aconst_null
    //   1307: athrow
    //   1308: aconst_null
    //   1309: athrow
    //   1310: aconst_null
    //   1311: athrow
    //   1312: aconst_null
    //   1313: athrow
    //   1314: aconst_null
    //   1315: athrow
    //   1316: aconst_null
    //   1317: athrow
    //   1318: aconst_null
    //   1319: athrow
    //   1320: aconst_null
    //   1321: athrow
    //   1322: aconst_null
    //   1323: athrow
    //   1324: aconst_null
    //   1325: athrow
    //   1326: aconst_null
    //   1327: athrow
    //   1328: aconst_null
    //   1329: athrow
    //   1330: aconst_null
    //   1331: athrow
    //   1332: aconst_null
    //   1333: athrow
    //   1334: aconst_null
    //   1335: athrow
    //   1336: aconst_null
    //   1337: athrow
    //   1338: aconst_null
    //   1339: athrow
    //   1340: pop
    //   1341: goto -> 24
    //   1344: pop
    //   1345: aconst_null
    //   1346: goto -> 1340
    //   1349: dup
    //   1350: ifnull -> 1340
    //   1353: checkcast java/lang/Throwable
    //   1356: athrow
    //   1357: dup
    //   1358: ifnull -> 1344
    //   1361: checkcast java/lang/Throwable
    //   1364: athrow
    //   1365: aconst_null
    //   1366: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1166	137	4	attackThread	Lbigname/zprestige/webhack/features/modules/Combat/GodModule$AttackThread;
    //   24	1280	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
    //   24	1280	1	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	1280	2	id	I
    //   345	959	3	entity	Lnet/minecraft/entity/Entity;
    // Exception table:
    //   from	to	target	type
    //   8	20	1349	finally
    //   275	282	282	finally
    //   275	282	3	finally
    //   276	282	275	java/lang/ClassCastException
    //   276	282	3	java/lang/NumberFormatException
    //   276	282	3	java/lang/EnumConstantNotPresentException
    //   887	894	894	finally
    //   887	894	3	finally
    //   887	894	894	java/lang/NullPointerException
    //   887	894	894	java/lang/AssertionError
    //   887	894	887	java/lang/StringIndexOutOfBoundsException
    //   963	970	970	finally
    //   963	970	3	finally
    //   963	970	3	finally
    //   963	970	963	finally
    //   964	970	3	java/lang/RuntimeException
    //   1095	1102	1102	finally
    //   1095	1102	1102	java/lang/UnsupportedOperationException
    //   1095	1102	1095	finally
    //   1095	1102	3	java/util/ConcurrentModificationException
    //   1096	1102	1095	java/lang/NegativeArraySizeException
    //   1295	1302	1302	finally
    //   1295	1302	1302	finally
    //   1295	1302	3	finally
    //   1296	1302	1295	finally
    //   1296	1302	3	finally
    //   1349	1357	1349	java/lang/EnumConstantNotPresentException
    //   1365	1367	3	finally
  }
  
  public void updateEntityID() {
    Perry1.3l(this, (int)1437738337L ^ 0x5FECAA17);
  }
  
  public void rotateTo(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1211
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1203
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1195
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1687008533
    //   33: l2i
    //   34: ldc_w -107994133
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 798756277
    //   44: l2i
    //   45: ldc_w 558048610
    //   48: ixor
    //   49: ldc2_w 1376577341
    //   52: l2i
    //   53: ldc_w -127261750
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1182, -1531319264 -> 84, -930828809 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/GodModule.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.1 : I
    //   90: ifeq -> 104
    //   93: ldc2_w -102246986
    //   96: l2i
    //   97: ldc_w -1833785636
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 605171196
    //   107: l2i
    //   108: ldc_w 1249616778
    //   111: ixor
    //   112: ldc2_w 2076611422
    //   115: l2i
    //   116: ldc_w -795079347
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 1154, -1072697991 -> 104, -986509211 -> 148
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w 688298659
    //   160: l2i
    //   161: ldc_w -1224780044
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 1113286700
    //   171: l2i
    //   172: ldc_w 708137229
    //   175: ixor
    //   176: ldc2_w 1604072392
    //   179: l2i
    //   180: ldc_w -1634535414
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 1176, -1453264157 -> 212, 1593247637 -> 168
    //   212: getstatic bigname/zprestige/webhack/features/modules/Combat/GodModule.mc : Lnet/minecraft/client/Minecraft;
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w -253978119
    //   224: l2i
    //   225: ldc_w -919478170
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -272272014
    //   235: l2i
    //   236: ldc_w -879274666
    //   239: ixor
    //   240: ldc2_w -492457873
    //   243: l2i
    //   244: ldc_w -540363052
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, 75661092 -> 1178, 546828033 -> 232
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual func_184121_ak : ()F
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.c : I
    //   290: iflt -> 304
    //   293: ldc2_w 13820002
    //   296: l2i
    //   297: ldc_w -351129686
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 205946407
    //   307: l2i
    //   308: ldc_w 1770073008
    //   311: ixor
    //   312: ldc2_w 1913959893
    //   315: l2i
    //   316: ldc_w 835681508
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1474623751 -> 1174, 776369633 -> 304
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual func_174824_e : (F)Lnet/minecraft/util/math/Vec3d;
    //   355: goto -> 359
    //   358: athrow
    //   359: new net/minecraft/util/math/Vec3d
    //   362: dup
    //   363: getstatic Perryc.c : I
    //   366: iflt -> 380
    //   369: ldc2_w -1372993752
    //   372: l2i
    //   373: ldc_w -365938501
    //   376: ixor
    //   377: goto -> 388
    //   380: ldc2_w 463704700
    //   383: l2i
    //   384: ldc_w -612857786
    //   387: ixor
    //   388: ldc2_w 629228146
    //   391: l2i
    //   392: ldc_w -1460868130
    //   395: ixor
    //   396: ixor
    //   397: lookupswitch default -> 424, -915122625 -> 1180, 109144899 -> 380
    //   424: aload_1
    //   425: getstatic Perryc.0 : I
    //   428: ifle -> 442
    //   431: ldc2_w -881354421
    //   434: l2i
    //   435: ldc_w -1745839182
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w 673582597
    //   445: l2i
    //   446: ldc_w -521175634
    //   449: ixor
    //   450: ldc2_w -383358574
    //   453: l2i
    //   454: ldc_w 1828227194
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 484, -648420591 -> 1170, -344047425 -> 442
    //   484: goto -> 488
    //   487: athrow
    //   488: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   491: goto -> 495
    //   494: athrow
    //   495: getstatic Perryc.1 : I
    //   498: ifeq -> 512
    //   501: ldc2_w 1620704091
    //   504: l2i
    //   505: ldc_w 726410740
    //   508: ixor
    //   509: goto -> 520
    //   512: ldc2_w -1806360207
    //   515: l2i
    //   516: ldc_w -551250590
    //   519: ixor
    //   520: ldc2_w 896261368
    //   523: l2i
    //   524: ldc_w 680087633
    //   527: ixor
    //   528: ixor
    //   529: lookupswitch default -> 1156, 1446466054 -> 512, 1452488890 -> 556
    //   556: goto -> 560
    //   559: athrow
    //   560: invokestatic calcAngle : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
    //   563: goto -> 567
    //   566: athrow
    //   567: getstatic Perryc.c : I
    //   570: iflt -> 584
    //   573: ldc2_w -1353873044
    //   576: l2i
    //   577: ldc_w -1808207643
    //   580: ixor
    //   581: goto -> 592
    //   584: ldc2_w 1991878964
    //   587: l2i
    //   588: ldc_w 1285718157
    //   591: ixor
    //   592: ldc2_w -677836210
    //   595: l2i
    //   596: ldc_w -52988264
    //   599: ixor
    //   600: ixor
    //   601: lookupswitch default -> 1168, 272303455 -> 584, 290805103 -> 628
    //   628: astore_2
    //   629: getstatic Perryc.1 : I
    //   632: ifeq -> 646
    //   635: ldc2_w -2010151775
    //   638: l2i
    //   639: ldc_w 1569403110
    //   642: ixor
    //   643: goto -> 654
    //   646: ldc2_w -1987795981
    //   649: l2i
    //   650: ldc_w -484024399
    //   653: ixor
    //   654: ldc2_w -1381318993
    //   657: l2i
    //   658: ldc_w 1912592209
    //   661: ixor
    //   662: ixor
    //   663: lookupswitch default -> 1162, -1225288260 -> 688, 166845881 -> 646
    //   688: aload_0
    //   689: getstatic Perryc.0 : I
    //   692: ifle -> 706
    //   695: ldc2_w -604561229
    //   698: l2i
    //   699: ldc_w -569709611
    //   702: ixor
    //   703: goto -> 714
    //   706: ldc2_w 2025362198
    //   709: l2i
    //   710: ldc_w -1518205073
    //   713: ixor
    //   714: ldc2_w 1895729056
    //   717: l2i
    //   718: ldc_w 858287658
    //   721: ixor
    //   722: ixor
    //   723: lookupswitch default -> 1164, -1628668429 -> 748, 1177232108 -> 706
    //   748: aload_2
    //   749: ldc2_w 577551045
    //   752: l2i
    //   753: ldc_w 577551045
    //   756: ixor
    //   757: faload
    //   758: getstatic Perryc.c : I
    //   761: iflt -> 775
    //   764: ldc2_w -503804607
    //   767: l2i
    //   768: ldc_w -1293006419
    //   771: ixor
    //   772: goto -> 783
    //   775: ldc2_w -1057659301
    //   778: l2i
    //   779: ldc_w 1207748848
    //   782: ixor
    //   783: ldc2_w -1133680868
    //   786: l2i
    //   787: ldc_w 1782110477
    //   790: ixor
    //   791: ixor
    //   792: lookupswitch default -> 820, -2059175171 -> 1158, 863823790 -> 775
    //   820: putfield yaw : F
    //   823: getstatic Perryc.0 : I
    //   826: ifle -> 840
    //   829: ldc2_w 1875563199
    //   832: l2i
    //   833: ldc_w -1236915801
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 2099528955
    //   843: l2i
    //   844: ldc_w -374771376
    //   847: ixor
    //   848: ldc2_w -622378198
    //   851: l2i
    //   852: ldc_w -857233752
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 1152, -2104635351 -> 884, -812900710 -> 840
    //   884: aload_0
    //   885: getstatic Perryc.1 : I
    //   888: ifeq -> 902
    //   891: ldc2_w 115677126
    //   894: l2i
    //   895: ldc_w -2109581968
    //   898: ixor
    //   899: goto -> 910
    //   902: ldc2_w -1032088916
    //   905: l2i
    //   906: ldc_w -710791890
    //   909: ixor
    //   910: ldc2_w 732728227
    //   913: l2i
    //   914: ldc_w 24861058
    //   917: ixor
    //   918: ixor
    //   919: lookupswitch default -> 1184, -1368354665 -> 902, 1024355747 -> 944
    //   944: aload_2
    //   945: ldc2_w -1981498395
    //   948: l2i
    //   949: ldc_w -1981498396
    //   952: ixor
    //   953: faload
    //   954: getstatic Perryc.1 : I
    //   957: ifeq -> 971
    //   960: ldc2_w 1300646898
    //   963: l2i
    //   964: ldc_w -157921765
    //   967: ixor
    //   968: goto -> 979
    //   971: ldc2_w -1626239590
    //   974: l2i
    //   975: ldc_w -1292904547
    //   978: ixor
    //   979: ldc2_w -1134663450
    //   982: l2i
    //   983: ldc_w -1517234679
    //   986: ixor
    //   987: ixor
    //   988: lookupswitch default -> 1166, -1562461434 -> 971, 875619560 -> 1016
    //   1016: putfield pitch : F
    //   1019: getstatic Perryc.0 : I
    //   1022: ifle -> 1036
    //   1025: ldc2_w 1544885122
    //   1028: l2i
    //   1029: ldc_w 2024458587
    //   1032: ixor
    //   1033: goto -> 1044
    //   1036: ldc2_w -401937655
    //   1039: l2i
    //   1040: ldc_w -2087715846
    //   1043: ixor
    //   1044: ldc2_w 139521060
    //   1047: l2i
    //   1048: ldc_w -1216409046
    //   1051: ixor
    //   1052: ixor
    //   1053: lookupswitch default -> 1160, -1685052201 -> 1036, -726995203 -> 1080
    //   1080: aload_0
    //   1081: ldc2_w -698379266
    //   1084: l2i
    //   1085: ldc_w -698379265
    //   1088: ixor
    //   1089: getstatic Perryc.0 : I
    //   1092: ifle -> 1106
    //   1095: ldc2_w -1943257147
    //   1098: l2i
    //   1099: ldc_w 1185475037
    //   1102: ixor
    //   1103: goto -> 1114
    //   1106: ldc2_w 1911400012
    //   1109: l2i
    //   1110: ldc_w 464156455
    //   1113: ixor
    //   1114: ldc2_w 47947281
    //   1117: l2i
    //   1118: ldc_w 2136886376
    //   1121: ixor
    //   1122: ixor
    //   1123: lookupswitch default -> 1172, -1224670111 -> 1106, 398590738 -> 1148
    //   1148: putfield rotating : Z
    //   1151: return
    //   1152: aconst_null
    //   1153: athrow
    //   1154: aconst_null
    //   1155: athrow
    //   1156: aconst_null
    //   1157: athrow
    //   1158: aconst_null
    //   1159: athrow
    //   1160: aconst_null
    //   1161: athrow
    //   1162: aconst_null
    //   1163: athrow
    //   1164: aconst_null
    //   1165: athrow
    //   1166: aconst_null
    //   1167: athrow
    //   1168: aconst_null
    //   1169: athrow
    //   1170: aconst_null
    //   1171: athrow
    //   1172: aconst_null
    //   1173: athrow
    //   1174: aconst_null
    //   1175: athrow
    //   1176: aconst_null
    //   1177: athrow
    //   1178: aconst_null
    //   1179: athrow
    //   1180: aconst_null
    //   1181: athrow
    //   1182: aconst_null
    //   1183: athrow
    //   1184: aconst_null
    //   1185: athrow
    //   1186: pop
    //   1187: goto -> 24
    //   1190: pop
    //   1191: aconst_null
    //   1192: goto -> 1186
    //   1195: dup
    //   1196: ifnull -> 1186
    //   1199: checkcast java/lang/Throwable
    //   1202: athrow
    //   1203: dup
    //   1204: ifnull -> 1190
    //   1207: checkcast java/lang/Throwable
    //   1210: athrow
    //   1211: aconst_null
    //   1212: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1128	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
    //   24	1128	1	pos	Lnet/minecraft/util/math/BlockPos;
    //   629	523	2	angle	[F
    // Exception table:
    //   from	to	target	type
    //   8	20	1195	java/lang/NegativeArraySizeException
    //   280	286	286	finally
    //   280	286	3	finally
    //   280	286	286	java/lang/IllegalArgumentException
    //   280	286	286	finally
    //   280	286	286	finally
    //   351	358	358	finally
    //   351	358	351	finally
    //   352	358	3	java/util/NoSuchElementException
    //   352	358	351	finally
    //   352	358	351	java/lang/AssertionError
    //   488	494	494	finally
    //   488	494	3	finally
    //   488	494	3	java/lang/IllegalArgumentException
    //   488	494	494	finally
    //   488	494	3	finally
    //   560	566	566	finally
    //   560	566	3	finally
    //   560	566	566	java/lang/IllegalArgumentException
    //   560	566	566	finally
    //   560	566	3	finally
    //   1195	1203	1195	finally
    //   1211	1213	3	finally
  }
  
  public void checkID(int paramInt) {
    Perry1.D(this, (int)-797462623L ^ 0xC9A8ACE9, paramInt);
  }
  
  @SubscribeEvent
  public void onPacketReceive(PacketEvent.Receive event) {
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
  
  public void onLogout() {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\GodModule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */