package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class AutoWeb extends Module {
  public Setting<Boolean> render;
  
  public BlockPos renderPos;
  
  public Setting<Integer> cRed;
  
  public Setting<Boolean> Rainbow;
  
  public Setting<Boolean> packet;
  
  public int lastHotbarSlot;
  
  public boolean switchedItem;
  
  public Setting<Boolean> raytrace;
  
  public Setting<Integer> delay;
  
  public Setting<Float> lineWidth;
  
  public BlockPos startPos;
  
  public Setting<Integer> cAlpha;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Boolean> box;
  
  public Setting<Boolean> cRainbow;
  
  public Setting<Boolean> lowerbody;
  
  public static boolean isPlacing = (int)54715916L ^ 0x342E60C;
  
  public boolean didPlace;
  
  public Setting<Boolean> disable;
  
  public Setting<Integer> alpha;
  
  public Setting<Integer> red;
  
  public Setting<Integer> cBlue;
  
  public Setting<Integer> cGreen;
  
  public boolean isSneaking;
  
  public Setting<Integer> blocksPerPlace;
  
  public boolean smartRotate;
  
  public int placements;
  
  public EntityPlayer target;
  
  public Setting<Boolean> rotate;
  
  public Timer timer;
  
  public Setting<Integer> green;
  
  public Setting<Integer> blue;
  
  public Setting<Boolean> outline;
  
  public Setting<Boolean> upperBody;
  
  public boolean check() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5483
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 5475
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5467
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w 624223411
    //   27: l2i
    //   28: ldc 624223411
    //   30: ixor
    //   31: getstatic Perryc.0 : I
    //   34: ifle -> 47
    //   37: ldc2_w 401222540
    //   40: l2i
    //   41: ldc 1477911715
    //   43: ixor
    //   44: goto -> 54
    //   47: ldc2_w 1896942807
    //   50: l2i
    //   51: ldc -288235283
    //   53: ixor
    //   54: ldc2_w -104339955
    //   57: l2i
    //   58: ldc -1410076467
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 5428, -839582982 -> 88, 499718639 -> 47
    //   88: putstatic bigname/zprestige/webhack/features/modules/Combat/AutoWeb.isPlacing : Z
    //   91: getstatic Perryc.1 : I
    //   94: ifeq -> 107
    //   97: ldc2_w -585292406
    //   100: l2i
    //   101: ldc 832016373
    //   103: ixor
    //   104: goto -> 114
    //   107: ldc2_w 851821648
    //   110: l2i
    //   111: ldc -251407023
    //   113: ixor
    //   114: ldc2_w 1105060983
    //   117: l2i
    //   118: ldc 1677581443
    //   120: ixor
    //   121: ixor
    //   122: lookupswitch default -> 5358, -827682165 -> 107, -505009675 -> 148
    //   148: aload_0
    //   149: ldc2_w -2126972236
    //   152: l2i
    //   153: ldc -2126972236
    //   155: ixor
    //   156: getstatic Perryc.0 : I
    //   159: ifle -> 172
    //   162: ldc2_w -1080401436
    //   165: l2i
    //   166: ldc -60712820
    //   168: ixor
    //   169: goto -> 179
    //   172: ldc2_w -1809433932
    //   175: l2i
    //   176: ldc 423685898
    //   178: ixor
    //   179: ldc2_w -1670021762
    //   182: l2i
    //   183: ldc -682202191
    //   185: ixor
    //   186: ixor
    //   187: lookupswitch default -> 212, 148434855 -> 5354, 241326993 -> 172
    //   212: putfield didPlace : Z
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 231
    //   221: ldc2_w 593061262
    //   224: l2i
    //   225: ldc -1311183799
    //   227: ixor
    //   228: goto -> 238
    //   231: ldc2_w 738994869
    //   234: l2i
    //   235: ldc -530028647
    //   237: ixor
    //   238: ldc2_w -1161727585
    //   241: l2i
    //   242: ldc -1245665020
    //   244: ixor
    //   245: ixor
    //   246: lookupswitch default -> 5424, -1652534948 -> 231, -1016752713 -> 272
    //   272: aload_0
    //   273: ldc2_w -313272166
    //   276: l2i
    //   277: ldc -313272166
    //   279: ixor
    //   280: getstatic Perryc.c : I
    //   283: iflt -> 296
    //   286: ldc2_w 1141954327
    //   289: l2i
    //   290: ldc -1802628366
    //   292: ixor
    //   293: goto -> 303
    //   296: ldc2_w 1832998033
    //   299: l2i
    //   300: ldc 209736312
    //   302: ixor
    //   303: ldc2_w -1076542182
    //   306: l2i
    //   307: ldc 1829540866
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 336, 38212861 -> 5452, 382239381 -> 296
    //   336: putfield placements : I
    //   339: ldc net/minecraft/block/BlockWeb
    //   341: getstatic Perryc.1 : I
    //   344: ifeq -> 357
    //   347: ldc2_w -1362256892
    //   350: l2i
    //   351: ldc -1348299157
    //   353: ixor
    //   354: goto -> 364
    //   357: ldc2_w -2071947701
    //   360: l2i
    //   361: ldc -950843833
    //   363: ixor
    //   364: ldc2_w 690483306
    //   367: l2i
    //   368: ldc 1957226149
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 5332, 509396675 -> 400, 1558191264 -> 357
    //   400: goto -> 404
    //   403: athrow
    //   404: invokestatic findHotbarBlock : (Ljava/lang/Class;)I
    //   407: goto -> 411
    //   410: athrow
    //   411: getstatic Perryc.1 : I
    //   414: ifeq -> 427
    //   417: ldc2_w -182263089
    //   420: l2i
    //   421: ldc -498640324
    //   423: ixor
    //   424: goto -> 434
    //   427: ldc2_w -613498975
    //   430: l2i
    //   431: ldc -1219116376
    //   433: ixor
    //   434: ldc2_w -1640436239
    //   437: l2i
    //   438: ldc 292716966
    //   440: ixor
    //   441: ixor
    //   442: lookupswitch default -> 468, -1741695836 -> 5348, 2031924513 -> 427
    //   468: istore_1
    //   469: getstatic Perryc.c : I
    //   472: iflt -> 485
    //   475: ldc2_w 1251319609
    //   478: l2i
    //   479: ldc 99331632
    //   481: ixor
    //   482: goto -> 492
    //   485: ldc2_w -691760603
    //   488: l2i
    //   489: ldc -1551655617
    //   491: ixor
    //   492: ldc2_w 1694879388
    //   495: l2i
    //   496: ldc 231659339
    //   498: ixor
    //   499: ixor
    //   500: lookupswitch default -> 528, -449924774 -> 485, 666183902 -> 5384
    //   528: aload_0
    //   529: getstatic Perryc.1 : I
    //   532: ifeq -> 545
    //   535: ldc2_w -1500477039
    //   538: l2i
    //   539: ldc -1154247000
    //   541: ixor
    //   542: goto -> 552
    //   545: ldc2_w -1486638341
    //   548: l2i
    //   549: ldc -1419579905
    //   551: ixor
    //   552: ldc2_w 404187288
    //   555: l2i
    //   556: ldc -508186281
    //   558: ixor
    //   559: ixor
    //   560: lookupswitch default -> 588, -1112561060 -> 545, -469645578 -> 5416
    //   588: goto -> 592
    //   591: athrow
    //   592: invokevirtual isOff : ()Z
    //   595: goto -> 599
    //   598: athrow
    //   599: ifeq -> 612
    //   602: ldc2_w -104439568
    //   605: l2i
    //   606: ldc 911467643
    //   608: ixor
    //   609: goto -> 619
    //   612: ldc2_w -2141399057
    //   615: l2i
    //   616: ldc 1338594149
    //   618: ixor
    //   619: ldc2_w -1451787881
    //   622: l2i
    //   623: ldc 1308013598
    //   625: ixor
    //   626: ixor
    //   627: tableswitch default -> 602, 722749698 -> 648, 722749699 -> 656
    //   648: ldc2_w 225078308
    //   651: l2i
    //   652: ldc 225078309
    //   654: ixor
    //   655: ireturn
    //   656: getstatic Perryc.0 : I
    //   659: ifle -> 672
    //   662: ldc2_w -1195195526
    //   665: l2i
    //   666: ldc 539961792
    //   668: ixor
    //   669: goto -> 679
    //   672: ldc2_w -433441764
    //   675: l2i
    //   676: ldc 225588283
    //   678: ixor
    //   679: ldc2_w -318377265
    //   682: l2i
    //   683: ldc 1848921421
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 712, -1697471568 -> 672, 467424568 -> 5436
    //   712: aload_0
    //   713: getstatic Perryc.1 : I
    //   716: ifeq -> 729
    //   719: ldc2_w 1621374486
    //   722: l2i
    //   723: ldc -1799984876
    //   725: ixor
    //   726: goto -> 736
    //   729: ldc2_w 1614223206
    //   732: l2i
    //   733: ldc -495321386
    //   735: ixor
    //   736: ldc2_w -2106048227
    //   739: l2i
    //   740: ldc 235514357
    //   742: ixor
    //   743: ixor
    //   744: lookupswitch default -> 5420, 239010136 -> 772, 2019801066 -> 729
    //   772: getfield disable : Lbigname/zprestige/webhack/features/setting/Setting;
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 791
    //   781: ldc2_w 1603875135
    //   784: l2i
    //   785: ldc 448358886
    //   787: ixor
    //   788: goto -> 798
    //   791: ldc2_w 466811282
    //   794: l2i
    //   795: ldc -615701692
    //   797: ixor
    //   798: ldc2_w -279683632
    //   801: l2i
    //   802: ldc -1088205283
    //   804: ixor
    //   805: ixor
    //   806: lookupswitch default -> 832, 358042388 -> 5338, 1585309223 -> 791
    //   832: goto -> 836
    //   835: athrow
    //   836: invokevirtual getValue : ()Ljava/lang/Object;
    //   839: goto -> 843
    //   842: athrow
    //   843: checkcast java/lang/Boolean
    //   846: getstatic Perryc.0 : I
    //   849: ifle -> 862
    //   852: ldc2_w 1237339230
    //   855: l2i
    //   856: ldc 472651426
    //   858: ixor
    //   859: goto -> 870
    //   862: ldc2_w 1699840637
    //   865: l2i
    //   866: ldc_w -1552576198
    //   869: ixor
    //   870: ldc2_w -1432223668
    //   873: l2i
    //   874: ldc_w 2069609585
    //   877: ixor
    //   878: ixor
    //   879: lookupswitch default -> 904, -2078939455 -> 5402, -1929720717 -> 862
    //   904: goto -> 908
    //   907: athrow
    //   908: invokevirtual booleanValue : ()Z
    //   911: goto -> 915
    //   914: athrow
    //   915: ifeq -> 929
    //   918: ldc2_w -1674792849
    //   921: l2i
    //   922: ldc_w -1744742863
    //   925: ixor
    //   926: goto -> 937
    //   929: ldc2_w 1773698145
    //   932: l2i
    //   933: ldc_w 1838520894
    //   936: ixor
    //   937: ldc2_w -1535522455
    //   940: l2i
    //   941: ldc_w 1465022167
    //   944: ixor
    //   945: ixor
    //   946: tableswitch default -> 918, -150578720 -> 968, -150578719 -> 1556
    //   968: getstatic Perryc.0 : I
    //   971: ifle -> 985
    //   974: ldc2_w 1586535901
    //   977: l2i
    //   978: ldc_w -360738547
    //   981: ixor
    //   982: goto -> 993
    //   985: ldc2_w -769984687
    //   988: l2i
    //   989: ldc_w -1262807841
    //   992: ixor
    //   993: ldc2_w 388256014
    //   996: l2i
    //   997: ldc_w 1615312039
    //   1000: ixor
    //   1001: ixor
    //   1002: lookupswitch default -> 1028, -1014175367 -> 5394, 784543264 -> 985
    //   1028: aload_0
    //   1029: getstatic Perryc.1 : I
    //   1032: ifeq -> 1046
    //   1035: ldc2_w 1339691215
    //   1038: l2i
    //   1039: ldc_w 1448404877
    //   1042: ixor
    //   1043: goto -> 1054
    //   1046: ldc2_w -1002569976
    //   1049: l2i
    //   1050: ldc_w 628512190
    //   1053: ixor
    //   1054: ldc2_w 1281070591
    //   1057: l2i
    //   1058: ldc_w 1303376202
    //   1061: ixor
    //   1062: ixor
    //   1063: lookupswitch default -> 5326, -524300797 -> 1088, 410686455 -> 1046
    //   1088: getfield startPos : Lnet/minecraft/util/math/BlockPos;
    //   1091: getstatic Perryc.0 : I
    //   1094: ifle -> 1108
    //   1097: ldc2_w 1977995198
    //   1100: l2i
    //   1101: ldc_w -170912757
    //   1104: ixor
    //   1105: goto -> 1116
    //   1108: ldc2_w -1783397050
    //   1111: l2i
    //   1112: ldc_w 1251360350
    //   1115: ixor
    //   1116: ldc2_w 1918363247
    //   1119: l2i
    //   1120: ldc_w 798271959
    //   1123: ixor
    //   1124: ixor
    //   1125: lookupswitch default -> 1152, -571042803 -> 5456, -513644106 -> 1108
    //   1152: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoWeb.mc : Lnet/minecraft/client/Minecraft;
    //   1155: getstatic Perryc.0 : I
    //   1158: ifle -> 1172
    //   1161: ldc2_w 119711585
    //   1164: l2i
    //   1165: ldc_w -438049048
    //   1168: ixor
    //   1169: goto -> 1180
    //   1172: ldc2_w 1694863037
    //   1175: l2i
    //   1176: ldc_w 975730062
    //   1179: ixor
    //   1180: ldc2_w -714350171
    //   1183: l2i
    //   1184: ldc_w 1598231407
    //   1187: ixor
    //   1188: ixor
    //   1189: lookupswitch default -> 5412, -721090055 -> 1216, 1760146243 -> 1172
    //   1216: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1219: getstatic Perryc.0 : I
    //   1222: ifle -> 1236
    //   1225: ldc2_w -775513416
    //   1228: l2i
    //   1229: ldc_w 231347013
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -1370965426
    //   1239: l2i
    //   1240: ldc_w -2062280509
    //   1243: ixor
    //   1244: ldc2_w -177881421
    //   1247: l2i
    //   1248: ldc_w 1052434531
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 5364, -528221091 -> 1280, 399759149 -> 1236
    //   1280: goto -> 1284
    //   1283: athrow
    //   1284: invokestatic getRoundedBlockPos : (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos;
    //   1287: goto -> 1291
    //   1290: athrow
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w 1054592666
    //   1300: l2i
    //   1301: ldc_w 1721186344
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w -311885095
    //   1311: l2i
    //   1312: ldc_w -1789263807
    //   1315: ixor
    //   1316: ldc2_w 63405477
    //   1319: l2i
    //   1320: ldc_w 610738773
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 5396, 1603493224 -> 1352, 2146216258 -> 1308
    //   1352: goto -> 1356
    //   1355: athrow
    //   1356: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1359: goto -> 1363
    //   1362: athrow
    //   1363: ifne -> 1377
    //   1366: ldc2_w 203286327
    //   1369: l2i
    //   1370: ldc_w 1609084626
    //   1373: ixor
    //   1374: goto -> 1385
    //   1377: ldc2_w 1453723132
    //   1380: l2i
    //   1381: ldc_w 89343000
    //   1384: ixor
    //   1385: ldc2_w -820437689
    //   1388: l2i
    //   1389: ldc_w -2130865658
    //   1392: ixor
    //   1393: ixor
    //   1394: tableswitch default -> 1366, 470927012 -> 1416, 470927013 -> 1556
    //   1416: getstatic Perryc.c : I
    //   1419: iflt -> 1433
    //   1422: ldc2_w -1638831907
    //   1425: l2i
    //   1426: ldc_w 319092553
    //   1429: ixor
    //   1430: goto -> 1441
    //   1433: ldc2_w 969239815
    //   1436: l2i
    //   1437: ldc_w 787999366
    //   1440: ixor
    //   1441: ldc2_w 1700105450
    //   1444: l2i
    //   1445: ldc_w -405419717
    //   1448: ixor
    //   1449: ixor
    //   1450: lookupswitch default -> 1476, -1320975257 -> 1433, 265673285 -> 5368
    //   1476: aload_0
    //   1477: getstatic Perryc.1 : I
    //   1480: ifeq -> 1494
    //   1483: ldc2_w 817625678
    //   1486: l2i
    //   1487: ldc_w -439540644
    //   1490: ixor
    //   1491: goto -> 1502
    //   1494: ldc2_w -1720792200
    //   1497: l2i
    //   1498: ldc_w 2007782340
    //   1501: ixor
    //   1502: ldc2_w -657247714
    //   1505: l2i
    //   1506: ldc_w 1866479302
    //   1509: ixor
    //   1510: ixor
    //   1511: lookupswitch default -> 5324, 1498520676 -> 1536, 1659230922 -> 1494
    //   1536: goto -> 1540
    //   1539: athrow
    //   1540: invokevirtual disable : ()V
    //   1543: goto -> 1547
    //   1546: athrow
    //   1547: ldc2_w -1265993310
    //   1550: l2i
    //   1551: ldc_w -1265993309
    //   1554: ixor
    //   1555: ireturn
    //   1556: getstatic Perryc.c : I
    //   1559: iflt -> 1573
    //   1562: ldc2_w 825178848
    //   1565: l2i
    //   1566: ldc_w 212262243
    //   1569: ixor
    //   1570: goto -> 1581
    //   1573: ldc2_w 969688785
    //   1576: l2i
    //   1577: ldc_w 423776408
    //   1580: ixor
    //   1581: ldc2_w 1373346753
    //   1584: l2i
    //   1585: ldc_w 937491209
    //   1588: ixor
    //   1589: ixor
    //   1590: lookupswitch default -> 1616, -1508150864 -> 1573, 1538426699 -> 5380
    //   1616: iload_1
    //   1617: ldc2_w 741705350
    //   1620: l2i
    //   1621: ldc_w -741705351
    //   1624: ixor
    //   1625: if_icmpne -> 1639
    //   1628: ldc2_w 695515404
    //   1631: l2i
    //   1632: ldc_w 1130018582
    //   1635: ixor
    //   1636: goto -> 1647
    //   1639: ldc2_w 2062562964
    //   1642: l2i
    //   1643: ldc_w 282998927
    //   1646: ixor
    //   1647: ldc2_w -972122408
    //   1650: l2i
    //   1651: ldc_w 1148240460
    //   1654: ixor
    //   1655: ixor
    //   1656: tableswitch default -> 1628, -397387122 -> 1680, -397387121 -> 2680
    //   1680: new java/lang/StringBuilder
    //   1683: dup
    //   1684: getstatic Perryc.0 : I
    //   1687: ifle -> 1701
    //   1690: ldc2_w 1469679164
    //   1693: l2i
    //   1694: ldc_w 1353973828
    //   1697: ixor
    //   1698: goto -> 1709
    //   1701: ldc2_w -1725562414
    //   1704: l2i
    //   1705: ldc_w 229748715
    //   1708: ixor
    //   1709: ldc2_w -911338415
    //   1712: l2i
    //   1713: ldc_w 1658452169
    //   1716: ixor
    //   1717: ixor
    //   1718: lookupswitch default -> 1744, -1403360544 -> 5318, -437077650 -> 1701
    //   1744: goto -> 1748
    //   1747: athrow
    //   1748: invokespecial <init> : ()V
    //   1751: goto -> 1755
    //   1754: athrow
    //   1755: ldc_w ''
    //   1758: getstatic Perryc.1 : I
    //   1761: ifeq -> 1775
    //   1764: ldc2_w -1237091931
    //   1767: l2i
    //   1768: ldc_w 1333478212
    //   1771: ixor
    //   1772: goto -> 1783
    //   1775: ldc2_w -437692457
    //   1778: l2i
    //   1779: ldc_w 651224234
    //   1782: ixor
    //   1783: ldc2_w -1055209303
    //   1786: l2i
    //   1787: ldc_w 464175571
    //   1790: ixor
    //   1791: ixor
    //   1792: lookupswitch default -> 5410, 428456455 -> 1820, 596128667 -> 1775
    //   1820: goto -> 1824
    //   1823: athrow
    //   1824: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1827: goto -> 1831
    //   1830: athrow
    //   1831: getstatic Perryc.c : I
    //   1834: iflt -> 1848
    //   1837: ldc2_w -1828714355
    //   1840: l2i
    //   1841: ldc_w -219819380
    //   1844: ixor
    //   1845: goto -> 1856
    //   1848: ldc2_w 1427111195
    //   1851: l2i
    //   1852: ldc_w 883652928
    //   1855: ixor
    //   1856: ldc2_w 530357282
    //   1859: l2i
    //   1860: ldc_w -1647094228
    //   1863: ixor
    //   1864: ixor
    //   1865: lookupswitch default -> 1892, -957133574 -> 1848, -475394033 -> 5340
    //   1892: aload_0
    //   1893: getstatic Perryc.c : I
    //   1896: iflt -> 1910
    //   1899: ldc2_w 1114820602
    //   1902: l2i
    //   1903: ldc_w -125801955
    //   1906: ixor
    //   1907: goto -> 1918
    //   1910: ldc2_w -497300084
    //   1913: l2i
    //   1914: ldc_w -948302628
    //   1917: ixor
    //   1918: ldc2_w 379648761
    //   1921: l2i
    //   1922: ldc_w -1299294104
    //   1925: ixor
    //   1926: ixor
    //   1927: lookupswitch default -> 5388, -2129697855 -> 1952, 517736310 -> 1910
    //   1952: goto -> 1956
    //   1955: athrow
    //   1956: invokevirtual getDisplayName : ()Ljava/lang/String;
    //   1959: goto -> 1963
    //   1962: athrow
    //   1963: getstatic Perryc.0 : I
    //   1966: ifle -> 1980
    //   1969: ldc2_w 2090972117
    //   1972: l2i
    //   1973: ldc_w -218968446
    //   1976: ixor
    //   1977: goto -> 1988
    //   1980: ldc2_w 996622071
    //   1983: l2i
    //   1984: ldc_w 1614963959
    //   1987: ixor
    //   1988: ldc2_w 544736527
    //   1991: l2i
    //   1992: ldc_w -1256652308
    //   1995: ixor
    //   1996: ixor
    //   1997: lookupswitch default -> 5342, -834380061 -> 2024, 456292788 -> 1980
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: ldc_w ' '
    //   2038: getstatic Perryc.0 : I
    //   2041: ifle -> 2055
    //   2044: ldc2_w -2049171184
    //   2047: l2i
    //   2048: ldc_w 1142785724
    //   2051: ixor
    //   2052: goto -> 2063
    //   2055: ldc2_w 398961755
    //   2058: l2i
    //   2059: ldc_w 1733134895
    //   2062: ixor
    //   2063: ldc2_w 2123962275
    //   2066: l2i
    //   2067: ldc_w 2049668433
    //   2070: ixor
    //   2071: ixor
    //   2072: lookupswitch default -> 5378, -982268578 -> 2055, 1949844614 -> 2100
    //   2100: goto -> 2104
    //   2103: athrow
    //   2104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2107: goto -> 2111
    //   2110: athrow
    //   2111: getstatic Perryc.c : I
    //   2114: iflt -> 2128
    //   2117: ldc2_w -1352985111
    //   2120: l2i
    //   2121: ldc_w 1002249321
    //   2124: ixor
    //   2125: goto -> 2136
    //   2128: ldc2_w 1470979813
    //   2131: l2i
    //   2132: ldc_w 1070946335
    //   2135: ixor
    //   2136: ldc2_w 1333663970
    //   2139: l2i
    //   2140: ldc_w -1889093336
    //   2143: ixor
    //   2144: ixor
    //   2145: lookupswitch default -> 5454, -1470060752 -> 2172, 1425975370 -> 2128
    //   2172: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2175: getstatic Perryc.c : I
    //   2178: iflt -> 2192
    //   2181: ldc2_w 652740345
    //   2184: l2i
    //   2185: ldc_w 1000890221
    //   2188: ixor
    //   2189: goto -> 2200
    //   2192: ldc2_w 2019592811
    //   2195: l2i
    //   2196: ldc_w 742321226
    //   2199: ixor
    //   2200: ldc2_w 198255891
    //   2203: l2i
    //   2204: ldc_w -121668252
    //   2207: ixor
    //   2208: ixor
    //   2209: lookupswitch default -> 5392, -1490010538 -> 2236, -298974749 -> 2192
    //   2236: goto -> 2240
    //   2239: athrow
    //   2240: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2243: goto -> 2247
    //   2246: athrow
    //   2247: ldc_w 'ꋖ㌜ꋚ?䱆๪?椐눙ᩣਯ漧阏㛣㾜辍窽䀐ⴀ侰䡥ꇈ넶ᣉ޽칡㵐'
    //   2250: getstatic Perryc.0 : I
    //   2253: ifle -> 2267
    //   2256: ldc2_w -1452461095
    //   2259: l2i
    //   2260: ldc_w -1635889699
    //   2263: ixor
    //   2264: goto -> 2275
    //   2267: ldc2_w 863360178
    //   2270: l2i
    //   2271: ldc_w -381757806
    //   2274: ixor
    //   2275: ldc2_w 625737036
    //   2278: l2i
    //   2279: ldc_w 2042723831
    //   2282: ixor
    //   2283: ixor
    //   2284: lookupswitch default -> 5414, -2034138469 -> 2312, 1805254335 -> 2267
    //   2312: goto -> 2316
    //   2315: athrow
    //   2316: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2319: goto -> 2323
    //   2322: athrow
    //   2323: getstatic Perryc.1 : I
    //   2326: ifeq -> 2340
    //   2329: ldc2_w 139873295
    //   2332: l2i
    //   2333: ldc_w -1934153958
    //   2336: ixor
    //   2337: goto -> 2348
    //   2340: ldc2_w -1159694332
    //   2343: l2i
    //   2344: ldc_w 1919733308
    //   2347: ixor
    //   2348: ldc2_w -1381320238
    //   2351: l2i
    //   2352: ldc_w 642544274
    //   2355: ixor
    //   2356: ixor
    //   2357: lookupswitch default -> 5320, 252158037 -> 2340, 1131052408 -> 2384
    //   2384: goto -> 2388
    //   2387: athrow
    //   2388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2391: goto -> 2395
    //   2394: athrow
    //   2395: getstatic Perryc.c : I
    //   2398: iflt -> 2412
    //   2401: ldc2_w -1105322155
    //   2404: l2i
    //   2405: ldc_w 1741779014
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w -966170473
    //   2415: l2i
    //   2416: ldc_w 1308877003
    //   2419: ixor
    //   2420: ldc2_w -1432097175
    //   2423: l2i
    //   2424: ldc_w 539402781
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 2456, 1397367655 -> 5370, 2075590372 -> 2412
    //   2456: goto -> 2460
    //   2459: athrow
    //   2460: invokevirtual toString : ()Ljava/lang/String;
    //   2463: goto -> 2467
    //   2466: athrow
    //   2467: getstatic Perryc.c : I
    //   2470: iflt -> 2484
    //   2473: ldc2_w 1755921333
    //   2476: l2i
    //   2477: ldc_w 1635610176
    //   2480: ixor
    //   2481: goto -> 2492
    //   2484: ldc2_w -908410167
    //   2487: l2i
    //   2488: ldc_w -303214063
    //   2491: ixor
    //   2492: ldc2_w 326979543
    //   2495: l2i
    //   2496: ldc_w -144847935
    //   2499: ixor
    //   2500: ixor
    //   2501: lookupswitch default -> 5334, -1072229170 -> 2528, -302722589 -> 2484
    //   2528: goto -> 2532
    //   2531: athrow
    //   2532: invokestatic sendMessage : (Ljava/lang/String;)V
    //   2535: goto -> 2539
    //   2538: athrow
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w 890337458
    //   2548: l2i
    //   2549: ldc_w -1140888806
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w -1815161002
    //   2559: l2i
    //   2560: ldc_w -302132083
    //   2563: ixor
    //   2564: ldc2_w 650955982
    //   2567: l2i
    //   2568: ldc_w 847256827
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 2600, -1700609123 -> 5426, 1026428298 -> 2556
    //   2600: aload_0
    //   2601: getstatic Perryc.c : I
    //   2604: iflt -> 2618
    //   2607: ldc2_w 1103725511
    //   2610: l2i
    //   2611: ldc_w 753157829
    //   2614: ixor
    //   2615: goto -> 2626
    //   2618: ldc2_w 1812306882
    //   2621: l2i
    //   2622: ldc_w -85027463
    //   2625: ixor
    //   2626: ldc2_w -168120022
    //   2629: l2i
    //   2630: ldc_w -1999813185
    //   2633: ixor
    //   2634: ixor
    //   2635: lookupswitch default -> 5408, -337839570 -> 2660, 270152087 -> 2618
    //   2660: goto -> 2664
    //   2663: athrow
    //   2664: invokevirtual toggle : ()V
    //   2667: goto -> 2671
    //   2670: athrow
    //   2671: ldc2_w 1974067318
    //   2674: l2i
    //   2675: ldc_w 1974067319
    //   2678: ixor
    //   2679: ireturn
    //   2680: getstatic Perryc.c : I
    //   2683: iflt -> 2697
    //   2686: ldc2_w -331034429
    //   2689: l2i
    //   2690: ldc_w 114422411
    //   2693: ixor
    //   2694: goto -> 2705
    //   2697: ldc2_w -623678578
    //   2700: l2i
    //   2701: ldc_w 1493988381
    //   2704: ixor
    //   2705: ldc2_w 608433230
    //   2708: l2i
    //   2709: ldc_w -811678277
    //   2712: ixor
    //   2713: ixor
    //   2714: lookupswitch default -> 5344, 21500861 -> 2697, 1744973414 -> 2740
    //   2740: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoWeb.mc : Lnet/minecraft/client/Minecraft;
    //   2743: getstatic Perryc.c : I
    //   2746: iflt -> 2760
    //   2749: ldc2_w 1653710764
    //   2752: l2i
    //   2753: ldc_w 940009085
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w 496544437
    //   2763: l2i
    //   2764: ldc_w -892893644
    //   2767: ixor
    //   2768: ldc2_w -2016423310
    //   2771: l2i
    //   2772: ldc_w 759182549
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 2804, -266789002 -> 5312, 2079104597 -> 2760
    //   2804: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2807: getstatic Perryc.1 : I
    //   2810: ifeq -> 2824
    //   2813: ldc2_w 1575915074
    //   2816: l2i
    //   2817: ldc_w -1938433161
    //   2820: ixor
    //   2821: goto -> 2832
    //   2824: ldc2_w -995904358
    //   2827: l2i
    //   2828: ldc_w 2100657503
    //   2831: ixor
    //   2832: ldc2_w -1077971013
    //   2835: l2i
    //   2836: ldc_w 646631755
    //   2839: ixor
    //   2840: ixor
    //   2841: lookupswitch default -> 2868, 180738954 -> 2824, 1219425221 -> 5448
    //   2868: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   2871: getstatic Perryc.1 : I
    //   2874: ifeq -> 2888
    //   2877: ldc2_w -21848949
    //   2880: l2i
    //   2881: ldc_w 2034793074
    //   2884: ixor
    //   2885: goto -> 2896
    //   2888: ldc2_w -981175134
    //   2891: l2i
    //   2892: ldc_w -443247667
    //   2895: ixor
    //   2896: ldc2_w -444949728
    //   2899: l2i
    //   2900: ldc_w 1635993200
    //   2903: ixor
    //   2904: ixor
    //   2905: lookupswitch default -> 2932, -1701839369 -> 2888, 50543529 -> 5386
    //   2932: getfield field_70461_c : I
    //   2935: getstatic Perryc.1 : I
    //   2938: ifeq -> 2952
    //   2941: ldc2_w 1426154529
    //   2944: l2i
    //   2945: ldc_w 39195258
    //   2948: ixor
    //   2949: goto -> 2960
    //   2952: ldc2_w 2022538355
    //   2955: l2i
    //   2956: ldc_w -1234336327
    //   2959: ixor
    //   2960: ldc2_w 204016042
    //   2963: l2i
    //   2964: ldc_w -1871133310
    //   2967: ixor
    //   2968: ixor
    //   2969: lookupswitch default -> 5430, -888751501 -> 2952, 1387345378 -> 2996
    //   2996: aload_0
    //   2997: getstatic Perryc.c : I
    //   3000: iflt -> 3014
    //   3003: ldc2_w 1873509235
    //   3006: l2i
    //   3007: ldc_w 1813076275
    //   3010: ixor
    //   3011: goto -> 3022
    //   3014: ldc2_w -394048764
    //   3017: l2i
    //   3018: ldc_w -571486667
    //   3021: ixor
    //   3022: ldc2_w 1911324561
    //   3025: l2i
    //   3026: ldc_w -2115074602
    //   3029: ixor
    //   3030: ixor
    //   3031: lookupswitch default -> 3056, -205989881 -> 5372, -153389928 -> 3014
    //   3056: getfield lastHotbarSlot : I
    //   3059: if_icmpeq -> 3073
    //   3062: ldc2_w 2023284266
    //   3065: l2i
    //   3066: ldc_w -1358377414
    //   3069: ixor
    //   3070: goto -> 3081
    //   3073: ldc2_w 490655417
    //   3076: l2i
    //   3077: ldc_w -894509400
    //   3080: ixor
    //   3081: ldc2_w 938061626
    //   3084: l2i
    //   3085: ldc_w -48455058
    //   3088: ixor
    //   3089: ixor
    //   3090: tableswitch default -> 3062, 493165892 -> 3112, 493165893 -> 3863
    //   3112: getstatic Perryc.0 : I
    //   3115: ifle -> 3129
    //   3118: ldc2_w 728297991
    //   3121: l2i
    //   3122: ldc_w 243930022
    //   3125: ixor
    //   3126: goto -> 3137
    //   3129: ldc2_w 362680100
    //   3132: l2i
    //   3133: ldc_w -110484640
    //   3136: ixor
    //   3137: ldc2_w -1767105238
    //   3140: l2i
    //   3141: ldc_w 2046101656
    //   3144: ixor
    //   3145: ixor
    //   3146: lookupswitch default -> 3172, -893651949 -> 5404, 1456608151 -> 3129
    //   3172: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoWeb.mc : Lnet/minecraft/client/Minecraft;
    //   3175: getstatic Perryc.c : I
    //   3178: iflt -> 3192
    //   3181: ldc2_w -688101762
    //   3184: l2i
    //   3185: ldc_w -1933042587
    //   3188: ixor
    //   3189: goto -> 3200
    //   3192: ldc2_w 261610247
    //   3195: l2i
    //   3196: ldc_w 852632446
    //   3199: ixor
    //   3200: ldc2_w 175834117
    //   3203: l2i
    //   3204: ldc_w 2080165885
    //   3207: ixor
    //   3208: ixor
    //   3209: lookupswitch default -> 5382, 733196771 -> 3192, 1287795585 -> 3236
    //   3236: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3239: getstatic Perryc.0 : I
    //   3242: ifle -> 3256
    //   3245: ldc2_w 395130052
    //   3248: l2i
    //   3249: ldc_w -758271403
    //   3252: ixor
    //   3253: goto -> 3264
    //   3256: ldc2_w -1209133663
    //   3259: l2i
    //   3260: ldc_w 1387544278
    //   3263: ixor
    //   3264: ldc2_w -1043177296
    //   3267: l2i
    //   3268: ldc_w 1048925998
    //   3271: ixor
    //   3272: ixor
    //   3273: lookupswitch default -> 5406, 437066985 -> 3300, 974631183 -> 3256
    //   3300: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   3303: getstatic Perryc.1 : I
    //   3306: ifeq -> 3320
    //   3309: ldc2_w 2071688759
    //   3312: l2i
    //   3313: ldc_w -201702131
    //   3316: ixor
    //   3317: goto -> 3328
    //   3320: ldc2_w -918121910
    //   3323: l2i
    //   3324: ldc_w -540369487
    //   3327: ixor
    //   3328: ldc2_w -789443896
    //   3331: l2i
    //   3332: ldc_w 408434890
    //   3335: ixor
    //   3336: ixor
    //   3337: lookupswitch default -> 5322, -567919111 -> 3364, 1076560184 -> 3320
    //   3364: getfield field_70461_c : I
    //   3367: getstatic Perryc.1 : I
    //   3370: ifeq -> 3384
    //   3373: ldc2_w 244663121
    //   3376: l2i
    //   3377: ldc_w 1411813946
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w 316201590
    //   3387: l2i
    //   3388: ldc_w -1164054773
    //   3391: ixor
    //   3392: ldc2_w 1148517724
    //   3395: l2i
    //   3396: ldc_w 1634696371
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 5314, -1923173230 -> 3428, 2141737092 -> 3384
    //   3428: iload_1
    //   3429: if_icmpeq -> 3443
    //   3432: ldc2_w -1372812291
    //   3435: l2i
    //   3436: ldc_w -1100985333
    //   3439: ixor
    //   3440: goto -> 3451
    //   3443: ldc2_w -576823587
    //   3446: l2i
    //   3447: ldc_w -841836248
    //   3450: ixor
    //   3451: ldc2_w 1658418247
    //   3454: l2i
    //   3455: ldc_w 362647932
    //   3458: ixor
    //   3459: ixor
    //   3460: tableswitch default -> 3432, 1728586445 -> 3484, 1728586446 -> 3863
    //   3484: getstatic Perryc.c : I
    //   3487: iflt -> 3501
    //   3490: ldc2_w -637132617
    //   3493: l2i
    //   3494: ldc_w -835741925
    //   3497: ixor
    //   3498: goto -> 3509
    //   3501: ldc2_w 1742148266
    //   3504: l2i
    //   3505: ldc_w -690988875
    //   3508: ixor
    //   3509: ldc2_w 484342344
    //   3512: l2i
    //   3513: ldc_w 1016771898
    //   3516: ixor
    //   3517: ixor
    //   3518: lookupswitch default -> 5360, -1857845907 -> 3544, 879589598 -> 3501
    //   3544: aload_0
    //   3545: getstatic Perryc.c : I
    //   3548: iflt -> 3562
    //   3551: ldc2_w -951434396
    //   3554: l2i
    //   3555: ldc_w -1307504186
    //   3558: ixor
    //   3559: goto -> 3570
    //   3562: ldc2_w -1792136812
    //   3565: l2i
    //   3566: ldc_w 431986596
    //   3569: ixor
    //   3570: ldc2_w -1354677773
    //   3573: l2i
    //   3574: ldc_w 222503581
    //   3577: ixor
    //   3578: ixor
    //   3579: lookupswitch default -> 5356, -682020404 -> 3562, 781442398 -> 3604
    //   3604: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoWeb.mc : Lnet/minecraft/client/Minecraft;
    //   3607: getstatic Perryc.1 : I
    //   3610: ifeq -> 3624
    //   3613: ldc2_w -241478145
    //   3616: l2i
    //   3617: ldc_w 574464748
    //   3620: ixor
    //   3621: goto -> 3632
    //   3624: ldc2_w -492076098
    //   3627: l2i
    //   3628: ldc_w 2022049186
    //   3631: ixor
    //   3632: ldc2_w 190422730
    //   3635: l2i
    //   3636: ldc_w -942401988
    //   3639: ixor
    //   3640: ixor
    //   3641: lookupswitch default -> 3668, 522944485 -> 5346, 1904707926 -> 3624
    //   3668: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3671: getstatic Perryc.1 : I
    //   3674: ifeq -> 3688
    //   3677: ldc2_w 645325807
    //   3680: l2i
    //   3681: ldc_w 522833867
    //   3684: ixor
    //   3685: goto -> 3696
    //   3688: ldc2_w -1586449680
    //   3691: l2i
    //   3692: ldc_w -1604274593
    //   3695: ixor
    //   3696: ldc2_w 1579697588
    //   3699: l2i
    //   3700: ldc_w 803729187
    //   3703: ixor
    //   3704: ixor
    //   3705: lookupswitch default -> 3732, 1021429320 -> 3688, 1217431219 -> 5350
    //   3732: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   3735: getstatic Perryc.0 : I
    //   3738: ifle -> 3752
    //   3741: ldc2_w 161055888
    //   3744: l2i
    //   3745: ldc_w -962732438
    //   3748: ixor
    //   3749: goto -> 3760
    //   3752: ldc2_w -1727280265
    //   3755: l2i
    //   3756: ldc_w -629412732
    //   3759: ixor
    //   3760: ldc2_w 286611968
    //   3763: l2i
    //   3764: ldc_w 980490442
    //   3767: ixor
    //   3768: ixor
    //   3769: lookupswitch default -> 3796, -971921050 -> 3752, -463464400 -> 5362
    //   3796: getfield field_70461_c : I
    //   3799: getstatic Perryc.c : I
    //   3802: iflt -> 3816
    //   3805: ldc2_w 683417447
    //   3808: l2i
    //   3809: ldc_w 213313719
    //   3812: ixor
    //   3813: goto -> 3824
    //   3816: ldc2_w 426363243
    //   3819: l2i
    //   3820: ldc_w -958037164
    //   3823: ixor
    //   3824: ldc2_w 1661693877
    //   3827: l2i
    //   3828: ldc_w 1344889975
    //   3831: ixor
    //   3832: ixor
    //   3833: lookupswitch default -> 3860, 388561938 -> 5438, 532542798 -> 3816
    //   3860: putfield lastHotbarSlot : I
    //   3863: getstatic Perryc.0 : I
    //   3866: ifle -> 3880
    //   3869: ldc2_w 1675775878
    //   3872: l2i
    //   3873: ldc_w 1099665094
    //   3876: ixor
    //   3877: goto -> 3888
    //   3880: ldc2_w 1988139092
    //   3883: l2i
    //   3884: ldc_w 792304078
    //   3887: ixor
    //   3888: ldc2_w 1247767338
    //   3891: l2i
    //   3892: ldc_w 1308240465
    //   3895: ixor
    //   3896: ixor
    //   3897: lookupswitch default -> 3924, -550242562 -> 3880, 634159163 -> 5352
    //   3924: aload_0
    //   3925: ldc2_w 423373146
    //   3928: l2i
    //   3929: ldc_w 423373147
    //   3932: ixor
    //   3933: getstatic Perryc.1 : I
    //   3936: ifeq -> 3950
    //   3939: ldc2_w -1340650412
    //   3942: l2i
    //   3943: ldc_w 911958652
    //   3946: ixor
    //   3947: goto -> 3958
    //   3950: ldc2_w 632633207
    //   3953: l2i
    //   3954: ldc_w 1925689903
    //   3957: ixor
    //   3958: ldc2_w -1468766066
    //   3961: l2i
    //   3962: ldc_w -1878288644
    //   3965: ixor
    //   3966: ixor
    //   3967: lookupswitch default -> 5366, -1103900582 -> 3950, 1863154474 -> 3992
    //   3992: goto -> 3996
    //   3995: athrow
    //   3996: invokespecial switchItem : (Z)Z
    //   3999: goto -> 4003
    //   4002: athrow
    //   4003: pop
    //   4004: getstatic Perryc.1 : I
    //   4007: ifeq -> 4021
    //   4010: ldc2_w -1798755830
    //   4013: l2i
    //   4014: ldc_w 304130141
    //   4017: ixor
    //   4018: goto -> 4029
    //   4021: ldc2_w 1222221544
    //   4024: l2i
    //   4025: ldc_w 47087220
    //   4028: ixor
    //   4029: ldc2_w 1433030328
    //   4032: l2i
    //   4033: ldc_w 388237113
    //   4036: ixor
    //   4037: ixor
    //   4038: lookupswitch default -> 4064, -1505459283 -> 4021, -995636266 -> 5316
    //   4064: aload_0
    //   4065: getstatic Perryc.0 : I
    //   4068: ifle -> 4082
    //   4071: ldc2_w 1538788635
    //   4074: l2i
    //   4075: ldc_w -838272161
    //   4078: ixor
    //   4079: goto -> 4090
    //   4082: ldc2_w -1539939985
    //   4085: l2i
    //   4086: ldc_w 41368491
    //   4089: ixor
    //   4090: ldc2_w 1666500944
    //   4093: l2i
    //   4094: ldc_w 296752731
    //   4097: ixor
    //   4098: ixor
    //   4099: lookupswitch default -> 4124, -413914801 -> 5446, -218296818 -> 4082
    //   4124: aload_0
    //   4125: getstatic Perryc.c : I
    //   4128: iflt -> 4142
    //   4131: ldc2_w -928292184
    //   4134: l2i
    //   4135: ldc_w 115396581
    //   4138: ixor
    //   4139: goto -> 4150
    //   4142: ldc2_w 1400315736
    //   4145: l2i
    //   4146: ldc_w 1375558059
    //   4149: ixor
    //   4150: ldc2_w 421457351
    //   4153: l2i
    //   4154: ldc_w -760152247
    //   4157: ixor
    //   4158: ixor
    //   4159: lookupswitch default -> 4184, -1362057291 -> 4142, 98942915 -> 5450
    //   4184: getfield isSneaking : Z
    //   4187: getstatic Perryc.c : I
    //   4190: iflt -> 4204
    //   4193: ldc2_w -1344835162
    //   4196: l2i
    //   4197: ldc_w -1159001593
    //   4200: ixor
    //   4201: goto -> 4212
    //   4204: ldc2_w 1920048822
    //   4207: l2i
    //   4208: ldc_w 1578880961
    //   4211: ixor
    //   4212: ldc2_w -1821713325
    //   4215: l2i
    //   4216: ldc_w -163654518
    //   4219: ixor
    //   4220: ixor
    //   4221: lookupswitch default -> 4248, 1382332199 -> 4204, 1885893496 -> 5374
    //   4248: goto -> 4252
    //   4251: athrow
    //   4252: invokestatic stopSneaking : (Z)Z
    //   4255: goto -> 4259
    //   4258: athrow
    //   4259: getstatic Perryc.c : I
    //   4262: iflt -> 4276
    //   4265: ldc2_w 995559814
    //   4268: l2i
    //   4269: ldc_w -1144468518
    //   4272: ixor
    //   4273: goto -> 4284
    //   4276: ldc2_w -2030641150
    //   4279: l2i
    //   4280: ldc_w 449303007
    //   4283: ixor
    //   4284: ldc2_w -1921638198
    //   4287: l2i
    //   4288: ldc_w 99827724
    //   4291: ixor
    //   4292: ixor
    //   4293: lookupswitch default -> 4320, 135963290 -> 5390, 1462507007 -> 4276
    //   4320: putfield isSneaking : Z
    //   4323: getstatic Perryc.0 : I
    //   4326: ifle -> 4340
    //   4329: ldc2_w -1940702345
    //   4332: l2i
    //   4333: ldc_w 1675645108
    //   4336: ixor
    //   4337: goto -> 4348
    //   4340: ldc2_w 1633999231
    //   4343: l2i
    //   4344: ldc_w -2135028324
    //   4347: ixor
    //   4348: ldc2_w -1020012063
    //   4351: l2i
    //   4352: ldc_w -1355236899
    //   4355: ixor
    //   4356: ixor
    //   4357: lookupswitch default -> 4384, -2085090305 -> 5442, 1065235154 -> 4340
    //   4384: aload_0
    //   4385: getstatic Perryc.c : I
    //   4388: iflt -> 4402
    //   4391: ldc2_w 1586878257
    //   4394: l2i
    //   4395: ldc_w -2113148099
    //   4398: ixor
    //   4399: goto -> 4410
    //   4402: ldc2_w 1224863087
    //   4405: l2i
    //   4406: ldc_w -846388731
    //   4409: ixor
    //   4410: ldc2_w 1899076283
    //   4413: l2i
    //   4414: ldc_w 436294867
    //   4417: ixor
    //   4418: ixor
    //   4419: lookupswitch default -> 5336, -1213271452 -> 4402, -272891646 -> 4444
    //   4444: aload_0
    //   4445: ldc2_w 0.23718987314118029
    //   4448: invokestatic doubleToLongBits : (D)J
    //   4451: ldc2_w 9217281003860179094
    //   4454: lxor
    //   4455: invokestatic longBitsToDouble : (J)D
    //   4458: getstatic Perryc.0 : I
    //   4461: ifle -> 4475
    //   4464: ldc2_w -1554362464
    //   4467: l2i
    //   4468: ldc_w 933424429
    //   4471: ixor
    //   4472: goto -> 4483
    //   4475: ldc2_w 986905815
    //   4478: l2i
    //   4479: ldc_w -1875758431
    //   4482: ixor
    //   4483: ldc2_w -914872124
    //   4486: l2i
    //   4487: ldc_w -282251352
    //   4490: ixor
    //   4491: ixor
    //   4492: lookupswitch default -> 5432, -1934243558 -> 4520, -1297242655 -> 4475
    //   4520: goto -> 4524
    //   4523: athrow
    //   4524: invokespecial getTarget : (D)Lnet/minecraft/entity/player/EntityPlayer;
    //   4527: goto -> 4531
    //   4530: athrow
    //   4531: getstatic Perryc.0 : I
    //   4534: ifle -> 4548
    //   4537: ldc2_w 1219421714
    //   4540: l2i
    //   4541: ldc_w 1916895757
    //   4544: ixor
    //   4545: goto -> 4556
    //   4548: ldc2_w -6071802
    //   4551: l2i
    //   4552: ldc_w -743952676
    //   4555: ixor
    //   4556: ldc2_w 1554258277
    //   4559: l2i
    //   4560: ldc_w -1514386277
    //   4563: ixor
    //   4564: ixor
    //   4565: lookupswitch default -> 4592, -1007210015 -> 5376, 157450295 -> 4548
    //   4592: putfield target : Lnet/minecraft/entity/player/EntityPlayer;
    //   4595: getstatic Perryc.c : I
    //   4598: iflt -> 4612
    //   4601: ldc2_w 1106778877
    //   4604: l2i
    //   4605: ldc_w -1850634494
    //   4608: ixor
    //   4609: goto -> 4620
    //   4612: ldc2_w 294062769
    //   4615: l2i
    //   4616: ldc_w -1609162266
    //   4619: ixor
    //   4620: ldc2_w 211837513
    //   4623: l2i
    //   4624: ldc_w 1504979434
    //   4627: ixor
    //   4628: ixor
    //   4629: lookupswitch default -> 4656, -2057445796 -> 5328, 471244729 -> 4612
    //   4656: aload_0
    //   4657: getstatic Perryc.c : I
    //   4660: iflt -> 4674
    //   4663: ldc2_w 915068078
    //   4666: l2i
    //   4667: ldc_w -1196853469
    //   4670: ixor
    //   4671: goto -> 4682
    //   4674: ldc2_w 1253904778
    //   4677: l2i
    //   4678: ldc_w -198982720
    //   4681: ixor
    //   4682: ldc2_w 1456040230
    //   4685: l2i
    //   4686: ldc_w 483947281
    //   4689: ixor
    //   4690: ixor
    //   4691: lookupswitch default -> 4716, -1003308614 -> 5398, 229152661 -> 4674
    //   4716: getfield target : Lnet/minecraft/entity/player/EntityPlayer;
    //   4719: ifnull -> 4733
    //   4722: ldc2_w 1013965365
    //   4725: l2i
    //   4726: ldc_w -189102650
    //   4729: ixor
    //   4730: goto -> 4741
    //   4733: ldc2_w -2120322113
    //   4736: l2i
    //   4737: ldc_w 1229657165
    //   4740: ixor
    //   4741: ldc2_w -1424751191
    //   4744: l2i
    //   4745: ldc_w 2114965214
    //   4748: ixor
    //   4749: ixor
    //   4750: tableswitch default -> 4722, 500083844 -> 4772, 500083845 -> 5292
    //   4772: getstatic Perryc.c : I
    //   4775: iflt -> 4789
    //   4778: ldc2_w -1577207778
    //   4781: l2i
    //   4782: ldc_w -1675704027
    //   4785: ixor
    //   4786: goto -> 4797
    //   4789: ldc2_w -1993406531
    //   4792: l2i
    //   4793: ldc_w -2128375061
    //   4796: ixor
    //   4797: ldc2_w -1935655044
    //   4800: l2i
    //   4801: ldc_w -1581370970
    //   4804: ixor
    //   4805: ixor
    //   4806: lookupswitch default -> 5422, 285048801 -> 4789, 621976460 -> 4832
    //   4832: aload_0
    //   4833: getstatic Perryc.1 : I
    //   4836: ifeq -> 4850
    //   4839: ldc2_w -659645193
    //   4842: l2i
    //   4843: ldc_w -1746191987
    //   4846: ixor
    //   4847: goto -> 4858
    //   4850: ldc2_w 836602732
    //   4853: l2i
    //   4854: ldc_w -1795225164
    //   4857: ixor
    //   4858: ldc2_w -573355969
    //   4861: l2i
    //   4862: ldc_w 196012520
    //   4865: ixor
    //   4866: ixor
    //   4867: lookupswitch default -> 5444, -1724382035 -> 4850, 1935614735 -> 4892
    //   4892: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   4895: getstatic Perryc.0 : I
    //   4898: ifle -> 4912
    //   4901: ldc2_w -720519530
    //   4904: l2i
    //   4905: ldc_w 2015370326
    //   4908: ixor
    //   4909: goto -> 4920
    //   4912: ldc2_w 1672944112
    //   4915: l2i
    //   4916: ldc_w 1666935687
    //   4919: ixor
    //   4920: ldc2_w -510181650
    //   4923: l2i
    //   4924: ldc_w -326159604
    //   4927: ixor
    //   4928: ixor
    //   4929: lookupswitch default -> 5418, -1607094494 -> 4912, 234127253 -> 4956
    //   4956: aload_0
    //   4957: getstatic Perryc.0 : I
    //   4960: ifle -> 4974
    //   4963: ldc2_w 889217432
    //   4966: l2i
    //   4967: ldc_w 143417796
    //   4970: ixor
    //   4971: goto -> 4982
    //   4974: ldc2_w -1467051096
    //   4977: l2i
    //   4978: ldc_w 988302047
    //   4981: ixor
    //   4982: ldc2_w 901116940
    //   4985: l2i
    //   4986: ldc_w -1648493753
    //   4989: ixor
    //   4990: ixor
    //   4991: lookupswitch default -> 5016, -1833026752 -> 4974, -1786507497 -> 5440
    //   5016: getfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5019: getstatic Perryc.0 : I
    //   5022: ifle -> 5036
    //   5025: ldc2_w -1690033826
    //   5028: l2i
    //   5029: ldc_w 2024846220
    //   5032: ixor
    //   5033: goto -> 5044
    //   5036: ldc2_w -303784486
    //   5039: l2i
    //   5040: ldc_w 490432564
    //   5043: ixor
    //   5044: ldc2_w 1366842067
    //   5047: l2i
    //   5048: ldc_w -198519206
    //   5051: ixor
    //   5052: ixor
    //   5053: lookupswitch default -> 5080, -762486998 -> 5036, 1185291867 -> 5400
    //   5080: goto -> 5084
    //   5083: athrow
    //   5084: invokevirtual getValue : ()Ljava/lang/Object;
    //   5087: goto -> 5091
    //   5090: athrow
    //   5091: checkcast java/lang/Integer
    //   5094: getstatic Perryc.c : I
    //   5097: iflt -> 5111
    //   5100: ldc2_w 937589579
    //   5103: l2i
    //   5104: ldc_w -976141053
    //   5107: ixor
    //   5108: goto -> 5119
    //   5111: ldc2_w -1224410845
    //   5114: l2i
    //   5115: ldc_w -1231518212
    //   5118: ixor
    //   5119: ldc2_w 1195306246
    //   5122: l2i
    //   5123: ldc_w -801123929
    //   5126: ixor
    //   5127: ixor
    //   5128: lookupswitch default -> 5434, -1768079234 -> 5156, 1697776361 -> 5111
    //   5156: goto -> 5160
    //   5159: athrow
    //   5160: invokevirtual intValue : ()I
    //   5163: goto -> 5167
    //   5166: athrow
    //   5167: i2l
    //   5168: getstatic Perryc.c : I
    //   5171: iflt -> 5185
    //   5174: ldc2_w 513590453
    //   5177: l2i
    //   5178: ldc_w -1608188315
    //   5181: ixor
    //   5182: goto -> 5193
    //   5185: ldc2_w 592642432
    //   5188: l2i
    //   5189: ldc_w -470524095
    //   5192: ixor
    //   5193: ldc2_w 1244398925
    //   5196: l2i
    //   5197: ldc_w 660942147
    //   5200: ixor
    //   5201: ixor
    //   5202: lookupswitch default -> 5330, -1376880945 -> 5228, -739175714 -> 5185
    //   5228: goto -> 5232
    //   5231: athrow
    //   5232: invokevirtual passedMs : (J)Z
    //   5235: goto -> 5239
    //   5238: athrow
    //   5239: ifne -> 5253
    //   5242: ldc2_w -671363265
    //   5245: l2i
    //   5246: ldc_w 424932571
    //   5249: ixor
    //   5250: goto -> 5261
    //   5253: ldc2_w -1105659496
    //   5256: l2i
    //   5257: ldc_w 1890632319
    //   5260: ixor
    //   5261: ldc2_w 1595890405
    //   5264: l2i
    //   5265: ldc_w -1612376940
    //   5268: ixor
    //   5269: ixor
    //   5270: tableswitch default -> 5242, 240285077 -> 5292, 240285078 -> 5303
    //   5292: ldc2_w -2072797039
    //   5295: l2i
    //   5296: ldc_w -2072797040
    //   5299: ixor
    //   5300: goto -> 5311
    //   5303: ldc2_w -1501113031
    //   5306: l2i
    //   5307: ldc_w -1501113031
    //   5310: ixor
    //   5311: ireturn
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
    //   5392: aconst_null
    //   5393: athrow
    //   5394: aconst_null
    //   5395: athrow
    //   5396: aconst_null
    //   5397: athrow
    //   5398: aconst_null
    //   5399: athrow
    //   5400: aconst_null
    //   5401: athrow
    //   5402: aconst_null
    //   5403: athrow
    //   5404: aconst_null
    //   5405: athrow
    //   5406: aconst_null
    //   5407: athrow
    //   5408: aconst_null
    //   5409: athrow
    //   5410: aconst_null
    //   5411: athrow
    //   5412: aconst_null
    //   5413: athrow
    //   5414: aconst_null
    //   5415: athrow
    //   5416: aconst_null
    //   5417: athrow
    //   5418: aconst_null
    //   5419: athrow
    //   5420: aconst_null
    //   5421: athrow
    //   5422: aconst_null
    //   5423: athrow
    //   5424: aconst_null
    //   5425: athrow
    //   5426: aconst_null
    //   5427: athrow
    //   5428: aconst_null
    //   5429: athrow
    //   5430: aconst_null
    //   5431: athrow
    //   5432: aconst_null
    //   5433: athrow
    //   5434: aconst_null
    //   5435: athrow
    //   5436: aconst_null
    //   5437: athrow
    //   5438: aconst_null
    //   5439: athrow
    //   5440: aconst_null
    //   5441: athrow
    //   5442: aconst_null
    //   5443: athrow
    //   5444: aconst_null
    //   5445: athrow
    //   5446: aconst_null
    //   5447: athrow
    //   5448: aconst_null
    //   5449: athrow
    //   5450: aconst_null
    //   5451: athrow
    //   5452: aconst_null
    //   5453: athrow
    //   5454: aconst_null
    //   5455: athrow
    //   5456: aconst_null
    //   5457: athrow
    //   5458: pop
    //   5459: goto -> 24
    //   5462: pop
    //   5463: aconst_null
    //   5464: goto -> 5458
    //   5467: dup
    //   5468: ifnull -> 5458
    //   5471: checkcast java/lang/Throwable
    //   5474: athrow
    //   5475: dup
    //   5476: ifnull -> 5462
    //   5479: checkcast java/lang/Throwable
    //   5482: athrow
    //   5483: aconst_null
    //   5484: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	5288	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;
    //   469	4843	1	obbySlot	I
    // Exception table:
    //   from	to	target	type
    //   8	20	5467	java/lang/IllegalArgumentException
    //   403	410	410	finally
    //   403	410	410	finally
    //   403	410	403	finally
    //   403	410	403	finally
    //   404	410	410	java/lang/AssertionError
    //   592	598	598	finally
    //   592	598	3	finally
    //   592	598	3	finally
    //   592	598	598	finally
    //   592	598	598	java/util/NoSuchElementException
    //   835	842	842	finally
    //   835	842	842	finally
    //   835	842	835	java/lang/NumberFormatException
    //   836	842	835	finally
    //   836	842	835	finally
    //   907	914	914	finally
    //   907	914	907	java/lang/IndexOutOfBoundsException
    //   908	914	907	java/lang/IllegalArgumentException
    //   908	914	3	java/lang/NegativeArraySizeException
    //   908	914	907	java/lang/NegativeArraySizeException
    //   1284	1290	1290	finally
    //   1284	1290	3	java/lang/UnsupportedOperationException
    //   1284	1290	1290	java/lang/ArrayIndexOutOfBoundsException
    //   1284	1290	1290	finally
    //   1284	1290	3	java/lang/StringIndexOutOfBoundsException
    //   1356	1362	1362	finally
    //   1356	1362	3	java/lang/ArithmeticException
    //   1356	1362	3	java/lang/ArrayIndexOutOfBoundsException
    //   1356	1362	3	java/lang/RuntimeException
    //   1356	1362	1362	java/util/ConcurrentModificationException
    //   1539	1546	1546	finally
    //   1539	1546	3	java/lang/NumberFormatException
    //   1539	1546	3	java/lang/AssertionError
    //   1539	1546	1546	finally
    //   1540	1546	1539	java/lang/NullPointerException
    //   1748	1754	1754	finally
    //   1748	1754	1754	java/util/ConcurrentModificationException
    //   1748	1754	1754	finally
    //   1748	1754	3	java/lang/ArithmeticException
    //   1748	1754	3	finally
    //   1824	1830	1830	finally
    //   1824	1830	3	java/lang/NullPointerException
    //   1824	1830	3	finally
    //   1824	1830	1830	finally
    //   1824	1830	3	java/lang/NegativeArraySizeException
    //   1955	1962	1962	finally
    //   1955	1962	1955	finally
    //   1955	1962	1955	finally
    //   1955	1962	1955	java/lang/NumberFormatException
    //   1956	1962	3	java/lang/ArrayIndexOutOfBoundsException
    //   2027	2034	2034	finally
    //   2027	2034	3	finally
    //   2027	2034	2027	java/lang/ArithmeticException
    //   2028	2034	2034	finally
    //   2028	2034	2034	java/lang/ArithmeticException
    //   2103	2110	2110	finally
    //   2103	2110	2103	java/lang/NegativeArraySizeException
    //   2103	2110	3	java/lang/ArithmeticException
    //   2103	2110	3	java/util/NoSuchElementException
    //   2103	2110	2110	java/lang/NumberFormatException
    //   2239	2246	2246	finally
    //   2239	2246	3	finally
    //   2239	2246	2239	java/lang/IllegalStateException
    //   2240	2246	2239	java/lang/NegativeArraySizeException
    //   2240	2246	2246	finally
    //   2315	2322	2322	finally
    //   2315	2322	3	finally
    //   2316	2322	3	java/lang/StringIndexOutOfBoundsException
    //   2316	2322	2315	java/lang/ArrayIndexOutOfBoundsException
    //   2316	2322	3	finally
    //   2388	2394	2394	finally
    //   2388	2394	3	java/lang/IllegalArgumentException
    //   2388	2394	3	finally
    //   2388	2394	2394	finally
    //   2388	2394	2394	finally
    //   2459	2466	2466	finally
    //   2459	2466	3	finally
    //   2459	2466	3	finally
    //   2460	2466	2466	java/lang/IllegalStateException
    //   2460	2466	2459	java/lang/RuntimeException
    //   2531	2538	2538	finally
    //   2531	2538	3	java/lang/EnumConstantNotPresentException
    //   2532	2538	3	finally
    //   2532	2538	2531	finally
    //   2532	2538	2538	java/lang/NumberFormatException
    //   2663	2670	2670	finally
    //   2663	2670	2663	java/lang/IllegalArgumentException
    //   2663	2670	2663	java/lang/ArrayIndexOutOfBoundsException
    //   2664	2670	3	finally
    //   2664	2670	3	java/lang/NullPointerException
    //   3995	4002	4002	finally
    //   3995	4002	3995	java/lang/IllegalArgumentException
    //   3995	4002	3995	java/lang/UnsupportedOperationException
    //   3996	4002	3	finally
    //   3996	4002	3995	finally
    //   4251	4258	4258	finally
    //   4251	4258	3	java/lang/IllegalStateException
    //   4252	4258	3	java/lang/EnumConstantNotPresentException
    //   4252	4258	4251	java/lang/StringIndexOutOfBoundsException
    //   4252	4258	4251	finally
    //   4524	4530	4530	finally
    //   4524	4530	3	java/lang/IllegalArgumentException
    //   4524	4530	3	finally
    //   4524	4530	4530	finally
    //   4524	4530	4530	java/lang/NumberFormatException
    //   5083	5090	5090	finally
    //   5083	5090	5090	java/util/NoSuchElementException
    //   5083	5090	5083	java/lang/AssertionError
    //   5083	5090	5090	finally
    //   5084	5090	5090	java/lang/NumberFormatException
    //   5159	5166	5166	finally
    //   5159	5166	5159	finally
    //   5159	5166	5159	java/lang/ClassCastException
    //   5160	5166	3	finally
    //   5160	5166	5159	finally
    //   5232	5238	5238	finally
    //   5232	5238	5238	finally
    //   5232	5238	5238	java/lang/IndexOutOfBoundsException
    //   5232	5238	5238	java/lang/EnumConstantNotPresentException
    //   5232	5238	5238	finally
    //   5467	5475	5467	finally
    //   5483	5485	3	finally
  }
  
  public boolean lambda$new$4(Boolean paramBoolean) {
    return Perry1.2q(this, (int)213814939L ^ 0xE7B60E4, paramBoolean);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5b(this, (int)-1420739684L ^ 0x9186846C, paramInteger);
  }
  
  public void onLogout() {
    Perry1.3S(this, (int)1595899174L ^ 0x743507DF);
  }
  
  public boolean lambda$new$3(Integer paramInteger) {
    return Perry1.5g(this, (int)-620608379L ^ 0xE657E8CA, paramInteger);
  }
  
  public boolean switchItem(boolean paramBoolean) {
    return Perry1.q(this, (int)2017638810L ^ 0x1106AD9B, paramBoolean);
  }
  
  public void onRender3D(Render3DEvent event) {
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
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.20(this, (int)-409319557L ^ 0xBD2C0D6A, paramObject);
  }
  
  public AutoWeb() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 1797098061
    //   9: l2i
    //   10: ldc_w -1316192588
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1527010420
    //   20: l2i
    //   21: ldc_w 729277001
    //   24: ixor
    //   25: ldc2_w 1337945753
    //   28: l2i
    //   29: ldc_w -1875717974
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 85740234 -> 14576, 257305792 -> 17
    //   60: aload_0
    //   61: ldc_w 'ꋙ㌆ꊎ㶸၈䱁๻'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -2034004382
    //   73: l2i
    //   74: ldc_w -1865051593
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -2051799055
    //   84: l2i
    //   85: ldc_w -2049698166
    //   88: ixor
    //   89: ldc2_w 786424364
    //   92: l2i
    //   93: ldc_w -1487262891
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 14790, -1981425662 -> 124, -1617701588 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w 'ꋌ㌁ꊛ㶧ၬ䰄๶?蹫䲄ᨱ੧漸煭졶㾄辚端Ᵹഗⴚ便䠧䚩侬ᣝ'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -883210385
    //   139: l2i
    //   140: ldc_w -939096162
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 345895712
    //   150: l2i
    //   151: ldc_w 748459200
    //   154: ixor
    //   155: ldc2_w -1728008513
    //   158: l2i
    //   159: ldc_w -2059679675
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 14782, 526820875 -> 147, 607781146 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -562825028
    //   204: l2i
    //   205: ldc_w 363701413
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1662254698
    //   215: l2i
    //   216: ldc_w -2043350644
    //   219: ixor
    //   220: ldc2_w -327358367
    //   223: l2i
    //   224: ldc_w 753678296
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 14794, -632803421 -> 256, 189694880 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1015812067
    //   262: l2i
    //   263: ldc_w 1015812066
    //   266: ixor
    //   267: ldc2_w 2125603456
    //   270: l2i
    //   271: ldc_w 2125603456
    //   274: ixor
    //   275: ldc2_w 1394763313
    //   278: l2i
    //   279: ldc_w 1394763313
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -912947070
    //   292: l2i
    //   293: ldc_w 1356435890
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1429956766
    //   303: l2i
    //   304: ldc_w -1049994450
    //   307: ixor
    //   308: ldc2_w -627627817
    //   311: l2i
    //   312: ldc_w 587785998
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 14470, -1842281579 -> 344, 1624495849 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w 1691347879
    //   356: l2i
    //   357: ldc_w -2108154116
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1219302285
    //   367: l2i
    //   368: ldc_w -495113588
    //   371: ixor
    //   372: ldc2_w 1615187472
    //   375: l2i
    //   376: ldc_w 707439650
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 14572, -1392994455 -> 364, 524330189 -> 408
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w -1462318977
    //   418: l2i
    //   419: ldc_w 1097336725
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 812817814
    //   429: l2i
    //   430: ldc_w -1553474865
    //   433: ixor
    //   434: ldc2_w -1277014089
    //   437: l2i
    //   438: ldc_w 1417470633
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 14534, 237003508 -> 426, 1955326535 -> 468
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w 'ꋜ㌖ꊖ㶶ၦ'
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w 628579360
    //   485: l2i
    //   486: ldc_w 1138484251
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -537896499
    //   496: l2i
    //   497: ldc_w -167621292
    //   500: ixor
    //   501: ldc2_w -842593701
    //   504: l2i
    //   505: ldc_w 435789925
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 14736, -1299049979 -> 493, -36913497 -> 536
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1423060521
    //   542: l2i
    //   543: ldc_w 1423060515
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 1666246646
    //   556: l2i
    //   557: ldc_w 277445464
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 416623619
    //   567: l2i
    //   568: ldc_w -1783024774
    //   571: ixor
    //   572: ldc2_w -1876755094
    //   575: l2i
    //   576: ldc_w 326544191
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 14466, -259142917 -> 564, 238569772 -> 608
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w 1248000754
    //   614: l2i
    //   615: ldc_w 1248000754
    //   618: ixor
    //   619: getstatic Perryc.0 : I
    //   622: ifle -> 636
    //   625: ldc2_w -435492804
    //   628: l2i
    //   629: ldc_w -1678398739
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w -501634814
    //   639: l2i
    //   640: ldc_w -1051905202
    //   643: ixor
    //   644: ldc2_w 1137542413
    //   647: l2i
    //   648: ldc_w -415093613
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 14778, -2015677486 -> 680, -646911153 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w 2007897120
    //   686: l2i
    //   687: ldc_w 2007897306
    //   690: ixor
    //   691: getstatic Perryc.1 : I
    //   694: ifeq -> 708
    //   697: ldc2_w 691145294
    //   700: l2i
    //   701: ldc_w -1293392726
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w -2058551919
    //   711: l2i
    //   712: ldc_w 2074522660
    //   715: ixor
    //   716: ldc2_w 102806263
    //   719: l2i
    //   720: ldc_w -961954370
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 14378, 1046693628 -> 752, 1532191149 -> 708
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w -1275182933
    //   764: l2i
    //   765: ldc_w 1534656839
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 956788695
    //   775: l2i
    //   776: ldc_w 1867294844
    //   779: ixor
    //   780: ldc2_w 1614235756
    //   783: l2i
    //   784: ldc_w -2035466373
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 816, -919497219 -> 772, 236795643 -> 14680
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.1 : I
    //   822: ifeq -> 836
    //   825: ldc2_w 1729315078
    //   828: l2i
    //   829: ldc_w -937326779
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 2065016523
    //   839: l2i
    //   840: ldc_w -1104518210
    //   843: ixor
    //   844: ldc2_w 798427301
    //   847: l2i
    //   848: ldc_w 125524051
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -2015455563 -> 14720, -1056130804 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.0 : I
    //   886: ifle -> 900
    //   889: ldc2_w -75992055
    //   892: l2i
    //   893: ldc_w -793983566
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -1987061988
    //   903: l2i
    //   904: ldc_w -57852045
    //   907: ixor
    //   908: ldc2_w 1977694920
    //   911: l2i
    //   912: ldc_w 1143989404
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, -372539340 -> 900, 437940207 -> 14762
    //   944: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.0 : I
    //   950: ifle -> 964
    //   953: ldc2_w -2007809069
    //   956: l2i
    //   957: ldc_w 1901819320
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w -1585068530
    //   967: l2i
    //   968: ldc_w 2041657275
    //   971: ixor
    //   972: ldc2_w -1548317265
    //   975: l2i
    //   976: ldc_w -1772258884
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 14660, -857488776 -> 964, -304151130 -> 1008
    //   1008: aload_0
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w 1112524871
    //   1018: l2i
    //   1019: ldc_w 2094202804
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w -1115918103
    //   1029: l2i
    //   1030: ldc_w -314991788
    //   1033: ixor
    //   1034: ldc2_w 622167835
    //   1037: l2i
    //   1038: ldc_w -599766310
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1068, -943130062 -> 14670, 1061887004 -> 1026
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w 'ꋚ㌟ꊕ㶴ၴ䱗้?蹱䲵ᨪਤ漣'
    //   1076: getstatic Perryc.c : I
    //   1079: iflt -> 1093
    //   1082: ldc2_w 1922697731
    //   1085: l2i
    //   1086: ldc_w 339074284
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w -1068824083
    //   1096: l2i
    //   1097: ldc_w 999094587
    //   1100: ixor
    //   1101: ldc2_w 172530708
    //   1104: l2i
    //   1105: ldc_w -1643882808
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, -219997133 -> 14716, -195746121 -> 1093
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w 1993451197
    //   1142: l2i
    //   1143: ldc_w 1993451189
    //   1146: ixor
    //   1147: getstatic Perryc.0 : I
    //   1150: ifle -> 1164
    //   1153: ldc2_w -926116539
    //   1156: l2i
    //   1157: ldc_w -2036626878
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 2008309493
    //   1167: l2i
    //   1168: ldc_w -810114565
    //   1171: ixor
    //   1172: ldc2_w -1738282199
    //   1175: l2i
    //   1176: ldc_w 1017059822
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -357831232 -> 14410, -278046618 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w -535582319
    //   1214: l2i
    //   1215: ldc_w -535582320
    //   1218: ixor
    //   1219: getstatic Perryc.0 : I
    //   1222: ifle -> 1236
    //   1225: ldc2_w 189419506
    //   1228: l2i
    //   1229: ldc_w 302423135
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -719889006
    //   1239: l2i
    //   1240: ldc_w -1289763854
    //   1243: ixor
    //   1244: ldc2_w 2024307022
    //   1247: l2i
    //   1248: ldc_w 751068630
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 1280, 1293995829 -> 14798, 1634092900 -> 1236
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w -1580615542
    //   1286: l2i
    //   1287: ldc_w -1580615532
    //   1290: ixor
    //   1291: getstatic Perryc.0 : I
    //   1294: ifle -> 1308
    //   1297: ldc2_w -1214542535
    //   1300: l2i
    //   1301: ldc_w -1749934471
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w -416823264
    //   1311: l2i
    //   1312: ldc_w 1198967330
    //   1315: ixor
    //   1316: ldc2_w 1904316871
    //   1319: l2i
    //   1320: ldc_w -870470790
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 14556, -1649038851 -> 1308, 499988671 -> 1352
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.1 : I
    //   1358: ifeq -> 1372
    //   1361: ldc2_w 357681377
    //   1364: l2i
    //   1365: ldc_w -487586260
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 1993691455
    //   1375: l2i
    //   1376: ldc_w 1519775119
    //   1379: ixor
    //   1380: ldc2_w 620796163
    //   1383: l2i
    //   1384: ldc_w -651862701
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 14454, -798656288 -> 1416, 193202845 -> 1372
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -1671479490
    //   1428: l2i
    //   1429: ldc_w 354393008
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 827297540
    //   1439: l2i
    //   1440: ldc_w 1474269135
    //   1443: ixor
    //   1444: ldc2_w -1762429828
    //   1447: l2i
    //   1448: ldc_w -661307956
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 14392, -953750210 -> 1436, 687229307 -> 1480
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.0 : I
    //   1486: ifle -> 1500
    //   1489: ldc2_w 1584000328
    //   1492: l2i
    //   1493: ldc_w -1194108316
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w 617117440
    //   1503: l2i
    //   1504: ldc_w 1781610944
    //   1507: ixor
    //   1508: ldc2_w 1033270285
    //   1511: l2i
    //   1512: ldc_w -1158306383
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, -1875035526 -> 1500, 1641637520 -> 14718
    //   1544: putfield blocksPerPlace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.c : I
    //   1550: iflt -> 1564
    //   1553: ldc2_w 1285465441
    //   1556: l2i
    //   1557: ldc_w -1532404754
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w 119765566
    //   1567: l2i
    //   1568: ldc_w 1540908364
    //   1571: ixor
    //   1572: ldc2_w -689350868
    //   1575: l2i
    //   1576: ldc_w 944633714
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, 110321361 -> 14514, 670448788 -> 1564
    //   1608: aload_0
    //   1609: getstatic Perryc.0 : I
    //   1612: ifle -> 1626
    //   1615: ldc2_w 1998048921
    //   1618: l2i
    //   1619: ldc_w -1526422811
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w -72828597
    //   1629: l2i
    //   1630: ldc_w -1655654088
    //   1633: ixor
    //   1634: ldc2_w 1878050247
    //   1637: l2i
    //   1638: ldc_w 858358372
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, -1899353121 -> 14676, 1622837443 -> 1626
    //   1668: aload_0
    //   1669: new bigname/zprestige/webhack/features/setting/Setting
    //   1672: dup
    //   1673: ldc_w 'ꋈ㌒ꊙ㶼ၺ䱐้?蹢䲂ᨦ'
    //   1676: getstatic Perryc.0 : I
    //   1679: ifle -> 1693
    //   1682: ldc2_w -696641986
    //   1685: l2i
    //   1686: ldc_w 1208454006
    //   1689: ixor
    //   1690: goto -> 1701
    //   1693: ldc2_w -1558834835
    //   1696: l2i
    //   1697: ldc_w -426556599
    //   1700: ixor
    //   1701: ldc2_w -496160668
    //   1704: l2i
    //   1705: ldc_w -80843906
    //   1708: ixor
    //   1709: ixor
    //   1710: lookupswitch default -> 1736, -2025929134 -> 14480, 725582993 -> 1693
    //   1736: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1739: ldc2_w 1005569887
    //   1742: l2i
    //   1743: ldc_w 1005569887
    //   1746: ixor
    //   1747: getstatic Perryc.1 : I
    //   1750: ifeq -> 1764
    //   1753: ldc2_w 1964432455
    //   1756: l2i
    //   1757: ldc_w 977194995
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 76956563
    //   1767: l2i
    //   1768: ldc_w -50284899
    //   1771: ixor
    //   1772: ldc2_w 325808738
    //   1775: l2i
    //   1776: ldc_w 376634463
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 14536, -57705677 -> 1808, 1244765577 -> 1764
    //   1808: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1811: getstatic Perryc.0 : I
    //   1814: ifle -> 1828
    //   1817: ldc2_w -969028900
    //   1820: l2i
    //   1821: ldc_w -390999134
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w 1420323326
    //   1831: l2i
    //   1832: ldc_w 531468672
    //   1835: ixor
    //   1836: ldc2_w 845339045
    //   1839: l2i
    //   1840: ldc_w -86628481
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 14526, -2085550428 -> 1872, -432478300 -> 1828
    //   1872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1875: getstatic Perryc.0 : I
    //   1878: ifle -> 1892
    //   1881: ldc2_w 1323834109
    //   1884: l2i
    //   1885: ldc_w 1695334394
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w 713109187
    //   1895: l2i
    //   1896: ldc_w 75717981
    //   1899: ixor
    //   1900: ldc2_w 1186729060
    //   1903: l2i
    //   1904: ldc_w 1601308215
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 14672, 841658196 -> 1892, 936147405 -> 1936
    //   1936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1939: getstatic Perryc.0 : I
    //   1942: ifle -> 1956
    //   1945: ldc2_w -238913344
    //   1948: l2i
    //   1949: ldc_w 166288007
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w -51405667
    //   1959: l2i
    //   1960: ldc_w -1727287090
    //   1963: ixor
    //   1964: ldc2_w -363364084
    //   1967: l2i
    //   1968: ldc_w 1967740431
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 2000, -1766470181 -> 1956, 1731589444 -> 14628
    //   2000: putfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2003: getstatic Perryc.c : I
    //   2006: iflt -> 2020
    //   2009: ldc2_w 2069838013
    //   2012: l2i
    //   2013: ldc_w -1806458593
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 2079281721
    //   2023: l2i
    //   2024: ldc_w 1218590911
    //   2027: ixor
    //   2028: ldc2_w -1721250581
    //   2031: l2i
    //   2032: ldc_w -158680420
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2064, -2132676651 -> 14596, -1887871119 -> 2020
    //   2064: aload_0
    //   2065: getstatic Perryc.1 : I
    //   2068: ifeq -> 2082
    //   2071: ldc2_w 1557038546
    //   2074: l2i
    //   2075: ldc_w 785078456
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w -1314912182
    //   2085: l2i
    //   2086: ldc_w -990923328
    //   2089: ixor
    //   2090: ldc2_w -1980210446
    //   2093: l2i
    //   2094: ldc_w -1483785604
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 14724, 1530455300 -> 2124, 1551009252 -> 2082
    //   2124: aload_0
    //   2125: new bigname/zprestige/webhack/features/setting/Setting
    //   2128: dup
    //   2129: ldc_w 'ꋙ㌆ꊎ㶸ၛ䱍๪?蹡䲍ᨦ'
    //   2132: getstatic Perryc.0 : I
    //   2135: ifle -> 2149
    //   2138: ldc2_w -604007567
    //   2141: l2i
    //   2142: ldc_w -221211615
    //   2145: ixor
    //   2146: goto -> 2157
    //   2149: ldc2_w -1892707568
    //   2152: l2i
    //   2153: ldc_w -1244665561
    //   2156: ixor
    //   2157: ldc2_w -1904585633
    //   2160: l2i
    //   2161: ldc_w 1111581711
    //   2164: ixor
    //   2165: ixor
    //   2166: lookupswitch default -> 2192, -451660032 -> 14568, 1242789359 -> 2149
    //   2192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2195: ldc2_w 1741628344
    //   2198: l2i
    //   2199: ldc_w 1741628344
    //   2202: ixor
    //   2203: getstatic Perryc.1 : I
    //   2206: ifeq -> 2220
    //   2209: ldc2_w 479814241
    //   2212: l2i
    //   2213: ldc_w 2142306112
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w 417408704
    //   2223: l2i
    //   2224: ldc_w 1073586047
    //   2227: ixor
    //   2228: ldc2_w 1702032695
    //   2231: l2i
    //   2232: ldc_w 423355985
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 2264, -197597841 -> 2220, 526421575 -> 14520
    //   2264: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2267: getstatic Perryc.0 : I
    //   2270: ifle -> 2284
    //   2273: ldc2_w 580041276
    //   2276: l2i
    //   2277: ldc_w 1313413432
    //   2280: ixor
    //   2281: goto -> 2292
    //   2284: ldc2_w -2082875415
    //   2287: l2i
    //   2288: ldc_w -758108250
    //   2291: ixor
    //   2292: ldc2_w -1143343069
    //   2295: l2i
    //   2296: ldc_w -1486587746
    //   2299: ixor
    //   2300: ixor
    //   2301: lookupswitch default -> 14788, 1303673074 -> 2328, 1885742009 -> 2284
    //   2328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2331: getstatic Perryc.1 : I
    //   2334: ifeq -> 2348
    //   2337: ldc2_w -1195598146
    //   2340: l2i
    //   2341: ldc_w -729088075
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w -1848047166
    //   2351: l2i
    //   2352: ldc_w 1302645082
    //   2355: ixor
    //   2356: ldc2_w -1207613995
    //   2359: l2i
    //   2360: ldc_w -2142113901
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 14674, -467047714 -> 2392, 1415760717 -> 2348
    //   2392: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2395: getstatic Perryc.0 : I
    //   2398: ifle -> 2412
    //   2401: ldc2_w -720630738
    //   2404: l2i
    //   2405: ldc_w -643051750
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w 1332121530
    //   2415: l2i
    //   2416: ldc_w -2110197706
    //   2419: ixor
    //   2420: ldc2_w -534264366
    //   2423: l2i
    //   2424: ldc_w -1208445935
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 2456, 381287457 -> 2412, 1534628599 -> 14492
    //   2456: putfield disable : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2459: getstatic Perryc.1 : I
    //   2462: ifeq -> 2476
    //   2465: ldc2_w 868806209
    //   2468: l2i
    //   2469: ldc_w 1643678659
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w 834727956
    //   2479: l2i
    //   2480: ldc_w -1530640653
    //   2483: ixor
    //   2484: ldc2_w 636493267
    //   2487: l2i
    //   2488: ldc_w -916193631
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 14682, -1096579344 -> 2476, 2039960981 -> 2520
    //   2520: aload_0
    //   2521: getstatic Perryc.c : I
    //   2524: iflt -> 2538
    //   2527: ldc2_w -840464743
    //   2530: l2i
    //   2531: ldc_w 1373069073
    //   2534: ixor
    //   2535: goto -> 2546
    //   2538: ldc2_w 201880281
    //   2541: l2i
    //   2542: ldc_w -1863930552
    //   2545: ixor
    //   2546: ldc2_w 1542252830
    //   2549: l2i
    //   2550: ldc_w -1398200505
    //   2553: ixor
    //   2554: ixor
    //   2555: lookupswitch default -> 14394, 1802835921 -> 2538, 1806373320 -> 2580
    //   2580: aload_0
    //   2581: new bigname/zprestige/webhack/features/setting/Setting
    //   2584: dup
    //   2585: ldc_w 'ꋊ㌜ꊎ㶶ၫ䱁'
    //   2588: getstatic Perryc.0 : I
    //   2591: ifle -> 2605
    //   2594: ldc2_w -474438671
    //   2597: l2i
    //   2598: ldc_w 78717843
    //   2601: ixor
    //   2602: goto -> 2613
    //   2605: ldc2_w -710378042
    //   2608: l2i
    //   2609: ldc_w 1239815216
    //   2612: ixor
    //   2613: ldc2_w -614841685
    //   2616: l2i
    //   2617: ldc_w 1162216448
    //   2620: ixor
    //   2621: ixor
    //   2622: lookupswitch default -> 14784, 38940509 -> 2648, 2031470281 -> 2605
    //   2648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2651: ldc2_w 1096605734
    //   2654: l2i
    //   2655: ldc_w 1096605734
    //   2658: ixor
    //   2659: getstatic Perryc.1 : I
    //   2662: ifeq -> 2676
    //   2665: ldc2_w -75962316
    //   2668: l2i
    //   2669: ldc_w -686997305
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w 1357577655
    //   2679: l2i
    //   2680: ldc_w 1456421534
    //   2683: ixor
    //   2684: ldc2_w 1375577460
    //   2687: l2i
    //   2688: ldc_w -166903463
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 2720, -1954198306 -> 14776, 35808915 -> 2676
    //   2720: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2723: getstatic Perryc.1 : I
    //   2726: ifeq -> 2740
    //   2729: ldc2_w -967973694
    //   2732: l2i
    //   2733: ldc_w -903485411
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w 558027369
    //   2743: l2i
    //   2744: ldc_w -908100829
    //   2747: ixor
    //   2748: ldc2_w -1926902673
    //   2751: l2i
    //   2752: ldc_w -1466121982
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 2784, 116506319 -> 2740, 701563314 -> 14498
    //   2784: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2787: getstatic Perryc.0 : I
    //   2790: ifle -> 2804
    //   2793: ldc2_w -416368137
    //   2796: l2i
    //   2797: ldc_w 502414620
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -2064593486
    //   2807: l2i
    //   2808: ldc_w 1157308574
    //   2811: ixor
    //   2812: ldc2_w 69220489
    //   2815: l2i
    //   2816: ldc_w -1892162892
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 2848, 1793100009 -> 2804, 1909153494 -> 14786
    //   2848: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2851: getstatic Perryc.0 : I
    //   2854: ifle -> 2868
    //   2857: ldc2_w 489332629
    //   2860: l2i
    //   2861: ldc_w -294267343
    //   2864: ixor
    //   2865: goto -> 2876
    //   2868: ldc2_w 1772327755
    //   2871: l2i
    //   2872: ldc_w -237965123
    //   2875: ixor
    //   2876: ldc2_w -2068091678
    //   2879: l2i
    //   2880: ldc_w 1543857572
    //   2883: ixor
    //   2884: ixor
    //   2885: lookupswitch default -> 14402, 736182498 -> 2868, 1087204016 -> 2912
    //   2912: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2915: getstatic Perryc.0 : I
    //   2918: ifle -> 2932
    //   2921: ldc2_w -1252843331
    //   2924: l2i
    //   2925: ldc_w 729094792
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w 1820660109
    //   2935: l2i
    //   2936: ldc_w -319423552
    //   2939: ixor
    //   2940: ldc2_w 2128466025
    //   2943: l2i
    //   2944: ldc_w -527577834
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 14692, 7743306 -> 2932, 505476914 -> 2976
    //   2976: aload_0
    //   2977: getstatic Perryc.c : I
    //   2980: iflt -> 2994
    //   2983: ldc2_w -1565456737
    //   2986: l2i
    //   2987: ldc_w 1114958248
    //   2990: ixor
    //   2991: goto -> 3002
    //   2994: ldc2_w -2052189401
    //   2997: l2i
    //   2998: ldc_w 1663547612
    //   3001: ixor
    //   3002: ldc2_w -866520819
    //   3005: l2i
    //   3006: ldc_w -157226202
    //   3009: ixor
    //   3010: ixor
    //   3011: lookupswitch default -> 14418, -633539300 -> 2994, -596594224 -> 3036
    //   3036: aload_0
    //   3037: new bigname/zprestige/webhack/features/setting/Setting
    //   3040: dup
    //   3041: ldc_w 'ꋊ㌒ꊃ㶣ၭ䱅๺?'
    //   3044: getstatic Perryc.c : I
    //   3047: iflt -> 3061
    //   3050: ldc2_w 709357741
    //   3053: l2i
    //   3054: ldc_w -324451540
    //   3057: ixor
    //   3058: goto -> 3069
    //   3061: ldc2_w 1083551384
    //   3064: l2i
    //   3065: ldc_w -566813958
    //   3068: ixor
    //   3069: ldc2_w -2030237151
    //   3072: l2i
    //   3073: ldc_w -870271039
    //   3076: ixor
    //   3077: ixor
    //   3078: lookupswitch default -> 14448, -1942811039 -> 3061, -729871998 -> 3104
    //   3104: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3107: ldc2_w 1274311881
    //   3110: l2i
    //   3111: ldc_w 1274311881
    //   3114: ixor
    //   3115: getstatic Perryc.0 : I
    //   3118: ifle -> 3132
    //   3121: ldc2_w 1075700751
    //   3124: l2i
    //   3125: ldc_w -1511986426
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w -1071227437
    //   3135: l2i
    //   3136: ldc_w -570093011
    //   3139: ixor
    //   3140: ldc2_w -1906330033
    //   3143: l2i
    //   3144: ldc_w -1042713252
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 14408, -1434727398 -> 3132, 1369804013 -> 3176
    //   3176: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3179: getstatic Perryc.c : I
    //   3182: iflt -> 3196
    //   3185: ldc2_w -1352005854
    //   3188: l2i
    //   3189: ldc_w -68949325
    //   3192: ixor
    //   3193: goto -> 3204
    //   3196: ldc2_w 1459406499
    //   3199: l2i
    //   3200: ldc_w 1253343338
    //   3203: ixor
    //   3204: ldc2_w 805189869
    //   3207: l2i
    //   3208: ldc_w 1713140845
    //   3211: ixor
    //   3212: ixor
    //   3213: lookupswitch default -> 3240, 493592849 -> 14622, 596370504 -> 3196
    //   3240: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3243: getstatic Perryc.c : I
    //   3246: iflt -> 3260
    //   3249: ldc2_w -1166142281
    //   3252: l2i
    //   3253: ldc_w 636886934
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w -1502590815
    //   3263: l2i
    //   3264: ldc_w -1395234010
    //   3267: ixor
    //   3268: ldc2_w -792703500
    //   3271: l2i
    //   3272: ldc_w -435952215
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 3304, -1454660740 -> 14590, 386711093 -> 3260
    //   3304: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3307: getstatic Perryc.c : I
    //   3310: iflt -> 3324
    //   3313: ldc2_w -1826195005
    //   3316: l2i
    //   3317: ldc_w -1188496713
    //   3320: ixor
    //   3321: goto -> 3332
    //   3324: ldc2_w -1161013468
    //   3327: l2i
    //   3328: ldc_w 95530537
    //   3331: ixor
    //   3332: ldc2_w -508276313
    //   3335: l2i
    //   3336: ldc_w -1827217898
    //   3339: ixor
    //   3340: ixor
    //   3341: lookupswitch default -> 14434, -840993092 -> 3368, 1487670469 -> 3324
    //   3368: putfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3371: getstatic Perryc.c : I
    //   3374: iflt -> 3388
    //   3377: ldc2_w -875119257
    //   3380: l2i
    //   3381: ldc_w 1867051483
    //   3384: ixor
    //   3385: goto -> 3396
    //   3388: ldc2_w 1551431978
    //   3391: l2i
    //   3392: ldc_w -1129349508
    //   3395: ixor
    //   3396: ldc2_w 652540844
    //   3399: l2i
    //   3400: ldc_w -1673245793
    //   3403: ixor
    //   3404: ixor
    //   3405: lookupswitch default -> 3432, 507444367 -> 14412, 688938826 -> 3388
    //   3432: aload_0
    //   3433: getstatic Perryc.1 : I
    //   3436: ifeq -> 3450
    //   3439: ldc2_w -1221440511
    //   3442: l2i
    //   3443: ldc_w 1264324873
    //   3446: ixor
    //   3447: goto -> 3458
    //   3450: ldc2_w -1969767021
    //   3453: l2i
    //   3454: ldc_w 2041671831
    //   3457: ixor
    //   3458: ldc2_w 1409360642
    //   3461: l2i
    //   3462: ldc_w 118939736
    //   3465: ixor
    //   3466: ixor
    //   3467: lookupswitch default -> 14616, -1607397794 -> 3492, -1350984110 -> 3450
    //   3492: aload_0
    //   3493: new bigname/zprestige/webhack/features/setting/Setting
    //   3496: dup
    //   3497: ldc_w 'ꋞ㌖ꊟ㶣'
    //   3500: getstatic Perryc.c : I
    //   3503: iflt -> 3517
    //   3506: ldc2_w -1897688802
    //   3509: l2i
    //   3510: ldc_w 1034853608
    //   3513: ixor
    //   3514: goto -> 3525
    //   3517: ldc2_w -1337609408
    //   3520: l2i
    //   3521: ldc_w -23622376
    //   3524: ixor
    //   3525: ldc2_w -356408780
    //   3528: l2i
    //   3529: ldc_w 1365206896
    //   3532: ixor
    //   3533: ixor
    //   3534: lookupswitch default -> 14372, -179504356 -> 3560, 148097202 -> 3517
    //   3560: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3563: ldc2_w -2040986846
    //   3566: l2i
    //   3567: ldc_w -2040986845
    //   3570: ixor
    //   3571: getstatic Perryc.c : I
    //   3574: iflt -> 3588
    //   3577: ldc2_w -1820327576
    //   3580: l2i
    //   3581: ldc_w 1869431560
    //   3584: ixor
    //   3585: goto -> 3596
    //   3588: ldc2_w 136949371
    //   3591: l2i
    //   3592: ldc_w -259873645
    //   3595: ixor
    //   3596: ldc2_w 1709336829
    //   3599: l2i
    //   3600: ldc_w -1282622826
    //   3603: ixor
    //   3604: ixor
    //   3605: lookupswitch default -> 14754, 713265163 -> 3588, 784717955 -> 3632
    //   3632: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3635: getstatic Perryc.c : I
    //   3638: iflt -> 3652
    //   3641: ldc2_w -863185563
    //   3644: l2i
    //   3645: ldc_w 1002162849
    //   3648: ixor
    //   3649: goto -> 3660
    //   3652: ldc2_w 241583057
    //   3655: l2i
    //   3656: ldc_w 903434079
    //   3659: ixor
    //   3660: ldc2_w 498983831
    //   3663: l2i
    //   3664: ldc_w 560606784
    //   3667: ixor
    //   3668: ixor
    //   3669: lookupswitch default -> 3696, -874458605 -> 14606, 442472682 -> 3652
    //   3696: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3699: getstatic Perryc.1 : I
    //   3702: ifeq -> 3716
    //   3705: ldc2_w 1393817562
    //   3708: l2i
    //   3709: ldc_w -1079296173
    //   3712: ixor
    //   3713: goto -> 3724
    //   3716: ldc2_w 1570112682
    //   3719: l2i
    //   3720: ldc_w 364064620
    //   3723: ixor
    //   3724: ldc2_w 11124430
    //   3727: l2i
    //   3728: ldc_w 678465780
    //   3731: ixor
    //   3732: ixor
    //   3733: lookupswitch default -> 3760, -1000216909 -> 14774, -516092656 -> 3716
    //   3760: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3763: getstatic Perryc.0 : I
    //   3766: ifle -> 3780
    //   3769: ldc2_w 1628848278
    //   3772: l2i
    //   3773: ldc_w 733442404
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 386233899
    //   3783: l2i
    //   3784: ldc_w 259255319
    //   3787: ixor
    //   3788: ldc2_w 1854341028
    //   3791: l2i
    //   3792: ldc_w 1156832242
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 14586, 839106154 -> 3824, 1624511908 -> 3780
    //   3824: putfield lowerbody : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3827: getstatic Perryc.0 : I
    //   3830: ifle -> 3844
    //   3833: ldc2_w -1435329021
    //   3836: l2i
    //   3837: ldc_w 1670959950
    //   3840: ixor
    //   3841: goto -> 3852
    //   3844: ldc2_w 1450470759
    //   3847: l2i
    //   3848: ldc_w 1172216275
    //   3851: ixor
    //   3852: ldc2_w -58513005
    //   3855: l2i
    //   3856: ldc_w 383898058
    //   3859: ixor
    //   3860: ixor
    //   3861: lookupswitch default -> 3888, 596161812 -> 14528, 1742735501 -> 3844
    //   3888: aload_0
    //   3889: getstatic Perryc.c : I
    //   3892: iflt -> 3906
    //   3895: ldc2_w 1558283370
    //   3898: l2i
    //   3899: ldc_w 2045301017
    //   3902: ixor
    //   3903: goto -> 3914
    //   3906: ldc2_w 2049929458
    //   3909: l2i
    //   3910: ldc_w -593293549
    //   3913: ixor
    //   3914: ldc2_w 945909173
    //   3917: l2i
    //   3918: ldc_w 1009588023
    //   3921: ixor
    //   3922: ixor
    //   3923: lookupswitch default -> 14510, -1564474013 -> 3948, 558182385 -> 3906
    //   3948: aload_0
    //   3949: new bigname/zprestige/webhack/features/setting/Setting
    //   3952: dup
    //   3953: ldc_w 'ꋞ㌒ꊙ㶲'
    //   3956: getstatic Perryc.c : I
    //   3959: iflt -> 3973
    //   3962: ldc2_w -503380457
    //   3965: l2i
    //   3966: ldc_w -1279000214
    //   3969: ixor
    //   3970: goto -> 3981
    //   3973: ldc2_w 1378318130
    //   3976: l2i
    //   3977: ldc_w 510663438
    //   3980: ixor
    //   3981: ldc2_w -953770570
    //   3984: l2i
    //   3985: ldc_w 1187134415
    //   3988: ixor
    //   3989: ixor
    //   3990: lookupswitch default -> 4016, -1146376221 -> 3973, -740318972 -> 14400
    //   4016: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4019: ldc2_w 283374192
    //   4022: l2i
    //   4023: ldc_w 283374192
    //   4026: ixor
    //   4027: getstatic Perryc.c : I
    //   4030: iflt -> 4044
    //   4033: ldc2_w -52902576
    //   4036: l2i
    //   4037: ldc_w -1537546734
    //   4040: ixor
    //   4041: goto -> 4052
    //   4044: ldc2_w 123848732
    //   4047: l2i
    //   4048: ldc_w -2027529691
    //   4051: ixor
    //   4052: ldc2_w 321121145
    //   4055: l2i
    //   4056: ldc_w 422497673
    //   4059: ixor
    //   4060: ixor
    //   4061: lookupswitch default -> 14632, -1974815543 -> 4088, 1385104818 -> 4044
    //   4088: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4091: getstatic Perryc.c : I
    //   4094: iflt -> 4108
    //   4097: ldc2_w 1990535687
    //   4100: l2i
    //   4101: ldc_w 55366900
    //   4104: ixor
    //   4105: goto -> 4116
    //   4108: ldc2_w -2123190072
    //   4111: l2i
    //   4112: ldc_w 2034055401
    //   4115: ixor
    //   4116: ldc2_w 1519423442
    //   4119: l2i
    //   4120: ldc_w -1417451770
    //   4123: ixor
    //   4124: ixor
    //   4125: lookupswitch default -> 14472, -2063985113 -> 4108, 157049077 -> 4152
    //   4152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4155: getstatic Perryc.1 : I
    //   4158: ifeq -> 4172
    //   4161: ldc2_w -563552380
    //   4164: l2i
    //   4165: ldc_w -69375641
    //   4168: ixor
    //   4169: goto -> 4180
    //   4172: ldc2_w -1710155146
    //   4175: l2i
    //   4176: ldc_w -1519517230
    //   4179: ixor
    //   4180: ldc2_w -2142467805
    //   4183: l2i
    //   4184: ldc_w 1886268341
    //   4187: ixor
    //   4188: ixor
    //   4189: lookupswitch default -> 4216, -2110209047 -> 4172, -711519115 -> 14752
    //   4216: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4219: getstatic Perryc.1 : I
    //   4222: ifeq -> 4236
    //   4225: ldc2_w 530635225
    //   4228: l2i
    //   4229: ldc_w 2117117216
    //   4232: ixor
    //   4233: goto -> 4244
    //   4236: ldc2_w 1370482636
    //   4239: l2i
    //   4240: ldc_w 461135691
    //   4243: ixor
    //   4244: ldc2_w 455649768
    //   4247: l2i
    //   4248: ldc_w -1356912384
    //   4251: ixor
    //   4252: ixor
    //   4253: lookupswitch default -> 14574, -710411247 -> 4236, -18597777 -> 4280
    //   4280: putfield upperBody : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4283: getstatic Perryc.1 : I
    //   4286: ifeq -> 4300
    //   4289: ldc2_w -2092312247
    //   4292: l2i
    //   4293: ldc_w 2106966728
    //   4296: ixor
    //   4297: goto -> 4308
    //   4300: ldc2_w -170366579
    //   4303: l2i
    //   4304: ldc_w -1318341913
    //   4307: ixor
    //   4308: ldc2_w -359964370
    //   4311: l2i
    //   4312: ldc_w -2036799524
    //   4315: ixor
    //   4316: ixor
    //   4317: lookupswitch default -> 4344, -1831887501 -> 14390, -1771449362 -> 4300
    //   4344: aload_0
    //   4345: getstatic Perryc.1 : I
    //   4348: ifeq -> 4362
    //   4351: ldc2_w 1724897591
    //   4354: l2i
    //   4355: ldc_w 683159525
    //   4358: ixor
    //   4359: goto -> 4370
    //   4362: ldc2_w 772848593
    //   4365: l2i
    //   4366: ldc_w 2139497168
    //   4369: ixor
    //   4370: ldc2_w 880659865
    //   4373: l2i
    //   4374: ldc_w -1216511262
    //   4377: ixor
    //   4378: ixor
    //   4379: lookupswitch default -> 14482, -847791703 -> 4362, -761866630 -> 4404
    //   4404: aload_0
    //   4405: new bigname/zprestige/webhack/features/setting/Setting
    //   4408: dup
    //   4409: ldc_w 'ꋊ㌖ꊔ㶳ၺ䱖'
    //   4412: getstatic Perryc.1 : I
    //   4415: ifeq -> 4429
    //   4418: ldc2_w 1960695077
    //   4421: l2i
    //   4422: ldc_w -1695470518
    //   4425: ixor
    //   4426: goto -> 4437
    //   4429: ldc2_w 1314278014
    //   4432: l2i
    //   4433: ldc_w 1634449056
    //   4436: ixor
    //   4437: ldc2_w -1689075773
    //   4440: l2i
    //   4441: ldc_w -158976806
    //   4444: ixor
    //   4445: ixor
    //   4446: lookupswitch default -> 4472, -2080869770 -> 14658, 1486878726 -> 4429
    //   4472: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4475: ldc2_w -661126423
    //   4478: l2i
    //   4479: ldc_w -661126423
    //   4482: ixor
    //   4483: getstatic Perryc.c : I
    //   4486: iflt -> 4500
    //   4489: ldc2_w 683630675
    //   4492: l2i
    //   4493: ldc_w -1911419193
    //   4496: ixor
    //   4497: goto -> 4508
    //   4500: ldc2_w -513684404
    //   4503: l2i
    //   4504: ldc_w -1930464462
    //   4507: ixor
    //   4508: ldc2_w 1036355324
    //   4511: l2i
    //   4512: ldc_w -300102022
    //   4515: ixor
    //   4516: ixor
    //   4517: lookupswitch default -> 4544, -1278446356 -> 4500, 1970546194 -> 14462
    //   4544: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4547: getstatic Perryc.c : I
    //   4550: iflt -> 4564
    //   4553: ldc2_w 1040804528
    //   4556: l2i
    //   4557: ldc_w 787425295
    //   4560: ixor
    //   4561: goto -> 4572
    //   4564: ldc2_w -1910643785
    //   4567: l2i
    //   4568: ldc_w 142918058
    //   4571: ixor
    //   4572: ldc2_w 517108105
    //   4575: l2i
    //   4576: ldc_w -345822183
    //   4579: ixor
    //   4580: ixor
    //   4581: lookupswitch default -> 14518, -447275217 -> 4564, 1932033933 -> 4608
    //   4608: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4611: getstatic Perryc.0 : I
    //   4614: ifle -> 4628
    //   4617: ldc2_w -1936922966
    //   4620: l2i
    //   4621: ldc_w -1527516098
    //   4624: ixor
    //   4625: goto -> 4636
    //   4628: ldc2_w -2023238780
    //   4631: l2i
    //   4632: ldc_w -1620131328
    //   4635: ixor
    //   4636: ldc2_w -1062066955
    //   4639: l2i
    //   4640: ldc_w 785446360
    //   4643: ixor
    //   4644: ixor
    //   4645: lookupswitch default -> 14450, -971127879 -> 4628, -160710487 -> 4672
    //   4672: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4675: getstatic Perryc.1 : I
    //   4678: ifeq -> 4692
    //   4681: ldc2_w 1344058851
    //   4684: l2i
    //   4685: ldc_w -366595822
    //   4688: ixor
    //   4689: goto -> 4700
    //   4692: ldc2_w -1792065112
    //   4695: l2i
    //   4696: ldc_w 1983595371
    //   4699: ixor
    //   4700: ldc2_w 315017543
    //   4703: l2i
    //   4704: ldc_w -1803246973
    //   4707: ixor
    //   4708: ixor
    //   4709: lookupswitch default -> 4736, -468916144 -> 4692, 1014558517 -> 14618
    //   4736: putfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4739: getstatic Perryc.0 : I
    //   4742: ifle -> 4756
    //   4745: ldc2_w 2071053710
    //   4748: l2i
    //   4749: ldc_w -1454797956
    //   4752: ixor
    //   4753: goto -> 4764
    //   4756: ldc2_w -216593364
    //   4759: l2i
    //   4760: ldc_w -1220608886
    //   4763: ixor
    //   4764: ldc2_w 1360967010
    //   4767: l2i
    //   4768: ldc_w 889094243
    //   4771: ixor
    //   4772: ixor
    //   4773: lookupswitch default -> 4800, -1210549261 -> 14750, 1702869691 -> 4756
    //   4800: aload_0
    //   4801: getstatic Perryc.1 : I
    //   4804: ifeq -> 4818
    //   4807: ldc2_w -1892874855
    //   4810: l2i
    //   4811: ldc_w 1335223911
    //   4814: ixor
    //   4815: goto -> 4826
    //   4818: ldc2_w 1946700182
    //   4821: l2i
    //   4822: ldc_w 879540542
    //   4825: ixor
    //   4826: ldc2_w 1512331735
    //   4829: l2i
    //   4830: ldc_w -546615563
    //   4833: ixor
    //   4834: ixor
    //   4835: lookupswitch default -> 14704, -986978422 -> 4860, 1173877980 -> 4818
    //   4860: aload_0
    //   4861: new bigname/zprestige/webhack/features/setting/Setting
    //   4864: dup
    //   4865: ldc_w 'ꋚ㌜ꊂ'
    //   4868: getstatic Perryc.c : I
    //   4871: iflt -> 4885
    //   4874: ldc2_w -1202584984
    //   4877: l2i
    //   4878: ldc_w -1447354219
    //   4881: ixor
    //   4882: goto -> 4893
    //   4885: ldc2_w -1963137799
    //   4888: l2i
    //   4889: ldc_w 559218791
    //   4892: ixor
    //   4893: ldc2_w -787038338
    //   4896: l2i
    //   4897: ldc_w 1692920302
    //   4900: ixor
    //   4901: ixor
    //   4902: lookupswitch default -> 4928, -1541901203 -> 14608, 1246477822 -> 4885
    //   4928: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4931: ldc2_w 2095543606
    //   4934: l2i
    //   4935: ldc_w 2095543606
    //   4938: ixor
    //   4939: getstatic Perryc.1 : I
    //   4942: ifeq -> 4956
    //   4945: ldc2_w -1075138445
    //   4948: l2i
    //   4949: ldc_w 1760193666
    //   4952: ixor
    //   4953: goto -> 4964
    //   4956: ldc2_w 633039165
    //   4959: l2i
    //   4960: ldc_w -231675157
    //   4963: ixor
    //   4964: ldc2_w 1505715140
    //   4967: l2i
    //   4968: ldc_w -725569619
    //   4971: ixor
    //   4972: ixor
    //   4973: lookupswitch default -> 14484, 1518276760 -> 4956, 1525960639 -> 5000
    //   5000: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5003: getstatic Perryc.1 : I
    //   5006: ifeq -> 5020
    //   5009: ldc2_w 1246555473
    //   5012: l2i
    //   5013: ldc_w -1238886309
    //   5016: ixor
    //   5017: goto -> 5028
    //   5020: ldc2_w -1972819791
    //   5023: l2i
    //   5024: ldc_w -341645524
    //   5027: ixor
    //   5028: ldc2_w 1624825364
    //   5031: l2i
    //   5032: ldc_w 843577813
    //   5035: ixor
    //   5036: ixor
    //   5037: lookupswitch default -> 5064, -1359228213 -> 14722, 237643540 -> 5020
    //   5064: aload_0
    //   5065: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   5070: getstatic Perryc.c : I
    //   5073: iflt -> 5087
    //   5076: ldc2_w -1405172861
    //   5079: l2i
    //   5080: ldc_w -2123920876
    //   5083: ixor
    //   5084: goto -> 5095
    //   5087: ldc2_w 195426529
    //   5090: l2i
    //   5091: ldc_w 2112177819
    //   5094: ixor
    //   5095: ldc2_w 490769166
    //   5098: l2i
    //   5099: ldc_w 1581393480
    //   5102: ixor
    //   5103: ixor
    //   5104: lookupswitch default -> 14382, 893522748 -> 5132, 1851516113 -> 5087
    //   5132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5135: getstatic Perryc.0 : I
    //   5138: ifle -> 5152
    //   5141: ldc2_w 1302331837
    //   5144: l2i
    //   5145: ldc_w -1307605534
    //   5148: ixor
    //   5149: goto -> 5160
    //   5152: ldc2_w -1141191202
    //   5155: l2i
    //   5156: ldc_w 752206359
    //   5159: ixor
    //   5160: ldc2_w -2017860398
    //   5163: l2i
    //   5164: ldc_w -1417995512
    //   5167: ixor
    //   5168: ixor
    //   5169: lookupswitch default -> 14502, -1142034413 -> 5196, -747799675 -> 5152
    //   5196: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5199: getstatic Perryc.1 : I
    //   5202: ifeq -> 5216
    //   5205: ldc2_w 16711082
    //   5208: l2i
    //   5209: ldc_w -56448028
    //   5212: ixor
    //   5213: goto -> 5224
    //   5216: ldc2_w -2073262833
    //   5219: l2i
    //   5220: ldc_w -1851082677
    //   5223: ixor
    //   5224: ldc2_w -620422212
    //   5227: l2i
    //   5228: ldc_w -559889927
    //   5231: ixor
    //   5232: ixor
    //   5233: lookupswitch default -> 14430, -101086197 -> 5216, 274982657 -> 5260
    //   5260: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5263: getstatic Perryc.1 : I
    //   5266: ifeq -> 5280
    //   5269: ldc2_w 812451182
    //   5272: l2i
    //   5273: ldc_w 449103476
    //   5276: ixor
    //   5277: goto -> 5288
    //   5280: ldc2_w -1915836390
    //   5283: l2i
    //   5284: ldc_w -216638533
    //   5287: ixor
    //   5288: ldc2_w 536753103
    //   5291: l2i
    //   5292: ldc_w 201799108
    //   5295: ixor
    //   5296: ixor
    //   5297: lookupswitch default -> 14792, 961594641 -> 5280, 1830942122 -> 5324
    //   5324: aload_0
    //   5325: getstatic Perryc.1 : I
    //   5328: ifeq -> 5342
    //   5331: ldc2_w 1688913644
    //   5334: l2i
    //   5335: ldc_w -570562201
    //   5338: ixor
    //   5339: goto -> 5350
    //   5342: ldc2_w -780828985
    //   5345: l2i
    //   5346: ldc_w -1205924389
    //   5349: ixor
    //   5350: ldc2_w -1574842435
    //   5353: l2i
    //   5354: ldc_w -1803138252
    //   5357: ixor
    //   5358: ixor
    //   5359: lookupswitch default -> 14630, -1880052990 -> 5342, 1607333781 -> 5384
    //   5384: aload_0
    //   5385: new bigname/zprestige/webhack/features/setting/Setting
    //   5388: dup
    //   5389: ldc_w 'ꋊ㌖ꊞ'
    //   5392: getstatic Perryc.1 : I
    //   5395: ifeq -> 5409
    //   5398: ldc2_w -2046081208
    //   5401: l2i
    //   5402: ldc_w 351262328
    //   5405: ixor
    //   5406: goto -> 5417
    //   5409: ldc2_w -1424426002
    //   5412: l2i
    //   5413: ldc_w -798298352
    //   5416: ixor
    //   5417: ldc2_w -1075499058
    //   5420: l2i
    //   5421: ldc_w -1908700340
    //   5424: ixor
    //   5425: ixor
    //   5426: lookupswitch default -> 5452, -1556466254 -> 14666, 1556916638 -> 5409
    //   5452: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5455: ldc2_w 1670101965
    //   5458: l2i
    //   5459: ldc_w 1670101965
    //   5462: ixor
    //   5463: getstatic Perryc.0 : I
    //   5466: ifle -> 5480
    //   5469: ldc2_w -588327603
    //   5472: l2i
    //   5473: ldc_w -1863480924
    //   5476: ixor
    //   5477: goto -> 5488
    //   5480: ldc2_w 1301546143
    //   5483: l2i
    //   5484: ldc_w -637477983
    //   5487: ixor
    //   5488: ldc2_w -1242728678
    //   5491: l2i
    //   5492: ldc_w 53864810
    //   5495: ixor
    //   5496: ixor
    //   5497: lookupswitch default -> 5524, -1040158943 -> 5480, -86261095 -> 14542
    //   5524: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5527: ldc2_w -1419198321
    //   5530: l2i
    //   5531: ldc_w -1419198321
    //   5534: ixor
    //   5535: getstatic Perryc.c : I
    //   5538: iflt -> 5552
    //   5541: ldc2_w 1398554537
    //   5544: l2i
    //   5545: ldc_w -1096044891
    //   5548: ixor
    //   5549: goto -> 5560
    //   5552: ldc2_w 372851435
    //   5555: l2i
    //   5556: ldc_w -1070092907
    //   5559: ixor
    //   5560: ldc2_w 1916961624
    //   5563: l2i
    //   5564: ldc_w -316765523
    //   5567: ixor
    //   5568: ixor
    //   5569: lookupswitch default -> 5596, -737292558 -> 5552, 1923848441 -> 14488
    //   5596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5599: ldc2_w -258731824
    //   5602: l2i
    //   5603: ldc_w -258731985
    //   5606: ixor
    //   5607: getstatic Perryc.0 : I
    //   5610: ifle -> 5624
    //   5613: ldc2_w 1735335984
    //   5616: l2i
    //   5617: ldc_w -1617780418
    //   5620: ixor
    //   5621: goto -> 5632
    //   5624: ldc2_w 894441825
    //   5627: l2i
    //   5628: ldc_w 804541156
    //   5631: ixor
    //   5632: ldc2_w -1582674640
    //   5635: l2i
    //   5636: ldc_w 253809737
    //   5639: ixor
    //   5640: ixor
    //   5641: lookupswitch default -> 14458, -1271999748 -> 5668, 1450645623 -> 5624
    //   5668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5671: getstatic Perryc.c : I
    //   5674: iflt -> 5688
    //   5677: ldc2_w 724340885
    //   5680: l2i
    //   5681: ldc_w -293043131
    //   5684: ixor
    //   5685: goto -> 5696
    //   5688: ldc2_w -1787808748
    //   5691: l2i
    //   5692: ldc_w 935944259
    //   5695: ixor
    //   5696: ldc2_w 343457840
    //   5699: l2i
    //   5700: ldc_w 607762884
    //   5703: ixor
    //   5704: ixor
    //   5705: lookupswitch default -> 14698, -1829229149 -> 5732, -169513692 -> 5688
    //   5732: aload_0
    //   5733: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   5738: getstatic Perryc.0 : I
    //   5741: ifle -> 5755
    //   5744: ldc2_w 247017656
    //   5747: l2i
    //   5748: ldc_w 1135122635
    //   5751: ixor
    //   5752: goto -> 5763
    //   5755: ldc2_w 1830027519
    //   5758: l2i
    //   5759: ldc_w 314151922
    //   5762: ixor
    //   5763: ldc2_w 619125877
    //   5766: l2i
    //   5767: ldc_w 1143913308
    //   5770: ixor
    //   5771: ixor
    //   5772: lookupswitch default -> 5800, -146045067 -> 5755, 769134426 -> 14662
    //   5800: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5803: getstatic Perryc.0 : I
    //   5806: ifle -> 5820
    //   5809: ldc2_w 998673104
    //   5812: l2i
    //   5813: ldc_w -1616366014
    //   5816: ixor
    //   5817: goto -> 5828
    //   5820: ldc2_w -783286565
    //   5823: l2i
    //   5824: ldc_w 1439638858
    //   5827: ixor
    //   5828: ldc2_w 299676323
    //   5831: l2i
    //   5832: ldc_w 452377255
    //   5835: ixor
    //   5836: ixor
    //   5837: lookupswitch default -> 14706, -1884630123 -> 5864, -1358646122 -> 5820
    //   5864: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5867: getstatic Perryc.c : I
    //   5870: iflt -> 5884
    //   5873: ldc2_w -1661706840
    //   5876: l2i
    //   5877: ldc_w -1785328390
    //   5880: ixor
    //   5881: goto -> 5892
    //   5884: ldc2_w -1524163417
    //   5887: l2i
    //   5888: ldc_w -1965014066
    //   5891: ixor
    //   5892: ldc2_w 645549202
    //   5895: l2i
    //   5896: ldc_w -1174850266
    //   5899: ixor
    //   5900: ixor
    //   5901: lookupswitch default -> 5928, -1763628826 -> 14424, -361976140 -> 5884
    //   5928: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5931: getstatic Perryc.1 : I
    //   5934: ifeq -> 5948
    //   5937: ldc2_w -781378733
    //   5940: l2i
    //   5941: ldc_w -1138524233
    //   5944: ixor
    //   5945: goto -> 5956
    //   5948: ldc2_w -1327583671
    //   5951: l2i
    //   5952: ldc_w -704736637
    //   5955: ixor
    //   5956: ldc2_w -102982588
    //   5959: l2i
    //   5960: ldc_w 1713165857
    //   5963: ixor
    //   5964: ixor
    //   5965: lookupswitch default -> 14452, -225563007 -> 5948, -85952849 -> 5992
    //   5992: aload_0
    //   5993: getstatic Perryc.0 : I
    //   5996: ifle -> 6010
    //   5999: ldc2_w 925425105
    //   6002: l2i
    //   6003: ldc_w 644531707
    //   6006: ixor
    //   6007: goto -> 6018
    //   6010: ldc2_w 173824090
    //   6013: l2i
    //   6014: ldc_w -1690695641
    //   6017: ixor
    //   6018: ldc2_w -1858896651
    //   6021: l2i
    //   6022: ldc_w -2010973412
    //   6025: ixor
    //   6026: ixor
    //   6027: lookupswitch default -> 6052, 139698115 -> 14624, 1508720643 -> 6010
    //   6052: aload_0
    //   6053: new bigname/zprestige/webhack/features/setting/Setting
    //   6056: dup
    //   6057: ldc_w 'ꋟ㌁ꊟ㶲ၱ'
    //   6060: getstatic Perryc.1 : I
    //   6063: ifeq -> 6077
    //   6066: ldc2_w 1223366702
    //   6069: l2i
    //   6070: ldc_w -2136874457
    //   6073: ixor
    //   6074: goto -> 6085
    //   6077: ldc2_w -1894026124
    //   6080: l2i
    //   6081: ldc_w -292044380
    //   6084: ixor
    //   6085: ldc2_w -462784054
    //   6088: l2i
    //   6089: ldc_w -600377882
    //   6092: ixor
    //   6093: ixor
    //   6094: lookupswitch default -> 6120, -266963419 -> 14760, 1680393569 -> 6077
    //   6120: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6123: ldc2_w -1631995726
    //   6126: l2i
    //   6127: ldc_w -1631995827
    //   6130: ixor
    //   6131: getstatic Perryc.1 : I
    //   6134: ifeq -> 6148
    //   6137: ldc2_w 765276771
    //   6140: l2i
    //   6141: ldc_w 95868652
    //   6144: ixor
    //   6145: goto -> 6156
    //   6148: ldc2_w 1635300041
    //   6151: l2i
    //   6152: ldc_w 1687400607
    //   6155: ixor
    //   6156: ldc2_w 297987863
    //   6159: l2i
    //   6160: ldc_w -1438690572
    //   6163: ixor
    //   6164: ixor
    //   6165: lookupswitch default -> 6192, -1814668948 -> 14700, -786240547 -> 6148
    //   6192: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6195: ldc2_w 779406443
    //   6198: l2i
    //   6199: ldc_w 779406443
    //   6202: ixor
    //   6203: getstatic Perryc.c : I
    //   6206: iflt -> 6220
    //   6209: ldc2_w 132691116
    //   6212: l2i
    //   6213: ldc_w 2029561387
    //   6216: ixor
    //   6217: goto -> 6228
    //   6220: ldc2_w -739786143
    //   6223: l2i
    //   6224: ldc_w 1827825026
    //   6227: ixor
    //   6228: ldc2_w -48778434
    //   6231: l2i
    //   6232: ldc_w 588083739
    //   6235: ixor
    //   6236: ixor
    //   6237: lookupswitch default -> 6264, -1593125982 -> 14650, -855313894 -> 6220
    //   6264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6267: ldc2_w -821309662
    //   6270: l2i
    //   6271: ldc_w -821309475
    //   6274: ixor
    //   6275: getstatic Perryc.c : I
    //   6278: iflt -> 6292
    //   6281: ldc2_w -1212083080
    //   6284: l2i
    //   6285: ldc_w -1161633083
    //   6288: ixor
    //   6289: goto -> 6300
    //   6292: ldc2_w 1895990995
    //   6295: l2i
    //   6296: ldc_w 300274239
    //   6299: ixor
    //   6300: ldc2_w 1418428589
    //   6303: l2i
    //   6304: ldc_w -1339072526
    //   6307: ixor
    //   6308: ixor
    //   6309: lookupswitch default -> 6336, -374920734 -> 14530, 1946743746 -> 6292
    //   6336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6339: getstatic Perryc.c : I
    //   6342: iflt -> 6356
    //   6345: ldc2_w 278118595
    //   6348: l2i
    //   6349: ldc_w 1173939824
    //   6352: ixor
    //   6353: goto -> 6364
    //   6356: ldc2_w -1062654558
    //   6359: l2i
    //   6360: ldc_w 1786016055
    //   6363: ixor
    //   6364: ldc2_w 1319700324
    //   6367: l2i
    //   6368: ldc_w -701222276
    //   6371: ixor
    //   6372: ixor
    //   6373: lookupswitch default -> 6400, -839511125 -> 14686, 213190697 -> 6356
    //   6400: aload_0
    //   6401: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   6406: getstatic Perryc.1 : I
    //   6409: ifeq -> 6423
    //   6412: ldc2_w 1761238812
    //   6415: l2i
    //   6416: ldc_w -1809186289
    //   6419: ixor
    //   6420: goto -> 6431
    //   6423: ldc2_w -768715821
    //   6426: l2i
    //   6427: ldc_w 399421244
    //   6430: ixor
    //   6431: ldc2_w 799447732
    //   6434: l2i
    //   6435: ldc_w -490763410
    //   6438: ixor
    //   6439: ixor
    //   6440: lookupswitch default -> 6468, -890218817 -> 6423, 835275977 -> 14440
    //   6468: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6471: getstatic Perryc.1 : I
    //   6474: ifeq -> 6488
    //   6477: ldc2_w -960602430
    //   6480: l2i
    //   6481: ldc_w 198937155
    //   6484: ixor
    //   6485: goto -> 6496
    //   6488: ldc2_w -1294299081
    //   6491: l2i
    //   6492: ldc_w 454184484
    //   6495: ixor
    //   6496: ldc2_w 2067111091
    //   6499: l2i
    //   6500: ldc_w 1016418775
    //   6503: ixor
    //   6504: ixor
    //   6505: lookupswitch default -> 6532, -1966794267 -> 14436, 1451362400 -> 6488
    //   6532: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6535: getstatic Perryc.1 : I
    //   6538: ifeq -> 6552
    //   6541: ldc2_w -525334409
    //   6544: l2i
    //   6545: ldc_w 174536357
    //   6548: ixor
    //   6549: goto -> 6560
    //   6552: ldc2_w -614417021
    //   6555: l2i
    //   6556: ldc_w -1164767204
    //   6559: ixor
    //   6560: ldc2_w -1429160370
    //   6563: l2i
    //   6564: ldc_w 877607600
    //   6567: ixor
    //   6568: ixor
    //   6569: lookupswitch default -> 6596, 1835977234 -> 6552, 1950923308 -> 14592
    //   6596: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6599: getstatic Perryc.0 : I
    //   6602: ifle -> 6616
    //   6605: ldc2_w 1456358814
    //   6608: l2i
    //   6609: ldc_w -1582738299
    //   6612: ixor
    //   6613: goto -> 6624
    //   6616: ldc2_w -554533935
    //   6619: l2i
    //   6620: ldc_w -11930506
    //   6623: ixor
    //   6624: ldc2_w -1413317278
    //   6627: l2i
    //   6628: ldc_w -1437176369
    //   6631: ixor
    //   6632: ixor
    //   6633: lookupswitch default -> 6660, -151846474 -> 14770, 780847922 -> 6616
    //   6660: aload_0
    //   6661: getstatic Perryc.c : I
    //   6664: iflt -> 6678
    //   6667: ldc2_w 1277825692
    //   6670: l2i
    //   6671: ldc_w 434253415
    //   6674: ixor
    //   6675: goto -> 6686
    //   6678: ldc2_w 958010136
    //   6681: l2i
    //   6682: ldc_w 1569748356
    //   6685: ixor
    //   6686: ldc2_w -2086709921
    //   6689: l2i
    //   6690: ldc_w 655730025
    //   6693: ixor
    //   6694: ixor
    //   6695: lookupswitch default -> 14420, -1073703254 -> 6720, -247280435 -> 6678
    //   6720: aload_0
    //   6721: new bigname/zprestige/webhack/features/setting/Setting
    //   6724: dup
    //   6725: ldc_w 'ꋚ㌟ꊏ㶲'
    //   6728: getstatic Perryc.1 : I
    //   6731: ifeq -> 6745
    //   6734: ldc2_w 1161558825
    //   6737: l2i
    //   6738: ldc_w -1113801782
    //   6741: ixor
    //   6742: goto -> 6753
    //   6745: ldc2_w -1364970519
    //   6748: l2i
    //   6749: ldc_w -24173752
    //   6752: ixor
    //   6753: ldc2_w -1981761558
    //   6756: l2i
    //   6757: ldc_w 975671744
    //   6760: ixor
    //   6761: ixor
    //   6762: lookupswitch default -> 6788, 1264608969 -> 14384, 2065472898 -> 6745
    //   6788: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6791: ldc2_w 1311943444
    //   6794: l2i
    //   6795: ldc_w 1311943444
    //   6798: ixor
    //   6799: getstatic Perryc.1 : I
    //   6802: ifeq -> 6816
    //   6805: ldc2_w -501022878
    //   6808: l2i
    //   6809: ldc_w 543487701
    //   6812: ixor
    //   6813: goto -> 6824
    //   6816: ldc2_w -583251516
    //   6819: l2i
    //   6820: ldc_w 954526738
    //   6823: ixor
    //   6824: ldc2_w -822617505
    //   6827: l2i
    //   6828: ldc_w 327156781
    //   6831: ixor
    //   6832: ixor
    //   6833: lookupswitch default -> 6860, 523360197 -> 14524, 1566084456 -> 6816
    //   6860: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6863: ldc2_w 2081465785
    //   6866: l2i
    //   6867: ldc_w 2081465785
    //   6870: ixor
    //   6871: getstatic Perryc.c : I
    //   6874: iflt -> 6888
    //   6877: ldc2_w -27255364
    //   6880: l2i
    //   6881: ldc_w 2009930938
    //   6884: ixor
    //   6885: goto -> 6896
    //   6888: ldc2_w 1329950765
    //   6891: l2i
    //   6892: ldc_w 1989079365
    //   6895: ixor
    //   6896: ldc2_w 512279034
    //   6899: l2i
    //   6900: ldc_w -1390177601
    //   6903: ixor
    //   6904: ixor
    //   6905: lookupswitch default -> 6932, 935406134 -> 6888, 973492803 -> 14714
    //   6932: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6935: ldc2_w -367831729
    //   6938: l2i
    //   6939: ldc_w -367831632
    //   6942: ixor
    //   6943: getstatic Perryc.1 : I
    //   6946: ifeq -> 6960
    //   6949: ldc2_w -851379350
    //   6952: l2i
    //   6953: ldc_w -660265529
    //   6956: ixor
    //   6957: goto -> 6968
    //   6960: ldc2_w -984103226
    //   6963: l2i
    //   6964: ldc_w 1360555973
    //   6967: ixor
    //   6968: ldc2_w -1471969189
    //   6971: l2i
    //   6972: ldc_w 1696389861
    //   6975: ixor
    //   6976: ixor
    //   6977: lookupswitch default -> 7004, -658863085 -> 14386, 1225400200 -> 6960
    //   7004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7007: getstatic Perryc.0 : I
    //   7010: ifle -> 7024
    //   7013: ldc2_w -1431549155
    //   7016: l2i
    //   7017: ldc_w -1078242225
    //   7020: ixor
    //   7021: goto -> 7032
    //   7024: ldc2_w -114539510
    //   7027: l2i
    //   7028: ldc_w -742047393
    //   7031: ixor
    //   7032: ldc2_w -1565673344
    //   7035: l2i
    //   7036: ldc_w 813218155
    //   7039: ixor
    //   7040: ixor
    //   7041: lookupswitch default -> 7068, -2017321287 -> 14374, -528324669 -> 7024
    //   7068: aload_0
    //   7069: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   7074: getstatic Perryc.0 : I
    //   7077: ifle -> 7091
    //   7080: ldc2_w 1061721578
    //   7083: l2i
    //   7084: ldc_w 1021718371
    //   7087: ixor
    //   7088: goto -> 7099
    //   7091: ldc2_w -1186920872
    //   7094: l2i
    //   7095: ldc_w -2142519904
    //   7098: ixor
    //   7099: ldc2_w -797346231
    //   7102: l2i
    //   7103: ldc_w -789434974
    //   7106: ixor
    //   7107: ixor
    //   7108: lookupswitch default -> 7136, 52814178 -> 14558, 983961909 -> 7091
    //   7136: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7139: getstatic Perryc.0 : I
    //   7142: ifle -> 7156
    //   7145: ldc2_w 1236302175
    //   7148: l2i
    //   7149: ldc_w 58279752
    //   7152: ixor
    //   7153: goto -> 7164
    //   7156: ldc2_w -187729936
    //   7159: l2i
    //   7160: ldc_w -6508594
    //   7163: ixor
    //   7164: ldc2_w 1447099072
    //   7167: l2i
    //   7168: ldc_w -338344023
    //   7171: ixor
    //   7172: ixor
    //   7173: lookupswitch default -> 7200, -144931970 -> 14416, 1215291870 -> 7156
    //   7200: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7203: getstatic Perryc.1 : I
    //   7206: ifeq -> 7220
    //   7209: ldc2_w -284318952
    //   7212: l2i
    //   7213: ldc_w 1459345788
    //   7216: ixor
    //   7217: goto -> 7228
    //   7220: ldc2_w 788534297
    //   7223: l2i
    //   7224: ldc_w -2005608306
    //   7227: ixor
    //   7228: ldc2_w 1508918452
    //   7231: l2i
    //   7232: ldc_w 1465080986
    //   7235: ixor
    //   7236: ixor
    //   7237: lookupswitch default -> 7264, -1219141046 -> 14804, 444227511 -> 7220
    //   7264: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7267: getstatic Perryc.1 : I
    //   7270: ifeq -> 7284
    //   7273: ldc2_w 1087936626
    //   7276: l2i
    //   7277: ldc_w 1788495195
    //   7280: ixor
    //   7281: goto -> 7292
    //   7284: ldc2_w 2087502429
    //   7287: l2i
    //   7288: ldc_w -2037772759
    //   7291: ixor
    //   7292: ldc2_w -1702857338
    //   7295: l2i
    //   7296: ldc_w -1542898296
    //   7299: ixor
    //   7300: ixor
    //   7301: lookupswitch default -> 7328, 149565371 -> 7284, 348886311 -> 14404
    //   7328: aload_0
    //   7329: getstatic Perryc.c : I
    //   7332: iflt -> 7346
    //   7335: ldc2_w 458754799
    //   7338: l2i
    //   7339: ldc_w 1990218953
    //   7342: ixor
    //   7343: goto -> 7354
    //   7346: ldc2_w 778324728
    //   7349: l2i
    //   7350: ldc_w -1129814290
    //   7353: ixor
    //   7354: ldc2_w -1902200787
    //   7357: l2i
    //   7358: ldc_w 691984919
    //   7361: ixor
    //   7362: ixor
    //   7363: lookupswitch default -> 7388, -965935865 -> 7346, -900187108 -> 14500
    //   7388: aload_0
    //   7389: new bigname/zprestige/webhack/features/setting/Setting
    //   7392: dup
    //   7393: ldc_w 'ꋊ㌒ꊓ㶹ၽ䱋๮'
    //   7396: getstatic Perryc.c : I
    //   7399: iflt -> 7413
    //   7402: ldc2_w -17672436
    //   7405: l2i
    //   7406: ldc_w -1572143197
    //   7409: ixor
    //   7410: goto -> 7421
    //   7413: ldc2_w 1488901457
    //   7416: l2i
    //   7417: ldc_w 2041171403
    //   7420: ixor
    //   7421: ldc2_w 137113813
    //   7424: l2i
    //   7425: ldc_w 167138263
    //   7428: ixor
    //   7429: ixor
    //   7430: lookupswitch default -> 14712, 550337432 -> 7456, 1566755757 -> 7413
    //   7456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7459: ldc2_w 137593230
    //   7462: l2i
    //   7463: ldc_w 137593230
    //   7466: ixor
    //   7467: getstatic Perryc.0 : I
    //   7470: ifle -> 7484
    //   7473: ldc2_w 1023850448
    //   7476: l2i
    //   7477: ldc_w -990847501
    //   7480: ixor
    //   7481: goto -> 7492
    //   7484: ldc2_w 491154621
    //   7487: l2i
    //   7488: ldc_w -1564544701
    //   7491: ixor
    //   7492: ldc2_w 2007073930
    //   7495: l2i
    //   7496: ldc_w -1373229039
    //   7499: ixor
    //   7500: ixor
    //   7501: lookupswitch default -> 14654, 544333496 -> 7484, 1719609701 -> 7528
    //   7528: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7531: getstatic Perryc.c : I
    //   7534: iflt -> 7548
    //   7537: ldc2_w -359414626
    //   7540: l2i
    //   7541: ldc_w 140955558
    //   7544: ixor
    //   7545: goto -> 7556
    //   7548: ldc2_w -534334859
    //   7551: l2i
    //   7552: ldc_w 2099640078
    //   7555: ixor
    //   7556: ldc2_w 1071005483
    //   7559: l2i
    //   7560: ldc_w 399965503
    //   7563: ixor
    //   7564: ixor
    //   7565: lookupswitch default -> 14620, -1258059921 -> 7592, -889861844 -> 7548
    //   7592: aload_0
    //   7593: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   7598: getstatic Perryc.1 : I
    //   7601: ifeq -> 7615
    //   7604: ldc2_w -1460802927
    //   7607: l2i
    //   7608: ldc_w -2122399780
    //   7611: ixor
    //   7612: goto -> 7623
    //   7615: ldc2_w 1531752834
    //   7618: l2i
    //   7619: ldc_w -1397548912
    //   7622: ixor
    //   7623: ldc2_w -1216420070
    //   7626: l2i
    //   7627: ldc_w -1948024705
    //   7630: ixor
    //   7631: ixor
    //   7632: lookupswitch default -> 7660, 353251880 -> 14496, 740360267 -> 7615
    //   7660: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7663: getstatic Perryc.c : I
    //   7666: iflt -> 7680
    //   7669: ldc2_w -1909580691
    //   7672: l2i
    //   7673: ldc_w -343451468
    //   7676: ixor
    //   7677: goto -> 7688
    //   7680: ldc2_w -492483758
    //   7683: l2i
    //   7684: ldc_w 898555701
    //   7687: ixor
    //   7688: ldc2_w -1339830435
    //   7691: l2i
    //   7692: ldc_w -1453718118
    //   7695: ixor
    //   7696: ixor
    //   7697: lookupswitch default -> 14422, -833462624 -> 7724, 2094042654 -> 7680
    //   7724: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7727: getstatic Perryc.c : I
    //   7730: iflt -> 7744
    //   7733: ldc2_w 1289548303
    //   7736: l2i
    //   7737: ldc_w 746267288
    //   7740: ixor
    //   7741: goto -> 7752
    //   7744: ldc2_w 1485575237
    //   7747: l2i
    //   7748: ldc_w -1245314605
    //   7751: ixor
    //   7752: ldc2_w -1449859596
    //   7755: l2i
    //   7756: ldc_w -1912566046
    //   7759: ixor
    //   7760: ixor
    //   7761: lookupswitch default -> 14508, -891388288 -> 7788, 1194572673 -> 7744
    //   7788: putfield Rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7791: getstatic Perryc.c : I
    //   7794: iflt -> 7808
    //   7797: ldc2_w 734441476
    //   7800: l2i
    //   7801: ldc_w 1220202129
    //   7804: ixor
    //   7805: goto -> 7816
    //   7808: ldc2_w -1093779088
    //   7811: l2i
    //   7812: ldc_w -1620502361
    //   7815: ixor
    //   7816: ldc2_w 457810641
    //   7819: l2i
    //   7820: ldc_w 682289402
    //   7823: ixor
    //   7824: ixor
    //   7825: lookupswitch default -> 14742, 306451452 -> 7852, 1352611006 -> 7808
    //   7852: aload_0
    //   7853: getstatic Perryc.c : I
    //   7856: iflt -> 7870
    //   7859: ldc2_w 751339970
    //   7862: l2i
    //   7863: ldc_w 1439763998
    //   7866: ixor
    //   7867: goto -> 7878
    //   7870: ldc2_w -1808796634
    //   7873: l2i
    //   7874: ldc_w -1714053494
    //   7877: ixor
    //   7878: ldc2_w -987578844
    //   7881: l2i
    //   7882: ldc_w -730915387
    //   7885: ixor
    //   7886: ixor
    //   7887: lookupswitch default -> 14738, 481806669 -> 7912, 1750344765 -> 7870
    //   7912: aload_0
    //   7913: new bigname/zprestige/webhack/features/setting/Setting
    //   7916: dup
    //   7917: ldc_w 'ꋙ㌟ꊊ㶿ၾ'
    //   7920: getstatic Perryc.1 : I
    //   7923: ifeq -> 7937
    //   7926: ldc2_w -1421578976
    //   7929: l2i
    //   7930: ldc_w 1325201710
    //   7933: ixor
    //   7934: goto -> 7945
    //   7937: ldc2_w 1631372699
    //   7940: l2i
    //   7941: ldc_w -1022057272
    //   7944: ixor
    //   7945: ldc2_w 1165998759
    //   7948: l2i
    //   7949: ldc_w -1352222636
    //   7952: ixor
    //   7953: ixor
    //   7954: lookupswitch default -> 7980, -624395164 -> 7937, 262248189 -> 14796
    //   7980: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7983: ldc2_w -1603059592
    //   7986: l2i
    //   7987: ldc_w -1603059577
    //   7990: ixor
    //   7991: getstatic Perryc.c : I
    //   7994: iflt -> 8008
    //   7997: ldc2_w -377589116
    //   8000: l2i
    //   8001: ldc_w 603097963
    //   8004: ixor
    //   8005: goto -> 8016
    //   8008: ldc2_w 1822558518
    //   8011: l2i
    //   8012: ldc_w -416115348
    //   8015: ixor
    //   8016: ldc2_w -594570058
    //   8019: l2i
    //   8020: ldc_w 1668505463
    //   8023: ixor
    //   8024: ixor
    //   8025: lookupswitch default -> 14764, 879515547 -> 8052, 1970287150 -> 8008
    //   8052: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8055: ldc2_w 465864884
    //   8058: l2i
    //   8059: ldc_w 465864884
    //   8062: ixor
    //   8063: getstatic Perryc.1 : I
    //   8066: ifeq -> 8080
    //   8069: ldc2_w -1202013821
    //   8072: l2i
    //   8073: ldc_w 708836883
    //   8076: ixor
    //   8077: goto -> 8088
    //   8080: ldc2_w -1064542134
    //   8083: l2i
    //   8084: ldc_w 482073664
    //   8087: ixor
    //   8088: ldc2_w -1685195220
    //   8091: l2i
    //   8092: ldc_w -1012569815
    //   8095: ixor
    //   8096: ixor
    //   8097: lookupswitch default -> 14756, -2078334193 -> 8124, -900867947 -> 8080
    //   8124: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8127: ldc2_w -19617764
    //   8130: l2i
    //   8131: ldc_w -19617565
    //   8134: ixor
    //   8135: getstatic Perryc.c : I
    //   8138: iflt -> 8152
    //   8141: ldc2_w 717098380
    //   8144: l2i
    //   8145: ldc_w -565238872
    //   8148: ixor
    //   8149: goto -> 8160
    //   8152: ldc2_w -1263069924
    //   8155: l2i
    //   8156: ldc_w 2115894469
    //   8159: ixor
    //   8160: ldc2_w 536452336
    //   8163: l2i
    //   8164: ldc_w 1616870517
    //   8167: ixor
    //   8168: ixor
    //   8169: lookupswitch default -> 14560, -1957179743 -> 8152, -1257502372 -> 8196
    //   8196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8199: getstatic Perryc.1 : I
    //   8202: ifeq -> 8216
    //   8205: ldc2_w -1618396836
    //   8208: l2i
    //   8209: ldc_w 710798222
    //   8212: ixor
    //   8213: goto -> 8224
    //   8216: ldc2_w -198057480
    //   8219: l2i
    //   8220: ldc_w 653860031
    //   8223: ixor
    //   8224: ldc2_w -391456245
    //   8227: l2i
    //   8228: ldc_w 701834140
    //   8231: ixor
    //   8232: ixor
    //   8233: lookupswitch default -> 8260, 885924129 -> 8216, 1957374789 -> 14552
    //   8260: aload_0
    //   8261: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   8266: getstatic Perryc.c : I
    //   8269: iflt -> 8283
    //   8272: ldc2_w 1224858024
    //   8275: l2i
    //   8276: ldc_w 1290165019
    //   8279: ixor
    //   8280: goto -> 8291
    //   8283: ldc2_w 1960883638
    //   8286: l2i
    //   8287: ldc_w 1786338476
    //   8290: ixor
    //   8291: ldc2_w 701290406
    //   8294: l2i
    //   8295: ldc_w -1673490439
    //   8298: ixor
    //   8299: ixor
    //   8300: lookupswitch default -> 8328, -1722940642 -> 8283, -1335108884 -> 14426
    //   8328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8331: getstatic Perryc.c : I
    //   8334: iflt -> 8348
    //   8337: ldc2_w -1839150014
    //   8340: l2i
    //   8341: ldc_w -324258707
    //   8344: ixor
    //   8345: goto -> 8356
    //   8348: ldc2_w 793845612
    //   8351: l2i
    //   8352: ldc_w -376378487
    //   8355: ixor
    //   8356: ldc2_w -1983922078
    //   8359: l2i
    //   8360: ldc_w -1330844904
    //   8363: ixor
    //   8364: ixor
    //   8365: lookupswitch default -> 14652, -2957409 -> 8392, 1205850965 -> 8348
    //   8392: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8395: getstatic Perryc.0 : I
    //   8398: ifle -> 8412
    //   8401: ldc2_w 2046293127
    //   8404: l2i
    //   8405: ldc_w 731377802
    //   8408: ixor
    //   8409: goto -> 8420
    //   8412: ldc2_w -546897678
    //   8415: l2i
    //   8416: ldc_w -609975393
    //   8419: ixor
    //   8420: ldc2_w 1943350436
    //   8423: l2i
    //   8424: ldc_w 485060378
    //   8427: ixor
    //   8428: ixor
    //   8429: lookupswitch default -> 8456, 880054527 -> 8412, 1029457843 -> 14626
    //   8456: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8459: getstatic Perryc.1 : I
    //   8462: ifeq -> 8476
    //   8465: ldc2_w 1173305675
    //   8468: l2i
    //   8469: ldc_w 1434167778
    //   8472: ixor
    //   8473: goto -> 8484
    //   8476: ldc2_w 898733795
    //   8479: l2i
    //   8480: ldc_w -1456510048
    //   8483: ixor
    //   8484: ldc2_w -297652496
    //   8487: l2i
    //   8488: ldc_w -1901570693
    //   8491: ixor
    //   8492: ixor
    //   8493: lookupswitch default -> 8520, -89610081 -> 8476, 1887365922 -> 14646
    //   8520: aload_0
    //   8521: getstatic Perryc.1 : I
    //   8524: ifeq -> 8538
    //   8527: ldc2_w -960239763
    //   8530: l2i
    //   8531: ldc_w 1841831436
    //   8534: ixor
    //   8535: goto -> 8546
    //   8538: ldc2_w -691622301
    //   8541: l2i
    //   8542: ldc_w 329354421
    //   8545: ixor
    //   8546: ldc2_w 840817453
    //   8549: l2i
    //   8550: ldc_w 312262754
    //   8553: ixor
    //   8554: ixor
    //   8555: lookupswitch default -> 8580, -1953832402 -> 14464, 1238236972 -> 8538
    //   8580: aload_0
    //   8581: new bigname/zprestige/webhack/features/setting/Setting
    //   8584: dup
    //   8585: ldc_w 'ꋚ㌜ꊂ㶖ၳ䱔๱?'
    //   8588: getstatic Perryc.c : I
    //   8591: iflt -> 8605
    //   8594: ldc2_w 2056499767
    //   8597: l2i
    //   8598: ldc_w -1419171936
    //   8601: ixor
    //   8602: goto -> 8613
    //   8605: ldc2_w 727614933
    //   8608: l2i
    //   8609: ldc_w -1594724159
    //   8612: ixor
    //   8613: ldc2_w -1824059678
    //   8616: l2i
    //   8617: ldc_w -1761655937
    //   8620: ixor
    //   8621: ixor
    //   8622: lookupswitch default -> 14396, -1911244663 -> 8648, -733816822 -> 8605
    //   8648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8651: ldc2_w 931200045
    //   8654: l2i
    //   8655: ldc_w 931200080
    //   8658: ixor
    //   8659: getstatic Perryc.c : I
    //   8662: iflt -> 8676
    //   8665: ldc2_w 1939050712
    //   8668: l2i
    //   8669: ldc_w -2019045947
    //   8672: ixor
    //   8673: goto -> 8684
    //   8676: ldc2_w 1338945960
    //   8679: l2i
    //   8680: ldc_w 51861560
    //   8683: ixor
    //   8684: ldc2_w -83136344
    //   8687: l2i
    //   8688: ldc_w 1705125668
    //   8691: ixor
    //   8692: ixor
    //   8693: lookupswitch default -> 8720, -346047457 -> 8676, 1788676753 -> 14428
    //   8720: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8723: ldc2_w 1779367487
    //   8726: l2i
    //   8727: ldc_w 1779367487
    //   8730: ixor
    //   8731: getstatic Perryc.c : I
    //   8734: iflt -> 8748
    //   8737: ldc2_w -826669946
    //   8740: l2i
    //   8741: ldc_w 1170311323
    //   8744: ixor
    //   8745: goto -> 8756
    //   8748: ldc2_w 1601198686
    //   8751: l2i
    //   8752: ldc_w -360146256
    //   8755: ixor
    //   8756: ldc2_w 898387893
    //   8759: l2i
    //   8760: ldc_w 827919187
    //   8763: ixor
    //   8764: ixor
    //   8765: lookupswitch default -> 14598, -1884370693 -> 8748, -1322417144 -> 8792
    //   8792: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8795: ldc2_w -420839142
    //   8798: l2i
    //   8799: ldc_w -420838939
    //   8802: ixor
    //   8803: getstatic Perryc.c : I
    //   8806: iflt -> 8820
    //   8809: ldc2_w -573088785
    //   8812: l2i
    //   8813: ldc_w -661903924
    //   8816: ixor
    //   8817: goto -> 8828
    //   8820: ldc2_w 256243690
    //   8823: l2i
    //   8824: ldc_w 1385430733
    //   8827: ixor
    //   8828: ldc2_w -1535532183
    //   8831: l2i
    //   8832: ldc_w 796322336
    //   8835: ixor
    //   8836: ixor
    //   8837: lookupswitch default -> 14486, -1907083414 -> 8820, -690405266 -> 8864
    //   8864: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8867: getstatic Perryc.c : I
    //   8870: iflt -> 8884
    //   8873: ldc2_w -1825261228
    //   8876: l2i
    //   8877: ldc_w -2661636
    //   8880: ixor
    //   8881: goto -> 8892
    //   8884: ldc2_w 548079792
    //   8887: l2i
    //   8888: ldc_w 478618405
    //   8891: ixor
    //   8892: ldc2_w 1436371608
    //   8895: l2i
    //   8896: ldc_w -1507392591
    //   8899: ixor
    //   8900: ixor
    //   8901: lookupswitch default -> 8928, -1621519743 -> 14690, -750299240 -> 8884
    //   8928: aload_0
    //   8929: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   8934: getstatic Perryc.0 : I
    //   8937: ifle -> 8951
    //   8940: ldc2_w -1202709952
    //   8943: l2i
    //   8944: ldc_w -1502448172
    //   8947: ixor
    //   8948: goto -> 8959
    //   8951: ldc2_w -1722437254
    //   8954: l2i
    //   8955: ldc_w -1188386462
    //   8958: ixor
    //   8959: ldc2_w -1818160142
    //   8962: l2i
    //   8963: ldc_w -1016202840
    //   8966: ixor
    //   8967: ixor
    //   8968: lookupswitch default -> 8996, 1069563250 -> 8951, 1324254670 -> 14580
    //   8996: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8999: getstatic Perryc.c : I
    //   9002: iflt -> 9016
    //   9005: ldc2_w 1439271817
    //   9008: l2i
    //   9009: ldc_w 507156927
    //   9012: ixor
    //   9013: goto -> 9024
    //   9016: ldc2_w 1232166790
    //   9019: l2i
    //   9020: ldc_w 1725452327
    //   9023: ixor
    //   9024: ldc2_w -290495366
    //   9027: l2i
    //   9028: ldc_w 1631699349
    //   9031: ixor
    //   9032: ixor
    //   9033: lookupswitch default -> 14644, -1605916082 -> 9060, -1004685351 -> 9016
    //   9060: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9063: getstatic Perryc.c : I
    //   9066: iflt -> 9080
    //   9069: ldc2_w -1945592173
    //   9072: l2i
    //   9073: ldc_w 910781136
    //   9076: ixor
    //   9077: goto -> 9088
    //   9080: ldc2_w -1073225550
    //   9083: l2i
    //   9084: ldc_w 370267875
    //   9087: ixor
    //   9088: ldc2_w 1173916984
    //   9091: l2i
    //   9092: ldc_w -835405722
    //   9095: ixor
    //   9096: ixor
    //   9097: lookupswitch default -> 14490, 831373597 -> 9080, 1574568719 -> 9124
    //   9124: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9127: getstatic Perryc.0 : I
    //   9130: ifle -> 9144
    //   9133: ldc2_w -2071258840
    //   9136: l2i
    //   9137: ldc_w -721062029
    //   9140: ixor
    //   9141: goto -> 9152
    //   9144: ldc2_w -2101479941
    //   9147: l2i
    //   9148: ldc_w -556051555
    //   9151: ixor
    //   9152: ldc2_w 1726893724
    //   9155: l2i
    //   9156: ldc_w 1239871531
    //   9159: ixor
    //   9160: ixor
    //   9161: lookupswitch default -> 14780, 1936595153 -> 9188, 2122764524 -> 9144
    //   9188: aload_0
    //   9189: getstatic Perryc.c : I
    //   9192: iflt -> 9206
    //   9195: ldc2_w -777208425
    //   9198: l2i
    //   9199: ldc_w -1082459104
    //   9202: ixor
    //   9203: goto -> 9214
    //   9206: ldc2_w -1800641428
    //   9209: l2i
    //   9210: ldc_w -686560389
    //   9213: ixor
    //   9214: ldc2_w -714054505
    //   9217: l2i
    //   9218: ldc_w 1279513083
    //   9221: ixor
    //   9222: ixor
    //   9223: lookupswitch default -> 9248, -586725645 -> 9206, -135924517 -> 14414
    //   9248: aload_0
    //   9249: new bigname/zprestige/webhack/features/setting/Setting
    //   9252: dup
    //   9253: ldc_w 'ꋗ㌆ꊎ㶻ၶ䱊๼'
    //   9256: getstatic Perryc.0 : I
    //   9259: ifle -> 9273
    //   9262: ldc2_w -1733391935
    //   9265: l2i
    //   9266: ldc_w -314943671
    //   9269: ixor
    //   9270: goto -> 9281
    //   9273: ldc2_w 1929726090
    //   9276: l2i
    //   9277: ldc_w -862618137
    //   9280: ixor
    //   9281: ldc2_w 197288830
    //   9284: l2i
    //   9285: ldc_w -318513054
    //   9288: ixor
    //   9289: ixor
    //   9290: lookupswitch default -> 9316, -1823122028 -> 14474, 341163379 -> 9273
    //   9316: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9319: ldc2_w -247449777
    //   9322: l2i
    //   9323: ldc_w -247449777
    //   9326: ixor
    //   9327: getstatic Perryc.c : I
    //   9330: iflt -> 9344
    //   9333: ldc2_w -1083369194
    //   9336: l2i
    //   9337: ldc_w -579818794
    //   9340: ixor
    //   9341: goto -> 9352
    //   9344: ldc2_w -1157311925
    //   9347: l2i
    //   9348: ldc_w 1894629888
    //   9351: ixor
    //   9352: ldc2_w -1256844433
    //   9355: l2i
    //   9356: ldc_w -854072602
    //   9359: ixor
    //   9360: ixor
    //   9361: lookupswitch default -> 9388, 438059593 -> 14640, 1290426749 -> 9344
    //   9388: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9391: getstatic Perryc.1 : I
    //   9394: ifeq -> 9408
    //   9397: ldc2_w -1254595999
    //   9400: l2i
    //   9401: ldc_w -1749606473
    //   9404: ixor
    //   9405: goto -> 9416
    //   9408: ldc2_w 1175105840
    //   9411: l2i
    //   9412: ldc_w 1360978787
    //   9415: ixor
    //   9416: ldc2_w 898138444
    //   9419: l2i
    //   9420: ldc_w -918871968
    //   9423: ixor
    //   9424: ixor
    //   9425: lookupswitch default -> 14432, -566436614 -> 9408, -341314689 -> 9452
    //   9452: aload_0
    //   9453: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   9458: getstatic Perryc.c : I
    //   9461: iflt -> 9475
    //   9464: ldc2_w 155523277
    //   9467: l2i
    //   9468: ldc_w 410052607
    //   9471: ixor
    //   9472: goto -> 9483
    //   9475: ldc2_w 728860661
    //   9478: l2i
    //   9479: ldc_w -1809249186
    //   9482: ixor
    //   9483: ldc2_w 1525033657
    //   9486: l2i
    //   9487: ldc_w 457434620
    //   9490: ixor
    //   9491: ixor
    //   9492: lookupswitch default -> 14610, -16956178 -> 9520, 1351626871 -> 9475
    //   9520: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9523: getstatic Perryc.1 : I
    //   9526: ifeq -> 9540
    //   9529: ldc2_w 253605189
    //   9532: l2i
    //   9533: ldc_w -2058492061
    //   9536: ixor
    //   9537: goto -> 9548
    //   9540: ldc2_w 1758138095
    //   9543: l2i
    //   9544: ldc_w 1599223061
    //   9547: ixor
    //   9548: ldc2_w -1269444433
    //   9551: l2i
    //   9552: ldc_w -1714343417
    //   9555: ixor
    //   9556: ixor
    //   9557: lookupswitch default -> 9584, -1479233394 -> 14504, 1859901584 -> 9540
    //   9584: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9587: getstatic Perryc.1 : I
    //   9590: ifeq -> 9604
    //   9593: ldc2_w 1767341727
    //   9596: l2i
    //   9597: ldc_w -2103165041
    //   9600: ixor
    //   9601: goto -> 9612
    //   9604: ldc2_w -667778651
    //   9607: l2i
    //   9608: ldc_w -805671635
    //   9611: ixor
    //   9612: ldc2_w 1982974788
    //   9615: l2i
    //   9616: ldc_w -1115518631
    //   9619: ixor
    //   9620: ixor
    //   9621: lookupswitch default -> 9648, 541065997 -> 14642, 823722700 -> 9604
    //   9648: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9651: getstatic Perryc.0 : I
    //   9654: ifle -> 9668
    //   9657: ldc2_w -1396036247
    //   9660: l2i
    //   9661: ldc_w 1171900681
    //   9664: ixor
    //   9665: goto -> 9676
    //   9668: ldc2_w -529778433
    //   9671: l2i
    //   9672: ldc_w 1326974416
    //   9675: ixor
    //   9676: ldc2_w -1425730334
    //   9679: l2i
    //   9680: ldc_w -1982088630
    //   9683: ixor
    //   9684: ixor
    //   9685: lookupswitch default -> 14494, -1918200953 -> 9712, -875738424 -> 9668
    //   9712: aload_0
    //   9713: getstatic Perryc.0 : I
    //   9716: ifle -> 9730
    //   9719: ldc2_w 897914086
    //   9722: l2i
    //   9723: ldc_w -606323679
    //   9726: ixor
    //   9727: goto -> 9738
    //   9730: ldc2_w -906637933
    //   9733: l2i
    //   9734: ldc_w 979665492
    //   9737: ixor
    //   9738: ldc2_w 2126651665
    //   9741: l2i
    //   9742: ldc_w 802311440
    //   9745: ixor
    //   9746: ixor
    //   9747: lookupswitch default -> 14772, -1568595002 -> 9772, -1085717306 -> 9730
    //   9772: aload_0
    //   9773: new bigname/zprestige/webhack/features/setting/Setting
    //   9776: dup
    //   9777: ldc_w 'ꋗ㌿ꋗ㶅ၺ䱀'
    //   9780: getstatic Perryc.c : I
    //   9783: iflt -> 9797
    //   9786: ldc2_w -605048869
    //   9789: l2i
    //   9790: ldc_w -2094206538
    //   9793: ixor
    //   9794: goto -> 9805
    //   9797: ldc2_w -1766379308
    //   9800: l2i
    //   9801: ldc_w 1496553161
    //   9804: ixor
    //   9805: ldc2_w 11331109
    //   9808: l2i
    //   9809: ldc_w -1305214231
    //   9812: ixor
    //   9813: ixor
    //   9814: lookupswitch default -> 14460, -363087199 -> 9797, 2099004113 -> 9840
    //   9840: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9843: ldc2_w -172003033
    //   9846: l2i
    //   9847: ldc_w -172003033
    //   9850: ixor
    //   9851: getstatic Perryc.1 : I
    //   9854: ifeq -> 9868
    //   9857: ldc2_w 45846167
    //   9860: l2i
    //   9861: ldc_w -833941446
    //   9864: ixor
    //   9865: goto -> 9876
    //   9868: ldc2_w 226665652
    //   9871: l2i
    //   9872: ldc_w 1139101111
    //   9875: ixor
    //   9876: ldc2_w -286239517
    //   9879: l2i
    //   9880: ldc_w 284921902
    //   9883: ixor
    //   9884: ixor
    //   9885: lookupswitch default -> 14740, -1335087666 -> 9912, 855333472 -> 9868
    //   9912: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9915: ldc2_w -1473122121
    //   9918: l2i
    //   9919: ldc_w -1473122121
    //   9922: ixor
    //   9923: getstatic Perryc.c : I
    //   9926: iflt -> 9940
    //   9929: ldc2_w 708233912
    //   9932: l2i
    //   9933: ldc_w 883579071
    //   9936: ixor
    //   9937: goto -> 9948
    //   9940: ldc2_w -1437392150
    //   9943: l2i
    //   9944: ldc_w 1082830113
    //   9947: ixor
    //   9948: ldc2_w 2022842234
    //   9951: l2i
    //   9952: ldc_w 723293854
    //   9955: ixor
    //   9956: ixor
    //   9957: lookupswitch default -> 14582, -1185479121 -> 9984, 1293032419 -> 9940
    //   9984: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9987: ldc2_w -664373669
    //   9990: l2i
    //   9991: ldc_w -664373596
    //   9994: ixor
    //   9995: getstatic Perryc.c : I
    //   9998: iflt -> 10012
    //   10001: ldc2_w 748806260
    //   10004: l2i
    //   10005: ldc_w -1662697147
    //   10008: ixor
    //   10009: goto -> 10020
    //   10012: ldc2_w -1893157470
    //   10015: l2i
    //   10016: ldc_w -1940749031
    //   10019: ixor
    //   10020: ldc2_w 1601150061
    //   10023: l2i
    //   10024: ldc_w 608883609
    //   10027: ixor
    //   10028: ixor
    //   10029: lookupswitch default -> 10056, -882774331 -> 14476, 427575409 -> 10012
    //   10056: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10059: getstatic Perryc.0 : I
    //   10062: ifle -> 10076
    //   10065: ldc2_w -108164733
    //   10068: l2i
    //   10069: ldc_w 2004646585
    //   10072: ixor
    //   10073: goto -> 10084
    //   10076: ldc2_w -875113578
    //   10079: l2i
    //   10080: ldc_w -872754489
    //   10083: ixor
    //   10084: ldc2_w -587733173
    //   10087: l2i
    //   10088: ldc_w -547082904
    //   10091: ixor
    //   10092: ixor
    //   10093: lookupswitch default -> 10120, -1922942695 -> 14380, -1063186384 -> 10076
    //   10120: aload_0
    //   10121: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   10126: getstatic Perryc.0 : I
    //   10129: ifle -> 10143
    //   10132: ldc2_w -1609709601
    //   10135: l2i
    //   10136: ldc_w -1226924280
    //   10139: ixor
    //   10140: goto -> 10151
    //   10143: ldc2_w -917186929
    //   10146: l2i
    //   10147: ldc_w -1282089713
    //   10150: ixor
    //   10151: ldc2_w 1365286837
    //   10154: l2i
    //   10155: ldc_w -1614119191
    //   10158: ixor
    //   10159: ixor
    //   10160: lookupswitch default -> 10188, -663111285 -> 14746, 271601342 -> 10143
    //   10188: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10191: getstatic Perryc.0 : I
    //   10194: ifle -> 10208
    //   10197: ldc2_w -1043019786
    //   10200: l2i
    //   10201: ldc_w 1819650523
    //   10204: ixor
    //   10205: goto -> 10216
    //   10208: ldc2_w -478660995
    //   10211: l2i
    //   10212: ldc_w 1833634399
    //   10215: ixor
    //   10216: ldc2_w -1167716986
    //   10219: l2i
    //   10220: ldc_w 239205204
    //   10223: ixor
    //   10224: ixor
    //   10225: lookupswitch default -> 10252, -463321008 -> 10208, 428251391 -> 14602
    //   10252: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10255: getstatic Perryc.c : I
    //   10258: iflt -> 10272
    //   10261: ldc2_w -2100115639
    //   10264: l2i
    //   10265: ldc_w -629767885
    //   10268: ixor
    //   10269: goto -> 10280
    //   10272: ldc2_w -1178571756
    //   10275: l2i
    //   10276: ldc_w 1539739534
    //   10279: ixor
    //   10280: ldc2_w 668757131
    //   10283: l2i
    //   10284: ldc_w -1793452559
    //   10287: ixor
    //   10288: ixor
    //   10289: lookupswitch default -> 10316, -362660096 -> 14744, 1230446920 -> 10272
    //   10316: putfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10319: getstatic Perryc.0 : I
    //   10322: ifle -> 10336
    //   10325: ldc2_w 404093233
    //   10328: l2i
    //   10329: ldc_w -418533612
    //   10332: ixor
    //   10333: goto -> 10344
    //   10336: ldc2_w -235048978
    //   10339: l2i
    //   10340: ldc_w -1909920217
    //   10343: ixor
    //   10344: ldc2_w 954193218
    //   10347: l2i
    //   10348: ldc_w 459854688
    //   10351: ixor
    //   10352: ixor
    //   10353: lookupswitch default -> 10380, -1547158982 -> 10336, -592490489 -> 14566
    //   10380: aload_0
    //   10381: getstatic Perryc.c : I
    //   10384: iflt -> 10398
    //   10387: ldc2_w 2086900152
    //   10390: l2i
    //   10391: ldc_w -1940674108
    //   10394: ixor
    //   10395: goto -> 10406
    //   10398: ldc2_w -184264527
    //   10401: l2i
    //   10402: ldc_w 936608209
    //   10405: ixor
    //   10406: ldc2_w -1194267494
    //   10409: l2i
    //   10410: ldc_w 862227196
    //   10413: ixor
    //   10414: ixor
    //   10415: lookupswitch default -> 10440, -475134137 -> 10398, 2072272410 -> 14516
    //   10440: aload_0
    //   10441: new bigname/zprestige/webhack/features/setting/Setting
    //   10444: dup
    //   10445: ldc_w 'ꋗ㌿ꋗ㶐ၭ䱁๼?'
    //   10448: getstatic Perryc.1 : I
    //   10451: ifeq -> 10465
    //   10454: ldc2_w 1801364773
    //   10457: l2i
    //   10458: ldc_w 2074798393
    //   10461: ixor
    //   10462: goto -> 10473
    //   10465: ldc2_w -690813209
    //   10468: l2i
    //   10469: ldc_w -967686310
    //   10472: ixor
    //   10473: ldc2_w 1683173666
    //   10476: l2i
    //   10477: ldc_w 1455391124
    //   10480: ixor
    //   10481: ixor
    //   10482: lookupswitch default -> 10508, -620951111 -> 10465, 572062890 -> 14570
    //   10508: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10511: ldc2_w 1447561162
    //   10514: l2i
    //   10515: ldc_w 1447561162
    //   10518: ixor
    //   10519: getstatic Perryc.0 : I
    //   10522: ifle -> 10536
    //   10525: ldc2_w -2114634298
    //   10528: l2i
    //   10529: ldc_w -61453810
    //   10532: ixor
    //   10533: goto -> 10544
    //   10536: ldc2_w 470371080
    //   10539: l2i
    //   10540: ldc_w 889220715
    //   10543: ixor
    //   10544: ldc2_w -331662676
    //   10547: l2i
    //   10548: ldc_w -1910503631
    //   10551: ixor
    //   10552: ixor
    //   10553: lookupswitch default -> 14612, 532171349 -> 10536, 1259477246 -> 10580
    //   10580: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10583: ldc2_w 1342706675
    //   10586: l2i
    //   10587: ldc_w 1342706675
    //   10590: ixor
    //   10591: getstatic Perryc.c : I
    //   10594: iflt -> 10608
    //   10597: ldc2_w -36463791
    //   10600: l2i
    //   10601: ldc_w 442952502
    //   10604: ixor
    //   10605: goto -> 10616
    //   10608: ldc2_w 1303429063
    //   10611: l2i
    //   10612: ldc_w 1697628687
    //   10615: ixor
    //   10616: ldc2_w -179541615
    //   10619: l2i
    //   10620: ldc_w 1649152884
    //   10623: ixor
    //   10624: ixor
    //   10625: lookupswitch default -> 14398, -1080096979 -> 10652, 1890912898 -> 10608
    //   10652: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10655: ldc2_w -857909823
    //   10658: l2i
    //   10659: ldc_w -857909954
    //   10662: ixor
    //   10663: getstatic Perryc.1 : I
    //   10666: ifeq -> 10680
    //   10669: ldc2_w 600303917
    //   10672: l2i
    //   10673: ldc_w -488255254
    //   10676: ixor
    //   10677: goto -> 10688
    //   10680: ldc2_w -520823235
    //   10683: l2i
    //   10684: ldc_w -1504871747
    //   10687: ixor
    //   10688: ldc2_w -1043555088
    //   10691: l2i
    //   10692: ldc_w 2034966349
    //   10695: ixor
    //   10696: ixor
    //   10697: lookupswitch default -> 14544, -29481155 -> 10724, 2040904314 -> 10680
    //   10724: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10727: getstatic Perryc.1 : I
    //   10730: ifeq -> 10744
    //   10733: ldc2_w -766628852
    //   10736: l2i
    //   10737: ldc_w -947418402
    //   10740: ixor
    //   10741: goto -> 10752
    //   10744: ldc2_w -1666894247
    //   10747: l2i
    //   10748: ldc_w -434104943
    //   10751: ixor
    //   10752: ldc2_w -1057457299
    //   10755: l2i
    //   10756: ldc_w -85234101
    //   10759: ixor
    //   10760: ixor
    //   10761: lookupswitch default -> 10788, -1217992379 -> 10744, 802862068 -> 14678
    //   10788: aload_0
    //   10789: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   10794: getstatic Perryc.c : I
    //   10797: iflt -> 10811
    //   10800: ldc2_w 1304025956
    //   10803: l2i
    //   10804: ldc_w -941602585
    //   10807: ixor
    //   10808: goto -> 10819
    //   10811: ldc2_w 675908712
    //   10814: l2i
    //   10815: ldc_w 960035346
    //   10818: ixor
    //   10819: ldc2_w 674559721
    //   10822: l2i
    //   10823: ldc_w 684754560
    //   10826: ixor
    //   10827: ixor
    //   10828: lookupswitch default -> 14546, -1967266838 -> 10811, 294979091 -> 10856
    //   10856: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10859: getstatic Perryc.c : I
    //   10862: iflt -> 10876
    //   10865: ldc2_w 867227903
    //   10868: l2i
    //   10869: ldc_w 2100357581
    //   10872: ixor
    //   10873: goto -> 10884
    //   10876: ldc2_w 130051901
    //   10879: l2i
    //   10880: ldc_w 223553222
    //   10883: ixor
    //   10884: ldc2_w -632314599
    //   10887: l2i
    //   10888: ldc_w 404976101
    //   10891: ixor
    //   10892: ixor
    //   10893: lookupswitch default -> 14604, -1930631730 -> 10876, -922772217 -> 10920
    //   10920: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10923: getstatic Perryc.c : I
    //   10926: iflt -> 10940
    //   10929: ldc2_w 667473737
    //   10932: l2i
    //   10933: ldc_w 619230707
    //   10936: ixor
    //   10937: goto -> 10948
    //   10940: ldc2_w 1910132923
    //   10943: l2i
    //   10944: ldc_w -98679191
    //   10947: ixor
    //   10948: ldc2_w 1771843157
    //   10951: l2i
    //   10952: ldc_w -1183252403
    //   10955: ixor
    //   10956: ixor
    //   10957: lookupswitch default -> 14376, -742044510 -> 10940, 1528903882 -> 10984
    //   10984: putfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10987: getstatic Perryc.c : I
    //   10990: iflt -> 11004
    //   10993: ldc2_w 1317264223
    //   10996: l2i
    //   10997: ldc_w 1769719891
    //   11000: ixor
    //   11001: goto -> 11012
    //   11004: ldc2_w -1634407379
    //   11007: l2i
    //   11008: ldc_w -1450642028
    //   11011: ixor
    //   11012: ldc2_w 581977387
    //   11015: l2i
    //   11016: ldc_w -1303963416
    //   11019: ixor
    //   11020: ixor
    //   11021: lookupswitch default -> 14538, -1477753734 -> 11048, -1223733553 -> 11004
    //   11048: aload_0
    //   11049: getstatic Perryc.0 : I
    //   11052: ifle -> 11066
    //   11055: ldc2_w 1629023786
    //   11058: l2i
    //   11059: ldc_w 5625496
    //   11062: ixor
    //   11063: goto -> 11074
    //   11066: ldc2_w 1134403869
    //   11069: l2i
    //   11070: ldc_w 1596619761
    //   11073: ixor
    //   11074: ldc2_w -188895616
    //   11077: l2i
    //   11078: ldc_w 1099529404
    //   11081: ixor
    //   11082: ixor
    //   11083: lookupswitch default -> 14766, -1451030320 -> 11108, -730207602 -> 11066
    //   11108: aload_0
    //   11109: new bigname/zprestige/webhack/features/setting/Setting
    //   11112: dup
    //   11113: ldc_w 'ꋗ㌿ꋗ㶕ၳ䱑๼'
    //   11116: getstatic Perryc.1 : I
    //   11119: ifeq -> 11133
    //   11122: ldc2_w 1646159956
    //   11125: l2i
    //   11126: ldc_w -711067036
    //   11129: ixor
    //   11130: goto -> 11141
    //   11133: ldc2_w -1687549059
    //   11136: l2i
    //   11137: ldc_w -1266528629
    //   11140: ixor
    //   11141: ldc2_w 1667346592
    //   11144: l2i
    //   11145: ldc_w -753972679
    //   11148: ixor
    //   11149: ixor
    //   11150: lookupswitch default -> 14548, -1618559121 -> 11176, 132999337 -> 11133
    //   11176: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11179: ldc2_w -1081242782
    //   11182: l2i
    //   11183: ldc_w -1081242723
    //   11186: ixor
    //   11187: getstatic Perryc.1 : I
    //   11190: ifeq -> 11204
    //   11193: ldc2_w 1939149449
    //   11196: l2i
    //   11197: ldc_w -182305843
    //   11200: ixor
    //   11201: goto -> 11212
    //   11204: ldc2_w 291898273
    //   11207: l2i
    //   11208: ldc_w -1298123841
    //   11211: ixor
    //   11212: ldc2_w -1820975293
    //   11215: l2i
    //   11216: ldc_w -1816098610
    //   11219: ixor
    //   11220: ixor
    //   11221: lookupswitch default -> 14664, -2046705975 -> 11204, -1552898157 -> 11248
    //   11248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11251: ldc2_w -1467244342
    //   11254: l2i
    //   11255: ldc_w -1467244342
    //   11258: ixor
    //   11259: getstatic Perryc.0 : I
    //   11262: ifle -> 11276
    //   11265: ldc2_w -1524181695
    //   11268: l2i
    //   11269: ldc_w -1049671474
    //   11272: ixor
    //   11273: goto -> 11284
    //   11276: ldc2_w -668613458
    //   11279: l2i
    //   11280: ldc_w -1516177160
    //   11283: ixor
    //   11284: ldc2_w -65201740
    //   11287: l2i
    //   11288: ldc_w -2029316192
    //   11291: ixor
    //   11292: ixor
    //   11293: lookupswitch default -> 11320, 526357403 -> 14758, 1384135335 -> 11276
    //   11320: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11323: ldc2_w -1146093529
    //   11326: l2i
    //   11327: ldc_w -1146093352
    //   11330: ixor
    //   11331: getstatic Perryc.0 : I
    //   11334: ifle -> 11348
    //   11337: ldc2_w 861647876
    //   11340: l2i
    //   11341: ldc_w 385127546
    //   11344: ixor
    //   11345: goto -> 11356
    //   11348: ldc2_w 1950556571
    //   11351: l2i
    //   11352: ldc_w 13396797
    //   11355: ixor
    //   11356: ldc2_w 815981207
    //   11359: l2i
    //   11360: ldc_w 1400334720
    //   11363: ixor
    //   11364: ixor
    //   11365: lookupswitch default -> 14600, 391823793 -> 11392, 1182444393 -> 11348
    //   11392: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11395: getstatic Perryc.c : I
    //   11398: iflt -> 11412
    //   11401: ldc2_w -225692037
    //   11404: l2i
    //   11405: ldc_w 609462052
    //   11408: ixor
    //   11409: goto -> 11420
    //   11412: ldc2_w -1465754740
    //   11415: l2i
    //   11416: ldc_w 165755185
    //   11419: ixor
    //   11420: ldc2_w -550466195
    //   11423: l2i
    //   11424: ldc_w 140885174
    //   11427: ixor
    //   11428: ixor
    //   11429: lookupswitch default -> 11456, -1110764626 -> 11412, 25862276 -> 14748
    //   11456: aload_0
    //   11457: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   11462: getstatic Perryc.c : I
    //   11465: iflt -> 11479
    //   11468: ldc2_w -1103326226
    //   11471: l2i
    //   11472: ldc_w 520465041
    //   11475: ixor
    //   11476: goto -> 11487
    //   11479: ldc2_w -1274951982
    //   11482: l2i
    //   11483: ldc_w 1368947871
    //   11486: ixor
    //   11487: ldc2_w 1886890178
    //   11490: l2i
    //   11491: ldc_w -90363457
    //   11494: ixor
    //   11495: ixor
    //   11496: lookupswitch default -> 11524, 288733927 -> 11479, 735295490 -> 14734
    //   11524: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11527: getstatic Perryc.1 : I
    //   11530: ifeq -> 11544
    //   11533: ldc2_w 549147510
    //   11536: l2i
    //   11537: ldc_w -935689434
    //   11540: ixor
    //   11541: goto -> 11552
    //   11544: ldc2_w 454069964
    //   11547: l2i
    //   11548: ldc_w -2089740245
    //   11551: ixor
    //   11552: ldc2_w -1023707015
    //   11555: l2i
    //   11556: ldc_w 1046820013
    //   11559: ixor
    //   11560: ixor
    //   11561: lookupswitch default -> 11588, -600555858 -> 11544, 337616004 -> 14550
    //   11588: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11591: getstatic Perryc.0 : I
    //   11594: ifle -> 11608
    //   11597: ldc2_w 954635778
    //   11600: l2i
    //   11601: ldc_w -291820121
    //   11604: ixor
    //   11605: goto -> 11616
    //   11608: ldc2_w -924960136
    //   11611: l2i
    //   11612: ldc_w -275468655
    //   11615: ixor
    //   11616: ldc2_w -590503909
    //   11619: l2i
    //   11620: ldc_w -837302085
    //   11623: ixor
    //   11624: ixor
    //   11625: lookupswitch default -> 14614, -995634427 -> 11608, 898694217 -> 11652
    //   11652: putfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11655: getstatic Perryc.0 : I
    //   11658: ifle -> 11672
    //   11661: ldc2_w -836221677
    //   11664: l2i
    //   11665: ldc_w 1378419083
    //   11668: ixor
    //   11669: goto -> 11680
    //   11672: ldc2_w 678321662
    //   11675: l2i
    //   11676: ldc_w 415086596
    //   11679: ixor
    //   11680: ldc2_w -1069376363
    //   11683: l2i
    //   11684: ldc_w 382667596
    //   11687: ixor
    //   11688: ixor
    //   11689: lookupswitch default -> 11716, 1250743105 -> 14800, 1901260166 -> 11672
    //   11716: aload_0
    //   11717: getstatic Perryc.1 : I
    //   11720: ifeq -> 11734
    //   11723: ldc2_w 1581791151
    //   11726: l2i
    //   11727: ldc_w 1119005390
    //   11730: ixor
    //   11731: goto -> 11742
    //   11734: ldc2_w -68308484
    //   11737: l2i
    //   11738: ldc_w 1623574356
    //   11741: ixor
    //   11742: ldc2_w 993317801
    //   11745: l2i
    //   11746: ldc_w 18226036
    //   11749: ixor
    //   11750: ixor
    //   11751: lookupswitch default -> 11776, 651711932 -> 14506, 1046226289 -> 11734
    //   11776: aload_0
    //   11777: new bigname/zprestige/webhack/features/setting/Setting
    //   11780: dup
    //   11781: ldc_w 'ꋗ㌿ꋗ㶅ၾ䱍๷?蹬䲖'
    //   11784: getstatic Perryc.c : I
    //   11787: iflt -> 11801
    //   11790: ldc2_w -377784693
    //   11793: l2i
    //   11794: ldc_w -2012087264
    //   11797: ixor
    //   11798: goto -> 11809
    //   11801: ldc2_w -101731314
    //   11804: l2i
    //   11805: ldc_w -1103234413
    //   11808: ixor
    //   11809: ldc2_w 2010363289
    //   11812: l2i
    //   11813: ldc_w -77464116
    //   11816: ixor
    //   11817: ixor
    //   11818: lookupswitch default -> 14578, -882899256 -> 11844, -304561410 -> 11801
    //   11844: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11847: ldc2_w -1315103514
    //   11850: l2i
    //   11851: ldc_w -1315103514
    //   11854: ixor
    //   11855: getstatic Perryc.c : I
    //   11858: iflt -> 11872
    //   11861: ldc2_w 1744583527
    //   11864: l2i
    //   11865: ldc_w -2128360467
    //   11868: ixor
    //   11869: goto -> 11880
    //   11872: ldc2_w -1885696130
    //   11875: l2i
    //   11876: ldc_w 943918085
    //   11879: ixor
    //   11880: ldc2_w -733907695
    //   11883: l2i
    //   11884: ldc_w -1773814563
    //   11887: ixor
    //   11888: ixor
    //   11889: lookupswitch default -> 11916, -1529136826 -> 14768, -497869881 -> 11872
    //   11916: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11919: getstatic Perryc.1 : I
    //   11922: ifeq -> 11936
    //   11925: ldc2_w -455580837
    //   11928: l2i
    //   11929: ldc_w 663205072
    //   11932: ixor
    //   11933: goto -> 11944
    //   11936: ldc2_w 1665554774
    //   11939: l2i
    //   11940: ldc_w -614156260
    //   11943: ixor
    //   11944: ldc2_w 538409429
    //   11947: l2i
    //   11948: ldc_w 87490087
    //   11951: ixor
    //   11952: ixor
    //   11953: lookupswitch default -> 14656, -1660721480 -> 11980, -427929479 -> 11936
    //   11980: aload_0
    //   11981: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   11986: getstatic Perryc.c : I
    //   11989: iflt -> 12003
    //   11992: ldc2_w 1030378153
    //   11995: l2i
    //   11996: ldc_w 1404342346
    //   11999: ixor
    //   12000: goto -> 12011
    //   12003: ldc2_w 1544589545
    //   12006: l2i
    //   12007: ldc_w 221753855
    //   12010: ixor
    //   12011: ldc2_w -1519167
    //   12014: l2i
    //   12015: ldc_w 2147401459
    //   12018: ixor
    //   12019: ixor
    //   12020: lookupswitch default -> 14388, -785297884 -> 12048, -288838191 -> 12003
    //   12048: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12051: getstatic Perryc.c : I
    //   12054: iflt -> 12068
    //   12057: ldc2_w 361273488
    //   12060: l2i
    //   12061: ldc_w -547957890
    //   12064: ixor
    //   12065: goto -> 12076
    //   12068: ldc2_w 206396465
    //   12071: l2i
    //   12072: ldc_w -25477586
    //   12075: ixor
    //   12076: ldc2_w -182955063
    //   12079: l2i
    //   12080: ldc_w -989292151
    //   12083: ixor
    //   12084: ixor
    //   12085: lookupswitch default -> 14532, -1037653921 -> 12112, -87129682 -> 12068
    //   12112: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12115: getstatic Perryc.c : I
    //   12118: iflt -> 12132
    //   12121: ldc2_w -1843965243
    //   12124: l2i
    //   12125: ldc_w -233478672
    //   12128: ixor
    //   12129: goto -> 12140
    //   12132: ldc2_w -2121433225
    //   12135: l2i
    //   12136: ldc_w 781149300
    //   12139: ixor
    //   12140: ldc2_w 749798239
    //   12143: l2i
    //   12144: ldc_w -1294256014
    //   12147: ixor
    //   12148: ixor
    //   12149: lookupswitch default -> 12176, -26735592 -> 14512, 339029295 -> 12132
    //   12176: putfield cRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12179: getstatic Perryc.1 : I
    //   12182: ifeq -> 12196
    //   12185: ldc2_w -151946854
    //   12188: l2i
    //   12189: ldc_w 1392786066
    //   12192: ixor
    //   12193: goto -> 12204
    //   12196: ldc2_w 313357598
    //   12199: l2i
    //   12200: ldc_w -1785596064
    //   12203: ixor
    //   12204: ldc2_w -2027614852
    //   12207: l2i
    //   12208: ldc_w 350947976
    //   12211: ixor
    //   12212: ixor
    //   12213: lookupswitch default -> 12240, 909853948 -> 14732, 1407325498 -> 12196
    //   12240: aload_0
    //   12241: getstatic Perryc.0 : I
    //   12244: ifle -> 12258
    //   12247: ldc2_w -2096598839
    //   12250: l2i
    //   12251: ldc_w -633026286
    //   12254: ixor
    //   12255: goto -> 12266
    //   12258: ldc2_w 1672646739
    //   12261: l2i
    //   12262: ldc_w -1237894933
    //   12265: ixor
    //   12266: ldc2_w -355543049
    //   12269: l2i
    //   12270: ldc_w -400817125
    //   12273: ixor
    //   12274: ixor
    //   12275: lookupswitch default -> 14522, -682132652 -> 12300, 1537108535 -> 12258
    //   12300: aload_0
    //   12301: new bigname/zprestige/webhack/features/setting/Setting
    //   12304: dup
    //   12305: ldc_w 'ꋗ㌿ꋗ㶖ၳ䱔๱?'
    //   12308: getstatic Perryc.0 : I
    //   12311: ifle -> 12325
    //   12314: ldc2_w -1528274604
    //   12317: l2i
    //   12318: ldc_w -822594243
    //   12321: ixor
    //   12322: goto -> 12333
    //   12325: ldc2_w -1813955958
    //   12328: l2i
    //   12329: ldc_w 584690855
    //   12332: ixor
    //   12333: ldc2_w 581271252
    //   12336: l2i
    //   12337: ldc_w -2081497926
    //   12340: ixor
    //   12341: ixor
    //   12342: lookupswitch default -> 12368, -1156642266 -> 12325, -883165689 -> 14728
    //   12368: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12371: ldc2_w 141364966
    //   12374: l2i
    //   12375: ldc_w 141364761
    //   12378: ixor
    //   12379: getstatic Perryc.0 : I
    //   12382: ifle -> 12396
    //   12385: ldc2_w -187787662
    //   12388: l2i
    //   12389: ldc_w 1629591214
    //   12392: ixor
    //   12393: goto -> 12404
    //   12396: ldc2_w 2023302435
    //   12399: l2i
    //   12400: ldc_w -1477012639
    //   12403: ixor
    //   12404: ldc2_w 1555871565
    //   12407: l2i
    //   12408: ldc_w -1772941147
    //   12411: ixor
    //   12412: ixor
    //   12413: lookupswitch default -> 14406, 360714666 -> 12440, 1593878324 -> 12396
    //   12440: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12443: ldc2_w -789969439
    //   12446: l2i
    //   12447: ldc_w -789969439
    //   12450: ixor
    //   12451: getstatic Perryc.0 : I
    //   12454: ifle -> 12468
    //   12457: ldc2_w 1482195335
    //   12460: l2i
    //   12461: ldc_w -1135329927
    //   12464: ixor
    //   12465: goto -> 12476
    //   12468: ldc2_w 64480811
    //   12471: l2i
    //   12472: ldc_w -1100019947
    //   12475: ixor
    //   12476: ldc2_w -1719584335
    //   12479: l2i
    //   12480: ldc_w -2106341756
    //   12483: ixor
    //   12484: ixor
    //   12485: lookupswitch default -> 14694, -1505092085 -> 12512, -113717 -> 12468
    //   12512: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12515: ldc2_w -1738820852
    //   12518: l2i
    //   12519: ldc_w -1738820621
    //   12522: ixor
    //   12523: getstatic Perryc.0 : I
    //   12526: ifle -> 12540
    //   12529: ldc2_w 402175441
    //   12532: l2i
    //   12533: ldc_w -629455550
    //   12536: ixor
    //   12537: goto -> 12548
    //   12540: ldc2_w -1147487958
    //   12543: l2i
    //   12544: ldc_w -2083496885
    //   12547: ixor
    //   12548: ldc2_w 1700571029
    //   12551: l2i
    //   12552: ldc_w -1499380808
    //   12555: ixor
    //   12556: ixor
    //   12557: lookupswitch default -> 14684, -71892660 -> 12584, 243143870 -> 12540
    //   12584: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12587: getstatic Perryc.c : I
    //   12590: iflt -> 12604
    //   12593: ldc2_w 262977432
    //   12596: l2i
    //   12597: ldc_w -555847187
    //   12600: ixor
    //   12601: goto -> 12612
    //   12604: ldc2_w 456618085
    //   12607: l2i
    //   12608: ldc_w -1696780344
    //   12611: ixor
    //   12612: ldc2_w 513688084
    //   12615: l2i
    //   12616: ldc_w 1426482299
    //   12619: ixor
    //   12620: ixor
    //   12621: lookupswitch default -> 14468, -1695883238 -> 12604, -898467390 -> 12648
    //   12648: aload_0
    //   12649: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   12654: getstatic Perryc.1 : I
    //   12657: ifeq -> 12671
    //   12660: ldc2_w -2058905617
    //   12663: l2i
    //   12664: ldc_w -1502159569
    //   12667: ixor
    //   12668: goto -> 12679
    //   12671: ldc2_w 1532161193
    //   12674: l2i
    //   12675: ldc_w -1104941382
    //   12678: ixor
    //   12679: ldc2_w -166338950
    //   12682: l2i
    //   12683: ldc_w -166362409
    //   12686: ixor
    //   12687: ixor
    //   12688: lookupswitch default -> 14726, -445555010 -> 12716, 590419565 -> 12671
    //   12716: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12719: getstatic Perryc.0 : I
    //   12722: ifle -> 12736
    //   12725: ldc2_w -1435397091
    //   12728: l2i
    //   12729: ldc_w -74095286
    //   12732: ixor
    //   12733: goto -> 12744
    //   12736: ldc2_w 1719385481
    //   12739: l2i
    //   12740: ldc_w 1702354018
    //   12743: ixor
    //   12744: ldc2_w -306713445
    //   12747: l2i
    //   12748: ldc_w 569157801
    //   12751: ixor
    //   12752: ixor
    //   12753: lookupswitch default -> 14584, -1648380571 -> 12736, -816372263 -> 12780
    //   12780: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12783: getstatic Perryc.c : I
    //   12786: iflt -> 12800
    //   12789: ldc2_w -814351734
    //   12792: l2i
    //   12793: ldc_w 408639942
    //   12796: ixor
    //   12797: goto -> 12808
    //   12800: ldc2_w -1570072706
    //   12803: l2i
    //   12804: ldc_w -682040313
    //   12807: ixor
    //   12808: ldc2_w -708622065
    //   12811: l2i
    //   12812: ldc_w -257223871
    //   12815: ixor
    //   12816: ixor
    //   12817: lookupswitch default -> 14710, -230229758 -> 12800, 1348086071 -> 12844
    //   12844: putfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12847: getstatic Perryc.0 : I
    //   12850: ifle -> 12864
    //   12853: ldc2_w 738260946
    //   12856: l2i
    //   12857: ldc_w -1757596778
    //   12860: ixor
    //   12861: goto -> 12872
    //   12864: ldc2_w -807865871
    //   12867: l2i
    //   12868: ldc_w 1174919412
    //   12871: ixor
    //   12872: ldc2_w -403603184
    //   12875: l2i
    //   12876: ldc_w 2113956388
    //   12879: ixor
    //   12880: ixor
    //   12881: lookupswitch default -> 12908, -1303194800 -> 12864, 583806832 -> 14540
    //   12908: aload_0
    //   12909: getstatic Perryc.c : I
    //   12912: iflt -> 12926
    //   12915: ldc2_w 1777706099
    //   12918: l2i
    //   12919: ldc_w -161595545
    //   12922: ixor
    //   12923: goto -> 12934
    //   12926: ldc2_w -1995645450
    //   12929: l2i
    //   12930: ldc_w 686034716
    //   12933: ixor
    //   12934: ldc2_w 787663263
    //   12937: l2i
    //   12938: ldc_w -1011156722
    //   12941: ixor
    //   12942: ixor
    //   12943: lookupswitch default -> 14588, 1285612155 -> 12968, 1927523205 -> 12926
    //   12968: aload_0
    //   12969: new bigname/zprestige/webhack/features/setting/Setting
    //   12972: dup
    //   12973: ldc_w 'ꋔ㌚ꊔ㶲၈䱍๽?蹫'
    //   12976: getstatic Perryc.c : I
    //   12979: iflt -> 12993
    //   12982: ldc2_w -786147000
    //   12985: l2i
    //   12986: ldc_w -63532985
    //   12989: ixor
    //   12990: goto -> 13001
    //   12993: ldc2_w -1723266313
    //   12996: l2i
    //   12997: ldc_w 623765927
    //   13000: ixor
    //   13001: ldc2_w 330269344
    //   13004: l2i
    //   13005: ldc_w -1016423429
    //   13008: ixor
    //   13009: ixor
    //   13010: lookupswitch default -> 13036, -36188076 -> 14708, 410409588 -> 12993
    //   13036: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13039: ldc_w 46.01254
    //   13042: invokestatic floatToIntBits : (F)I
    //   13045: ldc_w 2109213911
    //   13048: ixor
    //   13049: invokestatic intBitsToFloat : (I)F
    //   13052: getstatic Perryc.c : I
    //   13055: iflt -> 13069
    //   13058: ldc2_w -711325274
    //   13061: l2i
    //   13062: ldc_w 321144358
    //   13065: ixor
    //   13066: goto -> 13077
    //   13069: ldc2_w -1204894528
    //   13072: l2i
    //   13073: ldc_w 692566583
    //   13076: ixor
    //   13077: ldc2_w 2084308850
    //   13080: l2i
    //   13081: ldc_w -1867030063
    //   13084: ixor
    //   13085: ixor
    //   13086: lookupswitch default -> 13112, 180845502 -> 13069, 708127011 -> 14802
    //   13112: invokestatic valueOf : (F)Ljava/lang/Float;
    //   13115: ldc_w 7.655656
    //   13118: invokestatic floatToIntBits : (F)I
    //   13121: ldc_w 2100836335
    //   13124: ixor
    //   13125: invokestatic intBitsToFloat : (I)F
    //   13128: getstatic Perryc.1 : I
    //   13131: ifeq -> 13145
    //   13134: ldc2_w 192338253
    //   13137: l2i
    //   13138: ldc_w -1353161317
    //   13141: ixor
    //   13142: goto -> 13153
    //   13145: ldc2_w -2034010503
    //   13148: l2i
    //   13149: ldc_w 880091597
    //   13152: ixor
    //   13153: ldc2_w -1744992133
    //   13156: l2i
    //   13157: ldc_w -135094646
    //   13160: ixor
    //   13161: ixor
    //   13162: lookupswitch default -> 13188, -1004426713 -> 14688, 1056469723 -> 13145
    //   13188: invokestatic valueOf : (F)Ljava/lang/Float;
    //   13191: ldc_w 0.06242999
    //   13194: invokestatic floatToIntBits : (F)I
    //   13197: ldc_w 2111813271
    //   13200: ixor
    //   13201: invokestatic intBitsToFloat : (I)F
    //   13204: getstatic Perryc.1 : I
    //   13207: ifeq -> 13221
    //   13210: ldc2_w -1001665640
    //   13213: l2i
    //   13214: ldc_w -1517763183
    //   13217: ixor
    //   13218: goto -> 13229
    //   13221: ldc2_w 844295356
    //   13224: l2i
    //   13225: ldc_w 1988229989
    //   13228: ixor
    //   13229: ldc2_w -1492553276
    //   13232: l2i
    //   13233: ldc_w -270942858
    //   13236: ixor
    //   13237: ixor
    //   13238: lookupswitch default -> 13264, 689160891 -> 14634, 2080865556 -> 13221
    //   13264: invokestatic valueOf : (F)Ljava/lang/Float;
    //   13267: getstatic Perryc.0 : I
    //   13270: ifle -> 13284
    //   13273: ldc2_w -181102616
    //   13276: l2i
    //   13277: ldc_w 1296121040
    //   13280: ixor
    //   13281: goto -> 13292
    //   13284: ldc2_w 745944736
    //   13287: l2i
    //   13288: ldc_w 1199042433
    //   13291: ixor
    //   13292: ldc2_w -1705884459
    //   13295: l2i
    //   13296: ldc_w 173582973
    //   13299: ixor
    //   13300: ixor
    //   13301: lookupswitch default -> 14594, -83150967 -> 13328, 679429520 -> 13284
    //   13328: aload_0
    //   13329: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;)Ljava/util/function/Predicate;
    //   13334: getstatic Perryc.c : I
    //   13337: iflt -> 13351
    //   13340: ldc2_w -2130128926
    //   13343: l2i
    //   13344: ldc_w 211906246
    //   13347: ixor
    //   13348: goto -> 13359
    //   13351: ldc2_w 1349555126
    //   13354: l2i
    //   13355: ldc_w -1240312159
    //   13358: ixor
    //   13359: ldc2_w 340234320
    //   13362: l2i
    //   13363: ldc_w 1952298287
    //   13366: ixor
    //   13367: ixor
    //   13368: lookupswitch default -> 14446, -2038898584 -> 13396, -307002277 -> 13351
    //   13396: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13399: getstatic Perryc.c : I
    //   13402: iflt -> 13416
    //   13405: ldc2_w 1815172800
    //   13408: l2i
    //   13409: ldc_w 1582450752
    //   13412: ixor
    //   13413: goto -> 13424
    //   13416: ldc2_w 1933616443
    //   13419: l2i
    //   13420: ldc_w -1486190617
    //   13423: ixor
    //   13424: ldc2_w 876270409
    //   13427: l2i
    //   13428: ldc_w -279654364
    //   13431: ixor
    //   13432: ixor
    //   13433: lookupswitch default -> 13460, -385016339 -> 14668, 457963437 -> 13416
    //   13460: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13463: getstatic Perryc.0 : I
    //   13466: ifle -> 13480
    //   13469: ldc2_w 766099737
    //   13472: l2i
    //   13473: ldc_w -1627441970
    //   13476: ixor
    //   13477: goto -> 13488
    //   13480: ldc2_w -531752961
    //   13483: l2i
    //   13484: ldc_w 1346223100
    //   13487: ixor
    //   13488: ldc2_w 521065937
    //   13491: l2i
    //   13492: ldc_w -1788290620
    //   13495: ixor
    //   13496: ixor
    //   13497: lookupswitch default -> 13524, 443909534 -> 13480, 959510978 -> 14554
    //   13524: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13527: getstatic Perryc.c : I
    //   13530: iflt -> 13544
    //   13533: ldc2_w -500283589
    //   13536: l2i
    //   13537: ldc_w 2102316668
    //   13540: ixor
    //   13541: goto -> 13552
    //   13544: ldc2_w -140167147
    //   13547: l2i
    //   13548: ldc_w 854016649
    //   13551: ixor
    //   13552: ldc2_w 1639977902
    //   13555: l2i
    //   13556: ldc_w -1411545521
    //   13559: ixor
    //   13560: ixor
    //   13561: lookupswitch default -> 14696, 257945469 -> 13588, 1434262694 -> 13544
    //   13588: aload_0
    //   13589: new bigname/zprestige/webhack/util/Timer
    //   13592: dup
    //   13593: getstatic Perryc.0 : I
    //   13596: ifle -> 13610
    //   13599: ldc2_w -511410701
    //   13602: l2i
    //   13603: ldc_w -1341130409
    //   13606: ixor
    //   13607: goto -> 13618
    //   13610: ldc2_w -2135127890
    //   13613: l2i
    //   13614: ldc_w -672588276
    //   13617: ixor
    //   13618: ldc2_w -1583979465
    //   13621: l2i
    //   13622: ldc_w -560360506
    //   13625: ixor
    //   13626: ixor
    //   13627: lookupswitch default -> 14730, 677011795 -> 13652, 780432213 -> 13610
    //   13652: invokespecial <init> : ()V
    //   13655: getstatic Perryc.1 : I
    //   13658: ifeq -> 13672
    //   13661: ldc2_w -1371955492
    //   13664: l2i
    //   13665: ldc_w 2067104615
    //   13668: ixor
    //   13669: goto -> 13680
    //   13672: ldc2_w -1450421486
    //   13675: l2i
    //   13676: ldc_w -837891685
    //   13679: ixor
    //   13680: ldc2_w -1838505230
    //   13683: l2i
    //   13684: ldc_w 736051086
    //   13687: ixor
    //   13688: ixor
    //   13689: lookupswitch default -> 13716, -287527523 -> 13672, 1824096455 -> 14444
    //   13716: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   13719: getstatic Perryc.1 : I
    //   13722: ifeq -> 13736
    //   13725: ldc2_w 2094181803
    //   13728: l2i
    //   13729: ldc_w -1904237407
    //   13732: ixor
    //   13733: goto -> 13744
    //   13736: ldc2_w -678259425
    //   13739: l2i
    //   13740: ldc_w -1112386048
    //   13743: ixor
    //   13744: ldc2_w -682820155
    //   13747: l2i
    //   13748: ldc_w -276968841
    //   13751: ixor
    //   13752: ixor
    //   13753: lookupswitch default -> 14442, -895729992 -> 13736, 1376908461 -> 13780
    //   13780: aload_0
    //   13781: ldc2_w 2001555354
    //   13784: l2i
    //   13785: ldc_w 2001555354
    //   13788: ixor
    //   13789: getstatic Perryc.0 : I
    //   13792: ifle -> 13806
    //   13795: ldc2_w -591729814
    //   13798: l2i
    //   13799: ldc_w -1017999588
    //   13802: ixor
    //   13803: goto -> 13814
    //   13806: ldc2_w -521295951
    //   13809: l2i
    //   13810: ldc_w 823964313
    //   13813: ixor
    //   13814: ldc2_w 1943502460
    //   13817: l2i
    //   13818: ldc_w -534934584
    //   13821: ixor
    //   13822: ixor
    //   13823: lookupswitch default -> 13848, -1943891518 -> 14478, -415662292 -> 13806
    //   13848: putfield didPlace : Z
    //   13851: getstatic Perryc.1 : I
    //   13854: ifeq -> 13868
    //   13857: ldc2_w 461680266
    //   13860: l2i
    //   13861: ldc_w 261390693
    //   13864: ixor
    //   13865: goto -> 13876
    //   13868: ldc2_w 332545747
    //   13871: l2i
    //   13872: ldc_w 1687927173
    //   13875: ixor
    //   13876: ldc2_w -1504601230
    //   13879: l2i
    //   13880: ldc_w 13145210
    //   13883: ixor
    //   13884: ixor
    //   13885: lookupswitch default -> 13912, -1299635993 -> 14636, 10845384 -> 13868
    //   13912: aload_0
    //   13913: ldc2_w 1996428233
    //   13916: l2i
    //   13917: ldc_w 1996428233
    //   13920: ixor
    //   13921: getstatic Perryc.1 : I
    //   13924: ifeq -> 13938
    //   13927: ldc2_w -337702165
    //   13930: l2i
    //   13931: ldc_w 1292153283
    //   13934: ixor
    //   13935: goto -> 13946
    //   13938: ldc2_w -824446567
    //   13941: l2i
    //   13942: ldc_w -1002396865
    //   13945: ixor
    //   13946: ldc2_w 1450598186
    //   13949: l2i
    //   13950: ldc_w -1011121027
    //   13953: ixor
    //   13954: ixor
    //   13955: lookupswitch default -> 14562, -1621718543 -> 13980, 857110655 -> 13938
    //   13980: putfield placements : I
    //   13983: getstatic Perryc.1 : I
    //   13986: ifeq -> 14000
    //   13989: ldc2_w -596053571
    //   13992: l2i
    //   13993: ldc_w 1032774536
    //   13996: ixor
    //   13997: goto -> 14008
    //   14000: ldc2_w -1232378770
    //   14003: l2i
    //   14004: ldc_w -1652384652
    //   14007: ixor
    //   14008: ldc2_w 1156881232
    //   14011: l2i
    //   14012: ldc_w -1152024783
    //   14015: ixor
    //   14016: ixor
    //   14017: lookupswitch default -> 14044, -1186405829 -> 14000, 509081172 -> 14638
    //   14044: aload_0
    //   14045: ldc2_w 582159947
    //   14048: l2i
    //   14049: ldc_w 582159947
    //   14052: ixor
    //   14053: getstatic Perryc.c : I
    //   14056: iflt -> 14070
    //   14059: ldc2_w -493826290
    //   14062: l2i
    //   14063: ldc_w 40861761
    //   14066: ixor
    //   14067: goto -> 14078
    //   14070: ldc2_w -145002571
    //   14073: l2i
    //   14074: ldc_w -2128264686
    //   14077: ixor
    //   14078: ldc2_w 49039434
    //   14081: l2i
    //   14082: ldc_w 1388311898
    //   14085: ixor
    //   14086: ixor
    //   14087: lookupswitch default -> 14112, -1330843041 -> 14438, 99574123 -> 14070
    //   14112: putfield smartRotate : Z
    //   14115: getstatic Perryc.0 : I
    //   14118: ifle -> 14132
    //   14121: ldc2_w 246801508
    //   14124: l2i
    //   14125: ldc_w -950945367
    //   14128: ixor
    //   14129: goto -> 14140
    //   14132: ldc2_w -990007004
    //   14135: l2i
    //   14136: ldc_w -22830489
    //   14139: ixor
    //   14140: ldc2_w 1357980947
    //   14143: l2i
    //   14144: ldc_w -486236545
    //   14147: ixor
    //   14148: ixor
    //   14149: lookupswitch default -> 14564, -1985238993 -> 14176, 2047993505 -> 14132
    //   14176: aload_0
    //   14177: aconst_null
    //   14178: getstatic Perryc.0 : I
    //   14181: ifle -> 14195
    //   14184: ldc2_w 485956264
    //   14187: l2i
    //   14188: ldc_w 499578850
    //   14191: ixor
    //   14192: goto -> 14203
    //   14195: ldc2_w -70376658
    //   14198: l2i
    //   14199: ldc_w -1086832140
    //   14202: ixor
    //   14203: ldc2_w 1352034372
    //   14206: l2i
    //   14207: ldc_w -2021995432
    //   14210: ixor
    //   14211: ixor
    //   14212: lookupswitch default -> 14240, -995429328 -> 14195, -690140842 -> 14702
    //   14240: putfield startPos : Lnet/minecraft/util/math/BlockPos;
    //   14243: getstatic Perryc.1 : I
    //   14246: ifeq -> 14260
    //   14249: ldc2_w -1828371359
    //   14252: l2i
    //   14253: ldc_w 1884308091
    //   14256: ixor
    //   14257: goto -> 14268
    //   14260: ldc2_w 159108636
    //   14263: l2i
    //   14264: ldc_w -2105996027
    //   14267: ixor
    //   14268: ldc2_w -453738344
    //   14271: l2i
    //   14272: ldc_w -1668106774
    //   14275: ixor
    //   14276: ixor
    //   14277: lookupswitch default -> 14304, -1691143320 -> 14648, 1719819887 -> 14260
    //   14304: aload_0
    //   14305: aconst_null
    //   14306: getstatic Perryc.1 : I
    //   14309: ifeq -> 14323
    //   14312: ldc2_w 366978515
    //   14315: l2i
    //   14316: ldc_w -2061624057
    //   14319: ixor
    //   14320: goto -> 14331
    //   14323: ldc2_w -1976915455
    //   14326: l2i
    //   14327: ldc_w -349511571
    //   14330: ixor
    //   14331: ldc2_w -1404822972
    //   14334: l2i
    //   14335: ldc_w -559121401
    //   14338: ixor
    //   14339: ixor
    //   14340: lookupswitch default -> 14368, -500572521 -> 14456, 1703843074 -> 14323
    //   14368: putfield renderPos : Lnet/minecraft/util/math/BlockPos;
    //   14371: return
    //   14372: aconst_null
    //   14373: athrow
    //   14374: aconst_null
    //   14375: athrow
    //   14376: aconst_null
    //   14377: athrow
    //   14378: aconst_null
    //   14379: athrow
    //   14380: aconst_null
    //   14381: athrow
    //   14382: aconst_null
    //   14383: athrow
    //   14384: aconst_null
    //   14385: athrow
    //   14386: aconst_null
    //   14387: athrow
    //   14388: aconst_null
    //   14389: athrow
    //   14390: aconst_null
    //   14391: athrow
    //   14392: aconst_null
    //   14393: athrow
    //   14394: aconst_null
    //   14395: athrow
    //   14396: aconst_null
    //   14397: athrow
    //   14398: aconst_null
    //   14399: athrow
    //   14400: aconst_null
    //   14401: athrow
    //   14402: aconst_null
    //   14403: athrow
    //   14404: aconst_null
    //   14405: athrow
    //   14406: aconst_null
    //   14407: athrow
    //   14408: aconst_null
    //   14409: athrow
    //   14410: aconst_null
    //   14411: athrow
    //   14412: aconst_null
    //   14413: athrow
    //   14414: aconst_null
    //   14415: athrow
    //   14416: aconst_null
    //   14417: athrow
    //   14418: aconst_null
    //   14419: athrow
    //   14420: aconst_null
    //   14421: athrow
    //   14422: aconst_null
    //   14423: athrow
    //   14424: aconst_null
    //   14425: athrow
    //   14426: aconst_null
    //   14427: athrow
    //   14428: aconst_null
    //   14429: athrow
    //   14430: aconst_null
    //   14431: athrow
    //   14432: aconst_null
    //   14433: athrow
    //   14434: aconst_null
    //   14435: athrow
    //   14436: aconst_null
    //   14437: athrow
    //   14438: aconst_null
    //   14439: athrow
    //   14440: aconst_null
    //   14441: athrow
    //   14442: aconst_null
    //   14443: athrow
    //   14444: aconst_null
    //   14445: athrow
    //   14446: aconst_null
    //   14447: athrow
    //   14448: aconst_null
    //   14449: athrow
    //   14450: aconst_null
    //   14451: athrow
    //   14452: aconst_null
    //   14453: athrow
    //   14454: aconst_null
    //   14455: athrow
    //   14456: aconst_null
    //   14457: athrow
    //   14458: aconst_null
    //   14459: athrow
    //   14460: aconst_null
    //   14461: athrow
    //   14462: aconst_null
    //   14463: athrow
    //   14464: aconst_null
    //   14465: athrow
    //   14466: aconst_null
    //   14467: athrow
    //   14468: aconst_null
    //   14469: athrow
    //   14470: aconst_null
    //   14471: athrow
    //   14472: aconst_null
    //   14473: athrow
    //   14474: aconst_null
    //   14475: athrow
    //   14476: aconst_null
    //   14477: athrow
    //   14478: aconst_null
    //   14479: athrow
    //   14480: aconst_null
    //   14481: athrow
    //   14482: aconst_null
    //   14483: athrow
    //   14484: aconst_null
    //   14485: athrow
    //   14486: aconst_null
    //   14487: athrow
    //   14488: aconst_null
    //   14489: athrow
    //   14490: aconst_null
    //   14491: athrow
    //   14492: aconst_null
    //   14493: athrow
    //   14494: aconst_null
    //   14495: athrow
    //   14496: aconst_null
    //   14497: athrow
    //   14498: aconst_null
    //   14499: athrow
    //   14500: aconst_null
    //   14501: athrow
    //   14502: aconst_null
    //   14503: athrow
    //   14504: aconst_null
    //   14505: athrow
    //   14506: aconst_null
    //   14507: athrow
    //   14508: aconst_null
    //   14509: athrow
    //   14510: aconst_null
    //   14511: athrow
    //   14512: aconst_null
    //   14513: athrow
    //   14514: aconst_null
    //   14515: athrow
    //   14516: aconst_null
    //   14517: athrow
    //   14518: aconst_null
    //   14519: athrow
    //   14520: aconst_null
    //   14521: athrow
    //   14522: aconst_null
    //   14523: athrow
    //   14524: aconst_null
    //   14525: athrow
    //   14526: aconst_null
    //   14527: athrow
    //   14528: aconst_null
    //   14529: athrow
    //   14530: aconst_null
    //   14531: athrow
    //   14532: aconst_null
    //   14533: athrow
    //   14534: aconst_null
    //   14535: athrow
    //   14536: aconst_null
    //   14537: athrow
    //   14538: aconst_null
    //   14539: athrow
    //   14540: aconst_null
    //   14541: athrow
    //   14542: aconst_null
    //   14543: athrow
    //   14544: aconst_null
    //   14545: athrow
    //   14546: aconst_null
    //   14547: athrow
    //   14548: aconst_null
    //   14549: athrow
    //   14550: aconst_null
    //   14551: athrow
    //   14552: aconst_null
    //   14553: athrow
    //   14554: aconst_null
    //   14555: athrow
    //   14556: aconst_null
    //   14557: athrow
    //   14558: aconst_null
    //   14559: athrow
    //   14560: aconst_null
    //   14561: athrow
    //   14562: aconst_null
    //   14563: athrow
    //   14564: aconst_null
    //   14565: athrow
    //   14566: aconst_null
    //   14567: athrow
    //   14568: aconst_null
    //   14569: athrow
    //   14570: aconst_null
    //   14571: athrow
    //   14572: aconst_null
    //   14573: athrow
    //   14574: aconst_null
    //   14575: athrow
    //   14576: aconst_null
    //   14577: athrow
    //   14578: aconst_null
    //   14579: athrow
    //   14580: aconst_null
    //   14581: athrow
    //   14582: aconst_null
    //   14583: athrow
    //   14584: aconst_null
    //   14585: athrow
    //   14586: aconst_null
    //   14587: athrow
    //   14588: aconst_null
    //   14589: athrow
    //   14590: aconst_null
    //   14591: athrow
    //   14592: aconst_null
    //   14593: athrow
    //   14594: aconst_null
    //   14595: athrow
    //   14596: aconst_null
    //   14597: athrow
    //   14598: aconst_null
    //   14599: athrow
    //   14600: aconst_null
    //   14601: athrow
    //   14602: aconst_null
    //   14603: athrow
    //   14604: aconst_null
    //   14605: athrow
    //   14606: aconst_null
    //   14607: athrow
    //   14608: aconst_null
    //   14609: athrow
    //   14610: aconst_null
    //   14611: athrow
    //   14612: aconst_null
    //   14613: athrow
    //   14614: aconst_null
    //   14615: athrow
    //   14616: aconst_null
    //   14617: athrow
    //   14618: aconst_null
    //   14619: athrow
    //   14620: aconst_null
    //   14621: athrow
    //   14622: aconst_null
    //   14623: athrow
    //   14624: aconst_null
    //   14625: athrow
    //   14626: aconst_null
    //   14627: athrow
    //   14628: aconst_null
    //   14629: athrow
    //   14630: aconst_null
    //   14631: athrow
    //   14632: aconst_null
    //   14633: athrow
    //   14634: aconst_null
    //   14635: athrow
    //   14636: aconst_null
    //   14637: athrow
    //   14638: aconst_null
    //   14639: athrow
    //   14640: aconst_null
    //   14641: athrow
    //   14642: aconst_null
    //   14643: athrow
    //   14644: aconst_null
    //   14645: athrow
    //   14646: aconst_null
    //   14647: athrow
    //   14648: aconst_null
    //   14649: athrow
    //   14650: aconst_null
    //   14651: athrow
    //   14652: aconst_null
    //   14653: athrow
    //   14654: aconst_null
    //   14655: athrow
    //   14656: aconst_null
    //   14657: athrow
    //   14658: aconst_null
    //   14659: athrow
    //   14660: aconst_null
    //   14661: athrow
    //   14662: aconst_null
    //   14663: athrow
    //   14664: aconst_null
    //   14665: athrow
    //   14666: aconst_null
    //   14667: athrow
    //   14668: aconst_null
    //   14669: athrow
    //   14670: aconst_null
    //   14671: athrow
    //   14672: aconst_null
    //   14673: athrow
    //   14674: aconst_null
    //   14675: athrow
    //   14676: aconst_null
    //   14677: athrow
    //   14678: aconst_null
    //   14679: athrow
    //   14680: aconst_null
    //   14681: athrow
    //   14682: aconst_null
    //   14683: athrow
    //   14684: aconst_null
    //   14685: athrow
    //   14686: aconst_null
    //   14687: athrow
    //   14688: aconst_null
    //   14689: athrow
    //   14690: aconst_null
    //   14691: athrow
    //   14692: aconst_null
    //   14693: athrow
    //   14694: aconst_null
    //   14695: athrow
    //   14696: aconst_null
    //   14697: athrow
    //   14698: aconst_null
    //   14699: athrow
    //   14700: aconst_null
    //   14701: athrow
    //   14702: aconst_null
    //   14703: athrow
    //   14704: aconst_null
    //   14705: athrow
    //   14706: aconst_null
    //   14707: athrow
    //   14708: aconst_null
    //   14709: athrow
    //   14710: aconst_null
    //   14711: athrow
    //   14712: aconst_null
    //   14713: athrow
    //   14714: aconst_null
    //   14715: athrow
    //   14716: aconst_null
    //   14717: athrow
    //   14718: aconst_null
    //   14719: athrow
    //   14720: aconst_null
    //   14721: athrow
    //   14722: aconst_null
    //   14723: athrow
    //   14724: aconst_null
    //   14725: athrow
    //   14726: aconst_null
    //   14727: athrow
    //   14728: aconst_null
    //   14729: athrow
    //   14730: aconst_null
    //   14731: athrow
    //   14732: aconst_null
    //   14733: athrow
    //   14734: aconst_null
    //   14735: athrow
    //   14736: aconst_null
    //   14737: athrow
    //   14738: aconst_null
    //   14739: athrow
    //   14740: aconst_null
    //   14741: athrow
    //   14742: aconst_null
    //   14743: athrow
    //   14744: aconst_null
    //   14745: athrow
    //   14746: aconst_null
    //   14747: athrow
    //   14748: aconst_null
    //   14749: athrow
    //   14750: aconst_null
    //   14751: athrow
    //   14752: aconst_null
    //   14753: athrow
    //   14754: aconst_null
    //   14755: athrow
    //   14756: aconst_null
    //   14757: athrow
    //   14758: aconst_null
    //   14759: athrow
    //   14760: aconst_null
    //   14761: athrow
    //   14762: aconst_null
    //   14763: athrow
    //   14764: aconst_null
    //   14765: athrow
    //   14766: aconst_null
    //   14767: athrow
    //   14768: aconst_null
    //   14769: athrow
    //   14770: aconst_null
    //   14771: athrow
    //   14772: aconst_null
    //   14773: athrow
    //   14774: aconst_null
    //   14775: athrow
    //   14776: aconst_null
    //   14777: athrow
    //   14778: aconst_null
    //   14779: athrow
    //   14780: aconst_null
    //   14781: athrow
    //   14782: aconst_null
    //   14783: athrow
    //   14784: aconst_null
    //   14785: athrow
    //   14786: aconst_null
    //   14787: athrow
    //   14788: aconst_null
    //   14789: athrow
    //   14790: aconst_null
    //   14791: athrow
    //   14792: aconst_null
    //   14793: athrow
    //   14794: aconst_null
    //   14795: athrow
    //   14796: aconst_null
    //   14797: athrow
    //   14798: aconst_null
    //   14799: athrow
    //   14800: aconst_null
    //   14801: athrow
    //   14802: aconst_null
    //   14803: athrow
    //   14804: aconst_null
    //   14805: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	14372	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;
  }
  
  public void placeBlock(BlockPos pos) {
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
  
  public void onTick() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 321
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 313
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 305
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1048805250
    //   33: l2i
    //   34: ldc_w 384196808
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1636282350
    //   44: l2i
    //   45: ldc_w -494574795
    //   48: ixor
    //   49: ldc2_w 1871457055
    //   52: l2i
    //   53: ldc_w 865935457
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1545536524 -> 41, 1953764404 -> 290
    //   84: aload_0
    //   85: ldc2_w 776005844
    //   88: l2i
    //   89: ldc_w 776005844
    //   92: ixor
    //   93: getstatic Perryc.0 : I
    //   96: ifle -> 110
    //   99: ldc2_w 833715118
    //   102: l2i
    //   103: ldc_w -770438966
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w -1118422197
    //   113: l2i
    //   114: ldc_w 1301653370
    //   117: ixor
    //   118: ldc2_w 1552321681
    //   121: l2i
    //   122: ldc_w -1461002134
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 292, 78639306 -> 152, 399056799 -> 110
    //   152: putfield smartRotate : Z
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w -1121655512
    //   164: l2i
    //   165: ldc_w -1041795785
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 798921079
    //   175: l2i
    //   176: ldc_w 1270034331
    //   179: ixor
    //   180: ldc2_w -716762260
    //   183: l2i
    //   184: ldc_w -1594973010
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, -1310292267 -> 172, 157951965 -> 294
    //   216: aload_0
    //   217: getstatic Perryc.1 : I
    //   220: ifeq -> 234
    //   223: ldc2_w -869828183
    //   226: l2i
    //   227: ldc_w 1495768660
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 260461245
    //   237: l2i
    //   238: ldc_w -1287538214
    //   241: ixor
    //   242: ldc2_w 750058455
    //   245: l2i
    //   246: ldc_w -825415525
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -104447500 -> 234, 2004432049 -> 288
    //   276: goto -> 280
    //   279: athrow
    //   280: invokespecial doTrap : ()V
    //   283: goto -> 287
    //   286: athrow
    //   287: return
    //   288: aconst_null
    //   289: athrow
    //   290: aconst_null
    //   291: athrow
    //   292: aconst_null
    //   293: athrow
    //   294: aconst_null
    //   295: athrow
    //   296: pop
    //   297: goto -> 24
    //   300: pop
    //   301: aconst_null
    //   302: goto -> 296
    //   305: dup
    //   306: ifnull -> 296
    //   309: checkcast java/lang/Throwable
    //   312: athrow
    //   313: dup
    //   314: ifnull -> 300
    //   317: checkcast java/lang/Throwable
    //   320: athrow
    //   321: aconst_null
    //   322: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	264	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;
    // Exception table:
    //   from	to	target	type
    //   8	20	305	finally
    //   279	286	286	finally
    //   279	286	286	finally
    //   279	286	3	finally
    //   280	286	279	finally
    //   280	286	286	java/util/ConcurrentModificationException
    //   305	313	305	finally
    //   321	323	3	java/lang/NullPointerException
  }
  
  public boolean lambda$new$2(Integer paramInteger) {
    return Perry1.5r(this, (int)-799000546L ^ 0xF29C8739, paramInteger);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.1G(this, (int)-676613556L ^ 0xA37D71A1, paramObject);
  }
  
  public void onEnable() {
    Perry1.3w(this, (int)-1101263286L ^ 0x8B39C749);
  }
  
  public List getPlacements() {
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
  
  public boolean lambda$new$1(Integer paramInteger) {
    return Perry1.5o(this, (int)2134569797L ^ 0x41712E6B, paramInteger);
  }
  
  public boolean lambda$new$7(Boolean paramBoolean) {
    return Perry1.2v(this, (int)-26298627L ^ 0xB68CB459, paramBoolean);
  }
  
  public void doWebTrap() {
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
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.1I(this, (int)-290129117L ^ 0x8C77BD49, paramObject);
  }
  
  public static double lambda$placeList$15(Vec3d vec3d) {
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
  
  public boolean lambda$new$0(Boolean paramBoolean) {
    return Perry1.2l(this, (int)1383003282L ^ 0x69F81868, paramBoolean);
  }
  
  public boolean lambda$new$13(Float v) {
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
  
  public void doTrap() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 756
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 748
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 740
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -726060583
    //   33: l2i
    //   34: ldc_w 2105238475
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -230432028
    //   44: l2i
    //   45: ldc_w -51169227
    //   48: ixor
    //   49: ldc2_w -981927639
    //   52: l2i
    //   53: ldc_w 1705786106
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 719, -1369171710 -> 84, 152474049 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -901850420
    //   94: l2i
    //   95: ldc_w -584121782
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1055417674
    //   105: l2i
    //   106: ldc_w -1758966287
    //   109: ixor
    //   110: ldc2_w 102086525
    //   113: l2i
    //   114: ldc_w -611943083
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -917964394 -> 102, -897445202 -> 713
    //   144: goto -> 148
    //   147: athrow
    //   148: invokespecial check : ()Z
    //   151: goto -> 155
    //   154: athrow
    //   155: ifeq -> 169
    //   158: ldc2_w -715497970
    //   161: l2i
    //   162: ldc_w 176570751
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w 1934686263
    //   172: l2i
    //   173: ldc_w -1400051897
    //   176: ixor
    //   177: ldc2_w -382643663
    //   180: l2i
    //   181: ldc_w -2122777522
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, -1214926578 -> 208, -1214926577 -> 209
    //   208: return
    //   209: getstatic Perryc.0 : I
    //   212: ifle -> 226
    //   215: ldc2_w 1108405350
    //   218: l2i
    //   219: ldc_w 1006482470
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -1007652807
    //   229: l2i
    //   230: ldc_w -2064564343
    //   233: ixor
    //   234: ldc2_w 771174068
    //   237: l2i
    //   238: ldc_w -1242846663
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -1945126829 -> 226, -504242995 -> 729
    //   268: aload_0
    //   269: getstatic Perryc.0 : I
    //   272: ifle -> 286
    //   275: ldc2_w -1229540782
    //   278: l2i
    //   279: ldc_w -1927886692
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w -1950628191
    //   289: l2i
    //   290: ldc_w -501604206
    //   293: ixor
    //   294: ldc2_w 1244390373
    //   297: l2i
    //   298: ldc_w 1353195533
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 725, 555989286 -> 286, 1931617755 -> 328
    //   328: goto -> 332
    //   331: athrow
    //   332: invokespecial doWebTrap : ()V
    //   335: goto -> 339
    //   338: athrow
    //   339: getstatic Perryc.c : I
    //   342: iflt -> 356
    //   345: ldc2_w -879786244
    //   348: l2i
    //   349: ldc_w -331990125
    //   352: ixor
    //   353: goto -> 364
    //   356: ldc2_w -265954222
    //   359: l2i
    //   360: ldc_w -352196080
    //   363: ixor
    //   364: ldc2_w 59241479
    //   367: l2i
    //   368: ldc_w -2076142855
    //   371: ixor
    //   372: ixor
    //   373: lookupswitch default -> 400, -1602298991 -> 721, -1503666977 -> 356
    //   400: aload_0
    //   401: getstatic Perryc.c : I
    //   404: iflt -> 418
    //   407: ldc2_w 783259336
    //   410: l2i
    //   411: ldc_w -1563394897
    //   414: ixor
    //   415: goto -> 426
    //   418: ldc2_w 661268800
    //   421: l2i
    //   422: ldc_w -161717425
    //   425: ixor
    //   426: ldc2_w 335851230
    //   429: l2i
    //   430: ldc_w -201091038
    //   433: ixor
    //   434: ixor
    //   435: lookupswitch default -> 723, 825326835 -> 460, 1819860123 -> 418
    //   460: getfield didPlace : Z
    //   463: ifeq -> 477
    //   466: ldc2_w -612931893
    //   469: l2i
    //   470: ldc_w -970408381
    //   473: ixor
    //   474: goto -> 485
    //   477: ldc2_w 1959924000
    //   480: l2i
    //   481: ldc_w 1770899883
    //   484: ixor
    //   485: ldc2_w -317376150
    //   488: l2i
    //   489: ldc_w 1836060251
    //   492: ixor
    //   493: ixor
    //   494: tableswitch default -> 466, -1657081927 -> 516, -1657081926 -> 712
    //   516: getstatic Perryc.1 : I
    //   519: ifeq -> 533
    //   522: ldc2_w 1249576937
    //   525: l2i
    //   526: ldc_w 1006438119
    //   529: ixor
    //   530: goto -> 541
    //   533: ldc2_w -1220997085
    //   536: l2i
    //   537: ldc_w -1308627822
    //   540: ixor
    //   541: ldc2_w 1254995162
    //   544: l2i
    //   545: ldc_w 1943200498
    //   548: ixor
    //   549: ixor
    //   550: lookupswitch default -> 717, 1071229593 -> 576, 1218008870 -> 533
    //   576: aload_0
    //   577: getstatic Perryc.1 : I
    //   580: ifeq -> 594
    //   583: ldc2_w 2009123755
    //   586: l2i
    //   587: ldc_w -1666097553
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w -1359708513
    //   597: l2i
    //   598: ldc_w 1620335682
    //   601: ixor
    //   602: ldc2_w -871824911
    //   605: l2i
    //   606: ldc_w -2116831815
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 636, -1498734196 -> 727, -390355203 -> 594
    //   636: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   639: getstatic Perryc.1 : I
    //   642: ifeq -> 656
    //   645: ldc2_w 1948615025
    //   648: l2i
    //   649: ldc_w 1193600927
    //   652: ixor
    //   653: goto -> 664
    //   656: ldc2_w -150721398
    //   659: l2i
    //   660: ldc_w 786879962
    //   663: ixor
    //   664: ldc2_w -1375380804
    //   667: l2i
    //   668: ldc_w -887914695
    //   671: ixor
    //   672: ixor
    //   673: lookupswitch default -> 700, -1323052451 -> 656, 1444365163 -> 715
    //   700: goto -> 704
    //   703: athrow
    //   704: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   707: goto -> 711
    //   710: athrow
    //   711: pop
    //   712: return
    //   713: aconst_null
    //   714: athrow
    //   715: aconst_null
    //   716: athrow
    //   717: aconst_null
    //   718: athrow
    //   719: aconst_null
    //   720: athrow
    //   721: aconst_null
    //   722: athrow
    //   723: aconst_null
    //   724: athrow
    //   725: aconst_null
    //   726: athrow
    //   727: aconst_null
    //   728: athrow
    //   729: aconst_null
    //   730: athrow
    //   731: pop
    //   732: goto -> 24
    //   735: pop
    //   736: aconst_null
    //   737: goto -> 731
    //   740: dup
    //   741: ifnull -> 731
    //   744: checkcast java/lang/Throwable
    //   747: athrow
    //   748: dup
    //   749: ifnull -> 735
    //   752: checkcast java/lang/Throwable
    //   755: athrow
    //   756: aconst_null
    //   757: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	689	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;
    // Exception table:
    //   from	to	target	type
    //   8	20	740	finally
    //   147	154	154	finally
    //   147	154	147	java/lang/IndexOutOfBoundsException
    //   147	154	3	finally
    //   148	154	154	finally
    //   148	154	147	finally
    //   332	338	338	finally
    //   332	338	338	finally
    //   332	338	338	java/lang/IllegalArgumentException
    //   332	338	3	finally
    //   332	338	338	finally
    //   703	710	710	finally
    //   703	710	710	java/util/NoSuchElementException
    //   703	710	703	finally
    //   703	710	710	java/lang/IllegalArgumentException
    //   704	710	703	java/lang/UnsupportedOperationException
    //   740	748	740	java/lang/ArithmeticException
    //   756	758	3	finally
  }
  
  public static int lambda$placeList$14(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return Perry1.0P(null, (int)-1502189547L ^ 0xB0B9D51D, paramVec3d1, paramVec3d2);
  }
  
  public void onDisable() {
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
  
  public EntityPlayer getTarget(double paramDouble) {
    return Perry1.4U(this, (int)-294588504L ^ 0xA07DA093, paramDouble);
  }
  
  public void placeList(List<Vec3d> list) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2350
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2342
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2334
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1025378237
    //   33: l2i
    //   34: ldc_w -534335503
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1322095554
    //   44: l2i
    //   45: ldc_w -558315229
    //   48: ixor
    //   49: ldc2_w -1635302060
    //   52: l2i
    //   53: ldc_w -626485775
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2267, 732263864 -> 84, 1726514967 -> 41
    //   84: aload_1
    //   85: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   90: getstatic Perryc.1 : I
    //   93: ifeq -> 107
    //   96: ldc2_w 347673728
    //   99: l2i
    //   100: ldc_w -1956348151
    //   103: ixor
    //   104: goto -> 115
    //   107: ldc2_w -1716855041
    //   110: l2i
    //   111: ldc_w -464264183
    //   114: ixor
    //   115: ldc2_w 78809816
    //   118: l2i
    //   119: ldc_w -1440739122
    //   122: ixor
    //   123: ixor
    //   124: lookupswitch default -> 152, 827322783 -> 2269, 1322974370 -> 107
    //   152: goto -> 156
    //   155: athrow
    //   156: invokeinterface sort : (Ljava/util/Comparator;)V
    //   161: goto -> 165
    //   164: athrow
    //   165: getstatic Perryc.1 : I
    //   168: ifeq -> 182
    //   171: ldc2_w -2092347781
    //   174: l2i
    //   175: ldc_w -1315544549
    //   178: ixor
    //   179: goto -> 190
    //   182: ldc2_w -1967261949
    //   185: l2i
    //   186: ldc_w -708797851
    //   189: ixor
    //   190: ldc2_w 882526523
    //   193: l2i
    //   194: ldc_w -1470662196
    //   197: ixor
    //   198: ixor
    //   199: lookupswitch default -> 224, -1374544745 -> 2265, -499375578 -> 182
    //   224: aload_1
    //   225: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
    //   230: getstatic Perryc.c : I
    //   233: iflt -> 247
    //   236: ldc2_w 1056043232
    //   239: l2i
    //   240: ldc_w 1805167704
    //   243: ixor
    //   244: goto -> 255
    //   247: ldc2_w 442604719
    //   250: l2i
    //   251: ldc_w 150243225
    //   254: ixor
    //   255: ldc2_w 1606572118
    //   258: l2i
    //   259: ldc_w 131187744
    //   262: ixor
    //   263: ixor
    //   264: lookupswitch default -> 292, -2064387952 -> 247, 226148558 -> 2293
    //   292: goto -> 296
    //   295: athrow
    //   296: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
    //   299: goto -> 303
    //   302: athrow
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 320
    //   309: ldc2_w 439874041
    //   312: l2i
    //   313: ldc_w 1806302041
    //   316: ixor
    //   317: goto -> 328
    //   320: ldc2_w -466614959
    //   323: l2i
    //   324: ldc_w 405424214
    //   327: ixor
    //   328: ldc2_w 1853359417
    //   331: l2i
    //   332: ldc_w 1298176680
    //   335: ixor
    //   336: ixor
    //   337: lookupswitch default -> 364, -1294504727 -> 320, 1384551729 -> 2321
    //   364: goto -> 368
    //   367: athrow
    //   368: invokeinterface sort : (Ljava/util/Comparator;)V
    //   373: goto -> 377
    //   376: athrow
    //   377: getstatic Perryc.0 : I
    //   380: ifle -> 394
    //   383: ldc2_w -1996562706
    //   386: l2i
    //   387: ldc_w -1321887838
    //   390: ixor
    //   391: goto -> 402
    //   394: ldc2_w -382865292
    //   397: l2i
    //   398: ldc_w -99561930
    //   401: ixor
    //   402: ldc2_w 390550430
    //   405: l2i
    //   406: ldc_w -318268603
    //   409: ixor
    //   410: ixor
    //   411: lookupswitch default -> 2275, -1014267497 -> 394, -377620839 -> 436
    //   436: aload_1
    //   437: getstatic Perryc.c : I
    //   440: iflt -> 454
    //   443: ldc2_w -1608618316
    //   446: l2i
    //   447: ldc_w -2066798039
    //   450: ixor
    //   451: goto -> 462
    //   454: ldc2_w 373020105
    //   457: l2i
    //   458: ldc_w 1341174265
    //   461: ixor
    //   462: ldc2_w -1124669863
    //   465: l2i
    //   466: ldc_w 346558291
    //   469: ixor
    //   470: ixor
    //   471: lookupswitch default -> 496, -1936740969 -> 2287, -784535236 -> 454
    //   496: goto -> 500
    //   499: athrow
    //   500: invokeinterface iterator : ()Ljava/util/Iterator;
    //   505: goto -> 509
    //   508: athrow
    //   509: getstatic Perryc.c : I
    //   512: iflt -> 526
    //   515: ldc2_w -917057102
    //   518: l2i
    //   519: ldc_w 837601597
    //   522: ixor
    //   523: goto -> 534
    //   526: ldc2_w 1201896464
    //   529: l2i
    //   530: ldc_w -1607088219
    //   533: ixor
    //   534: ldc2_w 602095291
    //   537: l2i
    //   538: ldc_w 1953690545
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 2319, -1356081787 -> 526, -1341688129 -> 568
    //   568: astore_2
    //   569: getstatic Perryc.0 : I
    //   572: ifle -> 586
    //   575: ldc2_w -377580439
    //   578: l2i
    //   579: ldc_w -1335371560
    //   582: ixor
    //   583: goto -> 594
    //   586: ldc2_w -1664320032
    //   589: l2i
    //   590: ldc_w 929507459
    //   593: ixor
    //   594: ldc2_w 2028548459
    //   597: l2i
    //   598: ldc_w -1770891957
    //   601: ixor
    //   602: ixor
    //   603: lookupswitch default -> 628, -1216206703 -> 2277, 307366612 -> 586
    //   628: aload_2
    //   629: getstatic Perryc.0 : I
    //   632: ifle -> 646
    //   635: ldc2_w -441035725
    //   638: l2i
    //   639: ldc_w 469681092
    //   642: ixor
    //   643: goto -> 654
    //   646: ldc2_w -70878727
    //   649: l2i
    //   650: ldc_w 1471689627
    //   653: ixor
    //   654: ldc2_w 2004856679
    //   657: l2i
    //   658: ldc_w -2072030978
    //   661: ixor
    //   662: ixor
    //   663: lookupswitch default -> 688, 27184743 -> 646, 222849134 -> 2295
    //   688: goto -> 692
    //   691: athrow
    //   692: invokeinterface hasNext : ()Z
    //   697: goto -> 701
    //   700: athrow
    //   701: ifeq -> 715
    //   704: ldc2_w -356761920
    //   707: l2i
    //   708: ldc_w -2101459870
    //   711: ixor
    //   712: goto -> 723
    //   715: ldc2_w 1682242118
    //   718: l2i
    //   719: ldc_w 205947107
    //   722: ixor
    //   723: ldc2_w 481813353
    //   726: l2i
    //   727: ldc_w 2116157136
    //   730: ixor
    //   731: ixor
    //   732: tableswitch default -> 704, 177497883 -> 756, 177497884 -> 2262
    //   756: getstatic Perryc.0 : I
    //   759: ifle -> 773
    //   762: ldc2_w -980156662
    //   765: l2i
    //   766: ldc_w -1026391016
    //   769: ixor
    //   770: goto -> 781
    //   773: ldc2_w -506675486
    //   776: l2i
    //   777: ldc_w 470097613
    //   780: ixor
    //   781: ldc2_w -1435393479
    //   784: l2i
    //   785: ldc_w 1654152143
    //   788: ixor
    //   789: ixor
    //   790: lookupswitch default -> 816, -946156707 -> 773, -811040028 -> 2289
    //   816: aload_2
    //   817: getstatic Perryc.0 : I
    //   820: ifle -> 834
    //   823: ldc2_w -845728453
    //   826: l2i
    //   827: ldc_w 801848361
    //   830: ixor
    //   831: goto -> 842
    //   834: ldc2_w -784501147
    //   837: l2i
    //   838: ldc_w -289279310
    //   841: ixor
    //   842: ldc2_w 2104854889
    //   845: l2i
    //   846: ldc_w -1792545323
    //   849: ixor
    //   850: ixor
    //   851: lookupswitch default -> 2305, -676405141 -> 876, 168717742 -> 834
    //   876: goto -> 880
    //   879: athrow
    //   880: invokeinterface next : ()Ljava/lang/Object;
    //   885: goto -> 889
    //   888: athrow
    //   889: checkcast net/minecraft/util/math/Vec3d
    //   892: getstatic Perryc.0 : I
    //   895: ifle -> 909
    //   898: ldc2_w -1892210039
    //   901: l2i
    //   902: ldc_w -153218037
    //   905: ixor
    //   906: goto -> 917
    //   909: ldc2_w 797032854
    //   912: l2i
    //   913: ldc_w -1164731601
    //   916: ixor
    //   917: ldc2_w 1070402253
    //   920: l2i
    //   921: ldc_w -2121165747
    //   924: ixor
    //   925: ixor
    //   926: lookupswitch default -> 952, -944398334 -> 2291, 1842312884 -> 909
    //   952: astore_3
    //   953: new net/minecraft/util/math/BlockPos
    //   956: dup
    //   957: getstatic Perryc.0 : I
    //   960: ifle -> 974
    //   963: ldc2_w -507121460
    //   966: l2i
    //   967: ldc_w -87774525
    //   970: ixor
    //   971: goto -> 982
    //   974: ldc2_w 873458140
    //   977: l2i
    //   978: ldc_w 1009817843
    //   981: ixor
    //   982: ldc2_w 1246034312
    //   985: l2i
    //   986: ldc_w -819884146
    //   989: ixor
    //   990: ixor
    //   991: lookupswitch default -> 1016, -1637602295 -> 2279, 1876295330 -> 974
    //   1016: aload_3
    //   1017: getstatic Perryc.1 : I
    //   1020: ifeq -> 1034
    //   1023: ldc2_w -1410459920
    //   1026: l2i
    //   1027: ldc_w 1373327491
    //   1030: ixor
    //   1031: goto -> 1042
    //   1034: ldc2_w -438433724
    //   1037: l2i
    //   1038: ldc_w -520206015
    //   1041: ixor
    //   1042: ldc2_w 895228137
    //   1045: l2i
    //   1046: ldc_w -1719954699
    //   1049: ixor
    //   1050: ixor
    //   1051: lookupswitch default -> 2313, -1459107047 -> 1076, 1444072559 -> 1034
    //   1076: goto -> 1080
    //   1079: athrow
    //   1080: invokespecial <init> : (Lnet/minecraft/util/math/Vec3d;)V
    //   1083: goto -> 1087
    //   1086: athrow
    //   1087: getstatic Perryc.0 : I
    //   1090: ifle -> 1104
    //   1093: ldc2_w -1670484234
    //   1096: l2i
    //   1097: ldc_w 993948769
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w -1184860522
    //   1107: l2i
    //   1108: ldc_w -1188635043
    //   1111: ixor
    //   1112: ldc2_w 1795691707
    //   1115: l2i
    //   1116: ldc_w -1748154878
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 2307, -58459534 -> 1148, 1536509998 -> 1104
    //   1148: astore #4
    //   1150: getstatic Perryc.1 : I
    //   1153: ifeq -> 1167
    //   1156: ldc2_w -686195779
    //   1159: l2i
    //   1160: ldc_w -338551256
    //   1163: ixor
    //   1164: goto -> 1175
    //   1167: ldc2_w -842464258
    //   1170: l2i
    //   1171: ldc_w -222493935
    //   1174: ixor
    //   1175: ldc2_w 587443408
    //   1178: l2i
    //   1179: ldc_w -402326525
    //   1182: ixor
    //   1183: ixor
    //   1184: lookupswitch default -> 2271, -193769412 -> 1212, -137611962 -> 1167
    //   1212: aload_0
    //   1213: getstatic Perryc.0 : I
    //   1216: ifle -> 1230
    //   1219: ldc2_w 1003675906
    //   1222: l2i
    //   1223: ldc_w -1113113473
    //   1226: ixor
    //   1227: goto -> 1238
    //   1230: ldc2_w -890031206
    //   1233: l2i
    //   1234: ldc_w 1376690550
    //   1237: ixor
    //   1238: ldc2_w -1544080406
    //   1241: l2i
    //   1242: ldc_w 1558930302
    //   1245: ixor
    //   1246: ixor
    //   1247: lookupswitch default -> 1272, 1063987013 -> 1230, 2036960745 -> 2303
    //   1272: aload #4
    //   1274: getstatic Perryc.1 : I
    //   1277: ifeq -> 1291
    //   1280: ldc2_w -1533931225
    //   1283: l2i
    //   1284: ldc_w -1095591580
    //   1287: ixor
    //   1288: goto -> 1299
    //   1291: ldc2_w -584509647
    //   1294: l2i
    //   1295: ldc_w 39314526
    //   1298: ixor
    //   1299: ldc2_w -1435013443
    //   1302: l2i
    //   1303: ldc_w -1712544485
    //   1306: ixor
    //   1307: ixor
    //   1308: lookupswitch default -> 1336, -1397416138 -> 1291, 700138469 -> 2299
    //   1336: putfield renderPos : Lnet/minecraft/util/math/BlockPos;
    //   1339: getstatic Perryc.1 : I
    //   1342: ifeq -> 1356
    //   1345: ldc2_w -1489310305
    //   1348: l2i
    //   1349: ldc_w -906960998
    //   1352: ixor
    //   1353: goto -> 1364
    //   1356: ldc2_w 1475018757
    //   1359: l2i
    //   1360: ldc_w 225954538
    //   1363: ixor
    //   1364: ldc2_w -882871314
    //   1367: l2i
    //   1368: ldc_w 370821316
    //   1371: ixor
    //   1372: ixor
    //   1373: lookupswitch default -> 1400, -1280308945 -> 2309, -746453079 -> 1356
    //   1400: aload #4
    //   1402: getstatic Perryc.c : I
    //   1405: iflt -> 1419
    //   1408: ldc2_w -798773552
    //   1411: l2i
    //   1412: ldc_w -1717010283
    //   1415: ixor
    //   1416: goto -> 1427
    //   1419: ldc2_w -260305902
    //   1422: l2i
    //   1423: ldc_w 1449515318
    //   1426: ixor
    //   1427: ldc2_w 242509294
    //   1430: l2i
    //   1431: ldc_w 1078830479
    //   1434: ixor
    //   1435: ixor
    //   1436: lookupswitch default -> 2263, -400550587 -> 1464, 133361188 -> 1419
    //   1464: aload_0
    //   1465: getstatic Perryc.1 : I
    //   1468: ifeq -> 1482
    //   1471: ldc2_w -1569849315
    //   1474: l2i
    //   1475: ldc_w 2054948615
    //   1478: ixor
    //   1479: goto -> 1490
    //   1482: ldc2_w -1620153774
    //   1485: l2i
    //   1486: ldc_w -490043027
    //   1489: ixor
    //   1490: ldc2_w -2034886685
    //   1493: l2i
    //   1494: ldc_w -1571246059
    //   1497: ixor
    //   1498: ixor
    //   1499: lookupswitch default -> 1524, -1467275298 -> 1482, -50552596 -> 2301
    //   1524: getfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1527: getstatic Perryc.0 : I
    //   1530: ifle -> 1544
    //   1533: ldc2_w 877604656
    //   1536: l2i
    //   1537: ldc_w -1033720985
    //   1540: ixor
    //   1541: goto -> 1552
    //   1544: ldc2_w -387318915
    //   1547: l2i
    //   1548: ldc_w 1331838582
    //   1551: ixor
    //   1552: ldc2_w 723011383
    //   1555: l2i
    //   1556: ldc_w -130772903
    //   1559: ixor
    //   1560: ixor
    //   1561: lookupswitch default -> 1588, -2070933861 -> 1544, 620843833 -> 2317
    //   1588: goto -> 1592
    //   1591: athrow
    //   1592: invokevirtual getValue : ()Ljava/lang/Object;
    //   1595: goto -> 1599
    //   1598: athrow
    //   1599: checkcast java/lang/Boolean
    //   1602: getstatic Perryc.c : I
    //   1605: iflt -> 1619
    //   1608: ldc2_w -1714520467
    //   1611: l2i
    //   1612: ldc_w 550739607
    //   1615: ixor
    //   1616: goto -> 1627
    //   1619: ldc2_w -92747200
    //   1622: l2i
    //   1623: ldc_w 709483560
    //   1626: ixor
    //   1627: ldc2_w -1715675222
    //   1630: l2i
    //   1631: ldc_w 1430201184
    //   1634: ixor
    //   1635: ixor
    //   1636: lookupswitch default -> 2315, 481487522 -> 1664, 1973296176 -> 1619
    //   1664: goto -> 1668
    //   1667: athrow
    //   1668: invokevirtual booleanValue : ()Z
    //   1671: goto -> 1675
    //   1674: athrow
    //   1675: getstatic Perryc.c : I
    //   1678: iflt -> 1692
    //   1681: ldc2_w -1468890773
    //   1684: l2i
    //   1685: ldc_w 1488451806
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w -1608726622
    //   1695: l2i
    //   1696: ldc_w -670778304
    //   1699: ixor
    //   1700: ldc2_w -338441448
    //   1703: l2i
    //   1704: ldc_w 428351428
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 2297, -1975275714 -> 1736, 43953513 -> 1692
    //   1736: goto -> 1740
    //   1739: athrow
    //   1740: invokestatic isPositionPlaceable : (Lnet/minecraft/util/math/BlockPos;Z)I
    //   1743: goto -> 1747
    //   1746: athrow
    //   1747: getstatic Perryc.0 : I
    //   1750: ifle -> 1764
    //   1753: ldc2_w 1814267853
    //   1756: l2i
    //   1757: ldc_w 277312882
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w -1630902890
    //   1767: l2i
    //   1768: ldc_w -148968803
    //   1771: ixor
    //   1772: ldc2_w 1548090006
    //   1775: l2i
    //   1776: ldc_w -1077956784
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 2323, -1976640819 -> 1808, -1621186695 -> 1764
    //   1808: istore #5
    //   1810: getstatic Perryc.c : I
    //   1813: iflt -> 1827
    //   1816: ldc2_w 1134616004
    //   1819: l2i
    //   1820: ldc_w 2094200625
    //   1823: ixor
    //   1824: goto -> 1835
    //   1827: ldc2_w 1648644413
    //   1830: l2i
    //   1831: ldc_w 1416241792
    //   1834: ixor
    //   1835: ldc2_w 4401018
    //   1838: l2i
    //   1839: ldc_w -593486685
    //   1842: ixor
    //   1843: ixor
    //   1844: lookupswitch default -> 1872, -477032148 -> 2273, 40975664 -> 1827
    //   1872: iload #5
    //   1874: ldc2_w 862041402
    //   1877: l2i
    //   1878: ldc_w 862041401
    //   1881: ixor
    //   1882: if_icmpeq -> 1896
    //   1885: ldc2_w 702246008
    //   1888: l2i
    //   1889: ldc_w 38550999
    //   1892: ixor
    //   1893: goto -> 1904
    //   1896: ldc2_w -232871130
    //   1899: l2i
    //   1900: ldc_w -645268856
    //   1903: ixor
    //   1904: ldc2_w 171046986
    //   1907: l2i
    //   1908: ldc_w 1232759253
    //   1911: ixor
    //   1912: ixor
    //   1913: tableswitch default -> 1885, 1759297584 -> 1936, 1759297585 -> 2063
    //   1936: getstatic Perryc.c : I
    //   1939: iflt -> 1953
    //   1942: ldc2_w 1613618199
    //   1945: l2i
    //   1946: ldc_w -1025632817
    //   1949: ixor
    //   1950: goto -> 1961
    //   1953: ldc2_w 59891039
    //   1956: l2i
    //   1957: ldc_w 1851012489
    //   1960: ixor
    //   1961: ldc2_w 334684750
    //   1964: l2i
    //   1965: ldc_w 1836989339
    //   1968: ixor
    //   1969: ixor
    //   1970: lookupswitch default -> 1996, -675071446 -> 1953, -595652595 -> 2281
    //   1996: iload #5
    //   1998: ldc2_w 615782570
    //   2001: l2i
    //   2002: ldc_w 615782571
    //   2005: ixor
    //   2006: if_icmpeq -> 2020
    //   2009: ldc2_w -895112159
    //   2012: l2i
    //   2013: ldc_w -1522727713
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 1565321962
    //   2023: l2i
    //   2024: ldc_w 852771355
    //   2027: ixor
    //   2028: ldc2_w -2042733149
    //   2031: l2i
    //   2032: ldc_w -43530566
    //   2035: ixor
    //   2036: ixor
    //   2037: tableswitch default -> 2009, 348206055 -> 2060, 348206056 -> 2063
    //   2060: goto -> 569
    //   2063: getstatic Perryc.0 : I
    //   2066: ifle -> 2080
    //   2069: ldc2_w -1765385134
    //   2072: l2i
    //   2073: ldc_w 403781166
    //   2076: ixor
    //   2077: goto -> 2088
    //   2080: ldc2_w 1363803299
    //   2083: l2i
    //   2084: ldc_w -363034791
    //   2087: ixor
    //   2088: ldc2_w -1516389466
    //   2091: l2i
    //   2092: ldc_w -483460956
    //   2095: ixor
    //   2096: ixor
    //   2097: lookupswitch default -> 2285, -932959874 -> 2080, -39438088 -> 2124
    //   2124: aload_0
    //   2125: getstatic Perryc.0 : I
    //   2128: ifle -> 2142
    //   2131: ldc2_w -1272526662
    //   2134: l2i
    //   2135: ldc_w -1127007529
    //   2138: ixor
    //   2139: goto -> 2150
    //   2142: ldc2_w -1246981284
    //   2145: l2i
    //   2146: ldc_w -1204911014
    //   2149: ixor
    //   2150: ldc2_w 1092971613
    //   2153: l2i
    //   2154: ldc_w 21687037
    //   2157: ixor
    //   2158: ixor
    //   2159: lookupswitch default -> 2184, -1664690648 -> 2142, 1218081997 -> 2311
    //   2184: aload #4
    //   2186: getstatic Perryc.c : I
    //   2189: iflt -> 2203
    //   2192: ldc2_w 1467912439
    //   2195: l2i
    //   2196: ldc_w 1910858024
    //   2199: ixor
    //   2200: goto -> 2211
    //   2203: ldc2_w 1933980961
    //   2206: l2i
    //   2207: ldc_w 2144734832
    //   2210: ixor
    //   2211: ldc2_w 366905382
    //   2214: l2i
    //   2215: ldc_w -2107352888
    //   2218: ixor
    //   2219: ixor
    //   2220: lookupswitch default -> 2283, -1691685953 -> 2248, -1323228879 -> 2203
    //   2248: goto -> 2252
    //   2251: athrow
    //   2252: invokespecial placeBlock : (Lnet/minecraft/util/math/BlockPos;)V
    //   2255: goto -> 2259
    //   2258: athrow
    //   2259: goto -> 569
    //   2262: return
    //   2263: aconst_null
    //   2264: athrow
    //   2265: aconst_null
    //   2266: athrow
    //   2267: aconst_null
    //   2268: athrow
    //   2269: aconst_null
    //   2270: athrow
    //   2271: aconst_null
    //   2272: athrow
    //   2273: aconst_null
    //   2274: athrow
    //   2275: aconst_null
    //   2276: athrow
    //   2277: aconst_null
    //   2278: athrow
    //   2279: aconst_null
    //   2280: athrow
    //   2281: aconst_null
    //   2282: athrow
    //   2283: aconst_null
    //   2284: athrow
    //   2285: aconst_null
    //   2286: athrow
    //   2287: aconst_null
    //   2288: athrow
    //   2289: aconst_null
    //   2290: athrow
    //   2291: aconst_null
    //   2292: athrow
    //   2293: aconst_null
    //   2294: athrow
    //   2295: aconst_null
    //   2296: athrow
    //   2297: aconst_null
    //   2298: athrow
    //   2299: aconst_null
    //   2300: athrow
    //   2301: aconst_null
    //   2302: athrow
    //   2303: aconst_null
    //   2304: athrow
    //   2305: aconst_null
    //   2306: athrow
    //   2307: aconst_null
    //   2308: athrow
    //   2309: aconst_null
    //   2310: athrow
    //   2311: aconst_null
    //   2312: athrow
    //   2313: aconst_null
    //   2314: athrow
    //   2315: aconst_null
    //   2316: athrow
    //   2317: aconst_null
    //   2318: athrow
    //   2319: aconst_null
    //   2320: athrow
    //   2321: aconst_null
    //   2322: athrow
    //   2323: aconst_null
    //   2324: athrow
    //   2325: pop
    //   2326: goto -> 24
    //   2329: pop
    //   2330: aconst_null
    //   2331: goto -> 2325
    //   2334: dup
    //   2335: ifnull -> 2325
    //   2338: checkcast java/lang/Throwable
    //   2341: athrow
    //   2342: dup
    //   2343: ifnull -> 2329
    //   2346: checkcast java/lang/Throwable
    //   2349: athrow
    //   2350: aconst_null
    //   2351: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1150	1109	4	position	Lnet/minecraft/util/math/BlockPos;
    //   1810	449	5	placeability	I
    //   953	1306	3	vec3d3	Lnet/minecraft/util/math/Vec3d;
    //   24	2239	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoWeb;
    //   24	2239	1	list	Ljava/util/List;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	2239	1	list	Ljava/util/List<Lnet/minecraft/util/math/Vec3d;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2334	java/util/ConcurrentModificationException
    //   155	164	164	finally
    //   155	164	164	finally
    //   155	164	3	java/lang/IllegalStateException
    //   156	164	155	finally
    //   156	164	3	java/util/NoSuchElementException
    //   295	302	302	finally
    //   296	302	302	java/lang/NumberFormatException
    //   296	302	3	java/lang/UnsupportedOperationException
    //   296	302	3	finally
    //   296	302	295	java/lang/EnumConstantNotPresentException
    //   367	376	376	finally
    //   367	376	376	finally
    //   368	376	367	java/lang/AssertionError
    //   368	376	376	finally
    //   368	376	376	finally
    //   499	508	508	finally
    //   499	508	499	java/util/ConcurrentModificationException
    //   499	508	508	java/lang/ArrayIndexOutOfBoundsException
    //   500	508	508	finally
    //   500	508	3	java/lang/UnsupportedOperationException
    //   692	700	700	finally
    //   692	700	700	finally
    //   692	700	3	java/lang/IndexOutOfBoundsException
    //   692	700	700	java/lang/UnsupportedOperationException
    //   692	700	3	finally
    //   880	888	888	finally
    //   880	888	3	java/lang/EnumConstantNotPresentException
    //   880	888	888	finally
    //   880	888	3	finally
    //   880	888	3	java/lang/StringIndexOutOfBoundsException
    //   1079	1086	1086	finally
    //   1079	1086	1079	finally
    //   1079	1086	3	java/util/ConcurrentModificationException
    //   1080	1086	1086	finally
    //   1080	1086	1086	java/lang/IndexOutOfBoundsException
    //   1591	1598	1598	finally
    //   1591	1598	1598	java/lang/UnsupportedOperationException
    //   1591	1598	1598	java/lang/NegativeArraySizeException
    //   1592	1598	3	finally
    //   1592	1598	1591	finally
    //   1667	1674	1674	finally
    //   1667	1674	3	java/util/ConcurrentModificationException
    //   1667	1674	1667	finally
    //   1668	1674	3	finally
    //   1668	1674	3	finally
    //   1739	1746	1746	finally
    //   1739	1746	3	java/lang/IllegalStateException
    //   1739	1746	1739	java/lang/StringIndexOutOfBoundsException
    //   1739	1746	1746	finally
    //   1740	1746	3	finally
    //   2251	2258	2258	finally
    //   2251	2258	3	java/lang/ClassCastException
    //   2251	2258	2258	java/lang/ArrayIndexOutOfBoundsException
    //   2252	2258	2258	finally
    //   2252	2258	2251	finally
    //   2334	2342	2334	finally
    //   2350	2352	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public boolean lambda$new$5(Integer paramInteger) {
    return Perry1.5w(this, (int)296367603L ^ 0x7F94DE0E, paramInteger);
  }
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.1I(this, (int)-893238405L ^ 0xA8010516, paramObject);
  }
  
  public String getDisplayInfo() {
    return Perry1.k(this, (int)-1454351400L ^ 0x942D3A8F);
  }
  
  public boolean lambda$new$11(Boolean paramBoolean) {
    return Perry1.2m(this, (int)1210831600L ^ 0xA193D58, paramBoolean);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\AutoWeb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */