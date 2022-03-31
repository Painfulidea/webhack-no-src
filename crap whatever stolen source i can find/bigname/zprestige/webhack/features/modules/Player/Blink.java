package bigname.zprestige.webhack.features.modules.Player;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.Queue;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Blink extends Module {
  public Setting<Boolean> render;
  
  public int packetsCanceled;
  
  public Setting<Boolean> Rainbow;
  
  public BlockPos renderPosHead;
  
  public Setting<Integer> green;
  
  public EntityOtherPlayerMP entity;
  
  public Setting<Integer> cBlue;
  
  public Setting<Integer> blue;
  
  public Queue<Packet<?>> packets;
  
  public Setting<Integer> cGreen;
  
  public static Blink INSTANCE;
  
  public Setting<Boolean> cRainbow;
  
  public Setting<Float> lineWidth;
  
  public Setting<Boolean> outline;
  
  public Setting<Integer> cRed;
  
  public Setting<Boolean> box;
  
  public Setting<Boolean> cPacketPlayer;
  
  public BlockPos startPos;
  
  public Timer timer;
  
  public Setting<Integer> red;
  
  public Setting<Integer> cAlpha;
  
  public Setting<Integer> alpha;
  
  public Setting<Integer> boxAlpha;
  
  public boolean lambda$new$1(Integer paramInteger) {
    return Perry1.5j(this, (int)-954556521L ^ 0xF643E591, paramInteger);
  }
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.22(this, (int)1275089006L ^ 0x181CBBCC, paramObject);
  }
  
  public boolean lambda$new$7(Boolean paramBoolean) {
    return Perry1.2q(this, (int)-1267287172L ^ 0xB6B35502, paramBoolean);
  }
  
  public void onLogout() {
    Perry1.4b(this, (int)-910129899L ^ 0xA8A4CF62);
  }
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.28(this, (int)-471260149L ^ 0x85ED982B, paramObject);
  }
  
  public boolean lambda$new$5(Integer paramInteger) {
    return Perry1.5r(this, (int)-231253474L ^ 0xD0CBE53A, paramInteger);
  }
  
  public boolean lambda$new$3(Integer paramInteger) {
    return Perry1.5w(this, (int)1684171493L ^ 0xA5C811B, paramInteger);
  }
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.1M(this, (int)1559998220L ^ 0x28A6788C, paramObject);
  }
  
  public boolean lambda$new$11(Boolean paramBoolean) {
    return Perry1.2s(this, (int)-956238115L ^ 0xEF95BC15, paramBoolean);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5A(this, (int)1448161559L ^ 0x322C2E33, paramInteger);
  }
  
  public boolean lambda$new$4(Boolean paramBoolean) {
    return Perry1.2m(this, (int)-812903963L ^ 0x8DBEFE4E, paramBoolean);
  }
  
  @SubscribeEvent
  public void onSendPacket(PacketEvent.Send event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3399
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 3391
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3383
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 672538399
    //   33: l2i
    //   34: ldc -1050950390
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1979267719
    //   43: l2i
    //   44: ldc 244307997
    //   46: ixor
    //   47: ldc2_w -1541639345
    //   50: l2i
    //   51: ldc -839975416
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 3334, -2134943918 -> 40, 310669277 -> 80
    //   80: aload_1
    //   81: getstatic Perryc.c : I
    //   84: iflt -> 97
    //   87: ldc2_w 1652632339
    //   90: l2i
    //   91: ldc -598997178
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 309448351
    //   100: l2i
    //   101: ldc -1991322112
    //   103: ixor
    //   104: ldc2_w 167896151
    //   107: l2i
    //   108: ldc 1106783955
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 3344, -792276453 -> 140, -181082415 -> 97
    //   140: goto -> 144
    //   143: athrow
    //   144: invokevirtual getStage : ()I
    //   147: goto -> 151
    //   150: athrow
    //   151: ifne -> 164
    //   154: ldc2_w 164234508
    //   157: l2i
    //   158: ldc -1385895317
    //   160: ixor
    //   161: goto -> 171
    //   164: ldc2_w 127082004
    //   167: l2i
    //   168: ldc -1556221584
    //   170: ixor
    //   171: ldc2_w -1364238974
    //   174: l2i
    //   175: ldc 977713512
    //   177: ixor
    //   178: ixor
    //   179: tableswitch default -> 154, 809962381 -> 200, 809962382 -> 3291
    //   200: getstatic Perryc.c : I
    //   203: iflt -> 216
    //   206: ldc2_w 1643554237
    //   209: l2i
    //   210: ldc 1753527606
    //   212: ixor
    //   213: goto -> 223
    //   216: ldc2_w -375470832
    //   219: l2i
    //   220: ldc 1617477384
    //   222: ixor
    //   223: ldc2_w -78511827
    //   226: l2i
    //   227: ldc -213727449
    //   229: ixor
    //   230: ixor
    //   231: lookupswitch default -> 256, 23254657 -> 3318, 1986672235 -> 216
    //   256: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   259: getstatic Perryc.1 : I
    //   262: ifeq -> 275
    //   265: ldc2_w -162774114
    //   268: l2i
    //   269: ldc 321368153
    //   271: ixor
    //   272: goto -> 282
    //   275: ldc2_w -945899408
    //   278: l2i
    //   279: ldc 1033649324
    //   281: ixor
    //   282: ldc2_w 1116232480
    //   285: l2i
    //   286: ldc 1457723806
    //   288: ixor
    //   289: ixor
    //   290: lookupswitch default -> 316, -294426161 -> 275, -251612807 -> 3356
    //   316: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   319: ifnull -> 332
    //   322: ldc2_w 1971625623
    //   325: l2i
    //   326: ldc -1386243377
    //   328: ixor
    //   329: goto -> 339
    //   332: ldc2_w -190268622
    //   335: l2i
    //   336: ldc 745783145
    //   338: ixor
    //   339: ldc2_w 114354958
    //   342: l2i
    //   343: ldc 2134348687
    //   345: ixor
    //   346: ixor
    //   347: tableswitch default -> 322, -1589871399 -> 368, -1589871398 -> 3291
    //   368: getstatic Perryc.0 : I
    //   371: ifle -> 384
    //   374: ldc2_w 1914468567
    //   377: l2i
    //   378: ldc -1729937991
    //   380: ixor
    //   381: goto -> 391
    //   384: ldc2_w 132836691
    //   387: l2i
    //   388: ldc -1564943438
    //   390: ixor
    //   391: ldc2_w 336677812
    //   394: l2i
    //   395: ldc 653503834
    //   397: ixor
    //   398: ixor
    //   399: lookupswitch default -> 3314, -1750020081 -> 424, -669146240 -> 384
    //   424: getstatic bigname/zprestige/webhack/util/Util.mc : Lnet/minecraft/client/Minecraft;
    //   427: getstatic Perryc.c : I
    //   430: iflt -> 443
    //   433: ldc2_w -347255018
    //   436: l2i
    //   437: ldc 1906825321
    //   439: ixor
    //   440: goto -> 450
    //   443: ldc2_w -1844999309
    //   446: l2i
    //   447: ldc 1680332997
    //   449: ixor
    //   450: ldc2_w -674113837
    //   453: l2i
    //   454: ldc -1735101658
    //   456: ixor
    //   457: ixor
    //   458: lookupswitch default -> 3346, -1184500157 -> 484, -709938550 -> 443
    //   484: goto -> 488
    //   487: athrow
    //   488: invokevirtual func_71356_B : ()Z
    //   491: goto -> 495
    //   494: athrow
    //   495: ifne -> 509
    //   498: ldc2_w 549577229
    //   501: l2i
    //   502: ldc_w 1658968872
    //   505: ixor
    //   506: goto -> 517
    //   509: ldc2_w 309096884
    //   512: l2i
    //   513: ldc_w 1347176592
    //   516: ixor
    //   517: ldc2_w -710823483
    //   520: l2i
    //   521: ldc_w -808927450
    //   524: ixor
    //   525: ixor
    //   526: tableswitch default -> 498, 1481193414 -> 548, 1481193415 -> 3291
    //   548: getstatic Perryc.0 : I
    //   551: ifle -> 565
    //   554: ldc2_w 1851521783
    //   557: l2i
    //   558: ldc_w 33470035
    //   561: ixor
    //   562: goto -> 573
    //   565: ldc2_w 315020844
    //   568: l2i
    //   569: ldc_w 1407623586
    //   572: ixor
    //   573: ldc2_w -355350350
    //   576: l2i
    //   577: ldc_w 1403550338
    //   580: ixor
    //   581: ixor
    //   582: lookupswitch default -> 608, -690159980 -> 3294, 1335775099 -> 565
    //   608: aload_1
    //   609: getstatic Perryc.1 : I
    //   612: ifeq -> 626
    //   615: ldc2_w -1767571463
    //   618: l2i
    //   619: ldc_w 801196690
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w -1143060171
    //   629: l2i
    //   630: ldc_w -217992462
    //   633: ixor
    //   634: ldc2_w -1039927396
    //   637: l2i
    //   638: ldc_w -1883901938
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 3352, -187452679 -> 626, 90831957 -> 668
    //   668: goto -> 672
    //   671: athrow
    //   672: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w -447143111
    //   688: l2i
    //   689: ldc_w -1643593646
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -862792980
    //   699: l2i
    //   700: ldc_w -1241534053
    //   703: ixor
    //   704: ldc2_w -8861502
    //   707: l2i
    //   708: ldc_w 2142637407
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 3326, -106715414 -> 740, -73455882 -> 696
    //   740: astore_2
    //   741: getstatic Perryc.1 : I
    //   744: ifeq -> 758
    //   747: ldc2_w 73114731
    //   750: l2i
    //   751: ldc_w -316525903
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w -1809962547
    //   761: l2i
    //   762: ldc_w -1826422446
    //   765: ixor
    //   766: ldc2_w 1319416803
    //   769: l2i
    //   770: ldc_w 793961578
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 800, -2003844781 -> 3296, 373704436 -> 758
    //   800: aload_0
    //   801: getstatic Perryc.0 : I
    //   804: ifle -> 818
    //   807: ldc2_w -472881763
    //   810: l2i
    //   811: ldc_w -240352277
    //   814: ixor
    //   815: goto -> 826
    //   818: ldc2_w -1420610155
    //   821: l2i
    //   822: ldc_w 468710103
    //   825: ixor
    //   826: ldc2_w 447752221
    //   829: l2i
    //   830: ldc_w -220388545
    //   833: ixor
    //   834: ixor
    //   835: lookupswitch default -> 860, -99488428 -> 3360, 1049960365 -> 818
    //   860: getfield cPacketPlayer : Lbigname/zprestige/webhack/features/setting/Setting;
    //   863: getstatic Perryc.c : I
    //   866: iflt -> 880
    //   869: ldc2_w -144677929
    //   872: l2i
    //   873: ldc_w -2001117986
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w 1666684852
    //   883: l2i
    //   884: ldc_w -605973255
    //   887: ixor
    //   888: ldc2_w -1610645048
    //   891: l2i
    //   892: ldc_w 2147404260
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 924, -1613203675 -> 3316, 1721472319 -> 880
    //   924: goto -> 928
    //   927: athrow
    //   928: invokevirtual getValue : ()Ljava/lang/Object;
    //   931: goto -> 935
    //   934: athrow
    //   935: checkcast java/lang/Boolean
    //   938: getstatic Perryc.1 : I
    //   941: ifeq -> 955
    //   944: ldc2_w 969691513
    //   947: l2i
    //   948: ldc_w 1657290924
    //   951: ixor
    //   952: goto -> 963
    //   955: ldc2_w -742673184
    //   958: l2i
    //   959: ldc_w 1983521024
    //   962: ixor
    //   963: ldc2_w 355887641
    //   966: l2i
    //   967: ldc_w -1908362820
    //   970: ixor
    //   971: ixor
    //   972: lookupswitch default -> 1000, -1066218896 -> 3328, 320338918 -> 955
    //   1000: goto -> 1004
    //   1003: athrow
    //   1004: invokevirtual booleanValue : ()Z
    //   1007: goto -> 1011
    //   1010: athrow
    //   1011: ifeq -> 1025
    //   1014: ldc2_w -662579174
    //   1017: l2i
    //   1018: ldc_w -652307579
    //   1021: ixor
    //   1022: goto -> 1033
    //   1025: ldc2_w -278623229
    //   1028: l2i
    //   1029: ldc_w -285489251
    //   1032: ixor
    //   1033: ldc2_w 775084758
    //   1036: l2i
    //   1037: ldc_w 1566685889
    //   1040: ixor
    //   1041: ixor
    //   1042: tableswitch default -> 1014, 1925983112 -> 1064, 1925983113 -> 1783
    //   1064: getstatic Perryc.1 : I
    //   1067: ifeq -> 1081
    //   1070: ldc2_w 1970417147
    //   1073: l2i
    //   1074: ldc_w -2107603753
    //   1077: ixor
    //   1078: goto -> 1089
    //   1081: ldc2_w -1843321980
    //   1084: l2i
    //   1085: ldc_w 1405559887
    //   1088: ixor
    //   1089: ldc2_w -333282498
    //   1092: l2i
    //   1093: ldc_w -151384995
    //   1096: ixor
    //   1097: ixor
    //   1098: lookupswitch default -> 3336, -616658776 -> 1124, -305519025 -> 1081
    //   1124: aload_2
    //   1125: instanceof net/minecraft/network/play/client/CPacketPlayer
    //   1128: ifeq -> 1142
    //   1131: ldc2_w -642716765
    //   1134: l2i
    //   1135: ldc_w -1332371916
    //   1138: ixor
    //   1139: goto -> 1150
    //   1142: ldc2_w -2120191932
    //   1145: l2i
    //   1146: ldc_w -393935408
    //   1149: ixor
    //   1150: ldc2_w 604738151
    //   1153: l2i
    //   1154: ldc_w 724512425
    //   1157: ixor
    //   1158: ixor
    //   1159: tableswitch default -> 1131, 1711393113 -> 1180, 1711393114 -> 1783
    //   1180: getstatic Perryc.0 : I
    //   1183: ifle -> 1197
    //   1186: ldc2_w 243716078
    //   1189: l2i
    //   1190: ldc_w -512021274
    //   1193: ixor
    //   1194: goto -> 1205
    //   1197: ldc2_w 712919995
    //   1200: l2i
    //   1201: ldc_w -1531733939
    //   1204: ixor
    //   1205: ldc2_w -1559046417
    //   1208: l2i
    //   1209: ldc_w 1048486847
    //   1212: ixor
    //   1213: ixor
    //   1214: lookupswitch default -> 1240, -29407526 -> 1197, 1922143832 -> 3322
    //   1240: aload_1
    //   1241: ldc2_w 775467268
    //   1244: l2i
    //   1245: ldc_w 775467269
    //   1248: ixor
    //   1249: getstatic Perryc.0 : I
    //   1252: ifle -> 1266
    //   1255: ldc2_w 1478285090
    //   1258: l2i
    //   1259: ldc_w 1856034864
    //   1262: ixor
    //   1263: goto -> 1274
    //   1266: ldc2_w 1131793032
    //   1269: l2i
    //   1270: ldc_w -1206538899
    //   1273: ixor
    //   1274: ldc2_w -1908739232
    //   1277: l2i
    //   1278: ldc_w -1337923415
    //   1281: ixor
    //   1282: ixor
    //   1283: lookupswitch default -> 1308, -1462021926 -> 1266, 147199195 -> 3300
    //   1308: goto -> 1312
    //   1311: athrow
    //   1312: invokevirtual setCanceled : (Z)V
    //   1315: goto -> 1319
    //   1318: athrow
    //   1319: getstatic Perryc.0 : I
    //   1322: ifle -> 1336
    //   1325: ldc2_w -901754230
    //   1328: l2i
    //   1329: ldc_w 1847947928
    //   1332: ixor
    //   1333: goto -> 1344
    //   1336: ldc2_w -1064640228
    //   1339: l2i
    //   1340: ldc_w 2051534188
    //   1343: ixor
    //   1344: ldc2_w -968457163
    //   1347: l2i
    //   1348: ldc_w 1586331487
    //   1351: ixor
    //   1352: ixor
    //   1353: lookupswitch default -> 3370, 570881818 -> 1380, 1018092408 -> 1336
    //   1380: aload_0
    //   1381: getstatic Perryc.1 : I
    //   1384: ifeq -> 1398
    //   1387: ldc2_w 1973610891
    //   1390: l2i
    //   1391: ldc_w -1245528375
    //   1394: ixor
    //   1395: goto -> 1406
    //   1398: ldc2_w 2073334972
    //   1401: l2i
    //   1402: ldc_w 994972610
    //   1405: ixor
    //   1406: ldc2_w 1281269188
    //   1409: l2i
    //   1410: ldc_w 1240372147
    //   1413: ixor
    //   1414: ixor
    //   1415: lookupswitch default -> 3310, -976201419 -> 1398, 1164609801 -> 1440
    //   1440: getfield packets : Ljava/util/Queue;
    //   1443: getstatic Perryc.1 : I
    //   1446: ifeq -> 1460
    //   1449: ldc2_w -500139331
    //   1452: l2i
    //   1453: ldc_w -1256795021
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w 1478544005
    //   1463: l2i
    //   1464: ldc_w -37930984
    //   1467: ixor
    //   1468: ldc2_w 723932658
    //   1471: l2i
    //   1472: ldc_w -1080044884
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 1504, -1012979312 -> 3302, 1612542676 -> 1460
    //   1504: aload_2
    //   1505: checkcast net/minecraft/network/Packet
    //   1508: getstatic Perryc.c : I
    //   1511: iflt -> 1525
    //   1514: ldc2_w 1765184536
    //   1517: l2i
    //   1518: ldc_w 383008984
    //   1521: ixor
    //   1522: goto -> 1533
    //   1525: ldc2_w 175524740
    //   1528: l2i
    //   1529: ldc_w 1411862742
    //   1532: ixor
    //   1533: ldc2_w 1898082598
    //   1536: l2i
    //   1537: ldc_w -2057673871
    //   1540: ixor
    //   1541: ixor
    //   1542: lookupswitch default -> 1568, -1952790889 -> 3308, -1253141217 -> 1525
    //   1568: goto -> 1572
    //   1571: athrow
    //   1572: invokeinterface add : (Ljava/lang/Object;)Z
    //   1577: goto -> 1581
    //   1580: athrow
    //   1581: pop
    //   1582: getstatic Perryc.c : I
    //   1585: iflt -> 1599
    //   1588: ldc2_w 982951301
    //   1591: l2i
    //   1592: ldc_w -1760812746
    //   1595: ixor
    //   1596: goto -> 1607
    //   1599: ldc2_w 2039350860
    //   1602: l2i
    //   1603: ldc_w 1117983572
    //   1606: ixor
    //   1607: ldc2_w 497691921
    //   1610: l2i
    //   1611: ldc_w 1302631430
    //   1614: ixor
    //   1615: ixor
    //   1616: lookupswitch default -> 3312, -40616540 -> 1599, 1797499919 -> 1644
    //   1644: aload_0
    //   1645: dup
    //   1646: getstatic Perryc.1 : I
    //   1649: ifeq -> 1663
    //   1652: ldc2_w 2121098416
    //   1655: l2i
    //   1656: ldc_w 1552864819
    //   1659: ixor
    //   1660: goto -> 1671
    //   1663: ldc2_w 1094351531
    //   1666: l2i
    //   1667: ldc_w 1179474176
    //   1670: ixor
    //   1671: ldc2_w 315588194
    //   1674: l2i
    //   1675: ldc_w 1347530734
    //   1678: ixor
    //   1679: ixor
    //   1680: lookupswitch default -> 3354, 1172959783 -> 1708, 1618830095 -> 1663
    //   1708: getfield packetsCanceled : I
    //   1711: ldc2_w -556181339
    //   1714: l2i
    //   1715: ldc_w -556181340
    //   1718: ixor
    //   1719: iadd
    //   1720: getstatic Perryc.c : I
    //   1723: iflt -> 1737
    //   1726: ldc2_w 789285957
    //   1729: l2i
    //   1730: ldc_w -729200227
    //   1733: ixor
    //   1734: goto -> 1745
    //   1737: ldc2_w -1011999300
    //   1740: l2i
    //   1741: ldc_w 195700284
    //   1744: ixor
    //   1745: ldc2_w -305465833
    //   1748: l2i
    //   1749: ldc_w -2108611452
    //   1752: ixor
    //   1753: ixor
    //   1754: lookupswitch default -> 1780, -1810294965 -> 3320, -19954501 -> 1737
    //   1780: putfield packetsCanceled : I
    //   1783: getstatic Perryc.0 : I
    //   1786: ifle -> 1800
    //   1789: ldc2_w -203129126
    //   1792: l2i
    //   1793: ldc_w 3451616
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w 1320597490
    //   1803: l2i
    //   1804: ldc_w -2088503787
    //   1807: ixor
    //   1808: ldc2_w 104280824
    //   1811: l2i
    //   1812: ldc_w 1308763791
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 3362, -2063575664 -> 1844, -1142570931 -> 1800
    //   1844: aload_0
    //   1845: getstatic Perryc.c : I
    //   1848: iflt -> 1862
    //   1851: ldc2_w -278961429
    //   1854: l2i
    //   1855: ldc_w 1631321445
    //   1858: ixor
    //   1859: goto -> 1870
    //   1862: ldc2_w -1547748891
    //   1865: l2i
    //   1866: ldc_w -745611934
    //   1869: ixor
    //   1870: ldc2_w -1297282739
    //   1873: l2i
    //   1874: ldc_w 547423961
    //   1877: ixor
    //   1878: ixor
    //   1879: lookupswitch default -> 3364, -499258605 -> 1904, 476614682 -> 1862
    //   1904: getfield cPacketPlayer : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1907: getstatic Perryc.0 : I
    //   1910: ifle -> 1924
    //   1913: ldc2_w -1895793957
    //   1916: l2i
    //   1917: ldc_w -1166991027
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w 1307334033
    //   1927: l2i
    //   1928: ldc_w 1097120309
    //   1931: ixor
    //   1932: ldc2_w -674496718
    //   1935: l2i
    //   1936: ldc_w 58740146
    //   1939: ixor
    //   1940: ixor
    //   1941: lookupswitch default -> 3358, -658285276 -> 1968, -516232938 -> 1924
    //   1968: goto -> 1972
    //   1971: athrow
    //   1972: invokevirtual getValue : ()Ljava/lang/Object;
    //   1975: goto -> 1979
    //   1978: athrow
    //   1979: checkcast java/lang/Boolean
    //   1982: getstatic Perryc.0 : I
    //   1985: ifle -> 1999
    //   1988: ldc2_w -1480600641
    //   1991: l2i
    //   1992: ldc_w -556082036
    //   1995: ixor
    //   1996: goto -> 2007
    //   1999: ldc2_w 1411355048
    //   2002: l2i
    //   2003: ldc_w 301228994
    //   2006: ixor
    //   2007: ldc2_w -1006916471
    //   2010: l2i
    //   2011: ldc_w 1113463755
    //   2014: ixor
    //   2015: ixor
    //   2016: lookupswitch default -> 2044, -121587599 -> 3330, 585902330 -> 1999
    //   2044: goto -> 2048
    //   2047: athrow
    //   2048: invokevirtual booleanValue : ()Z
    //   2051: goto -> 2055
    //   2054: athrow
    //   2055: ifne -> 2069
    //   2058: ldc2_w -152803397
    //   2061: l2i
    //   2062: ldc_w 970158883
    //   2065: ixor
    //   2066: goto -> 2077
    //   2069: ldc2_w -1307422062
    //   2072: l2i
    //   2073: ldc_w 2099594763
    //   2076: ixor
    //   2077: ldc2_w -1975150564
    //   2080: l2i
    //   2081: ldc_w 467488454
    //   2084: ixor
    //   2085: ixor
    //   2086: tableswitch default -> 2058, 1588576834 -> 2108, 1588576835 -> 3291
    //   2108: getstatic Perryc.c : I
    //   2111: iflt -> 2125
    //   2114: ldc2_w -653040420
    //   2117: l2i
    //   2118: ldc_w -1926274744
    //   2121: ixor
    //   2122: goto -> 2133
    //   2125: ldc2_w -359518292
    //   2128: l2i
    //   2129: ldc_w 1396774805
    //   2132: ixor
    //   2133: ldc2_w -373644750
    //   2136: l2i
    //   2137: ldc_w -1020684783
    //   2140: ixor
    //   2141: ixor
    //   2142: lookupswitch default -> 3324, -1824519142 -> 2168, 2125410743 -> 2125
    //   2168: aload_2
    //   2169: instanceof net/minecraft/network/play/client/CPacketChatMessage
    //   2172: ifne -> 2186
    //   2175: ldc2_w 405697327
    //   2178: l2i
    //   2179: ldc_w -1837665111
    //   2182: ixor
    //   2183: goto -> 2194
    //   2186: ldc2_w -1592441266
    //   2189: l2i
    //   2190: ldc_w 726417871
    //   2193: ixor
    //   2194: ldc2_w -696129580
    //   2197: l2i
    //   2198: ldc_w 517279241
    //   2201: ixor
    //   2202: ixor
    //   2203: tableswitch default -> 2175, 1108209243 -> 2224, 1108209244 -> 2688
    //   2224: getstatic Perryc.0 : I
    //   2227: ifle -> 2241
    //   2230: ldc2_w -149485489
    //   2233: l2i
    //   2234: ldc_w -1325696829
    //   2237: ixor
    //   2238: goto -> 2249
    //   2241: ldc2_w -24717083
    //   2244: l2i
    //   2245: ldc_w 1879535742
    //   2248: ixor
    //   2249: ldc2_w -1172680502
    //   2252: l2i
    //   2253: ldc_w 1098532149
    //   2256: ixor
    //   2257: ixor
    //   2258: lookupswitch default -> 3332, -1131649677 -> 2241, 1977728356 -> 2284
    //   2284: aload_2
    //   2285: instanceof net/minecraft/network/play/client/CPacketConfirmTeleport
    //   2288: ifne -> 2302
    //   2291: ldc2_w -1949105531
    //   2294: l2i
    //   2295: ldc_w 1141158247
    //   2298: ixor
    //   2299: goto -> 2310
    //   2302: ldc2_w 2028789719
    //   2305: l2i
    //   2306: ldc_w -1220842442
    //   2309: ixor
    //   2310: ldc2_w 971744692
    //   2313: l2i
    //   2314: ldc_w -2027702765
    //   2317: ixor
    //   2318: ixor
    //   2319: tableswitch default -> 2291, 1897898053 -> 2340, 1897898054 -> 2688
    //   2340: getstatic Perryc.1 : I
    //   2343: ifeq -> 2357
    //   2346: ldc2_w -1923521233
    //   2349: l2i
    //   2350: ldc_w 1894358229
    //   2353: ixor
    //   2354: goto -> 2365
    //   2357: ldc2_w 1999331180
    //   2360: l2i
    //   2361: ldc_w -1794700690
    //   2364: ixor
    //   2365: ldc2_w 708557486
    //   2368: l2i
    //   2369: ldc_w -1541691045
    //   2372: ixor
    //   2373: ixor
    //   2374: lookupswitch default -> 3348, 1812743927 -> 2400, 1938876943 -> 2357
    //   2400: aload_2
    //   2401: instanceof net/minecraft/network/play/client/CPacketKeepAlive
    //   2404: ifne -> 2418
    //   2407: ldc2_w 157980528
    //   2410: l2i
    //   2411: ldc_w -1419994514
    //   2414: ixor
    //   2415: goto -> 2426
    //   2418: ldc2_w 1737185253
    //   2421: l2i
    //   2422: ldc_w -977446148
    //   2425: ixor
    //   2426: ldc2_w 1953635097
    //   2429: l2i
    //   2430: ldc_w -104956524
    //   2433: ixor
    //   2434: ixor
    //   2435: tableswitch default -> 2407, 804940691 -> 2456, 804940692 -> 2688
    //   2456: getstatic Perryc.1 : I
    //   2459: ifeq -> 2473
    //   2462: ldc2_w 1266103414
    //   2465: l2i
    //   2466: ldc_w 1174369723
    //   2469: ixor
    //   2470: goto -> 2481
    //   2473: ldc2_w -1694252323
    //   2476: l2i
    //   2477: ldc_w -1107100892
    //   2480: ixor
    //   2481: ldc2_w -1111004263
    //   2484: l2i
    //   2485: ldc_w -1462699384
    //   2488: ixor
    //   2489: ixor
    //   2490: lookupswitch default -> 3306, 463458524 -> 2473, 806791400 -> 2516
    //   2516: aload_2
    //   2517: instanceof net/minecraft/network/play/client/CPacketTabComplete
    //   2520: ifne -> 2534
    //   2523: ldc2_w 1661714990
    //   2526: l2i
    //   2527: ldc_w -858433741
    //   2530: ixor
    //   2531: goto -> 2542
    //   2534: ldc2_w 727108490
    //   2537: l2i
    //   2538: ldc_w -2071437674
    //   2541: ixor
    //   2542: ldc2_w 919055127
    //   2545: l2i
    //   2546: ldc_w 133255728
    //   2549: ixor
    //   2550: ixor
    //   2551: tableswitch default -> 2523, -1628935110 -> 2572, -1628935109 -> 2688
    //   2572: getstatic Perryc.c : I
    //   2575: iflt -> 2589
    //   2578: ldc2_w 1313389026
    //   2581: l2i
    //   2582: ldc_w -849645098
    //   2585: ixor
    //   2586: goto -> 2597
    //   2589: ldc2_w -502440344
    //   2592: l2i
    //   2593: ldc_w 126586176
    //   2596: ixor
    //   2597: ldc2_w -586299687
    //   2600: l2i
    //   2601: ldc_w 1363793149
    //   2604: ixor
    //   2605: ixor
    //   2606: lookupswitch default -> 2632, 257415696 -> 3304, 751970892 -> 2589
    //   2632: aload_2
    //   2633: instanceof net/minecraft/network/play/client/CPacketClientStatus
    //   2636: ifeq -> 2650
    //   2639: ldc2_w 479077005
    //   2642: l2i
    //   2643: ldc_w -2079113802
    //   2646: ixor
    //   2647: goto -> 2658
    //   2650: ldc2_w 963594650
    //   2653: l2i
    //   2654: ldc_w -1577953630
    //   2657: ixor
    //   2658: ldc2_w -136180787
    //   2661: l2i
    //   2662: ldc_w 855704135
    //   2665: ixor
    //   2666: ixor
    //   2667: tableswitch default -> 2639, 1551767217 -> 2688, 1551767218 -> 2689
    //   2688: return
    //   2689: getstatic Perryc.1 : I
    //   2692: ifeq -> 2706
    //   2695: ldc2_w 1303452837
    //   2698: l2i
    //   2699: ldc_w 336944911
    //   2702: ixor
    //   2703: goto -> 2714
    //   2706: ldc2_w -1162177317
    //   2709: l2i
    //   2710: ldc_w -587442735
    //   2713: ixor
    //   2714: ldc2_w 1482739309
    //   2717: l2i
    //   2718: ldc_w 633136553
    //   2721: ixor
    //   2722: ixor
    //   2723: lookupswitch default -> 2748, -502686545 -> 2706, 611870830 -> 3342
    //   2748: aload_0
    //   2749: getstatic Perryc.c : I
    //   2752: iflt -> 2766
    //   2755: ldc2_w -1049039800
    //   2758: l2i
    //   2759: ldc_w -2083155421
    //   2762: ixor
    //   2763: goto -> 2774
    //   2766: ldc2_w -910327726
    //   2769: l2i
    //   2770: ldc_w 1662676084
    //   2773: ixor
    //   2774: ldc2_w 564162333
    //   2777: l2i
    //   2778: ldc_w 1278662620
    //   2781: ixor
    //   2782: ixor
    //   2783: lookupswitch default -> 3350, -953068313 -> 2808, 792446634 -> 2766
    //   2808: getfield packets : Ljava/util/Queue;
    //   2811: getstatic Perryc.0 : I
    //   2814: ifle -> 2828
    //   2817: ldc2_w 2062692642
    //   2820: l2i
    //   2821: ldc_w -1498094301
    //   2824: ixor
    //   2825: goto -> 2836
    //   2828: ldc2_w 1172636168
    //   2831: l2i
    //   2832: ldc_w 242715931
    //   2835: ixor
    //   2836: ldc2_w -38727594
    //   2839: l2i
    //   2840: ldc_w 1764167385
    //   2843: ixor
    //   2844: ixor
    //   2845: lookupswitch default -> 3366, -553348708 -> 2872, 1221642894 -> 2828
    //   2872: aload_2
    //   2873: checkcast net/minecraft/network/Packet
    //   2876: getstatic Perryc.1 : I
    //   2879: ifeq -> 2893
    //   2882: ldc2_w -1224122936
    //   2885: l2i
    //   2886: ldc_w -201479288
    //   2889: ixor
    //   2890: goto -> 2901
    //   2893: ldc2_w -661383998
    //   2896: l2i
    //   2897: ldc_w 1905133548
    //   2900: ixor
    //   2901: ldc2_w 236511883
    //   2904: l2i
    //   2905: ldc_w 487925271
    //   2908: ixor
    //   2909: ixor
    //   2910: lookupswitch default -> 2936, 1475949276 -> 3338, 1525716669 -> 2893
    //   2936: goto -> 2940
    //   2939: athrow
    //   2940: invokeinterface add : (Ljava/lang/Object;)Z
    //   2945: goto -> 2949
    //   2948: athrow
    //   2949: pop
    //   2950: getstatic Perryc.c : I
    //   2953: iflt -> 2967
    //   2956: ldc2_w -1021935794
    //   2959: l2i
    //   2960: ldc_w 1633720128
    //   2963: ixor
    //   2964: goto -> 2975
    //   2967: ldc2_w -2044245401
    //   2970: l2i
    //   2971: ldc_w 1279995972
    //   2974: ixor
    //   2975: ldc2_w -54148925
    //   2978: l2i
    //   2979: ldc_w 719681433
    //   2982: ixor
    //   2983: ixor
    //   2984: lookupswitch default -> 3012, 1946344363 -> 2967, 1951817556 -> 3298
    //   3012: aload_1
    //   3013: ldc2_w 1318605359
    //   3016: l2i
    //   3017: ldc_w 1318605358
    //   3020: ixor
    //   3021: getstatic Perryc.0 : I
    //   3024: ifle -> 3038
    //   3027: ldc2_w -623895404
    //   3030: l2i
    //   3031: ldc_w -1518776500
    //   3034: ixor
    //   3035: goto -> 3046
    //   3038: ldc2_w -443517321
    //   3041: l2i
    //   3042: ldc_w 25803732
    //   3045: ixor
    //   3046: ldc2_w -886494445
    //   3049: l2i
    //   3050: ldc_w -315730005
    //   3053: ixor
    //   3054: ixor
    //   3055: lookupswitch default -> 3372, -1038175973 -> 3080, 1504587616 -> 3038
    //   3080: goto -> 3084
    //   3083: athrow
    //   3084: invokevirtual setCanceled : (Z)V
    //   3087: goto -> 3091
    //   3090: athrow
    //   3091: getstatic Perryc.1 : I
    //   3094: ifeq -> 3108
    //   3097: ldc2_w 1492199361
    //   3100: l2i
    //   3101: ldc_w -246321737
    //   3104: ixor
    //   3105: goto -> 3116
    //   3108: ldc2_w 1391583339
    //   3111: l2i
    //   3112: ldc_w 862886929
    //   3115: ixor
    //   3116: ldc2_w -1753998179
    //   3119: l2i
    //   3120: ldc_w -603150178
    //   3123: ixor
    //   3124: ixor
    //   3125: lookupswitch default -> 3152, -489095563 -> 3368, 1581110 -> 3108
    //   3152: aload_0
    //   3153: dup
    //   3154: getstatic Perryc.1 : I
    //   3157: ifeq -> 3171
    //   3160: ldc2_w -1352712713
    //   3163: l2i
    //   3164: ldc_w 1299061653
    //   3167: ixor
    //   3168: goto -> 3179
    //   3171: ldc2_w 1121318149
    //   3174: l2i
    //   3175: ldc_w -1421232820
    //   3178: ixor
    //   3179: ldc2_w -843705466
    //   3182: l2i
    //   3183: ldc_w -853731078
    //   3186: ixor
    //   3187: ixor
    //   3188: lookupswitch default -> 3216, -493212386 -> 3292, 231675506 -> 3171
    //   3216: getfield packetsCanceled : I
    //   3219: ldc2_w 985497900
    //   3222: l2i
    //   3223: ldc_w 985497901
    //   3226: ixor
    //   3227: iadd
    //   3228: getstatic Perryc.1 : I
    //   3231: ifeq -> 3245
    //   3234: ldc2_w 1302487010
    //   3237: l2i
    //   3238: ldc_w 358413306
    //   3241: ixor
    //   3242: goto -> 3253
    //   3245: ldc2_w 454084876
    //   3248: l2i
    //   3249: ldc_w 392364466
    //   3252: ixor
    //   3253: ldc2_w 104725326
    //   3256: l2i
    //   3257: ldc_w 258845800
    //   3260: ixor
    //   3261: ixor
    //   3262: lookupswitch default -> 3340, 86220696 -> 3288, 1370422078 -> 3245
    //   3288: putfield packetsCanceled : I
    //   3291: return
    //   3292: aconst_null
    //   3293: athrow
    //   3294: aconst_null
    //   3295: athrow
    //   3296: aconst_null
    //   3297: athrow
    //   3298: aconst_null
    //   3299: athrow
    //   3300: aconst_null
    //   3301: athrow
    //   3302: aconst_null
    //   3303: athrow
    //   3304: aconst_null
    //   3305: athrow
    //   3306: aconst_null
    //   3307: athrow
    //   3308: aconst_null
    //   3309: athrow
    //   3310: aconst_null
    //   3311: athrow
    //   3312: aconst_null
    //   3313: athrow
    //   3314: aconst_null
    //   3315: athrow
    //   3316: aconst_null
    //   3317: athrow
    //   3318: aconst_null
    //   3319: athrow
    //   3320: aconst_null
    //   3321: athrow
    //   3322: aconst_null
    //   3323: athrow
    //   3324: aconst_null
    //   3325: athrow
    //   3326: aconst_null
    //   3327: athrow
    //   3328: aconst_null
    //   3329: athrow
    //   3330: aconst_null
    //   3331: athrow
    //   3332: aconst_null
    //   3333: athrow
    //   3334: aconst_null
    //   3335: athrow
    //   3336: aconst_null
    //   3337: athrow
    //   3338: aconst_null
    //   3339: athrow
    //   3340: aconst_null
    //   3341: athrow
    //   3342: aconst_null
    //   3343: athrow
    //   3344: aconst_null
    //   3345: athrow
    //   3346: aconst_null
    //   3347: athrow
    //   3348: aconst_null
    //   3349: athrow
    //   3350: aconst_null
    //   3351: athrow
    //   3352: aconst_null
    //   3353: athrow
    //   3354: aconst_null
    //   3355: athrow
    //   3356: aconst_null
    //   3357: athrow
    //   3358: aconst_null
    //   3359: athrow
    //   3360: aconst_null
    //   3361: athrow
    //   3362: aconst_null
    //   3363: athrow
    //   3364: aconst_null
    //   3365: athrow
    //   3366: aconst_null
    //   3367: athrow
    //   3368: aconst_null
    //   3369: athrow
    //   3370: aconst_null
    //   3371: athrow
    //   3372: aconst_null
    //   3373: athrow
    //   3374: pop
    //   3375: goto -> 24
    //   3378: pop
    //   3379: aconst_null
    //   3380: goto -> 3374
    //   3383: dup
    //   3384: ifnull -> 3374
    //   3387: checkcast java/lang/Throwable
    //   3390: athrow
    //   3391: dup
    //   3392: ifnull -> 3378
    //   3395: checkcast java/lang/Throwable
    //   3398: athrow
    //   3399: aconst_null
    //   3400: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   741	2550	2	packet	Ljava/lang/Object;
    //   24	3268	0	this	Lbigname/zprestige/webhack/features/modules/Player/Blink;
    //   24	3268	1	event	Lbigname/zprestige/webhack/event/events/PacketEvent$Send;
    // Exception table:
    //   from	to	target	type
    //   8	20	3383	finally
    //   143	150	150	finally
    //   143	150	150	java/lang/ClassCastException
    //   143	150	150	java/util/ConcurrentModificationException
    //   144	150	3	java/lang/NullPointerException
    //   144	150	143	finally
    //   487	494	494	finally
    //   487	494	494	finally
    //   488	494	3	finally
    //   488	494	494	finally
    //   488	494	487	finally
    //   672	678	678	finally
    //   672	678	3	finally
    //   672	678	3	java/lang/RuntimeException
    //   672	678	678	finally
    //   672	678	3	java/lang/IllegalStateException
    //   927	934	934	finally
    //   927	934	927	java/lang/EnumConstantNotPresentException
    //   927	934	934	java/lang/IndexOutOfBoundsException
    //   928	934	927	finally
    //   928	934	934	java/lang/StringIndexOutOfBoundsException
    //   1003	1010	1010	finally
    //   1003	1010	1010	java/lang/NumberFormatException
    //   1004	1010	1003	finally
    //   1004	1010	1010	finally
    //   1004	1010	3	finally
    //   1312	1318	1318	finally
    //   1312	1318	3	java/lang/NumberFormatException
    //   1312	1318	3	finally
    //   1312	1318	3	java/lang/RuntimeException
    //   1312	1318	3	finally
    //   1571	1580	1580	finally
    //   1571	1580	1580	finally
    //   1572	1580	1571	java/lang/NullPointerException
    //   1572	1580	1571	java/lang/AssertionError
    //   1572	1580	3	finally
    //   1971	1978	1978	finally
    //   1971	1978	1971	java/lang/AssertionError
    //   1971	1978	3	finally
    //   1972	1978	1971	java/lang/UnsupportedOperationException
    //   1972	1978	1978	java/lang/RuntimeException
    //   2047	2054	2054	finally
    //   2047	2054	2047	java/util/ConcurrentModificationException
    //   2047	2054	2047	finally
    //   2047	2054	2047	java/lang/IndexOutOfBoundsException
    //   2047	2054	2047	finally
    //   2939	2948	2948	finally
    //   2939	2948	3	finally
    //   2939	2948	2939	finally
    //   2939	2948	2948	finally
    //   2940	2948	2948	finally
    //   3083	3090	3090	finally
    //   3083	3090	3090	java/lang/RuntimeException
    //   3083	3090	3083	finally
    //   3084	3090	3083	java/lang/NumberFormatException
    //   3084	3090	3	finally
    //   3383	3391	3383	finally
    //   3399	3401	3	finally
  }
  
  public Blink() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1694690267
    //   9: l2i
    //   10: ldc_w -2039028731
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 235662831
    //   20: l2i
    //   21: ldc_w 1091188401
    //   24: ixor
    //   25: ldc2_w -10016639
    //   28: l2i
    //   29: ldc_w -2019728316
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 11194, -1685175525 -> 17, 939235227 -> 60
    //   60: aload_0
    //   61: ldc_w '㌟㶹䴐'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 601257533
    //   73: l2i
    //   74: ldc_w -53739281
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -224395702
    //   84: l2i
    //   85: ldc_w 1804832221
    //   88: ixor
    //   89: ldc2_w -359855123
    //   92: l2i
    //   93: ldc_w -1574954589
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1749588836 -> 11084, 161903014 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '㍓㶸䴖༭๠鱱蹢ᇣ奏ਢⱗ煴锊糿辘㦈Ꝼ'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w -737696341
    //   139: l2i
    //   140: ldc_w -1861172210
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -974450603
    //   150: l2i
    //   151: ldc_w -617153725
    //   154: ixor
    //   155: ldc2_w -1238051014
    //   158: l2i
    //   159: ldc_w -2141916648
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 11186, 683527732 -> 192, 1937196167 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 212
    //   201: ldc2_w 646118427
    //   204: l2i
    //   205: ldc_w 1095633489
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1848783544
    //   215: l2i
    //   216: ldc_w -299490757
    //   219: ixor
    //   220: ldc2_w -1811066555
    //   223: l2i
    //   224: ldc_w -213974813
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -5695801 -> 212, 16689132 -> 11174
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1382082516
    //   262: l2i
    //   263: ldc_w 1382082517
    //   266: ixor
    //   267: ldc2_w -1744211443
    //   270: l2i
    //   271: ldc_w -1744211443
    //   274: ixor
    //   275: ldc2_w -1223443992
    //   278: l2i
    //   279: ldc_w -1223443992
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 1907941565
    //   292: l2i
    //   293: ldc_w -1602406603
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -673115816
    //   303: l2i
    //   304: ldc_w 1942996941
    //   307: ixor
    //   308: ldc2_w -1762531481
    //   311: l2i
    //   312: ldc_w -1524475686
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -501848011 -> 11010, 513651897 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 1850768196
    //   356: l2i
    //   357: ldc_w 880839398
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1947444554
    //   367: l2i
    //   368: ldc_w 1028554020
    //   371: ixor
    //   372: ldc2_w -1125702769
    //   375: l2i
    //   376: ldc_w 544479104
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1139354379 -> 364, -968637011 -> 11044
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w -2012765637
    //   418: l2i
    //   419: ldc_w -716355980
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 979216917
    //   429: l2i
    //   430: ldc_w -1768770800
    //   433: ixor
    //   434: ldc2_w -1182376031
    //   437: l2i
    //   438: ldc_w -945050796
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 11182, -756879888 -> 468, 593957050 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '㌒㶼䴞༴'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -1454456936
    //   485: l2i
    //   486: ldc_w -583897365
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1417001823
    //   496: l2i
    //   497: ldc_w 942479649
    //   500: ixor
    //   501: ldc2_w 627304517
    //   504: l2i
    //   505: ldc_w 132005073
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 11062, 1323661034 -> 536, 1455490535 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 299577824
    //   542: l2i
    //   543: ldc_w 299577825
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 1649634985
    //   556: l2i
    //   557: ldc_w -1299601850
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1383513242
    //   567: l2i
    //   568: ldc_w -1579234202
    //   571: ixor
    //   572: ldc2_w -1757661501
    //   575: l2i
    //   576: ldc_w -641937793
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -1638256557 -> 10968, 1269285254 -> 564
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.0 : I
    //   614: ifle -> 628
    //   617: ldc2_w -1890056794
    //   620: l2i
    //   621: ldc_w -1538649709
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w -795624052
    //   631: l2i
    //   632: ldc_w -2100640352
    //   635: ixor
    //   636: ldc2_w -77379015
    //   639: l2i
    //   640: ldc_w -4874271
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 11140, 801423853 -> 628, 1452256756 -> 672
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w 1740331817
    //   684: l2i
    //   685: ldc_w 2116384484
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -120795555
    //   695: l2i
    //   696: ldc_w -246473666
    //   699: ixor
    //   700: ldc2_w 2137238652
    //   703: l2i
    //   704: ldc_w 1452409401
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 10970, 544373798 -> 736, 812614536 -> 692
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.0 : I
    //   742: ifle -> 756
    //   745: ldc2_w -367040718
    //   748: l2i
    //   749: ldc_w 1514694366
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 563569819
    //   759: l2i
    //   760: ldc_w -1292199800
    //   763: ixor
    //   764: ldc2_w -2094735405
    //   767: l2i
    //   768: ldc_w -439149407
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 10964, -694107490 -> 756, -174440607 -> 800
    //   800: putfield cPacketPlayer : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.1 : I
    //   806: ifeq -> 820
    //   809: ldc2_w 1863884325
    //   812: l2i
    //   813: ldc_w 1830379618
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -913478121
    //   823: l2i
    //   824: ldc_w 321773832
    //   827: ixor
    //   828: ldc2_w -375763346
    //   831: l2i
    //   832: ldc_w -74406620
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 11198, -928357291 -> 864, 269161741 -> 820
    //   864: aload_0
    //   865: new bigname/zprestige/webhack/util/Timer
    //   868: dup
    //   869: getstatic Perryc.1 : I
    //   872: ifeq -> 886
    //   875: ldc2_w -1722535022
    //   878: l2i
    //   879: ldc_w -1612371595
    //   882: ixor
    //   883: goto -> 894
    //   886: ldc2_w -1067007686
    //   889: l2i
    //   890: ldc_w -2077692596
    //   893: ixor
    //   894: ldc2_w -79903226
    //   897: l2i
    //   898: ldc_w 409019625
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 11246, -1491874151 -> 928, -437454840 -> 886
    //   928: invokespecial <init> : ()V
    //   931: getstatic Perryc.0 : I
    //   934: ifle -> 948
    //   937: ldc2_w -742964992
    //   940: l2i
    //   941: ldc_w -32998753
    //   944: ixor
    //   945: goto -> 956
    //   948: ldc2_w -1069404895
    //   951: l2i
    //   952: ldc_w -1879049147
    //   955: ixor
    //   956: ldc2_w -1017694189
    //   959: l2i
    //   960: ldc_w -1479092592
    //   963: ixor
    //   964: ixor
    //   965: lookupswitch default -> 11164, 725368807 -> 992, 1228854556 -> 948
    //   992: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   995: getstatic Perryc.1 : I
    //   998: ifeq -> 1012
    //   1001: ldc2_w 1709765544
    //   1004: l2i
    //   1005: ldc_w 1676401055
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w 1363225218
    //   1015: l2i
    //   1016: ldc_w -711105682
    //   1019: ixor
    //   1020: ldc2_w 654998861
    //   1023: l2i
    //   1024: ldc_w 1826882838
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1056, 167606138 -> 1012, 1307398764 -> 11130
    //   1056: aload_0
    //   1057: new java/util/concurrent/ConcurrentLinkedQueue
    //   1060: dup
    //   1061: getstatic Perryc.1 : I
    //   1064: ifeq -> 1078
    //   1067: ldc2_w 1019937106
    //   1070: l2i
    //   1071: ldc_w -1422727572
    //   1074: ixor
    //   1075: goto -> 1086
    //   1078: ldc2_w 2057159569
    //   1081: l2i
    //   1082: ldc_w -578809136
    //   1085: ixor
    //   1086: ldc2_w -2077542056
    //   1089: l2i
    //   1090: ldc_w -178484173
    //   1093: ixor
    //   1094: ixor
    //   1095: lookupswitch default -> 11134, -697670614 -> 1120, -426880427 -> 1078
    //   1120: invokespecial <init> : ()V
    //   1123: getstatic Perryc.0 : I
    //   1126: ifle -> 1140
    //   1129: ldc2_w 35863951
    //   1132: l2i
    //   1133: ldc_w 52124515
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w 465141585
    //   1143: l2i
    //   1144: ldc_w -1099427187
    //   1147: ixor
    //   1148: ldc2_w -1288647959
    //   1151: l2i
    //   1152: ldc_w -1845885581
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 11054, -2029280698 -> 1184, 603105654 -> 1140
    //   1184: putfield packets : Ljava/util/Queue;
    //   1187: getstatic Perryc.1 : I
    //   1190: ifeq -> 1204
    //   1193: ldc2_w 1146101145
    //   1196: l2i
    //   1197: ldc_w -1909610997
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w -494100246
    //   1207: l2i
    //   1208: ldc_w -271947708
    //   1211: ixor
    //   1212: ldc2_w -2110473660
    //   1215: l2i
    //   1216: ldc_w 1308603542
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 11086, -1030896004 -> 1248, 95860032 -> 1204
    //   1248: aload_0
    //   1249: ldc2_w -1954755541
    //   1252: l2i
    //   1253: ldc_w -1954755541
    //   1256: ixor
    //   1257: getstatic Perryc.c : I
    //   1260: iflt -> 1274
    //   1263: ldc2_w 820101964
    //   1266: l2i
    //   1267: ldc_w -770562829
    //   1270: ixor
    //   1271: goto -> 1282
    //   1274: ldc2_w 451676702
    //   1277: l2i
    //   1278: ldc_w 1798042631
    //   1281: ixor
    //   1282: ldc2_w -1069573987
    //   1285: l2i
    //   1286: ldc_w -1852869763
    //   1289: ixor
    //   1290: ixor
    //   1291: lookupswitch default -> 1316, -1287451553 -> 11116, -107348611 -> 1274
    //   1316: putfield packetsCanceled : I
    //   1319: getstatic Perryc.c : I
    //   1322: iflt -> 1336
    //   1325: ldc2_w -1259688522
    //   1328: l2i
    //   1329: ldc_w 1098892496
    //   1332: ixor
    //   1333: goto -> 1344
    //   1336: ldc2_w 499043674
    //   1339: l2i
    //   1340: ldc_w 1854762480
    //   1343: ixor
    //   1344: ldc2_w -447216456
    //   1347: l2i
    //   1348: ldc_w -1780777527
    //   1351: ixor
    //   1352: ixor
    //   1353: lookupswitch default -> 10984, -2062151657 -> 1336, 61921755 -> 1380
    //   1380: aload_0
    //   1381: aconst_null
    //   1382: getstatic Perryc.c : I
    //   1385: iflt -> 1399
    //   1388: ldc2_w -1637327208
    //   1391: l2i
    //   1392: ldc_w 764696035
    //   1395: ixor
    //   1396: goto -> 1407
    //   1399: ldc2_w 2137475506
    //   1402: l2i
    //   1403: ldc_w -2079954716
    //   1406: ixor
    //   1407: ldc2_w -514320975
    //   1410: l2i
    //   1411: ldc_w -1423292092
    //   1414: ixor
    //   1415: ixor
    //   1416: lookupswitch default -> 1444, -108111986 -> 11106, 720756294 -> 1399
    //   1444: putfield startPos : Lnet/minecraft/util/math/BlockPos;
    //   1447: getstatic Perryc.c : I
    //   1450: iflt -> 1464
    //   1453: ldc2_w 40860900
    //   1456: l2i
    //   1457: ldc_w -1185258251
    //   1460: ixor
    //   1461: goto -> 1472
    //   1464: ldc2_w 45322644
    //   1467: l2i
    //   1468: ldc_w 809041295
    //   1471: ixor
    //   1472: ldc2_w -751998424
    //   1475: l2i
    //   1476: ldc_w 1435697318
    //   1479: ixor
    //   1480: ixor
    //   1481: lookupswitch default -> 10992, -1271593323 -> 1508, 1032549023 -> 1464
    //   1508: aload_0
    //   1509: aconst_null
    //   1510: getstatic Perryc.0 : I
    //   1513: ifle -> 1527
    //   1516: ldc2_w 1136786164
    //   1519: l2i
    //   1520: ldc_w -792277137
    //   1523: ixor
    //   1524: goto -> 1535
    //   1527: ldc2_w 172725418
    //   1530: l2i
    //   1531: ldc_w -1387813287
    //   1534: ixor
    //   1535: ldc2_w -886003175
    //   1538: l2i
    //   1539: ldc_w 2039777404
    //   1542: ixor
    //   1543: ixor
    //   1544: lookupswitch default -> 1572, -228059350 -> 1527, 564336638 -> 11064
    //   1572: putfield renderPosHead : Lnet/minecraft/util/math/BlockPos;
    //   1575: getstatic Perryc.0 : I
    //   1578: ifle -> 1592
    //   1581: ldc2_w 59142462
    //   1584: l2i
    //   1585: ldc_w -772993726
    //   1588: ixor
    //   1589: goto -> 1600
    //   1592: ldc2_w -2058088814
    //   1595: l2i
    //   1596: ldc_w -289639689
    //   1599: ixor
    //   1600: ldc2_w -1670408469
    //   1603: l2i
    //   1604: ldc_w 167188665
    //   1607: ixor
    //   1608: ixor
    //   1609: lookupswitch default -> 11092, -26152393 -> 1636, 1207169582 -> 1592
    //   1636: aload_0
    //   1637: getstatic Perryc.c : I
    //   1640: iflt -> 1654
    //   1643: ldc2_w -1710408571
    //   1646: l2i
    //   1647: ldc_w 1413227072
    //   1650: ixor
    //   1651: goto -> 1662
    //   1654: ldc2_w -1473909229
    //   1657: l2i
    //   1658: ldc_w -1363681734
    //   1661: ixor
    //   1662: ldc2_w 1671058685
    //   1665: l2i
    //   1666: ldc_w -1646004021
    //   1669: ixor
    //   1670: ixor
    //   1671: lookupswitch default -> 1696, -1299610750 -> 1654, 810070771 -> 11188
    //   1696: aload_0
    //   1697: new bigname/zprestige/webhack/features/setting/Setting
    //   1700: dup
    //   1701: ldc_w '㌖㶳䴞༲'
    //   1704: getstatic Perryc.0 : I
    //   1707: ifle -> 1721
    //   1710: ldc2_w 1186151684
    //   1713: l2i
    //   1714: ldc_w -673891656
    //   1717: ixor
    //   1718: goto -> 1729
    //   1721: ldc2_w -2006308657
    //   1724: l2i
    //   1725: ldc_w -561871911
    //   1728: ixor
    //   1729: ldc2_w -231884560
    //   1732: l2i
    //   1733: ldc_w -1724393867
    //   1736: ixor
    //   1737: ixor
    //   1738: lookupswitch default -> 11190, -92509895 -> 1721, 1039320467 -> 1764
    //   1764: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1767: ldc2_w -206281287
    //   1770: l2i
    //   1771: ldc_w -206281287
    //   1774: ixor
    //   1775: getstatic Perryc.0 : I
    //   1778: ifle -> 1792
    //   1781: ldc2_w -263119935
    //   1784: l2i
    //   1785: ldc_w -864436645
    //   1788: ixor
    //   1789: goto -> 1800
    //   1792: ldc2_w -1913247107
    //   1795: l2i
    //   1796: ldc_w 2003895277
    //   1799: ixor
    //   1800: ldc2_w 1587844682
    //   1803: l2i
    //   1804: ldc_w 512737668
    //   1807: ixor
    //   1808: ixor
    //   1809: lookupswitch default -> 1836, -2060217362 -> 1792, 2080633428 -> 11138
    //   1836: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1839: getstatic Perryc.0 : I
    //   1842: ifle -> 1856
    //   1845: ldc2_w -666687858
    //   1848: l2i
    //   1849: ldc_w 1407596001
    //   1852: ixor
    //   1853: goto -> 1864
    //   1856: ldc2_w 1296431034
    //   1859: l2i
    //   1860: ldc_w -1051064046
    //   1863: ixor
    //   1864: ldc2_w -2034005105
    //   1867: l2i
    //   1868: ldc_w 1606056492
    //   1871: ixor
    //   1872: ixor
    //   1873: lookupswitch default -> 10980, 1390207692 -> 1856, 1432751883 -> 1900
    //   1900: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1903: getstatic Perryc.c : I
    //   1906: iflt -> 1920
    //   1909: ldc2_w 66444267
    //   1912: l2i
    //   1913: ldc_w 1088632942
    //   1916: ixor
    //   1917: goto -> 1928
    //   1920: ldc2_w -449070539
    //   1923: l2i
    //   1924: ldc_w -332294008
    //   1927: ixor
    //   1928: ldc2_w -564890096
    //   1931: l2i
    //   1932: ldc_w 1107537712
    //   1935: ixor
    //   1936: ixor
    //   1937: lookupswitch default -> 11032, -1789002851 -> 1964, -549373275 -> 1920
    //   1964: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1967: getstatic Perryc.c : I
    //   1970: iflt -> 1984
    //   1973: ldc2_w 1421926475
    //   1976: l2i
    //   1977: ldc_w 1103007221
    //   1980: ixor
    //   1981: goto -> 1992
    //   1984: ldc2_w -1537444970
    //   1987: l2i
    //   1988: ldc_w 830368300
    //   1991: ixor
    //   1992: ldc2_w -1284264310
    //   1995: l2i
    //   1996: ldc_w 1058222627
    //   1999: ixor
    //   2000: ixor
    //   2001: lookupswitch default -> 2028, -1933348316 -> 1984, -1726025449 -> 11022
    //   2028: putfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2031: getstatic Perryc.0 : I
    //   2034: ifle -> 2048
    //   2037: ldc2_w 476028142
    //   2040: l2i
    //   2041: ldc_w -1903096512
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w -1647413286
    //   2051: l2i
    //   2052: ldc_w -609522283
    //   2055: ixor
    //   2056: ldc2_w -1164626394
    //   2059: l2i
    //   2060: ldc_w -538164806
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 11238, -138942926 -> 2048, 589065683 -> 2092
    //   2092: aload_0
    //   2093: getstatic Perryc.1 : I
    //   2096: ifeq -> 2110
    //   2099: ldc2_w 267311482
    //   2102: l2i
    //   2103: ldc_w -413867783
    //   2106: ixor
    //   2107: goto -> 2118
    //   2110: ldc2_w -1187628528
    //   2113: l2i
    //   2114: ldc_w 2146287690
    //   2117: ixor
    //   2118: ldc2_w -1869791639
    //   2121: l2i
    //   2122: ldc_w -1784266972
    //   2125: ixor
    //   2126: ixor
    //   2127: lookupswitch default -> 11006, -1007617257 -> 2152, -309249842 -> 2110
    //   2152: aload_0
    //   2153: new bigname/zprestige/webhack/features/setting/Setting
    //   2156: dup
    //   2157: ldc_w '㌜'
    //   2160: getstatic Perryc.1 : I
    //   2163: ifeq -> 2177
    //   2166: ldc2_w 944230772
    //   2169: l2i
    //   2170: ldc_w -1090625856
    //   2173: ixor
    //   2174: goto -> 2185
    //   2177: ldc2_w -1370462417
    //   2180: l2i
    //   2181: ldc_w -1668921425
    //   2184: ixor
    //   2185: ldc2_w -406012479
    //   2188: l2i
    //   2189: ldc_w 1612006915
    //   2192: ixor
    //   2193: ixor
    //   2194: lookupswitch default -> 11144, -1257252030 -> 2220, 23098486 -> 2177
    //   2220: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2223: ldc2_w -1399018927
    //   2226: l2i
    //   2227: ldc_w -1399018927
    //   2230: ixor
    //   2231: getstatic Perryc.c : I
    //   2234: iflt -> 2248
    //   2237: ldc2_w 846308743
    //   2240: l2i
    //   2241: ldc_w -1633025989
    //   2244: ixor
    //   2245: goto -> 2256
    //   2248: ldc2_w 1593046365
    //   2251: l2i
    //   2252: ldc_w -904329718
    //   2255: ixor
    //   2256: ldc2_w -288169663
    //   2259: l2i
    //   2260: ldc_w -249435061
    //   2263: ixor
    //   2264: ixor
    //   2265: lookupswitch default -> 11030, -1961230755 -> 2292, -1289181002 -> 2248
    //   2292: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2295: getstatic Perryc.0 : I
    //   2298: ifle -> 2312
    //   2301: ldc2_w -969825557
    //   2304: l2i
    //   2305: ldc_w -1272950591
    //   2308: ixor
    //   2309: goto -> 2320
    //   2312: ldc2_w -1514311641
    //   2315: l2i
    //   2316: ldc_w 1903302380
    //   2319: ixor
    //   2320: ldc2_w -1041438499
    //   2323: l2i
    //   2324: ldc_w 1892520927
    //   2327: ixor
    //   2328: ixor
    //   2329: lookupswitch default -> 11214, -1020229336 -> 2312, 1710104009 -> 2356
    //   2356: aload_0
    //   2357: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   2362: getstatic Perryc.c : I
    //   2365: iflt -> 2379
    //   2368: ldc2_w -2066478630
    //   2371: l2i
    //   2372: ldc_w 2016661790
    //   2375: ixor
    //   2376: goto -> 2387
    //   2379: ldc2_w 599885742
    //   2382: l2i
    //   2383: ldc_w 462526925
    //   2386: ixor
    //   2387: ldc2_w -1391297262
    //   2390: l2i
    //   2391: ldc_w 1664710580
    //   2394: ixor
    //   2395: ixor
    //   2396: lookupswitch default -> 11200, -159705915 -> 2424, 852284002 -> 2379
    //   2424: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2427: getstatic Perryc.0 : I
    //   2430: ifle -> 2444
    //   2433: ldc2_w 511481607
    //   2436: l2i
    //   2437: ldc_w 1984800441
    //   2440: ixor
    //   2441: goto -> 2452
    //   2444: ldc2_w -1268888065
    //   2447: l2i
    //   2448: ldc_w 942423541
    //   2451: ixor
    //   2452: ldc2_w 969794732
    //   2455: l2i
    //   2456: ldc_w 1546246967
    //   2459: ixor
    //   2460: ixor
    //   2461: lookupswitch default -> 10956, -376025199 -> 2488, 232066597 -> 2444
    //   2488: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2491: getstatic Perryc.0 : I
    //   2494: ifle -> 2508
    //   2497: ldc2_w -1503429926
    //   2500: l2i
    //   2501: ldc_w -1917678361
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -2071386643
    //   2511: l2i
    //   2512: ldc_w -1489813783
    //   2515: ixor
    //   2516: ldc2_w -1179289556
    //   2519: l2i
    //   2520: ldc_w -1475493971
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 11266, 839048325 -> 2552, 979972540 -> 2508
    //   2552: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2555: getstatic Perryc.0 : I
    //   2558: ifle -> 2572
    //   2561: ldc2_w 1151991282
    //   2564: l2i
    //   2565: ldc_w 47466885
    //   2568: ixor
    //   2569: goto -> 2580
    //   2572: ldc2_w -905037691
    //   2575: l2i
    //   2576: ldc_w -1939529655
    //   2579: ixor
    //   2580: ldc2_w 879128782
    //   2583: l2i
    //   2584: ldc_w 1667944145
    //   2587: ixor
    //   2588: ixor
    //   2589: lookupswitch default -> 11172, 292005587 -> 2616, 292620904 -> 2572
    //   2616: aload_0
    //   2617: getstatic Perryc.0 : I
    //   2620: ifle -> 2634
    //   2623: ldc2_w -1656360273
    //   2626: l2i
    //   2627: ldc_w -923010495
    //   2630: ixor
    //   2631: goto -> 2642
    //   2634: ldc2_w 1738908531
    //   2637: l2i
    //   2638: ldc_w 129147366
    //   2641: ixor
    //   2642: ldc2_w -1289553414
    //   2645: l2i
    //   2646: ldc_w 1412363883
    //   2649: ixor
    //   2650: ixor
    //   2651: lookupswitch default -> 10944, -2028270332 -> 2676, -1296955521 -> 2634
    //   2676: aload_0
    //   2677: new bigname/zprestige/webhack/features/setting/Setting
    //   2680: dup
    //   2681: ldc_w '㌖'
    //   2684: getstatic Perryc.0 : I
    //   2687: ifle -> 2701
    //   2690: ldc2_w 1580045743
    //   2693: l2i
    //   2694: ldc_w 2099257909
    //   2697: ixor
    //   2698: goto -> 2709
    //   2701: ldc2_w 571373071
    //   2704: l2i
    //   2705: ldc_w 1910115385
    //   2708: ixor
    //   2709: ldc2_w 250272079
    //   2712: l2i
    //   2713: ldc_w 1412763496
    //   2716: ixor
    //   2717: ixor
    //   2718: lookupswitch default -> 11204, 151759889 -> 2744, 2043830717 -> 2701
    //   2744: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2747: ldc2_w 1810496523
    //   2750: l2i
    //   2751: ldc_w 1810496523
    //   2754: ixor
    //   2755: getstatic Perryc.0 : I
    //   2758: ifle -> 2772
    //   2761: ldc2_w -1632075134
    //   2764: l2i
    //   2765: ldc_w -1022695277
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w 12254656
    //   2775: l2i
    //   2776: ldc_w 1643997327
    //   2779: ixor
    //   2780: ldc2_w -452687664
    //   2783: l2i
    //   2784: ldc_w -87416566
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 2816, -503317137 -> 2772, 1115472843 -> 11150
    //   2816: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2819: ldc2_w 171108243
    //   2822: l2i
    //   2823: ldc_w 171108243
    //   2826: ixor
    //   2827: getstatic Perryc.c : I
    //   2830: iflt -> 2844
    //   2833: ldc2_w 505553568
    //   2836: l2i
    //   2837: ldc_w 1009911706
    //   2840: ixor
    //   2841: goto -> 2852
    //   2844: ldc2_w -383697314
    //   2847: l2i
    //   2848: ldc_w -626271003
    //   2851: ixor
    //   2852: ldc2_w 546894805
    //   2855: l2i
    //   2856: ldc_w -2034692031
    //   2859: ixor
    //   2860: ixor
    //   2861: lookupswitch default -> 11218, -2077112658 -> 2844, -1783955153 -> 2888
    //   2888: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2891: ldc2_w -1085626190
    //   2894: l2i
    //   2895: ldc_w -1085626291
    //   2898: ixor
    //   2899: getstatic Perryc.c : I
    //   2902: iflt -> 2916
    //   2905: ldc2_w -1199507611
    //   2908: l2i
    //   2909: ldc_w -1400704851
    //   2912: ixor
    //   2913: goto -> 2924
    //   2916: ldc2_w 1140041028
    //   2919: l2i
    //   2920: ldc_w -984066562
    //   2923: ixor
    //   2924: ldc2_w -1633694301
    //   2927: l2i
    //   2928: ldc_w -116241437
    //   2931: ixor
    //   2932: ixor
    //   2933: lookupswitch default -> 2960, -1531799394 -> 2916, 1938784648 -> 10948
    //   2960: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2963: getstatic Perryc.1 : I
    //   2966: ifeq -> 2980
    //   2969: ldc2_w -1668109789
    //   2972: l2i
    //   2973: ldc_w 220763267
    //   2976: ixor
    //   2977: goto -> 2988
    //   2980: ldc2_w -1726659585
    //   2983: l2i
    //   2984: ldc_w -533482597
    //   2987: ixor
    //   2988: ldc2_w 649706261
    //   2991: l2i
    //   2992: ldc_w -1590037547
    //   2995: ixor
    //   2996: ixor
    //   2997: lookupswitch default -> 3024, -64650805 -> 2980, 372930144 -> 11180
    //   3024: aload_0
    //   3025: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   3030: getstatic Perryc.1 : I
    //   3033: ifeq -> 3047
    //   3036: ldc2_w 188516092
    //   3039: l2i
    //   3040: ldc_w -609530196
    //   3043: ixor
    //   3044: goto -> 3055
    //   3047: ldc2_w -421976856
    //   3050: l2i
    //   3051: ldc_w -441767949
    //   3054: ixor
    //   3055: ldc2_w -1399148189
    //   3058: l2i
    //   3059: ldc_w -1529551482
    //   3062: ixor
    //   3063: ixor
    //   3064: lookupswitch default -> 10988, -656827211 -> 3047, 188504062 -> 3092
    //   3092: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3095: getstatic Perryc.0 : I
    //   3098: ifle -> 3112
    //   3101: ldc2_w 1022292933
    //   3104: l2i
    //   3105: ldc_w 1904696035
    //   3108: ixor
    //   3109: goto -> 3120
    //   3112: ldc2_w 663787125
    //   3115: l2i
    //   3116: ldc_w 758983338
    //   3119: ixor
    //   3120: ldc2_w -1032185997
    //   3123: l2i
    //   3124: ldc_w -1763123402
    //   3127: ixor
    //   3128: ixor
    //   3129: lookupswitch default -> 11196, 435904867 -> 3112, 1581216922 -> 3156
    //   3156: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3159: getstatic Perryc.1 : I
    //   3162: ifeq -> 3176
    //   3165: ldc2_w -1272234942
    //   3168: l2i
    //   3169: ldc_w -1058329146
    //   3172: ixor
    //   3173: goto -> 3184
    //   3176: ldc2_w -1015387470
    //   3179: l2i
    //   3180: ldc_w 602366819
    //   3183: ixor
    //   3184: ldc2_w -457788705
    //   3187: l2i
    //   3188: ldc_w -372135004
    //   3191: ixor
    //   3192: ixor
    //   3193: lookupswitch default -> 3220, -1791973932 -> 3176, 2040989951 -> 11208
    //   3220: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3223: getstatic Perryc.1 : I
    //   3226: ifeq -> 3240
    //   3229: ldc2_w -484742431
    //   3232: l2i
    //   3233: ldc_w -762008004
    //   3236: ixor
    //   3237: goto -> 3248
    //   3240: ldc2_w -1702194287
    //   3243: l2i
    //   3244: ldc_w -1110440292
    //   3247: ixor
    //   3248: ldc2_w 352131427
    //   3251: l2i
    //   3252: ldc_w 1812622622
    //   3255: ixor
    //   3256: ixor
    //   3257: lookupswitch default -> 11094, 1232646304 -> 3240, 1605230960 -> 3284
    //   3284: aload_0
    //   3285: getstatic Perryc.0 : I
    //   3288: ifle -> 3302
    //   3291: ldc2_w 1553520583
    //   3294: l2i
    //   3295: ldc_w -1039036756
    //   3298: ixor
    //   3299: goto -> 3310
    //   3302: ldc2_w 1591987639
    //   3305: l2i
    //   3306: ldc_w 1780144345
    //   3309: ixor
    //   3310: ldc2_w -2007662320
    //   3313: l2i
    //   3314: ldc_w -722583755
    //   3317: ixor
    //   3318: ixor
    //   3319: lookupswitch default -> 3344, -1416267662 -> 3302, -1036851378 -> 11012
    //   3344: aload_0
    //   3345: new bigname/zprestige/webhack/features/setting/Setting
    //   3348: dup
    //   3349: ldc_w '㌁㶲䴕'
    //   3352: getstatic Perryc.c : I
    //   3355: iflt -> 3369
    //   3358: ldc2_w 1490419407
    //   3361: l2i
    //   3362: ldc_w 698848187
    //   3365: ixor
    //   3366: goto -> 3377
    //   3369: ldc2_w -1570227724
    //   3372: l2i
    //   3373: ldc_w 1673549589
    //   3376: ixor
    //   3377: ldc2_w -657707031
    //   3380: l2i
    //   3381: ldc_w -1518472630
    //   3384: ixor
    //   3385: ixor
    //   3386: lookupswitch default -> 11028, -1139166398 -> 3412, 214151383 -> 3369
    //   3412: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3415: ldc2_w -871469463
    //   3418: l2i
    //   3419: ldc_w -871469418
    //   3422: ixor
    //   3423: getstatic Perryc.0 : I
    //   3426: ifle -> 3440
    //   3429: ldc2_w 1344876456
    //   3432: l2i
    //   3433: ldc_w -434974551
    //   3436: ixor
    //   3437: goto -> 3448
    //   3440: ldc2_w 283217717
    //   3443: l2i
    //   3444: ldc_w -1438793771
    //   3447: ixor
    //   3448: ldc2_w -1113376598
    //   3451: l2i
    //   3452: ldc_w -98168744
    //   3455: ixor
    //   3456: ixor
    //   3457: lookupswitch default -> 3484, -239151117 -> 11220, -125623359 -> 3440
    //   3484: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3487: ldc2_w -1348873066
    //   3490: l2i
    //   3491: ldc_w -1348873066
    //   3494: ixor
    //   3495: getstatic Perryc.0 : I
    //   3498: ifle -> 3512
    //   3501: ldc2_w -299449748
    //   3504: l2i
    //   3505: ldc_w -1678964793
    //   3508: ixor
    //   3509: goto -> 3520
    //   3512: ldc2_w 1776346497
    //   3515: l2i
    //   3516: ldc_w 1158182538
    //   3519: ixor
    //   3520: ldc2_w -501093047
    //   3523: l2i
    //   3524: ldc_w 879537434
    //   3527: ixor
    //   3528: ixor
    //   3529: lookupswitch default -> 11052, -1551464968 -> 3512, -89795752 -> 3556
    //   3556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3559: ldc2_w 811571330
    //   3562: l2i
    //   3563: ldc_w 811571325
    //   3566: ixor
    //   3567: getstatic Perryc.c : I
    //   3570: iflt -> 3584
    //   3573: ldc2_w -1861423330
    //   3576: l2i
    //   3577: ldc_w 664525207
    //   3580: ixor
    //   3581: goto -> 3592
    //   3584: ldc2_w 1807579681
    //   3587: l2i
    //   3588: ldc_w -2045907193
    //   3591: ixor
    //   3592: ldc2_w -133405015
    //   3595: l2i
    //   3596: ldc_w -728499743
    //   3599: ixor
    //   3600: ixor
    //   3601: lookupswitch default -> 3628, -1710708287 -> 11146, 1042513162 -> 3584
    //   3628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3631: getstatic Perryc.1 : I
    //   3634: ifeq -> 3648
    //   3637: ldc2_w -1376322333
    //   3640: l2i
    //   3641: ldc_w -722738441
    //   3644: ixor
    //   3645: goto -> 3656
    //   3648: ldc2_w 1336195894
    //   3651: l2i
    //   3652: ldc_w 1009120491
    //   3655: ixor
    //   3656: ldc2_w -2048003998
    //   3659: l2i
    //   3660: ldc_w -346101975
    //   3663: ixor
    //   3664: ixor
    //   3665: lookupswitch default -> 3692, -1256064035 -> 3648, 397281631 -> 11232
    //   3692: aload_0
    //   3693: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   3698: getstatic Perryc.0 : I
    //   3701: ifle -> 3715
    //   3704: ldc2_w 1941633864
    //   3707: l2i
    //   3708: ldc_w -843001688
    //   3711: ixor
    //   3712: goto -> 3723
    //   3715: ldc2_w -454695581
    //   3718: l2i
    //   3719: ldc_w -2009068186
    //   3722: ixor
    //   3723: ldc2_w -1930452240
    //   3726: l2i
    //   3727: ldc_w -1483574112
    //   3730: ixor
    //   3731: ixor
    //   3732: lookupswitch default -> 10978, -1794638416 -> 3715, 1205354069 -> 3760
    //   3760: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3763: getstatic Perryc.0 : I
    //   3766: ifle -> 3780
    //   3769: ldc2_w -1595846180
    //   3772: l2i
    //   3773: ldc_w -2108831687
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 1537451037
    //   3783: l2i
    //   3784: ldc_w 984366118
    //   3787: ixor
    //   3788: ldc2_w -1893490874
    //   3791: l2i
    //   3792: ldc_w 250964021
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 3824, -1552257386 -> 10974, 982863462 -> 3780
    //   3824: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3827: getstatic Perryc.1 : I
    //   3830: ifeq -> 3844
    //   3833: ldc2_w 1424164265
    //   3836: l2i
    //   3837: ldc_w -728773856
    //   3840: ixor
    //   3841: goto -> 3852
    //   3844: ldc2_w -1602528376
    //   3847: l2i
    //   3848: ldc_w 631547478
    //   3851: ixor
    //   3852: ldc2_w -1753432149
    //   3855: l2i
    //   3856: ldc_w -16575641
    //   3859: ixor
    //   3860: ixor
    //   3861: lookupswitch default -> 3888, -401382843 -> 11120, 2093955422 -> 3844
    //   3888: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3891: getstatic Perryc.1 : I
    //   3894: ifeq -> 3908
    //   3897: ldc2_w 868390720
    //   3900: l2i
    //   3901: ldc_w -1012818721
    //   3904: ixor
    //   3905: goto -> 3916
    //   3908: ldc2_w 229512999
    //   3911: l2i
    //   3912: ldc_w 180059082
    //   3915: ixor
    //   3916: ldc2_w -1054881828
    //   3919: l2i
    //   3920: ldc_w -845974983
    //   3923: ixor
    //   3924: ixor
    //   3925: lookupswitch default -> 3952, -723708978 -> 3908, -51396998 -> 11004
    //   3952: aload_0
    //   3953: getstatic Perryc.1 : I
    //   3956: ifeq -> 3970
    //   3959: ldc2_w 937211078
    //   3962: l2i
    //   3963: ldc_w 353290705
    //   3966: ixor
    //   3967: goto -> 3978
    //   3970: ldc2_w -271121722
    //   3973: l2i
    //   3974: ldc_w -620343125
    //   3977: ixor
    //   3978: ldc2_w 842466008
    //   3981: l2i
    //   3982: ldc_w -1519763985
    //   3985: ixor
    //   3986: ixor
    //   3987: lookupswitch default -> 10976, -1551078054 -> 4012, -1248902624 -> 3970
    //   4012: aload_0
    //   4013: new bigname/zprestige/webhack/features/setting/Setting
    //   4016: dup
    //   4017: ldc_w '㌟㶲'
    //   4020: getstatic Perryc.c : I
    //   4023: iflt -> 4037
    //   4026: ldc2_w -1743276089
    //   4029: l2i
    //   4030: ldc_w 141054928
    //   4033: ixor
    //   4034: goto -> 4045
    //   4037: ldc2_w -96453135
    //   4040: l2i
    //   4041: ldc_w -1171454308
    //   4044: ixor
    //   4045: ldc2_w -2138209506
    //   4048: l2i
    //   4049: ldc_w -862587543
    //   4052: ixor
    //   4053: ixor
    //   4054: lookupswitch default -> 4080, -597192096 -> 11136, 158267716 -> 4037
    //   4080: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4083: ldc2_w 2012224546
    //   4086: l2i
    //   4087: ldc_w 2012224546
    //   4090: ixor
    //   4091: getstatic Perryc.c : I
    //   4094: iflt -> 4108
    //   4097: ldc2_w 578382349
    //   4100: l2i
    //   4101: ldc_w 409095571
    //   4104: ixor
    //   4105: goto -> 4116
    //   4108: ldc2_w 318937034
    //   4111: l2i
    //   4112: ldc_w -440460203
    //   4115: ixor
    //   4116: ldc2_w 1610523015
    //   4119: l2i
    //   4120: ldc_w -549518190
    //   4123: ixor
    //   4124: ixor
    //   4125: lookupswitch default -> 10996, -1160084853 -> 4108, 1987849866 -> 4152
    //   4152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4155: ldc2_w -393155338
    //   4158: l2i
    //   4159: ldc_w -393155338
    //   4162: ixor
    //   4163: getstatic Perryc.1 : I
    //   4166: ifeq -> 4180
    //   4169: ldc2_w 1726800390
    //   4172: l2i
    //   4173: ldc_w -328456075
    //   4176: ixor
    //   4177: goto -> 4188
    //   4180: ldc2_w 1156931818
    //   4183: l2i
    //   4184: ldc_w -1813782277
    //   4187: ixor
    //   4188: ldc2_w -1938486910
    //   4191: l2i
    //   4192: ldc_w 1772317915
    //   4195: ixor
    //   4196: ixor
    //   4197: lookupswitch default -> 11132, 851502408 -> 4224, 1867951914 -> 4180
    //   4224: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4227: ldc2_w -1711916593
    //   4230: l2i
    //   4231: ldc_w -1711916752
    //   4234: ixor
    //   4235: getstatic Perryc.0 : I
    //   4238: ifle -> 4252
    //   4241: ldc2_w 1481676722
    //   4244: l2i
    //   4245: ldc_w -1800400943
    //   4248: ixor
    //   4249: goto -> 4260
    //   4252: ldc2_w 70934038
    //   4255: l2i
    //   4256: ldc_w 1692268069
    //   4259: ixor
    //   4260: ldc2_w 506556809
    //   4263: l2i
    //   4264: ldc_w 994644677
    //   4267: ixor
    //   4268: ixor
    //   4269: lookupswitch default -> 4296, -375850193 -> 10994, 114314365 -> 4252
    //   4296: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4299: getstatic Perryc.0 : I
    //   4302: ifle -> 4316
    //   4305: ldc2_w -793334869
    //   4308: l2i
    //   4309: ldc_w 1999675431
    //   4312: ixor
    //   4313: goto -> 4324
    //   4316: ldc2_w -1801826035
    //   4319: l2i
    //   4320: ldc_w 1045753751
    //   4323: ixor
    //   4324: ldc2_w -731108831
    //   4327: l2i
    //   4328: ldc_w -1063326409
    //   4331: ixor
    //   4332: ixor
    //   4333: lookupswitch default -> 11118, -1284191078 -> 4316, -1103332980 -> 4360
    //   4360: aload_0
    //   4361: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   4366: getstatic Perryc.0 : I
    //   4369: ifle -> 4383
    //   4372: ldc2_w 1610381794
    //   4375: l2i
    //   4376: ldc_w 51056078
    //   4379: ixor
    //   4380: goto -> 4391
    //   4383: ldc2_w -1433617359
    //   4386: l2i
    //   4387: ldc_w -1436659438
    //   4390: ixor
    //   4391: ldc2_w -2105102638
    //   4394: l2i
    //   4395: ldc_w 194484022
    //   4398: ixor
    //   4399: ixor
    //   4400: lookupswitch default -> 10990, -1983654713 -> 4428, -706327096 -> 4383
    //   4428: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4431: getstatic Perryc.1 : I
    //   4434: ifeq -> 4448
    //   4437: ldc2_w -1427881491
    //   4440: l2i
    //   4441: ldc_w 753879618
    //   4444: ixor
    //   4445: goto -> 4456
    //   4448: ldc2_w -91646103
    //   4451: l2i
    //   4452: ldc_w 563942597
    //   4455: ixor
    //   4456: ldc2_w -108752409
    //   4459: l2i
    //   4460: ldc_w -1499628963
    //   4463: ixor
    //   4464: ixor
    //   4465: lookupswitch default -> 11256, -2079496170 -> 4492, -653074411 -> 4448
    //   4492: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4495: getstatic Perryc.c : I
    //   4498: iflt -> 4512
    //   4501: ldc2_w 1998870469
    //   4504: l2i
    //   4505: ldc_w 659533732
    //   4508: ixor
    //   4509: goto -> 4520
    //   4512: ldc2_w -724765845
    //   4515: l2i
    //   4516: ldc_w -66974370
    //   4519: ixor
    //   4520: ldc2_w -560669858
    //   4523: l2i
    //   4524: ldc_w -803572388
    //   4527: ixor
    //   4528: ixor
    //   4529: lookupswitch default -> 10962, 641749047 -> 4556, 1592088163 -> 4512
    //   4556: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4559: getstatic Perryc.c : I
    //   4562: iflt -> 4576
    //   4565: ldc2_w 456850284
    //   4568: l2i
    //   4569: ldc_w -531473592
    //   4572: ixor
    //   4573: goto -> 4584
    //   4576: ldc2_w 371356120
    //   4579: l2i
    //   4580: ldc_w 618264596
    //   4583: ixor
    //   4584: ldc2_w 226823131
    //   4587: l2i
    //   4588: ldc_w 335363212
    //   4591: ixor
    //   4592: ixor
    //   4593: lookupswitch default -> 11156, -451897485 -> 4576, 746831515 -> 4620
    //   4620: aload_0
    //   4621: getstatic Perryc.1 : I
    //   4624: ifeq -> 4638
    //   4627: ldc2_w 476397837
    //   4630: l2i
    //   4631: ldc_w 1893708928
    //   4634: ixor
    //   4635: goto -> 4646
    //   4638: ldc2_w -1429706450
    //   4641: l2i
    //   4642: ldc_w 96095818
    //   4645: ixor
    //   4646: ldc2_w -1554801304
    //   4649: l2i
    //   4650: ldc_w -747700133
    //   4653: ixor
    //   4654: ixor
    //   4655: lookupswitch default -> 4680, 478570686 -> 11268, 999919738 -> 4638
    //   4680: aload_0
    //   4681: new bigname/zprestige/webhack/features/setting/Setting
    //   4684: dup
    //   4685: ldc_w '㌒㶹䴙༯๮'
    //   4688: getstatic Perryc.1 : I
    //   4691: ifeq -> 4705
    //   4694: ldc2_w -1062868441
    //   4697: l2i
    //   4698: ldc_w -1612560037
    //   4701: ixor
    //   4702: goto -> 4713
    //   4705: ldc2_w -851279903
    //   4708: l2i
    //   4709: ldc_w 1989632465
    //   4712: ixor
    //   4713: ldc2_w -1370239321
    //   4716: l2i
    //   4717: ldc_w -550926174
    //   4720: ixor
    //   4721: ixor
    //   4722: lookupswitch default -> 11184, -894478283 -> 4748, 775808377 -> 4705
    //   4748: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4751: ldc2_w -2120887703
    //   4754: l2i
    //   4755: ldc_w -2120887703
    //   4758: ixor
    //   4759: getstatic Perryc.c : I
    //   4762: iflt -> 4776
    //   4765: ldc2_w -1984899952
    //   4768: l2i
    //   4769: ldc_w -430876399
    //   4772: ixor
    //   4773: goto -> 4784
    //   4776: ldc2_w 1785371227
    //   4779: l2i
    //   4780: ldc_w -1420033846
    //   4783: ixor
    //   4784: ldc2_w 2007196922
    //   4787: l2i
    //   4788: ldc_w -9625209
    //   4791: ixor
    //   4792: ixor
    //   4793: lookupswitch default -> 11042, -416298756 -> 4776, 1241047020 -> 4820
    //   4820: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4823: getstatic Perryc.c : I
    //   4826: iflt -> 4840
    //   4829: ldc2_w -1731799588
    //   4832: l2i
    //   4833: ldc_w -875227415
    //   4836: ixor
    //   4837: goto -> 4848
    //   4840: ldc2_w 1516274388
    //   4843: l2i
    //   4844: ldc_w -336772402
    //   4847: ixor
    //   4848: ldc2_w 1844882637
    //   4851: l2i
    //   4852: ldc_w -1189576156
    //   4855: ixor
    //   4856: ixor
    //   4857: lookupswitch default -> 4884, -2013401636 -> 11108, -1530321062 -> 4840
    //   4884: aload_0
    //   4885: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   4890: getstatic Perryc.c : I
    //   4893: iflt -> 4907
    //   4896: ldc2_w 2126315577
    //   4899: l2i
    //   4900: ldc_w -1094699607
    //   4903: ixor
    //   4904: goto -> 4915
    //   4907: ldc2_w -181760936
    //   4910: l2i
    //   4911: ldc_w -1978025638
    //   4914: ixor
    //   4915: ldc2_w -1711839546
    //   4918: l2i
    //   4919: ldc_w -316742702
    //   4922: ixor
    //   4923: ixor
    //   4924: lookupswitch default -> 11110, -1265323900 -> 4907, 198881302 -> 4952
    //   4952: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4955: getstatic Perryc.0 : I
    //   4958: ifle -> 4972
    //   4961: ldc2_w 867869363
    //   4964: l2i
    //   4965: ldc_w 1480061206
    //   4968: ixor
    //   4969: goto -> 4980
    //   4972: ldc2_w -2026207049
    //   4975: l2i
    //   4976: ldc_w 974509394
    //   4979: ixor
    //   4980: ldc2_w 1368019056
    //   4983: l2i
    //   4984: ldc_w -425357602
    //   4987: ixor
    //   4988: ixor
    //   4989: lookupswitch default -> 5016, -593326837 -> 11096, 62191036 -> 4972
    //   5016: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5019: getstatic Perryc.c : I
    //   5022: iflt -> 5036
    //   5025: ldc2_w -1832713885
    //   5028: l2i
    //   5029: ldc_w 1348078195
    //   5032: ixor
    //   5033: goto -> 5044
    //   5036: ldc2_w -1793124346
    //   5039: l2i
    //   5040: ldc_w -643692772
    //   5043: ixor
    //   5044: ldc2_w 1164096377
    //   5047: l2i
    //   5048: ldc_w -968320436
    //   5051: ixor
    //   5052: ixor
    //   5053: lookupswitch default -> 11166, -812173777 -> 5080, 1102258725 -> 5036
    //   5080: putfield Rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5083: getstatic Perryc.1 : I
    //   5086: ifeq -> 5100
    //   5089: ldc2_w -779583972
    //   5092: l2i
    //   5093: ldc_w 1244953432
    //   5096: ixor
    //   5097: goto -> 5108
    //   5100: ldc2_w 1234260288
    //   5103: l2i
    //   5104: ldc_w 840343993
    //   5107: ixor
    //   5108: ldc2_w -54107512
    //   5111: l2i
    //   5112: ldc_w -921598143
    //   5115: ixor
    //   5116: ixor
    //   5117: lookupswitch default -> 5144, -1368661875 -> 11066, 1821274612 -> 5100
    //   5144: aload_0
    //   5145: getstatic Perryc.1 : I
    //   5148: ifeq -> 5162
    //   5151: ldc2_w -119273917
    //   5154: l2i
    //   5155: ldc_w -2054990161
    //   5158: ixor
    //   5159: goto -> 5170
    //   5162: ldc2_w -2039831228
    //   5165: l2i
    //   5166: ldc_w -989068890
    //   5169: ixor
    //   5170: ldc2_w -1685294203
    //   5173: l2i
    //   5174: ldc_w 1697039516
    //   5177: ixor
    //   5178: ixor
    //   5179: lookupswitch default -> 5204, -2083657739 -> 11258, -1622919717 -> 5162
    //   5204: aload_0
    //   5205: new bigname/zprestige/webhack/features/setting/Setting
    //   5208: dup
    //   5209: ldc_w '㌟㶿䴚'
    //   5212: getstatic Perryc.1 : I
    //   5215: ifeq -> 5229
    //   5218: ldc2_w -1280032801
    //   5221: l2i
    //   5222: ldc_w 1012556697
    //   5225: ixor
    //   5226: goto -> 5237
    //   5229: ldc2_w 1781669322
    //   5232: l2i
    //   5233: ldc_w -298420871
    //   5236: ixor
    //   5237: ldc2_w 1628585686
    //   5240: l2i
    //   5241: ldc_w 1527072001
    //   5244: ixor
    //   5245: ixor
    //   5246: lookupswitch default -> 11210, -1241962607 -> 5229, -1106046108 -> 5272
    //   5272: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5275: ldc2_w 1405287228
    //   5278: l2i
    //   5279: ldc_w 1405287363
    //   5282: ixor
    //   5283: getstatic Perryc.1 : I
    //   5286: ifeq -> 5300
    //   5289: ldc2_w -2041184342
    //   5292: l2i
    //   5293: ldc_w -1751918187
    //   5296: ixor
    //   5297: goto -> 5308
    //   5300: ldc2_w -1333884937
    //   5303: l2i
    //   5304: ldc_w 1963716568
    //   5307: ixor
    //   5308: ldc2_w -83158974
    //   5311: l2i
    //   5312: ldc_w 1436113556
    //   5315: ixor
    //   5316: ixor
    //   5317: lookupswitch default -> 5344, -2136095391 -> 5300, -1084988183 -> 11152
    //   5344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5347: ldc2_w -294185349
    //   5350: l2i
    //   5351: ldc_w -294185349
    //   5354: ixor
    //   5355: getstatic Perryc.c : I
    //   5358: iflt -> 5372
    //   5361: ldc2_w 1164045383
    //   5364: l2i
    //   5365: ldc_w -520314285
    //   5368: ixor
    //   5369: goto -> 5380
    //   5372: ldc2_w -1728438742
    //   5375: l2i
    //   5376: ldc_w 1855053631
    //   5379: ixor
    //   5380: ldc2_w -1614760590
    //   5383: l2i
    //   5384: ldc_w 1748575802
    //   5387: ixor
    //   5388: ixor
    //   5389: lookupswitch default -> 5416, -1917521164 -> 5372, 1382341980 -> 11088
    //   5416: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5419: ldc2_w -1567526818
    //   5422: l2i
    //   5423: ldc_w -1567526751
    //   5426: ixor
    //   5427: getstatic Perryc.1 : I
    //   5430: ifeq -> 5444
    //   5433: ldc2_w 532464263
    //   5436: l2i
    //   5437: ldc_w -722414886
    //   5440: ixor
    //   5441: goto -> 5452
    //   5444: ldc2_w -780771223
    //   5447: l2i
    //   5448: ldc_w 2096887968
    //   5451: ixor
    //   5452: ldc2_w 649535140
    //   5455: l2i
    //   5456: ldc_w 1876794929
    //   5459: ixor
    //   5460: ixor
    //   5461: lookupswitch default -> 11260, -2111401784 -> 5444, -454616996 -> 5488
    //   5488: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5491: getstatic Perryc.1 : I
    //   5494: ifeq -> 5508
    //   5497: ldc2_w 965822819
    //   5500: l2i
    //   5501: ldc_w 1025929790
    //   5504: ixor
    //   5505: goto -> 5516
    //   5508: ldc2_w -449109922
    //   5511: l2i
    //   5512: ldc_w -1932867597
    //   5515: ixor
    //   5516: ldc2_w 1200390270
    //   5519: l2i
    //   5520: ldc_w -1570067219
    //   5523: ixor
    //   5524: ixor
    //   5525: lookupswitch default -> 11148, -1944597698 -> 5552, -514779186 -> 5508
    //   5552: aload_0
    //   5553: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   5558: getstatic Perryc.c : I
    //   5561: iflt -> 5575
    //   5564: ldc2_w -1215858508
    //   5567: l2i
    //   5568: ldc_w 853635936
    //   5571: ixor
    //   5572: goto -> 5583
    //   5575: ldc2_w -45357778
    //   5578: l2i
    //   5579: ldc_w 1247943335
    //   5582: ixor
    //   5583: ldc2_w -32803307
    //   5586: l2i
    //   5587: ldc_w -2024660937
    //   5590: ixor
    //   5591: ixor
    //   5592: lookupswitch default -> 5620, -62956042 -> 11078, 1362319749 -> 5575
    //   5620: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5623: getstatic Perryc.1 : I
    //   5626: ifeq -> 5640
    //   5629: ldc2_w 186059388
    //   5632: l2i
    //   5633: ldc_w 1583185974
    //   5636: ixor
    //   5637: goto -> 5648
    //   5640: ldc2_w -290228132
    //   5643: l2i
    //   5644: ldc_w 1520899973
    //   5647: ixor
    //   5648: ldc2_w 1841836179
    //   5651: l2i
    //   5652: ldc_w 1692411096
    //   5655: ixor
    //   5656: ixor
    //   5657: lookupswitch default -> 5684, 1453911850 -> 5640, 1549966849 -> 11060
    //   5684: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5687: getstatic Perryc.0 : I
    //   5690: ifle -> 5704
    //   5693: ldc2_w 1995051744
    //   5696: l2i
    //   5697: ldc_w -721455791
    //   5700: ixor
    //   5701: goto -> 5712
    //   5704: ldc2_w 1333583800
    //   5707: l2i
    //   5708: ldc_w -1270457885
    //   5711: ixor
    //   5712: ldc2_w -806440914
    //   5715: l2i
    //   5716: ldc_w -1306636356
    //   5719: ixor
    //   5720: ixor
    //   5721: lookupswitch default -> 5748, -538601437 -> 11228, -48339009 -> 5704
    //   5748: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5751: getstatic Perryc.0 : I
    //   5754: ifle -> 5768
    //   5757: ldc2_w -1852506560
    //   5760: l2i
    //   5761: ldc_w 1967807927
    //   5764: ixor
    //   5765: goto -> 5776
    //   5768: ldc2_w 302515506
    //   5771: l2i
    //   5772: ldc_w 233928212
    //   5775: ixor
    //   5776: ldc2_w -750015528
    //   5779: l2i
    //   5780: ldc_w -619793807
    //   5783: ixor
    //   5784: ixor
    //   5785: lookupswitch default -> 11162, -325338530 -> 5768, 398224015 -> 5812
    //   5812: aload_0
    //   5813: getstatic Perryc.c : I
    //   5816: iflt -> 5830
    //   5819: ldc2_w 111777855
    //   5822: l2i
    //   5823: ldc_w -1448743077
    //   5826: ixor
    //   5827: goto -> 5838
    //   5830: ldc2_w 1031423629
    //   5833: l2i
    //   5834: ldc_w 1522969483
    //   5837: ixor
    //   5838: ldc2_w -650399651
    //   5841: l2i
    //   5842: ldc_w -29065955
    //   5845: ixor
    //   5846: ixor
    //   5847: lookupswitch default -> 5872, -2005681628 -> 11212, -1991824819 -> 5830
    //   5872: aload_0
    //   5873: new bigname/zprestige/webhack/features/setting/Setting
    //   5876: dup
    //   5877: ldc_w '㌜㶖䴗༰๱鰰'
    //   5880: getstatic Perryc.c : I
    //   5883: iflt -> 5897
    //   5886: ldc2_w -1441503009
    //   5889: l2i
    //   5890: ldc_w 2120907148
    //   5893: ixor
    //   5894: goto -> 5905
    //   5897: ldc2_w 665884592
    //   5900: l2i
    //   5901: ldc_w 794583465
    //   5904: ixor
    //   5905: ldc2_w 1866528283
    //   5908: l2i
    //   5909: ldc_w -1202542186
    //   5912: ixor
    //   5913: ixor
    //   5914: lookupswitch default -> 5940, -1830871660 -> 5897, 57429726 -> 11098
    //   5940: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5943: ldc2_w -345397119
    //   5946: l2i
    //   5947: ldc_w -345396996
    //   5950: ixor
    //   5951: getstatic Perryc.c : I
    //   5954: iflt -> 5968
    //   5957: ldc2_w -1152411717
    //   5960: l2i
    //   5961: ldc_w 665121413
    //   5964: ixor
    //   5965: goto -> 5976
    //   5968: ldc2_w -1843309958
    //   5971: l2i
    //   5972: ldc_w -456524499
    //   5975: ixor
    //   5976: ldc2_w 1507883403
    //   5979: l2i
    //   5980: ldc_w -295455883
    //   5983: ixor
    //   5984: ixor
    //   5985: lookupswitch default -> 6012, -340402139 -> 5968, 728281024 -> 11122
    //   6012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6015: ldc2_w -1938261331
    //   6018: l2i
    //   6019: ldc_w -1938261331
    //   6022: ixor
    //   6023: getstatic Perryc.1 : I
    //   6026: ifeq -> 6040
    //   6029: ldc2_w 994215641
    //   6032: l2i
    //   6033: ldc_w 463698076
    //   6036: ixor
    //   6037: goto -> 6048
    //   6040: ldc2_w -1617800671
    //   6043: l2i
    //   6044: ldc_w 722909642
    //   6047: ixor
    //   6048: ldc2_w 1731222006
    //   6051: l2i
    //   6052: ldc_w -249622414
    //   6055: ixor
    //   6056: ixor
    //   6057: lookupswitch default -> 6084, -1227966527 -> 10950, -617745985 -> 6040
    //   6084: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6087: ldc2_w -184464482
    //   6090: l2i
    //   6091: ldc_w -184464543
    //   6094: ixor
    //   6095: getstatic Perryc.1 : I
    //   6098: ifeq -> 6112
    //   6101: ldc2_w 754967214
    //   6104: l2i
    //   6105: ldc_w -1508365793
    //   6108: ixor
    //   6109: goto -> 6120
    //   6112: ldc2_w 872088787
    //   6115: l2i
    //   6116: ldc_w -236556757
    //   6119: ixor
    //   6120: ldc2_w -1088804717
    //   6123: l2i
    //   6124: ldc_w 2131593743
    //   6127: ixor
    //   6128: ixor
    //   6129: lookupswitch default -> 6156, 1257269805 -> 11048, 2126925878 -> 6112
    //   6156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6159: getstatic Perryc.c : I
    //   6162: iflt -> 6176
    //   6165: ldc2_w 1916690957
    //   6168: l2i
    //   6169: ldc_w -834224556
    //   6172: ixor
    //   6173: goto -> 6184
    //   6176: ldc2_w -1100849917
    //   6179: l2i
    //   6180: ldc_w 258686371
    //   6183: ixor
    //   6184: ldc2_w 1267038687
    //   6187: l2i
    //   6188: ldc_w 282090624
    //   6191: ixor
    //   6192: ixor
    //   6193: lookupswitch default -> 11100, -416417530 -> 6176, -363051521 -> 6220
    //   6220: aload_0
    //   6221: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   6226: getstatic Perryc.c : I
    //   6229: iflt -> 6243
    //   6232: ldc2_w 1646995001
    //   6235: l2i
    //   6236: ldc_w -309994719
    //   6239: ixor
    //   6240: goto -> 6251
    //   6243: ldc2_w -1572821881
    //   6246: l2i
    //   6247: ldc_w 251505892
    //   6250: ixor
    //   6251: ldc2_w 1845496245
    //   6254: l2i
    //   6255: ldc_w -1329559949
    //   6258: ixor
    //   6259: ixor
    //   6260: lookupswitch default -> 11252, 1366192862 -> 6243, 1920829349 -> 6288
    //   6288: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6291: getstatic Perryc.1 : I
    //   6294: ifeq -> 6308
    //   6297: ldc2_w -2082340596
    //   6300: l2i
    //   6301: ldc_w -574947228
    //   6304: ixor
    //   6305: goto -> 6316
    //   6308: ldc2_w -1602894355
    //   6311: l2i
    //   6312: ldc_w -242728374
    //   6315: ixor
    //   6316: ldc2_w -744513440
    //   6319: l2i
    //   6320: ldc_w -965041376
    //   6323: ixor
    //   6324: ixor
    //   6325: lookupswitch default -> 6352, -1109544231 -> 6308, 1270612520 -> 11014
    //   6352: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6355: getstatic Perryc.0 : I
    //   6358: ifle -> 6372
    //   6361: ldc2_w -1268396854
    //   6364: l2i
    //   6365: ldc_w -221878398
    //   6368: ixor
    //   6369: goto -> 6380
    //   6372: ldc2_w -970382866
    //   6375: l2i
    //   6376: ldc_w -1073033461
    //   6379: ixor
    //   6380: ldc2_w -2024570903
    //   6383: l2i
    //   6384: ldc_w -320350790
    //   6387: ixor
    //   6388: ixor
    //   6389: lookupswitch default -> 6416, -1930354173 -> 6372, 756482331 -> 11222
    //   6416: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6419: getstatic Perryc.c : I
    //   6422: iflt -> 6436
    //   6425: ldc2_w -844199277
    //   6428: l2i
    //   6429: ldc_w -2022172092
    //   6432: ixor
    //   6433: goto -> 6444
    //   6436: ldc2_w -25595742
    //   6439: l2i
    //   6440: ldc_w 480550233
    //   6443: ixor
    //   6444: ldc2_w 654464666
    //   6447: l2i
    //   6448: ldc_w 975160780
    //   6451: ixor
    //   6452: ixor
    //   6453: lookupswitch default -> 6480, 97046914 -> 6436, 1472922497 -> 11112
    //   6480: aload_0
    //   6481: getstatic Perryc.0 : I
    //   6484: ifle -> 6498
    //   6487: ldc2_w 355025671
    //   6490: l2i
    //   6491: ldc_w 2138376598
    //   6494: ixor
    //   6495: goto -> 6506
    //   6498: ldc2_w 1790362020
    //   6501: l2i
    //   6502: ldc_w -164972252
    //   6505: ixor
    //   6506: ldc2_w -218379375
    //   6509: l2i
    //   6510: ldc_w -2005510502
    //   6513: ixor
    //   6514: ixor
    //   6515: lookupswitch default -> 11114, -435034741 -> 6540, 282187674 -> 6498
    //   6540: aload_0
    //   6541: new bigname/zprestige/webhack/features/setting/Setting
    //   6544: dup
    //   6545: ldc_w '㌆㶻䴒༮๼'
    //   6548: getstatic Perryc.1 : I
    //   6551: ifeq -> 6565
    //   6554: ldc2_w -819293462
    //   6557: l2i
    //   6558: ldc_w -1915565526
    //   6561: ixor
    //   6562: goto -> 6573
    //   6565: ldc2_w -350698375
    //   6568: l2i
    //   6569: ldc_w 2006867008
    //   6572: ixor
    //   6573: ldc2_w -124256287
    //   6576: l2i
    //   6577: ldc_w 1566259743
    //   6580: ixor
    //   6581: ixor
    //   6582: lookupswitch default -> 6608, -415982274 -> 11270, 1575738889 -> 6565
    //   6608: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6611: ldc2_w 1735649412
    //   6614: l2i
    //   6615: ldc_w 1735649412
    //   6618: ixor
    //   6619: getstatic Perryc.c : I
    //   6622: iflt -> 6636
    //   6625: ldc2_w 86257025
    //   6628: l2i
    //   6629: ldc_w -882990843
    //   6632: ixor
    //   6633: goto -> 6644
    //   6636: ldc2_w 2023251532
    //   6639: l2i
    //   6640: ldc_w 929802754
    //   6643: ixor
    //   6644: ldc2_w -495621838
    //   6647: l2i
    //   6648: ldc_w -309807591
    //   6651: ixor
    //   6652: ixor
    //   6653: lookupswitch default -> 6680, -2073687918 -> 6636, -1048095825 -> 11026
    //   6680: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   6683: getstatic Perryc.c : I
    //   6686: iflt -> 6700
    //   6689: ldc2_w 178988190
    //   6692: l2i
    //   6693: ldc_w 936555191
    //   6696: ixor
    //   6697: goto -> 6708
    //   6700: ldc2_w -1189607716
    //   6703: l2i
    //   6704: ldc_w -880413947
    //   6707: ixor
    //   6708: ldc2_w 977274542
    //   6711: l2i
    //   6712: ldc_w 1835841249
    //   6715: ixor
    //   6716: ixor
    //   6717: lookupswitch default -> 11024, 632374678 -> 6744, 1783965286 -> 6700
    //   6744: aload_0
    //   6745: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   6750: getstatic Perryc.1 : I
    //   6753: ifeq -> 6767
    //   6756: ldc2_w -1186672268
    //   6759: l2i
    //   6760: ldc_w -1837908917
    //   6763: ixor
    //   6764: goto -> 6775
    //   6767: ldc2_w 204093396
    //   6770: l2i
    //   6771: ldc_w 1931613743
    //   6774: ixor
    //   6775: ldc2_w 940321030
    //   6778: l2i
    //   6779: ldc_w -1921895761
    //   6782: ixor
    //   6783: ixor
    //   6784: lookupswitch default -> 6812, -1639352682 -> 11128, 530748770 -> 6767
    //   6812: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6815: getstatic Perryc.1 : I
    //   6818: ifeq -> 6832
    //   6821: ldc2_w -1516660184
    //   6824: l2i
    //   6825: ldc_w -517886999
    //   6828: ixor
    //   6829: goto -> 6840
    //   6832: ldc2_w 623131880
    //   6835: l2i
    //   6836: ldc_w 1966015137
    //   6839: ixor
    //   6840: ldc2_w 1704373533
    //   6843: l2i
    //   6844: ldc_w 665815561
    //   6847: ixor
    //   6848: ixor
    //   6849: lookupswitch default -> 6876, 109123285 -> 11058, 612925494 -> 6832
    //   6876: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6879: getstatic Perryc.0 : I
    //   6882: ifle -> 6896
    //   6885: ldc2_w 2126490092
    //   6888: l2i
    //   6889: ldc_w -2000193995
    //   6892: ixor
    //   6893: goto -> 6904
    //   6896: ldc2_w -1291235838
    //   6899: l2i
    //   6900: ldc_w -2020223746
    //   6903: ixor
    //   6904: ldc2_w -1907801970
    //   6907: l2i
    //   6908: ldc_w -1155608371
    //   6911: ixor
    //   6912: ixor
    //   6913: lookupswitch default -> 11236, -1020309606 -> 6896, 30083775 -> 6940
    //   6940: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6943: getstatic Perryc.1 : I
    //   6946: ifeq -> 6960
    //   6949: ldc2_w 640048243
    //   6952: l2i
    //   6953: ldc_w -1587810026
    //   6956: ixor
    //   6957: goto -> 6968
    //   6960: ldc2_w 2052358798
    //   6963: l2i
    //   6964: ldc_w 290441618
    //   6967: ixor
    //   6968: ldc2_w 1109289064
    //   6971: l2i
    //   6972: ldc_w 808481398
    //   6975: ixor
    //   6976: ixor
    //   6977: lookupswitch default -> 11074, -179062917 -> 6960, 422924546 -> 7004
    //   7004: aload_0
    //   7005: getstatic Perryc.1 : I
    //   7008: ifeq -> 7022
    //   7011: ldc2_w -1494315646
    //   7014: l2i
    //   7015: ldc_w 1419981299
    //   7018: ixor
    //   7019: goto -> 7030
    //   7022: ldc2_w 1438651046
    //   7025: l2i
    //   7026: ldc_w 1005966495
    //   7029: ixor
    //   7030: ldc2_w 1874128513
    //   7033: l2i
    //   7034: ldc_w 461642115
    //   7037: ixor
    //   7038: ixor
    //   7039: lookupswitch default -> 7064, -2038609037 -> 10998, 1556935332 -> 7022
    //   7064: aload_0
    //   7065: new bigname/zprestige/webhack/features/setting/Setting
    //   7068: dup
    //   7069: ldc_w '㌿㶅䴞༤'
    //   7072: getstatic Perryc.1 : I
    //   7075: ifeq -> 7089
    //   7078: ldc2_w -1380822097
    //   7081: l2i
    //   7082: ldc_w -1271100175
    //   7085: ixor
    //   7086: goto -> 7097
    //   7089: ldc2_w 887107424
    //   7092: l2i
    //   7093: ldc_w -1780986001
    //   7096: ixor
    //   7097: ldc2_w 595667640
    //   7100: l2i
    //   7101: ldc_w 923586333
    //   7104: ixor
    //   7105: ixor
    //   7106: lookupswitch default -> 11230, -1246394966 -> 7132, 218315515 -> 7089
    //   7132: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7135: ldc2_w -227481944
    //   7138: l2i
    //   7139: ldc_w -227481944
    //   7142: ixor
    //   7143: getstatic Perryc.0 : I
    //   7146: ifle -> 7160
    //   7149: ldc2_w 635690122
    //   7152: l2i
    //   7153: ldc_w -1649883633
    //   7156: ixor
    //   7157: goto -> 7168
    //   7160: ldc2_w 1251687690
    //   7163: l2i
    //   7164: ldc_w 160772590
    //   7167: ixor
    //   7168: ldc2_w -311481221
    //   7171: l2i
    //   7172: ldc_w 29668489
    //   7175: ixor
    //   7176: ixor
    //   7177: lookupswitch default -> 7204, 1392956760 -> 7160, 1423999607 -> 11046
    //   7204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7207: ldc2_w -759151314
    //   7210: l2i
    //   7211: ldc_w -759151314
    //   7214: ixor
    //   7215: getstatic Perryc.1 : I
    //   7218: ifeq -> 7232
    //   7221: ldc2_w -1646338771
    //   7224: l2i
    //   7225: ldc_w 1972219845
    //   7228: ixor
    //   7229: goto -> 7240
    //   7232: ldc2_w 473313168
    //   7235: l2i
    //   7236: ldc_w -930450115
    //   7239: ixor
    //   7240: ldc2_w -140930477
    //   7243: l2i
    //   7244: ldc_w -327935084
    //   7247: ixor
    //   7248: ixor
    //   7249: lookupswitch default -> 7276, -205587665 -> 11168, 2045803338 -> 7232
    //   7276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7279: ldc2_w -1745134333
    //   7282: l2i
    //   7283: ldc_w -1745134084
    //   7286: ixor
    //   7287: getstatic Perryc.0 : I
    //   7290: ifle -> 7304
    //   7293: ldc2_w 325254887
    //   7296: l2i
    //   7297: ldc_w -2016787635
    //   7300: ixor
    //   7301: goto -> 7312
    //   7304: ldc2_w -305746820
    //   7307: l2i
    //   7308: ldc_w -2056944259
    //   7311: ixor
    //   7312: ldc2_w 1747774944
    //   7315: l2i
    //   7316: ldc_w 306860034
    //   7319: ixor
    //   7320: ixor
    //   7321: lookupswitch default -> 7348, -288489400 -> 11158, 1915158125 -> 7304
    //   7348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7351: getstatic Perryc.1 : I
    //   7354: ifeq -> 7368
    //   7357: ldc2_w -717063320
    //   7360: l2i
    //   7361: ldc_w 1849381736
    //   7364: ixor
    //   7365: goto -> 7376
    //   7368: ldc2_w -527370180
    //   7371: l2i
    //   7372: ldc_w 560290377
    //   7375: ixor
    //   7376: ldc2_w -86072580
    //   7379: l2i
    //   7380: ldc_w -1796150204
    //   7383: ixor
    //   7384: ixor
    //   7385: lookupswitch default -> 7412, -918053435 -> 7368, -715692360 -> 10960
    //   7412: aload_0
    //   7413: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   7418: getstatic Perryc.1 : I
    //   7421: ifeq -> 7435
    //   7424: ldc2_w 1676932799
    //   7427: l2i
    //   7428: ldc_w 2126189787
    //   7431: ixor
    //   7432: goto -> 7443
    //   7435: ldc2_w -710949890
    //   7438: l2i
    //   7439: ldc_w -2051641661
    //   7442: ixor
    //   7443: ldc2_w -1778791395
    //   7446: l2i
    //   7447: ldc_w -557197746
    //   7450: ixor
    //   7451: ixor
    //   7452: lookupswitch default -> 7480, 1339005798 -> 7435, 1450768439 -> 11056
    //   7480: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7483: getstatic Perryc.1 : I
    //   7486: ifeq -> 7500
    //   7489: ldc2_w 1748709315
    //   7492: l2i
    //   7493: ldc_w 127215638
    //   7496: ixor
    //   7497: goto -> 7508
    //   7500: ldc2_w 806955577
    //   7503: l2i
    //   7504: ldc_w -1629312624
    //   7507: ixor
    //   7508: ldc2_w -626267546
    //   7511: l2i
    //   7512: ldc_w -1985352279
    //   7515: ixor
    //   7516: ixor
    //   7517: lookupswitch default -> 11038, -33979290 -> 7544, 1017905178 -> 7500
    //   7544: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7547: getstatic Perryc.c : I
    //   7550: iflt -> 7564
    //   7553: ldc2_w 632830093
    //   7556: l2i
    //   7557: ldc_w -713991342
    //   7560: ixor
    //   7561: goto -> 7572
    //   7564: ldc2_w 191087356
    //   7567: l2i
    //   7568: ldc_w 1686694275
    //   7571: ixor
    //   7572: ldc2_w -1982929942
    //   7575: l2i
    //   7576: ldc_w -805953924
    //   7579: ixor
    //   7580: ixor
    //   7581: lookupswitch default -> 7608, -1225679287 -> 11142, 542375405 -> 7564
    //   7608: putfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7611: getstatic Perryc.1 : I
    //   7614: ifeq -> 7628
    //   7617: ldc2_w -1474343494
    //   7620: l2i
    //   7621: ldc_w -306207513
    //   7624: ixor
    //   7625: goto -> 7636
    //   7628: ldc2_w -175847676
    //   7631: l2i
    //   7632: ldc_w -652085927
    //   7635: ixor
    //   7636: ldc2_w -370366452
    //   7639: l2i
    //   7640: ldc_w -382930715
    //   7643: ixor
    //   7644: ixor
    //   7645: lookupswitch default -> 11216, 744843956 -> 7672, 1163964852 -> 7628
    //   7672: aload_0
    //   7673: getstatic Perryc.1 : I
    //   7676: ifeq -> 7690
    //   7679: ldc2_w 1908549187
    //   7682: l2i
    //   7683: ldc_w -1532271643
    //   7686: ixor
    //   7687: goto -> 7698
    //   7690: ldc2_w -1347212164
    //   7693: l2i
    //   7694: ldc_w 1830849611
    //   7697: ixor
    //   7698: ldc2_w -770370425
    //   7701: l2i
    //   7702: ldc_w 1204885775
    //   7705: ixor
    //   7706: ixor
    //   7707: lookupswitch default -> 11050, 1085098030 -> 7690, 1465363903 -> 7732
    //   7732: aload_0
    //   7733: new bigname/zprestige/webhack/features/setting/Setting
    //   7736: dup
    //   7737: ldc_w '㌿㶐䴉༥๼鰿'
    //   7740: getstatic Perryc.0 : I
    //   7743: ifle -> 7757
    //   7746: ldc2_w -1817321154
    //   7749: l2i
    //   7750: ldc_w -2078037968
    //   7753: ixor
    //   7754: goto -> 7765
    //   7757: ldc2_w 1789347473
    //   7760: l2i
    //   7761: ldc_w -1388910131
    //   7764: ixor
    //   7765: ldc2_w 1380140702
    //   7768: l2i
    //   7769: ldc_w -1201839628
    //   7772: ixor
    //   7773: ixor
    //   7774: lookupswitch default -> 11206, -40866204 -> 7757, 764381238 -> 7800
    //   7800: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7803: ldc2_w -2146576099
    //   7806: l2i
    //   7807: ldc_w -2146576099
    //   7810: ixor
    //   7811: getstatic Perryc.1 : I
    //   7814: ifeq -> 7828
    //   7817: ldc2_w 1615669172
    //   7820: l2i
    //   7821: ldc_w -476930614
    //   7824: ixor
    //   7825: goto -> 7836
    //   7828: ldc2_w 2116372494
    //   7831: l2i
    //   7832: ldc_w 2110051792
    //   7835: ixor
    //   7836: ldc2_w 1708617918
    //   7839: l2i
    //   7840: ldc_w -1395474968
    //   7843: ixor
    //   7844: ixor
    //   7845: lookupswitch default -> 7872, -393431464 -> 7828, 1255831336 -> 10952
    //   7872: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7875: ldc2_w 1818592927
    //   7878: l2i
    //   7879: ldc_w 1818592927
    //   7882: ixor
    //   7883: getstatic Perryc.c : I
    //   7886: iflt -> 7900
    //   7889: ldc2_w 155430281
    //   7892: l2i
    //   7893: ldc_w -1008693310
    //   7896: ixor
    //   7897: goto -> 7908
    //   7900: ldc2_w -919980860
    //   7903: l2i
    //   7904: ldc_w 603219689
    //   7907: ixor
    //   7908: ldc2_w -1671839393
    //   7911: l2i
    //   7912: ldc_w -1750734575
    //   7915: ixor
    //   7916: ixor
    //   7917: lookupswitch default -> 11272, -1050736123 -> 7900, -517834141 -> 7944
    //   7944: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7947: ldc2_w -137426503
    //   7950: l2i
    //   7951: ldc_w -137426618
    //   7954: ixor
    //   7955: getstatic Perryc.c : I
    //   7958: iflt -> 7972
    //   7961: ldc2_w 1193713143
    //   7964: l2i
    //   7965: ldc_w -1533064411
    //   7968: ixor
    //   7969: goto -> 7980
    //   7972: ldc2_w -1115391572
    //   7975: l2i
    //   7976: ldc_w -48968907
    //   7979: ixor
    //   7980: ldc2_w -1784835476
    //   7983: l2i
    //   7984: ldc_w 2058999416
    //   7987: ixor
    //   7988: ixor
    //   7989: lookupswitch default -> 8016, 211653318 -> 11126, 1034958791 -> 7972
    //   8016: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8019: getstatic Perryc.1 : I
    //   8022: ifeq -> 8036
    //   8025: ldc2_w -840515800
    //   8028: l2i
    //   8029: ldc_w -1269510885
    //   8032: ixor
    //   8033: goto -> 8044
    //   8036: ldc2_w 1036602616
    //   8039: l2i
    //   8040: ldc_w 1055524894
    //   8043: ixor
    //   8044: ldc2_w 1322679363
    //   8047: l2i
    //   8048: ldc_w 72356961
    //   8051: ixor
    //   8052: ixor
    //   8053: lookupswitch default -> 11034, 859052561 -> 8036, 1235561668 -> 8080
    //   8080: aload_0
    //   8081: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   8086: getstatic Perryc.1 : I
    //   8089: ifeq -> 8103
    //   8092: ldc2_w -974728096
    //   8095: l2i
    //   8096: ldc_w -933602346
    //   8099: ixor
    //   8100: goto -> 8111
    //   8103: ldc2_w -1281657649
    //   8106: l2i
    //   8107: ldc_w 2124355717
    //   8110: ixor
    //   8111: ldc2_w -309506586
    //   8114: l2i
    //   8115: ldc_w 2097592818
    //   8118: ixor
    //   8119: ixor
    //   8120: lookupswitch default -> 8148, -1657308254 -> 11178, 798118905 -> 8103
    //   8148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8151: getstatic Perryc.0 : I
    //   8154: ifle -> 8168
    //   8157: ldc2_w 472544545
    //   8160: l2i
    //   8161: ldc_w 1193006310
    //   8164: ixor
    //   8165: goto -> 8176
    //   8168: ldc2_w 1635517294
    //   8171: l2i
    //   8172: ldc_w -161384370
    //   8175: ixor
    //   8176: ldc2_w -1051744692
    //   8179: l2i
    //   8180: ldc_w 1004732525
    //   8183: ixor
    //   8184: ixor
    //   8185: lookupswitch default -> 8212, -1583544346 -> 10946, 792536674 -> 8168
    //   8212: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8215: getstatic Perryc.1 : I
    //   8218: ifeq -> 8232
    //   8221: ldc2_w -124787453
    //   8224: l2i
    //   8225: ldc_w -1610798829
    //   8228: ixor
    //   8229: goto -> 8240
    //   8232: ldc2_w -308501997
    //   8235: l2i
    //   8236: ldc_w 1062360044
    //   8239: ixor
    //   8240: ldc2_w 55556559
    //   8243: l2i
    //   8244: ldc_w -1221560255
    //   8247: ixor
    //   8248: ixor
    //   8249: lookupswitch default -> 11176, -754119266 -> 8232, 1722888305 -> 8276
    //   8276: putfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8279: getstatic Perryc.0 : I
    //   8282: ifle -> 8296
    //   8285: ldc2_w 576221569
    //   8288: l2i
    //   8289: ldc_w -1884558070
    //   8292: ixor
    //   8293: goto -> 8304
    //   8296: ldc2_w 70636331
    //   8299: l2i
    //   8300: ldc_w -1367185941
    //   8303: ixor
    //   8304: ldc2_w 415614024
    //   8307: l2i
    //   8308: ldc_w -82896336
    //   8311: ixor
    //   8312: ixor
    //   8313: lookupswitch default -> 8340, 374546243 -> 8296, 1312375539 -> 11154
    //   8340: aload_0
    //   8341: getstatic Perryc.1 : I
    //   8344: ifeq -> 8358
    //   8347: ldc2_w 701468672
    //   8350: l2i
    //   8351: ldc_w -265911237
    //   8354: ixor
    //   8355: goto -> 8366
    //   8358: ldc2_w -1334986623
    //   8361: l2i
    //   8362: ldc_w 731505583
    //   8365: ixor
    //   8366: ldc2_w -936640425
    //   8369: l2i
    //   8370: ldc_w 425554798
    //   8373: ixor
    //   8374: ixor
    //   8375: lookupswitch default -> 8400, 144205570 -> 11068, 1209822066 -> 8358
    //   8400: aload_0
    //   8401: new bigname/zprestige/webhack/features/setting/Setting
    //   8404: dup
    //   8405: ldc_w '㌿㶕䴗༵๼'
    //   8408: getstatic Perryc.1 : I
    //   8411: ifeq -> 8425
    //   8414: ldc2_w -1376967786
    //   8417: l2i
    //   8418: ldc_w 928727661
    //   8421: ixor
    //   8422: goto -> 8433
    //   8425: ldc2_w -21928154
    //   8428: l2i
    //   8429: ldc_w -1015710810
    //   8432: ixor
    //   8433: ldc2_w 309692373
    //   8436: l2i
    //   8437: ldc_w 1599318691
    //   8440: ixor
    //   8441: ixor
    //   8442: lookupswitch default -> 8468, -678409075 -> 11036, 1387115743 -> 8425
    //   8468: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8471: ldc2_w 636035640
    //   8474: l2i
    //   8475: ldc_w 636035783
    //   8478: ixor
    //   8479: getstatic Perryc.c : I
    //   8482: iflt -> 8496
    //   8485: ldc2_w 1773012946
    //   8488: l2i
    //   8489: ldc_w -1348644135
    //   8492: ixor
    //   8493: goto -> 8504
    //   8496: ldc2_w -1226894623
    //   8499: l2i
    //   8500: ldc_w 1269815511
    //   8503: ixor
    //   8504: ldc2_w -2029432546
    //   8507: l2i
    //   8508: ldc_w 950549606
    //   8511: ixor
    //   8512: ixor
    //   8513: lookupswitch default -> 11076, 1121036110 -> 8540, 2039625843 -> 8496
    //   8540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8543: ldc2_w -1215613355
    //   8546: l2i
    //   8547: ldc_w -1215613355
    //   8550: ixor
    //   8551: getstatic Perryc.c : I
    //   8554: iflt -> 8568
    //   8557: ldc2_w -1907408343
    //   8560: l2i
    //   8561: ldc_w -1863590026
    //   8564: ixor
    //   8565: goto -> 8576
    //   8568: ldc2_w 433348411
    //   8571: l2i
    //   8572: ldc_w -1405112949
    //   8575: ixor
    //   8576: ldc2_w -8244672
    //   8579: l2i
    //   8580: ldc_w -1145580288
    //   8583: ixor
    //   8584: ixor
    //   8585: lookupswitch default -> 8612, 1519483423 -> 11002, 1905984108 -> 8568
    //   8612: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8615: ldc2_w 1532589216
    //   8618: l2i
    //   8619: ldc_w 1532589151
    //   8622: ixor
    //   8623: getstatic Perryc.1 : I
    //   8626: ifeq -> 8640
    //   8629: ldc2_w -770158546
    //   8632: l2i
    //   8633: ldc_w -1958037264
    //   8636: ixor
    //   8637: goto -> 8648
    //   8640: ldc2_w -352412534
    //   8643: l2i
    //   8644: ldc_w 684046244
    //   8647: ixor
    //   8648: ldc2_w 2081855257
    //   8651: l2i
    //   8652: ldc_w 1190692880
    //   8655: ixor
    //   8656: ixor
    //   8657: lookupswitch default -> 11016, -120245209 -> 8684, 1673328599 -> 8640
    //   8684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8687: getstatic Perryc.1 : I
    //   8690: ifeq -> 8704
    //   8693: ldc2_w 260725899
    //   8696: l2i
    //   8697: ldc_w -843531028
    //   8700: ixor
    //   8701: goto -> 8712
    //   8704: ldc2_w -1244075367
    //   8707: l2i
    //   8708: ldc_w 1106423582
    //   8711: ixor
    //   8712: ldc2_w -444681806
    //   8715: l2i
    //   8716: ldc_w 1496338332
    //   8719: ixor
    //   8720: ixor
    //   8721: lookupswitch default -> 10972, 1214561193 -> 8748, 2122063433 -> 8704
    //   8748: aload_0
    //   8749: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   8754: getstatic Perryc.1 : I
    //   8757: ifeq -> 8771
    //   8760: ldc2_w 862847087
    //   8763: l2i
    //   8764: ldc_w 1241180153
    //   8767: ixor
    //   8768: goto -> 8779
    //   8771: ldc2_w -430509070
    //   8774: l2i
    //   8775: ldc_w -987838840
    //   8778: ixor
    //   8779: ldc2_w 1362455051
    //   8782: l2i
    //   8783: ldc_w -1307194232
    //   8786: ixor
    //   8787: ixor
    //   8788: lookupswitch default -> 11082, -1716240107 -> 8771, -1066888199 -> 8816
    //   8816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8819: getstatic Perryc.c : I
    //   8822: iflt -> 8836
    //   8825: ldc2_w 1815737425
    //   8828: l2i
    //   8829: ldc_w 1889847536
    //   8832: ixor
    //   8833: goto -> 8844
    //   8836: ldc2_w -543210023
    //   8839: l2i
    //   8840: ldc_w 4426779
    //   8843: ixor
    //   8844: ldc2_w 1046518597
    //   8847: l2i
    //   8848: ldc_w -433714672
    //   8851: ixor
    //   8852: ixor
    //   8853: lookupswitch default -> 8880, -1226060569 -> 8836, -992236044 -> 11008
    //   8880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8883: getstatic Perryc.1 : I
    //   8886: ifeq -> 8900
    //   8889: ldc2_w -1142688958
    //   8892: l2i
    //   8893: ldc_w -217708822
    //   8896: ixor
    //   8897: goto -> 8908
    //   8900: ldc2_w -242813181
    //   8903: l2i
    //   8904: ldc_w -835414835
    //   8907: ixor
    //   8908: ldc2_w 1711474314
    //   8911: l2i
    //   8912: ldc_w -1074507394
    //   8915: ixor
    //   8916: ixor
    //   8917: lookupswitch default -> 10982, -1861049764 -> 8900, -431672262 -> 8944
    //   8944: putfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8947: getstatic Perryc.0 : I
    //   8950: ifle -> 8964
    //   8953: ldc2_w -1213194801
    //   8956: l2i
    //   8957: ldc_w -233565607
    //   8960: ixor
    //   8961: goto -> 8972
    //   8964: ldc2_w 1995176185
    //   8967: l2i
    //   8968: ldc_w -1767971282
    //   8971: ixor
    //   8972: ldc2_w 1910030206
    //   8975: l2i
    //   8976: ldc_w -1424579023
    //   8979: ixor
    //   8980: ixor
    //   8981: lookupswitch default -> 11240, -1620437287 -> 8964, 985335704 -> 9008
    //   9008: aload_0
    //   9009: getstatic Perryc.0 : I
    //   9012: ifle -> 9026
    //   9015: ldc2_w -352296532
    //   9018: l2i
    //   9019: ldc_w 1464172317
    //   9022: ixor
    //   9023: goto -> 9034
    //   9026: ldc2_w 544185893
    //   9029: l2i
    //   9030: ldc_w -233753443
    //   9033: ixor
    //   9034: ldc2_w 1676256104
    //   9037: l2i
    //   9038: ldc_w -570205514
    //   9041: ixor
    //   9042: ixor
    //   9043: lookupswitch default -> 9068, -1850434773 -> 9026, 28305263 -> 11242
    //   9068: aload_0
    //   9069: new bigname/zprestige/webhack/features/setting/Setting
    //   9072: dup
    //   9073: ldc_w '㌿㶅䴚༩๷鰳蹬ᇲ'
    //   9076: getstatic Perryc.1 : I
    //   9079: ifeq -> 9093
    //   9082: ldc2_w 1570116086
    //   9085: l2i
    //   9086: ldc_w 1700675449
    //   9089: ixor
    //   9090: goto -> 9101
    //   9093: ldc2_w -1427407157
    //   9096: l2i
    //   9097: ldc_w -539581366
    //   9100: ixor
    //   9101: ldc2_w 2062030945
    //   9104: l2i
    //   9105: ldc_w 579335931
    //   9108: ixor
    //   9109: ixor
    //   9110: lookupswitch default -> 9136, 920150282 -> 9093, 1621606421 -> 11090
    //   9136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9139: ldc2_w 503952778
    //   9142: l2i
    //   9143: ldc_w 503952778
    //   9146: ixor
    //   9147: getstatic Perryc.1 : I
    //   9150: ifeq -> 9164
    //   9153: ldc2_w 1304197828
    //   9156: l2i
    //   9157: ldc_w 467851067
    //   9160: ixor
    //   9161: goto -> 9172
    //   9164: ldc2_w -860824256
    //   9167: l2i
    //   9168: ldc_w -1238953745
    //   9171: ixor
    //   9172: ldc2_w -376962900
    //   9175: l2i
    //   9176: ldc_w 1086306999
    //   9179: ixor
    //   9180: ixor
    //   9181: lookupswitch default -> 11244, -744458316 -> 9208, -9889820 -> 9164
    //   9208: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9211: getstatic Perryc.1 : I
    //   9214: ifeq -> 9228
    //   9217: ldc2_w 1727223154
    //   9220: l2i
    //   9221: ldc_w -879385697
    //   9224: ixor
    //   9225: goto -> 9236
    //   9228: ldc2_w 1073358903
    //   9231: l2i
    //   9232: ldc_w 1466712496
    //   9235: ixor
    //   9236: ldc2_w 679243984
    //   9239: l2i
    //   9240: ldc_w 56397562
    //   9243: ixor
    //   9244: ixor
    //   9245: lookupswitch default -> 10966, -2042230585 -> 9228, 1136039853 -> 9272
    //   9272: aload_0
    //   9273: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   9278: getstatic Perryc.0 : I
    //   9281: ifle -> 9295
    //   9284: ldc2_w 801611409
    //   9287: l2i
    //   9288: ldc_w 140463797
    //   9291: ixor
    //   9292: goto -> 9303
    //   9295: ldc2_w 1786586226
    //   9298: l2i
    //   9299: ldc_w 1196333566
    //   9302: ixor
    //   9303: ldc2_w -1477587773
    //   9306: l2i
    //   9307: ldc_w -848024471
    //   9310: ixor
    //   9311: ixor
    //   9312: lookupswitch default -> 9340, -1780850499 -> 9295, 1291923598 -> 11000
    //   9340: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9343: getstatic Perryc.c : I
    //   9346: iflt -> 9360
    //   9349: ldc2_w -874280189
    //   9352: l2i
    //   9353: ldc_w -925242393
    //   9356: ixor
    //   9357: goto -> 9368
    //   9360: ldc2_w 60693438
    //   9363: l2i
    //   9364: ldc_w -2125269253
    //   9367: ixor
    //   9368: ldc2_w 67704556
    //   9371: l2i
    //   9372: ldc_w -160446203
    //   9375: ixor
    //   9376: ixor
    //   9377: lookupswitch default -> 9404, -1486143687 -> 9360, -245580019 -> 10954
    //   9404: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9407: getstatic Perryc.c : I
    //   9410: iflt -> 9424
    //   9413: ldc2_w -1211835757
    //   9416: l2i
    //   9417: ldc_w 1936891855
    //   9420: ixor
    //   9421: goto -> 9432
    //   9424: ldc2_w -32794053
    //   9427: l2i
    //   9428: ldc_w 972701317
    //   9431: ixor
    //   9432: ldc2_w -1058228914
    //   9435: l2i
    //   9436: ldc_w 111491310
    //   9439: ixor
    //   9440: ixor
    //   9441: lookupswitch default -> 11018, 28846366 -> 9468, 50317564 -> 9424
    //   9468: putfield cRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9471: getstatic Perryc.0 : I
    //   9474: ifle -> 9488
    //   9477: ldc2_w 965584829
    //   9480: l2i
    //   9481: ldc_w 572861723
    //   9484: ixor
    //   9485: goto -> 9496
    //   9488: ldc2_w 879156205
    //   9491: l2i
    //   9492: ldc_w -1456772357
    //   9495: ixor
    //   9496: ldc2_w -982936030
    //   9499: l2i
    //   9500: ldc_w 1985763658
    //   9503: ixor
    //   9504: ixor
    //   9505: lookupswitch default -> 11072, -1466087986 -> 9488, 779648638 -> 9532
    //   9532: aload_0
    //   9533: getstatic Perryc.c : I
    //   9536: iflt -> 9550
    //   9539: ldc2_w 904852834
    //   9542: l2i
    //   9543: ldc_w -644481991
    //   9546: ixor
    //   9547: goto -> 9558
    //   9550: ldc2_w -1813337820
    //   9553: l2i
    //   9554: ldc_w 826672476
    //   9557: ixor
    //   9558: ldc2_w 37718061
    //   9561: l2i
    //   9562: ldc_w -1689167554
    //   9565: ixor
    //   9566: ixor
    //   9567: lookupswitch default -> 9592, 965009581 -> 9550, 1964365896 -> 10986
    //   9592: aload_0
    //   9593: new bigname/zprestige/webhack/features/setting/Setting
    //   9596: dup
    //   9597: ldc_w '㌿㶖䴗༰๱鰰'
    //   9600: getstatic Perryc.c : I
    //   9603: iflt -> 9617
    //   9606: ldc2_w -1183235654
    //   9609: l2i
    //   9610: ldc_w -1685635480
    //   9613: ixor
    //   9614: goto -> 9625
    //   9617: ldc2_w 1627018707
    //   9620: l2i
    //   9621: ldc_w 1438960329
    //   9624: ixor
    //   9625: ldc2_w -1473910343
    //   9628: l2i
    //   9629: ldc_w -830204359
    //   9632: ixor
    //   9633: ixor
    //   9634: lookupswitch default -> 9660, 977074101 -> 9617, 1147109458 -> 11254
    //   9660: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9663: ldc2_w -1578073050
    //   9666: l2i
    //   9667: ldc_w -1578072871
    //   9670: ixor
    //   9671: getstatic Perryc.0 : I
    //   9674: ifle -> 9688
    //   9677: ldc2_w -858401667
    //   9680: l2i
    //   9681: ldc_w 1391129047
    //   9684: ixor
    //   9685: goto -> 9696
    //   9688: ldc2_w -1334179598
    //   9691: l2i
    //   9692: ldc_w 929245727
    //   9695: ixor
    //   9696: ldc2_w 603503690
    //   9699: l2i
    //   9700: ldc_w -1764506393
    //   9703: ixor
    //   9704: ixor
    //   9705: lookupswitch default -> 11070, 722754823 -> 9688, 842160704 -> 9732
    //   9732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9735: ldc2_w 705962381
    //   9738: l2i
    //   9739: ldc_w 705962381
    //   9742: ixor
    //   9743: getstatic Perryc.c : I
    //   9746: iflt -> 9760
    //   9749: ldc2_w 239977101
    //   9752: l2i
    //   9753: ldc_w 898443954
    //   9756: ixor
    //   9757: goto -> 9768
    //   9760: ldc2_w -1993754452
    //   9763: l2i
    //   9764: ldc_w 1922130801
    //   9767: ixor
    //   9768: ldc2_w -1398721338
    //   9771: l2i
    //   9772: ldc_w -971135622
    //   9775: ixor
    //   9776: ixor
    //   9777: lookupswitch default -> 9804, 876108697 -> 9760, 1367112067 -> 11262
    //   9804: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9807: ldc2_w -530038389
    //   9810: l2i
    //   9811: ldc_w -530038412
    //   9814: ixor
    //   9815: getstatic Perryc.c : I
    //   9818: iflt -> 9832
    //   9821: ldc2_w -1822965394
    //   9824: l2i
    //   9825: ldc_w -825709186
    //   9828: ixor
    //   9829: goto -> 9840
    //   9832: ldc2_w 1573626267
    //   9835: l2i
    //   9836: ldc_w 2092340914
    //   9839: ixor
    //   9840: ldc2_w 1443047887
    //   9843: l2i
    //   9844: ldc_w -1539267258
    //   9847: ixor
    //   9848: ixor
    //   9849: lookupswitch default -> 11160, -1344479079 -> 9832, -750863456 -> 9876
    //   9876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9879: getstatic Perryc.1 : I
    //   9882: ifeq -> 9896
    //   9885: ldc2_w -1481473027
    //   9888: l2i
    //   9889: ldc_w 1771828586
    //   9892: ixor
    //   9893: goto -> 9904
    //   9896: ldc2_w 450541796
    //   9899: l2i
    //   9900: ldc_w -601975170
    //   9903: ixor
    //   9904: ldc2_w 1568531756
    //   9907: l2i
    //   9908: ldc_w -1633995069
    //   9911: ixor
    //   9912: ixor
    //   9913: lookupswitch default -> 9940, 231712120 -> 11264, 1848150653 -> 9896
    //   9940: aload_0
    //   9941: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   9946: getstatic Perryc.c : I
    //   9949: iflt -> 9963
    //   9952: ldc2_w 1847454965
    //   9955: l2i
    //   9956: ldc_w 10964435
    //   9959: ixor
    //   9960: goto -> 9971
    //   9963: ldc2_w -528256288
    //   9966: l2i
    //   9967: ldc_w -506377217
    //   9970: ixor
    //   9971: ldc2_w 755162422
    //   9974: l2i
    //   9975: ldc_w -2073364047
    //   9978: ixor
    //   9979: ixor
    //   9980: lookupswitch default -> 11248, -1472586344 -> 10008, -942504543 -> 9963
    //   10008: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10011: getstatic Perryc.0 : I
    //   10014: ifle -> 10028
    //   10017: ldc2_w 866454711
    //   10020: l2i
    //   10021: ldc_w 455478411
    //   10024: ixor
    //   10025: goto -> 10036
    //   10028: ldc2_w -696588800
    //   10031: l2i
    //   10032: ldc_w -1256923596
    //   10035: ixor
    //   10036: ldc2_w 1447994330
    //   10039: l2i
    //   10040: ldc_w 1131085892
    //   10043: ixor
    //   10044: ixor
    //   10045: lookupswitch default -> 10072, 1034331042 -> 11102, 1361374301 -> 10028
    //   10072: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10075: getstatic Perryc.c : I
    //   10078: iflt -> 10092
    //   10081: ldc2_w 148780781
    //   10084: l2i
    //   10085: ldc_w 296262131
    //   10088: ixor
    //   10089: goto -> 10100
    //   10092: ldc2_w -112993835
    //   10095: l2i
    //   10096: ldc_w -410049772
    //   10099: ixor
    //   10100: ldc2_w 1321129133
    //   10103: l2i
    //   10104: ldc_w -713096628
    //   10107: ixor
    //   10108: ixor
    //   10109: lookupswitch default -> 11020, -2101904897 -> 10092, -2062734304 -> 10136
    //   10136: putfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10139: getstatic Perryc.0 : I
    //   10142: ifle -> 10156
    //   10145: ldc2_w 1796713993
    //   10148: l2i
    //   10149: ldc_w -691858065
    //   10152: ixor
    //   10153: goto -> 10164
    //   10156: ldc2_w 1668477247
    //   10159: l2i
    //   10160: ldc_w 711642606
    //   10163: ixor
    //   10164: ldc2_w -821655224
    //   10167: l2i
    //   10168: ldc_w 1987305041
    //   10171: ixor
    //   10172: ixor
    //   10173: lookupswitch default -> 11224, -261264440 -> 10200, 77720703 -> 10156
    //   10200: aload_0
    //   10201: getstatic Perryc.0 : I
    //   10204: ifle -> 10218
    //   10207: ldc2_w 1541578969
    //   10210: l2i
    //   10211: ldc_w 1957192817
    //   10214: ixor
    //   10215: goto -> 10226
    //   10218: ldc2_w -515218467
    //   10221: l2i
    //   10222: ldc_w -705857361
    //   10225: ixor
    //   10226: ldc2_w 550608507
    //   10229: l2i
    //   10230: ldc_w 706421136
    //   10233: ixor
    //   10234: ixor
    //   10235: lookupswitch default -> 11234, 629177155 -> 10218, 1047372953 -> 10260
    //   10260: aload_0
    //   10261: new bigname/zprestige/webhack/features/setting/Setting
    //   10264: dup
    //   10265: ldc_w '㌚㶲䴬༩๽鰥蹫'
    //   10268: getstatic Perryc.1 : I
    //   10271: ifeq -> 10285
    //   10274: ldc2_w -1126609464
    //   10277: l2i
    //   10278: ldc_w -511208364
    //   10281: ixor
    //   10282: goto -> 10293
    //   10285: ldc2_w 1798480691
    //   10288: l2i
    //   10289: ldc_w 504235824
    //   10292: ixor
    //   10293: ldc2_w -1566976709
    //   10296: l2i
    //   10297: ldc_w 1211706864
    //   10300: ixor
    //   10301: ixor
    //   10302: lookupswitch default -> 11192, -1617142584 -> 10328, -1208082089 -> 10285
    //   10328: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10331: ldc_w 11.4246855
    //   10334: invokestatic floatToIntBits : (F)I
    //   10337: ldc_w 2125908867
    //   10340: ixor
    //   10341: invokestatic intBitsToFloat : (I)F
    //   10344: getstatic Perryc.0 : I
    //   10347: ifle -> 10361
    //   10350: ldc2_w 2010502121
    //   10353: l2i
    //   10354: ldc_w -373124122
    //   10357: ixor
    //   10358: goto -> 10369
    //   10361: ldc2_w 1305871886
    //   10364: l2i
    //   10365: ldc_w 1742760867
    //   10368: ixor
    //   10369: ldc2_w -598760333
    //   10372: l2i
    //   10373: ldc_w 366133911
    //   10376: ixor
    //   10377: ixor
    //   10378: lookupswitch default -> 11124, -475329719 -> 10404, 1468671723 -> 10361
    //   10404: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10407: ldc_w 69.01406
    //   10410: invokestatic floatToIntBits : (F)I
    //   10413: ldc_w 2135346174
    //   10416: ixor
    //   10417: invokestatic intBitsToFloat : (I)F
    //   10420: getstatic Perryc.0 : I
    //   10423: ifle -> 10437
    //   10426: ldc2_w 1609926215
    //   10429: l2i
    //   10430: ldc_w -1818986854
    //   10433: ixor
    //   10434: goto -> 10445
    //   10437: ldc2_w -1940375616
    //   10440: l2i
    //   10441: ldc_w -271790906
    //   10444: ixor
    //   10445: ldc2_w -1591005758
    //   10448: l2i
    //   10449: ldc_w 1365049939
    //   10452: ixor
    //   10453: ixor
    //   10454: lookupswitch default -> 10480, 1008197452 -> 11250, 1448063593 -> 10437
    //   10480: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10483: ldc_w 1.4874231
    //   10486: invokestatic floatToIntBits : (F)I
    //   10489: ldc_w 2132698081
    //   10492: ixor
    //   10493: invokestatic intBitsToFloat : (I)F
    //   10496: getstatic Perryc.0 : I
    //   10499: ifle -> 10513
    //   10502: ldc2_w 60112073
    //   10505: l2i
    //   10506: ldc_w 2062616885
    //   10509: ixor
    //   10510: goto -> 10521
    //   10513: ldc2_w 611029592
    //   10516: l2i
    //   10517: ldc_w -1309801385
    //   10520: ixor
    //   10521: ldc2_w 1210751642
    //   10524: l2i
    //   10525: ldc_w 556564920
    //   10528: ixor
    //   10529: ixor
    //   10530: lookupswitch default -> 11104, -58487507 -> 10556, 274869982 -> 10513
    //   10556: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10559: getstatic Perryc.c : I
    //   10562: iflt -> 10576
    //   10565: ldc2_w -816898046
    //   10568: l2i
    //   10569: ldc_w -220189795
    //   10572: ixor
    //   10573: goto -> 10584
    //   10576: ldc2_w -1296489880
    //   10579: l2i
    //   10580: ldc_w -903149067
    //   10583: ixor
    //   10584: ldc2_w -372658693
    //   10587: l2i
    //   10588: ldc_w -597765424
    //   10591: ixor
    //   10592: ixor
    //   10593: lookupswitch default -> 10620, 137917620 -> 11226, 1506916474 -> 10576
    //   10620: aload_0
    //   10621: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Blink;)Ljava/util/function/Predicate;
    //   10626: getstatic Perryc.0 : I
    //   10629: ifle -> 10643
    //   10632: ldc2_w -1519806587
    //   10635: l2i
    //   10636: ldc_w 161656794
    //   10639: ixor
    //   10640: goto -> 10651
    //   10643: ldc2_w 1100872130
    //   10646: l2i
    //   10647: ldc_w 404859669
    //   10650: ixor
    //   10651: ldc2_w 1318054752
    //   10654: l2i
    //   10655: ldc_w 1984697466
    //   10658: ixor
    //   10659: ixor
    //   10660: lookupswitch default -> 10958, -1811364027 -> 10643, 1635757517 -> 10688
    //   10688: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10691: getstatic Perryc.0 : I
    //   10694: ifle -> 10708
    //   10697: ldc2_w 761264351
    //   10700: l2i
    //   10701: ldc_w 1325234928
    //   10704: ixor
    //   10705: goto -> 10716
    //   10708: ldc2_w -971779278
    //   10711: l2i
    //   10712: ldc_w -312368841
    //   10715: ixor
    //   10716: ldc2_w -2026724451
    //   10719: l2i
    //   10720: ldc_w 701621157
    //   10723: ixor
    //   10724: ixor
    //   10725: lookupswitch default -> 11202, -2054081987 -> 10752, -851328489 -> 10708
    //   10752: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10755: getstatic Perryc.c : I
    //   10758: iflt -> 10772
    //   10761: ldc2_w 79983373
    //   10764: l2i
    //   10765: ldc_w 256258952
    //   10768: ixor
    //   10769: goto -> 10780
    //   10772: ldc2_w 257456033
    //   10775: l2i
    //   10776: ldc_w -729625556
    //   10779: ixor
    //   10780: ldc2_w -66788393
    //   10783: l2i
    //   10784: ldc_w -171045729
    //   10787: ixor
    //   10788: ixor
    //   10789: lookupswitch default -> 10816, -1576584272 -> 10772, 38318029 -> 11040
    //   10816: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10819: getstatic Perryc.1 : I
    //   10822: ifeq -> 10836
    //   10825: ldc2_w 1659110454
    //   10828: l2i
    //   10829: ldc_w 1120153374
    //   10832: ixor
    //   10833: goto -> 10844
    //   10836: ldc2_w -1285100733
    //   10839: l2i
    //   10840: ldc_w -991167720
    //   10843: ixor
    //   10844: ldc2_w 1943481735
    //   10847: l2i
    //   10848: ldc_w -1852111273
    //   10851: ixor
    //   10852: ixor
    //   10853: lookupswitch default -> 11080, -1782498421 -> 10880, -1033109256 -> 10836
    //   10880: aload_0
    //   10881: getstatic Perryc.0 : I
    //   10884: ifle -> 10898
    //   10887: ldc2_w 1499479954
    //   10890: l2i
    //   10891: ldc_w 1871716144
    //   10894: ixor
    //   10895: goto -> 10906
    //   10898: ldc2_w -1802459069
    //   10901: l2i
    //   10902: ldc_w 1584807963
    //   10905: ixor
    //   10906: ldc2_w 280460137
    //   10909: l2i
    //   10910: ldc_w -156065561
    //   10913: ixor
    //   10914: ixor
    //   10915: lookupswitch default -> 11170, -789185748 -> 10898, 753087446 -> 10940
    //   10940: invokespecial setInstance : ()V
    //   10943: return
    //   10944: aconst_null
    //   10945: athrow
    //   10946: aconst_null
    //   10947: athrow
    //   10948: aconst_null
    //   10949: athrow
    //   10950: aconst_null
    //   10951: athrow
    //   10952: aconst_null
    //   10953: athrow
    //   10954: aconst_null
    //   10955: athrow
    //   10956: aconst_null
    //   10957: athrow
    //   10958: aconst_null
    //   10959: athrow
    //   10960: aconst_null
    //   10961: athrow
    //   10962: aconst_null
    //   10963: athrow
    //   10964: aconst_null
    //   10965: athrow
    //   10966: aconst_null
    //   10967: athrow
    //   10968: aconst_null
    //   10969: athrow
    //   10970: aconst_null
    //   10971: athrow
    //   10972: aconst_null
    //   10973: athrow
    //   10974: aconst_null
    //   10975: athrow
    //   10976: aconst_null
    //   10977: athrow
    //   10978: aconst_null
    //   10979: athrow
    //   10980: aconst_null
    //   10981: athrow
    //   10982: aconst_null
    //   10983: athrow
    //   10984: aconst_null
    //   10985: athrow
    //   10986: aconst_null
    //   10987: athrow
    //   10988: aconst_null
    //   10989: athrow
    //   10990: aconst_null
    //   10991: athrow
    //   10992: aconst_null
    //   10993: athrow
    //   10994: aconst_null
    //   10995: athrow
    //   10996: aconst_null
    //   10997: athrow
    //   10998: aconst_null
    //   10999: athrow
    //   11000: aconst_null
    //   11001: athrow
    //   11002: aconst_null
    //   11003: athrow
    //   11004: aconst_null
    //   11005: athrow
    //   11006: aconst_null
    //   11007: athrow
    //   11008: aconst_null
    //   11009: athrow
    //   11010: aconst_null
    //   11011: athrow
    //   11012: aconst_null
    //   11013: athrow
    //   11014: aconst_null
    //   11015: athrow
    //   11016: aconst_null
    //   11017: athrow
    //   11018: aconst_null
    //   11019: athrow
    //   11020: aconst_null
    //   11021: athrow
    //   11022: aconst_null
    //   11023: athrow
    //   11024: aconst_null
    //   11025: athrow
    //   11026: aconst_null
    //   11027: athrow
    //   11028: aconst_null
    //   11029: athrow
    //   11030: aconst_null
    //   11031: athrow
    //   11032: aconst_null
    //   11033: athrow
    //   11034: aconst_null
    //   11035: athrow
    //   11036: aconst_null
    //   11037: athrow
    //   11038: aconst_null
    //   11039: athrow
    //   11040: aconst_null
    //   11041: athrow
    //   11042: aconst_null
    //   11043: athrow
    //   11044: aconst_null
    //   11045: athrow
    //   11046: aconst_null
    //   11047: athrow
    //   11048: aconst_null
    //   11049: athrow
    //   11050: aconst_null
    //   11051: athrow
    //   11052: aconst_null
    //   11053: athrow
    //   11054: aconst_null
    //   11055: athrow
    //   11056: aconst_null
    //   11057: athrow
    //   11058: aconst_null
    //   11059: athrow
    //   11060: aconst_null
    //   11061: athrow
    //   11062: aconst_null
    //   11063: athrow
    //   11064: aconst_null
    //   11065: athrow
    //   11066: aconst_null
    //   11067: athrow
    //   11068: aconst_null
    //   11069: athrow
    //   11070: aconst_null
    //   11071: athrow
    //   11072: aconst_null
    //   11073: athrow
    //   11074: aconst_null
    //   11075: athrow
    //   11076: aconst_null
    //   11077: athrow
    //   11078: aconst_null
    //   11079: athrow
    //   11080: aconst_null
    //   11081: athrow
    //   11082: aconst_null
    //   11083: athrow
    //   11084: aconst_null
    //   11085: athrow
    //   11086: aconst_null
    //   11087: athrow
    //   11088: aconst_null
    //   11089: athrow
    //   11090: aconst_null
    //   11091: athrow
    //   11092: aconst_null
    //   11093: athrow
    //   11094: aconst_null
    //   11095: athrow
    //   11096: aconst_null
    //   11097: athrow
    //   11098: aconst_null
    //   11099: athrow
    //   11100: aconst_null
    //   11101: athrow
    //   11102: aconst_null
    //   11103: athrow
    //   11104: aconst_null
    //   11105: athrow
    //   11106: aconst_null
    //   11107: athrow
    //   11108: aconst_null
    //   11109: athrow
    //   11110: aconst_null
    //   11111: athrow
    //   11112: aconst_null
    //   11113: athrow
    //   11114: aconst_null
    //   11115: athrow
    //   11116: aconst_null
    //   11117: athrow
    //   11118: aconst_null
    //   11119: athrow
    //   11120: aconst_null
    //   11121: athrow
    //   11122: aconst_null
    //   11123: athrow
    //   11124: aconst_null
    //   11125: athrow
    //   11126: aconst_null
    //   11127: athrow
    //   11128: aconst_null
    //   11129: athrow
    //   11130: aconst_null
    //   11131: athrow
    //   11132: aconst_null
    //   11133: athrow
    //   11134: aconst_null
    //   11135: athrow
    //   11136: aconst_null
    //   11137: athrow
    //   11138: aconst_null
    //   11139: athrow
    //   11140: aconst_null
    //   11141: athrow
    //   11142: aconst_null
    //   11143: athrow
    //   11144: aconst_null
    //   11145: athrow
    //   11146: aconst_null
    //   11147: athrow
    //   11148: aconst_null
    //   11149: athrow
    //   11150: aconst_null
    //   11151: athrow
    //   11152: aconst_null
    //   11153: athrow
    //   11154: aconst_null
    //   11155: athrow
    //   11156: aconst_null
    //   11157: athrow
    //   11158: aconst_null
    //   11159: athrow
    //   11160: aconst_null
    //   11161: athrow
    //   11162: aconst_null
    //   11163: athrow
    //   11164: aconst_null
    //   11165: athrow
    //   11166: aconst_null
    //   11167: athrow
    //   11168: aconst_null
    //   11169: athrow
    //   11170: aconst_null
    //   11171: athrow
    //   11172: aconst_null
    //   11173: athrow
    //   11174: aconst_null
    //   11175: athrow
    //   11176: aconst_null
    //   11177: athrow
    //   11178: aconst_null
    //   11179: athrow
    //   11180: aconst_null
    //   11181: athrow
    //   11182: aconst_null
    //   11183: athrow
    //   11184: aconst_null
    //   11185: athrow
    //   11186: aconst_null
    //   11187: athrow
    //   11188: aconst_null
    //   11189: athrow
    //   11190: aconst_null
    //   11191: athrow
    //   11192: aconst_null
    //   11193: athrow
    //   11194: aconst_null
    //   11195: athrow
    //   11196: aconst_null
    //   11197: athrow
    //   11198: aconst_null
    //   11199: athrow
    //   11200: aconst_null
    //   11201: athrow
    //   11202: aconst_null
    //   11203: athrow
    //   11204: aconst_null
    //   11205: athrow
    //   11206: aconst_null
    //   11207: athrow
    //   11208: aconst_null
    //   11209: athrow
    //   11210: aconst_null
    //   11211: athrow
    //   11212: aconst_null
    //   11213: athrow
    //   11214: aconst_null
    //   11215: athrow
    //   11216: aconst_null
    //   11217: athrow
    //   11218: aconst_null
    //   11219: athrow
    //   11220: aconst_null
    //   11221: athrow
    //   11222: aconst_null
    //   11223: athrow
    //   11224: aconst_null
    //   11225: athrow
    //   11226: aconst_null
    //   11227: athrow
    //   11228: aconst_null
    //   11229: athrow
    //   11230: aconst_null
    //   11231: athrow
    //   11232: aconst_null
    //   11233: athrow
    //   11234: aconst_null
    //   11235: athrow
    //   11236: aconst_null
    //   11237: athrow
    //   11238: aconst_null
    //   11239: athrow
    //   11240: aconst_null
    //   11241: athrow
    //   11242: aconst_null
    //   11243: athrow
    //   11244: aconst_null
    //   11245: athrow
    //   11246: aconst_null
    //   11247: athrow
    //   11248: aconst_null
    //   11249: athrow
    //   11250: aconst_null
    //   11251: athrow
    //   11252: aconst_null
    //   11253: athrow
    //   11254: aconst_null
    //   11255: athrow
    //   11256: aconst_null
    //   11257: athrow
    //   11258: aconst_null
    //   11259: athrow
    //   11260: aconst_null
    //   11261: athrow
    //   11262: aconst_null
    //   11263: athrow
    //   11264: aconst_null
    //   11265: athrow
    //   11266: aconst_null
    //   11267: athrow
    //   11268: aconst_null
    //   11269: athrow
    //   11270: aconst_null
    //   11271: athrow
    //   11272: aconst_null
    //   11273: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	10944	0	this	Lbigname/zprestige/webhack/features/modules/Player/Blink;
  }
  
  public void onRender3D(Render3DEvent event) {
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
  
  public boolean lambda$new$13(Float paramFloat) {
    return Perry1.J(this, (int)2096108297L ^ 0x6FF8F0F8, paramFloat);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Player/Blink
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 21
    //   10: ldc2_w -902127694
    //   13: l2i
    //   14: ldc_w 121373719
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w 281149841
    //   24: l2i
    //   25: ldc_w -1639020
    //   28: ixor
    //   29: ldc2_w 1251134624
    //   32: l2i
    //   33: ldc_w 1567643632
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 134, -622591755 -> 21, -121215147 -> 64
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.c : I
    //   70: iflt -> 84
    //   73: ldc2_w 518269038
    //   76: l2i
    //   77: ldc_w 642520978
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -1015551442
    //   87: l2i
    //   88: ldc_w 2140426760
    //   91: ixor
    //   92: ldc2_w 1857181420
    //   95: l2i
    //   96: ldc_w -1568474746
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -191328106 -> 132, 1660882061 -> 84
    //   128: putstatic bigname/zprestige/webhack/features/modules/Player/Blink.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Blink;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public void onEnable() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3458
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3450
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3442
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -867494540
    //   33: l2i
    //   34: ldc_w 1100178727
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1057379050
    //   44: l2i
    //   45: ldc_w 1239958369
    //   48: ixor
    //   49: ldc2_w -536245598
    //   52: l2i
    //   53: ldc_w -850897550
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 3373, -1600540797 -> 41, 1538248283 -> 84
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifne -> 109
    //   98: ldc2_w -1904666813
    //   101: l2i
    //   102: ldc_w 2138435039
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 307122192
    //   112: l2i
    //   113: ldc_w -482170227
    //   116: ixor
    //   117: ldc2_w 191637980
    //   120: l2i
    //   121: ldc_w -1316153192
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, 1273875416 -> 148, 1273875417 -> 2870
    //   148: getstatic Perryc.0 : I
    //   151: ifle -> 165
    //   154: ldc2_w -1305326029
    //   157: l2i
    //   158: ldc_w 1476840357
    //   161: ixor
    //   162: goto -> 173
    //   165: ldc2_w 122256335
    //   168: l2i
    //   169: ldc_w -1753862097
    //   172: ixor
    //   173: ldc2_w 1101394933
    //   176: l2i
    //   177: ldc_w 1084553239
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 3419, -1858191358 -> 208, -348811660 -> 165
    //   208: aload_0
    //   209: new net/minecraft/client/entity/EntityOtherPlayerMP
    //   212: dup
    //   213: getstatic Perryc.c : I
    //   216: iflt -> 230
    //   219: ldc2_w 2137240274
    //   222: l2i
    //   223: ldc_w 1315775348
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 628468951
    //   233: l2i
    //   234: ldc_w -1760715446
    //   237: ixor
    //   238: ldc2_w 2075998552
    //   241: l2i
    //   242: ldc_w 399337261
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 272, -772449597 -> 230, 1568591827 -> 3413
    //   272: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   275: getstatic Perryc.0 : I
    //   278: ifle -> 292
    //   281: ldc2_w -324323265
    //   284: l2i
    //   285: ldc_w -1032606622
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w -570672641
    //   295: l2i
    //   296: ldc_w 1999467423
    //   299: ixor
    //   300: ldc2_w -1095753942
    //   303: l2i
    //   304: ldc_w 835893870
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 3397, -1581633255 -> 292, 632549156 -> 336
    //   336: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   339: getstatic Perryc.1 : I
    //   342: ifeq -> 356
    //   345: ldc2_w 1895325685
    //   348: l2i
    //   349: ldc_w 701701174
    //   352: ixor
    //   353: goto -> 364
    //   356: ldc2_w 851727779
    //   359: l2i
    //   360: ldc_w -1781166240
    //   363: ixor
    //   364: ldc2_w 601386576
    //   367: l2i
    //   368: ldc_w 1621370114
    //   371: ixor
    //   372: ixor
    //   373: lookupswitch default -> 400, -1390160747 -> 356, 441911441 -> 3333
    //   400: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   403: getstatic Perryc.0 : I
    //   406: ifle -> 420
    //   409: ldc2_w -1441721219
    //   412: l2i
    //   413: ldc_w -737324405
    //   416: ixor
    //   417: goto -> 428
    //   420: ldc2_w 1008372941
    //   423: l2i
    //   424: ldc_w 744425339
    //   427: ixor
    //   428: ldc2_w 242500983
    //   431: l2i
    //   432: ldc_w 1765091006
    //   435: ixor
    //   436: ixor
    //   437: lookupswitch default -> 3403, 425534783 -> 420, 1996810367 -> 464
    //   464: getfield field_71449_j : Lnet/minecraft/util/Session;
    //   467: getstatic Perryc.c : I
    //   470: iflt -> 484
    //   473: ldc2_w 260064117
    //   476: l2i
    //   477: ldc_w 417912621
    //   480: ixor
    //   481: goto -> 492
    //   484: ldc2_w 421202743
    //   487: l2i
    //   488: ldc_w -596703229
    //   491: ixor
    //   492: ldc2_w -512396091
    //   495: l2i
    //   496: ldc_w -1162015993
    //   499: ixor
    //   500: ixor
    //   501: lookupswitch default -> 528, 511312540 -> 484, 1285614490 -> 3369
    //   528: goto -> 532
    //   531: athrow
    //   532: invokevirtual func_148256_e : ()Lcom/mojang/authlib/GameProfile;
    //   535: goto -> 539
    //   538: athrow
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 556
    //   545: ldc2_w 5869510
    //   548: l2i
    //   549: ldc_w -1399982977
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 2100067053
    //   559: l2i
    //   560: ldc_w 1211635200
    //   563: ixor
    //   564: ldc2_w -906959040
    //   567: l2i
    //   568: ldc_w 1625514949
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 600, -1859762257 -> 556, 96993084 -> 3401
    //   600: goto -> 604
    //   603: athrow
    //   604: invokespecial <init> : (Lnet/minecraft/world/World;Lcom/mojang/authlib/GameProfile;)V
    //   607: goto -> 611
    //   610: athrow
    //   611: getstatic Perryc.1 : I
    //   614: ifeq -> 628
    //   617: ldc2_w -1342660079
    //   620: l2i
    //   621: ldc_w 1083593625
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w 1006668829
    //   631: l2i
    //   632: ldc_w -1750070951
    //   635: ixor
    //   636: ldc2_w 156784534
    //   639: l2i
    //   640: ldc_w 1797132452
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 672, -1926711622 -> 3371, 1400480169 -> 628
    //   672: putfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   675: getstatic Perryc.1 : I
    //   678: ifeq -> 692
    //   681: ldc2_w 1486218334
    //   684: l2i
    //   685: ldc_w 1174601541
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 2097923738
    //   695: l2i
    //   696: ldc_w -1200347001
    //   699: ixor
    //   700: ldc2_w 1035495486
    //   703: l2i
    //   704: ldc_w 1446722293
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 3405, -1359168298 -> 736, 1964263888 -> 692
    //   736: aload_0
    //   737: getstatic Perryc.1 : I
    //   740: ifeq -> 754
    //   743: ldc2_w -557947976
    //   746: l2i
    //   747: ldc_w 93374220
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -285448125
    //   757: l2i
    //   758: ldc_w -1428612020
    //   761: ixor
    //   762: ldc2_w -1941603625
    //   765: l2i
    //   766: ldc_w -71308744
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 3415, -1395379109 -> 754, 870311136 -> 796
    //   796: getfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   799: getstatic Perryc.c : I
    //   802: iflt -> 816
    //   805: ldc2_w 238240247
    //   808: l2i
    //   809: ldc_w 372196796
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -1938102825
    //   819: l2i
    //   820: ldc_w 624550308
    //   823: ixor
    //   824: ldc2_w -755358334
    //   827: l2i
    //   828: ldc_w -1872887104
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 860, 1275266395 -> 816, 1522017033 -> 3381
    //   860: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   863: getstatic Perryc.c : I
    //   866: iflt -> 880
    //   869: ldc2_w -800561253
    //   872: l2i
    //   873: ldc_w 1764784052
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w -1119337514
    //   883: l2i
    //   884: ldc_w -612340793
    //   887: ixor
    //   888: ldc2_w -141092403
    //   891: l2i
    //   892: ldc_w 927724190
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 3341, -1508588734 -> 924, 2040855420 -> 880
    //   924: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   927: getstatic Perryc.1 : I
    //   930: ifeq -> 944
    //   933: ldc2_w -1040936637
    //   936: l2i
    //   937: ldc_w 53230971
    //   940: ixor
    //   941: goto -> 952
    //   944: ldc2_w -1941105103
    //   947: l2i
    //   948: ldc_w -2081108758
    //   951: ixor
    //   952: ldc2_w -746155780
    //   955: l2i
    //   956: ldc_w 940225075
    //   959: ixor
    //   960: ixor
    //   961: lookupswitch default -> 3399, -466225132 -> 988, 693407479 -> 944
    //   988: goto -> 992
    //   991: athrow
    //   992: invokevirtual func_82149_j : (Lnet/minecraft/entity/Entity;)V
    //   995: goto -> 999
    //   998: athrow
    //   999: getstatic Perryc.0 : I
    //   1002: ifle -> 1016
    //   1005: ldc2_w -763405496
    //   1008: l2i
    //   1009: ldc_w 1363560464
    //   1012: ixor
    //   1013: goto -> 1024
    //   1016: ldc2_w -2043548519
    //   1019: l2i
    //   1020: ldc_w -30493852
    //   1023: ixor
    //   1024: ldc2_w -164528167
    //   1027: l2i
    //   1028: ldc_w 2051299853
    //   1031: ixor
    //   1032: ixor
    //   1033: lookupswitch default -> 3391, -194348503 -> 1060, 256652940 -> 1016
    //   1060: aload_0
    //   1061: getstatic Perryc.0 : I
    //   1064: ifle -> 1078
    //   1067: ldc2_w -182564075
    //   1070: l2i
    //   1071: ldc_w 1839237208
    //   1074: ixor
    //   1075: goto -> 1086
    //   1078: ldc2_w -1600465073
    //   1081: l2i
    //   1082: ldc_w 700166289
    //   1085: ixor
    //   1086: ldc2_w -314604761
    //   1089: l2i
    //   1090: ldc_w -482979540
    //   1093: ixor
    //   1094: ixor
    //   1095: lookupswitch default -> 1120, -1766387386 -> 3375, -236170827 -> 1078
    //   1120: getfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   1123: getstatic Perryc.1 : I
    //   1126: ifeq -> 1140
    //   1129: ldc2_w -1632943668
    //   1132: l2i
    //   1133: ldc_w 1262337810
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -1773829761
    //   1143: l2i
    //   1144: ldc_w -1288980441
    //   1147: ixor
    //   1148: ldc2_w 944793242
    //   1151: l2i
    //   1152: ldc_w -53781528
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 3395, -504036310 -> 1184, 286114732 -> 1140
    //   1184: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   1187: getstatic Perryc.0 : I
    //   1190: ifle -> 1204
    //   1193: ldc2_w 469984596
    //   1196: l2i
    //   1197: ldc_w 2106914651
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w -80749604
    //   1207: l2i
    //   1208: ldc_w 358737575
    //   1211: ixor
    //   1212: ldc2_w -1767377840
    //   1215: l2i
    //   1216: ldc_w -734914908
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 3385, -1394876529 -> 1248, 587362555 -> 1204
    //   1248: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1251: getstatic Perryc.1 : I
    //   1254: ifeq -> 1268
    //   1257: ldc2_w -1585224969
    //   1260: l2i
    //   1261: ldc_w -1154874515
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 1289097925
    //   1271: l2i
    //   1272: ldc_w 1367423989
    //   1275: ixor
    //   1276: ldc2_w 505950066
    //   1279: l2i
    //   1280: ldc_w 2055760512
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 1312, 1024550936 -> 1268, 2114528360 -> 3377
    //   1312: getfield field_70177_z : F
    //   1315: getstatic Perryc.1 : I
    //   1318: ifeq -> 1332
    //   1321: ldc2_w 929594172
    //   1324: l2i
    //   1325: ldc_w 1115121985
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w 561792094
    //   1335: l2i
    //   1336: ldc_w -523086540
    //   1339: ixor
    //   1340: ldc2_w -950533298
    //   1343: l2i
    //   1344: ldc_w -1756831093
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, -557787839 -> 1332, 621802424 -> 3361
    //   1376: putfield field_70177_z : F
    //   1379: getstatic Perryc.c : I
    //   1382: iflt -> 1396
    //   1385: ldc2_w -2024031364
    //   1388: l2i
    //   1389: ldc_w -1627730174
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w -196142480
    //   1399: l2i
    //   1400: ldc_w 997121040
    //   1403: ixor
    //   1404: ldc2_w -29252272
    //   1407: l2i
    //   1408: ldc_w -2057678985
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 3429, -1271255993 -> 1440, 1656397401 -> 1396
    //   1440: aload_0
    //   1441: getstatic Perryc.0 : I
    //   1444: ifle -> 1458
    //   1447: ldc2_w 2049769309
    //   1450: l2i
    //   1451: ldc_w -15219684
    //   1454: ixor
    //   1455: goto -> 1466
    //   1458: ldc2_w 164457569
    //   1461: l2i
    //   1462: ldc_w -1005228028
    //   1465: ixor
    //   1466: ldc2_w 1214874118
    //   1469: l2i
    //   1470: ldc_w -1795183304
    //   1473: ixor
    //   1474: ixor
    //   1475: lookupswitch default -> 3411, 290337627 -> 1500, 1504515199 -> 1458
    //   1500: getfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   1503: getstatic Perryc.c : I
    //   1506: iflt -> 1520
    //   1509: ldc2_w -294237051
    //   1512: l2i
    //   1513: ldc_w 19206418
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w 214169587
    //   1523: l2i
    //   1524: ldc_w 405326595
    //   1527: ixor
    //   1528: ldc2_w 1202726822
    //   1531: l2i
    //   1532: ldc_w 1646426421
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 1564, -893320444 -> 3409, 420819059 -> 1520
    //   1564: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   1567: getstatic Perryc.0 : I
    //   1570: ifle -> 1584
    //   1573: ldc2_w 1723534468
    //   1576: l2i
    //   1577: ldc_w 2084077061
    //   1580: ixor
    //   1581: goto -> 1592
    //   1584: ldc2_w 1054440972
    //   1587: l2i
    //   1588: ldc_w -1649727960
    //   1591: ixor
    //   1592: ldc2_w 2011595201
    //   1595: l2i
    //   1596: ldc_w -1360488585
    //   1599: ixor
    //   1600: ixor
    //   1601: lookupswitch default -> 3389, -1014143945 -> 1584, 2054966930 -> 1628
    //   1628: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1631: getstatic Perryc.1 : I
    //   1634: ifeq -> 1648
    //   1637: ldc2_w -631149337
    //   1640: l2i
    //   1641: ldc_w -182113874
    //   1644: ixor
    //   1645: goto -> 1656
    //   1648: ldc2_w -752822834
    //   1651: l2i
    //   1652: ldc_w -139559092
    //   1655: ixor
    //   1656: ldc2_w -615630409
    //   1659: l2i
    //   1660: ldc_w -454459523
    //   1663: ixor
    //   1664: ixor
    //   1665: lookupswitch default -> 3423, 283313027 -> 1648, 455732296 -> 1692
    //   1692: getfield field_70759_as : F
    //   1695: getstatic Perryc.1 : I
    //   1698: ifeq -> 1712
    //   1701: ldc2_w -215645542
    //   1704: l2i
    //   1705: ldc_w -174813625
    //   1708: ixor
    //   1709: goto -> 1720
    //   1712: ldc2_w 958663414
    //   1715: l2i
    //   1716: ldc_w 163377663
    //   1719: ixor
    //   1720: ldc2_w 1771622338
    //   1723: l2i
    //   1724: ldc_w -84261602
    //   1727: ixor
    //   1728: ixor
    //   1729: lookupswitch default -> 3365, -1781299711 -> 1712, -1543867947 -> 1756
    //   1756: putfield field_70759_as : F
    //   1759: getstatic Perryc.1 : I
    //   1762: ifeq -> 1776
    //   1765: ldc2_w 1777505540
    //   1768: l2i
    //   1769: ldc_w -1186011634
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w -1546825220
    //   1779: l2i
    //   1780: ldc_w 722845287
    //   1783: ixor
    //   1784: ldc2_w 1734910589
    //   1787: l2i
    //   1788: ldc_w 1324169956
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 3343, -1587710206 -> 1820, -113644653 -> 1776
    //   1820: aload_0
    //   1821: getstatic Perryc.0 : I
    //   1824: ifle -> 1838
    //   1827: ldc2_w -1753397289
    //   1830: l2i
    //   1831: ldc_w 798876666
    //   1834: ixor
    //   1835: goto -> 1846
    //   1838: ldc2_w 1503426075
    //   1841: l2i
    //   1842: ldc_w 1399465492
    //   1845: ixor
    //   1846: ldc2_w -107876456
    //   1849: l2i
    //   1850: ldc_w 235329783
    //   1853: ixor
    //   1854: ixor
    //   1855: lookupswitch default -> 3417, -43948192 -> 1880, 1333236546 -> 1838
    //   1880: getfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   1883: getstatic Perryc.c : I
    //   1886: iflt -> 1900
    //   1889: ldc2_w -183701191
    //   1892: l2i
    //   1893: ldc_w -1715909537
    //   1896: ixor
    //   1897: goto -> 1908
    //   1900: ldc2_w 1216715920
    //   1903: l2i
    //   1904: ldc_w 52661661
    //   1907: ixor
    //   1908: ldc2_w -485573989
    //   1911: l2i
    //   1912: ldc_w 442630982
    //   1915: ixor
    //   1916: ixor
    //   1917: lookupswitch default -> 1944, -1780939589 -> 3427, -171651361 -> 1900
    //   1944: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   1947: getstatic Perryc.c : I
    //   1950: iflt -> 1964
    //   1953: ldc2_w 910637496
    //   1956: l2i
    //   1957: ldc_w -1484423640
    //   1960: ixor
    //   1961: goto -> 1972
    //   1964: ldc2_w -1554133599
    //   1967: l2i
    //   1968: ldc_w 431820445
    //   1971: ixor
    //   1972: ldc2_w -1328177040
    //   1975: l2i
    //   1976: ldc_w -641531006
    //   1979: ixor
    //   1980: ixor
    //   1981: lookupswitch default -> 2008, -120265630 -> 3387, 1907614043 -> 1964
    //   2008: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   2011: getstatic Perryc.0 : I
    //   2014: ifle -> 2028
    //   2017: ldc2_w 657029447
    //   2020: l2i
    //   2021: ldc_w -1610008841
    //   2024: ixor
    //   2025: goto -> 2036
    //   2028: ldc2_w -1825570801
    //   2031: l2i
    //   2032: ldc_w -1107059775
    //   2035: ixor
    //   2036: ldc2_w -608971349
    //   2039: l2i
    //   2040: ldc_w -1786083464
    //   2043: ixor
    //   2044: ixor
    //   2045: lookupswitch default -> 3379, -921100957 -> 2028, 1661651229 -> 2072
    //   2072: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2075: getstatic Perryc.0 : I
    //   2078: ifle -> 2092
    //   2081: ldc2_w -14732977
    //   2084: l2i
    //   2085: ldc_w 1758677544
    //   2088: ixor
    //   2089: goto -> 2100
    //   2092: ldc2_w 2051672315
    //   2095: l2i
    //   2096: ldc_w -1156068297
    //   2099: ixor
    //   2100: ldc2_w 1958740381
    //   2103: l2i
    //   2104: ldc_w 27000988
    //   2107: ixor
    //   2108: ixor
    //   2109: lookupswitch default -> 3363, -1274952243 -> 2136, -493847962 -> 2092
    //   2136: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   2139: getstatic Perryc.c : I
    //   2142: iflt -> 2156
    //   2145: ldc2_w -2106265283
    //   2148: l2i
    //   2149: ldc_w -1012194515
    //   2152: ixor
    //   2153: goto -> 2164
    //   2156: ldc2_w 78911927
    //   2159: l2i
    //   2160: ldc_w -377151195
    //   2163: ixor
    //   2164: ldc2_w -93374648
    //   2167: l2i
    //   2168: ldc_w -1249805360
    //   2171: ixor
    //   2172: ixor
    //   2173: lookupswitch default -> 3425, -1562414070 -> 2200, 238132872 -> 2156
    //   2200: goto -> 2204
    //   2203: athrow
    //   2204: invokevirtual func_70455_b : (Lnet/minecraft/entity/player/InventoryPlayer;)V
    //   2207: goto -> 2211
    //   2210: athrow
    //   2211: getstatic Perryc.c : I
    //   2214: iflt -> 2228
    //   2217: ldc2_w 2039505985
    //   2220: l2i
    //   2221: ldc_w 330933655
    //   2224: ixor
    //   2225: goto -> 2236
    //   2228: ldc2_w -1734610777
    //   2231: l2i
    //   2232: ldc_w 1401905159
    //   2235: ixor
    //   2236: ldc2_w -1707449354
    //   2239: l2i
    //   2240: ldc_w -268724151
    //   2243: ixor
    //   2244: ixor
    //   2245: lookupswitch default -> 3345, -1093309665 -> 2272, 535313001 -> 2228
    //   2272: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   2275: getstatic Perryc.1 : I
    //   2278: ifeq -> 2292
    //   2281: ldc2_w 756999729
    //   2284: l2i
    //   2285: ldc_w 962583019
    //   2288: ixor
    //   2289: goto -> 2300
    //   2292: ldc2_w 2138437835
    //   2295: l2i
    //   2296: ldc_w -1011545663
    //   2299: ixor
    //   2300: ldc2_w -142102324
    //   2303: l2i
    //   2304: ldc_w 330992488
    //   2307: ixor
    //   2308: ixor
    //   2309: lookupswitch default -> 2336, -260307842 -> 3349, 1669150685 -> 2292
    //   2336: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2339: ldc2_w -560231415
    //   2342: l2i
    //   2343: ldc_w -554540676
    //   2346: ixor
    //   2347: getstatic Perryc.1 : I
    //   2350: ifeq -> 2364
    //   2353: ldc2_w 1396227696
    //   2356: l2i
    //   2357: ldc_w -1559017855
    //   2360: ixor
    //   2361: goto -> 2372
    //   2364: ldc2_w -1951961391
    //   2367: l2i
    //   2368: ldc_w -1082171747
    //   2371: ixor
    //   2372: ldc2_w -1128691658
    //   2375: l2i
    //   2376: ldc_w 206845468
    //   2379: ixor
    //   2380: ixor
    //   2381: lookupswitch default -> 2408, 749405371 -> 2364, 1086736091 -> 3351
    //   2408: aload_0
    //   2409: getstatic Perryc.1 : I
    //   2412: ifeq -> 2426
    //   2415: ldc2_w 301274256
    //   2418: l2i
    //   2419: ldc_w 789175582
    //   2422: ixor
    //   2423: goto -> 2434
    //   2426: ldc2_w 149678572
    //   2429: l2i
    //   2430: ldc_w -1348532577
    //   2433: ixor
    //   2434: ldc2_w 1075127895
    //   2437: l2i
    //   2438: ldc_w 961546181
    //   2441: ixor
    //   2442: ixor
    //   2443: lookupswitch default -> 2468, -1040391898 -> 2426, 1203365916 -> 3359
    //   2468: getfield entity : Lnet/minecraft/client/entity/EntityOtherPlayerMP;
    //   2471: getstatic Perryc.0 : I
    //   2474: ifle -> 2488
    //   2477: ldc2_w -1922029667
    //   2480: l2i
    //   2481: ldc_w -37593047
    //   2484: ixor
    //   2485: goto -> 2496
    //   2488: ldc2_w 649465392
    //   2491: l2i
    //   2492: ldc_w -2137004481
    //   2495: ixor
    //   2496: ldc2_w -1118458798
    //   2499: l2i
    //   2500: ldc_w 703308518
    //   2503: ixor
    //   2504: ixor
    //   2505: lookupswitch default -> 2532, -928415467 -> 2488, -468956928 -> 3383
    //   2532: goto -> 2536
    //   2535: athrow
    //   2536: invokevirtual func_73027_a : (ILnet/minecraft/entity/Entity;)V
    //   2539: goto -> 2543
    //   2542: athrow
    //   2543: getstatic Perryc.1 : I
    //   2546: ifeq -> 2560
    //   2549: ldc2_w -1531560701
    //   2552: l2i
    //   2553: ldc_w 1559526470
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w 1036327813
    //   2563: l2i
    //   2564: ldc_w -600867779
    //   2567: ixor
    //   2568: ldc2_w -710494990
    //   2571: l2i
    //   2572: ldc_w -43023485
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 3337, -920432439 -> 2604, -796166604 -> 2560
    //   2604: aload_0
    //   2605: getstatic Perryc.1 : I
    //   2608: ifeq -> 2622
    //   2611: ldc2_w 314606298
    //   2614: l2i
    //   2615: ldc_w -108608960
    //   2618: ixor
    //   2619: goto -> 2630
    //   2622: ldc2_w -1138915028
    //   2625: l2i
    //   2626: ldc_w 1098365872
    //   2629: ixor
    //   2630: ldc2_w -1756178453
    //   2633: l2i
    //   2634: ldc_w -762147011
    //   2637: ixor
    //   2638: ixor
    //   2639: lookupswitch default -> 2664, -1366943668 -> 3335, -1053497796 -> 2622
    //   2664: getstatic bigname/zprestige/webhack/features/modules/Player/Blink.mc : Lnet/minecraft/client/Minecraft;
    //   2667: getstatic Perryc.c : I
    //   2670: iflt -> 2684
    //   2673: ldc2_w 1598099810
    //   2676: l2i
    //   2677: ldc_w -1167378970
    //   2680: ixor
    //   2681: goto -> 2692
    //   2684: ldc2_w 462478038
    //   2687: l2i
    //   2688: ldc_w -2140826055
    //   2691: ixor
    //   2692: ldc2_w -317980006
    //   2695: l2i
    //   2696: ldc_w 441137780
    //   2699: ixor
    //   2700: ixor
    //   2701: lookupswitch default -> 2728, 309140586 -> 3407, 554694266 -> 2684
    //   2728: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2731: getstatic Perryc.c : I
    //   2734: iflt -> 2748
    //   2737: ldc2_w -832504065
    //   2740: l2i
    //   2741: ldc_w 1998596270
    //   2744: ixor
    //   2745: goto -> 2756
    //   2748: ldc2_w -426988519
    //   2751: l2i
    //   2752: ldc_w -35733733
    //   2755: ixor
    //   2756: ldc2_w -1268024708
    //   2759: l2i
    //   2760: ldc_w -302834483
    //   2763: ixor
    //   2764: ixor
    //   2765: lookupswitch default -> 3355, -522669856 -> 2748, 1120564659 -> 2792
    //   2792: goto -> 2796
    //   2795: athrow
    //   2796: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   2799: goto -> 2803
    //   2802: athrow
    //   2803: getstatic Perryc.0 : I
    //   2806: ifle -> 2820
    //   2809: ldc2_w 1982038693
    //   2812: l2i
    //   2813: ldc_w 1107262006
    //   2816: ixor
    //   2817: goto -> 2828
    //   2820: ldc2_w 1443771577
    //   2823: l2i
    //   2824: ldc_w -1727863027
    //   2827: ixor
    //   2828: ldc2_w -1605185873
    //   2831: l2i
    //   2832: ldc_w -1869239702
    //   2835: ixor
    //   2836: ixor
    //   2837: lookupswitch default -> 3393, -3426447 -> 2864, 119250006 -> 2820
    //   2864: putfield startPos : Lnet/minecraft/util/math/BlockPos;
    //   2867: goto -> 3003
    //   2870: getstatic Perryc.c : I
    //   2873: iflt -> 2887
    //   2876: ldc2_w -1499640767
    //   2879: l2i
    //   2880: ldc_w -363330941
    //   2883: ixor
    //   2884: goto -> 2895
    //   2887: ldc2_w 2146407878
    //   2890: l2i
    //   2891: ldc_w -841682993
    //   2894: ixor
    //   2895: ldc2_w 993787363
    //   2898: l2i
    //   2899: ldc_w -373562746
    //   2902: ixor
    //   2903: ixor
    //   2904: lookupswitch default -> 3353, -1639624281 -> 2887, 1622893932 -> 2932
    //   2932: aload_0
    //   2933: getstatic Perryc.1 : I
    //   2936: ifeq -> 2950
    //   2939: ldc2_w 1799161295
    //   2942: l2i
    //   2943: ldc_w -1380144940
    //   2946: ixor
    //   2947: goto -> 2958
    //   2950: ldc2_w 1881684093
    //   2953: l2i
    //   2954: ldc_w -1066788322
    //   2957: ixor
    //   2958: ldc2_w 1455405145
    //   2961: l2i
    //   2962: ldc_w 28927431
    //   2965: ixor
    //   2966: ixor
    //   2967: lookupswitch default -> 2992, -1853394811 -> 3431, 888533827 -> 2950
    //   2992: goto -> 2996
    //   2995: athrow
    //   2996: invokevirtual disable : ()V
    //   2999: goto -> 3003
    //   3002: athrow
    //   3003: getstatic Perryc.1 : I
    //   3006: ifeq -> 3020
    //   3009: ldc2_w -1519823308
    //   3012: l2i
    //   3013: ldc_w -2088420503
    //   3016: ixor
    //   3017: goto -> 3028
    //   3020: ldc2_w 43775295
    //   3023: l2i
    //   3024: ldc_w -146542010
    //   3027: ixor
    //   3028: ldc2_w -377224114
    //   3031: l2i
    //   3032: ldc_w -963720931
    //   3035: ixor
    //   3036: ixor
    //   3037: lookupswitch default -> 3064, 76472258 -> 3020, 166109198 -> 3367
    //   3064: aload_0
    //   3065: ldc2_w 708131832
    //   3068: l2i
    //   3069: ldc_w 708131832
    //   3072: ixor
    //   3073: getstatic Perryc.0 : I
    //   3076: ifle -> 3090
    //   3079: ldc2_w -92082523
    //   3082: l2i
    //   3083: ldc_w 1344905820
    //   3086: ixor
    //   3087: goto -> 3098
    //   3090: ldc2_w -1152721572
    //   3093: l2i
    //   3094: ldc_w -1520648447
    //   3097: ixor
    //   3098: ldc2_w -75166632
    //   3101: l2i
    //   3102: ldc_w 1574182645
    //   3105: ixor
    //   3106: ixor
    //   3107: lookupswitch default -> 3132, 217734740 -> 3339, 1535991855 -> 3090
    //   3132: putfield packetsCanceled : I
    //   3135: getstatic Perryc.1 : I
    //   3138: ifeq -> 3152
    //   3141: ldc2_w -1312860355
    //   3144: l2i
    //   3145: ldc_w -1435130723
    //   3148: ixor
    //   3149: goto -> 3160
    //   3152: ldc2_w -209283073
    //   3155: l2i
    //   3156: ldc_w 580685456
    //   3159: ixor
    //   3160: ldc2_w 741910072
    //   3163: l2i
    //   3164: ldc_w -769406193
    //   3167: ixor
    //   3168: ixor
    //   3169: lookupswitch default -> 3347, -439247209 -> 3152, 788624472 -> 3196
    //   3196: aload_0
    //   3197: getstatic Perryc.0 : I
    //   3200: ifle -> 3214
    //   3203: ldc2_w 1299574431
    //   3206: l2i
    //   3207: ldc_w -721593377
    //   3210: ixor
    //   3211: goto -> 3222
    //   3214: ldc2_w 1555394392
    //   3217: l2i
    //   3218: ldc_w 1575451962
    //   3221: ixor
    //   3222: ldc2_w 1428544607
    //   3225: l2i
    //   3226: ldc_w -350590147
    //   3229: ixor
    //   3230: ixor
    //   3231: lookupswitch default -> 3256, -1660764839 -> 3214, 666305058 -> 3421
    //   3256: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   3259: getstatic Perryc.c : I
    //   3262: iflt -> 3276
    //   3265: ldc2_w -519814627
    //   3268: l2i
    //   3269: ldc_w 822660749
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w -100790890
    //   3279: l2i
    //   3280: ldc_w -117067307
    //   3283: ixor
    //   3284: ldc2_w 528001030
    //   3287: l2i
    //   3288: ldc_w 917577490
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 3320, -104514684 -> 3357, 117892613 -> 3276
    //   3320: goto -> 3324
    //   3323: athrow
    //   3324: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   3327: goto -> 3331
    //   3330: athrow
    //   3331: pop
    //   3332: return
    //   3333: aconst_null
    //   3334: athrow
    //   3335: aconst_null
    //   3336: athrow
    //   3337: aconst_null
    //   3338: athrow
    //   3339: aconst_null
    //   3340: athrow
    //   3341: aconst_null
    //   3342: athrow
    //   3343: aconst_null
    //   3344: athrow
    //   3345: aconst_null
    //   3346: athrow
    //   3347: aconst_null
    //   3348: athrow
    //   3349: aconst_null
    //   3350: athrow
    //   3351: aconst_null
    //   3352: athrow
    //   3353: aconst_null
    //   3354: athrow
    //   3355: aconst_null
    //   3356: athrow
    //   3357: aconst_null
    //   3358: athrow
    //   3359: aconst_null
    //   3360: athrow
    //   3361: aconst_null
    //   3362: athrow
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
    //   3433: pop
    //   3434: goto -> 24
    //   3437: pop
    //   3438: aconst_null
    //   3439: goto -> 3433
    //   3442: dup
    //   3443: ifnull -> 3433
    //   3446: checkcast java/lang/Throwable
    //   3449: athrow
    //   3450: dup
    //   3451: ifnull -> 3437
    //   3454: checkcast java/lang/Throwable
    //   3457: athrow
    //   3458: aconst_null
    //   3459: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3309	0	this	Lbigname/zprestige/webhack/features/modules/Player/Blink;
    // Exception table:
    //   from	to	target	type
    //   8	20	3442	java/lang/ArithmeticException
    //   88	94	94	finally
    //   88	94	94	java/lang/NegativeArraySizeException
    //   88	94	94	finally
    //   88	94	3	finally
    //   88	94	94	finally
    //   531	538	538	finally
    //   532	538	538	java/lang/RuntimeException
    //   532	538	531	finally
    //   532	538	538	finally
    //   532	538	538	java/util/ConcurrentModificationException
    //   603	610	610	finally
    //   603	610	3	java/lang/NegativeArraySizeException
    //   603	610	3	java/lang/StringIndexOutOfBoundsException
    //   604	610	603	finally
    //   604	610	3	finally
    //   991	998	998	finally
    //   991	998	3	java/lang/IllegalStateException
    //   991	998	998	finally
    //   992	998	991	finally
    //   992	998	3	finally
    //   2203	2210	2210	finally
    //   2203	2210	3	java/lang/IllegalStateException
    //   2203	2210	2203	finally
    //   2203	2210	2210	finally
    //   2204	2210	3	java/util/ConcurrentModificationException
    //   2536	2542	2542	finally
    //   2536	2542	2542	finally
    //   2536	2542	2542	java/lang/RuntimeException
    //   2536	2542	3	java/lang/IllegalStateException
    //   2536	2542	3	finally
    //   2795	2802	2802	finally
    //   2795	2802	2795	finally
    //   2795	2802	2802	finally
    //   2796	2802	2795	finally
    //   2796	2802	3	finally
    //   2995	3002	3002	finally
    //   2995	3002	2995	java/lang/IllegalArgumentException
    //   2995	3002	3002	finally
    //   2996	3002	3002	java/lang/IndexOutOfBoundsException
    //   2996	3002	2995	finally
    //   3323	3330	3330	finally
    //   3323	3330	3330	finally
    //   3324	3330	3330	java/lang/IndexOutOfBoundsException
    //   3324	3330	3323	finally
    //   3324	3330	3330	finally
    //   3442	3450	3442	java/lang/NumberFormatException
    //   3458	3460	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static Blink getInstance() {
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
  
  public boolean lambda$new$2(Integer paramInteger) {
    return Perry1.5d(this, (int)-1120755481L ^ 0xF2291FEE, paramInteger);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.1X(this, (int)-656858682L ^ 0xE52E2132, paramObject);
  }
  
  public void setInstance() {
    Perry1.45(this, (int)1679794835L ^ 0x2ACD84FD);
  }
  
  public void onDisable() {
    Perry1.3f(this, (int)709893154L ^ 0x4B616115);
  }
  
  public boolean lambda$new$0(Boolean paramBoolean) {
    return Perry1.2o(this, (int)-2126912706L ^ 0x865464AF, paramBoolean);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Blink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */