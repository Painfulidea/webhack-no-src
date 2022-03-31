package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class BurrowESP extends Module {
  public Setting<Integer> outlineGreen;
  
  public Setting<Boolean> name;
  
  public Setting<Integer> boxBlue;
  
  public Setting<Float> outlineWidth;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Boolean> cOutline;
  
  public Setting<Integer> outlineAlpha;
  
  public Setting<Boolean> outline;
  
  public Map<EntityPlayer, BlockPos> burrowedPlayers;
  
  public Setting<Integer> boxRed;
  
  public Setting<Integer> outlineRed;
  
  public Setting<Integer> outlineBlue;
  
  public Setting<Boolean> box;
  
  public Setting<Integer> boxGreen;
  
  public void renderBurrowedBlock(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3665
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3657
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3649
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 1078063203
    //   33: l2i
    //   34: ldc -1130403024
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1687288673
    //   43: l2i
    //   44: ldc 1019580824
    //   46: ixor
    //   47: ldc2_w 1322036882
    //   50: l2i
    //   51: ldc 628140001
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 3630, -1755147744 -> 40, -870867852 -> 80
    //   80: aload_1
    //   81: new java/awt/Color
    //   84: dup
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 101
    //   91: ldc2_w -1716893730
    //   94: l2i
    //   95: ldc 1317541224
    //   97: ixor
    //   98: goto -> 108
    //   101: ldc2_w 74842432
    //   104: l2i
    //   105: ldc -271818020
    //   107: ixor
    //   108: ldc2_w 1799546309
    //   111: l2i
    //   112: ldc 1007103118
    //   114: ixor
    //   115: ixor
    //   116: lookupswitch default -> 3594, -2140693507 -> 101, -1124095273 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.1 : I
    //   148: ifeq -> 161
    //   151: ldc2_w -1777884984
    //   154: l2i
    //   155: ldc -759186230
    //   157: ixor
    //   158: goto -> 168
    //   161: ldc2_w -1744381966
    //   164: l2i
    //   165: ldc 2054857045
    //   167: ixor
    //   168: ldc2_w 255996304
    //   171: l2i
    //   172: ldc 885588190
    //   174: ixor
    //   175: ixor
    //   176: lookupswitch default -> 3600, -638105623 -> 204, 2134060364 -> 161
    //   204: getfield boxRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   207: getstatic Perryc.1 : I
    //   210: ifeq -> 223
    //   213: ldc2_w 1007537632
    //   216: l2i
    //   217: ldc 417884584
    //   219: ixor
    //   220: goto -> 230
    //   223: ldc2_w -677762235
    //   226: l2i
    //   227: ldc 280338250
    //   229: ixor
    //   230: ldc2_w 1014076800
    //   233: l2i
    //   234: ldc -1255266928
    //   236: ixor
    //   237: ixor
    //   238: lookupswitch default -> 264, -1380314024 -> 3556, -837780033 -> 223
    //   264: goto -> 268
    //   267: athrow
    //   268: invokevirtual getValue : ()Ljava/lang/Object;
    //   271: goto -> 275
    //   274: athrow
    //   275: checkcast java/lang/Integer
    //   278: getstatic Perryc.c : I
    //   281: iflt -> 294
    //   284: ldc2_w -2041099219
    //   287: l2i
    //   288: ldc -1691123688
    //   290: ixor
    //   291: goto -> 301
    //   294: ldc2_w 1221328757
    //   297: l2i
    //   298: ldc -1449119448
    //   300: ixor
    //   301: ldc2_w 730259043
    //   304: l2i
    //   305: ldc -205704042
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 3608, -983619904 -> 294, 961553576 -> 336
    //   336: goto -> 340
    //   339: athrow
    //   340: invokevirtual intValue : ()I
    //   343: goto -> 347
    //   346: athrow
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 363
    //   353: ldc2_w 2092847755
    //   356: l2i
    //   357: ldc -1985845951
    //   359: ixor
    //   360: goto -> 370
    //   363: ldc2_w -2095667349
    //   366: l2i
    //   367: ldc -580420051
    //   369: ixor
    //   370: ldc2_w 1867420813
    //   373: l2i
    //   374: ldc 16188287
    //   376: ixor
    //   377: ixor
    //   378: lookupswitch default -> 404, -1700421576 -> 3564, 741933322 -> 363
    //   404: aload_0
    //   405: getstatic Perryc.c : I
    //   408: iflt -> 421
    //   411: ldc2_w -281567222
    //   414: l2i
    //   415: ldc 590556749
    //   417: ixor
    //   418: goto -> 428
    //   421: ldc2_w 1728815699
    //   424: l2i
    //   425: ldc 1653274640
    //   427: ixor
    //   428: ldc2_w 1777428600
    //   431: l2i
    //   432: ldc 339142473
    //   434: ixor
    //   435: ixor
    //   436: lookupswitch default -> 3590, -1312620170 -> 421, 2017908082 -> 464
    //   464: getfield boxGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   467: getstatic Perryc.0 : I
    //   470: ifle -> 483
    //   473: ldc2_w -1156918271
    //   476: l2i
    //   477: ldc 267778422
    //   479: ixor
    //   480: goto -> 490
    //   483: ldc2_w -33046183
    //   486: l2i
    //   487: ldc -1598292209
    //   489: ixor
    //   490: ldc2_w -1775109989
    //   493: l2i
    //   494: ldc 831274149
    //   496: ixor
    //   497: ixor
    //   498: lookupswitch default -> 524, 152513625 -> 483, 323152201 -> 3558
    //   524: goto -> 528
    //   527: athrow
    //   528: invokevirtual getValue : ()Ljava/lang/Object;
    //   531: goto -> 535
    //   534: athrow
    //   535: checkcast java/lang/Integer
    //   538: getstatic Perryc.c : I
    //   541: iflt -> 554
    //   544: ldc2_w 1347226435
    //   547: l2i
    //   548: ldc -1008304011
    //   550: ixor
    //   551: goto -> 561
    //   554: ldc2_w 695002065
    //   557: l2i
    //   558: ldc 428334502
    //   560: ixor
    //   561: ldc2_w -1516367077
    //   564: l2i
    //   565: ldc 990010989
    //   567: ixor
    //   568: ixor
    //   569: lookupswitch default -> 596, -1177066587 -> 554, 221759040 -> 3610
    //   596: goto -> 600
    //   599: athrow
    //   600: invokevirtual intValue : ()I
    //   603: goto -> 607
    //   606: athrow
    //   607: getstatic Perryc.0 : I
    //   610: ifle -> 623
    //   613: ldc2_w 451205258
    //   616: l2i
    //   617: ldc -330104729
    //   619: ixor
    //   620: goto -> 630
    //   623: ldc2_w 905375946
    //   626: l2i
    //   627: ldc 302471991
    //   629: ixor
    //   630: ldc2_w 900862422
    //   633: l2i
    //   634: ldc 1664663379
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 664, -1606584728 -> 3544, -818652394 -> 623
    //   664: aload_0
    //   665: getstatic Perryc.c : I
    //   668: iflt -> 681
    //   671: ldc2_w 1097753878
    //   674: l2i
    //   675: ldc 1374070880
    //   677: ixor
    //   678: goto -> 688
    //   681: ldc2_w -755557076
    //   684: l2i
    //   685: ldc -1341604631
    //   687: ixor
    //   688: ldc2_w -914697797
    //   691: l2i
    //   692: ldc -868808599
    //   694: ixor
    //   695: ixor
    //   696: lookupswitch default -> 724, 365237412 -> 3604, 1965943668 -> 681
    //   724: getfield boxBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   727: getstatic Perryc.1 : I
    //   730: ifeq -> 743
    //   733: ldc2_w 190598827
    //   736: l2i
    //   737: ldc -1000841483
    //   739: ixor
    //   740: goto -> 750
    //   743: ldc2_w 56807359
    //   746: l2i
    //   747: ldc 1594596003
    //   749: ixor
    //   750: ldc2_w -1342838316
    //   753: l2i
    //   754: ldc -1767228874
    //   756: ixor
    //   757: ixor
    //   758: lookupswitch default -> 3616, -161758276 -> 743, 1698072318 -> 784
    //   784: goto -> 788
    //   787: athrow
    //   788: invokevirtual getValue : ()Ljava/lang/Object;
    //   791: goto -> 795
    //   794: athrow
    //   795: checkcast java/lang/Integer
    //   798: getstatic Perryc.1 : I
    //   801: ifeq -> 814
    //   804: ldc2_w -1137810502
    //   807: l2i
    //   808: ldc -652322731
    //   810: ixor
    //   811: goto -> 821
    //   814: ldc2_w 436457145
    //   817: l2i
    //   818: ldc -202571155
    //   820: ixor
    //   821: ldc2_w 719886096
    //   824: l2i
    //   825: ldc -1290357461
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 856, -53601836 -> 3568, 841636676 -> 814
    //   856: goto -> 860
    //   859: athrow
    //   860: invokevirtual intValue : ()I
    //   863: goto -> 867
    //   866: athrow
    //   867: getstatic Perryc.c : I
    //   870: iflt -> 883
    //   873: ldc2_w -1258362577
    //   876: l2i
    //   877: ldc 480564345
    //   879: ixor
    //   880: goto -> 890
    //   883: ldc2_w 224161342
    //   886: l2i
    //   887: ldc 938513619
    //   889: ixor
    //   890: ldc2_w 1045429346
    //   893: l2i
    //   894: ldc 1057047060
    //   896: ixor
    //   897: ixor
    //   898: lookupswitch default -> 3536, -1458273504 -> 883, 1004684443 -> 924
    //   924: aload_0
    //   925: getstatic Perryc.0 : I
    //   928: ifle -> 941
    //   931: ldc2_w 146218403
    //   934: l2i
    //   935: ldc 712162010
    //   937: ixor
    //   938: goto -> 948
    //   941: ldc2_w -2008685301
    //   944: l2i
    //   945: ldc 840402922
    //   947: ixor
    //   948: ldc2_w -749411653
    //   951: l2i
    //   952: ldc -531826540
    //   954: ixor
    //   955: ixor
    //   956: lookupswitch default -> 984, 299744598 -> 3546, 799546236 -> 941
    //   984: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   987: getstatic Perryc.1 : I
    //   990: ifeq -> 1003
    //   993: ldc2_w 1786857713
    //   996: l2i
    //   997: ldc -1723716946
    //   999: ixor
    //   1000: goto -> 1010
    //   1003: ldc2_w 740831725
    //   1006: l2i
    //   1007: ldc -502917486
    //   1009: ixor
    //   1010: ldc2_w 359221797
    //   1013: l2i
    //   1014: ldc -1398257821
    //   1016: ixor
    //   1017: ixor
    //   1018: lookupswitch default -> 3634, 1241673497 -> 1003, 2012162617 -> 1044
    //   1044: goto -> 1048
    //   1047: athrow
    //   1048: invokevirtual getValue : ()Ljava/lang/Object;
    //   1051: goto -> 1055
    //   1054: athrow
    //   1055: checkcast java/lang/Integer
    //   1058: getstatic Perryc.1 : I
    //   1061: ifeq -> 1074
    //   1064: ldc2_w -1426393012
    //   1067: l2i
    //   1068: ldc 709000034
    //   1070: ixor
    //   1071: goto -> 1081
    //   1074: ldc2_w -2047078988
    //   1077: l2i
    //   1078: ldc -479882536
    //   1080: ixor
    //   1081: ldc2_w 1745294507
    //   1084: l2i
    //   1085: ldc 1814575462
    //   1087: ixor
    //   1088: ixor
    //   1089: lookupswitch default -> 1116, -2070434077 -> 3614, -504493679 -> 1074
    //   1116: goto -> 1120
    //   1119: athrow
    //   1120: invokevirtual intValue : ()I
    //   1123: goto -> 1127
    //   1126: athrow
    //   1127: getstatic Perryc.1 : I
    //   1130: ifeq -> 1143
    //   1133: ldc2_w -1148039488
    //   1136: l2i
    //   1137: ldc -1895962930
    //   1139: ixor
    //   1140: goto -> 1150
    //   1143: ldc2_w 1367114103
    //   1146: l2i
    //   1147: ldc -1336398539
    //   1149: ixor
    //   1150: ldc2_w -1712902630
    //   1153: l2i
    //   1154: ldc 1671954793
    //   1156: ixor
    //   1157: ixor
    //   1158: lookupswitch default -> 3572, -819951747 -> 1143, 460030769 -> 1184
    //   1184: goto -> 1188
    //   1187: athrow
    //   1188: invokespecial <init> : (IIII)V
    //   1191: goto -> 1195
    //   1194: athrow
    //   1195: ldc2_w -1468628241
    //   1198: l2i
    //   1199: ldc_w -1468628242
    //   1202: ixor
    //   1203: new java/awt/Color
    //   1206: dup
    //   1207: getstatic Perryc.1 : I
    //   1210: ifeq -> 1224
    //   1213: ldc2_w -1840944687
    //   1216: l2i
    //   1217: ldc_w -1219823099
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w -1873902464
    //   1227: l2i
    //   1228: ldc_w -1529296148
    //   1231: ixor
    //   1232: ldc2_w 1994211847
    //   1235: l2i
    //   1236: ldc_w -1940707542
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 3574, -837276863 -> 1268, -545130759 -> 1224
    //   1268: aload_0
    //   1269: getstatic Perryc.0 : I
    //   1272: ifle -> 1286
    //   1275: ldc2_w -1160505183
    //   1278: l2i
    //   1279: ldc_w 296199446
    //   1282: ixor
    //   1283: goto -> 1294
    //   1286: ldc2_w 1567327592
    //   1289: l2i
    //   1290: ldc_w -109779302
    //   1293: ixor
    //   1294: ldc2_w -1742683782
    //   1297: l2i
    //   1298: ldc_w -1133406466
    //   1301: ixor
    //   1302: ixor
    //   1303: lookupswitch default -> 1328, -1893537229 -> 3622, -1758771352 -> 1286
    //   1328: getfield outlineRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1331: getstatic Perryc.c : I
    //   1334: iflt -> 1348
    //   1337: ldc2_w 1934420019
    //   1340: l2i
    //   1341: ldc_w 1115506540
    //   1344: ixor
    //   1345: goto -> 1356
    //   1348: ldc2_w 277361898
    //   1351: l2i
    //   1352: ldc_w -778177502
    //   1355: ixor
    //   1356: ldc2_w 842636452
    //   1359: l2i
    //   1360: ldc_w 997304661
    //   1363: ixor
    //   1364: ixor
    //   1365: lookupswitch default -> 1392, -963545828 -> 1348, 947493550 -> 3612
    //   1392: goto -> 1396
    //   1395: athrow
    //   1396: invokevirtual getValue : ()Ljava/lang/Object;
    //   1399: goto -> 1403
    //   1402: athrow
    //   1403: checkcast java/lang/Integer
    //   1406: getstatic Perryc.1 : I
    //   1409: ifeq -> 1423
    //   1412: ldc2_w -1324397711
    //   1415: l2i
    //   1416: ldc_w -18528654
    //   1419: ixor
    //   1420: goto -> 1431
    //   1423: ldc2_w 238769988
    //   1426: l2i
    //   1427: ldc_w 316704006
    //   1430: ixor
    //   1431: ldc2_w 260880691
    //   1434: l2i
    //   1435: ldc_w 247623124
    //   1438: ixor
    //   1439: ixor
    //   1440: lookupswitch default -> 3626, 496305829 -> 1468, 1319426532 -> 1423
    //   1468: goto -> 1472
    //   1471: athrow
    //   1472: invokevirtual intValue : ()I
    //   1475: goto -> 1479
    //   1478: athrow
    //   1479: getstatic Perryc.0 : I
    //   1482: ifle -> 1496
    //   1485: ldc2_w -901416605
    //   1488: l2i
    //   1489: ldc_w -994324387
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w -534771349
    //   1499: l2i
    //   1500: ldc_w 521064693
    //   1503: ixor
    //   1504: ldc2_w 127377665
    //   1507: l2i
    //   1508: ldc_w 1257953011
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 1540, -90432540 -> 1496, 1133764300 -> 3602
    //   1540: aload_0
    //   1541: getstatic Perryc.c : I
    //   1544: iflt -> 1558
    //   1547: ldc2_w 467097638
    //   1550: l2i
    //   1551: ldc_w 470224963
    //   1554: ixor
    //   1555: goto -> 1566
    //   1558: ldc2_w 1135364976
    //   1561: l2i
    //   1562: ldc_w 1753160336
    //   1565: ixor
    //   1566: ldc2_w 36893896
    //   1569: l2i
    //   1570: ldc_w 1680397124
    //   1573: ixor
    //   1574: ixor
    //   1575: lookupswitch default -> 3542, 1305048684 -> 1600, 1640656873 -> 1558
    //   1600: getfield outlineGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1603: getstatic Perryc.1 : I
    //   1606: ifeq -> 1620
    //   1609: ldc2_w 1126808636
    //   1612: l2i
    //   1613: ldc_w 1775450749
    //   1616: ixor
    //   1617: goto -> 1628
    //   1620: ldc2_w -1969789149
    //   1623: l2i
    //   1624: ldc_w 698797229
    //   1627: ixor
    //   1628: ldc2_w -361875061
    //   1631: l2i
    //   1632: ldc_w -666789670
    //   1635: ixor
    //   1636: ixor
    //   1637: lookupswitch default -> 3548, -1860302113 -> 1664, 416622352 -> 1620
    //   1664: goto -> 1668
    //   1667: athrow
    //   1668: invokevirtual getValue : ()Ljava/lang/Object;
    //   1671: goto -> 1675
    //   1674: athrow
    //   1675: checkcast java/lang/Integer
    //   1678: getstatic Perryc.1 : I
    //   1681: ifeq -> 1695
    //   1684: ldc2_w 434228445
    //   1687: l2i
    //   1688: ldc_w 667867705
    //   1691: ixor
    //   1692: goto -> 1703
    //   1695: ldc2_w 1726557161
    //   1698: l2i
    //   1699: ldc_w -2116127785
    //   1702: ixor
    //   1703: ldc2_w 1774127487
    //   1706: l2i
    //   1707: ldc_w 832863239
    //   1710: ixor
    //   1711: ixor
    //   1712: lookupswitch default -> 3596, -1087623866 -> 1740, 1714709404 -> 1695
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual intValue : ()I
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: getstatic Perryc.1 : I
    //   1754: ifeq -> 1768
    //   1757: ldc2_w 1406171766
    //   1760: l2i
    //   1761: ldc_w 836067341
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w 1923665674
    //   1771: l2i
    //   1772: ldc_w 1970267488
    //   1775: ixor
    //   1776: ldc2_w -129679110
    //   1779: l2i
    //   1780: ldc_w 201657399
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 1812, -1773840714 -> 3582, 887814014 -> 1768
    //   1812: aload_0
    //   1813: getstatic Perryc.0 : I
    //   1816: ifle -> 1830
    //   1819: ldc2_w -842055433
    //   1822: l2i
    //   1823: ldc_w -1221028417
    //   1826: ixor
    //   1827: goto -> 1838
    //   1830: ldc2_w 2129618708
    //   1833: l2i
    //   1834: ldc_w -1259107192
    //   1837: ixor
    //   1838: ldc2_w -288678453
    //   1841: l2i
    //   1842: ldc_w -842517606
    //   1845: ixor
    //   1846: ixor
    //   1847: lookupswitch default -> 1872, -1828180196 -> 1830, 1509227289 -> 3554
    //   1872: getfield outlineBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1875: getstatic Perryc.0 : I
    //   1878: ifle -> 1892
    //   1881: ldc2_w 677692914
    //   1884: l2i
    //   1885: ldc_w 1043018406
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w 74150509
    //   1895: l2i
    //   1896: ldc_w -1808183320
    //   1899: ixor
    //   1900: ldc2_w -1945964189
    //   1903: l2i
    //   1904: ldc_w 1461955861
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 3566, -848385246 -> 1892, 1265852915 -> 1936
    //   1936: goto -> 1940
    //   1939: athrow
    //   1940: invokevirtual getValue : ()Ljava/lang/Object;
    //   1943: goto -> 1947
    //   1946: athrow
    //   1947: checkcast java/lang/Integer
    //   1950: getstatic Perryc.c : I
    //   1953: iflt -> 1967
    //   1956: ldc2_w 1819104741
    //   1959: l2i
    //   1960: ldc_w 169656132
    //   1963: ixor
    //   1964: goto -> 1975
    //   1967: ldc2_w -1347502588
    //   1970: l2i
    //   1971: ldc_w -1855500997
    //   1974: ixor
    //   1975: ldc2_w -1314024914
    //   1978: l2i
    //   1979: ldc_w -503791023
    //   1982: ixor
    //   1983: ixor
    //   1984: lookupswitch default -> 2012, -984426828 -> 1967, 908376798 -> 3598
    //   2012: goto -> 2016
    //   2015: athrow
    //   2016: invokevirtual intValue : ()I
    //   2019: goto -> 2023
    //   2022: athrow
    //   2023: getstatic Perryc.1 : I
    //   2026: ifeq -> 2040
    //   2029: ldc2_w 291280739
    //   2032: l2i
    //   2033: ldc_w -827702363
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 1078341744
    //   2043: l2i
    //   2044: ldc_w 38786942
    //   2047: ixor
    //   2048: ldc2_w -860188100
    //   2051: l2i
    //   2052: ldc_w 377734140
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 3552, -1741637938 -> 2084, 97486086 -> 2040
    //   2084: aload_0
    //   2085: getstatic Perryc.c : I
    //   2088: iflt -> 2102
    //   2091: ldc2_w -951231814
    //   2094: l2i
    //   2095: ldc_w 1577403927
    //   2098: ixor
    //   2099: goto -> 2110
    //   2102: ldc2_w 1927982605
    //   2105: l2i
    //   2106: ldc_w 1515748763
    //   2109: ixor
    //   2110: ldc2_w 390870277
    //   2113: l2i
    //   2114: ldc_w -1132429373
    //   2117: ixor
    //   2118: ixor
    //   2119: lookupswitch default -> 2144, -1291693040 -> 2102, 847533675 -> 3584
    //   2144: getfield outlineAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2147: getstatic Perryc.0 : I
    //   2150: ifle -> 2164
    //   2153: ldc2_w 558384992
    //   2156: l2i
    //   2157: ldc_w -1698746817
    //   2160: ixor
    //   2161: goto -> 2172
    //   2164: ldc2_w 2092405332
    //   2167: l2i
    //   2168: ldc_w -1953079266
    //   2171: ixor
    //   2172: ldc2_w 1365428080
    //   2175: l2i
    //   2176: ldc_w 841348855
    //   2179: ixor
    //   2180: ixor
    //   2181: lookupswitch default -> 2208, -659531560 -> 3624, 40683336 -> 2164
    //   2208: goto -> 2212
    //   2211: athrow
    //   2212: invokevirtual getValue : ()Ljava/lang/Object;
    //   2215: goto -> 2219
    //   2218: athrow
    //   2219: checkcast java/lang/Integer
    //   2222: getstatic Perryc.1 : I
    //   2225: ifeq -> 2239
    //   2228: ldc2_w 1926062677
    //   2231: l2i
    //   2232: ldc_w -1280439274
    //   2235: ixor
    //   2236: goto -> 2247
    //   2239: ldc2_w 983844637
    //   2242: l2i
    //   2243: ldc_w -1083018382
    //   2246: ixor
    //   2247: ldc2_w -1445655037
    //   2250: l2i
    //   2251: ldc_w -1544948026
    //   2254: ixor
    //   2255: ixor
    //   2256: lookupswitch default -> 3628, -1880437590 -> 2284, -882927994 -> 2239
    //   2284: goto -> 2288
    //   2287: athrow
    //   2288: invokevirtual intValue : ()I
    //   2291: goto -> 2295
    //   2294: athrow
    //   2295: getstatic Perryc.c : I
    //   2298: iflt -> 2312
    //   2301: ldc2_w 398248243
    //   2304: l2i
    //   2305: ldc_w 1832350387
    //   2308: ixor
    //   2309: goto -> 2320
    //   2312: ldc2_w -1783864276
    //   2315: l2i
    //   2316: ldc_w -1409539594
    //   2319: ixor
    //   2320: ldc2_w 935600759
    //   2323: l2i
    //   2324: ldc_w 1989747401
    //   2327: ixor
    //   2328: ixor
    //   2329: lookupswitch default -> 3586, 1003928382 -> 2312, 2131576164 -> 2356
    //   2356: goto -> 2360
    //   2359: athrow
    //   2360: invokespecial <init> : (IIII)V
    //   2363: goto -> 2367
    //   2366: athrow
    //   2367: getstatic Perryc.1 : I
    //   2370: ifeq -> 2384
    //   2373: ldc2_w -64662257
    //   2376: l2i
    //   2377: ldc_w -2011043772
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w 1830472329
    //   2387: l2i
    //   2388: ldc_w 1390230807
    //   2391: ixor
    //   2392: ldc2_w -122097430
    //   2395: l2i
    //   2396: ldc_w -680776241
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 2428, -1617332832 -> 2384, 1540382830 -> 3636
    //   2428: aload_0
    //   2429: getstatic Perryc.1 : I
    //   2432: ifeq -> 2446
    //   2435: ldc2_w -2036063059
    //   2438: l2i
    //   2439: ldc_w 237623460
    //   2442: ixor
    //   2443: goto -> 2454
    //   2446: ldc2_w -395545412
    //   2449: l2i
    //   2450: ldc_w 977942794
    //   2453: ixor
    //   2454: ldc2_w 919101120
    //   2457: l2i
    //   2458: ldc_w -1715274462
    //   2461: ixor
    //   2462: ixor
    //   2463: lookupswitch default -> 3560, 663183339 -> 2446, 2100096596 -> 2488
    //   2488: getfield outlineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2491: getstatic Perryc.0 : I
    //   2494: ifle -> 2508
    //   2497: ldc2_w -1105023782
    //   2500: l2i
    //   2501: ldc_w -230727966
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -1232199269
    //   2511: l2i
    //   2512: ldc_w -1955271012
    //   2515: ixor
    //   2516: ldc2_w 1549443328
    //   2519: l2i
    //   2520: ldc_w 900357859
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 3550, 636292571 -> 2508, 1409954020 -> 2552
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokevirtual getValue : ()Ljava/lang/Object;
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: checkcast java/lang/Float
    //   2566: getstatic Perryc.c : I
    //   2569: iflt -> 2583
    //   2572: ldc2_w 328448061
    //   2575: l2i
    //   2576: ldc_w -1603725121
    //   2579: ixor
    //   2580: goto -> 2591
    //   2583: ldc2_w 618266783
    //   2586: l2i
    //   2587: ldc_w 613359393
    //   2590: ixor
    //   2591: ldc2_w -24529715
    //   2594: l2i
    //   2595: ldc_w 1766934251
    //   2598: ixor
    //   2599: ixor
    //   2600: lookupswitch default -> 3632, -1752306280 -> 2628, 606229156 -> 2583
    //   2628: goto -> 2632
    //   2631: athrow
    //   2632: invokevirtual floatValue : ()F
    //   2635: goto -> 2639
    //   2638: athrow
    //   2639: getstatic Perryc.1 : I
    //   2642: ifeq -> 2656
    //   2645: ldc2_w -1651953589
    //   2648: l2i
    //   2649: ldc_w 155929356
    //   2652: ixor
    //   2653: goto -> 2664
    //   2656: ldc2_w 863016878
    //   2659: l2i
    //   2660: ldc_w -42020367
    //   2663: ixor
    //   2664: ldc2_w -668822455
    //   2667: l2i
    //   2668: ldc_w 611022751
    //   2671: ixor
    //   2672: ixor
    //   2673: lookupswitch default -> 3538, 843556233 -> 2700, 1753979025 -> 2656
    //   2700: aload_0
    //   2701: getstatic Perryc.0 : I
    //   2704: ifle -> 2718
    //   2707: ldc2_w -991872011
    //   2710: l2i
    //   2711: ldc_w 508276161
    //   2714: ixor
    //   2715: goto -> 2726
    //   2718: ldc2_w -1586599251
    //   2721: l2i
    //   2722: ldc_w -620850445
    //   2725: ixor
    //   2726: ldc2_w 987275810
    //   2729: l2i
    //   2730: ldc_w -765320669
    //   2733: ixor
    //   2734: ixor
    //   2735: lookupswitch default -> 2760, -589033370 -> 2718, 839915061 -> 3570
    //   2760: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2763: getstatic Perryc.c : I
    //   2766: iflt -> 2780
    //   2769: ldc2_w -1326365521
    //   2772: l2i
    //   2773: ldc_w -1343522411
    //   2776: ixor
    //   2777: goto -> 2788
    //   2780: ldc2_w 588238027
    //   2783: l2i
    //   2784: ldc_w 1340946049
    //   2787: ixor
    //   2788: ldc2_w 2122463239
    //   2791: l2i
    //   2792: ldc_w -450035623
    //   2795: ixor
    //   2796: ixor
    //   2797: lookupswitch default -> 3606, -2068511388 -> 2780, -145898988 -> 2824
    //   2824: goto -> 2828
    //   2827: athrow
    //   2828: invokevirtual getValue : ()Ljava/lang/Object;
    //   2831: goto -> 2835
    //   2834: athrow
    //   2835: checkcast java/lang/Boolean
    //   2838: getstatic Perryc.0 : I
    //   2841: ifle -> 2855
    //   2844: ldc2_w -930957642
    //   2847: l2i
    //   2848: ldc_w 1892851399
    //   2851: ixor
    //   2852: goto -> 2863
    //   2855: ldc2_w -134255347
    //   2858: l2i
    //   2859: ldc_w -326447933
    //   2862: ixor
    //   2863: ldc2_w 957947350
    //   2866: l2i
    //   2867: ldc_w -670191393
    //   2870: ixor
    //   2871: ixor
    //   2872: lookupswitch default -> 3576, -94303033 -> 2900, 1497662840 -> 2855
    //   2900: goto -> 2904
    //   2903: athrow
    //   2904: invokevirtual booleanValue : ()Z
    //   2907: goto -> 2911
    //   2910: athrow
    //   2911: getstatic Perryc.0 : I
    //   2914: ifle -> 2928
    //   2917: ldc2_w 99671110
    //   2920: l2i
    //   2921: ldc_w -1579737893
    //   2924: ixor
    //   2925: goto -> 2936
    //   2928: ldc2_w 796599284
    //   2931: l2i
    //   2932: ldc_w -503895726
    //   2935: ixor
    //   2936: ldc2_w 1986994375
    //   2939: l2i
    //   2940: ldc_w -1673097560
    //   2943: ixor
    //   2944: ixor
    //   2945: lookupswitch default -> 2972, -1410512464 -> 2928, 1309568754 -> 3592
    //   2972: aload_0
    //   2973: getstatic Perryc.1 : I
    //   2976: ifeq -> 2990
    //   2979: ldc2_w -85855138
    //   2982: l2i
    //   2983: ldc_w -1257871510
    //   2986: ixor
    //   2987: goto -> 2998
    //   2990: ldc2_w 1752546526
    //   2993: l2i
    //   2994: ldc_w 15317336
    //   2997: ixor
    //   2998: ldc2_w -627797820
    //   3001: l2i
    //   3002: ldc_w 91862337
    //   3005: ixor
    //   3006: ixor
    //   3007: lookupswitch default -> 3032, -1878346063 -> 3580, 1187628973 -> 2990
    //   3032: getfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3035: getstatic Perryc.c : I
    //   3038: iflt -> 3052
    //   3041: ldc2_w 6735053
    //   3044: l2i
    //   3045: ldc_w 1281851289
    //   3048: ixor
    //   3049: goto -> 3060
    //   3052: ldc2_w 965306445
    //   3055: l2i
    //   3056: ldc_w -1787069818
    //   3059: ixor
    //   3060: ldc2_w 801403191
    //   3063: l2i
    //   3064: ldc_w -1831202571
    //   3067: ixor
    //   3068: ixor
    //   3069: lookupswitch default -> 3096, -1499791459 -> 3052, -249570666 -> 3620
    //   3096: goto -> 3100
    //   3099: athrow
    //   3100: invokevirtual getValue : ()Ljava/lang/Object;
    //   3103: goto -> 3107
    //   3106: athrow
    //   3107: checkcast java/lang/Boolean
    //   3110: getstatic Perryc.1 : I
    //   3113: ifeq -> 3127
    //   3116: ldc2_w 1631948330
    //   3119: l2i
    //   3120: ldc_w 701865098
    //   3123: ixor
    //   3124: goto -> 3135
    //   3127: ldc2_w -2054647937
    //   3130: l2i
    //   3131: ldc_w 2117487047
    //   3134: ixor
    //   3135: ldc2_w -132866685
    //   3138: l2i
    //   3139: ldc_w -741828336
    //   3142: ixor
    //   3143: ixor
    //   3144: lookupswitch default -> 3540, -798834133 -> 3172, 1665930803 -> 3127
    //   3172: goto -> 3176
    //   3175: athrow
    //   3176: invokevirtual booleanValue : ()Z
    //   3179: goto -> 3183
    //   3182: athrow
    //   3183: getstatic Perryc.1 : I
    //   3186: ifeq -> 3200
    //   3189: ldc2_w -822083415
    //   3192: l2i
    //   3193: ldc_w 1773904501
    //   3196: ixor
    //   3197: goto -> 3208
    //   3200: ldc2_w -1912319963
    //   3203: l2i
    //   3204: ldc_w -923958473
    //   3207: ixor
    //   3208: ldc2_w 78207865
    //   3211: l2i
    //   3212: ldc_w 482067011
    //   3215: ixor
    //   3216: ixor
    //   3217: lookupswitch default -> 3244, -1096205338 -> 3638, 1076805268 -> 3200
    //   3244: aload_0
    //   3245: getstatic Perryc.0 : I
    //   3248: ifle -> 3262
    //   3251: ldc2_w -69676917
    //   3254: l2i
    //   3255: ldc_w -996236471
    //   3258: ixor
    //   3259: goto -> 3270
    //   3262: ldc2_w 1978402326
    //   3265: l2i
    //   3266: ldc_w 907866808
    //   3269: ixor
    //   3270: ldc2_w -1816775649
    //   3273: l2i
    //   3274: ldc_w -488014796
    //   3277: ixor
    //   3278: ixor
    //   3279: lookupswitch default -> 3578, 850377861 -> 3304, 1310276585 -> 3262
    //   3304: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3307: getstatic Perryc.1 : I
    //   3310: ifeq -> 3324
    //   3313: ldc2_w -1472200765
    //   3316: l2i
    //   3317: ldc_w -95489140
    //   3320: ixor
    //   3321: goto -> 3332
    //   3324: ldc2_w 1335440792
    //   3327: l2i
    //   3328: ldc_w -738743019
    //   3331: ixor
    //   3332: ldc2_w 682186133
    //   3335: l2i
    //   3336: ldc_w 258786677
    //   3339: ixor
    //   3340: ixor
    //   3341: lookupswitch default -> 3368, 1286116400 -> 3324, 1974770863 -> 3588
    //   3368: goto -> 3372
    //   3371: athrow
    //   3372: invokevirtual getValue : ()Ljava/lang/Object;
    //   3375: goto -> 3379
    //   3378: athrow
    //   3379: checkcast java/lang/Integer
    //   3382: getstatic Perryc.c : I
    //   3385: iflt -> 3399
    //   3388: ldc2_w 1798038753
    //   3391: l2i
    //   3392: ldc_w -1661830617
    //   3395: ixor
    //   3396: goto -> 3407
    //   3399: ldc2_w -1211581344
    //   3402: l2i
    //   3403: ldc_w -1278856500
    //   3406: ixor
    //   3407: ldc2_w -1250888693
    //   3410: l2i
    //   3411: ldc_w -296589245
    //   3414: ixor
    //   3415: ixor
    //   3416: lookupswitch default -> 3618, -1392835954 -> 3399, 1596723940 -> 3444
    //   3444: goto -> 3448
    //   3447: athrow
    //   3448: invokevirtual intValue : ()I
    //   3451: goto -> 3455
    //   3454: athrow
    //   3455: ldc2_w -1334145454
    //   3458: l2i
    //   3459: ldc_w -1334145453
    //   3462: ixor
    //   3463: getstatic Perryc.c : I
    //   3466: iflt -> 3480
    //   3469: ldc2_w -890853502
    //   3472: l2i
    //   3473: ldc_w -787734175
    //   3476: ixor
    //   3477: goto -> 3488
    //   3480: ldc2_w 1221843861
    //   3483: l2i
    //   3484: ldc_w -545970211
    //   3487: ixor
    //   3488: ldc2_w 1730502226
    //   3491: l2i
    //   3492: ldc_w -1190546584
    //   3495: ixor
    //   3496: ixor
    //   3497: lookupswitch default -> 3524, -976852007 -> 3562, -412104434 -> 3480
    //   3524: goto -> 3528
    //   3527: athrow
    //   3528: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;ZLjava/awt/Color;FZZIZ)V
    //   3531: goto -> 3535
    //   3534: athrow
    //   3535: return
    //   3536: aconst_null
    //   3537: athrow
    //   3538: aconst_null
    //   3539: athrow
    //   3540: aconst_null
    //   3541: athrow
    //   3542: aconst_null
    //   3543: athrow
    //   3544: aconst_null
    //   3545: athrow
    //   3546: aconst_null
    //   3547: athrow
    //   3548: aconst_null
    //   3549: athrow
    //   3550: aconst_null
    //   3551: athrow
    //   3552: aconst_null
    //   3553: athrow
    //   3554: aconst_null
    //   3555: athrow
    //   3556: aconst_null
    //   3557: athrow
    //   3558: aconst_null
    //   3559: athrow
    //   3560: aconst_null
    //   3561: athrow
    //   3562: aconst_null
    //   3563: athrow
    //   3564: aconst_null
    //   3565: athrow
    //   3566: aconst_null
    //   3567: athrow
    //   3568: aconst_null
    //   3569: athrow
    //   3570: aconst_null
    //   3571: athrow
    //   3572: aconst_null
    //   3573: athrow
    //   3574: aconst_null
    //   3575: athrow
    //   3576: aconst_null
    //   3577: athrow
    //   3578: aconst_null
    //   3579: athrow
    //   3580: aconst_null
    //   3581: athrow
    //   3582: aconst_null
    //   3583: athrow
    //   3584: aconst_null
    //   3585: athrow
    //   3586: aconst_null
    //   3587: athrow
    //   3588: aconst_null
    //   3589: athrow
    //   3590: aconst_null
    //   3591: athrow
    //   3592: aconst_null
    //   3593: athrow
    //   3594: aconst_null
    //   3595: athrow
    //   3596: aconst_null
    //   3597: athrow
    //   3598: aconst_null
    //   3599: athrow
    //   3600: aconst_null
    //   3601: athrow
    //   3602: aconst_null
    //   3603: athrow
    //   3604: aconst_null
    //   3605: athrow
    //   3606: aconst_null
    //   3607: athrow
    //   3608: aconst_null
    //   3609: athrow
    //   3610: aconst_null
    //   3611: athrow
    //   3612: aconst_null
    //   3613: athrow
    //   3614: aconst_null
    //   3615: athrow
    //   3616: aconst_null
    //   3617: athrow
    //   3618: aconst_null
    //   3619: athrow
    //   3620: aconst_null
    //   3621: athrow
    //   3622: aconst_null
    //   3623: athrow
    //   3624: aconst_null
    //   3625: athrow
    //   3626: aconst_null
    //   3627: athrow
    //   3628: aconst_null
    //   3629: athrow
    //   3630: aconst_null
    //   3631: athrow
    //   3632: aconst_null
    //   3633: athrow
    //   3634: aconst_null
    //   3635: athrow
    //   3636: aconst_null
    //   3637: athrow
    //   3638: aconst_null
    //   3639: athrow
    //   3640: pop
    //   3641: goto -> 24
    //   3644: pop
    //   3645: aconst_null
    //   3646: goto -> 3640
    //   3649: dup
    //   3650: ifnull -> 3640
    //   3653: checkcast java/lang/Throwable
    //   3656: athrow
    //   3657: dup
    //   3658: ifnull -> 3644
    //   3661: checkcast java/lang/Throwable
    //   3664: athrow
    //   3665: aconst_null
    //   3666: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3512	0	this	Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;
    //   24	3512	1	pos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	3649	java/lang/ArrayIndexOutOfBoundsException
    //   268	274	274	finally
    //   268	274	274	finally
    //   268	274	274	finally
    //   268	274	3	finally
    //   268	274	274	java/lang/AssertionError
    //   339	346	346	finally
    //   340	346	339	java/lang/NullPointerException
    //   340	346	339	finally
    //   340	346	346	java/lang/UnsupportedOperationException
    //   340	346	339	finally
    //   527	534	534	finally
    //   527	534	534	java/lang/IllegalStateException
    //   527	534	527	finally
    //   528	534	534	finally
    //   528	534	3	finally
    //   599	606	606	finally
    //   599	606	599	java/lang/IndexOutOfBoundsException
    //   599	606	599	java/lang/UnsupportedOperationException
    //   599	606	606	java/lang/ClassCastException
    //   600	606	606	java/lang/UnsupportedOperationException
    //   787	794	794	finally
    //   787	794	787	java/lang/RuntimeException
    //   787	794	794	finally
    //   788	794	787	java/lang/IllegalArgumentException
    //   788	794	794	java/util/NoSuchElementException
    //   859	866	866	finally
    //   859	866	859	finally
    //   859	866	859	finally
    //   860	866	3	java/lang/IllegalStateException
    //   860	866	866	java/lang/UnsupportedOperationException
    //   1047	1054	1054	finally
    //   1047	1054	1047	java/lang/RuntimeException
    //   1048	1054	1054	java/lang/NumberFormatException
    //   1048	1054	1054	java/lang/IndexOutOfBoundsException
    //   1048	1054	1054	finally
    //   1119	1126	1126	finally
    //   1119	1126	1119	finally
    //   1119	1126	1126	finally
    //   1120	1126	1119	finally
    //   1120	1126	1119	java/lang/ArithmeticException
    //   1187	1194	1194	finally
    //   1187	1194	1187	java/lang/ArithmeticException
    //   1187	1194	1194	java/lang/AssertionError
    //   1187	1194	3	java/lang/IllegalArgumentException
    //   1188	1194	1194	java/lang/IllegalStateException
    //   1395	1402	1402	finally
    //   1395	1402	3	finally
    //   1395	1402	1402	finally
    //   1395	1402	1395	finally
    //   1396	1402	1402	finally
    //   1471	1478	1478	finally
    //   1471	1478	1471	finally
    //   1471	1478	1478	finally
    //   1472	1478	1471	finally
    //   1472	1478	1471	finally
    //   1667	1674	1674	finally
    //   1667	1674	1667	java/lang/ClassCastException
    //   1668	1674	1674	finally
    //   1668	1674	1667	finally
    //   1668	1674	1674	java/lang/NumberFormatException
    //   1744	1750	1750	finally
    //   1744	1750	1750	java/lang/IllegalStateException
    //   1744	1750	1750	java/lang/ClassCastException
    //   1744	1750	3	finally
    //   1744	1750	3	java/lang/UnsupportedOperationException
    //   1939	1946	1946	finally
    //   1939	1946	1946	java/lang/NullPointerException
    //   1939	1946	1939	finally
    //   1939	1946	1939	java/util/NoSuchElementException
    //   1940	1946	1946	finally
    //   2015	2022	2022	finally
    //   2015	2022	3	finally
    //   2015	2022	2022	finally
    //   2016	2022	2015	finally
    //   2016	2022	2022	java/lang/AssertionError
    //   2211	2218	2218	finally
    //   2211	2218	2218	java/lang/ArithmeticException
    //   2211	2218	2211	finally
    //   2211	2218	2218	java/lang/IndexOutOfBoundsException
    //   2212	2218	2218	finally
    //   2287	2294	2294	finally
    //   2287	2294	3	java/lang/IndexOutOfBoundsException
    //   2287	2294	3	java/lang/ClassCastException
    //   2287	2294	2287	java/lang/ClassCastException
    //   2287	2294	3	java/lang/UnsupportedOperationException
    //   2359	2366	2366	finally
    //   2359	2366	2359	java/lang/NumberFormatException
    //   2359	2366	3	java/lang/ClassCastException
    //   2360	2366	2359	finally
    //   2360	2366	3	finally
    //   2555	2562	2562	finally
    //   2555	2562	2555	finally
    //   2555	2562	3	finally
    //   2556	2562	2555	finally
    //   2556	2562	3	finally
    //   2632	2638	2638	finally
    //   2632	2638	2638	finally
    //   2632	2638	3	finally
    //   2632	2638	2638	finally
    //   2632	2638	2638	java/lang/IndexOutOfBoundsException
    //   2827	2834	2834	finally
    //   2828	2834	2834	java/lang/AssertionError
    //   2828	2834	2827	java/lang/EnumConstantNotPresentException
    //   2828	2834	2834	java/lang/ArithmeticException
    //   2828	2834	2834	java/lang/EnumConstantNotPresentException
    //   2904	2910	2910	finally
    //   2904	2910	2910	java/lang/EnumConstantNotPresentException
    //   2904	2910	3	finally
    //   2904	2910	3	java/lang/ArrayIndexOutOfBoundsException
    //   2904	2910	3	finally
    //   3099	3106	3106	finally
    //   3099	3106	3106	finally
    //   3099	3106	3099	java/lang/EnumConstantNotPresentException
    //   3099	3106	3	java/lang/RuntimeException
    //   3099	3106	3106	java/lang/IllegalStateException
    //   3175	3182	3182	finally
    //   3175	3182	3175	finally
    //   3175	3182	3175	finally
    //   3175	3182	3182	java/lang/EnumConstantNotPresentException
    //   3176	3182	3	java/lang/IndexOutOfBoundsException
    //   3371	3378	3378	finally
    //   3371	3378	3371	finally
    //   3371	3378	3371	finally
    //   3371	3378	3371	java/util/ConcurrentModificationException
    //   3372	3378	3	finally
    //   3447	3454	3454	finally
    //   3448	3454	3	java/lang/IllegalArgumentException
    //   3448	3454	3	java/lang/ArithmeticException
    //   3448	3454	3447	finally
    //   3448	3454	3447	finally
    //   3527	3534	3534	finally
    //   3527	3534	3527	java/lang/ClassCastException
    //   3527	3534	3	java/lang/AssertionError
    //   3528	3534	3	finally
    //   3528	3534	3527	java/util/ConcurrentModificationException
    //   3649	3657	3649	java/lang/IllegalArgumentException
    //   3665	3667	3	java/lang/ClassCastException
  }
  
  public BurrowESP() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1985501807
    //   9: l2i
    //   10: ldc_w 1885415936
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1358242936
    //   20: l2i
    //   21: ldc_w -1008051480
    //   24: ixor
    //   25: ldc2_w -1113720012
    //   28: l2i
    //   29: ldc_w 1079666901
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 8420, -1859710335 -> 60, 67181680 -> 17
    //   60: aload_0
    //   61: ldc_w 'ꐞ㌆ꑄ㶥Ꮄ䪗๜?蹓'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 826181020
    //   73: l2i
    //   74: ldc_w -187506900
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 2038317065
    //   84: l2i
    //   85: ldc_w 1979529377
    //   88: ixor
    //   89: ldc2_w -493926064
    //   92: l2i
    //   93: ldc_w 1230500608
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 8336, -1487158536 -> 124, 1848959200 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w 'ꐏ㌛ꑙ㶠Ꭸ䫀๰?蹥佊Ყਦ槦煮쮦㥍迟簥ꝯກ⯐侴亿'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w -868947017
    //   139: l2i
    //   140: ldc_w 85382444
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1879711934
    //   150: l2i
    //   151: ldc_w 489727283
    //   154: ixor
    //   155: ldc2_w -553523784
    //   158: l2i
    //   159: ldc_w -1009387614
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 8222, -705287039 -> 147, 1911461783 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 1276493385
    //   204: l2i
    //   205: ldc_w -120493839
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 812296185
    //   215: l2i
    //   216: ldc_w -477039495
    //   219: ixor
    //   220: ldc2_w -53738040
    //   223: l2i
    //   224: ldc_w 183259799
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 8246, 635045087 -> 256, 1122271719 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -743447348
    //   262: l2i
    //   263: ldc_w -743447347
    //   266: ixor
    //   267: ldc2_w -721033603
    //   270: l2i
    //   271: ldc_w -721033603
    //   274: ixor
    //   275: ldc2_w -51050445
    //   278: l2i
    //   279: ldc_w -51050445
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -1944768039
    //   292: l2i
    //   293: ldc_w 1556780807
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -931087832
    //   303: l2i
    //   304: ldc_w -1821259746
    //   307: ixor
    //   308: ldc2_w 516342611
    //   311: l2i
    //   312: ldc_w 242893880
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 8268, -1067245131 -> 300, 1263400285 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 869709583
    //   356: l2i
    //   357: ldc_w -2004387515
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1368041462
    //   367: l2i
    //   368: ldc_w 2089369332
    //   371: ixor
    //   372: ldc2_w -2001223063
    //   375: l2i
    //   376: ldc_w 1736990815
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -902552845 -> 364, 1416522876 -> 8230
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w -1271075887
    //   418: l2i
    //   419: ldc_w -103385785
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 18343298
    //   429: l2i
    //   430: ldc_w 1457868598
    //   433: ixor
    //   434: ldc2_w 2107575458
    //   437: l2i
    //   438: ldc_w -1072871053
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1315030594 -> 426, -260515001 -> 8424
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w 'ꐒ㌒ꑛ㶲'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 693973442
    //   485: l2i
    //   486: ldc_w -716801383
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -2121854676
    //   496: l2i
    //   497: ldc_w -1770280669
    //   500: ixor
    //   501: ldc2_w 453667947
    //   504: l2i
    //   505: ldc_w -123207224
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 8330, -195111508 -> 536, 532227832 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 166472155
    //   542: l2i
    //   543: ldc_w 166472154
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w -1819338746
    //   556: l2i
    //   557: ldc_w 1820700800
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1022866768
    //   567: l2i
    //   568: ldc_w 151646771
    //   571: ixor
    //   572: ldc2_w 1405669808
    //   575: l2i
    //   576: ldc_w -1968464076
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 8224, -325252633 -> 608, 644474370 -> 564
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.0 : I
    //   614: ifle -> 628
    //   617: ldc2_w 510634615
    //   620: l2i
    //   621: ldc_w -303398054
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w -1437935212
    //   631: l2i
    //   632: ldc_w -792129291
    //   635: ixor
    //   636: ldc2_w -1263293980
    //   639: l2i
    //   640: ldc_w -2060792220
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 672, -1038332243 -> 8384, -234282986 -> 628
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w -96446554
    //   684: l2i
    //   685: ldc_w 412307336
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 405669717
    //   695: l2i
    //   696: ldc_w 2108814833
    //   699: ixor
    //   700: ldc2_w 1978538237
    //   703: l2i
    //   704: ldc_w 1995644933
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 8294, -506584874 -> 692, 1719847516 -> 736
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w -1966666284
    //   748: l2i
    //   749: ldc_w 125458313
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 1763115661
    //   759: l2i
    //   760: ldc_w -840960969
    //   763: ixor
    //   764: ldc2_w -433452694
    //   767: l2i
    //   768: ldc_w 835844653
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 8374, 1514580250 -> 756, 1932723709 -> 800
    //   800: putfield name : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w -2023607790
    //   812: l2i
    //   813: ldc_w -1518339683
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 1139724250
    //   823: l2i
    //   824: ldc_w 2080336563
    //   827: ixor
    //   828: ldc2_w 2023622220
    //   831: l2i
    //   832: ldc_w -598852203
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 8264, -2033323946 -> 820, -1665032528 -> 864
    //   864: aload_0
    //   865: new bigname/zprestige/webhack/features/setting/Setting
    //   868: dup
    //   869: ldc_w 'ꐞ㌜ꑎ'
    //   872: getstatic Perryc.1 : I
    //   875: ifeq -> 889
    //   878: ldc2_w 1534449615
    //   881: l2i
    //   882: ldc_w 2103185979
    //   885: ixor
    //   886: goto -> 897
    //   889: ldc2_w -232425212
    //   892: l2i
    //   893: ldc_w 1793879824
    //   896: ixor
    //   897: ldc2_w -1917634282
    //   900: l2i
    //   901: ldc_w -1638224604
    //   904: ixor
    //   905: ixor
    //   906: lookupswitch default -> 932, -464310508 -> 889, 901796294 -> 8390
    //   932: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   935: ldc2_w -465691557
    //   938: l2i
    //   939: ldc_w -465691558
    //   942: ixor
    //   943: getstatic Perryc.c : I
    //   946: iflt -> 960
    //   949: ldc2_w 972702534
    //   952: l2i
    //   953: ldc_w -840116284
    //   956: ixor
    //   957: goto -> 968
    //   960: ldc2_w 504654897
    //   963: l2i
    //   964: ldc_w 1699886917
    //   967: ixor
    //   968: ldc2_w -768897976
    //   971: l2i
    //   972: ldc_w -495682152
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 8412, -1001822894 -> 960, 1259973284 -> 1004
    //   1004: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1007: getstatic Perryc.1 : I
    //   1010: ifeq -> 1024
    //   1013: ldc2_w -774945140
    //   1016: l2i
    //   1017: ldc_w 1497948628
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w 1195731363
    //   1027: l2i
    //   1028: ldc_w -2050341344
    //   1031: ixor
    //   1032: ldc2_w -2146422664
    //   1035: l2i
    //   1036: ldc_w -286339992
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 1068, -532651086 -> 1024, -428254392 -> 8438
    //   1068: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1071: getstatic Perryc.1 : I
    //   1074: ifeq -> 1088
    //   1077: ldc2_w 1573734643
    //   1080: l2i
    //   1081: ldc_w -1501663907
    //   1084: ixor
    //   1085: goto -> 1096
    //   1088: ldc2_w -1571082848
    //   1091: l2i
    //   1092: ldc_w 1269529981
    //   1095: ixor
    //   1096: ldc2_w -2119662815
    //   1099: l2i
    //   1100: ldc_w -501774845
    //   1103: ixor
    //   1104: ixor
    //   1105: lookupswitch default -> 1132, -1744035700 -> 8298, 1979203025 -> 1088
    //   1132: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1135: getstatic Perryc.c : I
    //   1138: iflt -> 1152
    //   1141: ldc2_w 2055007329
    //   1144: l2i
    //   1145: ldc_w -1753482758
    //   1148: ixor
    //   1149: goto -> 1160
    //   1152: ldc2_w 594131084
    //   1155: l2i
    //   1156: ldc_w -15447135
    //   1159: ixor
    //   1160: ldc2_w 97384969
    //   1163: l2i
    //   1164: ldc_w 831786584
    //   1167: ixor
    //   1168: ixor
    //   1169: lookupswitch default -> 1196, -648093238 -> 8266, 505019822 -> 1152
    //   1196: aload_0
    //   1197: getstatic Perryc.0 : I
    //   1200: ifle -> 1214
    //   1203: ldc2_w 179045646
    //   1206: l2i
    //   1207: ldc_w -1837655607
    //   1210: ixor
    //   1211: goto -> 1222
    //   1214: ldc2_w 1510502283
    //   1217: l2i
    //   1218: ldc_w 1638991322
    //   1221: ixor
    //   1222: ldc2_w 999137721
    //   1225: l2i
    //   1226: ldc_w 1058187737
    //   1229: ixor
    //   1230: ixor
    //   1231: lookupswitch default -> 1256, -1673227097 -> 8290, -783426270 -> 1214
    //   1256: aload_0
    //   1257: new bigname/zprestige/webhack/features/setting/Setting
    //   1260: dup
    //   1261: ldc_w 'ꐞ㌜ꑎ㶅Ꮎ䪄'
    //   1264: getstatic Perryc.c : I
    //   1267: iflt -> 1281
    //   1270: ldc2_w -1276512714
    //   1273: l2i
    //   1274: ldc_w -2073386735
    //   1277: ixor
    //   1278: goto -> 1289
    //   1281: ldc2_w -258536959
    //   1284: l2i
    //   1285: ldc_w 1073771295
    //   1288: ixor
    //   1289: ldc2_w 815269771
    //   1292: l2i
    //   1293: ldc_w 830496721
    //   1296: ixor
    //   1297: ixor
    //   1298: lookupswitch default -> 1324, 554087048 -> 1281, 916131709 -> 8342
    //   1324: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1327: ldc2_w -1501421245
    //   1330: l2i
    //   1331: ldc_w -1501421124
    //   1334: ixor
    //   1335: getstatic Perryc.0 : I
    //   1338: ifle -> 1352
    //   1341: ldc2_w -1044743144
    //   1344: l2i
    //   1345: ldc_w -1817603964
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w 1952907296
    //   1355: l2i
    //   1356: ldc_w -1291887981
    //   1359: ixor
    //   1360: ldc2_w -700600350
    //   1363: l2i
    //   1364: ldc_w 1656278120
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 1396, -426340586 -> 8260, 1049323137 -> 1352
    //   1396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1399: ldc2_w 351940912
    //   1402: l2i
    //   1403: ldc_w 351940912
    //   1406: ixor
    //   1407: getstatic Perryc.0 : I
    //   1410: ifle -> 1424
    //   1413: ldc2_w 772383431
    //   1416: l2i
    //   1417: ldc_w -645894380
    //   1420: ixor
    //   1421: goto -> 1432
    //   1424: ldc2_w 2128161785
    //   1427: l2i
    //   1428: ldc_w -852655600
    //   1431: ixor
    //   1432: ldc2_w -1223377074
    //   1435: l2i
    //   1436: ldc_w -1742313749
    //   1439: ixor
    //   1440: ixor
    //   1441: lookupswitch default -> 8248, -1664716724 -> 1468, -658828170 -> 1424
    //   1468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1471: ldc2_w 1926874124
    //   1474: l2i
    //   1475: ldc_w 1926874355
    //   1478: ixor
    //   1479: getstatic Perryc.1 : I
    //   1482: ifeq -> 1496
    //   1485: ldc2_w 1346068616
    //   1488: l2i
    //   1489: ldc_w -1618401807
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w 1115597985
    //   1499: l2i
    //   1500: ldc_w -1779480669
    //   1503: ixor
    //   1504: ldc2_w 1926244981
    //   1507: l2i
    //   1508: ldc_w 417691160
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 1540, -1517872876 -> 8376, -132000603 -> 1496
    //   1540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1543: getstatic Perryc.0 : I
    //   1546: ifle -> 1560
    //   1549: ldc2_w -1351186712
    //   1552: l2i
    //   1553: ldc_w -1352120387
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w 557886607
    //   1563: l2i
    //   1564: ldc_w 1504653778
    //   1567: ixor
    //   1568: ldc2_w 1015117980
    //   1571: l2i
    //   1572: ldc_w 266354948
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 8262, 864024781 -> 1560, 1267639493 -> 1604
    //   1604: aload_0
    //   1605: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   1610: getstatic Perryc.1 : I
    //   1613: ifeq -> 1627
    //   1616: ldc2_w 896895680
    //   1619: l2i
    //   1620: ldc_w -349379900
    //   1623: ixor
    //   1624: goto -> 1635
    //   1627: ldc2_w 2105361296
    //   1630: l2i
    //   1631: ldc_w -1237115804
    //   1634: ixor
    //   1635: ldc2_w -1036792616
    //   1638: l2i
    //   1639: ldc_w 1312600959
    //   1642: ixor
    //   1643: ixor
    //   1644: lookupswitch default -> 8378, 1194401875 -> 1672, 1381373859 -> 1627
    //   1672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1675: getstatic Perryc.0 : I
    //   1678: ifle -> 1692
    //   1681: ldc2_w -1565364853
    //   1684: l2i
    //   1685: ldc_w -245496032
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w -1734614025
    //   1695: l2i
    //   1696: ldc_w -1657411358
    //   1699: ixor
    //   1700: ldc2_w 252150024
    //   1703: l2i
    //   1704: ldc_w 1076973681
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 1736, 484096978 -> 8356, 531317210 -> 1692
    //   1736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1739: getstatic Perryc.1 : I
    //   1742: ifeq -> 1756
    //   1745: ldc2_w 961437817
    //   1748: l2i
    //   1749: ldc_w 290266151
    //   1752: ixor
    //   1753: goto -> 1764
    //   1756: ldc2_w -876715932
    //   1759: l2i
    //   1760: ldc_w 1109753846
    //   1763: ixor
    //   1764: ldc2_w 912826929
    //   1767: l2i
    //   1768: ldc_w 448387848
    //   1771: ixor
    //   1772: ixor
    //   1773: lookupswitch default -> 1800, -1437613666 -> 1756, 80872807 -> 8344
    //   1800: putfield boxRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1803: getstatic Perryc.c : I
    //   1806: iflt -> 1820
    //   1809: ldc2_w -1254180059
    //   1812: l2i
    //   1813: ldc_w 905114578
    //   1816: ixor
    //   1817: goto -> 1828
    //   1820: ldc2_w 1585915948
    //   1823: l2i
    //   1824: ldc_w -2014756600
    //   1827: ixor
    //   1828: ldc2_w 1383263791
    //   1831: l2i
    //   1832: ldc_w -1011913620
    //   1835: ixor
    //   1836: ixor
    //   1837: lookupswitch default -> 1864, -816413140 -> 1820, 286378676 -> 8440
    //   1864: aload_0
    //   1865: getstatic Perryc.1 : I
    //   1868: ifeq -> 1882
    //   1871: ldc2_w 119787567
    //   1874: l2i
    //   1875: ldc_w 1139454444
    //   1878: ixor
    //   1879: goto -> 1890
    //   1882: ldc2_w 697915866
    //   1885: l2i
    //   1886: ldc_w -509403750
    //   1889: ixor
    //   1890: ldc2_w -1197699644
    //   1893: l2i
    //   1894: ldc_w -2059327643
    //   1897: ixor
    //   1898: ixor
    //   1899: lookupswitch default -> 1924, -1509962236 -> 1882, 2031405922 -> 8432
    //   1924: aload_0
    //   1925: new bigname/zprestige/webhack/features/setting/Setting
    //   1928: dup
    //   1929: ldc_w 'ꐞ㌜ꑎ㶐Ꭹ䪅๼?'
    //   1932: getstatic Perryc.0 : I
    //   1935: ifle -> 1949
    //   1938: ldc2_w -282024641
    //   1941: l2i
    //   1942: ldc_w 1858568088
    //   1945: ixor
    //   1946: goto -> 1957
    //   1949: ldc2_w 85027987
    //   1952: l2i
    //   1953: ldc_w -582041136
    //   1956: ixor
    //   1957: ldc2_w -214497299
    //   1960: l2i
    //   1961: ldc_w -589182710
    //   1964: ixor
    //   1965: ixor
    //   1966: lookupswitch default -> 1992, -1373563840 -> 8434, 1022847196 -> 1949
    //   1992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1995: ldc2_w -1728143227
    //   1998: l2i
    //   1999: ldc_w -1728143238
    //   2002: ixor
    //   2003: getstatic Perryc.1 : I
    //   2006: ifeq -> 2020
    //   2009: ldc2_w 1970453361
    //   2012: l2i
    //   2013: ldc_w -1223829922
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 196786541
    //   2023: l2i
    //   2024: ldc_w -776851824
    //   2027: ixor
    //   2028: ldc2_w 1763541287
    //   2031: l2i
    //   2032: ldc_w -2087335519
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2064, -1547054624 -> 2020, 687285673 -> 8338
    //   2064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2067: ldc2_w 2086691941
    //   2070: l2i
    //   2071: ldc_w 2086691941
    //   2074: ixor
    //   2075: getstatic Perryc.0 : I
    //   2078: ifle -> 2092
    //   2081: ldc2_w -400657172
    //   2084: l2i
    //   2085: ldc_w 477903738
    //   2088: ixor
    //   2089: goto -> 2100
    //   2092: ldc2_w -1296863418
    //   2095: l2i
    //   2096: ldc_w -396718177
    //   2099: ixor
    //   2100: ldc2_w 749895281
    //   2103: l2i
    //   2104: ldc_w 980465653
    //   2107: ixor
    //   2108: ixor
    //   2109: lookupswitch default -> 2136, -492796398 -> 8386, 946619387 -> 2092
    //   2136: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2139: ldc2_w 1286714347
    //   2142: l2i
    //   2143: ldc_w 1286714132
    //   2146: ixor
    //   2147: getstatic Perryc.0 : I
    //   2150: ifle -> 2164
    //   2153: ldc2_w -69641062
    //   2156: l2i
    //   2157: ldc_w -1989625228
    //   2160: ixor
    //   2161: goto -> 2172
    //   2164: ldc2_w -100978672
    //   2167: l2i
    //   2168: ldc_w 1799149197
    //   2171: ixor
    //   2172: ldc2_w 3223293
    //   2175: l2i
    //   2176: ldc_w -1583336760
    //   2179: ixor
    //   2180: ixor
    //   2181: lookupswitch default -> 8238, -752813349 -> 2164, 861338280 -> 2208
    //   2208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2211: getstatic Perryc.1 : I
    //   2214: ifeq -> 2228
    //   2217: ldc2_w 1487367762
    //   2220: l2i
    //   2221: ldc_w 1702798429
    //   2224: ixor
    //   2225: goto -> 2236
    //   2228: ldc2_w -590059196
    //   2231: l2i
    //   2232: ldc_w -25798712
    //   2235: ixor
    //   2236: ldc2_w -1777640599
    //   2239: l2i
    //   2240: ldc_w 299255907
    //   2243: ixor
    //   2244: ixor
    //   2245: lookupswitch default -> 2272, -1174087419 -> 8370, 984798643 -> 2228
    //   2272: aload_0
    //   2273: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   2278: getstatic Perryc.0 : I
    //   2281: ifle -> 2295
    //   2284: ldc2_w 1673319103
    //   2287: l2i
    //   2288: ldc_w 627051370
    //   2291: ixor
    //   2292: goto -> 2303
    //   2295: ldc2_w -1006597467
    //   2298: l2i
    //   2299: ldc_w -1404523341
    //   2302: ixor
    //   2303: ldc2_w -138948800
    //   2306: l2i
    //   2307: ldc_w 892255131
    //   2310: ixor
    //   2311: ixor
    //   2312: lookupswitch default -> 8300, -2075808498 -> 2295, -1429122355 -> 2340
    //   2340: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2343: getstatic Perryc.0 : I
    //   2346: ifle -> 2360
    //   2349: ldc2_w 388760689
    //   2352: l2i
    //   2353: ldc_w 1936831056
    //   2356: ixor
    //   2357: goto -> 2368
    //   2360: ldc2_w 1912078272
    //   2363: l2i
    //   2364: ldc_w -1527157329
    //   2367: ixor
    //   2368: ldc2_w 2033939683
    //   2371: l2i
    //   2372: ldc_w -25393117
    //   2375: ixor
    //   2376: ixor
    //   2377: lookupswitch default -> 8436, -484816159 -> 2360, 1380544175 -> 2404
    //   2404: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2407: getstatic Perryc.0 : I
    //   2410: ifle -> 2424
    //   2413: ldc2_w -1388222066
    //   2416: l2i
    //   2417: ldc_w 617319409
    //   2420: ixor
    //   2421: goto -> 2432
    //   2424: ldc2_w -1791122297
    //   2427: l2i
    //   2428: ldc_w -485328449
    //   2431: ixor
    //   2432: ldc2_w -2073993651
    //   2435: l2i
    //   2436: ldc_w 1753697244
    //   2439: ixor
    //   2440: ixor
    //   2441: lookupswitch default -> 2468, 1701640174 -> 8400, 1983733261 -> 2424
    //   2468: putfield boxGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2471: getstatic Perryc.c : I
    //   2474: iflt -> 2488
    //   2477: ldc2_w -786654238
    //   2480: l2i
    //   2481: ldc_w -318027158
    //   2484: ixor
    //   2485: goto -> 2496
    //   2488: ldc2_w 974393251
    //   2491: l2i
    //   2492: ldc_w -1648551139
    //   2495: ixor
    //   2496: ldc2_w 454784641
    //   2499: l2i
    //   2500: ldc_w -921163310
    //   2503: ixor
    //   2504: ixor
    //   2505: lookupswitch default -> 2532, -300642597 -> 8394, 1283626597 -> 2488
    //   2532: aload_0
    //   2533: getstatic Perryc.0 : I
    //   2536: ifle -> 2550
    //   2539: ldc2_w -475146023
    //   2542: l2i
    //   2543: ldc_w -131834163
    //   2546: ixor
    //   2547: goto -> 2558
    //   2550: ldc2_w 141273882
    //   2553: l2i
    //   2554: ldc_w 1185489319
    //   2557: ixor
    //   2558: ldc2_w -218294228
    //   2561: l2i
    //   2562: ldc_w -1287752031
    //   2565: ixor
    //   2566: ixor
    //   2567: lookupswitch default -> 8198, 251782192 -> 2592, 1514858649 -> 2550
    //   2592: aload_0
    //   2593: new bigname/zprestige/webhack/features/setting/Setting
    //   2596: dup
    //   2597: ldc_w 'ꐞ㌜ꑎ㶕Ꮇ䪕๼'
    //   2600: getstatic Perryc.0 : I
    //   2603: ifle -> 2617
    //   2606: ldc2_w 1851912951
    //   2609: l2i
    //   2610: ldc_w -874556842
    //   2613: ixor
    //   2614: goto -> 2625
    //   2617: ldc2_w 1334550105
    //   2620: l2i
    //   2621: ldc_w -1813664228
    //   2624: ixor
    //   2625: ldc2_w 594467238
    //   2628: l2i
    //   2629: ldc_w -790867251
    //   2632: ixor
    //   2633: ixor
    //   2634: lookupswitch default -> 2660, -292027023 -> 2617, 1443638218 -> 8236
    //   2660: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2663: ldc2_w -115602219
    //   2666: l2i
    //   2667: ldc_w -115602390
    //   2670: ixor
    //   2671: getstatic Perryc.1 : I
    //   2674: ifeq -> 2688
    //   2677: ldc2_w 871262441
    //   2680: l2i
    //   2681: ldc_w 1496510585
    //   2684: ixor
    //   2685: goto -> 2696
    //   2688: ldc2_w 1743658149
    //   2691: l2i
    //   2692: ldc_w -1734580042
    //   2695: ixor
    //   2696: ldc2_w 859700867
    //   2699: l2i
    //   2700: ldc_w 443745973
    //   2703: ixor
    //   2704: ixor
    //   2705: lookupswitch default -> 8396, -700675035 -> 2732, 1133666470 -> 2688
    //   2732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2735: ldc2_w 2016214538
    //   2738: l2i
    //   2739: ldc_w 2016214538
    //   2742: ixor
    //   2743: getstatic Perryc.c : I
    //   2746: iflt -> 2760
    //   2749: ldc2_w 90572841
    //   2752: l2i
    //   2753: ldc_w -2101126905
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w 1632293216
    //   2763: l2i
    //   2764: ldc_w -1661575108
    //   2767: ixor
    //   2768: ldc2_w 811638559
    //   2771: l2i
    //   2772: ldc_w -1074219721
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 8296, 138246918 -> 2760, 1915001716 -> 2804
    //   2804: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2807: ldc2_w 1330614446
    //   2810: l2i
    //   2811: ldc_w 1330614353
    //   2814: ixor
    //   2815: getstatic Perryc.c : I
    //   2818: iflt -> 2832
    //   2821: ldc2_w 543473659
    //   2824: l2i
    //   2825: ldc_w 1882568472
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -441788625
    //   2835: l2i
    //   2836: ldc_w -764675976
    //   2839: ixor
    //   2840: ldc2_w -193740875
    //   2843: l2i
    //   2844: ldc_w -1755524079
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 2876, -1605663882 -> 2832, 863920967 -> 8256
    //   2876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2879: getstatic Perryc.c : I
    //   2882: iflt -> 2896
    //   2885: ldc2_w -2138377742
    //   2888: l2i
    //   2889: ldc_w 268937214
    //   2892: ixor
    //   2893: goto -> 2904
    //   2896: ldc2_w -1863053409
    //   2899: l2i
    //   2900: ldc_w 467954165
    //   2903: ixor
    //   2904: ldc2_w -818297064
    //   2907: l2i
    //   2908: ldc_w 6578030
    //   2911: ixor
    //   2912: ixor
    //   2913: lookupswitch default -> 8332, 1145962012 -> 2940, 1607519866 -> 2896
    //   2940: aload_0
    //   2941: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   2946: getstatic Perryc.c : I
    //   2949: iflt -> 2963
    //   2952: ldc2_w -1091714156
    //   2955: l2i
    //   2956: ldc_w -839265216
    //   2959: ixor
    //   2960: goto -> 2971
    //   2963: ldc2_w -1461719312
    //   2966: l2i
    //   2967: ldc_w 1408244919
    //   2970: ixor
    //   2971: ldc2_w 1319561442
    //   2974: l2i
    //   2975: ldc_w -658707826
    //   2978: ixor
    //   2979: ixor
    //   2980: lookupswitch default -> 8288, -452061768 -> 2963, 1832251435 -> 3008
    //   3008: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3011: getstatic Perryc.1 : I
    //   3014: ifeq -> 3028
    //   3017: ldc2_w -711919002
    //   3020: l2i
    //   3021: ldc_w -47130834
    //   3024: ixor
    //   3025: goto -> 3036
    //   3028: ldc2_w 2026812155
    //   3031: l2i
    //   3032: ldc_w 1189782187
    //   3035: ixor
    //   3036: ldc2_w 1174812354
    //   3039: l2i
    //   3040: ldc_w -909492599
    //   3043: ixor
    //   3044: ixor
    //   3045: lookupswitch default -> 3072, -1843613364 -> 3028, -1486084861 -> 8350
    //   3072: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3075: getstatic Perryc.c : I
    //   3078: iflt -> 3092
    //   3081: ldc2_w -1508041688
    //   3084: l2i
    //   3085: ldc_w -361863452
    //   3088: ixor
    //   3089: goto -> 3100
    //   3092: ldc2_w 453200965
    //   3095: l2i
    //   3096: ldc_w -1409454314
    //   3099: ixor
    //   3100: ldc2_w -247409595
    //   3103: l2i
    //   3104: ldc_w -2138352746
    //   3107: ixor
    //   3108: ixor
    //   3109: lookupswitch default -> 3136, 1035533599 -> 8324, 1314688087 -> 3092
    //   3136: putfield boxBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3139: getstatic Perryc.0 : I
    //   3142: ifle -> 3156
    //   3145: ldc2_w -1897246895
    //   3148: l2i
    //   3149: ldc_w 1285964067
    //   3152: ixor
    //   3153: goto -> 3164
    //   3156: ldc2_w 1819244571
    //   3159: l2i
    //   3160: ldc_w 1981293300
    //   3163: ixor
    //   3164: ldc2_w 919119440
    //   3167: l2i
    //   3168: ldc_w -23178006
    //   3171: ixor
    //   3172: ixor
    //   3173: lookupswitch default -> 3200, -793685433 -> 3156, 169540808 -> 8340
    //   3200: aload_0
    //   3201: getstatic Perryc.1 : I
    //   3204: ifeq -> 3218
    //   3207: ldc2_w 1574536783
    //   3210: l2i
    //   3211: ldc_w -528292235
    //   3214: ixor
    //   3215: goto -> 3226
    //   3218: ldc2_w 107268476
    //   3221: l2i
    //   3222: ldc_w -1511351018
    //   3225: ixor
    //   3226: ldc2_w -109837325
    //   3229: l2i
    //   3230: ldc_w 198237216
    //   3233: ixor
    //   3234: ixor
    //   3235: lookupswitch default -> 3260, 1342160873 -> 8422, 1432251067 -> 3218
    //   3260: aload_0
    //   3261: new bigname/zprestige/webhack/features/setting/Setting
    //   3264: dup
    //   3265: ldc_w 'ꐞ㌜ꑎ㶖Ꮇ䪐๱?'
    //   3268: getstatic Perryc.c : I
    //   3271: iflt -> 3285
    //   3274: ldc2_w -500056769
    //   3277: l2i
    //   3278: ldc_w -295026327
    //   3281: ixor
    //   3282: goto -> 3293
    //   3285: ldc2_w -865539509
    //   3288: l2i
    //   3289: ldc_w -662644628
    //   3292: ixor
    //   3293: ldc2_w -705769919
    //   3296: l2i
    //   3297: ldc_w 427988496
    //   3300: ixor
    //   3301: ixor
    //   3302: lookupswitch default -> 8216, -1070095353 -> 3285, -662410634 -> 3328
    //   3328: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3331: ldc2_w 649208592
    //   3334: l2i
    //   3335: ldc_w 649208687
    //   3338: ixor
    //   3339: getstatic Perryc.c : I
    //   3342: iflt -> 3356
    //   3345: ldc2_w -1769746008
    //   3348: l2i
    //   3349: ldc_w -334989803
    //   3352: ixor
    //   3353: goto -> 3364
    //   3356: ldc2_w 1878065164
    //   3359: l2i
    //   3360: ldc_w 1021119831
    //   3363: ixor
    //   3364: ldc2_w 792610337
    //   3367: l2i
    //   3368: ldc_w -494739657
    //   3371: ixor
    //   3372: ixor
    //   3373: lookupswitch default -> 8428, -1634692019 -> 3400, -1221116245 -> 3356
    //   3400: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3403: ldc2_w 723055229
    //   3406: l2i
    //   3407: ldc_w 723055229
    //   3410: ixor
    //   3411: getstatic Perryc.c : I
    //   3414: iflt -> 3428
    //   3417: ldc2_w -102741301
    //   3420: l2i
    //   3421: ldc_w 911969620
    //   3424: ixor
    //   3425: goto -> 3436
    //   3428: ldc2_w -884268543
    //   3431: l2i
    //   3432: ldc_w -1184512576
    //   3435: ixor
    //   3436: ldc2_w -718942146
    //   3439: l2i
    //   3440: ldc_w -794599721
    //   3443: ixor
    //   3444: ixor
    //   3445: lookupswitch default -> 8430, -901953162 -> 3428, 2007525672 -> 3472
    //   3472: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3475: ldc2_w -975813469
    //   3478: l2i
    //   3479: ldc_w -975813540
    //   3482: ixor
    //   3483: getstatic Perryc.c : I
    //   3486: iflt -> 3500
    //   3489: ldc2_w -7064723
    //   3492: l2i
    //   3493: ldc_w -287027829
    //   3496: ixor
    //   3497: goto -> 3508
    //   3500: ldc2_w -1724161594
    //   3503: l2i
    //   3504: ldc_w 412034271
    //   3507: ixor
    //   3508: ldc2_w 295330356
    //   3511: l2i
    //   3512: ldc_w 426265418
    //   3515: ixor
    //   3516: ixor
    //   3517: lookupswitch default -> 8360, -1991873433 -> 3544, 427972504 -> 3500
    //   3544: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3547: getstatic Perryc.1 : I
    //   3550: ifeq -> 3564
    //   3553: ldc2_w 1963392511
    //   3556: l2i
    //   3557: ldc_w -382549857
    //   3560: ixor
    //   3561: goto -> 3572
    //   3564: ldc2_w -1096401954
    //   3567: l2i
    //   3568: ldc_w 630468343
    //   3571: ixor
    //   3572: ldc2_w 573078226
    //   3575: l2i
    //   3576: ldc_w -285274034
    //   3579: ixor
    //   3580: ixor
    //   3581: lookupswitch default -> 3608, 1357076476 -> 8200, 1539825173 -> 3564
    //   3608: aload_0
    //   3609: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   3614: getstatic Perryc.c : I
    //   3617: iflt -> 3631
    //   3620: ldc2_w -1372633472
    //   3623: l2i
    //   3624: ldc_w -739929832
    //   3627: ixor
    //   3628: goto -> 3639
    //   3631: ldc2_w -182932459
    //   3634: l2i
    //   3635: ldc_w -795471340
    //   3638: ixor
    //   3639: ldc2_w 295714769
    //   3642: l2i
    //   3643: ldc_w -688674517
    //   3646: ixor
    //   3647: ixor
    //   3648: lookupswitch default -> 8354, -1164361374 -> 3631, -488822533 -> 3676
    //   3676: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3679: getstatic Perryc.1 : I
    //   3682: ifeq -> 3696
    //   3685: ldc2_w 200324549
    //   3688: l2i
    //   3689: ldc_w 547796149
    //   3692: ixor
    //   3693: goto -> 3704
    //   3696: ldc2_w 1302841001
    //   3699: l2i
    //   3700: ldc_w -1692710254
    //   3703: ixor
    //   3704: ldc2_w -2034816594
    //   3707: l2i
    //   3708: ldc_w 382408007
    //   3711: ixor
    //   3712: ixor
    //   3713: lookupswitch default -> 8212, -1154859623 -> 3696, 1187033298 -> 3740
    //   3740: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3743: getstatic Perryc.c : I
    //   3746: iflt -> 3760
    //   3749: ldc2_w 1240226056
    //   3752: l2i
    //   3753: ldc_w -881249580
    //   3756: ixor
    //   3757: goto -> 3768
    //   3760: ldc2_w -851040517
    //   3763: l2i
    //   3764: ldc_w 711279150
    //   3767: ixor
    //   3768: ldc2_w 1018058945
    //   3771: l2i
    //   3772: ldc_w -1724194856
    //   3775: ixor
    //   3776: ixor
    //   3777: lookupswitch default -> 8358, 654437573 -> 3760, 1119347660 -> 3804
    //   3804: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3807: getstatic Perryc.c : I
    //   3810: iflt -> 3824
    //   3813: ldc2_w -92362374
    //   3816: l2i
    //   3817: ldc_w -1525859513
    //   3820: ixor
    //   3821: goto -> 3832
    //   3824: ldc2_w 700797794
    //   3827: l2i
    //   3828: ldc_w 999380687
    //   3831: ixor
    //   3832: ldc2_w 219615722
    //   3835: l2i
    //   3836: ldc_w -1010918603
    //   3839: ixor
    //   3840: ixor
    //   3841: lookupswitch default -> 8272, -1847977758 -> 3824, -587362446 -> 3868
    //   3868: aload_0
    //   3869: getstatic Perryc.1 : I
    //   3872: ifeq -> 3886
    //   3875: ldc2_w 989049310
    //   3878: l2i
    //   3879: ldc_w -972304087
    //   3882: ixor
    //   3883: goto -> 3894
    //   3886: ldc2_w -553896620
    //   3889: l2i
    //   3890: ldc_w -1096938322
    //   3893: ixor
    //   3894: ldc2_w -1991500229
    //   3897: l2i
    //   3898: ldc_w 7701572
    //   3901: ixor
    //   3902: ixor
    //   3903: lookupswitch default -> 3928, -2118634954 -> 3886, 1975646856 -> 8204
    //   3928: aload_0
    //   3929: new bigname/zprestige/webhack/features/setting/Setting
    //   3932: dup
    //   3933: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼'
    //   3936: getstatic Perryc.c : I
    //   3939: iflt -> 3953
    //   3942: ldc2_w -1892096187
    //   3945: l2i
    //   3946: ldc_w 1407429044
    //   3949: ixor
    //   3950: goto -> 3961
    //   3953: ldc2_w -1030964204
    //   3956: l2i
    //   3957: ldc_w -673833584
    //   3960: ixor
    //   3961: ldc2_w 700929289
    //   3964: l2i
    //   3965: ldc_w -1306962163
    //   3968: ixor
    //   3969: ixor
    //   3970: lookupswitch default -> 8322, -1903910016 -> 3996, 1191529717 -> 3953
    //   3996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3999: ldc2_w 907097523
    //   4002: l2i
    //   4003: ldc_w 907097522
    //   4006: ixor
    //   4007: getstatic Perryc.c : I
    //   4010: iflt -> 4024
    //   4013: ldc2_w 1263160014
    //   4016: l2i
    //   4017: ldc_w 658421994
    //   4020: ixor
    //   4021: goto -> 4032
    //   4024: ldc2_w -419872443
    //   4027: l2i
    //   4028: ldc_w 1621036359
    //   4031: ixor
    //   4032: ldc2_w -485870131
    //   4035: l2i
    //   4036: ldc_w -783927933
    //   4039: ixor
    //   4040: ixor
    //   4041: lookupswitch default -> 8404, -1272296372 -> 4068, 1580790378 -> 4024
    //   4068: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4071: getstatic Perryc.0 : I
    //   4074: ifle -> 4088
    //   4077: ldc2_w 936091599
    //   4080: l2i
    //   4081: ldc_w 1907072993
    //   4084: ixor
    //   4085: goto -> 4096
    //   4088: ldc2_w -1052316272
    //   4091: l2i
    //   4092: ldc_w 1012717873
    //   4095: ixor
    //   4096: ldc2_w -576516994
    //   4099: l2i
    //   4100: ldc_w 531577991
    //   4103: ixor
    //   4104: ixor
    //   4105: lookupswitch default -> 8426, -2073284393 -> 4088, 1058407512 -> 4132
    //   4132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4135: getstatic Perryc.1 : I
    //   4138: ifeq -> 4152
    //   4141: ldc2_w -1959335892
    //   4144: l2i
    //   4145: ldc_w -829539691
    //   4148: ixor
    //   4149: goto -> 4160
    //   4152: ldc2_w -166426454
    //   4155: l2i
    //   4156: ldc_w -1085148669
    //   4159: ixor
    //   4160: ldc2_w -373504888
    //   4163: l2i
    //   4164: ldc_w -855522405
    //   4167: ixor
    //   4168: ixor
    //   4169: lookupswitch default -> 8380, 1627772330 -> 4152, 1845001658 -> 4196
    //   4196: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4199: getstatic Perryc.1 : I
    //   4202: ifeq -> 4216
    //   4205: ldc2_w -1327490419
    //   4208: l2i
    //   4209: ldc_w -1939532689
    //   4212: ixor
    //   4213: goto -> 4224
    //   4216: ldc2_w -1551129794
    //   4219: l2i
    //   4220: ldc_w -23438933
    //   4223: ixor
    //   4224: ldc2_w -472574385
    //   4227: l2i
    //   4228: ldc_w 1326786385
    //   4231: ixor
    //   4232: ixor
    //   4233: lookupswitch default -> 8334, -1874509828 -> 4216, -237909109 -> 4260
    //   4260: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4263: getstatic Perryc.c : I
    //   4266: iflt -> 4280
    //   4269: ldc2_w -254101942
    //   4272: l2i
    //   4273: ldc_w -1811181749
    //   4276: ixor
    //   4277: goto -> 4288
    //   4280: ldc2_w 50786820
    //   4283: l2i
    //   4284: ldc_w 660012642
    //   4287: ixor
    //   4288: ldc2_w 2033888949
    //   4291: l2i
    //   4292: ldc_w -1523674242
    //   4295: ixor
    //   4296: ixor
    //   4297: lookupswitch default -> 4324, -1195047734 -> 8292, -733632669 -> 4280
    //   4324: aload_0
    //   4325: getstatic Perryc.c : I
    //   4328: iflt -> 4342
    //   4331: ldc2_w 2060004633
    //   4334: l2i
    //   4335: ldc_w 1817037289
    //   4338: ixor
    //   4339: goto -> 4350
    //   4342: ldc2_w 251991300
    //   4345: l2i
    //   4346: ldc_w -1477146810
    //   4349: ixor
    //   4350: ldc2_w 202292084
    //   4353: l2i
    //   4354: ldc_w 1330848125
    //   4357: ixor
    //   4358: ixor
    //   4359: lookupswitch default -> 8306, -341047221 -> 4384, 1440317177 -> 4342
    //   4384: aload_0
    //   4385: new bigname/zprestige/webhack/features/setting/Setting
    //   4388: dup
    //   4389: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼?蹪佁ᳳਯ'
    //   4392: getstatic Perryc.c : I
    //   4395: iflt -> 4409
    //   4398: ldc2_w -1223028441
    //   4401: l2i
    //   4402: ldc_w -1537636208
    //   4405: ixor
    //   4406: goto -> 4417
    //   4409: ldc2_w -1177269065
    //   4412: l2i
    //   4413: ldc_w -1263607451
    //   4416: ixor
    //   4417: ldc2_w -1959828833
    //   4420: l2i
    //   4421: ldc_w 616170983
    //   4424: ixor
    //   4425: ixor
    //   4426: lookupswitch default -> 8406, -1561343318 -> 4452, -1126760753 -> 4409
    //   4452: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4455: ldc_w 5.190467
    //   4458: invokestatic floatToIntBits : (F)I
    //   4461: ldc_w 2133203022
    //   4464: ixor
    //   4465: invokestatic intBitsToFloat : (I)F
    //   4468: getstatic Perryc.c : I
    //   4471: iflt -> 4485
    //   4474: ldc2_w 738686979
    //   4477: l2i
    //   4478: ldc_w -1019217727
    //   4481: ixor
    //   4482: goto -> 4493
    //   4485: ldc2_w 2016370424
    //   4488: l2i
    //   4489: ldc_w -829563743
    //   4492: ixor
    //   4493: ldc2_w 1418120288
    //   4496: l2i
    //   4497: ldc_w 570013113
    //   4500: ixor
    //   4501: ixor
    //   4502: lookupswitch default -> 8240, -1706559205 -> 4485, -1008862336 -> 4528
    //   4528: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4531: ldc_w 9.62326E37
    //   4534: invokestatic floatToIntBits : (F)I
    //   4537: ldc_w 2123418483
    //   4540: ixor
    //   4541: invokestatic intBitsToFloat : (I)F
    //   4544: getstatic Perryc.1 : I
    //   4547: ifeq -> 4561
    //   4550: ldc2_w -1163829988
    //   4553: l2i
    //   4554: ldc_w -117194562
    //   4557: ixor
    //   4558: goto -> 4569
    //   4561: ldc2_w 242868110
    //   4564: l2i
    //   4565: ldc_w 950010842
    //   4568: ixor
    //   4569: ldc2_w 1365358577
    //   4572: l2i
    //   4573: ldc_w -1320254757
    //   4576: ixor
    //   4577: ixor
    //   4578: lookupswitch default -> 8206, -1550997368 -> 4561, -688461442 -> 4604
    //   4604: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4607: ldc_w 0.009156047
    //   4610: invokestatic floatToIntBits : (F)I
    //   4613: ldc_w 2092303167
    //   4616: ixor
    //   4617: invokestatic intBitsToFloat : (I)F
    //   4620: getstatic Perryc.0 : I
    //   4623: ifle -> 4637
    //   4626: ldc2_w -55883224
    //   4629: l2i
    //   4630: ldc_w -1477313373
    //   4633: ixor
    //   4634: goto -> 4645
    //   4637: ldc2_w 82623527
    //   4640: l2i
    //   4641: ldc_w -87779266
    //   4644: ixor
    //   4645: ldc2_w 497933959
    //   4648: l2i
    //   4649: ldc_w -794998677
    //   4652: ixor
    //   4653: ixor
    //   4654: lookupswitch default -> 4680, -1779973848 -> 4637, -1771429785 -> 8416
    //   4680: invokestatic valueOf : (F)Ljava/lang/Float;
    //   4683: getstatic Perryc.1 : I
    //   4686: ifeq -> 4700
    //   4689: ldc2_w 1947245483
    //   4692: l2i
    //   4693: ldc_w 1970410514
    //   4696: ixor
    //   4697: goto -> 4708
    //   4700: ldc2_w -1804554599
    //   4703: l2i
    //   4704: ldc_w -2101187573
    //   4707: ixor
    //   4708: ldc2_w 599144230
    //   4711: l2i
    //   4712: ldc_w 927308535
    //   4715: ixor
    //   4716: ixor
    //   4717: lookupswitch default -> 8202, 37842755 -> 4744, 361833064 -> 4700
    //   4744: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4747: getstatic Perryc.c : I
    //   4750: iflt -> 4764
    //   4753: ldc2_w -49394569
    //   4756: l2i
    //   4757: ldc_w -1086759270
    //   4760: ixor
    //   4761: goto -> 4772
    //   4764: ldc2_w -2112712407
    //   4767: l2i
    //   4768: ldc_w -814917075
    //   4771: ixor
    //   4772: ldc2_w 319089729
    //   4775: l2i
    //   4776: ldc_w -1026189313
    //   4779: ixor
    //   4780: ixor
    //   4781: lookupswitch default -> 4808, -1813616301 -> 8310, -543277786 -> 4764
    //   4808: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4811: getstatic Perryc.c : I
    //   4814: iflt -> 4828
    //   4817: ldc2_w -1496603014
    //   4820: l2i
    //   4821: ldc_w 154705666
    //   4824: ixor
    //   4825: goto -> 4836
    //   4828: ldc2_w 1048437664
    //   4831: l2i
    //   4832: ldc_w -777437413
    //   4835: ixor
    //   4836: ldc2_w 894022514
    //   4839: l2i
    //   4840: ldc_w -1436648050
    //   4843: ixor
    //   4844: ixor
    //   4845: lookupswitch default -> 8346, 820311940 -> 4828, 1891832391 -> 4872
    //   4872: putfield outlineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4875: getstatic Perryc.1 : I
    //   4878: ifeq -> 4892
    //   4881: ldc2_w 668448255
    //   4884: l2i
    //   4885: ldc_w -1949632013
    //   4888: ixor
    //   4889: goto -> 4900
    //   4892: ldc2_w 1800075754
    //   4895: l2i
    //   4896: ldc_w 1411018259
    //   4899: ixor
    //   4900: ldc2_w 2008884974
    //   4903: l2i
    //   4904: ldc_w -160436680
    //   4907: ixor
    //   4908: ixor
    //   4909: lookupswitch default -> 4936, 768574682 -> 8372, 1119503642 -> 4892
    //   4936: aload_0
    //   4937: getstatic Perryc.c : I
    //   4940: iflt -> 4954
    //   4943: ldc2_w -1751442246
    //   4946: l2i
    //   4947: ldc_w 1810842711
    //   4950: ixor
    //   4951: goto -> 4962
    //   4954: ldc2_w 1574837320
    //   4957: l2i
    //   4958: ldc_w -570509006
    //   4961: ixor
    //   4962: ldc2_w 117858270
    //   4965: l2i
    //   4966: ldc_w 1205482832
    //   4969: ixor
    //   4970: ixor
    //   4971: lookupswitch default -> 4996, -1129827741 -> 8314, -1000783875 -> 4954
    //   4996: aload_0
    //   4997: new bigname/zprestige/webhack/features/setting/Setting
    //   5000: dup
    //   5001: ldc_w 'ꐟ㌆ꑅ㶣Ꮄ䪍๖?蹷佉ᳮ਩槡'
    //   5004: getstatic Perryc.0 : I
    //   5007: ifle -> 5021
    //   5010: ldc2_w 1523201814
    //   5013: l2i
    //   5014: ldc_w 481699343
    //   5017: ixor
    //   5018: goto -> 5029
    //   5021: ldc2_w 1034827680
    //   5024: l2i
    //   5025: ldc_w -250129692
    //   5028: ixor
    //   5029: ldc2_w -1382607023
    //   5032: l2i
    //   5033: ldc_w 1601914342
    //   5036: ixor
    //   5037: ixor
    //   5038: lookupswitch default -> 8196, -1265613906 -> 5021, 1045772275 -> 5064
    //   5064: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5067: ldc2_w 1885227314
    //   5070: l2i
    //   5071: ldc_w 1885227315
    //   5074: ixor
    //   5075: getstatic Perryc.c : I
    //   5078: iflt -> 5092
    //   5081: ldc2_w -431025025
    //   5084: l2i
    //   5085: ldc_w 844648085
    //   5088: ixor
    //   5089: goto -> 5100
    //   5092: ldc2_w -2097711785
    //   5095: l2i
    //   5096: ldc_w 1328076869
    //   5099: ixor
    //   5100: ldc2_w -1642393991
    //   5103: l2i
    //   5104: ldc_w 2094148071
    //   5107: ixor
    //   5108: ixor
    //   5109: lookupswitch default -> 5136, -40536951 -> 5092, 920550772 -> 8208
    //   5136: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5139: getstatic Perryc.1 : I
    //   5142: ifeq -> 5156
    //   5145: ldc2_w -383558262
    //   5148: l2i
    //   5149: ldc_w -651795015
    //   5152: ixor
    //   5153: goto -> 5164
    //   5156: ldc2_w -311724025
    //   5159: l2i
    //   5160: ldc_w -601303822
    //   5163: ixor
    //   5164: ldc2_w -1229303112
    //   5167: l2i
    //   5168: ldc_w 353203859
    //   5171: ixor
    //   5172: ixor
    //   5173: lookupswitch default -> 5200, -1817043944 -> 8364, 1708258792 -> 5156
    //   5200: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5203: getstatic Perryc.1 : I
    //   5206: ifeq -> 5220
    //   5209: ldc2_w -438126423
    //   5212: l2i
    //   5213: ldc_w -2103607221
    //   5216: ixor
    //   5217: goto -> 5228
    //   5220: ldc2_w -312771621
    //   5223: l2i
    //   5224: ldc_w -599860444
    //   5227: ixor
    //   5228: ldc2_w 2103418480
    //   5231: l2i
    //   5232: ldc_w 589134463
    //   5235: ixor
    //   5236: ixor
    //   5237: lookupswitch default -> 5264, 960355565 -> 8232, 1992702307 -> 5220
    //   5264: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5267: getstatic Perryc.0 : I
    //   5270: ifle -> 5284
    //   5273: ldc2_w -1515519113
    //   5276: l2i
    //   5277: ldc_w -486949374
    //   5280: ixor
    //   5281: goto -> 5292
    //   5284: ldc2_w 1411052003
    //   5287: l2i
    //   5288: ldc_w 463206877
    //   5291: ixor
    //   5292: ldc2_w -289758471
    //   5295: l2i
    //   5296: ldc_w 703637613
    //   5299: ixor
    //   5300: ixor
    //   5301: lookupswitch default -> 5328, -2145863711 -> 8280, -1616274182 -> 5284
    //   5328: putfield cOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5331: getstatic Perryc.c : I
    //   5334: iflt -> 5348
    //   5337: ldc2_w 1362091001
    //   5340: l2i
    //   5341: ldc_w -1474765469
    //   5344: ixor
    //   5345: goto -> 5356
    //   5348: ldc2_w -142386863
    //   5351: l2i
    //   5352: ldc_w -1679429668
    //   5355: ixor
    //   5356: ldc2_w -167009193
    //   5359: l2i
    //   5360: ldc_w -911766801
    //   5363: ixor
    //   5364: ixor
    //   5365: lookupswitch default -> 5392, -962910174 -> 8414, 334001734 -> 5348
    //   5392: aload_0
    //   5393: getstatic Perryc.0 : I
    //   5396: ifle -> 5410
    //   5399: ldc2_w 202010774
    //   5402: l2i
    //   5403: ldc_w -427263947
    //   5406: ixor
    //   5407: goto -> 5418
    //   5410: ldc2_w -222766622
    //   5413: l2i
    //   5414: ldc_w 1818696353
    //   5417: ixor
    //   5418: ldc2_w -555117136
    //   5421: l2i
    //   5422: ldc_w -1672903657
    //   5425: ixor
    //   5426: ixor
    //   5427: lookupswitch default -> 8326, -1474160380 -> 5410, -595602716 -> 5452
    //   5452: aload_0
    //   5453: new bigname/zprestige/webhack/features/setting/Setting
    //   5456: dup
    //   5457: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼?蹦佁'
    //   5460: getstatic Perryc.1 : I
    //   5463: ifeq -> 5477
    //   5466: ldc2_w 715941410
    //   5469: l2i
    //   5470: ldc_w -499694027
    //   5473: ixor
    //   5474: goto -> 5485
    //   5477: ldc2_w -769505157
    //   5480: l2i
    //   5481: ldc_w 573908546
    //   5484: ixor
    //   5485: ldc2_w -891587678
    //   5488: l2i
    //   5489: ldc_w 1281517645
    //   5492: ixor
    //   5493: ixor
    //   5494: lookupswitch default -> 8328, 1310866424 -> 5477, 1991144918 -> 5520
    //   5520: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5523: ldc2_w -796702239
    //   5526: l2i
    //   5527: ldc_w -796702434
    //   5530: ixor
    //   5531: getstatic Perryc.0 : I
    //   5534: ifle -> 5548
    //   5537: ldc2_w 25358034
    //   5540: l2i
    //   5541: ldc_w -1066250207
    //   5544: ixor
    //   5545: goto -> 5556
    //   5548: ldc2_w 1377228637
    //   5551: l2i
    //   5552: ldc_w 532412351
    //   5555: ixor
    //   5556: ldc2_w -1165634270
    //   5559: l2i
    //   5560: ldc_w 1932328967
    //   5563: ixor
    //   5564: ixor
    //   5565: lookupswitch default -> 8362, -2079984185 -> 5592, 140012502 -> 5548
    //   5592: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5595: ldc2_w -1585937700
    //   5598: l2i
    //   5599: ldc_w -1585937700
    //   5602: ixor
    //   5603: getstatic Perryc.0 : I
    //   5606: ifle -> 5620
    //   5609: ldc2_w -489719551
    //   5612: l2i
    //   5613: ldc_w 184247935
    //   5616: ixor
    //   5617: goto -> 5628
    //   5620: ldc2_w -2133137595
    //   5623: l2i
    //   5624: ldc_w -616100914
    //   5627: ixor
    //   5628: ldc2_w 579637093
    //   5631: l2i
    //   5632: ldc_w -1920448028
    //   5635: ixor
    //   5636: ixor
    //   5637: lookupswitch default -> 8286, -191288822 -> 5664, 1194383871 -> 5620
    //   5664: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5667: ldc2_w 1103949381
    //   5670: l2i
    //   5671: ldc_w 1103949498
    //   5674: ixor
    //   5675: getstatic Perryc.0 : I
    //   5678: ifle -> 5692
    //   5681: ldc2_w 1037101792
    //   5684: l2i
    //   5685: ldc_w 701390538
    //   5688: ixor
    //   5689: goto -> 5700
    //   5692: ldc2_w 575504951
    //   5695: l2i
    //   5696: ldc_w -520302085
    //   5699: ixor
    //   5700: ldc2_w 1924369156
    //   5703: l2i
    //   5704: ldc_w 1739055929
    //   5707: ixor
    //   5708: ixor
    //   5709: lookupswitch default -> 5736, 17488919 -> 8274, 1413816002 -> 5692
    //   5736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5739: getstatic Perryc.0 : I
    //   5742: ifle -> 5756
    //   5745: ldc2_w -1807293772
    //   5748: l2i
    //   5749: ldc_w 894611763
    //   5752: ixor
    //   5753: goto -> 5764
    //   5756: ldc2_w 541803903
    //   5759: l2i
    //   5760: ldc_w 1881113976
    //   5763: ixor
    //   5764: ldc2_w -468240088
    //   5767: l2i
    //   5768: ldc_w -2002553394
    //   5771: ixor
    //   5772: ixor
    //   5773: lookupswitch default -> 5800, -2120599857 -> 5756, -845144223 -> 8270
    //   5800: aload_0
    //   5801: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   5806: getstatic Perryc.c : I
    //   5809: iflt -> 5823
    //   5812: ldc2_w -1238151635
    //   5815: l2i
    //   5816: ldc_w -2050308706
    //   5819: ixor
    //   5820: goto -> 5831
    //   5823: ldc2_w -1582432354
    //   5826: l2i
    //   5827: ldc_w -1322538786
    //   5830: ixor
    //   5831: ldc2_w -1596067882
    //   5834: l2i
    //   5835: ldc_w 2032457405
    //   5838: ixor
    //   5839: ixor
    //   5840: lookupswitch default -> 8250, -914395605 -> 5868, -369052968 -> 5823
    //   5868: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5871: getstatic Perryc.1 : I
    //   5874: ifeq -> 5888
    //   5877: ldc2_w 462209816
    //   5880: l2i
    //   5881: ldc_w 1102192177
    //   5884: ixor
    //   5885: goto -> 5896
    //   5888: ldc2_w -954335002
    //   5891: l2i
    //   5892: ldc_w 592258490
    //   5895: ixor
    //   5896: ldc2_w 5756288
    //   5899: l2i
    //   5900: ldc_w -1362350039
    //   5903: ixor
    //   5904: ixor
    //   5905: lookupswitch default -> 5932, -1317460929 -> 5888, -190498688 -> 8226
    //   5932: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5935: getstatic Perryc.c : I
    //   5938: iflt -> 5952
    //   5941: ldc2_w -1466738069
    //   5944: l2i
    //   5945: ldc_w 477611022
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w -1408251792
    //   5955: l2i
    //   5956: ldc_w 2017909271
    //   5959: ixor
    //   5960: ldc2_w -72155328
    //   5963: l2i
    //   5964: ldc_w -1370158502
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 5996, -519869569 -> 8388, 1779156790 -> 5952
    //   5996: putfield outlineRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5999: getstatic Perryc.0 : I
    //   6002: ifle -> 6016
    //   6005: ldc2_w -2033874576
    //   6008: l2i
    //   6009: ldc_w -2006091966
    //   6012: ixor
    //   6013: goto -> 6024
    //   6016: ldc2_w 2134333061
    //   6019: l2i
    //   6020: ldc_w -1233020866
    //   6023: ixor
    //   6024: ldc2_w 1124394857
    //   6027: l2i
    //   6028: ldc_w 114957170
    //   6031: ixor
    //   6032: ixor
    //   6033: lookupswitch default -> 6060, 1042194 -> 6016, 1266025001 -> 8352
    //   6060: aload_0
    //   6061: getstatic Perryc.c : I
    //   6064: iflt -> 6078
    //   6067: ldc2_w 1137633441
    //   6070: l2i
    //   6071: ldc_w -727223537
    //   6074: ixor
    //   6075: goto -> 6086
    //   6078: ldc2_w 970154103
    //   6081: l2i
    //   6082: ldc_w -593391264
    //   6085: ixor
    //   6086: ldc2_w 1157815694
    //   6089: l2i
    //   6090: ldc_w -230532572
    //   6093: ixor
    //   6094: ixor
    //   6095: lookupswitch default -> 8210, 539565060 -> 6078, 1379038909 -> 6120
    //   6120: aload_0
    //   6121: new bigname/zprestige/webhack/features/setting/Setting
    //   6124: dup
    //   6125: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼?蹱佀᳢਩'
    //   6128: getstatic Perryc.1 : I
    //   6131: ifeq -> 6145
    //   6134: ldc2_w -193866673
    //   6137: l2i
    //   6138: ldc_w -6475158
    //   6141: ixor
    //   6142: goto -> 6153
    //   6145: ldc2_w -726613344
    //   6148: l2i
    //   6149: ldc_w 1268693050
    //   6152: ixor
    //   6153: ldc2_w 1598387067
    //   6156: l2i
    //   6157: ldc_w -1454473486
    //   6160: ixor
    //   6161: ixor
    //   6162: lookupswitch default -> 8278, -35132500 -> 6145, 1764062995 -> 6188
    //   6188: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6191: ldc2_w -683275291
    //   6194: l2i
    //   6195: ldc_w -683275494
    //   6198: ixor
    //   6199: getstatic Perryc.c : I
    //   6202: iflt -> 6216
    //   6205: ldc2_w -2107421386
    //   6208: l2i
    //   6209: ldc_w 93538247
    //   6212: ixor
    //   6213: goto -> 6224
    //   6216: ldc2_w -1147259309
    //   6219: l2i
    //   6220: ldc_w -1221554904
    //   6223: ixor
    //   6224: ldc2_w 2096797758
    //   6227: l2i
    //   6228: ldc_w -444449962
    //   6231: ixor
    //   6232: ixor
    //   6233: lookupswitch default -> 8348, -1781131245 -> 6260, 512272793 -> 6216
    //   6260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6263: ldc2_w -1961200119
    //   6266: l2i
    //   6267: ldc_w -1961200119
    //   6270: ixor
    //   6271: getstatic Perryc.c : I
    //   6274: iflt -> 6288
    //   6277: ldc2_w 817750055
    //   6280: l2i
    //   6281: ldc_w -1238959675
    //   6284: ixor
    //   6285: goto -> 6296
    //   6288: ldc2_w 504704869
    //   6291: l2i
    //   6292: ldc_w 74072649
    //   6295: ixor
    //   6296: ldc2_w 1847863852
    //   6299: l2i
    //   6300: ldc_w 1110124369
    //   6303: ixor
    //   6304: ixor
    //   6305: lookupswitch default -> 6332, -1433135969 -> 8242, 1460442635 -> 6288
    //   6332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6335: ldc2_w 1005483600
    //   6338: l2i
    //   6339: ldc_w 1005483695
    //   6342: ixor
    //   6343: getstatic Perryc.c : I
    //   6346: iflt -> 6360
    //   6349: ldc2_w 694708132
    //   6352: l2i
    //   6353: ldc_w -251777099
    //   6356: ixor
    //   6357: goto -> 6368
    //   6360: ldc2_w 492486732
    //   6363: l2i
    //   6364: ldc_w -910573534
    //   6367: ixor
    //   6368: ldc2_w -2140569436
    //   6371: l2i
    //   6372: ldc_w 1409652904
    //   6375: ixor
    //   6376: ixor
    //   6377: lookupswitch default -> 8304, 9377890 -> 6404, 234508317 -> 6360
    //   6404: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6407: getstatic Perryc.c : I
    //   6410: iflt -> 6424
    //   6413: ldc2_w 28414243
    //   6416: l2i
    //   6417: ldc_w 1241169751
    //   6420: ixor
    //   6421: goto -> 6432
    //   6424: ldc2_w -512523394
    //   6427: l2i
    //   6428: ldc_w -1613187563
    //   6431: ixor
    //   6432: ldc2_w 376617652
    //   6435: l2i
    //   6436: ldc_w 1247818721
    //   6439: ixor
    //   6440: ixor
    //   6441: lookupswitch default -> 8218, 341419809 -> 6424, 582597694 -> 6468
    //   6468: aload_0
    //   6469: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   6474: getstatic Perryc.0 : I
    //   6477: ifle -> 6491
    //   6480: ldc2_w -481344644
    //   6483: l2i
    //   6484: ldc_w -1181124384
    //   6487: ixor
    //   6488: goto -> 6499
    //   6491: ldc2_w -1443339245
    //   6494: l2i
    //   6495: ldc_w -666954667
    //   6498: ixor
    //   6499: ldc2_w -1637030720
    //   6502: l2i
    //   6503: ldc_w 1461950494
    //   6506: ixor
    //   6507: ixor
    //   6508: lookupswitch default -> 8234, -1818671294 -> 6491, -1199043432 -> 6536
    //   6536: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6539: getstatic Perryc.c : I
    //   6542: iflt -> 6556
    //   6545: ldc2_w 1598973549
    //   6548: l2i
    //   6549: ldc_w 1545455801
    //   6552: ixor
    //   6553: goto -> 6564
    //   6556: ldc2_w 1345570879
    //   6559: l2i
    //   6560: ldc_w 1195250691
    //   6563: ixor
    //   6564: ldc2_w -245477212
    //   6567: l2i
    //   6568: ldc_w 1108780211
    //   6571: ixor
    //   6572: ixor
    //   6573: lookupswitch default -> 8408, -1538971605 -> 6600, -1340384573 -> 6556
    //   6600: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6603: getstatic Perryc.0 : I
    //   6606: ifle -> 6620
    //   6609: ldc2_w -1951713923
    //   6612: l2i
    //   6613: ldc_w -153268670
    //   6616: ixor
    //   6617: goto -> 6628
    //   6620: ldc2_w -1210371706
    //   6623: l2i
    //   6624: ldc_w -1284149813
    //   6627: ixor
    //   6628: ldc2_w -478338650
    //   6631: l2i
    //   6632: ldc_w 451176593
    //   6635: ixor
    //   6636: ixor
    //   6637: lookupswitch default -> 8258, -2064698872 -> 6620, -46721670 -> 6664
    //   6664: putfield outlineGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6667: getstatic Perryc.1 : I
    //   6670: ifeq -> 6684
    //   6673: ldc2_w 1016064347
    //   6676: l2i
    //   6677: ldc_w -1874984985
    //   6680: ixor
    //   6681: goto -> 6692
    //   6684: ldc2_w -457936100
    //   6687: l2i
    //   6688: ldc_w -2013448304
    //   6691: ixor
    //   6692: ldc2_w -187811804
    //   6695: l2i
    //   6696: ldc_w 776688773
    //   6699: ixor
    //   6700: ixor
    //   6701: lookupswitch default -> 8366, -1177802707 -> 6728, 1983347229 -> 6684
    //   6728: aload_0
    //   6729: getstatic Perryc.0 : I
    //   6732: ifle -> 6746
    //   6735: ldc2_w 648816209
    //   6738: l2i
    //   6739: ldc_w 1151851636
    //   6742: ixor
    //   6743: goto -> 6754
    //   6746: ldc2_w 638104068
    //   6749: l2i
    //   6750: ldc_w -1685325096
    //   6753: ixor
    //   6754: ldc2_w 1756463456
    //   6757: l2i
    //   6758: ldc_w 1653710365
    //   6761: ixor
    //   6762: ixor
    //   6763: lookupswitch default -> 8214, -1214031967 -> 6788, 1747707224 -> 6746
    //   6788: aload_0
    //   6789: new bigname/zprestige/webhack/features/setting/Setting
    //   6792: dup
    //   6793: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼?蹯佐᳢'
    //   6796: getstatic Perryc.1 : I
    //   6799: ifeq -> 6813
    //   6802: ldc2_w -1240697624
    //   6805: l2i
    //   6806: ldc_w 1566431197
    //   6809: ixor
    //   6810: goto -> 6821
    //   6813: ldc2_w -1882676253
    //   6816: l2i
    //   6817: ldc_w 641429304
    //   6820: ixor
    //   6821: ldc2_w 519700057
    //   6824: l2i
    //   6825: ldc_w 1685471211
    //   6828: ixor
    //   6829: ixor
    //   6830: lookupswitch default -> 6856, -1847696761 -> 8220, -1056872761 -> 6813
    //   6856: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6859: ldc2_w 1421114697
    //   6862: l2i
    //   6863: ldc_w 1421114806
    //   6866: ixor
    //   6867: getstatic Perryc.0 : I
    //   6870: ifle -> 6884
    //   6873: ldc2_w -314763635
    //   6876: l2i
    //   6877: ldc_w -1633589203
    //   6880: ixor
    //   6881: goto -> 6892
    //   6884: ldc2_w -1305996307
    //   6887: l2i
    //   6888: ldc_w -1396481984
    //   6891: ixor
    //   6892: ldc2_w 1784557411
    //   6895: l2i
    //   6896: ldc_w -1518466542
    //   6899: ixor
    //   6900: ixor
    //   6901: lookupswitch default -> 8252, -1128506415 -> 6884, -775203108 -> 6928
    //   6928: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6931: ldc2_w -1837460965
    //   6934: l2i
    //   6935: ldc_w -1837460965
    //   6938: ixor
    //   6939: getstatic Perryc.1 : I
    //   6942: ifeq -> 6956
    //   6945: ldc2_w 247860163
    //   6948: l2i
    //   6949: ldc_w 1814029502
    //   6952: ixor
    //   6953: goto -> 6964
    //   6956: ldc2_w -1203413843
    //   6959: l2i
    //   6960: ldc_w 209759476
    //   6963: ixor
    //   6964: ldc2_w 1867810185
    //   6967: l2i
    //   6968: ldc_w -108209513
    //   6971: ixor
    //   6972: ixor
    //   6973: lookupswitch default -> 8302, -201215901 -> 6956, 572370759 -> 7000
    //   7000: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7003: ldc2_w -2098043238
    //   7006: l2i
    //   7007: ldc_w -2098043291
    //   7010: ixor
    //   7011: getstatic Perryc.1 : I
    //   7014: ifeq -> 7028
    //   7017: ldc2_w 1338817883
    //   7020: l2i
    //   7021: ldc_w 1067973998
    //   7024: ixor
    //   7025: goto -> 7036
    //   7028: ldc2_w 1847779509
    //   7031: l2i
    //   7032: ldc_w 1530238729
    //   7035: ixor
    //   7036: ldc2_w -2027870934
    //   7039: l2i
    //   7040: ldc_w -276906349
    //   7043: ixor
    //   7044: ixor
    //   7045: lookupswitch default -> 8254, 406117260 -> 7028, 1565060101 -> 7072
    //   7072: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7075: getstatic Perryc.0 : I
    //   7078: ifle -> 7092
    //   7081: ldc2_w 1966329355
    //   7084: l2i
    //   7085: ldc_w 1976496841
    //   7088: ixor
    //   7089: goto -> 7100
    //   7092: ldc2_w 957761045
    //   7095: l2i
    //   7096: ldc_w 1677484260
    //   7099: ixor
    //   7100: ldc2_w 1924087802
    //   7103: l2i
    //   7104: ldc_w -1945315650
    //   7107: ixor
    //   7108: ixor
    //   7109: lookupswitch default -> 7136, -523813084 -> 7092, -27339386 -> 8282
    //   7136: aload_0
    //   7137: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   7142: getstatic Perryc.c : I
    //   7145: iflt -> 7159
    //   7148: ldc2_w 880410117
    //   7151: l2i
    //   7152: ldc_w 712391335
    //   7155: ixor
    //   7156: goto -> 7167
    //   7159: ldc2_w 1277927215
    //   7162: l2i
    //   7163: ldc_w -353900603
    //   7166: ixor
    //   7167: ldc2_w -146635361
    //   7170: l2i
    //   7171: ldc_w -1154466794
    //   7174: ixor
    //   7175: ixor
    //   7176: lookupswitch default -> 7204, -1327126701 -> 7159, 1383955755 -> 8418
    //   7204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7207: getstatic Perryc.c : I
    //   7210: iflt -> 7224
    //   7213: ldc2_w -1871622647
    //   7216: l2i
    //   7217: ldc_w 680243160
    //   7220: ixor
    //   7221: goto -> 7232
    //   7224: ldc2_w -1368320586
    //   7227: l2i
    //   7228: ldc_w 1308966308
    //   7231: ixor
    //   7232: ldc2_w -1554124091
    //   7235: l2i
    //   7236: ldc_w -1794206147
    //   7239: ixor
    //   7240: ixor
    //   7241: lookupswitch default -> 7268, -1901492951 -> 8228, -1898257084 -> 7224
    //   7268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7271: getstatic Perryc.1 : I
    //   7274: ifeq -> 7288
    //   7277: ldc2_w -1509151118
    //   7280: l2i
    //   7281: ldc_w 1947256978
    //   7284: ixor
    //   7285: goto -> 7296
    //   7288: ldc2_w 1084355990
    //   7291: l2i
    //   7292: ldc_w -473365581
    //   7295: ixor
    //   7296: ldc2_w 752910581
    //   7299: l2i
    //   7300: ldc_w 1597035361
    //   7303: ixor
    //   7304: ixor
    //   7305: lookupswitch default -> 7332, -1580419724 -> 8312, 1217309169 -> 7288
    //   7332: putfield outlineBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7335: getstatic Perryc.0 : I
    //   7338: ifle -> 7352
    //   7341: ldc2_w -1825058103
    //   7344: l2i
    //   7345: ldc_w -1774905310
    //   7348: ixor
    //   7349: goto -> 7360
    //   7352: ldc2_w 316259823
    //   7355: l2i
    //   7356: ldc_w 248967972
    //   7359: ixor
    //   7360: ldc2_w -1148419680
    //   7363: l2i
    //   7364: ldc_w 1718926623
    //   7367: ixor
    //   7368: ixor
    //   7369: lookupswitch default -> 8398, -1040747916 -> 7396, -654641580 -> 7352
    //   7396: aload_0
    //   7397: getstatic Perryc.0 : I
    //   7400: ifle -> 7414
    //   7403: ldc2_w -1728108841
    //   7406: l2i
    //   7407: ldc_w -1961480059
    //   7410: ixor
    //   7411: goto -> 7422
    //   7414: ldc2_w 388246096
    //   7417: l2i
    //   7418: ldc_w 364099700
    //   7421: ixor
    //   7422: ldc2_w 983076276
    //   7425: l2i
    //   7426: ldc_w -1062805751
    //   7429: ixor
    //   7430: ixor
    //   7431: lookupswitch default -> 8392, -371768081 -> 7414, -123092839 -> 7456
    //   7456: aload_0
    //   7457: new bigname/zprestige/webhack/features/setting/Setting
    //   7460: dup
    //   7461: ldc_w 'ꐓ㌆ꑂ㶻Ꮂ䪎๼?蹯何ᳯਦ'
    //   7464: getstatic Perryc.1 : I
    //   7467: ifeq -> 7481
    //   7470: ldc2_w 37145497
    //   7473: l2i
    //   7474: ldc_w 2090542866
    //   7477: ixor
    //   7478: goto -> 7489
    //   7481: ldc2_w -2019960512
    //   7484: l2i
    //   7485: ldc_w 164177958
    //   7488: ixor
    //   7489: ldc2_w 1694566015
    //   7492: l2i
    //   7493: ldc_w 194072488
    //   7496: ixor
    //   7497: ixor
    //   7498: lookupswitch default -> 7524, 272475484 -> 8308, 1238939174 -> 7481
    //   7524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7527: ldc2_w -1412223936
    //   7530: l2i
    //   7531: ldc_w -1412223809
    //   7534: ixor
    //   7535: getstatic Perryc.c : I
    //   7538: iflt -> 7552
    //   7541: ldc2_w -1050273708
    //   7544: l2i
    //   7545: ldc_w 1056682847
    //   7548: ixor
    //   7549: goto -> 7560
    //   7552: ldc2_w -561027086
    //   7555: l2i
    //   7556: ldc_w -1972435416
    //   7559: ixor
    //   7560: ldc2_w -282710054
    //   7563: l2i
    //   7564: ldc_w -1361688191
    //   7567: ixor
    //   7568: ixor
    //   7569: lookupswitch default -> 8402, -1100100272 -> 7552, 353372033 -> 7596
    //   7596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7599: ldc2_w -247758628
    //   7602: l2i
    //   7603: ldc_w -247758628
    //   7606: ixor
    //   7607: getstatic Perryc.1 : I
    //   7610: ifeq -> 7624
    //   7613: ldc2_w 1342461931
    //   7616: l2i
    //   7617: ldc_w 682815860
    //   7620: ixor
    //   7621: goto -> 7632
    //   7624: ldc2_w -1203174025
    //   7627: l2i
    //   7628: ldc_w -774823752
    //   7631: ixor
    //   7632: ldc2_w -1706820480
    //   7635: l2i
    //   7636: ldc_w 1606300325
    //   7639: ixor
    //   7640: ixor
    //   7641: lookupswitch default -> 7668, -1119131462 -> 8320, -288241149 -> 7624
    //   7668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7671: ldc2_w -316434727
    //   7674: l2i
    //   7675: ldc_w -316434906
    //   7678: ixor
    //   7679: getstatic Perryc.0 : I
    //   7682: ifle -> 7696
    //   7685: ldc2_w -781219241
    //   7688: l2i
    //   7689: ldc_w -721396396
    //   7692: ixor
    //   7693: goto -> 7704
    //   7696: ldc2_w 2076915976
    //   7699: l2i
    //   7700: ldc_w -1459513143
    //   7703: ixor
    //   7704: ldc2_w -169410299
    //   7707: l2i
    //   7708: ldc_w -172093297
    //   7711: ixor
    //   7712: ixor
    //   7713: lookupswitch default -> 7740, 70698633 -> 8318, 1835689023 -> 7696
    //   7740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7743: getstatic Perryc.0 : I
    //   7746: ifle -> 7760
    //   7749: ldc2_w 1955274356
    //   7752: l2i
    //   7753: ldc_w -1706902113
    //   7756: ixor
    //   7757: goto -> 7768
    //   7760: ldc2_w -111054972
    //   7763: l2i
    //   7764: ldc_w 159900356
    //   7767: ixor
    //   7768: ldc2_w 1554563358
    //   7771: l2i
    //   7772: ldc_w -1506045333
    //   7775: ixor
    //   7776: ixor
    //   7777: lookupswitch default -> 8410, 175496757 -> 7804, 341504158 -> 7760
    //   7804: aload_0
    //   7805: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Predicate;
    //   7810: getstatic Perryc.0 : I
    //   7813: ifle -> 7827
    //   7816: ldc2_w 1254570789
    //   7819: l2i
    //   7820: ldc_w -1851549126
    //   7823: ixor
    //   7824: goto -> 7835
    //   7827: ldc2_w -588353451
    //   7830: l2i
    //   7831: ldc_w -1884700599
    //   7834: ixor
    //   7835: ldc2_w -1430497876
    //   7838: l2i
    //   7839: ldc_w -1048109465
    //   7842: ixor
    //   7843: ixor
    //   7844: lookupswitch default -> 7872, -1335891244 -> 8284, 2037142703 -> 7827
    //   7872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7875: getstatic Perryc.0 : I
    //   7878: ifle -> 7892
    //   7881: ldc2_w 614535966
    //   7884: l2i
    //   7885: ldc_w 2105564672
    //   7888: ixor
    //   7889: goto -> 7900
    //   7892: ldc2_w 1858504481
    //   7895: l2i
    //   7896: ldc_w 1228022060
    //   7899: ixor
    //   7900: ldc2_w -836563063
    //   7903: l2i
    //   7904: ldc_w 1428823158
    //   7907: ixor
    //   7908: ixor
    //   7909: lookupswitch default -> 7936, -1037541663 -> 8316, 968898998 -> 7892
    //   7936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7939: getstatic Perryc.c : I
    //   7942: iflt -> 7956
    //   7945: ldc2_w -2019848818
    //   7948: l2i
    //   7949: ldc_w 853964543
    //   7952: ixor
    //   7953: goto -> 7964
    //   7956: ldc2_w 644658837
    //   7959: l2i
    //   7960: ldc_w 1308241566
    //   7963: ixor
    //   7964: ldc2_w -33503882
    //   7967: l2i
    //   7968: ldc_w -2015763027
    //   7971: ixor
    //   7972: ixor
    //   7973: lookupswitch default -> 8000, -1980102732 -> 7956, -861611094 -> 8368
    //   8000: putfield outlineAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8003: getstatic Perryc.c : I
    //   8006: iflt -> 8020
    //   8009: ldc2_w -1716830462
    //   8012: l2i
    //   8013: ldc_w 1360339807
    //   8016: ixor
    //   8017: goto -> 8028
    //   8020: ldc2_w -169397589
    //   8023: l2i
    //   8024: ldc_w 1477311594
    //   8027: ixor
    //   8028: ldc2_w 1734818944
    //   8031: l2i
    //   8032: ldc_w 250779015
    //   8035: ixor
    //   8036: ixor
    //   8037: lookupswitch default -> 8064, -1590971046 -> 8382, -1372179130 -> 8020
    //   8064: aload_0
    //   8065: new java/util/HashMap
    //   8068: dup
    //   8069: getstatic Perryc.c : I
    //   8072: iflt -> 8086
    //   8075: ldc2_w 659006965
    //   8078: l2i
    //   8079: ldc_w -1717774523
    //   8082: ixor
    //   8083: goto -> 8094
    //   8086: ldc2_w -586168735
    //   8089: l2i
    //   8090: ldc_w -1927810875
    //   8093: ixor
    //   8094: ldc2_w 1482577555
    //   8097: l2i
    //   8098: ldc_w 1541759497
    //   8101: ixor
    //   8102: ixor
    //   8103: lookupswitch default -> 8128, -1117764054 -> 8276, 968175184 -> 8086
    //   8128: invokespecial <init> : ()V
    //   8131: getstatic Perryc.0 : I
    //   8134: ifle -> 8148
    //   8137: ldc2_w 1048221402
    //   8140: l2i
    //   8141: ldc_w -1114893537
    //   8144: ixor
    //   8145: goto -> 8156
    //   8148: ldc2_w -190536015
    //   8151: l2i
    //   8152: ldc_w -1041412753
    //   8155: ixor
    //   8156: ldc2_w -912659169
    //   8159: l2i
    //   8160: ldc_w -445017333
    //   8163: ixor
    //   8164: ixor
    //   8165: lookupswitch default -> 8192, -2094367577 -> 8148, -1357448239 -> 8244
    //   8192: putfield burrowedPlayers : Ljava/util/Map;
    //   8195: return
    //   8196: aconst_null
    //   8197: athrow
    //   8198: aconst_null
    //   8199: athrow
    //   8200: aconst_null
    //   8201: athrow
    //   8202: aconst_null
    //   8203: athrow
    //   8204: aconst_null
    //   8205: athrow
    //   8206: aconst_null
    //   8207: athrow
    //   8208: aconst_null
    //   8209: athrow
    //   8210: aconst_null
    //   8211: athrow
    //   8212: aconst_null
    //   8213: athrow
    //   8214: aconst_null
    //   8215: athrow
    //   8216: aconst_null
    //   8217: athrow
    //   8218: aconst_null
    //   8219: athrow
    //   8220: aconst_null
    //   8221: athrow
    //   8222: aconst_null
    //   8223: athrow
    //   8224: aconst_null
    //   8225: athrow
    //   8226: aconst_null
    //   8227: athrow
    //   8228: aconst_null
    //   8229: athrow
    //   8230: aconst_null
    //   8231: athrow
    //   8232: aconst_null
    //   8233: athrow
    //   8234: aconst_null
    //   8235: athrow
    //   8236: aconst_null
    //   8237: athrow
    //   8238: aconst_null
    //   8239: athrow
    //   8240: aconst_null
    //   8241: athrow
    //   8242: aconst_null
    //   8243: athrow
    //   8244: aconst_null
    //   8245: athrow
    //   8246: aconst_null
    //   8247: athrow
    //   8248: aconst_null
    //   8249: athrow
    //   8250: aconst_null
    //   8251: athrow
    //   8252: aconst_null
    //   8253: athrow
    //   8254: aconst_null
    //   8255: athrow
    //   8256: aconst_null
    //   8257: athrow
    //   8258: aconst_null
    //   8259: athrow
    //   8260: aconst_null
    //   8261: athrow
    //   8262: aconst_null
    //   8263: athrow
    //   8264: aconst_null
    //   8265: athrow
    //   8266: aconst_null
    //   8267: athrow
    //   8268: aconst_null
    //   8269: athrow
    //   8270: aconst_null
    //   8271: athrow
    //   8272: aconst_null
    //   8273: athrow
    //   8274: aconst_null
    //   8275: athrow
    //   8276: aconst_null
    //   8277: athrow
    //   8278: aconst_null
    //   8279: athrow
    //   8280: aconst_null
    //   8281: athrow
    //   8282: aconst_null
    //   8283: athrow
    //   8284: aconst_null
    //   8285: athrow
    //   8286: aconst_null
    //   8287: athrow
    //   8288: aconst_null
    //   8289: athrow
    //   8290: aconst_null
    //   8291: athrow
    //   8292: aconst_null
    //   8293: athrow
    //   8294: aconst_null
    //   8295: athrow
    //   8296: aconst_null
    //   8297: athrow
    //   8298: aconst_null
    //   8299: athrow
    //   8300: aconst_null
    //   8301: athrow
    //   8302: aconst_null
    //   8303: athrow
    //   8304: aconst_null
    //   8305: athrow
    //   8306: aconst_null
    //   8307: athrow
    //   8308: aconst_null
    //   8309: athrow
    //   8310: aconst_null
    //   8311: athrow
    //   8312: aconst_null
    //   8313: athrow
    //   8314: aconst_null
    //   8315: athrow
    //   8316: aconst_null
    //   8317: athrow
    //   8318: aconst_null
    //   8319: athrow
    //   8320: aconst_null
    //   8321: athrow
    //   8322: aconst_null
    //   8323: athrow
    //   8324: aconst_null
    //   8325: athrow
    //   8326: aconst_null
    //   8327: athrow
    //   8328: aconst_null
    //   8329: athrow
    //   8330: aconst_null
    //   8331: athrow
    //   8332: aconst_null
    //   8333: athrow
    //   8334: aconst_null
    //   8335: athrow
    //   8336: aconst_null
    //   8337: athrow
    //   8338: aconst_null
    //   8339: athrow
    //   8340: aconst_null
    //   8341: athrow
    //   8342: aconst_null
    //   8343: athrow
    //   8344: aconst_null
    //   8345: athrow
    //   8346: aconst_null
    //   8347: athrow
    //   8348: aconst_null
    //   8349: athrow
    //   8350: aconst_null
    //   8351: athrow
    //   8352: aconst_null
    //   8353: athrow
    //   8354: aconst_null
    //   8355: athrow
    //   8356: aconst_null
    //   8357: athrow
    //   8358: aconst_null
    //   8359: athrow
    //   8360: aconst_null
    //   8361: athrow
    //   8362: aconst_null
    //   8363: athrow
    //   8364: aconst_null
    //   8365: athrow
    //   8366: aconst_null
    //   8367: athrow
    //   8368: aconst_null
    //   8369: athrow
    //   8370: aconst_null
    //   8371: athrow
    //   8372: aconst_null
    //   8373: athrow
    //   8374: aconst_null
    //   8375: athrow
    //   8376: aconst_null
    //   8377: athrow
    //   8378: aconst_null
    //   8379: athrow
    //   8380: aconst_null
    //   8381: athrow
    //   8382: aconst_null
    //   8383: athrow
    //   8384: aconst_null
    //   8385: athrow
    //   8386: aconst_null
    //   8387: athrow
    //   8388: aconst_null
    //   8389: athrow
    //   8390: aconst_null
    //   8391: athrow
    //   8392: aconst_null
    //   8393: athrow
    //   8394: aconst_null
    //   8395: athrow
    //   8396: aconst_null
    //   8397: athrow
    //   8398: aconst_null
    //   8399: athrow
    //   8400: aconst_null
    //   8401: athrow
    //   8402: aconst_null
    //   8403: athrow
    //   8404: aconst_null
    //   8405: athrow
    //   8406: aconst_null
    //   8407: athrow
    //   8408: aconst_null
    //   8409: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	8196	0	this	Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;
  }
  
  public boolean lambda$new$1(Integer paramInteger) {
    return Perry1.5x(this, (int)-705287782L ^ 0xE978E164, paramInteger);
  }
  
  public void lambda$onRender3D$8(Map.Entry entry) {
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
  
  public boolean isBurrowed(EntityPlayer player) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2207
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 2199
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2191
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/BlockPos
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w -1026641836
    //   37: l2i
    //   38: ldc_w 1416869501
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1230963577
    //   48: l2i
    //   49: ldc_w -1244946770
    //   52: ixor
    //   53: ldc2_w -2025147175
    //   56: l2i
    //   57: ldc_w -555928808
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1347203595 -> 45, -819297816 -> 2140
    //   88: aload_1
    //   89: getstatic Perryc.1 : I
    //   92: ifeq -> 106
    //   95: ldc2_w -2102705934
    //   98: l2i
    //   99: ldc_w -430359894
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 99470960
    //   109: l2i
    //   110: ldc_w -2041074928
    //   113: ixor
    //   114: ldc2_w -523799279
    //   117: l2i
    //   118: ldc_w -1309004488
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -296842243 -> 106, 902767217 -> 2138
    //   148: getfield field_70165_t : D
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w 2053756774
    //   160: l2i
    //   161: ldc_w -124174240
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1906003864
    //   171: l2i
    //   172: ldc_w -1617638973
    //   175: ixor
    //   176: ldc2_w -1474847523
    //   179: l2i
    //   180: ldc_w -1338416355
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 2124, -1696700218 -> 168, 165578347 -> 212
    //   212: goto -> 216
    //   215: athrow
    //   216: invokestatic floor : (D)D
    //   219: goto -> 223
    //   222: athrow
    //   223: getstatic Perryc.0 : I
    //   226: ifle -> 240
    //   229: ldc2_w 287552142
    //   232: l2i
    //   233: ldc_w 2021190136
    //   236: ixor
    //   237: goto -> 248
    //   240: ldc2_w 1025094774
    //   243: l2i
    //   244: ldc_w 1887930350
    //   247: ixor
    //   248: ldc2_w -1716346592
    //   251: l2i
    //   252: ldc_w -1542690821
    //   255: ixor
    //   256: ixor
    //   257: lookupswitch default -> 284, -1674222208 -> 240, 1424334253 -> 2148
    //   284: aload_1
    //   285: getstatic Perryc.0 : I
    //   288: ifle -> 302
    //   291: ldc2_w -908971915
    //   294: l2i
    //   295: ldc_w -1717259714
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w -917700318
    //   305: l2i
    //   306: ldc_w 745844280
    //   309: ixor
    //   310: ldc2_w 645974089
    //   313: l2i
    //   314: ldc_w 1982455698
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 344, 14652816 -> 2162, 84662115 -> 302
    //   344: getfield field_70163_u : D
    //   347: ldc2_w 10.914180446537529
    //   350: invokestatic doubleToLongBits : (D)J
    //   353: ldc2_w 9217827847924126570
    //   356: lxor
    //   357: invokestatic longBitsToDouble : (J)D
    //   360: dadd
    //   361: getstatic Perryc.0 : I
    //   364: ifle -> 378
    //   367: ldc2_w 665003964
    //   370: l2i
    //   371: ldc_w -344087195
    //   374: ixor
    //   375: goto -> 386
    //   378: ldc2_w -864786610
    //   381: l2i
    //   382: ldc_w 2054124343
    //   385: ixor
    //   386: ldc2_w -1050325371
    //   389: l2i
    //   390: ldc_w -172683208
    //   393: ixor
    //   394: ixor
    //   395: lookupswitch default -> 420, -1753191080 -> 378, -133243804 -> 2168
    //   420: goto -> 424
    //   423: athrow
    //   424: invokestatic floor : (D)D
    //   427: goto -> 431
    //   430: athrow
    //   431: getstatic Perryc.c : I
    //   434: iflt -> 448
    //   437: ldc2_w 623969895
    //   440: l2i
    //   441: ldc_w -2079306045
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w -852517667
    //   451: l2i
    //   452: ldc_w 901130001
    //   455: ixor
    //   456: ldc2_w -1013906378
    //   459: l2i
    //   460: ldc_w 885417449
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 492, -1914319362 -> 448, 1450584443 -> 2176
    //   492: aload_1
    //   493: getstatic Perryc.1 : I
    //   496: ifeq -> 510
    //   499: ldc2_w -1942195224
    //   502: l2i
    //   503: ldc_w 1157585791
    //   506: ixor
    //   507: goto -> 518
    //   510: ldc2_w 420721430
    //   513: l2i
    //   514: ldc_w 1002256973
    //   517: ixor
    //   518: ldc2_w 1321738703
    //   521: l2i
    //   522: ldc_w -1054912040
    //   525: ixor
    //   526: ixor
    //   527: lookupswitch default -> 552, 1192515712 -> 2150, 1873479976 -> 510
    //   552: getfield field_70161_v : D
    //   555: getstatic Perryc.1 : I
    //   558: ifeq -> 572
    //   561: ldc2_w 188717240
    //   564: l2i
    //   565: ldc_w -974513753
    //   568: ixor
    //   569: goto -> 580
    //   572: ldc2_w 228568922
    //   575: l2i
    //   576: ldc_w -2019245476
    //   579: ixor
    //   580: ldc2_w 1260948967
    //   583: l2i
    //   584: ldc_w -455233928
    //   587: ixor
    //   588: ixor
    //   589: lookupswitch default -> 2152, 634277529 -> 616, 1629528704 -> 572
    //   616: goto -> 620
    //   619: athrow
    //   620: invokestatic floor : (D)D
    //   623: goto -> 627
    //   626: athrow
    //   627: getstatic Perryc.0 : I
    //   630: ifle -> 644
    //   633: ldc2_w -1723680215
    //   636: l2i
    //   637: ldc_w -1378760262
    //   640: ixor
    //   641: goto -> 652
    //   644: ldc2_w 1055852811
    //   647: l2i
    //   648: ldc_w -57832442
    //   651: ixor
    //   652: ldc2_w -1137906501
    //   655: l2i
    //   656: ldc_w -869873434
    //   659: ixor
    //   660: ixor
    //   661: lookupswitch default -> 2164, -1301765808 -> 688, 1150900174 -> 644
    //   688: goto -> 692
    //   691: athrow
    //   692: invokespecial <init> : (DDD)V
    //   695: goto -> 699
    //   698: athrow
    //   699: getstatic Perryc.0 : I
    //   702: ifle -> 716
    //   705: ldc2_w 1254680679
    //   708: l2i
    //   709: ldc_w -1387192478
    //   712: ixor
    //   713: goto -> 724
    //   716: ldc2_w -1754035349
    //   719: l2i
    //   720: ldc_w -1760758789
    //   723: ixor
    //   724: ldc2_w -1839461210
    //   727: l2i
    //   728: ldc_w -1585208517
    //   731: ixor
    //   732: ixor
    //   733: lookupswitch default -> 760, -1233216484 -> 716, -733587304 -> 2132
    //   760: astore_2
    //   761: getstatic Perryc.1 : I
    //   764: ifeq -> 778
    //   767: ldc2_w -1347511341
    //   770: l2i
    //   771: ldc_w 2023674875
    //   774: ixor
    //   775: goto -> 786
    //   778: ldc2_w -1256796245
    //   781: l2i
    //   782: ldc_w 1285207857
    //   785: ixor
    //   786: ldc2_w 1278235489
    //   789: l2i
    //   790: ldc_w 729511176
    //   793: ixor
    //   794: ixor
    //   795: lookupswitch default -> 820, -1829202696 -> 778, -1334088127 -> 2158
    //   820: getstatic bigname/zprestige/webhack/features/modules/Render/BurrowESP.mc : Lnet/minecraft/client/Minecraft;
    //   823: getstatic Perryc.0 : I
    //   826: ifle -> 840
    //   829: ldc2_w 868680208
    //   832: l2i
    //   833: ldc_w -120315025
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w -1149286731
    //   843: l2i
    //   844: ldc_w 2023819362
    //   847: ixor
    //   848: ldc2_w -1008513927
    //   851: l2i
    //   852: ldc_w 1412168687
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 2144, 1410791745 -> 884, 1557894889 -> 840
    //   884: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   887: getstatic Perryc.0 : I
    //   890: ifle -> 904
    //   893: ldc2_w 862919867
    //   896: l2i
    //   897: ldc_w 1552314818
    //   900: ixor
    //   901: goto -> 912
    //   904: ldc2_w -1913001778
    //   907: l2i
    //   908: ldc_w 1066452383
    //   911: ixor
    //   912: ldc2_w 631286520
    //   915: l2i
    //   916: ldc_w -1317978851
    //   919: ixor
    //   920: ixor
    //   921: lookupswitch default -> 2170, -80151908 -> 904, 649640628 -> 948
    //   948: aload_2
    //   949: getstatic Perryc.1 : I
    //   952: ifeq -> 966
    //   955: ldc2_w -1387504192
    //   958: l2i
    //   959: ldc_w -1469553264
    //   962: ixor
    //   963: goto -> 974
    //   966: ldc2_w -406494021
    //   969: l2i
    //   970: ldc_w 1014619938
    //   973: ixor
    //   974: ldc2_w -30076756
    //   977: l2i
    //   978: ldc_w 1003441164
    //   981: ixor
    //   982: ixor
    //   983: lookupswitch default -> 1008, -1912641645 -> 966, -1059166992 -> 2166
    //   1008: goto -> 1012
    //   1011: athrow
    //   1012: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1015: goto -> 1019
    //   1018: athrow
    //   1019: getstatic Perryc.0 : I
    //   1022: ifle -> 1036
    //   1025: ldc2_w -25304796
    //   1028: l2i
    //   1029: ldc_w -2023117982
    //   1032: ixor
    //   1033: goto -> 1044
    //   1036: ldc2_w -6124255
    //   1039: l2i
    //   1040: ldc_w 644920563
    //   1043: ixor
    //   1044: ldc2_w 671239232
    //   1047: l2i
    //   1048: ldc_w 1667116469
    //   1051: ixor
    //   1052: ixor
    //   1053: lookupswitch default -> 2178, -1836165081 -> 1080, 843590579 -> 1036
    //   1080: goto -> 1084
    //   1083: athrow
    //   1084: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1089: goto -> 1093
    //   1092: athrow
    //   1093: getstatic Perryc.1 : I
    //   1096: ifeq -> 1110
    //   1099: ldc2_w 1072577326
    //   1102: l2i
    //   1103: ldc_w 219823867
    //   1106: ixor
    //   1107: goto -> 1118
    //   1110: ldc2_w 1165150927
    //   1113: l2i
    //   1114: ldc_w 677688176
    //   1117: ixor
    //   1118: ldc2_w -541752202
    //   1121: l2i
    //   1122: ldc_w -476542563
    //   1125: ixor
    //   1126: ixor
    //   1127: lookupswitch default -> 1152, -809184817 -> 1110, 249104446 -> 2128
    //   1152: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   1155: if_acmpeq -> 1169
    //   1158: ldc2_w -422154500
    //   1161: l2i
    //   1162: ldc_w -151941135
    //   1165: ixor
    //   1166: goto -> 1177
    //   1169: ldc2_w 1163334463
    //   1172: l2i
    //   1173: ldc_w 1433465393
    //   1176: ixor
    //   1177: ldc2_w -1633127566
    //   1180: l2i
    //   1181: ldc_w -679089026
    //   1184: ixor
    //   1185: ixor
    //   1186: tableswitch default -> 1158, 1493859841 -> 1208, 1493859842 -> 2104
    //   1208: getstatic Perryc.1 : I
    //   1211: ifeq -> 1225
    //   1214: ldc2_w 1724926907
    //   1217: l2i
    //   1218: ldc_w -3771054
    //   1221: ixor
    //   1222: goto -> 1233
    //   1225: ldc2_w -2137650629
    //   1228: l2i
    //   1229: ldc_w 1726220254
    //   1232: ixor
    //   1233: ldc2_w 287347054
    //   1236: l2i
    //   1237: ldc_w 2091697586
    //   1240: ixor
    //   1241: ixor
    //   1242: lookupswitch default -> 2174, -1946265287 -> 1268, -191206859 -> 1225
    //   1268: getstatic bigname/zprestige/webhack/features/modules/Render/BurrowESP.mc : Lnet/minecraft/client/Minecraft;
    //   1271: getstatic Perryc.c : I
    //   1274: iflt -> 1288
    //   1277: ldc2_w 208585693
    //   1280: l2i
    //   1281: ldc_w 723273395
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w 23500736
    //   1291: l2i
    //   1292: ldc_w -412019793
    //   1295: ixor
    //   1296: ldc2_w -715243420
    //   1299: l2i
    //   1300: ldc_w -1871487423
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1332, -824052364 -> 1288, 1650432843 -> 2136
    //   1332: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1335: getstatic Perryc.0 : I
    //   1338: ifle -> 1352
    //   1341: ldc2_w -1641180006
    //   1344: l2i
    //   1345: ldc_w -667399283
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w 1717577523
    //   1355: l2i
    //   1356: ldc_w -1452785620
    //   1359: ixor
    //   1360: ldc2_w -2070004607
    //   1363: l2i
    //   1364: ldc_w -663847419
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 2160, -1812453989 -> 1396, 451255699 -> 1352
    //   1396: aload_2
    //   1397: getstatic Perryc.0 : I
    //   1400: ifle -> 1414
    //   1403: ldc2_w 633287486
    //   1406: l2i
    //   1407: ldc_w 849403367
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w -151295557
    //   1417: l2i
    //   1418: ldc_w 120915872
    //   1421: ixor
    //   1422: ldc2_w -840474873
    //   1425: l2i
    //   1426: ldc_w -1814025369
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1456, 415460132 -> 1414, 1226349241 -> 2146
    //   1456: goto -> 1460
    //   1459: athrow
    //   1460: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1463: goto -> 1467
    //   1466: athrow
    //   1467: getstatic Perryc.0 : I
    //   1470: ifle -> 1484
    //   1473: ldc2_w 804532831
    //   1476: l2i
    //   1477: ldc_w 987241212
    //   1480: ixor
    //   1481: goto -> 1492
    //   1484: ldc2_w -556539758
    //   1487: l2i
    //   1488: ldc_w -403828816
    //   1491: ixor
    //   1492: ldc2_w -482373937
    //   1495: l2i
    //   1496: ldc_w -723529331
    //   1499: ixor
    //   1500: ixor
    //   1501: lookupswitch default -> 2134, 249409632 -> 1528, 583825377 -> 1484
    //   1528: goto -> 1532
    //   1531: athrow
    //   1532: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1537: goto -> 1541
    //   1540: athrow
    //   1541: getstatic Perryc.0 : I
    //   1544: ifle -> 1558
    //   1547: ldc2_w -1855099240
    //   1550: l2i
    //   1551: ldc_w -2056322962
    //   1554: ixor
    //   1555: goto -> 1566
    //   1558: ldc2_w -869537926
    //   1561: l2i
    //   1562: ldc_w -967420438
    //   1565: ixor
    //   1566: ldc2_w -1095525750
    //   1569: l2i
    //   1570: ldc_w 1413148863
    //   1573: ixor
    //   1574: ixor
    //   1575: lookupswitch default -> 2142, -520824667 -> 1600, -24443709 -> 1558
    //   1600: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   1603: if_acmpeq -> 1617
    //   1606: ldc2_w 1091491518
    //   1609: l2i
    //   1610: ldc_w -1479768962
    //   1613: ixor
    //   1614: goto -> 1625
    //   1617: ldc2_w -1077260448
    //   1620: l2i
    //   1621: ldc_w 1493704111
    //   1624: ixor
    //   1625: ldc2_w -171516960
    //   1628: l2i
    //   1629: ldc_w 221902343
    //   1632: ixor
    //   1633: ixor
    //   1634: tableswitch default -> 1606, 507346727 -> 1656, 507346728 -> 2104
    //   1656: getstatic Perryc.1 : I
    //   1659: ifeq -> 1673
    //   1662: ldc2_w -561850015
    //   1665: l2i
    //   1666: ldc_w 869054402
    //   1669: ixor
    //   1670: goto -> 1681
    //   1673: ldc2_w 435711231
    //   1676: l2i
    //   1677: ldc_w -2070031569
    //   1680: ixor
    //   1681: ldc2_w -798776624
    //   1684: l2i
    //   1685: ldc_w 970406230
    //   1688: ixor
    //   1689: ixor
    //   1690: lookupswitch default -> 2156, 83555621 -> 1673, 1959863382 -> 1716
    //   1716: getstatic bigname/zprestige/webhack/features/modules/Render/BurrowESP.mc : Lnet/minecraft/client/Minecraft;
    //   1719: getstatic Perryc.1 : I
    //   1722: ifeq -> 1736
    //   1725: ldc2_w 210111700
    //   1728: l2i
    //   1729: ldc_w -916614785
    //   1732: ixor
    //   1733: goto -> 1744
    //   1736: ldc2_w -1833569075
    //   1739: l2i
    //   1740: ldc_w 152182418
    //   1743: ixor
    //   1744: ldc2_w 1262756977
    //   1747: l2i
    //   1748: ldc_w 207819
    //   1751: ixor
    //   1752: ixor
    //   1753: lookupswitch default -> 2130, -1902341615 -> 1736, -790567451 -> 1780
    //   1780: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 135058661
    //   1792: l2i
    //   1793: ldc_w 1021291003
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -1520068750
    //   1803: l2i
    //   1804: ldc_w -352184540
    //   1807: ixor
    //   1808: ldc2_w -910851056
    //   1811: l2i
    //   1812: ldc_w -480976075
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, -998785226 -> 1800, 506599995 -> 2172
    //   1844: aload_2
    //   1845: getstatic Perryc.1 : I
    //   1848: ifeq -> 1862
    //   1851: ldc2_w -1243261753
    //   1854: l2i
    //   1855: ldc_w -110310915
    //   1858: ixor
    //   1859: goto -> 1870
    //   1862: ldc2_w 51616641
    //   1865: l2i
    //   1866: ldc_w 471310892
    //   1869: ixor
    //   1870: ldc2_w -929915708
    //   1873: l2i
    //   1874: ldc_w 1564324295
    //   1877: ixor
    //   1878: ixor
    //   1879: lookupswitch default -> 2126, -1968499538 -> 1904, -651775943 -> 1862
    //   1904: goto -> 1908
    //   1907: athrow
    //   1908: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1911: goto -> 1915
    //   1914: athrow
    //   1915: getstatic Perryc.0 : I
    //   1918: ifle -> 1932
    //   1921: ldc2_w 789929042
    //   1924: l2i
    //   1925: ldc_w 841595486
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w -1445526033
    //   1935: l2i
    //   1936: ldc_w -571755037
    //   1939: ixor
    //   1940: ldc2_w 79054291
    //   1943: l2i
    //   1944: ldc_w 1163462248
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 1976, 397373071 -> 1932, 1557374391 -> 2180
    //   1976: goto -> 1980
    //   1979: athrow
    //   1980: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1985: goto -> 1989
    //   1988: athrow
    //   1989: getstatic Perryc.0 : I
    //   1992: ifle -> 2006
    //   1995: ldc2_w -705226372
    //   1998: l2i
    //   1999: ldc_w 731132707
    //   2002: ixor
    //   2003: goto -> 2014
    //   2006: ldc2_w 105890846
    //   2009: l2i
    //   2010: ldc_w 603724625
    //   2013: ixor
    //   2014: ldc2_w 1092831348
    //   2017: l2i
    //   2018: ldc_w 382303621
    //   2021: ixor
    //   2022: ixor
    //   2023: lookupswitch default -> 2154, -1450631250 -> 2006, 1918495422 -> 2048
    //   2048: getstatic net/minecraft/init/Blocks.field_150486_ae : Lnet/minecraft/block/BlockChest;
    //   2051: if_acmpne -> 2065
    //   2054: ldc2_w -1954375883
    //   2057: l2i
    //   2058: ldc_w -1429594014
    //   2061: ixor
    //   2062: goto -> 2073
    //   2065: ldc2_w -1262982676
    //   2068: l2i
    //   2069: ldc_w -1779376454
    //   2072: ixor
    //   2073: ldc2_w -1066956040
    //   2076: l2i
    //   2077: ldc_w 597768931
    //   2080: ixor
    //   2081: ixor
    //   2082: tableswitch default -> 2054, -1030879412 -> 2104, -1030879411 -> 2115
    //   2104: ldc2_w 501494424
    //   2107: l2i
    //   2108: ldc_w 501494425
    //   2111: ixor
    //   2112: goto -> 2123
    //   2115: ldc2_w 1817647677
    //   2118: l2i
    //   2119: ldc_w 1817647677
    //   2122: ixor
    //   2123: ireturn
    //   2124: aconst_null
    //   2125: athrow
    //   2126: aconst_null
    //   2127: athrow
    //   2128: aconst_null
    //   2129: athrow
    //   2130: aconst_null
    //   2131: athrow
    //   2132: aconst_null
    //   2133: athrow
    //   2134: aconst_null
    //   2135: athrow
    //   2136: aconst_null
    //   2137: athrow
    //   2138: aconst_null
    //   2139: athrow
    //   2140: aconst_null
    //   2141: athrow
    //   2142: aconst_null
    //   2143: athrow
    //   2144: aconst_null
    //   2145: athrow
    //   2146: aconst_null
    //   2147: athrow
    //   2148: aconst_null
    //   2149: athrow
    //   2150: aconst_null
    //   2151: athrow
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
    //   2182: pop
    //   2183: goto -> 24
    //   2186: pop
    //   2187: aconst_null
    //   2188: goto -> 2182
    //   2191: dup
    //   2192: ifnull -> 2182
    //   2195: checkcast java/lang/Throwable
    //   2198: athrow
    //   2199: dup
    //   2200: ifnull -> 2186
    //   2203: checkcast java/lang/Throwable
    //   2206: athrow
    //   2207: aconst_null
    //   2208: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2100	0	this	Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;
    //   24	2100	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   761	1363	2	pos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	2191	java/util/ConcurrentModificationException
    //   215	222	222	finally
    //   215	222	3	java/lang/UnsupportedOperationException
    //   215	222	222	java/lang/UnsupportedOperationException
    //   216	222	215	java/lang/ArithmeticException
    //   216	222	222	java/lang/ArithmeticException
    //   423	430	430	finally
    //   423	430	430	java/lang/IllegalStateException
    //   423	430	430	java/lang/IllegalArgumentException
    //   423	430	423	java/lang/IllegalArgumentException
    //   424	430	423	finally
    //   619	626	626	finally
    //   619	626	619	finally
    //   620	626	3	finally
    //   620	626	626	finally
    //   620	626	626	java/lang/NegativeArraySizeException
    //   691	698	698	finally
    //   691	698	691	java/lang/ArrayIndexOutOfBoundsException
    //   691	698	3	java/lang/NumberFormatException
    //   691	698	691	java/lang/ArrayIndexOutOfBoundsException
    //   692	698	691	finally
    //   1011	1018	1018	finally
    //   1011	1018	3	java/lang/ArithmeticException
    //   1011	1018	1011	finally
    //   1011	1018	1011	java/lang/IndexOutOfBoundsException
    //   1012	1018	1018	java/lang/ArrayIndexOutOfBoundsException
    //   1083	1092	1092	finally
    //   1084	1092	1092	java/lang/IllegalArgumentException
    //   1084	1092	3	finally
    //   1084	1092	3	finally
    //   1084	1092	1083	java/lang/IllegalStateException
    //   1459	1466	1466	finally
    //   1459	1466	1466	java/lang/StringIndexOutOfBoundsException
    //   1460	1466	1466	java/lang/IllegalArgumentException
    //   1460	1466	3	java/lang/RuntimeException
    //   1460	1466	1459	finally
    //   1531	1540	1540	finally
    //   1531	1540	3	finally
    //   1531	1540	1531	java/lang/IllegalArgumentException
    //   1531	1540	1540	finally
    //   1532	1540	1540	java/lang/EnumConstantNotPresentException
    //   1907	1914	1914	finally
    //   1907	1914	3	finally
    //   1907	1914	1907	finally
    //   1907	1914	1914	java/lang/ClassCastException
    //   1908	1914	1907	java/lang/StringIndexOutOfBoundsException
    //   1979	1988	1988	finally
    //   1979	1988	1988	finally
    //   1979	1988	1979	finally
    //   1979	1988	3	java/lang/EnumConstantNotPresentException
    //   1980	1988	1979	finally
    //   2191	2199	2191	finally
    //   2207	2209	3	finally
  }
  
  public boolean lambda$new$5(Integer paramInteger) {
    return Perry1.5n(this, (int)1398495786L ^ 0x1641143A, paramInteger);
  }
  
  public void onEnable() {
    Perry1.4a(this, (int)846102124L ^ 0x428332B5);
  }
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 655
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 647
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 639
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -890317409
    //   33: l2i
    //   34: ldc_w -1016343183
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1756253421
    //   44: l2i
    //   45: ldc_w -1806981527
    //   48: ixor
    //   49: ldc2_w -2092043641
    //   52: l2i
    //   53: ldc_w -933607885
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 624, -1208852944 -> 84, 1116910682 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -1639621376
    //   94: l2i
    //   95: ldc_w 787635115
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -472453972
    //   105: l2i
    //   106: ldc_w 14269754
    //   109: ixor
    //   110: ldc2_w 319119565
    //   113: l2i
    //   114: ldc_w 561159021
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -2101281525 -> 626, -1920449016 -> 102
    //   144: getfield burrowedPlayers : Ljava/util/Map;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w 1655825963
    //   156: l2i
    //   157: ldc_w 518884445
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 2082793237
    //   167: l2i
    //   168: ldc_w -1531640761
    //   171: ixor
    //   172: ldc2_w -1881707124
    //   175: l2i
    //   176: ldc_w 1704324262
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -1776358564 -> 620, -965856992 -> 164
    //   208: goto -> 212
    //   211: athrow
    //   212: invokeinterface isEmpty : ()Z
    //   217: goto -> 221
    //   220: athrow
    //   221: ifne -> 235
    //   224: ldc2_w -1518826149
    //   227: l2i
    //   228: ldc_w 891391239
    //   231: ixor
    //   232: goto -> 243
    //   235: ldc2_w -427247746
    //   238: l2i
    //   239: ldc_w 1993455397
    //   242: ixor
    //   243: ldc2_w 929334302
    //   246: l2i
    //   247: ldc_w 249922257
    //   250: ixor
    //   251: ixor
    //   252: tableswitch default -> 224, -1445460333 -> 276, -1445460332 -> 613
    //   276: getstatic Perryc.1 : I
    //   279: ifeq -> 293
    //   282: ldc2_w -1578463401
    //   285: l2i
    //   286: ldc_w -1785259692
    //   289: ixor
    //   290: goto -> 301
    //   293: ldc2_w 448975309
    //   296: l2i
    //   297: ldc_w -1194639167
    //   300: ixor
    //   301: ldc2_w 169744033
    //   304: l2i
    //   305: ldc_w -1998104806
    //   308: ixor
    //   309: ixor
    //   310: lookupswitch default -> 622, -1232808008 -> 293, 552652983 -> 336
    //   336: aload_0
    //   337: getstatic Perryc.1 : I
    //   340: ifeq -> 354
    //   343: ldc2_w -1485282457
    //   346: l2i
    //   347: ldc_w -1090913267
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -1569216676
    //   357: l2i
    //   358: ldc_w 264378755
    //   361: ixor
    //   362: ldc2_w -1992500396
    //   365: l2i
    //   366: ldc_w -1077685058
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 396, 796823680 -> 618, 2079522710 -> 354
    //   396: getfield burrowedPlayers : Ljava/util/Map;
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 1387337884
    //   408: l2i
    //   409: ldc_w 1023130968
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -2140901887
    //   419: l2i
    //   420: ldc_w -763553448
    //   423: ixor
    //   424: ldc2_w -411433113
    //   427: l2i
    //   428: ldc_w -1431790398
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 616, 533458172 -> 460, 597180001 -> 416
    //   460: goto -> 464
    //   463: athrow
    //   464: invokeinterface entrySet : ()Ljava/util/Set;
    //   469: goto -> 473
    //   472: athrow
    //   473: getstatic Perryc.0 : I
    //   476: ifle -> 490
    //   479: ldc2_w -658127258
    //   482: l2i
    //   483: ldc_w 2123847222
    //   486: ixor
    //   487: goto -> 498
    //   490: ldc2_w -356894598
    //   493: l2i
    //   494: ldc_w 2091351081
    //   497: ixor
    //   498: ldc2_w 1833276743
    //   501: l2i
    //   502: ldc_w 1229950118
    //   505: ixor
    //   506: ixor
    //   507: lookupswitch default -> 628, -2108126799 -> 490, -1307091534 -> 532
    //   532: aload_0
    //   533: <illegal opcode> accept : (Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;)Ljava/util/function/Consumer;
    //   538: getstatic Perryc.c : I
    //   541: iflt -> 555
    //   544: ldc2_w -1108853560
    //   547: l2i
    //   548: ldc_w -881329864
    //   551: ixor
    //   552: goto -> 563
    //   555: ldc2_w 2083621134
    //   558: l2i
    //   559: ldc_w -1670301190
    //   562: ixor
    //   563: ldc2_w -1717607997
    //   566: l2i
    //   567: ldc_w 741853696
    //   570: ixor
    //   571: ixor
    //   572: lookupswitch default -> 600, -1019777485 -> 614, -365394917 -> 555
    //   600: goto -> 604
    //   603: athrow
    //   604: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   609: goto -> 613
    //   612: athrow
    //   613: return
    //   614: aconst_null
    //   615: athrow
    //   616: aconst_null
    //   617: athrow
    //   618: aconst_null
    //   619: athrow
    //   620: aconst_null
    //   621: athrow
    //   622: aconst_null
    //   623: athrow
    //   624: aconst_null
    //   625: athrow
    //   626: aconst_null
    //   627: athrow
    //   628: aconst_null
    //   629: athrow
    //   630: pop
    //   631: goto -> 24
    //   634: pop
    //   635: aconst_null
    //   636: goto -> 630
    //   639: dup
    //   640: ifnull -> 630
    //   643: checkcast java/lang/Throwable
    //   646: athrow
    //   647: dup
    //   648: ifnull -> 634
    //   651: checkcast java/lang/Throwable
    //   654: athrow
    //   655: aconst_null
    //   656: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	590	0	this	Lbigname/zprestige/webhack/features/modules/Render/BurrowESP;
    //   24	590	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	639	finally
    //   211	220	220	finally
    //   211	220	3	finally
    //   211	220	211	finally
    //   212	220	211	java/lang/UnsupportedOperationException
    //   212	220	211	finally
    //   464	472	472	finally
    //   464	472	3	java/lang/UnsupportedOperationException
    //   464	472	3	java/lang/IllegalArgumentException
    //   464	472	3	java/lang/NullPointerException
    //   464	472	472	java/lang/ArrayIndexOutOfBoundsException
    //   603	612	612	finally
    //   603	612	612	java/lang/ArithmeticException
    //   604	612	612	java/lang/IllegalArgumentException
    //   604	612	3	java/lang/IllegalArgumentException
    //   604	612	603	java/lang/NumberFormatException
    //   639	647	639	java/lang/ClassCastException
    //   655	657	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public void getPlayers() {
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
  
  public boolean lambda$new$0(Integer paramInteger) {
    return Perry1.5s(this, (int)1268339859L ^ 0x109E642F, paramInteger);
  }
  
  public boolean lambda$new$3(Integer paramInteger) {
    return Perry1.5f(this, (int)1010996821L ^ 0xE94F6BA, paramInteger);
  }
  
  public void onUpdate() {
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
  
  public boolean lambda$new$2(Integer paramInteger) {
    return Perry1.5p(this, (int)-1818502423L ^ 0xA300045D, paramInteger);
  }
  
  public boolean lambda$new$7(Integer paramInteger) {
    return Perry1.5m(this, (int)-357460674L ^ 0xE2ADC4F0, paramInteger);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5f(this, (int)-685989133L ^ 0xE5CAC21D, paramInteger);
  }
  
  public boolean lambda$new$4(Integer paramInteger) {
    return Perry1.5v(this, (int)1909600178L ^ 0x7EFC6AC4, paramInteger);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\BurrowESP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */