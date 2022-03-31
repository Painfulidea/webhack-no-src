package bigname.zprestige.webhack.features.modules.Chat;

import Perry0;
import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.DeathEvent;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AutoGG extends Module {
  public EntityPlayer cauraTarget;
  
  public Map<EntityPlayer, Integer> targets;
  
  public static String path = Perry0.0("䔋㌖䕔ㅄꮃ๲㣞芹먟ﷳਨ裣綽㺲?辇鴥");
  
  public Setting<Integer> delay;
  
  public List<String> messages;
  
  public Setting<Integer> targetResetTimer;
  
  public boolean cooldown;
  
  public Timer timer;
  
  public Timer cooldownTimer;
  
  public void onTick() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4819
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 4811
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4803
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 1034709546
    //   33: l2i
    //   34: ldc 134816352
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 678417767
    //   43: l2i
    //   44: ldc -94567320
    //   46: ixor
    //   47: ldc2_w 127522582
    //   50: l2i
    //   51: ldc 1340383626
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 4678, -1706055789 -> 80, 2111323862 -> 40
    //   80: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   83: ifnull -> 96
    //   86: ldc2_w -1265373455
    //   89: l2i
    //   90: ldc -1583276039
    //   92: ixor
    //   93: goto -> 103
    //   96: ldc2_w 1138667006
    //   99: l2i
    //   100: ldc 1458330871
    //   102: ixor
    //   103: ldc2_w 1634575794
    //   106: l2i
    //   107: ldc 322007802
    //   109: ixor
    //   110: ixor
    //   111: tableswitch default -> 86, 1735272000 -> 132, 1735272001 -> 539
    //   132: getstatic Perryc.c : I
    //   135: iflt -> 148
    //   138: ldc2_w -2061014979
    //   141: l2i
    //   142: ldc 1504772265
    //   144: ixor
    //   145: goto -> 155
    //   148: ldc2_w -705165055
    //   151: l2i
    //   152: ldc -423086097
    //   154: ixor
    //   155: ldc2_w 341319522
    //   158: l2i
    //   159: ldc -140068147
    //   161: ixor
    //   162: ixor
    //   163: lookupswitch default -> 188, -1103195131 -> 148, 1063832891 -> 4758
    //   188: aload_0
    //   189: getstatic Perryc.0 : I
    //   192: ifle -> 205
    //   195: ldc2_w 1425707302
    //   198: l2i
    //   199: ldc -2069097705
    //   201: ixor
    //   202: goto -> 212
    //   205: ldc2_w 2132776841
    //   208: l2i
    //   209: ldc -1152530290
    //   211: ixor
    //   212: ldc2_w 171242774
    //   215: l2i
    //   216: ldc -2129914288
    //   218: ixor
    //   219: ixor
    //   220: lookupswitch default -> 248, -1257291319 -> 205, 1533960567 -> 4704
    //   248: getfield cauraTarget : Lnet/minecraft/entity/player/EntityPlayer;
    //   251: getstatic Perryc.c : I
    //   254: iflt -> 267
    //   257: ldc2_w 2043124780
    //   260: l2i
    //   261: ldc -1077790037
    //   263: ixor
    //   264: goto -> 274
    //   267: ldc2_w -1603425683
    //   270: l2i
    //   271: ldc 107678799
    //   273: ixor
    //   274: ldc2_w -250558859
    //   277: l2i
    //   278: ldc 1721147951
    //   280: ixor
    //   281: ixor
    //   282: lookupswitch default -> 308, -1524619573 -> 267, 1367589597 -> 4756
    //   308: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   311: if_acmpeq -> 324
    //   314: ldc2_w -2117292838
    //   317: l2i
    //   318: ldc 72901996
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w 1071442161
    //   327: l2i
    //   328: ldc -1169678012
    //   330: ixor
    //   331: ldc2_w -1480945797
    //   334: l2i
    //   335: ldc -1323192176
    //   337: ixor
    //   338: ixor
    //   339: tableswitch default -> 314, -1827670435 -> 360, -1827670434 -> 539
    //   360: getstatic Perryc.1 : I
    //   363: ifeq -> 376
    //   366: ldc2_w 1304659505
    //   369: l2i
    //   370: ldc -993851110
    //   372: ixor
    //   373: goto -> 383
    //   376: ldc2_w 802999557
    //   379: l2i
    //   380: ldc 1611028608
    //   382: ixor
    //   383: ldc2_w 1024417493
    //   386: l2i
    //   387: ldc -1676844988
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 4682, -287790316 -> 416, 671265210 -> 376
    //   416: aload_0
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w -780855108
    //   426: l2i
    //   427: ldc 403052507
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 80889771
    //   436: l2i
    //   437: ldc 1652566821
    //   439: ixor
    //   440: ldc2_w 423759866
    //   443: l2i
    //   444: ldc 2011096415
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -1477450302 -> 4728, -769320579 -> 433
    //   476: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   479: getstatic Perryc.c : I
    //   482: iflt -> 495
    //   485: ldc2_w -1309392392
    //   488: l2i
    //   489: ldc 361862607
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w 258948571
    //   498: l2i
    //   499: ldc 1231817427
    //   501: ixor
    //   502: ldc2_w 545677545
    //   505: l2i
    //   506: ldc 591281172
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 4742, -1478653750 -> 495, 1169910773 -> 536
    //   536: putfield cauraTarget : Lnet/minecraft/entity/player/EntityPlayer;
    //   539: getstatic Perryc.1 : I
    //   542: ifeq -> 555
    //   545: ldc2_w -161636494
    //   548: l2i
    //   549: ldc -334539341
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w 1206187731
    //   558: l2i
    //   559: ldc 1477949032
    //   561: ixor
    //   562: ldc2_w -1524889546
    //   565: l2i
    //   566: ldc -185966974
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, -779594501 -> 555, 1269079157 -> 4708
    //   596: aload_0
    //   597: getstatic Perryc.c : I
    //   600: iflt -> 613
    //   603: ldc2_w -1377217655
    //   606: l2i
    //   607: ldc -1277190564
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w -1844105326
    //   616: l2i
    //   617: ldc 1029271346
    //   619: ixor
    //   620: ldc2_w 1758625649
    //   623: l2i
    //   624: ldc -1953158683
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 4698, -42886335 -> 613, 1275794996 -> 656
    //   656: getfield cooldown : Z
    //   659: ifne -> 672
    //   662: ldc2_w -1822361723
    //   665: l2i
    //   666: ldc 517602141
    //   668: ixor
    //   669: goto -> 679
    //   672: ldc2_w -921628510
    //   675: l2i
    //   676: ldc 1151868027
    //   678: ixor
    //   679: ldc2_w 395678277
    //   682: l2i
    //   683: ldc -1812633639
    //   685: ixor
    //   686: ixor
    //   687: tableswitch default -> 662, 165280068 -> 708, 165280069 -> 896
    //   708: getstatic Perryc.0 : I
    //   711: ifle -> 724
    //   714: ldc2_w 1169672755
    //   717: l2i
    //   718: ldc 2069417981
    //   720: ixor
    //   721: goto -> 731
    //   724: ldc2_w 1905007728
    //   727: l2i
    //   728: ldc 40310676
    //   730: ixor
    //   731: ldc2_w -492732189
    //   734: l2i
    //   735: ldc -1405176421
    //   737: ixor
    //   738: ixor
    //   739: lookupswitch default -> 764, 82927205 -> 724, 1886400694 -> 4786
    //   764: aload_0
    //   765: getstatic Perryc.0 : I
    //   768: ifle -> 781
    //   771: ldc2_w -1208920305
    //   774: l2i
    //   775: ldc 405063348
    //   777: ixor
    //   778: goto -> 788
    //   781: ldc2_w 8279642
    //   784: l2i
    //   785: ldc 775712604
    //   787: ixor
    //   788: ldc2_w -1374275960
    //   791: l2i
    //   792: ldc -322071651
    //   794: ixor
    //   795: ixor
    //   796: lookupswitch default -> 4762, -317836114 -> 781, 1822006291 -> 824
    //   824: getfield cooldownTimer : Lbigname/zprestige/webhack/util/Timer;
    //   827: getstatic Perryc.c : I
    //   830: iflt -> 843
    //   833: ldc2_w -1646906463
    //   836: l2i
    //   837: ldc 290191535
    //   839: ixor
    //   840: goto -> 850
    //   843: ldc2_w 545305610
    //   846: l2i
    //   847: ldc 714323076
    //   849: ixor
    //   850: ldc2_w -481438883
    //   853: l2i
    //   854: ldc -549929082
    //   856: ixor
    //   857: ixor
    //   858: lookupswitch default -> 4766, -1326929963 -> 843, 912682069 -> 884
    //   884: goto -> 888
    //   887: athrow
    //   888: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   891: goto -> 895
    //   894: athrow
    //   895: pop
    //   896: getstatic Perryc.0 : I
    //   899: ifle -> 912
    //   902: ldc2_w 946280928
    //   905: l2i
    //   906: ldc -424583640
    //   908: ixor
    //   909: goto -> 919
    //   912: ldc2_w -823945840
    //   915: l2i
    //   916: ldc 854651226
    //   918: ixor
    //   919: ldc2_w 1548958734
    //   922: l2i
    //   923: ldc -2034759242
    //   925: ixor
    //   926: ixor
    //   927: lookupswitch default -> 952, 71135856 -> 4750, 1848483515 -> 912
    //   952: aload_0
    //   953: getstatic Perryc.0 : I
    //   956: ifle -> 969
    //   959: ldc2_w 1885617321
    //   962: l2i
    //   963: ldc -775475634
    //   965: ixor
    //   966: goto -> 976
    //   969: ldc2_w -1257054125
    //   972: l2i
    //   973: ldc 1561597777
    //   975: ixor
    //   976: ldc2_w -482819796
    //   979: l2i
    //   980: ldc 160571832
    //   982: ixor
    //   983: ixor
    //   984: lookupswitch default -> 4778, 44832662 -> 1012, 1258943091 -> 969
    //   1012: getfield cooldownTimer : Lbigname/zprestige/webhack/util/Timer;
    //   1015: getstatic Perryc.0 : I
    //   1018: ifle -> 1031
    //   1021: ldc2_w 517736937
    //   1024: l2i
    //   1025: ldc -467531163
    //   1027: ixor
    //   1028: goto -> 1038
    //   1031: ldc2_w 1653387222
    //   1034: l2i
    //   1035: ldc -340870407
    //   1037: ixor
    //   1038: ldc2_w 1258687898
    //   1041: l2i
    //   1042: ldc -486191705
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 1072, 379710052 -> 1031, 1392329649 -> 4754
    //   1072: aload_0
    //   1073: getstatic Perryc.c : I
    //   1076: iflt -> 1089
    //   1079: ldc2_w -1373959133
    //   1082: l2i
    //   1083: ldc 986993991
    //   1085: ixor
    //   1086: goto -> 1097
    //   1089: ldc2_w -1859509897
    //   1092: l2i
    //   1093: ldc_w -1951325945
    //   1096: ixor
    //   1097: ldc2_w -1790291762
    //   1100: l2i
    //   1101: ldc_w 550782758
    //   1104: ixor
    //   1105: ixor
    //   1106: lookupswitch default -> 4670, -1358620776 -> 1132, 558976652 -> 1089
    //   1132: getfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1135: getstatic Perryc.c : I
    //   1138: iflt -> 1152
    //   1141: ldc2_w 455821192
    //   1144: l2i
    //   1145: ldc_w 939165353
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w -924849703
    //   1155: l2i
    //   1156: ldc_w 986625144
    //   1159: ixor
    //   1160: ldc2_w -756175958
    //   1163: l2i
    //   1164: ldc_w 138669500
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 1196, -1723763142 -> 1152, -159414473 -> 4744
    //   1196: goto -> 1200
    //   1199: athrow
    //   1200: invokevirtual getValue : ()Ljava/lang/Object;
    //   1203: goto -> 1207
    //   1206: athrow
    //   1207: checkcast java/lang/Integer
    //   1210: getstatic Perryc.0 : I
    //   1213: ifle -> 1227
    //   1216: ldc2_w -1537436074
    //   1219: l2i
    //   1220: ldc_w 317577049
    //   1223: ixor
    //   1224: goto -> 1235
    //   1227: ldc2_w 915074728
    //   1230: l2i
    //   1231: ldc_w 1224524434
    //   1234: ixor
    //   1235: ldc2_w -646574681
    //   1238: l2i
    //   1239: ldc_w -1010025888
    //   1242: ixor
    //   1243: ixor
    //   1244: lookupswitch default -> 1272, -1578137433 -> 1227, -1408534840 -> 4738
    //   1272: goto -> 1276
    //   1275: athrow
    //   1276: invokevirtual intValue : ()I
    //   1279: goto -> 1283
    //   1282: athrow
    //   1283: i2d
    //   1284: getstatic Perryc.c : I
    //   1287: iflt -> 1301
    //   1290: ldc2_w 1149975957
    //   1293: l2i
    //   1294: ldc_w 857642632
    //   1297: ixor
    //   1298: goto -> 1309
    //   1301: ldc2_w -280240483
    //   1304: l2i
    //   1305: ldc_w 696700586
    //   1308: ixor
    //   1309: ldc2_w 1788228367
    //   1312: l2i
    //   1313: ldc_w -905379253
    //   1316: ixor
    //   1317: ixor
    //   1318: lookupswitch default -> 1344, -687170983 -> 4716, 1925517524 -> 1301
    //   1344: goto -> 1348
    //   1347: athrow
    //   1348: invokevirtual passedS : (D)Z
    //   1351: goto -> 1355
    //   1354: athrow
    //   1355: ifeq -> 1369
    //   1358: ldc2_w 1058314351
    //   1361: l2i
    //   1362: ldc_w 1025042789
    //   1365: ixor
    //   1366: goto -> 1377
    //   1369: ldc2_w 1865232530
    //   1372: l2i
    //   1373: ldc_w 1830896031
    //   1376: ixor
    //   1377: ldc2_w -1658750144
    //   1380: l2i
    //   1381: ldc_w -1046582207
    //   1384: ixor
    //   1385: ixor
    //   1386: tableswitch default -> 1358, 1588815371 -> 1408, 1588815372 -> 1912
    //   1408: getstatic Perryc.0 : I
    //   1411: ifle -> 1425
    //   1414: ldc2_w -109950212
    //   1417: l2i
    //   1418: ldc_w -366957660
    //   1421: ixor
    //   1422: goto -> 1433
    //   1425: ldc2_w -1905820811
    //   1428: l2i
    //   1429: ldc_w 1342803020
    //   1432: ixor
    //   1433: ldc2_w 626392237
    //   1436: l2i
    //   1437: ldc_w -1909321838
    //   1440: ixor
    //   1441: ixor
    //   1442: lookupswitch default -> 4688, -1204481433 -> 1425, 1963525126 -> 1468
    //   1468: aload_0
    //   1469: getstatic Perryc.c : I
    //   1472: iflt -> 1486
    //   1475: ldc2_w -48636476
    //   1478: l2i
    //   1479: ldc_w 1202148828
    //   1482: ixor
    //   1483: goto -> 1494
    //   1486: ldc2_w -153457767
    //   1489: l2i
    //   1490: ldc_w 600374237
    //   1493: ixor
    //   1494: ldc2_w 2067730244
    //   1497: l2i
    //   1498: ldc_w -1644756696
    //   1501: ixor
    //   1502: ixor
    //   1503: lookupswitch default -> 4770, 869965352 -> 1528, 1551271540 -> 1486
    //   1528: getfield cooldown : Z
    //   1531: ifeq -> 1545
    //   1534: ldc2_w -48265194
    //   1537: l2i
    //   1538: ldc_w 709208472
    //   1541: ixor
    //   1542: goto -> 1553
    //   1545: ldc2_w 1833730956
    //   1548: l2i
    //   1549: ldc_w -1172921855
    //   1552: ixor
    //   1553: ldc2_w -1260461463
    //   1556: l2i
    //   1557: ldc_w 514887530
    //   1560: ixor
    //   1561: ixor
    //   1562: tableswitch default -> 1534, 2100579469 -> 1584, 2100579470 -> 1912
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w 933011478
    //   1593: l2i
    //   1594: ldc_w -425068089
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w 1038014844
    //   1604: l2i
    //   1605: ldc_w -1905469207
    //   1608: ixor
    //   1609: ldc2_w 2023975581
    //   1612: l2i
    //   1613: ldc_w -367408812
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 4664, 554213980 -> 1644, 1133509144 -> 1601
    //   1644: aload_0
    //   1645: ldc2_w -907169268
    //   1648: l2i
    //   1649: ldc_w -907169268
    //   1652: ixor
    //   1653: getstatic Perryc.c : I
    //   1656: iflt -> 1670
    //   1659: ldc2_w 732822919
    //   1662: l2i
    //   1663: ldc_w 935168111
    //   1666: ixor
    //   1667: goto -> 1678
    //   1670: ldc2_w -333361778
    //   1673: l2i
    //   1674: ldc_w -1740203174
    //   1677: ixor
    //   1678: ldc2_w -73482601
    //   1681: l2i
    //   1682: ldc_w 1037246739
    //   1685: ixor
    //   1686: ixor
    //   1687: lookupswitch default -> 1712, -631379348 -> 4730, 56882379 -> 1670
    //   1712: putfield cooldown : Z
    //   1715: getstatic Perryc.1 : I
    //   1718: ifeq -> 1732
    //   1721: ldc2_w 1788398490
    //   1724: l2i
    //   1725: ldc_w 760487174
    //   1728: ixor
    //   1729: goto -> 1740
    //   1732: ldc2_w 809750313
    //   1735: l2i
    //   1736: ldc_w 1401022059
    //   1739: ixor
    //   1740: ldc2_w 1558386725
    //   1743: l2i
    //   1744: ldc_w -233285162
    //   1747: ixor
    //   1748: ixor
    //   1749: lookupswitch default -> 4784, -851875663 -> 1776, -382232721 -> 1732
    //   1776: aload_0
    //   1777: getstatic Perryc.0 : I
    //   1780: ifle -> 1794
    //   1783: ldc2_w -472606717
    //   1786: l2i
    //   1787: ldc_w -2126618981
    //   1790: ixor
    //   1791: goto -> 1802
    //   1794: ldc2_w -2060524936
    //   1797: l2i
    //   1798: ldc_w -1368373013
    //   1801: ixor
    //   1802: ldc2_w -1629109320
    //   1805: l2i
    //   1806: ldc_w -1017801451
    //   1809: ixor
    //   1810: ixor
    //   1811: lookupswitch default -> 4774, 1062899765 -> 1794, 1995373630 -> 1836
    //   1836: getfield cooldownTimer : Lbigname/zprestige/webhack/util/Timer;
    //   1839: getstatic Perryc.c : I
    //   1842: iflt -> 1856
    //   1845: ldc2_w 1907356286
    //   1848: l2i
    //   1849: ldc_w 864276341
    //   1852: ixor
    //   1853: goto -> 1864
    //   1856: ldc2_w -1935214026
    //   1859: l2i
    //   1860: ldc_w -1364348829
    //   1863: ixor
    //   1864: ldc2_w 1017157833
    //   1867: l2i
    //   1868: ldc_w 827217866
    //   1871: ixor
    //   1872: ixor
    //   1873: lookupswitch default -> 1900, 1338176008 -> 4772, 1412518291 -> 1856
    //   1900: goto -> 1904
    //   1903: athrow
    //   1904: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   1907: goto -> 1911
    //   1910: athrow
    //   1911: pop
    //   1912: getstatic Perryc.0 : I
    //   1915: ifle -> 1929
    //   1918: ldc2_w -1619012273
    //   1921: l2i
    //   1922: ldc_w 1933605616
    //   1925: ixor
    //   1926: goto -> 1937
    //   1929: ldc2_w -960911730
    //   1932: l2i
    //   1933: ldc_w -1098864044
    //   1936: ixor
    //   1937: ldc2_w 270181378
    //   1940: l2i
    //   1941: ldc_w -1422225328
    //   1944: ixor
    //   1945: ixor
    //   1946: lookupswitch default -> 4722, -1021757304 -> 1972, 1461689325 -> 1929
    //   1972: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   1975: ifnull -> 1989
    //   1978: ldc2_w 1907557562
    //   1981: l2i
    //   1982: ldc_w -800617784
    //   1985: ixor
    //   1986: goto -> 1997
    //   1989: ldc2_w -2048785622
    //   1992: l2i
    //   1993: ldc_w 605457753
    //   1996: ixor
    //   1997: ldc2_w 1049237734
    //   2000: l2i
    //   2001: ldc_w 1055927570
    //   2004: ixor
    //   2005: ixor
    //   2006: tableswitch default -> 1978, -1584481402 -> 2028, -1584481401 -> 2566
    //   2028: getstatic Perryc.0 : I
    //   2031: ifle -> 2045
    //   2034: ldc2_w -1597727273
    //   2037: l2i
    //   2038: ldc_w 1017597428
    //   2041: ixor
    //   2042: goto -> 2053
    //   2045: ldc2_w 1047802759
    //   2048: l2i
    //   2049: ldc_w -728204226
    //   2052: ixor
    //   2053: ldc2_w 1420316299
    //   2056: l2i
    //   2057: ldc_w 375600901
    //   2060: ixor
    //   2061: ixor
    //   2062: lookupswitch default -> 2088, -559371859 -> 4720, -529508161 -> 2045
    //   2088: aload_0
    //   2089: getstatic Perryc.0 : I
    //   2092: ifle -> 2106
    //   2095: ldc2_w -1561882427
    //   2098: l2i
    //   2099: ldc_w 1615425847
    //   2102: ixor
    //   2103: goto -> 2114
    //   2106: ldc2_w 1506142845
    //   2109: l2i
    //   2110: ldc_w -185117972
    //   2113: ixor
    //   2114: ldc2_w -1499698099
    //   2117: l2i
    //   2118: ldc_w 1239579787
    //   2121: ixor
    //   2122: ixor
    //   2123: lookupswitch default -> 4674, 768667956 -> 2106, 1112320087 -> 2148
    //   2148: getfield targets : Ljava/util/Map;
    //   2151: getstatic Perryc.1 : I
    //   2154: ifeq -> 2168
    //   2157: ldc2_w -1507896137
    //   2160: l2i
    //   2161: ldc_w 1028207223
    //   2164: ixor
    //   2165: goto -> 2176
    //   2168: ldc2_w 356596075
    //   2171: l2i
    //   2172: ldc_w 1610095625
    //   2175: ixor
    //   2176: ldc2_w -1464436282
    //   2179: l2i
    //   2180: ldc_w -671589497
    //   2183: ixor
    //   2184: ixor
    //   2185: lookupswitch default -> 2212, -1210043717 -> 2168, -468171647 -> 4668
    //   2212: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoCrystal.target : Lnet/minecraft/entity/player/EntityPlayer;
    //   2215: getstatic Perryc.0 : I
    //   2218: ifle -> 2232
    //   2221: ldc2_w 748836053
    //   2224: l2i
    //   2225: ldc_w -654700264
    //   2228: ixor
    //   2229: goto -> 2240
    //   2232: ldc2_w 794121560
    //   2235: l2i
    //   2236: ldc_w 1118914731
    //   2239: ixor
    //   2240: ldc2_w -849583459
    //   2243: l2i
    //   2244: ldc_w 748662677
    //   2247: ixor
    //   2248: ixor
    //   2249: lookupswitch default -> 4700, -1943547653 -> 2276, 362514629 -> 2232
    //   2276: aload_0
    //   2277: getstatic Perryc.0 : I
    //   2280: ifle -> 2294
    //   2283: ldc2_w -1797628704
    //   2286: l2i
    //   2287: ldc_w 1898296445
    //   2290: ixor
    //   2291: goto -> 2302
    //   2294: ldc2_w -781322075
    //   2297: l2i
    //   2298: ldc_w -10060919
    //   2301: ixor
    //   2302: ldc2_w -2084460785
    //   2305: l2i
    //   2306: ldc_w -999542875
    //   2309: ixor
    //   2310: ixor
    //   2311: lookupswitch default -> 4684, -1571659721 -> 2294, 1772489606 -> 2336
    //   2336: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   2339: getstatic Perryc.1 : I
    //   2342: ifeq -> 2356
    //   2345: ldc2_w 876880736
    //   2348: l2i
    //   2349: ldc_w 1797554457
    //   2352: ixor
    //   2353: goto -> 2364
    //   2356: ldc2_w -538748138
    //   2359: l2i
    //   2360: ldc_w -1492457503
    //   2363: ixor
    //   2364: ldc2_w 1934091816
    //   2367: l2i
    //   2368: ldc_w 956154946
    //   2371: ixor
    //   2372: ixor
    //   2373: lookupswitch default -> 2400, 349863955 -> 4792, 1456524768 -> 2356
    //   2400: goto -> 2404
    //   2403: athrow
    //   2404: invokevirtual getPassedTimeMs : ()J
    //   2407: goto -> 2411
    //   2410: athrow
    //   2411: ldc_w 1875674415
    //   2414: i2l
    //   2415: ldc2_w 1875674823
    //   2418: lxor
    //   2419: ldiv
    //   2420: l2i
    //   2421: getstatic Perryc.1 : I
    //   2424: ifeq -> 2438
    //   2427: ldc2_w -189262826
    //   2430: l2i
    //   2431: ldc_w -1431064548
    //   2434: ixor
    //   2435: goto -> 2446
    //   2438: ldc2_w 1509173411
    //   2441: l2i
    //   2442: ldc_w -542323324
    //   2445: ixor
    //   2446: ldc2_w -1145339944
    //   2449: l2i
    //   2450: ldc_w -458057009
    //   2453: ixor
    //   2454: ixor
    //   2455: lookupswitch default -> 2480, -762628892 -> 2438, 16924957 -> 4676
    //   2480: goto -> 2484
    //   2483: athrow
    //   2484: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2487: goto -> 2491
    //   2490: athrow
    //   2491: getstatic Perryc.c : I
    //   2494: iflt -> 2508
    //   2497: ldc2_w -1592699863
    //   2500: l2i
    //   2501: ldc_w 1827861420
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -555333867
    //   2511: l2i
    //   2512: ldc_w 522053618
    //   2515: ixor
    //   2516: ldc2_w -386710875
    //   2519: l2i
    //   2520: ldc_w 1681537178
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 4732, 1093328314 -> 2508, 1295178456 -> 2552
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2561: goto -> 2565
    //   2564: athrow
    //   2565: pop
    //   2566: getstatic Perryc.c : I
    //   2569: iflt -> 2583
    //   2572: ldc2_w -2097747321
    //   2575: l2i
    //   2576: ldc_w -1832493558
    //   2579: ixor
    //   2580: goto -> 2591
    //   2583: ldc2_w 1518869688
    //   2586: l2i
    //   2587: ldc_w -121232684
    //   2590: ixor
    //   2591: ldc2_w 1299773545
    //   2594: l2i
    //   2595: ldc_w -1348686592
    //   2598: ixor
    //   2599: ixor
    //   2600: lookupswitch default -> 4666, -220929564 -> 2583, 1084910341 -> 2628
    //   2628: aload_0
    //   2629: getstatic Perryc.0 : I
    //   2632: ifle -> 2646
    //   2635: ldc2_w 1959906152
    //   2638: l2i
    //   2639: ldc_w -938981476
    //   2642: ixor
    //   2643: goto -> 2654
    //   2646: ldc2_w 489567890
    //   2649: l2i
    //   2650: ldc_w -2020741482
    //   2653: ixor
    //   2654: ldc2_w 759813540
    //   2657: l2i
    //   2658: ldc_w -1884578323
    //   2661: ixor
    //   2662: ixor
    //   2663: lookupswitch default -> 2688, 507233469 -> 4692, 2082434242 -> 2646
    //   2688: getfield targets : Ljava/util/Map;
    //   2691: getstatic Perryc.c : I
    //   2694: iflt -> 2708
    //   2697: ldc2_w -73032191
    //   2700: l2i
    //   2701: ldc_w 1217531295
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w -158814680
    //   2711: l2i
    //   2712: ldc_w 1175846236
    //   2715: ixor
    //   2716: ldc2_w -1336672614
    //   2719: l2i
    //   2720: ldc_w 195266906
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 2752, 147317854 -> 4782, 703621895 -> 2708
    //   2752: aload_0
    //   2753: <illegal opcode> apply : (Lbigname/zprestige/webhack/features/modules/Chat/AutoGG;)Ljava/util/function/BiFunction;
    //   2758: getstatic Perryc.c : I
    //   2761: iflt -> 2775
    //   2764: ldc2_w 659981087
    //   2767: l2i
    //   2768: ldc_w 961614938
    //   2771: ixor
    //   2772: goto -> 2783
    //   2775: ldc2_w 467986634
    //   2778: l2i
    //   2779: ldc_w -1592320878
    //   2782: ixor
    //   2783: ldc2_w 1222500303
    //   2786: l2i
    //   2787: ldc_w 1349826730
    //   2790: ixor
    //   2791: ixor
    //   2792: lookupswitch default -> 2820, 112128032 -> 4734, 1326604394 -> 2775
    //   2820: goto -> 2824
    //   2823: athrow
    //   2824: invokeinterface replaceAll : (Ljava/util/function/BiFunction;)V
    //   2829: goto -> 2833
    //   2832: athrow
    //   2833: getstatic Perryc.c : I
    //   2836: iflt -> 2850
    //   2839: ldc2_w -522025440
    //   2842: l2i
    //   2843: ldc_w -1845085287
    //   2846: ixor
    //   2847: goto -> 2858
    //   2850: ldc2_w 1280637014
    //   2853: l2i
    //   2854: ldc_w -694057453
    //   2857: ixor
    //   2858: ldc2_w 1422061724
    //   2861: l2i
    //   2862: ldc_w 1579431489
    //   2865: ixor
    //   2866: ixor
    //   2867: lookupswitch default -> 2892, 246654024 -> 2850, 2013428580 -> 4718
    //   2892: aload_0
    //   2893: getstatic Perryc.0 : I
    //   2896: ifle -> 2910
    //   2899: ldc2_w -883549279
    //   2902: l2i
    //   2903: ldc_w -1524860449
    //   2906: ixor
    //   2907: goto -> 2918
    //   2910: ldc2_w 929681787
    //   2913: l2i
    //   2914: ldc_w 1398786140
    //   2917: ixor
    //   2918: ldc2_w 385627348
    //   2921: l2i
    //   2922: ldc_w -1795213029
    //   2925: ixor
    //   2926: ixor
    //   2927: lookupswitch default -> 4736, -432728856 -> 2952, -330731599 -> 2910
    //   2952: getfield targets : Ljava/util/Map;
    //   2955: getstatic Perryc.1 : I
    //   2958: ifeq -> 2972
    //   2961: ldc2_w -277983980
    //   2964: l2i
    //   2965: ldc_w -1085620757
    //   2968: ixor
    //   2969: goto -> 2980
    //   2972: ldc2_w -1271952308
    //   2975: l2i
    //   2976: ldc_w -2076597697
    //   2979: ixor
    //   2980: ldc2_w 905912254
    //   2983: l2i
    //   2984: ldc_w 1116901006
    //   2987: ixor
    //   2988: ixor
    //   2989: lookupswitch default -> 3016, 428908270 -> 2972, 659120591 -> 4788
    //   3016: goto -> 3020
    //   3019: athrow
    //   3020: invokeinterface keySet : ()Ljava/util/Set;
    //   3025: goto -> 3029
    //   3028: athrow
    //   3029: getstatic Perryc.1 : I
    //   3032: ifeq -> 3046
    //   3035: ldc2_w 1667447497
    //   3038: l2i
    //   3039: ldc_w -238427691
    //   3042: ixor
    //   3043: goto -> 3054
    //   3046: ldc2_w 1478698822
    //   3049: l2i
    //   3050: ldc_w 2139970167
    //   3053: ixor
    //   3054: ldc2_w 1466232472
    //   3057: l2i
    //   3058: ldc_w -968677379
    //   3061: ixor
    //   3062: ixor
    //   3063: lookupswitch default -> 3088, -185989004 -> 3046, 59576953 -> 4690
    //   3088: goto -> 3092
    //   3091: athrow
    //   3092: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3097: goto -> 3101
    //   3100: athrow
    //   3101: getstatic Perryc.0 : I
    //   3104: ifle -> 3118
    //   3107: ldc2_w -613762737
    //   3110: l2i
    //   3111: ldc_w 142514451
    //   3114: ixor
    //   3115: goto -> 3126
    //   3118: ldc2_w 1844789464
    //   3121: l2i
    //   3122: ldc_w 1782924841
    //   3125: ixor
    //   3126: ldc2_w 1815044949
    //   3129: l2i
    //   3130: ldc_w 2069583117
    //   3133: ixor
    //   3134: ixor
    //   3135: lookupswitch default -> 3160, -1000335868 -> 4776, -835256066 -> 3118
    //   3160: astore_1
    //   3161: getstatic Perryc.1 : I
    //   3164: ifeq -> 3178
    //   3167: ldc2_w -767449124
    //   3170: l2i
    //   3171: ldc_w -284208592
    //   3174: ixor
    //   3175: goto -> 3186
    //   3178: ldc2_w 772918455
    //   3181: l2i
    //   3182: ldc_w -1201202620
    //   3185: ixor
    //   3186: ldc2_w 1327513263
    //   3189: l2i
    //   3190: ldc_w 1001893577
    //   3193: ixor
    //   3194: ixor
    //   3195: lookupswitch default -> 4746, -488552811 -> 3220, 1238984074 -> 3178
    //   3220: aload_1
    //   3221: getstatic Perryc.1 : I
    //   3224: ifeq -> 3238
    //   3227: ldc2_w 147610509
    //   3230: l2i
    //   3231: ldc_w 1715816287
    //   3234: ixor
    //   3235: goto -> 3246
    //   3238: ldc2_w -137897236
    //   3241: l2i
    //   3242: ldc_w -1540702912
    //   3245: ixor
    //   3246: ldc2_w -120598647
    //   3249: l2i
    //   3250: ldc_w 814066341
    //   3253: ixor
    //   3254: ixor
    //   3255: lookupswitch default -> 3280, -1497138690 -> 4726, 741879666 -> 3238
    //   3280: goto -> 3284
    //   3283: athrow
    //   3284: invokeinterface hasNext : ()Z
    //   3289: goto -> 3293
    //   3292: athrow
    //   3293: ifeq -> 3307
    //   3296: ldc2_w -1582911787
    //   3299: l2i
    //   3300: ldc_w -1055480244
    //   3303: ixor
    //   3304: goto -> 3315
    //   3307: ldc2_w 710271151
    //   3310: l2i
    //   3311: ldc_w 1256581175
    //   3314: ixor
    //   3315: ldc2_w 476632168
    //   3318: l2i
    //   3319: ldc_w -1773807835
    //   3322: ixor
    //   3323: ixor
    //   3324: tableswitch default -> 3296, -358806572 -> 3348, -358806571 -> 4663
    //   3348: getstatic Perryc.1 : I
    //   3351: ifeq -> 3365
    //   3354: ldc2_w -236780010
    //   3357: l2i
    //   3358: ldc_w 1022944740
    //   3361: ixor
    //   3362: goto -> 3373
    //   3365: ldc2_w 1867631489
    //   3368: l2i
    //   3369: ldc_w -1118418768
    //   3372: ixor
    //   3373: ldc2_w 1053474881
    //   3376: l2i
    //   3377: ldc_w 1924422424
    //   3380: ixor
    //   3381: ixor
    //   3382: lookupswitch default -> 3408, -2124056405 -> 4696, -90113658 -> 3365
    //   3408: aload_1
    //   3409: getstatic Perryc.c : I
    //   3412: iflt -> 3426
    //   3415: ldc2_w -501209833
    //   3418: l2i
    //   3419: ldc_w 998943348
    //   3422: ixor
    //   3423: goto -> 3434
    //   3426: ldc2_w 1990105036
    //   3429: l2i
    //   3430: ldc_w 1013723853
    //   3433: ixor
    //   3434: ldc2_w -326203187
    //   3437: l2i
    //   3438: ldc_w 1750207727
    //   3441: ixor
    //   3442: ixor
    //   3443: lookupswitch default -> 3468, 1568017217 -> 4790, 1663647236 -> 3426
    //   3468: goto -> 3472
    //   3471: athrow
    //   3472: invokeinterface next : ()Ljava/lang/Object;
    //   3477: goto -> 3481
    //   3480: athrow
    //   3481: checkcast net/minecraft/entity/player/EntityPlayer
    //   3484: getstatic Perryc.c : I
    //   3487: iflt -> 3501
    //   3490: ldc2_w -1023933753
    //   3493: l2i
    //   3494: ldc_w -200660559
    //   3497: ixor
    //   3498: goto -> 3509
    //   3501: ldc2_w -351528997
    //   3504: l2i
    //   3505: ldc_w -1087550162
    //   3508: ixor
    //   3509: ldc2_w -1275021045
    //   3512: l2i
    //   3513: ldc_w 1294006233
    //   3516: ixor
    //   3517: ixor
    //   3518: lookupswitch default -> 3544, -808295004 -> 4764, 132325916 -> 3501
    //   3544: astore_2
    //   3545: getstatic Perryc.0 : I
    //   3548: ifle -> 3562
    //   3551: ldc2_w -421928968
    //   3554: l2i
    //   3555: ldc_w -277370633
    //   3558: ixor
    //   3559: goto -> 3570
    //   3562: ldc2_w 1415463796
    //   3565: l2i
    //   3566: ldc_w 795717102
    //   3569: ixor
    //   3570: ldc2_w -750813170
    //   3573: l2i
    //   3574: ldc_w -1779512606
    //   3577: ixor
    //   3578: ixor
    //   3579: lookupswitch default -> 4712, 1038263414 -> 3604, 1333738979 -> 3562
    //   3604: aload_0
    //   3605: getstatic Perryc.0 : I
    //   3608: ifle -> 3622
    //   3611: ldc2_w -327952426
    //   3614: l2i
    //   3615: ldc_w 873552898
    //   3618: ixor
    //   3619: goto -> 3630
    //   3622: ldc2_w -963198872
    //   3625: l2i
    //   3626: ldc_w 667847768
    //   3629: ixor
    //   3630: ldc2_w -2085295388
    //   3633: l2i
    //   3634: ldc_w 1351003103
    //   3637: ixor
    //   3638: ixor
    //   3639: lookupswitch default -> 3664, 189844207 -> 4760, 536793056 -> 3622
    //   3664: getfield targets : Ljava/util/Map;
    //   3667: getstatic Perryc.1 : I
    //   3670: ifeq -> 3684
    //   3673: ldc2_w 1904498427
    //   3676: l2i
    //   3677: ldc_w 1504489910
    //   3680: ixor
    //   3681: goto -> 3692
    //   3684: ldc2_w -646404593
    //   3687: l2i
    //   3688: ldc_w 1467465149
    //   3691: ixor
    //   3692: ldc2_w 2070391308
    //   3695: l2i
    //   3696: ldc_w -1097975108
    //   3699: ixor
    //   3700: ixor
    //   3701: lookupswitch default -> 3728, -306087939 -> 4740, -155763942 -> 3684
    //   3728: aload_2
    //   3729: getstatic Perryc.0 : I
    //   3732: ifle -> 3746
    //   3735: ldc2_w -460955594
    //   3738: l2i
    //   3739: ldc_w -2090122269
    //   3742: ixor
    //   3743: goto -> 3754
    //   3746: ldc2_w 1286504316
    //   3749: l2i
    //   3750: ldc_w -565497824
    //   3753: ixor
    //   3754: ldc2_w 1191667466
    //   3757: l2i
    //   3758: ldc_w -929461596
    //   3761: ixor
    //   3762: ixor
    //   3763: lookupswitch default -> 4706, -395063685 -> 3746, 494641906 -> 3788
    //   3788: goto -> 3792
    //   3791: athrow
    //   3792: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3797: goto -> 3801
    //   3800: athrow
    //   3801: checkcast java/lang/Integer
    //   3804: getstatic Perryc.1 : I
    //   3807: ifeq -> 3821
    //   3810: ldc2_w -1579954855
    //   3813: l2i
    //   3814: ldc_w 324797752
    //   3817: ixor
    //   3818: goto -> 3829
    //   3821: ldc2_w -856761960
    //   3824: l2i
    //   3825: ldc_w 1827750757
    //   3828: ixor
    //   3829: ldc2_w 462190083
    //   3832: l2i
    //   3833: ldc_w -1254214651
    //   3836: ixor
    //   3837: ixor
    //   3838: lookupswitch default -> 4714, 246274299 -> 3864, 473795175 -> 3821
    //   3864: goto -> 3868
    //   3867: athrow
    //   3868: invokevirtual intValue : ()I
    //   3871: goto -> 3875
    //   3874: athrow
    //   3875: getstatic Perryc.0 : I
    //   3878: ifle -> 3892
    //   3881: ldc2_w 488515682
    //   3884: l2i
    //   3885: ldc_w 1359211386
    //   3888: ixor
    //   3889: goto -> 3900
    //   3892: ldc2_w -1920115086
    //   3895: l2i
    //   3896: ldc_w 354113327
    //   3899: ixor
    //   3900: ldc2_w -98989788
    //   3903: l2i
    //   3904: ldc_w -227469065
    //   3907: ixor
    //   3908: ixor
    //   3909: lookupswitch default -> 4710, -1862362994 -> 3936, 1148539595 -> 3892
    //   3936: aload_0
    //   3937: getstatic Perryc.c : I
    //   3940: iflt -> 3954
    //   3943: ldc2_w -1679420472
    //   3946: l2i
    //   3947: ldc_w 283197176
    //   3950: ixor
    //   3951: goto -> 3962
    //   3954: ldc2_w 1373794097
    //   3957: l2i
    //   3958: ldc_w 737343254
    //   3961: ixor
    //   3962: ldc2_w 1929670037
    //   3965: l2i
    //   3966: ldc_w -2127122152
    //   3969: ixor
    //   3970: ixor
    //   3971: lookupswitch default -> 3996, 1244756015 -> 3954, 2033578429 -> 4752
    //   3996: getfield targetResetTimer : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3999: getstatic Perryc.1 : I
    //   4002: ifeq -> 4016
    //   4005: ldc2_w 384653660
    //   4008: l2i
    //   4009: ldc_w -716284580
    //   4012: ixor
    //   4013: goto -> 4024
    //   4016: ldc2_w 1089496282
    //   4019: l2i
    //   4020: ldc_w 1901895439
    //   4023: ixor
    //   4024: ldc2_w 1872185376
    //   4027: l2i
    //   4028: ldc_w 1896086041
    //   4031: ixor
    //   4032: ixor
    //   4033: lookupswitch default -> 4060, -583551431 -> 4724, 571180329 -> 4016
    //   4060: goto -> 4064
    //   4063: athrow
    //   4064: invokevirtual getValue : ()Ljava/lang/Object;
    //   4067: goto -> 4071
    //   4070: athrow
    //   4071: checkcast java/lang/Integer
    //   4074: getstatic Perryc.c : I
    //   4077: iflt -> 4091
    //   4080: ldc2_w -915154422
    //   4083: l2i
    //   4084: ldc_w 523187234
    //   4087: ixor
    //   4088: goto -> 4099
    //   4091: ldc2_w -1075690093
    //   4094: l2i
    //   4095: ldc_w 365562411
    //   4098: ixor
    //   4099: ldc2_w 29530963
    //   4102: l2i
    //   4103: ldc_w 656631097
    //   4106: ixor
    //   4107: ixor
    //   4108: lookupswitch default -> 4136, -256044990 -> 4702, 198810374 -> 4091
    //   4136: goto -> 4140
    //   4139: athrow
    //   4140: invokevirtual intValue : ()I
    //   4143: goto -> 4147
    //   4146: athrow
    //   4147: if_icmpgt -> 4161
    //   4150: ldc2_w 1690476494
    //   4153: l2i
    //   4154: ldc_w 1338843832
    //   4157: ixor
    //   4158: goto -> 4169
    //   4161: ldc2_w -1189050487
    //   4164: l2i
    //   4165: ldc_w -1842398466
    //   4168: ixor
    //   4169: ldc2_w -1182883947
    //   4172: l2i
    //   4173: ldc_w -585330619
    //   4176: ixor
    //   4177: ixor
    //   4178: tableswitch default -> 4150, 1332589222 -> 4200, 1332589223 -> 4203
    //   4200: goto -> 3161
    //   4203: getstatic Perryc.0 : I
    //   4206: ifle -> 4220
    //   4209: ldc2_w -1290307583
    //   4212: l2i
    //   4213: ldc_w 792959510
    //   4216: ixor
    //   4217: goto -> 4228
    //   4220: ldc2_w -1995682567
    //   4223: l2i
    //   4224: ldc_w 897936775
    //   4227: ixor
    //   4228: ldc2_w -186259706
    //   4231: l2i
    //   4232: ldc_w -1867249530
    //   4235: ixor
    //   4236: ixor
    //   4237: lookupswitch default -> 4264, -133886569 -> 4768, 2053263526 -> 4220
    //   4264: aload_0
    //   4265: getstatic Perryc.1 : I
    //   4268: ifeq -> 4282
    //   4271: ldc2_w -1260433840
    //   4274: l2i
    //   4275: ldc_w -1053883636
    //   4278: ixor
    //   4279: goto -> 4290
    //   4282: ldc2_w -1276373623
    //   4285: l2i
    //   4286: ldc_w -190596625
    //   4289: ixor
    //   4290: ldc2_w -1710675212
    //   4293: l2i
    //   4294: ldc_w -620972111
    //   4297: ixor
    //   4298: ixor
    //   4299: lookupswitch default -> 4680, 129642787 -> 4324, 889573401 -> 4282
    //   4324: getfield targets : Ljava/util/Map;
    //   4327: getstatic Perryc.0 : I
    //   4330: ifle -> 4344
    //   4333: ldc2_w 1438450384
    //   4336: l2i
    //   4337: ldc_w -56208196
    //   4340: ixor
    //   4341: goto -> 4352
    //   4344: ldc2_w -245505749
    //   4347: l2i
    //   4348: ldc_w 89472788
    //   4351: ixor
    //   4352: ldc2_w -1008168089
    //   4355: l2i
    //   4356: ldc_w -1440785258
    //   4359: ixor
    //   4360: ixor
    //   4361: lookupswitch default -> 4748, -1644228146 -> 4388, -1058236003 -> 4344
    //   4388: aload_2
    //   4389: getstatic Perryc.1 : I
    //   4392: ifeq -> 4406
    //   4395: ldc2_w -1978082134
    //   4398: l2i
    //   4399: ldc_w -1691265759
    //   4402: ixor
    //   4403: goto -> 4414
    //   4406: ldc2_w -1807823603
    //   4409: l2i
    //   4410: ldc_w 1721971079
    //   4413: ixor
    //   4414: ldc2_w -675304925
    //   4417: l2i
    //   4418: ldc_w 1338235941
    //   4421: ixor
    //   4422: ixor
    //   4423: lookupswitch default -> 4448, -1990852723 -> 4694, -1192276104 -> 4406
    //   4448: goto -> 4452
    //   4451: athrow
    //   4452: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4457: goto -> 4461
    //   4460: athrow
    //   4461: pop
    //   4462: getstatic Perryc.1 : I
    //   4465: ifeq -> 4479
    //   4468: ldc2_w 420011442
    //   4471: l2i
    //   4472: ldc_w 997153345
    //   4475: ixor
    //   4476: goto -> 4487
    //   4479: ldc2_w -1490415013
    //   4482: l2i
    //   4483: ldc_w 63183109
    //   4486: ixor
    //   4487: ldc2_w 1883733948
    //   4490: l2i
    //   4491: ldc_w 1616475930
    //   4494: ixor
    //   4495: ixor
    //   4496: lookupswitch default -> 4672, -1259338760 -> 4524, 846827349 -> 4479
    //   4524: aload_0
    //   4525: getstatic Perryc.1 : I
    //   4528: ifeq -> 4542
    //   4531: ldc2_w 1817585060
    //   4534: l2i
    //   4535: ldc_w -1210283474
    //   4538: ixor
    //   4539: goto -> 4550
    //   4542: ldc2_w 1362731606
    //   4545: l2i
    //   4546: ldc_w -2132398956
    //   4549: ixor
    //   4550: ldc2_w 1057857883
    //   4553: l2i
    //   4554: ldc_w 175503859
    //   4557: ixor
    //   4558: ixor
    //   4559: lookupswitch default -> 4584, -286066910 -> 4780, -230477714 -> 4542
    //   4584: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   4587: getstatic Perryc.0 : I
    //   4590: ifle -> 4604
    //   4593: ldc2_w 1531483017
    //   4596: l2i
    //   4597: ldc_w -1003455983
    //   4600: ixor
    //   4601: goto -> 4612
    //   4604: ldc2_w 1630508094
    //   4607: l2i
    //   4608: ldc_w 1988773449
    //   4611: ixor
    //   4612: ldc2_w 953290979
    //   4615: l2i
    //   4616: ldc_w -341261209
    //   4619: ixor
    //   4620: ixor
    //   4621: lookupswitch default -> 4648, -521311072 -> 4604, 1275215132 -> 4686
    //   4648: goto -> 4652
    //   4651: athrow
    //   4652: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   4655: goto -> 4659
    //   4658: athrow
    //   4659: pop
    //   4660: goto -> 3161
    //   4663: return
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
    //   4794: pop
    //   4795: goto -> 24
    //   4798: pop
    //   4799: aconst_null
    //   4800: goto -> 4794
    //   4803: dup
    //   4804: ifnull -> 4794
    //   4807: checkcast java/lang/Throwable
    //   4810: athrow
    //   4811: dup
    //   4812: ifnull -> 4798
    //   4815: checkcast java/lang/Throwable
    //   4818: athrow
    //   4819: aconst_null
    //   4820: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   3545	1115	2	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	4640	0	this	Lbigname/zprestige/webhack/features/modules/Chat/AutoGG;
    // Exception table:
    //   from	to	target	type
    //   8	20	4803	java/lang/ArithmeticException
    //   887	894	894	finally
    //   888	894	3	finally
    //   888	894	3	java/lang/IllegalStateException
    //   888	894	887	finally
    //   888	894	887	finally
    //   1199	1206	1206	finally
    //   1199	1206	1206	java/lang/ArithmeticException
    //   1199	1206	1206	java/lang/ClassCastException
    //   1200	1206	1199	java/lang/IllegalStateException
    //   1200	1206	1206	finally
    //   1276	1282	1282	finally
    //   1276	1282	3	java/util/ConcurrentModificationException
    //   1276	1282	3	finally
    //   1276	1282	1282	java/lang/EnumConstantNotPresentException
    //   1276	1282	3	java/lang/ArrayIndexOutOfBoundsException
    //   1348	1354	1354	finally
    //   1348	1354	3	java/lang/IllegalArgumentException
    //   1348	1354	1354	java/lang/NegativeArraySizeException
    //   1348	1354	3	java/util/NoSuchElementException
    //   1348	1354	1354	finally
    //   1903	1910	1910	finally
    //   1903	1910	1903	finally
    //   1903	1910	3	finally
    //   1904	1910	1903	finally
    //   1904	1910	1910	finally
    //   2403	2410	2410	finally
    //   2403	2410	3	java/lang/IllegalArgumentException
    //   2403	2410	2410	java/lang/UnsupportedOperationException
    //   2404	2410	2403	finally
    //   2404	2410	2403	finally
    //   2484	2490	2490	finally
    //   2484	2490	3	java/lang/NumberFormatException
    //   2484	2490	3	finally
    //   2484	2490	2490	java/lang/EnumConstantNotPresentException
    //   2484	2490	2490	java/lang/IllegalStateException
    //   2555	2564	2564	finally
    //   2555	2564	2555	java/lang/AssertionError
    //   2555	2564	2564	finally
    //   2556	2564	2555	finally
    //   2556	2564	3	java/lang/ArrayIndexOutOfBoundsException
    //   2823	2832	2832	finally
    //   2823	2832	3	java/util/ConcurrentModificationException
    //   2823	2832	2823	java/lang/AssertionError
    //   2824	2832	2823	java/lang/IndexOutOfBoundsException
    //   2824	2832	3	java/lang/IndexOutOfBoundsException
    //   3019	3028	3028	finally
    //   3019	3028	3019	java/lang/RuntimeException
    //   3019	3028	3019	finally
    //   3019	3028	3	finally
    //   3020	3028	3019	java/lang/StringIndexOutOfBoundsException
    //   3091	3100	3100	finally
    //   3091	3100	3091	java/lang/IllegalStateException
    //   3091	3100	3091	finally
    //   3091	3100	3091	finally
    //   3092	3100	3100	finally
    //   3283	3292	3292	finally
    //   3283	3292	3	java/lang/NumberFormatException
    //   3283	3292	3	finally
    //   3284	3292	3283	java/lang/ClassCastException
    //   3284	3292	3283	finally
    //   3471	3480	3480	finally
    //   3471	3480	3480	java/util/ConcurrentModificationException
    //   3471	3480	3	java/lang/RuntimeException
    //   3472	3480	3	java/lang/ArrayIndexOutOfBoundsException
    //   3472	3480	3471	java/lang/IllegalStateException
    //   3791	3800	3800	finally
    //   3791	3800	3791	finally
    //   3791	3800	3800	finally
    //   3791	3800	3800	finally
    //   3791	3800	3800	finally
    //   3868	3874	3874	finally
    //   3868	3874	3	java/lang/EnumConstantNotPresentException
    //   3868	3874	3	finally
    //   3868	3874	3874	finally
    //   3868	3874	3	java/lang/ArrayIndexOutOfBoundsException
    //   4063	4070	4070	finally
    //   4063	4070	4063	finally
    //   4063	4070	3	java/util/ConcurrentModificationException
    //   4064	4070	4070	java/lang/UnsupportedOperationException
    //   4064	4070	4070	finally
    //   4139	4146	4146	finally
    //   4140	4146	3	java/lang/StringIndexOutOfBoundsException
    //   4140	4146	3	finally
    //   4140	4146	3	finally
    //   4140	4146	4139	finally
    //   4451	4460	4460	finally
    //   4451	4460	4460	java/lang/NegativeArraySizeException
    //   4452	4460	4451	finally
    //   4452	4460	4451	java/lang/ArrayIndexOutOfBoundsException
    //   4452	4460	4460	java/lang/NullPointerException
    //   4651	4658	4658	finally
    //   4651	4658	4651	finally
    //   4651	4658	3	java/lang/NegativeArraySizeException
    //   4652	4658	4651	java/lang/IllegalStateException
    //   4652	4658	3	java/lang/IllegalArgumentException
    //   4803	4811	4803	finally
    //   4819	4821	3	finally
  }
  
  public void announceDeath(EntityPlayer target) {
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
  
  public String getRandomMessage() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1982
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1974
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1966
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -871795729
    //   33: l2i
    //   34: ldc_w 15073380
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1574471014
    //   44: l2i
    //   45: ldc_w -1147320338
    //   48: ixor
    //   49: ldc2_w 1399467101
    //   52: l2i
    //   53: ldc_w -1297371157
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -833948710 -> 41, 758050877 -> 1927
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -1559151633
    //   94: l2i
    //   95: ldc_w -749837785
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -129103072
    //   105: l2i
    //   106: ldc_w -2101144893
    //   109: ixor
    //   110: ldc2_w 215440818
    //   113: l2i
    //   114: ldc_w -516072040
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1921, -1754850871 -> 144, -1649059358 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual loadMessages : ()V
    //   151: goto -> 155
    //   154: athrow
    //   155: new java/util/Random
    //   158: dup
    //   159: getstatic Perryc.1 : I
    //   162: ifeq -> 176
    //   165: ldc2_w -2025121982
    //   168: l2i
    //   169: ldc_w 728029947
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w 505923341
    //   179: l2i
    //   180: ldc_w 143985478
    //   183: ixor
    //   184: ldc2_w 1875997906
    //   187: l2i
    //   188: ldc_w 287819712
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 1909, -757498197 -> 176, 1749319513 -> 220
    //   220: goto -> 224
    //   223: athrow
    //   224: invokespecial <init> : ()V
    //   227: goto -> 231
    //   230: athrow
    //   231: getstatic Perryc.0 : I
    //   234: ifle -> 248
    //   237: ldc2_w -1202694914
    //   240: l2i
    //   241: ldc_w -781426750
    //   244: ixor
    //   245: goto -> 256
    //   248: ldc2_w 289613728
    //   251: l2i
    //   252: ldc_w -1286814845
    //   255: ixor
    //   256: ldc2_w 144917535
    //   259: l2i
    //   260: ldc_w -4477000
    //   263: ixor
    //   264: ixor
    //   265: lookupswitch default -> 292, -1987790764 -> 248, -1641750373 -> 1919
    //   292: astore_1
    //   293: getstatic Perryc.1 : I
    //   296: ifeq -> 310
    //   299: ldc2_w -2031543870
    //   302: l2i
    //   303: ldc_w 586891733
    //   306: ixor
    //   307: goto -> 318
    //   310: ldc2_w 630959029
    //   313: l2i
    //   314: ldc_w -1690751172
    //   317: ixor
    //   318: ldc2_w -331736773
    //   321: l2i
    //   322: ldc_w 61727319
    //   325: ixor
    //   326: ixor
    //   327: lookupswitch default -> 1945, 1267049339 -> 310, 1362460645 -> 352
    //   352: aload_0
    //   353: getstatic Perryc.c : I
    //   356: iflt -> 370
    //   359: ldc2_w -517043132
    //   362: l2i
    //   363: ldc_w -628783756
    //   366: ixor
    //   367: goto -> 378
    //   370: ldc2_w 303397806
    //   373: l2i
    //   374: ldc_w -847408991
    //   377: ixor
    //   378: ldc2_w 892034860
    //   381: l2i
    //   382: ldc_w -377183556
    //   385: ixor
    //   386: ixor
    //   387: lookupswitch default -> 1915, -419105632 -> 370, 63379103 -> 412
    //   412: getfield messages : Ljava/util/List;
    //   415: getstatic Perryc.c : I
    //   418: iflt -> 432
    //   421: ldc2_w 104069398
    //   424: l2i
    //   425: ldc_w 1135218024
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w -1012859632
    //   435: l2i
    //   436: ldc_w 482206483
    //   439: ixor
    //   440: ldc2_w 2015591960
    //   443: l2i
    //   444: ldc_w -1498785772
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 476, -1693396366 -> 1917, -533019932 -> 432
    //   476: goto -> 480
    //   479: athrow
    //   480: invokeinterface size : ()I
    //   485: goto -> 489
    //   488: athrow
    //   489: ifne -> 503
    //   492: ldc2_w 1907450593
    //   495: l2i
    //   496: ldc_w -1279055613
    //   499: ixor
    //   500: goto -> 511
    //   503: ldc2_w 900441511
    //   506: l2i
    //   507: ldc_w -136712636
    //   510: ixor
    //   511: ldc2_w 120175541
    //   514: l2i
    //   515: ldc_w -1106607135
    //   518: ixor
    //   519: ixor
    //   520: tableswitch default -> 492, 2068935606 -> 544, 2068935607 -> 620
    //   544: ldc_w '䕠㌃䕚⇊ᙆꮅ๫㣏鉟䪲﷨੧裢洈칔?辖鴿묕ଷ쫕侰꾯媂䦎ᄄᣚ㔬얲ⁿ搵⎎⩒⯁⣣奥汀ᆻ喷鄹煪ꗪ₯풢Ꮓ꾐ዜ᎗痳ڬ㿹ꘑ傭㧪㑍ꚋ₧牮蚰鲃઎㨬뛺퍿ﳰᮟⷞ䥟㜺䭊攗态玜ᓧꗵ'
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w -1621157320
    //   556: l2i
    //   557: ldc_w -1687404679
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 724325730
    //   567: l2i
    //   568: ldc_w -396945036
    //   571: ixor
    //   572: ldc2_w -1739354149
    //   575: l2i
    //   576: ldc_w 1853343433
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 1947, -233345965 -> 564, 895419652 -> 608
    //   608: goto -> 612
    //   611: athrow
    //   612: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   615: goto -> 619
    //   618: athrow
    //   619: areturn
    //   620: getstatic Perryc.1 : I
    //   623: ifeq -> 637
    //   626: ldc2_w -1742493610
    //   629: l2i
    //   630: ldc_w 1527127244
    //   633: ixor
    //   634: goto -> 645
    //   637: ldc2_w -712903258
    //   640: l2i
    //   641: ldc_w 213717309
    //   644: ixor
    //   645: ldc2_w -1400039180
    //   648: l2i
    //   649: ldc_w 83601668
    //   652: ixor
    //   653: ixor
    //   654: lookupswitch default -> 1905, 1800602986 -> 637, 1900696939 -> 680
    //   680: aload_0
    //   681: getstatic Perryc.c : I
    //   684: iflt -> 698
    //   687: ldc2_w -680565923
    //   690: l2i
    //   691: ldc_w 1039278571
    //   694: ixor
    //   695: goto -> 706
    //   698: ldc2_w -1968470887
    //   701: l2i
    //   702: ldc_w -1992295701
    //   705: ixor
    //   706: ldc2_w 2077132865
    //   709: l2i
    //   710: ldc_w -41905281
    //   713: ixor
    //   714: ixor
    //   715: lookupswitch default -> 740, 1227657060 -> 698, 1825790344 -> 1931
    //   740: getfield messages : Ljava/util/List;
    //   743: getstatic Perryc.c : I
    //   746: iflt -> 760
    //   749: ldc2_w 250510440
    //   752: l2i
    //   753: ldc_w 1079311350
    //   756: ixor
    //   757: goto -> 768
    //   760: ldc2_w -727598946
    //   763: l2i
    //   764: ldc_w 1279485741
    //   767: ixor
    //   768: ldc2_w 1257721291
    //   771: l2i
    //   772: ldc_w 89616767
    //   775: ixor
    //   776: ixor
    //   777: lookupswitch default -> 1939, -683482361 -> 804, 18529066 -> 760
    //   804: goto -> 808
    //   807: athrow
    //   808: invokeinterface size : ()I
    //   813: goto -> 817
    //   816: athrow
    //   817: ldc2_w -449272288
    //   820: l2i
    //   821: ldc_w -449272287
    //   824: ixor
    //   825: if_icmpne -> 839
    //   828: ldc2_w 1880324639
    //   831: l2i
    //   832: ldc_w 949774368
    //   835: ixor
    //   836: goto -> 847
    //   839: ldc2_w 583971728
    //   842: l2i
    //   843: ldc_w 1782686126
    //   846: ixor
    //   847: ldc2_w 853666567
    //   850: l2i
    //   851: ldc_w -1785908708
    //   854: ixor
    //   855: ixor
    //   856: tableswitch default -> 828, -270283996 -> 880, -270283995 -> 1089
    //   880: getstatic Perryc.1 : I
    //   883: ifeq -> 897
    //   886: ldc2_w 1548726540
    //   889: l2i
    //   890: ldc_w 955090903
    //   893: ixor
    //   894: goto -> 905
    //   897: ldc2_w -453489160
    //   900: l2i
    //   901: ldc_w 357778591
    //   904: ixor
    //   905: ldc2_w 1116523657
    //   908: l2i
    //   909: ldc_w 850956438
    //   912: ixor
    //   913: ixor
    //   914: lookupswitch default -> 940, -201101902 -> 897, 345402052 -> 1933
    //   940: aload_0
    //   941: getstatic Perryc.c : I
    //   944: iflt -> 958
    //   947: ldc2_w 777931589
    //   950: l2i
    //   951: ldc_w -1100697487
    //   954: ixor
    //   955: goto -> 966
    //   958: ldc2_w -217273371
    //   961: l2i
    //   962: ldc_w 2047636132
    //   965: ixor
    //   966: ldc2_w 1913519914
    //   969: l2i
    //   970: ldc_w 1533506008
    //   973: ixor
    //   974: ixor
    //   975: lookupswitch default -> 1937, -1603643469 -> 1000, -1185909306 -> 958
    //   1000: getfield messages : Ljava/util/List;
    //   1003: ldc2_w 2134835210
    //   1006: l2i
    //   1007: ldc_w 2134835210
    //   1010: ixor
    //   1011: getstatic Perryc.c : I
    //   1014: iflt -> 1028
    //   1017: ldc2_w 80584905
    //   1020: l2i
    //   1021: ldc_w 263775641
    //   1024: ixor
    //   1025: goto -> 1036
    //   1028: ldc2_w -273710722
    //   1031: l2i
    //   1032: ldc_w 2046124674
    //   1035: ixor
    //   1036: ldc2_w 1575796700
    //   1039: l2i
    //   1040: ldc_w -1429308644
    //   1043: ixor
    //   1044: ixor
    //   1045: lookupswitch default -> 1072, -61374064 -> 1941, 624496423 -> 1028
    //   1072: goto -> 1076
    //   1075: athrow
    //   1076: invokeinterface get : (I)Ljava/lang/Object;
    //   1081: goto -> 1085
    //   1084: athrow
    //   1085: checkcast java/lang/String
    //   1088: areturn
    //   1089: getstatic Perryc.0 : I
    //   1092: ifle -> 1106
    //   1095: ldc2_w 1570166499
    //   1098: l2i
    //   1099: ldc_w -1577582811
    //   1102: ixor
    //   1103: goto -> 1114
    //   1106: ldc2_w -1204988327
    //   1109: l2i
    //   1110: ldc_w -277385162
    //   1113: ixor
    //   1114: ldc2_w 868189577
    //   1117: l2i
    //   1118: ldc_w -251347342
    //   1121: ixor
    //   1122: ixor
    //   1123: lookupswitch default -> 1148, -78782 -> 1106, 1054478909 -> 1923
    //   1148: aload_0
    //   1149: getstatic Perryc.0 : I
    //   1152: ifle -> 1166
    //   1155: ldc2_w -547845634
    //   1158: l2i
    //   1159: ldc_w -639135224
    //   1162: ixor
    //   1163: goto -> 1174
    //   1166: ldc2_w -2089687548
    //   1169: l2i
    //   1170: ldc_w -408770966
    //   1173: ixor
    //   1174: ldc2_w -882991530
    //   1177: l2i
    //   1178: ldc_w 600426854
    //   1181: ixor
    //   1182: ixor
    //   1183: lookupswitch default -> 1907, -1941694626 -> 1208, -299348794 -> 1166
    //   1208: getfield messages : Ljava/util/List;
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w 1067891303
    //   1220: l2i
    //   1221: ldc_w -1777351302
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 40037989
    //   1231: l2i
    //   1232: ldc_w 692671829
    //   1235: ixor
    //   1236: ldc2_w -287719766
    //   1239: l2i
    //   1240: ldc_w -1323629823
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, -160709962 -> 1929, 1065792724 -> 1228
    //   1272: aload_1
    //   1273: getstatic Perryc.0 : I
    //   1276: ifle -> 1290
    //   1279: ldc2_w -127813777
    //   1282: l2i
    //   1283: ldc_w -720520588
    //   1286: ixor
    //   1287: goto -> 1298
    //   1290: ldc2_w 1694239748
    //   1293: l2i
    //   1294: ldc_w -254536025
    //   1297: ixor
    //   1298: ldc2_w 807820959
    //   1301: l2i
    //   1302: ldc_w 1508162741
    //   1305: ixor
    //   1306: ixor
    //   1307: lookupswitch default -> 1949, -34932599 -> 1332, 1152315185 -> 1290
    //   1332: aload_0
    //   1333: getstatic Perryc.0 : I
    //   1336: ifle -> 1350
    //   1339: ldc2_w 1193497535
    //   1342: l2i
    //   1343: ldc_w 1072623132
    //   1346: ixor
    //   1347: goto -> 1358
    //   1350: ldc2_w -392799144
    //   1353: l2i
    //   1354: ldc_w -1843516604
    //   1357: ixor
    //   1358: ldc2_w -591732602
    //   1361: l2i
    //   1362: ldc_w -1710533254
    //   1365: ixor
    //   1366: ixor
    //   1367: lookupswitch default -> 1392, -930676426 -> 1350, 1048315999 -> 1935
    //   1392: getfield messages : Ljava/util/List;
    //   1395: getstatic Perryc.c : I
    //   1398: iflt -> 1412
    //   1401: ldc2_w 358665263
    //   1404: l2i
    //   1405: ldc_w 90003057
    //   1408: ixor
    //   1409: goto -> 1420
    //   1412: ldc2_w -1087396526
    //   1415: l2i
    //   1416: ldc_w -1872719565
    //   1419: ixor
    //   1420: ldc2_w 1594476753
    //   1423: l2i
    //   1424: ldc_w -1899295851
    //   1427: ixor
    //   1428: ixor
    //   1429: lookupswitch default -> 1456, -1040230118 -> 1953, 1988355235 -> 1412
    //   1456: goto -> 1460
    //   1459: athrow
    //   1460: invokeinterface size : ()I
    //   1465: goto -> 1469
    //   1468: athrow
    //   1469: getstatic Perryc.c : I
    //   1472: iflt -> 1486
    //   1475: ldc2_w -1519489269
    //   1478: l2i
    //   1479: ldc_w 27837027
    //   1482: ixor
    //   1483: goto -> 1494
    //   1486: ldc2_w 338118887
    //   1489: l2i
    //   1490: ldc_w -1460014544
    //   1493: ixor
    //   1494: ldc2_w -1685491559
    //   1497: l2i
    //   1498: ldc_w 768268019
    //   1501: ixor
    //   1502: ixor
    //   1503: lookupswitch default -> 1528, -1340258543 -> 1486, 310708994 -> 1911
    //   1528: goto -> 1532
    //   1531: athrow
    //   1532: invokevirtual nextInt : (I)I
    //   1535: goto -> 1539
    //   1538: athrow
    //   1539: ldc2_w -792699036
    //   1542: l2i
    //   1543: ldc_w -792699036
    //   1546: ixor
    //   1547: getstatic Perryc.c : I
    //   1550: iflt -> 1564
    //   1553: ldc2_w -325771344
    //   1556: l2i
    //   1557: ldc_w -1434641696
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w -844275780
    //   1567: l2i
    //   1568: ldc_w -162359525
    //   1571: ixor
    //   1572: ldc2_w -1089025193
    //   1575: l2i
    //   1576: ldc_w 353649849
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, -1414262628 -> 1564, -320173378 -> 1943
    //   1608: aload_0
    //   1609: getstatic Perryc.0 : I
    //   1612: ifle -> 1626
    //   1615: ldc2_w -1519633355
    //   1618: l2i
    //   1619: ldc_w -1131331757
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w 799173666
    //   1629: l2i
    //   1630: ldc_w 581337880
    //   1633: ixor
    //   1634: ldc2_w -1592950749
    //   1637: l2i
    //   1638: ldc_w -118272922
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, 135163644 -> 1626, 1073991459 -> 1925
    //   1668: getfield messages : Ljava/util/List;
    //   1671: getstatic Perryc.0 : I
    //   1674: ifle -> 1688
    //   1677: ldc2_w -1355272459
    //   1680: l2i
    //   1681: ldc_w 593161239
    //   1684: ixor
    //   1685: goto -> 1696
    //   1688: ldc2_w 1429793133
    //   1691: l2i
    //   1692: ldc_w 551275139
    //   1695: ixor
    //   1696: ldc2_w 1398006682
    //   1699: l2i
    //   1700: ldc_w 960992515
    //   1703: ixor
    //   1704: ixor
    //   1705: lookupswitch default -> 1913, -428428165 -> 1688, 536302967 -> 1732
    //   1732: goto -> 1736
    //   1735: athrow
    //   1736: invokeinterface size : ()I
    //   1741: goto -> 1745
    //   1744: athrow
    //   1745: ldc2_w 558844640
    //   1748: l2i
    //   1749: ldc_w 558844641
    //   1752: ixor
    //   1753: isub
    //   1754: getstatic Perryc.c : I
    //   1757: iflt -> 1771
    //   1760: ldc2_w 1325450721
    //   1763: l2i
    //   1764: ldc_w -338431534
    //   1767: ixor
    //   1768: goto -> 1779
    //   1771: ldc2_w -293337184
    //   1774: l2i
    //   1775: ldc_w -1869709699
    //   1778: ixor
    //   1779: ldc2_w 1152861769
    //   1782: l2i
    //   1783: ldc_w -676532951
    //   1786: ixor
    //   1787: ixor
    //   1788: lookupswitch default -> 1955, -317599043 -> 1816, 935894867 -> 1771
    //   1816: goto -> 1820
    //   1819: athrow
    //   1820: invokestatic clamp : (III)I
    //   1823: goto -> 1827
    //   1826: athrow
    //   1827: getstatic Perryc.0 : I
    //   1830: ifle -> 1844
    //   1833: ldc2_w -48446177
    //   1836: l2i
    //   1837: ldc_w -161857933
    //   1840: ixor
    //   1841: goto -> 1852
    //   1844: ldc2_w -1701956267
    //   1847: l2i
    //   1848: ldc_w -394654427
    //   1851: ixor
    //   1852: ldc2_w 1647490780
    //   1855: l2i
    //   1856: ldc_w 1939436483
    //   1859: ixor
    //   1860: ixor
    //   1861: lookupswitch default -> 1888, 451755635 -> 1951, 1938605537 -> 1844
    //   1888: goto -> 1892
    //   1891: athrow
    //   1892: invokeinterface get : (I)Ljava/lang/Object;
    //   1897: goto -> 1901
    //   1900: athrow
    //   1901: checkcast java/lang/String
    //   1904: areturn
    //   1905: aconst_null
    //   1906: athrow
    //   1907: aconst_null
    //   1908: athrow
    //   1909: aconst_null
    //   1910: athrow
    //   1911: aconst_null
    //   1912: athrow
    //   1913: aconst_null
    //   1914: athrow
    //   1915: aconst_null
    //   1916: athrow
    //   1917: aconst_null
    //   1918: athrow
    //   1919: aconst_null
    //   1920: athrow
    //   1921: aconst_null
    //   1922: athrow
    //   1923: aconst_null
    //   1924: athrow
    //   1925: aconst_null
    //   1926: athrow
    //   1927: aconst_null
    //   1928: athrow
    //   1929: aconst_null
    //   1930: athrow
    //   1931: aconst_null
    //   1932: athrow
    //   1933: aconst_null
    //   1934: athrow
    //   1935: aconst_null
    //   1936: athrow
    //   1937: aconst_null
    //   1938: athrow
    //   1939: aconst_null
    //   1940: athrow
    //   1941: aconst_null
    //   1942: athrow
    //   1943: aconst_null
    //   1944: athrow
    //   1945: aconst_null
    //   1946: athrow
    //   1947: aconst_null
    //   1948: athrow
    //   1949: aconst_null
    //   1950: athrow
    //   1951: aconst_null
    //   1952: athrow
    //   1953: aconst_null
    //   1954: athrow
    //   1955: aconst_null
    //   1956: athrow
    //   1957: pop
    //   1958: goto -> 24
    //   1961: pop
    //   1962: aconst_null
    //   1963: goto -> 1957
    //   1966: dup
    //   1967: ifnull -> 1957
    //   1970: checkcast java/lang/Throwable
    //   1973: athrow
    //   1974: dup
    //   1975: ifnull -> 1961
    //   1978: checkcast java/lang/Throwable
    //   1981: athrow
    //   1982: aconst_null
    //   1983: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1881	0	this	Lbigname/zprestige/webhack/features/modules/Chat/AutoGG;
    //   293	1612	1	rand	Ljava/util/Random;
    // Exception table:
    //   from	to	target	type
    //   8	20	1966	java/lang/RuntimeException
    //   147	154	154	finally
    //   147	154	3	finally
    //   147	154	154	finally
    //   148	154	147	java/util/NoSuchElementException
    //   148	154	3	java/util/NoSuchElementException
    //   223	230	230	finally
    //   223	230	3	finally
    //   224	230	223	java/lang/UnsupportedOperationException
    //   224	230	230	java/lang/IndexOutOfBoundsException
    //   224	230	223	java/lang/IllegalStateException
    //   480	488	488	finally
    //   480	488	3	java/util/NoSuchElementException
    //   480	488	488	finally
    //   480	488	3	java/lang/EnumConstantNotPresentException
    //   480	488	3	java/lang/ClassCastException
    //   612	618	618	finally
    //   612	618	618	finally
    //   612	618	618	finally
    //   612	618	618	finally
    //   612	618	618	finally
    //   807	816	816	finally
    //   807	816	3	java/lang/NegativeArraySizeException
    //   807	816	816	finally
    //   808	816	807	java/lang/NegativeArraySizeException
    //   808	816	816	java/util/NoSuchElementException
    //   1075	1084	1084	finally
    //   1075	1084	3	finally
    //   1075	1084	3	java/lang/RuntimeException
    //   1076	1084	1075	finally
    //   1076	1084	1084	finally
    //   1459	1468	1468	finally
    //   1459	1468	1468	java/lang/RuntimeException
    //   1460	1468	1468	finally
    //   1460	1468	3	finally
    //   1460	1468	1459	java/lang/UnsupportedOperationException
    //   1531	1538	1538	finally
    //   1531	1538	1538	java/lang/UnsupportedOperationException
    //   1531	1538	1538	java/lang/ArithmeticException
    //   1532	1538	1531	java/lang/ArithmeticException
    //   1532	1538	1538	java/lang/ArithmeticException
    //   1735	1744	1744	finally
    //   1735	1744	3	finally
    //   1735	1744	3	finally
    //   1736	1744	1735	finally
    //   1736	1744	3	java/lang/ClassCastException
    //   1819	1826	1826	finally
    //   1819	1826	1819	java/lang/UnsupportedOperationException
    //   1820	1826	1826	finally
    //   1820	1826	1819	java/lang/IllegalStateException
    //   1820	1826	1819	java/lang/RuntimeException
    //   1891	1900	1900	finally
    //   1891	1900	1900	finally
    //   1892	1900	1891	finally
    //   1892	1900	1900	finally
    //   1892	1900	1891	java/lang/AssertionError
    //   1966	1974	1966	finally
    //   1982	1984	3	finally
  }
  
  @SubscribeEvent
  public void onSendAttackPacket(PacketEvent.Send paramSend) {
    Perry1.67(this, (int)107479191L ^ 0x66203DDA, paramSend);
  }
  
  @SubscribeEvent
  public void onEntityDeath(DeathEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2237
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2229
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2221
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1131022748
    //   33: l2i
    //   34: ldc_w -719342381
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -2059534252
    //   44: l2i
    //   45: ldc_w 866797461
    //   48: ixor
    //   49: ldc2_w -2110225711
    //   52: l2i
    //   53: ldc_w 445166443
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -247827699 -> 2186, 1579783916 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -640125669
    //   94: l2i
    //   95: ldc_w 295307945
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1297798868
    //   105: l2i
    //   106: ldc_w -1435911781
    //   109: ixor
    //   110: ldc2_w 1194891081
    //   113: l2i
    //   114: ldc_w -2002001204
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2206, 131140151 -> 102, 681581258 -> 144
    //   144: getfield targets : Ljava/util/Map;
    //   147: getstatic Perryc.1 : I
    //   150: ifeq -> 164
    //   153: ldc2_w 1056005666
    //   156: l2i
    //   157: ldc_w 352923144
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -244059035
    //   167: l2i
    //   168: ldc_w 1087894698
    //   171: ixor
    //   172: ldc2_w -493833274
    //   175: l2i
    //   176: ldc_w -201941641
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, 983457435 -> 2172, 1055897631 -> 164
    //   208: aload_1
    //   209: getstatic Perryc.1 : I
    //   212: ifeq -> 226
    //   215: ldc2_w 603354073
    //   218: l2i
    //   219: ldc_w -1409510311
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -755670720
    //   229: l2i
    //   230: ldc_w 2038750795
    //   233: ixor
    //   234: ldc2_w 116863329
    //   237: l2i
    //   238: ldc_w -1916806809
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 2156, 54660998 -> 226, 540628749 -> 268
    //   268: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
    //   271: getstatic Perryc.c : I
    //   274: iflt -> 288
    //   277: ldc2_w -2105007566
    //   280: l2i
    //   281: ldc_w 1180370338
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w 1426785910
    //   291: l2i
    //   292: ldc_w -2113814642
    //   295: ixor
    //   296: ldc2_w 991119061
    //   299: l2i
    //   300: ldc_w 915721733
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -1073492632 -> 288, -917196992 -> 2196
    //   332: goto -> 336
    //   335: athrow
    //   336: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   341: goto -> 345
    //   344: athrow
    //   345: ifeq -> 359
    //   348: ldc2_w -1786532047
    //   351: l2i
    //   352: ldc_w 1012474656
    //   355: ixor
    //   356: goto -> 367
    //   359: ldc2_w 1261989866
    //   362: l2i
    //   363: ldc_w -488446982
    //   366: ixor
    //   367: ldc2_w -76970657
    //   370: l2i
    //   371: ldc_w -1383459016
    //   374: ixor
    //   375: ixor
    //   376: tableswitch default -> 348, -13033866 -> 400, -13033865 -> 1286
    //   400: getstatic Perryc.c : I
    //   403: iflt -> 417
    //   406: ldc2_w 1461862071
    //   409: l2i
    //   410: ldc_w -920576328
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w 887993732
    //   420: l2i
    //   421: ldc_w 1554682915
    //   424: ixor
    //   425: ldc2_w -441874941
    //   428: l2i
    //   429: ldc_w -1964635572
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 2180, -246633408 -> 417, 118009320 -> 460
    //   460: aload_0
    //   461: getstatic Perryc.c : I
    //   464: iflt -> 478
    //   467: ldc2_w -1043682837
    //   470: l2i
    //   471: ldc_w 1917558239
    //   474: ixor
    //   475: goto -> 486
    //   478: ldc2_w 46874163
    //   481: l2i
    //   482: ldc_w 1577652619
    //   485: ixor
    //   486: ldc2_w 1083968592
    //   489: l2i
    //   490: ldc_w -268549000
    //   493: ixor
    //   494: ixor
    //   495: lookupswitch default -> 2198, -207591536 -> 520, 484670492 -> 478
    //   520: getfield cooldown : Z
    //   523: ifne -> 537
    //   526: ldc2_w -1692630267
    //   529: l2i
    //   530: ldc_w 1312770971
    //   533: ixor
    //   534: goto -> 545
    //   537: ldc2_w 138215658
    //   540: l2i
    //   541: ldc_w -585185163
    //   544: ixor
    //   545: ldc2_w 731643715
    //   548: l2i
    //   549: ldc_w -600223823
    //   552: ixor
    //   553: ixor
    //   554: tableswitch default -> 526, 578910316 -> 576, 578910317 -> 1286
    //   576: getstatic Perryc.0 : I
    //   579: ifle -> 593
    //   582: ldc2_w 212882331
    //   585: l2i
    //   586: ldc_w 156868409
    //   589: ixor
    //   590: goto -> 601
    //   593: ldc2_w 206196942
    //   596: l2i
    //   597: ldc_w -380971101
    //   600: ixor
    //   601: ldc2_w -789065322
    //   604: l2i
    //   605: ldc_w -642080897
    //   608: ixor
    //   609: ixor
    //   610: lookupswitch default -> 636, 212107851 -> 2158, 1751104076 -> 593
    //   636: aload_0
    //   637: getstatic Perryc.0 : I
    //   640: ifle -> 654
    //   643: ldc2_w -1539550103
    //   646: l2i
    //   647: ldc_w -1163874949
    //   650: ixor
    //   651: goto -> 662
    //   654: ldc2_w -661969147
    //   657: l2i
    //   658: ldc_w -1987991175
    //   661: ixor
    //   662: ldc2_w -1178192002
    //   665: l2i
    //   666: ldc_w -1658239416
    //   669: ixor
    //   670: ixor
    //   671: lookupswitch default -> 696, 974621597 -> 654, 980650020 -> 2190
    //   696: aload_1
    //   697: getstatic Perryc.1 : I
    //   700: ifeq -> 714
    //   703: ldc2_w 1416344168
    //   706: l2i
    //   707: ldc_w -193752447
    //   710: ixor
    //   711: goto -> 722
    //   714: ldc2_w 1026355442
    //   717: l2i
    //   718: ldc_w 2105077960
    //   721: ixor
    //   722: ldc2_w 1643249316
    //   725: l2i
    //   726: ldc_w 941531849
    //   729: ixor
    //   730: ixor
    //   731: lookupswitch default -> 2164, -101221244 -> 714, 431709271 -> 756
    //   756: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
    //   759: getstatic Perryc.c : I
    //   762: iflt -> 776
    //   765: ldc2_w 782317594
    //   768: l2i
    //   769: ldc_w -1802619522
    //   772: ixor
    //   773: goto -> 784
    //   776: ldc2_w 1718629620
    //   779: l2i
    //   780: ldc_w -882694020
    //   783: ixor
    //   784: ldc2_w 2055346489
    //   787: l2i
    //   788: ldc_w -203529416
    //   791: ixor
    //   792: ixor
    //   793: lookupswitch default -> 820, 863205221 -> 2202, 1477713190 -> 776
    //   820: goto -> 824
    //   823: athrow
    //   824: invokevirtual announceDeath : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   827: goto -> 831
    //   830: athrow
    //   831: getstatic Perryc.0 : I
    //   834: ifle -> 848
    //   837: ldc2_w 1620417812
    //   840: l2i
    //   841: ldc_w -793960300
    //   844: ixor
    //   845: goto -> 856
    //   848: ldc2_w -996926175
    //   851: l2i
    //   852: ldc_w -433357139
    //   855: ixor
    //   856: ldc2_w 1345215974
    //   859: l2i
    //   860: ldc_w -1560983280
    //   863: ixor
    //   864: ixor
    //   865: lookupswitch default -> 892, 1122216310 -> 2182, 2014699657 -> 848
    //   892: aload_0
    //   893: ldc2_w -24921906
    //   896: l2i
    //   897: ldc_w -24921905
    //   900: ixor
    //   901: getstatic Perryc.0 : I
    //   904: ifle -> 918
    //   907: ldc2_w 2104232489
    //   910: l2i
    //   911: ldc_w 1345812265
    //   914: ixor
    //   915: goto -> 926
    //   918: ldc2_w -2119353914
    //   921: l2i
    //   922: ldc_w -1990258512
    //   925: ixor
    //   926: ldc2_w 1000058764
    //   929: l2i
    //   930: ldc_w -1331327269
    //   933: ixor
    //   934: ixor
    //   935: lookupswitch default -> 960, -1503306665 -> 2168, -1008128801 -> 918
    //   960: putfield cooldown : Z
    //   963: getstatic Perryc.c : I
    //   966: iflt -> 980
    //   969: ldc2_w -282412229
    //   972: l2i
    //   973: ldc_w -1996024470
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w 93190859
    //   983: l2i
    //   984: ldc_w -560386048
    //   987: ixor
    //   988: ldc2_w -1490101394
    //   991: l2i
    //   992: ldc_w -505701880
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, 551087927 -> 2188, 1649638185 -> 980
    //   1024: aload_0
    //   1025: getstatic Perryc.c : I
    //   1028: iflt -> 1042
    //   1031: ldc2_w 284741914
    //   1034: l2i
    //   1035: ldc_w 884162704
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w -1925134266
    //   1045: l2i
    //   1046: ldc_w 2079983130
    //   1049: ixor
    //   1050: ldc2_w -453025260
    //   1053: l2i
    //   1054: ldc_w -448745591
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 1084, 636771351 -> 2170, 1130850337 -> 1042
    //   1084: getfield targets : Ljava/util/Map;
    //   1087: getstatic Perryc.c : I
    //   1090: iflt -> 1104
    //   1093: ldc2_w -574589100
    //   1096: l2i
    //   1097: ldc_w 992151088
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w -967067232
    //   1107: l2i
    //   1108: ldc_w -356217808
    //   1111: ixor
    //   1112: ldc2_w 238460264
    //   1115: l2i
    //   1116: ldc_w 1635847366
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 1148, -1990926134 -> 2194, 1019587283 -> 1104
    //   1148: aload_1
    //   1149: getstatic Perryc.0 : I
    //   1152: ifle -> 1166
    //   1155: ldc2_w 1570685470
    //   1158: l2i
    //   1159: ldc_w 1189982250
    //   1162: ixor
    //   1163: goto -> 1174
    //   1166: ldc2_w 767918948
    //   1169: l2i
    //   1170: ldc_w 904289581
    //   1173: ixor
    //   1174: ldc2_w -1532201018
    //   1177: l2i
    //   1178: ldc_w -666015845
    //   1181: ixor
    //   1182: ixor
    //   1183: lookupswitch default -> 2160, 1690488340 -> 1208, 1737646697 -> 1166
    //   1208: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w -1454524398
    //   1220: l2i
    //   1221: ldc_w 544209339
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 1768256469
    //   1231: l2i
    //   1232: ldc_w -1258375846
    //   1235: ixor
    //   1236: ldc2_w -392290685
    //   1239: l2i
    //   1240: ldc_w 1907595340
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, 269469542 -> 2184, 2081130538 -> 1228
    //   1272: goto -> 1276
    //   1275: athrow
    //   1276: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1281: goto -> 1285
    //   1284: athrow
    //   1285: pop
    //   1286: getstatic Perryc.c : I
    //   1289: iflt -> 1303
    //   1292: ldc2_w -897103276
    //   1295: l2i
    //   1296: ldc_w 312493787
    //   1299: ixor
    //   1300: goto -> 1311
    //   1303: ldc2_w -1377932741
    //   1306: l2i
    //   1307: ldc_w -38449324
    //   1310: ixor
    //   1311: ldc2_w 1623791351
    //   1314: l2i
    //   1315: ldc_w -1439084216
    //   1318: ixor
    //   1319: ixor
    //   1320: lookupswitch default -> 2178, -1701092656 -> 1348, 316099376 -> 1303
    //   1348: aload_1
    //   1349: getstatic Perryc.c : I
    //   1352: iflt -> 1366
    //   1355: ldc2_w 1219056483
    //   1358: l2i
    //   1359: ldc_w -1282787573
    //   1362: ixor
    //   1363: goto -> 1374
    //   1366: ldc2_w -1927470055
    //   1369: l2i
    //   1370: ldc_w 628366304
    //   1373: ixor
    //   1374: ldc2_w 1820279760
    //   1377: l2i
    //   1378: ldc_w 100322162
    //   1381: ixor
    //   1382: ixor
    //   1383: lookupswitch default -> 2166, -1834554166 -> 1366, -1041451173 -> 1408
    //   1408: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
    //   1411: getstatic Perryc.c : I
    //   1414: iflt -> 1428
    //   1417: ldc2_w -1903743601
    //   1420: l2i
    //   1421: ldc_w -2098919944
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w 1376813577
    //   1431: l2i
    //   1432: ldc_w 22642658
    //   1435: ixor
    //   1436: ldc2_w 455492195
    //   1439: l2i
    //   1440: ldc_w 22838967
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, 370676899 -> 2154, 413394877 -> 1428
    //   1472: aload_0
    //   1473: getstatic Perryc.0 : I
    //   1476: ifle -> 1490
    //   1479: ldc2_w -1476608496
    //   1482: l2i
    //   1483: ldc_w 1930533432
    //   1486: ixor
    //   1487: goto -> 1498
    //   1490: ldc2_w 355652328
    //   1493: l2i
    //   1494: ldc_w 193016159
    //   1497: ixor
    //   1498: ldc2_w 2026450828
    //   1501: l2i
    //   1502: ldc_w 1440393275
    //   1505: ixor
    //   1506: ixor
    //   1507: lookupswitch default -> 1532, -100752481 -> 2192, 1829071460 -> 1490
    //   1532: getfield cauraTarget : Lnet/minecraft/entity/player/EntityPlayer;
    //   1535: if_acmpne -> 1549
    //   1538: ldc2_w 1367216355
    //   1541: l2i
    //   1542: ldc_w -311893815
    //   1545: ixor
    //   1546: goto -> 1557
    //   1549: ldc2_w -2102803696
    //   1552: l2i
    //   1553: ldc_w 1052717881
    //   1556: ixor
    //   1557: ldc2_w -1177149834
    //   1560: l2i
    //   1561: ldc_w -1855530679
    //   1564: ixor
    //   1565: ixor
    //   1566: tableswitch default -> 1538, -1801046251 -> 1588, -1801046250 -> 2151
    //   1588: getstatic Perryc.0 : I
    //   1591: ifle -> 1605
    //   1594: ldc2_w -1999244144
    //   1597: l2i
    //   1598: ldc_w 948749726
    //   1601: ixor
    //   1602: goto -> 1613
    //   1605: ldc2_w 2077296629
    //   1608: l2i
    //   1609: ldc_w 1988363411
    //   1612: ixor
    //   1613: ldc2_w -2077181641
    //   1616: l2i
    //   1617: ldc_w 899664352
    //   1620: ixor
    //   1621: ixor
    //   1622: lookupswitch default -> 1648, -207346180 -> 1605, 32915929 -> 2176
    //   1648: aload_0
    //   1649: getstatic Perryc.c : I
    //   1652: iflt -> 1666
    //   1655: ldc2_w 883782426
    //   1658: l2i
    //   1659: ldc_w 969461661
    //   1662: ixor
    //   1663: goto -> 1674
    //   1666: ldc2_w 1081447989
    //   1669: l2i
    //   1670: ldc_w 935170354
    //   1673: ixor
    //   1674: ldc2_w -1003422236
    //   1677: l2i
    //   1678: ldc_w 1602334271
    //   1681: ixor
    //   1682: ixor
    //   1683: lookupswitch default -> 2208, -1764429988 -> 1666, -327592740 -> 1708
    //   1708: getfield cooldown : Z
    //   1711: ifne -> 1725
    //   1714: ldc2_w 824409344
    //   1717: l2i
    //   1718: ldc_w 1538496438
    //   1721: ixor
    //   1722: goto -> 1733
    //   1725: ldc2_w 137206544
    //   1728: l2i
    //   1729: ldc_w 1656582567
    //   1732: ixor
    //   1733: ldc2_w -2063525352
    //   1736: l2i
    //   1737: ldc_w 244533240
    //   1740: ixor
    //   1741: ixor
    //   1742: tableswitch default -> 1714, -519915690 -> 1764, -519915689 -> 2151
    //   1764: getstatic Perryc.0 : I
    //   1767: ifle -> 1781
    //   1770: ldc2_w -1174387294
    //   1773: l2i
    //   1774: ldc_w -854212136
    //   1777: ixor
    //   1778: goto -> 1789
    //   1781: ldc2_w 1597602332
    //   1784: l2i
    //   1785: ldc_w -1813784762
    //   1788: ixor
    //   1789: ldc2_w 1898472932
    //   1792: l2i
    //   1793: ldc_w 1480402518
    //   1796: ixor
    //   1797: ixor
    //   1798: lookupswitch default -> 1824, 542732032 -> 1781, 1577109448 -> 2204
    //   1824: aload_0
    //   1825: getstatic Perryc.1 : I
    //   1828: ifeq -> 1842
    //   1831: ldc2_w -1324384886
    //   1834: l2i
    //   1835: ldc_w 68647082
    //   1838: ixor
    //   1839: goto -> 1850
    //   1842: ldc2_w -761893975
    //   1845: l2i
    //   1846: ldc_w 386039385
    //   1849: ixor
    //   1850: ldc2_w -929975463
    //   1853: l2i
    //   1854: ldc_w -463795962
    //   1857: ixor
    //   1858: ixor
    //   1859: lookupswitch default -> 1884, -1714241665 -> 2152, 439188405 -> 1842
    //   1884: aload_1
    //   1885: getstatic Perryc.1 : I
    //   1888: ifeq -> 1902
    //   1891: ldc2_w 1459111292
    //   1894: l2i
    //   1895: ldc_w -786242174
    //   1898: ixor
    //   1899: goto -> 1910
    //   1902: ldc2_w -1240921262
    //   1905: l2i
    //   1906: ldc_w -1211027561
    //   1909: ixor
    //   1910: ldc2_w 866551392
    //   1913: l2i
    //   1914: ldc_w -398563620
    //   1917: ixor
    //   1918: ixor
    //   1919: lookupswitch default -> 2200, -633289607 -> 1944, 1547845698 -> 1902
    //   1944: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
    //   1947: getstatic Perryc.c : I
    //   1950: iflt -> 1964
    //   1953: ldc2_w -1348849253
    //   1956: l2i
    //   1957: ldc_w 467125994
    //   1960: ixor
    //   1961: goto -> 1972
    //   1964: ldc2_w 2137307893
    //   1967: l2i
    //   1968: ldc_w -712503159
    //   1971: ixor
    //   1972: ldc2_w -1072622537
    //   1975: l2i
    //   1976: ldc_w -1173473183
    //   1979: ixor
    //   1980: ixor
    //   1981: lookupswitch default -> 2008, -833430745 -> 2162, 1930114084 -> 1964
    //   2008: goto -> 2012
    //   2011: athrow
    //   2012: invokevirtual announceDeath : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   2015: goto -> 2019
    //   2018: athrow
    //   2019: getstatic Perryc.c : I
    //   2022: iflt -> 2036
    //   2025: ldc2_w 1257470671
    //   2028: l2i
    //   2029: ldc_w -546905038
    //   2032: ixor
    //   2033: goto -> 2044
    //   2036: ldc2_w 410354845
    //   2039: l2i
    //   2040: ldc_w -1373545770
    //   2043: ixor
    //   2044: ldc2_w -2102571080
    //   2047: l2i
    //   2048: ldc_w 1359529768
    //   2051: ixor
    //   2052: ixor
    //   2053: lookupswitch default -> 2174, 1177556589 -> 2036, 1710315227 -> 2080
    //   2080: aload_0
    //   2081: ldc2_w 240382660
    //   2084: l2i
    //   2085: ldc_w 240382661
    //   2088: ixor
    //   2089: getstatic Perryc.c : I
    //   2092: iflt -> 2106
    //   2095: ldc2_w -501909688
    //   2098: l2i
    //   2099: ldc_w 996813872
    //   2102: ixor
    //   2103: goto -> 2114
    //   2106: ldc2_w 2063732490
    //   2109: l2i
    //   2110: ldc_w -509935374
    //   2113: ixor
    //   2114: ldc2_w 538824569
    //   2117: l2i
    //   2118: ldc_w 321847824
    //   2121: ixor
    //   2122: ixor
    //   2123: lookupswitch default -> 2210, -1448361327 -> 2148, -364014063 -> 2106
    //   2148: putfield cooldown : Z
    //   2151: return
    //   2152: aconst_null
    //   2153: athrow
    //   2154: aconst_null
    //   2155: athrow
    //   2156: aconst_null
    //   2157: athrow
    //   2158: aconst_null
    //   2159: athrow
    //   2160: aconst_null
    //   2161: athrow
    //   2162: aconst_null
    //   2163: athrow
    //   2164: aconst_null
    //   2165: athrow
    //   2166: aconst_null
    //   2167: athrow
    //   2168: aconst_null
    //   2169: athrow
    //   2170: aconst_null
    //   2171: athrow
    //   2172: aconst_null
    //   2173: athrow
    //   2174: aconst_null
    //   2175: athrow
    //   2176: aconst_null
    //   2177: athrow
    //   2178: aconst_null
    //   2179: athrow
    //   2180: aconst_null
    //   2181: athrow
    //   2182: aconst_null
    //   2183: athrow
    //   2184: aconst_null
    //   2185: athrow
    //   2186: aconst_null
    //   2187: athrow
    //   2188: aconst_null
    //   2189: athrow
    //   2190: aconst_null
    //   2191: athrow
    //   2192: aconst_null
    //   2193: athrow
    //   2194: aconst_null
    //   2195: athrow
    //   2196: aconst_null
    //   2197: athrow
    //   2198: aconst_null
    //   2199: athrow
    //   2200: aconst_null
    //   2201: athrow
    //   2202: aconst_null
    //   2203: athrow
    //   2204: aconst_null
    //   2205: athrow
    //   2206: aconst_null
    //   2207: athrow
    //   2208: aconst_null
    //   2209: athrow
    //   2210: aconst_null
    //   2211: athrow
    //   2212: pop
    //   2213: goto -> 24
    //   2216: pop
    //   2217: aconst_null
    //   2218: goto -> 2212
    //   2221: dup
    //   2222: ifnull -> 2212
    //   2225: checkcast java/lang/Throwable
    //   2228: athrow
    //   2229: dup
    //   2230: ifnull -> 2216
    //   2233: checkcast java/lang/Throwable
    //   2236: athrow
    //   2237: aconst_null
    //   2238: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2128	0	this	Lbigname/zprestige/webhack/features/modules/Chat/AutoGG;
    //   24	2128	1	event	Lbigname/zprestige/webhack/event/events/DeathEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	2221	java/lang/IllegalStateException
    //   336	344	344	finally
    //   336	344	3	finally
    //   336	344	344	finally
    //   336	344	344	finally
    //   336	344	344	java/lang/ClassCastException
    //   824	830	830	finally
    //   824	830	830	java/lang/ArithmeticException
    //   824	830	3	finally
    //   824	830	830	finally
    //   824	830	830	java/lang/ArrayIndexOutOfBoundsException
    //   1275	1284	1284	finally
    //   1275	1284	3	java/util/ConcurrentModificationException
    //   1276	1284	1275	java/lang/AssertionError
    //   1276	1284	1284	java/lang/NullPointerException
    //   1276	1284	1275	finally
    //   2011	2018	2018	finally
    //   2011	2018	3	java/lang/IllegalStateException
    //   2011	2018	2018	finally
    //   2012	2018	2011	java/lang/RuntimeException
    //   2012	2018	3	finally
    //   2221	2229	2221	finally
    //   2237	2239	3	java/lang/NumberFormatException
  }
  
  @SubscribeEvent
  public void onAttackEntity(AttackEntityEvent paramAttackEntityEvent) {
    Perry1.x(this, (int)-439341428L ^ 0xF1D4BBE6, paramAttackEntityEvent);
  }
  
  public void onEnable() {
    Perry1.3i(this, (int)963285028L ^ 0x78B7BA9D);
  }
  
  public void loadMessages() {
    Perry1.3M(this, (int)-1195624836L ^ 0xE779FE23);
  }
  
  public AutoGG() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 2131027663
    //   9: l2i
    //   10: ldc_w 1163875729
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -45951223
    //   20: l2i
    //   21: ldc_w 205581340
    //   24: ixor
    //   25: ldc2_w 532163374
    //   28: l2i
    //   29: ldc_w -984208570
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -524963018 -> 3026, 1730154868 -> 17
    //   60: aload_0
    //   61: ldc_w '䔝㌆䕂㶸ꮧ'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -873676987
    //   73: l2i
    //   74: ldc_w -536584650
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1922792365
    //   84: l2i
    //   85: ldc_w 1721223459
    //   88: ixor
    //   89: ldc2_w -18262755
    //   92: l2i
    //   93: ldc_w -1300408043
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, 1709478834 -> 81, 1736240507 -> 3080
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '䔝㌆䕂㶸ꮁ๭㢘蹠깄﷫ਫ製無⪔?辌'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -333099533
    //   139: l2i
    //   140: ldc_w 2105948059
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1026402681
    //   150: l2i
    //   151: ldc_w -1962441180
    //   154: ixor
    //   155: ldc2_w -819368879
    //   158: l2i
    //   159: ldc_w -811274357
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1859192398 -> 3020, 1514943686 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -1646624135
    //   204: l2i
    //   205: ldc_w -222206461
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 570169342
    //   215: l2i
    //   216: ldc_w -885556145
    //   219: ixor
    //   220: ldc2_w -1435189679
    //   223: l2i
    //   224: ldc_w -350285346
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 3086, -1415527362 -> 256, 779111413 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CHAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1066141949
    //   262: l2i
    //   263: ldc_w -1066141950
    //   266: ixor
    //   267: ldc2_w -870514823
    //   270: l2i
    //   271: ldc_w -870514823
    //   274: ixor
    //   275: ldc2_w -291918076
    //   278: l2i
    //   279: ldc_w -291918076
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -1901402014
    //   292: l2i
    //   293: ldc_w -384484254
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 324150313
    //   303: l2i
    //   304: ldc_w -1313333059
    //   307: ixor
    //   308: ldc2_w 803247144
    //   311: l2i
    //   312: ldc_w -934141930
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -2146607042 -> 3062, 1821671788 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w -161218180
    //   356: l2i
    //   357: ldc_w 224828252
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -2047143391
    //   367: l2i
    //   368: ldc_w -448975126
    //   371: ixor
    //   372: ldc2_w -475898032
    //   375: l2i
    //   376: ldc_w 1027183760
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 3046, -1101138165 -> 408, 630804960 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w 888345200
    //   418: l2i
    //   419: ldc_w 658957245
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1807954969
    //   429: l2i
    //   430: ldc_w 1166285829
    //   433: ixor
    //   434: ldc2_w 231753426
    //   437: l2i
    //   438: ldc_w 1253157133
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, 1423187474 -> 3084, 2073112435 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '䔎㌖䕅㶲'
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w -1573544888
    //   485: l2i
    //   486: ldc_w 1705701331
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -296551371
    //   496: l2i
    //   497: ldc_w -1351734931
    //   500: ixor
    //   501: ldc2_w 1430195109
    //   504: l2i
    //   505: ldc_w 1403564656
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 3064, -1056388530 -> 493, 1202416781 -> 536
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -414613815
    //   542: l2i
    //   543: ldc_w -414613801
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 45582059
    //   556: l2i
    //   557: ldc_w 1988599067
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1151414674
    //   567: l2i
    //   568: ldc_w -559708675
    //   571: ixor
    //   572: ldc2_w 1104990182
    //   575: l2i
    //   576: ldc_w -1943649970
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 3070, -1177905832 -> 564, 1475885767 -> 608
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w -438694658
    //   614: l2i
    //   615: ldc_w -438694658
    //   618: ixor
    //   619: getstatic Perryc.c : I
    //   622: iflt -> 636
    //   625: ldc2_w -299019509
    //   628: l2i
    //   629: ldc_w 700731005
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 972377997
    //   639: l2i
    //   640: ldc_w 1792206343
    //   643: ixor
    //   644: ldc2_w -136771827
    //   647: l2i
    //   648: ldc_w -1642735920
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 680, -1518106817 -> 636, -1373254485 -> 3034
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w 1673999696
    //   686: l2i
    //   687: ldc_w 1673999626
    //   690: ixor
    //   691: getstatic Perryc.1 : I
    //   694: ifeq -> 708
    //   697: ldc2_w -2128906945
    //   700: l2i
    //   701: ldc_w -1393027445
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 2082535434
    //   711: l2i
    //   712: ldc_w -626833320
    //   715: ixor
    //   716: ldc2_w 102739312
    //   719: l2i
    //   720: ldc_w -2059320874
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 3076, -1363308782 -> 708, 635264244 -> 752
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 772
    //   761: ldc2_w 30547473
    //   764: l2i
    //   765: ldc_w -251110585
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 651837474
    //   775: l2i
    //   776: ldc_w -168820403
    //   779: ixor
    //   780: ldc2_w -1984854413
    //   783: l2i
    //   784: ldc_w 115099362
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 816, 1813567464 -> 772, 2142733767 -> 3036
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w 2083682043
    //   828: l2i
    //   829: ldc_w 973201673
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 1714168944
    //   839: l2i
    //   840: ldc_w -1369829233
    //   843: ixor
    //   844: ldc2_w 1810369611
    //   847: l2i
    //   848: ldc_w 1966219175
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -564176436 -> 836, 1491698718 -> 3010
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.0 : I
    //   886: ifle -> 900
    //   889: ldc2_w 55548909
    //   892: l2i
    //   893: ldc_w -504501995
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 28491520
    //   903: l2i
    //   904: ldc_w 637955412
    //   907: ixor
    //   908: ldc2_w 715922862
    //   911: l2i
    //   912: ldc_w -1154374195
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, -422633848 -> 900, 1933560475 -> 3030
    //   944: putfield targetResetTimer : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.1 : I
    //   950: ifeq -> 964
    //   953: ldc2_w -1510318420
    //   956: l2i
    //   957: ldc_w -166821174
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w -1089122772
    //   967: l2i
    //   968: ldc_w -1704104139
    //   971: ixor
    //   972: ldc2_w 1563459680
    //   975: l2i
    //   976: ldc_w -1117909760
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 3072, -1281732346 -> 964, -988369799 -> 1008
    //   1008: aload_0
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w -266963051
    //   1018: l2i
    //   1019: ldc_w -293513993
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 1653533679
    //   1029: l2i
    //   1030: ldc_w -215052098
    //   1033: ixor
    //   1034: ldc2_w 2117509084
    //   1037: l2i
    //   1038: ldc_w -761364844
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 3028, -1304444374 -> 1026, 1023973913 -> 1068
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '䔘㌖䕚㶶'
    //   1076: getstatic Perryc.1 : I
    //   1079: ifeq -> 1093
    //   1082: ldc2_w 1826540662
    //   1085: l2i
    //   1086: ldc_w -807005540
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w 1489114991
    //   1096: l2i
    //   1097: ldc_w -1429190270
    //   1100: ixor
    //   1101: ldc2_w 1793975544
    //   1104: l2i
    //   1105: ldc_w -1451298435
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, -2021888305 -> 1093, 1621871471 -> 3024
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w -974973674
    //   1142: l2i
    //   1143: ldc_w -974973668
    //   1146: ixor
    //   1147: getstatic Perryc.0 : I
    //   1150: ifle -> 1164
    //   1153: ldc2_w 2065330225
    //   1156: l2i
    //   1157: ldc_w -1190519209
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -291221332
    //   1167: l2i
    //   1168: ldc_w -156301926
    //   1171: ixor
    //   1172: ldc2_w 818702264
    //   1175: l2i
    //   1176: ldc_w -1417076190
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 3038, -2092035924 -> 1208, 1498754044 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w -607002767
    //   1214: l2i
    //   1215: ldc_w -607002767
    //   1218: ixor
    //   1219: getstatic Perryc.1 : I
    //   1222: ifeq -> 1236
    //   1225: ldc2_w 110902813
    //   1228: l2i
    //   1229: ldc_w -1478882812
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -1197300748
    //   1239: l2i
    //   1240: ldc_w 968170623
    //   1243: ixor
    //   1244: ldc2_w 728122938
    //   1247: l2i
    //   1248: ldc_w -1204482791
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 3044, 306508968 -> 1280, 840269626 -> 1236
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w 1098769596
    //   1286: l2i
    //   1287: ldc_w 1098769570
    //   1290: ixor
    //   1291: getstatic Perryc.c : I
    //   1294: iflt -> 1308
    //   1297: ldc2_w -1312968392
    //   1300: l2i
    //   1301: ldc_w 119675312
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w 403910999
    //   1311: l2i
    //   1312: ldc_w -1586953021
    //   1315: ixor
    //   1316: ldc2_w 1585819769
    //   1319: l2i
    //   1320: ldc_w 1946500669
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -1675680052 -> 3006, 1649338346 -> 1308
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.0 : I
    //   1358: ifle -> 1372
    //   1361: ldc2_w -662583754
    //   1364: l2i
    //   1365: ldc_w -3996277
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w -972101009
    //   1375: l2i
    //   1376: ldc_w 1370692654
    //   1379: ixor
    //   1380: ldc2_w -1189929751
    //   1383: l2i
    //   1384: ldc_w 2144586292
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 3016, -511568544 -> 1372, 1367154844 -> 1416
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -1260356767
    //   1428: l2i
    //   1429: ldc_w 597498795
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w -1641520228
    //   1439: l2i
    //   1440: ldc_w 1724233007
    //   1443: ixor
    //   1444: ldc2_w 285151743
    //   1447: l2i
    //   1448: ldc_w 1543402578
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 3000, -1276333282 -> 1480, -595851929 -> 1436
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.1 : I
    //   1486: ifeq -> 1500
    //   1489: ldc2_w -1183915888
    //   1492: l2i
    //   1493: ldc_w 644553933
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w 1940100999
    //   1503: l2i
    //   1504: ldc_w 269477457
    //   1507: ixor
    //   1508: ldc2_w 1422862675
    //   1511: l2i
    //   1512: ldc_w -815159929
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, 77820041 -> 3078, 1402891443 -> 1500
    //   1544: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.0 : I
    //   1550: ifle -> 1564
    //   1553: ldc2_w -1162950407
    //   1556: l2i
    //   1557: ldc_w -312810705
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w 86270078
    //   1567: l2i
    //   1568: ldc_w -273630738
    //   1571: ixor
    //   1572: ldc2_w 1443448234
    //   1575: l2i
    //   1576: ldc_w -574034281
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, -600473365 -> 3082, 822016129 -> 1564
    //   1608: aload_0
    //   1609: new java/util/concurrent/ConcurrentHashMap
    //   1612: dup
    //   1613: getstatic Perryc.c : I
    //   1616: iflt -> 1630
    //   1619: ldc2_w -538293356
    //   1622: l2i
    //   1623: ldc_w -1555859424
    //   1626: ixor
    //   1627: goto -> 1638
    //   1630: ldc2_w 354288903
    //   1633: l2i
    //   1634: ldc_w 618823178
    //   1637: ixor
    //   1638: ldc2_w 390733530
    //   1641: l2i
    //   1642: ldc_w 932245511
    //   1645: ixor
    //   1646: ixor
    //   1647: lookupswitch default -> 3008, 287741392 -> 1672, 1551097193 -> 1630
    //   1672: invokespecial <init> : ()V
    //   1675: getstatic Perryc.c : I
    //   1678: iflt -> 1692
    //   1681: ldc2_w -1245844655
    //   1684: l2i
    //   1685: ldc_w 923054274
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w -1169538694
    //   1695: l2i
    //   1696: ldc_w -1901439616
    //   1699: ixor
    //   1700: ldc2_w -297056586
    //   1703: l2i
    //   1704: ldc_w 2146374400
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 3058, -1522253492 -> 1736, 320671269 -> 1692
    //   1736: putfield targets : Ljava/util/Map;
    //   1739: getstatic Perryc.c : I
    //   1742: iflt -> 1756
    //   1745: ldc2_w -931191391
    //   1748: l2i
    //   1749: ldc_w 2131423258
    //   1752: ixor
    //   1753: goto -> 1764
    //   1756: ldc2_w -930419641
    //   1759: l2i
    //   1760: ldc_w -1307594960
    //   1763: ixor
    //   1764: ldc2_w -88180715
    //   1767: l2i
    //   1768: ldc_w 1978129751
    //   1771: ixor
    //   1772: ixor
    //   1773: lookupswitch default -> 1800, -275022232 -> 1756, 942436601 -> 3012
    //   1800: aload_0
    //   1801: new java/util/ArrayList
    //   1804: dup
    //   1805: getstatic Perryc.1 : I
    //   1808: ifeq -> 1822
    //   1811: ldc2_w -1981883310
    //   1814: l2i
    //   1815: ldc_w 1709652082
    //   1818: ixor
    //   1819: goto -> 1830
    //   1822: ldc2_w 139963936
    //   1825: l2i
    //   1826: ldc_w 1646651888
    //   1829: ixor
    //   1830: ldc2_w -1304710783
    //   1833: l2i
    //   1834: ldc_w -1072263516
    //   1837: ixor
    //   1838: ixor
    //   1839: lookupswitch default -> 3052, -1642800379 -> 1822, 408910069 -> 1864
    //   1864: invokespecial <init> : ()V
    //   1867: getstatic Perryc.c : I
    //   1870: iflt -> 1884
    //   1873: ldc2_w 1452836247
    //   1876: l2i
    //   1877: ldc_w -1305422064
    //   1880: ixor
    //   1881: goto -> 1892
    //   1884: ldc2_w 471508867
    //   1887: l2i
    //   1888: ldc_w -1964910017
    //   1891: ixor
    //   1892: ldc2_w -133273534
    //   1895: l2i
    //   1896: ldc_w 2058008106
    //   1899: ixor
    //   1900: ixor
    //   1901: lookupswitch default -> 3056, 341812180 -> 1928, 1712098543 -> 1884
    //   1928: putfield messages : Ljava/util/List;
    //   1931: getstatic Perryc.1 : I
    //   1934: ifeq -> 1948
    //   1937: ldc2_w 628190073
    //   1940: l2i
    //   1941: ldc_w -155662085
    //   1944: ixor
    //   1945: goto -> 1956
    //   1948: ldc2_w -28363786
    //   1951: l2i
    //   1952: ldc_w -1697436435
    //   1955: ixor
    //   1956: ldc2_w 1173182782
    //   1959: l2i
    //   1960: ldc_w 562552147
    //   1963: ixor
    //   1964: ixor
    //   1965: lookupswitch default -> 1992, -1214044177 -> 3014, 310619236 -> 1948
    //   1992: aload_0
    //   1993: new bigname/zprestige/webhack/util/Timer
    //   1996: dup
    //   1997: getstatic Perryc.0 : I
    //   2000: ifle -> 2014
    //   2003: ldc2_w 1538009376
    //   2006: l2i
    //   2007: ldc_w -1576246833
    //   2010: ixor
    //   2011: goto -> 2022
    //   2014: ldc2_w 1837716922
    //   2017: l2i
    //   2018: ldc_w -860905649
    //   2021: ixor
    //   2022: ldc2_w -1483882812
    //   2025: l2i
    //   2026: ldc_w 461325135
    //   2029: ixor
    //   2030: ixor
    //   2031: lookupswitch default -> 2056, -1817087561 -> 2014, 1163048292 -> 3066
    //   2056: invokespecial <init> : ()V
    //   2059: getstatic Perryc.1 : I
    //   2062: ifeq -> 2076
    //   2065: ldc2_w -987225200
    //   2068: l2i
    //   2069: ldc_w -228213984
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w 153777540
    //   2079: l2i
    //   2080: ldc_w -1412309596
    //   2083: ixor
    //   2084: ldc2_w 2102728365
    //   2087: l2i
    //   2088: ldc_w -1046033938
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -1950464013 -> 3048, -224007521 -> 2076
    //   2120: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   2123: getstatic Perryc.c : I
    //   2126: iflt -> 2140
    //   2129: ldc2_w -777106468
    //   2132: l2i
    //   2133: ldc_w -2050204878
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w 1316531899
    //   2143: l2i
    //   2144: ldc_w -794763267
    //   2147: ixor
    //   2148: ldc2_w 1980017633
    //   2151: l2i
    //   2152: ldc_w 1189715189
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 3068, -1372240302 -> 2184, 1687103482 -> 2140
    //   2184: aload_0
    //   2185: new bigname/zprestige/webhack/util/Timer
    //   2188: dup
    //   2189: getstatic Perryc.1 : I
    //   2192: ifeq -> 2206
    //   2195: ldc2_w -2055872180
    //   2198: l2i
    //   2199: ldc_w -1357056055
    //   2202: ixor
    //   2203: goto -> 2214
    //   2206: ldc2_w -2097556826
    //   2209: l2i
    //   2210: ldc_w 1024335544
    //   2213: ixor
    //   2214: ldc2_w -1486382095
    //   2217: l2i
    //   2218: ldc_w -186203419
    //   2221: ixor
    //   2222: ixor
    //   2223: lookupswitch default -> 2248, 1959445472 -> 2206, 2045267857 -> 3088
    //   2248: invokespecial <init> : ()V
    //   2251: getstatic Perryc.c : I
    //   2254: iflt -> 2268
    //   2257: ldc2_w -1993302293
    //   2260: l2i
    //   2261: ldc_w -559141274
    //   2264: ixor
    //   2265: goto -> 2276
    //   2268: ldc2_w 1586866760
    //   2271: l2i
    //   2272: ldc_w 1718403101
    //   2275: ixor
    //   2276: ldc2_w 1433861086
    //   2279: l2i
    //   2280: ldc_w -444643924
    //   2283: ixor
    //   2284: ixor
    //   2285: lookupswitch default -> 2312, -409661697 -> 3054, 1176728659 -> 2268
    //   2312: putfield cooldownTimer : Lbigname/zprestige/webhack/util/Timer;
    //   2315: new java/io/File
    //   2318: dup
    //   2319: ldc_w '䔋㌖䕔㶟ꮃ๲㣞蹢깐ﷳਨ裣煦⫽?辇鴥'
    //   2322: getstatic Perryc.0 : I
    //   2325: ifle -> 2339
    //   2328: ldc2_w 94600950
    //   2331: l2i
    //   2332: ldc_w 1847178940
    //   2335: ixor
    //   2336: goto -> 2347
    //   2339: ldc2_w 1048173785
    //   2342: l2i
    //   2343: ldc_w 1681636993
    //   2346: ixor
    //   2347: ldc2_w -462008088
    //   2350: l2i
    //   2351: ldc_w -53728787
    //   2354: ixor
    //   2355: ixor
    //   2356: lookupswitch default -> 3002, 1123556189 -> 2384, 1929425231 -> 2339
    //   2384: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2387: getstatic Perryc.0 : I
    //   2390: ifle -> 2404
    //   2393: ldc2_w 1023431279
    //   2396: l2i
    //   2397: ldc_w 1520935052
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w 943290128
    //   2407: l2i
    //   2408: ldc_w 1125199571
    //   2411: ixor
    //   2412: ldc2_w -1498388308
    //   2415: l2i
    //   2416: ldc_w -1062092264
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, 27678807 -> 3060, 1184089052 -> 2404
    //   2448: invokespecial <init> : (Ljava/lang/String;)V
    //   2451: getstatic Perryc.c : I
    //   2454: iflt -> 2468
    //   2457: ldc2_w 1550925751
    //   2460: l2i
    //   2461: ldc_w -1327997337
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w -1487056349
    //   2471: l2i
    //   2472: ldc_w -2108350026
    //   2475: ixor
    //   2476: ldc2_w -434682008
    //   2479: l2i
    //   2480: ldc_w -524104885
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 2512, -572703611 -> 2468, -360911373 -> 3004
    //   2512: astore_1
    //   2513: getstatic Perryc.1 : I
    //   2516: ifeq -> 2530
    //   2519: ldc2_w -659829124
    //   2522: l2i
    //   2523: ldc_w -1406780295
    //   2526: ixor
    //   2527: goto -> 2538
    //   2530: ldc2_w 491204531
    //   2533: l2i
    //   2534: ldc_w 847714006
    //   2537: ixor
    //   2538: ldc2_w -113952120
    //   2541: l2i
    //   2542: ldc_w -884575025
    //   2545: ixor
    //   2546: ixor
    //   2547: lookupswitch default -> 3040, 498300706 -> 2572, 1191099458 -> 2530
    //   2572: aload_1
    //   2573: getstatic Perryc.0 : I
    //   2576: ifle -> 2590
    //   2579: ldc2_w -1580123082
    //   2582: l2i
    //   2583: ldc_w -1259690514
    //   2586: ixor
    //   2587: goto -> 2598
    //   2590: ldc2_w -452400743
    //   2593: l2i
    //   2594: ldc_w -2064855135
    //   2597: ixor
    //   2598: ldc2_w 1792739256
    //   2601: l2i
    //   2602: ldc_w -100588508
    //   2605: ixor
    //   2606: ixor
    //   2607: lookupswitch default -> 2632, -2048804284 -> 3042, -1240742205 -> 2590
    //   2632: invokevirtual exists : ()Z
    //   2635: ifne -> 2649
    //   2638: ldc2_w 667605260
    //   2641: l2i
    //   2642: ldc_w 1701151195
    //   2645: ixor
    //   2646: goto -> 2657
    //   2649: ldc2_w -1643539299
    //   2652: l2i
    //   2653: ldc_w -593048501
    //   2656: ixor
    //   2657: ldc2_w 38159873
    //   2660: l2i
    //   2661: ldc_w -1174266446
    //   2664: ixor
    //   2665: ixor
    //   2666: tableswitch default -> 2638, -85261468 -> 2688, -85261467 -> 2999
    //   2688: getstatic Perryc.0 : I
    //   2691: ifle -> 2705
    //   2694: ldc2_w -791226100
    //   2697: l2i
    //   2698: ldc_w -1463640897
    //   2701: ixor
    //   2702: goto -> 2713
    //   2705: ldc2_w -341315204
    //   2708: l2i
    //   2709: ldc_w -1167576839
    //   2712: ixor
    //   2713: ldc2_w -1482792841
    //   2716: l2i
    //   2717: ldc_w 1527350615
    //   2720: ixor
    //   2721: ixor
    //   2722: lookupswitch default -> 2748, -2071748461 -> 3022, -559852028 -> 2705
    //   2748: aload_1
    //   2749: getstatic Perryc.1 : I
    //   2752: ifeq -> 2766
    //   2755: ldc2_w 1093633759
    //   2758: l2i
    //   2759: ldc_w -2061845975
    //   2762: ixor
    //   2763: goto -> 2774
    //   2766: ldc2_w 279601121
    //   2769: l2i
    //   2770: ldc_w -1433981480
    //   2773: ixor
    //   2774: ldc2_w 1598483784
    //   2777: l2i
    //   2778: ldc_w 1539527213
    //   2781: ixor
    //   2782: ixor
    //   2783: lookupswitch default -> 3018, -1096233636 -> 2808, -1062173805 -> 2766
    //   2808: invokevirtual createNewFile : ()Z
    //   2811: pop
    //   2812: goto -> 2999
    //   2815: getstatic Perryc.0 : I
    //   2818: ifle -> 2832
    //   2821: ldc2_w -1412876864
    //   2824: l2i
    //   2825: ldc_w -1006870015
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -1473613167
    //   2835: l2i
    //   2836: ldc_w -1737781569
    //   2839: ixor
    //   2840: ldc2_w 1952406576
    //   2843: l2i
    //   2844: ldc_w 19433744
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 3074, 490898145 -> 2832, 1161177358 -> 2876
    //   2876: astore_2
    //   2877: getstatic Perryc.c : I
    //   2880: iflt -> 2894
    //   2883: ldc2_w 790666289
    //   2886: l2i
    //   2887: ldc_w 779908095
    //   2890: ixor
    //   2891: goto -> 2902
    //   2894: ldc2_w -1730391475
    //   2897: l2i
    //   2898: ldc_w 73279775
    //   2901: ixor
    //   2902: ldc2_w -1748666261
    //   2905: l2i
    //   2906: ldc_w 924694401
    //   2909: ixor
    //   2910: ixor
    //   2911: lookupswitch default -> 2936, -1585176540 -> 3032, -873726931 -> 2894
    //   2936: aload_2
    //   2937: getstatic Perryc.0 : I
    //   2940: ifle -> 2954
    //   2943: ldc2_w -1473955645
    //   2946: l2i
    //   2947: ldc_w -574965719
    //   2950: ixor
    //   2951: goto -> 2962
    //   2954: ldc2_w -579529491
    //   2957: l2i
    //   2958: ldc_w -1316386564
    //   2961: ixor
    //   2962: ldc2_w -1491409572
    //   2965: l2i
    //   2966: ldc_w 894084357
    //   2969: ixor
    //   2970: ixor
    //   2971: lookupswitch default -> 2996, -405815117 -> 3050, 930282186 -> 2954
    //   2996: invokevirtual printStackTrace : ()V
    //   2999: return
    //   3000: aconst_null
    //   3001: athrow
    //   3002: aconst_null
    //   3003: athrow
    //   3004: aconst_null
    //   3005: athrow
    //   3006: aconst_null
    //   3007: athrow
    //   3008: aconst_null
    //   3009: athrow
    //   3010: aconst_null
    //   3011: athrow
    //   3012: aconst_null
    //   3013: athrow
    //   3014: aconst_null
    //   3015: athrow
    //   3016: aconst_null
    //   3017: athrow
    //   3018: aconst_null
    //   3019: athrow
    //   3020: aconst_null
    //   3021: athrow
    //   3022: aconst_null
    //   3023: athrow
    //   3024: aconst_null
    //   3025: athrow
    //   3026: aconst_null
    //   3027: athrow
    //   3028: aconst_null
    //   3029: athrow
    //   3030: aconst_null
    //   3031: athrow
    //   3032: aconst_null
    //   3033: athrow
    //   3034: aconst_null
    //   3035: athrow
    //   3036: aconst_null
    //   3037: athrow
    //   3038: aconst_null
    //   3039: athrow
    //   3040: aconst_null
    //   3041: athrow
    //   3042: aconst_null
    //   3043: athrow
    //   3044: aconst_null
    //   3045: athrow
    //   3046: aconst_null
    //   3047: athrow
    //   3048: aconst_null
    //   3049: athrow
    //   3050: aconst_null
    //   3051: athrow
    //   3052: aconst_null
    //   3053: athrow
    //   3054: aconst_null
    //   3055: athrow
    //   3056: aconst_null
    //   3057: athrow
    //   3058: aconst_null
    //   3059: athrow
    //   3060: aconst_null
    //   3061: athrow
    //   3062: aconst_null
    //   3063: athrow
    //   3064: aconst_null
    //   3065: athrow
    //   3066: aconst_null
    //   3067: athrow
    //   3068: aconst_null
    //   3069: athrow
    //   3070: aconst_null
    //   3071: athrow
    //   3072: aconst_null
    //   3073: athrow
    //   3074: aconst_null
    //   3075: athrow
    //   3076: aconst_null
    //   3077: athrow
    //   3078: aconst_null
    //   3079: athrow
    //   3080: aconst_null
    //   3081: athrow
    //   3082: aconst_null
    //   3083: athrow
    //   3084: aconst_null
    //   3085: athrow
    //   3086: aconst_null
    //   3087: athrow
    //   3088: aconst_null
    //   3089: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2877	122	2	e	Ljava/lang/Exception;
    //   0	3000	0	this	Lbigname/zprestige/webhack/features/modules/Chat/AutoGG;
    //   2513	487	1	file	Ljava/io/File;
    // Exception table:
    //   from	to	target	type
    //   2688	2812	2815	java/lang/Exception
  }
  
  public Integer lambda$onTick$0(EntityPlayer p, Integer v) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Chat\AutoGG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */