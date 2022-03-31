package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.List;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CrystalAura extends Module {
  public float yaw;
  
  public double renderDamageVal;
  
  public int currentChainCounter;
  
  public Setting<Integer> minHpPlace;
  
  public Setting<Integer> breakRange;
  
  public Setting<Boolean> predictBlock;
  
  public Setting<Integer> cBlue;
  
  public boolean alreadyAttacking;
  
  public Setting<Boolean> Rainbow;
  
  public Setting<Integer> minHpBreak;
  
  public Setting<CrystalAura$AutoSwitch> autoSwitch;
  
  public List<EntityEnderCrystal> attemptedCrystals;
  
  public boolean facePlacing;
  
  public Setting<Boolean> crystalLogic;
  
  public Setting<Boolean> breaK;
  
  public BlockPos staticPos;
  
  public int facePlaceDelayCounter;
  
  public Setting<Boolean> chainMode;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Boolean> render;
  
  public Setting<Integer> breakRangeWall;
  
  public float pitch;
  
  public Setting<Integer> red;
  
  public Setting<Boolean> thirtheen;
  
  public Setting<CrystalAura$Swing> swing;
  
  public Setting<Boolean> entityPredict;
  
  public int breakTimeout;
  
  public boolean hasPacketBroke;
  
  public Setting<Integer> chainCounter;
  
  public EntityEnderCrystal staticEnderCrystal;
  
  public static CrystalAura INSTANCE;
  
  public Setting<Boolean> antiWeakness;
  
  public int breakDelayCounter;
  
  public int obiFeetCounter;
  
  public boolean isRotating;
  
  public Setting<Boolean> ignoreTerrain;
  
  public Setting<Integer> breakDelay;
  
  public Setting<Integer> cAlpha;
  
  public Setting<Integer> placeRangeWall;
  
  public long start;
  
  public EntityPlayer ezTarget;
  
  public Setting<Boolean> faceplace;
  
  public Setting<Integer> predictedTicks;
  
  public Setting<Integer> alpha;
  
  public Setting<Boolean> threaded;
  
  public Setting<Boolean> renderDamage;
  
  public long crystalLatency;
  
  public Setting<Boolean> stopFPWhenSword;
  
  public boolean placeTimeoutFlag;
  
  public BlockPos renderBlock;
  
  public Setting<Boolean> outline;
  
  public Setting<Integer> chainStep;
  
  public Setting<CrystalAura$RotateMode> rotateMode;
  
  public Setting<Boolean> packetSafe;
  
  public Setting<Integer> fuckArmourHP;
  
  public Setting<Integer> blue;
  
  public Setting<Integer> placeDelay;
  
  public Setting<Integer> placeRange;
  
  public Setting<Boolean> attackPacket;
  
  public Setting<Boolean> place;
  
  public Setting<Integer> maxSelfDamage;
  
  public boolean confirmPacketBroke;
  
  public Setting<Boolean> cRainbow;
  
  public Setting<CrystalAura$FastMode> fastMode;
  
  public Setting<Boolean> ignoreSelfDamage;
  
  public int placeDelayCounter;
  
  public Setting<Boolean> box;
  
  public Setting<Integer> cRed;
  
  public int chainCount;
  
  public int placeTimeout;
  
  public Setting<Integer> facePlaceHP;
  
  public boolean didAnything;
  
  public Setting<Boolean> placeSwing;
  
  public Setting<Double> targetRange;
  
  public Setting<Boolean> fuckArmour;
  
  public Setting<Integer> cGreen;
  
  public Setting<Float> lineWidth;
  
  public Setting<Boolean> predictCrystal;
  
  public Setting<Boolean> antiSuicide;
  
  public Setting<Integer> facePlacDelay;
  
  public Setting<Boolean> raytrace;
  
  public Setting<Integer> green;
  
  public void doCrystalAura() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5011
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 5003
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4995
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w -808675205
    //   33: l2i
    //   34: ldc -712884701
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1237742194
    //   43: l2i
    //   44: ldc -425287305
    //   46: ixor
    //   47: ldc2_w -452921716
    //   50: l2i
    //   51: ldc 1997959851
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 4948, -2007489921 -> 40, -1031165730 -> 80
    //   80: goto -> 84
    //   83: athrow
    //   84: invokestatic nullCheck : ()Z
    //   87: goto -> 91
    //   90: athrow
    //   91: ifeq -> 104
    //   94: ldc2_w 1994475713
    //   97: l2i
    //   98: ldc -2024163744
    //   100: ixor
    //   101: goto -> 111
    //   104: ldc2_w -905464550
    //   107: l2i
    //   108: ldc 1002392508
    //   110: ixor
    //   111: ldc2_w -96608368
    //   114: l2i
    //   115: ldc 235056802
    //   117: ixor
    //   118: ixor
    //   119: tableswitch default -> 94, 92770195 -> 140, 92770196 -> 268
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 156
    //   146: ldc2_w 635287421
    //   149: l2i
    //   150: ldc 319541279
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w 599444178
    //   159: l2i
    //   160: ldc -1944460970
    //   162: ixor
    //   163: ldc2_w 443166113
    //   166: l2i
    //   167: ldc -477328936
    //   169: ixor
    //   170: ixor
    //   171: lookupswitch default -> 196, -818887909 -> 4944, 1384569839 -> 156
    //   196: aload_0
    //   197: getstatic Perryc.0 : I
    //   200: ifle -> 213
    //   203: ldc2_w 2084694769
    //   206: l2i
    //   207: ldc 363397189
    //   209: ixor
    //   210: goto -> 220
    //   213: ldc2_w 1143771418
    //   216: l2i
    //   217: ldc 773209835
    //   219: ixor
    //   220: ldc2_w 1505683692
    //   223: l2i
    //   224: ldc 1234355313
    //   226: ixor
    //   227: ixor
    //   228: lookupswitch default -> 256, 1326078458 -> 213, 2042938921 -> 4852
    //   256: goto -> 260
    //   259: athrow
    //   260: invokevirtual disable : ()V
    //   263: goto -> 267
    //   266: athrow
    //   267: return
    //   268: getstatic Perryc.1 : I
    //   271: ifeq -> 284
    //   274: ldc2_w -1367042423
    //   277: l2i
    //   278: ldc -2054772516
    //   280: ixor
    //   281: goto -> 291
    //   284: ldc2_w -792398057
    //   287: l2i
    //   288: ldc 472506926
    //   290: ixor
    //   291: ldc2_w 491411882
    //   294: l2i
    //   295: ldc -293388163
    //   297: ixor
    //   298: ixor
    //   299: lookupswitch default -> 4890, -657774718 -> 284, 1059327214 -> 324
    //   324: aload_0
    //   325: ldc2_w 847382582
    //   328: l2i
    //   329: ldc 847382582
    //   331: ixor
    //   332: getstatic Perryc.c : I
    //   335: iflt -> 348
    //   338: ldc2_w 600969584
    //   341: l2i
    //   342: ldc 1383765160
    //   344: ixor
    //   345: goto -> 355
    //   348: ldc2_w 1835114037
    //   351: l2i
    //   352: ldc 1577827056
    //   354: ixor
    //   355: ldc2_w 1239075928
    //   358: l2i
    //   359: ldc -211100893
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 388, -887582045 -> 4892, 1550564695 -> 348
    //   388: putfield didAnything : Z
    //   391: getstatic Perryc.1 : I
    //   394: ifeq -> 407
    //   397: ldc2_w 1998879230
    //   400: l2i
    //   401: ldc 1842414649
    //   403: ixor
    //   404: goto -> 414
    //   407: ldc2_w -450976724
    //   410: l2i
    //   411: ldc 1593478359
    //   413: ixor
    //   414: ldc2_w 1583807574
    //   417: l2i
    //   418: ldc -1257122085
    //   420: ixor
    //   421: ixor
    //   422: lookupswitch default -> 4872, -243116214 -> 407, 1351811702 -> 448
    //   448: aload_0
    //   449: getstatic Perryc.0 : I
    //   452: ifle -> 465
    //   455: ldc2_w -564471905
    //   458: l2i
    //   459: ldc -117038429
    //   461: ixor
    //   462: goto -> 472
    //   465: ldc2_w 948989840
    //   468: l2i
    //   469: ldc 2080177334
    //   471: ixor
    //   472: ldc2_w -222014293
    //   475: l2i
    //   476: ldc -464160254
    //   478: ixor
    //   479: ixor
    //   480: lookupswitch default -> 508, -1771857395 -> 465, 835574677 -> 4940
    //   508: getfield place : Lbigname/zprestige/webhack/features/setting/Setting;
    //   511: getstatic Perryc.c : I
    //   514: iflt -> 527
    //   517: ldc2_w -378375634
    //   520: l2i
    //   521: ldc 356844888
    //   523: ixor
    //   524: goto -> 534
    //   527: ldc2_w 1839090956
    //   530: l2i
    //   531: ldc -1025535036
    //   533: ixor
    //   534: ldc2_w -150594679
    //   537: l2i
    //   538: ldc 816509027
    //   540: ixor
    //   541: ixor
    //   542: lookupswitch default -> 568, -181136732 -> 527, 1000053916 -> 4908
    //   568: goto -> 572
    //   571: athrow
    //   572: invokevirtual getValue : ()Ljava/lang/Object;
    //   575: goto -> 579
    //   578: athrow
    //   579: checkcast java/lang/Boolean
    //   582: getstatic Perryc.1 : I
    //   585: ifeq -> 598
    //   588: ldc2_w -122451381
    //   591: l2i
    //   592: ldc -711927404
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w 466718691
    //   601: l2i
    //   602: ldc 275466839
    //   604: ixor
    //   605: ldc2_w 1612322671
    //   608: l2i
    //   609: ldc_w -485331198
    //   612: ixor
    //   613: ixor
    //   614: lookupswitch default -> 640, -2056717962 -> 598, -1372902478 -> 4980
    //   640: goto -> 644
    //   643: athrow
    //   644: invokevirtual booleanValue : ()Z
    //   647: goto -> 651
    //   650: athrow
    //   651: ifeq -> 665
    //   654: ldc2_w 1686122613
    //   657: l2i
    //   658: ldc_w 1579095182
    //   661: ixor
    //   662: goto -> 673
    //   665: ldc2_w 1911952230
    //   668: l2i
    //   669: ldc_w 1265186718
    //   672: ixor
    //   673: ldc2_w 1498949355
    //   676: l2i
    //   677: ldc_w 808269573
    //   680: ixor
    //   681: ixor
    //   682: tableswitch default -> 654, 1407857941 -> 704, 1407857942 -> 1955
    //   704: getstatic Perryc.0 : I
    //   707: ifle -> 721
    //   710: ldc2_w -286774317
    //   713: l2i
    //   714: ldc_w 1771992826
    //   717: ixor
    //   718: goto -> 729
    //   721: ldc2_w 1162731178
    //   724: l2i
    //   725: ldc_w -1986279247
    //   728: ixor
    //   729: ldc2_w 1944153935
    //   732: l2i
    //   733: ldc_w 869199482
    //   736: ixor
    //   737: ixor
    //   738: lookupswitch default -> 4870, -1929799890 -> 764, -950412260 -> 721
    //   764: aload_0
    //   765: getstatic Perryc.1 : I
    //   768: ifeq -> 782
    //   771: ldc2_w -1034092506
    //   774: l2i
    //   775: ldc_w -881311404
    //   778: ixor
    //   779: goto -> 790
    //   782: ldc2_w 1539306739
    //   785: l2i
    //   786: ldc_w 1436925132
    //   789: ixor
    //   790: ldc2_w -477835150
    //   793: l2i
    //   794: ldc_w -485549334
    //   797: ixor
    //   798: ixor
    //   799: lookupswitch default -> 4930, 162434026 -> 782, 244417191 -> 824
    //   824: getfield placeDelayCounter : I
    //   827: getstatic Perryc.0 : I
    //   830: ifle -> 844
    //   833: ldc2_w -76368430
    //   836: l2i
    //   837: ldc_w -776913008
    //   840: ixor
    //   841: goto -> 852
    //   844: ldc2_w 1336981947
    //   847: l2i
    //   848: ldc_w -1236707549
    //   851: ixor
    //   852: ldc2_w -1491773188
    //   855: l2i
    //   856: ldc_w 518501085
    //   859: ixor
    //   860: ixor
    //   861: lookupswitch default -> 888, -1825480605 -> 4982, 228508118 -> 844
    //   888: aload_0
    //   889: getstatic Perryc.1 : I
    //   892: ifeq -> 906
    //   895: ldc2_w -1337845562
    //   898: l2i
    //   899: ldc_w 1649968306
    //   902: ixor
    //   903: goto -> 914
    //   906: ldc2_w -1036397413
    //   909: l2i
    //   910: ldc_w 746733673
    //   913: ixor
    //   914: ldc2_w -520613258
    //   917: l2i
    //   918: ldc_w -1161749463
    //   921: ixor
    //   922: ixor
    //   923: lookupswitch default -> 4958, -2010934741 -> 906, -1266509139 -> 948
    //   948: getfield placeTimeout : I
    //   951: if_icmple -> 965
    //   954: ldc2_w 1745364811
    //   957: l2i
    //   958: ldc_w -2040617514
    //   961: ixor
    //   962: goto -> 973
    //   965: ldc2_w 1875895416
    //   968: l2i
    //   969: ldc_w -2120653084
    //   972: ixor
    //   973: ldc2_w 1448073455
    //   976: l2i
    //   977: ldc_w -906583986
    //   980: ixor
    //   981: ixor
    //   982: tableswitch default -> 954, 1911552572 -> 1004, 1911552573 -> 1955
    //   1004: getstatic Perryc.0 : I
    //   1007: ifle -> 1021
    //   1010: ldc2_w 1230650580
    //   1013: l2i
    //   1014: ldc_w -520493020
    //   1017: ixor
    //   1018: goto -> 1029
    //   1021: ldc2_w -1087729447
    //   1024: l2i
    //   1025: ldc_w 1235899319
    //   1028: ixor
    //   1029: ldc2_w -811484175
    //   1032: l2i
    //   1033: ldc_w 897120796
    //   1036: ixor
    //   1037: ixor
    //   1038: lookupswitch default -> 4970, 207192707 -> 1064, 1400542493 -> 1021
    //   1064: aload_0
    //   1065: getstatic Perryc.1 : I
    //   1068: ifeq -> 1082
    //   1071: ldc2_w -1554519452
    //   1074: l2i
    //   1075: ldc_w -1179385433
    //   1078: ixor
    //   1079: goto -> 1090
    //   1082: ldc2_w -2063424948
    //   1085: l2i
    //   1086: ldc_w -1046643135
    //   1089: ixor
    //   1090: ldc2_w 1742558905
    //   1093: l2i
    //   1094: ldc_w -1270065121
    //   1097: ixor
    //   1098: ixor
    //   1099: lookupswitch default -> 1124, -915217051 -> 4926, 1100296354 -> 1082
    //   1124: getfield facePlaceDelayCounter : I
    //   1127: getstatic Perryc.0 : I
    //   1130: ifle -> 1144
    //   1133: ldc2_w 1355240292
    //   1136: l2i
    //   1137: ldc_w 834269519
    //   1140: ixor
    //   1141: goto -> 1152
    //   1144: ldc2_w -2114868901
    //   1147: l2i
    //   1148: ldc_w -826051832
    //   1151: ixor
    //   1152: ldc2_w -1321378511
    //   1155: l2i
    //   1156: ldc_w -1516829063
    //   1159: ixor
    //   1160: ixor
    //   1161: lookupswitch default -> 4954, 1536721179 -> 1188, 1976891747 -> 1144
    //   1188: aload_0
    //   1189: getstatic Perryc.c : I
    //   1192: iflt -> 1206
    //   1195: ldc2_w -1251060003
    //   1198: l2i
    //   1199: ldc_w 845302204
    //   1202: ixor
    //   1203: goto -> 1214
    //   1206: ldc2_w 1107919958
    //   1209: l2i
    //   1210: ldc_w 645187080
    //   1213: ixor
    //   1214: ldc2_w -1575480673
    //   1217: l2i
    //   1218: ldc_w -1172011109
    //   1221: ixor
    //   1222: ixor
    //   1223: lookupswitch default -> 4910, -1624208795 -> 1206, 2084689754 -> 1248
    //   1248: getfield facePlacDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w 101991327
    //   1260: l2i
    //   1261: ldc_w -1017309404
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 1266145591
    //   1271: l2i
    //   1272: ldc_w -577343672
    //   1275: ixor
    //   1276: ldc2_w 1773294882
    //   1279: l2i
    //   1280: ldc_w -150824796
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 4946, 139557881 -> 1312, 1543084349 -> 1268
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokevirtual getValue : ()Ljava/lang/Object;
    //   1319: goto -> 1323
    //   1322: athrow
    //   1323: checkcast java/lang/Integer
    //   1326: getstatic Perryc.1 : I
    //   1329: ifeq -> 1343
    //   1332: ldc2_w -480739079
    //   1335: l2i
    //   1336: ldc_w -1323192058
    //   1339: ixor
    //   1340: goto -> 1351
    //   1343: ldc2_w 1215141089
    //   1346: l2i
    //   1347: ldc_w -590754165
    //   1350: ixor
    //   1351: ldc2_w 2089853606
    //   1354: l2i
    //   1355: ldc_w 1215220166
    //   1358: ixor
    //   1359: ixor
    //   1360: lookupswitch default -> 4964, -1604701942 -> 1388, 1720146591 -> 1343
    //   1388: goto -> 1392
    //   1391: athrow
    //   1392: invokevirtual intValue : ()I
    //   1395: goto -> 1399
    //   1398: athrow
    //   1399: if_icmpge -> 1413
    //   1402: ldc2_w 1126563254
    //   1405: l2i
    //   1406: ldc_w -1976300477
    //   1409: ixor
    //   1410: goto -> 1421
    //   1413: ldc2_w 1625042593
    //   1416: l2i
    //   1417: ldc_w -1446125741
    //   1420: ixor
    //   1421: ldc2_w 777322429
    //   1424: l2i
    //   1425: ldc_w -97710789
    //   1428: ixor
    //   1429: ixor
    //   1430: tableswitch default -> 1402, 493355891 -> 1452, 493355892 -> 1628
    //   1452: getstatic Perryc.0 : I
    //   1455: ifle -> 1469
    //   1458: ldc2_w -459020675
    //   1461: l2i
    //   1462: ldc_w 537968852
    //   1465: ixor
    //   1466: goto -> 1477
    //   1469: ldc2_w -1103266789
    //   1472: l2i
    //   1473: ldc_w 1211921321
    //   1476: ixor
    //   1477: ldc2_w -1332514277
    //   1480: l2i
    //   1481: ldc_w -1249221818
    //   1484: ixor
    //   1485: ixor
    //   1486: lookupswitch default -> 4950, -1045809164 -> 1469, -216523025 -> 1512
    //   1512: aload_0
    //   1513: getstatic Perryc.c : I
    //   1516: iflt -> 1530
    //   1519: ldc2_w 729767200
    //   1522: l2i
    //   1523: ldc_w -555589431
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w -1032119306
    //   1533: l2i
    //   1534: ldc_w -1153883958
    //   1537: ixor
    //   1538: ldc2_w 276511972
    //   1541: l2i
    //   1542: ldc_w -1547049922
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 4960, -890182682 -> 1572, 1177543987 -> 1530
    //   1572: getfield facePlacing : Z
    //   1575: ifne -> 1589
    //   1578: ldc2_w -1512175657
    //   1581: l2i
    //   1582: ldc_w -1853349484
    //   1585: ixor
    //   1586: goto -> 1597
    //   1589: ldc2_w 1904110078
    //   1592: l2i
    //   1593: ldc_w 1160269756
    //   1596: ixor
    //   1597: ldc2_w 500702967
    //   1600: l2i
    //   1601: ldc_w 834736390
    //   1604: ixor
    //   1605: ixor
    //   1606: tableswitch default -> 1578, 407841202 -> 1628, 407841203 -> 1955
    //   1628: getstatic Perryc.0 : I
    //   1631: ifle -> 1645
    //   1634: ldc2_w -914467657
    //   1637: l2i
    //   1638: ldc_w -316888176
    //   1641: ixor
    //   1642: goto -> 1653
    //   1645: ldc2_w -1881379433
    //   1648: l2i
    //   1649: ldc_w 1833384630
    //   1652: ixor
    //   1653: ldc2_w -621551741
    //   1656: l2i
    //   1657: ldc_w 1451714034
    //   1660: ixor
    //   1661: ixor
    //   1662: lookupswitch default -> 4898, -1474935466 -> 1645, 1861217616 -> 1688
    //   1688: aload_0
    //   1689: getstatic Perryc.1 : I
    //   1692: ifeq -> 1706
    //   1695: ldc2_w 1776147815
    //   1698: l2i
    //   1699: ldc_w -1428367874
    //   1702: ixor
    //   1703: goto -> 1714
    //   1706: ldc2_w 1591956586
    //   1709: l2i
    //   1710: ldc_w -909073914
    //   1713: ixor
    //   1714: ldc2_w 717140908
    //   1717: l2i
    //   1718: ldc_w -577217806
    //   1721: ixor
    //   1722: ixor
    //   1723: lookupswitch default -> 4928, 875028935 -> 1706, 1611996978 -> 1748
    //   1748: goto -> 1752
    //   1751: athrow
    //   1752: invokestatic currentTimeMillis : ()J
    //   1755: goto -> 1759
    //   1758: athrow
    //   1759: getstatic Perryc.c : I
    //   1762: iflt -> 1776
    //   1765: ldc2_w -56444013
    //   1768: l2i
    //   1769: ldc_w -546699823
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w -368666587
    //   1779: l2i
    //   1780: ldc_w -385468291
    //   1783: ixor
    //   1784: ldc2_w -810579423
    //   1787: l2i
    //   1788: ldc_w -1249128293
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 1820, -644247281 -> 1776, 1508697336 -> 4922
    //   1820: putfield start : J
    //   1823: getstatic Perryc.c : I
    //   1826: iflt -> 1840
    //   1829: ldc2_w -1081400766
    //   1832: l2i
    //   1833: ldc_w -1265759937
    //   1836: ixor
    //   1837: goto -> 1848
    //   1840: ldc2_w -1565309945
    //   1843: l2i
    //   1844: ldc_w 383977861
    //   1847: ixor
    //   1848: ldc2_w -1740707042
    //   1851: l2i
    //   1852: ldc_w -932813406
    //   1855: ixor
    //   1856: ixor
    //   1857: lookupswitch default -> 4866, -469187778 -> 1884, 1532863937 -> 1840
    //   1884: aload_0
    //   1885: getstatic Perryc.0 : I
    //   1888: ifle -> 1902
    //   1891: ldc2_w 1201463182
    //   1894: l2i
    //   1895: ldc_w -2056146532
    //   1898: ixor
    //   1899: goto -> 1910
    //   1902: ldc2_w 1683190916
    //   1905: l2i
    //   1906: ldc_w 480042161
    //   1909: ixor
    //   1910: ldc2_w -259482077
    //   1913: l2i
    //   1914: ldc_w 1863947318
    //   1917: ixor
    //   1918: ixor
    //   1919: lookupswitch default -> 1944, -1727245799 -> 1902, 1568433159 -> 4902
    //   1944: goto -> 1948
    //   1947: athrow
    //   1948: invokespecial placeCrystal : ()V
    //   1951: goto -> 1955
    //   1954: athrow
    //   1955: getstatic Perryc.0 : I
    //   1958: ifle -> 1972
    //   1961: ldc2_w -2081414363
    //   1964: l2i
    //   1965: ldc_w -685645809
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 325401879
    //   1975: l2i
    //   1976: ldc_w 1808994511
    //   1979: ixor
    //   1980: ldc2_w -63760147
    //   1983: l2i
    //   1984: ldc_w -1172991797
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 4874, 318196492 -> 1972, 1049667070 -> 2016
    //   2016: aload_0
    //   2017: getstatic Perryc.c : I
    //   2020: iflt -> 2034
    //   2023: ldc2_w 1885958592
    //   2026: l2i
    //   2027: ldc_w -479550792
    //   2030: ixor
    //   2031: goto -> 2042
    //   2034: ldc2_w -1937781377
    //   2037: l2i
    //   2038: ldc_w 1239157019
    //   2041: ixor
    //   2042: ldc2_w 974462009
    //   2045: l2i
    //   2046: ldc_w 1367620267
    //   2049: ixor
    //   2050: ixor
    //   2051: lookupswitch default -> 4912, -1372396810 -> 2076, -124586518 -> 2034
    //   2076: getfield breaK : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2079: getstatic Perryc.c : I
    //   2082: iflt -> 2096
    //   2085: ldc2_w -1522117609
    //   2088: l2i
    //   2089: ldc_w 243863954
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w 395320309
    //   2099: l2i
    //   2100: ldc_w 1802819616
    //   2103: ixor
    //   2104: ldc2_w -1895195672
    //   2107: l2i
    //   2108: ldc_w -215259304
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 4878, -672286411 -> 2096, 12992357 -> 2140
    //   2140: goto -> 2144
    //   2143: athrow
    //   2144: invokevirtual getValue : ()Ljava/lang/Object;
    //   2147: goto -> 2151
    //   2150: athrow
    //   2151: checkcast java/lang/Boolean
    //   2154: getstatic Perryc.c : I
    //   2157: iflt -> 2171
    //   2160: ldc2_w 1632497548
    //   2163: l2i
    //   2164: ldc_w -1954802812
    //   2167: ixor
    //   2168: goto -> 2179
    //   2171: ldc2_w -6482603
    //   2174: l2i
    //   2175: ldc_w -600882932
    //   2178: ixor
    //   2179: ldc2_w 1417064202
    //   2182: l2i
    //   2183: ldc_w -1002453861
    //   2186: ixor
    //   2187: ixor
    //   2188: lookupswitch default -> 4858, -1275379768 -> 2216, 2054723481 -> 2171
    //   2216: goto -> 2220
    //   2219: athrow
    //   2220: invokevirtual booleanValue : ()Z
    //   2223: goto -> 2227
    //   2226: athrow
    //   2227: ifeq -> 2241
    //   2230: ldc2_w -1838216461
    //   2233: l2i
    //   2234: ldc_w -1754549115
    //   2237: ixor
    //   2238: goto -> 2249
    //   2241: ldc2_w 1349518886
    //   2244: l2i
    //   2245: ldc_w 1433712735
    //   2248: ixor
    //   2249: ldc2_w -127530054
    //   2252: l2i
    //   2253: ldc_w -1424292517
    //   2256: ixor
    //   2257: ixor
    //   2258: tableswitch default -> 2230, 1450815639 -> 2280, 1450815640 -> 2887
    //   2280: getstatic Perryc.1 : I
    //   2283: ifeq -> 2297
    //   2286: ldc2_w 1429851416
    //   2289: l2i
    //   2290: ldc_w -951412657
    //   2293: ixor
    //   2294: goto -> 2305
    //   2297: ldc2_w -749313185
    //   2300: l2i
    //   2301: ldc_w -1672274550
    //   2304: ixor
    //   2305: ldc2_w -538759635
    //   2308: l2i
    //   2309: ldc_w -1144298234
    //   2312: ixor
    //   2313: ixor
    //   2314: lookupswitch default -> 2340, -161800580 -> 4938, 570084052 -> 2297
    //   2340: aload_0
    //   2341: getstatic Perryc.1 : I
    //   2344: ifeq -> 2358
    //   2347: ldc2_w 1080935537
    //   2350: l2i
    //   2351: ldc_w 209908502
    //   2354: ixor
    //   2355: goto -> 2366
    //   2358: ldc2_w 472424414
    //   2361: l2i
    //   2362: ldc_w 872938466
    //   2365: ixor
    //   2366: ldc2_w -620375419
    //   2369: l2i
    //   2370: ldc_w -1350807014
    //   2373: ixor
    //   2374: ixor
    //   2375: lookupswitch default -> 2400, 949401592 -> 4942, 1347205965 -> 2358
    //   2400: getfield breakDelayCounter : I
    //   2403: getstatic Perryc.c : I
    //   2406: iflt -> 2420
    //   2409: ldc2_w -1531523909
    //   2412: l2i
    //   2413: ldc_w -1094535580
    //   2416: ixor
    //   2417: goto -> 2428
    //   2420: ldc2_w -1985123542
    //   2423: l2i
    //   2424: ldc_w -2041244766
    //   2427: ixor
    //   2428: ldc2_w -2131457622
    //   2431: l2i
    //   2432: ldc_w 1257751546
    //   2435: ixor
    //   2436: ixor
    //   2437: lookupswitch default -> 4876, -973393192 -> 2464, -797495153 -> 2420
    //   2464: aload_0
    //   2465: getstatic Perryc.1 : I
    //   2468: ifeq -> 2482
    //   2471: ldc2_w -1426861031
    //   2474: l2i
    //   2475: ldc_w 1093238402
    //   2478: ixor
    //   2479: goto -> 2490
    //   2482: ldc2_w -44893613
    //   2485: l2i
    //   2486: ldc_w 451619067
    //   2489: ixor
    //   2490: ldc2_w 981190813
    //   2493: l2i
    //   2494: ldc_w 103568120
    //   2497: ixor
    //   2498: ixor
    //   2499: lookupswitch default -> 4894, -678612738 -> 2482, -605140787 -> 2524
    //   2524: getfield breakTimeout : I
    //   2527: if_icmple -> 2541
    //   2530: ldc2_w -237024785
    //   2533: l2i
    //   2534: ldc_w -1176921037
    //   2537: ixor
    //   2538: goto -> 2549
    //   2541: ldc2_w 1502148788
    //   2544: l2i
    //   2545: ldc_w 294530411
    //   2548: ixor
    //   2549: ldc2_w -1650050411
    //   2552: l2i
    //   2553: ldc_w -1239777020
    //   2556: ixor
    //   2557: ixor
    //   2558: tableswitch default -> 2530, 1673162317 -> 2580, 1673162318 -> 2887
    //   2580: getstatic Perryc.1 : I
    //   2583: ifeq -> 2597
    //   2586: ldc2_w -292901305
    //   2589: l2i
    //   2590: ldc_w -714319956
    //   2593: ixor
    //   2594: goto -> 2605
    //   2597: ldc2_w -716591031
    //   2600: l2i
    //   2601: ldc_w -2140311392
    //   2604: ixor
    //   2605: ldc2_w -1737136820
    //   2608: l2i
    //   2609: ldc_w 1128333958
    //   2612: ixor
    //   2613: ixor
    //   2614: lookupswitch default -> 2640, -523067871 -> 4974, -478744190 -> 2597
    //   2640: aload_0
    //   2641: getstatic Perryc.0 : I
    //   2644: ifle -> 2658
    //   2647: ldc2_w 820980822
    //   2650: l2i
    //   2651: ldc_w 905832294
    //   2654: ixor
    //   2655: goto -> 2666
    //   2658: ldc2_w -1112876493
    //   2661: l2i
    //   2662: ldc_w 2071295641
    //   2665: ixor
    //   2666: ldc2_w 1921979962
    //   2669: l2i
    //   2670: ldc_w -419437821
    //   2673: ixor
    //   2674: ixor
    //   2675: lookupswitch default -> 4978, -1855832567 -> 2658, 1387223443 -> 2700
    //   2700: getfield confirmPacketBroke : Z
    //   2703: ifne -> 2717
    //   2706: ldc2_w -991477663
    //   2709: l2i
    //   2710: ldc_w -527454874
    //   2713: ixor
    //   2714: goto -> 2725
    //   2717: ldc2_w -1234966616
    //   2720: l2i
    //   2721: ldc_w -1844770096
    //   2724: ixor
    //   2725: ldc2_w 348618949
    //   2728: l2i
    //   2729: ldc_w 813288701
    //   2732: ixor
    //   2733: ixor
    //   2734: tableswitch default -> 2706, 14065983 -> 2756, 14065984 -> 2887
    //   2756: getstatic Perryc.c : I
    //   2759: iflt -> 2773
    //   2762: ldc2_w 2002121437
    //   2765: l2i
    //   2766: ldc_w 1076709887
    //   2769: ixor
    //   2770: goto -> 2781
    //   2773: ldc2_w 1448637585
    //   2776: l2i
    //   2777: ldc_w -1610211252
    //   2780: ixor
    //   2781: ldc2_w -329071580
    //   2784: l2i
    //   2785: ldc_w 1811280988
    //   2788: ixor
    //   2789: ixor
    //   2790: lookupswitch default -> 2816, -1326478502 -> 4924, -1192072544 -> 2773
    //   2816: aload_0
    //   2817: getstatic Perryc.c : I
    //   2820: iflt -> 2834
    //   2823: ldc2_w -26929836
    //   2826: l2i
    //   2827: ldc_w -1657748085
    //   2830: ixor
    //   2831: goto -> 2842
    //   2834: ldc2_w 64431044
    //   2837: l2i
    //   2838: ldc_w -730556064
    //   2841: ixor
    //   2842: ldc2_w -1216236481
    //   2845: l2i
    //   2846: ldc_w 199447087
    //   2849: ixor
    //   2850: ixor
    //   2851: lookupswitch default -> 2876, -550029617 -> 4934, 317597960 -> 2834
    //   2876: goto -> 2880
    //   2879: athrow
    //   2880: invokespecial breakCrystal : ()V
    //   2883: goto -> 2887
    //   2886: athrow
    //   2887: getstatic Perryc.0 : I
    //   2890: ifle -> 2904
    //   2893: ldc2_w 1839418341
    //   2896: l2i
    //   2897: ldc_w -1713162884
    //   2900: ixor
    //   2901: goto -> 2912
    //   2904: ldc2_w -1132361252
    //   2907: l2i
    //   2908: ldc_w -1945047839
    //   2911: ixor
    //   2912: ldc2_w 285273601
    //   2915: l2i
    //   2916: ldc_w 5766498
    //   2919: ixor
    //   2920: ixor
    //   2921: lookupswitch default -> 2948, -451449350 -> 4886, 2060814252 -> 2904
    //   2948: aload_0
    //   2949: getstatic Perryc.0 : I
    //   2952: ifle -> 2966
    //   2955: ldc2_w 1628790894
    //   2958: l2i
    //   2959: ldc_w 597928397
    //   2962: ixor
    //   2963: goto -> 2974
    //   2966: ldc2_w -634840060
    //   2969: l2i
    //   2970: ldc_w 251535413
    //   2973: ixor
    //   2974: ldc2_w -332859585
    //   2977: l2i
    //   2978: ldc_w 899557664
    //   2981: ixor
    //   2982: ixor
    //   2983: lookupswitch default -> 3008, -1694492740 -> 4904, 1915216178 -> 2966
    //   3008: getfield didAnything : Z
    //   3011: ifne -> 3025
    //   3014: ldc2_w -117652894
    //   3017: l2i
    //   3018: ldc_w -1100045033
    //   3021: ixor
    //   3022: goto -> 3033
    //   3025: ldc2_w -371290800
    //   3028: l2i
    //   3029: ldc_w -1353913820
    //   3032: ixor
    //   3033: ldc2_w -1931672674
    //   3036: l2i
    //   3037: ldc_w 689718049
    //   3040: ixor
    //   3041: ixor
    //   3042: tableswitch default -> 3014, -481089590 -> 3064, -481089589 -> 3851
    //   3064: getstatic Perryc.0 : I
    //   3067: ifle -> 3081
    //   3070: ldc2_w -1051472166
    //   3073: l2i
    //   3074: ldc_w -508132010
    //   3077: ixor
    //   3078: goto -> 3089
    //   3081: ldc2_w 2002487025
    //   3084: l2i
    //   3085: ldc_w 1249548488
    //   3088: ixor
    //   3089: ldc2_w -69070629
    //   3092: l2i
    //   3093: ldc_w 1525395688
    //   3096: ixor
    //   3097: ixor
    //   3098: lookupswitch default -> 4956, -2115179585 -> 3081, -1675051510 -> 3124
    //   3124: aload_0
    //   3125: aconst_null
    //   3126: getstatic Perryc.c : I
    //   3129: iflt -> 3143
    //   3132: ldc2_w 991470950
    //   3135: l2i
    //   3136: ldc_w 1769519839
    //   3139: ixor
    //   3140: goto -> 3151
    //   3143: ldc2_w 2097026633
    //   3146: l2i
    //   3147: ldc_w 1164440689
    //   3150: ixor
    //   3151: ldc2_w -1109356277
    //   3154: l2i
    //   3155: ldc_w 879959161
    //   3158: ixor
    //   3159: ixor
    //   3160: lookupswitch default -> 3188, -604794165 -> 4868, 1413746212 -> 3143
    //   3188: putfield ezTarget : Lnet/minecraft/entity/player/EntityPlayer;
    //   3191: getstatic Perryc.0 : I
    //   3194: ifle -> 3208
    //   3197: ldc2_w -844262554
    //   3200: l2i
    //   3201: ldc_w -1836588903
    //   3204: ixor
    //   3205: goto -> 3216
    //   3208: ldc2_w -1812200467
    //   3211: l2i
    //   3212: ldc_w -236745894
    //   3215: ixor
    //   3216: ldc2_w -455997131
    //   3219: l2i
    //   3220: ldc_w 837977994
    //   3223: ixor
    //   3224: ixor
    //   3225: lookupswitch default -> 3252, -1978991296 -> 4896, -582805266 -> 3208
    //   3252: aload_0
    //   3253: ldc2_w -1354689108
    //   3256: l2i
    //   3257: ldc_w -1354689108
    //   3260: ixor
    //   3261: getstatic Perryc.0 : I
    //   3264: ifle -> 3278
    //   3267: ldc2_w 1298828839
    //   3270: l2i
    //   3271: ldc_w -475029057
    //   3274: ixor
    //   3275: goto -> 3286
    //   3278: ldc2_w 748706501
    //   3281: l2i
    //   3282: ldc_w -375009690
    //   3285: ixor
    //   3286: ldc2_w 1530520881
    //   3289: l2i
    //   3290: ldc_w -27929443
    //   3293: ixor
    //   3294: ixor
    //   3295: lookupswitch default -> 3320, 195632692 -> 4936, 695101283 -> 3278
    //   3320: putfield isRotating : Z
    //   3323: getstatic Perryc.0 : I
    //   3326: ifle -> 3340
    //   3329: ldc2_w 447233240
    //   3332: l2i
    //   3333: ldc_w 1224607031
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w 840479323
    //   3343: l2i
    //   3344: ldc_w 1939026479
    //   3347: ixor
    //   3348: ldc2_w 1151158114
    //   3351: l2i
    //   3352: ldc_w -1721457830
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 4864, -1884299817 -> 3340, -1670224820 -> 3384
    //   3384: aload_0
    //   3385: getstatic Perryc.0 : I
    //   3388: ifle -> 3402
    //   3391: ldc2_w 1564913409
    //   3394: l2i
    //   3395: ldc_w -1735897298
    //   3398: ixor
    //   3399: goto -> 3410
    //   3402: ldc2_w -6790443
    //   3405: l2i
    //   3406: ldc_w -1247836533
    //   3409: ixor
    //   3410: ldc2_w -1540687509
    //   3413: l2i
    //   3414: ldc_w 1509049141
    //   3417: ixor
    //   3418: ixor
    //   3419: lookupswitch default -> 4932, -1210098176 -> 3444, 940989041 -> 3402
    //   3444: aload_0
    //   3445: getstatic Perryc.0 : I
    //   3448: ifle -> 3462
    //   3451: ldc2_w -491863983
    //   3454: l2i
    //   3455: ldc_w 496602631
    //   3458: ixor
    //   3459: goto -> 3470
    //   3462: ldc2_w -726237530
    //   3465: l2i
    //   3466: ldc_w 1991131679
    //   3469: ixor
    //   3470: ldc2_w 1329954816
    //   3473: l2i
    //   3474: ldc_w -670366117
    //   3477: ixor
    //   3478: ixor
    //   3479: lookupswitch default -> 4952, 894876386 -> 3504, 1752811533 -> 3462
    //   3504: getfield chainStep : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3507: getstatic Perryc.c : I
    //   3510: iflt -> 3524
    //   3513: ldc2_w -261040492
    //   3516: l2i
    //   3517: ldc_w -548013537
    //   3520: ixor
    //   3521: goto -> 3532
    //   3524: ldc2_w -1813341678
    //   3527: l2i
    //   3528: ldc_w -1901351935
    //   3531: ixor
    //   3532: ldc2_w -1750536269
    //   3535: l2i
    //   3536: ldc_w 1477897300
    //   3539: ixor
    //   3540: ixor
    //   3541: lookupswitch default -> 3568, -526700692 -> 4882, -301714893 -> 3524
    //   3568: goto -> 3572
    //   3571: athrow
    //   3572: invokevirtual getValue : ()Ljava/lang/Object;
    //   3575: goto -> 3579
    //   3578: athrow
    //   3579: checkcast java/lang/Integer
    //   3582: getstatic Perryc.0 : I
    //   3585: ifle -> 3599
    //   3588: ldc2_w 749211916
    //   3591: l2i
    //   3592: ldc_w -519561664
    //   3595: ixor
    //   3596: goto -> 3607
    //   3599: ldc2_w -448704865
    //   3602: l2i
    //   3603: ldc_w 909444549
    //   3606: ixor
    //   3607: ldc2_w 1858905147
    //   3610: l2i
    //   3611: ldc_w 982835043
    //   3614: ixor
    //   3615: ixor
    //   3616: lookupswitch default -> 4984, -2027147262 -> 3644, -1711770604 -> 3599
    //   3644: goto -> 3648
    //   3647: athrow
    //   3648: invokevirtual intValue : ()I
    //   3651: goto -> 3655
    //   3654: athrow
    //   3655: getstatic Perryc.0 : I
    //   3658: ifle -> 3672
    //   3661: ldc2_w 367144045
    //   3664: l2i
    //   3665: ldc_w 438226258
    //   3668: ixor
    //   3669: goto -> 3680
    //   3672: ldc2_w -1380858874
    //   3675: l2i
    //   3676: ldc_w -625772545
    //   3679: ixor
    //   3680: ldc2_w 1012808721
    //   3683: l2i
    //   3684: ldc_w -84496840
    //   3687: ixor
    //   3688: ixor
    //   3689: lookupswitch default -> 3716, -917212394 -> 4860, 1485566597 -> 3672
    //   3716: putfield chainCount : I
    //   3719: getstatic Perryc.c : I
    //   3722: iflt -> 3736
    //   3725: ldc2_w -651299368
    //   3728: l2i
    //   3729: ldc_w 20920801
    //   3732: ixor
    //   3733: goto -> 3744
    //   3736: ldc2_w 1321739940
    //   3739: l2i
    //   3740: ldc_w -1373052473
    //   3743: ixor
    //   3744: ldc2_w 1240500420
    //   3747: l2i
    //   3748: ldc_w -965433753
    //   3751: ixor
    //   3752: ixor
    //   3753: lookupswitch default -> 3780, 1469506202 -> 4972, 1916586055 -> 3736
    //   3780: aload_0
    //   3781: ldc2_w 1835573804
    //   3784: l2i
    //   3785: ldc_w 1835573804
    //   3788: ixor
    //   3789: getstatic Perryc.1 : I
    //   3792: ifeq -> 3806
    //   3795: ldc2_w -901571978
    //   3798: l2i
    //   3799: ldc_w 650698066
    //   3802: ixor
    //   3803: goto -> 3814
    //   3806: ldc2_w 672850137
    //   3809: l2i
    //   3810: ldc_w -1875787296
    //   3813: ixor
    //   3814: ldc2_w -463945364
    //   3817: l2i
    //   3818: ldc_w 165121265
    //   3821: ixor
    //   3822: ixor
    //   3823: lookupswitch default -> 4900, 17074873 -> 3806, 1436839076 -> 3848
    //   3848: putfield currentChainCounter : I
    //   3851: getstatic Perryc.1 : I
    //   3854: ifeq -> 3868
    //   3857: ldc2_w -484636088
    //   3860: l2i
    //   3861: ldc_w 636585086
    //   3864: ixor
    //   3865: goto -> 3876
    //   3868: ldc2_w -1063966413
    //   3871: l2i
    //   3872: ldc_w 794466324
    //   3875: ixor
    //   3876: ldc2_w 1448389116
    //   3879: l2i
    //   3880: ldc_w -1119538986
    //   3883: ixor
    //   3884: ixor
    //   3885: lookupswitch default -> 3912, -1077352396 -> 3868, 771561244 -> 4914
    //   3912: aload_0
    //   3913: dup
    //   3914: getstatic Perryc.1 : I
    //   3917: ifeq -> 3931
    //   3920: ldc2_w 124504916
    //   3923: l2i
    //   3924: ldc_w 1985781898
    //   3927: ixor
    //   3928: goto -> 3939
    //   3931: ldc2_w -1176688187
    //   3934: l2i
    //   3935: ldc_w -1829783539
    //   3938: ixor
    //   3939: ldc2_w 1994445808
    //   3942: l2i
    //   3943: ldc_w 1216620590
    //   3946: ixor
    //   3947: ixor
    //   3948: lookupswitch default -> 4906, 357984790 -> 3976, 1330876416 -> 3931
    //   3976: getfield currentChainCounter : I
    //   3979: ldc2_w -915036965
    //   3982: l2i
    //   3983: ldc_w -915036966
    //   3986: ixor
    //   3987: iadd
    //   3988: getstatic Perryc.1 : I
    //   3991: ifeq -> 4005
    //   3994: ldc2_w -36574907
    //   3997: l2i
    //   3998: ldc_w -2055368791
    //   4001: ixor
    //   4002: goto -> 4013
    //   4005: ldc2_w -1063083211
    //   4008: l2i
    //   4009: ldc_w 1167351415
    //   4012: ixor
    //   4013: ldc2_w 1719646833
    //   4016: l2i
    //   4017: ldc_w 726606194
    //   4020: ixor
    //   4021: ixor
    //   4022: lookupswitch default -> 4856, -939104703 -> 4048, 899481071 -> 4005
    //   4048: putfield currentChainCounter : I
    //   4051: getstatic Perryc.c : I
    //   4054: iflt -> 4068
    //   4057: ldc2_w -21208104
    //   4060: l2i
    //   4061: ldc_w 522521459
    //   4064: ixor
    //   4065: goto -> 4076
    //   4068: ldc2_w 145804223
    //   4071: l2i
    //   4072: ldc_w -1469031198
    //   4075: ixor
    //   4076: ldc2_w 1031514984
    //   4079: l2i
    //   4080: ldc_w 353927789
    //   4083: ixor
    //   4084: ixor
    //   4085: lookupswitch default -> 4112, -906346066 -> 4916, 781866606 -> 4068
    //   4112: aload_0
    //   4113: dup
    //   4114: getstatic Perryc.0 : I
    //   4117: ifle -> 4131
    //   4120: ldc2_w 2147291717
    //   4123: l2i
    //   4124: ldc_w -130036822
    //   4127: ixor
    //   4128: goto -> 4139
    //   4131: ldc2_w -1419166939
    //   4134: l2i
    //   4135: ldc_w -744581849
    //   4138: ixor
    //   4139: ldc2_w 641271872
    //   4142: l2i
    //   4143: ldc_w -378049717
    //   4146: ixor
    //   4147: ixor
    //   4148: lookupswitch default -> 4176, -1124874610 -> 4131, 1217182436 -> 4888
    //   4176: getfield breakDelayCounter : I
    //   4179: ldc2_w 1987112538
    //   4182: l2i
    //   4183: ldc_w 1987112539
    //   4186: ixor
    //   4187: iadd
    //   4188: getstatic Perryc.0 : I
    //   4191: ifle -> 4205
    //   4194: ldc2_w 1437730450
    //   4197: l2i
    //   4198: ldc_w 444156397
    //   4201: ixor
    //   4202: goto -> 4213
    //   4205: ldc2_w 40893051
    //   4208: l2i
    //   4209: ldc_w -1683204605
    //   4212: ixor
    //   4213: ldc2_w -1095500881
    //   4216: l2i
    //   4217: ldc_w 2098491891
    //   4220: ixor
    //   4221: ixor
    //   4222: lookupswitch default -> 4248, -1939028701 -> 4966, 73032910 -> 4205
    //   4248: putfield breakDelayCounter : I
    //   4251: getstatic Perryc.c : I
    //   4254: iflt -> 4268
    //   4257: ldc2_w -416620298
    //   4260: l2i
    //   4261: ldc_w 1476573106
    //   4264: ixor
    //   4265: goto -> 4276
    //   4268: ldc2_w -171876668
    //   4271: l2i
    //   4272: ldc_w 2092942993
    //   4275: ixor
    //   4276: ldc2_w 1820840681
    //   4279: l2i
    //   4280: ldc_w -1245505275
    //   4283: ixor
    //   4284: ixor
    //   4285: lookupswitch default -> 4312, -1812875299 -> 4268, 1718394024 -> 4880
    //   4312: aload_0
    //   4313: dup
    //   4314: getstatic Perryc.c : I
    //   4317: iflt -> 4331
    //   4320: ldc2_w 1816963872
    //   4323: l2i
    //   4324: ldc_w -1617761017
    //   4327: ixor
    //   4328: goto -> 4339
    //   4331: ldc2_w -1609661291
    //   4334: l2i
    //   4335: ldc_w -954710175
    //   4338: ixor
    //   4339: ldc2_w 17673941
    //   4342: l2i
    //   4343: ldc_w -61431380
    //   4346: ixor
    //   4347: ixor
    //   4348: lookupswitch default -> 4862, -1706177395 -> 4376, 243616094 -> 4331
    //   4376: getfield placeDelayCounter : I
    //   4379: ldc2_w -1952398063
    //   4382: l2i
    //   4383: ldc_w -1952398064
    //   4386: ixor
    //   4387: iadd
    //   4388: getstatic Perryc.0 : I
    //   4391: ifle -> 4405
    //   4394: ldc2_w -1681980710
    //   4397: l2i
    //   4398: ldc_w -612612373
    //   4401: ixor
    //   4402: goto -> 4413
    //   4405: ldc2_w 857752877
    //   4408: l2i
    //   4409: ldc_w -368510452
    //   4412: ixor
    //   4413: ldc2_w 2045928580
    //   4416: l2i
    //   4417: ldc_w 990070680
    //   4420: ixor
    //   4421: ixor
    //   4422: lookupswitch default -> 4448, -1258566874 -> 4405, 36857645 -> 4920
    //   4448: putfield placeDelayCounter : I
    //   4451: getstatic Perryc.0 : I
    //   4454: ifle -> 4468
    //   4457: ldc2_w 1059594779
    //   4460: l2i
    //   4461: ldc_w 1407028934
    //   4464: ixor
    //   4465: goto -> 4476
    //   4468: ldc2_w 498969124
    //   4471: l2i
    //   4472: ldc_w 677877123
    //   4475: ixor
    //   4476: ldc2_w 1227219179
    //   4479: l2i
    //   4480: ldc_w 863201263
    //   4483: ixor
    //   4484: ixor
    //   4485: lookupswitch default -> 4512, -1911935723 -> 4468, 379792345 -> 4884
    //   4512: aload_0
    //   4513: dup
    //   4514: getstatic Perryc.0 : I
    //   4517: ifle -> 4531
    //   4520: ldc2_w -278998220
    //   4523: l2i
    //   4524: ldc_w 1500697998
    //   4527: ixor
    //   4528: goto -> 4539
    //   4531: ldc2_w -587194345
    //   4534: l2i
    //   4535: ldc_w -1663112098
    //   4538: ixor
    //   4539: ldc2_w -801126309
    //   4542: l2i
    //   4543: ldc_w 1739449161
    //   4546: ixor
    //   4547: ixor
    //   4548: lookupswitch default -> 4962, -162732197 -> 4576, 29240744 -> 4531
    //   4576: getfield facePlaceDelayCounter : I
    //   4579: ldc2_w -738667113
    //   4582: l2i
    //   4583: ldc_w -738667114
    //   4586: ixor
    //   4587: iadd
    //   4588: getstatic Perryc.c : I
    //   4591: iflt -> 4605
    //   4594: ldc2_w 1767987049
    //   4597: l2i
    //   4598: ldc_w -916356239
    //   4601: ixor
    //   4602: goto -> 4613
    //   4605: ldc2_w 250765875
    //   4608: l2i
    //   4609: ldc_w 77625332
    //   4612: ixor
    //   4613: ldc2_w -1567517258
    //   4616: l2i
    //   4617: ldc_w 1627218619
    //   4620: ixor
    //   4621: ixor
    //   4622: lookupswitch default -> 4648, 604093714 -> 4605, 1651254037 -> 4854
    //   4648: putfield facePlaceDelayCounter : I
    //   4651: getstatic Perryc.1 : I
    //   4654: ifeq -> 4668
    //   4657: ldc2_w -1440095452
    //   4660: l2i
    //   4661: ldc_w -633853584
    //   4664: ixor
    //   4665: goto -> 4676
    //   4668: ldc2_w -720145226
    //   4671: l2i
    //   4672: ldc_w -1302210853
    //   4675: ixor
    //   4676: ldc2_w -401997597
    //   4679: l2i
    //   4680: ldc_w -1070511743
    //   4683: ixor
    //   4684: ixor
    //   4685: lookupswitch default -> 4918, 1330244367 -> 4712, 1479181110 -> 4668
    //   4712: aload_0
    //   4713: dup
    //   4714: getstatic Perryc.1 : I
    //   4717: ifeq -> 4731
    //   4720: ldc2_w 2089482098
    //   4723: l2i
    //   4724: ldc_w -233331382
    //   4727: ixor
    //   4728: goto -> 4739
    //   4731: ldc2_w 994763971
    //   4734: l2i
    //   4735: ldc_w -1321391490
    //   4738: ixor
    //   4739: ldc2_w -2139392982
    //   4742: l2i
    //   4743: ldc_w -106444113
    //   4746: ixor
    //   4747: ixor
    //   4748: lookupswitch default -> 4776, -146674499 -> 4968, 1459027826 -> 4731
    //   4776: getfield obiFeetCounter : I
    //   4779: ldc2_w -1300762664
    //   4782: l2i
    //   4783: ldc_w -1300762663
    //   4786: ixor
    //   4787: iadd
    //   4788: getstatic Perryc.0 : I
    //   4791: ifle -> 4805
    //   4794: ldc2_w -1289263391
    //   4797: l2i
    //   4798: ldc_w -997985779
    //   4801: ixor
    //   4802: goto -> 4813
    //   4805: ldc2_w 716825027
    //   4808: l2i
    //   4809: ldc_w 52628151
    //   4812: ixor
    //   4813: ldc2_w 419909092
    //   4816: l2i
    //   4817: ldc_w -1269962878
    //   4820: ixor
    //   4821: ixor
    //   4822: lookupswitch default -> 4976, -2066726638 -> 4848, -621920630 -> 4805
    //   4848: putfield obiFeetCounter : I
    //   4851: return
    //   4852: aconst_null
    //   4853: athrow
    //   4854: aconst_null
    //   4855: athrow
    //   4856: aconst_null
    //   4857: athrow
    //   4858: aconst_null
    //   4859: athrow
    //   4860: aconst_null
    //   4861: athrow
    //   4862: aconst_null
    //   4863: athrow
    //   4864: aconst_null
    //   4865: athrow
    //   4866: aconst_null
    //   4867: athrow
    //   4868: aconst_null
    //   4869: athrow
    //   4870: aconst_null
    //   4871: athrow
    //   4872: aconst_null
    //   4873: athrow
    //   4874: aconst_null
    //   4875: athrow
    //   4876: aconst_null
    //   4877: athrow
    //   4878: aconst_null
    //   4879: athrow
    //   4880: aconst_null
    //   4881: athrow
    //   4882: aconst_null
    //   4883: athrow
    //   4884: aconst_null
    //   4885: athrow
    //   4886: aconst_null
    //   4887: athrow
    //   4888: aconst_null
    //   4889: athrow
    //   4890: aconst_null
    //   4891: athrow
    //   4892: aconst_null
    //   4893: athrow
    //   4894: aconst_null
    //   4895: athrow
    //   4896: aconst_null
    //   4897: athrow
    //   4898: aconst_null
    //   4899: athrow
    //   4900: aconst_null
    //   4901: athrow
    //   4902: aconst_null
    //   4903: athrow
    //   4904: aconst_null
    //   4905: athrow
    //   4906: aconst_null
    //   4907: athrow
    //   4908: aconst_null
    //   4909: athrow
    //   4910: aconst_null
    //   4911: athrow
    //   4912: aconst_null
    //   4913: athrow
    //   4914: aconst_null
    //   4915: athrow
    //   4916: aconst_null
    //   4917: athrow
    //   4918: aconst_null
    //   4919: athrow
    //   4920: aconst_null
    //   4921: athrow
    //   4922: aconst_null
    //   4923: athrow
    //   4924: aconst_null
    //   4925: athrow
    //   4926: aconst_null
    //   4927: athrow
    //   4928: aconst_null
    //   4929: athrow
    //   4930: aconst_null
    //   4931: athrow
    //   4932: aconst_null
    //   4933: athrow
    //   4934: aconst_null
    //   4935: athrow
    //   4936: aconst_null
    //   4937: athrow
    //   4938: aconst_null
    //   4939: athrow
    //   4940: aconst_null
    //   4941: athrow
    //   4942: aconst_null
    //   4943: athrow
    //   4944: aconst_null
    //   4945: athrow
    //   4946: aconst_null
    //   4947: athrow
    //   4948: aconst_null
    //   4949: athrow
    //   4950: aconst_null
    //   4951: athrow
    //   4952: aconst_null
    //   4953: athrow
    //   4954: aconst_null
    //   4955: athrow
    //   4956: aconst_null
    //   4957: athrow
    //   4958: aconst_null
    //   4959: athrow
    //   4960: aconst_null
    //   4961: athrow
    //   4962: aconst_null
    //   4963: athrow
    //   4964: aconst_null
    //   4965: athrow
    //   4966: aconst_null
    //   4967: athrow
    //   4968: aconst_null
    //   4969: athrow
    //   4970: aconst_null
    //   4971: athrow
    //   4972: aconst_null
    //   4973: athrow
    //   4974: aconst_null
    //   4975: athrow
    //   4976: aconst_null
    //   4977: athrow
    //   4978: aconst_null
    //   4979: athrow
    //   4980: aconst_null
    //   4981: athrow
    //   4982: aconst_null
    //   4983: athrow
    //   4984: aconst_null
    //   4985: athrow
    //   4986: pop
    //   4987: goto -> 24
    //   4990: pop
    //   4991: aconst_null
    //   4992: goto -> 4986
    //   4995: dup
    //   4996: ifnull -> 4986
    //   4999: checkcast java/lang/Throwable
    //   5002: athrow
    //   5003: dup
    //   5004: ifnull -> 4990
    //   5007: checkcast java/lang/Throwable
    //   5010: athrow
    //   5011: aconst_null
    //   5012: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4828	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    // Exception table:
    //   from	to	target	type
    //   8	20	4995	finally
    //   84	90	90	finally
    //   84	90	90	finally
    //   84	90	90	finally
    //   84	90	3	finally
    //   84	90	3	finally
    //   259	266	266	finally
    //   259	266	259	finally
    //   259	266	266	finally
    //   259	266	266	java/lang/IllegalStateException
    //   259	266	259	java/util/ConcurrentModificationException
    //   572	578	578	finally
    //   572	578	578	java/lang/NullPointerException
    //   572	578	3	finally
    //   572	578	3	finally
    //   572	578	3	java/lang/AssertionError
    //   643	650	650	finally
    //   644	650	643	finally
    //   644	650	643	java/lang/AssertionError
    //   644	650	650	java/util/ConcurrentModificationException
    //   644	650	650	java/lang/IllegalArgumentException
    //   1315	1322	1322	finally
    //   1315	1322	1315	java/lang/ClassCastException
    //   1315	1322	3	java/lang/NullPointerException
    //   1316	1322	1322	finally
    //   1316	1322	1322	finally
    //   1392	1398	1398	finally
    //   1392	1398	3	finally
    //   1392	1398	1398	java/lang/IllegalStateException
    //   1392	1398	3	java/lang/AssertionError
    //   1392	1398	1398	java/lang/IllegalStateException
    //   1751	1758	1758	finally
    //   1751	1758	3	java/lang/IllegalArgumentException
    //   1751	1758	1758	java/lang/AssertionError
    //   1752	1758	1758	finally
    //   1752	1758	1751	finally
    //   1948	1954	1954	finally
    //   1948	1954	3	java/lang/UnsupportedOperationException
    //   1948	1954	3	java/lang/UnsupportedOperationException
    //   1948	1954	1954	java/lang/EnumConstantNotPresentException
    //   1948	1954	1954	finally
    //   2143	2150	2150	finally
    //   2143	2150	2143	java/lang/ClassCastException
    //   2144	2150	2150	java/lang/IndexOutOfBoundsException
    //   2144	2150	2143	finally
    //   2144	2150	3	java/lang/IllegalStateException
    //   2219	2226	2226	finally
    //   2219	2226	3	finally
    //   2219	2226	2219	finally
    //   2220	2226	2226	finally
    //   2220	2226	2219	finally
    //   2879	2886	2886	finally
    //   2879	2886	2879	finally
    //   2879	2886	3	finally
    //   2880	2886	3	java/lang/IllegalArgumentException
    //   2880	2886	3	finally
    //   3571	3578	3578	finally
    //   3571	3578	3	finally
    //   3571	3578	3	java/lang/RuntimeException
    //   3572	3578	3571	java/lang/ArithmeticException
    //   3572	3578	3	finally
    //   3647	3654	3654	finally
    //   3647	3654	3654	finally
    //   3647	3654	3647	finally
    //   3648	3654	3647	finally
    //   3648	3654	3647	finally
    //   4995	5003	4995	finally
    //   5011	5013	3	finally
  }
  
  public void breakCrystal() {
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
  
  public EntityEnderCrystal getBestCrystal() {
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
  
  @SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
  public void onPacketSend(PacketEvent.Send event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1148
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1140
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1132
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 470215174
    //   33: l2i
    //   34: ldc_w -287297054
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -517496546
    //   44: l2i
    //   45: ldc_w 737672460
    //   48: ixor
    //   49: ldc2_w -866467298
    //   52: l2i
    //   53: ldc_w 1866401508
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 422605217 -> 41, 1367547678 -> 1107
    //   84: aload_1
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -2069182448
    //   94: l2i
    //   95: ldc_w -167871543
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -892133838
    //   105: l2i
    //   106: ldc_w -1545012270
    //   109: ixor
    //   110: ldc2_w 1215511188
    //   113: l2i
    //   114: ldc_w -1139446254
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1115, -2060261537 -> 102, -1654804122 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getStage : ()I
    //   151: goto -> 155
    //   154: athrow
    //   155: ifne -> 169
    //   158: ldc2_w 1278775443
    //   161: l2i
    //   162: ldc_w -31465068
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w -831044037
    //   172: l2i
    //   173: ldc_w 2085631807
    //   176: ixor
    //   177: ldc2_w -92804686
    //   180: l2i
    //   181: ldc_w 1609719016
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, 396543069 -> 208, 396543070 -> 1096
    //   208: getstatic Perryc.0 : I
    //   211: ifle -> 225
    //   214: ldc2_w -1036519107
    //   217: l2i
    //   218: ldc_w 1571004357
    //   221: ixor
    //   222: goto -> 233
    //   225: ldc2_w 34536338
    //   228: l2i
    //   229: ldc_w 592160588
    //   232: ixor
    //   233: ldc2_w -1982289124
    //   236: l2i
    //   237: ldc_w 651313255
    //   240: ixor
    //   241: ixor
    //   242: lookupswitch default -> 268, 815697283 -> 1111, 870996994 -> 225
    //   268: aload_1
    //   269: getstatic Perryc.c : I
    //   272: iflt -> 286
    //   275: ldc2_w 1475452709
    //   278: l2i
    //   279: ldc_w 1692005255
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w 780771104
    //   289: l2i
    //   290: ldc_w 695353697
    //   293: ixor
    //   294: ldc2_w 1203599445
    //   297: l2i
    //   298: ldc_w 180029564
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 328, 1501435958 -> 286, 2116951179 -> 1103
    //   328: goto -> 332
    //   331: athrow
    //   332: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   335: goto -> 339
    //   338: athrow
    //   339: instanceof net/minecraft/network/play/client/CPacketUseEntity
    //   342: ifeq -> 356
    //   345: ldc2_w 1228033770
    //   348: l2i
    //   349: ldc_w -249231246
    //   352: ixor
    //   353: goto -> 364
    //   356: ldc2_w -888356207
    //   359: l2i
    //   360: ldc_w 1931183112
    //   363: ixor
    //   364: ldc2_w -1170073157
    //   367: l2i
    //   368: ldc_w 373101845
    //   371: ixor
    //   372: ixor
    //   373: tableswitch default -> 345, 342379062 -> 396, 342379063 -> 1096
    //   396: getstatic Perryc.c : I
    //   399: iflt -> 413
    //   402: ldc2_w 2105777594
    //   405: l2i
    //   406: ldc_w -1080858559
    //   409: ixor
    //   410: goto -> 421
    //   413: ldc2_w -665583243
    //   416: l2i
    //   417: ldc_w 2005450601
    //   420: ixor
    //   421: ldc2_w 289009524
    //   424: l2i
    //   425: ldc_w 1488830719
    //   428: ixor
    //   429: ixor
    //   430: lookupswitch default -> 1099, -1953179024 -> 413, -430403177 -> 456
    //   456: aload_1
    //   457: getstatic Perryc.0 : I
    //   460: ifle -> 474
    //   463: ldc2_w -1411256567
    //   466: l2i
    //   467: ldc_w 928639325
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w 964789995
    //   477: l2i
    //   478: ldc_w -2120348884
    //   481: ixor
    //   482: ldc2_w 2063778504
    //   485: l2i
    //   486: ldc_w -38140175
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 1119, 436257389 -> 474, 1051150846 -> 516
    //   516: goto -> 520
    //   519: athrow
    //   520: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   523: goto -> 527
    //   526: athrow
    //   527: checkcast net/minecraft/network/play/client/CPacketUseEntity
    //   530: dup
    //   531: getstatic Perryc.0 : I
    //   534: ifle -> 548
    //   537: ldc2_w -1088907402
    //   540: l2i
    //   541: ldc_w 959873750
    //   544: ixor
    //   545: goto -> 556
    //   548: ldc2_w -820148388
    //   551: l2i
    //   552: ldc_w 8377429
    //   555: ixor
    //   556: ldc2_w 1330172406
    //   559: l2i
    //   560: ldc_w -163891020
    //   563: ixor
    //   564: ixor
    //   565: lookupswitch default -> 1121, 1063124194 -> 548, 1980873291 -> 592
    //   592: astore_2
    //   593: getstatic Perryc.c : I
    //   596: iflt -> 610
    //   599: ldc2_w -996208900
    //   602: l2i
    //   603: ldc_w 455742575
    //   606: ixor
    //   607: goto -> 618
    //   610: ldc2_w -1277797774
    //   613: l2i
    //   614: ldc_w 1380564445
    //   617: ixor
    //   618: ldc2_w 1818790734
    //   621: l2i
    //   622: ldc_w -1766396742
    //   625: ixor
    //   626: ixor
    //   627: lookupswitch default -> 652, -1054533633 -> 610, 627801447 -> 1113
    //   652: goto -> 656
    //   655: athrow
    //   656: invokevirtual func_149565_c : ()Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   659: goto -> 663
    //   662: athrow
    //   663: getstatic Perryc.0 : I
    //   666: ifle -> 680
    //   669: ldc2_w -622789092
    //   672: l2i
    //   673: ldc_w -1210802064
    //   676: ixor
    //   677: goto -> 688
    //   680: ldc2_w -1470104620
    //   683: l2i
    //   684: ldc_w 1278181028
    //   687: ixor
    //   688: ldc2_w 958626825
    //   691: l2i
    //   692: ldc_w -958421504
    //   695: ixor
    //   696: ixor
    //   697: lookupswitch default -> 1105, -1832352667 -> 680, 462184313 -> 724
    //   724: getstatic net/minecraft/network/play/client/CPacketUseEntity$Action.ATTACK : Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   727: if_acmpne -> 741
    //   730: ldc2_w -411236851
    //   733: l2i
    //   734: ldc_w -1570436853
    //   737: ixor
    //   738: goto -> 749
    //   741: ldc2_w 1881673400
    //   744: l2i
    //   745: ldc_w 892338623
    //   748: ixor
    //   749: ldc2_w -925961960
    //   752: l2i
    //   753: ldc_w 1252773608
    //   756: ixor
    //   757: ixor
    //   758: tableswitch default -> 730, -948096778 -> 780, -948096777 -> 1096
    //   780: getstatic Perryc.c : I
    //   783: iflt -> 797
    //   786: ldc2_w 126835607
    //   789: l2i
    //   790: ldc_w 614989221
    //   793: ixor
    //   794: goto -> 805
    //   797: ldc2_w -804695648
    //   800: l2i
    //   801: ldc_w 263419154
    //   804: ixor
    //   805: ldc2_w -1899452419
    //   808: l2i
    //   809: ldc_w -1604779910
    //   812: ixor
    //   813: ixor
    //   814: lookupswitch default -> 840, -1581185910 -> 797, 230228405 -> 1109
    //   840: aload_2
    //   841: getstatic Perryc.c : I
    //   844: iflt -> 858
    //   847: ldc2_w -1156379022
    //   850: l2i
    //   851: ldc_w 1294860718
    //   854: ixor
    //   855: goto -> 866
    //   858: ldc2_w -73934883
    //   861: l2i
    //   862: ldc_w 523937392
    //   865: ixor
    //   866: ldc2_w -114979580
    //   869: l2i
    //   870: ldc_w 1914101276
    //   873: ixor
    //   874: ixor
    //   875: lookupswitch default -> 1097, 1872634549 -> 900, 2098093252 -> 858
    //   900: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   903: getstatic Perryc.0 : I
    //   906: ifle -> 920
    //   909: ldc2_w 1970005376
    //   912: l2i
    //   913: ldc_w 112646980
    //   916: ixor
    //   917: goto -> 928
    //   920: ldc2_w 2091217192
    //   923: l2i
    //   924: ldc_w -1649118125
    //   927: ixor
    //   928: ldc2_w 1851832201
    //   931: l2i
    //   932: ldc_w -973318543
    //   935: ixor
    //   936: ixor
    //   937: lookupswitch default -> 964, -666771652 -> 1101, 2053739995 -> 920
    //   964: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   967: getstatic Perryc.c : I
    //   970: iflt -> 984
    //   973: ldc2_w -804898815
    //   976: l2i
    //   977: ldc_w -1555223747
    //   980: ixor
    //   981: goto -> 992
    //   984: ldc2_w 620156689
    //   987: l2i
    //   988: ldc_w 1592501504
    //   991: ixor
    //   992: ldc2_w -1359905639
    //   995: l2i
    //   996: ldc_w 842660804
    //   999: ixor
    //   1000: ixor
    //   1001: lookupswitch default -> 1117, -422185652 -> 1028, -276589471 -> 984
    //   1028: goto -> 1032
    //   1031: athrow
    //   1032: invokevirtual func_149564_a : (Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
    //   1035: goto -> 1039
    //   1038: athrow
    //   1039: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   1042: ifeq -> 1056
    //   1045: ldc2_w 606765793
    //   1048: l2i
    //   1049: ldc_w 172562595
    //   1052: ixor
    //   1053: goto -> 1064
    //   1056: ldc2_w -1662093598
    //   1059: l2i
    //   1060: ldc_w -1299321689
    //   1063: ixor
    //   1064: ldc2_w -1665417298
    //   1067: l2i
    //   1068: ldc_w 1485783383
    //   1071: ixor
    //   1072: ixor
    //   1073: tableswitch default -> 1045, -363371333 -> 1096, -363371332 -> 1096
    //   1096: return
    //   1097: aconst_null
    //   1098: athrow
    //   1099: aconst_null
    //   1100: athrow
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
    //   1123: pop
    //   1124: goto -> 24
    //   1127: pop
    //   1128: aconst_null
    //   1129: goto -> 1123
    //   1132: dup
    //   1133: ifnull -> 1123
    //   1136: checkcast java/lang/Throwable
    //   1139: athrow
    //   1140: dup
    //   1141: ifnull -> 1127
    //   1144: checkcast java/lang/Throwable
    //   1147: athrow
    //   1148: aconst_null
    //   1149: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   593	503	2	packet	Lnet/minecraft/network/play/client/CPacketUseEntity;
    //   24	1073	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	1073	1	event	Lbigname/zprestige/webhack/event/events/PacketEvent$Send;
    // Exception table:
    //   from	to	target	type
    //   8	20	1132	java/lang/ArithmeticException
    //   147	154	154	finally
    //   147	154	3	finally
    //   147	154	147	finally
    //   147	154	154	finally
    //   148	154	147	finally
    //   332	338	338	finally
    //   332	338	338	java/util/NoSuchElementException
    //   332	338	338	java/lang/StringIndexOutOfBoundsException
    //   332	338	338	java/lang/AssertionError
    //   332	338	338	finally
    //   519	526	526	finally
    //   520	526	519	finally
    //   520	526	526	java/lang/AssertionError
    //   520	526	526	java/lang/AssertionError
    //   520	526	519	java/lang/IndexOutOfBoundsException
    //   656	662	662	finally
    //   656	662	662	finally
    //   656	662	3	java/lang/ArithmeticException
    //   656	662	662	finally
    //   656	662	3	java/lang/ArrayIndexOutOfBoundsException
    //   1031	1038	1038	finally
    //   1031	1038	1031	finally
    //   1031	1038	1031	java/lang/IllegalArgumentException
    //   1032	1038	1031	finally
    //   1032	1038	3	java/lang/ArithmeticException
    //   1132	1140	1132	java/lang/IllegalArgumentException
    //   1148	1150	3	java/lang/IllegalStateException
  }
  
  public CrystalAura() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 1430159608
    //   9: l2i
    //   10: ldc_w -1628025940
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1482084896
    //   20: l2i
    //   21: ldc_w -1941357233
    //   24: ixor
    //   25: ldc2_w -1060465848
    //   28: l2i
    //   29: ldc_w -1492311499
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1408271831 -> 31026, -44711877 -> 17
    //   60: aload_0
    //   61: ldc_w '贯㌁赿㶤㩿掱๵蹶暇㗖'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w 1638079092
    //   73: l2i
    //   74: ldc_w -1230037873
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1753932473
    //   84: l2i
    //   85: ldc_w 1446223
    //   88: ixor
    //   89: ldc2_w 1249241979
    //   92: l2i
    //   93: ldc_w -1464819085
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, 902385651 -> 31324, 1071331817 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '贛㌆赴㶤㩿'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w 1204204855
    //   139: l2i
    //   140: ldc_w -662437245
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 415056555
    //   150: l2i
    //   151: ldc_w 814952982
    //   154: ixor
    //   155: ldc2_w 1370523799
    //   158: l2i
    //   159: ldc_w 1342503439
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1627994836 -> 30694, 1477415036 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w -112963604
    //   204: l2i
    //   205: ldc_w 267927702
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 675693679
    //   215: l2i
    //   216: ldc_w 2078389863
    //   219: ixor
    //   220: ldc2_w -313868046
    //   223: l2i
    //   224: ldc_w -545505931
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 30796, -997526787 -> 212, 1636896655 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1356322280
    //   262: l2i
    //   263: ldc_w 1356322281
    //   266: ixor
    //   267: ldc2_w -1688655459
    //   270: l2i
    //   271: ldc_w -1688655460
    //   274: ixor
    //   275: ldc2_w 641829180
    //   278: l2i
    //   279: ldc_w 641829180
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 1736957806
    //   292: l2i
    //   293: ldc_w 696774197
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1518903362
    //   303: l2i
    //   304: ldc_w -281825804
    //   307: ixor
    //   308: ldc2_w 1558946106
    //   311: l2i
    //   312: ldc_w 1377725396
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 31384, -1152465064 -> 344, 1089862581 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -601484413
    //   356: l2i
    //   357: ldc_w 200788839
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 649315309
    //   367: l2i
    //   368: ldc_w 1984528566
    //   371: ixor
    //   372: ldc2_w 188015057
    //   375: l2i
    //   376: ldc_w -1397168151
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 31046, -143243933 -> 408, 1885200092 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w 948371457
    //   418: l2i
    //   419: ldc_w -755903280
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -73945585
    //   429: l2i
    //   430: ldc_w -806829125
    //   433: ixor
    //   434: ldc2_w 1099840592
    //   437: l2i
    //   438: ldc_w 1739229129
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 30578, -867012792 -> 426, 308008493 -> 468
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '贼㌟赧㶴㩮'
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w 1589048500
    //   485: l2i
    //   486: ldc_w 748841441
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1755600922
    //   496: l2i
    //   497: ldc_w 2003095807
    //   500: ixor
    //   501: ldc2_w 1601767097
    //   504: l2i
    //   505: ldc_w 1282363454
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, 1501172156 -> 493, 1627573202 -> 31078
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -1784382856
    //   542: l2i
    //   543: ldc_w -1784382856
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 1188339852
    //   556: l2i
    //   557: ldc_w -1779827835
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -912990128
    //   567: l2i
    //   568: ldc_w -681720085
    //   571: ixor
    //   572: ldc2_w 47385835
    //   575: l2i
    //   576: ldc_w 756537868
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 31294, -50754066 -> 564, 822997084 -> 608
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.c : I
    //   614: iflt -> 628
    //   617: ldc2_w -1295870869
    //   620: l2i
    //   621: ldc_w -259881506
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w 841007857
    //   631: l2i
    //   632: ldc_w -2085700693
    //   635: ixor
    //   636: ldc2_w -552876494
    //   639: l2i
    //   640: ldc_w 1186085804
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 672, -604378069 -> 31066, -564775806 -> 628
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w 143384724
    //   684: l2i
    //   685: ldc_w 1257814230
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -1986331196
    //   695: l2i
    //   696: ldc_w -968495978
    //   699: ixor
    //   700: ldc2_w -1875759384
    //   703: l2i
    //   704: ldc_w -952987880
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -64935543 -> 692, 359922098 -> 31194
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.0 : I
    //   742: ifle -> 756
    //   745: ldc2_w 138095197
    //   748: l2i
    //   749: ldc_w -159927786
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 1298008376
    //   759: l2i
    //   760: ldc_w 438179816
    //   763: ixor
    //   764: ldc2_w 27016830
    //   767: l2i
    //   768: ldc_w -428026968
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, -1658914744 -> 756, 430732701 -> 31364
    //   800: putfield place : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 820
    //   809: ldc2_w -1171474604
    //   812: l2i
    //   813: ldc_w 1851544966
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 373791157
    //   823: l2i
    //   824: ldc_w 1746919371
    //   827: ixor
    //   828: ldc2_w -1162123716
    //   831: l2i
    //   832: ldc_w 384492736
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 30862, -771111806 -> 864, 2015453230 -> 820
    //   864: aload_0
    //   865: getstatic Perryc.0 : I
    //   868: ifle -> 882
    //   871: ldc2_w -160021514
    //   874: l2i
    //   875: ldc_w 944134695
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w 2079994243
    //   885: l2i
    //   886: ldc_w -929424833
    //   889: ixor
    //   890: ldc2_w -1910618893
    //   893: l2i
    //   894: ldc_w -695505977
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, -1767557403 -> 30814, -821493438 -> 882
    //   924: aload_0
    //   925: new bigname/zprestige/webhack/features/setting/Setting
    //   928: dup
    //   929: ldc_w '贮㌁赣㶶㩠'
    //   932: getstatic Perryc.1 : I
    //   935: ifeq -> 949
    //   938: ldc2_w 441001080
    //   941: l2i
    //   942: ldc_w 820048448
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w -1248192408
    //   952: l2i
    //   953: ldc_w -925891905
    //   956: ixor
    //   957: ldc2_w -299183746
    //   960: l2i
    //   961: ldc_w 1322554264
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 992, -1973971746 -> 31368, -696224808 -> 949
    //   992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   995: ldc2_w -1495004274
    //   998: l2i
    //   999: ldc_w -1495004274
    //   1002: ixor
    //   1003: getstatic Perryc.c : I
    //   1006: iflt -> 1020
    //   1009: ldc2_w -627631391
    //   1012: l2i
    //   1013: ldc_w 918400209
    //   1016: ixor
    //   1017: goto -> 1028
    //   1020: ldc2_w -1298003714
    //   1023: l2i
    //   1024: ldc_w -717569354
    //   1027: ixor
    //   1028: ldc2_w -1849236418
    //   1031: l2i
    //   1032: ldc_w -1829898741
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 30948, -285105147 -> 1020, 1689507965 -> 1064
    //   1064: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1067: getstatic Perryc.0 : I
    //   1070: ifle -> 1084
    //   1073: ldc2_w 1284372789
    //   1076: l2i
    //   1077: ldc_w -1679684346
    //   1080: ixor
    //   1081: goto -> 1092
    //   1084: ldc2_w 785199962
    //   1087: l2i
    //   1088: ldc_w -1501055615
    //   1091: ixor
    //   1092: ldc2_w -583401488
    //   1095: l2i
    //   1096: ldc_w 62562654
    //   1099: ixor
    //   1100: ixor
    //   1101: lookupswitch default -> 31074, 166505117 -> 1084, 1456068725 -> 1128
    //   1128: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1131: getstatic Perryc.1 : I
    //   1134: ifeq -> 1148
    //   1137: ldc2_w -280390026
    //   1140: l2i
    //   1141: ldc_w 617761545
    //   1144: ixor
    //   1145: goto -> 1156
    //   1148: ldc2_w 1878945510
    //   1151: l2i
    //   1152: ldc_w 1858520177
    //   1155: ixor
    //   1156: ldc2_w -1191981231
    //   1159: l2i
    //   1160: ldc_w -1383346631
    //   1163: ixor
    //   1164: ixor
    //   1165: lookupswitch default -> 1192, -555492329 -> 31086, 890270355 -> 1148
    //   1192: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1195: getstatic Perryc.0 : I
    //   1198: ifle -> 1212
    //   1201: ldc2_w -549899175
    //   1204: l2i
    //   1205: ldc_w -1095865101
    //   1208: ixor
    //   1209: goto -> 1220
    //   1212: ldc2_w 869528830
    //   1215: l2i
    //   1216: ldc_w 673926325
    //   1219: ixor
    //   1220: ldc2_w -166159281
    //   1223: l2i
    //   1224: ldc_w -1744448143
    //   1227: ixor
    //   1228: ixor
    //   1229: lookupswitch default -> 1256, 166407094 -> 1212, 260706708 -> 30766
    //   1256: putfield breaK : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1259: getstatic Perryc.0 : I
    //   1262: ifle -> 1276
    //   1265: ldc2_w -1925910766
    //   1268: l2i
    //   1269: ldc_w -883859098
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w -1076771320
    //   1279: l2i
    //   1280: ldc_w -1069521262
    //   1283: ixor
    //   1284: ldc2_w 1541298045
    //   1287: l2i
    //   1288: ldc_w 1680782193
    //   1291: ixor
    //   1292: ixor
    //   1293: lookupswitch default -> 1320, -986953257 -> 1276, 2039835256 -> 30926
    //   1320: aload_0
    //   1321: getstatic Perryc.1 : I
    //   1324: ifeq -> 1338
    //   1327: ldc2_w 64367540
    //   1330: l2i
    //   1331: ldc_w -676348423
    //   1334: ixor
    //   1335: goto -> 1346
    //   1338: ldc2_w 1551330583
    //   1341: l2i
    //   1342: ldc_w 1401256199
    //   1345: ixor
    //   1346: ldc2_w -498038781
    //   1349: l2i
    //   1350: ldc_w 24688185
    //   1353: ixor
    //   1354: ixor
    //   1355: lookupswitch default -> 1380, 928098423 -> 30592, 1693521776 -> 1338
    //   1380: aload_0
    //   1381: new bigname/zprestige/webhack/features/setting/Setting
    //   1384: dup
    //   1385: ldc_w '购㌝赲㶾㩜掵๸蹭暐㗄਴'
    //   1388: getstatic Perryc.0 : I
    //   1391: ifle -> 1405
    //   1394: ldc2_w 1948167157
    //   1397: l2i
    //   1398: ldc_w -1927803986
    //   1401: ixor
    //   1402: goto -> 1413
    //   1405: ldc2_w 1495332271
    //   1408: l2i
    //   1409: ldc_w -2142133833
    //   1412: ixor
    //   1413: ldc2_w -1205166510
    //   1416: l2i
    //   1417: ldc_w -1005533828
    //   1420: ixor
    //   1421: ixor
    //   1422: lookupswitch default -> 1448, -2059601035 -> 30478, -196738062 -> 1405
    //   1448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1451: ldc2_w 204432167
    //   1454: l2i
    //   1455: ldc_w 204432167
    //   1458: ixor
    //   1459: getstatic Perryc.0 : I
    //   1462: ifle -> 1476
    //   1465: ldc2_w 1566117124
    //   1468: l2i
    //   1469: ldc_w 706950197
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w 229909171
    //   1479: l2i
    //   1480: ldc_w -1228527250
    //   1483: ixor
    //   1484: ldc2_w -368753567
    //   1487: l2i
    //   1488: ldc_w 157894717
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 1520, -1810483859 -> 31240, -251621671 -> 1476
    //   1520: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1523: getstatic Perryc.0 : I
    //   1526: ifle -> 1540
    //   1529: ldc2_w 695720725
    //   1532: l2i
    //   1533: ldc_w -603109025
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w -343905101
    //   1543: l2i
    //   1544: ldc_w 902667728
    //   1547: ixor
    //   1548: ldc2_w 1214998894
    //   1551: l2i
    //   1552: ldc_w -79481970
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 31326, 1179830442 -> 1540, 1835379587 -> 1584
    //   1584: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1587: getstatic Perryc.0 : I
    //   1590: ifle -> 1604
    //   1593: ldc2_w 619383051
    //   1596: l2i
    //   1597: ldc_w -1782522443
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 1964571381
    //   1607: l2i
    //   1608: ldc_w 96946142
    //   1611: ixor
    //   1612: ldc2_w -1153360993
    //   1615: l2i
    //   1616: ldc_w 1364472588
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 30856, -1697999432 -> 1648, 1530854445 -> 1604
    //   1648: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1651: getstatic Perryc.0 : I
    //   1654: ifle -> 1668
    //   1657: ldc2_w -1021366611
    //   1660: l2i
    //   1661: ldc_w 2074376482
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w -1855543670
    //   1671: l2i
    //   1672: ldc_w 1947164641
    //   1675: ixor
    //   1676: ldc2_w 544216728
    //   1679: l2i
    //   1680: ldc_w -772082741
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1712, 1227993820 -> 30584, 1445480251 -> 1668
    //   1712: putfield antiWeakness : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1715: getstatic Perryc.c : I
    //   1718: iflt -> 1732
    //   1721: ldc2_w 1788961879
    //   1724: l2i
    //   1725: ldc_w 155368321
    //   1728: ixor
    //   1729: goto -> 1740
    //   1732: ldc2_w -200954894
    //   1735: l2i
    //   1736: ldc_w -678085508
    //   1739: ixor
    //   1740: ldc2_w -694343431
    //   1743: l2i
    //   1744: ldc_w -1739012640
    //   1747: ixor
    //   1748: ixor
    //   1749: lookupswitch default -> 30558, 757478095 -> 1732, 1834318487 -> 1776
    //   1776: aload_0
    //   1777: getstatic Perryc.0 : I
    //   1780: ifle -> 1794
    //   1783: ldc2_w -243422983
    //   1786: l2i
    //   1787: ldc_w -1895891866
    //   1790: ixor
    //   1791: goto -> 1802
    //   1794: ldc2_w -1631322790
    //   1797: l2i
    //   1798: ldc_w -889836059
    //   1801: ixor
    //   1802: ldc2_w -1596416561
    //   1805: l2i
    //   1806: ldc_w 1378431392
    //   1809: ixor
    //   1810: ixor
    //   1811: lookupswitch default -> 30744, -1921845008 -> 1794, -1497072432 -> 1836
    //   1836: aload_0
    //   1837: new bigname/zprestige/webhack/features/setting/Setting
    //   1840: dup
    //   1841: ldc_w '贼㌟赧㶴㩮揰๋蹭暒㗒'
    //   1844: getstatic Perryc.1 : I
    //   1847: ifeq -> 1861
    //   1850: ldc2_w -393463366
    //   1853: l2i
    //   1854: ldc_w -1211810009
    //   1857: ixor
    //   1858: goto -> 1869
    //   1861: ldc2_w 343259754
    //   1864: l2i
    //   1865: ldc_w -1818514628
    //   1868: ixor
    //   1869: ldc2_w 1846867536
    //   1872: l2i
    //   1873: ldc_w 689269197
    //   1876: ixor
    //   1877: ixor
    //   1878: lookupswitch default -> 30864, -1058042165 -> 1904, 407410944 -> 1861
    //   1904: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1907: ldc2_w 1667929753
    //   1910: l2i
    //   1911: ldc_w 1667929756
    //   1914: ixor
    //   1915: getstatic Perryc.1 : I
    //   1918: ifeq -> 1932
    //   1921: ldc2_w -1069497418
    //   1924: l2i
    //   1925: ldc_w -2095820484
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w -1179233685
    //   1935: l2i
    //   1936: ldc_w -553766287
    //   1939: ixor
    //   1940: ldc2_w -1943370394
    //   1943: l2i
    //   1944: ldc_w -1216347337
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 1976, 203244181 -> 1932, 2029917403 -> 31140
    //   1976: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1979: ldc2_w -1368836489
    //   1982: l2i
    //   1983: ldc_w -1368836489
    //   1986: ixor
    //   1987: getstatic Perryc.0 : I
    //   1990: ifle -> 2004
    //   1993: ldc2_w 723380255
    //   1996: l2i
    //   1997: ldc_w -1901378663
    //   2000: ixor
    //   2001: goto -> 2012
    //   2004: ldc2_w -1656845121
    //   2007: l2i
    //   2008: ldc_w -1599718906
    //   2011: ixor
    //   2012: ldc2_w 1780472564
    //   2015: l2i
    //   2016: ldc_w 1118708060
    //   2019: ixor
    //   2020: ixor
    //   2021: lookupswitch default -> 2048, -1928900562 -> 30980, -760374391 -> 2004
    //   2048: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2051: ldc2_w 1165015541
    //   2054: l2i
    //   2055: ldc_w 1165015539
    //   2058: ixor
    //   2059: getstatic Perryc.c : I
    //   2062: iflt -> 2076
    //   2065: ldc2_w 2085978504
    //   2068: l2i
    //   2069: ldc_w 564374049
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w -1471305196
    //   2079: l2i
    //   2080: ldc_w -2036085323
    //   2083: ixor
    //   2084: ldc2_w 1832868558
    //   2087: l2i
    //   2088: ldc_w -873927419
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -81683358 -> 30562, 215936924 -> 2076
    //   2120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2123: getstatic Perryc.0 : I
    //   2126: ifle -> 2140
    //   2129: ldc2_w -203752513
    //   2132: l2i
    //   2133: ldc_w 2068767614
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w -949549410
    //   2143: l2i
    //   2144: ldc_w 2130128789
    //   2147: ixor
    //   2148: ldc2_w -2026321878
    //   2151: l2i
    //   2152: ldc_w -1026022311
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 30496, -847973198 -> 2140, -59718280 -> 2184
    //   2184: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2187: getstatic Perryc.0 : I
    //   2190: ifle -> 2204
    //   2193: ldc2_w 1672415019
    //   2196: l2i
    //   2197: ldc_w 1278765847
    //   2200: ixor
    //   2201: goto -> 2212
    //   2204: ldc2_w -848858758
    //   2207: l2i
    //   2208: ldc_w -14798229
    //   2211: ixor
    //   2212: ldc2_w 2125818980
    //   2215: l2i
    //   2216: ldc_w -1981813036
    //   2219: ixor
    //   2220: ixor
    //   2221: lookupswitch default -> 2248, -654446964 -> 30900, 1108545467 -> 2204
    //   2248: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2251: getstatic Perryc.c : I
    //   2254: iflt -> 2268
    //   2257: ldc2_w -1033563315
    //   2260: l2i
    //   2261: ldc_w 1514180596
    //   2264: ixor
    //   2265: goto -> 2276
    //   2268: ldc2_w -614202002
    //   2271: l2i
    //   2272: ldc_w -1157167241
    //   2275: ixor
    //   2276: ldc2_w -1579115135
    //   2279: l2i
    //   2280: ldc_w -1013394162
    //   2283: ixor
    //   2284: ixor
    //   2285: lookupswitch default -> 2312, -94514122 -> 30874, 286385215 -> 2268
    //   2312: putfield placeRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2315: getstatic Perryc.1 : I
    //   2318: ifeq -> 2332
    //   2321: ldc2_w 1706687124
    //   2324: l2i
    //   2325: ldc_w -1157316285
    //   2328: ixor
    //   2329: goto -> 2340
    //   2332: ldc2_w -1126820013
    //   2335: l2i
    //   2336: ldc_w -182782367
    //   2339: ixor
    //   2340: ldc2_w 1720192713
    //   2343: l2i
    //   2344: ldc_w -267897621
    //   2347: ixor
    //   2348: ixor
    //   2349: lookupswitch default -> 30880, -548611312 -> 2376, 1211957749 -> 2332
    //   2376: aload_0
    //   2377: getstatic Perryc.0 : I
    //   2380: ifle -> 2394
    //   2383: ldc2_w -1214335585
    //   2386: l2i
    //   2387: ldc_w -402893631
    //   2390: ixor
    //   2391: goto -> 2402
    //   2394: ldc2_w 1562948680
    //   2397: l2i
    //   2398: ldc_w 1751578567
    //   2401: ixor
    //   2402: ldc2_w 1827954412
    //   2405: l2i
    //   2406: ldc_w -702196256
    //   2409: ixor
    //   2410: ixor
    //   2411: lookupswitch default -> 2436, -357307822 -> 30848, 1857547542 -> 2394
    //   2436: aload_0
    //   2437: new bigname/zprestige/webhack/features/setting/Setting
    //   2440: dup
    //   2441: ldc_w '贮㌁赣㶶㩠揰๋蹭暒㗒'
    //   2444: getstatic Perryc.1 : I
    //   2447: ifeq -> 2461
    //   2450: ldc2_w -1740775184
    //   2453: l2i
    //   2454: ldc_w 357819513
    //   2457: ixor
    //   2458: goto -> 2469
    //   2461: ldc2_w -106354356
    //   2464: l2i
    //   2465: ldc_w 1373826969
    //   2468: ixor
    //   2469: ldc2_w 1039192202
    //   2472: l2i
    //   2473: ldc_w 1628568320
    //   2476: ixor
    //   2477: ixor
    //   2478: lookupswitch default -> 2504, -779145469 -> 30794, 548532593 -> 2461
    //   2504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2507: ldc2_w -1329776772
    //   2510: l2i
    //   2511: ldc_w -1329776775
    //   2514: ixor
    //   2515: getstatic Perryc.0 : I
    //   2518: ifle -> 2532
    //   2521: ldc2_w 831417824
    //   2524: l2i
    //   2525: ldc_w 1404035903
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w -1404204652
    //   2535: l2i
    //   2536: ldc_w 1540168951
    //   2539: ixor
    //   2540: ldc2_w -859311647
    //   2543: l2i
    //   2544: ldc_w 1434126888
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 31238, -73566954 -> 2532, 1849454250 -> 2576
    //   2576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2579: ldc2_w -391682393
    //   2582: l2i
    //   2583: ldc_w -391682393
    //   2586: ixor
    //   2587: getstatic Perryc.0 : I
    //   2590: ifle -> 2604
    //   2593: ldc2_w 1640372426
    //   2596: l2i
    //   2597: ldc_w 1703246430
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w -181139269
    //   2607: l2i
    //   2608: ldc_w -79993670
    //   2611: ixor
    //   2612: ldc2_w -1568288393
    //   2615: l2i
    //   2616: ldc_w -1194908705
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 30976, 340631209 -> 2648, 503418940 -> 2604
    //   2648: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2651: ldc2_w 1311482038
    //   2654: l2i
    //   2655: ldc_w 1311482032
    //   2658: ixor
    //   2659: getstatic Perryc.1 : I
    //   2662: ifeq -> 2676
    //   2665: ldc2_w -1595922842
    //   2668: l2i
    //   2669: ldc_w -2092383430
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w 692879595
    //   2679: l2i
    //   2680: ldc_w 1348060122
    //   2683: ixor
    //   2684: ldc2_w -14879062
    //   2687: l2i
    //   2688: ldc_w 1690027757
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 2720, -1206921957 -> 30870, -194214402 -> 2676
    //   2720: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2723: getstatic Perryc.0 : I
    //   2726: ifle -> 2740
    //   2729: ldc2_w 1138813323
    //   2732: l2i
    //   2733: ldc_w -190740512
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w 1279857921
    //   2743: l2i
    //   2744: ldc_w 894607261
    //   2747: ixor
    //   2748: ldc2_w -185251834
    //   2751: l2i
    //   2752: ldc_w -1481496994
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 30554, -469368781 -> 2740, 710730948 -> 2784
    //   2784: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2787: getstatic Perryc.0 : I
    //   2790: ifle -> 2804
    //   2793: ldc2_w -916081623
    //   2796: l2i
    //   2797: ldc_w -735260462
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -349379976
    //   2807: l2i
    //   2808: ldc_w 1474451338
    //   2811: ixor
    //   2812: ldc2_w -1396378904
    //   2815: l2i
    //   2816: ldc_w 135349772
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 31102, -1180905441 -> 2804, 404422934 -> 2848
    //   2848: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2851: getstatic Perryc.0 : I
    //   2854: ifle -> 2868
    //   2857: ldc2_w 1591193595
    //   2860: l2i
    //   2861: ldc_w 465433816
    //   2864: ixor
    //   2865: goto -> 2876
    //   2868: ldc2_w 2102287636
    //   2871: l2i
    //   2872: ldc_w -466895054
    //   2875: ixor
    //   2876: ldc2_w -2048258784
    //   2879: l2i
    //   2880: ldc_w -1811253504
    //   2883: ixor
    //   2884: ixor
    //   2885: lookupswitch default -> 2912, 1418338563 -> 31338, 1443767982 -> 2868
    //   2912: putfield breakRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2915: getstatic Perryc.1 : I
    //   2918: ifeq -> 2932
    //   2921: ldc2_w -1822658263
    //   2924: l2i
    //   2925: ldc_w 778301852
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w -240948021
    //   2935: l2i
    //   2936: ldc_w 1770021594
    //   2939: ixor
    //   2940: ldc2_w 695147261
    //   2943: l2i
    //   2944: ldc_w 844911461
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 2976, -1509111507 -> 31212, 1476243082 -> 2932
    //   2976: aload_0
    //   2977: getstatic Perryc.1 : I
    //   2980: ifeq -> 2994
    //   2983: ldc2_w -1558186407
    //   2986: l2i
    //   2987: ldc_w 517251441
    //   2990: ixor
    //   2991: goto -> 3002
    //   2994: ldc2_w 936154911
    //   2997: l2i
    //   2998: ldc_w -142786137
    //   3001: ixor
    //   3002: ldc2_w -1285378642
    //   3005: l2i
    //   3006: ldc_w -1978144640
    //   3009: ixor
    //   3010: ixor
    //   3011: lookupswitch default -> 3036, -2067918330 -> 30540, 190510652 -> 2994
    //   3036: aload_0
    //   3037: new bigname/zprestige/webhack/features/setting/Setting
    //   3040: dup
    //   3041: ldc_w '贼㌟赧㶴㩮揰๋蹭暒㗒੧䃣煠ၥ'
    //   3044: getstatic Perryc.c : I
    //   3047: iflt -> 3061
    //   3050: ldc2_w 1089031059
    //   3053: l2i
    //   3054: ldc_w -527172956
    //   3057: ixor
    //   3058: goto -> 3069
    //   3061: ldc2_w 2090670621
    //   3064: l2i
    //   3065: ldc_w 1818336128
    //   3068: ixor
    //   3069: ldc2_w 658032772
    //   3072: l2i
    //   3073: ldc_w 288509713
    //   3076: ixor
    //   3077: ixor
    //   3078: lookupswitch default -> 31288, -1771030878 -> 3061, 653657608 -> 3104
    //   3104: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3107: ldc2_w -21584288
    //   3110: l2i
    //   3111: ldc_w -21584285
    //   3114: ixor
    //   3115: getstatic Perryc.0 : I
    //   3118: ifle -> 3132
    //   3121: ldc2_w 2106339935
    //   3124: l2i
    //   3125: ldc_w -368309298
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w 458119815
    //   3135: l2i
    //   3136: ldc_w -784791736
    //   3139: ixor
    //   3140: ldc2_w -1455518546
    //   3143: l2i
    //   3144: ldc_w -1258142664
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 31170, -1950551801 -> 3132, -699689639 -> 3176
    //   3176: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3179: ldc2_w -1992456066
    //   3182: l2i
    //   3183: ldc_w -1992456066
    //   3186: ixor
    //   3187: getstatic Perryc.0 : I
    //   3190: ifle -> 3204
    //   3193: ldc2_w 319576111
    //   3196: l2i
    //   3197: ldc_w 714536162
    //   3200: ixor
    //   3201: goto -> 3212
    //   3204: ldc2_w -1757163344
    //   3207: l2i
    //   3208: ldc_w 67542025
    //   3211: ixor
    //   3212: ldc2_w 1067269269
    //   3215: l2i
    //   3216: ldc_w 1246597578
    //   3219: ixor
    //   3220: ixor
    //   3221: lookupswitch default -> 30802, -426384922 -> 3248, 1279918482 -> 3204
    //   3248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3251: ldc2_w -890573486
    //   3254: l2i
    //   3255: ldc_w -890573484
    //   3258: ixor
    //   3259: getstatic Perryc.0 : I
    //   3262: ifle -> 3276
    //   3265: ldc2_w -1387331836
    //   3268: l2i
    //   3269: ldc_w -1180987498
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w 1124887247
    //   3279: l2i
    //   3280: ldc_w -748706086
    //   3283: ixor
    //   3284: ldc2_w 971416457
    //   3287: l2i
    //   3288: ldc_w -778294100
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 30732, -55574601 -> 3276, 2015970096 -> 3320
    //   3320: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3323: getstatic Perryc.1 : I
    //   3326: ifeq -> 3340
    //   3329: ldc2_w -1316388408
    //   3332: l2i
    //   3333: ldc_w -1950458433
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w -1713238694
    //   3343: l2i
    //   3344: ldc_w 1712929329
    //   3347: ixor
    //   3348: ldc2_w 1685815582
    //   3351: l2i
    //   3352: ldc_w 529906183
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 3384, 443107233 -> 3340, 1104799598 -> 30674
    //   3384: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3387: getstatic Perryc.1 : I
    //   3390: ifeq -> 3404
    //   3393: ldc2_w -1798759684
    //   3396: l2i
    //   3397: ldc_w 1131797948
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w -396409561
    //   3407: l2i
    //   3408: ldc_w -516354457
    //   3411: ixor
    //   3412: ldc2_w 2126708056
    //   3415: l2i
    //   3416: ldc_w 241721705
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 3448, -1491707023 -> 30500, 1331920152 -> 3404
    //   3448: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3451: getstatic Perryc.0 : I
    //   3454: ifle -> 3468
    //   3457: ldc2_w 556968819
    //   3460: l2i
    //   3461: ldc_w 1192356780
    //   3464: ixor
    //   3465: goto -> 3476
    //   3468: ldc2_w -90638897
    //   3471: l2i
    //   3472: ldc_w -1663986554
    //   3475: ixor
    //   3476: ldc2_w -1276124766
    //   3479: l2i
    //   3480: ldc_w 2013763966
    //   3483: ixor
    //   3484: ixor
    //   3485: lookupswitch default -> 3512, -1379190781 -> 30894, -1122801945 -> 3468
    //   3512: putfield placeRangeWall : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3515: getstatic Perryc.1 : I
    //   3518: ifeq -> 3532
    //   3521: ldc2_w 1884764343
    //   3524: l2i
    //   3525: ldc_w -1361182322
    //   3528: ixor
    //   3529: goto -> 3540
    //   3532: ldc2_w -1826767115
    //   3535: l2i
    //   3536: ldc_w 1055779843
    //   3539: ixor
    //   3540: ldc2_w -1490230713
    //   3543: l2i
    //   3544: ldc_w 1359990235
    //   3547: ixor
    //   3548: ixor
    //   3549: lookupswitch default -> 30970, 682235557 -> 3532, 1540586858 -> 3576
    //   3576: aload_0
    //   3577: getstatic Perryc.1 : I
    //   3580: ifeq -> 3594
    //   3583: ldc2_w 96860804
    //   3586: l2i
    //   3587: ldc_w -251870699
    //   3590: ixor
    //   3591: goto -> 3602
    //   3594: ldc2_w 1394388339
    //   3597: l2i
    //   3598: ldc_w -406648131
    //   3601: ixor
    //   3602: ldc2_w -2057716449
    //   3605: l2i
    //   3606: ldc_w 933749939
    //   3609: ixor
    //   3610: ixor
    //   3611: lookupswitch default -> 3636, -1915165296 -> 3594, 1204248893 -> 30614
    //   3636: aload_0
    //   3637: new bigname/zprestige/webhack/features/setting/Setting
    //   3640: dup
    //   3641: ldc_w '贮㌁赣㶶㩠揰๋蹭暒㗒੧䃣煠ၥ'
    //   3644: getstatic Perryc.1 : I
    //   3647: ifeq -> 3661
    //   3650: ldc2_w 877810762
    //   3653: l2i
    //   3654: ldc_w 849431461
    //   3657: ixor
    //   3658: goto -> 3669
    //   3661: ldc2_w 675219924
    //   3664: l2i
    //   3665: ldc_w 1770128338
    //   3668: ixor
    //   3669: ldc2_w 530961901
    //   3672: l2i
    //   3673: ldc_w 1351342938
    //   3676: ixor
    //   3677: ixor
    //   3678: lookupswitch default -> 30654, 244516017 -> 3704, 1239224664 -> 3661
    //   3704: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3707: ldc2_w 608742761
    //   3710: l2i
    //   3711: ldc_w 608742762
    //   3714: ixor
    //   3715: getstatic Perryc.c : I
    //   3718: iflt -> 3732
    //   3721: ldc2_w -586525045
    //   3724: l2i
    //   3725: ldc_w 1341956859
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w 1669084395
    //   3735: l2i
    //   3736: ldc_w -181433751
    //   3739: ixor
    //   3740: ldc2_w -724590361
    //   3743: l2i
    //   3744: ldc_w -204782378
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 30906, -1319675213 -> 3776, -1242427327 -> 3732
    //   3776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3779: ldc2_w 1694852435
    //   3782: l2i
    //   3783: ldc_w 1694852435
    //   3786: ixor
    //   3787: getstatic Perryc.1 : I
    //   3790: ifeq -> 3804
    //   3793: ldc2_w -1704686339
    //   3796: l2i
    //   3797: ldc_w -1168261910
    //   3800: ixor
    //   3801: goto -> 3812
    //   3804: ldc2_w 1606330498
    //   3807: l2i
    //   3808: ldc_w -1309117747
    //   3811: ixor
    //   3812: ldc2_w 2106314243
    //   3815: l2i
    //   3816: ldc_w 958594906
    //   3819: ixor
    //   3820: ixor
    //   3821: lookupswitch default -> 31276, -1427117290 -> 3848, 1687159118 -> 3804
    //   3848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3851: ldc2_w 2096257754
    //   3854: l2i
    //   3855: ldc_w 2096257756
    //   3858: ixor
    //   3859: getstatic Perryc.0 : I
    //   3862: ifle -> 3876
    //   3865: ldc2_w -2047602067
    //   3868: l2i
    //   3869: ldc_w -456734939
    //   3872: ixor
    //   3873: goto -> 3884
    //   3876: ldc2_w -1994762207
    //   3879: l2i
    //   3880: ldc_w -1634791612
    //   3883: ixor
    //   3884: ldc2_w -1237185390
    //   3887: l2i
    //   3888: ldc_w 2096932475
    //   3891: ixor
    //   3892: ixor
    //   3893: lookupswitch default -> 3920, -1416855647 -> 31084, 358274873 -> 3876
    //   3920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3923: getstatic Perryc.0 : I
    //   3926: ifle -> 3940
    //   3929: ldc2_w 1668059737
    //   3932: l2i
    //   3933: ldc_w 3732498
    //   3936: ixor
    //   3937: goto -> 3948
    //   3940: ldc2_w 1324757874
    //   3943: l2i
    //   3944: ldc_w -1671554657
    //   3947: ixor
    //   3948: ldc2_w -141417112
    //   3951: l2i
    //   3952: ldc_w 1595283556
    //   3955: ixor
    //   3956: ixor
    //   3957: lookupswitch default -> 3984, -875537593 -> 31342, 344098838 -> 3940
    //   3984: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3987: getstatic Perryc.c : I
    //   3990: iflt -> 4004
    //   3993: ldc2_w 202847409
    //   3996: l2i
    //   3997: ldc_w 637208998
    //   4000: ixor
    //   4001: goto -> 4012
    //   4004: ldc2_w -1964472672
    //   4007: l2i
    //   4008: ldc_w 1956794805
    //   4011: ixor
    //   4012: ldc2_w 2023941182
    //   4015: l2i
    //   4016: ldc_w 339719119
    //   4019: ixor
    //   4020: ixor
    //   4021: lookupswitch default -> 30524, -1831370524 -> 4048, 1165060838 -> 4004
    //   4048: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4051: getstatic Perryc.c : I
    //   4054: iflt -> 4068
    //   4057: ldc2_w 1803821855
    //   4060: l2i
    //   4061: ldc_w 826238396
    //   4064: ixor
    //   4065: goto -> 4076
    //   4068: ldc2_w 808499513
    //   4071: l2i
    //   4072: ldc_w 630406840
    //   4075: ixor
    //   4076: ldc2_w -275633746
    //   4079: l2i
    //   4080: ldc_w 1392212884
    //   4083: ixor
    //   4084: ixor
    //   4085: lookupswitch default -> 30834, -1463102021 -> 4112, -405662567 -> 4068
    //   4112: putfield breakRangeWall : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4115: getstatic Perryc.0 : I
    //   4118: ifle -> 4132
    //   4121: ldc2_w 79593075
    //   4124: l2i
    //   4125: ldc_w 1595941819
    //   4128: ixor
    //   4129: goto -> 4140
    //   4132: ldc2_w 1040130184
    //   4135: l2i
    //   4136: ldc_w 1166395916
    //   4139: ixor
    //   4140: ldc2_w -437050872
    //   4143: l2i
    //   4144: ldc_w 916138057
    //   4147: ixor
    //   4148: ixor
    //   4149: lookupswitch default -> 4176, -2002701183 -> 4132, -1997121655 -> 30672
    //   4176: aload_0
    //   4177: getstatic Perryc.c : I
    //   4180: iflt -> 4194
    //   4183: ldc2_w 81761442
    //   4186: l2i
    //   4187: ldc_w 1910728791
    //   4190: ixor
    //   4191: goto -> 4202
    //   4194: ldc2_w -641436898
    //   4197: l2i
    //   4198: ldc_w -912042892
    //   4201: ixor
    //   4202: ldc2_w 1637985339
    //   4205: l2i
    //   4206: ldc_w 722700652
    //   4209: ixor
    //   4210: ixor
    //   4211: lookupswitch default -> 30998, 1066326434 -> 4194, 1523909181 -> 4236
    //   4236: aload_0
    //   4237: new bigname/zprestige/webhack/features/setting/Setting
    //   4240: dup
    //   4241: ldc_w '贸㌒赴㶰㩮掤ู蹢暛㗐ਢ'
    //   4244: getstatic Perryc.0 : I
    //   4247: ifle -> 4261
    //   4250: ldc2_w -1416435672
    //   4253: l2i
    //   4254: ldc_w 547379991
    //   4257: ixor
    //   4258: goto -> 4269
    //   4261: ldc2_w -1688101109
    //   4264: l2i
    //   4265: ldc_w -2037881376
    //   4268: ixor
    //   4269: ldc2_w 854623445
    //   4272: l2i
    //   4273: ldc_w -1385585525
    //   4276: ixor
    //   4277: ixor
    //   4278: lookupswitch default -> 30656, -2106533195 -> 4304, 346788705 -> 4261
    //   4304: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4307: ldc2_w 0.14385946173429567
    //   4310: invokestatic doubleToLongBits : (D)J
    //   4313: ldc2_w 9214481371365325361
    //   4316: lxor
    //   4317: invokestatic longBitsToDouble : (J)D
    //   4320: getstatic Perryc.0 : I
    //   4323: ifle -> 4337
    //   4326: ldc2_w 1314996353
    //   4329: l2i
    //   4330: ldc_w -752882643
    //   4333: ixor
    //   4334: goto -> 4345
    //   4337: ldc2_w -2008146850
    //   4340: l2i
    //   4341: ldc_w 77774054
    //   4344: ixor
    //   4345: ldc2_w 146526383
    //   4348: l2i
    //   4349: ldc_w -938334802
    //   4352: ixor
    //   4353: ixor
    //   4354: lookupswitch default -> 4380, -498600310 -> 4337, 1574394285 -> 30548
    //   4380: invokestatic valueOf : (D)Ljava/lang/Double;
    //   4383: ldc2_w 9.908075371761151E307
    //   4386: invokestatic doubleToLongBits : (D)J
    //   4389: ldc2_w 9214825600764831280
    //   4392: lxor
    //   4393: invokestatic longBitsToDouble : (J)D
    //   4396: getstatic Perryc.c : I
    //   4399: iflt -> 4413
    //   4402: ldc2_w 1735203554
    //   4405: l2i
    //   4406: ldc_w -703645342
    //   4409: ixor
    //   4410: goto -> 4421
    //   4413: ldc2_w 261808427
    //   4416: l2i
    //   4417: ldc_w 767010879
    //   4420: ixor
    //   4421: ldc2_w -879611839
    //   4424: l2i
    //   4425: ldc_w 661083408
    //   4428: ixor
    //   4429: ixor
    //   4430: lookupswitch default -> 31000, -824693691 -> 4456, 1570195153 -> 4413
    //   4456: invokestatic valueOf : (D)Ljava/lang/Double;
    //   4459: ldc2_w 0.15527310144526324
    //   4462: invokestatic doubleToLongBits : (D)J
    //   4465: ldc2_w 9218270290794247270
    //   4468: lxor
    //   4469: invokestatic longBitsToDouble : (J)D
    //   4472: getstatic Perryc.1 : I
    //   4475: ifeq -> 4489
    //   4478: ldc2_w 432215944
    //   4481: l2i
    //   4482: ldc_w 771898335
    //   4485: ixor
    //   4486: goto -> 4497
    //   4489: ldc2_w 355156495
    //   4492: l2i
    //   4493: ldc_w -22069192
    //   4496: ixor
    //   4497: ldc2_w -675918637
    //   4500: l2i
    //   4501: ldc_w 441565488
    //   4504: ixor
    //   4505: ixor
    //   4506: lookupswitch default -> 31164, -98131532 -> 4489, 644059092 -> 4532
    //   4532: invokestatic valueOf : (D)Ljava/lang/Double;
    //   4535: getstatic Perryc.0 : I
    //   4538: ifle -> 4552
    //   4541: ldc2_w 442283631
    //   4544: l2i
    //   4545: ldc_w -1164195453
    //   4548: ixor
    //   4549: goto -> 4560
    //   4552: ldc2_w 410154234
    //   4555: l2i
    //   4556: ldc_w 128088311
    //   4559: ixor
    //   4560: ldc2_w 1724418311
    //   4563: l2i
    //   4564: ldc_w -1609986759
    //   4567: ixor
    //   4568: ixor
    //   4569: lookupswitch default -> 30684, -653195213 -> 4596, 1711700946 -> 4552
    //   4596: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4599: getstatic Perryc.1 : I
    //   4602: ifeq -> 4616
    //   4605: ldc2_w -216498855
    //   4608: l2i
    //   4609: ldc_w 367267499
    //   4612: ixor
    //   4613: goto -> 4624
    //   4616: ldc2_w -339779020
    //   4619: l2i
    //   4620: ldc_w -1927314951
    //   4623: ixor
    //   4624: ldc2_w 1725091813
    //   4627: l2i
    //   4628: ldc_w -459094840
    //   4631: ixor
    //   4632: ixor
    //   4633: lookupswitch default -> 30760, -456070944 -> 4660, 1686927583 -> 4616
    //   4660: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4663: getstatic Perryc.c : I
    //   4666: iflt -> 4680
    //   4669: ldc2_w -976620705
    //   4672: l2i
    //   4673: ldc_w 411728860
    //   4676: ixor
    //   4677: goto -> 4688
    //   4680: ldc2_w -1051057233
    //   4683: l2i
    //   4684: ldc_w -1273420040
    //   4687: ixor
    //   4688: ldc2_w -1893615071
    //   4691: l2i
    //   4692: ldc_w 330003804
    //   4695: ixor
    //   4696: ixor
    //   4697: lookupswitch default -> 30798, -372651478 -> 4724, 1103710206 -> 4680
    //   4724: putfield targetRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4727: getstatic Perryc.1 : I
    //   4730: ifeq -> 4744
    //   4733: ldc2_w 1549936447
    //   4736: l2i
    //   4737: ldc_w 1725359538
    //   4740: ixor
    //   4741: goto -> 4752
    //   4744: ldc2_w 1358676929
    //   4747: l2i
    //   4748: ldc_w -2035267486
    //   4751: ixor
    //   4752: ldc2_w -318342558
    //   4755: l2i
    //   4756: ldc_w -1104167510
    //   4759: ixor
    //   4760: ixor
    //   4761: lookupswitch default -> 4788, -2067747083 -> 4744, 1771898181 -> 31006
    //   4788: aload_0
    //   4789: getstatic Perryc.0 : I
    //   4792: ifle -> 4806
    //   4795: ldc2_w 1688958788
    //   4798: l2i
    //   4799: ldc_w 2033197969
    //   4802: ixor
    //   4803: goto -> 4814
    //   4806: ldc2_w -150619784
    //   4809: l2i
    //   4810: ldc_w -1488880724
    //   4813: ixor
    //   4814: ldc2_w 1496857185
    //   4817: l2i
    //   4818: ldc_w -686330611
    //   4821: ixor
    //   4822: ixor
    //   4823: lookupswitch default -> 31366, -1816919111 -> 4806, -563374664 -> 4848
    //   4848: aload_0
    //   4849: new bigname/zprestige/webhack/features/setting/Setting
    //   4852: dup
    //   4853: ldc_w '贼㌟赧㶴㩮揰๝蹯暔㗎'
    //   4856: getstatic Perryc.0 : I
    //   4859: ifle -> 4873
    //   4862: ldc2_w -2060446660
    //   4865: l2i
    //   4866: ldc_w -1634041665
    //   4869: ixor
    //   4870: goto -> 4881
    //   4873: ldc2_w -871849478
    //   4876: l2i
    //   4877: ldc_w 1549424849
    //   4880: ixor
    //   4881: ldc2_w 578596349
    //   4884: l2i
    //   4885: ldc_w -318903425
    //   4888: ixor
    //   4889: ixor
    //   4890: lookupswitch default -> 31316, -718548479 -> 4873, 1590935465 -> 4916
    //   4916: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4919: ldc2_w -357038575
    //   4922: l2i
    //   4923: ldc_w -357038575
    //   4926: ixor
    //   4927: getstatic Perryc.1 : I
    //   4930: ifeq -> 4944
    //   4933: ldc2_w -1485381492
    //   4936: l2i
    //   4937: ldc_w 1156046330
    //   4940: ixor
    //   4941: goto -> 4952
    //   4944: ldc2_w -1608004829
    //   4947: l2i
    //   4948: ldc_w 1949008356
    //   4951: ixor
    //   4952: ldc2_w 363529834
    //   4955: l2i
    //   4956: ldc_w 959420471
    //   4959: ixor
    //   4960: ixor
    //   4961: lookupswitch default -> 31202, -820665557 -> 4944, -125250406 -> 4988
    //   4988: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4991: ldc2_w 651692981
    //   4994: l2i
    //   4995: ldc_w 651692981
    //   4998: ixor
    //   4999: getstatic Perryc.1 : I
    //   5002: ifeq -> 5016
    //   5005: ldc2_w -814516591
    //   5008: l2i
    //   5009: ldc_w -2005112995
    //   5012: ixor
    //   5013: goto -> 5024
    //   5016: ldc2_w 1614712053
    //   5019: l2i
    //   5020: ldc_w -74242863
    //   5023: ixor
    //   5024: ldc2_w 2074945027
    //   5027: l2i
    //   5028: ldc_w -1884391169
    //   5031: ixor
    //   5032: ixor
    //   5033: lookupswitch default -> 30788, -1291038928 -> 5016, 1873737432 -> 5060
    //   5060: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5063: ldc2_w 1203608486
    //   5066: l2i
    //   5067: ldc_w 1203608492
    //   5070: ixor
    //   5071: getstatic Perryc.0 : I
    //   5074: ifle -> 5088
    //   5077: ldc2_w 1963677172
    //   5080: l2i
    //   5081: ldc_w 1227489620
    //   5084: ixor
    //   5085: goto -> 5096
    //   5088: ldc2_w 1925089788
    //   5091: l2i
    //   5092: ldc_w -1972021158
    //   5095: ixor
    //   5096: ldc2_w -1601068925
    //   5099: l2i
    //   5100: ldc_w -222403320
    //   5103: ixor
    //   5104: ixor
    //   5105: lookupswitch default -> 30986, -1427893203 -> 5132, 1846448427 -> 5088
    //   5132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5135: getstatic Perryc.1 : I
    //   5138: ifeq -> 5152
    //   5141: ldc2_w -1856044565
    //   5144: l2i
    //   5145: ldc_w -460839039
    //   5148: ixor
    //   5149: goto -> 5160
    //   5152: ldc2_w -483178565
    //   5155: l2i
    //   5156: ldc_w -115920380
    //   5159: ixor
    //   5160: ldc2_w 803927132
    //   5163: l2i
    //   5164: ldc_w -43933054
    //   5167: ixor
    //   5168: ixor
    //   5169: lookupswitch default -> 5196, -1487114060 -> 31072, -378005484 -> 5152
    //   5196: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5199: getstatic Perryc.c : I
    //   5202: iflt -> 5216
    //   5205: ldc2_w -668180259
    //   5208: l2i
    //   5209: ldc_w 1112067209
    //   5212: ixor
    //   5213: goto -> 5224
    //   5216: ldc2_w -1502304543
    //   5219: l2i
    //   5220: ldc_w 837030102
    //   5223: ixor
    //   5224: ldc2_w -466000795
    //   5227: l2i
    //   5228: ldc_w 1105730255
    //   5231: ixor
    //   5232: ixor
    //   5233: lookupswitch default -> 31224, 843171997 -> 5260, 1068880638 -> 5216
    //   5260: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5263: getstatic Perryc.0 : I
    //   5266: ifle -> 5280
    //   5269: ldc2_w -279089321
    //   5272: l2i
    //   5273: ldc_w 80964798
    //   5276: ixor
    //   5277: goto -> 5288
    //   5280: ldc2_w 797460629
    //   5283: l2i
    //   5284: ldc_w -425232206
    //   5287: ixor
    //   5288: ldc2_w -518005133
    //   5291: l2i
    //   5292: ldc_w -1672458618
    //   5295: ixor
    //   5296: ixor
    //   5297: lookupswitch default -> 5324, -1765698788 -> 31052, 2142457243 -> 5280
    //   5324: putfield placeDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5327: getstatic Perryc.1 : I
    //   5330: ifeq -> 5344
    //   5333: ldc2_w -985745218
    //   5336: l2i
    //   5337: ldc_w 122518374
    //   5340: ixor
    //   5341: goto -> 5352
    //   5344: ldc2_w 812955580
    //   5347: l2i
    //   5348: ldc_w -2066713261
    //   5351: ixor
    //   5352: ldc2_w -409087943
    //   5355: l2i
    //   5356: ldc_w 1071246100
    //   5359: ixor
    //   5360: ixor
    //   5361: lookupswitch default -> 30706, 439875829 -> 5344, 1826683330 -> 5388
    //   5388: aload_0
    //   5389: getstatic Perryc.0 : I
    //   5392: ifle -> 5406
    //   5395: ldc2_w -158224477
    //   5398: l2i
    //   5399: ldc_w 367650821
    //   5402: ixor
    //   5403: goto -> 5414
    //   5406: ldc2_w -1549193208
    //   5409: l2i
    //   5410: ldc_w -1323313875
    //   5413: ixor
    //   5414: ldc2_w -1406256667
    //   5417: l2i
    //   5418: ldc_w 1755261237
    //   5421: ixor
    //   5422: ixor
    //   5423: lookupswitch default -> 30644, -704121355 -> 5448, 667506550 -> 5406
    //   5448: aload_0
    //   5449: new bigname/zprestige/webhack/features/setting/Setting
    //   5452: dup
    //   5453: ldc_w '贮㌁赣㶶㩠揰๝蹯暔㗎'
    //   5456: getstatic Perryc.c : I
    //   5459: iflt -> 5473
    //   5462: ldc2_w 350500672
    //   5465: l2i
    //   5466: ldc_w -2138149749
    //   5469: ixor
    //   5470: goto -> 5481
    //   5473: ldc2_w -1085846391
    //   5476: l2i
    //   5477: ldc_w -394322603
    //   5480: ixor
    //   5481: ldc2_w -1688119203
    //   5484: l2i
    //   5485: ldc_w -1383637642
    //   5488: ixor
    //   5489: ixor
    //   5490: lookupswitch default -> 5516, -1567858976 -> 31300, 1136829729 -> 5473
    //   5516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5519: ldc2_w -27906320
    //   5522: l2i
    //   5523: ldc_w -27906315
    //   5526: ixor
    //   5527: getstatic Perryc.0 : I
    //   5530: ifle -> 5544
    //   5533: ldc2_w 1376435692
    //   5536: l2i
    //   5537: ldc_w 425999792
    //   5540: ixor
    //   5541: goto -> 5552
    //   5544: ldc2_w -262168598
    //   5547: l2i
    //   5548: ldc_w 1222933442
    //   5551: ixor
    //   5552: ldc2_w -519330795
    //   5555: l2i
    //   5556: ldc_w 1868483627
    //   5559: ixor
    //   5560: ixor
    //   5561: lookupswitch default -> 5588, -985929630 -> 30932, 375942835 -> 5544
    //   5588: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5591: ldc2_w 1742580098
    //   5594: l2i
    //   5595: ldc_w 1742580098
    //   5598: ixor
    //   5599: getstatic Perryc.c : I
    //   5602: iflt -> 5616
    //   5605: ldc2_w 1632728190
    //   5608: l2i
    //   5609: ldc_w -1708489860
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w 1413629900
    //   5619: l2i
    //   5620: ldc_w -2116251096
    //   5623: ixor
    //   5624: ldc2_w 1683488452
    //   5627: l2i
    //   5628: ldc_w -1089543072
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 31278, 247975744 -> 5660, 539159974 -> 5616
    //   5660: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5663: ldc2_w -1317700195
    //   5666: l2i
    //   5667: ldc_w -1317700201
    //   5670: ixor
    //   5671: getstatic Perryc.c : I
    //   5674: iflt -> 5688
    //   5677: ldc2_w -1460510455
    //   5680: l2i
    //   5681: ldc_w -1257137917
    //   5684: ixor
    //   5685: goto -> 5696
    //   5688: ldc2_w -954638853
    //   5691: l2i
    //   5692: ldc_w -2030154372
    //   5695: ixor
    //   5696: ldc2_w 1625466470
    //   5699: l2i
    //   5700: ldc_w -1363796209
    //   5703: ixor
    //   5704: ixor
    //   5705: lookupswitch default -> 31158, -1884050962 -> 5732, -742964893 -> 5688
    //   5732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5735: getstatic Perryc.0 : I
    //   5738: ifle -> 5752
    //   5741: ldc2_w -69836027
    //   5744: l2i
    //   5745: ldc_w -558903466
    //   5748: ixor
    //   5749: goto -> 5760
    //   5752: ldc2_w -256020039
    //   5755: l2i
    //   5756: ldc_w 113134037
    //   5759: ixor
    //   5760: ldc2_w 695045160
    //   5763: l2i
    //   5764: ldc_w 301338243
    //   5767: ixor
    //   5768: ixor
    //   5769: lookupswitch default -> 5796, 501362424 -> 31016, 1259215443 -> 5752
    //   5796: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5799: getstatic Perryc.0 : I
    //   5802: ifle -> 5816
    //   5805: ldc2_w 758845768
    //   5808: l2i
    //   5809: ldc_w 834525840
    //   5812: ixor
    //   5813: goto -> 5824
    //   5816: ldc2_w -1110931915
    //   5819: l2i
    //   5820: ldc_w 1226563614
    //   5823: ixor
    //   5824: ldc2_w 618567478
    //   5827: l2i
    //   5828: ldc_w -1698742877
    //   5831: ixor
    //   5832: ixor
    //   5833: lookupswitch default -> 31098, -1561894579 -> 5816, 1253231806 -> 5860
    //   5860: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5863: getstatic Perryc.c : I
    //   5866: iflt -> 5880
    //   5869: ldc2_w -1504364802
    //   5872: l2i
    //   5873: ldc_w -497368199
    //   5876: ixor
    //   5877: goto -> 5888
    //   5880: ldc2_w -1114150819
    //   5883: l2i
    //   5884: ldc_w -375692644
    //   5887: ixor
    //   5888: ldc2_w -1557125933
    //   5891: l2i
    //   5892: ldc_w 168320885
    //   5895: ixor
    //   5896: ixor
    //   5897: lookupswitch default -> 5924, -315126239 -> 31192, 1081596219 -> 5880
    //   5924: putfield breakDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5927: getstatic Perryc.0 : I
    //   5930: ifle -> 5944
    //   5933: ldc2_w 2056476044
    //   5936: l2i
    //   5937: ldc_w -1391938262
    //   5940: ixor
    //   5941: goto -> 5952
    //   5944: ldc2_w -1228705214
    //   5947: l2i
    //   5948: ldc_w 235871853
    //   5951: ixor
    //   5952: ldc2_w -1624850258
    //   5955: l2i
    //   5956: ldc_w 1773390180
    //   5959: ixor
    //   5960: ixor
    //   5961: lookupswitch default -> 31100, 554625388 -> 5944, 1314481637 -> 5988
    //   5988: aload_0
    //   5989: getstatic Perryc.c : I
    //   5992: iflt -> 6006
    //   5995: ldc2_w -1553599959
    //   5998: l2i
    //   5999: ldc_w 641196062
    //   6002: ixor
    //   6003: goto -> 6014
    //   6006: ldc2_w 1949593685
    //   6009: l2i
    //   6010: ldc_w -1517495589
    //   6013: ixor
    //   6014: ldc2_w 49960446
    //   6017: l2i
    //   6018: ldc_w -2121441147
    //   6021: ixor
    //   6022: ixor
    //   6023: lookupswitch default -> 30946, 103098188 -> 6006, 1389338613 -> 6048
    //   6048: aload_0
    //   6049: new bigname/zprestige/webhack/features/setting/Setting
    //   6052: dup
    //   6053: ldc_w '贤㌣账㶒㩥掵๴踣暥㗛ਦ䃗煤'
    //   6056: getstatic Perryc.0 : I
    //   6059: ifle -> 6073
    //   6062: ldc2_w 1784221477
    //   6065: l2i
    //   6066: ldc_w -901351233
    //   6069: ixor
    //   6070: goto -> 6081
    //   6073: ldc2_w -1540436143
    //   6076: l2i
    //   6077: ldc_w -2004235049
    //   6080: ixor
    //   6081: ldc2_w 898023444
    //   6084: l2i
    //   6085: ldc_w -181898081
    //   6088: ixor
    //   6089: ixor
    //   6090: lookupswitch default -> 31226, -334907635 -> 6116, 1622262545 -> 6073
    //   6116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6119: ldc2_w 332494793
    //   6122: l2i
    //   6123: ldc_w 332494799
    //   6126: ixor
    //   6127: getstatic Perryc.0 : I
    //   6130: ifle -> 6144
    //   6133: ldc2_w -375231075
    //   6136: l2i
    //   6137: ldc_w -523472224
    //   6140: ixor
    //   6141: goto -> 6152
    //   6144: ldc2_w 1775602343
    //   6147: l2i
    //   6148: ldc_w -1595147068
    //   6151: ixor
    //   6152: ldc2_w -84493339
    //   6155: l2i
    //   6156: ldc_w 2053905622
    //   6159: ixor
    //   6160: ixor
    //   6161: lookupswitch default -> 6188, -1980450802 -> 30954, 1503890221 -> 6144
    //   6188: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6191: ldc2_w -870364949
    //   6194: l2i
    //   6195: ldc_w -870364949
    //   6198: ixor
    //   6199: getstatic Perryc.1 : I
    //   6202: ifeq -> 6216
    //   6205: ldc2_w -1496359566
    //   6208: l2i
    //   6209: ldc_w 823055427
    //   6212: ixor
    //   6213: goto -> 6224
    //   6216: ldc2_w 116203396
    //   6219: l2i
    //   6220: ldc_w 1013941943
    //   6223: ixor
    //   6224: ldc2_w 748681301
    //   6227: l2i
    //   6228: ldc_w 1962228800
    //   6231: ixor
    //   6232: ixor
    //   6233: lookupswitch default -> 6260, -1973862681 -> 6216, -810857180 -> 30828
    //   6260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6263: ldc2_w -738803575
    //   6266: l2i
    //   6267: ldc_w -738803539
    //   6270: ixor
    //   6271: getstatic Perryc.c : I
    //   6274: iflt -> 6288
    //   6277: ldc2_w 2141278160
    //   6280: l2i
    //   6281: ldc_w 1292234155
    //   6284: ixor
    //   6285: goto -> 6296
    //   6288: ldc2_w -1465448747
    //   6291: l2i
    //   6292: ldc_w -1926282478
    //   6295: ixor
    //   6296: ldc2_w -1918002419
    //   6299: l2i
    //   6300: ldc_w 1689663199
    //   6303: ixor
    //   6304: ixor
    //   6305: lookupswitch default -> 31068, -862722027 -> 6332, -608235607 -> 6288
    //   6332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6335: getstatic Perryc.1 : I
    //   6338: ifeq -> 6352
    //   6341: ldc2_w -1636038423
    //   6344: l2i
    //   6345: ldc_w 1004788596
    //   6348: ixor
    //   6349: goto -> 6360
    //   6352: ldc2_w -1851763279
    //   6355: l2i
    //   6356: ldc_w -1110479169
    //   6359: ixor
    //   6360: ldc2_w 1116145749
    //   6363: l2i
    //   6364: ldc_w 381150218
    //   6367: ixor
    //   6368: ixor
    //   6369: lookupswitch default -> 31186, -240173118 -> 6352, 2019546961 -> 6396
    //   6396: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   6399: getstatic Perryc.0 : I
    //   6402: ifle -> 6416
    //   6405: ldc2_w 975115714
    //   6408: l2i
    //   6409: ldc_w 327813935
    //   6412: ixor
    //   6413: goto -> 6424
    //   6416: ldc2_w -1418318752
    //   6419: l2i
    //   6420: ldc_w 2133603817
    //   6423: ixor
    //   6424: ldc2_w 24465284
    //   6427: l2i
    //   6428: ldc_w -1237805243
    //   6431: ixor
    //   6432: ixor
    //   6433: lookupswitch default -> 31370, -1629960660 -> 6416, 1662501192 -> 6460
    //   6460: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6463: getstatic Perryc.0 : I
    //   6466: ifle -> 6480
    //   6469: ldc2_w -1242481738
    //   6472: l2i
    //   6473: ldc_w -230013434
    //   6476: ixor
    //   6477: goto -> 6488
    //   6480: ldc2_w 1812854642
    //   6483: l2i
    //   6484: ldc_w 2029143666
    //   6487: ixor
    //   6488: ldc2_w 1455452988
    //   6491: l2i
    //   6492: ldc_w 1365074652
    //   6495: ixor
    //   6496: ixor
    //   6497: lookupswitch default -> 6524, -690842497 -> 6480, 1076259920 -> 30738
    //   6524: putfield minHpPlace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6527: getstatic Perryc.1 : I
    //   6530: ifeq -> 6544
    //   6533: ldc2_w -807001852
    //   6536: l2i
    //   6537: ldc_w -583348883
    //   6540: ixor
    //   6541: goto -> 6552
    //   6544: ldc2_w 1928961930
    //   6547: l2i
    //   6548: ldc_w -1155997065
    //   6551: ixor
    //   6552: ldc2_w 604628144
    //   6555: l2i
    //   6556: ldc_w -2005835903
    //   6559: ixor
    //   6560: ixor
    //   6561: lookupswitch default -> 30696, -1096525992 -> 6544, 1704576716 -> 6588
    //   6588: aload_0
    //   6589: getstatic Perryc.1 : I
    //   6592: ifeq -> 6606
    //   6595: ldc2_w -1119335700
    //   6598: l2i
    //   6599: ldc_w -124042832
    //   6602: ixor
    //   6603: goto -> 6614
    //   6606: ldc2_w -548668365
    //   6609: l2i
    //   6610: ldc_w 1924813169
    //   6613: ixor
    //   6614: ldc2_w -1320290397
    //   6617: l2i
    //   6618: ldc_w 1800745781
    //   6621: ixor
    //   6622: ixor
    //   6623: lookupswitch default -> 6648, -1614032950 -> 30854, -298914758 -> 6606
    //   6648: aload_0
    //   6649: new bigname/zprestige/webhack/features/setting/Setting
    //   6652: dup
    //   6653: ldc_w '贤㌣账㶒㩥掵๴踣暷㗅ਢ䃕煪'
    //   6656: getstatic Perryc.0 : I
    //   6659: ifle -> 6673
    //   6662: ldc2_w -1212238970
    //   6665: l2i
    //   6666: ldc_w -1761266781
    //   6669: ixor
    //   6670: goto -> 6681
    //   6673: ldc2_w 524548432
    //   6676: l2i
    //   6677: ldc_w -598229076
    //   6680: ixor
    //   6681: ldc2_w -1730559106
    //   6684: l2i
    //   6685: ldc_w -1969963851
    //   6688: ixor
    //   6689: ixor
    //   6690: lookupswitch default -> 6716, -724309970 -> 6673, 855048174 -> 30704
    //   6716: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6719: ldc2_w -1428055261
    //   6722: l2i
    //   6723: ldc_w -1428055259
    //   6726: ixor
    //   6727: getstatic Perryc.c : I
    //   6730: iflt -> 6744
    //   6733: ldc2_w 1572646238
    //   6736: l2i
    //   6737: ldc_w -1804904401
    //   6740: ixor
    //   6741: goto -> 6752
    //   6744: ldc2_w 1520436765
    //   6747: l2i
    //   6748: ldc_w -1862585360
    //   6751: ixor
    //   6752: ldc2_w 1412701269
    //   6755: l2i
    //   6756: ldc_w 1825161954
    //   6759: ixor
    //   6760: ixor
    //   6761: lookupswitch default -> 31130, -248894522 -> 6744, -223941798 -> 6788
    //   6788: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6791: ldc2_w -1882543132
    //   6794: l2i
    //   6795: ldc_w -1882543132
    //   6798: ixor
    //   6799: getstatic Perryc.c : I
    //   6802: iflt -> 6816
    //   6805: ldc2_w 2129642695
    //   6808: l2i
    //   6809: ldc_w 1125112784
    //   6812: ixor
    //   6813: goto -> 6824
    //   6816: ldc2_w -229581334
    //   6819: l2i
    //   6820: ldc_w -165191003
    //   6823: ixor
    //   6824: ldc2_w -1668723671
    //   6827: l2i
    //   6828: ldc_w -1355656264
    //   6831: ixor
    //   6832: ixor
    //   6833: lookupswitch default -> 30838, 240844934 -> 6816, 936157406 -> 6860
    //   6860: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6863: ldc2_w -1053474380
    //   6866: l2i
    //   6867: ldc_w -1053474416
    //   6870: ixor
    //   6871: getstatic Perryc.1 : I
    //   6874: ifeq -> 6888
    //   6877: ldc2_w -1477619982
    //   6880: l2i
    //   6881: ldc_w 1036927077
    //   6884: ixor
    //   6885: goto -> 6896
    //   6888: ldc2_w 1009608073
    //   6891: l2i
    //   6892: ldc_w 198492669
    //   6895: ixor
    //   6896: ldc2_w -1027790573
    //   6899: l2i
    //   6900: ldc_w -305281694
    //   6903: ixor
    //   6904: ixor
    //   6905: lookupswitch default -> 6932, -1252793626 -> 30800, 320150217 -> 6888
    //   6932: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6935: getstatic Perryc.c : I
    //   6938: iflt -> 6952
    //   6941: ldc2_w -264710235
    //   6944: l2i
    //   6945: ldc_w 1088837422
    //   6948: ixor
    //   6949: goto -> 6960
    //   6952: ldc2_w 1909687972
    //   6955: l2i
    //   6956: ldc_w -1561899962
    //   6959: ixor
    //   6960: ldc2_w -932223476
    //   6963: l2i
    //   6964: ldc_w -1303017526
    //   6967: ixor
    //   6968: ixor
    //   6969: lookupswitch default -> 30878, -1458689244 -> 6996, -891002547 -> 6952
    //   6996: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   6999: getstatic Perryc.1 : I
    //   7002: ifeq -> 7016
    //   7005: ldc2_w 762619580
    //   7008: l2i
    //   7009: ldc_w 248885209
    //   7012: ixor
    //   7013: goto -> 7024
    //   7016: ldc2_w 1453551034
    //   7019: l2i
    //   7020: ldc_w -2005584967
    //   7023: ixor
    //   7024: ldc2_w -1553445409
    //   7027: l2i
    //   7028: ldc_w -1240186626
    //   7031: ixor
    //   7032: ixor
    //   7033: lookupswitch default -> 7060, -1526965205 -> 7016, 920454212 -> 31082
    //   7060: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7063: getstatic Perryc.0 : I
    //   7066: ifle -> 7080
    //   7069: ldc2_w 515304301
    //   7072: l2i
    //   7073: ldc_w -1344964165
    //   7076: ixor
    //   7077: goto -> 7088
    //   7080: ldc2_w 1435002418
    //   7083: l2i
    //   7084: ldc_w -696562152
    //   7087: ixor
    //   7088: ldc2_w 1079715465
    //   7091: l2i
    //   7092: ldc_w -991360319
    //   7095: ixor
    //   7096: ixor
    //   7097: lookupswitch default -> 7124, 902938270 -> 31062, 2088123365 -> 7080
    //   7124: putfield minHpBreak : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7127: getstatic Perryc.0 : I
    //   7130: ifle -> 7144
    //   7133: ldc2_w 1452494791
    //   7136: l2i
    //   7137: ldc_w 791814785
    //   7140: ixor
    //   7141: goto -> 7152
    //   7144: ldc2_w -1804744087
    //   7147: l2i
    //   7148: ldc_w -1839429506
    //   7151: ixor
    //   7152: ldc2_w -959964947
    //   7155: l2i
    //   7156: ldc_w 601015147
    //   7159: ixor
    //   7160: ixor
    //   7161: lookupswitch default -> 7188, -2076274797 -> 7144, -1665419584 -> 30616
    //   7188: aload_0
    //   7189: getstatic Perryc.1 : I
    //   7192: ifeq -> 7206
    //   7195: ldc2_w 637856016
    //   7198: l2i
    //   7199: ldc_w 442135275
    //   7202: ixor
    //   7203: goto -> 7214
    //   7206: ldc2_w -162592372
    //   7209: l2i
    //   7210: ldc_w 963686801
    //   7213: ixor
    //   7214: ldc2_w 559705533
    //   7217: l2i
    //   7218: ldc_w -7544622
    //   7221: ixor
    //   7222: ixor
    //   7223: lookupswitch default -> 31122, -494004588 -> 7206, 300889458 -> 7248
    //   7248: aload_0
    //   7249: new bigname/zprestige/webhack/features/setting/Setting
    //   7252: dup
    //   7253: ldc_w '败㌔赨㶸㩹掵ู蹦暙㗑੧䃰煠ၨ辘唄'
    //   7256: getstatic Perryc.1 : I
    //   7259: ifeq -> 7273
    //   7262: ldc2_w -456600109
    //   7265: l2i
    //   7266: ldc_w 1519790435
    //   7269: ixor
    //   7270: goto -> 7281
    //   7273: ldc2_w -292544935
    //   7276: l2i
    //   7277: ldc_w 2145426218
    //   7280: ixor
    //   7281: ldc2_w 232970034
    //   7284: l2i
    //   7285: ldc_w 11853957
    //   7288: ixor
    //   7289: ixor
    //   7290: lookupswitch default -> 30464, -1675185468 -> 7316, -1291269369 -> 7273
    //   7316: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7319: ldc2_w -1284273610
    //   7322: l2i
    //   7323: ldc_w -1284273610
    //   7326: ixor
    //   7327: getstatic Perryc.1 : I
    //   7330: ifeq -> 7344
    //   7333: ldc2_w -855857380
    //   7336: l2i
    //   7337: ldc_w 239968166
    //   7340: ixor
    //   7341: goto -> 7352
    //   7344: ldc2_w -1964618966
    //   7347: l2i
    //   7348: ldc_w 2032921430
    //   7351: ixor
    //   7352: ldc2_w -841705986
    //   7355: l2i
    //   7356: ldc_w 313471888
    //   7359: ixor
    //   7360: ixor
    //   7361: lookupswitch default -> 7388, -1391395256 -> 7344, 499818196 -> 31266
    //   7388: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7391: getstatic Perryc.1 : I
    //   7394: ifeq -> 7408
    //   7397: ldc2_w 1471539685
    //   7400: l2i
    //   7401: ldc_w 975609858
    //   7404: ixor
    //   7405: goto -> 7416
    //   7408: ldc2_w 729108973
    //   7411: l2i
    //   7412: ldc_w 597218260
    //   7415: ixor
    //   7416: ldc2_w -1065524660
    //   7419: l2i
    //   7420: ldc_w 148911241
    //   7423: ixor
    //   7424: ixor
    //   7425: lookupswitch default -> 7452, -1525801182 -> 31312, 195404670 -> 7408
    //   7452: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   7455: getstatic Perryc.c : I
    //   7458: iflt -> 7472
    //   7461: ldc2_w 1906826723
    //   7464: l2i
    //   7465: ldc_w -624342373
    //   7468: ixor
    //   7469: goto -> 7480
    //   7472: ldc2_w -1603338300
    //   7475: l2i
    //   7476: ldc_w -1682581728
    //   7479: ixor
    //   7480: ldc2_w -183084157
    //   7483: l2i
    //   7484: ldc_w -1172278669
    //   7487: ixor
    //   7488: ixor
    //   7489: lookupswitch default -> 30782, -463946104 -> 7472, 1961689364 -> 7516
    //   7516: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7519: getstatic Perryc.1 : I
    //   7522: ifeq -> 7536
    //   7525: ldc2_w -906088675
    //   7528: l2i
    //   7529: ldc_w -2052453788
    //   7532: ixor
    //   7533: goto -> 7544
    //   7536: ldc2_w -2006377297
    //   7539: l2i
    //   7540: ldc_w 606429138
    //   7543: ixor
    //   7544: ldc2_w -1323620541
    //   7547: l2i
    //   7548: ldc_w 623759727
    //   7551: ixor
    //   7552: ixor
    //   7553: lookupswitch default -> 7580, -664612011 -> 31124, -121232804 -> 7536
    //   7580: putfield ignoreSelfDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7583: getstatic Perryc.c : I
    //   7586: iflt -> 7600
    //   7589: ldc2_w -54936760
    //   7592: l2i
    //   7593: ldc_w 2012319666
    //   7596: ixor
    //   7597: goto -> 7608
    //   7600: ldc2_w 1207722512
    //   7603: l2i
    //   7604: ldc_w -1799026786
    //   7607: ixor
    //   7608: ldc2_w 1335482873
    //   7611: l2i
    //   7612: ldc_w -968020289
    //   7615: ixor
    //   7616: ixor
    //   7617: lookupswitch default -> 7644, 43828156 -> 30994, 1923242821 -> 7600
    //   7644: aload_0
    //   7645: getstatic Perryc.1 : I
    //   7648: ifeq -> 7662
    //   7651: ldc2_w -845074101
    //   7654: l2i
    //   7655: ldc_w 375826227
    //   7658: ixor
    //   7659: goto -> 7670
    //   7662: ldc2_w 496555271
    //   7665: l2i
    //   7666: ldc_w 2073664899
    //   7669: ixor
    //   7670: ldc2_w 1977538402
    //   7673: l2i
    //   7674: ldc_w -1945744863
    //   7677: ixor
    //   7678: ixor
    //   7679: lookupswitch default -> 31308, -1613113913 -> 7704, 572459835 -> 7662
    //   7704: aload_0
    //   7705: new bigname/zprestige/webhack/features/setting/Setting
    //   7708: dup
    //   7709: ldc_w '贡㌒赾㷷㩘掵๵踣暱㗖ਪ䃕煦'
    //   7712: getstatic Perryc.1 : I
    //   7715: ifeq -> 7729
    //   7718: ldc2_w 1467824219
    //   7721: l2i
    //   7722: ldc_w 1043110892
    //   7725: ixor
    //   7726: goto -> 7737
    //   7729: ldc2_w 1039829543
    //   7732: l2i
    //   7733: ldc_w 1904739737
    //   7736: ixor
    //   7737: ldc2_w 1788545381
    //   7740: l2i
    //   7741: ldc_w 2142867155
    //   7744: ixor
    //   7745: ixor
    //   7746: lookupswitch default -> 7772, 2087920641 -> 30786, 2101833873 -> 7729
    //   7772: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7775: ldc2_w 646328842
    //   7778: l2i
    //   7779: ldc_w 646328834
    //   7782: ixor
    //   7783: getstatic Perryc.1 : I
    //   7786: ifeq -> 7800
    //   7789: ldc2_w -2044707327
    //   7792: l2i
    //   7793: ldc_w 545861397
    //   7796: ixor
    //   7797: goto -> 7808
    //   7800: ldc2_w -1847969039
    //   7803: l2i
    //   7804: ldc_w 1713055110
    //   7807: ixor
    //   7808: ldc2_w -2056913120
    //   7811: l2i
    //   7812: ldc_w 2068849220
    //   7815: ixor
    //   7816: ixor
    //   7817: lookupswitch default -> 30726, 167035411 -> 7844, 1486670960 -> 7800
    //   7844: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7847: ldc2_w -1900561526
    //   7850: l2i
    //   7851: ldc_w -1900561526
    //   7854: ixor
    //   7855: getstatic Perryc.c : I
    //   7858: iflt -> 7872
    //   7861: ldc2_w -2025731145
    //   7864: l2i
    //   7865: ldc_w -451171499
    //   7868: ixor
    //   7869: goto -> 7880
    //   7872: ldc2_w -2113365577
    //   7875: l2i
    //   7876: ldc_w -1112786019
    //   7879: ixor
    //   7880: ldc2_w 2008534959
    //   7883: l2i
    //   7884: ldc_w 1570084088
    //   7887: ixor
    //   7888: ixor
    //   7889: lookupswitch default -> 30964, 361167229 -> 7916, 1215839157 -> 7872
    //   7916: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7919: ldc2_w -1195737072
    //   7922: l2i
    //   7923: ldc_w -1195737036
    //   7926: ixor
    //   7927: getstatic Perryc.0 : I
    //   7930: ifle -> 7944
    //   7933: ldc2_w 1186845594
    //   7936: l2i
    //   7937: ldc_w -847281233
    //   7940: ixor
    //   7941: goto -> 7952
    //   7944: ldc2_w 95697293
    //   7947: l2i
    //   7948: ldc_w -1104824315
    //   7951: ixor
    //   7952: ldc2_w -575197883
    //   7955: l2i
    //   7956: ldc_w -1206010377
    //   7959: ixor
    //   7960: ixor
    //   7961: lookupswitch default -> 7988, -295124857 -> 30552, 95104990 -> 7944
    //   7988: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7991: getstatic Perryc.1 : I
    //   7994: ifeq -> 8008
    //   7997: ldc2_w 274900430
    //   8000: l2i
    //   8001: ldc_w -1304119722
    //   8004: ixor
    //   8005: goto -> 8016
    //   8008: ldc2_w 1767866300
    //   8011: l2i
    //   8012: ldc_w -307938899
    //   8015: ixor
    //   8016: ldc2_w -207081148
    //   8019: l2i
    //   8020: ldc_w 876210342
    //   8023: ixor
    //   8024: ixor
    //   8025: lookupswitch default -> 8052, -1454714833 -> 8008, 1706543738 -> 30490
    //   8052: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   8055: getstatic Perryc.1 : I
    //   8058: ifeq -> 8072
    //   8061: ldc2_w -854152184
    //   8064: l2i
    //   8065: ldc_w -1843741382
    //   8068: ixor
    //   8069: goto -> 8080
    //   8072: ldc2_w 1817559022
    //   8075: l2i
    //   8076: ldc_w -558451695
    //   8079: ixor
    //   8080: ldc2_w 1844439393
    //   8083: l2i
    //   8084: ldc_w -816695219
    //   8087: ixor
    //   8088: ixor
    //   8089: lookupswitch default -> 8116, -380957093 -> 8072, -38682594 -> 31206
    //   8116: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8119: getstatic Perryc.0 : I
    //   8122: ifle -> 8136
    //   8125: ldc2_w -580635248
    //   8128: l2i
    //   8129: ldc_w 1825922564
    //   8132: ixor
    //   8133: goto -> 8144
    //   8136: ldc2_w 1758375840
    //   8139: l2i
    //   8140: ldc_w -1389304273
    //   8143: ixor
    //   8144: ldc2_w -1990372068
    //   8147: l2i
    //   8148: ldc_w 955288416
    //   8151: ixor
    //   8152: ixor
    //   8153: lookupswitch default -> 8180, 1881576 -> 30498, 1240844516 -> 8136
    //   8180: putfield maxSelfDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8183: getstatic Perryc.1 : I
    //   8186: ifeq -> 8200
    //   8189: ldc2_w 714776035
    //   8192: l2i
    //   8193: ldc_w 1025723509
    //   8196: ixor
    //   8197: goto -> 8208
    //   8200: ldc2_w -1833284166
    //   8203: l2i
    //   8204: ldc_w -1943408099
    //   8207: ixor
    //   8208: ldc2_w 237963136
    //   8211: l2i
    //   8212: ldc_w 737009537
    //   8215: ixor
    //   8216: ixor
    //   8217: lookupswitch default -> 8244, -874627965 -> 8200, 846924183 -> 30640
    //   8244: aload_0
    //   8245: getstatic Perryc.0 : I
    //   8248: ifle -> 8262
    //   8251: ldc2_w 666575689
    //   8254: l2i
    //   8255: ldc_w -1852512782
    //   8258: ixor
    //   8259: goto -> 8270
    //   8262: ldc2_w 1135616429
    //   8265: l2i
    //   8266: ldc_w -1301143560
    //   8269: ixor
    //   8270: ldc2_w 910239743
    //   8273: l2i
    //   8274: ldc_w 701514515
    //   8277: ixor
    //   8278: ixor
    //   8279: lookupswitch default -> 31030, -1447124393 -> 8262, -296527175 -> 8304
    //   8304: aload_0
    //   8305: new bigname/zprestige/webhack/features/setting/Setting
    //   8308: dup
    //   8309: ldc_w '购㌝赲㶾㨫掃๬蹠暜㗓ਢ'
    //   8312: getstatic Perryc.1 : I
    //   8315: ifeq -> 8329
    //   8318: ldc2_w -471732581
    //   8321: l2i
    //   8322: ldc_w 1636265231
    //   8325: ixor
    //   8326: goto -> 8337
    //   8329: ldc2_w 1667923804
    //   8332: l2i
    //   8333: ldc_w 1193151498
    //   8336: ixor
    //   8337: ldc2_w -1189405961
    //   8340: l2i
    //   8341: ldc_w -1288430623
    //   8344: ixor
    //   8345: ixor
    //   8346: lookupswitch default -> 31302, -2008448382 -> 8329, 777744960 -> 8372
    //   8372: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8375: ldc2_w 292999711
    //   8378: l2i
    //   8379: ldc_w 292999710
    //   8382: ixor
    //   8383: getstatic Perryc.1 : I
    //   8386: ifeq -> 8400
    //   8389: ldc2_w 1740391785
    //   8392: l2i
    //   8393: ldc_w -471231146
    //   8396: ixor
    //   8397: goto -> 8408
    //   8400: ldc2_w -1181737210
    //   8403: l2i
    //   8404: ldc_w -741685585
    //   8407: ixor
    //   8408: ldc2_w -1712842276
    //   8411: l2i
    //   8412: ldc_w 252780215
    //   8415: ixor
    //   8416: ixor
    //   8417: lookupswitch default -> 8444, -851885452 -> 8400, 313317204 -> 31180
    //   8444: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8447: getstatic Perryc.c : I
    //   8450: iflt -> 8464
    //   8453: ldc2_w -1072503500
    //   8456: l2i
    //   8457: ldc_w -1240250063
    //   8460: ixor
    //   8461: goto -> 8472
    //   8464: ldc2_w -2053986685
    //   8467: l2i
    //   8468: ldc_w 1536563586
    //   8471: ixor
    //   8472: ldc2_w -1462343545
    //   8475: l2i
    //   8476: ldc_w 588530064
    //   8479: ixor
    //   8480: ixor
    //   8481: lookupswitch default -> 30646, -37518062 -> 8464, 1439077910 -> 8508
    //   8508: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   8511: getstatic Perryc.1 : I
    //   8514: ifeq -> 8528
    //   8517: ldc2_w -989489294
    //   8520: l2i
    //   8521: ldc_w -1633171575
    //   8524: ixor
    //   8525: goto -> 8536
    //   8528: ldc2_w 300610894
    //   8531: l2i
    //   8532: ldc_w -1791255640
    //   8535: ixor
    //   8536: ldc2_w -496435059
    //   8539: l2i
    //   8540: ldc_w -654441056
    //   8543: ixor
    //   8544: ixor
    //   8545: lookupswitch default -> 8572, 62786567 -> 8528, 1630885334 -> 31028
    //   8572: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8575: getstatic Perryc.c : I
    //   8578: iflt -> 8592
    //   8581: ldc2_w -1081885160
    //   8584: l2i
    //   8585: ldc_w 1085872611
    //   8588: ixor
    //   8589: goto -> 8600
    //   8592: ldc2_w -1581776797
    //   8595: l2i
    //   8596: ldc_w 184478952
    //   8599: ixor
    //   8600: ldc2_w -950389822
    //   8603: l2i
    //   8604: ldc_w 2096747027
    //   8607: ixor
    //   8608: ixor
    //   8609: lookupswitch default -> 8636, 989020091 -> 8592, 1150895658 -> 30608
    //   8636: putfield antiSuicide : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8639: getstatic Perryc.1 : I
    //   8642: ifeq -> 8656
    //   8645: ldc2_w 1517875930
    //   8648: l2i
    //   8649: ldc_w 856415106
    //   8652: ixor
    //   8653: goto -> 8664
    //   8656: ldc2_w 2015728406
    //   8659: l2i
    //   8660: ldc_w 611453312
    //   8663: ixor
    //   8664: ldc2_w 363625166
    //   8667: l2i
    //   8668: ldc_w 1620565366
    //   8671: ixor
    //   8672: ixor
    //   8673: lookupswitch default -> 31242, 474517216 -> 8656, 694959406 -> 8700
    //   8700: aload_0
    //   8701: getstatic Perryc.1 : I
    //   8704: ifeq -> 8718
    //   8707: ldc2_w 179737281
    //   8710: l2i
    //   8711: ldc_w -464709525
    //   8714: ixor
    //   8715: goto -> 8726
    //   8718: ldc2_w -1876631594
    //   8721: l2i
    //   8722: ldc_w -1128984940
    //   8725: ixor
    //   8726: ldc2_w 1908123305
    //   8729: l2i
    //   8730: ldc_w 896287651
    //   8733: ixor
    //   8734: ixor
    //   8735: lookupswitch default -> 31292, -1439928416 -> 8718, 1749431368 -> 8760
    //   8760: aload_0
    //   8761: new bigname/zprestige/webhack/features/setting/Setting
    //   8764: dup
    //   8765: ldc_w '贾㌜赲㶶㩿掵'
    //   8768: getstatic Perryc.1 : I
    //   8771: ifeq -> 8785
    //   8774: ldc2_w 44178651
    //   8777: l2i
    //   8778: ldc_w -517161518
    //   8781: ixor
    //   8782: goto -> 8793
    //   8785: ldc2_w -1528430665
    //   8788: l2i
    //   8789: ldc_w -457355908
    //   8792: ixor
    //   8793: ldc2_w -1448297396
    //   8796: l2i
    //   8797: ldc_w 1267313079
    //   8800: ixor
    //   8801: ixor
    //   8802: lookupswitch default -> 8828, 28030194 -> 31118, 736944375 -> 8785
    //   8828: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8831: getstatic Perryc.0 : I
    //   8834: ifle -> 8848
    //   8837: ldc2_w -299912679
    //   8840: l2i
    //   8841: ldc_w -1524945730
    //   8844: ixor
    //   8845: goto -> 8856
    //   8848: ldc2_w 879308394
    //   8851: l2i
    //   8852: ldc_w -1611655007
    //   8855: ixor
    //   8856: ldc2_w 1097994575
    //   8859: l2i
    //   8860: ldc_w 1525311411
    //   8863: ixor
    //   8864: ixor
    //   8865: lookupswitch default -> 30538, -1342095305 -> 8892, 1352460379 -> 8848
    //   8892: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$RotateMode.Off : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$RotateMode;
    //   8895: getstatic Perryc.1 : I
    //   8898: ifeq -> 8912
    //   8901: ldc2_w 1984325037
    //   8904: l2i
    //   8905: ldc_w -1102205561
    //   8908: ixor
    //   8909: goto -> 8920
    //   8912: ldc2_w -304175742
    //   8915: l2i
    //   8916: ldc_w -700220996
    //   8919: ixor
    //   8920: ldc2_w 278419274
    //   8923: l2i
    //   8924: ldc_w 47035563
    //   8927: ixor
    //   8928: ixor
    //   8929: lookupswitch default -> 8956, -631362613 -> 30642, -72023304 -> 8912
    //   8956: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   8959: getstatic Perryc.0 : I
    //   8962: ifle -> 8976
    //   8965: ldc2_w -1577304825
    //   8968: l2i
    //   8969: ldc_w -823414737
    //   8972: ixor
    //   8973: goto -> 8984
    //   8976: ldc2_w 1319105619
    //   8979: l2i
    //   8980: ldc_w 1722574221
    //   8983: ixor
    //   8984: ldc2_w 1437277742
    //   8987: l2i
    //   8988: ldc_w 1538828121
    //   8991: ixor
    //   8992: ixor
    //   8993: lookupswitch default -> 31014, 639641769 -> 9020, 1627665503 -> 8976
    //   9020: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9023: getstatic Perryc.1 : I
    //   9026: ifeq -> 9040
    //   9029: ldc2_w -928222103
    //   9032: l2i
    //   9033: ldc_w 1382979540
    //   9036: ixor
    //   9037: goto -> 9048
    //   9040: ldc2_w -259087268
    //   9043: l2i
    //   9044: ldc_w -1253741727
    //   9047: ixor
    //   9048: ldc2_w 394287522
    //   9051: l2i
    //   9052: ldc_w -1467463991
    //   9055: ixor
    //   9056: ixor
    //   9057: lookupswitch default -> 9084, -1881902856 -> 9040, 634059990 -> 31056
    //   9084: putfield rotateMode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9087: getstatic Perryc.c : I
    //   9090: iflt -> 9104
    //   9093: ldc2_w -382320846
    //   9096: l2i
    //   9097: ldc_w 1281877845
    //   9100: ixor
    //   9101: goto -> 9112
    //   9104: ldc2_w 1831948830
    //   9107: l2i
    //   9108: ldc_w 1574214128
    //   9111: ixor
    //   9112: ldc2_w -1292738035
    //   9115: l2i
    //   9116: ldc_w -1491145649
    //   9119: ixor
    //   9120: ixor
    //   9121: lookupswitch default -> 30576, -1329768923 -> 9104, 621364652 -> 9148
    //   9148: aload_0
    //   9149: getstatic Perryc.0 : I
    //   9152: ifle -> 9166
    //   9155: ldc2_w 22689096
    //   9158: l2i
    //   9159: ldc_w -965568205
    //   9162: ixor
    //   9163: goto -> 9174
    //   9166: ldc2_w 1660464623
    //   9169: l2i
    //   9170: ldc_w 906797714
    //   9173: ixor
    //   9174: ldc2_w 1464132062
    //   9177: l2i
    //   9178: ldc_w 40709678
    //   9181: ixor
    //   9182: ixor
    //   9183: lookupswitch default -> 9208, -1845402741 -> 30784, -479028789 -> 9166
    //   9208: aload_0
    //   9209: new bigname/zprestige/webhack/features/setting/Setting
    //   9212: dup
    //   9213: ldc_w '贾㌒赿㶃㩹掱๺'
    //   9216: getstatic Perryc.0 : I
    //   9219: ifle -> 9233
    //   9222: ldc2_w -1329898173
    //   9225: l2i
    //   9226: ldc_w 1317599243
    //   9229: ixor
    //   9230: goto -> 9241
    //   9233: ldc2_w 566174054
    //   9236: l2i
    //   9237: ldc_w -287303965
    //   9240: ixor
    //   9241: ldc2_w -2111982226
    //   9244: l2i
    //   9245: ldc_w -428321176
    //   9248: ixor
    //   9249: ixor
    //   9250: lookupswitch default -> 30600, -1705621938 -> 9233, -1422207869 -> 9276
    //   9276: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9279: ldc2_w -1037928564
    //   9282: l2i
    //   9283: ldc_w -1037928564
    //   9286: ixor
    //   9287: getstatic Perryc.c : I
    //   9290: iflt -> 9304
    //   9293: ldc2_w -1846080250
    //   9296: l2i
    //   9297: ldc_w -1952131752
    //   9300: ixor
    //   9301: goto -> 9312
    //   9304: ldc2_w 236431845
    //   9307: l2i
    //   9308: ldc_w 1127522691
    //   9311: ixor
    //   9312: ldc2_w -181661355
    //   9315: l2i
    //   9316: ldc_w -1012048946
    //   9319: ixor
    //   9320: ixor
    //   9321: lookupswitch default -> 31018, 751997637 -> 9304, 2074231549 -> 9348
    //   9348: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9351: getstatic Perryc.0 : I
    //   9354: ifle -> 9368
    //   9357: ldc2_w 1062592707
    //   9360: l2i
    //   9361: ldc_w -1821804017
    //   9364: ixor
    //   9365: goto -> 9376
    //   9368: ldc2_w 152154918
    //   9371: l2i
    //   9372: ldc_w -83246803
    //   9375: ixor
    //   9376: ldc2_w -904285514
    //   9379: l2i
    //   9380: ldc_w 1938808215
    //   9383: ixor
    //   9384: ixor
    //   9385: lookupswitch default -> 9412, 363525613 -> 31022, 1040052011 -> 9368
    //   9412: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   9415: getstatic Perryc.0 : I
    //   9418: ifle -> 9432
    //   9421: ldc2_w 71760987
    //   9424: l2i
    //   9425: ldc_w 424976569
    //   9428: ixor
    //   9429: goto -> 9440
    //   9432: ldc2_w -1071688817
    //   9435: l2i
    //   9436: ldc_w 1886678566
    //   9439: ixor
    //   9440: ldc2_w -49546089
    //   9443: l2i
    //   9444: ldc_w 2026062479
    //   9447: ixor
    //   9448: ixor
    //   9449: lookupswitch default -> 9476, -1730485510 -> 30594, -497806882 -> 9432
    //   9476: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9479: getstatic Perryc.0 : I
    //   9482: ifle -> 9496
    //   9485: ldc2_w 1897196992
    //   9488: l2i
    //   9489: ldc_w 1659409842
    //   9492: ixor
    //   9493: goto -> 9504
    //   9496: ldc2_w 271109391
    //   9499: l2i
    //   9500: ldc_w 357273188
    //   9503: ixor
    //   9504: ldc2_w 227406243
    //   9507: l2i
    //   9508: ldc_w 1349712269
    //   9511: ixor
    //   9512: ixor
    //   9513: lookupswitch default -> 31356, 1308848220 -> 9496, 1486637893 -> 9540
    //   9540: putfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9543: getstatic Perryc.0 : I
    //   9546: ifle -> 9560
    //   9549: ldc2_w 918220254
    //   9552: l2i
    //   9553: ldc_w 702714966
    //   9556: ixor
    //   9557: goto -> 9568
    //   9560: ldc2_w -266217665
    //   9563: l2i
    //   9564: ldc_w 774076145
    //   9567: ixor
    //   9568: ldc2_w 1754625161
    //   9571: l2i
    //   9572: ldc_w -234628336
    //   9575: ixor
    //   9576: ixor
    //   9577: lookupswitch default -> 9604, -2050042351 -> 31350, -745033546 -> 9560
    //   9604: aload_0
    //   9605: getstatic Perryc.0 : I
    //   9608: ifle -> 9622
    //   9611: ldc2_w -1647859366
    //   9614: l2i
    //   9615: ldc_w 2036342411
    //   9618: ixor
    //   9619: goto -> 9630
    //   9622: ldc2_w -1425480770
    //   9625: l2i
    //   9626: ldc_w -1842017826
    //   9629: ixor
    //   9630: ldc2_w 1269850997
    //   9633: l2i
    //   9634: ldc_w -1793019916
    //   9637: ixor
    //   9638: ixor
    //   9639: lookupswitch default -> 31304, -408082719 -> 9664, 976714576 -> 9622
    //   9664: aload_0
    //   9665: new bigname/zprestige/webhack/features/setting/Setting
    //   9668: dup
    //   9669: ldc_w '贿㌄赯㶹㩬'
    //   9672: getstatic Perryc.1 : I
    //   9675: ifeq -> 9689
    //   9678: ldc2_w -1614243133
    //   9681: l2i
    //   9682: ldc_w -1951685387
    //   9685: ixor
    //   9686: goto -> 9697
    //   9689: ldc2_w 508660464
    //   9692: l2i
    //   9693: ldc_w 1333294168
    //   9696: ixor
    //   9697: ldc2_w -65373084
    //   9700: l2i
    //   9701: ldc_w -621533727
    //   9704: ixor
    //   9705: ixor
    //   9706: lookupswitch default -> 9732, 571205800 -> 9689, 848127923 -> 30914
    //   9732: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9735: getstatic Perryc.c : I
    //   9738: iflt -> 9752
    //   9741: ldc2_w -1369522669
    //   9744: l2i
    //   9745: ldc_w -1339302638
    //   9748: ixor
    //   9749: goto -> 9760
    //   9752: ldc2_w 2103245361
    //   9755: l2i
    //   9756: ldc_w 1391832937
    //   9759: ixor
    //   9760: ldc2_w 1770354313
    //   9763: l2i
    //   9764: ldc_w -418731056
    //   9767: ixor
    //   9768: ixor
    //   9769: lookupswitch default -> 9796, -1862615464 -> 31106, 1242450964 -> 9752
    //   9796: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$Swing.None : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$Swing;
    //   9799: getstatic Perryc.0 : I
    //   9802: ifle -> 9816
    //   9805: ldc2_w -1397434854
    //   9808: l2i
    //   9809: ldc_w 1577088172
    //   9812: ixor
    //   9813: goto -> 9824
    //   9816: ldc2_w -766496393
    //   9819: l2i
    //   9820: ldc_w -492790786
    //   9823: ixor
    //   9824: ldc2_w -1043035732
    //   9827: l2i
    //   9828: ldc_w 1067727527
    //   9831: ixor
    //   9832: ixor
    //   9833: lookupswitch default -> 30922, -830465662 -> 9860, 214176189 -> 9816
    //   9860: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   9863: getstatic Perryc.c : I
    //   9866: iflt -> 9880
    //   9869: ldc2_w 1460238819
    //   9872: l2i
    //   9873: ldc_w 1274137228
    //   9876: ixor
    //   9877: goto -> 9888
    //   9880: ldc2_w -1340188540
    //   9883: l2i
    //   9884: ldc_w 181886248
    //   9887: ixor
    //   9888: ldc2_w 1677252351
    //   9891: l2i
    //   9892: ldc_w 1315523246
    //   9895: ixor
    //   9896: ixor
    //   9897: lookupswitch default -> 9924, -1817848425 -> 9880, 828976958 -> 30692
    //   9924: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9927: getstatic Perryc.0 : I
    //   9930: ifle -> 9944
    //   9933: ldc2_w 97234622
    //   9936: l2i
    //   9937: ldc_w -675982948
    //   9940: ixor
    //   9941: goto -> 9952
    //   9944: ldc2_w -460075124
    //   9947: l2i
    //   9948: ldc_w 1331157391
    //   9951: ixor
    //   9952: ldc2_w 632855228
    //   9955: l2i
    //   9956: ldc_w -1602587777
    //   9959: ixor
    //   9960: ixor
    //   9961: lookupswitch default -> 31258, 772210624 -> 9988, 1471944417 -> 9944
    //   9988: putfield swing : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9991: getstatic Perryc.0 : I
    //   9994: ifle -> 10008
    //   9997: ldc2_w 816701844
    //   10000: l2i
    //   10001: ldc_w -1715204698
    //   10004: ixor
    //   10005: goto -> 10016
    //   10008: ldc2_w 1990314981
    //   10011: l2i
    //   10012: ldc_w 160085767
    //   10015: ixor
    //   10016: ldc2_w 1176089379
    //   10019: l2i
    //   10020: ldc_w 1125821456
    //   10023: ixor
    //   10024: ixor
    //   10025: lookupswitch default -> 10052, -1402277119 -> 31386, 104345062 -> 10008
    //   10052: aload_0
    //   10053: getstatic Perryc.0 : I
    //   10056: ifle -> 10070
    //   10059: ldc2_w 323016898
    //   10062: l2i
    //   10063: ldc_w 1604118086
    //   10066: ixor
    //   10067: goto -> 10078
    //   10070: ldc2_w -1230614119
    //   10073: l2i
    //   10074: ldc_w -426445105
    //   10077: ixor
    //   10078: ldc2_w 1417569233
    //   10081: l2i
    //   10082: ldc_w 728227599
    //   10085: ixor
    //   10086: ixor
    //   10087: lookupswitch default -> 10112, -1109076938 -> 10070, 868581978 -> 31248
    //   10112: aload_0
    //   10113: new bigname/zprestige/webhack/features/setting/Setting
    //   10116: dup
    //   10117: ldc_w '贼㌟赧㶴㩮揰๊蹪暛㗐'
    //   10120: getstatic Perryc.0 : I
    //   10123: ifle -> 10137
    //   10126: ldc2_w 763698418
    //   10129: l2i
    //   10130: ldc_w 631947305
    //   10133: ixor
    //   10134: goto -> 10145
    //   10137: ldc2_w 1518617350
    //   10140: l2i
    //   10141: ldc_w 795121259
    //   10144: ixor
    //   10145: ldc2_w 5438025
    //   10148: l2i
    //   10149: ldc_w -1306681739
    //   10152: ixor
    //   10153: ixor
    //   10154: lookupswitch default -> 10180, -1243049656 -> 10137, -1168066329 -> 30670
    //   10180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10183: ldc2_w -1592816954
    //   10186: l2i
    //   10187: ldc_w -1592816954
    //   10190: ixor
    //   10191: getstatic Perryc.0 : I
    //   10194: ifle -> 10208
    //   10197: ldc2_w -605349963
    //   10200: l2i
    //   10201: ldc_w 1616674700
    //   10204: ixor
    //   10205: goto -> 10216
    //   10208: ldc2_w -1223079756
    //   10211: l2i
    //   10212: ldc_w -202469104
    //   10215: ixor
    //   10216: ldc2_w -1938042736
    //   10219: l2i
    //   10220: ldc_w 1171217326
    //   10223: ixor
    //   10224: ixor
    //   10225: lookupswitch default -> 31234, -1924967782 -> 10252, 1912857351 -> 10208
    //   10252: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   10255: getstatic Perryc.1 : I
    //   10258: ifeq -> 10272
    //   10261: ldc2_w -1488777683
    //   10264: l2i
    //   10265: ldc_w 1239738564
    //   10268: ixor
    //   10269: goto -> 10280
    //   10272: ldc2_w -1335520637
    //   10275: l2i
    //   10276: ldc_w 265551972
    //   10279: ixor
    //   10280: ldc2_w 1631803733
    //   10283: l2i
    //   10284: ldc_w -415948758
    //   10287: ixor
    //   10288: ixor
    //   10289: lookupswitch default -> 10316, -479134154 -> 10272, 1758568342 -> 31188
    //   10316: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   10319: getstatic Perryc.1 : I
    //   10322: ifeq -> 10336
    //   10325: ldc2_w 580428113
    //   10328: l2i
    //   10329: ldc_w 142502970
    //   10332: ixor
    //   10333: goto -> 10344
    //   10336: ldc2_w -1942465834
    //   10339: l2i
    //   10340: ldc_w 2088939588
    //   10343: ixor
    //   10344: ldc2_w -554623915
    //   10347: l2i
    //   10348: ldc_w -1861153276
    //   10351: ixor
    //   10352: ixor
    //   10353: lookupswitch default -> 10380, 1259704435 -> 10336, 1694949178 -> 31352
    //   10380: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10383: getstatic Perryc.c : I
    //   10386: iflt -> 10400
    //   10389: ldc2_w -1511884927
    //   10392: l2i
    //   10393: ldc_w -1860595325
    //   10396: ixor
    //   10397: goto -> 10408
    //   10400: ldc2_w -62538
    //   10403: l2i
    //   10404: ldc_w 1269135408
    //   10407: ixor
    //   10408: ldc2_w 896588391
    //   10411: l2i
    //   10412: ldc_w 641616651
    //   10415: ixor
    //   10416: ixor
    //   10417: lookupswitch default -> 10444, 140512662 -> 10400, 666204014 -> 30806
    //   10444: putfield placeSwing : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10447: getstatic Perryc.0 : I
    //   10450: ifle -> 10464
    //   10453: ldc2_w 1533594157
    //   10456: l2i
    //   10457: ldc_w -355421699
    //   10460: ixor
    //   10461: goto -> 10472
    //   10464: ldc2_w 1436458149
    //   10467: l2i
    //   10468: ldc_w -1776479069
    //   10471: ixor
    //   10472: ldc2_w -343981500
    //   10475: l2i
    //   10476: ldc_w -548936902
    //   10479: ixor
    //   10480: ixor
    //   10481: lookupswitch default -> 30808, -2055152978 -> 10464, -138729096 -> 10508
    //   10508: aload_0
    //   10509: getstatic Perryc.0 : I
    //   10512: ifle -> 10526
    //   10515: ldc2_w -36055259
    //   10518: l2i
    //   10519: ldc_w 307203624
    //   10522: ixor
    //   10523: goto -> 10534
    //   10526: ldc2_w -116928368
    //   10529: l2i
    //   10530: ldc_w 1997218241
    //   10533: ixor
    //   10534: ldc2_w -92320424
    //   10537: l2i
    //   10538: ldc_w 1552751343
    //   10541: ixor
    //   10542: ixor
    //   10543: lookupswitch default -> 10568, -845599187 -> 10526, 1231294138 -> 30988
    //   10568: aload_0
    //   10569: new bigname/zprestige/webhack/features/setting/Setting
    //   10572: dup
    //   10573: ldc_w '贿㌄赯㶣㩨掸'
    //   10576: getstatic Perryc.0 : I
    //   10579: ifle -> 10593
    //   10582: ldc2_w -681415325
    //   10585: l2i
    //   10586: ldc_w 427271731
    //   10589: ixor
    //   10590: goto -> 10601
    //   10593: ldc2_w 1668839460
    //   10596: l2i
    //   10597: ldc_w -489798747
    //   10600: ixor
    //   10601: ldc2_w 1664307236
    //   10604: l2i
    //   10605: ldc_w -83303780
    //   10608: ixor
    //   10609: ixor
    //   10610: lookupswitch default -> 30824, 428706105 -> 10636, 1445886440 -> 10593
    //   10636: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10639: getstatic Perryc.1 : I
    //   10642: ifeq -> 10656
    //   10645: ldc2_w 650561408
    //   10648: l2i
    //   10649: ldc_w 1152107192
    //   10652: ixor
    //   10653: goto -> 10664
    //   10656: ldc2_w 160903141
    //   10659: l2i
    //   10660: ldc_w 1601238975
    //   10663: ixor
    //   10664: ldc2_w 1454757749
    //   10667: l2i
    //   10668: ldc_w 799415952
    //   10671: ixor
    //   10672: ixor
    //   10673: lookupswitch default -> 10700, -1634217361 -> 10656, 461294813 -> 30860
    //   10700: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$AutoSwitch.None : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$AutoSwitch;
    //   10703: getstatic Perryc.c : I
    //   10706: iflt -> 10720
    //   10709: ldc2_w -1500664679
    //   10712: l2i
    //   10713: ldc_w 445948084
    //   10716: ixor
    //   10717: goto -> 10728
    //   10720: ldc2_w -636023322
    //   10723: l2i
    //   10724: ldc_w -455085110
    //   10727: ixor
    //   10728: ldc2_w -695356158
    //   10731: l2i
    //   10732: ldc_w -83250086
    //   10735: ixor
    //   10736: ixor
    //   10737: lookupswitch default -> 30702, -1851978379 -> 10720, 323813236 -> 10764
    //   10764: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   10767: getstatic Perryc.1 : I
    //   10770: ifeq -> 10784
    //   10773: ldc2_w -1435642406
    //   10776: l2i
    //   10777: ldc_w 1843780106
    //   10780: ixor
    //   10781: goto -> 10792
    //   10784: ldc2_w 614162971
    //   10787: l2i
    //   10788: ldc_w 1245366876
    //   10791: ixor
    //   10792: ldc2_w -687923793
    //   10795: l2i
    //   10796: ldc_w -424100907
    //   10799: ixor
    //   10800: ixor
    //   10801: lookupswitch default -> 10828, -137385558 -> 31092, 733059772 -> 10784
    //   10828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10831: getstatic Perryc.1 : I
    //   10834: ifeq -> 10848
    //   10837: ldc2_w -746771169
    //   10840: l2i
    //   10841: ldc_w -938875284
    //   10844: ixor
    //   10845: goto -> 10856
    //   10848: ldc2_w 876245180
    //   10851: l2i
    //   10852: ldc_w -1816848793
    //   10855: ixor
    //   10856: ldc2_w -127795695
    //   10859: l2i
    //   10860: ldc_w 2032215160
    //   10863: ixor
    //   10864: ixor
    //   10865: lookupswitch default -> 30840, -1707863782 -> 10848, 651148466 -> 10892
    //   10892: putfield autoSwitch : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10895: getstatic Perryc.0 : I
    //   10898: ifle -> 10912
    //   10901: ldc2_w -2108359302
    //   10904: l2i
    //   10905: ldc_w -1430347101
    //   10908: ixor
    //   10909: goto -> 10920
    //   10912: ldc2_w 1530395769
    //   10915: l2i
    //   10916: ldc_w 2013963328
    //   10919: ixor
    //   10920: ldc2_w -1576747560
    //   10923: l2i
    //   10924: ldc_w 468547260
    //   10927: ixor
    //   10928: ixor
    //   10929: lookupswitch default -> 31196, -1862036291 -> 10912, -1697344675 -> 10956
    //   10956: aload_0
    //   10957: getstatic Perryc.1 : I
    //   10960: ifeq -> 10974
    //   10963: ldc2_w 1180366210
    //   10966: l2i
    //   10967: ldc_w -903733998
    //   10970: ixor
    //   10971: goto -> 10982
    //   10974: ldc2_w 1362549100
    //   10977: l2i
    //   10978: ldc_w 1616242727
    //   10981: ixor
    //   10982: ldc2_w -563074266
    //   10985: l2i
    //   10986: ldc_w 1709684915
    //   10989: ixor
    //   10990: ixor
    //   10991: lookupswitch default -> 11016, 59624826 -> 10974, 938441477 -> 30764
    //   11016: aload_0
    //   11017: new bigname/zprestige/webhack/features/setting/Setting
    //   11020: dup
    //   11021: ldc_w '贼㌒赥㶼㩮掤ู蹢暓㗒'
    //   11024: getstatic Perryc.0 : I
    //   11027: ifle -> 11041
    //   11030: ldc2_w -506769407
    //   11033: l2i
    //   11034: ldc_w 696858432
    //   11037: ixor
    //   11038: goto -> 11049
    //   11041: ldc2_w -32907958
    //   11044: l2i
    //   11045: ldc_w -1687314567
    //   11048: ixor
    //   11049: ldc2_w 2032468466
    //   11052: l2i
    //   11053: ldc_w 48520709
    //   11056: ixor
    //   11057: ixor
    //   11058: lookupswitch default -> 30488, -1283245898 -> 11041, 514137540 -> 11084
    //   11084: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11087: ldc2_w -1970377912
    //   11090: l2i
    //   11091: ldc_w -1970377912
    //   11094: ixor
    //   11095: getstatic Perryc.0 : I
    //   11098: ifle -> 11112
    //   11101: ldc2_w -101861539
    //   11104: l2i
    //   11105: ldc_w 2107981032
    //   11108: ixor
    //   11109: goto -> 11120
    //   11112: ldc2_w 1723787107
    //   11115: l2i
    //   11116: ldc_w -344797710
    //   11119: ixor
    //   11120: ldc2_w -1761338954
    //   11123: l2i
    //   11124: ldc_w 935049463
    //   11127: ixor
    //   11128: ixor
    //   11129: lookupswitch default -> 31174, 620178164 -> 11112, 762547152 -> 11156
    //   11156: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11159: getstatic Perryc.0 : I
    //   11162: ifle -> 11176
    //   11165: ldc2_w -1317677537
    //   11168: l2i
    //   11169: ldc_w 721772359
    //   11172: ixor
    //   11173: goto -> 11184
    //   11176: ldc2_w 1695404985
    //   11179: l2i
    //   11180: ldc_w 1711534145
    //   11183: ixor
    //   11184: ldc2_w 103908303
    //   11187: l2i
    //   11188: ldc_w 723265006
    //   11191: ixor
    //   11192: ixor
    //   11193: lookupswitch default -> 11220, -1218629767 -> 31144, -1171451312 -> 11176
    //   11220: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   11223: getstatic Perryc.1 : I
    //   11226: ifeq -> 11240
    //   11229: ldc2_w 289942822
    //   11232: l2i
    //   11233: ldc_w -1345039877
    //   11236: ixor
    //   11237: goto -> 11248
    //   11240: ldc2_w 1640461036
    //   11243: l2i
    //   11244: ldc_w 576918700
    //   11247: ixor
    //   11248: ldc2_w -1993657971
    //   11251: l2i
    //   11252: ldc_w 1603402855
    //   11255: ixor
    //   11256: ixor
    //   11257: lookupswitch default -> 30804, -1793152086 -> 11284, 1747366199 -> 11240
    //   11284: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11287: getstatic Perryc.1 : I
    //   11290: ifeq -> 11304
    //   11293: ldc2_w -884747281
    //   11296: l2i
    //   11297: ldc_w 1298514950
    //   11300: ixor
    //   11301: goto -> 11312
    //   11304: ldc2_w -704874494
    //   11307: l2i
    //   11308: ldc_w 964326718
    //   11311: ixor
    //   11312: ldc2_w 1199255118
    //   11315: l2i
    //   11316: ldc_w 1857786071
    //   11319: ixor
    //   11320: ixor
    //   11321: lookupswitch default -> 31320, -1343837840 -> 11304, -985222235 -> 11348
    //   11348: putfield packetSafe : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11351: getstatic Perryc.0 : I
    //   11354: ifle -> 11368
    //   11357: ldc2_w 734683910
    //   11360: l2i
    //   11361: ldc_w 770261886
    //   11364: ixor
    //   11365: goto -> 11376
    //   11368: ldc2_w -1463725046
    //   11371: l2i
    //   11372: ldc_w -138673942
    //   11375: ixor
    //   11376: ldc2_w -1315805191
    //   11379: l2i
    //   11380: ldc_w -687900463
    //   11383: ixor
    //   11384: ixor
    //   11385: lookupswitch default -> 30844, 940592072 -> 11412, 1632517968 -> 11368
    //   11412: aload_0
    //   11413: getstatic Perryc.c : I
    //   11416: iflt -> 11430
    //   11419: ldc2_w 699717756
    //   11422: l2i
    //   11423: ldc_w -1284100857
    //   11426: ixor
    //   11427: goto -> 11438
    //   11430: ldc2_w 939273576
    //   11433: l2i
    //   11434: ldc_w -745214211
    //   11437: ixor
    //   11438: ldc2_w -803956683
    //   11441: l2i
    //   11442: ldc_w -1773556728
    //   11445: ixor
    //   11446: ixor
    //   11447: lookupswitch default -> 11472, -593510074 -> 31246, 268499226 -> 11430
    //   11472: aload_0
    //   11473: new bigname/zprestige/webhack/features/setting/Setting
    //   11476: dup
    //   11477: ldc_w '贸㌛赴㶲㩪掴๼'
    //   11480: getstatic Perryc.c : I
    //   11483: iflt -> 11497
    //   11486: ldc2_w -1611175057
    //   11489: l2i
    //   11490: ldc_w 1356193834
    //   11493: ixor
    //   11494: goto -> 11505
    //   11497: ldc2_w -479919739
    //   11500: l2i
    //   11501: ldc_w 766196630
    //   11504: ixor
    //   11505: ldc2_w 1707245964
    //   11508: l2i
    //   11509: ldc_w 1442201482
    //   11512: ixor
    //   11513: ixor
    //   11514: lookupswitch default -> 30950, -17136619 -> 11540, -15321789 -> 11497
    //   11540: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11543: ldc2_w 1674928801
    //   11546: l2i
    //   11547: ldc_w 1674928801
    //   11550: ixor
    //   11551: getstatic Perryc.c : I
    //   11554: iflt -> 11568
    //   11557: ldc2_w 780251796
    //   11560: l2i
    //   11561: ldc_w 1617562357
    //   11564: ixor
    //   11565: goto -> 11576
    //   11568: ldc2_w 1615850751
    //   11571: l2i
    //   11572: ldc_w -2119509152
    //   11575: ixor
    //   11576: ldc2_w -1704860907
    //   11579: l2i
    //   11580: ldc_w -60186994
    //   11583: ixor
    //   11584: ixor
    //   11585: lookupswitch default -> 30896, -2014492156 -> 11612, 686015994 -> 11568
    //   11612: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11615: getstatic Perryc.0 : I
    //   11618: ifle -> 11632
    //   11621: ldc2_w -1739345817
    //   11624: l2i
    //   11625: ldc_w 1072528858
    //   11628: ixor
    //   11629: goto -> 11640
    //   11632: ldc2_w -1934105387
    //   11635: l2i
    //   11636: ldc_w -1420781164
    //   11639: ixor
    //   11640: ldc2_w 1990404462
    //   11643: l2i
    //   11644: ldc_w 275600449
    //   11647: ixor
    //   11648: ixor
    //   11649: lookupswitch default -> 11676, -1049579374 -> 31004, -474573755 -> 11632
    //   11676: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   11679: getstatic Perryc.0 : I
    //   11682: ifle -> 11696
    //   11685: ldc2_w -1914207928
    //   11688: l2i
    //   11689: ldc_w -314843363
    //   11692: ixor
    //   11693: goto -> 11704
    //   11696: ldc2_w -1274555354
    //   11699: l2i
    //   11700: ldc_w -828256557
    //   11703: ixor
    //   11704: ldc2_w 1215723501
    //   11707: l2i
    //   11708: ldc_w -167146605
    //   11711: ixor
    //   11712: ixor
    //   11713: lookupswitch default -> 31176, -992352629 -> 11740, -559701461 -> 11696
    //   11740: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11743: getstatic Perryc.c : I
    //   11746: iflt -> 11760
    //   11749: ldc2_w -1935455054
    //   11752: l2i
    //   11753: ldc_w -2072257476
    //   11756: ixor
    //   11757: goto -> 11768
    //   11760: ldc2_w -759250464
    //   11763: l2i
    //   11764: ldc_w 1362170508
    //   11767: ixor
    //   11768: ldc2_w -301312969
    //   11771: l2i
    //   11772: ldc_w 1302477930
    //   11775: ixor
    //   11776: ixor
    //   11777: lookupswitch default -> 11804, -1418659629 -> 31064, -758296823 -> 11760
    //   11804: putfield threaded : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11807: getstatic Perryc.c : I
    //   11810: iflt -> 11824
    //   11813: ldc2_w 1453189345
    //   11816: l2i
    //   11817: ldc_w -407092421
    //   11820: ixor
    //   11821: goto -> 11832
    //   11824: ldc2_w 1822854924
    //   11827: l2i
    //   11828: ldc_w 1509254927
    //   11831: ixor
    //   11832: ldc2_w -2061633482
    //   11835: l2i
    //   11836: ldc_w 1575203757
    //   11839: ixor
    //   11840: ixor
    //   11841: lookupswitch default -> 30774, -307387496 -> 11868, 1776279617 -> 11824
    //   11868: aload_0
    //   11869: getstatic Perryc.0 : I
    //   11872: ifle -> 11886
    //   11875: ldc2_w -1889771375
    //   11878: l2i
    //   11879: ldc_w 352894885
    //   11882: ixor
    //   11883: goto -> 11894
    //   11886: ldc2_w -118540734
    //   11889: l2i
    //   11890: ldc_w -805414222
    //   11893: ixor
    //   11894: ldc2_w 1380611190
    //   11897: l2i
    //   11898: ldc_w -2102305004
    //   11901: ixor
    //   11902: ixor
    //   11903: lookupswitch default -> 30712, -404076654 -> 11928, 1253045334 -> 11886
    //   11928: aload_0
    //   11929: new bigname/zprestige/webhack/features/setting/Setting
    //   11932: dup
    //   11933: ldc_w '贼㌁赣㶳㩢掳๭蹀暇㗎਴䃀煠'
    //   11936: getstatic Perryc.1 : I
    //   11939: ifeq -> 11953
    //   11942: ldc2_w -1763050852
    //   11945: l2i
    //   11946: ldc_w -1586471329
    //   11949: ixor
    //   11950: goto -> 11961
    //   11953: ldc2_w 348171501
    //   11956: l2i
    //   11957: ldc_w 716509266
    //   11960: ixor
    //   11961: ldc2_w -293625520
    //   11964: l2i
    //   11965: ldc_w 456690081
    //   11968: ixor
    //   11969: ixor
    //   11970: lookupswitch default -> 30648, -1025602510 -> 11953, -885877682 -> 11996
    //   11996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11999: ldc2_w 322791496
    //   12002: l2i
    //   12003: ldc_w 322791496
    //   12006: ixor
    //   12007: getstatic Perryc.1 : I
    //   12010: ifeq -> 12024
    //   12013: ldc2_w 54784967
    //   12016: l2i
    //   12017: ldc_w -73598497
    //   12020: ixor
    //   12021: goto -> 12032
    //   12024: ldc2_w 1557378112
    //   12027: l2i
    //   12028: ldc_w 186489253
    //   12031: ixor
    //   12032: ldc2_w 1977698246
    //   12035: l2i
    //   12036: ldc_w -218077667
    //   12039: ixor
    //   12040: ixor
    //   12041: lookupswitch default -> 30936, -785445826 -> 12068, 2118003651 -> 12024
    //   12068: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   12071: getstatic Perryc.0 : I
    //   12074: ifle -> 12088
    //   12077: ldc2_w -576331254
    //   12080: l2i
    //   12081: ldc_w 1871769725
    //   12084: ixor
    //   12085: goto -> 12096
    //   12088: ldc2_w -402370212
    //   12091: l2i
    //   12092: ldc_w -26432617
    //   12095: ixor
    //   12096: ldc2_w 223536483
    //   12099: l2i
    //   12100: ldc_w 986772644
    //   12103: ixor
    //   12104: ixor
    //   12105: lookupswitch default -> 30958, -2051603536 -> 12088, 569043724 -> 12132
    //   12132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   12135: getstatic Perryc.1 : I
    //   12138: ifeq -> 12152
    //   12141: ldc2_w -511160265
    //   12144: l2i
    //   12145: ldc_w 210441321
    //   12148: ixor
    //   12149: goto -> 12160
    //   12152: ldc2_w -1947136975
    //   12155: l2i
    //   12156: ldc_w 2013220773
    //   12159: ixor
    //   12160: ldc2_w 573586336
    //   12163: l2i
    //   12164: ldc_w 60969052
    //   12167: ixor
    //   12168: ixor
    //   12169: lookupswitch default -> 12196, -1639468062 -> 12152, -862900318 -> 31340
    //   12196: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12199: getstatic Perryc.c : I
    //   12202: iflt -> 12216
    //   12205: ldc2_w -83680985
    //   12208: l2i
    //   12209: ldc_w -98017647
    //   12212: ixor
    //   12213: goto -> 12224
    //   12216: ldc2_w -1008099878
    //   12219: l2i
    //   12220: ldc_w -2115725266
    //   12223: ixor
    //   12224: ldc2_w -129578891
    //   12227: l2i
    //   12228: ldc_w 1213183422
    //   12231: ixor
    //   12232: ixor
    //   12233: lookupswitch default -> 30624, -1323171203 -> 12216, -234588097 -> 12260
    //   12260: putfield predictCrystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12263: getstatic Perryc.c : I
    //   12266: iflt -> 12280
    //   12269: ldc2_w -217401760
    //   12272: l2i
    //   12273: ldc_w 1329351589
    //   12276: ixor
    //   12277: goto -> 12288
    //   12280: ldc2_w -2076204361
    //   12283: l2i
    //   12284: ldc_w 655315003
    //   12287: ixor
    //   12288: ldc2_w -192794654
    //   12291: l2i
    //   12292: ldc_w -1449948676
    //   12295: ixor
    //   12296: ixor
    //   12297: lookupswitch default -> 12324, -830323517 -> 12280, -517514277 -> 30610
    //   12324: aload_0
    //   12325: getstatic Perryc.0 : I
    //   12328: ifle -> 12342
    //   12331: ldc2_w -512115624
    //   12334: l2i
    //   12335: ldc_w 222591489
    //   12338: ixor
    //   12339: goto -> 12350
    //   12342: ldc2_w 173541651
    //   12345: l2i
    //   12346: ldc_w -1907752234
    //   12349: ixor
    //   12350: ldc2_w -954348743
    //   12353: l2i
    //   12354: ldc_w -1424241368
    //   12357: ixor
    //   12358: ixor
    //   12359: lookupswitch default -> 31096, -2143567800 -> 12342, -401338924 -> 12384
    //   12384: aload_0
    //   12385: new bigname/zprestige/webhack/features/setting/Setting
    //   12388: dup
    //   12389: ldc_w '贼㌁赣㶳㩢掳๭蹁暙㗘ਤ䃟'
    //   12392: getstatic Perryc.1 : I
    //   12395: ifeq -> 12409
    //   12398: ldc2_w 93029208
    //   12401: l2i
    //   12402: ldc_w 1934428036
    //   12405: ixor
    //   12406: goto -> 12417
    //   12409: ldc2_w 639303840
    //   12412: l2i
    //   12413: ldc_w -764936816
    //   12416: ixor
    //   12417: ldc2_w 1670663178
    //   12420: l2i
    //   12421: ldc_w -802938451
    //   12424: ixor
    //   12425: ixor
    //   12426: lookupswitch default -> 31330, -982062725 -> 12409, 1204588695 -> 12452
    //   12452: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12455: ldc2_w 348288630
    //   12458: l2i
    //   12459: ldc_w 348288630
    //   12462: ixor
    //   12463: getstatic Perryc.1 : I
    //   12466: ifeq -> 12480
    //   12469: ldc2_w -517146489
    //   12472: l2i
    //   12473: ldc_w 1524415785
    //   12476: ixor
    //   12477: goto -> 12488
    //   12480: ldc2_w 412138774
    //   12483: l2i
    //   12484: ldc_w 1073779263
    //   12487: ixor
    //   12488: ldc2_w -610943184
    //   12491: l2i
    //   12492: ldc_w 2082074650
    //   12495: ixor
    //   12496: ixor
    //   12497: lookupswitch default -> 12524, 477891204 -> 30480, 1157700007 -> 12480
    //   12524: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   12527: getstatic Perryc.c : I
    //   12530: iflt -> 12544
    //   12533: ldc2_w 1938469721
    //   12536: l2i
    //   12537: ldc_w -1643664741
    //   12540: ixor
    //   12541: goto -> 12552
    //   12544: ldc2_w 127618659
    //   12547: l2i
    //   12548: ldc_w -59339298
    //   12551: ixor
    //   12552: ldc2_w -1360872596
    //   12555: l2i
    //   12556: ldc_w -1689345311
    //   12559: ixor
    //   12560: ixor
    //   12561: lookupswitch default -> 30836, -834545104 -> 12588, -668925873 -> 12544
    //   12588: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   12591: getstatic Perryc.0 : I
    //   12594: ifle -> 12608
    //   12597: ldc2_w -500877887
    //   12600: l2i
    //   12601: ldc_w -1336275574
    //   12604: ixor
    //   12605: goto -> 12616
    //   12608: ldc2_w -777360583
    //   12611: l2i
    //   12612: ldc_w 580482273
    //   12615: ixor
    //   12616: ldc2_w 1019728651
    //   12619: l2i
    //   12620: ldc_w -243186722
    //   12623: ixor
    //   12624: ixor
    //   12625: lookupswitch default -> 30956, -1623611234 -> 12608, 1047891725 -> 12652
    //   12652: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12655: getstatic Perryc.c : I
    //   12658: iflt -> 12672
    //   12661: ldc2_w 1211360286
    //   12664: l2i
    //   12665: ldc_w -1574033837
    //   12668: ixor
    //   12669: goto -> 12680
    //   12672: ldc2_w -221016677
    //   12675: l2i
    //   12676: ldc_w 213347027
    //   12679: ixor
    //   12680: ldc2_w -1694895792
    //   12683: l2i
    //   12684: ldc_w -854039400
    //   12687: ixor
    //   12688: ixor
    //   12689: lookupswitch default -> 30866, -1450872192 -> 12716, -1107535995 -> 12672
    //   12716: putfield predictBlock : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12719: getstatic Perryc.0 : I
    //   12722: ifle -> 12736
    //   12725: ldc2_w -489062030
    //   12728: l2i
    //   12729: ldc_w -1231206033
    //   12732: ixor
    //   12733: goto -> 12744
    //   12736: ldc2_w -1601316904
    //   12739: l2i
    //   12740: ldc_w -1939514391
    //   12743: ixor
    //   12744: ldc2_w -2128477732
    //   12747: l2i
    //   12748: ldc_w -2089385255
    //   12751: ixor
    //   12752: ixor
    //   12753: lookupswitch default -> 30502, 784076596 -> 12780, 1443908376 -> 12736
    //   12780: aload_0
    //   12781: getstatic Perryc.c : I
    //   12784: iflt -> 12798
    //   12787: ldc2_w 1093138605
    //   12790: l2i
    //   12791: ldc_w -963384585
    //   12794: ixor
    //   12795: goto -> 12806
    //   12798: ldc2_w 866490949
    //   12801: l2i
    //   12802: ldc_w -933514170
    //   12805: ixor
    //   12806: ldc2_w -2007817548
    //   12809: l2i
    //   12810: ldc_w 905643756
    //   12813: ixor
    //   12814: ixor
    //   12815: lookupswitch default -> 31032, 974927362 -> 12798, 1180043867 -> 12840
    //   12840: aload_0
    //   12841: new bigname/zprestige/webhack/features/setting/Setting
    //   12844: dup
    //   12845: ldc_w '贩㌝赲㶾㩿掩ู蹱暐㗓ਮ䃗煵'
    //   12848: getstatic Perryc.0 : I
    //   12851: ifle -> 12865
    //   12854: ldc2_w 1073803070
    //   12857: l2i
    //   12858: ldc_w -1764928877
    //   12861: ixor
    //   12862: goto -> 12873
    //   12865: ldc2_w -1743410597
    //   12868: l2i
    //   12869: ldc_w -2044286116
    //   12872: ixor
    //   12873: ldc2_w 1938671349
    //   12876: l2i
    //   12877: ldc_w 276965150
    //   12880: ixor
    //   12881: ixor
    //   12882: lookupswitch default -> 12908, -1245553594 -> 31142, 1463608208 -> 12865
    //   12908: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12911: ldc2_w 470700968
    //   12914: l2i
    //   12915: ldc_w 470700968
    //   12918: ixor
    //   12919: getstatic Perryc.0 : I
    //   12922: ifle -> 12936
    //   12925: ldc2_w 984247207
    //   12928: l2i
    //   12929: ldc_w 2054964732
    //   12932: ixor
    //   12933: goto -> 12944
    //   12936: ldc2_w -169015365
    //   12939: l2i
    //   12940: ldc_w 1220309514
    //   12943: ixor
    //   12944: ldc2_w 151854023
    //   12947: l2i
    //   12948: ldc_w -1185856439
    //   12951: ixor
    //   12952: ixor
    //   12953: lookupswitch default -> 30526, -259362347 -> 12936, 218966591 -> 12980
    //   12980: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   12983: getstatic Perryc.1 : I
    //   12986: ifeq -> 13000
    //   12989: ldc2_w 14968005
    //   12992: l2i
    //   12993: ldc_w 1806880457
    //   12996: ixor
    //   12997: goto -> 13008
    //   13000: ldc2_w 218254642
    //   13003: l2i
    //   13004: ldc_w 848888416
    //   13007: ixor
    //   13008: ldc2_w -1539912586
    //   13011: l2i
    //   13012: ldc_w 2068908280
    //   13015: ixor
    //   13016: ixor
    //   13017: lookupswitch default -> 13044, -1271828862 -> 31162, 302619475 -> 13000
    //   13044: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   13047: getstatic Perryc.1 : I
    //   13050: ifeq -> 13064
    //   13053: ldc2_w 1891187114
    //   13056: l2i
    //   13057: ldc_w -2095681532
    //   13060: ixor
    //   13061: goto -> 13072
    //   13064: ldc2_w -1875199820
    //   13067: l2i
    //   13068: ldc_w -1902532341
    //   13071: ixor
    //   13072: ldc2_w -737176602
    //   13075: l2i
    //   13076: ldc_w 2086051630
    //   13079: ixor
    //   13080: ixor
    //   13081: lookupswitch default -> 13108, -1637695868 -> 13064, 1542866278 -> 31216
    //   13108: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13111: getstatic Perryc.0 : I
    //   13114: ifle -> 13128
    //   13117: ldc2_w 606951038
    //   13120: l2i
    //   13121: ldc_w 55693738
    //   13124: ixor
    //   13125: goto -> 13136
    //   13128: ldc2_w -912248209
    //   13131: l2i
    //   13132: ldc_w -64412847
    //   13135: ixor
    //   13136: ldc2_w 347392726
    //   13139: l2i
    //   13140: ldc_w 1469790917
    //   13143: ixor
    //   13144: ixor
    //   13145: lookupswitch default -> 30770, 1683191751 -> 13128, 1990648109 -> 13172
    //   13172: putfield entityPredict : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13175: getstatic Perryc.0 : I
    //   13178: ifle -> 13192
    //   13181: ldc2_w 216824669
    //   13184: l2i
    //   13185: ldc_w 126432898
    //   13188: ixor
    //   13189: goto -> 13200
    //   13192: ldc2_w 1495784802
    //   13195: l2i
    //   13196: ldc_w -52584263
    //   13199: ixor
    //   13200: ldc2_w 19023633
    //   13203: l2i
    //   13204: ldc_w -764627305
    //   13207: ixor
    //   13208: ixor
    //   13209: lookupswitch default -> 13236, -668222375 -> 30938, 1955529751 -> 13192
    //   13236: aload_0
    //   13237: getstatic Perryc.1 : I
    //   13240: ifeq -> 13254
    //   13243: ldc2_w -32053387
    //   13246: l2i
    //   13247: ldc_w -1754099634
    //   13250: ixor
    //   13251: goto -> 13262
    //   13254: ldc2_w 946906918
    //   13257: l2i
    //   13258: ldc_w 1379128126
    //   13261: ixor
    //   13262: ldc2_w -1941240492
    //   13265: l2i
    //   13266: ldc_w 403106952
    //   13269: ixor
    //   13270: ixor
    //   13271: lookupswitch default -> 31376, -47603993 -> 13254, -32596540 -> 13296
    //   13296: aload_0
    //   13297: new bigname/zprestige/webhack/features/setting/Setting
    //   13300: dup
    //   13301: ldc_w '贼㌁赣㶳㩢掳๭蹗暜㗔ਬ䃇'
    //   13304: getstatic Perryc.c : I
    //   13307: iflt -> 13321
    //   13310: ldc2_w 839473847
    //   13313: l2i
    //   13314: ldc_w -1147266907
    //   13317: ixor
    //   13318: goto -> 13329
    //   13321: ldc2_w -889556102
    //   13324: l2i
    //   13325: ldc_w 1312151509
    //   13328: ixor
    //   13329: ldc2_w 1534743851
    //   13332: l2i
    //   13333: ldc_w -600365181
    //   13336: ixor
    //   13337: ixor
    //   13338: lookupswitch default -> 13364, 249180346 -> 30978, 704390666 -> 13321
    //   13364: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13367: ldc2_w -422235350
    //   13370: l2i
    //   13371: ldc_w -422235349
    //   13374: ixor
    //   13375: getstatic Perryc.c : I
    //   13378: iflt -> 13392
    //   13381: ldc2_w 143273575
    //   13384: l2i
    //   13385: ldc_w 1676342403
    //   13388: ixor
    //   13389: goto -> 13400
    //   13392: ldc2_w -1272617978
    //   13395: l2i
    //   13396: ldc_w 586990920
    //   13399: ixor
    //   13400: ldc2_w 106891964
    //   13403: l2i
    //   13404: ldc_w 1824054628
    //   13407: ixor
    //   13408: ixor
    //   13409: lookupswitch default -> 13436, 25627964 -> 31166, 1044103963 -> 13392
    //   13436: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13439: ldc2_w -615023825
    //   13442: l2i
    //   13443: ldc_w -615023825
    //   13446: ixor
    //   13447: getstatic Perryc.c : I
    //   13450: iflt -> 13464
    //   13453: ldc2_w 304087786
    //   13456: l2i
    //   13457: ldc_w 1067757186
    //   13460: ixor
    //   13461: goto -> 13472
    //   13464: ldc2_w -990272754
    //   13467: l2i
    //   13468: ldc_w 1122194673
    //   13471: ixor
    //   13472: ldc2_w 387321148
    //   13475: l2i
    //   13476: ldc_w 1017839443
    //   13479: ixor
    //   13480: ixor
    //   13481: lookupswitch default -> 31332, -1381628528 -> 13508, 104357383 -> 13464
    //   13508: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13511: ldc2_w -63314094
    //   13514: l2i
    //   13515: ldc_w -63314089
    //   13518: ixor
    //   13519: getstatic Perryc.1 : I
    //   13522: ifeq -> 13536
    //   13525: ldc2_w -224498897
    //   13528: l2i
    //   13529: ldc_w 339917611
    //   13532: ixor
    //   13533: goto -> 13544
    //   13536: ldc2_w 988217567
    //   13539: l2i
    //   13540: ldc_w -1399639228
    //   13543: ixor
    //   13544: ldc2_w 399321449
    //   13547: l2i
    //   13548: ldc_w -1173128142
    //   13551: ixor
    //   13552: ixor
    //   13553: lookupswitch default -> 13580, 1258456415 -> 31360, 1743874845 -> 13536
    //   13580: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13583: getstatic Perryc.c : I
    //   13586: iflt -> 13600
    //   13589: ldc2_w 594695372
    //   13592: l2i
    //   13593: ldc_w -1389711265
    //   13596: ixor
    //   13597: goto -> 13608
    //   13600: ldc2_w 1258818666
    //   13603: l2i
    //   13604: ldc_w 1604734447
    //   13607: ixor
    //   13608: ldc2_w 1667170165
    //   13611: l2i
    //   13612: ldc_w -121670760
    //   13615: ixor
    //   13616: ixor
    //   13617: lookupswitch default -> 13644, 364472446 -> 31262, 1047392826 -> 13600
    //   13644: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   13647: getstatic Perryc.0 : I
    //   13650: ifle -> 13664
    //   13653: ldc2_w 706964255
    //   13656: l2i
    //   13657: ldc_w 1192999905
    //   13660: ixor
    //   13661: goto -> 13672
    //   13664: ldc2_w 229467382
    //   13667: l2i
    //   13668: ldc_w -1132666321
    //   13671: ixor
    //   13672: ldc2_w 2052181983
    //   13675: l2i
    //   13676: ldc_w 739508475
    //   13679: ixor
    //   13680: ixor
    //   13681: lookupswitch default -> 30974, -409712131 -> 13708, 998055898 -> 13664
    //   13708: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13711: getstatic Perryc.c : I
    //   13714: iflt -> 13728
    //   13717: ldc2_w 524469582
    //   13720: l2i
    //   13721: ldc_w -295383894
    //   13724: ixor
    //   13725: goto -> 13736
    //   13728: ldc2_w -1721016401
    //   13731: l2i
    //   13732: ldc_w -928942807
    //   13735: ixor
    //   13736: ldc2_w -1426580186
    //   13739: l2i
    //   13740: ldc_w -476658169
    //   13743: ixor
    //   13744: ixor
    //   13745: lookupswitch default -> 30990, -1203187003 -> 13728, 413462951 -> 13772
    //   13772: putfield predictedTicks : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13775: getstatic Perryc.c : I
    //   13778: iflt -> 13792
    //   13781: ldc2_w 157150148
    //   13784: l2i
    //   13785: ldc_w -716823287
    //   13788: ixor
    //   13789: goto -> 13800
    //   13792: ldc2_w 1838423103
    //   13795: l2i
    //   13796: ldc_w -1497223524
    //   13799: ixor
    //   13800: ldc2_w 1452597842
    //   13803: l2i
    //   13804: ldc_w -2080622605
    //   13807: ixor
    //   13808: ixor
    //   13809: lookupswitch default -> 30622, 158538604 -> 13792, 507438850 -> 13836
    //   13836: aload_0
    //   13837: getstatic Perryc.c : I
    //   13840: iflt -> 13854
    //   13843: ldc2_w 2011509595
    //   13846: l2i
    //   13847: ldc_w -1434891150
    //   13850: ixor
    //   13851: goto -> 13862
    //   13854: ldc2_w 1448081206
    //   13857: l2i
    //   13858: ldc_w -345268077
    //   13861: ixor
    //   13862: ldc2_w -1999856464
    //   13865: l2i
    //   13866: ldc_w -1707455627
    //   13869: ixor
    //   13870: ixor
    //   13871: lookupswitch default -> 30972, -1345159072 -> 13896, -815093524 -> 13854
    //   13896: aload_0
    //   13897: new bigname/zprestige/webhack/features/setting/Setting
    //   13900: dup
    //   13901: ldc_w '贪㌒赵㶣'
    //   13904: getstatic Perryc.1 : I
    //   13907: ifeq -> 13921
    //   13910: ldc2_w -383262648
    //   13913: l2i
    //   13914: ldc_w -1432091640
    //   13917: ixor
    //   13918: goto -> 13929
    //   13921: ldc2_w -289850245
    //   13924: l2i
    //   13925: ldc_w -221663639
    //   13928: ixor
    //   13929: ldc2_w -636873054
    //   13932: l2i
    //   13933: ldc_w -712476027
    //   13936: ixor
    //   13937: ixor
    //   13938: lookupswitch default -> 13964, -1419221946 -> 13921, 1275168871 -> 31040
    //   13964: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13967: getstatic Perryc.c : I
    //   13970: iflt -> 13984
    //   13973: ldc2_w 1648430416
    //   13976: l2i
    //   13977: ldc_w -1572671516
    //   13980: ixor
    //   13981: goto -> 13992
    //   13984: ldc2_w 448628517
    //   13987: l2i
    //   13988: ldc_w -630405097
    //   13991: ixor
    //   13992: ldc2_w 1420225194
    //   13995: l2i
    //   13996: ldc_w -879763100
    //   13999: ixor
    //   14000: ixor
    //   14001: lookupswitch default -> 31250, 1596647802 -> 13984, 1610106108 -> 14028
    //   14028: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$FastMode.Ignore : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$FastMode;
    //   14031: getstatic Perryc.0 : I
    //   14034: ifle -> 14048
    //   14037: ldc2_w -791193910
    //   14040: l2i
    //   14041: ldc_w -1965412149
    //   14044: ixor
    //   14045: goto -> 14056
    //   14048: ldc2_w 877576481
    //   14051: l2i
    //   14052: ldc_w -2085354365
    //   14055: ixor
    //   14056: ldc2_w 1135904623
    //   14059: l2i
    //   14060: ldc_w 176927534
    //   14063: ixor
    //   14064: ixor
    //   14065: lookupswitch default -> 14092, -1125341597 -> 14048, 322064960 -> 31272
    //   14092: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   14095: getstatic Perryc.0 : I
    //   14098: ifle -> 14112
    //   14101: ldc2_w 2052695820
    //   14104: l2i
    //   14105: ldc_w -1679315559
    //   14108: ixor
    //   14109: goto -> 14120
    //   14112: ldc2_w -1678205288
    //   14115: l2i
    //   14116: ldc_w -1172004687
    //   14119: ixor
    //   14120: ldc2_w -1108393250
    //   14123: l2i
    //   14124: ldc_w 696820391
    //   14127: ixor
    //   14128: ixor
    //   14129: lookupswitch default -> 14156, -910159313 -> 14112, 1977215724 -> 31152
    //   14156: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14159: getstatic Perryc.c : I
    //   14162: iflt -> 14176
    //   14165: ldc2_w 425253852
    //   14168: l2i
    //   14169: ldc_w -1063486284
    //   14172: ixor
    //   14173: goto -> 14184
    //   14176: ldc2_w -1644510083
    //   14179: l2i
    //   14180: ldc_w -2021381333
    //   14183: ixor
    //   14184: ldc2_w -1147259706
    //   14187: l2i
    //   14188: ldc_w -1396054788
    //   14191: ixor
    //   14192: ixor
    //   14193: lookupswitch default -> 31054, -829196462 -> 14176, 220807020 -> 14220
    //   14220: putfield fastMode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14223: getstatic Perryc.c : I
    //   14226: iflt -> 14240
    //   14229: ldc2_w 1614622738
    //   14232: l2i
    //   14233: ldc_w -1218765054
    //   14236: ixor
    //   14237: goto -> 14248
    //   14240: ldc2_w 1320419325
    //   14243: l2i
    //   14244: ldc_w -1734341386
    //   14247: ixor
    //   14248: ldc2_w 1367608861
    //   14251: l2i
    //   14252: ldc_w -505103049
    //   14255: ixor
    //   14256: ixor
    //   14257: lookupswitch default -> 14284, 788579432 -> 14240, 1728486458 -> 30944
    //   14284: aload_0
    //   14285: getstatic Perryc.c : I
    //   14288: iflt -> 14302
    //   14291: ldc2_w -132805547
    //   14294: l2i
    //   14295: ldc_w 1064654295
    //   14298: ixor
    //   14299: goto -> 14310
    //   14302: ldc2_w -559721819
    //   14305: l2i
    //   14306: ldc_w 1065072900
    //   14309: ixor
    //   14310: ldc2_w -707171419
    //   14313: l2i
    //   14314: ldc_w 1528427248
    //   14317: ixor
    //   14318: ixor
    //   14319: lookupswitch default -> 14344, 1235239127 -> 30482, 1553196270 -> 14302
    //   14344: aload_0
    //   14345: new bigname/zprestige/webhack/features/setting/Setting
    //   14348: dup
    //   14349: ldc_w '贪㌒赥㶲㩻掼๸蹦'
    //   14352: getstatic Perryc.0 : I
    //   14355: ifle -> 14369
    //   14358: ldc2_w 1393973944
    //   14361: l2i
    //   14362: ldc_w 2061488025
    //   14365: ixor
    //   14366: goto -> 14377
    //   14369: ldc2_w -1400577261
    //   14372: l2i
    //   14373: ldc_w -1850991257
    //   14376: ixor
    //   14377: ldc2_w 1554133307
    //   14380: l2i
    //   14381: ldc_w 1163335026
    //   14384: ixor
    //   14385: ixor
    //   14386: lookupswitch default -> 14412, -2019544828 -> 14369, 809283944 -> 30908
    //   14412: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14415: ldc2_w -302864610
    //   14418: l2i
    //   14419: ldc_w -302864609
    //   14422: ixor
    //   14423: getstatic Perryc.1 : I
    //   14426: ifeq -> 14440
    //   14429: ldc2_w 764421994
    //   14432: l2i
    //   14433: ldc_w -595689234
    //   14436: ixor
    //   14437: goto -> 14448
    //   14440: ldc2_w 1764266900
    //   14443: l2i
    //   14444: ldc_w -1070155934
    //   14447: ixor
    //   14448: ldc2_w 1101551338
    //   14451: l2i
    //   14452: ldc_w 1021155525
    //   14455: ixor
    //   14456: ixor
    //   14457: lookupswitch default -> 31362, -1935971925 -> 14440, -731125031 -> 14484
    //   14484: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   14487: getstatic Perryc.1 : I
    //   14490: ifeq -> 14504
    //   14493: ldc2_w 1283034760
    //   14496: l2i
    //   14497: ldc_w 1220194767
    //   14500: ixor
    //   14501: goto -> 14512
    //   14504: ldc2_w 1710710892
    //   14507: l2i
    //   14508: ldc_w 2090709032
    //   14511: ixor
    //   14512: ldc2_w 2010096203
    //   14515: l2i
    //   14516: ldc_w -438330359
    //   14519: ixor
    //   14520: ixor
    //   14521: lookupswitch default -> 14548, -1764556539 -> 30722, 1559615042 -> 14504
    //   14548: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   14551: getstatic Perryc.0 : I
    //   14554: ifle -> 14568
    //   14557: ldc2_w 335514328
    //   14560: l2i
    //   14561: ldc_w -1965911604
    //   14564: ixor
    //   14565: goto -> 14576
    //   14568: ldc2_w 432934645
    //   14571: l2i
    //   14572: ldc_w -301489737
    //   14575: ixor
    //   14576: ldc2_w -1161920329
    //   14579: l2i
    //   14580: ldc_w 529785986
    //   14583: ixor
    //   14584: ixor
    //   14585: lookupswitch default -> 14612, -681146512 -> 14568, 1006665505 -> 30512
    //   14612: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14615: getstatic Perryc.1 : I
    //   14618: ifeq -> 14632
    //   14621: ldc2_w 1800304761
    //   14624: l2i
    //   14625: ldc_w -995912005
    //   14628: ixor
    //   14629: goto -> 14640
    //   14632: ldc2_w 1096096494
    //   14635: l2i
    //   14636: ldc_w -736849385
    //   14639: ixor
    //   14640: ldc2_w 1520540205
    //   14643: l2i
    //   14644: ldc_w 1284797440
    //   14647: ixor
    //   14648: ixor
    //   14649: lookupswitch default -> 30940, -2089523500 -> 14676, -1177026321 -> 14632
    //   14676: putfield faceplace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14679: getstatic Perryc.1 : I
    //   14682: ifeq -> 14696
    //   14685: ldc2_w -1761998660
    //   14688: l2i
    //   14689: ldc_w 1114975571
    //   14692: ixor
    //   14693: goto -> 14704
    //   14696: ldc2_w 801136331
    //   14699: l2i
    //   14700: ldc_w 259204128
    //   14703: ixor
    //   14704: ldc2_w -2108798982
    //   14707: l2i
    //   14708: ldc_w -1021599364
    //   14711: ixor
    //   14712: ixor
    //   14713: lookupswitch default -> 14740, -1780825239 -> 31298, 2262023 -> 14696
    //   14740: aload_0
    //   14741: getstatic Perryc.c : I
    //   14744: iflt -> 14758
    //   14747: ldc2_w -1902553663
    //   14750: l2i
    //   14751: ldc_w 936614692
    //   14754: ixor
    //   14755: goto -> 14766
    //   14758: ldc2_w 2027376172
    //   14761: l2i
    //   14762: ldc_w -1505681631
    //   14765: ixor
    //   14766: ldc2_w -937857173
    //   14769: l2i
    //   14770: ldc_w 629360880
    //   14773: ixor
    //   14774: ixor
    //   14775: lookupswitch default -> 14800, 1422977406 -> 30968, 2146182222 -> 14758
    //   14800: aload_0
    //   14801: new bigname/zprestige/webhack/features/setting/Setting
    //   14804: dup
    //   14805: ldc_w '贪㌒赥㶲㩻掼๸蹦曕㗿ਗ'
    //   14808: getstatic Perryc.c : I
    //   14811: iflt -> 14825
    //   14814: ldc2_w -1920126533
    //   14817: l2i
    //   14818: ldc_w -1271354642
    //   14821: ixor
    //   14822: goto -> 14833
    //   14825: ldc2_w 551746697
    //   14828: l2i
    //   14829: ldc_w -622043717
    //   14832: ixor
    //   14833: ldc2_w -1684961866
    //   14836: l2i
    //   14837: ldc_w -1341027512
    //   14840: ixor
    //   14841: ixor
    //   14842: lookupswitch default -> 14868, -2000912610 -> 14825, 305501611 -> 31058
    //   14868: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14871: ldc2_w -1842556185
    //   14874: l2i
    //   14875: ldc_w -1842556181
    //   14878: ixor
    //   14879: getstatic Perryc.c : I
    //   14882: iflt -> 14896
    //   14885: ldc2_w 217817007
    //   14888: l2i
    //   14889: ldc_w 1538950147
    //   14892: ixor
    //   14893: goto -> 14904
    //   14896: ldc2_w -1543534485
    //   14899: l2i
    //   14900: ldc_w -1002112695
    //   14903: ixor
    //   14904: ldc2_w -1983491656
    //   14907: l2i
    //   14908: ldc_w -1510800874
    //   14911: ixor
    //   14912: ixor
    //   14913: lookupswitch default -> 14940, 384658139 -> 14896, 2071218178 -> 31104
    //   14940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14943: ldc2_w -110082255
    //   14946: l2i
    //   14947: ldc_w -110082255
    //   14950: ixor
    //   14951: getstatic Perryc.0 : I
    //   14954: ifle -> 14968
    //   14957: ldc2_w -1034156243
    //   14960: l2i
    //   14961: ldc_w 140040310
    //   14964: ixor
    //   14965: goto -> 14976
    //   14968: ldc2_w -814039063
    //   14971: l2i
    //   14972: ldc_w 425084327
    //   14975: ixor
    //   14976: ldc2_w 491092432
    //   14979: l2i
    //   14980: ldc_w 1581056654
    //   14983: ixor
    //   14984: ixor
    //   14985: lookupswitch default -> 15012, -1988320251 -> 31088, -387441111 -> 14968
    //   15012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15015: ldc2_w -57503570
    //   15018: l2i
    //   15019: ldc_w -57503606
    //   15022: ixor
    //   15023: getstatic Perryc.0 : I
    //   15026: ifle -> 15040
    //   15029: ldc2_w -41188793
    //   15032: l2i
    //   15033: ldc_w -914148649
    //   15036: ixor
    //   15037: goto -> 15048
    //   15040: ldc2_w 1257599288
    //   15043: l2i
    //   15044: ldc_w 458554150
    //   15047: ixor
    //   15048: ldc2_w 22412238
    //   15051: l2i
    //   15052: ldc_w 1726440625
    //   15055: ixor
    //   15056: ixor
    //   15057: lookupswitch default -> 30752, 907220321 -> 15084, 1404710895 -> 15040
    //   15084: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15087: getstatic Perryc.0 : I
    //   15090: ifle -> 15104
    //   15093: ldc2_w 1819253222
    //   15096: l2i
    //   15097: ldc_w 60355162
    //   15100: ixor
    //   15101: goto -> 15112
    //   15104: ldc2_w 222347529
    //   15107: l2i
    //   15108: ldc_w 137537410
    //   15111: ixor
    //   15112: ldc2_w 252179457
    //   15115: l2i
    //   15116: ldc_w 883576144
    //   15119: ixor
    //   15120: ixor
    //   15121: lookupswitch default -> 15148, -1473719310 -> 15104, 1415238381 -> 31232
    //   15148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   15151: getstatic Perryc.0 : I
    //   15154: ifle -> 15168
    //   15157: ldc2_w -1062401818
    //   15160: l2i
    //   15161: ldc_w 192036063
    //   15164: ixor
    //   15165: goto -> 15176
    //   15168: ldc2_w 1017061720
    //   15171: l2i
    //   15172: ldc_w -1171904132
    //   15175: ixor
    //   15176: ldc2_w 83400777
    //   15179: l2i
    //   15180: ldc_w 301135361
    //   15183: ixor
    //   15184: ixor
    //   15185: lookupswitch default -> 31200, -1816959380 -> 15212, -556443023 -> 15168
    //   15212: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15215: getstatic Perryc.0 : I
    //   15218: ifle -> 15232
    //   15221: ldc2_w 310179396
    //   15224: l2i
    //   15225: ldc_w 1735064846
    //   15228: ixor
    //   15229: goto -> 15240
    //   15232: ldc2_w 221769815
    //   15235: l2i
    //   15236: ldc_w -708410473
    //   15239: ixor
    //   15240: ldc2_w -2065000713
    //   15243: l2i
    //   15244: ldc_w -134719849
    //   15247: ixor
    //   15248: ixor
    //   15249: lookupswitch default -> 15276, -2908537 -> 15232, 100977450 -> 31334
    //   15276: putfield facePlaceHP : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15279: getstatic Perryc.0 : I
    //   15282: ifle -> 15296
    //   15285: ldc2_w -416641604
    //   15288: l2i
    //   15289: ldc_w 1915846418
    //   15292: ixor
    //   15293: goto -> 15304
    //   15296: ldc2_w 747719984
    //   15299: l2i
    //   15300: ldc_w -608984641
    //   15303: ixor
    //   15304: ldc2_w -347266685
    //   15307: l2i
    //   15308: ldc_w 57532120
    //   15311: ixor
    //   15312: ixor
    //   15313: lookupswitch default -> 15340, -684750902 -> 15296, 2101022197 -> 31132
    //   15340: aload_0
    //   15341: getstatic Perryc.c : I
    //   15344: iflt -> 15358
    //   15347: ldc2_w -1192121670
    //   15350: l2i
    //   15351: ldc_w -442186943
    //   15354: ixor
    //   15355: goto -> 15366
    //   15358: ldc2_w -1386915909
    //   15361: l2i
    //   15362: ldc_w -1873500291
    //   15365: ixor
    //   15366: ldc2_w -91563820
    //   15369: l2i
    //   15370: ldc_w -1238831056
    //   15373: ixor
    //   15374: ixor
    //   15375: lookupswitch default -> 15400, 301416735 -> 30626, 1185469365 -> 15358
    //   15400: aload_0
    //   15401: new bigname/zprestige/webhack/features/setting/Setting
    //   15404: dup
    //   15405: ldc_w '贪㌒赥㶲㩻掼๸蹦曕㗳ਢ䃘煠'
    //   15408: getstatic Perryc.c : I
    //   15411: iflt -> 15425
    //   15414: ldc2_w 860936906
    //   15417: l2i
    //   15418: ldc_w -1887353348
    //   15421: ixor
    //   15422: goto -> 15433
    //   15425: ldc2_w -1836945300
    //   15428: l2i
    //   15429: ldc_w -970851828
    //   15432: ixor
    //   15433: ldc2_w -1604999728
    //   15436: l2i
    //   15437: ldc_w -153793979
    //   15440: ixor
    //   15441: ixor
    //   15442: lookupswitch default -> 30604, -363761501 -> 15425, 35874293 -> 15468
    //   15468: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15471: ldc2_w -1012232165
    //   15474: l2i
    //   15475: ldc_w -1012232165
    //   15478: ixor
    //   15479: getstatic Perryc.c : I
    //   15482: iflt -> 15496
    //   15485: ldc2_w 93431486
    //   15488: l2i
    //   15489: ldc_w 967401030
    //   15492: ixor
    //   15493: goto -> 15504
    //   15496: ldc2_w -1960132577
    //   15499: l2i
    //   15500: ldc_w -34222106
    //   15503: ixor
    //   15504: ldc2_w -1601024012
    //   15507: l2i
    //   15508: ldc_w 51379239
    //   15511: ixor
    //   15512: ixor
    //   15513: lookupswitch default -> 31044, -1616557269 -> 15496, -717046742 -> 15540
    //   15540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15543: ldc2_w -23390816
    //   15546: l2i
    //   15547: ldc_w -23390816
    //   15550: ixor
    //   15551: getstatic Perryc.c : I
    //   15554: iflt -> 15568
    //   15557: ldc2_w 921049634
    //   15560: l2i
    //   15561: ldc_w -2081074476
    //   15564: ixor
    //   15565: goto -> 15576
    //   15568: ldc2_w 1457463699
    //   15571: l2i
    //   15572: ldc_w 1891012156
    //   15575: ixor
    //   15576: ldc2_w 729227103
    //   15579: l2i
    //   15580: ldc_w 2026824099
    //   15583: ixor
    //   15584: ixor
    //   15585: lookupswitch default -> 15612, -561299065 -> 15568, -425019894 -> 31024
    //   15612: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15615: ldc2_w -1769205666
    //   15618: l2i
    //   15619: ldc_w -1769205676
    //   15622: ixor
    //   15623: getstatic Perryc.1 : I
    //   15626: ifeq -> 15640
    //   15629: ldc2_w 928546902
    //   15632: l2i
    //   15633: ldc_w 106199904
    //   15636: ixor
    //   15637: goto -> 15648
    //   15640: ldc2_w 1221652214
    //   15643: l2i
    //   15644: ldc_w 1312063314
    //   15647: ixor
    //   15648: ldc2_w 2126967557
    //   15651: l2i
    //   15652: ldc_w -64818432
    //   15655: ixor
    //   15656: ixor
    //   15657: lookupswitch default -> 15684, -1276576973 -> 30636, -1107689477 -> 15640
    //   15684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15687: getstatic Perryc.c : I
    //   15690: iflt -> 15704
    //   15693: ldc2_w 1039107374
    //   15696: l2i
    //   15697: ldc_w -46463757
    //   15700: ixor
    //   15701: goto -> 15712
    //   15704: ldc2_w 1468992270
    //   15707: l2i
    //   15708: ldc_w 2061211241
    //   15711: ixor
    //   15712: ldc2_w 1919897702
    //   15715: l2i
    //   15716: ldc_w -681606664
    //   15719: ixor
    //   15720: ixor
    //   15721: lookupswitch default -> 30690, -2006692615 -> 15748, 1709461571 -> 15704
    //   15748: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   15751: getstatic Perryc.0 : I
    //   15754: ifle -> 15768
    //   15757: ldc2_w 222325299
    //   15760: l2i
    //   15761: ldc_w 1600391236
    //   15764: ixor
    //   15765: goto -> 15776
    //   15768: ldc2_w -1249626449
    //   15771: l2i
    //   15772: ldc_w -1857667735
    //   15775: ixor
    //   15776: ldc2_w -1253833253
    //   15779: l2i
    //   15780: ldc_w -469200528
    //   15783: ixor
    //   15784: ixor
    //   15785: lookupswitch default -> 31114, 57210588 -> 15768, 1972281197 -> 15812
    //   15812: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15815: getstatic Perryc.0 : I
    //   15818: ifle -> 15832
    //   15821: ldc2_w 526566793
    //   15824: l2i
    //   15825: ldc_w -1134845212
    //   15828: ixor
    //   15829: goto -> 15840
    //   15832: ldc2_w 1376676005
    //   15835: l2i
    //   15836: ldc_w -1841385184
    //   15839: ixor
    //   15840: ldc2_w -1784666008
    //   15843: l2i
    //   15844: ldc_w -40085110
    //   15847: ixor
    //   15848: ixor
    //   15849: lookupswitch default -> 31314, -1475565465 -> 15876, -888858993 -> 15832
    //   15876: putfield facePlacDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15879: getstatic Perryc.1 : I
    //   15882: ifeq -> 15896
    //   15885: ldc2_w -512244673
    //   15888: l2i
    //   15889: ldc_w 103116227
    //   15892: ixor
    //   15893: goto -> 15904
    //   15896: ldc2_w -60690560
    //   15899: l2i
    //   15900: ldc_w -1629519846
    //   15903: ixor
    //   15904: ldc2_w -129158608
    //   15907: l2i
    //   15908: ldc_w 1625517772
    //   15911: ixor
    //   15912: ixor
    //   15913: lookupswitch default -> 15940, 2019631939 -> 15896, 2147284224 -> 30762
    //   15940: aload_0
    //   15941: getstatic Perryc.1 : I
    //   15944: ifeq -> 15958
    //   15947: ldc2_w -999890236
    //   15950: l2i
    //   15951: ldc_w 1601302291
    //   15954: ixor
    //   15955: goto -> 15966
    //   15958: ldc2_w -1318601504
    //   15961: l2i
    //   15962: ldc_w 897264236
    //   15965: ixor
    //   15966: ldc2_w 969757239
    //   15969: l2i
    //   15970: ldc_w -1596039749
    //   15973: ixor
    //   15974: ixor
    //   15975: lookupswitch default -> 30466, 33817179 -> 15958, 487561472 -> 16000
    //   16000: aload_0
    //   16001: new bigname/zprestige/webhack/features/setting/Setting
    //   16004: dup
    //   16005: ldc_w '财㌜账㶑㩛揰๊蹬暇㗓'
    //   16008: getstatic Perryc.0 : I
    //   16011: ifle -> 16025
    //   16014: ldc2_w 248127547
    //   16017: l2i
    //   16018: ldc_w 1413275086
    //   16021: ixor
    //   16022: goto -> 16033
    //   16025: ldc2_w 356875160
    //   16028: l2i
    //   16029: ldc_w 616758114
    //   16032: ixor
    //   16033: ldc2_w -1853667539
    //   16036: l2i
    //   16037: ldc_w 459581304
    //   16040: ixor
    //   16041: ixor
    //   16042: lookupswitch default -> 31236, -1151311697 -> 16068, -804184672 -> 16025
    //   16068: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16071: ldc2_w -828868132
    //   16074: l2i
    //   16075: ldc_w -828868132
    //   16078: ixor
    //   16079: getstatic Perryc.c : I
    //   16082: iflt -> 16096
    //   16085: ldc2_w 1787856308
    //   16088: l2i
    //   16089: ldc_w 1354748192
    //   16092: ixor
    //   16093: goto -> 16104
    //   16096: ldc2_w -1677516148
    //   16099: l2i
    //   16100: ldc_w -128554930
    //   16103: ixor
    //   16104: ldc2_w 1134233029
    //   16107: l2i
    //   16108: ldc_w 1976232723
    //   16111: ixor
    //   16112: ixor
    //   16113: lookupswitch default -> 16140, -1440634692 -> 16096, 209631810 -> 30730
    //   16140: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   16143: getstatic Perryc.c : I
    //   16146: iflt -> 16160
    //   16149: ldc2_w -976179852
    //   16152: l2i
    //   16153: ldc_w -681914759
    //   16156: ixor
    //   16157: goto -> 16168
    //   16160: ldc2_w -848250589
    //   16163: l2i
    //   16164: ldc_w -400044624
    //   16167: ixor
    //   16168: ldc2_w -1554597759
    //   16171: l2i
    //   16172: ldc_w 1289967391
    //   16175: ixor
    //   16176: ixor
    //   16177: lookupswitch default -> 31380, -891118835 -> 16204, -46166893 -> 16160
    //   16204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   16207: getstatic Perryc.1 : I
    //   16210: ifeq -> 16224
    //   16213: ldc2_w -438664695
    //   16216: l2i
    //   16217: ldc_w -14417153
    //   16220: ixor
    //   16221: goto -> 16232
    //   16224: ldc2_w -1423298474
    //   16227: l2i
    //   16228: ldc_w -831581528
    //   16231: ixor
    //   16232: ldc2_w 673207658
    //   16235: l2i
    //   16236: ldc_w 621667662
    //   16239: ixor
    //   16240: ixor
    //   16241: lookupswitch default -> 16268, 399716562 -> 31264, 594390487 -> 16224
    //   16268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16271: getstatic Perryc.1 : I
    //   16274: ifeq -> 16288
    //   16277: ldc2_w -536533738
    //   16280: l2i
    //   16281: ldc_w -2044747064
    //   16284: ixor
    //   16285: goto -> 16296
    //   16288: ldc2_w 1915856288
    //   16291: l2i
    //   16292: ldc_w -467083231
    //   16295: ixor
    //   16296: ldc2_w -251498701
    //   16299: l2i
    //   16300: ldc_w 2085785183
    //   16303: ixor
    //   16304: ixor
    //   16305: lookupswitch default -> 16332, -347445582 -> 31208, 1317994181 -> 16288
    //   16332: putfield stopFPWhenSword : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16335: getstatic Perryc.c : I
    //   16338: iflt -> 16352
    //   16341: ldc2_w -294199367
    //   16344: l2i
    //   16345: ldc_w -1568500701
    //   16348: ixor
    //   16349: goto -> 16360
    //   16352: ldc2_w 857254784
    //   16355: l2i
    //   16356: ldc_w 637697830
    //   16359: ixor
    //   16360: ldc2_w 1763639538
    //   16363: l2i
    //   16364: ldc_w -1017492721
    //   16367: ixor
    //   16368: ixor
    //   16369: lookupswitch default -> 16396, -424607641 -> 30912, -415236596 -> 16352
    //   16396: aload_0
    //   16397: getstatic Perryc.0 : I
    //   16400: ifle -> 16414
    //   16403: ldc2_w -1258516662
    //   16406: l2i
    //   16407: ldc_w 943774198
    //   16410: ixor
    //   16411: goto -> 16422
    //   16414: ldc2_w -391056275
    //   16417: l2i
    //   16418: ldc_w 989130425
    //   16421: ixor
    //   16422: ldc2_w -1011083877
    //   16425: l2i
    //   16426: ldc_w -1826081967
    //   16429: ixor
    //   16430: ixor
    //   16431: lookupswitch default -> 30504, -2100282338 -> 16456, -601329546 -> 16414
    //   16456: aload_0
    //   16457: new bigname/zprestige/webhack/features/setting/Setting
    //   16460: dup
    //   16461: ldc_w '贸㌖赴㶥㩪掹๷蹗暇㗖ਤ䃑'
    //   16464: getstatic Perryc.c : I
    //   16467: iflt -> 16481
    //   16470: ldc2_w -80224342
    //   16473: l2i
    //   16474: ldc_w 1466084105
    //   16477: ixor
    //   16478: goto -> 16489
    //   16481: ldc2_w 1362249201
    //   16484: l2i
    //   16485: ldc_w 1985527143
    //   16488: ixor
    //   16489: ldc2_w -292353227
    //   16492: l2i
    //   16493: ldc_w -1253615961
    //   16496: ixor
    //   16497: ixor
    //   16498: lookupswitch default -> 16524, -1448674413 -> 16481, -142530255 -> 30574
    //   16524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16527: ldc2_w 666058063
    //   16530: l2i
    //   16531: ldc_w 666058063
    //   16534: ixor
    //   16535: getstatic Perryc.0 : I
    //   16538: ifle -> 16552
    //   16541: ldc2_w 666910203
    //   16544: l2i
    //   16545: ldc_w 233360625
    //   16548: ixor
    //   16549: goto -> 16560
    //   16552: ldc2_w 1462388838
    //   16555: l2i
    //   16556: ldc_w -1481561870
    //   16559: ixor
    //   16560: ldc2_w 557924750
    //   16563: l2i
    //   16564: ldc_w 1257604230
    //   16567: ixor
    //   16568: ixor
    //   16569: lookupswitch default -> 31146, -1691376228 -> 16596, 1100755970 -> 16552
    //   16596: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   16599: getstatic Perryc.c : I
    //   16602: iflt -> 16616
    //   16605: ldc2_w -358900056
    //   16608: l2i
    //   16609: ldc_w 1516448272
    //   16612: ixor
    //   16613: goto -> 16624
    //   16616: ldc2_w 1887786742
    //   16619: l2i
    //   16620: ldc_w 871968216
    //   16623: ixor
    //   16624: ldc2_w 224301490
    //   16627: l2i
    //   16628: ldc_w 1532090920
    //   16631: ixor
    //   16632: ixor
    //   16633: lookupswitch default -> 16660, -1845484446 -> 16616, -419954910 -> 30586
    //   16660: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   16663: getstatic Perryc.c : I
    //   16666: iflt -> 16680
    //   16669: ldc2_w -1413753962
    //   16672: l2i
    //   16673: ldc_w -1302758017
    //   16676: ixor
    //   16677: goto -> 16688
    //   16680: ldc2_w 1220279714
    //   16683: l2i
    //   16684: ldc_w 1352268286
    //   16687: ixor
    //   16688: ldc2_w -1257806234
    //   16691: l2i
    //   16692: ldc_w -1363833983
    //   16695: ixor
    //   16696: ixor
    //   16697: lookupswitch default -> 16724, -1333376730 -> 16680, 38814478 -> 30698
    //   16724: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16727: getstatic Perryc.1 : I
    //   16730: ifeq -> 16744
    //   16733: ldc2_w 1129026543
    //   16736: l2i
    //   16737: ldc_w -1186815504
    //   16740: ixor
    //   16741: goto -> 16752
    //   16744: ldc2_w -548290819
    //   16747: l2i
    //   16748: ldc_w 555520002
    //   16751: ixor
    //   16752: ldc2_w 1479654212
    //   16755: l2i
    //   16756: ldc_w -1176007963
    //   16759: ixor
    //   16760: ixor
    //   16761: lookupswitch default -> 16788, -1270827077 -> 16744, 467600318 -> 30632
    //   16788: putfield ignoreTerrain : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16791: getstatic Perryc.0 : I
    //   16794: ifle -> 16808
    //   16797: ldc2_w -726071380
    //   16800: l2i
    //   16801: ldc_w -1526549436
    //   16804: ixor
    //   16805: goto -> 16816
    //   16808: ldc2_w -518401989
    //   16811: l2i
    //   16812: ldc_w -773049135
    //   16815: ixor
    //   16816: ldc2_w -1468781471
    //   16819: l2i
    //   16820: ldc_w -1546962938
    //   16823: ixor
    //   16824: ixor
    //   16825: lookupswitch default -> 31002, 994766989 -> 16852, 2047125391 -> 16808
    //   16852: aload_0
    //   16853: getstatic Perryc.c : I
    //   16856: iflt -> 16870
    //   16859: ldc2_w 1535582698
    //   16862: l2i
    //   16863: ldc_w 1925148209
    //   16866: ixor
    //   16867: goto -> 16878
    //   16870: ldc2_w -323252239
    //   16873: l2i
    //   16874: ldc_w -1663862710
    //   16877: ixor
    //   16878: ldc2_w -606870015
    //   16881: l2i
    //   16882: ldc_w -1301788866
    //   16885: ixor
    //   16886: ixor
    //   16887: lookupswitch default -> 16912, 1082388196 -> 30716, 1631053809 -> 16870
    //   16912: aload_0
    //   16913: new bigname/zprestige/webhack/features/setting/Setting
    //   16916: dup
    //   16917: ldc_w '贯㌁赿㶤㩿掱๵蹀暝㗒ਤ䃟'
    //   16920: getstatic Perryc.0 : I
    //   16923: ifle -> 16937
    //   16926: ldc2_w -1754955962
    //   16929: l2i
    //   16930: ldc_w -2037139773
    //   16933: ixor
    //   16934: goto -> 16945
    //   16937: ldc2_w 1568263358
    //   16940: l2i
    //   16941: ldc_w 913998047
    //   16944: ixor
    //   16945: ldc2_w -1381321246
    //   16948: l2i
    //   16949: ldc_w -1755059566
    //   16952: ixor
    //   16953: ixor
    //   16954: lookupswitch default -> 31358, 725587701 -> 16937, 1372197649 -> 16980
    //   16980: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16983: ldc2_w 1990049074
    //   16986: l2i
    //   16987: ldc_w 1990049074
    //   16990: ixor
    //   16991: getstatic Perryc.c : I
    //   16994: iflt -> 17008
    //   16997: ldc2_w -152814967
    //   17000: l2i
    //   17001: ldc_w -1455950852
    //   17004: ixor
    //   17005: goto -> 17016
    //   17008: ldc2_w -356978390
    //   17011: l2i
    //   17012: ldc_w 577306509
    //   17015: ixor
    //   17016: ldc2_w -2086913383
    //   17019: l2i
    //   17020: ldc_w -258578041
    //   17023: ixor
    //   17024: ixor
    //   17025: lookupswitch default -> 17052, 38109134 -> 17008, 752458347 -> 31296
    //   17052: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   17055: getstatic Perryc.1 : I
    //   17058: ifeq -> 17072
    //   17061: ldc2_w -483193163
    //   17064: l2i
    //   17065: ldc_w -884459990
    //   17068: ixor
    //   17069: goto -> 17080
    //   17072: ldc2_w 1343600098
    //   17075: l2i
    //   17076: ldc_w 2121714531
    //   17079: ixor
    //   17080: ldc2_w -514860208
    //   17083: l2i
    //   17084: ldc_w -1612307347
    //   17087: ixor
    //   17088: ixor
    //   17089: lookupswitch default -> 30820, 1355448764 -> 17116, 1456654242 -> 17072
    //   17116: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   17119: getstatic Perryc.1 : I
    //   17122: ifeq -> 17136
    //   17125: ldc2_w 225081751
    //   17128: l2i
    //   17129: ldc_w -510275113
    //   17132: ixor
    //   17133: goto -> 17144
    //   17136: ldc2_w -1983944425
    //   17139: l2i
    //   17140: ldc_w -1170241740
    //   17143: ixor
    //   17144: ldc2_w -1198578054
    //   17147: l2i
    //   17148: ldc_w 422638588
    //   17151: ixor
    //   17152: ixor
    //   17153: lookupswitch default -> 17180, -854483921 -> 17136, 1296072134 -> 30724
    //   17180: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17183: getstatic Perryc.0 : I
    //   17186: ifle -> 17200
    //   17189: ldc2_w -1615520778
    //   17192: l2i
    //   17193: ldc_w 570785115
    //   17196: ixor
    //   17197: goto -> 17208
    //   17200: ldc2_w 1946109702
    //   17203: l2i
    //   17204: ldc_w -1323777548
    //   17207: ixor
    //   17208: ldc2_w 1710233964
    //   17211: l2i
    //   17212: ldc_w 416951659
    //   17215: ixor
    //   17216: ixor
    //   17217: lookupswitch default -> 17244, -1063628118 -> 30996, 36472630 -> 17200
    //   17244: putfield crystalLogic : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17247: getstatic Perryc.1 : I
    //   17250: ifeq -> 17264
    //   17253: ldc2_w -584549794
    //   17256: l2i
    //   17257: ldc_w 126614440
    //   17260: ixor
    //   17261: goto -> 17272
    //   17264: ldc2_w 1210502774
    //   17267: l2i
    //   17268: ldc_w 1313113324
    //   17271: ixor
    //   17272: ldc2_w -1848220649
    //   17275: l2i
    //   17276: ldc_w 1877191148
    //   17279: ixor
    //   17280: ixor
    //   17281: lookupswitch default -> 30664, -128481439 -> 17308, 613829645 -> 17264
    //   17308: aload_0
    //   17309: getstatic Perryc.1 : I
    //   17312: ifeq -> 17326
    //   17315: ldc2_w -3598456
    //   17318: l2i
    //   17319: ldc_w 1190748653
    //   17322: ixor
    //   17323: goto -> 17334
    //   17326: ldc2_w 1768750412
    //   17329: l2i
    //   17330: ldc_w -334128473
    //   17333: ixor
    //   17334: ldc2_w -1246522670
    //   17337: l2i
    //   17338: ldc_w -1229786333
    //   17341: ixor
    //   17342: ixor
    //   17343: lookupswitch default -> 17368, -1171187820 -> 31112, 509528990 -> 17326
    //   17368: aload_0
    //   17369: new bigname/zprestige/webhack/features/setting/Setting
    //   17372: dup
    //   17373: ldc_w '赝㍝贷㷤'
    //   17376: getstatic Perryc.0 : I
    //   17379: ifle -> 17393
    //   17382: ldc2_w 1516162224
    //   17385: l2i
    //   17386: ldc_w 1948183912
    //   17389: ixor
    //   17390: goto -> 17401
    //   17393: ldc2_w 311356690
    //   17396: l2i
    //   17397: ldc_w 480842807
    //   17400: ixor
    //   17401: ldc2_w -1630868941
    //   17404: l2i
    //   17405: ldc_w -2046967867
    //   17408: ixor
    //   17409: ixor
    //   17410: lookupswitch default -> 30960, 353414355 -> 17436, 897020974 -> 17393
    //   17436: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17439: ldc2_w -795994495
    //   17442: l2i
    //   17443: ldc_w -795994495
    //   17446: ixor
    //   17447: getstatic Perryc.0 : I
    //   17450: ifle -> 17464
    //   17453: ldc2_w 1165265136
    //   17456: l2i
    //   17457: ldc_w -1016650995
    //   17460: ixor
    //   17461: goto -> 17472
    //   17464: ldc2_w -1579776609
    //   17467: l2i
    //   17468: ldc_w -807669185
    //   17471: ixor
    //   17472: ldc2_w -1134400287
    //   17475: l2i
    //   17476: ldc_w -569001152
    //   17479: ixor
    //   17480: ixor
    //   17481: lookupswitch default -> 17508, -1840155446 -> 17464, -463176612 -> 30982
    //   17508: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   17511: getstatic Perryc.1 : I
    //   17514: ifeq -> 17528
    //   17517: ldc2_w 1966831445
    //   17520: l2i
    //   17521: ldc_w -1959172510
    //   17524: ixor
    //   17525: goto -> 17536
    //   17528: ldc2_w 1368947702
    //   17531: l2i
    //   17532: ldc_w -1935463802
    //   17535: ixor
    //   17536: ldc2_w -358797541
    //   17539: l2i
    //   17540: ldc_w 1481378306
    //   17543: ixor
    //   17544: ixor
    //   17545: lookupswitch default -> 30618, 1288909870 -> 17528, 1877636201 -> 17572
    //   17572: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   17575: getstatic Perryc.c : I
    //   17578: iflt -> 17592
    //   17581: ldc2_w 1012371337
    //   17584: l2i
    //   17585: ldc_w 456842668
    //   17588: ixor
    //   17589: goto -> 17600
    //   17592: ldc2_w -2102071194
    //   17595: l2i
    //   17596: ldc_w -1894710619
    //   17599: ixor
    //   17600: ldc2_w 1456869949
    //   17603: l2i
    //   17604: ldc_w 1269921950
    //   17607: ixor
    //   17608: ixor
    //   17609: lookupswitch default -> 17636, 973748358 -> 31182, 1666990823 -> 17592
    //   17636: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17639: getstatic Perryc.1 : I
    //   17642: ifeq -> 17656
    //   17645: ldc2_w -1823863159
    //   17648: l2i
    //   17649: ldc_w -1822342883
    //   17652: ixor
    //   17653: goto -> 17664
    //   17656: ldc2_w 718232409
    //   17659: l2i
    //   17660: ldc_w 1441241969
    //   17663: ixor
    //   17664: ldc2_w 988514217
    //   17667: l2i
    //   17668: ldc_w -195992304
    //   17671: ixor
    //   17672: ixor
    //   17673: lookupswitch default -> 17700, -829313747 -> 31290, 896503874 -> 17656
    //   17700: putfield thirtheen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17703: getstatic Perryc.1 : I
    //   17706: ifeq -> 17720
    //   17709: ldc2_w 1840687620
    //   17712: l2i
    //   17713: ldc_w -102416988
    //   17716: ixor
    //   17717: goto -> 17728
    //   17720: ldc2_w 476659772
    //   17723: l2i
    //   17724: ldc_w -1466773036
    //   17727: ixor
    //   17728: ldc2_w 1862798149
    //   17731: l2i
    //   17732: ldc_w 1436338265
    //   17735: ixor
    //   17736: ixor
    //   17737: lookupswitch default -> 17764, -1362668356 -> 31244, 1033152450 -> 17720
    //   17764: aload_0
    //   17765: getstatic Perryc.0 : I
    //   17768: ifle -> 17782
    //   17771: ldc2_w -1565943290
    //   17774: l2i
    //   17775: ldc_w 1457816858
    //   17778: ixor
    //   17779: goto -> 17790
    //   17782: ldc2_w 1848796068
    //   17785: l2i
    //   17786: ldc_w 1555200318
    //   17789: ixor
    //   17790: ldc2_w -789710930
    //   17793: l2i
    //   17794: ldc_w -1861572739
    //   17797: ixor
    //   17798: ixor
    //   17799: lookupswitch default -> 17824, -2028008140 -> 17782, -1247129649 -> 30714
    //   17824: aload_0
    //   17825: new bigname/zprestige/webhack/features/setting/Setting
    //   17828: dup
    //   17829: ldc_w '购㌇赲㶶㩨掻้蹠暞㗒ਲ਼'
    //   17832: getstatic Perryc.1 : I
    //   17835: ifeq -> 17849
    //   17838: ldc2_w 467532543
    //   17841: l2i
    //   17842: ldc_w -211260023
    //   17845: ixor
    //   17846: goto -> 17857
    //   17849: ldc2_w -451332965
    //   17852: l2i
    //   17853: ldc_w 610037724
    //   17856: ixor
    //   17857: ldc2_w -2123749181
    //   17860: l2i
    //   17861: ldc_w -1318661712
    //   17864: ixor
    //   17865: ixor
    //   17866: lookupswitch default -> 31020, -658936315 -> 17849, -246832588 -> 17892
    //   17892: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17895: ldc2_w -738305872
    //   17898: l2i
    //   17899: ldc_w -738305872
    //   17902: ixor
    //   17903: getstatic Perryc.c : I
    //   17906: iflt -> 17920
    //   17909: ldc2_w -407167927
    //   17912: l2i
    //   17913: ldc_w 1334295967
    //   17916: ixor
    //   17917: goto -> 17928
    //   17920: ldc2_w -615790203
    //   17923: l2i
    //   17924: ldc_w -1594900663
    //   17927: ixor
    //   17928: ldc2_w -301571621
    //   17931: l2i
    //   17932: ldc_w 153147059
    //   17935: ixor
    //   17936: ixor
    //   17937: lookupswitch default -> 30634, -1669152348 -> 17964, 1327109822 -> 17920
    //   17964: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   17967: getstatic Perryc.0 : I
    //   17970: ifle -> 17984
    //   17973: ldc2_w -94553849
    //   17976: l2i
    //   17977: ldc_w -439548685
    //   17980: ixor
    //   17981: goto -> 17992
    //   17984: ldc2_w 1938262289
    //   17987: l2i
    //   17988: ldc_w -2109131706
    //   17991: ixor
    //   17992: ldc2_w -104499665
    //   17995: l2i
    //   17996: ldc_w 1784316440
    //   17999: ixor
    //   18000: ixor
    //   18001: lookupswitch default -> 18028, -2053420747 -> 17984, -1945122365 -> 30528
    //   18028: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   18031: getstatic Perryc.1 : I
    //   18034: ifeq -> 18048
    //   18037: ldc2_w -853510567
    //   18040: l2i
    //   18041: ldc_w 1465217421
    //   18044: ixor
    //   18045: goto -> 18056
    //   18048: ldc2_w -359710612
    //   18051: l2i
    //   18052: ldc_w -2094402673
    //   18055: ixor
    //   18056: ldc2_w 1669941200
    //   18059: l2i
    //   18060: ldc_w 349983305
    //   18063: ixor
    //   18064: ixor
    //   18065: lookupswitch default -> 30850, -316665267 -> 18048, 519284346 -> 18092
    //   18092: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   18095: getstatic Perryc.c : I
    //   18098: iflt -> 18112
    //   18101: ldc2_w 1379911930
    //   18104: l2i
    //   18105: ldc_w -54758347
    //   18108: ixor
    //   18109: goto -> 18120
    //   18112: ldc2_w 2132104806
    //   18115: l2i
    //   18116: ldc_w 444514061
    //   18119: ixor
    //   18120: ldc2_w 1106744285
    //   18123: l2i
    //   18124: ldc_w 1431165807
    //   18127: ixor
    //   18128: ixor
    //   18129: lookupswitch default -> 30516, -1170606979 -> 18112, 1909563865 -> 18156
    //   18156: putfield attackPacket : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18159: getstatic Perryc.c : I
    //   18162: iflt -> 18176
    //   18165: ldc2_w 46375768
    //   18168: l2i
    //   18169: ldc_w -419687392
    //   18172: ixor
    //   18173: goto -> 18184
    //   18176: ldc2_w -277658893
    //   18179: l2i
    //   18180: ldc_w 1698783412
    //   18183: ixor
    //   18184: ldc2_w -1424506559
    //   18187: l2i
    //   18188: ldc_w -494751332
    //   18191: ixor
    //   18192: ixor
    //   18193: lookupswitch default -> 30952, -1381316699 -> 18176, -1012444518 -> 18220
    //   18220: aload_0
    //   18221: getstatic Perryc.c : I
    //   18224: iflt -> 18238
    //   18227: ldc2_w -1737081000
    //   18230: l2i
    //   18231: ldc_w -1359255952
    //   18234: ixor
    //   18235: goto -> 18246
    //   18238: ldc2_w -691101686
    //   18241: l2i
    //   18242: ldc_w 1203894618
    //   18245: ixor
    //   18246: ldc2_w 616161937
    //   18249: l2i
    //   18250: ldc_w 2017824378
    //   18253: ixor
    //   18254: ixor
    //   18255: lookupswitch default -> 18280, 1012124517 -> 18238, 1785804227 -> 30872
    //   18280: aload_0
    //   18281: new bigname/zprestige/webhack/features/setting/Setting
    //   18284: dup
    //   18285: ldc_w '购㌁赫㶸㩾探ู蹦暆㗃ਵ䃛煸ၻ'
    //   18288: getstatic Perryc.0 : I
    //   18291: ifle -> 18305
    //   18294: ldc2_w -1534767815
    //   18297: l2i
    //   18298: ldc_w 1037542467
    //   18301: ixor
    //   18302: goto -> 18313
    //   18305: ldc2_w 1835255007
    //   18308: l2i
    //   18309: ldc_w 1283452583
    //   18312: ixor
    //   18313: ldc2_w 108494138
    //   18316: l2i
    //   18317: ldc_w 1166853594
    //   18320: ixor
    //   18321: ixor
    //   18322: lookupswitch default -> 30728, -626437734 -> 18305, 1659343512 -> 18348
    //   18348: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18351: ldc2_w -1325221348
    //   18354: l2i
    //   18355: ldc_w -1325221348
    //   18358: ixor
    //   18359: getstatic Perryc.c : I
    //   18362: iflt -> 18376
    //   18365: ldc2_w 867593609
    //   18368: l2i
    //   18369: ldc_w 743232822
    //   18372: ixor
    //   18373: goto -> 18384
    //   18376: ldc2_w 758403599
    //   18379: l2i
    //   18380: ldc_w -1424689216
    //   18383: ixor
    //   18384: ldc2_w -1468829873
    //   18387: l2i
    //   18388: ldc_w 420528527
    //   18391: ixor
    //   18392: ixor
    //   18393: lookupswitch default -> 18420, -1365698945 -> 30816, 422582100 -> 18376
    //   18420: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   18423: getstatic Perryc.1 : I
    //   18426: ifeq -> 18440
    //   18429: ldc2_w 1540692828
    //   18432: l2i
    //   18433: ldc_w -1297634928
    //   18436: ixor
    //   18437: goto -> 18448
    //   18440: ldc2_w 1792000318
    //   18443: l2i
    //   18444: ldc_w -1770982729
    //   18447: ixor
    //   18448: ldc2_w 1674732820
    //   18451: l2i
    //   18452: ldc_w 588946243
    //   18455: ixor
    //   18456: ixor
    //   18457: lookupswitch default -> 30468, -1447408485 -> 18440, -1132999202 -> 18484
    //   18484: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   18487: getstatic Perryc.0 : I
    //   18490: ifle -> 18504
    //   18493: ldc2_w 1592271400
    //   18496: l2i
    //   18497: ldc_w 1199559180
    //   18500: ixor
    //   18501: goto -> 18512
    //   18504: ldc2_w -449226760
    //   18507: l2i
    //   18508: ldc_w -938196376
    //   18511: ixor
    //   18512: ldc2_w 1441519288
    //   18515: l2i
    //   18516: ldc_w 326325661
    //   18519: ixor
    //   18520: ixor
    //   18521: lookupswitch default -> 18548, 1594848001 -> 30492, 1690673769 -> 18504
    //   18548: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   18551: getstatic Perryc.0 : I
    //   18554: ifle -> 18568
    //   18557: ldc2_w -1286938019
    //   18560: l2i
    //   18561: ldc_w -2088949169
    //   18564: ixor
    //   18565: goto -> 18576
    //   18568: ldc2_w 1928212245
    //   18571: l2i
    //   18572: ldc_w 80479558
    //   18575: ixor
    //   18576: ldc2_w -475648688
    //   18579: l2i
    //   18580: ldc_w 1560871224
    //   18583: ixor
    //   18584: ixor
    //   18585: lookupswitch default -> 18612, -1902582662 -> 31322, 1179799082 -> 18568
    //   18612: putfield fuckArmour : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18615: getstatic Perryc.1 : I
    //   18618: ifeq -> 18632
    //   18621: ldc2_w 765975750
    //   18624: l2i
    //   18625: ldc_w 785396203
    //   18628: ixor
    //   18629: goto -> 18640
    //   18632: ldc2_w -554971241
    //   18635: l2i
    //   18636: ldc_w 1033169710
    //   18639: ixor
    //   18640: ldc2_w 335579362
    //   18643: l2i
    //   18644: ldc_w -682189362
    //   18647: ixor
    //   18648: ixor
    //   18649: lookupswitch default -> 30666, -1071515647 -> 18632, 539570581 -> 18676
    //   18676: aload_0
    //   18677: getstatic Perryc.c : I
    //   18680: iflt -> 18694
    //   18683: ldc2_w 60507523
    //   18686: l2i
    //   18687: ldc_w -49749318
    //   18690: ixor
    //   18691: goto -> 18702
    //   18694: ldc2_w -1768995210
    //   18697: l2i
    //   18698: ldc_w -1845773555
    //   18701: ixor
    //   18702: ldc2_w 715080775
    //   18705: l2i
    //   18706: ldc_w -594220032
    //   18709: ixor
    //   18710: ixor
    //   18711: lookupswitch default -> 18736, 144183166 -> 30580, 1655011287 -> 18694
    //   18736: aload_0
    //   18737: new bigname/zprestige/webhack/features/setting/Setting
    //   18740: dup
    //   18741: ldc_w '购㌁赫㶸㩾探ู蹫暇㗒਴䃜煮ၭ'
    //   18744: getstatic Perryc.1 : I
    //   18747: ifeq -> 18761
    //   18750: ldc2_w -963319425
    //   18753: l2i
    //   18754: ldc_w -1230796665
    //   18757: ixor
    //   18758: goto -> 18769
    //   18761: ldc2_w 445090043
    //   18764: l2i
    //   18765: ldc_w -1542795695
    //   18768: ixor
    //   18769: ldc2_w 980583226
    //   18772: l2i
    //   18773: ldc_w 1142939094
    //   18776: ixor
    //   18777: ixor
    //   18778: lookupswitch default -> 18804, -337990161 -> 18761, 240795412 -> 31372
    //   18804: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18807: ldc2_w -1635303381
    //   18810: l2i
    //   18811: ldc_w -1635303381
    //   18814: ixor
    //   18815: getstatic Perryc.1 : I
    //   18818: ifeq -> 18832
    //   18821: ldc2_w 628035379
    //   18824: l2i
    //   18825: ldc_w -1880271931
    //   18828: ixor
    //   18829: goto -> 18840
    //   18832: ldc2_w 1779772680
    //   18835: l2i
    //   18836: ldc_w -1179197155
    //   18839: ixor
    //   18840: ldc2_w 1687349070
    //   18843: l2i
    //   18844: ldc_w 294284824
    //   18847: ixor
    //   18848: ixor
    //   18849: lookupswitch default -> 18876, -543500896 -> 31282, 958484147 -> 18832
    //   18876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18879: ldc2_w 1305889169
    //   18882: l2i
    //   18883: ldc_w 1305889169
    //   18886: ixor
    //   18887: getstatic Perryc.c : I
    //   18890: iflt -> 18904
    //   18893: ldc2_w -705897019
    //   18896: l2i
    //   18897: ldc_w -745043598
    //   18900: ixor
    //   18901: goto -> 18912
    //   18904: ldc2_w -351754884
    //   18907: l2i
    //   18908: ldc_w 1101486439
    //   18911: ixor
    //   18912: ldc2_w -676213026
    //   18915: l2i
    //   18916: ldc_w -964324165
    //   18919: ixor
    //   18920: ixor
    //   18921: lookupswitch default -> 31038, -1147427202 -> 18948, 391057106 -> 18904
    //   18948: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18951: ldc2_w 1596357703
    //   18954: l2i
    //   18955: ldc_w 1596357709
    //   18958: ixor
    //   18959: getstatic Perryc.1 : I
    //   18962: ifeq -> 18976
    //   18965: ldc2_w 1674282501
    //   18968: l2i
    //   18969: ldc_w 1021882964
    //   18972: ixor
    //   18973: goto -> 18984
    //   18976: ldc2_w 1543271339
    //   18979: l2i
    //   18980: ldc_w 1193173359
    //   18983: ixor
    //   18984: ldc2_w -2061123427
    //   18987: l2i
    //   18988: ldc_w 204729371
    //   18991: ixor
    //   18992: ixor
    //   18993: lookupswitch default -> 30570, -1779155390 -> 19020, -701163305 -> 18976
    //   19020: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19023: getstatic Perryc.0 : I
    //   19026: ifle -> 19040
    //   19029: ldc2_w 1190732200
    //   19032: l2i
    //   19033: ldc_w 1240212533
    //   19036: ixor
    //   19037: goto -> 19048
    //   19040: ldc2_w 361121375
    //   19043: l2i
    //   19044: ldc_w -158801547
    //   19047: ixor
    //   19048: ldc2_w -2019103926
    //   19051: l2i
    //   19052: ldc_w 1467865971
    //   19055: ixor
    //   19056: ixor
    //   19057: lookupswitch default -> 19084, -1744385590 -> 19040, -540133980 -> 31094
    //   19084: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   19087: getstatic Perryc.0 : I
    //   19090: ifle -> 19104
    //   19093: ldc2_w 2133044495
    //   19096: l2i
    //   19097: ldc_w -1424375308
    //   19100: ixor
    //   19101: goto -> 19112
    //   19104: ldc2_w 2095132499
    //   19107: l2i
    //   19108: ldc_w 590047680
    //   19111: ixor
    //   19112: ldc2_w 1548328519
    //   19115: l2i
    //   19116: ldc_w -1685678513
    //   19119: ixor
    //   19120: ixor
    //   19121: lookupswitch default -> 31286, -1744482661 -> 19148, 334849267 -> 19104
    //   19148: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   19151: getstatic Perryc.1 : I
    //   19154: ifeq -> 19168
    //   19157: ldc2_w -96122383
    //   19160: l2i
    //   19161: ldc_w 1255272781
    //   19164: ixor
    //   19165: goto -> 19176
    //   19168: ldc2_w 1840461834
    //   19171: l2i
    //   19172: ldc_w 1658961930
    //   19175: ixor
    //   19176: ldc2_w 1196871743
    //   19179: l2i
    //   19180: ldc_w -292355406
    //   19183: ixor
    //   19184: ixor
    //   19185: lookupswitch default -> 19212, -1189806980 -> 19168, 424766001 -> 30924
    //   19212: putfield fuckArmourHP : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19215: getstatic Perryc.0 : I
    //   19218: ifle -> 19232
    //   19221: ldc2_w 1613886158
    //   19224: l2i
    //   19225: ldc_w 492507746
    //   19228: ixor
    //   19229: goto -> 19240
    //   19232: ldc2_w -659946469
    //   19235: l2i
    //   19236: ldc_w 834843471
    //   19239: ixor
    //   19240: ldc2_w 130165851
    //   19243: l2i
    //   19244: ldc_w 1110185376
    //   19247: ixor
    //   19248: ixor
    //   19249: lookupswitch default -> 19276, -1299445837 -> 19232, 948230487 -> 30720
    //   19276: aload_0
    //   19277: getstatic Perryc.1 : I
    //   19280: ifeq -> 19294
    //   19283: ldc2_w -938327388
    //   19286: l2i
    //   19287: ldc_w -115433308
    //   19290: ixor
    //   19291: goto -> 19302
    //   19294: ldc2_w -839953102
    //   19297: l2i
    //   19298: ldc_w -1812468328
    //   19301: ixor
    //   19302: ldc2_w 165239167
    //   19305: l2i
    //   19306: ldc_w -958802723
    //   19309: ixor
    //   19310: ixor
    //   19311: lookupswitch default -> 30686, -1860684536 -> 19336, -32739422 -> 19294
    //   19336: aload_0
    //   19337: new bigname/zprestige/webhack/features/setting/Setting
    //   19340: dup
    //   19341: ldc_w '贡㌆赲㶻㩢掠๵蹠暐'
    //   19344: getstatic Perryc.0 : I
    //   19347: ifle -> 19361
    //   19350: ldc2_w 1591502117
    //   19353: l2i
    //   19354: ldc_w -921910237
    //   19357: ixor
    //   19358: goto -> 19369
    //   19361: ldc2_w -1513020543
    //   19364: l2i
    //   19365: ldc_w 1713257363
    //   19368: ixor
    //   19369: ldc2_w 1693654317
    //   19372: l2i
    //   19373: ldc_w 1713239012
    //   19376: ixor
    //   19377: ixor
    //   19378: lookupswitch default -> 31160, -1791078449 -> 19361, -1054738725 -> 19404
    //   19404: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   19407: ldc2_w -998857277
    //   19410: l2i
    //   19411: ldc_w -998857277
    //   19414: ixor
    //   19415: getstatic Perryc.1 : I
    //   19418: ifeq -> 19432
    //   19421: ldc2_w 544495656
    //   19424: l2i
    //   19425: ldc_w -7858522
    //   19428: ixor
    //   19429: goto -> 19440
    //   19432: ldc2_w 574531083
    //   19435: l2i
    //   19436: ldc_w 1175348382
    //   19439: ixor
    //   19440: ldc2_w 867010917
    //   19443: l2i
    //   19444: ldc_w 1006601293
    //   19447: ixor
    //   19448: ixor
    //   19449: lookupswitch default -> 19476, -2056523578 -> 19432, -676445274 -> 30534
    //   19476: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   19479: getstatic Perryc.1 : I
    //   19482: ifeq -> 19496
    //   19485: ldc2_w -93774139
    //   19488: l2i
    //   19489: ldc_w -752513432
    //   19492: ixor
    //   19493: goto -> 19504
    //   19496: ldc2_w 1114619386
    //   19499: l2i
    //   19500: ldc_w 1030531283
    //   19503: ixor
    //   19504: ldc2_w 1930211197
    //   19507: l2i
    //   19508: ldc_w -1947776372
    //   19511: ixor
    //   19512: ixor
    //   19513: lookupswitch default -> 19540, -777554596 -> 30506, 948187890 -> 19496
    //   19540: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   19543: getstatic Perryc.0 : I
    //   19546: ifle -> 19560
    //   19549: ldc2_w -40500316
    //   19552: l2i
    //   19553: ldc_w 570475603
    //   19556: ixor
    //   19557: goto -> 19568
    //   19560: ldc2_w 155638842
    //   19563: l2i
    //   19564: ldc_w 1428069635
    //   19567: ixor
    //   19568: ldc2_w -804118980
    //   19571: l2i
    //   19572: ldc_w 369632183
    //   19575: ixor
    //   19576: ixor
    //   19577: lookupswitch default -> 19604, -1515313845 -> 19560, 428669564 -> 30598
    //   19604: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   19607: getstatic Perryc.c : I
    //   19610: iflt -> 19624
    //   19613: ldc2_w 1260579971
    //   19616: l2i
    //   19617: ldc_w 1666916324
    //   19620: ixor
    //   19621: goto -> 19632
    //   19624: ldc2_w -1972152236
    //   19627: l2i
    //   19628: ldc_w -2097942526
    //   19631: ixor
    //   19632: ldc2_w 1584836425
    //   19635: l2i
    //   19636: ldc_w -1207709456
    //   19639: ixor
    //   19640: ixor
    //   19641: lookupswitch default -> 19668, -838038306 -> 30846, -652011412 -> 19624
    //   19668: putfield chainMode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19671: getstatic Perryc.0 : I
    //   19674: ifle -> 19688
    //   19677: ldc2_w -1134578689
    //   19680: l2i
    //   19681: ldc_w -826534164
    //   19684: ixor
    //   19685: goto -> 19696
    //   19688: ldc2_w -1886066046
    //   19691: l2i
    //   19692: ldc_w -1794149743
    //   19695: ixor
    //   19696: ldc2_w 1931827516
    //   19699: l2i
    //   19700: ldc_w -580847831
    //   19703: ixor
    //   19704: ixor
    //   19705: lookupswitch default -> 30688, -1260505594 -> 19732, -593097978 -> 19688
    //   19732: aload_0
    //   19733: getstatic Perryc.1 : I
    //   19736: ifeq -> 19750
    //   19739: ldc2_w 2043584632
    //   19742: l2i
    //   19743: ldc_w 1715210161
    //   19746: ixor
    //   19747: goto -> 19758
    //   19750: ldc2_w 1518650595
    //   19753: l2i
    //   19754: ldc_w -1729627615
    //   19757: ixor
    //   19758: ldc2_w -52260974
    //   19761: l2i
    //   19762: ldc_w 705999020
    //   19765: ixor
    //   19766: ixor
    //   19767: lookupswitch default -> 31008, -922445577 -> 19750, 345309692 -> 19792
    //   19792: aload_0
    //   19793: new bigname/zprestige/webhack/features/setting/Setting
    //   19796: dup
    //   19797: ldc_w '贡㌆赪㶣㩢掠๵蹠暐㖗ਆ䃙煮ၧ辋'
    //   19800: getstatic Perryc.1 : I
    //   19803: ifeq -> 19817
    //   19806: ldc2_w -1910592225
    //   19809: l2i
    //   19810: ldc_w 479210499
    //   19813: ixor
    //   19814: goto -> 19825
    //   19817: ldc2_w -956711130
    //   19820: l2i
    //   19821: ldc_w 200319961
    //   19824: ixor
    //   19825: ldc2_w 571388332
    //   19828: l2i
    //   19829: ldc_w 1215125420
    //   19832: ixor
    //   19833: ixor
    //   19834: lookupswitch default -> 30868, -1486161153 -> 19860, -118659300 -> 19817
    //   19860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   19863: ldc2_w 1079913330
    //   19866: l2i
    //   19867: ldc_w 1079913329
    //   19870: ixor
    //   19871: getstatic Perryc.c : I
    //   19874: iflt -> 19888
    //   19877: ldc2_w -1763370649
    //   19880: l2i
    //   19881: ldc_w 288156124
    //   19884: ixor
    //   19885: goto -> 19896
    //   19888: ldc2_w -558496733
    //   19891: l2i
    //   19892: ldc_w 34229834
    //   19895: ixor
    //   19896: ldc2_w 669544223
    //   19899: l2i
    //   19900: ldc_w 1257073880
    //   19903: ixor
    //   19904: ixor
    //   19905: lookupswitch default -> 19932, -355667076 -> 31318, 1197854870 -> 19888
    //   19932: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19935: ldc2_w 872157670
    //   19938: l2i
    //   19939: ldc_w 872157670
    //   19942: ixor
    //   19943: getstatic Perryc.c : I
    //   19946: iflt -> 19960
    //   19949: ldc2_w -87297937
    //   19952: l2i
    //   19953: ldc_w 880443567
    //   19956: ixor
    //   19957: goto -> 19968
    //   19960: ldc2_w 476086141
    //   19963: l2i
    //   19964: ldc_w -1694762191
    //   19967: ixor
    //   19968: ldc2_w -1944234688
    //   19971: l2i
    //   19972: ldc_w 1096987557
    //   19975: ixor
    //   19976: ixor
    //   19977: lookupswitch default -> 30494, 63870501 -> 19960, 1273258665 -> 20004
    //   20004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   20007: ldc2_w -611637057
    //   20010: l2i
    //   20011: ldc_w -611637067
    //   20014: ixor
    //   20015: getstatic Perryc.1 : I
    //   20018: ifeq -> 20032
    //   20021: ldc2_w 1914189879
    //   20024: l2i
    //   20025: ldc_w -411875910
    //   20028: ixor
    //   20029: goto -> 20040
    //   20032: ldc2_w -1600262110
    //   20035: l2i
    //   20036: ldc_w 1115235970
    //   20039: ixor
    //   20040: ldc2_w -412478272
    //   20043: l2i
    //   20044: ldc_w 1580634768
    //   20047: ixor
    //   20048: ixor
    //   20049: lookupswitch default -> 31108, 741866461 -> 20032, 1538806000 -> 20076
    //   20076: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   20079: getstatic Perryc.1 : I
    //   20082: ifeq -> 20096
    //   20085: ldc2_w -624077026
    //   20088: l2i
    //   20089: ldc_w -996944769
    //   20092: ixor
    //   20093: goto -> 20104
    //   20096: ldc2_w 1523149080
    //   20099: l2i
    //   20100: ldc_w 2002381620
    //   20103: ixor
    //   20104: ldc2_w -220363088
    //   20107: l2i
    //   20108: ldc_w 862459430
    //   20111: ixor
    //   20112: ixor
    //   20113: lookupswitch default -> 30630, -538242057 -> 20096, -333114694 -> 20140
    //   20140: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   20143: getstatic Perryc.0 : I
    //   20146: ifle -> 20160
    //   20149: ldc2_w -568613369
    //   20152: l2i
    //   20153: ldc_w 1780546288
    //   20156: ixor
    //   20157: goto -> 20168
    //   20160: ldc2_w -1575571375
    //   20163: l2i
    //   20164: ldc_w -1693123689
    //   20167: ixor
    //   20168: ldc2_w -849291071
    //   20171: l2i
    //   20172: ldc_w 281404368
    //   20175: ixor
    //   20176: ixor
    //   20177: lookupswitch default -> 31034, -458788649 -> 20204, 1771988966 -> 20160
    //   20204: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   20207: getstatic Perryc.0 : I
    //   20210: ifle -> 20224
    //   20213: ldc2_w -1549124002
    //   20216: l2i
    //   20217: ldc_w -238634983
    //   20220: ixor
    //   20221: goto -> 20232
    //   20224: ldc2_w -182421217
    //   20227: l2i
    //   20228: ldc_w 1045138756
    //   20231: ixor
    //   20232: ldc2_w 1981516217
    //   20235: l2i
    //   20236: ldc_w 542119238
    //   20239: ixor
    //   20240: ixor
    //   20241: lookupswitch default -> 20268, -1918550337 -> 20224, 69671608 -> 30904
    //   20268: putfield chainCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20271: getstatic Perryc.1 : I
    //   20274: ifeq -> 20288
    //   20277: ldc2_w 1339473188
    //   20280: l2i
    //   20281: ldc_w 562503404
    //   20284: ixor
    //   20285: goto -> 20296
    //   20288: ldc2_w 1111153886
    //   20291: l2i
    //   20292: ldc_w -1015639290
    //   20295: ixor
    //   20296: ldc2_w -876006298
    //   20299: l2i
    //   20300: ldc_w -37088835
    //   20303: ixor
    //   20304: ixor
    //   20305: lookupswitch default -> 20332, -1344726810 -> 20288, 1481803283 -> 31070
    //   20332: aload_0
    //   20333: getstatic Perryc.0 : I
    //   20336: ifle -> 20350
    //   20339: ldc2_w -163846071
    //   20342: l2i
    //   20343: ldc_w 1758413375
    //   20346: ixor
    //   20347: goto -> 20358
    //   20350: ldc2_w -1949006591
    //   20353: l2i
    //   20354: ldc_w -183976506
    //   20357: ixor
    //   20358: ldc2_w -1856634525
    //   20361: l2i
    //   20362: ldc_w 755428823
    //   20365: ixor
    //   20366: ixor
    //   20367: lookupswitch default -> 20392, 416997777 -> 20350, 581191362 -> 30898
    //   20392: aload_0
    //   20393: new bigname/zprestige/webhack/features/setting/Setting
    //   20396: dup
    //   20397: ldc_w '贡㌆赪㶣㩢掠๵蹠暐㖗ਔ䃀煤'
    //   20400: getstatic Perryc.1 : I
    //   20403: ifeq -> 20417
    //   20406: ldc2_w -1752847647
    //   20409: l2i
    //   20410: ldc_w 48924740
    //   20413: ixor
    //   20414: goto -> 20425
    //   20417: ldc2_w 686500385
    //   20420: l2i
    //   20421: ldc_w -1703677899
    //   20424: ixor
    //   20425: ldc2_w 2129957746
    //   20428: l2i
    //   20429: ldc_w -658833271
    //   20432: ixor
    //   20433: ixor
    //   20434: lookupswitch default -> 30832, 349653487 -> 20460, 857780574 -> 20417
    //   20460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   20463: ldc2_w 961760745
    //   20466: l2i
    //   20467: ldc_w 961760747
    //   20470: ixor
    //   20471: getstatic Perryc.1 : I
    //   20474: ifeq -> 20488
    //   20477: ldc2_w 2026675846
    //   20480: l2i
    //   20481: ldc_w 230390742
    //   20484: ixor
    //   20485: goto -> 20496
    //   20488: ldc2_w -1928893127
    //   20491: l2i
    //   20492: ldc_w 1284009042
    //   20495: ixor
    //   20496: ldc2_w -83233077
    //   20499: l2i
    //   20500: ldc_w 1286436053
    //   20503: ixor
    //   20504: ixor
    //   20505: lookupswitch default -> 20532, -1026332850 -> 30638, 457392723 -> 20488
    //   20532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   20535: ldc2_w 1992076093
    //   20538: l2i
    //   20539: ldc_w 1992076093
    //   20542: ixor
    //   20543: getstatic Perryc.0 : I
    //   20546: ifle -> 20560
    //   20549: ldc2_w -594208135
    //   20552: l2i
    //   20553: ldc_w -825142772
    //   20556: ixor
    //   20557: goto -> 20568
    //   20560: ldc2_w 1616180931
    //   20563: l2i
    //   20564: ldc_w -1016456705
    //   20567: ixor
    //   20568: ldc2_w -1149596747
    //   20571: l2i
    //   20572: ldc_w -1931131235
    //   20575: ixor
    //   20576: ixor
    //   20577: lookupswitch default -> 20604, 635143517 -> 31154, 1996468092 -> 20560
    //   20604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   20607: ldc2_w -1667190173
    //   20610: l2i
    //   20611: ldc_w -1667190170
    //   20614: ixor
    //   20615: getstatic Perryc.0 : I
    //   20618: ifle -> 20632
    //   20621: ldc2_w 501256286
    //   20624: l2i
    //   20625: ldc_w 1357058583
    //   20628: ixor
    //   20629: goto -> 20640
    //   20632: ldc2_w -1053427238
    //   20635: l2i
    //   20636: ldc_w 214978287
    //   20639: ixor
    //   20640: ldc2_w -1092378153
    //   20643: l2i
    //   20644: ldc_w -840331025
    //   20647: ixor
    //   20648: ixor
    //   20649: lookupswitch default -> 20676, 1040823153 -> 30486, 1989520379 -> 20632
    //   20676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   20679: getstatic Perryc.c : I
    //   20682: iflt -> 20696
    //   20685: ldc2_w -168376543
    //   20688: l2i
    //   20689: ldc_w -561208453
    //   20692: ixor
    //   20693: goto -> 20704
    //   20696: ldc2_w 50114970
    //   20699: l2i
    //   20700: ldc_w -1891613444
    //   20703: ixor
    //   20704: ldc2_w -1138613151
    //   20707: l2i
    //   20708: ldc_w 2119603659
    //   20711: ixor
    //   20712: ixor
    //   20713: lookupswitch default -> 20740, -384903696 -> 30572, 1822391525 -> 20696
    //   20740: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   20743: getstatic Perryc.c : I
    //   20746: iflt -> 20760
    //   20749: ldc2_w -1702773800
    //   20752: l2i
    //   20753: ldc_w -831471355
    //   20756: ixor
    //   20757: goto -> 20768
    //   20760: ldc2_w -220325203
    //   20763: l2i
    //   20764: ldc_w -365029320
    //   20767: ixor
    //   20768: ldc2_w -1355636525
    //   20771: l2i
    //   20772: ldc_w -1614693709
    //   20775: ixor
    //   20776: ixor
    //   20777: lookupswitch default -> 30546, 672340213 -> 20804, 1677877437 -> 20760
    //   20804: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   20807: getstatic Perryc.c : I
    //   20810: iflt -> 20824
    //   20813: ldc2_w -822445510
    //   20816: l2i
    //   20817: ldc_w -1725451274
    //   20820: ixor
    //   20821: goto -> 20832
    //   20824: ldc2_w -564289227
    //   20827: l2i
    //   20828: ldc_w 676616516
    //   20831: ixor
    //   20832: ldc2_w -239010990
    //   20835: l2i
    //   20836: ldc_w 886802891
    //   20839: ixor
    //   20840: ixor
    //   20841: lookupswitch default -> 20868, -1832469675 -> 31184, -1254349093 -> 20824
    //   20868: putfield chainStep : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20871: getstatic Perryc.1 : I
    //   20874: ifeq -> 20888
    //   20877: ldc2_w -969849353
    //   20880: l2i
    //   20881: ldc_w 892266524
    //   20884: ixor
    //   20885: goto -> 20896
    //   20888: ldc2_w -1264522286
    //   20891: l2i
    //   20892: ldc_w -669976011
    //   20895: ixor
    //   20896: ldc2_w 1670563621
    //   20899: l2i
    //   20900: ldc_w 178309223
    //   20903: ixor
    //   20904: ixor
    //   20905: lookupswitch default -> 30568, -1708285271 -> 20888, 92413605 -> 20932
    //   20932: aload_0
    //   20933: getstatic Perryc.0 : I
    //   20936: ifle -> 20950
    //   20939: ldc2_w -321889004
    //   20942: l2i
    //   20943: ldc_w 501765443
    //   20946: ixor
    //   20947: goto -> 20958
    //   20950: ldc2_w 2121977734
    //   20953: l2i
    //   20954: ldc_w 354701302
    //   20957: ixor
    //   20958: ldc2_w 1806400325
    //   20961: l2i
    //   20962: ldc_w 1315836343
    //   20965: ixor
    //   20966: ixor
    //   20967: lookupswitch default -> 30680, -721591643 -> 20950, 1318840962 -> 20992
    //   20992: aload_0
    //   20993: new bigname/zprestige/webhack/features/setting/Setting
    //   20996: dup
    //   20997: ldc_w '贾㌖赨㶳㩮探'
    //   21000: getstatic Perryc.0 : I
    //   21003: ifle -> 21017
    //   21006: ldc2_w -13062216
    //   21009: l2i
    //   21010: ldc_w -1281296682
    //   21013: ixor
    //   21014: goto -> 21025
    //   21017: ldc2_w -1977848192
    //   21020: l2i
    //   21021: ldc_w -1712823534
    //   21024: ixor
    //   21025: ldc2_w 257647524
    //   21028: l2i
    //   21029: ldc_w -630802515
    //   21032: ixor
    //   21033: ixor
    //   21034: lookupswitch default -> 30470, -1717203609 -> 21017, -959850085 -> 21060
    //   21060: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   21063: ldc2_w -1482652783
    //   21066: l2i
    //   21067: ldc_w -1482652783
    //   21070: ixor
    //   21071: getstatic Perryc.0 : I
    //   21074: ifle -> 21088
    //   21077: ldc2_w 449575833
    //   21080: l2i
    //   21081: ldc_w 1450106524
    //   21084: ixor
    //   21085: goto -> 21096
    //   21088: ldc2_w 866792663
    //   21091: l2i
    //   21092: ldc_w 1883229622
    //   21095: ixor
    //   21096: ldc2_w 101113300
    //   21099: l2i
    //   21100: ldc_w 273313206
    //   21103: ixor
    //   21104: ixor
    //   21105: lookupswitch default -> 21132, -905994656 -> 21088, 1525257575 -> 30778
    //   21132: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   21135: getstatic Perryc.c : I
    //   21138: iflt -> 21152
    //   21141: ldc2_w 1356689095
    //   21144: l2i
    //   21145: ldc_w -736697102
    //   21148: ixor
    //   21149: goto -> 21160
    //   21152: ldc2_w -1052789943
    //   21155: l2i
    //   21156: ldc_w -326388793
    //   21159: ixor
    //   21160: ldc2_w -12849195
    //   21163: l2i
    //   21164: ldc_w -2083859848
    //   21167: ixor
    //   21168: ixor
    //   21169: lookupswitch default -> 31230, -130369640 -> 21152, 1363492131 -> 21196
    //   21196: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   21199: getstatic Perryc.1 : I
    //   21202: ifeq -> 21216
    //   21205: ldc2_w 1044217944
    //   21208: l2i
    //   21209: ldc_w 1728560087
    //   21212: ixor
    //   21213: goto -> 21224
    //   21216: ldc2_w 700445649
    //   21219: l2i
    //   21220: ldc_w 1037831029
    //   21223: ixor
    //   21224: ldc2_w -2011283112
    //   21227: l2i
    //   21228: ldc_w 807389523
    //   21231: ixor
    //   21232: ixor
    //   21233: lookupswitch default -> 31310, -1402834769 -> 21260, -516181116 -> 21216
    //   21260: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   21263: getstatic Perryc.c : I
    //   21266: iflt -> 21280
    //   21269: ldc2_w -1750106905
    //   21272: l2i
    //   21273: ldc_w -1097670832
    //   21276: ixor
    //   21277: goto -> 21288
    //   21280: ldc2_w 864848584
    //   21283: l2i
    //   21284: ldc_w -868615050
    //   21287: ixor
    //   21288: ldc2_w -302306424
    //   21291: l2i
    //   21292: ldc_w 413223610
    //   21295: ixor
    //   21296: ixor
    //   21297: lookupswitch default -> 21324, -811374253 -> 21280, -597179771 -> 31128
    //   21324: putfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21327: getstatic Perryc.0 : I
    //   21330: ifle -> 21344
    //   21333: ldc2_w -470105437
    //   21336: l2i
    //   21337: ldc_w 2014232337
    //   21340: ixor
    //   21341: goto -> 21352
    //   21344: ldc2_w 659320626
    //   21347: l2i
    //   21348: ldc_w -1560967334
    //   21351: ixor
    //   21352: ldc2_w 1845061859
    //   21355: l2i
    //   21356: ldc_w 1102244035
    //   21359: ixor
    //   21360: ixor
    //   21361: lookupswitch default -> 31110, -1443731384 -> 21388, -1212154478 -> 21344
    //   21388: aload_0
    //   21389: getstatic Perryc.0 : I
    //   21392: ifle -> 21406
    //   21395: ldc2_w 176818729
    //   21398: l2i
    //   21399: ldc_w 1451042471
    //   21402: ixor
    //   21403: goto -> 21414
    //   21406: ldc2_w 1417044273
    //   21409: l2i
    //   21410: ldc_w 1883640308
    //   21413: ixor
    //   21414: ldc2_w 1079507182
    //   21417: l2i
    //   21418: ldc_w -493732223
    //   21421: ixor
    //   21422: ixor
    //   21423: lookupswitch default -> 21448, -2002273237 -> 21406, -30217503 -> 30530
    //   21448: aload_0
    //   21449: new bigname/zprestige/webhack/features/setting/Setting
    //   21452: dup
    //   21453: ldc_w '贮㌜赾'
    //   21456: getstatic Perryc.0 : I
    //   21459: ifle -> 21473
    //   21462: ldc2_w 764090413
    //   21465: l2i
    //   21466: ldc_w -946957024
    //   21469: ixor
    //   21470: goto -> 21481
    //   21473: ldc2_w -1248571193
    //   21476: l2i
    //   21477: ldc_w 639645377
    //   21480: ixor
    //   21481: ldc2_w -197285915
    //   21484: l2i
    //   21485: ldc_w -793859054
    //   21488: ixor
    //   21489: ixor
    //   21490: lookupswitch default -> 30668, -1222152719 -> 21516, -828995846 -> 21473
    //   21516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   21519: ldc2_w -667089145
    //   21522: l2i
    //   21523: ldc_w -667089146
    //   21526: ixor
    //   21527: getstatic Perryc.0 : I
    //   21530: ifle -> 21544
    //   21533: ldc2_w 216745394
    //   21536: l2i
    //   21537: ldc_w -52239147
    //   21540: ixor
    //   21541: goto -> 21552
    //   21544: ldc2_w -702359970
    //   21547: l2i
    //   21548: ldc_w 1755344551
    //   21551: ixor
    //   21552: ldc2_w -1563408324
    //   21555: l2i
    //   21556: ldc_w -1225089932
    //   21559: ixor
    //   21560: ixor
    //   21561: lookupswitch default -> 30660, -1431802703 -> 21588, -467438289 -> 21544
    //   21588: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   21591: getstatic Perryc.0 : I
    //   21594: ifle -> 21608
    //   21597: ldc2_w -1906159010
    //   21600: l2i
    //   21601: ldc_w 912785791
    //   21604: ixor
    //   21605: goto -> 21616
    //   21608: ldc2_w 1252433867
    //   21611: l2i
    //   21612: ldc_w -617344190
    //   21615: ixor
    //   21616: ldc2_w 1977636402
    //   21619: l2i
    //   21620: ldc_w -743148316
    //   21623: ixor
    //   21624: ixor
    //   21625: lookupswitch default -> 21652, 284108686 -> 21608, 509506039 -> 30966
    //   21652: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   21655: getstatic Perryc.1 : I
    //   21658: ifeq -> 21672
    //   21661: ldc2_w -1524807108
    //   21664: l2i
    //   21665: ldc_w 2062085832
    //   21668: ixor
    //   21669: goto -> 21680
    //   21672: ldc2_w -679465158
    //   21675: l2i
    //   21676: ldc_w 663784660
    //   21679: ixor
    //   21680: ldc2_w 26810836
    //   21683: l2i
    //   21684: ldc_w 1989291390
    //   21687: ixor
    //   21688: ixor
    //   21689: lookupswitch default -> 21716, -1910653351 -> 21672, -1459711906 -> 30544
    //   21716: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   21719: getstatic Perryc.0 : I
    //   21722: ifle -> 21736
    //   21725: ldc2_w -10200163
    //   21728: l2i
    //   21729: ldc_w -1243097531
    //   21732: ixor
    //   21733: goto -> 21744
    //   21736: ldc2_w 847266711
    //   21739: l2i
    //   21740: ldc_w 622916963
    //   21743: ixor
    //   21744: ldc2_w 1846087045
    //   21747: l2i
    //   21748: ldc_w -502633393
    //   21751: ixor
    //   21752: ixor
    //   21753: lookupswitch default -> 31218, -1683761346 -> 21780, -964629486 -> 21736
    //   21780: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21783: getstatic Perryc.c : I
    //   21786: iflt -> 21800
    //   21789: ldc2_w 1715533538
    //   21792: l2i
    //   21793: ldc_w -935986234
    //   21796: ixor
    //   21797: goto -> 21808
    //   21800: ldc2_w 601710290
    //   21803: l2i
    //   21804: ldc_w -150340456
    //   21807: ixor
    //   21808: ldc2_w 463838405
    //   21811: l2i
    //   21812: ldc_w 1256219211
    //   21815: ixor
    //   21816: ixor
    //   21817: lookupswitch default -> 31156, -2054071100 -> 21844, -13569110 -> 21800
    //   21844: aload_0
    //   21845: getstatic Perryc.c : I
    //   21848: iflt -> 21862
    //   21851: ldc2_w 517556842
    //   21854: l2i
    //   21855: ldc_w 31789978
    //   21858: ixor
    //   21859: goto -> 21870
    //   21862: ldc2_w -1937052106
    //   21865: l2i
    //   21866: ldc_w -540076465
    //   21869: ixor
    //   21870: ldc2_w -635633362
    //   21873: l2i
    //   21874: ldc_w 202680960
    //   21877: ixor
    //   21878: ixor
    //   21879: lookupswitch default -> 21904, -919211426 -> 31042, 1262736824 -> 21862
    //   21904: aload_0
    //   21905: new bigname/zprestige/webhack/features/setting/Setting
    //   21908: dup
    //   21909: ldc_w '贾㌖赢'
    //   21912: getstatic Perryc.0 : I
    //   21915: ifle -> 21929
    //   21918: ldc2_w 1170973468
    //   21921: l2i
    //   21922: ldc_w -1420244087
    //   21925: ixor
    //   21926: goto -> 21937
    //   21929: ldc2_w 906423977
    //   21932: l2i
    //   21933: ldc_w -258745672
    //   21936: ixor
    //   21937: ldc2_w -1967395890
    //   21940: l2i
    //   21941: ldc_w -1816469932
    //   21944: ixor
    //   21945: ixor
    //   21946: lookupswitch default -> 21972, -141402865 -> 31344, 673918519 -> 21929
    //   21972: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   21975: ldc2_w -1185997374
    //   21978: l2i
    //   21979: ldc_w -1185997374
    //   21982: ixor
    //   21983: getstatic Perryc.c : I
    //   21986: iflt -> 22000
    //   21989: ldc2_w 2038600301
    //   21992: l2i
    //   21993: ldc_w 927482315
    //   21996: ixor
    //   21997: goto -> 22008
    //   22000: ldc2_w -1661006861
    //   22003: l2i
    //   22004: ldc_w -868199348
    //   22007: ixor
    //   22008: ldc2_w -2060930637
    //   22011: l2i
    //   22012: ldc_w -10045729
    //   22015: ixor
    //   22016: ixor
    //   22017: lookupswitch default -> 22044, -1405204703 -> 22000, 881120458 -> 30612
    //   22044: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22047: ldc2_w -1380237364
    //   22050: l2i
    //   22051: ldc_w -1380237364
    //   22054: ixor
    //   22055: getstatic Perryc.c : I
    //   22058: iflt -> 22072
    //   22061: ldc2_w -1884001413
    //   22064: l2i
    //   22065: ldc_w 1398642530
    //   22068: ixor
    //   22069: goto -> 22080
    //   22072: ldc2_w 838853369
    //   22075: l2i
    //   22076: ldc_w 2096312440
    //   22079: ixor
    //   22080: ldc2_w -598395142
    //   22083: l2i
    //   22084: ldc_w -1914038766
    //   22087: ixor
    //   22088: ixor
    //   22089: lookupswitch default -> 30962, -1923687183 -> 22072, 481555049 -> 22116
    //   22116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22119: ldc2_w -1849007799
    //   22122: l2i
    //   22123: ldc_w -1849007690
    //   22126: ixor
    //   22127: getstatic Perryc.1 : I
    //   22130: ifeq -> 22144
    //   22133: ldc2_w -544593690
    //   22136: l2i
    //   22137: ldc_w -1992625232
    //   22140: ixor
    //   22141: goto -> 22152
    //   22144: ldc2_w -1104841426
    //   22147: l2i
    //   22148: ldc_w -1273039365
    //   22151: ixor
    //   22152: ldc2_w -957765948
    //   22155: l2i
    //   22156: ldc_w 1054799150
    //   22159: ixor
    //   22160: ixor
    //   22161: lookupswitch default -> 30984, -1366849348 -> 22144, -234040513 -> 22188
    //   22188: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22191: getstatic Perryc.c : I
    //   22194: iflt -> 22208
    //   22197: ldc2_w -1917237454
    //   22200: l2i
    //   22201: ldc_w -308388809
    //   22204: ixor
    //   22205: goto -> 22216
    //   22208: ldc2_w 1679888562
    //   22211: l2i
    //   22212: ldc_w -1183869192
    //   22215: ixor
    //   22216: ldc2_w -21772370
    //   22219: l2i
    //   22220: ldc_w 541988163
    //   22223: ixor
    //   22224: ixor
    //   22225: lookupswitch default -> 22252, -1092957720 -> 31328, 1518306969 -> 22208
    //   22252: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   22255: getstatic Perryc.1 : I
    //   22258: ifeq -> 22272
    //   22261: ldc2_w -549449668
    //   22264: l2i
    //   22265: ldc_w -1616270015
    //   22268: ixor
    //   22269: goto -> 22280
    //   22272: ldc2_w -509428263
    //   22275: l2i
    //   22276: ldc_w 651241706
    //   22279: ixor
    //   22280: ldc2_w 1435250370
    //   22283: l2i
    //   22284: ldc_w -1590201098
    //   22287: ixor
    //   22288: ixor
    //   22289: lookupswitch default -> 22316, -1269635255 -> 30852, 396272385 -> 22272
    //   22316: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   22319: getstatic Perryc.1 : I
    //   22322: ifeq -> 22336
    //   22325: ldc2_w 1020199975
    //   22328: l2i
    //   22329: ldc_w 1994217066
    //   22332: ixor
    //   22333: goto -> 22344
    //   22336: ldc2_w -610763504
    //   22339: l2i
    //   22340: ldc_w 611499390
    //   22343: ixor
    //   22344: ldc2_w 1581789794
    //   22347: l2i
    //   22348: ldc_w 238828170
    //   22351: ixor
    //   22352: ixor
    //   22353: lookupswitch default -> 22380, 442915493 -> 31172, 1005562824 -> 22336
    //   22380: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22383: getstatic Perryc.1 : I
    //   22386: ifeq -> 22400
    //   22389: ldc2_w -1591476279
    //   22392: l2i
    //   22393: ldc_w -1341082605
    //   22396: ixor
    //   22397: goto -> 22408
    //   22400: ldc2_w 355087367
    //   22403: l2i
    //   22404: ldc_w -1233165190
    //   22407: ixor
    //   22408: ldc2_w -1029765959
    //   22411: l2i
    //   22412: ldc_w -1019558785
    //   22415: ixor
    //   22416: ixor
    //   22417: lookupswitch default -> 30888, -1561292613 -> 22444, 278301468 -> 22400
    //   22444: aload_0
    //   22445: getstatic Perryc.0 : I
    //   22448: ifle -> 22462
    //   22451: ldc2_w -1651709819
    //   22454: l2i
    //   22455: ldc_w 626868637
    //   22458: ixor
    //   22459: goto -> 22470
    //   22462: ldc2_w 376726408
    //   22465: l2i
    //   22466: ldc_w -2057716510
    //   22469: ixor
    //   22470: ldc2_w -67644878
    //   22473: l2i
    //   22474: ldc_w 2080940523
    //   22477: ixor
    //   22478: ixor
    //   22479: lookupswitch default -> 22504, 1060035265 -> 31252, 1932397906 -> 22462
    //   22504: aload_0
    //   22505: new bigname/zprestige/webhack/features/setting/Setting
    //   22508: dup
    //   22509: ldc_w '贫㌁赣㶲㩥'
    //   22512: getstatic Perryc.c : I
    //   22515: iflt -> 22529
    //   22518: ldc2_w 1285372297
    //   22521: l2i
    //   22522: ldc_w 670834970
    //   22525: ixor
    //   22526: goto -> 22537
    //   22529: ldc2_w -245543418
    //   22532: l2i
    //   22533: ldc_w 1451207640
    //   22536: ixor
    //   22537: ldc2_w 1542320756
    //   22540: l2i
    //   22541: ldc_w 1039263090
    //   22544: ixor
    //   22545: ixor
    //   22546: lookupswitch default -> 30590, -1052839208 -> 22572, 226299797 -> 22529
    //   22572: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   22575: ldc2_w -2038263332
    //   22578: l2i
    //   22579: ldc_w -2038263517
    //   22582: ixor
    //   22583: getstatic Perryc.c : I
    //   22586: iflt -> 22600
    //   22589: ldc2_w -1544452644
    //   22592: l2i
    //   22593: ldc_w 686803658
    //   22596: ixor
    //   22597: goto -> 22608
    //   22600: ldc2_w -291952887
    //   22603: l2i
    //   22604: ldc_w -1345676422
    //   22607: ixor
    //   22608: ldc2_w -1079987560
    //   22611: l2i
    //   22612: ldc_w 457506084
    //   22615: ixor
    //   22616: ixor
    //   22617: lookupswitch default -> 22644, 804913322 -> 30916, 1574772002 -> 22600
    //   22644: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22647: ldc2_w -1149378016
    //   22650: l2i
    //   22651: ldc_w -1149378016
    //   22654: ixor
    //   22655: getstatic Perryc.1 : I
    //   22658: ifeq -> 22672
    //   22661: ldc2_w -285384310
    //   22664: l2i
    //   22665: ldc_w 1233119505
    //   22668: ixor
    //   22669: goto -> 22680
    //   22672: ldc2_w 341479923
    //   22675: l2i
    //   22676: ldc_w 1498237957
    //   22679: ixor
    //   22680: ldc2_w 1463428715
    //   22683: l2i
    //   22684: ldc_w 878605568
    //   22687: ixor
    //   22688: ixor
    //   22689: lookupswitch default -> 22716, -991503376 -> 30876, 89522152 -> 22672
    //   22716: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22719: ldc2_w 2144860294
    //   22722: l2i
    //   22723: ldc_w 2144860281
    //   22726: ixor
    //   22727: getstatic Perryc.c : I
    //   22730: iflt -> 22744
    //   22733: ldc2_w 2085948212
    //   22736: l2i
    //   22737: ldc_w 735374673
    //   22740: ixor
    //   22741: goto -> 22752
    //   22744: ldc2_w -1323762290
    //   22747: l2i
    //   22748: ldc_w -466756885
    //   22751: ixor
    //   22752: ldc2_w 1680425679
    //   22755: l2i
    //   22756: ldc_w 304206485
    //   22759: ixor
    //   22760: ixor
    //   22761: lookupswitch default -> 31198, 562656831 -> 22744, 591247167 -> 22788
    //   22788: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   22791: getstatic Perryc.1 : I
    //   22794: ifeq -> 22808
    //   22797: ldc2_w 695903922
    //   22800: l2i
    //   22801: ldc_w -1430468017
    //   22804: ixor
    //   22805: goto -> 22816
    //   22808: ldc2_w -1938646859
    //   22811: l2i
    //   22812: ldc_w 675466115
    //   22815: ixor
    //   22816: ldc2_w 794090366
    //   22819: l2i
    //   22820: ldc_w -486523912
    //   22823: ixor
    //   22824: ixor
    //   22825: lookupswitch default -> 22852, 704880505 -> 22808, 1335004283 -> 30550
    //   22852: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   22855: getstatic Perryc.c : I
    //   22858: iflt -> 22872
    //   22861: ldc2_w -1981469460
    //   22864: l2i
    //   22865: ldc_w 670417818
    //   22868: ixor
    //   22869: goto -> 22880
    //   22872: ldc2_w 1409720605
    //   22875: l2i
    //   22876: ldc_w -59260888
    //   22879: ixor
    //   22880: ldc2_w -1452796338
    //   22883: l2i
    //   22884: ldc_w 909531969
    //   22887: ixor
    //   22888: ixor
    //   22889: lookupswitch default -> 22916, 813890923 -> 22872, 827236985 -> 30596
    //   22916: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   22919: getstatic Perryc.c : I
    //   22922: iflt -> 22936
    //   22925: ldc2_w 1184982678
    //   22928: l2i
    //   22929: ldc_w -1926600350
    //   22932: ixor
    //   22933: goto -> 22944
    //   22936: ldc2_w 2040562052
    //   22939: l2i
    //   22940: ldc_w 2078946507
    //   22943: ixor
    //   22944: ldc2_w 347482037
    //   22947: l2i
    //   22948: ldc_w 1095570124
    //   22951: ixor
    //   22952: ixor
    //   22953: lookupswitch default -> 22980, -1636812147 -> 30882, 69964813 -> 22936
    //   22980: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22983: getstatic Perryc.1 : I
    //   22986: ifeq -> 23000
    //   22989: ldc2_w 737614940
    //   22992: l2i
    //   22993: ldc_w -1855462463
    //   22996: ixor
    //   22997: goto -> 23008
    //   23000: ldc2_w -683695539
    //   23003: l2i
    //   23004: ldc_w -1178077799
    //   23007: ixor
    //   23008: ldc2_w 815713274
    //   23011: l2i
    //   23012: ldc_w 1528186496
    //   23015: ixor
    //   23016: ixor
    //   23017: lookupswitch default -> 23044, -786926873 -> 30520, 1360841989 -> 23000
    //   23044: aload_0
    //   23045: getstatic Perryc.c : I
    //   23048: iflt -> 23062
    //   23051: ldc2_w -523892983
    //   23054: l2i
    //   23055: ldc_w -2066181188
    //   23058: ixor
    //   23059: goto -> 23070
    //   23062: ldc2_w -1774384316
    //   23065: l2i
    //   23066: ldc_w 622505913
    //   23069: ixor
    //   23070: ldc2_w -291961484
    //   23073: l2i
    //   23074: ldc_w -522339838
    //   23077: ixor
    //   23078: ixor
    //   23079: lookupswitch default -> 23104, 1784294339 -> 31374, 2033300522 -> 23062
    //   23104: aload_0
    //   23105: new bigname/zprestige/webhack/features/setting/Setting
    //   23108: dup
    //   23109: ldc_w '贮㌟赳㶲'
    //   23112: getstatic Perryc.c : I
    //   23115: iflt -> 23129
    //   23118: ldc2_w -1221069090
    //   23121: l2i
    //   23122: ldc_w 806621829
    //   23125: ixor
    //   23126: goto -> 23137
    //   23129: ldc2_w 2033395429
    //   23132: l2i
    //   23133: ldc_w 1509106635
    //   23136: ixor
    //   23137: ldc2_w 1830055048
    //   23140: l2i
    //   23141: ldc_w 1625828291
    //   23144: ixor
    //   23145: ixor
    //   23146: lookupswitch default -> 31284, -1965055216 -> 23129, 758923877 -> 23172
    //   23172: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   23175: ldc2_w -1384349854
    //   23178: l2i
    //   23179: ldc_w -1384349854
    //   23182: ixor
    //   23183: getstatic Perryc.1 : I
    //   23186: ifeq -> 23200
    //   23189: ldc2_w -1808068842
    //   23192: l2i
    //   23193: ldc_w 229771795
    //   23196: ixor
    //   23197: goto -> 23208
    //   23200: ldc2_w -140819626
    //   23203: l2i
    //   23204: ldc_w -1810937326
    //   23207: ixor
    //   23208: ldc2_w -1738857548
    //   23211: l2i
    //   23212: ldc_w 1448830259
    //   23215: ixor
    //   23216: ixor
    //   23217: lookupswitch default -> 30890, -1382789181 -> 23244, 1468613506 -> 23200
    //   23244: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   23247: ldc2_w -1969440861
    //   23250: l2i
    //   23251: ldc_w -1969440861
    //   23254: ixor
    //   23255: getstatic Perryc.c : I
    //   23258: iflt -> 23272
    //   23261: ldc2_w 952848703
    //   23264: l2i
    //   23265: ldc_w -1960314892
    //   23268: ixor
    //   23269: goto -> 23280
    //   23272: ldc2_w -731701714
    //   23275: l2i
    //   23276: ldc_w 1005723488
    //   23279: ixor
    //   23280: ldc2_w 684743814
    //   23283: l2i
    //   23284: ldc_w -1760754465
    //   23287: ixor
    //   23288: ixor
    //   23289: lookupswitch default -> 30620, 204603026 -> 23272, 1347180823 -> 23316
    //   23316: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   23319: ldc2_w 397047163
    //   23322: l2i
    //   23323: ldc_w 397047172
    //   23326: ixor
    //   23327: getstatic Perryc.1 : I
    //   23330: ifeq -> 23344
    //   23333: ldc2_w -926332885
    //   23336: l2i
    //   23337: ldc_w -2035041030
    //   23340: ixor
    //   23341: goto -> 23352
    //   23344: ldc2_w 2105738830
    //   23347: l2i
    //   23348: ldc_w 810823408
    //   23351: ixor
    //   23352: ldc2_w -597545616
    //   23355: l2i
    //   23356: ldc_w 609015198
    //   23359: ixor
    //   23360: ixor
    //   23361: lookupswitch default -> 31336, -1241919408 -> 23388, -1236005825 -> 23344
    //   23388: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   23391: getstatic Perryc.1 : I
    //   23394: ifeq -> 23408
    //   23397: ldc2_w 237533272
    //   23400: l2i
    //   23401: ldc_w 768259646
    //   23404: ixor
    //   23405: goto -> 23416
    //   23408: ldc2_w 2129444711
    //   23411: l2i
    //   23412: ldc_w 1832627438
    //   23415: ixor
    //   23416: ldc2_w 1926064273
    //   23419: l2i
    //   23420: ldc_w 199602491
    //   23423: ixor
    //   23424: ixor
    //   23425: lookupswitch default -> 23452, 706578763 -> 23408, 1523193804 -> 30474
    //   23452: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   23455: getstatic Perryc.1 : I
    //   23458: ifeq -> 23472
    //   23461: ldc2_w 491503267
    //   23464: l2i
    //   23465: ldc_w -660639745
    //   23468: ixor
    //   23469: goto -> 23480
    //   23472: ldc2_w -424180314
    //   23475: l2i
    //   23476: ldc_w 849484575
    //   23479: ixor
    //   23480: ldc2_w -538689195
    //   23483: l2i
    //   23484: ldc_w 2107011461
    //   23487: ixor
    //   23488: ixor
    //   23489: lookupswitch default -> 23516, -1391611659 -> 23472, 1738989964 -> 30742
    //   23516: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   23519: getstatic Perryc.0 : I
    //   23522: ifle -> 23536
    //   23525: ldc2_w -1231245803
    //   23528: l2i
    //   23529: ldc_w -1921510007
    //   23532: ixor
    //   23533: goto -> 23544
    //   23536: ldc2_w -1616670744
    //   23539: l2i
    //   23540: ldc_w -805295135
    //   23543: ixor
    //   23544: ldc2_w -1606036141
    //   23547: l2i
    //   23548: ldc_w 515072962
    //   23551: ixor
    //   23552: ixor
    //   23553: lookupswitch default -> 23580, -2062414579 -> 30472, -1635215558 -> 23536
    //   23580: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23583: getstatic Perryc.c : I
    //   23586: iflt -> 23600
    //   23589: ldc2_w -1208045430
    //   23592: l2i
    //   23593: ldc_w 2009156577
    //   23596: ixor
    //   23597: goto -> 23608
    //   23600: ldc2_w 527769038
    //   23603: l2i
    //   23604: ldc_w -2024245643
    //   23607: ixor
    //   23608: ldc2_w -1740653250
    //   23611: l2i
    //   23612: ldc_w 1801158500
    //   23615: ixor
    //   23616: ixor
    //   23617: lookupswitch default -> 30736, 861616433 -> 23600, 1799989729 -> 23644
    //   23644: aload_0
    //   23645: getstatic Perryc.1 : I
    //   23648: ifeq -> 23662
    //   23651: ldc2_w -2047442227
    //   23654: l2i
    //   23655: ldc_w -274278468
    //   23658: ixor
    //   23659: goto -> 23670
    //   23662: ldc2_w 1339694667
    //   23665: l2i
    //   23666: ldc_w 997469614
    //   23669: ixor
    //   23670: ldc2_w -1915749479
    //   23673: l2i
    //   23674: ldc_w -1144670275
    //   23677: ixor
    //   23678: ixor
    //   23679: lookupswitch default -> 23704, -1804073306 -> 23662, 1549408597 -> 31382
    //   23704: aload_0
    //   23705: new bigname/zprestige/webhack/features/setting/Setting
    //   23708: dup
    //   23709: ldc_w '贾㌒赯㶹㩩掿๮'
    //   23712: getstatic Perryc.1 : I
    //   23715: ifeq -> 23729
    //   23718: ldc2_w -724663044
    //   23721: l2i
    //   23722: ldc_w -583553729
    //   23725: ixor
    //   23726: goto -> 23737
    //   23729: ldc2_w -312336483
    //   23732: l2i
    //   23733: ldc_w 1076650761
    //   23736: ixor
    //   23737: ldc2_w 1457381942
    //   23740: l2i
    //   23741: ldc_w 169464651
    //   23744: ixor
    //   23745: ixor
    //   23746: lookupswitch default -> 30606, -242594327 -> 23772, 1430067390 -> 23729
    //   23772: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   23775: ldc2_w -117510589
    //   23778: l2i
    //   23779: ldc_w -117510590
    //   23782: ixor
    //   23783: getstatic Perryc.c : I
    //   23786: iflt -> 23800
    //   23789: ldc2_w 1700041849
    //   23792: l2i
    //   23793: ldc_w -1448276714
    //   23796: ixor
    //   23797: goto -> 23808
    //   23800: ldc2_w 1979264910
    //   23803: l2i
    //   23804: ldc_w -630626625
    //   23807: ixor
    //   23808: ldc2_w -2123756170
    //   23811: l2i
    //   23812: ldc_w 61703305
    //   23815: ixor
    //   23816: ixor
    //   23817: lookupswitch default -> 23844, 1312690320 -> 30678, 1727181580 -> 23800
    //   23844: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   23847: getstatic Perryc.0 : I
    //   23850: ifle -> 23864
    //   23853: ldc2_w -360826361
    //   23856: l2i
    //   23857: ldc_w -1122194314
    //   23860: ixor
    //   23861: goto -> 23872
    //   23864: ldc2_w -509465056
    //   23867: l2i
    //   23868: ldc_w 90991859
    //   23871: ixor
    //   23872: ldc2_w 1767774315
    //   23875: l2i
    //   23876: ldc_w -1816814314
    //   23879: ixor
    //   23880: ixor
    //   23881: lookupswitch default -> 30830, -1383525620 -> 23864, 505792430 -> 23908
    //   23908: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   23911: getstatic Perryc.0 : I
    //   23914: ifle -> 23928
    //   23917: ldc2_w -199194111
    //   23920: l2i
    //   23921: ldc_w 279089041
    //   23924: ixor
    //   23925: goto -> 23936
    //   23928: ldc2_w -307270287
    //   23931: l2i
    //   23932: ldc_w -1979890075
    //   23935: ixor
    //   23936: ldc2_w -702551043
    //   23939: l2i
    //   23940: ldc_w 1349556905
    //   23943: ixor
    //   23944: ixor
    //   23945: lookupswitch default -> 30772, -499295680 -> 23972, 1659729092 -> 23928
    //   23972: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   23975: getstatic Perryc.0 : I
    //   23978: ifle -> 23992
    //   23981: ldc2_w 438142941
    //   23984: l2i
    //   23985: ldc_w -1297707881
    //   23988: ixor
    //   23989: goto -> 24000
    //   23992: ldc2_w 1204569739
    //   23995: l2i
    //   23996: ldc_w 532620994
    //   23999: ixor
    //   24000: ldc2_w 848343937
    //   24003: l2i
    //   24004: ldc_w 1617128836
    //   24007: ixor
    //   24008: ixor
    //   24009: lookupswitch default -> 31076, -95890097 -> 23992, 176209484 -> 24036
    //   24036: putfield Rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24039: getstatic Perryc.0 : I
    //   24042: ifle -> 24056
    //   24045: ldc2_w 2031368825
    //   24048: l2i
    //   24049: ldc_w 976532352
    //   24052: ixor
    //   24053: goto -> 24064
    //   24056: ldc2_w -273048409
    //   24059: l2i
    //   24060: ldc_w -1213799851
    //   24063: ixor
    //   24064: ldc2_w -2069729805
    //   24067: l2i
    //   24068: ldc_w -1028473141
    //   24071: ixor
    //   24072: ixor
    //   24073: lookupswitch default -> 31260, 87055041 -> 24056, 504344010 -> 24100
    //   24100: aload_0
    //   24101: getstatic Perryc.0 : I
    //   24104: ifle -> 24118
    //   24107: ldc2_w 1770467603
    //   24110: l2i
    //   24111: ldc_w 1797179005
    //   24114: ixor
    //   24115: goto -> 24126
    //   24118: ldc2_w 1805566393
    //   24121: l2i
    //   24122: ldc_w -594321187
    //   24125: ixor
    //   24126: ldc2_w -947048471
    //   24129: l2i
    //   24130: ldc_w -367017748
    //   24133: ixor
    //   24134: ixor
    //   24135: lookupswitch default -> 24160, 789256299 -> 30822, 1238774882 -> 24118
    //   24160: aload_0
    //   24161: new bigname/zprestige/webhack/features/setting/Setting
    //   24164: dup
    //   24165: ldc_w '购㌟赶㶿㩪'
    //   24168: getstatic Perryc.1 : I
    //   24171: ifeq -> 24185
    //   24174: ldc2_w 216669566
    //   24177: l2i
    //   24178: ldc_w 354213584
    //   24181: ixor
    //   24182: goto -> 24193
    //   24185: ldc2_w 1479973034
    //   24188: l2i
    //   24189: ldc_w -1967262545
    //   24192: ixor
    //   24193: ldc2_w -626612744
    //   24196: l2i
    //   24197: ldc_w -417684592
    //   24200: ixor
    //   24201: ixor
    //   24202: lookupswitch default -> 24228, 608880070 -> 30768, 826910004 -> 24185
    //   24228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   24231: ldc2_w -1154605770
    //   24234: l2i
    //   24235: ldc_w -1154605623
    //   24238: ixor
    //   24239: getstatic Perryc.c : I
    //   24242: iflt -> 24256
    //   24245: ldc2_w -1150291754
    //   24248: l2i
    //   24249: ldc_w -1870764495
    //   24252: ixor
    //   24253: goto -> 24264
    //   24256: ldc2_w 1709557392
    //   24259: l2i
    //   24260: ldc_w 1620112151
    //   24263: ixor
    //   24264: ldc2_w -1916874886
    //   24267: l2i
    //   24268: ldc_w 1912388152
    //   24271: ixor
    //   24272: ixor
    //   24273: lookupswitch default -> 30476, -682368091 -> 24256, -113819451 -> 24300
    //   24300: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   24303: ldc2_w 797550179
    //   24306: l2i
    //   24307: ldc_w 797550179
    //   24310: ixor
    //   24311: getstatic Perryc.c : I
    //   24314: iflt -> 24328
    //   24317: ldc2_w 753910859
    //   24320: l2i
    //   24321: ldc_w 638232282
    //   24324: ixor
    //   24325: goto -> 24336
    //   24328: ldc2_w -902311301
    //   24331: l2i
    //   24332: ldc_w -517121796
    //   24335: ixor
    //   24336: ldc2_w 577315912
    //   24339: l2i
    //   24340: ldc_w 303485404
    //   24343: ixor
    //   24344: ixor
    //   24345: lookupswitch default -> 24372, 983209733 -> 31050, 1324026310 -> 24328
    //   24372: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   24375: ldc2_w -536683519
    //   24378: l2i
    //   24379: ldc_w -536683266
    //   24382: ixor
    //   24383: getstatic Perryc.0 : I
    //   24386: ifle -> 24400
    //   24389: ldc2_w 2036599783
    //   24392: l2i
    //   24393: ldc_w 822686305
    //   24396: ixor
    //   24397: goto -> 24408
    //   24400: ldc2_w -1919582525
    //   24403: l2i
    //   24404: ldc_w 839748278
    //   24407: ixor
    //   24408: ldc2_w -496760893
    //   24411: l2i
    //   24412: ldc_w 186866427
    //   24415: ixor
    //   24416: ixor
    //   24417: lookupswitch default -> 31254, -1591057218 -> 24400, 1457498445 -> 24444
    //   24444: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   24447: getstatic Perryc.1 : I
    //   24450: ifeq -> 24464
    //   24453: ldc2_w -711032317
    //   24456: l2i
    //   24457: ldc_w -204001137
    //   24460: ixor
    //   24461: goto -> 24472
    //   24464: ldc2_w 12344256
    //   24467: l2i
    //   24468: ldc_w -1669167736
    //   24471: ixor
    //   24472: ldc2_w 2013478710
    //   24475: l2i
    //   24476: ldc_w -1502038014
    //   24479: ixor
    //   24480: ixor
    //   24481: lookupswitch default -> 24508, -1552140014 -> 24464, -130927176 -> 31012
    //   24508: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   24511: getstatic Perryc.1 : I
    //   24514: ifeq -> 24528
    //   24517: ldc2_w 1212257774
    //   24520: l2i
    //   24521: ldc_w -950231564
    //   24524: ixor
    //   24525: goto -> 24536
    //   24528: ldc2_w -259384703
    //   24531: l2i
    //   24532: ldc_w 1073743047
    //   24535: ixor
    //   24536: ldc2_w 950327038
    //   24539: l2i
    //   24540: ldc_w 775372353
    //   24543: ixor
    //   24544: ixor
    //   24545: lookupswitch default -> 30662, -1718689627 -> 24528, -1508247815 -> 24572
    //   24572: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   24575: getstatic Perryc.c : I
    //   24578: iflt -> 24592
    //   24581: ldc2_w -779138609
    //   24584: l2i
    //   24585: ldc_w 601598292
    //   24588: ixor
    //   24589: goto -> 24600
    //   24592: ldc2_w 1546729830
    //   24595: l2i
    //   24596: ldc_w -117141976
    //   24599: ixor
    //   24600: ldc2_w -1516061986
    //   24603: l2i
    //   24604: ldc_w -2063608417
    //   24607: ixor
    //   24608: ixor
    //   24609: lookupswitch default -> 24636, -754348070 -> 31220, 791934394 -> 24592
    //   24636: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24639: getstatic Perryc.c : I
    //   24642: iflt -> 24656
    //   24645: ldc2_w -1072998397
    //   24648: l2i
    //   24649: ldc_w -2043910979
    //   24652: ixor
    //   24653: goto -> 24664
    //   24656: ldc2_w -1528414068
    //   24659: l2i
    //   24660: ldc_w -1682768362
    //   24663: ixor
    //   24664: ldc2_w 627743451
    //   24667: l2i
    //   24668: ldc_w 1677350255
    //   24671: ixor
    //   24672: ixor
    //   24673: lookupswitch default -> 24700, -1649277081 -> 24656, 12055306 -> 30754
    //   24700: aload_0
    //   24701: getstatic Perryc.c : I
    //   24704: iflt -> 24718
    //   24707: ldc2_w -2127435179
    //   24710: l2i
    //   24711: ldc_w -2054401166
    //   24714: ixor
    //   24715: goto -> 24726
    //   24718: ldc2_w 2060993686
    //   24721: l2i
    //   24722: ldc_w -1490095734
    //   24725: ixor
    //   24726: ldc2_w 266648698
    //   24729: l2i
    //   24730: ldc_w 751823017
    //   24733: ixor
    //   24734: ixor
    //   24735: lookupswitch default -> 30658, -19013169 -> 24760, 664202740 -> 24718
    //   24760: aload_0
    //   24761: new bigname/zprestige/webhack/features/setting/Setting
    //   24764: dup
    //   24765: ldc_w '贮㌜赾㶖㩧掠๱'
    //   24768: getstatic Perryc.1 : I
    //   24771: ifeq -> 24785
    //   24774: ldc2_w 938991370
    //   24777: l2i
    //   24778: ldc_w -135305446
    //   24781: ixor
    //   24782: goto -> 24793
    //   24785: ldc2_w -340909099
    //   24788: l2i
    //   24789: ldc_w 676764021
    //   24792: ixor
    //   24793: ldc2_w -875851590
    //   24796: l2i
    //   24797: ldc_w 1437270809
    //   24800: ixor
    //   24801: ixor
    //   24802: lookupswitch default -> 24828, 706145654 -> 24785, 1584933811 -> 31268
    //   24828: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   24831: ldc2_w 1849275728
    //   24834: l2i
    //   24835: ldc_w 1849275693
    //   24838: ixor
    //   24839: getstatic Perryc.1 : I
    //   24842: ifeq -> 24856
    //   24845: ldc2_w 2136722795
    //   24848: l2i
    //   24849: ldc_w -81614490
    //   24852: ixor
    //   24853: goto -> 24864
    //   24856: ldc2_w 1564324886
    //   24859: l2i
    //   24860: ldc_w 1748868442
    //   24863: ixor
    //   24864: ldc2_w -338916815
    //   24867: l2i
    //   24868: ldc_w -117935632
    //   24871: ixor
    //   24872: ixor
    //   24873: lookupswitch default -> 31346, -1756520500 -> 24856, 640995981 -> 24900
    //   24900: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   24903: ldc2_w -1258137467
    //   24906: l2i
    //   24907: ldc_w -1258137467
    //   24910: ixor
    //   24911: getstatic Perryc.c : I
    //   24914: iflt -> 24928
    //   24917: ldc2_w 270955777
    //   24920: l2i
    //   24921: ldc_w -193498459
    //   24924: ixor
    //   24925: goto -> 24936
    //   24928: ldc2_w 1265283727
    //   24931: l2i
    //   24932: ldc_w -2085453269
    //   24935: ixor
    //   24936: ldc2_w 1350769038
    //   24939: l2i
    //   24940: ldc_w -184260032
    //   24943: ixor
    //   24944: ixor
    //   24945: lookupswitch default -> 24972, -1388090042 -> 24928, 1104573546 -> 30532
    //   24972: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   24975: ldc2_w -1514548936
    //   24978: l2i
    //   24979: ldc_w -1514548793
    //   24982: ixor
    //   24983: getstatic Perryc.1 : I
    //   24986: ifeq -> 25000
    //   24989: ldc2_w -243429595
    //   24992: l2i
    //   24993: ldc_w -1179458301
    //   24996: ixor
    //   24997: goto -> 25008
    //   25000: ldc2_w -1796384009
    //   25003: l2i
    //   25004: ldc_w -1850290275
    //   25007: ixor
    //   25008: ldc2_w 351756321
    //   25011: l2i
    //   25012: ldc_w -150110134
    //   25015: ixor
    //   25016: ixor
    //   25017: lookupswitch default -> 30740, -1422554547 -> 25000, -425626367 -> 25044
    //   25044: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   25047: getstatic Perryc.c : I
    //   25050: iflt -> 25064
    //   25053: ldc2_w 1433111164
    //   25056: l2i
    //   25057: ldc_w -1018700468
    //   25060: ixor
    //   25061: goto -> 25072
    //   25064: ldc2_w 105568153
    //   25067: l2i
    //   25068: ldc_w 760347656
    //   25071: ixor
    //   25072: ldc2_w -1403247845
    //   25075: l2i
    //   25076: ldc_w -93757391
    //   25079: ixor
    //   25080: ixor
    //   25081: lookupswitch default -> 25108, -1866141959 -> 25064, -1072098278 -> 30902
    //   25108: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   25111: getstatic Perryc.c : I
    //   25114: iflt -> 25128
    //   25117: ldc2_w -1818448852
    //   25120: l2i
    //   25121: ldc_w -1898983217
    //   25124: ixor
    //   25125: goto -> 25136
    //   25128: ldc2_w 1585624131
    //   25131: l2i
    //   25132: ldc_w 1046681318
    //   25135: ixor
    //   25136: ldc2_w -920707615
    //   25139: l2i
    //   25140: ldc_w -894505399
    //   25143: ixor
    //   25144: ixor
    //   25145: lookupswitch default -> 25172, -1290671049 -> 25128, 518164299 -> 31134
    //   25172: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   25175: getstatic Perryc.1 : I
    //   25178: ifeq -> 25192
    //   25181: ldc2_w -957135289
    //   25184: l2i
    //   25185: ldc_w 1652924483
    //   25188: ixor
    //   25189: goto -> 25200
    //   25192: ldc2_w -187001579
    //   25195: l2i
    //   25196: ldc_w -904308563
    //   25199: ixor
    //   25200: ldc2_w 389949647
    //   25203: l2i
    //   25204: ldc_w 488925718
    //   25207: ixor
    //   25208: ixor
    //   25209: lookupswitch default -> 31204, -1368611619 -> 25192, 886673249 -> 25236
    //   25236: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25239: getstatic Perryc.c : I
    //   25242: iflt -> 25256
    //   25245: ldc2_w 387862912
    //   25248: l2i
    //   25249: ldc_w -1323536125
    //   25252: ixor
    //   25253: goto -> 25264
    //   25256: ldc2_w -284324794
    //   25259: l2i
    //   25260: ldc_w -30669556
    //   25263: ixor
    //   25264: ldc2_w -1863083268
    //   25267: l2i
    //   25268: ldc_w 1687491682
    //   25271: ixor
    //   25272: ixor
    //   25273: lookupswitch default -> 30484, -448329772 -> 25300, 1382329885 -> 25256
    //   25300: aload_0
    //   25301: getstatic Perryc.0 : I
    //   25304: ifle -> 25318
    //   25307: ldc2_w 1074755530
    //   25310: l2i
    //   25311: ldc_w 1859403483
    //   25314: ixor
    //   25315: goto -> 25326
    //   25318: ldc2_w -2006344078
    //   25321: l2i
    //   25322: ldc_w -668846784
    //   25325: ixor
    //   25326: ldc2_w 1416471018
    //   25329: l2i
    //   25330: ldc_w 1492848471
    //   25333: ixor
    //   25334: ixor
    //   25335: lookupswitch default -> 25360, 575530924 -> 30780, 846403892 -> 25318
    //   25360: aload_0
    //   25361: new bigname/zprestige/webhack/features/setting/Setting
    //   25364: dup
    //   25365: ldc_w '责㌆赲㶻㩢掾๼'
    //   25368: getstatic Perryc.1 : I
    //   25371: ifeq -> 25385
    //   25374: ldc2_w -1960084793
    //   25377: l2i
    //   25378: ldc_w -2121126856
    //   25381: ixor
    //   25382: goto -> 25393
    //   25385: ldc2_w 564155767
    //   25388: l2i
    //   25389: ldc_w -1235099452
    //   25392: ixor
    //   25393: ldc2_w -833761599
    //   25396: l2i
    //   25397: ldc_w 1076295580
    //   25400: ixor
    //   25401: ixor
    //   25402: lookupswitch default -> 25428, -2066583646 -> 31274, -1269199162 -> 25385
    //   25428: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   25431: ldc2_w 513809758
    //   25434: l2i
    //   25435: ldc_w 513809759
    //   25438: ixor
    //   25439: getstatic Perryc.c : I
    //   25442: iflt -> 25456
    //   25445: ldc2_w 319449222
    //   25448: l2i
    //   25449: ldc_w 571399149
    //   25452: ixor
    //   25453: goto -> 25464
    //   25456: ldc2_w -476504537
    //   25459: l2i
    //   25460: ldc_w -406712239
    //   25463: ixor
    //   25464: ldc2_w -801094648
    //   25467: l2i
    //   25468: ldc_w -373260414
    //   25471: ixor
    //   25472: ixor
    //   25473: lookupswitch default -> 31116, 142903521 -> 25456, 1037776380 -> 25500
    //   25500: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   25503: getstatic Perryc.1 : I
    //   25506: ifeq -> 25520
    //   25509: ldc2_w -1356057758
    //   25512: l2i
    //   25513: ldc_w -1055047163
    //   25516: ixor
    //   25517: goto -> 25528
    //   25520: ldc2_w -2139653044
    //   25523: l2i
    //   25524: ldc_w 1880130663
    //   25527: ixor
    //   25528: ldc2_w 20883804
    //   25531: l2i
    //   25532: ldc_w 1125334953
    //   25535: ixor
    //   25536: ixor
    //   25537: lookupswitch default -> 31168, -1303744802 -> 25564, 740091794 -> 25520
    //   25564: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   25567: getstatic Perryc.0 : I
    //   25570: ifle -> 25584
    //   25573: ldc2_w 405766279
    //   25576: l2i
    //   25577: ldc_w 1764974793
    //   25580: ixor
    //   25581: goto -> 25592
    //   25584: ldc2_w 1016446201
    //   25587: l2i
    //   25588: ldc_w -1203727947
    //   25591: ixor
    //   25592: ldc2_w -721544904
    //   25595: l2i
    //   25596: ldc_w -303224733
    //   25599: ixor
    //   25600: ixor
    //   25601: lookupswitch default -> 31010, -1111090153 -> 25628, 1208996117 -> 25584
    //   25628: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   25631: getstatic Perryc.c : I
    //   25634: iflt -> 25648
    //   25637: ldc2_w -171690481
    //   25640: l2i
    //   25641: ldc_w 866609595
    //   25644: ixor
    //   25645: goto -> 25656
    //   25648: ldc2_w 1824307305
    //   25651: l2i
    //   25652: ldc_w -729825018
    //   25655: ixor
    //   25656: ldc2_w -1528630925
    //   25659: l2i
    //   25660: ldc_w 291245130
    //   25663: ixor
    //   25664: ixor
    //   25665: lookupswitch default -> 31090, 226329686 -> 25692, 1943904909 -> 25648
    //   25692: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   25695: getstatic Perryc.1 : I
    //   25698: ifeq -> 25712
    //   25701: ldc2_w 496585426
    //   25704: l2i
    //   25705: ldc_w 657276102
    //   25708: ixor
    //   25709: goto -> 25720
    //   25712: ldc2_w 516842428
    //   25715: l2i
    //   25716: ldc_w 677011769
    //   25719: ixor
    //   25720: ldc2_w -753499915
    //   25723: l2i
    //   25724: ldc_w 130172221
    //   25727: ixor
    //   25728: ixor
    //   25729: lookupswitch default -> 30560, -499071155 -> 25756, -295652388 -> 25712
    //   25756: aload_0
    //   25757: getstatic Perryc.0 : I
    //   25760: ifle -> 25774
    //   25763: ldc2_w 1651023408
    //   25766: l2i
    //   25767: ldc_w -1394838164
    //   25770: ixor
    //   25771: goto -> 25782
    //   25774: ldc2_w 120255365
    //   25777: l2i
    //   25778: ldc_w -452563919
    //   25781: ixor
    //   25782: ldc2_w 1513655116
    //   25785: l2i
    //   25786: ldc_w -239738795
    //   25789: ixor
    //   25790: ixor
    //   25791: lookupswitch default -> 30514, 1235350701 -> 25816, 1698267205 -> 25774
    //   25816: aload_0
    //   25817: new bigname/zprestige/webhack/features/setting/Setting
    //   25820: dup
    //   25821: ldc_w '责㌿贫㶅㩮掴'
    //   25824: getstatic Perryc.0 : I
    //   25827: ifle -> 25841
    //   25830: ldc2_w 267242682
    //   25833: l2i
    //   25834: ldc_w 997229939
    //   25837: ixor
    //   25838: goto -> 25849
    //   25841: ldc2_w -580676498
    //   25844: l2i
    //   25845: ldc_w -2004258549
    //   25848: ixor
    //   25849: ldc2_w 1813102663
    //   25852: l2i
    //   25853: ldc_w -1046328859
    //   25856: ixor
    //   25857: ixor
    //   25858: lookupswitch default -> 30708, -1724989333 -> 25841, -128357177 -> 25884
    //   25884: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   25887: ldc2_w 1470485341
    //   25890: l2i
    //   25891: ldc_w 1470485341
    //   25894: ixor
    //   25895: getstatic Perryc.1 : I
    //   25898: ifeq -> 25912
    //   25901: ldc2_w -1999677017
    //   25904: l2i
    //   25905: ldc_w -705336273
    //   25908: ixor
    //   25909: goto -> 25920
    //   25912: ldc2_w -1903567905
    //   25915: l2i
    //   25916: ldc_w 988029042
    //   25919: ixor
    //   25920: ldc2_w 68706428
    //   25923: l2i
    //   25924: ldc_w -1587435927
    //   25927: ixor
    //   25928: ixor
    //   25929: lookupswitch default -> 25956, -1117508741 -> 25912, -129764451 -> 30930
    //   25956: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   25959: ldc2_w 371774546
    //   25962: l2i
    //   25963: ldc_w 371774546
    //   25966: ixor
    //   25967: getstatic Perryc.1 : I
    //   25970: ifeq -> 25984
    //   25973: ldc2_w 1445073323
    //   25976: l2i
    //   25977: ldc_w 2131086927
    //   25980: ixor
    //   25981: goto -> 25992
    //   25984: ldc2_w 1532596840
    //   25987: l2i
    //   25988: ldc_w 1327568654
    //   25991: ixor
    //   25992: ldc2_w -1916730921
    //   25995: l2i
    //   25996: ldc_w 641281887
    //   25999: ixor
    //   26000: ixor
    //   26001: lookupswitch default -> 26028, -2099252884 -> 30892, -1716672587 -> 25984
    //   26028: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26031: ldc2_w 1046538730
    //   26034: l2i
    //   26035: ldc_w 1046538517
    //   26038: ixor
    //   26039: getstatic Perryc.0 : I
    //   26042: ifle -> 26056
    //   26045: ldc2_w -1268341275
    //   26048: l2i
    //   26049: ldc_w 1054517183
    //   26052: ixor
    //   26053: goto -> 26064
    //   26056: ldc2_w 2007443907
    //   26059: l2i
    //   26060: ldc_w -1654219180
    //   26063: ixor
    //   26064: ldc2_w -1187276110
    //   26067: l2i
    //   26068: ldc_w 1319863262
    //   26071: ixor
    //   26072: ixor
    //   26073: lookupswitch default -> 31190, 491892475 -> 26100, 2100042550 -> 26056
    //   26100: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26103: getstatic Perryc.c : I
    //   26106: iflt -> 26120
    //   26109: ldc2_w -888744376
    //   26112: l2i
    //   26113: ldc_w -64009032
    //   26116: ixor
    //   26117: goto -> 26128
    //   26120: ldc2_w -765928690
    //   26123: l2i
    //   26124: ldc_w -861391222
    //   26127: ixor
    //   26128: ldc2_w 1650023994
    //   26131: l2i
    //   26132: ldc_w -611613852
    //   26135: ixor
    //   26136: ixor
    //   26137: lookupswitch default -> 26164, -1896134738 -> 30910, 1245649321 -> 26120
    //   26164: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   26167: getstatic Perryc.c : I
    //   26170: iflt -> 26184
    //   26173: ldc2_w -716039079
    //   26176: l2i
    //   26177: ldc_w 932273334
    //   26180: ixor
    //   26181: goto -> 26192
    //   26184: ldc2_w -1528002682
    //   26187: l2i
    //   26188: ldc_w -1075011367
    //   26191: ixor
    //   26192: ldc2_w -1861833488
    //   26195: l2i
    //   26196: ldc_w -1154510129
    //   26199: ixor
    //   26200: ixor
    //   26201: lookupswitch default -> 26228, -2014364817 -> 26184, -924156208 -> 31138
    //   26228: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   26231: getstatic Perryc.0 : I
    //   26234: ifle -> 26248
    //   26237: ldc2_w 1028566897
    //   26240: l2i
    //   26241: ldc_w -530319185
    //   26244: ixor
    //   26245: goto -> 26256
    //   26248: ldc2_w -434016472
    //   26251: l2i
    //   26252: ldc_w 29649573
    //   26255: ixor
    //   26256: ldc2_w -19937421
    //   26259: l2i
    //   26260: ldc_w -877318544
    //   26263: ixor
    //   26264: ixor
    //   26265: lookupswitch default -> 26292, -396902691 -> 31348, -252948407 -> 26248
    //   26292: putfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26295: getstatic Perryc.1 : I
    //   26298: ifeq -> 26312
    //   26301: ldc2_w 1249880002
    //   26304: l2i
    //   26305: ldc_w -961094984
    //   26308: ixor
    //   26309: goto -> 26320
    //   26312: ldc2_w 750959816
    //   26315: l2i
    //   26316: ldc_w 1918838313
    //   26319: ixor
    //   26320: ldc2_w -1363890907
    //   26323: l2i
    //   26324: ldc_w 16562330
    //   26327: ixor
    //   26328: ixor
    //   26329: lookupswitch default -> 26356, -272795819 -> 26312, 578906309 -> 31354
    //   26356: aload_0
    //   26357: getstatic Perryc.c : I
    //   26360: iflt -> 26374
    //   26363: ldc2_w -1419968828
    //   26366: l2i
    //   26367: ldc_w 1513069617
    //   26370: ixor
    //   26371: goto -> 26382
    //   26374: ldc2_w -2013911561
    //   26377: l2i
    //   26378: ldc_w -2099225457
    //   26381: ixor
    //   26382: ldc2_w 2122675493
    //   26385: l2i
    //   26386: ldc_w -924046143
    //   26389: ixor
    //   26390: ixor
    //   26391: lookupswitch default -> 31210, -1283514212 -> 26416, 1192901393 -> 26374
    //   26416: aload_0
    //   26417: new bigname/zprestige/webhack/features/setting/Setting
    //   26420: dup
    //   26421: ldc_w '责㌿贫㶐㩹掵๼'
    //   26424: getstatic Perryc.1 : I
    //   26427: ifeq -> 26441
    //   26430: ldc2_w 1379962764
    //   26433: l2i
    //   26434: ldc_w 1537910331
    //   26437: ixor
    //   26438: goto -> 26449
    //   26441: ldc2_w 1389803994
    //   26444: l2i
    //   26445: ldc_w 1855813996
    //   26448: ixor
    //   26449: ldc2_w -1161086486
    //   26452: l2i
    //   26453: ldc_w -1851457140
    //   26456: ixor
    //   26457: ixor
    //   26458: lookupswitch default -> 26484, 579080657 -> 30682, 770171389 -> 26441
    //   26484: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   26487: ldc2_w 1838516167
    //   26490: l2i
    //   26491: ldc_w 1838516167
    //   26494: ixor
    //   26495: getstatic Perryc.c : I
    //   26498: iflt -> 26512
    //   26501: ldc2_w 1568813555
    //   26504: l2i
    //   26505: ldc_w 682736003
    //   26508: ixor
    //   26509: goto -> 26520
    //   26512: ldc2_w -293454132
    //   26515: l2i
    //   26516: ldc_w 446800916
    //   26519: ixor
    //   26520: ldc2_w -1878545728
    //   26523: l2i
    //   26524: ldc_w 825538074
    //   26527: ixor
    //   26528: ixor
    //   26529: lookupswitch default -> 31036, -738159446 -> 26512, 1427146242 -> 26556
    //   26556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26559: ldc2_w 681553564
    //   26562: l2i
    //   26563: ldc_w 681553564
    //   26566: ixor
    //   26567: getstatic Perryc.c : I
    //   26570: iflt -> 26584
    //   26573: ldc2_w -651814298
    //   26576: l2i
    //   26577: ldc_w 1363919775
    //   26580: ixor
    //   26581: goto -> 26592
    //   26584: ldc2_w -1361188789
    //   26587: l2i
    //   26588: ldc_w -620509211
    //   26591: ixor
    //   26592: ldc2_w 145714214
    //   26595: l2i
    //   26596: ldc_w 2091118968
    //   26599: ixor
    //   26600: ixor
    //   26601: lookupswitch default -> 30602, -60734297 -> 26584, 30585584 -> 26628
    //   26628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26631: ldc2_w -643500024
    //   26634: l2i
    //   26635: ldc_w -643499785
    //   26638: ixor
    //   26639: getstatic Perryc.0 : I
    //   26642: ifle -> 26656
    //   26645: ldc2_w 1563042472
    //   26648: l2i
    //   26649: ldc_w 1615138520
    //   26652: ixor
    //   26653: goto -> 26664
    //   26656: ldc2_w -1630105110
    //   26659: l2i
    //   26660: ldc_w 1428357455
    //   26663: ixor
    //   26664: ldc2_w -409564115
    //   26667: l2i
    //   26668: ldc_w -1194059502
    //   26671: ixor
    //   26672: ixor
    //   26673: lookupswitch default -> 30818, -1799944806 -> 26700, 1647163727 -> 26656
    //   26700: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   26703: getstatic Perryc.1 : I
    //   26706: ifeq -> 26720
    //   26709: ldc2_w -712465225
    //   26712: l2i
    //   26713: ldc_w -1306017974
    //   26716: ixor
    //   26717: goto -> 26728
    //   26720: ldc2_w 1676159108
    //   26723: l2i
    //   26724: ldc_w -1373426065
    //   26727: ixor
    //   26728: ldc2_w -606165460
    //   26731: l2i
    //   26732: ldc_w -714654551
    //   26735: ixor
    //   26736: ixor
    //   26737: lookupswitch default -> 30918, -1015899026 -> 26764, 1763082616 -> 26720
    //   26764: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   26767: getstatic Perryc.1 : I
    //   26770: ifeq -> 26784
    //   26773: ldc2_w -1945950918
    //   26776: l2i
    //   26777: ldc_w -1769392448
    //   26780: ixor
    //   26781: goto -> 26792
    //   26784: ldc2_w -542292755
    //   26787: l2i
    //   26788: ldc_w -655704551
    //   26791: ixor
    //   26792: ldc2_w -384136546
    //   26795: l2i
    //   26796: ldc_w 1834981487
    //   26799: ixor
    //   26800: ixor
    //   26801: lookupswitch default -> 30746, -2096961531 -> 26828, -1630600949 -> 26784
    //   26828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   26831: getstatic Perryc.1 : I
    //   26834: ifeq -> 26848
    //   26837: ldc2_w 1441304498
    //   26840: l2i
    //   26841: ldc_w 885051228
    //   26844: ixor
    //   26845: goto -> 26856
    //   26848: ldc2_w 335451916
    //   26851: l2i
    //   26852: ldc_w -2051243196
    //   26855: ixor
    //   26856: ldc2_w 1349405324
    //   26859: l2i
    //   26860: ldc_w -340778775
    //   26863: ixor
    //   26864: ixor
    //   26865: lookupswitch default -> 31280, -621401461 -> 26848, 765230637 -> 26892
    //   26892: putfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   26895: getstatic Perryc.c : I
    //   26898: iflt -> 26912
    //   26901: ldc2_w -1022163238
    //   26904: l2i
    //   26905: ldc_w -193969476
    //   26908: ixor
    //   26909: goto -> 26920
    //   26912: ldc2_w 643034318
    //   26915: l2i
    //   26916: ldc_w -2106239759
    //   26919: ixor
    //   26920: ldc2_w 1303411110
    //   26923: l2i
    //   26924: ldc_w -614897871
    //   26927: ixor
    //   26928: ixor
    //   26929: lookupswitch default -> 31150, -1584768271 -> 26912, 852469416 -> 26956
    //   26956: aload_0
    //   26957: getstatic Perryc.c : I
    //   26960: iflt -> 26974
    //   26963: ldc2_w 1104777844
    //   26966: l2i
    //   26967: ldc_w 1204548808
    //   26970: ixor
    //   26971: goto -> 26982
    //   26974: ldc2_w -467312985
    //   26977: l2i
    //   26978: ldc_w 1410611784
    //   26981: ixor
    //   26982: ldc2_w 589914764
    //   26985: l2i
    //   26986: ldc_w -1660355378
    //   26989: ixor
    //   26990: ixor
    //   26991: lookupswitch default -> 27016, -1204553474 -> 30508, 515532360 -> 26974
    //   27016: aload_0
    //   27017: new bigname/zprestige/webhack/features/setting/Setting
    //   27020: dup
    //   27021: ldc_w '责㌿贫㶕㩧接๼'
    //   27024: getstatic Perryc.1 : I
    //   27027: ifeq -> 27041
    //   27030: ldc2_w -264586684
    //   27033: l2i
    //   27034: ldc_w 937896835
    //   27037: ixor
    //   27038: goto -> 27049
    //   27041: ldc2_w 878350306
    //   27044: l2i
    //   27045: ldc_w 768601835
    //   27048: ixor
    //   27049: ldc2_w -263376125
    //   27052: l2i
    //   27053: ldc_w -68488965
    //   27056: ixor
    //   27057: ixor
    //   27058: lookupswitch default -> 30920, -864398785 -> 27041, 305308401 -> 27084
    //   27084: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   27087: ldc2_w -185010610
    //   27090: l2i
    //   27091: ldc_w -185010511
    //   27094: ixor
    //   27095: getstatic Perryc.0 : I
    //   27098: ifle -> 27112
    //   27101: ldc2_w 1248233792
    //   27104: l2i
    //   27105: ldc_w 992141045
    //   27108: ixor
    //   27109: goto -> 27120
    //   27112: ldc2_w 648490936
    //   27115: l2i
    //   27116: ldc_w 261750086
    //   27119: ixor
    //   27120: ldc2_w 1107098880
    //   27123: l2i
    //   27124: ldc_w 394425352
    //   27127: ixor
    //   27128: ixor
    //   27129: lookupswitch default -> 31126, 658169533 -> 27112, 2134924278 -> 27156
    //   27156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27159: ldc2_w -1573928666
    //   27162: l2i
    //   27163: ldc_w -1573928666
    //   27166: ixor
    //   27167: getstatic Perryc.c : I
    //   27170: iflt -> 27184
    //   27173: ldc2_w 787886102
    //   27176: l2i
    //   27177: ldc_w 310410296
    //   27180: ixor
    //   27181: goto -> 27192
    //   27184: ldc2_w 134544521
    //   27187: l2i
    //   27188: ldc_w -868567072
    //   27191: ixor
    //   27192: ldc2_w -1835090340
    //   27195: l2i
    //   27196: ldc_w -787651542
    //   27199: ixor
    //   27200: ixor
    //   27201: lookupswitch default -> 27228, -203836598 -> 27184, 2145752664 -> 31256
    //   27228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27231: ldc2_w -171288151
    //   27234: l2i
    //   27235: ldc_w -171288234
    //   27238: ixor
    //   27239: getstatic Perryc.c : I
    //   27242: iflt -> 27256
    //   27245: ldc2_w 1097447962
    //   27248: l2i
    //   27249: ldc_w -17980210
    //   27252: ixor
    //   27253: goto -> 27264
    //   27256: ldc2_w -2133047891
    //   27259: l2i
    //   27260: ldc_w -1124257769
    //   27263: ixor
    //   27264: ldc2_w 1360143371
    //   27267: l2i
    //   27268: ldc_w 958159789
    //   27271: ixor
    //   27272: ixor
    //   27273: lookupswitch default -> 31306, -678796942 -> 27256, 1412368924 -> 27300
    //   27300: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27303: getstatic Perryc.0 : I
    //   27306: ifle -> 27320
    //   27309: ldc2_w 414287565
    //   27312: l2i
    //   27313: ldc_w 423080396
    //   27316: ixor
    //   27317: goto -> 27328
    //   27320: ldc2_w -701276947
    //   27323: l2i
    //   27324: ldc_w 555769345
    //   27327: ixor
    //   27328: ldc2_w -1917594786
    //   27331: l2i
    //   27332: ldc_w 838862841
    //   27335: ixor
    //   27336: ixor
    //   27337: lookupswitch default -> 31270, -1103764570 -> 27320, 1218500171 -> 27364
    //   27364: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   27367: getstatic Perryc.0 : I
    //   27370: ifle -> 27384
    //   27373: ldc2_w 1814262441
    //   27376: l2i
    //   27377: ldc_w -959549947
    //   27380: ixor
    //   27381: goto -> 27392
    //   27384: ldc2_w 652647617
    //   27387: l2i
    //   27388: ldc_w 875046352
    //   27391: ixor
    //   27392: ldc2_w -1750788271
    //   27395: l2i
    //   27396: ldc_w 1274686229
    //   27399: ixor
    //   27400: ixor
    //   27401: lookupswitch default -> 30756, -829323947 -> 27428, 1991385320 -> 27384
    //   27428: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   27431: getstatic Perryc.0 : I
    //   27434: ifle -> 27448
    //   27437: ldc2_w 1660240824
    //   27440: l2i
    //   27441: ldc_w 743875075
    //   27444: ixor
    //   27445: goto -> 27456
    //   27448: ldc2_w 1385078464
    //   27451: l2i
    //   27452: ldc_w 463893930
    //   27455: ixor
    //   27456: ldc2_w 1496637845
    //   27459: l2i
    //   27460: ldc_w 413293181
    //   27463: ixor
    //   27464: ixor
    //   27465: lookupswitch default -> 27492, 255154771 -> 30884, 1890171743 -> 27448
    //   27492: putfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27495: getstatic Perryc.0 : I
    //   27498: ifle -> 27512
    //   27501: ldc2_w 322436757
    //   27504: l2i
    //   27505: ldc_w 1480970164
    //   27508: ixor
    //   27509: goto -> 27520
    //   27512: ldc2_w -749948027
    //   27515: l2i
    //   27516: ldc_w 1322855900
    //   27519: ixor
    //   27520: ldc2_w -1964273029
    //   27523: l2i
    //   27524: ldc_w -1930207112
    //   27527: ixor
    //   27528: ixor
    //   27529: lookupswitch default -> 27556, -1786271411 -> 27512, 1298842402 -> 30536
    //   27556: aload_0
    //   27557: getstatic Perryc.0 : I
    //   27560: ifle -> 27574
    //   27563: ldc2_w -496289774
    //   27566: l2i
    //   27567: ldc_w -1578283300
    //   27570: ixor
    //   27571: goto -> 27582
    //   27574: ldc2_w -2021854368
    //   27577: l2i
    //   27578: ldc_w -58734196
    //   27581: ixor
    //   27582: ldc2_w -1808562971
    //   27585: l2i
    //   27586: ldc_w 396375068
    //   27589: ixor
    //   27590: ixor
    //   27591: lookupswitch default -> 30710, -1072314825 -> 27574, -124745195 -> 27616
    //   27616: aload_0
    //   27617: new bigname/zprestige/webhack/features/setting/Setting
    //   27620: dup
    //   27621: ldc_w '责㌿贫㶅㩪掹๷蹬暂'
    //   27624: getstatic Perryc.1 : I
    //   27627: ifeq -> 27641
    //   27630: ldc2_w -749147250
    //   27633: l2i
    //   27634: ldc_w 582570003
    //   27637: ixor
    //   27638: goto -> 27649
    //   27641: ldc2_w -69241000
    //   27644: l2i
    //   27645: ldc_w 1453367454
    //   27648: ixor
    //   27649: ldc2_w -1717718063
    //   27652: l2i
    //   27653: ldc_w -1928727329
    //   27656: ixor
    //   27657: ixor
    //   27658: lookupswitch default -> 30542, -1175744312 -> 27684, -445252461 -> 27641
    //   27684: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   27687: ldc2_w -1990140094
    //   27690: l2i
    //   27691: ldc_w -1990140093
    //   27694: ixor
    //   27695: getstatic Perryc.c : I
    //   27698: iflt -> 27712
    //   27701: ldc2_w 583135753
    //   27704: l2i
    //   27705: ldc_w 1332513310
    //   27708: ixor
    //   27709: goto -> 27720
    //   27712: ldc2_w -2020996034
    //   27715: l2i
    //   27716: ldc_w -1624020835
    //   27719: ixor
    //   27720: ldc2_w 902760306
    //   27723: l2i
    //   27724: ldc_w 1258166253
    //   27727: ixor
    //   27728: ixor
    //   27729: lookupswitch default -> 31214, 312240264 -> 27712, 1736995900 -> 27756
    //   27756: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   27759: getstatic Perryc.0 : I
    //   27762: ifle -> 27776
    //   27765: ldc2_w -542207635
    //   27768: l2i
    //   27769: ldc_w 1837469771
    //   27772: ixor
    //   27773: goto -> 27784
    //   27776: ldc2_w 956771076
    //   27779: l2i
    //   27780: ldc_w -636344425
    //   27783: ixor
    //   27784: ldc2_w -1716665704
    //   27787: l2i
    //   27788: ldc_w -467434612
    //   27791: ixor
    //   27792: ixor
    //   27793: lookupswitch default -> 31222, -1633989241 -> 27820, -811253710 -> 27776
    //   27820: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   27823: getstatic Perryc.c : I
    //   27826: iflt -> 27840
    //   27829: ldc2_w -1125155053
    //   27832: l2i
    //   27833: ldc_w 1315636065
    //   27836: ixor
    //   27837: goto -> 27848
    //   27840: ldc2_w 257868298
    //   27843: l2i
    //   27844: ldc_w -1341907624
    //   27847: ixor
    //   27848: ldc2_w -76686669
    //   27851: l2i
    //   27852: ldc_w -566701106
    //   27855: ixor
    //   27856: ixor
    //   27857: lookupswitch default -> 30750, -1710238161 -> 27884, -674138865 -> 27840
    //   27884: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   27887: getstatic Perryc.0 : I
    //   27890: ifle -> 27904
    //   27893: ldc2_w 1015054594
    //   27896: l2i
    //   27897: ldc_w -1016687144
    //   27900: ixor
    //   27901: goto -> 27912
    //   27904: ldc2_w 872859733
    //   27907: l2i
    //   27908: ldc_w 973372929
    //   27911: ixor
    //   27912: ldc2_w -1457721588
    //   27915: l2i
    //   27916: ldc_w -504764614
    //   27919: ixor
    //   27920: ixor
    //   27921: lookupswitch default -> 27948, -1223484180 -> 31178, 1362843501 -> 27904
    //   27948: putfield cRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   27951: getstatic Perryc.c : I
    //   27954: iflt -> 27968
    //   27957: ldc2_w -234758995
    //   27960: l2i
    //   27961: ldc_w -23994684
    //   27964: ixor
    //   27965: goto -> 27976
    //   27968: ldc2_w -487540769
    //   27971: l2i
    //   27972: ldc_w 791402165
    //   27975: ixor
    //   27976: ldc2_w -1779162562
    //   27979: l2i
    //   27980: ldc_w 1785009053
    //   27983: ixor
    //   27984: ixor
    //   27985: lookupswitch default -> 28012, -1564321538 -> 27968, -218025014 -> 30826
    //   28012: aload_0
    //   28013: getstatic Perryc.c : I
    //   28016: iflt -> 28030
    //   28019: ldc2_w 537116716
    //   28022: l2i
    //   28023: ldc_w -258098505
    //   28026: ixor
    //   28027: goto -> 28038
    //   28030: ldc2_w 2105953789
    //   28033: l2i
    //   28034: ldc_w 1734499492
    //   28037: ixor
    //   28038: ldc2_w 1928609753
    //   28041: l2i
    //   28042: ldc_w -1484880025
    //   28045: ixor
    //   28046: ixor
    //   28047: lookupswitch default -> 30992, -814831129 -> 28072, 85246501 -> 28030
    //   28072: aload_0
    //   28073: new bigname/zprestige/webhack/features/setting/Setting
    //   28076: dup
    //   28077: ldc_w '责㌿贫㶖㩧掠๱'
    //   28080: getstatic Perryc.c : I
    //   28083: iflt -> 28097
    //   28086: ldc2_w -1067237362
    //   28089: l2i
    //   28090: ldc_w -1491222618
    //   28093: ixor
    //   28094: goto -> 28105
    //   28097: ldc2_w 919614325
    //   28100: l2i
    //   28101: ldc_w 110751762
    //   28104: ixor
    //   28105: ldc2_w 312889893
    //   28108: l2i
    //   28109: ldc_w -1850289816
    //   28112: ixor
    //   28113: ixor
    //   28114: lookupswitch default -> 31060, -1285996502 -> 28140, -462521115 -> 28097
    //   28140: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   28143: ldc2_w -368216403
    //   28146: l2i
    //   28147: ldc_w -368216494
    //   28150: ixor
    //   28151: getstatic Perryc.1 : I
    //   28154: ifeq -> 28168
    //   28157: ldc2_w 1592192381
    //   28160: l2i
    //   28161: ldc_w -431873203
    //   28164: ixor
    //   28165: goto -> 28176
    //   28168: ldc2_w -1286001344
    //   28171: l2i
    //   28172: ldc_w -1784573449
    //   28175: ixor
    //   28176: ldc2_w -51993352
    //   28179: l2i
    //   28180: ldc_w -2107384886
    //   28183: ixor
    //   28184: ixor
    //   28185: lookupswitch default -> 30510, -970870526 -> 28168, 1484637061 -> 28212
    //   28212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   28215: ldc2_w -1612464793
    //   28218: l2i
    //   28219: ldc_w -1612464793
    //   28222: ixor
    //   28223: getstatic Perryc.1 : I
    //   28226: ifeq -> 28240
    //   28229: ldc2_w 1652627295
    //   28232: l2i
    //   28233: ldc_w -758060544
    //   28236: ixor
    //   28237: goto -> 28248
    //   28240: ldc2_w -1952696480
    //   28243: l2i
    //   28244: ldc_w -1388955954
    //   28247: ixor
    //   28248: ldc2_w -1770018629
    //   28251: l2i
    //   28252: ldc_w 1367801005
    //   28255: ixor
    //   28256: ixor
    //   28257: lookupswitch default -> 31148, -514632264 -> 28284, 2007542089 -> 28240
    //   28284: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   28287: ldc2_w -965590859
    //   28290: l2i
    //   28291: ldc_w -965590966
    //   28294: ixor
    //   28295: getstatic Perryc.c : I
    //   28298: iflt -> 28312
    //   28301: ldc2_w -130846694
    //   28304: l2i
    //   28305: ldc_w 1691874266
    //   28308: ixor
    //   28309: goto -> 28320
    //   28312: ldc2_w 2146910821
    //   28315: l2i
    //   28316: ldc_w 2061430456
    //   28319: ixor
    //   28320: ldc2_w 1770515868
    //   28323: l2i
    //   28324: ldc_w -425056531
    //   28327: ixor
    //   28328: ixor
    //   28329: lookupswitch default -> 28356, -1538773857 -> 28312, 331958449 -> 31048
    //   28356: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   28359: getstatic Perryc.0 : I
    //   28362: ifle -> 28376
    //   28365: ldc2_w 774043439
    //   28368: l2i
    //   28369: ldc_w 612652265
    //   28372: ixor
    //   28373: goto -> 28384
    //   28376: ldc2_w 50210850
    //   28379: l2i
    //   28380: ldc_w 1464005262
    //   28383: ixor
    //   28384: ldc2_w -283366927
    //   28387: l2i
    //   28388: ldc_w 23259911
    //   28391: ixor
    //   28392: ixor
    //   28393: lookupswitch default -> 28420, -455581392 -> 30792, 1615125516 -> 28376
    //   28420: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   28423: getstatic Perryc.c : I
    //   28426: iflt -> 28440
    //   28429: ldc2_w 1264818114
    //   28432: l2i
    //   28433: ldc_w -2027216343
    //   28436: ixor
    //   28437: goto -> 28448
    //   28440: ldc2_w -1212309409
    //   28443: l2i
    //   28444: ldc_w -1514191792
    //   28447: ixor
    //   28448: ldc2_w -1473992766
    //   28451: l2i
    //   28452: ldc_w 336220371
    //   28455: ixor
    //   28456: ixor
    //   28457: lookupswitch default -> 30934, -1372843234 -> 28484, 1885750010 -> 28440
    //   28484: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   28487: getstatic Perryc.1 : I
    //   28490: ifeq -> 28504
    //   28493: ldc2_w 1021947614
    //   28496: l2i
    //   28497: ldc_w 754146785
    //   28500: ixor
    //   28501: goto -> 28512
    //   28504: ldc2_w -511259475
    //   28507: l2i
    //   28508: ldc_w -983528541
    //   28511: ixor
    //   28512: ldc2_w -191700053
    //   28515: l2i
    //   28516: ldc_w 555581999
    //   28519: ixor
    //   28520: ixor
    //   28521: lookupswitch default -> 30700, -980053317 -> 28504, -244767094 -> 28548
    //   28548: putfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   28551: getstatic Perryc.0 : I
    //   28554: ifle -> 28568
    //   28557: ldc2_w 1870643906
    //   28560: l2i
    //   28561: ldc_w -1836094015
    //   28564: ixor
    //   28565: goto -> 28576
    //   28568: ldc2_w -1036888065
    //   28571: l2i
    //   28572: ldc_w -1179958034
    //   28575: ixor
    //   28576: ldc2_w -1044193920
    //   28579: l2i
    //   28580: ldc_w -20945016
    //   28583: ixor
    //   28584: ixor
    //   28585: lookupswitch default -> 28612, -1024322293 -> 30790, -736763787 -> 28568
    //   28612: aload_0
    //   28613: getstatic Perryc.0 : I
    //   28616: ifle -> 28630
    //   28619: ldc2_w 593258765
    //   28622: l2i
    //   28623: ldc_w -820083416
    //   28626: ixor
    //   28627: goto -> 28638
    //   28630: ldc2_w -507071723
    //   28633: l2i
    //   28634: ldc_w 2008223880
    //   28637: ixor
    //   28638: ldc2_w -1055912349
    //   28641: l2i
    //   28642: ldc_w -512101203
    //   28645: ixor
    //   28646: ixor
    //   28647: lookupswitch default -> 28672, -869591317 -> 30628, 326141872 -> 28630
    //   28672: aload_0
    //   28673: new bigname/zprestige/webhack/features/setting/Setting
    //   28676: dup
    //   28677: ldc_w '贠㌚赨㶲㩜掹๽蹫'
    //   28680: getstatic Perryc.1 : I
    //   28683: ifeq -> 28697
    //   28686: ldc2_w 960652999
    //   28689: l2i
    //   28690: ldc_w 1690236820
    //   28693: ixor
    //   28694: goto -> 28705
    //   28697: ldc2_w -259263093
    //   28700: l2i
    //   28701: ldc_w -1058265167
    //   28704: ixor
    //   28705: ldc2_w 691467549
    //   28708: l2i
    //   28709: ldc_w 717586498
    //   28712: ixor
    //   28713: ixor
    //   28714: lookupswitch default -> 30582, 865380197 -> 28740, 1578099724 -> 28697
    //   28740: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   28743: ldc_w 6.729562
    //   28746: invokestatic floatToIntBits : (F)I
    //   28749: ldc_w 2136430738
    //   28752: ixor
    //   28753: invokestatic intBitsToFloat : (I)F
    //   28756: getstatic Perryc.1 : I
    //   28759: ifeq -> 28773
    //   28762: ldc2_w 832940361
    //   28765: l2i
    //   28766: ldc_w 1516875312
    //   28769: ixor
    //   28770: goto -> 28781
    //   28773: ldc2_w -2054283501
    //   28776: l2i
    //   28777: ldc_w -675695531
    //   28780: ixor
    //   28781: ldc2_w 1213479943
    //   28784: l2i
    //   28785: ldc_w -1035542552
    //   28788: ixor
    //   28789: ixor
    //   28790: lookupswitch default -> 31228, -668645207 -> 28816, -505486186 -> 28773
    //   28816: invokestatic valueOf : (F)Ljava/lang/Float;
    //   28819: ldc_w 175.9501
    //   28822: invokestatic floatToIntBits : (F)I
    //   28825: ldc_w 2128822263
    //   28828: ixor
    //   28829: invokestatic intBitsToFloat : (I)F
    //   28832: getstatic Perryc.0 : I
    //   28835: ifle -> 28849
    //   28838: ldc2_w -886879818
    //   28841: l2i
    //   28842: ldc_w -1112530427
    //   28845: ixor
    //   28846: goto -> 28857
    //   28849: ldc2_w -1863359902
    //   28852: l2i
    //   28853: ldc_w 1625224680
    //   28856: ixor
    //   28857: ldc2_w 774723103
    //   28860: l2i
    //   28861: ldc_w 733909249
    //   28864: ixor
    //   28865: ixor
    //   28866: lookupswitch default -> 28892, -1210366310 -> 28849, 1929424045 -> 30522
    //   28892: invokestatic valueOf : (F)Ljava/lang/Float;
    //   28895: ldc_w 1.0215986
    //   28898: invokestatic floatToIntBits : (F)I
    //   28901: ldc_w 2132984766
    //   28904: ixor
    //   28905: invokestatic intBitsToFloat : (I)F
    //   28908: getstatic Perryc.c : I
    //   28911: iflt -> 28925
    //   28914: ldc2_w 1886961483
    //   28917: l2i
    //   28918: ldc_w -26911349
    //   28921: ixor
    //   28922: goto -> 28933
    //   28925: ldc2_w 1407261479
    //   28928: l2i
    //   28929: ldc_w -1131281243
    //   28932: ixor
    //   28933: ldc2_w -1577813271
    //   28936: l2i
    //   28937: ldc_w 1762243535
    //   28940: ixor
    //   28941: ixor
    //   28942: lookupswitch default -> 28968, 822398682 -> 28925, 1189096422 -> 30718
    //   28968: invokestatic valueOf : (F)Ljava/lang/Float;
    //   28971: getstatic Perryc.0 : I
    //   28974: ifle -> 28988
    //   28977: ldc2_w 1656994225
    //   28980: l2i
    //   28981: ldc_w -977684096
    //   28984: ixor
    //   28985: goto -> 28996
    //   28988: ldc2_w 1834461587
    //   28991: l2i
    //   28992: ldc_w -1227408765
    //   28995: ixor
    //   28996: ldc2_w 1314562345
    //   28999: l2i
    //   29000: ldc_w 1932331179
    //   29003: ixor
    //   29004: ixor
    //   29005: lookupswitch default -> 29032, -1710380621 -> 30842, -1316923647 -> 28988
    //   29032: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   29035: getstatic Perryc.1 : I
    //   29038: ifeq -> 29052
    //   29041: ldc2_w -906601007
    //   29044: l2i
    //   29045: ldc_w -827612553
    //   29048: ixor
    //   29049: goto -> 29060
    //   29052: ldc2_w 484332991
    //   29055: l2i
    //   29056: ldc_w -756754470
    //   29059: ixor
    //   29060: ldc2_w 476777167
    //   29063: l2i
    //   29064: ldc_w -1845921442
    //   29067: ixor
    //   29068: ixor
    //   29069: lookupswitch default -> 29096, -1966109641 -> 30566, -797284904 -> 29052
    //   29096: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   29099: getstatic Perryc.c : I
    //   29102: iflt -> 29116
    //   29105: ldc2_w -1382205809
    //   29108: l2i
    //   29109: ldc_w 1174764773
    //   29112: ixor
    //   29113: goto -> 29124
    //   29116: ldc2_w 2097512232
    //   29119: l2i
    //   29120: ldc_w 1377964864
    //   29123: ixor
    //   29124: ldc2_w -226011927
    //   29127: l2i
    //   29128: ldc_w 325426580
    //   29131: ixor
    //   29132: ixor
    //   29133: lookupswitch default -> 29160, 73821508 -> 29116, 175801111 -> 30942
    //   29160: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   29163: getstatic Perryc.c : I
    //   29166: iflt -> 29180
    //   29169: ldc2_w -1401685902
    //   29172: l2i
    //   29173: ldc_w 2095028866
    //   29176: ixor
    //   29177: goto -> 29188
    //   29180: ldc2_w 2054808769
    //   29183: l2i
    //   29184: ldc_w -1518610553
    //   29187: ixor
    //   29188: ldc2_w 1361288577
    //   29191: l2i
    //   29192: ldc_w 1146871719
    //   29195: ixor
    //   29196: ixor
    //   29197: lookupswitch default -> 29224, -975953706 -> 30564, 1696264712 -> 29180
    //   29224: aload_0
    //   29225: getstatic Perryc.1 : I
    //   29228: ifeq -> 29242
    //   29231: ldc2_w 1225211864
    //   29234: l2i
    //   29235: ldc_w 536099112
    //   29238: ixor
    //   29239: goto -> 29250
    //   29242: ldc2_w 566487738
    //   29245: l2i
    //   29246: ldc_w -1542921388
    //   29249: ixor
    //   29250: ldc2_w 1290451996
    //   29253: l2i
    //   29254: ldc_w 1893773254
    //   29257: ixor
    //   29258: ixor
    //   29259: lookupswitch default -> 29284, 1794708778 -> 31120, 2006322073 -> 29242
    //   29284: aload_0
    //   29285: new bigname/zprestige/webhack/features/setting/Setting
    //   29288: dup
    //   29289: ldc_w '贾㌖赨㶳㩮探ู蹢暘㗖ਠ䃑'
    //   29292: getstatic Perryc.1 : I
    //   29295: ifeq -> 29309
    //   29298: ldc2_w -17689097
    //   29301: l2i
    //   29302: ldc_w -56464150
    //   29305: ixor
    //   29306: goto -> 29317
    //   29309: ldc2_w -25098294
    //   29312: l2i
    //   29313: ldc_w 1473415344
    //   29316: ixor
    //   29317: ldc2_w -862838482
    //   29320: l2i
    //   29321: ldc_w 1658292918
    //   29324: ixor
    //   29325: ixor
    //   29326: lookupswitch default -> 29352, -1590945464 -> 29309, -1407855995 -> 30928
    //   29352: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   29355: ldc2_w 1139991581
    //   29358: l2i
    //   29359: ldc_w 1139991580
    //   29362: ixor
    //   29363: getstatic Perryc.c : I
    //   29366: iflt -> 29380
    //   29369: ldc2_w -256253083
    //   29372: l2i
    //   29373: ldc_w 843857610
    //   29376: ixor
    //   29377: goto -> 29388
    //   29380: ldc2_w 1029045318
    //   29383: l2i
    //   29384: ldc_w 1773719549
    //   29387: ixor
    //   29388: ldc2_w -819650541
    //   29391: l2i
    //   29392: ldc_w -72043795
    //   29395: ixor
    //   29396: ixor
    //   29397: lookupswitch default -> 29424, -161198255 -> 30518, 1175829689 -> 29380
    //   29424: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   29427: getstatic Perryc.1 : I
    //   29430: ifeq -> 29444
    //   29433: ldc2_w -551768430
    //   29436: l2i
    //   29437: ldc_w 767191973
    //   29440: ixor
    //   29441: goto -> 29452
    //   29444: ldc2_w -20792832
    //   29447: l2i
    //   29448: ldc_w 341243243
    //   29451: ixor
    //   29452: ldc2_w 1038893333
    //   29455: l2i
    //   29456: ldc_w -547882094
    //   29459: ixor
    //   29460: ixor
    //   29461: lookupswitch default -> 29488, -1794859190 -> 29444, 270368688 -> 31378
    //   29488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   29491: getstatic Perryc.1 : I
    //   29494: ifeq -> 29508
    //   29497: ldc2_w 191306298
    //   29500: l2i
    //   29501: ldc_w 1518534226
    //   29504: ixor
    //   29505: goto -> 29516
    //   29508: ldc2_w -1083963738
    //   29511: l2i
    //   29512: ldc_w -682319973
    //   29515: ixor
    //   29516: ldc2_w -1901664586
    //   29519: l2i
    //   29520: ldc_w -2073825916
    //   29523: ixor
    //   29524: ixor
    //   29525: lookupswitch default -> 29552, 746286820 -> 29508, 1528885082 -> 30734
    //   29552: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   29555: getstatic Perryc.0 : I
    //   29558: ifle -> 29572
    //   29561: ldc2_w -2006279359
    //   29564: l2i
    //   29565: ldc_w -543509248
    //   29568: ixor
    //   29569: goto -> 29580
    //   29572: ldc2_w 1588617786
    //   29575: l2i
    //   29576: ldc_w -518902672
    //   29579: ixor
    //   29580: ldc2_w 1049898791
    //   29583: l2i
    //   29584: ldc_w -1974641550
    //   29587: ixor
    //   29588: ixor
    //   29589: lookupswitch default -> 30810, -483828460 -> 29572, 192625951 -> 29616
    //   29616: putfield renderDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   29619: getstatic Perryc.1 : I
    //   29622: ifeq -> 29636
    //   29625: ldc2_w 1948148414
    //   29628: l2i
    //   29629: ldc_w -283240396
    //   29632: ixor
    //   29633: goto -> 29644
    //   29636: ldc2_w -1147980762
    //   29639: l2i
    //   29640: ldc_w -153730402
    //   29643: ixor
    //   29644: ldc2_w -613770495
    //   29647: l2i
    //   29648: ldc_w 556975262
    //   29651: ixor
    //   29652: ixor
    //   29653: lookupswitch default -> 30758, -1222825689 -> 29680, 1633166613 -> 29636
    //   29680: aload_0
    //   29681: new java/util/ArrayList
    //   29684: dup
    //   29685: getstatic Perryc.1 : I
    //   29688: ifeq -> 29702
    //   29691: ldc2_w -177193011
    //   29694: l2i
    //   29695: ldc_w 1614806117
    //   29698: ixor
    //   29699: goto -> 29710
    //   29702: ldc2_w 1664376464
    //   29705: l2i
    //   29706: ldc_w -1905672884
    //   29709: ixor
    //   29710: ldc2_w -1878092237
    //   29713: l2i
    //   29714: ldc_w 703235808
    //   29717: ixor
    //   29718: ixor
    //   29719: lookupswitch default -> 29744, -387050356 -> 29702, 749458299 -> 30858
    //   29744: invokespecial <init> : ()V
    //   29747: getstatic Perryc.c : I
    //   29750: iflt -> 29764
    //   29753: ldc2_w -1528839447
    //   29756: l2i
    //   29757: ldc_w 1216201239
    //   29760: ixor
    //   29761: goto -> 29772
    //   29764: ldc2_w 682950103
    //   29767: l2i
    //   29768: ldc_w 2025815016
    //   29771: ixor
    //   29772: ldc2_w -1218314449
    //   29775: l2i
    //   29776: ldc_w 539345639
    //   29779: ixor
    //   29780: ixor
    //   29781: lookupswitch default -> 29808, 294285869 -> 29764, 2078686518 -> 30652
    //   29808: putfield attemptedCrystals : Ljava/util/List;
    //   29811: getstatic Perryc.0 : I
    //   29814: ifle -> 29828
    //   29817: ldc2_w 259025495
    //   29820: l2i
    //   29821: ldc_w 1227657839
    //   29824: ixor
    //   29825: goto -> 29836
    //   29828: ldc2_w 709762522
    //   29831: l2i
    //   29832: ldc_w -2064004066
    //   29835: ixor
    //   29836: ldc2_w -290754995
    //   29839: l2i
    //   29840: ldc_w -281221695
    //   29843: ixor
    //   29844: ixor
    //   29845: lookupswitch default -> 29872, 1199878041 -> 29828, 1204515764 -> 31136
    //   29872: aload_0
    //   29873: aconst_null
    //   29874: getstatic Perryc.1 : I
    //   29877: ifeq -> 29891
    //   29880: ldc2_w 1199819834
    //   29883: l2i
    //   29884: ldc_w -357851467
    //   29887: ixor
    //   29888: goto -> 29899
    //   29891: ldc2_w 1440027680
    //   29894: l2i
    //   29895: ldc_w 1373800581
    //   29898: ixor
    //   29899: ldc2_w 333637556
    //   29902: l2i
    //   29903: ldc_w 217753518
    //   29906: ixor
    //   29907: ixor
    //   29908: lookupswitch default -> 30776, -1305472363 -> 29891, 456121535 -> 29936
    //   29936: putfield ezTarget : Lnet/minecraft/entity/player/EntityPlayer;
    //   29939: getstatic Perryc.1 : I
    //   29942: ifeq -> 29956
    //   29945: ldc2_w 1874743015
    //   29948: l2i
    //   29949: ldc_w -873556783
    //   29952: ixor
    //   29953: goto -> 29964
    //   29956: ldc2_w -563629261
    //   29959: l2i
    //   29960: ldc_w -2070610808
    //   29963: ixor
    //   29964: ldc2_w -1272375224
    //   29967: l2i
    //   29968: ldc_w 57723976
    //   29971: ixor
    //   29972: ixor
    //   29973: lookupswitch default -> 30000, -1412358124 -> 29956, 319360566 -> 30556
    //   30000: aload_0
    //   30001: aconst_null
    //   30002: getstatic Perryc.1 : I
    //   30005: ifeq -> 30019
    //   30008: ldc2_w 1655210144
    //   30011: l2i
    //   30012: ldc_w 759614291
    //   30015: ixor
    //   30016: goto -> 30027
    //   30019: ldc2_w 1999846243
    //   30022: l2i
    //   30023: ldc_w -1727337877
    //   30026: ixor
    //   30027: ldc2_w -1308651773
    //   30030: l2i
    //   30031: ldc_w 247313439
    //   30034: ixor
    //   30035: ixor
    //   30036: lookupswitch default -> 30064, -955242126 -> 30019, -257134353 -> 30650
    //   30064: putfield renderBlock : Lnet/minecraft/util/math/BlockPos;
    //   30067: getstatic Perryc.c : I
    //   30070: iflt -> 30084
    //   30073: ldc2_w -1517461571
    //   30076: l2i
    //   30077: ldc_w 174456815
    //   30080: ixor
    //   30081: goto -> 30092
    //   30084: ldc2_w -1585429607
    //   30087: l2i
    //   30088: ldc_w -1364785786
    //   30091: ixor
    //   30092: ldc2_w -152771628
    //   30095: l2i
    //   30096: ldc_w -97005567
    //   30099: ixor
    //   30100: ixor
    //   30101: lookupswitch default -> 30128, -1556376697 -> 31080, 1819524218 -> 30084
    //   30128: aload_0
    //   30129: ldc2_w 1.602718216818025E308
    //   30132: invokestatic doubleToLongBits : (D)J
    //   30135: ldc2_w 9217891530823056036
    //   30138: lxor
    //   30139: invokestatic longBitsToDouble : (J)D
    //   30142: getstatic Perryc.1 : I
    //   30145: ifeq -> 30159
    //   30148: ldc2_w -1698396395
    //   30151: l2i
    //   30152: ldc_w 880138466
    //   30155: ixor
    //   30156: goto -> 30167
    //   30159: ldc2_w -358658574
    //   30162: l2i
    //   30163: ldc_w 980760985
    //   30166: ixor
    //   30167: ldc2_w 1263903881
    //   30170: l2i
    //   30171: ldc_w 89591617
    //   30174: ixor
    //   30175: ixor
    //   30176: lookupswitch default -> 30812, -1628905565 -> 30204, -525077441 -> 30159
    //   30204: putfield renderDamageVal : D
    //   30207: getstatic Perryc.1 : I
    //   30210: ifeq -> 30224
    //   30213: ldc2_w -2122352461
    //   30216: l2i
    //   30217: ldc_w -2115573286
    //   30220: ixor
    //   30221: goto -> 30232
    //   30224: ldc2_w -660440884
    //   30227: l2i
    //   30228: ldc_w -1067004912
    //   30231: ixor
    //   30232: ldc2_w 179792110
    //   30235: l2i
    //   30236: ldc_w 1418281048
    //   30239: ixor
    //   30240: ixor
    //   30241: lookupswitch default -> 30588, 1190829162 -> 30268, 1588050399 -> 30224
    //   30268: aload_0
    //   30269: ldc_w -1124640457
    //   30272: i2l
    //   30273: ldc2_w -1124640457
    //   30276: lxor
    //   30277: getstatic Perryc.1 : I
    //   30280: ifeq -> 30294
    //   30283: ldc2_w -1901724543
    //   30286: l2i
    //   30287: ldc_w -1201249883
    //   30290: ixor
    //   30291: goto -> 30302
    //   30294: ldc2_w 205657505
    //   30297: l2i
    //   30298: ldc_w 449578090
    //   30301: ixor
    //   30302: ldc2_w 476399841
    //   30305: l2i
    //   30306: ldc_w -222756422
    //   30309: ixor
    //   30310: ixor
    //   30311: lookupswitch default -> 30676, -669002625 -> 30294, -128821104 -> 30336
    //   30336: putfield start : J
    //   30339: getstatic Perryc.1 : I
    //   30342: ifeq -> 30356
    //   30345: ldc2_w 2132650783
    //   30348: l2i
    //   30349: ldc_w 857918574
    //   30352: ixor
    //   30353: goto -> 30364
    //   30356: ldc2_w 1858012525
    //   30359: l2i
    //   30360: ldc_w 897872002
    //   30363: ixor
    //   30364: ldc2_w -1506203434
    //   30367: l2i
    //   30368: ldc_w 798900115
    //   30371: ixor
    //   30372: ixor
    //   30373: lookupswitch default -> 30400, -979865548 -> 30748, -542257494 -> 30356
    //   30400: aload_0
    //   30401: getstatic Perryc.0 : I
    //   30404: ifle -> 30418
    //   30407: ldc2_w -505586092
    //   30410: l2i
    //   30411: ldc_w 1133839749
    //   30414: ixor
    //   30415: goto -> 30426
    //   30418: ldc2_w 1955707880
    //   30421: l2i
    //   30422: ldc_w 824311759
    //   30425: ixor
    //   30426: ldc2_w -849492092
    //   30429: l2i
    //   30430: ldc_w -254588989
    //   30433: ixor
    //   30434: ixor
    //   30435: lookupswitch default -> 30886, -1614357610 -> 30418, 2017379424 -> 30460
    //   30460: putstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   30463: return
    //   30464: aconst_null
    //   30465: athrow
    //   30466: aconst_null
    //   30467: athrow
    //   30468: aconst_null
    //   30469: athrow
    //   30470: aconst_null
    //   30471: athrow
    //   30472: aconst_null
    //   30473: athrow
    //   30474: aconst_null
    //   30475: athrow
    //   30476: aconst_null
    //   30477: athrow
    //   30478: aconst_null
    //   30479: athrow
    //   30480: aconst_null
    //   30481: athrow
    //   30482: aconst_null
    //   30483: athrow
    //   30484: aconst_null
    //   30485: athrow
    //   30486: aconst_null
    //   30487: athrow
    //   30488: aconst_null
    //   30489: athrow
    //   30490: aconst_null
    //   30491: athrow
    //   30492: aconst_null
    //   30493: athrow
    //   30494: aconst_null
    //   30495: athrow
    //   30496: aconst_null
    //   30497: athrow
    //   30498: aconst_null
    //   30499: athrow
    //   30500: aconst_null
    //   30501: athrow
    //   30502: aconst_null
    //   30503: athrow
    //   30504: aconst_null
    //   30505: athrow
    //   30506: aconst_null
    //   30507: athrow
    //   30508: aconst_null
    //   30509: athrow
    //   30510: aconst_null
    //   30511: athrow
    //   30512: aconst_null
    //   30513: athrow
    //   30514: aconst_null
    //   30515: athrow
    //   30516: aconst_null
    //   30517: athrow
    //   30518: aconst_null
    //   30519: athrow
    //   30520: aconst_null
    //   30521: athrow
    //   30522: aconst_null
    //   30523: athrow
    //   30524: aconst_null
    //   30525: athrow
    //   30526: aconst_null
    //   30527: athrow
    //   30528: aconst_null
    //   30529: athrow
    //   30530: aconst_null
    //   30531: athrow
    //   30532: aconst_null
    //   30533: athrow
    //   30534: aconst_null
    //   30535: athrow
    //   30536: aconst_null
    //   30537: athrow
    //   30538: aconst_null
    //   30539: athrow
    //   30540: aconst_null
    //   30541: athrow
    //   30542: aconst_null
    //   30543: athrow
    //   30544: aconst_null
    //   30545: athrow
    //   30546: aconst_null
    //   30547: athrow
    //   30548: aconst_null
    //   30549: athrow
    //   30550: aconst_null
    //   30551: athrow
    //   30552: aconst_null
    //   30553: athrow
    //   30554: aconst_null
    //   30555: athrow
    //   30556: aconst_null
    //   30557: athrow
    //   30558: aconst_null
    //   30559: athrow
    //   30560: aconst_null
    //   30561: athrow
    //   30562: aconst_null
    //   30563: athrow
    //   30564: aconst_null
    //   30565: athrow
    //   30566: aconst_null
    //   30567: athrow
    //   30568: aconst_null
    //   30569: athrow
    //   30570: aconst_null
    //   30571: athrow
    //   30572: aconst_null
    //   30573: athrow
    //   30574: aconst_null
    //   30575: athrow
    //   30576: aconst_null
    //   30577: athrow
    //   30578: aconst_null
    //   30579: athrow
    //   30580: aconst_null
    //   30581: athrow
    //   30582: aconst_null
    //   30583: athrow
    //   30584: aconst_null
    //   30585: athrow
    //   30586: aconst_null
    //   30587: athrow
    //   30588: aconst_null
    //   30589: athrow
    //   30590: aconst_null
    //   30591: athrow
    //   30592: aconst_null
    //   30593: athrow
    //   30594: aconst_null
    //   30595: athrow
    //   30596: aconst_null
    //   30597: athrow
    //   30598: aconst_null
    //   30599: athrow
    //   30600: aconst_null
    //   30601: athrow
    //   30602: aconst_null
    //   30603: athrow
    //   30604: aconst_null
    //   30605: athrow
    //   30606: aconst_null
    //   30607: athrow
    //   30608: aconst_null
    //   30609: athrow
    //   30610: aconst_null
    //   30611: athrow
    //   30612: aconst_null
    //   30613: athrow
    //   30614: aconst_null
    //   30615: athrow
    //   30616: aconst_null
    //   30617: athrow
    //   30618: aconst_null
    //   30619: athrow
    //   30620: aconst_null
    //   30621: athrow
    //   30622: aconst_null
    //   30623: athrow
    //   30624: aconst_null
    //   30625: athrow
    //   30626: aconst_null
    //   30627: athrow
    //   30628: aconst_null
    //   30629: athrow
    //   30630: aconst_null
    //   30631: athrow
    //   30632: aconst_null
    //   30633: athrow
    //   30634: aconst_null
    //   30635: athrow
    //   30636: aconst_null
    //   30637: athrow
    //   30638: aconst_null
    //   30639: athrow
    //   30640: aconst_null
    //   30641: athrow
    //   30642: aconst_null
    //   30643: athrow
    //   30644: aconst_null
    //   30645: athrow
    //   30646: aconst_null
    //   30647: athrow
    //   30648: aconst_null
    //   30649: athrow
    //   30650: aconst_null
    //   30651: athrow
    //   30652: aconst_null
    //   30653: athrow
    //   30654: aconst_null
    //   30655: athrow
    //   30656: aconst_null
    //   30657: athrow
    //   30658: aconst_null
    //   30659: athrow
    //   30660: aconst_null
    //   30661: athrow
    //   30662: aconst_null
    //   30663: athrow
    //   30664: aconst_null
    //   30665: athrow
    //   30666: aconst_null
    //   30667: athrow
    //   30668: aconst_null
    //   30669: athrow
    //   30670: aconst_null
    //   30671: athrow
    //   30672: aconst_null
    //   30673: athrow
    //   30674: aconst_null
    //   30675: athrow
    //   30676: aconst_null
    //   30677: athrow
    //   30678: aconst_null
    //   30679: athrow
    //   30680: aconst_null
    //   30681: athrow
    //   30682: aconst_null
    //   30683: athrow
    //   30684: aconst_null
    //   30685: athrow
    //   30686: aconst_null
    //   30687: athrow
    //   30688: aconst_null
    //   30689: athrow
    //   30690: aconst_null
    //   30691: athrow
    //   30692: aconst_null
    //   30693: athrow
    //   30694: aconst_null
    //   30695: athrow
    //   30696: aconst_null
    //   30697: athrow
    //   30698: aconst_null
    //   30699: athrow
    //   30700: aconst_null
    //   30701: athrow
    //   30702: aconst_null
    //   30703: athrow
    //   30704: aconst_null
    //   30705: athrow
    //   30706: aconst_null
    //   30707: athrow
    //   30708: aconst_null
    //   30709: athrow
    //   30710: aconst_null
    //   30711: athrow
    //   30712: aconst_null
    //   30713: athrow
    //   30714: aconst_null
    //   30715: athrow
    //   30716: aconst_null
    //   30717: athrow
    //   30718: aconst_null
    //   30719: athrow
    //   30720: aconst_null
    //   30721: athrow
    //   30722: aconst_null
    //   30723: athrow
    //   30724: aconst_null
    //   30725: athrow
    //   30726: aconst_null
    //   30727: athrow
    //   30728: aconst_null
    //   30729: athrow
    //   30730: aconst_null
    //   30731: athrow
    //   30732: aconst_null
    //   30733: athrow
    //   30734: aconst_null
    //   30735: athrow
    //   30736: aconst_null
    //   30737: athrow
    //   30738: aconst_null
    //   30739: athrow
    //   30740: aconst_null
    //   30741: athrow
    //   30742: aconst_null
    //   30743: athrow
    //   30744: aconst_null
    //   30745: athrow
    //   30746: aconst_null
    //   30747: athrow
    //   30748: aconst_null
    //   30749: athrow
    //   30750: aconst_null
    //   30751: athrow
    //   30752: aconst_null
    //   30753: athrow
    //   30754: aconst_null
    //   30755: athrow
    //   30756: aconst_null
    //   30757: athrow
    //   30758: aconst_null
    //   30759: athrow
    //   30760: aconst_null
    //   30761: athrow
    //   30762: aconst_null
    //   30763: athrow
    //   30764: aconst_null
    //   30765: athrow
    //   30766: aconst_null
    //   30767: athrow
    //   30768: aconst_null
    //   30769: athrow
    //   30770: aconst_null
    //   30771: athrow
    //   30772: aconst_null
    //   30773: athrow
    //   30774: aconst_null
    //   30775: athrow
    //   30776: aconst_null
    //   30777: athrow
    //   30778: aconst_null
    //   30779: athrow
    //   30780: aconst_null
    //   30781: athrow
    //   30782: aconst_null
    //   30783: athrow
    //   30784: aconst_null
    //   30785: athrow
    //   30786: aconst_null
    //   30787: athrow
    //   30788: aconst_null
    //   30789: athrow
    //   30790: aconst_null
    //   30791: athrow
    //   30792: aconst_null
    //   30793: athrow
    //   30794: aconst_null
    //   30795: athrow
    //   30796: aconst_null
    //   30797: athrow
    //   30798: aconst_null
    //   30799: athrow
    //   30800: aconst_null
    //   30801: athrow
    //   30802: aconst_null
    //   30803: athrow
    //   30804: aconst_null
    //   30805: athrow
    //   30806: aconst_null
    //   30807: athrow
    //   30808: aconst_null
    //   30809: athrow
    //   30810: aconst_null
    //   30811: athrow
    //   30812: aconst_null
    //   30813: athrow
    //   30814: aconst_null
    //   30815: athrow
    //   30816: aconst_null
    //   30817: athrow
    //   30818: aconst_null
    //   30819: athrow
    //   30820: aconst_null
    //   30821: athrow
    //   30822: aconst_null
    //   30823: athrow
    //   30824: aconst_null
    //   30825: athrow
    //   30826: aconst_null
    //   30827: athrow
    //   30828: aconst_null
    //   30829: athrow
    //   30830: aconst_null
    //   30831: athrow
    //   30832: aconst_null
    //   30833: athrow
    //   30834: aconst_null
    //   30835: athrow
    //   30836: aconst_null
    //   30837: athrow
    //   30838: aconst_null
    //   30839: athrow
    //   30840: aconst_null
    //   30841: athrow
    //   30842: aconst_null
    //   30843: athrow
    //   30844: aconst_null
    //   30845: athrow
    //   30846: aconst_null
    //   30847: athrow
    //   30848: aconst_null
    //   30849: athrow
    //   30850: aconst_null
    //   30851: athrow
    //   30852: aconst_null
    //   30853: athrow
    //   30854: aconst_null
    //   30855: athrow
    //   30856: aconst_null
    //   30857: athrow
    //   30858: aconst_null
    //   30859: athrow
    //   30860: aconst_null
    //   30861: athrow
    //   30862: aconst_null
    //   30863: athrow
    //   30864: aconst_null
    //   30865: athrow
    //   30866: aconst_null
    //   30867: athrow
    //   30868: aconst_null
    //   30869: athrow
    //   30870: aconst_null
    //   30871: athrow
    //   30872: aconst_null
    //   30873: athrow
    //   30874: aconst_null
    //   30875: athrow
    //   30876: aconst_null
    //   30877: athrow
    //   30878: aconst_null
    //   30879: athrow
    //   30880: aconst_null
    //   30881: athrow
    //   30882: aconst_null
    //   30883: athrow
    //   30884: aconst_null
    //   30885: athrow
    //   30886: aconst_null
    //   30887: athrow
    //   30888: aconst_null
    //   30889: athrow
    //   30890: aconst_null
    //   30891: athrow
    //   30892: aconst_null
    //   30893: athrow
    //   30894: aconst_null
    //   30895: athrow
    //   30896: aconst_null
    //   30897: athrow
    //   30898: aconst_null
    //   30899: athrow
    //   30900: aconst_null
    //   30901: athrow
    //   30902: aconst_null
    //   30903: athrow
    //   30904: aconst_null
    //   30905: athrow
    //   30906: aconst_null
    //   30907: athrow
    //   30908: aconst_null
    //   30909: athrow
    //   30910: aconst_null
    //   30911: athrow
    //   30912: aconst_null
    //   30913: athrow
    //   30914: aconst_null
    //   30915: athrow
    //   30916: aconst_null
    //   30917: athrow
    //   30918: aconst_null
    //   30919: athrow
    //   30920: aconst_null
    //   30921: athrow
    //   30922: aconst_null
    //   30923: athrow
    //   30924: aconst_null
    //   30925: athrow
    //   30926: aconst_null
    //   30927: athrow
    //   30928: aconst_null
    //   30929: athrow
    //   30930: aconst_null
    //   30931: athrow
    //   30932: aconst_null
    //   30933: athrow
    //   30934: aconst_null
    //   30935: athrow
    //   30936: aconst_null
    //   30937: athrow
    //   30938: aconst_null
    //   30939: athrow
    //   30940: aconst_null
    //   30941: athrow
    //   30942: aconst_null
    //   30943: athrow
    //   30944: aconst_null
    //   30945: athrow
    //   30946: aconst_null
    //   30947: athrow
    //   30948: aconst_null
    //   30949: athrow
    //   30950: aconst_null
    //   30951: athrow
    //   30952: aconst_null
    //   30953: athrow
    //   30954: aconst_null
    //   30955: athrow
    //   30956: aconst_null
    //   30957: athrow
    //   30958: aconst_null
    //   30959: athrow
    //   30960: aconst_null
    //   30961: athrow
    //   30962: aconst_null
    //   30963: athrow
    //   30964: aconst_null
    //   30965: athrow
    //   30966: aconst_null
    //   30967: athrow
    //   30968: aconst_null
    //   30969: athrow
    //   30970: aconst_null
    //   30971: athrow
    //   30972: aconst_null
    //   30973: athrow
    //   30974: aconst_null
    //   30975: athrow
    //   30976: aconst_null
    //   30977: athrow
    //   30978: aconst_null
    //   30979: athrow
    //   30980: aconst_null
    //   30981: athrow
    //   30982: aconst_null
    //   30983: athrow
    //   30984: aconst_null
    //   30985: athrow
    //   30986: aconst_null
    //   30987: athrow
    //   30988: aconst_null
    //   30989: athrow
    //   30990: aconst_null
    //   30991: athrow
    //   30992: aconst_null
    //   30993: athrow
    //   30994: aconst_null
    //   30995: athrow
    //   30996: aconst_null
    //   30997: athrow
    //   30998: aconst_null
    //   30999: athrow
    //   31000: aconst_null
    //   31001: athrow
    //   31002: aconst_null
    //   31003: athrow
    //   31004: aconst_null
    //   31005: athrow
    //   31006: aconst_null
    //   31007: athrow
    //   31008: aconst_null
    //   31009: athrow
    //   31010: aconst_null
    //   31011: athrow
    //   31012: aconst_null
    //   31013: athrow
    //   31014: aconst_null
    //   31015: athrow
    //   31016: aconst_null
    //   31017: athrow
    //   31018: aconst_null
    //   31019: athrow
    //   31020: aconst_null
    //   31021: athrow
    //   31022: aconst_null
    //   31023: athrow
    //   31024: aconst_null
    //   31025: athrow
    //   31026: aconst_null
    //   31027: athrow
    //   31028: aconst_null
    //   31029: athrow
    //   31030: aconst_null
    //   31031: athrow
    //   31032: aconst_null
    //   31033: athrow
    //   31034: aconst_null
    //   31035: athrow
    //   31036: aconst_null
    //   31037: athrow
    //   31038: aconst_null
    //   31039: athrow
    //   31040: aconst_null
    //   31041: athrow
    //   31042: aconst_null
    //   31043: athrow
    //   31044: aconst_null
    //   31045: athrow
    //   31046: aconst_null
    //   31047: athrow
    //   31048: aconst_null
    //   31049: athrow
    //   31050: aconst_null
    //   31051: athrow
    //   31052: aconst_null
    //   31053: athrow
    //   31054: aconst_null
    //   31055: athrow
    //   31056: aconst_null
    //   31057: athrow
    //   31058: aconst_null
    //   31059: athrow
    //   31060: aconst_null
    //   31061: athrow
    //   31062: aconst_null
    //   31063: athrow
    //   31064: aconst_null
    //   31065: athrow
    //   31066: aconst_null
    //   31067: athrow
    //   31068: aconst_null
    //   31069: athrow
    //   31070: aconst_null
    //   31071: athrow
    //   31072: aconst_null
    //   31073: athrow
    //   31074: aconst_null
    //   31075: athrow
    //   31076: aconst_null
    //   31077: athrow
    //   31078: aconst_null
    //   31079: athrow
    //   31080: aconst_null
    //   31081: athrow
    //   31082: aconst_null
    //   31083: athrow
    //   31084: aconst_null
    //   31085: athrow
    //   31086: aconst_null
    //   31087: athrow
    //   31088: aconst_null
    //   31089: athrow
    //   31090: aconst_null
    //   31091: athrow
    //   31092: aconst_null
    //   31093: athrow
    //   31094: aconst_null
    //   31095: athrow
    //   31096: aconst_null
    //   31097: athrow
    //   31098: aconst_null
    //   31099: athrow
    //   31100: aconst_null
    //   31101: athrow
    //   31102: aconst_null
    //   31103: athrow
    //   31104: aconst_null
    //   31105: athrow
    //   31106: aconst_null
    //   31107: athrow
    //   31108: aconst_null
    //   31109: athrow
    //   31110: aconst_null
    //   31111: athrow
    //   31112: aconst_null
    //   31113: athrow
    //   31114: aconst_null
    //   31115: athrow
    //   31116: aconst_null
    //   31117: athrow
    //   31118: aconst_null
    //   31119: athrow
    //   31120: aconst_null
    //   31121: athrow
    //   31122: aconst_null
    //   31123: athrow
    //   31124: aconst_null
    //   31125: athrow
    //   31126: aconst_null
    //   31127: athrow
    //   31128: aconst_null
    //   31129: athrow
    //   31130: aconst_null
    //   31131: athrow
    //   31132: aconst_null
    //   31133: athrow
    //   31134: aconst_null
    //   31135: athrow
    //   31136: aconst_null
    //   31137: athrow
    //   31138: aconst_null
    //   31139: athrow
    //   31140: aconst_null
    //   31141: athrow
    //   31142: aconst_null
    //   31143: athrow
    //   31144: aconst_null
    //   31145: athrow
    //   31146: aconst_null
    //   31147: athrow
    //   31148: aconst_null
    //   31149: athrow
    //   31150: aconst_null
    //   31151: athrow
    //   31152: aconst_null
    //   31153: athrow
    //   31154: aconst_null
    //   31155: athrow
    //   31156: aconst_null
    //   31157: athrow
    //   31158: aconst_null
    //   31159: athrow
    //   31160: aconst_null
    //   31161: athrow
    //   31162: aconst_null
    //   31163: athrow
    //   31164: aconst_null
    //   31165: athrow
    //   31166: aconst_null
    //   31167: athrow
    //   31168: aconst_null
    //   31169: athrow
    //   31170: aconst_null
    //   31171: athrow
    //   31172: aconst_null
    //   31173: athrow
    //   31174: aconst_null
    //   31175: athrow
    //   31176: aconst_null
    //   31177: athrow
    //   31178: aconst_null
    //   31179: athrow
    //   31180: aconst_null
    //   31181: athrow
    //   31182: aconst_null
    //   31183: athrow
    //   31184: aconst_null
    //   31185: athrow
    //   31186: aconst_null
    //   31187: athrow
    //   31188: aconst_null
    //   31189: athrow
    //   31190: aconst_null
    //   31191: athrow
    //   31192: aconst_null
    //   31193: athrow
    //   31194: aconst_null
    //   31195: athrow
    //   31196: aconst_null
    //   31197: athrow
    //   31198: aconst_null
    //   31199: athrow
    //   31200: aconst_null
    //   31201: athrow
    //   31202: aconst_null
    //   31203: athrow
    //   31204: aconst_null
    //   31205: athrow
    //   31206: aconst_null
    //   31207: athrow
    //   31208: aconst_null
    //   31209: athrow
    //   31210: aconst_null
    //   31211: athrow
    //   31212: aconst_null
    //   31213: athrow
    //   31214: aconst_null
    //   31215: athrow
    //   31216: aconst_null
    //   31217: athrow
    //   31218: aconst_null
    //   31219: athrow
    //   31220: aconst_null
    //   31221: athrow
    //   31222: aconst_null
    //   31223: athrow
    //   31224: aconst_null
    //   31225: athrow
    //   31226: aconst_null
    //   31227: athrow
    //   31228: aconst_null
    //   31229: athrow
    //   31230: aconst_null
    //   31231: athrow
    //   31232: aconst_null
    //   31233: athrow
    //   31234: aconst_null
    //   31235: athrow
    //   31236: aconst_null
    //   31237: athrow
    //   31238: aconst_null
    //   31239: athrow
    //   31240: aconst_null
    //   31241: athrow
    //   31242: aconst_null
    //   31243: athrow
    //   31244: aconst_null
    //   31245: athrow
    //   31246: aconst_null
    //   31247: athrow
    //   31248: aconst_null
    //   31249: athrow
    //   31250: aconst_null
    //   31251: athrow
    //   31252: aconst_null
    //   31253: athrow
    //   31254: aconst_null
    //   31255: athrow
    //   31256: aconst_null
    //   31257: athrow
    //   31258: aconst_null
    //   31259: athrow
    //   31260: aconst_null
    //   31261: athrow
    //   31262: aconst_null
    //   31263: athrow
    //   31264: aconst_null
    //   31265: athrow
    //   31266: aconst_null
    //   31267: athrow
    //   31268: aconst_null
    //   31269: athrow
    //   31270: aconst_null
    //   31271: athrow
    //   31272: aconst_null
    //   31273: athrow
    //   31274: aconst_null
    //   31275: athrow
    //   31276: aconst_null
    //   31277: athrow
    //   31278: aconst_null
    //   31279: athrow
    //   31280: aconst_null
    //   31281: athrow
    //   31282: aconst_null
    //   31283: athrow
    //   31284: aconst_null
    //   31285: athrow
    //   31286: aconst_null
    //   31287: athrow
    //   31288: aconst_null
    //   31289: athrow
    //   31290: aconst_null
    //   31291: athrow
    //   31292: aconst_null
    //   31293: athrow
    //   31294: aconst_null
    //   31295: athrow
    //   31296: aconst_null
    //   31297: athrow
    //   31298: aconst_null
    //   31299: athrow
    //   31300: aconst_null
    //   31301: athrow
    //   31302: aconst_null
    //   31303: athrow
    //   31304: aconst_null
    //   31305: athrow
    //   31306: aconst_null
    //   31307: athrow
    //   31308: aconst_null
    //   31309: athrow
    //   31310: aconst_null
    //   31311: athrow
    //   31312: aconst_null
    //   31313: athrow
    //   31314: aconst_null
    //   31315: athrow
    //   31316: aconst_null
    //   31317: athrow
    //   31318: aconst_null
    //   31319: athrow
    //   31320: aconst_null
    //   31321: athrow
    //   31322: aconst_null
    //   31323: athrow
    //   31324: aconst_null
    //   31325: athrow
    //   31326: aconst_null
    //   31327: athrow
    //   31328: aconst_null
    //   31329: athrow
    //   31330: aconst_null
    //   31331: athrow
    //   31332: aconst_null
    //   31333: athrow
    //   31334: aconst_null
    //   31335: athrow
    //   31336: aconst_null
    //   31337: athrow
    //   31338: aconst_null
    //   31339: athrow
    //   31340: aconst_null
    //   31341: athrow
    //   31342: aconst_null
    //   31343: athrow
    //   31344: aconst_null
    //   31345: athrow
    //   31346: aconst_null
    //   31347: athrow
    //   31348: aconst_null
    //   31349: athrow
    //   31350: aconst_null
    //   31351: athrow
    //   31352: aconst_null
    //   31353: athrow
    //   31354: aconst_null
    //   31355: athrow
    //   31356: aconst_null
    //   31357: athrow
    //   31358: aconst_null
    //   31359: athrow
    //   31360: aconst_null
    //   31361: athrow
    //   31362: aconst_null
    //   31363: athrow
    //   31364: aconst_null
    //   31365: athrow
    //   31366: aconst_null
    //   31367: athrow
    //   31368: aconst_null
    //   31369: athrow
    //   31370: aconst_null
    //   31371: athrow
    //   31372: aconst_null
    //   31373: athrow
    //   31374: aconst_null
    //   31375: athrow
    //   31376: aconst_null
    //   31377: athrow
    //   31378: aconst_null
    //   31379: athrow
    //   31380: aconst_null
    //   31381: athrow
    //   31382: aconst_null
    //   31383: athrow
    //   31384: aconst_null
    //   31385: athrow
    //   31386: aconst_null
    //   31387: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	30464	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 7907
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 7899
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 7891
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -217615807
    //   33: l2i
    //   34: ldc_w -386702636
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1725850600
    //   44: l2i
    //   45: ldc_w -1465322310
    //   48: ixor
    //   49: ldc2_w -1163862854
    //   52: l2i
    //   53: ldc_w -2028095072
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 455146569 -> 41, 642348431 -> 7876
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -2045818290
    //   94: l2i
    //   95: ldc_w -709473467
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1651703562
    //   105: l2i
    //   106: ldc_w -1979837654
    //   109: ixor
    //   110: ldc2_w 1345982363
    //   113: l2i
    //   114: ldc_w -747403120
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -789543424 -> 7682, -230413875 -> 102
    //   144: getfield renderBlock : Lnet/minecraft/util/math/BlockPos;
    //   147: ifnonnull -> 161
    //   150: ldc2_w 1337032453
    //   153: l2i
    //   154: ldc_w 2030504222
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w -410598464
    //   164: l2i
    //   165: ldc_w -785336860
    //   168: ixor
    //   169: ldc2_w 28209128
    //   172: l2i
    //   173: ldc_w 1452362668
    //   176: ixor
    //   177: ixor
    //   178: tableswitch default -> 150, 1636389471 -> 200, 1636389472 -> 201
    //   200: return
    //   201: ldc2_w -1333404960
    //   204: l2i
    //   205: ldc_w -1333404960
    //   208: ixor
    //   209: getstatic Perryc.0 : I
    //   212: ifle -> 226
    //   215: ldc2_w 1305679636
    //   218: l2i
    //   219: ldc_w 67001924
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 1974823761
    //   229: l2i
    //   230: ldc_w 731768947
    //   233: ixor
    //   234: ldc2_w 287081711
    //   237: l2i
    //   238: ldc_w -173711109
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -1433096892 -> 7802, 1456364353 -> 226
    //   268: istore_2
    //   269: ldc2_w 1163160650
    //   272: l2i
    //   273: ldc_w 1163160650
    //   276: ixor
    //   277: getstatic Perryc.c : I
    //   280: iflt -> 294
    //   283: ldc2_w 1457598095
    //   286: l2i
    //   287: ldc_w -526215013
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w 665414207
    //   297: l2i
    //   298: ldc_w 1582166745
    //   301: ixor
    //   302: ldc2_w 952583076
    //   305: l2i
    //   306: ldc_w 1655583917
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 336, -2014461172 -> 294, -332742371 -> 7844
    //   336: istore_3
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w 929109212
    //   346: l2i
    //   347: ldc_w -728301644
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -145544740
    //   357: l2i
    //   358: ldc_w 553330640
    //   361: ixor
    //   362: ldc2_w -657611857
    //   365: l2i
    //   366: ldc_w -1011362419
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 396, -124936886 -> 7856, 2140733877 -> 354
    //   396: aload_0
    //   397: getstatic Perryc.c : I
    //   400: iflt -> 414
    //   403: ldc2_w 1510601918
    //   406: l2i
    //   407: ldc_w 885360829
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w -992125650
    //   417: l2i
    //   418: ldc_w -782927769
    //   421: ixor
    //   422: ldc2_w -824039217
    //   425: l2i
    //   426: ldc_w -2126527382
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 7716, 554799270 -> 414, 1515571692 -> 456
    //   456: getfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   459: getstatic Perryc.0 : I
    //   462: ifle -> 476
    //   465: ldc2_w -1868426703
    //   468: l2i
    //   469: ldc_w 51724302
    //   472: ixor
    //   473: goto -> 484
    //   476: ldc2_w -963581332
    //   479: l2i
    //   480: ldc_w 1343243095
    //   483: ixor
    //   484: ldc2_w -1859869477
    //   487: l2i
    //   488: ldc_w -1296074730
    //   491: ixor
    //   492: ixor
    //   493: lookupswitch default -> 7754, -1339257102 -> 476, -1256491530 -> 520
    //   520: goto -> 524
    //   523: athrow
    //   524: invokevirtual getValue : ()Ljava/lang/Object;
    //   527: goto -> 531
    //   530: athrow
    //   531: checkcast java/lang/Boolean
    //   534: getstatic Perryc.c : I
    //   537: iflt -> 551
    //   540: ldc2_w -2008609025
    //   543: l2i
    //   544: ldc_w 1429091898
    //   547: ixor
    //   548: goto -> 559
    //   551: ldc2_w 595493661
    //   554: l2i
    //   555: ldc_w 734696267
    //   558: ixor
    //   559: ldc2_w -1065388932
    //   562: l2i
    //   563: ldc_w 496169148
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -1367548350 -> 551, 8698885 -> 7686
    //   596: goto -> 600
    //   599: athrow
    //   600: invokevirtual booleanValue : ()Z
    //   603: goto -> 607
    //   606: athrow
    //   607: ifeq -> 621
    //   610: ldc2_w -1506211513
    //   613: l2i
    //   614: ldc_w 1423252217
    //   617: ixor
    //   618: goto -> 629
    //   621: ldc2_w -982169660
    //   624: l2i
    //   625: ldc_w 932795515
    //   628: ixor
    //   629: ldc2_w 1913845735
    //   632: l2i
    //   633: ldc_w 818045553
    //   636: ixor
    //   637: ixor
    //   638: tableswitch default -> 610, -1338210776 -> 660, -1338210775 -> 5919
    //   660: getstatic Perryc.c : I
    //   663: iflt -> 677
    //   666: ldc2_w -357959320
    //   669: l2i
    //   670: ldc_w -1656909159
    //   673: ixor
    //   674: goto -> 685
    //   677: ldc2_w -1218411223
    //   680: l2i
    //   681: ldc_w 155700409
    //   684: ixor
    //   685: ldc2_w -19768892
    //   688: l2i
    //   689: ldc_w -1190130546
    //   692: ixor
    //   693: ixor
    //   694: lookupswitch default -> 720, 810958523 -> 7674, 1728602706 -> 677
    //   720: aload_0
    //   721: getstatic Perryc.0 : I
    //   724: ifle -> 738
    //   727: ldc2_w 1359316214
    //   730: l2i
    //   731: ldc_w 572079844
    //   734: ixor
    //   735: goto -> 746
    //   738: ldc2_w -1920751550
    //   741: l2i
    //   742: ldc_w 1761771793
    //   745: ixor
    //   746: ldc2_w -416669810
    //   749: l2i
    //   750: ldc_w 2119103915
    //   753: ixor
    //   754: ixor
    //   755: lookupswitch default -> 780, -361213897 -> 7862, 937549713 -> 738
    //   780: getfield renderBlock : Lnet/minecraft/util/math/BlockPos;
    //   783: getstatic Perryc.c : I
    //   786: iflt -> 800
    //   789: ldc2_w -1766349540
    //   792: l2i
    //   793: ldc_w 589346357
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w -451559454
    //   803: l2i
    //   804: ldc_w -2120102392
    //   807: ixor
    //   808: ldc2_w -1245176720
    //   811: l2i
    //   812: ldc_w 984737238
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 7814, -338851764 -> 844, 988736143 -> 800
    //   844: aload_0
    //   845: getstatic Perryc.c : I
    //   848: iflt -> 862
    //   851: ldc2_w 2003730524
    //   854: l2i
    //   855: ldc_w -1253191056
    //   858: ixor
    //   859: goto -> 870
    //   862: ldc2_w 1720115878
    //   865: l2i
    //   866: ldc_w -1158508298
    //   869: ixor
    //   870: ldc2_w 1256101574
    //   873: l2i
    //   874: ldc_w 322207585
    //   877: ixor
    //   878: ixor
    //   879: lookupswitch default -> 904, -1681278069 -> 7700, -946378474 -> 862
    //   904: getfield Rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   907: getstatic Perryc.1 : I
    //   910: ifeq -> 924
    //   913: ldc2_w 248532418
    //   916: l2i
    //   917: ldc_w 2009045780
    //   920: ixor
    //   921: goto -> 932
    //   924: ldc2_w 250577301
    //   927: l2i
    //   928: ldc_w -513362
    //   931: ixor
    //   932: ldc2_w -1372167232
    //   935: l2i
    //   936: ldc_w -1160461513
    //   939: ixor
    //   940: ixor
    //   941: lookupswitch default -> 7732, -436925492 -> 968, 1837987361 -> 924
    //   968: goto -> 972
    //   971: athrow
    //   972: invokevirtual getValue : ()Ljava/lang/Object;
    //   975: goto -> 979
    //   978: athrow
    //   979: checkcast java/lang/Boolean
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w 1272880552
    //   991: l2i
    //   992: ldc_w -1398292013
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w -708338041
    //   1002: l2i
    //   1003: ldc_w -1136048218
    //   1006: ixor
    //   1007: ldc2_w -1307240503
    //   1010: l2i
    //   1011: sipush #24503
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 7820, -610561697 -> 1044, 1433146373 -> 999
    //   1044: goto -> 1048
    //   1047: athrow
    //   1048: invokevirtual booleanValue : ()Z
    //   1051: goto -> 1055
    //   1054: athrow
    //   1055: ifeq -> 1069
    //   1058: ldc2_w -995181121
    //   1061: l2i
    //   1062: ldc_w 909963288
    //   1065: ixor
    //   1066: goto -> 1077
    //   1069: ldc2_w -739463083
    //   1072: l2i
    //   1073: ldc_w 561970675
    //   1076: ixor
    //   1077: ldc2_w -1476593792
    //   1080: l2i
    //   1081: ldc_w -2010068439
    //   1084: ixor
    //   1085: ixor
    //   1086: tableswitch default -> 1058, -581013490 -> 1108, -581013489 -> 1466
    //   1108: getstatic Perryc.0 : I
    //   1111: ifle -> 1125
    //   1114: ldc2_w 1837076571
    //   1117: l2i
    //   1118: ldc_w 1558385973
    //   1121: ixor
    //   1122: goto -> 1133
    //   1125: ldc2_w -1979469573
    //   1128: l2i
    //   1129: ldc_w -1553598730
    //   1132: ixor
    //   1133: ldc2_w 402759288
    //   1136: l2i
    //   1137: ldc_w -329346422
    //   1140: ixor
    //   1141: ixor
    //   1142: lookupswitch default -> 1168, -977040996 -> 7778, 1022549082 -> 1125
    //   1168: goto -> 1172
    //   1171: athrow
    //   1172: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   1175: goto -> 1179
    //   1178: athrow
    //   1179: getstatic Perryc.0 : I
    //   1182: ifle -> 1196
    //   1185: ldc2_w -486580460
    //   1188: l2i
    //   1189: ldc_w -532025246
    //   1192: ixor
    //   1193: goto -> 1204
    //   1196: ldc2_w -1867159280
    //   1199: l2i
    //   1200: ldc_w -1007642037
    //   1203: ixor
    //   1204: ldc2_w 400258321
    //   1207: l2i
    //   1208: ldc_w -936200180
    //   1211: ixor
    //   1212: ixor
    //   1213: lookupswitch default -> 1240, -815016335 -> 1196, -580951445 -> 7706
    //   1240: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1243: getstatic Perryc.1 : I
    //   1246: ifeq -> 1260
    //   1249: ldc2_w -898354529
    //   1252: l2i
    //   1253: ldc_w -382731559
    //   1256: ixor
    //   1257: goto -> 1268
    //   1260: ldc2_w 719489777
    //   1263: l2i
    //   1264: ldc_w 1948740488
    //   1267: ixor
    //   1268: ldc2_w -1375121756
    //   1271: l2i
    //   1272: ldc_w 1257918912
    //   1275: ixor
    //   1276: ixor
    //   1277: lookupswitch default -> 7742, -1170801123 -> 1304, -945236190 -> 1260
    //   1304: goto -> 1308
    //   1307: athrow
    //   1308: invokevirtual getValue : ()Ljava/lang/Object;
    //   1311: goto -> 1315
    //   1314: athrow
    //   1315: checkcast java/lang/Integer
    //   1318: getstatic Perryc.c : I
    //   1321: iflt -> 1335
    //   1324: ldc2_w 410024213
    //   1327: l2i
    //   1328: ldc_w -928625688
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w 166079787
    //   1338: l2i
    //   1339: ldc_w -596289125
    //   1342: ixor
    //   1343: ldc2_w -252747185
    //   1346: l2i
    //   1347: ldc_w -535525714
    //   1350: ixor
    //   1351: ixor
    //   1352: lookupswitch default -> 1380, -1538648616 -> 1335, -1070737892 -> 7702
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokevirtual intValue : ()I
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: getstatic Perryc.c : I
    //   1394: iflt -> 1408
    //   1397: ldc2_w -614166906
    //   1400: l2i
    //   1401: ldc_w 335549818
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w 977302009
    //   1411: l2i
    //   1412: ldc_w 1897422509
    //   1415: ixor
    //   1416: ldc2_w 1247810235
    //   1419: l2i
    //   1420: ldc_w -1679509782
    //   1423: ixor
    //   1424: ixor
    //   1425: lookupswitch default -> 1452, -1404483866 -> 1408, 518012845 -> 7850
    //   1452: goto -> 1456
    //   1455: athrow
    //   1456: invokestatic rainbow : (I)Ljava/awt/Color;
    //   1459: goto -> 1463
    //   1462: athrow
    //   1463: goto -> 2631
    //   1466: new java/awt/Color
    //   1469: dup
    //   1470: getstatic Perryc.0 : I
    //   1473: ifle -> 1487
    //   1476: ldc2_w -1245911638
    //   1479: l2i
    //   1480: ldc_w 851422819
    //   1483: ixor
    //   1484: goto -> 1495
    //   1487: ldc2_w -1358564429
    //   1490: l2i
    //   1491: ldc_w 324377282
    //   1494: ixor
    //   1495: ldc2_w -460562913
    //   1498: l2i
    //   1499: ldc_w -1170588643
    //   1502: ixor
    //   1503: ixor
    //   1504: lookupswitch default -> 1532, -642438709 -> 7846, 684857856 -> 1487
    //   1532: aload_0
    //   1533: getstatic Perryc.0 : I
    //   1536: ifle -> 1550
    //   1539: ldc2_w 397607331
    //   1542: l2i
    //   1543: ldc_w -124278331
    //   1546: ixor
    //   1547: goto -> 1558
    //   1550: ldc2_w 701396264
    //   1553: l2i
    //   1554: ldc_w 247010547
    //   1557: ixor
    //   1558: ldc2_w 1180224516
    //   1561: l2i
    //   1562: ldc_w 863538912
    //   1565: ixor
    //   1566: ixor
    //   1567: lookupswitch default -> 7816, -1710953854 -> 1550, 1381442367 -> 1592
    //   1592: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1595: getstatic Perryc.c : I
    //   1598: iflt -> 1612
    //   1601: ldc2_w -197537546
    //   1604: l2i
    //   1605: ldc_w 2146047696
    //   1608: ixor
    //   1609: goto -> 1620
    //   1612: ldc2_w 1837824028
    //   1615: l2i
    //   1616: ldc_w 1181242847
    //   1619: ixor
    //   1620: ldc2_w 1077076252
    //   1623: l2i
    //   1624: ldc_w -1552592685
    //   1627: ixor
    //   1628: ixor
    //   1629: lookupswitch default -> 1656, 673224966 -> 1612, 1754560489 -> 7670
    //   1656: goto -> 1660
    //   1659: athrow
    //   1660: invokevirtual getValue : ()Ljava/lang/Object;
    //   1663: goto -> 1667
    //   1666: athrow
    //   1667: checkcast java/lang/Integer
    //   1670: getstatic Perryc.c : I
    //   1673: iflt -> 1687
    //   1676: ldc2_w 991916118
    //   1679: l2i
    //   1680: ldc_w 203884388
    //   1683: ixor
    //   1684: goto -> 1695
    //   1687: ldc2_w -667350107
    //   1690: l2i
    //   1691: ldc_w -2061097070
    //   1694: ixor
    //   1695: ldc2_w 86913482
    //   1698: l2i
    //   1699: ldc_w 1648518250
    //   1702: ixor
    //   1703: ixor
    //   1704: lookupswitch default -> 7678, 980646295 -> 1732, 1347691154 -> 1687
    //   1732: goto -> 1736
    //   1735: athrow
    //   1736: invokevirtual intValue : ()I
    //   1739: goto -> 1743
    //   1742: athrow
    //   1743: getstatic Perryc.c : I
    //   1746: iflt -> 1760
    //   1749: ldc2_w -527408921
    //   1752: l2i
    //   1753: ldc_w 253308934
    //   1756: ixor
    //   1757: goto -> 1768
    //   1760: ldc2_w 501230956
    //   1763: l2i
    //   1764: ldc_w 1764088320
    //   1767: ixor
    //   1768: ldc2_w 641392442
    //   1771: l2i
    //   1772: ldc_w 1522325439
    //   1775: ixor
    //   1776: ixor
    //   1777: lookupswitch default -> 1804, -1827710876 -> 7750, -102081093 -> 1760
    //   1804: aload_0
    //   1805: getstatic Perryc.1 : I
    //   1808: ifeq -> 1822
    //   1811: ldc2_w 1500588376
    //   1814: l2i
    //   1815: ldc_w 372301912
    //   1818: ixor
    //   1819: goto -> 1830
    //   1822: ldc2_w -1253871220
    //   1825: l2i
    //   1826: ldc_w 770012792
    //   1829: ixor
    //   1830: ldc2_w 450387346
    //   1833: l2i
    //   1834: ldc_w -1209104958
    //   1837: ixor
    //   1838: ixor
    //   1839: lookupswitch default -> 1864, -495513264 -> 7738, -60139360 -> 1822
    //   1864: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1867: getstatic Perryc.1 : I
    //   1870: ifeq -> 1884
    //   1873: ldc2_w 425599941
    //   1876: l2i
    //   1877: ldc_w 763883237
    //   1880: ixor
    //   1881: goto -> 1892
    //   1884: ldc2_w 174237111
    //   1887: l2i
    //   1888: ldc_w 944044175
    //   1891: ixor
    //   1892: ldc2_w -1655615967
    //   1895: l2i
    //   1896: ldc_w -420795798
    //   1899: ixor
    //   1900: ixor
    //   1901: lookupswitch default -> 7690, 1234975091 -> 1928, 1331931499 -> 1884
    //   1928: goto -> 1932
    //   1931: athrow
    //   1932: invokevirtual getValue : ()Ljava/lang/Object;
    //   1935: goto -> 1939
    //   1938: athrow
    //   1939: checkcast java/lang/Integer
    //   1942: getstatic Perryc.1 : I
    //   1945: ifeq -> 1959
    //   1948: ldc2_w -1797212284
    //   1951: l2i
    //   1952: ldc_w -929786821
    //   1955: ixor
    //   1956: goto -> 1967
    //   1959: ldc2_w -467196034
    //   1962: l2i
    //   1963: ldc_w 359270145
    //   1966: ixor
    //   1967: ldc2_w 234962494
    //   1970: l2i
    //   1971: ldc_w 1509103012
    //   1974: ixor
    //   1975: ixor
    //   1976: lookupswitch default -> 7704, -1497429019 -> 2004, 193333285 -> 1959
    //   2004: goto -> 2008
    //   2007: athrow
    //   2008: invokevirtual intValue : ()I
    //   2011: goto -> 2015
    //   2014: athrow
    //   2015: getstatic Perryc.0 : I
    //   2018: ifle -> 2032
    //   2021: ldc2_w 607233931
    //   2024: l2i
    //   2025: ldc_w 880784922
    //   2028: ixor
    //   2029: goto -> 2040
    //   2032: ldc2_w 1704031579
    //   2035: l2i
    //   2036: ldc_w -223940222
    //   2039: ixor
    //   2040: ldc2_w 2090090049
    //   2043: l2i
    //   2044: ldc_w -194828693
    //   2047: ixor
    //   2048: ixor
    //   2049: lookupswitch default -> 2076, -1732703813 -> 7836, -616597853 -> 2032
    //   2076: aload_0
    //   2077: getstatic Perryc.c : I
    //   2080: iflt -> 2094
    //   2083: ldc2_w 2095324036
    //   2086: l2i
    //   2087: ldc_w 1192293296
    //   2090: ixor
    //   2091: goto -> 2102
    //   2094: ldc2_w 460545518
    //   2097: l2i
    //   2098: ldc_w -1694873616
    //   2101: ixor
    //   2102: ldc2_w 2062785158
    //   2105: l2i
    //   2106: ldc_w 111538424
    //   2109: ixor
    //   2110: ixor
    //   2111: lookupswitch default -> 7832, -35688352 -> 2136, 1201832522 -> 2094
    //   2136: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2139: getstatic Perryc.0 : I
    //   2142: ifle -> 2156
    //   2145: ldc2_w 447778112
    //   2148: l2i
    //   2149: ldc_w 1541894295
    //   2152: ixor
    //   2153: goto -> 2164
    //   2156: ldc2_w 1598062732
    //   2159: l2i
    //   2160: ldc_w 162345513
    //   2163: ixor
    //   2164: ldc2_w 780342441
    //   2167: l2i
    //   2168: ldc_w -968735269
    //   2171: ixor
    //   2172: ixor
    //   2173: lookupswitch default -> 7786, -1449743195 -> 2156, -1104354345 -> 2200
    //   2200: goto -> 2204
    //   2203: athrow
    //   2204: invokevirtual getValue : ()Ljava/lang/Object;
    //   2207: goto -> 2211
    //   2210: athrow
    //   2211: checkcast java/lang/Integer
    //   2214: getstatic Perryc.1 : I
    //   2217: ifeq -> 2231
    //   2220: ldc2_w -2026621383
    //   2223: l2i
    //   2224: ldc_w -43337658
    //   2227: ixor
    //   2228: goto -> 2239
    //   2231: ldc2_w -914135283
    //   2234: l2i
    //   2235: ldc_w 1556797301
    //   2238: ixor
    //   2239: ldc2_w -618053716
    //   2242: l2i
    //   2243: ldc_w -1757438163
    //   2246: ixor
    //   2247: ixor
    //   2248: lookupswitch default -> 2276, -518033917 -> 2231, 910700286 -> 7880
    //   2276: goto -> 2280
    //   2279: athrow
    //   2280: invokevirtual intValue : ()I
    //   2283: goto -> 2287
    //   2286: athrow
    //   2287: getstatic Perryc.c : I
    //   2290: iflt -> 2304
    //   2293: ldc2_w -1072544563
    //   2296: l2i
    //   2297: ldc_w 1013975308
    //   2300: ixor
    //   2301: goto -> 2312
    //   2304: ldc2_w 1407692604
    //   2307: l2i
    //   2308: ldc_w 1399957499
    //   2311: ixor
    //   2312: ldc2_w 991520884
    //   2315: l2i
    //   2316: ldc_w 954562496
    //   2319: ixor
    //   2320: ixor
    //   2321: lookupswitch default -> 2348, -6401419 -> 7868, 813541021 -> 2304
    //   2348: aload_0
    //   2349: getstatic Perryc.c : I
    //   2352: iflt -> 2366
    //   2355: ldc2_w -896908689
    //   2358: l2i
    //   2359: ldc_w -914926927
    //   2362: ixor
    //   2363: goto -> 2374
    //   2366: ldc2_w 383087380
    //   2369: l2i
    //   2370: ldc_w 2140833067
    //   2373: ixor
    //   2374: ldc2_w -1564621076
    //   2377: l2i
    //   2378: ldc_w 1030114833
    //   2381: ixor
    //   2382: ixor
    //   2383: lookupswitch default -> 7872, -1675192285 -> 2366, -158040382 -> 2408
    //   2408: getfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2411: getstatic Perryc.1 : I
    //   2414: ifeq -> 2428
    //   2417: ldc2_w -1816541085
    //   2420: l2i
    //   2421: ldc_w 1849478333
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w -472258761
    //   2431: l2i
    //   2432: ldc_w -2002187729
    //   2435: ixor
    //   2436: ldc2_w -398401244
    //   2439: l2i
    //   2440: ldc_w -2108129274
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 7782, -1751292420 -> 2428, 23628858 -> 2472
    //   2472: goto -> 2476
    //   2475: athrow
    //   2476: invokevirtual getValue : ()Ljava/lang/Object;
    //   2479: goto -> 2483
    //   2482: athrow
    //   2483: checkcast java/lang/Integer
    //   2486: getstatic Perryc.c : I
    //   2489: iflt -> 2503
    //   2492: ldc2_w 1344917526
    //   2495: l2i
    //   2496: ldc_w 1928425184
    //   2499: ixor
    //   2500: goto -> 2511
    //   2503: ldc2_w -610047816
    //   2506: l2i
    //   2507: ldc_w 923676888
    //   2510: ixor
    //   2511: ldc2_w 1819530730
    //   2514: l2i
    //   2515: ldc_w -793622988
    //   2518: ixor
    //   2519: ixor
    //   2520: lookupswitch default -> 7808, -1642517208 -> 2503, 1349307326 -> 2548
    //   2548: goto -> 2552
    //   2551: athrow
    //   2552: invokevirtual intValue : ()I
    //   2555: goto -> 2559
    //   2558: athrow
    //   2559: getstatic Perryc.0 : I
    //   2562: ifle -> 2576
    //   2565: ldc2_w -1204679324
    //   2568: l2i
    //   2569: ldc_w -1393920523
    //   2572: ixor
    //   2573: goto -> 2584
    //   2576: ldc2_w 835892181
    //   2579: l2i
    //   2580: ldc_w 560465457
    //   2583: ixor
    //   2584: ldc2_w -1676570932
    //   2587: l2i
    //   2588: ldc_w 416818214
    //   2591: ixor
    //   2592: ixor
    //   2593: lookupswitch default -> 7740, -1877880197 -> 2576, -1804394738 -> 2620
    //   2620: goto -> 2624
    //   2623: athrow
    //   2624: invokespecial <init> : (IIII)V
    //   2627: goto -> 2631
    //   2630: athrow
    //   2631: getstatic Perryc.1 : I
    //   2634: ifeq -> 2648
    //   2637: ldc2_w -1696049520
    //   2640: l2i
    //   2641: ldc_w 666211502
    //   2644: ixor
    //   2645: goto -> 2656
    //   2648: ldc2_w -1534109519
    //   2651: l2i
    //   2652: ldc_w -570990555
    //   2655: ixor
    //   2656: ldc2_w -476160106
    //   2659: l2i
    //   2660: ldc_w 752447034
    //   2663: ixor
    //   2664: ixor
    //   2665: lookupswitch default -> 7810, -1237382856 -> 2692, 1914368914 -> 2648
    //   2692: aload_0
    //   2693: getstatic Perryc.1 : I
    //   2696: ifeq -> 2710
    //   2699: ldc2_w -1257249983
    //   2702: l2i
    //   2703: ldc_w 1882352530
    //   2706: ixor
    //   2707: goto -> 2718
    //   2710: ldc2_w -46106664
    //   2713: l2i
    //   2714: ldc_w 484397287
    //   2717: ixor
    //   2718: ldc2_w -1933121597
    //   2721: l2i
    //   2722: ldc_w 654960705
    //   2725: ixor
    //   2726: ixor
    //   2727: lookupswitch default -> 7768, 1246767293 -> 2752, 1861388113 -> 2710
    //   2752: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2755: getstatic Perryc.1 : I
    //   2758: ifeq -> 2772
    //   2761: ldc2_w 307337086
    //   2764: l2i
    //   2765: ldc_w 1017269433
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w -1621310019
    //   2775: l2i
    //   2776: ldc_w -58350573
    //   2779: ixor
    //   2780: ldc2_w 248670601
    //   2783: l2i
    //   2784: ldc_w -619498864
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 7824, -1239926089 -> 2816, -80576290 -> 2772
    //   2816: goto -> 2820
    //   2819: athrow
    //   2820: invokevirtual getValue : ()Ljava/lang/Object;
    //   2823: goto -> 2827
    //   2826: athrow
    //   2827: checkcast java/lang/Boolean
    //   2830: getstatic Perryc.0 : I
    //   2833: ifle -> 2847
    //   2836: ldc2_w -1546317885
    //   2839: l2i
    //   2840: ldc_w 1207645272
    //   2843: ixor
    //   2844: goto -> 2855
    //   2847: ldc2_w 1486342441
    //   2850: l2i
    //   2851: ldc_w -1743061757
    //   2854: ixor
    //   2855: ldc2_w -1581212076
    //   2858: l2i
    //   2859: ldc_w -991769860
    //   2862: ixor
    //   2863: ixor
    //   2864: lookupswitch default -> 2892, -2129891533 -> 7710, -810794679 -> 2847
    //   2892: goto -> 2896
    //   2895: athrow
    //   2896: invokevirtual booleanValue : ()Z
    //   2899: goto -> 2903
    //   2902: athrow
    //   2903: getstatic Perryc.c : I
    //   2906: iflt -> 2920
    //   2909: ldc2_w -1169118835
    //   2912: l2i
    //   2913: ldc_w -868888635
    //   2916: ixor
    //   2917: goto -> 2928
    //   2920: ldc2_w -1857511229
    //   2923: l2i
    //   2924: ldc_w -822943201
    //   2927: ixor
    //   2928: ldc2_w 1228824351
    //   2931: l2i
    //   2932: ldc_w -1329852965
    //   2935: ixor
    //   2936: ixor
    //   2937: lookupswitch default -> 7828, -1880673140 -> 2920, -1506275304 -> 2964
    //   2964: aload_0
    //   2965: getstatic Perryc.1 : I
    //   2968: ifeq -> 2982
    //   2971: ldc2_w -584313716
    //   2974: l2i
    //   2975: ldc_w -1257836100
    //   2978: ixor
    //   2979: goto -> 2990
    //   2982: ldc2_w -2030715833
    //   2985: l2i
    //   2986: ldc_w 1983608172
    //   2989: ixor
    //   2990: ldc2_w 1152680629
    //   2993: l2i
    //   2994: ldc_w 1525473610
    //   2997: ixor
    //   2998: ixor
    //   2999: lookupswitch default -> 7744, -292115756 -> 3024, 1987217103 -> 2982
    //   3024: getfield cRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3027: getstatic Perryc.0 : I
    //   3030: ifle -> 3044
    //   3033: ldc2_w 555560934
    //   3036: l2i
    //   3037: ldc_w 1170390063
    //   3040: ixor
    //   3041: goto -> 3052
    //   3044: ldc2_w -1932771497
    //   3047: l2i
    //   3048: ldc_w -1578650430
    //   3051: ixor
    //   3052: ldc2_w -1118934913
    //   3055: l2i
    //   3056: ldc_w -455082432
    //   3059: ixor
    //   3060: ixor
    //   3061: lookupswitch default -> 7804, 1028523510 -> 3044, 1958354346 -> 3088
    //   3088: goto -> 3092
    //   3091: athrow
    //   3092: invokevirtual getValue : ()Ljava/lang/Object;
    //   3095: goto -> 3099
    //   3098: athrow
    //   3099: checkcast java/lang/Boolean
    //   3102: getstatic Perryc.1 : I
    //   3105: ifeq -> 3119
    //   3108: ldc2_w -1824463949
    //   3111: l2i
    //   3112: ldc_w 1745509716
    //   3115: ixor
    //   3116: goto -> 3127
    //   3119: ldc2_w -1458925109
    //   3122: l2i
    //   3123: ldc_w -1640025625
    //   3126: ixor
    //   3127: ldc2_w 1704541624
    //   3130: l2i
    //   3131: ldc_w -778464990
    //   3134: ixor
    //   3135: ixor
    //   3136: lookupswitch default -> 7860, -2093675338 -> 3164, 1330254461 -> 3119
    //   3164: goto -> 3168
    //   3167: athrow
    //   3168: invokevirtual booleanValue : ()Z
    //   3171: goto -> 3175
    //   3174: athrow
    //   3175: ifeq -> 3189
    //   3178: ldc2_w 1593643351
    //   3181: l2i
    //   3182: ldc_w 1227953507
    //   3185: ixor
    //   3186: goto -> 3197
    //   3189: ldc2_w 1393174244
    //   3192: l2i
    //   3193: ldc_w 1153835729
    //   3196: ixor
    //   3197: ldc2_w -1875971672
    //   3200: l2i
    //   3201: ldc_w 1650796048
    //   3204: ixor
    //   3205: ixor
    //   3206: tableswitch default -> 3178, -444083316 -> 3228, -444083315 -> 3586
    //   3228: getstatic Perryc.0 : I
    //   3231: ifle -> 3245
    //   3234: ldc2_w -749564779
    //   3237: l2i
    //   3238: ldc_w 73534396
    //   3241: ixor
    //   3242: goto -> 3253
    //   3245: ldc2_w 174815557
    //   3248: l2i
    //   3249: ldc_w 871276242
    //   3252: ixor
    //   3253: ldc2_w -1360370061
    //   3256: l2i
    //   3257: ldc_w 560841689
    //   3260: ixor
    //   3261: ixor
    //   3262: lookupswitch default -> 3288, 654970354 -> 3245, 1488396931 -> 7760
    //   3288: goto -> 3292
    //   3291: athrow
    //   3292: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   3295: goto -> 3299
    //   3298: athrow
    //   3299: getstatic Perryc.c : I
    //   3302: iflt -> 3316
    //   3305: ldc2_w -1446034602
    //   3308: l2i
    //   3309: ldc_w 474007336
    //   3312: ixor
    //   3313: goto -> 3324
    //   3316: ldc2_w 732839517
    //   3319: l2i
    //   3320: ldc_w -162340188
    //   3323: ixor
    //   3324: ldc2_w 277228062
    //   3327: l2i
    //   3328: ldc_w -583900995
    //   3331: ixor
    //   3332: ixor
    //   3333: lookupswitch default -> 3360, 1359991175 -> 3316, 2017185501 -> 7818
    //   3360: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3363: getstatic Perryc.1 : I
    //   3366: ifeq -> 3380
    //   3369: ldc2_w 1484506646
    //   3372: l2i
    //   3373: ldc_w 1952996569
    //   3376: ixor
    //   3377: goto -> 3388
    //   3380: ldc2_w -1422200389
    //   3383: l2i
    //   3384: ldc_w 1548447338
    //   3387: ixor
    //   3388: ldc2_w -1962372208
    //   3391: l2i
    //   3392: ldc_w 1778402550
    //   3395: ixor
    //   3396: ixor
    //   3397: lookupswitch default -> 7698, -853848663 -> 3380, 377047223 -> 3424
    //   3424: goto -> 3428
    //   3427: athrow
    //   3428: invokevirtual getValue : ()Ljava/lang/Object;
    //   3431: goto -> 3435
    //   3434: athrow
    //   3435: checkcast java/lang/Integer
    //   3438: getstatic Perryc.1 : I
    //   3441: ifeq -> 3455
    //   3444: ldc2_w -1080824877
    //   3447: l2i
    //   3448: ldc_w -299481228
    //   3451: ixor
    //   3452: goto -> 3463
    //   3455: ldc2_w 1244213956
    //   3458: l2i
    //   3459: ldc_w -755366848
    //   3462: ixor
    //   3463: ldc2_w -313738394
    //   3466: l2i
    //   3467: ldc_w -1918877040
    //   3470: ixor
    //   3471: ixor
    //   3472: lookupswitch default -> 3500, -1648768086 -> 3455, 827938129 -> 7692
    //   3500: goto -> 3504
    //   3503: athrow
    //   3504: invokevirtual intValue : ()I
    //   3507: goto -> 3511
    //   3510: athrow
    //   3511: getstatic Perryc.c : I
    //   3514: iflt -> 3528
    //   3517: ldc2_w -384099522
    //   3520: l2i
    //   3521: ldc_w 1838628696
    //   3524: ixor
    //   3525: goto -> 3536
    //   3528: ldc2_w 1406468870
    //   3531: l2i
    //   3532: ldc_w -1556982397
    //   3535: ixor
    //   3536: ldc2_w -1851904601
    //   3539: l2i
    //   3540: ldc_w -2095022782
    //   3543: ixor
    //   3544: ixor
    //   3545: lookupswitch default -> 7822, -1775078269 -> 3528, -497482144 -> 3572
    //   3572: goto -> 3576
    //   3575: athrow
    //   3576: invokestatic rainbow : (I)Ljava/awt/Color;
    //   3579: goto -> 3583
    //   3582: athrow
    //   3583: goto -> 4751
    //   3586: new java/awt/Color
    //   3589: dup
    //   3590: getstatic Perryc.1 : I
    //   3593: ifeq -> 3607
    //   3596: ldc2_w 537846094
    //   3599: l2i
    //   3600: ldc_w -2040358380
    //   3603: ixor
    //   3604: goto -> 3615
    //   3607: ldc2_w 172588107
    //   3610: l2i
    //   3611: ldc_w 1311143641
    //   3614: ixor
    //   3615: ldc2_w -1728097054
    //   3618: l2i
    //   3619: ldc_w 218474619
    //   3622: ixor
    //   3623: ixor
    //   3624: lookupswitch default -> 3652, -1543194010 -> 3607, 865503171 -> 7838
    //   3652: aload_0
    //   3653: getstatic Perryc.c : I
    //   3656: iflt -> 3670
    //   3659: ldc2_w -510735289
    //   3662: l2i
    //   3663: ldc_w 75231157
    //   3666: ixor
    //   3667: goto -> 3678
    //   3670: ldc2_w -1763683502
    //   3673: l2i
    //   3674: ldc_w 104385256
    //   3677: ixor
    //   3678: ldc2_w 1751145083
    //   3681: l2i
    //   3682: ldc_w -1069234763
    //   3685: ixor
    //   3686: ixor
    //   3687: lookupswitch default -> 7708, 956040820 -> 3712, 1305590844 -> 3670
    //   3712: getfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3715: getstatic Perryc.1 : I
    //   3718: ifeq -> 3732
    //   3721: ldc2_w -198210421
    //   3724: l2i
    //   3725: ldc_w 230961238
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w 1430151761
    //   3735: l2i
    //   3736: ldc_w -1962056097
    //   3739: ixor
    //   3740: ldc2_w -2013167080
    //   3743: l2i
    //   3744: ldc_w -1092210251
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 3776, -821293200 -> 7726, 500667666 -> 3732
    //   3776: goto -> 3780
    //   3779: athrow
    //   3780: invokevirtual getValue : ()Ljava/lang/Object;
    //   3783: goto -> 3787
    //   3786: athrow
    //   3787: checkcast java/lang/Integer
    //   3790: getstatic Perryc.0 : I
    //   3793: ifle -> 3807
    //   3796: ldc2_w -1992187438
    //   3799: l2i
    //   3800: ldc_w 1167523860
    //   3803: ixor
    //   3804: goto -> 3815
    //   3807: ldc2_w -854740127
    //   3810: l2i
    //   3811: ldc_w 495714808
    //   3814: ixor
    //   3815: ldc2_w -1649780454
    //   3818: l2i
    //   3819: ldc_w 791081494
    //   3822: ixor
    //   3823: ixor
    //   3824: lookupswitch default -> 7718, 1645025685 -> 3852, 2119830218 -> 3807
    //   3852: goto -> 3856
    //   3855: athrow
    //   3856: invokevirtual intValue : ()I
    //   3859: goto -> 3863
    //   3862: athrow
    //   3863: getstatic Perryc.0 : I
    //   3866: ifle -> 3880
    //   3869: ldc2_w 888743449
    //   3872: l2i
    //   3873: ldc_w 934162064
    //   3876: ixor
    //   3877: goto -> 3888
    //   3880: ldc2_w -266076500
    //   3883: l2i
    //   3884: ldc_w 914224088
    //   3887: ixor
    //   3888: ldc2_w -1390700907
    //   3891: l2i
    //   3892: ldc_w -1742390708
    //   3895: ixor
    //   3896: ixor
    //   3897: lookupswitch default -> 3924, 540215320 -> 3880, 912893008 -> 7680
    //   3924: aload_0
    //   3925: getstatic Perryc.c : I
    //   3928: iflt -> 3942
    //   3931: ldc2_w -586498185
    //   3934: l2i
    //   3935: ldc_w -2053276934
    //   3938: ixor
    //   3939: goto -> 3950
    //   3942: ldc2_w -804188100
    //   3945: l2i
    //   3946: ldc_w -1832037118
    //   3949: ixor
    //   3950: ldc2_w -1120874146
    //   3953: l2i
    //   3954: ldc_w 1276437923
    //   3957: ixor
    //   3958: ixor
    //   3959: lookupswitch default -> 3984, -1447825040 -> 7772, 494310481 -> 3942
    //   3984: getfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3987: getstatic Perryc.1 : I
    //   3990: ifeq -> 4004
    //   3993: ldc2_w -1162632426
    //   3996: l2i
    //   3997: ldc_w -390821939
    //   4000: ixor
    //   4001: goto -> 4012
    //   4004: ldc2_w -644327020
    //   4007: l2i
    //   4008: ldc_w 1135642899
    //   4011: ixor
    //   4012: ldc2_w -472694123
    //   4015: l2i
    //   4016: ldc_w 412567297
    //   4019: ixor
    //   4020: ixor
    //   4021: lookupswitch default -> 7722, -1455218353 -> 4004, 1634522387 -> 4048
    //   4048: goto -> 4052
    //   4051: athrow
    //   4052: invokevirtual getValue : ()Ljava/lang/Object;
    //   4055: goto -> 4059
    //   4058: athrow
    //   4059: checkcast java/lang/Integer
    //   4062: getstatic Perryc.0 : I
    //   4065: ifle -> 4079
    //   4068: ldc2_w 1493097895
    //   4071: l2i
    //   4072: ldc_w 1502799667
    //   4075: ixor
    //   4076: goto -> 4087
    //   4079: ldc2_w 394976087
    //   4082: l2i
    //   4083: ldc_w 224303947
    //   4086: ixor
    //   4087: ldc2_w -896300430
    //   4090: l2i
    //   4091: ldc_w -1648801223
    //   4094: ixor
    //   4095: ixor
    //   4096: lookupswitch default -> 4124, -1205847344 -> 4079, 1447492319 -> 7712
    //   4124: goto -> 4128
    //   4127: athrow
    //   4128: invokevirtual intValue : ()I
    //   4131: goto -> 4135
    //   4134: athrow
    //   4135: getstatic Perryc.c : I
    //   4138: iflt -> 4152
    //   4141: ldc2_w -64677
    //   4144: l2i
    //   4145: ldc_w 1719589393
    //   4148: ixor
    //   4149: goto -> 4160
    //   4152: ldc2_w 881675247
    //   4155: l2i
    //   4156: ldc_w 148688795
    //   4159: ixor
    //   4160: ldc2_w 1030508934
    //   4163: l2i
    //   4164: ldc_w -189841753
    //   4167: ixor
    //   4168: ixor
    //   4169: lookupswitch default -> 7696, -174920875 -> 4196, 1346549355 -> 4152
    //   4196: aload_0
    //   4197: getstatic Perryc.c : I
    //   4200: iflt -> 4214
    //   4203: ldc2_w -303694069
    //   4206: l2i
    //   4207: ldc_w 227063745
    //   4210: ixor
    //   4211: goto -> 4222
    //   4214: ldc2_w -371075262
    //   4217: l2i
    //   4218: ldc_w -1878357399
    //   4221: ixor
    //   4222: ldc2_w -1112164058
    //   4225: l2i
    //   4226: ldc_w -1628910994
    //   4229: ixor
    //   4230: ixor
    //   4231: lookupswitch default -> 7878, -1020249214 -> 4214, 1521888867 -> 4256
    //   4256: getfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4259: getstatic Perryc.c : I
    //   4262: iflt -> 4276
    //   4265: ldc2_w -747966002
    //   4268: l2i
    //   4269: ldc_w -455417679
    //   4272: ixor
    //   4273: goto -> 4284
    //   4276: ldc2_w -1466321023
    //   4279: l2i
    //   4280: ldc_w 1127967326
    //   4283: ixor
    //   4284: ldc2_w 1373420244
    //   4287: l2i
    //   4288: ldc_w 1314270172
    //   4291: ixor
    //   4292: ixor
    //   4293: lookupswitch default -> 7758, -198685481 -> 4320, 674922615 -> 4276
    //   4320: goto -> 4324
    //   4323: athrow
    //   4324: invokevirtual getValue : ()Ljava/lang/Object;
    //   4327: goto -> 4331
    //   4330: athrow
    //   4331: checkcast java/lang/Integer
    //   4334: getstatic Perryc.c : I
    //   4337: iflt -> 4351
    //   4340: ldc2_w -1094590065
    //   4343: l2i
    //   4344: ldc_w 618832183
    //   4347: ixor
    //   4348: goto -> 4359
    //   4351: ldc2_w 149124247
    //   4354: l2i
    //   4355: ldc_w 2022916037
    //   4358: ixor
    //   4359: ldc2_w -120422012
    //   4362: l2i
    //   4363: ldc_w -1040144444
    //   4366: ixor
    //   4367: ixor
    //   4368: lookupswitch default -> 4396, -2140467770 -> 4351, -1594792200 -> 7812
    //   4396: goto -> 4400
    //   4399: athrow
    //   4400: invokevirtual intValue : ()I
    //   4403: goto -> 4407
    //   4406: athrow
    //   4407: getstatic Perryc.1 : I
    //   4410: ifeq -> 4424
    //   4413: ldc2_w 1374290729
    //   4416: l2i
    //   4417: ldc_w -216835548
    //   4420: ixor
    //   4421: goto -> 4432
    //   4424: ldc2_w -274598208
    //   4427: l2i
    //   4428: ldc_w -1887831867
    //   4431: ixor
    //   4432: ldc2_w 1457766642
    //   4435: l2i
    //   4436: ldc_w 1897380439
    //   4439: ixor
    //   4440: ixor
    //   4441: lookupswitch default -> 4468, -2062736472 -> 7720, -167085961 -> 4424
    //   4468: aload_0
    //   4469: getstatic Perryc.0 : I
    //   4472: ifle -> 4486
    //   4475: ldc2_w -717438111
    //   4478: l2i
    //   4479: ldc_w 1076389853
    //   4482: ixor
    //   4483: goto -> 4494
    //   4486: ldc2_w 1030407918
    //   4489: l2i
    //   4490: ldc_w 465740242
    //   4493: ixor
    //   4494: ldc2_w 990603317
    //   4497: l2i
    //   4498: ldc_w -616014928
    //   4501: ixor
    //   4502: ixor
    //   4503: lookupswitch default -> 7694, -957655879 -> 4528, 1968674617 -> 4486
    //   4528: getfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4531: getstatic Perryc.c : I
    //   4534: iflt -> 4548
    //   4537: ldc2_w -25649304
    //   4540: l2i
    //   4541: ldc_w 1930420012
    //   4544: ixor
    //   4545: goto -> 4556
    //   4548: ldc2_w 834445923
    //   4551: l2i
    //   4552: ldc_w 554812157
    //   4555: ixor
    //   4556: ldc2_w -105887890
    //   4559: l2i
    //   4560: ldc_w 1073313792
    //   4563: ixor
    //   4564: ixor
    //   4565: lookupswitch default -> 7800, -689676304 -> 4592, 1262386986 -> 4548
    //   4592: goto -> 4596
    //   4595: athrow
    //   4596: invokevirtual getValue : ()Ljava/lang/Object;
    //   4599: goto -> 4603
    //   4602: athrow
    //   4603: checkcast java/lang/Integer
    //   4606: getstatic Perryc.0 : I
    //   4609: ifle -> 4623
    //   4612: ldc2_w -1907855120
    //   4615: l2i
    //   4616: ldc_w 624862044
    //   4619: ixor
    //   4620: goto -> 4631
    //   4623: ldc2_w -1420235376
    //   4626: l2i
    //   4627: ldc_w -162218416
    //   4630: ixor
    //   4631: ldc2_w -285281431
    //   4634: l2i
    //   4635: ldc_w -189828518
    //   4638: ixor
    //   4639: ixor
    //   4640: lookupswitch default -> 7734, -1322823009 -> 4623, 1197331187 -> 4668
    //   4668: goto -> 4672
    //   4671: athrow
    //   4672: invokevirtual intValue : ()I
    //   4675: goto -> 4679
    //   4678: athrow
    //   4679: getstatic Perryc.1 : I
    //   4682: ifeq -> 4696
    //   4685: ldc2_w -568107441
    //   4688: l2i
    //   4689: ldc_w 909925504
    //   4692: ixor
    //   4693: goto -> 4704
    //   4696: ldc2_w -2112392285
    //   4699: l2i
    //   4700: ldc_w -257694836
    //   4703: ixor
    //   4704: ldc2_w 1403417415
    //   4707: l2i
    //   4708: ldc_w 1749509887
    //   4711: ixor
    //   4712: ixor
    //   4713: lookupswitch default -> 7854, -738322569 -> 4696, 1230341527 -> 4740
    //   4740: goto -> 4744
    //   4743: athrow
    //   4744: invokespecial <init> : (IIII)V
    //   4747: goto -> 4751
    //   4750: athrow
    //   4751: getstatic Perryc.1 : I
    //   4754: ifeq -> 4768
    //   4757: ldc2_w -1048165053
    //   4760: l2i
    //   4761: ldc_w 914139065
    //   4764: ixor
    //   4765: goto -> 4776
    //   4768: ldc2_w 646680099
    //   4771: l2i
    //   4772: ldc_w 1205931124
    //   4775: ixor
    //   4776: ldc2_w -1533153639
    //   4779: l2i
    //   4780: ldc_w -2127219126
    //   4783: ixor
    //   4784: ixor
    //   4785: lookupswitch default -> 7676, -766363095 -> 4768, 1153587844 -> 4812
    //   4812: aload_0
    //   4813: getstatic Perryc.c : I
    //   4816: iflt -> 4830
    //   4819: ldc2_w 1258227929
    //   4822: l2i
    //   4823: ldc_w -1448460980
    //   4826: ixor
    //   4827: goto -> 4838
    //   4830: ldc2_w 1244259953
    //   4833: l2i
    //   4834: ldc_w 816086433
    //   4837: ixor
    //   4838: ldc2_w -556990698
    //   4841: l2i
    //   4842: ldc_w 1794863163
    //   4845: ixor
    //   4846: ixor
    //   4847: lookupswitch default -> 7842, -826665731 -> 4872, 1466088120 -> 4830
    //   4872: getfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4875: getstatic Perryc.0 : I
    //   4878: ifle -> 4892
    //   4881: ldc2_w 1682549051
    //   4884: l2i
    //   4885: ldc_w 1519381114
    //   4888: ixor
    //   4889: goto -> 4900
    //   4892: ldc2_w 796405430
    //   4895: l2i
    //   4896: ldc_w -321616234
    //   4899: ixor
    //   4900: ldc2_w 620507870
    //   4903: l2i
    //   4904: ldc_w -1779377461
    //   4907: ixor
    //   4908: ixor
    //   4909: lookupswitch default -> 4936, -1882543276 -> 7756, 1822670201 -> 4892
    //   4936: goto -> 4940
    //   4939: athrow
    //   4940: invokevirtual getValue : ()Ljava/lang/Object;
    //   4943: goto -> 4947
    //   4946: athrow
    //   4947: checkcast java/lang/Float
    //   4950: getstatic Perryc.0 : I
    //   4953: ifle -> 4967
    //   4956: ldc2_w 565414964
    //   4959: l2i
    //   4960: ldc_w 322896845
    //   4963: ixor
    //   4964: goto -> 4975
    //   4967: ldc2_w -87767849
    //   4970: l2i
    //   4971: ldc_w -1713385041
    //   4974: ixor
    //   4975: ldc2_w 270323461
    //   4978: l2i
    //   4979: ldc_w 394429839
    //   4982: ixor
    //   4983: ixor
    //   4984: lookupswitch default -> 7794, 890422643 -> 4967, 1686462450 -> 5012
    //   5012: goto -> 5016
    //   5015: athrow
    //   5016: invokevirtual floatValue : ()F
    //   5019: goto -> 5023
    //   5022: athrow
    //   5023: getstatic Perryc.0 : I
    //   5026: ifle -> 5040
    //   5029: ldc2_w 2007672829
    //   5032: l2i
    //   5033: ldc_w 674996848
    //   5036: ixor
    //   5037: goto -> 5048
    //   5040: ldc2_w -1262830497
    //   5043: l2i
    //   5044: ldc_w 1313779594
    //   5047: ixor
    //   5048: ldc2_w -1387480108
    //   5051: l2i
    //   5052: ldc_w -1765916039
    //   5055: ixor
    //   5056: ixor
    //   5057: lookupswitch default -> 5084, 633673504 -> 5040, 1684274208 -> 7762
    //   5084: aload_0
    //   5085: getstatic Perryc.1 : I
    //   5088: ifeq -> 5102
    //   5091: ldc2_w 271799609
    //   5094: l2i
    //   5095: ldc_w -530401886
    //   5098: ixor
    //   5099: goto -> 5110
    //   5102: ldc2_w -1863862041
    //   5105: l2i
    //   5106: ldc_w 1274184311
    //   5109: ixor
    //   5110: ldc2_w -30139065
    //   5113: l2i
    //   5114: ldc_w -256432240
    //   5117: ixor
    //   5118: ixor
    //   5119: lookupswitch default -> 7830, -711589817 -> 5144, -19735988 -> 5102
    //   5144: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5147: getstatic Perryc.c : I
    //   5150: iflt -> 5164
    //   5153: ldc2_w 935906216
    //   5156: l2i
    //   5157: ldc_w -1050250138
    //   5160: ixor
    //   5161: goto -> 5172
    //   5164: ldc2_w 883227784
    //   5167: l2i
    //   5168: ldc_w -1784898988
    //   5171: ixor
    //   5172: ldc2_w -1842461751
    //   5175: l2i
    //   5176: ldc_w -1012138046
    //   5179: ixor
    //   5180: ixor
    //   5181: lookupswitch default -> 7798, -1490353211 -> 5164, -255993129 -> 5208
    //   5208: goto -> 5212
    //   5211: athrow
    //   5212: invokevirtual getValue : ()Ljava/lang/Object;
    //   5215: goto -> 5219
    //   5218: athrow
    //   5219: checkcast java/lang/Boolean
    //   5222: getstatic Perryc.c : I
    //   5225: iflt -> 5239
    //   5228: ldc2_w 606447442
    //   5231: l2i
    //   5232: ldc_w 639348788
    //   5235: ixor
    //   5236: goto -> 5247
    //   5239: ldc2_w -1676574295
    //   5242: l2i
    //   5243: ldc_w -1079924103
    //   5246: ixor
    //   5247: ldc2_w -168470122
    //   5250: l2i
    //   5251: ldc_w 143792058
    //   5254: ixor
    //   5255: ixor
    //   5256: lookupswitch default -> 5284, -10921654 -> 7776, -5835245 -> 5239
    //   5284: goto -> 5288
    //   5287: athrow
    //   5288: invokevirtual booleanValue : ()Z
    //   5291: goto -> 5295
    //   5294: athrow
    //   5295: getstatic Perryc.1 : I
    //   5298: ifeq -> 5312
    //   5301: ldc2_w 813707845
    //   5304: l2i
    //   5305: ldc_w -149846309
    //   5308: ixor
    //   5309: goto -> 5320
    //   5312: ldc2_w -923992007
    //   5315: l2i
    //   5316: ldc_w 381323967
    //   5319: ixor
    //   5320: ldc2_w -85104470
    //   5323: l2i
    //   5324: ldc_w -148637691
    //   5327: ixor
    //   5328: ixor
    //   5329: lookupswitch default -> 5356, -899734479 -> 7806, -736745415 -> 5312
    //   5356: aload_0
    //   5357: getstatic Perryc.1 : I
    //   5360: ifeq -> 5374
    //   5363: ldc2_w -262779036
    //   5366: l2i
    //   5367: ldc_w 1926081295
    //   5370: ixor
    //   5371: goto -> 5382
    //   5374: ldc2_w 2019822565
    //   5377: l2i
    //   5378: ldc_w 2001077552
    //   5381: ixor
    //   5382: ldc2_w -605775219
    //   5385: l2i
    //   5386: ldc_w 1700403253
    //   5389: ixor
    //   5390: ixor
    //   5391: lookupswitch default -> 7728, -1315140499 -> 5416, 1009084115 -> 5374
    //   5416: getfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5419: getstatic Perryc.c : I
    //   5422: iflt -> 5436
    //   5425: ldc2_w 1851037289
    //   5428: l2i
    //   5429: ldc_w -999431414
    //   5432: ixor
    //   5433: goto -> 5444
    //   5436: ldc2_w -1102337970
    //   5439: l2i
    //   5440: ldc_w -734076448
    //   5443: ixor
    //   5444: ldc2_w 544406942
    //   5447: l2i
    //   5448: ldc_w -510871616
    //   5451: ixor
    //   5452: ixor
    //   5453: lookupswitch default -> 7852, -1416952848 -> 5480, 1808219965 -> 5436
    //   5480: goto -> 5484
    //   5483: athrow
    //   5484: invokevirtual getValue : ()Ljava/lang/Object;
    //   5487: goto -> 5491
    //   5490: athrow
    //   5491: checkcast java/lang/Boolean
    //   5494: getstatic Perryc.c : I
    //   5497: iflt -> 5511
    //   5500: ldc2_w -1958917327
    //   5503: l2i
    //   5504: ldc_w -1295360226
    //   5507: ixor
    //   5508: goto -> 5519
    //   5511: ldc2_w -1395543556
    //   5514: l2i
    //   5515: ldc_w 611239150
    //   5518: ixor
    //   5519: ldc2_w -1911325487
    //   5522: l2i
    //   5523: ldc_w -188985940
    //   5526: ixor
    //   5527: ixor
    //   5528: lookupswitch default -> 5556, -1110160889 -> 5511, 1129850194 -> 7866
    //   5556: goto -> 5560
    //   5559: athrow
    //   5560: invokevirtual booleanValue : ()Z
    //   5563: goto -> 5567
    //   5566: athrow
    //   5567: getstatic Perryc.0 : I
    //   5570: ifle -> 5584
    //   5573: ldc2_w 304550863
    //   5576: l2i
    //   5577: ldc_w 48119859
    //   5580: ixor
    //   5581: goto -> 5592
    //   5584: ldc2_w 1892735089
    //   5587: l2i
    //   5588: ldc_w -1406617223
    //   5591: ixor
    //   5592: ldc2_w 1584956671
    //   5595: l2i
    //   5596: ldc_w 1392527239
    //   5599: ixor
    //   5600: ixor
    //   5601: lookupswitch default -> 7770, -780098960 -> 5628, 495030404 -> 5584
    //   5628: aload_0
    //   5629: getstatic Perryc.1 : I
    //   5632: ifeq -> 5646
    //   5635: ldc2_w -1176479417
    //   5638: l2i
    //   5639: ldc_w -1086002064
    //   5642: ixor
    //   5643: goto -> 5654
    //   5646: ldc2_w -753081991
    //   5649: l2i
    //   5650: ldc_w 1169487111
    //   5653: ixor
    //   5654: ldc2_w 1638668215
    //   5657: l2i
    //   5658: ldc_w 316048315
    //   5661: ixor
    //   5662: ixor
    //   5663: lookupswitch default -> 5688, -2021131821 -> 5646, 1977491771 -> 7736
    //   5688: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5691: getstatic Perryc.c : I
    //   5694: iflt -> 5708
    //   5697: ldc2_w 1116277906
    //   5700: l2i
    //   5701: ldc_w -801031839
    //   5704: ixor
    //   5705: goto -> 5716
    //   5708: ldc2_w 2050440234
    //   5711: l2i
    //   5712: ldc_w 834942902
    //   5715: ixor
    //   5716: ldc2_w 1013905970
    //   5719: l2i
    //   5720: ldc_w -912953132
    //   5723: ixor
    //   5724: ixor
    //   5725: lookupswitch default -> 5752, 720703635 -> 5708, 1731444501 -> 7826
    //   5752: goto -> 5756
    //   5755: athrow
    //   5756: invokevirtual getValue : ()Ljava/lang/Object;
    //   5759: goto -> 5763
    //   5762: athrow
    //   5763: checkcast java/lang/Integer
    //   5766: getstatic Perryc.1 : I
    //   5769: ifeq -> 5783
    //   5772: ldc2_w -1171744605
    //   5775: l2i
    //   5776: ldc_w -1064894115
    //   5779: ixor
    //   5780: goto -> 5791
    //   5783: ldc2_w 709797872
    //   5786: l2i
    //   5787: ldc_w 116568556
    //   5790: ixor
    //   5791: ldc2_w 1467774571
    //   5794: l2i
    //   5795: ldc_w -412716236
    //   5798: ixor
    //   5799: ixor
    //   5800: lookupswitch default -> 7746, -1666837693 -> 5828, -894067551 -> 5783
    //   5828: goto -> 5832
    //   5831: athrow
    //   5832: invokevirtual intValue : ()I
    //   5835: goto -> 5839
    //   5838: athrow
    //   5839: ldc2_w -1812082162
    //   5842: l2i
    //   5843: ldc_w -1812082161
    //   5846: ixor
    //   5847: getstatic Perryc.c : I
    //   5850: iflt -> 5864
    //   5853: ldc2_w 423911863
    //   5856: l2i
    //   5857: ldc_w 348967912
    //   5860: ixor
    //   5861: goto -> 5872
    //   5864: ldc2_w -77819817
    //   5867: l2i
    //   5868: ldc_w 1795598675
    //   5871: ixor
    //   5872: ldc2_w -611186538
    //   5875: l2i
    //   5876: ldc_w -1172847237
    //   5879: ixor
    //   5880: ixor
    //   5881: lookupswitch default -> 5908, 40997863 -> 5864, 1812823986 -> 7714
    //   5908: goto -> 5912
    //   5911: athrow
    //   5912: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;ZLjava/awt/Color;FZZIZ)V
    //   5915: goto -> 5919
    //   5918: athrow
    //   5919: getstatic Perryc.0 : I
    //   5922: ifle -> 5936
    //   5925: ldc2_w 362982737
    //   5928: l2i
    //   5929: ldc_w -1788431489
    //   5932: ixor
    //   5933: goto -> 5944
    //   5936: ldc2_w -1708754473
    //   5939: l2i
    //   5940: ldc_w 1092392073
    //   5943: ixor
    //   5944: ldc2_w 632817079
    //   5947: l2i
    //   5948: ldc_w -449960650
    //   5951: ixor
    //   5952: ixor
    //   5953: lookupswitch default -> 5980, -1040256116 -> 5936, 1079131823 -> 7780
    //   5980: aload_0
    //   5981: getstatic Perryc.c : I
    //   5984: iflt -> 5998
    //   5987: ldc2_w 1624171102
    //   5990: l2i
    //   5991: ldc_w 1064235044
    //   5994: ixor
    //   5995: goto -> 6006
    //   5998: ldc2_w 845622667
    //   6001: l2i
    //   6002: ldc_w -1835107773
    //   6005: ixor
    //   6006: ldc2_w -609375658
    //   6009: l2i
    //   6010: ldc_w -250427383
    //   6013: ixor
    //   6014: ixor
    //   6015: lookupswitch default -> 6040, -1386171802 -> 5998, 1964994597 -> 7788
    //   6040: getfield renderDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6043: getstatic Perryc.0 : I
    //   6046: ifle -> 6060
    //   6049: ldc2_w 2132322424
    //   6052: l2i
    //   6053: ldc_w -1634416824
    //   6056: ixor
    //   6057: goto -> 6068
    //   6060: ldc2_w -46503763
    //   6063: l2i
    //   6064: ldc_w -101342013
    //   6067: ixor
    //   6068: ldc2_w 1874450580
    //   6071: l2i
    //   6072: ldc_w -1568088817
    //   6075: ixor
    //   6076: ixor
    //   6077: lookupswitch default -> 7848, -906049035 -> 6104, 750611115 -> 6060
    //   6104: goto -> 6108
    //   6107: athrow
    //   6108: invokevirtual getValue : ()Ljava/lang/Object;
    //   6111: goto -> 6115
    //   6114: athrow
    //   6115: checkcast java/lang/Boolean
    //   6118: getstatic Perryc.c : I
    //   6121: iflt -> 6135
    //   6124: ldc2_w 1294239878
    //   6127: l2i
    //   6128: ldc_w 1914985698
    //   6131: ixor
    //   6132: goto -> 6143
    //   6135: ldc2_w 246179155
    //   6138: l2i
    //   6139: ldc_w 1405635578
    //   6142: ixor
    //   6143: ldc2_w 107910688
    //   6146: l2i
    //   6147: ldc_w 1692213488
    //   6150: ixor
    //   6151: ixor
    //   6152: lookupswitch default -> 7752, 1071093881 -> 6180, 1572037300 -> 6135
    //   6180: goto -> 6184
    //   6183: athrow
    //   6184: invokevirtual booleanValue : ()Z
    //   6187: goto -> 6191
    //   6190: athrow
    //   6191: ifeq -> 6205
    //   6194: ldc2_w 1147968017
    //   6197: l2i
    //   6198: ldc_w -1642365298
    //   6201: ixor
    //   6202: goto -> 6213
    //   6205: ldc2_w -1050455919
    //   6208: l2i
    //   6209: ldc_w 454341647
    //   6212: ixor
    //   6213: ldc2_w 13369581
    //   6216: l2i
    //   6217: ldc_w 1632248100
    //   6220: ixor
    //   6221: ixor
    //   6222: tableswitch default -> 6194, -1141783210 -> 6244, -1141783209 -> 7667
    //   6244: getstatic Perryc.c : I
    //   6247: iflt -> 6261
    //   6250: ldc2_w 193284684
    //   6253: l2i
    //   6254: ldc_w -1900995666
    //   6257: ixor
    //   6258: goto -> 6269
    //   6261: ldc2_w -2076341436
    //   6264: l2i
    //   6265: ldc_w 1645311517
    //   6268: ixor
    //   6269: ldc2_w -2104320805
    //   6272: l2i
    //   6273: ldc_w 700525558
    //   6276: ixor
    //   6277: ixor
    //   6278: lookupswitch default -> 6304, -1977424820 -> 6261, 778561231 -> 7858
    //   6304: aload_0
    //   6305: getstatic Perryc.0 : I
    //   6308: ifle -> 6322
    //   6311: ldc2_w 648069529
    //   6314: l2i
    //   6315: ldc_w 798603212
    //   6318: ixor
    //   6319: goto -> 6330
    //   6322: ldc2_w -820572740
    //   6325: l2i
    //   6326: ldc_w -254511891
    //   6329: ixor
    //   6330: ldc2_w 947417920
    //   6333: l2i
    //   6334: ldc_w 2112206733
    //   6337: ixor
    //   6338: ixor
    //   6339: lookupswitch default -> 6364, -223866640 -> 6322, 1285862040 -> 7684
    //   6364: getfield renderBlock : Lnet/minecraft/util/math/BlockPos;
    //   6367: new java/lang/StringBuilder
    //   6370: dup
    //   6371: getstatic Perryc.1 : I
    //   6374: ifeq -> 6388
    //   6377: ldc2_w -1067291455
    //   6380: l2i
    //   6381: ldc_w 1584950953
    //   6384: ixor
    //   6385: goto -> 6396
    //   6388: ldc2_w 790650523
    //   6391: l2i
    //   6392: ldc_w 384094510
    //   6395: ixor
    //   6396: ldc2_w 1904343930
    //   6399: l2i
    //   6400: ldc_w -593264494
    //   6403: ixor
    //   6404: ixor
    //   6405: lookupswitch default -> 6432, 859339136 -> 7784, 1986175000 -> 6388
    //   6432: goto -> 6436
    //   6435: athrow
    //   6436: invokespecial <init> : ()V
    //   6439: goto -> 6443
    //   6442: athrow
    //   6443: getstatic Perryc.c : I
    //   6446: iflt -> 6460
    //   6449: ldc2_w 318937650
    //   6452: l2i
    //   6453: ldc_w -1084215198
    //   6456: ixor
    //   6457: goto -> 6468
    //   6460: ldc2_w -519604438
    //   6463: l2i
    //   6464: ldc_w -1398959621
    //   6467: ixor
    //   6468: ldc2_w -1340624831
    //   6471: l2i
    //   6472: ldc_w -1127768593
    //   6475: ixor
    //   6476: ixor
    //   6477: lookupswitch default -> 7834, -1598912514 -> 6460, 1095420799 -> 6504
    //   6504: aload_0
    //   6505: getstatic Perryc.1 : I
    //   6508: ifeq -> 6522
    //   6511: ldc2_w -1139305012
    //   6514: l2i
    //   6515: ldc_w -1949636566
    //   6518: ixor
    //   6519: goto -> 6530
    //   6522: ldc2_w 1560821236
    //   6525: l2i
    //   6526: ldc_w 1647005657
    //   6529: ixor
    //   6530: ldc2_w 843231389
    //   6533: l2i
    //   6534: ldc_w -1995675649
    //   6537: ixor
    //   6538: ixor
    //   6539: lookupswitch default -> 7864, -2073189041 -> 6564, -1936479612 -> 6522
    //   6564: getfield renderDamageVal : D
    //   6567: getstatic Perryc.1 : I
    //   6570: ifeq -> 6584
    //   6573: ldc2_w 405391610
    //   6576: l2i
    //   6577: ldc_w 1517691791
    //   6580: ixor
    //   6581: goto -> 6592
    //   6584: ldc2_w -455768209
    //   6587: l2i
    //   6588: ldc_w 162016395
    //   6591: ixor
    //   6592: ldc2_w -922988065
    //   6595: l2i
    //   6596: ldc_w -876502015
    //   6599: ixor
    //   6600: ixor
    //   6601: lookupswitch default -> 6628, 1096949419 -> 7748, 2086156138 -> 6584
    //   6628: goto -> 6632
    //   6631: athrow
    //   6632: invokestatic floor : (D)D
    //   6635: goto -> 6639
    //   6638: athrow
    //   6639: getstatic Perryc.0 : I
    //   6642: ifle -> 6656
    //   6645: ldc2_w 1271387910
    //   6648: l2i
    //   6649: ldc_w -505413081
    //   6652: ixor
    //   6653: goto -> 6664
    //   6656: ldc2_w -1925821813
    //   6659: l2i
    //   6660: ldc_w 1689085416
    //   6663: ixor
    //   6664: ldc2_w -200820291
    //   6667: l2i
    //   6668: ldc_w -193816352
    //   6671: ixor
    //   6672: ixor
    //   6673: lookupswitch default -> 7764, -1437404036 -> 6656, -370274754 -> 6700
    //   6700: aload_0
    //   6701: getstatic Perryc.0 : I
    //   6704: ifle -> 6718
    //   6707: ldc2_w 656468287
    //   6710: l2i
    //   6711: ldc_w 590680623
    //   6714: ixor
    //   6715: goto -> 6726
    //   6718: ldc2_w 746746747
    //   6721: l2i
    //   6722: ldc_w -701362013
    //   6725: ixor
    //   6726: ldc2_w -1611373158
    //   6729: l2i
    //   6730: ldc_w 1453380491
    //   6733: ixor
    //   6734: ixor
    //   6735: lookupswitch default -> 6760, -851358463 -> 7796, 862103284 -> 6718
    //   6760: getfield renderDamageVal : D
    //   6763: dcmpl
    //   6764: ifne -> 6778
    //   6767: ldc2_w 1707753102
    //   6770: l2i
    //   6771: ldc_w 1185452538
    //   6774: ixor
    //   6775: goto -> 6786
    //   6778: ldc2_w -433546218
    //   6781: l2i
    //   6782: ldc_w -984992925
    //   6785: ixor
    //   6786: ldc2_w -665841267
    //   6789: l2i
    //   6790: ldc_w 1558094929
    //   6793: ixor
    //   6794: ixor
    //   6795: tableswitch default -> 6767, -1477698904 -> 6816, -1477698903 -> 7014
    //   6816: getstatic Perryc.0 : I
    //   6819: ifle -> 6833
    //   6822: ldc2_w 1486252083
    //   6825: l2i
    //   6826: ldc_w -1646865123
    //   6829: ixor
    //   6830: goto -> 6841
    //   6833: ldc2_w -250763705
    //   6836: l2i
    //   6837: ldc_w 4551607
    //   6840: ixor
    //   6841: ldc2_w -1596246901
    //   6844: l2i
    //   6845: ldc_w -35766485
    //   6848: ixor
    //   6849: ixor
    //   6850: lookupswitch default -> 6876, -1740261746 -> 7874, 822985078 -> 6833
    //   6876: aload_0
    //   6877: getstatic Perryc.0 : I
    //   6880: ifle -> 6894
    //   6883: ldc2_w -915256455
    //   6886: l2i
    //   6887: ldc_w 462877655
    //   6890: ixor
    //   6891: goto -> 6902
    //   6894: ldc2_w 1169936697
    //   6897: l2i
    //   6898: ldc_w -1021617363
    //   6901: ixor
    //   6902: ldc2_w -569885849
    //   6905: l2i
    //   6906: ldc_w -619510854
    //   6909: ixor
    //   6910: ixor
    //   6911: lookupswitch default -> 6936, -1981909919 -> 6894, -671121293 -> 7840
    //   6936: getfield renderDamageVal : D
    //   6939: d2i
    //   6940: getstatic Perryc.0 : I
    //   6943: ifle -> 6957
    //   6946: ldc2_w 1249085080
    //   6949: l2i
    //   6950: ldc_w 818063978
    //   6953: ixor
    //   6954: goto -> 6965
    //   6957: ldc2_w -1079541514
    //   6960: l2i
    //   6961: ldc_w -1893494031
    //   6964: ixor
    //   6965: ldc2_w 550579225
    //   6968: l2i
    //   6969: ldc_w 1770428531
    //   6972: ixor
    //   6973: ixor
    //   6974: lookupswitch default -> 7870, 870750360 -> 6957, 2043913837 -> 7000
    //   7000: goto -> 7004
    //   7003: athrow
    //   7004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7007: goto -> 7011
    //   7010: athrow
    //   7011: goto -> 7375
    //   7014: ldc_w '赉㍝贷扅'
    //   7017: getstatic Perryc.1 : I
    //   7020: ifeq -> 7034
    //   7023: ldc2_w -166317026
    //   7026: l2i
    //   7027: ldc_w 426993159
    //   7030: ixor
    //   7031: goto -> 7042
    //   7034: ldc2_w 1114808833
    //   7037: l2i
    //   7038: ldc_w 1914477376
    //   7041: ixor
    //   7042: ldc2_w 1055184927
    //   7045: l2i
    //   7046: ldc_w 1543130358
    //   7049: ixor
    //   7050: ixor
    //   7051: lookupswitch default -> 7774, -1971599632 -> 7034, 1433447848 -> 7076
    //   7076: goto -> 7080
    //   7079: athrow
    //   7080: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7083: goto -> 7087
    //   7086: athrow
    //   7087: ldc2_w 691666938
    //   7090: l2i
    //   7091: ldc_w 691666939
    //   7094: ixor
    //   7095: anewarray java/lang/Object
    //   7098: dup
    //   7099: ldc2_w 916262421
    //   7102: l2i
    //   7103: ldc_w 916262421
    //   7106: ixor
    //   7107: getstatic Perryc.0 : I
    //   7110: ifle -> 7124
    //   7113: ldc2_w -2106336401
    //   7116: l2i
    //   7117: ldc_w 27511379
    //   7120: ixor
    //   7121: goto -> 7132
    //   7124: ldc2_w 162100506
    //   7127: l2i
    //   7128: ldc_w 721141737
    //   7131: ixor
    //   7132: ldc2_w 1068586788
    //   7135: l2i
    //   7136: ldc_w 1726299911
    //   7139: ixor
    //   7140: ixor
    //   7141: lookupswitch default -> 7168, -628852449 -> 7724, -385686366 -> 7124
    //   7168: aload_0
    //   7169: getstatic Perryc.0 : I
    //   7172: ifle -> 7186
    //   7175: ldc2_w -497434144
    //   7178: l2i
    //   7179: ldc_w -737533463
    //   7182: ixor
    //   7183: goto -> 7194
    //   7186: ldc2_w 866292755
    //   7189: l2i
    //   7190: ldc_w 812021411
    //   7193: ixor
    //   7194: ldc2_w 272519784
    //   7197: l2i
    //   7198: ldc_w -1136429003
    //   7201: ixor
    //   7202: ixor
    //   7203: lookupswitch default -> 7688, -1708209580 -> 7186, -1346778899 -> 7228
    //   7228: getfield renderDamageVal : D
    //   7231: getstatic Perryc.c : I
    //   7234: iflt -> 7248
    //   7237: ldc2_w 473020995
    //   7240: l2i
    //   7241: ldc_w 1345445901
    //   7244: ixor
    //   7245: goto -> 7256
    //   7248: ldc2_w -1440801562
    //   7251: l2i
    //   7252: ldc_w -1346101326
    //   7255: ixor
    //   7256: ldc2_w -29413735
    //   7259: l2i
    //   7260: ldc_w -1319570448
    //   7263: ixor
    //   7264: ixor
    //   7265: lookupswitch default -> 7292, 57116455 -> 7792, 327045418 -> 7248
    //   7292: goto -> 7296
    //   7295: athrow
    //   7296: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7299: goto -> 7303
    //   7302: athrow
    //   7303: aastore
    //   7304: getstatic Perryc.c : I
    //   7307: iflt -> 7321
    //   7310: ldc2_w -1351978884
    //   7313: l2i
    //   7314: ldc_w -183325094
    //   7317: ixor
    //   7318: goto -> 7329
    //   7321: ldc2_w 898266957
    //   7324: l2i
    //   7325: ldc_w 172340704
    //   7328: ixor
    //   7329: ldc2_w -1446720008
    //   7332: l2i
    //   7333: ldc_w 1266405799
    //   7336: ixor
    //   7337: ixor
    //   7338: lookupswitch default -> 7766, -1194868103 -> 7321, -579805454 -> 7364
    //   7364: goto -> 7368
    //   7367: athrow
    //   7368: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   7371: goto -> 7375
    //   7374: athrow
    //   7375: getstatic Perryc.1 : I
    //   7378: ifeq -> 7392
    //   7381: ldc2_w 591973439
    //   7384: l2i
    //   7385: ldc_w 632207658
    //   7388: ixor
    //   7389: goto -> 7400
    //   7392: ldc2_w 436933405
    //   7395: l2i
    //   7396: ldc_w 1793896369
    //   7399: ixor
    //   7400: ldc2_w 1333400429
    //   7403: l2i
    //   7404: ldc_w -915041817
    //   7407: ixor
    //   7408: ixor
    //   7409: lookupswitch default -> 7436, -2132150369 -> 7730, -1364742411 -> 7392
    //   7436: goto -> 7440
    //   7439: athrow
    //   7440: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7443: goto -> 7447
    //   7446: athrow
    //   7447: ldc_w ''
    //   7450: getstatic Perryc.0 : I
    //   7453: ifle -> 7467
    //   7456: ldc2_w -1417235113
    //   7459: l2i
    //   7460: ldc_w 838131622
    //   7463: ixor
    //   7464: goto -> 7475
    //   7467: ldc2_w -1942370312
    //   7470: l2i
    //   7471: ldc_w -828316768
    //   7474: ixor
    //   7475: ldc2_w 2007724042
    //   7478: l2i
    //   7479: ldc_w 1909740405
    //   7482: ixor
    //   7483: ixor
    //   7484: lookupswitch default -> 7512, -1676850802 -> 7790, -216479920 -> 7467
    //   7512: goto -> 7516
    //   7515: athrow
    //   7516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7519: goto -> 7523
    //   7522: athrow
    //   7523: getstatic Perryc.1 : I
    //   7526: ifeq -> 7540
    //   7529: ldc2_w 1252671988
    //   7532: l2i
    //   7533: ldc_w 84829579
    //   7536: ixor
    //   7537: goto -> 7548
    //   7540: ldc2_w 869735034
    //   7543: l2i
    //   7544: ldc_w 158759882
    //   7547: ixor
    //   7548: ldc2_w -1783839248
    //   7551: l2i
    //   7552: ldc_w -1145254049
    //   7555: ixor
    //   7556: ixor
    //   7557: lookupswitch default -> 7672, 347171615 -> 7584, 1639198416 -> 7540
    //   7584: goto -> 7588
    //   7587: athrow
    //   7588: invokevirtual toString : ()Ljava/lang/String;
    //   7591: goto -> 7595
    //   7594: athrow
    //   7595: getstatic Perryc.c : I
    //   7598: iflt -> 7612
    //   7601: ldc2_w 428199514
    //   7604: l2i
    //   7605: ldc_w 499888709
    //   7608: ixor
    //   7609: goto -> 7620
    //   7612: ldc2_w -783122265
    //   7615: l2i
    //   7616: ldc_w 992949421
    //   7619: ixor
    //   7620: ldc2_w -1224770992
    //   7623: l2i
    //   7624: ldc_w 1639415889
    //   7627: ixor
    //   7628: ixor
    //   7629: lookupswitch default -> 7668, -754547170 -> 7612, 1026903563 -> 7656
    //   7656: goto -> 7660
    //   7659: athrow
    //   7660: invokestatic drawText : (Lnet/minecraft/util/math/BlockPos;Ljava/lang/String;)V
    //   7663: goto -> 7667
    //   7666: athrow
    //   7667: return
    //   7668: aconst_null
    //   7669: athrow
    //   7670: aconst_null
    //   7671: athrow
    //   7672: aconst_null
    //   7673: athrow
    //   7674: aconst_null
    //   7675: athrow
    //   7676: aconst_null
    //   7677: athrow
    //   7678: aconst_null
    //   7679: athrow
    //   7680: aconst_null
    //   7681: athrow
    //   7682: aconst_null
    //   7683: athrow
    //   7684: aconst_null
    //   7685: athrow
    //   7686: aconst_null
    //   7687: athrow
    //   7688: aconst_null
    //   7689: athrow
    //   7690: aconst_null
    //   7691: athrow
    //   7692: aconst_null
    //   7693: athrow
    //   7694: aconst_null
    //   7695: athrow
    //   7696: aconst_null
    //   7697: athrow
    //   7698: aconst_null
    //   7699: athrow
    //   7700: aconst_null
    //   7701: athrow
    //   7702: aconst_null
    //   7703: athrow
    //   7704: aconst_null
    //   7705: athrow
    //   7706: aconst_null
    //   7707: athrow
    //   7708: aconst_null
    //   7709: athrow
    //   7710: aconst_null
    //   7711: athrow
    //   7712: aconst_null
    //   7713: athrow
    //   7714: aconst_null
    //   7715: athrow
    //   7716: aconst_null
    //   7717: athrow
    //   7718: aconst_null
    //   7719: athrow
    //   7720: aconst_null
    //   7721: athrow
    //   7722: aconst_null
    //   7723: athrow
    //   7724: aconst_null
    //   7725: athrow
    //   7726: aconst_null
    //   7727: athrow
    //   7728: aconst_null
    //   7729: athrow
    //   7730: aconst_null
    //   7731: athrow
    //   7732: aconst_null
    //   7733: athrow
    //   7734: aconst_null
    //   7735: athrow
    //   7736: aconst_null
    //   7737: athrow
    //   7738: aconst_null
    //   7739: athrow
    //   7740: aconst_null
    //   7741: athrow
    //   7742: aconst_null
    //   7743: athrow
    //   7744: aconst_null
    //   7745: athrow
    //   7746: aconst_null
    //   7747: athrow
    //   7748: aconst_null
    //   7749: athrow
    //   7750: aconst_null
    //   7751: athrow
    //   7752: aconst_null
    //   7753: athrow
    //   7754: aconst_null
    //   7755: athrow
    //   7756: aconst_null
    //   7757: athrow
    //   7758: aconst_null
    //   7759: athrow
    //   7760: aconst_null
    //   7761: athrow
    //   7762: aconst_null
    //   7763: athrow
    //   7764: aconst_null
    //   7765: athrow
    //   7766: aconst_null
    //   7767: athrow
    //   7768: aconst_null
    //   7769: athrow
    //   7770: aconst_null
    //   7771: athrow
    //   7772: aconst_null
    //   7773: athrow
    //   7774: aconst_null
    //   7775: athrow
    //   7776: aconst_null
    //   7777: athrow
    //   7778: aconst_null
    //   7779: athrow
    //   7780: aconst_null
    //   7781: athrow
    //   7782: aconst_null
    //   7783: athrow
    //   7784: aconst_null
    //   7785: athrow
    //   7786: aconst_null
    //   7787: athrow
    //   7788: aconst_null
    //   7789: athrow
    //   7790: aconst_null
    //   7791: athrow
    //   7792: aconst_null
    //   7793: athrow
    //   7794: aconst_null
    //   7795: athrow
    //   7796: aconst_null
    //   7797: athrow
    //   7798: aconst_null
    //   7799: athrow
    //   7800: aconst_null
    //   7801: athrow
    //   7802: aconst_null
    //   7803: athrow
    //   7804: aconst_null
    //   7805: athrow
    //   7806: aconst_null
    //   7807: athrow
    //   7808: aconst_null
    //   7809: athrow
    //   7810: aconst_null
    //   7811: athrow
    //   7812: aconst_null
    //   7813: athrow
    //   7814: aconst_null
    //   7815: athrow
    //   7816: aconst_null
    //   7817: athrow
    //   7818: aconst_null
    //   7819: athrow
    //   7820: aconst_null
    //   7821: athrow
    //   7822: aconst_null
    //   7823: athrow
    //   7824: aconst_null
    //   7825: athrow
    //   7826: aconst_null
    //   7827: athrow
    //   7828: aconst_null
    //   7829: athrow
    //   7830: aconst_null
    //   7831: athrow
    //   7832: aconst_null
    //   7833: athrow
    //   7834: aconst_null
    //   7835: athrow
    //   7836: aconst_null
    //   7837: athrow
    //   7838: aconst_null
    //   7839: athrow
    //   7840: aconst_null
    //   7841: athrow
    //   7842: aconst_null
    //   7843: athrow
    //   7844: aconst_null
    //   7845: athrow
    //   7846: aconst_null
    //   7847: athrow
    //   7848: aconst_null
    //   7849: athrow
    //   7850: aconst_null
    //   7851: athrow
    //   7852: aconst_null
    //   7853: athrow
    //   7854: aconst_null
    //   7855: athrow
    //   7856: aconst_null
    //   7857: athrow
    //   7858: aconst_null
    //   7859: athrow
    //   7860: aconst_null
    //   7861: athrow
    //   7862: aconst_null
    //   7863: athrow
    //   7864: aconst_null
    //   7865: athrow
    //   7866: aconst_null
    //   7867: athrow
    //   7868: aconst_null
    //   7869: athrow
    //   7870: aconst_null
    //   7871: athrow
    //   7872: aconst_null
    //   7873: athrow
    //   7874: aconst_null
    //   7875: athrow
    //   7876: aconst_null
    //   7877: athrow
    //   7878: aconst_null
    //   7879: athrow
    //   7880: aconst_null
    //   7881: athrow
    //   7882: pop
    //   7883: goto -> 24
    //   7886: pop
    //   7887: aconst_null
    //   7888: goto -> 7882
    //   7891: dup
    //   7892: ifnull -> 7882
    //   7895: checkcast java/lang/Throwable
    //   7898: athrow
    //   7899: dup
    //   7900: ifnull -> 7886
    //   7903: checkcast java/lang/Throwable
    //   7906: athrow
    //   7907: aconst_null
    //   7908: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	7644	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	7644	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    //   269	7399	2	outline	Z
    //   337	7331	3	solid	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	7891	finally
    //   523	530	530	finally
    //   523	530	530	finally
    //   524	530	523	finally
    //   524	530	3	finally
    //   524	530	530	java/lang/ClassCastException
    //   599	606	606	finally
    //   599	606	599	finally
    //   599	606	606	java/lang/StringIndexOutOfBoundsException
    //   600	606	599	finally
    //   600	606	599	finally
    //   972	978	978	finally
    //   972	978	978	finally
    //   972	978	3	java/lang/RuntimeException
    //   972	978	3	finally
    //   972	978	978	finally
    //   1047	1054	1054	finally
    //   1047	1054	3	finally
    //   1047	1054	3	java/util/ConcurrentModificationException
    //   1048	1054	1054	finally
    //   1048	1054	1047	finally
    //   1171	1178	1178	finally
    //   1172	1178	1178	finally
    //   1172	1178	1171	finally
    //   1172	1178	1171	java/lang/StringIndexOutOfBoundsException
    //   1172	1178	1178	finally
    //   1308	1314	1314	finally
    //   1308	1314	1314	java/lang/ClassCastException
    //   1308	1314	3	java/lang/IllegalStateException
    //   1308	1314	1314	finally
    //   1308	1314	3	finally
    //   1383	1390	1390	finally
    //   1383	1390	1390	finally
    //   1384	1390	3	finally
    //   1384	1390	3	java/lang/EnumConstantNotPresentException
    //   1384	1390	1383	finally
    //   1456	1462	1462	finally
    //   1456	1462	1462	finally
    //   1456	1462	3	java/lang/IllegalArgumentException
    //   1456	1462	3	finally
    //   1456	1462	3	java/lang/ArrayIndexOutOfBoundsException
    //   1659	1666	1666	finally
    //   1659	1666	1659	java/lang/EnumConstantNotPresentException
    //   1659	1666	1666	java/lang/AssertionError
    //   1659	1666	3	finally
    //   1660	1666	1659	java/util/ConcurrentModificationException
    //   1736	1742	1742	finally
    //   1736	1742	1742	java/lang/NegativeArraySizeException
    //   1736	1742	3	finally
    //   1736	1742	1742	java/lang/IndexOutOfBoundsException
    //   1736	1742	3	java/lang/NumberFormatException
    //   1931	1938	1938	finally
    //   1931	1938	3	java/lang/ArithmeticException
    //   1931	1938	1938	finally
    //   1932	1938	1938	java/lang/NumberFormatException
    //   1932	1938	1931	java/lang/IndexOutOfBoundsException
    //   2007	2014	2014	finally
    //   2007	2014	2007	java/lang/UnsupportedOperationException
    //   2007	2014	2014	java/lang/ArithmeticException
    //   2007	2014	2007	java/lang/ArrayIndexOutOfBoundsException
    //   2008	2014	2014	finally
    //   2203	2210	2210	finally
    //   2203	2210	2210	java/lang/ArrayIndexOutOfBoundsException
    //   2203	2210	3	java/lang/NullPointerException
    //   2204	2210	2203	java/lang/ArithmeticException
    //   2204	2210	3	java/util/NoSuchElementException
    //   2279	2286	2286	finally
    //   2279	2286	2286	java/lang/EnumConstantNotPresentException
    //   2279	2286	3	java/lang/ClassCastException
    //   2279	2286	2279	finally
    //   2280	2286	2286	finally
    //   2475	2482	2482	finally
    //   2475	2482	3	finally
    //   2475	2482	2482	java/lang/NegativeArraySizeException
    //   2476	2482	3	java/lang/NumberFormatException
    //   2476	2482	2475	java/lang/ClassCastException
    //   2551	2558	2558	finally
    //   2551	2558	3	finally
    //   2552	2558	2558	java/lang/AssertionError
    //   2552	2558	2551	java/lang/UnsupportedOperationException
    //   2552	2558	3	finally
    //   2623	2630	2630	finally
    //   2623	2630	3	finally
    //   2623	2630	2623	java/lang/StringIndexOutOfBoundsException
    //   2624	2630	2623	finally
    //   2624	2630	2630	finally
    //   2820	2826	2826	finally
    //   2820	2826	2826	java/lang/UnsupportedOperationException
    //   2820	2826	2826	java/lang/ArrayIndexOutOfBoundsException
    //   2820	2826	3	finally
    //   2820	2826	3	finally
    //   2895	2902	2902	finally
    //   2895	2902	2895	java/lang/NegativeArraySizeException
    //   2896	2902	2895	finally
    //   2896	2902	2895	finally
    //   2896	2902	2895	java/lang/StringIndexOutOfBoundsException
    //   3091	3098	3098	finally
    //   3091	3098	3091	finally
    //   3091	3098	3091	java/lang/NegativeArraySizeException
    //   3091	3098	3091	finally
    //   3091	3098	3	finally
    //   3167	3174	3174	finally
    //   3167	3174	3167	finally
    //   3167	3174	3167	finally
    //   3167	3174	3	finally
    //   3168	3174	3167	finally
    //   3291	3298	3298	finally
    //   3291	3298	3298	finally
    //   3291	3298	3291	finally
    //   3291	3298	3291	finally
    //   3292	3298	3298	finally
    //   3428	3434	3434	finally
    //   3428	3434	3	finally
    //   3428	3434	3434	java/lang/IllegalStateException
    //   3428	3434	3434	finally
    //   3428	3434	3434	java/lang/UnsupportedOperationException
    //   3503	3510	3510	finally
    //   3503	3510	3510	finally
    //   3504	3510	3510	java/lang/AssertionError
    //   3504	3510	3510	finally
    //   3504	3510	3503	java/lang/ArithmeticException
    //   3575	3582	3582	finally
    //   3575	3582	3582	finally
    //   3575	3582	3575	finally
    //   3575	3582	3582	java/lang/StringIndexOutOfBoundsException
    //   3576	3582	3582	finally
    //   3779	3786	3786	finally
    //   3779	3786	3779	finally
    //   3779	3786	3779	java/lang/StringIndexOutOfBoundsException
    //   3779	3786	3779	java/lang/StringIndexOutOfBoundsException
    //   3780	3786	3786	finally
    //   3855	3862	3862	finally
    //   3855	3862	3	finally
    //   3855	3862	3855	finally
    //   3856	3862	3	finally
    //   3856	3862	3862	java/lang/AssertionError
    //   4051	4058	4058	finally
    //   4051	4058	3	finally
    //   4052	4058	4051	java/lang/ClassCastException
    //   4052	4058	4051	finally
    //   4052	4058	3	java/lang/ArrayIndexOutOfBoundsException
    //   4128	4134	4134	finally
    //   4128	4134	3	finally
    //   4128	4134	3	finally
    //   4128	4134	3	java/util/ConcurrentModificationException
    //   4128	4134	4134	java/lang/IllegalArgumentException
    //   4323	4330	4330	finally
    //   4323	4330	4330	java/util/ConcurrentModificationException
    //   4324	4330	4323	java/lang/UnsupportedOperationException
    //   4324	4330	3	finally
    //   4324	4330	3	java/lang/ArrayIndexOutOfBoundsException
    //   4399	4406	4406	finally
    //   4399	4406	4399	finally
    //   4400	4406	4399	java/lang/IllegalArgumentException
    //   4400	4406	4399	finally
    //   4400	4406	3	finally
    //   4596	4602	4602	finally
    //   4596	4602	3	finally
    //   4596	4602	3	java/lang/ClassCastException
    //   4596	4602	3	finally
    //   4596	4602	4602	java/lang/AssertionError
    //   4671	4678	4678	finally
    //   4671	4678	4678	finally
    //   4671	4678	4678	finally
    //   4672	4678	4671	finally
    //   4672	4678	4671	java/lang/StringIndexOutOfBoundsException
    //   4743	4750	4750	finally
    //   4743	4750	4750	finally
    //   4743	4750	4743	finally
    //   4743	4750	3	java/lang/NegativeArraySizeException
    //   4744	4750	3	java/lang/IndexOutOfBoundsException
    //   4939	4946	4946	finally
    //   4939	4946	4946	java/lang/UnsupportedOperationException
    //   4940	4946	4939	java/lang/EnumConstantNotPresentException
    //   4940	4946	4946	finally
    //   4940	4946	4939	finally
    //   5015	5022	5022	finally
    //   5015	5022	3	java/lang/UnsupportedOperationException
    //   5016	5022	3	java/lang/ArithmeticException
    //   5016	5022	5015	finally
    //   5016	5022	5015	java/util/NoSuchElementException
    //   5211	5218	5218	finally
    //   5211	5218	5218	finally
    //   5211	5218	5211	finally
    //   5212	5218	5218	finally
    //   5212	5218	5218	java/lang/NumberFormatException
    //   5287	5294	5294	finally
    //   5287	5294	3	finally
    //   5287	5294	5294	java/lang/NumberFormatException
    //   5287	5294	5287	finally
    //   5288	5294	5294	finally
    //   5483	5490	5490	finally
    //   5483	5490	3	java/lang/StringIndexOutOfBoundsException
    //   5483	5490	5483	finally
    //   5483	5490	5490	finally
    //   5484	5490	3	finally
    //   5559	5566	5566	finally
    //   5559	5566	5559	java/lang/AssertionError
    //   5560	5566	5559	java/lang/NumberFormatException
    //   5560	5566	5566	finally
    //   5560	5566	3	java/lang/EnumConstantNotPresentException
    //   5755	5762	5762	finally
    //   5755	5762	5762	java/lang/NumberFormatException
    //   5755	5762	5762	finally
    //   5756	5762	5755	java/lang/NullPointerException
    //   5756	5762	3	finally
    //   5831	5838	5838	finally
    //   5831	5838	5831	java/lang/EnumConstantNotPresentException
    //   5831	5838	3	finally
    //   5832	5838	5831	java/lang/ArrayIndexOutOfBoundsException
    //   5832	5838	5831	java/lang/ArrayIndexOutOfBoundsException
    //   5912	5918	5918	finally
    //   5912	5918	3	java/lang/ClassCastException
    //   5912	5918	5918	finally
    //   5912	5918	5918	java/lang/ArithmeticException
    //   5912	5918	5918	finally
    //   6108	6114	6114	finally
    //   6108	6114	6114	finally
    //   6108	6114	3	java/lang/RuntimeException
    //   6108	6114	3	finally
    //   6108	6114	3	java/lang/NegativeArraySizeException
    //   6183	6190	6190	finally
    //   6183	6190	6183	finally
    //   6183	6190	6190	java/lang/NullPointerException
    //   6183	6190	6183	java/util/ConcurrentModificationException
    //   6184	6190	6190	java/util/NoSuchElementException
    //   6435	6442	6442	finally
    //   6435	6442	6435	java/util/ConcurrentModificationException
    //   6435	6442	3	finally
    //   6435	6442	6442	java/lang/ArrayIndexOutOfBoundsException
    //   6436	6442	6435	finally
    //   6632	6638	6638	finally
    //   6632	6638	3	java/lang/UnsupportedOperationException
    //   6632	6638	6638	finally
    //   6632	6638	6638	finally
    //   6632	6638	6638	java/lang/IndexOutOfBoundsException
    //   7003	7010	7010	finally
    //   7003	7010	3	finally
    //   7004	7010	7003	java/lang/EnumConstantNotPresentException
    //   7004	7010	3	finally
    //   7004	7010	3	java/lang/EnumConstantNotPresentException
    //   7079	7086	7086	finally
    //   7079	7086	7086	finally
    //   7080	7086	3	java/lang/UnsupportedOperationException
    //   7080	7086	3	finally
    //   7080	7086	7079	finally
    //   7295	7302	7302	finally
    //   7295	7302	3	java/lang/NumberFormatException
    //   7295	7302	7295	java/lang/NullPointerException
    //   7296	7302	3	java/lang/AssertionError
    //   7296	7302	3	java/lang/ClassCastException
    //   7367	7374	7374	finally
    //   7367	7374	3	finally
    //   7368	7374	7374	java/lang/ArithmeticException
    //   7368	7374	7367	java/lang/IllegalArgumentException
    //   7368	7374	3	java/util/NoSuchElementException
    //   7439	7446	7446	finally
    //   7439	7446	7446	finally
    //   7439	7446	7446	finally
    //   7439	7446	7439	finally
    //   7440	7446	3	java/lang/NegativeArraySizeException
    //   7515	7522	7522	finally
    //   7515	7522	7515	finally
    //   7516	7522	7515	finally
    //   7516	7522	7522	finally
    //   7516	7522	7515	finally
    //   7587	7594	7594	finally
    //   7587	7594	3	finally
    //   7587	7594	7587	java/lang/IndexOutOfBoundsException
    //   7587	7594	3	java/lang/UnsupportedOperationException
    //   7588	7594	7594	finally
    //   7659	7666	7666	finally
    //   7659	7666	7666	finally
    //   7659	7666	7666	finally
    //   7660	7666	7666	finally
    //   7660	7666	7659	java/lang/NegativeArraySizeException
    //   7891	7899	7891	java/util/ConcurrentModificationException
    //   7907	7909	3	finally
  }
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 505
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 497
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 489
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -46673707
    //   33: l2i
    //   34: ldc_w -993177639
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1582565047
    //   44: l2i
    //   45: ldc_w -1460115741
    //   48: ixor
    //   49: ldc2_w -447546591
    //   52: l2i
    //   53: ldc_w -1177346291
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 1702591264 -> 472, 2006202050 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -1976947289
    //   94: l2i
    //   95: ldc_w -1286489530
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1397568474
    //   105: l2i
    //   106: ldc_w -332340231
    //   109: ixor
    //   110: ldc2_w -1346212434
    //   113: l2i
    //   114: ldc_w 246481797
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 478, -1744242230 -> 102, 504282632 -> 144
    //   144: getfield rotateMode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w 1633745564
    //   156: l2i
    //   157: ldc_w 718091785
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 772989521
    //   167: l2i
    //   168: ldc_w 1435965229
    //   171: ixor
    //   172: ldc2_w -594955767
    //   175: l2i
    //   176: ldc_w 1125788415
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 470, -734112669 -> 164, -468292214 -> 208
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getValue : ()Ljava/lang/Object;
    //   215: goto -> 219
    //   218: athrow
    //   219: getstatic Perryc.0 : I
    //   222: ifle -> 236
    //   225: ldc2_w 1496108981
    //   228: l2i
    //   229: ldc_w 603272085
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w -1907423871
    //   239: l2i
    //   240: ldc_w 1406145835
    //   243: ixor
    //   244: ldc2_w -1833728689
    //   247: l2i
    //   248: ldc_w -1939645548
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 280, 441480949 -> 236, 1678320379 -> 476
    //   280: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$RotateMode.Off : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$RotateMode;
    //   283: if_acmpne -> 297
    //   286: ldc2_w 1767603951
    //   289: l2i
    //   290: ldc_w -1725508276
    //   293: ixor
    //   294: goto -> 305
    //   297: ldc2_w 1651038084
    //   300: l2i
    //   301: ldc_w -1844085724
    //   304: ixor
    //   305: ldc2_w 1269517248
    //   308: l2i
    //   309: ldc_w -1639201182
    //   312: ixor
    //   313: ixor
    //   314: tableswitch default -> 286, 631055873 -> 336, 631055874 -> 467
    //   336: getstatic Perryc.1 : I
    //   339: ifeq -> 353
    //   342: ldc2_w -739349567
    //   345: l2i
    //   346: ldc_w -1372528454
    //   349: ixor
    //   350: goto -> 361
    //   353: ldc2_w 972737293
    //   356: l2i
    //   357: ldc_w 900926063
    //   360: ixor
    //   361: ldc2_w -1565634537
    //   364: l2i
    //   365: ldc_w -420001890
    //   368: ixor
    //   369: ixor
    //   370: lookupswitch default -> 474, 965188850 -> 353, 1209063147 -> 396
    //   396: aload_0
    //   397: getstatic Perryc.c : I
    //   400: iflt -> 414
    //   403: ldc2_w -1622059427
    //   406: l2i
    //   407: ldc_w -231461408
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w 2098319678
    //   417: l2i
    //   418: ldc_w -1735287608
    //   421: ixor
    //   422: ldc2_w -1485303142
    //   425: l2i
    //   426: ldc_w -340212834
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 456, -316691198 -> 414, 564505273 -> 468
    //   456: goto -> 460
    //   459: athrow
    //   460: invokespecial doCrystalAura : ()V
    //   463: goto -> 467
    //   466: athrow
    //   467: return
    //   468: aconst_null
    //   469: athrow
    //   470: aconst_null
    //   471: athrow
    //   472: aconst_null
    //   473: athrow
    //   474: aconst_null
    //   475: athrow
    //   476: aconst_null
    //   477: athrow
    //   478: aconst_null
    //   479: athrow
    //   480: pop
    //   481: goto -> 24
    //   484: pop
    //   485: aconst_null
    //   486: goto -> 480
    //   489: dup
    //   490: ifnull -> 480
    //   493: checkcast java/lang/Throwable
    //   496: athrow
    //   497: dup
    //   498: ifnull -> 484
    //   501: checkcast java/lang/Throwable
    //   504: athrow
    //   505: aconst_null
    //   506: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	444	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    // Exception table:
    //   from	to	target	type
    //   8	20	489	java/lang/EnumConstantNotPresentException
    //   212	218	218	finally
    //   212	218	3	finally
    //   212	218	3	finally
    //   212	218	3	finally
    //   212	218	3	java/util/ConcurrentModificationException
    //   459	466	466	finally
    //   459	466	459	java/lang/IllegalStateException
    //   460	466	459	finally
    //   460	466	459	finally
    //   460	466	459	finally
    //   489	497	489	java/lang/EnumConstantNotPresentException
    //   505	507	3	finally
  }
  
  public BlockPos getBestBlock() {
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
  
  public void onEnable() {
    Perry1.4i(this, (int)-303495045L ^ 0x9CCB73FE);
  }
  
  @SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
  public void onPacketReceive(PacketEvent.Receive event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 13548
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 13540
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 13532
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1909653043
    //   33: l2i
    //   34: ldc_w -1844550126
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1251423784
    //   44: l2i
    //   45: ldc_w 616723445
    //   48: ixor
    //   49: ldc2_w 398335212
    //   52: l2i
    //   53: ldc_w -2126422733
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 13365, -123075582 -> 84, 1965283838 -> 41
    //   84: aload_1
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -260273883
    //   94: l2i
    //   95: ldc_w -1499698581
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 383981786
    //   105: l2i
    //   106: ldc_w -2100709760
    //   109: ixor
    //   110: ldc2_w -1965840001
    //   113: l2i
    //   114: ldc_w 1243842172
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 13441, -1777284019 -> 102, 1423606105 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   151: goto -> 155
    //   154: athrow
    //   155: instanceof net/minecraft/network/play/server/SPacketSpawnObject
    //   158: ifeq -> 172
    //   161: ldc2_w 91869925
    //   164: l2i
    //   165: ldc_w -1423851647
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -1836803069
    //   175: l2i
    //   176: ldc_w 1021112678
    //   179: ixor
    //   180: ldc2_w -1320009654
    //   183: l2i
    //   184: ldc_w 50894234
    //   187: ixor
    //   188: ixor
    //   189: tableswitch default -> 161, 469940404 -> 212, 469940405 -> 4473
    //   212: getstatic Perryc.1 : I
    //   215: ifeq -> 229
    //   218: ldc2_w -1421597115
    //   221: l2i
    //   222: ldc_w 1484493187
    //   225: ixor
    //   226: goto -> 237
    //   229: ldc2_w 1655316467
    //   232: l2i
    //   233: ldc_w 1405968358
    //   236: ixor
    //   237: ldc2_w -927157351
    //   240: l2i
    //   241: ldc_w 510698000
    //   244: ixor
    //   245: ixor
    //   246: lookupswitch default -> 272, 385038987 -> 229, 636724815 -> 13201
    //   272: aload_1
    //   273: getstatic Perryc.1 : I
    //   276: ifeq -> 290
    //   279: ldc2_w -2067755049
    //   282: l2i
    //   283: ldc_w -651598216
    //   286: ixor
    //   287: goto -> 298
    //   290: ldc2_w -1087155311
    //   293: l2i
    //   294: ldc_w 1197219443
    //   297: ixor
    //   298: ldc2_w 1846230267
    //   301: l2i
    //   302: ldc_w 1375807937
    //   305: ixor
    //   306: ixor
    //   307: lookupswitch default -> 332, -882115356 -> 290, 1642331285 -> 13259
    //   332: goto -> 336
    //   335: athrow
    //   336: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   339: goto -> 343
    //   342: athrow
    //   343: checkcast net/minecraft/network/play/server/SPacketSpawnObject
    //   346: dup
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w -197837607
    //   356: l2i
    //   357: ldc_w -1238851379
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1027758964
    //   367: l2i
    //   368: ldc_w 742640099
    //   371: ixor
    //   372: ldc2_w 1968576362
    //   375: l2i
    //   376: ldc_w -1546848346
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 13231, -1803060008 -> 364, -946113957 -> 408
    //   408: astore_2
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w 1095177955
    //   418: l2i
    //   419: ldc_w -510832895
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1446548164
    //   429: l2i
    //   430: ldc_w 969704103
    //   433: ixor
    //   434: ldc2_w -1232947811
    //   437: l2i
    //   438: ldc_w -1990063790
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1624578771 -> 13225, 892775137 -> 426
    //   468: goto -> 472
    //   471: athrow
    //   472: invokevirtual func_148993_l : ()I
    //   475: goto -> 479
    //   478: athrow
    //   479: ldc2_w 230579898
    //   482: l2i
    //   483: ldc_w 230579849
    //   486: ixor
    //   487: if_icmpne -> 501
    //   490: ldc2_w -1231876489
    //   493: l2i
    //   494: ldc_w -1185082930
    //   497: ixor
    //   498: goto -> 509
    //   501: ldc2_w -2120698116
    //   504: l2i
    //   505: ldc_w -1906923206
    //   508: ixor
    //   509: ldc2_w 1599830944
    //   512: l2i
    //   513: ldc_w 1706279462
    //   516: ixor
    //   517: ixor
    //   518: tableswitch default -> 490, 891725375 -> 540, 891725376 -> 4473
    //   540: getstatic Perryc.c : I
    //   543: iflt -> 557
    //   546: ldc2_w 958642124
    //   549: l2i
    //   550: ldc_w -615523928
    //   553: ixor
    //   554: goto -> 565
    //   557: ldc2_w 1337372500
    //   560: l2i
    //   561: ldc_w -1396113048
    //   564: ixor
    //   565: ldc2_w -1981212481
    //   568: l2i
    //   569: ldc_w -727752073
    //   572: ixor
    //   573: ixor
    //   574: lookupswitch default -> 13411, -1106651916 -> 600, -1088809812 -> 557
    //   600: aload_0
    //   601: ldc2_w -1945972245
    //   604: l2i
    //   605: ldc_w -1945972245
    //   608: ixor
    //   609: getstatic Perryc.c : I
    //   612: iflt -> 626
    //   615: ldc2_w 2006096459
    //   618: l2i
    //   619: ldc_w 460428735
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w -1973674171
    //   629: l2i
    //   630: ldc_w -551389021
    //   633: ixor
    //   634: ldc2_w -299224766
    //   637: l2i
    //   638: ldc_w -1816826715
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, 293360147 -> 13239, 856636357 -> 626
    //   668: putfield hasPacketBroke : Z
    //   671: new java/util/ArrayList
    //   674: dup
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w 1622253538
    //   684: l2i
    //   685: ldc_w 1802879078
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 164728379
    //   695: l2i
    //   696: ldc_w -1423879281
    //   699: ixor
    //   700: ldc2_w 1497915589
    //   703: l2i
    //   704: ldc_w 1721715832
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -754707742 -> 692, 873689913 -> 13427
    //   736: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w 829582989
    //   748: l2i
    //   749: ldc_w 1547031072
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 1018926483
    //   759: l2i
    //   760: ldc_w 813265467
    //   763: ixor
    //   764: ldc2_w 1845016748
    //   767: l2i
    //   768: ldc_w -1007051027
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 13215, -1564229143 -> 800, -1018782996 -> 756
    //   800: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   803: getstatic Perryc.1 : I
    //   806: ifeq -> 820
    //   809: ldc2_w -373996486
    //   812: l2i
    //   813: ldc_w -1107670793
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 271696260
    //   823: l2i
    //   824: ldc_w -1061755053
    //   827: ixor
    //   828: ldc2_w 711206471
    //   831: l2i
    //   832: ldc_w 1581890146
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 13445, -1532314894 -> 864, 543330536 -> 820
    //   864: getfield field_73010_i : Ljava/util/List;
    //   867: getstatic Perryc.0 : I
    //   870: ifle -> 884
    //   873: ldc2_w -481483486
    //   876: l2i
    //   877: ldc_w -276508832
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w -1958716944
    //   887: l2i
    //   888: ldc_w -144727833
    //   891: ixor
    //   892: ldc2_w -645787540
    //   895: l2i
    //   896: ldc_w 1692347744
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 13173, -1315645618 -> 884, -1052589029 -> 928
    //   928: goto -> 932
    //   931: athrow
    //   932: invokespecial <init> : (Ljava/util/Collection;)V
    //   935: goto -> 939
    //   938: athrow
    //   939: getstatic Perryc.c : I
    //   942: iflt -> 956
    //   945: ldc2_w 1356700425
    //   948: l2i
    //   949: ldc_w 1443789225
    //   952: ixor
    //   953: goto -> 964
    //   956: ldc2_w -2136911733
    //   959: l2i
    //   960: ldc_w -985873895
    //   963: ixor
    //   964: ldc2_w 1401285248
    //   967: l2i
    //   968: ldc_w 706009545
    //   971: ixor
    //   972: ixor
    //   973: lookupswitch default -> 1000, -1113019479 -> 956, 2135085545 -> 13359
    //   1000: goto -> 1004
    //   1003: athrow
    //   1004: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1007: goto -> 1011
    //   1010: athrow
    //   1011: getstatic Perryc.0 : I
    //   1014: ifle -> 1028
    //   1017: ldc2_w -749700034
    //   1020: l2i
    //   1021: ldc_w -964349845
    //   1024: ixor
    //   1025: goto -> 1036
    //   1028: ldc2_w 333282242
    //   1031: l2i
    //   1032: ldc_w 135361905
    //   1035: ixor
    //   1036: ldc2_w -112037081
    //   1039: l2i
    //   1040: ldc_w 295516765
    //   1043: ixor
    //   1044: ixor
    //   1045: lookupswitch default -> 1072, -262675201 -> 1028, -48626385 -> 13211
    //   1072: astore_3
    //   1073: getstatic Perryc.0 : I
    //   1076: ifle -> 1090
    //   1079: ldc2_w 1526238891
    //   1082: l2i
    //   1083: ldc_w -1152303492
    //   1086: ixor
    //   1087: goto -> 1098
    //   1090: ldc2_w 127815191
    //   1093: l2i
    //   1094: ldc_w -65340905
    //   1097: ixor
    //   1098: ldc2_w 450563881
    //   1101: l2i
    //   1102: ldc_w -1724686557
    //   1105: ixor
    //   1106: ixor
    //   1107: lookupswitch default -> 13467, 1648484573 -> 1090, 2020402186 -> 1132
    //   1132: aload_3
    //   1133: getstatic Perryc.0 : I
    //   1136: ifle -> 1150
    //   1139: ldc2_w 2027120953
    //   1142: l2i
    //   1143: ldc_w -817721461
    //   1146: ixor
    //   1147: goto -> 1158
    //   1150: ldc2_w -1294945047
    //   1153: l2i
    //   1154: ldc_w 1082687232
    //   1157: ixor
    //   1158: ldc2_w 1940218259
    //   1161: l2i
    //   1162: ldc_w 967278248
    //   1165: ixor
    //   1166: ixor
    //   1167: lookupswitch default -> 1192, -1133842190 -> 1150, -40633975 -> 13459
    //   1192: goto -> 1196
    //   1195: athrow
    //   1196: invokeinterface hasNext : ()Z
    //   1201: goto -> 1205
    //   1204: athrow
    //   1205: ifeq -> 1219
    //   1208: ldc2_w -1323583750
    //   1211: l2i
    //   1212: ldc_w 236437575
    //   1215: ixor
    //   1216: goto -> 1227
    //   1219: ldc2_w -632486017
    //   1222: l2i
    //   1223: ldc_w 1698787777
    //   1226: ixor
    //   1227: ldc2_w -645145779
    //   1230: l2i
    //   1231: ldc_w -2026419031
    //   1234: ixor
    //   1235: ixor
    //   1236: tableswitch default -> 1208, -508501671 -> 1260, -508501670 -> 4473
    //   1260: getstatic Perryc.c : I
    //   1263: iflt -> 1277
    //   1266: ldc2_w 786121384
    //   1269: l2i
    //   1270: ldc_w 938319076
    //   1273: ixor
    //   1274: goto -> 1285
    //   1277: ldc2_w 1626312706
    //   1280: l2i
    //   1281: ldc_w -599526997
    //   1284: ixor
    //   1285: ldc2_w -890632467
    //   1288: l2i
    //   1289: ldc_w 499762264
    //   1292: ixor
    //   1293: ixor
    //   1294: lookupswitch default -> 13185, -837477127 -> 1277, 1804575516 -> 1320
    //   1320: aload_3
    //   1321: getstatic Perryc.1 : I
    //   1324: ifeq -> 1338
    //   1327: ldc2_w 1055366770
    //   1330: l2i
    //   1331: ldc_w 423606830
    //   1334: ixor
    //   1335: goto -> 1346
    //   1338: ldc2_w -775530321
    //   1341: l2i
    //   1342: ldc_w -2021639667
    //   1345: ixor
    //   1346: ldc2_w 264968882
    //   1349: l2i
    //   1350: ldc_w -1174191404
    //   1353: ixor
    //   1354: ixor
    //   1355: lookupswitch default -> 13229, -1844413382 -> 1338, -477218108 -> 1380
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokeinterface next : ()Ljava/lang/Object;
    //   1389: goto -> 1393
    //   1392: athrow
    //   1393: checkcast net/minecraft/entity/player/EntityPlayer
    //   1396: getstatic Perryc.c : I
    //   1399: iflt -> 1413
    //   1402: ldc2_w -1030865766
    //   1405: l2i
    //   1406: ldc_w 1427529354
    //   1409: ixor
    //   1410: goto -> 1421
    //   1413: ldc2_w -863697624
    //   1416: l2i
    //   1417: ldc_w 1291901428
    //   1420: ixor
    //   1421: ldc2_w -1626278696
    //   1424: l2i
    //   1425: ldc_w -993211593
    //   1428: ixor
    //   1429: ixor
    //   1430: lookupswitch default -> 1456, -867934721 -> 13255, 837522361 -> 1413
    //   1456: astore #4
    //   1458: getstatic Perryc.0 : I
    //   1461: ifle -> 1475
    //   1464: ldc2_w -123758881
    //   1467: l2i
    //   1468: ldc_w 387006367
    //   1471: ixor
    //   1472: goto -> 1483
    //   1475: ldc2_w 1558272774
    //   1478: l2i
    //   1479: ldc_w 1516234905
    //   1482: ixor
    //   1483: ldc2_w -1127759283
    //   1486: l2i
    //   1487: ldc_w 1090293027
    //   1490: ixor
    //   1491: ixor
    //   1492: lookupswitch default -> 1520, -1730159393 -> 1475, 330688046 -> 13463
    //   1520: aload_0
    //   1521: new net/minecraft/entity/item/EntityEnderCrystal
    //   1524: dup
    //   1525: getstatic Perryc.0 : I
    //   1528: ifle -> 1542
    //   1531: ldc2_w -1663225591
    //   1534: l2i
    //   1535: ldc_w 407331368
    //   1538: ixor
    //   1539: goto -> 1550
    //   1542: ldc2_w -1226309065
    //   1545: l2i
    //   1546: ldc_w -1129291118
    //   1549: ixor
    //   1550: ldc2_w 203653427
    //   1553: l2i
    //   1554: ldc_w -1240840916
    //   1557: ixor
    //   1558: ixor
    //   1559: lookupswitch default -> 1584, 229077297 -> 1542, 1051957054 -> 13313
    //   1584: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   1587: getstatic Perryc.0 : I
    //   1590: ifle -> 1604
    //   1593: ldc2_w 109726346
    //   1596: l2i
    //   1597: ldc_w 1646688867
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w -699990488
    //   1607: l2i
    //   1608: ldc_w -326313807
    //   1611: ixor
    //   1612: ldc2_w -140238894
    //   1615: l2i
    //   1616: ldc_w 1428509954
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 1648, -970098119 -> 13243, 1927145589 -> 1604
    //   1648: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1651: getstatic Perryc.1 : I
    //   1654: ifeq -> 1668
    //   1657: ldc2_w 224779884
    //   1660: l2i
    //   1661: ldc_w 236183139
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w 1987640264
    //   1671: l2i
    //   1672: ldc_w 59072450
    //   1675: ixor
    //   1676: ldc2_w -433780894
    //   1679: l2i
    //   1680: ldc_w -519285442
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1712, -329557396 -> 1668, 73355859 -> 13485
    //   1712: aload_2
    //   1713: getstatic Perryc.1 : I
    //   1716: ifeq -> 1730
    //   1719: ldc2_w -424348789
    //   1722: l2i
    //   1723: ldc_w 1449879753
    //   1726: ixor
    //   1727: goto -> 1738
    //   1730: ldc2_w 109940470
    //   1733: l2i
    //   1734: ldc_w 1979301794
    //   1737: ixor
    //   1738: ldc2_w -1985354999
    //   1741: l2i
    //   1742: ldc_w -1788884698
    //   1745: ixor
    //   1746: ixor
    //   1747: lookupswitch default -> 13367, -1406553747 -> 1730, 1870797691 -> 1772
    //   1772: goto -> 1776
    //   1775: athrow
    //   1776: invokevirtual func_186880_c : ()D
    //   1779: goto -> 1783
    //   1782: athrow
    //   1783: getstatic Perryc.c : I
    //   1786: iflt -> 1800
    //   1789: ldc2_w -590976769
    //   1792: l2i
    //   1793: ldc_w -2046908076
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -617522759
    //   1803: l2i
    //   1804: ldc_w 1124601114
    //   1807: ixor
    //   1808: ldc2_w 1705680378
    //   1811: l2i
    //   1812: ldc_w -542403414
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 13399, -482752261 -> 1800, 574119411 -> 1844
    //   1844: aload_2
    //   1845: getstatic Perryc.0 : I
    //   1848: ifle -> 1862
    //   1851: ldc2_w -2117888228
    //   1854: l2i
    //   1855: ldc_w -954758398
    //   1858: ixor
    //   1859: goto -> 1870
    //   1862: ldc2_w -765316850
    //   1865: l2i
    //   1866: ldc_w -1611719396
    //   1869: ixor
    //   1870: ldc2_w 2089821840
    //   1873: l2i
    //   1874: ldc_w 1562025850
    //   1877: ixor
    //   1878: ixor
    //   1879: lookupswitch default -> 13417, 1734256116 -> 1862, 1812436472 -> 1904
    //   1904: goto -> 1908
    //   1907: athrow
    //   1908: invokevirtual func_186882_d : ()D
    //   1911: goto -> 1915
    //   1914: athrow
    //   1915: getstatic Perryc.0 : I
    //   1918: ifle -> 1932
    //   1921: ldc2_w 323967422
    //   1924: l2i
    //   1925: ldc_w 1891827671
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w 466199316
    //   1935: l2i
    //   1936: ldc_w 1191006687
    //   1939: ixor
    //   1940: ldc2_w -263702525
    //   1943: l2i
    //   1944: ldc_w -1050651990
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 13347, 1386597568 -> 1932, 1813813346 -> 1976
    //   1976: aload_2
    //   1977: getstatic Perryc.1 : I
    //   1980: ifeq -> 1994
    //   1983: ldc2_w -1223429265
    //   1986: l2i
    //   1987: ldc_w 1874124295
    //   1990: ixor
    //   1991: goto -> 2002
    //   1994: ldc2_w -1265853171
    //   1997: l2i
    //   1998: ldc_w 262593452
    //   2001: ixor
    //   2002: ldc2_w 1986408666
    //   2005: l2i
    //   2006: ldc_w -1028559948
    //   2009: ixor
    //   2010: ixor
    //   2011: lookupswitch default -> 13265, 268246479 -> 2036, 1819309574 -> 1994
    //   2036: goto -> 2040
    //   2039: athrow
    //   2040: invokevirtual func_186881_e : ()D
    //   2043: goto -> 2047
    //   2046: athrow
    //   2047: getstatic Perryc.0 : I
    //   2050: ifle -> 2064
    //   2053: ldc2_w -808163884
    //   2056: l2i
    //   2057: ldc_w 1269063262
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w 321644605
    //   2067: l2i
    //   2068: ldc_w 529337818
    //   2071: ixor
    //   2072: ldc2_w 1765290213
    //   2075: l2i
    //   2076: ldc_w -931073857
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 2108, 269991667 -> 2064, 633928656 -> 13489
    //   2108: goto -> 2112
    //   2111: athrow
    //   2112: invokespecial <init> : (Lnet/minecraft/world/World;DDD)V
    //   2115: goto -> 2119
    //   2118: athrow
    //   2119: getstatic Perryc.0 : I
    //   2122: ifle -> 2136
    //   2125: ldc2_w 575630466
    //   2128: l2i
    //   2129: ldc_w 63576800
    //   2132: ixor
    //   2133: goto -> 2144
    //   2136: ldc2_w 1501752125
    //   2139: l2i
    //   2140: ldc_w 1644269197
    //   2143: ixor
    //   2144: ldc2_w 272750230
    //   2147: l2i
    //   2148: ldc_w -726320222
    //   2151: ixor
    //   2152: ixor
    //   2153: lookupswitch default -> 2180, -1930727080 -> 2136, -445539498 -> 13439
    //   2180: aload #4
    //   2182: getstatic Perryc.0 : I
    //   2185: ifle -> 2199
    //   2188: ldc2_w -1553042464
    //   2191: l2i
    //   2192: ldc_w -1049935597
    //   2195: ixor
    //   2196: goto -> 2207
    //   2199: ldc2_w 723529664
    //   2202: l2i
    //   2203: ldc_w 1002980134
    //   2206: ixor
    //   2207: ldc2_w 690282650
    //   2210: l2i
    //   2211: ldc_w 2105676858
    //   2214: ixor
    //   2215: ixor
    //   2216: lookupswitch default -> 13295, 916702803 -> 2199, 1146001478 -> 2244
    //   2244: goto -> 2248
    //   2247: athrow
    //   2248: invokespecial isCrystalGood : (Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/entity/player/EntityPlayer;)D
    //   2251: goto -> 2255
    //   2254: athrow
    //   2255: ldc2_w 1.312459670535516E308
    //   2258: invokestatic doubleToLongBits : (D)J
    //   2261: ldc2_w 9216437213336352025
    //   2264: lxor
    //   2265: invokestatic longBitsToDouble : (J)D
    //   2268: dcmpl
    //   2269: ifeq -> 2283
    //   2272: ldc2_w -1883588982
    //   2275: l2i
    //   2276: ldc_w 796341403
    //   2279: ixor
    //   2280: goto -> 2291
    //   2283: ldc2_w -736046189
    //   2286: l2i
    //   2287: ldc_w 1961709953
    //   2290: ixor
    //   2291: ldc2_w -1441871684
    //   2294: l2i
    //   2295: ldc_w -617558068
    //   2298: ixor
    //   2299: ixor
    //   2300: tableswitch default -> 2272, -772569759 -> 2324, -772569758 -> 4470
    //   2324: getstatic Perryc.1 : I
    //   2327: ifeq -> 2341
    //   2330: ldc2_w 1088991639
    //   2333: l2i
    //   2334: ldc_w -1061177383
    //   2337: ixor
    //   2338: goto -> 2349
    //   2341: ldc2_w 764509281
    //   2344: l2i
    //   2345: ldc_w -605840042
    //   2348: ixor
    //   2349: ldc2_w -1671144244
    //   2352: l2i
    //   2353: ldc_w 362086770
    //   2356: ixor
    //   2357: ixor
    //   2358: lookupswitch default -> 2384, -317247672 -> 2341, 161897456 -> 13501
    //   2384: aload_0
    //   2385: getstatic Perryc.0 : I
    //   2388: ifle -> 2402
    //   2391: ldc2_w -200106455
    //   2394: l2i
    //   2395: ldc_w -1379098855
    //   2398: ixor
    //   2399: goto -> 2410
    //   2402: ldc2_w -63259095
    //   2405: l2i
    //   2406: ldc_w -408745189
    //   2409: ixor
    //   2410: ldc2_w 1192956982
    //   2413: l2i
    //   2414: ldc_w 60333846
    //   2417: ixor
    //   2418: ixor
    //   2419: lookupswitch default -> 13349, 492669456 -> 2402, 1595555346 -> 2444
    //   2444: getfield predictCrystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2447: getstatic Perryc.c : I
    //   2450: iflt -> 2464
    //   2453: ldc2_w 2018270168
    //   2456: l2i
    //   2457: ldc_w 744038755
    //   2460: ixor
    //   2461: goto -> 2472
    //   2464: ldc2_w -510362889
    //   2467: l2i
    //   2468: ldc_w -385256732
    //   2471: ixor
    //   2472: ldc2_w 360982828
    //   2475: l2i
    //   2476: ldc_w 356253201
    //   2479: ixor
    //   2480: ixor
    //   2481: lookupswitch default -> 13391, 136503086 -> 2508, 1420471686 -> 2464
    //   2508: goto -> 2512
    //   2511: athrow
    //   2512: invokevirtual getValue : ()Ljava/lang/Object;
    //   2515: goto -> 2519
    //   2518: athrow
    //   2519: checkcast java/lang/Boolean
    //   2522: getstatic Perryc.c : I
    //   2525: iflt -> 2539
    //   2528: ldc2_w -1845309741
    //   2531: l2i
    //   2532: ldc_w -505764636
    //   2535: ixor
    //   2536: goto -> 2547
    //   2539: ldc2_w 377794849
    //   2542: l2i
    //   2543: ldc_w 1438987873
    //   2546: ixor
    //   2547: ldc2_w -198574771
    //   2550: l2i
    //   2551: ldc_w 1836545455
    //   2554: ixor
    //   2555: ixor
    //   2556: lookupswitch default -> 13381, -635498590 -> 2584, -360258859 -> 2539
    //   2584: goto -> 2588
    //   2587: athrow
    //   2588: invokevirtual booleanValue : ()Z
    //   2591: goto -> 2595
    //   2594: athrow
    //   2595: ifeq -> 2609
    //   2598: ldc2_w -1435376388
    //   2601: l2i
    //   2602: ldc_w 830432147
    //   2605: ixor
    //   2606: goto -> 2617
    //   2609: ldc2_w -798829082
    //   2612: l2i
    //   2613: ldc_w 1265390216
    //   2616: ixor
    //   2617: ldc2_w -1362113760
    //   2620: l2i
    //   2621: ldc_w 417602485
    //   2624: ixor
    //   2625: ixor
    //   2626: tableswitch default -> 2598, 757422074 -> 2648, 757422075 -> 4473
    //   2648: new net/minecraft/network/play/client/CPacketUseEntity
    //   2651: dup
    //   2652: getstatic Perryc.c : I
    //   2655: iflt -> 2669
    //   2658: ldc2_w 1800018129
    //   2661: l2i
    //   2662: ldc_w 100612493
    //   2665: ixor
    //   2666: goto -> 2677
    //   2669: ldc2_w 1033121982
    //   2672: l2i
    //   2673: ldc_w -1025107950
    //   2676: ixor
    //   2677: ldc2_w 1234797766
    //   2680: l2i
    //   2681: ldc_w -1674787216
    //   2684: ixor
    //   2685: ixor
    //   2686: lookupswitch default -> 2712, -1157602326 -> 13453, 1554746342 -> 2669
    //   2712: goto -> 2716
    //   2715: athrow
    //   2716: invokespecial <init> : ()V
    //   2719: goto -> 2723
    //   2722: athrow
    //   2723: getstatic Perryc.c : I
    //   2726: iflt -> 2740
    //   2729: ldc2_w 1951222559
    //   2732: l2i
    //   2733: ldc_w 1649784771
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w -510879740
    //   2743: l2i
    //   2744: ldc_w 861037304
    //   2747: ixor
    //   2748: ldc2_w 695173725
    //   2751: l2i
    //   2752: ldc_w -1289569223
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 2784, -1940536648 -> 13345, -1275674775 -> 2740
    //   2784: astore #5
    //   2786: getstatic Perryc.0 : I
    //   2789: ifle -> 2803
    //   2792: ldc2_w 96174198
    //   2795: l2i
    //   2796: ldc_w -25730451
    //   2799: ixor
    //   2800: goto -> 2811
    //   2803: ldc2_w 2143008284
    //   2806: l2i
    //   2807: ldc_w 429963255
    //   2810: ixor
    //   2811: ldc2_w -144157066
    //   2814: l2i
    //   2815: ldc_w -152452635
    //   2818: ixor
    //   2819: ixor
    //   2820: lookupswitch default -> 2848, -95586936 -> 13491, 216186479 -> 2803
    //   2848: aload #5
    //   2850: getstatic Perryc.0 : I
    //   2853: ifle -> 2867
    //   2856: ldc2_w -126595754
    //   2859: l2i
    //   2860: ldc_w -599171665
    //   2863: ixor
    //   2864: goto -> 2875
    //   2867: ldc2_w -922236927
    //   2870: l2i
    //   2871: ldc_w -821730761
    //   2874: ixor
    //   2875: ldc2_w 948353136
    //   2878: l2i
    //   2879: ldc_w -1451049258
    //   2882: ixor
    //   2883: ixor
    //   2884: lookupswitch default -> 13177, -1761170288 -> 2912, -1254549921 -> 2867
    //   2912: aload_2
    //   2913: getstatic Perryc.1 : I
    //   2916: ifeq -> 2930
    //   2919: ldc2_w -294026534
    //   2922: l2i
    //   2923: ldc_w 2020992168
    //   2926: ixor
    //   2927: goto -> 2938
    //   2930: ldc2_w -789790884
    //   2933: l2i
    //   2934: ldc_w -966915718
    //   2937: ixor
    //   2938: ldc2_w -1188545501
    //   2941: l2i
    //   2942: ldc_w -1078027425
    //   2945: ixor
    //   2946: ixor
    //   2947: lookupswitch default -> 13219, -1868906226 -> 2930, 270799194 -> 2972
    //   2972: goto -> 2976
    //   2975: athrow
    //   2976: invokevirtual func_149001_c : ()I
    //   2979: goto -> 2983
    //   2982: athrow
    //   2983: getstatic Perryc.c : I
    //   2986: iflt -> 3000
    //   2989: ldc2_w -113379312
    //   2992: l2i
    //   2993: ldc_w -1873525748
    //   2996: ixor
    //   2997: goto -> 3008
    //   3000: ldc2_w -387066643
    //   3003: l2i
    //   3004: ldc_w -112311526
    //   3007: ixor
    //   3008: ldc2_w -1867154068
    //   3011: l2i
    //   3012: ldc_w -686317572
    //   3015: ixor
    //   3016: ixor
    //   3017: lookupswitch default -> 13449, 785079948 -> 3000, 1442936167 -> 3044
    //   3044: putfield field_149567_a : I
    //   3047: getstatic Perryc.c : I
    //   3050: iflt -> 3064
    //   3053: ldc2_w -620849411
    //   3056: l2i
    //   3057: ldc_w 806948419
    //   3060: ixor
    //   3061: goto -> 3072
    //   3064: ldc2_w 20623433
    //   3067: l2i
    //   3068: ldc_w -1421296256
    //   3071: ixor
    //   3072: ldc2_w 200214743
    //   3075: l2i
    //   3076: ldc_w -254643434
    //   3079: ixor
    //   3080: ixor
    //   3081: lookupswitch default -> 13241, 299557759 -> 3064, 1364162056 -> 3108
    //   3108: aload #5
    //   3110: getstatic Perryc.0 : I
    //   3113: ifle -> 3127
    //   3116: ldc2_w 450255171
    //   3119: l2i
    //   3120: ldc_w -1851207708
    //   3123: ixor
    //   3124: goto -> 3135
    //   3127: ldc2_w 917263039
    //   3130: l2i
    //   3131: ldc_w 1690958219
    //   3134: ixor
    //   3135: ldc2_w -2041207447
    //   3138: l2i
    //   3139: ldc_w -2137056046
    //   3142: ixor
    //   3143: ixor
    //   3144: lookupswitch default -> 3172, -1917571300 -> 13301, -821326455 -> 3127
    //   3172: getstatic net/minecraft/network/play/client/CPacketUseEntity$Action.ATTACK : Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   3175: getstatic Perryc.0 : I
    //   3178: ifle -> 3192
    //   3181: ldc2_w -2094456034
    //   3184: l2i
    //   3185: ldc_w 1205602747
    //   3188: ixor
    //   3189: goto -> 3200
    //   3192: ldc2_w -2125542745
    //   3195: l2i
    //   3196: ldc_w -916995036
    //   3199: ixor
    //   3200: ldc2_w 2117242494
    //   3203: l2i
    //   3204: ldc_w 968862342
    //   3207: ixor
    //   3208: ixor
    //   3209: lookupswitch default -> 13407, -2089284003 -> 3192, 261368443 -> 3236
    //   3236: putfield field_149566_b : Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   3239: getstatic Perryc.c : I
    //   3242: iflt -> 3256
    //   3245: ldc2_w 1475406574
    //   3248: l2i
    //   3249: ldc_w -1482183842
    //   3252: ixor
    //   3253: goto -> 3264
    //   3256: ldc2_w -1927797524
    //   3259: l2i
    //   3260: ldc_w 1047320479
    //   3263: ixor
    //   3264: ldc2_w -1564446322
    //   3267: l2i
    //   3268: ldc_w -1358869186
    //   3271: ixor
    //   3272: ixor
    //   3273: lookupswitch default -> 13287, -1095381053 -> 3300, -40469248 -> 3256
    //   3300: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   3303: getstatic Perryc.0 : I
    //   3306: ifle -> 3320
    //   3309: ldc2_w -2071784971
    //   3312: l2i
    //   3313: ldc_w -591978735
    //   3316: ixor
    //   3317: goto -> 3328
    //   3320: ldc2_w -1978648227
    //   3323: l2i
    //   3324: ldc_w 1001631488
    //   3327: ixor
    //   3328: ldc2_w -1755993017
    //   3331: l2i
    //   3332: ldc_w 1786573968
    //   3335: ixor
    //   3336: ixor
    //   3337: lookupswitch default -> 13425, -1524804045 -> 3320, 1284165258 -> 3364
    //   3364: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3367: getstatic Perryc.0 : I
    //   3370: ifle -> 3384
    //   3373: ldc2_w 1202077039
    //   3376: l2i
    //   3377: ldc_w -122105046
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w 2025757528
    //   3387: l2i
    //   3388: ldc_w 1324256327
    //   3391: ixor
    //   3392: ldc2_w -684813434
    //   3395: l2i
    //   3396: ldc_w -65992184
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 3428, -1809745973 -> 13447, 2010262096 -> 3384
    //   3428: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   3431: getstatic Perryc.c : I
    //   3434: iflt -> 3448
    //   3437: ldc2_w -850879137
    //   3440: l2i
    //   3441: ldc_w -1507209241
    //   3444: ixor
    //   3445: goto -> 3456
    //   3448: ldc2_w -600976518
    //   3451: l2i
    //   3452: ldc_w -1796106612
    //   3455: ixor
    //   3456: ldc2_w 2108437472
    //   3459: l2i
    //   3460: ldc_w -1837509550
    //   3463: ixor
    //   3464: ixor
    //   3465: lookupswitch default -> 13249, -2068531958 -> 3448, -1492540860 -> 3492
    //   3492: aload #5
    //   3494: getstatic Perryc.0 : I
    //   3497: ifle -> 3511
    //   3500: ldc2_w 1492709567
    //   3503: l2i
    //   3504: ldc_w -1041247477
    //   3507: ixor
    //   3508: goto -> 3519
    //   3511: ldc2_w 231078074
    //   3514: l2i
    //   3515: ldc_w 1096777119
    //   3518: ixor
    //   3519: ldc2_w -1109814838
    //   3522: l2i
    //   3523: ldc_w 1720543789
    //   3526: ixor
    //   3527: ixor
    //   3528: lookupswitch default -> 13361, -1748074814 -> 3556, 1111742547 -> 3511
    //   3556: goto -> 3560
    //   3559: athrow
    //   3560: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   3563: goto -> 3567
    //   3566: athrow
    //   3567: getstatic Perryc.c : I
    //   3570: iflt -> 3584
    //   3573: ldc2_w -1695914271
    //   3576: l2i
    //   3577: ldc_w 1039400674
    //   3580: ixor
    //   3581: goto -> 3592
    //   3584: ldc2_w 570547946
    //   3587: l2i
    //   3588: ldc_w 1869853412
    //   3591: ixor
    //   3592: ldc2_w -135349310
    //   3595: l2i
    //   3596: ldc_w -1838868266
    //   3599: ixor
    //   3600: ixor
    //   3601: lookupswitch default -> 3628, -1030604009 -> 13323, -652687139 -> 3584
    //   3628: aload_0
    //   3629: getstatic Perryc.1 : I
    //   3632: ifeq -> 3646
    //   3635: ldc2_w 809147203
    //   3638: l2i
    //   3639: ldc_w -1401768092
    //   3642: ixor
    //   3643: goto -> 3654
    //   3646: ldc2_w 380354695
    //   3649: l2i
    //   3650: ldc_w 800558006
    //   3653: ixor
    //   3654: ldc2_w 1114037274
    //   3657: l2i
    //   3658: ldc_w 434002808
    //   3661: ixor
    //   3662: ixor
    //   3663: lookupswitch default -> 3688, -1051422970 -> 3646, -940528827 -> 13409
    //   3688: getfield swing : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3691: getstatic Perryc.1 : I
    //   3694: ifeq -> 3708
    //   3697: ldc2_w 709615850
    //   3700: l2i
    //   3701: ldc_w -1702615516
    //   3704: ixor
    //   3705: goto -> 3716
    //   3708: ldc2_w 1020539974
    //   3711: l2i
    //   3712: ldc_w -1809513682
    //   3715: ixor
    //   3716: ldc2_w -2119965606
    //   3719: l2i
    //   3720: ldc_w -1395201344
    //   3723: ixor
    //   3724: ixor
    //   3725: lookupswitch default -> 13299, -2054931982 -> 3752, -1648703404 -> 3708
    //   3752: goto -> 3756
    //   3755: athrow
    //   3756: invokevirtual getValue : ()Ljava/lang/Object;
    //   3759: goto -> 3763
    //   3762: athrow
    //   3763: getstatic Perryc.c : I
    //   3766: iflt -> 3780
    //   3769: ldc2_w 266411705
    //   3772: l2i
    //   3773: ldc_w -1726279194
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 169545158
    //   3783: l2i
    //   3784: ldc_w -1845820864
    //   3787: ixor
    //   3788: ldc2_w 139378876
    //   3791: l2i
    //   3792: ldc_w -2070735947
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 3824, 438819926 -> 13395, 707870036 -> 3780
    //   3824: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$Swing.None : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$Swing;
    //   3827: if_acmpne -> 3841
    //   3830: ldc2_w -575203354
    //   3833: l2i
    //   3834: ldc_w 631782488
    //   3837: ixor
    //   3838: goto -> 3849
    //   3841: ldc2_w -1921291473
    //   3844: l2i
    //   3845: ldc_w 1969504406
    //   3848: ixor
    //   3849: ldc2_w 308508773
    //   3852: l2i
    //   3853: ldc_w 1196360288
    //   3856: ixor
    //   3857: ixor
    //   3858: tableswitch default -> 3830, -1389145669 -> 3880, -1389145668 -> 3880
    //   3880: getstatic Perryc.1 : I
    //   3883: ifeq -> 3897
    //   3886: ldc2_w 1089207063
    //   3889: l2i
    //   3890: ldc_w -522143107
    //   3893: ixor
    //   3894: goto -> 3905
    //   3897: ldc2_w -595020109
    //   3900: l2i
    //   3901: ldc_w -1310045910
    //   3904: ixor
    //   3905: ldc2_w -652949874
    //   3908: l2i
    //   3909: ldc_w 837950481
    //   3912: ixor
    //   3913: ixor
    //   3914: lookupswitch default -> 13435, -2054937338 -> 3940, 1223531509 -> 3897
    //   3940: aload_0
    //   3941: getstatic Perryc.c : I
    //   3944: iflt -> 3958
    //   3947: ldc2_w -1958061953
    //   3950: l2i
    //   3951: ldc_w 81160644
    //   3954: ixor
    //   3955: goto -> 3966
    //   3958: ldc2_w 1042116926
    //   3961: l2i
    //   3962: ldc_w -1682885425
    //   3965: ixor
    //   3966: ldc2_w 217613305
    //   3969: l2i
    //   3970: ldc_w 564999417
    //   3973: ixor
    //   3974: ixor
    //   3975: lookupswitch default -> 4000, -1563851077 -> 13193, 747224453 -> 3958
    //   4000: getfield packetSafe : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4003: getstatic Perryc.0 : I
    //   4006: ifle -> 4020
    //   4009: ldc2_w 1495083167
    //   4012: l2i
    //   4013: ldc_w 1787853627
    //   4016: ixor
    //   4017: goto -> 4028
    //   4020: ldc2_w 724148043
    //   4023: l2i
    //   4024: ldc_w 2044446937
    //   4027: ixor
    //   4028: ldc2_w 1099799964
    //   4031: l2i
    //   4032: ldc_w 1363787900
    //   4035: ixor
    //   4036: ixor
    //   4037: lookupswitch default -> 13477, 591990340 -> 4020, 1110837874 -> 4064
    //   4064: goto -> 4068
    //   4067: athrow
    //   4068: invokevirtual getValue : ()Ljava/lang/Object;
    //   4071: goto -> 4075
    //   4074: athrow
    //   4075: checkcast java/lang/Boolean
    //   4078: getstatic Perryc.c : I
    //   4081: iflt -> 4095
    //   4084: ldc2_w -1653162787
    //   4087: l2i
    //   4088: ldc_w -1090513970
    //   4091: ixor
    //   4092: goto -> 4103
    //   4095: ldc2_w -1924639944
    //   4098: l2i
    //   4099: ldc_w -1220399728
    //   4102: ixor
    //   4103: ldc2_w 10373440
    //   4106: l2i
    //   4107: ldc_w -2123213613
    //   4110: ixor
    //   4111: ixor
    //   4112: lookupswitch default -> 4140, -1550142848 -> 13251, 1210106437 -> 4095
    //   4140: goto -> 4144
    //   4143: athrow
    //   4144: invokevirtual booleanValue : ()Z
    //   4147: goto -> 4151
    //   4150: athrow
    //   4151: ifeq -> 4165
    //   4154: ldc2_w -248220819
    //   4157: l2i
    //   4158: ldc_w 1743518226
    //   4161: ixor
    //   4162: goto -> 4173
    //   4165: ldc2_w -656889922
    //   4168: l2i
    //   4169: ldc_w 1309093570
    //   4172: ixor
    //   4173: ldc2_w 760856819
    //   4176: l2i
    //   4177: ldc_w -190564707
    //   4180: ixor
    //   4181: ixor
    //   4182: tableswitch default -> 4154, 1327660817 -> 4204, 1327660818 -> 4467
    //   4204: getstatic Perryc.0 : I
    //   4207: ifle -> 4221
    //   4210: ldc2_w -1096201967
    //   4213: l2i
    //   4214: ldc_w -51579333
    //   4217: ixor
    //   4218: goto -> 4229
    //   4221: ldc2_w 1172605318
    //   4224: l2i
    //   4225: ldc_w -1698195209
    //   4228: ixor
    //   4229: ldc2_w 1840523941
    //   4232: l2i
    //   4233: ldc_w -196039111
    //   4236: ixor
    //   4237: ixor
    //   4238: lookupswitch default -> 13339, -610190410 -> 4221, 1187485165 -> 4264
    //   4264: aload_0
    //   4265: ldc2_w 854551231
    //   4268: l2i
    //   4269: ldc_w 854551230
    //   4272: ixor
    //   4273: getstatic Perryc.c : I
    //   4276: iflt -> 4290
    //   4279: ldc2_w 1072620866
    //   4282: l2i
    //   4283: ldc_w -847088021
    //   4286: ixor
    //   4287: goto -> 4298
    //   4290: ldc2_w 88754306
    //   4293: l2i
    //   4294: ldc_w -1283764515
    //   4297: ixor
    //   4298: ldc2_w 446379944
    //   4301: l2i
    //   4302: ldc_w -903673815
    //   4305: ixor
    //   4306: ixor
    //   4307: lookupswitch default -> 4332, -1638367984 -> 4290, 584363176 -> 13289
    //   4332: putfield hasPacketBroke : Z
    //   4335: getstatic Perryc.0 : I
    //   4338: ifle -> 4352
    //   4341: ldc2_w -703122120
    //   4344: l2i
    //   4345: ldc_w -1999540998
    //   4348: ixor
    //   4349: goto -> 4360
    //   4352: ldc2_w -454779212
    //   4355: l2i
    //   4356: ldc_w 947336885
    //   4359: ixor
    //   4360: ldc2_w -472085295
    //   4363: l2i
    //   4364: ldc_w -1526028984
    //   4367: ixor
    //   4368: ixor
    //   4369: lookupswitch default -> 13279, -1706720872 -> 4396, 403730523 -> 4352
    //   4396: aload_0
    //   4397: ldc2_w 1951563829
    //   4400: l2i
    //   4401: ldc_w 1951563829
    //   4404: ixor
    //   4405: getstatic Perryc.c : I
    //   4408: iflt -> 4422
    //   4411: ldc2_w -826851908
    //   4414: l2i
    //   4415: ldc_w -1139914163
    //   4418: ixor
    //   4419: goto -> 4430
    //   4422: ldc2_w 1051411628
    //   4425: l2i
    //   4426: ldc_w 1048825392
    //   4429: ixor
    //   4430: ldc2_w 1778382074
    //   4433: l2i
    //   4434: ldc_w 1075016717
    //   4437: ixor
    //   4438: ixor
    //   4439: lookupswitch default -> 4464, 765345366 -> 4422, 1532360454 -> 13309
    //   4464: putfield confirmPacketBroke : Z
    //   4467: goto -> 4473
    //   4470: goto -> 1073
    //   4473: getstatic Perryc.c : I
    //   4476: iflt -> 4490
    //   4479: ldc2_w -43918366
    //   4482: l2i
    //   4483: ldc_w 1049579999
    //   4486: ixor
    //   4487: goto -> 4498
    //   4490: ldc2_w -69397174
    //   4493: l2i
    //   4494: ldc_w 1344449971
    //   4497: ixor
    //   4498: ldc2_w 1824780040
    //   4501: l2i
    //   4502: ldc_w -74552657
    //   4505: ixor
    //   4506: ixor
    //   4507: lookupswitch default -> 13195, 1018314078 -> 4532, 1419972506 -> 4490
    //   4532: aload_1
    //   4533: getstatic Perryc.c : I
    //   4536: iflt -> 4550
    //   4539: ldc2_w -11904144
    //   4542: l2i
    //   4543: ldc_w -2020038404
    //   4546: ixor
    //   4547: goto -> 4558
    //   4550: ldc2_w 1106199515
    //   4553: l2i
    //   4554: ldc_w -1914395213
    //   4557: ixor
    //   4558: ldc2_w 1817155868
    //   4561: l2i
    //   4562: ldc_w -1108556094
    //   4565: ixor
    //   4566: ixor
    //   4567: lookupswitch default -> 4592, -1452168110 -> 13437, 810702335 -> 4550
    //   4592: goto -> 4596
    //   4595: athrow
    //   4596: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   4599: goto -> 4603
    //   4602: athrow
    //   4603: instanceof net/minecraft/network/play/server/SPacketDestroyEntities
    //   4606: ifeq -> 4620
    //   4609: ldc2_w -360724235
    //   4612: l2i
    //   4613: ldc_w -1724350452
    //   4616: ixor
    //   4617: goto -> 4628
    //   4620: ldc2_w -1365851316
    //   4623: l2i
    //   4624: ldc_w -573469772
    //   4627: ixor
    //   4628: ldc2_w -704186335
    //   4631: l2i
    //   4632: ldc_w -835610322
    //   4635: ixor
    //   4636: ixor
    //   4637: tableswitch default -> 4609, 1802512886 -> 4660, 1802512887 -> 6408
    //   4660: getstatic Perryc.0 : I
    //   4663: ifle -> 4677
    //   4666: ldc2_w -364290145
    //   4669: l2i
    //   4670: ldc_w -1387725554
    //   4673: ixor
    //   4674: goto -> 4685
    //   4677: ldc2_w 167287569
    //   4680: l2i
    //   4681: ldc_w -33894443
    //   4684: ixor
    //   4685: ldc2_w -1329147370
    //   4688: l2i
    //   4689: ldc_w -418133421
    //   4692: ixor
    //   4693: ixor
    //   4694: lookupswitch default -> 4720, -424019575 -> 4677, 282376916 -> 13369
    //   4720: aload_1
    //   4721: getstatic Perryc.1 : I
    //   4724: ifeq -> 4738
    //   4727: ldc2_w -609803301
    //   4730: l2i
    //   4731: ldc_w 2025277549
    //   4734: ixor
    //   4735: goto -> 4746
    //   4738: ldc2_w 2059632426
    //   4741: l2i
    //   4742: ldc_w -1923185549
    //   4745: ixor
    //   4746: ldc2_w 1941441562
    //   4749: l2i
    //   4750: ldc_w -1200852466
    //   4753: ixor
    //   4754: ixor
    //   4755: lookupswitch default -> 13233, 1011451213 -> 4780, 1757681058 -> 4738
    //   4780: goto -> 4784
    //   4783: athrow
    //   4784: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   4787: goto -> 4791
    //   4790: athrow
    //   4791: checkcast net/minecraft/network/play/server/SPacketDestroyEntities
    //   4794: getstatic Perryc.0 : I
    //   4797: ifle -> 4811
    //   4800: ldc2_w -789022207
    //   4803: l2i
    //   4804: ldc_w 924532384
    //   4807: ixor
    //   4808: goto -> 4819
    //   4811: ldc2_w -411462570
    //   4814: l2i
    //   4815: ldc_w 1211394067
    //   4818: ixor
    //   4819: ldc2_w 114399594
    //   4822: l2i
    //   4823: ldc_w -612123312
    //   4826: ixor
    //   4827: ixor
    //   4828: lookupswitch default -> 4856, 177372377 -> 4811, 984703131 -> 13297
    //   4856: astore_3
    //   4857: getstatic Perryc.0 : I
    //   4860: ifle -> 4874
    //   4863: ldc2_w 684308352
    //   4866: l2i
    //   4867: ldc_w 375735796
    //   4870: ixor
    //   4871: goto -> 4882
    //   4874: ldc2_w 1437295114
    //   4877: l2i
    //   4878: ldc_w 536328208
    //   4881: ixor
    //   4882: ldc2_w 1596227626
    //   4885: l2i
    //   4886: ldc_w -1762593081
    //   4889: ixor
    //   4890: ixor
    //   4891: lookupswitch default -> 13419, -2088194825 -> 4916, -143096679 -> 4874
    //   4916: aload_3
    //   4917: getstatic Perryc.0 : I
    //   4920: ifle -> 4934
    //   4923: ldc2_w -630024087
    //   4926: l2i
    //   4927: ldc_w 130812516
    //   4930: ixor
    //   4931: goto -> 4942
    //   4934: ldc2_w 1616107512
    //   4937: l2i
    //   4938: ldc_w -443634130
    //   4941: ixor
    //   4942: ldc2_w 137421655
    //   4945: l2i
    //   4946: ldc_w -1288108514
    //   4949: ixor
    //   4950: ixor
    //   4951: lookupswitch default -> 4976, 1210798133 -> 4934, 1723299652 -> 13335
    //   4976: goto -> 4980
    //   4979: athrow
    //   4980: invokevirtual func_149098_c : ()[I
    //   4983: goto -> 4987
    //   4986: athrow
    //   4987: getstatic Perryc.0 : I
    //   4990: ifle -> 5004
    //   4993: ldc2_w 2001701662
    //   4996: l2i
    //   4997: ldc_w 775398664
    //   5000: ixor
    //   5001: goto -> 5012
    //   5004: ldc2_w -1132401387
    //   5007: l2i
    //   5008: ldc_w -983779327
    //   5011: ixor
    //   5012: ldc2_w 926054960
    //   5015: l2i
    //   5016: ldc_w -997935915
    //   5019: ixor
    //   5020: ixor
    //   5021: lookupswitch default -> 13401, -1972724751 -> 5048, -1429282573 -> 5004
    //   5048: astore #4
    //   5050: getstatic Perryc.c : I
    //   5053: iflt -> 5067
    //   5056: ldc2_w -364958888
    //   5059: l2i
    //   5060: ldc_w 1429543965
    //   5063: ixor
    //   5064: goto -> 5075
    //   5067: ldc2_w 1641655008
    //   5070: l2i
    //   5071: ldc_w 147251570
    //   5074: ixor
    //   5075: ldc2_w -420310563
    //   5078: l2i
    //   5079: ldc_w -671872117
    //   5082: ixor
    //   5083: ixor
    //   5084: lookupswitch default -> 13269, -1911771885 -> 5067, 1478087108 -> 5112
    //   5112: aload #4
    //   5114: arraylength
    //   5115: getstatic Perryc.1 : I
    //   5118: ifeq -> 5132
    //   5121: ldc2_w -862618892
    //   5124: l2i
    //   5125: ldc_w -572145047
    //   5128: ixor
    //   5129: goto -> 5140
    //   5132: ldc2_w -2103267739
    //   5135: l2i
    //   5136: ldc_w 2047141961
    //   5139: ixor
    //   5140: ldc2_w 170392548
    //   5143: l2i
    //   5144: ldc_w 672817465
    //   5147: ixor
    //   5148: ixor
    //   5149: lookupswitch default -> 5176, 860693056 -> 13363, 1113727597 -> 5132
    //   5176: istore #5
    //   5178: ldc2_w -1604438802
    //   5181: l2i
    //   5182: ldc_w -1604438802
    //   5185: ixor
    //   5186: getstatic Perryc.0 : I
    //   5189: ifle -> 5203
    //   5192: ldc2_w -1689952524
    //   5195: l2i
    //   5196: ldc_w 2114864020
    //   5199: ixor
    //   5200: goto -> 5211
    //   5203: ldc2_w -1364316956
    //   5206: l2i
    //   5207: ldc_w 64059550
    //   5210: ixor
    //   5211: ldc2_w 1594551488
    //   5214: l2i
    //   5215: ldc_w 1062475594
    //   5218: ixor
    //   5219: ixor
    //   5220: lookupswitch default -> 5248, -2062162198 -> 13179, 1005518430 -> 5203
    //   5248: istore #6
    //   5250: getstatic Perryc.0 : I
    //   5253: ifle -> 5267
    //   5256: ldc2_w -1744945043
    //   5259: l2i
    //   5260: ldc_w -923535552
    //   5263: ixor
    //   5264: goto -> 5275
    //   5267: ldc2_w -1773381784
    //   5270: l2i
    //   5271: ldc_w 2093142587
    //   5274: ixor
    //   5275: ldc2_w -254269352
    //   5278: l2i
    //   5279: ldc_w 106678031
    //   5282: ixor
    //   5283: ixor
    //   5284: lookupswitch default -> 5312, -1450289030 -> 13469, -199549061 -> 5267
    //   5312: iload #6
    //   5314: getstatic Perryc.1 : I
    //   5317: ifeq -> 5331
    //   5320: ldc2_w -282126524
    //   5323: l2i
    //   5324: ldc_w -780726913
    //   5327: ixor
    //   5328: goto -> 5339
    //   5331: ldc2_w -914159469
    //   5334: l2i
    //   5335: ldc_w 1678972155
    //   5338: ixor
    //   5339: ldc2_w 544684046
    //   5342: l2i
    //   5343: ldc_w 305588148
    //   5346: ixor
    //   5347: ixor
    //   5348: lookupswitch default -> 13379, -1613642798 -> 5376, 203015553 -> 5331
    //   5376: iload #5
    //   5378: if_icmpge -> 5392
    //   5381: ldc2_w -1636792102
    //   5384: l2i
    //   5385: ldc_w -672620627
    //   5388: ixor
    //   5389: goto -> 5400
    //   5392: ldc2_w -1681234263
    //   5395: l2i
    //   5396: ldc_w -766348833
    //   5399: ixor
    //   5400: ldc2_w 2112984885
    //   5403: l2i
    //   5404: ldc_w -1355043954
    //   5407: ixor
    //   5408: ixor
    //   5409: tableswitch default -> 5381, -1689113652 -> 5432, -1689113651 -> 6408
    //   5432: getstatic Perryc.1 : I
    //   5435: ifeq -> 5449
    //   5438: ldc2_w 174599445
    //   5441: l2i
    //   5442: ldc_w 204038281
    //   5445: ixor
    //   5446: goto -> 5457
    //   5449: ldc2_w 611844725
    //   5452: l2i
    //   5453: ldc_w -1115786806
    //   5456: ixor
    //   5457: ldc2_w -1975528370
    //   5460: l2i
    //   5461: ldc_w -1281795537
    //   5464: ixor
    //   5465: ixor
    //   5466: lookupswitch default -> 5492, 1020365570 -> 5449, 1072153597 -> 13197
    //   5492: aload #4
    //   5494: getstatic Perryc.0 : I
    //   5497: ifle -> 5511
    //   5500: ldc2_w -2085941563
    //   5503: l2i
    //   5504: ldc_w 1061379065
    //   5507: ixor
    //   5508: goto -> 5519
    //   5511: ldc2_w -1779911893
    //   5514: l2i
    //   5515: ldc_w -1129967694
    //   5518: ixor
    //   5519: ldc2_w 1944879085
    //   5522: l2i
    //   5523: ldc_w 2145362710
    //   5526: ixor
    //   5527: ixor
    //   5528: lookupswitch default -> 13513, -1327789625 -> 5511, 628973666 -> 5556
    //   5556: iload #6
    //   5558: iaload
    //   5559: getstatic Perryc.0 : I
    //   5562: ifle -> 5576
    //   5565: ldc2_w 1169325700
    //   5568: l2i
    //   5569: ldc_w -1838013945
    //   5572: ixor
    //   5573: goto -> 5584
    //   5576: ldc2_w -1515186928
    //   5579: l2i
    //   5580: ldc_w -584914123
    //   5583: ixor
    //   5584: ldc2_w -1392367415
    //   5587: l2i
    //   5588: ldc_w -994704718
    //   5591: ixor
    //   5592: ixor
    //   5593: lookupswitch default -> 5620, -1099663624 -> 13281, 2056565623 -> 5576
    //   5620: istore #7
    //   5622: getstatic Perryc.0 : I
    //   5625: ifle -> 5639
    //   5628: ldc2_w -1634403332
    //   5631: l2i
    //   5632: ldc_w -1928041786
    //   5635: ixor
    //   5636: goto -> 5647
    //   5639: ldc2_w -917556534
    //   5642: l2i
    //   5643: ldc_w -1604079749
    //   5646: ixor
    //   5647: ldc2_w -15360854
    //   5650: l2i
    //   5651: ldc_w 303534964
    //   5654: ixor
    //   5655: ixor
    //   5656: lookupswitch default -> 13373, -2077322641 -> 5684, -24994076 -> 5639
    //   5684: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   5687: getstatic Perryc.0 : I
    //   5690: ifle -> 5704
    //   5693: ldc2_w 1779619617
    //   5696: l2i
    //   5697: ldc_w -1540573342
    //   5700: ixor
    //   5701: goto -> 5712
    //   5704: ldc2_w 1661577013
    //   5707: l2i
    //   5708: ldc_w 1948443108
    //   5711: ixor
    //   5712: ldc2_w -1187414361
    //   5715: l2i
    //   5716: ldc_w -980369355
    //   5719: ixor
    //   5720: ixor
    //   5721: lookupswitch default -> 13253, -1298669871 -> 5704, 1803745347 -> 5748
    //   5748: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   5751: getstatic Perryc.c : I
    //   5754: iflt -> 5768
    //   5757: ldc2_w 752606520
    //   5760: l2i
    //   5761: ldc_w 1962726011
    //   5764: ixor
    //   5765: goto -> 5776
    //   5768: ldc2_w 1107044151
    //   5771: l2i
    //   5772: ldc_w 1911170090
    //   5775: ixor
    //   5776: ldc2_w 1037244664
    //   5779: l2i
    //   5780: ldc_w 1954529489
    //   5783: ixor
    //   5784: ixor
    //   5785: lookupswitch default -> 5812, 294377322 -> 13315, 2121860216 -> 5768
    //   5812: iload #7
    //   5814: getstatic Perryc.c : I
    //   5817: iflt -> 5831
    //   5820: ldc2_w -2000874767
    //   5823: l2i
    //   5824: ldc_w -1844120081
    //   5827: ixor
    //   5828: goto -> 5839
    //   5831: ldc2_w 967761576
    //   5834: l2i
    //   5835: ldc_w 1228235713
    //   5838: ixor
    //   5839: ldc2_w 972830570
    //   5842: l2i
    //   5843: ldc_w 481309775
    //   5846: ixor
    //   5847: ixor
    //   5848: lookupswitch default -> 13175, 1072030779 -> 5831, 1440202316 -> 5876
    //   5876: goto -> 5880
    //   5879: athrow
    //   5880: invokevirtual func_73045_a : (I)Lnet/minecraft/entity/Entity;
    //   5883: goto -> 5887
    //   5886: athrow
    //   5887: getstatic Perryc.1 : I
    //   5890: ifeq -> 5904
    //   5893: ldc2_w -148158270
    //   5896: l2i
    //   5897: ldc_w -833182350
    //   5900: ixor
    //   5901: goto -> 5912
    //   5904: ldc2_w -1813546584
    //   5907: l2i
    //   5908: ldc_w -1485413060
    //   5911: ixor
    //   5912: ldc2_w -1107100419
    //   5915: l2i
    //   5916: ldc_w 685970166
    //   5919: ixor
    //   5920: ixor
    //   5921: lookupswitch default -> 13423, -1569656161 -> 5948, -1348729925 -> 5904
    //   5948: astore #8
    //   5950: getstatic Perryc.0 : I
    //   5953: ifle -> 5967
    //   5956: ldc2_w 1589008833
    //   5959: l2i
    //   5960: ldc_w 1855323370
    //   5963: ixor
    //   5964: goto -> 5975
    //   5967: ldc2_w -1420011946
    //   5970: l2i
    //   5971: ldc_w -443633732
    //   5974: ixor
    //   5975: ldc2_w -161743104
    //   5978: l2i
    //   5979: ldc_w 1280134998
    //   5982: ixor
    //   5983: ixor
    //   5984: lookupswitch default -> 6012, -1976232579 -> 13257, 1477921438 -> 5967
    //   6012: aload #8
    //   6014: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   6017: ifne -> 6031
    //   6020: ldc2_w -1357640577
    //   6023: l2i
    //   6024: ldc_w -772172601
    //   6027: ixor
    //   6028: goto -> 6039
    //   6031: ldc2_w -101322083
    //   6034: l2i
    //   6035: ldc_w -2028443100
    //   6038: ixor
    //   6039: ldc2_w 2058427231
    //   6042: l2i
    //   6043: ldc_w -244055629
    //   6046: ixor
    //   6047: ixor
    //   6048: tableswitch default -> 6020, -181894572 -> 6072, -181894571 -> 6075
    //   6072: goto -> 6402
    //   6075: getstatic Perryc.c : I
    //   6078: iflt -> 6092
    //   6081: ldc2_w -1816728740
    //   6084: l2i
    //   6085: ldc_w 646706825
    //   6088: ixor
    //   6089: goto -> 6100
    //   6092: ldc2_w -2003072038
    //   6095: l2i
    //   6096: ldc_w 1243477382
    //   6099: ixor
    //   6100: ldc2_w 1668443866
    //   6103: l2i
    //   6104: ldc_w -827602141
    //   6107: ixor
    //   6108: ixor
    //   6109: lookupswitch default -> 13475, 417642540 -> 6092, 1868553125 -> 6136
    //   6136: aload_0
    //   6137: getstatic Perryc.1 : I
    //   6140: ifeq -> 6154
    //   6143: ldc2_w -200348153
    //   6146: l2i
    //   6147: ldc_w 1501935211
    //   6150: ixor
    //   6151: goto -> 6162
    //   6154: ldc2_w -705897474
    //   6157: l2i
    //   6158: ldc_w 70815991
    //   6161: ixor
    //   6162: ldc2_w -2125555621
    //   6165: l2i
    //   6166: ldc_w -39357372
    //   6169: ixor
    //   6170: ixor
    //   6171: lookupswitch default -> 13327, -1388468458 -> 6196, -782060429 -> 6154
    //   6196: getfield attemptedCrystals : Ljava/util/List;
    //   6199: getstatic Perryc.1 : I
    //   6202: ifeq -> 6216
    //   6205: ldc2_w 796873406
    //   6208: l2i
    //   6209: ldc_w -870292381
    //   6212: ixor
    //   6213: goto -> 6224
    //   6216: ldc2_w 1240978110
    //   6219: l2i
    //   6220: ldc_w 340963930
    //   6223: ixor
    //   6224: ldc2_w 491914266
    //   6227: l2i
    //   6228: ldc_w -50300347
    //   6231: ixor
    //   6232: ixor
    //   6233: lookupswitch default -> 13325, -1107878213 -> 6260, 51202178 -> 6216
    //   6260: aload #8
    //   6262: getstatic Perryc.c : I
    //   6265: iflt -> 6279
    //   6268: ldc2_w 57313853
    //   6271: l2i
    //   6272: ldc_w 219839586
    //   6275: ixor
    //   6276: goto -> 6287
    //   6279: ldc2_w -1421594130
    //   6282: l2i
    //   6283: ldc_w -689687536
    //   6286: ixor
    //   6287: ldc2_w 119639772
    //   6290: l2i
    //   6291: ldc_w 881819032
    //   6294: ixor
    //   6295: ixor
    //   6296: lookupswitch default -> 6324, 1037960475 -> 13371, 1427934622 -> 6279
    //   6324: goto -> 6328
    //   6327: athrow
    //   6328: invokeinterface remove : (Ljava/lang/Object;)Z
    //   6333: goto -> 6337
    //   6336: athrow
    //   6337: pop
    //   6338: goto -> 6402
    //   6341: getstatic Perryc.0 : I
    //   6344: ifle -> 6358
    //   6347: ldc2_w -2024667108
    //   6350: l2i
    //   6351: ldc_w 1625192421
    //   6354: ixor
    //   6355: goto -> 6366
    //   6358: ldc2_w 1357215349
    //   6361: l2i
    //   6362: ldc_w 383380113
    //   6365: ixor
    //   6366: ldc2_w 163871163
    //   6369: l2i
    //   6370: ldc_w 449552945
    //   6373: ixor
    //   6374: ixor
    //   6375: lookupswitch default -> 6400, -675255070 -> 6358, -192699277 -> 13273
    //   6400: astore #8
    //   6402: iinc #6, 1
    //   6405: goto -> 5250
    //   6408: getstatic Perryc.c : I
    //   6411: iflt -> 6425
    //   6414: ldc2_w -1414289630
    //   6417: l2i
    //   6418: ldc_w -1554967401
    //   6421: ixor
    //   6422: goto -> 6433
    //   6425: ldc2_w 783060037
    //   6428: l2i
    //   6429: ldc_w -1282779839
    //   6432: ixor
    //   6433: ldc2_w -1867485174
    //   6436: l2i
    //   6437: ldc_w 201560723
    //   6440: ixor
    //   6441: ixor
    //   6442: lookupswitch default -> 6468, -1806610132 -> 13509, -1691891537 -> 6425
    //   6468: aload_1
    //   6469: getstatic Perryc.1 : I
    //   6472: ifeq -> 6486
    //   6475: ldc2_w 1806249512
    //   6478: l2i
    //   6479: ldc_w 545108344
    //   6482: ixor
    //   6483: goto -> 6494
    //   6486: ldc2_w 825924463
    //   6489: l2i
    //   6490: ldc_w -271211244
    //   6493: ixor
    //   6494: ldc2_w 260119639
    //   6497: l2i
    //   6498: ldc_w 1973816345
    //   6501: ixor
    //   6502: ixor
    //   6503: lookupswitch default -> 13169, -1530384843 -> 6528, 838045470 -> 6486
    //   6528: goto -> 6532
    //   6531: athrow
    //   6532: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   6535: goto -> 6539
    //   6538: athrow
    //   6539: instanceof net/minecraft/network/play/server/SPacketSoundEffect
    //   6542: ifeq -> 6556
    //   6545: ldc2_w -1405617704
    //   6548: l2i
    //   6549: ldc_w -202930547
    //   6552: ixor
    //   6553: goto -> 6564
    //   6556: ldc2_w 1715474000
    //   6559: l2i
    //   6560: ldc_w 965767434
    //   6563: ixor
    //   6564: ldc2_w -1850652745
    //   6567: l2i
    //   6568: ldc_w -504830763
    //   6571: ixor
    //   6572: ixor
    //   6573: tableswitch default -> 6545, 797563959 -> 6596, 797563960 -> 10370
    //   6596: getstatic Perryc.c : I
    //   6599: iflt -> 6613
    //   6602: ldc2_w 178545882
    //   6605: l2i
    //   6606: ldc_w -1475048268
    //   6609: ixor
    //   6610: goto -> 6621
    //   6613: ldc2_w -1934820276
    //   6616: l2i
    //   6617: ldc_w 426275372
    //   6620: ixor
    //   6621: ldc2_w -1572291733
    //   6624: l2i
    //   6625: ldc_w -644377713
    //   6628: ixor
    //   6629: ixor
    //   6630: lookupswitch default -> 6656, -646987638 -> 13221, -588132606 -> 6613
    //   6656: aload_1
    //   6657: getstatic Perryc.0 : I
    //   6660: ifle -> 6674
    //   6663: ldc2_w -1347699268
    //   6666: l2i
    //   6667: ldc_w -850941374
    //   6670: ixor
    //   6671: goto -> 6682
    //   6674: ldc2_w -1520629938
    //   6677: l2i
    //   6678: ldc_w -1700400157
    //   6681: ixor
    //   6682: ldc2_w 1845979904
    //   6685: l2i
    //   6686: ldc_w 1117698870
    //   6689: ixor
    //   6690: ixor
    //   6691: lookupswitch default -> 13413, 325133467 -> 6716, 1316341704 -> 6674
    //   6716: goto -> 6720
    //   6719: athrow
    //   6720: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   6723: goto -> 6727
    //   6726: athrow
    //   6727: checkcast net/minecraft/network/play/server/SPacketSoundEffect
    //   6730: getstatic Perryc.c : I
    //   6733: iflt -> 6747
    //   6736: ldc2_w 366541162
    //   6739: l2i
    //   6740: ldc_w 1878840215
    //   6743: ixor
    //   6744: goto -> 6755
    //   6747: ldc2_w 1402915932
    //   6750: l2i
    //   6751: ldc_w -55227976
    //   6754: ixor
    //   6755: ldc2_w -1707709964
    //   6758: l2i
    //   6759: ldc_w 1854680844
    //   6762: ixor
    //   6763: ixor
    //   6764: lookupswitch default -> 13341, -1902220283 -> 6747, 1536279324 -> 6792
    //   6792: goto -> 6796
    //   6795: athrow
    //   6796: invokevirtual func_186977_b : ()Lnet/minecraft/util/SoundCategory;
    //   6799: goto -> 6803
    //   6802: athrow
    //   6803: getstatic Perryc.c : I
    //   6806: iflt -> 6820
    //   6809: ldc2_w 1996868648
    //   6812: l2i
    //   6813: ldc_w 1131139804
    //   6816: ixor
    //   6817: goto -> 6828
    //   6820: ldc2_w -1790785124
    //   6823: l2i
    //   6824: ldc_w 478461652
    //   6827: ixor
    //   6828: ldc2_w -133408447
    //   6831: l2i
    //   6832: ldc_w -88846033
    //   6835: ixor
    //   6836: ixor
    //   6837: lookupswitch default -> 13415, -1954644186 -> 6864, 920000154 -> 6820
    //   6864: getstatic net/minecraft/util/SoundCategory.BLOCKS : Lnet/minecraft/util/SoundCategory;
    //   6867: if_acmpne -> 6881
    //   6870: ldc2_w -2051038407
    //   6873: l2i
    //   6874: ldc_w 74116528
    //   6877: ixor
    //   6878: goto -> 6889
    //   6881: ldc2_w -1095435195
    //   6884: l2i
    //   6885: ldc_w 1063367375
    //   6888: ixor
    //   6889: ldc2_w 721796038
    //   6892: l2i
    //   6893: ldc_w -166902362
    //   6896: ixor
    //   6897: ixor
    //   6898: tableswitch default -> 6870, 1558032617 -> 6920, 1558032618 -> 10370
    //   6920: getstatic Perryc.c : I
    //   6923: iflt -> 6937
    //   6926: ldc2_w -538451823
    //   6929: l2i
    //   6930: ldc_w 1155722385
    //   6933: ixor
    //   6934: goto -> 6945
    //   6937: ldc2_w -1288419083
    //   6940: l2i
    //   6941: ldc_w 463785422
    //   6944: ixor
    //   6945: ldc2_w 1403324820
    //   6948: l2i
    //   6949: ldc_w 1382717314
    //   6952: ixor
    //   6953: ixor
    //   6954: lookupswitch default -> 13285, -1698000362 -> 6937, -1453384915 -> 6980
    //   6980: aload_1
    //   6981: getstatic Perryc.1 : I
    //   6984: ifeq -> 6998
    //   6987: ldc2_w 437387811
    //   6990: l2i
    //   6991: ldc_w 1780261181
    //   6994: ixor
    //   6995: goto -> 7006
    //   6998: ldc2_w 385321060
    //   7001: l2i
    //   7002: ldc_w -216228244
    //   7005: ixor
    //   7006: ldc2_w -1775587009
    //   7009: l2i
    //   7010: ldc_w -632792304
    //   7013: ixor
    //   7014: ixor
    //   7015: lookupswitch default -> 13515, -1450574809 -> 7040, 1013729585 -> 6998
    //   7040: goto -> 7044
    //   7043: athrow
    //   7044: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   7047: goto -> 7051
    //   7050: athrow
    //   7051: checkcast net/minecraft/network/play/server/SPacketSoundEffect
    //   7054: getstatic Perryc.1 : I
    //   7057: ifeq -> 7071
    //   7060: ldc2_w -1313998390
    //   7063: l2i
    //   7064: ldc_w 681908315
    //   7067: ixor
    //   7068: goto -> 7079
    //   7071: ldc2_w 1053738051
    //   7074: l2i
    //   7075: ldc_w -1899091063
    //   7078: ixor
    //   7079: ldc2_w -1777542082
    //   7082: l2i
    //   7083: ldc_w -799902890
    //   7086: ixor
    //   7087: ixor
    //   7088: lookupswitch default -> 13245, -547991815 -> 7071, -161595230 -> 7116
    //   7116: goto -> 7120
    //   7119: athrow
    //   7120: invokevirtual func_186978_a : ()Lnet/minecraft/util/SoundEvent;
    //   7123: goto -> 7127
    //   7126: athrow
    //   7127: getstatic Perryc.1 : I
    //   7130: ifeq -> 7144
    //   7133: ldc2_w -607933114
    //   7136: l2i
    //   7137: ldc_w 604732491
    //   7140: ixor
    //   7141: goto -> 7152
    //   7144: ldc2_w 2024556812
    //   7147: l2i
    //   7148: ldc_w 307883403
    //   7151: ixor
    //   7152: ldc2_w -1289048847
    //   7155: l2i
    //   7156: ldc_w 829064465
    //   7159: ixor
    //   7160: ixor
    //   7161: lookupswitch default -> 7188, 47817601 -> 7144, 2106128621 -> 13171
    //   7188: getstatic net/minecraft/init/SoundEvents.field_187539_bB : Lnet/minecraft/util/SoundEvent;
    //   7191: if_acmpne -> 7205
    //   7194: ldc2_w 973003946
    //   7197: l2i
    //   7198: ldc_w -2078068859
    //   7201: ixor
    //   7202: goto -> 7213
    //   7205: ldc2_w -674149355
    //   7208: l2i
    //   7209: ldc_w 1779220283
    //   7212: ixor
    //   7213: ldc2_w 1702260291
    //   7216: l2i
    //   7217: ldc_w -202209792
    //   7220: ixor
    //   7221: ixor
    //   7222: tableswitch default -> 7194, 727260012 -> 7244, 727260013 -> 10370
    //   7244: new java/util/ArrayList
    //   7247: dup
    //   7248: getstatic Perryc.c : I
    //   7251: iflt -> 7265
    //   7254: ldc2_w -2055892607
    //   7257: l2i
    //   7258: ldc_w 1021687846
    //   7261: ixor
    //   7262: goto -> 7273
    //   7265: ldc2_w 937829898
    //   7268: l2i
    //   7269: ldc_w -1869569047
    //   7272: ixor
    //   7273: ldc2_w -1139031617
    //   7276: l2i
    //   7277: ldc_w -1315525644
    //   7280: ixor
    //   7281: ixor
    //   7282: lookupswitch default -> 7308, -1273150484 -> 13261, 1408054987 -> 7265
    //   7308: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   7311: getstatic Perryc.0 : I
    //   7314: ifle -> 7328
    //   7317: ldc2_w -523146723
    //   7320: l2i
    //   7321: ldc_w 1050585692
    //   7324: ixor
    //   7325: goto -> 7336
    //   7328: ldc2_w -1001811190
    //   7331: l2i
    //   7332: ldc_w -1406289755
    //   7335: ixor
    //   7336: ldc2_w -1277599270
    //   7339: l2i
    //   7340: ldc_w -2089412198
    //   7343: ixor
    //   7344: ixor
    //   7345: lookupswitch default -> 13503, -287262719 -> 7328, 1489720303 -> 7372
    //   7372: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   7375: getstatic Perryc.0 : I
    //   7378: ifle -> 7392
    //   7381: ldc2_w 1045264081
    //   7384: l2i
    //   7385: ldc_w -1800019387
    //   7388: ixor
    //   7389: goto -> 7400
    //   7392: ldc2_w -1872696880
    //   7395: l2i
    //   7396: ldc_w 1464665794
    //   7399: ixor
    //   7400: ldc2_w 2139950959
    //   7403: l2i
    //   7404: ldc_w 761095572
    //   7407: ixor
    //   7408: ixor
    //   7409: lookupswitch default -> 7436, -131531153 -> 13311, 1476655743 -> 7392
    //   7436: getfield field_72996_f : Ljava/util/List;
    //   7439: getstatic Perryc.c : I
    //   7442: iflt -> 7456
    //   7445: ldc2_w -1616011142
    //   7448: l2i
    //   7449: ldc_w 407994339
    //   7452: ixor
    //   7453: goto -> 7464
    //   7456: ldc2_w -84786808
    //   7459: l2i
    //   7460: ldc_w -130612219
    //   7463: ixor
    //   7464: ldc2_w 787529379
    //   7467: l2i
    //   7468: ldc_w 1942619915
    //   7471: ixor
    //   7472: ixor
    //   7473: lookupswitch default -> 7500, -1607674649 -> 7456, -624531919 -> 13181
    //   7500: goto -> 7504
    //   7503: athrow
    //   7504: invokespecial <init> : (Ljava/util/Collection;)V
    //   7507: goto -> 7511
    //   7510: athrow
    //   7511: getstatic Perryc.c : I
    //   7514: iflt -> 7528
    //   7517: ldc2_w 1734150220
    //   7520: l2i
    //   7521: ldc_w 1722685494
    //   7524: ixor
    //   7525: goto -> 7536
    //   7528: ldc2_w -912248977
    //   7531: l2i
    //   7532: ldc_w -882727059
    //   7535: ixor
    //   7536: ldc2_w 1213509540
    //   7539: l2i
    //   7540: ldc_w -489630282
    //   7543: ixor
    //   7544: ixor
    //   7545: lookupswitch default -> 7572, -1418237336 -> 13353, 347831319 -> 7528
    //   7572: goto -> 7576
    //   7575: athrow
    //   7576: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7579: goto -> 7583
    //   7582: athrow
    //   7583: getstatic Perryc.1 : I
    //   7586: ifeq -> 7600
    //   7589: ldc2_w 1651609285
    //   7592: l2i
    //   7593: ldc_w -17436367
    //   7596: ixor
    //   7597: goto -> 7608
    //   7600: ldc2_w -2024027297
    //   7603: l2i
    //   7604: ldc_w 1732744926
    //   7607: ixor
    //   7608: ldc2_w 173470376
    //   7611: l2i
    //   7612: ldc_w -1098334459
    //   7615: ixor
    //   7616: ixor
    //   7617: lookupswitch default -> 13511, 676999769 -> 7600, 1422004268 -> 7644
    //   7644: astore_3
    //   7645: getstatic Perryc.c : I
    //   7648: iflt -> 7662
    //   7651: ldc2_w 1977947419
    //   7654: l2i
    //   7655: ldc_w 1151255124
    //   7658: ixor
    //   7659: goto -> 7670
    //   7662: ldc2_w 247755408
    //   7665: l2i
    //   7666: ldc_w 1298063702
    //   7669: ixor
    //   7670: ldc2_w 1599257049
    //   7673: l2i
    //   7674: ldc_w -1047372738
    //   7677: ixor
    //   7678: ixor
    //   7679: lookupswitch default -> 7704, -1346686296 -> 13305, -517674971 -> 7662
    //   7704: aload_3
    //   7705: getstatic Perryc.0 : I
    //   7708: ifle -> 7722
    //   7711: ldc2_w 614112700
    //   7714: l2i
    //   7715: ldc_w 2003443527
    //   7718: ixor
    //   7719: goto -> 7730
    //   7722: ldc2_w -113730253
    //   7725: l2i
    //   7726: ldc_w 15196301
    //   7729: ixor
    //   7730: ldc2_w 176076459
    //   7733: l2i
    //   7734: ldc_w 1742650375
    //   7737: ixor
    //   7738: ixor
    //   7739: lookupswitch default -> 13207, -1803585774 -> 7764, 1045465175 -> 7722
    //   7764: goto -> 7768
    //   7767: athrow
    //   7768: invokeinterface hasNext : ()Z
    //   7773: goto -> 7777
    //   7776: athrow
    //   7777: ifeq -> 7791
    //   7780: ldc2_w -420688754
    //   7783: l2i
    //   7784: ldc_w -100676021
    //   7787: ixor
    //   7788: goto -> 7799
    //   7791: ldc2_w -2056886882
    //   7794: l2i
    //   7795: ldc_w -1703581862
    //   7798: ixor
    //   7799: ldc2_w -1368433658
    //   7802: l2i
    //   7803: ldc_w 704892349
    //   7806: ixor
    //   7807: ixor
    //   7808: tableswitch default -> 7780, -1686137986 -> 7832, -1686137985 -> 10370
    //   7832: getstatic Perryc.0 : I
    //   7835: ifle -> 7849
    //   7838: ldc2_w -2143581982
    //   7841: l2i
    //   7842: ldc_w 346863631
    //   7845: ixor
    //   7846: goto -> 7857
    //   7849: ldc2_w 1527408196
    //   7852: l2i
    //   7853: ldc_w -1283393340
    //   7856: ixor
    //   7857: ldc2_w 1476249765
    //   7860: l2i
    //   7861: ldc_w 670102644
    //   7864: ixor
    //   7865: ixor
    //   7866: lookupswitch default -> 7892, -459666372 -> 13385, -40164662 -> 7849
    //   7892: aload_3
    //   7893: getstatic Perryc.c : I
    //   7896: iflt -> 7910
    //   7899: ldc2_w -1648193039
    //   7902: l2i
    //   7903: ldc_w 1500684480
    //   7906: ixor
    //   7907: goto -> 7918
    //   7910: ldc2_w 1722703294
    //   7913: l2i
    //   7914: ldc_w -12346292
    //   7917: ixor
    //   7918: ldc2_w 2139195015
    //   7921: l2i
    //   7922: ldc_w -1050612801
    //   7925: ixor
    //   7926: ixor
    //   7927: lookupswitch default -> 13461, 655142090 -> 7952, 2052152329 -> 7910
    //   7952: goto -> 7956
    //   7955: athrow
    //   7956: invokeinterface next : ()Ljava/lang/Object;
    //   7961: goto -> 7965
    //   7964: athrow
    //   7965: checkcast net/minecraft/entity/Entity
    //   7968: getstatic Perryc.c : I
    //   7971: iflt -> 7985
    //   7974: ldc2_w 12598184
    //   7977: l2i
    //   7978: ldc_w 969519571
    //   7981: ixor
    //   7982: goto -> 7993
    //   7985: ldc2_w -367618995
    //   7988: l2i
    //   7989: ldc_w -2133956341
    //   7992: ixor
    //   7993: ldc2_w -368530200
    //   7996: l2i
    //   7997: ldc_w -2051277417
    //   8000: ixor
    //   8001: ixor
    //   8002: lookupswitch default -> 8028, -1649456246 -> 7985, 1455086340 -> 13495
    //   8028: astore #4
    //   8030: getstatic Perryc.0 : I
    //   8033: ifle -> 8047
    //   8036: ldc2_w -1065129900
    //   8039: l2i
    //   8040: ldc_w -189425106
    //   8043: ixor
    //   8044: goto -> 8055
    //   8047: ldc2_w 1052064943
    //   8050: l2i
    //   8051: ldc_w 1856915931
    //   8054: ixor
    //   8055: ldc2_w 561558315
    //   8058: l2i
    //   8059: ldc_w -1612224324
    //   8062: ixor
    //   8063: ixor
    //   8064: lookupswitch default -> 13355, -1968625171 -> 8047, -293294365 -> 8092
    //   8092: aload #4
    //   8094: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   8097: ifeq -> 8111
    //   8100: ldc2_w 1358184390
    //   8103: l2i
    //   8104: ldc_w -915523796
    //   8107: ixor
    //   8108: goto -> 8119
    //   8111: ldc2_w -321441497
    //   8114: l2i
    //   8115: ldc_w 1967995338
    //   8118: ixor
    //   8119: ldc2_w -131499082
    //   8122: l2i
    //   8123: ldc_w 1138370319
    //   8126: ixor
    //   8127: ixor
    //   8128: tableswitch default -> 8100, 577328211 -> 8152, 577328212 -> 10367
    //   8152: getstatic Perryc.0 : I
    //   8155: ifle -> 8169
    //   8158: ldc2_w 1599632377
    //   8161: l2i
    //   8162: ldc_w 1892622468
    //   8165: ixor
    //   8166: goto -> 8177
    //   8169: ldc2_w 1120322483
    //   8172: l2i
    //   8173: ldc_w -1920843467
    //   8176: ixor
    //   8177: ldc2_w -1604813415
    //   8180: l2i
    //   8181: ldc_w -1257950365
    //   8184: ixor
    //   8185: ixor
    //   8186: lookupswitch default -> 8212, 986324359 -> 13351, 1545297864 -> 8169
    //   8212: aload #4
    //   8214: getstatic Perryc.1 : I
    //   8217: ifeq -> 8231
    //   8220: ldc2_w 88182687
    //   8223: l2i
    //   8224: ldc_w -329763003
    //   8227: ixor
    //   8228: goto -> 8239
    //   8231: ldc2_w -1999130814
    //   8234: l2i
    //   8235: ldc_w -380636926
    //   8238: ixor
    //   8239: ldc2_w 618848828
    //   8242: l2i
    //   8243: ldc_w -1413619286
    //   8246: ixor
    //   8247: ixor
    //   8248: lookupswitch default -> 8276, 771170066 -> 8231, 1715911500 -> 13277
    //   8276: aload_1
    //   8277: getstatic Perryc.0 : I
    //   8280: ifle -> 8294
    //   8283: ldc2_w -174128470
    //   8286: l2i
    //   8287: ldc_w 1745296186
    //   8290: ixor
    //   8291: goto -> 8302
    //   8294: ldc2_w 149174986
    //   8297: l2i
    //   8298: ldc_w 352584125
    //   8301: ixor
    //   8302: ldc2_w -962404638
    //   8305: l2i
    //   8306: ldc_w 1726447976
    //   8309: ixor
    //   8310: ixor
    //   8311: lookupswitch default -> 8336, -1192833693 -> 8294, 1037911578 -> 13247
    //   8336: goto -> 8340
    //   8339: athrow
    //   8340: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   8343: goto -> 8347
    //   8346: athrow
    //   8347: checkcast net/minecraft/network/play/server/SPacketSoundEffect
    //   8350: getstatic Perryc.c : I
    //   8353: iflt -> 8367
    //   8356: ldc2_w -1829378637
    //   8359: l2i
    //   8360: ldc_w 2129514475
    //   8363: ixor
    //   8364: goto -> 8375
    //   8367: ldc2_w 1963160112
    //   8370: l2i
    //   8371: ldc_w -1927493690
    //   8374: ixor
    //   8375: ldc2_w 1884889607
    //   8378: l2i
    //   8379: ldc_w -749752440
    //   8382: ixor
    //   8383: ixor
    //   8384: lookupswitch default -> 13307, 1326360535 -> 8367, 1527330937 -> 8412
    //   8412: goto -> 8416
    //   8415: athrow
    //   8416: invokevirtual func_149207_d : ()D
    //   8419: goto -> 8423
    //   8422: athrow
    //   8423: getstatic Perryc.c : I
    //   8426: iflt -> 8440
    //   8429: ldc2_w -790951074
    //   8432: l2i
    //   8433: ldc_w 1418008806
    //   8436: ixor
    //   8437: goto -> 8448
    //   8440: ldc2_w 527291358
    //   8443: l2i
    //   8444: ldc_w 1413636880
    //   8447: ixor
    //   8448: ldc2_w -1468423196
    //   8451: l2i
    //   8452: ldc_w 1212064554
    //   8455: ixor
    //   8456: ixor
    //   8457: lookupswitch default -> 13403, -1419202560 -> 8484, 1679364982 -> 8440
    //   8484: aload_1
    //   8485: getstatic Perryc.c : I
    //   8488: iflt -> 8502
    //   8491: ldc2_w 1248852842
    //   8494: l2i
    //   8495: ldc_w 411901838
    //   8498: ixor
    //   8499: goto -> 8510
    //   8502: ldc2_w -422321711
    //   8505: l2i
    //   8506: ldc_w 880338935
    //   8509: ixor
    //   8510: ldc2_w 1683135355
    //   8513: l2i
    //   8514: ldc_w -1523163976
    //   8517: ixor
    //   8518: ixor
    //   8519: lookupswitch default -> 8544, -1819925721 -> 13451, 1847276777 -> 8502
    //   8544: goto -> 8548
    //   8547: athrow
    //   8548: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   8551: goto -> 8555
    //   8554: athrow
    //   8555: checkcast net/minecraft/network/play/server/SPacketSoundEffect
    //   8558: getstatic Perryc.0 : I
    //   8561: ifle -> 8575
    //   8564: ldc2_w 1429679063
    //   8567: l2i
    //   8568: ldc_w 2084398556
    //   8571: ixor
    //   8572: goto -> 8583
    //   8575: ldc2_w -1444562818
    //   8578: l2i
    //   8579: ldc_w 1619663090
    //   8582: ixor
    //   8583: ldc2_w 1402586148
    //   8586: l2i
    //   8587: ldc_w -624532824
    //   8590: ixor
    //   8591: ixor
    //   8592: lookupswitch default -> 13271, -1604982649 -> 8575, 1076889088 -> 8620
    //   8620: goto -> 8624
    //   8623: athrow
    //   8624: invokevirtual func_149211_e : ()D
    //   8627: goto -> 8631
    //   8630: athrow
    //   8631: getstatic Perryc.1 : I
    //   8634: ifeq -> 8648
    //   8637: ldc2_w -1311259735
    //   8640: l2i
    //   8641: ldc_w 867410709
    //   8644: ixor
    //   8645: goto -> 8656
    //   8648: ldc2_w 244764588
    //   8651: l2i
    //   8652: ldc_w 1908846970
    //   8655: ixor
    //   8656: ldc2_w 150239278
    //   8659: l2i
    //   8660: ldc_w 1310110413
    //   8663: ixor
    //   8664: ixor
    //   8665: lookupswitch default -> 8692, -997807521 -> 13203, 1680955400 -> 8648
    //   8692: aload_1
    //   8693: getstatic Perryc.0 : I
    //   8696: ifle -> 8710
    //   8699: ldc2_w 1288669790
    //   8702: l2i
    //   8703: ldc_w 2047163169
    //   8706: ixor
    //   8707: goto -> 8718
    //   8710: ldc2_w 1194783031
    //   8713: l2i
    //   8714: ldc_w -1346227924
    //   8717: ixor
    //   8718: ldc2_w 1816042843
    //   8721: l2i
    //   8722: ldc_w -481084294
    //   8725: ixor
    //   8726: ixor
    //   8727: lookupswitch default -> 13429, -1180233634 -> 8710, 1738105146 -> 8752
    //   8752: goto -> 8756
    //   8755: athrow
    //   8756: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   8759: goto -> 8763
    //   8762: athrow
    //   8763: checkcast net/minecraft/network/play/server/SPacketSoundEffect
    //   8766: getstatic Perryc.1 : I
    //   8769: ifeq -> 8783
    //   8772: ldc2_w -1549077070
    //   8775: l2i
    //   8776: ldc_w 2086817454
    //   8779: ixor
    //   8780: goto -> 8791
    //   8783: ldc2_w -1078374976
    //   8786: l2i
    //   8787: ldc_w -1604216091
    //   8790: ixor
    //   8791: ldc2_w 892467933
    //   8794: l2i
    //   8795: ldc_w 1734406773
    //   8798: ixor
    //   8799: ixor
    //   8800: lookupswitch default -> 8828, -1919306828 -> 13337, -417459872 -> 8783
    //   8828: goto -> 8832
    //   8831: athrow
    //   8832: invokevirtual func_149210_f : ()D
    //   8835: goto -> 8839
    //   8838: athrow
    //   8839: getstatic Perryc.1 : I
    //   8842: ifeq -> 8856
    //   8845: ldc2_w 1669827059
    //   8848: l2i
    //   8849: ldc_w -1201762285
    //   8852: ixor
    //   8853: goto -> 8864
    //   8856: ldc2_w -1149186108
    //   8859: l2i
    //   8860: ldc_w 827611735
    //   8863: ixor
    //   8864: ldc2_w 668898687
    //   8867: l2i
    //   8868: ldc_w -1146652041
    //   8871: ixor
    //   8872: ixor
    //   8873: lookupswitch default -> 13517, 380467867 -> 8900, 1201731304 -> 8856
    //   8900: goto -> 8904
    //   8903: athrow
    //   8904: invokevirtual func_70011_f : (DDD)D
    //   8907: goto -> 8911
    //   8910: athrow
    //   8911: getstatic Perryc.1 : I
    //   8914: ifeq -> 8928
    //   8917: ldc2_w 1236546957
    //   8920: l2i
    //   8921: ldc_w -1593441230
    //   8924: ixor
    //   8925: goto -> 8936
    //   8928: ldc2_w 710513058
    //   8931: l2i
    //   8932: ldc_w -1604806535
    //   8935: ixor
    //   8936: ldc2_w -1368710204
    //   8939: l2i
    //   8940: ldc_w -1920898547
    //   8943: ixor
    //   8944: ixor
    //   8945: lookupswitch default -> 13375, -1444200430 -> 8972, -883394442 -> 8928
    //   8972: aload_0
    //   8973: getstatic Perryc.c : I
    //   8976: iflt -> 8990
    //   8979: ldc2_w -1690515225
    //   8982: l2i
    //   8983: ldc_w 38253371
    //   8986: ixor
    //   8987: goto -> 8998
    //   8990: ldc2_w 1727176585
    //   8993: l2i
    //   8994: ldc_w -1784591554
    //   8997: ixor
    //   8998: ldc2_w 1623743748
    //   9001: l2i
    //   9002: ldc_w 1440215684
    //   9005: ixor
    //   9006: ixor
    //   9007: lookupswitch default -> 13291, -1402678180 -> 8990, -968066249 -> 9032
    //   9032: getfield breakRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9035: getstatic Perryc.0 : I
    //   9038: ifle -> 9052
    //   9041: ldc2_w -123670287
    //   9044: l2i
    //   9045: ldc_w -2091282013
    //   9048: ixor
    //   9049: goto -> 9060
    //   9052: ldc2_w -2112294141
    //   9055: l2i
    //   9056: ldc_w -1790767142
    //   9059: ixor
    //   9060: ldc2_w 435128283
    //   9063: l2i
    //   9064: ldc_w -288430281
    //   9067: ixor
    //   9068: ixor
    //   9069: lookupswitch default -> 9096, -1932000834 -> 13397, 1150144234 -> 9052
    //   9096: goto -> 9100
    //   9099: athrow
    //   9100: invokevirtual getValue : ()Ljava/lang/Object;
    //   9103: goto -> 9107
    //   9106: athrow
    //   9107: checkcast java/lang/Integer
    //   9110: getstatic Perryc.1 : I
    //   9113: ifeq -> 9127
    //   9116: ldc2_w -812424511
    //   9119: l2i
    //   9120: ldc_w 2059628502
    //   9123: ixor
    //   9124: goto -> 9135
    //   9127: ldc2_w 1077085531
    //   9130: l2i
    //   9131: ldc_w -247510023
    //   9134: ixor
    //   9135: ldc2_w 538911278
    //   9138: l2i
    //   9139: ldc_w 427472275
    //   9142: ixor
    //   9143: ixor
    //   9144: lookupswitch default -> 9172, -1942644054 -> 13303, 1723729971 -> 9127
    //   9172: goto -> 9176
    //   9175: athrow
    //   9176: invokevirtual intValue : ()I
    //   9179: goto -> 9183
    //   9182: athrow
    //   9183: i2d
    //   9184: dcmpg
    //   9185: ifgt -> 9199
    //   9188: ldc2_w -493940055
    //   9191: l2i
    //   9192: ldc_w -1464863940
    //   9195: ixor
    //   9196: goto -> 9207
    //   9199: ldc2_w -773435501
    //   9202: l2i
    //   9203: ldc_w -1681478139
    //   9206: ixor
    //   9207: ldc2_w 2042765546
    //   9210: l2i
    //   9211: ldc_w 919131322
    //   9214: ixor
    //   9215: ixor
    //   9216: tableswitch default -> 9188, 86644165 -> 9240, 86644166 -> 10367
    //   9240: getstatic Perryc.0 : I
    //   9243: ifle -> 9257
    //   9246: ldc2_w 17287300
    //   9249: l2i
    //   9250: ldc_w 255173324
    //   9253: ixor
    //   9254: goto -> 9265
    //   9257: ldc2_w 1188076957
    //   9260: l2i
    //   9261: ldc_w -242644559
    //   9264: ixor
    //   9265: ldc2_w -1469514858
    //   9268: l2i
    //   9269: ldc_w 1729708111
    //   9272: ixor
    //   9273: ixor
    //   9274: lookupswitch default -> 13209, -1052520047 -> 9257, 2015932405 -> 9300
    //   9300: aload_0
    //   9301: getstatic Perryc.c : I
    //   9304: iflt -> 9318
    //   9307: ldc2_w -1424718964
    //   9310: l2i
    //   9311: ldc_w -173764857
    //   9314: ixor
    //   9315: goto -> 9326
    //   9318: ldc2_w -1793113473
    //   9321: l2i
    //   9322: ldc_w -1579753268
    //   9325: ixor
    //   9326: ldc2_w -675732047
    //   9329: l2i
    //   9330: ldc_w 423286301
    //   9333: ixor
    //   9334: ixor
    //   9335: lookupswitch default -> 13383, -1875640537 -> 9318, -95792865 -> 9360
    //   9360: goto -> 9364
    //   9363: athrow
    //   9364: invokestatic currentTimeMillis : ()J
    //   9367: goto -> 9371
    //   9370: athrow
    //   9371: getstatic Perryc.0 : I
    //   9374: ifle -> 9388
    //   9377: ldc2_w -525602525
    //   9380: l2i
    //   9381: ldc_w 660510092
    //   9384: ixor
    //   9385: goto -> 9396
    //   9388: ldc2_w -1671456625
    //   9391: l2i
    //   9392: ldc_w -627492392
    //   9395: ixor
    //   9396: ldc2_w -805791399
    //   9399: l2i
    //   9400: ldc_w -1730728540
    //   9403: ixor
    //   9404: ixor
    //   9405: lookupswitch default -> 9432, -1864708014 -> 13479, 1869826805 -> 9388
    //   9432: aload_0
    //   9433: getstatic Perryc.1 : I
    //   9436: ifeq -> 9450
    //   9439: ldc2_w 1118451264
    //   9442: l2i
    //   9443: ldc_w 1897713839
    //   9446: ixor
    //   9447: goto -> 9458
    //   9450: ldc2_w -361342093
    //   9453: l2i
    //   9454: ldc_w 75576708
    //   9457: ixor
    //   9458: ldc2_w -262827448
    //   9461: l2i
    //   9462: ldc_w 298166291
    //   9465: ixor
    //   9466: ixor
    //   9467: lookupswitch default -> 13521, -769205068 -> 9450, 258430124 -> 9492
    //   9492: getfield start : J
    //   9495: lsub
    //   9496: getstatic Perryc.1 : I
    //   9499: ifeq -> 9513
    //   9502: ldc2_w -2124645778
    //   9505: l2i
    //   9506: ldc_w -708060267
    //   9509: ixor
    //   9510: goto -> 9521
    //   9513: ldc2_w -642905526
    //   9516: l2i
    //   9517: ldc_w -442249729
    //   9520: ixor
    //   9521: ldc2_w 1709840155
    //   9524: l2i
    //   9525: ldc_w 1809402307
    //   9528: ixor
    //   9529: ixor
    //   9530: lookupswitch default -> 13343, 842963309 -> 9556, 1520762659 -> 9513
    //   9556: putfield crystalLatency : J
    //   9559: getstatic Perryc.0 : I
    //   9562: ifle -> 9576
    //   9565: ldc2_w -1307587875
    //   9568: l2i
    //   9569: ldc_w 737593541
    //   9572: ixor
    //   9573: goto -> 9584
    //   9576: ldc2_w 1318298061
    //   9579: l2i
    //   9580: ldc_w -26508490
    //   9583: ixor
    //   9584: ldc2_w 1381578246
    //   9587: l2i
    //   9588: ldc_w 1401385109
    //   9591: ixor
    //   9592: ixor
    //   9593: lookupswitch default -> 13499, -1742257013 -> 9576, -1322883992 -> 9620
    //   9620: aload_0
    //   9621: getstatic Perryc.1 : I
    //   9624: ifeq -> 9638
    //   9627: ldc2_w -890985956
    //   9630: l2i
    //   9631: ldc_w -1253766201
    //   9634: ixor
    //   9635: goto -> 9646
    //   9638: ldc2_w -1496498113
    //   9641: l2i
    //   9642: ldc_w -737266684
    //   9645: ixor
    //   9646: ldc2_w 361798781
    //   9649: l2i
    //   9650: ldc_w -73353413
    //   9653: ixor
    //   9654: ixor
    //   9655: lookupswitch default -> 9680, -1852734819 -> 13473, 742916242 -> 9638
    //   9680: getfield confirmPacketBroke : Z
    //   9683: ifne -> 9697
    //   9686: ldc2_w 1369617150
    //   9689: l2i
    //   9690: ldc_w -1634971147
    //   9693: ixor
    //   9694: goto -> 9705
    //   9697: ldc2_w -156226022
    //   9700: l2i
    //   9701: ldc_w 966708498
    //   9704: ixor
    //   9705: ldc2_w 1029371311
    //   9708: l2i
    //   9709: ldc_w -2130721711
    //   9712: ixor
    //   9713: ixor
    //   9714: tableswitch default -> 9686, 1921766133 -> 9736, 1921766134 -> 10367
    //   9736: getstatic Perryc.0 : I
    //   9739: ifle -> 9753
    //   9742: ldc2_w -1216218531
    //   9745: l2i
    //   9746: ldc_w -1709831638
    //   9749: ixor
    //   9750: goto -> 9761
    //   9753: ldc2_w 1223611703
    //   9756: l2i
    //   9757: ldc_w 2084509989
    //   9760: ixor
    //   9761: ldc2_w 747954732
    //   9764: l2i
    //   9765: ldc_w 938406284
    //   9768: ixor
    //   9769: ixor
    //   9770: lookupswitch default -> 9796, -226197125 -> 9753, 921560023 -> 13213
    //   9796: aload_0
    //   9797: getstatic Perryc.0 : I
    //   9800: ifle -> 9814
    //   9803: ldc2_w -260937729
    //   9806: l2i
    //   9807: ldc_w 1501166790
    //   9810: ixor
    //   9811: goto -> 9822
    //   9814: ldc2_w 1505981492
    //   9817: l2i
    //   9818: ldc_w 297597282
    //   9821: ixor
    //   9822: ldc2_w -917673569
    //   9825: l2i
    //   9826: ldc_w 1561885469
    //   9829: ixor
    //   9830: ixor
    //   9831: lookupswitch default -> 9856, -218019580 -> 9814, 1029605819 -> 13333
    //   9856: getfield hasPacketBroke : Z
    //   9859: ifeq -> 9873
    //   9862: ldc2_w 601645446
    //   9865: l2i
    //   9866: ldc_w 437319974
    //   9869: ixor
    //   9870: goto -> 9881
    //   9873: ldc2_w -625674838
    //   9876: l2i
    //   9877: ldc_w -478647027
    //   9880: ixor
    //   9881: ldc2_w -1242397595
    //   9884: l2i
    //   9885: ldc_w 843775806
    //   9888: ixor
    //   9889: ixor
    //   9890: tableswitch default -> 9862, -1099635717 -> 9912, -1099635716 -> 10367
    //   9912: getstatic Perryc.c : I
    //   9915: iflt -> 9929
    //   9918: ldc2_w 984464466
    //   9921: l2i
    //   9922: ldc_w -20865651
    //   9925: ixor
    //   9926: goto -> 9937
    //   9929: ldc2_w -2010396152
    //   9932: l2i
    //   9933: ldc_w 230074376
    //   9936: ixor
    //   9937: ldc2_w -817531
    //   9940: l2i
    //   9941: ldc_w -1542402275
    //   9944: ixor
    //   9945: ixor
    //   9946: lookupswitch default -> 9972, -1617991609 -> 13483, -867922420 -> 9929
    //   9972: aload_0
    //   9973: getstatic Perryc.0 : I
    //   9976: ifle -> 9990
    //   9979: ldc2_w 886731563
    //   9982: l2i
    //   9983: ldc_w -423306995
    //   9986: ixor
    //   9987: goto -> 9998
    //   9990: ldc2_w 275693626
    //   9993: l2i
    //   9994: ldc_w 682583403
    //   9997: ixor
    //   9998: ldc2_w -592205429
    //   10001: l2i
    //   10002: ldc_w -613648999
    //   10005: ixor
    //   10006: ixor
    //   10007: lookupswitch default -> 10032, -708741580 -> 13481, 1619429466 -> 9990
    //   10032: getfield packetSafe : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10035: getstatic Perryc.c : I
    //   10038: iflt -> 10052
    //   10041: ldc2_w -1511149629
    //   10044: l2i
    //   10045: ldc_w 1793994760
    //   10048: ixor
    //   10049: goto -> 10060
    //   10052: ldc2_w 658697556
    //   10055: l2i
    //   10056: ldc_w -1413660003
    //   10059: ixor
    //   10060: ldc2_w 1058157136
    //   10063: l2i
    //   10064: ldc_w -913017571
    //   10067: ixor
    //   10068: ixor
    //   10069: lookupswitch default -> 13317, 965073030 -> 10052, 2054809732 -> 10096
    //   10096: goto -> 10100
    //   10099: athrow
    //   10100: invokevirtual getValue : ()Ljava/lang/Object;
    //   10103: goto -> 10107
    //   10106: athrow
    //   10107: checkcast java/lang/Boolean
    //   10110: getstatic Perryc.0 : I
    //   10113: ifle -> 10127
    //   10116: ldc2_w 1862311321
    //   10119: l2i
    //   10120: ldc_w 1037855114
    //   10123: ixor
    //   10124: goto -> 10135
    //   10127: ldc2_w -1142766458
    //   10130: l2i
    //   10131: ldc_w 3714390
    //   10134: ixor
    //   10135: ldc2_w 1039309033
    //   10138: l2i
    //   10139: ldc_w 1816318309
    //   10142: ixor
    //   10143: ixor
    //   10144: lookupswitch default -> 13471, -362143652 -> 10172, 57458079 -> 10127
    //   10172: goto -> 10176
    //   10175: athrow
    //   10176: invokevirtual booleanValue : ()Z
    //   10179: goto -> 10183
    //   10182: athrow
    //   10183: ifeq -> 10197
    //   10186: ldc2_w -1775733286
    //   10189: l2i
    //   10190: ldc_w -1442234077
    //   10193: ixor
    //   10194: goto -> 10205
    //   10197: ldc2_w -1744677098
    //   10200: l2i
    //   10201: ldc_w -1541184530
    //   10204: ixor
    //   10205: ldc2_w 314961963
    //   10208: l2i
    //   10209: ldc_w -1236095694
    //   10212: ixor
    //   10213: ixor
    //   10214: tableswitch default -> 10186, -1732875808 -> 10236, -1732875807 -> 10367
    //   10236: getstatic Perryc.1 : I
    //   10239: ifeq -> 10253
    //   10242: ldc2_w -431325766
    //   10245: l2i
    //   10246: ldc_w -1266158402
    //   10249: ixor
    //   10250: goto -> 10261
    //   10253: ldc2_w -1937560918
    //   10256: l2i
    //   10257: ldc_w 974858810
    //   10260: ixor
    //   10261: ldc2_w 55650548
    //   10264: l2i
    //   10265: ldc_w 622290332
    //   10268: ixor
    //   10269: ixor
    //   10270: lookupswitch default -> 13329, -1864479240 -> 10296, 1955316844 -> 10253
    //   10296: aload_0
    //   10297: ldc2_w -1439879360
    //   10300: l2i
    //   10301: ldc_w -1439879359
    //   10304: ixor
    //   10305: getstatic Perryc.1 : I
    //   10308: ifeq -> 10322
    //   10311: ldc2_w 1317673017
    //   10314: l2i
    //   10315: ldc_w 1260985672
    //   10318: ixor
    //   10319: goto -> 10330
    //   10322: ldc2_w 634866230
    //   10325: l2i
    //   10326: ldc_w 2052930196
    //   10329: ixor
    //   10330: ldc2_w -1768001482
    //   10333: l2i
    //   10334: ldc_w 1789760458
    //   10337: ixor
    //   10338: ixor
    //   10339: lookupswitch default -> 13487, -1548119202 -> 10364, -107944307 -> 10322
    //   10364: putfield confirmPacketBroke : Z
    //   10367: goto -> 7645
    //   10370: getstatic Perryc.1 : I
    //   10373: ifeq -> 10387
    //   10376: ldc2_w 172038083
    //   10379: l2i
    //   10380: ldc_w -1876980682
    //   10383: ixor
    //   10384: goto -> 10395
    //   10387: ldc2_w -1851987880
    //   10390: l2i
    //   10391: ldc_w -687731035
    //   10394: ixor
    //   10395: ldc2_w 1025776275
    //   10398: l2i
    //   10399: ldc_w 1856647038
    //   10402: ixor
    //   10403: ixor
    //   10404: lookupswitch default -> 13189, -909070824 -> 10387, 353424144 -> 10432
    //   10432: aload_1
    //   10433: getstatic Perryc.0 : I
    //   10436: ifle -> 10450
    //   10439: ldc2_w 219880643
    //   10442: l2i
    //   10443: ldc_w 1549391874
    //   10446: ixor
    //   10447: goto -> 10458
    //   10450: ldc2_w 1693135272
    //   10453: l2i
    //   10454: ldc_w 708029875
    //   10457: ixor
    //   10458: ldc2_w -892031155
    //   10461: l2i
    //   10462: ldc_w 1459051207
    //   10465: ixor
    //   10466: ixor
    //   10467: lookupswitch default -> 13433, -849268405 -> 10450, -755275375 -> 10492
    //   10492: goto -> 10496
    //   10495: athrow
    //   10496: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   10499: goto -> 10503
    //   10502: athrow
    //   10503: instanceof net/minecraft/network/play/server/SPacketExplosion
    //   10506: ifeq -> 10520
    //   10509: ldc2_w 580640699
    //   10512: l2i
    //   10513: ldc_w 2131383234
    //   10516: ixor
    //   10517: goto -> 10528
    //   10520: ldc2_w 400231229
    //   10523: l2i
    //   10524: ldc_w 1246398275
    //   10527: ixor
    //   10528: ldc2_w -760888146
    //   10531: l2i
    //   10532: ldc_w -193070964
    //   10535: ixor
    //   10536: ixor
    //   10537: tableswitch default -> 10509, 2068426843 -> 10560, 2068426844 -> 13166
    //   10560: getstatic Perryc.1 : I
    //   10563: ifeq -> 10577
    //   10566: ldc2_w -1178805447
    //   10569: l2i
    //   10570: ldc_w 178063580
    //   10573: ixor
    //   10574: goto -> 10585
    //   10577: ldc2_w 873459443
    //   10580: l2i
    //   10581: ldc_w -1846420128
    //   10584: ixor
    //   10585: ldc2_w 652610657
    //   10588: l2i
    //   10589: ldc_w 830075644
    //   10592: ixor
    //   10593: ixor
    //   10594: lookupswitch default -> 10620, -1531040392 -> 13493, 457867727 -> 10577
    //   10620: aload_1
    //   10621: getstatic Perryc.1 : I
    //   10624: ifeq -> 10638
    //   10627: ldc2_w 1897279685
    //   10630: l2i
    //   10631: ldc_w 265271437
    //   10634: ixor
    //   10635: goto -> 10646
    //   10638: ldc2_w -478369375
    //   10641: l2i
    //   10642: ldc_w -826681946
    //   10645: ixor
    //   10646: ldc2_w -1980828826
    //   10649: l2i
    //   10650: ldc_w -1006960879
    //   10653: ixor
    //   10654: ixor
    //   10655: lookupswitch default -> 13275, 885883967 -> 10638, 1741779056 -> 10680
    //   10680: goto -> 10684
    //   10683: athrow
    //   10684: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   10687: goto -> 10691
    //   10690: athrow
    //   10691: checkcast net/minecraft/network/play/server/SPacketExplosion
    //   10694: getstatic Perryc.1 : I
    //   10697: ifeq -> 10711
    //   10700: ldc2_w 1300579854
    //   10703: l2i
    //   10704: ldc_w 114680425
    //   10707: ixor
    //   10708: goto -> 10719
    //   10711: ldc2_w 1420878746
    //   10714: l2i
    //   10715: ldc_w -1637508403
    //   10718: ixor
    //   10719: ldc2_w -1246178067
    //   10722: l2i
    //   10723: ldc_w 449995630
    //   10726: ixor
    //   10727: ixor
    //   10728: lookupswitch default -> 13431, -465955868 -> 10711, 1707069140 -> 10756
    //   10756: astore_3
    //   10757: new net/minecraft/util/math/BlockPos
    //   10760: dup
    //   10761: getstatic Perryc.1 : I
    //   10764: ifeq -> 10778
    //   10767: ldc2_w -367123339
    //   10770: l2i
    //   10771: ldc_w -1662354037
    //   10774: ixor
    //   10775: goto -> 10786
    //   10778: ldc2_w 896971075
    //   10781: l2i
    //   10782: ldc_w 1257969428
    //   10785: ixor
    //   10786: ldc2_w -1042665753
    //   10789: l2i
    //   10790: ldc_w 489824589
    //   10793: ixor
    //   10794: ixor
    //   10795: lookupswitch default -> 13235, -1553618435 -> 10820, -1440983468 -> 10778
    //   10820: aload_3
    //   10821: getstatic Perryc.0 : I
    //   10824: ifle -> 10838
    //   10827: ldc2_w -1709346985
    //   10830: l2i
    //   10831: ldc_w 64184988
    //   10834: ixor
    //   10835: goto -> 10846
    //   10838: ldc2_w 1066602060
    //   10841: l2i
    //   10842: ldc_w -647944307
    //   10845: ixor
    //   10846: ldc2_w -199971736
    //   10849: l2i
    //   10850: ldc_w -1956559989
    //   10853: ixor
    //   10854: ixor
    //   10855: lookupswitch default -> 10880, -423894488 -> 13319, 1870693262 -> 10838
    //   10880: goto -> 10884
    //   10883: athrow
    //   10884: invokevirtual func_149148_f : ()D
    //   10887: goto -> 10891
    //   10890: athrow
    //   10891: getstatic Perryc.0 : I
    //   10894: ifle -> 10908
    //   10897: ldc2_w 1639156905
    //   10900: l2i
    //   10901: ldc_w 1746813332
    //   10904: ixor
    //   10905: goto -> 10916
    //   10908: ldc2_w -2080001233
    //   10911: l2i
    //   10912: ldc_w 621664032
    //   10915: ixor
    //   10916: ldc2_w 1867633250
    //   10919: l2i
    //   10920: ldc_w 632912857
    //   10923: ixor
    //   10924: ixor
    //   10925: lookupswitch default -> 10952, 1128621190 -> 13199, 1858214236 -> 10908
    //   10952: goto -> 10956
    //   10955: athrow
    //   10956: invokestatic floor : (D)D
    //   10959: goto -> 10963
    //   10962: athrow
    //   10963: getstatic Perryc.0 : I
    //   10966: ifle -> 10980
    //   10969: ldc2_w 907765612
    //   10972: l2i
    //   10973: ldc_w 412095225
    //   10976: ixor
    //   10977: goto -> 10988
    //   10980: ldc2_w 325488503
    //   10983: l2i
    //   10984: ldc_w 1308109545
    //   10987: ixor
    //   10988: ldc2_w 702434809
    //   10991: l2i
    //   10992: ldc_w -1554390925
    //   10995: ixor
    //   10996: ixor
    //   10997: lookupswitch default -> 13263, -1542662113 -> 10980, -736557036 -> 11024
    //   11024: aload_3
    //   11025: getstatic Perryc.0 : I
    //   11028: ifle -> 11042
    //   11031: ldc2_w -1426378419
    //   11034: l2i
    //   11035: ldc_w -747396438
    //   11038: ixor
    //   11039: goto -> 11050
    //   11042: ldc2_w -1269058343
    //   11045: l2i
    //   11046: ldc_w 567569103
    //   11049: ixor
    //   11050: ldc2_w 1108493479
    //   11053: l2i
    //   11054: ldc_w 444805189
    //   11057: ixor
    //   11058: ixor
    //   11059: lookupswitch default -> 13205, -853628172 -> 11084, 555345669 -> 11042
    //   11084: goto -> 11088
    //   11087: athrow
    //   11088: invokevirtual func_149143_g : ()D
    //   11091: goto -> 11095
    //   11094: athrow
    //   11095: getstatic Perryc.1 : I
    //   11098: ifeq -> 11112
    //   11101: ldc2_w 1713425042
    //   11104: l2i
    //   11105: ldc_w -1751418218
    //   11108: ixor
    //   11109: goto -> 11120
    //   11112: ldc2_w 2127547362
    //   11115: l2i
    //   11116: ldc_w -410640844
    //   11119: ixor
    //   11120: ldc2_w -1544159327
    //   11123: l2i
    //   11124: ldc_w -355546264
    //   11127: ixor
    //   11128: ixor
    //   11129: lookupswitch default -> 11156, -1945257197 -> 11112, -1199536947 -> 13331
    //   11156: goto -> 11160
    //   11159: athrow
    //   11160: invokestatic floor : (D)D
    //   11163: goto -> 11167
    //   11166: athrow
    //   11167: getstatic Perryc.c : I
    //   11170: iflt -> 11184
    //   11173: ldc2_w -1118174055
    //   11176: l2i
    //   11177: ldc_w 1710090445
    //   11180: ixor
    //   11181: goto -> 11192
    //   11184: ldc2_w 216694708
    //   11187: l2i
    //   11188: ldc_w -782663746
    //   11191: ixor
    //   11192: ldc2_w 1213971846
    //   11195: l2i
    //   11196: ldc_w -289410679
    //   11199: ixor
    //   11200: ixor
    //   11201: lookupswitch default -> 11228, 1684769051 -> 11184, 2119409755 -> 13183
    //   11228: aload_3
    //   11229: getstatic Perryc.1 : I
    //   11232: ifeq -> 11246
    //   11235: ldc2_w 1201118968
    //   11238: l2i
    //   11239: ldc_w -1319672293
    //   11242: ixor
    //   11243: goto -> 11254
    //   11246: ldc2_w -1260042027
    //   11249: l2i
    //   11250: ldc_w 327396659
    //   11253: ixor
    //   11254: ldc2_w -1787359109
    //   11257: l2i
    //   11258: ldc_w -1567794861
    //   11261: ixor
    //   11262: ixor
    //   11263: lookupswitch default -> 11288, -1813667126 -> 11246, -1053118005 -> 13387
    //   11288: goto -> 11292
    //   11291: athrow
    //   11292: invokevirtual func_149145_h : ()D
    //   11295: goto -> 11299
    //   11298: athrow
    //   11299: getstatic Perryc.0 : I
    //   11302: ifle -> 11316
    //   11305: ldc2_w -1462611555
    //   11308: l2i
    //   11309: ldc_w 777312551
    //   11312: ixor
    //   11313: goto -> 11324
    //   11316: ldc2_w 1854834667
    //   11319: l2i
    //   11320: ldc_w -1767273765
    //   11323: ixor
    //   11324: ldc2_w -1700736690
    //   11327: l2i
    //   11328: ldc_w -137351018
    //   11331: ixor
    //   11332: ixor
    //   11333: lookupswitch default -> 13293, -1789399832 -> 11360, -336172702 -> 11316
    //   11360: goto -> 11364
    //   11363: athrow
    //   11364: invokestatic floor : (D)D
    //   11367: goto -> 11371
    //   11370: athrow
    //   11371: getstatic Perryc.c : I
    //   11374: iflt -> 11388
    //   11377: ldc2_w -901755845
    //   11380: l2i
    //   11381: ldc_w 619494631
    //   11384: ixor
    //   11385: goto -> 11396
    //   11388: ldc2_w -1259274444
    //   11391: l2i
    //   11392: ldc_w -1189299346
    //   11395: ixor
    //   11396: ldc2_w -2020516191
    //   11399: l2i
    //   11400: ldc_w -1644759781
    //   11403: ixor
    //   11404: ixor
    //   11405: lookupswitch default -> 13357, -187999386 -> 11388, 395046880 -> 11432
    //   11432: goto -> 11436
    //   11435: athrow
    //   11436: invokespecial <init> : (DDD)V
    //   11439: goto -> 11443
    //   11442: athrow
    //   11443: getstatic Perryc.1 : I
    //   11446: ifeq -> 11460
    //   11449: ldc2_w 509612540
    //   11452: l2i
    //   11453: ldc_w -268515393
    //   11456: ixor
    //   11457: goto -> 11468
    //   11460: ldc2_w -1054214420
    //   11463: l2i
    //   11464: ldc_w -1031236513
    //   11467: ixor
    //   11468: ldc2_w 694564364
    //   11471: l2i
    //   11472: ldc_w 269177103
    //   11475: ixor
    //   11476: ixor
    //   11477: lookupswitch default -> 13321, -923553472 -> 11460, 986449328 -> 11504
    //   11504: goto -> 11508
    //   11507: athrow
    //   11508: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   11511: goto -> 11515
    //   11514: athrow
    //   11515: getstatic Perryc.0 : I
    //   11518: ifle -> 11532
    //   11521: ldc2_w 1808079648
    //   11524: l2i
    //   11525: ldc_w -1334563159
    //   11528: ixor
    //   11529: goto -> 11540
    //   11532: ldc2_w 1336678031
    //   11535: l2i
    //   11536: ldc_w 129477361
    //   11539: ixor
    //   11540: ldc2_w -1286831084
    //   11543: l2i
    //   11544: ldc_w 572311468
    //   11547: ixor
    //   11548: ixor
    //   11549: lookupswitch default -> 13457, -649330746 -> 11576, 1256289841 -> 11532
    //   11576: astore #4
    //   11578: getstatic Perryc.1 : I
    //   11581: ifeq -> 11595
    //   11584: ldc2_w -1028035274
    //   11587: l2i
    //   11588: ldc_w -1688519002
    //   11591: ixor
    //   11592: goto -> 11603
    //   11595: ldc2_w -906481116
    //   11598: l2i
    //   11599: ldc_w -429654000
    //   11602: ixor
    //   11603: ldc2_w -1864834506
    //   11606: l2i
    //   11607: ldc_w -1493144688
    //   11610: ixor
    //   11611: ixor
    //   11612: lookupswitch default -> 13187, 407157650 -> 11640, 1849350710 -> 11595
    //   11640: aload_0
    //   11641: getstatic Perryc.c : I
    //   11644: iflt -> 11658
    //   11647: ldc2_w -1185046471
    //   11650: l2i
    //   11651: ldc_w -1080758610
    //   11654: ixor
    //   11655: goto -> 11666
    //   11658: ldc2_w -2081087655
    //   11661: l2i
    //   11662: ldc_w -114610454
    //   11665: ixor
    //   11666: ldc2_w -222596655
    //   11669: l2i
    //   11670: ldc_w 1675794068
    //   11673: ixor
    //   11674: ixor
    //   11675: lookupswitch default -> 13507, -1752127022 -> 11658, -343419146 -> 11700
    //   11700: getfield predictBlock : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11703: getstatic Perryc.0 : I
    //   11706: ifle -> 11720
    //   11709: ldc2_w 338274177
    //   11712: l2i
    //   11713: ldc_w 1517865065
    //   11716: ixor
    //   11717: goto -> 11728
    //   11720: ldc2_w 266423940
    //   11723: l2i
    //   11724: ldc_w 991518703
    //   11727: ixor
    //   11728: ldc2_w -2080394770
    //   11731: l2i
    //   11732: ldc_w 377454520
    //   11735: ixor
    //   11736: ixor
    //   11737: lookupswitch default -> 11764, -1248243621 -> 11720, -607018562 -> 13389
    //   11764: goto -> 11768
    //   11767: athrow
    //   11768: invokevirtual getValue : ()Ljava/lang/Object;
    //   11771: goto -> 11775
    //   11774: athrow
    //   11775: checkcast java/lang/Boolean
    //   11778: getstatic Perryc.0 : I
    //   11781: ifle -> 11795
    //   11784: ldc2_w 1515926962
    //   11787: l2i
    //   11788: ldc_w -1344061479
    //   11791: ixor
    //   11792: goto -> 11803
    //   11795: ldc2_w 1527840556
    //   11798: l2i
    //   11799: ldc_w 305682250
    //   11802: ixor
    //   11803: ldc2_w 1494666364
    //   11806: l2i
    //   11807: ldc_w -761820635
    //   11810: ixor
    //   11811: ixor
    //   11812: lookupswitch default -> 13283, -1029050817 -> 11840, 2117684274 -> 11795
    //   11840: goto -> 11844
    //   11843: athrow
    //   11844: invokevirtual booleanValue : ()Z
    //   11847: goto -> 11851
    //   11850: athrow
    //   11851: ifeq -> 11865
    //   11854: ldc2_w -1629139
    //   11857: l2i
    //   11858: ldc_w 447525532
    //   11861: ixor
    //   11862: goto -> 11873
    //   11865: ldc2_w -1781346925
    //   11868: l2i
    //   11869: ldc_w 1889098529
    //   11872: ixor
    //   11873: ldc2_w 1456013804
    //   11876: l2i
    //   11877: ldc_w -2062107956
    //   11880: ixor
    //   11881: ixor
    //   11882: tableswitch default -> 11854, 915680657 -> 11904, 915680658 -> 13166
    //   11904: getstatic Perryc.1 : I
    //   11907: ifeq -> 11921
    //   11910: ldc2_w 1445810639
    //   11913: l2i
    //   11914: ldc_w 5692018
    //   11917: ixor
    //   11918: goto -> 11929
    //   11921: ldc2_w 2021468395
    //   11924: l2i
    //   11925: ldc_w -932824684
    //   11928: ixor
    //   11929: ldc2_w 446912480
    //   11932: l2i
    //   11933: ldc_w 632420631
    //   11936: ixor
    //   11937: ixor
    //   11938: lookupswitch default -> 13405, -1895186552 -> 11964, 1768498506 -> 11921
    //   11964: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   11967: getstatic Perryc.1 : I
    //   11970: ifeq -> 11984
    //   11973: ldc2_w -1832511363
    //   11976: l2i
    //   11977: ldc_w 1820478852
    //   11980: ixor
    //   11981: goto -> 11992
    //   11984: ldc2_w -1077052866
    //   11987: l2i
    //   11988: ldc_w -268581012
    //   11991: ixor
    //   11992: ldc2_w -845479352
    //   11995: l2i
    //   11996: ldc_w 426878187
    //   11999: ixor
    //   12000: ixor
    //   12001: lookupswitch default -> 13519, -2066080783 -> 12028, 716108634 -> 11984
    //   12028: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   12031: getstatic Perryc.0 : I
    //   12034: ifle -> 12048
    //   12037: ldc2_w 2085647986
    //   12040: l2i
    //   12041: ldc_w 382841404
    //   12044: ixor
    //   12045: goto -> 12056
    //   12048: ldc2_w -566647158
    //   12051: l2i
    //   12052: ldc_w -195429288
    //   12055: ixor
    //   12056: ldc2_w 1251515000
    //   12059: l2i
    //   12060: ldc_w -1421577128
    //   12063: ixor
    //   12064: ixor
    //   12065: lookupswitch default -> 13377, -1956828562 -> 12048, -876825358 -> 12092
    //   12092: getfield field_73010_i : Ljava/util/List;
    //   12095: getstatic Perryc.0 : I
    //   12098: ifle -> 12112
    //   12101: ldc2_w 1900611745
    //   12104: l2i
    //   12105: ldc_w 1106541278
    //   12108: ixor
    //   12109: goto -> 12120
    //   12112: ldc2_w 1667871219
    //   12115: l2i
    //   12116: ldc_w 156250726
    //   12119: ixor
    //   12120: ldc2_w 1731462212
    //   12123: l2i
    //   12124: ldc_w -1968608554
    //   12127: ixor
    //   12128: ixor
    //   12129: lookupswitch default -> 13237, -2019234553 -> 12156, -585098003 -> 12112
    //   12156: goto -> 12160
    //   12159: athrow
    //   12160: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12165: goto -> 12169
    //   12168: athrow
    //   12169: getstatic Perryc.c : I
    //   12172: iflt -> 12186
    //   12175: ldc2_w 2070995127
    //   12178: l2i
    //   12179: ldc_w 79692397
    //   12182: ixor
    //   12183: goto -> 12194
    //   12186: ldc2_w -1718772791
    //   12189: l2i
    //   12190: ldc_w -1002130988
    //   12193: ixor
    //   12194: ldc2_w -1508314328
    //   12197: l2i
    //   12198: ldc_w -726035738
    //   12201: ixor
    //   12202: ixor
    //   12203: lookupswitch default -> 13421, 219251476 -> 12186, 795364307 -> 12228
    //   12228: astore #5
    //   12230: getstatic Perryc.c : I
    //   12233: iflt -> 12247
    //   12236: ldc2_w 1896940173
    //   12239: l2i
    //   12240: ldc_w 1493620320
    //   12243: ixor
    //   12244: goto -> 12255
    //   12247: ldc2_w 1671775361
    //   12250: l2i
    //   12251: ldc_w 634732484
    //   12254: ixor
    //   12255: ldc2_w -934718420
    //   12258: l2i
    //   12259: ldc_w -35512452
    //   12262: ixor
    //   12263: ixor
    //   12264: lookupswitch default -> 13167, 498900925 -> 12247, 1943744533 -> 12292
    //   12292: aload #5
    //   12294: getstatic Perryc.c : I
    //   12297: iflt -> 12311
    //   12300: ldc2_w -1916809354
    //   12303: l2i
    //   12304: ldc_w -970821103
    //   12307: ixor
    //   12308: goto -> 12319
    //   12311: ldc2_w 1112235041
    //   12314: l2i
    //   12315: ldc_w -728548435
    //   12318: ixor
    //   12319: ldc2_w 1836302636
    //   12322: l2i
    //   12323: ldc_w 1541664052
    //   12326: ixor
    //   12327: ixor
    //   12328: lookupswitch default -> 13217, -1605874796 -> 12356, 2098041215 -> 12311
    //   12356: goto -> 12360
    //   12359: athrow
    //   12360: invokeinterface hasNext : ()Z
    //   12365: goto -> 12369
    //   12368: athrow
    //   12369: ifeq -> 12383
    //   12372: ldc2_w -215670954
    //   12375: l2i
    //   12376: ldc_w 1082252649
    //   12379: ixor
    //   12380: goto -> 12391
    //   12383: ldc2_w -1364472308
    //   12386: l2i
    //   12387: ldc_w 487525426
    //   12390: ixor
    //   12391: ldc2_w -667255237
    //   12394: l2i
    //   12395: ldc_w -1635949114
    //   12398: ixor
    //   12399: ixor
    //   12400: tableswitch default -> 12372, -169616958 -> 12424, -169616957 -> 13166
    //   12424: getstatic Perryc.0 : I
    //   12427: ifle -> 12441
    //   12430: ldc2_w 1223074328
    //   12433: l2i
    //   12434: ldc_w -833788110
    //   12437: ixor
    //   12438: goto -> 12449
    //   12441: ldc2_w -314438625
    //   12444: l2i
    //   12445: ldc_w -199345082
    //   12448: ixor
    //   12449: ldc2_w -823258616
    //   12452: l2i
    //   12453: ldc_w 1757998259
    //   12456: ixor
    //   12457: ixor
    //   12458: lookupswitch default -> 13223, -1082470686 -> 12484, 546126737 -> 12441
    //   12484: aload #5
    //   12486: getstatic Perryc.c : I
    //   12489: iflt -> 12503
    //   12492: ldc2_w -472800345
    //   12495: l2i
    //   12496: ldc_w 1596189204
    //   12499: ixor
    //   12500: goto -> 12511
    //   12503: ldc2_w 572186957
    //   12506: l2i
    //   12507: ldc_w -1833344634
    //   12510: ixor
    //   12511: ldc2_w 1084031839
    //   12514: l2i
    //   12515: ldc_w -883530382
    //   12518: ixor
    //   12519: ixor
    //   12520: lookupswitch default -> 13393, 926494622 -> 12503, 996730598 -> 12548
    //   12548: goto -> 12552
    //   12551: athrow
    //   12552: invokeinterface next : ()Ljava/lang/Object;
    //   12557: goto -> 12561
    //   12560: athrow
    //   12561: checkcast net/minecraft/entity/player/EntityPlayer
    //   12564: getstatic Perryc.0 : I
    //   12567: ifle -> 12581
    //   12570: ldc2_w -1146007718
    //   12573: l2i
    //   12574: ldc_w 1268979038
    //   12577: ixor
    //   12578: goto -> 12589
    //   12581: ldc2_w 426669898
    //   12584: l2i
    //   12585: ldc_w 620926989
    //   12588: ixor
    //   12589: ldc2_w -83701708
    //   12592: l2i
    //   12593: ldc_w -1184435690
    //   12596: ixor
    //   12597: ixor
    //   12598: lookupswitch default -> 12624, -1300858842 -> 13465, 1568920006 -> 12581
    //   12624: astore #6
    //   12626: getstatic Perryc.1 : I
    //   12629: ifeq -> 12643
    //   12632: ldc2_w 2046931545
    //   12635: l2i
    //   12636: ldc_w -1415370634
    //   12639: ixor
    //   12640: goto -> 12651
    //   12643: ldc2_w -1703367983
    //   12646: l2i
    //   12647: ldc_w -414724002
    //   12650: ixor
    //   12651: ldc2_w 709908335
    //   12654: l2i
    //   12655: ldc_w -909994102
    //   12658: ixor
    //   12659: ixor
    //   12660: lookupswitch default -> 12688, 842029770 -> 13227, 1970793539 -> 12643
    //   12688: aload_0
    //   12689: getstatic Perryc.1 : I
    //   12692: ifeq -> 12706
    //   12695: ldc2_w -54933133
    //   12698: l2i
    //   12699: ldc_w -172647920
    //   12702: ixor
    //   12703: goto -> 12714
    //   12706: ldc2_w -1113832370
    //   12709: l2i
    //   12710: ldc_w -1911740245
    //   12713: ixor
    //   12714: ldc2_w 523544987
    //   12717: l2i
    //   12718: ldc_w -404587308
    //   12721: ixor
    //   12722: ixor
    //   12723: lookupswitch default -> 13267, -884491862 -> 12748, -237337044 -> 12706
    //   12748: aload #4
    //   12750: getstatic Perryc.c : I
    //   12753: iflt -> 12767
    //   12756: ldc2_w -467122160
    //   12759: l2i
    //   12760: ldc_w 2094291281
    //   12763: ixor
    //   12764: goto -> 12775
    //   12767: ldc2_w 2066800477
    //   12770: l2i
    //   12771: ldc_w -65157299
    //   12774: ixor
    //   12775: ldc2_w 1441206805
    //   12778: l2i
    //   12779: ldc_w 1636508289
    //   12782: ixor
    //   12783: ixor
    //   12784: lookupswitch default -> 13505, -1399840299 -> 12767, -1287575420 -> 12812
    //   12812: aload #6
    //   12814: getstatic Perryc.c : I
    //   12817: iflt -> 12831
    //   12820: ldc2_w 744484850
    //   12823: l2i
    //   12824: ldc_w 1578258233
    //   12827: ixor
    //   12828: goto -> 12839
    //   12831: ldc2_w -1798664015
    //   12834: l2i
    //   12835: ldc_w 1610406881
    //   12838: ixor
    //   12839: ldc2_w 2074506057
    //   12842: l2i
    //   12843: ldc_w 1182380012
    //   12846: ixor
    //   12847: ixor
    //   12848: lookupswitch default -> 13497, -152463371 -> 12876, 1335000174 -> 12831
    //   12876: goto -> 12880
    //   12879: athrow
    //   12880: invokespecial isBlockGood : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)D
    //   12883: goto -> 12887
    //   12886: athrow
    //   12887: ldc2_w 9.467779179635314E307
    //   12890: invokestatic doubleToLongBits : (D)J
    //   12893: ldc2_w 9214604993840508521
    //   12896: lxor
    //   12897: invokestatic longBitsToDouble : (J)D
    //   12900: dcmpl
    //   12901: ifle -> 12915
    //   12904: ldc2_w 1840034148
    //   12907: l2i
    //   12908: ldc_w 271421633
    //   12911: ixor
    //   12912: goto -> 12923
    //   12915: ldc2_w -1551134614
    //   12918: l2i
    //   12919: ldc_w -569724466
    //   12922: ixor
    //   12923: ldc2_w 1595554856
    //   12926: l2i
    //   12927: ldc_w 720284129
    //   12930: ixor
    //   12931: ixor
    //   12932: tableswitch default -> 12904, 141931628 -> 12956, 141931629 -> 13163
    //   12956: getstatic Perryc.1 : I
    //   12959: ifeq -> 12973
    //   12962: ldc2_w -1884369552
    //   12965: l2i
    //   12966: ldc_w 1729097143
    //   12969: ixor
    //   12970: goto -> 12981
    //   12973: ldc2_w -710145254
    //   12976: l2i
    //   12977: ldc_w -1354289554
    //   12980: ixor
    //   12981: ldc2_w 426991363
    //   12984: l2i
    //   12985: ldc_w -1810039247
    //   12988: ixor
    //   12989: ixor
    //   12990: lookupswitch default -> 13455, -142310330 -> 13016, 1708032501 -> 12973
    //   13016: aload #4
    //   13018: getstatic Perryc.0 : I
    //   13021: ifle -> 13035
    //   13024: ldc2_w 604004987
    //   13027: l2i
    //   13028: ldc_w 1803700394
    //   13031: ixor
    //   13032: goto -> 13043
    //   13035: ldc2_w 1485847121
    //   13038: l2i
    //   13039: ldc_w 107253658
    //   13042: ixor
    //   13043: ldc2_w 1413283848
    //   13046: l2i
    //   13047: ldc_w 51081477
    //   13050: ixor
    //   13051: ixor
    //   13052: lookupswitch default -> 13443, 163759302 -> 13080, 414473180 -> 13035
    //   13080: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   13083: ldc2_w 1041160971
    //   13086: l2i
    //   13087: ldc_w 1041160970
    //   13090: ixor
    //   13091: getstatic Perryc.1 : I
    //   13094: ifeq -> 13108
    //   13097: ldc2_w -1745495129
    //   13100: l2i
    //   13101: ldc_w 897261903
    //   13104: ixor
    //   13105: goto -> 13116
    //   13108: ldc2_w 1161439297
    //   13111: l2i
    //   13112: ldc_w 269293070
    //   13115: ixor
    //   13116: ldc2_w -1229206683
    //   13119: l2i
    //   13120: ldc_w -1690150648
    //   13123: ixor
    //   13124: ixor
    //   13125: lookupswitch default -> 13191, -1887999867 -> 13108, 2026810402 -> 13152
    //   13152: goto -> 13156
    //   13155: athrow
    //   13156: invokestatic placeCrystalOnBlock : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Z)V
    //   13159: goto -> 13163
    //   13162: athrow
    //   13163: goto -> 12230
    //   13166: return
    //   13167: aconst_null
    //   13168: athrow
    //   13169: aconst_null
    //   13170: athrow
    //   13171: aconst_null
    //   13172: athrow
    //   13173: aconst_null
    //   13174: athrow
    //   13175: aconst_null
    //   13176: athrow
    //   13177: aconst_null
    //   13178: athrow
    //   13179: aconst_null
    //   13180: athrow
    //   13181: aconst_null
    //   13182: athrow
    //   13183: aconst_null
    //   13184: athrow
    //   13185: aconst_null
    //   13186: athrow
    //   13187: aconst_null
    //   13188: athrow
    //   13189: aconst_null
    //   13190: athrow
    //   13191: aconst_null
    //   13192: athrow
    //   13193: aconst_null
    //   13194: athrow
    //   13195: aconst_null
    //   13196: athrow
    //   13197: aconst_null
    //   13198: athrow
    //   13199: aconst_null
    //   13200: athrow
    //   13201: aconst_null
    //   13202: athrow
    //   13203: aconst_null
    //   13204: athrow
    //   13205: aconst_null
    //   13206: athrow
    //   13207: aconst_null
    //   13208: athrow
    //   13209: aconst_null
    //   13210: athrow
    //   13211: aconst_null
    //   13212: athrow
    //   13213: aconst_null
    //   13214: athrow
    //   13215: aconst_null
    //   13216: athrow
    //   13217: aconst_null
    //   13218: athrow
    //   13219: aconst_null
    //   13220: athrow
    //   13221: aconst_null
    //   13222: athrow
    //   13223: aconst_null
    //   13224: athrow
    //   13225: aconst_null
    //   13226: athrow
    //   13227: aconst_null
    //   13228: athrow
    //   13229: aconst_null
    //   13230: athrow
    //   13231: aconst_null
    //   13232: athrow
    //   13233: aconst_null
    //   13234: athrow
    //   13235: aconst_null
    //   13236: athrow
    //   13237: aconst_null
    //   13238: athrow
    //   13239: aconst_null
    //   13240: athrow
    //   13241: aconst_null
    //   13242: athrow
    //   13243: aconst_null
    //   13244: athrow
    //   13245: aconst_null
    //   13246: athrow
    //   13247: aconst_null
    //   13248: athrow
    //   13249: aconst_null
    //   13250: athrow
    //   13251: aconst_null
    //   13252: athrow
    //   13253: aconst_null
    //   13254: athrow
    //   13255: aconst_null
    //   13256: athrow
    //   13257: aconst_null
    //   13258: athrow
    //   13259: aconst_null
    //   13260: athrow
    //   13261: aconst_null
    //   13262: athrow
    //   13263: aconst_null
    //   13264: athrow
    //   13265: aconst_null
    //   13266: athrow
    //   13267: aconst_null
    //   13268: athrow
    //   13269: aconst_null
    //   13270: athrow
    //   13271: aconst_null
    //   13272: athrow
    //   13273: aconst_null
    //   13274: athrow
    //   13275: aconst_null
    //   13276: athrow
    //   13277: aconst_null
    //   13278: athrow
    //   13279: aconst_null
    //   13280: athrow
    //   13281: aconst_null
    //   13282: athrow
    //   13283: aconst_null
    //   13284: athrow
    //   13285: aconst_null
    //   13286: athrow
    //   13287: aconst_null
    //   13288: athrow
    //   13289: aconst_null
    //   13290: athrow
    //   13291: aconst_null
    //   13292: athrow
    //   13293: aconst_null
    //   13294: athrow
    //   13295: aconst_null
    //   13296: athrow
    //   13297: aconst_null
    //   13298: athrow
    //   13299: aconst_null
    //   13300: athrow
    //   13301: aconst_null
    //   13302: athrow
    //   13303: aconst_null
    //   13304: athrow
    //   13305: aconst_null
    //   13306: athrow
    //   13307: aconst_null
    //   13308: athrow
    //   13309: aconst_null
    //   13310: athrow
    //   13311: aconst_null
    //   13312: athrow
    //   13313: aconst_null
    //   13314: athrow
    //   13315: aconst_null
    //   13316: athrow
    //   13317: aconst_null
    //   13318: athrow
    //   13319: aconst_null
    //   13320: athrow
    //   13321: aconst_null
    //   13322: athrow
    //   13323: aconst_null
    //   13324: athrow
    //   13325: aconst_null
    //   13326: athrow
    //   13327: aconst_null
    //   13328: athrow
    //   13329: aconst_null
    //   13330: athrow
    //   13331: aconst_null
    //   13332: athrow
    //   13333: aconst_null
    //   13334: athrow
    //   13335: aconst_null
    //   13336: athrow
    //   13337: aconst_null
    //   13338: athrow
    //   13339: aconst_null
    //   13340: athrow
    //   13341: aconst_null
    //   13342: athrow
    //   13343: aconst_null
    //   13344: athrow
    //   13345: aconst_null
    //   13346: athrow
    //   13347: aconst_null
    //   13348: athrow
    //   13349: aconst_null
    //   13350: athrow
    //   13351: aconst_null
    //   13352: athrow
    //   13353: aconst_null
    //   13354: athrow
    //   13355: aconst_null
    //   13356: athrow
    //   13357: aconst_null
    //   13358: athrow
    //   13359: aconst_null
    //   13360: athrow
    //   13361: aconst_null
    //   13362: athrow
    //   13363: aconst_null
    //   13364: athrow
    //   13365: aconst_null
    //   13366: athrow
    //   13367: aconst_null
    //   13368: athrow
    //   13369: aconst_null
    //   13370: athrow
    //   13371: aconst_null
    //   13372: athrow
    //   13373: aconst_null
    //   13374: athrow
    //   13375: aconst_null
    //   13376: athrow
    //   13377: aconst_null
    //   13378: athrow
    //   13379: aconst_null
    //   13380: athrow
    //   13381: aconst_null
    //   13382: athrow
    //   13383: aconst_null
    //   13384: athrow
    //   13385: aconst_null
    //   13386: athrow
    //   13387: aconst_null
    //   13388: athrow
    //   13389: aconst_null
    //   13390: athrow
    //   13391: aconst_null
    //   13392: athrow
    //   13393: aconst_null
    //   13394: athrow
    //   13395: aconst_null
    //   13396: athrow
    //   13397: aconst_null
    //   13398: athrow
    //   13399: aconst_null
    //   13400: athrow
    //   13401: aconst_null
    //   13402: athrow
    //   13403: aconst_null
    //   13404: athrow
    //   13405: aconst_null
    //   13406: athrow
    //   13407: aconst_null
    //   13408: athrow
    //   13409: aconst_null
    //   13410: athrow
    //   13411: aconst_null
    //   13412: athrow
    //   13413: aconst_null
    //   13414: athrow
    //   13415: aconst_null
    //   13416: athrow
    //   13417: aconst_null
    //   13418: athrow
    //   13419: aconst_null
    //   13420: athrow
    //   13421: aconst_null
    //   13422: athrow
    //   13423: aconst_null
    //   13424: athrow
    //   13425: aconst_null
    //   13426: athrow
    //   13427: aconst_null
    //   13428: athrow
    //   13429: aconst_null
    //   13430: athrow
    //   13431: aconst_null
    //   13432: athrow
    //   13433: aconst_null
    //   13434: athrow
    //   13435: aconst_null
    //   13436: athrow
    //   13437: aconst_null
    //   13438: athrow
    //   13439: aconst_null
    //   13440: athrow
    //   13441: aconst_null
    //   13442: athrow
    //   13443: aconst_null
    //   13444: athrow
    //   13445: aconst_null
    //   13446: athrow
    //   13447: aconst_null
    //   13448: athrow
    //   13449: aconst_null
    //   13450: athrow
    //   13451: aconst_null
    //   13452: athrow
    //   13453: aconst_null
    //   13454: athrow
    //   13455: aconst_null
    //   13456: athrow
    //   13457: aconst_null
    //   13458: athrow
    //   13459: aconst_null
    //   13460: athrow
    //   13461: aconst_null
    //   13462: athrow
    //   13463: aconst_null
    //   13464: athrow
    //   13465: aconst_null
    //   13466: athrow
    //   13467: aconst_null
    //   13468: athrow
    //   13469: aconst_null
    //   13470: athrow
    //   13471: aconst_null
    //   13472: athrow
    //   13473: aconst_null
    //   13474: athrow
    //   13475: aconst_null
    //   13476: athrow
    //   13477: aconst_null
    //   13478: athrow
    //   13479: aconst_null
    //   13480: athrow
    //   13481: aconst_null
    //   13482: athrow
    //   13483: aconst_null
    //   13484: athrow
    //   13485: aconst_null
    //   13486: athrow
    //   13487: aconst_null
    //   13488: athrow
    //   13489: aconst_null
    //   13490: athrow
    //   13491: aconst_null
    //   13492: athrow
    //   13493: aconst_null
    //   13494: athrow
    //   13495: aconst_null
    //   13496: athrow
    //   13497: aconst_null
    //   13498: athrow
    //   13499: aconst_null
    //   13500: athrow
    //   13501: aconst_null
    //   13502: athrow
    //   13503: aconst_null
    //   13504: athrow
    //   13505: aconst_null
    //   13506: athrow
    //   13507: aconst_null
    //   13508: athrow
    //   13509: aconst_null
    //   13510: athrow
    //   13511: aconst_null
    //   13512: athrow
    //   13513: aconst_null
    //   13514: athrow
    //   13515: aconst_null
    //   13516: athrow
    //   13517: aconst_null
    //   13518: athrow
    //   13519: aconst_null
    //   13520: athrow
    //   13521: aconst_null
    //   13522: athrow
    //   13523: pop
    //   13524: goto -> 24
    //   13527: pop
    //   13528: aconst_null
    //   13529: goto -> 13523
    //   13532: dup
    //   13533: ifnull -> 13523
    //   13536: checkcast java/lang/Throwable
    //   13539: athrow
    //   13540: dup
    //   13541: ifnull -> 13527
    //   13544: checkcast java/lang/Throwable
    //   13547: athrow
    //   13548: aconst_null
    //   13549: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2786	1681	5	predict	Lnet/minecraft/network/play/client/CPacketUseEntity;
    //   1458	3012	4	target	Lnet/minecraft/entity/player/EntityPlayer;
    //   409	4064	2	packet	Lnet/minecraft/network/play/server/SPacketSpawnObject;
    //   5950	388	8	entity	Lnet/minecraft/entity/Entity;
    //   5622	780	7	id	I
    //   4857	1551	3	packet_	Lnet/minecraft/network/play/server/SPacketDestroyEntities;
    //   8030	2337	4	crystal	Lnet/minecraft/entity/Entity;
    //   12626	537	6	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   10757	2409	3	packet2	Lnet/minecraft/network/play/server/SPacketExplosion;
    //   11578	1588	4	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	13143	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	13143	1	event	Lbigname/zprestige/webhack/event/events/PacketEvent$Receive;
    // Exception table:
    //   from	to	target	type
    //   8	20	13532	java/lang/NegativeArraySizeException
    //   147	154	154	finally
    //   147	154	154	finally
    //   147	154	154	finally
    //   147	154	147	finally
    //   147	154	154	java/util/ConcurrentModificationException
    //   335	342	342	finally
    //   335	342	335	java/lang/StringIndexOutOfBoundsException
    //   335	342	3	finally
    //   336	342	335	java/lang/IllegalStateException
    //   336	342	3	finally
    //   471	478	478	finally
    //   471	478	471	finally
    //   471	478	478	java/lang/ArithmeticException
    //   471	478	3	finally
    //   472	478	478	finally
    //   931	938	938	finally
    //   931	938	931	java/lang/NegativeArraySizeException
    //   932	938	931	finally
    //   932	938	931	finally
    //   932	938	3	finally
    //   1004	1010	1010	finally
    //   1004	1010	1010	finally
    //   1004	1010	3	java/lang/RuntimeException
    //   1004	1010	1010	finally
    //   1004	1010	1010	java/lang/IndexOutOfBoundsException
    //   1195	1204	1204	finally
    //   1195	1204	1195	finally
    //   1195	1204	1195	java/lang/ArrayIndexOutOfBoundsException
    //   1195	1204	1195	finally
    //   1195	1204	3	java/lang/NullPointerException
    //   1383	1392	1392	finally
    //   1383	1392	3	finally
    //   1383	1392	1392	finally
    //   1384	1392	1383	finally
    //   1384	1392	1383	java/util/ConcurrentModificationException
    //   1775	1782	1782	finally
    //   1775	1782	1775	java/lang/ArithmeticException
    //   1776	1782	1775	java/lang/AssertionError
    //   1776	1782	1782	finally
    //   1776	1782	3	java/lang/IllegalArgumentException
    //   1907	1914	1914	finally
    //   1907	1914	1907	finally
    //   1907	1914	3	finally
    //   1908	1914	3	java/lang/NullPointerException
    //   1908	1914	3	finally
    //   2039	2046	2046	finally
    //   2039	2046	2039	java/lang/IndexOutOfBoundsException
    //   2039	2046	3	finally
    //   2039	2046	3	finally
    //   2040	2046	2046	finally
    //   2111	2118	2118	finally
    //   2111	2118	3	finally
    //   2111	2118	2118	java/lang/IllegalArgumentException
    //   2112	2118	2118	java/lang/NegativeArraySizeException
    //   2112	2118	2111	java/lang/IllegalStateException
    //   2247	2254	2254	finally
    //   2247	2254	3	finally
    //   2247	2254	2247	finally
    //   2247	2254	2254	java/lang/UnsupportedOperationException
    //   2248	2254	3	finally
    //   2512	2518	2518	finally
    //   2512	2518	3	java/lang/IllegalStateException
    //   2512	2518	2518	java/util/NoSuchElementException
    //   2512	2518	3	finally
    //   2512	2518	2518	finally
    //   2587	2594	2594	finally
    //   2587	2594	2594	finally
    //   2587	2594	3	finally
    //   2588	2594	2587	finally
    //   2588	2594	3	java/lang/IllegalArgumentException
    //   2715	2722	2722	finally
    //   2715	2722	2715	java/lang/IndexOutOfBoundsException
    //   2716	2722	2715	java/lang/ArrayIndexOutOfBoundsException
    //   2716	2722	2722	finally
    //   2716	2722	3	java/util/NoSuchElementException
    //   2975	2982	2982	finally
    //   2975	2982	3	finally
    //   2975	2982	2982	finally
    //   2975	2982	3	finally
    //   2976	2982	2975	finally
    //   3559	3566	3566	finally
    //   3559	3566	3	java/lang/AssertionError
    //   3559	3566	3566	java/lang/ArrayIndexOutOfBoundsException
    //   3560	3566	3559	java/lang/IllegalStateException
    //   3560	3566	3566	finally
    //   3755	3762	3762	finally
    //   3755	3762	3	finally
    //   3756	3762	3762	java/lang/ArithmeticException
    //   3756	3762	3755	finally
    //   3756	3762	3	java/lang/StringIndexOutOfBoundsException
    //   4067	4074	4074	finally
    //   4067	4074	4074	java/lang/ArrayIndexOutOfBoundsException
    //   4067	4074	4067	finally
    //   4067	4074	4067	java/lang/NullPointerException
    //   4068	4074	3	java/lang/IndexOutOfBoundsException
    //   4143	4150	4150	finally
    //   4143	4150	4143	finally
    //   4143	4150	4143	java/lang/ArrayIndexOutOfBoundsException
    //   4144	4150	3	finally
    //   4144	4150	3	java/lang/RuntimeException
    //   4595	4602	4602	finally
    //   4595	4602	4595	java/lang/EnumConstantNotPresentException
    //   4596	4602	4595	java/lang/RuntimeException
    //   4596	4602	3	java/lang/StringIndexOutOfBoundsException
    //   4596	4602	3	finally
    //   4783	4790	4790	finally
    //   4784	4790	3	finally
    //   4784	4790	3	finally
    //   4784	4790	4783	finally
    //   4784	4790	4783	finally
    //   4979	4986	4986	finally
    //   4979	4986	3	java/lang/NumberFormatException
    //   4979	4986	4979	finally
    //   4980	4986	3	java/lang/IllegalStateException
    //   4980	4986	3	finally
    //   5622	6072	6341	java/lang/Exception
    //   5879	5886	5886	finally
    //   5879	5886	5879	java/lang/ClassCastException
    //   5880	5886	5886	java/lang/EnumConstantNotPresentException
    //   5880	5886	5879	finally
    //   5880	5886	5886	java/util/ConcurrentModificationException
    //   6075	6338	6341	java/lang/Exception
    //   6327	6336	6336	finally
    //   6327	6336	6327	finally
    //   6327	6336	6336	finally
    //   6327	6336	3	finally
    //   6328	6336	6327	finally
    //   6531	6538	6538	finally
    //   6531	6538	6531	finally
    //   6531	6538	6531	java/lang/AssertionError
    //   6531	6538	3	finally
    //   6532	6538	6538	java/lang/IllegalArgumentException
    //   6719	6726	6726	finally
    //   6719	6726	6719	java/lang/ClassCastException
    //   6720	6726	6726	java/lang/NumberFormatException
    //   6720	6726	3	finally
    //   6720	6726	6726	finally
    //   6795	6802	6802	finally
    //   6795	6802	3	java/lang/NumberFormatException
    //   6795	6802	6802	finally
    //   6796	6802	6795	finally
    //   6796	6802	6795	finally
    //   7044	7050	7050	finally
    //   7044	7050	3	java/lang/ArithmeticException
    //   7044	7050	3	finally
    //   7044	7050	7050	java/lang/NumberFormatException
    //   7044	7050	3	finally
    //   7119	7126	7126	finally
    //   7119	7126	3	java/util/NoSuchElementException
    //   7120	7126	3	java/lang/UnsupportedOperationException
    //   7120	7126	7119	finally
    //   7120	7126	7126	finally
    //   7503	7510	7510	finally
    //   7503	7510	3	java/lang/NegativeArraySizeException
    //   7503	7510	7510	java/lang/EnumConstantNotPresentException
    //   7504	7510	7503	finally
    //   7504	7510	3	finally
    //   7575	7582	7582	finally
    //   7576	7582	7582	java/lang/IndexOutOfBoundsException
    //   7576	7582	3	finally
    //   7576	7582	7575	finally
    //   7576	7582	7582	finally
    //   7767	7776	7776	finally
    //   7767	7776	7776	java/lang/ArithmeticException
    //   7767	7776	3	java/lang/NullPointerException
    //   7767	7776	3	java/util/NoSuchElementException
    //   7768	7776	7767	finally
    //   7955	7964	7964	finally
    //   7955	7964	7955	java/lang/ClassCastException
    //   7955	7964	3	java/lang/NullPointerException
    //   7955	7964	7964	java/lang/EnumConstantNotPresentException
    //   7956	7964	7955	java/lang/NullPointerException
    //   8339	8346	8346	finally
    //   8339	8346	8339	finally
    //   8339	8346	8339	finally
    //   8340	8346	8339	finally
    //   8340	8346	3	finally
    //   8415	8422	8422	finally
    //   8415	8422	8422	finally
    //   8415	8422	8415	finally
    //   8415	8422	8415	java/lang/UnsupportedOperationException
    //   8416	8422	3	finally
    //   8547	8554	8554	finally
    //   8547	8554	3	finally
    //   8547	8554	8547	finally
    //   8548	8554	8547	finally
    //   8548	8554	8554	finally
    //   8623	8630	8630	finally
    //   8623	8630	3	java/lang/ArithmeticException
    //   8624	8630	8623	java/lang/NumberFormatException
    //   8624	8630	3	java/lang/StringIndexOutOfBoundsException
    //   8624	8630	3	finally
    //   8756	8762	8762	finally
    //   8756	8762	8762	finally
    //   8756	8762	3	finally
    //   8756	8762	3	finally
    //   8756	8762	8762	finally
    //   8831	8838	8838	finally
    //   8831	8838	3	java/lang/IllegalStateException
    //   8831	8838	8831	finally
    //   8831	8838	8831	java/util/ConcurrentModificationException
    //   8832	8838	8838	java/lang/UnsupportedOperationException
    //   8904	8910	8910	finally
    //   8904	8910	8910	java/lang/EnumConstantNotPresentException
    //   8904	8910	3	java/lang/StringIndexOutOfBoundsException
    //   8904	8910	3	finally
    //   8904	8910	8910	finally
    //   9099	9106	9106	finally
    //   9099	9106	9099	java/lang/EnumConstantNotPresentException
    //   9099	9106	3	finally
    //   9099	9106	9099	java/lang/IndexOutOfBoundsException
    //   9100	9106	3	java/lang/StringIndexOutOfBoundsException
    //   9175	9182	9182	finally
    //   9175	9182	9175	finally
    //   9175	9182	3	finally
    //   9176	9182	9182	finally
    //   9176	9182	3	java/lang/EnumConstantNotPresentException
    //   9363	9370	9370	finally
    //   9363	9370	9370	java/lang/NegativeArraySizeException
    //   9363	9370	9363	java/lang/AssertionError
    //   9363	9370	9363	finally
    //   9364	9370	9370	finally
    //   10099	10106	10106	finally
    //   10099	10106	10106	java/util/NoSuchElementException
    //   10100	10106	10099	finally
    //   10100	10106	3	java/lang/ArithmeticException
    //   10100	10106	3	java/lang/StringIndexOutOfBoundsException
    //   10176	10182	10182	finally
    //   10176	10182	3	java/lang/ClassCastException
    //   10176	10182	3	finally
    //   10176	10182	10182	finally
    //   10176	10182	10182	java/lang/AssertionError
    //   10495	10502	10502	finally
    //   10496	10502	10495	finally
    //   10496	10502	10495	finally
    //   10496	10502	10495	java/lang/ClassCastException
    //   10496	10502	10502	finally
    //   10683	10690	10690	finally
    //   10683	10690	3	java/lang/RuntimeException
    //   10683	10690	10690	java/lang/ArithmeticException
    //   10684	10690	3	finally
    //   10684	10690	10683	finally
    //   10883	10890	10890	finally
    //   10883	10890	10890	finally
    //   10884	10890	10883	java/lang/AssertionError
    //   10884	10890	10883	finally
    //   10884	10890	3	java/lang/IllegalStateException
    //   10955	10962	10962	finally
    //   10955	10962	3	java/lang/RuntimeException
    //   10956	10962	3	finally
    //   10956	10962	10955	java/lang/NullPointerException
    //   10956	10962	10955	java/lang/NegativeArraySizeException
    //   11087	11094	11094	finally
    //   11087	11094	11087	java/util/NoSuchElementException
    //   11088	11094	11087	finally
    //   11088	11094	11087	java/lang/IllegalArgumentException
    //   11088	11094	11094	java/lang/StringIndexOutOfBoundsException
    //   11159	11166	11166	finally
    //   11159	11166	11166	java/lang/EnumConstantNotPresentException
    //   11160	11166	11159	finally
    //   11160	11166	11166	java/lang/NumberFormatException
    //   11160	11166	3	java/lang/ArrayIndexOutOfBoundsException
    //   11291	11298	11298	finally
    //   11291	11298	11298	finally
    //   11292	11298	11298	java/lang/NegativeArraySizeException
    //   11292	11298	3	java/lang/IndexOutOfBoundsException
    //   11292	11298	11291	java/lang/AssertionError
    //   11363	11370	11370	finally
    //   11363	11370	11370	finally
    //   11363	11370	11370	java/lang/ArithmeticException
    //   11363	11370	11370	java/lang/NumberFormatException
    //   11364	11370	11363	finally
    //   11436	11442	11442	finally
    //   11436	11442	11442	java/lang/ArithmeticException
    //   11436	11442	3	finally
    //   11436	11442	3	java/lang/UnsupportedOperationException
    //   11436	11442	11442	java/lang/RuntimeException
    //   11507	11514	11514	finally
    //   11507	11514	11514	java/lang/RuntimeException
    //   11507	11514	11507	finally
    //   11508	11514	11507	finally
    //   11508	11514	11514	finally
    //   11767	11774	11774	finally
    //   11767	11774	11774	java/lang/NullPointerException
    //   11768	11774	11767	finally
    //   11768	11774	11767	java/lang/NullPointerException
    //   11768	11774	3	java/lang/RuntimeException
    //   11843	11850	11850	finally
    //   11844	11850	3	java/lang/UnsupportedOperationException
    //   11844	11850	11850	finally
    //   11844	11850	3	finally
    //   11844	11850	11843	java/lang/ArithmeticException
    //   12159	12168	12168	finally
    //   12159	12168	3	finally
    //   12160	12168	3	java/lang/IndexOutOfBoundsException
    //   12160	12168	12159	java/util/NoSuchElementException
    //   12160	12168	12168	finally
    //   12360	12368	12368	finally
    //   12360	12368	12368	java/lang/NumberFormatException
    //   12360	12368	3	java/lang/StringIndexOutOfBoundsException
    //   12360	12368	3	java/lang/IndexOutOfBoundsException
    //   12360	12368	12368	java/lang/ClassCastException
    //   12551	12560	12560	finally
    //   12551	12560	3	finally
    //   12552	12560	12560	finally
    //   12552	12560	12551	java/lang/ClassCastException
    //   12552	12560	3	java/lang/NullPointerException
    //   12879	12886	12886	finally
    //   12879	12886	12886	java/lang/UnsupportedOperationException
    //   12879	12886	3	finally
    //   12880	12886	12879	finally
    //   12880	12886	3	finally
    //   13155	13162	13162	finally
    //   13155	13162	3	finally
    //   13155	13162	13155	java/lang/IllegalStateException
    //   13156	13162	13155	java/lang/NegativeArraySizeException
    //   13156	13162	3	finally
    //   13532	13540	13532	finally
    //   13548	13550	3	java/lang/IndexOutOfBoundsException
  }
  
  public double isCrystalGood(EntityEnderCrystal crystal, EntityPlayer target) {
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
  
  public void placeCrystal() {
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
  
  public double isBlockGood(BlockPos blockPos, EntityPlayer target) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 9496
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 9488
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 9480
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1295057769
    //   33: l2i
    //   34: ldc_w -1765255864
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -461565976
    //   44: l2i
    //   45: ldc_w -246491365
    //   48: ixor
    //   49: ldc2_w 654893862
    //   52: l2i
    //   53: ldc_w -950471222
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 9445, -1000947917 -> 41, -178008545 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 1524789158
    //   94: l2i
    //   95: ldc_w -934746100
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1388839608
    //   105: l2i
    //   106: ldc_w 2068177526
    //   109: ixor
    //   110: ldc2_w -908929365
    //   113: l2i
    //   114: ldc_w -458577945
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 9465, -1076693274 -> 102, 83202434 -> 144
    //   144: aload_2
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 162
    //   151: ldc2_w 1163403526
    //   154: l2i
    //   155: ldc_w 1773768323
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -1401923441
    //   165: l2i
    //   166: ldc_w -1852286692
    //   169: ixor
    //   170: ldc2_w 309993932
    //   173: l2i
    //   174: ldc_w -380570379
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 9237, -960310102 -> 204, -674530628 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial isPlayerValid : (Lnet/minecraft/entity/player/EntityPlayer;)Z
    //   211: goto -> 215
    //   214: athrow
    //   215: ifeq -> 229
    //   218: ldc2_w 404375422
    //   221: l2i
    //   222: ldc_w 1982790531
    //   225: ixor
    //   226: goto -> 237
    //   229: ldc2_w 856884266
    //   232: l2i
    //   233: ldc_w 1562884308
    //   236: ixor
    //   237: ldc2_w 1557477020
    //   240: l2i
    //   241: ldc_w -1969286732
    //   244: ixor
    //   245: ixor
    //   246: tableswitch default -> 218, -1199662123 -> 268, -1199662122 -> 9215
    //   268: getstatic Perryc.c : I
    //   271: iflt -> 285
    //   274: ldc2_w 708859264
    //   277: l2i
    //   278: ldc_w 353851737
    //   281: ixor
    //   282: goto -> 293
    //   285: ldc2_w -1844081410
    //   288: l2i
    //   289: ldc_w -1420157148
    //   292: ixor
    //   293: ldc2_w -1335168354
    //   296: l2i
    //   297: ldc_w -1027487952
    //   300: ixor
    //   301: ixor
    //   302: lookupswitch default -> 328, 192889173 -> 285, 1308375415 -> 9283
    //   328: aload_1
    //   329: getstatic Perryc.c : I
    //   332: iflt -> 346
    //   335: ldc2_w -1799609531
    //   338: l2i
    //   339: ldc_w 1101217136
    //   342: ixor
    //   343: goto -> 354
    //   346: ldc2_w 1469533089
    //   349: l2i
    //   350: ldc_w -740869610
    //   353: ixor
    //   354: ldc2_w -1559967468
    //   357: l2i
    //   358: ldc_w 1588359284
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 388, 683124565 -> 9467, 1663009103 -> 346
    //   388: goto -> 392
    //   391: athrow
    //   392: invokestatic canSeePos : (Lnet/minecraft/util/math/BlockPos;)Z
    //   395: goto -> 399
    //   398: athrow
    //   399: ifne -> 413
    //   402: ldc2_w -1013903933
    //   405: l2i
    //   406: ldc_w -252416657
    //   409: ixor
    //   410: goto -> 421
    //   413: ldc2_w -1942514308
    //   416: l2i
    //   417: ldc_w -1085082157
    //   420: ixor
    //   421: ldc2_w 1000487378
    //   424: l2i
    //   425: ldc_w 164786751
    //   428: ixor
    //   429: ixor
    //   430: tableswitch default -> 402, 18164545 -> 452, 18164546 -> 790
    //   452: getstatic Perryc.0 : I
    //   455: ifle -> 469
    //   458: ldc2_w 1030008883
    //   461: l2i
    //   462: ldc_w -502841112
    //   465: ixor
    //   466: goto -> 477
    //   469: ldc2_w 709398993
    //   472: l2i
    //   473: ldc_w -1088632713
    //   476: ixor
    //   477: ldc2_w -720301540
    //   480: l2i
    //   481: ldc_w -1388869955
    //   484: ixor
    //   485: ixor
    //   486: lookupswitch default -> 9393, -1488624518 -> 469, -311243513 -> 512
    //   512: aload_0
    //   513: getstatic Perryc.0 : I
    //   516: ifle -> 530
    //   519: ldc2_w 1130123161
    //   522: l2i
    //   523: ldc_w -420890113
    //   526: ixor
    //   527: goto -> 538
    //   530: ldc2_w 1800901843
    //   533: l2i
    //   534: ldc_w 1396529430
    //   537: ixor
    //   538: ldc2_w -1222557411
    //   541: l2i
    //   542: ldc_w -1505360363
    //   545: ixor
    //   546: ixor
    //   547: lookupswitch default -> 9291, -1261260434 -> 530, 688753357 -> 572
    //   572: getfield raytrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   575: getstatic Perryc.c : I
    //   578: iflt -> 592
    //   581: ldc2_w 1531085305
    //   584: l2i
    //   585: ldc_w 305067580
    //   588: ixor
    //   589: goto -> 600
    //   592: ldc2_w -868302864
    //   595: l2i
    //   596: ldc_w 932574846
    //   599: ixor
    //   600: ldc2_w -1370559995
    //   603: l2i
    //   604: ldc_w -23640380
    //   607: ixor
    //   608: ixor
    //   609: lookupswitch default -> 9313, -1418533553 -> 636, 431348484 -> 592
    //   636: goto -> 640
    //   639: athrow
    //   640: invokevirtual getValue : ()Ljava/lang/Object;
    //   643: goto -> 647
    //   646: athrow
    //   647: checkcast java/lang/Boolean
    //   650: getstatic Perryc.1 : I
    //   653: ifeq -> 667
    //   656: ldc2_w 1029962040
    //   659: l2i
    //   660: ldc_w -549520367
    //   663: ixor
    //   664: goto -> 675
    //   667: ldc2_w 420854896
    //   670: l2i
    //   671: ldc_w -1260061020
    //   674: ixor
    //   675: ldc2_w -1566320797
    //   678: l2i
    //   679: ldc_w 345547129
    //   682: ixor
    //   683: ixor
    //   684: lookupswitch default -> 712, 892833818 -> 667, 1416000307 -> 9269
    //   712: goto -> 716
    //   715: athrow
    //   716: invokevirtual booleanValue : ()Z
    //   719: goto -> 723
    //   722: athrow
    //   723: ifeq -> 737
    //   726: ldc2_w 737005310
    //   729: l2i
    //   730: ldc_w -1620327954
    //   733: ixor
    //   734: goto -> 745
    //   737: ldc2_w 658619556
    //   740: l2i
    //   741: ldc_w -1815628875
    //   744: ixor
    //   745: ldc2_w -364102061
    //   748: l2i
    //   749: ldc_w 829225579
    //   752: ixor
    //   753: ixor
    //   754: tableswitch default -> 726, 1873201960 -> 776, 1873201961 -> 790
    //   776: ldc2_w 5.74026390078122E307
    //   779: invokestatic doubleToLongBits : (D)J
    //   782: ldc2_w 9211109865989317527
    //   785: lxor
    //   786: invokestatic longBitsToDouble : (J)D
    //   789: dreturn
    //   790: getstatic Perryc.1 : I
    //   793: ifeq -> 807
    //   796: ldc2_w 627219232
    //   799: l2i
    //   800: ldc_w -736135897
    //   803: ixor
    //   804: goto -> 815
    //   807: ldc2_w -1081931139
    //   810: l2i
    //   811: ldc_w 1914392725
    //   814: ixor
    //   815: ldc2_w -535439137
    //   818: l2i
    //   819: ldc_w -794802216
    //   822: ixor
    //   823: ixor
    //   824: lookupswitch default -> 9439, -1043828480 -> 807, -47331857 -> 852
    //   852: aload_1
    //   853: getstatic Perryc.c : I
    //   856: iflt -> 870
    //   859: ldc2_w -76960658
    //   862: l2i
    //   863: ldc_w 625084111
    //   866: ixor
    //   867: goto -> 878
    //   870: ldc2_w 274999762
    //   873: l2i
    //   874: ldc_w -1164392595
    //   877: ixor
    //   878: ldc2_w 1091135389
    //   881: l2i
    //   882: ldc_w 1976838704
    //   885: ixor
    //   886: ixor
    //   887: lookupswitch default -> 912, -352917748 -> 9271, 327724547 -> 870
    //   912: goto -> 916
    //   915: athrow
    //   916: invokestatic canSeePos : (Lnet/minecraft/util/math/BlockPos;)Z
    //   919: goto -> 923
    //   922: athrow
    //   923: ifne -> 937
    //   926: ldc2_w 695032707
    //   929: l2i
    //   930: ldc_w -933188025
    //   933: ixor
    //   934: goto -> 945
    //   937: ldc2_w -1256748340
    //   940: l2i
    //   941: ldc_w 1411022603
    //   944: ixor
    //   945: ldc2_w 1102967768
    //   948: l2i
    //   949: ldc_w 1997350545
    //   952: ixor
    //   953: ixor
    //   954: tableswitch default -> 926, -675471219 -> 976, -675471218 -> 1646
    //   976: getstatic Perryc.0 : I
    //   979: ifle -> 993
    //   982: ldc2_w 705172836
    //   985: l2i
    //   986: ldc_w -391957371
    //   989: ixor
    //   990: goto -> 1001
    //   993: ldc2_w -835681794
    //   996: l2i
    //   997: ldc_w -1680359840
    //   1000: ixor
    //   1001: ldc2_w 803689348
    //   1004: l2i
    //   1005: ldc_w -466358919
    //   1008: ixor
    //   1009: ixor
    //   1010: lookupswitch default -> 9405, -1640791709 -> 1036, 159358748 -> 993
    //   1036: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   1039: getstatic Perryc.0 : I
    //   1042: ifle -> 1056
    //   1045: ldc2_w -1487967276
    //   1048: l2i
    //   1049: ldc_w 109806940
    //   1052: ixor
    //   1053: goto -> 1064
    //   1056: ldc2_w 1142475034
    //   1059: l2i
    //   1060: ldc_w -2105068073
    //   1063: ixor
    //   1064: ldc2_w 789210334
    //   1067: l2i
    //   1068: ldc_w 546079805
    //   1071: ixor
    //   1072: ixor
    //   1073: lookupswitch default -> 1100, -1371402645 -> 9245, 112229225 -> 1056
    //   1100: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1103: getstatic Perryc.1 : I
    //   1106: ifeq -> 1120
    //   1109: ldc2_w 393213183
    //   1112: l2i
    //   1113: ldc_w 371839781
    //   1116: ixor
    //   1117: goto -> 1128
    //   1120: ldc2_w 823874124
    //   1123: l2i
    //   1124: ldc_w -1192733261
    //   1127: ixor
    //   1128: ldc2_w -1198399472
    //   1131: l2i
    //   1132: ldc_w -6697195
    //   1135: ixor
    //   1136: ixor
    //   1137: lookupswitch default -> 1164, -1598140813 -> 1120, 1179519199 -> 9345
    //   1164: aload_1
    //   1165: getstatic Perryc.0 : I
    //   1168: ifle -> 1182
    //   1171: ldc2_w 1348070852
    //   1174: l2i
    //   1175: ldc_w -1899940665
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w 178998431
    //   1185: l2i
    //   1186: ldc_w 1860053648
    //   1189: ixor
    //   1190: ldc2_w -207230275
    //   1193: l2i
    //   1194: ldc_w 1403111246
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 9341, -999207940 -> 1224, 2124215536 -> 1182
    //   1224: goto -> 1228
    //   1227: athrow
    //   1228: invokevirtual func_174818_b : (Lnet/minecraft/util/math/BlockPos;)D
    //   1231: goto -> 1235
    //   1234: athrow
    //   1235: getstatic Perryc.c : I
    //   1238: iflt -> 1252
    //   1241: ldc2_w 2017280523
    //   1244: l2i
    //   1245: ldc_w 1436826377
    //   1248: ixor
    //   1249: goto -> 1260
    //   1252: ldc2_w 1731998784
    //   1255: l2i
    //   1256: ldc_w 989003888
    //   1259: ixor
    //   1260: ldc2_w -1380282340
    //   1263: l2i
    //   1264: ldc_w -288703514
    //   1267: ixor
    //   1268: ixor
    //   1269: lookupswitch default -> 9257, 515841994 -> 1296, 1860784888 -> 1252
    //   1296: aload_0
    //   1297: getstatic Perryc.0 : I
    //   1300: ifle -> 1314
    //   1303: ldc2_w -1495527232
    //   1306: l2i
    //   1307: ldc_w 1696206369
    //   1310: ixor
    //   1311: goto -> 1322
    //   1314: ldc2_w 136829185
    //   1317: l2i
    //   1318: ldc_w -758044232
    //   1321: ixor
    //   1322: ldc2_w -1157267162
    //   1325: l2i
    //   1326: ldc_w -1622518218
    //   1329: ixor
    //   1330: ixor
    //   1331: lookupswitch default -> 9395, -410400271 -> 1314, -21420119 -> 1356
    //   1356: getfield placeRangeWall : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1359: getstatic Perryc.c : I
    //   1362: iflt -> 1376
    //   1365: ldc2_w -2039588723
    //   1368: l2i
    //   1369: ldc_w -2111830885
    //   1372: ixor
    //   1373: goto -> 1384
    //   1376: ldc2_w -1510196150
    //   1379: l2i
    //   1380: ldc_w 1128060467
    //   1383: ixor
    //   1384: ldc2_w -707314194
    //   1387: l2i
    //   1388: ldc_w -1368330019
    //   1391: ixor
    //   1392: ixor
    //   1393: lookupswitch default -> 9371, -1654184118 -> 1420, 2146013477 -> 1376
    //   1420: goto -> 1424
    //   1423: athrow
    //   1424: invokevirtual getValue : ()Ljava/lang/Object;
    //   1427: goto -> 1431
    //   1430: athrow
    //   1431: checkcast java/lang/Integer
    //   1434: getstatic Perryc.0 : I
    //   1437: ifle -> 1451
    //   1440: ldc2_w -68016613
    //   1443: l2i
    //   1444: ldc_w -116930618
    //   1447: ixor
    //   1448: goto -> 1459
    //   1451: ldc2_w -855584489
    //   1454: l2i
    //   1455: ldc_w 99410406
    //   1458: ixor
    //   1459: ldc2_w 1232943494
    //   1462: l2i
    //   1463: ldc_w -56579941
    //   1466: ixor
    //   1467: ixor
    //   1468: lookupswitch default -> 1496, -1222086464 -> 9303, 656328874 -> 1451
    //   1496: goto -> 1500
    //   1499: athrow
    //   1500: invokevirtual floatValue : ()F
    //   1503: goto -> 1507
    //   1506: athrow
    //   1507: f2d
    //   1508: getstatic Perryc.1 : I
    //   1511: ifeq -> 1525
    //   1514: ldc2_w 1097363274
    //   1517: l2i
    //   1518: ldc_w 965266215
    //   1521: ixor
    //   1522: goto -> 1533
    //   1525: ldc2_w 1502869918
    //   1528: l2i
    //   1529: ldc_w -1046875291
    //   1532: ixor
    //   1533: ldc2_w 1361759775
    //   1536: l2i
    //   1537: ldc_w -1972077985
    //   1540: ixor
    //   1541: ixor
    //   1542: lookupswitch default -> 9397, -1547825107 -> 1525, 1129627323 -> 1568
    //   1568: goto -> 1572
    //   1571: athrow
    //   1572: invokestatic square : (D)D
    //   1575: goto -> 1579
    //   1578: athrow
    //   1579: dcmpl
    //   1580: ifle -> 1594
    //   1583: ldc2_w 2058896297
    //   1586: l2i
    //   1587: ldc_w 709201137
    //   1590: ixor
    //   1591: goto -> 1602
    //   1594: ldc2_w 504401364
    //   1597: l2i
    //   1598: ldc_w 1324171917
    //   1601: ixor
    //   1602: ldc2_w 1960917134
    //   1605: l2i
    //   1606: ldc_w -529695544
    //   1609: ixor
    //   1610: ixor
    //   1611: tableswitch default -> 1583, -999191778 -> 1632, -999191777 -> 2318
    //   1632: ldc2_w 4.968073009404613E307
    //   1635: invokestatic doubleToLongBits : (D)J
    //   1638: ldc2_w 9210336065713125467
    //   1641: lxor
    //   1642: invokestatic longBitsToDouble : (J)D
    //   1645: dreturn
    //   1646: getstatic Perryc.0 : I
    //   1649: ifle -> 1663
    //   1652: ldc2_w -933252228
    //   1655: l2i
    //   1656: ldc_w -244334487
    //   1659: ixor
    //   1660: goto -> 1671
    //   1663: ldc2_w 475125784
    //   1666: l2i
    //   1667: ldc_w 968366907
    //   1670: ixor
    //   1671: ldc2_w 924902136
    //   1674: l2i
    //   1675: ldc_w 2045805380
    //   1678: ixor
    //   1679: ixor
    //   1680: lookupswitch default -> 1708, -245808729 -> 1663, 2011173545 -> 9229
    //   1708: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   1711: getstatic Perryc.1 : I
    //   1714: ifeq -> 1728
    //   1717: ldc2_w 1029166315
    //   1720: l2i
    //   1721: ldc_w -1286680879
    //   1724: ixor
    //   1725: goto -> 1736
    //   1728: ldc2_w 1058516083
    //   1731: l2i
    //   1732: ldc_w -1650468275
    //   1735: ixor
    //   1736: ldc2_w -1850031210
    //   1739: l2i
    //   1740: ldc_w -1529247612
    //   1743: ixor
    //   1744: ixor
    //   1745: lookupswitch default -> 9389, -1746191060 -> 1772, -1149611736 -> 1728
    //   1772: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1775: getstatic Perryc.1 : I
    //   1778: ifeq -> 1792
    //   1781: ldc2_w 1267026277
    //   1784: l2i
    //   1785: ldc_w -1605059912
    //   1788: ixor
    //   1789: goto -> 1800
    //   1792: ldc2_w -1674567280
    //   1795: l2i
    //   1796: ldc_w -1553652680
    //   1799: ixor
    //   1800: ldc2_w 1536627757
    //   1803: l2i
    //   1804: ldc_w 214586733
    //   1807: ixor
    //   1808: ixor
    //   1809: lookupswitch default -> 9297, -1131629923 -> 1792, 1745372392 -> 1836
    //   1836: aload_1
    //   1837: getstatic Perryc.c : I
    //   1840: iflt -> 1854
    //   1843: ldc2_w 1028973127
    //   1846: l2i
    //   1847: ldc_w 1643496240
    //   1850: ixor
    //   1851: goto -> 1862
    //   1854: ldc2_w 1837898326
    //   1857: l2i
    //   1858: ldc_w 1179087230
    //   1861: ixor
    //   1862: ldc2_w -93182548
    //   1865: l2i
    //   1866: ldc_w 1813706646
    //   1869: ixor
    //   1870: ixor
    //   1871: lookupswitch default -> 9333, -1113343726 -> 1896, -892734643 -> 1854
    //   1896: goto -> 1900
    //   1899: athrow
    //   1900: invokevirtual func_174818_b : (Lnet/minecraft/util/math/BlockPos;)D
    //   1903: goto -> 1907
    //   1906: athrow
    //   1907: getstatic Perryc.0 : I
    //   1910: ifle -> 1924
    //   1913: ldc2_w -1232235962
    //   1916: l2i
    //   1917: ldc_w 1345244441
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w -93152552
    //   1927: l2i
    //   1928: ldc_w 1709741722
    //   1931: ixor
    //   1932: ldc2_w -149237371
    //   1935: l2i
    //   1936: ldc_w -492154679
    //   1939: ixor
    //   1940: ixor
    //   1941: lookupswitch default -> 9255, -1976922866 -> 1968, -216801773 -> 1924
    //   1968: aload_0
    //   1969: getstatic Perryc.0 : I
    //   1972: ifle -> 1986
    //   1975: ldc2_w -1294951233
    //   1978: l2i
    //   1979: ldc_w -1298092124
    //   1982: ixor
    //   1983: goto -> 1994
    //   1986: ldc2_w -1868478843
    //   1989: l2i
    //   1990: ldc_w -1945036869
    //   1993: ixor
    //   1994: ldc2_w -676546420
    //   1997: l2i
    //   1998: ldc_w -1071435965
    //   2001: ixor
    //   2002: ixor
    //   2003: lookupswitch default -> 9319, 188729073 -> 2028, 402629844 -> 1986
    //   2028: getfield placeRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2031: getstatic Perryc.c : I
    //   2034: iflt -> 2048
    //   2037: ldc2_w -1673583321
    //   2040: l2i
    //   2041: ldc_w -519649218
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w 1679362019
    //   2051: l2i
    //   2052: ldc_w -549264960
    //   2055: ixor
    //   2056: ldc2_w -486252970
    //   2059: l2i
    //   2060: ldc_w -1453607452
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 2092, 929433259 -> 9325, 1556538592 -> 2048
    //   2092: goto -> 2096
    //   2095: athrow
    //   2096: invokevirtual getValue : ()Ljava/lang/Object;
    //   2099: goto -> 2103
    //   2102: athrow
    //   2103: checkcast java/lang/Integer
    //   2106: getstatic Perryc.1 : I
    //   2109: ifeq -> 2123
    //   2112: ldc2_w 1779930830
    //   2115: l2i
    //   2116: ldc_w 1349860989
    //   2119: ixor
    //   2120: goto -> 2131
    //   2123: ldc2_w -452822830
    //   2126: l2i
    //   2127: ldc_w 838580521
    //   2130: ixor
    //   2131: ldc2_w 1004471085
    //   2134: l2i
    //   2135: ldc_w 491827932
    //   2138: ixor
    //   2139: ixor
    //   2140: lookupswitch default -> 9461, -227119094 -> 2168, 485300546 -> 2123
    //   2168: goto -> 2172
    //   2171: athrow
    //   2172: invokevirtual floatValue : ()F
    //   2175: goto -> 2179
    //   2178: athrow
    //   2179: f2d
    //   2180: getstatic Perryc.1 : I
    //   2183: ifeq -> 2197
    //   2186: ldc2_w -1537327160
    //   2189: l2i
    //   2190: ldc_w -1615271769
    //   2193: ixor
    //   2194: goto -> 2205
    //   2197: ldc2_w -1646341909
    //   2200: l2i
    //   2201: ldc_w 1263402531
    //   2204: ixor
    //   2205: ldc2_w 1570535931
    //   2208: l2i
    //   2209: ldc_w 1905891050
    //   2212: ixor
    //   2213: ixor
    //   2214: lookupswitch default -> 2240, 400767102 -> 9391, 1536990972 -> 2197
    //   2240: goto -> 2244
    //   2243: athrow
    //   2244: invokestatic square : (D)D
    //   2247: goto -> 2251
    //   2250: athrow
    //   2251: dcmpl
    //   2252: ifle -> 2266
    //   2255: ldc2_w -815585077
    //   2258: l2i
    //   2259: ldc_w -273467272
    //   2262: ixor
    //   2263: goto -> 2274
    //   2266: ldc2_w 1159399741
    //   2269: l2i
    //   2270: ldc_w 1707809201
    //   2273: ixor
    //   2274: ldc2_w 1090104843
    //   2277: l2i
    //   2278: ldc_w 1822315623
    //   2281: ixor
    //   2282: ixor
    //   2283: tableswitch default -> 2255, 213379807 -> 2304, 213379808 -> 2318
    //   2304: ldc2_w 1.6551252919826459E308
    //   2307: invokestatic doubleToLongBits : (D)J
    //   2310: ldc2_w 9218154112327769899
    //   2313: lxor
    //   2314: invokestatic longBitsToDouble : (J)D
    //   2317: dreturn
    //   2318: getstatic Perryc.1 : I
    //   2321: ifeq -> 2335
    //   2324: ldc2_w 1383725792
    //   2327: l2i
    //   2328: ldc_w -2605351
    //   2331: ixor
    //   2332: goto -> 2343
    //   2335: ldc2_w 1610529254
    //   2338: l2i
    //   2339: ldc_w -1677603022
    //   2342: ixor
    //   2343: ldc2_w 285619536
    //   2346: l2i
    //   2347: ldc_w 1119634591
    //   2350: ixor
    //   2351: ixor
    //   2352: lookupswitch default -> 2380, -1516694812 -> 2335, -31738378 -> 9447
    //   2380: aload_1
    //   2381: getstatic Perryc.c : I
    //   2384: iflt -> 2398
    //   2387: ldc2_w 1852108187
    //   2390: l2i
    //   2391: ldc_w 443641702
    //   2394: ixor
    //   2395: goto -> 2406
    //   2398: ldc2_w 680716811
    //   2401: l2i
    //   2402: ldc_w -2089479697
    //   2405: ixor
    //   2406: ldc2_w 1546677414
    //   2409: l2i
    //   2410: ldc_w -973613219
    //   2413: ixor
    //   2414: ixor
    //   2415: lookupswitch default -> 2440, -1584272248 -> 2398, -304989946 -> 9247
    //   2440: aload_2
    //   2441: getstatic Perryc.c : I
    //   2444: iflt -> 2458
    //   2447: ldc2_w 1260483089
    //   2450: l2i
    //   2451: ldc_w 911629542
    //   2454: ixor
    //   2455: goto -> 2466
    //   2458: ldc2_w -1334601982
    //   2461: l2i
    //   2462: ldc_w 1855149908
    //   2465: ixor
    //   2466: ldc2_w 1121285817
    //   2469: l2i
    //   2470: ldc_w 1966363078
    //   2473: ixor
    //   2474: ixor
    //   2475: lookupswitch default -> 9373, -385751255 -> 2500, 1251346824 -> 2458
    //   2500: aload_0
    //   2501: getstatic Perryc.1 : I
    //   2504: ifeq -> 2518
    //   2507: ldc2_w -1565250739
    //   2510: l2i
    //   2511: ldc_w 1150159890
    //   2514: ixor
    //   2515: goto -> 2526
    //   2518: ldc2_w 655840282
    //   2521: l2i
    //   2522: ldc_w -720455014
    //   2525: ixor
    //   2526: ldc2_w -1427241796
    //   2529: l2i
    //   2530: ldc_w 935684972
    //   2533: ixor
    //   2534: ixor
    //   2535: lookupswitch default -> 9369, 1865580880 -> 2560, 2064730255 -> 2518
    //   2560: getfield ignoreTerrain : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2563: getstatic Perryc.c : I
    //   2566: iflt -> 2580
    //   2569: ldc2_w 733372665
    //   2572: l2i
    //   2573: ldc_w -432522674
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w -769722968
    //   2583: l2i
    //   2584: ldc_w 1033939449
    //   2587: ixor
    //   2588: ldc2_w 1509465891
    //   2591: l2i
    //   2592: ldc_w -1065107369
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 2624, 729258892 -> 2580, 1425343939 -> 9361
    //   2624: goto -> 2628
    //   2627: athrow
    //   2628: invokevirtual getValue : ()Ljava/lang/Object;
    //   2631: goto -> 2635
    //   2634: athrow
    //   2635: checkcast java/lang/Boolean
    //   2638: getstatic Perryc.0 : I
    //   2641: ifle -> 2655
    //   2644: ldc2_w -634583297
    //   2647: l2i
    //   2648: ldc_w -1576326276
    //   2651: ixor
    //   2652: goto -> 2663
    //   2655: ldc2_w -58609934
    //   2658: l2i
    //   2659: ldc_w -1216983568
    //   2662: ixor
    //   2663: ldc2_w 1076227363
    //   2666: l2i
    //   2667: ldc_w 762786732
    //   2670: ixor
    //   2671: ixor
    //   2672: lookupswitch default -> 9353, 359985932 -> 2655, 648363405 -> 2700
    //   2700: goto -> 2704
    //   2703: athrow
    //   2704: invokevirtual booleanValue : ()Z
    //   2707: goto -> 2711
    //   2710: athrow
    //   2711: getstatic Perryc.1 : I
    //   2714: ifeq -> 2728
    //   2717: ldc2_w 354275507
    //   2720: l2i
    //   2721: ldc_w 569743634
    //   2724: ixor
    //   2725: goto -> 2736
    //   2728: ldc2_w -1702056368
    //   2731: l2i
    //   2732: ldc_w 1864135063
    //   2735: ixor
    //   2736: ldc2_w 237433991
    //   2739: l2i
    //   2740: ldc_w 459353675
    //   2743: ixor
    //   2744: ixor
    //   2745: lookupswitch default -> 2772, -1207414978 -> 2728, 565154669 -> 9379
    //   2772: goto -> 2776
    //   2775: athrow
    //   2776: invokestatic calculateDamage : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Z)F
    //   2779: goto -> 2783
    //   2782: athrow
    //   2783: getstatic Perryc.1 : I
    //   2786: ifeq -> 2800
    //   2789: ldc2_w 821162685
    //   2792: l2i
    //   2793: ldc_w 348231545
    //   2796: ixor
    //   2797: goto -> 2808
    //   2800: ldc2_w 1386746009
    //   2803: l2i
    //   2804: ldc_w 1148513225
    //   2807: ixor
    //   2808: ldc2_w -1910643389
    //   2811: l2i
    //   2812: ldc_w 1940680574
    //   2815: ixor
    //   2816: ixor
    //   2817: lookupswitch default -> 9335, -645795847 -> 2800, -345149075 -> 2844
    //   2844: aload_0
    //   2845: getstatic Perryc.c : I
    //   2848: iflt -> 2862
    //   2851: ldc2_w -1671346083
    //   2854: l2i
    //   2855: ldc_w -85556374
    //   2858: ixor
    //   2859: goto -> 2870
    //   2862: ldc2_w -2107763605
    //   2865: l2i
    //   2866: ldc_w 203646298
    //   2869: ixor
    //   2870: ldc2_w -1577974922
    //   2873: l2i
    //   2874: ldc_w -1188492881
    //   2877: ixor
    //   2878: ixor
    //   2879: lookupswitch default -> 2904, 2114343418 -> 2862, 2120008174 -> 9249
    //   2904: getfield minHpPlace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2907: getstatic Perryc.1 : I
    //   2910: ifeq -> 2924
    //   2913: ldc2_w -625087405
    //   2916: l2i
    //   2917: ldc_w -1566570857
    //   2920: ixor
    //   2921: goto -> 2932
    //   2924: ldc2_w 296112927
    //   2927: l2i
    //   2928: ldc_w -832094319
    //   2931: ixor
    //   2932: ldc2_w 1193977324
    //   2935: l2i
    //   2936: ldc_w 2045566294
    //   2939: ixor
    //   2940: ixor
    //   2941: lookupswitch default -> 2968, -757011244 -> 2924, 1188795006 -> 9289
    //   2968: goto -> 2972
    //   2971: athrow
    //   2972: invokevirtual getValue : ()Ljava/lang/Object;
    //   2975: goto -> 2979
    //   2978: athrow
    //   2979: checkcast java/lang/Integer
    //   2982: getstatic Perryc.c : I
    //   2985: iflt -> 2999
    //   2988: ldc2_w 35777534
    //   2991: l2i
    //   2992: ldc_w 1545440492
    //   2995: ixor
    //   2996: goto -> 3007
    //   2999: ldc2_w -1755689161
    //   3002: l2i
    //   3003: ldc_w -1160793170
    //   3006: ixor
    //   3007: ldc2_w 199221236
    //   3010: l2i
    //   3011: ldc_w -2094107537
    //   3014: ixor
    //   3015: ixor
    //   3016: lookupswitch default -> 3044, -691155831 -> 9321, 405360330 -> 2999
    //   3044: goto -> 3048
    //   3047: athrow
    //   3048: invokevirtual intValue : ()I
    //   3051: goto -> 3055
    //   3054: athrow
    //   3055: i2f
    //   3056: fcmpl
    //   3057: iflt -> 3071
    //   3060: ldc2_w 934185963
    //   3063: l2i
    //   3064: ldc_w -1077423468
    //   3067: ixor
    //   3068: goto -> 3079
    //   3071: ldc2_w -1585170620
    //   3074: l2i
    //   3075: ldc_w 703426106
    //   3078: ixor
    //   3079: ldc2_w 98317875
    //   3082: l2i
    //   3083: ldc_w -1318669928
    //   3086: ixor
    //   3087: ixor
    //   3088: tableswitch default -> 3060, 1020518100 -> 3112, 1020518101 -> 3580
    //   3112: getstatic Perryc.1 : I
    //   3115: ifeq -> 3129
    //   3118: ldc2_w 108029892
    //   3121: l2i
    //   3122: ldc_w -1802115319
    //   3125: ixor
    //   3126: goto -> 3137
    //   3129: ldc2_w 1852540506
    //   3132: l2i
    //   3133: ldc_w 1724389250
    //   3136: ixor
    //   3137: ldc2_w 299133008
    //   3140: l2i
    //   3141: ldc_w 17281634
    //   3144: ixor
    //   3145: ixor
    //   3146: lookupswitch default -> 3172, -2110366977 -> 9453, 1440114131 -> 3129
    //   3172: aload_0
    //   3173: ldc2_w 984855235
    //   3176: l2i
    //   3177: ldc_w 984855235
    //   3180: ixor
    //   3181: getstatic Perryc.1 : I
    //   3184: ifeq -> 3198
    //   3187: ldc2_w 1997582236
    //   3190: l2i
    //   3191: ldc_w 1456942791
    //   3194: ixor
    //   3195: goto -> 3206
    //   3198: ldc2_w -228519762
    //   3201: l2i
    //   3202: ldc_w -1923303355
    //   3205: ixor
    //   3206: ldc2_w 999125952
    //   3209: l2i
    //   3210: ldc_w -1218230059
    //   3213: ixor
    //   3214: ixor
    //   3215: lookupswitch default -> 3240, -1389774258 -> 9311, -300834890 -> 3198
    //   3240: putfield facePlacing : Z
    //   3243: getstatic Perryc.c : I
    //   3246: iflt -> 3260
    //   3249: ldc2_w -169294627
    //   3252: l2i
    //   3253: ldc_w -1276545304
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w 619599285
    //   3263: l2i
    //   3264: ldc_w -823305360
    //   3267: ixor
    //   3268: ldc2_w 1118768818
    //   3271: l2i
    //   3272: ldc_w 1797937687
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 9469, -1014605216 -> 3304, 1870980752 -> 3260
    //   3304: aload_0
    //   3305: getstatic Perryc.c : I
    //   3308: iflt -> 3322
    //   3311: ldc2_w -1712217084
    //   3314: l2i
    //   3315: ldc_w -597031913
    //   3318: ixor
    //   3319: goto -> 3330
    //   3322: ldc2_w -585303113
    //   3325: l2i
    //   3326: ldc_w 340556025
    //   3329: ixor
    //   3330: ldc2_w -362631381
    //   3333: l2i
    //   3334: ldc_w -859510516
    //   3337: ixor
    //   3338: ixor
    //   3339: lookupswitch default -> 3364, -1485821965 -> 3322, 1665001012 -> 9365
    //   3364: getfield minHpBreak : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3367: getstatic Perryc.c : I
    //   3370: iflt -> 3384
    //   3373: ldc2_w 1741009784
    //   3376: l2i
    //   3377: ldc_w 2024521086
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w 19046499
    //   3387: l2i
    //   3388: ldc_w -774079554
    //   3391: ixor
    //   3392: ldc2_w -1677746264
    //   3395: l2i
    //   3396: ldc_w -1710100150
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 3428, -455646137 -> 3384, 511729892 -> 9343
    //   3428: goto -> 3432
    //   3431: athrow
    //   3432: invokevirtual getValue : ()Ljava/lang/Object;
    //   3435: goto -> 3439
    //   3438: athrow
    //   3439: checkcast java/lang/Integer
    //   3442: getstatic Perryc.0 : I
    //   3445: ifle -> 3459
    //   3448: ldc2_w 324170319
    //   3451: l2i
    //   3452: ldc_w 859211368
    //   3455: ixor
    //   3456: goto -> 3467
    //   3459: ldc2_w -1377963238
    //   3462: l2i
    //   3463: ldc_w -1025470218
    //   3466: ixor
    //   3467: ldc2_w -764068658
    //   3470: l2i
    //   3471: ldc_w 1374516399
    //   3474: ixor
    //   3475: ixor
    //   3476: lookupswitch default -> 3504, -1543717818 -> 9449, -208161758 -> 3459
    //   3504: goto -> 3508
    //   3507: athrow
    //   3508: invokevirtual intValue : ()I
    //   3511: goto -> 3515
    //   3514: athrow
    //   3515: i2d
    //   3516: getstatic Perryc.c : I
    //   3519: iflt -> 3533
    //   3522: ldc2_w 1094220691
    //   3525: l2i
    //   3526: ldc_w 1113571805
    //   3529: ixor
    //   3530: goto -> 3541
    //   3533: ldc2_w 211722853
    //   3536: l2i
    //   3537: ldc_w -1938640213
    //   3540: ixor
    //   3541: ldc2_w 239765414
    //   3544: l2i
    //   3545: ldc_w 162007926
    //   3548: ixor
    //   3549: ixor
    //   3550: lookupswitch default -> 9275, -2029085666 -> 3576, 75839134 -> 3533
    //   3576: dstore_3
    //   3577: goto -> 6087
    //   3580: getstatic Perryc.1 : I
    //   3583: ifeq -> 3597
    //   3586: ldc2_w 481339516
    //   3589: l2i
    //   3590: ldc_w -605635146
    //   3593: ixor
    //   3594: goto -> 3605
    //   3597: ldc2_w 1164970314
    //   3600: l2i
    //   3601: ldc_w -1004329913
    //   3604: ixor
    //   3605: ldc2_w -319600768
    //   3608: l2i
    //   3609: ldc_w 956074463
    //   3612: ixor
    //   3613: ixor
    //   3614: lookupswitch default -> 9305, 324656021 -> 3597, 1432150866 -> 3640
    //   3640: aload_2
    //   3641: getstatic Perryc.1 : I
    //   3644: ifeq -> 3658
    //   3647: ldc2_w 1871706217
    //   3650: l2i
    //   3651: ldc_w -1126255570
    //   3654: ixor
    //   3655: goto -> 3666
    //   3658: ldc2_w 1823873266
    //   3661: l2i
    //   3662: ldc_w -1182890133
    //   3665: ixor
    //   3666: ldc2_w -343193581
    //   3669: l2i
    //   3670: ldc_w -733141160
    //   3673: ixor
    //   3674: ixor
    //   3675: lookupswitch default -> 9239, -368119598 -> 3700, -325639412 -> 3658
    //   3700: goto -> 3704
    //   3703: athrow
    //   3704: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   3707: goto -> 3711
    //   3710: athrow
    //   3711: getstatic Perryc.1 : I
    //   3714: ifeq -> 3728
    //   3717: ldc2_w 1292048472
    //   3720: l2i
    //   3721: ldc_w 1575262355
    //   3724: ixor
    //   3725: goto -> 3736
    //   3728: ldc2_w 405641408
    //   3731: l2i
    //   3732: ldc_w 1229748268
    //   3735: ixor
    //   3736: ldc2_w 860411867
    //   3739: l2i
    //   3740: ldc_w -103635188
    //   3743: ixor
    //   3744: ixor
    //   3745: lookupswitch default -> 9417, -1678012357 -> 3772, -629280740 -> 3728
    //   3772: aload_0
    //   3773: getstatic Perryc.1 : I
    //   3776: ifeq -> 3790
    //   3779: ldc2_w 1563867551
    //   3782: l2i
    //   3783: ldc_w 70705192
    //   3786: ixor
    //   3787: goto -> 3798
    //   3790: ldc2_w 1401306743
    //   3793: l2i
    //   3794: ldc_w 1457067229
    //   3797: ixor
    //   3798: ldc2_w -633533890
    //   3801: l2i
    //   3802: ldc_w 1381221313
    //   3805: ixor
    //   3806: ixor
    //   3807: lookupswitch default -> 3832, -781283256 -> 9287, 1434761360 -> 3790
    //   3832: getfield facePlaceHP : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3835: getstatic Perryc.0 : I
    //   3838: ifle -> 3852
    //   3841: ldc2_w 925535392
    //   3844: l2i
    //   3845: ldc_w -799224564
    //   3848: ixor
    //   3849: goto -> 3860
    //   3852: ldc2_w -832340724
    //   3855: l2i
    //   3856: ldc_w -683996965
    //   3859: ixor
    //   3860: ldc2_w 689989803
    //   3863: l2i
    //   3864: ldc_w 1111088217
    //   3867: ixor
    //   3868: ixor
    //   3869: lookupswitch default -> 9265, -1938819746 -> 3852, 1916911909 -> 3896
    //   3896: goto -> 3900
    //   3899: athrow
    //   3900: invokevirtual getValue : ()Ljava/lang/Object;
    //   3903: goto -> 3907
    //   3906: athrow
    //   3907: checkcast java/lang/Integer
    //   3910: getstatic Perryc.1 : I
    //   3913: ifeq -> 3927
    //   3916: ldc2_w 796796451
    //   3919: l2i
    //   3920: ldc_w -645601340
    //   3923: ixor
    //   3924: goto -> 3935
    //   3927: ldc2_w -1328580777
    //   3930: l2i
    //   3931: ldc_w -656532078
    //   3934: ixor
    //   3935: ldc2_w -1903038977
    //   3938: l2i
    //   3939: ldc_w 172385565
    //   3942: ixor
    //   3943: ixor
    //   3944: lookupswitch default -> 9261, -322510297 -> 3972, 1915570437 -> 3927
    //   3972: goto -> 3976
    //   3975: athrow
    //   3976: invokevirtual intValue : ()I
    //   3979: goto -> 3983
    //   3982: athrow
    //   3983: i2f
    //   3984: fcmpg
    //   3985: ifgt -> 3999
    //   3988: ldc2_w 1023232097
    //   3991: l2i
    //   3992: ldc_w -199333284
    //   3995: ixor
    //   3996: goto -> 4007
    //   3999: ldc2_w 176633437
    //   4002: l2i
    //   4003: ldc_w -1033628575
    //   4006: ixor
    //   4007: ldc2_w -923843895
    //   4010: l2i
    //   4011: ldc_w -1985651852
    //   4014: ixor
    //   4015: ixor
    //   4016: tableswitch default -> 3988, -1985397888 -> 4040, -1985397887 -> 4364
    //   4040: getstatic Perryc.0 : I
    //   4043: ifle -> 4057
    //   4046: ldc2_w -847457113
    //   4049: l2i
    //   4050: ldc_w 1426419545
    //   4053: ixor
    //   4054: goto -> 4065
    //   4057: ldc2_w 1228652996
    //   4060: l2i
    //   4061: ldc_w -904465128
    //   4064: ixor
    //   4065: ldc2_w -1863873408
    //   4068: l2i
    //   4069: ldc_w -905100307
    //   4072: ixor
    //   4073: ixor
    //   4074: lookupswitch default -> 9307, -1030523757 -> 4057, -641205327 -> 4100
    //   4100: aload_0
    //   4101: getstatic Perryc.c : I
    //   4104: iflt -> 4118
    //   4107: ldc2_w -2102682451
    //   4110: l2i
    //   4111: ldc_w -1710038544
    //   4114: ixor
    //   4115: goto -> 4126
    //   4118: ldc2_w 1235682140
    //   4121: l2i
    //   4122: ldc_w 975410824
    //   4125: ixor
    //   4126: ldc2_w 142374539
    //   4129: l2i
    //   4130: ldc_w 1216754498
    //   4133: ixor
    //   4134: ixor
    //   4135: lookupswitch default -> 4160, 460291981 -> 4118, 1480800404 -> 9251
    //   4160: getfield faceplace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4163: getstatic Perryc.0 : I
    //   4166: ifle -> 4180
    //   4169: ldc2_w 1382952838
    //   4172: l2i
    //   4173: ldc_w -796003780
    //   4176: ixor
    //   4177: goto -> 4188
    //   4180: ldc2_w -1174860710
    //   4183: l2i
    //   4184: ldc_w 1736339563
    //   4187: ixor
    //   4188: ldc2_w 1431796460
    //   4191: l2i
    //   4192: ldc_w 1923164897
    //   4195: ixor
    //   4196: ixor
    //   4197: lookupswitch default -> 9299, -1525314121 -> 4180, -110023620 -> 4224
    //   4224: goto -> 4228
    //   4227: athrow
    //   4228: invokevirtual getValue : ()Ljava/lang/Object;
    //   4231: goto -> 4235
    //   4234: athrow
    //   4235: checkcast java/lang/Boolean
    //   4238: getstatic Perryc.0 : I
    //   4241: ifle -> 4255
    //   4244: ldc2_w 1043896915
    //   4247: l2i
    //   4248: ldc_w -1903112452
    //   4251: ixor
    //   4252: goto -> 4263
    //   4255: ldc2_w 801386399
    //   4258: l2i
    //   4259: ldc_w -1372724587
    //   4262: ixor
    //   4263: ldc2_w -1952848981
    //   4266: l2i
    //   4267: ldc_w 42160751
    //   4270: ixor
    //   4271: ixor
    //   4272: lookupswitch default -> 4300, -537409830 -> 4255, 968025451 -> 9233
    //   4300: goto -> 4304
    //   4303: athrow
    //   4304: invokevirtual booleanValue : ()Z
    //   4307: goto -> 4311
    //   4310: athrow
    //   4311: ifne -> 4325
    //   4314: ldc2_w 1020969465
    //   4317: l2i
    //   4318: ldc_w 1701867494
    //   4321: ixor
    //   4322: goto -> 4333
    //   4325: ldc2_w -417497104
    //   4328: l2i
    //   4329: ldc_w -1095249426
    //   4332: ixor
    //   4333: ldc2_w 1494173354
    //   4336: l2i
    //   4337: ldc_w -110895241
    //   4340: ixor
    //   4341: ixor
    //   4342: tableswitch default -> 4314, -104450110 -> 4364, -104450109 -> 5216
    //   4364: getstatic Perryc.c : I
    //   4367: iflt -> 4381
    //   4370: ldc2_w 879004217
    //   4373: l2i
    //   4374: ldc_w -1798237427
    //   4377: ixor
    //   4378: goto -> 4389
    //   4381: ldc2_w -458316765
    //   4384: l2i
    //   4385: ldc_w -480106338
    //   4388: ixor
    //   4389: ldc2_w 778864647
    //   4392: l2i
    //   4393: ldc_w 1398847214
    //   4396: ixor
    //   4397: ixor
    //   4398: lookupswitch default -> 9381, -575035427 -> 4381, 2059448916 -> 4424
    //   4424: aload_2
    //   4425: getstatic Perryc.1 : I
    //   4428: ifeq -> 4442
    //   4431: ldc2_w -1940880626
    //   4434: l2i
    //   4435: ldc_w 750683395
    //   4438: ixor
    //   4439: goto -> 4450
    //   4442: ldc2_w -220915347
    //   4445: l2i
    //   4446: ldc_w 1510403897
    //   4449: ixor
    //   4450: ldc2_w 1298485768
    //   4453: l2i
    //   4454: ldc_w -1131507425
    //   4457: ixor
    //   4458: ixor
    //   4459: lookupswitch default -> 9421, 1359332634 -> 4442, 1496855875 -> 4484
    //   4484: aload_0
    //   4485: getstatic Perryc.0 : I
    //   4488: ifle -> 4502
    //   4491: ldc2_w 219860393
    //   4494: l2i
    //   4495: ldc_w 964155161
    //   4498: ixor
    //   4499: goto -> 4510
    //   4502: ldc2_w 1177651461
    //   4505: l2i
    //   4506: ldc_w 1988313619
    //   4509: ixor
    //   4510: ldc2_w 1256916227
    //   4513: l2i
    //   4514: ldc_w 1620776896
    //   4517: ixor
    //   4518: ixor
    //   4519: lookupswitch default -> 9337, 448977365 -> 4544, 505219187 -> 4502
    //   4544: getfield fuckArmourHP : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4547: getstatic Perryc.0 : I
    //   4550: ifle -> 4564
    //   4553: ldc2_w -1977991910
    //   4556: l2i
    //   4557: ldc_w -1113652424
    //   4560: ixor
    //   4561: goto -> 4572
    //   4564: ldc2_w 1329884335
    //   4567: l2i
    //   4568: ldc_w 1665839169
    //   4571: ixor
    //   4572: ldc2_w 972199716
    //   4575: l2i
    //   4576: ldc_w -1773498833
    //   4579: ixor
    //   4580: ixor
    //   4581: lookupswitch default -> 4608, -1740822743 -> 9425, -809303238 -> 4564
    //   4608: goto -> 4612
    //   4611: athrow
    //   4612: invokevirtual getValue : ()Ljava/lang/Object;
    //   4615: goto -> 4619
    //   4618: athrow
    //   4619: checkcast java/lang/Integer
    //   4622: getstatic Perryc.0 : I
    //   4625: ifle -> 4639
    //   4628: ldc2_w -1188843226
    //   4631: l2i
    //   4632: ldc_w -1515890318
    //   4635: ixor
    //   4636: goto -> 4647
    //   4639: ldc2_w -434902080
    //   4642: l2i
    //   4643: ldc_w -481969418
    //   4646: ixor
    //   4647: ldc2_w 440258043
    //   4650: l2i
    //   4651: ldc_w -1483049141
    //   4654: ixor
    //   4655: ixor
    //   4656: lookupswitch default -> 9431, -1591651612 -> 4639, -1192105082 -> 4684
    //   4684: goto -> 4688
    //   4687: athrow
    //   4688: invokevirtual intValue : ()I
    //   4691: goto -> 4695
    //   4694: athrow
    //   4695: i2f
    //   4696: getstatic Perryc.1 : I
    //   4699: ifeq -> 4713
    //   4702: ldc2_w 229789431
    //   4705: l2i
    //   4706: ldc_w 912937180
    //   4709: ixor
    //   4710: goto -> 4721
    //   4713: ldc2_w -1209227058
    //   4716: l2i
    //   4717: ldc_w -972320693
    //   4720: ixor
    //   4721: ldc2_w -366574030
    //   4724: l2i
    //   4725: ldc_w -1444370069
    //   4728: ixor
    //   4729: ixor
    //   4730: lookupswitch default -> 4756, -1409999374 -> 4713, 2014720370 -> 9349
    //   4756: goto -> 4760
    //   4759: athrow
    //   4760: invokestatic getArmourFucker : (Lnet/minecraft/entity/player/EntityPlayer;F)Ljava/lang/Boolean;
    //   4763: goto -> 4767
    //   4766: athrow
    //   4767: getstatic Perryc.0 : I
    //   4770: ifle -> 4784
    //   4773: ldc2_w -931537706
    //   4776: l2i
    //   4777: ldc_w 193439635
    //   4780: ixor
    //   4781: goto -> 4792
    //   4784: ldc2_w -1930335194
    //   4787: l2i
    //   4788: ldc_w 772901123
    //   4791: ixor
    //   4792: ldc2_w -1695641987
    //   4795: l2i
    //   4796: ldc_w -2010856819
    //   4799: ixor
    //   4800: ixor
    //   4801: lookupswitch default -> 4828, -1534465059 -> 4784, -785107019 -> 9427
    //   4828: goto -> 4832
    //   4831: athrow
    //   4832: invokevirtual booleanValue : ()Z
    //   4835: goto -> 4839
    //   4838: athrow
    //   4839: ifeq -> 4853
    //   4842: ldc2_w 2018062519
    //   4845: l2i
    //   4846: ldc_w 222567179
    //   4849: ixor
    //   4850: goto -> 4861
    //   4853: ldc2_w 977863856
    //   4856: l2i
    //   4857: ldc_w 1329868547
    //   4860: ixor
    //   4861: ldc2_w 844825134
    //   4864: l2i
    //   4865: ldc_w -532498811
    //   4868: ixor
    //   4869: ixor
    //   4870: tableswitch default -> 4842, -1491820777 -> 4892, -1491820776 -> 5622
    //   4892: getstatic Perryc.1 : I
    //   4895: ifeq -> 4909
    //   4898: ldc2_w -620266419
    //   4901: l2i
    //   4902: ldc_w -1788164964
    //   4905: ixor
    //   4906: goto -> 4917
    //   4909: ldc2_w -1923122409
    //   4912: l2i
    //   4913: ldc_w -1573725111
    //   4916: ixor
    //   4917: ldc2_w -981228135
    //   4920: l2i
    //   4921: ldc_w -1721927121
    //   4924: ixor
    //   4925: ixor
    //   4926: lookupswitch default -> 4952, -229492720 -> 4909, 313747303 -> 9435
    //   4952: aload_0
    //   4953: getstatic Perryc.0 : I
    //   4956: ifle -> 4970
    //   4959: ldc2_w -209578812
    //   4962: l2i
    //   4963: ldc_w 1113075188
    //   4966: ixor
    //   4967: goto -> 4978
    //   4970: ldc2_w -930171964
    //   4973: l2i
    //   4974: ldc_w 414512580
    //   4977: ixor
    //   4978: ldc2_w 1762262655
    //   4981: l2i
    //   4982: ldc_w -952434540
    //   4985: ixor
    //   4986: ixor
    //   4987: lookupswitch default -> 9375, 535349211 -> 4970, 2114500843 -> 5012
    //   5012: getfield fuckArmour : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5015: getstatic Perryc.0 : I
    //   5018: ifle -> 5032
    //   5021: ldc2_w 1751800629
    //   5024: l2i
    //   5025: ldc_w 776361735
    //   5028: ixor
    //   5029: goto -> 5040
    //   5032: ldc2_w -1422480506
    //   5035: l2i
    //   5036: ldc_w -267617566
    //   5039: ixor
    //   5040: ldc2_w -2058020883
    //   5043: l2i
    //   5044: ldc_w 1993729438
    //   5047: ixor
    //   5048: ixor
    //   5049: lookupswitch default -> 5076, -1246953919 -> 9243, 488280305 -> 5032
    //   5076: goto -> 5080
    //   5079: athrow
    //   5080: invokevirtual getValue : ()Ljava/lang/Object;
    //   5083: goto -> 5087
    //   5086: athrow
    //   5087: checkcast java/lang/Boolean
    //   5090: getstatic Perryc.0 : I
    //   5093: ifle -> 5107
    //   5096: ldc2_w 1559141628
    //   5099: l2i
    //   5100: ldc_w -522901745
    //   5103: ixor
    //   5104: goto -> 5115
    //   5107: ldc2_w 1987531919
    //   5110: l2i
    //   5111: ldc_w -1584983378
    //   5114: ixor
    //   5115: ldc2_w -639706803
    //   5118: l2i
    //   5119: ldc_w -708410992
    //   5122: ixor
    //   5123: ixor
    //   5124: lookupswitch default -> 9277, -1339825362 -> 5107, -605544708 -> 5152
    //   5152: goto -> 5156
    //   5155: athrow
    //   5156: invokevirtual booleanValue : ()Z
    //   5159: goto -> 5163
    //   5162: athrow
    //   5163: ifeq -> 5177
    //   5166: ldc2_w 1007363817
    //   5169: l2i
    //   5170: ldc_w -1660448295
    //   5173: ixor
    //   5174: goto -> 5185
    //   5177: ldc2_w 2113342974
    //   5180: l2i
    //   5181: ldc_w -587482417
    //   5184: ixor
    //   5185: ldc2_w -1734122033
    //   5188: l2i
    //   5189: ldc_w -204368887
    //   5192: ixor
    //   5193: ixor
    //   5194: tableswitch default -> 5166, -897693962 -> 5216, -897693961 -> 5622
    //   5216: getstatic Perryc.0 : I
    //   5219: ifle -> 5233
    //   5222: ldc2_w 1963907118
    //   5225: l2i
    //   5226: ldc_w 920455699
    //   5229: ixor
    //   5230: goto -> 5241
    //   5233: ldc2_w 2040206208
    //   5236: l2i
    //   5237: ldc_w -616657476
    //   5240: ixor
    //   5241: ldc2_w -987796069
    //   5244: l2i
    //   5245: ldc_w -342031836
    //   5248: ixor
    //   5249: ixor
    //   5250: lookupswitch default -> 9293, -1943539325 -> 5276, 1834073474 -> 5233
    //   5276: aload_2
    //   5277: getstatic Perryc.c : I
    //   5280: iflt -> 5294
    //   5283: ldc2_w 526729371
    //   5286: l2i
    //   5287: ldc_w -1430443605
    //   5290: ixor
    //   5291: goto -> 5302
    //   5294: ldc2_w 383654531
    //   5297: l2i
    //   5298: ldc_w 38609772
    //   5301: ixor
    //   5302: ldc2_w -1939812014
    //   5305: l2i
    //   5306: ldc_w 830341192
    //   5309: ixor
    //   5310: ixor
    //   5311: lookupswitch default -> 9377, -1450317579 -> 5336, 147241002 -> 5294
    //   5336: goto -> 5340
    //   5339: athrow
    //   5340: invokestatic isInHole : (Lnet/minecraft/entity/Entity;)Z
    //   5343: goto -> 5347
    //   5346: athrow
    //   5347: ifeq -> 5361
    //   5350: ldc2_w 1326084642
    //   5353: l2i
    //   5354: ldc_w -1333668767
    //   5357: ixor
    //   5358: goto -> 5369
    //   5361: ldc2_w 1109506070
    //   5364: l2i
    //   5365: ldc_w -1112924582
    //   5368: ixor
    //   5369: ldc2_w -970599193
    //   5372: l2i
    //   5373: ldc_w -1549935469
    //   5376: ixor
    //   5377: ixor
    //   5378: tableswitch default -> 5350, -1707889097 -> 5400, -1707889096 -> 5416
    //   5400: ldc2_w 40.265068535495395
    //   5403: invokestatic doubleToLongBits : (D)J
    //   5406: ldc2_w 9202017243704693599
    //   5409: lxor
    //   5410: invokestatic longBitsToDouble : (J)D
    //   5413: goto -> 5429
    //   5416: ldc2_w 0.22250490992904223
    //   5419: invokestatic doubleToLongBits : (D)J
    //   5422: ldc2_w 9208870622953479651
    //   5425: lxor
    //   5426: invokestatic longBitsToDouble : (J)D
    //   5429: getstatic Perryc.1 : I
    //   5432: ifeq -> 5446
    //   5435: ldc2_w -1959234959
    //   5438: l2i
    //   5439: ldc_w -1423782758
    //   5442: ixor
    //   5443: goto -> 5454
    //   5446: ldc2_w 1750971152
    //   5449: l2i
    //   5450: ldc_w 1382905212
    //   5453: ixor
    //   5454: ldc2_w 793010989
    //   5457: l2i
    //   5458: ldc_w -1149247000
    //   5461: ixor
    //   5462: ixor
    //   5463: lookupswitch default -> 9259, -1374993239 -> 5488, -1272890322 -> 5446
    //   5488: dstore_3
    //   5489: getstatic Perryc.c : I
    //   5492: iflt -> 5506
    //   5495: ldc2_w -1673950525
    //   5498: l2i
    //   5499: ldc_w 2087902689
    //   5502: ixor
    //   5503: goto -> 5514
    //   5506: ldc2_w -698959597
    //   5509: l2i
    //   5510: ldc_w -1080028719
    //   5513: ixor
    //   5514: ldc2_w 513959338
    //   5517: l2i
    //   5518: ldc_w 198602276
    //   5521: ixor
    //   5522: ixor
    //   5523: lookupswitch default -> 9415, -180396884 -> 5506, 2088936268 -> 5548
    //   5548: aload_0
    //   5549: ldc2_w -1585295154
    //   5552: l2i
    //   5553: ldc_w -1585295153
    //   5556: ixor
    //   5557: getstatic Perryc.c : I
    //   5560: iflt -> 5574
    //   5563: ldc2_w 1287792393
    //   5566: l2i
    //   5567: ldc_w 1504395730
    //   5570: ixor
    //   5571: goto -> 5582
    //   5574: ldc2_w 1376180712
    //   5577: l2i
    //   5578: ldc_w 502902464
    //   5581: ixor
    //   5582: ldc2_w -1977932844
    //   5585: l2i
    //   5586: ldc_w -1490868479
    //   5589: ixor
    //   5590: ixor
    //   5591: lookupswitch default -> 9455, 944857614 -> 5574, 1657238525 -> 5616
    //   5616: putfield facePlacing : Z
    //   5619: goto -> 6087
    //   5622: getstatic Perryc.c : I
    //   5625: iflt -> 5639
    //   5628: ldc2_w -744995256
    //   5631: l2i
    //   5632: ldc_w 90928915
    //   5635: ixor
    //   5636: goto -> 5647
    //   5639: ldc2_w -1386766236
    //   5642: l2i
    //   5643: ldc_w -1568151250
    //   5646: ixor
    //   5647: ldc2_w 620444070
    //   5650: l2i
    //   5651: ldc_w -1977292268
    //   5654: ixor
    //   5655: ixor
    //   5656: lookupswitch default -> 5684, 306671128 -> 5639, 2016207593 -> 9359
    //   5684: aload_0
    //   5685: getstatic Perryc.0 : I
    //   5688: ifle -> 5702
    //   5691: ldc2_w 1786930260
    //   5694: l2i
    //   5695: ldc_w 1943752770
    //   5698: ixor
    //   5699: goto -> 5710
    //   5702: ldc2_w -1394405232
    //   5705: l2i
    //   5706: ldc_w 2044008714
    //   5709: ixor
    //   5710: ldc2_w -23195506
    //   5713: l2i
    //   5714: ldc_w -1869426595
    //   5717: ixor
    //   5718: ixor
    //   5719: lookupswitch default -> 9433, -1153775287 -> 5744, 2002121925 -> 5702
    //   5744: getfield minHpPlace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5747: getstatic Perryc.0 : I
    //   5750: ifle -> 5764
    //   5753: ldc2_w -609841010
    //   5756: l2i
    //   5757: ldc_w 1711575267
    //   5760: ixor
    //   5761: goto -> 5772
    //   5764: ldc2_w 154444706
    //   5767: l2i
    //   5768: ldc_w 1339563075
    //   5771: ixor
    //   5772: ldc2_w 1132692330
    //   5775: l2i
    //   5776: ldc_w -1719433647
    //   5779: ixor
    //   5780: ixor
    //   5781: lookupswitch default -> 9411, -1662207270 -> 5808, 1738671446 -> 5764
    //   5808: goto -> 5812
    //   5811: athrow
    //   5812: invokevirtual getValue : ()Ljava/lang/Object;
    //   5815: goto -> 5819
    //   5818: athrow
    //   5819: checkcast java/lang/Integer
    //   5822: getstatic Perryc.1 : I
    //   5825: ifeq -> 5839
    //   5828: ldc2_w 693637987
    //   5831: l2i
    //   5832: ldc_w 1067888317
    //   5835: ixor
    //   5836: goto -> 5847
    //   5839: ldc2_w 2086944231
    //   5842: l2i
    //   5843: ldc_w 70941261
    //   5846: ixor
    //   5847: ldc2_w 506967479
    //   5850: l2i
    //   5851: ldc_w 732285589
    //   5854: ixor
    //   5855: ixor
    //   5856: lookupswitch default -> 9441, 594330364 -> 5839, 1305229448 -> 5884
    //   5884: goto -> 5888
    //   5887: athrow
    //   5888: invokevirtual intValue : ()I
    //   5891: goto -> 5895
    //   5894: athrow
    //   5895: i2d
    //   5896: getstatic Perryc.0 : I
    //   5899: ifle -> 5913
    //   5902: ldc2_w 935138870
    //   5905: l2i
    //   5906: ldc_w 1429153179
    //   5909: ixor
    //   5910: goto -> 5921
    //   5913: ldc2_w -2057306192
    //   5916: l2i
    //   5917: ldc_w 560964818
    //   5920: ixor
    //   5921: ldc2_w 1358858819
    //   5924: l2i
    //   5925: ldc_w 909084568
    //   5928: ixor
    //   5929: ixor
    //   5930: lookupswitch default -> 5956, 71515766 -> 9413, 941108017 -> 5913
    //   5956: dstore_3
    //   5957: getstatic Perryc.1 : I
    //   5960: ifeq -> 5974
    //   5963: ldc2_w 837852646
    //   5966: l2i
    //   5967: ldc_w -1658850816
    //   5970: ixor
    //   5971: goto -> 5982
    //   5974: ldc2_w 1398696713
    //   5977: l2i
    //   5978: ldc_w 519037575
    //   5981: ixor
    //   5982: ldc2_w -1637932324
    //   5985: l2i
    //   5986: ldc_w -1864095611
    //   5989: ixor
    //   5990: ixor
    //   5991: lookupswitch default -> 9459, -1571527233 -> 5974, 1124762583 -> 6016
    //   6016: aload_0
    //   6017: ldc2_w 193775253
    //   6020: l2i
    //   6021: ldc_w 193775253
    //   6024: ixor
    //   6025: getstatic Perryc.c : I
    //   6028: iflt -> 6042
    //   6031: ldc2_w -1774202034
    //   6034: l2i
    //   6035: ldc_w -659666477
    //   6038: ixor
    //   6039: goto -> 6050
    //   6042: ldc2_w 1531456954
    //   6045: l2i
    //   6046: ldc_w 1206621822
    //   6049: ixor
    //   6050: ldc2_w -988904452
    //   6053: l2i
    //   6054: ldc_w 2001712969
    //   6057: ixor
    //   6058: ixor
    //   6059: lookupswitch default -> 6084, -804220144 -> 6042, -53432792 -> 9409
    //   6084: putfield facePlacing : Z
    //   6087: getstatic Perryc.1 : I
    //   6090: ifeq -> 6104
    //   6093: ldc2_w -1209492528
    //   6096: l2i
    //   6097: ldc_w 858198356
    //   6100: ixor
    //   6101: goto -> 6112
    //   6104: ldc2_w 992646789
    //   6107: l2i
    //   6108: ldc_w 1106299211
    //   6111: ixor
    //   6112: ldc2_w 1120897981
    //   6115: l2i
    //   6116: ldc_w 764403969
    //   6119: ixor
    //   6120: ixor
    //   6121: lookupswitch default -> 6148, -1844279975 -> 6104, -342892488 -> 9383
    //   6148: aload_1
    //   6149: getstatic Perryc.0 : I
    //   6152: ifle -> 6166
    //   6155: ldc2_w -1092028097
    //   6158: l2i
    //   6159: ldc_w -1068680176
    //   6162: ixor
    //   6163: goto -> 6174
    //   6166: ldc2_w 697988664
    //   6169: l2i
    //   6170: ldc_w -1438984038
    //   6173: ixor
    //   6174: ldc2_w -847458088
    //   6177: l2i
    //   6178: ldc_w 710341358
    //   6181: ixor
    //   6182: ixor
    //   6183: lookupswitch default -> 9329, -1718622439 -> 6166, 1686801556 -> 6208
    //   6208: aload_2
    //   6209: getstatic Perryc.c : I
    //   6212: iflt -> 6226
    //   6215: ldc2_w 649082545
    //   6218: l2i
    //   6219: ldc_w 965840003
    //   6222: ixor
    //   6223: goto -> 6234
    //   6226: ldc2_w -510402980
    //   6229: l2i
    //   6230: ldc_w -1629625479
    //   6233: ixor
    //   6234: ldc2_w -1341190557
    //   6237: l2i
    //   6238: ldc_w -1414973629
    //   6241: ixor
    //   6242: ixor
    //   6243: lookupswitch default -> 6268, -936775484 -> 6226, 75989778 -> 9301
    //   6268: aload_0
    //   6269: getstatic Perryc.0 : I
    //   6272: ifle -> 6286
    //   6275: ldc2_w 54338455
    //   6278: l2i
    //   6279: ldc_w -753598414
    //   6282: ixor
    //   6283: goto -> 6294
    //   6286: ldc2_w 972575906
    //   6289: l2i
    //   6290: ldc_w 336551590
    //   6293: ixor
    //   6294: ldc2_w 170243240
    //   6297: l2i
    //   6298: ldc_w -561562184
    //   6301: ixor
    //   6302: ixor
    //   6303: lookupswitch default -> 6328, -231983887 -> 6286, 76196533 -> 9351
    //   6328: getfield ignoreTerrain : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6331: getstatic Perryc.0 : I
    //   6334: ifle -> 6348
    //   6337: ldc2_w 751555902
    //   6340: l2i
    //   6341: ldc_w -1471392332
    //   6344: ixor
    //   6345: goto -> 6356
    //   6348: ldc2_w 1664157652
    //   6351: l2i
    //   6352: ldc_w -1689134847
    //   6355: ixor
    //   6356: ldc2_w 9194271
    //   6359: l2i
    //   6360: ldc_w 106765817
    //   6363: ixor
    //   6364: ixor
    //   6365: lookupswitch default -> 6392, -2108238228 -> 9429, 1161658337 -> 6348
    //   6392: goto -> 6396
    //   6395: athrow
    //   6396: invokevirtual getValue : ()Ljava/lang/Object;
    //   6399: goto -> 6403
    //   6402: athrow
    //   6403: checkcast java/lang/Boolean
    //   6406: getstatic Perryc.1 : I
    //   6409: ifeq -> 6423
    //   6412: ldc2_w -562103983
    //   6415: l2i
    //   6416: ldc_w -207423653
    //   6419: ixor
    //   6420: goto -> 6431
    //   6423: ldc2_w 947986892
    //   6426: l2i
    //   6427: ldc_w -1514831271
    //   6430: ixor
    //   6431: ldc2_w 213375118
    //   6434: l2i
    //   6435: ldc_w -722808117
    //   6438: ixor
    //   6439: ixor
    //   6440: lookupswitch default -> 6468, -176094129 -> 9315, 636365882 -> 6423
    //   6468: goto -> 6472
    //   6471: athrow
    //   6472: invokevirtual booleanValue : ()Z
    //   6475: goto -> 6479
    //   6478: athrow
    //   6479: getstatic Perryc.1 : I
    //   6482: ifeq -> 6496
    //   6485: ldc2_w 1928345676
    //   6488: l2i
    //   6489: ldc_w -1385629703
    //   6492: ixor
    //   6493: goto -> 6504
    //   6496: ldc2_w 1185452108
    //   6499: l2i
    //   6500: ldc_w -466009742
    //   6503: ixor
    //   6504: ldc2_w 1037296946
    //   6507: l2i
    //   6508: ldc_w 1229122296
    //   6511: ixor
    //   6512: ixor
    //   6513: lookupswitch default -> 6540, -1425424257 -> 9363, 721889502 -> 6496
    //   6540: goto -> 6544
    //   6543: athrow
    //   6544: invokestatic calculateDamage : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Z)F
    //   6547: goto -> 6551
    //   6550: athrow
    //   6551: f2d
    //   6552: getstatic Perryc.0 : I
    //   6555: ifle -> 6569
    //   6558: ldc2_w -1848647225
    //   6561: l2i
    //   6562: ldc_w -123700934
    //   6565: ixor
    //   6566: goto -> 6577
    //   6569: ldc2_w -609972083
    //   6572: l2i
    //   6573: ldc_w 919271412
    //   6576: ixor
    //   6577: ldc2_w 206407405
    //   6580: l2i
    //   6581: ldc_w -395819491
    //   6584: ixor
    //   6585: ixor
    //   6586: lookupswitch default -> 6612, -1924507635 -> 9273, 2062259480 -> 6569
    //   6612: dstore #5
    //   6614: getstatic Perryc.1 : I
    //   6617: ifeq -> 6631
    //   6620: ldc2_w 257004380
    //   6623: l2i
    //   6624: ldc_w 2025003858
    //   6627: ixor
    //   6628: goto -> 6639
    //   6631: ldc2_w -1896485104
    //   6634: l2i
    //   6635: ldc_w -672550412
    //   6638: ixor
    //   6639: ldc2_w -73281017
    //   6642: l2i
    //   6643: ldc_w -1021556645
    //   6646: ixor
    //   6647: ixor
    //   6648: lookupswitch default -> 6676, -827621074 -> 6631, 1331630674 -> 9357
    //   6676: dload #5
    //   6678: getstatic Perryc.0 : I
    //   6681: ifle -> 6695
    //   6684: ldc2_w 560554376
    //   6687: l2i
    //   6688: ldc_w 1700307743
    //   6691: ixor
    //   6692: goto -> 6703
    //   6695: ldc2_w -1879591094
    //   6698: l2i
    //   6699: ldc_w -277911503
    //   6702: ixor
    //   6703: ldc2_w 1272037803
    //   6706: l2i
    //   6707: ldc_w -1338957689
    //   6710: ixor
    //   6711: ixor
    //   6712: lookupswitch default -> 9463, -1686618537 -> 6740, -1076812869 -> 6695
    //   6740: dload_3
    //   6741: dcmpg
    //   6742: ifge -> 6756
    //   6745: ldc2_w 730520882
    //   6748: l2i
    //   6749: ldc_w 486403902
    //   6752: ixor
    //   6753: goto -> 6764
    //   6756: ldc2_w 1690935970
    //   6759: l2i
    //   6760: ldc_w 1404997807
    //   6763: ixor
    //   6764: ldc2_w -1191611401
    //   6767: l2i
    //   6768: ldc_w -876578085
    //   6771: ixor
    //   6772: ixor
    //   6773: tableswitch default -> 6745, 1145977632 -> 6796, 1145977633 -> 7074
    //   6796: getstatic Perryc.1 : I
    //   6799: ifeq -> 6813
    //   6802: ldc2_w 678458714
    //   6805: l2i
    //   6806: ldc_w 737566060
    //   6809: ixor
    //   6810: goto -> 6821
    //   6813: ldc2_w -339225275
    //   6816: l2i
    //   6817: ldc_w 537169365
    //   6820: ixor
    //   6821: ldc2_w 1523434907
    //   6824: l2i
    //   6825: ldc_w 1372330192
    //   6828: ixor
    //   6829: ixor
    //   6830: lookupswitch default -> 9285, -1060993573 -> 6856, 143127933 -> 6813
    //   6856: aload_2
    //   6857: getstatic Perryc.0 : I
    //   6860: ifle -> 6874
    //   6863: ldc2_w 613842069
    //   6866: l2i
    //   6867: ldc_w -115555814
    //   6870: ixor
    //   6871: goto -> 6882
    //   6874: ldc2_w 194562807
    //   6877: l2i
    //   6878: ldc_w -1300293979
    //   6881: ixor
    //   6882: ldc2_w 414666463
    //   6885: l2i
    //   6886: ldc_w 556344920
    //   6889: ixor
    //   6890: ixor
    //   6891: lookupswitch default -> 6916, -468396536 -> 9385, 846158271 -> 6874
    //   6916: goto -> 6920
    //   6919: athrow
    //   6920: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   6923: goto -> 6927
    //   6926: athrow
    //   6927: f2d
    //   6928: getstatic Perryc.1 : I
    //   6931: ifeq -> 6945
    //   6934: ldc2_w 1223627149
    //   6937: l2i
    //   6938: ldc_w -1706421800
    //   6941: ixor
    //   6942: goto -> 6953
    //   6945: ldc2_w 1867506046
    //   6948: l2i
    //   6949: ldc_w 1864979535
    //   6952: ixor
    //   6953: ldc2_w 1059348243
    //   6956: l2i
    //   6957: ldc_w -2002956670
    //   6960: ixor
    //   6961: ixor
    //   6962: lookupswitch default -> 9387, -1210080096 -> 6988, 1696338372 -> 6945
    //   6988: dload #5
    //   6990: dsub
    //   6991: ldc2_w 1.9957106442710673E307
    //   6994: invokestatic doubleToLongBits : (D)J
    //   6997: ldc2_w 9204349919348515223
    //   7000: lxor
    //   7001: invokestatic longBitsToDouble : (J)D
    //   7004: dcmpl
    //   7005: ifle -> 7019
    //   7008: ldc2_w 282023424
    //   7011: l2i
    //   7012: ldc_w -1159487377
    //   7015: ixor
    //   7016: goto -> 7027
    //   7019: ldc2_w 283983863
    //   7022: l2i
    //   7023: ldc_w -1161705063
    //   7026: ixor
    //   7027: ldc2_w -1657333698
    //   7030: l2i
    //   7031: ldc_w -1326101811
    //   7034: ixor
    //   7035: ixor
    //   7036: tableswitch default -> 7008, -2014403428 -> 7060, -2014403427 -> 7074
    //   7060: ldc2_w 5.244263330801408E307
    //   7063: invokestatic doubleToLongBits : (D)J
    //   7066: ldc2_w 9210612831664867549
    //   7069: lxor
    //   7070: invokestatic longBitsToDouble : (J)D
    //   7073: dreturn
    //   7074: ldc2_w 8.424783156527151E306
    //   7077: invokestatic doubleToLongBits : (D)J
    //   7080: ldc2_w 9198600713000081631
    //   7083: lxor
    //   7084: invokestatic longBitsToDouble : (J)D
    //   7087: getstatic Perryc.0 : I
    //   7090: ifle -> 7104
    //   7093: ldc2_w -724106830
    //   7096: l2i
    //   7097: ldc_w 1045083141
    //   7100: ixor
    //   7101: goto -> 7112
    //   7104: ldc2_w 1528644080
    //   7107: l2i
    //   7108: ldc_w 65635138
    //   7111: ixor
    //   7112: ldc2_w -1389037576
    //   7115: l2i
    //   7116: ldc_w -288703080
    //   7119: ixor
    //   7120: ixor
    //   7121: lookupswitch default -> 9451, -1453064233 -> 7104, 453675218 -> 7148
    //   7148: dstore #7
    //   7150: getstatic Perryc.0 : I
    //   7153: ifle -> 7167
    //   7156: ldc2_w -574369986
    //   7159: l2i
    //   7160: ldc_w 1436637498
    //   7163: ixor
    //   7164: goto -> 7175
    //   7167: ldc2_w -1599354376
    //   7170: l2i
    //   7171: ldc_w -942094815
    //   7174: ixor
    //   7175: ldc2_w 1999653052
    //   7178: l2i
    //   7179: ldc_w 1519220330
    //   7182: ixor
    //   7183: ixor
    //   7184: lookupswitch default -> 7212, -1512068910 -> 9339, 1889884813 -> 7167
    //   7212: aload_0
    //   7213: getstatic Perryc.0 : I
    //   7216: ifle -> 7230
    //   7219: ldc2_w -1235825604
    //   7222: l2i
    //   7223: ldc_w -29021036
    //   7226: ixor
    //   7227: goto -> 7238
    //   7230: ldc2_w 1937478697
    //   7233: l2i
    //   7234: ldc_w -873350188
    //   7237: ixor
    //   7238: ldc2_w 585323707
    //   7241: l2i
    //   7242: ldc_w -90276580
    //   7245: ixor
    //   7246: ixor
    //   7247: lookupswitch default -> 7272, -2139548384 -> 7230, -1871787761 -> 9327
    //   7272: getfield ignoreSelfDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7275: getstatic Perryc.0 : I
    //   7278: ifle -> 7292
    //   7281: ldc2_w -1610375835
    //   7284: l2i
    //   7285: ldc_w -1056427104
    //   7288: ixor
    //   7289: goto -> 7300
    //   7292: ldc2_w 1509933084
    //   7295: l2i
    //   7296: ldc_w 757319333
    //   7299: ixor
    //   7300: ldc2_w 1787217085
    //   7303: l2i
    //   7304: ldc_w 639603414
    //   7307: ixor
    //   7308: ixor
    //   7309: lookupswitch default -> 9437, 764606638 -> 7292, 944066770 -> 7336
    //   7336: goto -> 7340
    //   7339: athrow
    //   7340: invokevirtual getValue : ()Ljava/lang/Object;
    //   7343: goto -> 7347
    //   7346: athrow
    //   7347: checkcast java/lang/Boolean
    //   7350: getstatic Perryc.0 : I
    //   7353: ifle -> 7367
    //   7356: ldc2_w -1322200863
    //   7359: l2i
    //   7360: ldc_w 892196290
    //   7363: ixor
    //   7364: goto -> 7375
    //   7367: ldc2_w 236986016
    //   7370: l2i
    //   7371: ldc_w -193206112
    //   7374: ixor
    //   7375: ldc2_w 924378086
    //   7378: l2i
    //   7379: ldc_w -618678596
    //   7382: ixor
    //   7383: ixor
    //   7384: lookupswitch default -> 9331, 375169882 -> 7412, 1746555001 -> 7367
    //   7412: goto -> 7416
    //   7415: athrow
    //   7416: invokevirtual booleanValue : ()Z
    //   7419: goto -> 7423
    //   7422: athrow
    //   7423: ifne -> 7437
    //   7426: ldc2_w 1166835732
    //   7429: l2i
    //   7430: ldc_w -1640520222
    //   7433: ixor
    //   7434: goto -> 7445
    //   7437: ldc2_w -672786373
    //   7440: l2i
    //   7441: ldc_w 207437262
    //   7444: ixor
    //   7445: ldc2_w -1482095625
    //   7448: l2i
    //   7449: ldc_w 1679771000
    //   7452: ixor
    //   7453: ixor
    //   7454: tableswitch default -> 7426, 403530617 -> 7476, 403530618 -> 8070
    //   7476: getstatic Perryc.1 : I
    //   7479: ifeq -> 7493
    //   7482: ldc2_w 98740540
    //   7485: l2i
    //   7486: ldc_w -497185317
    //   7489: ixor
    //   7490: goto -> 7501
    //   7493: ldc2_w -636515092
    //   7496: l2i
    //   7497: ldc_w 1935011762
    //   7500: ixor
    //   7501: ldc2_w 468413607
    //   7504: l2i
    //   7505: ldc_w 899815658
    //   7508: ixor
    //   7509: ixor
    //   7510: lookupswitch default -> 9323, -2028792045 -> 7536, -906604374 -> 7493
    //   7536: aload_1
    //   7537: getstatic Perryc.1 : I
    //   7540: ifeq -> 7554
    //   7543: ldc2_w 952703765
    //   7546: l2i
    //   7547: ldc_w -2120009068
    //   7550: ixor
    //   7551: goto -> 7562
    //   7554: ldc2_w -116125386
    //   7557: l2i
    //   7558: ldc_w -953555077
    //   7561: ixor
    //   7562: ldc2_w 820258305
    //   7565: l2i
    //   7566: ldc_w 1034657359
    //   7569: ixor
    //   7570: ixor
    //   7571: lookupswitch default -> 7596, -1272604209 -> 9457, -329978221 -> 7554
    //   7596: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   7599: getstatic Perryc.0 : I
    //   7602: ifle -> 7616
    //   7605: ldc2_w -1912275789
    //   7608: l2i
    //   7609: ldc_w 1152966870
    //   7612: ixor
    //   7613: goto -> 7624
    //   7616: ldc2_w -117457773
    //   7619: l2i
    //   7620: ldc_w -1075149646
    //   7623: ixor
    //   7624: ldc2_w 2026125106
    //   7627: l2i
    //   7628: ldc_w 877006207
    //   7631: ixor
    //   7632: ixor
    //   7633: lookupswitch default -> 9241, -2042747352 -> 7616, 194445932 -> 7660
    //   7660: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7663: getstatic Perryc.1 : I
    //   7666: ifeq -> 7680
    //   7669: ldc2_w -1322332780
    //   7672: l2i
    //   7673: ldc_w -1719100684
    //   7676: ixor
    //   7677: goto -> 7688
    //   7680: ldc2_w 1013335490
    //   7683: l2i
    //   7684: ldc_w -745678634
    //   7687: ixor
    //   7688: ldc2_w -1758642204
    //   7691: l2i
    //   7692: ldc_w 1557725678
    //   7695: ixor
    //   7696: ixor
    //   7697: lookupswitch default -> 9317, -481138326 -> 7680, 606053150 -> 7724
    //   7724: aload_0
    //   7725: getstatic Perryc.0 : I
    //   7728: ifle -> 7742
    //   7731: ldc2_w -744370411
    //   7734: l2i
    //   7735: ldc_w 917672621
    //   7738: ixor
    //   7739: goto -> 7750
    //   7742: ldc2_w -1128968533
    //   7745: l2i
    //   7746: ldc_w -2028191061
    //   7749: ixor
    //   7750: ldc2_w 651747997
    //   7753: l2i
    //   7754: ldc_w 500345960
    //   7757: ixor
    //   7758: ixor
    //   7759: lookupswitch default -> 7784, -568782003 -> 9355, -409916609 -> 7742
    //   7784: getfield ignoreTerrain : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7787: getstatic Perryc.1 : I
    //   7790: ifeq -> 7804
    //   7793: ldc2_w -880848560
    //   7796: l2i
    //   7797: ldc_w -1944994004
    //   7800: ixor
    //   7801: goto -> 7812
    //   7804: ldc2_w -2086320937
    //   7807: l2i
    //   7808: ldc_w -1599148845
    //   7811: ixor
    //   7812: ldc2_w -1618171431
    //   7815: l2i
    //   7816: ldc_w -508465195
    //   7819: ixor
    //   7820: ixor
    //   7821: lookupswitch default -> 9235, 961751152 -> 7804, 1563848200 -> 7848
    //   7848: goto -> 7852
    //   7851: athrow
    //   7852: invokevirtual getValue : ()Ljava/lang/Object;
    //   7855: goto -> 7859
    //   7858: athrow
    //   7859: checkcast java/lang/Boolean
    //   7862: getstatic Perryc.0 : I
    //   7865: ifle -> 7879
    //   7868: ldc2_w -200978016
    //   7871: l2i
    //   7872: ldc_w -1925794343
    //   7875: ixor
    //   7876: goto -> 7887
    //   7879: ldc2_w 697610049
    //   7882: l2i
    //   7883: ldc_w 1744169994
    //   7886: ixor
    //   7887: ldc2_w -1999302629
    //   7890: l2i
    //   7891: ldc_w -1508639464
    //   7894: ixor
    //   7895: ixor
    //   7896: lookupswitch default -> 7924, 1201947431 -> 7879, 1475676538 -> 9403
    //   7924: goto -> 7928
    //   7927: athrow
    //   7928: invokevirtual booleanValue : ()Z
    //   7931: goto -> 7935
    //   7934: athrow
    //   7935: getstatic Perryc.c : I
    //   7938: iflt -> 7952
    //   7941: ldc2_w -338770330
    //   7944: l2i
    //   7945: ldc_w -961870491
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w -1764680066
    //   7955: l2i
    //   7956: ldc_w 1690587015
    //   7959: ixor
    //   7960: ldc2_w -546046430
    //   7963: l2i
    //   7964: ldc_w -1153337191
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 7996, -1859926807 -> 7952, 1230456248 -> 9443
    //   7996: goto -> 8000
    //   7999: athrow
    //   8000: invokestatic calculateDamage : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Z)F
    //   8003: goto -> 8007
    //   8006: athrow
    //   8007: f2d
    //   8008: getstatic Perryc.c : I
    //   8011: iflt -> 8025
    //   8014: ldc2_w -26896865
    //   8017: l2i
    //   8018: ldc_w 1290568198
    //   8021: ixor
    //   8022: goto -> 8033
    //   8025: ldc2_w -127773802
    //   8028: l2i
    //   8029: ldc_w -178489647
    //   8032: ixor
    //   8033: ldc2_w 1173251392
    //   8036: l2i
    //   8037: ldc_w 2043223009
    //   8040: ixor
    //   8041: ixor
    //   8042: lookupswitch default -> 8068, -1901172040 -> 9407, -1593885135 -> 8025
    //   8068: dstore #7
    //   8070: getstatic Perryc.1 : I
    //   8073: ifeq -> 8087
    //   8076: ldc2_w -852239492
    //   8079: l2i
    //   8080: ldc_w 1206037520
    //   8083: ixor
    //   8084: goto -> 8095
    //   8087: ldc2_w -1679315258
    //   8090: l2i
    //   8091: ldc_w -365020830
    //   8094: ixor
    //   8095: ldc2_w 2031891628
    //   8098: l2i
    //   8099: ldc_w 1261288771
    //   8102: ixor
    //   8103: ixor
    //   8104: lookupswitch default -> 9231, -1193214333 -> 8087, 1139285579 -> 8132
    //   8132: dload #7
    //   8134: getstatic Perryc.c : I
    //   8137: iflt -> 8151
    //   8140: ldc2_w -1056191269
    //   8143: l2i
    //   8144: ldc_w 575802205
    //   8147: ixor
    //   8148: goto -> 8159
    //   8151: ldc2_w -294792719
    //   8154: l2i
    //   8155: ldc_w 130510250
    //   8158: ixor
    //   8159: ldc2_w 1806109307
    //   8162: l2i
    //   8163: ldc_w -421401575
    //   8166: ixor
    //   8167: ixor
    //   8168: lookupswitch default -> 9267, 1693211193 -> 8196, 1847534052 -> 8151
    //   8196: aload_0
    //   8197: getstatic Perryc.0 : I
    //   8200: ifle -> 8214
    //   8203: ldc2_w 1950257062
    //   8206: l2i
    //   8207: ldc_w -1876321303
    //   8210: ixor
    //   8211: goto -> 8222
    //   8214: ldc2_w -615260957
    //   8217: l2i
    //   8218: ldc_w -400820321
    //   8221: ixor
    //   8222: ldc2_w 1216633920
    //   8225: l2i
    //   8226: ldc_w 1869210091
    //   8229: ixor
    //   8230: ixor
    //   8231: lookupswitch default -> 9309, -1006982684 -> 8214, 346396375 -> 8256
    //   8256: getfield maxSelfDamage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8259: getstatic Perryc.c : I
    //   8262: iflt -> 8276
    //   8265: ldc2_w 308647321
    //   8268: l2i
    //   8269: ldc_w -79035522
    //   8272: ixor
    //   8273: goto -> 8284
    //   8276: ldc2_w 89318659
    //   8279: l2i
    //   8280: ldc_w 1950533568
    //   8283: ixor
    //   8284: ldc2_w -77714349
    //   8287: l2i
    //   8288: ldc_w -628501774
    //   8291: ixor
    //   8292: ixor
    //   8293: lookupswitch default -> 8320, -923244474 -> 9419, 1030137726 -> 8276
    //   8320: goto -> 8324
    //   8323: athrow
    //   8324: invokevirtual getValue : ()Ljava/lang/Object;
    //   8327: goto -> 8331
    //   8330: athrow
    //   8331: checkcast java/lang/Integer
    //   8334: getstatic Perryc.0 : I
    //   8337: ifle -> 8351
    //   8340: ldc2_w 2024811766
    //   8343: l2i
    //   8344: ldc_w 639918306
    //   8347: ixor
    //   8348: goto -> 8359
    //   8351: ldc2_w 1809364284
    //   8354: l2i
    //   8355: ldc_w -507001861
    //   8358: ixor
    //   8359: ldc2_w -1017221579
    //   8362: l2i
    //   8363: ldc_w 860534858
    //   8366: ixor
    //   8367: ixor
    //   8368: lookupswitch default -> 8396, -1367303573 -> 9399, -1063693987 -> 8351
    //   8396: goto -> 8400
    //   8399: athrow
    //   8400: invokevirtual intValue : ()I
    //   8403: goto -> 8407
    //   8406: athrow
    //   8407: i2d
    //   8408: dcmpl
    //   8409: ifle -> 8423
    //   8412: ldc2_w 1726318962
    //   8415: l2i
    //   8416: ldc_w -395640688
    //   8419: ixor
    //   8420: goto -> 8431
    //   8423: ldc2_w -72191744
    //   8426: l2i
    //   8427: ldc_w 1966930147
    //   8430: ixor
    //   8431: ldc2_w 1691455147
    //   8434: l2i
    //   8435: ldc_w -133410327
    //   8438: ixor
    //   8439: ixor
    //   8440: tableswitch default -> 8412, 307451552 -> 8464, 307451553 -> 8478
    //   8464: ldc2_w 6.696666214145168E307
    //   8467: invokestatic doubleToLongBits : (D)J
    //   8470: ldc2_w 9212068261617259233
    //   8473: lxor
    //   8474: invokestatic longBitsToDouble : (J)D
    //   8477: dreturn
    //   8478: getstatic Perryc.1 : I
    //   8481: ifeq -> 8495
    //   8484: ldc2_w 530384510
    //   8487: l2i
    //   8488: ldc_w 774763134
    //   8491: ixor
    //   8492: goto -> 8503
    //   8495: ldc2_w 160654986
    //   8498: l2i
    //   8499: ldc_w 1652360807
    //   8502: ixor
    //   8503: ldc2_w 1280787344
    //   8506: l2i
    //   8507: ldc_w 775559091
    //   8510: ixor
    //   8511: ixor
    //   8512: lookupswitch default -> 9401, 159593678 -> 8540, 1407033379 -> 8495
    //   8540: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   8543: getstatic Perryc.0 : I
    //   8546: ifle -> 8560
    //   8549: ldc2_w -998576978
    //   8552: l2i
    //   8553: ldc_w 294211575
    //   8556: ixor
    //   8557: goto -> 8568
    //   8560: ldc2_w 1196675193
    //   8563: l2i
    //   8564: ldc_w -379358883
    //   8567: ixor
    //   8568: ldc2_w -709307880
    //   8571: l2i
    //   8572: ldc_w -1020280532
    //   8575: ixor
    //   8576: ixor
    //   8577: lookupswitch default -> 9279, -1196969456 -> 8604, -1016811411 -> 8560
    //   8604: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8607: getstatic Perryc.c : I
    //   8610: iflt -> 8624
    //   8613: ldc2_w -2102432044
    //   8616: l2i
    //   8617: ldc_w 473361066
    //   8620: ixor
    //   8621: goto -> 8632
    //   8624: ldc2_w 947357589
    //   8627: l2i
    //   8628: ldc_w -1405414026
    //   8631: ixor
    //   8632: ldc2_w -18312807
    //   8635: l2i
    //   8636: ldc_w 1180266039
    //   8639: ixor
    //   8640: ixor
    //   8641: lookupswitch default -> 9253, 640187344 -> 8624, 754806093 -> 8668
    //   8668: goto -> 8672
    //   8671: athrow
    //   8672: invokestatic getHealth : (Lnet/minecraft/entity/Entity;)F
    //   8675: goto -> 8679
    //   8678: athrow
    //   8679: f2d
    //   8680: getstatic Perryc.0 : I
    //   8683: ifle -> 8697
    //   8686: ldc2_w 1096231927
    //   8689: l2i
    //   8690: ldc_w 1926903928
    //   8693: ixor
    //   8694: goto -> 8705
    //   8697: ldc2_w 739171674
    //   8700: l2i
    //   8701: ldc_w 245856695
    //   8704: ixor
    //   8705: ldc2_w -888789448
    //   8708: l2i
    //   8709: ldc_w 245925655
    //   8712: ixor
    //   8713: ixor
    //   8714: lookupswitch default -> 8740, -1736364303 -> 8697, -165432672 -> 9263
    //   8740: dload #7
    //   8742: dsub
    //   8743: ldc2_w 9.68582351102103E307
    //   8746: invokestatic doubleToLongBits : (D)J
    //   8749: ldc2_w 9214714243228019162
    //   8752: lxor
    //   8753: invokestatic longBitsToDouble : (J)D
    //   8756: dcmpg
    //   8757: ifgt -> 8771
    //   8760: ldc2_w -262618058
    //   8763: l2i
    //   8764: ldc_w -277145175
    //   8767: ixor
    //   8768: goto -> 8779
    //   8771: ldc2_w -1346751118
    //   8774: l2i
    //   8775: ldc_w -1332090670
    //   8778: ixor
    //   8779: ldc2_w 1632936821
    //   8782: l2i
    //   8783: ldc_w 339636469
    //   8786: ixor
    //   8787: ixor
    //   8788: tableswitch default -> 8760, 1783172639 -> 8812, 1783172640 -> 9150
    //   8812: getstatic Perryc.0 : I
    //   8815: ifle -> 8829
    //   8818: ldc2_w 816429397
    //   8821: l2i
    //   8822: ldc_w 771827688
    //   8825: ixor
    //   8826: goto -> 8837
    //   8829: ldc2_w -1725431353
    //   8832: l2i
    //   8833: ldc_w -2140292961
    //   8836: ixor
    //   8837: ldc2_w -764903982
    //   8840: l2i
    //   8841: ldc_w -2064394727
    //   8844: ixor
    //   8845: ixor
    //   8846: lookupswitch default -> 8872, -208462918 -> 8829, 1211315574 -> 9367
    //   8872: aload_0
    //   8873: getstatic Perryc.c : I
    //   8876: iflt -> 8890
    //   8879: ldc2_w -758941352
    //   8882: l2i
    //   8883: ldc_w -1087983441
    //   8886: ixor
    //   8887: goto -> 8898
    //   8890: ldc2_w 1236041819
    //   8893: l2i
    //   8894: ldc_w -316177468
    //   8897: ixor
    //   8898: ldc2_w 1037414037
    //   8901: l2i
    //   8902: ldc_w -1197045782
    //   8905: ixor
    //   8906: ixor
    //   8907: lookupswitch default -> 9281, -392765304 -> 8890, 569912032 -> 8932
    //   8932: getfield antiSuicide : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8935: getstatic Perryc.0 : I
    //   8938: ifle -> 8952
    //   8941: ldc2_w -920497910
    //   8944: l2i
    //   8945: ldc_w 832017418
    //   8948: ixor
    //   8949: goto -> 8960
    //   8952: ldc2_w -2028320016
    //   8955: l2i
    //   8956: ldc_w -725289950
    //   8959: ixor
    //   8960: ldc2_w 750794555
    //   8963: l2i
    //   8964: ldc_w -1760465119
    //   8967: ixor
    //   8968: ixor
    //   8969: lookupswitch default -> 9423, -401611064 -> 8996, 1130667290 -> 8952
    //   8996: goto -> 9000
    //   8999: athrow
    //   9000: invokevirtual getValue : ()Ljava/lang/Object;
    //   9003: goto -> 9007
    //   9006: athrow
    //   9007: checkcast java/lang/Boolean
    //   9010: getstatic Perryc.c : I
    //   9013: iflt -> 9027
    //   9016: ldc2_w 1516760367
    //   9019: l2i
    //   9020: ldc_w -1228465402
    //   9023: ixor
    //   9024: goto -> 9035
    //   9027: ldc2_w 259589997
    //   9030: l2i
    //   9031: ldc_w -192704991
    //   9034: ixor
    //   9035: ldc2_w 295108028
    //   9038: l2i
    //   9039: ldc_w 162118120
    //   9042: ixor
    //   9043: ixor
    //   9044: lookupswitch default -> 9072, -190860675 -> 9295, 678174560 -> 9027
    //   9072: goto -> 9076
    //   9075: athrow
    //   9076: invokevirtual booleanValue : ()Z
    //   9079: goto -> 9083
    //   9082: athrow
    //   9083: ifeq -> 9097
    //   9086: ldc2_w -819077669
    //   9089: l2i
    //   9090: ldc_w -694455999
    //   9093: ixor
    //   9094: goto -> 9105
    //   9097: ldc2_w -1326100548
    //   9100: l2i
    //   9101: ldc_w -1455168729
    //   9104: ixor
    //   9105: ldc2_w 42263191
    //   9108: l2i
    //   9109: ldc_w 1420769595
    //   9112: ixor
    //   9113: ixor
    //   9114: tableswitch default -> 9086, 1335719734 -> 9136, 1335719735 -> 9150
    //   9136: ldc2_w 9.456934387536291E307
    //   9139: invokestatic doubleToLongBits : (D)J
    //   9142: ldc2_w 9214599560143209587
    //   9145: lxor
    //   9146: invokestatic longBitsToDouble : (J)D
    //   9149: dreturn
    //   9150: getstatic Perryc.c : I
    //   9153: iflt -> 9167
    //   9156: ldc2_w -615133602
    //   9159: l2i
    //   9160: ldc_w -1128374516
    //   9163: ixor
    //   9164: goto -> 9175
    //   9167: ldc2_w 855204945
    //   9170: l2i
    //   9171: ldc_w -1427756732
    //   9174: ixor
    //   9175: ldc2_w 1832665800
    //   9178: l2i
    //   9179: ldc_w 191866075
    //   9182: ixor
    //   9183: ixor
    //   9184: lookupswitch default -> 9347, -28529914 -> 9212, 28866369 -> 9167
    //   9212: dload #5
    //   9214: dreturn
    //   9215: ldc2_w 1.7200749402292273E308
    //   9218: invokestatic doubleToLongBits : (D)J
    //   9221: ldc2_w 9218479537402793676
    //   9224: lxor
    //   9225: invokestatic longBitsToDouble : (J)D
    //   9228: dreturn
    //   9229: aconst_null
    //   9230: athrow
    //   9231: aconst_null
    //   9232: athrow
    //   9233: aconst_null
    //   9234: athrow
    //   9235: aconst_null
    //   9236: athrow
    //   9237: aconst_null
    //   9238: athrow
    //   9239: aconst_null
    //   9240: athrow
    //   9241: aconst_null
    //   9242: athrow
    //   9243: aconst_null
    //   9244: athrow
    //   9245: aconst_null
    //   9246: athrow
    //   9247: aconst_null
    //   9248: athrow
    //   9249: aconst_null
    //   9250: athrow
    //   9251: aconst_null
    //   9252: athrow
    //   9253: aconst_null
    //   9254: athrow
    //   9255: aconst_null
    //   9256: athrow
    //   9257: aconst_null
    //   9258: athrow
    //   9259: aconst_null
    //   9260: athrow
    //   9261: aconst_null
    //   9262: athrow
    //   9263: aconst_null
    //   9264: athrow
    //   9265: aconst_null
    //   9266: athrow
    //   9267: aconst_null
    //   9268: athrow
    //   9269: aconst_null
    //   9270: athrow
    //   9271: aconst_null
    //   9272: athrow
    //   9273: aconst_null
    //   9274: athrow
    //   9275: aconst_null
    //   9276: athrow
    //   9277: aconst_null
    //   9278: athrow
    //   9279: aconst_null
    //   9280: athrow
    //   9281: aconst_null
    //   9282: athrow
    //   9283: aconst_null
    //   9284: athrow
    //   9285: aconst_null
    //   9286: athrow
    //   9287: aconst_null
    //   9288: athrow
    //   9289: aconst_null
    //   9290: athrow
    //   9291: aconst_null
    //   9292: athrow
    //   9293: aconst_null
    //   9294: athrow
    //   9295: aconst_null
    //   9296: athrow
    //   9297: aconst_null
    //   9298: athrow
    //   9299: aconst_null
    //   9300: athrow
    //   9301: aconst_null
    //   9302: athrow
    //   9303: aconst_null
    //   9304: athrow
    //   9305: aconst_null
    //   9306: athrow
    //   9307: aconst_null
    //   9308: athrow
    //   9309: aconst_null
    //   9310: athrow
    //   9311: aconst_null
    //   9312: athrow
    //   9313: aconst_null
    //   9314: athrow
    //   9315: aconst_null
    //   9316: athrow
    //   9317: aconst_null
    //   9318: athrow
    //   9319: aconst_null
    //   9320: athrow
    //   9321: aconst_null
    //   9322: athrow
    //   9323: aconst_null
    //   9324: athrow
    //   9325: aconst_null
    //   9326: athrow
    //   9327: aconst_null
    //   9328: athrow
    //   9329: aconst_null
    //   9330: athrow
    //   9331: aconst_null
    //   9332: athrow
    //   9333: aconst_null
    //   9334: athrow
    //   9335: aconst_null
    //   9336: athrow
    //   9337: aconst_null
    //   9338: athrow
    //   9339: aconst_null
    //   9340: athrow
    //   9341: aconst_null
    //   9342: athrow
    //   9343: aconst_null
    //   9344: athrow
    //   9345: aconst_null
    //   9346: athrow
    //   9347: aconst_null
    //   9348: athrow
    //   9349: aconst_null
    //   9350: athrow
    //   9351: aconst_null
    //   9352: athrow
    //   9353: aconst_null
    //   9354: athrow
    //   9355: aconst_null
    //   9356: athrow
    //   9357: aconst_null
    //   9358: athrow
    //   9359: aconst_null
    //   9360: athrow
    //   9361: aconst_null
    //   9362: athrow
    //   9363: aconst_null
    //   9364: athrow
    //   9365: aconst_null
    //   9366: athrow
    //   9367: aconst_null
    //   9368: athrow
    //   9369: aconst_null
    //   9370: athrow
    //   9371: aconst_null
    //   9372: athrow
    //   9373: aconst_null
    //   9374: athrow
    //   9375: aconst_null
    //   9376: athrow
    //   9377: aconst_null
    //   9378: athrow
    //   9379: aconst_null
    //   9380: athrow
    //   9381: aconst_null
    //   9382: athrow
    //   9383: aconst_null
    //   9384: athrow
    //   9385: aconst_null
    //   9386: athrow
    //   9387: aconst_null
    //   9388: athrow
    //   9389: aconst_null
    //   9390: athrow
    //   9391: aconst_null
    //   9392: athrow
    //   9393: aconst_null
    //   9394: athrow
    //   9395: aconst_null
    //   9396: athrow
    //   9397: aconst_null
    //   9398: athrow
    //   9399: aconst_null
    //   9400: athrow
    //   9401: aconst_null
    //   9402: athrow
    //   9403: aconst_null
    //   9404: athrow
    //   9405: aconst_null
    //   9406: athrow
    //   9407: aconst_null
    //   9408: athrow
    //   9409: aconst_null
    //   9410: athrow
    //   9411: aconst_null
    //   9412: athrow
    //   9413: aconst_null
    //   9414: athrow
    //   9415: aconst_null
    //   9416: athrow
    //   9417: aconst_null
    //   9418: athrow
    //   9419: aconst_null
    //   9420: athrow
    //   9421: aconst_null
    //   9422: athrow
    //   9423: aconst_null
    //   9424: athrow
    //   9425: aconst_null
    //   9426: athrow
    //   9427: aconst_null
    //   9428: athrow
    //   9429: aconst_null
    //   9430: athrow
    //   9431: aconst_null
    //   9432: athrow
    //   9433: aconst_null
    //   9434: athrow
    //   9435: aconst_null
    //   9436: athrow
    //   9437: aconst_null
    //   9438: athrow
    //   9439: aconst_null
    //   9440: athrow
    //   9441: aconst_null
    //   9442: athrow
    //   9443: aconst_null
    //   9444: athrow
    //   9445: aconst_null
    //   9446: athrow
    //   9447: aconst_null
    //   9448: athrow
    //   9449: aconst_null
    //   9450: athrow
    //   9451: aconst_null
    //   9452: athrow
    //   9453: aconst_null
    //   9454: athrow
    //   9455: aconst_null
    //   9456: athrow
    //   9457: aconst_null
    //   9458: athrow
    //   9459: aconst_null
    //   9460: athrow
    //   9461: aconst_null
    //   9462: athrow
    //   9463: aconst_null
    //   9464: athrow
    //   9465: aconst_null
    //   9466: athrow
    //   9467: aconst_null
    //   9468: athrow
    //   9469: aconst_null
    //   9470: athrow
    //   9471: pop
    //   9472: goto -> 24
    //   9475: pop
    //   9476: aconst_null
    //   9477: goto -> 9471
    //   9480: dup
    //   9481: ifnull -> 9471
    //   9484: checkcast java/lang/Throwable
    //   9487: athrow
    //   9488: dup
    //   9489: ifnull -> 9475
    //   9492: checkcast java/lang/Throwable
    //   9495: athrow
    //   9496: aconst_null
    //   9497: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   3577	3	3	miniumDamage	D
    //   5489	133	3	miniumDamage	D
    //   5957	3258	3	miniumDamage	D
    //   6614	2601	5	targetDamage	D
    //   7150	2065	7	selfDamage	D
    //   24	9205	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	9205	1	blockPos	Lnet/minecraft/util/math/BlockPos;
    //   24	9205	2	target	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   8	20	9480	finally
    //   207	214	214	finally
    //   207	214	207	java/lang/EnumConstantNotPresentException
    //   207	214	3	java/lang/EnumConstantNotPresentException
    //   208	214	207	finally
    //   208	214	214	finally
    //   391	398	398	finally
    //   391	398	391	java/lang/AssertionError
    //   391	398	3	java/lang/ClassCastException
    //   391	398	3	finally
    //   391	398	398	finally
    //   640	646	646	finally
    //   640	646	646	java/lang/StringIndexOutOfBoundsException
    //   640	646	3	java/lang/RuntimeException
    //   640	646	3	java/lang/RuntimeException
    //   640	646	3	finally
    //   715	722	722	finally
    //   715	722	715	finally
    //   715	722	715	finally
    //   716	722	3	java/lang/NegativeArraySizeException
    //   716	722	3	java/util/NoSuchElementException
    //   915	922	922	finally
    //   915	922	3	finally
    //   915	922	915	finally
    //   916	922	915	java/lang/AssertionError
    //   916	922	922	java/lang/NegativeArraySizeException
    //   1228	1234	1234	finally
    //   1228	1234	3	java/lang/RuntimeException
    //   1228	1234	3	finally
    //   1228	1234	1234	finally
    //   1228	1234	1234	finally
    //   1423	1430	1430	finally
    //   1423	1430	3	finally
    //   1423	1430	1430	java/lang/StringIndexOutOfBoundsException
    //   1424	1430	1423	finally
    //   1424	1430	1430	java/lang/StringIndexOutOfBoundsException
    //   1499	1506	1506	finally
    //   1499	1506	3	java/lang/IndexOutOfBoundsException
    //   1499	1506	1506	java/util/ConcurrentModificationException
    //   1499	1506	1506	finally
    //   1499	1506	1499	java/lang/IllegalArgumentException
    //   1571	1578	1578	finally
    //   1571	1578	3	java/lang/UnsupportedOperationException
    //   1571	1578	3	finally
    //   1572	1578	1578	finally
    //   1572	1578	1571	finally
    //   1899	1906	1906	finally
    //   1899	1906	1906	java/lang/ArithmeticException
    //   1899	1906	1906	finally
    //   1900	1906	1906	finally
    //   1900	1906	1899	finally
    //   2095	2102	2102	finally
    //   2095	2102	2095	java/lang/RuntimeException
    //   2095	2102	2102	java/lang/NullPointerException
    //   2096	2102	2095	java/lang/EnumConstantNotPresentException
    //   2096	2102	3	java/lang/NegativeArraySizeException
    //   2171	2178	2178	finally
    //   2171	2178	2171	finally
    //   2171	2178	2171	java/lang/IndexOutOfBoundsException
    //   2171	2178	2171	java/lang/UnsupportedOperationException
    //   2172	2178	3	java/lang/RuntimeException
    //   2243	2250	2250	finally
    //   2243	2250	2243	finally
    //   2244	2250	2243	java/util/ConcurrentModificationException
    //   2244	2250	2250	finally
    //   2244	2250	2250	finally
    //   2627	2634	2634	finally
    //   2627	2634	2627	java/lang/IllegalArgumentException
    //   2627	2634	2634	finally
    //   2628	2634	3	java/lang/ArrayIndexOutOfBoundsException
    //   2628	2634	2627	java/lang/ArrayIndexOutOfBoundsException
    //   2703	2710	2710	finally
    //   2703	2710	2710	finally
    //   2703	2710	2710	java/lang/UnsupportedOperationException
    //   2704	2710	2703	java/lang/IllegalStateException
    //   2704	2710	3	finally
    //   2775	2782	2782	finally
    //   2775	2782	2782	java/lang/RuntimeException
    //   2776	2782	2775	java/lang/RuntimeException
    //   2776	2782	3	java/lang/NegativeArraySizeException
    //   2776	2782	2775	finally
    //   2971	2978	2978	finally
    //   2971	2978	2971	finally
    //   2971	2978	3	java/lang/NumberFormatException
    //   2972	2978	2978	java/lang/ArrayIndexOutOfBoundsException
    //   2972	2978	2971	java/lang/IndexOutOfBoundsException
    //   3047	3054	3054	finally
    //   3047	3054	3047	java/lang/NullPointerException
    //   3047	3054	3054	java/lang/ClassCastException
    //   3048	3054	3	finally
    //   3048	3054	3054	java/lang/NullPointerException
    //   3431	3438	3438	finally
    //   3431	3438	3	java/util/ConcurrentModificationException
    //   3432	3438	3431	finally
    //   3432	3438	3431	finally
    //   3432	3438	3431	java/lang/EnumConstantNotPresentException
    //   3507	3514	3514	finally
    //   3507	3514	3507	java/lang/NullPointerException
    //   3508	3514	3507	java/util/NoSuchElementException
    //   3508	3514	3	finally
    //   3508	3514	3514	finally
    //   3703	3710	3710	finally
    //   3703	3710	3	java/lang/RuntimeException
    //   3704	3710	3	finally
    //   3704	3710	3	java/lang/AssertionError
    //   3704	3710	3703	finally
    //   3899	3906	3906	finally
    //   3900	3906	3899	java/util/NoSuchElementException
    //   3900	3906	3	java/lang/NullPointerException
    //   3900	3906	3	java/lang/ArithmeticException
    //   3900	3906	3899	java/lang/ArrayIndexOutOfBoundsException
    //   3975	3982	3982	finally
    //   3975	3982	3975	finally
    //   3975	3982	3975	finally
    //   3975	3982	3982	finally
    //   3976	3982	3975	java/lang/EnumConstantNotPresentException
    //   4227	4234	4234	finally
    //   4227	4234	3	java/lang/NegativeArraySizeException
    //   4227	4234	4234	finally
    //   4228	4234	3	java/lang/NullPointerException
    //   4228	4234	4227	finally
    //   4303	4310	4310	finally
    //   4303	4310	4303	java/lang/IllegalStateException
    //   4303	4310	4310	finally
    //   4304	4310	4310	java/lang/IllegalStateException
    //   4304	4310	4303	java/lang/NullPointerException
    //   4611	4618	4618	finally
    //   4611	4618	4618	finally
    //   4611	4618	4611	java/lang/NegativeArraySizeException
    //   4612	4618	4611	finally
    //   4612	4618	4618	finally
    //   4687	4694	4694	finally
    //   4687	4694	4687	java/lang/AssertionError
    //   4687	4694	3	java/lang/IllegalArgumentException
    //   4687	4694	3	finally
    //   4687	4694	4687	finally
    //   4759	4766	4766	finally
    //   4759	4766	4759	finally
    //   4760	4766	3	java/lang/IllegalStateException
    //   4760	4766	4766	finally
    //   4760	4766	4759	java/lang/ClassCastException
    //   4832	4838	4838	finally
    //   4832	4838	3	java/util/NoSuchElementException
    //   4832	4838	3	finally
    //   4832	4838	4838	java/lang/IndexOutOfBoundsException
    //   4832	4838	3	java/util/ConcurrentModificationException
    //   5079	5086	5086	finally
    //   5079	5086	5086	java/lang/NumberFormatException
    //   5080	5086	3	java/lang/IllegalStateException
    //   5080	5086	5079	finally
    //   5080	5086	5079	finally
    //   5155	5162	5162	finally
    //   5155	5162	5155	java/util/ConcurrentModificationException
    //   5155	5162	5155	java/lang/AssertionError
    //   5156	5162	3	finally
    //   5156	5162	5155	finally
    //   5340	5346	5346	finally
    //   5340	5346	3	java/lang/ClassCastException
    //   5340	5346	3	java/lang/ArithmeticException
    //   5340	5346	3	finally
    //   5340	5346	5346	java/lang/NumberFormatException
    //   5812	5818	5818	finally
    //   5812	5818	3	java/util/NoSuchElementException
    //   5812	5818	3	finally
    //   5812	5818	3	finally
    //   5812	5818	3	java/lang/ClassCastException
    //   5888	5894	5894	finally
    //   5888	5894	5894	finally
    //   5888	5894	3	java/lang/StringIndexOutOfBoundsException
    //   5888	5894	3	finally
    //   5888	5894	3	finally
    //   6395	6402	6402	finally
    //   6395	6402	6402	finally
    //   6395	6402	6395	java/lang/ArrayIndexOutOfBoundsException
    //   6396	6402	6395	finally
    //   6396	6402	3	finally
    //   6471	6478	6478	finally
    //   6471	6478	6478	java/lang/NullPointerException
    //   6471	6478	6471	java/lang/IllegalArgumentException
    //   6471	6478	6478	finally
    //   6472	6478	6478	finally
    //   6543	6550	6550	finally
    //   6543	6550	6550	java/lang/UnsupportedOperationException
    //   6543	6550	6543	java/lang/IllegalArgumentException
    //   6544	6550	6543	java/lang/ArrayIndexOutOfBoundsException
    //   6544	6550	6550	finally
    //   6919	6926	6926	finally
    //   6919	6926	6919	java/lang/ArithmeticException
    //   6919	6926	3	finally
    //   6920	6926	6926	java/lang/UnsupportedOperationException
    //   6920	6926	3	java/lang/ArrayIndexOutOfBoundsException
    //   7339	7346	7346	finally
    //   7339	7346	7339	java/lang/IndexOutOfBoundsException
    //   7340	7346	3	finally
    //   7340	7346	3	java/lang/NegativeArraySizeException
    //   7340	7346	7339	java/lang/StringIndexOutOfBoundsException
    //   7415	7422	7422	finally
    //   7415	7422	7422	java/lang/UnsupportedOperationException
    //   7415	7422	7415	java/lang/IndexOutOfBoundsException
    //   7416	7422	7415	finally
    //   7416	7422	7415	finally
    //   7851	7858	7858	finally
    //   7851	7858	3	java/lang/StringIndexOutOfBoundsException
    //   7852	7858	3	java/lang/NumberFormatException
    //   7852	7858	7851	finally
    //   7852	7858	3	java/lang/NullPointerException
    //   7928	7934	7934	finally
    //   7928	7934	7934	finally
    //   7928	7934	7934	java/lang/ArrayIndexOutOfBoundsException
    //   7928	7934	3	finally
    //   7928	7934	3	java/lang/IllegalArgumentException
    //   7999	8006	8006	finally
    //   7999	8006	7999	finally
    //   8000	8006	8006	finally
    //   8000	8006	8006	java/lang/NumberFormatException
    //   8000	8006	7999	java/lang/ArithmeticException
    //   8323	8330	8330	finally
    //   8323	8330	3	java/lang/IllegalStateException
    //   8324	8330	8323	java/util/ConcurrentModificationException
    //   8324	8330	8323	finally
    //   8324	8330	3	java/lang/IndexOutOfBoundsException
    //   8400	8406	8406	finally
    //   8400	8406	8406	finally
    //   8400	8406	8406	finally
    //   8400	8406	8406	finally
    //   8400	8406	3	finally
    //   8671	8678	8678	finally
    //   8671	8678	3	java/lang/AssertionError
    //   8671	8678	8671	finally
    //   8671	8678	8678	java/util/ConcurrentModificationException
    //   8672	8678	8678	finally
    //   8999	9006	9006	finally
    //   8999	9006	8999	finally
    //   8999	9006	3	finally
    //   9000	9006	3	java/lang/ArrayIndexOutOfBoundsException
    //   9000	9006	3	java/lang/NullPointerException
    //   9075	9082	9082	finally
    //   9075	9082	3	finally
    //   9076	9082	9075	java/lang/RuntimeException
    //   9076	9082	3	finally
    //   9076	9082	9075	finally
    //   9480	9488	9480	java/lang/NumberFormatException
    //   9496	9498	3	java/lang/NullPointerException
  }
  
  public void setYawPitch(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1605
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1597
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1589
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1585970772
    //   33: l2i
    //   34: ldc_w -162099742
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -339179110
    //   44: l2i
    //   45: ldc_w -370057364
    //   48: ixor
    //   49: ldc2_w -2037417667
    //   52: l2i
    //   53: ldc_w -1947649559
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2142295390 -> 41, -1514720414 -> 1556
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w -2028577286
    //   96: l2i
    //   97: ldc_w -1263508027
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 831130692
    //   107: l2i
    //   108: ldc_w -1466335721
    //   111: ixor
    //   112: ldc2_w -621362422
    //   115: l2i
    //   116: ldc_w -1578409011
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -770502634 -> 104, 1220253944 -> 1560
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w 1627133537
    //   160: l2i
    //   161: ldc_w -1936075642
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1228842071
    //   171: l2i
    //   172: ldc_w -508836115
    //   175: ixor
    //   176: ldc2_w 1427951912
    //   179: l2i
    //   180: ldc_w -1122115906
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 1570, -1083469102 -> 212, 73715057 -> 168
    //   212: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w 813521583
    //   224: l2i
    //   225: ldc_w -198369296
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 770437960
    //   235: l2i
    //   236: ldc_w -1934031818
    //   239: ixor
    //   240: ldc2_w 352929989
    //   243: l2i
    //   244: ldc_w 377997841
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -941701237 -> 1538, 1368352038 -> 232
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual func_184121_ak : ()F
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.c : I
    //   290: iflt -> 304
    //   293: ldc2_w -1679543351
    //   296: l2i
    //   297: ldc_w 1867485747
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 667345596
    //   307: l2i
    //   308: ldc_w 1927489911
    //   311: ixor
    //   312: ldc2_w -305224395
    //   315: l2i
    //   316: ldc_w -2116237441
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1732656208 -> 1552, -171332081 -> 304
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual func_174824_e : (F)Lnet/minecraft/util/math/Vec3d;
    //   355: goto -> 359
    //   358: athrow
    //   359: new net/minecraft/util/math/Vec3d
    //   362: dup
    //   363: getstatic Perryc.c : I
    //   366: iflt -> 380
    //   369: ldc2_w 673573351
    //   372: l2i
    //   373: ldc_w -1229737776
    //   376: ixor
    //   377: goto -> 388
    //   380: ldc2_w -915849402
    //   383: l2i
    //   384: ldc_w 1909465854
    //   387: ixor
    //   388: ldc2_w -1430935051
    //   391: l2i
    //   392: ldc_w -304048617
    //   395: ixor
    //   396: ixor
    //   397: lookupswitch default -> 1574, -641505579 -> 380, -1301926 -> 424
    //   424: aload_1
    //   425: getstatic Perryc.1 : I
    //   428: ifeq -> 442
    //   431: ldc2_w -1903283835
    //   434: l2i
    //   435: ldc_w 699213844
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w 293244336
    //   445: l2i
    //   446: ldc_w -548556075
    //   449: ixor
    //   450: ldc2_w 2093536683
    //   453: l2i
    //   454: ldc_w -1713523567
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 1568, 723672671 -> 484, 1110866091 -> 442
    //   484: goto -> 488
    //   487: athrow
    //   488: invokevirtual func_177958_n : ()I
    //   491: goto -> 495
    //   494: athrow
    //   495: i2f
    //   496: ldc_w 497.3398
    //   499: invokestatic floatToIntBits : (F)I
    //   502: ldc_w 2096671615
    //   505: ixor
    //   506: invokestatic intBitsToFloat : (I)F
    //   509: fadd
    //   510: f2d
    //   511: getstatic Perryc.c : I
    //   514: iflt -> 528
    //   517: ldc2_w -883138785
    //   520: l2i
    //   521: ldc_w 774776329
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w -832149923
    //   531: l2i
    //   532: ldc_w -465177229
    //   535: ixor
    //   536: ldc2_w -2027124325
    //   539: l2i
    //   540: ldc_w -541617092
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1554, -1108777807 -> 528, 1924697737 -> 572
    //   572: aload_1
    //   573: getstatic Perryc.0 : I
    //   576: ifle -> 590
    //   579: ldc2_w -326910481
    //   582: l2i
    //   583: ldc_w 869853389
    //   586: ixor
    //   587: goto -> 598
    //   590: ldc2_w 151621926
    //   593: l2i
    //   594: ldc_w -1074689717
    //   597: ixor
    //   598: ldc2_w -47535935
    //   601: l2i
    //   602: ldc_w 550729773
    //   605: ixor
    //   606: ixor
    //   607: lookupswitch default -> 632, -1802459698 -> 590, 44205518 -> 1548
    //   632: goto -> 636
    //   635: athrow
    //   636: invokevirtual func_177956_o : ()I
    //   639: goto -> 643
    //   642: athrow
    //   643: i2f
    //   644: ldc_w 46.23852
    //   647: invokestatic floatToIntBits : (F)I
    //   650: ldc_w 2100884543
    //   653: ixor
    //   654: invokestatic intBitsToFloat : (I)F
    //   657: fadd
    //   658: f2d
    //   659: getstatic Perryc.1 : I
    //   662: ifeq -> 676
    //   665: ldc2_w 1563657578
    //   668: l2i
    //   669: ldc_w -525477564
    //   672: ixor
    //   673: goto -> 684
    //   676: ldc2_w 917095191
    //   679: l2i
    //   680: ldc_w -1507102385
    //   683: ixor
    //   684: ldc2_w 1600332100
    //   687: l2i
    //   688: ldc_w 1272290926
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -1820910105 -> 676, -1456938236 -> 1558
    //   720: aload_1
    //   721: getstatic Perryc.0 : I
    //   724: ifle -> 738
    //   727: ldc2_w -1815762811
    //   730: l2i
    //   731: ldc_w 628382979
    //   734: ixor
    //   735: goto -> 746
    //   738: ldc2_w 1235540236
    //   741: l2i
    //   742: ldc_w 1024421284
    //   745: ixor
    //   746: ldc2_w 965695900
    //   749: l2i
    //   750: ldc_w -1116676902
    //   753: ixor
    //   754: ixor
    //   755: lookupswitch default -> 780, 844001472 -> 1572, 901445189 -> 738
    //   780: goto -> 784
    //   783: athrow
    //   784: invokevirtual func_177952_p : ()I
    //   787: goto -> 791
    //   790: athrow
    //   791: i2f
    //   792: ldc_w 22.126497
    //   795: invokestatic floatToIntBits : (F)I
    //   798: ldc_w 2125529873
    //   801: ixor
    //   802: invokestatic intBitsToFloat : (I)F
    //   805: fadd
    //   806: f2d
    //   807: getstatic Perryc.0 : I
    //   810: ifle -> 824
    //   813: ldc2_w 1560905447
    //   816: l2i
    //   817: ldc_w -2118373898
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -1850796276
    //   827: l2i
    //   828: ldc_w 1040308957
    //   831: ixor
    //   832: ldc2_w -1718466991
    //   835: l2i
    //   836: ldc_w 1938955792
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 1540, 917893968 -> 824, 1169069456 -> 868
    //   868: goto -> 872
    //   871: athrow
    //   872: invokespecial <init> : (DDD)V
    //   875: goto -> 879
    //   878: athrow
    //   879: getstatic Perryc.1 : I
    //   882: ifeq -> 896
    //   885: ldc2_w -195502011
    //   888: l2i
    //   889: ldc_w -1939405442
    //   892: ixor
    //   893: goto -> 904
    //   896: ldc2_w 1315892000
    //   899: l2i
    //   900: ldc_w 1728226039
    //   903: ixor
    //   904: ldc2_w 333540894
    //   907: l2i
    //   908: ldc_w 165128684
    //   911: ixor
    //   912: ixor
    //   913: lookupswitch default -> 940, -1073929401 -> 896, 1644765897 -> 1550
    //   940: goto -> 944
    //   943: athrow
    //   944: invokestatic calcAngle : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
    //   947: goto -> 951
    //   950: athrow
    //   951: getstatic Perryc.c : I
    //   954: iflt -> 968
    //   957: ldc2_w 334225822
    //   960: l2i
    //   961: ldc_w 772966611
    //   964: ixor
    //   965: goto -> 976
    //   968: ldc2_w -837866127
    //   971: l2i
    //   972: ldc_w 1910256423
    //   975: ixor
    //   976: ldc2_w 2011058454
    //   979: l2i
    //   980: ldc_w -904404417
    //   983: ixor
    //   984: ixor
    //   985: lookupswitch default -> 1012, -2144282012 -> 1536, -1955140950 -> 968
    //   1012: astore_2
    //   1013: getstatic Perryc.c : I
    //   1016: iflt -> 1030
    //   1019: ldc2_w -16753421
    //   1022: l2i
    //   1023: ldc_w 147729056
    //   1026: ixor
    //   1027: goto -> 1038
    //   1030: ldc2_w 1566180793
    //   1033: l2i
    //   1034: ldc_w 1140109257
    //   1037: ixor
    //   1038: ldc2_w -1593439145
    //   1041: l2i
    //   1042: ldc_w -2078643813
    //   1045: ixor
    //   1046: ixor
    //   1047: lookupswitch default -> 1072, -757984353 -> 1578, 1336245257 -> 1030
    //   1072: aload_0
    //   1073: getstatic Perryc.c : I
    //   1076: iflt -> 1090
    //   1079: ldc2_w 863041890
    //   1082: l2i
    //   1083: ldc_w -1335817041
    //   1086: ixor
    //   1087: goto -> 1098
    //   1090: ldc2_w -2069083655
    //   1093: l2i
    //   1094: ldc_w 1090435655
    //   1097: ixor
    //   1098: ldc2_w -897934772
    //   1101: l2i
    //   1102: ldc_w 1251938177
    //   1105: ixor
    //   1106: ixor
    //   1107: lookupswitch default -> 1132, -1091393241 -> 1090, 66347008 -> 1562
    //   1132: aload_2
    //   1133: ldc2_w 320414053
    //   1136: l2i
    //   1137: ldc_w 320414053
    //   1140: ixor
    //   1141: faload
    //   1142: getstatic Perryc.c : I
    //   1145: iflt -> 1159
    //   1148: ldc2_w -1981246165
    //   1151: l2i
    //   1152: ldc_w 345781210
    //   1155: ixor
    //   1156: goto -> 1167
    //   1159: ldc2_w -1217037634
    //   1162: l2i
    //   1163: ldc_w -1553585524
    //   1166: ixor
    //   1167: ldc2_w 767068834
    //   1170: l2i
    //   1171: ldc_w 1830960276
    //   1174: ixor
    //   1175: ixor
    //   1176: lookupswitch default -> 1204, -571600697 -> 1544, 1715565282 -> 1159
    //   1204: putfield yaw : F
    //   1207: getstatic Perryc.0 : I
    //   1210: ifle -> 1224
    //   1213: ldc2_w 2129896297
    //   1216: l2i
    //   1217: ldc_w -520436944
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w -1175097190
    //   1227: l2i
    //   1228: ldc_w 625258483
    //   1231: ixor
    //   1232: ldc2_w -98855086
    //   1235: l2i
    //   1236: ldc_w 1714193697
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 1566, 8834330 -> 1268, 37646890 -> 1224
    //   1268: aload_0
    //   1269: getstatic Perryc.1 : I
    //   1272: ifeq -> 1286
    //   1275: ldc2_w 1655698624
    //   1278: l2i
    //   1279: ldc_w -125607646
    //   1282: ixor
    //   1283: goto -> 1294
    //   1286: ldc2_w -244596570
    //   1289: l2i
    //   1290: ldc_w 1951079872
    //   1293: ixor
    //   1294: ldc2_w -1844439090
    //   1297: l2i
    //   1298: ldc_w 591360340
    //   1301: ixor
    //   1302: ixor
    //   1303: lookupswitch default -> 1576, 721679224 -> 1286, 873446396 -> 1328
    //   1328: aload_2
    //   1329: ldc2_w 584601251
    //   1332: l2i
    //   1333: ldc_w 584601250
    //   1336: ixor
    //   1337: faload
    //   1338: getstatic Perryc.0 : I
    //   1341: ifle -> 1355
    //   1344: ldc2_w -1930214365
    //   1347: l2i
    //   1348: ldc_w 23234632
    //   1351: ixor
    //   1352: goto -> 1363
    //   1355: ldc2_w 791357110
    //   1358: l2i
    //   1359: ldc_w 653063477
    //   1362: ixor
    //   1363: ldc2_w -1005979187
    //   1366: l2i
    //   1367: ldc_w 349588632
    //   1370: ixor
    //   1371: ixor
    //   1372: lookupswitch default -> 1564, -652712234 -> 1400, 1565423934 -> 1355
    //   1400: putfield pitch : F
    //   1403: getstatic Perryc.0 : I
    //   1406: ifle -> 1420
    //   1409: ldc2_w -2063172691
    //   1412: l2i
    //   1413: ldc_w -1788939839
    //   1416: ixor
    //   1417: goto -> 1428
    //   1420: ldc2_w -701169237
    //   1423: l2i
    //   1424: ldc_w -969199857
    //   1427: ixor
    //   1428: ldc2_w 1962145212
    //   1431: l2i
    //   1432: ldc_w 1390596949
    //   1435: ixor
    //   1436: ixor
    //   1437: lookupswitch default -> 1546, 908003405 -> 1464, 910797957 -> 1420
    //   1464: aload_0
    //   1465: ldc2_w 1082930247
    //   1468: l2i
    //   1469: ldc_w 1082930246
    //   1472: ixor
    //   1473: getstatic Perryc.0 : I
    //   1476: ifle -> 1490
    //   1479: ldc2_w -1781044703
    //   1482: l2i
    //   1483: ldc_w -835454959
    //   1486: ixor
    //   1487: goto -> 1498
    //   1490: ldc2_w 1796709800
    //   1493: l2i
    //   1494: ldc_w 9462221
    //   1497: ixor
    //   1498: ldc2_w -190358946
    //   1501: l2i
    //   1502: ldc_w 704322311
    //   1505: ixor
    //   1506: ixor
    //   1507: lookupswitch default -> 1542, -2034707607 -> 1490, -1227113156 -> 1532
    //   1532: putfield isRotating : Z
    //   1535: return
    //   1536: aconst_null
    //   1537: athrow
    //   1538: aconst_null
    //   1539: athrow
    //   1540: aconst_null
    //   1541: athrow
    //   1542: aconst_null
    //   1543: athrow
    //   1544: aconst_null
    //   1545: athrow
    //   1546: aconst_null
    //   1547: athrow
    //   1548: aconst_null
    //   1549: athrow
    //   1550: aconst_null
    //   1551: athrow
    //   1552: aconst_null
    //   1553: athrow
    //   1554: aconst_null
    //   1555: athrow
    //   1556: aconst_null
    //   1557: athrow
    //   1558: aconst_null
    //   1559: athrow
    //   1560: aconst_null
    //   1561: athrow
    //   1562: aconst_null
    //   1563: athrow
    //   1564: aconst_null
    //   1565: athrow
    //   1566: aconst_null
    //   1567: athrow
    //   1568: aconst_null
    //   1569: athrow
    //   1570: aconst_null
    //   1571: athrow
    //   1572: aconst_null
    //   1573: athrow
    //   1574: aconst_null
    //   1575: athrow
    //   1576: aconst_null
    //   1577: athrow
    //   1578: aconst_null
    //   1579: athrow
    //   1580: pop
    //   1581: goto -> 24
    //   1584: pop
    //   1585: aconst_null
    //   1586: goto -> 1580
    //   1589: dup
    //   1590: ifnull -> 1580
    //   1593: checkcast java/lang/Throwable
    //   1596: athrow
    //   1597: dup
    //   1598: ifnull -> 1584
    //   1601: checkcast java/lang/Throwable
    //   1604: athrow
    //   1605: aconst_null
    //   1606: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1512	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	1512	1	pos	Lnet/minecraft/util/math/BlockPos;
    //   1013	523	2	angle	[F
    // Exception table:
    //   from	to	target	type
    //   8	20	1589	java/lang/ArrayIndexOutOfBoundsException
    //   279	286	286	finally
    //   280	286	286	finally
    //   280	286	3	finally
    //   280	286	286	java/lang/ArrayIndexOutOfBoundsException
    //   280	286	279	finally
    //   351	358	358	finally
    //   351	358	3	finally
    //   352	358	358	java/lang/IndexOutOfBoundsException
    //   352	358	3	java/lang/IndexOutOfBoundsException
    //   352	358	351	java/lang/RuntimeException
    //   487	494	494	finally
    //   487	494	494	finally
    //   487	494	494	finally
    //   488	494	3	finally
    //   488	494	487	java/util/ConcurrentModificationException
    //   635	642	642	finally
    //   635	642	3	java/lang/IllegalStateException
    //   635	642	635	java/lang/EnumConstantNotPresentException
    //   636	642	635	java/lang/ClassCastException
    //   636	642	3	java/lang/AssertionError
    //   783	790	790	finally
    //   783	790	783	java/lang/ArrayIndexOutOfBoundsException
    //   783	790	3	java/lang/ClassCastException
    //   784	790	790	finally
    //   784	790	790	java/lang/ArrayIndexOutOfBoundsException
    //   872	878	878	finally
    //   872	878	3	java/lang/RuntimeException
    //   872	878	878	finally
    //   872	878	878	java/lang/NullPointerException
    //   872	878	3	java/lang/UnsupportedOperationException
    //   943	950	950	finally
    //   943	950	950	java/util/ConcurrentModificationException
    //   943	950	943	finally
    //   943	950	943	finally
    //   944	950	950	java/util/ConcurrentModificationException
    //   1589	1597	1589	finally
    //   1605	1607	3	java/lang/AssertionError
  }
  
  public void setYawPitch(EntityEnderCrystal crystal) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1347
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1339
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1331
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1757884331
    //   33: l2i
    //   34: ldc_w -284243298
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1844256515
    //   44: l2i
    //   45: ldc_w 812429967
    //   48: ixor
    //   49: ldc2_w 1249628427
    //   52: l2i
    //   53: ldc_w -1268603250
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1302, 1550263799 -> 84, 2043712176 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 104
    //   93: ldc2_w -1572785389
    //   96: l2i
    //   97: ldc_w 1111571221
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -2111007347
    //   107: l2i
    //   108: ldc_w 748059994
    //   111: ixor
    //   112: ldc2_w -1329991327
    //   115: l2i
    //   116: ldc_w 916258051
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 1288, 681567413 -> 148, 1713701988 -> 104
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w 1533739824
    //   160: l2i
    //   161: ldc_w -2098109816
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -2053742814
    //   171: l2i
    //   172: ldc_w 965850765
    //   175: ixor
    //   176: ldc2_w 1872279398
    //   179: l2i
    //   180: ldc_w 1521469883
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 1300, -1993304206 -> 212, -324198555 -> 168
    //   212: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w -111370677
    //   224: l2i
    //   225: ldc_w -203842776
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 1445972228
    //   235: l2i
    //   236: ldc_w -1727397449
    //   239: ixor
    //   240: ldc2_w -1236016367
    //   243: l2i
    //   244: ldc_w 768400753
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 1320, -1860551933 -> 232, 1421539027 -> 276
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual func_184121_ak : ()F
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.0 : I
    //   290: ifle -> 304
    //   293: ldc2_w 246013556
    //   296: l2i
    //   297: ldc_w -706993075
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 1212136735
    //   307: l2i
    //   308: ldc_w -1789663472
    //   311: ixor
    //   312: ldc2_w 1521928358
    //   315: l2i
    //   316: ldc_w 940842461
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1447448189 -> 304, -1177079998 -> 1312
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual func_174824_e : (F)Lnet/minecraft/util/math/Vec3d;
    //   355: goto -> 359
    //   358: athrow
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 376
    //   365: ldc2_w 24330149
    //   368: l2i
    //   369: ldc_w 1368496347
    //   372: ixor
    //   373: goto -> 384
    //   376: ldc2_w -1718792314
    //   379: l2i
    //   380: ldc_w 1094277029
    //   383: ixor
    //   384: ldc2_w 521237406
    //   387: l2i
    //   388: ldc_w -510180872
    //   391: ixor
    //   392: ixor
    //   393: lookupswitch default -> 420, -1369139944 -> 1292, 275735991 -> 376
    //   420: aload_1
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 438
    //   427: ldc2_w 575245669
    //   430: l2i
    //   431: ldc_w 1965038241
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w 1922896149
    //   441: l2i
    //   442: ldc_w -757094898
    //   445: ixor
    //   446: ldc2_w -165515520
    //   449: l2i
    //   450: ldc_w -1047712594
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 1294, -1746013003 -> 480, 1623643242 -> 438
    //   480: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura.mc : Lnet/minecraft/client/Minecraft;
    //   483: getstatic Perryc.1 : I
    //   486: ifeq -> 500
    //   489: ldc2_w -713624726
    //   492: l2i
    //   493: ldc_w 1834433092
    //   496: ixor
    //   497: goto -> 508
    //   500: ldc2_w -987317659
    //   503: l2i
    //   504: ldc_w -609553423
    //   507: ixor
    //   508: ldc2_w -1676373629
    //   511: l2i
    //   512: ldc_w 1687462264
    //   515: ixor
    //   516: ixor
    //   517: lookupswitch default -> 1318, -435390097 -> 544, 1084357077 -> 500
    //   544: goto -> 548
    //   547: athrow
    //   548: invokevirtual func_184121_ak : ()F
    //   551: goto -> 555
    //   554: athrow
    //   555: getstatic Perryc.c : I
    //   558: iflt -> 572
    //   561: ldc2_w 1163076614
    //   564: l2i
    //   565: ldc_w -454531506
    //   568: ixor
    //   569: goto -> 580
    //   572: ldc2_w 623909837
    //   575: l2i
    //   576: ldc_w -973637204
    //   579: ixor
    //   580: ldc2_w 41501089
    //   583: l2i
    //   584: ldc_w -179497486
    //   587: ixor
    //   588: ixor
    //   589: lookupswitch default -> 1304, 401815090 -> 616, 1452217883 -> 572
    //   616: goto -> 620
    //   619: athrow
    //   620: invokevirtual func_174824_e : (F)Lnet/minecraft/util/math/Vec3d;
    //   623: goto -> 627
    //   626: athrow
    //   627: getstatic Perryc.1 : I
    //   630: ifeq -> 644
    //   633: ldc2_w -533016726
    //   636: l2i
    //   637: ldc_w 968627750
    //   640: ixor
    //   641: goto -> 652
    //   644: ldc2_w -2041154037
    //   647: l2i
    //   648: ldc_w -2090046559
    //   651: ixor
    //   652: ldc2_w 566359005
    //   655: l2i
    //   656: ldc_w 1886452621
    //   659: ixor
    //   660: ixor
    //   661: lookupswitch default -> 688, -2009607908 -> 1296, 1232091763 -> 644
    //   688: goto -> 692
    //   691: athrow
    //   692: invokestatic calcAngle : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
    //   695: goto -> 699
    //   698: athrow
    //   699: getstatic Perryc.c : I
    //   702: iflt -> 716
    //   705: ldc2_w -1040817666
    //   708: l2i
    //   709: ldc_w 1114104481
    //   712: ixor
    //   713: goto -> 724
    //   716: ldc2_w 1358828835
    //   719: l2i
    //   720: ldc_w 102205888
    //   723: ixor
    //   724: ldc2_w -799976419
    //   727: l2i
    //   728: ldc_w -129042007
    //   731: ixor
    //   732: ixor
    //   733: lookupswitch default -> 760, -1416745237 -> 1284, 2007258536 -> 716
    //   760: astore_2
    //   761: getstatic Perryc.0 : I
    //   764: ifle -> 778
    //   767: ldc2_w 351013306
    //   770: l2i
    //   771: ldc_w -1735694787
    //   774: ixor
    //   775: goto -> 786
    //   778: ldc2_w 1523881375
    //   781: l2i
    //   782: ldc_w 967612324
    //   785: ixor
    //   786: ldc2_w -2075066398
    //   789: l2i
    //   790: ldc_w 736326962
    //   793: ixor
    //   794: ixor
    //   795: lookupswitch default -> 820, 426245690 -> 778, 601154903 -> 1286
    //   820: aload_0
    //   821: getstatic Perryc.0 : I
    //   824: ifle -> 838
    //   827: ldc2_w -859062768
    //   830: l2i
    //   831: ldc_w -428315295
    //   834: ixor
    //   835: goto -> 846
    //   838: ldc2_w 2014547588
    //   841: l2i
    //   842: ldc_w 1528031961
    //   845: ixor
    //   846: ldc2_w -1374947197
    //   849: l2i
    //   850: ldc_w 2019257711
    //   853: ixor
    //   854: ixor
    //   855: lookupswitch default -> 880, -150171009 -> 838, -52214115 -> 1306
    //   880: aload_2
    //   881: ldc2_w -336352601
    //   884: l2i
    //   885: ldc_w -336352601
    //   888: ixor
    //   889: faload
    //   890: getstatic Perryc.0 : I
    //   893: ifle -> 907
    //   896: ldc2_w 569378599
    //   899: l2i
    //   900: ldc_w -699854594
    //   903: ixor
    //   904: goto -> 915
    //   907: ldc2_w -1058019470
    //   910: l2i
    //   911: ldc_w 1713417052
    //   914: ixor
    //   915: ldc2_w 1283728097
    //   918: l2i
    //   919: ldc_w -680756539
    //   922: ixor
    //   923: ixor
    //   924: lookupswitch default -> 952, 1322673234 -> 907, 1817268221 -> 1290
    //   952: putfield yaw : F
    //   955: getstatic Perryc.0 : I
    //   958: ifle -> 972
    //   961: ldc2_w 1638785970
    //   964: l2i
    //   965: ldc_w 1522414278
    //   968: ixor
    //   969: goto -> 980
    //   972: ldc2_w -1571015312
    //   975: l2i
    //   976: ldc_w 495879438
    //   979: ixor
    //   980: ldc2_w 237196456
    //   983: l2i
    //   984: ldc_w -710181272
    //   987: ixor
    //   988: ixor
    //   989: lookupswitch default -> 1016, -526648396 -> 1308, 622362263 -> 972
    //   1016: aload_0
    //   1017: getstatic Perryc.1 : I
    //   1020: ifeq -> 1034
    //   1023: ldc2_w 353958363
    //   1026: l2i
    //   1027: ldc_w 401524410
    //   1030: ixor
    //   1031: goto -> 1042
    //   1034: ldc2_w 679817147
    //   1037: l2i
    //   1038: ldc_w -1053382795
    //   1041: ixor
    //   1042: ldc2_w -602568433
    //   1045: l2i
    //   1046: ldc_w -1724688972
    //   1049: ixor
    //   1050: ixor
    //   1051: lookupswitch default -> 1076, 1204872154 -> 1298, 2103087034 -> 1034
    //   1076: aload_2
    //   1077: ldc2_w 855278515
    //   1080: l2i
    //   1081: ldc_w 855278514
    //   1084: ixor
    //   1085: faload
    //   1086: getstatic Perryc.1 : I
    //   1089: ifeq -> 1103
    //   1092: ldc2_w -1052694422
    //   1095: l2i
    //   1096: ldc_w -1382134387
    //   1099: ixor
    //   1100: goto -> 1111
    //   1103: ldc2_w 608578728
    //   1106: l2i
    //   1107: ldc_w 1310306725
    //   1110: ixor
    //   1111: ldc2_w -1894597577
    //   1114: l2i
    //   1115: ldc_w -152123794
    //   1118: ixor
    //   1119: ixor
    //   1120: lookupswitch default -> 1148, -1734712706 -> 1103, 354623422 -> 1310
    //   1148: putfield pitch : F
    //   1151: getstatic Perryc.1 : I
    //   1154: ifeq -> 1168
    //   1157: ldc2_w 1822849930
    //   1160: l2i
    //   1161: ldc_w -335753373
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w -446936956
    //   1171: l2i
    //   1172: ldc_w 661507545
    //   1175: ixor
    //   1176: ldc2_w 232451710
    //   1179: l2i
    //   1180: ldc_w -337270775
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 1316, 604947242 -> 1212, 1634071198 -> 1168
    //   1212: aload_0
    //   1213: ldc2_w -64911243
    //   1216: l2i
    //   1217: ldc_w -64911244
    //   1220: ixor
    //   1221: getstatic Perryc.0 : I
    //   1224: ifle -> 1238
    //   1227: ldc2_w 1004095692
    //   1230: l2i
    //   1231: ldc_w 506840149
    //   1234: ixor
    //   1235: goto -> 1246
    //   1238: ldc2_w 2048882485
    //   1241: l2i
    //   1242: ldc_w 315281819
    //   1245: ixor
    //   1246: ldc2_w -1658093650
    //   1249: l2i
    //   1250: ldc_w 293190402
    //   1253: ixor
    //   1254: ixor
    //   1255: lookupswitch default -> 1314, -1447147467 -> 1238, -460889598 -> 1280
    //   1280: putfield isRotating : Z
    //   1283: return
    //   1284: aconst_null
    //   1285: athrow
    //   1286: aconst_null
    //   1287: athrow
    //   1288: aconst_null
    //   1289: athrow
    //   1290: aconst_null
    //   1291: athrow
    //   1292: aconst_null
    //   1293: athrow
    //   1294: aconst_null
    //   1295: athrow
    //   1296: aconst_null
    //   1297: athrow
    //   1298: aconst_null
    //   1299: athrow
    //   1300: aconst_null
    //   1301: athrow
    //   1302: aconst_null
    //   1303: athrow
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
    //   1322: pop
    //   1323: goto -> 24
    //   1326: pop
    //   1327: aconst_null
    //   1328: goto -> 1322
    //   1331: dup
    //   1332: ifnull -> 1322
    //   1335: checkcast java/lang/Throwable
    //   1338: athrow
    //   1339: dup
    //   1340: ifnull -> 1326
    //   1343: checkcast java/lang/Throwable
    //   1346: athrow
    //   1347: aconst_null
    //   1348: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1260	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   24	1260	1	crystal	Lnet/minecraft/entity/item/EntityEnderCrystal;
    //   761	523	2	angle	[F
    // Exception table:
    //   from	to	target	type
    //   8	20	1331	finally
    //   279	286	286	finally
    //   279	286	279	finally
    //   279	286	286	java/lang/IllegalArgumentException
    //   280	286	3	finally
    //   280	286	279	finally
    //   352	358	358	finally
    //   352	358	358	java/lang/ClassCastException
    //   352	358	358	finally
    //   352	358	3	finally
    //   352	358	358	java/lang/ClassCastException
    //   547	554	554	finally
    //   547	554	3	java/lang/IllegalStateException
    //   548	554	554	java/lang/IllegalArgumentException
    //   548	554	547	finally
    //   548	554	547	finally
    //   620	626	626	finally
    //   620	626	626	finally
    //   620	626	3	finally
    //   620	626	3	java/util/NoSuchElementException
    //   620	626	3	java/lang/ArithmeticException
    //   692	698	698	finally
    //   692	698	698	java/util/NoSuchElementException
    //   692	698	3	finally
    //   692	698	698	java/lang/EnumConstantNotPresentException
    //   692	698	698	java/lang/IndexOutOfBoundsException
    //   1331	1339	1331	finally
    //   1347	1349	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public int findCrystalsHotbar() {
    return Perry1.36(this, (int)-682823083L ^ 0xD120963B);
  }
  
  public boolean isPlayerValid(EntityPlayer paramEntityPlayer) {
    return Perry1.0a(this, (int)1545647195L ^ 0x2EE6C981, paramEntityPlayer);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\CrystalAura.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */