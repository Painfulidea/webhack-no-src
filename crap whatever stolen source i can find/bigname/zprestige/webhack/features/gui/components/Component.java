package bigname.zprestige.webhack.features.gui.components;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.gui.components.items.Item;
import bigname.zprestige.webhack.features.gui.components.items.buttons.Button;
import java.util.ArrayList;

public class Component extends Feature {
  public int y;
  
  public int startcolor;
  
  public int x;
  
  public static int[] counter1;
  
  public boolean open;
  
  public int x2;
  
  public int barHeight;
  
  public int y2;
  
  public int height;
  
  public int endcolor;
  
  public ArrayList<Item> items;
  
  public int width;
  
  public boolean drag;
  
  public boolean hidden;
  
  public static void lambda$mouseClicked$1(int paramInt1, int paramInt2, int paramInt3, Item paramItem) {
    Perry1.51(null, (int)1336917876L ^ 0x29855730, paramInt1, paramInt2, paramInt3, paramItem);
  }
  
  public ArrayList getItems() {
    return Perry1.0q(this, (int)158800109L ^ 0x7DD67951);
  }
  
  public void drag(int mouseX, int mouseY) {
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
  
  public boolean isOpen() {
    return Perry1.4q(this, (int)2086075782L ^ 0x52B4FA80);
  }
  
  public void setY(int paramInt) {
    Perry1.B(this, (int)294697421L ^ 0x5FB9761E, paramInt);
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
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
  
  public void addButton(Button button) {
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
  
  public void onKeyTyped(char typedChar, int keyCode) {
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
  
  public int getHeight() {
    return Perry1.2T(this, (int)-1354646632L ^ 0x892B6CDC);
  }
  
  public int getWidth() {
    return Perry1.31(this, (int)2008181054L ^ 0x469C5891);
  }
  
  public void setWidth(int paramInt) {
    Perry1.E(this, (int)-817824222L ^ 0xDEB4A0B3, paramInt);
  }
  
  public Component(String name, int x, int y, boolean open) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -881245707
    //   9: l2i
    //   10: ldc_w -1916591421
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 711146904
    //   20: l2i
    //   21: ldc_w -42079455
    //   24: ixor
    //   25: ldc2_w -1613747866
    //   28: l2i
    //   29: ldc_w -1645265254
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 1149596874 -> 1614, 1265871319 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -666155627
    //   70: l2i
    //   71: ldc_w -1321989045
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1802062098
    //   81: l2i
    //   82: ldc_w -187048663
    //   85: ixor
    //   86: ldc2_w -1825189745
    //   89: l2i
    //   90: ldc_w 761581300
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 1610, -684828763 -> 78, -568429124 -> 120
    //   120: aload_1
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 138
    //   127: ldc2_w -1345074057
    //   130: l2i
    //   131: ldc_w 445442558
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w 728717896
    //   141: l2i
    //   142: ldc_w -1576593939
    //   145: ixor
    //   146: ldc2_w 864348119
    //   149: l2i
    //   150: ldc_w -1176790500
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 1590, 53949038 -> 180, 1056987202 -> 138
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 200
    //   189: ldc2_w -56145188
    //   192: l2i
    //   193: ldc_w -1451966141
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w -2100136746
    //   203: l2i
    //   204: ldc_w -753913284
    //   207: ixor
    //   208: ldc2_w -1367913874
    //   211: l2i
    //   212: ldc_w 715354294
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 244, -994201514 -> 200, -788025017 -> 1594
    //   244: aload_0
    //   245: new java/util/ArrayList
    //   248: dup
    //   249: getstatic Perryc.0 : I
    //   252: ifle -> 266
    //   255: ldc2_w 2054985943
    //   258: l2i
    //   259: ldc_w 631679186
    //   262: ixor
    //   263: goto -> 274
    //   266: ldc2_w 1104591423
    //   269: l2i
    //   270: ldc_w -2142133758
    //   273: ixor
    //   274: ldc2_w -1636007400
    //   277: l2i
    //   278: ldc_w 202138209
    //   281: ixor
    //   282: ixor
    //   283: lookupswitch default -> 308, -1875418559 -> 266, -844443524 -> 1622
    //   308: invokespecial <init> : ()V
    //   311: getstatic Perryc.0 : I
    //   314: ifle -> 328
    //   317: ldc2_w 1963024488
    //   320: l2i
    //   321: ldc_w -1134692384
    //   324: ixor
    //   325: goto -> 336
    //   328: ldc2_w -414008766
    //   331: l2i
    //   332: ldc_w -1908049817
    //   335: ixor
    //   336: ldc2_w -1502203777
    //   339: l2i
    //   340: ldc_w -1646499029
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 372, -1289659911 -> 328, -218706724 -> 1608
    //   372: putfield items : Ljava/util/ArrayList;
    //   375: getstatic Perryc.1 : I
    //   378: ifeq -> 392
    //   381: ldc2_w -1489219102
    //   384: l2i
    //   385: ldc_w -1815190947
    //   388: ixor
    //   389: goto -> 400
    //   392: ldc2_w -253854726
    //   395: l2i
    //   396: ldc_w 1798034794
    //   399: ixor
    //   400: ldc2_w 288316112
    //   403: l2i
    //   404: ldc_w 1505746238
    //   407: ixor
    //   408: ixor
    //   409: lookupswitch default -> 436, 1369315343 -> 392, 2086843473 -> 1592
    //   436: aload_0
    //   437: ldc2_w -919906918
    //   440: l2i
    //   441: ldc_w -919906918
    //   444: ixor
    //   445: getstatic Perryc.0 : I
    //   448: ifle -> 462
    //   451: ldc2_w -1296888085
    //   454: l2i
    //   455: ldc_w -1188520817
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w -1606487800
    //   465: l2i
    //   466: ldc_w -1737725171
    //   469: ixor
    //   470: ldc2_w -1254679525
    //   473: l2i
    //   474: ldc_w -239210100
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 1588, 1326546931 -> 462, 2094561170 -> 504
    //   504: putfield hidden : Z
    //   507: getstatic Perryc.0 : I
    //   510: ifle -> 524
    //   513: ldc2_w -1490932993
    //   516: l2i
    //   517: ldc_w 2051824798
    //   520: ixor
    //   521: goto -> 532
    //   524: ldc2_w -1075652396
    //   527: l2i
    //   528: ldc_w -1762704200
    //   531: ixor
    //   532: ldc2_w -768778463
    //   535: l2i
    //   536: ldc_w -27969214
    //   539: ixor
    //   540: ixor
    //   541: lookupswitch default -> 568, -250212350 -> 1624, 1073934661 -> 524
    //   568: aload_0
    //   569: getstatic Perryc.c : I
    //   572: iflt -> 586
    //   575: ldc2_w -35656897
    //   578: l2i
    //   579: ldc_w 2078583234
    //   582: ixor
    //   583: goto -> 594
    //   586: ldc2_w 135171905
    //   589: l2i
    //   590: ldc_w 1629214529
    //   593: ixor
    //   594: ldc2_w -1118493978
    //   597: l2i
    //   598: ldc_w -978480609
    //   601: ixor
    //   602: ixor
    //   603: lookupswitch default -> 628, -20712956 -> 1600, 2006664108 -> 586
    //   628: iload_2
    //   629: getstatic Perryc.0 : I
    //   632: ifle -> 646
    //   635: ldc2_w -1817548186
    //   638: l2i
    //   639: ldc_w -1626106378
    //   642: ixor
    //   643: goto -> 654
    //   646: ldc2_w -2002831534
    //   649: l2i
    //   650: ldc_w 1958415404
    //   653: ixor
    //   654: ldc2_w -841120181
    //   657: l2i
    //   658: ldc_w -856071800
    //   661: ixor
    //   662: ixor
    //   663: lookupswitch default -> 1584, -50275139 -> 688, 228399187 -> 646
    //   688: putfield x : I
    //   691: getstatic Perryc.1 : I
    //   694: ifeq -> 708
    //   697: ldc2_w 118304744
    //   700: l2i
    //   701: ldc_w 1562591620
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w -867952135
    //   711: l2i
    //   712: ldc_w 213448653
    //   715: ixor
    //   716: ldc2_w 304591989
    //   719: l2i
    //   720: ldc_w -1004427939
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -1943503036 -> 1604, -111291844 -> 708
    //   752: aload_0
    //   753: getstatic Perryc.c : I
    //   756: iflt -> 770
    //   759: ldc2_w 726443540
    //   762: l2i
    //   763: ldc_w -766743209
    //   766: ixor
    //   767: goto -> 778
    //   770: ldc2_w 1202665472
    //   773: l2i
    //   774: ldc_w 1701638999
    //   777: ixor
    //   778: ldc2_w 1064123475
    //   781: l2i
    //   782: ldc_w -550193261
    //   785: ixor
    //   786: ixor
    //   787: lookupswitch default -> 812, 425279619 -> 1620, 970530386 -> 770
    //   812: iload_3
    //   813: getstatic Perryc.1 : I
    //   816: ifeq -> 830
    //   819: ldc2_w -1148890560
    //   822: l2i
    //   823: ldc_w -64262365
    //   826: ixor
    //   827: goto -> 838
    //   830: ldc2_w -295760157
    //   833: l2i
    //   834: ldc_w 1854349655
    //   837: ixor
    //   838: ldc2_w 1085053967
    //   841: l2i
    //   842: ldc_w -689748442
    //   845: ixor
    //   846: ixor
    //   847: lookupswitch default -> 872, -773724342 -> 1612, 125135306 -> 830
    //   872: putfield y : I
    //   875: getstatic Perryc.c : I
    //   878: iflt -> 892
    //   881: ldc2_w 1402084100
    //   884: l2i
    //   885: ldc_w 1837845936
    //   888: ixor
    //   889: goto -> 900
    //   892: ldc2_w 465354024
    //   895: l2i
    //   896: ldc_w -68511227
    //   899: ixor
    //   900: ldc2_w 1117064662
    //   903: l2i
    //   904: ldc_w 527638501
    //   907: ixor
    //   908: ixor
    //   909: lookupswitch default -> 936, 1407261926 -> 892, 1677673607 -> 1596
    //   936: aload_0
    //   937: ldc2_w 1716886845
    //   940: l2i
    //   941: ldc_w 1716886867
    //   944: ixor
    //   945: getstatic Perryc.c : I
    //   948: iflt -> 962
    //   951: ldc2_w 591644630
    //   954: l2i
    //   955: ldc_w -2009469599
    //   958: ixor
    //   959: goto -> 970
    //   962: ldc2_w -500456127
    //   965: l2i
    //   966: ldc_w 1991690834
    //   969: ixor
    //   970: ldc2_w 1458868838
    //   973: l2i
    //   974: ldc_w -766632654
    //   977: ixor
    //   978: ixor
    //   979: lookupswitch default -> 1630, 271048775 -> 1004, 801154531 -> 962
    //   1004: putfield width : I
    //   1007: getstatic Perryc.c : I
    //   1010: iflt -> 1024
    //   1013: ldc2_w -1521328939
    //   1016: l2i
    //   1017: ldc_w -844066305
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w 550365912
    //   1027: l2i
    //   1028: ldc_w -1567532524
    //   1031: ixor
    //   1032: ldc2_w -211082284
    //   1035: l2i
    //   1036: ldc_w 276242300
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 1068, -1946226302 -> 1606, -1916211718 -> 1024
    //   1068: aload_0
    //   1069: ldc2_w 995668990
    //   1072: l2i
    //   1073: ldc_w 995668972
    //   1076: ixor
    //   1077: getstatic Perryc.1 : I
    //   1080: ifeq -> 1094
    //   1083: ldc2_w -1422477477
    //   1086: l2i
    //   1087: ldc_w 852655553
    //   1090: ixor
    //   1091: goto -> 1102
    //   1094: ldc2_w -15942618
    //   1097: l2i
    //   1098: ldc_w -878701167
    //   1101: ixor
    //   1102: ldc2_w -130691445
    //   1105: l2i
    //   1106: ldc_w 1974008642
    //   1109: ixor
    //   1110: ixor
    //   1111: lookupswitch default -> 1602, -1187931010 -> 1136, 343539539 -> 1094
    //   1136: putfield height : I
    //   1139: getstatic Perryc.c : I
    //   1142: iflt -> 1156
    //   1145: ldc2_w -1734792895
    //   1148: l2i
    //   1149: ldc_w 224328619
    //   1152: ixor
    //   1153: goto -> 1164
    //   1156: ldc2_w 1950797649
    //   1159: l2i
    //   1160: ldc_w 1806485469
    //   1163: ixor
    //   1164: ldc2_w 1374284821
    //   1167: l2i
    //   1168: ldc_w -1904545754
    //   1171: ixor
    //   1172: ixor
    //   1173: lookupswitch default -> 1616, -1065806657 -> 1200, 1247071961 -> 1156
    //   1200: aload_0
    //   1201: getstatic Perryc.c : I
    //   1204: iflt -> 1218
    //   1207: ldc2_w -1209247375
    //   1210: l2i
    //   1211: ldc_w -1015395529
    //   1214: ixor
    //   1215: goto -> 1226
    //   1218: ldc2_w -2017575125
    //   1221: l2i
    //   1222: ldc_w -327586407
    //   1225: ixor
    //   1226: ldc2_w -1116271896
    //   1229: l2i
    //   1230: ldc_w 1701196812
    //   1233: ixor
    //   1234: ixor
    //   1235: lookupswitch default -> 1626, -1400427358 -> 1218, -1277793194 -> 1260
    //   1260: iload #4
    //   1262: getstatic Perryc.1 : I
    //   1265: ifeq -> 1279
    //   1268: ldc2_w -1292484991
    //   1271: l2i
    //   1272: ldc_w 641033463
    //   1275: ixor
    //   1276: goto -> 1287
    //   1279: ldc2_w 1404096569
    //   1282: l2i
    //   1283: ldc_w -848621495
    //   1286: ixor
    //   1287: ldc2_w 94827007
    //   1290: l2i
    //   1291: ldc_w -569446742
    //   1294: ixor
    //   1295: ixor
    //   1296: lookupswitch default -> 1324, 640517673 -> 1279, 1332430115 -> 1632
    //   1324: putfield open : Z
    //   1327: getstatic Perryc.1 : I
    //   1330: ifeq -> 1344
    //   1333: ldc2_w 239956261
    //   1336: l2i
    //   1337: ldc_w -1130630339
    //   1340: ixor
    //   1341: goto -> 1352
    //   1344: ldc2_w 2100407641
    //   1347: l2i
    //   1348: ldc_w 1498045800
    //   1351: ixor
    //   1352: ldc2_w 1498022428
    //   1355: l2i
    //   1356: ldc_w -454000973
    //   1359: ixor
    //   1360: ixor
    //   1361: lookupswitch default -> 1598, -1715368802 -> 1388, 258801335 -> 1344
    //   1388: aload_0
    //   1389: ldc2_w -213013348
    //   1392: l2i
    //   1393: ldc_w -213013357
    //   1396: ixor
    //   1397: getstatic Perryc.c : I
    //   1400: iflt -> 1414
    //   1403: ldc2_w 1655424929
    //   1406: l2i
    //   1407: ldc_w -2002347300
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w 1318305682
    //   1417: l2i
    //   1418: ldc_w 120983814
    //   1421: ixor
    //   1422: ldc2_w -48955530
    //   1425: l2i
    //   1426: ldc_w 882901638
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1456, 599367821 -> 1618, 1355834514 -> 1414
    //   1456: putfield barHeight : I
    //   1459: getstatic Perryc.0 : I
    //   1462: ifle -> 1476
    //   1465: ldc2_w 848309550
    //   1468: l2i
    //   1469: ldc_w -1698103831
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w 1725426131
    //   1479: l2i
    //   1480: ldc_w -1721098421
    //   1483: ixor
    //   1484: ldc2_w 224663613
    //   1487: l2i
    //   1488: ldc_w 1760998017
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 1628, -1708172252 -> 1520, -842368389 -> 1476
    //   1520: aload_0
    //   1521: getstatic Perryc.c : I
    //   1524: iflt -> 1538
    //   1527: ldc2_w -192209179
    //   1530: l2i
    //   1531: ldc_w 566655789
    //   1534: ixor
    //   1535: goto -> 1546
    //   1538: ldc2_w -240971524
    //   1541: l2i
    //   1542: ldc_w -546523941
    //   1545: ixor
    //   1546: ldc2_w 166498340
    //   1549: l2i
    //   1550: ldc_w 1841644421
    //   1553: ixor
    //   1554: ixor
    //   1555: lookupswitch default -> 1586, -1318799767 -> 1538, 1256617862 -> 1580
    //   1580: invokevirtual setupItems : ()V
    //   1583: return
    //   1584: aconst_null
    //   1585: athrow
    //   1586: aconst_null
    //   1587: athrow
    //   1588: aconst_null
    //   1589: athrow
    //   1590: aconst_null
    //   1591: athrow
    //   1592: aconst_null
    //   1593: athrow
    //   1594: aconst_null
    //   1595: athrow
    //   1596: aconst_null
    //   1597: athrow
    //   1598: aconst_null
    //   1599: athrow
    //   1600: aconst_null
    //   1601: athrow
    //   1602: aconst_null
    //   1603: athrow
    //   1604: aconst_null
    //   1605: athrow
    //   1606: aconst_null
    //   1607: athrow
    //   1608: aconst_null
    //   1609: athrow
    //   1610: aconst_null
    //   1611: athrow
    //   1612: aconst_null
    //   1613: athrow
    //   1614: aconst_null
    //   1615: athrow
    //   1616: aconst_null
    //   1617: athrow
    //   1618: aconst_null
    //   1619: athrow
    //   1620: aconst_null
    //   1621: athrow
    //   1622: aconst_null
    //   1623: athrow
    //   1624: aconst_null
    //   1625: athrow
    //   1626: aconst_null
    //   1627: athrow
    //   1628: aconst_null
    //   1629: athrow
    //   1630: aconst_null
    //   1631: athrow
    //   1632: aconst_null
    //   1633: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1584	0	this	Lbigname/zprestige/webhack/features/gui/components/Component;
    //   0	1584	1	name	Ljava/lang/String;
    //   0	1584	2	x	I
    //   0	1584	3	y	I
    //   0	1584	4	open	Z
  }
  
  public static void lambda$onKeyTyped$3(char typedChar, int keyCode, Item item) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 309
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 301
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 293
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1287549131
    //   33: l2i
    //   34: ldc_w 1177859020
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -258118424
    //   44: l2i
    //   45: ldc_w -66074019
    //   48: ixor
    //   49: ldc2_w -1026463732
    //   52: l2i
    //   53: ldc_w -2026408112
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1332534363 -> 280, -767947896 -> 41
    //   84: aload_2
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -2108741590
    //   94: l2i
    //   95: ldc_w -258309347
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -690294466
    //   105: l2i
    //   106: ldc_w -640772313
    //   109: ixor
    //   110: ldc2_w 430735660
    //   113: l2i
    //   114: ldc_w 763703624
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, 1174287520 -> 102, 1190927187 -> 278
    //   144: iload_0
    //   145: getstatic Perryc.1 : I
    //   148: ifeq -> 162
    //   151: ldc2_w -563569304
    //   154: l2i
    //   155: ldc_w 1710725049
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -264159398
    //   165: l2i
    //   166: ldc_w -1971706965
    //   169: ixor
    //   170: ldc2_w 2072959715
    //   173: l2i
    //   174: ldc_w -178999540
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, 402240657 -> 162, 893747006 -> 276
    //   204: iload_1
    //   205: getstatic Perryc.1 : I
    //   208: ifeq -> 222
    //   211: ldc2_w 996232135
    //   214: l2i
    //   215: ldc_w -1225473071
    //   218: ixor
    //   219: goto -> 230
    //   222: ldc2_w -722386431
    //   225: l2i
    //   226: ldc_w 249012886
    //   229: ixor
    //   230: ldc2_w 937090642
    //   233: l2i
    //   234: ldc_w -757834075
    //   237: ixor
    //   238: ixor
    //   239: lookupswitch default -> 264, -2070657934 -> 222, 1754990817 -> 282
    //   264: goto -> 268
    //   267: athrow
    //   268: invokevirtual onKeyTyped : (CI)V
    //   271: goto -> 275
    //   274: athrow
    //   275: return
    //   276: aconst_null
    //   277: athrow
    //   278: aconst_null
    //   279: athrow
    //   280: aconst_null
    //   281: athrow
    //   282: aconst_null
    //   283: athrow
    //   284: pop
    //   285: goto -> 24
    //   288: pop
    //   289: aconst_null
    //   290: goto -> 284
    //   293: dup
    //   294: ifnull -> 284
    //   297: checkcast java/lang/Throwable
    //   300: athrow
    //   301: dup
    //   302: ifnull -> 288
    //   305: checkcast java/lang/Throwable
    //   308: athrow
    //   309: aconst_null
    //   310: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	252	0	typedChar	C
    //   24	252	1	keyCode	I
    //   24	252	2	item	Lbigname/zprestige/webhack/features/gui/components/items/Item;
    // Exception table:
    //   from	to	target	type
    //   8	20	293	java/lang/StringIndexOutOfBoundsException
    //   267	274	274	finally
    //   267	274	3	finally
    //   268	274	267	finally
    //   268	274	267	finally
    //   268	274	3	finally
    //   293	301	293	java/lang/IllegalArgumentException
    //   309	311	3	java/lang/NegativeArraySizeException
  }
  
  public boolean isHovering(int paramInt1, int paramInt2) {
    return Perry1.0M(this, (int)854838019L ^ 0x95757FE, paramInt1, paramInt2);
  }
  
  public static void lambda$mouseClicked$0(Component component) {
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
  
  public void setHeight(int paramInt) {
    Perry1.z(this, (int)-62906251L ^ 0x9BC59F4F, paramInt);
  }
  
  public boolean isHidden() {
    return Perry1.4G(this, (int)1696395494L ^ 0x7DCF46CA);
  }
  
  public int getX() {
    return Perry1.30(this, (int)-671628859L ^ 0xD0D033DB);
  }
  
  public int getY() {
    return Perry1.37(this, (int)1478668180L ^ 0x172B3D11);
  }
  
  public void mouseReleased(int mouseX, int mouseY, int releaseButton) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 887
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 879
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 871
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -316501821
    //   33: l2i
    //   34: ldc_w -1002103335
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1021537784
    //   44: l2i
    //   45: ldc_w 631673080
    //   48: ixor
    //   49: ldc2_w 2027720022
    //   52: l2i
    //   53: ldc_w -2015425942
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 842, -698086874 -> 41, -431588804 -> 84
    //   84: iload_3
    //   85: ifne -> 99
    //   88: ldc2_w -2015043343
    //   91: l2i
    //   92: ldc_w 1450851715
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w 157165393
    //   102: l2i
    //   103: ldc_w -658441694
    //   106: ixor
    //   107: ldc2_w 1052563938
    //   110: l2i
    //   111: ldc_w 184540218
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, -438445910 -> 140, -438445909 -> 271
    //   140: getstatic Perryc.1 : I
    //   143: ifeq -> 157
    //   146: ldc2_w 485040016
    //   149: l2i
    //   150: ldc_w -267177748
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w -649983391
    //   160: l2i
    //   161: ldc_w -639192847
    //   164: ixor
    //   165: ldc2_w 988362884
    //   168: l2i
    //   169: ldc_w -2025890810
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 846, -1116545518 -> 200, 1361857534 -> 157
    //   200: aload_0
    //   201: ldc2_w -100604026
    //   204: l2i
    //   205: ldc_w -100604026
    //   208: ixor
    //   209: getstatic Perryc.1 : I
    //   212: ifeq -> 226
    //   215: ldc2_w -1961949149
    //   218: l2i
    //   219: ldc_w 1693367933
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 144691325
    //   229: l2i
    //   230: ldc_w 912842692
    //   233: ixor
    //   234: ldc2_w -492989993
    //   237: l2i
    //   238: ldc_w -1207012268
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -1250798627 -> 856, -838635620 -> 226
    //   268: putfield drag : Z
    //   271: getstatic Perryc.c : I
    //   274: iflt -> 288
    //   277: ldc2_w -117148910
    //   280: l2i
    //   281: ldc_w -2025524479
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w 1737005696
    //   291: l2i
    //   292: ldc_w -358824310
    //   295: ixor
    //   296: ldc2_w 1094015863
    //   299: l2i
    //   300: ldc_w -1885984500
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 860, -1327238552 -> 288, 1136078449 -> 332
    //   332: aload_0
    //   333: getstatic Perryc.0 : I
    //   336: ifle -> 350
    //   339: ldc2_w -120474826
    //   342: l2i
    //   343: ldc_w -739844104
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w -312337708
    //   353: l2i
    //   354: ldc_w 926302627
    //   357: ixor
    //   358: ldc2_w 1038180023
    //   361: l2i
    //   362: ldc_w 1932988814
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 392, 1016690163 -> 350, 1709253623 -> 840
    //   392: getfield open : Z
    //   395: ifne -> 409
    //   398: ldc2_w 1723926383
    //   401: l2i
    //   402: ldc_w 1478308932
    //   405: ixor
    //   406: goto -> 417
    //   409: ldc2_w 1866373177
    //   412: l2i
    //   413: ldc_w 1373809425
    //   416: ixor
    //   417: ldc2_w -1125785537
    //   420: l2i
    //   421: ldc_w -1158185355
    //   424: ixor
    //   425: ixor
    //   426: tableswitch default -> 398, 953068897 -> 448, 953068898 -> 449
    //   448: return
    //   449: getstatic Perryc.0 : I
    //   452: ifle -> 466
    //   455: ldc2_w 1982963836
    //   458: l2i
    //   459: ldc_w -1243822724
    //   462: ixor
    //   463: goto -> 474
    //   466: ldc2_w 2059501552
    //   469: l2i
    //   470: ldc_w -959071609
    //   473: ixor
    //   474: ldc2_w -1754644206
    //   477: l2i
    //   478: ldc_w -1306533671
    //   481: ixor
    //   482: ixor
    //   483: lookupswitch default -> 848, -1721670468 -> 508, -426195765 -> 466
    //   508: aload_0
    //   509: getstatic Perryc.1 : I
    //   512: ifeq -> 526
    //   515: ldc2_w -257434634
    //   518: l2i
    //   519: ldc_w 768312241
    //   522: ixor
    //   523: goto -> 534
    //   526: ldc2_w 472081393
    //   529: l2i
    //   530: ldc_w 1688062490
    //   533: ixor
    //   534: ldc2_w 1222359735
    //   537: l2i
    //   538: ldc_w 1350900826
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 568, -986513750 -> 858, 778350853 -> 526
    //   568: goto -> 572
    //   571: athrow
    //   572: invokevirtual getItems : ()Ljava/util/ArrayList;
    //   575: goto -> 579
    //   578: athrow
    //   579: getstatic Perryc.c : I
    //   582: iflt -> 596
    //   585: ldc2_w 901638590
    //   588: l2i
    //   589: ldc_w -1763606123
    //   592: ixor
    //   593: goto -> 604
    //   596: ldc2_w -1335753356
    //   599: l2i
    //   600: ldc_w -1808202323
    //   603: ixor
    //   604: ldc2_w 1146615479
    //   607: l2i
    //   608: ldc_w 1234380567
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 640, -1365722741 -> 854, 1084309722 -> 596
    //   640: iload_1
    //   641: getstatic Perryc.c : I
    //   644: iflt -> 658
    //   647: ldc2_w 115161819
    //   650: l2i
    //   651: ldc_w 2022049990
    //   654: ixor
    //   655: goto -> 666
    //   658: ldc2_w -52050606
    //   661: l2i
    //   662: ldc_w 1285363235
    //   665: ixor
    //   666: ldc2_w -732806370
    //   669: l2i
    //   670: ldc_w -1454923792
    //   673: ixor
    //   674: ixor
    //   675: lookupswitch default -> 850, -848490593 -> 700, 55504627 -> 658
    //   700: iload_2
    //   701: getstatic Perryc.0 : I
    //   704: ifle -> 718
    //   707: ldc2_w -1818697182
    //   710: l2i
    //   711: ldc_w -1922995616
    //   714: ixor
    //   715: goto -> 726
    //   718: ldc2_w 1675964013
    //   721: l2i
    //   722: ldc_w 79220520
    //   725: ixor
    //   726: ldc2_w 36285058
    //   729: l2i
    //   730: ldc_w -1850425423
    //   733: ixor
    //   734: ixor
    //   735: lookupswitch default -> 760, -2062330753 -> 718, -1922785935 -> 844
    //   760: iload_3
    //   761: <illegal opcode> accept : (III)Ljava/util/function/Consumer;
    //   766: getstatic Perryc.c : I
    //   769: iflt -> 783
    //   772: ldc2_w -1093234765
    //   775: l2i
    //   776: ldc_w 1185552073
    //   779: ixor
    //   780: goto -> 791
    //   783: ldc2_w 1393660973
    //   786: l2i
    //   787: ldc_w 1662792686
    //   790: ixor
    //   791: ldc2_w -1610021508
    //   794: l2i
    //   795: ldc_w -1929250883
    //   798: ixor
    //   799: ixor
    //   800: lookupswitch default -> 852, -713790533 -> 783, 486888706 -> 828
    //   828: goto -> 832
    //   831: athrow
    //   832: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   835: goto -> 839
    //   838: athrow
    //   839: return
    //   840: aconst_null
    //   841: athrow
    //   842: aconst_null
    //   843: athrow
    //   844: aconst_null
    //   845: athrow
    //   846: aconst_null
    //   847: athrow
    //   848: aconst_null
    //   849: athrow
    //   850: aconst_null
    //   851: athrow
    //   852: aconst_null
    //   853: athrow
    //   854: aconst_null
    //   855: athrow
    //   856: aconst_null
    //   857: athrow
    //   858: aconst_null
    //   859: athrow
    //   860: aconst_null
    //   861: athrow
    //   862: pop
    //   863: goto -> 24
    //   866: pop
    //   867: aconst_null
    //   868: goto -> 862
    //   871: dup
    //   872: ifnull -> 862
    //   875: checkcast java/lang/Throwable
    //   878: athrow
    //   879: dup
    //   880: ifnull -> 866
    //   883: checkcast java/lang/Throwable
    //   886: athrow
    //   887: aconst_null
    //   888: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	816	0	this	Lbigname/zprestige/webhack/features/gui/components/Component;
    //   24	816	1	mouseX	I
    //   24	816	2	mouseY	I
    //   24	816	3	releaseButton	I
    // Exception table:
    //   from	to	target	type
    //   8	20	871	java/lang/NullPointerException
    //   572	578	578	finally
    //   572	578	3	finally
    //   572	578	3	java/lang/ArithmeticException
    //   572	578	578	finally
    //   572	578	578	java/lang/UnsupportedOperationException
    //   831	838	838	finally
    //   831	838	838	finally
    //   831	838	831	finally
    //   831	838	838	java/util/ConcurrentModificationException
    //   831	838	838	java/lang/ClassCastException
    //   871	879	871	java/lang/NullPointerException
    //   887	889	3	java/lang/AssertionError
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -1535520058
    //   3: l2i
    //   4: ldc_w -1535520057
    //   7: ixor
    //   8: newarray int
    //   10: dup
    //   11: ldc2_w -2080069532
    //   14: l2i
    //   15: ldc_w -2080069532
    //   18: ixor
    //   19: ldc2_w -1940971453
    //   22: l2i
    //   23: ldc_w -1940971454
    //   26: ixor
    //   27: iastore
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1040215338
    //   37: l2i
    //   38: ldc_w 311800108
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1371919033
    //   48: l2i
    //   49: ldc_w -1460048544
    //   52: ixor
    //   53: ldc2_w -1702880836
    //   56: l2i
    //   57: ldc_w 1884358801
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 92, 334343924 -> 88, 968569559 -> 45
    //   88: putstatic bigname/zprestige/webhack/features/gui/components/Component.counter1 : [I
    //   91: return
    //   92: aconst_null
    //   93: athrow
  }
  
  public void setX(int paramInt) {
    Perry1.B(this, (int)967467619L ^ 0x7783ADB1, paramInt);
  }
  
  public static void lambda$mouseReleased$2(int paramInt1, int paramInt2, int paramInt3, Item paramItem) {
    Perry1.51(null, (int)-405281673L ^ 0x81FD0C34, paramInt1, paramInt2, paramInt3, paramItem);
  }
  
  public void setupItems() {
    Perry1.3f(this, (int)-340065205L ^ 0x8A8A797D);
  }
  
  public float getTotalItemHeight() {
    return Perry1.2I(this, (int)2118950758L ^ 0x4DD613AC);
  }
  
  public void setHidden(boolean paramBoolean) {
    Perry1.65(this, (int)-939566798L ^ 0xA4224CCF, paramBoolean);
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\Component.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */