package bigname.zprestige.webhack.util.WurstPlusThree;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.util.Globals;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class WurstplusThreeBlockUtil implements Globals {
  public static List<Block> emptyBlocks;
  
  public static List<Block> rightclickableBlocks;
  
  public static boolean checkForNeighbours(BlockPos paramBlockPos) {
    return Perry1.6k(null, (int)-1263068728L ^ 0xA12C0072, paramBlockPos);
  }
  
  public static Vec3d[] getHelpingBlocks(Vec3d vec3d) {
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
  
  public static List getCircle(BlockPos loc, int y, float r, boolean hollow) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3358
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3350
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3342
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 2025941843
    //   37: l2i
    //   38: ldc_w -654239723
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1929667574
    //   48: l2i
    //   49: ldc_w 1687923187
    //   52: ixor
    //   53: ldc2_w 592941629
    //   56: l2i
    //   57: ldc_w 1052540721
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1137992118 -> 3301, 1176415078 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w 1168377054
    //   108: l2i
    //   109: ldc_w -476345372
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1284839955
    //   119: l2i
    //   120: ldc_w 1891676311
    //   123: ixor
    //   124: ldc2_w 2058323079
    //   127: l2i
    //   128: ldc_w -913578639
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 3253, 354152140 -> 116, 1888367756 -> 160
    //   160: astore #4
    //   162: getstatic Perryc.0 : I
    //   165: ifle -> 179
    //   168: ldc2_w -1940559373
    //   171: l2i
    //   172: ldc_w 458598713
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 225887861
    //   182: l2i
    //   183: ldc_w 996707740
    //   186: ixor
    //   187: ldc2_w 622916353
    //   190: l2i
    //   191: ldc_w 6181588
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 3249, -1300340449 -> 179, 325118524 -> 224
    //   224: aload_0
    //   225: getstatic Perryc.c : I
    //   228: iflt -> 242
    //   231: ldc2_w -604915804
    //   234: l2i
    //   235: ldc_w 1144214748
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w 712904107
    //   245: l2i
    //   246: ldc_w -2046337906
    //   249: ixor
    //   250: ldc2_w -610349134
    //   253: l2i
    //   254: ldc_w -1959482786
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 3327, -815233388 -> 242, -53267255 -> 284
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_177958_n : ()I
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.1 : I
    //   298: ifeq -> 312
    //   301: ldc2_w 1375922850
    //   304: l2i
    //   305: ldc_w 302831977
    //   308: ixor
    //   309: goto -> 320
    //   312: ldc2_w -1987891660
    //   315: l2i
    //   316: ldc_w -1244506769
    //   319: ixor
    //   320: ldc2_w -1726791597
    //   323: l2i
    //   324: ldc_w 112403573
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 3309, -1544478851 -> 356, -542222355 -> 312
    //   356: istore #5
    //   358: getstatic Perryc.0 : I
    //   361: ifle -> 375
    //   364: ldc2_w -456359352
    //   367: l2i
    //   368: ldc_w 2144828903
    //   371: ixor
    //   372: goto -> 383
    //   375: ldc2_w 1071502826
    //   378: l2i
    //   379: ldc_w 392134979
    //   382: ixor
    //   383: ldc2_w -1372738480
    //   386: l2i
    //   387: ldc_w 1889729336
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 3277, -166919231 -> 420, 1167370439 -> 375
    //   420: aload_0
    //   421: getstatic Perryc.0 : I
    //   424: ifle -> 438
    //   427: ldc2_w 164620542
    //   430: l2i
    //   431: ldc_w -665722759
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w 1498260879
    //   441: l2i
    //   442: ldc_w -1948095090
    //   445: ixor
    //   446: ldc2_w -814437916
    //   449: l2i
    //   450: ldc_w 1332157259
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 3303, 1368242728 -> 438, 1388083886 -> 480
    //   480: goto -> 484
    //   483: athrow
    //   484: invokevirtual func_177952_p : ()I
    //   487: goto -> 491
    //   490: athrow
    //   491: getstatic Perryc.c : I
    //   494: iflt -> 508
    //   497: ldc2_w 928452933
    //   500: l2i
    //   501: ldc_w 1462948207
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1747256902
    //   511: l2i
    //   512: ldc_w -414842899
    //   515: ixor
    //   516: ldc2_w -958928412
    //   519: l2i
    //   520: ldc_w -39927768
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, 1245255486 -> 508, 1529670118 -> 3305
    //   552: istore #6
    //   554: getstatic Perryc.1 : I
    //   557: ifeq -> 571
    //   560: ldc2_w -1309688042
    //   563: l2i
    //   564: ldc_w 312682534
    //   567: ixor
    //   568: goto -> 579
    //   571: ldc2_w 1609119259
    //   574: l2i
    //   575: ldc_w -1587266724
    //   578: ixor
    //   579: ldc2_w -1894030771
    //   582: l2i
    //   583: ldc_w 1503757969
    //   586: ixor
    //   587: ixor
    //   588: lookupswitch default -> 616, 1766529905 -> 571, 1979085804 -> 3243
    //   616: iload #5
    //   618: getstatic Perryc.0 : I
    //   621: ifle -> 635
    //   624: ldc2_w 356923753
    //   627: l2i
    //   628: ldc_w 1190304431
    //   631: ixor
    //   632: goto -> 643
    //   635: ldc2_w -1936155404
    //   638: l2i
    //   639: ldc_w -1278674469
    //   642: ixor
    //   643: ldc2_w 1454775178
    //   646: l2i
    //   647: ldc_w 1652870515
    //   650: ixor
    //   651: ixor
    //   652: lookupswitch default -> 680, 523913298 -> 635, 1736865087 -> 3259
    //   680: fload_2
    //   681: f2i
    //   682: isub
    //   683: getstatic Perryc.1 : I
    //   686: ifeq -> 700
    //   689: ldc2_w 775385583
    //   692: l2i
    //   693: ldc_w 372149030
    //   696: ixor
    //   697: goto -> 708
    //   700: ldc2_w 905505197
    //   703: l2i
    //   704: ldc_w -344806958
    //   707: ixor
    //   708: ldc2_w -1766822211
    //   711: l2i
    //   712: ldc_w -593185711
    //   715: ixor
    //   716: ixor
    //   717: lookupswitch default -> 3307, -1801545069 -> 744, 1913462821 -> 700
    //   744: istore #7
    //   746: getstatic Perryc.0 : I
    //   749: ifle -> 763
    //   752: ldc2_w -1120784798
    //   755: l2i
    //   756: ldc_w -934493405
    //   759: ixor
    //   760: goto -> 771
    //   763: ldc2_w 741459843
    //   766: l2i
    //   767: ldc_w -1771012544
    //   770: ixor
    //   771: ldc2_w -1303446347
    //   774: l2i
    //   775: ldc_w 2085859843
    //   778: ixor
    //   779: ixor
    //   780: lookupswitch default -> 3285, -1151097865 -> 763, 1952249717 -> 808
    //   808: iload #7
    //   810: i2f
    //   811: getstatic Perryc.c : I
    //   814: iflt -> 828
    //   817: ldc2_w -953012027
    //   820: l2i
    //   821: ldc_w 197359607
    //   824: ixor
    //   825: goto -> 836
    //   828: ldc2_w -1345808126
    //   831: l2i
    //   832: ldc_w 554978976
    //   835: ixor
    //   836: ldc2_w 259015718
    //   839: l2i
    //   840: ldc_w -409783516
    //   843: ixor
    //   844: ixor
    //   845: lookupswitch default -> 872, -1862009618 -> 828, 605171760 -> 3251
    //   872: iload #5
    //   874: i2f
    //   875: getstatic Perryc.c : I
    //   878: iflt -> 892
    //   881: ldc2_w 62502177
    //   884: l2i
    //   885: ldc_w -1184288386
    //   888: ixor
    //   889: goto -> 900
    //   892: ldc2_w 1385920085
    //   895: l2i
    //   896: ldc_w 874458275
    //   899: ixor
    //   900: ldc2_w 1004738399
    //   903: l2i
    //   904: ldc_w -1923666222
    //   907: ixor
    //   908: ixor
    //   909: lookupswitch default -> 936, -704991074 -> 892, 207928786 -> 3317
    //   936: fload_2
    //   937: fadd
    //   938: fcmpg
    //   939: ifgt -> 953
    //   942: ldc2_w -337982225
    //   945: l2i
    //   946: ldc_w 2041011423
    //   949: ixor
    //   950: goto -> 961
    //   953: ldc2_w 1037865621
    //   956: l2i
    //   957: ldc_w -1348402522
    //   960: ixor
    //   961: ldc2_w 169529250
    //   964: l2i
    //   965: ldc_w 911028195
    //   968: ixor
    //   969: ixor
    //   970: tableswitch default -> 942, -1372950415 -> 992, -1372950414 -> 3178
    //   992: getstatic Perryc.1 : I
    //   995: ifeq -> 1009
    //   998: ldc2_w -1571385248
    //   1001: l2i
    //   1002: ldc_w -1786268401
    //   1005: ixor
    //   1006: goto -> 1017
    //   1009: ldc2_w -365734925
    //   1012: l2i
    //   1013: ldc_w -232700804
    //   1016: ixor
    //   1017: ldc2_w 427233228
    //   1020: l2i
    //   1021: ldc_w -251818585
    //   1024: ixor
    //   1025: ixor
    //   1026: lookupswitch default -> 1052, -1850099010 -> 1009, -564418812 -> 3267
    //   1052: iload #6
    //   1054: getstatic Perryc.c : I
    //   1057: iflt -> 1071
    //   1060: ldc2_w -1890999860
    //   1063: l2i
    //   1064: ldc_w -1099577381
    //   1067: ixor
    //   1068: goto -> 1079
    //   1071: ldc2_w 1010804013
    //   1074: l2i
    //   1075: ldc_w 618899299
    //   1078: ixor
    //   1079: ldc2_w 2020863972
    //   1082: l2i
    //   1083: ldc_w -1224521290
    //   1086: ixor
    //   1087: ixor
    //   1088: lookupswitch default -> 1116, -1579642934 -> 1071, -28524475 -> 3331
    //   1116: fload_2
    //   1117: f2i
    //   1118: isub
    //   1119: getstatic Perryc.c : I
    //   1122: iflt -> 1136
    //   1125: ldc2_w 499886569
    //   1128: l2i
    //   1129: ldc_w 595596195
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w 1844749625
    //   1139: l2i
    //   1140: ldc_w 1038031628
    //   1143: ixor
    //   1144: ldc2_w 959536769
    //   1147: l2i
    //   1148: ldc_w -1339688866
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 3313, -1218503531 -> 1136, -650176278 -> 1180
    //   1180: istore #8
    //   1182: getstatic Perryc.c : I
    //   1185: iflt -> 1199
    //   1188: ldc2_w -436584138
    //   1191: l2i
    //   1192: ldc_w -1762624865
    //   1195: ixor
    //   1196: goto -> 1207
    //   1199: ldc2_w -1858695836
    //   1202: l2i
    //   1203: ldc_w -381391094
    //   1206: ixor
    //   1207: ldc2_w -991790211
    //   1210: l2i
    //   1211: ldc_w 349368087
    //   1214: ixor
    //   1215: ixor
    //   1216: lookupswitch default -> 1244, -1749571128 -> 1199, -1556435005 -> 3273
    //   1244: iload #8
    //   1246: i2f
    //   1247: getstatic Perryc.c : I
    //   1250: iflt -> 1264
    //   1253: ldc2_w -1313533086
    //   1256: l2i
    //   1257: ldc_w 2126673591
    //   1260: ixor
    //   1261: goto -> 1272
    //   1264: ldc2_w -2069479247
    //   1267: l2i
    //   1268: ldc_w 445506797
    //   1271: ixor
    //   1272: ldc2_w 1345300231
    //   1275: l2i
    //   1276: ldc_w 846505235
    //   1279: ixor
    //   1280: ixor
    //   1281: lookupswitch default -> 1308, -1389598783 -> 3269, -637742706 -> 1264
    //   1308: iload #6
    //   1310: i2f
    //   1311: getstatic Perryc.0 : I
    //   1314: ifle -> 1328
    //   1317: ldc2_w -394693119
    //   1320: l2i
    //   1321: ldc_w 267239720
    //   1324: ixor
    //   1325: goto -> 1336
    //   1328: ldc2_w -758866081
    //   1331: l2i
    //   1332: ldc_w 2082935393
    //   1335: ixor
    //   1336: ldc2_w -1414841719
    //   1339: l2i
    //   1340: ldc_w 720009705
    //   1343: ixor
    //   1344: ixor
    //   1345: lookupswitch default -> 3265, 799198814 -> 1372, 1725297737 -> 1328
    //   1372: fload_2
    //   1373: fadd
    //   1374: fcmpg
    //   1375: ifgt -> 1389
    //   1378: ldc2_w 64325180
    //   1381: l2i
    //   1382: ldc_w -1019879297
    //   1385: ixor
    //   1386: goto -> 1397
    //   1389: ldc2_w 331205235
    //   1392: l2i
    //   1393: ldc_w -748835791
    //   1396: ixor
    //   1397: ldc2_w 1794133569
    //   1400: l2i
    //   1401: ldc_w 1740527398
    //   1404: ixor
    //   1405: ixor
    //   1406: tableswitch default -> 1378, -844202204 -> 1428, -844202203 -> 3172
    //   1428: getstatic Perryc.c : I
    //   1431: iflt -> 1445
    //   1434: ldc2_w 12464583
    //   1437: l2i
    //   1438: ldc_w 48330403
    //   1441: ixor
    //   1442: goto -> 1453
    //   1445: ldc2_w -1321058683
    //   1448: l2i
    //   1449: ldc_w 1030321236
    //   1452: ixor
    //   1453: ldc2_w -1102056788
    //   1456: l2i
    //   1457: ldc_w 1613214575
    //   1460: ixor
    //   1461: ixor
    //   1462: lookupswitch default -> 1488, -1068194354 -> 1445, -600373593 -> 3319
    //   1488: iload #5
    //   1490: getstatic Perryc.0 : I
    //   1493: ifle -> 1507
    //   1496: ldc2_w 799033917
    //   1499: l2i
    //   1500: ldc_w 651695177
    //   1503: ixor
    //   1504: goto -> 1515
    //   1507: ldc2_w 414738604
    //   1510: l2i
    //   1511: ldc_w -396343854
    //   1514: ixor
    //   1515: ldc2_w -2131334790
    //   1518: l2i
    //   1519: ldc_w 350570168
    //   1522: ixor
    //   1523: ixor
    //   1524: lookupswitch default -> 1552, -2089269483 -> 1507, -1653902922 -> 3289
    //   1552: iload #7
    //   1554: isub
    //   1555: getstatic Perryc.1 : I
    //   1558: ifeq -> 1572
    //   1561: ldc2_w -1689129221
    //   1564: l2i
    //   1565: ldc_w 1935430833
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w -172588131
    //   1575: l2i
    //   1576: ldc_w -1325841927
    //   1579: ixor
    //   1580: ldc2_w -366806224
    //   1583: l2i
    //   1584: ldc_w 762531150
    //   1587: ixor
    //   1588: ixor
    //   1589: lookupswitch default -> 3297, -2111933414 -> 1616, 794561588 -> 1572
    //   1616: iload #5
    //   1618: getstatic Perryc.0 : I
    //   1621: ifle -> 1635
    //   1624: ldc2_w -1094517007
    //   1627: l2i
    //   1628: ldc_w 1053219065
    //   1631: ixor
    //   1632: goto -> 1643
    //   1635: ldc2_w 858480424
    //   1638: l2i
    //   1639: ldc_w -1567765030
    //   1642: ixor
    //   1643: ldc2_w 963673511
    //   1646: l2i
    //   1647: ldc_w 1451281213
    //   1650: ixor
    //   1651: ixor
    //   1652: lookupswitch default -> 1680, -269184878 -> 3295, 1754033268 -> 1635
    //   1680: iload #7
    //   1682: isub
    //   1683: imul
    //   1684: getstatic Perryc.1 : I
    //   1687: ifeq -> 1701
    //   1690: ldc2_w -2056700106
    //   1693: l2i
    //   1694: ldc_w -454800843
    //   1697: ixor
    //   1698: goto -> 1709
    //   1701: ldc2_w 1852461402
    //   1704: l2i
    //   1705: ldc_w 733304799
    //   1708: ixor
    //   1709: ldc2_w -1968543203
    //   1712: l2i
    //   1713: ldc_w 1133351394
    //   1716: ixor
    //   1717: ixor
    //   1718: lookupswitch default -> 1744, -1465217284 -> 3281, 1844054521 -> 1701
    //   1744: iload #6
    //   1746: getstatic Perryc.c : I
    //   1749: iflt -> 1763
    //   1752: ldc2_w -482686171
    //   1755: l2i
    //   1756: ldc_w -1932680430
    //   1759: ixor
    //   1760: goto -> 1771
    //   1763: ldc2_w 944577335
    //   1766: l2i
    //   1767: ldc_w -272794557
    //   1770: ixor
    //   1771: ldc2_w 1225673249
    //   1774: l2i
    //   1775: ldc_w 1066762745
    //   1778: ixor
    //   1779: ixor
    //   1780: lookupswitch default -> 3257, -1586778964 -> 1808, 426550255 -> 1763
    //   1808: iload #8
    //   1810: isub
    //   1811: getstatic Perryc.0 : I
    //   1814: ifle -> 1828
    //   1817: ldc2_w 1167544671
    //   1820: l2i
    //   1821: ldc_w 2083916905
    //   1824: ixor
    //   1825: goto -> 1836
    //   1828: ldc2_w 1291832237
    //   1831: l2i
    //   1832: ldc_w 512399086
    //   1835: ixor
    //   1836: ldc2_w -1346140287
    //   1839: l2i
    //   1840: ldc_w 2014030888
    //   1843: ixor
    //   1844: ixor
    //   1845: lookupswitch default -> 1872, -876602410 -> 1828, -295078241 -> 3261
    //   1872: iload #6
    //   1874: getstatic Perryc.0 : I
    //   1877: ifle -> 1891
    //   1880: ldc2_w -1199230852
    //   1883: l2i
    //   1884: ldc_w -1641169619
    //   1887: ixor
    //   1888: goto -> 1899
    //   1891: ldc2_w -1598632937
    //   1894: l2i
    //   1895: ldc_w -1295532308
    //   1898: ixor
    //   1899: ldc2_w -162934902
    //   1902: l2i
    //   1903: ldc_w 692137346
    //   1906: ixor
    //   1907: ixor
    //   1908: lookupswitch default -> 1936, -1618699678 -> 1891, -106926247 -> 3255
    //   1936: iload #8
    //   1938: isub
    //   1939: imul
    //   1940: iadd
    //   1941: i2d
    //   1942: getstatic Perryc.0 : I
    //   1945: ifle -> 1959
    //   1948: ldc2_w 28289259
    //   1951: l2i
    //   1952: ldc_w 345169279
    //   1955: ixor
    //   1956: goto -> 1967
    //   1959: ldc2_w -1814206080
    //   1962: l2i
    //   1963: ldc_w -199182266
    //   1966: ixor
    //   1967: ldc2_w -1102642136
    //   1970: l2i
    //   1971: ldc_w 584532005
    //   1974: ixor
    //   1975: ixor
    //   1976: lookupswitch default -> 2004, -1985138279 -> 3283, 2136419369 -> 1959
    //   2004: dstore #9
    //   2006: getstatic Perryc.0 : I
    //   2009: ifle -> 2023
    //   2012: ldc2_w -1443754372
    //   2015: l2i
    //   2016: ldc_w 733919949
    //   2019: ixor
    //   2020: goto -> 2031
    //   2023: ldc2_w -1875035848
    //   2026: l2i
    //   2027: ldc_w 1657268769
    //   2030: ixor
    //   2031: ldc2_w 1129850352
    //   2034: l2i
    //   2035: ldc_w 476273012
    //   2038: ixor
    //   2039: ixor
    //   2040: lookupswitch default -> 3271, -1379815523 -> 2068, -579352523 -> 2023
    //   2068: dload #9
    //   2070: getstatic Perryc.c : I
    //   2073: iflt -> 2087
    //   2076: ldc2_w 1602553580
    //   2079: l2i
    //   2080: ldc_w -1052683088
    //   2083: ixor
    //   2084: goto -> 2095
    //   2087: ldc2_w 1755160076
    //   2090: l2i
    //   2091: ldc_w -533261689
    //   2094: ixor
    //   2095: ldc2_w -1011867738
    //   2098: l2i
    //   2099: ldc_w -1858714915
    //   2102: ixor
    //   2103: ixor
    //   2104: lookupswitch default -> 3323, -868085977 -> 2087, -634596880 -> 2132
    //   2132: fload_2
    //   2133: getstatic Perryc.1 : I
    //   2136: ifeq -> 2150
    //   2139: ldc2_w 650225173
    //   2142: l2i
    //   2143: ldc_w -1392869300
    //   2146: ixor
    //   2147: goto -> 2158
    //   2150: ldc2_w -709077889
    //   2153: l2i
    //   2154: ldc_w -1339644494
    //   2157: ixor
    //   2158: ldc2_w 478128507
    //   2161: l2i
    //   2162: ldc_w 1612151987
    //   2165: ixor
    //   2166: ixor
    //   2167: lookupswitch default -> 3311, -162270319 -> 2150, 435299333 -> 2192
    //   2192: fload_2
    //   2193: fmul
    //   2194: f2d
    //   2195: dcmpg
    //   2196: ifge -> 2210
    //   2199: ldc2_w -792846685
    //   2202: l2i
    //   2203: ldc_w 358824458
    //   2206: ixor
    //   2207: goto -> 2218
    //   2210: ldc2_w 1358445946
    //   2213: l2i
    //   2214: ldc_w -1792730672
    //   2217: ixor
    //   2218: ldc2_w -1745438039
    //   2221: l2i
    //   2222: ldc_w -238642227
    //   2225: ixor
    //   2226: ixor
    //   2227: tableswitch default -> 2199, -1544747571 -> 2248, -1544747570 -> 3166
    //   2248: getstatic Perryc.1 : I
    //   2251: ifeq -> 2265
    //   2254: ldc2_w 1775779186
    //   2257: l2i
    //   2258: ldc_w 87301168
    //   2261: ixor
    //   2262: goto -> 2273
    //   2265: ldc2_w -256765274
    //   2268: l2i
    //   2269: ldc_w -260941733
    //   2272: ixor
    //   2273: ldc2_w 755820545
    //   2276: l2i
    //   2277: ldc_w -1928550315
    //   2280: ixor
    //   2281: ixor
    //   2282: lookupswitch default -> 2308, -856923882 -> 3275, 2048524771 -> 2265
    //   2308: iload_3
    //   2309: ifeq -> 2323
    //   2312: ldc2_w 1315252053
    //   2315: l2i
    //   2316: ldc_w -1053108677
    //   2319: ixor
    //   2320: goto -> 2331
    //   2323: ldc2_w 1980734394
    //   2326: l2i
    //   2327: ldc_w -112170277
    //   2330: ixor
    //   2331: ldc2_w -1919083410
    //   2334: l2i
    //   2335: ldc_w -1003214841
    //   2338: ixor
    //   2339: ixor
    //   2340: tableswitch default -> 2312, -956906233 -> 2364, -956906232 -> 2636
    //   2364: getstatic Perryc.1 : I
    //   2367: ifeq -> 2381
    //   2370: ldc2_w -182511333
    //   2373: l2i
    //   2374: ldc_w 1027995835
    //   2377: ixor
    //   2378: goto -> 2389
    //   2381: ldc2_w 1814224100
    //   2384: l2i
    //   2385: ldc_w -1506396995
    //   2388: ixor
    //   2389: ldc2_w -1911658474
    //   2392: l2i
    //   2393: ldc_w -1491749244
    //   2396: ixor
    //   2397: ixor
    //   2398: lookupswitch default -> 2424, -1837073881 -> 2381, -515817678 -> 3291
    //   2424: dload #9
    //   2426: getstatic Perryc.0 : I
    //   2429: ifle -> 2443
    //   2432: ldc2_w -1134945754
    //   2435: l2i
    //   2436: ldc_w 1186677273
    //   2439: ixor
    //   2440: goto -> 2451
    //   2443: ldc2_w 878120173
    //   2446: l2i
    //   2447: ldc_w -937636078
    //   2450: ixor
    //   2451: ldc2_w 1752915121
    //   2454: l2i
    //   2455: ldc_w -1951418901
    //   2458: ixor
    //   2459: ixor
    //   2460: lookupswitch default -> 2488, 422949221 -> 3321, 1871431609 -> 2443
    //   2488: fload_2
    //   2489: ldc_w 6.1752243
    //   2492: invokestatic floatToIntBits : (F)I
    //   2495: ldc_w 2135268208
    //   2498: ixor
    //   2499: invokestatic intBitsToFloat : (I)F
    //   2502: fsub
    //   2503: getstatic Perryc.0 : I
    //   2506: ifle -> 2520
    //   2509: ldc2_w -1562642768
    //   2512: l2i
    //   2513: ldc_w -92734364
    //   2516: ixor
    //   2517: goto -> 2528
    //   2520: ldc2_w 637302630
    //   2523: l2i
    //   2524: ldc_w 708930547
    //   2527: ixor
    //   2528: ldc2_w -1332282559
    //   2531: l2i
    //   2532: ldc_w 1959361549
    //   2535: ixor
    //   2536: ixor
    //   2537: lookupswitch default -> 3325, -1661170280 -> 2520, -874341415 -> 2564
    //   2564: fload_2
    //   2565: ldc_w 5.7164545
    //   2568: invokestatic floatToIntBits : (F)I
    //   2571: ldc_w 2134306098
    //   2574: ixor
    //   2575: invokestatic intBitsToFloat : (I)F
    //   2578: fsub
    //   2579: fmul
    //   2580: f2d
    //   2581: dcmpl
    //   2582: iflt -> 2596
    //   2585: ldc2_w -1253656897
    //   2588: l2i
    //   2589: ldc_w 167291686
    //   2592: ixor
    //   2593: goto -> 2604
    //   2596: ldc2_w 838005684
    //   2599: l2i
    //   2600: ldc_w -1924338130
    //   2603: ixor
    //   2604: ldc2_w -763641001
    //   2607: l2i
    //   2608: ldc_w 1725476591
    //   2611: ixor
    //   2612: ixor
    //   2613: tableswitch default -> 2585, 136146977 -> 2636, 136146978 -> 3166
    //   2636: new net/minecraft/util/math/BlockPos
    //   2639: dup
    //   2640: getstatic Perryc.1 : I
    //   2643: ifeq -> 2657
    //   2646: ldc2_w -1975690271
    //   2649: l2i
    //   2650: ldc_w -1858337076
    //   2653: ixor
    //   2654: goto -> 2665
    //   2657: ldc2_w -606920050
    //   2660: l2i
    //   2661: ldc_w -1740337975
    //   2664: ixor
    //   2665: ldc2_w -1378669101
    //   2668: l2i
    //   2669: ldc_w 1687512566
    //   2672: ixor
    //   2673: ixor
    //   2674: lookupswitch default -> 2700, -767093496 -> 3293, 990339991 -> 2657
    //   2700: iload #7
    //   2702: getstatic Perryc.1 : I
    //   2705: ifeq -> 2719
    //   2708: ldc2_w 338277570
    //   2711: l2i
    //   2712: ldc_w -1352910107
    //   2715: ixor
    //   2716: goto -> 2727
    //   2719: ldc2_w 1986538559
    //   2722: l2i
    //   2723: ldc_w 1938496604
    //   2726: ixor
    //   2727: ldc2_w 269586982
    //   2730: l2i
    //   2731: ldc_w -1137952085
    //   2734: ixor
    //   2735: ixor
    //   2736: lookupswitch default -> 3247, -1445029650 -> 2764, 390604458 -> 2719
    //   2764: iload_1
    //   2765: getstatic Perryc.1 : I
    //   2768: ifeq -> 2782
    //   2771: ldc2_w -1044389541
    //   2774: l2i
    //   2775: ldc_w 1089970118
    //   2778: ixor
    //   2779: goto -> 2790
    //   2782: ldc2_w -1460543768
    //   2785: l2i
    //   2786: ldc_w -641421086
    //   2789: ixor
    //   2790: ldc2_w -1958520552
    //   2793: l2i
    //   2794: ldc_w 841867825
    //   2797: ixor
    //   2798: ixor
    //   2799: lookupswitch default -> 2824, -26184833 -> 2782, 942065076 -> 3329
    //   2824: iload #8
    //   2826: getstatic Perryc.1 : I
    //   2829: ifeq -> 2843
    //   2832: ldc2_w -1009696495
    //   2835: l2i
    //   2836: ldc_w 1755998909
    //   2839: ixor
    //   2840: goto -> 2851
    //   2843: ldc2_w -1984492792
    //   2846: l2i
    //   2847: ldc_w 1906458129
    //   2850: ixor
    //   2851: ldc2_w 102227532
    //   2854: l2i
    //   2855: ldc_w 1167541048
    //   2858: ixor
    //   2859: ixor
    //   2860: lookupswitch default -> 3299, -1147819923 -> 2888, -386156840 -> 2843
    //   2888: goto -> 2892
    //   2891: athrow
    //   2892: invokespecial <init> : (III)V
    //   2895: goto -> 2899
    //   2898: athrow
    //   2899: getstatic Perryc.1 : I
    //   2902: ifeq -> 2916
    //   2905: ldc2_w -1882469170
    //   2908: l2i
    //   2909: ldc_w -1865658985
    //   2912: ixor
    //   2913: goto -> 2924
    //   2916: ldc2_w 126920862
    //   2919: l2i
    //   2920: ldc_w 539345574
    //   2923: ixor
    //   2924: ldc2_w -421694937
    //   2927: l2i
    //   2928: ldc_w 1529359301
    //   2931: ixor
    //   2932: ixor
    //   2933: lookupswitch default -> 2960, -1561143109 -> 3279, 868130073 -> 2916
    //   2960: astore #11
    //   2962: getstatic Perryc.c : I
    //   2965: iflt -> 2979
    //   2968: ldc2_w 667797245
    //   2971: l2i
    //   2972: ldc_w 741541606
    //   2975: ixor
    //   2976: goto -> 2987
    //   2979: ldc2_w -685394599
    //   2982: l2i
    //   2983: ldc_w 1882508406
    //   2986: ixor
    //   2987: ldc2_w -1209883834
    //   2990: l2i
    //   2991: ldc_w 1844120948
    //   2994: ixor
    //   2995: ixor
    //   2996: lookupswitch default -> 3024, -772313559 -> 3315, 1595196411 -> 2979
    //   3024: aload #4
    //   3026: getstatic Perryc.0 : I
    //   3029: ifle -> 3043
    //   3032: ldc2_w 1175428813
    //   3035: l2i
    //   3036: ldc_w -1226229345
    //   3039: ixor
    //   3040: goto -> 3051
    //   3043: ldc2_w -1437847939
    //   3046: l2i
    //   3047: ldc_w 2029822423
    //   3050: ixor
    //   3051: ldc2_w -955787239
    //   3054: l2i
    //   3055: ldc_w -2004125909
    //   3058: ixor
    //   3059: ixor
    //   3060: lookupswitch default -> 3088, -1314898343 -> 3043, -1083570080 -> 3287
    //   3088: aload #11
    //   3090: getstatic Perryc.c : I
    //   3093: iflt -> 3107
    //   3096: ldc2_w 729126260
    //   3099: l2i
    //   3100: ldc_w -1782476914
    //   3103: ixor
    //   3104: goto -> 3115
    //   3107: ldc2_w 180069478
    //   3110: l2i
    //   3111: ldc_w -1554152343
    //   3114: ixor
    //   3115: ldc2_w -248669067
    //   3118: l2i
    //   3119: ldc_w -1256021970
    //   3122: ixor
    //   3123: ixor
    //   3124: lookupswitch default -> 3263, -303489964 -> 3152, -88398175 -> 3107
    //   3152: goto -> 3156
    //   3155: athrow
    //   3156: invokeinterface add : (Ljava/lang/Object;)Z
    //   3161: goto -> 3165
    //   3164: athrow
    //   3165: pop
    //   3166: iinc #8, 1
    //   3169: goto -> 1182
    //   3172: iinc #7, 1
    //   3175: goto -> 746
    //   3178: getstatic Perryc.0 : I
    //   3181: ifle -> 3195
    //   3184: ldc2_w -1300061611
    //   3187: l2i
    //   3188: ldc_w 382333429
    //   3191: ixor
    //   3192: goto -> 3203
    //   3195: ldc2_w 1440643969
    //   3198: l2i
    //   3199: ldc_w 614880780
    //   3202: ixor
    //   3203: ldc2_w -1898508758
    //   3206: l2i
    //   3207: ldc_w 839020435
    //   3210: ixor
    //   3211: ixor
    //   3212: lookupswitch default -> 3240, 413020697 -> 3245, 473337935 -> 3195
    //   3240: aload #4
    //   3242: areturn
    //   3243: aconst_null
    //   3244: athrow
    //   3245: aconst_null
    //   3246: athrow
    //   3247: aconst_null
    //   3248: athrow
    //   3249: aconst_null
    //   3250: athrow
    //   3251: aconst_null
    //   3252: athrow
    //   3253: aconst_null
    //   3254: athrow
    //   3255: aconst_null
    //   3256: athrow
    //   3257: aconst_null
    //   3258: athrow
    //   3259: aconst_null
    //   3260: athrow
    //   3261: aconst_null
    //   3262: athrow
    //   3263: aconst_null
    //   3264: athrow
    //   3265: aconst_null
    //   3266: athrow
    //   3267: aconst_null
    //   3268: athrow
    //   3269: aconst_null
    //   3270: athrow
    //   3271: aconst_null
    //   3272: athrow
    //   3273: aconst_null
    //   3274: athrow
    //   3275: aconst_null
    //   3276: athrow
    //   3277: aconst_null
    //   3278: athrow
    //   3279: aconst_null
    //   3280: athrow
    //   3281: aconst_null
    //   3282: athrow
    //   3283: aconst_null
    //   3284: athrow
    //   3285: aconst_null
    //   3286: athrow
    //   3287: aconst_null
    //   3288: athrow
    //   3289: aconst_null
    //   3290: athrow
    //   3291: aconst_null
    //   3292: athrow
    //   3293: aconst_null
    //   3294: athrow
    //   3295: aconst_null
    //   3296: athrow
    //   3297: aconst_null
    //   3298: athrow
    //   3299: aconst_null
    //   3300: athrow
    //   3301: aconst_null
    //   3302: athrow
    //   3303: aconst_null
    //   3304: athrow
    //   3305: aconst_null
    //   3306: athrow
    //   3307: aconst_null
    //   3308: athrow
    //   3309: aconst_null
    //   3310: athrow
    //   3311: aconst_null
    //   3312: athrow
    //   3313: aconst_null
    //   3314: athrow
    //   3315: aconst_null
    //   3316: athrow
    //   3317: aconst_null
    //   3318: athrow
    //   3319: aconst_null
    //   3320: athrow
    //   3321: aconst_null
    //   3322: athrow
    //   3323: aconst_null
    //   3324: athrow
    //   3325: aconst_null
    //   3326: athrow
    //   3327: aconst_null
    //   3328: athrow
    //   3329: aconst_null
    //   3330: athrow
    //   3331: aconst_null
    //   3332: athrow
    //   3333: pop
    //   3334: goto -> 24
    //   3337: pop
    //   3338: aconst_null
    //   3339: goto -> 3333
    //   3342: dup
    //   3343: ifnull -> 3333
    //   3346: checkcast java/lang/Throwable
    //   3349: athrow
    //   3350: dup
    //   3351: ifnull -> 3337
    //   3354: checkcast java/lang/Throwable
    //   3357: athrow
    //   3358: aconst_null
    //   3359: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2962	204	11	l	Lnet/minecraft/util/math/BlockPos;
    //   2006	1160	9	dist	D
    //   1182	1990	8	z	I
    //   746	2432	7	x	I
    //   24	3219	0	loc	Lnet/minecraft/util/math/BlockPos;
    //   24	3219	1	y	I
    //   24	3219	2	r	F
    //   24	3219	3	hollow	Z
    //   162	3081	4	circleblocks	Ljava/util/List;
    //   358	2885	5	cx	I
    //   554	2689	6	cz	I
    // Local variable type table:
    //   start	length	slot	name	signature
    //   162	3081	4	circleblocks	Ljava/util/List<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	3342	finally
    //   91	98	98	finally
    //   91	98	91	java/lang/NullPointerException
    //   91	98	91	java/lang/StringIndexOutOfBoundsException
    //   91	98	98	java/util/ConcurrentModificationException
    //   92	98	91	finally
    //   287	294	294	finally
    //   287	294	287	java/lang/AssertionError
    //   287	294	287	finally
    //   287	294	3	java/lang/IllegalArgumentException
    //   288	294	287	finally
    //   483	490	490	finally
    //   483	490	490	java/lang/RuntimeException
    //   483	490	483	finally
    //   483	490	490	java/lang/EnumConstantNotPresentException
    //   484	490	490	finally
    //   2891	2898	2898	finally
    //   2891	2898	3	java/lang/AssertionError
    //   2891	2898	2898	finally
    //   2891	2898	3	finally
    //   2892	2898	2891	finally
    //   3155	3164	3164	finally
    //   3155	3164	3	java/util/NoSuchElementException
    //   3155	3164	3	finally
    //   3156	3164	3155	java/lang/ClassCastException
    //   3156	3164	3155	java/lang/IndexOutOfBoundsException
    //   3342	3350	3342	java/lang/UnsupportedOperationException
    //   3358	3360	3	finally
  }
  
  public WurstplusThreeBlockUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -2040996492
    //   9: l2i
    //   10: ldc_w 170350134
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -618065895
    //   20: l2i
    //   21: ldc_w -682296958
    //   24: ixor
    //   25: ldc2_w -962750488
    //   28: l2i
    //   29: ldc_w -1439333074
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -522741372 -> 126, 2140954766 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -332284506
    //   70: l2i
    //   71: ldc_w 1435032347
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1815168440
    //   81: l2i
    //   82: ldc_w 349241148
    //   85: ixor
    //   86: ldc2_w 1471271994
    //   89: l2i
    //   90: ldc_w 1060779230
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1968215933 -> 78, -785217959 -> 124
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil;
  }
  
  public static boolean intersectsWithEntity(BlockPos pos) {
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
  
  public static boolean isBlockEmpty(BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2043
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2035
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2027
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1828711544
    //   33: l2i
    //   34: ldc_w -26977149
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 401618111
    //   44: l2i
    //   45: ldc_w -1258520041
    //   48: ixor
    //   49: ldc2_w -1594114561
    //   52: l2i
    //   53: ldc_w -1127398185
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2008, -1901245997 -> 41, -1086697600 -> 84
    //   84: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.emptyBlocks : Ljava/util/List;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 104
    //   93: ldc2_w -1131265889
    //   96: l2i
    //   97: ldc_w 935128496
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w -1240581905
    //   107: l2i
    //   108: ldc_w -1780219686
    //   111: ixor
    //   112: ldc2_w -1310192580
    //   115: l2i
    //   116: ldc_w -674229058
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 1996, -317278803 -> 104, 1171398839 -> 148
    //   148: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w 1474956055
    //   160: l2i
    //   161: ldc_w 2081803809
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -441404158
    //   171: l2i
    //   172: ldc_w 1519244185
    //   175: ixor
    //   176: ldc2_w 2054397609
    //   179: l2i
    //   180: ldc_w 130891479
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 2004, -1031551259 -> 212, 1447126344 -> 168
    //   212: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w -388939095
    //   224: l2i
    //   225: ldc_w 1250284263
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 1059493772
    //   235: l2i
    //   236: ldc_w 1865189519
    //   239: ixor
    //   240: ldc2_w 1905762913
    //   243: l2i
    //   244: ldc_w -1773440424
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -1379497705 -> 232, 1166557303 -> 2010
    //   276: aload_0
    //   277: getstatic Perryc.1 : I
    //   280: ifeq -> 294
    //   283: ldc2_w -378435390
    //   286: l2i
    //   287: ldc_w -1030128792
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w 1969200036
    //   297: l2i
    //   298: ldc_w 1878497405
    //   301: ixor
    //   302: ldc2_w 964652803
    //   305: l2i
    //   306: ldc_w -1565240247
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 336, -1339832096 -> 1990, 144584364 -> 294
    //   336: goto -> 340
    //   339: athrow
    //   340: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   343: goto -> 347
    //   346: athrow
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 705740907
    //   356: l2i
    //   357: ldc_w -577592794
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1359793312
    //   367: l2i
    //   368: ldc_w 340744088
    //   371: ixor
    //   372: ldc2_w 1768865668
    //   375: l2i
    //   376: ldc_w 638844488
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1191238783 -> 2002, 436029317 -> 364
    //   408: goto -> 412
    //   411: athrow
    //   412: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   417: goto -> 421
    //   420: athrow
    //   421: getstatic Perryc.c : I
    //   424: iflt -> 438
    //   427: ldc2_w 1328377579
    //   430: l2i
    //   431: ldc_w -2119279773
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w -166118773
    //   441: l2i
    //   442: ldc_w 535345438
    //   445: ixor
    //   446: ldc2_w -1862775539
    //   449: l2i
    //   450: ldc_w 1890790353
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 2000, 163243337 -> 480, 784880468 -> 438
    //   480: goto -> 484
    //   483: athrow
    //   484: invokeinterface contains : (Ljava/lang/Object;)Z
    //   489: goto -> 493
    //   492: athrow
    //   493: ifeq -> 507
    //   496: ldc2_w 519214649
    //   499: l2i
    //   500: ldc_w 1329600936
    //   503: ixor
    //   504: goto -> 515
    //   507: ldc2_w 753529708
    //   510: l2i
    //   511: ldc_w 2103147774
    //   514: ixor
    //   515: ldc2_w 740947270
    //   518: l2i
    //   519: ldc_w 466184574
    //   522: ixor
    //   523: ixor
    //   524: tableswitch default -> 496, 1716655017 -> 548, 1716655018 -> 1892
    //   548: new net/minecraft/util/math/AxisAlignedBB
    //   551: dup
    //   552: getstatic Perryc.0 : I
    //   555: ifle -> 569
    //   558: ldc2_w 1899244692
    //   561: l2i
    //   562: ldc_w -1663554313
    //   565: ixor
    //   566: goto -> 577
    //   569: ldc2_w 2091001868
    //   572: l2i
    //   573: ldc_w -284268126
    //   576: ixor
    //   577: ldc2_w 1663443378
    //   580: l2i
    //   581: ldc_w -473530710
    //   584: ixor
    //   585: ixor
    //   586: lookupswitch default -> 1994, 323755702 -> 612, 1829527419 -> 569
    //   612: aload_0
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w -1690293148
    //   622: l2i
    //   623: ldc_w -1456589194
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w -989418873
    //   633: l2i
    //   634: ldc_w 128278056
    //   637: ixor
    //   638: ldc2_w 1386330246
    //   641: l2i
    //   642: ldc_w -1715518069
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -110041313 -> 2014, 1886447920 -> 630
    //   672: goto -> 676
    //   675: athrow
    //   676: invokespecial <init> : (Lnet/minecraft/util/math/BlockPos;)V
    //   679: goto -> 683
    //   682: athrow
    //   683: getstatic Perryc.1 : I
    //   686: ifeq -> 700
    //   689: ldc2_w 1667471750
    //   692: l2i
    //   693: ldc_w 837696205
    //   696: ixor
    //   697: goto -> 708
    //   700: ldc2_w -1064543551
    //   703: l2i
    //   704: ldc_w -212458383
    //   707: ixor
    //   708: ldc2_w 965681460
    //   711: l2i
    //   712: ldc_w -1179182207
    //   715: ixor
    //   716: ixor
    //   717: lookupswitch default -> 744, -759850498 -> 1984, -167273770 -> 700
    //   744: astore_1
    //   745: getstatic Perryc.c : I
    //   748: iflt -> 762
    //   751: ldc2_w -501260350
    //   754: l2i
    //   755: ldc_w -1573310347
    //   758: ixor
    //   759: goto -> 770
    //   762: ldc2_w -1372362038
    //   765: l2i
    //   766: ldc_w 577914550
    //   769: ixor
    //   770: ldc2_w -971213763
    //   773: l2i
    //   774: ldc_w -1334455753
    //   777: ixor
    //   778: ixor
    //   779: lookupswitch default -> 804, -769502311 -> 762, 911198653 -> 2006
    //   804: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   807: getstatic Perryc.c : I
    //   810: iflt -> 824
    //   813: ldc2_w -1506234401
    //   816: l2i
    //   817: ldc_w 927226283
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -1881090783
    //   827: l2i
    //   828: ldc_w -1673269018
    //   831: ixor
    //   832: ldc2_w -36865336
    //   835: l2i
    //   836: ldc_w -1890470139
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 1992, -471843911 -> 824, 1631578122 -> 868
    //   868: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   871: getstatic Perryc.c : I
    //   874: iflt -> 888
    //   877: ldc2_w -119512124
    //   880: l2i
    //   881: ldc_w 2020237106
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 405566982
    //   891: l2i
    //   892: ldc_w 1291804256
    //   895: ixor
    //   896: ldc2_w -1280540850
    //   899: l2i
    //   900: ldc_w -771504348
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 932, -517634916 -> 1988, 1785992501 -> 888
    //   932: getfield field_72996_f : Ljava/util/List;
    //   935: getstatic Perryc.1 : I
    //   938: ifeq -> 952
    //   941: ldc2_w 1233597791
    //   944: l2i
    //   945: ldc_w 514463151
    //   948: ixor
    //   949: goto -> 960
    //   952: ldc2_w -1814552395
    //   955: l2i
    //   956: ldc_w 1229429238
    //   959: ixor
    //   960: ldc2_w 1119168127
    //   963: l2i
    //   964: ldc_w -119807027
    //   967: ixor
    //   968: ixor
    //   969: lookupswitch default -> 2016, -314317502 -> 952, 1626438897 -> 996
    //   996: goto -> 1000
    //   999: athrow
    //   1000: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1005: goto -> 1009
    //   1008: athrow
    //   1009: getstatic Perryc.c : I
    //   1012: iflt -> 1026
    //   1015: ldc2_w -745626961
    //   1018: l2i
    //   1019: ldc_w -2070935748
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w -266821412
    //   1029: l2i
    //   1030: ldc_w 1904688232
    //   1033: ixor
    //   1034: ldc2_w -636353622
    //   1037: l2i
    //   1038: ldc_w 1910461786
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1068, -207028832 -> 1026, -53218461 -> 1966
    //   1068: astore_2
    //   1069: getstatic Perryc.1 : I
    //   1072: ifeq -> 1086
    //   1075: ldc2_w -2041138609
    //   1078: l2i
    //   1079: ldc_w 273888904
    //   1082: ixor
    //   1083: goto -> 1094
    //   1086: ldc2_w 1857866567
    //   1089: l2i
    //   1090: ldc_w 734223880
    //   1093: ixor
    //   1094: ldc2_w -386577568
    //   1097: l2i
    //   1098: ldc_w -411761326
    //   1101: ixor
    //   1102: ixor
    //   1103: lookupswitch default -> 1128, -1719285003 -> 1998, 1339382152 -> 1086
    //   1128: aload_2
    //   1129: getstatic Perryc.c : I
    //   1132: iflt -> 1146
    //   1135: ldc2_w 1473867645
    //   1138: l2i
    //   1139: ldc_w 861682717
    //   1142: ixor
    //   1143: goto -> 1154
    //   1146: ldc2_w -1489081106
    //   1149: l2i
    //   1150: ldc_w -1053163644
    //   1153: ixor
    //   1154: ldc2_w 680531030
    //   1157: l2i
    //   1158: ldc_w -1060815426
    //   1161: ixor
    //   1162: ixor
    //   1163: lookupswitch default -> 1188, -1932494200 -> 2012, -359952872 -> 1146
    //   1188: goto -> 1192
    //   1191: athrow
    //   1192: invokeinterface hasNext : ()Z
    //   1197: goto -> 1201
    //   1200: athrow
    //   1201: ifne -> 1215
    //   1204: ldc2_w -299673321
    //   1207: l2i
    //   1208: ldc_w 1497314382
    //   1211: ixor
    //   1212: goto -> 1223
    //   1215: ldc2_w 1476068338
    //   1218: l2i
    //   1219: ldc_w -521703768
    //   1222: ixor
    //   1223: ldc2_w -462363099
    //   1226: l2i
    //   1227: ldc_w 754933485
    //   1230: ixor
    //   1231: ixor
    //   1232: tableswitch default -> 1204, 2140394897 -> 1256, 2140394898 -> 1265
    //   1256: ldc2_w 716287822
    //   1259: l2i
    //   1260: ldc_w 716287823
    //   1263: ixor
    //   1264: ireturn
    //   1265: getstatic Perryc.0 : I
    //   1268: ifle -> 1282
    //   1271: ldc2_w -1529423576
    //   1274: l2i
    //   1275: ldc_w 379483120
    //   1278: ixor
    //   1279: goto -> 1290
    //   1282: ldc2_w -1602163388
    //   1285: l2i
    //   1286: ldc_w -525437786
    //   1289: ixor
    //   1290: ldc2_w -300053202
    //   1293: l2i
    //   1294: ldc_w -901728176
    //   1297: ixor
    //   1298: ixor
    //   1299: lookupswitch default -> 1968, -1776967770 -> 1282, 1685302428 -> 1324
    //   1324: aload_2
    //   1325: getstatic Perryc.1 : I
    //   1328: ifeq -> 1342
    //   1331: ldc2_w 2101865957
    //   1334: l2i
    //   1335: ldc_w -1294685272
    //   1338: ixor
    //   1339: goto -> 1350
    //   1342: ldc2_w 542275727
    //   1345: l2i
    //   1346: ldc_w 1011172097
    //   1349: ixor
    //   1350: ldc2_w -1654079891
    //   1353: l2i
    //   1354: ldc_w 59723221
    //   1357: ixor
    //   1358: ixor
    //   1359: lookupswitch default -> 1384, 1068527364 -> 1342, 1366603253 -> 1976
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokeinterface next : ()Ljava/lang/Object;
    //   1393: goto -> 1397
    //   1396: athrow
    //   1397: checkcast net/minecraft/entity/Entity
    //   1400: getstatic Perryc.c : I
    //   1403: iflt -> 1417
    //   1406: ldc2_w 931745484
    //   1409: l2i
    //   1410: ldc_w -1702785435
    //   1413: ixor
    //   1414: goto -> 1425
    //   1417: ldc2_w -118046488
    //   1420: l2i
    //   1421: ldc_w 1981975200
    //   1424: ixor
    //   1425: ldc2_w 1680517235
    //   1428: l2i
    //   1429: ldc_w 1674605342
    //   1432: ixor
    //   1433: ixor
    //   1434: lookupswitch default -> 1460, -1426973756 -> 1972, 426363464 -> 1417
    //   1460: astore_3
    //   1461: getstatic Perryc.1 : I
    //   1464: ifeq -> 1478
    //   1467: ldc2_w 124326444
    //   1470: l2i
    //   1471: ldc_w 1055972084
    //   1474: ixor
    //   1475: goto -> 1486
    //   1478: ldc2_w 327913357
    //   1481: l2i
    //   1482: ldc_w -1987397674
    //   1485: ixor
    //   1486: ldc2_w -1485404891
    //   1489: l2i
    //   1490: ldc_w -796378172
    //   1493: ixor
    //   1494: ixor
    //   1495: lookupswitch default -> 1986, -302020934 -> 1520, 1315403321 -> 1478
    //   1520: aload_3
    //   1521: instanceof net/minecraft/entity/EntityLivingBase
    //   1524: ifeq -> 1538
    //   1527: ldc2_w -1406259628
    //   1530: l2i
    //   1531: ldc_w -236192056
    //   1534: ixor
    //   1535: goto -> 1546
    //   1538: ldc2_w 101208648
    //   1541: l2i
    //   1542: ldc_w 1540195027
    //   1545: ixor
    //   1546: ldc2_w -1166523215
    //   1549: l2i
    //   1550: ldc_w 1520929630
    //   1553: ixor
    //   1554: ixor
    //   1555: tableswitch default -> 1527, -1122361485 -> 1576, -1122361484 -> 1069
    //   1576: getstatic Perryc.0 : I
    //   1579: ifle -> 1593
    //   1582: ldc2_w 1712741500
    //   1585: l2i
    //   1586: ldc_w -642799224
    //   1589: ixor
    //   1590: goto -> 1601
    //   1593: ldc2_w -1413112715
    //   1596: l2i
    //   1597: ldc_w -1953720011
    //   1600: ixor
    //   1601: ldc2_w 302334439
    //   1604: l2i
    //   1605: ldc_w -1412366870
    //   1608: ixor
    //   1609: ixor
    //   1610: lookupswitch default -> 1636, 107760121 -> 1978, 1667173718 -> 1593
    //   1636: aload_1
    //   1637: getstatic Perryc.1 : I
    //   1640: ifeq -> 1654
    //   1643: ldc2_w -711854056
    //   1646: l2i
    //   1647: ldc_w -1130306467
    //   1650: ixor
    //   1651: goto -> 1662
    //   1654: ldc2_w 1843500628
    //   1657: l2i
    //   1658: ldc_w 1549242078
    //   1661: ixor
    //   1662: ldc2_w 95433322
    //   1665: l2i
    //   1666: ldc_w -169650123
    //   1669: ixor
    //   1670: ixor
    //   1671: lookupswitch default -> 1982, -1721600486 -> 1654, -1041927467 -> 1696
    //   1696: aload_3
    //   1697: getstatic Perryc.1 : I
    //   1700: ifeq -> 1714
    //   1703: ldc2_w 650280900
    //   1706: l2i
    //   1707: ldc_w 718532073
    //   1710: ixor
    //   1711: goto -> 1722
    //   1714: ldc2_w -818426033
    //   1717: l2i
    //   1718: ldc_w -316979336
    //   1721: ixor
    //   1722: ldc2_w 221884030
    //   1725: l2i
    //   1726: ldc_w -1912059976
    //   1729: ixor
    //   1730: ixor
    //   1731: lookupswitch default -> 1756, -1893696533 -> 1974, -909532797 -> 1714
    //   1756: goto -> 1760
    //   1759: athrow
    //   1760: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   1763: goto -> 1767
    //   1766: athrow
    //   1767: getstatic Perryc.1 : I
    //   1770: ifeq -> 1784
    //   1773: ldc2_w 460033280
    //   1776: l2i
    //   1777: ldc_w -304504625
    //   1780: ixor
    //   1781: goto -> 1792
    //   1784: ldc2_w -106353470
    //   1787: l2i
    //   1788: ldc_w -1074439107
    //   1791: ixor
    //   1792: ldc2_w 1928314049
    //   1795: l2i
    //   1796: ldc_w -306598732
    //   1799: ixor
    //   1800: ixor
    //   1801: lookupswitch default -> 1828, -698366372 -> 1784, 1776565690 -> 1980
    //   1828: goto -> 1832
    //   1831: athrow
    //   1832: invokevirtual func_72326_a : (Lnet/minecraft/util/math/AxisAlignedBB;)Z
    //   1835: goto -> 1839
    //   1838: athrow
    //   1839: ifeq -> 1853
    //   1842: ldc2_w 104505163
    //   1845: l2i
    //   1846: ldc_w -1460320956
    //   1849: ixor
    //   1850: goto -> 1861
    //   1853: ldc2_w -83912678
    //   1856: l2i
    //   1857: ldc_w 1412448788
    //   1860: ixor
    //   1861: ldc2_w 371750743
    //   1864: l2i
    //   1865: ldc_w -912674086
    //   1868: ixor
    //   1869: ixor
    //   1870: tableswitch default -> 1842, 1904091010 -> 1892, 1904091011 -> 1069
    //   1892: goto -> 1957
    //   1895: getstatic Perryc.1 : I
    //   1898: ifeq -> 1912
    //   1901: ldc2_w 148192112
    //   1904: l2i
    //   1905: ldc_w 352322180
    //   1908: ixor
    //   1909: goto -> 1920
    //   1912: ldc2_w 1173976542
    //   1915: l2i
    //   1916: ldc_w 1899467880
    //   1919: ixor
    //   1920: ldc2_w -148602105
    //   1923: l2i
    //   1924: ldc_w -1077925875
    //   1927: ixor
    //   1928: ixor
    //   1929: lookupswitch default -> 1956, 1429312254 -> 1970, 1636099957 -> 1912
    //   1956: astore_1
    //   1957: ldc2_w -1442269349
    //   1960: l2i
    //   1961: ldc_w -1442269349
    //   1964: ixor
    //   1965: ireturn
    //   1966: aconst_null
    //   1967: athrow
    //   1968: aconst_null
    //   1969: athrow
    //   1970: aconst_null
    //   1971: athrow
    //   1972: aconst_null
    //   1973: athrow
    //   1974: aconst_null
    //   1975: athrow
    //   1976: aconst_null
    //   1977: athrow
    //   1978: aconst_null
    //   1979: athrow
    //   1980: aconst_null
    //   1981: athrow
    //   1982: aconst_null
    //   1983: athrow
    //   1984: aconst_null
    //   1985: athrow
    //   1986: aconst_null
    //   1987: athrow
    //   1988: aconst_null
    //   1989: athrow
    //   1990: aconst_null
    //   1991: athrow
    //   1992: aconst_null
    //   1993: athrow
    //   1994: aconst_null
    //   1995: athrow
    //   1996: aconst_null
    //   1997: athrow
    //   1998: aconst_null
    //   1999: athrow
    //   2000: aconst_null
    //   2001: athrow
    //   2002: aconst_null
    //   2003: athrow
    //   2004: aconst_null
    //   2005: athrow
    //   2006: aconst_null
    //   2007: athrow
    //   2008: aconst_null
    //   2009: athrow
    //   2010: aconst_null
    //   2011: athrow
    //   2012: aconst_null
    //   2013: athrow
    //   2014: aconst_null
    //   2015: athrow
    //   2016: aconst_null
    //   2017: athrow
    //   2018: pop
    //   2019: goto -> 24
    //   2022: pop
    //   2023: aconst_null
    //   2024: goto -> 2018
    //   2027: dup
    //   2028: ifnull -> 2018
    //   2031: checkcast java/lang/Throwable
    //   2034: athrow
    //   2035: dup
    //   2036: ifnull -> 2022
    //   2039: checkcast java/lang/Throwable
    //   2042: athrow
    //   2043: aconst_null
    //   2044: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   745	1147	1	box	Lnet/minecraft/util/math/AxisAlignedBB;
    //   1069	823	2	entityIter	Ljava/util/Iterator;
    //   1461	431	3	e	Lnet/minecraft/entity/Entity;
    //   24	1942	0	pos	Lnet/minecraft/util/math/BlockPos;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   1069	823	2	entityIter	Ljava/util/Iterator<Lnet/minecraft/entity/Entity;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	2027	finally
    //   24	339	1895	java/lang/Exception
    //   340	346	346	finally
    //   340	346	3	finally
    //   340	346	346	finally
    //   340	346	3	finally
    //   340	346	346	finally
    //   340	1191	1895	java/lang/Exception
    //   411	420	420	finally
    //   411	420	3	java/lang/AssertionError
    //   411	420	3	java/lang/NullPointerException
    //   411	420	411	finally
    //   412	420	411	java/lang/EnumConstantNotPresentException
    //   483	492	492	finally
    //   483	492	492	java/lang/UnsupportedOperationException
    //   483	492	483	java/lang/IllegalArgumentException
    //   483	492	3	java/lang/IndexOutOfBoundsException
    //   483	492	492	finally
    //   675	682	682	finally
    //   675	682	682	finally
    //   675	682	675	java/lang/IndexOutOfBoundsException
    //   675	682	3	finally
    //   676	682	3	java/lang/ClassCastException
    //   999	1008	1008	finally
    //   999	1008	3	java/lang/AssertionError
    //   999	1008	3	finally
    //   999	1008	999	finally
    //   999	1008	1008	finally
    //   1192	1200	1200	finally
    //   1192	1200	3	finally
    //   1192	1200	3	finally
    //   1192	1200	1200	java/util/ConcurrentModificationException
    //   1192	1200	3	finally
    //   1192	1264	1895	java/lang/Exception
    //   1265	1892	1895	java/lang/Exception
    //   1387	1396	1396	finally
    //   1387	1396	3	java/lang/NumberFormatException
    //   1387	1396	1387	finally
    //   1387	1396	1387	finally
    //   1388	1396	1387	finally
    //   1759	1766	1766	finally
    //   1759	1766	3	java/lang/EnumConstantNotPresentException
    //   1760	1766	1759	finally
    //   1760	1766	3	java/lang/IllegalStateException
    //   1760	1766	3	java/lang/NegativeArraySizeException
    //   1831	1838	1838	finally
    //   1831	1838	1831	java/lang/AssertionError
    //   1831	1838	1831	java/lang/StringIndexOutOfBoundsException
    //   1832	1838	3	java/lang/ArithmeticException
    //   1832	1838	1831	finally
    //   2027	2035	2027	java/lang/NullPointerException
    //   2043	2045	3	finally
  }
  
  public static boolean isValidBlock(BlockPos paramBlockPos) {
    return Perry1.6j(null, (int)-551114659L ^ 0xBA946CCA, paramBlockPos);
  }
  
  public static void faceVector(Vec3d vec, boolean normalizeAngle) {
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
  
  public static boolean placeBlock(BlockPos pos, EnumHand hand, boolean rotate, boolean packet, boolean isSneaking) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3713
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3705
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3697
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1520477795
    //   33: l2i
    //   34: ldc_w 1183552812
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -990799296
    //   44: l2i
    //   45: ldc_w -180739240
    //   48: ixor
    //   49: ldc2_w -628360601
    //   52: l2i
    //   53: ldc_w 2134070290
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2030267901 -> 41, -1181508294 -> 3590
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 20160288
    //   94: l2i
    //   95: ldc_w 395943170
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1940717248
    //   105: l2i
    //   106: ldc_w -377687354
    //   109: ixor
    //   110: ldc2_w 1612693815
    //   113: l2i
    //   114: ldc_w 1360183680
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1332250415 -> 102, 665256597 -> 3596
    //   144: goto -> 148
    //   147: athrow
    //   148: invokestatic getFirstFacing : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/EnumFacing;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 172
    //   161: ldc2_w 1540287892
    //   164: l2i
    //   165: ldc_w -2057334048
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 1131566116
    //   175: l2i
    //   176: ldc_w -494473091
    //   179: ixor
    //   180: ldc2_w 1446287285
    //   183: l2i
    //   184: ldc_w 941675885
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 3628, -1333445204 -> 172, -807344511 -> 216
    //   216: astore #5
    //   218: getstatic Perryc.c : I
    //   221: iflt -> 235
    //   224: ldc2_w -471774955
    //   227: l2i
    //   228: ldc_w 639666532
    //   231: ixor
    //   232: goto -> 243
    //   235: ldc2_w -1544729926
    //   238: l2i
    //   239: ldc_w 1634793388
    //   242: ixor
    //   243: ldc2_w 1735210509
    //   246: l2i
    //   247: ldc_w 445935186
    //   250: ixor
    //   251: ixor
    //   252: lookupswitch default -> 3636, -1204250578 -> 235, -1083906743 -> 280
    //   280: aload #5
    //   282: ifnonnull -> 296
    //   285: ldc2_w 1140783021
    //   288: l2i
    //   289: ldc_w 1550258667
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 1974539823
    //   299: l2i
    //   300: ldc_w 1781067882
    //   303: ixor
    //   304: ldc2_w 1393788012
    //   307: l2i
    //   308: ldc_w 2108615487
    //   311: ixor
    //   312: ixor
    //   313: tableswitch default -> 285, 824477973 -> 336, 824477974 -> 399
    //   336: getstatic Perryc.c : I
    //   339: iflt -> 353
    //   342: ldc2_w -1496564517
    //   345: l2i
    //   346: ldc_w -1592601167
    //   349: ixor
    //   350: goto -> 361
    //   353: ldc2_w -268348514
    //   356: l2i
    //   357: ldc_w -1732698277
    //   360: ixor
    //   361: ldc2_w 725386032
    //   364: l2i
    //   365: ldc_w -1948698052
    //   368: ixor
    //   369: ixor
    //   370: lookupswitch default -> 3682, -1489285018 -> 353, -933366327 -> 396
    //   396: iload #4
    //   398: ireturn
    //   399: getstatic Perryc.0 : I
    //   402: ifle -> 416
    //   405: ldc2_w 603672005
    //   408: l2i
    //   409: ldc_w 1859080881
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -1719991098
    //   419: l2i
    //   420: ldc_w 959386070
    //   423: ixor
    //   424: ldc2_w 1513757950
    //   427: l2i
    //   428: ldc_w -538869724
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 460, -989989801 -> 416, -923827282 -> 3684
    //   460: aload_0
    //   461: getstatic Perryc.1 : I
    //   464: ifeq -> 478
    //   467: ldc2_w -1395063884
    //   470: l2i
    //   471: ldc_w -1562148510
    //   474: ixor
    //   475: goto -> 486
    //   478: ldc2_w -1072872240
    //   481: l2i
    //   482: ldc_w -834543472
    //   485: ixor
    //   486: ldc2_w -1920183314
    //   489: l2i
    //   490: ldc_w 691675523
    //   493: ixor
    //   494: ixor
    //   495: lookupswitch default -> 3632, -1433603909 -> 478, -1426401747 -> 520
    //   520: aload #5
    //   522: getstatic Perryc.0 : I
    //   525: ifle -> 539
    //   528: ldc2_w 1646628916
    //   531: l2i
    //   532: ldc_w -953500732
    //   535: ixor
    //   536: goto -> 547
    //   539: ldc2_w 1481905437
    //   542: l2i
    //   543: ldc_w 1143357
    //   546: ixor
    //   547: ldc2_w 854068775
    //   550: l2i
    //   551: ldc_w 1921580844
    //   554: ixor
    //   555: ixor
    //   556: lookupswitch default -> 3658, -445654277 -> 539, 405116459 -> 584
    //   584: goto -> 588
    //   587: athrow
    //   588: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   591: goto -> 595
    //   594: athrow
    //   595: getstatic Perryc.1 : I
    //   598: ifeq -> 612
    //   601: ldc2_w -1849120306
    //   604: l2i
    //   605: ldc_w -894525759
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w -1067780702
    //   615: l2i
    //   616: ldc_w 1917679535
    //   619: ixor
    //   620: ldc2_w -925868472
    //   623: l2i
    //   624: ldc_w 430412095
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 3664, -1978533768 -> 612, 1667255674 -> 656
    //   656: astore #6
    //   658: getstatic Perryc.c : I
    //   661: iflt -> 675
    //   664: ldc2_w 501820090
    //   667: l2i
    //   668: ldc_w -1202498791
    //   671: ixor
    //   672: goto -> 683
    //   675: ldc2_w -1093971524
    //   678: l2i
    //   679: ldc_w 532510167
    //   682: ixor
    //   683: ldc2_w 911368354
    //   686: l2i
    //   687: ldc_w -118808245
    //   690: ixor
    //   691: ixor
    //   692: lookupswitch default -> 720, -390101926 -> 675, 1795373130 -> 3678
    //   720: aload #5
    //   722: getstatic Perryc.1 : I
    //   725: ifeq -> 739
    //   728: ldc2_w -2132869636
    //   731: l2i
    //   732: ldc_w -1206284260
    //   735: ixor
    //   736: goto -> 747
    //   739: ldc2_w 1476083863
    //   742: l2i
    //   743: ldc_w -1941731589
    //   746: ixor
    //   747: ldc2_w -434499566
    //   750: l2i
    //   751: ldc_w 1919235159
    //   754: ixor
    //   755: ixor
    //   756: lookupswitch default -> 3592, -1397208667 -> 739, 1338499625 -> 784
    //   784: goto -> 788
    //   787: athrow
    //   788: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   791: goto -> 795
    //   794: athrow
    //   795: getstatic Perryc.1 : I
    //   798: ifeq -> 812
    //   801: ldc2_w 1174331631
    //   804: l2i
    //   805: ldc_w -578636951
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w 1414759646
    //   815: l2i
    //   816: ldc_w -2067449342
    //   819: ixor
    //   820: ldc2_w -785187147
    //   823: l2i
    //   824: ldc_w -1911764750
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 3672, -1884780389 -> 856, -951949887 -> 812
    //   856: astore #7
    //   858: new net/minecraft/util/math/Vec3d
    //   861: dup
    //   862: getstatic Perryc.1 : I
    //   865: ifeq -> 879
    //   868: ldc2_w 2146753742
    //   871: l2i
    //   872: ldc_w 2110187733
    //   875: ixor
    //   876: goto -> 887
    //   879: ldc2_w 1093184221
    //   882: l2i
    //   883: ldc_w 109702611
    //   886: ixor
    //   887: ldc2_w -581222404
    //   890: l2i
    //   891: ldc_w 367526923
    //   894: ixor
    //   895: ixor
    //   896: lookupswitch default -> 3680, -1894613767 -> 924, -897511444 -> 879
    //   924: aload #6
    //   926: getstatic Perryc.c : I
    //   929: iflt -> 943
    //   932: ldc2_w -1182327890
    //   935: l2i
    //   936: ldc_w -649077716
    //   939: ixor
    //   940: goto -> 951
    //   943: ldc2_w -346162354
    //   946: l2i
    //   947: ldc_w 403972240
    //   950: ixor
    //   951: ldc2_w -163611400
    //   954: l2i
    //   955: ldc_w -594533250
    //   958: ixor
    //   959: ixor
    //   960: lookupswitch default -> 988, -840974783 -> 943, 1248304900 -> 3604
    //   988: goto -> 992
    //   991: athrow
    //   992: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   995: goto -> 999
    //   998: athrow
    //   999: ldc2_w 3.806125663217102
    //   1002: invokestatic doubleToLongBits : (D)J
    //   1005: ldc2_w 9218431871031959231
    //   1008: lxor
    //   1009: invokestatic longBitsToDouble : (J)D
    //   1012: ldc2_w 15.400747455367457
    //   1015: invokestatic doubleToLongBits : (D)J
    //   1018: ldc2_w 9209523888780575827
    //   1021: lxor
    //   1022: invokestatic longBitsToDouble : (J)D
    //   1025: ldc2_w 2.9931942461147765
    //   1028: invokestatic doubleToLongBits : (D)J
    //   1031: ldc2_w 9216601312218389330
    //   1034: lxor
    //   1035: invokestatic longBitsToDouble : (J)D
    //   1038: getstatic Perryc.0 : I
    //   1041: ifle -> 1055
    //   1044: ldc2_w 1226304781
    //   1047: l2i
    //   1048: ldc_w 1369012674
    //   1051: ixor
    //   1052: goto -> 1063
    //   1055: ldc2_w 1231782132
    //   1058: l2i
    //   1059: ldc_w 1436599274
    //   1062: ixor
    //   1063: ldc2_w 234465724
    //   1066: l2i
    //   1067: ldc_w -2006946614
    //   1070: ixor
    //   1071: ixor
    //   1072: lookupswitch default -> 1100, -1659416135 -> 3634, 1920394231 -> 1055
    //   1100: goto -> 1104
    //   1103: athrow
    //   1104: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/math/Vec3d;
    //   1107: goto -> 1111
    //   1110: athrow
    //   1111: new net/minecraft/util/math/Vec3d
    //   1114: dup
    //   1115: getstatic Perryc.c : I
    //   1118: iflt -> 1132
    //   1121: ldc2_w -811829344
    //   1124: l2i
    //   1125: ldc_w -559684425
    //   1128: ixor
    //   1129: goto -> 1140
    //   1132: ldc2_w -1704456784
    //   1135: l2i
    //   1136: ldc_w -1605045615
    //   1139: ixor
    //   1140: ldc2_w -839719176
    //   1143: l2i
    //   1144: ldc_w 1344664833
    //   1147: ixor
    //   1148: ixor
    //   1149: lookupswitch default -> 1176, -1930919698 -> 3648, -574746402 -> 1132
    //   1176: aload #7
    //   1178: getstatic Perryc.c : I
    //   1181: iflt -> 1195
    //   1184: ldc2_w -1474521485
    //   1187: l2i
    //   1188: ldc_w 182290014
    //   1191: ixor
    //   1192: goto -> 1203
    //   1195: ldc2_w 134798599
    //   1198: l2i
    //   1199: ldc_w 1370296442
    //   1202: ixor
    //   1203: ldc2_w 1486756361
    //   1206: l2i
    //   1207: ldc_w 1285322244
    //   1210: ixor
    //   1211: ixor
    //   1212: lookupswitch default -> 3642, -1228702688 -> 1195, 1302831472 -> 1240
    //   1240: goto -> 1244
    //   1243: athrow
    //   1244: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   1247: goto -> 1251
    //   1250: athrow
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w -933469064
    //   1260: l2i
    //   1261: ldc_w -366799867
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 421040340
    //   1271: l2i
    //   1272: ldc_w -111646919
    //   1275: ixor
    //   1276: ldc2_w -1267416734
    //   1279: l2i
    //   1280: ldc_w 583524348
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 3644, -1261670685 -> 1268, 1995696499 -> 1312
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   1319: goto -> 1323
    //   1322: athrow
    //   1323: ldc2_w 2.4707824975976096
    //   1326: invokestatic doubleToLongBits : (D)J
    //   1329: ldc2_w 9215424945540411389
    //   1332: lxor
    //   1333: invokestatic longBitsToDouble : (J)D
    //   1336: getstatic Perryc.c : I
    //   1339: iflt -> 1353
    //   1342: ldc2_w -84323935
    //   1345: l2i
    //   1346: ldc_w 473846805
    //   1349: ixor
    //   1350: goto -> 1361
    //   1353: ldc2_w -1560902093
    //   1356: l2i
    //   1357: ldc_w -1547948170
    //   1360: ixor
    //   1361: ldc2_w 433510236
    //   1364: l2i
    //   1365: ldc_w 481073570
    //   1368: ixor
    //   1369: ixor
    //   1370: lookupswitch default -> 1396, -2107388781 -> 1353, -474133686 -> 3650
    //   1396: goto -> 1400
    //   1399: athrow
    //   1400: invokevirtual func_186678_a : (D)Lnet/minecraft/util/math/Vec3d;
    //   1403: goto -> 1407
    //   1406: athrow
    //   1407: getstatic Perryc.c : I
    //   1410: iflt -> 1424
    //   1413: ldc2_w 799396960
    //   1416: l2i
    //   1417: ldc_w 1336509735
    //   1420: ixor
    //   1421: goto -> 1432
    //   1424: ldc2_w 977079008
    //   1427: l2i
    //   1428: ldc_w -694443314
    //   1431: ixor
    //   1432: ldc2_w -1085614670
    //   1435: l2i
    //   1436: ldc_w -1798797336
    //   1439: ixor
    //   1440: ixor
    //   1441: lookupswitch default -> 1468, 1267598109 -> 3606, 1995082631 -> 1424
    //   1468: goto -> 1472
    //   1471: athrow
    //   1472: invokevirtual func_178787_e : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   1475: goto -> 1479
    //   1478: athrow
    //   1479: getstatic Perryc.0 : I
    //   1482: ifle -> 1496
    //   1485: ldc2_w 624571370
    //   1488: l2i
    //   1489: ldc_w -604283839
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w -1861961495
    //   1499: l2i
    //   1500: ldc_w 2127789392
    //   1503: ixor
    //   1504: ldc2_w -1841331053
    //   1507: l2i
    //   1508: ldc_w 2079095273
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 1540, -2024488347 -> 1496, 387093201 -> 3608
    //   1540: astore #8
    //   1542: getstatic Perryc.0 : I
    //   1545: ifle -> 1559
    //   1548: ldc2_w -488615467
    //   1551: l2i
    //   1552: ldc_w -539797737
    //   1555: ixor
    //   1556: goto -> 1567
    //   1559: ldc2_w 2101565213
    //   1562: l2i
    //   1563: ldc_w 1370908719
    //   1566: ixor
    //   1567: ldc2_w -1880140083
    //   1570: l2i
    //   1571: ldc_w -2140004493
    //   1574: ixor
    //   1575: ixor
    //   1576: lookupswitch default -> 3654, 594048652 -> 1604, 850284412 -> 1559
    //   1604: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1607: getstatic Perryc.c : I
    //   1610: iflt -> 1624
    //   1613: ldc2_w -503611145
    //   1616: l2i
    //   1617: ldc_w -1578794404
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w 13657307
    //   1627: l2i
    //   1628: ldc_w -1703470452
    //   1631: ixor
    //   1632: ldc2_w 1997826280
    //   1635: l2i
    //   1636: ldc_w -931235283
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 1668, -9170834 -> 3652, 1527853280 -> 1624
    //   1668: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1671: getstatic Perryc.c : I
    //   1674: iflt -> 1688
    //   1677: ldc2_w -572037177
    //   1680: l2i
    //   1681: ldc_w -1865977131
    //   1684: ixor
    //   1685: goto -> 1696
    //   1688: ldc2_w 352713750
    //   1691: l2i
    //   1692: ldc_w 1796000649
    //   1695: ixor
    //   1696: ldc2_w -931945546
    //   1699: l2i
    //   1700: ldc_w -384859478
    //   1703: ixor
    //   1704: ixor
    //   1705: lookupswitch default -> 3624, 1601508995 -> 1732, 1817981966 -> 1688
    //   1732: goto -> 1736
    //   1735: athrow
    //   1736: invokevirtual func_70093_af : ()Z
    //   1739: goto -> 1743
    //   1742: athrow
    //   1743: ifne -> 1757
    //   1746: ldc2_w -1960073014
    //   1749: l2i
    //   1750: ldc_w -1309474488
    //   1753: ixor
    //   1754: goto -> 1765
    //   1757: ldc2_w 1619116398
    //   1760: l2i
    //   1761: ldc_w 1515809007
    //   1764: ixor
    //   1765: ldc2_w -2104479445
    //   1768: l2i
    //   1769: ldc_w 767710584
    //   1772: ixor
    //   1773: ixor
    //   1774: tableswitch default -> 1746, -1786065455 -> 1796, -1786065454 -> 2535
    //   1796: getstatic Perryc.c : I
    //   1799: iflt -> 1813
    //   1802: ldc2_w -1910200810
    //   1805: l2i
    //   1806: ldc_w -1637495282
    //   1809: ixor
    //   1810: goto -> 1821
    //   1813: ldc2_w -1957265956
    //   1816: l2i
    //   1817: ldc_w -1124572784
    //   1820: ixor
    //   1821: ldc2_w 1748265840
    //   1824: l2i
    //   1825: ldc_w -668099179
    //   1828: ixor
    //   1829: ixor
    //   1830: lookupswitch default -> 3662, -2017989975 -> 1856, -1604804867 -> 1813
    //   1856: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1859: getstatic Perryc.c : I
    //   1862: iflt -> 1876
    //   1865: ldc2_w 193074947
    //   1868: l2i
    //   1869: ldc_w -1187809896
    //   1872: ixor
    //   1873: goto -> 1884
    //   1876: ldc2_w -37340068
    //   1879: l2i
    //   1880: ldc_w 4143122
    //   1883: ixor
    //   1884: ldc2_w -238491594
    //   1887: l2i
    //   1888: ldc_w -1020187449
    //   1891: ixor
    //   1892: ixor
    //   1893: lookupswitch default -> 3660, -2142722454 -> 1876, -822034241 -> 1920
    //   1920: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1923: getstatic Perryc.c : I
    //   1926: iflt -> 1940
    //   1929: ldc2_w -921158947
    //   1932: l2i
    //   1933: ldc_w 1644607652
    //   1936: ixor
    //   1937: goto -> 1948
    //   1940: ldc2_w 1591119434
    //   1943: l2i
    //   1944: ldc_w -169371781
    //   1947: ixor
    //   1948: ldc2_w 332668635
    //   1951: l2i
    //   1952: ldc_w 1312684659
    //   1955: ixor
    //   1956: ixor
    //   1957: lookupswitch default -> 3614, -153551463 -> 1984, -151558447 -> 1940
    //   1984: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   1987: new net/minecraft/network/play/client/CPacketEntityAction
    //   1990: dup
    //   1991: getstatic Perryc.0 : I
    //   1994: ifle -> 2008
    //   1997: ldc2_w 192249586
    //   2000: l2i
    //   2001: ldc_w -1553728610
    //   2004: ixor
    //   2005: goto -> 2016
    //   2008: ldc2_w 1812579172
    //   2011: l2i
    //   2012: ldc_w 2031581620
    //   2015: ixor
    //   2016: ldc2_w 412544138
    //   2019: l2i
    //   2020: ldc_w -1123069990
    //   2023: ixor
    //   2024: ixor
    //   2025: lookupswitch default -> 2052, -489705991 -> 2008, 227485244 -> 3668
    //   2052: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2055: getstatic Perryc.1 : I
    //   2058: ifeq -> 2072
    //   2061: ldc2_w 778918524
    //   2064: l2i
    //   2065: ldc_w -1373769285
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w 869445692
    //   2075: l2i
    //   2076: ldc_w -588880696
    //   2079: ixor
    //   2080: ldc2_w 801894441
    //   2083: l2i
    //   2084: ldc_w 736297208
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 3626, -2074584298 -> 2072, -350477275 -> 2116
    //   2116: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2119: getstatic Perryc.c : I
    //   2122: iflt -> 2136
    //   2125: ldc2_w 1197877605
    //   2128: l2i
    //   2129: ldc_w -1598149551
    //   2132: ixor
    //   2133: goto -> 2144
    //   2136: ldc2_w 1098462469
    //   2139: l2i
    //   2140: ldc_w -1424408166
    //   2143: ixor
    //   2144: ldc2_w 530517589
    //   2147: l2i
    //   2148: ldc_w -246609636
    //   2151: ixor
    //   2152: ixor
    //   2153: lookupswitch default -> 3622, 78803926 -> 2180, 151650941 -> 2136
    //   2180: getstatic net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING : Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
    //   2183: getstatic Perryc.1 : I
    //   2186: ifeq -> 2200
    //   2189: ldc2_w -911448782
    //   2192: l2i
    //   2193: ldc_w 60168742
    //   2196: ixor
    //   2197: goto -> 2208
    //   2200: ldc2_w -1186494501
    //   2203: l2i
    //   2204: ldc_w -1327278287
    //   2207: ixor
    //   2208: ldc2_w -1609899453
    //   2211: l2i
    //   2212: ldc_w 800675717
    //   2215: ixor
    //   2216: ixor
    //   2217: lookupswitch default -> 2244, 1166658258 -> 3612, 1866163506 -> 2200
    //   2244: goto -> 2248
    //   2247: athrow
    //   2248: invokespecial <init> : (Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
    //   2251: goto -> 2255
    //   2254: athrow
    //   2255: getstatic Perryc.0 : I
    //   2258: ifle -> 2272
    //   2261: ldc2_w -148858197
    //   2264: l2i
    //   2265: ldc_w 2101709282
    //   2268: ixor
    //   2269: goto -> 2280
    //   2272: ldc2_w -486791245
    //   2275: l2i
    //   2276: ldc_w -176016462
    //   2279: ixor
    //   2280: ldc2_w -1821441859
    //   2283: l2i
    //   2284: ldc_w 805054525
    //   2287: ixor
    //   2288: ixor
    //   2289: lookupswitch default -> 3610, -1410515839 -> 2316, 922106825 -> 2272
    //   2316: goto -> 2320
    //   2319: athrow
    //   2320: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   2323: goto -> 2327
    //   2326: athrow
    //   2327: getstatic Perryc.0 : I
    //   2330: ifle -> 2344
    //   2333: ldc2_w -1131885768
    //   2336: l2i
    //   2337: ldc_w 411234921
    //   2340: ixor
    //   2341: goto -> 2352
    //   2344: ldc2_w 491984297
    //   2347: l2i
    //   2348: ldc_w 447005801
    //   2351: ixor
    //   2352: ldc2_w 1753480205
    //   2355: l2i
    //   2356: ldc_w -269668177
    //   2359: ixor
    //   2360: ixor
    //   2361: lookupswitch default -> 2388, 593819123 -> 3600, 2142119222 -> 2344
    //   2388: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2391: getstatic Perryc.0 : I
    //   2394: ifle -> 2408
    //   2397: ldc2_w 1699914720
    //   2400: l2i
    //   2401: ldc_w 1940248567
    //   2404: ixor
    //   2405: goto -> 2416
    //   2408: ldc2_w 811016564
    //   2411: l2i
    //   2412: ldc_w 450710617
    //   2415: ixor
    //   2416: ldc2_w -163282045
    //   2419: l2i
    //   2420: ldc_w -951527537
    //   2423: ixor
    //   2424: ixor
    //   2425: lookupswitch default -> 2452, -1831922596 -> 2408, 670769179 -> 3618
    //   2452: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2455: ldc2_w 782784591
    //   2458: l2i
    //   2459: ldc_w 782784590
    //   2462: ixor
    //   2463: getstatic Perryc.c : I
    //   2466: iflt -> 2480
    //   2469: ldc2_w -275751343
    //   2472: l2i
    //   2473: ldc_w -1337604997
    //   2476: ixor
    //   2477: goto -> 2488
    //   2480: ldc2_w 823185281
    //   2483: l2i
    //   2484: ldc_w 1664115659
    //   2487: ixor
    //   2488: ldc2_w -1367577462
    //   2491: l2i
    //   2492: ldc_w -977638630
    //   2495: ixor
    //   2496: ixor
    //   2497: lookupswitch default -> 2524, -1997909177 -> 2480, 873700794 -> 3674
    //   2524: goto -> 2528
    //   2527: athrow
    //   2528: invokevirtual func_70095_a : (Z)V
    //   2531: goto -> 2535
    //   2534: athrow
    //   2535: getstatic Perryc.1 : I
    //   2538: ifeq -> 2552
    //   2541: ldc2_w -1553195695
    //   2544: l2i
    //   2545: ldc_w -1895338747
    //   2548: ixor
    //   2549: goto -> 2560
    //   2552: ldc2_w -1996284736
    //   2555: l2i
    //   2556: ldc_w 871531610
    //   2559: ixor
    //   2560: ldc2_w -55978274
    //   2563: l2i
    //   2564: ldc_w -1668716247
    //   2567: ixor
    //   2568: ixor
    //   2569: lookupswitch default -> 2596, 1280036771 -> 3616, 1801352814 -> 2552
    //   2596: iload_2
    //   2597: ifeq -> 2611
    //   2600: ldc2_w -1423743057
    //   2603: l2i
    //   2604: ldc_w -1202715486
    //   2607: ixor
    //   2608: goto -> 2619
    //   2611: ldc2_w -1201637110
    //   2614: l2i
    //   2615: ldc_w -1424811514
    //   2618: ixor
    //   2619: ldc2_w -1577499579
    //   2622: l2i
    //   2623: ldc_w -145453174
    //   2626: ixor
    //   2627: ixor
    //   2628: tableswitch default -> 2600, 1172220098 -> 2652, 1172220099 -> 2795
    //   2652: getstatic Perryc.c : I
    //   2655: iflt -> 2669
    //   2658: ldc2_w -390656868
    //   2661: l2i
    //   2662: ldc_w 506717142
    //   2665: ixor
    //   2666: goto -> 2677
    //   2669: ldc2_w 1272062910
    //   2672: l2i
    //   2673: ldc_w -1378299426
    //   2676: ixor
    //   2677: ldc2_w -363861107
    //   2680: l2i
    //   2681: ldc_w 183602399
    //   2684: ixor
    //   2685: ixor
    //   2686: lookupswitch default -> 2712, 372934680 -> 3598, 1373432819 -> 2669
    //   2712: aload #8
    //   2714: ldc2_w 1101036307
    //   2717: l2i
    //   2718: ldc_w 1101036306
    //   2721: ixor
    //   2722: getstatic Perryc.1 : I
    //   2725: ifeq -> 2739
    //   2728: ldc2_w 1542988244
    //   2731: l2i
    //   2732: ldc_w -1837426592
    //   2735: ixor
    //   2736: goto -> 2747
    //   2739: ldc2_w 1016937628
    //   2742: l2i
    //   2743: ldc_w -2115706881
    //   2746: ixor
    //   2747: ldc2_w -423208027
    //   2750: l2i
    //   2751: ldc_w -1085021518
    //   2754: ixor
    //   2755: ixor
    //   2756: lookupswitch default -> 3630, -1877573469 -> 2739, -454272396 -> 2784
    //   2784: goto -> 2788
    //   2787: athrow
    //   2788: invokestatic faceVector : (Lnet/minecraft/util/math/Vec3d;Z)V
    //   2791: goto -> 2795
    //   2794: athrow
    //   2795: getstatic Perryc.1 : I
    //   2798: ifeq -> 2812
    //   2801: ldc2_w -912949909
    //   2804: l2i
    //   2805: ldc_w -1785038110
    //   2808: ixor
    //   2809: goto -> 2820
    //   2812: ldc2_w -1846052456
    //   2815: l2i
    //   2816: ldc_w -304543091
    //   2819: ixor
    //   2820: ldc2_w -1872669937
    //   2823: l2i
    //   2824: ldc_w -1014162105
    //   2827: ixor
    //   2828: ixor
    //   2829: lookupswitch default -> 2856, -837762611 -> 2812, 266553793 -> 3670
    //   2856: aload #6
    //   2858: getstatic Perryc.0 : I
    //   2861: ifle -> 2875
    //   2864: ldc2_w -942959425
    //   2867: l2i
    //   2868: ldc_w -1833859373
    //   2871: ixor
    //   2872: goto -> 2883
    //   2875: ldc2_w -2006244276
    //   2878: l2i
    //   2879: ldc_w 668742176
    //   2882: ixor
    //   2883: ldc2_w -627492401
    //   2886: l2i
    //   2887: ldc_w 183492524
    //   2890: ixor
    //   2891: ixor
    //   2892: lookupswitch default -> 2920, -2062748657 -> 3602, -596450675 -> 2875
    //   2920: aload #8
    //   2922: getstatic Perryc.c : I
    //   2925: iflt -> 2939
    //   2928: ldc2_w -1651905541
    //   2931: l2i
    //   2932: ldc_w 1934707367
    //   2935: ixor
    //   2936: goto -> 2947
    //   2939: ldc2_w 1810284952
    //   2942: l2i
    //   2943: ldc_w 777371097
    //   2946: ixor
    //   2947: ldc2_w -536555056
    //   2950: l2i
    //   2951: ldc_w -784296737
    //   2954: ixor
    //   2955: ixor
    //   2956: lookupswitch default -> 3656, -543366061 -> 2939, 1962359118 -> 2984
    //   2984: aload_1
    //   2985: getstatic Perryc.1 : I
    //   2988: ifeq -> 3002
    //   2991: ldc2_w 1969549932
    //   2994: l2i
    //   2995: ldc_w -1166813916
    //   2998: ixor
    //   2999: goto -> 3010
    //   3002: ldc2_w -1143193812
    //   3005: l2i
    //   3006: ldc_w -2035082414
    //   3009: ixor
    //   3010: ldc2_w 1068623978
    //   3013: l2i
    //   3014: ldc_w 1035854723
    //   3017: ixor
    //   3018: ixor
    //   3019: lookupswitch default -> 3044, -1275917433 -> 3002, -853857119 -> 3638
    //   3044: aload #7
    //   3046: getstatic Perryc.c : I
    //   3049: iflt -> 3063
    //   3052: ldc2_w -50687271
    //   3055: l2i
    //   3056: ldc_w -2057421894
    //   3059: ixor
    //   3060: goto -> 3071
    //   3063: ldc2_w 1915270814
    //   3066: l2i
    //   3067: ldc_w -1389885424
    //   3070: ixor
    //   3071: ldc2_w 173434703
    //   3074: l2i
    //   3075: ldc_w 616090702
    //   3078: ixor
    //   3079: ixor
    //   3080: lookupswitch default -> 3108, 1256560945 -> 3063, 1464468066 -> 3594
    //   3108: iload_3
    //   3109: getstatic Perryc.0 : I
    //   3112: ifle -> 3126
    //   3115: ldc2_w 2132749843
    //   3118: l2i
    //   3119: ldc_w -535602499
    //   3122: ixor
    //   3123: goto -> 3134
    //   3126: ldc2_w -348937315
    //   3129: l2i
    //   3130: ldc_w 580038483
    //   3133: ixor
    //   3134: ldc2_w -250138472
    //   3137: l2i
    //   3138: ldc_w -1096624829
    //   3141: ixor
    //   3142: ixor
    //   3143: lookupswitch default -> 3168, -793144971 -> 3620, 630610368 -> 3126
    //   3168: goto -> 3172
    //   3171: athrow
    //   3172: invokestatic rightClickBlock : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;Z)V
    //   3175: goto -> 3179
    //   3178: athrow
    //   3179: getstatic Perryc.1 : I
    //   3182: ifeq -> 3196
    //   3185: ldc2_w 1896550444
    //   3188: l2i
    //   3189: ldc_w 113040298
    //   3192: ixor
    //   3193: goto -> 3204
    //   3196: ldc2_w -1835508606
    //   3199: l2i
    //   3200: ldc_w 977650863
    //   3203: ixor
    //   3204: ldc2_w -1562907297
    //   3207: l2i
    //   3208: ldc_w 1243617003
    //   3211: ixor
    //   3212: ixor
    //   3213: lookupswitch default -> 3240, -1623183310 -> 3686, -351319600 -> 3196
    //   3240: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3243: getstatic Perryc.c : I
    //   3246: iflt -> 3260
    //   3249: ldc2_w -92882477
    //   3252: l2i
    //   3253: ldc_w -290217416
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w -1157423324
    //   3263: l2i
    //   3264: ldc_w 1127730094
    //   3267: ixor
    //   3268: ldc2_w 900733362
    //   3271: l2i
    //   3272: ldc_w 1204336514
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 3304, 1595876916 -> 3260, 1723708891 -> 3640
    //   3304: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3307: getstatic Perryc.c : I
    //   3310: iflt -> 3324
    //   3313: ldc2_w 1425566446
    //   3316: l2i
    //   3317: ldc_w 1891511059
    //   3320: ixor
    //   3321: goto -> 3332
    //   3324: ldc2_w -245354254
    //   3327: l2i
    //   3328: ldc_w 1151441016
    //   3331: ixor
    //   3332: ldc2_w -980782091
    //   3335: l2i
    //   3336: ldc_w -1748072461
    //   3339: ixor
    //   3340: ixor
    //   3341: lookupswitch default -> 3588, -410690420 -> 3368, 1979889147 -> 3324
    //   3368: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   3371: getstatic Perryc.c : I
    //   3374: iflt -> 3388
    //   3377: ldc2_w -452820967
    //   3380: l2i
    //   3381: ldc_w -271573071
    //   3384: ixor
    //   3385: goto -> 3396
    //   3388: ldc2_w 989005366
    //   3391: l2i
    //   3392: ldc_w -958984639
    //   3395: ixor
    //   3396: ldc2_w 1814558406
    //   3399: l2i
    //   3400: ldc_w 1079595815
    //   3403: ixor
    //   3404: ixor
    //   3405: lookupswitch default -> 3646, -799363690 -> 3432, 648821321 -> 3388
    //   3432: goto -> 3436
    //   3435: athrow
    //   3436: invokevirtual func_184609_a : (Lnet/minecraft/util/EnumHand;)V
    //   3439: goto -> 3443
    //   3442: athrow
    //   3443: getstatic Perryc.0 : I
    //   3446: ifle -> 3460
    //   3449: ldc2_w 471644271
    //   3452: l2i
    //   3453: ldc_w -1419875662
    //   3456: ixor
    //   3457: goto -> 3468
    //   3460: ldc2_w 883580394
    //   3463: l2i
    //   3464: ldc_w 533232740
    //   3467: ixor
    //   3468: ldc2_w -731022156
    //   3471: l2i
    //   3472: ldc_w -1930879128
    //   3475: ixor
    //   3476: ixor
    //   3477: lookupswitch default -> 3504, -272191231 -> 3666, 1769327178 -> 3460
    //   3504: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3507: ldc2_w -452016318
    //   3510: l2i
    //   3511: ldc_w -452016314
    //   3514: ixor
    //   3515: getstatic Perryc.0 : I
    //   3518: ifle -> 3532
    //   3521: ldc2_w -605004849
    //   3524: l2i
    //   3525: ldc_w -245291265
    //   3528: ixor
    //   3529: goto -> 3540
    //   3532: ldc2_w 1560186677
    //   3535: l2i
    //   3536: ldc_w 1944356159
    //   3539: ixor
    //   3540: ldc2_w 674069737
    //   3543: l2i
    //   3544: ldc_w 1277902944
    //   3547: ixor
    //   3548: ixor
    //   3549: lookupswitch default -> 3676, 1260140163 -> 3576, 1318535609 -> 3532
    //   3576: putfield field_71467_ac : I
    //   3579: ldc2_w 464483416
    //   3582: l2i
    //   3583: ldc_w 464483417
    //   3586: ixor
    //   3587: ireturn
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
    //   3640: aconst_null
    //   3641: athrow
    //   3642: aconst_null
    //   3643: athrow
    //   3644: aconst_null
    //   3645: athrow
    //   3646: aconst_null
    //   3647: athrow
    //   3648: aconst_null
    //   3649: athrow
    //   3650: aconst_null
    //   3651: athrow
    //   3652: aconst_null
    //   3653: athrow
    //   3654: aconst_null
    //   3655: athrow
    //   3656: aconst_null
    //   3657: athrow
    //   3658: aconst_null
    //   3659: athrow
    //   3660: aconst_null
    //   3661: athrow
    //   3662: aconst_null
    //   3663: athrow
    //   3664: aconst_null
    //   3665: athrow
    //   3666: aconst_null
    //   3667: athrow
    //   3668: aconst_null
    //   3669: athrow
    //   3670: aconst_null
    //   3671: athrow
    //   3672: aconst_null
    //   3673: athrow
    //   3674: aconst_null
    //   3675: athrow
    //   3676: aconst_null
    //   3677: athrow
    //   3678: aconst_null
    //   3679: athrow
    //   3680: aconst_null
    //   3681: athrow
    //   3682: aconst_null
    //   3683: athrow
    //   3684: aconst_null
    //   3685: athrow
    //   3686: aconst_null
    //   3687: athrow
    //   3688: pop
    //   3689: goto -> 24
    //   3692: pop
    //   3693: aconst_null
    //   3694: goto -> 3688
    //   3697: dup
    //   3698: ifnull -> 3688
    //   3701: checkcast java/lang/Throwable
    //   3704: athrow
    //   3705: dup
    //   3706: ifnull -> 3692
    //   3709: checkcast java/lang/Throwable
    //   3712: athrow
    //   3713: aconst_null
    //   3714: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3564	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	3564	1	hand	Lnet/minecraft/util/EnumHand;
    //   24	3564	2	rotate	Z
    //   24	3564	3	packet	Z
    //   24	3564	4	isSneaking	Z
    //   218	3370	5	side	Lnet/minecraft/util/EnumFacing;
    //   658	2930	6	neighbour	Lnet/minecraft/util/math/BlockPos;
    //   858	2730	7	opposite	Lnet/minecraft/util/EnumFacing;
    //   1542	2046	8	hitVec	Lnet/minecraft/util/math/Vec3d;
    // Exception table:
    //   from	to	target	type
    //   8	20	3697	finally
    //   147	154	154	finally
    //   147	154	3	finally
    //   148	154	147	java/lang/ClassCastException
    //   148	154	147	finally
    //   148	154	154	java/lang/NegativeArraySizeException
    //   587	594	594	finally
    //   587	594	587	java/lang/IndexOutOfBoundsException
    //   587	594	594	java/lang/UnsupportedOperationException
    //   587	594	3	java/lang/ClassCastException
    //   587	594	3	finally
    //   787	794	794	finally
    //   787	794	794	finally
    //   787	794	794	finally
    //   788	794	3	java/lang/UnsupportedOperationException
    //   788	794	787	java/lang/AssertionError
    //   991	998	998	finally
    //   991	998	991	java/lang/NumberFormatException
    //   991	998	3	java/lang/StringIndexOutOfBoundsException
    //   991	998	991	java/lang/EnumConstantNotPresentException
    //   992	998	998	java/util/NoSuchElementException
    //   1103	1110	1110	finally
    //   1103	1110	3	finally
    //   1103	1110	1103	java/lang/ArrayIndexOutOfBoundsException
    //   1103	1110	1110	finally
    //   1103	1110	1103	java/lang/UnsupportedOperationException
    //   1243	1250	1250	finally
    //   1243	1250	3	java/lang/ClassCastException
    //   1244	1250	1250	finally
    //   1244	1250	3	finally
    //   1244	1250	1243	java/lang/NullPointerException
    //   1316	1322	1322	finally
    //   1316	1322	3	finally
    //   1316	1322	1322	finally
    //   1316	1322	3	finally
    //   1316	1322	3	java/lang/StringIndexOutOfBoundsException
    //   1399	1406	1406	finally
    //   1399	1406	1406	finally
    //   1399	1406	1399	finally
    //   1399	1406	1399	java/lang/NumberFormatException
    //   1400	1406	1399	finally
    //   1471	1478	1478	finally
    //   1471	1478	1471	finally
    //   1472	1478	3	java/lang/NullPointerException
    //   1472	1478	1478	java/lang/IndexOutOfBoundsException
    //   1472	1478	1471	finally
    //   1736	1742	1742	finally
    //   1736	1742	3	finally
    //   1736	1742	1742	finally
    //   1736	1742	1742	java/lang/ClassCastException
    //   1736	1742	3	finally
    //   2248	2254	2254	finally
    //   2248	2254	3	finally
    //   2248	2254	2254	java/lang/IndexOutOfBoundsException
    //   2248	2254	3	java/lang/UnsupportedOperationException
    //   2248	2254	3	finally
    //   2320	2326	2326	finally
    //   2320	2326	3	java/lang/NegativeArraySizeException
    //   2320	2326	2326	java/lang/NegativeArraySizeException
    //   2320	2326	3	java/lang/NegativeArraySizeException
    //   2320	2326	2326	java/lang/NegativeArraySizeException
    //   2528	2534	2534	finally
    //   2528	2534	2534	finally
    //   2528	2534	3	finally
    //   2528	2534	2534	finally
    //   2528	2534	3	java/lang/AssertionError
    //   2787	2794	2794	finally
    //   2787	2794	2787	java/lang/NegativeArraySizeException
    //   2787	2794	2787	finally
    //   2788	2794	2794	java/lang/IllegalArgumentException
    //   2788	2794	3	java/lang/IndexOutOfBoundsException
    //   3171	3178	3178	finally
    //   3171	3178	3171	java/lang/ArrayIndexOutOfBoundsException
    //   3171	3178	3178	finally
    //   3172	3178	3178	java/lang/UnsupportedOperationException
    //   3172	3178	3	finally
    //   3435	3442	3442	finally
    //   3435	3442	3435	java/lang/NegativeArraySizeException
    //   3435	3442	3	finally
    //   3435	3442	3435	finally
    //   3436	3442	3442	java/lang/ClassCastException
    //   3697	3705	3697	java/lang/EnumConstantNotPresentException
    //   3713	3715	3	finally
  }
  
  public static float[] getLegitRotations(Vec3d vec) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3353
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3345
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3337
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 929834695
    //   33: l2i
    //   34: ldc_w -738495294
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -870930773
    //   44: l2i
    //   45: ldc_w -655489803
    //   48: ixor
    //   49: ldc2_w -1308527100
    //   52: l2i
    //   53: ldc_w -1367405605
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 3252, -118935590 -> 41, 143056769 -> 84
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic getEyesPos : ()Lnet/minecraft/util/math/Vec3d;
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.c : I
    //   98: iflt -> 112
    //   101: ldc2_w -1696548094
    //   104: l2i
    //   105: ldc_w -1283174994
    //   108: ixor
    //   109: goto -> 120
    //   112: ldc2_w -1942820296
    //   115: l2i
    //   116: ldc_w -1644314662
    //   119: ixor
    //   120: ldc2_w 2098648245
    //   123: l2i
    //   124: ldc_w 491613852
    //   127: ixor
    //   128: ixor
    //   129: lookupswitch default -> 3326, 1228885125 -> 112, 1905586123 -> 156
    //   156: astore_1
    //   157: getstatic Perryc.0 : I
    //   160: ifle -> 174
    //   163: ldc2_w 1208881371
    //   166: l2i
    //   167: ldc_w 251587146
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w 1414086520
    //   177: l2i
    //   178: ldc_w 305050982
    //   181: ixor
    //   182: ldc2_w -1776172401
    //   185: l2i
    //   186: ldc_w -1058327018
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 216, 272240136 -> 3258, 1536980425 -> 174
    //   216: aload_0
    //   217: getstatic Perryc.1 : I
    //   220: ifeq -> 234
    //   223: ldc2_w -1723248455
    //   226: l2i
    //   227: ldc_w 1313335536
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 1176856681
    //   237: l2i
    //   238: ldc_w -812478003
    //   241: ixor
    //   242: ldc2_w -556324209
    //   245: l2i
    //   246: ldc_w 904802808
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, 1010279230 -> 3298, 1879520439 -> 234
    //   276: getfield field_72450_a : D
    //   279: getstatic Perryc.c : I
    //   282: iflt -> 296
    //   285: ldc2_w 277414667
    //   288: l2i
    //   289: ldc_w -1096746828
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 1455184305
    //   299: l2i
    //   300: ldc_w -221807245
    //   303: ixor
    //   304: ldc2_w 1859706639
    //   307: l2i
    //   308: ldc_w 1487097160
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -1739429384 -> 3324, -718649425 -> 296
    //   340: aload_1
    //   341: getstatic Perryc.1 : I
    //   344: ifeq -> 358
    //   347: ldc2_w -1694605102
    //   350: l2i
    //   351: ldc_w -1495697738
    //   354: ixor
    //   355: goto -> 366
    //   358: ldc2_w 844397400
    //   361: l2i
    //   362: ldc_w 1974699090
    //   365: ixor
    //   366: ldc2_w 553641569
    //   369: l2i
    //   370: ldc_w -464597215
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 400, -124371164 -> 3314, 241843348 -> 358
    //   400: getfield field_72450_a : D
    //   403: dsub
    //   404: getstatic Perryc.1 : I
    //   407: ifeq -> 421
    //   410: ldc2_w 1637118135
    //   413: l2i
    //   414: ldc_w 1786249738
    //   417: ixor
    //   418: goto -> 429
    //   421: ldc2_w -749290190
    //   424: l2i
    //   425: ldc_w 234258632
    //   428: ixor
    //   429: ldc2_w 1779674936
    //   432: l2i
    //   433: ldc_w -547769245
    //   436: ixor
    //   437: ixor
    //   438: lookupswitch default -> 3264, -1096390170 -> 421, 1810507425 -> 464
    //   464: dstore_2
    //   465: getstatic Perryc.c : I
    //   468: iflt -> 482
    //   471: ldc2_w -569519139
    //   474: l2i
    //   475: ldc_w 1091613092
    //   478: ixor
    //   479: goto -> 490
    //   482: ldc2_w 1434582129
    //   485: l2i
    //   486: ldc_w -1513665357
    //   489: ixor
    //   490: ldc2_w 1174939953
    //   493: l2i
    //   494: ldc_w 642518054
    //   497: ixor
    //   498: ixor
    //   499: lookupswitch default -> 3260, -1878878763 -> 524, -10926226 -> 482
    //   524: aload_0
    //   525: getstatic Perryc.c : I
    //   528: iflt -> 542
    //   531: ldc2_w 323917057
    //   534: l2i
    //   535: ldc_w -378868712
    //   538: ixor
    //   539: goto -> 550
    //   542: ldc2_w 318583567
    //   545: l2i
    //   546: ldc_w -2033562216
    //   549: ixor
    //   550: ldc2_w 271613082
    //   553: l2i
    //   554: ldc_w -1230429761
    //   557: ixor
    //   558: ixor
    //   559: lookupswitch default -> 584, -865073993 -> 542, 1555899452 -> 3272
    //   584: getfield field_72448_b : D
    //   587: getstatic Perryc.0 : I
    //   590: ifle -> 604
    //   593: ldc2_w -347439515
    //   596: l2i
    //   597: ldc_w 404262318
    //   600: ixor
    //   601: goto -> 612
    //   604: ldc2_w 1860780358
    //   607: l2i
    //   608: ldc_w -853819608
    //   611: ixor
    //   612: ldc2_w 501416389
    //   615: l2i
    //   616: ldc_w -1343644703
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 648, 1096313327 -> 3230, 1379974335 -> 604
    //   648: aload_1
    //   649: getstatic Perryc.c : I
    //   652: iflt -> 666
    //   655: ldc2_w -799797535
    //   658: l2i
    //   659: ldc_w 1245438146
    //   662: ixor
    //   663: goto -> 674
    //   666: ldc2_w 1998924206
    //   669: l2i
    //   670: ldc_w -749701336
    //   673: ixor
    //   674: ldc2_w -2005142414
    //   677: l2i
    //   678: ldc_w 2125350895
    //   681: ixor
    //   682: ixor
    //   683: lookupswitch default -> 3232, 1386278171 -> 708, 1824153022 -> 666
    //   708: getfield field_72448_b : D
    //   711: dsub
    //   712: getstatic Perryc.0 : I
    //   715: ifle -> 729
    //   718: ldc2_w -2125090756
    //   721: l2i
    //   722: ldc_w 1926828276
    //   725: ixor
    //   726: goto -> 737
    //   729: ldc2_w -1668106028
    //   732: l2i
    //   733: ldc_w -2068178963
    //   736: ixor
    //   737: ldc2_w 1043537395
    //   740: l2i
    //   741: ldc_w -339592871
    //   744: ixor
    //   745: ixor
    //   746: lookupswitch default -> 772, 443832455 -> 729, 645760098 -> 3246
    //   772: dstore #4
    //   774: getstatic Perryc.c : I
    //   777: iflt -> 791
    //   780: ldc2_w 1114462988
    //   783: l2i
    //   784: ldc_w -180450639
    //   787: ixor
    //   788: goto -> 799
    //   791: ldc2_w -1086136504
    //   794: l2i
    //   795: ldc_w 520350248
    //   798: ixor
    //   799: ldc2_w 1363684303
    //   802: l2i
    //   803: ldc_w -714426793
    //   806: ixor
    //   807: ixor
    //   808: lookupswitch default -> 836, 863063077 -> 3254, 1109647799 -> 791
    //   836: aload_0
    //   837: getstatic Perryc.c : I
    //   840: iflt -> 854
    //   843: ldc2_w -1617111232
    //   846: l2i
    //   847: ldc_w -309238768
    //   850: ixor
    //   851: goto -> 862
    //   854: ldc2_w -242890779
    //   857: l2i
    //   858: ldc_w 2049565067
    //   861: ixor
    //   862: ldc2_w -889549022
    //   865: l2i
    //   866: ldc_w -1080907149
    //   869: ixor
    //   870: ixor
    //   871: lookupswitch default -> 3244, -20708545 -> 896, 124098049 -> 854
    //   896: getfield field_72449_c : D
    //   899: getstatic Perryc.1 : I
    //   902: ifeq -> 916
    //   905: ldc2_w -866173111
    //   908: l2i
    //   909: ldc_w 1880324038
    //   912: ixor
    //   913: goto -> 924
    //   916: ldc2_w 614905211
    //   919: l2i
    //   920: ldc_w -1008437836
    //   923: ixor
    //   924: ldc2_w 1585445429
    //   927: l2i
    //   928: ldc_w -1338517956
    //   931: ixor
    //   932: ixor
    //   933: lookupswitch default -> 960, 813864815 -> 916, 1376019590 -> 3266
    //   960: aload_1
    //   961: getstatic Perryc.1 : I
    //   964: ifeq -> 978
    //   967: ldc2_w 2115026552
    //   970: l2i
    //   971: ldc_w -1754792788
    //   974: ixor
    //   975: goto -> 986
    //   978: ldc2_w -155081832
    //   981: l2i
    //   982: ldc_w 103416456
    //   985: ixor
    //   986: ldc2_w -909808737
    //   989: l2i
    //   990: ldc_w -1545230880
    //   993: ixor
    //   994: ixor
    //   995: lookupswitch default -> 3242, -2091414357 -> 978, -1697943697 -> 1020
    //   1020: getfield field_72449_c : D
    //   1023: dsub
    //   1024: getstatic Perryc.c : I
    //   1027: iflt -> 1041
    //   1030: ldc2_w 1932449586
    //   1033: l2i
    //   1034: ldc_w -750464923
    //   1037: ixor
    //   1038: goto -> 1049
    //   1041: ldc2_w 626508590
    //   1044: l2i
    //   1045: ldc_w -2132521721
    //   1048: ixor
    //   1049: ldc2_w -146927672
    //   1052: l2i
    //   1053: ldc_w -928855611
    //   1056: ixor
    //   1057: ixor
    //   1058: lookupswitch default -> 3322, -1708177372 -> 1084, -1611218598 -> 1041
    //   1084: dstore #6
    //   1086: getstatic Perryc.c : I
    //   1089: iflt -> 1103
    //   1092: ldc2_w -113619890
    //   1095: l2i
    //   1096: ldc_w -1146729540
    //   1099: ixor
    //   1100: goto -> 1111
    //   1103: ldc2_w -543413715
    //   1106: l2i
    //   1107: ldc_w 1373412159
    //   1110: ixor
    //   1111: ldc2_w -1885949646
    //   1114: l2i
    //   1115: ldc_w 1632221679
    //   1118: ixor
    //   1119: ixor
    //   1120: lookupswitch default -> 1148, -1404891345 -> 3292, -1130717 -> 1103
    //   1148: dload_2
    //   1149: getstatic Perryc.1 : I
    //   1152: ifeq -> 1166
    //   1155: ldc2_w -1378853897
    //   1158: l2i
    //   1159: ldc_w -81805007
    //   1162: ixor
    //   1163: goto -> 1174
    //   1166: ldc2_w -749575104
    //   1169: l2i
    //   1170: ldc_w -1195061925
    //   1173: ixor
    //   1174: ldc2_w 293038272
    //   1177: l2i
    //   1178: ldc_w 1479877592
    //   1181: ixor
    //   1182: ixor
    //   1183: lookupswitch default -> 1208, -126132076 -> 1166, 529387998 -> 3282
    //   1208: dload_2
    //   1209: dmul
    //   1210: getstatic Perryc.1 : I
    //   1213: ifeq -> 1227
    //   1216: ldc2_w 810545299
    //   1219: l2i
    //   1220: ldc_w -680187264
    //   1223: ixor
    //   1224: goto -> 1235
    //   1227: ldc2_w 1952486339
    //   1230: l2i
    //   1231: ldc_w -2115591102
    //   1234: ixor
    //   1235: ldc2_w 661930926
    //   1238: l2i
    //   1239: ldc_w -1545693458
    //   1242: ixor
    //   1243: ixor
    //   1244: lookupswitch default -> 1272, -1956780785 -> 1227, 1670385491 -> 3284
    //   1272: dload #6
    //   1274: getstatic Perryc.1 : I
    //   1277: ifeq -> 1291
    //   1280: ldc2_w 931125663
    //   1283: l2i
    //   1284: ldc_w -1905938324
    //   1287: ixor
    //   1288: goto -> 1299
    //   1291: ldc2_w 1079214333
    //   1294: l2i
    //   1295: ldc_w 269307167
    //   1298: ixor
    //   1299: ldc2_w -480049016
    //   1302: l2i
    //   1303: ldc_w 1108955724
    //   1306: ixor
    //   1307: ixor
    //   1308: lookupswitch default -> 1336, -315999049 -> 1291, 408957751 -> 3310
    //   1336: dload #6
    //   1338: dmul
    //   1339: dadd
    //   1340: getstatic Perryc.1 : I
    //   1343: ifeq -> 1357
    //   1346: ldc2_w 558329703
    //   1349: l2i
    //   1350: ldc_w -400362503
    //   1353: ixor
    //   1354: goto -> 1365
    //   1357: ldc2_w -1803176738
    //   1360: l2i
    //   1361: ldc_w 426315905
    //   1364: ixor
    //   1365: ldc2_w -1613929089
    //   1368: l2i
    //   1369: ldc_w 971744924
    //   1372: ixor
    //   1373: ixor
    //   1374: lookupswitch default -> 3312, 734685116 -> 1400, 1866686333 -> 1357
    //   1400: goto -> 1404
    //   1403: athrow
    //   1404: invokestatic sqrt : (D)D
    //   1407: goto -> 1411
    //   1410: athrow
    //   1411: getstatic Perryc.0 : I
    //   1414: ifle -> 1428
    //   1417: ldc2_w 1119566038
    //   1420: l2i
    //   1421: ldc_w -1466786651
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w 145644596
    //   1431: l2i
    //   1432: ldc_w 1610629840
    //   1435: ixor
    //   1436: ldc2_w -793976887
    //   1439: l2i
    //   1440: ldc_w -408081026
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, -739260652 -> 1428, -584558908 -> 3248
    //   1472: dstore #8
    //   1474: getstatic Perryc.1 : I
    //   1477: ifeq -> 1491
    //   1480: ldc2_w 301888901
    //   1483: l2i
    //   1484: ldc_w 1506583849
    //   1487: ixor
    //   1488: goto -> 1499
    //   1491: ldc2_w 607757991
    //   1494: l2i
    //   1495: ldc_w -1722741627
    //   1498: ixor
    //   1499: ldc2_w 1651348552
    //   1502: l2i
    //   1503: ldc_w -340282348
    //   1506: ixor
    //   1507: ixor
    //   1508: lookupswitch default -> 1536, -1041698576 -> 3234, 1768037925 -> 1491
    //   1536: dload #6
    //   1538: getstatic Perryc.c : I
    //   1541: iflt -> 1555
    //   1544: ldc2_w 943253976
    //   1547: l2i
    //   1548: ldc_w 930778631
    //   1551: ixor
    //   1552: goto -> 1563
    //   1555: ldc2_w -387936532
    //   1558: l2i
    //   1559: ldc_w 132932725
    //   1562: ixor
    //   1563: ldc2_w -1276648766
    //   1566: l2i
    //   1567: ldc_w -712252761
    //   1570: ixor
    //   1571: ixor
    //   1572: lookupswitch default -> 1600, -196929791 -> 1555, 1764648890 -> 3290
    //   1600: dload_2
    //   1601: getstatic Perryc.1 : I
    //   1604: ifeq -> 1618
    //   1607: ldc2_w 109254063
    //   1610: l2i
    //   1611: ldc_w 336431704
    //   1614: ixor
    //   1615: goto -> 1626
    //   1618: ldc2_w 723085409
    //   1621: l2i
    //   1622: ldc_w 2029966578
    //   1625: ixor
    //   1626: ldc2_w 1538109929
    //   1629: l2i
    //   1630: ldc_w 164131332
    //   1633: ixor
    //   1634: ixor
    //   1635: lookupswitch default -> 1660, -712972593 -> 1618, 1089166362 -> 3318
    //   1660: goto -> 1664
    //   1663: athrow
    //   1664: invokestatic atan2 : (DD)D
    //   1667: goto -> 1671
    //   1670: athrow
    //   1671: getstatic Perryc.c : I
    //   1674: iflt -> 1688
    //   1677: ldc2_w -2008839893
    //   1680: l2i
    //   1681: ldc_w 1863404717
    //   1684: ixor
    //   1685: goto -> 1696
    //   1688: ldc2_w 1620418418
    //   1691: l2i
    //   1692: ldc_w 1936462186
    //   1695: ixor
    //   1696: ldc2_w 1911109486
    //   1699: l2i
    //   1700: ldc_w -657359928
    //   1703: ixor
    //   1704: ixor
    //   1705: lookupswitch default -> 1732, 873614986 -> 1688, 1315604768 -> 3300
    //   1732: goto -> 1736
    //   1735: athrow
    //   1736: invokestatic toDegrees : (D)D
    //   1739: goto -> 1743
    //   1742: athrow
    //   1743: d2f
    //   1744: ldc_w 0.026522731
    //   1747: invokestatic floatToIntBits : (F)I
    //   1750: ldc_w 2121090611
    //   1753: ixor
    //   1754: invokestatic intBitsToFloat : (I)F
    //   1757: fsub
    //   1758: getstatic Perryc.1 : I
    //   1761: ifeq -> 1775
    //   1764: ldc2_w -1632845879
    //   1767: l2i
    //   1768: ldc_w 1781300122
    //   1771: ixor
    //   1772: goto -> 1783
    //   1775: ldc2_w -2043375733
    //   1778: l2i
    //   1779: ldc_w 708737406
    //   1782: ixor
    //   1783: ldc2_w -1195721581
    //   1786: l2i
    //   1787: ldc_w 88132740
    //   1790: ixor
    //   1791: ixor
    //   1792: lookupswitch default -> 3308, 300975842 -> 1820, 1232778308 -> 1775
    //   1820: fstore #10
    //   1822: getstatic Perryc.c : I
    //   1825: iflt -> 1839
    //   1828: ldc2_w -2034074119
    //   1831: l2i
    //   1832: ldc_w 935902790
    //   1835: ixor
    //   1836: goto -> 1847
    //   1839: ldc2_w 1967517662
    //   1842: l2i
    //   1843: ldc_w 973183120
    //   1846: ixor
    //   1847: ldc2_w 415619010
    //   1850: l2i
    //   1851: ldc_w -1282216685
    //   1854: ixor
    //   1855: ixor
    //   1856: lookupswitch default -> 3262, -468496993 -> 1884, 442366318 -> 1839
    //   1884: dload #4
    //   1886: getstatic Perryc.c : I
    //   1889: iflt -> 1903
    //   1892: ldc2_w -1559739810
    //   1895: l2i
    //   1896: ldc_w -1786562207
    //   1899: ixor
    //   1900: goto -> 1911
    //   1903: ldc2_w 1412054234
    //   1906: l2i
    //   1907: ldc_w -2146291925
    //   1910: ixor
    //   1911: ldc2_w 1395892268
    //   1914: l2i
    //   1915: ldc_w 837024216
    //   1918: ixor
    //   1919: ixor
    //   1920: lookupswitch default -> 3316, -1226290683 -> 1948, 1415258827 -> 1903
    //   1948: dload #8
    //   1950: getstatic Perryc.c : I
    //   1953: iflt -> 1967
    //   1956: ldc2_w -230061652
    //   1959: l2i
    //   1960: ldc_w -1045441972
    //   1963: ixor
    //   1964: goto -> 1975
    //   1967: ldc2_w 1266622156
    //   1970: l2i
    //   1971: ldc_w 1117158402
    //   1974: ixor
    //   1975: ldc2_w 1387166419
    //   1978: l2i
    //   1979: ldc_w -1030722507
    //   1982: ixor
    //   1983: ixor
    //   1984: lookupswitch default -> 2012, -1546105594 -> 3296, -43513177 -> 1967
    //   2012: goto -> 2016
    //   2015: athrow
    //   2016: invokestatic atan2 : (DD)D
    //   2019: goto -> 2023
    //   2022: athrow
    //   2023: getstatic Perryc.0 : I
    //   2026: ifle -> 2040
    //   2029: ldc2_w -1650300270
    //   2032: l2i
    //   2033: ldc_w 1246529392
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 1430688762
    //   2043: l2i
    //   2044: ldc_w 1247599205
    //   2047: ixor
    //   2048: ldc2_w 931978547
    //   2051: l2i
    //   2052: ldc_w 784395485
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 3320, -828187636 -> 2040, 106330225 -> 2084
    //   2084: goto -> 2088
    //   2087: athrow
    //   2088: invokestatic toDegrees : (D)D
    //   2091: goto -> 2095
    //   2094: athrow
    //   2095: dneg
    //   2096: d2f
    //   2097: getstatic Perryc.0 : I
    //   2100: ifle -> 2114
    //   2103: ldc2_w -294430972
    //   2106: l2i
    //   2107: ldc_w -414664052
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w -1401699031
    //   2117: l2i
    //   2118: ldc_w 2046638318
    //   2121: ixor
    //   2122: ldc2_w -241391891
    //   2125: l2i
    //   2126: ldc_w 1274377845
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 2156, -1286456048 -> 3250, -791800548 -> 2114
    //   2156: fstore #11
    //   2158: ldc2_w 1273308703
    //   2161: l2i
    //   2162: ldc_w 1273308701
    //   2165: ixor
    //   2166: newarray float
    //   2168: dup
    //   2169: ldc2_w 1355016492
    //   2172: l2i
    //   2173: ldc_w 1355016492
    //   2176: ixor
    //   2177: getstatic Perryc.c : I
    //   2180: iflt -> 2194
    //   2183: ldc2_w -113686313
    //   2186: l2i
    //   2187: ldc_w -1755504780
    //   2190: ixor
    //   2191: goto -> 2202
    //   2194: ldc2_w 1556706699
    //   2197: l2i
    //   2198: ldc_w -1764252152
    //   2201: ixor
    //   2202: ldc2_w -110243416
    //   2205: l2i
    //   2206: ldc_w 1288891230
    //   2209: ixor
    //   2210: ixor
    //   2211: lookupswitch default -> 2236, -606376619 -> 3274, 1028889584 -> 2194
    //   2236: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2239: getstatic Perryc.0 : I
    //   2242: ifle -> 2256
    //   2245: ldc2_w 750704481
    //   2248: l2i
    //   2249: ldc_w 233692130
    //   2252: ixor
    //   2253: goto -> 2264
    //   2256: ldc2_w -304637789
    //   2259: l2i
    //   2260: ldc_w -306680449
    //   2263: ixor
    //   2264: ldc2_w 1429624888
    //   2267: l2i
    //   2268: ldc_w 1691005252
    //   2271: ixor
    //   2272: ixor
    //   2273: lookupswitch default -> 2300, 279963135 -> 3270, 470088658 -> 2256
    //   2300: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2303: getstatic Perryc.c : I
    //   2306: iflt -> 2320
    //   2309: ldc2_w 1635071811
    //   2312: l2i
    //   2313: ldc_w -1344861655
    //   2316: ixor
    //   2317: goto -> 2328
    //   2320: ldc2_w 2060388026
    //   2323: l2i
    //   2324: ldc_w 357068385
    //   2327: ixor
    //   2328: ldc2_w 528687449
    //   2331: l2i
    //   2332: ldc_w 1725531164
    //   2335: ixor
    //   2336: ixor
    //   2337: lookupswitch default -> 3236, -1208444881 -> 2320, 383634846 -> 2364
    //   2364: getfield field_70177_z : F
    //   2367: getstatic Perryc.0 : I
    //   2370: ifle -> 2384
    //   2373: ldc2_w -42488248
    //   2376: l2i
    //   2377: ldc_w 1351488132
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w -696565692
    //   2387: l2i
    //   2388: ldc_w 230934253
    //   2391: ixor
    //   2392: ldc2_w 1932409727
    //   2395: l2i
    //   2396: ldc_w -1498569680
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 3240, 238754278 -> 2428, 2021270403 -> 2384
    //   2428: fload #10
    //   2430: getstatic Perryc.c : I
    //   2433: iflt -> 2447
    //   2436: ldc2_w 475165080
    //   2439: l2i
    //   2440: ldc_w 1419011070
    //   2443: ixor
    //   2444: goto -> 2455
    //   2447: ldc2_w 741744927
    //   2450: l2i
    //   2451: ldc_w 606283963
    //   2454: ixor
    //   2455: ldc2_w 397891749
    //   2458: l2i
    //   2459: ldc_w 204551776
    //   2462: ixor
    //   2463: ixor
    //   2464: lookupswitch default -> 2492, -1309477647 -> 2447, 1396735139 -> 3256
    //   2492: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2495: getstatic Perryc.0 : I
    //   2498: ifle -> 2512
    //   2501: ldc2_w 1316715120
    //   2504: l2i
    //   2505: ldc_w 1996361195
    //   2508: ixor
    //   2509: goto -> 2520
    //   2512: ldc2_w 1160674323
    //   2515: l2i
    //   2516: ldc_w 17233173
    //   2519: ixor
    //   2520: ldc2_w 2038590557
    //   2523: l2i
    //   2524: ldc_w -2032803214
    //   2527: ixor
    //   2528: ixor
    //   2529: lookupswitch default -> 2556, -942474828 -> 3276, 1516119264 -> 2512
    //   2556: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2559: getstatic Perryc.c : I
    //   2562: iflt -> 2576
    //   2565: ldc2_w 701713073
    //   2568: l2i
    //   2569: ldc_w -1595161775
    //   2572: ixor
    //   2573: goto -> 2584
    //   2576: ldc2_w 935948451
    //   2579: l2i
    //   2580: ldc_w 252455333
    //   2583: ixor
    //   2584: ldc2_w -1473981594
    //   2587: l2i
    //   2588: ldc_w -257629331
    //   2591: ixor
    //   2592: ixor
    //   2593: lookupswitch default -> 2620, -1692645340 -> 2576, -776422933 -> 3286
    //   2620: getfield field_70177_z : F
    //   2623: fsub
    //   2624: getstatic Perryc.0 : I
    //   2627: ifle -> 2641
    //   2630: ldc2_w 1689853359
    //   2633: l2i
    //   2634: ldc_w -1024768534
    //   2637: ixor
    //   2638: goto -> 2649
    //   2641: ldc2_w 1663863840
    //   2644: l2i
    //   2645: ldc_w -889901808
    //   2648: ixor
    //   2649: ldc2_w -325460309
    //   2652: l2i
    //   2653: ldc_w 2038403462
    //   2656: ixor
    //   2657: ixor
    //   2658: lookupswitch default -> 3294, 867440488 -> 2641, 1010822685 -> 2684
    //   2684: goto -> 2688
    //   2687: athrow
    //   2688: invokestatic func_76142_g : (F)F
    //   2691: goto -> 2695
    //   2694: athrow
    //   2695: fadd
    //   2696: fastore
    //   2697: dup
    //   2698: ldc2_w -271705069
    //   2701: l2i
    //   2702: ldc_w -271705070
    //   2705: ixor
    //   2706: getstatic Perryc.1 : I
    //   2709: ifeq -> 2723
    //   2712: ldc2_w 274221525
    //   2715: l2i
    //   2716: ldc_w 1765663984
    //   2719: ixor
    //   2720: goto -> 2731
    //   2723: ldc2_w 1861580499
    //   2726: l2i
    //   2727: ldc_w 1967694253
    //   2730: ixor
    //   2731: ldc2_w -1243504484
    //   2734: l2i
    //   2735: ldc_w -16950233
    //   2738: ixor
    //   2739: ixor
    //   2740: lookupswitch default -> 3302, 846811550 -> 2723, 1352739781 -> 2768
    //   2768: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2771: getstatic Perryc.1 : I
    //   2774: ifeq -> 2788
    //   2777: ldc2_w -1597388274
    //   2780: l2i
    //   2781: ldc_w 872653661
    //   2784: ixor
    //   2785: goto -> 2796
    //   2788: ldc2_w -1049604124
    //   2791: l2i
    //   2792: ldc_w -1634486497
    //   2795: ixor
    //   2796: ldc2_w 1841063686
    //   2799: l2i
    //   2800: ldc_w -530874595
    //   2803: ixor
    //   2804: ixor
    //   2805: lookupswitch default -> 2832, 422408520 -> 3278, 914893283 -> 2788
    //   2832: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2835: getstatic Perryc.0 : I
    //   2838: ifle -> 2852
    //   2841: ldc2_w 1319401957
    //   2844: l2i
    //   2845: ldc_w 185585423
    //   2848: ixor
    //   2849: goto -> 2860
    //   2852: ldc2_w 745232893
    //   2855: l2i
    //   2856: ldc_w 241691632
    //   2859: ixor
    //   2860: ldc2_w -984936729
    //   2863: l2i
    //   2864: ldc_w -1697906539
    //   2867: ixor
    //   2868: ixor
    //   2869: lookupswitch default -> 2896, 439138456 -> 3268, 1075907656 -> 2852
    //   2896: getfield field_70125_A : F
    //   2899: getstatic Perryc.0 : I
    //   2902: ifle -> 2916
    //   2905: ldc2_w 1031817945
    //   2908: l2i
    //   2909: ldc_w 1060725352
    //   2912: ixor
    //   2913: goto -> 2924
    //   2916: ldc2_w 1468698567
    //   2919: l2i
    //   2920: ldc_w 776066612
    //   2923: ixor
    //   2924: ldc2_w 630877583
    //   2927: l2i
    //   2928: ldc_w 430248444
    //   2931: ixor
    //   2932: ixor
    //   2933: lookupswitch default -> 2960, 334760341 -> 2916, 1048990914 -> 3238
    //   2960: fload #11
    //   2962: getstatic Perryc.0 : I
    //   2965: ifle -> 2979
    //   2968: ldc2_w -95003917
    //   2971: l2i
    //   2972: ldc_w -323204823
    //   2975: ixor
    //   2976: goto -> 2987
    //   2979: ldc2_w -1275324979
    //   2982: l2i
    //   2983: ldc_w 1696970016
    //   2986: ixor
    //   2987: ldc2_w 763025957
    //   2990: l2i
    //   2991: ldc_w 1467017372
    //   2994: ixor
    //   2995: ixor
    //   2996: lookupswitch default -> 3306, -1395420588 -> 3024, 1826627939 -> 2979
    //   3024: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3027: getstatic Perryc.0 : I
    //   3030: ifle -> 3044
    //   3033: ldc2_w -423205752
    //   3036: l2i
    //   3037: ldc_w 1753683072
    //   3040: ixor
    //   3041: goto -> 3052
    //   3044: ldc2_w -1659549632
    //   3047: l2i
    //   3048: ldc_w 1550987158
    //   3051: ixor
    //   3052: ldc2_w 1480535278
    //   3055: l2i
    //   3056: ldc_w 222330187
    //   3059: ixor
    //   3060: ixor
    //   3061: lookupswitch default -> 3088, -616685139 -> 3304, -434075942 -> 3044
    //   3088: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3091: getstatic Perryc.c : I
    //   3094: iflt -> 3108
    //   3097: ldc2_w 772552312
    //   3100: l2i
    //   3101: ldc_w -597229299
    //   3104: ixor
    //   3105: goto -> 3116
    //   3108: ldc2_w -1441603369
    //   3111: l2i
    //   3112: ldc_w -183223045
    //   3115: ixor
    //   3116: ldc2_w 1136641729
    //   3119: l2i
    //   3120: ldc_w -1069976681
    //   3123: ixor
    //   3124: ixor
    //   3125: lookupswitch default -> 3152, -1320183951 -> 3108, 1911390755 -> 3280
    //   3152: getfield field_70125_A : F
    //   3155: fsub
    //   3156: getstatic Perryc.c : I
    //   3159: iflt -> 3173
    //   3162: ldc2_w -1335603403
    //   3165: l2i
    //   3166: ldc_w 397461857
    //   3169: ixor
    //   3170: goto -> 3181
    //   3173: ldc2_w 1513817258
    //   3176: l2i
    //   3177: ldc_w 23468626
    //   3180: ixor
    //   3181: ldc2_w -791871274
    //   3184: l2i
    //   3185: ldc_w 1366239256
    //   3188: ixor
    //   3189: ixor
    //   3190: lookupswitch default -> 3288, -620808650 -> 3216, 645312154 -> 3173
    //   3216: goto -> 3220
    //   3219: athrow
    //   3220: invokestatic func_76142_g : (F)F
    //   3223: goto -> 3227
    //   3226: athrow
    //   3227: fadd
    //   3228: fastore
    //   3229: areturn
    //   3230: aconst_null
    //   3231: athrow
    //   3232: aconst_null
    //   3233: athrow
    //   3234: aconst_null
    //   3235: athrow
    //   3236: aconst_null
    //   3237: athrow
    //   3238: aconst_null
    //   3239: athrow
    //   3240: aconst_null
    //   3241: athrow
    //   3242: aconst_null
    //   3243: athrow
    //   3244: aconst_null
    //   3245: athrow
    //   3246: aconst_null
    //   3247: athrow
    //   3248: aconst_null
    //   3249: athrow
    //   3250: aconst_null
    //   3251: athrow
    //   3252: aconst_null
    //   3253: athrow
    //   3254: aconst_null
    //   3255: athrow
    //   3256: aconst_null
    //   3257: athrow
    //   3258: aconst_null
    //   3259: athrow
    //   3260: aconst_null
    //   3261: athrow
    //   3262: aconst_null
    //   3263: athrow
    //   3264: aconst_null
    //   3265: athrow
    //   3266: aconst_null
    //   3267: athrow
    //   3268: aconst_null
    //   3269: athrow
    //   3270: aconst_null
    //   3271: athrow
    //   3272: aconst_null
    //   3273: athrow
    //   3274: aconst_null
    //   3275: athrow
    //   3276: aconst_null
    //   3277: athrow
    //   3278: aconst_null
    //   3279: athrow
    //   3280: aconst_null
    //   3281: athrow
    //   3282: aconst_null
    //   3283: athrow
    //   3284: aconst_null
    //   3285: athrow
    //   3286: aconst_null
    //   3287: athrow
    //   3288: aconst_null
    //   3289: athrow
    //   3290: aconst_null
    //   3291: athrow
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
    //   3328: pop
    //   3329: goto -> 24
    //   3332: pop
    //   3333: aconst_null
    //   3334: goto -> 3328
    //   3337: dup
    //   3338: ifnull -> 3328
    //   3341: checkcast java/lang/Throwable
    //   3344: athrow
    //   3345: dup
    //   3346: ifnull -> 3332
    //   3349: checkcast java/lang/Throwable
    //   3352: athrow
    //   3353: aconst_null
    //   3354: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3206	0	vec	Lnet/minecraft/util/math/Vec3d;
    //   157	3073	1	eyesPos	Lnet/minecraft/util/math/Vec3d;
    //   465	2765	2	diffX	D
    //   774	2456	4	diffY	D
    //   1086	2144	6	diffZ	D
    //   1474	1756	8	diffXZ	D
    //   1822	1408	10	yaw	F
    //   2158	1072	11	pitch	F
    // Exception table:
    //   from	to	target	type
    //   8	20	3337	finally
    //   88	94	94	finally
    //   88	94	94	finally
    //   88	94	94	finally
    //   88	94	94	java/util/NoSuchElementException
    //   88	94	3	finally
    //   1403	1410	1410	finally
    //   1404	1410	1410	finally
    //   1404	1410	1403	java/lang/UnsupportedOperationException
    //   1404	1410	1410	java/lang/ArithmeticException
    //   1404	1410	1403	java/lang/ArrayIndexOutOfBoundsException
    //   1663	1670	1670	finally
    //   1663	1670	1670	java/lang/IndexOutOfBoundsException
    //   1663	1670	1663	finally
    //   1663	1670	3	finally
    //   1664	1670	3	java/lang/ArrayIndexOutOfBoundsException
    //   1736	1742	1742	finally
    //   1736	1742	3	finally
    //   1736	1742	1742	finally
    //   1736	1742	3	finally
    //   1736	1742	3	java/lang/NegativeArraySizeException
    //   2015	2022	2022	finally
    //   2015	2022	2015	java/lang/IndexOutOfBoundsException
    //   2015	2022	3	finally
    //   2016	2022	3	finally
    //   2016	2022	2015	finally
    //   2087	2094	2094	finally
    //   2087	2094	2087	java/util/ConcurrentModificationException
    //   2088	2094	2094	java/lang/IllegalArgumentException
    //   2088	2094	2094	java/lang/UnsupportedOperationException
    //   2088	2094	2094	java/lang/EnumConstantNotPresentException
    //   2687	2694	2694	finally
    //   2687	2694	2694	java/lang/IndexOutOfBoundsException
    //   2687	2694	2687	java/lang/IllegalStateException
    //   2687	2694	3	finally
    //   2688	2694	3	finally
    //   3219	3226	3226	finally
    //   3219	3226	3219	java/lang/ArithmeticException
    //   3219	3226	3219	finally
    //   3220	3226	3219	finally
    //   3220	3226	3226	java/lang/IndexOutOfBoundsException
    //   3337	3345	3337	java/lang/NullPointerException
    //   3353	3355	3	java/lang/ClassCastException
  }
  
  public static boolean canBreak(BlockPos paramBlockPos) {
    return Perry1.6i(null, (int)-15574885L ^ 0xA4943C0D, paramBlockPos);
  }
  
  public static WurstplusThreeBlockUtil$ValidResult valid(BlockPos pos) {
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
  
  public static int isPositionPlaceable(BlockPos pos, boolean rayTrace, boolean entityCheck) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3744
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3736
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3728
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -465174553
    //   33: l2i
    //   34: ldc_w -2057524553
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1351545771
    //   44: l2i
    //   45: ldc_w 1194620840
    //   48: ixor
    //   49: ldc2_w 868101280
    //   52: l2i
    //   53: ldc_w -1450211543
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 3659, -81199399 -> 41, 1920258164 -> 84
    //   84: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.1 : I
    //   90: ifeq -> 104
    //   93: ldc2_w -544649830
    //   96: l2i
    //   97: ldc_w 617191779
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 1447709625
    //   107: l2i
    //   108: ldc_w 708742303
    //   111: ixor
    //   112: ldc2_w 522208157
    //   115: l2i
    //   116: ldc_w -1235105988
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 3711, -717929593 -> 148, 1375817816 -> 104
    //   148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w -1020235375
    //   160: l2i
    //   161: ldc_w 1727226161
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 478224663
    //   171: l2i
    //   172: ldc_w 688093332
    //   175: ixor
    //   176: ldc2_w -1612539774
    //   179: l2i
    //   180: ldc_w -1273239129
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, -1908776571 -> 3663, 1064252703 -> 168
    //   212: aload_0
    //   213: getstatic Perryc.1 : I
    //   216: ifeq -> 230
    //   219: ldc2_w -1217246131
    //   222: l2i
    //   223: ldc_w -227892028
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w -711149730
    //   233: l2i
    //   234: ldc_w 1117799697
    //   237: ixor
    //   238: ldc2_w -19828252
    //   241: l2i
    //   242: ldc_w 1819719075
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 3651, -675337010 -> 230, 94057992 -> 272
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   279: goto -> 283
    //   282: athrow
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 886244522
    //   292: l2i
    //   293: ldc_w -112806549
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 232425116
    //   303: l2i
    //   304: ldc_w 1405828346
    //   307: ixor
    //   308: ldc2_w -2125946609
    //   311: l2i
    //   312: ldc_w -1415587067
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 3687, -415052853 -> 300, 1959182444 -> 344
    //   344: goto -> 348
    //   347: athrow
    //   348: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   353: goto -> 357
    //   356: athrow
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 374
    //   363: ldc2_w -638903907
    //   366: l2i
    //   367: ldc_w 23351637
    //   370: ixor
    //   371: goto -> 382
    //   374: ldc2_w -495666834
    //   377: l2i
    //   378: ldc_w 1583054303
    //   381: ixor
    //   382: ldc2_w -1941536873
    //   385: l2i
    //   386: ldc_w -1081192180
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 416, -347642285 -> 3701, -327012066 -> 374
    //   416: astore_3
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 434
    //   423: ldc2_w -442670829
    //   426: l2i
    //   427: ldc_w -1656147577
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w -193102478
    //   437: l2i
    //   438: ldc_w -367796209
    //   441: ixor
    //   442: ldc2_w 902665399
    //   445: l2i
    //   446: ldc_w -647332220
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 476, -1804354905 -> 3633, 49445585 -> 434
    //   476: aload_3
    //   477: instanceof net/minecraft/block/BlockAir
    //   480: ifne -> 494
    //   483: ldc2_w 1060912350
    //   486: l2i
    //   487: ldc_w -81190689
    //   490: ixor
    //   491: goto -> 502
    //   494: ldc2_w -2007063016
    //   497: l2i
    //   498: ldc_w 1280031254
    //   501: ixor
    //   502: ldc2_w 202457789
    //   505: l2i
    //   506: ldc_w -1202232869
    //   509: ixor
    //   510: ixor
    //   511: tableswitch default -> 483, 1884503911 -> 532, 1884503912 -> 1121
    //   532: getstatic Perryc.0 : I
    //   535: ifle -> 549
    //   538: ldc2_w 983475461
    //   541: l2i
    //   542: ldc_w -589589852
    //   545: ixor
    //   546: goto -> 557
    //   549: ldc2_w 737338776
    //   552: l2i
    //   553: ldc_w 2054149511
    //   556: ixor
    //   557: ldc2_w 1826643139
    //   560: l2i
    //   561: ldc_w 969558914
    //   564: ixor
    //   565: ixor
    //   566: lookupswitch default -> 592, -1284562720 -> 3683, 648036789 -> 549
    //   592: aload_3
    //   593: instanceof net/minecraft/block/BlockLiquid
    //   596: ifne -> 610
    //   599: ldc2_w -993698921
    //   602: l2i
    //   603: ldc_w 122669588
    //   606: ixor
    //   607: goto -> 618
    //   610: ldc2_w 697534250
    //   613: l2i
    //   614: ldc_w -367454550
    //   617: ixor
    //   618: ldc2_w 511791950
    //   621: l2i
    //   622: ldc_w 2105431444
    //   625: ixor
    //   626: ixor
    //   627: tableswitch default -> 599, -1602906279 -> 648, -1602906278 -> 1121
    //   648: getstatic Perryc.0 : I
    //   651: ifle -> 665
    //   654: ldc2_w 1954529624
    //   657: l2i
    //   658: ldc_w -1069784960
    //   661: ixor
    //   662: goto -> 673
    //   665: ldc2_w 2050874287
    //   668: l2i
    //   669: ldc_w -670639566
    //   672: ixor
    //   673: ldc2_w -47104242
    //   676: l2i
    //   677: ldc_w 1829647701
    //   680: ixor
    //   681: ixor
    //   682: lookupswitch default -> 708, 612150147 -> 3699, 1006980865 -> 665
    //   708: aload_3
    //   709: instanceof net/minecraft/block/BlockTallGrass
    //   712: ifne -> 726
    //   715: ldc2_w 413185895
    //   718: l2i
    //   719: ldc_w -1907535412
    //   722: ixor
    //   723: goto -> 734
    //   726: ldc2_w -938989521
    //   729: l2i
    //   730: ldc_w 1592118917
    //   733: ixor
    //   734: ldc2_w -1354578160
    //   737: l2i
    //   738: ldc_w 440699361
    //   741: ixor
    //   742: ixor
    //   743: tableswitch default -> 715, 602646618 -> 764, 602646619 -> 1121
    //   764: getstatic Perryc.c : I
    //   767: iflt -> 781
    //   770: ldc2_w -1230311993
    //   773: l2i
    //   774: ldc_w -377638763
    //   777: ixor
    //   778: goto -> 789
    //   781: ldc2_w -967721406
    //   784: l2i
    //   785: ldc_w -1755815047
    //   788: ixor
    //   789: ldc2_w -1165717066
    //   792: l2i
    //   793: ldc_w -2063911420
    //   796: ixor
    //   797: ixor
    //   798: lookupswitch default -> 824, -62302989 -> 781, 1638464224 -> 3685
    //   824: aload_3
    //   825: instanceof net/minecraft/block/BlockFire
    //   828: ifne -> 842
    //   831: ldc2_w 742415779
    //   834: l2i
    //   835: ldc_w -275478490
    //   838: ixor
    //   839: goto -> 850
    //   842: ldc2_w -1552076243
    //   845: l2i
    //   846: ldc_w 1621747639
    //   849: ixor
    //   850: ldc2_w -228227244
    //   853: l2i
    //   854: ldc_w 1248836094
    //   857: ixor
    //   858: ixor
    //   859: tableswitch default -> 831, 2078206767 -> 880, 2078206768 -> 1121
    //   880: getstatic Perryc.c : I
    //   883: iflt -> 897
    //   886: ldc2_w -1017802032
    //   889: l2i
    //   890: ldc_w 83255849
    //   893: ixor
    //   894: goto -> 905
    //   897: ldc2_w -1892224054
    //   900: l2i
    //   901: ldc_w -575918437
    //   904: ixor
    //   905: ldc2_w -535794963
    //   908: l2i
    //   909: ldc_w -354712173
    //   912: ixor
    //   913: ixor
    //   914: lookupswitch default -> 940, -848814201 -> 3653, 1933411947 -> 897
    //   940: aload_3
    //   941: instanceof net/minecraft/block/BlockDeadBush
    //   944: ifne -> 958
    //   947: ldc2_w 1015698025
    //   950: l2i
    //   951: ldc_w 2145390405
    //   954: ixor
    //   955: goto -> 966
    //   958: ldc2_w 50617662
    //   961: l2i
    //   962: ldc_w 1080950803
    //   965: ixor
    //   966: ldc2_w 943857094
    //   969: l2i
    //   970: ldc_w -265809616
    //   973: ixor
    //   974: ixor
    //   975: tableswitch default -> 947, -1962913318 -> 996, -1962913317 -> 1121
    //   996: getstatic Perryc.1 : I
    //   999: ifeq -> 1013
    //   1002: ldc2_w 870648146
    //   1005: l2i
    //   1006: ldc_w -461820085
    //   1009: ixor
    //   1010: goto -> 1021
    //   1013: ldc2_w -1799855943
    //   1016: l2i
    //   1017: ldc_w 99966493
    //   1020: ixor
    //   1021: ldc2_w 412771365
    //   1024: l2i
    //   1025: ldc_w -928291932
    //   1028: ixor
    //   1029: ixor
    //   1030: lookupswitch default -> 3677, 128786840 -> 1013, 1098660133 -> 1056
    //   1056: aload_3
    //   1057: instanceof net/minecraft/block/BlockSnow
    //   1060: ifne -> 1074
    //   1063: ldc2_w -233990221
    //   1066: l2i
    //   1067: ldc_w 119616217
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w -1717516125
    //   1077: l2i
    //   1078: ldc_w 1821142472
    //   1081: ixor
    //   1082: ldc2_w -244948042
    //   1085: l2i
    //   1086: ldc_w -54000148
    //   1089: ixor
    //   1090: ixor
    //   1091: tableswitch default -> 1063, -125648080 -> 1112, -125648079 -> 1121
    //   1112: ldc2_w 1189484830
    //   1115: l2i
    //   1116: ldc_w 1189484830
    //   1119: ixor
    //   1120: ireturn
    //   1121: getstatic Perryc.1 : I
    //   1124: ifeq -> 1138
    //   1127: ldc2_w 1374699263
    //   1130: l2i
    //   1131: ldc_w -871895151
    //   1134: ixor
    //   1135: goto -> 1146
    //   1138: ldc2_w -425068257
    //   1141: l2i
    //   1142: ldc_w 186992175
    //   1145: ixor
    //   1146: ldc2_w -2135711492
    //   1149: l2i
    //   1150: ldc_w -1993589303
    //   1153: ixor
    //   1154: ixor
    //   1155: lookupswitch default -> 3637, -1805104037 -> 1138, -468508155 -> 1180
    //   1180: aload_0
    //   1181: getstatic Perryc.c : I
    //   1184: iflt -> 1198
    //   1187: ldc2_w -795780462
    //   1190: l2i
    //   1191: ldc_w 1570708216
    //   1194: ixor
    //   1195: goto -> 1206
    //   1198: ldc2_w -2112842155
    //   1201: l2i
    //   1202: ldc_w 682011497
    //   1205: ixor
    //   1206: ldc2_w -123564356
    //   1209: l2i
    //   1210: ldc_w 1103534730
    //   1213: ixor
    //   1214: ixor
    //   1215: lookupswitch default -> 3715, 332540170 -> 1240, 879383644 -> 1198
    //   1240: iload_1
    //   1241: ldc_w 2.5311922E38
    //   1244: invokestatic floatToIntBits : (F)I
    //   1247: ldc_w 2134797565
    //   1250: ixor
    //   1251: invokestatic intBitsToFloat : (I)F
    //   1254: getstatic Perryc.0 : I
    //   1257: ifle -> 1271
    //   1260: ldc2_w 951675906
    //   1263: l2i
    //   1264: ldc_w 759538488
    //   1267: ixor
    //   1268: goto -> 1279
    //   1271: ldc2_w 2059627698
    //   1274: l2i
    //   1275: ldc_w -1600174230
    //   1278: ixor
    //   1279: ldc2_w 1435302762
    //   1282: l2i
    //   1283: ldc_w 1897672039
    //   1286: ixor
    //   1287: ixor
    //   1288: lookupswitch default -> 1316, -187897696 -> 1271, 829167927 -> 3673
    //   1316: goto -> 1320
    //   1319: athrow
    //   1320: invokestatic rayTracePlaceCheck : (Lnet/minecraft/util/math/BlockPos;ZF)Z
    //   1323: goto -> 1327
    //   1326: athrow
    //   1327: ifne -> 1341
    //   1330: ldc2_w -845952364
    //   1333: l2i
    //   1334: ldc_w 1919454735
    //   1337: ixor
    //   1338: goto -> 1349
    //   1341: ldc2_w 516133711
    //   1344: l2i
    //   1345: ldc_w -1590110251
    //   1348: ixor
    //   1349: ldc2_w -899280026
    //   1352: l2i
    //   1353: ldc_w -1754185833
    //   1356: ixor
    //   1357: ixor
    //   1358: tableswitch default -> 1330, -487823254 -> 1380, -487823253 -> 1389
    //   1380: ldc2_w 1679659343
    //   1383: l2i
    //   1384: ldc_w -1679659344
    //   1387: ixor
    //   1388: ireturn
    //   1389: getstatic Perryc.c : I
    //   1392: iflt -> 1406
    //   1395: ldc2_w 1312922868
    //   1398: l2i
    //   1399: ldc_w -1186168192
    //   1402: ixor
    //   1403: goto -> 1414
    //   1406: ldc2_w -1475691081
    //   1409: l2i
    //   1410: ldc_w -471750566
    //   1413: ixor
    //   1414: ldc2_w 174571049
    //   1417: l2i
    //   1418: ldc_w -1117741969
    //   1421: ixor
    //   1422: ixor
    //   1423: lookupswitch default -> 3709, -51628117 -> 1448, 1074412594 -> 1406
    //   1448: iload_2
    //   1449: ifeq -> 1463
    //   1452: ldc2_w 292976912
    //   1455: l2i
    //   1456: ldc_w 1026767726
    //   1459: ixor
    //   1460: goto -> 1471
    //   1463: ldc2_w -712991936
    //   1466: l2i
    //   1467: ldc_w -104474307
    //   1470: ixor
    //   1471: ldc2_w -1157456973
    //   1474: l2i
    //   1475: ldc_w -847546924
    //   1478: ixor
    //   1479: ixor
    //   1480: tableswitch default -> 1452, 1513925657 -> 1504, 1513925658 -> 2628
    //   1504: getstatic Perryc.0 : I
    //   1507: ifle -> 1521
    //   1510: ldc2_w -931642314
    //   1513: l2i
    //   1514: ldc_w 403640667
    //   1517: ixor
    //   1518: goto -> 1529
    //   1521: ldc2_w 682074090
    //   1524: l2i
    //   1525: ldc_w -1469261154
    //   1528: ixor
    //   1529: ldc2_w -33842005
    //   1532: l2i
    //   1533: ldc_w 682330754
    //   1536: ixor
    //   1537: ixor
    //   1538: lookupswitch default -> 1564, 86459204 -> 3639, 993976744 -> 1521
    //   1564: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1567: getstatic Perryc.1 : I
    //   1570: ifeq -> 1584
    //   1573: ldc2_w -868536473
    //   1576: l2i
    //   1577: ldc_w 291893705
    //   1580: ixor
    //   1581: goto -> 1592
    //   1584: ldc2_w -1825534775
    //   1587: l2i
    //   1588: ldc_w 975294544
    //   1591: ixor
    //   1592: ldc2_w -783053169
    //   1595: l2i
    //   1596: ldc_w -1562841210
    //   1599: ixor
    //   1600: ixor
    //   1601: lookupswitch default -> 3657, -1361723481 -> 1584, -627425904 -> 1628
    //   1628: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1631: ldc_w net/minecraft/entity/Entity
    //   1634: new net/minecraft/util/math/AxisAlignedBB
    //   1637: dup
    //   1638: getstatic Perryc.1 : I
    //   1641: ifeq -> 1655
    //   1644: ldc2_w 1438986998
    //   1647: l2i
    //   1648: ldc_w -1510014162
    //   1651: ixor
    //   1652: goto -> 1663
    //   1655: ldc2_w 1710432012
    //   1658: l2i
    //   1659: ldc_w -463941730
    //   1662: ixor
    //   1663: ldc2_w 1756599642
    //   1666: l2i
    //   1667: ldc_w -1698101065
    //   1670: ixor
    //   1671: ixor
    //   1672: lookupswitch default -> 3693, 37792821 -> 1655, 1943096703 -> 1700
    //   1700: aload_0
    //   1701: getstatic Perryc.0 : I
    //   1704: ifle -> 1718
    //   1707: ldc2_w -1892249390
    //   1710: l2i
    //   1711: ldc_w 444250696
    //   1714: ixor
    //   1715: goto -> 1726
    //   1718: ldc2_w -1505277552
    //   1721: l2i
    //   1722: ldc_w 784815353
    //   1725: ixor
    //   1726: ldc2_w 1197318388
    //   1729: l2i
    //   1730: ldc_w -399712972
    //   1733: ixor
    //   1734: ixor
    //   1735: lookupswitch default -> 3679, 670130345 -> 1760, 977098586 -> 1718
    //   1760: goto -> 1764
    //   1763: athrow
    //   1764: invokespecial <init> : (Lnet/minecraft/util/math/BlockPos;)V
    //   1767: goto -> 1771
    //   1770: athrow
    //   1771: getstatic Perryc.0 : I
    //   1774: ifle -> 1788
    //   1777: ldc2_w 469631040
    //   1780: l2i
    //   1781: ldc_w -1282962255
    //   1784: ixor
    //   1785: goto -> 1796
    //   1788: ldc2_w 710822428
    //   1791: l2i
    //   1792: ldc_w 1833347853
    //   1795: ixor
    //   1796: ldc2_w 1853197409
    //   1799: l2i
    //   1800: ldc_w -255903267
    //   1803: ixor
    //   1804: ixor
    //   1805: lookupswitch default -> 1832, 426960780 -> 1788, 917715277 -> 3641
    //   1832: goto -> 1836
    //   1835: athrow
    //   1836: invokevirtual func_72872_a : (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   1839: goto -> 1843
    //   1842: athrow
    //   1843: getstatic Perryc.c : I
    //   1846: iflt -> 1860
    //   1849: ldc2_w 807428273
    //   1852: l2i
    //   1853: ldc_w 1508126154
    //   1856: ixor
    //   1857: goto -> 1868
    //   1860: ldc2_w 384474768
    //   1863: l2i
    //   1864: ldc_w 131112666
    //   1867: ixor
    //   1868: ldc2_w -303970199
    //   1871: l2i
    //   1872: ldc_w 614095247
    //   1875: ixor
    //   1876: ixor
    //   1877: lookupswitch default -> 1904, -1598038883 -> 3697, -1496557141 -> 1860
    //   1904: goto -> 1908
    //   1907: athrow
    //   1908: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1913: goto -> 1917
    //   1916: athrow
    //   1917: getstatic Perryc.c : I
    //   1920: iflt -> 1934
    //   1923: ldc2_w -1251544404
    //   1926: l2i
    //   1927: ldc_w -271478727
    //   1930: ixor
    //   1931: goto -> 1942
    //   1934: ldc2_w -293390390
    //   1937: l2i
    //   1938: ldc_w 268104926
    //   1941: ixor
    //   1942: ldc2_w 343910634
    //   1945: l2i
    //   1946: ldc_w 371082138
    //   1949: ixor
    //   1950: ixor
    //   1951: lookupswitch default -> 1976, 665265115 -> 1934, 1490455013 -> 3691
    //   1976: astore #4
    //   1978: getstatic Perryc.c : I
    //   1981: iflt -> 1995
    //   1984: ldc2_w 1632026866
    //   1987: l2i
    //   1988: ldc_w -2055052836
    //   1991: ixor
    //   1992: goto -> 2003
    //   1995: ldc2_w 630314543
    //   1998: l2i
    //   1999: ldc_w 715458570
    //   2002: ixor
    //   2003: ldc2_w 1056088007
    //   2006: l2i
    //   2007: ldc_w -617210079
    //   2010: ixor
    //   2011: ixor
    //   2012: lookupswitch default -> 3703, -353345853 -> 2040, 16785864 -> 1995
    //   2040: aload #4
    //   2042: getstatic Perryc.c : I
    //   2045: iflt -> 2059
    //   2048: ldc2_w 1439623727
    //   2051: l2i
    //   2052: ldc_w -1284959595
    //   2055: ixor
    //   2056: goto -> 2067
    //   2059: ldc2_w 169640229
    //   2062: l2i
    //   2063: ldc_w 1169313295
    //   2066: ixor
    //   2067: ldc2_w -119738603
    //   2070: l2i
    //   2071: ldc_w 1847056279
    //   2074: ixor
    //   2075: ixor
    //   2076: lookupswitch default -> 3645, -647628888 -> 2104, 1886175288 -> 2059
    //   2104: goto -> 2108
    //   2107: athrow
    //   2108: invokeinterface hasNext : ()Z
    //   2113: goto -> 2117
    //   2116: athrow
    //   2117: ifeq -> 2131
    //   2120: ldc2_w -198611421
    //   2123: l2i
    //   2124: ldc_w -1032682129
    //   2127: ixor
    //   2128: goto -> 2139
    //   2131: ldc2_w -580228011
    //   2134: l2i
    //   2135: ldc_w -349075686
    //   2138: ixor
    //   2139: ldc2_w 1881719177
    //   2142: l2i
    //   2143: ldc_w 2128473472
    //   2146: ixor
    //   2147: ixor
    //   2148: tableswitch default -> 2120, 950978373 -> 2172, 950978374 -> 2628
    //   2172: getstatic Perryc.1 : I
    //   2175: ifeq -> 2189
    //   2178: ldc2_w -2079013720
    //   2181: l2i
    //   2182: ldc_w 1909472885
    //   2185: ixor
    //   2186: goto -> 2197
    //   2189: ldc2_w -141063215
    //   2192: l2i
    //   2193: ldc_w -307879959
    //   2196: ixor
    //   2197: ldc2_w -719261244
    //   2200: l2i
    //   2201: ldc_w -1360651332
    //   2204: ixor
    //   2205: ixor
    //   2206: lookupswitch default -> 3707, -1912467291 -> 2189, 1643609664 -> 2232
    //   2232: aload #4
    //   2234: getstatic Perryc.0 : I
    //   2237: ifle -> 2251
    //   2240: ldc2_w -22316003
    //   2243: l2i
    //   2244: ldc_w 1577503105
    //   2247: ixor
    //   2248: goto -> 2259
    //   2251: ldc2_w 794852127
    //   2254: l2i
    //   2255: ldc_w 2053464791
    //   2258: ixor
    //   2259: ldc2_w 637221264
    //   2262: l2i
    //   2263: ldc_w 1937910618
    //   2266: ixor
    //   2267: ixor
    //   2268: lookupswitch default -> 3655, -153835690 -> 2251, 58460930 -> 2296
    //   2296: goto -> 2300
    //   2299: athrow
    //   2300: invokeinterface next : ()Ljava/lang/Object;
    //   2305: goto -> 2309
    //   2308: athrow
    //   2309: checkcast net/minecraft/entity/Entity
    //   2312: getstatic Perryc.0 : I
    //   2315: ifle -> 2329
    //   2318: ldc2_w -934098210
    //   2321: l2i
    //   2322: ldc_w 256277825
    //   2325: ixor
    //   2326: goto -> 2337
    //   2329: ldc2_w -1503339329
    //   2332: l2i
    //   2333: ldc_w 1735924899
    //   2336: ixor
    //   2337: ldc2_w -571615287
    //   2340: l2i
    //   2341: ldc_w -674139903
    //   2344: ixor
    //   2345: ixor
    //   2346: lookupswitch default -> 2372, -853012137 -> 3695, -763038243 -> 2329
    //   2372: astore #5
    //   2374: getstatic Perryc.c : I
    //   2377: iflt -> 2391
    //   2380: ldc2_w 1555614407
    //   2383: l2i
    //   2384: ldc_w 1072414531
    //   2387: ixor
    //   2388: goto -> 2399
    //   2391: ldc2_w -521425224
    //   2394: l2i
    //   2395: ldc_w 2027219728
    //   2398: ixor
    //   2399: ldc2_w -1989571106
    //   2402: l2i
    //   2403: ldc_w 48174563
    //   2406: ixor
    //   2407: ixor
    //   2408: lookupswitch default -> 2436, -2061614761 -> 2391, -387584583 -> 3705
    //   2436: aload #5
    //   2438: instanceof net/minecraft/entity/item/EntityItem
    //   2441: ifne -> 2455
    //   2444: ldc2_w 1886398303
    //   2447: l2i
    //   2448: ldc_w -1669868336
    //   2451: ixor
    //   2452: goto -> 2463
    //   2455: ldc2_w -1125186789
    //   2458: l2i
    //   2459: ldc_w 1357443219
    //   2462: ixor
    //   2463: ldc2_w -409430392
    //   2466: l2i
    //   2467: ldc_w -108889020
    //   2470: ixor
    //   2471: ixor
    //   2472: tableswitch default -> 2444, -232974013 -> 2496, -232974012 -> 1978
    //   2496: getstatic Perryc.1 : I
    //   2499: ifeq -> 2513
    //   2502: ldc2_w 28748850
    //   2505: l2i
    //   2506: ldc_w 601133648
    //   2509: ixor
    //   2510: goto -> 2521
    //   2513: ldc2_w -406637857
    //   2516: l2i
    //   2517: ldc_w -29871820
    //   2520: ixor
    //   2521: ldc2_w -2122539625
    //   2524: l2i
    //   2525: ldc_w 1593863015
    //   2528: ixor
    //   2529: ixor
    //   2530: lookupswitch default -> 3647, -947391205 -> 2556, -65091438 -> 2513
    //   2556: aload #5
    //   2558: instanceof net/minecraft/entity/item/EntityXPOrb
    //   2561: ifeq -> 2575
    //   2564: ldc2_w 305442499
    //   2567: l2i
    //   2568: ldc_w 304443358
    //   2571: ixor
    //   2572: goto -> 2583
    //   2575: ldc2_w 1403711550
    //   2578: l2i
    //   2579: ldc_w 1404776738
    //   2582: ixor
    //   2583: ldc2_w -538610365
    //   2586: l2i
    //   2587: ldc_w 538459954
    //   2590: ixor
    //   2591: ixor
    //   2592: tableswitch default -> 2564, -1275028 -> 2616, -1275027 -> 2619
    //   2616: goto -> 1978
    //   2619: ldc2_w 1449164934
    //   2622: l2i
    //   2623: ldc_w 1449164935
    //   2626: ixor
    //   2627: ireturn
    //   2628: getstatic Perryc.0 : I
    //   2631: ifle -> 2645
    //   2634: ldc2_w -81957540
    //   2637: l2i
    //   2638: ldc_w 289507741
    //   2641: ixor
    //   2642: goto -> 2653
    //   2645: ldc2_w -1453287580
    //   2648: l2i
    //   2649: ldc_w -1356677059
    //   2652: ixor
    //   2653: ldc2_w 283551848
    //   2656: l2i
    //   2657: ldc_w -505197923
    //   2660: ixor
    //   2661: ixor
    //   2662: lookupswitch default -> 2688, 458819124 -> 3643, 1688238481 -> 2645
    //   2688: aload_0
    //   2689: getstatic Perryc.0 : I
    //   2692: ifle -> 2706
    //   2695: ldc2_w -1244503
    //   2698: l2i
    //   2699: ldc_w 1594430573
    //   2702: ixor
    //   2703: goto -> 2714
    //   2706: ldc2_w -1227213284
    //   2709: l2i
    //   2710: ldc_w 1711808946
    //   2713: ixor
    //   2714: ldc2_w -436255407
    //   2717: l2i
    //   2718: ldc_w 149984988
    //   2721: ixor
    //   2722: ixor
    //   2723: lookupswitch default -> 2748, 1284699345 -> 2706, 1307297097 -> 3649
    //   2748: goto -> 2752
    //   2751: athrow
    //   2752: invokestatic getPossibleSides : (Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;
    //   2755: goto -> 2759
    //   2758: athrow
    //   2759: getstatic Perryc.0 : I
    //   2762: ifle -> 2776
    //   2765: ldc2_w 196537509
    //   2768: l2i
    //   2769: ldc_w 1397348998
    //   2772: ixor
    //   2773: goto -> 2784
    //   2776: ldc2_w 98941188
    //   2779: l2i
    //   2780: ldc_w -468313820
    //   2783: ixor
    //   2784: ldc2_w -502407653
    //   2787: l2i
    //   2788: ldc_w 1773140365
    //   2791: ixor
    //   2792: ixor
    //   2793: lookupswitch default -> 3681, -748875339 -> 2776, 1783728054 -> 2820
    //   2820: goto -> 2824
    //   2823: athrow
    //   2824: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2829: goto -> 2833
    //   2832: athrow
    //   2833: getstatic Perryc.c : I
    //   2836: iflt -> 2850
    //   2839: ldc2_w 2084604207
    //   2842: l2i
    //   2843: ldc_w -542558846
    //   2846: ixor
    //   2847: goto -> 2858
    //   2850: ldc2_w 772827942
    //   2853: l2i
    //   2854: ldc_w -985345750
    //   2857: ixor
    //   2858: ldc2_w 1419361292
    //   2861: l2i
    //   2862: ldc_w -1832106980
    //   2865: ixor
    //   2866: ixor
    //   2867: lookupswitch default -> 2892, -614454004 -> 2850, 1706837181 -> 3669
    //   2892: astore #4
    //   2894: getstatic Perryc.c : I
    //   2897: iflt -> 2911
    //   2900: ldc2_w -510004117
    //   2903: l2i
    //   2904: ldc_w 628760904
    //   2907: ixor
    //   2908: goto -> 2919
    //   2911: ldc2_w 696977392
    //   2914: l2i
    //   2915: ldc_w 1601549741
    //   2918: ixor
    //   2919: ldc2_w 1606608884
    //   2922: l2i
    //   2923: ldc_w 1993783393
    //   2926: ixor
    //   2927: ixor
    //   2928: lookupswitch default -> 3689, -302544202 -> 2911, 1609231816 -> 2956
    //   2956: aload #4
    //   2958: getstatic Perryc.1 : I
    //   2961: ifeq -> 2975
    //   2964: ldc2_w -2019673538
    //   2967: l2i
    //   2968: ldc_w -828185087
    //   2971: ixor
    //   2972: goto -> 2983
    //   2975: ldc2_w -622567952
    //   2978: l2i
    //   2979: ldc_w 1681685560
    //   2982: ixor
    //   2983: ldc2_w 1852025093
    //   2986: l2i
    //   2987: ldc_w 1269250549
    //   2990: ixor
    //   2991: ixor
    //   2992: lookupswitch default -> 3713, -1692618440 -> 3020, 1828211919 -> 2975
    //   3020: goto -> 3024
    //   3023: athrow
    //   3024: invokeinterface hasNext : ()Z
    //   3029: goto -> 3033
    //   3032: athrow
    //   3033: ifeq -> 3047
    //   3036: ldc2_w -1974646990
    //   3039: l2i
    //   3040: ldc_w -698723863
    //   3043: ixor
    //   3044: goto -> 3055
    //   3047: ldc2_w 158378226
    //   3050: l2i
    //   3051: ldc_w 1432862248
    //   3054: ixor
    //   3055: ldc2_w -100667625
    //   3058: l2i
    //   3059: ldc_w -2100298384
    //   3062: ixor
    //   3063: ixor
    //   3064: tableswitch default -> 3036, 656868540 -> 3088, 656868541 -> 3624
    //   3088: getstatic Perryc.1 : I
    //   3091: ifeq -> 3105
    //   3094: ldc2_w 1344738219
    //   3097: l2i
    //   3098: ldc_w -1005524358
    //   3101: ixor
    //   3102: goto -> 3113
    //   3105: ldc2_w 1067084847
    //   3108: l2i
    //   3109: ldc_w 1865459402
    //   3112: ixor
    //   3113: ldc2_w 1313755891
    //   3116: l2i
    //   3117: ldc_w 1664316618
    //   3120: ixor
    //   3121: ixor
    //   3122: lookupswitch default -> 3148, -1186275352 -> 3667, 1831406820 -> 3105
    //   3148: aload #4
    //   3150: getstatic Perryc.0 : I
    //   3153: ifle -> 3167
    //   3156: ldc2_w -1249402283
    //   3159: l2i
    //   3160: ldc_w -1701602788
    //   3163: ixor
    //   3164: goto -> 3175
    //   3167: ldc2_w -255232044
    //   3170: l2i
    //   3171: ldc_w 1429471649
    //   3174: ixor
    //   3175: ldc2_w -237219471
    //   3178: l2i
    //   3179: ldc_w 1716441997
    //   3182: ixor
    //   3183: ixor
    //   3184: lookupswitch default -> 3212, -1199129931 -> 3675, -1099742151 -> 3167
    //   3212: goto -> 3216
    //   3215: athrow
    //   3216: invokeinterface next : ()Ljava/lang/Object;
    //   3221: goto -> 3225
    //   3224: athrow
    //   3225: checkcast net/minecraft/util/EnumFacing
    //   3228: getstatic Perryc.1 : I
    //   3231: ifeq -> 3245
    //   3234: ldc2_w 1282351099
    //   3237: l2i
    //   3238: ldc_w 167033660
    //   3241: ixor
    //   3242: goto -> 3253
    //   3245: ldc2_w -1842827507
    //   3248: l2i
    //   3249: ldc_w 1479945165
    //   3252: ixor
    //   3253: ldc2_w 1964552334
    //   3256: l2i
    //   3257: ldc_w -267160020
    //   3260: ixor
    //   3261: ixor
    //   3262: lookupswitch default -> 3288, -1064279451 -> 3671, 1696451738 -> 3245
    //   3288: astore #5
    //   3290: getstatic Perryc.0 : I
    //   3293: ifle -> 3307
    //   3296: ldc2_w 1915250537
    //   3299: l2i
    //   3300: ldc_w 1477914380
    //   3303: ixor
    //   3304: goto -> 3315
    //   3307: ldc2_w -1528666210
    //   3310: l2i
    //   3311: ldc_w 1703471728
    //   3314: ixor
    //   3315: ldc2_w -493572254
    //   3318: l2i
    //   3319: ldc_w 280451422
    //   3322: ixor
    //   3323: ixor
    //   3324: lookupswitch default -> 3352, -669204903 -> 3717, 978242291 -> 3307
    //   3352: aload_0
    //   3353: getstatic Perryc.0 : I
    //   3356: ifle -> 3370
    //   3359: ldc2_w 145034443
    //   3362: l2i
    //   3363: ldc_w 1150821496
    //   3366: ixor
    //   3367: goto -> 3378
    //   3370: ldc2_w -1102295601
    //   3373: l2i
    //   3374: ldc_w 1424450271
    //   3377: ixor
    //   3378: ldc2_w -1206615173
    //   3381: l2i
    //   3382: ldc_w 194742919
    //   3385: ixor
    //   3386: ixor
    //   3387: lookupswitch default -> 3412, -1821793892 -> 3370, -5103281 -> 3635
    //   3412: aload #5
    //   3414: getstatic Perryc.1 : I
    //   3417: ifeq -> 3431
    //   3420: ldc2_w -1380052697
    //   3423: l2i
    //   3424: ldc_w 331232167
    //   3427: ixor
    //   3428: goto -> 3439
    //   3431: ldc2_w -202537830
    //   3434: l2i
    //   3435: ldc_w -655077052
    //   3438: ixor
    //   3439: ldc2_w 1548465622
    //   3442: l2i
    //   3443: ldc_w -1433487940
    //   3446: ixor
    //   3447: ixor
    //   3448: lookupswitch default -> 3476, 1220879082 -> 3661, 1572127195 -> 3431
    //   3476: goto -> 3480
    //   3479: athrow
    //   3480: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   3483: goto -> 3487
    //   3486: athrow
    //   3487: getstatic Perryc.0 : I
    //   3490: ifle -> 3504
    //   3493: ldc2_w 1605238043
    //   3496: l2i
    //   3497: ldc_w 1906000894
    //   3500: ixor
    //   3501: goto -> 3512
    //   3504: ldc2_w -1133983604
    //   3507: l2i
    //   3508: ldc_w -976855512
    //   3511: ixor
    //   3512: ldc2_w -1585566075
    //   3515: l2i
    //   3516: ldc_w 984175305
    //   3519: ixor
    //   3520: ixor
    //   3521: lookupswitch default -> 3665, -1243495767 -> 3504, -495326488 -> 3548
    //   3548: goto -> 3552
    //   3551: athrow
    //   3552: invokestatic canBeClicked : (Lnet/minecraft/util/math/BlockPos;)Z
    //   3555: goto -> 3559
    //   3558: athrow
    //   3559: ifne -> 3573
    //   3562: ldc2_w -927977693
    //   3565: l2i
    //   3566: ldc_w 1185885689
    //   3569: ixor
    //   3570: goto -> 3581
    //   3573: ldc2_w 1201585488
    //   3576: l2i
    //   3577: ldc_w -914243701
    //   3580: ixor
    //   3581: ldc2_w -773757303
    //   3584: l2i
    //   3585: ldc_w -1009732439
    //   3588: ixor
    //   3589: ixor
    //   3590: tableswitch default -> 3562, -1674653446 -> 3612, -1674653445 -> 3615
    //   3612: goto -> 2894
    //   3615: ldc2_w 1598741198
    //   3618: l2i
    //   3619: ldc_w 1598741197
    //   3622: ixor
    //   3623: ireturn
    //   3624: ldc2_w -1363753484
    //   3627: l2i
    //   3628: ldc_w -1363753482
    //   3631: ixor
    //   3632: ireturn
    //   3633: aconst_null
    //   3634: athrow
    //   3635: aconst_null
    //   3636: athrow
    //   3637: aconst_null
    //   3638: athrow
    //   3639: aconst_null
    //   3640: athrow
    //   3641: aconst_null
    //   3642: athrow
    //   3643: aconst_null
    //   3644: athrow
    //   3645: aconst_null
    //   3646: athrow
    //   3647: aconst_null
    //   3648: athrow
    //   3649: aconst_null
    //   3650: athrow
    //   3651: aconst_null
    //   3652: athrow
    //   3653: aconst_null
    //   3654: athrow
    //   3655: aconst_null
    //   3656: athrow
    //   3657: aconst_null
    //   3658: athrow
    //   3659: aconst_null
    //   3660: athrow
    //   3661: aconst_null
    //   3662: athrow
    //   3663: aconst_null
    //   3664: athrow
    //   3665: aconst_null
    //   3666: athrow
    //   3667: aconst_null
    //   3668: athrow
    //   3669: aconst_null
    //   3670: athrow
    //   3671: aconst_null
    //   3672: athrow
    //   3673: aconst_null
    //   3674: athrow
    //   3675: aconst_null
    //   3676: athrow
    //   3677: aconst_null
    //   3678: athrow
    //   3679: aconst_null
    //   3680: athrow
    //   3681: aconst_null
    //   3682: athrow
    //   3683: aconst_null
    //   3684: athrow
    //   3685: aconst_null
    //   3686: athrow
    //   3687: aconst_null
    //   3688: athrow
    //   3689: aconst_null
    //   3690: athrow
    //   3691: aconst_null
    //   3692: athrow
    //   3693: aconst_null
    //   3694: athrow
    //   3695: aconst_null
    //   3696: athrow
    //   3697: aconst_null
    //   3698: athrow
    //   3699: aconst_null
    //   3700: athrow
    //   3701: aconst_null
    //   3702: athrow
    //   3703: aconst_null
    //   3704: athrow
    //   3705: aconst_null
    //   3706: athrow
    //   3707: aconst_null
    //   3708: athrow
    //   3709: aconst_null
    //   3710: athrow
    //   3711: aconst_null
    //   3712: athrow
    //   3713: aconst_null
    //   3714: athrow
    //   3715: aconst_null
    //   3716: athrow
    //   3717: aconst_null
    //   3718: athrow
    //   3719: pop
    //   3720: goto -> 24
    //   3723: pop
    //   3724: aconst_null
    //   3725: goto -> 3719
    //   3728: dup
    //   3729: ifnull -> 3719
    //   3732: checkcast java/lang/Throwable
    //   3735: athrow
    //   3736: dup
    //   3737: ifnull -> 3723
    //   3740: checkcast java/lang/Throwable
    //   3743: athrow
    //   3744: aconst_null
    //   3745: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2374	254	5	entity	Lnet/minecraft/entity/Entity;
    //   3290	334	5	side	Lnet/minecraft/util/EnumFacing;
    //   24	3609	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	3609	1	rayTrace	Z
    //   24	3609	2	entityCheck	Z
    //   417	3216	3	block	Lnet/minecraft/block/Block;
    // Exception table:
    //   from	to	target	type
    //   8	20	3728	java/lang/ClassCastException
    //   276	282	282	finally
    //   276	282	3	finally
    //   276	282	3	finally
    //   276	282	282	finally
    //   276	282	282	java/lang/UnsupportedOperationException
    //   347	356	356	finally
    //   347	356	3	java/lang/UnsupportedOperationException
    //   348	356	356	java/lang/StringIndexOutOfBoundsException
    //   348	356	347	finally
    //   348	356	347	java/lang/NullPointerException
    //   1320	1326	1326	finally
    //   1320	1326	1326	java/lang/UnsupportedOperationException
    //   1320	1326	1326	finally
    //   1320	1326	1326	finally
    //   1320	1326	3	java/lang/AssertionError
    //   1763	1770	1770	finally
    //   1763	1770	3	java/lang/AssertionError
    //   1763	1770	1763	finally
    //   1764	1770	3	finally
    //   1764	1770	1763	java/lang/RuntimeException
    //   1835	1842	1842	finally
    //   1835	1842	1842	finally
    //   1835	1842	1835	finally
    //   1835	1842	1842	finally
    //   1836	1842	1835	java/lang/EnumConstantNotPresentException
    //   1907	1916	1916	finally
    //   1907	1916	1916	java/util/NoSuchElementException
    //   1907	1916	1907	java/lang/EnumConstantNotPresentException
    //   1908	1916	1907	finally
    //   1908	1916	1907	finally
    //   2107	2116	2116	finally
    //   2107	2116	2107	finally
    //   2107	2116	2107	java/lang/ArithmeticException
    //   2107	2116	2107	finally
    //   2108	2116	2107	finally
    //   2300	2308	2308	finally
    //   2300	2308	2308	finally
    //   2300	2308	3	finally
    //   2300	2308	2308	java/util/NoSuchElementException
    //   2300	2308	3	finally
    //   2751	2758	2758	finally
    //   2751	2758	3	finally
    //   2751	2758	2751	finally
    //   2751	2758	2751	java/lang/IllegalArgumentException
    //   2752	2758	3	finally
    //   2824	2832	2832	finally
    //   2824	2832	3	finally
    //   2824	2832	3	finally
    //   2824	2832	3	finally
    //   2824	2832	3	finally
    //   3024	3032	3032	finally
    //   3024	3032	3032	java/lang/EnumConstantNotPresentException
    //   3024	3032	3	finally
    //   3024	3032	3032	java/util/ConcurrentModificationException
    //   3024	3032	3032	java/lang/ClassCastException
    //   3215	3224	3224	finally
    //   3215	3224	3215	finally
    //   3215	3224	3224	finally
    //   3216	3224	3	finally
    //   3216	3224	3	java/lang/EnumConstantNotPresentException
    //   3479	3486	3486	finally
    //   3479	3486	3486	java/util/ConcurrentModificationException
    //   3479	3486	3479	java/lang/ClassCastException
    //   3479	3486	3	finally
    //   3480	3486	3	finally
    //   3551	3558	3558	finally
    //   3551	3558	3	java/lang/EnumConstantNotPresentException
    //   3551	3558	3558	java/lang/ClassCastException
    //   3552	3558	3551	java/util/ConcurrentModificationException
    //   3552	3558	3551	java/lang/AssertionError
    //   3728	3736	3728	finally
    //   3744	3746	3	java/lang/ArithmeticException
  }
  
  public static boolean canPlaceBlock(BlockPos pos) {
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
  
  public static void rotatePacket(double x, double y, double z) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3033
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3025
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3017
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -2019262031
    //   33: l2i
    //   34: ldc_w -507434162
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1940018950
    //   44: l2i
    //   45: ldc_w 28097625
    //   48: ixor
    //   49: ldc2_w 1596813615
    //   52: l2i
    //   53: ldc_w 556816454
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -447028760 -> 41, 410551190 -> 2928
    //   84: dload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -1067815248
    //   94: l2i
    //   95: ldc_w -759494863
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1082848044
    //   105: l2i
    //   106: ldc_w 237135474
    //   109: ixor
    //   110: ldc2_w 2124701386
    //   113: l2i
    //   114: ldc_w 766835840
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2932, 498611988 -> 144, 1106365387 -> 102
    //   144: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w -524136143
    //   156: l2i
    //   157: ldc_w -1702425397
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -2138228691
    //   167: l2i
    //   168: ldc_w -903738026
    //   171: ixor
    //   172: ldc2_w -1229261236
    //   175: l2i
    //   176: ldc_w -1772418123
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 3000, 1520738307 -> 164, 1783548034 -> 208
    //   208: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w 1034454028
    //   220: l2i
    //   221: ldc_w -1345218894
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w 1621716710
    //   231: l2i
    //   232: ldc_w 1750723513
    //   235: ixor
    //   236: ldc2_w 478171987
    //   239: l2i
    //   240: ldc_w -554338051
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 272, 173782679 -> 228, 1342978320 -> 3006
    //   272: getfield field_70165_t : D
    //   275: dsub
    //   276: getstatic Perryc.1 : I
    //   279: ifeq -> 293
    //   282: ldc2_w -1636058147
    //   285: l2i
    //   286: ldc_w -552564874
    //   289: ixor
    //   290: goto -> 301
    //   293: ldc2_w 2077054040
    //   296: l2i
    //   297: ldc_w -1707793182
    //   300: ixor
    //   301: ldc2_w -1994530284
    //   304: l2i
    //   305: ldc_w -1960546870
    //   308: ixor
    //   309: ixor
    //   310: lookupswitch default -> 336, 1129493365 -> 2980, 1995185035 -> 293
    //   336: dstore #6
    //   338: getstatic Perryc.0 : I
    //   341: ifle -> 355
    //   344: ldc2_w 9480013
    //   347: l2i
    //   348: ldc_w -36313304
    //   351: ixor
    //   352: goto -> 363
    //   355: ldc2_w 1484263540
    //   358: l2i
    //   359: ldc_w 1622101377
    //   362: ixor
    //   363: ldc2_w -860499694
    //   366: l2i
    //   367: ldc_w 1787375640
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 400, -133609774 -> 355, 1534697839 -> 2938
    //   400: dload_2
    //   401: getstatic Perryc.0 : I
    //   404: ifle -> 418
    //   407: ldc2_w 1399127963
    //   410: l2i
    //   411: ldc_w 1310279530
    //   414: ixor
    //   415: goto -> 426
    //   418: ldc2_w 1428365797
    //   421: l2i
    //   422: ldc_w -473112613
    //   425: ixor
    //   426: ldc2_w -1356493458
    //   429: l2i
    //   430: ldc_w 698272540
    //   433: ixor
    //   434: ixor
    //   435: lookupswitch default -> 460, -1681457533 -> 2954, -1071639087 -> 418
    //   460: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   463: getstatic Perryc.c : I
    //   466: iflt -> 480
    //   469: ldc2_w -1019791561
    //   472: l2i
    //   473: ldc_w -1424831633
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w 730084190
    //   483: l2i
    //   484: ldc_w 1432050644
    //   487: ixor
    //   488: ldc2_w 1982557947
    //   491: l2i
    //   492: ldc_w -1054281466
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -551132251 -> 2930, -160337767 -> 480
    //   524: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 544
    //   533: ldc2_w 530084449
    //   536: l2i
    //   537: ldc_w -1965575353
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w 1472730529
    //   547: l2i
    //   548: ldc_w -1667688948
    //   551: ixor
    //   552: ldc2_w -934984819
    //   555: l2i
    //   556: ldc_w -212891160
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 588, -1371206845 -> 2984, -1141703731 -> 544
    //   588: getfield field_70163_u : D
    //   591: getstatic Perryc.c : I
    //   594: iflt -> 608
    //   597: ldc2_w -1522532748
    //   600: l2i
    //   601: ldc_w 1924910432
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 1230862096
    //   611: l2i
    //   612: ldc_w 1341523751
    //   615: ixor
    //   616: ldc2_w -1231955438
    //   619: l2i
    //   620: ldc_w -11881827
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 652, -1637917797 -> 2986, -477498652 -> 608
    //   652: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   655: getstatic Perryc.0 : I
    //   658: ifle -> 672
    //   661: ldc2_w 1711842638
    //   664: l2i
    //   665: ldc_w -801531631
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w -1363017559
    //   675: l2i
    //   676: ldc_w 658955193
    //   679: ixor
    //   680: ldc2_w -278276989
    //   683: l2i
    //   684: ldc_w 786365898
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 2974, 1211363929 -> 716, 2005275926 -> 672
    //   716: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   719: getstatic Perryc.1 : I
    //   722: ifeq -> 736
    //   725: ldc2_w -1798191409
    //   728: l2i
    //   729: ldc_w -328307934
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w -1264953909
    //   739: l2i
    //   740: ldc_w 1049242767
    //   743: ixor
    //   744: ldc2_w -1563048791
    //   747: l2i
    //   748: ldc_w 1204922015
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 780, -1648635941 -> 2982, 2001447393 -> 736
    //   780: goto -> 784
    //   783: athrow
    //   784: invokevirtual func_70047_e : ()F
    //   787: goto -> 791
    //   790: athrow
    //   791: f2d
    //   792: dadd
    //   793: dsub
    //   794: getstatic Perryc.c : I
    //   797: iflt -> 811
    //   800: ldc2_w -1825407133
    //   803: l2i
    //   804: ldc_w -463342600
    //   807: ixor
    //   808: goto -> 819
    //   811: ldc2_w -821678155
    //   814: l2i
    //   815: ldc_w -1824448633
    //   818: ixor
    //   819: ldc2_w 2078182955
    //   822: l2i
    //   823: ldc_w 283269110
    //   826: ixor
    //   827: ixor
    //   828: lookupswitch default -> 2956, 477058374 -> 811, 930867695 -> 856
    //   856: dstore #8
    //   858: getstatic Perryc.1 : I
    //   861: ifeq -> 875
    //   864: ldc2_w -35118003
    //   867: l2i
    //   868: ldc_w -1955467476
    //   871: ixor
    //   872: goto -> 883
    //   875: ldc2_w 1653057975
    //   878: l2i
    //   879: ldc_w 495620177
    //   882: ixor
    //   883: ldc2_w 1788242028
    //   886: l2i
    //   887: ldc_w 556308728
    //   890: ixor
    //   891: ixor
    //   892: lookupswitch default -> 920, -686222858 -> 875, 1025981429 -> 2958
    //   920: dload #4
    //   922: getstatic Perryc.1 : I
    //   925: ifeq -> 939
    //   928: ldc2_w 1446410911
    //   931: l2i
    //   932: ldc_w 1546409845
    //   935: ixor
    //   936: goto -> 947
    //   939: ldc2_w -942585558
    //   942: l2i
    //   943: ldc_w -2145841385
    //   946: ixor
    //   947: ldc2_w -1128588401
    //   950: l2i
    //   951: ldc_w -1272535767
    //   954: ixor
    //   955: ixor
    //   956: lookupswitch default -> 984, -864887001 -> 939, 42439500 -> 2942
    //   984: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   987: getstatic Perryc.1 : I
    //   990: ifeq -> 1004
    //   993: ldc2_w -1179171157
    //   996: l2i
    //   997: ldc_w 1031341865
    //   1000: ixor
    //   1001: goto -> 1012
    //   1004: ldc2_w 704192922
    //   1007: l2i
    //   1008: ldc_w -1963678215
    //   1011: ixor
    //   1012: ldc2_w 2048638598
    //   1015: l2i
    //   1016: ldc_w 376844877
    //   1019: ixor
    //   1020: ixor
    //   1021: lookupswitch default -> 1048, -878051134 -> 1004, -391918263 -> 2994
    //   1048: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1051: getstatic Perryc.1 : I
    //   1054: ifeq -> 1068
    //   1057: ldc2_w 707968520
    //   1060: l2i
    //   1061: ldc_w 993613402
    //   1064: ixor
    //   1065: goto -> 1076
    //   1068: ldc2_w -1012676776
    //   1071: l2i
    //   1072: ldc_w 1326708481
    //   1075: ixor
    //   1076: ldc2_w 698206386
    //   1079: l2i
    //   1080: ldc_w 1786724952
    //   1083: ixor
    //   1084: ixor
    //   1085: lookupswitch default -> 1112, -2095087649 -> 1068, 1391026872 -> 2952
    //   1112: getfield field_70161_v : D
    //   1115: dsub
    //   1116: getstatic Perryc.1 : I
    //   1119: ifeq -> 1133
    //   1122: ldc2_w -1512344557
    //   1125: l2i
    //   1126: ldc_w 1003211792
    //   1129: ixor
    //   1130: goto -> 1141
    //   1133: ldc2_w -987112534
    //   1136: l2i
    //   1137: ldc_w -281771016
    //   1140: ixor
    //   1141: ldc2_w -717217150
    //   1144: l2i
    //   1145: ldc_w -613478842
    //   1148: ixor
    //   1149: ixor
    //   1150: lookupswitch default -> 1176, -1874881337 -> 2988, 2062954358 -> 1133
    //   1176: dstore #10
    //   1178: getstatic Perryc.0 : I
    //   1181: ifle -> 1195
    //   1184: ldc2_w -246481034
    //   1187: l2i
    //   1188: ldc_w 1772388136
    //   1191: ixor
    //   1192: goto -> 1203
    //   1195: ldc2_w -1825045597
    //   1198: l2i
    //   1199: ldc_w 1758475997
    //   1202: ixor
    //   1203: ldc2_w 845890282
    //   1206: l2i
    //   1207: ldc_w 348002557
    //   1210: ixor
    //   1211: ixor
    //   1212: lookupswitch default -> 1240, -1103111607 -> 2996, -1023098888 -> 1195
    //   1240: dload #6
    //   1242: getstatic Perryc.c : I
    //   1245: iflt -> 1259
    //   1248: ldc2_w -21494621
    //   1251: l2i
    //   1252: ldc_w -567363695
    //   1255: ixor
    //   1256: goto -> 1267
    //   1259: ldc2_w 1002188066
    //   1262: l2i
    //   1263: ldc_w 1780815427
    //   1266: ixor
    //   1267: ldc2_w 276395579
    //   1270: l2i
    //   1271: ldc_w -1405543847
    //   1274: ixor
    //   1275: ixor
    //   1276: lookupswitch default -> 2976, -1663639728 -> 1259, -304523517 -> 1304
    //   1304: dload #6
    //   1306: dmul
    //   1307: getstatic Perryc.1 : I
    //   1310: ifeq -> 1324
    //   1313: ldc2_w -1010590691
    //   1316: l2i
    //   1317: ldc_w -1630226616
    //   1320: ixor
    //   1321: goto -> 1332
    //   1324: ldc2_w 1435487434
    //   1327: l2i
    //   1328: ldc_w -1668652439
    //   1331: ixor
    //   1332: ldc2_w -994060587
    //   1335: l2i
    //   1336: ldc_w 1386708793
    //   1339: ixor
    //   1340: ixor
    //   1341: lookupswitch default -> 2960, -888175943 -> 1324, 1595737935 -> 1368
    //   1368: dload #10
    //   1370: getstatic Perryc.0 : I
    //   1373: ifle -> 1387
    //   1376: ldc2_w -1614567347
    //   1379: l2i
    //   1380: ldc_w -1623494389
    //   1383: ixor
    //   1384: goto -> 1395
    //   1387: ldc2_w -1774240359
    //   1390: l2i
    //   1391: ldc_w -675258304
    //   1394: ixor
    //   1395: ldc2_w 376484653
    //   1398: l2i
    //   1399: ldc_w -1071647933
    //   1402: ixor
    //   1403: ixor
    //   1404: lookupswitch default -> 2934, -1752162889 -> 1432, -694707928 -> 1387
    //   1432: dload #10
    //   1434: dmul
    //   1435: dadd
    //   1436: getstatic Perryc.1 : I
    //   1439: ifeq -> 1453
    //   1442: ldc2_w 1213728639
    //   1445: l2i
    //   1446: ldc_w -281739893
    //   1449: ixor
    //   1450: goto -> 1461
    //   1453: ldc2_w 1057385506
    //   1456: l2i
    //   1457: ldc_w 1581324874
    //   1460: ixor
    //   1461: ldc2_w -2120270376
    //   1464: l2i
    //   1465: ldc_w -1544574854
    //   1468: ixor
    //   1469: ixor
    //   1470: lookupswitch default -> 2944, -2061734058 -> 1453, 1127736266 -> 1496
    //   1496: goto -> 1500
    //   1499: athrow
    //   1500: invokestatic sqrt : (D)D
    //   1503: goto -> 1507
    //   1506: athrow
    //   1507: getstatic Perryc.1 : I
    //   1510: ifeq -> 1524
    //   1513: ldc2_w -1951108644
    //   1516: l2i
    //   1517: ldc_w -1057852540
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w -1552968051
    //   1527: l2i
    //   1528: ldc_w -1048309795
    //   1531: ixor
    //   1532: ldc2_w 1048895205
    //   1535: l2i
    //   1536: ldc_w 1853126096
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 2948, 464955757 -> 1524, 840643173 -> 1568
    //   1568: dstore #12
    //   1570: getstatic Perryc.1 : I
    //   1573: ifeq -> 1587
    //   1576: ldc2_w -1962278884
    //   1579: l2i
    //   1580: ldc_w -308783896
    //   1583: ixor
    //   1584: goto -> 1595
    //   1587: ldc2_w 1434491881
    //   1590: l2i
    //   1591: ldc_w 387803941
    //   1594: ixor
    //   1595: ldc2_w -777234143
    //   1598: l2i
    //   1599: ldc_w 1463535673
    //   1602: ixor
    //   1603: ixor
    //   1604: lookupswitch default -> 3004, -1005952556 -> 1632, -536492564 -> 1587
    //   1632: dload #10
    //   1634: getstatic Perryc.0 : I
    //   1637: ifle -> 1651
    //   1640: ldc2_w 317980493
    //   1643: l2i
    //   1644: ldc_w 1681764079
    //   1647: ixor
    //   1648: goto -> 1659
    //   1651: ldc2_w 1989141229
    //   1654: l2i
    //   1655: ldc_w 153604324
    //   1658: ixor
    //   1659: ldc2_w -1978712322
    //   1662: l2i
    //   1663: ldc_w 1470478306
    //   1666: ixor
    //   1667: ixor
    //   1668: lookupswitch default -> 1696, -1419454274 -> 2946, 242723924 -> 1651
    //   1696: dload #6
    //   1698: getstatic Perryc.1 : I
    //   1701: ifeq -> 1715
    //   1704: ldc2_w 1022020951
    //   1707: l2i
    //   1708: ldc_w 357117372
    //   1711: ixor
    //   1712: goto -> 1723
    //   1715: ldc2_w 1642521675
    //   1718: l2i
    //   1719: ldc_w -1040071829
    //   1722: ixor
    //   1723: ldc2_w 1047888561
    //   1726: l2i
    //   1727: ldc_w 1553438441
    //   1730: ixor
    //   1731: ixor
    //   1732: lookupswitch default -> 1760, -359210770 -> 1715, 1262613683 -> 2972
    //   1760: goto -> 1764
    //   1763: athrow
    //   1764: invokestatic atan2 : (DD)D
    //   1767: goto -> 1771
    //   1770: athrow
    //   1771: getstatic Perryc.c : I
    //   1774: iflt -> 1788
    //   1777: ldc2_w 370439543
    //   1780: l2i
    //   1781: ldc_w 1531861088
    //   1784: ixor
    //   1785: goto -> 1796
    //   1788: ldc2_w -2046053730
    //   1791: l2i
    //   1792: ldc_w -1310168758
    //   1795: ixor
    //   1796: ldc2_w -75484315
    //   1799: l2i
    //   1800: ldc_w -886742146
    //   1803: ixor
    //   1804: ixor
    //   1805: lookupswitch default -> 2992, 122063823 -> 1832, 2113895692 -> 1788
    //   1832: goto -> 1836
    //   1835: athrow
    //   1836: invokestatic toDegrees : (D)D
    //   1839: goto -> 1843
    //   1842: athrow
    //   1843: d2f
    //   1844: ldc_w 0.030394463
    //   1847: invokestatic floatToIntBits : (F)I
    //   1850: ldc_w 2118974927
    //   1853: ixor
    //   1854: invokestatic intBitsToFloat : (I)F
    //   1857: fsub
    //   1858: getstatic Perryc.0 : I
    //   1861: ifle -> 1875
    //   1864: ldc2_w 1070985140
    //   1867: l2i
    //   1868: ldc_w 1824614884
    //   1871: ixor
    //   1872: goto -> 1883
    //   1875: ldc2_w 1344271748
    //   1878: l2i
    //   1879: ldc_w 1789563874
    //   1882: ixor
    //   1883: ldc2_w 1960062143
    //   1886: l2i
    //   1887: ldc_w -255869590
    //   1890: ixor
    //   1891: ixor
    //   1892: lookupswitch default -> 1920, -679536763 -> 2936, -73530580 -> 1875
    //   1920: fstore #14
    //   1922: getstatic Perryc.0 : I
    //   1925: ifle -> 1939
    //   1928: ldc2_w -1945080311
    //   1931: l2i
    //   1932: ldc_w -1346421072
    //   1935: ixor
    //   1936: goto -> 1947
    //   1939: ldc2_w 1275830686
    //   1942: l2i
    //   1943: ldc_w -833754398
    //   1946: ixor
    //   1947: ldc2_w -359143240
    //   1950: l2i
    //   1951: ldc_w -1592405493
    //   1954: ixor
    //   1955: ixor
    //   1956: lookupswitch default -> 1984, -1228315667 -> 1939, 1747806730 -> 2978
    //   1984: dload #8
    //   1986: getstatic Perryc.c : I
    //   1989: iflt -> 2003
    //   1992: ldc2_w -1542117845
    //   1995: l2i
    //   1996: ldc_w -1118935716
    //   1999: ixor
    //   2000: goto -> 2011
    //   2003: ldc2_w 206106827
    //   2006: l2i
    //   2007: ldc_w -1718286791
    //   2010: ixor
    //   2011: ldc2_w 73555476
    //   2014: l2i
    //   2015: ldc_w 444110480
    //   2018: ixor
    //   2019: ixor
    //   2020: lookupswitch default -> 2920, -1949876618 -> 2048, 121736179 -> 2003
    //   2048: dload #12
    //   2050: getstatic Perryc.1 : I
    //   2053: ifeq -> 2067
    //   2056: ldc2_w 15606459
    //   2059: l2i
    //   2060: ldc_w 715056033
    //   2063: ixor
    //   2064: goto -> 2075
    //   2067: ldc2_w -176069129
    //   2070: l2i
    //   2071: ldc_w 1740565189
    //   2074: ixor
    //   2075: ldc2_w -1903486735
    //   2078: l2i
    //   2079: ldc_w 820550380
    //   2082: ixor
    //   2083: ixor
    //   2084: lookupswitch default -> 2950, -1810676985 -> 2067, 744230191 -> 2112
    //   2112: goto -> 2116
    //   2115: athrow
    //   2116: invokestatic atan2 : (DD)D
    //   2119: goto -> 2123
    //   2122: athrow
    //   2123: getstatic Perryc.1 : I
    //   2126: ifeq -> 2140
    //   2129: ldc2_w -1071205065
    //   2132: l2i
    //   2133: ldc_w 61771271
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w 1740416249
    //   2143: l2i
    //   2144: ldc_w 1976683082
    //   2147: ixor
    //   2148: ldc2_w -1149117057
    //   2151: l2i
    //   2152: ldc_w 96055423
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 2940, -1403714637 -> 2184, 2108708400 -> 2140
    //   2184: goto -> 2188
    //   2187: athrow
    //   2188: invokestatic toDegrees : (D)D
    //   2191: goto -> 2195
    //   2194: athrow
    //   2195: dneg
    //   2196: d2f
    //   2197: getstatic Perryc.0 : I
    //   2200: ifle -> 2214
    //   2203: ldc2_w -821752069
    //   2206: l2i
    //   2207: ldc_w -1777584504
    //   2210: ixor
    //   2211: goto -> 2222
    //   2214: ldc2_w -2028438993
    //   2217: l2i
    //   2218: ldc_w -2042523705
    //   2221: ixor
    //   2222: ldc2_w 555749635
    //   2225: l2i
    //   2226: ldc_w 1166370497
    //   2229: ixor
    //   2230: ixor
    //   2231: lookupswitch default -> 2964, 1034702769 -> 2214, 1711047210 -> 2256
    //   2256: fstore #15
    //   2258: getstatic Perryc.1 : I
    //   2261: ifeq -> 2275
    //   2264: ldc2_w 333245966
    //   2267: l2i
    //   2268: ldc_w -840513869
    //   2271: ixor
    //   2272: goto -> 2283
    //   2275: ldc2_w -2045281657
    //   2278: l2i
    //   2279: ldc_w 923890826
    //   2282: ixor
    //   2283: ldc2_w 2116744450
    //   2286: l2i
    //   2287: ldc_w 1943136137
    //   2290: ixor
    //   2291: ixor
    //   2292: lookupswitch default -> 2320, -1125771009 -> 2275, -742311370 -> 2966
    //   2320: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2323: getstatic Perryc.c : I
    //   2326: iflt -> 2340
    //   2329: ldc2_w 889316628
    //   2332: l2i
    //   2333: ldc_w -198531146
    //   2336: ixor
    //   2337: goto -> 2348
    //   2340: ldc2_w -1035255112
    //   2343: l2i
    //   2344: ldc_w 763938460
    //   2347: ixor
    //   2348: ldc2_w -813267166
    //   2351: l2i
    //   2352: ldc_w 124877072
    //   2355: ixor
    //   2356: ixor
    //   2357: lookupswitch default -> 2968, 165461136 -> 2340, 657750550 -> 2384
    //   2384: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2387: getstatic Perryc.0 : I
    //   2390: ifle -> 2404
    //   2393: ldc2_w -892390789
    //   2396: l2i
    //   2397: ldc_w -1810198445
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w -2085044416
    //   2407: l2i
    //   2408: ldc_w 1704946058
    //   2411: ixor
    //   2412: ldc2_w -1273122878
    //   2415: l2i
    //   2416: ldc_w -9158880
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, -1803044930 -> 2404, 364655306 -> 3002
    //   2448: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   2451: new net/minecraft/network/play/client/CPacketPlayer$Rotation
    //   2454: dup
    //   2455: getstatic Perryc.c : I
    //   2458: iflt -> 2472
    //   2461: ldc2_w -1806673888
    //   2464: l2i
    //   2465: ldc_w -702091449
    //   2468: ixor
    //   2469: goto -> 2480
    //   2472: ldc2_w 202657688
    //   2475: l2i
    //   2476: ldc_w -1475783873
    //   2479: ixor
    //   2480: ldc2_w 1467918407
    //   2483: l2i
    //   2484: ldc_w 727825882
    //   2487: ixor
    //   2488: ixor
    //   2489: lookupswitch default -> 2516, 1047110394 -> 2922, 2115232673 -> 2472
    //   2516: fload #14
    //   2518: getstatic Perryc.0 : I
    //   2521: ifle -> 2535
    //   2524: ldc2_w 1984720810
    //   2527: l2i
    //   2528: ldc_w 831932722
    //   2531: ixor
    //   2532: goto -> 2543
    //   2535: ldc2_w -2028145662
    //   2538: l2i
    //   2539: ldc_w -692408169
    //   2542: ixor
    //   2543: ldc2_w 1063323601
    //   2546: l2i
    //   2547: ldc_w 1102433478
    //   2550: ixor
    //   2551: ixor
    //   2552: lookupswitch default -> 2924, 796036994 -> 2580, 957279631 -> 2535
    //   2580: fload #15
    //   2582: getstatic Perryc.1 : I
    //   2585: ifeq -> 2599
    //   2588: ldc2_w -1871945211
    //   2591: l2i
    //   2592: ldc_w -1109172944
    //   2595: ixor
    //   2596: goto -> 2607
    //   2599: ldc2_w -582630975
    //   2602: l2i
    //   2603: ldc_w 1614778514
    //   2606: ixor
    //   2607: ldc2_w 953238150
    //   2610: l2i
    //   2611: ldc_w -1227588028
    //   2614: ixor
    //   2615: ixor
    //   2616: lookupswitch default -> 2644, -1551236105 -> 2990, 1544201765 -> 2599
    //   2644: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2647: getstatic Perryc.0 : I
    //   2650: ifle -> 2664
    //   2653: ldc2_w 816368891
    //   2656: l2i
    //   2657: ldc_w -1158671916
    //   2660: ixor
    //   2661: goto -> 2672
    //   2664: ldc2_w -1129024428
    //   2667: l2i
    //   2668: ldc_w 1520152451
    //   2671: ixor
    //   2672: ldc2_w -849716723
    //   2675: l2i
    //   2676: ldc_w 595539430
    //   2679: ixor
    //   2680: ixor
    //   2681: lookupswitch default -> 2998, 134919228 -> 2708, 1685959364 -> 2664
    //   2708: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2711: getstatic Perryc.1 : I
    //   2714: ifeq -> 2728
    //   2717: ldc2_w 75998194
    //   2720: l2i
    //   2721: ldc_w 46686375
    //   2724: ixor
    //   2725: goto -> 2736
    //   2728: ldc2_w -1397455354
    //   2731: l2i
    //   2732: ldc_w -1200257357
    //   2735: ixor
    //   2736: ldc2_w -1364635706
    //   2739: l2i
    //   2740: ldc_w 187890906
    //   2743: ixor
    //   2744: ixor
    //   2745: lookupswitch default -> 2926, -1546358711 -> 2728, -1319455831 -> 2772
    //   2772: getfield field_70122_E : Z
    //   2775: getstatic Perryc.c : I
    //   2778: iflt -> 2792
    //   2781: ldc2_w 1638685873
    //   2784: l2i
    //   2785: ldc_w 106613762
    //   2788: ixor
    //   2789: goto -> 2800
    //   2792: ldc2_w -1079264023
    //   2795: l2i
    //   2796: ldc_w -708367891
    //   2799: ixor
    //   2800: ldc2_w -2027709887
    //   2803: l2i
    //   2804: ldc_w 1752918870
    //   2807: ixor
    //   2808: ixor
    //   2809: lookupswitch default -> 2970, -2060164077 -> 2836, -2001837660 -> 2792
    //   2836: goto -> 2840
    //   2839: athrow
    //   2840: invokespecial <init> : (FFZ)V
    //   2843: goto -> 2847
    //   2846: athrow
    //   2847: getstatic Perryc.1 : I
    //   2850: ifeq -> 2864
    //   2853: ldc2_w -968911222
    //   2856: l2i
    //   2857: ldc_w 194961619
    //   2860: ixor
    //   2861: goto -> 2872
    //   2864: ldc2_w 1059251725
    //   2867: l2i
    //   2868: ldc_w 2023259569
    //   2871: ixor
    //   2872: ldc2_w -801070433
    //   2875: l2i
    //   2876: ldc_w 385389842
    //   2879: ixor
    //   2880: ixor
    //   2881: lookupswitch default -> 2908, -588101235 -> 2864, 186204628 -> 2962
    //   2908: goto -> 2912
    //   2911: athrow
    //   2912: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   2915: goto -> 2919
    //   2918: athrow
    //   2919: return
    //   2920: aconst_null
    //   2921: athrow
    //   2922: aconst_null
    //   2923: athrow
    //   2924: aconst_null
    //   2925: athrow
    //   2926: aconst_null
    //   2927: athrow
    //   2928: aconst_null
    //   2929: athrow
    //   2930: aconst_null
    //   2931: athrow
    //   2932: aconst_null
    //   2933: athrow
    //   2934: aconst_null
    //   2935: athrow
    //   2936: aconst_null
    //   2937: athrow
    //   2938: aconst_null
    //   2939: athrow
    //   2940: aconst_null
    //   2941: athrow
    //   2942: aconst_null
    //   2943: athrow
    //   2944: aconst_null
    //   2945: athrow
    //   2946: aconst_null
    //   2947: athrow
    //   2948: aconst_null
    //   2949: athrow
    //   2950: aconst_null
    //   2951: athrow
    //   2952: aconst_null
    //   2953: athrow
    //   2954: aconst_null
    //   2955: athrow
    //   2956: aconst_null
    //   2957: athrow
    //   2958: aconst_null
    //   2959: athrow
    //   2960: aconst_null
    //   2961: athrow
    //   2962: aconst_null
    //   2963: athrow
    //   2964: aconst_null
    //   2965: athrow
    //   2966: aconst_null
    //   2967: athrow
    //   2968: aconst_null
    //   2969: athrow
    //   2970: aconst_null
    //   2971: athrow
    //   2972: aconst_null
    //   2973: athrow
    //   2974: aconst_null
    //   2975: athrow
    //   2976: aconst_null
    //   2977: athrow
    //   2978: aconst_null
    //   2979: athrow
    //   2980: aconst_null
    //   2981: athrow
    //   2982: aconst_null
    //   2983: athrow
    //   2984: aconst_null
    //   2985: athrow
    //   2986: aconst_null
    //   2987: athrow
    //   2988: aconst_null
    //   2989: athrow
    //   2990: aconst_null
    //   2991: athrow
    //   2992: aconst_null
    //   2993: athrow
    //   2994: aconst_null
    //   2995: athrow
    //   2996: aconst_null
    //   2997: athrow
    //   2998: aconst_null
    //   2999: athrow
    //   3000: aconst_null
    //   3001: athrow
    //   3002: aconst_null
    //   3003: athrow
    //   3004: aconst_null
    //   3005: athrow
    //   3006: aconst_null
    //   3007: athrow
    //   3008: pop
    //   3009: goto -> 24
    //   3012: pop
    //   3013: aconst_null
    //   3014: goto -> 3008
    //   3017: dup
    //   3018: ifnull -> 3008
    //   3021: checkcast java/lang/Throwable
    //   3024: athrow
    //   3025: dup
    //   3026: ifnull -> 3012
    //   3029: checkcast java/lang/Throwable
    //   3032: athrow
    //   3033: aconst_null
    //   3034: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2896	0	x	D
    //   24	2896	2	y	D
    //   24	2896	4	z	D
    //   338	2582	6	diffX	D
    //   858	2062	8	diffY	D
    //   1178	1742	10	diffZ	D
    //   1570	1350	12	diffXZ	D
    //   1922	998	14	yaw	F
    //   2258	662	15	pitch	F
    // Exception table:
    //   from	to	target	type
    //   8	20	3017	java/lang/NegativeArraySizeException
    //   784	790	790	finally
    //   784	790	3	finally
    //   784	790	3	finally
    //   784	790	790	finally
    //   784	790	3	java/lang/IllegalStateException
    //   1499	1506	1506	finally
    //   1499	1506	1499	java/lang/UnsupportedOperationException
    //   1500	1506	3	java/lang/StringIndexOutOfBoundsException
    //   1500	1506	1506	finally
    //   1500	1506	3	finally
    //   1763	1770	1770	finally
    //   1763	1770	1763	java/lang/ClassCastException
    //   1763	1770	3	finally
    //   1764	1770	3	java/lang/UnsupportedOperationException
    //   1764	1770	1763	java/lang/ArithmeticException
    //   1835	1842	1842	finally
    //   1835	1842	1835	finally
    //   1835	1842	1842	finally
    //   1836	1842	1835	java/util/ConcurrentModificationException
    //   1836	1842	1835	finally
    //   2115	2122	2122	finally
    //   2115	2122	2115	finally
    //   2115	2122	3	java/lang/IllegalArgumentException
    //   2116	2122	2115	java/util/ConcurrentModificationException
    //   2116	2122	2122	finally
    //   2187	2194	2194	finally
    //   2187	2194	2187	finally
    //   2188	2194	2187	finally
    //   2188	2194	2187	finally
    //   2188	2194	2194	java/lang/ArithmeticException
    //   2840	2846	2846	finally
    //   2840	2846	3	finally
    //   2840	2846	3	finally
    //   2840	2846	3	finally
    //   2840	2846	2846	finally
    //   2911	2918	2918	finally
    //   2911	2918	2911	finally
    //   2912	2918	3	finally
    //   2912	2918	3	finally
    //   2912	2918	2911	finally
    //   3017	3025	3017	finally
    //   3033	3035	3	java/lang/ClassCastException
  }
  
  public static void swingArm() {
    Perry1.3V(null, (int)-527889213L ^ 0x934A0A19);
  }
  
  public static Vec3d getEyesPos() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 927
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 919
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 911
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/Vec3d
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 1559329194
    //   37: l2i
    //   38: ldc_w -1772129296
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1542268817
    //   48: l2i
    //   49: ldc_w 1470203357
    //   52: ixor
    //   53: ldc2_w -476685262
    //   56: l2i
    //   57: ldc_w 2122139456
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 884, 1464144168 -> 45, 1851279040 -> 88
    //   88: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   91: getstatic Perryc.c : I
    //   94: iflt -> 108
    //   97: ldc2_w -331368677
    //   100: l2i
    //   101: ldc_w -57258112
    //   104: ixor
    //   105: goto -> 116
    //   108: ldc2_w 2117023536
    //   111: l2i
    //   112: ldc_w -1331164355
    //   115: ixor
    //   116: ldc2_w 664778833
    //   119: l2i
    //   120: ldc_w -123534046
    //   123: ixor
    //   124: ixor
    //   125: lookupswitch default -> 152, -812300824 -> 878, -68267385 -> 108
    //   152: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w 1141069072
    //   164: l2i
    //   165: ldc_w 1354897449
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -330371594
    //   175: l2i
    //   176: ldc_w -355335003
    //   179: ixor
    //   180: ldc2_w 1908982523
    //   183: l2i
    //   184: ldc_w 1374909758
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, -1619251070 -> 172, 888863484 -> 882
    //   216: getfield field_70165_t : D
    //   219: getstatic Perryc.c : I
    //   222: iflt -> 236
    //   225: ldc2_w 510640074
    //   228: l2i
    //   229: ldc_w -1065571600
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w -1211944786
    //   239: l2i
    //   240: ldc_w -1188966439
    //   243: ixor
    //   244: ldc2_w 1028578974
    //   247: l2i
    //   248: ldc_w -1670350787
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 890, -1344513580 -> 280, 2133701529 -> 236
    //   280: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w 962139208
    //   292: l2i
    //   293: ldc_w 511677484
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1687725441
    //   303: l2i
    //   304: ldc_w -144596900
    //   307: ixor
    //   308: ldc2_w -1688899777
    //   311: l2i
    //   312: ldc_w 1029062301
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -2128227898 -> 888, -1567576813 -> 300
    //   344: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w -215213782
    //   356: l2i
    //   357: ldc_w -1472072073
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -2013715725
    //   367: l2i
    //   368: ldc_w -120514682
    //   371: ixor
    //   372: ldc2_w -2115280501
    //   375: l2i
    //   376: ldc_w 675026628
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -966314468 -> 364, -222652398 -> 894
    //   408: getfield field_70163_u : D
    //   411: getstatic Perryc.1 : I
    //   414: ifeq -> 428
    //   417: ldc2_w -180121940
    //   420: l2i
    //   421: ldc_w -404558102
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w 185079347
    //   431: l2i
    //   432: ldc_w -1427351267
    //   435: ixor
    //   436: ldc2_w 1330432526
    //   439: l2i
    //   440: ldc_w -767339127
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -1884356671 -> 900, 361565921 -> 428
    //   472: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w -1409948785
    //   484: l2i
    //   485: ldc_w 1519248608
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -1918508962
    //   495: l2i
    //   496: ldc_w -2034894161
    //   499: ixor
    //   500: ldc2_w -532798088
    //   503: l2i
    //   504: ldc_w -1173083666
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 898, -1420686343 -> 492, 1362761319 -> 536
    //   536: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w 1005617739
    //   548: l2i
    //   549: ldc_w 1065349036
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 2109147818
    //   559: l2i
    //   560: ldc_w -1409253296
    //   563: ixor
    //   564: ldc2_w 1346599304
    //   567: l2i
    //   568: ldc_w -1565522388
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 876, -159641021 -> 556, 591721822 -> 600
    //   600: goto -> 604
    //   603: athrow
    //   604: invokevirtual func_70047_e : ()F
    //   607: goto -> 611
    //   610: athrow
    //   611: f2d
    //   612: dadd
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w 126761852
    //   622: l2i
    //   623: ldc_w 821238187
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 2065901525
    //   633: l2i
    //   634: ldc_w -630522607
    //   637: ixor
    //   638: ldc2_w 980057575
    //   641: l2i
    //   642: ldc_w -433045746
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -349740994 -> 892, 1114815571 -> 630
    //   672: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w -522926077
    //   684: l2i
    //   685: ldc_w -1695978321
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1704215317
    //   695: l2i
    //   696: ldc_w -855406936
    //   699: ixor
    //   700: ldc2_w -1501478466
    //   703: l2i
    //   704: ldc_w 459776626
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -941930656 -> 886, 525293084 -> 692
    //   736: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w -2121317807
    //   748: l2i
    //   749: ldc_w 12280990
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -1218090728
    //   759: l2i
    //   760: ldc_w -442467338
    //   763: ixor
    //   764: ldc2_w -581534633
    //   767: l2i
    //   768: ldc_w 886746670
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, 375154197 -> 756, 1756951734 -> 896
    //   800: getfield field_70161_v : D
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w 1614584243
    //   812: l2i
    //   813: ldc_w 181171730
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -1017009811
    //   823: l2i
    //   824: ldc_w 1602091816
    //   827: ixor
    //   828: ldc2_w -957309385
    //   831: l2i
    //   832: ldc_w 1149979909
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 880, -393528173 -> 820, 510099831 -> 864
    //   864: goto -> 868
    //   867: athrow
    //   868: invokespecial <init> : (DDD)V
    //   871: goto -> 875
    //   874: athrow
    //   875: areturn
    //   876: aconst_null
    //   877: athrow
    //   878: aconst_null
    //   879: athrow
    //   880: aconst_null
    //   881: athrow
    //   882: aconst_null
    //   883: athrow
    //   884: aconst_null
    //   885: athrow
    //   886: aconst_null
    //   887: athrow
    //   888: aconst_null
    //   889: athrow
    //   890: aconst_null
    //   891: athrow
    //   892: aconst_null
    //   893: athrow
    //   894: aconst_null
    //   895: athrow
    //   896: aconst_null
    //   897: athrow
    //   898: aconst_null
    //   899: athrow
    //   900: aconst_null
    //   901: athrow
    //   902: pop
    //   903: goto -> 24
    //   906: pop
    //   907: aconst_null
    //   908: goto -> 902
    //   911: dup
    //   912: ifnull -> 902
    //   915: checkcast java/lang/Throwable
    //   918: athrow
    //   919: dup
    //   920: ifnull -> 906
    //   923: checkcast java/lang/Throwable
    //   926: athrow
    //   927: aconst_null
    //   928: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	911	java/lang/IllegalStateException
    //   604	610	610	finally
    //   604	610	3	finally
    //   604	610	3	finally
    //   604	610	610	finally
    //   604	610	610	java/lang/EnumConstantNotPresentException
    //   867	874	874	finally
    //   867	874	874	finally
    //   868	874	867	finally
    //   868	874	3	finally
    //   868	874	874	java/lang/IndexOutOfBoundsException
    //   911	919	911	java/lang/NullPointerException
    //   927	929	3	finally
  }
  
  public static boolean rayTracePlaceCheck(BlockPos pos, boolean shouldCheck, float height) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1899
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1891
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1883
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 918173587
    //   33: l2i
    //   34: ldc_w -1444287432
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -246757762
    //   44: l2i
    //   45: ldc_w -336069091
    //   48: ixor
    //   49: ldc2_w -1092848017
    //   52: l2i
    //   53: ldc_w 1643215654
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1858, -980404950 -> 84, 1082054370 -> 41
    //   84: iload_1
    //   85: ifeq -> 99
    //   88: ldc2_w 808887643
    //   91: l2i
    //   92: ldc_w -1783602623
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w -1261126539
    //   102: l2i
    //   103: ldc_w 290618128
    //   106: ixor
    //   107: ldc2_w -676538657
    //   110: l2i
    //   111: ldc_w 2102427770
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, 259690943 -> 140, 259690944 -> 1804
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 157
    //   146: ldc2_w 2055873073
    //   149: l2i
    //   150: ldc_w -839990934
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w 651518099
    //   160: l2i
    //   161: ldc_w -639130627
    //   164: ixor
    //   165: ldc2_w 1866084933
    //   168: l2i
    //   169: ldc_w -1399556603
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, 1278704089 -> 157, 1959438107 -> 1856
    //   200: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   203: getstatic Perryc.0 : I
    //   206: ifle -> 220
    //   209: ldc2_w -1072302715
    //   212: l2i
    //   213: ldc_w -988241163
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 457858781
    //   223: l2i
    //   224: ldc_w -1388566570
    //   227: ixor
    //   228: ldc2_w -918890710
    //   231: l2i
    //   232: ldc_w 1087273914
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 264, -1929774112 -> 1824, -1218444302 -> 220
    //   264: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   267: new net/minecraft/util/math/Vec3d
    //   270: dup
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w 903901365
    //   280: l2i
    //   281: ldc_w 519295091
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -1284941733
    //   291: l2i
    //   292: ldc_w -872413232
    //   295: ixor
    //   296: ldc2_w -209426064
    //   299: l2i
    //   300: ldc_w 396779557
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -990305933 -> 288, -818828909 -> 1838
    //   332: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   335: getstatic Perryc.0 : I
    //   338: ifle -> 352
    //   341: ldc2_w -638420006
    //   344: l2i
    //   345: ldc_w -705593242
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w -478052015
    //   355: l2i
    //   356: ldc_w -222883653
    //   359: ixor
    //   360: ldc2_w -1674270115
    //   363: l2i
    //   364: ldc_w 1444357763
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 396, -970950814 -> 1836, -543764936 -> 352
    //   396: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   399: getstatic Perryc.c : I
    //   402: iflt -> 416
    //   405: ldc2_w 986282310
    //   408: l2i
    //   409: ldc_w -922733770
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w -609497416
    //   419: l2i
    //   420: ldc_w -13513731
    //   423: ixor
    //   424: ldc2_w -1058558328
    //   427: l2i
    //   428: ldc_w 283102193
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 460, -622658814 -> 416, 603008777 -> 1844
    //   460: getfield field_70165_t : D
    //   463: getstatic Perryc.1 : I
    //   466: ifeq -> 480
    //   469: ldc2_w 1791028399
    //   472: l2i
    //   473: ldc_w -654101554
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -630133731
    //   483: l2i
    //   484: ldc_w -372180991
    //   487: ixor
    //   488: ldc2_w 58706077
    //   491: l2i
    //   492: ldc_w 998794074
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 1848, -1959496538 -> 480, 190300123 -> 524
    //   524: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 544
    //   533: ldc2_w -1768317503
    //   536: l2i
    //   537: ldc_w 197224034
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w 41754555
    //   547: l2i
    //   548: ldc_w 1530477329
    //   551: ixor
    //   552: ldc2_w 2071774401
    //   555: l2i
    //   556: ldc_w -1867501718
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 1852, -1299656959 -> 588, 1989414920 -> 544
    //   588: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   591: getstatic Perryc.1 : I
    //   594: ifeq -> 608
    //   597: ldc2_w -1628734852
    //   600: l2i
    //   601: ldc_w 1347636485
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 1369100248
    //   611: l2i
    //   612: ldc_w 1040455205
    //   615: ixor
    //   616: ldc2_w 2003386129
    //   619: l2i
    //   620: ldc_w -501204330
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 652, -1347085782 -> 608, 1542533886 -> 1830
    //   652: getfield field_70163_u : D
    //   655: getstatic Perryc.0 : I
    //   658: ifle -> 672
    //   661: ldc2_w -1752073736
    //   664: l2i
    //   665: ldc_w 1587903138
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w -2019203814
    //   675: l2i
    //   676: ldc_w -619745735
    //   679: ixor
    //   680: ldc2_w 1627628113
    //   683: l2i
    //   684: ldc_w -757988687
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 1834, -277107773 -> 716, 2061870010 -> 672
    //   716: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   719: getstatic Perryc.0 : I
    //   722: ifle -> 736
    //   725: ldc2_w 1881397361
    //   728: l2i
    //   729: ldc_w -130442093
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 668681806
    //   739: l2i
    //   740: ldc_w -88109252
    //   743: ixor
    //   744: ldc2_w -363233143
    //   747: l2i
    //   748: ldc_w -1135686574
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 1828, -1955363415 -> 780, -569571271 -> 736
    //   780: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   783: getstatic Perryc.c : I
    //   786: iflt -> 800
    //   789: ldc2_w -1072236289
    //   792: l2i
    //   793: ldc_w -554717005
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w -1141675712
    //   803: l2i
    //   804: ldc_w 418072224
    //   807: ixor
    //   808: ldc2_w 912156000
    //   811: l2i
    //   812: ldc_w 1890341690
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 844, -278348959 -> 800, 1477148182 -> 1866
    //   844: goto -> 848
    //   847: athrow
    //   848: invokevirtual func_70047_e : ()F
    //   851: goto -> 855
    //   854: athrow
    //   855: f2d
    //   856: dadd
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w 1399584315
    //   866: l2i
    //   867: ldc_w 1791434114
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w -1617649652
    //   877: l2i
    //   878: ldc_w -1816716030
    //   881: ixor
    //   882: ldc2_w 1611489644
    //   885: l2i
    //   886: ldc_w 135885868
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 916, 1371078393 -> 1840, 1779338056 -> 874
    //   916: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   919: getstatic Perryc.0 : I
    //   922: ifle -> 936
    //   925: ldc2_w 2137644593
    //   928: l2i
    //   929: ldc_w 1613954676
    //   932: ixor
    //   933: goto -> 944
    //   936: ldc2_w -950965647
    //   939: l2i
    //   940: ldc_w 1481825432
    //   943: ixor
    //   944: ldc2_w 145599124
    //   947: l2i
    //   948: ldc_w 2006004843
    //   951: ixor
    //   952: ixor
    //   953: lookupswitch default -> 980, 114344656 -> 936, 1617411770 -> 1862
    //   980: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   983: getstatic Perryc.0 : I
    //   986: ifle -> 1000
    //   989: ldc2_w -1688574955
    //   992: l2i
    //   993: ldc_w 188298624
    //   996: ixor
    //   997: goto -> 1008
    //   1000: ldc2_w -343160423
    //   1003: l2i
    //   1004: ldc_w -1504559023
    //   1007: ixor
    //   1008: ldc2_w 1961398507
    //   1011: l2i
    //   1012: ldc_w 1368561437
    //   1015: ixor
    //   1016: ixor
    //   1017: lookupswitch default -> 1044, -1804162080 -> 1000, -1256630685 -> 1846
    //   1044: getfield field_70161_v : D
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w 180453625
    //   1056: l2i
    //   1057: ldc_w 984576489
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w 318489970
    //   1067: l2i
    //   1068: ldc_w 531296419
    //   1071: ixor
    //   1072: ldc2_w -1960590469
    //   1075: l2i
    //   1076: ldc_w -667303466
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1826, 1581987708 -> 1108, 1668608957 -> 1064
    //   1108: goto -> 1112
    //   1111: athrow
    //   1112: invokespecial <init> : (DDD)V
    //   1115: goto -> 1119
    //   1118: athrow
    //   1119: new net/minecraft/util/math/Vec3d
    //   1122: dup
    //   1123: getstatic Perryc.0 : I
    //   1126: ifle -> 1140
    //   1129: ldc2_w -656641080
    //   1132: l2i
    //   1133: ldc_w 240686994
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -1018791378
    //   1143: l2i
    //   1144: ldc_w 1317491417
    //   1147: ixor
    //   1148: ldc2_w 982597359
    //   1151: l2i
    //   1152: ldc_w -1269102083
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1860, 51060709 -> 1184, 1481560904 -> 1140
    //   1184: aload_0
    //   1185: getstatic Perryc.1 : I
    //   1188: ifeq -> 1202
    //   1191: ldc2_w -898631701
    //   1194: l2i
    //   1195: ldc_w -2041927154
    //   1198: ixor
    //   1199: goto -> 1210
    //   1202: ldc2_w 119341068
    //   1205: l2i
    //   1206: ldc_w 1507568326
    //   1209: ixor
    //   1210: ldc2_w -2123071101
    //   1213: l2i
    //   1214: ldc_w -1829838467
    //   1217: ixor
    //   1218: ixor
    //   1219: lookupswitch default -> 1244, -1417953439 -> 1202, 1606368539 -> 1850
    //   1244: goto -> 1248
    //   1247: athrow
    //   1248: invokevirtual func_177958_n : ()I
    //   1251: goto -> 1255
    //   1254: athrow
    //   1255: i2d
    //   1256: getstatic Perryc.1 : I
    //   1259: ifeq -> 1273
    //   1262: ldc2_w 1614341595
    //   1265: l2i
    //   1266: ldc_w -1211688675
    //   1269: ixor
    //   1270: goto -> 1281
    //   1273: ldc2_w -1663973082
    //   1276: l2i
    //   1277: ldc_w 1219592119
    //   1280: ixor
    //   1281: ldc2_w 1378598026
    //   1284: l2i
    //   1285: ldc_w -983784600
    //   1288: ixor
    //   1289: ixor
    //   1290: lookupswitch default -> 1316, -130180972 -> 1273, 1082712868 -> 1842
    //   1316: aload_0
    //   1317: getstatic Perryc.0 : I
    //   1320: ifle -> 1334
    //   1323: ldc2_w 157687397
    //   1326: l2i
    //   1327: ldc_w -829623354
    //   1330: ixor
    //   1331: goto -> 1342
    //   1334: ldc2_w -2058669499
    //   1337: l2i
    //   1338: ldc_w -446495378
    //   1341: ixor
    //   1342: ldc2_w -500381276
    //   1345: l2i
    //   1346: ldc_w -662542118
    //   1349: ixor
    //   1350: ixor
    //   1351: lookupswitch default -> 1376, -45855523 -> 1832, 733441767 -> 1334
    //   1376: goto -> 1380
    //   1379: athrow
    //   1380: invokevirtual func_177956_o : ()I
    //   1383: goto -> 1387
    //   1386: athrow
    //   1387: i2f
    //   1388: getstatic Perryc.c : I
    //   1391: iflt -> 1405
    //   1394: ldc2_w -1050407559
    //   1397: l2i
    //   1398: ldc_w 644752596
    //   1401: ixor
    //   1402: goto -> 1413
    //   1405: ldc2_w -601012525
    //   1408: l2i
    //   1409: ldc_w 682706490
    //   1412: ixor
    //   1413: ldc2_w -1344110740
    //   1416: l2i
    //   1417: ldc_w 1813878735
    //   1420: ixor
    //   1421: ixor
    //   1422: lookupswitch default -> 1448, -1941710577 -> 1405, 620085518 -> 1854
    //   1448: fload_2
    //   1449: fadd
    //   1450: f2d
    //   1451: getstatic Perryc.0 : I
    //   1454: ifle -> 1468
    //   1457: ldc2_w 531261314
    //   1460: l2i
    //   1461: ldc_w -185580128
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w 203019290
    //   1471: l2i
    //   1472: ldc_w 901892092
    //   1475: ixor
    //   1476: ldc2_w -198370948
    //   1479: l2i
    //   1480: ldc_w 10267401
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 1872, -848715373 -> 1512, 535531607 -> 1468
    //   1512: aload_0
    //   1513: getstatic Perryc.0 : I
    //   1516: ifle -> 1530
    //   1519: ldc2_w -447208842
    //   1522: l2i
    //   1523: ldc_w 1574988076
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w 442335008
    //   1533: l2i
    //   1534: ldc_w 1491427665
    //   1537: ixor
    //   1538: ldc2_w 1820954913
    //   1541: l2i
    //   1542: ldc_w -1167964029
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 1870, -1806448685 -> 1572, 1850970872 -> 1530
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual func_177952_p : ()I
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: i2d
    //   1584: getstatic Perryc.c : I
    //   1587: iflt -> 1601
    //   1590: ldc2_w -1971921472
    //   1593: l2i
    //   1594: ldc_w 374797622
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w 461373052
    //   1604: l2i
    //   1605: ldc_w 473020765
    //   1608: ixor
    //   1609: ldc2_w 968401936
    //   1612: l2i
    //   1613: ldc_w -81772686
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 1644, 1337735352 -> 1601, 1589162900 -> 1868
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokespecial <init> : (DDD)V
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: ldc2_w -784478889
    //   1658: l2i
    //   1659: ldc_w -784478889
    //   1662: ixor
    //   1663: ldc2_w -969299149
    //   1666: l2i
    //   1667: ldc_w -969299150
    //   1670: ixor
    //   1671: ldc2_w 1366266013
    //   1674: l2i
    //   1675: ldc_w 1366266013
    //   1678: ixor
    //   1679: getstatic Perryc.0 : I
    //   1682: ifle -> 1696
    //   1685: ldc2_w 1643175511
    //   1688: l2i
    //   1689: ldc_w -1472142366
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w -1467996972
    //   1699: l2i
    //   1700: ldc_w 988561028
    //   1703: ixor
    //   1704: ldc2_w -118514879
    //   1707: l2i
    //   1708: ldc_w 100858824
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, 615975243 -> 1696, 928865596 -> 1864
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual func_147447_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: ifnonnull -> 1765
    //   1754: ldc2_w -1912664727
    //   1757: l2i
    //   1758: ldc_w 1311005809
    //   1761: ixor
    //   1762: goto -> 1773
    //   1765: ldc2_w -1549741447
    //   1768: l2i
    //   1769: ldc_w 1618707296
    //   1772: ixor
    //   1773: ldc2_w -1303462208
    //   1776: l2i
    //   1777: ldc_w -1440462302
    //   1780: ixor
    //   1781: ixor
    //   1782: tableswitch default -> 1754, -609114630 -> 1804, -609114629 -> 1815
    //   1804: ldc2_w -1754654915
    //   1807: l2i
    //   1808: ldc_w -1754654916
    //   1811: ixor
    //   1812: goto -> 1823
    //   1815: ldc2_w 1158145664
    //   1818: l2i
    //   1819: ldc_w 1158145664
    //   1822: ixor
    //   1823: ireturn
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aconst_null
    //   1827: athrow
    //   1828: aconst_null
    //   1829: athrow
    //   1830: aconst_null
    //   1831: athrow
    //   1832: aconst_null
    //   1833: athrow
    //   1834: aconst_null
    //   1835: athrow
    //   1836: aconst_null
    //   1837: athrow
    //   1838: aconst_null
    //   1839: athrow
    //   1840: aconst_null
    //   1841: athrow
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: aconst_null
    //   1853: athrow
    //   1854: aconst_null
    //   1855: athrow
    //   1856: aconst_null
    //   1857: athrow
    //   1858: aconst_null
    //   1859: athrow
    //   1860: aconst_null
    //   1861: athrow
    //   1862: aconst_null
    //   1863: athrow
    //   1864: aconst_null
    //   1865: athrow
    //   1866: aconst_null
    //   1867: athrow
    //   1868: aconst_null
    //   1869: athrow
    //   1870: aconst_null
    //   1871: athrow
    //   1872: aconst_null
    //   1873: athrow
    //   1874: pop
    //   1875: goto -> 24
    //   1878: pop
    //   1879: aconst_null
    //   1880: goto -> 1874
    //   1883: dup
    //   1884: ifnull -> 1874
    //   1887: checkcast java/lang/Throwable
    //   1890: athrow
    //   1891: dup
    //   1892: ifnull -> 1878
    //   1895: checkcast java/lang/Throwable
    //   1898: athrow
    //   1899: aconst_null
    //   1900: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1800	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	1800	1	shouldCheck	Z
    //   24	1800	2	height	F
    // Exception table:
    //   from	to	target	type
    //   8	20	1883	java/lang/IllegalArgumentException
    //   847	854	854	finally
    //   847	854	3	finally
    //   847	854	847	java/lang/EnumConstantNotPresentException
    //   848	854	847	java/lang/NegativeArraySizeException
    //   848	854	854	java/lang/ArrayIndexOutOfBoundsException
    //   1111	1118	1118	finally
    //   1111	1118	1111	java/lang/EnumConstantNotPresentException
    //   1111	1118	1111	java/util/ConcurrentModificationException
    //   1111	1118	1118	java/lang/AssertionError
    //   1112	1118	1118	finally
    //   1247	1254	1254	finally
    //   1247	1254	1247	java/lang/EnumConstantNotPresentException
    //   1247	1254	1254	finally
    //   1247	1254	1247	java/lang/StringIndexOutOfBoundsException
    //   1248	1254	3	finally
    //   1379	1386	1386	finally
    //   1379	1386	1379	finally
    //   1379	1386	1379	finally
    //   1379	1386	3	java/util/ConcurrentModificationException
    //   1380	1386	1379	finally
    //   1575	1582	1582	finally
    //   1575	1582	1575	java/util/ConcurrentModificationException
    //   1575	1582	1575	finally
    //   1576	1582	1582	finally
    //   1576	1582	1575	finally
    //   1647	1654	1654	finally
    //   1647	1654	1654	finally
    //   1647	1654	1647	finally
    //   1648	1654	3	java/lang/RuntimeException
    //   1648	1654	1654	finally
    //   1743	1750	1750	finally
    //   1743	1750	1743	finally
    //   1743	1750	1750	finally
    //   1744	1750	1750	finally
    //   1744	1750	1750	finally
    //   1883	1891	1883	java/lang/ClassCastException
    //   1899	1901	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static boolean canBeClicked(BlockPos paramBlockPos) {
    return Perry1.6t(null, (int)257675566L ^ 0x6CAED834, paramBlockPos);
  }
  
  public static void rightClickBlock(BlockPos pos, Vec3d vec, EnumHand hand, EnumFacing direction, boolean packet) {
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
  
  public static Block getBlock(BlockPos paramBlockPos) {
    return Perry1.50(null, (int)1306905074L ^ 0x4ABC7802, paramBlockPos);
  }
  
  public static boolean isScaffoldPos(BlockPos paramBlockPos) {
    return Perry1.6g(null, (int)70621883L ^ 0x31BF4E5D, paramBlockPos);
  }
  
  public static List getPossibleSides(BlockPos pos) {
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
  
  static {
    // Byte code:
    //   0: ldc2_w -493303792
    //   3: l2i
    //   4: ldc_w -493303783
    //   7: ixor
    //   8: anewarray net/minecraft/block/Block
    //   11: dup
    //   12: ldc2_w -1192378631
    //   15: l2i
    //   16: ldc_w -1192378631
    //   19: ixor
    //   20: getstatic Perryc.0 : I
    //   23: ifle -> 37
    //   26: ldc2_w 2096533212
    //   29: l2i
    //   30: ldc_w -347573301
    //   33: ixor
    //   34: goto -> 45
    //   37: ldc2_w -1649044838
    //   40: l2i
    //   41: ldc_w 373291288
    //   44: ixor
    //   45: ldc2_w -2133100421
    //   48: l2i
    //   49: ldc_w -107064166
    //   52: ixor
    //   53: ixor
    //   54: lookupswitch default -> 4916, -285486602 -> 37, -221296797 -> 80
    //   80: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   83: aastore
    //   84: dup
    //   85: ldc2_w -1470537342
    //   88: l2i
    //   89: ldc_w -1470537341
    //   92: ixor
    //   93: getstatic Perryc.c : I
    //   96: iflt -> 110
    //   99: ldc2_w -1987430435
    //   102: l2i
    //   103: ldc_w 1818783922
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w 466907132
    //   113: l2i
    //   114: ldc_w -797016185
    //   117: ixor
    //   118: ldc2_w 1246946057
    //   121: l2i
    //   122: ldc_w -418736898
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 152, 1198663186 -> 110, 1220161688 -> 4938
    //   152: getstatic net/minecraft/init/Blocks.field_150356_k : Lnet/minecraft/block/BlockDynamicLiquid;
    //   155: aastore
    //   156: dup
    //   157: ldc2_w 1340222327
    //   160: l2i
    //   161: ldc_w 1340222325
    //   164: ixor
    //   165: getstatic Perryc.0 : I
    //   168: ifle -> 182
    //   171: ldc2_w 1299391751
    //   174: l2i
    //   175: ldc_w -270173983
    //   178: ixor
    //   179: goto -> 190
    //   182: ldc2_w 549572160
    //   185: l2i
    //   186: ldc_w -1541129907
    //   189: ixor
    //   190: ldc2_w 1390431610
    //   193: l2i
    //   194: ldc_w -620817432
    //   197: ixor
    //   198: ixor
    //   199: lookupswitch default -> 224, -1950676924 -> 182, 713622388 -> 4962
    //   224: getstatic net/minecraft/init/Blocks.field_150353_l : Lnet/minecraft/block/BlockStaticLiquid;
    //   227: aastore
    //   228: dup
    //   229: ldc2_w -1095899966
    //   232: l2i
    //   233: ldc_w -1095899967
    //   236: ixor
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 254
    //   243: ldc2_w -924329928
    //   246: l2i
    //   247: ldc_w -1259525473
    //   250: ixor
    //   251: goto -> 262
    //   254: ldc2_w 1450467470
    //   257: l2i
    //   258: ldc_w -814779523
    //   261: ixor
    //   262: ldc2_w -1093838876
    //   265: l2i
    //   266: ldc_w 1704805600
    //   269: ixor
    //   270: ixor
    //   271: lookupswitch default -> 296, -1487216221 -> 4940, 2146153095 -> 254
    //   296: getstatic net/minecraft/init/Blocks.field_150358_i : Lnet/minecraft/block/BlockDynamicLiquid;
    //   299: aastore
    //   300: dup
    //   301: ldc2_w 585459325
    //   304: l2i
    //   305: ldc_w 585459321
    //   308: ixor
    //   309: getstatic Perryc.c : I
    //   312: iflt -> 326
    //   315: ldc2_w -13009076
    //   318: l2i
    //   319: ldc_w 1079996916
    //   322: ixor
    //   323: goto -> 334
    //   326: ldc2_w 395110800
    //   329: l2i
    //   330: ldc_w 226788906
    //   333: ixor
    //   334: ldc2_w -1400282211
    //   337: l2i
    //   338: ldc_w 1593612181
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 368, 621144167 -> 326, 1293154992 -> 4958
    //   368: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   371: aastore
    //   372: dup
    //   373: ldc2_w 658862729
    //   376: l2i
    //   377: ldc_w 658862732
    //   380: ixor
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 398
    //   387: ldc2_w 922246349
    //   390: l2i
    //   391: ldc_w -883253071
    //   394: ixor
    //   395: goto -> 406
    //   398: ldc2_w -1057472851
    //   401: l2i
    //   402: ldc_w -1390827779
    //   405: ixor
    //   406: ldc2_w 594841643
    //   409: l2i
    //   410: ldc_w -468692148
    //   413: ixor
    //   414: ixor
    //   415: lookupswitch default -> 4904, -1434100937 -> 440, 986070811 -> 398
    //   440: getstatic net/minecraft/init/Blocks.field_150395_bd : Lnet/minecraft/block/Block;
    //   443: aastore
    //   444: dup
    //   445: ldc2_w 1494867701
    //   448: l2i
    //   449: ldc_w 1494867699
    //   452: ixor
    //   453: getstatic Perryc.0 : I
    //   456: ifle -> 470
    //   459: ldc2_w 1734269191
    //   462: l2i
    //   463: ldc_w 1614950929
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w 1655081724
    //   473: l2i
    //   474: ldc_w 1285803627
    //   477: ixor
    //   478: ldc2_w -405482996
    //   481: l2i
    //   482: ldc_w 1549135433
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 4894, -1786480430 -> 512, -1130506413 -> 470
    //   512: getstatic net/minecraft/init/Blocks.field_150431_aC : Lnet/minecraft/block/Block;
    //   515: aastore
    //   516: dup
    //   517: ldc2_w 700061704
    //   520: l2i
    //   521: ldc_w 700061711
    //   524: ixor
    //   525: getstatic Perryc.1 : I
    //   528: ifeq -> 542
    //   531: ldc2_w 1256280942
    //   534: l2i
    //   535: ldc_w -437474809
    //   538: ixor
    //   539: goto -> 550
    //   542: ldc2_w -1060677045
    //   545: l2i
    //   546: ldc_w -1030266620
    //   549: ixor
    //   550: ldc2_w 1197299228
    //   553: l2i
    //   554: ldc_w -1138790515
    //   557: ixor
    //   558: ixor
    //   559: lookupswitch default -> 584, 1014080185 -> 542, 1414512888 -> 4914
    //   584: getstatic net/minecraft/init/Blocks.field_150329_H : Lnet/minecraft/block/BlockTallGrass;
    //   587: aastore
    //   588: dup
    //   589: ldc2_w 1641121996
    //   592: l2i
    //   593: ldc_w 1641121988
    //   596: ixor
    //   597: getstatic Perryc.0 : I
    //   600: ifle -> 614
    //   603: ldc2_w 223836974
    //   606: l2i
    //   607: ldc_w 1756162096
    //   610: ixor
    //   611: goto -> 622
    //   614: ldc2_w 1233565648
    //   617: l2i
    //   618: ldc_w -2025885057
    //   621: ixor
    //   622: ldc2_w -676956391
    //   625: l2i
    //   626: ldc_w -1006677215
    //   629: ixor
    //   630: ixor
    //   631: lookupswitch default -> 656, 348386141 -> 614, 1906489126 -> 4946
    //   656: getstatic net/minecraft/init/Blocks.field_150480_ab : Lnet/minecraft/block/BlockFire;
    //   659: aastore
    //   660: getstatic Perryc.c : I
    //   663: iflt -> 677
    //   666: ldc2_w 937470959
    //   669: l2i
    //   670: ldc_w 1904420955
    //   673: ixor
    //   674: goto -> 685
    //   677: ldc2_w -1941179735
    //   680: l2i
    //   681: ldc_w 1963101358
    //   684: ixor
    //   685: ldc2_w -473659307
    //   688: l2i
    //   689: ldc_w -1588897467
    //   692: ixor
    //   693: ixor
    //   694: lookupswitch default -> 720, -1652172476 -> 677, 82596516 -> 5018
    //   720: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   723: getstatic Perryc.1 : I
    //   726: ifeq -> 740
    //   729: ldc2_w -1279163336
    //   732: l2i
    //   733: ldc_w 9351102
    //   736: ixor
    //   737: goto -> 748
    //   740: ldc2_w -1387494069
    //   743: l2i
    //   744: ldc_w 1914281289
    //   747: ixor
    //   748: ldc2_w -415858970
    //   751: l2i
    //   752: ldc_w -1791015815
    //   755: ixor
    //   756: ixor
    //   757: lookupswitch default -> 784, -1052372711 -> 4964, -1007288722 -> 740
    //   784: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.emptyBlocks : Ljava/util/List;
    //   787: ldc2_w 977532617
    //   790: l2i
    //   791: ldc_w 977532670
    //   794: ixor
    //   795: anewarray net/minecraft/block/Block
    //   798: dup
    //   799: ldc2_w 13069958
    //   802: l2i
    //   803: ldc_w 13069958
    //   806: ixor
    //   807: getstatic Perryc.1 : I
    //   810: ifeq -> 824
    //   813: ldc2_w -461386450
    //   816: l2i
    //   817: ldc_w -1269621638
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -961270647
    //   827: l2i
    //   828: ldc_w 221758845
    //   831: ixor
    //   832: ldc2_w -188070686
    //   835: l2i
    //   836: ldc_w 378580740
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 868, -1300874574 -> 5016, -695050101 -> 824
    //   868: getstatic net/minecraft/init/Blocks.field_150486_ae : Lnet/minecraft/block/BlockChest;
    //   871: aastore
    //   872: dup
    //   873: ldc2_w -199318348
    //   876: l2i
    //   877: ldc_w -199318347
    //   880: ixor
    //   881: getstatic Perryc.c : I
    //   884: iflt -> 898
    //   887: ldc2_w 1817202565
    //   890: l2i
    //   891: ldc_w -662164348
    //   894: ixor
    //   895: goto -> 906
    //   898: ldc2_w -1899315255
    //   901: l2i
    //   902: ldc_w 676866461
    //   905: ixor
    //   906: ldc2_w -1612817260
    //   909: l2i
    //   910: ldc_w -890913561
    //   913: ixor
    //   914: ixor
    //   915: lookupswitch default -> 940, -505183374 -> 4926, 1420785087 -> 898
    //   940: getstatic net/minecraft/init/Blocks.field_150447_bR : Lnet/minecraft/block/Block;
    //   943: aastore
    //   944: dup
    //   945: ldc2_w 673544187
    //   948: l2i
    //   949: ldc_w 673544185
    //   952: ixor
    //   953: getstatic Perryc.c : I
    //   956: iflt -> 970
    //   959: ldc2_w 1776348192
    //   962: l2i
    //   963: ldc_w 922461258
    //   966: ixor
    //   967: goto -> 978
    //   970: ldc2_w -1194985762
    //   973: l2i
    //   974: ldc_w 262526800
    //   977: ixor
    //   978: ldc2_w -1269149486
    //   981: l2i
    //   982: ldc_w -911652308
    //   985: ixor
    //   986: ixor
    //   987: lookupswitch default -> 1012, -2141824351 -> 970, 585650836 -> 4928
    //   1012: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   1015: aastore
    //   1016: dup
    //   1017: ldc2_w -174246285
    //   1020: l2i
    //   1021: ldc_w -174246288
    //   1024: ixor
    //   1025: getstatic Perryc.c : I
    //   1028: iflt -> 1042
    //   1031: ldc2_w 29494406
    //   1034: l2i
    //   1035: ldc_w 1881553248
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w 2077106217
    //   1045: l2i
    //   1046: ldc_w -1228657504
    //   1049: ixor
    //   1050: ldc2_w -571248687
    //   1053: l2i
    //   1054: ldc_w -1595679240
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 4972, -1340424544 -> 1084, 217352143 -> 1042
    //   1084: getstatic net/minecraft/init/Blocks.field_190977_dl : Lnet/minecraft/block/Block;
    //   1087: aastore
    //   1088: dup
    //   1089: ldc2_w -1490864029
    //   1092: l2i
    //   1093: ldc_w -1490864025
    //   1096: ixor
    //   1097: getstatic Perryc.c : I
    //   1100: iflt -> 1114
    //   1103: ldc2_w 297197205
    //   1106: l2i
    //   1107: ldc_w -1621971869
    //   1110: ixor
    //   1111: goto -> 1122
    //   1114: ldc2_w 1526380256
    //   1117: l2i
    //   1118: ldc_w 472521927
    //   1121: ixor
    //   1122: ldc2_w 90008797
    //   1125: l2i
    //   1126: ldc_w -1504390181
    //   1129: ixor
    //   1130: ixor
    //   1131: lookupswitch default -> 1156, -1396255355 -> 1114, 770559472 -> 4966
    //   1156: getstatic net/minecraft/init/Blocks.field_190978_dm : Lnet/minecraft/block/Block;
    //   1159: aastore
    //   1160: dup
    //   1161: ldc2_w 1088297054
    //   1164: l2i
    //   1165: ldc_w 1088297051
    //   1168: ixor
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w -179293387
    //   1178: l2i
    //   1179: ldc_w 1790965272
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 1831599445
    //   1189: l2i
    //   1190: ldc_w -1678736529
    //   1193: ixor
    //   1194: ldc2_w 1152698706
    //   1197: l2i
    //   1198: ldc_w -769170181
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1228, -429575211 -> 1186, 159148164 -> 4890
    //   1228: getstatic net/minecraft/init/Blocks.field_190979_dn : Lnet/minecraft/block/Block;
    //   1231: aastore
    //   1232: dup
    //   1233: ldc2_w -362766508
    //   1236: l2i
    //   1237: ldc_w -362766510
    //   1240: ixor
    //   1241: getstatic Perryc.c : I
    //   1244: iflt -> 1258
    //   1247: ldc2_w -2125999181
    //   1250: l2i
    //   1251: ldc_w 869263018
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w 589953374
    //   1261: l2i
    //   1262: ldc_w 1746219011
    //   1265: ixor
    //   1266: ldc2_w 1784049298
    //   1269: l2i
    //   1270: ldc_w -2070321076
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 4998, -1510748285 -> 1300, 1548170183 -> 1258
    //   1300: getstatic net/minecraft/init/Blocks.field_190980_do : Lnet/minecraft/block/Block;
    //   1303: aastore
    //   1304: dup
    //   1305: ldc2_w 1431925608
    //   1308: l2i
    //   1309: ldc_w 1431925615
    //   1312: ixor
    //   1313: getstatic Perryc.0 : I
    //   1316: ifle -> 1330
    //   1319: ldc2_w 1843497486
    //   1322: l2i
    //   1323: ldc_w -396781638
    //   1326: ixor
    //   1327: goto -> 1338
    //   1330: ldc2_w 282191402
    //   1333: l2i
    //   1334: ldc_w 1444918632
    //   1337: ixor
    //   1338: ldc2_w 1009302595
    //   1341: l2i
    //   1342: ldc_w -618071947
    //   1345: ixor
    //   1346: ixor
    //   1347: lookupswitch default -> 5020, -1580329100 -> 1372, 1656248706 -> 1330
    //   1372: getstatic net/minecraft/init/Blocks.field_190981_dp : Lnet/minecraft/block/Block;
    //   1375: aastore
    //   1376: dup
    //   1377: ldc2_w -94632634
    //   1380: l2i
    //   1381: ldc_w -94632626
    //   1384: ixor
    //   1385: getstatic Perryc.c : I
    //   1388: iflt -> 1402
    //   1391: ldc2_w 1558912653
    //   1394: l2i
    //   1395: ldc_w -1633249119
    //   1398: ixor
    //   1399: goto -> 1410
    //   1402: ldc2_w 797076331
    //   1405: l2i
    //   1406: ldc_w -113754747
    //   1409: ixor
    //   1410: ldc2_w 848063896
    //   1413: l2i
    //   1414: ldc_w 816768577
    //   1417: ixor
    //   1418: ixor
    //   1419: lookupswitch default -> 4900, -1066463755 -> 1402, -728179401 -> 1444
    //   1444: getstatic net/minecraft/init/Blocks.field_190982_dq : Lnet/minecraft/block/Block;
    //   1447: aastore
    //   1448: dup
    //   1449: ldc2_w -1191314378
    //   1452: l2i
    //   1453: ldc_w -1191314369
    //   1456: ixor
    //   1457: getstatic Perryc.0 : I
    //   1460: ifle -> 1474
    //   1463: ldc2_w -1217036467
    //   1466: l2i
    //   1467: ldc_w 266694623
    //   1470: ixor
    //   1471: goto -> 1482
    //   1474: ldc2_w 531097256
    //   1477: l2i
    //   1478: ldc_w 1466313173
    //   1481: ixor
    //   1482: ldc2_w 1647775950
    //   1485: l2i
    //   1486: ldc_w -2005682059
    //   1489: ixor
    //   1490: ixor
    //   1491: lookupswitch default -> 1516, -741346873 -> 1474, 1389672489 -> 4980
    //   1516: getstatic net/minecraft/init/Blocks.field_190983_dr : Lnet/minecraft/block/Block;
    //   1519: aastore
    //   1520: dup
    //   1521: ldc2_w -111253389
    //   1524: l2i
    //   1525: ldc_w -111253383
    //   1528: ixor
    //   1529: getstatic Perryc.c : I
    //   1532: iflt -> 1546
    //   1535: ldc2_w -37505168
    //   1538: l2i
    //   1539: ldc_w 1454638441
    //   1542: ixor
    //   1543: goto -> 1554
    //   1546: ldc2_w -1606703858
    //   1549: l2i
    //   1550: ldc_w 727778746
    //   1553: ixor
    //   1554: ldc2_w -1942404985
    //   1557: l2i
    //   1558: ldc_w 433976180
    //   1561: ixor
    //   1562: ixor
    //   1563: lookupswitch default -> 4976, 515773255 -> 1588, 1049821674 -> 1546
    //   1588: getstatic net/minecraft/init/Blocks.field_190984_ds : Lnet/minecraft/block/Block;
    //   1591: aastore
    //   1592: dup
    //   1593: ldc2_w 1691714670
    //   1596: l2i
    //   1597: ldc_w 1691714661
    //   1600: ixor
    //   1601: getstatic Perryc.0 : I
    //   1604: ifle -> 1618
    //   1607: ldc2_w 710857142
    //   1610: l2i
    //   1611: ldc_w -1085425269
    //   1614: ixor
    //   1615: goto -> 1626
    //   1618: ldc2_w -1023433630
    //   1621: l2i
    //   1622: ldc_w -1848691470
    //   1625: ixor
    //   1626: ldc2_w 1007463088
    //   1629: l2i
    //   1630: ldc_w 1571912148
    //   1633: ixor
    //   1634: ixor
    //   1635: lookupswitch default -> 4924, -189875367 -> 1618, 848118772 -> 1660
    //   1660: getstatic net/minecraft/init/Blocks.field_190985_dt : Lnet/minecraft/block/Block;
    //   1663: aastore
    //   1664: dup
    //   1665: ldc2_w 565433988
    //   1668: l2i
    //   1669: ldc_w 565433992
    //   1672: ixor
    //   1673: getstatic Perryc.0 : I
    //   1676: ifle -> 1690
    //   1679: ldc2_w 1895820856
    //   1682: l2i
    //   1683: ldc_w -133854464
    //   1686: ixor
    //   1687: goto -> 1698
    //   1690: ldc2_w -1302441255
    //   1693: l2i
    //   1694: ldc_w -1780250482
    //   1697: ixor
    //   1698: ldc2_w -332972403
    //   1701: l2i
    //   1702: ldc_w 910331820
    //   1705: ixor
    //   1706: ixor
    //   1707: lookupswitch default -> 4960, -36148362 -> 1732, 1386206233 -> 1690
    //   1732: getstatic net/minecraft/init/Blocks.field_190986_du : Lnet/minecraft/block/Block;
    //   1735: aastore
    //   1736: dup
    //   1737: ldc2_w -809750309
    //   1740: l2i
    //   1741: ldc_w -809750314
    //   1744: ixor
    //   1745: getstatic Perryc.1 : I
    //   1748: ifeq -> 1762
    //   1751: ldc2_w 1512111893
    //   1754: l2i
    //   1755: ldc_w -538271273
    //   1758: ixor
    //   1759: goto -> 1770
    //   1762: ldc2_w 530599898
    //   1765: l2i
    //   1766: ldc_w 690413678
    //   1769: ixor
    //   1770: ldc2_w 5525616
    //   1773: l2i
    //   1774: ldc_w -751762505
    //   1777: ixor
    //   1778: ixor
    //   1779: lookupswitch default -> 4898, -438043533 -> 1804, 1454312709 -> 1762
    //   1804: getstatic net/minecraft/init/Blocks.field_190987_dv : Lnet/minecraft/block/Block;
    //   1807: aastore
    //   1808: dup
    //   1809: ldc2_w 646312935
    //   1812: l2i
    //   1813: ldc_w 646312937
    //   1816: ixor
    //   1817: getstatic Perryc.0 : I
    //   1820: ifle -> 1834
    //   1823: ldc2_w 1789945652
    //   1826: l2i
    //   1827: ldc_w 603585181
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w 1084699855
    //   1837: l2i
    //   1838: ldc_w -1915035150
    //   1841: ixor
    //   1842: ldc2_w -736517353
    //   1845: l2i
    //   1846: ldc_w 125715109
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 1876, -1708229605 -> 4984, 2088767114 -> 1834
    //   1876: getstatic net/minecraft/init/Blocks.field_190988_dw : Lnet/minecraft/block/Block;
    //   1879: aastore
    //   1880: dup
    //   1881: ldc2_w 306801927
    //   1884: l2i
    //   1885: ldc_w 306801928
    //   1888: ixor
    //   1889: getstatic Perryc.0 : I
    //   1892: ifle -> 1906
    //   1895: ldc2_w 625078806
    //   1898: l2i
    //   1899: ldc_w -479654847
    //   1902: ixor
    //   1903: goto -> 1914
    //   1906: ldc2_w 317655340
    //   1909: l2i
    //   1910: ldc_w 627679736
    //   1913: ixor
    //   1914: ldc2_w -1120818897
    //   1917: l2i
    //   1918: ldc_w -2004913235
    //   1921: ixor
    //   1922: ixor
    //   1923: lookupswitch default -> 1948, -211409707 -> 4912, 2021946555 -> 1906
    //   1948: getstatic net/minecraft/init/Blocks.field_190989_dx : Lnet/minecraft/block/Block;
    //   1951: aastore
    //   1952: dup
    //   1953: ldc2_w -359551415
    //   1956: l2i
    //   1957: ldc_w -359551399
    //   1960: ixor
    //   1961: getstatic Perryc.0 : I
    //   1964: ifle -> 1978
    //   1967: ldc2_w 493451538
    //   1970: l2i
    //   1971: ldc_w -1488983245
    //   1974: ixor
    //   1975: goto -> 1986
    //   1978: ldc2_w -2005144949
    //   1981: l2i
    //   1982: ldc_w -1562691816
    //   1985: ixor
    //   1986: ldc2_w 1585549484
    //   1989: l2i
    //   1990: ldc_w -227519447
    //   1993: ixor
    //   1994: ixor
    //   1995: lookupswitch default -> 5002, -2041505514 -> 2020, 380065444 -> 1978
    //   2020: getstatic net/minecraft/init/Blocks.field_190990_dy : Lnet/minecraft/block/Block;
    //   2023: aastore
    //   2024: dup
    //   2025: ldc2_w -638817212
    //   2028: l2i
    //   2029: ldc_w -638817195
    //   2032: ixor
    //   2033: getstatic Perryc.c : I
    //   2036: iflt -> 2050
    //   2039: ldc2_w -1430294754
    //   2042: l2i
    //   2043: ldc_w 37321039
    //   2046: ixor
    //   2047: goto -> 2058
    //   2050: ldc2_w 275910644
    //   2053: l2i
    //   2054: ldc_w -569874365
    //   2057: ixor
    //   2058: ldc2_w -1592352355
    //   2061: l2i
    //   2062: ldc_w 1596343962
    //   2065: ixor
    //   2066: ixor
    //   2067: lookupswitch default -> 2092, -2018421527 -> 2050, 1454829910 -> 4922
    //   2092: getstatic net/minecraft/init/Blocks.field_190991_dz : Lnet/minecraft/block/Block;
    //   2095: aastore
    //   2096: dup
    //   2097: ldc2_w -1782164486
    //   2100: l2i
    //   2101: ldc_w -1782164504
    //   2104: ixor
    //   2105: getstatic Perryc.c : I
    //   2108: iflt -> 2122
    //   2111: ldc2_w -1579006202
    //   2114: l2i
    //   2115: ldc_w -1956592168
    //   2118: ixor
    //   2119: goto -> 2130
    //   2122: ldc2_w 1238970789
    //   2125: l2i
    //   2126: ldc_w 1259679611
    //   2129: ixor
    //   2130: ldc2_w 685628334
    //   2133: l2i
    //   2134: ldc_w 2069638585
    //   2137: ixor
    //   2138: ixor
    //   2139: lookupswitch default -> 4896, 1364060361 -> 2164, 2030269641 -> 2122
    //   2164: getstatic net/minecraft/init/Blocks.field_190975_dA : Lnet/minecraft/block/Block;
    //   2167: aastore
    //   2168: dup
    //   2169: ldc2_w -1841274353
    //   2172: l2i
    //   2173: ldc_w -1841274340
    //   2176: ixor
    //   2177: getstatic Perryc.0 : I
    //   2180: ifle -> 2194
    //   2183: ldc2_w 2134669514
    //   2186: l2i
    //   2187: ldc_w -23199271
    //   2190: ixor
    //   2191: goto -> 2202
    //   2194: ldc2_w -48453585
    //   2197: l2i
    //   2198: ldc_w -2095083237
    //   2201: ixor
    //   2202: ldc2_w 1179567815
    //   2205: l2i
    //   2206: ldc_w 1579809651
    //   2209: ixor
    //   2210: ixor
    //   2211: lookupswitch default -> 2236, -1715125081 -> 5008, -722850177 -> 2194
    //   2236: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   2239: aastore
    //   2240: dup
    //   2241: ldc2_w 126282133
    //   2244: l2i
    //   2245: ldc_w 126282113
    //   2248: ixor
    //   2249: getstatic Perryc.1 : I
    //   2252: ifeq -> 2266
    //   2255: ldc2_w 399387906
    //   2258: l2i
    //   2259: ldc_w -1125104116
    //   2262: ixor
    //   2263: goto -> 2274
    //   2266: ldc2_w -488872923
    //   2269: l2i
    //   2270: ldc_w 2099439785
    //   2273: ixor
    //   2274: ldc2_w -1000150867
    //   2277: l2i
    //   2278: ldc_w -1597396347
    //   2281: ixor
    //   2282: ixor
    //   2283: lookupswitch default -> 4920, -812308186 -> 2266, -78262620 -> 2308
    //   2308: getstatic net/minecraft/init/Blocks.field_150471_bO : Lnet/minecraft/block/Block;
    //   2311: aastore
    //   2312: dup
    //   2313: ldc2_w -768229757
    //   2316: l2i
    //   2317: ldc_w -768229738
    //   2320: ixor
    //   2321: getstatic Perryc.c : I
    //   2324: iflt -> 2338
    //   2327: ldc2_w -279650338
    //   2330: l2i
    //   2331: ldc_w -1542894861
    //   2334: ixor
    //   2335: goto -> 2346
    //   2338: ldc2_w -521071433
    //   2341: l2i
    //   2342: ldc_w -578965702
    //   2345: ixor
    //   2346: ldc2_w 669021231
    //   2349: l2i
    //   2350: ldc_w -1455732953
    //   2353: ixor
    //   2354: ixor
    //   2355: lookupswitch default -> 4936, -1286109051 -> 2380, -981031387 -> 2338
    //   2380: getstatic net/minecraft/init/Blocks.field_150430_aB : Lnet/minecraft/block/Block;
    //   2383: aastore
    //   2384: dup
    //   2385: ldc2_w -2133135610
    //   2388: l2i
    //   2389: ldc_w -2133135600
    //   2392: ixor
    //   2393: getstatic Perryc.0 : I
    //   2396: ifle -> 2410
    //   2399: ldc2_w -521403196
    //   2402: l2i
    //   2403: ldc_w 1251670454
    //   2406: ixor
    //   2407: goto -> 2418
    //   2410: ldc2_w -606666783
    //   2413: l2i
    //   2414: ldc_w -1850068980
    //   2417: ixor
    //   2418: ldc2_w -2038345196
    //   2421: l2i
    //   2422: ldc_w -322430613
    //   2425: ixor
    //   2426: ixor
    //   2427: lookupswitch default -> 4950, -1069566451 -> 2410, 539329682 -> 2452
    //   2452: getstatic net/minecraft/init/Blocks.field_150441_bU : Lnet/minecraft/block/BlockRedstoneComparator;
    //   2455: aastore
    //   2456: dup
    //   2457: ldc2_w -1203244547
    //   2460: l2i
    //   2461: ldc_w -1203244566
    //   2464: ixor
    //   2465: getstatic Perryc.1 : I
    //   2468: ifeq -> 2482
    //   2471: ldc2_w -38127556
    //   2474: l2i
    //   2475: ldc_w -1547581498
    //   2478: ixor
    //   2479: goto -> 2490
    //   2482: ldc2_w -1477736682
    //   2485: l2i
    //   2486: ldc_w -189699818
    //   2489: ixor
    //   2490: ldc2_w -1050544215
    //   2493: l2i
    //   2494: ldc_w -713272207
    //   2497: ixor
    //   2498: ixor
    //   2499: lookupswitch default -> 5012, 1195855320 -> 2524, 1248222242 -> 2482
    //   2524: getstatic net/minecraft/init/Blocks.field_150413_aR : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   2527: aastore
    //   2528: dup
    //   2529: ldc2_w 1939626427
    //   2532: l2i
    //   2533: ldc_w 1939626403
    //   2536: ixor
    //   2537: getstatic Perryc.0 : I
    //   2540: ifle -> 2554
    //   2543: ldc2_w 2116159585
    //   2546: l2i
    //   2547: ldc_w 773707477
    //   2550: ixor
    //   2551: goto -> 2562
    //   2554: ldc2_w 384543928
    //   2557: l2i
    //   2558: ldc_w 1945039385
    //   2561: ixor
    //   2562: ldc2_w 813740924
    //   2565: l2i
    //   2566: ldc_w -643834103
    //   2569: ixor
    //   2570: ixor
    //   2571: lookupswitch default -> 4888, -1944440108 -> 2596, -1189039423 -> 2554
    //   2596: getstatic net/minecraft/init/Blocks.field_150416_aS : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   2599: aastore
    //   2600: dup
    //   2601: ldc2_w -1701363990
    //   2604: l2i
    //   2605: ldc_w -1701363981
    //   2608: ixor
    //   2609: getstatic Perryc.0 : I
    //   2612: ifle -> 2626
    //   2615: ldc2_w -130468292
    //   2618: l2i
    //   2619: ldc_w -848547706
    //   2622: ixor
    //   2623: goto -> 2634
    //   2626: ldc2_w -36791990
    //   2629: l2i
    //   2630: ldc_w -1866686867
    //   2633: ixor
    //   2634: ldc2_w 740535585
    //   2637: l2i
    //   2638: ldc_w 2097589937
    //   2641: ixor
    //   2642: ixor
    //   2643: lookupswitch default -> 4892, 1012335799 -> 2668, 1685062954 -> 2626
    //   2668: getstatic net/minecraft/init/Blocks.field_150455_bV : Lnet/minecraft/block/BlockRedstoneComparator;
    //   2671: aastore
    //   2672: dup
    //   2673: ldc2_w -641594114
    //   2676: l2i
    //   2677: ldc_w -641594140
    //   2680: ixor
    //   2681: getstatic Perryc.1 : I
    //   2684: ifeq -> 2698
    //   2687: ldc2_w -750345972
    //   2690: l2i
    //   2691: ldc_w -490279123
    //   2694: ixor
    //   2695: goto -> 2706
    //   2698: ldc2_w -1289733754
    //   2701: l2i
    //   2702: ldc_w 127188911
    //   2705: ixor
    //   2706: ldc2_w 1491762267
    //   2709: l2i
    //   2710: ldc_w -832124701
    //   2713: ixor
    //   2714: ixor
    //   2715: lookupswitch default -> 2740, -1492321639 -> 4954, 1324423908 -> 2698
    //   2740: getstatic net/minecraft/init/Blocks.field_180390_bo : Lnet/minecraft/block/Block;
    //   2743: aastore
    //   2744: dup
    //   2745: ldc2_w -618456802
    //   2748: l2i
    //   2749: ldc_w -618456827
    //   2752: ixor
    //   2753: getstatic Perryc.0 : I
    //   2756: ifle -> 2770
    //   2759: ldc2_w 637390365
    //   2762: l2i
    //   2763: ldc_w 1418686427
    //   2766: ixor
    //   2767: goto -> 2778
    //   2770: ldc2_w 1194719077
    //   2773: l2i
    //   2774: ldc_w 1169460067
    //   2777: ixor
    //   2778: ldc2_w 250135186
    //   2781: l2i
    //   2782: ldc_w -410507990
    //   2785: ixor
    //   2786: ixor
    //   2787: lookupswitch default -> 2812, -1743632770 -> 4930, 635434530 -> 2770
    //   2812: getstatic net/minecraft/init/Blocks.field_180391_bp : Lnet/minecraft/block/Block;
    //   2815: aastore
    //   2816: dup
    //   2817: ldc2_w -1716223821
    //   2820: l2i
    //   2821: ldc_w -1716223825
    //   2824: ixor
    //   2825: getstatic Perryc.c : I
    //   2828: iflt -> 2842
    //   2831: ldc2_w -1091075588
    //   2834: l2i
    //   2835: ldc_w 1427425724
    //   2838: ixor
    //   2839: goto -> 2850
    //   2842: ldc2_w 545648169
    //   2845: l2i
    //   2846: ldc_w 719904792
    //   2849: ixor
    //   2850: ldc2_w -550334774
    //   2853: l2i
    //   2854: ldc_w 1632098158
    //   2857: ixor
    //   2858: ixor
    //   2859: lookupswitch default -> 2884, 1435898340 -> 5022, 1712214484 -> 2842
    //   2884: getstatic net/minecraft/init/Blocks.field_180392_bq : Lnet/minecraft/block/Block;
    //   2887: aastore
    //   2888: dup
    //   2889: ldc2_w -1080197701
    //   2892: l2i
    //   2893: ldc_w -1080197722
    //   2896: ixor
    //   2897: getstatic Perryc.1 : I
    //   2900: ifeq -> 2914
    //   2903: ldc2_w 760439904
    //   2906: l2i
    //   2907: ldc_w 59030691
    //   2910: ixor
    //   2911: goto -> 2922
    //   2914: ldc2_w -1559464690
    //   2917: l2i
    //   2918: ldc_w 507788956
    //   2921: ixor
    //   2922: ldc2_w -466516396
    //   2925: l2i
    //   2926: ldc_w -633468721
    //   2929: ixor
    //   2930: ixor
    //   2931: lookupswitch default -> 4974, -2092448503 -> 2956, 282613336 -> 2914
    //   2956: getstatic net/minecraft/init/Blocks.field_180386_br : Lnet/minecraft/block/Block;
    //   2959: aastore
    //   2960: dup
    //   2961: ldc2_w 1988649219
    //   2964: l2i
    //   2965: ldc_w 1988649245
    //   2968: ixor
    //   2969: getstatic Perryc.0 : I
    //   2972: ifle -> 2986
    //   2975: ldc2_w -186907020
    //   2978: l2i
    //   2979: ldc_w -1420432137
    //   2982: ixor
    //   2983: goto -> 2994
    //   2986: ldc2_w -2100588767
    //   2989: l2i
    //   2990: ldc_w -1183297185
    //   2993: ixor
    //   2994: ldc2_w 451700045
    //   2997: l2i
    //   2998: ldc_w -1434435229
    //   3001: ixor
    //   3002: ixor
    //   3003: lookupswitch default -> 3028, -270152019 -> 4986, -201679316 -> 2986
    //   3028: getstatic net/minecraft/init/Blocks.field_180385_bs : Lnet/minecraft/block/Block;
    //   3031: aastore
    //   3032: dup
    //   3033: ldc2_w 1751079602
    //   3036: l2i
    //   3037: ldc_w 1751079597
    //   3040: ixor
    //   3041: getstatic Perryc.0 : I
    //   3044: ifle -> 3058
    //   3047: ldc2_w 1611892277
    //   3050: l2i
    //   3051: ldc_w -436382841
    //   3054: ixor
    //   3055: goto -> 3066
    //   3058: ldc2_w -1497830412
    //   3061: l2i
    //   3062: ldc_w -1143387842
    //   3065: ixor
    //   3066: ldc2_w -1819904621
    //   3069: l2i
    //   3070: ldc_w -1213935814
    //   3073: ixor
    //   3074: ixor
    //   3075: lookupswitch default -> 4944, -1580437733 -> 3058, 960698467 -> 3100
    //   3100: getstatic net/minecraft/init/Blocks.field_180387_bt : Lnet/minecraft/block/Block;
    //   3103: aastore
    //   3104: dup
    //   3105: ldc2_w -321301264
    //   3108: l2i
    //   3109: ldc_w -321301296
    //   3112: ixor
    //   3113: getstatic Perryc.c : I
    //   3116: iflt -> 3130
    //   3119: ldc2_w -1362378540
    //   3122: l2i
    //   3123: ldc_w 1037967155
    //   3126: ixor
    //   3127: goto -> 3138
    //   3130: ldc2_w -802127886
    //   3133: l2i
    //   3134: ldc_w 467363809
    //   3137: ixor
    //   3138: ldc2_w 515731855
    //   3141: l2i
    //   3142: ldc_w 1427663943
    //   3145: ixor
    //   3146: ixor
    //   3147: lookupswitch default -> 3172, -659504593 -> 5010, -203228102 -> 3130
    //   3172: getstatic net/minecraft/init/Blocks.field_150382_bo : Lnet/minecraft/block/Block;
    //   3175: aastore
    //   3176: dup
    //   3177: ldc2_w 55040811
    //   3180: l2i
    //   3181: ldc_w 55040778
    //   3184: ixor
    //   3185: getstatic Perryc.1 : I
    //   3188: ifeq -> 3202
    //   3191: ldc2_w 1598243982
    //   3194: l2i
    //   3195: ldc_w 1414681818
    //   3198: ixor
    //   3199: goto -> 3210
    //   3202: ldc2_w -1826718555
    //   3205: l2i
    //   3206: ldc_w 322561730
    //   3209: ixor
    //   3210: ldc2_w 1678015472
    //   3213: l2i
    //   3214: ldc_w 1343024094
    //   3217: ixor
    //   3218: ixor
    //   3219: lookupswitch default -> 3244, -372993737 -> 3202, 1058635898 -> 4906
    //   3244: getstatic net/minecraft/init/Blocks.field_150367_z : Lnet/minecraft/block/Block;
    //   3247: aastore
    //   3248: dup
    //   3249: ldc2_w 2118802717
    //   3252: l2i
    //   3253: ldc_w 2118802751
    //   3256: ixor
    //   3257: getstatic Perryc.c : I
    //   3260: iflt -> 3274
    //   3263: ldc2_w -357827405
    //   3266: l2i
    //   3267: ldc_w 1508255401
    //   3270: ixor
    //   3271: goto -> 3282
    //   3274: ldc2_w 103167713
    //   3277: l2i
    //   3278: ldc_w 1539014880
    //   3281: ixor
    //   3282: ldc2_w -1842887764
    //   3285: l2i
    //   3286: ldc_w 2124404197
    //   3289: ixor
    //   3290: ixor
    //   3291: lookupswitch default -> 3316, 1609944147 -> 4968, 2091788694 -> 3274
    //   3316: getstatic net/minecraft/init/Blocks.field_150409_cd : Lnet/minecraft/block/Block;
    //   3319: aastore
    //   3320: dup
    //   3321: ldc2_w 715176330
    //   3324: l2i
    //   3325: ldc_w 715176361
    //   3328: ixor
    //   3329: getstatic Perryc.c : I
    //   3332: iflt -> 3346
    //   3335: ldc2_w -1753641655
    //   3338: l2i
    //   3339: ldc_w 662763727
    //   3342: ixor
    //   3343: goto -> 3354
    //   3346: ldc2_w -78691496
    //   3349: l2i
    //   3350: ldc_w -1380362506
    //   3353: ixor
    //   3354: ldc2_w 1648354200
    //   3357: l2i
    //   3358: ldc_w 1931387836
    //   3361: ixor
    //   3362: ixor
    //   3363: lookupswitch default -> 3388, -1579666014 -> 4908, -191872681 -> 3346
    //   3388: getstatic net/minecraft/init/Blocks.field_150442_at : Lnet/minecraft/block/Block;
    //   3391: aastore
    //   3392: dup
    //   3393: ldc2_w -200226139
    //   3396: l2i
    //   3397: ldc_w -200226175
    //   3400: ixor
    //   3401: getstatic Perryc.c : I
    //   3404: iflt -> 3418
    //   3407: ldc2_w 131245158
    //   3410: l2i
    //   3411: ldc_w 463241981
    //   3414: ixor
    //   3415: goto -> 3426
    //   3418: ldc2_w 187321980
    //   3421: l2i
    //   3422: ldc_w -1275936177
    //   3425: ixor
    //   3426: ldc2_w 1771584849
    //   3429: l2i
    //   3430: ldc_w -779453872
    //   3433: ixor
    //   3434: ixor
    //   3435: lookupswitch default -> 3460, -1537449574 -> 4918, 1931268216 -> 3418
    //   3460: getstatic net/minecraft/init/Blocks.field_150323_B : Lnet/minecraft/block/Block;
    //   3463: aastore
    //   3464: dup
    //   3465: ldc2_w 1795580939
    //   3468: l2i
    //   3469: ldc_w 1795580974
    //   3472: ixor
    //   3473: getstatic Perryc.c : I
    //   3476: iflt -> 3490
    //   3479: ldc2_w -1034548763
    //   3482: l2i
    //   3483: ldc_w -681547388
    //   3486: ixor
    //   3487: goto -> 3498
    //   3490: ldc2_w -1117505485
    //   3493: l2i
    //   3494: ldc_w -1856239412
    //   3497: ixor
    //   3498: ldc2_w -1301104404
    //   3501: l2i
    //   3502: ldc_w -1532292832
    //   3505: ixor
    //   3506: ixor
    //   3507: lookupswitch default -> 4992, 66046381 -> 3490, 987863347 -> 3532
    //   3532: getstatic net/minecraft/init/Blocks.field_150421_aI : Lnet/minecraft/block/Block;
    //   3535: aastore
    //   3536: dup
    //   3537: ldc2_w 1210719138
    //   3540: l2i
    //   3541: ldc_w 1210719108
    //   3544: ixor
    //   3545: getstatic Perryc.1 : I
    //   3548: ifeq -> 3562
    //   3551: ldc2_w -1952008430
    //   3554: l2i
    //   3555: ldc_w 2037258842
    //   3558: ixor
    //   3559: goto -> 3570
    //   3562: ldc2_w 45966005
    //   3565: l2i
    //   3566: ldc_w -289647187
    //   3569: ixor
    //   3570: ldc2_w -946717745
    //   3573: l2i
    //   3574: ldc_w 1199376993
    //   3577: ixor
    //   3578: ixor
    //   3579: lookupswitch default -> 4948, 1827538614 -> 3604, 1915198694 -> 3562
    //   3604: getstatic net/minecraft/init/Blocks.field_150461_bJ : Lnet/minecraft/block/BlockBeacon;
    //   3607: aastore
    //   3608: dup
    //   3609: ldc2_w 425974500
    //   3612: l2i
    //   3613: ldc_w 425974467
    //   3616: ixor
    //   3617: getstatic Perryc.0 : I
    //   3620: ifle -> 3634
    //   3623: ldc2_w -863138749
    //   3626: l2i
    //   3627: ldc_w -1340508601
    //   3630: ixor
    //   3631: goto -> 3642
    //   3634: ldc2_w -1687169323
    //   3637: l2i
    //   3638: ldc_w 739468616
    //   3641: ixor
    //   3642: ldc2_w 669597333
    //   3645: l2i
    //   3646: ldc_w -1931554217
    //   3649: ixor
    //   3650: ixor
    //   3651: lookupswitch default -> 4942, -677177658 -> 3634, 474701663 -> 3676
    //   3676: getstatic net/minecraft/init/Blocks.field_150324_C : Lnet/minecraft/block/Block;
    //   3679: aastore
    //   3680: dup
    //   3681: ldc2_w -312005980
    //   3684: l2i
    //   3685: ldc_w -312006004
    //   3688: ixor
    //   3689: getstatic Perryc.1 : I
    //   3692: ifeq -> 3706
    //   3695: ldc2_w -1859537903
    //   3698: l2i
    //   3699: ldc_w 1065363938
    //   3702: ixor
    //   3703: goto -> 3714
    //   3706: ldc2_w -448215834
    //   3709: l2i
    //   3710: ldc_w 1301443173
    //   3713: ixor
    //   3714: ldc2_w 578909398
    //   3717: l2i
    //   3718: ldc_w 1564048619
    //   3721: ixor
    //   3722: ixor
    //   3723: lookupswitch default -> 4994, -787376690 -> 3706, -681394498 -> 3748
    //   3748: getstatic net/minecraft/init/Blocks.field_150460_al : Lnet/minecraft/block/Block;
    //   3751: aastore
    //   3752: dup
    //   3753: ldc2_w -782991971
    //   3756: l2i
    //   3757: ldc_w -782991948
    //   3760: ixor
    //   3761: getstatic Perryc.1 : I
    //   3764: ifeq -> 3778
    //   3767: ldc2_w 675651701
    //   3770: l2i
    //   3771: ldc_w 1890976852
    //   3774: ixor
    //   3775: goto -> 3786
    //   3778: ldc2_w 910095194
    //   3781: l2i
    //   3782: ldc_w -1904638595
    //   3785: ixor
    //   3786: ldc2_w 573700262
    //   3789: l2i
    //   3790: ldc_w -1180163471
    //   3793: ixor
    //   3794: ixor
    //   3795: lookupswitch default -> 3820, -1016430858 -> 4952, 1548621928 -> 3778
    //   3820: getstatic net/minecraft/init/Blocks.field_180413_ao : Lnet/minecraft/block/BlockDoor;
    //   3823: aastore
    //   3824: dup
    //   3825: ldc2_w -1685131585
    //   3828: l2i
    //   3829: ldc_w -1685131627
    //   3832: ixor
    //   3833: getstatic Perryc.0 : I
    //   3836: ifle -> 3850
    //   3839: ldc2_w 995511036
    //   3842: l2i
    //   3843: ldc_w -1924938241
    //   3846: ixor
    //   3847: goto -> 3858
    //   3850: ldc2_w 1015677246
    //   3853: l2i
    //   3854: ldc_w -191853493
    //   3857: ixor
    //   3858: ldc2_w 1972619109
    //   3861: l2i
    //   3862: ldc_w -243695287
    //   3865: ixor
    //   3866: ixor
    //   3867: lookupswitch default -> 4996, 855623983 -> 3850, 1290849113 -> 3892
    //   3892: getstatic net/minecraft/init/Blocks.field_180414_ap : Lnet/minecraft/block/BlockDoor;
    //   3895: aastore
    //   3896: dup
    //   3897: ldc2_w -658231393
    //   3900: l2i
    //   3901: ldc_w -658231372
    //   3904: ixor
    //   3905: getstatic Perryc.0 : I
    //   3908: ifle -> 3922
    //   3911: ldc2_w 824849702
    //   3914: l2i
    //   3915: ldc_w 357026861
    //   3918: ixor
    //   3919: goto -> 3930
    //   3922: ldc2_w -2008358088
    //   3925: l2i
    //   3926: ldc_w -514811717
    //   3929: ixor
    //   3930: ldc2_w 1318140355
    //   3933: l2i
    //   3934: ldc_w -630127410
    //   3937: ixor
    //   3938: ixor
    //   3939: lookupswitch default -> 5006, -1332886522 -> 3922, -33929586 -> 3964
    //   3964: getstatic net/minecraft/init/Blocks.field_180412_aq : Lnet/minecraft/block/BlockDoor;
    //   3967: aastore
    //   3968: dup
    //   3969: ldc2_w -181094395
    //   3972: l2i
    //   3973: ldc_w -181094359
    //   3976: ixor
    //   3977: getstatic Perryc.c : I
    //   3980: iflt -> 3994
    //   3983: ldc2_w -237494757
    //   3986: l2i
    //   3987: ldc_w -320834220
    //   3990: ixor
    //   3991: goto -> 4002
    //   3994: ldc2_w -158629254
    //   3997: l2i
    //   3998: ldc_w 1900771869
    //   4001: ixor
    //   4002: ldc2_w 591621553
    //   4005: l2i
    //   4006: ldc_w 1834574842
    //   4009: ixor
    //   4010: ixor
    //   4011: lookupswitch default -> 4978, -908397012 -> 4036, 1394763012 -> 3994
    //   4036: getstatic net/minecraft/init/Blocks.field_180411_ar : Lnet/minecraft/block/BlockDoor;
    //   4039: aastore
    //   4040: dup
    //   4041: ldc2_w 2103080942
    //   4044: l2i
    //   4045: ldc_w 2103080899
    //   4048: ixor
    //   4049: getstatic Perryc.0 : I
    //   4052: ifle -> 4066
    //   4055: ldc2_w 1420011756
    //   4058: l2i
    //   4059: ldc_w -846737285
    //   4062: ixor
    //   4063: goto -> 4074
    //   4066: ldc2_w 99625850
    //   4069: l2i
    //   4070: ldc_w 1648729937
    //   4073: ixor
    //   4074: ldc2_w -145478680
    //   4077: l2i
    //   4078: ldc_w -634228372
    //   4081: ixor
    //   4082: ixor
    //   4083: lookupswitch default -> 4934, -1270734317 -> 4066, 1255403183 -> 4108
    //   4108: getstatic net/minecraft/init/Blocks.field_180410_as : Lnet/minecraft/block/BlockDoor;
    //   4111: aastore
    //   4112: dup
    //   4113: ldc2_w 1879747493
    //   4116: l2i
    //   4117: ldc_w 1879747467
    //   4120: ixor
    //   4121: getstatic Perryc.c : I
    //   4124: iflt -> 4138
    //   4127: ldc2_w 2122376384
    //   4130: l2i
    //   4131: ldc_w 735095203
    //   4134: ixor
    //   4135: goto -> 4146
    //   4138: ldc2_w 1720832904
    //   4141: l2i
    //   4142: ldc_w 786608252
    //   4145: ixor
    //   4146: ldc2_w -1344381959
    //   4149: l2i
    //   4150: ldc_w -20988353
    //   4153: ixor
    //   4154: ixor
    //   4155: lookupswitch default -> 4180, -912786681 -> 4138, 70363301 -> 4956
    //   4180: getstatic net/minecraft/init/Blocks.field_180409_at : Lnet/minecraft/block/BlockDoor;
    //   4183: aastore
    //   4184: dup
    //   4185: ldc2_w -2022232551
    //   4188: l2i
    //   4189: ldc_w -2022232522
    //   4192: ixor
    //   4193: getstatic Perryc.c : I
    //   4196: iflt -> 4210
    //   4199: ldc2_w -988134380
    //   4202: l2i
    //   4203: ldc_w 839031789
    //   4206: ixor
    //   4207: goto -> 4218
    //   4210: ldc2_w -1055410045
    //   4213: l2i
    //   4214: ldc_w -339660089
    //   4217: ixor
    //   4218: ldc2_w -1874868378
    //   4221: l2i
    //   4222: ldc_w -1059778466
    //   4225: ixor
    //   4226: ixor
    //   4227: lookupswitch default -> 4988, -1477310271 -> 4210, 2050776444 -> 4252
    //   4252: getstatic net/minecraft/init/Blocks.field_150414_aQ : Lnet/minecraft/block/Block;
    //   4255: aastore
    //   4256: dup
    //   4257: ldc2_w -1629916270
    //   4260: l2i
    //   4261: ldc_w -1629916254
    //   4264: ixor
    //   4265: getstatic Perryc.0 : I
    //   4268: ifle -> 4282
    //   4271: ldc2_w 605273540
    //   4274: l2i
    //   4275: ldc_w 461017690
    //   4278: ixor
    //   4279: goto -> 4290
    //   4282: ldc2_w 1817505226
    //   4285: l2i
    //   4286: ldc_w -731237672
    //   4289: ixor
    //   4290: ldc2_w 164165756
    //   4293: l2i
    //   4294: ldc_w 10755128
    //   4297: ixor
    //   4298: ixor
    //   4299: lookupswitch default -> 4324, 906349530 -> 5004, 1549636183 -> 4282
    //   4324: getstatic net/minecraft/init/Blocks.field_150381_bn : Lnet/minecraft/block/Block;
    //   4327: aastore
    //   4328: dup
    //   4329: ldc2_w -123834810
    //   4332: l2i
    //   4333: ldc_w -123834761
    //   4336: ixor
    //   4337: getstatic Perryc.c : I
    //   4340: iflt -> 4354
    //   4343: ldc2_w -210132988
    //   4346: l2i
    //   4347: ldc_w -90418437
    //   4350: ixor
    //   4351: goto -> 4362
    //   4354: ldc2_w 1501897229
    //   4357: l2i
    //   4358: ldc_w -300331260
    //   4361: ixor
    //   4362: ldc2_w -212683787
    //   4365: l2i
    //   4366: ldc_w 2071760541
    //   4369: ixor
    //   4370: ixor
    //   4371: lookupswitch default -> 5014, -2117349481 -> 4354, 1068650593 -> 4396
    //   4396: getstatic net/minecraft/init/Blocks.field_150380_bt : Lnet/minecraft/block/Block;
    //   4399: aastore
    //   4400: dup
    //   4401: ldc2_w -1064679651
    //   4404: l2i
    //   4405: ldc_w -1064679633
    //   4408: ixor
    //   4409: getstatic Perryc.1 : I
    //   4412: ifeq -> 4426
    //   4415: ldc2_w 1127238625
    //   4418: l2i
    //   4419: ldc_w 341585675
    //   4422: ixor
    //   4423: goto -> 4434
    //   4426: ldc2_w 107870496
    //   4429: l2i
    //   4430: ldc_w -1058084454
    //   4433: ixor
    //   4434: ldc2_w -427304402
    //   4437: l2i
    //   4438: ldc_w -1270940257
    //   4441: ixor
    //   4442: ixor
    //   4443: lookupswitch default -> 4970, -1808124149 -> 4468, 97862491 -> 4426
    //   4468: getstatic net/minecraft/init/Blocks.field_150438_bZ : Lnet/minecraft/block/BlockHopper;
    //   4471: aastore
    //   4472: dup
    //   4473: ldc2_w -199509880
    //   4476: l2i
    //   4477: ldc_w -199509829
    //   4480: ixor
    //   4481: getstatic Perryc.0 : I
    //   4484: ifle -> 4498
    //   4487: ldc2_w 1430926011
    //   4490: l2i
    //   4491: ldc_w 1073416388
    //   4494: ixor
    //   4495: goto -> 4506
    //   4498: ldc2_w -1099042227
    //   4501: l2i
    //   4502: ldc_w -1316840329
    //   4505: ixor
    //   4506: ldc2_w -2139721636
    //   4509: l2i
    //   4510: ldc_w 770428824
    //   4513: ixor
    //   4514: ixor
    //   4515: lookupswitch default -> 4540, -1023933092 -> 4498, -953383493 -> 4982
    //   4540: getstatic net/minecraft/init/Blocks.field_185776_dc : Lnet/minecraft/block/Block;
    //   4543: aastore
    //   4544: dup
    //   4545: ldc2_w 1348341136
    //   4548: l2i
    //   4549: ldc_w 1348341156
    //   4552: ixor
    //   4553: getstatic Perryc.0 : I
    //   4556: ifle -> 4570
    //   4559: ldc2_w -199031487
    //   4562: l2i
    //   4563: ldc_w 1430185760
    //   4566: ixor
    //   4567: goto -> 4578
    //   4570: ldc2_w -1088593229
    //   4573: l2i
    //   4574: ldc_w 1314553201
    //   4577: ixor
    //   4578: ldc2_w -504645352
    //   4581: l2i
    //   4582: ldc_w 547607662
    //   4585: ixor
    //   4586: ixor
    //   4587: lookupswitch default -> 4902, 806318772 -> 4612, 1616219927 -> 4570
    //   4612: getstatic net/minecraft/init/Blocks.field_150483_bI : Lnet/minecraft/block/Block;
    //   4615: aastore
    //   4616: dup
    //   4617: ldc2_w 1102779597
    //   4620: l2i
    //   4621: ldc_w 1102779640
    //   4624: ixor
    //   4625: getstatic Perryc.0 : I
    //   4628: ifle -> 4642
    //   4631: ldc2_w 1626831196
    //   4634: l2i
    //   4635: ldc_w 2097420036
    //   4638: ixor
    //   4639: goto -> 4650
    //   4642: ldc2_w -1705927637
    //   4645: l2i
    //   4646: ldc_w 859009700
    //   4649: ixor
    //   4650: ldc2_w 159852851
    //   4653: l2i
    //   4654: ldc_w -101749146
    //   4657: ixor
    //   4658: ixor
    //   4659: lookupswitch default -> 4684, -308598515 -> 4910, 254331142 -> 4642
    //   4684: getstatic net/minecraft/init/Blocks.field_185777_dd : Lnet/minecraft/block/Block;
    //   4687: aastore
    //   4688: dup
    //   4689: ldc2_w 1024999397
    //   4692: l2i
    //   4693: ldc_w 1024999379
    //   4696: ixor
    //   4697: getstatic Perryc.0 : I
    //   4700: ifle -> 4714
    //   4703: ldc2_w 707986237
    //   4706: l2i
    //   4707: ldc_w 1352733595
    //   4710: ixor
    //   4711: goto -> 4722
    //   4714: ldc2_w 1001958402
    //   4717: l2i
    //   4718: ldc_w -1896140938
    //   4721: ixor
    //   4722: ldc2_w -1030791186
    //   4725: l2i
    //   4726: ldc_w -1310185496
    //   4729: ixor
    //   4730: ixor
    //   4731: lookupswitch default -> 4990, -970654862 -> 4756, 167078048 -> 4714
    //   4756: getstatic net/minecraft/init/Blocks.field_150462_ai : Lnet/minecraft/block/Block;
    //   4759: aastore
    //   4760: getstatic Perryc.1 : I
    //   4763: ifeq -> 4777
    //   4766: ldc2_w -1871661560
    //   4769: l2i
    //   4770: ldc_w 828591901
    //   4773: ixor
    //   4774: goto -> 4785
    //   4777: ldc2_w 184749248
    //   4780: l2i
    //   4781: ldc_w -772821614
    //   4784: ixor
    //   4785: ldc2_w -1399044283
    //   4788: l2i
    //   4789: ldc_w 1202005187
    //   4792: ixor
    //   4793: ixor
    //   4794: lookupswitch default -> 4820, -852619818 -> 4777, 1244306067 -> 5000
    //   4820: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4823: getstatic Perryc.c : I
    //   4826: iflt -> 4840
    //   4829: ldc2_w -827907362
    //   4832: l2i
    //   4833: ldc_w -206803817
    //   4836: ixor
    //   4837: goto -> 4848
    //   4840: ldc2_w 1088928073
    //   4843: l2i
    //   4844: ldc_w 816508467
    //   4847: ixor
    //   4848: ldc2_w -1076289405
    //   4851: l2i
    //   4852: ldc_w 53585672
    //   4855: ixor
    //   4856: ixor
    //   4857: lookupswitch default -> 4932, -2115778110 -> 4840, -861548303 -> 4884
    //   4884: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil.rightclickableBlocks : Ljava/util/List;
    //   4887: return
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
    //   4986: aconst_null
    //   4987: athrow
    //   4988: aconst_null
    //   4989: athrow
    //   4990: aconst_null
    //   4991: athrow
    //   4992: aconst_null
    //   4993: athrow
    //   4994: aconst_null
    //   4995: athrow
    //   4996: aconst_null
    //   4997: athrow
    //   4998: aconst_null
    //   4999: athrow
    //   5000: aconst_null
    //   5001: athrow
    //   5002: aconst_null
    //   5003: athrow
    //   5004: aconst_null
    //   5005: athrow
    //   5006: aconst_null
    //   5007: athrow
    //   5008: aconst_null
    //   5009: athrow
    //   5010: aconst_null
    //   5011: athrow
    //   5012: aconst_null
    //   5013: athrow
    //   5014: aconst_null
    //   5015: athrow
    //   5016: aconst_null
    //   5017: athrow
    //   5018: aconst_null
    //   5019: athrow
    //   5020: aconst_null
    //   5021: athrow
    //   5022: aconst_null
    //   5023: athrow
  }
  
  public static EnumFacing getFirstFacing(BlockPos paramBlockPos) {
    return Perry1.03(null, (int)367885703L ^ 0x5D5E8EDF, paramBlockPos);
  }
  
  public static void placeCrystalOnBlock(BlockPos pos, EnumHand hand, boolean swing) {
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
  
  public static IBlockState getState(BlockPos paramBlockPos) {
    return Perry1.6u(null, (int)1914646075L ^ 0x37FDD186, paramBlockPos);
  }
  
  public static int isPositionPlaceable(BlockPos paramBlockPos, boolean paramBoolean) {
    return Perry1.M(null, (int)-2038728662L ^ 0x91608D38, paramBlockPos, paramBoolean);
  }
  
  public static boolean placeBlock(BlockPos pos, int slot, boolean rotate, boolean rotateBack) {
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
  
  public static boolean hasNeighbour(BlockPos paramBlockPos) {
    return Perry1.6f(null, (int)1467293188L ^ 0x2229AE13, paramBlockPos);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreeBlockUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */