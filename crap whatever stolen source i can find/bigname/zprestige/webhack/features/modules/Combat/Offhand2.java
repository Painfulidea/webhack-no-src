package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.ProcessRightClickBlockEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.InventoryUtil;
import bigname.zprestige.webhack.util.Timer;
import java.util.Queue;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Offhand2 extends Module {
  public int lastObbySlot;
  
  public int gapples;
  
  public boolean switchedForHealthReason;
  
  public Setting<Boolean> armorCheck;
  
  public boolean second;
  
  public Offhand2$Mode2 currentMode;
  
  public boolean didSwitchThisTick;
  
  public int lastTotemSlot;
  
  public boolean holdingGapple;
  
  public Setting<Float> crystalHealth;
  
  public Timer timer;
  
  public Setting<Float> crystalHoleHealth;
  
  public int crystals;
  
  public boolean holdingTotem;
  
  public Setting<Boolean> gapple;
  
  public boolean holdingCrystal;
  
  public int lastWebSlot;
  
  public Queue<InventoryUtil.Task> taskList;
  
  public Setting<Boolean> crystal;
  
  public Setting<Integer> actions;
  
  public Timer secondTimer;
  
  public int totems;
  
  public static Offhand2 instance;
  
  public int lastGappleSlot;
  
  public int lastCrystalSlot;
  
  public static boolean lambda$doOffhand$4(ItemStack paramItemStack) {
    return Perry1.0A(null, (int)1742491391L ^ 0x778484EB, paramItemStack);
  }
  
  public static boolean lambda$doOffhand$5(ItemStack paramItemStack) {
    return Perry1.0t(null, (int)324407495L ^ 0x50D7C01C, paramItemStack);
  }
  
  @SubscribeEvent
  public void onPacketSend(PacketEvent.Send event) {
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
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.1E(this, (int)-1463179910L ^ 0x8AB6C463, paramObject);
  }
  
  public static boolean lambda$doOffhand$3(ItemStack paramItemStack) {
    return Perry1.0u(null, (int)1969737961L ^ 0x3DEC509D, paramItemStack);
  }
  
  public Offhand2() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 2015265990
    //   9: l2i
    //   10: ldc_w -1236450857
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -2036264889
    //   20: l2i
    //   21: ldc_w 1450548559
    //   24: ixor
    //   25: ldc2_w -419113131
    //   28: l2i
    //   29: ldc_w -1476559972
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1901434408 -> 6420, 84168088 -> 17
    //   60: aload_0
    //   61: ldc_w 'Ꮚ㌕ᎉ㶿?ﵗ๽'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 163714530
    //   73: l2i
    //   74: ldc_w 192930358
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -148120166
    //   84: l2i
    //   85: ldc_w -1976289306
    //   88: ixor
    //   89: ldc2_w -864205331
    //   92: l2i
    //   93: ldc_w -1259511177
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1103671726 -> 81, 2049822798 -> 6488
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w 'Ꮔ㌟ᎃ㶸?﵊ู湑蹬莩ꭾਲ਼?無ݙ躗辖쯼ꝭ쉢鱎侤異䛾肍䟗ᣛ뛴⤕ಚ皤摳畝㘶縊央'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 214217421
    //   139: l2i
    //   140: ldc_w -323239925
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1203567302
    //   150: l2i
    //   151: ldc_w 1018518702
    //   154: ixor
    //   155: ldc2_w 1832590779
    //   158: l2i
    //   159: ldc_w 296649878
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1662325781 -> 6594, 1574562768 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -1916812678
    //   204: l2i
    //   205: ldc_w -952109684
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -987711628
    //   215: l2i
    //   216: ldc_w 1818566206
    //   219: ixor
    //   220: ldc2_w 906485496
    //   223: l2i
    //   224: ldc_w 1689750641
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 6466, -67765309 -> 256, 405824895 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -35776008
    //   262: l2i
    //   263: ldc_w -35776007
    //   266: ixor
    //   267: ldc2_w -920094935
    //   270: l2i
    //   271: ldc_w -920094935
    //   274: ixor
    //   275: ldc2_w -1056528995
    //   278: l2i
    //   279: ldc_w -1056528995
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 1377698122
    //   292: l2i
    //   293: ldc_w 1257304815
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -835155548
    //   303: l2i
    //   304: ldc_w -1773110794
    //   307: ixor
    //   308: ldc2_w 986008351
    //   311: l2i
    //   312: ldc_w 954656384
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 6480, 449666618 -> 300, 1514888653 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 436492944
    //   356: l2i
    //   357: ldc_w -1829986278
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 226702978
    //   367: l2i
    //   368: ldc_w 884980382
    //   371: ixor
    //   372: ldc2_w 1066164309
    //   375: l2i
    //   376: ldc_w 2065634283
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -864319180 -> 6468, -340310728 -> 364
    //   408: aload_0
    //   409: new java/util/concurrent/ConcurrentLinkedQueue
    //   412: dup
    //   413: getstatic Perryc.1 : I
    //   416: ifeq -> 430
    //   419: ldc2_w -287568522
    //   422: l2i
    //   423: ldc_w -2015969717
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w -961312901
    //   433: l2i
    //   434: ldc_w 2024462531
    //   437: ixor
    //   438: ldc2_w 1824618857
    //   441: l2i
    //   442: ldc_w 1773079085
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 472, -490199034 -> 430, 1818542201 -> 6454
    //   472: invokespecial <init> : ()V
    //   475: getstatic Perryc.1 : I
    //   478: ifeq -> 492
    //   481: ldc2_w 1036532101
    //   484: l2i
    //   485: ldc_w 1603312248
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -1936225196
    //   495: l2i
    //   496: ldc_w -149413759
    //   499: ixor
    //   500: ldc2_w -1248253199
    //   503: l2i
    //   504: ldc_w 444015440
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, -843666852 -> 6526, 324340103 -> 492
    //   536: putfield taskList : Ljava/util/Queue;
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 556
    //   545: ldc2_w -508431728
    //   548: l2i
    //   549: ldc_w 371224534
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 1124339793
    //   559: l2i
    //   560: ldc_w -1016389763
    //   563: ixor
    //   564: ldc2_w -198712663
    //   567: l2i
    //   568: ldc_w -391276025
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 6568, -1662683262 -> 600, -350493208 -> 556
    //   600: aload_0
    //   601: new bigname/zprestige/webhack/util/Timer
    //   604: dup
    //   605: getstatic Perryc.0 : I
    //   608: ifle -> 622
    //   611: ldc2_w -95326108
    //   614: l2i
    //   615: ldc_w 1979679186
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w 974667548
    //   625: l2i
    //   626: ldc_w -599282598
    //   629: ixor
    //   630: ldc2_w 859809907
    //   633: l2i
    //   634: ldc_w -1618801434
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 6482, 588404003 -> 622, 1256404947 -> 664
    //   664: invokespecial <init> : ()V
    //   667: getstatic Perryc.c : I
    //   670: iflt -> 684
    //   673: ldc2_w 724103002
    //   676: l2i
    //   677: ldc_w -2081310031
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w -852765057
    //   687: l2i
    //   688: ldc_w -2144176566
    //   691: ixor
    //   692: ldc2_w 1949038383
    //   695: l2i
    //   696: ldc_w -1250594703
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 6456, -1941493909 -> 728, 1770508981 -> 684
    //   728: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   731: getstatic Perryc.1 : I
    //   734: ifeq -> 748
    //   737: ldc2_w -1669285084
    //   740: l2i
    //   741: ldc_w 117472716
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w -932882284
    //   751: l2i
    //   752: ldc_w 436279811
    //   755: ixor
    //   756: ldc2_w -1839710361
    //   759: l2i
    //   760: ldc_w 638449993
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 792, 802488518 -> 6464, 1563382177 -> 748
    //   792: aload_0
    //   793: new bigname/zprestige/webhack/util/Timer
    //   796: dup
    //   797: getstatic Perryc.c : I
    //   800: iflt -> 814
    //   803: ldc2_w -990939321
    //   806: l2i
    //   807: ldc_w -817532744
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w -2061324725
    //   817: l2i
    //   818: ldc_w -1220704893
    //   821: ixor
    //   822: ldc2_w 830437774
    //   825: l2i
    //   826: ldc_w 151013460
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, 869611045 -> 6586, 1110496765 -> 814
    //   856: invokespecial <init> : ()V
    //   859: getstatic Perryc.1 : I
    //   862: ifeq -> 876
    //   865: ldc2_w -755419916
    //   868: l2i
    //   869: ldc_w 539401401
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -1778633883
    //   879: l2i
    //   880: ldc_w -633594782
    //   883: ixor
    //   884: ldc2_w 202476839
    //   887: l2i
    //   888: ldc_w 1222357816
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 920, -2052788380 -> 876, -1240099246 -> 6504
    //   920: putfield secondTimer : Lbigname/zprestige/webhack/util/Timer;
    //   923: getstatic Perryc.1 : I
    //   926: ifeq -> 940
    //   929: ldc2_w 1452701603
    //   932: l2i
    //   933: ldc_w 2088174450
    //   936: ixor
    //   937: goto -> 948
    //   940: ldc2_w -1991045613
    //   943: l2i
    //   944: ldc_w -1860619790
    //   947: ixor
    //   948: ldc2_w 2005737833
    //   951: l2i
    //   952: ldc_w -1065220426
    //   955: ixor
    //   956: ixor
    //   957: lookupswitch default -> 984, -2093406783 -> 940, -1645325554 -> 6416
    //   984: aload_0
    //   985: getstatic Perryc.1 : I
    //   988: ifeq -> 1002
    //   991: ldc2_w -1916754316
    //   994: l2i
    //   995: ldc_w -677167784
    //   998: ixor
    //   999: goto -> 1010
    //   1002: ldc2_w 1165119685
    //   1005: l2i
    //   1006: ldc_w 1570094259
    //   1009: ixor
    //   1010: ldc2_w 1245156870
    //   1013: l2i
    //   1014: ldc_w 468629146
    //   1017: ixor
    //   1018: ixor
    //   1019: lookupswitch default -> 1044, -1285506067 -> 1002, 196787120 -> 6490
    //   1044: aload_0
    //   1045: new bigname/zprestige/webhack/features/setting/Setting
    //   1048: dup
    //   1049: ldc_w 'Ꮖ㌁᎖㶤?ﵘ๵'
    //   1052: getstatic Perryc.1 : I
    //   1055: ifeq -> 1069
    //   1058: ldc2_w 2143324303
    //   1061: l2i
    //   1062: ldc_w 354124589
    //   1065: ixor
    //   1066: goto -> 1077
    //   1069: ldc2_w -490470846
    //   1072: l2i
    //   1073: ldc_w 932625739
    //   1076: ixor
    //   1077: ldc2_w -1109937349
    //   1080: l2i
    //   1081: ldc_w 86523320
    //   1084: ixor
    //   1085: ixor
    //   1086: lookupswitch default -> 6458, -769358559 -> 1069, 1840066954 -> 1112
    //   1112: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1115: ldc2_w -799532790
    //   1118: l2i
    //   1119: ldc_w -799532789
    //   1122: ixor
    //   1123: getstatic Perryc.c : I
    //   1126: iflt -> 1140
    //   1129: ldc2_w 1337082922
    //   1132: l2i
    //   1133: ldc_w -352657782
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -1278463317
    //   1143: l2i
    //   1144: ldc_w 1034263894
    //   1147: ixor
    //   1148: ldc2_w 2035010066
    //   1151: l2i
    //   1152: ldc_w -166068365
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 6578, 20683420 -> 1184, 706392001 -> 1140
    //   1184: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1187: getstatic Perryc.c : I
    //   1190: iflt -> 1204
    //   1193: ldc2_w 219526280
    //   1196: l2i
    //   1197: ldc_w 1942449044
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 1341417689
    //   1207: l2i
    //   1208: ldc_w 1592069066
    //   1211: ixor
    //   1212: ldc2_w 1518984435
    //   1215: l2i
    //   1216: ldc_w 670267431
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 6444, 61373384 -> 1204, 1819002823 -> 1248
    //   1248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w -222742262
    //   1260: l2i
    //   1261: ldc_w -1767016641
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 558236993
    //   1271: l2i
    //   1272: ldc_w -1446646620
    //   1275: ixor
    //   1276: ldc2_w -1386196027
    //   1279: l2i
    //   1280: ldc_w 1770877979
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 6460, -1594267157 -> 1268, 1282330171 -> 1312
    //   1312: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1315: getstatic Perryc.1 : I
    //   1318: ifeq -> 1332
    //   1321: ldc2_w 2020297337
    //   1324: l2i
    //   1325: ldc_w 1258563044
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w -260605776
    //   1335: l2i
    //   1336: ldc_w -798466345
    //   1339: ixor
    //   1340: ldc2_w -518527960
    //   1343: l2i
    //   1344: ldc_w 1992857797
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, -1531964560 -> 6492, -1394262066 -> 1332
    //   1376: putfield crystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1379: getstatic Perryc.1 : I
    //   1382: ifeq -> 1396
    //   1385: ldc2_w -1084396627
    //   1388: l2i
    //   1389: ldc_w 1646639211
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w -585933125
    //   1399: l2i
    //   1400: ldc_w -361449307
    //   1403: ixor
    //   1404: ldc2_w 1818922990
    //   1407: l2i
    //   1408: ldc_w 1470998350
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 6600, -423625882 -> 1396, 211865278 -> 1440
    //   1440: aload_0
    //   1441: getstatic Perryc.c : I
    //   1444: iflt -> 1458
    //   1447: ldc2_w 1750886559
    //   1450: l2i
    //   1451: ldc_w 991531235
    //   1454: ixor
    //   1455: goto -> 1466
    //   1458: ldc2_w -1415041635
    //   1461: l2i
    //   1462: ldc_w -1287460906
    //   1465: ixor
    //   1466: ldc2_w 1643099784
    //   1469: l2i
    //   1470: ldc_w -1124834213
    //   1473: ixor
    //   1474: ixor
    //   1475: lookupswitch default -> 1500, -1906431313 -> 6572, 1973059900 -> 1458
    //   1500: aload_0
    //   1501: new bigname/zprestige/webhack/features/setting/Setting
    //   1504: dup
    //   1505: ldc_w 'Ꮖ㌁᎖㶤?ﵘ๵湠蹓'
    //   1508: getstatic Perryc.0 : I
    //   1511: ifle -> 1525
    //   1514: ldc2_w -243430341
    //   1517: l2i
    //   1518: ldc_w -2043698622
    //   1521: ixor
    //   1522: goto -> 1533
    //   1525: ldc2_w 1134032507
    //   1528: l2i
    //   1529: ldc_w 1255791725
    //   1532: ixor
    //   1533: ldc2_w -38389869
    //   1536: l2i
    //   1537: ldc_w 873436984
    //   1540: ixor
    //   1541: ixor
    //   1542: lookupswitch default -> 1568, -1091858734 -> 6542, -413939469 -> 1525
    //   1568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1571: ldc_w 0.17312174
    //   1574: invokestatic floatToIntBits : (F)I
    //   1577: ldc_w 2136032979
    //   1580: ixor
    //   1581: invokestatic intBitsToFloat : (I)F
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w 2003109247
    //   1593: l2i
    //   1594: ldc_w -1519313716
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w -1454843802
    //   1604: l2i
    //   1605: ldc_w 1977684600
    //   1608: ixor
    //   1609: ldc2_w 1581298618
    //   1612: l2i
    //   1613: ldc_w 355341190
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 6562, -1748538846 -> 1644, -1720010353 -> 1601
    //   1644: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1647: ldc_w 264.80914
    //   1650: invokestatic floatToIntBits : (F)I
    //   1653: ldc_w 2118691679
    //   1656: ixor
    //   1657: invokestatic intBitsToFloat : (I)F
    //   1660: getstatic Perryc.c : I
    //   1663: iflt -> 1677
    //   1666: ldc2_w -363816906
    //   1669: l2i
    //   1670: ldc_w -744803346
    //   1673: ixor
    //   1674: goto -> 1685
    //   1677: ldc2_w 1021930328
    //   1680: l2i
    //   1681: ldc_w -501307393
    //   1684: ixor
    //   1685: ldc2_w 80039905
    //   1688: l2i
    //   1689: ldc_w -502770508
    //   1692: ixor
    //   1693: ixor
    //   1694: lookupswitch default -> 1720, -1994135529 -> 1677, -553209715 -> 6564
    //   1720: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1723: ldc_w 0.04255267
    //   1726: invokestatic floatToIntBits : (F)I
    //   1729: ldc_w 2134789045
    //   1732: ixor
    //   1733: invokestatic intBitsToFloat : (I)F
    //   1736: getstatic Perryc.1 : I
    //   1739: ifeq -> 1753
    //   1742: ldc2_w -578552675
    //   1745: l2i
    //   1746: ldc_w 1453684808
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -1695917091
    //   1756: l2i
    //   1757: ldc_w -1051288718
    //   1760: ixor
    //   1761: ldc2_w 1730263749
    //   1764: l2i
    //   1765: ldc_w 823781734
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 6438, -585181322 -> 1753, 226792204 -> 1796
    //   1796: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1799: getstatic Perryc.1 : I
    //   1802: ifeq -> 1816
    //   1805: ldc2_w -586271426
    //   1808: l2i
    //   1809: ldc_w 1640434611
    //   1812: ixor
    //   1813: goto -> 1824
    //   1816: ldc2_w 1398691058
    //   1819: l2i
    //   1820: ldc_w 926254771
    //   1823: ixor
    //   1824: ldc2_w -1314970508
    //   1827: l2i
    //   1828: ldc_w -830806967
    //   1831: ixor
    //   1832: ixor
    //   1833: lookupswitch default -> 6574, -1020461392 -> 1816, 462295676 -> 1860
    //   1860: aload_0
    //   1861: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;)Ljava/util/function/Predicate;
    //   1866: getstatic Perryc.0 : I
    //   1869: ifle -> 1883
    //   1872: ldc2_w 82419057
    //   1875: l2i
    //   1876: ldc_w -1869130220
    //   1879: ixor
    //   1880: goto -> 1891
    //   1883: ldc2_w -1202519049
    //   1886: l2i
    //   1887: ldc_w -312547836
    //   1890: ixor
    //   1891: ldc2_w -569218749
    //   1894: l2i
    //   1895: ldc_w -575750710
    //   1898: ixor
    //   1899: ixor
    //   1900: lookupswitch default -> 6592, -1748885524 -> 1883, 1454453114 -> 1928
    //   1928: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1931: getstatic Perryc.1 : I
    //   1934: ifeq -> 1948
    //   1937: ldc2_w -1336991913
    //   1940: l2i
    //   1941: ldc_w -506135177
    //   1944: ixor
    //   1945: goto -> 1956
    //   1948: ldc2_w -454495069
    //   1951: l2i
    //   1952: ldc_w -1186765955
    //   1955: ixor
    //   1956: ldc2_w -2124197668
    //   1959: l2i
    //   1960: ldc_w -1427049760
    //   1963: ixor
    //   1964: ixor
    //   1965: lookupswitch default -> 6462, 1983395298 -> 1992, 2047361052 -> 1948
    //   1992: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1995: getstatic Perryc.c : I
    //   1998: iflt -> 2012
    //   2001: ldc2_w -1388284855
    //   2004: l2i
    //   2005: ldc_w -374226059
    //   2008: ixor
    //   2009: goto -> 2020
    //   2012: ldc2_w 1445151997
    //   2015: l2i
    //   2016: ldc_w -2110980847
    //   2019: ixor
    //   2020: ldc2_w -878778447
    //   2023: l2i
    //   2024: ldc_w 675558519
    //   2027: ixor
    //   2028: ixor
    //   2029: lookupswitch default -> 6424, -1490328326 -> 2012, 936733226 -> 2056
    //   2056: putfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2059: getstatic Perryc.c : I
    //   2062: iflt -> 2076
    //   2065: ldc2_w 337566004
    //   2068: l2i
    //   2069: ldc_w -1202645107
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w -2071023766
    //   2079: l2i
    //   2080: ldc_w -555761877
    //   2083: ixor
    //   2084: ldc2_w -1530160178
    //   2087: l2i
    //   2088: ldc_w -1387282734
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -1513362523 -> 6502, -788413470 -> 2076
    //   2120: aload_0
    //   2121: getstatic Perryc.1 : I
    //   2124: ifeq -> 2138
    //   2127: ldc2_w 1432750358
    //   2130: l2i
    //   2131: ldc_w 1104712069
    //   2134: ixor
    //   2135: goto -> 2146
    //   2138: ldc2_w -1170845970
    //   2141: l2i
    //   2142: ldc_w -597423656
    //   2145: ixor
    //   2146: ldc2_w 1093835903
    //   2149: l2i
    //   2150: ldc_w -1913403308
    //   2153: ixor
    //   2154: ixor
    //   2155: lookupswitch default -> 2180, -662713160 -> 6434, 999013474 -> 2138
    //   2180: aload_0
    //   2181: new bigname/zprestige/webhack/features/setting/Setting
    //   2184: dup
    //   2185: ldc_w 'Ꮖ㌁᎖㶤?ﵘ๵湠蹬莰ꬻਏ?'
    //   2188: getstatic Perryc.0 : I
    //   2191: ifle -> 2205
    //   2194: ldc2_w 1957560782
    //   2197: l2i
    //   2198: ldc_w -50251558
    //   2201: ixor
    //   2202: goto -> 2213
    //   2205: ldc2_w 694902330
    //   2208: l2i
    //   2209: ldc_w 995419834
    //   2212: ixor
    //   2213: ldc2_w 1235086715
    //   2216: l2i
    //   2217: ldc_w -497035445
    //   2220: ixor
    //   2221: ixor
    //   2222: lookupswitch default -> 2248, 213913000 -> 2205, 577569572 -> 6588
    //   2248: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2251: ldc_w 0.8470275
    //   2254: invokestatic floatToIntBits : (F)I
    //   2257: ldc_w 2121848523
    //   2260: ixor
    //   2261: invokestatic intBitsToFloat : (I)F
    //   2264: getstatic Perryc.0 : I
    //   2267: ifle -> 2281
    //   2270: ldc2_w -1123783602
    //   2273: l2i
    //   2274: ldc_w -1432886785
    //   2277: ixor
    //   2278: goto -> 2289
    //   2281: ldc2_w -530199329
    //   2284: l2i
    //   2285: ldc_w 1793674504
    //   2288: ixor
    //   2289: ldc2_w -1703054684
    //   2292: l2i
    //   2293: ldc_w -2078043674
    //   2296: ixor
    //   2297: ixor
    //   2298: lookupswitch default -> 6484, -1798151531 -> 2324, 164458227 -> 2281
    //   2324: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2327: ldc_w 102.4782
    //   2330: invokestatic floatToIntBits : (F)I
    //   2333: ldc_w 2130720794
    //   2336: ixor
    //   2337: invokestatic intBitsToFloat : (I)F
    //   2340: getstatic Perryc.1 : I
    //   2343: ifeq -> 2357
    //   2346: ldc2_w 1688348566
    //   2349: l2i
    //   2350: ldc_w -1878361465
    //   2353: ixor
    //   2354: goto -> 2365
    //   2357: ldc2_w 409958099
    //   2360: l2i
    //   2361: ldc_w -1600511913
    //   2364: ixor
    //   2365: ldc2_w -860013167
    //   2368: l2i
    //   2369: ldc_w -1434518188
    //   2372: ixor
    //   2373: ixor
    //   2374: lookupswitch default -> 2400, -1838441004 -> 6530, -1278964547 -> 2357
    //   2400: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2403: ldc_w 0.012172363
    //   2406: invokestatic floatToIntBits : (F)I
    //   2409: ldc_w 2119659159
    //   2412: ixor
    //   2413: invokestatic intBitsToFloat : (I)F
    //   2416: getstatic Perryc.0 : I
    //   2419: ifle -> 2433
    //   2422: ldc2_w -1921855056
    //   2425: l2i
    //   2426: ldc_w 1377736416
    //   2429: ixor
    //   2430: goto -> 2441
    //   2433: ldc2_w 1614601666
    //   2436: l2i
    //   2437: ldc_w -1203333650
    //   2440: ixor
    //   2441: ldc2_w 584687219
    //   2444: l2i
    //   2445: ldc_w 954359231
    //   2448: ixor
    //   2449: ixor
    //   2450: lookupswitch default -> 2476, -1187508072 -> 2433, -984120164 -> 6538
    //   2476: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2479: getstatic Perryc.0 : I
    //   2482: ifle -> 2496
    //   2485: ldc2_w 1206224513
    //   2488: l2i
    //   2489: ldc_w -135956513
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w -690162122
    //   2499: l2i
    //   2500: ldc_w 1802438372
    //   2503: ixor
    //   2504: ldc2_w 660170857
    //   2507: l2i
    //   2508: ldc_w 533038350
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 6508, -2060509771 -> 2540, -2003035079 -> 2496
    //   2540: aload_0
    //   2541: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;)Ljava/util/function/Predicate;
    //   2546: getstatic Perryc.0 : I
    //   2549: ifle -> 2563
    //   2552: ldc2_w -716523532
    //   2555: l2i
    //   2556: ldc_w 993298535
    //   2559: ixor
    //   2560: goto -> 2571
    //   2563: ldc2_w -281165745
    //   2566: l2i
    //   2567: ldc_w 1966520345
    //   2570: ixor
    //   2571: ldc2_w -1597379278
    //   2574: l2i
    //   2575: ldc_w 1472475055
    //   2578: ixor
    //   2579: ixor
    //   2580: lookupswitch default -> 6500, 427031822 -> 2563, 1829157579 -> 2608
    //   2608: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2611: getstatic Perryc.0 : I
    //   2614: ifle -> 2628
    //   2617: ldc2_w -781521358
    //   2620: l2i
    //   2621: ldc_w 2147339412
    //   2624: ixor
    //   2625: goto -> 2636
    //   2628: ldc2_w 1289776941
    //   2631: l2i
    //   2632: ldc_w -86473571
    //   2635: ixor
    //   2636: ldc2_w -160529638
    //   2639: l2i
    //   2640: ldc_w 481145899
    //   2643: ixor
    //   2644: ixor
    //   2645: lookupswitch default -> 2672, 548972656 -> 2628, 1146361239 -> 6442
    //   2672: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2675: getstatic Perryc.c : I
    //   2678: iflt -> 2692
    //   2681: ldc2_w 1794807133
    //   2684: l2i
    //   2685: ldc_w -2035384523
    //   2688: ixor
    //   2689: goto -> 2700
    //   2692: ldc2_w -542032219
    //   2695: l2i
    //   2696: ldc_w 2034433987
    //   2699: ixor
    //   2700: ldc2_w 471667636
    //   2703: l2i
    //   2704: ldc_w -705183791
    //   2707: ixor
    //   2708: ixor
    //   2709: lookupswitch default -> 6450, 633226765 -> 2692, 1863937283 -> 2736
    //   2736: putfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2739: getstatic Perryc.0 : I
    //   2742: ifle -> 2756
    //   2745: ldc2_w 208252893
    //   2748: l2i
    //   2749: ldc_w -1505022887
    //   2752: ixor
    //   2753: goto -> 2764
    //   2756: ldc2_w 681006659
    //   2759: l2i
    //   2760: ldc_w 1420198734
    //   2763: ixor
    //   2764: ldc2_w -2067842799
    //   2767: l2i
    //   2768: ldc_w -745833056
    //   2771: ixor
    //   2772: ixor
    //   2773: lookupswitch default -> 6518, -48838859 -> 2756, 721785276 -> 2800
    //   2800: aload_0
    //   2801: getstatic Perryc.c : I
    //   2804: iflt -> 2818
    //   2807: ldc2_w 2000530245
    //   2810: l2i
    //   2811: ldc_w -1069337748
    //   2814: ixor
    //   2815: goto -> 2826
    //   2818: ldc2_w -1301571314
    //   2821: l2i
    //   2822: ldc_w -538991959
    //   2825: ixor
    //   2826: ldc2_w 1876172086
    //   2829: l2i
    //   2830: ldc_w -1839740077
    //   2833: ixor
    //   2834: ixor
    //   2835: lookupswitch default -> 2860, -1016005250 -> 2818, 1258114636 -> 6532
    //   2860: aload_0
    //   2861: new bigname/zprestige/webhack/features/setting/Setting
    //   2864: dup
    //   2865: ldc_w 'Ꮒ㌒᎟㶧?ﵜ'
    //   2868: getstatic Perryc.1 : I
    //   2871: ifeq -> 2885
    //   2874: ldc2_w 1645443070
    //   2877: l2i
    //   2878: ldc_w -1699814605
    //   2881: ixor
    //   2882: goto -> 2893
    //   2885: ldc2_w -1194751225
    //   2888: l2i
    //   2889: ldc_w -558908552
    //   2892: ixor
    //   2893: ldc2_w 1792394041
    //   2896: l2i
    //   2897: ldc_w 883713616
    //   2900: ixor
    //   2901: ixor
    //   2902: lookupswitch default -> 2928, -1861921927 -> 2885, -1497091676 -> 6498
    //   2928: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2931: ldc2_w 2135271821
    //   2934: l2i
    //   2935: ldc_w 2135271820
    //   2938: ixor
    //   2939: getstatic Perryc.0 : I
    //   2942: ifle -> 2956
    //   2945: ldc2_w 519968753
    //   2948: l2i
    //   2949: ldc_w -856435008
    //   2952: ixor
    //   2953: goto -> 2964
    //   2956: ldc2_w 91426065
    //   2959: l2i
    //   2960: ldc_w -1245941622
    //   2963: ixor
    //   2964: ldc2_w 459056329
    //   2967: l2i
    //   2968: ldc_w -931379001
    //   2971: ixor
    //   2972: ixor
    //   2973: lookupswitch default -> 3000, 19737919 -> 6496, 1720072141 -> 2956
    //   3000: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3003: getstatic Perryc.1 : I
    //   3006: ifeq -> 3020
    //   3009: ldc2_w -130757641
    //   3012: l2i
    //   3013: ldc_w 612815465
    //   3016: ixor
    //   3017: goto -> 3028
    //   3020: ldc2_w 1592040363
    //   3023: l2i
    //   3024: ldc_w -826941602
    //   3027: ixor
    //   3028: ldc2_w 1531309587
    //   3031: l2i
    //   3032: ldc_w 1372361321
    //   3035: ixor
    //   3036: ixor
    //   3037: lookupswitch default -> 3064, -700750364 -> 6566, 280727858 -> 3020
    //   3064: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3067: getstatic Perryc.c : I
    //   3070: iflt -> 3084
    //   3073: ldc2_w -1469032996
    //   3076: l2i
    //   3077: ldc_w -1632289701
    //   3080: ixor
    //   3081: goto -> 3092
    //   3084: ldc2_w 1596333076
    //   3087: l2i
    //   3088: ldc_w 1407216213
    //   3091: ixor
    //   3092: ldc2_w -1064540219
    //   3095: l2i
    //   3096: ldc_w -353198752
    //   3099: ixor
    //   3100: ixor
    //   3101: lookupswitch default -> 3128, -763842592 -> 3084, 482054946 -> 6554
    //   3128: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3131: getstatic Perryc.c : I
    //   3134: iflt -> 3148
    //   3137: ldc2_w 788660534
    //   3140: l2i
    //   3141: ldc_w -731099172
    //   3144: ixor
    //   3145: goto -> 3156
    //   3148: ldc2_w 742786793
    //   3151: l2i
    //   3152: ldc_w 893258788
    //   3155: ixor
    //   3156: ldc2_w -643450635
    //   3159: l2i
    //   3160: ldc_w 340266225
    //   3163: ixor
    //   3164: ixor
    //   3165: lookupswitch default -> 6470, -728383799 -> 3192, 914619118 -> 3148
    //   3192: putfield gapple : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3195: getstatic Perryc.1 : I
    //   3198: ifeq -> 3212
    //   3201: ldc2_w -383604406
    //   3204: l2i
    //   3205: ldc_w 1075672732
    //   3208: ixor
    //   3209: goto -> 3220
    //   3212: ldc2_w -508275015
    //   3215: l2i
    //   3216: ldc_w 1799401798
    //   3219: ixor
    //   3220: ldc2_w -1287927655
    //   3223: l2i
    //   3224: ldc_w 1243239078
    //   3227: ixor
    //   3228: ixor
    //   3229: lookupswitch default -> 3256, 1344161257 -> 6506, 1809819503 -> 3212
    //   3256: aload_0
    //   3257: getstatic Perryc.1 : I
    //   3260: ifeq -> 3274
    //   3263: ldc2_w -212547163
    //   3266: l2i
    //   3267: ldc_w 1192568638
    //   3270: ixor
    //   3271: goto -> 3282
    //   3274: ldc2_w 1263248041
    //   3277: l2i
    //   3278: ldc_w 83332523
    //   3281: ixor
    //   3282: ldc2_w -1507629027
    //   3285: l2i
    //   3286: ldc_w 994438701
    //   3289: ixor
    //   3290: ixor
    //   3291: lookupswitch default -> 3316, -905261583 -> 3274, 690448555 -> 6560
    //   3316: aload_0
    //   3317: new bigname/zprestige/webhack/features/setting/Setting
    //   3320: dup
    //   3321: ldc_w 'Ꮔ㌁ᎂ㶸?ﵺ๱湍蹠获'
    //   3324: getstatic Perryc.1 : I
    //   3327: ifeq -> 3341
    //   3330: ldc2_w -1807803046
    //   3333: l2i
    //   3334: ldc_w -741114164
    //   3337: ixor
    //   3338: goto -> 3349
    //   3341: ldc2_w -155263975
    //   3344: l2i
    //   3345: ldc_w 1144009804
    //   3348: ixor
    //   3349: ldc2_w -1793988518
    //   3352: l2i
    //   3353: ldc_w 1586146411
    //   3356: ixor
    //   3357: ixor
    //   3358: lookupswitch default -> 3384, -1938348121 -> 6582, 2139693283 -> 3341
    //   3384: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3387: ldc2_w 612950592
    //   3390: l2i
    //   3391: ldc_w 612950593
    //   3394: ixor
    //   3395: getstatic Perryc.c : I
    //   3398: iflt -> 3412
    //   3401: ldc2_w 802241439
    //   3404: l2i
    //   3405: ldc_w 346246901
    //   3408: ixor
    //   3409: goto -> 3420
    //   3412: ldc2_w -961415253
    //   3415: l2i
    //   3416: ldc_w 1061047286
    //   3419: ixor
    //   3420: ldc2_w 936969093
    //   3423: l2i
    //   3424: ldc_w -736113072
    //   3427: ixor
    //   3428: ixor
    //   3429: lookupswitch default -> 6590, -659244865 -> 3412, 441020808 -> 3456
    //   3456: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3459: getstatic Perryc.1 : I
    //   3462: ifeq -> 3476
    //   3465: ldc2_w -855224676
    //   3468: l2i
    //   3469: ldc_w -1424767037
    //   3472: ixor
    //   3473: goto -> 3484
    //   3476: ldc2_w 516579065
    //   3479: l2i
    //   3480: ldc_w -559783740
    //   3483: ixor
    //   3484: ldc2_w 935692375
    //   3487: l2i
    //   3488: ldc_w 1603157760
    //   3491: ixor
    //   3492: ixor
    //   3493: lookupswitch default -> 6412, -1474066070 -> 3520, 241057288 -> 3476
    //   3520: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3523: getstatic Perryc.1 : I
    //   3526: ifeq -> 3540
    //   3529: ldc2_w 215337389
    //   3532: l2i
    //   3533: ldc_w 1984220167
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w -1863377278
    //   3543: l2i
    //   3544: ldc_w -723149686
    //   3547: ixor
    //   3548: ldc2_w 1659236770
    //   3551: l2i
    //   3552: ldc_w -1764388922
    //   3555: ixor
    //   3556: ixor
    //   3557: lookupswitch default -> 6570, -1902019634 -> 3540, -1338311572 -> 3584
    //   3584: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3587: getstatic Perryc.0 : I
    //   3590: ifle -> 3604
    //   3593: ldc2_w 2024492820
    //   3596: l2i
    //   3597: ldc_w 687771199
    //   3600: ixor
    //   3601: goto -> 3612
    //   3604: ldc2_w 1945079420
    //   3607: l2i
    //   3608: ldc_w 503281093
    //   3611: ixor
    //   3612: ldc2_w -186255513
    //   3615: l2i
    //   3616: ldc_w -445367911
    //   3619: ixor
    //   3620: ixor
    //   3621: lookupswitch default -> 3648, -502965372 -> 3604, 1103368149 -> 6478
    //   3648: putfield armorCheck : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3651: getstatic Perryc.c : I
    //   3654: iflt -> 3668
    //   3657: ldc2_w -1370354769
    //   3660: l2i
    //   3661: ldc_w -968734703
    //   3664: ixor
    //   3665: goto -> 3676
    //   3668: ldc2_w 126057845
    //   3671: l2i
    //   3672: ldc_w 1620254901
    //   3675: ixor
    //   3676: ldc2_w -1204992595
    //   3679: l2i
    //   3680: ldc_w 836345017
    //   3683: ixor
    //   3684: ixor
    //   3685: lookupswitch default -> 6432, -505111894 -> 3668, -287013676 -> 3712
    //   3712: aload_0
    //   3713: getstatic Perryc.0 : I
    //   3716: ifle -> 3730
    //   3719: ldc2_w -886817045
    //   3722: l2i
    //   3723: ldc_w -2036863537
    //   3726: ixor
    //   3727: goto -> 3738
    //   3730: ldc2_w 688388054
    //   3733: l2i
    //   3734: ldc_w 1383809447
    //   3737: ixor
    //   3738: ldc2_w 1874548909
    //   3741: l2i
    //   3742: ldc_w 1133776812
    //   3745: ixor
    //   3746: ixor
    //   3747: lookupswitch default -> 3772, 452412313 -> 3730, 1637647397 -> 6452
    //   3772: aload_0
    //   3773: new bigname/zprestige/webhack/features/setting/Setting
    //   3776: dup
    //   3777: ldc_w 'Ꮥ㌒ᎌ㶼?﵍๪'
    //   3780: getstatic Perryc.1 : I
    //   3783: ifeq -> 3797
    //   3786: ldc2_w 1592201906
    //   3789: l2i
    //   3790: ldc_w -1913998526
    //   3793: ixor
    //   3794: goto -> 3805
    //   3797: ldc2_w -1448835914
    //   3800: l2i
    //   3801: ldc_w -1992271339
    //   3804: ixor
    //   3805: ldc2_w -394501705
    //   3808: l2i
    //   3809: ldc_w 1250258969
    //   3812: ixor
    //   3813: ixor
    //   3814: lookupswitch default -> 3840, -86278718 -> 3797, 1911861342 -> 6602
    //   3840: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3843: ldc2_w -1035744368
    //   3846: l2i
    //   3847: ldc_w -1035744364
    //   3850: ixor
    //   3851: getstatic Perryc.0 : I
    //   3854: ifle -> 3868
    //   3857: ldc2_w 21189918
    //   3860: l2i
    //   3861: ldc_w -510980255
    //   3864: ixor
    //   3865: goto -> 3876
    //   3868: ldc2_w -280530047
    //   3871: l2i
    //   3872: ldc_w -1612629793
    //   3875: ixor
    //   3876: ldc2_w -583214453
    //   3879: l2i
    //   3880: ldc_w -223241748
    //   3883: ixor
    //   3884: ixor
    //   3885: lookupswitch default -> 3912, -817555176 -> 6512, 889941743 -> 3868
    //   3912: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3915: ldc2_w -584664866
    //   3918: l2i
    //   3919: ldc_w -584664865
    //   3922: ixor
    //   3923: getstatic Perryc.c : I
    //   3926: iflt -> 3940
    //   3929: ldc2_w 672941999
    //   3932: l2i
    //   3933: ldc_w 1935675928
    //   3936: ixor
    //   3937: goto -> 3948
    //   3940: ldc2_w -293753709
    //   3943: l2i
    //   3944: ldc_w -1428880980
    //   3947: ixor
    //   3948: ldc2_w -396924675
    //   3951: l2i
    //   3952: ldc_w -1422063552
    //   3955: ixor
    //   3956: ixor
    //   3957: lookupswitch default -> 6544, 130207106 -> 3984, 404108554 -> 3940
    //   3984: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3987: ldc2_w 1674226543
    //   3990: l2i
    //   3991: ldc_w 1674226539
    //   3994: ixor
    //   3995: getstatic Perryc.0 : I
    //   3998: ifle -> 4012
    //   4001: ldc2_w -138631821
    //   4004: l2i
    //   4005: ldc_w 142582307
    //   4008: ixor
    //   4009: goto -> 4020
    //   4012: ldc2_w -638170678
    //   4015: l2i
    //   4016: ldc_w 936106363
    //   4019: ixor
    //   4020: ldc2_w 1664549983
    //   4023: l2i
    //   4024: ldc_w -890073442
    //   4027: ixor
    //   4028: ixor
    //   4029: lookupswitch default -> 4056, 1443270033 -> 6550, 1688405704 -> 4012
    //   4056: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4059: getstatic Perryc.0 : I
    //   4062: ifle -> 4076
    //   4065: ldc2_w 907864400
    //   4068: l2i
    //   4069: ldc_w -1098776425
    //   4072: ixor
    //   4073: goto -> 4084
    //   4076: ldc2_w 1809399828
    //   4079: l2i
    //   4080: ldc_w -1963073152
    //   4083: ixor
    //   4084: ldc2_w 400747122
    //   4087: l2i
    //   4088: ldc_w -2135107450
    //   4091: ixor
    //   4092: ixor
    //   4093: lookupswitch default -> 4120, -724717936 -> 4076, 532732723 -> 6534
    //   4120: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4123: getstatic Perryc.c : I
    //   4126: iflt -> 4140
    //   4129: ldc2_w -111901305
    //   4132: l2i
    //   4133: ldc_w 2140381698
    //   4136: ixor
    //   4137: goto -> 4148
    //   4140: ldc2_w -133764943
    //   4143: l2i
    //   4144: ldc_w -81112764
    //   4147: ixor
    //   4148: ldc2_w -933884564
    //   4151: l2i
    //   4152: ldc_w 826110664
    //   4155: ixor
    //   4156: ixor
    //   4157: lookupswitch default -> 6428, -95959471 -> 4184, 2142001185 -> 4140
    //   4184: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4187: getstatic Perryc.1 : I
    //   4190: ifeq -> 4204
    //   4193: ldc2_w 487343939
    //   4196: l2i
    //   4197: ldc_w -1356892186
    //   4200: ixor
    //   4201: goto -> 4212
    //   4204: ldc2_w -573402192
    //   4207: l2i
    //   4208: ldc_w 1937545449
    //   4211: ixor
    //   4212: ldc2_w -867387271
    //   4215: l2i
    //   4216: ldc_w -609928951
    //   4219: ixor
    //   4220: ixor
    //   4221: lookupswitch default -> 6494, -1510297131 -> 4204, -1186493911 -> 4248
    //   4248: putfield actions : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4251: getstatic Perryc.1 : I
    //   4254: ifeq -> 4268
    //   4257: ldc2_w 577022570
    //   4260: l2i
    //   4261: ldc_w -612632707
    //   4264: ixor
    //   4265: goto -> 4276
    //   4268: ldc2_w -1616471378
    //   4271: l2i
    //   4272: ldc_w 836466066
    //   4275: ixor
    //   4276: ldc2_w -386068232
    //   4279: l2i
    //   4280: ldc_w -1984344146
    //   4283: ixor
    //   4284: ixor
    //   4285: lookupswitch default -> 6430, -1738866111 -> 4268, -818302870 -> 4312
    //   4312: aload_0
    //   4313: getstatic Perryc.c : I
    //   4316: iflt -> 4330
    //   4319: ldc2_w 997193364
    //   4322: l2i
    //   4323: ldc_w -913883837
    //   4326: ixor
    //   4327: goto -> 4338
    //   4330: ldc2_w -1671858357
    //   4333: l2i
    //   4334: ldc_w -895653917
    //   4337: ixor
    //   4338: ldc2_w -521949577
    //   4341: l2i
    //   4342: ldc_w -2104455851
    //   4345: ixor
    //   4346: ixor
    //   4347: lookupswitch default -> 6422, -1868830475 -> 4330, 884421514 -> 4372
    //   4372: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   4375: getstatic Perryc.c : I
    //   4378: iflt -> 4392
    //   4381: ldc2_w 793784418
    //   4384: l2i
    //   4385: ldc_w -561532085
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w -736211697
    //   4395: l2i
    //   4396: ldc_w 534414157
    //   4399: ixor
    //   4400: ldc2_w -1668614879
    //   4403: l2i
    //   4404: ldc_w -1610879329
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 4436, -223962985 -> 6472, 1625116477 -> 4392
    //   4436: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   4439: getstatic Perryc.0 : I
    //   4442: ifle -> 4456
    //   4445: ldc2_w -285598542
    //   4448: l2i
    //   4449: ldc_w 1279258065
    //   4452: ixor
    //   4453: goto -> 4464
    //   4456: ldc2_w -1457234663
    //   4459: l2i
    //   4460: ldc_w -221381051
    //   4463: ixor
    //   4464: ldc2_w -2014173256
    //   4467: l2i
    //   4468: ldc_w 1111159222
    //   4471: ixor
    //   4472: ixor
    //   4473: lookupswitch default -> 6540, -1641974446 -> 4500, 1728915309 -> 4456
    //   4500: aload_0
    //   4501: ldc2_w 1500759156
    //   4504: l2i
    //   4505: ldc_w 1500759156
    //   4508: ixor
    //   4509: getstatic Perryc.1 : I
    //   4512: ifeq -> 4526
    //   4515: ldc2_w 1964924092
    //   4518: l2i
    //   4519: ldc_w -1150368199
    //   4522: ixor
    //   4523: goto -> 4534
    //   4526: ldc2_w -1155431789
    //   4529: l2i
    //   4530: ldc_w -1195941130
    //   4533: ixor
    //   4534: ldc2_w 2089229524
    //   4537: l2i
    //   4538: ldc_w -100644064
    //   4541: ixor
    //   4542: ixor
    //   4543: lookupswitch default -> 4568, -2061317822 -> 4526, 1224199537 -> 6436
    //   4568: putfield totems : I
    //   4571: getstatic Perryc.1 : I
    //   4574: ifeq -> 4588
    //   4577: ldc2_w 1575705792
    //   4580: l2i
    //   4581: ldc_w -18218979
    //   4584: ixor
    //   4585: goto -> 4596
    //   4588: ldc2_w -1602562824
    //   4591: l2i
    //   4592: ldc_w -860690035
    //   4595: ixor
    //   4596: ldc2_w 684306551
    //   4599: l2i
    //   4600: ldc_w -774165702
    //   4603: ixor
    //   4604: ixor
    //   4605: lookupswitch default -> 4632, -2140287205 -> 4588, 1511245712 -> 6528
    //   4632: aload_0
    //   4633: ldc2_w -1651151740
    //   4636: l2i
    //   4637: ldc_w -1651151740
    //   4640: ixor
    //   4641: getstatic Perryc.1 : I
    //   4644: ifeq -> 4658
    //   4647: ldc2_w -727654627
    //   4650: l2i
    //   4651: ldc_w -1834214049
    //   4654: ixor
    //   4655: goto -> 4666
    //   4658: ldc2_w -1238398103
    //   4661: l2i
    //   4662: ldc_w 1256352100
    //   4665: ixor
    //   4666: ldc2_w 1673608671
    //   4669: l2i
    //   4670: ldc_w 807850972
    //   4673: ixor
    //   4674: ixor
    //   4675: lookupswitch default -> 4700, 367733825 -> 6536, 729060228 -> 4658
    //   4700: putfield crystals : I
    //   4703: getstatic Perryc.c : I
    //   4706: iflt -> 4720
    //   4709: ldc2_w 1876485451
    //   4712: l2i
    //   4713: ldc_w 153090799
    //   4716: ixor
    //   4717: goto -> 4728
    //   4720: ldc2_w 2016494464
    //   4723: l2i
    //   4724: ldc_w 1853636018
    //   4727: ixor
    //   4728: ldc2_w 180405221
    //   4731: l2i
    //   4732: ldc_w -172985192
    //   4735: ixor
    //   4736: ixor
    //   4737: lookupswitch default -> 6580, -1716016935 -> 4720, -381826737 -> 4764
    //   4764: aload_0
    //   4765: ldc2_w -1362207630
    //   4768: l2i
    //   4769: ldc_w -1362207630
    //   4772: ixor
    //   4773: getstatic Perryc.0 : I
    //   4776: ifle -> 4790
    //   4779: ldc2_w 1686583973
    //   4782: l2i
    //   4783: ldc_w 650346703
    //   4786: ixor
    //   4787: goto -> 4798
    //   4790: ldc2_w -235171298
    //   4793: l2i
    //   4794: ldc_w -1984966320
    //   4797: ixor
    //   4798: ldc2_w -1797700791
    //   4801: l2i
    //   4802: ldc_w -197610383
    //   4805: ixor
    //   4806: ixor
    //   4807: lookupswitch default -> 4832, 170337950 -> 4790, 581258578 -> 6446
    //   4832: putfield gapples : I
    //   4835: getstatic Perryc.c : I
    //   4838: iflt -> 4852
    //   4841: ldc2_w 1842684753
    //   4844: l2i
    //   4845: ldc_w 1214448199
    //   4848: ixor
    //   4849: goto -> 4860
    //   4852: ldc2_w 493690105
    //   4855: l2i
    //   4856: ldc_w -669955770
    //   4859: ixor
    //   4860: ldc2_w -2134605834
    //   4863: l2i
    //   4864: ldc_w -1924120173
    //   4867: ixor
    //   4868: ixor
    //   4869: lookupswitch default -> 6558, -924292134 -> 4896, 673324915 -> 4852
    //   4896: aload_0
    //   4897: ldc2_w -314440618
    //   4900: l2i
    //   4901: ldc_w 314440617
    //   4904: ixor
    //   4905: getstatic Perryc.0 : I
    //   4908: ifle -> 4922
    //   4911: ldc2_w 510717243
    //   4914: l2i
    //   4915: ldc_w 917846991
    //   4918: ixor
    //   4919: goto -> 4930
    //   4922: ldc2_w -1757531300
    //   4925: l2i
    //   4926: ldc_w -1996616449
    //   4929: ixor
    //   4930: ldc2_w 564320606
    //   4933: l2i
    //   4934: ldc_w -1309059618
    //   4937: ixor
    //   4938: ixor
    //   4939: lookupswitch default -> 4964, -1246019893 -> 4922, -1197581708 -> 6552
    //   4964: putfield lastTotemSlot : I
    //   4967: getstatic Perryc.0 : I
    //   4970: ifle -> 4984
    //   4973: ldc2_w -1103556996
    //   4976: l2i
    //   4977: ldc_w 1275105150
    //   4980: ixor
    //   4981: goto -> 4992
    //   4984: ldc2_w -349435138
    //   4987: l2i
    //   4988: ldc_w -1055449994
    //   4991: ixor
    //   4992: ldc2_w -1661047108
    //   4995: l2i
    //   4996: ldc_w 528917072
    //   4999: ixor
    //   5000: ixor
    //   5001: lookupswitch default -> 6522, -1455170972 -> 5028, 1900105198 -> 4984
    //   5028: aload_0
    //   5029: ldc2_w 298843817
    //   5032: l2i
    //   5033: ldc_w -298843818
    //   5036: ixor
    //   5037: getstatic Perryc.1 : I
    //   5040: ifeq -> 5054
    //   5043: ldc2_w 1710100367
    //   5046: l2i
    //   5047: ldc_w 1561748995
    //   5050: ixor
    //   5051: goto -> 5062
    //   5054: ldc2_w -1309587277
    //   5057: l2i
    //   5058: ldc_w 1337948908
    //   5061: ixor
    //   5062: ldc2_w -286264014
    //   5065: l2i
    //   5066: ldc_w -214486180
    //   5069: ixor
    //   5070: ixor
    //   5071: lookupswitch default -> 6486, -476646351 -> 5096, 622899170 -> 5054
    //   5096: putfield lastGappleSlot : I
    //   5099: getstatic Perryc.c : I
    //   5102: iflt -> 5116
    //   5105: ldc2_w 1054914911
    //   5108: l2i
    //   5109: ldc_w 1658531215
    //   5112: ixor
    //   5113: goto -> 5124
    //   5116: ldc2_w 645051311
    //   5119: l2i
    //   5120: ldc_w 609061921
    //   5123: ixor
    //   5124: ldc2_w -1808114823
    //   5127: l2i
    //   5128: ldc_w -1631878737
    //   5131: ixor
    //   5132: ixor
    //   5133: lookupswitch default -> 6474, 146728280 -> 5160, 1455050246 -> 5116
    //   5160: aload_0
    //   5161: ldc2_w 898257356
    //   5164: l2i
    //   5165: ldc_w -898257357
    //   5168: ixor
    //   5169: getstatic Perryc.1 : I
    //   5172: ifeq -> 5186
    //   5175: ldc2_w 165508875
    //   5178: l2i
    //   5179: ldc_w -844412687
    //   5182: ixor
    //   5183: goto -> 5194
    //   5186: ldc2_w 1451163969
    //   5189: l2i
    //   5190: ldc_w -1494129458
    //   5193: ixor
    //   5194: ldc2_w -539067323
    //   5197: l2i
    //   5198: ldc_w 18888578
    //   5201: ixor
    //   5202: ixor
    //   5203: lookupswitch default -> 6426, 445150269 -> 5186, 779103816 -> 5228
    //   5228: putfield lastCrystalSlot : I
    //   5231: getstatic Perryc.0 : I
    //   5234: ifle -> 5248
    //   5237: ldc2_w 1813443236
    //   5240: l2i
    //   5241: ldc_w -1308301138
    //   5244: ixor
    //   5245: goto -> 5256
    //   5248: ldc2_w 2067590982
    //   5251: l2i
    //   5252: ldc_w -31631107
    //   5255: ixor
    //   5256: ldc2_w -454710371
    //   5259: l2i
    //   5260: ldc_w -1107801452
    //   5263: ixor
    //   5264: ixor
    //   5265: lookupswitch default -> 6596, -2028995837 -> 5248, -600025422 -> 5292
    //   5292: aload_0
    //   5293: ldc2_w 436961069
    //   5296: l2i
    //   5297: ldc_w -436961070
    //   5300: ixor
    //   5301: getstatic Perryc.1 : I
    //   5304: ifeq -> 5318
    //   5307: ldc2_w -1060510234
    //   5310: l2i
    //   5311: ldc_w 617736952
    //   5314: ixor
    //   5315: goto -> 5326
    //   5318: ldc2_w -756602084
    //   5321: l2i
    //   5322: ldc_w -344437312
    //   5325: ixor
    //   5326: ldc2_w -1133575830
    //   5329: l2i
    //   5330: ldc_w -835999836
    //   5333: ixor
    //   5334: ixor
    //   5335: lookupswitch default -> 5360, -1772312112 -> 6548, 301284754 -> 5318
    //   5360: putfield lastObbySlot : I
    //   5363: getstatic Perryc.c : I
    //   5366: iflt -> 5380
    //   5369: ldc2_w -1574260800
    //   5372: l2i
    //   5373: ldc_w 843127801
    //   5376: ixor
    //   5377: goto -> 5388
    //   5380: ldc2_w -581506932
    //   5383: l2i
    //   5384: ldc_w 1233557305
    //   5387: ixor
    //   5388: ldc2_w -810256854
    //   5391: l2i
    //   5392: ldc_w -1849472454
    //   5395: ixor
    //   5396: ixor
    //   5397: lookupswitch default -> 5424, -836990935 -> 6516, -698654327 -> 5380
    //   5424: aload_0
    //   5425: ldc2_w 1008876899
    //   5428: l2i
    //   5429: ldc_w -1008876900
    //   5432: ixor
    //   5433: getstatic Perryc.c : I
    //   5436: iflt -> 5450
    //   5439: ldc2_w -1786233182
    //   5442: l2i
    //   5443: ldc_w -1746049060
    //   5446: ixor
    //   5447: goto -> 5458
    //   5450: ldc2_w 618565812
    //   5453: l2i
    //   5454: ldc_w -1176125649
    //   5457: ixor
    //   5458: ldc2_w 447984868
    //   5461: l2i
    //   5462: ldc_w 619288832
    //   5465: ixor
    //   5466: ixor
    //   5467: lookupswitch default -> 6448, -1553923457 -> 5492, 1010791578 -> 5450
    //   5492: putfield lastWebSlot : I
    //   5495: getstatic Perryc.0 : I
    //   5498: ifle -> 5512
    //   5501: ldc2_w 69917976
    //   5504: l2i
    //   5505: ldc_w 93849183
    //   5508: ixor
    //   5509: goto -> 5520
    //   5512: ldc2_w -205001335
    //   5515: l2i
    //   5516: ldc_w 1360080943
    //   5519: ixor
    //   5520: ldc2_w 1228529277
    //   5523: l2i
    //   5524: ldc_w 1711085830
    //   5527: ixor
    //   5528: ixor
    //   5529: lookupswitch default -> 5556, 63982721 -> 5512, 762715196 -> 6598
    //   5556: aload_0
    //   5557: ldc2_w 699500338
    //   5560: l2i
    //   5561: ldc_w 699500338
    //   5564: ixor
    //   5565: getstatic Perryc.1 : I
    //   5568: ifeq -> 5582
    //   5571: ldc2_w -63487764
    //   5574: l2i
    //   5575: ldc_w -1808425340
    //   5578: ixor
    //   5579: goto -> 5590
    //   5582: ldc2_w -1121315100
    //   5585: l2i
    //   5586: ldc_w 1644820766
    //   5589: ixor
    //   5590: ldc2_w 804740979
    //   5593: l2i
    //   5594: ldc_w 822209116
    //   5597: ixor
    //   5598: ixor
    //   5599: lookupswitch default -> 5624, -534583784 -> 5582, 1995729735 -> 6546
    //   5624: putfield holdingCrystal : Z
    //   5627: getstatic Perryc.c : I
    //   5630: iflt -> 5644
    //   5633: ldc2_w 484970172
    //   5636: l2i
    //   5637: ldc_w 585126682
    //   5640: ixor
    //   5641: goto -> 5652
    //   5644: ldc2_w -43543740
    //   5647: l2i
    //   5648: ldc_w -261904613
    //   5651: ixor
    //   5652: ldc2_w 645744293
    //   5655: l2i
    //   5656: ldc_w 1542510812
    //   5659: ixor
    //   5660: ixor
    //   5661: lookupswitch default -> 5688, -1198871272 -> 5644, 1132839903 -> 6556
    //   5688: aload_0
    //   5689: ldc2_w -186552340
    //   5692: l2i
    //   5693: ldc_w -186552340
    //   5696: ixor
    //   5697: getstatic Perryc.c : I
    //   5700: iflt -> 5714
    //   5703: ldc2_w -843382488
    //   5706: l2i
    //   5707: ldc_w -2021654426
    //   5710: ixor
    //   5711: goto -> 5722
    //   5714: ldc2_w 1871585656
    //   5717: l2i
    //   5718: ldc_w 677554059
    //   5721: ixor
    //   5722: ldc2_w 1326302086
    //   5725: l2i
    //   5726: ldc_w 1062490028
    //   5729: ixor
    //   5730: ixor
    //   5731: lookupswitch default -> 6576, 934611673 -> 5756, 979537252 -> 5714
    //   5756: putfield holdingTotem : Z
    //   5759: getstatic Perryc.c : I
    //   5762: iflt -> 5776
    //   5765: ldc2_w -1594560497
    //   5768: l2i
    //   5769: ldc_w 1914556761
    //   5772: ixor
    //   5773: goto -> 5784
    //   5776: ldc2_w -91461553
    //   5779: l2i
    //   5780: ldc_w 1346704423
    //   5783: ixor
    //   5784: ldc2_w -1749148547
    //   5787: l2i
    //   5788: ldc_w -1977164836
    //   5791: ixor
    //   5792: ixor
    //   5793: lookupswitch default -> 6514, -1219380279 -> 5820, -814618889 -> 5776
    //   5820: aload_0
    //   5821: ldc2_w -1359419403
    //   5824: l2i
    //   5825: ldc_w -1359419403
    //   5828: ixor
    //   5829: getstatic Perryc.c : I
    //   5832: iflt -> 5846
    //   5835: ldc2_w 545511944
    //   5838: l2i
    //   5839: ldc_w 1631568716
    //   5842: ixor
    //   5843: goto -> 5854
    //   5846: ldc2_w 1606843268
    //   5849: l2i
    //   5850: ldc_w -1635965720
    //   5853: ixor
    //   5854: ldc2_w 1796742222
    //   5857: l2i
    //   5858: ldc_w 124969517
    //   5861: ixor
    //   5862: ixor
    //   5863: lookupswitch default -> 6584, -1378770673 -> 5888, 769058599 -> 5846
    //   5888: putfield holdingGapple : Z
    //   5891: getstatic Perryc.c : I
    //   5894: iflt -> 5908
    //   5897: ldc2_w 1651639166
    //   5900: l2i
    //   5901: ldc_w 781492427
    //   5904: ixor
    //   5905: goto -> 5916
    //   5908: ldc2_w -91329605
    //   5911: l2i
    //   5912: ldc_w 1830220779
    //   5915: ixor
    //   5916: ldc2_w -1565489693
    //   5919: l2i
    //   5920: ldc_w 1428653596
    //   5923: ixor
    //   5924: ixor
    //   5925: lookupswitch default -> 6524, -1150181302 -> 5908, 1611635631 -> 5952
    //   5952: aload_0
    //   5953: ldc2_w -526993166
    //   5956: l2i
    //   5957: ldc_w -526993166
    //   5960: ixor
    //   5961: getstatic Perryc.0 : I
    //   5964: ifle -> 5978
    //   5967: ldc2_w -503747983
    //   5970: l2i
    //   5971: ldc_w 1022380313
    //   5974: ixor
    //   5975: goto -> 5986
    //   5978: ldc2_w -1366347325
    //   5981: l2i
    //   5982: ldc_w -153217845
    //   5985: ixor
    //   5986: ldc2_w -1134589981
    //   5989: l2i
    //   5990: ldc_w 661594664
    //   5993: ixor
    //   5994: ixor
    //   5995: lookupswitch default -> 6414, -1017020221 -> 6020, 1178175139 -> 5978
    //   6020: putfield didSwitchThisTick : Z
    //   6023: getstatic Perryc.0 : I
    //   6026: ifle -> 6040
    //   6029: ldc2_w 1014815939
    //   6032: l2i
    //   6033: ldc_w 391260299
    //   6036: ixor
    //   6037: goto -> 6048
    //   6040: ldc2_w 1010124662
    //   6043: l2i
    //   6044: ldc_w -1797219050
    //   6047: ixor
    //   6048: ldc2_w -793714420
    //   6051: l2i
    //   6052: ldc_w 462230197
    //   6055: ixor
    //   6056: ixor
    //   6057: lookupswitch default -> 6510, -535623695 -> 6040, 1676159449 -> 6084
    //   6084: aload_0
    //   6085: ldc2_w 773094100
    //   6088: l2i
    //   6089: ldc_w 773094100
    //   6092: ixor
    //   6093: getstatic Perryc.0 : I
    //   6096: ifle -> 6110
    //   6099: ldc2_w -1740809855
    //   6102: l2i
    //   6103: ldc_w -1710292984
    //   6106: ixor
    //   6107: goto -> 6118
    //   6110: ldc2_w 19825611
    //   6113: l2i
    //   6114: ldc_w -654826836
    //   6117: ixor
    //   6118: ldc2_w 1344351016
    //   6121: l2i
    //   6122: ldc_w -1722552138
    //   6125: ixor
    //   6126: ixor
    //   6127: lookupswitch default -> 6604, -884964841 -> 6110, 279214841 -> 6152
    //   6152: putfield second : Z
    //   6155: getstatic Perryc.c : I
    //   6158: iflt -> 6172
    //   6161: ldc2_w 536276535
    //   6164: l2i
    //   6165: ldc_w -1116936854
    //   6168: ixor
    //   6169: goto -> 6180
    //   6172: ldc2_w -1984484290
    //   6175: l2i
    //   6176: ldc_w 1702503411
    //   6179: ixor
    //   6180: ldc2_w -2140642126
    //   6183: l2i
    //   6184: ldc_w -371928866
    //   6187: ixor
    //   6188: ixor
    //   6189: lookupswitch default -> 6216, -886653135 -> 6520, 1475729049 -> 6172
    //   6216: aload_0
    //   6217: ldc2_w -1690732217
    //   6220: l2i
    //   6221: ldc_w -1690732217
    //   6224: ixor
    //   6225: getstatic Perryc.c : I
    //   6228: iflt -> 6242
    //   6231: ldc2_w 1839673567
    //   6234: l2i
    //   6235: ldc_w 1264379920
    //   6238: ixor
    //   6239: goto -> 6250
    //   6242: ldc2_w -913599640
    //   6245: l2i
    //   6246: ldc_w -1947692676
    //   6249: ixor
    //   6250: ldc2_w -172905977
    //   6253: l2i
    //   6254: ldc_w 94790662
    //   6257: ixor
    //   6258: ixor
    //   6259: lookupswitch default -> 6418, -1300968427 -> 6284, -689170738 -> 6242
    //   6284: putfield switchedForHealthReason : Z
    //   6287: getstatic Perryc.0 : I
    //   6290: ifle -> 6304
    //   6293: ldc2_w -1839216545
    //   6296: l2i
    //   6297: ldc_w -923119058
    //   6300: ixor
    //   6301: goto -> 6312
    //   6304: ldc2_w -581558015
    //   6307: l2i
    //   6308: ldc_w 429778878
    //   6311: ixor
    //   6312: ldc2_w -2058206038
    //   6315: l2i
    //   6316: ldc_w 1047765492
    //   6319: ixor
    //   6320: ixor
    //   6321: lookupswitch default -> 6476, -511410385 -> 6304, 2146051041 -> 6348
    //   6348: aload_0
    //   6349: getstatic Perryc.0 : I
    //   6352: ifle -> 6366
    //   6355: ldc2_w -151228994
    //   6358: l2i
    //   6359: ldc_w -1369115778
    //   6362: ixor
    //   6363: goto -> 6374
    //   6366: ldc2_w 277403205
    //   6369: l2i
    //   6370: ldc_w 789967521
    //   6373: ixor
    //   6374: ldc2_w -859783182
    //   6377: l2i
    //   6378: ldc_w 364130840
    //   6381: ixor
    //   6382: ixor
    //   6383: lookupswitch default -> 6440, -2115235030 -> 6366, -420894450 -> 6408
    //   6408: putstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2.instance : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   6411: return
    //   6412: aconst_null
    //   6413: athrow
    //   6414: aconst_null
    //   6415: athrow
    //   6416: aconst_null
    //   6417: athrow
    //   6418: aconst_null
    //   6419: athrow
    //   6420: aconst_null
    //   6421: athrow
    //   6422: aconst_null
    //   6423: athrow
    //   6424: aconst_null
    //   6425: athrow
    //   6426: aconst_null
    //   6427: athrow
    //   6428: aconst_null
    //   6429: athrow
    //   6430: aconst_null
    //   6431: athrow
    //   6432: aconst_null
    //   6433: athrow
    //   6434: aconst_null
    //   6435: athrow
    //   6436: aconst_null
    //   6437: athrow
    //   6438: aconst_null
    //   6439: athrow
    //   6440: aconst_null
    //   6441: athrow
    //   6442: aconst_null
    //   6443: athrow
    //   6444: aconst_null
    //   6445: athrow
    //   6446: aconst_null
    //   6447: athrow
    //   6448: aconst_null
    //   6449: athrow
    //   6450: aconst_null
    //   6451: athrow
    //   6452: aconst_null
    //   6453: athrow
    //   6454: aconst_null
    //   6455: athrow
    //   6456: aconst_null
    //   6457: athrow
    //   6458: aconst_null
    //   6459: athrow
    //   6460: aconst_null
    //   6461: athrow
    //   6462: aconst_null
    //   6463: athrow
    //   6464: aconst_null
    //   6465: athrow
    //   6466: aconst_null
    //   6467: athrow
    //   6468: aconst_null
    //   6469: athrow
    //   6470: aconst_null
    //   6471: athrow
    //   6472: aconst_null
    //   6473: athrow
    //   6474: aconst_null
    //   6475: athrow
    //   6476: aconst_null
    //   6477: athrow
    //   6478: aconst_null
    //   6479: athrow
    //   6480: aconst_null
    //   6481: athrow
    //   6482: aconst_null
    //   6483: athrow
    //   6484: aconst_null
    //   6485: athrow
    //   6486: aconst_null
    //   6487: athrow
    //   6488: aconst_null
    //   6489: athrow
    //   6490: aconst_null
    //   6491: athrow
    //   6492: aconst_null
    //   6493: athrow
    //   6494: aconst_null
    //   6495: athrow
    //   6496: aconst_null
    //   6497: athrow
    //   6498: aconst_null
    //   6499: athrow
    //   6500: aconst_null
    //   6501: athrow
    //   6502: aconst_null
    //   6503: athrow
    //   6504: aconst_null
    //   6505: athrow
    //   6506: aconst_null
    //   6507: athrow
    //   6508: aconst_null
    //   6509: athrow
    //   6510: aconst_null
    //   6511: athrow
    //   6512: aconst_null
    //   6513: athrow
    //   6514: aconst_null
    //   6515: athrow
    //   6516: aconst_null
    //   6517: athrow
    //   6518: aconst_null
    //   6519: athrow
    //   6520: aconst_null
    //   6521: athrow
    //   6522: aconst_null
    //   6523: athrow
    //   6524: aconst_null
    //   6525: athrow
    //   6526: aconst_null
    //   6527: athrow
    //   6528: aconst_null
    //   6529: athrow
    //   6530: aconst_null
    //   6531: athrow
    //   6532: aconst_null
    //   6533: athrow
    //   6534: aconst_null
    //   6535: athrow
    //   6536: aconst_null
    //   6537: athrow
    //   6538: aconst_null
    //   6539: athrow
    //   6540: aconst_null
    //   6541: athrow
    //   6542: aconst_null
    //   6543: athrow
    //   6544: aconst_null
    //   6545: athrow
    //   6546: aconst_null
    //   6547: athrow
    //   6548: aconst_null
    //   6549: athrow
    //   6550: aconst_null
    //   6551: athrow
    //   6552: aconst_null
    //   6553: athrow
    //   6554: aconst_null
    //   6555: athrow
    //   6556: aconst_null
    //   6557: athrow
    //   6558: aconst_null
    //   6559: athrow
    //   6560: aconst_null
    //   6561: athrow
    //   6562: aconst_null
    //   6563: athrow
    //   6564: aconst_null
    //   6565: athrow
    //   6566: aconst_null
    //   6567: athrow
    //   6568: aconst_null
    //   6569: athrow
    //   6570: aconst_null
    //   6571: athrow
    //   6572: aconst_null
    //   6573: athrow
    //   6574: aconst_null
    //   6575: athrow
    //   6576: aconst_null
    //   6577: athrow
    //   6578: aconst_null
    //   6579: athrow
    //   6580: aconst_null
    //   6581: athrow
    //   6582: aconst_null
    //   6583: athrow
    //   6584: aconst_null
    //   6585: athrow
    //   6586: aconst_null
    //   6587: athrow
    //   6588: aconst_null
    //   6589: athrow
    //   6590: aconst_null
    //   6591: athrow
    //   6592: aconst_null
    //   6593: athrow
    //   6594: aconst_null
    //   6595: athrow
    //   6596: aconst_null
    //   6597: athrow
    //   6598: aconst_null
    //   6599: athrow
    //   6600: aconst_null
    //   6601: athrow
    //   6602: aconst_null
    //   6603: athrow
    //   6604: aconst_null
    //   6605: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	6412	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
  }
  
  public void setMode(Offhand2$Mode2 mode) {
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
  
  public String getDisplayInfo() {
    return Perry1.l(this, (int)2007197310L ^ 0x1F4B8810);
  }
  
  public boolean lambda$new$0(Object v) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 329
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 321
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 313
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1818661600
    //   33: l2i
    //   34: ldc_w -2081520308
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1702730284
    //   44: l2i
    //   45: ldc_w -583792842
    //   48: ixor
    //   49: ldc2_w 263972074
    //   52: l2i
    //   53: ldc_w 178589138
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1599516379 -> 41, -359203180 -> 296
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 917795857
    //   94: l2i
    //   95: ldc_w 868685668
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1043658461
    //   105: l2i
    //   106: ldc_w 1961672460
    //   109: ixor
    //   110: ldc2_w -588652721
    //   113: l2i
    //   114: ldc_w 448482875
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 302, -1937057627 -> 144, -1021185535 -> 102
    //   144: getfield crystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w 1939536931
    //   156: l2i
    //   157: ldc_w -446810296
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 566210743
    //   167: l2i
    //   168: ldc_w -1183743607
    //   171: ixor
    //   172: ldc2_w 1676042196
    //   175: l2i
    //   176: ldc_w -1978811191
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 298, 1898304035 -> 208, 2133796982 -> 164
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getValue : ()Ljava/lang/Object;
    //   215: goto -> 219
    //   218: athrow
    //   219: checkcast java/lang/Boolean
    //   222: getstatic Perryc.c : I
    //   225: iflt -> 239
    //   228: ldc2_w 659639427
    //   231: l2i
    //   232: ldc_w 523129439
    //   235: ixor
    //   236: goto -> 247
    //   239: ldc2_w 1772464192
    //   242: l2i
    //   243: ldc_w -699542582
    //   246: ixor
    //   247: ldc2_w 1706295573
    //   250: l2i
    //   251: ldc_w 910464770
    //   254: ixor
    //   255: ixor
    //   256: lookupswitch default -> 284, 1105586232 -> 239, 1804568779 -> 300
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual booleanValue : ()Z
    //   291: goto -> 295
    //   294: athrow
    //   295: ireturn
    //   296: aconst_null
    //   297: athrow
    //   298: aconst_null
    //   299: athrow
    //   300: aconst_null
    //   301: athrow
    //   302: aconst_null
    //   303: athrow
    //   304: pop
    //   305: goto -> 24
    //   308: pop
    //   309: aconst_null
    //   310: goto -> 304
    //   313: dup
    //   314: ifnull -> 304
    //   317: checkcast java/lang/Throwable
    //   320: athrow
    //   321: dup
    //   322: ifnull -> 308
    //   325: checkcast java/lang/Throwable
    //   328: athrow
    //   329: aconst_null
    //   330: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	272	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   24	272	1	v	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   8	20	313	java/lang/NullPointerException
    //   212	218	218	finally
    //   212	218	3	finally
    //   212	218	3	java/util/NoSuchElementException
    //   212	218	3	java/lang/AssertionError
    //   212	218	218	java/lang/IndexOutOfBoundsException
    //   287	294	294	finally
    //   287	294	287	java/lang/NullPointerException
    //   288	294	3	java/lang/NullPointerException
    //   288	294	294	finally
    //   288	294	294	finally
    //   313	321	313	finally
    //   329	331	3	finally
  }
  
  public int getLastSlot(Item paramItem, int paramInt) {
    return Perry1.6v(this, (int)-928664257L ^ 0xAA515AEB, paramItem, paramInt);
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(ProcessRightClickBlockEvent paramProcessRightClickBlockEvent) {
    Perry1.15(this, (int)2956365L ^ 0x32E03C8D, paramProcessRightClickBlockEvent);
  }
  
  public void doSwitch() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 17331
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 17323
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 17315
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -210671652
    //   33: l2i
    //   34: ldc_w -427972179
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -317466901
    //   44: l2i
    //   45: ldc_w 1898660494
    //   48: ixor
    //   49: ldc2_w -590335769
    //   52: l2i
    //   53: ldc_w -320076750
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 17038, -1408982864 -> 84, 623966884 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -2032323239
    //   94: l2i
    //   95: ldc_w -684293953
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 386242256
    //   105: l2i
    //   106: ldc_w 608503394
    //   109: ixor
    //   110: ldc2_w -313834093
    //   113: l2i
    //   114: ldc_w 1283391684
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 16932, -1837836827 -> 144, -253759311 -> 102
    //   144: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w -1025467227
    //   156: l2i
    //   157: ldc_w 1515121804
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -1900251877
    //   167: l2i
    //   168: ldc_w 1076372902
    //   171: ixor
    //   172: ldc2_w 1021218420
    //   175: l2i
    //   176: ldc_w 1260791600
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 16902, -1184040455 -> 208, -279520915 -> 164
    //   208: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w 297180118
    //   220: l2i
    //   221: ldc_w -891727874
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w 236933267
    //   231: l2i
    //   232: ldc_w -511961615
    //   235: ixor
    //   236: ldc2_w -198905056
    //   239: l2i
    //   240: ldc_w 624520042
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 17164, 175262818 -> 228, 1048501544 -> 272
    //   272: aload_0
    //   273: getstatic Perryc.c : I
    //   276: iflt -> 290
    //   279: ldc2_w 2085634587
    //   282: l2i
    //   283: ldc_w -1389659685
    //   286: ixor
    //   287: goto -> 298
    //   290: ldc2_w 1589368412
    //   293: l2i
    //   294: ldc_w -1784462512
    //   297: ixor
    //   298: ldc2_w -1429827750
    //   301: l2i
    //   302: ldc_w -1421708057
    //   305: ixor
    //   306: ixor
    //   307: lookupswitch default -> 332, -788545411 -> 17032, 857269648 -> 290
    //   332: getfield gapple : Lbigname/zprestige/webhack/features/setting/Setting;
    //   335: getstatic Perryc.c : I
    //   338: iflt -> 352
    //   341: ldc2_w -917879072
    //   344: l2i
    //   345: ldc_w -869534490
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w -440082672
    //   355: l2i
    //   356: ldc_w -53002105
    //   359: ixor
    //   360: ldc2_w -882634919
    //   363: l2i
    //   364: ldc_w 928555697
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 17098, -449891713 -> 396, -111337490 -> 352
    //   396: goto -> 400
    //   399: athrow
    //   400: invokevirtual getValue : ()Ljava/lang/Object;
    //   403: goto -> 407
    //   406: athrow
    //   407: checkcast java/lang/Boolean
    //   410: getstatic Perryc.0 : I
    //   413: ifle -> 427
    //   416: ldc2_w 1327504409
    //   419: l2i
    //   420: ldc_w 327176020
    //   423: ixor
    //   424: goto -> 435
    //   427: ldc2_w -142975273
    //   430: l2i
    //   431: ldc_w -997422957
    //   434: ixor
    //   435: ldc2_w -1242470866
    //   438: l2i
    //   439: ldc_w -2101728809
    //   442: ixor
    //   443: ixor
    //   444: lookupswitch default -> 472, 1268943760 -> 427, 1810570420 -> 17242
    //   472: goto -> 476
    //   475: athrow
    //   476: invokevirtual booleanValue : ()Z
    //   479: goto -> 483
    //   482: athrow
    //   483: ifeq -> 497
    //   486: ldc2_w -2107647398
    //   489: l2i
    //   490: ldc_w -1184788936
    //   493: ixor
    //   494: goto -> 505
    //   497: ldc2_w 729102577
    //   500: l2i
    //   501: ldc_w 273378450
    //   504: ixor
    //   505: ldc2_w 1216750104
    //   508: l2i
    //   509: ldc_w -446242192
    //   512: ixor
    //   513: ixor
    //   514: tableswitch default -> 486, -1763798006 -> 536, -1763798005 -> 1370
    //   536: getstatic Perryc.c : I
    //   539: iflt -> 553
    //   542: ldc2_w 1151376469
    //   545: l2i
    //   546: ldc_w 143988428
    //   549: ixor
    //   550: goto -> 561
    //   553: ldc2_w -772698485
    //   556: l2i
    //   557: ldc_w 1871769804
    //   560: ixor
    //   561: ldc2_w -216671258
    //   564: l2i
    //   565: ldc_w -1523511308
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 17040, -398087595 -> 596, 437345931 -> 553
    //   596: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   599: getstatic Perryc.0 : I
    //   602: ifle -> 616
    //   605: ldc2_w 1577881802
    //   608: l2i
    //   609: ldc_w 1396662883
    //   612: ixor
    //   613: goto -> 624
    //   616: ldc2_w -579950831
    //   619: l2i
    //   620: ldc_w 1341573707
    //   623: ixor
    //   624: ldc2_w 665065538
    //   627: l2i
    //   628: ldc_w -508459103
    //   631: ixor
    //   632: ixor
    //   633: lookupswitch default -> 17088, -886674102 -> 616, 1418588857 -> 660
    //   660: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   663: getstatic Perryc.c : I
    //   666: iflt -> 680
    //   669: ldc2_w 317040190
    //   672: l2i
    //   673: ldc_w 297318404
    //   676: ixor
    //   677: goto -> 688
    //   680: ldc2_w 2079936964
    //   683: l2i
    //   684: ldc_w -1195076178
    //   687: ixor
    //   688: ldc2_w -968757709
    //   691: l2i
    //   692: ldc_w 1658999455
    //   695: ixor
    //   696: ixor
    //   697: lookupswitch default -> 17202, -1476484458 -> 680, 1738438854 -> 724
    //   724: goto -> 728
    //   727: athrow
    //   728: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   731: goto -> 735
    //   734: athrow
    //   735: getstatic Perryc.1 : I
    //   738: ifeq -> 752
    //   741: ldc2_w -1939994963
    //   744: l2i
    //   745: ldc_w -1951331234
    //   748: ixor
    //   749: goto -> 760
    //   752: ldc2_w 1999163863
    //   755: l2i
    //   756: ldc_w -1742286853
    //   759: ixor
    //   760: ldc2_w -1016240160
    //   763: l2i
    //   764: ldc_w -113459512
    //   767: ixor
    //   768: ixor
    //   769: lookupswitch default -> 796, 1035916251 -> 17180, 1591396830 -> 752
    //   796: goto -> 800
    //   799: athrow
    //   800: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   803: goto -> 807
    //   806: athrow
    //   807: instanceof net/minecraft/item/ItemSword
    //   810: ifeq -> 824
    //   813: ldc2_w -490922754
    //   816: l2i
    //   817: ldc_w 1884216271
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -1553545170
    //   827: l2i
    //   828: ldc_w 831852318
    //   831: ixor
    //   832: ldc2_w 1824784497
    //   835: l2i
    //   836: ldc_w 465081234
    //   839: ixor
    //   840: ixor
    //   841: tableswitch default -> 813, -443591470 -> 864, -443591469 -> 1370
    //   864: getstatic Perryc.c : I
    //   867: iflt -> 881
    //   870: ldc2_w 263658776
    //   873: l2i
    //   874: ldc_w -1367422204
    //   877: ixor
    //   878: goto -> 889
    //   881: ldc2_w -1454659104
    //   884: l2i
    //   885: ldc_w -1333349032
    //   888: ixor
    //   889: ldc2_w 1819265849
    //   892: l2i
    //   893: ldc_w 209644880
    //   896: ixor
    //   897: ixor
    //   898: lookupswitch default -> 924, -1042747275 -> 17004, -698685340 -> 881
    //   924: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   927: getstatic Perryc.1 : I
    //   930: ifeq -> 944
    //   933: ldc2_w -1872184063
    //   936: l2i
    //   937: ldc_w 885283050
    //   940: ixor
    //   941: goto -> 952
    //   944: ldc2_w 58267407
    //   947: l2i
    //   948: ldc_w 241352440
    //   951: ixor
    //   952: ldc2_w 396189785
    //   955: l2i
    //   956: ldc_w 1405095367
    //   959: ixor
    //   960: ixor
    //   961: lookupswitch default -> 17190, -521041803 -> 944, 1229374569 -> 988
    //   988: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   991: getstatic Perryc.1 : I
    //   994: ifeq -> 1008
    //   997: ldc2_w 620479323
    //   1000: l2i
    //   1001: ldc_w 1861298512
    //   1004: ixor
    //   1005: goto -> 1016
    //   1008: ldc2_w 1329600125
    //   1011: l2i
    //   1012: ldc_w 318949316
    //   1015: ixor
    //   1016: ldc2_w -606648006
    //   1019: l2i
    //   1020: ldc_w -1628550070
    //   1023: ixor
    //   1024: ixor
    //   1025: lookupswitch default -> 16930, 255061883 -> 1008, 427545801 -> 1052
    //   1052: getfield field_74313_G : Lnet/minecraft/client/settings/KeyBinding;
    //   1055: getstatic Perryc.c : I
    //   1058: iflt -> 1072
    //   1061: ldc2_w -299992211
    //   1064: l2i
    //   1065: ldc_w 197154178
    //   1068: ixor
    //   1069: goto -> 1080
    //   1072: ldc2_w 1143236231
    //   1075: l2i
    //   1076: ldc_w 516983448
    //   1079: ixor
    //   1080: ldc2_w -810140546
    //   1083: l2i
    //   1084: ldc_w 992028093
    //   1087: ixor
    //   1088: ixor
    //   1089: lookupswitch default -> 17054, -1369180708 -> 1116, 290010924 -> 1072
    //   1116: goto -> 1120
    //   1119: athrow
    //   1120: invokevirtual func_151470_d : ()Z
    //   1123: goto -> 1127
    //   1126: athrow
    //   1127: ifeq -> 1141
    //   1130: ldc2_w 1717380845
    //   1133: l2i
    //   1134: ldc_w 499860333
    //   1137: ixor
    //   1138: goto -> 1149
    //   1141: ldc2_w -865427823
    //   1144: l2i
    //   1145: ldc_w -1208157424
    //   1148: ixor
    //   1149: ldc2_w 1398420742
    //   1152: l2i
    //   1153: ldc_w 5280534
    //   1156: ixor
    //   1157: ixor
    //   1158: tableswitch default -> 1130, 681362320 -> 1180, 681362321 -> 1370
    //   1180: getstatic Perryc.0 : I
    //   1183: ifle -> 1197
    //   1186: ldc2_w 262616218
    //   1189: l2i
    //   1190: ldc_w 258221105
    //   1193: ixor
    //   1194: goto -> 1205
    //   1197: ldc2_w -1617438232
    //   1200: l2i
    //   1201: ldc_w 1555927106
    //   1204: ixor
    //   1205: ldc2_w -848956619
    //   1208: l2i
    //   1209: ldc_w -807884372
    //   1212: ixor
    //   1213: ixor
    //   1214: lookupswitch default -> 1240, 41830962 -> 17256, 1477298289 -> 1197
    //   1240: aload_0
    //   1241: getstatic Perryc.1 : I
    //   1244: ifeq -> 1258
    //   1247: ldc2_w -1917855590
    //   1250: l2i
    //   1251: ldc_w 1734691790
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w 335236851
    //   1261: l2i
    //   1262: ldc_w -1389497570
    //   1265: ixor
    //   1266: ldc2_w 1240424691
    //   1269: l2i
    //   1270: ldc_w 972571045
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 1300, -1696747006 -> 17290, -968705669 -> 1258
    //   1300: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.GAPPLES : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   1303: getstatic Perryc.0 : I
    //   1306: ifle -> 1320
    //   1309: ldc2_w 1511165748
    //   1312: l2i
    //   1313: ldc_w 544398610
    //   1316: ixor
    //   1317: goto -> 1328
    //   1320: ldc2_w 1452519862
    //   1323: l2i
    //   1324: ldc_w -1578292812
    //   1327: ixor
    //   1328: ldc2_w 595451429
    //   1331: l2i
    //   1332: ldc_w -736057022
    //   1335: ixor
    //   1336: ixor
    //   1337: lookupswitch default -> 1364, -1925372607 -> 17162, 1633329275 -> 1320
    //   1364: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   1367: goto -> 3455
    //   1370: getstatic Perryc.1 : I
    //   1373: ifeq -> 1387
    //   1376: ldc2_w 722432317
    //   1379: l2i
    //   1380: ldc_w 2107662326
    //   1383: ixor
    //   1384: goto -> 1395
    //   1387: ldc2_w 433634825
    //   1390: l2i
    //   1391: ldc_w -1214469903
    //   1394: ixor
    //   1395: ldc2_w 1017009996
    //   1398: l2i
    //   1399: ldc_w 405984461
    //   1402: ixor
    //   1403: ixor
    //   1404: lookupswitch default -> 1432, -1847124475 -> 1387, 1912843594 -> 16956
    //   1432: aload_0
    //   1433: getstatic Perryc.c : I
    //   1436: iflt -> 1450
    //   1439: ldc2_w -1294048493
    //   1442: l2i
    //   1443: ldc_w -1816146538
    //   1446: ixor
    //   1447: goto -> 1458
    //   1450: ldc2_w 819763975
    //   1453: l2i
    //   1454: ldc_w 1046511019
    //   1457: ixor
    //   1458: ldc2_w -1743403156
    //   1461: l2i
    //   1462: ldc_w 457209752
    //   1465: ixor
    //   1466: ixor
    //   1467: lookupswitch default -> 17280, -1914087848 -> 1492, -1573642639 -> 1450
    //   1492: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   1495: getstatic Perryc.0 : I
    //   1498: ifle -> 1512
    //   1501: ldc2_w 2079815575
    //   1504: l2i
    //   1505: ldc_w 584750284
    //   1508: ixor
    //   1509: goto -> 1520
    //   1512: ldc2_w -516126792
    //   1515: l2i
    //   1516: ldc_w 503852298
    //   1519: ixor
    //   1520: ldc2_w -1042932902
    //   1523: l2i
    //   1524: ldc_w 1476077315
    //   1527: ixor
    //   1528: ixor
    //   1529: lookupswitch default -> 17022, -822026494 -> 1512, 1763284715 -> 1556
    //   1556: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   1559: if_acmpeq -> 1573
    //   1562: ldc2_w 619193651
    //   1565: l2i
    //   1566: ldc_w -1375268844
    //   1569: ixor
    //   1570: goto -> 1581
    //   1573: ldc2_w 731650321
    //   1576: l2i
    //   1577: ldc_w -1586287561
    //   1580: ixor
    //   1581: ldc2_w -1001518027
    //   1584: l2i
    //   1585: ldc_w 1256568666
    //   1588: ixor
    //   1589: ixor
    //   1590: tableswitch default -> 1562, 71601736 -> 1612, 71601737 -> 3455
    //   1612: getstatic Perryc.0 : I
    //   1615: ifle -> 1629
    //   1618: ldc2_w -1968046952
    //   1621: l2i
    //   1622: ldc_w -695429912
    //   1625: ixor
    //   1626: goto -> 1637
    //   1629: ldc2_w 727176771
    //   1632: l2i
    //   1633: ldc_w -2044455110
    //   1636: ixor
    //   1637: ldc2_w 459251973
    //   1640: l2i
    //   1641: ldc_w -1070856414
    //   1644: ixor
    //   1645: ixor
    //   1646: lookupswitch default -> 17274, -2024878505 -> 1629, 1979737950 -> 1672
    //   1672: aload_0
    //   1673: getstatic Perryc.0 : I
    //   1676: ifle -> 1690
    //   1679: ldc2_w 1492594041
    //   1682: l2i
    //   1683: ldc_w 452834754
    //   1686: ixor
    //   1687: goto -> 1698
    //   1690: ldc2_w -1325524028
    //   1693: l2i
    //   1694: ldc_w -422852433
    //   1697: ixor
    //   1698: ldc2_w 1852763544
    //   1701: l2i
    //   1702: ldc_w 2040233415
    //   1705: ixor
    //   1706: ixor
    //   1707: lookupswitch default -> 1732, 1442777316 -> 17110, 1836963367 -> 1690
    //   1732: getfield crystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1735: getstatic Perryc.1 : I
    //   1738: ifeq -> 1752
    //   1741: ldc2_w 1307943241
    //   1744: l2i
    //   1745: ldc_w -444575688
    //   1748: ixor
    //   1749: goto -> 1760
    //   1752: ldc2_w -661990210
    //   1755: l2i
    //   1756: ldc_w 1274555035
    //   1759: ixor
    //   1760: ldc2_w 1455427795
    //   1763: l2i
    //   1764: ldc_w 366781809
    //   1767: ixor
    //   1768: ixor
    //   1769: lookupswitch default -> 1796, -1770032538 -> 1752, -345422637 -> 17148
    //   1796: goto -> 1800
    //   1799: athrow
    //   1800: invokevirtual getValue : ()Ljava/lang/Object;
    //   1803: goto -> 1807
    //   1806: athrow
    //   1807: checkcast java/lang/Boolean
    //   1810: getstatic Perryc.0 : I
    //   1813: ifle -> 1827
    //   1816: ldc2_w 1963156415
    //   1819: l2i
    //   1820: ldc_w 591058720
    //   1823: ixor
    //   1824: goto -> 1835
    //   1827: ldc2_w 844349971
    //   1830: l2i
    //   1831: ldc_w 2112109011
    //   1834: ixor
    //   1835: ldc2_w 1253858059
    //   1838: l2i
    //   1839: ldc_w -651946595
    //   1842: ixor
    //   1843: ixor
    //   1844: lookupswitch default -> 1872, -979240439 -> 16996, 1991906978 -> 1827
    //   1872: goto -> 1876
    //   1875: athrow
    //   1876: invokevirtual booleanValue : ()Z
    //   1879: goto -> 1883
    //   1882: athrow
    //   1883: ifeq -> 1897
    //   1886: ldc2_w 1592954796
    //   1889: l2i
    //   1890: ldc_w -362271267
    //   1893: ixor
    //   1894: goto -> 1905
    //   1897: ldc2_w 1139575652
    //   1900: l2i
    //   1901: ldc_w -143251180
    //   1904: ixor
    //   1905: ldc2_w -24542832
    //   1908: l2i
    //   1909: ldc_w 1968499839
    //   1912: ixor
    //   1913: ixor
    //   1914: tableswitch default -> 1886, 1061670814 -> 1936, 1061670815 -> 3455
    //   1936: getstatic Perryc.c : I
    //   1939: iflt -> 1953
    //   1942: ldc2_w -2016457825
    //   1945: l2i
    //   1946: ldc_w -2136188177
    //   1949: ixor
    //   1950: goto -> 1961
    //   1953: ldc2_w -158436440
    //   1956: l2i
    //   1957: ldc_w 274938087
    //   1960: ixor
    //   1961: ldc2_w 1073650528
    //   1964: l2i
    //   1965: ldc_w -1727082470
    //   1968: ixor
    //   1969: ixor
    //   1970: lookupswitch default -> 1996, -1584178678 -> 16862, 28255169 -> 1953
    //   1996: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   1999: getstatic Perryc.0 : I
    //   2002: ifle -> 2016
    //   2005: ldc2_w 829351581
    //   2008: l2i
    //   2009: ldc_w 1463049394
    //   2012: ixor
    //   2013: goto -> 2024
    //   2016: ldc2_w 566636511
    //   2019: l2i
    //   2020: ldc_w -536829379
    //   2023: ixor
    //   2024: ldc2_w 437709731
    //   2027: l2i
    //   2028: ldc_w 948524675
    //   2031: ixor
    //   2032: ixor
    //   2033: lookupswitch default -> 17218, -480694078 -> 2060, 1153763087 -> 2016
    //   2060: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2063: ldc2_w -1745712333
    //   2066: l2i
    //   2067: ldc_w 1745712332
    //   2070: ixor
    //   2071: ldc2_w 1934569660
    //   2074: l2i
    //   2075: ldc_w 1934569660
    //   2078: ixor
    //   2079: getstatic Perryc.1 : I
    //   2082: ifeq -> 2096
    //   2085: ldc2_w 123548975
    //   2088: l2i
    //   2089: ldc_w 338230652
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w 1413026338
    //   2099: l2i
    //   2100: ldc_w 1864690734
    //   2103: ixor
    //   2104: ldc2_w -731876897
    //   2107: l2i
    //   2108: ldc_w -163576453
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 16946, 423463592 -> 2140, 827702519 -> 2096
    //   2140: goto -> 2144
    //   2143: athrow
    //   2144: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   2147: goto -> 2151
    //   2150: athrow
    //   2151: ifeq -> 2165
    //   2154: ldc2_w 1629982258
    //   2157: l2i
    //   2158: ldc_w -1787344695
    //   2161: ixor
    //   2162: goto -> 2173
    //   2165: ldc2_w -922645783
    //   2168: l2i
    //   2169: ldc_w 1028738077
    //   2172: ixor
    //   2173: ldc2_w -795219586
    //   2176: l2i
    //   2177: ldc_w 996830818
    //   2180: ixor
    //   2181: ixor
    //   2182: tableswitch default -> 2154, 530792935 -> 2204, 530792936 -> 2736
    //   2204: getstatic Perryc.1 : I
    //   2207: ifeq -> 2221
    //   2210: ldc2_w -1511089838
    //   2213: l2i
    //   2214: ldc_w -414162613
    //   2217: ixor
    //   2218: goto -> 2229
    //   2221: ldc2_w -1883890706
    //   2224: l2i
    //   2225: ldc_w -946777184
    //   2228: ixor
    //   2229: ldc2_w 2023178227
    //   2232: l2i
    //   2233: ldc_w -368161970
    //   2236: ixor
    //   2237: ixor
    //   2238: lookupswitch default -> 2264, -2103032731 -> 2221, -802714460 -> 16976
    //   2264: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   2267: getstatic Perryc.0 : I
    //   2270: ifle -> 2284
    //   2273: ldc2_w 1639928126
    //   2276: l2i
    //   2277: ldc_w 1059437357
    //   2280: ixor
    //   2281: goto -> 2292
    //   2284: ldc2_w -981874881
    //   2287: l2i
    //   2288: ldc_w -1048593435
    //   2291: ixor
    //   2292: ldc2_w -1408596844
    //   2295: l2i
    //   2296: ldc_w 219251692
    //   2299: ixor
    //   2300: ixor
    //   2301: lookupswitch default -> 2328, -1293213668 -> 2284, -8262293 -> 17292
    //   2328: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2331: ldc2_w -1487635606
    //   2334: l2i
    //   2335: ldc_w -1487635605
    //   2338: ixor
    //   2339: getstatic Perryc.1 : I
    //   2342: ifeq -> 2356
    //   2345: ldc2_w 664981998
    //   2348: l2i
    //   2349: ldc_w 528523266
    //   2352: ixor
    //   2353: goto -> 2364
    //   2356: ldc2_w -62432731
    //   2359: l2i
    //   2360: ldc_w 359671749
    //   2363: ixor
    //   2364: ldc2_w -1478243848
    //   2367: l2i
    //   2368: ldc_w -218438018
    //   2371: ixor
    //   2372: ixor
    //   2373: lookupswitch default -> 2400, -178450396 -> 2356, 1832607338 -> 17082
    //   2400: goto -> 2404
    //   2403: athrow
    //   2404: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   2407: goto -> 2411
    //   2410: athrow
    //   2411: getstatic Perryc.1 : I
    //   2414: ifeq -> 2428
    //   2417: ldc2_w 1057766521
    //   2420: l2i
    //   2421: ldc_w 1959259795
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w 1819252272
    //   2431: l2i
    //   2432: ldc_w -865256136
    //   2435: ixor
    //   2436: ldc2_w 1459042849
    //   2439: l2i
    //   2440: ldc_w -370810149
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 16906, -187102704 -> 2428, 521171954 -> 2472
    //   2472: aload_0
    //   2473: getstatic Perryc.1 : I
    //   2476: ifeq -> 2490
    //   2479: ldc2_w -187316051
    //   2482: l2i
    //   2483: ldc_w -927312522
    //   2486: ixor
    //   2487: goto -> 2498
    //   2490: ldc2_w -519029707
    //   2493: l2i
    //   2494: ldc_w 1788759085
    //   2497: ixor
    //   2498: ldc2_w 617892764
    //   2501: l2i
    //   2502: ldc_w -1821656333
    //   2505: ixor
    //   2506: ixor
    //   2507: lookupswitch default -> 16900, -1949274956 -> 2490, 1009877367 -> 2532
    //   2532: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2535: getstatic Perryc.1 : I
    //   2538: ifeq -> 2552
    //   2541: ldc2_w 1837442120
    //   2544: l2i
    //   2545: ldc_w -468211184
    //   2548: ixor
    //   2549: goto -> 2560
    //   2552: ldc2_w -65991977
    //   2555: l2i
    //   2556: ldc_w -918808002
    //   2559: ixor
    //   2560: ldc2_w -1744354980
    //   2563: l2i
    //   2564: ldc_w -952208260
    //   2567: ixor
    //   2568: ixor
    //   2569: lookupswitch default -> 17238, -693388424 -> 2552, 1779705289 -> 2596
    //   2596: goto -> 2600
    //   2599: athrow
    //   2600: invokevirtual getValue : ()Ljava/lang/Object;
    //   2603: goto -> 2607
    //   2606: athrow
    //   2607: checkcast java/lang/Float
    //   2610: getstatic Perryc.c : I
    //   2613: iflt -> 2627
    //   2616: ldc2_w -1812065935
    //   2619: l2i
    //   2620: ldc_w 258708431
    //   2623: ixor
    //   2624: goto -> 2635
    //   2627: ldc2_w 2137102102
    //   2630: l2i
    //   2631: ldc_w -488582077
    //   2634: ixor
    //   2635: ldc2_w 1120289655
    //   2638: l2i
    //   2639: ldc_w -639044007
    //   2642: ixor
    //   2643: ixor
    //   2644: lookupswitch default -> 2672, 129709968 -> 17020, 1098227700 -> 2627
    //   2672: goto -> 2676
    //   2675: athrow
    //   2676: invokevirtual floatValue : ()F
    //   2679: goto -> 2683
    //   2682: athrow
    //   2683: fcmpl
    //   2684: ifgt -> 2698
    //   2687: ldc2_w -990185830
    //   2690: l2i
    //   2691: ldc_w -1270977562
    //   2694: ixor
    //   2695: goto -> 2706
    //   2698: ldc2_w 1507480688
    //   2701: l2i
    //   2702: ldc_w 689883405
    //   2705: ixor
    //   2706: ldc2_w -128210323
    //   2709: l2i
    //   2710: ldc_w -697503953
    //   2713: ixor
    //   2714: ixor
    //   2715: tableswitch default -> 2687, 1593038910 -> 2736, 1593038911 -> 3268
    //   2736: getstatic Perryc.c : I
    //   2739: iflt -> 2753
    //   2742: ldc2_w -639398333
    //   2745: l2i
    //   2746: ldc_w -116316043
    //   2749: ixor
    //   2750: goto -> 2761
    //   2753: ldc2_w -1032511517
    //   2756: l2i
    //   2757: ldc_w 1881893250
    //   2760: ixor
    //   2761: ldc2_w 1056953936
    //   2764: l2i
    //   2765: ldc_w 407603589
    //   2768: ixor
    //   2769: ixor
    //   2770: lookupswitch default -> 16994, -1796593228 -> 2796, 105314787 -> 2753
    //   2796: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   2799: getstatic Perryc.1 : I
    //   2802: ifeq -> 2816
    //   2805: ldc2_w 301193464
    //   2808: l2i
    //   2809: ldc_w -104158540
    //   2812: ixor
    //   2813: goto -> 2824
    //   2816: ldc2_w -255501001
    //   2819: l2i
    //   2820: ldc_w -1685508174
    //   2823: ixor
    //   2824: ldc2_w -159523389
    //   2827: l2i
    //   2828: ldc_w 5450109
    //   2831: ixor
    //   2832: ixor
    //   2833: lookupswitch default -> 2860, 504858354 -> 16968, 2015681881 -> 2816
    //   2860: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2863: ldc2_w -1806692499
    //   2866: l2i
    //   2867: ldc_w -1806692500
    //   2870: ixor
    //   2871: getstatic Perryc.c : I
    //   2874: iflt -> 2888
    //   2877: ldc2_w -1381314228
    //   2880: l2i
    //   2881: ldc_w 303541634
    //   2884: ixor
    //   2885: goto -> 2896
    //   2888: ldc2_w -1907905589
    //   2891: l2i
    //   2892: ldc_w 832796839
    //   2895: ixor
    //   2896: ldc2_w 1916552003
    //   2899: l2i
    //   2900: ldc_w -587860232
    //   2903: ixor
    //   2904: ixor
    //   2905: lookupswitch default -> 17052, 288188119 -> 2932, 292866421 -> 2888
    //   2932: goto -> 2936
    //   2935: athrow
    //   2936: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   2939: goto -> 2943
    //   2942: athrow
    //   2943: getstatic Perryc.0 : I
    //   2946: ifle -> 2960
    //   2949: ldc2_w 1088153403
    //   2952: l2i
    //   2953: ldc_w 711100971
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w 1173401390
    //   2963: l2i
    //   2964: ldc_w 146499429
    //   2967: ixor
    //   2968: ldc2_w -2062157042
    //   2971: l2i
    //   2972: ldc_w 1884875526
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 3004, -1611367144 -> 16980, -83216586 -> 2960
    //   3004: aload_0
    //   3005: getstatic Perryc.c : I
    //   3008: iflt -> 3022
    //   3011: ldc2_w 309893780
    //   3014: l2i
    //   3015: ldc_w 1963182959
    //   3018: ixor
    //   3019: goto -> 3030
    //   3022: ldc2_w -1607582895
    //   3025: l2i
    //   3026: ldc_w -1392662939
    //   3029: ixor
    //   3030: ldc2_w 632683121
    //   3033: l2i
    //   3034: ldc_w -1158389377
    //   3037: ixor
    //   3038: ixor
    //   3039: lookupswitch default -> 3064, -1058127720 -> 3022, -130364683 -> 16978
    //   3064: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3067: getstatic Perryc.1 : I
    //   3070: ifeq -> 3084
    //   3073: ldc2_w 148567482
    //   3076: l2i
    //   3077: ldc_w -99129927
    //   3080: ixor
    //   3081: goto -> 3092
    //   3084: ldc2_w -85921315
    //   3087: l2i
    //   3088: ldc_w -1055988922
    //   3091: ixor
    //   3092: ldc2_w -1670329622
    //   3095: l2i
    //   3096: ldc_w 1904283438
    //   3099: ixor
    //   3100: ixor
    //   3101: lookupswitch default -> 3128, 524047815 -> 17268, 1529356217 -> 3084
    //   3128: goto -> 3132
    //   3131: athrow
    //   3132: invokevirtual getValue : ()Ljava/lang/Object;
    //   3135: goto -> 3139
    //   3138: athrow
    //   3139: checkcast java/lang/Float
    //   3142: getstatic Perryc.1 : I
    //   3145: ifeq -> 3159
    //   3148: ldc2_w 614264213
    //   3151: l2i
    //   3152: ldc_w -689448953
    //   3155: ixor
    //   3156: goto -> 3167
    //   3159: ldc2_w 617407858
    //   3162: l2i
    //   3163: ldc_w -1924909751
    //   3166: ixor
    //   3167: ldc2_w -1884017771
    //   3170: l2i
    //   3171: ldc_w 1281893327
    //   3174: ixor
    //   3175: ixor
    //   3176: lookupswitch default -> 3204, -787802053 -> 3159, 833043912 -> 17102
    //   3204: goto -> 3208
    //   3207: athrow
    //   3208: invokevirtual floatValue : ()F
    //   3211: goto -> 3215
    //   3214: athrow
    //   3215: fcmpl
    //   3216: ifle -> 3230
    //   3219: ldc2_w 1066109069
    //   3222: l2i
    //   3223: ldc_w 1256501860
    //   3226: ixor
    //   3227: goto -> 3238
    //   3230: ldc2_w 463358783
    //   3233: l2i
    //   3234: ldc_w 1861317079
    //   3237: ixor
    //   3238: ldc2_w -1293688870
    //   3241: l2i
    //   3242: ldc_w 1380344119
    //   3245: ixor
    //   3246: ixor
    //   3247: tableswitch default -> 3219, -1781890044 -> 3268, -1781890043 -> 3455
    //   3268: getstatic Perryc.0 : I
    //   3271: ifle -> 3285
    //   3274: ldc2_w -601592258
    //   3277: l2i
    //   3278: ldc_w 173439844
    //   3281: ixor
    //   3282: goto -> 3293
    //   3285: ldc2_w -593064366
    //   3288: l2i
    //   3289: ldc_w -1234024650
    //   3292: ixor
    //   3293: ldc2_w 591212930
    //   3296: l2i
    //   3297: ldc_w -1511201379
    //   3300: ixor
    //   3301: ixor
    //   3302: lookupswitch default -> 17240, -335209093 -> 3328, 1352909125 -> 3285
    //   3328: aload_0
    //   3329: getstatic Perryc.0 : I
    //   3332: ifle -> 3346
    //   3335: ldc2_w 191550824
    //   3338: l2i
    //   3339: ldc_w 398118714
    //   3342: ixor
    //   3343: goto -> 3354
    //   3346: ldc2_w -1695680635
    //   3349: l2i
    //   3350: ldc_w -1431150673
    //   3353: ixor
    //   3354: ldc2_w 701956932
    //   3357: l2i
    //   3358: ldc_w -1813568901
    //   3361: ixor
    //   3362: ixor
    //   3363: lookupswitch default -> 17128, -1972401899 -> 3388, -1495254163 -> 3346
    //   3388: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   3391: getstatic Perryc.1 : I
    //   3394: ifeq -> 3408
    //   3397: ldc2_w 1938093318
    //   3400: l2i
    //   3401: ldc_w 32382731
    //   3404: ixor
    //   3405: goto -> 3416
    //   3408: ldc2_w 65578091
    //   3411: l2i
    //   3412: ldc_w -116053590
    //   3415: ixor
    //   3416: ldc2_w 1814639144
    //   3419: l2i
    //   3420: ldc_w 317602843
    //   3423: ixor
    //   3424: ixor
    //   3425: lookupswitch default -> 17294, -2076539918 -> 3452, 212722750 -> 3408
    //   3452: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   3455: getstatic Perryc.0 : I
    //   3458: ifle -> 3472
    //   3461: ldc2_w -1563652959
    //   3464: l2i
    //   3465: ldc_w -96057124
    //   3468: ixor
    //   3469: goto -> 3480
    //   3472: ldc2_w 904609143
    //   3475: l2i
    //   3476: ldc_w 1217684612
    //   3479: ixor
    //   3480: ldc2_w -1871777014
    //   3483: l2i
    //   3484: ldc_w 1162761646
    //   3487: ixor
    //   3488: ixor
    //   3489: lookupswitch default -> 3516, -1988115973 -> 3472, -1918213415 -> 17002
    //   3516: aload_0
    //   3517: getstatic Perryc.0 : I
    //   3520: ifle -> 3534
    //   3523: ldc2_w 1497438461
    //   3526: l2i
    //   3527: ldc_w -1894445675
    //   3530: ixor
    //   3531: goto -> 3542
    //   3534: ldc2_w -1074789453
    //   3537: l2i
    //   3538: ldc_w -106706380
    //   3541: ixor
    //   3542: ldc2_w -255363068
    //   3545: l2i
    //   3546: ldc_w 38820122
    //   3549: ixor
    //   3550: ixor
    //   3551: lookupswitch default -> 3576, 616772726 -> 17050, 888798246 -> 3534
    //   3576: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   3579: getstatic Perryc.0 : I
    //   3582: ifle -> 3596
    //   3585: ldc2_w 807410918
    //   3588: l2i
    //   3589: ldc_w -1985206589
    //   3592: ixor
    //   3593: goto -> 3604
    //   3596: ldc2_w -108055737
    //   3599: l2i
    //   3600: ldc_w 1292372594
    //   3603: ixor
    //   3604: ldc2_w 1416319303
    //   3607: l2i
    //   3608: ldc_w -172933311
    //   3611: ixor
    //   3612: ixor
    //   3613: lookupswitch default -> 17210, 358438707 -> 3640, 408310819 -> 3596
    //   3640: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   3643: if_acmpne -> 3657
    //   3646: ldc2_w -1594295731
    //   3649: l2i
    //   3650: ldc_w -669648974
    //   3653: ixor
    //   3654: goto -> 3665
    //   3657: ldc2_w -2117754141
    //   3660: l2i
    //   3661: ldc_w -114774245
    //   3664: ixor
    //   3665: ldc2_w 1154459852
    //   3668: l2i
    //   3669: ldc_w 36327248
    //   3672: ixor
    //   3673: ixor
    //   3674: tableswitch default -> 3646, 1040771683 -> 3696, 1040771684 -> 4067
    //   3696: getstatic Perryc.0 : I
    //   3699: ifle -> 3713
    //   3702: ldc2_w 1951673942
    //   3705: l2i
    //   3706: ldc_w -14869050
    //   3709: ixor
    //   3710: goto -> 3721
    //   3713: ldc2_w 1735226411
    //   3716: l2i
    //   3717: ldc_w -1835621668
    //   3720: ixor
    //   3721: ldc2_w 692952446
    //   3724: l2i
    //   3725: ldc_w -1496569604
    //   3728: ixor
    //   3729: ixor
    //   3730: lookupswitch default -> 3756, -1947495732 -> 3713, 80250386 -> 16884
    //   3756: aload_0
    //   3757: getstatic Perryc.c : I
    //   3760: iflt -> 3774
    //   3763: ldc2_w -214842431
    //   3766: l2i
    //   3767: ldc_w 1329968075
    //   3770: ixor
    //   3771: goto -> 3782
    //   3774: ldc2_w -1834043270
    //   3777: l2i
    //   3778: ldc_w -433093692
    //   3781: ixor
    //   3782: ldc2_w 148851191
    //   3785: l2i
    //   3786: ldc_w -806462898
    //   3789: ixor
    //   3790: ixor
    //   3791: lookupswitch default -> 16938, -1280301049 -> 3816, 2068145075 -> 3774
    //   3816: getfield crystals : I
    //   3819: ifne -> 3833
    //   3822: ldc2_w 1815146929
    //   3825: l2i
    //   3826: ldc_w -738359053
    //   3829: ixor
    //   3830: goto -> 3841
    //   3833: ldc2_w 1164784548
    //   3836: l2i
    //   3837: ldc_w -90158363
    //   3840: ixor
    //   3841: ldc2_w 1289721354
    //   3844: l2i
    //   3845: ldc_w 2059003881
    //   3848: ixor
    //   3849: ixor
    //   3850: tableswitch default -> 3822, -1985279839 -> 3872, -1985279838 -> 4067
    //   3872: getstatic Perryc.0 : I
    //   3875: ifle -> 3889
    //   3878: ldc2_w -256210319
    //   3881: l2i
    //   3882: ldc_w -743936538
    //   3885: ixor
    //   3886: goto -> 3897
    //   3889: ldc2_w -1938075054
    //   3892: l2i
    //   3893: ldc_w 307226775
    //   3896: ixor
    //   3897: ldc2_w 334146480
    //   3900: l2i
    //   3901: ldc_w -1272027556
    //   3904: ixor
    //   3905: ixor
    //   3906: lookupswitch default -> 16876, -2066339205 -> 3889, 972060457 -> 3932
    //   3932: aload_0
    //   3933: getstatic Perryc.c : I
    //   3936: iflt -> 3950
    //   3939: ldc2_w 2053685725
    //   3942: l2i
    //   3943: ldc_w 982209856
    //   3946: ixor
    //   3947: goto -> 3958
    //   3950: ldc2_w -595351291
    //   3953: l2i
    //   3954: ldc_w 392643941
    //   3957: ixor
    //   3958: ldc2_w 1631788137
    //   3961: l2i
    //   3962: ldc_w 573062897
    //   3965: ixor
    //   3966: ixor
    //   3967: lookupswitch default -> 16896, -2003841288 -> 3992, 59291141 -> 3950
    //   3992: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   3995: getstatic Perryc.c : I
    //   3998: iflt -> 4012
    //   4001: ldc2_w -833751606
    //   4004: l2i
    //   4005: ldc_w 1836997656
    //   4008: ixor
    //   4009: goto -> 4020
    //   4012: ldc2_w 1186898275
    //   4015: l2i
    //   4016: ldc_w 33296239
    //   4019: ixor
    //   4020: ldc2_w -1731185298
    //   4023: l2i
    //   4024: ldc_w 1759091753
    //   4027: ixor
    //   4028: ixor
    //   4029: lookupswitch default -> 16872, -1219819701 -> 4056, 1396310165 -> 4012
    //   4056: goto -> 4060
    //   4059: athrow
    //   4060: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;)V
    //   4063: goto -> 4067
    //   4066: athrow
    //   4067: getstatic Perryc.c : I
    //   4070: iflt -> 4084
    //   4073: ldc2_w -1208994430
    //   4076: l2i
    //   4077: ldc_w -2048260542
    //   4080: ixor
    //   4081: goto -> 4092
    //   4084: ldc2_w 1291039721
    //   4087: l2i
    //   4088: ldc_w 845127664
    //   4091: ixor
    //   4092: ldc2_w 475030509
    //   4095: l2i
    //   4096: ldc_w 455754564
    //   4099: ixor
    //   4100: ixor
    //   4101: lookupswitch default -> 17166, 895488873 -> 4084, 2044071088 -> 4128
    //   4128: aload_0
    //   4129: getstatic Perryc.0 : I
    //   4132: ifle -> 4146
    //   4135: ldc2_w 9095601
    //   4138: l2i
    //   4139: ldc_w -1824474094
    //   4142: ixor
    //   4143: goto -> 4154
    //   4146: ldc2_w -220174006
    //   4149: l2i
    //   4150: ldc_w -287999690
    //   4153: ixor
    //   4154: ldc2_w -557707972
    //   4157: l2i
    //   4158: ldc_w 544218718
    //   4161: ixor
    //   4162: ixor
    //   4163: lookupswitch default -> 17142, -494468322 -> 4188, 1836607169 -> 4146
    //   4188: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   4191: getstatic Perryc.0 : I
    //   4194: ifle -> 4208
    //   4197: ldc2_w -1183731569
    //   4200: l2i
    //   4201: ldc_w -608325726
    //   4204: ixor
    //   4205: goto -> 4216
    //   4208: ldc2_w 14057068
    //   4211: l2i
    //   4212: ldc_w 1505852002
    //   4215: ixor
    //   4216: ldc2_w 274273428
    //   4219: l2i
    //   4220: ldc_w -1816300608
    //   4223: ixor
    //   4224: ixor
    //   4225: lookupswitch default -> 16934, -621583526 -> 4252, -517441415 -> 4208
    //   4252: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   4255: if_acmpne -> 4269
    //   4258: ldc2_w -322881232
    //   4261: l2i
    //   4262: ldc_w 495004972
    //   4265: ixor
    //   4266: goto -> 4277
    //   4269: ldc2_w 371987985
    //   4272: l2i
    //   4273: ldc_w -412351988
    //   4276: ixor
    //   4277: ldc2_w 468021565
    //   4280: l2i
    //   4281: ldc_w -973294343
    //   4284: ixor
    //   4285: ixor
    //   4286: tableswitch default -> 4258, 794415576 -> 4308, 794415577 -> 6207
    //   4308: getstatic Perryc.1 : I
    //   4311: ifeq -> 4325
    //   4314: ldc2_w -264454663
    //   4317: l2i
    //   4318: ldc_w -1806588809
    //   4321: ixor
    //   4322: goto -> 4333
    //   4325: ldc2_w -1491729128
    //   4328: l2i
    //   4329: ldc_w -520829438
    //   4332: ixor
    //   4333: ldc2_w 474646282
    //   4336: l2i
    //   4337: ldc_w 2015357846
    //   4340: ixor
    //   4341: ixor
    //   4342: lookupswitch default -> 16984, 3699986 -> 4325, 599240582 -> 4368
    //   4368: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   4371: getstatic Perryc.0 : I
    //   4374: ifle -> 4388
    //   4377: ldc2_w 189303711
    //   4380: l2i
    //   4381: ldc_w 575434651
    //   4384: ixor
    //   4385: goto -> 4396
    //   4388: ldc2_w 1154570791
    //   4391: l2i
    //   4392: ldc_w -387397426
    //   4395: ixor
    //   4396: ldc2_w 1923577536
    //   4399: l2i
    //   4400: ldc_w -314698262
    //   4403: ixor
    //   4404: ixor
    //   4405: lookupswitch default -> 4432, -1231190226 -> 17130, -329909997 -> 4388
    //   4432: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4435: ldc2_w 1715599599
    //   4438: l2i
    //   4439: ldc_w -1715599600
    //   4442: ixor
    //   4443: ldc2_w -1422640923
    //   4446: l2i
    //   4447: ldc_w -1422640923
    //   4450: ixor
    //   4451: getstatic Perryc.0 : I
    //   4454: ifle -> 4468
    //   4457: ldc2_w -1995315505
    //   4460: l2i
    //   4461: ldc_w 217629914
    //   4464: ixor
    //   4465: goto -> 4476
    //   4468: ldc2_w -2144982377
    //   4471: l2i
    //   4472: ldc_w 945365093
    //   4475: ixor
    //   4476: ldc2_w 936800681
    //   4479: l2i
    //   4480: ldc_w -205741632
    //   4483: ixor
    //   4484: ixor
    //   4485: lookupswitch default -> 16982, 1099166332 -> 4468, 2081807003 -> 4512
    //   4512: goto -> 4516
    //   4515: athrow
    //   4516: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   4519: goto -> 4523
    //   4522: athrow
    //   4523: ifne -> 4537
    //   4526: ldc2_w 1439796486
    //   4529: l2i
    //   4530: ldc_w 1294098830
    //   4533: ixor
    //   4534: goto -> 4545
    //   4537: ldc2_w -109925078
    //   4540: l2i
    //   4541: ldc_w -511622751
    //   4544: ixor
    //   4545: ldc2_w -954292784
    //   4548: l2i
    //   4549: ldc_w -1692405767
    //   4552: ixor
    //   4553: ixor
    //   4554: tableswitch default -> 4526, 1156753057 -> 4576, 1156753058 -> 5108
    //   4576: getstatic Perryc.c : I
    //   4579: iflt -> 4593
    //   4582: ldc2_w 1852392522
    //   4585: l2i
    //   4586: ldc_w 1578981464
    //   4589: ixor
    //   4590: goto -> 4601
    //   4593: ldc2_w -1814052092
    //   4596: l2i
    //   4597: ldc_w -2015013764
    //   4600: ixor
    //   4601: ldc2_w 172170057
    //   4604: l2i
    //   4605: ldc_w -945195651
    //   4608: ixor
    //   4609: ixor
    //   4610: lookupswitch default -> 4636, -39947738 -> 16904, 405894335 -> 4593
    //   4636: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   4639: getstatic Perryc.0 : I
    //   4642: ifle -> 4656
    //   4645: ldc2_w 623056018
    //   4648: l2i
    //   4649: ldc_w 1019597494
    //   4652: ixor
    //   4653: goto -> 4664
    //   4656: ldc2_w 1049305276
    //   4659: l2i
    //   4660: ldc_w 985220952
    //   4663: ixor
    //   4664: ldc2_w 260889509
    //   4667: l2i
    //   4668: ldc_w 919269201
    //   4671: ixor
    //   4672: ixor
    //   4673: lookupswitch default -> 4700, -1755627276 -> 4656, 547418832 -> 17154
    //   4700: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4703: ldc2_w 662625606
    //   4706: l2i
    //   4707: ldc_w 662625607
    //   4710: ixor
    //   4711: getstatic Perryc.0 : I
    //   4714: ifle -> 4728
    //   4717: ldc2_w -1096285963
    //   4720: l2i
    //   4721: ldc_w 1779743889
    //   4724: ixor
    //   4725: goto -> 4736
    //   4728: ldc2_w -728508647
    //   4731: l2i
    //   4732: ldc_w 389100892
    //   4735: ixor
    //   4736: ldc2_w -764334065
    //   4739: l2i
    //   4740: ldc_w -940600954
    //   4743: ixor
    //   4744: ixor
    //   4745: lookupswitch default -> 4772, -1054728723 -> 17036, 974936426 -> 4728
    //   4772: goto -> 4776
    //   4775: athrow
    //   4776: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   4779: goto -> 4783
    //   4782: athrow
    //   4783: getstatic Perryc.c : I
    //   4786: iflt -> 4800
    //   4789: ldc2_w 1080748324
    //   4792: l2i
    //   4793: ldc_w 328613218
    //   4796: ixor
    //   4797: goto -> 4808
    //   4800: ldc2_w 1542758166
    //   4803: l2i
    //   4804: ldc_w 1238077430
    //   4807: ixor
    //   4808: ldc2_w -560226499
    //   4811: l2i
    //   4812: ldc_w -370148166
    //   4815: ixor
    //   4816: ixor
    //   4817: lookupswitch default -> 17072, 625701735 -> 4844, 1686681537 -> 4800
    //   4844: aload_0
    //   4845: getstatic Perryc.c : I
    //   4848: iflt -> 4862
    //   4851: ldc2_w 1280140124
    //   4854: l2i
    //   4855: ldc_w 592707619
    //   4858: ixor
    //   4859: goto -> 4870
    //   4862: ldc2_w 414073974
    //   4865: l2i
    //   4866: ldc_w -657309920
    //   4869: ixor
    //   4870: ldc2_w -215719064
    //   4873: l2i
    //   4874: ldc_w -1279910977
    //   4877: ixor
    //   4878: ixor
    //   4879: lookupswitch default -> 17136, -2131885183 -> 4904, 797645736 -> 4862
    //   4904: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4907: getstatic Perryc.1 : I
    //   4910: ifeq -> 4924
    //   4913: ldc2_w -1038478494
    //   4916: l2i
    //   4917: ldc_w -1893508521
    //   4920: ixor
    //   4921: goto -> 4932
    //   4924: ldc2_w 168447498
    //   4927: l2i
    //   4928: ldc_w -1227453022
    //   4931: ixor
    //   4932: ldc2_w -978167258
    //   4935: l2i
    //   4936: ldc_w -1231738245
    //   4939: ixor
    //   4940: ixor
    //   4941: lookupswitch default -> 4968, -93776262 -> 4924, 1042168168 -> 16926
    //   4968: goto -> 4972
    //   4971: athrow
    //   4972: invokevirtual getValue : ()Ljava/lang/Object;
    //   4975: goto -> 4979
    //   4978: athrow
    //   4979: checkcast java/lang/Float
    //   4982: getstatic Perryc.0 : I
    //   4985: ifle -> 4999
    //   4988: ldc2_w 723792196
    //   4991: l2i
    //   4992: ldc_w -959613722
    //   4995: ixor
    //   4996: goto -> 5007
    //   4999: ldc2_w 2031375001
    //   5002: l2i
    //   5003: ldc_w -2005823514
    //   5006: ixor
    //   5007: ldc2_w 1965558603
    //   5010: l2i
    //   5011: ldc_w 1930209721
    //   5014: ixor
    //   5015: ixor
    //   5016: lookupswitch default -> 17116, -338827440 -> 4999, -146702451 -> 5044
    //   5044: goto -> 5048
    //   5047: athrow
    //   5048: invokevirtual floatValue : ()F
    //   5051: goto -> 5055
    //   5054: athrow
    //   5055: fcmpg
    //   5056: ifle -> 5070
    //   5059: ldc2_w -1493717506
    //   5062: l2i
    //   5063: ldc_w -927637248
    //   5066: ixor
    //   5067: goto -> 5078
    //   5070: ldc2_w -1646046883
    //   5073: l2i
    //   5074: ldc_w -207512158
    //   5077: ixor
    //   5078: ldc2_w -1536853671
    //   5081: l2i
    //   5082: ldc_w -471813425
    //   5085: ixor
    //   5086: ixor
    //   5087: tableswitch default -> 5059, 700909416 -> 5108, 700909417 -> 5640
    //   5108: getstatic Perryc.c : I
    //   5111: iflt -> 5125
    //   5114: ldc2_w -1386070452
    //   5117: l2i
    //   5118: ldc_w 1069916893
    //   5121: ixor
    //   5122: goto -> 5133
    //   5125: ldc2_w 747398648
    //   5128: l2i
    //   5129: ldc_w 2070416862
    //   5132: ixor
    //   5133: ldc2_w 1509838275
    //   5136: l2i
    //   5137: ldc_w 332998455
    //   5140: ixor
    //   5141: ixor
    //   5142: lookupswitch default -> 17122, -662636955 -> 5125, 499319506 -> 5168
    //   5168: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   5171: getstatic Perryc.1 : I
    //   5174: ifeq -> 5188
    //   5177: ldc2_w 2131478444
    //   5180: l2i
    //   5181: ldc_w -985253806
    //   5184: ixor
    //   5185: goto -> 5196
    //   5188: ldc2_w 408276326
    //   5191: l2i
    //   5192: ldc_w -1973487314
    //   5195: ixor
    //   5196: ldc2_w -1982968484
    //   5199: l2i
    //   5200: ldc_w 1237593862
    //   5203: ixor
    //   5204: ixor
    //   5205: lookupswitch default -> 16888, 1375819282 -> 5232, 2051513764 -> 5188
    //   5232: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5235: ldc2_w -1543176995
    //   5238: l2i
    //   5239: ldc_w -1543176996
    //   5242: ixor
    //   5243: getstatic Perryc.0 : I
    //   5246: ifle -> 5260
    //   5249: ldc2_w -1530539010
    //   5252: l2i
    //   5253: ldc_w -649199278
    //   5256: ixor
    //   5257: goto -> 5268
    //   5260: ldc2_w -860166520
    //   5263: l2i
    //   5264: ldc_w 514904738
    //   5267: ixor
    //   5268: ldc2_w -570099592
    //   5271: l2i
    //   5272: ldc_w 725274775
    //   5275: ixor
    //   5276: ixor
    //   5277: lookupswitch default -> 5304, -2001339837 -> 17074, 1475869121 -> 5260
    //   5304: goto -> 5308
    //   5307: athrow
    //   5308: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   5311: goto -> 5315
    //   5314: athrow
    //   5315: getstatic Perryc.c : I
    //   5318: iflt -> 5332
    //   5321: ldc2_w -317453830
    //   5324: l2i
    //   5325: ldc_w -1127132087
    //   5328: ixor
    //   5329: goto -> 5340
    //   5332: ldc2_w -1199651830
    //   5335: l2i
    //   5336: ldc_w 368432721
    //   5339: ixor
    //   5340: ldc2_w 385987551
    //   5343: l2i
    //   5344: ldc_w -1943206022
    //   5347: ixor
    //   5348: ixor
    //   5349: lookupswitch default -> 5376, -890640106 -> 17056, -350023719 -> 5332
    //   5376: aload_0
    //   5377: getstatic Perryc.1 : I
    //   5380: ifeq -> 5394
    //   5383: ldc2_w -373090797
    //   5386: l2i
    //   5387: ldc_w -1930231605
    //   5390: ixor
    //   5391: goto -> 5402
    //   5394: ldc2_w -2101257779
    //   5397: l2i
    //   5398: ldc_w -467755529
    //   5401: ixor
    //   5402: ldc2_w -1021152509
    //   5405: l2i
    //   5406: ldc_w -2006115673
    //   5409: ixor
    //   5410: ixor
    //   5411: lookupswitch default -> 17096, 764456350 -> 5436, 780107644 -> 5394
    //   5436: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5439: getstatic Perryc.1 : I
    //   5442: ifeq -> 5456
    //   5445: ldc2_w -678891267
    //   5448: l2i
    //   5449: ldc_w -1268217106
    //   5452: ixor
    //   5453: goto -> 5464
    //   5456: ldc2_w 91516240
    //   5459: l2i
    //   5460: ldc_w 2052806333
    //   5463: ixor
    //   5464: ldc2_w -1918194195
    //   5467: l2i
    //   5468: ldc_w -1362466940
    //   5471: ixor
    //   5472: ixor
    //   5473: lookupswitch default -> 17150, 1082175610 -> 5456, 1548743044 -> 5500
    //   5500: goto -> 5504
    //   5503: athrow
    //   5504: invokevirtual getValue : ()Ljava/lang/Object;
    //   5507: goto -> 5511
    //   5510: athrow
    //   5511: checkcast java/lang/Float
    //   5514: getstatic Perryc.1 : I
    //   5517: ifeq -> 5531
    //   5520: ldc2_w 999559886
    //   5523: l2i
    //   5524: ldc_w -779893456
    //   5527: ixor
    //   5528: goto -> 5539
    //   5531: ldc2_w -513845485
    //   5534: l2i
    //   5535: ldc_w 1193018731
    //   5538: ixor
    //   5539: ldc2_w -243049691
    //   5542: l2i
    //   5543: ldc_w 678012382
    //   5546: ixor
    //   5547: ixor
    //   5548: lookupswitch default -> 5576, 872229125 -> 17018, 1549573491 -> 5531
    //   5576: goto -> 5580
    //   5579: athrow
    //   5580: invokevirtual floatValue : ()F
    //   5583: goto -> 5587
    //   5586: athrow
    //   5587: fcmpg
    //   5588: ifgt -> 5602
    //   5591: ldc2_w 1182708989
    //   5594: l2i
    //   5595: ldc_w 1876039217
    //   5598: ixor
    //   5599: goto -> 5610
    //   5602: ldc2_w -137007049
    //   5605: l2i
    //   5606: ldc_w -562441478
    //   5609: ixor
    //   5610: ldc2_w -1729380824
    //   5613: l2i
    //   5614: ldc_w -1008277790
    //   5617: ixor
    //   5618: ixor
    //   5619: tableswitch default -> 5591, 1923217926 -> 5640, 1923217927 -> 6207
    //   5640: getstatic Perryc.1 : I
    //   5643: ifeq -> 5657
    //   5646: ldc2_w -1167115832
    //   5649: l2i
    //   5650: ldc_w -1956446884
    //   5653: ixor
    //   5654: goto -> 5665
    //   5657: ldc2_w -1272133754
    //   5660: l2i
    //   5661: ldc_w 1310901458
    //   5664: ixor
    //   5665: ldc2_w -1765086871
    //   5668: l2i
    //   5669: ldc_w -1036950158
    //   5672: ixor
    //   5673: ixor
    //   5674: lookupswitch default -> 5700, 479611129 -> 5657, 1710639247 -> 17120
    //   5700: aload_0
    //   5701: getstatic Perryc.1 : I
    //   5704: ifeq -> 5718
    //   5707: ldc2_w 422545814
    //   5710: l2i
    //   5711: ldc_w 1021165110
    //   5714: ixor
    //   5715: goto -> 5726
    //   5718: ldc2_w 1744968301
    //   5721: l2i
    //   5722: ldc_w 1578895551
    //   5725: ixor
    //   5726: ldc2_w 284267248
    //   5729: l2i
    //   5730: ldc_w 1488328962
    //   5733: ixor
    //   5734: ixor
    //   5735: lookupswitch default -> 5760, 1179527696 -> 5718, 1840626770 -> 17250
    //   5760: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   5763: getstatic Perryc.c : I
    //   5766: iflt -> 5780
    //   5769: ldc2_w 1286289976
    //   5772: l2i
    //   5773: ldc_w 430614424
    //   5776: ixor
    //   5777: goto -> 5788
    //   5780: ldc2_w 1234521626
    //   5783: l2i
    //   5784: ldc_w 293429126
    //   5787: ixor
    //   5788: ldc2_w -1645534201
    //   5791: l2i
    //   5792: ldc_w 265686179
    //   5795: ixor
    //   5796: ixor
    //   5797: lookupswitch default -> 17192, -952322812 -> 5780, -891995848 -> 5824
    //   5824: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   5827: if_acmpne -> 5841
    //   5830: ldc2_w 818715642
    //   5833: l2i
    //   5834: ldc_w 264473527
    //   5837: ixor
    //   5838: goto -> 5849
    //   5841: ldc2_w -1880720751
    //   5844: l2i
    //   5845: ldc_w -1326880035
    //   5848: ixor
    //   5849: ldc2_w 1308595336
    //   5852: l2i
    //   5853: ldc_w 1993461023
    //   5856: ixor
    //   5857: ixor
    //   5858: tableswitch default -> 5830, 69290458 -> 5880, 69290459 -> 6011
    //   5880: getstatic Perryc.1 : I
    //   5883: ifeq -> 5897
    //   5886: ldc2_w 688602979
    //   5889: l2i
    //   5890: ldc_w -939290553
    //   5893: ixor
    //   5894: goto -> 5905
    //   5897: ldc2_w -304404742
    //   5900: l2i
    //   5901: ldc_w -479105100
    //   5904: ixor
    //   5905: ldc2_w -1619157920
    //   5908: l2i
    //   5909: ldc_w 798778320
    //   5912: ixor
    //   5913: ixor
    //   5914: lookupswitch default -> 5940, 1374245012 -> 17176, 2146966617 -> 5897
    //   5940: aload_0
    //   5941: ldc2_w 1027262811
    //   5944: l2i
    //   5945: ldc_w 1027262810
    //   5948: ixor
    //   5949: getstatic Perryc.0 : I
    //   5952: ifle -> 5966
    //   5955: ldc2_w -436552629
    //   5958: l2i
    //   5959: ldc_w -113223759
    //   5962: ixor
    //   5963: goto -> 5974
    //   5966: ldc2_w 43481453
    //   5969: l2i
    //   5970: ldc_w -1769790175
    //   5973: ixor
    //   5974: ldc2_w 407431599
    //   5977: l2i
    //   5978: ldc_w -864352227
    //   5981: ixor
    //   5982: ixor
    //   5983: lookupswitch default -> 6008, -959161803 -> 5966, -930543032 -> 16964
    //   6008: putfield switchedForHealthReason : Z
    //   6011: getstatic Perryc.0 : I
    //   6014: ifle -> 6028
    //   6017: ldc2_w 1463400961
    //   6020: l2i
    //   6021: ldc_w -797342395
    //   6024: ixor
    //   6025: goto -> 6036
    //   6028: ldc2_w 1801430470
    //   6031: l2i
    //   6032: ldc_w -1720348665
    //   6035: ixor
    //   6036: ldc2_w -850370984
    //   6039: l2i
    //   6040: ldc_w 1759492475
    //   6043: ixor
    //   6044: ixor
    //   6045: lookupswitch default -> 16920, 584046695 -> 6028, 1470485218 -> 6072
    //   6072: aload_0
    //   6073: getstatic Perryc.0 : I
    //   6076: ifle -> 6090
    //   6079: ldc2_w -681418104
    //   6082: l2i
    //   6083: ldc_w -1529278338
    //   6086: ixor
    //   6087: goto -> 6098
    //   6090: ldc2_w 563734772
    //   6093: l2i
    //   6094: ldc_w -1090271652
    //   6097: ixor
    //   6098: ldc2_w -1913218258
    //   6101: l2i
    //   6102: ldc_w -1379524279
    //   6105: ixor
    //   6106: ixor
    //   6107: lookupswitch default -> 6132, 872977717 -> 6090, 1401669777 -> 17146
    //   6132: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   6135: getstatic Perryc.c : I
    //   6138: iflt -> 6152
    //   6141: ldc2_w -1633139773
    //   6144: l2i
    //   6145: ldc_w 396149731
    //   6148: ixor
    //   6149: goto -> 6160
    //   6152: ldc2_w -1493039093
    //   6155: l2i
    //   6156: ldc_w 1006656445
    //   6159: ixor
    //   6160: ldc2_w 436214612
    //   6163: l2i
    //   6164: ldc_w 327214940
    //   6167: ixor
    //   6168: ixor
    //   6169: lookupswitch default -> 6196, -2135655384 -> 17260, -291880176 -> 6152
    //   6196: goto -> 6200
    //   6199: athrow
    //   6200: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;)V
    //   6203: goto -> 6207
    //   6206: athrow
    //   6207: getstatic Perryc.1 : I
    //   6210: ifeq -> 6224
    //   6213: ldc2_w 158440739
    //   6216: l2i
    //   6217: ldc_w -745028472
    //   6220: ixor
    //   6221: goto -> 6232
    //   6224: ldc2_w -450604264
    //   6227: l2i
    //   6228: ldc_w 53331547
    //   6231: ixor
    //   6232: ldc2_w -926671346
    //   6235: l2i
    //   6236: ldc_w 831495750
    //   6239: ixor
    //   6240: ixor
    //   6241: lookupswitch default -> 16910, 524424459 -> 6268, 598596067 -> 6224
    //   6268: aload_0
    //   6269: getstatic Perryc.0 : I
    //   6272: ifle -> 6286
    //   6275: ldc2_w -846457050
    //   6278: l2i
    //   6279: ldc_w 1777708000
    //   6282: ixor
    //   6283: goto -> 6294
    //   6286: ldc2_w -463865246
    //   6289: l2i
    //   6290: ldc_w 1465580727
    //   6293: ixor
    //   6294: ldc2_w -754809696
    //   6297: l2i
    //   6298: ldc_w 1274481146
    //   6301: ixor
    //   6302: ixor
    //   6303: lookupswitch default -> 6328, -1006888738 -> 6286, 1015820700 -> 16988
    //   6328: getfield switchedForHealthReason : Z
    //   6331: ifeq -> 6345
    //   6334: ldc2_w 705230183
    //   6337: l2i
    //   6338: ldc_w -1241903579
    //   6341: ixor
    //   6342: goto -> 6353
    //   6345: ldc2_w 310021661
    //   6348: l2i
    //   6349: ldc_w -1920436898
    //   6352: ixor
    //   6353: ldc2_w -1414928924
    //   6356: l2i
    //   6357: ldc_w -196230384
    //   6360: ixor
    //   6361: ixor
    //   6362: tableswitch default -> 6334, -1072243274 -> 6384, -1072243273 -> 8043
    //   6384: getstatic Perryc.0 : I
    //   6387: ifle -> 6401
    //   6390: ldc2_w 1042957177
    //   6393: l2i
    //   6394: ldc_w 451517138
    //   6397: ixor
    //   6398: goto -> 6409
    //   6401: ldc2_w -1005831614
    //   6404: l2i
    //   6405: ldc_w -336193112
    //   6408: ixor
    //   6409: ldc2_w 1327269991
    //   6412: l2i
    //   6413: ldc_w 1572172430
    //   6416: ixor
    //   6417: ixor
    //   6418: lookupswitch default -> 6444, 912925506 -> 17084, 1998495526 -> 6401
    //   6444: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   6447: getstatic Perryc.1 : I
    //   6450: ifeq -> 6464
    //   6453: ldc2_w 1340786876
    //   6456: l2i
    //   6457: ldc_w 1686775793
    //   6460: ixor
    //   6461: goto -> 6472
    //   6464: ldc2_w -1991785269
    //   6467: l2i
    //   6468: ldc_w 2017296236
    //   6471: ixor
    //   6472: ldc2_w 247604970
    //   6475: l2i
    //   6476: ldc_w 906175150
    //   6479: ixor
    //   6480: ixor
    //   6481: lookupswitch default -> 16940, -910442525 -> 6508, 329378569 -> 6464
    //   6508: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6511: ldc2_w 1399364622
    //   6514: l2i
    //   6515: ldc_w -1399364623
    //   6518: ixor
    //   6519: ldc2_w 882228809
    //   6522: l2i
    //   6523: ldc_w 882228809
    //   6526: ixor
    //   6527: getstatic Perryc.1 : I
    //   6530: ifeq -> 6544
    //   6533: ldc2_w 1180932232
    //   6536: l2i
    //   6537: ldc_w -1739554905
    //   6540: ixor
    //   6541: goto -> 6552
    //   6544: ldc2_w -1203062011
    //   6547: l2i
    //   6548: ldc_w -2011881381
    //   6551: ixor
    //   6552: ldc2_w -924792688
    //   6555: l2i
    //   6556: ldc_w -1208462270
    //   6559: ixor
    //   6560: ixor
    //   6561: lookupswitch default -> 16998, -1590985731 -> 6544, 1330055052 -> 6588
    //   6588: goto -> 6592
    //   6591: athrow
    //   6592: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   6595: goto -> 6599
    //   6598: athrow
    //   6599: ifeq -> 6613
    //   6602: ldc2_w -1153848561
    //   6605: l2i
    //   6606: ldc_w 515092894
    //   6609: ixor
    //   6610: goto -> 6621
    //   6613: ldc2_w -339945740
    //   6616: l2i
    //   6617: ldc_w 1312214118
    //   6620: ixor
    //   6621: ldc2_w -2084579093
    //   6624: l2i
    //   6625: ldc_w -137239905
    //   6628: ixor
    //   6629: ixor
    //   6630: tableswitch default -> 6602, -773578523 -> 6652, -773578522 -> 7184
    //   6652: getstatic Perryc.1 : I
    //   6655: ifeq -> 6669
    //   6658: ldc2_w -1116181976
    //   6661: l2i
    //   6662: ldc_w -1689442378
    //   6665: ixor
    //   6666: goto -> 6677
    //   6669: ldc2_w 1568838837
    //   6672: l2i
    //   6673: ldc_w -695725643
    //   6676: ixor
    //   6677: ldc2_w 536417135
    //   6680: l2i
    //   6681: ldc_w -1766672427
    //   6684: ixor
    //   6685: ixor
    //   6686: lookupswitch default -> 6712, -1350637276 -> 16880, -1073644408 -> 6669
    //   6712: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   6715: getstatic Perryc.0 : I
    //   6718: ifle -> 6732
    //   6721: ldc2_w -1123861879
    //   6724: l2i
    //   6725: ldc_w -1131198175
    //   6728: ixor
    //   6729: goto -> 6740
    //   6732: ldc2_w -1492811153
    //   6735: l2i
    //   6736: ldc_w -1424895594
    //   6739: ixor
    //   6740: ldc2_w -53897487
    //   6743: l2i
    //   6744: ldc_w 1080316656
    //   6747: ixor
    //   6748: ixor
    //   6749: lookupswitch default -> 6776, -1120028759 -> 17068, 1872457412 -> 6732
    //   6776: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6779: ldc2_w 69124617
    //   6782: l2i
    //   6783: ldc_w 69124616
    //   6786: ixor
    //   6787: getstatic Perryc.0 : I
    //   6790: ifle -> 6804
    //   6793: ldc2_w -1242755203
    //   6796: l2i
    //   6797: ldc_w 1990088327
    //   6800: ixor
    //   6801: goto -> 6812
    //   6804: ldc2_w -1029409106
    //   6807: l2i
    //   6808: ldc_w 212650660
    //   6811: ixor
    //   6812: ldc2_w -922593509
    //   6815: l2i
    //   6816: ldc_w -2120899892
    //   6819: ixor
    //   6820: ixor
    //   6821: lookupswitch default -> 6848, -1947947987 -> 16974, -419313309 -> 6804
    //   6848: goto -> 6852
    //   6851: athrow
    //   6852: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   6855: goto -> 6859
    //   6858: athrow
    //   6859: getstatic Perryc.1 : I
    //   6862: ifeq -> 6876
    //   6865: ldc2_w -407436397
    //   6868: l2i
    //   6869: ldc_w 921721217
    //   6872: ixor
    //   6873: goto -> 6884
    //   6876: ldc2_w 852100650
    //   6879: l2i
    //   6880: ldc_w -482355470
    //   6883: ixor
    //   6884: ldc2_w -1170101945
    //   6887: l2i
    //   6888: ldc_w 411170092
    //   6891: ixor
    //   6892: ixor
    //   6893: lookupswitch default -> 17198, 1932889267 -> 6920, 1938228857 -> 6876
    //   6920: aload_0
    //   6921: getstatic Perryc.0 : I
    //   6924: ifle -> 6938
    //   6927: ldc2_w 115315836
    //   6930: l2i
    //   6931: ldc_w 1818713276
    //   6934: ixor
    //   6935: goto -> 6946
    //   6938: ldc2_w 1180031352
    //   6941: l2i
    //   6942: ldc_w 2055327778
    //   6945: ixor
    //   6946: ldc2_w 443869178
    //   6949: l2i
    //   6950: ldc_w 891597583
    //   6953: ixor
    //   6954: ixor
    //   6955: lookupswitch default -> 16962, 327441839 -> 6980, 1172872245 -> 6938
    //   6980: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6983: getstatic Perryc.0 : I
    //   6986: ifle -> 7000
    //   6989: ldc2_w -1576330681
    //   6992: l2i
    //   6993: ldc_w 513134160
    //   6996: ixor
    //   6997: goto -> 7008
    //   7000: ldc2_w -1040716599
    //   7003: l2i
    //   7004: ldc_w 1050504248
    //   7007: ixor
    //   7008: ldc2_w 688059356
    //   7011: l2i
    //   7012: ldc_w 1796402960
    //   7015: ixor
    //   7016: ixor
    //   7017: lookupswitch default -> 16942, -1116038083 -> 7044, -24196901 -> 7000
    //   7044: goto -> 7048
    //   7047: athrow
    //   7048: invokevirtual getValue : ()Ljava/lang/Object;
    //   7051: goto -> 7055
    //   7054: athrow
    //   7055: checkcast java/lang/Float
    //   7058: getstatic Perryc.c : I
    //   7061: iflt -> 7075
    //   7064: ldc2_w -328880390
    //   7067: l2i
    //   7068: ldc_w -455405213
    //   7071: ixor
    //   7072: goto -> 7083
    //   7075: ldc2_w 10990134
    //   7078: l2i
    //   7079: ldc_w -1009993515
    //   7082: ixor
    //   7083: ldc2_w -1447625073
    //   7086: l2i
    //   7087: ldc_w 706568143
    //   7090: ixor
    //   7091: ixor
    //   7092: lookupswitch default -> 17298, -1961550119 -> 7075, 1086368675 -> 7120
    //   7120: goto -> 7124
    //   7123: athrow
    //   7124: invokevirtual floatValue : ()F
    //   7127: goto -> 7131
    //   7130: athrow
    //   7131: fcmpl
    //   7132: ifgt -> 7146
    //   7135: ldc2_w 1179238638
    //   7138: l2i
    //   7139: ldc_w -972617821
    //   7142: ixor
    //   7143: goto -> 7154
    //   7146: ldc2_w -926738264
    //   7149: l2i
    //   7150: ldc_w 1217257446
    //   7153: ixor
    //   7154: ldc2_w 39665143
    //   7157: l2i
    //   7158: ldc_w 2147006651
    //   7161: ixor
    //   7162: ixor
    //   7163: tableswitch default -> 7135, -34913791 -> 7184, -34913790 -> 7716
    //   7184: getstatic Perryc.c : I
    //   7187: iflt -> 7201
    //   7190: ldc2_w -699013404
    //   7193: l2i
    //   7194: ldc_w -1604080715
    //   7197: ixor
    //   7198: goto -> 7209
    //   7201: ldc2_w -1443469662
    //   7204: l2i
    //   7205: ldc_w 1479531360
    //   7208: ixor
    //   7209: ldc2_w -53269167
    //   7212: l2i
    //   7213: ldc_w -2122517523
    //   7216: ixor
    //   7217: ixor
    //   7218: lookupswitch default -> 16886, -1938398338 -> 7244, 194614253 -> 7201
    //   7244: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   7247: getstatic Perryc.c : I
    //   7250: iflt -> 7264
    //   7253: ldc2_w 530511066
    //   7256: l2i
    //   7257: ldc_w -448581788
    //   7260: ixor
    //   7261: goto -> 7272
    //   7264: ldc2_w 134701169
    //   7267: l2i
    //   7268: ldc_w -467735751
    //   7271: ixor
    //   7272: ldc2_w -1580323838
    //   7275: l2i
    //   7276: ldc_w -2038215984
    //   7279: ixor
    //   7280: ixor
    //   7281: lookupswitch default -> 16892, -883626598 -> 7308, -577716884 -> 7264
    //   7308: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7311: ldc2_w -1909113969
    //   7314: l2i
    //   7315: ldc_w -1909113970
    //   7318: ixor
    //   7319: getstatic Perryc.0 : I
    //   7322: ifle -> 7336
    //   7325: ldc2_w 464417873
    //   7328: l2i
    //   7329: ldc_w -1849827682
    //   7332: ixor
    //   7333: goto -> 7344
    //   7336: ldc2_w 1524920538
    //   7339: l2i
    //   7340: ldc_w 574063905
    //   7343: ixor
    //   7344: ldc2_w -833089954
    //   7347: l2i
    //   7348: ldc_w -1763975416
    //   7351: ixor
    //   7352: ixor
    //   7353: lookupswitch default -> 7380, -2107987472 -> 7336, -762283111 -> 17058
    //   7380: goto -> 7384
    //   7383: athrow
    //   7384: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   7387: goto -> 7391
    //   7390: athrow
    //   7391: getstatic Perryc.c : I
    //   7394: iflt -> 7408
    //   7397: ldc2_w -1797909075
    //   7400: l2i
    //   7401: ldc_w -1651879068
    //   7404: ixor
    //   7405: goto -> 7416
    //   7408: ldc2_w 491004751
    //   7411: l2i
    //   7412: ldc_w -976240513
    //   7415: ixor
    //   7416: ldc2_w -636336708
    //   7419: l2i
    //   7420: ldc_w -1032065765
    //   7423: ixor
    //   7424: ixor
    //   7425: lookupswitch default -> 7452, 288747118 -> 17228, 2106322045 -> 7408
    //   7452: aload_0
    //   7453: getstatic Perryc.c : I
    //   7456: iflt -> 7470
    //   7459: ldc2_w 623915563
    //   7462: l2i
    //   7463: ldc_w -773683887
    //   7466: ixor
    //   7467: goto -> 7478
    //   7470: ldc2_w 1883109904
    //   7473: l2i
    //   7474: ldc_w -611240186
    //   7477: ixor
    //   7478: ldc2_w -1566492712
    //   7481: l2i
    //   7482: ldc_w 1074547556
    //   7485: ixor
    //   7486: ixor
    //   7487: lookupswitch default -> 17086, 377473990 -> 7470, 1224847786 -> 7512
    //   7512: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7515: getstatic Perryc.1 : I
    //   7518: ifeq -> 7532
    //   7521: ldc2_w -1928440770
    //   7524: l2i
    //   7525: ldc_w 543922416
    //   7528: ixor
    //   7529: goto -> 7540
    //   7532: ldc2_w 297062257
    //   7535: l2i
    //   7536: ldc_w 1128179289
    //   7539: ixor
    //   7540: ldc2_w 2054409063
    //   7543: l2i
    //   7544: ldc_w -532086387
    //   7547: ixor
    //   7548: ixor
    //   7549: lookupswitch default -> 17108, -927947838 -> 7576, 928974372 -> 7532
    //   7576: goto -> 7580
    //   7579: athrow
    //   7580: invokevirtual getValue : ()Ljava/lang/Object;
    //   7583: goto -> 7587
    //   7586: athrow
    //   7587: checkcast java/lang/Float
    //   7590: getstatic Perryc.0 : I
    //   7593: ifle -> 7607
    //   7596: ldc2_w -1776208058
    //   7599: l2i
    //   7600: ldc_w 531607628
    //   7603: ixor
    //   7604: goto -> 7615
    //   7607: ldc2_w 1170677611
    //   7610: l2i
    //   7611: ldc_w -1063073003
    //   7614: ixor
    //   7615: ldc2_w 1891636999
    //   7618: l2i
    //   7619: ldc_w 974864957
    //   7622: ixor
    //   7623: ixor
    //   7624: lookupswitch default -> 7652, -1017785808 -> 17048, -837861584 -> 7607
    //   7652: goto -> 7656
    //   7655: athrow
    //   7656: invokevirtual floatValue : ()F
    //   7659: goto -> 7663
    //   7662: athrow
    //   7663: fcmpl
    //   7664: ifle -> 7678
    //   7667: ldc2_w 1125579223
    //   7670: l2i
    //   7671: ldc_w -2015928667
    //   7674: ixor
    //   7675: goto -> 7686
    //   7678: ldc2_w -891923429
    //   7681: l2i
    //   7682: ldc_w 236450666
    //   7685: ixor
    //   7686: ldc2_w -60275
    //   7689: l2i
    //   7690: ldc_w 1145494518
    //   7693: ixor
    //   7694: ixor
    //   7695: tableswitch default -> 7667, 2138597385 -> 7716, 2138597386 -> 8043
    //   7716: getstatic Perryc.1 : I
    //   7719: ifeq -> 7733
    //   7722: ldc2_w -537553160
    //   7725: l2i
    //   7726: ldc_w 1753542264
    //   7729: ixor
    //   7730: goto -> 7741
    //   7733: ldc2_w 255028689
    //   7736: l2i
    //   7737: ldc_w 2006026006
    //   7740: ixor
    //   7741: ldc2_w 1484912476
    //   7744: l2i
    //   7745: ldc_w -944534996
    //   7748: ixor
    //   7749: ixor
    //   7750: lookupswitch default -> 17286, -409954377 -> 7776, 675481072 -> 7733
    //   7776: aload_0
    //   7777: getstatic Perryc.1 : I
    //   7780: ifeq -> 7794
    //   7783: ldc2_w -1576675731
    //   7786: l2i
    //   7787: ldc_w 1382758180
    //   7790: ixor
    //   7791: goto -> 7802
    //   7794: ldc2_w -68123867
    //   7797: l2i
    //   7798: ldc_w 972931263
    //   7801: ixor
    //   7802: ldc2_w 696319176
    //   7805: l2i
    //   7806: ldc_w -2016204418
    //   7809: ixor
    //   7810: ixor
    //   7811: lookupswitch default -> 7836, 650471947 -> 7794, 1581069567 -> 17078
    //   7836: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   7839: getstatic Perryc.1 : I
    //   7842: ifeq -> 7856
    //   7845: ldc2_w -1962424091
    //   7848: l2i
    //   7849: ldc_w -329222361
    //   7852: ixor
    //   7853: goto -> 7864
    //   7856: ldc2_w -1455990927
    //   7859: l2i
    //   7860: ldc_w -1882533127
    //   7863: ixor
    //   7864: ldc2_w 1815475470
    //   7867: l2i
    //   7868: ldc_w 675789996
    //   7871: ixor
    //   7872: ixor
    //   7873: lookupswitch default -> 17100, 588641888 -> 7856, 1653591082 -> 7900
    //   7900: goto -> 7904
    //   7903: athrow
    //   7904: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;)V
    //   7907: goto -> 7911
    //   7910: athrow
    //   7911: getstatic Perryc.1 : I
    //   7914: ifeq -> 7928
    //   7917: ldc2_w 301501208
    //   7920: l2i
    //   7921: ldc_w 342103763
    //   7924: ixor
    //   7925: goto -> 7936
    //   7928: ldc2_w 1307928461
    //   7931: l2i
    //   7932: ldc_w -541823756
    //   7935: ixor
    //   7936: ldc2_w 834298711
    //   7939: l2i
    //   7940: ldc_w -366241299
    //   7943: ixor
    //   7944: ixor
    //   7945: lookupswitch default -> 17124, -569546895 -> 7928, 1238430147 -> 7972
    //   7972: aload_0
    //   7973: ldc2_w 2061647129
    //   7976: l2i
    //   7977: ldc_w 2061647129
    //   7980: ixor
    //   7981: getstatic Perryc.c : I
    //   7984: iflt -> 7998
    //   7987: ldc2_w 578652513
    //   7990: l2i
    //   7991: ldc_w 1411636367
    //   7994: ixor
    //   7995: goto -> 8006
    //   7998: ldc2_w -1380878445
    //   8001: l2i
    //   8002: ldc_w 873200292
    //   8005: ixor
    //   8006: ldc2_w -388895668
    //   8009: l2i
    //   8010: ldc_w -1425042798
    //   8013: ixor
    //   8014: ixor
    //   8015: lookupswitch default -> 8040, -1403685447 -> 7998, 897592112 -> 17060
    //   8040: putfield switchedForHealthReason : Z
    //   8043: getstatic Perryc.c : I
    //   8046: iflt -> 8060
    //   8049: ldc2_w 1641213875
    //   8052: l2i
    //   8053: ldc_w 1170483199
    //   8056: ixor
    //   8057: goto -> 8068
    //   8060: ldc2_w -114783571
    //   8063: l2i
    //   8064: ldc_w 1566714768
    //   8067: ixor
    //   8068: ldc2_w -1923923879
    //   8071: l2i
    //   8072: ldc_w -1026615490
    //   8075: ixor
    //   8076: ixor
    //   8077: lookupswitch default -> 16858, -338233766 -> 8104, 1804246827 -> 8060
    //   8104: aload_0
    //   8105: getstatic Perryc.c : I
    //   8108: iflt -> 8122
    //   8111: ldc2_w 1845556101
    //   8114: l2i
    //   8115: ldc_w 254905941
    //   8118: ixor
    //   8119: goto -> 8130
    //   8122: ldc2_w -1936908173
    //   8125: l2i
    //   8126: ldc_w 1436104507
    //   8129: ixor
    //   8130: ldc2_w -1501661368
    //   8133: l2i
    //   8134: ldc_w 3803012
    //   8137: ixor
    //   8138: ixor
    //   8139: lookupswitch default -> 8164, -948630244 -> 17076, 2040027876 -> 8122
    //   8164: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   8167: getstatic Perryc.0 : I
    //   8170: ifle -> 8184
    //   8173: ldc2_w -1046471690
    //   8176: l2i
    //   8177: ldc_w -423191943
    //   8180: ixor
    //   8181: goto -> 8192
    //   8184: ldc2_w 613500649
    //   8187: l2i
    //   8188: ldc_w -1767206395
    //   8191: ixor
    //   8192: ldc2_w 330180089
    //   8195: l2i
    //   8196: ldc_w 395743507
    //   8199: ixor
    //   8200: ixor
    //   8201: lookupswitch default -> 8228, -901864289 -> 8184, 593376613 -> 16914
    //   8228: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   8231: if_acmpne -> 8245
    //   8234: ldc2_w -1571053182
    //   8237: l2i
    //   8238: ldc_w 759399188
    //   8241: ixor
    //   8242: goto -> 8253
    //   8245: ldc2_w -1666223359
    //   8248: l2i
    //   8249: ldc_w 330781078
    //   8252: ixor
    //   8253: ldc2_w 2035224034
    //   8256: l2i
    //   8257: ldc_w -1536844030
    //   8260: ixor
    //   8261: ixor
    //   8262: tableswitch default -> 8234, 1379053686 -> 8284, 1379053687 -> 10611
    //   8284: getstatic Perryc.1 : I
    //   8287: ifeq -> 8301
    //   8290: ldc2_w 446405510
    //   8293: l2i
    //   8294: ldc_w -191547891
    //   8297: ixor
    //   8298: goto -> 8309
    //   8301: ldc2_w 872212352
    //   8304: l2i
    //   8305: ldc_w -1717476672
    //   8308: ixor
    //   8309: ldc2_w -2147410882
    //   8312: l2i
    //   8313: ldc_w 1923280069
    //   8316: ixor
    //   8317: ixor
    //   8318: lookupswitch default -> 8344, -1638682298 -> 8301, 481123696 -> 17014
    //   8344: aload_0
    //   8345: getstatic Perryc.0 : I
    //   8348: ifle -> 8362
    //   8351: ldc2_w -2107024139
    //   8354: l2i
    //   8355: ldc_w -2108489318
    //   8358: ixor
    //   8359: goto -> 8370
    //   8362: ldc2_w -129155627
    //   8365: l2i
    //   8366: ldc_w 1970179031
    //   8369: ixor
    //   8370: ldc2_w -556953025
    //   8373: l2i
    //   8374: ldc_w 1175740254
    //   8377: ixor
    //   8378: ixor
    //   8379: lookupswitch default -> 8404, -1729916914 -> 17276, 1504174648 -> 8362
    //   8404: getfield armorCheck : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8407: getstatic Perryc.1 : I
    //   8410: ifeq -> 8424
    //   8413: ldc2_w 1661230225
    //   8416: l2i
    //   8417: ldc_w -1095196208
    //   8420: ixor
    //   8421: goto -> 8432
    //   8424: ldc2_w -2097881858
    //   8427: l2i
    //   8428: ldc_w -348868747
    //   8431: ixor
    //   8432: ldc2_w -413298836
    //   8435: l2i
    //   8436: ldc_w -310345118
    //   8439: ixor
    //   8440: ixor
    //   8441: lookupswitch default -> 8468, -681447345 -> 16908, 2030489823 -> 8424
    //   8468: goto -> 8472
    //   8471: athrow
    //   8472: invokevirtual getValue : ()Ljava/lang/Object;
    //   8475: goto -> 8479
    //   8478: athrow
    //   8479: checkcast java/lang/Boolean
    //   8482: getstatic Perryc.c : I
    //   8485: iflt -> 8499
    //   8488: ldc2_w 1609458618
    //   8491: l2i
    //   8492: ldc_w -143815317
    //   8495: ixor
    //   8496: goto -> 8507
    //   8499: ldc2_w -2064880615
    //   8502: l2i
    //   8503: ldc_w -2056737623
    //   8506: ixor
    //   8507: ldc2_w 664947185
    //   8510: l2i
    //   8511: ldc_w 990647313
    //   8514: ixor
    //   8515: ixor
    //   8516: lookupswitch default -> 17156, -1272073423 -> 8499, 489332048 -> 8544
    //   8544: goto -> 8548
    //   8547: athrow
    //   8548: invokevirtual booleanValue : ()Z
    //   8551: goto -> 8555
    //   8554: athrow
    //   8555: ifeq -> 8569
    //   8558: ldc2_w 1964303403
    //   8561: l2i
    //   8562: ldc_w -1589027755
    //   8565: ixor
    //   8566: goto -> 8577
    //   8569: ldc2_w -1541397234
    //   8572: l2i
    //   8573: ldc_w 1887280499
    //   8576: ixor
    //   8577: ldc2_w -362962977
    //   8580: l2i
    //   8581: ldc_w 1602136508
    //   8584: ixor
    //   8585: ixor
    //   8586: tableswitch default -> 8558, 1635683869 -> 8608, 1635683870 -> 10611
    //   8608: getstatic Perryc.c : I
    //   8611: iflt -> 8625
    //   8614: ldc2_w -416215994
    //   8617: l2i
    //   8618: ldc_w -1128390697
    //   8621: ixor
    //   8622: goto -> 8633
    //   8625: ldc2_w -664031878
    //   8628: l2i
    //   8629: ldc_w -1420826802
    //   8632: ixor
    //   8633: ldc2_w -1726970706
    //   8636: l2i
    //   8637: ldc_w -2064407123
    //   8640: ixor
    //   8641: ixor
    //   8642: lookupswitch default -> 17170, 1181495954 -> 8625, 1858562871 -> 8668
    //   8668: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   8671: getstatic Perryc.0 : I
    //   8674: ifle -> 8688
    //   8677: ldc2_w 1453999638
    //   8680: l2i
    //   8681: ldc_w -1366448049
    //   8684: ixor
    //   8685: goto -> 8696
    //   8688: ldc2_w 1321441591
    //   8691: l2i
    //   8692: ldc_w 11334514
    //   8695: ixor
    //   8696: ldc2_w 1370701332
    //   8699: l2i
    //   8700: ldc_w -1364906057
    //   8703: ixor
    //   8704: ixor
    //   8705: lookupswitch default -> 8732, 120717306 -> 17070, 646159375 -> 8688
    //   8732: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8735: getstatic Perryc.1 : I
    //   8738: ifeq -> 8752
    //   8741: ldc2_w 1585602200
    //   8744: l2i
    //   8745: ldc_w -534733502
    //   8748: ixor
    //   8749: goto -> 8760
    //   8752: ldc2_w 710496687
    //   8755: l2i
    //   8756: ldc_w -338288871
    //   8759: ixor
    //   8760: ldc2_w 1746719274
    //   8763: l2i
    //   8764: ldc_w -954161243
    //   8767: ixor
    //   8768: ixor
    //   8769: lookupswitch default -> 17034, 295614037 -> 8752, 1857239865 -> 8796
    //   8796: getstatic net/minecraft/inventory/EntityEquipmentSlot.CHEST : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   8799: getstatic Perryc.c : I
    //   8802: iflt -> 8816
    //   8805: ldc2_w 336444714
    //   8808: l2i
    //   8809: ldc_w -1402511068
    //   8812: ixor
    //   8813: goto -> 8824
    //   8816: ldc2_w -442056095
    //   8819: l2i
    //   8820: ldc_w -1663419087
    //   8823: ixor
    //   8824: ldc2_w 2012109593
    //   8827: l2i
    //   8828: ldc_w -1340473141
    //   8831: ixor
    //   8832: ixor
    //   8833: lookupswitch default -> 17186, -1098341246 -> 8860, 2141095900 -> 8816
    //   8860: goto -> 8864
    //   8863: athrow
    //   8864: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   8867: goto -> 8871
    //   8870: athrow
    //   8871: getstatic Perryc.c : I
    //   8874: iflt -> 8888
    //   8877: ldc2_w -299132540
    //   8880: l2i
    //   8881: ldc_w -2018584854
    //   8884: ixor
    //   8885: goto -> 8896
    //   8888: ldc2_w -538279278
    //   8891: l2i
    //   8892: ldc_w 599468067
    //   8895: ixor
    //   8896: ldc2_w -1393179196
    //   8899: l2i
    //   8900: ldc_w -667710896
    //   8903: ixor
    //   8904: ixor
    //   8905: lookupswitch default -> 17006, -2003311323 -> 8932, 490930426 -> 8888
    //   8932: goto -> 8936
    //   8935: athrow
    //   8936: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   8939: goto -> 8943
    //   8942: athrow
    //   8943: getstatic Perryc.1 : I
    //   8946: ifeq -> 8960
    //   8949: ldc2_w 596255350
    //   8952: l2i
    //   8953: ldc_w 711355576
    //   8956: ixor
    //   8957: goto -> 8968
    //   8960: ldc2_w -1390469168
    //   8963: l2i
    //   8964: ldc_w 401862885
    //   8967: ixor
    //   8968: ldc2_w -536169577
    //   8971: l2i
    //   8972: ldc_w 866383730
    //   8975: ixor
    //   8976: ixor
    //   8977: lookupswitch default -> 16922, -633009621 -> 8960, 1766173648 -> 9004
    //   9004: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   9007: if_acmpeq -> 9021
    //   9010: ldc2_w -95561900
    //   9013: l2i
    //   9014: ldc_w 2093910529
    //   9017: ixor
    //   9018: goto -> 9029
    //   9021: ldc2_w 544406147
    //   9024: l2i
    //   9025: ldc_w -1494112297
    //   9028: ixor
    //   9029: ldc2_w 363399505
    //   9032: l2i
    //   9033: ldc_w -431871194
    //   9036: ixor
    //   9037: ixor
    //   9038: tableswitch default -> 9010, 1969782562 -> 9060, 1969782563 -> 10416
    //   9060: getstatic Perryc.1 : I
    //   9063: ifeq -> 9077
    //   9066: ldc2_w 525431174
    //   9069: l2i
    //   9070: ldc_w -1730766223
    //   9073: ixor
    //   9074: goto -> 9085
    //   9077: ldc2_w 116425312
    //   9080: l2i
    //   9081: ldc_w 1766114959
    //   9084: ixor
    //   9085: ldc2_w 1600523637
    //   9088: l2i
    //   9089: ldc_w -1421619184
    //   9092: ixor
    //   9093: ixor
    //   9094: lookupswitch default -> 17296, -1684956790 -> 9120, 1940010642 -> 9077
    //   9120: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   9123: getstatic Perryc.1 : I
    //   9126: ifeq -> 9140
    //   9129: ldc2_w -256939040
    //   9132: l2i
    //   9133: ldc_w -1422315619
    //   9136: ixor
    //   9137: goto -> 9148
    //   9140: ldc2_w -377908319
    //   9143: l2i
    //   9144: ldc_w -566998499
    //   9147: ixor
    //   9148: ldc2_w -2104465462
    //   9151: l2i
    //   9152: ldc_w -353378585
    //   9155: ixor
    //   9156: ixor
    //   9157: lookupswitch default -> 17220, 870972752 -> 9140, 1597137041 -> 9184
    //   9184: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9187: getstatic Perryc.1 : I
    //   9190: ifeq -> 9204
    //   9193: ldc2_w 1335178793
    //   9196: l2i
    //   9197: ldc_w -1299403242
    //   9200: ixor
    //   9201: goto -> 9212
    //   9204: ldc2_w 870742766
    //   9207: l2i
    //   9208: ldc_w 151723641
    //   9211: ixor
    //   9212: ldc2_w -1685292409
    //   9215: l2i
    //   9216: ldc_w -1761843133
    //   9219: ixor
    //   9220: ixor
    //   9221: lookupswitch default -> 9248, -1981743800 -> 9204, -261518597 -> 16898
    //   9248: getstatic net/minecraft/inventory/EntityEquipmentSlot.HEAD : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   9251: getstatic Perryc.c : I
    //   9254: iflt -> 9268
    //   9257: ldc2_w 850398010
    //   9260: l2i
    //   9261: ldc_w 597721132
    //   9264: ixor
    //   9265: goto -> 9276
    //   9268: ldc2_w 1966621324
    //   9271: l2i
    //   9272: ldc_w -803677972
    //   9275: ixor
    //   9276: ldc2_w -648230280
    //   9279: l2i
    //   9280: ldc_w 1321497504
    //   9283: ixor
    //   9284: ixor
    //   9285: lookupswitch default -> 16936, -2037894450 -> 9268, 850928568 -> 9312
    //   9312: goto -> 9316
    //   9315: athrow
    //   9316: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   9319: goto -> 9323
    //   9322: athrow
    //   9323: getstatic Perryc.0 : I
    //   9326: ifle -> 9340
    //   9329: ldc2_w 1544943888
    //   9332: l2i
    //   9333: ldc_w -141307163
    //   9336: ixor
    //   9337: goto -> 9348
    //   9340: ldc2_w 1691004712
    //   9343: l2i
    //   9344: ldc_w 1151459886
    //   9347: ixor
    //   9348: ldc2_w 1854831480
    //   9351: l2i
    //   9352: ldc_w 1270968894
    //   9355: ixor
    //   9356: ixor
    //   9357: lookupswitch default -> 17064, -1899421005 -> 9340, 86262848 -> 9384
    //   9384: goto -> 9388
    //   9387: athrow
    //   9388: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   9391: goto -> 9395
    //   9394: athrow
    //   9395: getstatic Perryc.c : I
    //   9398: iflt -> 9412
    //   9401: ldc2_w 258301168
    //   9404: l2i
    //   9405: ldc_w 754321111
    //   9408: ixor
    //   9409: goto -> 9420
    //   9412: ldc2_w -811760669
    //   9415: l2i
    //   9416: ldc_w 673799956
    //   9419: ixor
    //   9420: ldc2_w 2005858904
    //   9423: l2i
    //   9424: ldc_w 2127502664
    //   9427: ixor
    //   9428: ixor
    //   9429: lookupswitch default -> 9456, 718454071 -> 17012, 1944406155 -> 9412
    //   9456: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   9459: if_acmpeq -> 9473
    //   9462: ldc2_w 1915669085
    //   9465: l2i
    //   9466: ldc_w 2084897028
    //   9469: ixor
    //   9470: goto -> 9481
    //   9473: ldc2_w -1736008263
    //   9476: l2i
    //   9477: ldc_w -1762830623
    //   9480: ixor
    //   9481: ldc2_w -786674854
    //   9484: l2i
    //   9485: ldc_w 1188189003
    //   9488: ixor
    //   9489: ixor
    //   9490: tableswitch default -> 9462, -1717185720 -> 9512, -1717185719 -> 10416
    //   9512: getstatic Perryc.1 : I
    //   9515: ifeq -> 9529
    //   9518: ldc2_w 441758220
    //   9521: l2i
    //   9522: ldc_w 2014787080
    //   9525: ixor
    //   9526: goto -> 9537
    //   9529: ldc2_w 573367099
    //   9532: l2i
    //   9533: ldc_w -623366671
    //   9536: ixor
    //   9537: ldc2_w 1730081658
    //   9540: l2i
    //   9541: ldc_w 1173319874
    //   9544: ixor
    //   9545: ixor
    //   9546: lookupswitch default -> 16958, -637186702 -> 9572, 1085409212 -> 9529
    //   9572: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   9575: getstatic Perryc.0 : I
    //   9578: ifle -> 9592
    //   9581: ldc2_w -1849054734
    //   9584: l2i
    //   9585: ldc_w -1523649655
    //   9588: ixor
    //   9589: goto -> 9600
    //   9592: ldc2_w -1533108002
    //   9595: l2i
    //   9596: ldc_w -1230375605
    //   9599: ixor
    //   9600: ldc2_w 1555959373
    //   9603: l2i
    //   9604: ldc_w -621191906
    //   9607: ixor
    //   9608: ixor
    //   9609: lookupswitch default -> 16866, -1804597562 -> 9636, -1298134744 -> 9592
    //   9636: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9639: getstatic Perryc.0 : I
    //   9642: ifle -> 9656
    //   9645: ldc2_w 81328976
    //   9648: l2i
    //   9649: ldc_w -1449847869
    //   9652: ixor
    //   9653: goto -> 9664
    //   9656: ldc2_w 1546642779
    //   9659: l2i
    //   9660: ldc_w -1140298660
    //   9663: ixor
    //   9664: ldc2_w -1839153223
    //   9667: l2i
    //   9668: ldc_w 1062983195
    //   9671: ixor
    //   9672: ixor
    //   9673: lookupswitch default -> 9700, -737585790 -> 9656, 7766321 -> 17000
    //   9700: getstatic net/minecraft/inventory/EntityEquipmentSlot.LEGS : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   9703: getstatic Perryc.c : I
    //   9706: iflt -> 9720
    //   9709: ldc2_w -2015905632
    //   9712: l2i
    //   9713: ldc_w -237695399
    //   9716: ixor
    //   9717: goto -> 9728
    //   9720: ldc2_w 1498737436
    //   9723: l2i
    //   9724: ldc_w -884901086
    //   9727: ixor
    //   9728: ldc2_w 1840884260
    //   9731: l2i
    //   9732: ldc_w -1127078441
    //   9735: ixor
    //   9736: ixor
    //   9737: lookupswitch default -> 9764, -1486276342 -> 17234, 412670896 -> 9720
    //   9764: goto -> 9768
    //   9767: athrow
    //   9768: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   9771: goto -> 9775
    //   9774: athrow
    //   9775: getstatic Perryc.1 : I
    //   9778: ifeq -> 9792
    //   9781: ldc2_w 1918181953
    //   9784: l2i
    //   9785: ldc_w 1817545814
    //   9788: ixor
    //   9789: goto -> 9800
    //   9792: ldc2_w -911545452
    //   9795: l2i
    //   9796: ldc_w -1333052975
    //   9799: ixor
    //   9800: ldc2_w 125135676
    //   9803: l2i
    //   9804: ldc_w 389447134
    //   9807: ixor
    //   9808: ixor
    //   9809: lookupswitch default -> 17114, 239319285 -> 9792, 1768080551 -> 9836
    //   9836: goto -> 9840
    //   9839: athrow
    //   9840: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   9843: goto -> 9847
    //   9846: athrow
    //   9847: getstatic Perryc.1 : I
    //   9850: ifeq -> 9864
    //   9853: ldc2_w -1021583337
    //   9856: l2i
    //   9857: ldc_w -815918099
    //   9860: ixor
    //   9861: goto -> 9872
    //   9864: ldc2_w -1895101030
    //   9867: l2i
    //   9868: ldc_w -1611510536
    //   9871: ixor
    //   9872: ldc2_w -1599017441
    //   9875: l2i
    //   9876: ldc_w -417936638
    //   9879: ixor
    //   9880: ixor
    //   9881: lookupswitch default -> 9908, -531251039 -> 9864, 1273222887 -> 16948
    //   9908: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   9911: if_acmpeq -> 9925
    //   9914: ldc2_w -4030427
    //   9917: l2i
    //   9918: ldc_w 1649207043
    //   9921: ixor
    //   9922: goto -> 9933
    //   9925: ldc2_w -1127537592
    //   9928: l2i
    //   9929: ldc_w 558187375
    //   9932: ixor
    //   9933: ldc2_w 213780724
    //   9936: l2i
    //   9937: ldc_w 358365088
    //   9940: ixor
    //   9941: ixor
    //   9942: tableswitch default -> 9914, -2073274254 -> 9964, -2073274253 -> 10416
    //   9964: getstatic Perryc.c : I
    //   9967: iflt -> 9981
    //   9970: ldc2_w -1624781548
    //   9973: l2i
    //   9974: ldc_w 235170895
    //   9977: ixor
    //   9978: goto -> 9989
    //   9981: ldc2_w 904460694
    //   9984: l2i
    //   9985: ldc_w 1609352576
    //   9988: ixor
    //   9989: ldc2_w 1712881247
    //   9992: l2i
    //   9993: ldc_w 2111762699
    //   9996: ixor
    //   9997: ixor
    //   9998: lookupswitch default -> 17266, -1964691953 -> 9981, 1908585282 -> 10024
    //   10024: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10027: getstatic Perryc.c : I
    //   10030: iflt -> 10044
    //   10033: ldc2_w 1674812590
    //   10036: l2i
    //   10037: ldc_w 82874065
    //   10040: ixor
    //   10041: goto -> 10052
    //   10044: ldc2_w 919554273
    //   10047: l2i
    //   10048: ldc_w 1352424760
    //   10051: ixor
    //   10052: ldc2_w 1286998291
    //   10055: l2i
    //   10056: ldc_w 1448076208
    //   10059: ixor
    //   10060: ixor
    //   10061: lookupswitch default -> 17214, 2091581306 -> 10088, 2111502556 -> 10044
    //   10088: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10091: getstatic Perryc.0 : I
    //   10094: ifle -> 10108
    //   10097: ldc2_w 214360136
    //   10100: l2i
    //   10101: ldc_w 2115348209
    //   10104: ixor
    //   10105: goto -> 10116
    //   10108: ldc2_w 1017946991
    //   10111: l2i
    //   10112: ldc_w 1252065960
    //   10115: ixor
    //   10116: ldc2_w 29257038
    //   10119: l2i
    //   10120: ldc_w -1967290139
    //   10123: ixor
    //   10124: ixor
    //   10125: lookupswitch default -> 17200, -103767278 -> 10108, -49396628 -> 10152
    //   10152: getstatic net/minecraft/inventory/EntityEquipmentSlot.FEET : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   10155: getstatic Perryc.c : I
    //   10158: iflt -> 10172
    //   10161: ldc2_w -34658923
    //   10164: l2i
    //   10165: ldc_w 770433732
    //   10168: ixor
    //   10169: goto -> 10180
    //   10172: ldc2_w 1151995174
    //   10175: l2i
    //   10176: ldc_w -1467539868
    //   10179: ixor
    //   10180: ldc2_w -332626223
    //   10183: l2i
    //   10184: ldc_w -608674340
    //   10187: ixor
    //   10188: ixor
    //   10189: lookupswitch default -> 17152, -608581553 -> 10216, -409985956 -> 10172
    //   10216: goto -> 10220
    //   10219: athrow
    //   10220: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   10223: goto -> 10227
    //   10226: athrow
    //   10227: getstatic Perryc.1 : I
    //   10230: ifeq -> 10244
    //   10233: ldc2_w -830679290
    //   10236: l2i
    //   10237: ldc_w -223140420
    //   10240: ixor
    //   10241: goto -> 10252
    //   10244: ldc2_w -2087820340
    //   10247: l2i
    //   10248: ldc_w 1743233992
    //   10251: ixor
    //   10252: ldc2_w -298236600
    //   10255: l2i
    //   10256: ldc_w -1510317983
    //   10259: ixor
    //   10260: ixor
    //   10261: lookupswitch default -> 16966, -1347754707 -> 10288, 1997330323 -> 10244
    //   10288: goto -> 10292
    //   10291: athrow
    //   10292: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   10295: goto -> 10299
    //   10298: athrow
    //   10299: getstatic Perryc.c : I
    //   10302: iflt -> 10316
    //   10305: ldc2_w -956759716
    //   10308: l2i
    //   10309: ldc_w 344122917
    //   10312: ixor
    //   10313: goto -> 10324
    //   10316: ldc2_w -311300305
    //   10319: l2i
    //   10320: ldc_w -313786151
    //   10323: ixor
    //   10324: ldc2_w 1600902628
    //   10327: l2i
    //   10328: ldc_w 1193736552
    //   10331: ixor
    //   10332: ixor
    //   10333: lookupswitch default -> 10360, -902378507 -> 17178, -158009959 -> 10316
    //   10360: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   10363: if_acmpne -> 10377
    //   10366: ldc2_w -1064598572
    //   10369: l2i
    //   10370: ldc_w -1771671223
    //   10373: ixor
    //   10374: goto -> 10385
    //   10377: ldc2_w -3803264
    //   10380: l2i
    //   10381: ldc_w -1456994846
    //   10384: ixor
    //   10385: ldc2_w -1043869983
    //   10388: l2i
    //   10389: ldc_w 702138627
    //   10392: ixor
    //   10393: ixor
    //   10394: tableswitch default -> 10366, -1091308161 -> 10416, -1091308160 -> 10611
    //   10416: getstatic Perryc.c : I
    //   10419: iflt -> 10433
    //   10422: ldc2_w 3071373
    //   10425: l2i
    //   10426: ldc_w 729912449
    //   10429: ixor
    //   10430: goto -> 10441
    //   10433: ldc2_w -1264459263
    //   10436: l2i
    //   10437: ldc_w -14739224
    //   10440: ixor
    //   10441: ldc2_w 455546929
    //   10444: l2i
    //   10445: ldc_w -1690060203
    //   10448: ixor
    //   10449: ixor
    //   10450: lookupswitch default -> 16950, -1412699288 -> 10433, -874882931 -> 10476
    //   10476: aload_0
    //   10477: getstatic Perryc.0 : I
    //   10480: ifle -> 10494
    //   10483: ldc2_w 1437299316
    //   10486: l2i
    //   10487: ldc_w -697404197
    //   10490: ixor
    //   10491: goto -> 10502
    //   10494: ldc2_w -56840469
    //   10497: l2i
    //   10498: ldc_w -1449244966
    //   10501: ixor
    //   10502: ldc2_w -580270669
    //   10505: l2i
    //   10506: ldc_w 2048996702
    //   10509: ixor
    //   10510: ixor
    //   10511: lookupswitch default -> 10536, 613283394 -> 17106, 999517062 -> 10494
    //   10536: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   10539: getstatic Perryc.0 : I
    //   10542: ifle -> 10556
    //   10545: ldc2_w -168226055
    //   10548: l2i
    //   10549: ldc_w -1863091896
    //   10552: ixor
    //   10553: goto -> 10564
    //   10556: ldc2_w -1021385284
    //   10559: l2i
    //   10560: ldc_w 912948055
    //   10563: ixor
    //   10564: ldc2_w -12819323
    //   10567: l2i
    //   10568: ldc_w -280142684
    //   10571: ixor
    //   10572: ixor
    //   10573: lookupswitch default -> 16916, -452614454 -> 10600, 1971016592 -> 10556
    //   10600: goto -> 10604
    //   10603: athrow
    //   10604: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;)V
    //   10607: goto -> 10611
    //   10610: athrow
    //   10611: getstatic Perryc.0 : I
    //   10614: ifle -> 10628
    //   10617: ldc2_w 1016048505
    //   10620: l2i
    //   10621: ldc_w 704457641
    //   10624: ixor
    //   10625: goto -> 10636
    //   10628: ldc2_w 2109725157
    //   10631: l2i
    //   10632: ldc_w 2040359725
    //   10635: ixor
    //   10636: ldc2_w -1354065121
    //   10639: l2i
    //   10640: ldc_w 456188620
    //   10643: ixor
    //   10644: ixor
    //   10645: lookupswitch default -> 10672, -1732830859 -> 10628, -1593247485 -> 17206
    //   10672: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10675: getstatic Perryc.1 : I
    //   10678: ifeq -> 10692
    //   10681: ldc2_w 936481289
    //   10684: l2i
    //   10685: ldc_w 1652864887
    //   10688: ixor
    //   10689: goto -> 10700
    //   10692: ldc2_w 568556466
    //   10695: l2i
    //   10696: ldc_w 1409467687
    //   10699: ixor
    //   10700: ldc2_w 339533212
    //   10703: l2i
    //   10704: ldc_w -1467783865
    //   10707: ixor
    //   10708: ixor
    //   10709: lookupswitch default -> 17282, -916584882 -> 10736, -370500187 -> 10692
    //   10736: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   10739: instanceof net/minecraft/client/gui/inventory/GuiContainer
    //   10742: ifeq -> 10756
    //   10745: ldc2_w 1399094441
    //   10748: l2i
    //   10749: ldc_w 1621700186
    //   10752: ixor
    //   10753: goto -> 10764
    //   10756: ldc2_w -2093465510
    //   10759: l2i
    //   10760: ldc_w -1326116178
    //   10763: ixor
    //   10764: ldc2_w 2143164536
    //   10767: l2i
    //   10768: ldc_w 922248016
    //   10771: ixor
    //   10772: ixor
    //   10773: tableswitch default -> 10745, 2055940571 -> 10796, 2055940572 -> 10981
    //   10796: getstatic Perryc.c : I
    //   10799: iflt -> 10813
    //   10802: ldc2_w 2109235837
    //   10805: l2i
    //   10806: ldc_w 1118484529
    //   10809: ixor
    //   10810: goto -> 10821
    //   10813: ldc2_w 1811605966
    //   10816: l2i
    //   10817: ldc_w 1920923150
    //   10820: ixor
    //   10821: ldc2_w -1890545923
    //   10824: l2i
    //   10825: ldc_w 81901828
    //   10828: ixor
    //   10829: ixor
    //   10830: lookupswitch default -> 10856, -1264325195 -> 17118, 720404709 -> 10813
    //   10856: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10859: getstatic Perryc.0 : I
    //   10862: ifle -> 10876
    //   10865: ldc2_w 1311303442
    //   10868: l2i
    //   10869: ldc_w 176003619
    //   10872: ixor
    //   10873: goto -> 10884
    //   10876: ldc2_w -37898253
    //   10879: l2i
    //   10880: ldc_w 905188657
    //   10883: ixor
    //   10884: ldc2_w 505973142
    //   10887: l2i
    //   10888: ldc_w 1125231275
    //   10891: ixor
    //   10892: ixor
    //   10893: lookupswitch default -> 10920, 426532364 -> 16870, 1177894967 -> 10876
    //   10920: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   10923: instanceof net/minecraft/client/gui/inventory/GuiInventory
    //   10926: ifne -> 10940
    //   10929: ldc2_w -1676983797
    //   10932: l2i
    //   10933: ldc_w -532610993
    //   10936: ixor
    //   10937: goto -> 10948
    //   10940: ldc2_w 1896393017
    //   10943: l2i
    //   10944: ldc_w 222489470
    //   10947: ixor
    //   10948: ldc2_w -1730729830
    //   10951: l2i
    //   10952: ldc_w 107723127
    //   10955: ixor
    //   10956: ixor
    //   10957: tableswitch default -> 10929, -487140439 -> 10980, -487140438 -> 10981
    //   10980: return
    //   10981: getstatic Perryc.1 : I
    //   10984: ifeq -> 10998
    //   10987: ldc2_w 131149223
    //   10990: l2i
    //   10991: ldc_w 476405297
    //   10994: ixor
    //   10995: goto -> 11006
    //   10998: ldc2_w -1256413651
    //   11001: l2i
    //   11002: ldc_w 869413228
    //   11005: ixor
    //   11006: ldc2_w 1666737443
    //   11009: l2i
    //   11010: ldc_w -1200762833
    //   11013: ixor
    //   11014: ixor
    //   11015: lookupswitch default -> 17208, -1065236838 -> 10998, 1576739405 -> 11040
    //   11040: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   11043: getstatic Perryc.0 : I
    //   11046: ifle -> 11060
    //   11049: ldc2_w -1417937079
    //   11052: l2i
    //   11053: ldc_w -210070439
    //   11056: ixor
    //   11057: goto -> 11068
    //   11060: ldc2_w 1477793070
    //   11063: l2i
    //   11064: ldc_w -2053939571
    //   11067: ixor
    //   11068: ldc2_w -650332703
    //   11071: l2i
    //   11072: ldc_w 2009024986
    //   11075: ixor
    //   11076: ixor
    //   11077: lookupswitch default -> 17230, -159213781 -> 11060, 1929770904 -> 11104
    //   11104: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11107: getstatic Perryc.0 : I
    //   11110: ifle -> 11124
    //   11113: ldc2_w 1580162573
    //   11116: l2i
    //   11117: ldc_w -1222497964
    //   11120: ixor
    //   11121: goto -> 11132
    //   11124: ldc2_w 1821270565
    //   11127: l2i
    //   11128: ldc_w 1511298346
    //   11131: ixor
    //   11132: ldc2_w 9679337
    //   11135: l2i
    //   11136: ldc_w -1703227621
    //   11139: ixor
    //   11140: ixor
    //   11141: lookupswitch default -> 17270, -1401714179 -> 11168, 1944324523 -> 11124
    //   11168: goto -> 11172
    //   11171: athrow
    //   11172: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   11175: goto -> 11179
    //   11178: athrow
    //   11179: getstatic Perryc.0 : I
    //   11182: ifle -> 11196
    //   11185: ldc2_w -1628026448
    //   11188: l2i
    //   11189: ldc_w -1684007267
    //   11192: ixor
    //   11193: goto -> 11204
    //   11196: ldc2_w 1755150022
    //   11199: l2i
    //   11200: ldc_w -737971427
    //   11203: ixor
    //   11204: ldc2_w -1109928127
    //   11207: l2i
    //   11208: ldc_w -1645108065
    //   11211: ixor
    //   11212: ixor
    //   11213: lookupswitch default -> 17008, -1665632763 -> 11240, 628108531 -> 11196
    //   11240: goto -> 11244
    //   11243: athrow
    //   11244: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   11247: goto -> 11251
    //   11250: athrow
    //   11251: getstatic Perryc.0 : I
    //   11254: ifle -> 11268
    //   11257: ldc2_w -1404311441
    //   11260: l2i
    //   11261: ldc_w 1725922889
    //   11264: ixor
    //   11265: goto -> 11276
    //   11268: ldc2_w 1552180786
    //   11271: l2i
    //   11272: ldc_w 1339389131
    //   11275: ixor
    //   11276: ldc2_w -391615589
    //   11279: l2i
    //   11280: ldc_w -2125907750
    //   11283: ixor
    //   11284: ixor
    //   11285: lookupswitch default -> 11312, -1760675552 -> 11268, -1552562841 -> 17174
    //   11312: astore_1
    //   11313: getstatic Perryc.c : I
    //   11316: iflt -> 11330
    //   11319: ldc2_w -385900439
    //   11322: l2i
    //   11323: ldc_w 1754852395
    //   11326: ixor
    //   11327: goto -> 11338
    //   11330: ldc2_w 1742293777
    //   11333: l2i
    //   11334: ldc_w -692460806
    //   11337: ixor
    //   11338: ldc2_w -316727712
    //   11341: l2i
    //   11342: ldc_w 391131314
    //   11345: ixor
    //   11346: ixor
    //   11347: lookupswitch default -> 11372, 944242710 -> 11330, 2049467024 -> 17144
    //   11372: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2$1.$SwitchMap$bigname$zprestige$webhack$features$modules$Combat$Offhand2$Mode2 : [I
    //   11375: getstatic Perryc.c : I
    //   11378: iflt -> 11392
    //   11381: ldc2_w -416819295
    //   11384: l2i
    //   11385: ldc_w -1277650853
    //   11388: ixor
    //   11389: goto -> 11400
    //   11392: ldc2_w -1170700490
    //   11395: l2i
    //   11396: ldc_w 1782219128
    //   11399: ixor
    //   11400: ldc2_w -1453096085
    //   11403: l2i
    //   11404: ldc_w -2073736879
    //   11407: ixor
    //   11408: ixor
    //   11409: lookupswitch default -> 17138, -50017164 -> 11436, 2046395840 -> 11392
    //   11436: aload_0
    //   11437: getstatic Perryc.1 : I
    //   11440: ifeq -> 11454
    //   11443: ldc2_w -1613686195
    //   11446: l2i
    //   11447: ldc_w -1275673654
    //   11450: ixor
    //   11451: goto -> 11462
    //   11454: ldc2_w 527287858
    //   11457: l2i
    //   11458: ldc_w 1515179377
    //   11461: ixor
    //   11462: ldc2_w 485963874
    //   11465: l2i
    //   11466: ldc_w -1932143102
    //   11469: ixor
    //   11470: ixor
    //   11471: lookupswitch default -> 11496, -1140508697 -> 16860, 653406754 -> 11454
    //   11496: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2$Mode2;
    //   11499: getstatic Perryc.0 : I
    //   11502: ifle -> 11516
    //   11505: ldc2_w -1586731726
    //   11508: l2i
    //   11509: ldc_w -120781421
    //   11512: ixor
    //   11513: goto -> 11524
    //   11516: ldc2_w -237911595
    //   11519: l2i
    //   11520: ldc_w -1004999385
    //   11523: ixor
    //   11524: ldc2_w 431319656
    //   11527: l2i
    //   11528: ldc_w -308688389
    //   11531: ixor
    //   11532: ixor
    //   11533: lookupswitch default -> 17226, -1383218382 -> 11516, -1041920159 -> 11560
    //   11560: goto -> 11564
    //   11563: athrow
    //   11564: invokevirtual ordinal : ()I
    //   11567: goto -> 11571
    //   11570: athrow
    //   11571: iaload
    //   11572: lookupswitch default -> 14246, 1 -> 11600, 2 -> 12922
    //   11600: getstatic Perryc.c : I
    //   11603: iflt -> 11617
    //   11606: ldc2_w -896214989
    //   11609: l2i
    //   11610: ldc_w 794849893
    //   11613: ixor
    //   11614: goto -> 11625
    //   11617: ldc2_w 1741381899
    //   11620: l2i
    //   11621: ldc_w -126368911
    //   11624: ixor
    //   11625: ldc2_w -2120848572
    //   11628: l2i
    //   11629: ldc_w 973187840
    //   11632: ixor
    //   11633: ixor
    //   11634: lookupswitch default -> 17172, 606822974 -> 11660, 1583573522 -> 11617
    //   11660: aload_0
    //   11661: getstatic Perryc.1 : I
    //   11664: ifeq -> 11678
    //   11667: ldc2_w 200258678
    //   11670: l2i
    //   11671: ldc_w 802985054
    //   11674: ixor
    //   11675: goto -> 11686
    //   11678: ldc2_w -1035785501
    //   11681: l2i
    //   11682: ldc_w 944477336
    //   11685: ixor
    //   11686: ldc2_w 659211111
    //   11689: l2i
    //   11690: ldc_w 1948375345
    //   11693: ixor
    //   11694: ixor
    //   11695: lookupswitch default -> 11720, -1281502337 -> 11678, 2002270846 -> 16924
    //   11720: getfield totems : I
    //   11723: ifgt -> 11737
    //   11726: ldc2_w -1354680614
    //   11729: l2i
    //   11730: ldc_w 1195868513
    //   11733: ixor
    //   11734: goto -> 11745
    //   11737: ldc2_w 1312619004
    //   11740: l2i
    //   11741: ldc_w -1506128320
    //   11744: ixor
    //   11745: ldc2_w 24988810
    //   11748: l2i
    //   11749: ldc_w -925647126
    //   11752: ixor
    //   11753: ixor
    //   11754: tableswitch default -> 11726, 564676059 -> 11776, 564676060 -> 11779
    //   11776: goto -> 15570
    //   11779: getstatic Perryc.1 : I
    //   11782: ifeq -> 11796
    //   11785: ldc2_w -1250194248
    //   11788: l2i
    //   11789: ldc_w 1771899497
    //   11792: ixor
    //   11793: goto -> 11804
    //   11796: ldc2_w -2000969673
    //   11799: l2i
    //   11800: ldc_w -121208652
    //   11803: ixor
    //   11804: ldc2_w 1931153366
    //   11807: l2i
    //   11808: ldc_w 1783709771
    //   11811: ixor
    //   11812: ixor
    //   11813: lookupswitch default -> 11840, -1733368676 -> 11796, -978532020 -> 17104
    //   11840: aload_0
    //   11841: getstatic Perryc.c : I
    //   11844: iflt -> 11858
    //   11847: ldc2_w -139174379
    //   11850: l2i
    //   11851: ldc_w 1331820926
    //   11854: ixor
    //   11855: goto -> 11866
    //   11858: ldc2_w 2067298652
    //   11861: l2i
    //   11862: ldc_w -1586736506
    //   11865: ixor
    //   11866: ldc2_w -2136439269
    //   11869: l2i
    //   11870: ldc_w -1104913012
    //   11873: ixor
    //   11874: ixor
    //   11875: lookupswitch default -> 11900, -2040955652 -> 17168, 1454001129 -> 11858
    //   11900: getfield holdingTotem : Z
    //   11903: ifeq -> 11917
    //   11906: ldc2_w -1030913927
    //   11909: l2i
    //   11910: ldc_w -1371073661
    //   11913: ixor
    //   11914: goto -> 11925
    //   11917: ldc2_w 1669336700
    //   11920: l2i
    //   11921: ldc_w 256548225
    //   11924: ixor
    //   11925: ldc2_w 622151409
    //   11928: l2i
    //   11929: ldc_w -868262520
    //   11932: ixor
    //   11933: ixor
    //   11934: tableswitch default -> 11906, -2048882557 -> 11956, -2048882556 -> 11959
    //   11956: goto -> 15570
    //   11959: getstatic Perryc.1 : I
    //   11962: ifeq -> 11976
    //   11965: ldc2_w -1249204437
    //   11968: l2i
    //   11969: ldc_w -974593776
    //   11972: ixor
    //   11973: goto -> 11984
    //   11976: ldc2_w 1332538306
    //   11979: l2i
    //   11980: ldc_w -470350418
    //   11983: ixor
    //   11984: ldc2_w -1417920722
    //   11987: l2i
    //   11988: ldc_w -949802829
    //   11991: ixor
    //   11992: ixor
    //   11993: lookupswitch default -> 17216, -1065027087 -> 12020, 477974950 -> 11976
    //   12020: aload_0
    //   12021: getstatic Perryc.c : I
    //   12024: iflt -> 12038
    //   12027: ldc2_w -13157345
    //   12030: l2i
    //   12031: ldc_w -1179028937
    //   12034: ixor
    //   12035: goto -> 12046
    //   12038: ldc2_w -2134804421
    //   12041: l2i
    //   12042: ldc_w -1708916134
    //   12045: ixor
    //   12046: ldc2_w -1443398826
    //   12049: l2i
    //   12050: ldc_w 1593977478
    //   12053: ixor
    //   12054: ixor
    //   12055: lookupswitch default -> 12080, -1334108168 -> 16912, 854481045 -> 12038
    //   12080: getstatic net/minecraft/init/Items.field_190929_cY : Lnet/minecraft/item/Item;
    //   12083: ldc2_w 1469989076
    //   12086: l2i
    //   12087: ldc_w 1469989076
    //   12090: ixor
    //   12091: getstatic Perryc.1 : I
    //   12094: ifeq -> 12108
    //   12097: ldc2_w -722398130
    //   12100: l2i
    //   12101: ldc_w 46223726
    //   12104: ixor
    //   12105: goto -> 12116
    //   12108: ldc2_w -770659779
    //   12111: l2i
    //   12112: ldc_w -1499531230
    //   12115: ixor
    //   12116: ldc2_w -828429799
    //   12119: l2i
    //   12120: ldc_w 1379312955
    //   12123: ixor
    //   12124: ixor
    //   12125: lookupswitch default -> 17252, -400040643 -> 12152, 1251592706 -> 12108
    //   12152: goto -> 12156
    //   12155: athrow
    //   12156: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   12159: goto -> 12163
    //   12162: athrow
    //   12163: getstatic Perryc.c : I
    //   12166: iflt -> 12180
    //   12169: ldc2_w 1638196054
    //   12172: l2i
    //   12173: ldc_w 1041027554
    //   12176: ixor
    //   12177: goto -> 12188
    //   12180: ldc2_w 1288610652
    //   12183: l2i
    //   12184: ldc_w 1624379648
    //   12187: ixor
    //   12188: ldc2_w -1031611034
    //   12191: l2i
    //   12192: ldc_w 2141001269
    //   12195: ixor
    //   12196: ixor
    //   12197: lookupswitch default -> 17232, -1862043377 -> 12224, -491259417 -> 12180
    //   12224: putfield lastTotemSlot : I
    //   12227: getstatic Perryc.c : I
    //   12230: iflt -> 12244
    //   12233: ldc2_w -108365378
    //   12236: l2i
    //   12237: ldc_w -107207829
    //   12240: ixor
    //   12241: goto -> 12252
    //   12244: ldc2_w 389759516
    //   12247: l2i
    //   12248: ldc_w 490719136
    //   12251: ixor
    //   12252: ldc2_w 302224028
    //   12255: l2i
    //   12256: ldc_w 71888305
    //   12259: ixor
    //   12260: ixor
    //   12261: lookupswitch default -> 16970, 375203320 -> 12244, 475003537 -> 12288
    //   12288: aload_0
    //   12289: getstatic Perryc.1 : I
    //   12292: ifeq -> 12306
    //   12295: ldc2_w -795219052
    //   12298: l2i
    //   12299: ldc_w -1416226027
    //   12302: ixor
    //   12303: goto -> 12314
    //   12306: ldc2_w 1656750319
    //   12309: l2i
    //   12310: ldc_w -1408620457
    //   12313: ixor
    //   12314: ldc2_w 1472971043
    //   12317: l2i
    //   12318: ldc_w -768432843
    //   12321: ixor
    //   12322: ixor
    //   12323: lookupswitch default -> 12348, -17394537 -> 17222, 1019825731 -> 12306
    //   12348: aload_1
    //   12349: getstatic Perryc.0 : I
    //   12352: ifle -> 12366
    //   12355: ldc2_w -2054179205
    //   12358: l2i
    //   12359: ldc_w 1199309528
    //   12362: ixor
    //   12363: goto -> 12374
    //   12366: ldc2_w -1382545758
    //   12369: l2i
    //   12370: ldc_w -1947858069
    //   12373: ixor
    //   12374: ldc2_w 220698441
    //   12377: l2i
    //   12378: ldc_w 1605085316
    //   12381: ixor
    //   12382: ixor
    //   12383: lookupswitch default -> 12408, -1870689426 -> 17126, 1376570991 -> 12366
    //   12408: aload_0
    //   12409: getstatic Perryc.1 : I
    //   12412: ifeq -> 12426
    //   12415: ldc2_w -1801078340
    //   12418: l2i
    //   12419: ldc_w 1673497208
    //   12422: ixor
    //   12423: goto -> 12434
    //   12426: ldc2_w -1100621636
    //   12429: l2i
    //   12430: ldc_w -1175779625
    //   12433: ixor
    //   12434: ldc2_w -2086909532
    //   12437: l2i
    //   12438: ldc_w 1336144676
    //   12441: ixor
    //   12442: ixor
    //   12443: lookupswitch default -> 17158, -877566741 -> 12468, 992315716 -> 12426
    //   12468: getfield lastTotemSlot : I
    //   12471: getstatic Perryc.0 : I
    //   12474: ifle -> 12488
    //   12477: ldc2_w 1325296354
    //   12480: l2i
    //   12481: ldc_w 1737962336
    //   12484: ixor
    //   12485: goto -> 12496
    //   12488: ldc2_w 968808856
    //   12491: l2i
    //   12492: ldc_w -1763855459
    //   12495: ixor
    //   12496: ldc2_w 1421089065
    //   12499: l2i
    //   12500: ldc_w 1742386679
    //   12503: ixor
    //   12504: ixor
    //   12505: lookupswitch default -> 17112, -1676818725 -> 12532, 436729180 -> 12488
    //   12532: goto -> 12536
    //   12535: athrow
    //   12536: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   12539: goto -> 12543
    //   12542: athrow
    //   12543: getstatic Perryc.0 : I
    //   12546: ifle -> 12560
    //   12549: ldc2_w 1506357546
    //   12552: l2i
    //   12553: ldc_w 33249648
    //   12556: ixor
    //   12557: goto -> 12568
    //   12560: ldc2_w 1768024184
    //   12563: l2i
    //   12564: ldc_w -780747255
    //   12567: ixor
    //   12568: ldc2_w -600518059
    //   12571: l2i
    //   12572: ldc_w -1693716391
    //   12575: ixor
    //   12576: ixor
    //   12577: lookupswitch default -> 12604, -195682351 -> 12560, 520964694 -> 16868
    //   12604: istore_2
    //   12605: getstatic Perryc.1 : I
    //   12608: ifeq -> 12622
    //   12611: ldc2_w -1488534371
    //   12614: l2i
    //   12615: ldc_w 1303184260
    //   12618: ixor
    //   12619: goto -> 12630
    //   12622: ldc2_w 7542135
    //   12625: l2i
    //   12626: ldc_w 1252692912
    //   12629: ixor
    //   12630: ldc2_w 972369974
    //   12633: l2i
    //   12634: ldc_w -551329197
    //   12637: ixor
    //   12638: ixor
    //   12639: lookupswitch default -> 12664, 189733311 -> 12622, 205362556 -> 17212
    //   12664: aload_0
    //   12665: getstatic Perryc.0 : I
    //   12668: ifle -> 12682
    //   12671: ldc2_w -1006522203
    //   12674: l2i
    //   12675: ldc_w -1703485197
    //   12678: ixor
    //   12679: goto -> 12690
    //   12682: ldc2_w 2044327802
    //   12685: l2i
    //   12686: ldc_w 119357649
    //   12689: ixor
    //   12690: ldc2_w -343429869
    //   12693: l2i
    //   12694: ldc_w 269539352
    //   12697: ixor
    //   12698: ixor
    //   12699: lookupswitch default -> 17042, -2058108256 -> 12724, -1512037027 -> 12682
    //   12724: aload_0
    //   12725: getstatic Perryc.c : I
    //   12728: iflt -> 12742
    //   12731: ldc2_w -111696359
    //   12734: l2i
    //   12735: ldc_w -2066882141
    //   12738: ixor
    //   12739: goto -> 12750
    //   12742: ldc2_w -1192236924
    //   12745: l2i
    //   12746: ldc_w 406249037
    //   12749: ixor
    //   12750: ldc2_w -309215326
    //   12753: l2i
    //   12754: ldc_w -1041853992
    //   12757: ixor
    //   12758: ixor
    //   12759: lookupswitch default -> 16986, -1934747469 -> 12784, 1374513600 -> 12742
    //   12784: getfield lastTotemSlot : I
    //   12787: getstatic Perryc.0 : I
    //   12790: ifle -> 12804
    //   12793: ldc2_w -651681655
    //   12796: l2i
    //   12797: ldc_w 1342094070
    //   12800: ixor
    //   12801: goto -> 12812
    //   12804: ldc2_w 1538500995
    //   12807: l2i
    //   12808: ldc_w 2018130476
    //   12811: ixor
    //   12812: ldc2_w -1182523395
    //   12815: l2i
    //   12816: ldc_w 2035740608
    //   12819: ixor
    //   12820: ixor
    //   12821: lookupswitch default -> 16882, -483695726 -> 12848, 1443129922 -> 12804
    //   12848: iload_2
    //   12849: getstatic Perryc.1 : I
    //   12852: ifeq -> 12866
    //   12855: ldc2_w -1975809032
    //   12858: l2i
    //   12859: ldc_w -572550247
    //   12862: ixor
    //   12863: goto -> 12874
    //   12866: ldc2_w 85921654
    //   12869: l2i
    //   12870: ldc_w 761564723
    //   12873: ixor
    //   12874: ldc2_w -1267144864
    //   12877: l2i
    //   12878: ldc_w 549889697
    //   12881: ixor
    //   12882: ixor
    //   12883: lookupswitch default -> 12908, -1369985938 -> 12866, -1017488992 -> 17246
    //   12908: goto -> 12912
    //   12911: athrow
    //   12912: invokespecial putItemInOffhand : (II)V
    //   12915: goto -> 12919
    //   12918: athrow
    //   12919: goto -> 15570
    //   12922: getstatic Perryc.0 : I
    //   12925: ifle -> 12939
    //   12928: ldc2_w 1201386286
    //   12931: l2i
    //   12932: ldc_w -1638528231
    //   12935: ixor
    //   12936: goto -> 12947
    //   12939: ldc2_w -326451641
    //   12942: l2i
    //   12943: ldc_w -1819155262
    //   12946: ixor
    //   12947: ldc2_w -472497073
    //   12950: l2i
    //   12951: ldc_w 1226368791
    //   12954: ixor
    //   12955: ixor
    //   12956: lookupswitch default -> 12984, -215057200 -> 12939, 1929583471 -> 17046
    //   12984: aload_0
    //   12985: getstatic Perryc.0 : I
    //   12988: ifle -> 13002
    //   12991: ldc2_w -2102269929
    //   12994: l2i
    //   12995: ldc_w 1222433187
    //   12998: ixor
    //   12999: goto -> 13010
    //   13002: ldc2_w 173158781
    //   13005: l2i
    //   13006: ldc_w 292385552
    //   13009: ixor
    //   13010: ldc2_w 486315426
    //   13013: l2i
    //   13014: ldc_w 2131974040
    //   13017: ixor
    //   13018: ixor
    //   13019: lookupswitch default -> 13044, -1451035762 -> 17284, 733442389 -> 13002
    //   13044: getfield gapples : I
    //   13047: ifgt -> 13061
    //   13050: ldc2_w -1836752858
    //   13053: l2i
    //   13054: ldc_w 1924506592
    //   13057: ixor
    //   13058: goto -> 13069
    //   13061: ldc2_w -156043620
    //   13064: l2i
    //   13065: ldc_w 377632089
    //   13068: ixor
    //   13069: ldc2_w -504411069
    //   13072: l2i
    //   13073: ldc_w -1719384012
    //   13076: ixor
    //   13077: ixor
    //   13078: tableswitch default -> 13050, -1738815567 -> 13100, -1738815566 -> 13103
    //   13100: goto -> 15570
    //   13103: getstatic Perryc.1 : I
    //   13106: ifeq -> 13120
    //   13109: ldc2_w -1464621214
    //   13112: l2i
    //   13113: ldc_w -472708852
    //   13116: ixor
    //   13117: goto -> 13128
    //   13120: ldc2_w -425545169
    //   13123: l2i
    //   13124: ldc_w 1995835655
    //   13127: ixor
    //   13128: ldc2_w -355130651
    //   13131: l2i
    //   13132: ldc_w -594677583
    //   13135: ixor
    //   13136: ixor
    //   13137: lookupswitch default -> 13164, -1023659572 -> 13120, 2100853818 -> 17304
    //   13164: aload_0
    //   13165: getstatic Perryc.c : I
    //   13168: iflt -> 13182
    //   13171: ldc2_w -2091716877
    //   13174: l2i
    //   13175: ldc_w -177245090
    //   13178: ixor
    //   13179: goto -> 13190
    //   13182: ldc2_w -1155443444
    //   13185: l2i
    //   13186: ldc_w 503579544
    //   13189: ixor
    //   13190: ldc2_w -625834540
    //   13193: l2i
    //   13194: ldc_w 145701948
    //   13197: ixor
    //   13198: ixor
    //   13199: lookupswitch default -> 13224, -1876223258 -> 13182, -1541397691 -> 17300
    //   13224: getfield holdingGapple : Z
    //   13227: ifeq -> 13241
    //   13230: ldc2_w 1405683780
    //   13233: l2i
    //   13234: ldc_w -1876910771
    //   13237: ixor
    //   13238: goto -> 13249
    //   13241: ldc2_w -159419599
    //   13244: l2i
    //   13245: ldc_w 899081785
    //   13248: ixor
    //   13249: ldc2_w -479828656
    //   13252: l2i
    //   13253: ldc_w -1497740795
    //   13256: ixor
    //   13257: ixor
    //   13258: tableswitch default -> 13230, -2043299236 -> 13280, -2043299235 -> 13283
    //   13280: goto -> 15570
    //   13283: getstatic Perryc.c : I
    //   13286: iflt -> 13300
    //   13289: ldc2_w 1777557493
    //   13292: l2i
    //   13293: ldc_w -2084533123
    //   13296: ixor
    //   13297: goto -> 13308
    //   13300: ldc2_w -654413144
    //   13303: l2i
    //   13304: ldc_w -1877997422
    //   13307: ixor
    //   13308: ldc2_w 605181623
    //   13311: l2i
    //   13312: ldc_w 353493676
    //   13315: ixor
    //   13316: ixor
    //   13317: lookupswitch default -> 16990, -617584749 -> 13300, 2045627937 -> 13344
    //   13344: aload_0
    //   13345: getstatic Perryc.0 : I
    //   13348: ifle -> 13362
    //   13351: ldc2_w -851987882
    //   13354: l2i
    //   13355: ldc_w 2083191983
    //   13358: ixor
    //   13359: goto -> 13370
    //   13362: ldc2_w 113402690
    //   13365: l2i
    //   13366: ldc_w -1073105633
    //   13369: ixor
    //   13370: ldc2_w -526374634
    //   13373: l2i
    //   13374: ldc_w -634930253
    //   13377: ixor
    //   13378: ixor
    //   13379: lookupswitch default -> 13404, -1952785316 -> 17062, -1778814878 -> 13362
    //   13404: getstatic net/minecraft/init/Items.field_151153_ao : Lnet/minecraft/item/Item;
    //   13407: ldc2_w 264919655
    //   13410: l2i
    //   13411: ldc_w 264919655
    //   13414: ixor
    //   13415: getstatic Perryc.0 : I
    //   13418: ifle -> 13432
    //   13421: ldc2_w -1983075765
    //   13424: l2i
    //   13425: ldc_w -2111212287
    //   13428: ixor
    //   13429: goto -> 13440
    //   13432: ldc2_w -1189210862
    //   13435: l2i
    //   13436: ldc_w -1865047646
    //   13439: ixor
    //   13440: ldc2_w 1366425547
    //   13443: l2i
    //   13444: ldc_w 1559514215
    //   13447: ixor
    //   13448: ixor
    //   13449: lookupswitch default -> 13476, -2059703867 -> 13432, 106982630 -> 16972
    //   13476: goto -> 13480
    //   13479: athrow
    //   13480: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   13483: goto -> 13487
    //   13486: athrow
    //   13487: getstatic Perryc.1 : I
    //   13490: ifeq -> 13504
    //   13493: ldc2_w -1528242392
    //   13496: l2i
    //   13497: ldc_w -986918361
    //   13500: ixor
    //   13501: goto -> 13512
    //   13504: ldc2_w -924454857
    //   13507: l2i
    //   13508: ldc_w -279043625
    //   13511: ixor
    //   13512: ldc2_w 15495973
    //   13515: l2i
    //   13516: ldc_w 360134789
    //   13519: ixor
    //   13520: ixor
    //   13521: lookupswitch default -> 13548, -1809751808 -> 13504, 1952401071 -> 17160
    //   13548: putfield lastGappleSlot : I
    //   13551: getstatic Perryc.0 : I
    //   13554: ifle -> 13568
    //   13557: ldc2_w -1892313776
    //   13560: l2i
    //   13561: ldc_w 2040519174
    //   13564: ixor
    //   13565: goto -> 13576
    //   13568: ldc2_w 203585127
    //   13571: l2i
    //   13572: ldc_w 1455329352
    //   13575: ixor
    //   13576: ldc2_w 1447849736
    //   13579: l2i
    //   13580: ldc_w 487713312
    //   13583: ixor
    //   13584: ixor
    //   13585: lookupswitch default -> 17184, -1107834242 -> 13568, 297886471 -> 13612
    //   13612: aload_0
    //   13613: getstatic Perryc.1 : I
    //   13616: ifeq -> 13630
    //   13619: ldc2_w 594760741
    //   13622: l2i
    //   13623: ldc_w 1871721572
    //   13626: ixor
    //   13627: goto -> 13638
    //   13630: ldc2_w 1695341090
    //   13633: l2i
    //   13634: ldc_w 1508841070
    //   13637: ixor
    //   13638: ldc2_w -641543196
    //   13641: l2i
    //   13642: ldc_w 142364796
    //   13645: ixor
    //   13646: ixor
    //   13647: lookupswitch default -> 17092, -1654791207 -> 13630, -312651820 -> 13672
    //   13672: aload_1
    //   13673: getstatic Perryc.1 : I
    //   13676: ifeq -> 13690
    //   13679: ldc2_w 1787066928
    //   13682: l2i
    //   13683: ldc_w 1576756279
    //   13686: ixor
    //   13687: goto -> 13698
    //   13690: ldc2_w 1743385467
    //   13693: l2i
    //   13694: ldc_w -40065551
    //   13697: ixor
    //   13698: ldc2_w -681268035
    //   13701: l2i
    //   13702: ldc_w -1682015627
    //   13705: ixor
    //   13706: ixor
    //   13707: lookupswitch default -> 13732, -1709125855 -> 13690, 2074462415 -> 16854
    //   13732: aload_0
    //   13733: getstatic Perryc.0 : I
    //   13736: ifle -> 13750
    //   13739: ldc2_w -645976560
    //   13742: l2i
    //   13743: ldc_w 986744795
    //   13746: ixor
    //   13747: goto -> 13758
    //   13750: ldc2_w 170403236
    //   13753: l2i
    //   13754: ldc_w 1017502100
    //   13757: ixor
    //   13758: ldc2_w -1341918129
    //   13761: l2i
    //   13762: ldc_w -2059021244
    //   13765: ixor
    //   13766: ixor
    //   13767: lookupswitch default -> 17204, -689337920 -> 13750, 63691835 -> 13792
    //   13792: getfield lastGappleSlot : I
    //   13795: getstatic Perryc.0 : I
    //   13798: ifle -> 13812
    //   13801: ldc2_w 996147015
    //   13804: l2i
    //   13805: ldc_w 1136665365
    //   13808: ixor
    //   13809: goto -> 13820
    //   13812: ldc2_w 1004360873
    //   13815: l2i
    //   13816: ldc_w 1339906216
    //   13819: ixor
    //   13820: ldc2_w 565867151
    //   13823: l2i
    //   13824: ldc_w 1746605269
    //   13827: ixor
    //   13828: ixor
    //   13829: lookupswitch default -> 17132, 826194440 -> 13812, 1033988699 -> 13856
    //   13856: goto -> 13860
    //   13859: athrow
    //   13860: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   13863: goto -> 13867
    //   13866: athrow
    //   13867: getstatic Perryc.c : I
    //   13870: iflt -> 13884
    //   13873: ldc2_w 326266671
    //   13876: l2i
    //   13877: ldc_w 1551910006
    //   13880: ixor
    //   13881: goto -> 13892
    //   13884: ldc2_w 1972253062
    //   13887: l2i
    //   13888: ldc_w 117090792
    //   13891: ixor
    //   13892: ldc2_w 170614252
    //   13895: l2i
    //   13896: ldc_w 1149329029
    //   13899: ixor
    //   13900: ixor
    //   13901: lookupswitch default -> 13928, -1668740482 -> 13884, 22554672 -> 17248
    //   13928: istore_2
    //   13929: getstatic Perryc.0 : I
    //   13932: ifle -> 13946
    //   13935: ldc2_w 1597704104
    //   13938: l2i
    //   13939: ldc_w -1378372722
    //   13942: ixor
    //   13943: goto -> 13954
    //   13946: ldc2_w 10578242
    //   13949: l2i
    //   13950: ldc_w -764279037
    //   13953: ixor
    //   13954: ldc2_w -569243936
    //   13957: l2i
    //   13958: ldc_w 1084113894
    //   13961: ixor
    //   13962: ixor
    //   13963: lookupswitch default -> 13988, 586044241 -> 13946, 1818292512 -> 17140
    //   13988: aload_0
    //   13989: getstatic Perryc.1 : I
    //   13992: ifeq -> 14006
    //   13995: ldc2_w -1659805618
    //   13998: l2i
    //   13999: ldc_w 1918015153
    //   14002: ixor
    //   14003: goto -> 14014
    //   14006: ldc2_w 1150955467
    //   14009: l2i
    //   14010: ldc_w -1771047250
    //   14013: ixor
    //   14014: ldc2_w -1852230478
    //   14017: l2i
    //   14018: ldc_w 778133518
    //   14021: ixor
    //   14022: ixor
    //   14023: lookupswitch default -> 14048, -1879566528 -> 14006, 1354474051 -> 17262
    //   14048: aload_0
    //   14049: getstatic Perryc.1 : I
    //   14052: ifeq -> 14066
    //   14055: ldc2_w 1306537982
    //   14058: l2i
    //   14059: ldc_w 361619937
    //   14062: ixor
    //   14063: goto -> 14074
    //   14066: ldc2_w -1660687252
    //   14069: l2i
    //   14070: ldc_w -260109732
    //   14073: ixor
    //   14074: ldc2_w 1146728450
    //   14077: l2i
    //   14078: ldc_w -1605084415
    //   14081: ixor
    //   14082: ixor
    //   14083: lookupswitch default -> 14108, -1134549732 -> 17288, -1123824227 -> 14066
    //   14108: getfield lastGappleSlot : I
    //   14111: getstatic Perryc.c : I
    //   14114: iflt -> 14128
    //   14117: ldc2_w 449364427
    //   14120: l2i
    //   14121: ldc_w 1763132962
    //   14124: ixor
    //   14125: goto -> 14136
    //   14128: ldc2_w 1890545605
    //   14131: l2i
    //   14132: ldc_w -1455059856
    //   14135: ixor
    //   14136: ldc2_w 1469920653
    //   14139: l2i
    //   14140: ldc_w 2071093860
    //   14143: ixor
    //   14144: ixor
    //   14145: lookupswitch default -> 16856, -184175524 -> 14172, 1597034496 -> 14128
    //   14172: iload_2
    //   14173: getstatic Perryc.c : I
    //   14176: iflt -> 14190
    //   14179: ldc2_w -1498546880
    //   14182: l2i
    //   14183: ldc_w 543636704
    //   14186: ixor
    //   14187: goto -> 14198
    //   14190: ldc2_w -989408242
    //   14193: l2i
    //   14194: ldc_w -2120926598
    //   14197: ixor
    //   14198: ldc2_w -283772609
    //   14201: l2i
    //   14202: ldc_w 767737493
    //   14205: ixor
    //   14206: ixor
    //   14207: lookupswitch default -> 17224, -2042320418 -> 14232, 1142785546 -> 14190
    //   14232: goto -> 14236
    //   14235: athrow
    //   14236: invokespecial putItemInOffhand : (II)V
    //   14239: goto -> 14243
    //   14242: athrow
    //   14243: goto -> 15570
    //   14246: getstatic Perryc.c : I
    //   14249: iflt -> 14263
    //   14252: ldc2_w -23693207
    //   14255: l2i
    //   14256: ldc_w -1024011737
    //   14259: ixor
    //   14260: goto -> 14271
    //   14263: ldc2_w 1276588255
    //   14266: l2i
    //   14267: ldc_w -58158461
    //   14270: ixor
    //   14271: ldc2_w 1312955204
    //   14274: l2i
    //   14275: ldc_w -1797960296
    //   14278: ixor
    //   14279: ixor
    //   14280: lookupswitch default -> 14308, -419955566 -> 17194, 9619518 -> 14263
    //   14308: aload_0
    //   14309: getstatic Perryc.1 : I
    //   14312: ifeq -> 14326
    //   14315: ldc2_w 1936829673
    //   14318: l2i
    //   14319: ldc_w 1194830426
    //   14322: ixor
    //   14323: goto -> 14334
    //   14326: ldc2_w 761900425
    //   14329: l2i
    //   14330: ldc_w 2036632040
    //   14333: ixor
    //   14334: ldc2_w 1784448573
    //   14337: l2i
    //   14338: ldc_w 691680614
    //   14341: ixor
    //   14342: ixor
    //   14343: lookupswitch default -> 14368, 1552106296 -> 14326, 1998632424 -> 17134
    //   14368: getfield crystals : I
    //   14371: ifgt -> 14385
    //   14374: ldc2_w 845967023
    //   14377: l2i
    //   14378: ldc_w 504528053
    //   14381: ixor
    //   14382: goto -> 14393
    //   14385: ldc2_w -931797154
    //   14388: l2i
    //   14389: ldc_w -468978363
    //   14392: ixor
    //   14393: ldc2_w 730590016
    //   14396: l2i
    //   14397: ldc_w 1138435540
    //   14400: ixor
    //   14401: ixor
    //   14402: tableswitch default -> 14374, 1143921806 -> 14424, 1143921807 -> 14427
    //   14424: goto -> 15570
    //   14427: getstatic Perryc.1 : I
    //   14430: ifeq -> 14444
    //   14433: ldc2_w 1374644620
    //   14436: l2i
    //   14437: ldc_w -2116875804
    //   14440: ixor
    //   14441: goto -> 14452
    //   14444: ldc2_w -1079572911
    //   14447: l2i
    //   14448: ldc_w 1348628707
    //   14451: ixor
    //   14452: ldc2_w -2069511047
    //   14455: l2i
    //   14456: ldc_w 283013740
    //   14459: ixor
    //   14460: ixor
    //   14461: lookupswitch default -> 16944, 1145558653 -> 14444, 2076098727 -> 14488
    //   14488: aload_0
    //   14489: getstatic Perryc.c : I
    //   14492: iflt -> 14506
    //   14495: ldc2_w 588030234
    //   14498: l2i
    //   14499: ldc_w 1053602569
    //   14502: ixor
    //   14503: goto -> 14514
    //   14506: ldc2_w -658403798
    //   14509: l2i
    //   14510: ldc_w 1708093541
    //   14513: ixor
    //   14514: ldc2_w 1677560216
    //   14517: l2i
    //   14518: ldc_w -586655335
    //   14521: ixor
    //   14522: ixor
    //   14523: lookupswitch default -> 17236, -1556757998 -> 14506, 66793038 -> 14548
    //   14548: getfield holdingCrystal : Z
    //   14551: ifeq -> 14565
    //   14554: ldc2_w -1230748892
    //   14557: l2i
    //   14558: ldc_w -752466186
    //   14561: ixor
    //   14562: goto -> 14573
    //   14565: ldc2_w -1478571191
    //   14568: l2i
    //   14569: ldc_w -1034105212
    //   14572: ixor
    //   14573: ldc2_w -1189399566
    //   14576: l2i
    //   14577: ldc_w 1231063151
    //   14580: ixor
    //   14581: ixor
    //   14582: tableswitch default -> 14554, -1778794929 -> 14604, -1778794928 -> 14607
    //   14604: goto -> 15570
    //   14607: getstatic Perryc.1 : I
    //   14610: ifeq -> 14624
    //   14613: ldc2_w -591562381
    //   14616: l2i
    //   14617: ldc_w -1646865579
    //   14620: ixor
    //   14621: goto -> 14632
    //   14624: ldc2_w 1755374594
    //   14627: l2i
    //   14628: ldc_w -1412118729
    //   14631: ixor
    //   14632: ldc2_w -536026355
    //   14635: l2i
    //   14636: ldc_w -1757018765
    //   14639: ixor
    //   14640: ixor
    //   14641: lookupswitch default -> 14668, 688060175 -> 14624, 908151896 -> 17182
    //   14668: aload_0
    //   14669: getstatic Perryc.1 : I
    //   14672: ifeq -> 14686
    //   14675: ldc2_w -1608967552
    //   14678: l2i
    //   14679: ldc_w -1886149253
    //   14682: ixor
    //   14683: goto -> 14694
    //   14686: ldc2_w -350879728
    //   14689: l2i
    //   14690: ldc_w -2129094777
    //   14693: ixor
    //   14694: ldc2_w 1621565063
    //   14697: l2i
    //   14698: ldc_w -2005152779
    //   14701: ixor
    //   14702: ixor
    //   14703: lookupswitch default -> 17028, -2100149531 -> 14728, -950637943 -> 14686
    //   14728: getstatic net/minecraft/init/Items.field_185158_cP : Lnet/minecraft/item/Item;
    //   14731: ldc2_w -409149532
    //   14734: l2i
    //   14735: ldc_w -409149532
    //   14738: ixor
    //   14739: getstatic Perryc.0 : I
    //   14742: ifle -> 14756
    //   14745: ldc2_w -1532366541
    //   14748: l2i
    //   14749: ldc_w -1083482470
    //   14752: ixor
    //   14753: goto -> 14764
    //   14756: ldc2_w -888010468
    //   14759: l2i
    //   14760: ldc_w 1394463659
    //   14763: ixor
    //   14764: ldc2_w -744490509
    //   14767: l2i
    //   14768: ldc_w -55237925
    //   14771: ixor
    //   14772: ixor
    //   14773: lookupswitch default -> 17264, -1222311521 -> 14800, 887649409 -> 14756
    //   14800: goto -> 14804
    //   14803: athrow
    //   14804: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   14807: goto -> 14811
    //   14810: athrow
    //   14811: getstatic Perryc.1 : I
    //   14814: ifeq -> 14828
    //   14817: ldc2_w 879985859
    //   14820: l2i
    //   14821: ldc_w 221835333
    //   14824: ixor
    //   14825: goto -> 14836
    //   14828: ldc2_w 2088596818
    //   14831: l2i
    //   14832: ldc_w 668599180
    //   14835: ixor
    //   14836: ldc2_w -287093273
    //   14839: l2i
    //   14840: ldc_w -1109371129
    //   14843: ixor
    //   14844: ixor
    //   14845: lookupswitch default -> 14872, 876368149 -> 14828, 1783131750 -> 17066
    //   14872: putfield lastCrystalSlot : I
    //   14875: getstatic Perryc.0 : I
    //   14878: ifle -> 14892
    //   14881: ldc2_w -1752124149
    //   14884: l2i
    //   14885: ldc_w 395410930
    //   14888: ixor
    //   14889: goto -> 14900
    //   14892: ldc2_w -1698473282
    //   14895: l2i
    //   14896: ldc_w -2106628203
    //   14899: ixor
    //   14900: ldc2_w -1755742397
    //   14903: l2i
    //   14904: ldc_w -1245471536
    //   14907: ixor
    //   14908: ixor
    //   14909: lookupswitch default -> 14936, -1566889110 -> 16954, 2037158987 -> 14892
    //   14936: aload_0
    //   14937: getstatic Perryc.0 : I
    //   14940: ifle -> 14954
    //   14943: ldc2_w 2108532866
    //   14946: l2i
    //   14947: ldc_w 1146039810
    //   14950: ixor
    //   14951: goto -> 14962
    //   14954: ldc2_w 18504170
    //   14957: l2i
    //   14958: ldc_w -1708014178
    //   14961: ixor
    //   14962: ldc2_w -1221354902
    //   14965: l2i
    //   14966: ldc_w -1400439738
    //   14969: ixor
    //   14970: ixor
    //   14971: lookupswitch default -> 17010, -2137064872 -> 14996, 576184492 -> 14954
    //   14996: aload_1
    //   14997: getstatic Perryc.0 : I
    //   15000: ifle -> 15014
    //   15003: ldc2_w 2030265606
    //   15006: l2i
    //   15007: ldc_w 128873720
    //   15010: ixor
    //   15011: goto -> 15022
    //   15014: ldc2_w 393509574
    //   15017: l2i
    //   15018: ldc_w 346648612
    //   15021: ixor
    //   15022: ldc2_w -1907129455
    //   15025: l2i
    //   15026: ldc_w -1518225330
    //   15029: ixor
    //   15030: ixor
    //   15031: lookupswitch default -> 15056, 1049774877 -> 15014, 1434397217 -> 16894
    //   15056: aload_0
    //   15057: getstatic Perryc.c : I
    //   15060: iflt -> 15074
    //   15063: ldc2_w -74104470
    //   15066: l2i
    //   15067: ldc_w -780586125
    //   15070: ixor
    //   15071: goto -> 15082
    //   15074: ldc2_w 1778820441
    //   15077: l2i
    //   15078: ldc_w -1927317185
    //   15081: ixor
    //   15082: ldc2_w -229656434
    //   15085: l2i
    //   15086: ldc_w -1051230050
    //   15089: ixor
    //   15090: ixor
    //   15091: lookupswitch default -> 16874, -738073482 -> 15116, 435440137 -> 15074
    //   15116: getfield lastCrystalSlot : I
    //   15119: getstatic Perryc.0 : I
    //   15122: ifle -> 15136
    //   15125: ldc2_w 1039847705
    //   15128: l2i
    //   15129: ldc_w -1512052028
    //   15132: ixor
    //   15133: goto -> 15144
    //   15136: ldc2_w 1699938939
    //   15139: l2i
    //   15140: ldc_w -1016261605
    //   15143: ixor
    //   15144: ldc2_w -1506457985
    //   15147: l2i
    //   15148: ldc_w -2050264470
    //   15151: ixor
    //   15152: ixor
    //   15153: lookupswitch default -> 15180, -1143271480 -> 16992, 151199069 -> 15136
    //   15180: goto -> 15184
    //   15183: athrow
    //   15184: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   15187: goto -> 15191
    //   15190: athrow
    //   15191: getstatic Perryc.c : I
    //   15194: iflt -> 15208
    //   15197: ldc2_w -315146617
    //   15200: l2i
    //   15201: ldc_w 1295546063
    //   15204: ixor
    //   15205: goto -> 15216
    //   15208: ldc2_w -487295200
    //   15211: l2i
    //   15212: ldc_w 349430037
    //   15215: ixor
    //   15216: ldc2_w 297612525
    //   15219: l2i
    //   15220: ldc_w -1932935942
    //   15223: ixor
    //   15224: ixor
    //   15225: lookupswitch default -> 17254, 1031520351 -> 15208, 1800609314 -> 15252
    //   15252: istore_2
    //   15253: getstatic Perryc.0 : I
    //   15256: ifle -> 15270
    //   15259: ldc2_w 1860378131
    //   15262: l2i
    //   15263: ldc_w 2101192267
    //   15266: ixor
    //   15267: goto -> 15278
    //   15270: ldc2_w -1151272707
    //   15273: l2i
    //   15274: ldc_w 302238949
    //   15277: ixor
    //   15278: ldc2_w -800017037
    //   15281: l2i
    //   15282: ldc_w -1982823847
    //   15285: ixor
    //   15286: ixor
    //   15287: lookupswitch default -> 15312, 765594663 -> 15270, 1247711090 -> 16890
    //   15312: aload_0
    //   15313: getstatic Perryc.c : I
    //   15316: iflt -> 15330
    //   15319: ldc2_w -496508981
    //   15322: l2i
    //   15323: ldc_w 1546817011
    //   15326: ixor
    //   15327: goto -> 15338
    //   15330: ldc2_w 1811193707
    //   15333: l2i
    //   15334: ldc_w -1784046272
    //   15337: ixor
    //   15338: ldc2_w -1881751832
    //   15341: l2i
    //   15342: ldc_w -1394767073
    //   15345: ixor
    //   15346: ixor
    //   15347: lookupswitch default -> 15372, -1654757425 -> 17258, 1715735826 -> 15330
    //   15372: aload_0
    //   15373: getstatic Perryc.0 : I
    //   15376: ifle -> 15390
    //   15379: ldc2_w 1453507718
    //   15382: l2i
    //   15383: ldc_w -1446445812
    //   15386: ixor
    //   15387: goto -> 15398
    //   15390: ldc2_w 1490813369
    //   15393: l2i
    //   15394: ldc_w -11169718
    //   15397: ixor
    //   15398: ldc2_w 355168976
    //   15401: l2i
    //   15402: ldc_w -803012198
    //   15405: ixor
    //   15406: ixor
    //   15407: lookupswitch default -> 15432, 979520192 -> 17188, 1106528040 -> 15390
    //   15432: getfield lastCrystalSlot : I
    //   15435: getstatic Perryc.1 : I
    //   15438: ifeq -> 15452
    //   15441: ldc2_w 329116629
    //   15444: l2i
    //   15445: ldc_w -36784416
    //   15448: ixor
    //   15449: goto -> 15460
    //   15452: ldc2_w 2020873473
    //   15455: l2i
    //   15456: ldc_w -73591665
    //   15459: ixor
    //   15460: ldc2_w 980471524
    //   15463: l2i
    //   15464: ldc_w 264706605
    //   15467: ixor
    //   15468: ixor
    //   15469: lookupswitch default -> 16878, -1235299001 -> 15496, -605779460 -> 15452
    //   15496: iload_2
    //   15497: getstatic Perryc.1 : I
    //   15500: ifeq -> 15514
    //   15503: ldc2_w -1429235833
    //   15506: l2i
    //   15507: ldc_w -235514794
    //   15510: ixor
    //   15511: goto -> 15522
    //   15514: ldc2_w 1554105027
    //   15517: l2i
    //   15518: ldc_w 288985599
    //   15521: ixor
    //   15522: ldc2_w 1697821512
    //   15525: l2i
    //   15526: ldc_w 967852981
    //   15529: ixor
    //   15530: ixor
    //   15531: lookupswitch default -> 16952, 129708844 -> 15514, 286958529 -> 15556
    //   15556: goto -> 15560
    //   15559: athrow
    //   15560: invokespecial putItemInOffhand : (II)V
    //   15563: goto -> 15567
    //   15566: athrow
    //   15567: goto -> 15570
    //   15570: ldc2_w -996205627
    //   15573: l2i
    //   15574: ldc_w -996205627
    //   15577: ixor
    //   15578: getstatic Perryc.0 : I
    //   15581: ifle -> 15595
    //   15584: ldc2_w -1561283375
    //   15587: l2i
    //   15588: ldc_w 1601248057
    //   15591: ixor
    //   15592: goto -> 15603
    //   15595: ldc2_w -451515353
    //   15598: l2i
    //   15599: ldc_w -1386713030
    //   15602: ixor
    //   15603: ldc2_w 40202945
    //   15606: l2i
    //   15607: ldc_w 536075968
    //   15610: ixor
    //   15611: ixor
    //   15612: lookupswitch default -> 17016, -535362583 -> 15595, 1440264220 -> 15640
    //   15640: istore_2
    //   15641: getstatic Perryc.0 : I
    //   15644: ifle -> 15658
    //   15647: ldc2_w -1898686165
    //   15650: l2i
    //   15651: ldc_w -1164935685
    //   15654: ixor
    //   15655: goto -> 15666
    //   15658: ldc2_w 81566844
    //   15661: l2i
    //   15662: ldc_w -1358994420
    //   15665: ixor
    //   15666: ldc2_w -1601964024
    //   15669: l2i
    //   15670: ldc_w 217894067
    //   15673: ixor
    //   15674: ixor
    //   15675: lookupswitch default -> 17024, -1740959637 -> 15658, 106745035 -> 15700
    //   15700: iload_2
    //   15701: getstatic Perryc.c : I
    //   15704: iflt -> 15718
    //   15707: ldc2_w -642116121
    //   15710: l2i
    //   15711: ldc_w 1770597905
    //   15714: ixor
    //   15715: goto -> 15726
    //   15718: ldc2_w 762339371
    //   15721: l2i
    //   15722: ldc_w -2062712560
    //   15725: ixor
    //   15726: ldc2_w 92886907
    //   15729: l2i
    //   15730: ldc_w -262813288
    //   15733: ixor
    //   15734: ixor
    //   15735: lookupswitch default -> 17278, 1173333269 -> 15718, 1570865112 -> 15760
    //   15760: aload_0
    //   15761: getstatic Perryc.c : I
    //   15764: iflt -> 15778
    //   15767: ldc2_w -1709924473
    //   15770: l2i
    //   15771: ldc_w 353510611
    //   15774: ixor
    //   15775: goto -> 15786
    //   15778: ldc2_w -1462746728
    //   15781: l2i
    //   15782: ldc_w 827501793
    //   15785: ixor
    //   15786: ldc2_w 1715952540
    //   15789: l2i
    //   15790: ldc_w 26409986
    //   15793: ixor
    //   15794: ixor
    //   15795: lookupswitch default -> 17030, -388817718 -> 15778, -27833625 -> 15820
    //   15820: getfield actions : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15823: getstatic Perryc.0 : I
    //   15826: ifle -> 15840
    //   15829: ldc2_w 1669836291
    //   15832: l2i
    //   15833: ldc_w 1677543846
    //   15836: ixor
    //   15837: goto -> 15848
    //   15840: ldc2_w -2120259045
    //   15843: l2i
    //   15844: ldc_w 846478057
    //   15847: ixor
    //   15848: ldc2_w -1023114255
    //   15851: l2i
    //   15852: ldc_w -148901618
    //   15855: ixor
    //   15856: ixor
    //   15857: lookupswitch default -> 15884, -209152655 -> 15840, 878810458 -> 17272
    //   15884: goto -> 15888
    //   15887: athrow
    //   15888: invokevirtual getValue : ()Ljava/lang/Object;
    //   15891: goto -> 15895
    //   15894: athrow
    //   15895: checkcast java/lang/Integer
    //   15898: getstatic Perryc.0 : I
    //   15901: ifle -> 15915
    //   15904: ldc2_w 1075857588
    //   15907: l2i
    //   15908: ldc_w -145264886
    //   15911: ixor
    //   15912: goto -> 15923
    //   15915: ldc2_w 1507103472
    //   15918: l2i
    //   15919: ldc_w -509546254
    //   15922: ixor
    //   15923: ldc2_w 175293642
    //   15926: l2i
    //   15927: ldc_w 1153691532
    //   15930: ixor
    //   15931: ixor
    //   15932: lookupswitch default -> 15960, -104461064 -> 17094, 798284534 -> 15915
    //   15960: goto -> 15964
    //   15963: athrow
    //   15964: invokevirtual intValue : ()I
    //   15967: goto -> 15971
    //   15970: athrow
    //   15971: if_icmpge -> 15985
    //   15974: ldc2_w 819780591
    //   15977: l2i
    //   15978: ldc_w 313462530
    //   15981: ixor
    //   15982: goto -> 15993
    //   15985: ldc2_w 1079162303
    //   15988: l2i
    //   15989: ldc_w 1646354797
    //   15992: ixor
    //   15993: ldc2_w 1567374205
    //   15996: l2i
    //   15997: ldc_w -1439701745
    //   16000: ixor
    //   16001: ixor
    //   16002: tableswitch default -> 15974, -718271841 -> 16024, -718271840 -> 16853
    //   16024: getstatic Perryc.0 : I
    //   16027: ifle -> 16041
    //   16030: ldc2_w -160085985
    //   16033: l2i
    //   16034: ldc_w 929751343
    //   16037: ixor
    //   16038: goto -> 16049
    //   16041: ldc2_w 1888230332
    //   16044: l2i
    //   16045: ldc_w 429816436
    //   16048: ixor
    //   16049: ldc2_w 1136164443
    //   16052: l2i
    //   16053: ldc_w 654846936
    //   16056: ixor
    //   16057: ixor
    //   16058: lookupswitch default -> 17244, -1515193165 -> 16041, 228734027 -> 16084
    //   16084: aload_0
    //   16085: getstatic Perryc.c : I
    //   16088: iflt -> 16102
    //   16091: ldc2_w 1588198567
    //   16094: l2i
    //   16095: ldc_w -1560356436
    //   16098: ixor
    //   16099: goto -> 16110
    //   16102: ldc2_w 2142398959
    //   16105: l2i
    //   16106: ldc_w 968879390
    //   16109: ixor
    //   16110: ldc2_w -592459693
    //   16113: l2i
    //   16114: ldc_w -1940797156
    //   16117: ixor
    //   16118: ixor
    //   16119: lookupswitch default -> 17090, -1398201276 -> 16102, 385058238 -> 16144
    //   16144: getfield taskList : Ljava/util/Queue;
    //   16147: getstatic Perryc.1 : I
    //   16150: ifeq -> 16164
    //   16153: ldc2_w 936588890
    //   16156: l2i
    //   16157: ldc_w -347471094
    //   16160: ixor
    //   16161: goto -> 16172
    //   16164: ldc2_w -419266625
    //   16167: l2i
    //   16168: ldc_w 1665946135
    //   16171: ixor
    //   16172: ldc2_w -870100775
    //   16175: l2i
    //   16176: ldc_w -45491209
    //   16179: ixor
    //   16180: ixor
    //   16181: lookupswitch default -> 16918, -1255889274 -> 16208, -302793090 -> 16164
    //   16208: goto -> 16212
    //   16211: athrow
    //   16212: invokeinterface poll : ()Ljava/lang/Object;
    //   16217: goto -> 16221
    //   16220: athrow
    //   16221: checkcast bigname/zprestige/webhack/util/InventoryUtil$Task
    //   16224: getstatic Perryc.1 : I
    //   16227: ifeq -> 16241
    //   16230: ldc2_w -513051380
    //   16233: l2i
    //   16234: ldc_w -1356614046
    //   16237: ixor
    //   16238: goto -> 16249
    //   16241: ldc2_w 1844503298
    //   16244: l2i
    //   16245: ldc_w -1352911845
    //   16248: ixor
    //   16249: ldc2_w 167295076
    //   16252: l2i
    //   16253: ldc_w -2075522008
    //   16256: ixor
    //   16257: ixor
    //   16258: lookupswitch default -> 17044, -1006995678 -> 16241, 1327391573 -> 16284
    //   16284: astore_3
    //   16285: getstatic Perryc.1 : I
    //   16288: ifeq -> 16302
    //   16291: ldc2_w 1374707306
    //   16294: l2i
    //   16295: ldc_w -215316596
    //   16298: ixor
    //   16299: goto -> 16310
    //   16302: ldc2_w -824306586
    //   16305: l2i
    //   16306: ldc_w -18088824
    //   16309: ixor
    //   16310: ldc2_w 1049030090
    //   16313: l2i
    //   16314: ldc_w -571391502
    //   16317: ixor
    //   16318: ixor
    //   16319: lookupswitch default -> 16928, -750631722 -> 16344, 1101886942 -> 16302
    //   16344: aload_3
    //   16345: ifnull -> 16359
    //   16348: ldc2_w 788273874
    //   16351: l2i
    //   16352: ldc_w -299034721
    //   16355: ixor
    //   16356: goto -> 16367
    //   16359: ldc2_w -1165771749
    //   16362: l2i
    //   16363: ldc_w 2052239703
    //   16366: ixor
    //   16367: ldc2_w -525474967
    //   16370: l2i
    //   16371: ldc_w 1533642106
    //   16374: ixor
    //   16375: ixor
    //   16376: tableswitch default -> 16348, 2065001310 -> 16400, 2065001311 -> 16847
    //   16400: getstatic Perryc.c : I
    //   16403: iflt -> 16417
    //   16406: ldc2_w 268280222
    //   16409: l2i
    //   16410: ldc_w -1936539741
    //   16413: ixor
    //   16414: goto -> 16425
    //   16417: ldc2_w -1500250923
    //   16420: l2i
    //   16421: ldc_w 1210041548
    //   16424: ixor
    //   16425: ldc2_w -1754611430
    //   16428: l2i
    //   16429: ldc_w 126574138
    //   16432: ixor
    //   16433: ixor
    //   16434: lookupswitch default -> 16460, 11473887 -> 16417, 328106269 -> 16864
    //   16460: aload_3
    //   16461: getstatic Perryc.c : I
    //   16464: iflt -> 16478
    //   16467: ldc2_w 1014727598
    //   16470: l2i
    //   16471: ldc_w -1864448014
    //   16474: ixor
    //   16475: goto -> 16486
    //   16478: ldc2_w 244968630
    //   16481: l2i
    //   16482: ldc_w 78511213
    //   16485: ixor
    //   16486: ldc2_w 1525419766
    //   16489: l2i
    //   16490: ldc_w 1347529188
    //   16493: ixor
    //   16494: ixor
    //   16495: lookupswitch default -> 16520, -1567536438 -> 16478, -1508318386 -> 16960
    //   16520: goto -> 16524
    //   16523: athrow
    //   16524: invokevirtual run : ()V
    //   16527: goto -> 16531
    //   16530: athrow
    //   16531: getstatic Perryc.0 : I
    //   16534: ifle -> 16548
    //   16537: ldc2_w 1271453973
    //   16540: l2i
    //   16541: ldc_w -1010474570
    //   16544: ixor
    //   16545: goto -> 16556
    //   16548: ldc2_w 1285390337
    //   16551: l2i
    //   16552: ldc_w -415806817
    //   16555: ixor
    //   16556: ldc2_w -745136745
    //   16559: l2i
    //   16560: ldc_w 1557492201
    //   16563: ixor
    //   16564: ixor
    //   16565: lookupswitch default -> 16592, -1265918131 -> 16548, 122606813 -> 17196
    //   16592: aload_3
    //   16593: getstatic Perryc.1 : I
    //   16596: ifeq -> 16610
    //   16599: ldc2_w 1673423729
    //   16602: l2i
    //   16603: ldc_w -41644617
    //   16606: ixor
    //   16607: goto -> 16618
    //   16610: ldc2_w 1852007343
    //   16613: l2i
    //   16614: ldc_w -972592373
    //   16617: ixor
    //   16618: ldc2_w 1909014324
    //   16621: l2i
    //   16622: ldc_w -928829020
    //   16625: ixor
    //   16626: ixor
    //   16627: lookupswitch default -> 17302, 286131764 -> 16652, 659613782 -> 16610
    //   16652: goto -> 16656
    //   16655: athrow
    //   16656: invokevirtual isSwitching : ()Z
    //   16659: goto -> 16663
    //   16662: athrow
    //   16663: ifeq -> 16677
    //   16666: ldc2_w 2090850131
    //   16669: l2i
    //   16670: ldc_w 1795605459
    //   16673: ixor
    //   16674: goto -> 16685
    //   16677: ldc2_w 1140652063
    //   16680: l2i
    //   16681: ldc_w 1415965856
    //   16684: ixor
    //   16685: ldc2_w 1893496702
    //   16688: l2i
    //   16689: ldc_w -981819039
    //   16692: ixor
    //   16693: ixor
    //   16694: tableswitch default -> 16666, -1572879713 -> 16716, -1572879712 -> 16847
    //   16716: getstatic Perryc.c : I
    //   16719: iflt -> 16733
    //   16722: ldc2_w -1004220853
    //   16725: l2i
    //   16726: ldc_w 812840606
    //   16729: ixor
    //   16730: goto -> 16741
    //   16733: ldc2_w 1571410405
    //   16736: l2i
    //   16737: ldc_w -291305681
    //   16740: ixor
    //   16741: ldc2_w 1156980259
    //   16744: l2i
    //   16745: ldc_w -1832783285
    //   16748: ixor
    //   16749: ixor
    //   16750: lookupswitch default -> 16776, -1250972664 -> 16733, 576836797 -> 17026
    //   16776: aload_0
    //   16777: ldc2_w 377665299
    //   16780: l2i
    //   16781: ldc_w 377665298
    //   16784: ixor
    //   16785: getstatic Perryc.1 : I
    //   16788: ifeq -> 16802
    //   16791: ldc2_w -521788316
    //   16794: l2i
    //   16795: ldc_w -1941380506
    //   16798: ixor
    //   16799: goto -> 16810
    //   16802: ldc2_w 1334862986
    //   16805: l2i
    //   16806: ldc_w -255851607
    //   16809: ixor
    //   16810: ldc2_w 937114104
    //   16813: l2i
    //   16814: ldc_w -1029556793
    //   16817: ixor
    //   16818: ixor
    //   16819: lookupswitch default -> 17080, -1713911235 -> 16802, 1244228380 -> 16844
    //   16844: putfield didSwitchThisTick : Z
    //   16847: iinc #2, 1
    //   16850: goto -> 15641
    //   16853: return
    //   16854: aconst_null
    //   16855: athrow
    //   16856: aconst_null
    //   16857: athrow
    //   16858: aconst_null
    //   16859: athrow
    //   16860: aconst_null
    //   16861: athrow
    //   16862: aconst_null
    //   16863: athrow
    //   16864: aconst_null
    //   16865: athrow
    //   16866: aconst_null
    //   16867: athrow
    //   16868: aconst_null
    //   16869: athrow
    //   16870: aconst_null
    //   16871: athrow
    //   16872: aconst_null
    //   16873: athrow
    //   16874: aconst_null
    //   16875: athrow
    //   16876: aconst_null
    //   16877: athrow
    //   16878: aconst_null
    //   16879: athrow
    //   16880: aconst_null
    //   16881: athrow
    //   16882: aconst_null
    //   16883: athrow
    //   16884: aconst_null
    //   16885: athrow
    //   16886: aconst_null
    //   16887: athrow
    //   16888: aconst_null
    //   16889: athrow
    //   16890: aconst_null
    //   16891: athrow
    //   16892: aconst_null
    //   16893: athrow
    //   16894: aconst_null
    //   16895: athrow
    //   16896: aconst_null
    //   16897: athrow
    //   16898: aconst_null
    //   16899: athrow
    //   16900: aconst_null
    //   16901: athrow
    //   16902: aconst_null
    //   16903: athrow
    //   16904: aconst_null
    //   16905: athrow
    //   16906: aconst_null
    //   16907: athrow
    //   16908: aconst_null
    //   16909: athrow
    //   16910: aconst_null
    //   16911: athrow
    //   16912: aconst_null
    //   16913: athrow
    //   16914: aconst_null
    //   16915: athrow
    //   16916: aconst_null
    //   16917: athrow
    //   16918: aconst_null
    //   16919: athrow
    //   16920: aconst_null
    //   16921: athrow
    //   16922: aconst_null
    //   16923: athrow
    //   16924: aconst_null
    //   16925: athrow
    //   16926: aconst_null
    //   16927: athrow
    //   16928: aconst_null
    //   16929: athrow
    //   16930: aconst_null
    //   16931: athrow
    //   16932: aconst_null
    //   16933: athrow
    //   16934: aconst_null
    //   16935: athrow
    //   16936: aconst_null
    //   16937: athrow
    //   16938: aconst_null
    //   16939: athrow
    //   16940: aconst_null
    //   16941: athrow
    //   16942: aconst_null
    //   16943: athrow
    //   16944: aconst_null
    //   16945: athrow
    //   16946: aconst_null
    //   16947: athrow
    //   16948: aconst_null
    //   16949: athrow
    //   16950: aconst_null
    //   16951: athrow
    //   16952: aconst_null
    //   16953: athrow
    //   16954: aconst_null
    //   16955: athrow
    //   16956: aconst_null
    //   16957: athrow
    //   16958: aconst_null
    //   16959: athrow
    //   16960: aconst_null
    //   16961: athrow
    //   16962: aconst_null
    //   16963: athrow
    //   16964: aconst_null
    //   16965: athrow
    //   16966: aconst_null
    //   16967: athrow
    //   16968: aconst_null
    //   16969: athrow
    //   16970: aconst_null
    //   16971: athrow
    //   16972: aconst_null
    //   16973: athrow
    //   16974: aconst_null
    //   16975: athrow
    //   16976: aconst_null
    //   16977: athrow
    //   16978: aconst_null
    //   16979: athrow
    //   16980: aconst_null
    //   16981: athrow
    //   16982: aconst_null
    //   16983: athrow
    //   16984: aconst_null
    //   16985: athrow
    //   16986: aconst_null
    //   16987: athrow
    //   16988: aconst_null
    //   16989: athrow
    //   16990: aconst_null
    //   16991: athrow
    //   16992: aconst_null
    //   16993: athrow
    //   16994: aconst_null
    //   16995: athrow
    //   16996: aconst_null
    //   16997: athrow
    //   16998: aconst_null
    //   16999: athrow
    //   17000: aconst_null
    //   17001: athrow
    //   17002: aconst_null
    //   17003: athrow
    //   17004: aconst_null
    //   17005: athrow
    //   17006: aconst_null
    //   17007: athrow
    //   17008: aconst_null
    //   17009: athrow
    //   17010: aconst_null
    //   17011: athrow
    //   17012: aconst_null
    //   17013: athrow
    //   17014: aconst_null
    //   17015: athrow
    //   17016: aconst_null
    //   17017: athrow
    //   17018: aconst_null
    //   17019: athrow
    //   17020: aconst_null
    //   17021: athrow
    //   17022: aconst_null
    //   17023: athrow
    //   17024: aconst_null
    //   17025: athrow
    //   17026: aconst_null
    //   17027: athrow
    //   17028: aconst_null
    //   17029: athrow
    //   17030: aconst_null
    //   17031: athrow
    //   17032: aconst_null
    //   17033: athrow
    //   17034: aconst_null
    //   17035: athrow
    //   17036: aconst_null
    //   17037: athrow
    //   17038: aconst_null
    //   17039: athrow
    //   17040: aconst_null
    //   17041: athrow
    //   17042: aconst_null
    //   17043: athrow
    //   17044: aconst_null
    //   17045: athrow
    //   17046: aconst_null
    //   17047: athrow
    //   17048: aconst_null
    //   17049: athrow
    //   17050: aconst_null
    //   17051: athrow
    //   17052: aconst_null
    //   17053: athrow
    //   17054: aconst_null
    //   17055: athrow
    //   17056: aconst_null
    //   17057: athrow
    //   17058: aconst_null
    //   17059: athrow
    //   17060: aconst_null
    //   17061: athrow
    //   17062: aconst_null
    //   17063: athrow
    //   17064: aconst_null
    //   17065: athrow
    //   17066: aconst_null
    //   17067: athrow
    //   17068: aconst_null
    //   17069: athrow
    //   17070: aconst_null
    //   17071: athrow
    //   17072: aconst_null
    //   17073: athrow
    //   17074: aconst_null
    //   17075: athrow
    //   17076: aconst_null
    //   17077: athrow
    //   17078: aconst_null
    //   17079: athrow
    //   17080: aconst_null
    //   17081: athrow
    //   17082: aconst_null
    //   17083: athrow
    //   17084: aconst_null
    //   17085: athrow
    //   17086: aconst_null
    //   17087: athrow
    //   17088: aconst_null
    //   17089: athrow
    //   17090: aconst_null
    //   17091: athrow
    //   17092: aconst_null
    //   17093: athrow
    //   17094: aconst_null
    //   17095: athrow
    //   17096: aconst_null
    //   17097: athrow
    //   17098: aconst_null
    //   17099: athrow
    //   17100: aconst_null
    //   17101: athrow
    //   17102: aconst_null
    //   17103: athrow
    //   17104: aconst_null
    //   17105: athrow
    //   17106: aconst_null
    //   17107: athrow
    //   17108: aconst_null
    //   17109: athrow
    //   17110: aconst_null
    //   17111: athrow
    //   17112: aconst_null
    //   17113: athrow
    //   17114: aconst_null
    //   17115: athrow
    //   17116: aconst_null
    //   17117: athrow
    //   17118: aconst_null
    //   17119: athrow
    //   17120: aconst_null
    //   17121: athrow
    //   17122: aconst_null
    //   17123: athrow
    //   17124: aconst_null
    //   17125: athrow
    //   17126: aconst_null
    //   17127: athrow
    //   17128: aconst_null
    //   17129: athrow
    //   17130: aconst_null
    //   17131: athrow
    //   17132: aconst_null
    //   17133: athrow
    //   17134: aconst_null
    //   17135: athrow
    //   17136: aconst_null
    //   17137: athrow
    //   17138: aconst_null
    //   17139: athrow
    //   17140: aconst_null
    //   17141: athrow
    //   17142: aconst_null
    //   17143: athrow
    //   17144: aconst_null
    //   17145: athrow
    //   17146: aconst_null
    //   17147: athrow
    //   17148: aconst_null
    //   17149: athrow
    //   17150: aconst_null
    //   17151: athrow
    //   17152: aconst_null
    //   17153: athrow
    //   17154: aconst_null
    //   17155: athrow
    //   17156: aconst_null
    //   17157: athrow
    //   17158: aconst_null
    //   17159: athrow
    //   17160: aconst_null
    //   17161: athrow
    //   17162: aconst_null
    //   17163: athrow
    //   17164: aconst_null
    //   17165: athrow
    //   17166: aconst_null
    //   17167: athrow
    //   17168: aconst_null
    //   17169: athrow
    //   17170: aconst_null
    //   17171: athrow
    //   17172: aconst_null
    //   17173: athrow
    //   17174: aconst_null
    //   17175: athrow
    //   17176: aconst_null
    //   17177: athrow
    //   17178: aconst_null
    //   17179: athrow
    //   17180: aconst_null
    //   17181: athrow
    //   17182: aconst_null
    //   17183: athrow
    //   17184: aconst_null
    //   17185: athrow
    //   17186: aconst_null
    //   17187: athrow
    //   17188: aconst_null
    //   17189: athrow
    //   17190: aconst_null
    //   17191: athrow
    //   17192: aconst_null
    //   17193: athrow
    //   17194: aconst_null
    //   17195: athrow
    //   17196: aconst_null
    //   17197: athrow
    //   17198: aconst_null
    //   17199: athrow
    //   17200: aconst_null
    //   17201: athrow
    //   17202: aconst_null
    //   17203: athrow
    //   17204: aconst_null
    //   17205: athrow
    //   17206: aconst_null
    //   17207: athrow
    //   17208: aconst_null
    //   17209: athrow
    //   17210: aconst_null
    //   17211: athrow
    //   17212: aconst_null
    //   17213: athrow
    //   17214: aconst_null
    //   17215: athrow
    //   17216: aconst_null
    //   17217: athrow
    //   17218: aconst_null
    //   17219: athrow
    //   17220: aconst_null
    //   17221: athrow
    //   17222: aconst_null
    //   17223: athrow
    //   17224: aconst_null
    //   17225: athrow
    //   17226: aconst_null
    //   17227: athrow
    //   17228: aconst_null
    //   17229: athrow
    //   17230: aconst_null
    //   17231: athrow
    //   17232: aconst_null
    //   17233: athrow
    //   17234: aconst_null
    //   17235: athrow
    //   17236: aconst_null
    //   17237: athrow
    //   17238: aconst_null
    //   17239: athrow
    //   17240: aconst_null
    //   17241: athrow
    //   17242: aconst_null
    //   17243: athrow
    //   17244: aconst_null
    //   17245: athrow
    //   17246: aconst_null
    //   17247: athrow
    //   17248: aconst_null
    //   17249: athrow
    //   17250: aconst_null
    //   17251: athrow
    //   17252: aconst_null
    //   17253: athrow
    //   17254: aconst_null
    //   17255: athrow
    //   17256: aconst_null
    //   17257: athrow
    //   17258: aconst_null
    //   17259: athrow
    //   17260: aconst_null
    //   17261: athrow
    //   17262: aconst_null
    //   17263: athrow
    //   17264: aconst_null
    //   17265: athrow
    //   17266: aconst_null
    //   17267: athrow
    //   17268: aconst_null
    //   17269: athrow
    //   17270: aconst_null
    //   17271: athrow
    //   17272: aconst_null
    //   17273: athrow
    //   17274: aconst_null
    //   17275: athrow
    //   17276: aconst_null
    //   17277: athrow
    //   17278: aconst_null
    //   17279: athrow
    //   17280: aconst_null
    //   17281: athrow
    //   17282: aconst_null
    //   17283: athrow
    //   17284: aconst_null
    //   17285: athrow
    //   17286: aconst_null
    //   17287: athrow
    //   17288: aconst_null
    //   17289: athrow
    //   17290: aconst_null
    //   17291: athrow
    //   17292: aconst_null
    //   17293: athrow
    //   17294: aconst_null
    //   17295: athrow
    //   17296: aconst_null
    //   17297: athrow
    //   17298: aconst_null
    //   17299: athrow
    //   17300: aconst_null
    //   17301: athrow
    //   17302: aconst_null
    //   17303: athrow
    //   17304: aconst_null
    //   17305: athrow
    //   17306: pop
    //   17307: goto -> 24
    //   17310: pop
    //   17311: aconst_null
    //   17312: goto -> 17306
    //   17315: dup
    //   17316: ifnull -> 17306
    //   17319: checkcast java/lang/Throwable
    //   17322: athrow
    //   17323: dup
    //   17324: ifnull -> 17310
    //   17327: checkcast java/lang/Throwable
    //   17330: athrow
    //   17331: aconst_null
    //   17332: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   12605	317	2	lastSlot	I
    //   13929	317	2	lastSlot	I
    //   15253	317	2	lastSlot	I
    //   16285	562	3	task	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
    //   15641	1212	2	i	I
    //   24	16830	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   11313	5541	1	currentOffhandItem	Lnet/minecraft/item/Item;
    // Exception table:
    //   from	to	target	type
    //   8	20	17315	finally
    //   399	406	406	finally
    //   399	406	3	java/lang/NumberFormatException
    //   399	406	399	finally
    //   400	406	3	java/lang/EnumConstantNotPresentException
    //   400	406	399	java/lang/IllegalStateException
    //   475	482	482	finally
    //   475	482	3	java/lang/IndexOutOfBoundsException
    //   475	482	482	java/lang/NumberFormatException
    //   476	482	3	finally
    //   476	482	475	finally
    //   727	734	734	finally
    //   727	734	727	finally
    //   727	734	3	java/lang/IllegalArgumentException
    //   728	734	727	finally
    //   728	734	727	java/lang/ArrayIndexOutOfBoundsException
    //   799	806	806	finally
    //   799	806	3	java/lang/NegativeArraySizeException
    //   799	806	799	java/lang/ArrayIndexOutOfBoundsException
    //   800	806	799	java/lang/ClassCastException
    //   800	806	3	finally
    //   1120	1126	1126	finally
    //   1120	1126	3	java/lang/UnsupportedOperationException
    //   1120	1126	3	finally
    //   1120	1126	1126	java/lang/StringIndexOutOfBoundsException
    //   1120	1126	1126	finally
    //   1799	1806	1806	finally
    //   1800	1806	1806	finally
    //   1800	1806	1799	finally
    //   1800	1806	3	finally
    //   1800	1806	1806	java/lang/ArithmeticException
    //   1876	1882	1882	finally
    //   1876	1882	3	finally
    //   1876	1882	3	java/lang/RuntimeException
    //   1876	1882	1882	java/util/NoSuchElementException
    //   1876	1882	3	finally
    //   2144	2150	2150	finally
    //   2144	2150	2150	finally
    //   2144	2150	2150	java/lang/RuntimeException
    //   2144	2150	2150	finally
    //   2144	2150	3	finally
    //   2403	2410	2410	finally
    //   2403	2410	3	finally
    //   2403	2410	2403	java/lang/ArithmeticException
    //   2404	2410	2410	java/lang/IllegalArgumentException
    //   2404	2410	2410	java/lang/RuntimeException
    //   2599	2606	2606	finally
    //   2599	2606	2599	java/lang/IndexOutOfBoundsException
    //   2600	2606	3	finally
    //   2600	2606	2599	finally
    //   2600	2606	2606	java/lang/UnsupportedOperationException
    //   2676	2682	2682	finally
    //   2676	2682	3	finally
    //   2676	2682	3	finally
    //   2676	2682	2682	finally
    //   2676	2682	2682	finally
    //   2935	2942	2942	finally
    //   2935	2942	2942	finally
    //   2935	2942	3	finally
    //   2936	2942	2935	java/lang/AssertionError
    //   2936	2942	3	java/lang/StringIndexOutOfBoundsException
    //   3131	3138	3138	finally
    //   3131	3138	3	java/lang/EnumConstantNotPresentException
    //   3131	3138	3	finally
    //   3131	3138	3138	finally
    //   3132	3138	3131	finally
    //   3207	3214	3214	finally
    //   3207	3214	3	finally
    //   3207	3214	3207	java/lang/AssertionError
    //   3208	3214	3214	finally
    //   3208	3214	3207	finally
    //   4059	4066	4066	finally
    //   4059	4066	4059	finally
    //   4059	4066	3	java/lang/ClassCastException
    //   4060	4066	3	java/lang/NegativeArraySizeException
    //   4060	4066	4066	finally
    //   4515	4522	4522	finally
    //   4515	4522	3	finally
    //   4515	4522	4522	finally
    //   4515	4522	4515	java/lang/UnsupportedOperationException
    //   4515	4522	3	finally
    //   4775	4782	4782	finally
    //   4775	4782	4775	finally
    //   4776	4782	3	java/lang/NullPointerException
    //   4776	4782	4775	finally
    //   4776	4782	4775	java/lang/RuntimeException
    //   4971	4978	4978	finally
    //   4971	4978	3	finally
    //   4972	4978	3	finally
    //   4972	4978	3	java/lang/EnumConstantNotPresentException
    //   4972	4978	4971	java/lang/IllegalStateException
    //   5047	5054	5054	finally
    //   5047	5054	3	java/lang/EnumConstantNotPresentException
    //   5047	5054	5054	java/lang/IllegalStateException
    //   5048	5054	5047	java/lang/IndexOutOfBoundsException
    //   5048	5054	5054	java/lang/IllegalStateException
    //   5307	5314	5314	finally
    //   5307	5314	5314	java/lang/NegativeArraySizeException
    //   5308	5314	5307	java/lang/NumberFormatException
    //   5308	5314	5314	finally
    //   5308	5314	5307	java/lang/ClassCastException
    //   5503	5510	5510	finally
    //   5503	5510	5510	java/lang/ArrayIndexOutOfBoundsException
    //   5503	5510	5510	finally
    //   5504	5510	5510	finally
    //   5504	5510	5503	finally
    //   5579	5586	5586	finally
    //   5579	5586	5586	java/lang/IndexOutOfBoundsException
    //   5579	5586	5586	finally
    //   5580	5586	5579	finally
    //   5580	5586	3	java/lang/EnumConstantNotPresentException
    //   6199	6206	6206	finally
    //   6200	6206	6199	java/lang/AssertionError
    //   6200	6206	6206	finally
    //   6200	6206	3	finally
    //   6200	6206	6199	finally
    //   6591	6598	6598	finally
    //   6592	6598	6598	java/util/ConcurrentModificationException
    //   6592	6598	6591	java/lang/UnsupportedOperationException
    //   6592	6598	6598	finally
    //   6592	6598	6598	finally
    //   6851	6858	6858	finally
    //   6851	6858	6858	java/lang/IndexOutOfBoundsException
    //   6851	6858	6858	java/lang/StringIndexOutOfBoundsException
    //   6852	6858	6851	finally
    //   6852	6858	3	java/lang/ArrayIndexOutOfBoundsException
    //   7047	7054	7054	finally
    //   7047	7054	3	java/util/NoSuchElementException
    //   7048	7054	7047	finally
    //   7048	7054	3	finally
    //   7048	7054	3	java/lang/UnsupportedOperationException
    //   7123	7130	7130	finally
    //   7123	7130	3	finally
    //   7123	7130	7123	java/util/NoSuchElementException
    //   7123	7130	3	finally
    //   7124	7130	7130	finally
    //   7384	7390	7390	finally
    //   7384	7390	7390	java/lang/UnsupportedOperationException
    //   7384	7390	3	finally
    //   7384	7390	3	finally
    //   7384	7390	7390	finally
    //   7580	7586	7586	finally
    //   7580	7586	7586	java/lang/IllegalArgumentException
    //   7580	7586	7586	java/lang/ArrayIndexOutOfBoundsException
    //   7580	7586	7586	finally
    //   7580	7586	3	finally
    //   7655	7662	7662	finally
    //   7655	7662	7662	java/lang/ClassCastException
    //   7655	7662	7662	java/lang/NullPointerException
    //   7656	7662	7662	finally
    //   7656	7662	7655	java/lang/UnsupportedOperationException
    //   7903	7910	7910	finally
    //   7903	7910	7910	finally
    //   7903	7910	7903	finally
    //   7903	7910	3	java/lang/UnsupportedOperationException
    //   7904	7910	7903	finally
    //   8471	8478	8478	finally
    //   8471	8478	8478	java/lang/AssertionError
    //   8471	8478	8471	java/lang/StringIndexOutOfBoundsException
    //   8472	8478	8471	java/util/NoSuchElementException
    //   8472	8478	3	java/lang/RuntimeException
    //   8548	8554	8554	finally
    //   8548	8554	8554	java/lang/StringIndexOutOfBoundsException
    //   8548	8554	8554	finally
    //   8548	8554	3	finally
    //   8548	8554	3	java/lang/ArithmeticException
    //   8864	8870	8870	finally
    //   8864	8870	3	finally
    //   8864	8870	8870	java/lang/ArrayIndexOutOfBoundsException
    //   8864	8870	3	java/lang/IllegalStateException
    //   8864	8870	8870	java/lang/IllegalStateException
    //   8935	8942	8942	finally
    //   8935	8942	8935	finally
    //   8935	8942	8935	finally
    //   8935	8942	8935	finally
    //   8935	8942	8942	java/lang/ClassCastException
    //   9315	9322	9322	finally
    //   9315	9322	9315	java/util/NoSuchElementException
    //   9315	9322	3	finally
    //   9315	9322	9315	finally
    //   9316	9322	9315	finally
    //   9388	9394	9394	finally
    //   9388	9394	9394	finally
    //   9388	9394	3	java/lang/NullPointerException
    //   9388	9394	3	finally
    //   9388	9394	9394	finally
    //   9767	9774	9774	finally
    //   9767	9774	3	java/lang/NegativeArraySizeException
    //   9767	9774	9767	finally
    //   9768	9774	3	finally
    //   9768	9774	3	finally
    //   9839	9846	9846	finally
    //   9839	9846	3	finally
    //   9839	9846	9846	finally
    //   9839	9846	9839	finally
    //   9840	9846	9846	java/lang/IllegalStateException
    //   10219	10226	10226	finally
    //   10219	10226	10226	finally
    //   10219	10226	10219	java/lang/NullPointerException
    //   10220	10226	3	java/lang/ArithmeticException
    //   10220	10226	3	java/lang/AssertionError
    //   10291	10298	10298	finally
    //   10291	10298	10298	finally
    //   10291	10298	10291	finally
    //   10291	10298	10298	java/lang/NumberFormatException
    //   10292	10298	3	java/lang/NumberFormatException
    //   10603	10610	10610	finally
    //   10603	10610	3	finally
    //   10603	10610	10610	java/lang/NegativeArraySizeException
    //   10604	10610	10603	finally
    //   10604	10610	10610	finally
    //   11171	11178	11178	finally
    //   11171	11178	11178	java/lang/UnsupportedOperationException
    //   11171	11178	11178	finally
    //   11172	11178	11171	finally
    //   11172	11178	3	finally
    //   11243	11250	11250	finally
    //   11243	11250	11243	finally
    //   11244	11250	11250	java/lang/NumberFormatException
    //   11244	11250	3	finally
    //   11244	11250	3	java/lang/EnumConstantNotPresentException
    //   11563	11570	11570	finally
    //   11563	11570	11563	finally
    //   11563	11570	3	java/util/ConcurrentModificationException
    //   11564	11570	3	java/lang/UnsupportedOperationException
    //   11564	11570	3	finally
    //   12155	12162	12162	finally
    //   12156	12162	3	finally
    //   12156	12162	12162	java/lang/NullPointerException
    //   12156	12162	12155	finally
    //   12156	12162	3	finally
    //   12535	12542	12542	finally
    //   12535	12542	3	java/lang/RuntimeException
    //   12535	12542	12542	finally
    //   12536	12542	12542	finally
    //   12536	12542	12535	finally
    //   12911	12918	12918	finally
    //   12911	12918	3	finally
    //   12911	12918	3	java/lang/NegativeArraySizeException
    //   12911	12918	12918	finally
    //   12912	12918	12911	finally
    //   13479	13486	13486	finally
    //   13479	13486	3	java/lang/ArrayIndexOutOfBoundsException
    //   13480	13486	13479	java/lang/AssertionError
    //   13480	13486	13486	finally
    //   13480	13486	3	finally
    //   13859	13866	13866	finally
    //   13859	13866	13859	finally
    //   13860	13866	13866	java/lang/RuntimeException
    //   13860	13866	13859	finally
    //   13860	13866	13866	finally
    //   14235	14242	14242	finally
    //   14235	14242	3	java/util/ConcurrentModificationException
    //   14235	14242	14235	finally
    //   14235	14242	14235	finally
    //   14236	14242	14235	java/lang/NullPointerException
    //   14803	14810	14810	finally
    //   14803	14810	3	finally
    //   14803	14810	3	finally
    //   14804	14810	14803	java/lang/NegativeArraySizeException
    //   14804	14810	3	finally
    //   15183	15190	15190	finally
    //   15183	15190	15183	java/lang/NegativeArraySizeException
    //   15183	15190	15183	java/lang/RuntimeException
    //   15184	15190	15183	java/lang/StringIndexOutOfBoundsException
    //   15184	15190	15190	java/lang/ArrayIndexOutOfBoundsException
    //   15559	15566	15566	finally
    //   15559	15566	15566	java/lang/IndexOutOfBoundsException
    //   15559	15566	15559	java/lang/StringIndexOutOfBoundsException
    //   15560	15566	3	finally
    //   15560	15566	15559	java/lang/IllegalStateException
    //   15888	15894	15894	finally
    //   15888	15894	15894	java/lang/AssertionError
    //   15888	15894	15894	java/lang/NullPointerException
    //   15888	15894	3	finally
    //   15888	15894	3	finally
    //   15963	15970	15970	finally
    //   15963	15970	3	finally
    //   15963	15970	15963	java/lang/NegativeArraySizeException
    //   15964	15970	15970	java/lang/NegativeArraySizeException
    //   15964	15970	15970	finally
    //   16211	16220	16220	finally
    //   16211	16220	16211	java/lang/IndexOutOfBoundsException
    //   16211	16220	3	java/lang/NumberFormatException
    //   16212	16220	16211	finally
    //   16212	16220	16220	finally
    //   16524	16530	16530	finally
    //   16524	16530	16530	java/lang/NegativeArraySizeException
    //   16524	16530	16530	finally
    //   16524	16530	3	finally
    //   16524	16530	16530	java/lang/IndexOutOfBoundsException
    //   16655	16662	16662	finally
    //   16655	16662	16662	finally
    //   16655	16662	16655	finally
    //   16655	16662	3	finally
    //   16656	16662	16662	java/lang/ArrayIndexOutOfBoundsException
    //   17315	17323	17315	finally
    //   17331	17333	3	finally
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static boolean lambda$doOffhand$7(ItemStack paramItemStack) {
    return Perry1.0t(null, (int)1551081109L ^ 0x1FF24E4D, paramItemStack);
  }
  
  public static Offhand2 getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 685387294
    //   33: l2i
    //   34: ldc_w -650991924
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 844213772
    //   44: l2i
    //   45: ldc_w 1302916676
    //   48: ixor
    //   49: ldc2_w -466036533
    //   52: l2i
    //   53: ldc_w -303985730
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 348, -130950233 -> 41, 1981813565 -> 84
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2.instance : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   87: ifnonnull -> 101
    //   90: ldc2_w 214824630
    //   93: l2i
    //   94: ldc_w 1606371494
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -1216544307
    //   104: l2i
    //   105: ldc_w -468729894
    //   108: ixor
    //   109: ldc2_w 1559176034
    //   112: l2i
    //   113: ldc_w 1769296225
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, 1726532627 -> 140, 1726532628 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Combat/Offhand2
    //   143: dup
    //   144: getstatic Perryc.0 : I
    //   147: ifle -> 161
    //   150: ldc2_w 819550284
    //   153: l2i
    //   154: ldc_w 377924529
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 1130790248
    //   164: l2i
    //   165: ldc_w 1109349867
    //   168: ixor
    //   169: ldc2_w 1751445130
    //   172: l2i
    //   173: ldc_w -577331110
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 350, -1817330387 -> 161, -1265932717 -> 204
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 232
    //   221: ldc2_w 890788105
    //   224: l2i
    //   225: ldc_w -762375118
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1461463892
    //   235: l2i
    //   236: ldc_w 276949920
    //   239: ixor
    //   240: ldc2_w 1329451334
    //   243: l2i
    //   244: ldc_w 1668322722
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 346, -1808827416 -> 276, -874903073 -> 232
    //   276: putstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2.instance : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   279: getstatic Perryc.c : I
    //   282: iflt -> 296
    //   285: ldc2_w 878003413
    //   288: l2i
    //   289: ldc_w 1839465785
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -1574146780
    //   299: l2i
    //   300: ldc_w -2082625844
    //   303: ixor
    //   304: ldc2_w 1388680783
    //   307: l2i
    //   308: ldc_w 1645937695
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, 388546213 -> 296, 1764742076 -> 344
    //   340: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand2.instance : Lbigname/zprestige/webhack/features/modules/Combat/Offhand2;
    //   343: areturn
    //   344: aconst_null
    //   345: athrow
    //   346: aconst_null
    //   347: athrow
    //   348: aconst_null
    //   349: athrow
    //   350: aconst_null
    //   351: athrow
    //   352: pop
    //   353: goto -> 24
    //   356: pop
    //   357: aconst_null
    //   358: goto -> 352
    //   361: dup
    //   362: ifnull -> 352
    //   365: checkcast java/lang/Throwable
    //   368: athrow
    //   369: dup
    //   370: ifnull -> 356
    //   373: checkcast java/lang/Throwable
    //   376: athrow
    //   377: aconst_null
    //   378: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	361	finally
    //   207	214	214	finally
    //   207	214	3	finally
    //   207	214	214	finally
    //   208	214	3	finally
    //   208	214	207	java/lang/UnsupportedOperationException
    //   361	369	361	finally
    //   377	379	3	finally
  }
  
  public static boolean lambda$doOffhand$6(ItemStack paramItemStack) {
    return Perry1.0u(null, (int)-1403823251L ^ 0xE4D8DB1A, paramItemStack);
  }
  
  public void doOffhand() {
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
    Perry1.46(this, (int)-1517042824L ^ 0x9F79ACD3);
  }
  
  public void putItemInOffhand(int slotIn, int slotOut) {
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
  
  public static boolean lambda$doOffhand$2(ItemStack paramItemStack) {
    return Perry1.0s(null, (int)-1025005599L ^ 0xCD0FAA7A, paramItemStack);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\Offhand2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */