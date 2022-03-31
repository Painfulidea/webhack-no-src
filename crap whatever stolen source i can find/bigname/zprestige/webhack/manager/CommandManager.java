package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.command.Command;
import java.util.ArrayList;

public class CommandManager extends Feature {
  public ArrayList<Command> commands;
  
  public String clientMessage;
  
  public String prefix;
  
  public void setPrefix(String paramString) {
    Perry1.1f(this, (int)-743554355L ^ 0x8359A647, paramString);
  }
  
  public String getPrefix() {
    return Perry1.p(this, (int)1216611611L ^ 0x83BD4F2);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public CommandManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 510774722
    //   9: l2i
    //   10: ldc -2054348708
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 2066859598
    //   19: l2i
    //   20: ldc -1488554963
    //   22: ixor
    //   23: ldc2_w 905306246
    //   26: l2i
    //   27: ldc -1554437998
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 206670174 -> 16, 223356298 -> 3035
    //   56: aload_0
    //   57: ldc '詵㌜許㶺㧔擤๽'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -526920835
    //   68: l2i
    //   69: ldc 1220613348
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1704726309
    //   78: l2i
    //   79: ldc 1255403831
    //   81: ixor
    //   82: ldc2_w -1282132000
    //   85: l2i
    //   86: ldc 1918916873
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 3001, -289697541 -> 116, 1772267888 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w 2039803811
    //   128: l2i
    //   129: ldc 1778282619
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1086832084
    //   138: l2i
    //   139: ldc -1179355510
    //   141: ixor
    //   142: ldc2_w 1575067852
    //   145: l2i
    //   146: ldc 370725311
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 2955, -1299531219 -> 176, 1536421547 -> 135
    //   176: invokespecial <init> : (Ljava/lang/String;)V
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -414435441
    //   188: l2i
    //   189: ldc -1415700489
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -78138866
    //   198: l2i
    //   199: ldc -762200308
    //   201: ixor
    //   202: ldc2_w 2147142053
    //   205: l2i
    //   206: ldc 420286892
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 2985, 707129457 -> 195, 1328665867 -> 236
    //   236: aload_0
    //   237: new java/util/ArrayList
    //   240: dup
    //   241: getstatic Perryc.1 : I
    //   244: ifeq -> 257
    //   247: ldc2_w 587784515
    //   250: l2i
    //   251: ldc -1636586973
    //   253: ixor
    //   254: goto -> 264
    //   257: ldc2_w 1023525716
    //   260: l2i
    //   261: ldc -2041345858
    //   263: ixor
    //   264: ldc2_w -1332138405
    //   267: l2i
    //   268: ldc -874112936
    //   270: ixor
    //   271: ixor
    //   272: lookupswitch default -> 300, -1956242945 -> 257, -972784285 -> 3007
    //   300: invokespecial <init> : ()V
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 319
    //   309: ldc2_w -670557716
    //   312: l2i
    //   313: ldc -1039842192
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w 1785077711
    //   322: l2i
    //   323: ldc 1196683380
    //   325: ixor
    //   326: ldc2_w 135822713
    //   329: l2i
    //   330: ldc 13259327
    //   332: ixor
    //   333: ixor
    //   334: lookupswitch default -> 2961, 316633818 -> 319, 635945213 -> 360
    //   360: putfield commands : Ljava/util/ArrayList;
    //   363: getstatic Perryc.1 : I
    //   366: ifeq -> 379
    //   369: ldc2_w -5998642
    //   372: l2i
    //   373: ldc 437795451
    //   375: ixor
    //   376: goto -> 386
    //   379: ldc2_w -301426562
    //   382: l2i
    //   383: ldc 1771657484
    //   385: ixor
    //   386: ldc2_w -2070651285
    //   389: l2i
    //   390: ldc -1868448685
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 3003, -1817959606 -> 420, -242634867 -> 379
    //   420: aload_0
    //   421: ldc '訊㌤訹㶵㧽擫๺踽'
    //   423: getstatic Perryc.c : I
    //   426: iflt -> 439
    //   429: ldc2_w -252659885
    //   432: l2i
    //   433: ldc 1739820325
    //   435: ixor
    //   436: goto -> 446
    //   439: ldc2_w -809552834
    //   442: l2i
    //   443: ldc -1868080719
    //   445: ixor
    //   446: ldc2_w -919980890
    //   449: l2i
    //   450: ldc 1748142800
    //   452: ixor
    //   453: ixor
    //   454: lookupswitch default -> 2979, -33500167 -> 480, 911967232 -> 439
    //   480: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   483: getstatic Perryc.0 : I
    //   486: ifle -> 499
    //   489: ldc2_w 1068869982
    //   492: l2i
    //   493: ldc 1742020227
    //   495: ixor
    //   496: goto -> 506
    //   499: ldc2_w -1933940471
    //   502: l2i
    //   503: ldc -803666428
    //   505: ixor
    //   506: ldc2_w -280718599
    //   509: l2i
    //   510: ldc -739855921
    //   512: ixor
    //   513: ixor
    //   514: lookupswitch default -> 540, 1096978897 -> 499, 1690473707 -> 2947
    //   540: putfield clientMessage : Ljava/lang/String;
    //   543: getstatic Perryc.0 : I
    //   546: ifle -> 559
    //   549: ldc2_w -1913568219
    //   552: l2i
    //   553: ldc -980537694
    //   555: ixor
    //   556: goto -> 566
    //   559: ldc2_w -1941683571
    //   562: l2i
    //   563: ldc -1443713458
    //   565: ixor
    //   566: ldc2_w -28257263
    //   569: l2i
    //   570: ldc 1777314836
    //   572: ixor
    //   573: ixor
    //   574: lookupswitch default -> 2959, -1307994938 -> 600, -541060478 -> 559
    //   600: aload_0
    //   601: ldc '='
    //   603: getstatic Perryc.c : I
    //   606: iflt -> 619
    //   609: ldc2_w -448432963
    //   612: l2i
    //   613: ldc 746455275
    //   615: ixor
    //   616: goto -> 626
    //   619: ldc2_w 1796385258
    //   622: l2i
    //   623: ldc -1000295812
    //   625: ixor
    //   626: ldc2_w -1906042200
    //   629: l2i
    //   630: ldc 13114341
    //   632: ixor
    //   633: ixor
    //   634: lookupswitch default -> 3011, 568203995 -> 660, 1201108251 -> 619
    //   660: putfield prefix : Ljava/lang/String;
    //   663: getstatic Perryc.c : I
    //   666: iflt -> 679
    //   669: ldc2_w -918918649
    //   672: l2i
    //   673: ldc 1489406724
    //   675: ixor
    //   676: goto -> 686
    //   679: ldc2_w 1859554676
    //   682: l2i
    //   683: ldc -619278101
    //   685: ixor
    //   686: ldc2_w 1960427618
    //   689: l2i
    //   690: ldc 634467388
    //   692: ixor
    //   693: ixor
    //   694: lookupswitch default -> 3027, -1057745571 -> 679, -456595007 -> 720
    //   720: aload_0
    //   721: getstatic Perryc.1 : I
    //   724: ifeq -> 737
    //   727: ldc2_w -1327944907
    //   730: l2i
    //   731: ldc -362283523
    //   733: ixor
    //   734: goto -> 744
    //   737: ldc2_w 1625863068
    //   740: l2i
    //   741: ldc 664475032
    //   743: ixor
    //   744: ldc2_w -326591686
    //   747: l2i
    //   748: ldc -2100056607
    //   750: ixor
    //   751: ixor
    //   752: lookupswitch default -> 780, 522365276 -> 737, 887480339 -> 3019
    //   780: getfield commands : Ljava/util/ArrayList;
    //   783: new bigname/zprestige/webhack/features/command/commands/BindCommand
    //   786: dup
    //   787: getstatic Perryc.c : I
    //   790: iflt -> 803
    //   793: ldc2_w -557319472
    //   796: l2i
    //   797: ldc 37936420
    //   799: ixor
    //   800: goto -> 810
    //   803: ldc2_w 1453128269
    //   806: l2i
    //   807: ldc 760186475
    //   809: ixor
    //   810: ldc2_w 1561673870
    //   813: l2i
    //   814: ldc 368596844
    //   816: ixor
    //   817: ixor
    //   818: lookupswitch default -> 844, -1805111274 -> 2963, -199027186 -> 803
    //   844: invokespecial <init> : ()V
    //   847: getstatic Perryc.1 : I
    //   850: ifeq -> 863
    //   853: ldc2_w -1723572951
    //   856: l2i
    //   857: ldc 1233853814
    //   859: ixor
    //   860: goto -> 870
    //   863: ldc2_w 809380597
    //   866: l2i
    //   867: ldc -2023740072
    //   869: ixor
    //   870: ldc2_w -773952486
    //   873: l2i
    //   874: ldc -118280075
    //   876: ixor
    //   877: ixor
    //   878: lookupswitch default -> 904, -102622160 -> 3037, 1512875938 -> 863
    //   904: invokevirtual add : (Ljava/lang/Object;)Z
    //   907: pop
    //   908: getstatic Perryc.0 : I
    //   911: ifle -> 924
    //   914: ldc2_w -1226854214
    //   917: l2i
    //   918: ldc 386471155
    //   920: ixor
    //   921: goto -> 931
    //   924: ldc2_w 802569975
    //   927: l2i
    //   928: ldc -1003880374
    //   930: ixor
    //   931: ldc2_w -1519805611
    //   934: l2i
    //   935: ldc -2115859878
    //   937: ixor
    //   938: ixor
    //   939: lookupswitch default -> 2965, -2057456314 -> 924, -814272590 -> 964
    //   964: aload_0
    //   965: getstatic Perryc.1 : I
    //   968: ifeq -> 981
    //   971: ldc2_w -872224267
    //   974: l2i
    //   975: ldc 66342433
    //   977: ixor
    //   978: goto -> 988
    //   981: ldc2_w 384096650
    //   984: l2i
    //   985: ldc 92770894
    //   987: ixor
    //   988: ldc2_w 1791735195
    //   991: l2i
    //   992: ldc 1545712926
    //   994: ixor
    //   995: ixor
    //   996: lookupswitch default -> 2949, -115562671 -> 981, 629754689 -> 1024
    //   1024: getfield commands : Ljava/util/ArrayList;
    //   1027: new bigname/zprestige/webhack/features/command/commands/ModuleCommand
    //   1030: dup
    //   1031: getstatic Perryc.1 : I
    //   1034: ifeq -> 1047
    //   1037: ldc2_w -1526997064
    //   1040: l2i
    //   1041: ldc -1173271191
    //   1043: ixor
    //   1044: goto -> 1054
    //   1047: ldc2_w 1678835286
    //   1050: l2i
    //   1051: ldc 1485230479
    //   1053: ixor
    //   1054: ldc2_w 1571215150
    //   1057: l2i
    //   1058: ldc 1470986627
    //   1060: ixor
    //   1061: ixor
    //   1062: lookupswitch default -> 1088, 350305404 -> 3021, 1370931594 -> 1047
    //   1088: invokespecial <init> : ()V
    //   1091: getstatic Perryc.0 : I
    //   1094: ifle -> 1107
    //   1097: ldc2_w 481551645
    //   1100: l2i
    //   1101: ldc 1599581452
    //   1103: ixor
    //   1104: goto -> 1114
    //   1107: ldc2_w 466716217
    //   1110: l2i
    //   1111: ldc -766257404
    //   1113: ixor
    //   1114: ldc2_w -2046978811
    //   1117: l2i
    //   1118: ldc 1959989876
    //   1120: ixor
    //   1121: ixor
    //   1122: lookupswitch default -> 1148, -1295331488 -> 3009, 994793645 -> 1107
    //   1148: invokevirtual add : (Ljava/lang/Object;)Z
    //   1151: pop
    //   1152: getstatic Perryc.c : I
    //   1155: iflt -> 1168
    //   1158: ldc2_w 458568577
    //   1161: l2i
    //   1162: ldc 108087949
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w -2023400542
    //   1171: l2i
    //   1172: ldc_w 979897414
    //   1175: ixor
    //   1176: ldc2_w -1165336007
    //   1179: l2i
    //   1180: ldc_w -358752034
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 1212, 290583239 -> 1168, 1295252459 -> 3005
    //   1212: aload_0
    //   1213: getstatic Perryc.0 : I
    //   1216: ifle -> 1230
    //   1219: ldc2_w 841911599
    //   1222: l2i
    //   1223: ldc_w -1438836240
    //   1226: ixor
    //   1227: goto -> 1238
    //   1230: ldc2_w -1032684444
    //   1233: l2i
    //   1234: ldc_w 785526377
    //   1237: ixor
    //   1238: ldc2_w 1754518552
    //   1241: l2i
    //   1242: ldc_w 160081290
    //   1245: ixor
    //   1246: ixor
    //   1247: lookupswitch default -> 1272, -116726451 -> 3033, 362773420 -> 1230
    //   1272: getfield commands : Ljava/util/ArrayList;
    //   1275: new bigname/zprestige/webhack/features/command/commands/PrefixCommand
    //   1278: dup
    //   1279: getstatic Perryc.1 : I
    //   1282: ifeq -> 1296
    //   1285: ldc2_w 81326042
    //   1288: l2i
    //   1289: ldc_w -1099771497
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w -737954755
    //   1299: l2i
    //   1300: ldc_w -464557078
    //   1303: ixor
    //   1304: ldc2_w 547023667
    //   1307: l2i
    //   1308: ldc_w -928454319
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 1340, 1385708591 -> 2957, 1766780494 -> 1296
    //   1340: invokespecial <init> : ()V
    //   1343: getstatic Perryc.0 : I
    //   1346: ifle -> 1360
    //   1349: ldc2_w -509409374
    //   1352: l2i
    //   1353: ldc_w 1591551254
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w -982200262
    //   1363: l2i
    //   1364: ldc_w -1610326943
    //   1367: ixor
    //   1368: ldc2_w -1040483268
    //   1371: l2i
    //   1372: ldc_w 383405552
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 1404, 181633800 -> 1360, 1751061368 -> 2969
    //   1404: invokevirtual add : (Ljava/lang/Object;)Z
    //   1407: pop
    //   1408: getstatic Perryc.1 : I
    //   1411: ifeq -> 1425
    //   1414: ldc2_w -1106345180
    //   1417: l2i
    //   1418: ldc_w -177317522
    //   1421: ixor
    //   1422: goto -> 1433
    //   1425: ldc2_w 1676606691
    //   1428: l2i
    //   1429: ldc_w 218718267
    //   1432: ixor
    //   1433: ldc2_w 89124787
    //   1436: l2i
    //   1437: ldc_w 802522542
    //   1440: ixor
    //   1441: ixor
    //   1442: lookupswitch default -> 2973, 1149105861 -> 1468, 1643819095 -> 1425
    //   1468: aload_0
    //   1469: getstatic Perryc.1 : I
    //   1472: ifeq -> 1486
    //   1475: ldc2_w -16730876
    //   1478: l2i
    //   1479: ldc_w 1912512234
    //   1482: ixor
    //   1483: goto -> 1494
    //   1486: ldc2_w -1409406855
    //   1489: l2i
    //   1490: ldc_w 1082655957
    //   1493: ixor
    //   1494: ldc2_w 712155658
    //   1497: l2i
    //   1498: ldc_w 73246357
    //   1501: ixor
    //   1502: ixor
    //   1503: lookupswitch default -> 2977, -1596903567 -> 1486, -984012749 -> 1528
    //   1528: getfield commands : Ljava/util/ArrayList;
    //   1531: new bigname/zprestige/webhack/features/command/commands/ConfigCommand
    //   1534: dup
    //   1535: getstatic Perryc.1 : I
    //   1538: ifeq -> 1552
    //   1541: ldc2_w 321112265
    //   1544: l2i
    //   1545: ldc_w -1088452781
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w -1512328450
    //   1555: l2i
    //   1556: ldc_w -968106007
    //   1559: ixor
    //   1560: ldc2_w -1152419598
    //   1563: l2i
    //   1564: ldc_w -1520596986
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 1596, -1305559186 -> 3023, -506550094 -> 1552
    //   1596: invokespecial <init> : ()V
    //   1599: getstatic Perryc.0 : I
    //   1602: ifle -> 1616
    //   1605: ldc2_w -94698016
    //   1608: l2i
    //   1609: ldc_w -920221523
    //   1612: ixor
    //   1613: goto -> 1624
    //   1616: ldc2_w -1404591701
    //   1619: l2i
    //   1620: ldc_w 1235296902
    //   1623: ixor
    //   1624: ldc2_w 1789474896
    //   1627: l2i
    //   1628: ldc_w 164797964
    //   1631: ixor
    //   1632: ixor
    //   1633: lookupswitch default -> 1660, -1935479470 -> 1616, 1342581521 -> 2953
    //   1660: invokevirtual add : (Ljava/lang/Object;)Z
    //   1663: pop
    //   1664: getstatic Perryc.c : I
    //   1667: iflt -> 1681
    //   1670: ldc2_w -1241966384
    //   1673: l2i
    //   1674: ldc_w -246714546
    //   1677: ixor
    //   1678: goto -> 1689
    //   1681: ldc2_w -889545552
    //   1684: l2i
    //   1685: ldc_w -1261187424
    //   1688: ixor
    //   1689: ldc2_w -2035451321
    //   1692: l2i
    //   1693: ldc_w -1303281304
    //   1696: ixor
    //   1697: ixor
    //   1698: lookupswitch default -> 1724, -1242730924 -> 1681, 1884196017 -> 3017
    //   1724: aload_0
    //   1725: getstatic Perryc.0 : I
    //   1728: ifle -> 1742
    //   1731: ldc2_w -1824000020
    //   1734: l2i
    //   1735: ldc_w -374783564
    //   1738: ixor
    //   1739: goto -> 1750
    //   1742: ldc2_w 1004765045
    //   1745: l2i
    //   1746: ldc_w 1328058137
    //   1749: ixor
    //   1750: ldc2_w -1698882569
    //   1753: l2i
    //   1754: ldc_w -944269059
    //   1757: ixor
    //   1758: ixor
    //   1759: lookupswitch default -> 1784, -385190737 -> 1742, 669267282 -> 2945
    //   1784: getfield commands : Ljava/util/ArrayList;
    //   1787: new bigname/zprestige/webhack/features/command/commands/FriendCommand
    //   1790: dup
    //   1791: getstatic Perryc.c : I
    //   1794: iflt -> 1808
    //   1797: ldc2_w -536228840
    //   1800: l2i
    //   1801: ldc_w -1908093712
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -1478692377
    //   1811: l2i
    //   1812: ldc_w -1031506547
    //   1815: ixor
    //   1816: ldc2_w -575724779
    //   1819: l2i
    //   1820: ldc_w -1619362957
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 2987, 663608332 -> 1852, 748181646 -> 1808
    //   1852: invokespecial <init> : ()V
    //   1855: getstatic Perryc.1 : I
    //   1858: ifeq -> 1872
    //   1861: ldc2_w 245073387
    //   1864: l2i
    //   1865: ldc_w -577483631
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w 2048479948
    //   1875: l2i
    //   1876: ldc_w -276104391
    //   1879: ixor
    //   1880: ldc2_w -1694674838
    //   1883: l2i
    //   1884: ldc_w 1786492407
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 2983, 596192487 -> 1872, 1695894632 -> 1916
    //   1916: invokevirtual add : (Ljava/lang/Object;)Z
    //   1919: pop
    //   1920: getstatic Perryc.1 : I
    //   1923: ifeq -> 1937
    //   1926: ldc2_w -1893192482
    //   1929: l2i
    //   1930: ldc_w 1114535194
    //   1933: ixor
    //   1934: goto -> 1945
    //   1937: ldc2_w -948548309
    //   1940: l2i
    //   1941: ldc_w -305041606
    //   1944: ixor
    //   1945: ldc2_w -759821910
    //   1948: l2i
    //   1949: ldc_w 1011249010
    //   1952: ixor
    //   1953: ixor
    //   1954: lookupswitch default -> 1980, 599146268 -> 2997, 688841041 -> 1937
    //   1980: aload_0
    //   1981: getstatic Perryc.c : I
    //   1984: iflt -> 1998
    //   1987: ldc2_w 241539760
    //   1990: l2i
    //   1991: ldc_w -138050060
    //   1994: ixor
    //   1995: goto -> 2006
    //   1998: ldc2_w 202175186
    //   2001: l2i
    //   2002: ldc_w -1390013156
    //   2005: ixor
    //   2006: ldc2_w -960032120
    //   2009: l2i
    //   2010: ldc_w -465079697
    //   2013: ixor
    //   2014: ixor
    //   2015: lookupswitch default -> 2040, -618627165 -> 2993, 165179909 -> 1998
    //   2040: getfield commands : Ljava/util/ArrayList;
    //   2043: new bigname/zprestige/webhack/features/command/commands/HelpCommand
    //   2046: dup
    //   2047: getstatic Perryc.0 : I
    //   2050: ifle -> 2064
    //   2053: ldc2_w 153850116
    //   2056: l2i
    //   2057: ldc_w -719131364
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w -698942748
    //   2067: l2i
    //   2068: ldc_w 1087221857
    //   2071: ixor
    //   2072: ldc2_w -932245295
    //   2075: l2i
    //   2076: ldc_w 1894211237
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 2975, 772998385 -> 2108, 1686188652 -> 2064
    //   2108: invokespecial <init> : ()V
    //   2111: getstatic Perryc.0 : I
    //   2114: ifle -> 2128
    //   2117: ldc2_w 1529530561
    //   2120: l2i
    //   2121: ldc_w -1299060770
    //   2124: ixor
    //   2125: goto -> 2136
    //   2128: ldc2_w 936814166
    //   2131: l2i
    //   2132: ldc_w 1542602102
    //   2135: ixor
    //   2136: ldc2_w -2072780147
    //   2139: l2i
    //   2140: ldc_w -1353021875
    //   2143: ixor
    //   2144: ixor
    //   2145: lookupswitch default -> 2989, -1030599713 -> 2128, 1192099808 -> 2172
    //   2172: invokevirtual add : (Ljava/lang/Object;)Z
    //   2175: pop
    //   2176: getstatic Perryc.c : I
    //   2179: iflt -> 2193
    //   2182: ldc2_w 608214457
    //   2185: l2i
    //   2186: ldc_w 702194219
    //   2189: ixor
    //   2190: goto -> 2201
    //   2193: ldc2_w -1803363999
    //   2196: l2i
    //   2197: ldc_w 242688273
    //   2200: ixor
    //   2201: ldc2_w -1602412732
    //   2204: l2i
    //   2205: ldc_w -1067257731
    //   2208: ixor
    //   2209: ixor
    //   2210: lookupswitch default -> 2236, 1837486251 -> 2995, 2061672560 -> 2193
    //   2236: aload_0
    //   2237: getstatic Perryc.1 : I
    //   2240: ifeq -> 2254
    //   2243: ldc2_w 1269809417
    //   2246: l2i
    //   2247: ldc_w 478261105
    //   2250: ixor
    //   2251: goto -> 2262
    //   2254: ldc2_w -1030483612
    //   2257: l2i
    //   2258: ldc_w 950668538
    //   2261: ixor
    //   2262: ldc2_w -491262262
    //   2265: l2i
    //   2266: ldc_w 120256827
    //   2269: ixor
    //   2270: ixor
    //   2271: lookupswitch default -> 2971, -1296860791 -> 2254, 530778735 -> 2296
    //   2296: getfield commands : Ljava/util/ArrayList;
    //   2299: new bigname/zprestige/webhack/features/command/commands/ReloadCommand
    //   2302: dup
    //   2303: getstatic Perryc.0 : I
    //   2306: ifle -> 2320
    //   2309: ldc2_w 925298923
    //   2312: l2i
    //   2313: ldc_w 2072218837
    //   2316: ixor
    //   2317: goto -> 2328
    //   2320: ldc2_w -1741488870
    //   2323: l2i
    //   2324: ldc_w 163155032
    //   2327: ixor
    //   2328: ldc2_w 1956032158
    //   2331: l2i
    //   2332: ldc_w -1874489926
    //   2335: ixor
    //   2336: ixor
    //   2337: lookupswitch default -> 3025, -1468637414 -> 2320, 1968722534 -> 2364
    //   2364: invokespecial <init> : ()V
    //   2367: getstatic Perryc.c : I
    //   2370: iflt -> 2384
    //   2373: ldc2_w -967464570
    //   2376: l2i
    //   2377: ldc_w -1781219491
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w -2006964432
    //   2387: l2i
    //   2388: ldc_w -1399881903
    //   2391: ixor
    //   2392: ldc2_w -2134863318
    //   2395: l2i
    //   2396: ldc_w -1600499933
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 2428, -851053366 -> 2384, 1943784402 -> 3013
    //   2428: invokevirtual add : (Ljava/lang/Object;)Z
    //   2431: pop
    //   2432: getstatic Perryc.0 : I
    //   2435: ifle -> 2449
    //   2438: ldc2_w 1327002575
    //   2441: l2i
    //   2442: ldc_w -317968671
    //   2445: ixor
    //   2446: goto -> 2457
    //   2449: ldc2_w -7759665
    //   2452: l2i
    //   2453: ldc_w -679347728
    //   2456: ixor
    //   2457: ldc2_w 1494665222
    //   2460: l2i
    //   2461: ldc_w 144624157
    //   2464: ixor
    //   2465: ixor
    //   2466: lookupswitch default -> 2492, -207855819 -> 2999, 1848455012 -> 2449
    //   2492: aload_0
    //   2493: getstatic Perryc.1 : I
    //   2496: ifeq -> 2510
    //   2499: ldc2_w -2111673497
    //   2502: l2i
    //   2503: ldc_w 315043949
    //   2506: ixor
    //   2507: goto -> 2518
    //   2510: ldc2_w 492872458
    //   2513: l2i
    //   2514: ldc_w 1762356581
    //   2517: ixor
    //   2518: ldc2_w -460231090
    //   2521: l2i
    //   2522: ldc_w -1532657672
    //   2525: ixor
    //   2526: ixor
    //   2527: lookupswitch default -> 2951, -791590212 -> 2510, 878698457 -> 2552
    //   2552: getfield commands : Ljava/util/ArrayList;
    //   2555: new bigname/zprestige/webhack/features/command/commands/UnloadCommand
    //   2558: dup
    //   2559: getstatic Perryc.c : I
    //   2562: iflt -> 2576
    //   2565: ldc2_w 1519613876
    //   2568: l2i
    //   2569: ldc_w -410151289
    //   2572: ixor
    //   2573: goto -> 2584
    //   2576: ldc2_w -1871664765
    //   2579: l2i
    //   2580: ldc_w -1384922469
    //   2583: ixor
    //   2584: ldc2_w 813434958
    //   2587: l2i
    //   2588: ldc_w 1993923735
    //   2591: ixor
    //   2592: ixor
    //   2593: lookupswitch default -> 3029, -71682582 -> 2576, 2074591169 -> 2620
    //   2620: invokespecial <init> : ()V
    //   2623: getstatic Perryc.0 : I
    //   2626: ifle -> 2640
    //   2629: ldc2_w -1059059245
    //   2632: l2i
    //   2633: ldc_w -914429251
    //   2636: ixor
    //   2637: goto -> 2648
    //   2640: ldc2_w 996238772
    //   2643: l2i
    //   2644: ldc_w -303042233
    //   2647: ixor
    //   2648: ldc2_w 1949189216
    //   2651: l2i
    //   2652: ldc_w 881957900
    //   2655: ixor
    //   2656: ixor
    //   2657: lookupswitch default -> 2981, -1775154017 -> 2684, 1226914562 -> 2640
    //   2684: invokevirtual add : (Ljava/lang/Object;)Z
    //   2687: pop
    //   2688: getstatic Perryc.0 : I
    //   2691: ifle -> 2705
    //   2694: ldc2_w 210534794
    //   2697: l2i
    //   2698: ldc_w 2135735432
    //   2701: ixor
    //   2702: goto -> 2713
    //   2705: ldc2_w -2080362492
    //   2708: l2i
    //   2709: ldc_w 1317416963
    //   2712: ixor
    //   2713: ldc2_w -1651708602
    //   2716: l2i
    //   2717: ldc_w 2004908835
    //   2720: ixor
    //   2721: ixor
    //   2722: lookupswitch default -> 2748, -1714640025 -> 2991, -8986216 -> 2705
    //   2748: aload_0
    //   2749: getstatic Perryc.1 : I
    //   2752: ifeq -> 2766
    //   2755: ldc2_w -1471190500
    //   2758: l2i
    //   2759: ldc_w -2674086
    //   2762: ixor
    //   2763: goto -> 2774
    //   2766: ldc2_w -851858388
    //   2769: l2i
    //   2770: ldc_w 760483286
    //   2773: ixor
    //   2774: ldc2_w 1954452101
    //   2777: l2i
    //   2778: ldc_w -371545101
    //   2781: ixor
    //   2782: ixor
    //   2783: lookupswitch default -> 2808, -1947076059 -> 2766, -902012624 -> 2967
    //   2808: getfield commands : Ljava/util/ArrayList;
    //   2811: new bigname/zprestige/webhack/features/command/commands/ReloadSoundCommand
    //   2814: dup
    //   2815: getstatic Perryc.c : I
    //   2818: iflt -> 2832
    //   2821: ldc2_w -1083003111
    //   2824: l2i
    //   2825: ldc_w -1705166121
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w 1984172050
    //   2835: l2i
    //   2836: ldc_w 624713917
    //   2839: ixor
    //   2840: ldc2_w -761808329
    //   2843: l2i
    //   2844: ldc_w -412912505
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 3031, 282811262 -> 2832, 1720499743 -> 2876
    //   2876: invokespecial <init> : ()V
    //   2879: getstatic Perryc.c : I
    //   2882: iflt -> 2896
    //   2885: ldc2_w -2006863678
    //   2888: l2i
    //   2889: ldc_w 476900366
    //   2892: ixor
    //   2893: goto -> 2904
    //   2896: ldc2_w 725138282
    //   2899: l2i
    //   2900: ldc_w 1329078822
    //   2903: ixor
    //   2904: ldc2_w 498685104
    //   2907: l2i
    //   2908: ldc_w 1033987274
    //   2911: ixor
    //   2912: ixor
    //   2913: lookupswitch default -> 3015, -1273664330 -> 2896, 1142466870 -> 2940
    //   2940: invokevirtual add : (Ljava/lang/Object;)Z
    //   2943: pop
    //   2944: return
    //   2945: aconst_null
    //   2946: athrow
    //   2947: aconst_null
    //   2948: athrow
    //   2949: aconst_null
    //   2950: athrow
    //   2951: aconst_null
    //   2952: athrow
    //   2953: aconst_null
    //   2954: athrow
    //   2955: aconst_null
    //   2956: athrow
    //   2957: aconst_null
    //   2958: athrow
    //   2959: aconst_null
    //   2960: athrow
    //   2961: aconst_null
    //   2962: athrow
    //   2963: aconst_null
    //   2964: athrow
    //   2965: aconst_null
    //   2966: athrow
    //   2967: aconst_null
    //   2968: athrow
    //   2969: aconst_null
    //   2970: athrow
    //   2971: aconst_null
    //   2972: athrow
    //   2973: aconst_null
    //   2974: athrow
    //   2975: aconst_null
    //   2976: athrow
    //   2977: aconst_null
    //   2978: athrow
    //   2979: aconst_null
    //   2980: athrow
    //   2981: aconst_null
    //   2982: athrow
    //   2983: aconst_null
    //   2984: athrow
    //   2985: aconst_null
    //   2986: athrow
    //   2987: aconst_null
    //   2988: athrow
    //   2989: aconst_null
    //   2990: athrow
    //   2991: aconst_null
    //   2992: athrow
    //   2993: aconst_null
    //   2994: athrow
    //   2995: aconst_null
    //   2996: athrow
    //   2997: aconst_null
    //   2998: athrow
    //   2999: aconst_null
    //   3000: athrow
    //   3001: aconst_null
    //   3002: athrow
    //   3003: aconst_null
    //   3004: athrow
    //   3005: aconst_null
    //   3006: athrow
    //   3007: aconst_null
    //   3008: athrow
    //   3009: aconst_null
    //   3010: athrow
    //   3011: aconst_null
    //   3012: athrow
    //   3013: aconst_null
    //   3014: athrow
    //   3015: aconst_null
    //   3016: athrow
    //   3017: aconst_null
    //   3018: athrow
    //   3019: aconst_null
    //   3020: athrow
    //   3021: aconst_null
    //   3022: athrow
    //   3023: aconst_null
    //   3024: athrow
    //   3025: aconst_null
    //   3026: athrow
    //   3027: aconst_null
    //   3028: athrow
    //   3029: aconst_null
    //   3030: athrow
    //   3031: aconst_null
    //   3032: athrow
    //   3033: aconst_null
    //   3034: athrow
    //   3035: aconst_null
    //   3036: athrow
    //   3037: aconst_null
    //   3038: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2945	0	this	Lbigname/zprestige/webhack/manager/CommandManager;
  }
  
  public ArrayList getCommands() {
    return Perry1.0q(this, (int)1475172440L ^ 0x234C39E5);
  }
  
  public void executeCommand(String command) {
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
  
  public void setClientMessage(String paramString) {
    Perry1.1a(this, (int)922641696L ^ 0x4208E8A4, paramString);
  }
  
  public static String strip(String paramString1, String paramString2) {
    return Perry1.17(null, (int)-1938535076L ^ 0xB62CEEB8, paramString1, paramString2);
  }
  
  public String getClientMessage() {
    return Perry1.6(this, (int)1547319171L ^ 0x5812B5F9);
  }
  
  public Command getCommandByName(String name) {
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
  
  public static String[] removeElement(String[] input, int indexToDelete) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\CommandManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */