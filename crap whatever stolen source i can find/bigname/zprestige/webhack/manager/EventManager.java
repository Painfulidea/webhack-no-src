package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class EventManager extends Feature {
  public Timer logoutTimer;
  
  public AtomicBoolean tickOngoing;
  
  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public void onChatSent(ClientChatEvent event) {
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
  
  @SubscribeEvent
  public void onUpdate(LivingEvent.LivingUpdateEvent event) {
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
  
  @SubscribeEvent
  public void renderHUD(RenderGameOverlayEvent.Post event) {
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
  
  public void onUnload() {
    Perry1.3k(this, (int)227585287L ^ 0x15D3F242);
  }
  
  @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
  public void onKeyInput(InputEvent.KeyInputEvent event) {
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
  
  @SubscribeEvent
  public void onTick(TickEvent.ClientTickEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1862
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1854
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1846
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 646758861
    //   33: l2i
    //   34: ldc_w 1995999817
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1340020043
    //   44: l2i
    //   45: ldc_w -1276598900
    //   48: ixor
    //   49: ldc2_w 720938445
    //   52: l2i
    //   53: ldc_w -66285942
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2038406973 -> 1835, -1698854861 -> 41
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifeq -> 109
    //   98: ldc2_w 1068653426
    //   101: l2i
    //   102: ldc_w -321803452
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w -999338987
    //   112: l2i
    //   113: ldc_w 386710572
    //   116: ixor
    //   117: ldc2_w 944078365
    //   120: l2i
    //   121: ldc_w 117259372
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, -304369081 -> 148, -304369080 -> 149
    //   148: return
    //   149: getstatic Perryc.0 : I
    //   152: ifle -> 166
    //   155: ldc2_w -1436753895
    //   158: l2i
    //   159: ldc_w 189791390
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -1803313103
    //   169: l2i
    //   170: ldc_w 1011906137
    //   173: ixor
    //   174: ldc2_w -1507293139
    //   177: l2i
    //   178: ldc_w 599868002
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 208, 620418760 -> 1793, 1061776772 -> 166
    //   208: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w -261851149
    //   220: l2i
    //   221: ldc_w -927566627
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w -1481246158
    //   231: l2i
    //   232: ldc_w -1343583133
    //   235: ixor
    //   236: ldc2_w -1034982603
    //   239: l2i
    //   240: ldc_w -1131901610
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 1823, 1175840077 -> 228, 1989709874 -> 272
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual onTick : ()V
    //   279: goto -> 283
    //   282: athrow
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -1515141878
    //   292: l2i
    //   293: ldc_w 1016866997
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -960385478
    //   303: l2i
    //   304: ldc_w 785835785
    //   307: ixor
    //   308: ldc2_w 1322821279
    //   311: l2i
    //   312: ldc_w -459095809
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 1811, 861309919 -> 300, 1114451795 -> 344
    //   344: getstatic bigname/zprestige/webhack/manager/EventManager.mc : Lnet/minecraft/client/Minecraft;
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w 783065671
    //   356: l2i
    //   357: ldc_w 1606193606
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1072350338
    //   367: l2i
    //   368: ldc_w -312615051
    //   371: ixor
    //   372: ldc2_w 32352846
    //   375: l2i
    //   376: ldc_w -668099711
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -2026473683 -> 364, -1462762930 -> 1813
    //   408: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   411: getstatic Perryc.0 : I
    //   414: ifle -> 428
    //   417: ldc2_w -935133204
    //   420: l2i
    //   421: ldc_w 157673796
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -1686414647
    //   431: l2i
    //   432: ldc_w -356200053
    //   435: ixor
    //   436: ldc2_w 99854502
    //   439: l2i
    //   440: ldc_w 1147335773
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 1801, -2135537069 -> 428, 808376249 -> 472
    //   472: getfield field_73010_i : Ljava/util/List;
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w 705283114
    //   484: l2i
    //   485: ldc_w 798975025
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 161022356
    //   495: l2i
    //   496: ldc_w 2032550690
    //   499: ixor
    //   500: ldc2_w -458199659
    //   503: l2i
    //   504: ldc_w 875840204
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, -720203966 -> 1827, -289798183 -> 492
    //   536: goto -> 540
    //   539: athrow
    //   540: invokeinterface iterator : ()Ljava/util/Iterator;
    //   545: goto -> 549
    //   548: athrow
    //   549: getstatic Perryc.c : I
    //   552: iflt -> 566
    //   555: ldc2_w 1089695265
    //   558: l2i
    //   559: ldc_w -1182302706
    //   562: ixor
    //   563: goto -> 574
    //   566: ldc2_w -1043102357
    //   569: l2i
    //   570: ldc_w 753619943
    //   573: ixor
    //   574: ldc2_w -559925650
    //   577: l2i
    //   578: ldc_w -1333272085
    //   581: ixor
    //   582: ixor
    //   583: lookupswitch default -> 608, -1756117078 -> 1809, -1611687380 -> 566
    //   608: astore_2
    //   609: getstatic Perryc.1 : I
    //   612: ifeq -> 626
    //   615: ldc2_w 1055357776
    //   618: l2i
    //   619: ldc_w 1976320858
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w -1238324361
    //   629: l2i
    //   630: ldc_w -1408556540
    //   633: ixor
    //   634: ldc2_w 107354154
    //   637: l2i
    //   638: ldc_w 1807716402
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, -376247586 -> 626, 653438994 -> 1817
    //   668: aload_2
    //   669: getstatic Perryc.0 : I
    //   672: ifle -> 686
    //   675: ldc2_w 563718157
    //   678: l2i
    //   679: ldc_w -1962136715
    //   682: ixor
    //   683: goto -> 694
    //   686: ldc2_w 1387776646
    //   689: l2i
    //   690: ldc_w 1158802827
    //   693: ixor
    //   694: ldc2_w 1491394477
    //   697: l2i
    //   698: ldc_w -1650388953
    //   701: ixor
    //   702: ixor
    //   703: lookupswitch default -> 1825, -756815737 -> 728, 1875922162 -> 686
    //   728: goto -> 732
    //   731: athrow
    //   732: invokeinterface hasNext : ()Z
    //   737: goto -> 741
    //   740: athrow
    //   741: ifeq -> 755
    //   744: ldc2_w -891328782
    //   747: l2i
    //   748: ldc_w 1414822460
    //   751: ixor
    //   752: goto -> 763
    //   755: ldc2_w 678717623
    //   758: l2i
    //   759: ldc_w -1224772488
    //   762: ixor
    //   763: ldc2_w -1738117837
    //   766: l2i
    //   767: ldc_w 1809909761
    //   770: ixor
    //   771: ixor
    //   772: tableswitch default -> 744, 1829534204 -> 796, 1829534205 -> 1790
    //   796: getstatic Perryc.1 : I
    //   799: ifeq -> 813
    //   802: ldc2_w 140181989
    //   805: l2i
    //   806: ldc_w -1382605632
    //   809: ixor
    //   810: goto -> 821
    //   813: ldc2_w 1588868338
    //   816: l2i
    //   817: ldc_w -1755508224
    //   820: ixor
    //   821: ldc2_w -204385587
    //   824: l2i
    //   825: ldc_w -1571113995
    //   828: ixor
    //   829: ixor
    //   830: lookupswitch default -> 856, -2087351223 -> 813, -196608995 -> 1829
    //   856: aload_2
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w 989022797
    //   866: l2i
    //   867: ldc_w 1997529791
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 715067083
    //   877: l2i
    //   878: ldc_w 1209275360
    //   881: ixor
    //   882: ldc2_w 1802152153
    //   885: l2i
    //   886: ldc_w -713652372
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 1815, -594070882 -> 916, -203389113 -> 874
    //   916: goto -> 920
    //   919: athrow
    //   920: invokeinterface next : ()Ljava/lang/Object;
    //   925: goto -> 929
    //   928: athrow
    //   929: checkcast net/minecraft/entity/player/EntityPlayer
    //   932: getstatic Perryc.0 : I
    //   935: ifle -> 949
    //   938: ldc2_w -2061900398
    //   941: l2i
    //   942: ldc_w -1512224193
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 1767059552
    //   952: l2i
    //   953: ldc_w 1717633211
    //   956: ixor
    //   957: ldc2_w 1076955177
    //   960: l2i
    //   961: ldc_w -1429715903
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 1805, -901913659 -> 949, -439649101 -> 992
    //   992: astore_3
    //   993: getstatic Perryc.1 : I
    //   996: ifeq -> 1010
    //   999: ldc2_w -207152465
    //   1002: l2i
    //   1003: ldc_w 1937009632
    //   1006: ixor
    //   1007: goto -> 1018
    //   1010: ldc2_w -67411222
    //   1013: l2i
    //   1014: ldc_w -1895228790
    //   1017: ixor
    //   1018: ldc2_w 686328958
    //   1021: l2i
    //   1022: ldc_w 1746776410
    //   1025: ixor
    //   1026: ixor
    //   1027: lookupswitch default -> 1807, -1071231893 -> 1010, 872891716 -> 1052
    //   1052: aload_3
    //   1053: ifnull -> 1067
    //   1056: ldc2_w -993659847
    //   1059: l2i
    //   1060: ldc_w -1848701353
    //   1063: ixor
    //   1064: goto -> 1075
    //   1067: ldc2_w 1308458084
    //   1070: l2i
    //   1071: ldc_w 418874891
    //   1074: ixor
    //   1075: ldc2_w 1039463259
    //   1078: l2i
    //   1079: ldc_w -943201059
    //   1082: ixor
    //   1083: ixor
    //   1084: tableswitch default -> 1056, -1355158040 -> 1108, -1355158039 -> 609
    //   1108: getstatic Perryc.1 : I
    //   1111: ifeq -> 1125
    //   1114: ldc2_w -430673387
    //   1117: l2i
    //   1118: ldc_w -2005879879
    //   1121: ixor
    //   1122: goto -> 1133
    //   1125: ldc2_w -1714818220
    //   1128: l2i
    //   1129: ldc_w 1749890159
    //   1132: ixor
    //   1133: ldc2_w -40934427
    //   1136: l2i
    //   1137: ldc_w -155471548
    //   1140: ixor
    //   1141: ixor
    //   1142: lookupswitch default -> 1168, -1008776055 -> 1125, 1695552269 -> 1797
    //   1168: aload_3
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w 583637774
    //   1178: l2i
    //   1179: ldc_w 1404346383
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 981516667
    //   1189: l2i
    //   1190: ldc_w 1263866533
    //   1193: ixor
    //   1194: ldc2_w -166882149
    //   1197: l2i
    //   1198: ldc_w -1781154349
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1228, 312808009 -> 1833, 1533749115 -> 1186
    //   1228: goto -> 1232
    //   1231: athrow
    //   1232: invokevirtual func_110143_aJ : ()F
    //   1235: goto -> 1239
    //   1238: athrow
    //   1239: ldc_w 3.5337452E37
    //   1242: invokestatic floatToIntBits : (F)I
    //   1245: ldc_w 2111090167
    //   1248: ixor
    //   1249: invokestatic intBitsToFloat : (I)F
    //   1252: fcmpl
    //   1253: ifle -> 1267
    //   1256: ldc2_w 2090844728
    //   1259: l2i
    //   1260: ldc_w 653241500
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w 823391848
    //   1270: l2i
    //   1271: ldc_w 1801689293
    //   1274: ixor
    //   1275: ldc2_w 314242303
    //   1278: l2i
    //   1279: ldc_w -738954387
    //   1282: ixor
    //   1283: ixor
    //   1284: tableswitch default -> 1256, -1690375882 -> 1308, -1690375881 -> 1311
    //   1308: goto -> 609
    //   1311: getstatic Perryc.1 : I
    //   1314: ifeq -> 1328
    //   1317: ldc2_w -1670604799
    //   1320: l2i
    //   1321: ldc_w -725096131
    //   1324: ixor
    //   1325: goto -> 1336
    //   1328: ldc2_w 751544384
    //   1331: l2i
    //   1332: ldc_w 1117656148
    //   1335: ixor
    //   1336: ldc2_w 2139978948
    //   1339: l2i
    //   1340: ldc_w -1581076423
    //   1343: ixor
    //   1344: ixor
    //   1345: lookupswitch default -> 1372, -1763394111 -> 1803, 2007459605 -> 1328
    //   1372: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lnet/minecraftforge/fml/common/eventhandler/EventBus;
    //   1375: new bigname/zprestige/webhack/event/events/DeathEvent
    //   1378: dup
    //   1379: getstatic Perryc.1 : I
    //   1382: ifeq -> 1396
    //   1385: ldc2_w -1614305760
    //   1388: l2i
    //   1389: ldc_w 804163217
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w 794733428
    //   1399: l2i
    //   1400: ldc_w 970821848
    //   1403: ixor
    //   1404: ldc2_w 161490545
    //   1407: l2i
    //   1408: ldc_w 1802150099
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 1831, -756830701 -> 1396, 1950989582 -> 1440
    //   1440: aload_3
    //   1441: getstatic Perryc.1 : I
    //   1444: ifeq -> 1458
    //   1447: ldc2_w -2050022198
    //   1450: l2i
    //   1451: ldc_w -451709597
    //   1454: ixor
    //   1455: goto -> 1466
    //   1458: ldc2_w -277442702
    //   1461: l2i
    //   1462: ldc_w -1583835086
    //   1465: ixor
    //   1466: ldc2_w 1485400959
    //   1469: l2i
    //   1470: ldc_w -962686362
    //   1473: ixor
    //   1474: ixor
    //   1475: lookupswitch default -> 1791, -788926887 -> 1500, -20207440 -> 1458
    //   1500: goto -> 1504
    //   1503: athrow
    //   1504: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   1507: goto -> 1511
    //   1510: athrow
    //   1511: getstatic Perryc.1 : I
    //   1514: ifeq -> 1528
    //   1517: ldc2_w -375495343
    //   1520: l2i
    //   1521: ldc_w -1497285925
    //   1524: ixor
    //   1525: goto -> 1536
    //   1528: ldc2_w -194242228
    //   1531: l2i
    //   1532: ldc_w -1859577281
    //   1535: ixor
    //   1536: ldc2_w 466525662
    //   1539: l2i
    //   1540: ldc_w 455884082
    //   1543: ixor
    //   1544: ixor
    //   1545: lookupswitch default -> 1821, 1337851750 -> 1528, 1705485215 -> 1572
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual post : (Lnet/minecraftforge/fml/common/eventhandler/Event;)Z
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: pop
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w 893155209
    //   1593: l2i
    //   1594: ldc_w 808208818
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w -1493329486
    //   1604: l2i
    //   1605: ldc_w 428130603
    //   1608: ixor
    //   1609: ldc2_w -336909515
    //   1612: l2i
    //   1613: ldc_w -212270764
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 1819, -1479838984 -> 1644, 497161306 -> 1601
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: getstatic Perryc.0 : I
    //   1658: ifle -> 1672
    //   1661: ldc2_w 1267931772
    //   1664: l2i
    //   1665: ldc_w 1937810472
    //   1668: ixor
    //   1669: goto -> 1680
    //   1672: ldc2_w 705204304
    //   1675: l2i
    //   1676: ldc_w -377790534
    //   1679: ixor
    //   1680: ldc2_w -44294289
    //   1683: l2i
    //   1684: ldc_w 767505106
    //   1687: ixor
    //   1688: ixor
    //   1689: lookupswitch default -> 1716, -693412970 -> 1672, -386886679 -> 1799
    //   1716: aload_3
    //   1717: getstatic Perryc.c : I
    //   1720: iflt -> 1734
    //   1723: ldc2_w 1871112703
    //   1726: l2i
    //   1727: ldc_w 103969933
    //   1730: ixor
    //   1731: goto -> 1742
    //   1734: ldc2_w 233889740
    //   1737: l2i
    //   1738: ldc_w 950466014
    //   1741: ixor
    //   1742: ldc2_w -937795170
    //   1745: l2i
    //   1746: ldc_w -59216634
    //   1749: ixor
    //   1750: ixor
    //   1751: lookupswitch default -> 1776, -436826907 -> 1734, 1574343146 -> 1795
    //   1776: goto -> 1780
    //   1779: athrow
    //   1780: invokevirtual onDeath : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   1783: goto -> 1787
    //   1786: athrow
    //   1787: goto -> 609
    //   1790: return
    //   1791: aconst_null
    //   1792: athrow
    //   1793: aconst_null
    //   1794: athrow
    //   1795: aconst_null
    //   1796: athrow
    //   1797: aconst_null
    //   1798: athrow
    //   1799: aconst_null
    //   1800: athrow
    //   1801: aconst_null
    //   1802: athrow
    //   1803: aconst_null
    //   1804: athrow
    //   1805: aconst_null
    //   1806: athrow
    //   1807: aconst_null
    //   1808: athrow
    //   1809: aconst_null
    //   1810: athrow
    //   1811: aconst_null
    //   1812: athrow
    //   1813: aconst_null
    //   1814: athrow
    //   1815: aconst_null
    //   1816: athrow
    //   1817: aconst_null
    //   1818: athrow
    //   1819: aconst_null
    //   1820: athrow
    //   1821: aconst_null
    //   1822: athrow
    //   1823: aconst_null
    //   1824: athrow
    //   1825: aconst_null
    //   1826: athrow
    //   1827: aconst_null
    //   1828: athrow
    //   1829: aconst_null
    //   1830: athrow
    //   1831: aconst_null
    //   1832: athrow
    //   1833: aconst_null
    //   1834: athrow
    //   1835: aconst_null
    //   1836: athrow
    //   1837: pop
    //   1838: goto -> 24
    //   1841: pop
    //   1842: aconst_null
    //   1843: goto -> 1837
    //   1846: dup
    //   1847: ifnull -> 1837
    //   1850: checkcast java/lang/Throwable
    //   1853: athrow
    //   1854: dup
    //   1855: ifnull -> 1841
    //   1858: checkcast java/lang/Throwable
    //   1861: athrow
    //   1862: aconst_null
    //   1863: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   993	794	3	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	1767	0	this	Lbigname/zprestige/webhack/manager/EventManager;
    //   24	1767	1	event	Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	1846	finally
    //   87	94	94	finally
    //   88	94	87	finally
    //   88	94	3	finally
    //   88	94	94	java/util/NoSuchElementException
    //   88	94	94	finally
    //   275	282	282	finally
    //   275	282	3	java/lang/NullPointerException
    //   275	282	3	java/lang/ArrayIndexOutOfBoundsException
    //   275	282	282	finally
    //   276	282	275	java/lang/ArrayIndexOutOfBoundsException
    //   539	548	548	finally
    //   539	548	539	java/lang/AssertionError
    //   539	548	3	finally
    //   540	548	548	finally
    //   540	548	3	finally
    //   731	740	740	finally
    //   731	740	731	java/lang/NumberFormatException
    //   731	740	3	java/lang/EnumConstantNotPresentException
    //   732	740	740	java/lang/EnumConstantNotPresentException
    //   732	740	3	java/lang/NullPointerException
    //   920	928	928	finally
    //   920	928	3	java/lang/AssertionError
    //   920	928	928	java/lang/ArrayIndexOutOfBoundsException
    //   920	928	3	finally
    //   920	928	3	finally
    //   1231	1238	1238	finally
    //   1231	1238	1238	finally
    //   1231	1238	1238	java/lang/NullPointerException
    //   1231	1238	1231	java/lang/ArithmeticException
    //   1232	1238	1231	java/lang/StringIndexOutOfBoundsException
    //   1503	1510	1510	finally
    //   1503	1510	1510	finally
    //   1504	1510	1503	java/lang/StringIndexOutOfBoundsException
    //   1504	1510	1510	finally
    //   1504	1510	1510	finally
    //   1575	1582	1582	finally
    //   1575	1582	3	finally
    //   1575	1582	3	finally
    //   1576	1582	1582	java/lang/ArrayIndexOutOfBoundsException
    //   1576	1582	1575	java/lang/IllegalArgumentException
    //   1648	1654	1654	finally
    //   1648	1654	1654	java/lang/ArrayIndexOutOfBoundsException
    //   1648	1654	3	finally
    //   1648	1654	3	java/lang/IndexOutOfBoundsException
    //   1648	1654	1654	finally
    //   1779	1786	1786	finally
    //   1779	1786	1779	finally
    //   1779	1786	1786	finally
    //   1779	1786	1786	java/lang/IndexOutOfBoundsException
    //   1780	1786	1786	finally
    //   1846	1854	1846	java/lang/NullPointerException
    //   1862	1864	3	java/lang/RuntimeException
  }
  
  public static void lambda$onPacketReceive$1(SPacketPlayerListItem packet, SPacketPlayerListItem.AddPlayerData data) {
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
  
  public EventManager() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -807381869
    //   9: l2i
    //   10: ldc_w 459484954
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 2093125968
    //   20: l2i
    //   21: ldc_w 1189233888
    //   24: ixor
    //   25: ldc2_w -380591424
    //   28: l2i
    //   29: ldc_w 1550465477
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -88106346 -> 17, 1639571596 -> 520
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 805025476
    //   70: l2i
    //   71: ldc_w 944446646
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -528206975
    //   81: l2i
    //   82: ldc_w -1420311670
    //   85: ixor
    //   86: ldc2_w 1103302690
    //   89: l2i
    //   90: ldc_w -2015152590
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 516, -1913399781 -> 120, -779056030 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w 811286497
    //   132: l2i
    //   133: ldc_w 923747546
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -1562129877
    //   143: l2i
    //   144: ldc_w 1878337874
    //   147: ixor
    //   148: ldc2_w -518988699
    //   151: l2i
    //   152: ldc_w 644997030
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 522, -1070237448 -> 140, 175628474 -> 184
    //   184: aload_0
    //   185: new bigname/zprestige/webhack/util/Timer
    //   188: dup
    //   189: getstatic Perryc.c : I
    //   192: iflt -> 206
    //   195: ldc2_w -549438825
    //   198: l2i
    //   199: ldc_w 788621216
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w 326187294
    //   209: l2i
    //   210: ldc_w 1797531591
    //   213: ixor
    //   214: ldc2_w 613668909
    //   217: l2i
    //   218: ldc_w -1916071098
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 528, -787622478 -> 248, 1494849116 -> 206
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.0 : I
    //   254: ifle -> 268
    //   257: ldc2_w -1164586871
    //   260: l2i
    //   261: ldc_w 957179601
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w 1181504893
    //   271: l2i
    //   272: ldc_w 1114644561
    //   275: ixor
    //   276: ldc2_w -1284002818
    //   279: l2i
    //   280: ldc_w 704867951
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 312, 390897911 -> 268, 451703753 -> 526
    //   312: putfield logoutTimer : Lbigname/zprestige/webhack/util/Timer;
    //   315: getstatic Perryc.1 : I
    //   318: ifeq -> 332
    //   321: ldc2_w 657636146
    //   324: l2i
    //   325: ldc_w 1552379692
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w 740305804
    //   335: l2i
    //   336: ldc_w -703343514
    //   339: ixor
    //   340: ldc2_w 849338708
    //   343: l2i
    //   344: ldc_w -880698560
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 376, -2102678006 -> 524, -1604861916 -> 332
    //   376: aload_0
    //   377: new java/util/concurrent/atomic/AtomicBoolean
    //   380: dup
    //   381: ldc2_w -466610841
    //   384: l2i
    //   385: ldc_w -466610841
    //   388: ixor
    //   389: getstatic Perryc.1 : I
    //   392: ifeq -> 406
    //   395: ldc2_w -379965909
    //   398: l2i
    //   399: ldc_w 802966917
    //   402: ixor
    //   403: goto -> 414
    //   406: ldc2_w -773597436
    //   409: l2i
    //   410: ldc_w -300001244
    //   413: ixor
    //   414: ldc2_w 1219151281
    //   417: l2i
    //   418: ldc_w -435151906
    //   421: ixor
    //   422: ixor
    //   423: lookupswitch default -> 448, 501784986 -> 406, 1748811201 -> 518
    //   448: invokespecial <init> : (Z)V
    //   451: getstatic Perryc.c : I
    //   454: iflt -> 468
    //   457: ldc2_w 1374732705
    //   460: l2i
    //   461: ldc_w -774686204
    //   464: ixor
    //   465: goto -> 476
    //   468: ldc2_w 1803489437
    //   471: l2i
    //   472: ldc_w 1201776636
    //   475: ixor
    //   476: ldc2_w -2030141852
    //   479: l2i
    //   480: ldc_w -1010317289
    //   483: ixor
    //   484: ixor
    //   485: lookupswitch default -> 512, -988131882 -> 530, 242599565 -> 468
    //   512: putfield tickOngoing : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   515: return
    //   516: aconst_null
    //   517: athrow
    //   518: aconst_null
    //   519: athrow
    //   520: aconst_null
    //   521: athrow
    //   522: aconst_null
    //   523: athrow
    //   524: aconst_null
    //   525: athrow
    //   526: aconst_null
    //   527: athrow
    //   528: aconst_null
    //   529: athrow
    //   530: aconst_null
    //   531: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	516	0	this	Lbigname/zprestige/webhack/manager/EventManager;
  }
  
  @SubscribeEvent
  public void onPacketReceive(PacketEvent.Receive event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4407
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 4399
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4391
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 632928790
    //   33: l2i
    //   34: ldc_w 1538689163
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 349722085
    //   44: l2i
    //   45: ldc_w -281575487
    //   48: ixor
    //   49: ldc2_w -1442685704
    //   52: l2i
    //   53: ldc_w -665921828
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 4310, -1985765376 -> 84, 205764793 -> 41
    //   84: aload_1
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 1499941460
    //   94: l2i
    //   95: ldc_w -1242282980
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -2025354353
    //   105: l2i
    //   106: ldc_w 518167767
    //   109: ixor
    //   110: ldc2_w 972829133
    //   113: l2i
    //   114: ldc_w 1383002767
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 4274, -2029925110 -> 102, -231222246 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getStage : ()I
    //   151: goto -> 155
    //   154: athrow
    //   155: ifeq -> 169
    //   158: ldc2_w 855332269
    //   161: l2i
    //   162: ldc_w 901992150
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w 2144895342
    //   172: l2i
    //   173: ldc_w 2027985426
    //   176: ixor
    //   177: ldc2_w -1776310715
    //   180: l2i
    //   181: ldc_w 1769515021
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, -127986381 -> 208, -127986380 -> 209
    //   208: return
    //   209: getstatic Perryc.1 : I
    //   212: ifeq -> 226
    //   215: ldc2_w 1094833641
    //   218: l2i
    //   219: ldc_w 373109733
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -1885923562
    //   229: l2i
    //   230: ldc_w -1106969606
    //   233: ixor
    //   234: ldc2_w -615170622
    //   237: l2i
    //   238: ldc_w -553950147
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, 767510770 -> 226, 1389543411 -> 4316
    //   268: getstatic bigname/zprestige/webhack/WebHack.serverManager : Lbigname/zprestige/webhack/manager/ServerManager;
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w 304191289
    //   280: l2i
    //   281: ldc_w 229575128
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w 209130076
    //   291: l2i
    //   292: ldc_w 888915067
    //   295: ixor
    //   296: ldc2_w -521083410
    //   299: l2i
    //   300: ldc_w 605199224
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -613621641 -> 4284, 123320626 -> 288
    //   332: goto -> 336
    //   335: athrow
    //   336: invokevirtual onPacketReceived : ()V
    //   339: goto -> 343
    //   342: athrow
    //   343: getstatic Perryc.1 : I
    //   346: ifeq -> 360
    //   349: ldc2_w 329540863
    //   352: l2i
    //   353: ldc_w -157090967
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 1574473333
    //   363: l2i
    //   364: ldc_w -1781837069
    //   367: ixor
    //   368: ldc2_w 1244908195
    //   371: l2i
    //   372: ldc_w 251982713
    //   375: ixor
    //   376: ixor
    //   377: lookupswitch default -> 404, -1607358900 -> 4322, -1295920452 -> 360
    //   404: aload_1
    //   405: getstatic Perryc.0 : I
    //   408: ifle -> 422
    //   411: ldc2_w -1086749676
    //   414: l2i
    //   415: ldc_w -1201523264
    //   418: ixor
    //   419: goto -> 430
    //   422: ldc2_w -1606569564
    //   425: l2i
    //   426: ldc_w 298702234
    //   429: ixor
    //   430: ldc2_w 1764183492
    //   433: l2i
    //   434: ldc_w -1896703994
    //   437: ixor
    //   438: ixor
    //   439: lookupswitch default -> 4370, -527539178 -> 422, 1445310972 -> 464
    //   464: goto -> 468
    //   467: athrow
    //   468: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   471: goto -> 475
    //   474: athrow
    //   475: instanceof net/minecraft/network/play/server/SPacketEntityStatus
    //   478: ifeq -> 492
    //   481: ldc2_w -409267896
    //   484: l2i
    //   485: ldc_w -908216166
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -1483899321
    //   495: l2i
    //   496: ldc_w -1983129708
    //   499: ixor
    //   500: ldc2_w 420751218
    //   503: l2i
    //   504: ldc_w 972033726
    //   507: ixor
    //   508: ixor
    //   509: tableswitch default -> 481, 245530654 -> 532, 245530655 -> 2035
    //   532: getstatic Perryc.1 : I
    //   535: ifeq -> 549
    //   538: ldc2_w 693911037
    //   541: l2i
    //   542: ldc_w 1264624386
    //   545: ixor
    //   546: goto -> 557
    //   549: ldc2_w 1599758354
    //   552: l2i
    //   553: ldc_w -1857552716
    //   556: ixor
    //   557: ldc2_w 1491849888
    //   560: l2i
    //   561: ldc_w -372728114
    //   564: ixor
    //   565: ixor
    //   566: lookupswitch default -> 592, -752889199 -> 4338, 247842371 -> 549
    //   592: aload_1
    //   593: getstatic Perryc.c : I
    //   596: iflt -> 610
    //   599: ldc2_w -1308001357
    //   602: l2i
    //   603: ldc_w 34113697
    //   606: ixor
    //   607: goto -> 618
    //   610: ldc2_w 1660110034
    //   613: l2i
    //   614: ldc_w 1809983467
    //   617: ixor
    //   618: ldc2_w 311448305
    //   621: l2i
    //   622: ldc_w 1228329934
    //   625: ixor
    //   626: ixor
    //   627: lookupswitch default -> 4340, -341347795 -> 610, 1387782662 -> 652
    //   652: goto -> 656
    //   655: athrow
    //   656: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   659: goto -> 663
    //   662: athrow
    //   663: checkcast net/minecraft/network/play/server/SPacketEntityStatus
    //   666: getstatic Perryc.c : I
    //   669: iflt -> 683
    //   672: ldc2_w 295707973
    //   675: l2i
    //   676: ldc_w -985433794
    //   679: ixor
    //   680: goto -> 691
    //   683: ldc2_w -1535337294
    //   686: l2i
    //   687: ldc_w 1719427630
    //   690: ixor
    //   691: ldc2_w 773028966
    //   694: l2i
    //   695: ldc_w 1387022354
    //   698: ixor
    //   699: ixor
    //   700: lookupswitch default -> 728, -1470339057 -> 4362, 2014087632 -> 683
    //   728: astore_2
    //   729: getstatic Perryc.0 : I
    //   732: ifle -> 746
    //   735: ldc2_w -1353550970
    //   738: l2i
    //   739: ldc_w -349471033
    //   742: ixor
    //   743: goto -> 754
    //   746: ldc2_w -1792331170
    //   749: l2i
    //   750: ldc_w 1481172726
    //   753: ixor
    //   754: ldc2_w 1000151130
    //   757: l2i
    //   758: ldc_w 1847030377
    //   761: ixor
    //   762: ixor
    //   763: lookupswitch default -> 788, 153546278 -> 746, 301164402 -> 4288
    //   788: aload_2
    //   789: getstatic Perryc.1 : I
    //   792: ifeq -> 806
    //   795: ldc2_w -2098943913
    //   798: l2i
    //   799: ldc_w 1981036184
    //   802: ixor
    //   803: goto -> 814
    //   806: ldc2_w 749039353
    //   809: l2i
    //   810: ldc_w -502251635
    //   813: ixor
    //   814: ldc2_w 1014571016
    //   817: l2i
    //   818: ldc_w -1508122928
    //   821: ixor
    //   822: ixor
    //   823: lookupswitch default -> 4306, 1423421356 -> 848, 1855086615 -> 806
    //   848: goto -> 852
    //   851: athrow
    //   852: invokevirtual func_149160_c : ()B
    //   855: goto -> 859
    //   858: athrow
    //   859: ldc2_w -1876982170
    //   862: l2i
    //   863: ldc_w -1876982203
    //   866: ixor
    //   867: if_icmpne -> 881
    //   870: ldc2_w -1731667866
    //   873: l2i
    //   874: ldc_w -1938328068
    //   877: ixor
    //   878: goto -> 889
    //   881: ldc2_w -224473644
    //   884: l2i
    //   885: ldc_w -434020275
    //   888: ixor
    //   889: ldc2_w -1472751602
    //   892: l2i
    //   893: ldc_w 709417021
    //   896: ixor
    //   897: ixor
    //   898: tableswitch default -> 870, -1765741143 -> 920, -1765741142 -> 2035
    //   920: getstatic Perryc.0 : I
    //   923: ifle -> 937
    //   926: ldc2_w 1129631095
    //   929: l2i
    //   930: ldc_w 2041373525
    //   933: ixor
    //   934: goto -> 945
    //   937: ldc2_w -368288596
    //   940: l2i
    //   941: ldc_w 832223878
    //   944: ixor
    //   945: ldc2_w 1962074803
    //   948: l2i
    //   949: ldc_w 862325205
    //   952: ixor
    //   953: ixor
    //   954: lookupswitch default -> 980, 1953612429 -> 937, 2104280388 -> 4328
    //   980: aload_2
    //   981: getstatic Perryc.0 : I
    //   984: ifle -> 998
    //   987: ldc2_w 1859997141
    //   990: l2i
    //   991: ldc_w 880113901
    //   994: ixor
    //   995: goto -> 1006
    //   998: ldc2_w -1175267590
    //   1001: l2i
    //   1002: ldc_w -942158349
    //   1005: ixor
    //   1006: ldc2_w -144747143
    //   1009: l2i
    //   1010: ldc_w 1479199891
    //   1013: ixor
    //   1014: ixor
    //   1015: lookupswitch default -> 4324, -783252765 -> 1040, -170021678 -> 998
    //   1040: getstatic bigname/zprestige/webhack/manager/EventManager.mc : Lnet/minecraft/client/Minecraft;
    //   1043: getstatic Perryc.1 : I
    //   1046: ifeq -> 1060
    //   1049: ldc2_w -562377381
    //   1052: l2i
    //   1053: ldc_w 56394794
    //   1056: ixor
    //   1057: goto -> 1068
    //   1060: ldc2_w -354001905
    //   1063: l2i
    //   1064: ldc_w -333867054
    //   1067: ixor
    //   1068: ldc2_w 1403105001
    //   1071: l2i
    //   1072: ldc_w -1402019941
    //   1075: ixor
    //   1076: ixor
    //   1077: lookupswitch default -> 4348, -114246993 -> 1104, 585709571 -> 1060
    //   1104: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1107: getstatic Perryc.c : I
    //   1110: iflt -> 1124
    //   1113: ldc2_w 966091314
    //   1116: l2i
    //   1117: ldc_w 2146409638
    //   1120: ixor
    //   1121: goto -> 1132
    //   1124: ldc2_w -1453946806
    //   1127: l2i
    //   1128: ldc_w -1801902646
    //   1131: ixor
    //   1132: ldc2_w -642810748
    //   1135: l2i
    //   1136: ldc_w 1304968857
    //   1139: ixor
    //   1140: ixor
    //   1141: lookupswitch default -> 1168, -769803127 -> 4358, 108444433 -> 1124
    //   1168: goto -> 1172
    //   1171: athrow
    //   1172: invokevirtual func_149161_a : (Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
    //   1175: goto -> 1179
    //   1178: athrow
    //   1179: instanceof net/minecraft/entity/player/EntityPlayer
    //   1182: ifeq -> 1196
    //   1185: ldc2_w -1300334937
    //   1188: l2i
    //   1189: ldc_w 223169946
    //   1192: ixor
    //   1193: goto -> 1204
    //   1196: ldc2_w -839346492
    //   1199: l2i
    //   1200: ldc_w 1925950918
    //   1203: ixor
    //   1204: ldc2_w -191124801
    //   1207: l2i
    //   1208: ldc_w 1820021341
    //   1211: ixor
    //   1212: ixor
    //   1213: tableswitch default -> 1185, 668189663 -> 1236, 668189664 -> 2035
    //   1236: getstatic Perryc.c : I
    //   1239: iflt -> 1253
    //   1242: ldc2_w -632912431
    //   1245: l2i
    //   1246: ldc_w 2000697559
    //   1249: ixor
    //   1250: goto -> 1261
    //   1253: ldc2_w -1023120885
    //   1256: l2i
    //   1257: ldc_w 1093803019
    //   1260: ixor
    //   1261: ldc2_w 777606138
    //   1264: l2i
    //   1265: ldc_w -2031595725
    //   1268: ixor
    //   1269: ixor
    //   1270: lookupswitch default -> 1296, -1793606616 -> 1253, 95920591 -> 4280
    //   1296: aload_2
    //   1297: getstatic Perryc.0 : I
    //   1300: ifle -> 1314
    //   1303: ldc2_w -704197687
    //   1306: l2i
    //   1307: ldc_w -169549890
    //   1310: ixor
    //   1311: goto -> 1322
    //   1314: ldc2_w 103021603
    //   1317: l2i
    //   1318: ldc_w -1984901747
    //   1321: ixor
    //   1322: ldc2_w -1725312347
    //   1325: l2i
    //   1326: ldc_w -73823771
    //   1329: ixor
    //   1330: ixor
    //   1331: lookupswitch default -> 1356, -787519927 -> 1314, 1095913271 -> 4302
    //   1356: getstatic bigname/zprestige/webhack/manager/EventManager.mc : Lnet/minecraft/client/Minecraft;
    //   1359: getstatic Perryc.0 : I
    //   1362: ifle -> 1376
    //   1365: ldc2_w -1946151110
    //   1368: l2i
    //   1369: ldc_w -60038100
    //   1372: ixor
    //   1373: goto -> 1384
    //   1376: ldc2_w 963487418
    //   1379: l2i
    //   1380: ldc_w 925974913
    //   1383: ixor
    //   1384: ldc2_w -1931603563
    //   1387: l2i
    //   1388: ldc_w -1047314153
    //   1391: ixor
    //   1392: ixor
    //   1393: lookupswitch default -> 4352, 1025942420 -> 1376, 1125234617 -> 1420
    //   1420: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1423: getstatic Perryc.1 : I
    //   1426: ifeq -> 1440
    //   1429: ldc2_w 1144131023
    //   1432: l2i
    //   1433: ldc_w -1653130090
    //   1436: ixor
    //   1437: goto -> 1448
    //   1440: ldc2_w -1730674151
    //   1443: l2i
    //   1444: ldc_w -1880166461
    //   1447: ixor
    //   1448: ldc2_w -2139383137
    //   1451: l2i
    //   1452: ldc_w 843017224
    //   1455: ixor
    //   1456: ixor
    //   1457: lookupswitch default -> 4356, -1519248563 -> 1484, 1795278798 -> 1440
    //   1484: goto -> 1488
    //   1487: athrow
    //   1488: invokevirtual func_149161_a : (Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
    //   1491: goto -> 1495
    //   1494: athrow
    //   1495: checkcast net/minecraft/entity/player/EntityPlayer
    //   1498: getstatic Perryc.c : I
    //   1501: iflt -> 1515
    //   1504: ldc2_w 1555579005
    //   1507: l2i
    //   1508: ldc_w 745083360
    //   1511: ixor
    //   1512: goto -> 1523
    //   1515: ldc2_w 1612303744
    //   1518: l2i
    //   1519: ldc_w -1257712348
    //   1522: ixor
    //   1523: ldc2_w 1200528812
    //   1526: l2i
    //   1527: ldc_w 647494719
    //   1530: ixor
    //   1531: ixor
    //   1532: lookupswitch default -> 4290, -1274513097 -> 1560, 298332174 -> 1515
    //   1560: astore_3
    //   1561: getstatic Perryc.1 : I
    //   1564: ifeq -> 1578
    //   1567: ldc2_w -177841411
    //   1570: l2i
    //   1571: ldc_w -1696396299
    //   1574: ixor
    //   1575: goto -> 1586
    //   1578: ldc2_w -935148458
    //   1581: l2i
    //   1582: ldc_w -64831408
    //   1585: ixor
    //   1586: ldc2_w -1615771207
    //   1589: l2i
    //   1590: ldc_w 595423655
    //   1593: ixor
    //   1594: ixor
    //   1595: lookupswitch default -> 4272, -2001978344 -> 1620, -750163690 -> 1578
    //   1620: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lnet/minecraftforge/fml/common/eventhandler/EventBus;
    //   1623: new bigname/zprestige/webhack/event/events/TotemPopEvent
    //   1626: dup
    //   1627: getstatic Perryc.1 : I
    //   1630: ifeq -> 1644
    //   1633: ldc2_w 524568479
    //   1636: l2i
    //   1637: ldc_w -1717886646
    //   1640: ixor
    //   1641: goto -> 1652
    //   1644: ldc2_w 1289891920
    //   1647: l2i
    //   1648: ldc_w 309646660
    //   1651: ixor
    //   1652: ldc2_w -815806913
    //   1655: l2i
    //   1656: ldc_w -825108124
    //   1659: ixor
    //   1660: ixor
    //   1661: lookupswitch default -> 4304, -2024703602 -> 1644, 1595472463 -> 1688
    //   1688: aload_3
    //   1689: getstatic Perryc.0 : I
    //   1692: ifle -> 1706
    //   1695: ldc2_w -1508169630
    //   1698: l2i
    //   1699: ldc_w 1993614863
    //   1702: ixor
    //   1703: goto -> 1714
    //   1706: ldc2_w -1392217643
    //   1709: l2i
    //   1710: ldc_w 1279880783
    //   1713: ixor
    //   1714: ldc2_w -1519581391
    //   1717: l2i
    //   1718: ldc_w -1378565197
    //   1721: ixor
    //   1722: ixor
    //   1723: lookupswitch default -> 1748, -1059242945 -> 1706, -663303441 -> 4380
    //   1748: goto -> 1752
    //   1751: athrow
    //   1752: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   1755: goto -> 1759
    //   1758: athrow
    //   1759: getstatic Perryc.c : I
    //   1762: iflt -> 1776
    //   1765: ldc2_w -1655491797
    //   1768: l2i
    //   1769: ldc_w -618096670
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w 858685620
    //   1779: l2i
    //   1780: ldc_w 745494384
    //   1783: ixor
    //   1784: ldc2_w -945317427
    //   1787: l2i
    //   1788: ldc_w -760972327
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 4278, 172111312 -> 1820, 1400391389 -> 1776
    //   1820: goto -> 1824
    //   1823: athrow
    //   1824: invokevirtual post : (Lnet/minecraftforge/fml/common/eventhandler/Event;)Z
    //   1827: goto -> 1831
    //   1830: athrow
    //   1831: pop
    //   1832: getstatic Perryc.1 : I
    //   1835: ifeq -> 1849
    //   1838: ldc2_w -1014021531
    //   1841: l2i
    //   1842: ldc_w -1688552073
    //   1845: ixor
    //   1846: goto -> 1857
    //   1849: ldc2_w 94060453
    //   1852: l2i
    //   1853: ldc_w 50745257
    //   1856: ixor
    //   1857: ldc2_w 1713828907
    //   1860: l2i
    //   1861: ldc_w -1920008016
    //   1864: ixor
    //   1865: ixor
    //   1866: lookupswitch default -> 4282, -1283716215 -> 1849, -315325289 -> 1892
    //   1892: goto -> 1896
    //   1895: athrow
    //   1896: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   1899: goto -> 1903
    //   1902: athrow
    //   1903: getstatic Perryc.1 : I
    //   1906: ifeq -> 1920
    //   1909: ldc2_w -233107310
    //   1912: l2i
    //   1913: ldc_w -532230783
    //   1916: ixor
    //   1917: goto -> 1928
    //   1920: ldc2_w -215891408
    //   1923: l2i
    //   1924: ldc_w 1018456369
    //   1927: ixor
    //   1928: ldc2_w 852411939
    //   1931: l2i
    //   1932: ldc_w -611094061
    //   1935: ixor
    //   1936: ixor
    //   1937: lookupswitch default -> 1964, -395777860 -> 1920, -83858717 -> 4354
    //   1964: aload_3
    //   1965: getstatic Perryc.c : I
    //   1968: iflt -> 1982
    //   1971: ldc2_w -276816311
    //   1974: l2i
    //   1975: ldc_w -1509977964
    //   1978: ixor
    //   1979: goto -> 1990
    //   1982: ldc2_w -530306610
    //   1985: l2i
    //   1986: ldc_w -1499187488
    //   1989: ixor
    //   1990: ldc2_w 961079656
    //   1993: l2i
    //   1994: ldc_w 333553056
    //   1997: ixor
    //   1998: ixor
    //   1999: lookupswitch default -> 4308, 1624701461 -> 1982, 1818848230 -> 2024
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokevirtual onTotemPop : (Lnet/minecraft/entity/player/EntityPlayer;)V
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: getstatic Perryc.c : I
    //   2038: iflt -> 2052
    //   2041: ldc2_w 400339655
    //   2044: l2i
    //   2045: ldc_w -1275539852
    //   2048: ixor
    //   2049: goto -> 2060
    //   2052: ldc2_w -709478534
    //   2055: l2i
    //   2056: ldc_w 1045044516
    //   2059: ixor
    //   2060: ldc2_w -1877381865
    //   2063: l2i
    //   2064: ldc_w 1747585912
    //   2067: ixor
    //   2068: ixor
    //   2069: lookupswitch default -> 4298, 332352561 -> 2096, 1545018076 -> 2052
    //   2096: aload_1
    //   2097: getstatic Perryc.0 : I
    //   2100: ifle -> 2114
    //   2103: ldc2_w -404811341
    //   2106: l2i
    //   2107: ldc_w -1182008599
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w 1682980788
    //   2117: l2i
    //   2118: ldc_w 1685658387
    //   2121: ixor
    //   2122: ldc2_w 680879526
    //   2125: l2i
    //   2126: ldc_w -1833995841
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 2156, -578551089 -> 2114, -462487741 -> 4330
    //   2156: goto -> 2160
    //   2159: athrow
    //   2160: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   2163: goto -> 2167
    //   2166: athrow
    //   2167: instanceof net/minecraft/network/play/server/SPacketPlayerListItem
    //   2170: ifeq -> 2184
    //   2173: ldc2_w 1818560468
    //   2176: l2i
    //   2177: ldc_w -1583850208
    //   2180: ixor
    //   2181: goto -> 2192
    //   2184: ldc2_w 1197992834
    //   2187: l2i
    //   2188: ldc_w -1969573515
    //   2191: ixor
    //   2192: ldc2_w -1922705281
    //   2195: l2i
    //   2196: ldc_w -1408332934
    //   2199: ixor
    //   2200: ixor
    //   2201: tableswitch default -> 2173, -325711375 -> 2224, -325711374 -> 3949
    //   2224: getstatic Perryc.1 : I
    //   2227: ifeq -> 2241
    //   2230: ldc2_w 251104396
    //   2233: l2i
    //   2234: ldc_w -1133493441
    //   2237: ixor
    //   2238: goto -> 2249
    //   2241: ldc2_w 583573867
    //   2244: l2i
    //   2245: ldc_w -916233867
    //   2248: ixor
    //   2249: ldc2_w 1798927009
    //   2252: l2i
    //   2253: ldc_w 1038617251
    //   2256: ixor
    //   2257: ixor
    //   2258: lookupswitch default -> 2284, -464078927 -> 4286, -26578239 -> 2241
    //   2284: goto -> 2288
    //   2287: athrow
    //   2288: invokestatic fullNullCheck : ()Z
    //   2291: goto -> 2295
    //   2294: athrow
    //   2295: ifne -> 2309
    //   2298: ldc2_w 525142303
    //   2301: l2i
    //   2302: ldc_w -712582714
    //   2305: ixor
    //   2306: goto -> 2317
    //   2309: ldc2_w -402249618
    //   2312: l2i
    //   2313: ldc_w 583923888
    //   2316: ixor
    //   2317: ldc2_w -984684314
    //   2320: l2i
    //   2321: ldc_w -2059492172
    //   2324: ixor
    //   2325: ixor
    //   2326: tableswitch default -> 2298, -1967416181 -> 2348, -1967416180 -> 3949
    //   2348: getstatic Perryc.0 : I
    //   2351: ifle -> 2365
    //   2354: ldc2_w 1133904378
    //   2357: l2i
    //   2358: ldc_w -651853301
    //   2361: ixor
    //   2362: goto -> 2373
    //   2365: ldc2_w -321617812
    //   2368: l2i
    //   2369: ldc_w 731046824
    //   2372: ixor
    //   2373: ldc2_w -1911392921
    //   2376: l2i
    //   2377: ldc_w -524747615
    //   2380: ixor
    //   2381: ixor
    //   2382: lookupswitch default -> 4292, -1444091390 -> 2408, -199685577 -> 2365
    //   2408: aload_0
    //   2409: getstatic Perryc.c : I
    //   2412: iflt -> 2426
    //   2415: ldc2_w 1792405395
    //   2418: l2i
    //   2419: ldc_w -1068746904
    //   2422: ixor
    //   2423: goto -> 2434
    //   2426: ldc2_w 1756160513
    //   2429: l2i
    //   2430: ldc_w 294282837
    //   2433: ixor
    //   2434: ldc2_w 1751617366
    //   2437: l2i
    //   2438: ldc_w -1248119286
    //   2441: ixor
    //   2442: ixor
    //   2443: lookupswitch default -> 4360, -1529201400 -> 2468, 2003132839 -> 2426
    //   2468: getfield logoutTimer : Lbigname/zprestige/webhack/util/Timer;
    //   2471: ldc2_w 6.4282562840162045
    //   2474: invokestatic doubleToLongBits : (D)J
    //   2477: ldc2_w 9217098811123998677
    //   2480: lxor
    //   2481: invokestatic longBitsToDouble : (J)D
    //   2484: getstatic Perryc.1 : I
    //   2487: ifeq -> 2501
    //   2490: ldc2_w -324573587
    //   2493: l2i
    //   2494: ldc_w 1721180160
    //   2497: ixor
    //   2498: goto -> 2509
    //   2501: ldc2_w -716096331
    //   2504: l2i
    //   2505: ldc_w -2109696693
    //   2508: ixor
    //   2509: ldc2_w -1349710871
    //   2512: l2i
    //   2513: ldc_w -1552375307
    //   2516: ixor
    //   2517: ixor
    //   2518: lookupswitch default -> 2544, -2033849231 -> 4326, 1499942219 -> 2501
    //   2544: goto -> 2548
    //   2547: athrow
    //   2548: invokevirtual passedS : (D)Z
    //   2551: goto -> 2555
    //   2554: athrow
    //   2555: ifeq -> 2569
    //   2558: ldc2_w -652620883
    //   2561: l2i
    //   2562: ldc_w 1220727944
    //   2565: ixor
    //   2566: goto -> 2577
    //   2569: ldc2_w -1904049950
    //   2572: l2i
    //   2573: ldc_w 525967304
    //   2576: ixor
    //   2577: ldc2_w -755052225
    //   2580: l2i
    //   2581: ldc_w -305729059
    //   2584: ixor
    //   2585: ixor
    //   2586: tableswitch default -> 2558, -1360838713 -> 2608, -1360838712 -> 3949
    //   2608: getstatic Perryc.1 : I
    //   2611: ifeq -> 2625
    //   2614: ldc2_w -1788166872
    //   2617: l2i
    //   2618: ldc_w -1129028392
    //   2621: ixor
    //   2622: goto -> 2633
    //   2625: ldc2_w 338358181
    //   2628: l2i
    //   2629: ldc_w 1911552228
    //   2632: ixor
    //   2633: ldc2_w 1595948176
    //   2636: l2i
    //   2637: ldc_w 1306788044
    //   2640: ixor
    //   2641: ixor
    //   2642: lookupswitch default -> 2668, 225405180 -> 2625, 991618476 -> 4318
    //   2668: aload_1
    //   2669: getstatic Perryc.1 : I
    //   2672: ifeq -> 2686
    //   2675: ldc2_w -736205879
    //   2678: l2i
    //   2679: ldc_w 2129593355
    //   2682: ixor
    //   2683: goto -> 2694
    //   2686: ldc2_w 1118490506
    //   2689: l2i
    //   2690: ldc_w -1040610743
    //   2693: ixor
    //   2694: ldc2_w 1136216011
    //   2697: l2i
    //   2698: ldc_w 1556552340
    //   2701: ixor
    //   2702: ixor
    //   2703: lookupswitch default -> 2728, -1248904547 -> 4342, 312311727 -> 2686
    //   2728: goto -> 2732
    //   2731: athrow
    //   2732: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   2735: goto -> 2739
    //   2738: athrow
    //   2739: checkcast net/minecraft/network/play/server/SPacketPlayerListItem
    //   2742: getstatic Perryc.c : I
    //   2745: iflt -> 2759
    //   2748: ldc2_w -776169393
    //   2751: l2i
    //   2752: ldc_w -1258534837
    //   2755: ixor
    //   2756: goto -> 2767
    //   2759: ldc2_w -1256489340
    //   2762: l2i
    //   2763: ldc_w -2137325865
    //   2766: ixor
    //   2767: ldc2_w -1944175495
    //   2770: l2i
    //   2771: ldc_w 332684660
    //   2774: ixor
    //   2775: ixor
    //   2776: lookupswitch default -> 2804, -1132817644 -> 2759, -91574007 -> 4314
    //   2804: astore_2
    //   2805: getstatic Perryc.c : I
    //   2808: iflt -> 2822
    //   2811: ldc2_w -583692178
    //   2814: l2i
    //   2815: ldc_w 448680480
    //   2818: ixor
    //   2819: goto -> 2830
    //   2822: ldc2_w -1071943429
    //   2825: l2i
    //   2826: ldc_w -646002430
    //   2829: ixor
    //   2830: ldc2_w -1955088103
    //   2833: l2i
    //   2834: ldc_w -2092503943
    //   2837: ixor
    //   2838: ixor
    //   2839: lookupswitch default -> 2864, -1875196344 -> 2822, -809855186 -> 4332
    //   2864: getstatic net/minecraft/network/play/server/SPacketPlayerListItem$Action.ADD_PLAYER : Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
    //   2867: getstatic Perryc.0 : I
    //   2870: ifle -> 2884
    //   2873: ldc2_w 281597641
    //   2876: l2i
    //   2877: ldc_w 254882711
    //   2880: ixor
    //   2881: goto -> 2892
    //   2884: ldc2_w 1445228804
    //   2887: l2i
    //   2888: ldc_w -1275576299
    //   2891: ixor
    //   2892: ldc2_w 2138638010
    //   2895: l2i
    //   2896: ldc_w 1429871436
    //   2899: ixor
    //   2900: ixor
    //   2901: lookupswitch default -> 4334, -811651865 -> 2928, 901445800 -> 2884
    //   2928: aload_2
    //   2929: getstatic Perryc.0 : I
    //   2932: ifle -> 2946
    //   2935: ldc2_w -564054040
    //   2938: l2i
    //   2939: ldc_w 781558635
    //   2942: ixor
    //   2943: goto -> 2954
    //   2946: ldc2_w 843887072
    //   2949: l2i
    //   2950: ldc_w -24961717
    //   2953: ixor
    //   2954: ldc2_w 720950427
    //   2957: l2i
    //   2958: ldc_w -591648712
    //   2961: ixor
    //   2962: ixor
    //   2963: lookupswitch default -> 4372, 112224288 -> 2946, 982208520 -> 2988
    //   2988: goto -> 2992
    //   2991: athrow
    //   2992: invokevirtual func_179768_b : ()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
    //   2995: goto -> 2999
    //   2998: athrow
    //   2999: getstatic Perryc.c : I
    //   3002: iflt -> 3016
    //   3005: ldc2_w -1382725407
    //   3008: l2i
    //   3009: ldc_w -327954280
    //   3012: ixor
    //   3013: goto -> 3024
    //   3016: ldc2_w -416741479
    //   3019: l2i
    //   3020: ldc_w -519930913
    //   3023: ixor
    //   3024: ldc2_w 230890144
    //   3027: l2i
    //   3028: ldc_w 685848476
    //   3031: ixor
    //   3032: ixor
    //   3033: lookupswitch default -> 4376, 587813242 -> 3060, 1690613061 -> 3016
    //   3060: goto -> 3064
    //   3063: athrow
    //   3064: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3067: goto -> 3071
    //   3070: athrow
    //   3071: ifne -> 3085
    //   3074: ldc2_w 951999927
    //   3077: l2i
    //   3078: ldc_w 783460060
    //   3081: ixor
    //   3082: goto -> 3093
    //   3085: ldc2_w -546206429
    //   3088: l2i
    //   3089: ldc_w -914525769
    //   3092: ixor
    //   3093: ldc2_w -1740943055
    //   3096: l2i
    //   3097: ldc_w 166666661
    //   3100: ixor
    //   3101: ixor
    //   3102: tableswitch default -> 3074, -2015851521 -> 3124, -2015851520 -> 3445
    //   3124: getstatic Perryc.c : I
    //   3127: iflt -> 3141
    //   3130: ldc2_w -48570257
    //   3133: l2i
    //   3134: ldc_w 1676706444
    //   3137: ixor
    //   3138: goto -> 3149
    //   3141: ldc2_w 911916810
    //   3144: l2i
    //   3145: ldc_w 974116922
    //   3148: ixor
    //   3149: ldc2_w -136091703
    //   3152: l2i
    //   3153: ldc_w 1369976953
    //   3156: ixor
    //   3157: ixor
    //   3158: lookupswitch default -> 4344, -1440862080 -> 3184, 950089043 -> 3141
    //   3184: getstatic net/minecraft/network/play/server/SPacketPlayerListItem$Action.REMOVE_PLAYER : Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
    //   3187: getstatic Perryc.0 : I
    //   3190: ifle -> 3204
    //   3193: ldc2_w -1353401895
    //   3196: l2i
    //   3197: ldc_w 62044961
    //   3200: ixor
    //   3201: goto -> 3212
    //   3204: ldc2_w -951383170
    //   3207: l2i
    //   3208: ldc_w 649921094
    //   3211: ixor
    //   3212: ldc2_w -1986874964
    //   3215: l2i
    //   3216: ldc_w -623458412
    //   3219: ixor
    //   3220: ixor
    //   3221: lookupswitch default -> 4364, -1296924928 -> 3248, -6130496 -> 3204
    //   3248: aload_2
    //   3249: getstatic Perryc.0 : I
    //   3252: ifle -> 3266
    //   3255: ldc2_w 1698648492
    //   3258: l2i
    //   3259: ldc_w 1212235487
    //   3262: ixor
    //   3263: goto -> 3274
    //   3266: ldc2_w 1341812660
    //   3269: l2i
    //   3270: ldc_w 1790192127
    //   3273: ixor
    //   3274: ldc2_w -1271850913
    //   3277: l2i
    //   3278: ldc_w 2012433433
    //   3281: ixor
    //   3282: ixor
    //   3283: lookupswitch default -> 3308, -289653963 -> 4374, 1758405659 -> 3266
    //   3308: goto -> 3312
    //   3311: athrow
    //   3312: invokevirtual func_179768_b : ()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
    //   3315: goto -> 3319
    //   3318: athrow
    //   3319: getstatic Perryc.1 : I
    //   3322: ifeq -> 3336
    //   3325: ldc2_w -913787889
    //   3328: l2i
    //   3329: ldc_w 542000299
    //   3332: ixor
    //   3333: goto -> 3344
    //   3336: ldc2_w 792875101
    //   3339: l2i
    //   3340: ldc_w 1787575865
    //   3343: ixor
    //   3344: ldc2_w 1856802078
    //   3347: l2i
    //   3348: ldc_w -1307417283
    //   3351: ixor
    //   3352: ixor
    //   3353: lookupswitch default -> 3380, -1813555287 -> 3336, 897063047 -> 4294
    //   3380: goto -> 3384
    //   3383: athrow
    //   3384: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3387: goto -> 3391
    //   3390: athrow
    //   3391: ifne -> 3405
    //   3394: ldc2_w -1962698126
    //   3397: l2i
    //   3398: ldc_w 1572353128
    //   3401: ixor
    //   3402: goto -> 3413
    //   3405: ldc2_w 1465947037
    //   3408: l2i
    //   3409: ldc_w -2116338298
    //   3412: ixor
    //   3413: ldc2_w 1986861225
    //   3416: l2i
    //   3417: ldc_w 1875722987
    //   3420: ixor
    //   3421: ixor
    //   3422: tableswitch default -> 3394, -820251560 -> 3444, -820251559 -> 3445
    //   3444: return
    //   3445: getstatic Perryc.0 : I
    //   3448: ifle -> 3462
    //   3451: ldc2_w 1254146062
    //   3454: l2i
    //   3455: ldc_w 2054589548
    //   3458: ixor
    //   3459: goto -> 3470
    //   3462: ldc2_w 1186017754
    //   3465: l2i
    //   3466: ldc_w 828856012
    //   3469: ixor
    //   3470: ldc2_w -939884832
    //   3473: l2i
    //   3474: ldc_w 50951812
    //   3477: ixor
    //   3478: ixor
    //   3479: lookupswitch default -> 4276, -1289392270 -> 3504, -196787194 -> 3462
    //   3504: aload_2
    //   3505: getstatic Perryc.0 : I
    //   3508: ifle -> 3522
    //   3511: ldc2_w -1920714801
    //   3514: l2i
    //   3515: ldc_w 1574577706
    //   3518: ixor
    //   3519: goto -> 3530
    //   3522: ldc2_w -721890595
    //   3525: l2i
    //   3526: ldc_w 808513461
    //   3529: ixor
    //   3530: ldc2_w -1142668374
    //   3533: l2i
    //   3534: ldc_w -367030385
    //   3537: ixor
    //   3538: ixor
    //   3539: lookupswitch default -> 4320, -2119836224 -> 3522, -1254887091 -> 3564
    //   3564: goto -> 3568
    //   3567: athrow
    //   3568: invokevirtual func_179767_a : ()Ljava/util/List;
    //   3571: goto -> 3575
    //   3574: athrow
    //   3575: getstatic Perryc.c : I
    //   3578: iflt -> 3592
    //   3581: ldc2_w 2093704758
    //   3584: l2i
    //   3585: ldc_w 939948516
    //   3588: ixor
    //   3589: goto -> 3600
    //   3592: ldc2_w 2043037016
    //   3595: l2i
    //   3596: ldc_w -758349772
    //   3599: ixor
    //   3600: ldc2_w -1189474304
    //   3603: l2i
    //   3604: ldc_w -1935500956
    //   3607: ixor
    //   3608: ixor
    //   3609: lookupswitch default -> 4336, -1632482296 -> 3636, 1903531702 -> 3592
    //   3636: goto -> 3640
    //   3639: athrow
    //   3640: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   3645: goto -> 3649
    //   3648: athrow
    //   3649: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   3654: getstatic Perryc.c : I
    //   3657: iflt -> 3671
    //   3660: ldc2_w -1037508604
    //   3663: l2i
    //   3664: ldc_w -648326603
    //   3667: ixor
    //   3668: goto -> 3679
    //   3671: ldc2_w -1830138462
    //   3674: l2i
    //   3675: ldc_w -452910051
    //   3678: ixor
    //   3679: ldc2_w -1538517048
    //   3682: l2i
    //   3683: ldc_w 82669549
    //   3686: ixor
    //   3687: ixor
    //   3688: lookupswitch default -> 4346, -1143813612 -> 3671, -683011686 -> 3716
    //   3716: goto -> 3720
    //   3719: athrow
    //   3720: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   3725: goto -> 3729
    //   3728: athrow
    //   3729: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   3734: getstatic Perryc.c : I
    //   3737: iflt -> 3751
    //   3740: ldc2_w -2117338183
    //   3743: l2i
    //   3744: ldc_w -1042002315
    //   3747: ixor
    //   3748: goto -> 3759
    //   3751: ldc2_w -368584537
    //   3754: l2i
    //   3755: ldc_w -1872087277
    //   3758: ixor
    //   3759: ldc2_w -459497301
    //   3762: l2i
    //   3763: ldc_w 926355947
    //   3766: ixor
    //   3767: ixor
    //   3768: lookupswitch default -> 3796, -1820064628 -> 4368, 308667350 -> 3751
    //   3796: goto -> 3800
    //   3799: athrow
    //   3800: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   3805: goto -> 3809
    //   3808: athrow
    //   3809: getstatic Perryc.c : I
    //   3812: iflt -> 3826
    //   3815: ldc2_w -206030975
    //   3818: l2i
    //   3819: ldc_w -320777958
    //   3822: ixor
    //   3823: goto -> 3834
    //   3826: ldc2_w -1718869
    //   3829: l2i
    //   3830: ldc_w 2060370540
    //   3833: ixor
    //   3834: ldc2_w -1077608451
    //   3837: l2i
    //   3838: ldc_w 1927637796
    //   3841: ixor
    //   3842: ixor
    //   3843: lookupswitch default -> 4300, -763825598 -> 3826, 1208652574 -> 3868
    //   3868: aload_2
    //   3869: <illegal opcode> accept : (Lnet/minecraft/network/play/server/SPacketPlayerListItem;)Ljava/util/function/Consumer;
    //   3874: getstatic Perryc.c : I
    //   3877: iflt -> 3891
    //   3880: ldc2_w 554270096
    //   3883: l2i
    //   3884: ldc_w -1165795462
    //   3887: ixor
    //   3888: goto -> 3899
    //   3891: ldc2_w -136938728
    //   3894: l2i
    //   3895: ldc_w -102508942
    //   3898: ixor
    //   3899: ldc2_w -2015401974
    //   3902: l2i
    //   3903: ldc_w 919167214
    //   3906: ixor
    //   3907: ixor
    //   3908: lookupswitch default -> 3936, -807920574 -> 3891, 714877454 -> 4350
    //   3936: goto -> 3940
    //   3939: athrow
    //   3940: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   3945: goto -> 3949
    //   3948: athrow
    //   3949: getstatic Perryc.1 : I
    //   3952: ifeq -> 3966
    //   3955: ldc2_w 1366423593
    //   3958: l2i
    //   3959: ldc_w 1744563648
    //   3962: ixor
    //   3963: goto -> 3974
    //   3966: ldc2_w 2128471716
    //   3969: l2i
    //   3970: ldc_w -209189947
    //   3973: ixor
    //   3974: ldc2_w -1403086309
    //   3977: l2i
    //   3978: ldc_w -1392600009
    //   3981: ixor
    //   3982: ixor
    //   3983: lookupswitch default -> 4378, -1913265331 -> 4008, 908727237 -> 3966
    //   4008: aload_1
    //   4009: getstatic Perryc.1 : I
    //   4012: ifeq -> 4026
    //   4015: ldc2_w -1112589980
    //   4018: l2i
    //   4019: ldc_w 1554827314
    //   4022: ixor
    //   4023: goto -> 4034
    //   4026: ldc2_w 1807611624
    //   4029: l2i
    //   4030: ldc_w 1135335244
    //   4033: ixor
    //   4034: ldc2_w -2004757744
    //   4037: l2i
    //   4038: ldc_w 1148047567
    //   4041: ixor
    //   4042: ixor
    //   4043: lookupswitch default -> 4068, -127397809 -> 4026, 770699913 -> 4312
    //   4068: goto -> 4072
    //   4071: athrow
    //   4072: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   4075: goto -> 4079
    //   4078: athrow
    //   4079: instanceof net/minecraft/network/play/server/SPacketTimeUpdate
    //   4082: ifeq -> 4096
    //   4085: ldc2_w -468220666
    //   4088: l2i
    //   4089: ldc_w 338797316
    //   4092: ixor
    //   4093: goto -> 4104
    //   4096: ldc2_w -938231138
    //   4099: l2i
    //   4100: ldc_w 943037599
    //   4103: ixor
    //   4104: ldc2_w -1680405268
    //   4107: l2i
    //   4108: ldc_w 687499875
    //   4111: ixor
    //   4112: ixor
    //   4113: tableswitch default -> 4085, 1124810893 -> 4136, 1124810894 -> 4271
    //   4136: getstatic Perryc.1 : I
    //   4139: ifeq -> 4153
    //   4142: ldc2_w 74225741
    //   4145: l2i
    //   4146: ldc_w -1764292737
    //   4149: ixor
    //   4150: goto -> 4161
    //   4153: ldc2_w -1063111020
    //   4156: l2i
    //   4157: ldc_w -1309852320
    //   4160: ixor
    //   4161: ldc2_w -258369128
    //   4164: l2i
    //   4165: ldc_w 1476661960
    //   4168: ixor
    //   4169: ixor
    //   4170: lookupswitch default -> 4196, -1125726600 -> 4153, 975574114 -> 4366
    //   4196: getstatic bigname/zprestige/webhack/WebHack.serverManager : Lbigname/zprestige/webhack/manager/ServerManager;
    //   4199: getstatic Perryc.c : I
    //   4202: iflt -> 4216
    //   4205: ldc2_w -1826027709
    //   4208: l2i
    //   4209: ldc_w -2087436436
    //   4212: ixor
    //   4213: goto -> 4224
    //   4216: ldc2_w -40787149
    //   4219: l2i
    //   4220: ldc_w -868411372
    //   4223: ixor
    //   4224: ldc2_w -1123895684
    //   4227: l2i
    //   4228: ldc_w 1364304149
    //   4231: ixor
    //   4232: ixor
    //   4233: lookupswitch default -> 4296, -570446770 -> 4260, -51499194 -> 4216
    //   4260: goto -> 4264
    //   4263: athrow
    //   4264: invokevirtual update : ()V
    //   4267: goto -> 4271
    //   4270: athrow
    //   4271: return
    //   4272: aconst_null
    //   4273: athrow
    //   4274: aconst_null
    //   4275: athrow
    //   4276: aconst_null
    //   4277: athrow
    //   4278: aconst_null
    //   4279: athrow
    //   4280: aconst_null
    //   4281: athrow
    //   4282: aconst_null
    //   4283: athrow
    //   4284: aconst_null
    //   4285: athrow
    //   4286: aconst_null
    //   4287: athrow
    //   4288: aconst_null
    //   4289: athrow
    //   4290: aconst_null
    //   4291: athrow
    //   4292: aconst_null
    //   4293: athrow
    //   4294: aconst_null
    //   4295: athrow
    //   4296: aconst_null
    //   4297: athrow
    //   4298: aconst_null
    //   4299: athrow
    //   4300: aconst_null
    //   4301: athrow
    //   4302: aconst_null
    //   4303: athrow
    //   4304: aconst_null
    //   4305: athrow
    //   4306: aconst_null
    //   4307: athrow
    //   4308: aconst_null
    //   4309: athrow
    //   4310: aconst_null
    //   4311: athrow
    //   4312: aconst_null
    //   4313: athrow
    //   4314: aconst_null
    //   4315: athrow
    //   4316: aconst_null
    //   4317: athrow
    //   4318: aconst_null
    //   4319: athrow
    //   4320: aconst_null
    //   4321: athrow
    //   4322: aconst_null
    //   4323: athrow
    //   4324: aconst_null
    //   4325: athrow
    //   4326: aconst_null
    //   4327: athrow
    //   4328: aconst_null
    //   4329: athrow
    //   4330: aconst_null
    //   4331: athrow
    //   4332: aconst_null
    //   4333: athrow
    //   4334: aconst_null
    //   4335: athrow
    //   4336: aconst_null
    //   4337: athrow
    //   4338: aconst_null
    //   4339: athrow
    //   4340: aconst_null
    //   4341: athrow
    //   4342: aconst_null
    //   4343: athrow
    //   4344: aconst_null
    //   4345: athrow
    //   4346: aconst_null
    //   4347: athrow
    //   4348: aconst_null
    //   4349: athrow
    //   4350: aconst_null
    //   4351: athrow
    //   4352: aconst_null
    //   4353: athrow
    //   4354: aconst_null
    //   4355: athrow
    //   4356: aconst_null
    //   4357: athrow
    //   4358: aconst_null
    //   4359: athrow
    //   4360: aconst_null
    //   4361: athrow
    //   4362: aconst_null
    //   4363: athrow
    //   4364: aconst_null
    //   4365: athrow
    //   4366: aconst_null
    //   4367: athrow
    //   4368: aconst_null
    //   4369: athrow
    //   4370: aconst_null
    //   4371: athrow
    //   4372: aconst_null
    //   4373: athrow
    //   4374: aconst_null
    //   4375: athrow
    //   4376: aconst_null
    //   4377: athrow
    //   4378: aconst_null
    //   4379: athrow
    //   4380: aconst_null
    //   4381: athrow
    //   4382: pop
    //   4383: goto -> 24
    //   4386: pop
    //   4387: aconst_null
    //   4388: goto -> 4382
    //   4391: dup
    //   4392: ifnull -> 4382
    //   4395: checkcast java/lang/Throwable
    //   4398: athrow
    //   4399: dup
    //   4400: ifnull -> 4386
    //   4403: checkcast java/lang/Throwable
    //   4406: athrow
    //   4407: aconst_null
    //   4408: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1561	474	3	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   729	1306	2	packet	Lnet/minecraft/network/play/server/SPacketEntityStatus;
    //   2805	1144	2	packet	Lnet/minecraft/network/play/server/SPacketPlayerListItem;
    //   24	4248	0	this	Lbigname/zprestige/webhack/manager/EventManager;
    //   24	4248	1	event	Lbigname/zprestige/webhack/event/events/PacketEvent$Receive;
    // Exception table:
    //   from	to	target	type
    //   8	20	4391	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	java/lang/NullPointerException
    //   148	154	154	java/lang/NumberFormatException
    //   148	154	3	java/lang/AssertionError
    //   335	342	342	finally
    //   336	342	342	finally
    //   336	342	342	finally
    //   336	342	335	finally
    //   336	342	3	finally
    //   467	474	474	finally
    //   467	474	474	finally
    //   467	474	474	java/lang/RuntimeException
    //   468	474	467	finally
    //   468	474	474	finally
    //   656	662	662	finally
    //   656	662	662	finally
    //   656	662	662	java/lang/ArrayIndexOutOfBoundsException
    //   656	662	3	finally
    //   656	662	662	java/lang/AssertionError
    //   852	858	858	finally
    //   852	858	858	finally
    //   852	858	3	finally
    //   852	858	3	java/lang/IllegalArgumentException
    //   852	858	3	java/lang/IllegalArgumentException
    //   1171	1178	1178	finally
    //   1171	1178	1171	java/lang/IllegalArgumentException
    //   1171	1178	3	java/lang/NumberFormatException
    //   1171	1178	1178	java/lang/NegativeArraySizeException
    //   1172	1178	1178	java/lang/NegativeArraySizeException
    //   1487	1494	1494	finally
    //   1487	1494	1494	java/lang/NegativeArraySizeException
    //   1487	1494	3	finally
    //   1488	1494	3	java/lang/NegativeArraySizeException
    //   1488	1494	1487	java/lang/ArithmeticException
    //   1751	1758	1758	finally
    //   1751	1758	1751	java/lang/ArithmeticException
    //   1751	1758	1751	finally
    //   1751	1758	1758	java/lang/StringIndexOutOfBoundsException
    //   1752	1758	3	finally
    //   1823	1830	1830	finally
    //   1823	1830	1823	java/lang/IllegalArgumentException
    //   1823	1830	1823	finally
    //   1824	1830	1823	finally
    //   1824	1830	3	java/lang/StringIndexOutOfBoundsException
    //   1895	1902	1902	finally
    //   1895	1902	1895	java/lang/IllegalArgumentException
    //   1895	1902	1902	finally
    //   1895	1902	1902	java/lang/IndexOutOfBoundsException
    //   1895	1902	1895	java/lang/IllegalStateException
    //   2028	2034	2034	finally
    //   2028	2034	2034	finally
    //   2028	2034	3	java/lang/ArrayIndexOutOfBoundsException
    //   2028	2034	2034	java/lang/NullPointerException
    //   2028	2034	3	java/lang/ArrayIndexOutOfBoundsException
    //   2159	2166	2166	finally
    //   2159	2166	2159	java/lang/NullPointerException
    //   2159	2166	2159	java/lang/IllegalStateException
    //   2160	2166	3	java/util/NoSuchElementException
    //   2160	2166	3	java/lang/RuntimeException
    //   2287	2294	2294	finally
    //   2287	2294	2287	java/lang/ClassCastException
    //   2287	2294	2294	finally
    //   2287	2294	2287	java/lang/ArrayIndexOutOfBoundsException
    //   2288	2294	2294	java/lang/IllegalStateException
    //   2547	2554	2554	finally
    //   2547	2554	2547	java/lang/IllegalStateException
    //   2547	2554	2547	finally
    //   2547	2554	2547	finally
    //   2548	2554	3	java/lang/NullPointerException
    //   2731	2738	2738	finally
    //   2731	2738	2731	finally
    //   2731	2738	3	finally
    //   2732	2738	2731	java/lang/NumberFormatException
    //   2732	2738	2738	java/lang/RuntimeException
    //   2991	2998	2998	finally
    //   2991	2998	2991	java/lang/ArithmeticException
    //   2991	2998	2998	finally
    //   2991	2998	3	java/lang/RuntimeException
    //   2992	2998	2991	finally
    //   3064	3070	3070	finally
    //   3064	3070	3070	finally
    //   3064	3070	3	java/lang/IndexOutOfBoundsException
    //   3064	3070	3070	java/lang/IllegalArgumentException
    //   3064	3070	3	java/util/NoSuchElementException
    //   3311	3318	3318	finally
    //   3311	3318	3318	finally
    //   3311	3318	3	java/lang/NumberFormatException
    //   3311	3318	3318	finally
    //   3312	3318	3311	finally
    //   3384	3390	3390	finally
    //   3384	3390	3390	finally
    //   3384	3390	3390	java/lang/NegativeArraySizeException
    //   3384	3390	3390	finally
    //   3384	3390	3	finally
    //   3567	3574	3574	finally
    //   3567	3574	3	finally
    //   3567	3574	3	java/lang/ArithmeticException
    //   3568	3574	3574	finally
    //   3568	3574	3567	finally
    //   3639	3648	3648	finally
    //   3639	3648	3	java/lang/EnumConstantNotPresentException
    //   3639	3648	3648	java/lang/IllegalArgumentException
    //   3640	3648	3	java/lang/RuntimeException
    //   3640	3648	3639	finally
    //   3719	3728	3728	finally
    //   3719	3728	3719	finally
    //   3720	3728	3728	java/lang/NullPointerException
    //   3720	3728	3728	finally
    //   3720	3728	3	java/lang/NumberFormatException
    //   3799	3808	3808	finally
    //   3799	3808	3799	finally
    //   3799	3808	3808	finally
    //   3800	3808	3	java/lang/IllegalStateException
    //   3800	3808	3	finally
    //   3940	3948	3948	finally
    //   3940	3948	3948	finally
    //   3940	3948	3	java/lang/ArrayIndexOutOfBoundsException
    //   3940	3948	3	finally
    //   3940	3948	3	java/lang/AssertionError
    //   4071	4078	4078	finally
    //   4072	4078	3	java/lang/IndexOutOfBoundsException
    //   4072	4078	4071	java/lang/RuntimeException
    //   4072	4078	4071	finally
    //   4072	4078	3	java/util/ConcurrentModificationException
    //   4263	4270	4270	finally
    //   4263	4270	4270	java/lang/RuntimeException
    //   4264	4270	4263	finally
    //   4264	4270	4270	finally
    //   4264	4270	3	java/lang/AssertionError
    //   4391	4399	4391	java/lang/UnsupportedOperationException
    //   4407	4409	3	finally
  }
  
  @SubscribeEvent
  public void onClientDisconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 189
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 181
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 173
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1637117730
    //   33: l2i
    //   34: ldc_w -2036338995
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1588106956
    //   44: l2i
    //   45: ldc_w -929029662
    //   48: ixor
    //   49: ldc2_w -401404978
    //   52: l2i
    //   53: ldc_w -832040894
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 160, 1049585055 -> 41, 1334596442 -> 84
    //   84: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 104
    //   93: ldc2_w -955098338
    //   96: l2i
    //   97: ldc_w -190539322
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -908593225
    //   107: l2i
    //   108: ldc_w 1946458620
    //   111: ixor
    //   112: ldc2_w -1887369619
    //   115: l2i
    //   116: ldc_w -1017650772
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 162, -251295350 -> 148, 2137007385 -> 104
    //   148: goto -> 152
    //   151: athrow
    //   152: invokevirtual onLogout : ()V
    //   155: goto -> 159
    //   158: athrow
    //   159: return
    //   160: aconst_null
    //   161: athrow
    //   162: aconst_null
    //   163: athrow
    //   164: pop
    //   165: goto -> 24
    //   168: pop
    //   169: aconst_null
    //   170: goto -> 164
    //   173: dup
    //   174: ifnull -> 164
    //   177: checkcast java/lang/Throwable
    //   180: athrow
    //   181: dup
    //   182: ifnull -> 168
    //   185: checkcast java/lang/Throwable
    //   188: athrow
    //   189: aconst_null
    //   190: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	136	0	this	Lbigname/zprestige/webhack/manager/EventManager;
    //   24	136	1	event	Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	173	finally
    //   152	158	158	finally
    //   152	158	158	java/lang/UnsupportedOperationException
    //   152	158	158	java/lang/ArrayIndexOutOfBoundsException
    //   152	158	3	finally
    //   152	158	158	java/lang/EnumConstantNotPresentException
    //   173	181	173	java/lang/NumberFormatException
    //   189	191	3	java/lang/IllegalStateException
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(UpdateWalkingPlayerEvent paramUpdateWalkingPlayerEvent) {
    Perry1.0D(this, (int)1760003175L ^ 0x37115F53, paramUpdateWalkingPlayerEvent);
  }
  
  public static boolean lambda$onPacketReceive$0(SPacketPlayerListItem.AddPlayerData data) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 667
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 659
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 651
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1627626278
    //   33: l2i
    //   34: ldc_w 88027748
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 646853000
    //   44: l2i
    //   45: ldc_w -618186270
    //   48: ixor
    //   49: ldc2_w 2116403467
    //   52: l2i
    //   53: ldc_w 1042863862
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 632, -1113317481 -> 84, -607239869 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 1096144950
    //   94: l2i
    //   95: ldc_w 2093699910
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 140121573
    //   105: l2i
    //   106: ldc_w -1460985515
    //   109: ixor
    //   110: ldc2_w -2037593151
    //   113: l2i
    //   114: ldc_w 918645696
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 638, -1915540623 -> 102, 284988593 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_179962_a : ()Lcom/mojang/authlib/GameProfile;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w 346791551
    //   164: l2i
    //   165: ldc_w -341485836
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 1801386434
    //   175: l2i
    //   176: ldc_w -501066130
    //   179: ixor
    //   180: ldc2_w -632419976
    //   183: l2i
    //   184: ldc_w -651839106
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 630, -1978196054 -> 216, -60458867 -> 172
    //   216: goto -> 220
    //   219: athrow
    //   220: invokevirtual getName : ()Ljava/lang/String;
    //   223: goto -> 227
    //   226: athrow
    //   227: getstatic Perryc.c : I
    //   230: iflt -> 244
    //   233: ldc2_w 1822359579
    //   236: l2i
    //   237: ldc_w 406049765
    //   240: ixor
    //   241: goto -> 252
    //   244: ldc2_w -189681283
    //   247: l2i
    //   248: ldc_w 1177449586
    //   251: ixor
    //   252: ldc2_w 1112416731
    //   255: l2i
    //   256: ldc_w 1370950981
    //   259: ixor
    //   260: ixor
    //   261: lookupswitch default -> 288, 1216296352 -> 244, 1733689184 -> 628
    //   288: goto -> 292
    //   291: athrow
    //   292: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
    //   295: goto -> 299
    //   298: athrow
    //   299: ifeq -> 313
    //   302: ldc2_w -1512354380
    //   305: l2i
    //   306: ldc_w 2092664683
    //   309: ixor
    //   310: goto -> 321
    //   313: ldc2_w 216021944
    //   316: l2i
    //   317: ldc_w -712969884
    //   320: ixor
    //   321: ldc2_w -409824964
    //   324: l2i
    //   325: ldc_w -285202042
    //   328: ixor
    //   329: ixor
    //   330: tableswitch default -> 302, -772640155 -> 352, -772640154 -> 608
    //   352: getstatic Perryc.0 : I
    //   355: ifle -> 369
    //   358: ldc2_w -2028097865
    //   361: l2i
    //   362: ldc_w 1959180245
    //   365: ixor
    //   366: goto -> 377
    //   369: ldc2_w 1904335222
    //   372: l2i
    //   373: ldc_w 2016406627
    //   376: ixor
    //   377: ldc2_w -1920135969
    //   380: l2i
    //   381: ldc_w 1318761237
    //   384: ixor
    //   385: ixor
    //   386: lookupswitch default -> 412, 818718376 -> 640, 1519614282 -> 369
    //   412: aload_0
    //   413: getstatic Perryc.c : I
    //   416: iflt -> 430
    //   419: ldc2_w -1844499386
    //   422: l2i
    //   423: ldc_w 657052345
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w -470025467
    //   433: l2i
    //   434: ldc_w 998486878
    //   437: ixor
    //   438: ldc2_w -2131987495
    //   441: l2i
    //   442: ldc_w 703993497
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 636, 473734079 -> 430, 1902259483 -> 472
    //   472: goto -> 476
    //   475: athrow
    //   476: invokevirtual func_179962_a : ()Lcom/mojang/authlib/GameProfile;
    //   479: goto -> 483
    //   482: athrow
    //   483: getstatic Perryc.c : I
    //   486: iflt -> 500
    //   489: ldc2_w -740357476
    //   492: l2i
    //   493: ldc_w 2118911528
    //   496: ixor
    //   497: goto -> 508
    //   500: ldc2_w 558695281
    //   503: l2i
    //   504: ldc_w 1969102614
    //   507: ixor
    //   508: ldc2_w -1478190869
    //   511: l2i
    //   512: ldc_w 1798635342
    //   515: ixor
    //   516: ixor
    //   517: lookupswitch default -> 634, -1732019262 -> 544, 1631808273 -> 500
    //   544: goto -> 548
    //   547: athrow
    //   548: invokevirtual getId : ()Ljava/util/UUID;
    //   551: goto -> 555
    //   554: athrow
    //   555: ifnull -> 569
    //   558: ldc2_w 1981364085
    //   561: l2i
    //   562: ldc_w 84870294
    //   565: ixor
    //   566: goto -> 577
    //   569: ldc2_w -1068886909
    //   572: l2i
    //   573: ldc_w -1285806209
    //   576: ixor
    //   577: ldc2_w 1735806492
    //   580: l2i
    //   581: ldc_w 1719296848
    //   584: ixor
    //   585: ixor
    //   586: tableswitch default -> 558, 1914314415 -> 608, 1914314416 -> 619
    //   608: ldc2_w 1761157868
    //   611: l2i
    //   612: ldc_w 1761157869
    //   615: ixor
    //   616: goto -> 627
    //   619: ldc2_w 1762985601
    //   622: l2i
    //   623: ldc_w 1762985601
    //   626: ixor
    //   627: ireturn
    //   628: aconst_null
    //   629: athrow
    //   630: aconst_null
    //   631: athrow
    //   632: aconst_null
    //   633: athrow
    //   634: aconst_null
    //   635: athrow
    //   636: aconst_null
    //   637: athrow
    //   638: aconst_null
    //   639: athrow
    //   640: aconst_null
    //   641: athrow
    //   642: pop
    //   643: goto -> 24
    //   646: pop
    //   647: aconst_null
    //   648: goto -> 642
    //   651: dup
    //   652: ifnull -> 642
    //   655: checkcast java/lang/Throwable
    //   658: athrow
    //   659: dup
    //   660: ifnull -> 646
    //   663: checkcast java/lang/Throwable
    //   666: athrow
    //   667: aconst_null
    //   668: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	604	0	data	Lnet/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData;
    // Exception table:
    //   from	to	target	type
    //   8	20	651	java/lang/ArithmeticException
    //   147	154	154	finally
    //   147	154	3	finally
    //   147	154	147	java/lang/NumberFormatException
    //   148	154	147	finally
    //   148	154	154	java/lang/ArithmeticException
    //   219	226	226	finally
    //   219	226	226	java/lang/NegativeArraySizeException
    //   220	226	3	java/lang/ArrayIndexOutOfBoundsException
    //   220	226	219	finally
    //   220	226	3	java/util/ConcurrentModificationException
    //   291	298	298	finally
    //   291	298	291	finally
    //   291	298	291	finally
    //   292	298	298	finally
    //   292	298	291	java/lang/IllegalArgumentException
    //   476	482	482	finally
    //   476	482	482	finally
    //   476	482	3	java/util/ConcurrentModificationException
    //   476	482	482	java/lang/StringIndexOutOfBoundsException
    //   476	482	482	java/lang/NumberFormatException
    //   548	554	554	finally
    //   548	554	3	java/lang/EnumConstantNotPresentException
    //   548	554	3	finally
    //   548	554	3	finally
    //   548	554	3	finally
    //   651	659	651	finally
    //   667	669	3	finally
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  @SubscribeEvent
  public void onWorldRender(RenderWorldLastEvent event) {
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
  
  public void init() {
    Perry1.3h(this, (int)1509252957L ^ 0x2C2F67F5);
  }
  
  @SubscribeEvent
  public void onClientConnect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
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
  
  @SubscribeEvent(priority = EventPriority.LOW)
  public void onRenderGameOverlayEvent(RenderGameOverlayEvent.Text event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1249
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1241
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1233
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1157272322
    //   33: l2i
    //   34: ldc_w 2120690602
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -767879760
    //   44: l2i
    //   45: ldc_w -2078959346
    //   48: ixor
    //   49: ldc2_w 1366219440
    //   52: l2i
    //   53: ldc_w 1350608608
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -997442812 -> 1196, -83571753 -> 41
    //   84: aload_1
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -1431515955
    //   94: l2i
    //   95: ldc_w 643651916
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 2061361802
    //   105: l2i
    //   106: ldc_w 866852124
    //   109: ixor
    //   110: ldc2_w 1235838863
    //   113: l2i
    //   114: ldc_w -983140807
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1218, -977670624 -> 144, 4097079 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getType : ()Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w -1308125288
    //   164: l2i
    //   165: ldc_w 1799170696
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 1483542499
    //   175: l2i
    //   176: ldc_w -1235211843
    //   179: ixor
    //   180: ldc2_w 646527512
    //   183: l2i
    //   184: ldc_w 1133123711
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, -1137074313 -> 1198, -1088365087 -> 172
    //   216: getstatic net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType.TEXT : Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
    //   219: getstatic Perryc.1 : I
    //   222: ifeq -> 236
    //   225: ldc2_w -1423547506
    //   228: l2i
    //   229: ldc_w 593590685
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w -2007323936
    //   239: l2i
    //   240: ldc_w -970179833
    //   243: ixor
    //   244: ldc2_w 341287724
    //   247: l2i
    //   248: ldc_w 170490486
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 280, -1774599351 -> 1200, 1963052543 -> 236
    //   280: goto -> 284
    //   283: athrow
    //   284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   287: goto -> 291
    //   290: athrow
    //   291: ifeq -> 305
    //   294: ldc2_w 523544690
    //   297: l2i
    //   298: ldc_w 2019042744
    //   301: ixor
    //   302: goto -> 313
    //   305: ldc2_w -1301491067
    //   308: l2i
    //   309: ldc_w -721395890
    //   312: ixor
    //   313: ldc2_w 1291787862
    //   316: l2i
    //   317: ldc_w 1519817304
    //   320: ixor
    //   321: ixor
    //   322: tableswitch default -> 294, 1896153540 -> 344, 1896153541 -> 1191
    //   344: new net/minecraft/client/gui/ScaledResolution
    //   347: dup
    //   348: getstatic Perryc.c : I
    //   351: iflt -> 365
    //   354: ldc2_w -456193128
    //   357: l2i
    //   358: ldc_w -621018575
    //   361: ixor
    //   362: goto -> 373
    //   365: ldc2_w -723968332
    //   368: l2i
    //   369: ldc_w -1388966905
    //   372: ixor
    //   373: ldc2_w -1525971641
    //   376: l2i
    //   377: ldc_w 53510119
    //   380: ixor
    //   381: ixor
    //   382: lookupswitch default -> 1208, -1744243959 -> 365, -539695085 -> 408
    //   408: getstatic bigname/zprestige/webhack/manager/EventManager.mc : Lnet/minecraft/client/Minecraft;
    //   411: getstatic Perryc.0 : I
    //   414: ifle -> 428
    //   417: ldc2_w -1479761842
    //   420: l2i
    //   421: ldc_w -625186459
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -422438341
    //   431: l2i
    //   432: ldc_w -1215271237
    //   435: ixor
    //   436: ldc2_w -791402684
    //   439: l2i
    //   440: ldc_w 1376323447
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -793089538 -> 428, -5379816 -> 1220
    //   472: goto -> 476
    //   475: athrow
    //   476: invokespecial <init> : (Lnet/minecraft/client/Minecraft;)V
    //   479: goto -> 483
    //   482: athrow
    //   483: getstatic Perryc.c : I
    //   486: iflt -> 500
    //   489: ldc2_w 1792628786
    //   492: l2i
    //   493: ldc_w -142214949
    //   496: ixor
    //   497: goto -> 508
    //   500: ldc2_w 680565899
    //   503: l2i
    //   504: ldc_w -290542013
    //   507: ixor
    //   508: ldc2_w -151062193
    //   511: l2i
    //   512: ldc_w -2045674436
    //   515: ixor
    //   516: ixor
    //   517: lookupswitch default -> 1222, -1227769925 -> 544, -307026534 -> 500
    //   544: astore_2
    //   545: new bigname/zprestige/webhack/event/events/Render2DEvent
    //   548: dup
    //   549: getstatic Perryc.0 : I
    //   552: ifle -> 566
    //   555: ldc2_w -854158908
    //   558: l2i
    //   559: ldc_w -1867509912
    //   562: ixor
    //   563: goto -> 574
    //   566: ldc2_w 2003682279
    //   569: l2i
    //   570: ldc_w -1308007176
    //   573: ixor
    //   574: ldc2_w -549924744
    //   577: l2i
    //   578: ldc_w 1498498741
    //   581: ixor
    //   582: ixor
    //   583: lookupswitch default -> 608, -607188895 -> 1212, 1302852653 -> 566
    //   608: aload_1
    //   609: getstatic Perryc.0 : I
    //   612: ifle -> 626
    //   615: ldc2_w 207061551
    //   618: l2i
    //   619: ldc_w 1598653493
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w 1910029792
    //   629: l2i
    //   630: ldc_w -2131544666
    //   633: ixor
    //   634: ldc2_w -1950137061
    //   637: l2i
    //   638: ldc_w 158161851
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 1192, -776988486 -> 626, 1938134758 -> 668
    //   668: goto -> 672
    //   671: athrow
    //   672: invokevirtual getPartialTicks : ()F
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 696
    //   685: ldc2_w -1130026355
    //   688: l2i
    //   689: ldc_w 1349981632
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 322627380
    //   699: l2i
    //   700: ldc_w 1324495747
    //   703: ixor
    //   704: ldc2_w 1116868985
    //   707: l2i
    //   708: ldc_w 1947874689
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 740, -1070142386 -> 696, -631628875 -> 1202
    //   740: aload_2
    //   741: getstatic Perryc.0 : I
    //   744: ifle -> 758
    //   747: ldc2_w 1090146931
    //   750: l2i
    //   751: ldc_w 250121490
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w -696194558
    //   761: l2i
    //   762: ldc_w 1298663150
    //   765: ixor
    //   766: ldc2_w -1406398769
    //   769: l2i
    //   770: ldc_w -1121173037
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 1204, -1964465168 -> 800, 1595052157 -> 758
    //   800: goto -> 804
    //   803: athrow
    //   804: invokespecial <init> : (FLnet/minecraft/client/gui/ScaledResolution;)V
    //   807: goto -> 811
    //   810: athrow
    //   811: getstatic Perryc.0 : I
    //   814: ifle -> 828
    //   817: ldc2_w -790707903
    //   820: l2i
    //   821: ldc_w -1072068052
    //   824: ixor
    //   825: goto -> 836
    //   828: ldc2_w 2105234971
    //   831: l2i
    //   832: ldc_w -304161870
    //   835: ixor
    //   836: ldc2_w 1092384206
    //   839: l2i
    //   840: ldc_w 1091794129
    //   843: ixor
    //   844: ixor
    //   845: lookupswitch default -> 1214, -1867871050 -> 872, 281561714 -> 828
    //   872: astore_3
    //   873: getstatic Perryc.c : I
    //   876: iflt -> 890
    //   879: ldc2_w 1227117322
    //   882: l2i
    //   883: ldc_w -313171593
    //   886: ixor
    //   887: goto -> 898
    //   890: ldc2_w 1617563324
    //   893: l2i
    //   894: ldc_w 702002293
    //   897: ixor
    //   898: ldc2_w 1183050931
    //   901: l2i
    //   902: ldc_w 810011062
    //   905: ixor
    //   906: ixor
    //   907: lookupswitch default -> 1194, -759883912 -> 890, 1064935372 -> 932
    //   932: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   935: getstatic Perryc.c : I
    //   938: iflt -> 952
    //   941: ldc2_w 559709785
    //   944: l2i
    //   945: ldc_w -212437445
    //   948: ixor
    //   949: goto -> 960
    //   952: ldc2_w 1564660359
    //   955: l2i
    //   956: ldc_w 2040474852
    //   959: ixor
    //   960: ldc2_w -934256590
    //   963: l2i
    //   964: ldc_w -1381898935
    //   967: ixor
    //   968: ixor
    //   969: lookupswitch default -> 996, -1208251111 -> 1206, -862373179 -> 952
    //   996: aload_3
    //   997: getstatic Perryc.0 : I
    //   1000: ifle -> 1014
    //   1003: ldc2_w 1252703952
    //   1006: l2i
    //   1007: ldc_w 369876600
    //   1010: ixor
    //   1011: goto -> 1022
    //   1014: ldc2_w 226140123
    //   1017: l2i
    //   1018: ldc_w -723852679
    //   1021: ixor
    //   1022: ldc2_w 945108078
    //   1025: l2i
    //   1026: ldc_w 197462523
    //   1029: ixor
    //   1030: ixor
    //   1031: lookupswitch default -> 1216, -365936585 -> 1056, 1865506109 -> 1014
    //   1056: goto -> 1060
    //   1059: athrow
    //   1060: invokevirtual onRender2D : (Lbigname/zprestige/webhack/event/events/Render2DEvent;)V
    //   1063: goto -> 1067
    //   1066: athrow
    //   1067: ldc_w 6.9897056
    //   1070: invokestatic floatToIntBits : (F)I
    //   1073: ldc_w 2136976299
    //   1076: ixor
    //   1077: invokestatic intBitsToFloat : (I)F
    //   1080: ldc_w 31.740988
    //   1083: invokestatic floatToIntBits : (F)I
    //   1086: ldc_w 2122182027
    //   1089: ixor
    //   1090: invokestatic intBitsToFloat : (I)F
    //   1093: ldc_w 5.3854337
    //   1096: invokestatic floatToIntBits : (F)I
    //   1099: ldc_w 2133611897
    //   1102: ixor
    //   1103: invokestatic intBitsToFloat : (I)F
    //   1106: ldc_w 11.182206
    //   1109: invokestatic floatToIntBits : (F)I
    //   1112: ldc_w 2125654609
    //   1115: ixor
    //   1116: invokestatic intBitsToFloat : (I)F
    //   1119: getstatic Perryc.1 : I
    //   1122: ifeq -> 1136
    //   1125: ldc2_w -1149649107
    //   1128: l2i
    //   1129: ldc_w -212071908
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w 55706334
    //   1139: l2i
    //   1140: ldc_w 817269244
    //   1143: ixor
    //   1144: ldc2_w -748574238
    //   1147: l2i
    //   1148: ldc_w 1921777699
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1180, -429907965 -> 1136, -372761360 -> 1210
    //   1180: goto -> 1184
    //   1183: athrow
    //   1184: invokestatic func_179131_c : (FFFF)V
    //   1187: goto -> 1191
    //   1190: athrow
    //   1191: return
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
    //   1220: aconst_null
    //   1221: athrow
    //   1222: aconst_null
    //   1223: athrow
    //   1224: pop
    //   1225: goto -> 24
    //   1228: pop
    //   1229: aconst_null
    //   1230: goto -> 1224
    //   1233: dup
    //   1234: ifnull -> 1224
    //   1237: checkcast java/lang/Throwable
    //   1240: athrow
    //   1241: dup
    //   1242: ifnull -> 1228
    //   1245: checkcast java/lang/Throwable
    //   1248: athrow
    //   1249: aconst_null
    //   1250: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   545	646	2	resolution	Lnet/minecraft/client/gui/ScaledResolution;
    //   873	318	3	render2DEvent	Lbigname/zprestige/webhack/event/events/Render2DEvent;
    //   24	1168	0	this	Lbigname/zprestige/webhack/manager/EventManager;
    //   24	1168	1	event	Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;
    // Exception table:
    //   from	to	target	type
    //   8	20	1233	java/lang/AssertionError
    //   147	154	154	finally
    //   147	154	147	finally
    //   147	154	147	finally
    //   148	154	3	finally
    //   148	154	147	finally
    //   283	290	290	finally
    //   283	290	290	finally
    //   284	290	283	java/lang/UnsupportedOperationException
    //   284	290	3	java/lang/NumberFormatException
    //   284	290	3	java/util/NoSuchElementException
    //   475	482	482	finally
    //   475	482	475	finally
    //   475	482	482	finally
    //   475	482	3	finally
    //   476	482	482	finally
    //   671	678	678	finally
    //   671	678	671	java/lang/EnumConstantNotPresentException
    //   671	678	671	finally
    //   672	678	671	finally
    //   672	678	3	java/lang/ClassCastException
    //   803	810	810	finally
    //   803	810	803	java/util/ConcurrentModificationException
    //   803	810	810	finally
    //   803	810	3	java/lang/EnumConstantNotPresentException
    //   804	810	3	finally
    //   1059	1066	1066	finally
    //   1059	1066	1059	finally
    //   1059	1066	3	finally
    //   1059	1066	1066	java/lang/EnumConstantNotPresentException
    //   1060	1066	1066	finally
    //   1183	1190	1190	finally
    //   1183	1190	1183	java/lang/EnumConstantNotPresentException
    //   1183	1190	1190	java/util/NoSuchElementException
    //   1183	1190	1183	java/lang/NegativeArraySizeException
    //   1184	1190	3	finally
    //   1233	1241	1233	finally
    //   1249	1251	3	finally
  }
  
  public boolean ticksOngoing() {
    return Perry1.4t(this, (int)74833447L ^ 0x615FB86B);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\EventManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */