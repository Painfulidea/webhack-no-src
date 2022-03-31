package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Nametags extends Module {
  public Setting<Boolean> smartScale;
  
  public Setting<Boolean> armor;
  
  public Setting<Boolean> ping;
  
  public Setting<Integer> NCred;
  
  public Setting<Boolean> rect;
  
  public static boolean $assertionsDisabled;
  
  public Setting<Boolean> NCRainbow;
  
  public Setting<Boolean> health;
  
  public Setting<Integer> Ogreen;
  
  public Setting<Nametags$Settings> setting;
  
  public int endcolor1;
  
  public Setting<Boolean> outline;
  
  public Setting<Integer> NCgreen;
  
  public Setting<Integer> Ored;
  
  public Setting<Boolean> line;
  
  public Setting<Integer> Oblue;
  
  public Setting<Float> factor;
  
  public static Nametags INSTANCE;
  
  public int startcolor1;
  
  public Setting<Boolean> heldStackName;
  
  public Setting<Boolean> ORainbow;
  
  public Setting<Float> size;
  
  public Setting<Boolean> onlyFov;
  
  public Setting<Boolean> rainbow;
  
  public Setting<Integer> NCblue;
  
  public Setting<Float> Owidth;
  
  public double interpolate(double previous, double current, float delta) {
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
  
  public void renderEnchantmentText(ItemStack stack, int x, int y) {
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
  
  public boolean lambda$new$16(Object paramObject) {
    return Perry1.1t(this, (int)586513610L ^ 0x733BE32A, paramObject);
  }
  
  public boolean lambda$new$6(Object paramObject) {
    return Perry1.1L(this, (int)-590455094L ^ 0x9BA9CC00, paramObject);
  }
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5046
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 5038
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5030
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -838192389
    //   33: l2i
    //   34: ldc_w -1595586623
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1436663821
    //   44: l2i
    //   45: ldc_w 394498041
    //   48: ixor
    //   49: ldc2_w 1742918285
    //   52: l2i
    //   53: ldc_w 1624873598
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1099548481 -> 41, 1775517129 -> 4905
    //   84: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w 1829480352
    //   96: l2i
    //   97: ldc_w 298403661
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 2093155149
    //   107: l2i
    //   108: ldc_w 1750258078
    //   111: ixor
    //   112: ldc2_w -850867444
    //   115: l2i
    //   116: ldc_w 1123331806
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -209812161 -> 4885, 1137698433 -> 104
    //   148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 168
    //   157: ldc2_w 1395513275
    //   160: l2i
    //   161: ldc_w 952837277
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1395355615
    //   171: l2i
    //   172: ldc_w -252569523
    //   175: ixor
    //   176: ldc2_w -960836816
    //   179: l2i
    //   180: ldc_w 920461704
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 4899, -1686038114 -> 168, -1405001004 -> 212
    //   212: getfield field_73010_i : Ljava/util/List;
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 232
    //   221: ldc2_w -2054386215
    //   224: l2i
    //   225: ldc_w 1215153173
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 1411264928
    //   235: l2i
    //   236: ldc_w -192790023
    //   239: ixor
    //   240: ldc2_w -1748933667
    //   243: l2i
    //   244: ldc_w 2067673305
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, 555621064 -> 4923, 746254413 -> 232
    //   276: goto -> 280
    //   279: athrow
    //   280: invokeinterface iterator : ()Ljava/util/Iterator;
    //   285: goto -> 289
    //   288: athrow
    //   289: getstatic Perryc.c : I
    //   292: iflt -> 306
    //   295: ldc2_w 1694148838
    //   298: l2i
    //   299: ldc_w -922147959
    //   302: ixor
    //   303: goto -> 314
    //   306: ldc2_w 457001343
    //   309: l2i
    //   310: ldc_w 1072069098
    //   313: ixor
    //   314: ldc2_w -43998293
    //   317: l2i
    //   318: ldc_w -1708891320
    //   321: ixor
    //   322: ixor
    //   323: lookupswitch default -> 4883, -893957236 -> 306, 1134555254 -> 348
    //   348: astore_2
    //   349: getstatic Perryc.0 : I
    //   352: ifle -> 366
    //   355: ldc2_w 628197164
    //   358: l2i
    //   359: ldc_w -627000688
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w 1392297465
    //   369: l2i
    //   370: ldc_w -1231301079
    //   373: ixor
    //   374: ldc2_w 658782515
    //   377: l2i
    //   378: ldc_w 132436634
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 408, -546187755 -> 4955, 1743397796 -> 366
    //   408: aload_2
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 579946634
    //   418: l2i
    //   419: ldc_w -1969394972
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -927713753
    //   429: l2i
    //   430: ldc_w 1286024062
    //   433: ixor
    //   434: ldc2_w -1701251712
    //   437: l2i
    //   438: ldc_w 992080280
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, 162866806 -> 4903, 940783396 -> 426
    //   468: goto -> 472
    //   471: athrow
    //   472: invokeinterface hasNext : ()Z
    //   477: goto -> 481
    //   480: athrow
    //   481: ifeq -> 495
    //   484: ldc2_w -39177027
    //   487: l2i
    //   488: ldc_w 1926704434
    //   491: ixor
    //   492: goto -> 503
    //   495: ldc2_w 1812002526
    //   498: l2i
    //   499: ldc_w -478285994
    //   502: ixor
    //   503: ldc2_w -1512436500
    //   506: l2i
    //   507: ldc_w 1226440928
    //   510: ixor
    //   511: ixor
    //   512: tableswitch default -> 484, 1673336195 -> 536, 1673336196 -> 4882
    //   536: getstatic Perryc.1 : I
    //   539: ifeq -> 553
    //   542: ldc2_w 1827769525
    //   545: l2i
    //   546: ldc_w 913088518
    //   549: ixor
    //   550: goto -> 561
    //   553: ldc2_w -1070893396
    //   556: l2i
    //   557: ldc_w -1538167405
    //   560: ixor
    //   561: ldc2_w 2088451737
    //   564: l2i
    //   565: ldc_w 773430179
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, 150964617 -> 4917, 1521002430 -> 553
    //   596: aload_2
    //   597: getstatic Perryc.c : I
    //   600: iflt -> 614
    //   603: ldc2_w 850109737
    //   606: l2i
    //   607: ldc_w -1533335395
    //   610: ixor
    //   611: goto -> 622
    //   614: ldc2_w -190506097
    //   617: l2i
    //   618: ldc_w -1022003196
    //   621: ixor
    //   622: ldc2_w -1260408073
    //   625: l2i
    //   626: ldc_w -1911841347
    //   629: ixor
    //   630: ixor
    //   631: lookupswitch default -> 656, -1394302210 -> 4939, -208240707 -> 614
    //   656: goto -> 660
    //   659: athrow
    //   660: invokeinterface next : ()Ljava/lang/Object;
    //   665: goto -> 669
    //   668: athrow
    //   669: checkcast net/minecraft/entity/player/EntityPlayer
    //   672: getstatic Perryc.0 : I
    //   675: ifle -> 689
    //   678: ldc2_w 1955656546
    //   681: l2i
    //   682: ldc_w 206413959
    //   685: ixor
    //   686: goto -> 697
    //   689: ldc2_w 884371540
    //   692: l2i
    //   693: ldc_w -1862381337
    //   696: ixor
    //   697: ldc2_w 1748842606
    //   700: l2i
    //   701: ldc_w -1159131975
    //   704: ixor
    //   705: ixor
    //   706: lookupswitch default -> 732, -1442224334 -> 4925, 102253882 -> 689
    //   732: astore_3
    //   733: getstatic Perryc.c : I
    //   736: iflt -> 750
    //   739: ldc2_w -395634141
    //   742: l2i
    //   743: ldc_w -551097088
    //   746: ixor
    //   747: goto -> 758
    //   750: ldc2_w 2018316921
    //   753: l2i
    //   754: ldc_w -1939703591
    //   757: ixor
    //   758: ldc2_w 1728421991
    //   761: l2i
    //   762: ldc_w 546792147
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 792, 1748871846 -> 750, 1893676439 -> 4901
    //   792: aload_3
    //   793: ifnull -> 807
    //   796: ldc2_w 1990179240
    //   799: l2i
    //   800: ldc_w -1757993084
    //   803: ixor
    //   804: goto -> 815
    //   807: ldc2_w -40741715
    //   810: l2i
    //   811: ldc_w 473614976
    //   814: ixor
    //   815: ldc2_w 1891836585
    //   818: l2i
    //   819: ldc_w 262067037
    //   822: ixor
    //   823: ixor
    //   824: tableswitch default -> 796, -1628082216 -> 848, -1628082215 -> 4879
    //   848: getstatic Perryc.1 : I
    //   851: ifeq -> 865
    //   854: ldc2_w 438235414
    //   857: l2i
    //   858: ldc_w -668815519
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -1703969094
    //   868: l2i
    //   869: ldc_w -217312628
    //   872: ixor
    //   873: ldc2_w -1677561061
    //   876: l2i
    //   877: ldc_w 1195365410
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 4919, -1302410481 -> 908, 419559758 -> 865
    //   908: aload_3
    //   909: getstatic Perryc.0 : I
    //   912: ifle -> 926
    //   915: ldc2_w 1130227811
    //   918: l2i
    //   919: ldc_w -684037407
    //   922: ixor
    //   923: goto -> 934
    //   926: ldc2_w 141402864
    //   929: l2i
    //   930: ldc_w 188016850
    //   933: ixor
    //   934: ldc2_w 718254025
    //   937: l2i
    //   938: ldc_w -801309764
    //   941: ixor
    //   942: ixor
    //   943: lookupswitch default -> 968, -82331295 -> 926, 1855248119 -> 4963
    //   968: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   971: getstatic Perryc.c : I
    //   974: iflt -> 988
    //   977: ldc2_w -1433502415
    //   980: l2i
    //   981: ldc_w -766599698
    //   984: ixor
    //   985: goto -> 996
    //   988: ldc2_w -1506339155
    //   991: l2i
    //   992: ldc_w -1929406651
    //   995: ixor
    //   996: ldc2_w 1224699484
    //   999: l2i
    //   1000: ldc_w -259980360
    //   1003: ixor
    //   1004: ixor
    //   1005: lookupswitch default -> 4921, -1833505780 -> 1032, -1061253829 -> 988
    //   1032: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1035: getstatic Perryc.0 : I
    //   1038: ifle -> 1052
    //   1041: ldc2_w 1925084328
    //   1044: l2i
    //   1045: ldc_w 412993215
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w 803628334
    //   1055: l2i
    //   1056: ldc_w -233394668
    //   1059: ixor
    //   1060: ldc2_w 1493192294
    //   1063: l2i
    //   1064: ldc_w -1426149301
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 1096, -1713550278 -> 4895, -1301980622 -> 1052
    //   1096: goto -> 1100
    //   1099: athrow
    //   1100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1103: goto -> 1107
    //   1106: athrow
    //   1107: ifne -> 1121
    //   1110: ldc2_w -2044628616
    //   1113: l2i
    //   1114: ldc_w -237008979
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w -2138103225
    //   1124: l2i
    //   1125: ldc_w -143534955
    //   1128: ixor
    //   1129: ldc2_w 1886938495
    //   1132: l2i
    //   1133: ldc_w 805193233
    //   1136: ixor
    //   1137: ixor
    //   1138: tableswitch default -> 1110, 679007675 -> 1160, 679007676 -> 4879
    //   1160: getstatic Perryc.1 : I
    //   1163: ifeq -> 1177
    //   1166: ldc2_w 745934072
    //   1169: l2i
    //   1170: ldc_w -1720072263
    //   1173: ixor
    //   1174: goto -> 1185
    //   1177: ldc2_w 218840447
    //   1180: l2i
    //   1181: ldc_w 964722928
    //   1184: ixor
    //   1185: ldc2_w 131975009
    //   1188: l2i
    //   1189: ldc_w 731454474
    //   1192: ixor
    //   1193: ixor
    //   1194: lookupswitch default -> 4989, -1723133910 -> 1177, 416245476 -> 1220
    //   1220: aload_3
    //   1221: getstatic Perryc.0 : I
    //   1224: ifle -> 1238
    //   1227: ldc2_w 563856939
    //   1230: l2i
    //   1231: ldc_w 1346076904
    //   1234: ixor
    //   1235: goto -> 1246
    //   1238: ldc2_w -1251151052
    //   1241: l2i
    //   1242: ldc_w 2107127216
    //   1245: ixor
    //   1246: ldc2_w 489222419
    //   1249: l2i
    //   1250: ldc_w -1725343204
    //   1253: ixor
    //   1254: ixor
    //   1255: lookupswitch default -> 1280, -1973466236 -> 1238, -173937204 -> 4891
    //   1280: goto -> 1284
    //   1283: athrow
    //   1284: invokevirtual func_70089_S : ()Z
    //   1287: goto -> 1291
    //   1290: athrow
    //   1291: ifeq -> 1305
    //   1294: ldc2_w -1501872193
    //   1297: l2i
    //   1298: ldc_w 1357442157
    //   1301: ixor
    //   1302: goto -> 1313
    //   1305: ldc2_w -397592622
    //   1308: l2i
    //   1309: ldc_w 517923843
    //   1312: ixor
    //   1313: ldc2_w 1975783857
    //   1316: l2i
    //   1317: ldc_w 1443468166
    //   1320: ixor
    //   1321: ixor
    //   1322: tableswitch default -> 1294, -715238939 -> 1344, -715238938 -> 4879
    //   1344: getstatic Perryc.1 : I
    //   1347: ifeq -> 1361
    //   1350: ldc2_w -448250431
    //   1353: l2i
    //   1354: ldc_w 636515243
    //   1357: ixor
    //   1358: goto -> 1369
    //   1361: ldc2_w -32067520
    //   1364: l2i
    //   1365: ldc_w 1345732471
    //   1368: ixor
    //   1369: ldc2_w -2108032123
    //   1372: l2i
    //   1373: ldc_w 430813775
    //   1376: ixor
    //   1377: ixor
    //   1378: lookupswitch default -> 1404, -667422388 -> 1361, 1531709344 -> 4997
    //   1404: aload_3
    //   1405: getstatic Perryc.c : I
    //   1408: iflt -> 1422
    //   1411: ldc2_w -87249051
    //   1414: l2i
    //   1415: ldc_w -673591898
    //   1418: ixor
    //   1419: goto -> 1430
    //   1422: ldc2_w 651394624
    //   1425: l2i
    //   1426: ldc_w -2038838098
    //   1429: ixor
    //   1430: ldc2_w 1436178656
    //   1433: l2i
    //   1434: ldc_w -1121046560
    //   1437: ixor
    //   1438: ixor
    //   1439: lookupswitch default -> 1464, -1289868848 -> 1422, -979298877 -> 4889
    //   1464: goto -> 1468
    //   1467: athrow
    //   1468: invokevirtual func_82150_aj : ()Z
    //   1471: goto -> 1475
    //   1474: athrow
    //   1475: ifeq -> 1489
    //   1478: ldc2_w -1245659223
    //   1481: l2i
    //   1482: ldc_w 2044917675
    //   1485: ixor
    //   1486: goto -> 1497
    //   1489: ldc2_w 628617272
    //   1492: l2i
    //   1493: ldc_w -380258247
    //   1496: ixor
    //   1497: ldc2_w 900172769
    //   1500: l2i
    //   1501: ldc_w -1447538034
    //   1504: ixor
    //   1505: ixor
    //   1506: tableswitch default -> 1478, 1346212205 -> 1528, 1346212206 -> 2036
    //   1528: getstatic Perryc.c : I
    //   1531: iflt -> 1545
    //   1534: ldc2_w 375179409
    //   1537: l2i
    //   1538: ldc_w -1648966538
    //   1541: ixor
    //   1542: goto -> 1553
    //   1545: ldc2_w -1639440598
    //   1548: l2i
    //   1549: ldc_w -1461976993
    //   1552: ixor
    //   1553: ldc2_w 853892169
    //   1556: l2i
    //   1557: ldc_w -76274082
    //   1560: ixor
    //   1561: ixor
    //   1562: lookupswitch default -> 1588, 1115387632 -> 4971, 1999797883 -> 1545
    //   1588: aload_0
    //   1589: getstatic Perryc.c : I
    //   1592: iflt -> 1606
    //   1595: ldc2_w 1985948160
    //   1598: l2i
    //   1599: ldc_w 98331600
    //   1602: ixor
    //   1603: goto -> 1614
    //   1606: ldc2_w 942330542
    //   1609: l2i
    //   1610: ldc_w 1675410674
    //   1613: ixor
    //   1614: ldc2_w 1894968615
    //   1617: l2i
    //   1618: ldc_w 1977730536
    //   1621: ixor
    //   1622: ixor
    //   1623: lookupswitch default -> 1648, 1256304067 -> 1606, 1989175583 -> 4933
    //   1648: getfield onlyFov : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1651: getstatic Perryc.c : I
    //   1654: iflt -> 1668
    //   1657: ldc2_w 1428600060
    //   1660: l2i
    //   1661: ldc_w -1212549571
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w 307449692
    //   1671: l2i
    //   1672: ldc_w -2028274312
    //   1675: ixor
    //   1676: ldc2_w -615473846
    //   1679: l2i
    //   1680: ldc_w -868016520
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1712, -175324685 -> 4977, 1430155181 -> 1668
    //   1712: goto -> 1716
    //   1715: athrow
    //   1716: invokevirtual getValue : ()Ljava/lang/Object;
    //   1719: goto -> 1723
    //   1722: athrow
    //   1723: checkcast java/lang/Boolean
    //   1726: getstatic Perryc.c : I
    //   1729: iflt -> 1743
    //   1732: ldc2_w 1868912436
    //   1735: l2i
    //   1736: ldc_w 1445041471
    //   1739: ixor
    //   1740: goto -> 1751
    //   1743: ldc2_w -1428804457
    //   1746: l2i
    //   1747: ldc_w 490599219
    //   1750: ixor
    //   1751: ldc2_w 1415712028
    //   1754: l2i
    //   1755: ldc_w -1088716471
    //   1758: ixor
    //   1759: ixor
    //   1760: lookupswitch default -> 1788, -767734178 -> 4995, 323154016 -> 1743
    //   1788: goto -> 1792
    //   1791: athrow
    //   1792: invokevirtual booleanValue : ()Z
    //   1795: goto -> 1799
    //   1798: athrow
    //   1799: ifeq -> 1813
    //   1802: ldc2_w -1877074879
    //   1805: l2i
    //   1806: ldc_w -729994531
    //   1809: ixor
    //   1810: goto -> 1821
    //   1813: ldc2_w -1358127645
    //   1816: l2i
    //   1817: ldc_w -345003140
    //   1820: ixor
    //   1821: ldc2_w 782870110
    //   1824: l2i
    //   1825: ldc_w 1053902683
    //   1828: ixor
    //   1829: ixor
    //   1830: tableswitch default -> 1802, 1411110809 -> 1852, 1411110810 -> 4879
    //   1852: getstatic Perryc.0 : I
    //   1855: ifle -> 1869
    //   1858: ldc2_w 1682164078
    //   1861: l2i
    //   1862: ldc_w 1738141674
    //   1865: ixor
    //   1866: goto -> 1877
    //   1869: ldc2_w 547675732
    //   1872: l2i
    //   1873: ldc_w -1119005312
    //   1876: ixor
    //   1877: ldc2_w 1595759118
    //   1880: l2i
    //   1881: ldc_w -819089115
    //   1884: ixor
    //   1885: ixor
    //   1886: lookupswitch default -> 5011, -1813328465 -> 1869, 232349951 -> 1912
    //   1912: aload_3
    //   1913: getstatic Perryc.1 : I
    //   1916: ifeq -> 1930
    //   1919: ldc2_w 808430246
    //   1922: l2i
    //   1923: ldc_w 996758141
    //   1926: ixor
    //   1927: goto -> 1938
    //   1930: ldc2_w 254780831
    //   1933: l2i
    //   1934: ldc_w -1570162300
    //   1937: ixor
    //   1938: ldc2_w 277184332
    //   1941: l2i
    //   1942: ldc_w 336056459
    //   1945: ixor
    //   1946: ixor
    //   1947: lookupswitch default -> 1972, -266513130 -> 1930, 264525596 -> 4991
    //   1972: goto -> 1976
    //   1975: athrow
    //   1976: invokestatic isInFov : (Lnet/minecraft/entity/Entity;)Z
    //   1979: goto -> 1983
    //   1982: athrow
    //   1983: ifne -> 1997
    //   1986: ldc2_w -1633233466
    //   1989: l2i
    //   1990: ldc_w 1673992001
    //   1993: ixor
    //   1994: goto -> 2005
    //   1997: ldc2_w -496236772
    //   2000: l2i
    //   2001: ldc_w 520996250
    //   2004: ixor
    //   2005: ldc2_w 525012539
    //   2008: l2i
    //   2009: ldc_w -724209074
    //   2012: ixor
    //   2013: ixor
    //   2014: tableswitch default -> 1986, 922730226 -> 2036, 922730227 -> 4879
    //   2036: getstatic Perryc.c : I
    //   2039: iflt -> 2053
    //   2042: ldc2_w -586893512
    //   2045: l2i
    //   2046: ldc_w 591640298
    //   2049: ixor
    //   2050: goto -> 2061
    //   2053: ldc2_w -1091944683
    //   2056: l2i
    //   2057: ldc_w -1096447
    //   2060: ixor
    //   2061: ldc2_w -2137765692
    //   2064: l2i
    //   2065: ldc_w -674093438
    //   2068: ixor
    //   2069: ixor
    //   2070: lookupswitch default -> 5001, -1459523692 -> 2053, 373494866 -> 2096
    //   2096: aload_0
    //   2097: getstatic Perryc.c : I
    //   2100: iflt -> 2114
    //   2103: ldc2_w 1793672201
    //   2106: l2i
    //   2107: ldc_w 1869451981
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w -760451779
    //   2117: l2i
    //   2118: ldc_w -662772712
    //   2121: ixor
    //   2122: ldc2_w 869448020
    //   2125: l2i
    //   2126: ldc_w 771884320
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 4907, 386020689 -> 2156, 408185520 -> 2114
    //   2156: aload_3
    //   2157: getstatic Perryc.1 : I
    //   2160: ifeq -> 2174
    //   2163: ldc2_w 1428030910
    //   2166: l2i
    //   2167: ldc_w 2001954711
    //   2170: ixor
    //   2171: goto -> 2182
    //   2174: ldc2_w 1883792225
    //   2177: l2i
    //   2178: ldc_w 2057039257
    //   2181: ixor
    //   2182: ldc2_w 847399701
    //   2185: l2i
    //   2186: ldc_w -1018012012
    //   2189: ixor
    //   2190: ixor
    //   2191: lookupswitch default -> 5013, -744654936 -> 2174, -83649671 -> 2216
    //   2216: getfield field_70142_S : D
    //   2219: getstatic Perryc.1 : I
    //   2222: ifeq -> 2236
    //   2225: ldc2_w 675106437
    //   2228: l2i
    //   2229: ldc_w 237302515
    //   2232: ixor
    //   2233: goto -> 2244
    //   2236: ldc2_w -1398632649
    //   2239: l2i
    //   2240: ldc_w -1530076827
    //   2243: ixor
    //   2244: ldc2_w -1737885836
    //   2247: l2i
    //   2248: ldc_w 1621427656
    //   2251: ixor
    //   2252: ixor
    //   2253: lookupswitch default -> 4987, -556446006 -> 2236, -257778450 -> 2280
    //   2280: aload_3
    //   2281: getstatic Perryc.1 : I
    //   2284: ifeq -> 2298
    //   2287: ldc2_w -872162975
    //   2290: l2i
    //   2291: ldc_w -1834348628
    //   2294: ixor
    //   2295: goto -> 2306
    //   2298: ldc2_w -1598342880
    //   2301: l2i
    //   2302: ldc_w 274994511
    //   2305: ixor
    //   2306: ldc2_w 1423812916
    //   2309: l2i
    //   2310: ldc_w 405019925
    //   2313: ixor
    //   2314: ixor
    //   2315: lookupswitch default -> 4915, -64579506 -> 2340, 307258092 -> 2298
    //   2340: getfield field_70165_t : D
    //   2343: getstatic Perryc.0 : I
    //   2346: ifle -> 2360
    //   2349: ldc2_w -1864613190
    //   2352: l2i
    //   2353: ldc_w -575878135
    //   2356: ixor
    //   2357: goto -> 2368
    //   2360: ldc2_w 1912650501
    //   2363: l2i
    //   2364: ldc_w -831361653
    //   2367: ixor
    //   2368: ldc2_w -494876049
    //   2371: l2i
    //   2372: ldc_w 1559500380
    //   2375: ixor
    //   2376: ixor
    //   2377: lookupswitch default -> 4969, -217820544 -> 2360, 33950397 -> 2404
    //   2404: aload_1
    //   2405: getstatic Perryc.1 : I
    //   2408: ifeq -> 2422
    //   2411: ldc2_w -212038727
    //   2414: l2i
    //   2415: ldc_w 713779671
    //   2418: ixor
    //   2419: goto -> 2430
    //   2422: ldc2_w -805504897
    //   2425: l2i
    //   2426: ldc_w -2063764582
    //   2429: ixor
    //   2430: ldc2_w -127858257
    //   2433: l2i
    //   2434: ldc_w -1351478045
    //   2437: ixor
    //   2438: ixor
    //   2439: lookupswitch default -> 4893, -1899692254 -> 2422, 470980265 -> 2464
    //   2464: goto -> 2468
    //   2467: athrow
    //   2468: invokevirtual getPartialTicks : ()F
    //   2471: goto -> 2475
    //   2474: athrow
    //   2475: getstatic Perryc.0 : I
    //   2478: ifle -> 2492
    //   2481: ldc2_w -1094617043
    //   2484: l2i
    //   2485: ldc_w -1000615217
    //   2488: ixor
    //   2489: goto -> 2500
    //   2492: ldc2_w 341260672
    //   2495: l2i
    //   2496: ldc_w -848813334
    //   2499: ixor
    //   2500: ldc2_w 1603673222
    //   2503: l2i
    //   2504: ldc_w 1249689273
    //   2507: ixor
    //   2508: ixor
    //   2509: lookupswitch default -> 2536, 1390354199 -> 2492, 1869613277 -> 4945
    //   2536: goto -> 2540
    //   2539: athrow
    //   2540: invokespecial interpolate : (DDF)D
    //   2543: goto -> 2547
    //   2546: athrow
    //   2547: getstatic Perryc.c : I
    //   2550: iflt -> 2564
    //   2553: ldc2_w 785720620
    //   2556: l2i
    //   2557: ldc_w -420524015
    //   2560: ixor
    //   2561: goto -> 2572
    //   2564: ldc2_w 1331118851
    //   2567: l2i
    //   2568: ldc_w -1483006446
    //   2571: ixor
    //   2572: ldc2_w 980398674
    //   2575: l2i
    //   2576: ldc_w 303501408
    //   2579: ixor
    //   2580: ixor
    //   2581: lookupswitch default -> 4935, -1061880029 -> 2608, -532490481 -> 2564
    //   2608: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   2611: getstatic Perryc.c : I
    //   2614: iflt -> 2628
    //   2617: ldc2_w 600295584
    //   2620: l2i
    //   2621: ldc_w -669734706
    //   2624: ixor
    //   2625: goto -> 2636
    //   2628: ldc2_w -1747630443
    //   2631: l2i
    //   2632: ldc_w 208382419
    //   2635: ixor
    //   2636: ldc2_w -224532592
    //   2639: l2i
    //   2640: ldc_w 351307610
    //   2643: ixor
    //   2644: ixor
    //   2645: lookupswitch default -> 5005, 498991268 -> 2628, 2111016844 -> 2672
    //   2672: goto -> 2676
    //   2675: athrow
    //   2676: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   2679: goto -> 2683
    //   2682: athrow
    //   2683: getstatic Perryc.1 : I
    //   2686: ifeq -> 2700
    //   2689: ldc2_w 14938495
    //   2692: l2i
    //   2693: ldc_w -760145358
    //   2696: ixor
    //   2697: goto -> 2708
    //   2700: ldc2_w -1642722614
    //   2703: l2i
    //   2704: ldc_w -871003529
    //   2707: ixor
    //   2708: ldc2_w -1139753895
    //   2711: l2i
    //   2712: ldc_w 1260941964
    //   2715: ixor
    //   2716: ixor
    //   2717: lookupswitch default -> 4965, -1522839960 -> 2744, 627713432 -> 2700
    //   2744: getfield field_78725_b : D
    //   2747: dsub
    //   2748: getstatic Perryc.c : I
    //   2751: iflt -> 2765
    //   2754: ldc2_w 674198611
    //   2757: l2i
    //   2758: ldc_w -1650744703
    //   2761: ixor
    //   2762: goto -> 2773
    //   2765: ldc2_w -1454419106
    //   2768: l2i
    //   2769: ldc_w -656485493
    //   2772: ixor
    //   2773: ldc2_w -1046187178
    //   2776: l2i
    //   2777: ldc_w 189642982
    //   2780: ixor
    //   2781: ixor
    //   2782: lookupswitch default -> 2808, -1699134898 -> 2765, 2136808802 -> 5015
    //   2808: dstore #4
    //   2810: getstatic Perryc.0 : I
    //   2813: ifle -> 2827
    //   2816: ldc2_w -206627077
    //   2819: l2i
    //   2820: ldc_w 1916508391
    //   2823: ixor
    //   2824: goto -> 2835
    //   2827: ldc2_w 1672057496
    //   2830: l2i
    //   2831: ldc_w 349928293
    //   2834: ixor
    //   2835: ldc2_w 1563064385
    //   2838: l2i
    //   2839: ldc_w -1597033634
    //   2842: ixor
    //   2843: ixor
    //   2844: lookupswitch default -> 4999, -1969773854 -> 2872, 2087832835 -> 2827
    //   2872: aload_0
    //   2873: getstatic Perryc.1 : I
    //   2876: ifeq -> 2890
    //   2879: ldc2_w -245756836
    //   2882: l2i
    //   2883: ldc_w -1989413145
    //   2886: ixor
    //   2887: goto -> 2898
    //   2890: ldc2_w 1615630888
    //   2893: l2i
    //   2894: ldc_w -1916271143
    //   2897: ixor
    //   2898: ldc2_w 968506257
    //   2901: l2i
    //   2902: ldc_w 640158722
    //   2905: ixor
    //   2906: ixor
    //   2907: lookupswitch default -> 2932, -282396190 -> 2890, 1738788136 -> 4909
    //   2932: aload_3
    //   2933: getstatic Perryc.0 : I
    //   2936: ifle -> 2950
    //   2939: ldc2_w -1942645788
    //   2942: l2i
    //   2943: ldc_w -1474028379
    //   2946: ixor
    //   2947: goto -> 2958
    //   2950: ldc2_w -1203226474
    //   2953: l2i
    //   2954: ldc_w -1422067148
    //   2957: ixor
    //   2958: ldc2_w -310503578
    //   2961: l2i
    //   2962: ldc_w -1106560417
    //   2965: ixor
    //   2966: ixor
    //   2967: lookupswitch default -> 2992, -1004619602 -> 2950, 2003083896 -> 5003
    //   2992: getfield field_70137_T : D
    //   2995: getstatic Perryc.1 : I
    //   2998: ifeq -> 3012
    //   3001: ldc2_w -439904700
    //   3004: l2i
    //   3005: ldc_w -1749413222
    //   3008: ixor
    //   3009: goto -> 3020
    //   3012: ldc2_w 527078201
    //   3015: l2i
    //   3016: ldc_w -1752173877
    //   3019: ixor
    //   3020: ldc2_w -281458309
    //   3023: l2i
    //   3024: ldc_w -2049291658
    //   3027: ixor
    //   3028: ixor
    //   3029: lookupswitch default -> 5019, -502897921 -> 3056, 413042643 -> 3012
    //   3056: aload_3
    //   3057: getstatic Perryc.1 : I
    //   3060: ifeq -> 3074
    //   3063: ldc2_w -646650671
    //   3066: l2i
    //   3067: ldc_w 1964914682
    //   3070: ixor
    //   3071: goto -> 3082
    //   3074: ldc2_w -2002407175
    //   3077: l2i
    //   3078: ldc_w 1625514413
    //   3081: ixor
    //   3082: ldc2_w -106511872
    //   3085: l2i
    //   3086: ldc_w -1079298198
    //   3089: ixor
    //   3090: ixor
    //   3091: lookupswitch default -> 4957, -1370807234 -> 3116, -362338751 -> 3074
    //   3116: getfield field_70163_u : D
    //   3119: getstatic Perryc.0 : I
    //   3122: ifle -> 3136
    //   3125: ldc2_w -1364270942
    //   3128: l2i
    //   3129: ldc_w 1015041981
    //   3132: ixor
    //   3133: goto -> 3144
    //   3136: ldc2_w -268453909
    //   3139: l2i
    //   3140: ldc_w 1821729992
    //   3143: ixor
    //   3144: ldc2_w 2143537800
    //   3147: l2i
    //   3148: ldc_w -942505864
    //   3151: ixor
    //   3152: ixor
    //   3153: lookupswitch default -> 5017, 708830703 -> 3136, 997956051 -> 3180
    //   3180: aload_1
    //   3181: getstatic Perryc.0 : I
    //   3184: ifle -> 3198
    //   3187: ldc2_w -309442249
    //   3190: l2i
    //   3191: ldc_w -1894653610
    //   3194: ixor
    //   3195: goto -> 3206
    //   3198: ldc2_w 531484103
    //   3201: l2i
    //   3202: ldc_w 1389033347
    //   3205: ixor
    //   3206: ldc2_w -485672286
    //   3209: l2i
    //   3210: ldc_w -1614149326
    //   3213: ixor
    //   3214: ixor
    //   3215: lookupswitch default -> 3240, 193307428 -> 3198, 509123569 -> 4981
    //   3240: goto -> 3244
    //   3243: athrow
    //   3244: invokevirtual getPartialTicks : ()F
    //   3247: goto -> 3251
    //   3250: athrow
    //   3251: getstatic Perryc.0 : I
    //   3254: ifle -> 3268
    //   3257: ldc2_w 101988316
    //   3260: l2i
    //   3261: ldc_w -1663098122
    //   3264: ixor
    //   3265: goto -> 3276
    //   3268: ldc2_w -18225429
    //   3271: l2i
    //   3272: ldc_w -1950964474
    //   3275: ixor
    //   3276: ldc2_w 1167207116
    //   3279: l2i
    //   3280: ldc_w 1395377052
    //   3283: ixor
    //   3284: ixor
    //   3285: lookupswitch default -> 3312, -1938621318 -> 4967, 1225346289 -> 3268
    //   3312: goto -> 3316
    //   3315: athrow
    //   3316: invokespecial interpolate : (DDF)D
    //   3319: goto -> 3323
    //   3322: athrow
    //   3323: getstatic Perryc.1 : I
    //   3326: ifeq -> 3340
    //   3329: ldc2_w -2088897417
    //   3332: l2i
    //   3333: ldc_w 1785930393
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w 690610113
    //   3343: l2i
    //   3344: ldc_w -268917878
    //   3347: ixor
    //   3348: ldc2_w -856908327
    //   3351: l2i
    //   3352: ldc_w -755731839
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 3384, -149538378 -> 4931, 752331732 -> 3340
    //   3384: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   3387: getstatic Perryc.1 : I
    //   3390: ifeq -> 3404
    //   3393: ldc2_w 2078540657
    //   3396: l2i
    //   3397: ldc_w -171087028
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w -1646017736
    //   3407: l2i
    //   3408: ldc_w -783498615
    //   3411: ixor
    //   3412: ldc2_w -1786936506
    //   3415: l2i
    //   3416: ldc_w 908883676
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 4949, -268504021 -> 3448, 762879399 -> 3404
    //   3448: goto -> 3452
    //   3451: athrow
    //   3452: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   3455: goto -> 3459
    //   3458: athrow
    //   3459: getstatic Perryc.0 : I
    //   3462: ifle -> 3476
    //   3465: ldc2_w -456735561
    //   3468: l2i
    //   3469: ldc_w 505671996
    //   3472: ixor
    //   3473: goto -> 3484
    //   3476: ldc2_w -1950764212
    //   3479: l2i
    //   3480: ldc_w -1093748744
    //   3483: ixor
    //   3484: ldc2_w -1794166319
    //   3487: l2i
    //   3488: ldc_w 132407903
    //   3491: ixor
    //   3492: ixor
    //   3493: lookupswitch default -> 4979, -1482926278 -> 3520, 1745774085 -> 3476
    //   3520: getfield field_78726_c : D
    //   3523: dsub
    //   3524: getstatic Perryc.c : I
    //   3527: iflt -> 3541
    //   3530: ldc2_w -1275363223
    //   3533: l2i
    //   3534: ldc_w 687015273
    //   3537: ixor
    //   3538: goto -> 3549
    //   3541: ldc2_w 980969648
    //   3544: l2i
    //   3545: ldc_w 1883513087
    //   3548: ixor
    //   3549: ldc2_w 1074082843
    //   3552: l2i
    //   3553: ldc_w -587280291
    //   3556: ixor
    //   3557: ixor
    //   3558: lookupswitch default -> 3584, -515169658 -> 3541, 133390662 -> 4993
    //   3584: dstore #6
    //   3586: getstatic Perryc.1 : I
    //   3589: ifeq -> 3603
    //   3592: ldc2_w -2061110990
    //   3595: l2i
    //   3596: ldc_w 1435082526
    //   3599: ixor
    //   3600: goto -> 3611
    //   3603: ldc2_w 838738432
    //   3606: l2i
    //   3607: ldc_w -110565252
    //   3610: ixor
    //   3611: ldc2_w 378722517
    //   3614: l2i
    //   3615: ldc_w -1834679875
    //   3618: ixor
    //   3619: ixor
    //   3620: lookupswitch default -> 3648, -1877877094 -> 3603, 1419491140 -> 4947
    //   3648: aload_0
    //   3649: getstatic Perryc.c : I
    //   3652: iflt -> 3666
    //   3655: ldc2_w -953321226
    //   3658: l2i
    //   3659: ldc_w -691946938
    //   3662: ixor
    //   3663: goto -> 3674
    //   3666: ldc2_w -888438749
    //   3669: l2i
    //   3670: ldc_w -1610719883
    //   3673: ixor
    //   3674: ldc2_w -574830978
    //   3677: l2i
    //   3678: ldc_w -1114370014
    //   3681: ixor
    //   3682: ixor
    //   3683: lookupswitch default -> 3708, 1511558738 -> 3666, 1908675820 -> 4913
    //   3708: aload_3
    //   3709: getstatic Perryc.1 : I
    //   3712: ifeq -> 3726
    //   3715: ldc2_w 919235274
    //   3718: l2i
    //   3719: ldc_w 1337066043
    //   3722: ixor
    //   3723: goto -> 3734
    //   3726: ldc2_w -27246669
    //   3729: l2i
    //   3730: ldc_w 1888728322
    //   3733: ixor
    //   3734: ldc2_w -1155971146
    //   3737: l2i
    //   3738: ldc_w 1704663297
    //   3741: ixor
    //   3742: ixor
    //   3743: lookupswitch default -> 5007, -1476774330 -> 3726, 1349637126 -> 3768
    //   3768: getfield field_70136_U : D
    //   3771: getstatic Perryc.0 : I
    //   3774: ifle -> 3788
    //   3777: ldc2_w -535457244
    //   3780: l2i
    //   3781: ldc_w -1961538769
    //   3784: ixor
    //   3785: goto -> 3796
    //   3788: ldc2_w -175477606
    //   3791: l2i
    //   3792: ldc_w 1929226380
    //   3795: ixor
    //   3796: ldc2_w -556947960
    //   3799: l2i
    //   3800: ldc_w 234481464
    //   3803: ixor
    //   3804: ixor
    //   3805: lookupswitch default -> 3832, -2023829412 -> 3788, -1204512709 -> 4941
    //   3832: aload_3
    //   3833: getstatic Perryc.1 : I
    //   3836: ifeq -> 3850
    //   3839: ldc2_w 1604021125
    //   3842: l2i
    //   3843: ldc_w 1793713430
    //   3846: ixor
    //   3847: goto -> 3858
    //   3850: ldc2_w -1717957470
    //   3853: l2i
    //   3854: ldc_w 173240993
    //   3857: ixor
    //   3858: ldc2_w 1248287439
    //   3861: l2i
    //   3862: ldc_w -299999401
    //   3865: ixor
    //   3866: ixor
    //   3867: lookupswitch default -> 3892, -1861514485 -> 4973, -601100338 -> 3850
    //   3892: getfield field_70161_v : D
    //   3895: getstatic Perryc.0 : I
    //   3898: ifle -> 3912
    //   3901: ldc2_w 2136836983
    //   3904: l2i
    //   3905: ldc_w -1685485343
    //   3908: ixor
    //   3909: goto -> 3920
    //   3912: ldc2_w 679933639
    //   3915: l2i
    //   3916: ldc_w 2141163590
    //   3919: ixor
    //   3920: ldc2_w 2038508185
    //   3923: l2i
    //   3924: ldc_w -230915338
    //   3927: ixor
    //   3928: ixor
    //   3929: lookupswitch default -> 4929, -593178898 -> 3956, 1869196281 -> 3912
    //   3956: aload_1
    //   3957: getstatic Perryc.0 : I
    //   3960: ifle -> 3974
    //   3963: ldc2_w -511580008
    //   3966: l2i
    //   3967: ldc_w 1333184965
    //   3970: ixor
    //   3971: goto -> 3982
    //   3974: ldc2_w -1900113580
    //   3977: l2i
    //   3978: ldc_w -1602386059
    //   3981: ixor
    //   3982: ldc2_w 1927586754
    //   3985: l2i
    //   3986: ldc_w 1405614101
    //   3989: ixor
    //   3990: ixor
    //   3991: lookupswitch default -> 4983, -1881900406 -> 3974, 266358262 -> 4016
    //   4016: goto -> 4020
    //   4019: athrow
    //   4020: invokevirtual getPartialTicks : ()F
    //   4023: goto -> 4027
    //   4026: athrow
    //   4027: getstatic Perryc.1 : I
    //   4030: ifeq -> 4044
    //   4033: ldc2_w -74896414
    //   4036: l2i
    //   4037: ldc_w 650221831
    //   4040: ixor
    //   4041: goto -> 4052
    //   4044: ldc2_w -2024317701
    //   4047: l2i
    //   4048: ldc_w -1772386614
    //   4051: ixor
    //   4052: ldc2_w 1287905569
    //   4055: l2i
    //   4056: ldc_w 1625924955
    //   4059: ixor
    //   4060: ixor
    //   4061: lookupswitch default -> 4088, -245172577 -> 4951, 736684751 -> 4044
    //   4088: goto -> 4092
    //   4091: athrow
    //   4092: invokespecial interpolate : (DDF)D
    //   4095: goto -> 4099
    //   4098: athrow
    //   4099: getstatic Perryc.c : I
    //   4102: iflt -> 4116
    //   4105: ldc2_w -1739756264
    //   4108: l2i
    //   4109: ldc_w -1069422951
    //   4112: ixor
    //   4113: goto -> 4124
    //   4116: ldc2_w -17429924
    //   4119: l2i
    //   4120: ldc_w 1266845027
    //   4123: ixor
    //   4124: ldc2_w 856015426
    //   4127: l2i
    //   4128: ldc_w 1800604305
    //   4131: ixor
    //   4132: ixor
    //   4133: lookupswitch default -> 4897, -316520468 -> 4160, 5915474 -> 4116
    //   4160: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   4163: getstatic Perryc.c : I
    //   4166: iflt -> 4180
    //   4169: ldc2_w 1474105539
    //   4172: l2i
    //   4173: ldc_w -1440018607
    //   4176: ixor
    //   4177: goto -> 4188
    //   4180: ldc2_w -1420242698
    //   4183: l2i
    //   4184: ldc_w -1062706355
    //   4187: ixor
    //   4188: ldc2_w 1142753445
    //   4191: l2i
    //   4192: ldc_w 66547391
    //   4195: ixor
    //   4196: ixor
    //   4197: lookupswitch default -> 4224, -1172539000 -> 4943, -453413507 -> 4180
    //   4224: goto -> 4228
    //   4227: athrow
    //   4228: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   4231: goto -> 4235
    //   4234: athrow
    //   4235: getstatic Perryc.1 : I
    //   4238: ifeq -> 4252
    //   4241: ldc2_w -1191147379
    //   4244: l2i
    //   4245: ldc_w 1137814318
    //   4248: ixor
    //   4249: goto -> 4260
    //   4252: ldc2_w -1086130063
    //   4255: l2i
    //   4256: ldc_w 882265181
    //   4259: ixor
    //   4260: ldc2_w -1497309544
    //   4263: l2i
    //   4264: ldc_w -710622157
    //   4267: ixor
    //   4268: ixor
    //   4269: lookupswitch default -> 4296, -1984612088 -> 4985, -1402443081 -> 4252
    //   4296: getfield field_78723_d : D
    //   4299: dsub
    //   4300: getstatic Perryc.1 : I
    //   4303: ifeq -> 4317
    //   4306: ldc2_w 308960164
    //   4309: l2i
    //   4310: ldc_w -370980749
    //   4313: ixor
    //   4314: goto -> 4325
    //   4317: ldc2_w 451025080
    //   4320: l2i
    //   4321: ldc_w -911334139
    //   4324: ixor
    //   4325: ldc2_w -1415772309
    //   4328: l2i
    //   4329: ldc_w 1266021544
    //   4332: ixor
    //   4333: ixor
    //   4334: lookupswitch default -> 4887, 459399188 -> 4317, 866438782 -> 4360
    //   4360: dstore #8
    //   4362: getstatic Perryc.1 : I
    //   4365: ifeq -> 4379
    //   4368: ldc2_w 954105355
    //   4371: l2i
    //   4372: ldc_w 221519353
    //   4375: ixor
    //   4376: goto -> 4387
    //   4379: ldc2_w 1062081774
    //   4382: l2i
    //   4383: ldc_w 687266768
    //   4386: ixor
    //   4387: ldc2_w 228964689
    //   4390: l2i
    //   4391: ldc_w 450202785
    //   4394: ixor
    //   4395: ixor
    //   4396: lookupswitch default -> 4937, 13171406 -> 4424, 580539906 -> 4379
    //   4424: aload_0
    //   4425: getstatic Perryc.1 : I
    //   4428: ifeq -> 4442
    //   4431: ldc2_w -1056069723
    //   4434: l2i
    //   4435: ldc_w -469835596
    //   4438: ixor
    //   4439: goto -> 4450
    //   4442: ldc2_w -674544823
    //   4445: l2i
    //   4446: ldc_w -285962723
    //   4449: ixor
    //   4450: ldc2_w 1817912975
    //   4453: l2i
    //   4454: ldc_w 1252478833
    //   4457: ixor
    //   4458: ixor
    //   4459: lookupswitch default -> 4484, 68103919 -> 4975, 1949240360 -> 4442
    //   4484: aload_3
    //   4485: getstatic Perryc.0 : I
    //   4488: ifle -> 4502
    //   4491: ldc2_w -405028332
    //   4494: l2i
    //   4495: ldc_w -327128335
    //   4498: ixor
    //   4499: goto -> 4510
    //   4502: ldc2_w 1790879577
    //   4505: l2i
    //   4506: ldc_w -1283460164
    //   4509: ixor
    //   4510: ldc2_w 180030217
    //   4513: l2i
    //   4514: ldc_w 1737717674
    //   4517: ixor
    //   4518: ixor
    //   4519: lookupswitch default -> 4911, -1259788218 -> 4544, 1718867014 -> 4502
    //   4544: dload #4
    //   4546: getstatic Perryc.1 : I
    //   4549: ifeq -> 4563
    //   4552: ldc2_w 244109417
    //   4555: l2i
    //   4556: ldc_w -1418421642
    //   4559: ixor
    //   4560: goto -> 4571
    //   4563: ldc2_w 252471507
    //   4566: l2i
    //   4567: ldc_w -181981468
    //   4570: ixor
    //   4571: ldc2_w -233133537
    //   4574: l2i
    //   4575: ldc_w 422982875
    //   4578: ixor
    //   4579: ixor
    //   4580: lookupswitch default -> 4608, -1968205121 -> 4563, 1322570971 -> 5009
    //   4608: dload #6
    //   4610: getstatic Perryc.0 : I
    //   4613: ifle -> 4627
    //   4616: ldc2_w 1159999678
    //   4619: l2i
    //   4620: ldc_w -546469665
    //   4623: ixor
    //   4624: goto -> 4635
    //   4627: ldc2_w -112568191
    //   4630: l2i
    //   4631: ldc_w -956567114
    //   4634: ixor
    //   4635: ldc2_w 1833574314
    //   4638: l2i
    //   4639: ldc_w -379694477
    //   4642: ixor
    //   4643: ixor
    //   4644: lookupswitch default -> 4959, -1146755858 -> 4672, 509474232 -> 4627
    //   4672: dload #8
    //   4674: getstatic Perryc.0 : I
    //   4677: ifle -> 4691
    //   4680: ldc2_w -247280912
    //   4683: l2i
    //   4684: ldc_w -790089553
    //   4687: ixor
    //   4688: goto -> 4699
    //   4691: ldc2_w -953063818
    //   4694: l2i
    //   4695: ldc_w 8557205
    //   4698: ixor
    //   4699: ldc2_w -1657982425
    //   4702: l2i
    //   4703: ldc_w 1530609020
    //   4706: ixor
    //   4707: ixor
    //   4708: lookupswitch default -> 4736, -407046908 -> 4953, 333661163 -> 4691
    //   4736: aload_1
    //   4737: getstatic Perryc.0 : I
    //   4740: ifle -> 4754
    //   4743: ldc2_w -1791064250
    //   4746: l2i
    //   4747: ldc_w 247275317
    //   4750: ixor
    //   4751: goto -> 4762
    //   4754: ldc2_w 568324524
    //   4757: l2i
    //   4758: ldc_w -834704417
    //   4761: ixor
    //   4762: ldc2_w 1125677396
    //   4765: l2i
    //   4766: ldc_w -478712142
    //   4769: ixor
    //   4770: ixor
    //   4771: lookupswitch default -> 4796, -1775959590 -> 4754, 1005358997 -> 4927
    //   4796: goto -> 4800
    //   4799: athrow
    //   4800: invokevirtual getPartialTicks : ()F
    //   4803: goto -> 4807
    //   4806: athrow
    //   4807: getstatic Perryc.1 : I
    //   4810: ifeq -> 4824
    //   4813: ldc2_w -438445167
    //   4816: l2i
    //   4817: ldc_w 565191537
    //   4820: ixor
    //   4821: goto -> 4832
    //   4824: ldc2_w 976606134
    //   4827: l2i
    //   4828: ldc_w 1182435793
    //   4831: ixor
    //   4832: ldc2_w -914991871
    //   4835: l2i
    //   4836: ldc_w 1951103778
    //   4839: ixor
    //   4840: ixor
    //   4841: lookupswitch default -> 4961, -1049463740 -> 4868, 2035340995 -> 4824
    //   4868: goto -> 4872
    //   4871: athrow
    //   4872: invokespecial renderNameTag : (Lnet/minecraft/entity/player/EntityPlayer;DDDF)V
    //   4875: goto -> 4879
    //   4878: athrow
    //   4879: goto -> 349
    //   4882: return
    //   4883: aconst_null
    //   4884: athrow
    //   4885: aconst_null
    //   4886: athrow
    //   4887: aconst_null
    //   4888: athrow
    //   4889: aconst_null
    //   4890: athrow
    //   4891: aconst_null
    //   4892: athrow
    //   4893: aconst_null
    //   4894: athrow
    //   4895: aconst_null
    //   4896: athrow
    //   4897: aconst_null
    //   4898: athrow
    //   4899: aconst_null
    //   4900: athrow
    //   4901: aconst_null
    //   4902: athrow
    //   4903: aconst_null
    //   4904: athrow
    //   4905: aconst_null
    //   4906: athrow
    //   4907: aconst_null
    //   4908: athrow
    //   4909: aconst_null
    //   4910: athrow
    //   4911: aconst_null
    //   4912: athrow
    //   4913: aconst_null
    //   4914: athrow
    //   4915: aconst_null
    //   4916: athrow
    //   4917: aconst_null
    //   4918: athrow
    //   4919: aconst_null
    //   4920: athrow
    //   4921: aconst_null
    //   4922: athrow
    //   4923: aconst_null
    //   4924: athrow
    //   4925: aconst_null
    //   4926: athrow
    //   4927: aconst_null
    //   4928: athrow
    //   4929: aconst_null
    //   4930: athrow
    //   4931: aconst_null
    //   4932: athrow
    //   4933: aconst_null
    //   4934: athrow
    //   4935: aconst_null
    //   4936: athrow
    //   4937: aconst_null
    //   4938: athrow
    //   4939: aconst_null
    //   4940: athrow
    //   4941: aconst_null
    //   4942: athrow
    //   4943: aconst_null
    //   4944: athrow
    //   4945: aconst_null
    //   4946: athrow
    //   4947: aconst_null
    //   4948: athrow
    //   4949: aconst_null
    //   4950: athrow
    //   4951: aconst_null
    //   4952: athrow
    //   4953: aconst_null
    //   4954: athrow
    //   4955: aconst_null
    //   4956: athrow
    //   4957: aconst_null
    //   4958: athrow
    //   4959: aconst_null
    //   4960: athrow
    //   4961: aconst_null
    //   4962: athrow
    //   4963: aconst_null
    //   4964: athrow
    //   4965: aconst_null
    //   4966: athrow
    //   4967: aconst_null
    //   4968: athrow
    //   4969: aconst_null
    //   4970: athrow
    //   4971: aconst_null
    //   4972: athrow
    //   4973: aconst_null
    //   4974: athrow
    //   4975: aconst_null
    //   4976: athrow
    //   4977: aconst_null
    //   4978: athrow
    //   4979: aconst_null
    //   4980: athrow
    //   4981: aconst_null
    //   4982: athrow
    //   4983: aconst_null
    //   4984: athrow
    //   4985: aconst_null
    //   4986: athrow
    //   4987: aconst_null
    //   4988: athrow
    //   4989: aconst_null
    //   4990: athrow
    //   4991: aconst_null
    //   4992: athrow
    //   4993: aconst_null
    //   4994: athrow
    //   4995: aconst_null
    //   4996: athrow
    //   4997: aconst_null
    //   4998: athrow
    //   4999: aconst_null
    //   5000: athrow
    //   5001: aconst_null
    //   5002: athrow
    //   5003: aconst_null
    //   5004: athrow
    //   5005: aconst_null
    //   5006: athrow
    //   5007: aconst_null
    //   5008: athrow
    //   5009: aconst_null
    //   5010: athrow
    //   5011: aconst_null
    //   5012: athrow
    //   5013: aconst_null
    //   5014: athrow
    //   5015: aconst_null
    //   5016: athrow
    //   5017: aconst_null
    //   5018: athrow
    //   5019: aconst_null
    //   5020: athrow
    //   5021: pop
    //   5022: goto -> 24
    //   5025: pop
    //   5026: aconst_null
    //   5027: goto -> 5021
    //   5030: dup
    //   5031: ifnull -> 5021
    //   5034: checkcast java/lang/Throwable
    //   5037: athrow
    //   5038: dup
    //   5039: ifnull -> 5025
    //   5042: checkcast java/lang/Throwable
    //   5045: athrow
    //   5046: aconst_null
    //   5047: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2810	2069	4	x	D
    //   3586	1293	6	y	D
    //   4362	517	8	z	D
    //   733	4146	3	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	4859	0	this	Lbigname/zprestige/webhack/features/modules/Render/Nametags;
    //   24	4859	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	5030	finally
    //   280	288	288	finally
    //   280	288	3	java/lang/UnsupportedOperationException
    //   280	288	288	java/lang/NullPointerException
    //   280	288	288	finally
    //   280	288	288	finally
    //   471	480	480	finally
    //   471	480	471	java/lang/NegativeArraySizeException
    //   471	480	471	finally
    //   472	480	480	finally
    //   472	480	3	java/lang/UnsupportedOperationException
    //   659	668	668	finally
    //   659	668	3	java/lang/NegativeArraySizeException
    //   659	668	3	finally
    //   660	668	3	java/lang/UnsupportedOperationException
    //   660	668	659	java/util/NoSuchElementException
    //   1099	1106	1106	finally
    //   1099	1106	1099	finally
    //   1100	1106	1099	java/lang/StringIndexOutOfBoundsException
    //   1100	1106	1106	finally
    //   1100	1106	3	java/lang/ArrayIndexOutOfBoundsException
    //   1283	1290	1290	finally
    //   1283	1290	1283	finally
    //   1284	1290	1283	java/lang/UnsupportedOperationException
    //   1284	1290	1290	java/lang/ArrayIndexOutOfBoundsException
    //   1284	1290	1283	java/lang/IllegalStateException
    //   1467	1474	1474	finally
    //   1467	1474	1474	finally
    //   1467	1474	1467	finally
    //   1468	1474	1474	finally
    //   1468	1474	3	finally
    //   1715	1722	1722	finally
    //   1715	1722	3	finally
    //   1716	1722	1715	java/lang/ClassCastException
    //   1716	1722	3	finally
    //   1716	1722	1715	java/util/NoSuchElementException
    //   1792	1798	1798	finally
    //   1792	1798	3	java/lang/NumberFormatException
    //   1792	1798	3	java/lang/NumberFormatException
    //   1792	1798	3	java/lang/IllegalArgumentException
    //   1792	1798	3	java/lang/RuntimeException
    //   1975	1982	1982	finally
    //   1975	1982	1975	finally
    //   1976	1982	1982	finally
    //   1976	1982	3	java/lang/IndexOutOfBoundsException
    //   1976	1982	3	java/lang/UnsupportedOperationException
    //   2467	2474	2474	finally
    //   2467	2474	2467	finally
    //   2467	2474	2474	java/lang/NegativeArraySizeException
    //   2467	2474	2474	finally
    //   2468	2474	3	finally
    //   2540	2546	2546	finally
    //   2540	2546	3	java/lang/NegativeArraySizeException
    //   2540	2546	3	java/util/ConcurrentModificationException
    //   2540	2546	3	java/lang/NegativeArraySizeException
    //   2540	2546	3	java/lang/NumberFormatException
    //   2675	2682	2682	finally
    //   2675	2682	2675	java/lang/NumberFormatException
    //   2675	2682	2675	finally
    //   2675	2682	2675	java/lang/EnumConstantNotPresentException
    //   2676	2682	2675	finally
    //   3243	3250	3250	finally
    //   3243	3250	3	java/lang/RuntimeException
    //   3243	3250	3	finally
    //   3243	3250	3250	finally
    //   3244	3250	3243	finally
    //   3315	3322	3322	finally
    //   3315	3322	3322	finally
    //   3316	3322	3315	finally
    //   3316	3322	3322	finally
    //   3316	3322	3322	java/util/ConcurrentModificationException
    //   3451	3458	3458	finally
    //   3451	3458	3458	java/lang/EnumConstantNotPresentException
    //   3452	3458	3451	java/lang/ArrayIndexOutOfBoundsException
    //   3452	3458	3458	finally
    //   3452	3458	3458	finally
    //   4020	4026	4026	finally
    //   4020	4026	3	finally
    //   4020	4026	3	finally
    //   4020	4026	3	finally
    //   4020	4026	4026	finally
    //   4091	4098	4098	finally
    //   4091	4098	3	java/lang/IllegalArgumentException
    //   4092	4098	4091	finally
    //   4092	4098	4098	finally
    //   4092	4098	3	java/lang/EnumConstantNotPresentException
    //   4227	4234	4234	finally
    //   4228	4234	3	finally
    //   4228	4234	4227	java/lang/IndexOutOfBoundsException
    //   4228	4234	3	finally
    //   4228	4234	3	finally
    //   4799	4806	4806	finally
    //   4799	4806	3	java/lang/ArithmeticException
    //   4799	4806	3	java/lang/AssertionError
    //   4800	4806	4806	java/lang/IndexOutOfBoundsException
    //   4800	4806	4799	java/lang/ArrayIndexOutOfBoundsException
    //   4872	4878	4878	finally
    //   4872	4878	3	finally
    //   4872	4878	4878	java/lang/ArrayIndexOutOfBoundsException
    //   4872	4878	3	java/lang/AssertionError
    //   4872	4878	3	finally
    //   5030	5038	5030	finally
    //   5046	5048	3	finally
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.26(this, (int)-826409869L ^ 0x85BE2FC6, paramObject);
  }
  
  public int getOutlineColor(EntityPlayer paramEntityPlayer) {
    return Perry1.3b(this, (int)-515990142L ^ 0x9C8B2B4F, paramEntityPlayer);
  }
  
  public boolean lambda$new$7(Object paramObject) {
    return Perry1.1Y(this, (int)-965881651L ^ 0xFB7EC397, paramObject);
  }
  
  public boolean lambda$new$5(Object paramObject) {
    return Perry1.1D(this, (int)-1644041477L ^ 0xA297A371, paramObject);
  }
  
  public void drawOutlineRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
    Perry1.1l(this, (int)1355096891L ^ 0x79B2D65, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt);
  }
  
  public void OutlineRainbow() {
    Perry1.3I(this, (int)731194701L ^ 0x3BFF0313);
  }
  
  public boolean lambda$new$20(Object paramObject) {
    return Perry1.24(this, (int)1814274946L ^ 0x2B48FCB4, paramObject);
  }
  
  public void TextRainbow() {
    Perry1.3P(this, (int)-32734358L ^ 0xE4C159AA);
  }
  
  public float getBiggestArmorTag(EntityPlayer player) {
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
  
  public boolean lambda$new$3(Boolean paramBoolean) {
    return Perry1.2x(this, (int)906924381L ^ 0xC7ED19D, paramBoolean);
  }
  
  public void renderItemStack(ItemStack stack, int x, int y) {
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
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.1S(this, (int)426937079L ^ 0x7D2B02CF, paramObject);
  }
  
  public void drawRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
    Perry1.1l(this, (int)-779348046L ^ 0x86D219EF, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramInt);
  }
  
  public boolean lambda$new$13(Object paramObject) {
    return Perry1.1U(this, (int)-421696795L ^ 0xEF0DB3F8, paramObject);
  }
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.1D(this, (int)-371482138L ^ 0xD54DE86D, paramObject);
  }
  
  public boolean lambda$new$15(Object paramObject) {
    return Perry1.1O(this, (int)-1234693233L ^ 0xF2B3BE96, paramObject);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.25(this, (int)-1164028235L ^ 0xD2C0ECC2, paramObject);
  }
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.1A(this, (int)952312293L ^ 0x3EDE7C6F, paramObject);
  }
  
  public String getDisplayTag(EntityPlayer player) {
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
  
  public boolean lambda$new$11(Object paramObject) {
    return Perry1.29(this, (int)400518114L ^ 0x36073061, paramObject);
  }
  
  public boolean lambda$new$14(Object paramObject) {
    return Perry1.1y(this, (int)-1406018881L ^ 0x8E87BA7F, paramObject);
  }
  
  public boolean lambda$new$4(Object paramObject) {
    return Perry1.1y(this, (int)659478636L ^ 0x5F8B8AD, paramObject);
  }
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.1z(this, (int)-1776424292L ^ 0xF3817900, paramObject);
  }
  
  public boolean lambda$new$18(Object paramObject) {
    return Perry1.1Q(this, (int)-1205955284L ^ 0xB9123671, paramObject);
  }
  
  public int getDisplayColor(EntityPlayer paramEntityPlayer) {
    return Perry1.3d(this, (int)1515490878L ^ 0x474BB144, paramEntityPlayer);
  }
  
  public void onUpdate() {
    Perry1.3s(this, (int)-1665927999L ^ 0xBC9FFA66);
  }
  
  public boolean lambda$new$17(Object paramObject) {
    return Perry1.1t(this, (int)-518137761L ^ 0xB0D347BC, paramObject);
  }
  
  public boolean lambda$new$2(Object paramObject) {
    return Perry1.1V(this, (int)-825870761L ^ 0xAC25F875, paramObject);
  }
  
  static {
    // Byte code:
    //   0: ldc bigname/zprestige/webhack/features/modules/Render/Nametags
    //   2: getstatic Perryc.0 : I
    //   5: ifle -> 19
    //   8: ldc2_w -778796787
    //   11: l2i
    //   12: ldc_w 516591313
    //   15: ixor
    //   16: goto -> 27
    //   19: ldc2_w -1759695118
    //   22: l2i
    //   23: ldc_w 2048245143
    //   26: ixor
    //   27: ldc2_w -865045552
    //   30: l2i
    //   31: ldc_w 2001602769
    //   34: ixor
    //   35: ixor
    //   36: lookupswitch default -> 340, 1446439012 -> 64, 1952478429 -> 19
    //   64: invokevirtual desiredAssertionStatus : ()Z
    //   67: ifne -> 81
    //   70: ldc2_w 368662800
    //   73: l2i
    //   74: ldc_w 768013508
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 986735869
    //   84: l2i
    //   85: ldc_w 49269034
    //   88: ixor
    //   89: ldc2_w 712731890
    //   92: l2i
    //   93: ldc_w -1098503361
    //   96: ixor
    //   97: ixor
    //   98: tableswitch default -> 70, -1396512231 -> 120, -1396512230 -> 131
    //   120: ldc2_w 252739146
    //   123: l2i
    //   124: ldc_w 252739147
    //   127: ixor
    //   128: goto -> 139
    //   131: ldc2_w -389355248
    //   134: l2i
    //   135: ldc_w -389355248
    //   138: ixor
    //   139: getstatic Perryc.1 : I
    //   142: ifeq -> 156
    //   145: ldc2_w 769785763
    //   148: l2i
    //   149: ldc_w 1266545063
    //   152: ixor
    //   153: goto -> 164
    //   156: ldc2_w -1431604194
    //   159: l2i
    //   160: ldc_w 992771633
    //   163: ixor
    //   164: ldc2_w 1856981905
    //   167: l2i
    //   168: ldc_w 979580387
    //   171: ixor
    //   172: ixor
    //   173: lookupswitch default -> 342, -984910755 -> 200, 844132470 -> 156
    //   200: putstatic bigname/zprestige/webhack/features/modules/Render/Nametags.$assertionsDisabled : Z
    //   203: new bigname/zprestige/webhack/features/modules/Render/Nametags
    //   206: dup
    //   207: getstatic Perryc.c : I
    //   210: iflt -> 224
    //   213: ldc2_w -1414900305
    //   216: l2i
    //   217: ldc_w -39392866
    //   220: ixor
    //   221: goto -> 232
    //   224: ldc2_w 492610097
    //   227: l2i
    //   228: ldc_w -1448265407
    //   231: ixor
    //   232: ldc2_w -1664267923
    //   235: l2i
    //   236: ldc_w -1873542781
    //   239: ixor
    //   240: ixor
    //   241: lookupswitch default -> 268, -974399990 -> 224, 1519776991 -> 338
    //   268: invokespecial <init> : ()V
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w 2055568970
    //   280: l2i
    //   281: ldc_w 945132668
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -1774505613
    //   291: l2i
    //   292: ldc_w -1856219780
    //   295: ixor
    //   296: ldc2_w 1677850407
    //   299: l2i
    //   300: ldc_w 1091830408
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 336, 577933728 -> 332, 1740971929 -> 288
    //   332: putstatic bigname/zprestige/webhack/features/modules/Render/Nametags.INSTANCE : Lbigname/zprestige/webhack/features/modules/Render/Nametags;
    //   335: return
    //   336: aconst_null
    //   337: athrow
    //   338: aconst_null
    //   339: athrow
    //   340: aconst_null
    //   341: athrow
    //   342: aconst_null
    //   343: athrow
  }
  
  public boolean lambda$new$19(Object paramObject) {
    return Perry1.1w(this, (int)-204223873L ^ 0xB3171DE3, paramObject);
  }
  
  public static Nametags getInstance() {
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
  
  public void renderNameTag(EntityPlayer player, double x, double y, double z, float delta) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 25949
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 25941
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 25933
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1193096949
    //   33: l2i
    //   34: ldc_w -1860599111
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1347693510
    //   44: l2i
    //   45: ldc_w -1880202464
    //   48: ixor
    //   49: ldc2_w 1447779036
    //   52: l2i
    //   53: ldc_w -1106539598
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 25882, -939170188 -> 84, 1044669730 -> 41
    //   84: dload #4
    //   86: getstatic Perryc.1 : I
    //   89: ifeq -> 103
    //   92: ldc2_w -1460388984
    //   95: l2i
    //   96: ldc_w 2136746484
    //   99: ixor
    //   100: goto -> 111
    //   103: ldc2_w -51061536
    //   106: l2i
    //   107: ldc_w -101318963
    //   110: ixor
    //   111: ldc2_w -706459170
    //   114: l2i
    //   115: ldc_w 676862197
    //   118: ixor
    //   119: ixor
    //   120: lookupswitch default -> 148, -1152950173 -> 103, 705971031 -> 25590
    //   148: dstore #9
    //   150: getstatic Perryc.c : I
    //   153: iflt -> 167
    //   156: ldc2_w 2140481526
    //   159: l2i
    //   160: ldc_w 631766369
    //   163: ixor
    //   164: goto -> 175
    //   167: ldc2_w -1883314224
    //   170: l2i
    //   171: ldc_w -738276787
    //   174: ixor
    //   175: ldc2_w 481405936
    //   178: l2i
    //   179: ldc_w 230133158
    //   182: ixor
    //   183: ixor
    //   184: lookupswitch default -> 25712, 1261763777 -> 167, 1296436171 -> 212
    //   212: dload #9
    //   214: getstatic Perryc.0 : I
    //   217: ifle -> 231
    //   220: ldc2_w -563999980
    //   223: l2i
    //   224: ldc_w 1546207005
    //   227: ixor
    //   228: goto -> 239
    //   231: ldc2_w -514805378
    //   234: l2i
    //   235: ldc_w 293690526
    //   238: ixor
    //   239: ldc2_w -1555803681
    //   242: l2i
    //   243: ldc_w 1058627035
    //   246: ixor
    //   247: ixor
    //   248: lookupswitch default -> 25254, 504772621 -> 231, 1821172196 -> 276
    //   276: aload_1
    //   277: getstatic Perryc.0 : I
    //   280: ifle -> 294
    //   283: ldc2_w -804637073
    //   286: l2i
    //   287: ldc_w -49001070
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w 971214907
    //   297: l2i
    //   298: ldc_w -553214753
    //   301: ixor
    //   302: ldc2_w -1730857205
    //   305: l2i
    //   306: ldc_w -1188812203
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 25366, -954986054 -> 336, 217015971 -> 294
    //   336: goto -> 340
    //   339: athrow
    //   340: invokevirtual func_70093_af : ()Z
    //   343: goto -> 347
    //   346: athrow
    //   347: ifeq -> 361
    //   350: ldc2_w 2120588298
    //   353: l2i
    //   354: ldc_w 1386702917
    //   357: ixor
    //   358: goto -> 369
    //   361: ldc2_w 322896493
    //   364: l2i
    //   365: ldc_w 1073608227
    //   368: ixor
    //   369: ldc2_w -311091187
    //   372: l2i
    //   373: ldc_w -731950780
    //   376: ixor
    //   377: ixor
    //   378: tableswitch default -> 350, 367559942 -> 400, 367559943 -> 416
    //   400: ldc2_w 11.779888950423269
    //   403: invokestatic doubleToLongBits : (D)J
    //   406: ldc2_w 9207485526653872335
    //   409: lxor
    //   410: invokestatic longBitsToDouble : (J)D
    //   413: goto -> 429
    //   416: ldc2_w 11.072984412513948
    //   419: invokestatic doubleToLongBits : (D)J
    //   422: ldc2_w 9205431547499895967
    //   425: lxor
    //   426: invokestatic longBitsToDouble : (J)D
    //   429: dadd
    //   430: getstatic Perryc.1 : I
    //   433: ifeq -> 447
    //   436: ldc2_w 520807497
    //   439: l2i
    //   440: ldc_w -1072850015
    //   443: ixor
    //   444: goto -> 455
    //   447: ldc2_w 1822892924
    //   450: l2i
    //   451: ldc_w 764451567
    //   454: ixor
    //   455: ldc2_w -959713427
    //   458: l2i
    //   459: ldc_w 829729346
    //   462: ixor
    //   463: ixor
    //   464: lookupswitch default -> 25288, -1232536388 -> 492, 683162311 -> 447
    //   492: dstore #9
    //   494: getstatic Perryc.1 : I
    //   497: ifeq -> 511
    //   500: ldc2_w 777530233
    //   503: l2i
    //   504: ldc_w -1510099281
    //   507: ixor
    //   508: goto -> 519
    //   511: ldc2_w 595503340
    //   514: l2i
    //   515: ldc_w -754726500
    //   518: ixor
    //   519: ldc2_w -2116872953
    //   522: l2i
    //   523: ldc_w -1331412664
    //   526: ixor
    //   527: ixor
    //   528: lookupswitch default -> 25824, -1160590951 -> 511, -1056295617 -> 556
    //   556: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   559: getstatic Perryc.c : I
    //   562: iflt -> 576
    //   565: ldc2_w -615626620
    //   568: l2i
    //   569: ldc_w 6958471
    //   572: ixor
    //   573: goto -> 584
    //   576: ldc2_w -1977085318
    //   579: l2i
    //   580: ldc_w -1836289963
    //   583: ixor
    //   584: ldc2_w 2140760590
    //   587: l2i
    //   588: ldc_w -236571482
    //   591: ixor
    //   592: ixor
    //   593: lookupswitch default -> 25810, -1764017017 -> 620, 1432042411 -> 576
    //   620: goto -> 624
    //   623: athrow
    //   624: invokevirtual func_175606_aa : ()Lnet/minecraft/entity/Entity;
    //   627: goto -> 631
    //   630: athrow
    //   631: getstatic Perryc.0 : I
    //   634: ifle -> 648
    //   637: ldc2_w 712115818
    //   640: l2i
    //   641: ldc_w -233590588
    //   644: ixor
    //   645: goto -> 656
    //   648: ldc2_w -55054275
    //   651: l2i
    //   652: ldc_w -236778160
    //   655: ixor
    //   656: ldc2_w -496634952
    //   659: l2i
    //   660: ldc_w -23486726
    //   663: ixor
    //   664: ixor
    //   665: lookupswitch default -> 25746, -996287508 -> 648, 296259631 -> 692
    //   692: astore #11
    //   694: getstatic Perryc.0 : I
    //   697: ifle -> 711
    //   700: ldc2_w -1414993131
    //   703: l2i
    //   704: ldc_w 737710672
    //   707: ixor
    //   708: goto -> 719
    //   711: ldc2_w 91406721
    //   714: l2i
    //   715: ldc_w -510213135
    //   718: ixor
    //   719: ldc2_w 733544284
    //   722: l2i
    //   723: ldc_w -680434350
    //   726: ixor
    //   727: ixor
    //   728: lookupswitch default -> 756, -2090266732 -> 711, 2090459979 -> 25726
    //   756: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.$assertionsDisabled : Z
    //   759: ifne -> 773
    //   762: ldc2_w -880728950
    //   765: l2i
    //   766: ldc_w -286762835
    //   769: ixor
    //   770: goto -> 781
    //   773: ldc2_w -1007441611
    //   776: l2i
    //   777: ldc_w -426060527
    //   780: ixor
    //   781: ldc2_w -949305832
    //   784: l2i
    //   785: ldc_w -988174046
    //   788: ixor
    //   789: ixor
    //   790: tableswitch default -> 762, 656042781 -> 812, 656042782 -> 1004
    //   812: getstatic Perryc.c : I
    //   815: iflt -> 829
    //   818: ldc2_w -467329097
    //   821: l2i
    //   822: ldc_w -1587546374
    //   825: ixor
    //   826: goto -> 837
    //   829: ldc2_w -556044755
    //   832: l2i
    //   833: ldc_w -1754241803
    //   836: ixor
    //   837: ldc2_w -1932849783
    //   840: l2i
    //   841: ldc_w -1399347704
    //   844: ixor
    //   845: ixor
    //   846: lookupswitch default -> 872, 1697006284 -> 25916, 2091994454 -> 829
    //   872: aload #11
    //   874: ifnonnull -> 888
    //   877: ldc2_w 1241314643
    //   880: l2i
    //   881: ldc_w 952057729
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 1367576946
    //   891: l2i
    //   892: ldc_w 549477287
    //   895: ixor
    //   896: ldc2_w -1616204675
    //   899: l2i
    //   900: ldc_w -1066023452
    //   903: ixor
    //   904: ixor
    //   905: tableswitch default -> 877, 782017355 -> 928, 782017356 -> 1004
    //   928: new java/lang/AssertionError
    //   931: dup
    //   932: getstatic Perryc.0 : I
    //   935: ifle -> 949
    //   938: ldc2_w 64979728
    //   941: l2i
    //   942: ldc_w -837969688
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 1315588037
    //   952: l2i
    //   953: ldc_w 1098389028
    //   956: ixor
    //   957: ldc2_w 233253169
    //   960: l2i
    //   961: ldc_w -1905820738
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 25840, -1936587922 -> 992, 1314015607 -> 949
    //   992: goto -> 996
    //   995: athrow
    //   996: invokespecial <init> : ()V
    //   999: goto -> 1003
    //   1002: athrow
    //   1003: athrow
    //   1004: getstatic Perryc.c : I
    //   1007: iflt -> 1021
    //   1010: ldc2_w 814488391
    //   1013: l2i
    //   1014: ldc_w -1636522241
    //   1017: ixor
    //   1018: goto -> 1029
    //   1021: ldc2_w -390453391
    //   1024: l2i
    //   1025: ldc_w -852139903
    //   1028: ixor
    //   1029: ldc2_w 745288063
    //   1032: l2i
    //   1033: ldc_w 2061117532
    //   1036: ixor
    //   1037: ixor
    //   1038: lookupswitch default -> 1064, -129063781 -> 25542, 323682 -> 1021
    //   1064: aload #11
    //   1066: getstatic Perryc.1 : I
    //   1069: ifeq -> 1083
    //   1072: ldc2_w -371365268
    //   1075: l2i
    //   1076: ldc_w -613580104
    //   1079: ixor
    //   1080: goto -> 1091
    //   1083: ldc2_w 1234479179
    //   1086: l2i
    //   1087: ldc_w 1171392621
    //   1090: ixor
    //   1091: ldc2_w 1297249807
    //   1094: l2i
    //   1095: ldc_w 741233858
    //   1098: ixor
    //   1099: ixor
    //   1100: lookupswitch default -> 25406, 1405930009 -> 1083, 1832551147 -> 1128
    //   1128: getfield field_70165_t : D
    //   1131: getstatic Perryc.1 : I
    //   1134: ifeq -> 1148
    //   1137: ldc2_w -1973445157
    //   1140: l2i
    //   1141: ldc_w -1105481162
    //   1144: ixor
    //   1145: goto -> 1156
    //   1148: ldc2_w -378525024
    //   1151: l2i
    //   1152: ldc_w 1849399650
    //   1155: ixor
    //   1156: ldc2_w -358302450
    //   1159: l2i
    //   1160: ldc_w 1386737391
    //   1163: ixor
    //   1164: ixor
    //   1165: lookupswitch default -> 25326, -1941472244 -> 1148, 1061740579 -> 1192
    //   1192: dstore #12
    //   1194: getstatic Perryc.c : I
    //   1197: iflt -> 1211
    //   1200: ldc2_w -1152082813
    //   1203: l2i
    //   1204: ldc_w 657407713
    //   1207: ixor
    //   1208: goto -> 1219
    //   1211: ldc2_w 35517491
    //   1214: l2i
    //   1215: ldc_w -709398074
    //   1218: ixor
    //   1219: ldc2_w -1516391961
    //   1222: l2i
    //   1223: ldc_w 1533697085
    //   1226: ixor
    //   1227: ixor
    //   1228: lookupswitch default -> 25820, 693987375 -> 1256, 1653362616 -> 1211
    //   1256: aload #11
    //   1258: getstatic Perryc.0 : I
    //   1261: ifle -> 1275
    //   1264: ldc2_w -1950006199
    //   1267: l2i
    //   1268: ldc_w 1878342095
    //   1271: ixor
    //   1272: goto -> 1283
    //   1275: ldc2_w 1848935384
    //   1278: l2i
    //   1279: ldc_w 1124435760
    //   1282: ixor
    //   1283: ldc2_w 890187583
    //   1286: l2i
    //   1287: ldc_w 1081615103
    //   1290: ixor
    //   1291: ixor
    //   1292: lookupswitch default -> 1320, -1857589178 -> 25470, -871687867 -> 1275
    //   1320: getfield field_70163_u : D
    //   1323: getstatic Perryc.c : I
    //   1326: iflt -> 1340
    //   1329: ldc2_w 359761881
    //   1332: l2i
    //   1333: ldc_w 1235153515
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w 1726101001
    //   1343: l2i
    //   1344: ldc_w -1884935602
    //   1347: ixor
    //   1348: ldc2_w -487619
    //   1351: l2i
    //   1352: ldc_w -225662579
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 25644, -466601225 -> 1384, 1369133826 -> 1340
    //   1384: dstore #14
    //   1386: getstatic Perryc.0 : I
    //   1389: ifle -> 1403
    //   1392: ldc2_w -1424210806
    //   1395: l2i
    //   1396: ldc_w 407505328
    //   1399: ixor
    //   1400: goto -> 1411
    //   1403: ldc2_w 1941940790
    //   1406: l2i
    //   1407: ldc_w -1072511327
    //   1410: ixor
    //   1411: ldc2_w -2000120098
    //   1414: l2i
    //   1415: ldc_w 769582648
    //   1418: ixor
    //   1419: ixor
    //   1420: lookupswitch default -> 1448, 373308892 -> 25348, 599030046 -> 1403
    //   1448: aload #11
    //   1450: getstatic Perryc.c : I
    //   1453: iflt -> 1467
    //   1456: ldc2_w 1327654541
    //   1459: l2i
    //   1460: ldc_w 2112811753
    //   1463: ixor
    //   1464: goto -> 1475
    //   1467: ldc2_w 1066414429
    //   1470: l2i
    //   1471: ldc_w 712750536
    //   1474: ixor
    //   1475: ldc2_w -166180490
    //   1478: l2i
    //   1479: ldc_w -478300281
    //   1482: ixor
    //   1483: ixor
    //   1484: lookupswitch default -> 1512, 665414293 -> 25266, 1276872805 -> 1467
    //   1512: getfield field_70161_v : D
    //   1515: getstatic Perryc.c : I
    //   1518: iflt -> 1532
    //   1521: ldc2_w 800563193
    //   1524: l2i
    //   1525: ldc_w 1506848284
    //   1528: ixor
    //   1529: goto -> 1540
    //   1532: ldc2_w 1314706282
    //   1535: l2i
    //   1536: ldc_w -280660238
    //   1539: ixor
    //   1540: ldc2_w 795486059
    //   1543: l2i
    //   1544: ldc_w -1699954494
    //   1547: ixor
    //   1548: ixor
    //   1549: lookupswitch default -> 25506, -1012804020 -> 1532, 350175793 -> 1576
    //   1576: dstore #16
    //   1578: getstatic Perryc.1 : I
    //   1581: ifeq -> 1595
    //   1584: ldc2_w 1289827996
    //   1587: l2i
    //   1588: ldc_w 1689427029
    //   1591: ixor
    //   1592: goto -> 1603
    //   1595: ldc2_w 1709304053
    //   1598: l2i
    //   1599: ldc_w 611664877
    //   1602: ixor
    //   1603: ldc2_w 745102665
    //   1606: l2i
    //   1607: ldc_w -875629848
    //   1610: ixor
    //   1611: ixor
    //   1612: lookupswitch default -> 25416, -1506605895 -> 1640, -806091416 -> 1595
    //   1640: aload #11
    //   1642: getstatic Perryc.0 : I
    //   1645: ifle -> 1659
    //   1648: ldc2_w 1482353684
    //   1651: l2i
    //   1652: ldc_w 1077019518
    //   1655: ixor
    //   1656: goto -> 1667
    //   1659: ldc2_w -708173038
    //   1662: l2i
    //   1663: ldc_w 476158301
    //   1666: ixor
    //   1667: ldc2_w 508750302
    //   1670: l2i
    //   1671: ldc_w -499722464
    //   1674: ixor
    //   1675: ixor
    //   1676: lookupswitch default -> 25358, -468921964 -> 1659, 902792369 -> 1704
    //   1704: aload_0
    //   1705: getstatic Perryc.c : I
    //   1708: iflt -> 1722
    //   1711: ldc2_w -1963487211
    //   1714: l2i
    //   1715: ldc_w -1005974648
    //   1718: ixor
    //   1719: goto -> 1730
    //   1722: ldc2_w -961601307
    //   1725: l2i
    //   1726: ldc_w 22526356
    //   1729: ixor
    //   1730: ldc2_w -1116486867
    //   1733: l2i
    //   1734: ldc_w -1324034596
    //   1737: ixor
    //   1738: ixor
    //   1739: lookupswitch default -> 25654, -878735488 -> 1764, 1117425004 -> 1722
    //   1764: aload #11
    //   1766: getstatic Perryc.0 : I
    //   1769: ifle -> 1783
    //   1772: ldc2_w -833300113
    //   1775: l2i
    //   1776: ldc_w -1346977714
    //   1779: ixor
    //   1780: goto -> 1791
    //   1783: ldc2_w -2010305228
    //   1786: l2i
    //   1787: ldc_w 1503626503
    //   1790: ixor
    //   1791: ldc2_w -275016920
    //   1794: l2i
    //   1795: ldc_w -1729332943
    //   1798: ixor
    //   1799: ixor
    //   1800: lookupswitch default -> 25866, -1497021910 -> 1828, 378925880 -> 1783
    //   1828: getfield field_70169_q : D
    //   1831: getstatic Perryc.0 : I
    //   1834: ifle -> 1848
    //   1837: ldc2_w -1165551471
    //   1840: l2i
    //   1841: ldc_w 826241839
    //   1844: ixor
    //   1845: goto -> 1856
    //   1848: ldc2_w -559098554
    //   1851: l2i
    //   1852: ldc_w 95835829
    //   1855: ixor
    //   1856: ldc2_w -1337293479
    //   1859: l2i
    //   1860: ldc_w 964870738
    //   1863: ixor
    //   1864: ixor
    //   1865: lookupswitch default -> 25752, 40905909 -> 1848, 1389544696 -> 1892
    //   1892: aload #11
    //   1894: getstatic Perryc.1 : I
    //   1897: ifeq -> 1911
    //   1900: ldc2_w 749618547
    //   1903: l2i
    //   1904: ldc_w 1542763366
    //   1907: ixor
    //   1908: goto -> 1919
    //   1911: ldc2_w -696253
    //   1914: l2i
    //   1915: ldc_w -617615111
    //   1918: ixor
    //   1919: ldc2_w -1355592093
    //   1922: l2i
    //   1923: ldc_w -35274441
    //   1926: ixor
    //   1927: ixor
    //   1928: lookupswitch default -> 25404, 629963073 -> 1911, 1980506094 -> 1956
    //   1956: getfield field_70165_t : D
    //   1959: getstatic Perryc.c : I
    //   1962: iflt -> 1976
    //   1965: ldc2_w 2104805364
    //   1968: l2i
    //   1969: ldc_w 1866283592
    //   1972: ixor
    //   1973: goto -> 1984
    //   1976: ldc2_w 1509024691
    //   1979: l2i
    //   1980: ldc_w 447641797
    //   1983: ixor
    //   1984: ldc2_w 1531475987
    //   1987: l2i
    //   1988: ldc_w -1511449879
    //   1991: ixor
    //   1992: ixor
    //   1993: lookupswitch default -> 25336, -1107363444 -> 2020, -320299194 -> 1976
    //   2020: fload #8
    //   2022: getstatic Perryc.0 : I
    //   2025: ifle -> 2039
    //   2028: ldc2_w 411879718
    //   2031: l2i
    //   2032: ldc_w -1493114297
    //   2035: ixor
    //   2036: goto -> 2047
    //   2039: ldc2_w 986729064
    //   2042: l2i
    //   2043: ldc_w -1842543478
    //   2046: ixor
    //   2047: ldc2_w -1662451196
    //   2050: l2i
    //   2051: ldc_w 1851131155
    //   2054: ixor
    //   2055: ixor
    //   2056: lookupswitch default -> 25318, 1295199350 -> 2039, 1514293749 -> 2084
    //   2084: goto -> 2088
    //   2087: athrow
    //   2088: invokespecial interpolate : (DDF)D
    //   2091: goto -> 2095
    //   2094: athrow
    //   2095: getstatic Perryc.1 : I
    //   2098: ifeq -> 2112
    //   2101: ldc2_w 819291459
    //   2104: l2i
    //   2105: ldc_w -2044385575
    //   2108: ixor
    //   2109: goto -> 2120
    //   2112: ldc2_w -485335600
    //   2115: l2i
    //   2116: ldc_w 1841460846
    //   2119: ixor
    //   2120: ldc2_w -1585448267
    //   2123: l2i
    //   2124: ldc_w 1731902135
    //   2127: ixor
    //   2128: ixor
    //   2129: lookupswitch default -> 2156, -131721079 -> 2112, 1890911128 -> 25388
    //   2156: putfield field_70165_t : D
    //   2159: getstatic Perryc.1 : I
    //   2162: ifeq -> 2176
    //   2165: ldc2_w -840266536
    //   2168: l2i
    //   2169: ldc_w 983476598
    //   2172: ixor
    //   2173: goto -> 2184
    //   2176: ldc2_w -1655601218
    //   2179: l2i
    //   2180: ldc_w 1598396578
    //   2183: ixor
    //   2184: ldc2_w 545972289
    //   2187: l2i
    //   2188: ldc_w -1600089200
    //   2191: ixor
    //   2192: ixor
    //   2193: lookupswitch default -> 25302, 1111387341 -> 2220, 2002671231 -> 2176
    //   2220: aload #11
    //   2222: getstatic Perryc.c : I
    //   2225: iflt -> 2239
    //   2228: ldc2_w -2109587456
    //   2231: l2i
    //   2232: ldc_w 584679038
    //   2235: ixor
    //   2236: goto -> 2247
    //   2239: ldc2_w 880869563
    //   2242: l2i
    //   2243: ldc_w 1744763149
    //   2246: ixor
    //   2247: ldc2_w -1408460602
    //   2250: l2i
    //   2251: ldc_w -2028204869
    //   2254: ixor
    //   2255: ixor
    //   2256: lookupswitch default -> 2284, -1953781245 -> 25552, -772830804 -> 2239
    //   2284: aload_0
    //   2285: getstatic Perryc.c : I
    //   2288: iflt -> 2302
    //   2291: ldc2_w 1937778905
    //   2294: l2i
    //   2295: ldc_w 960054450
    //   2298: ixor
    //   2299: goto -> 2310
    //   2302: ldc2_w -1089077864
    //   2305: l2i
    //   2306: ldc_w 951274653
    //   2309: ixor
    //   2310: ldc2_w 332654526
    //   2313: l2i
    //   2314: ldc_w 600119985
    //   2317: ixor
    //   2318: ixor
    //   2319: lookupswitch default -> 2344, 1279010124 -> 2302, 2058326372 -> 25268
    //   2344: aload #11
    //   2346: getstatic Perryc.0 : I
    //   2349: ifle -> 2363
    //   2352: ldc2_w -2048415328
    //   2355: l2i
    //   2356: ldc_w -1692458733
    //   2359: ixor
    //   2360: goto -> 2371
    //   2363: ldc2_w 557160156
    //   2366: l2i
    //   2367: ldc_w 186446077
    //   2370: ixor
    //   2371: ldc2_w -2065149404
    //   2374: l2i
    //   2375: ldc_w -2096357215
    //   2378: ixor
    //   2379: ixor
    //   2380: lookupswitch default -> 25418, 421329462 -> 2363, 768414884 -> 2408
    //   2408: getfield field_70167_r : D
    //   2411: getstatic Perryc.1 : I
    //   2414: ifeq -> 2428
    //   2417: ldc2_w 1205836515
    //   2420: l2i
    //   2421: ldc_w 902732445
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w -557350792
    //   2431: l2i
    //   2432: ldc_w 895142762
    //   2435: ixor
    //   2436: ldc2_w -379234481
    //   2439: l2i
    //   2440: ldc_w -246597397
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 25580, -206232394 -> 2472, 1782149082 -> 2428
    //   2472: aload #11
    //   2474: getstatic Perryc.0 : I
    //   2477: ifle -> 2491
    //   2480: ldc2_w -1500352513
    //   2483: l2i
    //   2484: ldc_w -1657350453
    //   2487: ixor
    //   2488: goto -> 2499
    //   2491: ldc2_w 1941117770
    //   2494: l2i
    //   2495: ldc_w -1963102143
    //   2498: ixor
    //   2499: ldc2_w -672762697
    //   2502: l2i
    //   2503: ldc_w -1422232831
    //   2506: ixor
    //   2507: ixor
    //   2508: lookupswitch default -> 25322, -2054001475 -> 2536, 1199095426 -> 2491
    //   2536: getfield field_70163_u : D
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w -969623933
    //   2548: l2i
    //   2549: ldc_w -1085429896
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w -389785045
    //   2559: l2i
    //   2560: ldc_w -868526976
    //   2563: ixor
    //   2564: ldc2_w 1358882917
    //   2567: l2i
    //   2568: ldc_w -2129684357
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 25320, -1467457051 -> 2556, -183599435 -> 2600
    //   2600: fload #8
    //   2602: getstatic Perryc.1 : I
    //   2605: ifeq -> 2619
    //   2608: ldc2_w 323254941
    //   2611: l2i
    //   2612: ldc_w 1491475234
    //   2615: ixor
    //   2616: goto -> 2627
    //   2619: ldc2_w -1374660183
    //   2622: l2i
    //   2623: ldc_w -549680636
    //   2626: ixor
    //   2627: ldc2_w 893743986
    //   2630: l2i
    //   2631: ldc_w 1990983247
    //   2634: ixor
    //   2635: ixor
    //   2636: lookupswitch default -> 2664, -307852456 -> 2619, 139259010 -> 25612
    //   2664: goto -> 2668
    //   2667: athrow
    //   2668: invokespecial interpolate : (DDF)D
    //   2671: goto -> 2675
    //   2674: athrow
    //   2675: getstatic Perryc.0 : I
    //   2678: ifle -> 2692
    //   2681: ldc2_w -841945582
    //   2684: l2i
    //   2685: ldc_w 291781014
    //   2688: ixor
    //   2689: goto -> 2700
    //   2692: ldc2_w -1076428455
    //   2695: l2i
    //   2696: ldc_w -248713543
    //   2699: ixor
    //   2700: ldc2_w 2082822171
    //   2703: l2i
    //   2704: ldc_w 1185973080
    //   2707: ixor
    //   2708: ixor
    //   2709: lookupswitch default -> 2736, -434041657 -> 25884, 204128440 -> 2692
    //   2736: putfield field_70163_u : D
    //   2739: getstatic Perryc.1 : I
    //   2742: ifeq -> 2756
    //   2745: ldc2_w 1963058289
    //   2748: l2i
    //   2749: ldc_w 766440495
    //   2752: ixor
    //   2753: goto -> 2764
    //   2756: ldc2_w -1717232558
    //   2759: l2i
    //   2760: ldc_w 352016066
    //   2763: ixor
    //   2764: ldc2_w -605028472
    //   2767: l2i
    //   2768: ldc_w 1812452894
    //   2771: ixor
    //   2772: ixor
    //   2773: lookupswitch default -> 25256, -280544824 -> 2756, 985031430 -> 2800
    //   2800: aload #11
    //   2802: getstatic Perryc.c : I
    //   2805: iflt -> 2819
    //   2808: ldc2_w 774074805
    //   2811: l2i
    //   2812: ldc_w -537859305
    //   2815: ixor
    //   2816: goto -> 2827
    //   2819: ldc2_w 1524500703
    //   2822: l2i
    //   2823: ldc_w -1764270607
    //   2826: ixor
    //   2827: ldc2_w -406582808
    //   2830: l2i
    //   2831: ldc_w 185005404
    //   2834: ixor
    //   2835: ixor
    //   2836: lookupswitch default -> 2864, -417235689 -> 2819, 487679510 -> 25914
    //   2864: aload_0
    //   2865: getstatic Perryc.0 : I
    //   2868: ifle -> 2882
    //   2871: ldc2_w 702333151
    //   2874: l2i
    //   2875: ldc_w -733776237
    //   2878: ixor
    //   2879: goto -> 2890
    //   2882: ldc2_w -1185345775
    //   2885: l2i
    //   2886: ldc_w 2007356265
    //   2889: ixor
    //   2890: ldc2_w -1100031335
    //   2893: l2i
    //   2894: ldc_w 531064490
    //   2897: ixor
    //   2898: ixor
    //   2899: lookupswitch default -> 25868, 1549142655 -> 2882, 1865769035 -> 2924
    //   2924: aload #11
    //   2926: getstatic Perryc.0 : I
    //   2929: ifle -> 2943
    //   2932: ldc2_w 1349670690
    //   2935: l2i
    //   2936: ldc_w 280264741
    //   2939: ixor
    //   2940: goto -> 2951
    //   2943: ldc2_w 1067201814
    //   2946: l2i
    //   2947: ldc_w 1461474662
    //   2950: ixor
    //   2951: ldc2_w 74176631
    //   2954: l2i
    //   2955: ldc_w -15510562
    //   2958: ixor
    //   2959: ixor
    //   2960: lookupswitch default -> 2988, -1145152338 -> 25788, -470046546 -> 2943
    //   2988: getfield field_70166_s : D
    //   2991: getstatic Perryc.c : I
    //   2994: iflt -> 3008
    //   2997: ldc2_w 1281691718
    //   3000: l2i
    //   3001: ldc_w 1392736664
    //   3004: ixor
    //   3005: goto -> 3016
    //   3008: ldc2_w 1088319381
    //   3011: l2i
    //   3012: ldc_w -1646238612
    //   3015: ixor
    //   3016: ldc2_w 1187212757
    //   3019: l2i
    //   3020: ldc_w 1804075717
    //   3023: ixor
    //   3024: ixor
    //   3025: lookupswitch default -> 25458, -260741911 -> 3052, 841811662 -> 3008
    //   3052: aload #11
    //   3054: getstatic Perryc.0 : I
    //   3057: ifle -> 3071
    //   3060: ldc2_w -997009899
    //   3063: l2i
    //   3064: ldc_w 2099711341
    //   3067: ixor
    //   3068: goto -> 3079
    //   3071: ldc2_w 1873091271
    //   3074: l2i
    //   3075: ldc_w 1147772491
    //   3078: ixor
    //   3079: ldc2_w -376872870
    //   3082: l2i
    //   3083: ldc_w -95235373
    //   3086: ixor
    //   3087: ixor
    //   3088: lookupswitch default -> 25412, -1435604495 -> 3071, 941045253 -> 3116
    //   3116: getfield field_70161_v : D
    //   3119: getstatic Perryc.1 : I
    //   3122: ifeq -> 3136
    //   3125: ldc2_w -1682482293
    //   3128: l2i
    //   3129: ldc_w 300110387
    //   3132: ixor
    //   3133: goto -> 3144
    //   3136: ldc2_w -96212812
    //   3139: l2i
    //   3140: ldc_w 1510407394
    //   3143: ixor
    //   3144: ldc2_w 2133364545
    //   3147: l2i
    //   3148: ldc_w -913677217
    //   3151: ixor
    //   3152: ixor
    //   3153: lookupswitch default -> 25604, 384302920 -> 3180, 1022812838 -> 3136
    //   3180: fload #8
    //   3182: getstatic Perryc.1 : I
    //   3185: ifeq -> 3199
    //   3188: ldc2_w -1999204233
    //   3191: l2i
    //   3192: ldc_w -1751087822
    //   3195: ixor
    //   3196: goto -> 3207
    //   3199: ldc2_w 753894028
    //   3202: l2i
    //   3203: ldc_w 413519651
    //   3206: ixor
    //   3207: ldc2_w -367347357
    //   3210: l2i
    //   3211: ldc_w 2007703838
    //   3214: ixor
    //   3215: ixor
    //   3216: lookupswitch default -> 25606, -2100851400 -> 3199, -1443113518 -> 3244
    //   3244: goto -> 3248
    //   3247: athrow
    //   3248: invokespecial interpolate : (DDF)D
    //   3251: goto -> 3255
    //   3254: athrow
    //   3255: getstatic Perryc.0 : I
    //   3258: ifle -> 3272
    //   3261: ldc2_w 1476412604
    //   3264: l2i
    //   3265: ldc_w -1915924920
    //   3268: ixor
    //   3269: goto -> 3280
    //   3272: ldc2_w 1262504074
    //   3275: l2i
    //   3276: ldc_w 1874675916
    //   3279: ixor
    //   3280: ldc2_w 1554289112
    //   3283: l2i
    //   3284: ldc_w -1053280689
    //   3287: ixor
    //   3288: ixor
    //   3289: lookupswitch default -> 3316, 1213312355 -> 25496, 2005560164 -> 3272
    //   3316: putfield field_70161_v : D
    //   3319: getstatic Perryc.c : I
    //   3322: iflt -> 3336
    //   3325: ldc2_w 649606996
    //   3328: l2i
    //   3329: ldc_w -96486871
    //   3332: ixor
    //   3333: goto -> 3344
    //   3336: ldc2_w -354332694
    //   3339: l2i
    //   3340: ldc_w 935798015
    //   3343: ixor
    //   3344: ldc2_w -168674983
    //   3347: l2i
    //   3348: ldc_w 2134647203
    //   3351: ixor
    //   3352: ixor
    //   3353: lookupswitch default -> 3380, -505939762 -> 3336, 1447662983 -> 25780
    //   3380: aload_0
    //   3381: getstatic Perryc.1 : I
    //   3384: ifeq -> 3398
    //   3387: ldc2_w 88184706
    //   3390: l2i
    //   3391: ldc_w 613053765
    //   3394: ixor
    //   3395: goto -> 3406
    //   3398: ldc2_w -1086412416
    //   3401: l2i
    //   3402: ldc_w -618597087
    //   3405: ixor
    //   3406: ldc2_w 887985617
    //   3409: l2i
    //   3410: ldc_w -882489468
    //   3413: ixor
    //   3414: ixor
    //   3415: lookupswitch default -> 3440, -566218606 -> 25330, 1908994340 -> 3398
    //   3440: aload_1
    //   3441: getstatic Perryc.1 : I
    //   3444: ifeq -> 3458
    //   3447: ldc2_w -710049089
    //   3450: l2i
    //   3451: ldc_w -554065653
    //   3454: ixor
    //   3455: goto -> 3466
    //   3458: ldc2_w -2096680707
    //   3461: l2i
    //   3462: ldc_w 2020806120
    //   3465: ixor
    //   3466: ldc2_w -499741036
    //   3469: l2i
    //   3470: ldc_w 1286438672
    //   3473: ixor
    //   3474: ixor
    //   3475: lookupswitch default -> 3500, -1513106896 -> 25390, 1078970920 -> 3458
    //   3500: goto -> 3504
    //   3503: athrow
    //   3504: invokespecial getDisplayTag : (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/lang/String;
    //   3507: goto -> 3511
    //   3510: athrow
    //   3511: getstatic Perryc.c : I
    //   3514: iflt -> 3528
    //   3517: ldc2_w 1572378700
    //   3520: l2i
    //   3521: ldc_w -1608538460
    //   3524: ixor
    //   3525: goto -> 3536
    //   3528: ldc2_w -867069427
    //   3531: l2i
    //   3532: ldc_w 440247493
    //   3535: ixor
    //   3536: ldc2_w 1970851350
    //   3539: l2i
    //   3540: ldc_w -1187752524
    //   3543: ixor
    //   3544: ixor
    //   3545: lookupswitch default -> 3572, -906584464 -> 3528, 837526858 -> 25728
    //   3572: astore #18
    //   3574: getstatic Perryc.1 : I
    //   3577: ifeq -> 3591
    //   3580: ldc2_w -1493584915
    //   3583: l2i
    //   3584: ldc_w 863785664
    //   3587: ixor
    //   3588: goto -> 3599
    //   3591: ldc2_w 2108953711
    //   3594: l2i
    //   3595: ldc_w 851193162
    //   3598: ixor
    //   3599: ldc2_w -965570579
    //   3602: l2i
    //   3603: ldc_w -81992438
    //   3606: ixor
    //   3607: ixor
    //   3608: lookupswitch default -> 3636, -1460958262 -> 25748, 686368036 -> 3591
    //   3636: aload #11
    //   3638: getstatic Perryc.1 : I
    //   3641: ifeq -> 3655
    //   3644: ldc2_w -1257836537
    //   3647: l2i
    //   3648: ldc_w 2074987247
    //   3651: ixor
    //   3652: goto -> 3663
    //   3655: ldc2_w -1914795201
    //   3658: l2i
    //   3659: ldc_w 1759886440
    //   3662: ixor
    //   3663: ldc2_w -13729708
    //   3666: l2i
    //   3667: ldc_w -1957394821
    //   3670: ixor
    //   3671: ixor
    //   3672: lookupswitch default -> 3700, -1160692537 -> 25800, -691248523 -> 3655
    //   3700: dload_2
    //   3701: getstatic Perryc.c : I
    //   3704: iflt -> 3718
    //   3707: ldc2_w 1388215168
    //   3710: l2i
    //   3711: ldc_w 295560010
    //   3714: ixor
    //   3715: goto -> 3726
    //   3718: ldc2_w 14765818
    //   3721: l2i
    //   3722: ldc_w -188745638
    //   3725: ixor
    //   3726: ldc2_w -104956237
    //   3729: l2i
    //   3730: ldc_w 970374069
    //   3733: ixor
    //   3734: ixor
    //   3735: lookupswitch default -> 25424, -2092212788 -> 3718, 875983782 -> 3760
    //   3760: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   3763: getstatic Perryc.c : I
    //   3766: iflt -> 3780
    //   3769: ldc2_w -1281624135
    //   3772: l2i
    //   3773: ldc_w -172484641
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 1529522857
    //   3783: l2i
    //   3784: ldc_w -585465504
    //   3787: ixor
    //   3788: ldc2_w 1007175838
    //   3791: l2i
    //   3792: ldc_w -585097232
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 3824, -1492404472 -> 25396, -37622119 -> 3780
    //   3824: goto -> 3828
    //   3827: athrow
    //   3828: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   3831: goto -> 3835
    //   3834: athrow
    //   3835: getstatic Perryc.1 : I
    //   3838: ifeq -> 3852
    //   3841: ldc2_w 1473650886
    //   3844: l2i
    //   3845: ldc_w 1509512195
    //   3848: ixor
    //   3849: goto -> 3860
    //   3852: ldc2_w 1864871907
    //   3855: l2i
    //   3856: ldc_w 1373415404
    //   3859: ixor
    //   3860: ldc2_w 1498261721
    //   3863: l2i
    //   3864: ldc_w -1203786916
    //   3867: ixor
    //   3868: ixor
    //   3869: lookupswitch default -> 3896, -2088028237 -> 3852, -279087296 -> 25452
    //   3896: getfield field_78730_l : D
    //   3899: dadd
    //   3900: getstatic Perryc.c : I
    //   3903: iflt -> 3917
    //   3906: ldc2_w 2110697539
    //   3909: l2i
    //   3910: ldc_w -891649127
    //   3913: ixor
    //   3914: goto -> 3925
    //   3917: ldc2_w 1796501616
    //   3920: l2i
    //   3921: ldc_w -1544013990
    //   3924: ixor
    //   3925: ldc2_w -284245441
    //   3928: l2i
    //   3929: ldc_w 465533547
    //   3932: ixor
    //   3933: ixor
    //   3934: lookupswitch default -> 25684, 1012793214 -> 3960, 1134922638 -> 3917
    //   3960: dload #4
    //   3962: getstatic Perryc.c : I
    //   3965: iflt -> 3979
    //   3968: ldc2_w 2129545045
    //   3971: l2i
    //   3972: ldc_w 1202730445
    //   3975: ixor
    //   3976: goto -> 3987
    //   3979: ldc2_w 1666339559
    //   3982: l2i
    //   3983: ldc_w 1171965087
    //   3986: ixor
    //   3987: ldc2_w 407847157
    //   3990: l2i
    //   3991: ldc_w -1909296656
    //   3994: ixor
    //   3995: ixor
    //   3996: lookupswitch default -> 4024, -2047662511 -> 3979, -1356643427 -> 25806
    //   4024: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   4027: getstatic Perryc.c : I
    //   4030: iflt -> 4044
    //   4033: ldc2_w -1780132132
    //   4036: l2i
    //   4037: ldc_w 1017583299
    //   4040: ixor
    //   4041: goto -> 4052
    //   4044: ldc2_w 233520034
    //   4047: l2i
    //   4048: ldc_w 80100002
    //   4051: ixor
    //   4052: ldc2_w 355664008
    //   4055: l2i
    //   4056: ldc_w 313759357
    //   4059: ixor
    //   4060: ixor
    //   4061: lookupswitch default -> 4088, -1952728085 -> 4044, -1362962710 -> 25324
    //   4088: goto -> 4092
    //   4091: athrow
    //   4092: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   4095: goto -> 4099
    //   4098: athrow
    //   4099: getstatic Perryc.c : I
    //   4102: iflt -> 4116
    //   4105: ldc2_w -578146889
    //   4108: l2i
    //   4109: ldc_w -1544326747
    //   4112: ixor
    //   4113: goto -> 4124
    //   4116: ldc2_w -886266287
    //   4119: l2i
    //   4120: ldc_w -697105145
    //   4123: ixor
    //   4124: ldc2_w 1524397067
    //   4127: l2i
    //   4128: ldc_w -1787527661
    //   4131: ixor
    //   4132: ixor
    //   4133: lookupswitch default -> 4160, -1311681014 -> 25638, 2139567253 -> 4116
    //   4160: getfield field_78731_m : D
    //   4163: dadd
    //   4164: getstatic Perryc.1 : I
    //   4167: ifeq -> 4181
    //   4170: ldc2_w 639928702
    //   4173: l2i
    //   4174: ldc_w 1539356783
    //   4177: ixor
    //   4178: goto -> 4189
    //   4181: ldc2_w -1774604729
    //   4184: l2i
    //   4185: ldc_w -1876524340
    //   4188: ixor
    //   4189: ldc2_w 866527235
    //   4192: l2i
    //   4193: ldc_w 748308929
    //   4196: ixor
    //   4197: ixor
    //   4198: lookupswitch default -> 25918, 421743945 -> 4224, 1658343635 -> 4181
    //   4224: dload #6
    //   4226: getstatic Perryc.1 : I
    //   4229: ifeq -> 4243
    //   4232: ldc2_w -508226570
    //   4235: l2i
    //   4236: ldc_w 1616030904
    //   4239: ixor
    //   4240: goto -> 4251
    //   4243: ldc2_w 675417900
    //   4246: l2i
    //   4247: ldc_w 1847908635
    //   4250: ixor
    //   4251: ldc2_w 1068701278
    //   4254: l2i
    //   4255: ldc_w -1122720564
    //   4258: ixor
    //   4259: ixor
    //   4260: lookupswitch default -> 4288, -299719586 -> 4243, 54529500 -> 25554
    //   4288: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   4291: getstatic Perryc.0 : I
    //   4294: ifle -> 4308
    //   4297: ldc2_w -199998020
    //   4300: l2i
    //   4301: ldc_w -394545860
    //   4304: ixor
    //   4305: goto -> 4316
    //   4308: ldc2_w 1658538285
    //   4311: l2i
    //   4312: ldc_w -875129898
    //   4315: ixor
    //   4316: ldc2_w 1477892149
    //   4319: l2i
    //   4320: ldc_w 894314158
    //   4323: ixor
    //   4324: ixor
    //   4325: lookupswitch default -> 4352, 1285883994 -> 4308, 1899433499 -> 25608
    //   4352: goto -> 4356
    //   4355: athrow
    //   4356: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   4359: goto -> 4363
    //   4362: athrow
    //   4363: getstatic Perryc.c : I
    //   4366: iflt -> 4380
    //   4369: ldc2_w -292176416
    //   4372: l2i
    //   4373: ldc_w 1203934037
    //   4376: ixor
    //   4377: goto -> 4388
    //   4380: ldc2_w 427291763
    //   4383: l2i
    //   4384: ldc_w -857100122
    //   4387: ixor
    //   4388: ldc2_w 793624059
    //   4391: l2i
    //   4392: ldc_w 335429007
    //   4395: ixor
    //   4396: ixor
    //   4397: lookupswitch default -> 25332, -1780175167 -> 4380, -382876511 -> 4424
    //   4424: getfield field_78728_n : D
    //   4427: dadd
    //   4428: getstatic Perryc.0 : I
    //   4431: ifle -> 4445
    //   4434: ldc2_w 342029957
    //   4437: l2i
    //   4438: ldc_w -1831865564
    //   4441: ixor
    //   4442: goto -> 4453
    //   4445: ldc2_w -549251092
    //   4448: l2i
    //   4449: ldc_w -2049805108
    //   4452: ixor
    //   4453: ldc2_w -1013581030
    //   4456: l2i
    //   4457: ldc_w -704810970
    //   4460: ixor
    //   4461: ixor
    //   4462: lookupswitch default -> 4488, -1866101091 -> 25372, -307210027 -> 4445
    //   4488: goto -> 4492
    //   4491: athrow
    //   4492: invokevirtual func_70011_f : (DDD)D
    //   4495: goto -> 4499
    //   4498: athrow
    //   4499: getstatic Perryc.c : I
    //   4502: iflt -> 4516
    //   4505: ldc2_w 143838746
    //   4508: l2i
    //   4509: ldc_w -1404666937
    //   4512: ixor
    //   4513: goto -> 4524
    //   4516: ldc2_w -874563145
    //   4519: l2i
    //   4520: ldc_w -1603447437
    //   4523: ixor
    //   4524: ldc2_w -1926334066
    //   4527: l2i
    //   4528: ldc_w 1483459892
    //   4531: ixor
    //   4532: ixor
    //   4533: lookupswitch default -> 25760, -1091053442 -> 4560, 1905328487 -> 4516
    //   4560: dstore #19
    //   4562: getstatic Perryc.1 : I
    //   4565: ifeq -> 4579
    //   4568: ldc2_w -859870180
    //   4571: l2i
    //   4572: ldc_w -2145880015
    //   4575: ixor
    //   4576: goto -> 4587
    //   4579: ldc2_w 233707240
    //   4582: l2i
    //   4583: ldc_w 1711752333
    //   4586: ixor
    //   4587: ldc2_w 1917913441
    //   4590: l2i
    //   4591: ldc_w 265639160
    //   4594: ixor
    //   4595: ixor
    //   4596: lookupswitch default -> 25356, 376246268 -> 4624, 824396212 -> 4579
    //   4624: aload_0
    //   4625: getstatic Perryc.c : I
    //   4628: iflt -> 4642
    //   4631: ldc2_w -1916061596
    //   4634: l2i
    //   4635: ldc_w -679555182
    //   4638: ixor
    //   4639: goto -> 4650
    //   4642: ldc2_w 1112747197
    //   4645: l2i
    //   4646: ldc_w 1008267554
    //   4649: ixor
    //   4650: ldc2_w -705408053
    //   4653: l2i
    //   4654: ldc_w 1299691870
    //   4657: ixor
    //   4658: ixor
    //   4659: lookupswitch default -> 25842, -1036640925 -> 4642, -423086326 -> 4684
    //   4684: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   4687: getstatic Perryc.c : I
    //   4690: iflt -> 4704
    //   4693: ldc2_w 1923819810
    //   4696: l2i
    //   4697: ldc_w -1794384294
    //   4700: ixor
    //   4701: goto -> 4712
    //   4704: ldc2_w 609619626
    //   4707: l2i
    //   4708: ldc_w -453844649
    //   4711: ixor
    //   4712: ldc2_w -799670541
    //   4715: l2i
    //   4716: ldc_w 1085008451
    //   4719: ixor
    //   4720: ixor
    //   4721: lookupswitch default -> 25430, 1348139853 -> 4748, 2002707400 -> 4704
    //   4748: aload #18
    //   4750: getstatic Perryc.c : I
    //   4753: iflt -> 4767
    //   4756: ldc2_w 162540313
    //   4759: l2i
    //   4760: ldc_w 1540286064
    //   4763: ixor
    //   4764: goto -> 4775
    //   4767: ldc2_w 208981979
    //   4770: l2i
    //   4771: ldc_w -1400617879
    //   4774: ixor
    //   4775: ldc2_w 2143735859
    //   4778: l2i
    //   4779: ldc_w 1715173148
    //   4782: ixor
    //   4783: ixor
    //   4784: lookupswitch default -> 25778, -1190318947 -> 4812, 1266903622 -> 4767
    //   4812: goto -> 4816
    //   4815: athrow
    //   4816: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   4819: goto -> 4823
    //   4822: athrow
    //   4823: ldc2_w 933587476
    //   4826: l2i
    //   4827: ldc_w 933587478
    //   4830: ixor
    //   4831: idiv
    //   4832: getstatic Perryc.c : I
    //   4835: iflt -> 4849
    //   4838: ldc2_w -1639305324
    //   4841: l2i
    //   4842: ldc_w -1315243942
    //   4845: ixor
    //   4846: goto -> 4857
    //   4849: ldc2_w -1690103434
    //   4852: l2i
    //   4853: ldc_w 1880753994
    //   4856: ixor
    //   4857: ldc2_w 418653215
    //   4860: l2i
    //   4861: ldc_w -1541420591
    //   4864: ixor
    //   4865: ixor
    //   4866: lookupswitch default -> 4892, -1824835072 -> 25556, 311607630 -> 4849
    //   4892: istore #21
    //   4894: ldc2_w 6735.182253298954
    //   4897: invokestatic doubleToLongBits : (D)J
    //   4900: ldc2_w 9216390764552600842
    //   4903: lxor
    //   4904: invokestatic longBitsToDouble : (J)D
    //   4907: getstatic Perryc.0 : I
    //   4910: ifle -> 4924
    //   4913: ldc2_w -1036334400
    //   4916: l2i
    //   4917: ldc_w -1638430887
    //   4920: ixor
    //   4921: goto -> 4932
    //   4924: ldc2_w -1462569714
    //   4927: l2i
    //   4928: ldc_w 1515903910
    //   4931: ixor
    //   4932: ldc2_w -6505619
    //   4935: l2i
    //   4936: ldc_w 217985758
    //   4939: ixor
    //   4940: ixor
    //   4941: lookupswitch default -> 25790, -1357921238 -> 4924, 32155419 -> 4968
    //   4968: aload_0
    //   4969: getstatic Perryc.c : I
    //   4972: iflt -> 4986
    //   4975: ldc2_w 1485005428
    //   4978: l2i
    //   4979: ldc_w -2002702070
    //   4982: ixor
    //   4983: goto -> 4994
    //   4986: ldc2_w 1699394794
    //   4989: l2i
    //   4990: ldc_w 243387835
    //   4993: ixor
    //   4994: ldc2_w -776372101
    //   4997: l2i
    //   4998: ldc_w 1469731297
    //   5001: ixor
    //   5002: ixor
    //   5003: lookupswitch default -> 5028, -640737766 -> 4986, 1442939620 -> 25460
    //   5028: getfield size : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5031: getstatic Perryc.c : I
    //   5034: iflt -> 5048
    //   5037: ldc2_w 1606987155
    //   5040: l2i
    //   5041: ldc_w 1730433377
    //   5044: ixor
    //   5045: goto -> 5056
    //   5048: ldc2_w -1482653777
    //   5051: l2i
    //   5052: ldc_w -1419622963
    //   5055: ixor
    //   5056: ldc2_w -543586841
    //   5059: l2i
    //   5060: ldc_w 257348723
    //   5063: ixor
    //   5064: ixor
    //   5065: lookupswitch default -> 5092, -400315034 -> 25304, 335692117 -> 5048
    //   5092: goto -> 5096
    //   5095: athrow
    //   5096: invokevirtual getValue : ()Ljava/lang/Object;
    //   5099: goto -> 5103
    //   5102: athrow
    //   5103: checkcast java/lang/Float
    //   5106: getstatic Perryc.c : I
    //   5109: iflt -> 5123
    //   5112: ldc2_w 2081657137
    //   5115: l2i
    //   5116: ldc_w -243593472
    //   5119: ixor
    //   5120: goto -> 5131
    //   5123: ldc2_w 650675057
    //   5126: l2i
    //   5127: ldc_w 1992043317
    //   5130: ixor
    //   5131: ldc2_w -1645781746
    //   5134: l2i
    //   5135: ldc_w -203177414
    //   5138: ixor
    //   5139: ixor
    //   5140: lookupswitch default -> 25886, -479461115 -> 5123, 1047541616 -> 5168
    //   5168: goto -> 5172
    //   5171: athrow
    //   5172: invokevirtual floatValue : ()F
    //   5175: goto -> 5179
    //   5178: athrow
    //   5179: f2d
    //   5180: getstatic Perryc.0 : I
    //   5183: ifle -> 5197
    //   5186: ldc2_w -336287690
    //   5189: l2i
    //   5190: ldc_w -2098765493
    //   5193: ixor
    //   5194: goto -> 5205
    //   5197: ldc2_w -845928820
    //   5200: l2i
    //   5201: ldc_w -195189106
    //   5204: ixor
    //   5205: ldc2_w -1412750671
    //   5208: l2i
    //   5209: ldc_w -2061234177
    //   5212: ixor
    //   5213: ixor
    //   5214: lookupswitch default -> 5240, 1207755827 -> 25894, 1275689658 -> 5197
    //   5240: dload #19
    //   5242: getstatic Perryc.c : I
    //   5245: iflt -> 5259
    //   5248: ldc2_w -1954788593
    //   5251: l2i
    //   5252: ldc_w -669949443
    //   5255: ixor
    //   5256: goto -> 5267
    //   5259: ldc2_w 11291751
    //   5262: l2i
    //   5263: ldc_w -935857784
    //   5266: ixor
    //   5267: ldc2_w 1023216815
    //   5270: l2i
    //   5271: ldc_w -1931453069
    //   5274: ixor
    //   5275: ixor
    //   5276: lookupswitch default -> 5304, -479167698 -> 25444, 774475515 -> 5259
    //   5304: aload_0
    //   5305: getstatic Perryc.1 : I
    //   5308: ifeq -> 5322
    //   5311: ldc2_w 405640327
    //   5314: l2i
    //   5315: ldc_w 1518983813
    //   5318: ixor
    //   5319: goto -> 5330
    //   5322: ldc2_w 1519475265
    //   5325: l2i
    //   5326: ldc_w 1457158586
    //   5329: ixor
    //   5330: ldc2_w -1143441729
    //   5333: l2i
    //   5334: ldc_w 1812818642
    //   5337: ixor
    //   5338: ixor
    //   5339: lookupswitch default -> 25248, -1787735441 -> 5322, -610386026 -> 5364
    //   5364: getfield factor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5367: getstatic Perryc.0 : I
    //   5370: ifle -> 5384
    //   5373: ldc2_w 624710457
    //   5376: l2i
    //   5377: ldc_w -1869223276
    //   5380: ixor
    //   5381: goto -> 5392
    //   5384: ldc2_w 2097307586
    //   5387: l2i
    //   5388: ldc_w 2021267977
    //   5391: ixor
    //   5392: ldc2_w -1223872099
    //   5395: l2i
    //   5396: ldc_w -1863544173
    //   5399: ixor
    //   5400: ixor
    //   5401: lookupswitch default -> 5428, -1840768349 -> 25270, 258512021 -> 5384
    //   5428: goto -> 5432
    //   5431: athrow
    //   5432: invokevirtual getValue : ()Ljava/lang/Object;
    //   5435: goto -> 5439
    //   5438: athrow
    //   5439: checkcast java/lang/Float
    //   5442: getstatic Perryc.c : I
    //   5445: iflt -> 5459
    //   5448: ldc2_w -238941434
    //   5451: l2i
    //   5452: ldc_w -1931493737
    //   5455: ixor
    //   5456: goto -> 5467
    //   5459: ldc2_w 1281731918
    //   5462: l2i
    //   5463: ldc_w 1937973908
    //   5466: ixor
    //   5467: ldc2_w 800570524
    //   5470: l2i
    //   5471: ldc_w 1685015656
    //   5474: ixor
    //   5475: ixor
    //   5476: lookupswitch default -> 25628, 918898021 -> 5459, 1950252846 -> 5504
    //   5504: goto -> 5508
    //   5507: athrow
    //   5508: invokevirtual floatValue : ()F
    //   5511: goto -> 5515
    //   5514: athrow
    //   5515: f2d
    //   5516: dmul
    //   5517: dmul
    //   5518: dadd
    //   5519: ldc2_w 5.163501600438176E-4
    //   5522: invokestatic doubleToLongBits : (D)J
    //   5525: ldc2_w 9209768284251779139
    //   5528: lxor
    //   5529: invokestatic longBitsToDouble : (J)D
    //   5532: ddiv
    //   5533: getstatic Perryc.0 : I
    //   5536: ifle -> 5550
    //   5539: ldc2_w -1704090874
    //   5542: l2i
    //   5543: ldc_w -1992849155
    //   5546: ixor
    //   5547: goto -> 5558
    //   5550: ldc2_w -1539660459
    //   5553: l2i
    //   5554: ldc_w 203455972
    //   5557: ixor
    //   5558: ldc2_w 379813141
    //   5561: l2i
    //   5562: ldc_w 1922128707
    //   5565: ixor
    //   5566: ixor
    //   5567: lookupswitch default -> 5592, 691492101 -> 5550, 2003307949 -> 25576
    //   5592: dstore #22
    //   5594: getstatic Perryc.c : I
    //   5597: iflt -> 5611
    //   5600: ldc2_w -1822031401
    //   5603: l2i
    //   5604: ldc_w 1940390971
    //   5607: ixor
    //   5608: goto -> 5619
    //   5611: ldc2_w 1417537491
    //   5614: l2i
    //   5615: ldc_w 1324573808
    //   5618: ixor
    //   5619: ldc2_w 4210630
    //   5622: l2i
    //   5623: ldc_w 534461392
    //   5626: ixor
    //   5627: ixor
    //   5628: lookupswitch default -> 25312, -11206150 -> 5611, 85297077 -> 5656
    //   5656: dload #19
    //   5658: ldc2_w 1.9069081854559393
    //   5661: invokestatic doubleToLongBits : (D)J
    //   5664: ldc2_w 9213945589338742941
    //   5667: lxor
    //   5668: invokestatic longBitsToDouble : (J)D
    //   5671: dcmpg
    //   5672: ifgt -> 5686
    //   5675: ldc2_w -717271765
    //   5678: l2i
    //   5679: ldc_w 1413357846
    //   5682: ixor
    //   5683: goto -> 5694
    //   5686: ldc2_w 1601539756
    //   5689: l2i
    //   5690: ldc_w -562765162
    //   5693: ixor
    //   5694: ldc2_w -2015307316
    //   5697: l2i
    //   5698: ldc_w 637127682
    //   5701: ixor
    //   5702: ixor
    //   5703: tableswitch default -> 5675, 588806643 -> 5724, 588806644 -> 6122
    //   5724: getstatic Perryc.1 : I
    //   5727: ifeq -> 5741
    //   5730: ldc2_w 1626331264
    //   5733: l2i
    //   5734: ldc_w -300086482
    //   5737: ixor
    //   5738: goto -> 5749
    //   5741: ldc2_w -1919520227
    //   5744: l2i
    //   5745: ldc_w 1288412864
    //   5748: ixor
    //   5749: ldc2_w -1391872616
    //   5752: l2i
    //   5753: ldc_w -1104297787
    //   5756: ixor
    //   5757: ixor
    //   5758: lookupswitch default -> 25454, -1646876941 -> 5741, -763782784 -> 5784
    //   5784: aload_0
    //   5785: getstatic Perryc.c : I
    //   5788: iflt -> 5802
    //   5791: ldc2_w 1106044671
    //   5794: l2i
    //   5795: ldc_w -1443174779
    //   5798: ixor
    //   5799: goto -> 5810
    //   5802: ldc2_w -1581333097
    //   5805: l2i
    //   5806: ldc_w -364746867
    //   5809: ixor
    //   5810: ldc2_w 1281471093
    //   5813: l2i
    //   5814: ldc_w -1341451092
    //   5817: ixor
    //   5818: ixor
    //   5819: lookupswitch default -> 5844, 343713443 -> 25446, 372083429 -> 5802
    //   5844: getfield smartScale : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5847: getstatic Perryc.c : I
    //   5850: iflt -> 5864
    //   5853: ldc2_w -870117624
    //   5856: l2i
    //   5857: ldc_w 670796764
    //   5860: ixor
    //   5861: goto -> 5872
    //   5864: ldc2_w -2034048383
    //   5867: l2i
    //   5868: ldc_w -1904532580
    //   5871: ixor
    //   5872: ldc2_w -1424076006
    //   5875: l2i
    //   5876: ldc_w 64960339
    //   5879: ixor
    //   5880: ixor
    //   5881: lookupswitch default -> 25310, -1602706092 -> 5908, 1125769373 -> 5864
    //   5908: goto -> 5912
    //   5911: athrow
    //   5912: invokevirtual getValue : ()Ljava/lang/Object;
    //   5915: goto -> 5919
    //   5918: athrow
    //   5919: checkcast java/lang/Boolean
    //   5922: getstatic Perryc.0 : I
    //   5925: ifle -> 5939
    //   5928: ldc2_w -31349052
    //   5931: l2i
    //   5932: ldc_w 825369374
    //   5935: ixor
    //   5936: goto -> 5947
    //   5939: ldc2_w 1676143844
    //   5942: l2i
    //   5943: ldc_w -432484468
    //   5946: ixor
    //   5947: ldc2_w 1706074735
    //   5950: l2i
    //   5951: ldc_w -1576131873
    //   5954: ixor
    //   5955: ixor
    //   5956: lookupswitch default -> 5984, -390486940 -> 5939, 145556842 -> 25284
    //   5984: goto -> 5988
    //   5987: athrow
    //   5988: invokevirtual booleanValue : ()Z
    //   5991: goto -> 5995
    //   5994: athrow
    //   5995: ifeq -> 6009
    //   5998: ldc2_w -1870573956
    //   6001: l2i
    //   6002: ldc_w 819745915
    //   6005: ixor
    //   6006: goto -> 6017
    //   6009: ldc2_w 729850736
    //   6012: l2i
    //   6013: ldc_w -1948403338
    //   6016: ixor
    //   6017: ldc2_w 232231959
    //   6020: l2i
    //   6021: ldc_w -490193356
    //   6024: ixor
    //   6025: ixor
    //   6026: tableswitch default -> 5998, 1329770532 -> 6048, 1329770533 -> 6122
    //   6048: ldc2_w 451.81637430790425
    //   6051: invokestatic doubleToLongBits : (D)J
    //   6054: ldc2_w 9215820079718176687
    //   6057: lxor
    //   6058: invokestatic longBitsToDouble : (J)D
    //   6061: getstatic Perryc.1 : I
    //   6064: ifeq -> 6078
    //   6067: ldc2_w 1117179857
    //   6070: l2i
    //   6071: ldc_w 1266331259
    //   6074: ixor
    //   6075: goto -> 6086
    //   6078: ldc2_w 147720928
    //   6081: l2i
    //   6082: ldc_w 781182547
    //   6085: ixor
    //   6086: ldc2_w -838928653
    //   6089: l2i
    //   6090: ldc_w -2019088685
    //   6093: ixor
    //   6094: ixor
    //   6095: lookupswitch default -> 25858, 1135980938 -> 6078, 1813527699 -> 6120
    //   6120: dstore #22
    //   6122: getstatic Perryc.1 : I
    //   6125: ifeq -> 6139
    //   6128: ldc2_w -809412168
    //   6131: l2i
    //   6132: ldc_w 1734556062
    //   6135: ixor
    //   6136: goto -> 6147
    //   6139: ldc2_w 1652246666
    //   6142: l2i
    //   6143: ldc_w -1167860065
    //   6146: ixor
    //   6147: ldc2_w 1471918272
    //   6150: l2i
    //   6151: ldc_w 2000959116
    //   6154: ixor
    //   6155: ixor
    //   6156: lookupswitch default -> 6184, -2042453346 -> 6139, -2007112086 -> 25680
    //   6184: aload_0
    //   6185: getstatic Perryc.1 : I
    //   6188: ifeq -> 6202
    //   6191: ldc2_w 2026095365
    //   6194: l2i
    //   6195: ldc_w -2016715081
    //   6198: ixor
    //   6199: goto -> 6210
    //   6202: ldc2_w 2099352650
    //   6205: l2i
    //   6206: ldc_w -1336058938
    //   6209: ixor
    //   6210: ldc2_w -1016865123
    //   6213: l2i
    //   6214: ldc_w 183768880
    //   6217: ixor
    //   6218: ixor
    //   6219: lookupswitch default -> 25328, 82511393 -> 6244, 916411423 -> 6202
    //   6244: getfield size : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6247: getstatic Perryc.0 : I
    //   6250: ifle -> 6264
    //   6253: ldc2_w 2073625995
    //   6256: l2i
    //   6257: ldc_w -407367866
    //   6260: ixor
    //   6261: goto -> 6272
    //   6264: ldc2_w -868901382
    //   6267: l2i
    //   6268: ldc_w 195725038
    //   6271: ixor
    //   6272: ldc2_w 1373002912
    //   6275: l2i
    //   6276: ldc_w -1463789080
    //   6279: ixor
    //   6280: ixor
    //   6281: lookupswitch default -> 25354, 1049173596 -> 6308, 1698107269 -> 6264
    //   6308: goto -> 6312
    //   6311: athrow
    //   6312: invokevirtual getValue : ()Ljava/lang/Object;
    //   6315: goto -> 6319
    //   6318: athrow
    //   6319: checkcast java/lang/Float
    //   6322: getstatic Perryc.0 : I
    //   6325: ifle -> 6339
    //   6328: ldc2_w 1574459871
    //   6331: l2i
    //   6332: ldc_w -16454658
    //   6335: ixor
    //   6336: goto -> 6347
    //   6339: ldc2_w -347748960
    //   6342: l2i
    //   6343: ldc_w -40569805
    //   6346: ixor
    //   6347: ldc2_w -2091086032
    //   6350: l2i
    //   6351: ldc_w 317357226
    //   6354: ixor
    //   6355: ixor
    //   6356: lookupswitch default -> 6384, -2013007312 -> 6339, 862601659 -> 25692
    //   6384: goto -> 6388
    //   6387: athrow
    //   6388: invokevirtual floatValue : ()F
    //   6391: goto -> 6395
    //   6394: athrow
    //   6395: f2d
    //   6396: ldc2_w 0.013725552444162787
    //   6399: invokestatic doubleToLongBits : (D)J
    //   6402: ldc2_w 9211299555796061405
    //   6405: lxor
    //   6406: invokestatic longBitsToDouble : (J)D
    //   6409: ddiv
    //   6410: getstatic Perryc.1 : I
    //   6413: ifeq -> 6427
    //   6416: ldc2_w -1512157551
    //   6419: l2i
    //   6420: ldc_w -403500173
    //   6423: ixor
    //   6424: goto -> 6435
    //   6427: ldc2_w 1952131306
    //   6430: l2i
    //   6431: ldc_w -1519971107
    //   6434: ixor
    //   6435: ldc2_w -162064275
    //   6438: l2i
    //   6439: ldc_w -1356345983
    //   6442: ixor
    //   6443: ixor
    //   6444: lookupswitch default -> 25592, -2008225317 -> 6472, 459114510 -> 6427
    //   6472: dstore #22
    //   6474: getstatic Perryc.0 : I
    //   6477: ifle -> 6491
    //   6480: ldc2_w -1793409870
    //   6483: l2i
    //   6484: ldc_w -1481781332
    //   6487: ixor
    //   6488: goto -> 6499
    //   6491: ldc2_w 1016593588
    //   6494: l2i
    //   6495: ldc_w 1171631282
    //   6498: ixor
    //   6499: ldc2_w 1493278269
    //   6502: l2i
    //   6503: ldc_w 2102712011
    //   6506: ixor
    //   6507: ixor
    //   6508: lookupswitch default -> 6536, -210895255 -> 6491, 383925224 -> 25362
    //   6536: goto -> 6540
    //   6539: athrow
    //   6540: invokestatic func_179094_E : ()V
    //   6543: goto -> 6547
    //   6546: athrow
    //   6547: getstatic Perryc.0 : I
    //   6550: ifle -> 6564
    //   6553: ldc2_w 666755714
    //   6556: l2i
    //   6557: ldc_w 669553911
    //   6560: ixor
    //   6561: goto -> 6572
    //   6564: ldc2_w 1332144564
    //   6567: l2i
    //   6568: ldc_w -133989115
    //   6571: ixor
    //   6572: ldc2_w -387102208
    //   6575: l2i
    //   6576: ldc_w 896588866
    //   6579: ixor
    //   6580: ixor
    //   6581: lookupswitch default -> 25538, -574037961 -> 6564, 1794638579 -> 6608
    //   6608: goto -> 6612
    //   6611: athrow
    //   6612: invokestatic func_74519_b : ()V
    //   6615: goto -> 6619
    //   6618: athrow
    //   6619: getstatic Perryc.c : I
    //   6622: iflt -> 6636
    //   6625: ldc2_w -2028524851
    //   6628: l2i
    //   6629: ldc_w 1390887807
    //   6632: ixor
    //   6633: goto -> 6644
    //   6636: ldc2_w 287238126
    //   6639: l2i
    //   6640: ldc_w 249615549
    //   6643: ixor
    //   6644: ldc2_w 273319223
    //   6647: l2i
    //   6648: ldc_w 906818456
    //   6651: ixor
    //   6652: ixor
    //   6653: lookupswitch default -> 25696, -206168291 -> 6636, 968377852 -> 6680
    //   6680: goto -> 6684
    //   6683: athrow
    //   6684: invokestatic func_179088_q : ()V
    //   6687: goto -> 6691
    //   6690: athrow
    //   6691: ldc_w 6.2054124
    //   6694: invokestatic floatToIntBits : (F)I
    //   6697: ldc_w 2135331517
    //   6700: ixor
    //   6701: invokestatic intBitsToFloat : (I)F
    //   6704: ldc_w -1.1359957E-5
    //   6707: invokestatic floatToIntBits : (F)I
    //   6710: ldc_w 2122943909
    //   6713: ixor
    //   6714: invokestatic intBitsToFloat : (I)F
    //   6717: getstatic Perryc.0 : I
    //   6720: ifle -> 6734
    //   6723: ldc2_w 741476876
    //   6726: l2i
    //   6727: ldc_w -57954483
    //   6730: ixor
    //   6731: goto -> 6742
    //   6734: ldc2_w 941481076
    //   6737: l2i
    //   6738: ldc_w 1678105973
    //   6741: ixor
    //   6742: ldc2_w -1473458125
    //   6745: l2i
    //   6746: ldc_w -2053852966
    //   6749: ixor
    //   6750: ixor
    //   6751: lookupswitch default -> 25432, -50215512 -> 6734, 1906336232 -> 6776
    //   6776: goto -> 6780
    //   6779: athrow
    //   6780: invokestatic func_179136_a : (FF)V
    //   6783: goto -> 6787
    //   6786: athrow
    //   6787: getstatic Perryc.1 : I
    //   6790: ifeq -> 6804
    //   6793: ldc2_w -1671703684
    //   6796: l2i
    //   6797: ldc_w 1977991137
    //   6800: ixor
    //   6801: goto -> 6812
    //   6804: ldc2_w -374784471
    //   6807: l2i
    //   6808: ldc_w 1260138234
    //   6811: ixor
    //   6812: ldc2_w -1979782644
    //   6815: l2i
    //   6816: ldc_w -1224908432
    //   6819: ixor
    //   6820: ixor
    //   6821: lookupswitch default -> 6848, -692197407 -> 25900, 1640455232 -> 6804
    //   6848: goto -> 6852
    //   6851: athrow
    //   6852: invokestatic func_179140_f : ()V
    //   6855: goto -> 6859
    //   6858: athrow
    //   6859: getstatic Perryc.0 : I
    //   6862: ifle -> 6876
    //   6865: ldc2_w -363304591
    //   6868: l2i
    //   6869: ldc_w 168733747
    //   6872: ixor
    //   6873: goto -> 6884
    //   6876: ldc2_w -69227374
    //   6879: l2i
    //   6880: ldc_w -1516899398
    //   6883: ixor
    //   6884: ldc2_w 1440771048
    //   6887: l2i
    //   6888: ldc_w -7422070
    //   6891: ixor
    //   6892: ixor
    //   6893: lookupswitch default -> 25872, -198931638 -> 6920, 1245188384 -> 6876
    //   6920: dload_2
    //   6921: d2f
    //   6922: getstatic Perryc.c : I
    //   6925: iflt -> 6939
    //   6928: ldc2_w -1666218709
    //   6931: l2i
    //   6932: ldc_w 167223591
    //   6935: ixor
    //   6936: goto -> 6947
    //   6939: ldc2_w 1712720910
    //   6942: l2i
    //   6943: ldc_w 192625296
    //   6946: ixor
    //   6947: ldc2_w 1473965997
    //   6950: l2i
    //   6951: ldc_w -1241864285
    //   6954: ixor
    //   6955: ixor
    //   6956: lookupswitch default -> 6984, -883890549 -> 6939, 2004380674 -> 25706
    //   6984: dload #9
    //   6986: d2f
    //   6987: ldc_w 20.166237
    //   6990: invokestatic floatToIntBits : (F)I
    //   6993: ldc_w 2115135303
    //   6996: ixor
    //   6997: invokestatic intBitsToFloat : (I)F
    //   7000: fadd
    //   7001: getstatic Perryc.1 : I
    //   7004: ifeq -> 7018
    //   7007: ldc2_w -762573384
    //   7010: l2i
    //   7011: ldc_w -1965290422
    //   7014: ixor
    //   7015: goto -> 7026
    //   7018: ldc2_w 425659560
    //   7021: l2i
    //   7022: ldc_w 75135908
    //   7025: ixor
    //   7026: ldc2_w -761744354
    //   7029: l2i
    //   7030: ldc_w -828842907
    //   7033: ixor
    //   7034: ixor
    //   7035: lookupswitch default -> 25292, 19210103 -> 7060, 1146120585 -> 7018
    //   7060: dload #6
    //   7062: d2f
    //   7063: getstatic Perryc.c : I
    //   7066: iflt -> 7080
    //   7069: ldc2_w -1596293735
    //   7072: l2i
    //   7073: ldc_w 533927684
    //   7076: ixor
    //   7077: goto -> 7088
    //   7080: ldc2_w -1640048615
    //   7083: l2i
    //   7084: ldc_w 31244407
    //   7087: ixor
    //   7088: ldc2_w 1715797812
    //   7091: l2i
    //   7092: ldc_w 1076361283
    //   7095: ixor
    //   7096: ixor
    //   7097: lookupswitch default -> 7124, -1721078294 -> 25682, -1386298715 -> 7080
    //   7124: goto -> 7128
    //   7127: athrow
    //   7128: invokestatic func_179109_b : (FFF)V
    //   7131: goto -> 7135
    //   7134: athrow
    //   7135: getstatic Perryc.0 : I
    //   7138: ifle -> 7152
    //   7141: ldc2_w -1309670779
    //   7144: l2i
    //   7145: ldc_w -1612428925
    //   7148: ixor
    //   7149: goto -> 7160
    //   7152: ldc2_w 1959520224
    //   7155: l2i
    //   7156: ldc_w -1562602475
    //   7159: ixor
    //   7160: ldc2_w -325637999
    //   7163: l2i
    //   7164: ldc_w 1886727039
    //   7167: ixor
    //   7168: ixor
    //   7169: lookupswitch default -> 25908, -1292482328 -> 7152, 1257599003 -> 7196
    //   7196: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   7199: getstatic Perryc.0 : I
    //   7202: ifle -> 7216
    //   7205: ldc2_w 1968572734
    //   7208: l2i
    //   7209: ldc_w -147024568
    //   7212: ixor
    //   7213: goto -> 7224
    //   7216: ldc2_w 225786712
    //   7219: l2i
    //   7220: ldc_w -1222361380
    //   7223: ixor
    //   7224: ldc2_w -1289933790
    //   7227: l2i
    //   7228: ldc_w -1726849783
    //   7231: ixor
    //   7232: ixor
    //   7233: lookupswitch default -> 25490, -1872857937 -> 7260, -1469715107 -> 7216
    //   7260: goto -> 7264
    //   7263: athrow
    //   7264: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   7267: goto -> 7271
    //   7270: athrow
    //   7271: getstatic Perryc.c : I
    //   7274: iflt -> 7288
    //   7277: ldc2_w 750735024
    //   7280: l2i
    //   7281: ldc_w -640174968
    //   7284: ixor
    //   7285: goto -> 7296
    //   7288: ldc2_w -1994443315
    //   7291: l2i
    //   7292: ldc_w 2136483216
    //   7295: ixor
    //   7296: ldc2_w 1935894369
    //   7299: l2i
    //   7300: ldc_w -1881592485
    //   7303: ixor
    //   7304: ixor
    //   7305: lookupswitch default -> 25524, 164802562 -> 7288, 184375911 -> 7332
    //   7332: getfield field_78735_i : F
    //   7335: fneg
    //   7336: ldc_w 2.6833483E37
    //   7339: invokestatic floatToIntBits : (F)I
    //   7342: ldc_w 2107735943
    //   7345: ixor
    //   7346: invokestatic intBitsToFloat : (I)F
    //   7349: ldc_w 6.8090835
    //   7352: invokestatic floatToIntBits : (F)I
    //   7355: ldc_w 2136597507
    //   7358: ixor
    //   7359: invokestatic intBitsToFloat : (I)F
    //   7362: ldc_w 3.336923E38
    //   7365: invokestatic floatToIntBits : (F)I
    //   7368: ldc_w 2138770125
    //   7371: ixor
    //   7372: invokestatic intBitsToFloat : (I)F
    //   7375: getstatic Perryc.c : I
    //   7378: iflt -> 7392
    //   7381: ldc2_w -10377115
    //   7384: l2i
    //   7385: ldc_w -671760157
    //   7388: ixor
    //   7389: goto -> 7400
    //   7392: ldc2_w -1885714780
    //   7395: l2i
    //   7396: ldc_w 451130257
    //   7399: ixor
    //   7400: ldc2_w -1644845126
    //   7403: l2i
    //   7404: ldc_w 1821172152
    //   7407: ixor
    //   7408: ixor
    //   7409: lookupswitch default -> 25522, -638767484 -> 7392, 1677767479 -> 7436
    //   7436: goto -> 7440
    //   7439: athrow
    //   7440: invokestatic func_179114_b : (FFFF)V
    //   7443: goto -> 7447
    //   7446: athrow
    //   7447: getstatic Perryc.c : I
    //   7450: iflt -> 7464
    //   7453: ldc2_w 1825906840
    //   7456: l2i
    //   7457: ldc_w -1306894064
    //   7460: ixor
    //   7461: goto -> 7472
    //   7464: ldc2_w -1550925298
    //   7467: l2i
    //   7468: ldc_w 1692693707
    //   7471: ixor
    //   7472: ldc2_w 384887918
    //   7475: l2i
    //   7476: ldc_w 664832825
    //   7479: ixor
    //   7480: ixor
    //   7481: lookupswitch default -> 25772, -274782497 -> 7464, -163917422 -> 7508
    //   7508: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   7511: getstatic Perryc.1 : I
    //   7514: ifeq -> 7528
    //   7517: ldc2_w -357275368
    //   7520: l2i
    //   7521: ldc_w 365480895
    //   7524: ixor
    //   7525: goto -> 7536
    //   7528: ldc2_w 121771662
    //   7531: l2i
    //   7532: ldc_w -2082241034
    //   7535: ixor
    //   7536: ldc2_w 1291515801
    //   7539: l2i
    //   7540: ldc_w -264513119
    //   7543: ixor
    //   7544: ixor
    //   7545: lookupswitch default -> 7572, -544337419 -> 7528, 1136495775 -> 25662
    //   7572: goto -> 7576
    //   7575: athrow
    //   7576: invokevirtual func_175598_ae : ()Lnet/minecraft/client/renderer/entity/RenderManager;
    //   7579: goto -> 7583
    //   7582: athrow
    //   7583: getstatic Perryc.0 : I
    //   7586: ifle -> 7600
    //   7589: ldc2_w 1896164709
    //   7592: l2i
    //   7593: ldc_w -999619419
    //   7596: ixor
    //   7597: goto -> 7608
    //   7600: ldc2_w -856899280
    //   7603: l2i
    //   7604: ldc_w -1757133412
    //   7607: ixor
    //   7608: ldc2_w 667182337
    //   7611: l2i
    //   7612: ldc_w -675969424
    //   7615: ixor
    //   7616: ixor
    //   7617: lookupswitch default -> 25420, -1411815459 -> 7644, 1159711409 -> 7600
    //   7644: getfield field_78732_j : F
    //   7647: getstatic Perryc.0 : I
    //   7650: ifle -> 7664
    //   7653: ldc2_w 1397204422
    //   7656: l2i
    //   7657: ldc_w -1656811768
    //   7660: ixor
    //   7661: goto -> 7672
    //   7664: ldc2_w -1445024624
    //   7667: l2i
    //   7668: ldc_w -1668552376
    //   7671: ixor
    //   7672: ldc2_w 1993241806
    //   7675: l2i
    //   7676: ldc_w -372333694
    //   7679: ixor
    //   7680: ixor
    //   7681: lookupswitch default -> 7708, 257295449 -> 7664, 1366850946 -> 25740
    //   7708: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   7711: getstatic Perryc.0 : I
    //   7714: ifle -> 7728
    //   7717: ldc2_w 533650980
    //   7720: l2i
    //   7721: ldc_w 511280968
    //   7724: ixor
    //   7725: goto -> 7736
    //   7728: ldc2_w -1912330147
    //   7731: l2i
    //   7732: ldc_w -1406280449
    //   7735: ixor
    //   7736: ldc2_w -1220204737
    //   7739: l2i
    //   7740: ldc_w 1894619205
    //   7743: ixor
    //   7744: ixor
    //   7745: lookupswitch default -> 25596, -970988010 -> 7728, -444511272 -> 7772
    //   7772: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   7775: getstatic Perryc.1 : I
    //   7778: ifeq -> 7792
    //   7781: ldc2_w 4285882
    //   7784: l2i
    //   7785: ldc_w 1403244719
    //   7788: ixor
    //   7789: goto -> 7800
    //   7792: ldc2_w 588441118
    //   7795: l2i
    //   7796: ldc_w 301888423
    //   7799: ixor
    //   7800: ldc2_w -308229554
    //   7803: l2i
    //   7804: ldc_w -552823994
    //   7807: ixor
    //   7808: ixor
    //   7809: lookupswitch default -> 7836, 1167605656 -> 7792, 1632562205 -> 25678
    //   7836: getfield field_74320_O : I
    //   7839: ldc2_w 1727815614
    //   7842: l2i
    //   7843: ldc_w 1727815612
    //   7846: ixor
    //   7847: if_icmpne -> 7861
    //   7850: ldc2_w -174632361
    //   7853: l2i
    //   7854: ldc_w 1398485437
    //   7857: ixor
    //   7858: goto -> 7869
    //   7861: ldc2_w 2014892183
    //   7864: l2i
    //   7865: ldc_w -556485764
    //   7868: ixor
    //   7869: ldc2_w 1228826440
    //   7872: l2i
    //   7873: ldc_w 368201104
    //   7876: ixor
    //   7877: ixor
    //   7878: tableswitch default -> 7850, -100644558 -> 7900, -100644557 -> 7916
    //   7900: ldc_w -30.809034
    //   7903: invokestatic floatToIntBits : (F)I
    //   7906: ldc_w 2121693415
    //   7909: ixor
    //   7910: invokestatic intBitsToFloat : (I)F
    //   7913: goto -> 7929
    //   7916: ldc_w 15.842458
    //   7919: invokestatic floatToIntBits : (F)I
    //   7922: ldc_w 2130541237
    //   7925: ixor
    //   7926: invokestatic intBitsToFloat : (I)F
    //   7929: ldc_w 1.6731151E38
    //   7932: invokestatic floatToIntBits : (F)I
    //   7935: ldc_w 2130427405
    //   7938: ixor
    //   7939: invokestatic intBitsToFloat : (I)F
    //   7942: ldc_w 1.1886217E38
    //   7945: invokestatic floatToIntBits : (F)I
    //   7948: ldc_w 2125649931
    //   7951: ixor
    //   7952: invokestatic intBitsToFloat : (I)F
    //   7955: getstatic Perryc.1 : I
    //   7958: ifeq -> 7972
    //   7961: ldc2_w -504191405
    //   7964: l2i
    //   7965: ldc_w -448847530
    //   7968: ixor
    //   7969: goto -> 7980
    //   7972: ldc2_w 850057547
    //   7975: l2i
    //   7976: ldc_w -1583276676
    //   7979: ixor
    //   7980: ldc2_w -1326370519
    //   7983: l2i
    //   7984: ldc_w -1183655329
    //   7987: ixor
    //   7988: ixor
    //   7989: lookupswitch default -> 8016, 223243379 -> 25250, 1610158490 -> 7972
    //   8016: goto -> 8020
    //   8019: athrow
    //   8020: invokestatic func_179114_b : (FFFF)V
    //   8023: goto -> 8027
    //   8026: athrow
    //   8027: getstatic Perryc.c : I
    //   8030: iflt -> 8044
    //   8033: ldc2_w -1008013161
    //   8036: l2i
    //   8037: ldc_w -908214006
    //   8040: ixor
    //   8041: goto -> 8052
    //   8044: ldc2_w -467301389
    //   8047: l2i
    //   8048: ldc_w 1203466381
    //   8051: ixor
    //   8052: ldc2_w -1272870678
    //   8055: l2i
    //   8056: ldc_w 1810282290
    //   8059: ixor
    //   8060: ixor
    //   8061: lookupswitch default -> 25476, -705687995 -> 8044, 2086257830 -> 8088
    //   8088: dload #22
    //   8090: dneg
    //   8091: getstatic Perryc.0 : I
    //   8094: ifle -> 8108
    //   8097: ldc2_w 939375593
    //   8100: l2i
    //   8101: ldc_w 472975957
    //   8104: ixor
    //   8105: goto -> 8116
    //   8108: ldc2_w 1588316639
    //   8111: l2i
    //   8112: ldc_w 1316724003
    //   8115: ixor
    //   8116: ldc2_w -674469725
    //   8119: l2i
    //   8120: ldc_w 712395036
    //   8123: ixor
    //   8124: ixor
    //   8125: lookupswitch default -> 8152, -696872957 -> 25426, 247966033 -> 8108
    //   8152: dload #22
    //   8154: dneg
    //   8155: getstatic Perryc.c : I
    //   8158: iflt -> 8172
    //   8161: ldc2_w 1299949941
    //   8164: l2i
    //   8165: ldc_w 1884212228
    //   8168: ixor
    //   8169: goto -> 8180
    //   8172: ldc2_w -736776845
    //   8175: l2i
    //   8176: ldc_w -164314445
    //   8179: ixor
    //   8180: ldc2_w -1088333217
    //   8183: l2i
    //   8184: ldc_w -1359108639
    //   8187: ixor
    //   8188: ixor
    //   8189: lookupswitch default -> 8216, 725560325 -> 8172, 753507023 -> 25272
    //   8216: dload #22
    //   8218: getstatic Perryc.0 : I
    //   8221: ifle -> 8235
    //   8224: ldc2_w -1986979043
    //   8227: l2i
    //   8228: ldc_w -503959729
    //   8231: ixor
    //   8232: goto -> 8243
    //   8235: ldc2_w 247974817
    //   8238: l2i
    //   8239: ldc_w -967745712
    //   8242: ixor
    //   8243: ldc2_w -357375574
    //   8246: l2i
    //   8247: ldc_w 1225004465
    //   8250: ixor
    //   8251: ixor
    //   8252: lookupswitch default -> 8280, -1517455173 -> 8235, -875446199 -> 25652
    //   8280: goto -> 8284
    //   8283: athrow
    //   8284: invokestatic func_179139_a : (DDD)V
    //   8287: goto -> 8291
    //   8290: athrow
    //   8291: getstatic Perryc.0 : I
    //   8294: ifle -> 8308
    //   8297: ldc2_w -12214442
    //   8300: l2i
    //   8301: ldc_w 1530542008
    //   8304: ixor
    //   8305: goto -> 8316
    //   8308: ldc2_w 194364661
    //   8311: l2i
    //   8312: ldc_w -2121754241
    //   8315: ixor
    //   8316: ldc2_w 797885908
    //   8319: l2i
    //   8320: ldc_w 134093143
    //   8323: ixor
    //   8324: ixor
    //   8325: lookupswitch default -> 8352, -1945144211 -> 25704, 616502684 -> 8308
    //   8352: goto -> 8356
    //   8355: athrow
    //   8356: invokestatic func_179097_i : ()V
    //   8359: goto -> 8363
    //   8362: athrow
    //   8363: getstatic Perryc.1 : I
    //   8366: ifeq -> 8380
    //   8369: ldc2_w -1934268049
    //   8372: l2i
    //   8373: ldc_w -2089460660
    //   8376: ixor
    //   8377: goto -> 8388
    //   8380: ldc2_w 1944458517
    //   8383: l2i
    //   8384: ldc_w -1942314178
    //   8387: ixor
    //   8388: ldc2_w -1581659816
    //   8391: l2i
    //   8392: ldc_w -1168824506
    //   8395: ixor
    //   8396: ixor
    //   8397: lookupswitch default -> 25646, -466593739 -> 8424, 338484029 -> 8380
    //   8424: goto -> 8428
    //   8427: athrow
    //   8428: invokestatic func_179147_l : ()V
    //   8431: goto -> 8435
    //   8434: athrow
    //   8435: getstatic Perryc.1 : I
    //   8438: ifeq -> 8452
    //   8441: ldc2_w -65584849
    //   8444: l2i
    //   8445: ldc_w -1303295518
    //   8448: ixor
    //   8449: goto -> 8460
    //   8452: ldc2_w -1632256744
    //   8455: l2i
    //   8456: ldc_w 301210841
    //   8459: ixor
    //   8460: ldc2_w -912321492
    //   8463: l2i
    //   8464: ldc_w 199613647
    //   8467: ixor
    //   8468: ixor
    //   8469: lookupswitch default -> 8496, -1942175698 -> 25530, 413147189 -> 8452
    //   8496: goto -> 8500
    //   8499: athrow
    //   8500: invokestatic func_179147_l : ()V
    //   8503: goto -> 8507
    //   8506: athrow
    //   8507: getstatic Perryc.0 : I
    //   8510: ifle -> 8524
    //   8513: ldc2_w -629514659
    //   8516: l2i
    //   8517: ldc_w 1558390384
    //   8520: ixor
    //   8521: goto -> 8532
    //   8524: ldc2_w -437851932
    //   8527: l2i
    //   8528: ldc_w -201214306
    //   8531: ixor
    //   8532: ldc2_w -1796598981
    //   8535: l2i
    //   8536: ldc_w 2044317193
    //   8539: ixor
    //   8540: ixor
    //   8541: lookupswitch default -> 8568, 1806345503 -> 25544, 1841861467 -> 8524
    //   8568: aload_0
    //   8569: getstatic Perryc.1 : I
    //   8572: ifeq -> 8586
    //   8575: ldc2_w -157644790
    //   8578: l2i
    //   8579: ldc_w -714461522
    //   8582: ixor
    //   8583: goto -> 8594
    //   8586: ldc2_w 135341903
    //   8589: l2i
    //   8590: ldc_w 266054018
    //   8593: ixor
    //   8594: ldc2_w 1714926877
    //   8597: l2i
    //   8598: ldc_w 426756598
    //   8601: ixor
    //   8602: ixor
    //   8603: lookupswitch default -> 25906, 1554569807 -> 8586, 2022896166 -> 8628
    //   8628: getfield rect : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8631: getstatic Perryc.c : I
    //   8634: iflt -> 8648
    //   8637: ldc2_w -264437992
    //   8640: l2i
    //   8641: ldc_w 602397464
    //   8644: ixor
    //   8645: goto -> 8656
    //   8648: ldc2_w 2079383427
    //   8651: l2i
    //   8652: ldc_w -668189155
    //   8655: ixor
    //   8656: ldc2_w 538776655
    //   8659: l2i
    //   8660: ldc_w -567141395
    //   8663: ixor
    //   8664: ixor
    //   8665: lookupswitch default -> 25566, 770976674 -> 8648, 1576267324 -> 8692
    //   8692: goto -> 8696
    //   8695: athrow
    //   8696: invokevirtual getValue : ()Ljava/lang/Object;
    //   8699: goto -> 8703
    //   8702: athrow
    //   8703: checkcast java/lang/Boolean
    //   8706: getstatic Perryc.1 : I
    //   8709: ifeq -> 8723
    //   8712: ldc2_w -204936805
    //   8715: l2i
    //   8716: ldc_w -1816901380
    //   8719: ixor
    //   8720: goto -> 8731
    //   8723: ldc2_w -1612097295
    //   8726: l2i
    //   8727: ldc_w -1856340557
    //   8730: ixor
    //   8731: ldc2_w -73838359
    //   8734: l2i
    //   8735: ldc_w -391731202
    //   8738: ixor
    //   8739: ixor
    //   8740: lookupswitch default -> 25742, 495768149 -> 8768, 1933792880 -> 8723
    //   8768: goto -> 8772
    //   8771: athrow
    //   8772: invokevirtual booleanValue : ()Z
    //   8775: goto -> 8779
    //   8778: athrow
    //   8779: ifeq -> 8793
    //   8782: ldc2_w -385895339
    //   8785: l2i
    //   8786: ldc_w 2074020649
    //   8789: ixor
    //   8790: goto -> 8801
    //   8793: ldc2_w -1167351397
    //   8796: l2i
    //   8797: ldc_w 688594680
    //   8800: ixor
    //   8801: ldc2_w 1920348401
    //   8804: l2i
    //   8805: ldc_w -1744401502
    //   8808: ixor
    //   8809: ixor
    //   8810: tableswitch default -> 8782, 2031092783 -> 8832, 2031092784 -> 9339
    //   8832: getstatic Perryc.1 : I
    //   8835: ifeq -> 8849
    //   8838: ldc2_w 216162738
    //   8841: l2i
    //   8842: ldc_w 1049643127
    //   8845: ixor
    //   8846: goto -> 8857
    //   8849: ldc2_w 46484828
    //   8852: l2i
    //   8853: ldc_w 1913960221
    //   8856: ixor
    //   8857: ldc2_w 80115771
    //   8860: l2i
    //   8861: ldc_w -1722338713
    //   8864: ixor
    //   8865: ixor
    //   8866: lookupswitch default -> 8892, -1344052327 -> 25440, 808781538 -> 8849
    //   8892: aload_0
    //   8893: getstatic Perryc.1 : I
    //   8896: ifeq -> 8910
    //   8899: ldc2_w 1569487118
    //   8902: l2i
    //   8903: ldc_w 325969315
    //   8906: ixor
    //   8907: goto -> 8918
    //   8910: ldc2_w 544800385
    //   8913: l2i
    //   8914: ldc_w -456853700
    //   8917: ixor
    //   8918: ldc2_w 1145298594
    //   8921: l2i
    //   8922: ldc_w 1054026014
    //   8925: ixor
    //   8926: ixor
    //   8927: lookupswitch default -> 8952, -186345765 -> 8910, 879848209 -> 25700
    //   8952: iload #21
    //   8954: ineg
    //   8955: ldc2_w 6583370
    //   8958: l2i
    //   8959: ldc_w 6583368
    //   8962: ixor
    //   8963: isub
    //   8964: i2f
    //   8965: getstatic Perryc.1 : I
    //   8968: ifeq -> 8982
    //   8971: ldc2_w 930674964
    //   8974: l2i
    //   8975: ldc_w 1160610016
    //   8978: ixor
    //   8979: goto -> 8990
    //   8982: ldc2_w 197689751
    //   8985: l2i
    //   8986: ldc_w -146285816
    //   8989: ixor
    //   8990: ldc2_w 1918035183
    //   8993: l2i
    //   8994: ldc_w 627852053
    //   8997: ixor
    //   8998: ixor
    //   8999: lookupswitch default -> 9024, -665137410 -> 8982, 627826190 -> 25874
    //   9024: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   9027: getstatic Perryc.0 : I
    //   9030: ifle -> 9044
    //   9033: ldc2_w -579350
    //   9036: l2i
    //   9037: ldc_w -623779332
    //   9040: ixor
    //   9041: goto -> 9052
    //   9044: ldc2_w 1933012469
    //   9047: l2i
    //   9048: ldc_w 194056780
    //   9051: ixor
    //   9052: ldc2_w 1228087018
    //   9055: l2i
    //   9056: ldc_w 519643967
    //   9059: ixor
    //   9060: ixor
    //   9061: lookupswitch default -> 9088, 576532838 -> 9044, 1928131779 -> 25774
    //   9088: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   9091: getstatic Perryc.1 : I
    //   9094: ifeq -> 9108
    //   9097: ldc2_w -421710560
    //   9100: l2i
    //   9101: ldc_w -1782182665
    //   9104: ixor
    //   9105: goto -> 9116
    //   9108: ldc2_w -877236425
    //   9111: l2i
    //   9112: ldc_w 544614727
    //   9115: ixor
    //   9116: ldc2_w -1999830939
    //   9119: l2i
    //   9120: ldc_w -1466979901
    //   9123: ixor
    //   9124: ixor
    //   9125: lookupswitch default -> 9152, 1398378609 -> 25834, 1590689307 -> 9108
    //   9152: getfield field_78288_b : I
    //   9155: ldc2_w 735038524
    //   9158: l2i
    //   9159: ldc_w 735038525
    //   9162: ixor
    //   9163: iadd
    //   9164: ineg
    //   9165: i2f
    //   9166: getstatic Perryc.c : I
    //   9169: iflt -> 9183
    //   9172: ldc2_w 1137625024
    //   9175: l2i
    //   9176: ldc_w -1055378322
    //   9179: ixor
    //   9180: goto -> 9191
    //   9183: ldc2_w 1398072397
    //   9186: l2i
    //   9187: ldc_w 915007869
    //   9190: ixor
    //   9191: ldc2_w 701017465
    //   9194: l2i
    //   9195: ldc_w -1025121669
    //   9198: ixor
    //   9199: ixor
    //   9200: lookupswitch default -> 25466, -1896857038 -> 9228, 1778105516 -> 9183
    //   9228: iload #21
    //   9230: i2f
    //   9231: ldc_w 0.7778266
    //   9234: invokestatic floatToIntBits : (F)I
    //   9237: ldc_w 2135367589
    //   9240: ixor
    //   9241: invokestatic intBitsToFloat : (I)F
    //   9244: fadd
    //   9245: ldc_w 25.005308
    //   9248: invokestatic floatToIntBits : (F)I
    //   9251: ldc_w 2114456287
    //   9254: ixor
    //   9255: invokestatic intBitsToFloat : (I)F
    //   9258: ldc2_w 1578574413
    //   9261: l2i
    //   9262: ldc_w 186065485
    //   9265: ixor
    //   9266: getstatic Perryc.0 : I
    //   9269: ifle -> 9283
    //   9272: ldc2_w -969498265
    //   9275: l2i
    //   9276: ldc_w -278080916
    //   9279: ixor
    //   9280: goto -> 9291
    //   9283: ldc2_w -889648485
    //   9286: l2i
    //   9287: ldc_w -1769365395
    //   9290: ixor
    //   9291: ldc2_w 236667056
    //   9294: l2i
    //   9295: ldc_w 303950728
    //   9298: ixor
    //   9299: ixor
    //   9300: lookupswitch default -> 25262, 895277107 -> 9283, 1081475534 -> 9328
    //   9328: goto -> 9332
    //   9331: athrow
    //   9332: invokevirtual drawRect : (FFFFI)V
    //   9335: goto -> 9339
    //   9338: athrow
    //   9339: getstatic Perryc.0 : I
    //   9342: ifle -> 9356
    //   9345: ldc2_w -1883697510
    //   9348: l2i
    //   9349: ldc_w -587957567
    //   9352: ixor
    //   9353: goto -> 9364
    //   9356: ldc2_w 558238044
    //   9359: l2i
    //   9360: ldc_w 1789784798
    //   9363: ixor
    //   9364: ldc2_w -1067573197
    //   9367: l2i
    //   9368: ldc_w -1963559388
    //   9371: ixor
    //   9372: ixor
    //   9373: lookupswitch default -> 9400, 434446924 -> 25724, 2033867243 -> 9356
    //   9400: aload_0
    //   9401: getstatic Perryc.0 : I
    //   9404: ifle -> 9418
    //   9407: ldc2_w 1857955010
    //   9410: l2i
    //   9411: ldc_w -1435596142
    //   9414: ixor
    //   9415: goto -> 9426
    //   9418: ldc2_w 1924388318
    //   9421: l2i
    //   9422: ldc_w 1566807828
    //   9425: ixor
    //   9426: ldc2_w -1285752512
    //   9429: l2i
    //   9430: ldc_w 256629109
    //   9433: ixor
    //   9434: ixor
    //   9435: lookupswitch default -> 25482, -1815649537 -> 9460, 2026344037 -> 9418
    //   9460: getfield line : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9463: getstatic Perryc.0 : I
    //   9466: ifle -> 9480
    //   9469: ldc2_w -728813545
    //   9472: l2i
    //   9473: ldc_w 1057489936
    //   9476: ixor
    //   9477: goto -> 9488
    //   9480: ldc2_w 133255643
    //   9483: l2i
    //   9484: ldc_w -395642326
    //   9487: ixor
    //   9488: ldc2_w -723818638
    //   9491: l2i
    //   9492: ldc_w 1280390756
    //   9495: ixor
    //   9496: ixor
    //   9497: lookupswitch default -> 9524, 1603556230 -> 9480, 1930257681 -> 25794
    //   9524: goto -> 9528
    //   9527: athrow
    //   9528: invokevirtual getValue : ()Ljava/lang/Object;
    //   9531: goto -> 9535
    //   9534: athrow
    //   9535: checkcast java/lang/Boolean
    //   9538: getstatic Perryc.1 : I
    //   9541: ifeq -> 9555
    //   9544: ldc2_w 929262018
    //   9547: l2i
    //   9548: ldc_w -966323900
    //   9551: ixor
    //   9552: goto -> 9563
    //   9555: ldc2_w 1674267254
    //   9558: l2i
    //   9559: ldc_w -780728884
    //   9562: ixor
    //   9563: ldc2_w -1324342499
    //   9566: l2i
    //   9567: ldc_w -1606552520
    //   9570: ixor
    //   9571: ixor
    //   9572: lookupswitch default -> 9600, -534138973 -> 25922, 1778277757 -> 9555
    //   9600: goto -> 9604
    //   9603: athrow
    //   9604: invokevirtual booleanValue : ()Z
    //   9607: goto -> 9611
    //   9610: athrow
    //   9611: ifeq -> 9625
    //   9614: ldc2_w 1176331612
    //   9617: l2i
    //   9618: ldc_w 1961324456
    //   9621: ixor
    //   9622: goto -> 9633
    //   9625: ldc2_w -1294307691
    //   9628: l2i
    //   9629: ldc_w -2145360798
    //   9632: ixor
    //   9633: ldc2_w -1788886529
    //   9636: l2i
    //   9637: ldc_w -1021721890
    //   9640: ixor
    //   9641: ixor
    //   9642: tableswitch default -> 9614, 1690044885 -> 9664, 1690044886 -> 14651
    //   9664: getstatic Perryc.1 : I
    //   9667: ifeq -> 9681
    //   9670: ldc2_w -628712337
    //   9673: l2i
    //   9674: ldc_w 1728610618
    //   9677: ixor
    //   9678: goto -> 9689
    //   9681: ldc2_w 1953782556
    //   9684: l2i
    //   9685: ldc_w 609700262
    //   9688: ixor
    //   9689: ldc2_w -311881494
    //   9692: l2i
    //   9693: ldc_w 1270159798
    //   9696: ixor
    //   9697: ixor
    //   9698: lookupswitch default -> 25514, -151053338 -> 9724, 458363913 -> 9681
    //   9724: aload_1
    //   9725: getstatic Perryc.c : I
    //   9728: iflt -> 9742
    //   9731: ldc2_w -1328830042
    //   9734: l2i
    //   9735: ldc_w -1892128727
    //   9738: ixor
    //   9739: goto -> 9750
    //   9742: ldc2_w 602972460
    //   9745: l2i
    //   9746: ldc_w -157268231
    //   9749: ixor
    //   9750: ldc2_w -348175321
    //   9753: l2i
    //   9754: ldc_w -659487369
    //   9757: ixor
    //   9758: ixor
    //   9759: lookupswitch default -> 25484, -421615995 -> 9784, 209551583 -> 9742
    //   9784: goto -> 9788
    //   9787: athrow
    //   9788: invokevirtual func_110143_aJ : ()F
    //   9791: goto -> 9795
    //   9794: athrow
    //   9795: getstatic Perryc.c : I
    //   9798: iflt -> 9812
    //   9801: ldc2_w -1500579438
    //   9804: l2i
    //   9805: ldc_w -1611233475
    //   9808: ixor
    //   9809: goto -> 9820
    //   9812: ldc2_w -1047534462
    //   9815: l2i
    //   9816: ldc_w -2137598897
    //   9819: ixor
    //   9820: ldc2_w -189756432
    //   9823: l2i
    //   9824: ldc_w -950723874
    //   9827: ixor
    //   9828: ixor
    //   9829: lookupswitch default -> 9856, -1647836335 -> 9812, 178122625 -> 25360
    //   9856: aload_1
    //   9857: getstatic Perryc.0 : I
    //   9860: ifle -> 9874
    //   9863: ldc2_w 1730995024
    //   9866: l2i
    //   9867: ldc_w 1143329679
    //   9870: ixor
    //   9871: goto -> 9882
    //   9874: ldc2_w 289325051
    //   9877: l2i
    //   9878: ldc_w -1050416107
    //   9881: ixor
    //   9882: ldc2_w -1752255367
    //   9885: l2i
    //   9886: ldc_w -467768688
    //   9889: ixor
    //   9890: ixor
    //   9891: lookupswitch default -> 9916, 1331622361 -> 9874, 1352265270 -> 25364
    //   9916: goto -> 9920
    //   9919: athrow
    //   9920: invokevirtual func_110139_bj : ()F
    //   9923: goto -> 9927
    //   9926: athrow
    //   9927: fadd
    //   9928: getstatic Perryc.1 : I
    //   9931: ifeq -> 9945
    //   9934: ldc2_w 1694884061
    //   9937: l2i
    //   9938: ldc_w -252945612
    //   9941: ixor
    //   9942: goto -> 9953
    //   9945: ldc2_w -679976542
    //   9948: l2i
    //   9949: ldc_w -1341763512
    //   9952: ixor
    //   9953: ldc2_w 908400819
    //   9956: l2i
    //   9957: ldc_w -303267270
    //   9960: ixor
    //   9961: ixor
    //   9962: lookupswitch default -> 9988, 1310728544 -> 25862, 2067067379 -> 9945
    //   9988: fstore #24
    //   9990: getstatic Perryc.1 : I
    //   9993: ifeq -> 10007
    //   9996: ldc2_w -332997640
    //   9999: l2i
    //   10000: ldc_w 1336493885
    //   10003: ixor
    //   10004: goto -> 10015
    //   10007: ldc2_w 1286302844
    //   10010: l2i
    //   10011: ldc_w -2095203814
    //   10014: ixor
    //   10015: ldc2_w 1046538970
    //   10018: l2i
    //   10019: ldc_w 1262079598
    //   10022: ixor
    //   10023: ixor
    //   10024: lookupswitch default -> 10052, -1891632719 -> 10007, -690571151 -> 25686
    //   10052: fload #24
    //   10054: ldc_w 0.028518846
    //   10057: invokestatic floatToIntBits : (F)I
    //   10060: ldc_w 2129502299
    //   10063: ixor
    //   10064: invokestatic intBitsToFloat : (I)F
    //   10067: fcmpl
    //   10068: iflt -> 10082
    //   10071: ldc2_w -1752089760
    //   10074: l2i
    //   10075: ldc_w 996686073
    //   10078: ixor
    //   10079: goto -> 10090
    //   10082: ldc2_w 1430343486
    //   10085: l2i
    //   10086: ldc_w -105362268
    //   10089: ixor
    //   10090: ldc2_w -451080865
    //   10093: l2i
    //   10094: ldc_w 1797399427
    //   10097: ixor
    //   10098: ixor
    //   10099: tableswitch default -> 10071, 583413061 -> 10120, 583413062 -> 10226
    //   10120: ldc2_w 781105199
    //   10123: l2i
    //   10124: ldc_w 781105199
    //   10127: ixor
    //   10128: ldc2_w 1705302779
    //   10131: l2i
    //   10132: ldc_w 1705302532
    //   10135: ixor
    //   10136: ldc2_w 1178618292
    //   10139: l2i
    //   10140: ldc_w 1178618292
    //   10143: ixor
    //   10144: ldc2_w -1141758024
    //   10147: l2i
    //   10148: ldc_w -1141758137
    //   10151: ixor
    //   10152: getstatic Perryc.1 : I
    //   10155: ifeq -> 10169
    //   10158: ldc2_w -664878093
    //   10161: l2i
    //   10162: ldc_w -138691437
    //   10165: ixor
    //   10166: goto -> 10177
    //   10169: ldc2_w -1238073891
    //   10172: l2i
    //   10173: ldc_w -1263358007
    //   10176: ixor
    //   10177: ldc2_w -1949943076
    //   10180: l2i
    //   10181: ldc_w -1821751380
    //   10184: ixor
    //   10185: ixor
    //   10186: lookupswitch default -> 25280, 439005028 -> 10212, 927531536 -> 10169
    //   10212: goto -> 10216
    //   10215: athrow
    //   10216: invokestatic toRGBA : (IIII)I
    //   10219: goto -> 10223
    //   10222: athrow
    //   10223: goto -> 11747
    //   10226: getstatic Perryc.c : I
    //   10229: iflt -> 10243
    //   10232: ldc2_w -2075395437
    //   10235: l2i
    //   10236: ldc_w 267012276
    //   10239: ixor
    //   10240: goto -> 10251
    //   10243: ldc2_w 489534092
    //   10246: l2i
    //   10247: ldc_w -323218203
    //   10250: ixor
    //   10251: ldc2_w -1674391884
    //   10254: l2i
    //   10255: ldc_w 557611286
    //   10258: ixor
    //   10259: ixor
    //   10260: lookupswitch default -> 25442, 917439877 -> 10243, 1285493195 -> 10288
    //   10288: fload #24
    //   10290: ldc_w 0.76141435
    //   10293: invokestatic floatToIntBits : (F)I
    //   10296: ldc_w 2125655053
    //   10299: ixor
    //   10300: invokestatic intBitsToFloat : (I)F
    //   10303: fcmpl
    //   10304: iflt -> 10318
    //   10307: ldc2_w 1147486381
    //   10310: l2i
    //   10311: ldc_w 1313003011
    //   10314: ixor
    //   10315: goto -> 10326
    //   10318: ldc2_w -1904086278
    //   10321: l2i
    //   10322: ldc_w -2069470117
    //   10325: ixor
    //   10326: ldc2_w 479439041
    //   10329: l2i
    //   10330: ldc_w -675845224
    //   10333: ixor
    //   10334: ixor
    //   10335: tableswitch default -> 10307, -1056745993 -> 10356, -1056745992 -> 10462
    //   10356: ldc2_w 1976959487
    //   10359: l2i
    //   10360: ldc_w 1976959337
    //   10363: ixor
    //   10364: ldc2_w -1098130255
    //   10367: l2i
    //   10368: ldc_w -1098130354
    //   10371: ixor
    //   10372: ldc2_w 51297135
    //   10375: l2i
    //   10376: ldc_w 51297135
    //   10379: ixor
    //   10380: ldc2_w -376160036
    //   10383: l2i
    //   10384: ldc_w -376160221
    //   10387: ixor
    //   10388: getstatic Perryc.c : I
    //   10391: iflt -> 10405
    //   10394: ldc2_w 366192527
    //   10397: l2i
    //   10398: ldc_w -1150129139
    //   10401: ixor
    //   10402: goto -> 10413
    //   10405: ldc2_w 2075983895
    //   10408: l2i
    //   10409: ldc_w -88008394
    //   10412: ixor
    //   10413: ldc2_w 610040351
    //   10416: l2i
    //   10417: ldc_w -1794656603
    //   10420: ixor
    //   10421: ixor
    //   10422: lookupswitch default -> 25848, 536479544 -> 10405, 807916955 -> 10448
    //   10448: goto -> 10452
    //   10451: athrow
    //   10452: invokestatic toRGBA : (IIII)I
    //   10455: goto -> 10459
    //   10458: athrow
    //   10459: goto -> 11747
    //   10462: getstatic Perryc.c : I
    //   10465: iflt -> 10479
    //   10468: ldc2_w -1361046492
    //   10471: l2i
    //   10472: ldc_w -1998423533
    //   10475: ixor
    //   10476: goto -> 10487
    //   10479: ldc2_w -45002973
    //   10482: l2i
    //   10483: ldc_w -1245493360
    //   10486: ixor
    //   10487: ldc2_w 338777063
    //   10490: l2i
    //   10491: ldc_w 2036525312
    //   10494: ixor
    //   10495: ixor
    //   10496: lookupswitch default -> 25818, 633451092 -> 10524, 1263654096 -> 10479
    //   10524: fload #24
    //   10526: ldc_w 0.60532457
    //   10529: invokestatic floatToIntBits : (F)I
    //   10532: ldc_w 2127754893
    //   10535: ixor
    //   10536: invokestatic intBitsToFloat : (I)F
    //   10539: fcmpl
    //   10540: ifle -> 10554
    //   10543: ldc2_w -472004934
    //   10546: l2i
    //   10547: ldc_w 1993374687
    //   10550: ixor
    //   10551: goto -> 10562
    //   10554: ldc2_w 1707899447
    //   10557: l2i
    //   10558: ldc_w -255735983
    //   10561: ixor
    //   10562: ldc2_w -1949381095
    //   10565: l2i
    //   10566: ldc_w -1614910767
    //   10569: ixor
    //   10570: ixor
    //   10571: tableswitch default -> 10543, -2122507859 -> 10592, -2122507858 -> 10698
    //   10592: ldc2_w -511609378
    //   10595: l2i
    //   10596: ldc_w -511609451
    //   10599: ixor
    //   10600: ldc2_w -1757839699
    //   10603: l2i
    //   10604: ldc_w -1757839790
    //   10607: ixor
    //   10608: ldc2_w -803210400
    //   10611: l2i
    //   10612: ldc_w -803210400
    //   10615: ixor
    //   10616: ldc2_w 1052562850
    //   10619: l2i
    //   10620: ldc_w 1052562781
    //   10623: ixor
    //   10624: getstatic Perryc.c : I
    //   10627: iflt -> 10641
    //   10630: ldc2_w 921715866
    //   10633: l2i
    //   10634: ldc_w -1822852043
    //   10637: ixor
    //   10638: goto -> 10649
    //   10641: ldc2_w 1597710343
    //   10644: l2i
    //   10645: ldc_w -1493671912
    //   10648: ixor
    //   10649: ldc2_w 996331838
    //   10652: l2i
    //   10653: ldc_w 1830602463
    //   10656: ixor
    //   10657: ixor
    //   10658: lookupswitch default -> 10684, -204001458 -> 25414, 746202983 -> 10641
    //   10684: goto -> 10688
    //   10687: athrow
    //   10688: invokestatic toRGBA : (IIII)I
    //   10691: goto -> 10695
    //   10694: athrow
    //   10695: goto -> 11747
    //   10698: getstatic Perryc.c : I
    //   10701: iflt -> 10715
    //   10704: ldc2_w 1681294319
    //   10707: l2i
    //   10708: ldc_w 1628479883
    //   10711: ixor
    //   10712: goto -> 10723
    //   10715: ldc2_w -53096571
    //   10718: l2i
    //   10719: ldc_w 36060603
    //   10722: ixor
    //   10723: ldc2_w 2143765325
    //   10726: l2i
    //   10727: ldc_w 1460625533
    //   10730: ixor
    //   10731: ixor
    //   10732: lookupswitch default -> 25876, -700722930 -> 10760, 770572628 -> 10715
    //   10760: fload #24
    //   10762: ldc_w 0.36882186
    //   10765: invokestatic floatToIntBits : (F)I
    //   10768: ldc_w 2132596280
    //   10771: ixor
    //   10772: invokestatic intBitsToFloat : (I)F
    //   10775: fcmpl
    //   10776: ifle -> 10790
    //   10779: ldc2_w -1930341119
    //   10782: l2i
    //   10783: ldc_w 328968035
    //   10786: ixor
    //   10787: goto -> 10798
    //   10790: ldc2_w -1198368129
    //   10793: l2i
    //   10794: ldc_w 670607388
    //   10797: ixor
    //   10798: ldc2_w -2100619276
    //   10801: l2i
    //   10802: ldc_w -1981875842
    //   10805: ixor
    //   10806: ixor
    //   10807: tableswitch default -> 10779, -1803608856 -> 10828, -1803608855 -> 10934
    //   10828: ldc2_w 165415591
    //   10831: l2i
    //   10832: ldc_w 165415512
    //   10835: ixor
    //   10836: ldc2_w -1725187395
    //   10839: l2i
    //   10840: ldc_w -1725187518
    //   10843: ixor
    //   10844: ldc2_w 1754539050
    //   10847: l2i
    //   10848: ldc_w 1754539050
    //   10851: ixor
    //   10852: ldc2_w 558204706
    //   10855: l2i
    //   10856: ldc_w 558204893
    //   10859: ixor
    //   10860: getstatic Perryc.c : I
    //   10863: iflt -> 10877
    //   10866: ldc2_w 1350151201
    //   10869: l2i
    //   10870: ldc_w -1417952084
    //   10873: ixor
    //   10874: goto -> 10885
    //   10877: ldc2_w 2013671920
    //   10880: l2i
    //   10881: ldc_w -1797652630
    //   10884: ixor
    //   10885: ldc2_w 1605189547
    //   10888: l2i
    //   10889: ldc_w -650943248
    //   10892: ixor
    //   10893: ixor
    //   10894: lookupswitch default -> 25340, 1782683073 -> 10920, 2107388886 -> 10877
    //   10920: goto -> 10924
    //   10923: athrow
    //   10924: invokestatic toRGBA : (IIII)I
    //   10927: goto -> 10931
    //   10930: athrow
    //   10931: goto -> 11747
    //   10934: getstatic Perryc.0 : I
    //   10937: ifle -> 10951
    //   10940: ldc2_w -2009745550
    //   10943: l2i
    //   10944: ldc_w -123949733
    //   10947: ixor
    //   10948: goto -> 10959
    //   10951: ldc2_w 332271264
    //   10954: l2i
    //   10955: ldc_w -1340962057
    //   10958: ixor
    //   10959: ldc2_w -1587601528
    //   10962: l2i
    //   10963: ldc_w -1020273724
    //   10966: ixor
    //   10967: ixor
    //   10968: lookupswitch default -> 10996, -760129190 -> 10951, 316268133 -> 25822
    //   10996: fload #24
    //   10998: ldc_w 0.16273075
    //   11001: invokestatic floatToIntBits : (F)I
    //   11004: ldc_w 2136384228
    //   11007: ixor
    //   11008: invokestatic intBitsToFloat : (I)F
    //   11011: fcmpl
    //   11012: ifle -> 11026
    //   11015: ldc2_w 1894963471
    //   11018: l2i
    //   11019: ldc_w 1725794431
    //   11022: ixor
    //   11023: goto -> 11034
    //   11026: ldc2_w -460173935
    //   11029: l2i
    //   11030: ldc_w -222487328
    //   11033: ixor
    //   11034: ldc2_w 669213954
    //   11037: l2i
    //   11038: ldc_w -1245158562
    //   11041: ixor
    //   11042: ixor
    //   11043: tableswitch default -> 11015, -2080090324 -> 11064, -2080090323 -> 11170
    //   11064: ldc2_w 2074481953
    //   11067: l2i
    //   11068: ldc_w 2074482142
    //   11071: ixor
    //   11072: ldc2_w -1970712493
    //   11075: l2i
    //   11076: ldc_w -1970712421
    //   11079: ixor
    //   11080: ldc2_w 1820428947
    //   11083: l2i
    //   11084: ldc_w 1820428947
    //   11087: ixor
    //   11088: ldc2_w 1986505502
    //   11091: l2i
    //   11092: ldc_w 1986505697
    //   11095: ixor
    //   11096: getstatic Perryc.1 : I
    //   11099: ifeq -> 11113
    //   11102: ldc2_w -1605919333
    //   11105: l2i
    //   11106: ldc_w -1613665978
    //   11109: ixor
    //   11110: goto -> 11121
    //   11113: ldc2_w 23547991
    //   11116: l2i
    //   11117: ldc_w 1403525948
    //   11120: ixor
    //   11121: ldc2_w 893074556
    //   11124: l2i
    //   11125: ldc_w -1053467649
    //   11128: ixor
    //   11129: ixor
    //   11130: lookupswitch default -> 11156, -879193250 -> 25516, 1393359163 -> 11113
    //   11156: goto -> 11160
    //   11159: athrow
    //   11160: invokestatic toRGBA : (IIII)I
    //   11163: goto -> 11167
    //   11166: athrow
    //   11167: goto -> 11747
    //   11170: getstatic Perryc.1 : I
    //   11173: ifeq -> 11187
    //   11176: ldc2_w 318386738
    //   11179: l2i
    //   11180: ldc_w -400363920
    //   11183: ixor
    //   11184: goto -> 11195
    //   11187: ldc2_w -2054454051
    //   11190: l2i
    //   11191: ldc_w -1652772401
    //   11194: ixor
    //   11195: ldc2_w -405521211
    //   11198: l2i
    //   11199: ldc_w -811749642
    //   11202: ixor
    //   11203: ixor
    //   11204: lookupswitch default -> 11232, -1342275551 -> 11187, -762229135 -> 25860
    //   11232: fload #24
    //   11234: ldc_w 1.4223429
    //   11237: invokestatic floatToIntBits : (F)I
    //   11240: ldc_w 2123763541
    //   11243: ixor
    //   11244: invokestatic intBitsToFloat : (I)F
    //   11247: fcmpl
    //   11248: ifle -> 11262
    //   11251: ldc2_w 1092161728
    //   11254: l2i
    //   11255: ldc_w -983761561
    //   11258: ixor
    //   11259: goto -> 11270
    //   11262: ldc2_w 210052526
    //   11265: l2i
    //   11266: ldc_w -2000631798
    //   11269: ixor
    //   11270: ldc2_w -1550041336
    //   11273: l2i
    //   11274: ldc_w 670275826
    //   11277: ixor
    //   11278: ixor
    //   11279: tableswitch default -> 11251, 2771549 -> 11300, 2771550 -> 11406
    //   11300: ldc2_w -627482212
    //   11303: l2i
    //   11304: ldc_w -627482269
    //   11307: ixor
    //   11308: ldc2_w -1109646225
    //   11311: l2i
    //   11312: ldc_w -1109646087
    //   11315: ixor
    //   11316: ldc2_w 535352301
    //   11319: l2i
    //   11320: ldc_w 535352301
    //   11323: ixor
    //   11324: ldc2_w -88985664
    //   11327: l2i
    //   11328: ldc_w -88985793
    //   11331: ixor
    //   11332: getstatic Perryc.c : I
    //   11335: iflt -> 11349
    //   11338: ldc2_w 126109364
    //   11341: l2i
    //   11342: ldc_w -676226784
    //   11345: ixor
    //   11346: goto -> 11357
    //   11349: ldc2_w -1101268970
    //   11352: l2i
    //   11353: ldc_w 404934257
    //   11356: ixor
    //   11357: ldc2_w 596796474
    //   11360: l2i
    //   11361: ldc_w -1728241038
    //   11364: ixor
    //   11365: ixor
    //   11366: lookupswitch default -> 25520, 488009775 -> 11392, 1801099740 -> 11349
    //   11392: goto -> 11396
    //   11395: athrow
    //   11396: invokestatic toRGBA : (IIII)I
    //   11399: goto -> 11403
    //   11402: athrow
    //   11403: goto -> 11747
    //   11406: getstatic Perryc.1 : I
    //   11409: ifeq -> 11423
    //   11412: ldc2_w 59680429
    //   11415: l2i
    //   11416: ldc_w 825313280
    //   11419: ixor
    //   11420: goto -> 11431
    //   11423: ldc2_w 1868343888
    //   11426: l2i
    //   11427: ldc_w -1439303083
    //   11430: ixor
    //   11431: ldc2_w 1492337900
    //   11434: l2i
    //   11435: ldc_w 1145151756
    //   11438: ixor
    //   11439: ixor
    //   11440: lookupswitch default -> 25614, -639912475 -> 11468, 772606797 -> 11423
    //   11468: fload #24
    //   11470: ldc_w 0.14420824
    //   11473: invokestatic floatToIntBits : (F)I
    //   11476: ldc_w 2125704019
    //   11479: ixor
    //   11480: invokestatic intBitsToFloat : (I)F
    //   11483: fcmpl
    //   11484: ifle -> 11498
    //   11487: ldc2_w 487874925
    //   11490: l2i
    //   11491: ldc_w 1886270378
    //   11494: ixor
    //   11495: goto -> 11506
    //   11498: ldc2_w -722939856
    //   11501: l2i
    //   11502: ldc_w -1181580554
    //   11505: ixor
    //   11506: ldc2_w 467949570
    //   11509: l2i
    //   11510: ldc_w 277623483
    //   11513: ixor
    //   11514: ixor
    //   11515: tableswitch default -> 11487, 1712470142 -> 11536, 1712470143 -> 11642
    //   11536: ldc2_w -590424505
    //   11539: l2i
    //   11540: ldc_w -590424392
    //   11543: ixor
    //   11544: ldc2_w 1248407130
    //   11547: l2i
    //   11548: ldc_w 1248407144
    //   11551: ixor
    //   11552: ldc2_w 121425711
    //   11555: l2i
    //   11556: ldc_w 121425711
    //   11559: ixor
    //   11560: ldc2_w -1973751312
    //   11563: l2i
    //   11564: ldc_w -1973751537
    //   11567: ixor
    //   11568: getstatic Perryc.1 : I
    //   11571: ifeq -> 11585
    //   11574: ldc2_w 192012957
    //   11577: l2i
    //   11578: ldc_w -1988879993
    //   11581: ixor
    //   11582: goto -> 11593
    //   11585: ldc2_w -626766001
    //   11588: l2i
    //   11589: ldc_w 327248182
    //   11592: ixor
    //   11593: ldc2_w -253177549
    //   11596: l2i
    //   11597: ldc_w 762676187
    //   11600: ixor
    //   11601: ixor
    //   11602: lookupswitch default -> 11628, -1286191096 -> 11585, 1603840498 -> 25384
    //   11628: goto -> 11632
    //   11631: athrow
    //   11632: invokestatic toRGBA : (IIII)I
    //   11635: goto -> 11639
    //   11638: athrow
    //   11639: goto -> 11747
    //   11642: ldc2_w -34131974
    //   11645: l2i
    //   11646: ldc_w -34132219
    //   11649: ixor
    //   11650: ldc2_w 1687175015
    //   11653: l2i
    //   11654: ldc_w 1687175015
    //   11657: ixor
    //   11658: ldc2_w -76400509
    //   11661: l2i
    //   11662: ldc_w -76400509
    //   11665: ixor
    //   11666: ldc2_w -1518078716
    //   11669: l2i
    //   11670: ldc_w -1518078469
    //   11673: ixor
    //   11674: getstatic Perryc.1 : I
    //   11677: ifeq -> 11691
    //   11680: ldc2_w -570856885
    //   11683: l2i
    //   11684: ldc_w 162660088
    //   11687: ixor
    //   11688: goto -> 11699
    //   11691: ldc2_w 789298863
    //   11694: l2i
    //   11695: ldc_w -1464389500
    //   11698: ixor
    //   11699: ldc2_w -1639950138
    //   11702: l2i
    //   11703: ldc_w -1225682712
    //   11706: ixor
    //   11707: ixor
    //   11708: lookupswitch default -> 25920, -1358084603 -> 11736, -50766691 -> 11691
    //   11736: goto -> 11740
    //   11739: athrow
    //   11740: invokestatic toRGBA : (IIII)I
    //   11743: goto -> 11747
    //   11746: athrow
    //   11747: getstatic Perryc.1 : I
    //   11750: ifeq -> 11764
    //   11753: ldc2_w 530441295
    //   11756: l2i
    //   11757: ldc_w -1693248569
    //   11760: ixor
    //   11761: goto -> 11772
    //   11764: ldc2_w -478929135
    //   11767: l2i
    //   11768: ldc_w 614102271
    //   11771: ixor
    //   11772: ldc2_w -405847300
    //   11775: l2i
    //   11776: ldc_w 332816554
    //   11779: ixor
    //   11780: ixor
    //   11781: lookupswitch default -> 11808, -2109743157 -> 11764, 1888998878 -> 25526
    //   11808: istore #25
    //   11810: getstatic Perryc.0 : I
    //   11813: ifle -> 11827
    //   11816: ldc2_w 587010830
    //   11819: l2i
    //   11820: ldc_w -618277059
    //   11823: ixor
    //   11824: goto -> 11835
    //   11827: ldc2_w 345549130
    //   11830: l2i
    //   11831: ldc_w -392662435
    //   11834: ixor
    //   11835: ldc2_w 2057149138
    //   11838: l2i
    //   11839: ldc_w -1625068109
    //   11842: ixor
    //   11843: ixor
    //   11844: lookupswitch default -> 25584, 431893622 -> 11872, 476459858 -> 11827
    //   11872: aload_0
    //   11873: getstatic Perryc.0 : I
    //   11876: ifle -> 11890
    //   11879: ldc2_w 212929004
    //   11882: l2i
    //   11883: ldc_w -1496733347
    //   11886: ixor
    //   11887: goto -> 11898
    //   11890: ldc2_w 212357643
    //   11893: l2i
    //   11894: ldc_w 881127382
    //   11897: ixor
    //   11898: ldc2_w -2056370186
    //   11901: l2i
    //   11902: ldc_w 1597091660
    //   11905: ixor
    //   11906: ixor
    //   11907: lookupswitch default -> 11932, -1529363907 -> 11890, 1881622539 -> 25616
    //   11932: iload #25
    //   11934: getstatic Perryc.c : I
    //   11937: iflt -> 11951
    //   11940: ldc2_w -1117709004
    //   11943: l2i
    //   11944: ldc_w -611550969
    //   11947: ixor
    //   11948: goto -> 11959
    //   11951: ldc2_w 1174493009
    //   11954: l2i
    //   11955: ldc_w -1598140050
    //   11958: ixor
    //   11959: ldc2_w 1787735964
    //   11962: l2i
    //   11963: ldc_w -690327280
    //   11966: ixor
    //   11967: ixor
    //   11968: lookupswitch default -> 11996, -1130751394 -> 11951, -625362241 -> 25558
    //   11996: putfield startcolor1 : I
    //   11999: getstatic Perryc.0 : I
    //   12002: ifle -> 12016
    //   12005: ldc2_w -1731997740
    //   12008: l2i
    //   12009: ldc_w -38917942
    //   12012: ixor
    //   12013: goto -> 12024
    //   12016: ldc2_w 1618110240
    //   12019: l2i
    //   12020: ldc_w 1043270324
    //   12023: ixor
    //   12024: ldc2_w 1628512617
    //   12027: l2i
    //   12028: ldc_w -506585272
    //   12031: ixor
    //   12032: ixor
    //   12033: lookupswitch default -> 12060, -441263809 -> 25368, 297855546 -> 12016
    //   12060: aload_0
    //   12061: getstatic Perryc.c : I
    //   12064: iflt -> 12078
    //   12067: ldc2_w -51750935
    //   12070: l2i
    //   12071: ldc_w -501127315
    //   12074: ixor
    //   12075: goto -> 12086
    //   12078: ldc2_w -1604938720
    //   12081: l2i
    //   12082: ldc_w -177050457
    //   12085: ixor
    //   12086: ldc2_w -239822478
    //   12089: l2i
    //   12090: ldc_w 1182150953
    //   12093: ixor
    //   12094: ixor
    //   12095: lookupswitch default -> 25640, -1458988833 -> 12078, -488222500 -> 12120
    //   12120: iload #25
    //   12122: getstatic Perryc.1 : I
    //   12125: ifeq -> 12139
    //   12128: ldc2_w 2066921734
    //   12131: l2i
    //   12132: ldc_w -30356716
    //   12135: ixor
    //   12136: goto -> 12147
    //   12139: ldc2_w -935574841
    //   12142: l2i
    //   12143: ldc_w 1697799456
    //   12146: ixor
    //   12147: ldc2_w 2139872494
    //   12150: l2i
    //   12151: ldc_w 1947105236
    //   12154: ixor
    //   12155: ixor
    //   12156: lookupswitch default -> 12184, -1903699672 -> 25648, 1445817557 -> 12139
    //   12184: putfield endcolor1 : I
    //   12187: getstatic Perryc.1 : I
    //   12190: ifeq -> 12204
    //   12193: ldc2_w -1760630674
    //   12196: l2i
    //   12197: ldc_w -758564104
    //   12200: ixor
    //   12201: goto -> 12212
    //   12204: ldc2_w 385816510
    //   12207: l2i
    //   12208: ldc_w 833361629
    //   12211: ixor
    //   12212: ldc2_w 1507120195
    //   12215: l2i
    //   12216: ldc_w 425524131
    //   12219: ixor
    //   12220: ixor
    //   12221: lookupswitch default -> 25878, 89128310 -> 12204, 1742417539 -> 12248
    //   12248: aload_0
    //   12249: getstatic Perryc.0 : I
    //   12252: ifle -> 12266
    //   12255: ldc2_w 524929244
    //   12258: l2i
    //   12259: ldc_w 496053156
    //   12262: ixor
    //   12263: goto -> 12274
    //   12266: ldc2_w 59596549
    //   12269: l2i
    //   12270: ldc_w -1731439474
    //   12273: ixor
    //   12274: ldc2_w -1684996992
    //   12277: l2i
    //   12278: ldc_w -1456910947
    //   12281: ixor
    //   12282: ixor
    //   12283: lookupswitch default -> 25782, -1443317098 -> 12308, 811684453 -> 12266
    //   12308: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12311: getstatic Perryc.c : I
    //   12314: iflt -> 12328
    //   12317: ldc2_w 1805354480
    //   12320: l2i
    //   12321: ldc_w -954945379
    //   12324: ixor
    //   12325: goto -> 12336
    //   12328: ldc2_w -1444392546
    //   12331: l2i
    //   12332: ldc_w 898715025
    //   12335: ixor
    //   12336: ldc2_w -85470539
    //   12339: l2i
    //   12340: ldc_w -1937990640
    //   12343: ixor
    //   12344: ixor
    //   12345: lookupswitch default -> 12372, -636191800 -> 25844, 1642839718 -> 12328
    //   12372: goto -> 12376
    //   12375: athrow
    //   12376: invokevirtual getValue : ()Ljava/lang/Object;
    //   12379: goto -> 12383
    //   12382: athrow
    //   12383: checkcast java/lang/Boolean
    //   12386: getstatic Perryc.1 : I
    //   12389: ifeq -> 12403
    //   12392: ldc2_w -117216021
    //   12395: l2i
    //   12396: ldc_w -1055210498
    //   12399: ixor
    //   12400: goto -> 12411
    //   12403: ldc2_w -1587401704
    //   12406: l2i
    //   12407: ldc_w 1310300911
    //   12410: ixor
    //   12411: ldc2_w -1675715561
    //   12414: l2i
    //   12415: ldc_w 1107679298
    //   12418: ixor
    //   12419: ixor
    //   12420: lookupswitch default -> 25754, -436016320 -> 12403, 828437154 -> 12448
    //   12448: goto -> 12452
    //   12451: athrow
    //   12452: invokevirtual booleanValue : ()Z
    //   12455: goto -> 12459
    //   12458: athrow
    //   12459: ifeq -> 12473
    //   12462: ldc2_w -1058607324
    //   12465: l2i
    //   12466: ldc_w -981469369
    //   12469: ixor
    //   12470: goto -> 12481
    //   12473: ldc2_w 1077454835
    //   12476: l2i
    //   12477: ldc_w 1168228243
    //   12480: ixor
    //   12481: ldc2_w -1549602568
    //   12484: l2i
    //   12485: ldc_w -1635145370
    //   12488: ixor
    //   12489: ixor
    //   12490: tableswitch default -> 12462, 951206397 -> 12512, 951206398 -> 13886
    //   12512: getstatic Perryc.1 : I
    //   12515: ifeq -> 12529
    //   12518: ldc2_w 837131176
    //   12521: l2i
    //   12522: ldc_w 924283965
    //   12525: ixor
    //   12526: goto -> 12537
    //   12529: ldc2_w -1342684373
    //   12532: l2i
    //   12533: ldc_w 1834319607
    //   12536: ixor
    //   12537: ldc2_w 1217569325
    //   12540: l2i
    //   12541: ldc_w 891686906
    //   12544: ixor
    //   12545: ixor
    //   12546: lookupswitch default -> 25586, -1088843765 -> 12572, 2068202050 -> 12529
    //   12572: iload #21
    //   12574: ineg
    //   12575: ldc2_w 391193118
    //   12578: l2i
    //   12579: ldc_w 391193116
    //   12582: ixor
    //   12583: isub
    //   12584: i2d
    //   12585: getstatic Perryc.0 : I
    //   12588: ifle -> 12602
    //   12591: ldc2_w -992385657
    //   12594: l2i
    //   12595: ldc_w 1879212922
    //   12598: ixor
    //   12599: goto -> 12610
    //   12602: ldc2_w 241140077
    //   12605: l2i
    //   12606: ldc_w 1693778534
    //   12609: ixor
    //   12610: ldc2_w 1302433902
    //   12613: l2i
    //   12614: ldc_w -234402805
    //   12617: ixor
    //   12618: ixor
    //   12619: lookupswitch default -> 12644, 181841266 -> 12602, 192756376 -> 25502
    //   12644: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   12647: getstatic Perryc.c : I
    //   12650: iflt -> 12664
    //   12653: ldc2_w 2137208479
    //   12656: l2i
    //   12657: ldc_w -694867674
    //   12660: ixor
    //   12661: goto -> 12672
    //   12664: ldc2_w 1383950550
    //   12667: l2i
    //   12668: ldc_w 1916573833
    //   12671: ixor
    //   12672: ldc2_w 1952282317
    //   12675: l2i
    //   12676: ldc_w -278394784
    //   12679: ixor
    //   12680: ixor
    //   12681: lookupswitch default -> 12708, 69729825 -> 12664, 851665172 -> 25714
    //   12708: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   12711: getstatic Perryc.c : I
    //   12714: iflt -> 12728
    //   12717: ldc2_w 1615864846
    //   12720: l2i
    //   12721: ldc_w -1703079042
    //   12724: ixor
    //   12725: goto -> 12736
    //   12728: ldc2_w -1630959860
    //   12731: l2i
    //   12732: ldc_w 297568590
    //   12735: ixor
    //   12736: ldc2_w 566198974
    //   12739: l2i
    //   12740: ldc_w -1726449738
    //   12743: ixor
    //   12744: ixor
    //   12745: lookupswitch default -> 25598, 936573770 -> 12772, 1116390008 -> 12728
    //   12772: getfield field_78288_b : I
    //   12775: ldc2_w 84194226
    //   12778: l2i
    //   12779: ldc_w 84194235
    //   12782: ixor
    //   12783: isub
    //   12784: ineg
    //   12785: i2d
    //   12786: getstatic Perryc.c : I
    //   12789: iflt -> 12803
    //   12792: ldc2_w -1378445273
    //   12795: l2i
    //   12796: ldc_w 856124531
    //   12799: ixor
    //   12800: goto -> 12811
    //   12803: ldc2_w 764511230
    //   12806: l2i
    //   12807: ldc_w -1834249483
    //   12810: ixor
    //   12811: ldc2_w -1509721143
    //   12814: l2i
    //   12815: ldc_w 125824715
    //   12818: ixor
    //   12819: ixor
    //   12820: lookupswitch default -> 12848, -218893511 -> 12803, 1068327254 -> 25670
    //   12848: iload #21
    //   12850: i2f
    //   12851: ldc_w 0.86642194
    //   12854: invokestatic floatToIntBits : (F)I
    //   12857: ldc_w 2136853972
    //   12860: ixor
    //   12861: invokestatic intBitsToFloat : (I)F
    //   12864: fadd
    //   12865: getstatic Perryc.1 : I
    //   12868: ifeq -> 12882
    //   12871: ldc2_w 2141112911
    //   12874: l2i
    //   12875: ldc_w 2073794888
    //   12878: ixor
    //   12879: goto -> 12890
    //   12882: ldc2_w 2006490655
    //   12885: l2i
    //   12886: ldc_w 2048764693
    //   12889: ixor
    //   12890: ldc2_w 342596485
    //   12893: l2i
    //   12894: ldc_w 1413150159
    //   12897: ixor
    //   12898: ixor
    //   12899: lookupswitch default -> 25290, 1146371405 -> 12882, 1305762624 -> 12924
    //   12924: fload #24
    //   12926: ldc_w -0.029935716
    //   12929: invokestatic floatToIntBits : (F)I
    //   12932: ldc_w 2096446399
    //   12935: ixor
    //   12936: invokestatic intBitsToFloat : (I)F
    //   12939: fmul
    //   12940: fadd
    //   12941: f2d
    //   12942: ldc2_w 4.568086743950808
    //   12945: invokestatic doubleToLongBits : (D)J
    //   12948: ldc2_w 9217256246225812808
    //   12951: lxor
    //   12952: invokestatic longBitsToDouble : (J)D
    //   12955: getstatic Perryc.1 : I
    //   12958: ifeq -> 12972
    //   12961: ldc2_w 1135921435
    //   12964: l2i
    //   12965: ldc_w 1302793213
    //   12968: ixor
    //   12969: goto -> 12980
    //   12972: ldc2_w 438464961
    //   12975: l2i
    //   12976: ldc_w 2009497364
    //   12979: ixor
    //   12980: ldc2_w -1178901568
    //   12983: l2i
    //   12984: ldc_w -1127187838
    //   12987: ixor
    //   12988: ixor
    //   12989: lookupswitch default -> 13016, -614198114 -> 12972, 192469924 -> 25812
    //   13016: goto -> 13020
    //   13019: athrow
    //   13020: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   13023: goto -> 13027
    //   13026: athrow
    //   13027: getstatic Perryc.c : I
    //   13030: iflt -> 13044
    //   13033: ldc2_w 319078068
    //   13036: l2i
    //   13037: ldc_w 2015970749
    //   13040: ixor
    //   13041: goto -> 13052
    //   13044: ldc2_w 1076847893
    //   13047: l2i
    //   13048: ldc_w 282503950
    //   13051: ixor
    //   13052: ldc2_w 34328647
    //   13055: l2i
    //   13056: ldc_w 1739766761
    //   13059: ixor
    //   13060: ixor
    //   13061: lookupswitch default -> 13088, 244617383 -> 25702, 1105674057 -> 13044
    //   13088: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13091: getstatic Perryc.c : I
    //   13094: iflt -> 13108
    //   13097: ldc2_w 444647090
    //   13100: l2i
    //   13101: ldc_w 687758057
    //   13104: ixor
    //   13105: goto -> 13116
    //   13108: ldc2_w -1373333197
    //   13111: l2i
    //   13112: ldc_w -40039006
    //   13115: ixor
    //   13116: ldc2_w -1836647396
    //   13119: l2i
    //   13120: ldc_w -1638999323
    //   13123: ixor
    //   13124: ixor
    //   13125: lookupswitch default -> 13152, 1052162722 -> 25764, 1543906833 -> 13108
    //   13152: goto -> 13156
    //   13155: athrow
    //   13156: invokevirtual getValue : ()Ljava/lang/Object;
    //   13159: goto -> 13163
    //   13162: athrow
    //   13163: checkcast java/lang/Integer
    //   13166: getstatic Perryc.c : I
    //   13169: iflt -> 13183
    //   13172: ldc2_w 1627897940
    //   13175: l2i
    //   13176: ldc_w 434844330
    //   13179: ixor
    //   13180: goto -> 13191
    //   13183: ldc2_w -916553502
    //   13186: l2i
    //   13187: ldc_w 1808912046
    //   13190: ixor
    //   13191: ldc2_w 125846444
    //   13194: l2i
    //   13195: ldc_w 1163577259
    //   13198: ixor
    //   13199: ixor
    //   13200: lookupswitch default -> 13228, 976647929 -> 25796, 1270389846 -> 13183
    //   13228: goto -> 13232
    //   13231: athrow
    //   13232: invokevirtual intValue : ()I
    //   13235: goto -> 13239
    //   13238: athrow
    //   13239: getstatic Perryc.c : I
    //   13242: iflt -> 13256
    //   13245: ldc2_w -412433300
    //   13248: l2i
    //   13249: ldc_w 445530594
    //   13252: ixor
    //   13253: goto -> 13264
    //   13256: ldc2_w 234209661
    //   13259: l2i
    //   13260: ldc_w 355134629
    //   13263: ixor
    //   13264: ldc2_w -2045667537
    //   13267: l2i
    //   13268: ldc_w 2075612900
    //   13271: ixor
    //   13272: ixor
    //   13273: lookupswitch default -> 13300, 4342853 -> 25300, 1998493989 -> 13256
    //   13300: goto -> 13304
    //   13303: athrow
    //   13304: invokestatic rainbow : (I)Ljava/awt/Color;
    //   13307: goto -> 13311
    //   13310: athrow
    //   13311: getstatic Perryc.1 : I
    //   13314: ifeq -> 13328
    //   13317: ldc2_w 104459447
    //   13320: l2i
    //   13321: ldc_w 1521721172
    //   13324: ixor
    //   13325: goto -> 13336
    //   13328: ldc2_w -62116625
    //   13331: l2i
    //   13332: ldc_w 923489994
    //   13335: ixor
    //   13336: ldc2_w 498312635
    //   13339: l2i
    //   13340: ldc_w 1085135450
    //   13343: ixor
    //   13344: ixor
    //   13345: lookupswitch default -> 13372, 26479618 -> 25658, 890981227 -> 13328
    //   13372: goto -> 13376
    //   13375: athrow
    //   13376: invokevirtual getRGB : ()I
    //   13379: goto -> 13383
    //   13382: athrow
    //   13383: getstatic Perryc.1 : I
    //   13386: ifeq -> 13400
    //   13389: ldc2_w -779256810
    //   13392: l2i
    //   13393: ldc_w -643685777
    //   13396: ixor
    //   13397: goto -> 13408
    //   13400: ldc2_w -1363160811
    //   13403: l2i
    //   13404: ldc_w -2106204680
    //   13407: ixor
    //   13408: ldc2_w -580410705
    //   13411: l2i
    //   13412: ldc_w 1444877607
    //   13415: ixor
    //   13416: ixor
    //   13417: lookupswitch default -> 25732, -2091390479 -> 13400, -1481458843 -> 13444
    //   13444: goto -> 13448
    //   13447: athrow
    //   13448: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   13451: goto -> 13455
    //   13454: athrow
    //   13455: getstatic Perryc.c : I
    //   13458: iflt -> 13472
    //   13461: ldc2_w -688654215
    //   13464: l2i
    //   13465: ldc_w -272199306
    //   13468: ixor
    //   13469: goto -> 13480
    //   13472: ldc2_w -1963066827
    //   13475: l2i
    //   13476: ldc_w -1189565417
    //   13479: ixor
    //   13480: ldc2_w -1961545957
    //   13483: l2i
    //   13484: ldc_w -1153179878
    //   13487: ixor
    //   13488: ixor
    //   13489: lookupswitch default -> 25618, 62105123 -> 13516, 157522190 -> 13472
    //   13516: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13519: getstatic Perryc.1 : I
    //   13522: ifeq -> 13536
    //   13525: ldc2_w -1249563155
    //   13528: l2i
    //   13529: ldc_w 1114555935
    //   13532: ixor
    //   13533: goto -> 13544
    //   13536: ldc2_w -1993284725
    //   13539: l2i
    //   13540: ldc_w -196490695
    //   13543: ixor
    //   13544: ldc2_w -1456917457
    //   13547: l2i
    //   13548: ldc_w -1904553737
    //   13551: ixor
    //   13552: ixor
    //   13553: lookupswitch default -> 25478, -793243862 -> 13536, 1512754538 -> 13580
    //   13580: goto -> 13584
    //   13583: athrow
    //   13584: invokevirtual getValue : ()Ljava/lang/Object;
    //   13587: goto -> 13591
    //   13590: athrow
    //   13591: checkcast java/lang/Integer
    //   13594: getstatic Perryc.1 : I
    //   13597: ifeq -> 13611
    //   13600: ldc2_w -1472064280
    //   13603: l2i
    //   13604: ldc_w -1730088579
    //   13607: ixor
    //   13608: goto -> 13619
    //   13611: ldc2_w 284387370
    //   13614: l2i
    //   13615: ldc_w -1181284428
    //   13618: ixor
    //   13619: ldc2_w -649922858
    //   13622: l2i
    //   13623: ldc_w -786947390
    //   13626: ixor
    //   13627: ixor
    //   13628: lookupswitch default -> 13656, 955789697 -> 25650, 1751894356 -> 13611
    //   13656: goto -> 13660
    //   13659: athrow
    //   13660: invokevirtual intValue : ()I
    //   13663: goto -> 13667
    //   13666: athrow
    //   13667: getstatic Perryc.0 : I
    //   13670: ifle -> 13684
    //   13673: ldc2_w 332330406
    //   13676: l2i
    //   13677: ldc_w -1236449458
    //   13680: ixor
    //   13681: goto -> 13692
    //   13684: ldc2_w 1780149187
    //   13687: l2i
    //   13688: ldc_w 1267847673
    //   13691: ixor
    //   13692: ldc2_w 1960931549
    //   13695: l2i
    //   13696: ldc_w -1959105887
    //   13699: ixor
    //   13700: ixor
    //   13701: lookupswitch default -> 13728, 291518185 -> 13684, 1515759764 -> 25408
    //   13728: goto -> 13732
    //   13731: athrow
    //   13732: invokestatic rainbow : (I)Ljava/awt/Color;
    //   13735: goto -> 13739
    //   13738: athrow
    //   13739: getstatic Perryc.1 : I
    //   13742: ifeq -> 13756
    //   13745: ldc2_w 1455710945
    //   13748: l2i
    //   13749: ldc_w 738186272
    //   13752: ixor
    //   13753: goto -> 13764
    //   13756: ldc2_w 1008326100
    //   13759: l2i
    //   13760: ldc_w 1769621459
    //   13763: ixor
    //   13764: ldc2_w 651991517
    //   13767: l2i
    //   13768: ldc_w -938726782
    //   13771: ixor
    //   13772: ixor
    //   13773: lookupswitch default -> 13800, -1813314146 -> 25252, -170166574 -> 13756
    //   13800: goto -> 13804
    //   13803: athrow
    //   13804: invokevirtual getRGB : ()I
    //   13807: goto -> 13811
    //   13810: athrow
    //   13811: getstatic Perryc.c : I
    //   13814: iflt -> 13828
    //   13817: ldc2_w 1831734995
    //   13820: l2i
    //   13821: ldc_w 97971036
    //   13824: ixor
    //   13825: goto -> 13836
    //   13828: ldc2_w -2046418762
    //   13831: l2i
    //   13832: ldc_w -240160822
    //   13835: ixor
    //   13836: ldc2_w 1851599083
    //   13839: l2i
    //   13840: ldc_w 409771263
    //   13843: ixor
    //   13844: ixor
    //   13845: lookupswitch default -> 13872, 516510107 -> 25850, 878121558 -> 13828
    //   13872: goto -> 13876
    //   13875: athrow
    //   13876: invokestatic drawGradientSideways : (DDDDII)V
    //   13879: goto -> 13883
    //   13882: athrow
    //   13883: goto -> 14651
    //   13886: getstatic Perryc.1 : I
    //   13889: ifeq -> 13903
    //   13892: ldc2_w 1894985683
    //   13895: l2i
    //   13896: ldc_w -1573095505
    //   13899: ixor
    //   13900: goto -> 13911
    //   13903: ldc2_w -1101281544
    //   13906: l2i
    //   13907: ldc_w -897610902
    //   13910: ixor
    //   13911: ldc2_w 530769586
    //   13914: l2i
    //   13915: ldc_w 1802985497
    //   13918: ixor
    //   13919: ixor
    //   13920: lookupswitch default -> 25512, -1508188457 -> 13903, 15846201 -> 13948
    //   13948: iload #21
    //   13950: ineg
    //   13951: ldc2_w -749333970
    //   13954: l2i
    //   13955: ldc_w -749333972
    //   13958: ixor
    //   13959: isub
    //   13960: i2d
    //   13961: getstatic Perryc.1 : I
    //   13964: ifeq -> 13978
    //   13967: ldc2_w -1355405265
    //   13970: l2i
    //   13971: ldc_w 265930862
    //   13974: ixor
    //   13975: goto -> 13986
    //   13978: ldc2_w -23299366
    //   13981: l2i
    //   13982: ldc_w -2010407961
    //   13985: ixor
    //   13986: ldc2_w 84919392
    //   13989: l2i
    //   13990: ldc_w 487200950
    //   13993: ixor
    //   13994: ixor
    //   13995: lookupswitch default -> 14020, -1192608617 -> 25378, 1548913729 -> 13978
    //   14020: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   14023: getstatic Perryc.c : I
    //   14026: iflt -> 14040
    //   14029: ldc2_w -94565272
    //   14032: l2i
    //   14033: ldc_w -605799571
    //   14036: ixor
    //   14037: goto -> 14048
    //   14040: ldc2_w -1998915666
    //   14043: l2i
    //   14044: ldc_w 1379221137
    //   14047: ixor
    //   14048: ldc2_w 917176185
    //   14051: l2i
    //   14052: ldc_w -639277494
    //   14055: ixor
    //   14056: ixor
    //   14057: lookupswitch default -> 25350, -822694346 -> 14040, 899698700 -> 14084
    //   14084: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   14087: getstatic Perryc.1 : I
    //   14090: ifeq -> 14104
    //   14093: ldc2_w 973137643
    //   14096: l2i
    //   14097: ldc_w -397024736
    //   14100: ixor
    //   14101: goto -> 14112
    //   14104: ldc2_w -1514994247
    //   14107: l2i
    //   14108: ldc_w 524003605
    //   14111: ixor
    //   14112: ldc2_w 1427892678
    //   14115: l2i
    //   14116: ldc_w -1828541136
    //   14119: ixor
    //   14120: ixor
    //   14121: lookupswitch default -> 25562, 340541501 -> 14104, 2089936986 -> 14148
    //   14148: getfield field_78288_b : I
    //   14151: ldc2_w -1288411389
    //   14154: l2i
    //   14155: ldc_w -1288411382
    //   14158: ixor
    //   14159: isub
    //   14160: ineg
    //   14161: i2d
    //   14162: getstatic Perryc.1 : I
    //   14165: ifeq -> 14179
    //   14168: ldc2_w -948168957
    //   14171: l2i
    //   14172: ldc_w 1921511015
    //   14175: ixor
    //   14176: goto -> 14187
    //   14179: ldc2_w -1990472320
    //   14182: l2i
    //   14183: ldc_w 544771342
    //   14186: ixor
    //   14187: ldc2_w 285362767
    //   14190: l2i
    //   14191: ldc_w -1169530945
    //   14194: ixor
    //   14195: ixor
    //   14196: lookupswitch default -> 14224, 515107988 -> 25738, 1100371208 -> 14179
    //   14224: iload #21
    //   14226: i2f
    //   14227: ldc_w 0.15887164
    //   14230: invokestatic floatToIntBits : (F)I
    //   14233: ldc_w 2116202303
    //   14236: ixor
    //   14237: invokestatic intBitsToFloat : (I)F
    //   14240: fadd
    //   14241: getstatic Perryc.1 : I
    //   14244: ifeq -> 14258
    //   14247: ldc2_w 1249261031
    //   14250: l2i
    //   14251: ldc_w -1703148321
    //   14254: ixor
    //   14255: goto -> 14266
    //   14258: ldc2_w -93849478
    //   14261: l2i
    //   14262: ldc_w 326779913
    //   14265: ixor
    //   14266: ldc2_w -1634679806
    //   14269: l2i
    //   14270: ldc_w -783319476
    //   14273: ixor
    //   14274: ixor
    //   14275: lookupswitch default -> 25710, -1613395082 -> 14258, -1497233859 -> 14300
    //   14300: fload #24
    //   14302: ldc_w -0.07437693
    //   14305: invokestatic floatToIntBits : (F)I
    //   14308: ldc_w 2107134703
    //   14311: ixor
    //   14312: invokestatic intBitsToFloat : (I)F
    //   14315: fmul
    //   14316: fadd
    //   14317: f2d
    //   14318: ldc2_w 7.61551440530534
    //   14321: invokestatic doubleToLongBits : (D)J
    //   14324: ldc2_w 9216183745118471015
    //   14327: lxor
    //   14328: invokestatic longBitsToDouble : (J)D
    //   14331: getstatic Perryc.1 : I
    //   14334: ifeq -> 14348
    //   14337: ldc2_w -1715393668
    //   14340: l2i
    //   14341: ldc_w -839682793
    //   14344: ixor
    //   14345: goto -> 14356
    //   14348: ldc2_w -1724853031
    //   14351: l2i
    //   14352: ldc_w -1373557569
    //   14355: ixor
    //   14356: ldc2_w -50625037
    //   14359: l2i
    //   14360: ldc_w -1631063255
    //   14363: ixor
    //   14364: ixor
    //   14365: lookupswitch default -> 25744, 906897585 -> 14348, 1429049020 -> 14392
    //   14392: aload_0
    //   14393: getstatic Perryc.c : I
    //   14396: iflt -> 14410
    //   14399: ldc2_w -664857614
    //   14402: l2i
    //   14403: ldc_w -149253120
    //   14406: ixor
    //   14407: goto -> 14418
    //   14410: ldc2_w -2117634061
    //   14413: l2i
    //   14414: ldc_w -1823329394
    //   14417: ixor
    //   14418: ldc2_w 691037458
    //   14421: l2i
    //   14422: ldc_w -218367679
    //   14425: ixor
    //   14426: ixor
    //   14427: lookupswitch default -> 25898, -916531154 -> 14452, -192013407 -> 14410
    //   14452: getfield startcolor1 : I
    //   14455: getstatic Perryc.c : I
    //   14458: iflt -> 14472
    //   14461: ldc2_w 1286952144
    //   14464: l2i
    //   14465: ldc_w 1244943203
    //   14468: ixor
    //   14469: goto -> 14480
    //   14472: ldc2_w -1599841943
    //   14475: l2i
    //   14476: ldc_w 1551878226
    //   14479: ixor
    //   14480: ldc2_w 1542285584
    //   14483: l2i
    //   14484: ldc_w 1316907850
    //   14487: ixor
    //   14488: ixor
    //   14489: lookupswitch default -> 25298, -381119647 -> 14516, 319948265 -> 14472
    //   14516: aload_0
    //   14517: getstatic Perryc.c : I
    //   14520: iflt -> 14534
    //   14523: ldc2_w 1650847837
    //   14526: l2i
    //   14527: ldc_w -1818088730
    //   14530: ixor
    //   14531: goto -> 14542
    //   14534: ldc2_w 1552954423
    //   14537: l2i
    //   14538: ldc_w -2047489170
    //   14541: ixor
    //   14542: ldc2_w -402220369
    //   14545: l2i
    //   14546: ldc_w -2110752402
    //   14549: ixor
    //   14550: ixor
    //   14551: lookupswitch default -> 14576, -1678689926 -> 25380, 1338572446 -> 14534
    //   14576: getfield endcolor1 : I
    //   14579: getstatic Perryc.c : I
    //   14582: iflt -> 14596
    //   14585: ldc2_w -149167967
    //   14588: l2i
    //   14589: ldc_w -228993909
    //   14592: ixor
    //   14593: goto -> 14604
    //   14596: ldc2_w -1024233172
    //   14599: l2i
    //   14600: ldc_w 558189125
    //   14603: ixor
    //   14604: ldc2_w 1287013193
    //   14607: l2i
    //   14608: ldc_w -1101339192
    //   14611: ixor
    //   14612: ixor
    //   14613: lookupswitch default -> 14640, -594512182 -> 14596, -139554133 -> 25474
    //   14640: goto -> 14644
    //   14643: athrow
    //   14644: invokestatic drawGradientSideways : (DDDDII)V
    //   14647: goto -> 14651
    //   14650: athrow
    //   14651: getstatic Perryc.c : I
    //   14654: iflt -> 14668
    //   14657: ldc2_w 723680405
    //   14660: l2i
    //   14661: ldc_w -112622272
    //   14664: ixor
    //   14665: goto -> 14676
    //   14668: ldc2_w -1030026293
    //   14671: l2i
    //   14672: ldc_w -1711722550
    //   14675: ixor
    //   14676: ldc2_w -987090495
    //   14679: l2i
    //   14680: ldc_w -86698362
    //   14683: ixor
    //   14684: ixor
    //   14685: lookupswitch default -> 14712, -1098796264 -> 14668, -309010798 -> 25854
    //   14712: aload_0
    //   14713: getstatic Perryc.1 : I
    //   14716: ifeq -> 14730
    //   14719: ldc2_w 394764611
    //   14722: l2i
    //   14723: ldc_w -1071744612
    //   14726: ixor
    //   14727: goto -> 14738
    //   14730: ldc2_w -552727261
    //   14733: l2i
    //   14734: ldc_w 372499003
    //   14737: ixor
    //   14738: ldc2_w 1971127811
    //   14741: l2i
    //   14742: ldc_w -895477698
    //   14745: ixor
    //   14746: ixor
    //   14747: lookupswitch default -> 14772, -437720862 -> 14730, 1749337826 -> 25462
    //   14772: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14775: getstatic Perryc.c : I
    //   14778: iflt -> 14792
    //   14781: ldc2_w 282524378
    //   14784: l2i
    //   14785: ldc_w -2005244653
    //   14788: ixor
    //   14789: goto -> 14800
    //   14792: ldc2_w 1585615963
    //   14795: l2i
    //   14796: ldc_w 1060118820
    //   14799: ixor
    //   14800: ldc2_w -2143207113
    //   14803: l2i
    //   14804: ldc_w -1170321679
    //   14807: ixor
    //   14808: ixor
    //   14809: lookupswitch default -> 14836, -1563193329 -> 25450, 818197558 -> 14792
    //   14836: goto -> 14840
    //   14839: athrow
    //   14840: invokevirtual getValue : ()Ljava/lang/Object;
    //   14843: goto -> 14847
    //   14846: athrow
    //   14847: checkcast java/lang/Boolean
    //   14850: getstatic Perryc.1 : I
    //   14853: ifeq -> 14867
    //   14856: ldc2_w -798666468
    //   14859: l2i
    //   14860: ldc_w 111014074
    //   14863: ixor
    //   14864: goto -> 14875
    //   14867: ldc2_w 347466246
    //   14870: l2i
    //   14871: ldc_w 146924107
    //   14874: ixor
    //   14875: ldc2_w -213125984
    //   14878: l2i
    //   14879: ldc_w 1411756621
    //   14882: ixor
    //   14883: ixor
    //   14884: lookupswitch default -> 25398, -1155903840 -> 14912, 1905715019 -> 14867
    //   14912: goto -> 14916
    //   14915: athrow
    //   14916: invokevirtual booleanValue : ()Z
    //   14919: goto -> 14923
    //   14922: athrow
    //   14923: ifeq -> 14937
    //   14926: ldc2_w -234573822
    //   14929: l2i
    //   14930: ldc_w 1855632075
    //   14933: ixor
    //   14934: goto -> 14945
    //   14937: ldc2_w -1880468061
    //   14940: l2i
    //   14941: ldc_w 326391653
    //   14944: ixor
    //   14945: ldc2_w 216173908
    //   14948: l2i
    //   14949: ldc_w 918811786
    //   14952: ixor
    //   14953: ixor
    //   14954: tableswitch default -> 14926, -1497400553 -> 14976, -1497400552 -> 15667
    //   14976: getstatic Perryc.c : I
    //   14979: iflt -> 14993
    //   14982: ldc2_w -1846889806
    //   14985: l2i
    //   14986: ldc_w 254094368
    //   14989: ixor
    //   14990: goto -> 15001
    //   14993: ldc2_w 124773620
    //   14996: l2i
    //   14997: ldc_w -572684350
    //   15000: ixor
    //   15001: ldc2_w 1044304398
    //   15004: l2i
    //   15005: ldc_w 518741784
    //   15008: ixor
    //   15009: ixor
    //   15010: lookupswitch default -> 25656, -1105587324 -> 14993, -93852128 -> 15036
    //   15036: aload_0
    //   15037: getstatic Perryc.c : I
    //   15040: iflt -> 15054
    //   15043: ldc2_w -448742651
    //   15046: l2i
    //   15047: ldc_w -486509625
    //   15050: ixor
    //   15051: goto -> 15062
    //   15054: ldc2_w -1142246371
    //   15057: l2i
    //   15058: ldc_w 2090080138
    //   15061: ixor
    //   15062: ldc2_w -1513381398
    //   15065: l2i
    //   15066: ldc_w -348346414
    //   15069: ixor
    //   15070: ixor
    //   15071: lookupswitch default -> 15096, 669645712 -> 15054, 1220005626 -> 25564
    //   15096: iload #21
    //   15098: ineg
    //   15099: ldc2_w -1555092800
    //   15102: l2i
    //   15103: ldc_w -1555092798
    //   15106: ixor
    //   15107: isub
    //   15108: i2f
    //   15109: getstatic Perryc.1 : I
    //   15112: ifeq -> 15126
    //   15115: ldc2_w 275078047
    //   15118: l2i
    //   15119: ldc_w 453901225
    //   15122: ixor
    //   15123: goto -> 15134
    //   15126: ldc2_w -277518616
    //   15129: l2i
    //   15130: ldc_w 610555356
    //   15133: ixor
    //   15134: ldc2_w -700342708
    //   15137: l2i
    //   15138: ldc_w 905043332
    //   15141: ixor
    //   15142: ixor
    //   15143: lookupswitch default -> 25492, -388439042 -> 15126, 681668860 -> 15168
    //   15168: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags.mc : Lnet/minecraft/client/Minecraft;
    //   15171: getstatic Perryc.0 : I
    //   15174: ifle -> 15188
    //   15177: ldc2_w -45395179
    //   15180: l2i
    //   15181: ldc_w 906577599
    //   15184: ixor
    //   15185: goto -> 15196
    //   15188: ldc2_w 1039028718
    //   15191: l2i
    //   15192: ldc_w -1646214400
    //   15195: ixor
    //   15196: ldc2_w -1523639794
    //   15199: l2i
    //   15200: ldc_w -495912390
    //   15203: ixor
    //   15204: ixor
    //   15205: lookupswitch default -> 25630, -1944193634 -> 15188, -414092582 -> 15232
    //   15232: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   15235: getstatic Perryc.1 : I
    //   15238: ifeq -> 15252
    //   15241: ldc2_w 1203500846
    //   15244: l2i
    //   15245: ldc_w -640820447
    //   15248: ixor
    //   15249: goto -> 15260
    //   15252: ldc2_w 1212710942
    //   15255: l2i
    //   15256: ldc_w -1968781448
    //   15259: ixor
    //   15260: ldc2_w -44553429
    //   15263: l2i
    //   15264: ldc_w 862914321
    //   15267: ixor
    //   15268: ixor
    //   15269: lookupswitch default -> 25342, 215575388 -> 15296, 1346437173 -> 15252
    //   15296: getfield field_78288_b : I
    //   15299: ldc2_w -725695725
    //   15302: l2i
    //   15303: ldc_w -725695726
    //   15306: ixor
    //   15307: iadd
    //   15308: ineg
    //   15309: i2f
    //   15310: getstatic Perryc.0 : I
    //   15313: ifle -> 15327
    //   15316: ldc2_w -548541479
    //   15319: l2i
    //   15320: ldc_w -1501252757
    //   15323: ixor
    //   15324: goto -> 15335
    //   15327: ldc2_w 138260996
    //   15330: l2i
    //   15331: ldc_w 1501209074
    //   15334: ixor
    //   15335: ldc2_w -1646288956
    //   15338: l2i
    //   15339: ldc_w -1470810172
    //   15342: ixor
    //   15343: ixor
    //   15344: lookupswitch default -> 25352, 1279520946 -> 15327, 1691204598 -> 15372
    //   15372: iload #21
    //   15374: i2f
    //   15375: ldc_w 0.698488
    //   15378: invokestatic floatToIntBits : (F)I
    //   15381: ldc_w 2134036508
    //   15384: ixor
    //   15385: invokestatic intBitsToFloat : (I)F
    //   15388: fadd
    //   15389: ldc_w 19.755087
    //   15392: invokestatic floatToIntBits : (F)I
    //   15395: ldc_w 2120092267
    //   15398: ixor
    //   15399: invokestatic intBitsToFloat : (I)F
    //   15402: getstatic Perryc.c : I
    //   15405: iflt -> 15419
    //   15408: ldc2_w 36027019
    //   15411: l2i
    //   15412: ldc_w 1669948464
    //   15415: ixor
    //   15416: goto -> 15427
    //   15419: ldc2_w -1610874377
    //   15422: l2i
    //   15423: ldc_w -601861015
    //   15426: ixor
    //   15427: ldc2_w -1994575595
    //   15430: l2i
    //   15431: ldc_w 1619812970
    //   15434: ixor
    //   15435: ixor
    //   15436: lookupswitch default -> 25610, -2009231932 -> 15419, -1437792543 -> 15464
    //   15464: aload_0
    //   15465: getstatic Perryc.0 : I
    //   15468: ifle -> 15482
    //   15471: ldc2_w -608326362
    //   15474: l2i
    //   15475: ldc_w 177942336
    //   15478: ixor
    //   15479: goto -> 15490
    //   15482: ldc2_w -403016838
    //   15485: l2i
    //   15486: ldc_w 388260562
    //   15489: ixor
    //   15490: ldc2_w 746854287
    //   15493: l2i
    //   15494: ldc_w -1132179285
    //   15497: ixor
    //   15498: ixor
    //   15499: lookupswitch default -> 15524, -1112215123 -> 15482, 1093059906 -> 25722
    //   15524: aload_1
    //   15525: getstatic Perryc.1 : I
    //   15528: ifeq -> 15542
    //   15531: ldc2_w -839379224
    //   15534: l2i
    //   15535: ldc_w 1306939353
    //   15538: ixor
    //   15539: goto -> 15550
    //   15542: ldc2_w -1450217607
    //   15545: l2i
    //   15546: ldc_w -1676373211
    //   15549: ixor
    //   15550: ldc2_w 2105313420
    //   15553: l2i
    //   15554: ldc_w -1995122982
    //   15557: ixor
    //   15558: ixor
    //   15559: lookupswitch default -> 15584, -220714066 -> 15542, 1953892199 -> 25438
    //   15584: goto -> 15588
    //   15587: athrow
    //   15588: invokespecial getOutlineColor : (Lnet/minecraft/entity/player/EntityPlayer;)I
    //   15591: goto -> 15595
    //   15594: athrow
    //   15595: getstatic Perryc.0 : I
    //   15598: ifle -> 15612
    //   15601: ldc2_w 1317532061
    //   15604: l2i
    //   15605: ldc_w 956312221
    //   15608: ixor
    //   15609: goto -> 15620
    //   15612: ldc2_w -19813741
    //   15615: l2i
    //   15616: ldc_w 809894277
    //   15619: ixor
    //   15620: ldc2_w 1143695813
    //   15623: l2i
    //   15624: ldc_w 1744686461
    //   15627: ixor
    //   15628: ixor
    //   15629: lookupswitch default -> 25642, -314503250 -> 15656, 1414627256 -> 15612
    //   15656: goto -> 15660
    //   15659: athrow
    //   15660: invokevirtual drawOutlineRect : (FFFFI)V
    //   15663: goto -> 15667
    //   15666: athrow
    //   15667: getstatic Perryc.0 : I
    //   15670: ifle -> 15684
    //   15673: ldc2_w -747579776
    //   15676: l2i
    //   15677: ldc_w -1724978574
    //   15680: ixor
    //   15681: goto -> 15692
    //   15684: ldc2_w -2025953792
    //   15687: l2i
    //   15688: ldc_w -1189406108
    //   15691: ixor
    //   15692: ldc2_w -681469726
    //   15695: l2i
    //   15696: ldc_w -146075029
    //   15699: ixor
    //   15700: ixor
    //   15701: lookupswitch default -> 25588, 504362733 -> 15728, 1786033787 -> 15684
    //   15728: goto -> 15732
    //   15731: athrow
    //   15732: invokestatic func_179084_k : ()V
    //   15735: goto -> 15739
    //   15738: athrow
    //   15739: getstatic Perryc.1 : I
    //   15742: ifeq -> 15756
    //   15745: ldc2_w 1401641177
    //   15748: l2i
    //   15749: ldc_w 2065922669
    //   15752: ixor
    //   15753: goto -> 15764
    //   15756: ldc2_w -685109680
    //   15759: l2i
    //   15760: ldc_w -515655891
    //   15763: ixor
    //   15764: ldc2_w 1566563065
    //   15767: l2i
    //   15768: ldc_w 975906721
    //   15771: ixor
    //   15772: ixor
    //   15773: lookupswitch default -> 25766, 1339875308 -> 15756, 1360872485 -> 15800
    //   15800: aload_1
    //   15801: getstatic Perryc.0 : I
    //   15804: ifle -> 15818
    //   15807: ldc2_w -264316536
    //   15810: l2i
    //   15811: ldc_w -1307877314
    //   15814: ixor
    //   15815: goto -> 15826
    //   15818: ldc2_w 1878981515
    //   15821: l2i
    //   15822: ldc_w 976536849
    //   15825: ixor
    //   15826: ldc2_w 1505167027
    //   15829: l2i
    //   15830: ldc_w -1110169027
    //   15833: ixor
    //   15834: ixor
    //   15835: lookupswitch default -> 15860, -1504275144 -> 25672, 849539775 -> 15818
    //   15860: goto -> 15864
    //   15863: athrow
    //   15864: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   15867: goto -> 15871
    //   15870: athrow
    //   15871: getstatic Perryc.0 : I
    //   15874: ifle -> 15888
    //   15877: ldc2_w -345279498
    //   15880: l2i
    //   15881: ldc_w -365977327
    //   15884: ixor
    //   15885: goto -> 15896
    //   15888: ldc2_w 1551544989
    //   15891: l2i
    //   15892: ldc_w 1928876498
    //   15895: ixor
    //   15896: ldc2_w 76545985
    //   15899: l2i
    //   15900: ldc_w -1251305267
    //   15903: ixor
    //   15904: ixor
    //   15905: lookupswitch default -> 15932, -1331579413 -> 25730, -123189744 -> 15888
    //   15932: goto -> 15936
    //   15935: athrow
    //   15936: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
    //   15939: goto -> 15943
    //   15942: athrow
    //   15943: getstatic Perryc.0 : I
    //   15946: ifle -> 15960
    //   15949: ldc2_w 1429547359
    //   15952: l2i
    //   15953: ldc_w -190710070
    //   15956: ixor
    //   15957: goto -> 15968
    //   15960: ldc2_w -1061066103
    //   15963: l2i
    //   15964: ldc_w -874019958
    //   15967: ixor
    //   15968: ldc2_w -895981153
    //   15971: l2i
    //   15972: ldc_w 1646579249
    //   15975: ixor
    //   15976: ixor
    //   15977: lookupswitch default -> 16004, 153645115 -> 25422, 1068152338 -> 15960
    //   16004: astore #24
    //   16006: getstatic Perryc.1 : I
    //   16009: ifeq -> 16023
    //   16012: ldc2_w -455172849
    //   16015: l2i
    //   16016: ldc_w 1679771641
    //   16019: ixor
    //   16020: goto -> 16031
    //   16023: ldc2_w -1364259495
    //   16026: l2i
    //   16027: ldc_w -1325847019
    //   16030: ixor
    //   16031: ldc2_w 543540598
    //   16034: l2i
    //   16035: ldc_w 870437742
    //   16038: ixor
    //   16039: ixor
    //   16040: lookupswitch default -> 25912, -1824142098 -> 16023, 231880020 -> 16068
    //   16068: aload #24
    //   16070: getstatic Perryc.1 : I
    //   16073: ifeq -> 16087
    //   16076: ldc2_w 1859070630
    //   16079: l2i
    //   16080: ldc_w 38919338
    //   16083: ixor
    //   16084: goto -> 16095
    //   16087: ldc2_w 2141518356
    //   16090: l2i
    //   16091: ldc_w 2062794323
    //   16094: ixor
    //   16095: ldc2_w 1586209003
    //   16098: l2i
    //   16099: ldc_w 1714696349
    //   16102: ixor
    //   16103: ixor
    //   16104: lookupswitch default -> 25260, 1038668849 -> 16132, 1411475066 -> 16087
    //   16132: goto -> 16136
    //   16135: athrow
    //   16136: invokevirtual func_77962_s : ()Z
    //   16139: goto -> 16143
    //   16142: athrow
    //   16143: ifeq -> 16157
    //   16146: ldc2_w -1887582031
    //   16149: l2i
    //   16150: ldc_w -650586071
    //   16153: ixor
    //   16154: goto -> 16165
    //   16157: ldc2_w 548379617
    //   16160: l2i
    //   16161: ldc_w 1995082616
    //   16164: ixor
    //   16165: ldc2_w -1246520268
    //   16168: l2i
    //   16169: ldc_w 189660292
    //   16172: ixor
    //   16173: ixor
    //   16174: tableswitch default -> 16146, -390369240 -> 16196, -390369239 -> 16715
    //   16196: getstatic Perryc.c : I
    //   16199: iflt -> 16213
    //   16202: ldc2_w -1836120841
    //   16205: l2i
    //   16206: ldc_w 1920300001
    //   16209: ixor
    //   16210: goto -> 16221
    //   16213: ldc2_w 166356503
    //   16216: l2i
    //   16217: ldc_w -1986385072
    //   16220: ixor
    //   16221: ldc2_w 794423809
    //   16224: l2i
    //   16225: ldc_w -268577252
    //   16228: ixor
    //   16229: ixor
    //   16230: lookupswitch default -> 16256, 543052555 -> 25394, 2050971054 -> 16213
    //   16256: aload #24
    //   16258: getstatic Perryc.c : I
    //   16261: iflt -> 16275
    //   16264: ldc2_w -2040659483
    //   16267: l2i
    //   16268: ldc_w 928633371
    //   16271: ixor
    //   16272: goto -> 16283
    //   16275: ldc2_w 129759919
    //   16278: l2i
    //   16279: ldc_w -934075483
    //   16282: ixor
    //   16283: ldc2_w -1689589544
    //   16286: l2i
    //   16287: ldc_w 1300436985
    //   16290: ixor
    //   16291: ixor
    //   16292: lookupswitch default -> 25568, 421602859 -> 16320, 1741565151 -> 16275
    //   16320: goto -> 16324
    //   16323: athrow
    //   16324: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   16327: goto -> 16331
    //   16330: athrow
    //   16331: instanceof net/minecraft/item/ItemTool
    //   16334: ifne -> 16348
    //   16337: ldc2_w -1406034506
    //   16340: l2i
    //   16341: ldc_w -363958295
    //   16344: ixor
    //   16345: goto -> 16356
    //   16348: ldc2_w -437720782
    //   16351: l2i
    //   16352: ldc_w -1550378132
    //   16355: ixor
    //   16356: ldc2_w -2009712863
    //   16359: l2i
    //   16360: ldc_w 2096962958
    //   16363: ixor
    //   16364: ixor
    //   16365: tableswitch default -> 16337, -1296770832 -> 16388, -1296770831 -> 16580
    //   16388: getstatic Perryc.0 : I
    //   16391: ifle -> 16405
    //   16394: ldc2_w -1753563661
    //   16397: l2i
    //   16398: ldc_w 60844115
    //   16401: ixor
    //   16402: goto -> 16413
    //   16405: ldc2_w 26791528
    //   16408: l2i
    //   16409: ldc_w 568374116
    //   16412: ixor
    //   16413: ldc2_w 698602385
    //   16416: l2i
    //   16417: ldc_w 1333273378
    //   16420: ixor
    //   16421: ixor
    //   16422: lookupswitch default -> 16448, -1168884649 -> 16405, -234805997 -> 25784
    //   16448: aload #24
    //   16450: getstatic Perryc.0 : I
    //   16453: ifle -> 16467
    //   16456: ldc2_w 1769112238
    //   16459: l2i
    //   16460: ldc_w -299306504
    //   16463: ixor
    //   16464: goto -> 16475
    //   16467: ldc2_w 1162725956
    //   16470: l2i
    //   16471: ldc_w 402447265
    //   16474: ixor
    //   16475: ldc2_w 1122714689
    //   16478: l2i
    //   16479: ldc_w 1907171812
    //   16482: ixor
    //   16483: ixor
    //   16484: lookupswitch default -> 25508, -1273227533 -> 16467, 1643607104 -> 16512
    //   16512: goto -> 16516
    //   16515: athrow
    //   16516: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   16519: goto -> 16523
    //   16522: athrow
    //   16523: instanceof net/minecraft/item/ItemArmor
    //   16526: ifeq -> 16540
    //   16529: ldc2_w -2118324079
    //   16532: l2i
    //   16533: ldc_w -1163729934
    //   16536: ixor
    //   16537: goto -> 16548
    //   16540: ldc2_w -1182938860
    //   16543: l2i
    //   16544: ldc_w -2107385232
    //   16547: ixor
    //   16548: ldc2_w -2110148665
    //   16551: l2i
    //   16552: ldc_w -1008858441
    //   16555: ixor
    //   16556: ixor
    //   16557: tableswitch default -> 16529, 2063185427 -> 16580, 2063185428 -> 16715
    //   16580: getstatic Perryc.c : I
    //   16583: iflt -> 16597
    //   16586: ldc2_w 617252670
    //   16589: l2i
    //   16590: ldc_w 441230376
    //   16593: ixor
    //   16594: goto -> 16605
    //   16597: ldc2_w -160331531
    //   16600: l2i
    //   16601: ldc_w -1877689829
    //   16604: ixor
    //   16605: ldc2_w -2094625591
    //   16608: l2i
    //   16609: ldc_w -1271170418
    //   16612: ixor
    //   16613: ixor
    //   16614: lookupswitch default -> 25694, 161207633 -> 16597, 1366869161 -> 16640
    //   16640: aload #24
    //   16642: ldc2_w 1035756215
    //   16645: l2i
    //   16646: ldc_w 1035756214
    //   16649: ixor
    //   16650: getstatic Perryc.1 : I
    //   16653: ifeq -> 16667
    //   16656: ldc2_w -467950745
    //   16659: l2i
    //   16660: ldc_w 107590242
    //   16663: ixor
    //   16664: goto -> 16675
    //   16667: ldc2_w 1934724910
    //   16670: l2i
    //   16671: ldc_w 1538520395
    //   16674: ixor
    //   16675: ldc2_w -1768710465
    //   16678: l2i
    //   16679: ldc_w 391541850
    //   16682: ixor
    //   16683: ixor
    //   16684: lookupswitch default -> 25816, -1457024896 -> 16712, 1673001952 -> 16667
    //   16712: putfield field_77994_a : I
    //   16715: getstatic Perryc.c : I
    //   16718: iflt -> 16732
    //   16721: ldc2_w -926569123
    //   16724: l2i
    //   16725: ldc_w 727021498
    //   16728: ixor
    //   16729: goto -> 16740
    //   16732: ldc2_w 2123946799
    //   16735: l2i
    //   16736: ldc_w 272292094
    //   16739: ixor
    //   16740: ldc2_w -1435380587
    //   16743: l2i
    //   16744: ldc_w 1749235916
    //   16747: ixor
    //   16748: ixor
    //   16749: lookupswitch default -> 16776, 112545933 -> 16732, 564278974 -> 25620
    //   16776: aload_0
    //   16777: getstatic Perryc.1 : I
    //   16780: ifeq -> 16794
    //   16783: ldc2_w -1565784288
    //   16786: l2i
    //   16787: ldc_w 506775243
    //   16790: ixor
    //   16791: goto -> 16802
    //   16794: ldc2_w 315633581
    //   16797: l2i
    //   16798: ldc_w 362839138
    //   16801: ixor
    //   16802: ldc2_w 153741792
    //   16805: l2i
    //   16806: ldc_w 1153305441
    //   16809: ixor
    //   16810: ixor
    //   16811: lookupswitch default -> 16836, -250666134 -> 25664, 2105972187 -> 16794
    //   16836: getfield heldStackName : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16839: getstatic Perryc.1 : I
    //   16842: ifeq -> 16856
    //   16845: ldc2_w 1058235521
    //   16848: l2i
    //   16849: ldc_w -1713629190
    //   16852: ixor
    //   16853: goto -> 16864
    //   16856: ldc2_w 159494412
    //   16859: l2i
    //   16860: ldc_w -428300996
    //   16863: ixor
    //   16864: ldc2_w -1572799100
    //   16867: l2i
    //   16868: ldc_w -1844253220
    //   16871: ixor
    //   16872: ixor
    //   16873: lookupswitch default -> 25828, -1768070365 -> 16856, -542440344 -> 16900
    //   16900: goto -> 16904
    //   16903: athrow
    //   16904: invokevirtual getValue : ()Ljava/lang/Object;
    //   16907: goto -> 16911
    //   16910: athrow
    //   16911: checkcast java/lang/Boolean
    //   16914: getstatic Perryc.1 : I
    //   16917: ifeq -> 16931
    //   16920: ldc2_w -1333732883
    //   16923: l2i
    //   16924: ldc_w 1188357642
    //   16927: ixor
    //   16928: goto -> 16939
    //   16931: ldc2_w 1977374178
    //   16934: l2i
    //   16935: ldc_w -938721380
    //   16938: ixor
    //   16939: ldc2_w -137917503
    //   16942: l2i
    //   16943: ldc_w -2013402178
    //   16946: ixor
    //   16947: ixor
    //   16948: lookupswitch default -> 16976, -2039586920 -> 25600, 2128305987 -> 16931
    //   16976: goto -> 16980
    //   16979: athrow
    //   16980: invokevirtual booleanValue : ()Z
    //   16983: goto -> 16987
    //   16986: athrow
    //   16987: ifeq -> 17001
    //   16990: ldc2_w 357974167
    //   16993: l2i
    //   16994: ldc_w 2042184128
    //   16997: ixor
    //   16998: goto -> 17009
    //   17001: ldc2_w 915497772
    //   17004: l2i
    //   17005: ldc_w 1518232186
    //   17008: ixor
    //   17009: ldc2_w 1963829748
    //   17012: l2i
    //   17013: ldc_w -705642287
    //   17016: ixor
    //   17017: ixor
    //   17018: tableswitch default -> 16990, -871208846 -> 17040, -871208845 -> 18911
    //   17040: getstatic Perryc.1 : I
    //   17043: ifeq -> 17057
    //   17046: ldc2_w -906672482
    //   17049: l2i
    //   17050: ldc_w -613296418
    //   17053: ixor
    //   17054: goto -> 17065
    //   17057: ldc2_w -776467045
    //   17060: l2i
    //   17061: ldc_w 223348080
    //   17064: ixor
    //   17065: ldc2_w -1976164851
    //   17068: l2i
    //   17069: ldc_w -360617104
    //   17072: ixor
    //   17073: ixor
    //   17074: lookupswitch default -> 17100, 478274058 -> 17057, 1916003645 -> 25550
    //   17100: aload #24
    //   17102: getstatic Perryc.0 : I
    //   17105: ifle -> 17119
    //   17108: ldc2_w 1770977213
    //   17111: l2i
    //   17112: ldc_w 1258449436
    //   17115: ixor
    //   17116: goto -> 17127
    //   17119: ldc2_w -1629645351
    //   17122: l2i
    //   17123: ldc_w 1169709438
    //   17126: ixor
    //   17127: ldc2_w -1834405310
    //   17130: l2i
    //   17131: ldc_w -1499215607
    //   17134: ixor
    //   17135: ixor
    //   17136: lookupswitch default -> 17164, 377906922 -> 25602, 873363046 -> 17119
    //   17164: getfield field_190928_g : Z
    //   17167: ifne -> 17181
    //   17170: ldc2_w 448183749
    //   17173: l2i
    //   17174: ldc_w -1959999363
    //   17177: ixor
    //   17178: goto -> 17189
    //   17181: ldc2_w -882765227
    //   17184: l2i
    //   17185: ldc_w 1526228962
    //   17188: ixor
    //   17189: ldc2_w 148688468
    //   17192: l2i
    //   17193: ldc_w 1774048411
    //   17196: ixor
    //   17197: ixor
    //   17198: tableswitch default -> 17170, -251957385 -> 17220, -251957384 -> 18911
    //   17220: getstatic Perryc.c : I
    //   17223: iflt -> 17237
    //   17226: ldc2_w 1808555929
    //   17229: l2i
    //   17230: ldc_w 262429200
    //   17233: ixor
    //   17234: goto -> 17245
    //   17237: ldc2_w 1004871480
    //   17240: l2i
    //   17241: ldc_w -2039607116
    //   17244: ixor
    //   17245: ldc2_w -1036124386
    //   17248: l2i
    //   17249: ldc_w 2048316801
    //   17252: ixor
    //   17253: ixor
    //   17254: lookupswitch default -> 17280, -696439145 -> 17237, -599576810 -> 25338
    //   17280: aload #24
    //   17282: getstatic Perryc.1 : I
    //   17285: ifeq -> 17299
    //   17288: ldc2_w 39424441
    //   17291: l2i
    //   17292: ldc_w -850002530
    //   17295: ixor
    //   17296: goto -> 17307
    //   17299: ldc2_w -1647457363
    //   17302: l2i
    //   17303: ldc_w 1483987252
    //   17306: ixor
    //   17307: ldc2_w 934878732
    //   17310: l2i
    //   17311: ldc_w -588280341
    //   17314: ixor
    //   17315: ixor
    //   17316: lookupswitch default -> 17344, 609943488 -> 25776, 1739793478 -> 17299
    //   17344: goto -> 17348
    //   17347: athrow
    //   17348: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   17351: goto -> 17355
    //   17354: athrow
    //   17355: getstatic Perryc.0 : I
    //   17358: ifle -> 17372
    //   17361: ldc2_w 2016303394
    //   17364: l2i
    //   17365: ldc_w -1060759606
    //   17368: ixor
    //   17369: goto -> 17380
    //   17372: ldc2_w 1071474852
    //   17375: l2i
    //   17376: ldc_w -1767368132
    //   17379: ixor
    //   17380: ldc2_w -24671075
    //   17383: l2i
    //   17384: ldc_w -138219159
    //   17387: ixor
    //   17388: ixor
    //   17389: lookupswitch default -> 17416, -1641477282 -> 17372, -1314049252 -> 25498
    //   17416: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   17419: if_acmpeq -> 17433
    //   17422: ldc2_w -388728151
    //   17425: l2i
    //   17426: ldc_w -727336436
    //   17429: ixor
    //   17430: goto -> 17441
    //   17433: ldc2_w 44417227
    //   17436: l2i
    //   17437: ldc_w 1054081135
    //   17440: ixor
    //   17441: ldc2_w 2134322411
    //   17444: l2i
    //   17445: ldc_w -1536787166
    //   17448: ixor
    //   17449: ixor
    //   17450: tableswitch default -> 17422, -417296020 -> 17472, -417296019 -> 18911
    //   17472: getstatic Perryc.0 : I
    //   17475: ifle -> 17489
    //   17478: ldc2_w -1840757544
    //   17481: l2i
    //   17482: ldc_w -168217600
    //   17485: ixor
    //   17486: goto -> 17497
    //   17489: ldc2_w 779292312
    //   17492: l2i
    //   17493: ldc_w 1711350615
    //   17496: ixor
    //   17497: ldc2_w -1738329062
    //   17500: l2i
    //   17501: ldc_w -315320888
    //   17504: ixor
    //   17505: ixor
    //   17506: lookupswitch default -> 17532, 317116682 -> 25548, 1739766802 -> 17489
    //   17532: aload #24
    //   17534: getstatic Perryc.c : I
    //   17537: iflt -> 17551
    //   17540: ldc2_w 73686288
    //   17543: l2i
    //   17544: ldc_w -1989543236
    //   17547: ixor
    //   17548: goto -> 17559
    //   17551: ldc2_w -1277208147
    //   17554: l2i
    //   17555: ldc_w 1045644978
    //   17558: ixor
    //   17559: ldc2_w -1234346708
    //   17562: l2i
    //   17563: ldc_w 1728774139
    //   17566: ixor
    //   17567: ixor
    //   17568: lookupswitch default -> 17596, 1550452091 -> 25382, 1974057230 -> 17551
    //   17596: goto -> 17600
    //   17599: athrow
    //   17600: invokevirtual func_82833_r : ()Ljava/lang/String;
    //   17603: goto -> 17607
    //   17606: athrow
    //   17607: getstatic Perryc.0 : I
    //   17610: ifle -> 17624
    //   17613: ldc2_w -700112730
    //   17616: l2i
    //   17617: ldc_w -721859085
    //   17620: ixor
    //   17621: goto -> 17632
    //   17624: ldc2_w -367955587
    //   17627: l2i
    //   17628: ldc_w -875927936
    //   17631: ixor
    //   17632: ldc2_w -2006779964
    //   17635: l2i
    //   17636: ldc_w -1038933780
    //   17639: ixor
    //   17640: ixor
    //   17641: lookupswitch default -> 17668, -2040044664 -> 17624, 1221442173 -> 25660
    //   17668: astore #25
    //   17670: getstatic Perryc.c : I
    //   17673: iflt -> 17687
    //   17676: ldc2_w 972180036
    //   17679: l2i
    //   17680: ldc_w -1940797676
    //   17683: ixor
    //   17684: goto -> 17695
    //   17687: ldc2_w -765642831
    //   17690: l2i
    //   17691: ldc_w 1941572654
    //   17694: ixor
    //   17695: ldc2_w -871246111
    //   17698: l2i
    //   17699: ldc_w 1506828233
    //   17702: ixor
    //   17703: ixor
    //   17704: lookupswitch default -> 25282, 543294584 -> 17687, 874951351 -> 17732
    //   17732: aload_0
    //   17733: getstatic Perryc.0 : I
    //   17736: ifle -> 17750
    //   17739: ldc2_w 31089450
    //   17742: l2i
    //   17743: ldc_w 334924418
    //   17746: ixor
    //   17747: goto -> 17758
    //   17750: ldc2_w -52037074
    //   17753: l2i
    //   17754: ldc_w -371396326
    //   17757: ixor
    //   17758: ldc2_w 1296219942
    //   17761: l2i
    //   17762: ldc_w -1642952899
    //   17765: ixor
    //   17766: ixor
    //   17767: lookupswitch default -> 17792, -1048784461 -> 25510, 938894839 -> 17750
    //   17792: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   17795: getstatic Perryc.0 : I
    //   17798: ifle -> 17812
    //   17801: ldc2_w 432858594
    //   17804: l2i
    //   17805: ldc_w -749085153
    //   17808: ixor
    //   17809: goto -> 17820
    //   17812: ldc2_w -384588535
    //   17815: l2i
    //   17816: ldc_w 1899988366
    //   17819: ixor
    //   17820: ldc2_w -1929834581
    //   17823: l2i
    //   17824: ldc_w 897532956
    //   17827: ixor
    //   17828: ixor
    //   17829: lookupswitch default -> 17856, -249457348 -> 17812, 1930653770 -> 25690
    //   17856: aload #25
    //   17858: getstatic Perryc.c : I
    //   17861: iflt -> 17875
    //   17864: ldc2_w -1803147536
    //   17867: l2i
    //   17868: ldc_w 762204891
    //   17871: ixor
    //   17872: goto -> 17883
    //   17875: ldc2_w 1123902201
    //   17878: l2i
    //   17879: ldc_w 333360502
    //   17882: ixor
    //   17883: ldc2_w 1831148913
    //   17886: l2i
    //   17887: ldc_w -964312141
    //   17890: ixor
    //   17891: ixor
    //   17892: lookupswitch default -> 17920, -1016849586 -> 17875, 306752233 -> 25632
    //   17920: goto -> 17924
    //   17923: athrow
    //   17924: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   17927: goto -> 17931
    //   17930: athrow
    //   17931: ldc2_w -865379846
    //   17934: l2i
    //   17935: ldc_w -865379848
    //   17938: ixor
    //   17939: idiv
    //   17940: getstatic Perryc.1 : I
    //   17943: ifeq -> 17957
    //   17946: ldc2_w -457041742
    //   17949: l2i
    //   17950: ldc_w 760484195
    //   17953: ixor
    //   17954: goto -> 17965
    //   17957: ldc2_w 92528212
    //   17960: l2i
    //   17961: ldc_w 341119905
    //   17964: ixor
    //   17965: ldc2_w 1195673707
    //   17968: l2i
    //   17969: ldc_w 1734017470
    //   17972: ixor
    //   17973: ixor
    //   17974: lookupswitch default -> 25374, -376864764 -> 17957, 835273760 -> 18000
    //   18000: istore #26
    //   18002: getstatic Perryc.c : I
    //   18005: iflt -> 18019
    //   18008: ldc2_w -1761168421
    //   18011: l2i
    //   18012: ldc_w -205824831
    //   18015: ixor
    //   18016: goto -> 18027
    //   18019: ldc2_w 527850268
    //   18022: l2i
    //   18023: ldc_w -2060382696
    //   18026: ixor
    //   18027: ldc2_w -1036656413
    //   18030: l2i
    //   18031: ldc_w -134911715
    //   18034: ixor
    //   18035: ixor
    //   18036: lookupswitch default -> 18064, 320311562 -> 18019, 1367172836 -> 25674
    //   18064: goto -> 18068
    //   18067: athrow
    //   18068: invokestatic glPushMatrix : ()V
    //   18071: goto -> 18075
    //   18074: athrow
    //   18075: ldc_w 15.079112
    //   18078: invokestatic floatToIntBits : (F)I
    //   18081: ldc_w 2117157899
    //   18084: ixor
    //   18085: invokestatic intBitsToFloat : (I)F
    //   18088: ldc_w 3.376538
    //   18091: invokestatic floatToIntBits : (F)I
    //   18094: ldc_w 2132285747
    //   18097: ixor
    //   18098: invokestatic intBitsToFloat : (I)F
    //   18101: ldc_w 1.1829351E38
    //   18104: invokestatic floatToIntBits : (F)I
    //   18107: ldc_w 2125593857
    //   18110: ixor
    //   18111: invokestatic intBitsToFloat : (I)F
    //   18114: getstatic Perryc.0 : I
    //   18117: ifle -> 18131
    //   18120: ldc2_w 1449974260
    //   18123: l2i
    //   18124: ldc_w 1614147975
    //   18127: ixor
    //   18128: goto -> 18139
    //   18131: ldc2_w 473552584
    //   18134: l2i
    //   18135: ldc_w -357257795
    //   18138: ixor
    //   18139: ldc2_w -590216671
    //   18142: l2i
    //   18143: ldc_w -193222524
    //   18146: ixor
    //   18147: ixor
    //   18148: lookupswitch default -> 18176, -1391915773 -> 18131, 519078614 -> 25376
    //   18176: goto -> 18180
    //   18179: athrow
    //   18180: invokestatic glScalef : (FFF)V
    //   18183: goto -> 18187
    //   18186: athrow
    //   18187: getstatic Perryc.0 : I
    //   18190: ifle -> 18204
    //   18193: ldc2_w -88908744
    //   18196: l2i
    //   18197: ldc_w -378088675
    //   18200: ixor
    //   18201: goto -> 18212
    //   18204: ldc2_w -40258011
    //   18207: l2i
    //   18208: ldc_w 201748251
    //   18211: ixor
    //   18212: ldc2_w -514067854
    //   18215: l2i
    //   18216: ldc_w 396352388
    //   18219: ixor
    //   18220: ixor
    //   18221: lookupswitch default -> 18248, -1866567905 -> 18204, -452876589 -> 25902
    //   18248: aload_0
    //   18249: getstatic Perryc.1 : I
    //   18252: ifeq -> 18266
    //   18255: ldc2_w 1361183696
    //   18258: l2i
    //   18259: ldc_w 1709984830
    //   18262: ixor
    //   18263: goto -> 18274
    //   18266: ldc2_w 2128753211
    //   18269: l2i
    //   18270: ldc_w -250229765
    //   18273: ixor
    //   18274: ldc2_w 1511906312
    //   18277: l2i
    //   18278: ldc_w -1031617251
    //   18281: ixor
    //   18282: ixor
    //   18283: lookupswitch default -> 18308, -1403955461 -> 25720, 1020665966 -> 18266
    //   18308: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   18311: getstatic Perryc.0 : I
    //   18314: ifle -> 18328
    //   18317: ldc2_w 1928255619
    //   18320: l2i
    //   18321: ldc_w 343528610
    //   18324: ixor
    //   18325: goto -> 18336
    //   18328: ldc2_w 1959786599
    //   18331: l2i
    //   18332: ldc_w 1060081998
    //   18335: ixor
    //   18336: ldc2_w -1914458275
    //   18339: l2i
    //   18340: ldc_w -1391259362
    //   18343: ixor
    //   18344: ixor
    //   18345: lookupswitch default -> 18372, 57215303 -> 18328, 1181200994 -> 25434
    //   18372: aload #25
    //   18374: getstatic Perryc.1 : I
    //   18377: ifeq -> 18391
    //   18380: ldc2_w -1680464894
    //   18383: l2i
    //   18384: ldc_w -2108159616
    //   18387: ixor
    //   18388: goto -> 18399
    //   18391: ldc2_w 1188934122
    //   18394: l2i
    //   18395: ldc_w 1288347665
    //   18398: ixor
    //   18399: ldc2_w -162560963
    //   18402: l2i
    //   18403: ldc_w 1521576589
    //   18406: ixor
    //   18407: ixor
    //   18408: lookupswitch default -> 18436, -1933243242 -> 18391, -1250901198 -> 25546
    //   18436: iload #26
    //   18438: ineg
    //   18439: i2f
    //   18440: getstatic Perryc.0 : I
    //   18443: ifle -> 18457
    //   18446: ldc2_w -1640749026
    //   18449: l2i
    //   18450: ldc_w -189013638
    //   18453: ixor
    //   18454: goto -> 18465
    //   18457: ldc2_w 173369562
    //   18460: l2i
    //   18461: ldc_w 209737108
    //   18464: ixor
    //   18465: ldc2_w -2083966774
    //   18468: l2i
    //   18469: ldc_w 1836810848
    //   18472: ixor
    //   18473: ixor
    //   18474: lookupswitch default -> 25410, -2076345394 -> 18457, -395866140 -> 18500
    //   18500: aload_0
    //   18501: getstatic Perryc.0 : I
    //   18504: ifle -> 18518
    //   18507: ldc2_w 685486557
    //   18510: l2i
    //   18511: ldc_w 49570252
    //   18514: ixor
    //   18515: goto -> 18526
    //   18518: ldc2_w 1999707251
    //   18521: l2i
    //   18522: ldc_w -337493264
    //   18525: ixor
    //   18526: ldc2_w -50020526
    //   18529: l2i
    //   18530: ldc_w 234322778
    //   18533: ixor
    //   18534: ixor
    //   18535: lookupswitch default -> 18560, -623111143 -> 25814, -254530457 -> 18518
    //   18560: aload_1
    //   18561: getstatic Perryc.0 : I
    //   18564: ifle -> 18578
    //   18567: ldc2_w 253417305
    //   18570: l2i
    //   18571: ldc_w -622847586
    //   18574: ixor
    //   18575: goto -> 18586
    //   18578: ldc2_w 594257919
    //   18581: l2i
    //   18582: ldc_w 1430195070
    //   18585: ixor
    //   18586: ldc2_w -223511648
    //   18589: l2i
    //   18590: ldc_w 1713276640
    //   18593: ixor
    //   18594: ixor
    //   18595: lookupswitch default -> 18620, 589774841 -> 18578, 1095316359 -> 25826
    //   18620: goto -> 18624
    //   18623: athrow
    //   18624: invokespecial getBiggestArmorTag : (Lnet/minecraft/entity/player/EntityPlayer;)F
    //   18627: goto -> 18631
    //   18630: athrow
    //   18631: ldc_w 0.39016283
    //   18634: invokestatic floatToIntBits : (F)I
    //   18637: ldc_w 2137506668
    //   18640: ixor
    //   18641: invokestatic intBitsToFloat : (I)F
    //   18644: fadd
    //   18645: fneg
    //   18646: ldc2_w -1508887799
    //   18649: l2i
    //   18650: ldc_w 1508887798
    //   18653: ixor
    //   18654: getstatic Perryc.1 : I
    //   18657: ifeq -> 18671
    //   18660: ldc2_w -820888947
    //   18663: l2i
    //   18664: ldc_w -1595057248
    //   18667: ixor
    //   18668: goto -> 18679
    //   18671: ldc2_w -51288448
    //   18674: l2i
    //   18675: ldc_w -400681296
    //   18678: ixor
    //   18679: ldc2_w -1388154642
    //   18682: l2i
    //   18683: ldc_w 854435876
    //   18686: ixor
    //   18687: ixor
    //   18688: lookupswitch default -> 25830, -1958696710 -> 18716, -263144985 -> 18671
    //   18716: goto -> 18720
    //   18719: athrow
    //   18720: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   18723: goto -> 18727
    //   18726: athrow
    //   18727: ldc_w 18.22891
    //   18730: invokestatic floatToIntBits : (F)I
    //   18733: ldc_w 2119292111
    //   18736: ixor
    //   18737: invokestatic intBitsToFloat : (I)F
    //   18740: ldc_w 15.076978
    //   18743: invokestatic floatToIntBits : (F)I
    //   18746: ldc_w 2125544269
    //   18749: ixor
    //   18750: invokestatic intBitsToFloat : (I)F
    //   18753: ldc_w 5.3816524
    //   18756: invokestatic floatToIntBits : (F)I
    //   18759: ldc_w 2133603967
    //   18762: ixor
    //   18763: invokestatic intBitsToFloat : (I)F
    //   18766: getstatic Perryc.1 : I
    //   18769: ifeq -> 18783
    //   18772: ldc2_w 988117800
    //   18775: l2i
    //   18776: ldc_w 332635306
    //   18779: ixor
    //   18780: goto -> 18791
    //   18783: ldc2_w 1324317210
    //   18786: l2i
    //   18787: ldc_w 634365858
    //   18790: ixor
    //   18791: ldc2_w -602692710
    //   18794: l2i
    //   18795: ldc_w -1091090481
    //   18798: ixor
    //   18799: ixor
    //   18800: lookupswitch default -> 25486, 163854829 -> 18828, 1272054743 -> 18783
    //   18828: goto -> 18832
    //   18831: athrow
    //   18832: invokestatic glScalef : (FFF)V
    //   18835: goto -> 18839
    //   18838: athrow
    //   18839: getstatic Perryc.0 : I
    //   18842: ifle -> 18856
    //   18845: ldc2_w -397537334
    //   18848: l2i
    //   18849: ldc_w 1362051787
    //   18852: ixor
    //   18853: goto -> 18864
    //   18856: ldc2_w 716948364
    //   18859: l2i
    //   18860: ldc_w 219714981
    //   18863: ixor
    //   18864: ldc2_w 1052017294
    //   18867: l2i
    //   18868: ldc_w 1838561119
    //   18871: ixor
    //   18872: ixor
    //   18873: lookupswitch default -> 25758, -364644144 -> 18856, 1954669560 -> 18900
    //   18900: goto -> 18904
    //   18903: athrow
    //   18904: invokestatic glPopMatrix : ()V
    //   18907: goto -> 18911
    //   18910: athrow
    //   18911: getstatic Perryc.0 : I
    //   18914: ifle -> 18928
    //   18917: ldc2_w -484212540
    //   18920: l2i
    //   18921: ldc_w -1368906531
    //   18924: ixor
    //   18925: goto -> 18936
    //   18928: ldc2_w 469943512
    //   18931: l2i
    //   18932: ldc_w 378372064
    //   18935: ixor
    //   18936: ldc2_w 1704714389
    //   18939: l2i
    //   18940: ldc_w 694460534
    //   18943: ixor
    //   18944: ixor
    //   18945: lookupswitch default -> 25306, 28632314 -> 18928, 1181809627 -> 18972
    //   18972: aload_0
    //   18973: getstatic Perryc.0 : I
    //   18976: ifle -> 18990
    //   18979: ldc2_w -1255615774
    //   18982: l2i
    //   18983: ldc_w 896840305
    //   18986: ixor
    //   18987: goto -> 18998
    //   18990: ldc2_w -465541396
    //   18993: l2i
    //   18994: ldc_w -440108147
    //   18997: ixor
    //   18998: ldc2_w -1010014763
    //   19001: l2i
    //   19002: ldc_w 841971475
    //   19005: ixor
    //   19006: ixor
    //   19007: lookupswitch default -> 19032, 1865168189 -> 18990, 1908372053 -> 25802
    //   19032: getfield armor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19035: getstatic Perryc.1 : I
    //   19038: ifeq -> 19052
    //   19041: ldc2_w -1473100810
    //   19044: l2i
    //   19045: ldc_w -126719336
    //   19048: ixor
    //   19049: goto -> 19060
    //   19052: ldc2_w 342374086
    //   19055: l2i
    //   19056: ldc_w -736173474
    //   19059: ixor
    //   19060: ldc2_w -67286527
    //   19063: l2i
    //   19064: ldc_w -1357956962
    //   19067: ixor
    //   19068: ixor
    //   19069: lookupswitch default -> 19096, 78797809 -> 25792, 1375367540 -> 19052
    //   19096: goto -> 19100
    //   19099: athrow
    //   19100: invokevirtual getValue : ()Ljava/lang/Object;
    //   19103: goto -> 19107
    //   19106: athrow
    //   19107: checkcast java/lang/Boolean
    //   19110: getstatic Perryc.c : I
    //   19113: iflt -> 19127
    //   19116: ldc2_w 2080568381
    //   19119: l2i
    //   19120: ldc_w 920221151
    //   19123: ixor
    //   19124: goto -> 19135
    //   19127: ldc2_w -2103881983
    //   19130: l2i
    //   19131: ldc_w -996620358
    //   19134: ixor
    //   19135: ldc2_w 637750251
    //   19138: l2i
    //   19139: ldc_w 968127913
    //   19142: ixor
    //   19143: ixor
    //   19144: lookupswitch default -> 19172, -610587774 -> 19127, 1433190304 -> 25308
    //   19172: goto -> 19176
    //   19175: athrow
    //   19176: invokevirtual booleanValue : ()Z
    //   19179: goto -> 19183
    //   19182: athrow
    //   19183: ifeq -> 19197
    //   19186: ldc2_w -1210715411
    //   19189: l2i
    //   19190: ldc_w 1555107200
    //   19193: ixor
    //   19194: goto -> 19205
    //   19197: ldc2_w -364117244
    //   19200: l2i
    //   19201: ldc_w 19463272
    //   19204: ixor
    //   19205: ldc2_w 1742613348
    //   19208: l2i
    //   19209: ldc_w -485606203
    //   19212: ixor
    //   19213: ixor
    //   19214: tableswitch default -> 19186, 1874127052 -> 19236, 1874127053 -> 23563
    //   19236: getstatic Perryc.c : I
    //   19239: iflt -> 19253
    //   19242: ldc2_w -1318692743
    //   19245: l2i
    //   19246: ldc_w -1268123381
    //   19249: ixor
    //   19250: goto -> 19261
    //   19253: ldc2_w 346645661
    //   19256: l2i
    //   19257: ldc_w 1701893367
    //   19260: ixor
    //   19261: ldc2_w -104363446
    //   19264: l2i
    //   19265: ldc_w 1799925292
    //   19268: ixor
    //   19269: ixor
    //   19270: lookupswitch default -> 25488, -1753185004 -> 19253, -480865268 -> 19296
    //   19296: goto -> 19300
    //   19299: athrow
    //   19300: invokestatic func_179094_E : ()V
    //   19303: goto -> 19307
    //   19306: athrow
    //   19307: ldc2_w 1556842253
    //   19310: l2i
    //   19311: ldc_w -1556842249
    //   19314: ixor
    //   19315: getstatic Perryc.1 : I
    //   19318: ifeq -> 19332
    //   19321: ldc2_w -904816684
    //   19324: l2i
    //   19325: ldc_w 1320427298
    //   19328: ixor
    //   19329: goto -> 19340
    //   19332: ldc2_w -1514699914
    //   19335: l2i
    //   19336: ldc_w -1589198415
    //   19339: ixor
    //   19340: ldc2_w 510868733
    //   19343: l2i
    //   19344: ldc_w 1858017386
    //   19347: ixor
    //   19348: ixor
    //   19349: lookupswitch default -> 25532, -194401183 -> 19332, 1950180944 -> 19376
    //   19376: istore #25
    //   19378: ldc2_w -1282608459
    //   19381: l2i
    //   19382: ldc_w -1282608459
    //   19385: ixor
    //   19386: getstatic Perryc.0 : I
    //   19389: ifle -> 19403
    //   19392: ldc2_w -221339979
    //   19395: l2i
    //   19396: ldc_w -468550475
    //   19399: ixor
    //   19400: goto -> 19411
    //   19403: ldc2_w -62685762
    //   19406: l2i
    //   19407: ldc_w -538889479
    //   19410: ixor
    //   19411: ldc2_w -439934172
    //   19414: l2i
    //   19415: ldc_w 1867650214
    //   19418: ixor
    //   19419: ixor
    //   19420: lookupswitch default -> 19448, -1672882814 -> 25274, 1424071678 -> 19403
    //   19448: istore #26
    //   19450: getstatic Perryc.0 : I
    //   19453: ifle -> 19467
    //   19456: ldc2_w 1134189664
    //   19459: l2i
    //   19460: ldc_w 2112543679
    //   19463: ixor
    //   19464: goto -> 19475
    //   19467: ldc2_w -1168254111
    //   19470: l2i
    //   19471: ldc_w 19839575
    //   19474: ixor
    //   19475: ldc2_w 1427720325
    //   19478: l2i
    //   19479: ldc_w 1382077004
    //   19482: ixor
    //   19483: ixor
    //   19484: lookupswitch default -> 19512, -1495525054 -> 19467, 956898582 -> 25856
    //   19512: aload_1
    //   19513: getstatic Perryc.1 : I
    //   19516: ifeq -> 19530
    //   19519: ldc2_w -933297824
    //   19522: l2i
    //   19523: ldc_w 1220405765
    //   19526: ixor
    //   19527: goto -> 19538
    //   19530: ldc2_w 2002860845
    //   19533: l2i
    //   19534: ldc_w -1320224911
    //   19537: ixor
    //   19538: ldc2_w -1248248496
    //   19541: l2i
    //   19542: ldc_w -1605745037
    //   19545: ixor
    //   19546: ixor
    //   19547: lookupswitch default -> 25770, -1791913914 -> 19530, -738412673 -> 19572
    //   19572: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   19575: getstatic Perryc.0 : I
    //   19578: ifle -> 19592
    //   19581: ldc2_w -807693545
    //   19584: l2i
    //   19585: ldc_w 1224886456
    //   19588: ixor
    //   19589: goto -> 19600
    //   19592: ldc2_w -2118814112
    //   19595: l2i
    //   19596: ldc_w -1402423430
    //   19599: ixor
    //   19600: ldc2_w 745468161
    //   19603: l2i
    //   19604: ldc_w -1084769463
    //   19607: ixor
    //   19608: ixor
    //   19609: lookupswitch default -> 25370, -1092318382 -> 19636, 367038951 -> 19592
    //   19636: getfield field_70460_b : Lnet/minecraft/util/NonNullList;
    //   19639: getstatic Perryc.1 : I
    //   19642: ifeq -> 19656
    //   19645: ldc2_w 1521170511
    //   19648: l2i
    //   19649: ldc_w -1682540668
    //   19652: ixor
    //   19653: goto -> 19664
    //   19656: ldc2_w -1932993331
    //   19659: l2i
    //   19660: ldc_w -1651501634
    //   19663: ixor
    //   19664: ldc2_w -1569631863
    //   19667: l2i
    //   19668: ldc_w -1274453476
    //   19671: ixor
    //   19672: ixor
    //   19673: lookupswitch default -> 25734, -681214882 -> 19656, 119601894 -> 19700
    //   19700: goto -> 19704
    //   19703: athrow
    //   19704: invokevirtual iterator : ()Ljava/util/Iterator;
    //   19707: goto -> 19711
    //   19710: athrow
    //   19711: getstatic Perryc.c : I
    //   19714: iflt -> 19728
    //   19717: ldc2_w 568464461
    //   19720: l2i
    //   19721: ldc_w -267243132
    //   19724: ixor
    //   19725: goto -> 19736
    //   19728: ldc2_w -1774867556
    //   19731: l2i
    //   19732: ldc_w 128044077
    //   19735: ixor
    //   19736: ldc2_w -1942651500
    //   19739: l2i
    //   19740: ldc_w 560229677
    //   19743: ixor
    //   19744: ixor
    //   19745: lookupswitch default -> 25448, 1019574024 -> 19772, 2090939760 -> 19728
    //   19772: astore #27
    //   19774: getstatic Perryc.0 : I
    //   19777: ifle -> 19791
    //   19780: ldc2_w 1153370658
    //   19783: l2i
    //   19784: ldc_w -883205359
    //   19787: ixor
    //   19788: goto -> 19799
    //   19791: ldc2_w -2125812141
    //   19794: l2i
    //   19795: ldc_w -2121993935
    //   19798: ixor
    //   19799: ldc2_w -226664552
    //   19802: l2i
    //   19803: ldc_w 2112217732
    //   19806: ixor
    //   19807: ixor
    //   19808: lookupswitch default -> 19836, -595246120 -> 19791, 8186927 -> 25500
    //   19836: aload #27
    //   19838: getstatic Perryc.1 : I
    //   19841: ifeq -> 19855
    //   19844: ldc2_w -1055311417
    //   19847: l2i
    //   19848: ldc_w -932225635
    //   19851: ixor
    //   19852: goto -> 19863
    //   19855: ldc2_w 1688758298
    //   19858: l2i
    //   19859: ldc_w -1090533467
    //   19862: ixor
    //   19863: ldc2_w 221178728
    //   19866: l2i
    //   19867: ldc_w -161980774
    //   19870: ixor
    //   19871: ixor
    //   19872: lookupswitch default -> 25762, -234827352 -> 19855, 555817549 -> 19900
    //   19900: goto -> 19904
    //   19903: athrow
    //   19904: invokeinterface hasNext : ()Z
    //   19909: goto -> 19913
    //   19912: athrow
    //   19913: ifeq -> 19927
    //   19916: ldc2_w -1163427863
    //   19919: l2i
    //   19920: ldc_w 1612758438
    //   19923: ixor
    //   19924: goto -> 19935
    //   19927: ldc2_w -1709956628
    //   19930: l2i
    //   19931: ldc_w 1083433890
    //   19934: ixor
    //   19935: ldc2_w -851558046
    //   19938: l2i
    //   19939: ldc_w -1890904759
    //   19942: ixor
    //   19943: ixor
    //   19944: tableswitch default -> 19916, -1728932252 -> 19968, -1728932251 -> 20550
    //   19968: getstatic Perryc.1 : I
    //   19971: ifeq -> 19985
    //   19974: ldc2_w -954928913
    //   19977: l2i
    //   19978: ldc_w 530651789
    //   19981: ixor
    //   19982: goto -> 19993
    //   19985: ldc2_w 447758940
    //   19988: l2i
    //   19989: ldc_w -215114826
    //   19992: ixor
    //   19993: ldc2_w 91406623
    //   19996: l2i
    //   19997: ldc_w -2131442735
    //   20000: ixor
    //   20001: ixor
    //   20002: lookupswitch default -> 25798, 1563682988 -> 19985, 1813764900 -> 20028
    //   20028: aload #27
    //   20030: getstatic Perryc.0 : I
    //   20033: ifle -> 20047
    //   20036: ldc2_w -209502315
    //   20039: l2i
    //   20040: ldc_w -47757007
    //   20043: ixor
    //   20044: goto -> 20055
    //   20047: ldc2_w -449779753
    //   20050: l2i
    //   20051: ldc_w -1960983569
    //   20054: ixor
    //   20055: ldc2_w -1404828739
    //   20058: l2i
    //   20059: ldc_w -1830650134
    //   20062: ixor
    //   20063: ixor
    //   20064: lookupswitch default -> 20092, -1312366817 -> 20047, 805440499 -> 25294
    //   20092: goto -> 20096
    //   20095: athrow
    //   20096: invokeinterface next : ()Ljava/lang/Object;
    //   20101: goto -> 20105
    //   20104: athrow
    //   20105: checkcast net/minecraft/item/ItemStack
    //   20108: getstatic Perryc.c : I
    //   20111: iflt -> 20125
    //   20114: ldc2_w 681861681
    //   20117: l2i
    //   20118: ldc_w -2088626
    //   20121: ixor
    //   20122: goto -> 20133
    //   20125: ldc2_w 507899248
    //   20128: l2i
    //   20129: ldc_w 1027944588
    //   20132: ixor
    //   20133: ldc2_w -1286202357
    //   20136: l2i
    //   20137: ldc_w 330771722
    //   20140: ixor
    //   20141: ixor
    //   20142: lookupswitch default -> 25708, -2082345731 -> 20168, 2007331454 -> 20125
    //   20168: astore #28
    //   20170: getstatic Perryc.c : I
    //   20173: iflt -> 20187
    //   20176: ldc2_w -1601131829
    //   20179: l2i
    //   20180: ldc_w -1672349608
    //   20183: ixor
    //   20184: goto -> 20195
    //   20187: ldc2_w 26618345
    //   20190: l2i
    //   20191: ldc_w 1388027347
    //   20194: ixor
    //   20195: ldc2_w -505290440
    //   20198: l2i
    //   20199: ldc_w -171902812
    //   20202: ixor
    //   20203: ixor
    //   20204: lookupswitch default -> 20232, 198137398 -> 20187, 685787919 -> 25480
    //   20232: aload #28
    //   20234: ifnull -> 20248
    //   20237: ldc2_w 336171801
    //   20240: l2i
    //   20241: ldc_w -1885857707
    //   20244: ixor
    //   20245: goto -> 20256
    //   20248: ldc2_w 1432115067
    //   20251: l2i
    //   20252: ldc_w -825369546
    //   20255: ixor
    //   20256: ldc2_w 551922560
    //   20259: l2i
    //   20260: ldc_w 1335089724
    //   20263: ixor
    //   20264: ixor
    //   20265: tableswitch default -> 20237, -186123536 -> 20288, -186123535 -> 20547
    //   20288: iinc #25, -8
    //   20291: getstatic Perryc.0 : I
    //   20294: ifle -> 20308
    //   20297: ldc2_w 924512785
    //   20300: l2i
    //   20301: ldc_w 13043722
    //   20304: ixor
    //   20305: goto -> 20316
    //   20308: ldc2_w 891094405
    //   20311: l2i
    //   20312: ldc_w -783736086
    //   20315: ixor
    //   20316: ldc2_w 1299967147
    //   20319: l2i
    //   20320: ldc_w 1620764759
    //   20323: ixor
    //   20324: ixor
    //   20325: lookupswitch default -> 20352, 440205031 -> 25314, 468632603 -> 20308
    //   20352: aload #28
    //   20354: getstatic Perryc.1 : I
    //   20357: ifeq -> 20371
    //   20360: ldc2_w -6036072
    //   20363: l2i
    //   20364: ldc_w 1515579181
    //   20367: ixor
    //   20368: goto -> 20379
    //   20371: ldc2_w 244027269
    //   20374: l2i
    //   20375: ldc_w -1978009377
    //   20378: ixor
    //   20379: ldc2_w -1308820325
    //   20382: l2i
    //   20383: ldc_w 367610805
    //   20386: ixor
    //   20387: ixor
    //   20388: lookupswitch default -> 25756, 31700379 -> 20371, 545767540 -> 20416
    //   20416: goto -> 20420
    //   20419: athrow
    //   20420: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   20423: goto -> 20427
    //   20426: athrow
    //   20427: getstatic Perryc.0 : I
    //   20430: ifle -> 20444
    //   20433: ldc2_w -2124175681
    //   20436: l2i
    //   20437: ldc_w -1995422927
    //   20440: ixor
    //   20441: goto -> 20452
    //   20444: ldc2_w -1343129729
    //   20447: l2i
    //   20448: ldc_w 170081912
    //   20451: ixor
    //   20452: ldc2_w -1126924400
    //   20455: l2i
    //   20456: ldc_w 2050395365
    //   20459: ixor
    //   20460: ixor
    //   20461: lookupswitch default -> 25286, -829352197 -> 20444, 1664137842 -> 20488
    //   20488: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   20491: if_acmpeq -> 20505
    //   20494: ldc2_w 920551264
    //   20497: l2i
    //   20498: ldc_w -996424699
    //   20501: ixor
    //   20502: goto -> 20513
    //   20505: ldc2_w -1092220064
    //   20508: l2i
    //   20509: ldc_w 1285795846
    //   20512: ixor
    //   20513: ldc2_w -1659293020
    //   20516: l2i
    //   20517: ldc_w 1350430228
    //   20520: ixor
    //   20521: ixor
    //   20522: tableswitch default -> 20494, 1059153877 -> 20544, 1059153878 -> 20547
    //   20544: iinc #26, 1
    //   20547: goto -> 19774
    //   20550: iinc #25, -8
    //   20553: getstatic Perryc.0 : I
    //   20556: ifle -> 20570
    //   20559: ldc2_w -1876417216
    //   20562: l2i
    //   20563: ldc_w -442124374
    //   20566: ixor
    //   20567: goto -> 20578
    //   20570: ldc2_w -588422206
    //   20573: l2i
    //   20574: ldc_w -961297197
    //   20577: ixor
    //   20578: ldc2_w 1990928082
    //   20581: l2i
    //   20582: ldc_w -342396780
    //   20585: ixor
    //   20586: ixor
    //   20587: lookupswitch default -> 25494, -2023558825 -> 20612, -391002964 -> 20570
    //   20612: aload_1
    //   20613: getstatic Perryc.c : I
    //   20616: iflt -> 20630
    //   20619: ldc2_w 1524920760
    //   20622: l2i
    //   20623: ldc_w 1145600304
    //   20626: ixor
    //   20627: goto -> 20638
    //   20630: ldc2_w -2009745092
    //   20633: l2i
    //   20634: ldc_w 2084289887
    //   20637: ixor
    //   20638: ldc2_w 1017708685
    //   20641: l2i
    //   20642: ldc_w 1903398300
    //   20645: ixor
    //   20646: ixor
    //   20647: lookupswitch default -> 20672, 705779531 -> 20630, 1400276377 -> 25528
    //   20672: goto -> 20676
    //   20675: athrow
    //   20676: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   20679: goto -> 20683
    //   20682: athrow
    //   20683: getstatic Perryc.c : I
    //   20686: iflt -> 20700
    //   20689: ldc2_w -1006328710
    //   20692: l2i
    //   20693: ldc_w -2096878196
    //   20696: ixor
    //   20697: goto -> 20708
    //   20700: ldc2_w 935988795
    //   20703: l2i
    //   20704: ldc_w -133794811
    //   20707: ixor
    //   20708: ldc2_w 540985984
    //   20711: l2i
    //   20712: ldc_w -947350469
    //   20715: ixor
    //   20716: ixor
    //   20717: lookupswitch default -> 20744, -1598630067 -> 25594, 2111031111 -> 20700
    //   20744: goto -> 20748
    //   20747: athrow
    //   20748: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
    //   20751: goto -> 20755
    //   20754: athrow
    //   20755: getstatic Perryc.0 : I
    //   20758: ifle -> 20772
    //   20761: ldc2_w -1275994293
    //   20764: l2i
    //   20765: ldc_w -1106986507
    //   20768: ixor
    //   20769: goto -> 20780
    //   20772: ldc2_w -2060000742
    //   20775: l2i
    //   20776: ldc_w -1902600994
    //   20779: ixor
    //   20780: ldc2_w 2032784196
    //   20783: l2i
    //   20784: ldc_w 1363284
    //   20787: ixor
    //   20788: ixor
    //   20789: lookupswitch default -> 25804, 1922261204 -> 20816, 1959295150 -> 20772
    //   20816: astore #27
    //   20818: getstatic Perryc.1 : I
    //   20821: ifeq -> 20835
    //   20824: ldc2_w -710999288
    //   20827: l2i
    //   20828: ldc_w 505585537
    //   20831: ixor
    //   20832: goto -> 20843
    //   20835: ldc2_w -1481742846
    //   20838: l2i
    //   20839: ldc_w -592067584
    //   20842: ixor
    //   20843: ldc2_w 1335515233
    //   20846: l2i
    //   20847: ldc_w 1942398842
    //   20850: ixor
    //   20851: ixor
    //   20852: lookupswitch default -> 20880, -1461049624 -> 20835, -136223854 -> 25846
    //   20880: aload #27
    //   20882: getstatic Perryc.c : I
    //   20885: iflt -> 20899
    //   20888: ldc2_w 1236243273
    //   20891: l2i
    //   20892: ldc_w 688336038
    //   20895: ixor
    //   20896: goto -> 20907
    //   20899: ldc2_w 1948205066
    //   20902: l2i
    //   20903: ldc_w 502449693
    //   20906: ixor
    //   20907: ldc2_w 326886218
    //   20910: l2i
    //   20911: ldc_w -1698221742
    //   20914: ixor
    //   20915: ixor
    //   20916: lookupswitch default -> 25316, -531540977 -> 20944, -384537097 -> 20899
    //   20944: goto -> 20948
    //   20947: athrow
    //   20948: invokevirtual func_77962_s : ()Z
    //   20951: goto -> 20955
    //   20954: athrow
    //   20955: ifeq -> 20969
    //   20958: ldc2_w 226169207
    //   20961: l2i
    //   20962: ldc_w -1357276995
    //   20965: ixor
    //   20966: goto -> 20977
    //   20969: ldc2_w -1242543550
    //   20972: l2i
    //   20973: ldc_w 395494281
    //   20976: ixor
    //   20977: ldc2_w -858407261
    //   20980: l2i
    //   20981: ldc_w 1974696975
    //   20984: ixor
    //   20985: ixor
    //   20986: tableswitch default -> 20958, 453266278 -> 21008, 453266279 -> 21527
    //   21008: getstatic Perryc.1 : I
    //   21011: ifeq -> 21025
    //   21014: ldc2_w -1018005793
    //   21017: l2i
    //   21018: ldc_w 1106827030
    //   21021: ixor
    //   21022: goto -> 21033
    //   21025: ldc2_w 768719807
    //   21028: l2i
    //   21029: ldc_w 1754537514
    //   21032: ixor
    //   21033: ldc2_w -799553074
    //   21036: l2i
    //   21037: ldc_w 2055606636
    //   21040: ixor
    //   21041: ixor
    //   21042: lookupswitch default -> 25786, -275481289 -> 21068, 679180651 -> 21025
    //   21068: aload #27
    //   21070: getstatic Perryc.1 : I
    //   21073: ifeq -> 21087
    //   21076: ldc2_w 9172592
    //   21079: l2i
    //   21080: ldc_w 210815564
    //   21083: ixor
    //   21084: goto -> 21095
    //   21087: ldc2_w 1184909910
    //   21090: l2i
    //   21091: ldc_w -998183831
    //   21094: ixor
    //   21095: ldc2_w -1373247713
    //   21098: l2i
    //   21099: ldc_w 1958457732
    //   21102: ixor
    //   21103: ixor
    //   21104: lookupswitch default -> 25386, -695899481 -> 21087, 1488908452 -> 21132
    //   21132: goto -> 21136
    //   21135: athrow
    //   21136: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   21139: goto -> 21143
    //   21142: athrow
    //   21143: instanceof net/minecraft/item/ItemTool
    //   21146: ifne -> 21160
    //   21149: ldc2_w 879196323
    //   21152: l2i
    //   21153: ldc_w 1273455279
    //   21156: ixor
    //   21157: goto -> 21168
    //   21160: ldc2_w 1605554857
    //   21163: l2i
    //   21164: ldc_w 540199074
    //   21167: ixor
    //   21168: ldc2_w -864968427
    //   21171: l2i
    //   21172: ldc_w -797212422
    //   21175: ixor
    //   21176: ixor
    //   21177: tableswitch default -> 21149, 1670003683 -> 21200, 1670003684 -> 21392
    //   21200: getstatic Perryc.1 : I
    //   21203: ifeq -> 21217
    //   21206: ldc2_w -1478492344
    //   21209: l2i
    //   21210: ldc_w 1104714567
    //   21213: ixor
    //   21214: goto -> 21225
    //   21217: ldc2_w 2033737611
    //   21220: l2i
    //   21221: ldc_w 1084569572
    //   21224: ixor
    //   21225: ldc2_w -1984357223
    //   21228: l2i
    //   21229: ldc_w 1232171092
    //   21232: ixor
    //   21233: ixor
    //   21234: lookupswitch default -> 25836, -111868766 -> 21260, 651102402 -> 21217
    //   21260: aload #27
    //   21262: getstatic Perryc.0 : I
    //   21265: ifle -> 21279
    //   21268: ldc2_w 623679231
    //   21271: l2i
    //   21272: ldc_w -1745423451
    //   21275: ixor
    //   21276: goto -> 21287
    //   21279: ldc2_w -1340417216
    //   21282: l2i
    //   21283: ldc_w -1176252395
    //   21286: ixor
    //   21287: ldc2_w -1918649643
    //   21290: l2i
    //   21291: ldc_w 610278422
    //   21294: ixor
    //   21295: ixor
    //   21296: lookupswitch default -> 25400, -1606767210 -> 21324, 454673305 -> 21279
    //   21324: goto -> 21328
    //   21327: athrow
    //   21328: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   21331: goto -> 21335
    //   21334: athrow
    //   21335: instanceof net/minecraft/item/ItemArmor
    //   21338: ifeq -> 21352
    //   21341: ldc2_w 1411547781
    //   21344: l2i
    //   21345: ldc_w -2010206490
    //   21348: ixor
    //   21349: goto -> 21360
    //   21352: ldc2_w 1258482420
    //   21355: l2i
    //   21356: ldc_w -1760639338
    //   21359: ixor
    //   21360: ldc2_w -454675339
    //   21363: l2i
    //   21364: ldc_w 1269542436
    //   21367: ixor
    //   21368: ixor
    //   21369: tableswitch default -> 21341, 1933686322 -> 21392, 1933686323 -> 21527
    //   21392: getstatic Perryc.c : I
    //   21395: iflt -> 21409
    //   21398: ldc2_w -745806203
    //   21401: l2i
    //   21402: ldc_w -2067031694
    //   21405: ixor
    //   21406: goto -> 21417
    //   21409: ldc2_w 401803950
    //   21412: l2i
    //   21413: ldc_w 1264892433
    //   21416: ixor
    //   21417: ldc2_w 1651446164
    //   21420: l2i
    //   21421: ldc_w -646193495
    //   21424: ixor
    //   21425: ixor
    //   21426: lookupswitch default -> 25716, -410812542 -> 21452, -329994038 -> 21409
    //   21452: aload #27
    //   21454: ldc2_w -142172139
    //   21457: l2i
    //   21458: ldc_w -142172140
    //   21461: ixor
    //   21462: getstatic Perryc.c : I
    //   21465: iflt -> 21479
    //   21468: ldc2_w 1885960634
    //   21471: l2i
    //   21472: ldc_w -964225517
    //   21475: ixor
    //   21476: goto -> 21487
    //   21479: ldc2_w 912558076
    //   21482: l2i
    //   21483: ldc_w -1201619638
    //   21486: ixor
    //   21487: ldc2_w -1830970347
    //   21490: l2i
    //   21491: ldc_w 1131996888
    //   21494: ixor
    //   21495: ixor
    //   21496: lookupswitch default -> 21524, -1309861168 -> 21479, 1732973924 -> 25864
    //   21524: putfield field_77994_a : I
    //   21527: getstatic Perryc.0 : I
    //   21530: ifle -> 21544
    //   21533: ldc2_w 1260181784
    //   21536: l2i
    //   21537: ldc_w -427151433
    //   21540: ixor
    //   21541: goto -> 21552
    //   21544: ldc2_w -28289414
    //   21547: l2i
    //   21548: ldc_w -1675088773
    //   21551: ixor
    //   21552: ldc2_w -1382281883
    //   21555: l2i
    //   21556: ldc_w 2037263774
    //   21559: ixor
    //   21560: ixor
    //   21561: lookupswitch default -> 21588, 1988772248 -> 21544, 2036651604 -> 25896
    //   21588: aload_0
    //   21589: getstatic Perryc.c : I
    //   21592: iflt -> 21606
    //   21595: ldc2_w 1826356107
    //   21598: l2i
    //   21599: ldc_w -1266713015
    //   21602: ixor
    //   21603: goto -> 21614
    //   21606: ldc2_w -360520163
    //   21609: l2i
    //   21610: ldc_w 415189313
    //   21613: ixor
    //   21614: ldc2_w -633304463
    //   21617: l2i
    //   21618: ldc_w 1344860679
    //   21621: ixor
    //   21622: ixor
    //   21623: lookupswitch default -> 25428, 1389166004 -> 21606, 2018891562 -> 21648
    //   21648: aload #27
    //   21650: getstatic Perryc.c : I
    //   21653: iflt -> 21667
    //   21656: ldc2_w -479321701
    //   21659: l2i
    //   21660: ldc_w 1602846989
    //   21663: ixor
    //   21664: goto -> 21675
    //   21667: ldc2_w 1871183557
    //   21670: l2i
    //   21671: ldc_w -215416242
    //   21674: ixor
    //   21675: ldc2_w 273177511
    //   21678: l2i
    //   21679: ldc_w 475098202
    //   21682: ixor
    //   21683: ixor
    //   21684: lookupswitch default -> 21712, -1325492373 -> 25258, -611881112 -> 21667
    //   21712: iload #25
    //   21714: ldc2_w 215365758
    //   21717: l2i
    //   21718: ldc_w -215365736
    //   21721: ixor
    //   21722: getstatic Perryc.1 : I
    //   21725: ifeq -> 21739
    //   21728: ldc2_w 272451482
    //   21731: l2i
    //   21732: ldc_w 1495550510
    //   21735: ixor
    //   21736: goto -> 21747
    //   21739: ldc2_w 1063217074
    //   21742: l2i
    //   21743: ldc_w -874154445
    //   21746: ixor
    //   21747: ldc2_w 1535642039
    //   21750: l2i
    //   21751: ldc_w -1017791956
    //   21754: ixor
    //   21755: ixor
    //   21756: lookupswitch default -> 21784, -775635409 -> 25518, -525542473 -> 21739
    //   21784: goto -> 21788
    //   21787: athrow
    //   21788: invokespecial renderItemStack : (Lnet/minecraft/item/ItemStack;II)V
    //   21791: goto -> 21795
    //   21794: athrow
    //   21795: iinc #25, 16
    //   21798: ldc2_w -19766222
    //   21801: l2i
    //   21802: ldc_w -19766223
    //   21805: ixor
    //   21806: getstatic Perryc.1 : I
    //   21809: ifeq -> 21823
    //   21812: ldc2_w -917677722
    //   21815: l2i
    //   21816: ldc_w -1964385839
    //   21819: ixor
    //   21820: goto -> 21831
    //   21823: ldc2_w 492081508
    //   21826: l2i
    //   21827: ldc_w -2025593964
    //   21830: ixor
    //   21831: ldc2_w 1922268267
    //   21834: l2i
    //   21835: ldc_w 1874898886
    //   21838: ixor
    //   21839: ixor
    //   21840: lookupswitch default -> 25910, -2025545379 -> 21868, 1593266970 -> 21823
    //   21868: istore #28
    //   21870: getstatic Perryc.1 : I
    //   21873: ifeq -> 21887
    //   21876: ldc2_w -2100679096
    //   21879: l2i
    //   21880: ldc_w 1811722066
    //   21883: ixor
    //   21884: goto -> 21895
    //   21887: ldc2_w -1772109249
    //   21890: l2i
    //   21891: ldc_w 2123952709
    //   21894: ixor
    //   21895: ldc2_w -719608233
    //   21898: l2i
    //   21899: ldc_w 911861975
    //   21902: ixor
    //   21903: ixor
    //   21904: lookupswitch default -> 21932, 175427482 -> 25624, 805027447 -> 21887
    //   21932: iload #28
    //   21934: iflt -> 21948
    //   21937: ldc2_w -495803777
    //   21940: l2i
    //   21941: ldc_w 1776435947
    //   21944: ixor
    //   21945: goto -> 21956
    //   21948: ldc2_w -2126590625
    //   21951: l2i
    //   21952: ldc_w 179187140
    //   21955: ixor
    //   21956: ldc2_w -1864098131
    //   21959: l2i
    //   21960: ldc_w 1508953230
    //   21963: ixor
    //   21964: ixor
    //   21965: tableswitch default -> 21937, 1115959991 -> 21988, 1115959992 -> 23224
    //   21988: getstatic Perryc.1 : I
    //   21991: ifeq -> 22005
    //   21994: ldc2_w 835773805
    //   21997: l2i
    //   21998: ldc_w -2124304263
    //   22001: ixor
    //   22002: goto -> 22013
    //   22005: ldc2_w -8707617
    //   22008: l2i
    //   22009: ldc_w -1090908814
    //   22012: ixor
    //   22013: ldc2_w -188705733
    //   22016: l2i
    //   22017: ldc_w 1077773971
    //   22020: ixor
    //   22021: ixor
    //   22022: lookupswitch default -> 25808, -176407035 -> 22048, 72107964 -> 22005
    //   22048: aload_1
    //   22049: getstatic Perryc.c : I
    //   22052: iflt -> 22066
    //   22055: ldc2_w 648600548
    //   22058: l2i
    //   22059: ldc_w 276074312
    //   22062: ixor
    //   22063: goto -> 22074
    //   22066: ldc2_w -1027952387
    //   22069: l2i
    //   22070: ldc_w 659579130
    //   22073: ixor
    //   22074: ldc2_w -950924905
    //   22077: l2i
    //   22078: ldc_w 1606479479
    //   22081: ixor
    //   22082: ixor
    //   22083: lookupswitch default -> 22108, -1370574004 -> 25264, -988143085 -> 22066
    //   22108: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   22111: getstatic Perryc.c : I
    //   22114: iflt -> 22128
    //   22117: ldc2_w -856138768
    //   22120: l2i
    //   22121: ldc_w -963555790
    //   22124: ixor
    //   22125: goto -> 22136
    //   22128: ldc2_w 2051463409
    //   22131: l2i
    //   22132: ldc_w 406647079
    //   22135: ixor
    //   22136: ldc2_w -1485314103
    //   22139: l2i
    //   22140: ldc_w -1255663904
    //   22143: ixor
    //   22144: ixor
    //   22145: lookupswitch default -> 22172, 406250731 -> 25296, 1779051484 -> 22128
    //   22172: getfield field_70460_b : Lnet/minecraft/util/NonNullList;
    //   22175: getstatic Perryc.1 : I
    //   22178: ifeq -> 22192
    //   22181: ldc2_w -503616248
    //   22184: l2i
    //   22185: ldc_w 1282014962
    //   22188: ixor
    //   22189: goto -> 22200
    //   22192: ldc2_w -1690279270
    //   22195: l2i
    //   22196: ldc_w -656537584
    //   22199: ixor
    //   22200: ldc2_w -1284813497
    //   22203: l2i
    //   22204: ldc_w -1718871751
    //   22207: ixor
    //   22208: ixor
    //   22209: lookupswitch default -> 22236, -2022324348 -> 25888, 1984288364 -> 22192
    //   22236: iload #28
    //   22238: getstatic Perryc.0 : I
    //   22241: ifle -> 22255
    //   22244: ldc2_w 1268040020
    //   22247: l2i
    //   22248: ldc_w 1766003383
    //   22251: ixor
    //   22252: goto -> 22263
    //   22255: ldc2_w -1067446695
    //   22258: l2i
    //   22259: ldc_w 2108081027
    //   22262: ixor
    //   22263: ldc2_w -1749139110
    //   22266: l2i
    //   22267: ldc_w -1865699742
    //   22270: ixor
    //   22271: ixor
    //   22272: lookupswitch default -> 22300, 631389403 -> 25626, 1797969798 -> 22255
    //   22300: goto -> 22304
    //   22303: athrow
    //   22304: invokevirtual get : (I)Ljava/lang/Object;
    //   22307: goto -> 22311
    //   22310: athrow
    //   22311: checkcast net/minecraft/item/ItemStack
    //   22314: getstatic Perryc.c : I
    //   22317: iflt -> 22331
    //   22320: ldc2_w -341463823
    //   22323: l2i
    //   22324: ldc_w -1046534753
    //   22327: ixor
    //   22328: goto -> 22339
    //   22331: ldc2_w -80160215
    //   22334: l2i
    //   22335: ldc_w 1180915692
    //   22338: ixor
    //   22339: ldc2_w -1414634824
    //   22342: l2i
    //   22343: ldc_w -2128236374
    //   22346: ixor
    //   22347: ixor
    //   22348: lookupswitch default -> 22376, -1147128651 -> 22331, 11623292 -> 25838
    //   22376: astore #29
    //   22378: getstatic Perryc.c : I
    //   22381: iflt -> 22395
    //   22384: ldc2_w 258238112
    //   22387: l2i
    //   22388: ldc_w 673155782
    //   22391: ixor
    //   22392: goto -> 22403
    //   22395: ldc2_w -1436668085
    //   22398: l2i
    //   22399: ldc_w -831139337
    //   22402: ixor
    //   22403: ldc2_w 329400539
    //   22406: l2i
    //   22407: ldc_w -1528228175
    //   22410: ixor
    //   22411: ixor
    //   22412: lookupswitch default -> 25504, -1875854836 -> 22395, -748640042 -> 22440
    //   22440: aload #29
    //   22442: ifnull -> 22456
    //   22445: ldc2_w 2052981008
    //   22448: l2i
    //   22449: ldc_w 495284499
    //   22452: ixor
    //   22453: goto -> 22464
    //   22456: ldc2_w 704124562
    //   22459: l2i
    //   22460: ldc_w 1310942866
    //   22463: ixor
    //   22464: ldc2_w 1217147521
    //   22467: l2i
    //   22468: ldc_w -2092817093
    //   22471: ixor
    //   22472: ixor
    //   22473: tableswitch default -> 22445, -1407883335 -> 22496, -1407883334 -> 23218
    //   22496: getstatic Perryc.1 : I
    //   22499: ifeq -> 22513
    //   22502: ldc2_w 1183934621
    //   22505: l2i
    //   22506: ldc_w 1149547486
    //   22509: ixor
    //   22510: goto -> 22521
    //   22513: ldc2_w -968792719
    //   22516: l2i
    //   22517: ldc_w 107972318
    //   22520: ixor
    //   22521: ldc2_w -1426580612
    //   22524: l2i
    //   22525: ldc_w -44271977
    //   22528: ixor
    //   22529: ixor
    //   22530: lookupswitch default -> 25718, -1752527292 -> 22556, 1437709992 -> 22513
    //   22556: aload #29
    //   22558: getstatic Perryc.c : I
    //   22561: iflt -> 22575
    //   22564: ldc2_w 1777154307
    //   22567: l2i
    //   22568: ldc_w -2002291370
    //   22571: ixor
    //   22572: goto -> 22583
    //   22575: ldc2_w 297943816
    //   22578: l2i
    //   22579: ldc_w -940507438
    //   22582: ixor
    //   22583: ldc2_w -151209127
    //   22586: l2i
    //   22587: ldc_w -1929342304
    //   22590: ixor
    //   22591: ixor
    //   22592: lookupswitch default -> 22620, -1699322452 -> 25622, 660036004 -> 22575
    //   22620: goto -> 22624
    //   22623: athrow
    //   22624: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   22627: goto -> 22631
    //   22630: athrow
    //   22631: getstatic Perryc.c : I
    //   22634: iflt -> 22648
    //   22637: ldc2_w -338042652
    //   22640: l2i
    //   22641: ldc_w 1222754984
    //   22644: ixor
    //   22645: goto -> 22656
    //   22648: ldc2_w 1986877429
    //   22651: l2i
    //   22652: ldc_w 1968755410
    //   22655: ixor
    //   22656: ldc2_w 1654937443
    //   22659: l2i
    //   22660: ldc_w -1140124270
    //   22663: ixor
    //   22664: ixor
    //   22665: lookupswitch default -> 25668, -577058858 -> 22692, 2107072701 -> 22648
    //   22692: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   22695: if_acmpeq -> 22709
    //   22698: ldc2_w -1333153312
    //   22701: l2i
    //   22702: ldc_w -1600422948
    //   22705: ixor
    //   22706: goto -> 22717
    //   22709: ldc2_w 882571427
    //   22712: l2i
    //   22713: ldc_w 612905628
    //   22716: ixor
    //   22717: ldc2_w 2080508942
    //   22720: l2i
    //   22721: ldc_w -1883958173
    //   22724: ixor
    //   22725: ixor
    //   22726: tableswitch default -> 22698, -475671983 -> 22748, -475671982 -> 23218
    //   22748: getstatic Perryc.1 : I
    //   22751: ifeq -> 22765
    //   22754: ldc2_w -716003770
    //   22757: l2i
    //   22758: ldc_w -1906044787
    //   22761: ixor
    //   22762: goto -> 22773
    //   22765: ldc2_w -283885538
    //   22768: l2i
    //   22769: ldc_w 1469459113
    //   22772: ixor
    //   22773: ldc2_w -17315686
    //   22776: l2i
    //   22777: ldc_w 2003111035
    //   22780: ixor
    //   22781: ixor
    //   22782: lookupswitch default -> 25436, -760974806 -> 22765, 823176790 -> 22808
    //   22808: aload #29
    //   22810: getstatic Perryc.0 : I
    //   22813: ifle -> 22827
    //   22816: ldc2_w 1571555094
    //   22819: l2i
    //   22820: ldc_w 1271076425
    //   22823: ixor
    //   22824: goto -> 22835
    //   22827: ldc2_w 92987867
    //   22830: l2i
    //   22831: ldc_w -1437025744
    //   22834: ixor
    //   22835: ldc2_w -1036654145
    //   22838: l2i
    //   22839: ldc_w -438828709
    //   22842: ixor
    //   22843: ixor
    //   22844: lookupswitch default -> 22872, -1089933566 -> 22827, 830667195 -> 25736
    //   22872: goto -> 22876
    //   22875: athrow
    //   22876: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
    //   22879: goto -> 22883
    //   22882: athrow
    //   22883: getstatic Perryc.1 : I
    //   22886: ifeq -> 22900
    //   22889: ldc2_w -191274086
    //   22892: l2i
    //   22893: ldc_w -589321208
    //   22896: ixor
    //   22897: goto -> 22908
    //   22900: ldc2_w -1536997106
    //   22903: l2i
    //   22904: ldc_w -736139246
    //   22907: ixor
    //   22908: ldc2_w -1019253638
    //   22911: l2i
    //   22912: ldc_w 1497610772
    //   22915: ixor
    //   22916: ixor
    //   22917: lookupswitch default -> 22944, -1849910363 -> 22900, -1304815108 -> 25468
    //   22944: astore #30
    //   22946: getstatic Perryc.1 : I
    //   22949: ifeq -> 22963
    //   22952: ldc2_w 987757767
    //   22955: l2i
    //   22956: ldc_w -1947121893
    //   22959: ixor
    //   22960: goto -> 22971
    //   22963: ldc2_w -2136365977
    //   22966: l2i
    //   22967: ldc_w -755707216
    //   22970: ixor
    //   22971: ldc2_w 809405894
    //   22974: l2i
    //   22975: ldc_w 1971803847
    //   22978: ixor
    //   22979: ixor
    //   22980: lookupswitch default -> 25278, -191405859 -> 22963, 400862678 -> 23008
    //   23008: aload_0
    //   23009: getstatic Perryc.1 : I
    //   23012: ifeq -> 23026
    //   23015: ldc2_w -445853773
    //   23018: l2i
    //   23019: ldc_w -952962061
    //   23022: ixor
    //   23023: goto -> 23034
    //   23026: ldc2_w -1426892283
    //   23029: l2i
    //   23030: ldc_w -1605997410
    //   23033: ixor
    //   23034: ldc2_w 976241660
    //   23037: l2i
    //   23038: ldc_w 1234207690
    //   23041: ixor
    //   23042: ixor
    //   23043: lookupswitch default -> 23068, 1375665270 -> 25750, 1697121079 -> 23026
    //   23068: aload #29
    //   23070: getstatic Perryc.c : I
    //   23073: iflt -> 23087
    //   23076: ldc2_w -81749901
    //   23079: l2i
    //   23080: ldc_w -606540275
    //   23083: ixor
    //   23084: goto -> 23095
    //   23087: ldc2_w -573558136
    //   23090: l2i
    //   23091: ldc_w -1080559424
    //   23094: ixor
    //   23095: ldc2_w 970429983
    //   23098: l2i
    //   23099: ldc_w 440317922
    //   23102: ixor
    //   23103: ixor
    //   23104: lookupswitch default -> 25880, 51468163 -> 23087, 1101982645 -> 23132
    //   23132: iload #25
    //   23134: ldc2_w 882568605
    //   23137: l2i
    //   23138: ldc_w -882568581
    //   23141: ixor
    //   23142: getstatic Perryc.0 : I
    //   23145: ifle -> 23159
    //   23148: ldc2_w -708036141
    //   23151: l2i
    //   23152: ldc_w -994765672
    //   23155: ixor
    //   23156: goto -> 23167
    //   23159: ldc2_w -131098689
    //   23162: l2i
    //   23163: ldc_w -87386893
    //   23166: ixor
    //   23167: ldc2_w -1050261149
    //   23170: l2i
    //   23171: ldc_w 1802682317
    //   23174: ixor
    //   23175: ixor
    //   23176: lookupswitch default -> 25904, -1460537886 -> 23204, -1150428187 -> 23159
    //   23204: goto -> 23208
    //   23207: athrow
    //   23208: invokespecial renderItemStack : (Lnet/minecraft/item/ItemStack;II)V
    //   23211: goto -> 23215
    //   23214: athrow
    //   23215: iinc #25, 16
    //   23218: iinc #28, -1
    //   23221: goto -> 21870
    //   23224: getstatic Perryc.0 : I
    //   23227: ifle -> 23241
    //   23230: ldc2_w -1767628563
    //   23233: l2i
    //   23234: ldc_w -768985238
    //   23237: ixor
    //   23238: goto -> 23249
    //   23241: ldc2_w 595455053
    //   23244: l2i
    //   23245: ldc_w 479294931
    //   23248: ixor
    //   23249: ldc2_w 1922085894
    //   23252: l2i
    //   23253: ldc_w -379924670
    //   23256: ixor
    //   23257: ixor
    //   23258: lookupswitch default -> 25870, -1540955430 -> 23284, -549163837 -> 23241
    //   23284: aload_0
    //   23285: getstatic Perryc.0 : I
    //   23288: ifle -> 23302
    //   23291: ldc2_w 1145231737
    //   23294: l2i
    //   23295: ldc_w 1209078700
    //   23298: ixor
    //   23299: goto -> 23310
    //   23302: ldc2_w -1105901163
    //   23305: l2i
    //   23306: ldc_w 411280386
    //   23309: ixor
    //   23310: ldc2_w -1958525565
    //   23313: l2i
    //   23314: ldc_w 1750348167
    //   23317: ixor
    //   23318: ixor
    //   23319: lookupswitch default -> 23344, -280707375 -> 25560, 972393071 -> 23302
    //   23344: aload #24
    //   23346: getstatic Perryc.c : I
    //   23349: iflt -> 23363
    //   23352: ldc2_w 388279037
    //   23355: l2i
    //   23356: ldc_w -1739165383
    //   23359: ixor
    //   23360: goto -> 23371
    //   23363: ldc2_w 2129974332
    //   23366: l2i
    //   23367: ldc_w 377057740
    //   23370: ixor
    //   23371: ldc2_w 258426046
    //   23374: l2i
    //   23375: ldc_w -2024283764
    //   23378: ixor
    //   23379: ixor
    //   23380: lookupswitch default -> 23408, -1049169225 -> 23363, 121798390 -> 25276
    //   23408: iload #25
    //   23410: ldc2_w -1435564313
    //   23413: l2i
    //   23414: ldc_w 1435564289
    //   23417: ixor
    //   23418: getstatic Perryc.c : I
    //   23421: iflt -> 23435
    //   23424: ldc2_w 859979909
    //   23427: l2i
    //   23428: ldc_w 235943338
    //   23431: ixor
    //   23432: goto -> 23443
    //   23435: ldc2_w -1786845015
    //   23438: l2i
    //   23439: ldc_w 1619952856
    //   23442: ixor
    //   23443: ldc2_w -1106192709
    //   23446: l2i
    //   23447: ldc_w 303910987
    //   23450: ixor
    //   23451: ixor
    //   23452: lookupswitch default -> 25334, -1855982625 -> 23435, 1509812865 -> 23480
    //   23480: goto -> 23484
    //   23483: athrow
    //   23484: invokespecial renderItemStack : (Lnet/minecraft/item/ItemStack;II)V
    //   23487: goto -> 23491
    //   23490: athrow
    //   23491: getstatic Perryc.0 : I
    //   23494: ifle -> 23508
    //   23497: ldc2_w 570859430
    //   23500: l2i
    //   23501: ldc_w 487037872
    //   23504: ixor
    //   23505: goto -> 23516
    //   23508: ldc2_w -1690830151
    //   23511: l2i
    //   23512: ldc_w 1875894091
    //   23515: ixor
    //   23516: ldc2_w -1993107982
    //   23519: l2i
    //   23520: ldc_w 1764225245
    //   23523: ixor
    //   23524: ixor
    //   23525: lookupswitch default -> 23552, -552246983 -> 25344, -382046132 -> 23508
    //   23552: goto -> 23556
    //   23555: athrow
    //   23556: invokestatic func_179121_F : ()V
    //   23559: goto -> 23563
    //   23562: athrow
    //   23563: getstatic Perryc.1 : I
    //   23566: ifeq -> 23580
    //   23569: ldc2_w -298131045
    //   23572: l2i
    //   23573: ldc_w 286966185
    //   23576: ixor
    //   23577: goto -> 23588
    //   23580: ldc2_w 977407212
    //   23583: l2i
    //   23584: ldc_w -739546326
    //   23587: ixor
    //   23588: ldc2_w 1463456431
    //   23591: l2i
    //   23592: ldc_w 1349107034
    //   23595: ixor
    //   23596: ixor
    //   23597: lookupswitch default -> 25698, -285587405 -> 23624, -126677049 -> 23580
    //   23624: aload_0
    //   23625: getstatic Perryc.0 : I
    //   23628: ifle -> 23642
    //   23631: ldc2_w 209758320
    //   23634: l2i
    //   23635: ldc_w -470673251
    //   23638: ixor
    //   23639: goto -> 23650
    //   23642: ldc2_w -1083423427
    //   23645: l2i
    //   23646: ldc_w -1968094541
    //   23649: ixor
    //   23650: ldc2_w -1952909088
    //   23653: l2i
    //   23654: ldc_w 1624500707
    //   23657: ixor
    //   23658: ixor
    //   23659: lookupswitch default -> 25534, -560589171 -> 23684, 70885870 -> 23642
    //   23684: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   23687: getstatic Perryc.0 : I
    //   23690: ifle -> 23704
    //   23693: ldc2_w 751832269
    //   23696: l2i
    //   23697: ldc_w 1406367672
    //   23700: ixor
    //   23701: goto -> 23712
    //   23704: ldc2_w 67455399
    //   23707: l2i
    //   23708: ldc_w 1698358727
    //   23711: ixor
    //   23712: ldc2_w 1459092592
    //   23715: l2i
    //   23716: ldc_w -1220203937
    //   23719: ixor
    //   23720: ixor
    //   23721: lookupswitch default -> 23748, -1632522918 -> 25578, -385098840 -> 23704
    //   23748: aload #18
    //   23750: getstatic Perryc.1 : I
    //   23753: ifeq -> 23767
    //   23756: ldc2_w 78896125
    //   23759: l2i
    //   23760: ldc_w -1325910671
    //   23763: ixor
    //   23764: goto -> 23775
    //   23767: ldc2_w 1289837462
    //   23770: l2i
    //   23771: ldc_w -2129092901
    //   23774: ixor
    //   23775: ldc2_w 232964199
    //   23778: l2i
    //   23779: ldc_w -660809
    //   23782: ixor
    //   23783: ixor
    //   23784: lookupswitch default -> 23812, -1903405441 -> 23767, 1180484700 -> 25392
    //   23812: iload #21
    //   23814: ineg
    //   23815: i2f
    //   23816: getstatic Perryc.0 : I
    //   23819: ifle -> 23833
    //   23822: ldc2_w 544236188
    //   23825: l2i
    //   23826: ldc_w 95913975
    //   23829: ixor
    //   23830: goto -> 23841
    //   23833: ldc2_w 373024348
    //   23836: l2i
    //   23837: ldc_w -239396388
    //   23840: ixor
    //   23841: ldc2_w -1006803517
    //   23844: l2i
    //   23845: ldc_w -90530901
    //   23848: ixor
    //   23849: ixor
    //   23850: lookupswitch default -> 23876, 480254723 -> 25456, 1318338554 -> 23833
    //   23876: aload_0
    //   23877: getstatic Perryc.0 : I
    //   23880: ifle -> 23894
    //   23883: ldc2_w -2023714220
    //   23886: l2i
    //   23887: ldc_w -364085898
    //   23890: ixor
    //   23891: goto -> 23902
    //   23894: ldc2_w -1500075358
    //   23897: l2i
    //   23898: ldc_w 253994234
    //   23901: ixor
    //   23902: ldc2_w -930484656
    //   23905: l2i
    //   23906: ldc_w -1817988581
    //   23909: ixor
    //   23910: ixor
    //   23911: lookupswitch default -> 25540, -224439789 -> 23936, 906408809 -> 23894
    //   23936: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   23939: getstatic Perryc.0 : I
    //   23942: ifle -> 23956
    //   23945: ldc2_w -1010927145
    //   23948: l2i
    //   23949: ldc_w 1097967756
    //   23952: ixor
    //   23953: goto -> 23964
    //   23956: ldc2_w -787123154
    //   23959: l2i
    //   23960: ldc_w -1747585078
    //   23963: ixor
    //   23964: ldc2_w 46195826
    //   23967: l2i
    //   23968: ldc_w -918166268
    //   23971: ixor
    //   23972: ixor
    //   23973: lookupswitch default -> 24000, -14997419 -> 23956, 1229639725 -> 25666
    //   24000: goto -> 24004
    //   24003: athrow
    //   24004: invokevirtual getFontHeight : ()I
    //   24007: goto -> 24011
    //   24010: athrow
    //   24011: ldc2_w -1687570097
    //   24014: l2i
    //   24015: ldc_w -1687570098
    //   24018: ixor
    //   24019: isub
    //   24020: ineg
    //   24021: i2f
    //   24022: getstatic Perryc.1 : I
    //   24025: ifeq -> 24039
    //   24028: ldc2_w -1016682981
    //   24031: l2i
    //   24032: ldc_w 787639353
    //   24035: ixor
    //   24036: goto -> 24047
    //   24039: ldc2_w -1862601614
    //   24042: l2i
    //   24043: ldc_w -1289362572
    //   24046: ixor
    //   24047: ldc2_w -336897958
    //   24050: l2i
    //   24051: ldc_w -1710531994
    //   24054: ixor
    //   24055: ixor
    //   24056: lookupswitch default -> 25572, -1670068194 -> 24039, 1379865914 -> 24084
    //   24084: aload_0
    //   24085: getstatic Perryc.0 : I
    //   24088: ifle -> 24102
    //   24091: ldc2_w -1735668742
    //   24094: l2i
    //   24095: ldc_w -1588860881
    //   24098: ixor
    //   24099: goto -> 24110
    //   24102: ldc2_w 238185076
    //   24105: l2i
    //   24106: ldc_w -384616784
    //   24109: ixor
    //   24110: ldc2_w -1752426460
    //   24113: l2i
    //   24114: ldc_w 1295479761
    //   24117: ixor
    //   24118: ixor
    //   24119: lookupswitch default -> 25402, -478459872 -> 24102, 1033516849 -> 24144
    //   24144: aload_1
    //   24145: getstatic Perryc.c : I
    //   24148: iflt -> 24162
    //   24151: ldc2_w -1691246240
    //   24154: l2i
    //   24155: ldc_w 1402678571
    //   24158: ixor
    //   24159: goto -> 24170
    //   24162: ldc2_w 4186735
    //   24165: l2i
    //   24166: ldc_w 474176667
    //   24169: ixor
    //   24170: ldc2_w -1229708281
    //   24173: l2i
    //   24174: ldc_w -888361610
    //   24177: ixor
    //   24178: ixor
    //   24179: lookupswitch default -> 24204, -1257110214 -> 25768, 860070221 -> 24162
    //   24204: goto -> 24208
    //   24207: athrow
    //   24208: invokespecial getDisplayColor : (Lnet/minecraft/entity/player/EntityPlayer;)I
    //   24211: goto -> 24215
    //   24214: athrow
    //   24215: getstatic Perryc.c : I
    //   24218: iflt -> 24232
    //   24221: ldc2_w -502446698
    //   24224: l2i
    //   24225: ldc_w -588048984
    //   24228: ixor
    //   24229: goto -> 24240
    //   24232: ldc2_w 2046264840
    //   24235: l2i
    //   24236: ldc_w -293476929
    //   24239: ixor
    //   24240: ldc2_w 70173193
    //   24243: l2i
    //   24244: ldc_w 637756563
    //   24247: ixor
    //   24248: ixor
    //   24249: lookupswitch default -> 24276, 483653284 -> 25536, 2121662516 -> 24232
    //   24276: goto -> 24280
    //   24279: athrow
    //   24280: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   24283: goto -> 24287
    //   24286: athrow
    //   24287: getstatic Perryc.c : I
    //   24290: iflt -> 24304
    //   24293: ldc2_w 2112833276
    //   24296: l2i
    //   24297: ldc_w 1031214736
    //   24300: ixor
    //   24301: goto -> 24312
    //   24304: ldc2_w -625214829
    //   24307: l2i
    //   24308: ldc_w 543731103
    //   24311: ixor
    //   24312: ldc2_w -311511189
    //   24315: l2i
    //   24316: ldc_w 984595963
    //   24319: ixor
    //   24320: ixor
    //   24321: lookupswitch default -> 25688, -1755751684 -> 24304, 756178332 -> 24348
    //   24348: aload #11
    //   24350: getstatic Perryc.1 : I
    //   24353: ifeq -> 24367
    //   24356: ldc2_w -47091140
    //   24359: l2i
    //   24360: ldc_w 2120405911
    //   24363: ixor
    //   24364: goto -> 24375
    //   24367: ldc2_w 1207280940
    //   24370: l2i
    //   24371: ldc_w -307112229
    //   24374: ixor
    //   24375: ldc2_w -1739551412
    //   24378: l2i
    //   24379: ldc_w 887426110
    //   24382: ixor
    //   24383: ixor
    //   24384: lookupswitch default -> 24412, 803610841 -> 25634, 974383688 -> 24367
    //   24412: dload #12
    //   24414: getstatic Perryc.1 : I
    //   24417: ifeq -> 24431
    //   24420: ldc2_w -213216163
    //   24423: l2i
    //   24424: ldc_w 1546220704
    //   24427: ixor
    //   24428: goto -> 24439
    //   24431: ldc2_w 259269085
    //   24434: l2i
    //   24435: ldc_w 141032283
    //   24438: ixor
    //   24439: ldc2_w 935972679
    //   24442: l2i
    //   24443: ldc_w -199803735
    //   24446: ixor
    //   24447: ixor
    //   24448: lookupswitch default -> 24476, -1980060531 -> 24431, 1824330515 -> 25832
    //   24476: putfield field_70165_t : D
    //   24479: getstatic Perryc.c : I
    //   24482: iflt -> 24496
    //   24485: ldc2_w -142169284
    //   24488: l2i
    //   24489: ldc_w -1167731381
    //   24492: ixor
    //   24493: goto -> 24504
    //   24496: ldc2_w 1443157797
    //   24499: l2i
    //   24500: ldc_w 852104133
    //   24503: ixor
    //   24504: ldc2_w 1614805950
    //   24507: l2i
    //   24508: ldc_w -2114447780
    //   24511: ixor
    //   24512: ixor
    //   24513: lookupswitch default -> 25346, -2062997246 -> 24540, -1406889067 -> 24496
    //   24540: aload #11
    //   24542: getstatic Perryc.1 : I
    //   24545: ifeq -> 24559
    //   24548: ldc2_w -2132428114
    //   24551: l2i
    //   24552: ldc_w 1813771155
    //   24555: ixor
    //   24556: goto -> 24567
    //   24559: ldc2_w -439884197
    //   24562: l2i
    //   24563: ldc_w 842418980
    //   24566: ixor
    //   24567: ldc2_w 2073059822
    //   24570: l2i
    //   24571: ldc_w 2022523536
    //   24574: ixor
    //   24575: ixor
    //   24576: lookupswitch default -> 25574, -722694655 -> 24604, -270308797 -> 24559
    //   24604: dload #14
    //   24606: getstatic Perryc.c : I
    //   24609: iflt -> 24623
    //   24612: ldc2_w 322564347
    //   24615: l2i
    //   24616: ldc_w -2054874470
    //   24619: ixor
    //   24620: goto -> 24631
    //   24623: ldc2_w 1096601131
    //   24626: l2i
    //   24627: ldc_w -1700046035
    //   24630: ixor
    //   24631: ldc2_w -462974373
    //   24634: l2i
    //   24635: ldc_w -742467893
    //   24638: ixor
    //   24639: ixor
    //   24640: lookupswitch default -> 24668, -1907510748 -> 24623, -1587171599 -> 25892
    //   24668: putfield field_70163_u : D
    //   24671: getstatic Perryc.1 : I
    //   24674: ifeq -> 24688
    //   24677: ldc2_w -2032410423
    //   24680: l2i
    //   24681: ldc_w 772583801
    //   24684: ixor
    //   24685: goto -> 24696
    //   24688: ldc2_w -1716167482
    //   24691: l2i
    //   24692: ldc_w 2147117185
    //   24695: ixor
    //   24696: ldc2_w 1909954904
    //   24699: l2i
    //   24700: ldc_w 583544760
    //   24703: ixor
    //   24704: ixor
    //   24705: lookupswitch default -> 24732, -1107496476 -> 24688, -70719664 -> 25464
    //   24732: aload #11
    //   24734: getstatic Perryc.c : I
    //   24737: iflt -> 24751
    //   24740: ldc2_w 1925765923
    //   24743: l2i
    //   24744: ldc_w 1932471154
    //   24747: ixor
    //   24748: goto -> 24759
    //   24751: ldc2_w 1735504128
    //   24754: l2i
    //   24755: ldc_w -122414908
    //   24758: ixor
    //   24759: ldc2_w -972956072
    //   24762: l2i
    //   24763: ldc_w 189365184
    //   24766: ixor
    //   24767: ixor
    //   24768: lookupswitch default -> 25582, -860924471 -> 24751, 1384975452 -> 24796
    //   24796: dload #16
    //   24798: getstatic Perryc.1 : I
    //   24801: ifeq -> 24815
    //   24804: ldc2_w 196705751
    //   24807: l2i
    //   24808: ldc_w -1545851162
    //   24811: ixor
    //   24812: goto -> 24823
    //   24815: ldc2_w 1839011992
    //   24818: l2i
    //   24819: ldc_w -1531021187
    //   24822: ixor
    //   24823: ldc2_w -1805293427
    //   24826: l2i
    //   24827: ldc_w 2030391541
    //   24830: ixor
    //   24831: ixor
    //   24832: lookupswitch default -> 24860, 737590330 -> 24815, 1157983049 -> 25570
    //   24860: putfield field_70161_v : D
    //   24863: getstatic Perryc.1 : I
    //   24866: ifeq -> 24880
    //   24869: ldc2_w 347000627
    //   24872: l2i
    //   24873: ldc_w 2110419819
    //   24876: ixor
    //   24877: goto -> 24888
    //   24880: ldc2_w 1416552147
    //   24883: l2i
    //   24884: ldc_w 1917399148
    //   24887: ixor
    //   24888: ldc2_w 805437955
    //   24891: l2i
    //   24892: ldc_w -2077488512
    //   24895: ixor
    //   24896: ixor
    //   24897: lookupswitch default -> 24924, -582306597 -> 25676, 1375695694 -> 24880
    //   24924: goto -> 24928
    //   24927: athrow
    //   24928: invokestatic func_179126_j : ()V
    //   24931: goto -> 24935
    //   24934: athrow
    //   24935: getstatic Perryc.1 : I
    //   24938: ifeq -> 24952
    //   24941: ldc2_w -300255785
    //   24944: l2i
    //   24945: ldc_w 1384275053
    //   24948: ixor
    //   24949: goto -> 24960
    //   24952: ldc2_w 997731537
    //   24955: l2i
    //   24956: ldc_w -603128361
    //   24959: ixor
    //   24960: ldc2_w 1791480535
    //   24963: l2i
    //   24964: ldc_w -2007791498
    //   24967: ixor
    //   24968: ixor
    //   24969: lookupswitch default -> 24996, 1321741463 -> 24952, 1577874203 -> 25472
    //   24996: goto -> 25000
    //   24999: athrow
    //   25000: invokestatic func_179084_k : ()V
    //   25003: goto -> 25007
    //   25006: athrow
    //   25007: getstatic Perryc.1 : I
    //   25010: ifeq -> 25024
    //   25013: ldc2_w 999420442
    //   25016: l2i
    //   25017: ldc_w 710523342
    //   25020: ixor
    //   25021: goto -> 25032
    //   25024: ldc2_w -558164090
    //   25027: l2i
    //   25028: ldc_w 660266703
    //   25031: ixor
    //   25032: ldc2_w -273500837
    //   25035: l2i
    //   25036: ldc_w 1039454795
    //   25039: ixor
    //   25040: ixor
    //   25041: lookupswitch default -> 25852, -1014092604 -> 25024, 732409433 -> 25068
    //   25068: goto -> 25072
    //   25071: athrow
    //   25072: invokestatic func_179113_r : ()V
    //   25075: goto -> 25079
    //   25078: athrow
    //   25079: ldc_w 5.3520174
    //   25082: invokestatic floatToIntBits : (F)I
    //   25085: ldc_w 2133541818
    //   25088: ixor
    //   25089: invokestatic intBitsToFloat : (I)F
    //   25092: ldc_w 6.5673516E-6
    //   25095: invokestatic floatToIntBits : (F)I
    //   25098: ldc_w 2137736735
    //   25101: ixor
    //   25102: invokestatic intBitsToFloat : (I)F
    //   25105: getstatic Perryc.1 : I
    //   25108: ifeq -> 25122
    //   25111: ldc2_w -1122645439
    //   25114: l2i
    //   25115: ldc_w 1062070820
    //   25118: ixor
    //   25119: goto -> 25130
    //   25122: ldc2_w 602362438
    //   25125: l2i
    //   25126: ldc_w 1246297456
    //   25129: ixor
    //   25130: ldc2_w -726607337
    //   25133: l2i
    //   25134: ldc_w 836349345
    //   25137: ixor
    //   25138: ixor
    //   25139: lookupswitch default -> 25890, -1933125504 -> 25164, 1731286995 -> 25122
    //   25164: goto -> 25168
    //   25167: athrow
    //   25168: invokestatic func_179136_a : (FF)V
    //   25171: goto -> 25175
    //   25174: athrow
    //   25175: getstatic Perryc.c : I
    //   25178: iflt -> 25192
    //   25181: ldc2_w 186501644
    //   25184: l2i
    //   25185: ldc_w 592354404
    //   25188: ixor
    //   25189: goto -> 25200
    //   25192: ldc2_w -227040100
    //   25195: l2i
    //   25196: ldc_w 570410983
    //   25199: ixor
    //   25200: ldc2_w -1748037000
    //   25203: l2i
    //   25204: ldc_w -1604602391
    //   25207: ixor
    //   25208: ixor
    //   25209: lookupswitch default -> 25236, -512983349 -> 25192, 533197305 -> 25636
    //   25236: goto -> 25240
    //   25239: athrow
    //   25240: invokestatic func_179121_F : ()V
    //   25243: goto -> 25247
    //   25246: athrow
    //   25247: return
    //   25248: aconst_null
    //   25249: athrow
    //   25250: aconst_null
    //   25251: athrow
    //   25252: aconst_null
    //   25253: athrow
    //   25254: aconst_null
    //   25255: athrow
    //   25256: aconst_null
    //   25257: athrow
    //   25258: aconst_null
    //   25259: athrow
    //   25260: aconst_null
    //   25261: athrow
    //   25262: aconst_null
    //   25263: athrow
    //   25264: aconst_null
    //   25265: athrow
    //   25266: aconst_null
    //   25267: athrow
    //   25268: aconst_null
    //   25269: athrow
    //   25270: aconst_null
    //   25271: athrow
    //   25272: aconst_null
    //   25273: athrow
    //   25274: aconst_null
    //   25275: athrow
    //   25276: aconst_null
    //   25277: athrow
    //   25278: aconst_null
    //   25279: athrow
    //   25280: aconst_null
    //   25281: athrow
    //   25282: aconst_null
    //   25283: athrow
    //   25284: aconst_null
    //   25285: athrow
    //   25286: aconst_null
    //   25287: athrow
    //   25288: aconst_null
    //   25289: athrow
    //   25290: aconst_null
    //   25291: athrow
    //   25292: aconst_null
    //   25293: athrow
    //   25294: aconst_null
    //   25295: athrow
    //   25296: aconst_null
    //   25297: athrow
    //   25298: aconst_null
    //   25299: athrow
    //   25300: aconst_null
    //   25301: athrow
    //   25302: aconst_null
    //   25303: athrow
    //   25304: aconst_null
    //   25305: athrow
    //   25306: aconst_null
    //   25307: athrow
    //   25308: aconst_null
    //   25309: athrow
    //   25310: aconst_null
    //   25311: athrow
    //   25312: aconst_null
    //   25313: athrow
    //   25314: aconst_null
    //   25315: athrow
    //   25316: aconst_null
    //   25317: athrow
    //   25318: aconst_null
    //   25319: athrow
    //   25320: aconst_null
    //   25321: athrow
    //   25322: aconst_null
    //   25323: athrow
    //   25324: aconst_null
    //   25325: athrow
    //   25326: aconst_null
    //   25327: athrow
    //   25328: aconst_null
    //   25329: athrow
    //   25330: aconst_null
    //   25331: athrow
    //   25332: aconst_null
    //   25333: athrow
    //   25334: aconst_null
    //   25335: athrow
    //   25336: aconst_null
    //   25337: athrow
    //   25338: aconst_null
    //   25339: athrow
    //   25340: aconst_null
    //   25341: athrow
    //   25342: aconst_null
    //   25343: athrow
    //   25344: aconst_null
    //   25345: athrow
    //   25346: aconst_null
    //   25347: athrow
    //   25348: aconst_null
    //   25349: athrow
    //   25350: aconst_null
    //   25351: athrow
    //   25352: aconst_null
    //   25353: athrow
    //   25354: aconst_null
    //   25355: athrow
    //   25356: aconst_null
    //   25357: athrow
    //   25358: aconst_null
    //   25359: athrow
    //   25360: aconst_null
    //   25361: athrow
    //   25362: aconst_null
    //   25363: athrow
    //   25364: aconst_null
    //   25365: athrow
    //   25366: aconst_null
    //   25367: athrow
    //   25368: aconst_null
    //   25369: athrow
    //   25370: aconst_null
    //   25371: athrow
    //   25372: aconst_null
    //   25373: athrow
    //   25374: aconst_null
    //   25375: athrow
    //   25376: aconst_null
    //   25377: athrow
    //   25378: aconst_null
    //   25379: athrow
    //   25380: aconst_null
    //   25381: athrow
    //   25382: aconst_null
    //   25383: athrow
    //   25384: aconst_null
    //   25385: athrow
    //   25386: aconst_null
    //   25387: athrow
    //   25388: aconst_null
    //   25389: athrow
    //   25390: aconst_null
    //   25391: athrow
    //   25392: aconst_null
    //   25393: athrow
    //   25394: aconst_null
    //   25395: athrow
    //   25396: aconst_null
    //   25397: athrow
    //   25398: aconst_null
    //   25399: athrow
    //   25400: aconst_null
    //   25401: athrow
    //   25402: aconst_null
    //   25403: athrow
    //   25404: aconst_null
    //   25405: athrow
    //   25406: aconst_null
    //   25407: athrow
    //   25408: aconst_null
    //   25409: athrow
    //   25410: aconst_null
    //   25411: athrow
    //   25412: aconst_null
    //   25413: athrow
    //   25414: aconst_null
    //   25415: athrow
    //   25416: aconst_null
    //   25417: athrow
    //   25418: aconst_null
    //   25419: athrow
    //   25420: aconst_null
    //   25421: athrow
    //   25422: aconst_null
    //   25423: athrow
    //   25424: aconst_null
    //   25425: athrow
    //   25426: aconst_null
    //   25427: athrow
    //   25428: aconst_null
    //   25429: athrow
    //   25430: aconst_null
    //   25431: athrow
    //   25432: aconst_null
    //   25433: athrow
    //   25434: aconst_null
    //   25435: athrow
    //   25436: aconst_null
    //   25437: athrow
    //   25438: aconst_null
    //   25439: athrow
    //   25440: aconst_null
    //   25441: athrow
    //   25442: aconst_null
    //   25443: athrow
    //   25444: aconst_null
    //   25445: athrow
    //   25446: aconst_null
    //   25447: athrow
    //   25448: aconst_null
    //   25449: athrow
    //   25450: aconst_null
    //   25451: athrow
    //   25452: aconst_null
    //   25453: athrow
    //   25454: aconst_null
    //   25455: athrow
    //   25456: aconst_null
    //   25457: athrow
    //   25458: aconst_null
    //   25459: athrow
    //   25460: aconst_null
    //   25461: athrow
    //   25462: aconst_null
    //   25463: athrow
    //   25464: aconst_null
    //   25465: athrow
    //   25466: aconst_null
    //   25467: athrow
    //   25468: aconst_null
    //   25469: athrow
    //   25470: aconst_null
    //   25471: athrow
    //   25472: aconst_null
    //   25473: athrow
    //   25474: aconst_null
    //   25475: athrow
    //   25476: aconst_null
    //   25477: athrow
    //   25478: aconst_null
    //   25479: athrow
    //   25480: aconst_null
    //   25481: athrow
    //   25482: aconst_null
    //   25483: athrow
    //   25484: aconst_null
    //   25485: athrow
    //   25486: aconst_null
    //   25487: athrow
    //   25488: aconst_null
    //   25489: athrow
    //   25490: aconst_null
    //   25491: athrow
    //   25492: aconst_null
    //   25493: athrow
    //   25494: aconst_null
    //   25495: athrow
    //   25496: aconst_null
    //   25497: athrow
    //   25498: aconst_null
    //   25499: athrow
    //   25500: aconst_null
    //   25501: athrow
    //   25502: aconst_null
    //   25503: athrow
    //   25504: aconst_null
    //   25505: athrow
    //   25506: aconst_null
    //   25507: athrow
    //   25508: aconst_null
    //   25509: athrow
    //   25510: aconst_null
    //   25511: athrow
    //   25512: aconst_null
    //   25513: athrow
    //   25514: aconst_null
    //   25515: athrow
    //   25516: aconst_null
    //   25517: athrow
    //   25518: aconst_null
    //   25519: athrow
    //   25520: aconst_null
    //   25521: athrow
    //   25522: aconst_null
    //   25523: athrow
    //   25524: aconst_null
    //   25525: athrow
    //   25526: aconst_null
    //   25527: athrow
    //   25528: aconst_null
    //   25529: athrow
    //   25530: aconst_null
    //   25531: athrow
    //   25532: aconst_null
    //   25533: athrow
    //   25534: aconst_null
    //   25535: athrow
    //   25536: aconst_null
    //   25537: athrow
    //   25538: aconst_null
    //   25539: athrow
    //   25540: aconst_null
    //   25541: athrow
    //   25542: aconst_null
    //   25543: athrow
    //   25544: aconst_null
    //   25545: athrow
    //   25546: aconst_null
    //   25547: athrow
    //   25548: aconst_null
    //   25549: athrow
    //   25550: aconst_null
    //   25551: athrow
    //   25552: aconst_null
    //   25553: athrow
    //   25554: aconst_null
    //   25555: athrow
    //   25556: aconst_null
    //   25557: athrow
    //   25558: aconst_null
    //   25559: athrow
    //   25560: aconst_null
    //   25561: athrow
    //   25562: aconst_null
    //   25563: athrow
    //   25564: aconst_null
    //   25565: athrow
    //   25566: aconst_null
    //   25567: athrow
    //   25568: aconst_null
    //   25569: athrow
    //   25570: aconst_null
    //   25571: athrow
    //   25572: aconst_null
    //   25573: athrow
    //   25574: aconst_null
    //   25575: athrow
    //   25576: aconst_null
    //   25577: athrow
    //   25578: aconst_null
    //   25579: athrow
    //   25580: aconst_null
    //   25581: athrow
    //   25582: aconst_null
    //   25583: athrow
    //   25584: aconst_null
    //   25585: athrow
    //   25586: aconst_null
    //   25587: athrow
    //   25588: aconst_null
    //   25589: athrow
    //   25590: aconst_null
    //   25591: athrow
    //   25592: aconst_null
    //   25593: athrow
    //   25594: aconst_null
    //   25595: athrow
    //   25596: aconst_null
    //   25597: athrow
    //   25598: aconst_null
    //   25599: athrow
    //   25600: aconst_null
    //   25601: athrow
    //   25602: aconst_null
    //   25603: athrow
    //   25604: aconst_null
    //   25605: athrow
    //   25606: aconst_null
    //   25607: athrow
    //   25608: aconst_null
    //   25609: athrow
    //   25610: aconst_null
    //   25611: athrow
    //   25612: aconst_null
    //   25613: athrow
    //   25614: aconst_null
    //   25615: athrow
    //   25616: aconst_null
    //   25617: athrow
    //   25618: aconst_null
    //   25619: athrow
    //   25620: aconst_null
    //   25621: athrow
    //   25622: aconst_null
    //   25623: athrow
    //   25624: aconst_null
    //   25625: athrow
    //   25626: aconst_null
    //   25627: athrow
    //   25628: aconst_null
    //   25629: athrow
    //   25630: aconst_null
    //   25631: athrow
    //   25632: aconst_null
    //   25633: athrow
    //   25634: aconst_null
    //   25635: athrow
    //   25636: aconst_null
    //   25637: athrow
    //   25638: aconst_null
    //   25639: athrow
    //   25640: aconst_null
    //   25641: athrow
    //   25642: aconst_null
    //   25643: athrow
    //   25644: aconst_null
    //   25645: athrow
    //   25646: aconst_null
    //   25647: athrow
    //   25648: aconst_null
    //   25649: athrow
    //   25650: aconst_null
    //   25651: athrow
    //   25652: aconst_null
    //   25653: athrow
    //   25654: aconst_null
    //   25655: athrow
    //   25656: aconst_null
    //   25657: athrow
    //   25658: aconst_null
    //   25659: athrow
    //   25660: aconst_null
    //   25661: athrow
    //   25662: aconst_null
    //   25663: athrow
    //   25664: aconst_null
    //   25665: athrow
    //   25666: aconst_null
    //   25667: athrow
    //   25668: aconst_null
    //   25669: athrow
    //   25670: aconst_null
    //   25671: athrow
    //   25672: aconst_null
    //   25673: athrow
    //   25674: aconst_null
    //   25675: athrow
    //   25676: aconst_null
    //   25677: athrow
    //   25678: aconst_null
    //   25679: athrow
    //   25680: aconst_null
    //   25681: athrow
    //   25682: aconst_null
    //   25683: athrow
    //   25684: aconst_null
    //   25685: athrow
    //   25686: aconst_null
    //   25687: athrow
    //   25688: aconst_null
    //   25689: athrow
    //   25690: aconst_null
    //   25691: athrow
    //   25692: aconst_null
    //   25693: athrow
    //   25694: aconst_null
    //   25695: athrow
    //   25696: aconst_null
    //   25697: athrow
    //   25698: aconst_null
    //   25699: athrow
    //   25700: aconst_null
    //   25701: athrow
    //   25702: aconst_null
    //   25703: athrow
    //   25704: aconst_null
    //   25705: athrow
    //   25706: aconst_null
    //   25707: athrow
    //   25708: aconst_null
    //   25709: athrow
    //   25710: aconst_null
    //   25711: athrow
    //   25712: aconst_null
    //   25713: athrow
    //   25714: aconst_null
    //   25715: athrow
    //   25716: aconst_null
    //   25717: athrow
    //   25718: aconst_null
    //   25719: athrow
    //   25720: aconst_null
    //   25721: athrow
    //   25722: aconst_null
    //   25723: athrow
    //   25724: aconst_null
    //   25725: athrow
    //   25726: aconst_null
    //   25727: athrow
    //   25728: aconst_null
    //   25729: athrow
    //   25730: aconst_null
    //   25731: athrow
    //   25732: aconst_null
    //   25733: athrow
    //   25734: aconst_null
    //   25735: athrow
    //   25736: aconst_null
    //   25737: athrow
    //   25738: aconst_null
    //   25739: athrow
    //   25740: aconst_null
    //   25741: athrow
    //   25742: aconst_null
    //   25743: athrow
    //   25744: aconst_null
    //   25745: athrow
    //   25746: aconst_null
    //   25747: athrow
    //   25748: aconst_null
    //   25749: athrow
    //   25750: aconst_null
    //   25751: athrow
    //   25752: aconst_null
    //   25753: athrow
    //   25754: aconst_null
    //   25755: athrow
    //   25756: aconst_null
    //   25757: athrow
    //   25758: aconst_null
    //   25759: athrow
    //   25760: aconst_null
    //   25761: athrow
    //   25762: aconst_null
    //   25763: athrow
    //   25764: aconst_null
    //   25765: athrow
    //   25766: aconst_null
    //   25767: athrow
    //   25768: aconst_null
    //   25769: athrow
    //   25770: aconst_null
    //   25771: athrow
    //   25772: aconst_null
    //   25773: athrow
    //   25774: aconst_null
    //   25775: athrow
    //   25776: aconst_null
    //   25777: athrow
    //   25778: aconst_null
    //   25779: athrow
    //   25780: aconst_null
    //   25781: athrow
    //   25782: aconst_null
    //   25783: athrow
    //   25784: aconst_null
    //   25785: athrow
    //   25786: aconst_null
    //   25787: athrow
    //   25788: aconst_null
    //   25789: athrow
    //   25790: aconst_null
    //   25791: athrow
    //   25792: aconst_null
    //   25793: athrow
    //   25794: aconst_null
    //   25795: athrow
    //   25796: aconst_null
    //   25797: athrow
    //   25798: aconst_null
    //   25799: athrow
    //   25800: aconst_null
    //   25801: athrow
    //   25802: aconst_null
    //   25803: athrow
    //   25804: aconst_null
    //   25805: athrow
    //   25806: aconst_null
    //   25807: athrow
    //   25808: aconst_null
    //   25809: athrow
    //   25810: aconst_null
    //   25811: athrow
    //   25812: aconst_null
    //   25813: athrow
    //   25814: aconst_null
    //   25815: athrow
    //   25816: aconst_null
    //   25817: athrow
    //   25818: aconst_null
    //   25819: athrow
    //   25820: aconst_null
    //   25821: athrow
    //   25822: aconst_null
    //   25823: athrow
    //   25824: aconst_null
    //   25825: athrow
    //   25826: aconst_null
    //   25827: athrow
    //   25828: aconst_null
    //   25829: athrow
    //   25830: aconst_null
    //   25831: athrow
    //   25832: aconst_null
    //   25833: athrow
    //   25834: aconst_null
    //   25835: athrow
    //   25836: aconst_null
    //   25837: athrow
    //   25838: aconst_null
    //   25839: athrow
    //   25840: aconst_null
    //   25841: athrow
    //   25842: aconst_null
    //   25843: athrow
    //   25844: aconst_null
    //   25845: athrow
    //   25846: aconst_null
    //   25847: athrow
    //   25848: aconst_null
    //   25849: athrow
    //   25850: aconst_null
    //   25851: athrow
    //   25852: aconst_null
    //   25853: athrow
    //   25854: aconst_null
    //   25855: athrow
    //   25856: aconst_null
    //   25857: athrow
    //   25858: aconst_null
    //   25859: athrow
    //   25860: aconst_null
    //   25861: athrow
    //   25862: aconst_null
    //   25863: athrow
    //   25864: aconst_null
    //   25865: athrow
    //   25866: aconst_null
    //   25867: athrow
    //   25868: aconst_null
    //   25869: athrow
    //   25870: aconst_null
    //   25871: athrow
    //   25872: aconst_null
    //   25873: athrow
    //   25874: aconst_null
    //   25875: athrow
    //   25876: aconst_null
    //   25877: athrow
    //   25878: aconst_null
    //   25879: athrow
    //   25880: aconst_null
    //   25881: athrow
    //   25882: aconst_null
    //   25883: athrow
    //   25884: aconst_null
    //   25885: athrow
    //   25886: aconst_null
    //   25887: athrow
    //   25888: aconst_null
    //   25889: athrow
    //   25890: aconst_null
    //   25891: athrow
    //   25892: aconst_null
    //   25893: athrow
    //   25894: aconst_null
    //   25895: athrow
    //   25896: aconst_null
    //   25897: athrow
    //   25898: aconst_null
    //   25899: athrow
    //   25900: aconst_null
    //   25901: athrow
    //   25902: aconst_null
    //   25903: athrow
    //   25904: aconst_null
    //   25905: athrow
    //   25906: aconst_null
    //   25907: athrow
    //   25908: aconst_null
    //   25909: athrow
    //   25910: aconst_null
    //   25911: athrow
    //   25912: aconst_null
    //   25913: athrow
    //   25914: aconst_null
    //   25915: athrow
    //   25916: aconst_null
    //   25917: athrow
    //   25918: aconst_null
    //   25919: athrow
    //   25920: aconst_null
    //   25921: athrow
    //   25922: aconst_null
    //   25923: athrow
    //   25924: pop
    //   25925: goto -> 24
    //   25928: pop
    //   25929: aconst_null
    //   25930: goto -> 25924
    //   25933: dup
    //   25934: ifnull -> 25924
    //   25937: checkcast java/lang/Throwable
    //   25940: athrow
    //   25941: dup
    //   25942: ifnull -> 25928
    //   25945: checkcast java/lang/Throwable
    //   25948: athrow
    //   25949: aconst_null
    //   25950: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   9990	4661	24	healthLine	F
    //   11810	2841	25	lineColor	I
    //   17670	1241	25	stackName	Ljava/lang/String;
    //   18002	909	26	stackNameWidth	I
    //   20170	377	28	armourStack	Lnet/minecraft/item/ItemStack;
    //   22946	272	30	renderStack1	Lnet/minecraft/item/ItemStack;
    //   22378	840	29	armourStack	Lnet/minecraft/item/ItemStack;
    //   21870	1354	28	index	I
    //   19378	4185	25	xOffset	I
    //   19450	4113	26	count	I
    //   20818	2745	27	renderOffhand	Lnet/minecraft/item/ItemStack;
    //   24	25224	0	this	Lbigname/zprestige/webhack/features/modules/Render/Nametags;
    //   24	25224	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	25224	2	x	D
    //   24	25224	4	y	D
    //   24	25224	6	z	D
    //   24	25224	8	delta	F
    //   150	25098	9	tempY	D
    //   694	24554	11	camera	Lnet/minecraft/entity/Entity;
    //   1194	24054	12	originalPositionX	D
    //   1386	23862	14	originalPositionY	D
    //   1578	23670	16	originalPositionZ	D
    //   3574	21674	18	displayTag	Ljava/lang/String;
    //   4562	20686	19	distance	D
    //   4894	20354	21	width	I
    //   5594	19654	22	scale	D
    //   16006	9242	24	renderMainHand	Lnet/minecraft/item/ItemStack;
    // Exception table:
    //   from	to	target	type
    //   8	20	25933	finally
    //   339	346	346	finally
    //   339	346	339	finally
    //   339	346	346	java/util/NoSuchElementException
    //   339	346	3	finally
    //   340	346	346	finally
    //   624	630	630	finally
    //   624	630	630	java/util/ConcurrentModificationException
    //   624	630	630	java/lang/NumberFormatException
    //   624	630	3	finally
    //   624	630	630	java/lang/IllegalStateException
    //   996	1002	1002	finally
    //   996	1002	1002	finally
    //   996	1002	3	finally
    //   996	1002	1002	finally
    //   996	1002	1002	finally
    //   2087	2094	2094	finally
    //   2087	2094	2087	java/lang/ArrayIndexOutOfBoundsException
    //   2088	2094	2087	finally
    //   2088	2094	2087	java/lang/RuntimeException
    //   2088	2094	2087	finally
    //   2667	2674	2674	finally
    //   2667	2674	2667	finally
    //   2667	2674	2674	finally
    //   2668	2674	3	java/lang/IllegalStateException
    //   2668	2674	2667	java/lang/EnumConstantNotPresentException
    //   3247	3254	3254	finally
    //   3247	3254	3247	java/lang/RuntimeException
    //   3247	3254	3	java/lang/NegativeArraySizeException
    //   3248	3254	3254	finally
    //   3248	3254	3247	java/lang/ClassCastException
    //   3504	3510	3510	finally
    //   3504	3510	3	finally
    //   3504	3510	3	java/lang/IndexOutOfBoundsException
    //   3504	3510	3	finally
    //   3504	3510	3510	finally
    //   3827	3834	3834	finally
    //   3827	3834	3834	java/util/ConcurrentModificationException
    //   3827	3834	3834	java/lang/IllegalArgumentException
    //   3828	3834	3	finally
    //   3828	3834	3827	java/lang/AssertionError
    //   4091	4098	4098	finally
    //   4091	4098	3	finally
    //   4091	4098	4091	java/lang/ArrayIndexOutOfBoundsException
    //   4092	4098	3	finally
    //   4092	4098	4098	finally
    //   4355	4362	4362	finally
    //   4355	4362	4362	finally
    //   4355	4362	3	java/lang/NegativeArraySizeException
    //   4355	4362	4362	finally
    //   4355	4362	4355	finally
    //   4491	4498	4498	finally
    //   4491	4498	4491	java/lang/EnumConstantNotPresentException
    //   4491	4498	3	java/lang/NullPointerException
    //   4492	4498	4491	finally
    //   4492	4498	3	java/lang/UnsupportedOperationException
    //   4815	4822	4822	finally
    //   4815	4822	3	finally
    //   4816	4822	3	java/util/NoSuchElementException
    //   4816	4822	4815	java/lang/NullPointerException
    //   4816	4822	3	java/lang/NegativeArraySizeException
    //   5095	5102	5102	finally
    //   5095	5102	5095	java/lang/UnsupportedOperationException
    //   5095	5102	5102	finally
    //   5096	5102	5095	finally
    //   5096	5102	5095	finally
    //   5171	5178	5178	finally
    //   5171	5178	5178	java/lang/NumberFormatException
    //   5171	5178	5171	finally
    //   5172	5178	5171	finally
    //   5172	5178	5171	finally
    //   5432	5438	5438	finally
    //   5432	5438	3	java/lang/IndexOutOfBoundsException
    //   5432	5438	5438	java/lang/IllegalStateException
    //   5432	5438	5438	java/lang/StringIndexOutOfBoundsException
    //   5432	5438	5438	java/lang/AssertionError
    //   5507	5514	5514	finally
    //   5508	5514	5507	java/lang/NullPointerException
    //   5508	5514	5514	finally
    //   5508	5514	5514	java/lang/UnsupportedOperationException
    //   5508	5514	3	java/lang/NegativeArraySizeException
    //   5911	5918	5918	finally
    //   5911	5918	3	java/util/ConcurrentModificationException
    //   5911	5918	3	java/lang/ClassCastException
    //   5912	5918	5918	finally
    //   5912	5918	5911	java/lang/RuntimeException
    //   5987	5994	5994	finally
    //   5987	5994	5994	java/lang/StringIndexOutOfBoundsException
    //   5988	5994	5994	finally
    //   5988	5994	5994	java/lang/RuntimeException
    //   5988	5994	5987	finally
    //   6311	6318	6318	finally
    //   6312	6318	6311	java/lang/AssertionError
    //   6312	6318	6318	finally
    //   6312	6318	6318	finally
    //   6312	6318	6311	java/lang/NumberFormatException
    //   6387	6394	6394	finally
    //   6387	6394	6387	finally
    //   6387	6394	6394	java/lang/ClassCastException
    //   6387	6394	6387	finally
    //   6388	6394	3	java/util/ConcurrentModificationException
    //   6539	6546	6546	finally
    //   6539	6546	6539	java/lang/EnumConstantNotPresentException
    //   6539	6546	6546	finally
    //   6539	6546	6539	finally
    //   6540	6546	6539	java/lang/NullPointerException
    //   6611	6618	6618	finally
    //   6611	6618	3	finally
    //   6611	6618	3	java/lang/EnumConstantNotPresentException
    //   6611	6618	6618	java/lang/AssertionError
    //   6612	6618	6611	finally
    //   6683	6690	6690	finally
    //   6683	6690	6683	finally
    //   6683	6690	3	finally
    //   6683	6690	3	java/lang/StringIndexOutOfBoundsException
    //   6684	6690	6683	java/lang/NegativeArraySizeException
    //   6779	6786	6786	finally
    //   6779	6786	6786	java/lang/IllegalArgumentException
    //   6780	6786	3	finally
    //   6780	6786	6779	finally
    //   6780	6786	6779	finally
    //   6852	6858	6858	finally
    //   6852	6858	3	java/lang/ClassCastException
    //   6852	6858	6858	finally
    //   6852	6858	3	finally
    //   6852	6858	6858	finally
    //   7127	7134	7134	finally
    //   7127	7134	3	java/lang/EnumConstantNotPresentException
    //   7127	7134	7134	java/lang/NegativeArraySizeException
    //   7127	7134	7127	java/lang/EnumConstantNotPresentException
    //   7128	7134	7134	finally
    //   7263	7270	7270	finally
    //   7263	7270	3	java/lang/EnumConstantNotPresentException
    //   7263	7270	7270	finally
    //   7263	7270	7270	java/lang/EnumConstantNotPresentException
    //   7264	7270	7263	java/lang/StringIndexOutOfBoundsException
    //   7440	7446	7446	finally
    //   7440	7446	3	java/lang/IllegalArgumentException
    //   7440	7446	7446	java/lang/IllegalStateException
    //   7440	7446	7446	java/lang/EnumConstantNotPresentException
    //   7440	7446	7446	finally
    //   7575	7582	7582	finally
    //   7575	7582	3	java/util/ConcurrentModificationException
    //   7575	7582	7575	finally
    //   7576	7582	3	java/lang/RuntimeException
    //   7576	7582	7575	java/util/ConcurrentModificationException
    //   8020	8026	8026	finally
    //   8020	8026	8026	finally
    //   8020	8026	3	java/util/NoSuchElementException
    //   8020	8026	3	finally
    //   8020	8026	8026	finally
    //   8283	8290	8290	finally
    //   8283	8290	8283	finally
    //   8283	8290	8283	java/lang/ArrayIndexOutOfBoundsException
    //   8284	8290	8283	java/lang/IndexOutOfBoundsException
    //   8284	8290	8290	finally
    //   8355	8362	8362	finally
    //   8355	8362	8362	java/lang/IndexOutOfBoundsException
    //   8355	8362	8355	java/lang/IllegalArgumentException
    //   8355	8362	8362	java/lang/ArrayIndexOutOfBoundsException
    //   8356	8362	8355	java/util/ConcurrentModificationException
    //   8427	8434	8434	finally
    //   8427	8434	8427	java/lang/ArrayIndexOutOfBoundsException
    //   8427	8434	8427	finally
    //   8428	8434	8434	java/lang/ArrayIndexOutOfBoundsException
    //   8428	8434	8434	java/lang/AssertionError
    //   8499	8506	8506	finally
    //   8500	8506	8499	java/lang/ArrayIndexOutOfBoundsException
    //   8500	8506	3	finally
    //   8500	8506	3	finally
    //   8500	8506	8506	java/util/NoSuchElementException
    //   8695	8702	8702	finally
    //   8695	8702	8695	finally
    //   8695	8702	8695	java/lang/RuntimeException
    //   8696	8702	8695	java/lang/AssertionError
    //   8696	8702	3	java/lang/IllegalArgumentException
    //   8771	8778	8778	finally
    //   8771	8778	8778	java/lang/IllegalStateException
    //   8771	8778	8771	java/util/NoSuchElementException
    //   8772	8778	3	finally
    //   8772	8778	8771	java/lang/UnsupportedOperationException
    //   9331	9338	9338	finally
    //   9331	9338	3	java/util/ConcurrentModificationException
    //   9332	9338	9338	java/lang/ClassCastException
    //   9332	9338	3	java/lang/NumberFormatException
    //   9332	9338	9331	finally
    //   9527	9534	9534	finally
    //   9527	9534	9527	java/lang/IllegalStateException
    //   9528	9534	9534	finally
    //   9528	9534	9527	java/lang/ArrayIndexOutOfBoundsException
    //   9528	9534	3	finally
    //   9603	9610	9610	finally
    //   9603	9610	3	finally
    //   9603	9610	9610	finally
    //   9603	9610	9610	java/lang/UnsupportedOperationException
    //   9604	9610	9603	java/util/ConcurrentModificationException
    //   9787	9794	9794	finally
    //   9787	9794	3	finally
    //   9787	9794	3	java/util/NoSuchElementException
    //   9787	9794	9787	java/lang/ClassCastException
    //   9788	9794	3	finally
    //   9920	9926	9926	finally
    //   9920	9926	9926	finally
    //   9920	9926	3	java/util/NoSuchElementException
    //   9920	9926	3	finally
    //   9920	9926	9926	finally
    //   10215	10222	10222	finally
    //   10215	10222	10222	finally
    //   10216	10222	3	java/lang/RuntimeException
    //   10216	10222	10215	java/lang/ClassCastException
    //   10216	10222	10222	java/lang/IllegalArgumentException
    //   10452	10458	10458	finally
    //   10452	10458	10458	java/lang/NegativeArraySizeException
    //   10452	10458	3	java/lang/NullPointerException
    //   10452	10458	3	java/util/NoSuchElementException
    //   10452	10458	3	finally
    //   10687	10694	10694	finally
    //   10687	10694	10687	java/lang/NegativeArraySizeException
    //   10687	10694	3	finally
    //   10688	10694	10687	finally
    //   10688	10694	10687	java/lang/ClassCastException
    //   10924	10930	10930	finally
    //   10924	10930	3	java/lang/NumberFormatException
    //   10924	10930	10930	java/lang/ClassCastException
    //   10924	10930	3	finally
    //   10924	10930	3	java/lang/AssertionError
    //   11159	11166	11166	finally
    //   11159	11166	11159	finally
    //   11159	11166	11166	java/lang/IndexOutOfBoundsException
    //   11159	11166	3	finally
    //   11160	11166	11159	finally
    //   11395	11402	11402	finally
    //   11395	11402	11402	finally
    //   11395	11402	11395	finally
    //   11395	11402	11402	finally
    //   11396	11402	11395	finally
    //   11631	11638	11638	finally
    //   11631	11638	3	java/lang/ArithmeticException
    //   11631	11638	11638	finally
    //   11632	11638	11638	java/lang/ArithmeticException
    //   11632	11638	11631	java/lang/ArithmeticException
    //   11739	11746	11746	finally
    //   11739	11746	11739	java/lang/AssertionError
    //   11739	11746	11739	finally
    //   11739	11746	3	java/lang/NegativeArraySizeException
    //   11740	11746	11739	finally
    //   12376	12382	12382	finally
    //   12376	12382	12382	finally
    //   12376	12382	3	finally
    //   12376	12382	3	java/lang/ClassCastException
    //   12376	12382	12382	finally
    //   12451	12458	12458	finally
    //   12451	12458	12458	java/lang/NumberFormatException
    //   12451	12458	12458	finally
    //   12452	12458	12451	finally
    //   12452	12458	3	java/lang/IndexOutOfBoundsException
    //   13019	13026	13026	finally
    //   13019	13026	13019	java/lang/IllegalStateException
    //   13020	13026	13026	finally
    //   13020	13026	13026	java/lang/RuntimeException
    //   13020	13026	13026	finally
    //   13155	13162	13162	finally
    //   13155	13162	3	java/util/ConcurrentModificationException
    //   13155	13162	13155	finally
    //   13155	13162	13155	finally
    //   13155	13162	13162	java/lang/IndexOutOfBoundsException
    //   13232	13238	13238	finally
    //   13232	13238	13238	finally
    //   13232	13238	3	finally
    //   13232	13238	3	finally
    //   13232	13238	3	java/lang/UnsupportedOperationException
    //   13304	13310	13310	finally
    //   13304	13310	13310	finally
    //   13304	13310	13310	finally
    //   13304	13310	13310	java/lang/NegativeArraySizeException
    //   13304	13310	3	finally
    //   13375	13382	13382	finally
    //   13375	13382	13382	java/lang/IllegalArgumentException
    //   13375	13382	13375	finally
    //   13375	13382	13382	java/lang/StringIndexOutOfBoundsException
    //   13376	13382	13375	finally
    //   13448	13454	13454	finally
    //   13448	13454	13454	finally
    //   13448	13454	13454	java/lang/IndexOutOfBoundsException
    //   13448	13454	13454	java/lang/AssertionError
    //   13448	13454	13454	finally
    //   13583	13590	13590	finally
    //   13583	13590	3	finally
    //   13583	13590	13590	finally
    //   13583	13590	13590	java/lang/ArithmeticException
    //   13583	13590	13583	java/lang/NumberFormatException
    //   13659	13666	13666	finally
    //   13659	13666	13659	java/lang/ArrayIndexOutOfBoundsException
    //   13659	13666	3	java/lang/IllegalArgumentException
    //   13660	13666	13666	finally
    //   13660	13666	13659	finally
    //   13732	13738	13738	finally
    //   13732	13738	3	finally
    //   13732	13738	13738	java/lang/StringIndexOutOfBoundsException
    //   13732	13738	13738	java/util/ConcurrentModificationException
    //   13732	13738	3	finally
    //   13804	13810	13810	finally
    //   13804	13810	3	finally
    //   13804	13810	13810	java/lang/StringIndexOutOfBoundsException
    //   13804	13810	3	finally
    //   13804	13810	13810	java/util/NoSuchElementException
    //   13875	13882	13882	finally
    //   13875	13882	13875	finally
    //   13875	13882	13875	finally
    //   13876	13882	13882	java/lang/IllegalArgumentException
    //   13876	13882	13875	java/lang/IllegalArgumentException
    //   14643	14650	14650	finally
    //   14643	14650	3	finally
    //   14643	14650	3	finally
    //   14643	14650	3	finally
    //   14644	14650	14643	java/lang/NumberFormatException
    //   14840	14846	14846	finally
    //   14840	14846	14846	finally
    //   14840	14846	14846	java/lang/ClassCastException
    //   14840	14846	14846	java/lang/UnsupportedOperationException
    //   14840	14846	14846	java/lang/AssertionError
    //   14915	14922	14922	finally
    //   14915	14922	14922	java/lang/NullPointerException
    //   14916	14922	3	java/lang/ClassCastException
    //   14916	14922	3	java/lang/NumberFormatException
    //   14916	14922	14915	finally
    //   15587	15594	15594	finally
    //   15587	15594	15587	finally
    //   15587	15594	15587	java/util/NoSuchElementException
    //   15587	15594	3	finally
    //   15588	15594	3	finally
    //   15659	15666	15666	finally
    //   15659	15666	3	finally
    //   15659	15666	15659	java/lang/StringIndexOutOfBoundsException
    //   15659	15666	15659	finally
    //   15659	15666	3	finally
    //   15731	15738	15738	finally
    //   15731	15738	15738	finally
    //   15731	15738	15731	finally
    //   15731	15738	15731	finally
    //   15732	15738	3	java/lang/EnumConstantNotPresentException
    //   15863	15870	15870	finally
    //   15863	15870	15870	finally
    //   15864	15870	15863	java/lang/IndexOutOfBoundsException
    //   15864	15870	15870	java/lang/IndexOutOfBoundsException
    //   15864	15870	15863	java/lang/NegativeArraySizeException
    //   15935	15942	15942	finally
    //   15935	15942	3	java/lang/ArrayIndexOutOfBoundsException
    //   15935	15942	15935	finally
    //   15936	15942	15942	java/lang/NullPointerException
    //   15936	15942	3	java/lang/IllegalStateException
    //   16135	16142	16142	finally
    //   16135	16142	16142	finally
    //   16135	16142	16135	finally
    //   16136	16142	3	java/lang/ClassCastException
    //   16136	16142	16142	finally
    //   16324	16330	16330	finally
    //   16324	16330	16330	java/lang/UnsupportedOperationException
    //   16324	16330	16330	java/lang/NegativeArraySizeException
    //   16324	16330	3	finally
    //   16324	16330	16330	finally
    //   16515	16522	16522	finally
    //   16515	16522	16515	java/lang/StringIndexOutOfBoundsException
    //   16515	16522	16515	java/lang/ArithmeticException
    //   16516	16522	16522	java/lang/IllegalStateException
    //   16516	16522	16515	java/util/ConcurrentModificationException
    //   16903	16910	16910	finally
    //   16903	16910	3	finally
    //   16903	16910	16910	java/lang/EnumConstantNotPresentException
    //   16904	16910	16903	java/lang/NullPointerException
    //   16904	16910	3	java/lang/UnsupportedOperationException
    //   16979	16986	16986	finally
    //   16979	16986	16979	java/util/NoSuchElementException
    //   16979	16986	16979	java/lang/IllegalStateException
    //   16979	16986	16979	java/lang/IndexOutOfBoundsException
    //   16979	16986	16979	finally
    //   17347	17354	17354	finally
    //   17347	17354	17347	java/lang/IllegalStateException
    //   17347	17354	17354	finally
    //   17348	17354	17347	java/lang/EnumConstantNotPresentException
    //   17348	17354	17347	finally
    //   17599	17606	17606	finally
    //   17600	17606	17599	finally
    //   17600	17606	3	java/util/ConcurrentModificationException
    //   17600	17606	17606	java/lang/NegativeArraySizeException
    //   17600	17606	17606	finally
    //   17924	17930	17930	finally
    //   17924	17930	17930	java/lang/AssertionError
    //   17924	17930	17930	finally
    //   17924	17930	17930	finally
    //   17924	17930	17930	java/lang/RuntimeException
    //   18067	18074	18074	finally
    //   18067	18074	18074	finally
    //   18067	18074	18074	java/lang/ArrayIndexOutOfBoundsException
    //   18067	18074	18067	java/lang/StringIndexOutOfBoundsException
    //   18068	18074	18074	finally
    //   18179	18186	18186	finally
    //   18179	18186	3	java/lang/NullPointerException
    //   18179	18186	18179	finally
    //   18180	18186	3	finally
    //   18180	18186	18179	java/lang/ClassCastException
    //   18624	18630	18630	finally
    //   18624	18630	18630	finally
    //   18624	18630	18630	finally
    //   18624	18630	3	finally
    //   18624	18630	18630	finally
    //   18719	18726	18726	finally
    //   18719	18726	18726	java/lang/EnumConstantNotPresentException
    //   18720	18726	18726	finally
    //   18720	18726	3	java/lang/NegativeArraySizeException
    //   18720	18726	18719	java/lang/IllegalArgumentException
    //   18831	18838	18838	finally
    //   18831	18838	18831	java/lang/ArrayIndexOutOfBoundsException
    //   18831	18838	18838	finally
    //   18832	18838	18831	finally
    //   18832	18838	3	java/lang/RuntimeException
    //   18903	18910	18910	finally
    //   18903	18910	3	java/lang/AssertionError
    //   18903	18910	18903	java/lang/NullPointerException
    //   18903	18910	18903	java/util/ConcurrentModificationException
    //   18904	18910	18903	java/lang/IllegalStateException
    //   19099	19106	19106	finally
    //   19100	19106	19099	java/lang/NegativeArraySizeException
    //   19100	19106	19106	java/util/ConcurrentModificationException
    //   19100	19106	19099	finally
    //   19100	19106	3	finally
    //   19175	19182	19182	finally
    //   19175	19182	3	java/lang/EnumConstantNotPresentException
    //   19175	19182	19175	finally
    //   19175	19182	19182	finally
    //   19176	19182	19182	java/lang/EnumConstantNotPresentException
    //   19300	19306	19306	finally
    //   19300	19306	19306	java/lang/NullPointerException
    //   19300	19306	19306	java/lang/RuntimeException
    //   19300	19306	19306	java/lang/IllegalStateException
    //   19300	19306	19306	java/lang/UnsupportedOperationException
    //   19703	19710	19710	finally
    //   19703	19710	19703	java/lang/IllegalArgumentException
    //   19703	19710	19710	finally
    //   19703	19710	19710	finally
    //   19703	19710	19710	finally
    //   19903	19912	19912	finally
    //   19903	19912	3	finally
    //   19903	19912	19912	java/lang/StringIndexOutOfBoundsException
    //   19904	19912	19903	finally
    //   19904	19912	19903	finally
    //   20095	20104	20104	finally
    //   20095	20104	20095	finally
    //   20095	20104	20095	java/lang/ArithmeticException
    //   20095	20104	20095	finally
    //   20096	20104	20095	finally
    //   20419	20426	20426	finally
    //   20419	20426	20426	java/lang/NegativeArraySizeException
    //   20419	20426	20419	java/lang/AssertionError
    //   20420	20426	20419	java/lang/IllegalStateException
    //   20420	20426	20419	java/lang/UnsupportedOperationException
    //   20675	20682	20682	finally
    //   20675	20682	20682	finally
    //   20675	20682	20675	java/lang/ArrayIndexOutOfBoundsException
    //   20676	20682	20682	java/lang/NullPointerException
    //   20676	20682	20675	java/lang/IllegalStateException
    //   20747	20754	20754	finally
    //   20747	20754	3	finally
    //   20747	20754	20747	java/lang/RuntimeException
    //   20748	20754	3	finally
    //   20748	20754	20747	java/lang/IllegalStateException
    //   20947	20954	20954	finally
    //   20947	20954	20947	finally
    //   20947	20954	20947	finally
    //   20948	20954	20954	java/lang/IllegalStateException
    //   20948	20954	20947	java/lang/IllegalArgumentException
    //   21135	21142	21142	finally
    //   21136	21142	21142	java/lang/UnsupportedOperationException
    //   21136	21142	21135	finally
    //   21136	21142	3	java/lang/IllegalArgumentException
    //   21136	21142	21135	java/lang/RuntimeException
    //   21327	21334	21334	finally
    //   21327	21334	21327	finally
    //   21328	21334	21327	finally
    //   21328	21334	3	java/lang/IllegalArgumentException
    //   21328	21334	3	java/lang/AssertionError
    //   21787	21794	21794	finally
    //   21787	21794	3	finally
    //   21787	21794	21787	finally
    //   21788	21794	21794	java/lang/NumberFormatException
    //   21788	21794	3	java/util/NoSuchElementException
    //   22303	22310	22310	finally
    //   22303	22310	3	finally
    //   22303	22310	22303	finally
    //   22304	22310	22310	finally
    //   22304	22310	3	java/util/NoSuchElementException
    //   22623	22630	22630	finally
    //   22623	22630	22623	finally
    //   22623	22630	22630	finally
    //   22623	22630	3	finally
    //   22624	22630	22623	finally
    //   22875	22882	22882	finally
    //   22875	22882	22875	java/lang/IndexOutOfBoundsException
    //   22876	22882	3	finally
    //   22876	22882	22875	finally
    //   22876	22882	22875	java/lang/IllegalArgumentException
    //   23207	23214	23214	finally
    //   23207	23214	23214	finally
    //   23207	23214	23214	java/util/NoSuchElementException
    //   23208	23214	23214	java/lang/ArithmeticException
    //   23208	23214	23207	java/lang/ArrayIndexOutOfBoundsException
    //   23483	23490	23490	finally
    //   23483	23490	23483	java/lang/NegativeArraySizeException
    //   23483	23490	23490	java/lang/ArrayIndexOutOfBoundsException
    //   23484	23490	3	java/lang/ClassCastException
    //   23484	23490	3	finally
    //   23555	23562	23562	finally
    //   23555	23562	3	java/lang/AssertionError
    //   23555	23562	23555	finally
    //   23555	23562	3	java/lang/NumberFormatException
    //   23555	23562	23562	finally
    //   24003	24010	24010	finally
    //   24003	24010	24003	java/util/NoSuchElementException
    //   24003	24010	3	finally
    //   24004	24010	24010	finally
    //   24004	24010	24003	finally
    //   24208	24214	24214	finally
    //   24208	24214	24214	finally
    //   24208	24214	24214	java/lang/IllegalArgumentException
    //   24208	24214	24214	finally
    //   24208	24214	24214	finally
    //   24279	24286	24286	finally
    //   24279	24286	3	finally
    //   24279	24286	24286	java/lang/AssertionError
    //   24279	24286	24286	finally
    //   24280	24286	24279	java/lang/StringIndexOutOfBoundsException
    //   24927	24934	24934	finally
    //   24927	24934	24934	java/lang/NumberFormatException
    //   24927	24934	24934	finally
    //   24927	24934	24927	java/lang/EnumConstantNotPresentException
    //   24928	24934	3	java/lang/ArrayIndexOutOfBoundsException
    //   25000	25006	25006	finally
    //   25000	25006	3	finally
    //   25000	25006	3	java/lang/NegativeArraySizeException
    //   25000	25006	25006	java/lang/UnsupportedOperationException
    //   25000	25006	3	java/lang/NegativeArraySizeException
    //   25071	25078	25078	finally
    //   25071	25078	25078	finally
    //   25071	25078	25078	finally
    //   25071	25078	25071	finally
    //   25072	25078	3	finally
    //   25167	25174	25174	finally
    //   25167	25174	3	finally
    //   25167	25174	25174	java/lang/ClassCastException
    //   25168	25174	3	java/util/NoSuchElementException
    //   25168	25174	25167	finally
    //   25239	25246	25246	finally
    //   25239	25246	25239	finally
    //   25240	25246	25246	java/util/NoSuchElementException
    //   25240	25246	25246	finally
    //   25240	25246	25239	finally
    //   25933	25941	25933	finally
    //   25949	25951	3	java/lang/IllegalStateException
  }
  
  public Nametags() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 364687932
    //   9: l2i
    //   10: ldc_w -1834716772
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1954727987
    //   20: l2i
    //   21: ldc_w 1844601070
    //   24: ixor
    //   25: ldc2_w 962028307
    //   28: l2i
    //   29: ldc_w 1491697993
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 13382, -2026785415 -> 60, -425319942 -> 17
    //   60: aload_0
    //   61: ldc_w '묹㌒뭰㶲ࢠ喪๾용'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w -1750327742
    //   73: l2i
    //   74: ldc_w -230814672
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 1233865031
    //   84: l2i
    //   85: ldc_w -619517883
    //   88: ixor
    //   89: ldc2_w 822525413
    //   92: l2i
    //   93: ldc_w -546950366
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 13200, -1947034443 -> 81, 2096705477 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '묁㌚뭸㶠'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -1477235806
    //   139: l2i
    //   140: ldc_w -44495639
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1965625543
    //   150: l2i
    //   151: ldc_w -573785553
    //   154: ixor
    //   155: ldc2_w 1480155820
    //   158: l2i
    //   159: ldc_w 420224981
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 13322, 372189295 -> 192, 463428146 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -1120267315
    //   204: l2i
    //   205: ldc_w 112178952
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -927548486
    //   215: l2i
    //   216: ldc_w -1922197517
    //   219: ixor
    //   220: ldc2_w 821863022
    //   223: l2i
    //   224: ldc_w 833724571
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 13364, -1160206800 -> 212, 1150693052 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1284702967
    //   262: l2i
    //   263: ldc_w 1284702967
    //   266: ixor
    //   267: ldc2_w 1954474691
    //   270: l2i
    //   271: ldc_w 1954474691
    //   274: ixor
    //   275: ldc2_w 1414618997
    //   278: l2i
    //   279: ldc_w 1414618997
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w 880101809
    //   292: l2i
    //   293: ldc_w -865507993
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1315740166
    //   303: l2i
    //   304: ldc_w -44407056
    //   307: ixor
    //   308: ldc2_w 249085509
    //   311: l2i
    //   312: ldc_w -190288690
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -1863206204 -> 300, 40697437 -> 13272
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w -381981285
    //   356: l2i
    //   357: ldc_w 884248982
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 963569724
    //   367: l2i
    //   368: ldc_w -405477843
    //   371: ixor
    //   372: ldc2_w -1678776935
    //   375: l2i
    //   376: ldc_w -1966080110
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -860887546 -> 13270, -702571918 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w -960080237
    //   418: l2i
    //   419: ldc_w 308848666
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -480362799
    //   429: l2i
    //   430: ldc_w -2107294439
    //   433: ixor
    //   434: ldc2_w 1138792883
    //   437: l2i
    //   438: ldc_w -1776461540
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 13450, -1262042265 -> 468, 22232614 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '묤㌖뭩㶣࢝喥๾용'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -1488850893
    //   485: l2i
    //   486: ldc_w 1256542406
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 15047819
    //   496: l2i
    //   497: ldc_w -917785630
    //   500: ixor
    //   501: ldc2_w -1854955948
    //   504: l2i
    //   505: ldc_w -197567803
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 13136, -1997380508 -> 493, -1392972808 -> 536
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w -161113691
    //   548: l2i
    //   549: ldc_w 1173016742
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 558586373
    //   559: l2i
    //   560: ldc_w 1396510425
    //   563: ixor
    //   564: ldc2_w -58356864
    //   567: l2i
    //   568: ldc_w -536950996
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 600, -1863055953 -> 13386, 835325197 -> 556
    //   600: getstatic bigname/zprestige/webhack/features/modules/Render/Nametags$Settings.RENDER : Lbigname/zprestige/webhack/features/modules/Render/Nametags$Settings;
    //   603: getstatic Perryc.0 : I
    //   606: ifle -> 620
    //   609: ldc2_w 664217341
    //   612: l2i
    //   613: ldc_w -514731095
    //   616: ixor
    //   617: goto -> 628
    //   620: ldc2_w -1088642797
    //   623: l2i
    //   624: ldc_w 412212844
    //   627: ixor
    //   628: ldc2_w -1577012796
    //   631: l2i
    //   632: ldc_w 105638320
    //   635: ixor
    //   636: ixor
    //   637: lookupswitch default -> 664, -1208023209 -> 620, 1653452064 -> 13406
    //   664: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   667: getstatic Perryc.1 : I
    //   670: ifeq -> 684
    //   673: ldc2_w 162877475
    //   676: l2i
    //   677: ldc_w 20215710
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w -854615282
    //   687: l2i
    //   688: ldc_w -1060633603
    //   691: ixor
    //   692: ldc2_w 641088987
    //   695: l2i
    //   696: ldc_w 700500914
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 728, 125293012 -> 13238, 638745024 -> 684
    //   728: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   731: getstatic Perryc.0 : I
    //   734: ifle -> 748
    //   737: ldc2_w 1653823266
    //   740: l2i
    //   741: ldc_w 1548398680
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w -1799596846
    //   751: l2i
    //   752: ldc_w 835874488
    //   755: ixor
    //   756: ldc2_w -1131737924
    //   759: l2i
    //   760: ldc_w 2009608386
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 13414, -174400764 -> 748, 1848444436 -> 792
    //   792: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   795: getstatic Perryc.c : I
    //   798: iflt -> 812
    //   801: ldc2_w -1504485222
    //   804: l2i
    //   805: ldc_w 931686599
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w -1398116528
    //   815: l2i
    //   816: ldc_w -507610440
    //   819: ixor
    //   820: ldc2_w 15542932
    //   823: l2i
    //   824: ldc_w 955069928
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 13484, -1445259487 -> 812, 1964247700 -> 856
    //   856: aload_0
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w 1046053313
    //   866: l2i
    //   867: ldc_w -1508609039
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 1361797115
    //   877: l2i
    //   878: ldc_w 1652604176
    //   881: ixor
    //   882: ldc2_w 1814291870
    //   885: l2i
    //   886: ldc_w 1180657127
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 916, -1870891055 -> 874, -1305382327 -> 13280
    //   916: aload_0
    //   917: new bigname/zprestige/webhack/features/setting/Setting
    //   920: dup
    //   921: ldc_w '묥㌖뭾㶣࢕喥๾욶蹦'
    //   924: getstatic Perryc.0 : I
    //   927: ifle -> 941
    //   930: ldc2_w 1592027279
    //   933: l2i
    //   934: ldc_w 1142216712
    //   937: ixor
    //   938: goto -> 949
    //   941: ldc2_w 487526009
    //   944: l2i
    //   945: ldc_w -1745676791
    //   948: ixor
    //   949: ldc2_w 703089947
    //   952: l2i
    //   953: ldc_w 2003722699
    //   956: ixor
    //   957: ixor
    //   958: lookupswitch default -> 13212, -730188640 -> 984, 1148623959 -> 941
    //   984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   987: ldc2_w 1043581904
    //   990: l2i
    //   991: ldc_w 1043581905
    //   994: ixor
    //   995: getstatic Perryc.0 : I
    //   998: ifle -> 1012
    //   1001: ldc2_w -98314235
    //   1004: l2i
    //   1005: ldc_w -1600616047
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w -1761056926
    //   1015: l2i
    //   1016: ldc_w 1259745835
    //   1019: ixor
    //   1020: ldc2_w -1954099306
    //   1023: l2i
    //   1024: ldc_w -270218666
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1056, -2060474207 -> 1012, 1054430292 -> 13430
    //   1056: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1059: getstatic Perryc.c : I
    //   1062: iflt -> 1076
    //   1065: ldc2_w -705503913
    //   1068: l2i
    //   1069: ldc_w -750841424
    //   1072: ixor
    //   1073: goto -> 1084
    //   1076: ldc2_w -2022318086
    //   1079: l2i
    //   1080: ldc_w -1888867923
    //   1083: ixor
    //   1084: ldc2_w 1608581539
    //   1087: l2i
    //   1088: ldc_w -677037221
    //   1091: ixor
    //   1092: ixor
    //   1093: lookupswitch default -> 13246, -2141467473 -> 1120, -1903561185 -> 1076
    //   1120: aload_0
    //   1121: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   1126: getstatic Perryc.0 : I
    //   1129: ifle -> 1143
    //   1132: ldc2_w -222403640
    //   1135: l2i
    //   1136: ldc_w 584147629
    //   1139: ixor
    //   1140: goto -> 1151
    //   1143: ldc2_w -617647454
    //   1146: l2i
    //   1147: ldc_w -689203442
    //   1150: ixor
    //   1151: ldc2_w 1985814957
    //   1154: l2i
    //   1155: ldc_w 561423301
    //   1158: ixor
    //   1159: ixor
    //   1160: lookupswitch default -> 1188, -2025553139 -> 13516, -580906989 -> 1143
    //   1188: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1191: getstatic Perryc.c : I
    //   1194: iflt -> 1208
    //   1197: ldc2_w 909607748
    //   1200: l2i
    //   1201: ldc_w 1310247709
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w 493044373
    //   1211: l2i
    //   1212: ldc_w -1444925536
    //   1215: ixor
    //   1216: ldc2_w 1802315018
    //   1219: l2i
    //   1220: ldc_w -1184632431
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1252, -1440637758 -> 13520, -166566535 -> 1208
    //   1252: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1255: getstatic Perryc.0 : I
    //   1258: ifle -> 1272
    //   1261: ldc2_w 1548516282
    //   1264: l2i
    //   1265: ldc_w 1702985537
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w 1137400349
    //   1275: l2i
    //   1276: ldc_w 1171518252
    //   1279: ixor
    //   1280: ldc2_w 1309878223
    //   1283: l2i
    //   1284: ldc_w 2139984627
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 13278, 139702727 -> 1272, 931535885 -> 1316
    //   1316: putfield rect : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1319: getstatic Perryc.1 : I
    //   1322: ifeq -> 1336
    //   1325: ldc2_w -209351232
    //   1328: l2i
    //   1329: ldc_w -1319688783
    //   1332: ixor
    //   1333: goto -> 1344
    //   1336: ldc2_w -1774147467
    //   1339: l2i
    //   1340: ldc_w -719903078
    //   1343: ixor
    //   1344: ldc2_w 412673002
    //   1347: l2i
    //   1348: ldc_w 2047639990
    //   1351: ixor
    //   1352: ixor
    //   1353: lookupswitch default -> 13422, 541510189 -> 1336, 566488243 -> 1380
    //   1380: aload_0
    //   1381: getstatic Perryc.1 : I
    //   1384: ifeq -> 1398
    //   1387: ldc2_w -814693082
    //   1390: l2i
    //   1391: ldc_w 1535680062
    //   1394: ixor
    //   1395: goto -> 1406
    //   1398: ldc2_w -1924993472
    //   1401: l2i
    //   1402: ldc_w -2093504800
    //   1405: ixor
    //   1406: ldc2_w -1682200544
    //   1409: l2i
    //   1410: ldc_w -838556556
    //   1413: ixor
    //   1414: ixor
    //   1415: lookupswitch default -> 1440, -1052289204 -> 13384, 1580437380 -> 1398
    //   1440: aload_0
    //   1441: new bigname/zprestige/webhack/features/setting/Setting
    //   1444: dup
    //   1445: ldc_w '묿㌖뭼㶻ࢀ喣๕욳蹭呯'
    //   1448: getstatic Perryc.0 : I
    //   1451: ifle -> 1465
    //   1454: ldc2_w -660603224
    //   1457: l2i
    //   1458: ldc_w -2146166482
    //   1461: ixor
    //   1462: goto -> 1473
    //   1465: ldc2_w 1671500597
    //   1468: l2i
    //   1469: ldc_w 979023922
    //   1472: ixor
    //   1473: ldc2_w -1369075501
    //   1476: l2i
    //   1477: ldc_w 1899582822
    //   1480: ixor
    //   1481: ixor
    //   1482: lookupswitch default -> 13150, -2035847502 -> 1508, -2015944141 -> 1465
    //   1508: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1511: ldc2_w 2120844966
    //   1514: l2i
    //   1515: ldc_w 2120844967
    //   1518: ixor
    //   1519: getstatic Perryc.c : I
    //   1522: iflt -> 1536
    //   1525: ldc2_w -114777380
    //   1528: l2i
    //   1529: ldc_w -1099885493
    //   1532: ixor
    //   1533: goto -> 1544
    //   1536: ldc2_w -1595297369
    //   1539: l2i
    //   1540: ldc_w -1576504472
    //   1543: ixor
    //   1544: ldc2_w -2039980797
    //   1547: l2i
    //   1548: ldc_w -1613263676
    //   1551: ixor
    //   1552: ixor
    //   1553: lookupswitch default -> 1580, -145729046 -> 1536, 1592158032 -> 13482
    //   1580: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1583: getstatic Perryc.1 : I
    //   1586: ifeq -> 1600
    //   1589: ldc2_w 191623373
    //   1592: l2i
    //   1593: ldc_w -133545141
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 374391066
    //   1603: l2i
    //   1604: ldc_w 588130245
    //   1607: ixor
    //   1608: ldc2_w -432072027
    //   1611: l2i
    //   1612: ldc_w 1419946449
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 1644, -1739812257 -> 1600, 1107034354 -> 13134
    //   1644: aload_0
    //   1645: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   1650: getstatic Perryc.0 : I
    //   1653: ifle -> 1667
    //   1656: ldc2_w -1392028158
    //   1659: l2i
    //   1660: ldc_w 1382508146
    //   1663: ixor
    //   1664: goto -> 1675
    //   1667: ldc2_w -550316549
    //   1670: l2i
    //   1671: ldc_w 1809734011
    //   1674: ixor
    //   1675: ldc2_w 61015164
    //   1678: l2i
    //   1679: ldc_w -475515040
    //   1682: ixor
    //   1683: ixor
    //   1684: lookupswitch default -> 13458, 527106924 -> 1667, 1424474012 -> 1712
    //   1712: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1715: getstatic Perryc.1 : I
    //   1718: ifeq -> 1732
    //   1721: ldc2_w -399779230
    //   1724: l2i
    //   1725: ldc_w -267265635
    //   1728: ixor
    //   1729: goto -> 1740
    //   1732: ldc2_w -122150200
    //   1735: l2i
    //   1736: ldc_w 341589351
    //   1739: ixor
    //   1740: ldc2_w -1601887032
    //   1743: l2i
    //   1744: ldc_w 59244001
    //   1747: ixor
    //   1748: ixor
    //   1749: lookupswitch default -> 13298, -1153901866 -> 1732, 1340524166 -> 1776
    //   1776: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1779: getstatic Perryc.0 : I
    //   1782: ifle -> 1796
    //   1785: ldc2_w -2045920612
    //   1788: l2i
    //   1789: ldc_w 1244745799
    //   1792: ixor
    //   1793: goto -> 1804
    //   1796: ldc2_w -1305633016
    //   1799: l2i
    //   1800: ldc_w 141503468
    //   1803: ixor
    //   1804: ldc2_w 53573008
    //   1807: l2i
    //   1808: ldc_w -239617486
    //   1811: ixor
    //   1812: ixor
    //   1813: lookupswitch default -> 13522, 1052386681 -> 1796, 1220836166 -> 1840
    //   1840: putfield line : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1843: getstatic Perryc.c : I
    //   1846: iflt -> 1860
    //   1849: ldc2_w -682483374
    //   1852: l2i
    //   1853: ldc_w -313571499
    //   1856: ixor
    //   1857: goto -> 1868
    //   1860: ldc2_w -191470458
    //   1863: l2i
    //   1864: ldc_w -1065683106
    //   1867: ixor
    //   1868: ldc2_w 1371159836
    //   1871: l2i
    //   1872: ldc_w -1431211434
    //   1875: ixor
    //   1876: ixor
    //   1877: lookupswitch default -> 1904, -1055512243 -> 13236, -355193851 -> 1860
    //   1904: aload_0
    //   1905: getstatic Perryc.0 : I
    //   1908: ifle -> 1922
    //   1911: ldc2_w 1737442674
    //   1914: l2i
    //   1915: ldc_w -1807810785
    //   1918: ixor
    //   1919: goto -> 1930
    //   1922: ldc2_w 811998482
    //   1925: l2i
    //   1926: ldc_w 1869284233
    //   1929: ixor
    //   1930: ldc2_w -1956152643
    //   1933: l2i
    //   1934: ldc_w 1841129064
    //   1937: ixor
    //   1938: ixor
    //   1939: lookupswitch default -> 13288, -1177091506 -> 1964, 359376568 -> 1922
    //   1964: aload_0
    //   1965: new bigname/zprestige/webhack/features/setting/Setting
    //   1968: dup
    //   1969: ldc_w '묥㌒뭴㶹࢖喤๮'
    //   1972: getstatic Perryc.1 : I
    //   1975: ifeq -> 1989
    //   1978: ldc2_w -1713654157
    //   1981: l2i
    //   1982: ldc_w -1482461255
    //   1985: ixor
    //   1986: goto -> 1997
    //   1989: ldc2_w -1952621327
    //   1992: l2i
    //   1993: ldc_w -758409000
    //   1996: ixor
    //   1997: ldc2_w 327956799
    //   2000: l2i
    //   2001: ldc_w -628463127
    //   2004: ixor
    //   2005: ixor
    //   2006: lookupswitch default -> 13156, -1873767169 -> 2032, -142702308 -> 1989
    //   2032: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2035: ldc2_w -900818821
    //   2038: l2i
    //   2039: ldc_w -900818822
    //   2042: ixor
    //   2043: getstatic Perryc.0 : I
    //   2046: ifle -> 2060
    //   2049: ldc2_w 1832474131
    //   2052: l2i
    //   2053: ldc_w 2078106894
    //   2056: ixor
    //   2057: goto -> 2068
    //   2060: ldc2_w -372654251
    //   2063: l2i
    //   2064: ldc_w 1624861532
    //   2067: ixor
    //   2068: ldc2_w 1779368496
    //   2071: l2i
    //   2072: ldc_w 1518560511
    //   2075: ixor
    //   2076: ixor
    //   2077: lookupswitch default -> 2104, -1580329312 -> 2060, 644371922 -> 13172
    //   2104: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2107: getstatic Perryc.c : I
    //   2110: iflt -> 2124
    //   2113: ldc2_w -764772544
    //   2116: l2i
    //   2117: ldc_w -794270003
    //   2120: ixor
    //   2121: goto -> 2132
    //   2124: ldc2_w 1652498363
    //   2127: l2i
    //   2128: ldc_w 1151722308
    //   2131: ixor
    //   2132: ldc2_w 1007649411
    //   2135: l2i
    //   2136: ldc_w 805155143
    //   2139: ixor
    //   2140: ixor
    //   2141: lookupswitch default -> 13302, 288369225 -> 2124, 891866939 -> 2168
    //   2168: aload_0
    //   2169: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   2174: getstatic Perryc.c : I
    //   2177: iflt -> 2191
    //   2180: ldc2_w -2027520485
    //   2183: l2i
    //   2184: ldc_w 1003673255
    //   2187: ixor
    //   2188: goto -> 2199
    //   2191: ldc2_w -1970828705
    //   2194: l2i
    //   2195: ldc_w -1518566143
    //   2198: ixor
    //   2199: ldc2_w -2146447782
    //   2202: l2i
    //   2203: ldc_w 162002051
    //   2206: ixor
    //   2207: ixor
    //   2208: lookupswitch default -> 2236, 890742818 -> 2191, 895259237 -> 13504
    //   2236: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2239: getstatic Perryc.1 : I
    //   2242: ifeq -> 2256
    //   2245: ldc2_w 476087200
    //   2248: l2i
    //   2249: ldc_w 1093375896
    //   2252: ixor
    //   2253: goto -> 2264
    //   2256: ldc2_w -210734236
    //   2259: l2i
    //   2260: ldc_w 57812566
    //   2263: ixor
    //   2264: ldc2_w -1205433304
    //   2267: l2i
    //   2268: ldc_w -624212644
    //   2271: ixor
    //   2272: ixor
    //   2273: lookupswitch default -> 13506, -1829790650 -> 2300, 1067900236 -> 2256
    //   2300: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2303: getstatic Perryc.1 : I
    //   2306: ifeq -> 2320
    //   2309: ldc2_w 124640826
    //   2312: l2i
    //   2313: ldc_w 1319901945
    //   2316: ixor
    //   2317: goto -> 2328
    //   2320: ldc2_w 1590508452
    //   2323: l2i
    //   2324: ldc_w 1099287547
    //   2327: ixor
    //   2328: ldc2_w 789939869
    //   2331: l2i
    //   2332: ldc_w -1709588891
    //   2335: ixor
    //   2336: ixor
    //   2337: lookupswitch default -> 2364, -53609413 -> 13466, 989464124 -> 2320
    //   2364: putfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2367: getstatic Perryc.1 : I
    //   2370: ifeq -> 2384
    //   2373: ldc2_w -709692393
    //   2376: l2i
    //   2377: ldc_w 256514667
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w 140562834
    //   2387: l2i
    //   2388: ldc_w 809931224
    //   2391: ixor
    //   2392: ldc2_w -1008975955
    //   2395: l2i
    //   2396: ldc_w 1456072673
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 13210, -1389127674 -> 2428, 1340945968 -> 2384
    //   2428: aload_0
    //   2429: getstatic Perryc.0 : I
    //   2432: ifle -> 2446
    //   2435: ldc2_w 1765061452
    //   2438: l2i
    //   2439: ldc_w -1314547305
    //   2442: ixor
    //   2443: goto -> 2454
    //   2446: ldc2_w -1907780321
    //   2449: l2i
    //   2450: ldc_w 618656143
    //   2453: ixor
    //   2454: ldc2_w -538428579
    //   2457: l2i
    //   2458: ldc_w 894501993
    //   2461: ixor
    //   2462: ixor
    //   2463: lookupswitch default -> 2488, -970829291 -> 2446, 841487855 -> 13158
    //   2488: aload_0
    //   2489: new bigname/zprestige/webhack/features/setting/Setting
    //   2492: dup
    //   2493: ldc_w '문㌝뭱㶮ࢲ喤๯'
    //   2496: getstatic Perryc.1 : I
    //   2499: ifeq -> 2513
    //   2502: ldc2_w 93795682
    //   2505: l2i
    //   2506: ldc_w 1761479305
    //   2509: ixor
    //   2510: goto -> 2521
    //   2513: ldc2_w 1133227872
    //   2516: l2i
    //   2517: ldc_w 1402493504
    //   2520: ixor
    //   2521: ldc2_w -1656550292
    //   2524: l2i
    //   2525: ldc_w 142893511
    //   2528: ixor
    //   2529: ixor
    //   2530: lookupswitch default -> 2556, -122793408 -> 13180, 557112276 -> 2513
    //   2556: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2559: ldc2_w 266908967
    //   2562: l2i
    //   2563: ldc_w 266908966
    //   2566: ixor
    //   2567: getstatic Perryc.0 : I
    //   2570: ifle -> 2584
    //   2573: ldc2_w -1065057342
    //   2576: l2i
    //   2577: ldc_w 1119888165
    //   2580: ixor
    //   2581: goto -> 2592
    //   2584: ldc2_w -1231507002
    //   2587: l2i
    //   2588: ldc_w 1191706894
    //   2591: ixor
    //   2592: ldc2_w -1669036101
    //   2595: l2i
    //   2596: ldc_w 1142315900
    //   2599: ixor
    //   2600: ixor
    //   2601: lookupswitch default -> 13188, 688024591 -> 2628, 1524005920 -> 2584
    //   2628: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2631: getstatic Perryc.c : I
    //   2634: iflt -> 2648
    //   2637: ldc2_w -846136986
    //   2640: l2i
    //   2641: ldc_w -1123543511
    //   2644: ixor
    //   2645: goto -> 2656
    //   2648: ldc2_w -511505351
    //   2651: l2i
    //   2652: ldc_w -1946169736
    //   2655: ixor
    //   2656: ldc2_w -1062006386
    //   2659: l2i
    //   2660: ldc_w -773891460
    //   2663: ixor
    //   2664: ixor
    //   2665: lookupswitch default -> 2692, 313856509 -> 2648, 1643422909 -> 13508
    //   2692: aload_0
    //   2693: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   2698: getstatic Perryc.1 : I
    //   2701: ifeq -> 2715
    //   2704: ldc2_w -1415325563
    //   2707: l2i
    //   2708: ldc_w -576776868
    //   2711: ixor
    //   2712: goto -> 2723
    //   2715: ldc2_w -1778293865
    //   2718: l2i
    //   2719: ldc_w -824726609
    //   2722: ixor
    //   2723: ldc2_w 1826723910
    //   2726: l2i
    //   2727: ldc_w -2138348629
    //   2730: ixor
    //   2731: ixor
    //   2732: lookupswitch default -> 2760, -1714099903 -> 2715, -1705626060 -> 13464
    //   2760: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2763: getstatic Perryc.c : I
    //   2766: iflt -> 2780
    //   2769: ldc2_w 1068563211
    //   2772: l2i
    //   2773: ldc_w 98900510
    //   2776: ixor
    //   2777: goto -> 2788
    //   2780: ldc2_w -1964504796
    //   2783: l2i
    //   2784: ldc_w 1180838407
    //   2787: ixor
    //   2788: ldc2_w -791975782
    //   2791: l2i
    //   2792: ldc_w -243184977
    //   2795: ixor
    //   2796: ixor
    //   2797: lookupswitch default -> 13214, -306183914 -> 2824, 455066400 -> 2780
    //   2824: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2827: getstatic Perryc.c : I
    //   2830: iflt -> 2844
    //   2833: ldc2_w 90185294
    //   2836: l2i
    //   2837: ldc_w -1670158519
    //   2840: ixor
    //   2841: goto -> 2852
    //   2844: ldc2_w -280122827
    //   2847: l2i
    //   2848: ldc_w -1330532548
    //   2851: ixor
    //   2852: ldc2_w 1578083571
    //   2855: l2i
    //   2856: ldc_w -1155411521
    //   2859: ixor
    //   2860: ixor
    //   2861: lookupswitch default -> 2888, -122769040 -> 2844, 2084375627 -> 13372
    //   2888: putfield onlyFov : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2891: getstatic Perryc.1 : I
    //   2894: ifeq -> 2908
    //   2897: ldc2_w -854692983
    //   2900: l2i
    //   2901: ldc_w 2034363881
    //   2904: ixor
    //   2905: goto -> 2916
    //   2908: ldc2_w -85050280
    //   2911: l2i
    //   2912: ldc_w 1730263904
    //   2915: ixor
    //   2916: ldc2_w 1283686738
    //   2919: l2i
    //   2920: ldc_w -1722265126
    //   2923: ixor
    //   2924: ixor
    //   2925: lookupswitch default -> 13502, 1209292720 -> 2952, 1637111528 -> 2908
    //   2952: aload_0
    //   2953: getstatic Perryc.c : I
    //   2956: iflt -> 2970
    //   2959: ldc2_w -205171617
    //   2962: l2i
    //   2963: ldc_w 721193530
    //   2966: ixor
    //   2967: goto -> 2978
    //   2970: ldc2_w 163811125
    //   2973: l2i
    //   2974: ldc_w -1246793414
    //   2977: ixor
    //   2978: ldc2_w 1432773339
    //   2981: l2i
    //   2982: ldc_w 1761069669
    //   2985: ixor
    //   2986: ixor
    //   2987: lookupswitch default -> 13222, -2114103631 -> 3012, -458721573 -> 2970
    //   3012: aload_0
    //   3013: new bigname/zprestige/webhack/features/setting/Setting
    //   3016: dup
    //   3017: ldc_w '문㌆뭩㶻࢝喥๼'
    //   3020: getstatic Perryc.0 : I
    //   3023: ifle -> 3037
    //   3026: ldc2_w 1456854645
    //   3029: l2i
    //   3030: ldc_w 815301289
    //   3033: ixor
    //   3034: goto -> 3045
    //   3037: ldc2_w 1668857538
    //   3040: l2i
    //   3041: ldc_w 1048618389
    //   3044: ixor
    //   3045: ldc2_w -1639029706
    //   3048: l2i
    //   3049: ldc_w 828272934
    //   3052: ixor
    //   3053: ixor
    //   3054: lookupswitch default -> 3080, -1592006943 -> 3037, -916635188 -> 13182
    //   3080: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3083: ldc2_w -1137113368
    //   3086: l2i
    //   3087: ldc_w -1137113367
    //   3090: ixor
    //   3091: getstatic Perryc.1 : I
    //   3094: ifeq -> 3108
    //   3097: ldc2_w -840074010
    //   3100: l2i
    //   3101: ldc_w 880111999
    //   3104: ixor
    //   3105: goto -> 3116
    //   3108: ldc2_w 83268136
    //   3111: l2i
    //   3112: ldc_w 1098577208
    //   3115: ixor
    //   3116: ldc2_w 740023195
    //   3119: l2i
    //   3120: ldc_w -2033495751
    //   3123: ixor
    //   3124: ixor
    //   3125: lookupswitch default -> 13196, -279122510 -> 3152, 1397262139 -> 3108
    //   3152: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3155: getstatic Perryc.c : I
    //   3158: iflt -> 3172
    //   3161: ldc2_w -174601212
    //   3164: l2i
    //   3165: ldc_w 529459536
    //   3168: ixor
    //   3169: goto -> 3180
    //   3172: ldc2_w 1033024803
    //   3175: l2i
    //   3176: ldc_w -1685092558
    //   3179: ixor
    //   3180: ldc2_w 1302443014
    //   3183: l2i
    //   3184: ldc_w -919419787
    //   3187: ixor
    //   3188: ixor
    //   3189: lookupswitch default -> 3216, 1545720106 -> 3172, 1854559527 -> 13470
    //   3216: aload_0
    //   3217: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   3222: getstatic Perryc.c : I
    //   3225: iflt -> 3239
    //   3228: ldc2_w 1391398109
    //   3231: l2i
    //   3232: ldc_w -2002627651
    //   3235: ixor
    //   3236: goto -> 3247
    //   3239: ldc2_w 827828346
    //   3242: l2i
    //   3243: ldc_w 576648788
    //   3246: ixor
    //   3247: ldc2_w 1986104680
    //   3250: l2i
    //   3251: ldc_w 752846702
    //   3254: ixor
    //   3255: ixor
    //   3256: lookupswitch default -> 3284, -2131536538 -> 13512, -2010452946 -> 3239
    //   3284: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3287: getstatic Perryc.c : I
    //   3290: iflt -> 3304
    //   3293: ldc2_w 523560203
    //   3296: l2i
    //   3297: ldc_w 735909917
    //   3300: ixor
    //   3301: goto -> 3312
    //   3304: ldc2_w -1115105811
    //   3307: l2i
    //   3308: ldc_w 1196205963
    //   3311: ixor
    //   3312: ldc2_w -1953166870
    //   3315: l2i
    //   3316: ldc_w -1635524395
    //   3319: ixor
    //   3320: ixor
    //   3321: lookupswitch default -> 13228, -271410343 -> 3348, 570364969 -> 3304
    //   3348: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3351: getstatic Perryc.0 : I
    //   3354: ifle -> 3368
    //   3357: ldc2_w 51409519
    //   3360: l2i
    //   3361: ldc_w 1756918892
    //   3364: ixor
    //   3365: goto -> 3376
    //   3368: ldc2_w -1681636184
    //   3371: l2i
    //   3372: ldc_w -1346426264
    //   3375: ixor
    //   3376: ldc2_w 775765998
    //   3379: l2i
    //   3380: ldc_w 1325595305
    //   3383: ixor
    //   3384: ixor
    //   3385: lookupswitch default -> 3412, 177718084 -> 13332, 1554423932 -> 3368
    //   3412: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3415: getstatic Perryc.c : I
    //   3418: iflt -> 3432
    //   3421: ldc2_w 1328549686
    //   3424: l2i
    //   3425: ldc_w -1626745225
    //   3428: ixor
    //   3429: goto -> 3440
    //   3432: ldc2_w 1376763600
    //   3435: l2i
    //   3436: ldc_w -1028810692
    //   3439: ixor
    //   3440: ldc2_w -1832127664
    //   3443: l2i
    //   3444: ldc_w -2095533056
    //   3447: ixor
    //   3448: ixor
    //   3449: lookupswitch default -> 3476, -1041588719 -> 13334, 159882957 -> 3432
    //   3476: aload_0
    //   3477: getstatic Perryc.0 : I
    //   3480: ifle -> 3494
    //   3483: ldc2_w -1745281051
    //   3486: l2i
    //   3487: ldc_w 1047451319
    //   3490: ixor
    //   3491: goto -> 3502
    //   3494: ldc2_w -838296216
    //   3497: l2i
    //   3498: ldc_w -91272577
    //   3501: ixor
    //   3502: ldc2_w -1657090921
    //   3505: l2i
    //   3506: ldc_w -750740397
    //   3509: ixor
    //   3510: ixor
    //   3511: lookupswitch default -> 13138, -403859050 -> 3494, 2063435731 -> 3536
    //   3536: aload_0
    //   3537: new bigname/zprestige/webhack/features/setting/Setting
    //   3540: dup
    //   3541: ldc_w '문㌆뭩㶻࢝喥๼웺蹑呯ψ'
    //   3544: getstatic Perryc.1 : I
    //   3547: ifeq -> 3561
    //   3550: ldc2_w 2118444176
    //   3553: l2i
    //   3554: ldc_w -1615983524
    //   3557: ixor
    //   3558: goto -> 3569
    //   3561: ldc2_w -2081222192
    //   3564: l2i
    //   3565: ldc_w 1920624912
    //   3568: ixor
    //   3569: ldc2_w -1620184894
    //   3572: l2i
    //   3573: ldc_w 1005732439
    //   3576: ixor
    //   3577: ixor
    //   3578: lookupswitch default -> 3604, 1165318745 -> 13400, 1171417130 -> 3561
    //   3604: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3607: ldc2_w -271923285
    //   3610: l2i
    //   3611: ldc_w -271923372
    //   3614: ixor
    //   3615: getstatic Perryc.1 : I
    //   3618: ifeq -> 3632
    //   3621: ldc2_w 233720286
    //   3624: l2i
    //   3625: ldc_w -253651262
    //   3628: ixor
    //   3629: goto -> 3640
    //   3632: ldc2_w 536758893
    //   3635: l2i
    //   3636: ldc_w 1989396680
    //   3639: ixor
    //   3640: ldc2_w 571157650
    //   3643: l2i
    //   3644: ldc_w 730463412
    //   3647: ixor
    //   3648: ixor
    //   3649: lookupswitch default -> 13514, -192082118 -> 3632, 1626296963 -> 3676
    //   3676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3679: ldc2_w 1285579275
    //   3682: l2i
    //   3683: ldc_w 1285579275
    //   3686: ixor
    //   3687: getstatic Perryc.c : I
    //   3690: iflt -> 3704
    //   3693: ldc2_w -882323528
    //   3696: l2i
    //   3697: ldc_w -1928076605
    //   3700: ixor
    //   3701: goto -> 3712
    //   3704: ldc2_w 320271838
    //   3707: l2i
    //   3708: ldc_w -274904390
    //   3711: ixor
    //   3712: ldc2_w 1919953476
    //   3715: l2i
    //   3716: ldc_w -191151199
    //   3719: ixor
    //   3720: ixor
    //   3721: lookupswitch default -> 13500, -1064287074 -> 3704, 2053166721 -> 3748
    //   3748: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3751: ldc2_w 528764078
    //   3754: l2i
    //   3755: ldc_w 528763985
    //   3758: ixor
    //   3759: getstatic Perryc.c : I
    //   3762: iflt -> 3776
    //   3765: ldc2_w 1242884103
    //   3768: l2i
    //   3769: ldc_w 1277625742
    //   3772: ixor
    //   3773: goto -> 3784
    //   3776: ldc2_w -1883762814
    //   3779: l2i
    //   3780: ldc_w -1741665544
    //   3783: ixor
    //   3784: ldc2_w 493886184
    //   3787: l2i
    //   3788: ldc_w 1725822082
    //   3791: ixor
    //   3792: ixor
    //   3793: lookupswitch default -> 3820, 1733954958 -> 3776, 2107507683 -> 13264
    //   3820: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3823: getstatic Perryc.c : I
    //   3826: iflt -> 3840
    //   3829: ldc2_w 853993583
    //   3832: l2i
    //   3833: ldc_w 832735758
    //   3836: ixor
    //   3837: goto -> 3848
    //   3840: ldc2_w -990458416
    //   3843: l2i
    //   3844: ldc_w -121810892
    //   3847: ixor
    //   3848: ldc2_w 149443971
    //   3851: l2i
    //   3852: ldc_w 1656154043
    //   3855: ixor
    //   3856: ixor
    //   3857: lookupswitch default -> 3884, -1299951082 -> 3840, 1763364953 -> 13328
    //   3884: aload_0
    //   3885: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   3890: getstatic Perryc.0 : I
    //   3893: ifle -> 3907
    //   3896: ldc2_w 454361810
    //   3899: l2i
    //   3900: ldc_w -971487503
    //   3903: ixor
    //   3904: goto -> 3915
    //   3907: ldc2_w -1443321387
    //   3910: l2i
    //   3911: ldc_w -493451948
    //   3914: ixor
    //   3915: ldc2_w 1358777543
    //   3918: l2i
    //   3919: ldc_w -2034891113
    //   3922: ixor
    //   3923: ixor
    //   3924: lookupswitch default -> 3952, 189140595 -> 13394, 198516657 -> 3907
    //   3952: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3955: getstatic Perryc.1 : I
    //   3958: ifeq -> 3972
    //   3961: ldc2_w -368879379
    //   3964: l2i
    //   3965: ldc_w 1439537171
    //   3968: ixor
    //   3969: goto -> 3980
    //   3972: ldc2_w 671818214
    //   3975: l2i
    //   3976: ldc_w -1923577550
    //   3979: ixor
    //   3980: ldc2_w 474267163
    //   3983: l2i
    //   3984: ldc_w 340056345
    //   3987: ixor
    //   3988: ixor
    //   3989: lookupswitch default -> 13316, -1387016234 -> 4016, -1211193348 -> 3972
    //   4016: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4019: getstatic Perryc.0 : I
    //   4022: ifle -> 4036
    //   4025: ldc2_w 1748414080
    //   4028: l2i
    //   4029: ldc_w 1542208744
    //   4032: ixor
    //   4033: goto -> 4044
    //   4036: ldc2_w 617116970
    //   4039: l2i
    //   4040: ldc_w 127793111
    //   4043: ixor
    //   4044: ldc2_w -240302188
    //   4047: l2i
    //   4048: ldc_w 636041361
    //   4051: ixor
    //   4052: ixor
    //   4053: lookupswitch default -> 4080, -409014931 -> 13248, 1921124684 -> 4036
    //   4080: putfield Ored : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4083: getstatic Perryc.0 : I
    //   4086: ifle -> 4100
    //   4089: ldc2_w 1091841515
    //   4092: l2i
    //   4093: ldc_w -1182191902
    //   4096: ixor
    //   4097: goto -> 4108
    //   4100: ldc2_w 1319863005
    //   4103: l2i
    //   4104: ldc_w 1903708927
    //   4107: ixor
    //   4108: ldc2_w 594039208
    //   4111: l2i
    //   4112: ldc_w -2097883635
    //   4115: ixor
    //   4116: ixor
    //   4117: lookupswitch default -> 13398, -1638969465 -> 4144, 1493271724 -> 4100
    //   4144: aload_0
    //   4145: getstatic Perryc.c : I
    //   4148: iflt -> 4162
    //   4151: ldc2_w -263994560
    //   4154: l2i
    //   4155: ldc_w -776449719
    //   4158: ixor
    //   4159: goto -> 4170
    //   4162: ldc2_w -415407712
    //   4165: l2i
    //   4166: ldc_w -577680087
    //   4169: ixor
    //   4170: ldc2_w -172249403
    //   4173: l2i
    //   4174: ldc_w -833327577
    //   4177: ixor
    //   4178: ixor
    //   4179: lookupswitch default -> 4204, 437539563 -> 13186, 735696049 -> 4162
    //   4204: aload_0
    //   4205: new bigname/zprestige/webhack/features/setting/Setting
    //   4208: dup
    //   4209: ldc_w '문㌆뭩㶻࢝喥๼웺蹄呸ωਢ盁'
    //   4212: getstatic Perryc.c : I
    //   4215: iflt -> 4229
    //   4218: ldc2_w -1820022034
    //   4221: l2i
    //   4222: ldc_w -931702772
    //   4225: ixor
    //   4226: goto -> 4237
    //   4229: ldc2_w -1296676793
    //   4232: l2i
    //   4233: ldc_w -1813163850
    //   4236: ixor
    //   4237: ldc2_w 36323105
    //   4240: l2i
    //   4241: ldc_w -2127463233
    //   4244: ixor
    //   4245: ixor
    //   4246: lookupswitch default -> 13366, -1572840593 -> 4272, -655838852 -> 4229
    //   4272: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4275: ldc2_w 337925430
    //   4278: l2i
    //   4279: ldc_w 337925577
    //   4282: ixor
    //   4283: getstatic Perryc.0 : I
    //   4286: ifle -> 4300
    //   4289: ldc2_w -317222765
    //   4292: l2i
    //   4293: ldc_w -963988052
    //   4296: ixor
    //   4297: goto -> 4308
    //   4300: ldc2_w 490532142
    //   4303: l2i
    //   4304: ldc_w -1377491717
    //   4307: ixor
    //   4308: ldc2_w -55841323
    //   4311: l2i
    //   4312: ldc_w 1490255479
    //   4315: ixor
    //   4316: ixor
    //   4317: lookupswitch default -> 13314, -1880770915 -> 4300, 346118775 -> 4344
    //   4344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4347: ldc2_w 109158880
    //   4350: l2i
    //   4351: ldc_w 109158880
    //   4354: ixor
    //   4355: getstatic Perryc.1 : I
    //   4358: ifeq -> 4372
    //   4361: ldc2_w 106917941
    //   4364: l2i
    //   4365: ldc_w -1632381910
    //   4368: ixor
    //   4369: goto -> 4380
    //   4372: ldc2_w -17822013
    //   4375: l2i
    //   4376: ldc_w -394289833
    //   4379: ixor
    //   4380: ldc2_w 1822647659
    //   4383: l2i
    //   4384: ldc_w 1201104108
    //   4387: ixor
    //   4388: ixor
    //   4389: lookupswitch default -> 13144, -1277647464 -> 4372, 1035702803 -> 4416
    //   4416: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4419: ldc2_w 55491692
    //   4422: l2i
    //   4423: ldc_w 55491731
    //   4426: ixor
    //   4427: getstatic Perryc.c : I
    //   4430: iflt -> 4444
    //   4433: ldc2_w -2122091104
    //   4436: l2i
    //   4437: ldc_w 93781441
    //   4440: ixor
    //   4441: goto -> 4452
    //   4444: ldc2_w -928746121
    //   4447: l2i
    //   4448: ldc_w 791915213
    //   4451: ixor
    //   4452: ldc2_w 720166719
    //   4455: l2i
    //   4456: ldc_w -308623245
    //   4459: ixor
    //   4460: ixor
    //   4461: lookupswitch default -> 13286, 551667958 -> 4488, 1130602285 -> 4444
    //   4488: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4491: getstatic Perryc.c : I
    //   4494: iflt -> 4508
    //   4497: ldc2_w 1178178762
    //   4500: l2i
    //   4501: ldc_w -1928937993
    //   4504: ixor
    //   4505: goto -> 4516
    //   4508: ldc2_w -432589892
    //   4511: l2i
    //   4512: ldc_w -827812679
    //   4515: ixor
    //   4516: ldc2_w 623854627
    //   4519: l2i
    //   4520: ldc_w -2139652382
    //   4523: ixor
    //   4524: ixor
    //   4525: lookupswitch default -> 13290, -1916297788 -> 4552, 1852249084 -> 4508
    //   4552: aload_0
    //   4553: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   4558: getstatic Perryc.0 : I
    //   4561: ifle -> 4575
    //   4564: ldc2_w 1462122908
    //   4567: l2i
    //   4568: ldc_w -905078389
    //   4571: ixor
    //   4572: goto -> 4583
    //   4575: ldc2_w -1462044673
    //   4578: l2i
    //   4579: ldc_w -475544868
    //   4582: ixor
    //   4583: ldc2_w 961039736
    //   4586: l2i
    //   4587: ldc_w -946205240
    //   4590: ixor
    //   4591: ixor
    //   4592: lookupswitch default -> 4620, 615287956 -> 4575, 1677320359 -> 13140
    //   4620: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4623: getstatic Perryc.c : I
    //   4626: iflt -> 4640
    //   4629: ldc2_w -2000556495
    //   4632: l2i
    //   4633: ldc_w 1691962481
    //   4636: ixor
    //   4637: goto -> 4648
    //   4640: ldc2_w -573497591
    //   4643: l2i
    //   4644: ldc_w 324419248
    //   4647: ixor
    //   4648: ldc2_w -696863343
    //   4651: l2i
    //   4652: ldc_w -1749072132
    //   4655: ixor
    //   4656: ixor
    //   4657: lookupswitch default -> 13164, -1890659628 -> 4684, -1378791123 -> 4640
    //   4684: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4687: getstatic Perryc.1 : I
    //   4690: ifeq -> 4704
    //   4693: ldc2_w -1328532329
    //   4696: l2i
    //   4697: ldc_w 628153480
    //   4700: ixor
    //   4701: goto -> 4712
    //   4704: ldc2_w 691812400
    //   4707: l2i
    //   4708: ldc_w -669570660
    //   4711: ixor
    //   4712: ldc2_w -1562724463
    //   4715: l2i
    //   4716: ldc_w -1441915718
    //   4719: ixor
    //   4720: ixor
    //   4721: lookupswitch default -> 13492, -1653325004 -> 4704, -100681081 -> 4748
    //   4748: putfield Ogreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4751: getstatic Perryc.0 : I
    //   4754: ifle -> 4768
    //   4757: ldc2_w -842793558
    //   4760: l2i
    //   4761: ldc_w -1189948064
    //   4764: ixor
    //   4765: goto -> 4776
    //   4768: ldc2_w 604994663
    //   4771: l2i
    //   4772: ldc_w -641934728
    //   4775: ixor
    //   4776: ldc2_w 1299888104
    //   4779: l2i
    //   4780: ldc_w -1302501186
    //   4783: ixor
    //   4784: ixor
    //   4785: lookupswitch default -> 4812, -1946749028 -> 13340, -419584101 -> 4768
    //   4812: aload_0
    //   4813: getstatic Perryc.0 : I
    //   4816: ifle -> 4830
    //   4819: ldc2_w 1759282711
    //   4822: l2i
    //   4823: ldc_w -812566225
    //   4826: ixor
    //   4827: goto -> 4838
    //   4830: ldc2_w 1245203647
    //   4833: l2i
    //   4834: ldc_w -581202296
    //   4837: ixor
    //   4838: ldc2_w -135819468
    //   4841: l2i
    //   4842: ldc_w 1159177206
    //   4845: ixor
    //   4846: ixor
    //   4847: lookupswitch default -> 4872, 364745722 -> 13420, 1169574552 -> 4830
    //   4872: aload_0
    //   4873: new bigname/zprestige/webhack/features/setting/Setting
    //   4876: dup
    //   4877: ldc_w '문㌆뭩㶻࢝喥๼웺蹁呦ϙਢ'
    //   4880: getstatic Perryc.1 : I
    //   4883: ifeq -> 4897
    //   4886: ldc2_w -1938108288
    //   4889: l2i
    //   4890: ldc_w -294167957
    //   4893: ixor
    //   4894: goto -> 4905
    //   4897: ldc2_w -221465410
    //   4900: l2i
    //   4901: ldc_w -1632389097
    //   4904: ixor
    //   4905: ldc2_w -1749299071
    //   4908: l2i
    //   4909: ldc_w -1185368499
    //   4912: ixor
    //   4913: ixor
    //   4914: lookupswitch default -> 4940, 803389685 -> 4897, 1290726439 -> 13336
    //   4940: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4943: ldc2_w 1914141461
    //   4946: l2i
    //   4947: ldc_w 1914141674
    //   4950: ixor
    //   4951: getstatic Perryc.c : I
    //   4954: iflt -> 4968
    //   4957: ldc2_w -603796585
    //   4960: l2i
    //   4961: ldc_w -966250018
    //   4964: ixor
    //   4965: goto -> 4976
    //   4968: ldc2_w -2131031413
    //   4971: l2i
    //   4972: ldc_w -1508883594
    //   4975: ixor
    //   4976: ldc2_w -745798022
    //   4979: l2i
    //   4980: ldc_w -1226750112
    //   4983: ixor
    //   4984: ixor
    //   4985: lookupswitch default -> 5012, -178915511 -> 4968, 2131213139 -> 13318
    //   5012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5015: ldc2_w 1679450844
    //   5018: l2i
    //   5019: ldc_w 1679450844
    //   5022: ixor
    //   5023: getstatic Perryc.1 : I
    //   5026: ifeq -> 5040
    //   5029: ldc2_w 396827979
    //   5032: l2i
    //   5033: ldc_w -478285956
    //   5036: ixor
    //   5037: goto -> 5048
    //   5040: ldc2_w -180808890
    //   5043: l2i
    //   5044: ldc_w -402447648
    //   5047: ixor
    //   5048: ldc2_w -1487853899
    //   5051: l2i
    //   5052: ldc_w -1289499201
    //   5055: ixor
    //   5056: ixor
    //   5057: lookupswitch default -> 13404, -525854403 -> 5040, 155769516 -> 5084
    //   5084: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5087: ldc2_w 1418392222
    //   5090: l2i
    //   5091: ldc_w 1418392161
    //   5094: ixor
    //   5095: getstatic Perryc.c : I
    //   5098: iflt -> 5112
    //   5101: ldc2_w 841854839
    //   5104: l2i
    //   5105: ldc_w 1264043033
    //   5108: ixor
    //   5109: goto -> 5120
    //   5112: ldc2_w -1877500994
    //   5115: l2i
    //   5116: ldc_w 563088193
    //   5119: ixor
    //   5120: ldc2_w -1439578634
    //   5123: l2i
    //   5124: ldc_w -924413540
    //   5127: ixor
    //   5128: ixor
    //   5129: lookupswitch default -> 5156, -1404690616 -> 5112, 464338692 -> 13362
    //   5156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5159: getstatic Perryc.1 : I
    //   5162: ifeq -> 5176
    //   5165: ldc2_w -798595516
    //   5168: l2i
    //   5169: ldc_w -1742496282
    //   5172: ixor
    //   5173: goto -> 5184
    //   5176: ldc2_w 753984987
    //   5179: l2i
    //   5180: ldc_w 1017755597
    //   5183: ixor
    //   5184: ldc2_w -407467420
    //   5187: l2i
    //   5188: ldc_w -798366876
    //   5191: ixor
    //   5192: ixor
    //   5193: lookupswitch default -> 5220, 243607048 -> 5176, 2140836514 -> 13490
    //   5220: aload_0
    //   5221: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   5226: getstatic Perryc.1 : I
    //   5229: ifeq -> 5243
    //   5232: ldc2_w -1709990552
    //   5235: l2i
    //   5236: ldc_w -1858056471
    //   5239: ixor
    //   5240: goto -> 5251
    //   5243: ldc2_w -1733915970
    //   5246: l2i
    //   5247: ldc_w -973124387
    //   5250: ixor
    //   5251: ldc2_w 1861084898
    //   5254: l2i
    //   5255: ldc_w -935179202
    //   5258: ixor
    //   5259: ixor
    //   5260: lookupswitch default -> 13242, -1375962787 -> 5243, -67736385 -> 5288
    //   5288: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5291: getstatic Perryc.c : I
    //   5294: iflt -> 5308
    //   5297: ldc2_w -94243296
    //   5300: l2i
    //   5301: ldc_w -1516039500
    //   5304: ixor
    //   5305: goto -> 5316
    //   5308: ldc2_w 52953555
    //   5311: l2i
    //   5312: ldc_w -904494489
    //   5315: ixor
    //   5316: ldc2_w 491415715
    //   5319: l2i
    //   5320: ldc_w 211369556
    //   5323: ixor
    //   5324: ixor
    //   5325: lookupswitch default -> 5352, 1309782627 -> 13216, 1597297308 -> 5308
    //   5352: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5355: getstatic Perryc.c : I
    //   5358: iflt -> 5372
    //   5361: ldc2_w 2114674835
    //   5364: l2i
    //   5365: ldc_w -961088030
    //   5368: ixor
    //   5369: goto -> 5380
    //   5372: ldc2_w -1903045169
    //   5375: l2i
    //   5376: ldc_w -1669355511
    //   5379: ixor
    //   5380: ldc2_w -138654720
    //   5383: l2i
    //   5384: ldc_w 673851571
    //   5387: ixor
    //   5388: ixor
    //   5389: lookupswitch default -> 5416, -1241981474 -> 5372, 1730933186 -> 13446
    //   5416: putfield Oblue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5419: getstatic Perryc.c : I
    //   5422: iflt -> 5436
    //   5425: ldc2_w 1940075053
    //   5428: l2i
    //   5429: ldc_w -1081016049
    //   5432: ixor
    //   5433: goto -> 5444
    //   5436: ldc2_w 936340898
    //   5439: l2i
    //   5440: ldc_w 243638879
    //   5443: ixor
    //   5444: ldc2_w 954634044
    //   5447: l2i
    //   5448: ldc_w 748416174
    //   5451: ixor
    //   5452: ixor
    //   5453: lookupswitch default -> 13408, -665890640 -> 5436, 758623343 -> 5480
    //   5480: aload_0
    //   5481: getstatic Perryc.c : I
    //   5484: iflt -> 5498
    //   5487: ldc2_w 1986249999
    //   5490: l2i
    //   5491: ldc_w 1894188113
    //   5494: ixor
    //   5495: goto -> 5506
    //   5498: ldc2_w 1696728241
    //   5501: l2i
    //   5502: ldc_w 205113130
    //   5505: ixor
    //   5506: ldc2_w -322693056
    //   5509: l2i
    //   5510: ldc_w 1420155632
    //   5513: ixor
    //   5514: ixor
    //   5515: lookupswitch default -> 13306, -1092287506 -> 5498, -780533461 -> 5540
    //   5540: aload_0
    //   5541: new bigname/zprestige/webhack/features/setting/Setting
    //   5544: dup
    //   5545: ldc_w '문㌆뭩㶻࢝喥๼웺蹑呫υ਩盍煮킋'
    //   5548: getstatic Perryc.c : I
    //   5551: iflt -> 5565
    //   5554: ldc2_w -1569861611
    //   5557: l2i
    //   5558: ldc_w 2135622030
    //   5561: ixor
    //   5562: goto -> 5573
    //   5565: ldc2_w -723788001
    //   5568: l2i
    //   5569: ldc_w 694097466
    //   5572: ixor
    //   5573: ldc2_w -370984240
    //   5576: l2i
    //   5577: ldc_w 460575409
    //   5580: ixor
    //   5581: ixor
    //   5582: lookupswitch default -> 5608, 800471546 -> 13354, 1437020598 -> 5565
    //   5608: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5611: ldc2_w -1487974095
    //   5614: l2i
    //   5615: ldc_w -1487974095
    //   5618: ixor
    //   5619: getstatic Perryc.c : I
    //   5622: iflt -> 5636
    //   5625: ldc2_w -599167924
    //   5628: l2i
    //   5629: ldc_w 1371569282
    //   5632: ixor
    //   5633: goto -> 5644
    //   5636: ldc2_w 1677561227
    //   5639: l2i
    //   5640: ldc_w -349210961
    //   5643: ixor
    //   5644: ldc2_w 877634968
    //   5647: l2i
    //   5648: ldc_w -1517501078
    //   5651: ixor
    //   5652: ixor
    //   5653: lookupswitch default -> 13274, 420584406 -> 5680, 474640444 -> 5636
    //   5680: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5683: getstatic Perryc.0 : I
    //   5686: ifle -> 5700
    //   5689: ldc2_w 1073919302
    //   5692: l2i
    //   5693: ldc_w 702976359
    //   5696: ixor
    //   5697: goto -> 5708
    //   5700: ldc2_w -1710949208
    //   5703: l2i
    //   5704: ldc_w -2137870325
    //   5707: ixor
    //   5708: ldc2_w -1082378456
    //   5711: l2i
    //   5712: ldc_w -1911170700
    //   5715: ixor
    //   5716: ixor
    //   5717: lookupswitch default -> 13346, 738173695 -> 5744, 1485687421 -> 5700
    //   5744: aload_0
    //   5745: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   5750: getstatic Perryc.0 : I
    //   5753: ifle -> 5767
    //   5756: ldc2_w -260935803
    //   5759: l2i
    //   5760: ldc_w 1023471559
    //   5763: ixor
    //   5764: goto -> 5775
    //   5767: ldc2_w 431979621
    //   5770: l2i
    //   5771: ldc_w 2036968550
    //   5774: ixor
    //   5775: ldc2_w 295397050
    //   5778: l2i
    //   5779: ldc_w 24332508
    //   5782: ixor
    //   5783: ixor
    //   5784: lookupswitch default -> 5812, -2095272741 -> 5767, -577065436 -> 13442
    //   5812: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5815: getstatic Perryc.c : I
    //   5818: iflt -> 5832
    //   5821: ldc2_w -677754888
    //   5824: l2i
    //   5825: ldc_w -110084345
    //   5828: ixor
    //   5829: goto -> 5840
    //   5832: ldc2_w -650060854
    //   5835: l2i
    //   5836: ldc_w 1721465748
    //   5839: ixor
    //   5840: ldc2_w 1327323801
    //   5843: l2i
    //   5844: ldc_w 2078392714
    //   5847: ixor
    //   5848: ixor
    //   5849: lookupswitch default -> 5876, 437707756 -> 13360, 872836134 -> 5832
    //   5876: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5879: getstatic Perryc.0 : I
    //   5882: ifle -> 5896
    //   5885: ldc2_w -84736512
    //   5888: l2i
    //   5889: ldc_w 16715003
    //   5892: ixor
    //   5893: goto -> 5904
    //   5896: ldc2_w -1689579705
    //   5899: l2i
    //   5900: ldc_w -2075513255
    //   5903: ixor
    //   5904: ldc2_w -1776774533
    //   5907: l2i
    //   5908: ldc_w -818040707
    //   5911: ixor
    //   5912: ixor
    //   5913: lookupswitch default -> 5940, -2131290833 -> 5896, -1557583619 -> 13250
    //   5940: putfield ORainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5943: getstatic Perryc.c : I
    //   5946: iflt -> 5960
    //   5949: ldc2_w 1230877697
    //   5952: l2i
    //   5953: ldc_w -579623296
    //   5956: ixor
    //   5957: goto -> 5968
    //   5960: ldc2_w 1851452239
    //   5963: l2i
    //   5964: ldc_w -1029576670
    //   5967: ixor
    //   5968: ldc2_w -1443284860
    //   5971: l2i
    //   5972: ldc_w -1933608462
    //   5975: ixor
    //   5976: ixor
    //   5977: lookupswitch default -> 13268, -1984085477 -> 6004, -1318562825 -> 5960
    //   6004: aload_0
    //   6005: getstatic Perryc.0 : I
    //   6008: ifle -> 6022
    //   6011: ldc2_w -816934486
    //   6014: l2i
    //   6015: ldc_w 1869005879
    //   6018: ixor
    //   6019: goto -> 6030
    //   6022: ldc2_w -1403968898
    //   6025: l2i
    //   6026: ldc_w -192997815
    //   6029: ixor
    //   6030: ldc2_w -1263401779
    //   6033: l2i
    //   6034: ldc_w 1889302607
    //   6037: ixor
    //   6038: ixor
    //   6039: lookupswitch default -> 6064, -425947188 -> 6022, 1678125343 -> 13166
    //   6064: aload_0
    //   6065: new bigname/zprestige/webhack/features/setting/Setting
    //   6068: dup
    //   6069: ldc_w '문㌆뭩㶻࢝喥๼웺蹔呣ψਲ਼盇'
    //   6072: getstatic Perryc.0 : I
    //   6075: ifle -> 6089
    //   6078: ldc2_w -727467845
    //   6081: l2i
    //   6082: ldc_w -278954343
    //   6085: ixor
    //   6086: goto -> 6097
    //   6089: ldc2_w 1855749595
    //   6092: l2i
    //   6093: ldc_w -573590830
    //   6096: ixor
    //   6097: ldc2_w -1145817241
    //   6100: l2i
    //   6101: ldc_w -429958934
    //   6104: ixor
    //   6105: ixor
    //   6106: lookupswitch default -> 6132, 496391879 -> 6089, 1712826799 -> 13226
    //   6132: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6135: ldc_w 6.0760007
    //   6138: invokestatic floatToIntBits : (F)I
    //   6141: ldc_w 2135060121
    //   6144: ixor
    //   6145: invokestatic intBitsToFloat : (I)F
    //   6148: getstatic Perryc.0 : I
    //   6151: ifle -> 6165
    //   6154: ldc2_w 1222465768
    //   6157: l2i
    //   6158: ldc_w -932445707
    //   6161: ixor
    //   6162: goto -> 6173
    //   6165: ldc2_w -240918569
    //   6168: l2i
    //   6169: ldc_w 1042903492
    //   6172: ixor
    //   6173: ldc2_w 2048557737
    //   6176: l2i
    //   6177: ldc_w 1362247321
    //   6180: ixor
    //   6181: ixor
    //   6182: lookupswitch default -> 13488, -1415977683 -> 6165, -459140573 -> 6208
    //   6208: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6211: ldc_w 6.166055E35
    //   6214: invokestatic floatToIntBits : (F)I
    //   6217: ldc_w 2062385663
    //   6220: ixor
    //   6221: invokestatic intBitsToFloat : (I)F
    //   6224: getstatic Perryc.1 : I
    //   6227: ifeq -> 6241
    //   6230: ldc2_w 29902972
    //   6233: l2i
    //   6234: ldc_w -418462932
    //   6237: ixor
    //   6238: goto -> 6249
    //   6241: ldc2_w 1004765182
    //   6244: l2i
    //   6245: ldc_w -1994907765
    //   6248: ixor
    //   6249: ldc2_w 624474413
    //   6252: l2i
    //   6253: ldc_w -1527524917
    //   6256: ixor
    //   6257: ixor
    //   6258: lookupswitch default -> 6284, 302008891 -> 6241, 1728963510 -> 13218
    //   6284: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6287: ldc_w 0.11455511
    //   6290: invokestatic floatToIntBits : (F)I
    //   6293: ldc_w 2102041567
    //   6296: ixor
    //   6297: invokestatic intBitsToFloat : (I)F
    //   6300: getstatic Perryc.1 : I
    //   6303: ifeq -> 6317
    //   6306: ldc2_w 587058975
    //   6309: l2i
    //   6310: ldc_w 421921305
    //   6313: ixor
    //   6314: goto -> 6325
    //   6317: ldc2_w 1106924961
    //   6320: l2i
    //   6321: ldc_w 2001716759
    //   6324: ixor
    //   6325: ldc2_w -662454109
    //   6328: l2i
    //   6329: ldc_w 1774968960
    //   6332: ixor
    //   6333: ixor
    //   6334: lookupswitch default -> 6360, -1970016987 -> 13326, -451246191 -> 6317
    //   6360: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6363: getstatic Perryc.1 : I
    //   6366: ifeq -> 6380
    //   6369: ldc2_w 1312502548
    //   6372: l2i
    //   6373: ldc_w 1971653181
    //   6376: ixor
    //   6377: goto -> 6388
    //   6380: ldc2_w 518803710
    //   6383: l2i
    //   6384: ldc_w 2002481328
    //   6387: ixor
    //   6388: ldc2_w -1262501870
    //   6391: l2i
    //   6392: ldc_w 304762056
    //   6395: ixor
    //   6396: ixor
    //   6397: lookupswitch default -> 6424, -1791678878 -> 6380, -1658079757 -> 13208
    //   6424: aload_0
    //   6425: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   6430: getstatic Perryc.0 : I
    //   6433: ifle -> 6447
    //   6436: ldc2_w -1699883080
    //   6439: l2i
    //   6440: ldc_w 1270970666
    //   6443: ixor
    //   6444: goto -> 6455
    //   6447: ldc2_w -659059169
    //   6450: l2i
    //   6451: ldc_w -84260027
    //   6454: ixor
    //   6455: ldc2_w -809235991
    //   6458: l2i
    //   6459: ldc_w 37310066
    //   6462: ixor
    //   6463: ixor
    //   6464: lookupswitch default -> 13312, -273644863 -> 6492, 479324425 -> 6447
    //   6492: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6495: getstatic Perryc.c : I
    //   6498: iflt -> 6512
    //   6501: ldc2_w -436729839
    //   6504: l2i
    //   6505: ldc_w -399354194
    //   6508: ixor
    //   6509: goto -> 6520
    //   6512: ldc2_w -559884745
    //   6515: l2i
    //   6516: ldc_w 857060024
    //   6519: ixor
    //   6520: ldc2_w -1051266274
    //   6523: l2i
    //   6524: ldc_w -186809196
    //   6527: ixor
    //   6528: ixor
    //   6529: lookupswitch default -> 13258, -667020539 -> 6556, 943794485 -> 6512
    //   6556: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6559: getstatic Perryc.1 : I
    //   6562: ifeq -> 6576
    //   6565: ldc2_w 538215761
    //   6568: l2i
    //   6569: ldc_w -910410262
    //   6572: ixor
    //   6573: goto -> 6584
    //   6576: ldc2_w -1443706170
    //   6579: l2i
    //   6580: ldc_w 1959800016
    //   6583: ixor
    //   6584: ldc2_w 1532491062
    //   6587: l2i
    //   6588: ldc_w -933294394
    //   6591: ixor
    //   6592: ixor
    //   6593: lookupswitch default -> 13474, 1311383014 -> 6620, 2057323339 -> 6576
    //   6620: putfield Owidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6623: getstatic Perryc.c : I
    //   6626: iflt -> 6640
    //   6629: ldc2_w -1330449313
    //   6632: l2i
    //   6633: ldc_w -123825835
    //   6636: ixor
    //   6637: goto -> 6648
    //   6640: ldc2_w -271729034
    //   6643: l2i
    //   6644: ldc_w 1491220691
    //   6647: ixor
    //   6648: ldc2_w 1356470121
    //   6651: l2i
    //   6652: ldc_w 1099704539
    //   6655: ixor
    //   6656: ixor
    //   6657: lookupswitch default -> 13358, -1501972201 -> 6684, 1501190840 -> 6640
    //   6684: aload_0
    //   6685: getstatic Perryc.c : I
    //   6688: iflt -> 6702
    //   6691: ldc2_w 1784924312
    //   6694: l2i
    //   6695: ldc_w -1373380185
    //   6698: ixor
    //   6699: goto -> 6710
    //   6702: ldc2_w -592922252
    //   6705: l2i
    //   6706: ldc_w -153694038
    //   6709: ixor
    //   6710: ldc2_w 1117308411
    //   6713: l2i
    //   6714: ldc_w 115440135
    //   6717: ixor
    //   6718: ixor
    //   6719: lookupswitch default -> 13244, -2143709501 -> 6702, 1846007330 -> 6744
    //   6744: aload_0
    //   6745: new bigname/zprestige/webhack/features/setting/Setting
    //   6748: dup
    //   6749: ldc_w '묶㌁뭰㶸ࢆ'
    //   6752: getstatic Perryc.0 : I
    //   6755: ifle -> 6769
    //   6758: ldc2_w -338173047
    //   6761: l2i
    //   6762: ldc_w -1781807588
    //   6765: ixor
    //   6766: goto -> 6777
    //   6769: ldc2_w -1576251520
    //   6772: l2i
    //   6773: ldc_w -1207752400
    //   6776: ixor
    //   6777: ldc2_w 706716476
    //   6780: l2i
    //   6781: ldc_w -685249237
    //   6784: ixor
    //   6785: ixor
    //   6786: lookupswitch default -> 13462, -2094765182 -> 6769, -415815513 -> 6812
    //   6812: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6815: ldc2_w 1411516981
    //   6818: l2i
    //   6819: ldc_w 1411516980
    //   6822: ixor
    //   6823: getstatic Perryc.c : I
    //   6826: iflt -> 6840
    //   6829: ldc2_w -686566241
    //   6832: l2i
    //   6833: ldc_w 1747169924
    //   6836: ixor
    //   6837: goto -> 6848
    //   6840: ldc2_w 531028584
    //   6843: l2i
    //   6844: ldc_w 2139616135
    //   6847: ixor
    //   6848: ldc2_w 791441566
    //   6851: l2i
    //   6852: ldc_w -1961479019
    //   6855: ixor
    //   6856: ixor
    //   6857: lookupswitch default -> 6884, -612167461 -> 6840, 453648912 -> 13480
    //   6884: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   6887: getstatic Perryc.0 : I
    //   6890: ifle -> 6904
    //   6893: ldc2_w -467209070
    //   6896: l2i
    //   6897: ldc_w 1144513484
    //   6900: ixor
    //   6901: goto -> 6912
    //   6904: ldc2_w 1384894996
    //   6907: l2i
    //   6908: ldc_w 1420700596
    //   6911: ixor
    //   6912: ldc2_w -1070110225
    //   6915: l2i
    //   6916: ldc_w -811258353
    //   6919: ixor
    //   6920: ixor
    //   6921: lookupswitch default -> 13342, -1350348610 -> 6904, 163036736 -> 6948
    //   6948: aload_0
    //   6949: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   6954: getstatic Perryc.1 : I
    //   6957: ifeq -> 6971
    //   6960: ldc2_w 437023283
    //   6963: l2i
    //   6964: ldc_w -1274715318
    //   6967: ixor
    //   6968: goto -> 6979
    //   6971: ldc2_w -1068160479
    //   6974: l2i
    //   6975: ldc_w -1275882928
    //   6978: ixor
    //   6979: ldc2_w 836506312
    //   6982: l2i
    //   6983: ldc_w -1054957746
    //   6986: ixor
    //   6987: ixor
    //   6988: lookupswitch default -> 7016, 270294767 -> 6971, 1590402303 -> 13154
    //   7016: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7019: getstatic Perryc.1 : I
    //   7022: ifeq -> 7036
    //   7025: ldc2_w 275420294
    //   7028: l2i
    //   7029: ldc_w 1892552362
    //   7032: ixor
    //   7033: goto -> 7044
    //   7036: ldc2_w 757926109
    //   7039: l2i
    //   7040: ldc_w 292254376
    //   7043: ixor
    //   7044: ldc2_w -225473341
    //   7047: l2i
    //   7048: ldc_w 22182944
    //   7051: ixor
    //   7052: ixor
    //   7053: lookupswitch default -> 7080, -1820759345 -> 13452, 449209631 -> 7036
    //   7080: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7083: getstatic Perryc.0 : I
    //   7086: ifle -> 7100
    //   7089: ldc2_w -1641887799
    //   7092: l2i
    //   7093: ldc_w -540034439
    //   7096: ixor
    //   7097: goto -> 7108
    //   7100: ldc2_w 466337447
    //   7103: l2i
    //   7104: ldc_w -186853038
    //   7107: ixor
    //   7108: ldc2_w 935588388
    //   7111: l2i
    //   7112: ldc_w -1197413589
    //   7115: ixor
    //   7116: ixor
    //   7117: lookupswitch default -> 13370, -829528897 -> 7100, 1618247418 -> 7144
    //   7144: putfield armor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7147: getstatic Perryc.1 : I
    //   7150: ifeq -> 7164
    //   7153: ldc2_w -1703382465
    //   7156: l2i
    //   7157: ldc_w 94576453
    //   7160: ixor
    //   7161: goto -> 7172
    //   7164: ldc2_w -1691189424
    //   7167: l2i
    //   7168: ldc_w -1175088382
    //   7171: ixor
    //   7172: ldc2_w -1538617984
    //   7175: l2i
    //   7176: ldc_w 1332441507
    //   7179: ixor
    //   7180: ixor
    //   7181: lookupswitch default -> 7208, 326894159 -> 7164, 1962578265 -> 13146
    //   7208: aload_0
    //   7209: getstatic Perryc.c : I
    //   7212: iflt -> 7226
    //   7215: ldc2_w 1076455539
    //   7218: l2i
    //   7219: ldc_w 600218302
    //   7222: ixor
    //   7223: goto -> 7234
    //   7226: ldc2_w 982570721
    //   7229: l2i
    //   7230: ldc_w -1879605854
    //   7233: ixor
    //   7234: ldc2_w -344595791
    //   7237: l2i
    //   7238: ldc_w -576263127
    //   7241: ixor
    //   7242: ixor
    //   7243: lookupswitch default -> 13476, -2085313061 -> 7268, 1430060117 -> 7226
    //   7268: aload_0
    //   7269: new bigname/zprestige/webhack/features/setting/Setting
    //   7272: dup
    //   7273: ldc_w '묿㌖뭼㶻ࢀ喣'
    //   7276: getstatic Perryc.0 : I
    //   7279: ifle -> 7293
    //   7282: ldc2_w 972257357
    //   7285: l2i
    //   7286: ldc_w -298419969
    //   7289: ixor
    //   7290: goto -> 7301
    //   7293: ldc2_w 1883290479
    //   7296: l2i
    //   7297: ldc_w 772544136
    //   7300: ixor
    //   7301: ldc2_w 1006386006
    //   7304: l2i
    //   7305: ldc_w 835051950
    //   7308: ixor
    //   7309: ixor
    //   7310: lookupswitch default -> 7336, -729049827 -> 7293, -570631606 -> 13142
    //   7336: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7339: ldc2_w -780619773
    //   7342: l2i
    //   7343: ldc_w -780619774
    //   7346: ixor
    //   7347: getstatic Perryc.c : I
    //   7350: iflt -> 7364
    //   7353: ldc2_w 886883247
    //   7356: l2i
    //   7357: ldc_w -1426867464
    //   7360: ixor
    //   7361: goto -> 7372
    //   7364: ldc2_w 1963891031
    //   7367: l2i
    //   7368: ldc_w 840053111
    //   7371: ixor
    //   7372: ldc2_w 1819266703
    //   7375: l2i
    //   7376: ldc_w 194110138
    //   7379: ixor
    //   7380: ixor
    //   7381: lookupswitch default -> 7408, -103721630 -> 13348, 76628158 -> 7364
    //   7408: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7411: getstatic Perryc.0 : I
    //   7414: ifle -> 7428
    //   7417: ldc2_w -322267097
    //   7420: l2i
    //   7421: ldc_w -1536631075
    //   7424: ixor
    //   7425: goto -> 7436
    //   7428: ldc2_w -1337333264
    //   7431: l2i
    //   7432: ldc_w 2078389792
    //   7435: ixor
    //   7436: ldc2_w -1671392518
    //   7439: l2i
    //   7440: ldc_w 2061097876
    //   7443: ixor
    //   7444: ixor
    //   7445: lookupswitch default -> 7472, -1373958252 -> 13276, 815804413 -> 7428
    //   7472: aload_0
    //   7473: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   7478: getstatic Perryc.0 : I
    //   7481: ifle -> 7495
    //   7484: ldc2_w -871493824
    //   7487: l2i
    //   7488: ldc_w -418515737
    //   7491: ixor
    //   7492: goto -> 7503
    //   7495: ldc2_w -110775549
    //   7498: l2i
    //   7499: ldc_w 1340940448
    //   7502: ixor
    //   7503: ldc2_w 825269001
    //   7506: l2i
    //   7507: ldc_w -997496058
    //   7510: ixor
    //   7511: ixor
    //   7512: lookupswitch default -> 7540, -558363736 -> 13152, 1846596144 -> 7495
    //   7540: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7543: getstatic Perryc.0 : I
    //   7546: ifle -> 7560
    //   7549: ldc2_w -1525743669
    //   7552: l2i
    //   7553: ldc_w -2062075105
    //   7556: ixor
    //   7557: goto -> 7568
    //   7560: ldc2_w -1597755471
    //   7563: l2i
    //   7564: ldc_w -85980502
    //   7567: ixor
    //   7568: ldc2_w 1561757706
    //   7571: l2i
    //   7572: ldc_w 1631256267
    //   7575: ixor
    //   7576: ixor
    //   7577: lookupswitch default -> 13454, 473281045 -> 7560, 1711821786 -> 7604
    //   7604: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7607: getstatic Perryc.c : I
    //   7610: iflt -> 7624
    //   7613: ldc2_w 1473492311
    //   7616: l2i
    //   7617: ldc_w -616979424
    //   7620: ixor
    //   7621: goto -> 7632
    //   7624: ldc2_w 345737656
    //   7627: l2i
    //   7628: ldc_w -1627126059
    //   7631: ixor
    //   7632: ldc2_w -1684184715
    //   7635: l2i
    //   7636: ldc_w -2089499921
    //   7639: ixor
    //   7640: ixor
    //   7641: lookupswitch default -> 13170, -1820971785 -> 7668, -1811696915 -> 7624
    //   7668: putfield health : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7671: getstatic Perryc.0 : I
    //   7674: ifle -> 7688
    //   7677: ldc2_w 412158678
    //   7680: l2i
    //   7681: ldc_w 1055488648
    //   7684: ixor
    //   7685: goto -> 7696
    //   7688: ldc2_w 839716366
    //   7691: l2i
    //   7692: ldc_w -1173376098
    //   7695: ixor
    //   7696: ldc2_w -1917582175
    //   7699: l2i
    //   7700: ldc_w -1058932153
    //   7703: ixor
    //   7704: ixor
    //   7705: lookupswitch default -> 13416, -984136842 -> 7732, 1798147768 -> 7688
    //   7732: aload_0
    //   7733: getstatic Perryc.0 : I
    //   7736: ifle -> 7750
    //   7739: ldc2_w -1692586601
    //   7742: l2i
    //   7743: ldc_w 1754706385
    //   7746: ixor
    //   7747: goto -> 7758
    //   7750: ldc2_w 1941751286
    //   7753: l2i
    //   7754: ldc_w 1176716212
    //   7757: ixor
    //   7758: ldc2_w 1564958428
    //   7761: l2i
    //   7762: ldc_w -164803136
    //   7765: ixor
    //   7766: ixor
    //   7767: lookupswitch default -> 7792, 975579396 -> 7750, 1491177306 -> 13292
    //   7792: aload_0
    //   7793: new bigname/zprestige/webhack/features/setting/Setting
    //   7796: dup
    //   7797: ldc_w '묧㌚뭳㶰'
    //   7800: getstatic Perryc.c : I
    //   7803: iflt -> 7817
    //   7806: ldc2_w 1492459999
    //   7809: l2i
    //   7810: ldc_w 1417024306
    //   7813: ixor
    //   7814: goto -> 7825
    //   7817: ldc2_w 84421620
    //   7820: l2i
    //   7821: ldc_w -1199006991
    //   7824: ixor
    //   7825: ldc2_w 1305614689
    //   7828: l2i
    //   7829: ldc_w -650757866
    //   7832: ixor
    //   7833: ixor
    //   7834: lookupswitch default -> 7860, -1738075494 -> 13344, -1576187701 -> 7817
    //   7860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7863: ldc2_w -2096356924
    //   7866: l2i
    //   7867: ldc_w -2096356923
    //   7870: ixor
    //   7871: getstatic Perryc.1 : I
    //   7874: ifeq -> 7888
    //   7877: ldc2_w -234257256
    //   7880: l2i
    //   7881: ldc_w -934801920
    //   7884: ixor
    //   7885: goto -> 7896
    //   7888: ldc2_w 139703535
    //   7891: l2i
    //   7892: ldc_w 360705065
    //   7895: ixor
    //   7896: ldc2_w 925445251
    //   7899: l2i
    //   7900: ldc_w -2145515827
    //   7903: ixor
    //   7904: ixor
    //   7905: lookupswitch default -> 7932, -1921605418 -> 13378, -1117866907 -> 7888
    //   7932: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7935: getstatic Perryc.0 : I
    //   7938: ifle -> 7952
    //   7941: ldc2_w 1476728494
    //   7944: l2i
    //   7945: ldc_w -431765754
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w 1704851366
    //   7955: l2i
    //   7956: ldc_w -433567911
    //   7959: ixor
    //   7960: ldc2_w 856068340
    //   7963: l2i
    //   7964: ldc_w -1954616379
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 7996, -399508123 -> 7952, 104770201 -> 13198
    //   7996: aload_0
    //   7997: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   8002: getstatic Perryc.c : I
    //   8005: iflt -> 8019
    //   8008: ldc2_w 290929399
    //   8011: l2i
    //   8012: ldc_w -1694824528
    //   8015: ixor
    //   8016: goto -> 8027
    //   8019: ldc2_w -1772957425
    //   8022: l2i
    //   8023: ldc_w -123256929
    //   8026: ixor
    //   8027: ldc2_w 1161582261
    //   8030: l2i
    //   8031: ldc_w -1515134381
    //   8034: ixor
    //   8035: ixor
    //   8036: lookupswitch default -> 8064, 1228141216 -> 8019, 1797294497 -> 13252
    //   8064: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8067: getstatic Perryc.0 : I
    //   8070: ifle -> 8084
    //   8073: ldc2_w -357271027
    //   8076: l2i
    //   8077: ldc_w 226803093
    //   8080: ixor
    //   8081: goto -> 8092
    //   8084: ldc2_w -267014103
    //   8087: l2i
    //   8088: ldc_w -2003385339
    //   8091: ixor
    //   8092: ldc2_w 1372536217
    //   8095: l2i
    //   8096: ldc_w 80858206
    //   8099: ixor
    //   8100: ixor
    //   8101: lookupswitch default -> 8128, -1305594273 -> 13132, 2121884972 -> 8084
    //   8128: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8131: getstatic Perryc.c : I
    //   8134: iflt -> 8148
    //   8137: ldc2_w -1088860352
    //   8140: l2i
    //   8141: ldc_w 1973761855
    //   8144: ixor
    //   8145: goto -> 8156
    //   8148: ldc2_w -1199795905
    //   8151: l2i
    //   8152: ldc_w 1312128147
    //   8155: ixor
    //   8156: ldc2_w -2118973731
    //   8159: l2i
    //   8160: ldc_w -1669783490
    //   8163: ixor
    //   8164: ixor
    //   8165: lookupswitch default -> 8192, -680108388 -> 13310, 436588395 -> 8148
    //   8192: putfield ping : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8195: getstatic Perryc.c : I
    //   8198: iflt -> 8212
    //   8201: ldc2_w -1779766688
    //   8204: l2i
    //   8205: ldc_w -1706187253
    //   8208: ixor
    //   8209: goto -> 8220
    //   8212: ldc2_w -544416734
    //   8215: l2i
    //   8216: ldc_w -1528756957
    //   8219: ixor
    //   8220: ldc2_w -764605086
    //   8223: l2i
    //   8224: ldc_w -1991452210
    //   8227: ixor
    //   8228: ixor
    //   8229: lookupswitch default -> 8256, 699010002 -> 8212, 1418107079 -> 13368
    //   8256: aload_0
    //   8257: getstatic Perryc.0 : I
    //   8260: ifle -> 8274
    //   8263: ldc2_w 888789977
    //   8266: l2i
    //   8267: ldc_w -1306414473
    //   8270: ixor
    //   8271: goto -> 8282
    //   8274: ldc2_w 2132051704
    //   8277: l2i
    //   8278: ldc_w -444783062
    //   8281: ixor
    //   8282: ldc2_w 1114299258
    //   8285: l2i
    //   8286: ldc_w 1724974145
    //   8289: ixor
    //   8290: ixor
    //   8291: lookupswitch default -> 13300, -1570523499 -> 8274, -1093500951 -> 8316
    //   8316: aload_0
    //   8317: new bigname/zprestige/webhack/features/setting/Setting
    //   8320: dup
    //   8321: ldc_w '묾㌇뭸㶺ࣔ喅๸욷蹦'
    //   8324: getstatic Perryc.1 : I
    //   8327: ifeq -> 8341
    //   8330: ldc2_w -1264802592
    //   8333: l2i
    //   8334: ldc_w 1932381017
    //   8337: ixor
    //   8338: goto -> 8349
    //   8341: ldc2_w 206647504
    //   8344: l2i
    //   8345: ldc_w -1132905841
    //   8348: ixor
    //   8349: ldc2_w 2016401626
    //   8352: l2i
    //   8353: ldc_w -1473224829
    //   8356: ixor
    //   8357: ixor
    //   8358: lookupswitch default -> 13468, 397338848 -> 8341, 1614253318 -> 8384
    //   8384: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8387: ldc2_w 829046201
    //   8390: l2i
    //   8391: ldc_w 829046200
    //   8394: ixor
    //   8395: getstatic Perryc.c : I
    //   8398: iflt -> 8412
    //   8401: ldc2_w -1319684861
    //   8404: l2i
    //   8405: ldc_w 2023022482
    //   8408: ixor
    //   8409: goto -> 8420
    //   8412: ldc2_w -750913978
    //   8415: l2i
    //   8416: ldc_w 593114360
    //   8419: ixor
    //   8420: ldc2_w 356143182
    //   8423: l2i
    //   8424: ldc_w -711355143
    //   8427: ixor
    //   8428: ixor
    //   8429: lookupswitch default -> 13396, 157298214 -> 8412, 818152969 -> 8456
    //   8456: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8459: getstatic Perryc.c : I
    //   8462: iflt -> 8476
    //   8465: ldc2_w 1476712731
    //   8468: l2i
    //   8469: ldc_w -222971306
    //   8472: ixor
    //   8473: goto -> 8484
    //   8476: ldc2_w 94390306
    //   8479: l2i
    //   8480: ldc_w 521800685
    //   8483: ixor
    //   8484: ldc2_w -792787991
    //   8487: l2i
    //   8488: ldc_w -554244203
    //   8491: ixor
    //   8492: ixor
    //   8493: lookupswitch default -> 13412, -1527216335 -> 8476, 351512499 -> 8520
    //   8520: aload_0
    //   8521: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   8526: getstatic Perryc.0 : I
    //   8529: ifle -> 8543
    //   8532: ldc2_w -51505465
    //   8535: l2i
    //   8536: ldc_w 794760820
    //   8539: ixor
    //   8540: goto -> 8551
    //   8543: ldc2_w 1155527649
    //   8546: l2i
    //   8547: ldc_w -1517543687
    //   8550: ixor
    //   8551: ldc2_w -1568896769
    //   8554: l2i
    //   8555: ldc_w 787014418
    //   8558: ixor
    //   8559: ixor
    //   8560: lookupswitch default -> 8588, 673925594 -> 8543, 1596287838 -> 13524
    //   8588: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8591: getstatic Perryc.1 : I
    //   8594: ifeq -> 8608
    //   8597: ldc2_w -1136568666
    //   8600: l2i
    //   8601: ldc_w -1307484699
    //   8604: ixor
    //   8605: goto -> 8616
    //   8608: ldc2_w 1403977375
    //   8611: l2i
    //   8612: ldc_w 1497189906
    //   8615: ixor
    //   8616: ldc2_w -105888298
    //   8619: l2i
    //   8620: ldc_w 1741352498
    //   8623: ixor
    //   8624: ixor
    //   8625: lookupswitch default -> 8652, -1876254553 -> 13304, 1673577434 -> 8608
    //   8652: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8655: getstatic Perryc.0 : I
    //   8658: ifle -> 8672
    //   8661: ldc2_w 454027747
    //   8664: l2i
    //   8665: ldc_w -115026
    //   8668: ixor
    //   8669: goto -> 8680
    //   8672: ldc2_w 266908184
    //   8675: l2i
    //   8676: ldc_w 1946759940
    //   8679: ixor
    //   8680: ldc2_w -702174068
    //   8683: l2i
    //   8684: ldc_w 245908165
    //   8687: ixor
    //   8688: ixor
    //   8689: lookupswitch default -> 13174, -1553174699 -> 8716, 1014774020 -> 8672
    //   8716: putfield heldStackName : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8719: getstatic Perryc.c : I
    //   8722: iflt -> 8736
    //   8725: ldc2_w 1418307057
    //   8728: l2i
    //   8729: ldc_w -1901188030
    //   8732: ixor
    //   8733: goto -> 8744
    //   8736: ldc2_w 1902112515
    //   8739: l2i
    //   8740: ldc_w 1850104391
    //   8743: ixor
    //   8744: ldc2_w -1466659010
    //   8747: l2i
    //   8748: ldc_w -2111745852
    //   8751: ixor
    //   8752: ixor
    //   8753: lookupswitch default -> 8780, -258845111 -> 13434, 1298302624 -> 8736
    //   8780: aload_0
    //   8781: getstatic Perryc.c : I
    //   8784: iflt -> 8798
    //   8787: ldc2_w 1324683884
    //   8790: l2i
    //   8791: ldc_w 340392561
    //   8794: ixor
    //   8795: goto -> 8806
    //   8798: ldc2_w 967417113
    //   8801: l2i
    //   8802: ldc_w 670470438
    //   8805: ixor
    //   8806: ldc2_w -1987096403
    //   8809: l2i
    //   8810: ldc_w 1228528267
    //   8813: ixor
    //   8814: ixor
    //   8815: lookupswitch default -> 8840, -1710595525 -> 13380, -731826947 -> 8798
    //   8840: aload_0
    //   8841: new bigname/zprestige/webhack/features/setting/Setting
    //   8844: dup
    //   8845: ldc_w '묤㌚뭧㶲'
    //   8848: getstatic Perryc.0 : I
    //   8851: ifle -> 8865
    //   8854: ldc2_w -826861817
    //   8857: l2i
    //   8858: ldc_w 1757945850
    //   8861: ixor
    //   8862: goto -> 8873
    //   8865: ldc2_w -791672743
    //   8868: l2i
    //   8869: ldc_w -1635289748
    //   8872: ixor
    //   8873: ldc2_w -2102632404
    //   8876: l2i
    //   8877: ldc_w 1176366157
    //   8880: ixor
    //   8881: ixor
    //   8882: lookupswitch default -> 8908, -71564246 -> 8865, 1657701532 -> 13262
    //   8908: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8911: ldc_w 0.41469547
    //   8914: invokestatic floatToIntBits : (F)I
    //   8917: ldc_w 2125746935
    //   8920: ixor
    //   8921: invokestatic intBitsToFloat : (I)F
    //   8924: getstatic Perryc.1 : I
    //   8927: ifeq -> 8941
    //   8930: ldc2_w 69721408
    //   8933: l2i
    //   8934: ldc_w 1731356429
    //   8937: ixor
    //   8938: goto -> 8949
    //   8941: ldc2_w -710603887
    //   8944: l2i
    //   8945: ldc_w 960102826
    //   8948: ixor
    //   8949: ldc2_w 1315062954
    //   8952: l2i
    //   8953: ldc_w -1017495270
    //   8956: ixor
    //   8957: ixor
    //   8958: lookupswitch default -> 8984, -1852650868 -> 8941, -298991619 -> 13510
    //   8984: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8987: ldc_w 218.84311
    //   8990: invokestatic floatToIntBits : (F)I
    //   8993: ldc_w 2123766555
    //   8996: ixor
    //   8997: invokestatic intBitsToFloat : (I)F
    //   9000: getstatic Perryc.c : I
    //   9003: iflt -> 9017
    //   9006: ldc2_w 2058686004
    //   9009: l2i
    //   9010: ldc_w 1556448482
    //   9013: ixor
    //   9014: goto -> 9025
    //   9017: ldc2_w 350766599
    //   9020: l2i
    //   9021: ldc_w 1807497800
    //   9024: ixor
    //   9025: ldc2_w -1728776567
    //   9028: l2i
    //   9029: ldc_w 95474079
    //   9032: ixor
    //   9033: ixor
    //   9034: lookupswitch default -> 13440, -1154175552 -> 9017, -502244519 -> 9060
    //   9060: invokestatic valueOf : (F)Ljava/lang/Float;
    //   9063: ldc_w 0.40369028
    //   9066: invokestatic floatToIntBits : (F)I
    //   9069: ldc_w 2137960574
    //   9072: ixor
    //   9073: invokestatic intBitsToFloat : (I)F
    //   9076: getstatic Perryc.1 : I
    //   9079: ifeq -> 9093
    //   9082: ldc2_w -100284471
    //   9085: l2i
    //   9086: ldc_w -1581806095
    //   9089: ixor
    //   9090: goto -> 9101
    //   9093: ldc2_w -609606440
    //   9096: l2i
    //   9097: ldc_w 343556328
    //   9100: ixor
    //   9101: ldc2_w 947840914
    //   9104: l2i
    //   9105: ldc_w 1163366253
    //   9108: ixor
    //   9109: ixor
    //   9110: lookupswitch default -> 13456, -1292301105 -> 9136, 647701191 -> 9093
    //   9136: invokestatic valueOf : (F)Ljava/lang/Float;
    //   9139: getstatic Perryc.0 : I
    //   9142: ifle -> 9156
    //   9145: ldc2_w 771878836
    //   9148: l2i
    //   9149: ldc_w 1692879109
    //   9152: ixor
    //   9153: goto -> 9164
    //   9156: ldc2_w -1630053768
    //   9159: l2i
    //   9160: ldc_w -1482037827
    //   9163: ixor
    //   9164: ldc2_w 88737960
    //   9167: l2i
    //   9168: ldc_w -1200399480
    //   9171: ixor
    //   9172: ixor
    //   9173: lookupswitch default -> 13356, -2075661083 -> 9200, -136317551 -> 9156
    //   9200: aload_0
    //   9201: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   9206: getstatic Perryc.1 : I
    //   9209: ifeq -> 9223
    //   9212: ldc2_w 1767074106
    //   9215: l2i
    //   9216: ldc_w 79081787
    //   9219: ixor
    //   9220: goto -> 9231
    //   9223: ldc2_w 1086138268
    //   9226: l2i
    //   9227: ldc_w -819532188
    //   9230: ixor
    //   9231: ldc2_w -1864887786
    //   9234: l2i
    //   9235: ldc_w 581281448
    //   9238: ixor
    //   9239: ixor
    //   9240: lookupswitch default -> 9268, -1759598254 -> 9223, -543658817 -> 13432
    //   9268: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9271: getstatic Perryc.1 : I
    //   9274: ifeq -> 9288
    //   9277: ldc2_w -1493676540
    //   9280: l2i
    //   9281: ldc_w 894448376
    //   9284: ixor
    //   9285: goto -> 9296
    //   9288: ldc2_w 666345942
    //   9291: l2i
    //   9292: ldc_w -1224463918
    //   9295: ixor
    //   9296: ldc2_w -1893085764
    //   9299: l2i
    //   9300: ldc_w -2108666866
    //   9303: ixor
    //   9304: ixor
    //   9305: lookupswitch default -> 9332, -1630405298 -> 13518, -163752432 -> 9288
    //   9332: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9335: getstatic Perryc.c : I
    //   9338: iflt -> 9352
    //   9341: ldc2_w 1250247459
    //   9344: l2i
    //   9345: ldc_w -875909330
    //   9348: ixor
    //   9349: goto -> 9360
    //   9352: ldc2_w -804372226
    //   9355: l2i
    //   9356: ldc_w -166458395
    //   9359: ixor
    //   9360: ldc2_w -1935923453
    //   9363: l2i
    //   9364: ldc_w -846324959
    //   9367: ixor
    //   9368: ixor
    //   9369: lookupswitch default -> 9396, -1067593681 -> 13402, 1880257236 -> 9352
    //   9396: putfield size : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9399: getstatic Perryc.1 : I
    //   9402: ifeq -> 9416
    //   9405: ldc2_w -424782607
    //   9408: l2i
    //   9409: ldc_w -1708803581
    //   9412: ixor
    //   9413: goto -> 9424
    //   9416: ldc2_w -840752198
    //   9419: l2i
    //   9420: ldc_w 1433609313
    //   9423: ixor
    //   9424: ldc2_w 68680073
    //   9427: l2i
    //   9428: ldc_w 1408595003
    //   9431: ixor
    //   9432: ixor
    //   9433: lookupswitch default -> 13162, -814577047 -> 9460, 728326976 -> 9416
    //   9460: aload_0
    //   9461: getstatic Perryc.1 : I
    //   9464: ifeq -> 9478
    //   9467: ldc2_w -249772833
    //   9470: l2i
    //   9471: ldc_w 1357954190
    //   9474: ixor
    //   9475: goto -> 9486
    //   9478: ldc2_w 158240837
    //   9481: l2i
    //   9482: ldc_w -425308886
    //   9485: ixor
    //   9486: ldc2_w 56376298
    //   9489: l2i
    //   9490: ldc_w 2029606750
    //   9493: ixor
    //   9494: ixor
    //   9495: lookupswitch default -> 13220, -1804750373 -> 9520, -632744731 -> 9478
    //   9520: aload_0
    //   9521: new bigname/zprestige/webhack/features/setting/Setting
    //   9524: dup
    //   9525: ldc_w '묤㌞뭼㶥ࢀ喘๺욻蹯呯'
    //   9528: getstatic Perryc.0 : I
    //   9531: ifle -> 9545
    //   9534: ldc2_w 556050990
    //   9537: l2i
    //   9538: ldc_w 386467656
    //   9541: ixor
    //   9542: goto -> 9553
    //   9545: ldc2_w 328030660
    //   9548: l2i
    //   9549: ldc_w -477471638
    //   9552: ixor
    //   9553: ldc2_w -1852337171
    //   9556: l2i
    //   9557: ldc_w -533246512
    //   9560: ixor
    //   9561: ixor
    //   9562: lookupswitch default -> 9588, 1102027492 -> 9545, 1200452443 -> 13324
    //   9588: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9591: ldc2_w 89402923
    //   9594: l2i
    //   9595: ldc_w 89402922
    //   9598: ixor
    //   9599: getstatic Perryc.c : I
    //   9602: iflt -> 9616
    //   9605: ldc2_w 1868448700
    //   9608: l2i
    //   9609: ldc_w -1241402370
    //   9612: ixor
    //   9613: goto -> 9624
    //   9616: ldc2_w -1099949801
    //   9619: l2i
    //   9620: ldc_w 398170757
    //   9623: ixor
    //   9624: ldc2_w 377451962
    //   9627: l2i
    //   9628: ldc_w -471708864
    //   9631: ixor
    //   9632: ixor
    //   9633: lookupswitch default -> 13230, 750964408 -> 9616, 1549188456 -> 9660
    //   9660: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9663: getstatic Perryc.0 : I
    //   9666: ifle -> 9680
    //   9669: ldc2_w 430490223
    //   9672: l2i
    //   9673: ldc_w -861459549
    //   9676: ixor
    //   9677: goto -> 9688
    //   9680: ldc2_w 1150572000
    //   9683: l2i
    //   9684: ldc_w -1983595068
    //   9687: ixor
    //   9688: ldc2_w 1242047556
    //   9691: l2i
    //   9692: ldc_w 1931078887
    //   9695: ixor
    //   9696: ixor
    //   9697: lookupswitch default -> 9724, -1243674135 -> 9680, -333569681 -> 13424
    //   9724: aload_0
    //   9725: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   9730: getstatic Perryc.0 : I
    //   9733: ifle -> 9747
    //   9736: ldc2_w 2076741925
    //   9739: l2i
    //   9740: ldc_w 387363073
    //   9743: ixor
    //   9744: goto -> 9755
    //   9747: ldc2_w -670697554
    //   9750: l2i
    //   9751: ldc_w -1871254217
    //   9754: ixor
    //   9755: ldc2_w -1989419552
    //   9758: l2i
    //   9759: ldc_w -1482239822
    //   9762: ixor
    //   9763: ixor
    //   9764: lookupswitch default -> 9792, -1164446368 -> 9747, 1108553078 -> 13148
    //   9792: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9795: getstatic Perryc.0 : I
    //   9798: ifle -> 9812
    //   9801: ldc2_w 1368242130
    //   9804: l2i
    //   9805: ldc_w 809061973
    //   9808: ixor
    //   9809: goto -> 9820
    //   9812: ldc2_w 746687250
    //   9815: l2i
    //   9816: ldc_w 1658865627
    //   9819: ixor
    //   9820: ldc2_w -1501124194
    //   9823: l2i
    //   9824: ldc_w 563990264
    //   9827: ixor
    //   9828: ixor
    //   9829: lookupswitch default -> 9856, -424698143 -> 13494, -316862957 -> 9812
    //   9856: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9859: getstatic Perryc.c : I
    //   9862: iflt -> 9876
    //   9865: ldc2_w -1694444063
    //   9868: l2i
    //   9869: ldc_w 1470762812
    //   9872: ixor
    //   9873: goto -> 9884
    //   9876: ldc2_w -2064537335
    //   9879: l2i
    //   9880: ldc_w -914542213
    //   9883: ixor
    //   9884: ldc2_w 1508972701
    //   9887: l2i
    //   9888: ldc_w 668794355
    //   9891: ixor
    //   9892: ixor
    //   9893: lookupswitch default -> 9920, -1299759181 -> 13254, 1772274567 -> 9876
    //   9920: putfield smartScale : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9923: getstatic Perryc.0 : I
    //   9926: ifle -> 9940
    //   9929: ldc2_w 2120547616
    //   9932: l2i
    //   9933: ldc_w 1461405540
    //   9936: ixor
    //   9937: goto -> 9948
    //   9940: ldc2_w -1873710328
    //   9943: l2i
    //   9944: ldc_w 2118117804
    //   9947: ixor
    //   9948: ldc2_w 47571905
    //   9951: l2i
    //   9952: ldc_w 502347916
    //   9955: ixor
    //   9956: ixor
    //   9957: lookupswitch default -> 13444, -246791703 -> 9984, 911958281 -> 9940
    //   9984: aload_0
    //   9985: getstatic Perryc.0 : I
    //   9988: ifle -> 10002
    //   9991: ldc2_w -1160199963
    //   9994: l2i
    //   9995: ldc_w -997211358
    //   9998: ixor
    //   9999: goto -> 10010
    //   10002: ldc2_w -1337761048
    //   10005: l2i
    //   10006: ldc_w 1073827012
    //   10009: ixor
    //   10010: ldc2_w 1837604652
    //   10013: l2i
    //   10014: ldc_w 166704976
    //   10017: ixor
    //   10018: ixor
    //   10019: lookupswitch default -> 10044, -1719479757 -> 10002, 440347579 -> 13266
    //   10044: aload_0
    //   10045: new bigname/zprestige/webhack/features/setting/Setting
    //   10048: dup
    //   10049: ldc_w '묱㌒뭾㶣࢛喹'
    //   10052: getstatic Perryc.c : I
    //   10055: iflt -> 10069
    //   10058: ldc2_w 1516118254
    //   10061: l2i
    //   10062: ldc_w 1471905869
    //   10065: ixor
    //   10066: goto -> 10077
    //   10069: ldc2_w 1122007123
    //   10072: l2i
    //   10073: ldc_w 1868216329
    //   10076: ixor
    //   10077: ldc2_w 1296692753
    //   10080: l2i
    //   10081: ldc_w -1685881060
    //   10084: ixor
    //   10085: ixor
    //   10086: lookupswitch default -> 13436, -617666130 -> 10069, -76527273 -> 10112
    //   10112: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10115: ldc_w 18.172342
    //   10118: invokestatic floatToIntBits : (F)I
    //   10121: ldc_w 2123456757
    //   10124: ixor
    //   10125: invokestatic intBitsToFloat : (I)F
    //   10128: getstatic Perryc.1 : I
    //   10131: ifeq -> 10145
    //   10134: ldc2_w 1128086188
    //   10137: l2i
    //   10138: ldc_w 2002767644
    //   10141: ixor
    //   10142: goto -> 10153
    //   10145: ldc2_w -736980364
    //   10148: l2i
    //   10149: ldc_w 358347502
    //   10152: ixor
    //   10153: ldc2_w -427478939
    //   10156: l2i
    //   10157: ldc_w 774521177
    //   10160: ixor
    //   10161: ixor
    //   10162: lookupswitch default -> 10188, -1192837913 -> 10145, -53640052 -> 13388
    //   10188: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10191: ldc_w 245.0434
    //   10194: invokestatic floatToIntBits : (F)I
    //   10197: ldc_w 2126104529
    //   10200: ixor
    //   10201: invokestatic intBitsToFloat : (I)F
    //   10204: getstatic Perryc.1 : I
    //   10207: ifeq -> 10221
    //   10210: ldc2_w -1901415569
    //   10213: l2i
    //   10214: ldc_w 489488003
    //   10217: ixor
    //   10218: goto -> 10229
    //   10221: ldc2_w 1704307974
    //   10224: l2i
    //   10225: ldc_w -1361350608
    //   10228: ixor
    //   10229: ldc2_w 1861341374
    //   10232: l2i
    //   10233: ldc_w -139819394
    //   10236: ixor
    //   10237: ixor
    //   10238: lookupswitch default -> 13392, 182262572 -> 10221, 1377143798 -> 10264
    //   10264: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10267: ldc_w 81.06872
    //   10270: invokestatic floatToIntBits : (F)I
    //   10273: ldc_w 2099389231
    //   10276: ixor
    //   10277: invokestatic intBitsToFloat : (I)F
    //   10280: getstatic Perryc.0 : I
    //   10283: ifle -> 10297
    //   10286: ldc2_w -1030111405
    //   10289: l2i
    //   10290: ldc_w 1892216537
    //   10293: ixor
    //   10294: goto -> 10305
    //   10297: ldc2_w 1954921691
    //   10300: l2i
    //   10301: ldc_w -1856764708
    //   10304: ixor
    //   10305: ldc2_w 1999586032
    //   10308: l2i
    //   10309: ldc_w -135164193
    //   10312: ixor
    //   10313: ixor
    //   10314: lookupswitch default -> 10340, -1149908963 -> 10297, 848272805 -> 13190
    //   10340: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10343: getstatic Perryc.1 : I
    //   10346: ifeq -> 10360
    //   10349: ldc2_w 1181711309
    //   10352: l2i
    //   10353: ldc_w 1281313328
    //   10356: ixor
    //   10357: goto -> 10368
    //   10360: ldc2_w -1767552569
    //   10363: l2i
    //   10364: ldc_w -435923689
    //   10367: ixor
    //   10368: ldc2_w -499974185
    //   10371: l2i
    //   10372: ldc_w 227380885
    //   10375: ixor
    //   10376: ixor
    //   10377: lookupswitch default -> 13350, -1625395822 -> 10404, -443596609 -> 10360
    //   10404: aload_0
    //   10405: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   10410: getstatic Perryc.1 : I
    //   10413: ifeq -> 10427
    //   10416: ldc2_w -206878259
    //   10419: l2i
    //   10420: ldc_w -733495353
    //   10423: ixor
    //   10424: goto -> 10435
    //   10427: ldc2_w -41832361
    //   10430: l2i
    //   10431: ldc_w -695537827
    //   10434: ixor
    //   10435: ldc2_w 1177080998
    //   10438: l2i
    //   10439: ldc_w 106142043
    //   10442: ixor
    //   10443: ixor
    //   10444: lookupswitch default -> 13320, 1737997303 -> 10427, 1802506999 -> 10472
    //   10472: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10475: getstatic Perryc.0 : I
    //   10478: ifle -> 10492
    //   10481: ldc2_w -1926089340
    //   10484: l2i
    //   10485: ldc_w -674015749
    //   10488: ixor
    //   10489: goto -> 10500
    //   10492: ldc2_w -110684440
    //   10495: l2i
    //   10496: ldc_w -1885300108
    //   10499: ixor
    //   10500: ldc2_w -830325992
    //   10503: l2i
    //   10504: ldc_w 406715874
    //   10507: ixor
    //   10508: ixor
    //   10509: lookupswitch default -> 13260, -1939954043 -> 10492, -1602729370 -> 10536
    //   10536: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10539: getstatic Perryc.1 : I
    //   10542: ifeq -> 10556
    //   10545: ldc2_w 193025535
    //   10548: l2i
    //   10549: ldc_w 358880290
    //   10552: ixor
    //   10553: goto -> 10564
    //   10556: ldc2_w -240883626
    //   10559: l2i
    //   10560: ldc_w 692493708
    //   10563: ixor
    //   10564: ldc2_w -2102558148
    //   10567: l2i
    //   10568: ldc_w -673091666
    //   10571: ixor
    //   10572: ixor
    //   10573: lookupswitch default -> 13160, -1917970360 -> 10600, 1269410895 -> 10556
    //   10600: putfield factor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10603: getstatic Perryc.c : I
    //   10606: iflt -> 10620
    //   10609: ldc2_w -662226171
    //   10612: l2i
    //   10613: ldc_w 1856217364
    //   10616: ixor
    //   10617: goto -> 10628
    //   10620: ldc2_w -2045103398
    //   10623: l2i
    //   10624: ldc_w 823737056
    //   10627: ixor
    //   10628: ldc2_w 1974100221
    //   10631: l2i
    //   10632: ldc_w -104812269
    //   10635: ixor
    //   10636: ixor
    //   10637: lookupswitch default -> 13472, 978209791 -> 10620, 996792788 -> 10664
    //   10664: aload_0
    //   10665: getstatic Perryc.1 : I
    //   10668: ifeq -> 10682
    //   10671: ldc2_w 405620858
    //   10674: l2i
    //   10675: ldc_w -277302277
    //   10678: ixor
    //   10679: goto -> 10690
    //   10682: ldc2_w 131486430
    //   10685: l2i
    //   10686: ldc_w -693319558
    //   10689: ixor
    //   10690: ldc2_w -2029308205
    //   10693: l2i
    //   10694: ldc_w 1897538291
    //   10697: ixor
    //   10698: ixor
    //   10699: lookupswitch default -> 10724, 21295009 -> 13224, 899122871 -> 10682
    //   10724: aload_0
    //   10725: new bigname/zprestige/webhack/features/setting/Setting
    //   10728: dup
    //   10729: ldc_w '묣㌖뭥㶣ࣔ喙๼욾'
    //   10732: getstatic Perryc.c : I
    //   10735: iflt -> 10749
    //   10738: ldc2_w -586722720
    //   10741: l2i
    //   10742: ldc_w -1202536590
    //   10745: ixor
    //   10746: goto -> 10757
    //   10749: ldc2_w 884073343
    //   10752: l2i
    //   10753: ldc_w 1666127468
    //   10756: ixor
    //   10757: ldc2_w 1813835278
    //   10760: l2i
    //   10761: ldc_w 888352100
    //   10764: ixor
    //   10765: ixor
    //   10766: lookupswitch default -> 13428, 252786297 -> 10792, 1035611768 -> 10749
    //   10792: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10795: ldc2_w 320762506
    //   10798: l2i
    //   10799: ldc_w 320762485
    //   10802: ixor
    //   10803: getstatic Perryc.1 : I
    //   10806: ifeq -> 10820
    //   10809: ldc2_w -1250612783
    //   10812: l2i
    //   10813: ldc_w 1068847751
    //   10816: ixor
    //   10817: goto -> 10828
    //   10820: ldc2_w -873296161
    //   10823: l2i
    //   10824: ldc_w 2128144643
    //   10827: ixor
    //   10828: ldc2_w -809843466
    //   10831: l2i
    //   10832: ldc_w 326702398
    //   10835: ixor
    //   10836: ixor
    //   10837: lookupswitch default -> 10864, -1169926499 -> 10820, 1443080862 -> 13194
    //   10864: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10867: ldc2_w -136691077
    //   10870: l2i
    //   10871: ldc_w -136691077
    //   10874: ixor
    //   10875: getstatic Perryc.c : I
    //   10878: iflt -> 10892
    //   10881: ldc2_w 1634804548
    //   10884: l2i
    //   10885: ldc_w -1979253661
    //   10888: ixor
    //   10889: goto -> 10900
    //   10892: ldc2_w 469237591
    //   10895: l2i
    //   10896: ldc_w -842094742
    //   10899: ixor
    //   10900: ldc2_w 1271649048
    //   10903: l2i
    //   10904: ldc_w 2003894999
    //   10907: ixor
    //   10908: ixor
    //   10909: lookupswitch default -> 13526, -674427160 -> 10892, -360478222 -> 10936
    //   10936: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10939: ldc2_w 1249434004
    //   10942: l2i
    //   10943: ldc_w 1249433963
    //   10946: ixor
    //   10947: getstatic Perryc.1 : I
    //   10950: ifeq -> 10964
    //   10953: ldc2_w -1389668391
    //   10956: l2i
    //   10957: ldc_w 814260935
    //   10960: ixor
    //   10961: goto -> 10972
    //   10964: ldc2_w 1499947997
    //   10967: l2i
    //   10968: ldc_w 649062215
    //   10971: ixor
    //   10972: ldc2_w -1261742249
    //   10975: l2i
    //   10976: ldc_w 2064024426
    //   10979: ixor
    //   10980: ixor
    //   10981: lookupswitch default -> 13478, -1341828953 -> 11008, 1382949155 -> 10964
    //   11008: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11011: getstatic Perryc.0 : I
    //   11014: ifle -> 11028
    //   11017: ldc2_w 165221798
    //   11020: l2i
    //   11021: ldc_w 1179213102
    //   11024: ixor
    //   11025: goto -> 11036
    //   11028: ldc2_w 453211244
    //   11031: l2i
    //   11032: ldc_w -1230671825
    //   11035: ixor
    //   11036: ldc2_w -1026673233
    //   11039: l2i
    //   11040: ldc_w 855971555
    //   11043: ixor
    //   11044: ixor
    //   11045: lookupswitch default -> 13206, -1101304892 -> 11028, 1550657295 -> 11072
    //   11072: aload_0
    //   11073: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   11078: getstatic Perryc.1 : I
    //   11081: ifeq -> 11095
    //   11084: ldc2_w 1469203154
    //   11087: l2i
    //   11088: ldc_w 1641958244
    //   11091: ixor
    //   11092: goto -> 11103
    //   11095: ldc2_w 1470369388
    //   11098: l2i
    //   11099: ldc_w 1768674946
    //   11102: ixor
    //   11103: ldc2_w -1927093336
    //   11106: l2i
    //   11107: ldc_w 1365987956
    //   11110: ixor
    //   11111: ixor
    //   11112: lookupswitch default -> 13352, -494507726 -> 11140, -368723862 -> 11095
    //   11140: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11143: getstatic Perryc.1 : I
    //   11146: ifeq -> 11160
    //   11149: ldc2_w 141484421
    //   11152: l2i
    //   11153: ldc_w -88108608
    //   11156: ixor
    //   11157: goto -> 11168
    //   11160: ldc2_w 752760089
    //   11163: l2i
    //   11164: ldc_w -644465179
    //   11167: ixor
    //   11168: ldc2_w 636664162
    //   11171: l2i
    //   11172: ldc_w 940214313
    //   11175: ixor
    //   11176: ixor
    //   11177: lookupswitch default -> 13176, -391104073 -> 11204, -282509042 -> 11160
    //   11204: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11207: getstatic Perryc.0 : I
    //   11210: ifle -> 11224
    //   11213: ldc2_w 846498497
    //   11216: l2i
    //   11217: ldc_w 661818651
    //   11220: ixor
    //   11221: goto -> 11232
    //   11224: ldc2_w 64710654
    //   11227: l2i
    //   11228: ldc_w -427214760
    //   11231: ixor
    //   11232: ldc2_w -429252284
    //   11235: l2i
    //   11236: ldc_w -1838336254
    //   11239: ixor
    //   11240: ixor
    //   11241: lookupswitch default -> 11268, -1607855093 -> 11224, 1627459996 -> 13390
    //   11268: putfield NCred : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11271: getstatic Perryc.c : I
    //   11274: iflt -> 11288
    //   11277: ldc2_w -1626509261
    //   11280: l2i
    //   11281: ldc_w 1689123013
    //   11284: ixor
    //   11285: goto -> 11296
    //   11288: ldc2_w 247409924
    //   11291: l2i
    //   11292: ldc_w -1994944410
    //   11295: ixor
    //   11296: ldc2_w -5546145
    //   11299: l2i
    //   11300: ldc_w -1192276727
    //   11303: ixor
    //   11304: ixor
    //   11305: lookupswitch default -> 13330, -1125868896 -> 11288, -1058230476 -> 11332
    //   11332: aload_0
    //   11333: getstatic Perryc.c : I
    //   11336: iflt -> 11350
    //   11339: ldc2_w 912532295
    //   11342: l2i
    //   11343: ldc_w 941032604
    //   11346: ixor
    //   11347: goto -> 11358
    //   11350: ldc2_w 1581466586
    //   11353: l2i
    //   11354: ldc_w 206302984
    //   11357: ixor
    //   11358: ldc2_w 1996984016
    //   11361: l2i
    //   11362: ldc_w 1479028812
    //   11365: ixor
    //   11366: ixor
    //   11367: lookupswitch default -> 13240, 559716679 -> 11350, 2099712590 -> 11392
    //   11392: aload_0
    //   11393: new bigname/zprestige/webhack/features/setting/Setting
    //   11396: dup
    //   11397: ldc_w '묣㌖뭥㶣ࣔ喌๫욿蹦呤'
    //   11400: getstatic Perryc.c : I
    //   11403: iflt -> 11417
    //   11406: ldc2_w 126136262
    //   11409: l2i
    //   11410: ldc_w -211090246
    //   11413: ixor
    //   11414: goto -> 11425
    //   11417: ldc2_w -1346040748
    //   11420: l2i
    //   11421: ldc_w 1719272693
    //   11424: ixor
    //   11425: ldc2_w 1776667793
    //   11428: l2i
    //   11429: ldc_w 750610159
    //   11432: ixor
    //   11433: ixor
    //   11434: lookupswitch default -> 11460, -2090334815 -> 11417, -1313406718 -> 13202
    //   11460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11463: ldc2_w -2125528294
    //   11466: l2i
    //   11467: ldc_w -2125528091
    //   11470: ixor
    //   11471: getstatic Perryc.c : I
    //   11474: iflt -> 11488
    //   11477: ldc2_w -576400821
    //   11480: l2i
    //   11481: ldc_w -1357099744
    //   11484: ixor
    //   11485: goto -> 11496
    //   11488: ldc2_w 1929139637
    //   11491: l2i
    //   11492: ldc_w -536690007
    //   11495: ixor
    //   11496: ldc2_w 651473426
    //   11499: l2i
    //   11500: ldc_w 1730402256
    //   11503: ixor
    //   11504: ixor
    //   11505: lookupswitch default -> 13232, -754322722 -> 11532, 860879529 -> 11488
    //   11532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11535: ldc2_w 508641092
    //   11538: l2i
    //   11539: ldc_w 508641092
    //   11542: ixor
    //   11543: getstatic Perryc.c : I
    //   11546: iflt -> 11560
    //   11549: ldc2_w 1587122527
    //   11552: l2i
    //   11553: ldc_w -237614819
    //   11556: ixor
    //   11557: goto -> 11568
    //   11560: ldc2_w 921426298
    //   11563: l2i
    //   11564: ldc_w 656152474
    //   11567: ixor
    //   11568: ldc2_w 683473738
    //   11571: l2i
    //   11572: ldc_w 2087253467
    //   11575: ixor
    //   11576: ixor
    //   11577: lookupswitch default -> 13338, -73673005 -> 11560, 1159970929 -> 11604
    //   11604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11607: ldc2_w 855727389
    //   11610: l2i
    //   11611: ldc_w 855727586
    //   11614: ixor
    //   11615: getstatic Perryc.1 : I
    //   11618: ifeq -> 11632
    //   11621: ldc2_w -599348229
    //   11624: l2i
    //   11625: ldc_w 617178110
    //   11628: ixor
    //   11629: goto -> 11640
    //   11632: ldc2_w -1819262132
    //   11635: l2i
    //   11636: ldc_w 1090075240
    //   11639: ixor
    //   11640: ldc2_w 409100692
    //   11643: l2i
    //   11644: ldc_w -2104178978
    //   11647: ixor
    //   11648: ixor
    //   11649: lookupswitch default -> 11676, 1652125519 -> 13204, 2078405614 -> 11632
    //   11676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11679: getstatic Perryc.c : I
    //   11682: iflt -> 11696
    //   11685: ldc2_w 85245705
    //   11688: l2i
    //   11689: ldc_w 622905683
    //   11692: ixor
    //   11693: goto -> 11704
    //   11696: ldc2_w 181327429
    //   11699: l2i
    //   11700: ldc_w -935054146
    //   11703: ixor
    //   11704: ldc2_w -1778239883
    //   11707: l2i
    //   11708: ldc_w 1043371293
    //   11711: ixor
    //   11712: ixor
    //   11713: lookupswitch default -> 13498, -2012818126 -> 11696, 1790460307 -> 11740
    //   11740: aload_0
    //   11741: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   11746: getstatic Perryc.0 : I
    //   11749: ifle -> 11763
    //   11752: ldc2_w 4558579
    //   11755: l2i
    //   11756: ldc_w 1983904991
    //   11759: ixor
    //   11760: goto -> 11771
    //   11763: ldc2_w -1757505820
    //   11766: l2i
    //   11767: ldc_w 1052689762
    //   11770: ixor
    //   11771: ldc2_w -1495807405
    //   11774: l2i
    //   11775: ldc_w -596944204
    //   11778: ixor
    //   11779: ixor
    //   11780: lookupswitch default -> 11808, 214360779 -> 13168, 1651597347 -> 11763
    //   11808: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11811: getstatic Perryc.c : I
    //   11814: iflt -> 11828
    //   11817: ldc2_w 1026443734
    //   11820: l2i
    //   11821: ldc_w 1290950170
    //   11824: ixor
    //   11825: goto -> 11836
    //   11828: ldc2_w -472813876
    //   11831: l2i
    //   11832: ldc_w 1832445281
    //   11835: ixor
    //   11836: ldc2_w 965423632
    //   11839: l2i
    //   11840: ldc_w 1817845181
    //   11843: ixor
    //   11844: ixor
    //   11845: lookupswitch default -> 13410, -617044992 -> 11872, 604844129 -> 11828
    //   11872: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11875: getstatic Perryc.0 : I
    //   11878: ifle -> 11892
    //   11881: ldc2_w -1400444314
    //   11884: l2i
    //   11885: ldc_w -1855658471
    //   11888: ixor
    //   11889: goto -> 11900
    //   11892: ldc2_w 882631703
    //   11895: l2i
    //   11896: ldc_w 103399939
    //   11899: ixor
    //   11900: ldc2_w -2016330012
    //   11903: l2i
    //   11904: ldc_w -495867579
    //   11907: ixor
    //   11908: ixor
    //   11909: lookupswitch default -> 13438, 1460842933 -> 11936, 1480760286 -> 11892
    //   11936: putfield NCgreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11939: getstatic Perryc.1 : I
    //   11942: ifeq -> 11956
    //   11945: ldc2_w 1930844490
    //   11948: l2i
    //   11949: ldc_w 366735402
    //   11952: ixor
    //   11953: goto -> 11964
    //   11956: ldc2_w 492491307
    //   11959: l2i
    //   11960: ldc_w 1502474825
    //   11963: ixor
    //   11964: ldc2_w -1852028844
    //   11967: l2i
    //   11968: ldc_w -69041896
    //   11971: ixor
    //   11972: ixor
    //   11973: lookupswitch default -> 12000, -792374894 -> 11956, 213082156 -> 13496
    //   12000: aload_0
    //   12001: getstatic Perryc.0 : I
    //   12004: ifle -> 12018
    //   12007: ldc2_w -627218608
    //   12010: l2i
    //   12011: ldc_w -880410997
    //   12014: ixor
    //   12015: goto -> 12026
    //   12018: ldc2_w 1569124547
    //   12021: l2i
    //   12022: ldc_w 1995391911
    //   12025: ixor
    //   12026: ldc2_w 1221045689
    //   12029: l2i
    //   12030: ldc_w 243091408
    //   12033: ixor
    //   12034: ixor
    //   12035: lookupswitch default -> 13448, 1470264242 -> 12018, 1842567437 -> 12060
    //   12060: aload_0
    //   12061: new bigname/zprestige/webhack/features/setting/Setting
    //   12064: dup
    //   12065: ldc_w '묣㌖뭥㶣ࣔ喉๵욯蹦'
    //   12068: getstatic Perryc.c : I
    //   12071: iflt -> 12085
    //   12074: ldc2_w -1739123547
    //   12077: l2i
    //   12078: ldc_w 883630713
    //   12081: ixor
    //   12082: goto -> 12093
    //   12085: ldc2_w 693680777
    //   12088: l2i
    //   12089: ldc_w -1651204953
    //   12092: ixor
    //   12093: ldc2_w -1861380487
    //   12096: l2i
    //   12097: ldc_w 1775701516
    //   12100: ixor
    //   12101: ixor
    //   12102: lookupswitch default -> 12128, -291527346 -> 12085, 1411821225 -> 13426
    //   12128: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12131: ldc2_w 257907229
    //   12134: l2i
    //   12135: ldc_w 257907426
    //   12138: ixor
    //   12139: getstatic Perryc.0 : I
    //   12142: ifle -> 12156
    //   12145: ldc2_w -841670358
    //   12148: l2i
    //   12149: ldc_w 289944592
    //   12152: ixor
    //   12153: goto -> 12164
    //   12156: ldc2_w 813093494
    //   12159: l2i
    //   12160: ldc_w -74477610
    //   12163: ixor
    //   12164: ldc2_w -1966569606
    //   12167: l2i
    //   12168: ldc_w -1584233664
    //   12171: ixor
    //   12172: ixor
    //   12173: lookupswitch default -> 13376, -526165606 -> 12200, -137948928 -> 12156
    //   12200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12203: ldc2_w -20089367
    //   12206: l2i
    //   12207: ldc_w -20089367
    //   12210: ixor
    //   12211: getstatic Perryc.c : I
    //   12214: iflt -> 12228
    //   12217: ldc2_w -181799144
    //   12220: l2i
    //   12221: ldc_w 1072310248
    //   12224: ixor
    //   12225: goto -> 12236
    //   12228: ldc2_w 2122417530
    //   12231: l2i
    //   12232: ldc_w 958855887
    //   12235: ixor
    //   12236: ldc2_w 1627784543
    //   12239: l2i
    //   12240: ldc_w -1415295737
    //   12243: ixor
    //   12244: ixor
    //   12245: lookupswitch default -> 13282, -1929037843 -> 12272, 6396072 -> 12228
    //   12272: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12275: ldc2_w -291562253
    //   12278: l2i
    //   12279: ldc_w -291562484
    //   12282: ixor
    //   12283: getstatic Perryc.0 : I
    //   12286: ifle -> 12300
    //   12289: ldc2_w 489657660
    //   12292: l2i
    //   12293: ldc_w 1998970647
    //   12296: ixor
    //   12297: goto -> 12308
    //   12300: ldc2_w 1611949182
    //   12303: l2i
    //   12304: ldc_w 559038661
    //   12307: ixor
    //   12308: ldc2_w -1191255932
    //   12311: l2i
    //   12312: ldc_w 1518905232
    //   12315: ixor
    //   12316: ixor
    //   12317: lookupswitch default -> 13418, -2005136065 -> 12300, -1557109841 -> 12344
    //   12344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12347: getstatic Perryc.1 : I
    //   12350: ifeq -> 12364
    //   12353: ldc2_w -1607307306
    //   12356: l2i
    //   12357: ldc_w 715440226
    //   12360: ixor
    //   12361: goto -> 12372
    //   12364: ldc2_w 469834050
    //   12367: l2i
    //   12368: ldc_w 1498943465
    //   12371: ixor
    //   12372: ldc2_w -805693113
    //   12375: l2i
    //   12376: ldc_w -1846412615
    //   12379: ixor
    //   12380: ixor
    //   12381: lookupswitch default -> 13374, -727888822 -> 12364, 458421589 -> 12408
    //   12408: aload_0
    //   12409: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   12414: getstatic Perryc.1 : I
    //   12417: ifeq -> 12431
    //   12420: ldc2_w -358692977
    //   12423: l2i
    //   12424: ldc_w 97849355
    //   12427: ixor
    //   12428: goto -> 12439
    //   12431: ldc2_w -1007672510
    //   12434: l2i
    //   12435: ldc_w 1441565597
    //   12438: ixor
    //   12439: ldc2_w 1277623899
    //   12442: l2i
    //   12443: ldc_w -838104841
    //   12446: ixor
    //   12447: ixor
    //   12448: lookupswitch default -> 12476, 309446808 -> 12431, 1835442472 -> 13486
    //   12476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12479: getstatic Perryc.0 : I
    //   12482: ifle -> 12496
    //   12485: ldc2_w 2066628336
    //   12488: l2i
    //   12489: ldc_w 521356502
    //   12492: ixor
    //   12493: goto -> 12504
    //   12496: ldc2_w -2009938556
    //   12499: l2i
    //   12500: ldc_w -52965049
    //   12503: ixor
    //   12504: ldc2_w -2039001793
    //   12507: l2i
    //   12508: ldc_w -2077530452
    //   12511: ixor
    //   12512: ixor
    //   12513: lookupswitch default -> 13296, 1717653941 -> 12496, 1991851856 -> 12540
    //   12540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12543: getstatic Perryc.1 : I
    //   12546: ifeq -> 12560
    //   12549: ldc2_w 773704868
    //   12552: l2i
    //   12553: ldc_w -902760110
    //   12556: ixor
    //   12557: goto -> 12568
    //   12560: ldc2_w 1308219301
    //   12563: l2i
    //   12564: ldc_w -1146273148
    //   12567: ixor
    //   12568: ldc2_w -895142439
    //   12571: l2i
    //   12572: ldc_w -1543709922
    //   12575: ixor
    //   12576: ixor
    //   12577: lookupswitch default -> 13234, -1921721551 -> 12560, -1626506266 -> 12604
    //   12604: putfield NCblue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12607: getstatic Perryc.0 : I
    //   12610: ifle -> 12624
    //   12613: ldc2_w 1115638040
    //   12616: l2i
    //   12617: ldc_w 816530262
    //   12620: ixor
    //   12621: goto -> 12632
    //   12624: ldc2_w 628890652
    //   12627: l2i
    //   12628: ldc_w -1706868093
    //   12631: ixor
    //   12632: ldc2_w -401423016
    //   12635: l2i
    //   12636: ldc_w -1138238985
    //   12639: ixor
    //   12640: ixor
    //   12641: lookupswitch default -> 12668, 652285665 -> 13178, 1772544181 -> 12624
    //   12668: aload_0
    //   12669: getstatic Perryc.0 : I
    //   12672: ifle -> 12686
    //   12675: ldc2_w 1633925456
    //   12678: l2i
    //   12679: ldc_w 1152693233
    //   12682: ixor
    //   12683: goto -> 12694
    //   12686: ldc2_w -1124811420
    //   12689: l2i
    //   12690: ldc_w -103080334
    //   12693: ixor
    //   12694: ldc2_w 433941104
    //   12697: l2i
    //   12698: ldc_w 913445823
    //   12701: ixor
    //   12702: ixor
    //   12703: lookupswitch default -> 12728, 175666030 -> 13460, 1526034421 -> 12686
    //   12728: aload_0
    //   12729: new bigname/zprestige/webhack/features/setting/Setting
    //   12732: dup
    //   12733: ldc_w '묣㌖뭥㶣ࣙ喙๸욳蹭周σਰ'
    //   12736: getstatic Perryc.c : I
    //   12739: iflt -> 12753
    //   12742: ldc2_w -983553865
    //   12745: l2i
    //   12746: ldc_w -1482706914
    //   12749: ixor
    //   12750: goto -> 12761
    //   12753: ldc2_w -1118662840
    //   12756: l2i
    //   12757: ldc_w 92410377
    //   12760: ixor
    //   12761: ldc2_w 218542635
    //   12764: l2i
    //   12765: ldc_w -1591778098
    //   12768: ixor
    //   12769: ixor
    //   12770: lookupswitch default -> 13184, -823767476 -> 12753, 348736420 -> 12796
    //   12796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12799: ldc2_w 1894656432
    //   12802: l2i
    //   12803: ldc_w 1894656432
    //   12806: ixor
    //   12807: getstatic Perryc.c : I
    //   12810: iflt -> 12824
    //   12813: ldc2_w -694336046
    //   12816: l2i
    //   12817: ldc_w -1334057698
    //   12820: ixor
    //   12821: goto -> 12832
    //   12824: ldc2_w 361060213
    //   12827: l2i
    //   12828: ldc_w 1699137955
    //   12831: ixor
    //   12832: ldc2_w 1121389150
    //   12835: l2i
    //   12836: ldc_w 1127905290
    //   12839: ixor
    //   12840: ixor
    //   12841: lookupswitch default -> 13256, 1728828056 -> 12824, 1898900610 -> 12868
    //   12868: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   12871: getstatic Perryc.1 : I
    //   12874: ifeq -> 12888
    //   12877: ldc2_w 969158654
    //   12880: l2i
    //   12881: ldc_w -706108709
    //   12884: ixor
    //   12885: goto -> 12896
    //   12888: ldc2_w -1436343815
    //   12891: l2i
    //   12892: ldc_w 266562480
    //   12895: ixor
    //   12896: ldc2_w -2137844354
    //   12899: l2i
    //   12900: ldc_w 1676322007
    //   12903: ixor
    //   12904: ixor
    //   12905: lookupswitch default -> 12932, -1310543115 -> 12888, 257178764 -> 13192
    //   12932: aload_0
    //   12933: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/Nametags;)Ljava/util/function/Predicate;
    //   12938: getstatic Perryc.1 : I
    //   12941: ifeq -> 12955
    //   12944: ldc2_w 1816636795
    //   12947: l2i
    //   12948: ldc_w -1871934900
    //   12951: ixor
    //   12952: goto -> 12963
    //   12955: ldc2_w -1222179633
    //   12958: l2i
    //   12959: ldc_w -1946796424
    //   12962: ixor
    //   12963: ldc2_w -820295264
    //   12966: l2i
    //   12967: ldc_w 1768258116
    //   12970: ixor
    //   12971: ixor
    //   12972: lookupswitch default -> 13308, -1699804845 -> 13000, 1515525331 -> 12955
    //   13000: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13003: getstatic Perryc.c : I
    //   13006: iflt -> 13020
    //   13009: ldc2_w 1365128883
    //   13012: l2i
    //   13013: ldc_w 1489488722
    //   13016: ixor
    //   13017: goto -> 13028
    //   13020: ldc2_w -141295224
    //   13023: l2i
    //   13024: ldc_w -110621733
    //   13027: ixor
    //   13028: ldc2_w 1209233066
    //   13031: l2i
    //   13032: ldc_w 1069987175
    //   13035: ixor
    //   13036: ixor
    //   13037: lookupswitch default -> 13294, 2032783774 -> 13064, 2118919724 -> 13020
    //   13064: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13067: getstatic Perryc.0 : I
    //   13070: ifle -> 13084
    //   13073: ldc2_w 2070151295
    //   13076: l2i
    //   13077: ldc_w 814686600
    //   13080: ixor
    //   13081: goto -> 13092
    //   13084: ldc2_w -2721002
    //   13087: l2i
    //   13088: ldc_w 1822580327
    //   13091: ixor
    //   13092: ldc2_w -1252835454
    //   13095: l2i
    //   13096: ldc_w 433594760
    //   13099: ixor
    //   13100: ixor
    //   13101: lookupswitch default -> 13284, -413122563 -> 13084, 1073691515 -> 13128
    //   13128: putfield NCRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13131: return
    //   13132: aconst_null
    //   13133: athrow
    //   13134: aconst_null
    //   13135: athrow
    //   13136: aconst_null
    //   13137: athrow
    //   13138: aconst_null
    //   13139: athrow
    //   13140: aconst_null
    //   13141: athrow
    //   13142: aconst_null
    //   13143: athrow
    //   13144: aconst_null
    //   13145: athrow
    //   13146: aconst_null
    //   13147: athrow
    //   13148: aconst_null
    //   13149: athrow
    //   13150: aconst_null
    //   13151: athrow
    //   13152: aconst_null
    //   13153: athrow
    //   13154: aconst_null
    //   13155: athrow
    //   13156: aconst_null
    //   13157: athrow
    //   13158: aconst_null
    //   13159: athrow
    //   13160: aconst_null
    //   13161: athrow
    //   13162: aconst_null
    //   13163: athrow
    //   13164: aconst_null
    //   13165: athrow
    //   13166: aconst_null
    //   13167: athrow
    //   13168: aconst_null
    //   13169: athrow
    //   13170: aconst_null
    //   13171: athrow
    //   13172: aconst_null
    //   13173: athrow
    //   13174: aconst_null
    //   13175: athrow
    //   13176: aconst_null
    //   13177: athrow
    //   13178: aconst_null
    //   13179: athrow
    //   13180: aconst_null
    //   13181: athrow
    //   13182: aconst_null
    //   13183: athrow
    //   13184: aconst_null
    //   13185: athrow
    //   13186: aconst_null
    //   13187: athrow
    //   13188: aconst_null
    //   13189: athrow
    //   13190: aconst_null
    //   13191: athrow
    //   13192: aconst_null
    //   13193: athrow
    //   13194: aconst_null
    //   13195: athrow
    //   13196: aconst_null
    //   13197: athrow
    //   13198: aconst_null
    //   13199: athrow
    //   13200: aconst_null
    //   13201: athrow
    //   13202: aconst_null
    //   13203: athrow
    //   13204: aconst_null
    //   13205: athrow
    //   13206: aconst_null
    //   13207: athrow
    //   13208: aconst_null
    //   13209: athrow
    //   13210: aconst_null
    //   13211: athrow
    //   13212: aconst_null
    //   13213: athrow
    //   13214: aconst_null
    //   13215: athrow
    //   13216: aconst_null
    //   13217: athrow
    //   13218: aconst_null
    //   13219: athrow
    //   13220: aconst_null
    //   13221: athrow
    //   13222: aconst_null
    //   13223: athrow
    //   13224: aconst_null
    //   13225: athrow
    //   13226: aconst_null
    //   13227: athrow
    //   13228: aconst_null
    //   13229: athrow
    //   13230: aconst_null
    //   13231: athrow
    //   13232: aconst_null
    //   13233: athrow
    //   13234: aconst_null
    //   13235: athrow
    //   13236: aconst_null
    //   13237: athrow
    //   13238: aconst_null
    //   13239: athrow
    //   13240: aconst_null
    //   13241: athrow
    //   13242: aconst_null
    //   13243: athrow
    //   13244: aconst_null
    //   13245: athrow
    //   13246: aconst_null
    //   13247: athrow
    //   13248: aconst_null
    //   13249: athrow
    //   13250: aconst_null
    //   13251: athrow
    //   13252: aconst_null
    //   13253: athrow
    //   13254: aconst_null
    //   13255: athrow
    //   13256: aconst_null
    //   13257: athrow
    //   13258: aconst_null
    //   13259: athrow
    //   13260: aconst_null
    //   13261: athrow
    //   13262: aconst_null
    //   13263: athrow
    //   13264: aconst_null
    //   13265: athrow
    //   13266: aconst_null
    //   13267: athrow
    //   13268: aconst_null
    //   13269: athrow
    //   13270: aconst_null
    //   13271: athrow
    //   13272: aconst_null
    //   13273: athrow
    //   13274: aconst_null
    //   13275: athrow
    //   13276: aconst_null
    //   13277: athrow
    //   13278: aconst_null
    //   13279: athrow
    //   13280: aconst_null
    //   13281: athrow
    //   13282: aconst_null
    //   13283: athrow
    //   13284: aconst_null
    //   13285: athrow
    //   13286: aconst_null
    //   13287: athrow
    //   13288: aconst_null
    //   13289: athrow
    //   13290: aconst_null
    //   13291: athrow
    //   13292: aconst_null
    //   13293: athrow
    //   13294: aconst_null
    //   13295: athrow
    //   13296: aconst_null
    //   13297: athrow
    //   13298: aconst_null
    //   13299: athrow
    //   13300: aconst_null
    //   13301: athrow
    //   13302: aconst_null
    //   13303: athrow
    //   13304: aconst_null
    //   13305: athrow
    //   13306: aconst_null
    //   13307: athrow
    //   13308: aconst_null
    //   13309: athrow
    //   13310: aconst_null
    //   13311: athrow
    //   13312: aconst_null
    //   13313: athrow
    //   13314: aconst_null
    //   13315: athrow
    //   13316: aconst_null
    //   13317: athrow
    //   13318: aconst_null
    //   13319: athrow
    //   13320: aconst_null
    //   13321: athrow
    //   13322: aconst_null
    //   13323: athrow
    //   13324: aconst_null
    //   13325: athrow
    //   13326: aconst_null
    //   13327: athrow
    //   13328: aconst_null
    //   13329: athrow
    //   13330: aconst_null
    //   13331: athrow
    //   13332: aconst_null
    //   13333: athrow
    //   13334: aconst_null
    //   13335: athrow
    //   13336: aconst_null
    //   13337: athrow
    //   13338: aconst_null
    //   13339: athrow
    //   13340: aconst_null
    //   13341: athrow
    //   13342: aconst_null
    //   13343: athrow
    //   13344: aconst_null
    //   13345: athrow
    //   13346: aconst_null
    //   13347: athrow
    //   13348: aconst_null
    //   13349: athrow
    //   13350: aconst_null
    //   13351: athrow
    //   13352: aconst_null
    //   13353: athrow
    //   13354: aconst_null
    //   13355: athrow
    //   13356: aconst_null
    //   13357: athrow
    //   13358: aconst_null
    //   13359: athrow
    //   13360: aconst_null
    //   13361: athrow
    //   13362: aconst_null
    //   13363: athrow
    //   13364: aconst_null
    //   13365: athrow
    //   13366: aconst_null
    //   13367: athrow
    //   13368: aconst_null
    //   13369: athrow
    //   13370: aconst_null
    //   13371: athrow
    //   13372: aconst_null
    //   13373: athrow
    //   13374: aconst_null
    //   13375: athrow
    //   13376: aconst_null
    //   13377: athrow
    //   13378: aconst_null
    //   13379: athrow
    //   13380: aconst_null
    //   13381: athrow
    //   13382: aconst_null
    //   13383: athrow
    //   13384: aconst_null
    //   13385: athrow
    //   13386: aconst_null
    //   13387: athrow
    //   13388: aconst_null
    //   13389: athrow
    //   13390: aconst_null
    //   13391: athrow
    //   13392: aconst_null
    //   13393: athrow
    //   13394: aconst_null
    //   13395: athrow
    //   13396: aconst_null
    //   13397: athrow
    //   13398: aconst_null
    //   13399: athrow
    //   13400: aconst_null
    //   13401: athrow
    //   13402: aconst_null
    //   13403: athrow
    //   13404: aconst_null
    //   13405: athrow
    //   13406: aconst_null
    //   13407: athrow
    //   13408: aconst_null
    //   13409: athrow
    //   13410: aconst_null
    //   13411: athrow
    //   13412: aconst_null
    //   13413: athrow
    //   13414: aconst_null
    //   13415: athrow
    //   13416: aconst_null
    //   13417: athrow
    //   13418: aconst_null
    //   13419: athrow
    //   13420: aconst_null
    //   13421: athrow
    //   13422: aconst_null
    //   13423: athrow
    //   13424: aconst_null
    //   13425: athrow
    //   13426: aconst_null
    //   13427: athrow
    //   13428: aconst_null
    //   13429: athrow
    //   13430: aconst_null
    //   13431: athrow
    //   13432: aconst_null
    //   13433: athrow
    //   13434: aconst_null
    //   13435: athrow
    //   13436: aconst_null
    //   13437: athrow
    //   13438: aconst_null
    //   13439: athrow
    //   13440: aconst_null
    //   13441: athrow
    //   13442: aconst_null
    //   13443: athrow
    //   13444: aconst_null
    //   13445: athrow
    //   13446: aconst_null
    //   13447: athrow
    //   13448: aconst_null
    //   13449: athrow
    //   13450: aconst_null
    //   13451: athrow
    //   13452: aconst_null
    //   13453: athrow
    //   13454: aconst_null
    //   13455: athrow
    //   13456: aconst_null
    //   13457: athrow
    //   13458: aconst_null
    //   13459: athrow
    //   13460: aconst_null
    //   13461: athrow
    //   13462: aconst_null
    //   13463: athrow
    //   13464: aconst_null
    //   13465: athrow
    //   13466: aconst_null
    //   13467: athrow
    //   13468: aconst_null
    //   13469: athrow
    //   13470: aconst_null
    //   13471: athrow
    //   13472: aconst_null
    //   13473: athrow
    //   13474: aconst_null
    //   13475: athrow
    //   13476: aconst_null
    //   13477: athrow
    //   13478: aconst_null
    //   13479: athrow
    //   13480: aconst_null
    //   13481: athrow
    //   13482: aconst_null
    //   13483: athrow
    //   13484: aconst_null
    //   13485: athrow
    //   13486: aconst_null
    //   13487: athrow
    //   13488: aconst_null
    //   13489: athrow
    //   13490: aconst_null
    //   13491: athrow
    //   13492: aconst_null
    //   13493: athrow
    //   13494: aconst_null
    //   13495: athrow
    //   13496: aconst_null
    //   13497: athrow
    //   13498: aconst_null
    //   13499: athrow
    //   13500: aconst_null
    //   13501: athrow
    //   13502: aconst_null
    //   13503: athrow
    //   13504: aconst_null
    //   13505: athrow
    //   13506: aconst_null
    //   13507: athrow
    //   13508: aconst_null
    //   13509: athrow
    //   13510: aconst_null
    //   13511: athrow
    //   13512: aconst_null
    //   13513: athrow
    //   13514: aconst_null
    //   13515: athrow
    //   13516: aconst_null
    //   13517: athrow
    //   13518: aconst_null
    //   13519: athrow
    //   13520: aconst_null
    //   13521: athrow
    //   13522: aconst_null
    //   13523: athrow
    //   13524: aconst_null
    //   13525: athrow
    //   13526: aconst_null
    //   13527: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	13132	0	this	Lbigname/zprestige/webhack/features/modules/Render/Nametags;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\Nametags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */