package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Surround extends Module {
  public int obbySlot;
  
  public Timer retryTimer;
  
  public Setting<Boolean> rotate;
  
  public boolean didPlace;
  
  public boolean isSneaking;
  
  public Set<Vec3d> extendingBlocks;
  
  public int lastHotbarSlot;
  
  public static boolean isPlacing = (int)1998962034L ^ 0x7725BD72;
  
  public Timer timer;
  
  public Setting<Integer> blocksPerTick;
  
  public BlockPos startPos;
  
  public boolean switchedItem;
  
  public int isSafe;
  
  public Map<BlockPos, Integer> retries;
  
  public int extenders;
  
  public Setting<Integer> delay;
  
  public Setting<Boolean> noGhost;
  
  public int placements;
  
  public boolean offHand;
  
  public Vec3d areClose(Vec3d[] vec3ds) {
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
  
  public boolean placeBlocks(Vec3d pos, Vec3d[] vec3ds, boolean hasHelpingBlocks, boolean isHelping, boolean isExtending) {
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
  
  public void placeBlock(BlockPos paramBlockPos) {
    Perry1.61(this, (int)-472413761L ^ 0xB15A606C, paramBlockPos);
  }
  
  public String getDisplayInfo() {
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
  
  public void processExtendingBlocks() {
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
  
  public void onDisable() {
    Perry1.41(this, (int)-143950126L ^ 0xEB8AFB63);
  }
  
  public boolean check() {
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
  
  public void onEnable() {
    Perry1.4f(this, (int)1937009965L ^ 0x342CBD37);
  }
  
  public void doFeetPlace() {
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
  
  public void onTick() {
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
  
  public Surround() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -1987081618
    //   9: l2i
    //   10: ldc_w 1667094397
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1431033808
    //   20: l2i
    //   21: ldc_w 101397440
    //   24: ixor
    //   25: ldc2_w 1806752202
    //   28: l2i
    //   29: ldc_w -683731511
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 1277252292 -> 17, 1448972560 -> 3900
    //   60: aload_0
    //   61: ldc_w '?㌆?㶥棧㔺๷꘢'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -1734480778
    //   73: l2i
    //   74: ldc_w -2294567
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -31628945
    //   84: l2i
    //   85: ldc_w 1533469535
    //   88: ixor
    //   89: ldc2_w 1901610569
    //   92: l2i
    //   93: ldc_w 406088644
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 3990, -870862915 -> 124, 237845794 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '?㌆?㶥棧㔺๷꘢蹰㑖捑ਨᙆ無냷䛿辋ΎꜮ痯呺侢ㄕ䚺㜷辯ᣀ'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -1562513697
    //   139: l2i
    //   140: ldc_w 1971918010
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1496958037
    //   150: l2i
    //   151: ldc_w 1502490237
    //   154: ixor
    //   155: ldc2_w -269964450
    //   158: l2i
    //   159: ldc_w 553492653
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 3966, 406974870 -> 147, 811408933 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w 1354657547
    //   204: l2i
    //   205: ldc_w -1389141920
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1821528886
    //   215: l2i
    //   216: ldc_w 1599563409
    //   219: ixor
    //   220: ldc2_w 1911442725
    //   223: l2i
    //   224: ldc_w -863021667
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -145297427 -> 212, 1089214419 -> 3936
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -795557355
    //   262: l2i
    //   263: ldc_w -795557356
    //   266: ixor
    //   267: ldc2_w 1982601856
    //   270: l2i
    //   271: ldc_w 1982601856
    //   274: ixor
    //   275: ldc2_w -682123624
    //   278: l2i
    //   279: ldc_w -682123624
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 840446269
    //   292: l2i
    //   293: ldc_w -1619723586
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1682518176
    //   303: l2i
    //   304: ldc_w -2067766137
    //   307: ixor
    //   308: ldc2_w -771859380
    //   311: l2i
    //   312: ldc_w -1642300518
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 4002, -493949867 -> 300, 1351912497 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 1391216723
    //   356: l2i
    //   357: ldc_w 1610080567
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -349998537
    //   367: l2i
    //   368: ldc_w 1943180812
    //   371: ixor
    //   372: ldc2_w -1518959828
    //   375: l2i
    //   376: ldc_w -1093435404
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 3922, -2091640605 -> 408, 381572540 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 1583699965
    //   418: l2i
    //   419: ldc_w -1428969208
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -585306202
    //   429: l2i
    //   430: ldc_w 1899883575
    //   433: ixor
    //   434: ldc2_w -119466062
    //   437: l2i
    //   438: ldc_w 134661866
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -327753999 -> 426, 72429485 -> 3924
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '?㌟?㶴棣㔼้꘣蹱㐢捁ਤᙘ'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 1221201778
    //   485: l2i
    //   486: ldc_w 297588819
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1753123055
    //   496: l2i
    //   497: ldc_w -312596406
    //   500: ixor
    //   501: ldc2_w -1488575647
    //   504: l2i
    //   505: ldc_w -1441159459
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -1491265411 -> 493, 1411994269 -> 3986
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 644743700
    //   542: l2i
    //   543: ldc_w 644743709
    //   546: ixor
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w -1553727370
    //   556: l2i
    //   557: ldc_w 522661752
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1201026218
    //   567: l2i
    //   568: ldc_w 1975923796
    //   571: ixor
    //   572: ldc2_w -1649229696
    //   575: l2i
    //   576: ldc_w -1222145387
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 3902, -1764334309 -> 564, -415582953 -> 608
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w 1072332531
    //   614: l2i
    //   615: ldc_w 1072332530
    //   618: ixor
    //   619: getstatic Perryc.c : I
    //   622: iflt -> 636
    //   625: ldc2_w -183916746
    //   628: l2i
    //   629: ldc_w 1832332785
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 471264628
    //   639: l2i
    //   640: ldc_w 1947781210
    //   643: ixor
    //   644: ldc2_w -1232115221
    //   647: l2i
    //   648: ldc_w 33925021
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 3912, -595268776 -> 680, 750011569 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w 804285775
    //   686: l2i
    //   687: ldc_w 804285787
    //   690: ixor
    //   691: getstatic Perryc.1 : I
    //   694: ifeq -> 708
    //   697: ldc2_w 556200223
    //   700: l2i
    //   701: ldc_w 1591075453
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w -1668817853
    //   711: l2i
    //   712: ldc_w -1349742152
    //   715: ixor
    //   716: ldc2_w 1277555337
    //   719: l2i
    //   720: ldc_w -911860349
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 4004, -1232559375 -> 752, -93258648 -> 708
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 772
    //   761: ldc2_w -681272216
    //   764: l2i
    //   765: ldc_w 54437393
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -1506438332
    //   775: l2i
    //   776: ldc_w -577436025
    //   779: ixor
    //   780: ldc2_w -1271446399
    //   783: l2i
    //   784: ldc_w 71769632
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 816, 1680498904 -> 3974, 1814889330 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w -867572377
    //   828: l2i
    //   829: ldc_w -1984889349
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 1060847530
    //   839: l2i
    //   840: ldc_w -1401544008
    //   843: ixor
    //   844: ldc2_w -91621128
    //   847: l2i
    //   848: ldc_w -504249621
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, 1585521295 -> 3962, 1883342939 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.c : I
    //   886: iflt -> 900
    //   889: ldc2_w -1161053059
    //   892: l2i
    //   893: ldc_w -594535984
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 1097994807
    //   903: l2i
    //   904: ldc_w 1026492781
    //   907: ixor
    //   908: ldc2_w 1845368493
    //   911: l2i
    //   912: ldc_w -609795517
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 3992, -905687116 -> 944, -805113533 -> 900
    //   944: putfield blocksPerTick : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.1 : I
    //   950: ifeq -> 964
    //   953: ldc2_w 920472320
    //   956: l2i
    //   957: ldc_w 1989381048
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 403368763
    //   967: l2i
    //   968: ldc_w -892403097
    //   971: ixor
    //   972: ldc2_w 1043456117
    //   975: l2i
    //   976: ldc_w -1938731503
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 3982, -233935140 -> 964, 1619347256 -> 1008
    //   1008: aload_0
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w -986676506
    //   1018: l2i
    //   1019: ldc_w -1529153418
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w -164525893
    //   1029: l2i
    //   1030: ldc_w 1655457206
    //   1033: ixor
    //   1034: ldc2_w -1482237670
    //   1037: l2i
    //   1038: ldc_w -511932785
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 3976, -767061352 -> 1068, 657466629 -> 1026
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '?㌖?㶶棱'
    //   1076: getstatic Perryc.1 : I
    //   1079: ifeq -> 1093
    //   1082: ldc2_w -1839508496
    //   1085: l2i
    //   1086: ldc_w 1359956491
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w -1939596266
    //   1096: l2i
    //   1097: ldc_w -854469842
    //   1100: ixor
    //   1101: ldc2_w -1224693722
    //   1104: l2i
    //   1105: ldc_w -142256786
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 3984, -2083396429 -> 1093, 32518768 -> 1136
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w -1941903025
    //   1142: l2i
    //   1143: ldc_w -1941903025
    //   1146: ixor
    //   1147: getstatic Perryc.0 : I
    //   1150: ifle -> 1164
    //   1153: ldc2_w -769772053
    //   1156: l2i
    //   1157: ldc_w -731169251
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -1776570552
    //   1167: l2i
    //   1168: ldc_w -1793215848
    //   1171: ixor
    //   1172: ldc2_w 1338396281
    //   1175: l2i
    //   1176: ldc_w 847510801
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -1972247267 -> 1164, 2066790558 -> 3958
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w 694358624
    //   1214: l2i
    //   1215: ldc_w 694358624
    //   1218: ixor
    //   1219: getstatic Perryc.c : I
    //   1222: iflt -> 1236
    //   1225: ldc2_w 1521355851
    //   1228: l2i
    //   1229: ldc_w 1091120537
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w 1990704449
    //   1239: l2i
    //   1240: ldc_w 1794254346
    //   1243: ixor
    //   1244: ldc2_w -348249162
    //   1247: l2i
    //   1248: ldc_w -1415319141
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 1280, -1541545224 -> 1236, 1530590207 -> 3932
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w -202728693
    //   1286: l2i
    //   1287: ldc_w -202728463
    //   1290: ixor
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w 61364324
    //   1300: l2i
    //   1301: ldc_w 1335915824
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w 1597213926
    //   1311: l2i
    //   1312: ldc_w -1962829236
    //   1315: ixor
    //   1316: ldc2_w -549438967
    //   1319: l2i
    //   1320: ldc_w -2001256143
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -226032912 -> 1308, 469718636 -> 4000
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.0 : I
    //   1358: ifle -> 1372
    //   1361: ldc2_w 1688016799
    //   1364: l2i
    //   1365: ldc_w -1282975431
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 711491357
    //   1375: l2i
    //   1376: ldc_w 716880239
    //   1379: ixor
    //   1380: ldc2_w 901424239
    //   1383: l2i
    //   1384: ldc_w 2127343740
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 3952, -1670620491 -> 1372, 1269092961 -> 1416
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.1 : I
    //   1422: ifeq -> 1436
    //   1425: ldc2_w 2143706656
    //   1428: l2i
    //   1429: ldc_w -604943537
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 1645801110
    //   1439: l2i
    //   1440: ldc_w 1875421644
    //   1443: ixor
    //   1444: ldc2_w 726371325
    //   1447: l2i
    //   1448: ldc_w -68298844
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1480, 1503708610 -> 1436, 1955678518 -> 3938
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.1 : I
    //   1486: ifeq -> 1500
    //   1489: ldc2_w 78144232
    //   1492: l2i
    //   1493: ldc_w -1093866463
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w 1306629837
    //   1503: l2i
    //   1504: ldc_w -674161435
    //   1507: ixor
    //   1508: ldc2_w 1105457077
    //   1511: l2i
    //   1512: ldc_w 850352630
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, -920110966 -> 3918, 1865154623 -> 1500
    //   1544: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.c : I
    //   1550: iflt -> 1564
    //   1553: ldc2_w -1600637253
    //   1556: l2i
    //   1557: ldc_w -1590263313
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w -1378735886
    //   1567: l2i
    //   1568: ldc_w -112278832
    //   1571: ixor
    //   1572: ldc2_w -1584129853
    //   1575: l2i
    //   1576: ldc_w 1446696581
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, -1531948412 -> 1564, -167741166 -> 3988
    //   1608: aload_0
    //   1609: getstatic Perryc.1 : I
    //   1612: ifeq -> 1626
    //   1615: ldc2_w -1044089506
    //   1618: l2i
    //   1619: ldc_w 8176604
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w 860521918
    //   1629: l2i
    //   1630: ldc_w 165595918
    //   1633: ixor
    //   1634: ldc2_w 1571735796
    //   1637: l2i
    //   1638: ldc_w -1841379388
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 3896, -184270464 -> 1668, 237550002 -> 1626
    //   1668: aload_0
    //   1669: new bigname/zprestige/webhack/features/setting/Setting
    //   1672: dup
    //   1673: ldc_w '?㌒?㶼棭㔻้ꘪ蹢㐕捍'
    //   1676: getstatic Perryc.1 : I
    //   1679: ifeq -> 1693
    //   1682: ldc2_w -754215520
    //   1685: l2i
    //   1686: ldc_w -824478350
    //   1689: ixor
    //   1690: goto -> 1701
    //   1693: ldc2_w -290805378
    //   1696: l2i
    //   1697: ldc_w -1831463696
    //   1700: ixor
    //   1701: ldc2_w 1993346238
    //   1704: l2i
    //   1705: ldc_w 547658658
    //   1708: ixor
    //   1709: ixor
    //   1710: lookupswitch default -> 3954, 705178258 -> 1736, 1269069774 -> 1693
    //   1736: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1739: ldc2_w 1181421277
    //   1742: l2i
    //   1743: ldc_w 1181421276
    //   1746: ixor
    //   1747: getstatic Perryc.1 : I
    //   1750: ifeq -> 1764
    //   1753: ldc2_w 1690445329
    //   1756: l2i
    //   1757: ldc_w 1563648734
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 1273801062
    //   1767: l2i
    //   1768: ldc_w 977802202
    //   1771: ixor
    //   1772: ldc2_w 2094246787
    //   1775: l2i
    //   1776: ldc_w 390728300
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 3914, 440212307 -> 1808, 1382606112 -> 1764
    //   1808: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1811: getstatic Perryc.c : I
    //   1814: iflt -> 1828
    //   1817: ldc2_w 758376619
    //   1820: l2i
    //   1821: ldc_w -629123500
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w -617668897
    //   1831: l2i
    //   1832: ldc_w 1008003936
    //   1835: ixor
    //   1836: ldc2_w 1468961394
    //   1839: l2i
    //   1840: ldc_w -1328250946
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 3998, 6363251 -> 1872, 283726643 -> 1828
    //   1872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1875: getstatic Perryc.1 : I
    //   1878: ifeq -> 1892
    //   1881: ldc2_w 1863983094
    //   1884: l2i
    //   1885: ldc_w 291819043
    //   1888: ixor
    //   1889: goto -> 1900
    //   1892: ldc2_w 1453093919
    //   1895: l2i
    //   1896: ldc_w -149890384
    //   1899: ixor
    //   1900: ldc2_w -569278317
    //   1903: l2i
    //   1904: ldc_w -1465377668
    //   1907: ixor
    //   1908: ixor
    //   1909: lookupswitch default -> 3928, -684379584 -> 1936, 147279162 -> 1892
    //   1936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1939: getstatic Perryc.1 : I
    //   1942: ifeq -> 1956
    //   1945: ldc2_w 565481416
    //   1948: l2i
    //   1949: ldc_w -935714456
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w -82083214
    //   1959: l2i
    //   1960: ldc_w -204593427
    //   1963: ixor
    //   1964: ldc2_w 1811821699
    //   1967: l2i
    //   1968: ldc_w -1994105983
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 3904, -368063587 -> 2000, 190103970 -> 1956
    //   2000: putfield noGhost : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2003: getstatic Perryc.0 : I
    //   2006: ifle -> 2020
    //   2009: ldc2_w -1327037698
    //   2012: l2i
    //   2013: ldc_w 306744289
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 794875609
    //   2023: l2i
    //   2024: ldc_w 1663429376
    //   2027: ixor
    //   2028: ldc2_w -1057569645
    //   2031: l2i
    //   2032: ldc_w -664133155
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2064, -1226910404 -> 2020, -1171035055 -> 3906
    //   2064: aload_0
    //   2065: getstatic Perryc.1 : I
    //   2068: ifeq -> 2082
    //   2071: ldc2_w -1331170221
    //   2074: l2i
    //   2075: ldc_w -938375915
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w -1002865169
    //   2085: l2i
    //   2086: ldc_w 1860543596
    //   2089: ixor
    //   2090: ldc2_w 605714387
    //   2093: l2i
    //   2094: ldc_w -980130465
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 3892, -1724357686 -> 2082, 1263717135 -> 2124
    //   2124: aload_0
    //   2125: new bigname/zprestige/webhack/features/setting/Setting
    //   2128: dup
    //   2129: ldc_w '?㌜?㶶棼㔪'
    //   2132: getstatic Perryc.1 : I
    //   2135: ifeq -> 2149
    //   2138: ldc2_w -422442887
    //   2141: l2i
    //   2142: ldc_w -1404091794
    //   2145: ixor
    //   2146: goto -> 2157
    //   2149: ldc2_w -2023996434
    //   2152: l2i
    //   2153: ldc_w 555965438
    //   2156: ixor
    //   2157: ldc2_w -266419270
    //   2160: l2i
    //   2161: ldc_w -546250990
    //   2164: ixor
    //   2165: ixor
    //   2166: lookupswitch default -> 2192, -1667555794 -> 2149, 1710446271 -> 3994
    //   2192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2195: ldc2_w 2011042636
    //   2198: l2i
    //   2199: ldc_w 2011042636
    //   2202: ixor
    //   2203: getstatic Perryc.0 : I
    //   2206: ifle -> 2220
    //   2209: ldc2_w 2069146716
    //   2212: l2i
    //   2213: ldc_w 771622328
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w 610430705
    //   2223: l2i
    //   2224: ldc_w 2046722211
    //   2227: ixor
    //   2228: ldc2_w 1548752917
    //   2231: l2i
    //   2232: ldc_w 1653438049
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 3980, 1665237030 -> 2264, 1752680336 -> 2220
    //   2264: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2267: getstatic Perryc.0 : I
    //   2270: ifle -> 2284
    //   2273: ldc2_w -2120999954
    //   2276: l2i
    //   2277: ldc_w 49786184
    //   2280: ixor
    //   2281: goto -> 2292
    //   2284: ldc2_w -571651502
    //   2287: l2i
    //   2288: ldc_w -91389227
    //   2291: ixor
    //   2292: ldc2_w 1115976687
    //   2295: l2i
    //   2296: ldc_w 1093351765
    //   2299: ixor
    //   2300: ixor
    //   2301: lookupswitch default -> 2328, -2134049764 -> 3926, -240141074 -> 2284
    //   2328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2331: getstatic Perryc.1 : I
    //   2334: ifeq -> 2348
    //   2337: ldc2_w -1290590718
    //   2340: l2i
    //   2341: ldc_w 2010758139
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w 1921622729
    //   2351: l2i
    //   2352: ldc_w 60252702
    //   2355: ixor
    //   2356: ldc2_w 541682313
    //   2359: l2i
    //   2360: ldc_w 1432500048
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 2392, -1926982736 -> 2348, -1310605280 -> 3894
    //   2392: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2395: getstatic Perryc.1 : I
    //   2398: ifeq -> 2412
    //   2401: ldc2_w -1753125280
    //   2404: l2i
    //   2405: ldc_w -1298136385
    //   2408: ixor
    //   2409: goto -> 2420
    //   2412: ldc2_w 553969789
    //   2415: l2i
    //   2416: ldc_w 556865448
    //   2419: ixor
    //   2420: ldc2_w 1479186738
    //   2423: l2i
    //   2424: ldc_w -1331034325
    //   2427: ixor
    //   2428: ixor
    //   2429: lookupswitch default -> 3942, -845024570 -> 2412, -390766132 -> 2456
    //   2456: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2459: getstatic Perryc.0 : I
    //   2462: ifle -> 2476
    //   2465: ldc2_w -2047899650
    //   2468: l2i
    //   2469: ldc_w -1387027505
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w -1445254629
    //   2479: l2i
    //   2480: ldc_w -138781636
    //   2483: ixor
    //   2484: ldc2_w 313986824
    //   2487: l2i
    //   2488: ldc_w -1338936841
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 2520, -1975887154 -> 3920, 1452403153 -> 2476
    //   2520: aload_0
    //   2521: new bigname/zprestige/webhack/util/Timer
    //   2524: dup
    //   2525: getstatic Perryc.c : I
    //   2528: iflt -> 2542
    //   2531: ldc2_w -91517231
    //   2534: l2i
    //   2535: ldc_w 121438630
    //   2538: ixor
    //   2539: goto -> 2550
    //   2542: ldc2_w 31850066
    //   2545: l2i
    //   2546: ldc_w -702752497
    //   2549: ixor
    //   2550: ldc2_w -1023513570
    //   2553: l2i
    //   2554: ldc_w 1234103941
    //   2557: ixor
    //   2558: ixor
    //   2559: lookupswitch default -> 3940, 1552524742 -> 2584, 1992691180 -> 2542
    //   2584: invokespecial <init> : ()V
    //   2587: getstatic Perryc.1 : I
    //   2590: ifeq -> 2604
    //   2593: ldc2_w 1703561846
    //   2596: l2i
    //   2597: ldc_w -1161617328
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w -832062794
    //   2607: l2i
    //   2608: ldc_w -508319962
    //   2611: ixor
    //   2612: ldc2_w -2138646737
    //   2615: l2i
    //   2616: ldc_w -698737176
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 3972, -1986682655 -> 2604, 2030622551 -> 2648
    //   2648: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   2651: getstatic Perryc.1 : I
    //   2654: ifeq -> 2668
    //   2657: ldc2_w -1987366878
    //   2660: l2i
    //   2661: ldc_w -1904913472
    //   2664: ixor
    //   2665: goto -> 2676
    //   2668: ldc2_w -1577839689
    //   2671: l2i
    //   2672: ldc_w 64746379
    //   2675: ixor
    //   2676: ldc2_w -1543281752
    //   2679: l2i
    //   2680: ldc_w -457171549
    //   2683: ixor
    //   2684: ixor
    //   2685: lookupswitch default -> 3978, -487809481 -> 2712, 1195187689 -> 2668
    //   2712: aload_0
    //   2713: new bigname/zprestige/webhack/util/Timer
    //   2716: dup
    //   2717: getstatic Perryc.1 : I
    //   2720: ifeq -> 2734
    //   2723: ldc2_w -255381743
    //   2726: l2i
    //   2727: ldc_w 1980817881
    //   2730: ixor
    //   2731: goto -> 2742
    //   2734: ldc2_w 1640376913
    //   2737: l2i
    //   2738: ldc_w 1406428159
    //   2741: ixor
    //   2742: ldc2_w -1061979633
    //   2745: l2i
    //   2746: ldc_w 1296368100
    //   2749: ixor
    //   2750: ixor
    //   2751: lookupswitch default -> 2776, -1547848636 -> 2734, 186758435 -> 3948
    //   2776: invokespecial <init> : ()V
    //   2779: getstatic Perryc.c : I
    //   2782: iflt -> 2796
    //   2785: ldc2_w 1584796034
    //   2788: l2i
    //   2789: ldc_w 866891866
    //   2792: ixor
    //   2793: goto -> 2804
    //   2796: ldc2_w 954654765
    //   2799: l2i
    //   2800: ldc_w 1828870910
    //   2803: ixor
    //   2804: ldc2_w -1153949198
    //   2807: l2i
    //   2808: ldc_w 1367482083
    //   2811: ixor
    //   2812: ixor
    //   2813: lookupswitch default -> 3944, -2023254327 -> 2796, -1084324414 -> 2840
    //   2840: putfield retryTimer : Lbigname/zprestige/webhack/util/Timer;
    //   2843: getstatic Perryc.0 : I
    //   2846: ifle -> 2860
    //   2849: ldc2_w 1479239737
    //   2852: l2i
    //   2853: ldc_w -1565743085
    //   2856: ixor
    //   2857: goto -> 2868
    //   2860: ldc2_w -961015235
    //   2863: l2i
    //   2864: ldc_w 2075308709
    //   2867: ixor
    //   2868: ldc2_w -1060306638
    //   2871: l2i
    //   2872: ldc_w 1923631672
    //   2875: ixor
    //   2876: ixor
    //   2877: lookupswitch default -> 3898, 258993042 -> 2904, 1222806304 -> 2860
    //   2904: aload_0
    //   2905: new java/util/HashSet
    //   2908: dup
    //   2909: getstatic Perryc.1 : I
    //   2912: ifeq -> 2926
    //   2915: ldc2_w -1522558543
    //   2918: l2i
    //   2919: ldc_w 1631103013
    //   2922: ixor
    //   2923: goto -> 2934
    //   2926: ldc2_w -427492325
    //   2929: l2i
    //   2930: ldc_w -1676165347
    //   2933: ixor
    //   2934: ldc2_w -1225307943
    //   2937: l2i
    //   2938: ldc_w -2047318268
    //   2941: ixor
    //   2942: ixor
    //   2943: lookupswitch default -> 2968, -2113560812 -> 2926, -150462903 -> 3930
    //   2968: invokespecial <init> : ()V
    //   2971: getstatic Perryc.1 : I
    //   2974: ifeq -> 2988
    //   2977: ldc2_w -55440696
    //   2980: l2i
    //   2981: ldc_w -578087438
    //   2984: ixor
    //   2985: goto -> 2996
    //   2988: ldc2_w -15378362
    //   2991: l2i
    //   2992: ldc_w -910274330
    //   2995: ixor
    //   2996: ldc2_w -1022775401
    //   2999: l2i
    //   3000: ldc_w -1849184579
    //   3003: ixor
    //   3004: ixor
    //   3005: lookupswitch default -> 3934, 1684343178 -> 3032, 1945574928 -> 2988
    //   3032: putfield extendingBlocks : Ljava/util/Set;
    //   3035: getstatic Perryc.0 : I
    //   3038: ifle -> 3052
    //   3041: ldc2_w -776050286
    //   3044: l2i
    //   3045: ldc_w -1747416751
    //   3048: ixor
    //   3049: goto -> 3060
    //   3052: ldc2_w 275589546
    //   3055: l2i
    //   3056: ldc_w 713630211
    //   3059: ixor
    //   3060: ldc2_w -1601441019
    //   3063: l2i
    //   3064: ldc_w -950272167
    //   3067: ixor
    //   3068: ixor
    //   3069: lookupswitch default -> 3956, 565636255 -> 3052, 1563690997 -> 3096
    //   3096: aload_0
    //   3097: new java/util/HashMap
    //   3100: dup
    //   3101: getstatic Perryc.1 : I
    //   3104: ifeq -> 3118
    //   3107: ldc2_w -500551824
    //   3110: l2i
    //   3111: ldc_w -1418787248
    //   3114: ixor
    //   3115: goto -> 3126
    //   3118: ldc2_w -179110496
    //   3121: l2i
    //   3122: ldc_w -1325859974
    //   3125: ixor
    //   3126: ldc2_w 839562400
    //   3129: l2i
    //   3130: ldc_w -979573003
    //   3133: ixor
    //   3134: ixor
    //   3135: lookupswitch default -> 3968, -1304669041 -> 3160, -1093436555 -> 3118
    //   3160: invokespecial <init> : ()V
    //   3163: getstatic Perryc.0 : I
    //   3166: ifle -> 3180
    //   3169: ldc2_w -35272577
    //   3172: l2i
    //   3173: ldc_w -79403935
    //   3176: ixor
    //   3177: goto -> 3188
    //   3180: ldc2_w -1226176893
    //   3183: l2i
    //   3184: ldc_w 1783912639
    //   3187: ixor
    //   3188: ldc2_w -1544677625
    //   3191: l2i
    //   3192: ldc_w -1600890233
    //   3195: ixor
    //   3196: ixor
    //   3197: lookupswitch default -> 3916, -540798020 -> 3224, 98296222 -> 3180
    //   3224: putfield retries : Ljava/util/Map;
    //   3227: getstatic Perryc.0 : I
    //   3230: ifle -> 3244
    //   3233: ldc2_w 362829108
    //   3236: l2i
    //   3237: ldc_w 1094550992
    //   3240: ixor
    //   3241: goto -> 3252
    //   3244: ldc2_w -1745490880
    //   3247: l2i
    //   3248: ldc_w -152514878
    //   3251: ixor
    //   3252: ldc2_w -1825486531
    //   3255: l2i
    //   3256: ldc_w 1848989777
    //   3259: ixor
    //   3260: ixor
    //   3261: lookupswitch default -> 3890, -1676069906 -> 3288, -1449541240 -> 3244
    //   3288: aload_0
    //   3289: ldc2_w -1601770512
    //   3292: l2i
    //   3293: ldc_w -1601770512
    //   3296: ixor
    //   3297: getstatic Perryc.c : I
    //   3300: iflt -> 3314
    //   3303: ldc2_w -2016501168
    //   3306: l2i
    //   3307: ldc_w -1266960673
    //   3310: ixor
    //   3311: goto -> 3322
    //   3314: ldc2_w 654931147
    //   3317: l2i
    //   3318: ldc_w 933747622
    //   3321: ixor
    //   3322: ldc2_w 1491515723
    //   3325: l2i
    //   3326: ldc_w -1697049150
    //   3329: ixor
    //   3330: ixor
    //   3331: lookupswitch default -> 3970, -762248220 -> 3356, -242567162 -> 3314
    //   3356: putfield didPlace : Z
    //   3359: getstatic Perryc.1 : I
    //   3362: ifeq -> 3376
    //   3365: ldc2_w 232614841
    //   3368: l2i
    //   3369: ldc_w -1784408814
    //   3372: ixor
    //   3373: goto -> 3384
    //   3376: ldc2_w -1712409833
    //   3379: l2i
    //   3380: ldc_w -2122717591
    //   3383: ixor
    //   3384: ldc2_w -1013177533
    //   3387: l2i
    //   3388: ldc_w -147688587
    //   3391: ixor
    //   3392: ixor
    //   3393: lookupswitch default -> 3964, -1395183971 -> 3376, 741934408 -> 3420
    //   3420: aload_0
    //   3421: ldc2_w 1035889702
    //   3424: l2i
    //   3425: ldc_w 1035889702
    //   3428: ixor
    //   3429: getstatic Perryc.0 : I
    //   3432: ifle -> 3446
    //   3435: ldc2_w -2053036046
    //   3438: l2i
    //   3439: ldc_w 722638801
    //   3442: ixor
    //   3443: goto -> 3454
    //   3446: ldc2_w -599766393
    //   3449: l2i
    //   3450: ldc_w -1820781905
    //   3453: ixor
    //   3454: ldc2_w -345508516
    //   3457: l2i
    //   3458: ldc_w -728394260
    //   3461: ixor
    //   3462: ixor
    //   3463: lookupswitch default -> 3488, -1857957741 -> 3888, 1290215226 -> 3446
    //   3488: putfield placements : I
    //   3491: getstatic Perryc.0 : I
    //   3494: ifle -> 3508
    //   3497: ldc2_w 1673339860
    //   3500: l2i
    //   3501: ldc_w -1827217541
    //   3504: ixor
    //   3505: goto -> 3516
    //   3508: ldc2_w 1671091766
    //   3511: l2i
    //   3512: ldc_w 1722201931
    //   3515: ixor
    //   3516: ldc2_w 841660813
    //   3519: l2i
    //   3520: ldc_w 355540697
    //   3523: ixor
    //   3524: ixor
    //   3525: lookupswitch default -> 3908, -676307973 -> 3508, 573031977 -> 3552
    //   3552: aload_0
    //   3553: ldc2_w 1206318421
    //   3556: l2i
    //   3557: ldc_w 1206318420
    //   3560: ixor
    //   3561: getstatic Perryc.1 : I
    //   3564: ifeq -> 3578
    //   3567: ldc2_w 1359514258
    //   3570: l2i
    //   3571: ldc_w -1020233538
    //   3574: ixor
    //   3575: goto -> 3586
    //   3578: ldc2_w -1697653367
    //   3581: l2i
    //   3582: ldc_w 537777982
    //   3585: ixor
    //   3586: ldc2_w -1877209529
    //   3589: l2i
    //   3590: ldc_w 1516188751
    //   3593: ixor
    //   3594: ixor
    //   3595: lookupswitch default -> 3620, 1064224570 -> 3578, 1484507172 -> 3946
    //   3620: putfield extenders : I
    //   3623: getstatic Perryc.1 : I
    //   3626: ifeq -> 3640
    //   3629: ldc2_w 93908406
    //   3632: l2i
    //   3633: ldc_w 236461418
    //   3636: ixor
    //   3637: goto -> 3648
    //   3640: ldc2_w 1019308252
    //   3643: l2i
    //   3644: ldc_w -2061917365
    //   3647: ixor
    //   3648: ldc2_w -120636899
    //   3651: l2i
    //   3652: ldc_w -1571526353
    //   3655: ixor
    //   3656: ixor
    //   3657: lookupswitch default -> 3684, -391786082 -> 3640, 1360765934 -> 3960
    //   3684: aload_0
    //   3685: ldc2_w -1701489954
    //   3688: l2i
    //   3689: ldc_w 1701489953
    //   3692: ixor
    //   3693: getstatic Perryc.c : I
    //   3696: iflt -> 3710
    //   3699: ldc2_w -123198400
    //   3702: l2i
    //   3703: ldc_w -613583753
    //   3706: ixor
    //   3707: goto -> 3718
    //   3710: ldc2_w 1056788050
    //   3713: l2i
    //   3714: ldc_w -1907181163
    //   3717: ixor
    //   3718: ldc2_w 463474920
    //   3721: l2i
    //   3722: ldc_w 930948243
    //   3725: ixor
    //   3726: ixor
    //   3727: lookupswitch default -> 3996, -1670200388 -> 3752, 253256780 -> 3710
    //   3752: putfield obbySlot : I
    //   3755: getstatic Perryc.c : I
    //   3758: iflt -> 3772
    //   3761: ldc2_w -978373740
    //   3764: l2i
    //   3765: ldc_w 1380507860
    //   3768: ixor
    //   3769: goto -> 3780
    //   3772: ldc2_w -1176751990
    //   3775: l2i
    //   3776: ldc_w 1197033348
    //   3779: ixor
    //   3780: ldc2_w 855704258
    //   3783: l2i
    //   3784: ldc_w 1023193306
    //   3787: ixor
    //   3788: ixor
    //   3789: lookupswitch default -> 3950, -1743101608 -> 3772, -243743466 -> 3816
    //   3816: aload_0
    //   3817: ldc2_w 1566103146
    //   3820: l2i
    //   3821: ldc_w 1566103146
    //   3824: ixor
    //   3825: getstatic Perryc.c : I
    //   3828: iflt -> 3842
    //   3831: ldc2_w 1784756662
    //   3834: l2i
    //   3835: ldc_w 2125419989
    //   3838: ixor
    //   3839: goto -> 3850
    //   3842: ldc2_w -773754100
    //   3845: l2i
    //   3846: ldc_w 80650116
    //   3849: ixor
    //   3850: ldc2_w -806791233
    //   3853: l2i
    //   3854: ldc_w 827468527
    //   3857: ixor
    //   3858: ixor
    //   3859: lookupswitch default -> 3884, -361426637 -> 3910, 1654967978 -> 3842
    //   3884: putfield offHand : Z
    //   3887: return
    //   3888: aconst_null
    //   3889: athrow
    //   3890: aconst_null
    //   3891: athrow
    //   3892: aconst_null
    //   3893: athrow
    //   3894: aconst_null
    //   3895: athrow
    //   3896: aconst_null
    //   3897: athrow
    //   3898: aconst_null
    //   3899: athrow
    //   3900: aconst_null
    //   3901: athrow
    //   3902: aconst_null
    //   3903: athrow
    //   3904: aconst_null
    //   3905: athrow
    //   3906: aconst_null
    //   3907: athrow
    //   3908: aconst_null
    //   3909: athrow
    //   3910: aconst_null
    //   3911: athrow
    //   3912: aconst_null
    //   3913: athrow
    //   3914: aconst_null
    //   3915: athrow
    //   3916: aconst_null
    //   3917: athrow
    //   3918: aconst_null
    //   3919: athrow
    //   3920: aconst_null
    //   3921: athrow
    //   3922: aconst_null
    //   3923: athrow
    //   3924: aconst_null
    //   3925: athrow
    //   3926: aconst_null
    //   3927: athrow
    //   3928: aconst_null
    //   3929: athrow
    //   3930: aconst_null
    //   3931: athrow
    //   3932: aconst_null
    //   3933: athrow
    //   3934: aconst_null
    //   3935: athrow
    //   3936: aconst_null
    //   3937: athrow
    //   3938: aconst_null
    //   3939: athrow
    //   3940: aconst_null
    //   3941: athrow
    //   3942: aconst_null
    //   3943: athrow
    //   3944: aconst_null
    //   3945: athrow
    //   3946: aconst_null
    //   3947: athrow
    //   3948: aconst_null
    //   3949: athrow
    //   3950: aconst_null
    //   3951: athrow
    //   3952: aconst_null
    //   3953: athrow
    //   3954: aconst_null
    //   3955: athrow
    //   3956: aconst_null
    //   3957: athrow
    //   3958: aconst_null
    //   3959: athrow
    //   3960: aconst_null
    //   3961: athrow
    //   3962: aconst_null
    //   3963: athrow
    //   3964: aconst_null
    //   3965: athrow
    //   3966: aconst_null
    //   3967: athrow
    //   3968: aconst_null
    //   3969: athrow
    //   3970: aconst_null
    //   3971: athrow
    //   3972: aconst_null
    //   3973: athrow
    //   3974: aconst_null
    //   3975: athrow
    //   3976: aconst_null
    //   3977: athrow
    //   3978: aconst_null
    //   3979: athrow
    //   3980: aconst_null
    //   3981: athrow
    //   3982: aconst_null
    //   3983: athrow
    //   3984: aconst_null
    //   3985: athrow
    //   3986: aconst_null
    //   3987: athrow
    //   3988: aconst_null
    //   3989: athrow
    //   3990: aconst_null
    //   3991: athrow
    //   3992: aconst_null
    //   3993: athrow
    //   3994: aconst_null
    //   3995: athrow
    //   3996: aconst_null
    //   3997: athrow
    //   3998: aconst_null
    //   3999: athrow
    //   4000: aconst_null
    //   4001: athrow
    //   4002: aconst_null
    //   4003: athrow
    //   4004: aconst_null
    //   4005: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3888	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Surround;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\Surround.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */