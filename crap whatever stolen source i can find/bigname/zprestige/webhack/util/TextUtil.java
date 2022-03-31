package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.Random;

public class TextUtil {
  public static String DARK_GRAY;
  
  public static Random rand;
  
  public static String ITALIC;
  
  public static String GRAY;
  
  public static String OBFUSCATED;
  
  public static String DARK_GREEN;
  
  public static String BOLD;
  
  public static String RED;
  
  public static String AQUA;
  
  public static String DARK_PURPLE;
  
  public static String DARK_BLUE;
  
  public static String WHITE;
  
  public static String RESET;
  
  public static String DARK_RED;
  
  public static String BLUE;
  
  public static String LIGHT_PURPLE;
  
  public static String BLACK;
  
  public static String STRIKE;
  
  public static String GREEN;
  
  public static String UNDERLINE;
  
  public static String YELLOW;
  
  public static String DARK_AQUA;
  
  public static String GOLD;
  
  public static String stripColor(String paramString) {
    return Perry1.69(null, (int)386823334L ^ 0x3751FFE0, paramString);
  }
  
  public static String cropMaxLengthMessage(String s, int i) {
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
  
  public TextUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1749901708
    //   9: l2i
    //   10: ldc -51302715
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1312810831
    //   19: l2i
    //   20: ldc 5438078
    //   22: ixor
    //   23: ldc2_w -1867698969
    //   26: l2i
    //   27: ldc -1859581619
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1791464733 -> 120, -967558111 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 949637259
    //   66: l2i
    //   67: ldc -1291744884
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1098153483
    //   76: l2i
    //   77: ldc 1109259714
    //   79: ixor
    //   80: ldc2_w -1415798257
    //   83: l2i
    //   84: ldc 136583860
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -1596902542 -> 116, 673407420 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/TextUtil;
  }
  
  public static String coloredString(String string, TextUtil$Color color) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 10655
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 10647
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 10639
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -724269416
    //   33: l2i
    //   34: ldc -2002457326
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 307494256
    //   43: l2i
    //   44: ldc -251619626
    //   46: ixor
    //   47: ldc2_w 746016552
    //   50: l2i
    //   51: ldc -1967600257
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -88086051 -> 10498, 2112994157 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -331074251
    //   90: l2i
    //   91: ldc -552319483
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -2021175690
    //   100: l2i
    //   101: ldc 319476568
    //   103: ixor
    //   104: ldc2_w 1241629828
    //   107: l2i
    //   108: ldc 699794534
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 10398, -147169844 -> 140, 1357362130 -> 97
    //   140: astore_2
    //   141: getstatic Perryc.c : I
    //   144: iflt -> 157
    //   147: ldc2_w 1347120287
    //   150: l2i
    //   151: ldc 1797627573
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w -1285097012
    //   160: l2i
    //   161: ldc -202552188
    //   163: ixor
    //   164: ldc2_w -926446811
    //   167: l2i
    //   168: ldc_w 204366916
    //   171: ixor
    //   172: ixor
    //   173: lookupswitch default -> 10534, -2073929175 -> 200, -7922357 -> 157
    //   200: getstatic bigname/zprestige/webhack/util/TextUtil$1.$SwitchMap$bigname$zprestige$webhack$util$TextUtil$Color : [I
    //   203: getstatic Perryc.c : I
    //   206: iflt -> 220
    //   209: ldc2_w -373217520
    //   212: l2i
    //   213: ldc_w -1226891406
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 2053853676
    //   223: l2i
    //   224: ldc_w 347967813
    //   227: ixor
    //   228: ldc2_w 134224093
    //   231: l2i
    //   232: ldc_w 286568136
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 264, 1068066497 -> 220, 1175096951 -> 10450
    //   264: aload_1
    //   265: getstatic Perryc.0 : I
    //   268: ifle -> 282
    //   271: ldc2_w 630923495
    //   274: l2i
    //   275: ldc_w 718058349
    //   278: ixor
    //   279: goto -> 290
    //   282: ldc2_w 2076892315
    //   285: l2i
    //   286: ldc_w 879223038
    //   289: ixor
    //   290: ldc2_w -1276265444
    //   293: l2i
    //   294: ldc_w 509843250
    //   297: ixor
    //   298: ixor
    //   299: lookupswitch default -> 10376, -1562789724 -> 282, -501016757 -> 324
    //   324: goto -> 328
    //   327: athrow
    //   328: invokevirtual ordinal : ()I
    //   331: goto -> 335
    //   334: athrow
    //   335: iaload
    //   336: tableswitch default -> 10269, 1 -> 416, 2 -> 1032, 3 -> 1648, 4 -> 2264, 5 -> 2880, 6 -> 3496, 7 -> 4112, 8 -> 4728, 9 -> 5344, 10 -> 5960, 11 -> 6576, 12 -> 7192, 13 -> 7808, 14 -> 8424, 15 -> 9040, 16 -> 9656
    //   416: new java/lang/StringBuilder
    //   419: dup
    //   420: getstatic Perryc.1 : I
    //   423: ifeq -> 437
    //   426: ldc2_w 1766763638
    //   429: l2i
    //   430: ldc_w 1235507920
    //   433: ixor
    //   434: goto -> 445
    //   437: ldc2_w -1061545883
    //   440: l2i
    //   441: ldc_w -974670577
    //   444: ixor
    //   445: ldc2_w -1740607472
    //   448: l2i
    //   449: ldc_w -1369382504
    //   452: ixor
    //   453: ixor
    //   454: lookupswitch default -> 480, -1010470081 -> 437, 382363438 -> 10348
    //   480: goto -> 484
    //   483: athrow
    //   484: invokespecial <init> : ()V
    //   487: goto -> 491
    //   490: athrow
    //   491: getstatic Perryc.0 : I
    //   494: ifle -> 508
    //   497: ldc2_w 1828119654
    //   500: l2i
    //   501: ldc_w -666330646
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1924129656
    //   511: l2i
    //   512: ldc_w -671115345
    //   515: ixor
    //   516: ldc2_w -1984653501
    //   519: l2i
    //   520: ldc_w -1180388418
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 10564, -2068948623 -> 508, 1790947290 -> 552
    //   552: getstatic com/mojang/realmsclient/gui/ChatFormatting.AQUA : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   555: getstatic Perryc.1 : I
    //   558: ifeq -> 572
    //   561: ldc2_w -281548832
    //   564: l2i
    //   565: ldc_w -1197384701
    //   568: ixor
    //   569: goto -> 580
    //   572: ldc2_w 1934429138
    //   575: l2i
    //   576: ldc_w 2143039173
    //   579: ixor
    //   580: ldc2_w 393122902
    //   583: l2i
    //   584: ldc_w -1699226836
    //   587: ixor
    //   588: ixor
    //   589: lookupswitch default -> 616, -632294247 -> 10584, 1623799321 -> 572
    //   616: goto -> 620
    //   619: athrow
    //   620: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   623: goto -> 627
    //   626: athrow
    //   627: getstatic Perryc.1 : I
    //   630: ifeq -> 644
    //   633: ldc2_w -1000938222
    //   636: l2i
    //   637: ldc_w 1567018709
    //   640: ixor
    //   641: goto -> 652
    //   644: ldc2_w -139138729
    //   647: l2i
    //   648: ldc_w -1844222379
    //   651: ixor
    //   652: ldc2_w -140499695
    //   655: l2i
    //   656: ldc_w 1772253772
    //   659: ixor
    //   660: ixor
    //   661: lookupswitch default -> 10596, -73017249 -> 688, 120749210 -> 644
    //   688: aload_2
    //   689: getstatic Perryc.c : I
    //   692: iflt -> 706
    //   695: ldc2_w 1169875885
    //   698: l2i
    //   699: ldc_w -916764241
    //   702: ixor
    //   703: goto -> 714
    //   706: ldc2_w -1730144354
    //   709: l2i
    //   710: ldc_w -760491223
    //   713: ixor
    //   714: ldc2_w -917343875
    //   717: l2i
    //   718: ldc_w -1831777129
    //   721: ixor
    //   722: ixor
    //   723: lookupswitch default -> 748, -681404440 -> 10480, 661083288 -> 706
    //   748: goto -> 752
    //   751: athrow
    //   752: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   755: goto -> 759
    //   758: athrow
    //   759: getstatic Perryc.c : I
    //   762: iflt -> 776
    //   765: ldc2_w -1997053473
    //   768: l2i
    //   769: ldc_w 721957655
    //   772: ixor
    //   773: goto -> 784
    //   776: ldc2_w 1541921048
    //   779: l2i
    //   780: ldc_w -390508081
    //   783: ixor
    //   784: ldc2_w 1239187810
    //   787: l2i
    //   788: ldc_w -1844090294
    //   791: ixor
    //   792: ixor
    //   793: lookupswitch default -> 820, -1511532032 -> 776, 2016852448 -> 10456
    //   820: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   823: getstatic Perryc.c : I
    //   826: iflt -> 840
    //   829: ldc2_w -727793260
    //   832: l2i
    //   833: ldc_w 1114299304
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 1719507389
    //   843: l2i
    //   844: ldc_w -2009173555
    //   847: ixor
    //   848: ldc2_w -585056260
    //   851: l2i
    //   852: ldc_w -528363095
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 884, -1420462999 -> 10542, 795261065 -> 840
    //   884: goto -> 888
    //   887: athrow
    //   888: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   891: goto -> 895
    //   894: athrow
    //   895: getstatic Perryc.1 : I
    //   898: ifeq -> 912
    //   901: ldc2_w -347995362
    //   904: l2i
    //   905: ldc_w 1155179505
    //   908: ixor
    //   909: goto -> 920
    //   912: ldc2_w 994580264
    //   915: l2i
    //   916: ldc_w 84355565
    //   919: ixor
    //   920: ldc2_w 1111194362
    //   923: l2i
    //   924: ldc_w 709418976
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 956, -940898827 -> 10586, 1139312316 -> 912
    //   956: goto -> 960
    //   959: athrow
    //   960: invokevirtual toString : ()Ljava/lang/String;
    //   963: goto -> 967
    //   966: athrow
    //   967: getstatic Perryc.c : I
    //   970: iflt -> 984
    //   973: ldc2_w -1980544916
    //   976: l2i
    //   977: ldc_w -910385625
    //   980: ixor
    //   981: goto -> 992
    //   984: ldc2_w 191831686
    //   987: l2i
    //   988: ldc_w -254811874
    //   991: ixor
    //   992: ldc2_w 1082933038
    //   995: l2i
    //   996: ldc_w 1888749713
    //   999: ixor
    //   1000: ixor
    //   1001: lookupswitch default -> 1028, -278827614 -> 984, 1884807668 -> 10478
    //   1028: astore_2
    //   1029: goto -> 10269
    //   1032: new java/lang/StringBuilder
    //   1035: dup
    //   1036: getstatic Perryc.c : I
    //   1039: iflt -> 1053
    //   1042: ldc2_w -1129762826
    //   1045: l2i
    //   1046: ldc_w -1160692182
    //   1049: ixor
    //   1050: goto -> 1061
    //   1053: ldc2_w 886377503
    //   1056: l2i
    //   1057: ldc_w 144075360
    //   1060: ixor
    //   1061: ldc2_w -663902356
    //   1064: l2i
    //   1065: ldc_w -1902134565
    //   1068: ixor
    //   1069: ixor
    //   1070: lookupswitch default -> 10408, 1351224427 -> 1053, 1790016456 -> 1096
    //   1096: goto -> 1100
    //   1099: athrow
    //   1100: invokespecial <init> : ()V
    //   1103: goto -> 1107
    //   1106: athrow
    //   1107: getstatic Perryc.0 : I
    //   1110: ifle -> 1124
    //   1113: ldc2_w -119643749
    //   1116: l2i
    //   1117: ldc_w -125322873
    //   1120: ixor
    //   1121: goto -> 1132
    //   1124: ldc2_w 883432417
    //   1127: l2i
    //   1128: ldc_w 890889030
    //   1131: ixor
    //   1132: ldc2_w 1712365108
    //   1135: l2i
    //   1136: ldc_w -818702542
    //   1139: ixor
    //   1140: ixor
    //   1141: lookupswitch default -> 10388, -1466764895 -> 1168, -1451568870 -> 1124
    //   1168: getstatic com/mojang/realmsclient/gui/ChatFormatting.WHITE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1171: getstatic Perryc.1 : I
    //   1174: ifeq -> 1188
    //   1177: ldc2_w -148373158
    //   1180: l2i
    //   1181: ldc_w -1049191255
    //   1184: ixor
    //   1185: goto -> 1196
    //   1188: ldc2_w 642934485
    //   1191: l2i
    //   1192: ldc_w 967452862
    //   1195: ixor
    //   1196: ldc2_w 1122460018
    //   1199: l2i
    //   1200: ldc_w 1450142326
    //   1203: ixor
    //   1204: ixor
    //   1205: lookupswitch default -> 1232, 183867037 -> 1188, 584488695 -> 10492
    //   1232: goto -> 1236
    //   1235: athrow
    //   1236: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1239: goto -> 1243
    //   1242: athrow
    //   1243: getstatic Perryc.0 : I
    //   1246: ifle -> 1260
    //   1249: ldc2_w 1294343386
    //   1252: l2i
    //   1253: ldc_w 428818037
    //   1256: ixor
    //   1257: goto -> 1268
    //   1260: ldc2_w -366002700
    //   1263: l2i
    //   1264: ldc_w 2107662561
    //   1267: ixor
    //   1268: ldc2_w 1512200315
    //   1271: l2i
    //   1272: ldc_w 182201047
    //   1275: ixor
    //   1276: ixor
    //   1277: lookupswitch default -> 1304, 58299306 -> 1260, 72830979 -> 10544
    //   1304: aload_2
    //   1305: getstatic Perryc.0 : I
    //   1308: ifle -> 1322
    //   1311: ldc2_w -978092635
    //   1314: l2i
    //   1315: ldc_w 771019069
    //   1318: ixor
    //   1319: goto -> 1330
    //   1322: ldc2_w 417148566
    //   1325: l2i
    //   1326: ldc_w -246056318
    //   1329: ixor
    //   1330: ldc2_w 1298317484
    //   1333: l2i
    //   1334: ldc_w 1341295546
    //   1337: ixor
    //   1338: ixor
    //   1339: lookupswitch default -> 10494, -354949234 -> 1322, -350740734 -> 1364
    //   1364: goto -> 1368
    //   1367: athrow
    //   1368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1371: goto -> 1375
    //   1374: athrow
    //   1375: getstatic Perryc.c : I
    //   1378: iflt -> 1392
    //   1381: ldc2_w -174995909
    //   1384: l2i
    //   1385: ldc_w -1247576976
    //   1388: ixor
    //   1389: goto -> 1400
    //   1392: ldc2_w -944813121
    //   1395: l2i
    //   1396: ldc_w -521621768
    //   1399: ixor
    //   1400: ldc2_w -1884003316
    //   1403: l2i
    //   1404: ldc_w -860966222
    //   1407: ixor
    //   1408: ixor
    //   1409: lookupswitch default -> 1436, 52980981 -> 10524, 797090958 -> 1392
    //   1436: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1439: getstatic Perryc.c : I
    //   1442: iflt -> 1456
    //   1445: ldc2_w -443241772
    //   1448: l2i
    //   1449: ldc_w 2010858614
    //   1452: ixor
    //   1453: goto -> 1464
    //   1456: ldc2_w 1875172677
    //   1459: l2i
    //   1460: ldc_w -276063082
    //   1463: ixor
    //   1464: ldc2_w -1225806339
    //   1467: l2i
    //   1468: ldc_w 103642624
    //   1471: ixor
    //   1472: ixor
    //   1473: lookupswitch default -> 10394, 579679583 -> 1456, 814586414 -> 1500
    //   1500: goto -> 1504
    //   1503: athrow
    //   1504: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1507: goto -> 1511
    //   1510: athrow
    //   1511: getstatic Perryc.0 : I
    //   1514: ifle -> 1528
    //   1517: ldc2_w 1636770310
    //   1520: l2i
    //   1521: ldc_w 1744067067
    //   1524: ixor
    //   1525: goto -> 1536
    //   1528: ldc2_w -2086192476
    //   1531: l2i
    //   1532: ldc_w 2071111401
    //   1535: ixor
    //   1536: ldc2_w -1567092277
    //   1539: l2i
    //   1540: ldc_w 1853637782
    //   1543: ixor
    //   1544: ixor
    //   1545: lookupswitch default -> 1572, -895537504 -> 10430, 1170579790 -> 1528
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual toString : ()Ljava/lang/String;
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: getstatic Perryc.c : I
    //   1586: iflt -> 1600
    //   1589: ldc2_w 1425379280
    //   1592: l2i
    //   1593: ldc_w 71043835
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 584305676
    //   1603: l2i
    //   1604: ldc_w 905521299
    //   1607: ixor
    //   1608: ldc2_w -1072455886
    //   1611: l2i
    //   1612: ldc_w -682993620
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 1644, 1200636469 -> 10490, 1766312632 -> 1600
    //   1644: astore_2
    //   1645: goto -> 10269
    //   1648: new java/lang/StringBuilder
    //   1651: dup
    //   1652: getstatic Perryc.1 : I
    //   1655: ifeq -> 1669
    //   1658: ldc2_w 2009003001
    //   1661: l2i
    //   1662: ldc_w -2008514308
    //   1665: ixor
    //   1666: goto -> 1677
    //   1669: ldc2_w -1671242690
    //   1672: l2i
    //   1673: ldc_w -733974639
    //   1676: ixor
    //   1677: ldc2_w 624310812
    //   1680: l2i
    //   1681: ldc_w 854555572
    //   1684: ixor
    //   1685: ixor
    //   1686: lookupswitch default -> 10536, -399560019 -> 1669, 1610347015 -> 1712
    //   1712: goto -> 1716
    //   1715: athrow
    //   1716: invokespecial <init> : ()V
    //   1719: goto -> 1723
    //   1722: athrow
    //   1723: getstatic Perryc.c : I
    //   1726: iflt -> 1740
    //   1729: ldc2_w 1695809086
    //   1732: l2i
    //   1733: ldc_w 525812182
    //   1736: ixor
    //   1737: goto -> 1748
    //   1740: ldc2_w 1770547467
    //   1743: l2i
    //   1744: ldc_w -1929887146
    //   1747: ixor
    //   1748: ldc2_w 184873708
    //   1751: l2i
    //   1752: ldc_w -393590973
    //   1755: ixor
    //   1756: ixor
    //   1757: lookupswitch default -> 10458, -1714812345 -> 1740, 117350130 -> 1784
    //   1784: getstatic com/mojang/realmsclient/gui/ChatFormatting.BLACK : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1787: getstatic Perryc.0 : I
    //   1790: ifle -> 1804
    //   1793: ldc2_w -1657923760
    //   1796: l2i
    //   1797: ldc_w 253797596
    //   1800: ixor
    //   1801: goto -> 1812
    //   1804: ldc2_w 1647511076
    //   1807: l2i
    //   1808: ldc_w 1873327621
    //   1811: ixor
    //   1812: ldc2_w -798476097
    //   1815: l2i
    //   1816: ldc_w -1654229918
    //   1819: ixor
    //   1820: ixor
    //   1821: lookupswitch default -> 10472, -553582767 -> 1804, 1083571452 -> 1848
    //   1848: goto -> 1852
    //   1851: athrow
    //   1852: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1855: goto -> 1859
    //   1858: athrow
    //   1859: getstatic Perryc.c : I
    //   1862: iflt -> 1876
    //   1865: ldc2_w -457524180
    //   1868: l2i
    //   1869: ldc_w -481370850
    //   1872: ixor
    //   1873: goto -> 1884
    //   1876: ldc2_w 996594823
    //   1879: l2i
    //   1880: ldc_w 802022544
    //   1883: ixor
    //   1884: ldc2_w -1110530287
    //   1887: l2i
    //   1888: ldc_w 1848310598
    //   1891: ixor
    //   1892: ixor
    //   1893: lookupswitch default -> 1920, -737133211 -> 10422, 1909083499 -> 1876
    //   1920: aload_2
    //   1921: getstatic Perryc.1 : I
    //   1924: ifeq -> 1938
    //   1927: ldc2_w -1875332862
    //   1930: l2i
    //   1931: ldc_w -893074335
    //   1934: ixor
    //   1935: goto -> 1946
    //   1938: ldc2_w 1802251449
    //   1941: l2i
    //   1942: ldc_w 278187427
    //   1945: ixor
    //   1946: ldc2_w 782789013
    //   1949: l2i
    //   1950: ldc_w 1030889983
    //   1953: ixor
    //   1954: ixor
    //   1955: lookupswitch default -> 10560, 1227242761 -> 1938, 1747102064 -> 1980
    //   1980: goto -> 1984
    //   1983: athrow
    //   1984: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1987: goto -> 1991
    //   1990: athrow
    //   1991: getstatic Perryc.1 : I
    //   1994: ifeq -> 2008
    //   1997: ldc2_w 1742025483
    //   2000: l2i
    //   2001: ldc_w 793503631
    //   2004: ixor
    //   2005: goto -> 2016
    //   2008: ldc2_w -46226272
    //   2011: l2i
    //   2012: ldc_w -1935169033
    //   2015: ixor
    //   2016: ldc2_w 161848501
    //   2019: l2i
    //   2020: ldc_w 1051388828
    //   2023: ixor
    //   2024: ixor
    //   2025: lookupswitch default -> 2052, -48034173 -> 2008, 2140251053 -> 10390
    //   2052: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2055: getstatic Perryc.1 : I
    //   2058: ifeq -> 2072
    //   2061: ldc2_w -1306687165
    //   2064: l2i
    //   2065: ldc_w 760184532
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w -212373171
    //   2075: l2i
    //   2076: ldc_w 473444480
    //   2079: ixor
    //   2080: ldc2_w -632391920
    //   2083: l2i
    //   2084: ldc_w 754745685
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 10568, 433960840 -> 2116, 1776288210 -> 2072
    //   2116: goto -> 2120
    //   2119: athrow
    //   2120: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2123: goto -> 2127
    //   2126: athrow
    //   2127: getstatic Perryc.0 : I
    //   2130: ifle -> 2144
    //   2133: ldc2_w 1003308106
    //   2136: l2i
    //   2137: ldc_w 1818632562
    //   2140: ixor
    //   2141: goto -> 2152
    //   2144: ldc2_w -1729069991
    //   2147: l2i
    //   2148: ldc_w -555706243
    //   2151: ixor
    //   2152: ldc2_w -1935169112
    //   2155: l2i
    //   2156: ldc_w -1330054997
    //   2159: ixor
    //   2160: ixor
    //   2161: lookupswitch default -> 2188, -182528349 -> 2144, 1806971963 -> 10520
    //   2188: goto -> 2192
    //   2191: athrow
    //   2192: invokevirtual toString : ()Ljava/lang/String;
    //   2195: goto -> 2199
    //   2198: athrow
    //   2199: getstatic Perryc.1 : I
    //   2202: ifeq -> 2216
    //   2205: ldc2_w 324023546
    //   2208: l2i
    //   2209: ldc_w 575971126
    //   2212: ixor
    //   2213: goto -> 2224
    //   2216: ldc2_w -1359304862
    //   2219: l2i
    //   2220: ldc_w 1162939859
    //   2223: ixor
    //   2224: ldc2_w 382088644
    //   2227: l2i
    //   2228: ldc_w 1965006571
    //   2231: ixor
    //   2232: ixor
    //   2233: lookupswitch default -> 2260, 1390215395 -> 10420, 1550324618 -> 2216
    //   2260: astore_2
    //   2261: goto -> 10269
    //   2264: new java/lang/StringBuilder
    //   2267: dup
    //   2268: getstatic Perryc.c : I
    //   2271: iflt -> 2285
    //   2274: ldc2_w -1508393275
    //   2277: l2i
    //   2278: ldc_w 545358397
    //   2281: ixor
    //   2282: goto -> 2293
    //   2285: ldc2_w 1913083509
    //   2288: l2i
    //   2289: ldc_w 1188431231
    //   2292: ixor
    //   2293: ldc2_w -2058753890
    //   2296: l2i
    //   2297: ldc_w 1640557645
    //   2300: ixor
    //   2301: ixor
    //   2302: lookupswitch default -> 2328, 1580627387 -> 2285, 1645688875 -> 10546
    //   2328: goto -> 2332
    //   2331: athrow
    //   2332: invokespecial <init> : ()V
    //   2335: goto -> 2339
    //   2338: athrow
    //   2339: getstatic Perryc.1 : I
    //   2342: ifeq -> 2356
    //   2345: ldc2_w 1204503583
    //   2348: l2i
    //   2349: ldc_w -1520746492
    //   2352: ixor
    //   2353: goto -> 2364
    //   2356: ldc2_w -74644899
    //   2359: l2i
    //   2360: ldc_w 77995715
    //   2363: ixor
    //   2364: ldc2_w -463978126
    //   2367: l2i
    //   2368: ldc_w -194352507
    //   2371: ixor
    //   2372: ixor
    //   2373: lookupswitch default -> 10512, -283560087 -> 2400, -224251924 -> 2356
    //   2400: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_BLUE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2403: getstatic Perryc.c : I
    //   2406: iflt -> 2420
    //   2409: ldc2_w -1128237996
    //   2412: l2i
    //   2413: ldc_w 2017426011
    //   2416: ixor
    //   2417: goto -> 2428
    //   2420: ldc2_w -1810328606
    //   2423: l2i
    //   2424: ldc_w -519157875
    //   2427: ixor
    //   2428: ldc2_w 1364677105
    //   2431: l2i
    //   2432: ldc_w -2025859971
    //   2435: ixor
    //   2436: ixor
    //   2437: lookupswitch default -> 10414, -1552002589 -> 2464, 311921539 -> 2420
    //   2464: goto -> 2468
    //   2467: athrow
    //   2468: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2471: goto -> 2475
    //   2474: athrow
    //   2475: getstatic Perryc.1 : I
    //   2478: ifeq -> 2492
    //   2481: ldc2_w 537052571
    //   2484: l2i
    //   2485: ldc_w 1112182160
    //   2488: ixor
    //   2489: goto -> 2500
    //   2492: ldc2_w -446207419
    //   2495: l2i
    //   2496: ldc_w -173490619
    //   2499: ixor
    //   2500: ldc2_w 547695847
    //   2503: l2i
    //   2504: ldc_w -107261873
    //   2507: ixor
    //   2508: ixor
    //   2509: lookupswitch default -> 10370, -1149881181 -> 2492, -906909528 -> 2536
    //   2536: aload_2
    //   2537: getstatic Perryc.0 : I
    //   2540: ifle -> 2554
    //   2543: ldc2_w -231689095
    //   2546: l2i
    //   2547: ldc_w 2042141590
    //   2550: ixor
    //   2551: goto -> 2562
    //   2554: ldc2_w -2136111406
    //   2557: l2i
    //   2558: ldc_w 603025350
    //   2561: ixor
    //   2562: ldc2_w -1406055485
    //   2565: l2i
    //   2566: ldc_w -1369558881
    //   2569: ixor
    //   2570: ixor
    //   2571: lookupswitch default -> 2596, -1981328205 -> 10612, -1618781965 -> 2554
    //   2596: goto -> 2600
    //   2599: athrow
    //   2600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2603: goto -> 2607
    //   2606: athrow
    //   2607: getstatic Perryc.1 : I
    //   2610: ifeq -> 2624
    //   2613: ldc2_w 274287197
    //   2616: l2i
    //   2617: ldc_w -1923384288
    //   2620: ixor
    //   2621: goto -> 2632
    //   2624: ldc2_w -1657778673
    //   2627: l2i
    //   2628: ldc_w -706771942
    //   2631: ixor
    //   2632: ldc2_w -1439574364
    //   2635: l2i
    //   2636: ldc_w -2046004158
    //   2639: ixor
    //   2640: ixor
    //   2641: lookupswitch default -> 10418, -1321233253 -> 2624, 1691511027 -> 2668
    //   2668: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2671: getstatic Perryc.c : I
    //   2674: iflt -> 2688
    //   2677: ldc2_w 1711331699
    //   2680: l2i
    //   2681: ldc_w 126029399
    //   2684: ixor
    //   2685: goto -> 2696
    //   2688: ldc2_w -1991078952
    //   2691: l2i
    //   2692: ldc_w -1148133507
    //   2695: ixor
    //   2696: ldc2_w -1505441773
    //   2699: l2i
    //   2700: ldc_w 1887548122
    //   2703: ixor
    //   2704: ixor
    //   2705: lookupswitch default -> 10364, -1220104723 -> 2688, -469291412 -> 2732
    //   2732: goto -> 2736
    //   2735: athrow
    //   2736: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2739: goto -> 2743
    //   2742: athrow
    //   2743: getstatic Perryc.0 : I
    //   2746: ifle -> 2760
    //   2749: ldc2_w -1326844475
    //   2752: l2i
    //   2753: ldc_w 1567081602
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w 876201897
    //   2763: l2i
    //   2764: ldc_w 1149820555
    //   2767: ixor
    //   2768: ldc2_w -1733388876
    //   2771: l2i
    //   2772: ldc_w -1383046862
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 10574, -659503679 -> 2760, 1167060388 -> 2804
    //   2804: goto -> 2808
    //   2807: athrow
    //   2808: invokevirtual toString : ()Ljava/lang/String;
    //   2811: goto -> 2815
    //   2814: athrow
    //   2815: getstatic Perryc.c : I
    //   2818: iflt -> 2832
    //   2821: ldc2_w 1168070308
    //   2824: l2i
    //   2825: ldc_w -1748498627
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -1552884809
    //   2835: l2i
    //   2836: ldc_w -1770933518
    //   2839: ixor
    //   2840: ldc2_w 1069269724
    //   2843: l2i
    //   2844: ldc_w 587322547
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 10366, -823310346 -> 2832, 700153642 -> 2876
    //   2876: astore_2
    //   2877: goto -> 10269
    //   2880: new java/lang/StringBuilder
    //   2883: dup
    //   2884: getstatic Perryc.c : I
    //   2887: iflt -> 2901
    //   2890: ldc2_w 849842202
    //   2893: l2i
    //   2894: ldc_w -859227172
    //   2897: ixor
    //   2898: goto -> 2909
    //   2901: ldc2_w -1253852768
    //   2904: l2i
    //   2905: ldc_w 118167585
    //   2908: ixor
    //   2909: ldc2_w -624210725
    //   2912: l2i
    //   2913: ldc_w -1630478402
    //   2916: ixor
    //   2917: ixor
    //   2918: lookupswitch default -> 2944, -1166722909 -> 10522, 1435250370 -> 2901
    //   2944: goto -> 2948
    //   2947: athrow
    //   2948: invokespecial <init> : ()V
    //   2951: goto -> 2955
    //   2954: athrow
    //   2955: getstatic Perryc.c : I
    //   2958: iflt -> 2972
    //   2961: ldc2_w -1699855718
    //   2964: l2i
    //   2965: ldc_w 1966278381
    //   2968: ixor
    //   2969: goto -> 2980
    //   2972: ldc2_w -1163190039
    //   2975: l2i
    //   2976: ldc_w -1802326737
    //   2979: ixor
    //   2980: ldc2_w -992607411
    //   2983: l2i
    //   2984: ldc_w -388558608
    //   2987: ixor
    //   2988: ixor
    //   2989: lookupswitch default -> 3016, -1013164086 -> 10412, -413013443 -> 2972
    //   3016: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3019: getstatic Perryc.c : I
    //   3022: iflt -> 3036
    //   3025: ldc2_w -1545382901
    //   3028: l2i
    //   3029: ldc_w 1663112672
    //   3032: ixor
    //   3033: goto -> 3044
    //   3036: ldc2_w 1219484953
    //   3039: l2i
    //   3040: ldc_w -515160329
    //   3043: ixor
    //   3044: ldc2_w 951762014
    //   3047: l2i
    //   3048: ldc_w -1316594816
    //   3051: ixor
    //   3052: ixor
    //   3053: lookupswitch default -> 3080, 648518803 -> 3036, 1241425461 -> 10562
    //   3080: goto -> 3084
    //   3083: athrow
    //   3084: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3087: goto -> 3091
    //   3090: athrow
    //   3091: getstatic Perryc.0 : I
    //   3094: ifle -> 3108
    //   3097: ldc2_w -2126377324
    //   3100: l2i
    //   3101: ldc_w 1486988656
    //   3104: ixor
    //   3105: goto -> 3116
    //   3108: ldc2_w -1812942242
    //   3111: l2i
    //   3112: ldc_w 313407240
    //   3115: ixor
    //   3116: ldc2_w 214382983
    //   3119: l2i
    //   3120: ldc_w -2111506529
    //   3123: ixor
    //   3124: ixor
    //   3125: lookupswitch default -> 3152, -956628348 -> 3108, 1459643900 -> 10622
    //   3152: aload_2
    //   3153: getstatic Perryc.c : I
    //   3156: iflt -> 3170
    //   3159: ldc2_w 763914448
    //   3162: l2i
    //   3163: ldc_w -289357416
    //   3166: ixor
    //   3167: goto -> 3178
    //   3170: ldc2_w -1787398265
    //   3173: l2i
    //   3174: ldc_w -1103611823
    //   3177: ixor
    //   3178: ldc2_w -1947881549
    //   3181: l2i
    //   3182: ldc_w -1129954274
    //   3185: ixor
    //   3186: ixor
    //   3187: lookupswitch default -> 3212, -200588571 -> 10342, -193581983 -> 3170
    //   3212: goto -> 3216
    //   3215: athrow
    //   3216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3219: goto -> 3223
    //   3222: athrow
    //   3223: getstatic Perryc.1 : I
    //   3226: ifeq -> 3240
    //   3229: ldc2_w 2059086987
    //   3232: l2i
    //   3233: ldc_w 950367666
    //   3236: ixor
    //   3237: goto -> 3248
    //   3240: ldc2_w -268122337
    //   3243: l2i
    //   3244: ldc_w -448387562
    //   3247: ixor
    //   3248: ldc2_w 754444939
    //   3251: l2i
    //   3252: ldc_w -1974389876
    //   3255: ixor
    //   3256: ixor
    //   3257: lookupswitch default -> 10566, -1276889074 -> 3284, -457670594 -> 3240
    //   3284: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3287: getstatic Perryc.0 : I
    //   3290: ifle -> 3304
    //   3293: ldc2_w -911896764
    //   3296: l2i
    //   3297: ldc_w 2059976206
    //   3300: ixor
    //   3301: goto -> 3312
    //   3304: ldc2_w 1142430488
    //   3307: l2i
    //   3308: ldc_w 1707116521
    //   3311: ixor
    //   3312: ldc2_w 565812244
    //   3315: l2i
    //   3316: ldc_w -1640566149
    //   3319: ixor
    //   3320: ixor
    //   3321: lookupswitch default -> 10552, -1638403426 -> 3348, 216162085 -> 3304
    //   3348: goto -> 3352
    //   3351: athrow
    //   3352: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3355: goto -> 3359
    //   3358: athrow
    //   3359: getstatic Perryc.0 : I
    //   3362: ifle -> 3376
    //   3365: ldc2_w -145819329
    //   3368: l2i
    //   3369: ldc_w 376298880
    //   3372: ixor
    //   3373: goto -> 3384
    //   3376: ldc2_w 937446645
    //   3379: l2i
    //   3380: ldc_w 139589318
    //   3383: ixor
    //   3384: ldc2_w -878531610
    //   3387: l2i
    //   3388: ldc_w 1218549927
    //   3391: ixor
    //   3392: ixor
    //   3393: lookupswitch default -> 10538, -1129150094 -> 3420, 1646270462 -> 3376
    //   3420: goto -> 3424
    //   3423: athrow
    //   3424: invokevirtual toString : ()Ljava/lang/String;
    //   3427: goto -> 3431
    //   3430: athrow
    //   3431: getstatic Perryc.c : I
    //   3434: iflt -> 3448
    //   3437: ldc2_w 1636155886
    //   3440: l2i
    //   3441: ldc_w -2076321856
    //   3444: ixor
    //   3445: goto -> 3456
    //   3448: ldc2_w 556485254
    //   3451: l2i
    //   3452: ldc_w -1673265168
    //   3455: ixor
    //   3456: ldc2_w 1969460456
    //   3459: l2i
    //   3460: ldc_w -775570650
    //   3463: ixor
    //   3464: ixor
    //   3465: lookupswitch default -> 10332, 432970424 -> 3492, 1092499936 -> 3448
    //   3492: astore_2
    //   3493: goto -> 10269
    //   3496: new java/lang/StringBuilder
    //   3499: dup
    //   3500: getstatic Perryc.c : I
    //   3503: iflt -> 3517
    //   3506: ldc2_w -1437466591
    //   3509: l2i
    //   3510: ldc_w 670840664
    //   3513: ixor
    //   3514: goto -> 3525
    //   3517: ldc2_w 1432996134
    //   3520: l2i
    //   3521: ldc_w 1359774093
    //   3524: ixor
    //   3525: ldc2_w 1401687028
    //   3528: l2i
    //   3529: ldc_w -1125893409
    //   3532: ixor
    //   3533: ixor
    //   3534: lookupswitch default -> 3560, -709922688 -> 3517, 1657144914 -> 10614
    //   3560: goto -> 3564
    //   3563: athrow
    //   3564: invokespecial <init> : ()V
    //   3567: goto -> 3571
    //   3570: athrow
    //   3571: getstatic Perryc.c : I
    //   3574: iflt -> 3588
    //   3577: ldc2_w -218593872
    //   3580: l2i
    //   3581: ldc_w 590164237
    //   3584: ixor
    //   3585: goto -> 3596
    //   3588: ldc2_w 1723089732
    //   3591: l2i
    //   3592: ldc_w -468204908
    //   3595: ixor
    //   3596: ldc2_w 2069982778
    //   3599: l2i
    //   3600: ldc_w 550883088
    //   3603: ixor
    //   3604: ixor
    //   3605: lookupswitch default -> 10400, -1973348969 -> 3588, -652795654 -> 3632
    //   3632: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_AQUA : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3635: getstatic Perryc.0 : I
    //   3638: ifle -> 3652
    //   3641: ldc2_w -1286180246
    //   3644: l2i
    //   3645: ldc_w 35629782
    //   3648: ixor
    //   3649: goto -> 3660
    //   3652: ldc2_w 1216173819
    //   3655: l2i
    //   3656: ldc_w -1957182917
    //   3659: ixor
    //   3660: ldc2_w 2023996048
    //   3663: l2i
    //   3664: ldc_w -274769739
    //   3667: ixor
    //   3668: ixor
    //   3669: lookupswitch default -> 3696, 645216921 -> 10386, 768289853 -> 3652
    //   3696: goto -> 3700
    //   3699: athrow
    //   3700: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3703: goto -> 3707
    //   3706: athrow
    //   3707: getstatic Perryc.0 : I
    //   3710: ifle -> 3724
    //   3713: ldc2_w -818930780
    //   3716: l2i
    //   3717: ldc_w -1181451818
    //   3720: ixor
    //   3721: goto -> 3732
    //   3724: ldc2_w 87191168
    //   3727: l2i
    //   3728: ldc_w 1776832498
    //   3731: ixor
    //   3732: ldc2_w -1550483837
    //   3735: l2i
    //   3736: ldc_w -612930504
    //   3739: ixor
    //   3740: ixor
    //   3741: lookupswitch default -> 10372, 239497417 -> 3724, 339227593 -> 3768
    //   3768: aload_2
    //   3769: getstatic Perryc.1 : I
    //   3772: ifeq -> 3786
    //   3775: ldc2_w 1400751211
    //   3778: l2i
    //   3779: ldc_w -652968624
    //   3782: ixor
    //   3783: goto -> 3794
    //   3786: ldc2_w -1120263951
    //   3789: l2i
    //   3790: ldc_w 614201155
    //   3793: ixor
    //   3794: ldc2_w -470426165
    //   3797: l2i
    //   3798: ldc_w 1154409503
    //   3801: ixor
    //   3802: ixor
    //   3803: lookupswitch default -> 10604, 760381679 -> 3786, 1050340966 -> 3828
    //   3828: goto -> 3832
    //   3831: athrow
    //   3832: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3835: goto -> 3839
    //   3838: athrow
    //   3839: getstatic Perryc.0 : I
    //   3842: ifle -> 3856
    //   3845: ldc2_w 1741639848
    //   3848: l2i
    //   3849: ldc_w -2036793861
    //   3852: ixor
    //   3853: goto -> 3864
    //   3856: ldc2_w 1843294006
    //   3859: l2i
    //   3860: ldc_w -21682399
    //   3863: ixor
    //   3864: ldc2_w 243434816
    //   3867: l2i
    //   3868: ldc_w 1109035131
    //   3871: ixor
    //   3872: ixor
    //   3873: lookupswitch default -> 10380, -1378901912 -> 3856, -537705172 -> 3900
    //   3900: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3903: getstatic Perryc.c : I
    //   3906: iflt -> 3920
    //   3909: ldc2_w 47229077
    //   3912: l2i
    //   3913: ldc_w -1477819158
    //   3916: ixor
    //   3917: goto -> 3928
    //   3920: ldc2_w -1463118687
    //   3923: l2i
    //   3924: ldc_w 701797735
    //   3927: ixor
    //   3928: ldc2_w -1239846288
    //   3931: l2i
    //   3932: ldc_w -1454897597
    //   3935: ixor
    //   3936: ixor
    //   3937: lookupswitch default -> 3964, -1167353780 -> 10350, -549641429 -> 3920
    //   3964: goto -> 3968
    //   3967: athrow
    //   3968: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3971: goto -> 3975
    //   3974: athrow
    //   3975: getstatic Perryc.c : I
    //   3978: iflt -> 3992
    //   3981: ldc2_w -386332302
    //   3984: l2i
    //   3985: ldc_w -1621185031
    //   3988: ixor
    //   3989: goto -> 4000
    //   3992: ldc2_w -1956768117
    //   3995: l2i
    //   3996: ldc_w 555016969
    //   3999: ixor
    //   4000: ldc2_w 479667451
    //   4003: l2i
    //   4004: ldc_w -2128561119
    //   4007: ixor
    //   4008: ixor
    //   4009: lookupswitch default -> 4036, -368034735 -> 10434, 1572235056 -> 3992
    //   4036: goto -> 4040
    //   4039: athrow
    //   4040: invokevirtual toString : ()Ljava/lang/String;
    //   4043: goto -> 4047
    //   4046: athrow
    //   4047: getstatic Perryc.c : I
    //   4050: iflt -> 4064
    //   4053: ldc2_w 1381602705
    //   4056: l2i
    //   4057: ldc_w 1742741155
    //   4060: ixor
    //   4061: goto -> 4072
    //   4064: ldc2_w -624099273
    //   4067: l2i
    //   4068: ldc_w -865133723
    //   4071: ixor
    //   4072: ldc2_w -788823381
    //   4075: l2i
    //   4076: ldc_w 77637452
    //   4079: ixor
    //   4080: ixor
    //   4081: lookupswitch default -> 4108, -505237803 -> 10608, 1139599100 -> 4064
    //   4108: astore_2
    //   4109: goto -> 10269
    //   4112: new java/lang/StringBuilder
    //   4115: dup
    //   4116: getstatic Perryc.c : I
    //   4119: iflt -> 4133
    //   4122: ldc2_w -253951568
    //   4125: l2i
    //   4126: ldc_w -435534348
    //   4129: ixor
    //   4130: goto -> 4141
    //   4133: ldc2_w -771924169
    //   4136: l2i
    //   4137: ldc_w -1019052655
    //   4140: ixor
    //   4141: ldc2_w -1140232492
    //   4144: l2i
    //   4145: ldc_w 1601492481
    //   4148: ixor
    //   4149: ixor
    //   4150: lookupswitch default -> 4176, -1827553144 -> 4133, -173343599 -> 10468
    //   4176: goto -> 4180
    //   4179: athrow
    //   4180: invokespecial <init> : ()V
    //   4183: goto -> 4187
    //   4186: athrow
    //   4187: getstatic Perryc.c : I
    //   4190: iflt -> 4204
    //   4193: ldc2_w 126724440
    //   4196: l2i
    //   4197: ldc_w 2066633100
    //   4200: ixor
    //   4201: goto -> 4212
    //   4204: ldc2_w 1072445616
    //   4207: l2i
    //   4208: ldc_w 266530439
    //   4211: ixor
    //   4212: ldc2_w 457276658
    //   4215: l2i
    //   4216: ldc_w 1109531660
    //   4219: ixor
    //   4220: ixor
    //   4221: lookupswitch default -> 10336, 633378858 -> 4204, 1768797897 -> 4248
    //   4248: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4251: getstatic Perryc.0 : I
    //   4254: ifle -> 4268
    //   4257: ldc2_w 1539987802
    //   4260: l2i
    //   4261: ldc_w 370140243
    //   4264: ixor
    //   4265: goto -> 4276
    //   4268: ldc2_w 846247774
    //   4271: l2i
    //   4272: ldc_w -745864116
    //   4275: ixor
    //   4276: ldc2_w 1946606662
    //   4279: l2i
    //   4280: ldc_w 585354138
    //   4283: ixor
    //   4284: ixor
    //   4285: lookupswitch default -> 4312, 455125717 -> 10500, 1972302738 -> 4268
    //   4312: goto -> 4316
    //   4315: athrow
    //   4316: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4319: goto -> 4323
    //   4322: athrow
    //   4323: getstatic Perryc.c : I
    //   4326: iflt -> 4340
    //   4329: ldc2_w -588840689
    //   4332: l2i
    //   4333: ldc_w -873785643
    //   4336: ixor
    //   4337: goto -> 4348
    //   4340: ldc2_w -67076967
    //   4343: l2i
    //   4344: ldc_w -1113591191
    //   4347: ixor
    //   4348: ldc2_w -1454984556
    //   4351: l2i
    //   4352: ldc_w -2065266374
    //   4355: ixor
    //   4356: ixor
    //   4357: lookupswitch default -> 10454, 984362100 -> 4340, 1816114526 -> 4384
    //   4384: aload_2
    //   4385: getstatic Perryc.0 : I
    //   4388: ifle -> 4402
    //   4391: ldc2_w 108390876
    //   4394: l2i
    //   4395: ldc_w 2030992699
    //   4398: ixor
    //   4399: goto -> 4410
    //   4402: ldc2_w 129241190
    //   4405: l2i
    //   4406: ldc_w 1173637528
    //   4409: ixor
    //   4410: ldc2_w -1613140856
    //   4413: l2i
    //   4414: ldc_w -2062573939
    //   4417: ixor
    //   4418: ixor
    //   4419: lookupswitch default -> 10540, 1486269435 -> 4444, 1705862882 -> 4402
    //   4444: goto -> 4448
    //   4447: athrow
    //   4448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4451: goto -> 4455
    //   4454: athrow
    //   4455: getstatic Perryc.c : I
    //   4458: iflt -> 4472
    //   4461: ldc2_w 115423289
    //   4464: l2i
    //   4465: ldc_w -1016509011
    //   4468: ixor
    //   4469: goto -> 4480
    //   4472: ldc2_w -625223565
    //   4475: l2i
    //   4476: ldc_w -2141501774
    //   4479: ixor
    //   4480: ldc2_w -809330596
    //   4483: l2i
    //   4484: ldc_w 2033972677
    //   4487: ixor
    //   4488: ixor
    //   4489: lookupswitch default -> 10526, -333843624 -> 4516, 1936791565 -> 4472
    //   4516: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4519: getstatic Perryc.0 : I
    //   4522: ifle -> 4536
    //   4525: ldc2_w 1454761156
    //   4528: l2i
    //   4529: ldc_w -1272992481
    //   4532: ixor
    //   4533: goto -> 4544
    //   4536: ldc2_w -886277051
    //   4539: l2i
    //   4540: ldc_w -1772452371
    //   4543: ixor
    //   4544: ldc2_w -1664283807
    //   4547: l2i
    //   4548: ldc_w -411911570
    //   4551: ixor
    //   4552: ixor
    //   4553: lookupswitch default -> 10404, -1726613292 -> 4536, 650725543 -> 4580
    //   4580: goto -> 4584
    //   4583: athrow
    //   4584: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4587: goto -> 4591
    //   4590: athrow
    //   4591: getstatic Perryc.1 : I
    //   4594: ifeq -> 4608
    //   4597: ldc2_w 2121083427
    //   4600: l2i
    //   4601: ldc_w -1606721119
    //   4604: ixor
    //   4605: goto -> 4616
    //   4608: ldc2_w -1154289913
    //   4611: l2i
    //   4612: ldc_w 1337292439
    //   4615: ixor
    //   4616: ldc2_w 459134768
    //   4619: l2i
    //   4620: ldc_w -1908793561
    //   4623: ixor
    //   4624: ixor
    //   4625: lookupswitch default -> 10474, 1261536149 -> 4608, 1642090887 -> 4652
    //   4652: goto -> 4656
    //   4655: athrow
    //   4656: invokevirtual toString : ()Ljava/lang/String;
    //   4659: goto -> 4663
    //   4662: athrow
    //   4663: getstatic Perryc.0 : I
    //   4666: ifle -> 4680
    //   4669: ldc2_w -967835135
    //   4672: l2i
    //   4673: ldc_w 2137140472
    //   4676: ixor
    //   4677: goto -> 4688
    //   4680: ldc2_w 888288616
    //   4683: l2i
    //   4684: ldc_w -424489176
    //   4687: ixor
    //   4688: ldc2_w 158966077
    //   4691: l2i
    //   4692: ldc_w 2119433396
    //   4695: ixor
    //   4696: ixor
    //   4697: lookupswitch default -> 4724, -837258384 -> 10352, 269955424 -> 4680
    //   4724: astore_2
    //   4725: goto -> 10269
    //   4728: new java/lang/StringBuilder
    //   4731: dup
    //   4732: getstatic Perryc.c : I
    //   4735: iflt -> 4749
    //   4738: ldc2_w -482860111
    //   4741: l2i
    //   4742: ldc_w -1839789353
    //   4745: ixor
    //   4746: goto -> 4757
    //   4749: ldc2_w -2028941718
    //   4752: l2i
    //   4753: ldc_w -2039107532
    //   4756: ixor
    //   4757: ldc2_w -1379652916
    //   4760: l2i
    //   4761: ldc_w 1119193131
    //   4764: ixor
    //   4765: ixor
    //   4766: lookupswitch default -> 10598, -1642165375 -> 4749, -300622663 -> 4792
    //   4792: goto -> 4796
    //   4795: athrow
    //   4796: invokespecial <init> : ()V
    //   4799: goto -> 4803
    //   4802: athrow
    //   4803: getstatic Perryc.1 : I
    //   4806: ifeq -> 4820
    //   4809: ldc2_w 1716317989
    //   4812: l2i
    //   4813: ldc_w -1753704315
    //   4816: ixor
    //   4817: goto -> 4828
    //   4820: ldc2_w -1437749161
    //   4823: l2i
    //   4824: ldc_w 709015732
    //   4827: ixor
    //   4828: ldc2_w -1887386581
    //   4831: l2i
    //   4832: ldc_w -1055162619
    //   4835: ixor
    //   4836: ixor
    //   4837: lookupswitch default -> 4864, -2045798634 -> 4820, -1078997874 -> 10438
    //   4864: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_PURPLE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4867: getstatic Perryc.c : I
    //   4870: iflt -> 4884
    //   4873: ldc2_w 41888835
    //   4876: l2i
    //   4877: ldc_w -1269738949
    //   4880: ixor
    //   4881: goto -> 4892
    //   4884: ldc2_w 1285863680
    //   4887: l2i
    //   4888: ldc_w 1934017753
    //   4891: ixor
    //   4892: ldc2_w -1616248845
    //   4895: l2i
    //   4896: ldc_w 1284940543
    //   4899: ixor
    //   4900: ixor
    //   4901: lookupswitch default -> 4928, -2055250821 -> 4884, 1695622004 -> 10572
    //   4928: goto -> 4932
    //   4931: athrow
    //   4932: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4935: goto -> 4939
    //   4938: athrow
    //   4939: getstatic Perryc.1 : I
    //   4942: ifeq -> 4956
    //   4945: ldc2_w 1874490703
    //   4948: l2i
    //   4949: ldc_w -598823885
    //   4952: ixor
    //   4953: goto -> 4964
    //   4956: ldc2_w -1634765694
    //   4959: l2i
    //   4960: ldc_w 1259868636
    //   4963: ixor
    //   4964: ldc2_w -421057126
    //   4967: l2i
    //   4968: ldc_w -1289284819
    //   4971: ixor
    //   4972: ixor
    //   4973: lookupswitch default -> 10518, -2141758487 -> 5000, -432740405 -> 4956
    //   5000: aload_2
    //   5001: getstatic Perryc.c : I
    //   5004: iflt -> 5018
    //   5007: ldc2_w -347277477
    //   5010: l2i
    //   5011: ldc_w 1237205066
    //   5014: ixor
    //   5015: goto -> 5026
    //   5018: ldc2_w 1769329086
    //   5021: l2i
    //   5022: ldc_w 382866744
    //   5025: ixor
    //   5026: ldc2_w 487920068
    //   5029: l2i
    //   5030: ldc_w -1991355017
    //   5033: ixor
    //   5034: ixor
    //   5035: lookupswitch default -> 5060, 211841196 -> 5018, 917107618 -> 10410
    //   5060: goto -> 5064
    //   5063: athrow
    //   5064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5067: goto -> 5071
    //   5070: athrow
    //   5071: getstatic Perryc.1 : I
    //   5074: ifeq -> 5088
    //   5077: ldc2_w -868728896
    //   5080: l2i
    //   5081: ldc_w -911856170
    //   5084: ixor
    //   5085: goto -> 5096
    //   5088: ldc2_w 668538510
    //   5091: l2i
    //   5092: ldc_w 1700220441
    //   5095: ixor
    //   5096: ldc2_w 1048273911
    //   5099: l2i
    //   5100: ldc_w 637975816
    //   5103: ixor
    //   5104: ixor
    //   5105: lookupswitch default -> 10396, 501468393 -> 5088, 1525909096 -> 5132
    //   5132: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   5135: getstatic Perryc.0 : I
    //   5138: ifle -> 5152
    //   5141: ldc2_w 96463956
    //   5144: l2i
    //   5145: ldc_w 1652927382
    //   5148: ixor
    //   5149: goto -> 5160
    //   5152: ldc2_w -1191501056
    //   5155: l2i
    //   5156: ldc_w -708803168
    //   5159: ixor
    //   5160: ldc2_w 221007022
    //   5163: l2i
    //   5164: ldc_w 1706227323
    //   5167: ixor
    //   5168: ixor
    //   5169: lookupswitch default -> 5196, 262470935 -> 10570, 408108058 -> 5152
    //   5196: goto -> 5200
    //   5199: athrow
    //   5200: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5203: goto -> 5207
    //   5206: athrow
    //   5207: getstatic Perryc.0 : I
    //   5210: ifle -> 5224
    //   5213: ldc2_w -304439524
    //   5216: l2i
    //   5217: ldc_w 764505369
    //   5220: ixor
    //   5221: goto -> 5232
    //   5224: ldc2_w 1165532175
    //   5227: l2i
    //   5228: ldc_w -514055742
    //   5231: ixor
    //   5232: ldc2_w 614148117
    //   5235: l2i
    //   5236: ldc_w -1328835530
    //   5239: ixor
    //   5240: ixor
    //   5241: lookupswitch default -> 5268, 832721780 -> 5224, 1411075622 -> 10558
    //   5268: goto -> 5272
    //   5271: athrow
    //   5272: invokevirtual toString : ()Ljava/lang/String;
    //   5275: goto -> 5279
    //   5278: athrow
    //   5279: getstatic Perryc.1 : I
    //   5282: ifeq -> 5296
    //   5285: ldc2_w -1198478797
    //   5288: l2i
    //   5289: ldc_w 920197377
    //   5292: ixor
    //   5293: goto -> 5304
    //   5296: ldc2_w -389902854
    //   5299: l2i
    //   5300: ldc_w -1534995798
    //   5303: ixor
    //   5304: ldc2_w -1132946907
    //   5307: l2i
    //   5308: ldc_w -1962310557
    //   5311: ixor
    //   5312: ixor
    //   5313: lookupswitch default -> 10602, -1187467916 -> 5296, 2066891030 -> 5340
    //   5340: astore_2
    //   5341: goto -> 10269
    //   5344: new java/lang/StringBuilder
    //   5347: dup
    //   5348: getstatic Perryc.c : I
    //   5351: iflt -> 5365
    //   5354: ldc2_w -702213353
    //   5357: l2i
    //   5358: ldc_w -801797505
    //   5361: ixor
    //   5362: goto -> 5373
    //   5365: ldc2_w 651809576
    //   5368: l2i
    //   5369: ldc_w -815516025
    //   5372: ixor
    //   5373: ldc2_w 103972701
    //   5376: l2i
    //   5377: ldc_w 823629043
    //   5380: ixor
    //   5381: ixor
    //   5382: lookupswitch default -> 10592, -560460287 -> 5408, 825586374 -> 5365
    //   5408: goto -> 5412
    //   5411: athrow
    //   5412: invokespecial <init> : ()V
    //   5415: goto -> 5419
    //   5418: athrow
    //   5419: getstatic Perryc.0 : I
    //   5422: ifle -> 5436
    //   5425: ldc2_w -981856530
    //   5428: l2i
    //   5429: ldc_w -738716276
    //   5432: ixor
    //   5433: goto -> 5444
    //   5436: ldc2_w -1542398499
    //   5439: l2i
    //   5440: ldc_w 1576559202
    //   5443: ixor
    //   5444: ldc2_w 369092034
    //   5447: l2i
    //   5448: ldc_w 1435294896
    //   5451: ixor
    //   5452: ixor
    //   5453: lookupswitch default -> 5480, -539882875 -> 5436, 1458643472 -> 10444
    //   5480: getstatic com/mojang/realmsclient/gui/ChatFormatting.GOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   5483: getstatic Perryc.1 : I
    //   5486: ifeq -> 5500
    //   5489: ldc2_w -1553957226
    //   5492: l2i
    //   5493: ldc_w -1403311773
    //   5496: ixor
    //   5497: goto -> 5508
    //   5500: ldc2_w 355258070
    //   5503: l2i
    //   5504: ldc_w -8962123
    //   5507: ixor
    //   5508: ldc2_w -1843134961
    //   5511: l2i
    //   5512: ldc_w -461229546
    //   5515: ixor
    //   5516: ixor
    //   5517: lookupswitch default -> 5544, -1061644789 -> 5500, 2040175596 -> 10358
    //   5544: goto -> 5548
    //   5547: athrow
    //   5548: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5551: goto -> 5555
    //   5554: athrow
    //   5555: getstatic Perryc.0 : I
    //   5558: ifle -> 5572
    //   5561: ldc2_w 1916321403
    //   5564: l2i
    //   5565: ldc_w -1625435972
    //   5568: ixor
    //   5569: goto -> 5580
    //   5572: ldc2_w -1745815159
    //   5575: l2i
    //   5576: ldc_w -43521405
    //   5579: ixor
    //   5580: ldc2_w 1718498991
    //   5583: l2i
    //   5584: ldc_w -1425597290
    //   5587: ixor
    //   5588: ixor
    //   5589: lookupswitch default -> 5616, 541869310 -> 10432, 990471837 -> 5572
    //   5616: aload_2
    //   5617: getstatic Perryc.0 : I
    //   5620: ifle -> 5634
    //   5623: ldc2_w -1338650288
    //   5626: l2i
    //   5627: ldc_w 1346954861
    //   5630: ixor
    //   5631: goto -> 5642
    //   5634: ldc2_w 492274859
    //   5637: l2i
    //   5638: ldc_w 2886153
    //   5641: ixor
    //   5642: ldc2_w -1746084952
    //   5645: l2i
    //   5646: ldc_w 481449729
    //   5649: ixor
    //   5650: ixor
    //   5651: lookupswitch default -> 10392, -1775959541 -> 5676, 1797503892 -> 5634
    //   5676: goto -> 5680
    //   5679: athrow
    //   5680: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5683: goto -> 5687
    //   5686: athrow
    //   5687: getstatic Perryc.0 : I
    //   5690: ifle -> 5704
    //   5693: ldc2_w -1547870156
    //   5696: l2i
    //   5697: ldc_w -110707504
    //   5700: ixor
    //   5701: goto -> 5712
    //   5704: ldc2_w -1623493509
    //   5707: l2i
    //   5708: ldc_w -1053175541
    //   5711: ixor
    //   5712: ldc2_w 2038587284
    //   5715: l2i
    //   5716: ldc_w 1203408166
    //   5719: ixor
    //   5720: ixor
    //   5721: lookupswitch default -> 5748, 1692601942 -> 10470, 1697594953 -> 5704
    //   5748: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   5751: getstatic Perryc.c : I
    //   5754: iflt -> 5768
    //   5757: ldc2_w -2080387708
    //   5760: l2i
    //   5761: ldc_w 1816027442
    //   5764: ixor
    //   5765: goto -> 5776
    //   5768: ldc2_w -1897376820
    //   5771: l2i
    //   5772: ldc_w -285537909
    //   5775: ixor
    //   5776: ldc2_w -816951120
    //   5779: l2i
    //   5780: ldc_w 1325673959
    //   5783: ixor
    //   5784: ixor
    //   5785: lookupswitch default -> 5812, 788876749 -> 5768, 1871434209 -> 10426
    //   5812: goto -> 5816
    //   5815: athrow
    //   5816: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5819: goto -> 5823
    //   5822: athrow
    //   5823: getstatic Perryc.c : I
    //   5826: iflt -> 5840
    //   5829: ldc2_w -52766117
    //   5832: l2i
    //   5833: ldc_w 385942914
    //   5836: ixor
    //   5837: goto -> 5848
    //   5840: ldc2_w -476772240
    //   5843: l2i
    //   5844: ldc_w 123692036
    //   5847: ixor
    //   5848: ldc2_w -896644827
    //   5851: l2i
    //   5852: ldc_w 1542559709
    //   5855: ixor
    //   5856: ixor
    //   5857: lookupswitch default -> 5884, -537039433 -> 5840, 2057568545 -> 10620
    //   5884: goto -> 5888
    //   5887: athrow
    //   5888: invokevirtual toString : ()Ljava/lang/String;
    //   5891: goto -> 5895
    //   5894: athrow
    //   5895: getstatic Perryc.0 : I
    //   5898: ifle -> 5912
    //   5901: ldc2_w 1433316323
    //   5904: l2i
    //   5905: ldc_w 514468792
    //   5908: ixor
    //   5909: goto -> 5920
    //   5912: ldc2_w -1955588286
    //   5915: l2i
    //   5916: ldc_w -1606526400
    //   5919: ixor
    //   5920: ldc2_w 1935145657
    //   5923: l2i
    //   5924: ldc_w -1013330398
    //   5927: ixor
    //   5928: ixor
    //   5929: lookupswitch default -> 5956, -83184448 -> 10626, 1253585538 -> 5912
    //   5956: astore_2
    //   5957: goto -> 10269
    //   5960: new java/lang/StringBuilder
    //   5963: dup
    //   5964: getstatic Perryc.0 : I
    //   5967: ifle -> 5981
    //   5970: ldc2_w -1545759749
    //   5973: l2i
    //   5974: ldc_w -1800885743
    //   5977: ixor
    //   5978: goto -> 5989
    //   5981: ldc2_w 1823138612
    //   5984: l2i
    //   5985: ldc_w 146053373
    //   5988: ixor
    //   5989: ldc2_w 1509945755
    //   5992: l2i
    //   5993: ldc_w 1033116245
    //   5996: ixor
    //   5997: ixor
    //   5998: lookupswitch default -> 10496, 7704583 -> 6024, 1394528804 -> 5981
    //   6024: goto -> 6028
    //   6027: athrow
    //   6028: invokespecial <init> : ()V
    //   6031: goto -> 6035
    //   6034: athrow
    //   6035: getstatic Perryc.0 : I
    //   6038: ifle -> 6052
    //   6041: ldc2_w 1168755978
    //   6044: l2i
    //   6045: ldc_w -1202786622
    //   6048: ixor
    //   6049: goto -> 6060
    //   6052: ldc2_w -765860997
    //   6055: l2i
    //   6056: ldc_w -431740948
    //   6059: ixor
    //   6060: ldc2_w -137357952
    //   6063: l2i
    //   6064: ldc_w 1363729783
    //   6067: ixor
    //   6068: ixor
    //   6069: lookupswitch default -> 6096, -1212535345 -> 6052, 1535109951 -> 10486
    //   6096: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6099: getstatic Perryc.c : I
    //   6102: iflt -> 6116
    //   6105: ldc2_w 1426577984
    //   6108: l2i
    //   6109: ldc_w -1863292316
    //   6112: ixor
    //   6113: goto -> 6124
    //   6116: ldc2_w 1015261067
    //   6119: l2i
    //   6120: ldc_w -2129527972
    //   6123: ixor
    //   6124: ldc2_w 972962704
    //   6127: l2i
    //   6128: ldc_w 1963783780
    //   6131: ixor
    //   6132: ixor
    //   6133: lookupswitch default -> 6160, -1996128816 -> 10340, -1187396108 -> 6116
    //   6160: goto -> 6164
    //   6163: athrow
    //   6164: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6167: goto -> 6171
    //   6170: athrow
    //   6171: getstatic Perryc.c : I
    //   6174: iflt -> 6188
    //   6177: ldc2_w -1430971427
    //   6180: l2i
    //   6181: ldc_w -1834775666
    //   6184: ixor
    //   6185: goto -> 6196
    //   6188: ldc2_w 123633496
    //   6191: l2i
    //   6192: ldc_w -1707915855
    //   6195: ixor
    //   6196: ldc2_w -686319742
    //   6199: l2i
    //   6200: ldc_w 907371724
    //   6203: ixor
    //   6204: ixor
    //   6205: lookupswitch default -> 10532, -652975331 -> 6188, 2087700903 -> 6232
    //   6232: aload_2
    //   6233: getstatic Perryc.0 : I
    //   6236: ifle -> 6250
    //   6239: ldc2_w 2127510782
    //   6242: l2i
    //   6243: ldc_w 186292055
    //   6246: ixor
    //   6247: goto -> 6258
    //   6250: ldc2_w 2058384787
    //   6253: l2i
    //   6254: ldc_w 1064261158
    //   6257: ixor
    //   6258: ldc2_w -1063386758
    //   6261: l2i
    //   6262: ldc_w 332523198
    //   6265: ixor
    //   6266: ixor
    //   6267: lookupswitch default -> 10368, -1768897423 -> 6292, -1499837331 -> 6250
    //   6292: goto -> 6296
    //   6295: athrow
    //   6296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6299: goto -> 6303
    //   6302: athrow
    //   6303: getstatic Perryc.c : I
    //   6306: iflt -> 6320
    //   6309: ldc2_w 1248164795
    //   6312: l2i
    //   6313: ldc_w 902477545
    //   6316: ixor
    //   6317: goto -> 6328
    //   6320: ldc2_w -491359506
    //   6323: l2i
    //   6324: ldc_w 1123667579
    //   6327: ixor
    //   6328: ldc2_w -1663339163
    //   6331: l2i
    //   6332: ldc_w -618390976
    //   6335: ixor
    //   6336: ixor
    //   6337: lookupswitch default -> 6364, 351753346 -> 6320, 944808567 -> 10378
    //   6364: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6367: getstatic Perryc.c : I
    //   6370: iflt -> 6384
    //   6373: ldc2_w -1787279008
    //   6376: l2i
    //   6377: ldc_w -689858893
    //   6380: ixor
    //   6381: goto -> 6392
    //   6384: ldc2_w -485137232
    //   6387: l2i
    //   6388: ldc_w -51089895
    //   6391: ixor
    //   6392: ldc2_w 150976162
    //   6395: l2i
    //   6396: ldc_w 708707603
    //   6399: ixor
    //   6400: ixor
    //   6401: lookupswitch default -> 10576, 1025554712 -> 6428, 1633184866 -> 6384
    //   6428: goto -> 6432
    //   6431: athrow
    //   6432: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6435: goto -> 6439
    //   6438: athrow
    //   6439: getstatic Perryc.c : I
    //   6442: iflt -> 6456
    //   6445: ldc2_w 1020002765
    //   6448: l2i
    //   6449: ldc_w -598870229
    //   6452: ixor
    //   6453: goto -> 6464
    //   6456: ldc2_w -874841941
    //   6459: l2i
    //   6460: ldc_w -1643034288
    //   6463: ixor
    //   6464: ldc2_w 1370510893
    //   6467: l2i
    //   6468: ldc_w -358823816
    //   6471: ixor
    //   6472: ixor
    //   6473: lookupswitch default -> 6500, -326411500 -> 6456, 1538091187 -> 10356
    //   6500: goto -> 6504
    //   6503: athrow
    //   6504: invokevirtual toString : ()Ljava/lang/String;
    //   6507: goto -> 6511
    //   6510: athrow
    //   6511: getstatic Perryc.0 : I
    //   6514: ifle -> 6528
    //   6517: ldc2_w -1738283002
    //   6520: l2i
    //   6521: ldc_w 1345419954
    //   6524: ixor
    //   6525: goto -> 6536
    //   6528: ldc2_w 867992486
    //   6531: l2i
    //   6532: ldc_w -1051265799
    //   6535: ixor
    //   6536: ldc2_w 251606296
    //   6539: l2i
    //   6540: ldc_w 1589653144
    //   6543: ixor
    //   6544: ixor
    //   6545: lookupswitch default -> 10504, -1737651916 -> 6528, -1563071265 -> 6572
    //   6572: astore_2
    //   6573: goto -> 10269
    //   6576: new java/lang/StringBuilder
    //   6579: dup
    //   6580: getstatic Perryc.1 : I
    //   6583: ifeq -> 6597
    //   6586: ldc2_w -634916138
    //   6589: l2i
    //   6590: ldc_w 1192642791
    //   6593: ixor
    //   6594: goto -> 6605
    //   6597: ldc2_w 2041228543
    //   6600: l2i
    //   6601: ldc_w 1597406934
    //   6604: ixor
    //   6605: ldc2_w 570508996
    //   6608: l2i
    //   6609: ldc_w -146756340
    //   6612: ixor
    //   6613: ixor
    //   6614: lookupswitch default -> 10616, -203605535 -> 6640, 1215320569 -> 6597
    //   6640: goto -> 6644
    //   6643: athrow
    //   6644: invokespecial <init> : ()V
    //   6647: goto -> 6651
    //   6650: athrow
    //   6651: getstatic Perryc.1 : I
    //   6654: ifeq -> 6668
    //   6657: ldc2_w -138610593
    //   6660: l2i
    //   6661: ldc_w -524186646
    //   6664: ixor
    //   6665: goto -> 6676
    //   6668: ldc2_w -1063501524
    //   6671: l2i
    //   6672: ldc_w -1203117884
    //   6675: ixor
    //   6676: ldc2_w 1009653200
    //   6679: l2i
    //   6680: ldc_w -1098574071
    //   6683: ixor
    //   6684: ixor
    //   6685: lookupswitch default -> 6712, -1781108372 -> 10606, 992389899 -> 6668
    //   6712: getstatic com/mojang/realmsclient/gui/ChatFormatting.GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6715: getstatic Perryc.c : I
    //   6718: iflt -> 6732
    //   6721: ldc2_w -116168993
    //   6724: l2i
    //   6725: ldc_w -1165392268
    //   6728: ixor
    //   6729: goto -> 6740
    //   6732: ldc2_w 1221436642
    //   6735: l2i
    //   6736: ldc_w 1677150658
    //   6739: ixor
    //   6740: ldc2_w 2069421339
    //   6743: l2i
    //   6744: ldc_w -685907672
    //   6747: ixor
    //   6748: ixor
    //   6749: lookupswitch default -> 10610, -2021666541 -> 6776, -270541672 -> 6732
    //   6776: goto -> 6780
    //   6779: athrow
    //   6780: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6783: goto -> 6787
    //   6786: athrow
    //   6787: getstatic Perryc.c : I
    //   6790: iflt -> 6804
    //   6793: ldc2_w 466989983
    //   6796: l2i
    //   6797: ldc_w 1384019695
    //   6800: ixor
    //   6801: goto -> 6812
    //   6804: ldc2_w -564340007
    //   6807: l2i
    //   6808: ldc_w -718112159
    //   6811: ixor
    //   6812: ldc2_w -1287412443
    //   6815: l2i
    //   6816: ldc_w -97926241
    //   6819: ixor
    //   6820: ixor
    //   6821: lookupswitch default -> 6848, -1860757274 -> 6804, 12690378 -> 10624
    //   6848: aload_2
    //   6849: getstatic Perryc.1 : I
    //   6852: ifeq -> 6866
    //   6855: ldc2_w 984994910
    //   6858: l2i
    //   6859: ldc_w 126270387
    //   6862: ixor
    //   6863: goto -> 6874
    //   6866: ldc2_w 1583052063
    //   6869: l2i
    //   6870: ldc_w -1162568748
    //   6873: ixor
    //   6874: ldc2_w -413226651
    //   6877: l2i
    //   6878: ldc_w -1522809238
    //   6881: ixor
    //   6882: ixor
    //   6883: lookupswitch default -> 6908, -1793937032 -> 6866, 2136342754 -> 10554
    //   6908: goto -> 6912
    //   6911: athrow
    //   6912: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6915: goto -> 6919
    //   6918: athrow
    //   6919: getstatic Perryc.c : I
    //   6922: iflt -> 6936
    //   6925: ldc2_w -1239078807
    //   6928: l2i
    //   6929: ldc_w 198114360
    //   6932: ixor
    //   6933: goto -> 6944
    //   6936: ldc2_w 1081020264
    //   6939: l2i
    //   6940: ldc_w -1530428165
    //   6943: ixor
    //   6944: ldc2_w 391078327
    //   6947: l2i
    //   6948: ldc_w 1502574689
    //   6951: ixor
    //   6952: ixor
    //   6953: lookupswitch default -> 10382, -1435987387 -> 6980, -215233145 -> 6936
    //   6980: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6983: getstatic Perryc.1 : I
    //   6986: ifeq -> 7000
    //   6989: ldc2_w -976738566
    //   6992: l2i
    //   6993: ldc_w 1751886494
    //   6996: ixor
    //   6997: goto -> 7008
    //   7000: ldc2_w 1674388070
    //   7003: l2i
    //   7004: ldc_w 1635268065
    //   7007: ixor
    //   7008: ldc2_w 1681269152
    //   7011: l2i
    //   7012: ldc_w -59977483
    //   7015: ixor
    //   7016: ixor
    //   7017: lookupswitch default -> 10416, -1695553838 -> 7044, 905542961 -> 7000
    //   7044: goto -> 7048
    //   7047: athrow
    //   7048: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7051: goto -> 7055
    //   7054: athrow
    //   7055: getstatic Perryc.0 : I
    //   7058: ifle -> 7072
    //   7061: ldc2_w 1540951873
    //   7064: l2i
    //   7065: ldc_w 1892459632
    //   7068: ixor
    //   7069: goto -> 7080
    //   7072: ldc2_w -831610672
    //   7075: l2i
    //   7076: ldc_w 362451982
    //   7079: ixor
    //   7080: ldc2_w 1511722781
    //   7083: l2i
    //   7084: ldc_w -1085176349
    //   7087: ixor
    //   7088: ixor
    //   7089: lookupswitch default -> 7116, -1948085320 -> 7072, -832626225 -> 10330
    //   7116: goto -> 7120
    //   7119: athrow
    //   7120: invokevirtual toString : ()Ljava/lang/String;
    //   7123: goto -> 7127
    //   7126: athrow
    //   7127: getstatic Perryc.c : I
    //   7130: iflt -> 7144
    //   7133: ldc2_w -695651045
    //   7136: l2i
    //   7137: ldc_w 828469054
    //   7140: ixor
    //   7141: goto -> 7152
    //   7144: ldc2_w -651727361
    //   7147: l2i
    //   7148: ldc_w -137946778
    //   7151: ixor
    //   7152: ldc2_w 2028332064
    //   7155: l2i
    //   7156: ldc_w -231653727
    //   7159: ixor
    //   7160: ixor
    //   7161: lookupswitch default -> 10360, -1540051432 -> 7188, 1832681636 -> 7144
    //   7188: astore_2
    //   7189: goto -> 10269
    //   7192: new java/lang/StringBuilder
    //   7195: dup
    //   7196: getstatic Perryc.1 : I
    //   7199: ifeq -> 7213
    //   7202: ldc2_w -995152237
    //   7205: l2i
    //   7206: ldc_w -1372524716
    //   7209: ixor
    //   7210: goto -> 7221
    //   7213: ldc2_w -569652354
    //   7216: l2i
    //   7217: ldc_w -200357494
    //   7220: ixor
    //   7221: ldc2_w 1860629329
    //   7224: l2i
    //   7225: ldc_w 2062906843
    //   7228: ixor
    //   7229: ixor
    //   7230: lookupswitch default -> 10452, 1041663102 -> 7256, 2123122509 -> 7213
    //   7256: goto -> 7260
    //   7259: athrow
    //   7260: invokespecial <init> : ()V
    //   7263: goto -> 7267
    //   7266: athrow
    //   7267: getstatic Perryc.0 : I
    //   7270: ifle -> 7284
    //   7273: ldc2_w -261181576
    //   7276: l2i
    //   7277: ldc_w 2021502630
    //   7280: ixor
    //   7281: goto -> 7292
    //   7284: ldc2_w 663054898
    //   7287: l2i
    //   7288: ldc_w 1378061143
    //   7291: ixor
    //   7292: ldc2_w -1487118133
    //   7295: l2i
    //   7296: ldc_w 742023704
    //   7299: ixor
    //   7300: ixor
    //   7301: lookupswitch default -> 7328, -1458003179 -> 7284, 58000141 -> 10550
    //   7328: getstatic com/mojang/realmsclient/gui/ChatFormatting.BLUE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7331: getstatic Perryc.c : I
    //   7334: iflt -> 7348
    //   7337: ldc2_w 783992635
    //   7340: l2i
    //   7341: ldc_w -1247938681
    //   7344: ixor
    //   7345: goto -> 7356
    //   7348: ldc2_w -1395194152
    //   7351: l2i
    //   7352: ldc_w 1316426504
    //   7355: ixor
    //   7356: ldc2_w -1690810887
    //   7359: l2i
    //   7360: ldc_w -1358963817
    //   7363: ixor
    //   7364: ixor
    //   7365: lookupswitch default -> 10582, -1361006894 -> 7348, -681079874 -> 7392
    //   7392: goto -> 7396
    //   7395: athrow
    //   7396: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7399: goto -> 7403
    //   7402: athrow
    //   7403: getstatic Perryc.0 : I
    //   7406: ifle -> 7420
    //   7409: ldc2_w -255078811
    //   7412: l2i
    //   7413: ldc_w -644249210
    //   7416: ixor
    //   7417: goto -> 7428
    //   7420: ldc2_w -514250887
    //   7423: l2i
    //   7424: ldc_w -1378635889
    //   7427: ixor
    //   7428: ldc2_w -1327443410
    //   7431: l2i
    //   7432: ldc_w -903425858
    //   7435: ixor
    //   7436: ixor
    //   7437: lookupswitch default -> 10516, 910985830 -> 7464, 1402226035 -> 7420
    //   7464: aload_2
    //   7465: getstatic Perryc.1 : I
    //   7468: ifeq -> 7482
    //   7471: ldc2_w -1278896985
    //   7474: l2i
    //   7475: ldc_w -1812944000
    //   7478: ixor
    //   7479: goto -> 7490
    //   7482: ldc2_w -36702767
    //   7485: l2i
    //   7486: ldc_w 2097847635
    //   7489: ixor
    //   7490: ldc2_w 1163370358
    //   7493: l2i
    //   7494: ldc_w -121489433
    //   7497: ixor
    //   7498: ixor
    //   7499: lookupswitch default -> 10484, -1650419786 -> 7482, 1028702227 -> 7524
    //   7524: goto -> 7528
    //   7527: athrow
    //   7528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7531: goto -> 7535
    //   7534: athrow
    //   7535: getstatic Perryc.0 : I
    //   7538: ifle -> 7552
    //   7541: ldc2_w 164498010
    //   7544: l2i
    //   7545: ldc_w -387934282
    //   7548: ixor
    //   7549: goto -> 7560
    //   7552: ldc2_w 972718484
    //   7555: l2i
    //   7556: ldc_w -1671680400
    //   7559: ixor
    //   7560: ldc2_w -166505577
    //   7563: l2i
    //   7564: ldc_w 625234913
    //   7567: ixor
    //   7568: ixor
    //   7569: lookupswitch default -> 7596, -1300908291 -> 7552, 846831002 -> 10446
    //   7596: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7599: getstatic Perryc.1 : I
    //   7602: ifeq -> 7616
    //   7605: ldc2_w -913432463
    //   7608: l2i
    //   7609: ldc_w 457980669
    //   7612: ixor
    //   7613: goto -> 7624
    //   7616: ldc2_w 1497921432
    //   7619: l2i
    //   7620: ldc_w 1428033656
    //   7623: ixor
    //   7624: ldc2_w 904875026
    //   7627: l2i
    //   7628: ldc_w 211473443
    //   7631: ixor
    //   7632: ixor
    //   7633: lookupswitch default -> 10590, -340294979 -> 7616, 891551697 -> 7660
    //   7660: goto -> 7664
    //   7663: athrow
    //   7664: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7667: goto -> 7671
    //   7670: athrow
    //   7671: getstatic Perryc.c : I
    //   7674: iflt -> 7688
    //   7677: ldc2_w -2054544081
    //   7680: l2i
    //   7681: ldc_w 567408532
    //   7684: ixor
    //   7685: goto -> 7696
    //   7688: ldc2_w 1763416297
    //   7691: l2i
    //   7692: ldc_w 1293421374
    //   7695: ixor
    //   7696: ldc2_w 682998009
    //   7699: l2i
    //   7700: ldc_w 1215401674
    //   7703: ixor
    //   7704: ixor
    //   7705: lookupswitch default -> 7732, -996154232 -> 10462, -499362269 -> 7688
    //   7732: goto -> 7736
    //   7735: athrow
    //   7736: invokevirtual toString : ()Ljava/lang/String;
    //   7739: goto -> 7743
    //   7742: athrow
    //   7743: getstatic Perryc.c : I
    //   7746: iflt -> 7760
    //   7749: ldc2_w 1313638858
    //   7752: l2i
    //   7753: ldc_w 1870733849
    //   7756: ixor
    //   7757: goto -> 7768
    //   7760: ldc2_w 1980159105
    //   7763: l2i
    //   7764: ldc_w -1200746206
    //   7767: ixor
    //   7768: ldc2_w -1893170279
    //   7771: l2i
    //   7772: ldc_w 212415206
    //   7775: ixor
    //   7776: ixor
    //   7777: lookupswitch default -> 10530, -1572070740 -> 7760, 1307145436 -> 7804
    //   7804: astore_2
    //   7805: goto -> 10269
    //   7808: new java/lang/StringBuilder
    //   7811: dup
    //   7812: getstatic Perryc.1 : I
    //   7815: ifeq -> 7829
    //   7818: ldc2_w -475381395
    //   7821: l2i
    //   7822: ldc_w 1630558762
    //   7825: ixor
    //   7826: goto -> 7837
    //   7829: ldc2_w -2122376
    //   7832: l2i
    //   7833: ldc_w -195525727
    //   7836: ixor
    //   7837: ldc2_w -627079293
    //   7840: l2i
    //   7841: ldc_w -1834760252
    //   7844: ixor
    //   7845: ixor
    //   7846: lookupswitch default -> 7872, -895067392 -> 10466, 1512465691 -> 7829
    //   7872: goto -> 7876
    //   7875: athrow
    //   7876: invokespecial <init> : ()V
    //   7879: goto -> 7883
    //   7882: athrow
    //   7883: getstatic Perryc.1 : I
    //   7886: ifeq -> 7900
    //   7889: ldc2_w -1256616652
    //   7892: l2i
    //   7893: ldc_w -782661503
    //   7896: ixor
    //   7897: goto -> 7908
    //   7900: ldc2_w 1679948630
    //   7903: l2i
    //   7904: ldc_w -765091982
    //   7907: ixor
    //   7908: ldc2_w -892776317
    //   7911: l2i
    //   7912: ldc_w -819697596
    //   7915: ixor
    //   7916: ixor
    //   7917: lookupswitch default -> 7944, 349687952 -> 7900, 1638743410 -> 10464
    //   7944: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7947: getstatic Perryc.0 : I
    //   7950: ifle -> 7964
    //   7953: ldc2_w -1686860845
    //   7956: l2i
    //   7957: ldc_w 1550860087
    //   7960: ixor
    //   7961: goto -> 7972
    //   7964: ldc2_w -1720461646
    //   7967: l2i
    //   7968: ldc_w 1634334750
    //   7971: ixor
    //   7972: ldc2_w 611504023
    //   7975: l2i
    //   7976: ldc_w -1135980778
    //   7979: ixor
    //   7980: ixor
    //   7981: lookupswitch default -> 10362, 1597781093 -> 7964, 1612885549 -> 8008
    //   8008: goto -> 8012
    //   8011: athrow
    //   8012: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8015: goto -> 8019
    //   8018: athrow
    //   8019: getstatic Perryc.0 : I
    //   8022: ifle -> 8036
    //   8025: ldc2_w -1172538690
    //   8028: l2i
    //   8029: ldc_w -1008192154
    //   8032: ixor
    //   8033: goto -> 8044
    //   8036: ldc2_w -1456771718
    //   8039: l2i
    //   8040: ldc_w 1233933419
    //   8043: ixor
    //   8044: ldc2_w -1401471080
    //   8047: l2i
    //   8048: ldc_w 1369005408
    //   8051: ixor
    //   8052: ixor
    //   8053: lookupswitch default -> 10506, -2078659296 -> 8036, 491346921 -> 8080
    //   8080: aload_2
    //   8081: getstatic Perryc.1 : I
    //   8084: ifeq -> 8098
    //   8087: ldc2_w -877537163
    //   8090: l2i
    //   8091: ldc_w 1174576594
    //   8094: ixor
    //   8095: goto -> 8106
    //   8098: ldc2_w -1803096450
    //   8101: l2i
    //   8102: ldc_w 1821260980
    //   8105: ixor
    //   8106: ldc2_w -879199190
    //   8109: l2i
    //   8110: ldc_w -136881449
    //   8113: ixor
    //   8114: ixor
    //   8115: lookupswitch default -> 10628, -1308859558 -> 8098, -1001917385 -> 8140
    //   8140: goto -> 8144
    //   8143: athrow
    //   8144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8147: goto -> 8151
    //   8150: athrow
    //   8151: getstatic Perryc.0 : I
    //   8154: ifle -> 8168
    //   8157: ldc2_w 2082963904
    //   8160: l2i
    //   8161: ldc_w -1666896258
    //   8164: ixor
    //   8165: goto -> 8176
    //   8168: ldc2_w 2069699437
    //   8171: l2i
    //   8172: ldc_w 1714212263
    //   8175: ixor
    //   8176: ldc2_w 1280267218
    //   8179: l2i
    //   8180: ldc_w 169618040
    //   8183: ixor
    //   8184: ixor
    //   8185: lookupswitch default -> 10482, -1496197612 -> 8168, 1528999776 -> 8212
    //   8212: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   8215: getstatic Perryc.c : I
    //   8218: iflt -> 8232
    //   8221: ldc2_w -613257590
    //   8224: l2i
    //   8225: ldc_w 1382013176
    //   8228: ixor
    //   8229: goto -> 8240
    //   8232: ldc2_w -1111037929
    //   8235: l2i
    //   8236: ldc_w -1955148629
    //   8239: ixor
    //   8240: ldc2_w 1075629617
    //   8243: l2i
    //   8244: ldc_w 256703987
    //   8247: ixor
    //   8248: ixor
    //   8249: lookupswitch default -> 8276, -964852304 -> 10344, 132863881 -> 8232
    //   8276: goto -> 8280
    //   8279: athrow
    //   8280: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8283: goto -> 8287
    //   8286: athrow
    //   8287: getstatic Perryc.0 : I
    //   8290: ifle -> 8304
    //   8293: ldc2_w -1499522034
    //   8296: l2i
    //   8297: ldc_w -71581226
    //   8300: ixor
    //   8301: goto -> 8312
    //   8304: ldc2_w -893392946
    //   8307: l2i
    //   8308: ldc_w -1800903930
    //   8311: ixor
    //   8312: ldc2_w -1543237155
    //   8315: l2i
    //   8316: ldc_w -1335959831
    //   8319: ixor
    //   8320: ixor
    //   8321: lookupswitch default -> 8348, -1275377745 -> 8304, 1232999148 -> 10354
    //   8348: goto -> 8352
    //   8351: athrow
    //   8352: invokevirtual toString : ()Ljava/lang/String;
    //   8355: goto -> 8359
    //   8358: athrow
    //   8359: getstatic Perryc.1 : I
    //   8362: ifeq -> 8376
    //   8365: ldc2_w -1407985955
    //   8368: l2i
    //   8369: ldc_w 848930681
    //   8372: ixor
    //   8373: goto -> 8384
    //   8376: ldc2_w -391301976
    //   8379: l2i
    //   8380: ldc_w 1624151748
    //   8383: ixor
    //   8384: ldc2_w -1036269176
    //   8387: l2i
    //   8388: ldc_w 1299316346
    //   8391: ixor
    //   8392: ixor
    //   8393: lookupswitch default -> 8420, -1296309392 -> 8376, 297813590 -> 10448
    //   8420: astore_2
    //   8421: goto -> 10269
    //   8424: new java/lang/StringBuilder
    //   8427: dup
    //   8428: getstatic Perryc.1 : I
    //   8431: ifeq -> 8445
    //   8434: ldc2_w 535371317
    //   8437: l2i
    //   8438: ldc_w -202422945
    //   8441: ixor
    //   8442: goto -> 8453
    //   8445: ldc2_w -834651492
    //   8448: l2i
    //   8449: ldc_w 1142048612
    //   8452: ixor
    //   8453: ldc2_w 1633453502
    //   8456: l2i
    //   8457: ldc_w -515977572
    //   8460: ixor
    //   8461: ixor
    //   8462: lookupswitch default -> 10594, 170931930 -> 8488, 1818497096 -> 8445
    //   8488: goto -> 8492
    //   8491: athrow
    //   8492: invokespecial <init> : ()V
    //   8495: goto -> 8499
    //   8498: athrow
    //   8499: getstatic Perryc.1 : I
    //   8502: ifeq -> 8516
    //   8505: ldc2_w -993537347
    //   8508: l2i
    //   8509: ldc_w -1851877852
    //   8512: ixor
    //   8513: goto -> 8524
    //   8516: ldc2_w 1494916838
    //   8519: l2i
    //   8520: ldc_w -1911605844
    //   8523: ixor
    //   8524: ldc2_w -639359666
    //   8527: l2i
    //   8528: ldc_w 376633355
    //   8531: ixor
    //   8532: ixor
    //   8533: lookupswitch default -> 10508, -1697670692 -> 8516, 411268623 -> 8560
    //   8560: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   8563: getstatic Perryc.1 : I
    //   8566: ifeq -> 8580
    //   8569: ldc2_w -43733257
    //   8572: l2i
    //   8573: ldc_w -2071955781
    //   8576: ixor
    //   8577: goto -> 8588
    //   8580: ldc2_w 966073954
    //   8583: l2i
    //   8584: ldc_w -360556298
    //   8587: ixor
    //   8588: ldc2_w 1756644164
    //   8591: l2i
    //   8592: ldc_w -1489072428
    //   8595: ixor
    //   8596: ixor
    //   8597: lookupswitch default -> 10338, -1234299428 -> 8580, 480086788 -> 8624
    //   8624: goto -> 8628
    //   8627: athrow
    //   8628: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8631: goto -> 8635
    //   8634: athrow
    //   8635: getstatic Perryc.c : I
    //   8638: iflt -> 8652
    //   8641: ldc2_w 1222352294
    //   8644: l2i
    //   8645: ldc_w 1491751634
    //   8648: ixor
    //   8649: goto -> 8660
    //   8652: ldc2_w -1578664190
    //   8655: l2i
    //   8656: ldc_w 1878787278
    //   8659: ixor
    //   8660: ldc2_w 234063731
    //   8663: l2i
    //   8664: ldc_w 963583832
    //   8667: ixor
    //   8668: ixor
    //   8669: lookupswitch default -> 10502, -91757593 -> 8696, 615339871 -> 8652
    //   8696: aload_2
    //   8697: getstatic Perryc.0 : I
    //   8700: ifle -> 8714
    //   8703: ldc2_w -1287400244
    //   8706: l2i
    //   8707: ldc_w 1731242140
    //   8710: ixor
    //   8711: goto -> 8722
    //   8714: ldc2_w -519995457
    //   8717: l2i
    //   8718: ldc_w -842397005
    //   8721: ixor
    //   8722: ldc2_w 1382946058
    //   8725: l2i
    //   8726: ldc_w -1229148650
    //   8729: ixor
    //   8730: ixor
    //   8731: lookupswitch default -> 8756, -573253796 -> 8714, 815908684 -> 10514
    //   8756: goto -> 8760
    //   8759: athrow
    //   8760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8763: goto -> 8767
    //   8766: athrow
    //   8767: getstatic Perryc.0 : I
    //   8770: ifle -> 8784
    //   8773: ldc2_w 881677850
    //   8776: l2i
    //   8777: ldc_w 747657019
    //   8780: ixor
    //   8781: goto -> 8792
    //   8784: ldc2_w 1431524933
    //   8787: l2i
    //   8788: ldc_w 394056631
    //   8791: ixor
    //   8792: ldc2_w -830014568
    //   8795: l2i
    //   8796: ldc_w -937226380
    //   8799: ixor
    //   8800: ixor
    //   8801: lookupswitch default -> 8828, 515438029 -> 10528, 584575195 -> 8784
    //   8828: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   8831: getstatic Perryc.c : I
    //   8834: iflt -> 8848
    //   8837: ldc2_w -532128083
    //   8840: l2i
    //   8841: ldc_w -852208223
    //   8844: ixor
    //   8845: goto -> 8856
    //   8848: ldc2_w -304038586
    //   8851: l2i
    //   8852: ldc_w -664583067
    //   8855: ixor
    //   8856: ldc2_w -888188612
    //   8859: l2i
    //   8860: ldc_w 1209180985
    //   8863: ixor
    //   8864: ixor
    //   8865: lookupswitch default -> 8892, -1495245181 -> 8848, -1369310967 -> 10384
    //   8892: goto -> 8896
    //   8895: athrow
    //   8896: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8899: goto -> 8903
    //   8902: athrow
    //   8903: getstatic Perryc.0 : I
    //   8906: ifle -> 8920
    //   8909: ldc2_w -2044675634
    //   8912: l2i
    //   8913: ldc_w 1157614233
    //   8916: ixor
    //   8917: goto -> 8928
    //   8920: ldc2_w -709399723
    //   8923: l2i
    //   8924: ldc_w -1881871726
    //   8927: ixor
    //   8928: ldc2_w -841506079
    //   8931: l2i
    //   8932: ldc_w 521190248
    //   8935: ixor
    //   8936: ixor
    //   8937: lookupswitch default -> 8964, -1515376089 -> 8920, 270035678 -> 10476
    //   8964: goto -> 8968
    //   8967: athrow
    //   8968: invokevirtual toString : ()Ljava/lang/String;
    //   8971: goto -> 8975
    //   8974: athrow
    //   8975: getstatic Perryc.c : I
    //   8978: iflt -> 8992
    //   8981: ldc2_w 1757058299
    //   8984: l2i
    //   8985: ldc_w 1212942897
    //   8988: ixor
    //   8989: goto -> 9000
    //   8992: ldc2_w 1572494178
    //   8995: l2i
    //   8996: ldc_w -1204511579
    //   8999: ixor
    //   9000: ldc2_w -1640452068
    //   9003: l2i
    //   9004: ldc_w 1090411223
    //   9007: ixor
    //   9008: ixor
    //   9009: lookupswitch default -> 9036, -30379007 -> 10588, 1983419612 -> 8992
    //   9036: astore_2
    //   9037: goto -> 10269
    //   9040: new java/lang/StringBuilder
    //   9043: dup
    //   9044: getstatic Perryc.0 : I
    //   9047: ifle -> 9061
    //   9050: ldc2_w -1411220134
    //   9053: l2i
    //   9054: ldc_w -1246930005
    //   9057: ixor
    //   9058: goto -> 9069
    //   9061: ldc2_w -91344670
    //   9064: l2i
    //   9065: ldc_w 1263055103
    //   9068: ixor
    //   9069: ldc2_w 1511699332
    //   9072: l2i
    //   9073: ldc_w -1627281704
    //   9076: ixor
    //   9077: ixor
    //   9078: lookupswitch default -> 10428, -615238739 -> 9061, 1960678721 -> 9104
    //   9104: goto -> 9108
    //   9107: athrow
    //   9108: invokespecial <init> : ()V
    //   9111: goto -> 9115
    //   9114: athrow
    //   9115: getstatic Perryc.c : I
    //   9118: iflt -> 9132
    //   9121: ldc2_w -488351333
    //   9124: l2i
    //   9125: ldc_w 1585564016
    //   9128: ixor
    //   9129: goto -> 9140
    //   9132: ldc2_w -1400469691
    //   9135: l2i
    //   9136: ldc_w -1639328109
    //   9139: ixor
    //   9140: ldc2_w 637076413
    //   9143: l2i
    //   9144: ldc_w -913557280
    //   9147: ixor
    //   9148: ixor
    //   9149: lookupswitch default -> 9176, -1470079953 -> 9132, 1343269814 -> 10424
    //   9176: getstatic com/mojang/realmsclient/gui/ChatFormatting.LIGHT_PURPLE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   9179: getstatic Perryc.0 : I
    //   9182: ifle -> 9196
    //   9185: ldc2_w 498667736
    //   9188: l2i
    //   9189: ldc_w 1639962481
    //   9192: ixor
    //   9193: goto -> 9204
    //   9196: ldc2_w 1512577831
    //   9199: l2i
    //   9200: ldc_w -1225240218
    //   9203: ixor
    //   9204: ldc2_w -850533497
    //   9207: l2i
    //   9208: ldc_w 572916721
    //   9211: ixor
    //   9212: ixor
    //   9213: lookupswitch default -> 10436, -1821562913 -> 9196, 62630455 -> 9240
    //   9240: goto -> 9244
    //   9243: athrow
    //   9244: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   9247: goto -> 9251
    //   9250: athrow
    //   9251: getstatic Perryc.0 : I
    //   9254: ifle -> 9268
    //   9257: ldc2_w -485386912
    //   9260: l2i
    //   9261: ldc_w 6576249
    //   9264: ixor
    //   9265: goto -> 9276
    //   9268: ldc2_w -1139300554
    //   9271: l2i
    //   9272: ldc_w 1148123165
    //   9275: ixor
    //   9276: ldc2_w 229249440
    //   9279: l2i
    //   9280: ldc_w -164633097
    //   9283: ixor
    //   9284: ixor
    //   9285: lookupswitch default -> 9312, 418396494 -> 10556, 991185100 -> 9268
    //   9312: aload_2
    //   9313: getstatic Perryc.1 : I
    //   9316: ifeq -> 9330
    //   9319: ldc2_w 972106073
    //   9322: l2i
    //   9323: ldc_w -948645606
    //   9326: ixor
    //   9327: goto -> 9338
    //   9330: ldc2_w -1809518989
    //   9333: l2i
    //   9334: ldc_w -433226537
    //   9337: ixor
    //   9338: ldc2_w -1654117023
    //   9341: l2i
    //   9342: ldc_w -166861137
    //   9345: ixor
    //   9346: ixor
    //   9347: lookupswitch default -> 9372, -1780468851 -> 10578, -638701136 -> 9330
    //   9372: goto -> 9376
    //   9375: athrow
    //   9376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9379: goto -> 9383
    //   9382: athrow
    //   9383: getstatic Perryc.1 : I
    //   9386: ifeq -> 9400
    //   9389: ldc2_w 1721154548
    //   9392: l2i
    //   9393: ldc_w -1527904648
    //   9396: ixor
    //   9397: goto -> 9408
    //   9400: ldc2_w 1720100402
    //   9403: l2i
    //   9404: ldc_w -1812074109
    //   9407: ixor
    //   9408: ldc2_w -947787462
    //   9411: l2i
    //   9412: ldc_w -1327233250
    //   9415: ixor
    //   9416: ixor
    //   9417: lookupswitch default -> 9444, -1287863425 -> 9400, -1256369240 -> 10548
    //   9444: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   9447: getstatic Perryc.0 : I
    //   9450: ifle -> 9464
    //   9453: ldc2_w -569664798
    //   9456: l2i
    //   9457: ldc_w 1890741357
    //   9460: ixor
    //   9461: goto -> 9472
    //   9464: ldc2_w 1599708822
    //   9467: l2i
    //   9468: ldc_w -1597363779
    //   9471: ixor
    //   9472: ldc2_w -84176979
    //   9475: l2i
    //   9476: ldc_w 736058126
    //   9479: ixor
    //   9480: ixor
    //   9481: lookupswitch default -> 10618, 783770504 -> 9508, 2141004332 -> 9464
    //   9508: goto -> 9512
    //   9511: athrow
    //   9512: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   9515: goto -> 9519
    //   9518: athrow
    //   9519: getstatic Perryc.1 : I
    //   9522: ifeq -> 9536
    //   9525: ldc2_w -966884352
    //   9528: l2i
    //   9529: ldc_w -239805172
    //   9532: ixor
    //   9533: goto -> 9544
    //   9536: ldc2_w 39496076
    //   9539: l2i
    //   9540: ldc_w -764155059
    //   9543: ixor
    //   9544: ldc2_w -1773654350
    //   9547: l2i
    //   9548: ldc_w -347516216
    //   9551: ixor
    //   9552: ixor
    //   9553: lookupswitch default -> 10510, -1389871429 -> 9580, 1256924534 -> 9536
    //   9580: goto -> 9584
    //   9583: athrow
    //   9584: invokevirtual toString : ()Ljava/lang/String;
    //   9587: goto -> 9591
    //   9590: athrow
    //   9591: getstatic Perryc.1 : I
    //   9594: ifeq -> 9608
    //   9597: ldc2_w -1930387343
    //   9600: l2i
    //   9601: ldc_w 1555370158
    //   9604: ixor
    //   9605: goto -> 9616
    //   9608: ldc2_w -1401632359
    //   9611: l2i
    //   9612: ldc_w -1405618464
    //   9615: ixor
    //   9616: ldc2_w 171239301
    //   9619: l2i
    //   9620: ldc_w -1115490788
    //   9623: ixor
    //   9624: ixor
    //   9625: lookupswitch default -> 10346, -1208668448 -> 9652, 1744019782 -> 9608
    //   9652: astore_2
    //   9653: goto -> 10269
    //   9656: new java/lang/StringBuilder
    //   9659: dup
    //   9660: getstatic Perryc.c : I
    //   9663: iflt -> 9677
    //   9666: ldc2_w -1989907944
    //   9669: l2i
    //   9670: ldc_w 1309598142
    //   9673: ixor
    //   9674: goto -> 9685
    //   9677: ldc2_w 1505903827
    //   9680: l2i
    //   9681: ldc_w -822249923
    //   9684: ixor
    //   9685: ldc2_w 1226253955
    //   9688: l2i
    //   9689: ldc_w 1170929820
    //   9692: ixor
    //   9693: ixor
    //   9694: lookupswitch default -> 9720, -906396007 -> 9677, -877177415 -> 10374
    //   9720: goto -> 9724
    //   9723: athrow
    //   9724: invokespecial <init> : ()V
    //   9727: goto -> 9731
    //   9730: athrow
    //   9731: getstatic Perryc.c : I
    //   9734: iflt -> 9748
    //   9737: ldc2_w -1381567922
    //   9740: l2i
    //   9741: ldc_w -2072855878
    //   9744: ixor
    //   9745: goto -> 9756
    //   9748: ldc2_w -358793580
    //   9751: l2i
    //   9752: ldc_w 1444162947
    //   9755: ixor
    //   9756: ldc2_w 1965182961
    //   9759: l2i
    //   9760: ldc_w 839572624
    //   9763: ixor
    //   9764: ixor
    //   9765: lookupswitch default -> 10600, -73301898 -> 9792, 1862065045 -> 9748
    //   9792: getstatic com/mojang/realmsclient/gui/ChatFormatting.YELLOW : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   9795: getstatic Perryc.0 : I
    //   9798: ifle -> 9812
    //   9801: ldc2_w -361050036
    //   9804: l2i
    //   9805: ldc_w 1042159821
    //   9808: ixor
    //   9809: goto -> 9820
    //   9812: ldc2_w 1314926182
    //   9815: l2i
    //   9816: ldc_w -267008190
    //   9819: ixor
    //   9820: ldc2_w -1319162276
    //   9823: l2i
    //   9824: ldc_w -1079729246
    //   9827: ixor
    //   9828: ixor
    //   9829: lookupswitch default -> 9856, -627096193 -> 10334, 1103713552 -> 9812
    //   9856: goto -> 9860
    //   9859: athrow
    //   9860: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   9863: goto -> 9867
    //   9866: athrow
    //   9867: getstatic Perryc.1 : I
    //   9870: ifeq -> 9884
    //   9873: ldc2_w -1758808554
    //   9876: l2i
    //   9877: ldc_w 581266983
    //   9880: ixor
    //   9881: goto -> 9892
    //   9884: ldc2_w -1112454082
    //   9887: l2i
    //   9888: ldc_w 1596919852
    //   9891: ixor
    //   9892: ldc2_w -1085874468
    //   9895: l2i
    //   9896: ldc_w 1252249083
    //   9899: ixor
    //   9900: ixor
    //   9901: lookupswitch default -> 9928, -1426688181 -> 9884, 1080740630 -> 10442
    //   9928: aload_2
    //   9929: getstatic Perryc.1 : I
    //   9932: ifeq -> 9946
    //   9935: ldc2_w -1012683359
    //   9938: l2i
    //   9939: ldc_w 197173264
    //   9942: ixor
    //   9943: goto -> 9954
    //   9946: ldc2_w 941279623
    //   9949: l2i
    //   9950: ldc_w 1814554072
    //   9953: ixor
    //   9954: ldc2_w -325558644
    //   9957: l2i
    //   9958: ldc_w 855687529
    //   9961: ixor
    //   9962: ixor
    //   9963: lookupswitch default -> 9988, -2142363740 -> 9946, 402362964 -> 10460
    //   9988: goto -> 9992
    //   9991: athrow
    //   9992: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9995: goto -> 9999
    //   9998: athrow
    //   9999: getstatic Perryc.1 : I
    //   10002: ifeq -> 10016
    //   10005: ldc2_w -1703400409
    //   10008: l2i
    //   10009: ldc_w 1629703926
    //   10012: ixor
    //   10013: goto -> 10024
    //   10016: ldc2_w -981332362
    //   10019: l2i
    //   10020: ldc_w 1498207813
    //   10023: ixor
    //   10024: ldc2_w 1427345566
    //   10027: l2i
    //   10028: ldc_w -2037044835
    //   10031: ixor
    //   10032: ixor
    //   10033: lookupswitch default -> 10580, 685628370 -> 10016, 1330143536 -> 10060
    //   10060: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   10063: getstatic Perryc.0 : I
    //   10066: ifle -> 10080
    //   10069: ldc2_w 658039256
    //   10072: l2i
    //   10073: ldc_w 650208507
    //   10076: ixor
    //   10077: goto -> 10088
    //   10080: ldc2_w 421975734
    //   10083: l2i
    //   10084: ldc_w 1213354946
    //   10087: ixor
    //   10088: ldc2_w 1822092711
    //   10091: l2i
    //   10092: ldc_w -1880820698
    //   10095: ixor
    //   10096: ixor
    //   10097: lookupswitch default -> 10406, -1307927307 -> 10124, -494429022 -> 10080
    //   10124: goto -> 10128
    //   10127: athrow
    //   10128: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   10131: goto -> 10135
    //   10134: athrow
    //   10135: getstatic Perryc.1 : I
    //   10138: ifeq -> 10152
    //   10141: ldc2_w 1799096690
    //   10144: l2i
    //   10145: ldc_w 1968397218
    //   10148: ixor
    //   10149: goto -> 10160
    //   10152: ldc2_w 1149493350
    //   10155: l2i
    //   10156: ldc_w 1006817424
    //   10159: ixor
    //   10160: ldc2_w 1275479346
    //   10163: l2i
    //   10164: ldc_w -1869875985
    //   10167: ixor
    //   10168: ixor
    //   10169: lookupswitch default -> 10196, -1025318131 -> 10402, 150830041 -> 10152
    //   10196: goto -> 10200
    //   10199: athrow
    //   10200: invokevirtual toString : ()Ljava/lang/String;
    //   10203: goto -> 10207
    //   10206: athrow
    //   10207: getstatic Perryc.0 : I
    //   10210: ifle -> 10224
    //   10213: ldc2_w 1922530425
    //   10216: l2i
    //   10217: ldc_w -1971226022
    //   10220: ixor
    //   10221: goto -> 10232
    //   10224: ldc2_w 1304133649
    //   10227: l2i
    //   10228: ldc_w 432901225
    //   10231: ixor
    //   10232: ldc2_w -1951954120
    //   10235: l2i
    //   10236: ldc_w 576209997
    //   10239: ixor
    //   10240: ixor
    //   10241: lookupswitch default -> 10488, -41303283 -> 10268, 1374275926 -> 10224
    //   10268: astore_2
    //   10269: getstatic Perryc.1 : I
    //   10272: ifeq -> 10286
    //   10275: ldc2_w 1093503773
    //   10278: l2i
    //   10279: ldc_w 112967981
    //   10282: ixor
    //   10283: goto -> 10294
    //   10286: ldc2_w 800546815
    //   10289: l2i
    //   10290: ldc_w -963853581
    //   10293: ixor
    //   10294: ldc2_w -1737590473
    //   10297: l2i
    //   10298: ldc_w 1901460443
    //   10301: ixor
    //   10302: ixor
    //   10303: lookupswitch default -> 10440, -1364342564 -> 10286, 8160 -> 10328
    //   10328: aload_2
    //   10329: areturn
    //   10330: aconst_null
    //   10331: athrow
    //   10332: aconst_null
    //   10333: athrow
    //   10334: aconst_null
    //   10335: athrow
    //   10336: aconst_null
    //   10337: athrow
    //   10338: aconst_null
    //   10339: athrow
    //   10340: aconst_null
    //   10341: athrow
    //   10342: aconst_null
    //   10343: athrow
    //   10344: aconst_null
    //   10345: athrow
    //   10346: aconst_null
    //   10347: athrow
    //   10348: aconst_null
    //   10349: athrow
    //   10350: aconst_null
    //   10351: athrow
    //   10352: aconst_null
    //   10353: athrow
    //   10354: aconst_null
    //   10355: athrow
    //   10356: aconst_null
    //   10357: athrow
    //   10358: aconst_null
    //   10359: athrow
    //   10360: aconst_null
    //   10361: athrow
    //   10362: aconst_null
    //   10363: athrow
    //   10364: aconst_null
    //   10365: athrow
    //   10366: aconst_null
    //   10367: athrow
    //   10368: aconst_null
    //   10369: athrow
    //   10370: aconst_null
    //   10371: athrow
    //   10372: aconst_null
    //   10373: athrow
    //   10374: aconst_null
    //   10375: athrow
    //   10376: aconst_null
    //   10377: athrow
    //   10378: aconst_null
    //   10379: athrow
    //   10380: aconst_null
    //   10381: athrow
    //   10382: aconst_null
    //   10383: athrow
    //   10384: aconst_null
    //   10385: athrow
    //   10386: aconst_null
    //   10387: athrow
    //   10388: aconst_null
    //   10389: athrow
    //   10390: aconst_null
    //   10391: athrow
    //   10392: aconst_null
    //   10393: athrow
    //   10394: aconst_null
    //   10395: athrow
    //   10396: aconst_null
    //   10397: athrow
    //   10398: aconst_null
    //   10399: athrow
    //   10400: aconst_null
    //   10401: athrow
    //   10402: aconst_null
    //   10403: athrow
    //   10404: aconst_null
    //   10405: athrow
    //   10406: aconst_null
    //   10407: athrow
    //   10408: aconst_null
    //   10409: athrow
    //   10410: aconst_null
    //   10411: athrow
    //   10412: aconst_null
    //   10413: athrow
    //   10414: aconst_null
    //   10415: athrow
    //   10416: aconst_null
    //   10417: athrow
    //   10418: aconst_null
    //   10419: athrow
    //   10420: aconst_null
    //   10421: athrow
    //   10422: aconst_null
    //   10423: athrow
    //   10424: aconst_null
    //   10425: athrow
    //   10426: aconst_null
    //   10427: athrow
    //   10428: aconst_null
    //   10429: athrow
    //   10430: aconst_null
    //   10431: athrow
    //   10432: aconst_null
    //   10433: athrow
    //   10434: aconst_null
    //   10435: athrow
    //   10436: aconst_null
    //   10437: athrow
    //   10438: aconst_null
    //   10439: athrow
    //   10440: aconst_null
    //   10441: athrow
    //   10442: aconst_null
    //   10443: athrow
    //   10444: aconst_null
    //   10445: athrow
    //   10446: aconst_null
    //   10447: athrow
    //   10448: aconst_null
    //   10449: athrow
    //   10450: aconst_null
    //   10451: athrow
    //   10452: aconst_null
    //   10453: athrow
    //   10454: aconst_null
    //   10455: athrow
    //   10456: aconst_null
    //   10457: athrow
    //   10458: aconst_null
    //   10459: athrow
    //   10460: aconst_null
    //   10461: athrow
    //   10462: aconst_null
    //   10463: athrow
    //   10464: aconst_null
    //   10465: athrow
    //   10466: aconst_null
    //   10467: athrow
    //   10468: aconst_null
    //   10469: athrow
    //   10470: aconst_null
    //   10471: athrow
    //   10472: aconst_null
    //   10473: athrow
    //   10474: aconst_null
    //   10475: athrow
    //   10476: aconst_null
    //   10477: athrow
    //   10478: aconst_null
    //   10479: athrow
    //   10480: aconst_null
    //   10481: athrow
    //   10482: aconst_null
    //   10483: athrow
    //   10484: aconst_null
    //   10485: athrow
    //   10486: aconst_null
    //   10487: athrow
    //   10488: aconst_null
    //   10489: athrow
    //   10490: aconst_null
    //   10491: athrow
    //   10492: aconst_null
    //   10493: athrow
    //   10494: aconst_null
    //   10495: athrow
    //   10496: aconst_null
    //   10497: athrow
    //   10498: aconst_null
    //   10499: athrow
    //   10500: aconst_null
    //   10501: athrow
    //   10502: aconst_null
    //   10503: athrow
    //   10504: aconst_null
    //   10505: athrow
    //   10506: aconst_null
    //   10507: athrow
    //   10508: aconst_null
    //   10509: athrow
    //   10510: aconst_null
    //   10511: athrow
    //   10512: aconst_null
    //   10513: athrow
    //   10514: aconst_null
    //   10515: athrow
    //   10516: aconst_null
    //   10517: athrow
    //   10518: aconst_null
    //   10519: athrow
    //   10520: aconst_null
    //   10521: athrow
    //   10522: aconst_null
    //   10523: athrow
    //   10524: aconst_null
    //   10525: athrow
    //   10526: aconst_null
    //   10527: athrow
    //   10528: aconst_null
    //   10529: athrow
    //   10530: aconst_null
    //   10531: athrow
    //   10532: aconst_null
    //   10533: athrow
    //   10534: aconst_null
    //   10535: athrow
    //   10536: aconst_null
    //   10537: athrow
    //   10538: aconst_null
    //   10539: athrow
    //   10540: aconst_null
    //   10541: athrow
    //   10542: aconst_null
    //   10543: athrow
    //   10544: aconst_null
    //   10545: athrow
    //   10546: aconst_null
    //   10547: athrow
    //   10548: aconst_null
    //   10549: athrow
    //   10550: aconst_null
    //   10551: athrow
    //   10552: aconst_null
    //   10553: athrow
    //   10554: aconst_null
    //   10555: athrow
    //   10556: aconst_null
    //   10557: athrow
    //   10558: aconst_null
    //   10559: athrow
    //   10560: aconst_null
    //   10561: athrow
    //   10562: aconst_null
    //   10563: athrow
    //   10564: aconst_null
    //   10565: athrow
    //   10566: aconst_null
    //   10567: athrow
    //   10568: aconst_null
    //   10569: athrow
    //   10570: aconst_null
    //   10571: athrow
    //   10572: aconst_null
    //   10573: athrow
    //   10574: aconst_null
    //   10575: athrow
    //   10576: aconst_null
    //   10577: athrow
    //   10578: aconst_null
    //   10579: athrow
    //   10580: aconst_null
    //   10581: athrow
    //   10582: aconst_null
    //   10583: athrow
    //   10584: aconst_null
    //   10585: athrow
    //   10586: aconst_null
    //   10587: athrow
    //   10588: aconst_null
    //   10589: athrow
    //   10590: aconst_null
    //   10591: athrow
    //   10592: aconst_null
    //   10593: athrow
    //   10594: aconst_null
    //   10595: athrow
    //   10596: aconst_null
    //   10597: athrow
    //   10598: aconst_null
    //   10599: athrow
    //   10600: aconst_null
    //   10601: athrow
    //   10602: aconst_null
    //   10603: athrow
    //   10604: aconst_null
    //   10605: athrow
    //   10606: aconst_null
    //   10607: athrow
    //   10608: aconst_null
    //   10609: athrow
    //   10610: aconst_null
    //   10611: athrow
    //   10612: aconst_null
    //   10613: athrow
    //   10614: aconst_null
    //   10615: athrow
    //   10616: aconst_null
    //   10617: athrow
    //   10618: aconst_null
    //   10619: athrow
    //   10620: aconst_null
    //   10621: athrow
    //   10622: aconst_null
    //   10623: athrow
    //   10624: aconst_null
    //   10625: athrow
    //   10626: aconst_null
    //   10627: athrow
    //   10628: aconst_null
    //   10629: athrow
    //   10630: pop
    //   10631: goto -> 24
    //   10634: pop
    //   10635: aconst_null
    //   10636: goto -> 10630
    //   10639: dup
    //   10640: ifnull -> 10630
    //   10643: checkcast java/lang/Throwable
    //   10646: athrow
    //   10647: dup
    //   10648: ifnull -> 10634
    //   10651: checkcast java/lang/Throwable
    //   10654: athrow
    //   10655: aconst_null
    //   10656: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	10306	0	string	Ljava/lang/String;
    //   24	10306	1	color	Lbigname/zprestige/webhack/util/TextUtil$Color;
    //   141	10189	2	coloredString	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	10639	java/util/NoSuchElementException
    //   327	334	334	finally
    //   327	334	3	finally
    //   327	334	327	java/lang/UnsupportedOperationException
    //   327	334	327	java/lang/RuntimeException
    //   328	334	327	finally
    //   483	490	490	finally
    //   483	490	483	finally
    //   483	490	483	finally
    //   483	490	483	finally
    //   484	490	3	java/lang/EnumConstantNotPresentException
    //   620	626	626	finally
    //   620	626	3	finally
    //   620	626	626	java/lang/StringIndexOutOfBoundsException
    //   620	626	3	java/lang/IndexOutOfBoundsException
    //   620	626	3	finally
    //   751	758	758	finally
    //   751	758	758	java/lang/UnsupportedOperationException
    //   751	758	3	java/lang/StringIndexOutOfBoundsException
    //   752	758	758	finally
    //   752	758	751	finally
    //   887	894	894	finally
    //   887	894	887	finally
    //   888	894	3	finally
    //   888	894	894	java/lang/NegativeArraySizeException
    //   888	894	887	java/lang/ArithmeticException
    //   959	966	966	finally
    //   959	966	959	java/lang/ClassCastException
    //   959	966	3	finally
    //   960	966	3	finally
    //   960	966	3	finally
    //   1099	1106	1106	finally
    //   1099	1106	1099	finally
    //   1099	1106	3	finally
    //   1099	1106	3	finally
    //   1100	1106	1099	java/lang/IllegalArgumentException
    //   1235	1242	1242	finally
    //   1235	1242	1242	finally
    //   1236	1242	3	java/lang/NumberFormatException
    //   1236	1242	1235	java/lang/AssertionError
    //   1236	1242	1235	java/lang/IndexOutOfBoundsException
    //   1367	1374	1374	finally
    //   1367	1374	3	java/lang/IllegalArgumentException
    //   1367	1374	1367	finally
    //   1367	1374	1367	finally
    //   1368	1374	3	finally
    //   1503	1510	1510	finally
    //   1503	1510	1503	finally
    //   1503	1510	1510	finally
    //   1504	1510	1503	finally
    //   1504	1510	3	java/lang/NegativeArraySizeException
    //   1575	1582	1582	finally
    //   1575	1582	1582	finally
    //   1575	1582	3	finally
    //   1575	1582	1582	java/lang/NegativeArraySizeException
    //   1576	1582	1575	java/lang/NumberFormatException
    //   1715	1722	1722	finally
    //   1715	1722	1715	finally
    //   1715	1722	1722	java/lang/ArrayIndexOutOfBoundsException
    //   1716	1722	1722	finally
    //   1716	1722	1715	java/lang/IllegalArgumentException
    //   1851	1858	1858	finally
    //   1851	1858	1851	finally
    //   1851	1858	1851	finally
    //   1852	1858	1851	java/lang/NumberFormatException
    //   1852	1858	1851	java/lang/UnsupportedOperationException
    //   1983	1990	1990	finally
    //   1983	1990	3	java/lang/RuntimeException
    //   1983	1990	1990	finally
    //   1983	1990	1983	java/lang/AssertionError
    //   1984	1990	1983	java/lang/NullPointerException
    //   2119	2126	2126	finally
    //   2119	2126	2119	finally
    //   2119	2126	2119	java/lang/NullPointerException
    //   2120	2126	2119	finally
    //   2120	2126	2126	java/lang/UnsupportedOperationException
    //   2191	2198	2198	finally
    //   2191	2198	2191	finally
    //   2192	2198	3	finally
    //   2192	2198	3	java/util/NoSuchElementException
    //   2192	2198	2191	java/util/NoSuchElementException
    //   2331	2338	2338	finally
    //   2331	2338	3	finally
    //   2331	2338	2331	java/lang/AssertionError
    //   2332	2338	2331	finally
    //   2332	2338	2331	java/lang/ClassCastException
    //   2467	2474	2474	finally
    //   2467	2474	2467	finally
    //   2467	2474	3	java/util/NoSuchElementException
    //   2467	2474	2467	finally
    //   2467	2474	3	java/lang/NumberFormatException
    //   2599	2606	2606	finally
    //   2599	2606	3	finally
    //   2599	2606	3	java/lang/StringIndexOutOfBoundsException
    //   2599	2606	2599	java/lang/RuntimeException
    //   2600	2606	2606	finally
    //   2735	2742	2742	finally
    //   2735	2742	2742	finally
    //   2735	2742	2735	finally
    //   2736	2742	2742	finally
    //   2736	2742	3	finally
    //   2807	2814	2814	finally
    //   2807	2814	3	java/lang/AssertionError
    //   2807	2814	2807	finally
    //   2807	2814	2807	java/lang/NegativeArraySizeException
    //   2808	2814	2807	finally
    //   2947	2954	2954	finally
    //   2947	2954	2947	java/lang/AssertionError
    //   2947	2954	2954	finally
    //   2947	2954	2947	java/lang/RuntimeException
    //   2948	2954	2954	finally
    //   3083	3090	3090	finally
    //   3083	3090	3	finally
    //   3083	3090	3	finally
    //   3083	3090	3	finally
    //   3084	3090	3083	finally
    //   3215	3222	3222	finally
    //   3215	3222	3215	finally
    //   3215	3222	3	finally
    //   3216	3222	3215	java/lang/IllegalStateException
    //   3216	3222	3	java/lang/IllegalStateException
    //   3351	3358	3358	finally
    //   3351	3358	3351	java/lang/IllegalStateException
    //   3352	3358	3358	finally
    //   3352	3358	3	java/lang/UnsupportedOperationException
    //   3352	3358	3358	java/lang/IllegalArgumentException
    //   3423	3430	3430	finally
    //   3423	3430	3	java/lang/StringIndexOutOfBoundsException
    //   3424	3430	3430	java/lang/ArrayIndexOutOfBoundsException
    //   3424	3430	3423	finally
    //   3424	3430	3	finally
    //   3563	3570	3570	finally
    //   3563	3570	3570	finally
    //   3563	3570	3	finally
    //   3564	3570	3	finally
    //   3564	3570	3563	finally
    //   3699	3706	3706	finally
    //   3699	3706	3	java/util/NoSuchElementException
    //   3699	3706	3699	java/lang/IndexOutOfBoundsException
    //   3699	3706	3	finally
    //   3699	3706	3	java/util/NoSuchElementException
    //   3831	3838	3838	finally
    //   3831	3838	3831	java/lang/ArithmeticException
    //   3831	3838	3838	java/lang/ClassCastException
    //   3831	3838	3838	finally
    //   3832	3838	3838	finally
    //   3967	3974	3974	finally
    //   3967	3974	3967	java/lang/NumberFormatException
    //   3967	3974	3974	java/lang/RuntimeException
    //   3967	3974	3974	finally
    //   3968	3974	3	java/lang/AssertionError
    //   4039	4046	4046	finally
    //   4039	4046	3	java/lang/NegativeArraySizeException
    //   4039	4046	4039	java/lang/ArithmeticException
    //   4040	4046	4046	java/lang/ArithmeticException
    //   4040	4046	3	java/util/ConcurrentModificationException
    //   4179	4186	4186	finally
    //   4179	4186	4186	java/lang/RuntimeException
    //   4179	4186	3	finally
    //   4179	4186	4179	java/lang/NegativeArraySizeException
    //   4180	4186	4186	finally
    //   4315	4322	4322	finally
    //   4315	4322	4315	finally
    //   4315	4322	4322	finally
    //   4316	4322	4315	java/lang/ArrayIndexOutOfBoundsException
    //   4316	4322	3	finally
    //   4447	4454	4454	finally
    //   4447	4454	4447	finally
    //   4447	4454	3	finally
    //   4448	4454	3	finally
    //   4448	4454	4454	finally
    //   4583	4590	4590	finally
    //   4583	4590	4583	finally
    //   4583	4590	4583	java/lang/NumberFormatException
    //   4583	4590	3	finally
    //   4583	4590	3	java/lang/ClassCastException
    //   4655	4662	4662	finally
    //   4655	4662	4662	java/lang/EnumConstantNotPresentException
    //   4655	4662	4662	finally
    //   4656	4662	4655	finally
    //   4656	4662	4662	finally
    //   4796	4802	4802	finally
    //   4796	4802	3	java/lang/IllegalStateException
    //   4796	4802	4802	finally
    //   4796	4802	3	java/lang/ClassCastException
    //   4796	4802	4802	finally
    //   4931	4938	4938	finally
    //   4931	4938	4931	java/lang/NullPointerException
    //   4931	4938	4931	java/lang/AssertionError
    //   4931	4938	4931	java/lang/NullPointerException
    //   4932	4938	4938	finally
    //   5063	5070	5070	finally
    //   5063	5070	5063	java/lang/IllegalArgumentException
    //   5063	5070	5063	java/util/ConcurrentModificationException
    //   5064	5070	3	java/lang/NullPointerException
    //   5064	5070	5070	finally
    //   5199	5206	5206	finally
    //   5199	5206	5206	finally
    //   5199	5206	3	java/lang/NegativeArraySizeException
    //   5199	5206	5206	java/lang/NumberFormatException
    //   5200	5206	5199	finally
    //   5271	5278	5278	finally
    //   5271	5278	5271	java/lang/StringIndexOutOfBoundsException
    //   5271	5278	5278	java/lang/AssertionError
    //   5272	5278	5271	java/lang/NullPointerException
    //   5272	5278	5271	finally
    //   5411	5418	5418	finally
    //   5411	5418	5418	finally
    //   5411	5418	3	finally
    //   5411	5418	5411	finally
    //   5412	5418	5418	finally
    //   5547	5554	5554	finally
    //   5547	5554	5554	java/lang/ArrayIndexOutOfBoundsException
    //   5547	5554	5547	java/lang/ArrayIndexOutOfBoundsException
    //   5548	5554	5554	finally
    //   5548	5554	5547	java/util/NoSuchElementException
    //   5679	5686	5686	finally
    //   5679	5686	5686	java/lang/AssertionError
    //   5679	5686	5679	finally
    //   5679	5686	3	java/lang/UnsupportedOperationException
    //   5680	5686	5679	finally
    //   5815	5822	5822	finally
    //   5815	5822	5815	finally
    //   5815	5822	5815	java/lang/NumberFormatException
    //   5816	5822	3	finally
    //   5816	5822	5822	java/lang/AssertionError
    //   5887	5894	5894	finally
    //   5887	5894	5894	java/lang/EnumConstantNotPresentException
    //   5887	5894	3	finally
    //   5887	5894	5894	finally
    //   5888	5894	5887	finally
    //   6027	6034	6034	finally
    //   6027	6034	6027	finally
    //   6028	6034	3	java/lang/EnumConstantNotPresentException
    //   6028	6034	6027	java/util/ConcurrentModificationException
    //   6028	6034	6034	finally
    //   6164	6170	6170	finally
    //   6164	6170	6170	finally
    //   6164	6170	6170	finally
    //   6164	6170	3	java/lang/IllegalStateException
    //   6164	6170	3	finally
    //   6296	6302	6302	finally
    //   6296	6302	6302	java/lang/IllegalStateException
    //   6296	6302	6302	java/lang/NegativeArraySizeException
    //   6296	6302	6302	finally
    //   6296	6302	6302	finally
    //   6431	6438	6438	finally
    //   6431	6438	6438	finally
    //   6431	6438	6431	finally
    //   6431	6438	6438	java/lang/IllegalArgumentException
    //   6432	6438	3	finally
    //   6503	6510	6510	finally
    //   6503	6510	6503	java/lang/AssertionError
    //   6503	6510	6503	java/util/ConcurrentModificationException
    //   6504	6510	6503	finally
    //   6504	6510	6510	finally
    //   6643	6650	6650	finally
    //   6643	6650	6643	finally
    //   6643	6650	3	java/util/ConcurrentModificationException
    //   6644	6650	6650	java/lang/NullPointerException
    //   6644	6650	6650	java/lang/NumberFormatException
    //   6779	6786	6786	finally
    //   6780	6786	6786	finally
    //   6780	6786	3	finally
    //   6780	6786	3	finally
    //   6780	6786	6779	finally
    //   6911	6918	6918	finally
    //   6911	6918	6918	finally
    //   6912	6918	3	finally
    //   6912	6918	6911	finally
    //   6912	6918	6911	java/lang/ClassCastException
    //   7047	7054	7054	finally
    //   7047	7054	7047	finally
    //   7047	7054	7054	finally
    //   7048	7054	3	finally
    //   7048	7054	7054	finally
    //   7119	7126	7126	finally
    //   7119	7126	7126	finally
    //   7119	7126	7119	finally
    //   7119	7126	7126	finally
    //   7120	7126	7119	finally
    //   7259	7266	7266	finally
    //   7259	7266	7266	java/lang/EnumConstantNotPresentException
    //   7260	7266	3	finally
    //   7260	7266	7266	java/lang/EnumConstantNotPresentException
    //   7260	7266	7259	java/lang/IllegalStateException
    //   7396	7402	7402	finally
    //   7396	7402	7402	java/lang/IllegalStateException
    //   7396	7402	7402	finally
    //   7396	7402	3	finally
    //   7396	7402	7402	finally
    //   7527	7534	7534	finally
    //   7527	7534	3	finally
    //   7528	7534	7534	finally
    //   7528	7534	3	java/lang/AssertionError
    //   7528	7534	7527	java/lang/NumberFormatException
    //   7663	7670	7670	finally
    //   7663	7670	7670	java/util/NoSuchElementException
    //   7664	7670	7670	java/lang/StringIndexOutOfBoundsException
    //   7664	7670	7663	java/lang/NullPointerException
    //   7664	7670	3	java/lang/ClassCastException
    //   7735	7742	7742	finally
    //   7735	7742	7735	finally
    //   7735	7742	7742	finally
    //   7736	7742	7742	java/lang/NegativeArraySizeException
    //   7736	7742	7735	finally
    //   7875	7882	7882	finally
    //   7875	7882	7882	finally
    //   7875	7882	7875	finally
    //   7875	7882	3	finally
    //   7875	7882	7875	finally
    //   8012	8018	8018	finally
    //   8012	8018	8018	java/lang/AssertionError
    //   8012	8018	3	java/lang/RuntimeException
    //   8012	8018	8018	java/lang/IllegalStateException
    //   8012	8018	8018	finally
    //   8144	8150	8150	finally
    //   8144	8150	8150	java/util/ConcurrentModificationException
    //   8144	8150	8150	java/lang/IllegalStateException
    //   8144	8150	3	java/lang/EnumConstantNotPresentException
    //   8144	8150	3	java/lang/UnsupportedOperationException
    //   8279	8286	8286	finally
    //   8279	8286	8279	java/util/NoSuchElementException
    //   8280	8286	8279	finally
    //   8280	8286	8279	java/lang/NegativeArraySizeException
    //   8280	8286	3	finally
    //   8351	8358	8358	finally
    //   8351	8358	8351	java/lang/NumberFormatException
    //   8351	8358	3	java/lang/ArithmeticException
    //   8352	8358	8358	finally
    //   8352	8358	8351	finally
    //   8491	8498	8498	finally
    //   8491	8498	8498	java/lang/UnsupportedOperationException
    //   8491	8498	8491	finally
    //   8492	8498	3	java/lang/IllegalStateException
    //   8492	8498	8491	finally
    //   8627	8634	8634	finally
    //   8628	8634	8634	finally
    //   8628	8634	8634	java/lang/IllegalArgumentException
    //   8628	8634	8627	finally
    //   8628	8634	8627	java/lang/NumberFormatException
    //   8759	8766	8766	finally
    //   8759	8766	3	finally
    //   8759	8766	8759	java/util/NoSuchElementException
    //   8760	8766	8759	finally
    //   8760	8766	8766	finally
    //   8895	8902	8902	finally
    //   8896	8902	8895	java/lang/NumberFormatException
    //   8896	8902	8895	finally
    //   8896	8902	3	java/lang/ArrayIndexOutOfBoundsException
    //   8896	8902	3	finally
    //   8967	8974	8974	finally
    //   8967	8974	3	finally
    //   8967	8974	3	java/lang/RuntimeException
    //   8968	8974	8974	java/lang/RuntimeException
    //   8968	8974	8967	finally
    //   9107	9114	9114	finally
    //   9108	9114	9107	finally
    //   9108	9114	3	finally
    //   9108	9114	9114	java/lang/NullPointerException
    //   9108	9114	3	java/lang/NegativeArraySizeException
    //   9243	9250	9250	finally
    //   9243	9250	9243	finally
    //   9244	9250	9243	java/lang/NumberFormatException
    //   9244	9250	9250	finally
    //   9244	9250	9243	java/lang/EnumConstantNotPresentException
    //   9375	9382	9382	finally
    //   9375	9382	9382	java/lang/StringIndexOutOfBoundsException
    //   9375	9382	9375	finally
    //   9376	9382	3	java/lang/ArithmeticException
    //   9376	9382	9375	finally
    //   9511	9518	9518	finally
    //   9511	9518	9511	finally
    //   9512	9518	9518	finally
    //   9512	9518	9518	finally
    //   9512	9518	9511	finally
    //   9583	9590	9590	finally
    //   9583	9590	3	java/lang/RuntimeException
    //   9583	9590	9590	java/util/ConcurrentModificationException
    //   9584	9590	9583	finally
    //   9584	9590	3	finally
    //   9724	9730	9730	finally
    //   9724	9730	3	finally
    //   9724	9730	3	finally
    //   9724	9730	9730	java/lang/ArithmeticException
    //   9724	9730	3	java/lang/NullPointerException
    //   9859	9866	9866	finally
    //   9859	9866	9859	finally
    //   9859	9866	9859	java/lang/RuntimeException
    //   9859	9866	9866	java/lang/ArrayIndexOutOfBoundsException
    //   9860	9866	9859	finally
    //   9991	9998	9998	finally
    //   9991	9998	9998	finally
    //   9991	9998	9998	finally
    //   9991	9998	9991	finally
    //   9992	9998	9998	java/lang/NullPointerException
    //   10127	10134	10134	finally
    //   10127	10134	10127	finally
    //   10127	10134	3	finally
    //   10127	10134	10127	java/lang/EnumConstantNotPresentException
    //   10128	10134	3	finally
    //   10199	10206	10206	finally
    //   10199	10206	10199	finally
    //   10199	10206	10206	finally
    //   10199	10206	3	java/lang/UnsupportedOperationException
    //   10200	10206	3	java/util/ConcurrentModificationException
    //   10639	10647	10639	java/lang/ArrayIndexOutOfBoundsException
    //   10655	10657	3	java/lang/NegativeArraySizeException
  }
  
  static {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -827315556
    //   9: l2i
    //   10: ldc_w 621984118
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 124264793
    //   20: l2i
    //   21: ldc_w -638605490
    //   24: ixor
    //   25: ldc2_w 1438866807
    //   28: l2i
    //   29: ldc_w -732267899
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 193154915 -> 17, 1782297624 -> 4368
    //   60: getstatic com/mojang/realmsclient/gui/ChatFormatting.BLACK : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   63: getstatic Perryc.1 : I
    //   66: ifeq -> 80
    //   69: ldc2_w 1365256204
    //   72: l2i
    //   73: ldc_w -1953519910
    //   76: ixor
    //   77: goto -> 88
    //   80: ldc2_w -1853749861
    //   83: l2i
    //   84: ldc_w 1034870218
    //   87: ixor
    //   88: ldc2_w -2048540426
    //   91: l2i
    //   92: ldc_w -645246469
    //   95: ixor
    //   96: ixor
    //   97: lookupswitch default -> 124, -2038423589 -> 4360, 1820508643 -> 80
    //   124: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   127: getstatic Perryc.c : I
    //   130: iflt -> 144
    //   133: ldc2_w 1322631193
    //   136: l2i
    //   137: ldc_w 876883375
    //   140: ixor
    //   141: goto -> 152
    //   144: ldc2_w -437144321
    //   147: l2i
    //   148: ldc_w 505640984
    //   151: ixor
    //   152: ldc2_w -364352665
    //   155: l2i
    //   156: ldc_w 511098291
    //   159: ixor
    //   160: ixor
    //   161: lookupswitch default -> 188, -1901118622 -> 4488, 1586420376 -> 144
    //   188: putstatic bigname/zprestige/webhack/util/TextUtil.BLACK : Ljava/lang/String;
    //   191: getstatic Perryc.c : I
    //   194: iflt -> 208
    //   197: ldc2_w 667695928
    //   200: l2i
    //   201: ldc_w 187825235
    //   204: ixor
    //   205: goto -> 216
    //   208: ldc2_w 1235816935
    //   211: l2i
    //   212: ldc_w 1144595168
    //   215: ixor
    //   216: ldc2_w 535593788
    //   219: l2i
    //   220: ldc_w 1873630920
    //   223: ixor
    //   224: ixor
    //   225: lookupswitch default -> 4358, 1555829407 -> 208, 2110908147 -> 252
    //   252: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_BLUE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   255: getstatic Perryc.c : I
    //   258: iflt -> 272
    //   261: ldc2_w 893737250
    //   264: l2i
    //   265: ldc_w 1918145981
    //   268: ixor
    //   269: goto -> 280
    //   272: ldc2_w 659391012
    //   275: l2i
    //   276: ldc_w -994605428
    //   279: ixor
    //   280: ldc2_w -495503985
    //   283: l2i
    //   284: ldc_w 1546951933
    //   287: ixor
    //   288: ixor
    //   289: lookupswitch default -> 4426, -112040467 -> 272, 1572449754 -> 316
    //   316: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   319: getstatic Perryc.c : I
    //   322: iflt -> 336
    //   325: ldc2_w 1066858592
    //   328: l2i
    //   329: ldc_w -1898710497
    //   332: ixor
    //   333: goto -> 344
    //   336: ldc2_w 842774107
    //   339: l2i
    //   340: ldc_w 2112163236
    //   343: ixor
    //   344: ldc2_w 1037027373
    //   347: l2i
    //   348: ldc_w -575929397
    //   351: ixor
    //   352: ixor
    //   353: lookupswitch default -> 380, 540246122 -> 336, 1361496473 -> 4362
    //   380: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_BLUE : Ljava/lang/String;
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 400
    //   389: ldc2_w -670395566
    //   392: l2i
    //   393: ldc_w 1577147473
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w 1875619897
    //   403: l2i
    //   404: ldc_w -1977252406
    //   407: ixor
    //   408: ldc2_w 859947905
    //   411: l2i
    //   412: ldc_w -640381818
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 444, -1340922674 -> 400, 1822326788 -> 4384
    //   444: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 464
    //   453: ldc2_w -874615872
    //   456: l2i
    //   457: ldc_w 1805937334
    //   460: ixor
    //   461: goto -> 472
    //   464: ldc2_w 1796859236
    //   467: l2i
    //   468: ldc_w 937846981
    //   471: ixor
    //   472: ldc2_w -75824703
    //   475: l2i
    //   476: ldc_w -2144084307
    //   479: ixor
    //   480: ixor
    //   481: lookupswitch default -> 508, -617423334 -> 4382, 832435506 -> 464
    //   508: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   511: getstatic Perryc.1 : I
    //   514: ifeq -> 528
    //   517: ldc2_w -705229358
    //   520: l2i
    //   521: ldc_w 1333240626
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w 1567795489
    //   531: l2i
    //   532: ldc_w 1152657278
    //   535: ixor
    //   536: ldc2_w 1222266918
    //   539: l2i
    //   540: ldc_w 942892156
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 4404, -362177862 -> 528, 1764735493 -> 572
    //   572: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_GREEN : Ljava/lang/String;
    //   575: getstatic Perryc.1 : I
    //   578: ifeq -> 592
    //   581: ldc2_w -1013503131
    //   584: l2i
    //   585: ldc_w -1558939558
    //   588: ixor
    //   589: goto -> 600
    //   592: ldc2_w 213204804
    //   595: l2i
    //   596: ldc_w -828986095
    //   599: ixor
    //   600: ldc2_w -26596595
    //   603: l2i
    //   604: ldc_w -1110310592
    //   607: ixor
    //   608: ixor
    //   609: lookupswitch default -> 636, 591100274 -> 4396, 812671716 -> 592
    //   636: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_AQUA : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   639: getstatic Perryc.0 : I
    //   642: ifle -> 656
    //   645: ldc2_w 1790694619
    //   648: l2i
    //   649: ldc_w 1686457532
    //   652: ixor
    //   653: goto -> 664
    //   656: ldc2_w -102360545
    //   659: l2i
    //   660: ldc_w -1796308035
    //   663: ixor
    //   664: ldc2_w 1790237649
    //   667: l2i
    //   668: ldc_w -2009852310
    //   671: ixor
    //   672: ixor
    //   673: lookupswitch default -> 4472, -1886890983 -> 700, -323070500 -> 656
    //   700: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   703: getstatic Perryc.0 : I
    //   706: ifle -> 720
    //   709: ldc2_w 401405223
    //   712: l2i
    //   713: ldc_w 619004523
    //   716: ixor
    //   717: goto -> 728
    //   720: ldc2_w 130060336
    //   723: l2i
    //   724: ldc_w -1332668727
    //   727: ixor
    //   728: ldc2_w -2042805960
    //   731: l2i
    //   732: ldc_w -1594102264
    //   735: ixor
    //   736: ixor
    //   737: lookupswitch default -> 4402, -1852364343 -> 764, 365893756 -> 720
    //   764: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_AQUA : Ljava/lang/String;
    //   767: getstatic Perryc.0 : I
    //   770: ifle -> 784
    //   773: ldc2_w 254735909
    //   776: l2i
    //   777: ldc_w 1005021035
    //   780: ixor
    //   781: goto -> 792
    //   784: ldc2_w 1542180558
    //   787: l2i
    //   788: ldc_w -1643271452
    //   791: ixor
    //   792: ldc2_w -1088842699
    //   795: l2i
    //   796: ldc_w 1523146527
    //   799: ixor
    //   800: ixor
    //   801: lookupswitch default -> 828, -786867612 -> 4394, -656428213 -> 784
    //   828: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   831: getstatic Perryc.0 : I
    //   834: ifle -> 848
    //   837: ldc2_w -1364197249
    //   840: l2i
    //   841: ldc_w -267790949
    //   844: ixor
    //   845: goto -> 856
    //   848: ldc2_w -49463717
    //   851: l2i
    //   852: ldc_w 1407647856
    //   855: ixor
    //   856: ldc2_w 1753285264
    //   859: l2i
    //   860: ldc_w -296720695
    //   863: ixor
    //   864: ixor
    //   865: lookupswitch default -> 892, -818695094 -> 848, -664227395 -> 4386
    //   892: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   895: getstatic Perryc.1 : I
    //   898: ifeq -> 912
    //   901: ldc2_w 303873402
    //   904: l2i
    //   905: ldc_w 847051190
    //   908: ixor
    //   909: goto -> 920
    //   912: ldc2_w 2026578661
    //   915: l2i
    //   916: ldc_w 1836039245
    //   919: ixor
    //   920: ldc2_w 1076155952
    //   923: l2i
    //   924: ldc_w -2124820607
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 4438, -723941607 -> 956, -518169219 -> 912
    //   956: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_RED : Ljava/lang/String;
    //   959: getstatic Perryc.1 : I
    //   962: ifeq -> 976
    //   965: ldc2_w 2071922280
    //   968: l2i
    //   969: ldc_w -1346374086
    //   972: ixor
    //   973: goto -> 984
    //   976: ldc2_w 626658086
    //   979: l2i
    //   980: ldc_w -223235606
    //   983: ixor
    //   984: ldc2_w -1290085245
    //   987: l2i
    //   988: ldc_w 1740162827
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 1020, -727694089 -> 976, 6482906 -> 4412
    //   1020: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_PURPLE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1023: getstatic Perryc.1 : I
    //   1026: ifeq -> 1040
    //   1029: ldc2_w 1615554497
    //   1032: l2i
    //   1033: ldc_w 981250423
    //   1036: ixor
    //   1037: goto -> 1048
    //   1040: ldc2_w -1755202694
    //   1043: l2i
    //   1044: ldc_w 1322757018
    //   1047: ixor
    //   1048: ldc2_w 1607220593
    //   1051: l2i
    //   1052: ldc_w 1506053611
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 1084, -1694839341 -> 1040, 1547658796 -> 4398
    //   1084: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1087: getstatic Perryc.1 : I
    //   1090: ifeq -> 1104
    //   1093: ldc2_w 761786008
    //   1096: l2i
    //   1097: ldc_w -1232504290
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w 1079842470
    //   1107: l2i
    //   1108: ldc_w 1461293805
    //   1111: ixor
    //   1112: ldc2_w -14479713
    //   1115: l2i
    //   1116: ldc_w 816446608
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 4356, -657557948 -> 1148, 1415865993 -> 1104
    //   1148: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_PURPLE : Ljava/lang/String;
    //   1151: getstatic Perryc.1 : I
    //   1154: ifeq -> 1168
    //   1157: ldc2_w 301065773
    //   1160: l2i
    //   1161: ldc_w -85721960
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w -1967100906
    //   1171: l2i
    //   1172: ldc_w 1842788627
    //   1175: ixor
    //   1176: ldc2_w 1598498016
    //   1179: l2i
    //   1180: ldc_w 1187684631
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 1212, -911486361 -> 1168, -224420030 -> 4364
    //   1212: getstatic com/mojang/realmsclient/gui/ChatFormatting.GOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1215: getstatic Perryc.1 : I
    //   1218: ifeq -> 1232
    //   1221: ldc2_w -432867515
    //   1224: l2i
    //   1225: ldc_w 258920479
    //   1228: ixor
    //   1229: goto -> 1240
    //   1232: ldc2_w 823463394
    //   1235: l2i
    //   1236: ldc_w 1046360679
    //   1239: ixor
    //   1240: ldc2_w -1966863476
    //   1243: l2i
    //   1244: ldc_w -812708805
    //   1247: ixor
    //   1248: ixor
    //   1249: lookupswitch default -> 1276, -1407770387 -> 4446, 752858509 -> 1232
    //   1276: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1279: getstatic Perryc.1 : I
    //   1282: ifeq -> 1296
    //   1285: ldc2_w -1138446470
    //   1288: l2i
    //   1289: ldc_w 186384652
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w 39190449
    //   1299: l2i
    //   1300: ldc_w 353301534
    //   1303: ixor
    //   1304: ldc2_w -280566185
    //   1307: l2i
    //   1308: ldc_w 106156055
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 4372, -28426769 -> 1340, 1580046390 -> 1296
    //   1340: putstatic bigname/zprestige/webhack/util/TextUtil.GOLD : Ljava/lang/String;
    //   1343: getstatic Perryc.c : I
    //   1346: iflt -> 1360
    //   1349: ldc2_w -179721618
    //   1352: l2i
    //   1353: ldc_w 348153652
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w 1084700463
    //   1363: l2i
    //   1364: ldc_w -1058533408
    //   1367: ixor
    //   1368: ldc2_w 624636298
    //   1371: l2i
    //   1372: ldc_w 904703033
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 4460, -1869044356 -> 1404, -245477143 -> 1360
    //   1404: getstatic com/mojang/realmsclient/gui/ChatFormatting.GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1407: getstatic Perryc.c : I
    //   1410: iflt -> 1424
    //   1413: ldc2_w -1209661250
    //   1416: l2i
    //   1417: ldc_w 411182693
    //   1420: ixor
    //   1421: goto -> 1432
    //   1424: ldc2_w -1271947055
    //   1427: l2i
    //   1428: ldc_w -729661968
    //   1431: ixor
    //   1432: ldc2_w 1608734024
    //   1435: l2i
    //   1436: ldc_w 688527824
    //   1439: ixor
    //   1440: ixor
    //   1441: lookupswitch default -> 4406, -645045693 -> 1424, 373608889 -> 1468
    //   1468: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1471: getstatic Perryc.c : I
    //   1474: iflt -> 1488
    //   1477: ldc2_w -1226670446
    //   1480: l2i
    //   1481: ldc_w 1020314304
    //   1484: ixor
    //   1485: goto -> 1496
    //   1488: ldc2_w 1228677490
    //   1491: l2i
    //   1492: ldc_w -448208529
    //   1495: ixor
    //   1496: ldc2_w -1233234068
    //   1499: l2i
    //   1500: ldc_w -1970028251
    //   1503: ixor
    //   1504: ixor
    //   1505: lookupswitch default -> 4440, -1868999084 -> 1532, -1226888677 -> 1488
    //   1532: putstatic bigname/zprestige/webhack/util/TextUtil.GRAY : Ljava/lang/String;
    //   1535: getstatic Perryc.1 : I
    //   1538: ifeq -> 1552
    //   1541: ldc2_w 1379885447
    //   1544: l2i
    //   1545: ldc_w 446746807
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w -1363870976
    //   1555: l2i
    //   1556: ldc_w -913436487
    //   1559: ixor
    //   1560: ldc2_w 522882788
    //   1563: l2i
    //   1564: ldc_w 1871933729
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 4378, 394466428 -> 1596, 942034677 -> 1552
    //   1596: getstatic com/mojang/realmsclient/gui/ChatFormatting.DARK_GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1599: getstatic Perryc.1 : I
    //   1602: ifeq -> 1616
    //   1605: ldc2_w 846497712
    //   1608: l2i
    //   1609: ldc_w 1592855839
    //   1612: ixor
    //   1613: goto -> 1624
    //   1616: ldc2_w -10721824
    //   1619: l2i
    //   1620: ldc_w 276624238
    //   1623: ixor
    //   1624: ldc2_w 732314198
    //   1627: l2i
    //   1628: ldc_w -1551258840
    //   1631: ixor
    //   1632: ixor
    //   1633: lookupswitch default -> 1660, -458613807 -> 4370, 1550248570 -> 1616
    //   1660: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1663: getstatic Perryc.c : I
    //   1666: iflt -> 1680
    //   1669: ldc2_w 582602223
    //   1672: l2i
    //   1673: ldc_w -1559544720
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w 853579055
    //   1683: l2i
    //   1684: ldc_w 932367591
    //   1687: ixor
    //   1688: ldc2_w 1630404645
    //   1691: l2i
    //   1692: ldc_w -432121657
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 1724, -357297336 -> 1680, 111323517 -> 4376
    //   1724: putstatic bigname/zprestige/webhack/util/TextUtil.DARK_GRAY : Ljava/lang/String;
    //   1727: getstatic Perryc.0 : I
    //   1730: ifle -> 1744
    //   1733: ldc2_w 405923825
    //   1736: l2i
    //   1737: ldc_w -967633875
    //   1740: ixor
    //   1741: goto -> 1752
    //   1744: ldc2_w 1715144407
    //   1747: l2i
    //   1748: ldc_w 357449421
    //   1751: ixor
    //   1752: ldc2_w -1542648932
    //   1755: l2i
    //   1756: ldc_w -1980381976
    //   1759: ixor
    //   1760: ixor
    //   1761: lookupswitch default -> 4482, -207995736 -> 1744, 1586362222 -> 1788
    //   1788: getstatic com/mojang/realmsclient/gui/ChatFormatting.BLUE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1791: getstatic Perryc.c : I
    //   1794: iflt -> 1808
    //   1797: ldc2_w 1586754052
    //   1800: l2i
    //   1801: ldc_w 1554382236
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -1893714607
    //   1811: l2i
    //   1812: ldc_w 428582988
    //   1815: ixor
    //   1816: ldc2_w -1857620332
    //   1819: l2i
    //   1820: ldc_w 1565148192
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 4462, -835011284 -> 1808, 1520906153 -> 1852
    //   1852: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1855: getstatic Perryc.c : I
    //   1858: iflt -> 1872
    //   1861: ldc2_w -907076581
    //   1864: l2i
    //   1865: ldc_w 1117465515
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w -282295441
    //   1875: l2i
    //   1876: ldc_w 1315668682
    //   1879: ixor
    //   1880: ldc2_w -2089148774
    //   1883: l2i
    //   1884: ldc_w -815585126
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 1916, -1673480274 -> 1872, -949157456 -> 4450
    //   1916: putstatic bigname/zprestige/webhack/util/TextUtil.BLUE : Ljava/lang/String;
    //   1919: getstatic Perryc.c : I
    //   1922: iflt -> 1936
    //   1925: ldc2_w 575528694
    //   1928: l2i
    //   1929: ldc_w 1765800574
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w 1164357081
    //   1939: l2i
    //   1940: ldc_w -847292152
    //   1943: ixor
    //   1944: ldc2_w 2023892135
    //   1947: l2i
    //   1948: ldc_w -286787026
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 4456, -583534079 -> 1936, 509356632 -> 1980
    //   1980: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1983: getstatic Perryc.1 : I
    //   1986: ifeq -> 2000
    //   1989: ldc2_w -1650726208
    //   1992: l2i
    //   1993: ldc_w 1945940907
    //   1996: ixor
    //   1997: goto -> 2008
    //   2000: ldc2_w -1895508144
    //   2003: l2i
    //   2004: ldc_w -1811153737
    //   2007: ixor
    //   2008: ldc2_w 65484427
    //   2011: l2i
    //   2012: ldc_w 1965235200
    //   2015: ixor
    //   2016: ixor
    //   2017: lookupswitch default -> 2044, -1734118432 -> 4418, -826198008 -> 2000
    //   2044: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2047: getstatic Perryc.c : I
    //   2050: iflt -> 2064
    //   2053: ldc2_w 135804890
    //   2056: l2i
    //   2057: ldc_w 1417519862
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w 1621618735
    //   2067: l2i
    //   2068: ldc_w 829118883
    //   2071: ixor
    //   2072: ldc2_w -66722252
    //   2075: l2i
    //   2076: ldc_w -1058037983
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 2108, 13135932 -> 2064, 1620044857 -> 4436
    //   2108: putstatic bigname/zprestige/webhack/util/TextUtil.GREEN : Ljava/lang/String;
    //   2111: getstatic Perryc.1 : I
    //   2114: ifeq -> 2128
    //   2117: ldc2_w -2145752031
    //   2120: l2i
    //   2121: ldc_w -1834043876
    //   2124: ixor
    //   2125: goto -> 2136
    //   2128: ldc2_w -779469358
    //   2131: l2i
    //   2132: ldc_w 532517046
    //   2135: ixor
    //   2136: ldc2_w 1182085217
    //   2139: l2i
    //   2140: ldc_w -324866426
    //   2143: ixor
    //   2144: ixor
    //   2145: lookupswitch default -> 4366, -1201470246 -> 2128, 1692431235 -> 2172
    //   2172: getstatic com/mojang/realmsclient/gui/ChatFormatting.AQUA : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2175: getstatic Perryc.c : I
    //   2178: iflt -> 2192
    //   2181: ldc2_w -214953551
    //   2184: l2i
    //   2185: ldc_w 783254259
    //   2188: ixor
    //   2189: goto -> 2200
    //   2192: ldc2_w -796998828
    //   2195: l2i
    //   2196: ldc_w -227802994
    //   2199: ixor
    //   2200: ldc2_w 408388472
    //   2203: l2i
    //   2204: ldc_w -1263402234
    //   2207: ixor
    //   2208: ixor
    //   2209: lookupswitch default -> 2236, 1396288086 -> 2192, 1903825724 -> 4466
    //   2236: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2239: getstatic Perryc.0 : I
    //   2242: ifle -> 2256
    //   2245: ldc2_w -485810734
    //   2248: l2i
    //   2249: ldc_w -1897397177
    //   2252: ixor
    //   2253: goto -> 2264
    //   2256: ldc2_w -1274573936
    //   2259: l2i
    //   2260: ldc_w 1377319104
    //   2263: ixor
    //   2264: ldc2_w -750134597
    //   2267: l2i
    //   2268: ldc_w 404092099
    //   2271: ixor
    //   2272: ixor
    //   2273: lookupswitch default -> 4414, -1497417747 -> 2256, 759405864 -> 2300
    //   2300: putstatic bigname/zprestige/webhack/util/TextUtil.AQUA : Ljava/lang/String;
    //   2303: getstatic Perryc.c : I
    //   2306: iflt -> 2320
    //   2309: ldc2_w 1719947237
    //   2312: l2i
    //   2313: ldc_w -2055669107
    //   2316: ixor
    //   2317: goto -> 2328
    //   2320: ldc2_w 67165594
    //   2323: l2i
    //   2324: ldc_w -1204667838
    //   2327: ixor
    //   2328: ldc2_w 115787934
    //   2331: l2i
    //   2332: ldc_w -270592069
    //   2335: ixor
    //   2336: ixor
    //   2337: lookupswitch default -> 4390, 180709965 -> 2320, 1426798845 -> 2364
    //   2364: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2367: getstatic Perryc.0 : I
    //   2370: ifle -> 2384
    //   2373: ldc2_w -1167787175
    //   2376: l2i
    //   2377: ldc_w -1302556229
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w 1182194246
    //   2387: l2i
    //   2388: ldc_w 1318855657
    //   2391: ixor
    //   2392: ldc2_w 892585623
    //   2395: l2i
    //   2396: ldc_w 687755109
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 2428, 368435984 -> 4374, 1868284561 -> 2384
    //   2428: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2431: getstatic Perryc.1 : I
    //   2434: ifeq -> 2448
    //   2437: ldc2_w -1266017150
    //   2440: l2i
    //   2441: ldc_w 1526841814
    //   2444: ixor
    //   2445: goto -> 2456
    //   2448: ldc2_w 762454546
    //   2451: l2i
    //   2452: ldc_w -960021860
    //   2455: ixor
    //   2456: ldc2_w -142930551
    //   2459: l2i
    //   2460: ldc_w -674879404
    //   2463: ixor
    //   2464: ixor
    //   2465: lookupswitch default -> 4410, -888652461 -> 2492, -818481015 -> 2448
    //   2492: putstatic bigname/zprestige/webhack/util/TextUtil.RED : Ljava/lang/String;
    //   2495: getstatic Perryc.1 : I
    //   2498: ifeq -> 2512
    //   2501: ldc2_w -207848372
    //   2504: l2i
    //   2505: ldc_w 211488028
    //   2508: ixor
    //   2509: goto -> 2520
    //   2512: ldc2_w -1049838373
    //   2515: l2i
    //   2516: ldc_w -2146116405
    //   2519: ixor
    //   2520: ldc2_w 862869410
    //   2523: l2i
    //   2524: ldc_w 1898284224
    //   2527: ixor
    //   2528: ixor
    //   2529: lookupswitch default -> 2556, -1119051214 -> 4468, 1636336783 -> 2512
    //   2556: getstatic com/mojang/realmsclient/gui/ChatFormatting.LIGHT_PURPLE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2559: getstatic Perryc.0 : I
    //   2562: ifle -> 2576
    //   2565: ldc2_w 1378645494
    //   2568: l2i
    //   2569: ldc_w -176391783
    //   2572: ixor
    //   2573: goto -> 2584
    //   2576: ldc2_w 1383784405
    //   2579: l2i
    //   2580: ldc_w -979879943
    //   2583: ixor
    //   2584: ldc2_w 1426486247
    //   2587: l2i
    //   2588: ldc_w -30851064
    //   2591: ixor
    //   2592: ixor
    //   2593: lookupswitch default -> 4458, 209665920 -> 2576, 1020124099 -> 2620
    //   2620: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2623: getstatic Perryc.c : I
    //   2626: iflt -> 2640
    //   2629: ldc2_w 14253416
    //   2632: l2i
    //   2633: ldc_w 1229548690
    //   2636: ixor
    //   2637: goto -> 2648
    //   2640: ldc2_w 1103808377
    //   2643: l2i
    //   2644: ldc_w 795324915
    //   2647: ixor
    //   2648: ldc2_w 1022172917
    //   2651: l2i
    //   2652: ldc_w 270705283
    //   2655: ixor
    //   2656: ixor
    //   2657: lookupswitch default -> 2684, 1357246893 -> 2640, 1700769164 -> 4486
    //   2684: putstatic bigname/zprestige/webhack/util/TextUtil.LIGHT_PURPLE : Ljava/lang/String;
    //   2687: getstatic Perryc.c : I
    //   2690: iflt -> 2704
    //   2693: ldc2_w 139672875
    //   2696: l2i
    //   2697: ldc_w 1729323565
    //   2700: ixor
    //   2701: goto -> 2712
    //   2704: ldc2_w 717516976
    //   2707: l2i
    //   2708: ldc_w -1915537894
    //   2711: ixor
    //   2712: ldc2_w -643799139
    //   2715: l2i
    //   2716: ldc_w 1802381564
    //   2719: ixor
    //   2720: ixor
    //   2721: lookupswitch default -> 4444, -577892249 -> 2704, 366545355 -> 2748
    //   2748: getstatic com/mojang/realmsclient/gui/ChatFormatting.YELLOW : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2751: getstatic Perryc.c : I
    //   2754: iflt -> 2768
    //   2757: ldc2_w -1197736609
    //   2760: l2i
    //   2761: ldc_w -1332853456
    //   2764: ixor
    //   2765: goto -> 2776
    //   2768: ldc2_w 1672875720
    //   2771: l2i
    //   2772: ldc_w 148947871
    //   2775: ixor
    //   2776: ldc2_w 1658359728
    //   2779: l2i
    //   2780: ldc_w -1559816856
    //   2783: ixor
    //   2784: ixor
    //   2785: lookupswitch default -> 4432, -1433839729 -> 2812, -909499721 -> 2768
    //   2812: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2815: getstatic Perryc.0 : I
    //   2818: ifle -> 2832
    //   2821: ldc2_w -50584580
    //   2824: l2i
    //   2825: ldc_w -1381128068
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -163001719
    //   2835: l2i
    //   2836: ldc_w 1045258234
    //   2839: ixor
    //   2840: ldc2_w 2107211316
    //   2843: l2i
    //   2844: ldc_w 451852064
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 4420, -1351459737 -> 2876, 908477076 -> 2832
    //   2876: putstatic bigname/zprestige/webhack/util/TextUtil.YELLOW : Ljava/lang/String;
    //   2879: getstatic Perryc.1 : I
    //   2882: ifeq -> 2896
    //   2885: ldc2_w 1307649130
    //   2888: l2i
    //   2889: ldc_w -1025528661
    //   2892: ixor
    //   2893: goto -> 2904
    //   2896: ldc2_w -963057095
    //   2899: l2i
    //   2900: ldc_w 1344778902
    //   2903: ixor
    //   2904: ldc2_w -617033931
    //   2907: l2i
    //   2908: ldc_w -934366085
    //   2911: ixor
    //   2912: ixor
    //   2913: lookupswitch default -> 4478, -2050415647 -> 2940, -1671892081 -> 2896
    //   2940: getstatic com/mojang/realmsclient/gui/ChatFormatting.WHITE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2943: getstatic Perryc.0 : I
    //   2946: ifle -> 2960
    //   2949: ldc2_w -1354931606
    //   2952: l2i
    //   2953: ldc_w -1303035713
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w -1114410835
    //   2963: l2i
    //   2964: ldc_w 248118767
    //   2967: ixor
    //   2968: ldc2_w 1125517479
    //   2971: l2i
    //   2972: ldc_w 610975475
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 3004, -713010911 -> 2960, 2048169089 -> 4470
    //   3004: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3007: getstatic Perryc.0 : I
    //   3010: ifle -> 3024
    //   3013: ldc2_w -1450090474
    //   3016: l2i
    //   3017: ldc_w -1298530228
    //   3020: ixor
    //   3021: goto -> 3032
    //   3024: ldc2_w 1179719410
    //   3027: l2i
    //   3028: ldc_w 1624357740
    //   3031: ixor
    //   3032: ldc2_w -1364097723
    //   3035: l2i
    //   3036: ldc_w -1702045947
    //   3039: ixor
    //   3040: ixor
    //   3041: lookupswitch default -> 3068, -1319131071 -> 3024, 792080922 -> 4388
    //   3068: putstatic bigname/zprestige/webhack/util/TextUtil.WHITE : Ljava/lang/String;
    //   3071: getstatic Perryc.0 : I
    //   3074: ifle -> 3088
    //   3077: ldc2_w -1967905704
    //   3080: l2i
    //   3081: ldc_w 1794251798
    //   3084: ixor
    //   3085: goto -> 3096
    //   3088: ldc2_w -1860027428
    //   3091: l2i
    //   3092: ldc_w -276999135
    //   3095: ixor
    //   3096: ldc2_w -1162436124
    //   3099: l2i
    //   3100: ldc_w -950471182
    //   3103: ixor
    //   3104: ixor
    //   3105: lookupswitch default -> 4448, -1649906600 -> 3088, 61946859 -> 3132
    //   3132: getstatic com/mojang/realmsclient/gui/ChatFormatting.OBFUSCATED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3135: getstatic Perryc.c : I
    //   3138: iflt -> 3152
    //   3141: ldc2_w 1495838556
    //   3144: l2i
    //   3145: ldc_w -1601391551
    //   3148: ixor
    //   3149: goto -> 3160
    //   3152: ldc2_w -352851823
    //   3155: l2i
    //   3156: ldc_w 1478897490
    //   3159: ixor
    //   3160: ldc2_w -1958544478
    //   3163: l2i
    //   3164: ldc_w -1042529144
    //   3167: ixor
    //   3168: ixor
    //   3169: lookupswitch default -> 3196, -1288002505 -> 4480, -1007595284 -> 3152
    //   3196: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3199: getstatic Perryc.c : I
    //   3202: iflt -> 3216
    //   3205: ldc2_w -354140771
    //   3208: l2i
    //   3209: ldc_w -1179375304
    //   3212: ixor
    //   3213: goto -> 3224
    //   3216: ldc2_w 1218664931
    //   3219: l2i
    //   3220: ldc_w -1299960111
    //   3223: ixor
    //   3224: ldc2_w 1361307528
    //   3227: l2i
    //   3228: ldc_w 1325695301
    //   3231: ixor
    //   3232: ixor
    //   3233: lookupswitch default -> 3260, 1299673704 -> 4464, 1783210708 -> 3216
    //   3260: putstatic bigname/zprestige/webhack/util/TextUtil.OBFUSCATED : Ljava/lang/String;
    //   3263: getstatic Perryc.c : I
    //   3266: iflt -> 3280
    //   3269: ldc2_w 1564448825
    //   3272: l2i
    //   3273: ldc_w 691251119
    //   3276: ixor
    //   3277: goto -> 3288
    //   3280: ldc2_w 818457022
    //   3283: l2i
    //   3284: ldc_w 860536911
    //   3287: ixor
    //   3288: ldc2_w -795084617
    //   3291: l2i
    //   3292: ldc_w 815563490
    //   3295: ixor
    //   3296: ixor
    //   3297: lookupswitch default -> 3324, -1811200573 -> 4416, -559959278 -> 3280
    //   3324: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3327: getstatic Perryc.1 : I
    //   3330: ifeq -> 3344
    //   3333: ldc2_w 1706656653
    //   3336: l2i
    //   3337: ldc_w -537655930
    //   3340: ixor
    //   3341: goto -> 3352
    //   3344: ldc2_w 1775204144
    //   3347: l2i
    //   3348: ldc_w -460204880
    //   3351: ixor
    //   3352: ldc2_w 1476557007
    //   3355: l2i
    //   3356: ldc_w 651441098
    //   3359: ixor
    //   3360: ixor
    //   3361: lookupswitch default -> 3388, -1520151978 -> 3344, -996422386 -> 4490
    //   3388: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3391: getstatic Perryc.1 : I
    //   3394: ifeq -> 3408
    //   3397: ldc2_w 1962115204
    //   3400: l2i
    //   3401: ldc_w 2104843514
    //   3404: ixor
    //   3405: goto -> 3416
    //   3408: ldc2_w 573490555
    //   3411: l2i
    //   3412: ldc_w -350993317
    //   3415: ixor
    //   3416: ldc2_w 644266273
    //   3419: l2i
    //   3420: ldc_w 2013649968
    //   3423: ixor
    //   3424: ixor
    //   3425: lookupswitch default -> 4476, -1755716559 -> 3452, 1474673007 -> 3408
    //   3452: putstatic bigname/zprestige/webhack/util/TextUtil.BOLD : Ljava/lang/String;
    //   3455: getstatic Perryc.c : I
    //   3458: iflt -> 3472
    //   3461: ldc2_w -1771857203
    //   3464: l2i
    //   3465: ldc_w 1154819123
    //   3468: ixor
    //   3469: goto -> 3480
    //   3472: ldc2_w 901308510
    //   3475: l2i
    //   3476: ldc_w -972701719
    //   3479: ixor
    //   3480: ldc2_w 621289658
    //   3483: l2i
    //   3484: ldc_w -2035005876
    //   3487: ixor
    //   3488: ixor
    //   3489: lookupswitch default -> 3516, 1454870620 -> 3472, 1896536072 -> 4428
    //   3516: getstatic com/mojang/realmsclient/gui/ChatFormatting.STRIKETHROUGH : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3519: getstatic Perryc.0 : I
    //   3522: ifle -> 3536
    //   3525: ldc2_w 1784311794
    //   3528: l2i
    //   3529: ldc_w -1247491136
    //   3532: ixor
    //   3533: goto -> 3544
    //   3536: ldc2_w 946234512
    //   3539: l2i
    //   3540: ldc_w -1564766461
    //   3543: ixor
    //   3544: ldc2_w -1871411243
    //   3547: l2i
    //   3548: ldc_w -1693645244
    //   3551: ixor
    //   3552: ixor
    //   3553: lookupswitch default -> 3580, -989235875 -> 3536, -729340509 -> 4452
    //   3580: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3583: getstatic Perryc.1 : I
    //   3586: ifeq -> 3600
    //   3589: ldc2_w -549462185
    //   3592: l2i
    //   3593: ldc_w 360207272
    //   3596: ixor
    //   3597: goto -> 3608
    //   3600: ldc2_w 2036147529
    //   3603: l2i
    //   3604: ldc_w -953615388
    //   3607: ixor
    //   3608: ldc2_w 960601411
    //   3611: l2i
    //   3612: ldc_w 2125951331
    //   3615: ixor
    //   3616: ixor
    //   3617: lookupswitch default -> 3644, -1917755169 -> 4484, 1290533921 -> 3600
    //   3644: putstatic bigname/zprestige/webhack/util/TextUtil.STRIKE : Ljava/lang/String;
    //   3647: getstatic Perryc.0 : I
    //   3650: ifle -> 3664
    //   3653: ldc2_w -153390901
    //   3656: l2i
    //   3657: ldc_w -902441055
    //   3660: ixor
    //   3661: goto -> 3672
    //   3664: ldc2_w 102878547
    //   3667: l2i
    //   3668: ldc_w 1357237671
    //   3671: ixor
    //   3672: ldc2_w 346286433
    //   3675: l2i
    //   3676: ldc_w -617794284
    //   3679: ixor
    //   3680: ixor
    //   3681: lookupswitch default -> 3708, -211780833 -> 4474, 1126792023 -> 3664
    //   3708: getstatic com/mojang/realmsclient/gui/ChatFormatting.UNDERLINE : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3711: getstatic Perryc.c : I
    //   3714: iflt -> 3728
    //   3717: ldc2_w -132286785
    //   3720: l2i
    //   3721: ldc_w -1990531652
    //   3724: ixor
    //   3725: goto -> 3736
    //   3728: ldc2_w 1858258115
    //   3731: l2i
    //   3732: ldc_w -1295393301
    //   3735: ixor
    //   3736: ldc2_w -1436287470
    //   3739: l2i
    //   3740: ldc_w 1028215192
    //   3743: ixor
    //   3744: ixor
    //   3745: lookupswitch default -> 3772, -2063345751 -> 3728, -429048695 -> 4434
    //   3772: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3775: getstatic Perryc.c : I
    //   3778: iflt -> 3792
    //   3781: ldc2_w 564638352
    //   3784: l2i
    //   3785: ldc_w -1034799172
    //   3788: ixor
    //   3789: goto -> 3800
    //   3792: ldc2_w 1502585218
    //   3795: l2i
    //   3796: ldc_w -833634845
    //   3799: ixor
    //   3800: ldc2_w 1424956830
    //   3803: l2i
    //   3804: ldc_w -688990054
    //   3807: ixor
    //   3808: ixor
    //   3809: lookupswitch default -> 4380, 365025637 -> 3836, 1643397160 -> 3792
    //   3836: putstatic bigname/zprestige/webhack/util/TextUtil.UNDERLINE : Ljava/lang/String;
    //   3839: getstatic Perryc.c : I
    //   3842: iflt -> 3856
    //   3845: ldc2_w -561614332
    //   3848: l2i
    //   3849: ldc_w -1272171534
    //   3852: ixor
    //   3853: goto -> 3864
    //   3856: ldc2_w -37971233
    //   3859: l2i
    //   3860: ldc_w 1587044667
    //   3863: ixor
    //   3864: ldc2_w 148831757
    //   3867: l2i
    //   3868: ldc_w 1925000310
    //   3871: ixor
    //   3872: ixor
    //   3873: lookupswitch default -> 4392, -649647713 -> 3900, 281645965 -> 3856
    //   3900: getstatic com/mojang/realmsclient/gui/ChatFormatting.ITALIC : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3903: getstatic Perryc.c : I
    //   3906: iflt -> 3920
    //   3909: ldc2_w 482473110
    //   3912: l2i
    //   3913: ldc_w 904051958
    //   3916: ixor
    //   3917: goto -> 3928
    //   3920: ldc2_w -17831526
    //   3923: l2i
    //   3924: ldc_w 1035915890
    //   3927: ixor
    //   3928: ldc2_w 995509524
    //   3931: l2i
    //   3932: ldc_w 1358289004
    //   3935: ixor
    //   3936: ixor
    //   3937: lookupswitch default -> 4422, -1460492656 -> 3964, 1115739416 -> 3920
    //   3964: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3967: getstatic Perryc.1 : I
    //   3970: ifeq -> 3984
    //   3973: ldc2_w 1621290299
    //   3976: l2i
    //   3977: ldc_w -1572815411
    //   3980: ixor
    //   3981: goto -> 3992
    //   3984: ldc2_w -561116966
    //   3987: l2i
    //   3988: ldc_w 707379038
    //   3991: ixor
    //   3992: ldc2_w 594157081
    //   3995: l2i
    //   3996: ldc_w 671192611
    //   3999: ixor
    //   4000: ixor
    //   4001: lookupswitch default -> 4028, -913712948 -> 4400, 1317445777 -> 3984
    //   4028: putstatic bigname/zprestige/webhack/util/TextUtil.ITALIC : Ljava/lang/String;
    //   4031: getstatic Perryc.0 : I
    //   4034: ifle -> 4048
    //   4037: ldc2_w 225842917
    //   4040: l2i
    //   4041: ldc_w -1651012631
    //   4044: ixor
    //   4045: goto -> 4056
    //   4048: ldc2_w -1516252025
    //   4051: l2i
    //   4052: ldc_w -844650289
    //   4055: ixor
    //   4056: ldc2_w -2001878887
    //   4059: l2i
    //   4060: ldc_w 984956473
    //   4063: ixor
    //   4064: ixor
    //   4065: lookupswitch default -> 4092, -1420472985 -> 4048, 586769324 -> 4454
    //   4092: getstatic com/mojang/realmsclient/gui/ChatFormatting.RESET : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4095: getstatic Perryc.1 : I
    //   4098: ifeq -> 4112
    //   4101: ldc2_w 1129722403
    //   4104: l2i
    //   4105: ldc_w 1047960741
    //   4108: ixor
    //   4109: goto -> 4120
    //   4112: ldc2_w -573795611
    //   4115: l2i
    //   4116: ldc_w 1875161384
    //   4119: ixor
    //   4120: ldc2_w 39426218
    //   4123: l2i
    //   4124: ldc_w -518015619
    //   4127: ixor
    //   4128: ixor
    //   4129: lookupswitch default -> 4156, -1637448879 -> 4408, -942657189 -> 4112
    //   4156: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   4159: getstatic Perryc.1 : I
    //   4162: ifeq -> 4176
    //   4165: ldc2_w -899178021
    //   4168: l2i
    //   4169: ldc_w -1510174271
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w -1088988705
    //   4179: l2i
    //   4180: ldc_w 1222478783
    //   4183: ixor
    //   4184: ldc2_w -995400216
    //   4187: l2i
    //   4188: ldc_w -1128904018
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4220, -1590932566 -> 4176, 394665820 -> 4430
    //   4220: putstatic bigname/zprestige/webhack/util/TextUtil.RESET : Ljava/lang/String;
    //   4223: new java/util/Random
    //   4226: dup
    //   4227: getstatic Perryc.c : I
    //   4230: iflt -> 4244
    //   4233: ldc2_w -2028729904
    //   4236: l2i
    //   4237: ldc_w -1749260563
    //   4240: ixor
    //   4241: goto -> 4252
    //   4244: ldc2_w 12154078
    //   4247: l2i
    //   4248: ldc_w -58271040
    //   4251: ixor
    //   4252: ldc2_w -142821726
    //   4255: l2i
    //   4256: ldc_w -2121789089
    //   4259: ixor
    //   4260: ixor
    //   4261: lookupswitch default -> 4288, -1339657730 -> 4244, 1717356736 -> 4442
    //   4288: invokespecial <init> : ()V
    //   4291: getstatic Perryc.c : I
    //   4294: iflt -> 4308
    //   4297: ldc2_w 1068464468
    //   4300: l2i
    //   4301: ldc_w 1271379109
    //   4304: ixor
    //   4305: goto -> 4316
    //   4308: ldc2_w -1269575871
    //   4311: l2i
    //   4312: ldc_w -485747207
    //   4315: ixor
    //   4316: ldc2_w -1404317658
    //   4319: l2i
    //   4320: ldc_w -1197161227
    //   4323: ixor
    //   4324: ixor
    //   4325: lookupswitch default -> 4352, 542501445 -> 4308, 1619515682 -> 4424
    //   4352: putstatic bigname/zprestige/webhack/util/TextUtil.rand : Ljava/util/Random;
    //   4355: return
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
    //   4382: aconst_null
    //   4383: athrow
    //   4384: aconst_null
    //   4385: athrow
    //   4386: aconst_null
    //   4387: athrow
    //   4388: aconst_null
    //   4389: athrow
    //   4390: aconst_null
    //   4391: athrow
    //   4392: aconst_null
    //   4393: athrow
    //   4394: aconst_null
    //   4395: athrow
    //   4396: aconst_null
    //   4397: athrow
    //   4398: aconst_null
    //   4399: athrow
    //   4400: aconst_null
    //   4401: athrow
    //   4402: aconst_null
    //   4403: athrow
    //   4404: aconst_null
    //   4405: athrow
    //   4406: aconst_null
    //   4407: athrow
    //   4408: aconst_null
    //   4409: athrow
    //   4410: aconst_null
    //   4411: athrow
    //   4412: aconst_null
    //   4413: athrow
    //   4414: aconst_null
    //   4415: athrow
    //   4416: aconst_null
    //   4417: athrow
    //   4418: aconst_null
    //   4419: athrow
    //   4420: aconst_null
    //   4421: athrow
    //   4422: aconst_null
    //   4423: athrow
    //   4424: aconst_null
    //   4425: athrow
    //   4426: aconst_null
    //   4427: athrow
    //   4428: aconst_null
    //   4429: athrow
    //   4430: aconst_null
    //   4431: athrow
    //   4432: aconst_null
    //   4433: athrow
    //   4434: aconst_null
    //   4435: athrow
    //   4436: aconst_null
    //   4437: athrow
    //   4438: aconst_null
    //   4439: athrow
    //   4440: aconst_null
    //   4441: athrow
    //   4442: aconst_null
    //   4443: athrow
    //   4444: aconst_null
    //   4445: athrow
    //   4446: aconst_null
    //   4447: athrow
    //   4448: aconst_null
    //   4449: athrow
    //   4450: aconst_null
    //   4451: athrow
    //   4452: aconst_null
    //   4453: athrow
    //   4454: aconst_null
    //   4455: athrow
    //   4456: aconst_null
    //   4457: athrow
    //   4458: aconst_null
    //   4459: athrow
    //   4460: aconst_null
    //   4461: athrow
    //   4462: aconst_null
    //   4463: athrow
    //   4464: aconst_null
    //   4465: athrow
    //   4466: aconst_null
    //   4467: athrow
    //   4468: aconst_null
    //   4469: athrow
    //   4470: aconst_null
    //   4471: athrow
    //   4472: aconst_null
    //   4473: athrow
    //   4474: aconst_null
    //   4475: athrow
    //   4476: aconst_null
    //   4477: athrow
    //   4478: aconst_null
    //   4479: athrow
    //   4480: aconst_null
    //   4481: athrow
    //   4482: aconst_null
    //   4483: athrow
    //   4484: aconst_null
    //   4485: athrow
    //   4486: aconst_null
    //   4487: athrow
    //   4488: aconst_null
    //   4489: athrow
    //   4490: aconst_null
    //   4491: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\TextUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */