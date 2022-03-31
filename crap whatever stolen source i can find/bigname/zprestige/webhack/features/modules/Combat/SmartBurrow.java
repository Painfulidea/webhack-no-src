package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.entity.Entity;

public class SmartBurrow extends Module {
  public Setting<Boolean> onlyInHole;
  
  public static SmartBurrow INSTANCE;
  
  public Setting<Float> smartRange;
  
  public SmartBurrow() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1895610593
    //   9: l2i
    //   10: ldc -2060417720
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 307938913
    //   19: l2i
    //   20: ldc -1169969239
    //   22: ixor
    //   23: ldc2_w -2068005253
    //   26: l2i
    //   27: ldc -257409678
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 1514, -2116501856 -> 16, -603067711 -> 56
    //   56: aload_0
    //   57: ldc '賂㌞落㶥䛤ជ๛蓋蹱᨜䆯ਰ'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -1655926957
    //   68: l2i
    //   69: ldc 1989043232
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -469639339
    //   78: l2i
    //   79: ldc 1302068993
    //   81: ixor
    //   82: ldc2_w 596470724
    //   85: l2i
    //   86: ldc 2048576569
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -1914906427 -> 75, -1303032690 -> 1484
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '陵㌚爛㷷䛣៊๸蓌蹷'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 1129723740
    //   130: l2i
    //   131: ldc 1174097362
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1795203324
    //   140: l2i
    //   141: ldc -1423204108
    //   143: ixor
    //   144: ldc2_w 1246968490
    //   147: l2i
    //   148: ldc 983141706
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -967301849 -> 137, 1986514286 -> 1490
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 362203812
    //   192: l2i
    //   193: ldc -337221787
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -2098275392
    //   202: l2i
    //   203: ldc 536807285
    //   205: ixor
    //   206: ldc2_w 819213240
    //   209: l2i
    //   210: ldc -182633328
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1125307317 -> 199, 1002021609 -> 1504
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -1362770669
    //   246: l2i
    //   247: ldc -1362770670
    //   249: ixor
    //   250: ldc2_w 923077000
    //   253: l2i
    //   254: ldc 923077000
    //   256: ixor
    //   257: ldc2_w 1117434588
    //   260: l2i
    //   261: ldc 1117434588
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w -1110242256
    //   273: l2i
    //   274: ldc -1049872042
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1382399152
    //   283: l2i
    //   284: ldc -1749936894
    //   286: ixor
    //   287: ldc2_w 1787087558
    //   290: l2i
    //   291: ldc 1031030659
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1787902831 -> 280, 726644771 -> 1480
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -481732850
    //   332: l2i
    //   333: ldc -1669046534
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -358096473
    //   342: l2i
    //   343: ldc 1890847820
    //   345: ixor
    //   346: ldc2_w -925645732
    //   349: l2i
    //   350: ldc 1317707401
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 1494, -107719903 -> 339, 474658622 -> 380
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w -1543732932
    //   390: l2i
    //   391: ldc -580147395
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 793353592
    //   400: l2i
    //   401: ldc 1995815783
    //   403: ixor
    //   404: ldc2_w -1691715827
    //   407: l2i
    //   408: ldc -880771934
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1918573070 -> 397, 775761326 -> 1516
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '賂㌞落㶥䛤ជ๋蓟蹭ᨉ䆥'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w 428875247
    //   456: l2i
    //   457: ldc 1404370393
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 429498858
    //   466: l2i
    //   467: ldc -88117827
    //   469: ixor
    //   470: ldc2_w -1381625644
    //   473: l2i
    //   474: ldc 1067470215
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 1478, -668811931 -> 463, 1897959684 -> 504
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc 0.4938343
    //   509: invokestatic floatToIntBits : (F)I
    //   512: ldc 2128402393
    //   514: ixor
    //   515: invokestatic intBitsToFloat : (I)F
    //   518: getstatic Perryc.1 : I
    //   521: ifeq -> 534
    //   524: ldc2_w -1249639320
    //   527: l2i
    //   528: ldc -2042158913
    //   530: ixor
    //   531: goto -> 541
    //   534: ldc2_w -1978283445
    //   537: l2i
    //   538: ldc 1306426081
    //   540: ixor
    //   541: ldc2_w 599659011
    //   544: l2i
    //   545: ldc -896248331
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, -1263978918 -> 534, -622238943 -> 1486
    //   576: invokestatic valueOf : (F)Ljava/lang/Float;
    //   579: ldc 4.369409
    //   581: invokestatic floatToIntBits : (F)I
    //   584: ldc 2131481139
    //   586: ixor
    //   587: invokestatic intBitsToFloat : (I)F
    //   590: getstatic Perryc.0 : I
    //   593: ifle -> 606
    //   596: ldc2_w -1137432257
    //   599: l2i
    //   600: ldc 1956176525
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w 1167971255
    //   609: l2i
    //   610: ldc 806111802
    //   612: ixor
    //   613: ldc2_w -1610040346
    //   616: l2i
    //   617: ldc 1085722677
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 648, -126924602 -> 606, 672309345 -> 1476
    //   648: invokestatic valueOf : (F)Ljava/lang/Float;
    //   651: ldc 0.15057097
    //   653: invokestatic floatToIntBits : (F)I
    //   656: ldc 2134519623
    //   658: ixor
    //   659: invokestatic intBitsToFloat : (I)F
    //   662: getstatic Perryc.1 : I
    //   665: ifeq -> 678
    //   668: ldc2_w -298008286
    //   671: l2i
    //   672: ldc 1470250664
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w -1087479901
    //   681: l2i
    //   682: ldc 1083029438
    //   684: ixor
    //   685: ldc2_w 2052329087
    //   688: l2i
    //   689: ldc 1221059967
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -1962077046 -> 1506, -1066662624 -> 678
    //   720: invokestatic valueOf : (F)Ljava/lang/Float;
    //   723: getstatic Perryc.1 : I
    //   726: ifeq -> 739
    //   729: ldc2_w 637717246
    //   732: l2i
    //   733: ldc 429748940
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w -1054639731
    //   742: l2i
    //   743: ldc -478499904
    //   745: ixor
    //   746: ldc2_w 211024124
    //   749: l2i
    //   750: ldc 1999369661
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 780, 209781384 -> 739, 1143453043 -> 1510
    //   780: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   783: getstatic Perryc.c : I
    //   786: iflt -> 799
    //   789: ldc2_w 1902619710
    //   792: l2i
    //   793: ldc 290950392
    //   795: ixor
    //   796: goto -> 806
    //   799: ldc2_w 1954125730
    //   802: l2i
    //   803: ldc -1810073686
    //   805: ixor
    //   806: ldc2_w -48444405
    //   809: l2i
    //   810: ldc 2145605791
    //   812: ixor
    //   813: ixor
    //   814: lookupswitch default -> 1496, -489704366 -> 799, 1654289564 -> 840
    //   840: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   843: getstatic Perryc.c : I
    //   846: iflt -> 859
    //   849: ldc2_w -1604141988
    //   852: l2i
    //   853: ldc -1713357347
    //   855: ixor
    //   856: goto -> 866
    //   859: ldc2_w -1611691765
    //   862: l2i
    //   863: ldc -547319132
    //   865: ixor
    //   866: ldc2_w 1798149830
    //   869: l2i
    //   870: ldc -1051343893
    //   872: ixor
    //   873: ixor
    //   874: lookupswitch default -> 900, -1812278100 -> 1492, 1775489058 -> 859
    //   900: putfield smartRange : Lbigname/zprestige/webhack/features/setting/Setting;
    //   903: getstatic Perryc.1 : I
    //   906: ifeq -> 919
    //   909: ldc2_w 591404639
    //   912: l2i
    //   913: ldc -509822818
    //   915: ixor
    //   916: goto -> 926
    //   919: ldc2_w 1081469619
    //   922: l2i
    //   923: ldc 115313389
    //   925: ixor
    //   926: ldc2_w -2046963423
    //   929: l2i
    //   930: ldc -182020291
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, -1308106531 -> 1500, -1124832317 -> 919
    //   960: aload_0
    //   961: getstatic Perryc.1 : I
    //   964: ifeq -> 977
    //   967: ldc2_w -1970322960
    //   970: l2i
    //   971: ldc -285847537
    //   973: ixor
    //   974: goto -> 984
    //   977: ldc2_w 128785404
    //   980: l2i
    //   981: ldc 736873124
    //   983: ixor
    //   984: ldc2_w 1533082476
    //   987: l2i
    //   988: ldc -2005685274
    //   990: ixor
    //   991: ixor
    //   992: lookupswitch default -> 1020, -1217773195 -> 1508, -818323787 -> 977
    //   1020: aload_0
    //   1021: new bigname/zprestige/webhack/features/setting/Setting
    //   1024: dup
    //   1025: ldc '肋㌜洛㶲䚰៨๷蓒蹺'
    //   1027: getstatic Perryc.1 : I
    //   1030: ifeq -> 1043
    //   1033: ldc2_w -1929318947
    //   1036: l2i
    //   1037: ldc 727551104
    //   1039: ixor
    //   1040: goto -> 1050
    //   1043: ldc2_w 997827684
    //   1046: l2i
    //   1047: ldc -2017210922
    //   1049: ixor
    //   1050: ldc2_w 435577770
    //   1053: l2i
    //   1054: ldc 1259501148
    //   1056: ixor
    //   1057: ixor
    //   1058: lookupswitch default -> 1512, -295797692 -> 1084, -189172565 -> 1043
    //   1084: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1087: ldc2_w 1862284897
    //   1090: l2i
    //   1091: ldc 1862284896
    //   1093: ixor
    //   1094: getstatic Perryc.c : I
    //   1097: iflt -> 1110
    //   1100: ldc2_w 1991784073
    //   1103: l2i
    //   1104: ldc -823522562
    //   1106: ixor
    //   1107: goto -> 1117
    //   1110: ldc2_w -446011244
    //   1113: l2i
    //   1114: ldc 816361710
    //   1116: ixor
    //   1117: ldc2_w 1616654487
    //   1120: l2i
    //   1121: ldc -1735570264
    //   1123: ixor
    //   1124: ixor
    //   1125: lookupswitch default -> 1474, 756261957 -> 1152, 1082343496 -> 1110
    //   1152: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1155: getstatic Perryc.0 : I
    //   1158: ifle -> 1172
    //   1161: ldc2_w -1380579275
    //   1164: l2i
    //   1165: ldc_w 541603263
    //   1168: ixor
    //   1169: goto -> 1180
    //   1172: ldc2_w 290825418
    //   1175: l2i
    //   1176: ldc_w -1222367434
    //   1179: ixor
    //   1180: ldc2_w 907329002
    //   1183: l2i
    //   1184: ldc_w 735963979
    //   1187: ixor
    //   1188: ixor
    //   1189: lookupswitch default -> 1216, -1875416277 -> 1502, -1767348482 -> 1172
    //   1216: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1219: getstatic Perryc.c : I
    //   1222: iflt -> 1236
    //   1225: ldc2_w 1130996360
    //   1228: l2i
    //   1229: ldc_w 1170284594
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w 1118631183
    //   1239: l2i
    //   1240: ldc_w -1757037609
    //   1243: ixor
    //   1244: ldc2_w 1102502512
    //   1247: l2i
    //   1248: ldc_w -629409642
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 1280, -1654284196 -> 1488, 226309075 -> 1236
    //   1280: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1283: getstatic Perryc.0 : I
    //   1286: ifle -> 1300
    //   1289: ldc2_w -1468792186
    //   1292: l2i
    //   1293: ldc_w 1150123105
    //   1296: ixor
    //   1297: goto -> 1308
    //   1300: ldc2_w -704548473
    //   1303: l2i
    //   1304: ldc_w -2077086998
    //   1307: ixor
    //   1308: ldc2_w 1396632377
    //   1311: l2i
    //   1312: ldc_w -126492055
    //   1315: ixor
    //   1316: ixor
    //   1317: lookupswitch default -> 1344, 23115064 -> 1300, 1202878391 -> 1472
    //   1344: putfield onlyInHole : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1347: getstatic Perryc.c : I
    //   1350: iflt -> 1364
    //   1353: ldc2_w 255619316
    //   1356: l2i
    //   1357: ldc_w 1747370274
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w 452329311
    //   1367: l2i
    //   1368: ldc_w -821915680
    //   1371: ixor
    //   1372: ldc2_w -24617039
    //   1375: l2i
    //   1376: ldc_w -571190734
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 1408, 1147583573 -> 1482, 2067332851 -> 1364
    //   1408: aload_0
    //   1409: getstatic Perryc.c : I
    //   1412: iflt -> 1426
    //   1415: ldc2_w 1714958544
    //   1418: l2i
    //   1419: ldc_w -1258253363
    //   1422: ixor
    //   1423: goto -> 1434
    //   1426: ldc2_w -2033218762
    //   1429: l2i
    //   1430: ldc_w 1267602790
    //   1433: ixor
    //   1434: ldc2_w 1671146835
    //   1437: l2i
    //   1438: ldc_w 414935840
    //   1441: ixor
    //   1442: ixor
    //   1443: lookupswitch default -> 1468, -1474796178 -> 1498, -543693606 -> 1426
    //   1468: invokespecial setInstance : ()V
    //   1471: return
    //   1472: aconst_null
    //   1473: athrow
    //   1474: aconst_null
    //   1475: athrow
    //   1476: aconst_null
    //   1477: athrow
    //   1478: aconst_null
    //   1479: athrow
    //   1480: aconst_null
    //   1481: athrow
    //   1482: aconst_null
    //   1483: athrow
    //   1484: aconst_null
    //   1485: athrow
    //   1486: aconst_null
    //   1487: athrow
    //   1488: aconst_null
    //   1489: athrow
    //   1490: aconst_null
    //   1491: athrow
    //   1492: aconst_null
    //   1493: athrow
    //   1494: aconst_null
    //   1495: athrow
    //   1496: aconst_null
    //   1497: athrow
    //   1498: aconst_null
    //   1499: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1472	0	this	Lbigname/zprestige/webhack/features/modules/Combat/SmartBurrow;
  }
  
  public boolean lambda$onUpdate$0(Entity paramEntity) {
    return Perry1.5S(this, (int)1624138329L ^ 0x461D0E0F, paramEntity);
  }
  
  public void setInstance() {
    Perry1.3F(this, (int)1830854177L ^ 0x1E9E4858);
  }
  
  public static SmartBurrow getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1025052393
    //   33: l2i
    //   34: ldc_w -436882670
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1521618762
    //   44: l2i
    //   45: ldc_w 1498399490
    //   48: ixor
    //   49: ldc2_w -1831874270
    //   52: l2i
    //   53: ldc_w -964638457
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1935432226 -> 348, 759418672 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Combat/SmartBurrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/SmartBurrow;
    //   87: ifnonnull -> 101
    //   90: ldc2_w -777936768
    //   93: l2i
    //   94: ldc_w -1376269479
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -331508249
    //   104: l2i
    //   105: ldc_w -1871970755
    //   108: ixor
    //   109: ldc2_w 1776724198
    //   112: l2i
    //   113: ldc_w 1169485990
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, 1342452633 -> 140, 1342452634 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Combat/SmartBurrow
    //   143: dup
    //   144: getstatic Perryc.0 : I
    //   147: ifle -> 161
    //   150: ldc2_w 1632841078
    //   153: l2i
    //   154: ldc_w 283120067
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 1142930671
    //   164: l2i
    //   165: ldc_w -1707577880
    //   168: ixor
    //   169: ldc2_w -32527433
    //   172: l2i
    //   173: ldc_w -1136661852
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 204, 864255398 -> 344, 1662045577 -> 161
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w 410687559
    //   224: l2i
    //   225: ldc_w -85836571
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -992077038
    //   235: l2i
    //   236: ldc_w -951122355
    //   239: ixor
    //   240: ldc2_w -56711188
    //   243: l2i
    //   244: ldc_w 1332079329
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 350, -1335209902 -> 276, 1365502383 -> 232
    //   276: putstatic bigname/zprestige/webhack/features/modules/Combat/SmartBurrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/SmartBurrow;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w -747306506
    //   288: l2i
    //   289: ldc_w 648876909
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -1863533773
    //   299: l2i
    //   300: ldc_w 460061808
    //   303: ixor
    //   304: ldc2_w -1890023901
    //   307: l2i
    //   308: ldc_w -1567965912
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -1829659901 -> 296, -670422640 -> 346
    //   340: getstatic bigname/zprestige/webhack/features/modules/Combat/SmartBurrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/SmartBurrow;
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
    //   207	214	207	finally
    //   208	214	207	finally
    //   208	214	214	java/lang/EnumConstantNotPresentException
    //   361	369	361	java/lang/UnsupportedOperationException
    //   377	379	3	java/lang/ArithmeticException
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Combat/SmartBurrow
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 21
    //   10: ldc2_w 1555918132
    //   13: l2i
    //   14: ldc_w 970012114
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w 446008820
    //   24: l2i
    //   25: ldc_w 1042863690
    //   28: ixor
    //   29: ldc2_w 1524469650
    //   32: l2i
    //   33: ldc_w 2095913744
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 64, -14393011 -> 21, 1130155108 -> 132
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w -1812774557
    //   76: l2i
    //   77: ldc_w -610963103
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -746162610
    //   87: l2i
    //   88: ldc_w 585472908
    //   91: ixor
    //   92: ldc2_w 181703785
    //   95: l2i
    //   96: ldc_w 267097617
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 134, -195235910 -> 128, 1297691258 -> 84
    //   128: putstatic bigname/zprestige/webhack/features/modules/Combat/SmartBurrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/SmartBurrow;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public Float lambda$onUpdate$1(Entity e) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\SmartBurrow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */