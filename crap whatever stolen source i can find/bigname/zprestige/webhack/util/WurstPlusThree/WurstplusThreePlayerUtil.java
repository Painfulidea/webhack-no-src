package bigname.zprestige.webhack.util.WurstPlusThree;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.util.Globals;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;

public class WurstplusThreePlayerUtil implements Globals {
  public WurstplusThreePlayerUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -893228301
    //   9: l2i
    //   10: ldc -1389797062
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1548934021
    //   19: l2i
    //   20: ldc -2019409353
    //   22: ixor
    //   23: ldc2_w -1529871489
    //   26: l2i
    //   27: ldc 778345562
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 120, -312503060 -> 16, 1363412631 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -597108164
    //   66: l2i
    //   67: ldc -1930258488
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -281380156
    //   76: l2i
    //   77: ldc 1169892137
    //   79: ixor
    //   80: ldc2_w 483946648
    //   83: l2i
    //   84: ldc -1362090634
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -493742054 -> 73, 411634691 -> 116
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil;
  }
  
  public static double[] forward(double paramDouble) {
    return Perry1.0G(null, (int)-271151027L ^ 0xB9DB5C56, paramDouble);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static boolean isMoving(EntityLivingBase paramEntityLivingBase) {
    return Perry1.5Z(null, (int)-1681915758L ^ 0xCF1B8494, paramEntityLivingBase);
  }
  
  public static boolean isInHole() {
    return Perry1.4w(null, (int)420255058L ^ 0x15FBFD59);
  }
  
  public static UUID getUUIDFromName(String name) {
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
  
  public static String requestIDs(String data) {
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
  
  public static void setSpeed(EntityLivingBase paramEntityLivingBase, double paramDouble) {
    Perry1.06(null, (int)1962596035L ^ 0x566B8356, paramEntityLivingBase, paramDouble);
  }
  
  public static double getBaseMoveSpeed() {
    return Perry1.2B(null, (int)1929628270L ^ 0x75F60131);
  }
  
  public static BlockPos getPlayerPos() {
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
  
  public static int findObiInHotbar() {
    return Perry1.2Y(null, (int)237384948L ^ 0x74AF0465);
  }
  
  public static List getSphere(BlockPos loc, float r, int h, boolean hollow, boolean sphere, int plusY) {
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
  
  public static String convertStreamToString(InputStream is) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1567
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1559
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1551
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/io/BufferedReader
    //   27: dup
    //   28: new java/io/InputStreamReader
    //   31: dup
    //   32: getstatic Perryc.c : I
    //   35: iflt -> 49
    //   38: ldc2_w -1980461494
    //   41: l2i
    //   42: ldc_w 899799249
    //   45: ixor
    //   46: goto -> 57
    //   49: ldc2_w 1738307644
    //   52: l2i
    //   53: ldc_w -2067227655
    //   56: ixor
    //   57: ldc2_w 293901309
    //   60: l2i
    //   61: ldc_w -1060703106
    //   64: ixor
    //   65: ixor
    //   66: lookupswitch default -> 1530, 840336454 -> 92, 1830236440 -> 49
    //   92: aload_0
    //   93: getstatic Perryc.0 : I
    //   96: ifle -> 110
    //   99: ldc2_w -312638425
    //   102: l2i
    //   103: ldc_w -1706018202
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w -2047965032
    //   113: l2i
    //   114: ldc_w -1185874234
    //   117: ixor
    //   118: ldc2_w 932389494
    //   121: l2i
    //   122: ldc_w 1019252164
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 152, -28882239 -> 110, 2086539763 -> 1524
    //   152: goto -> 156
    //   155: athrow
    //   156: invokespecial <init> : (Ljava/io/InputStream;)V
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.1 : I
    //   166: ifeq -> 180
    //   169: ldc2_w 828403939
    //   172: l2i
    //   173: ldc_w -1712801832
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w 511024511
    //   183: l2i
    //   184: ldc_w -147880960
    //   187: ixor
    //   188: ldc2_w -857145646
    //   191: l2i
    //   192: ldc_w -1029018869
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 224, -1496689950 -> 1522, 1323123842 -> 180
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/io/Reader;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: getstatic Perryc.0 : I
    //   238: ifle -> 252
    //   241: ldc2_w -161969603
    //   244: l2i
    //   245: ldc_w -765479016
    //   248: ixor
    //   249: goto -> 260
    //   252: ldc2_w -2105328312
    //   255: l2i
    //   256: ldc_w 1274641915
    //   259: ixor
    //   260: ldc2_w -1450631462
    //   263: l2i
    //   264: ldc_w -1915801166
    //   267: ixor
    //   268: ixor
    //   269: lookupswitch default -> 1512, -314806309 -> 296, 4264653 -> 252
    //   296: astore_1
    //   297: new java/lang/StringBuilder
    //   300: dup
    //   301: getstatic Perryc.1 : I
    //   304: ifeq -> 318
    //   307: ldc2_w 1512607078
    //   310: l2i
    //   311: ldc_w 262933920
    //   314: ixor
    //   315: goto -> 326
    //   318: ldc2_w 1007919578
    //   321: l2i
    //   322: ldc_w -659212663
    //   325: ixor
    //   326: ldc2_w -1635290815
    //   329: l2i
    //   330: ldc_w 1085707590
    //   333: ixor
    //   334: ixor
    //   335: lookupswitch default -> 1510, -1951046463 -> 318, 983003988 -> 360
    //   360: goto -> 364
    //   363: athrow
    //   364: invokespecial <init> : ()V
    //   367: goto -> 371
    //   370: athrow
    //   371: getstatic Perryc.1 : I
    //   374: ifeq -> 388
    //   377: ldc2_w -316084250
    //   380: l2i
    //   381: ldc_w -1564152899
    //   384: ixor
    //   385: goto -> 396
    //   388: ldc2_w -598713891
    //   391: l2i
    //   392: ldc_w -1610951331
    //   395: ixor
    //   396: ldc2_w 231018020
    //   399: l2i
    //   400: ldc_w 1294697389
    //   403: ixor
    //   404: ixor
    //   405: lookupswitch default -> 432, 251824594 -> 1504, 1833909235 -> 388
    //   432: astore_2
    //   433: aconst_null
    //   434: getstatic Perryc.0 : I
    //   437: ifle -> 451
    //   440: ldc2_w 2054247445
    //   443: l2i
    //   444: ldc_w 1208311956
    //   447: ixor
    //   448: goto -> 459
    //   451: ldc2_w 2090454405
    //   454: l2i
    //   455: ldc_w 1507862035
    //   458: ixor
    //   459: ldc2_w -1440804181
    //   462: l2i
    //   463: ldc_w 137963430
    //   466: ixor
    //   467: ixor
    //   468: lookupswitch default -> 496, -1873673844 -> 1540, -807196237 -> 451
    //   496: astore_3
    //   497: getstatic Perryc.c : I
    //   500: iflt -> 514
    //   503: ldc2_w 364409535
    //   506: l2i
    //   507: ldc_w 603633183
    //   510: ixor
    //   511: goto -> 522
    //   514: ldc2_w 1804324964
    //   517: l2i
    //   518: ldc_w 2126639746
    //   521: ixor
    //   522: ldc2_w -94171218
    //   525: l2i
    //   526: ldc_w -1743679914
    //   529: ixor
    //   530: ixor
    //   531: lookupswitch default -> 1532, 1412449624 -> 514, 2000200478 -> 556
    //   556: aload_1
    //   557: getstatic Perryc.c : I
    //   560: iflt -> 574
    //   563: ldc2_w 1319932608
    //   566: l2i
    //   567: ldc_w 1895622467
    //   570: ixor
    //   571: goto -> 582
    //   574: ldc2_w -1893995487
    //   577: l2i
    //   578: ldc_w -312895994
    //   581: ixor
    //   582: ldc2_w -1514395579
    //   585: l2i
    //   586: ldc_w 2015673521
    //   589: ixor
    //   590: ixor
    //   591: lookupswitch default -> 1526, -1076171053 -> 616, -473374345 -> 574
    //   616: goto -> 620
    //   619: athrow
    //   620: invokevirtual readLine : ()Ljava/lang/String;
    //   623: goto -> 627
    //   626: athrow
    //   627: dup
    //   628: getstatic Perryc.1 : I
    //   631: ifeq -> 645
    //   634: ldc2_w -2113287823
    //   637: l2i
    //   638: ldc_w -814839274
    //   641: ixor
    //   642: goto -> 653
    //   645: ldc2_w -965916889
    //   648: l2i
    //   649: ldc_w -1868864233
    //   652: ixor
    //   653: ldc2_w -1010553145
    //   656: l2i
    //   657: ldc_w 1081169337
    //   660: ixor
    //   661: ixor
    //   662: lookupswitch default -> 1514, -825083879 -> 645, -717006514 -> 688
    //   688: astore_3
    //   689: ifnull -> 703
    //   692: ldc2_w -872207908
    //   695: l2i
    //   696: ldc_w 1046470480
    //   699: ixor
    //   700: goto -> 711
    //   703: ldc2_w -1685386894
    //   706: l2i
    //   707: ldc_w 1775763455
    //   710: ixor
    //   711: ldc2_w 382070744
    //   714: l2i
    //   715: ldc_w 1381545386
    //   718: ixor
    //   719: ixor
    //   720: tableswitch default -> 692, -1228821250 -> 744, -1228821249 -> 1235
    //   744: getstatic Perryc.c : I
    //   747: iflt -> 761
    //   750: ldc2_w 817022688
    //   753: l2i
    //   754: ldc_w 684224103
    //   757: ixor
    //   758: goto -> 769
    //   761: ldc2_w 71256252
    //   764: l2i
    //   765: ldc_w 1944090567
    //   768: ixor
    //   769: ldc2_w 662987648
    //   772: l2i
    //   773: ldc_w 871951509
    //   776: ixor
    //   777: ixor
    //   778: lookupswitch default -> 804, -1609362505 -> 761, 201729938 -> 1536
    //   804: aload_2
    //   805: new java/lang/StringBuilder
    //   808: dup
    //   809: getstatic Perryc.1 : I
    //   812: ifeq -> 826
    //   815: ldc2_w 665546420
    //   818: l2i
    //   819: ldc_w -1848797211
    //   822: ixor
    //   823: goto -> 834
    //   826: ldc2_w 603852927
    //   829: l2i
    //   830: ldc_w -355797926
    //   833: ixor
    //   834: ldc2_w 243272121
    //   837: l2i
    //   838: ldc_w 871734696
    //   841: ixor
    //   842: ixor
    //   843: lookupswitch default -> 1502, -1961661120 -> 826, -197038028 -> 868
    //   868: goto -> 872
    //   871: athrow
    //   872: invokespecial <init> : ()V
    //   875: goto -> 879
    //   878: athrow
    //   879: getstatic Perryc.c : I
    //   882: iflt -> 896
    //   885: ldc2_w 1022070155
    //   888: l2i
    //   889: ldc_w -1171279754
    //   892: ixor
    //   893: goto -> 904
    //   896: ldc2_w -812680262
    //   899: l2i
    //   900: ldc_w -1572526711
    //   903: ixor
    //   904: ldc2_w 275733714
    //   907: l2i
    //   908: ldc_w 1359685220
    //   911: ixor
    //   912: ixor
    //   913: lookupswitch default -> 1538, -945797301 -> 896, 749610117 -> 940
    //   940: aload_3
    //   941: getstatic Perryc.c : I
    //   944: iflt -> 958
    //   947: ldc2_w -8077376
    //   950: l2i
    //   951: ldc_w -447078534
    //   954: ixor
    //   955: goto -> 966
    //   958: ldc2_w 1234368521
    //   961: l2i
    //   962: ldc_w -1242996347
    //   965: ixor
    //   966: ldc2_w 62529296
    //   969: l2i
    //   970: ldc_w -1935784675
    //   973: ixor
    //   974: ixor
    //   975: lookupswitch default -> 1528, -1778713929 -> 958, 1935655809 -> 1000
    //   1000: goto -> 1004
    //   1003: athrow
    //   1004: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1007: goto -> 1011
    //   1010: athrow
    //   1011: ldc_w '\\n'
    //   1014: getstatic Perryc.0 : I
    //   1017: ifle -> 1031
    //   1020: ldc2_w 140777273
    //   1023: l2i
    //   1024: ldc_w -1315013731
    //   1027: ixor
    //   1028: goto -> 1039
    //   1031: ldc2_w -1559614065
    //   1034: l2i
    //   1035: ldc_w 1433632359
    //   1038: ixor
    //   1039: ldc2_w -1373770049
    //   1042: l2i
    //   1043: ldc_w -1602340770
    //   1046: ixor
    //   1047: ixor
    //   1048: lookupswitch default -> 1516, -1214662075 -> 1031, -132479735 -> 1076
    //   1076: goto -> 1080
    //   1079: athrow
    //   1080: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1083: goto -> 1087
    //   1086: athrow
    //   1087: getstatic Perryc.c : I
    //   1090: iflt -> 1104
    //   1093: ldc2_w 1608461659
    //   1096: l2i
    //   1097: ldc_w 1817665117
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w -1616092384
    //   1107: l2i
    //   1108: ldc_w 1067297046
    //   1111: ixor
    //   1112: ldc2_w 634229305
    //   1115: l2i
    //   1116: ldc_w -1342943119
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 1148, -1179537074 -> 1518, 1843040683 -> 1104
    //   1148: goto -> 1152
    //   1151: athrow
    //   1152: invokevirtual toString : ()Ljava/lang/String;
    //   1155: goto -> 1159
    //   1158: athrow
    //   1159: getstatic Perryc.c : I
    //   1162: iflt -> 1176
    //   1165: ldc2_w -521181559
    //   1168: l2i
    //   1169: ldc_w -693742204
    //   1172: ixor
    //   1173: goto -> 1184
    //   1176: ldc2_w 149412670
    //   1179: l2i
    //   1180: ldc_w -301435910
    //   1183: ixor
    //   1184: ldc2_w -472952746
    //   1187: l2i
    //   1188: ldc_w -656655625
    //   1191: ixor
    //   1192: ixor
    //   1193: lookupswitch default -> 1506, -570637723 -> 1220, 224025004 -> 1176
    //   1220: goto -> 1224
    //   1223: athrow
    //   1224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1227: goto -> 1231
    //   1230: athrow
    //   1231: pop
    //   1232: goto -> 497
    //   1235: getstatic Perryc.1 : I
    //   1238: ifeq -> 1252
    //   1241: ldc2_w -381014464
    //   1244: l2i
    //   1245: ldc_w -1473943913
    //   1248: ixor
    //   1249: goto -> 1260
    //   1252: ldc2_w -1472055040
    //   1255: l2i
    //   1256: ldc_w 700378327
    //   1259: ixor
    //   1260: ldc2_w 370469653
    //   1263: l2i
    //   1264: ldc_w -1120092945
    //   1267: ixor
    //   1268: ixor
    //   1269: lookupswitch default -> 1534, -364437715 -> 1252, 718570029 -> 1296
    //   1296: aload_0
    //   1297: getstatic Perryc.1 : I
    //   1300: ifeq -> 1314
    //   1303: ldc2_w 1369969039
    //   1306: l2i
    //   1307: ldc_w 889965884
    //   1310: ixor
    //   1311: goto -> 1322
    //   1314: ldc2_w -963208074
    //   1317: l2i
    //   1318: ldc_w -1289745993
    //   1321: ixor
    //   1322: ldc2_w -433198711
    //   1325: l2i
    //   1326: ldc_w 1510917246
    //   1329: ixor
    //   1330: ixor
    //   1331: lookupswitch default -> 1356, -662638268 -> 1520, 922047013 -> 1314
    //   1356: goto -> 1360
    //   1359: athrow
    //   1360: invokevirtual close : ()V
    //   1363: goto -> 1367
    //   1366: athrow
    //   1367: getstatic Perryc.0 : I
    //   1370: ifle -> 1384
    //   1373: ldc2_w 521348694
    //   1376: l2i
    //   1377: ldc_w 1170327645
    //   1380: ixor
    //   1381: goto -> 1392
    //   1384: ldc2_w -851747051
    //   1387: l2i
    //   1388: ldc_w -1431433265
    //   1391: ixor
    //   1392: ldc2_w 1629974251
    //   1395: l2i
    //   1396: ldc_w 1541749158
    //   1399: ixor
    //   1400: ixor
    //   1401: lookupswitch default -> 1428, -2106322786 -> 1384, 1611708742 -> 1500
    //   1428: aload_2
    //   1429: getstatic Perryc.c : I
    //   1432: iflt -> 1446
    //   1435: ldc2_w -1114297823
    //   1438: l2i
    //   1439: ldc_w 855888679
    //   1442: ixor
    //   1443: goto -> 1454
    //   1446: ldc2_w -146721270
    //   1449: l2i
    //   1450: ldc_w 844905621
    //   1453: ixor
    //   1454: ldc2_w -791078796
    //   1457: l2i
    //   1458: ldc_w 856516464
    //   1461: ixor
    //   1462: ixor
    //   1463: lookupswitch default -> 1508, 650737051 -> 1488, 1833076226 -> 1446
    //   1488: goto -> 1492
    //   1491: athrow
    //   1492: invokevirtual toString : ()Ljava/lang/String;
    //   1495: goto -> 1499
    //   1498: athrow
    //   1499: areturn
    //   1500: aconst_null
    //   1501: athrow
    //   1502: aconst_null
    //   1503: athrow
    //   1504: aconst_null
    //   1505: athrow
    //   1506: aconst_null
    //   1507: athrow
    //   1508: aconst_null
    //   1509: athrow
    //   1510: aconst_null
    //   1511: athrow
    //   1512: aconst_null
    //   1513: athrow
    //   1514: aconst_null
    //   1515: athrow
    //   1516: aconst_null
    //   1517: athrow
    //   1518: aconst_null
    //   1519: athrow
    //   1520: aconst_null
    //   1521: athrow
    //   1522: aconst_null
    //   1523: athrow
    //   1524: aconst_null
    //   1525: athrow
    //   1526: aconst_null
    //   1527: athrow
    //   1528: aconst_null
    //   1529: athrow
    //   1530: aconst_null
    //   1531: athrow
    //   1532: aconst_null
    //   1533: athrow
    //   1534: aconst_null
    //   1535: athrow
    //   1536: aconst_null
    //   1537: athrow
    //   1538: aconst_null
    //   1539: athrow
    //   1540: aconst_null
    //   1541: athrow
    //   1542: pop
    //   1543: goto -> 24
    //   1546: pop
    //   1547: aconst_null
    //   1548: goto -> 1542
    //   1551: dup
    //   1552: ifnull -> 1542
    //   1555: checkcast java/lang/Throwable
    //   1558: athrow
    //   1559: dup
    //   1560: ifnull -> 1546
    //   1563: checkcast java/lang/Throwable
    //   1566: athrow
    //   1567: aconst_null
    //   1568: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1476	0	is	Ljava/io/InputStream;
    //   297	1203	1	reader	Ljava/io/BufferedReader;
    //   433	1067	2	sb	Ljava/lang/StringBuilder;
    //   497	1003	3	line	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	1551	java/lang/IllegalArgumentException
    //   155	162	162	finally
    //   155	162	162	finally
    //   155	162	3	finally
    //   156	162	3	finally
    //   156	162	155	finally
    //   227	234	234	finally
    //   227	234	227	java/lang/ClassCastException
    //   228	234	3	java/lang/ArithmeticException
    //   228	234	3	java/util/ConcurrentModificationException
    //   228	234	234	finally
    //   363	370	370	finally
    //   363	370	370	finally
    //   363	370	363	finally
    //   364	370	363	finally
    //   364	370	370	java/lang/AssertionError
    //   619	626	626	finally
    //   619	626	3	java/lang/IllegalArgumentException
    //   619	626	619	java/lang/UnsupportedOperationException
    //   619	626	3	finally
    //   620	626	619	finally
    //   871	878	878	finally
    //   871	878	3	finally
    //   872	878	878	finally
    //   872	878	3	java/util/ConcurrentModificationException
    //   872	878	871	java/lang/EnumConstantNotPresentException
    //   1003	1010	1010	finally
    //   1003	1010	3	java/lang/IndexOutOfBoundsException
    //   1003	1010	3	java/lang/NumberFormatException
    //   1004	1010	1003	finally
    //   1004	1010	3	java/lang/ClassCastException
    //   1079	1086	1086	finally
    //   1079	1086	1079	finally
    //   1079	1086	3	finally
    //   1080	1086	3	java/lang/UnsupportedOperationException
    //   1080	1086	1086	finally
    //   1152	1158	1158	finally
    //   1152	1158	1158	java/lang/IndexOutOfBoundsException
    //   1152	1158	1158	finally
    //   1152	1158	1158	finally
    //   1152	1158	1158	finally
    //   1223	1230	1230	finally
    //   1223	1230	1223	java/lang/UnsupportedOperationException
    //   1223	1230	1223	java/lang/NullPointerException
    //   1223	1230	3	finally
    //   1224	1230	1230	finally
    //   1360	1366	1366	finally
    //   1360	1366	3	java/util/ConcurrentModificationException
    //   1360	1366	1366	java/lang/EnumConstantNotPresentException
    //   1360	1366	1366	java/lang/IndexOutOfBoundsException
    //   1360	1366	3	java/lang/NegativeArraySizeException
    //   1491	1498	1498	finally
    //   1491	1498	1498	java/lang/ArrayIndexOutOfBoundsException
    //   1491	1498	3	finally
    //   1492	1498	1491	java/lang/ClassCastException
    //   1492	1498	1491	finally
    //   1551	1559	1551	finally
    //   1567	1569	3	java/lang/IllegalStateException
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreePlayerUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */