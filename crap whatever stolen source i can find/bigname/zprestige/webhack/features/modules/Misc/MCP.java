package bigname.zprestige.webhack.features.modules.Misc;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class MCP extends Module {
  public Setting<MCP$Mode> mode;
  
  public boolean clicked;
  
  public Setting<Integer> rotation;
  
  public Setting<Boolean> stopRotation;
  
  public void onEnable() {
    Perry1.4h(this, (int)1213330241L ^ 0x36C9E824);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.27(this, (int)1191286900L ^ 0x663480B2, paramObject);
  }
  
  public void throwPearl() {
    Perry1.3Y(this, (int)1263743302L ^ 0x14DDD38D);
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
  
  public MCP() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -239385503
    //   9: l2i
    //   10: ldc -1478079076
    //   12: ixor
    //   13: goto -> 24
    //   16: ldc2_w -1719976265
    //   19: l2i
    //   20: ldc_w 1737159668
    //   23: ixor
    //   24: ldc2_w 971314816
    //   27: l2i
    //   28: ldc_w -1394280033
    //   31: ixor
    //   32: ixor
    //   33: lookupswitch default -> 2070, -1017321758 -> 16, 1810899548 -> 60
    //   60: aload_0
    //   61: ldc_w '䪈㌰䫿'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w 424748628
    //   73: l2i
    //   74: ldc_w -424944534
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -76486054
    //   84: l2i
    //   85: ldc_w -1584739321
    //   88: ixor
    //   89: ldc2_w -850334855
    //   92: l2i
    //   93: ldc_w 334251663
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 2098, -2075751509 -> 124, 558258120 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '䪑㌛䫝㶸ꐊู㜉踣ꓬਦ蝯煭'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -1558039341
    //   139: l2i
    //   140: ldc_w -1403908615
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1823587692
    //   150: l2i
    //   151: ldc_w -186260830
    //   154: ixor
    //   155: ldc2_w 690916955
    //   158: l2i
    //   159: ldc_w 2038088782
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 2060, 939518499 -> 192, 1596224319 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 212
    //   201: ldc2_w -1287503367
    //   204: l2i
    //   205: ldc_w -1323099247
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1114762654
    //   215: l2i
    //   216: ldc_w -1581040267
    //   219: ixor
    //   220: ldc2_w 272922286
    //   223: l2i
    //   224: ldc_w 1108083865
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 2084, -1308974372 -> 256, 1344874591 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MISC : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1669033605
    //   262: l2i
    //   263: ldc_w -1669033605
    //   266: ixor
    //   267: ldc2_w -496556003
    //   270: l2i
    //   271: ldc_w -496556003
    //   274: ixor
    //   275: ldc2_w 1332890638
    //   278: l2i
    //   279: ldc_w 1332890638
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -90640106
    //   292: l2i
    //   293: ldc_w 2132811645
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1897495701
    //   303: l2i
    //   304: ldc_w 1371877147
    //   307: ixor
    //   308: ldc2_w -1387788793
    //   311: l2i
    //   312: ldc_w 1344585730
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 2080, 575629941 -> 344, 2027169902 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w -2100265311
    //   356: l2i
    //   357: ldc_w -361832992
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1578507959
    //   367: l2i
    //   368: ldc_w 2140794894
    //   371: ixor
    //   372: ldc2_w 1498318816
    //   375: l2i
    //   376: ldc_w 556554050
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -573016015 -> 364, 282883043 -> 2094
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w 847038443
    //   418: l2i
    //   419: ldc_w 529512101
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 2058946569
    //   429: l2i
    //   430: ldc_w -673460685
    //   433: ixor
    //   434: ldc2_w -1716091533
    //   437: l2i
    //   438: ldc_w -1693839214
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -968528959 -> 426, 793765039 -> 2078
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '䪈㌜䫋㶲'
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w -2010974321
    //   485: l2i
    //   486: ldc_w -719195746
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 749821788
    //   496: l2i
    //   497: ldc_w 1884490676
    //   500: ixor
    //   501: ldc2_w -1094516319
    //   504: l2i
    //   505: ldc_w 1357691011
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 2108, -1295127094 -> 536, -1288913101 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: getstatic Perryc.1 : I
    //   542: ifeq -> 556
    //   545: ldc2_w -1086362629
    //   548: l2i
    //   549: ldc_w -1023000592
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w -1007574972
    //   559: l2i
    //   560: ldc_w -650932388
    //   563: ixor
    //   564: ldc2_w -1345785430
    //   567: l2i
    //   568: ldc_w -212044878
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 600, 548263443 -> 2082, 1391277994 -> 556
    //   600: getstatic bigname/zprestige/webhack/features/modules/Misc/MCP$Mode.MIDDLECLICK : Lbigname/zprestige/webhack/features/modules/Misc/MCP$Mode;
    //   603: getstatic Perryc.0 : I
    //   606: ifle -> 620
    //   609: ldc2_w 777933594
    //   612: l2i
    //   613: ldc_w -1049070827
    //   616: ixor
    //   617: goto -> 628
    //   620: ldc2_w 1775495990
    //   623: l2i
    //   624: ldc_w -1651711300
    //   627: ixor
    //   628: ldc2_w -890020333
    //   631: l2i
    //   632: ldc_w -633178128
    //   635: ixor
    //   636: ixor
    //   637: lookupswitch default -> 664, -1966015006 -> 620, -6878740 -> 2106
    //   664: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   667: getstatic Perryc.0 : I
    //   670: ifle -> 684
    //   673: ldc2_w 493226050
    //   676: l2i
    //   677: ldc_w 1345251067
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w 2043630974
    //   687: l2i
    //   688: ldc_w 1715585718
    //   691: ixor
    //   692: ldc2_w 359848915
    //   695: l2i
    //   696: ldc_w 899326178
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 2054, 1063709945 -> 728, 1839240584 -> 684
    //   728: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   731: getstatic Perryc.c : I
    //   734: iflt -> 748
    //   737: ldc2_w 1655199768
    //   740: l2i
    //   741: ldc_w 2010901170
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w -487702604
    //   751: l2i
    //   752: ldc_w -2050814175
    //   755: ixor
    //   756: ldc2_w -664009340
    //   759: l2i
    //   760: ldc_w -1956164280
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 792, -2083034842 -> 748, 1182333542 -> 2104
    //   792: putfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   795: getstatic Perryc.c : I
    //   798: iflt -> 812
    //   801: ldc2_w -333471925
    //   804: l2i
    //   805: ldc_w 1303849013
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w -676982987
    //   815: l2i
    //   816: ldc_w 1562627634
    //   819: ixor
    //   820: ldc2_w 1140775485
    //   823: l2i
    //   824: ldc_w -726265466
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 2058, 499976892 -> 856, 920681669 -> 812
    //   856: aload_0
    //   857: getstatic Perryc.1 : I
    //   860: ifeq -> 874
    //   863: ldc2_w -504734387
    //   866: l2i
    //   867: ldc_w 494051428
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 1760393735
    //   877: l2i
    //   878: ldc_w 459383603
    //   881: ixor
    //   882: ldc2_w -379457349
    //   885: l2i
    //   886: ldc_w 1308734523
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 2110, -722690636 -> 916, 1543027113 -> 874
    //   916: aload_0
    //   917: new bigname/zprestige/webhack/features/setting/Setting
    //   920: dup
    //   921: ldc_w '䪗㌜䫛㶶ꐐ๶㜆'
    //   924: getstatic Perryc.c : I
    //   927: iflt -> 941
    //   930: ldc2_w 1578271430
    //   933: l2i
    //   934: ldc_w 1013845820
    //   937: ixor
    //   938: goto -> 949
    //   941: ldc2_w -975867921
    //   944: l2i
    //   945: ldc_w 303544332
    //   948: ixor
    //   949: ldc2_w 1533124628
    //   952: l2i
    //   953: ldc_w 1908575258
    //   956: ixor
    //   957: ixor
    //   958: lookupswitch default -> 2086, -43910163 -> 984, 1222615540 -> 941
    //   984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   987: ldc2_w 825268732
    //   990: l2i
    //   991: ldc_w 825268733
    //   994: ixor
    //   995: getstatic Perryc.c : I
    //   998: iflt -> 1012
    //   1001: ldc2_w -707798228
    //   1004: l2i
    //   1005: ldc_w 1232949580
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w -747740242
    //   1015: l2i
    //   1016: ldc_w 1290159166
    //   1019: ixor
    //   1020: ldc2_w -1030631975
    //   1023: l2i
    //   1024: ldc_w -363130498
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 2088, -1267181881 -> 1012, -1220347081 -> 1056
    //   1056: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1059: getstatic Perryc.c : I
    //   1062: iflt -> 1076
    //   1065: ldc2_w -815632165
    //   1068: l2i
    //   1069: ldc_w -922642205
    //   1072: ixor
    //   1073: goto -> 1084
    //   1076: ldc2_w 40483655
    //   1079: l2i
    //   1080: ldc_w -2037630079
    //   1083: ixor
    //   1084: ldc2_w 1292962972
    //   1087: l2i
    //   1088: ldc_w -2027476699
    //   1091: ixor
    //   1092: ixor
    //   1093: lookupswitch default -> 1120, -1205624757 -> 1076, -866792063 -> 2062
    //   1120: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1123: getstatic Perryc.1 : I
    //   1126: ifeq -> 1140
    //   1129: ldc2_w -1234711578
    //   1132: l2i
    //   1133: ldc_w -436372808
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w 2094090390
    //   1143: l2i
    //   1144: ldc_w 1131327718
    //   1147: ixor
    //   1148: ldc2_w 299236380
    //   1151: l2i
    //   1152: ldc_w -1911596874
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 2072, -1603969830 -> 1184, -868215308 -> 1140
    //   1184: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1187: getstatic Perryc.c : I
    //   1190: iflt -> 1204
    //   1193: ldc2_w 1147796492
    //   1196: l2i
    //   1197: ldc_w -1086613253
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 63303564
    //   1207: l2i
    //   1208: ldc_w -594685577
    //   1211: ixor
    //   1212: ldc2_w 1547168277
    //   1215: l2i
    //   1216: ldc_w 287245542
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 2068, -1839149048 -> 1248, -1233483260 -> 1204
    //   1248: putfield stopRotation : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1251: getstatic Perryc.c : I
    //   1254: iflt -> 1268
    //   1257: ldc2_w -1190585258
    //   1260: l2i
    //   1261: ldc_w 1549221238
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 91806824
    //   1271: l2i
    //   1272: ldc_w 1269943312
    //   1275: ixor
    //   1276: ldc2_w 708190373
    //   1279: l2i
    //   1280: ldc_w -717134434
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 2074, -1312926397 -> 1312, 438920219 -> 1268
    //   1312: aload_0
    //   1313: getstatic Perryc.0 : I
    //   1316: ifle -> 1330
    //   1319: ldc2_w -2041965643
    //   1322: l2i
    //   1323: ldc_w -973113634
    //   1326: ixor
    //   1327: goto -> 1338
    //   1330: ldc2_w -1597711094
    //   1333: l2i
    //   1334: ldc_w 1622997650
    //   1337: ixor
    //   1338: ldc2_w -1382731256
    //   1341: l2i
    //   1342: ldc_w 81649365
    //   1345: ixor
    //   1346: ixor
    //   1347: lookupswitch default -> 2090, -352482890 -> 1330, 1764805445 -> 1372
    //   1372: aload_0
    //   1373: new bigname/zprestige/webhack/features/setting/Setting
    //   1376: dup
    //   1377: ldc_w '䪁㌖䫃㶶'
    //   1380: getstatic Perryc.0 : I
    //   1383: ifle -> 1397
    //   1386: ldc2_w -1810946202
    //   1389: l2i
    //   1390: ldc_w -1669931398
    //   1393: ixor
    //   1394: goto -> 1405
    //   1397: ldc2_w -1630073720
    //   1400: l2i
    //   1401: ldc_w -283779024
    //   1404: ixor
    //   1405: ldc2_w -33499833
    //   1408: l2i
    //   1409: ldc_w -1558129320
    //   1412: ixor
    //   1413: ixor
    //   1414: lookupswitch default -> 2066, 753069223 -> 1440, 1431959811 -> 1397
    //   1440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1443: ldc2_w 1947497424
    //   1446: l2i
    //   1447: ldc_w 1947497434
    //   1450: ixor
    //   1451: getstatic Perryc.1 : I
    //   1454: ifeq -> 1468
    //   1457: ldc2_w 1844272049
    //   1460: l2i
    //   1461: ldc_w -2133902818
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w 1135019212
    //   1471: l2i
    //   1472: ldc_w -147246871
    //   1475: ixor
    //   1476: ldc2_w 477803001
    //   1479: l2i
    //   1480: ldc_w 282857902
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 1512, -511393288 -> 2100, 1382780970 -> 1468
    //   1512: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1515: ldc2_w -996402871
    //   1518: l2i
    //   1519: ldc_w -996402871
    //   1522: ixor
    //   1523: getstatic Perryc.c : I
    //   1526: iflt -> 1540
    //   1529: ldc2_w 1955623931
    //   1532: l2i
    //   1533: ldc_w 231787669
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w -592391439
    //   1543: l2i
    //   1544: ldc_w 689088195
    //   1547: ixor
    //   1548: ldc2_w -194835065
    //   1551: l2i
    //   1552: ldc_w -930987416
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 1584, 253913489 -> 1540, 1168240769 -> 2112
    //   1584: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1587: ldc2_w 1432775171
    //   1590: l2i
    //   1591: ldc_w 1432775271
    //   1594: ixor
    //   1595: getstatic Perryc.0 : I
    //   1598: ifle -> 1612
    //   1601: ldc2_w -1259968123
    //   1604: l2i
    //   1605: ldc_w -774265985
    //   1608: ixor
    //   1609: goto -> 1620
    //   1612: ldc2_w -2116104422
    //   1615: l2i
    //   1616: ldc_w -468649474
    //   1619: ixor
    //   1620: ldc2_w -57482410
    //   1623: l2i
    //   1624: ldc_w -1416310062
    //   1627: ixor
    //   1628: ixor
    //   1629: lookupswitch default -> 1656, 842660734 -> 2092, 2102048778 -> 1612
    //   1656: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1659: getstatic Perryc.0 : I
    //   1662: ifle -> 1676
    //   1665: ldc2_w 785394654
    //   1668: l2i
    //   1669: ldc_w -812173619
    //   1672: ixor
    //   1673: goto -> 1684
    //   1676: ldc2_w 709653626
    //   1679: l2i
    //   1680: ldc_w 2076005436
    //   1683: ixor
    //   1684: ldc2_w 1311316700
    //   1687: l2i
    //   1688: ldc_w 775465340
    //   1691: ixor
    //   1692: ixor
    //   1693: lookupswitch default -> 2076, -2125025613 -> 1676, 836801510 -> 1720
    //   1720: aload_0
    //   1721: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Misc/MCP;)Ljava/util/function/Predicate;
    //   1726: getstatic Perryc.0 : I
    //   1729: ifle -> 1743
    //   1732: ldc2_w 2110222379
    //   1735: l2i
    //   1736: ldc_w -948591640
    //   1739: ixor
    //   1740: goto -> 1751
    //   1743: ldc2_w -427539581
    //   1746: l2i
    //   1747: ldc_w -1945845313
    //   1750: ixor
    //   1751: ldc2_w 1325086065
    //   1754: l2i
    //   1755: ldc_w -1272549969
    //   1758: ixor
    //   1759: ixor
    //   1760: lookupswitch default -> 2064, -1872897310 -> 1788, 1081051933 -> 1743
    //   1788: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1791: getstatic Perryc.1 : I
    //   1794: ifeq -> 1808
    //   1797: ldc2_w -1182547822
    //   1800: l2i
    //   1801: ldc_w 1320316958
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -577903414
    //   1811: l2i
    //   1812: ldc_w 101385628
    //   1815: ixor
    //   1816: ldc2_w -1829351420
    //   1819: l2i
    //   1820: ldc_w 1854580360
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 1852, -1346009052 -> 1808, 189613568 -> 2052
    //   1852: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1855: getstatic Perryc.0 : I
    //   1858: ifle -> 1872
    //   1861: ldc2_w 1443696595
    //   1864: l2i
    //   1865: ldc_w -1911740526
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w -1929616887
    //   1875: l2i
    //   1876: ldc_w -1226350300
    //   1879: ixor
    //   1880: ldc2_w 1664734269
    //   1883: l2i
    //   1884: ldc_w 2123742314
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 1916, -978567146 -> 2096, -316919331 -> 1872
    //   1916: putfield rotation : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1919: getstatic Perryc.1 : I
    //   1922: ifeq -> 1936
    //   1925: ldc2_w 1999250908
    //   1928: l2i
    //   1929: ldc_w -900412394
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w -829988562
    //   1939: l2i
    //   1940: ldc_w -1951524338
    //   1943: ixor
    //   1944: ldc2_w 1695005508
    //   1947: l2i
    //   1948: ldc_w -1563868673
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 2102, -2098757221 -> 1980, 2058359665 -> 1936
    //   1980: aload_0
    //   1981: ldc2_w 72638649
    //   1984: l2i
    //   1985: ldc_w 72638649
    //   1988: ixor
    //   1989: getstatic Perryc.1 : I
    //   1992: ifeq -> 2006
    //   1995: ldc2_w -280051309
    //   1998: l2i
    //   1999: ldc_w -645017315
    //   2002: ixor
    //   2003: goto -> 2014
    //   2006: ldc2_w 737264196
    //   2009: l2i
    //   2010: ldc_w 1024032580
    //   2013: ixor
    //   2014: ldc2_w -198602073
    //   2017: l2i
    //   2018: ldc_w -316929501
    //   2021: ixor
    //   2022: ixor
    //   2023: lookupswitch default -> 2056, 265102724 -> 2048, 804685834 -> 2006
    //   2048: putfield clicked : Z
    //   2051: return
    //   2052: aconst_null
    //   2053: athrow
    //   2054: aconst_null
    //   2055: athrow
    //   2056: aconst_null
    //   2057: athrow
    //   2058: aconst_null
    //   2059: athrow
    //   2060: aconst_null
    //   2061: athrow
    //   2062: aconst_null
    //   2063: athrow
    //   2064: aconst_null
    //   2065: athrow
    //   2066: aconst_null
    //   2067: athrow
    //   2068: aconst_null
    //   2069: athrow
    //   2070: aconst_null
    //   2071: athrow
    //   2072: aconst_null
    //   2073: athrow
    //   2074: aconst_null
    //   2075: athrow
    //   2076: aconst_null
    //   2077: athrow
    //   2078: aconst_null
    //   2079: athrow
    //   2080: aconst_null
    //   2081: athrow
    //   2082: aconst_null
    //   2083: athrow
    //   2084: aconst_null
    //   2085: athrow
    //   2086: aconst_null
    //   2087: athrow
    //   2088: aconst_null
    //   2089: athrow
    //   2090: aconst_null
    //   2091: athrow
    //   2092: aconst_null
    //   2093: athrow
    //   2094: aconst_null
    //   2095: athrow
    //   2096: aconst_null
    //   2097: athrow
    //   2098: aconst_null
    //   2099: athrow
    //   2100: aconst_null
    //   2101: athrow
    //   2102: aconst_null
    //   2103: athrow
    //   2104: aconst_null
    //   2105: athrow
    //   2106: aconst_null
    //   2107: athrow
    //   2108: aconst_null
    //   2109: athrow
    //   2110: aconst_null
    //   2111: athrow
    //   2112: aconst_null
    //   2113: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2052	0	this	Lbigname/zprestige/webhack/features/modules/Misc/MCP;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Misc\MCP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */