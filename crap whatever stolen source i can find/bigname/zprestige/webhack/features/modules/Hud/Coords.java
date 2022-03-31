package bigname.zprestige.webhack.features.modules.Hud;

import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class Coords extends Module {
  public Setting<Integer> y;
  
  public int color;
  
  public Setting<Boolean> direction;
  
  public void onRender2D(Render2DEvent event) {
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
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Coords() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -1366732889
    //   9: l2i
    //   10: ldc_w -1032503178
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 981466540
    //   20: l2i
    //   21: ldc_w -1164322199
    //   24: ixor
    //   25: ldc2_w 801534567
    //   28: l2i
    //   29: ldc_w 140585311
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 1472, -1488880387 -> 60, 1264276713 -> 17
    //   60: aload_0
    //   61: ldc_w '羥㌜翣㶥쳡鄩'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -444404310
    //   73: l2i
    //   74: ldc_w 1369659792
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -70390438
    //   84: l2i
    //   85: ldc_w 989850331
    //   88: ixor
    //   89: ldc2_w 1084787297
    //   92: l2i
    //   93: ldc_w -1685829577
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -302138046 -> 81, 1863153260 -> 1492
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '翆㌠翩㶤쳽鄾๺ȸ'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 2090479221
    //   139: l2i
    //   140: ldc_w 62489051
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1843366575
    //   150: l2i
    //   151: ldc_w 1127535042
    //   154: ixor
    //   155: ldc2_w -1274387377
    //   158: l2i
    //   159: ldc_w 72522293
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -814001708 -> 1504, -232723094 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 1845395071
    //   204: l2i
    //   205: ldc_w 1399041901
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1602234789
    //   215: l2i
    //   216: ldc_w -1073952
    //   219: ixor
    //   220: ldc2_w 997173753
    //   223: l2i
    //   224: ldc_w 57158551
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 1474, 110777212 -> 212, 1738000597 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -2133276415
    //   262: l2i
    //   263: ldc_w -2133276416
    //   266: ixor
    //   267: ldc2_w -739118104
    //   270: l2i
    //   271: ldc_w -739118104
    //   274: ixor
    //   275: ldc2_w -459301175
    //   278: l2i
    //   279: ldc_w -459301175
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 2048689962
    //   292: l2i
    //   293: ldc_w -483399351
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 102156067
    //   303: l2i
    //   304: ldc_w 1105822847
    //   307: ixor
    //   308: ldc2_w -264055804
    //   311: l2i
    //   312: ldc_w 1692356336
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, 44518177 -> 300, 229569687 -> 1498
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w 377927460
    //   356: l2i
    //   357: ldc_w -2126356292
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1316290586
    //   367: l2i
    //   368: ldc_w 19924729
    //   371: ixor
    //   372: ldc2_w -1086348939
    //   375: l2i
    //   376: ldc_w -783749309
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 1476, -556943575 -> 408, -105670226 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w -2105020030
    //   418: l2i
    //   419: ldc_w 1419187397
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -116305800
    //   429: l2i
    //   430: ldc_w -1352362254
    //   433: ixor
    //   434: ldc2_w 1626166716
    //   437: l2i
    //   438: ldc_w -414484223
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 1490, -774641097 -> 468, 1370933754 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '羢㌚翾㶲쳦鄮๰Ȥ蹭'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 1456835455
    //   485: l2i
    //   486: ldc_w 922517161
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 2109434438
    //   496: l2i
    //   497: ldc_w 660997799
    //   500: ixor
    //   501: ldc2_w 1973238789
    //   504: l2i
    //   505: ldc_w 1519915214
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 1496, 1328339229 -> 493, 1977106474 -> 536
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w -1363352121
    //   542: l2i
    //   543: ldc_w -1363352122
    //   546: ixor
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w 1570075130
    //   556: l2i
    //   557: ldc_w 1193917757
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1326900813
    //   567: l2i
    //   568: ldc_w 839284236
    //   571: ixor
    //   572: ldc2_w -365679524
    //   575: l2i
    //   576: ldc_w -926605730
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 1478, -1608622659 -> 608, 944635589 -> 564
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: ldc_w '羲㌛翩㷷쳱鄲๰ȥ蹤遛을ਨ뉋無ᓬ辚ꟋꝨ퇌侸锟䚹鍳⮢ᣋ?'
    //   614: getstatic Perryc.1 : I
    //   617: ifeq -> 631
    //   620: ldc2_w 2101093164
    //   623: l2i
    //   624: ldc_w 1918658587
    //   627: ixor
    //   628: goto -> 639
    //   631: ldc2_w -544029779
    //   634: l2i
    //   635: ldc_w 927116809
    //   638: ixor
    //   639: ldc2_w 1231766414
    //   642: l2i
    //   643: ldc_w 1204843252
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 1510, -429171490 -> 676, 31160909 -> 631
    //   676: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 696
    //   685: ldc2_w -116879229
    //   688: l2i
    //   689: ldc_w 409477101
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -1193906631
    //   699: l2i
    //   700: ldc_w 386366944
    //   703: ixor
    //   704: ldc2_w -293272865
    //   707: l2i
    //   708: ldc_w 1499482050
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 740, 1451608691 -> 1500, 2060840569 -> 696
    //   740: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   743: getstatic Perryc.0 : I
    //   746: ifle -> 760
    //   749: ldc2_w -1821417102
    //   752: l2i
    //   753: ldc_w -1915264952
    //   756: ixor
    //   757: goto -> 768
    //   760: ldc2_w -1428619872
    //   763: l2i
    //   764: ldc_w -915532350
    //   767: ixor
    //   768: ldc2_w -981074862
    //   771: l2i
    //   772: ldc_w -2047896749
    //   775: ixor
    //   776: ixor
    //   777: lookupswitch default -> 804, -556651009 -> 760, 1590849083 -> 1494
    //   804: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   807: getstatic Perryc.0 : I
    //   810: ifle -> 824
    //   813: ldc2_w -1867026587
    //   816: l2i
    //   817: ldc_w 2011925086
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w 31447659
    //   827: l2i
    //   828: ldc_w 1449356975
    //   831: ixor
    //   832: ldc2_w 1267803395
    //   835: l2i
    //   836: ldc_w -601712512
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 1514, -1072756409 -> 868, 1894734008 -> 824
    //   868: putfield direction : Lbigname/zprestige/webhack/features/setting/Setting;
    //   871: getstatic Perryc.1 : I
    //   874: ifeq -> 888
    //   877: ldc2_w 207704093
    //   880: l2i
    //   881: ldc_w -280871926
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w -2017766044
    //   891: l2i
    //   892: ldc_w -866617405
    //   895: ixor
    //   896: ldc2_w 1007043983
    //   899: l2i
    //   900: ldc_w -507619259
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 932, -1159888148 -> 888, 1050374621 -> 1480
    //   932: aload_0
    //   933: getstatic Perryc.1 : I
    //   936: ifeq -> 950
    //   939: ldc2_w -1569492375
    //   942: l2i
    //   943: ldc_w -716214115
    //   946: ixor
    //   947: goto -> 958
    //   950: ldc2_w -514381470
    //   953: l2i
    //   954: ldc_w -478185316
    //   957: ixor
    //   958: ldc2_w -1984896599
    //   961: l2i
    //   962: ldc_w 313721476
    //   965: ixor
    //   966: ixor
    //   967: lookupswitch default -> 1482, -1725189421 -> 992, -331357735 -> 950
    //   992: aload_0
    //   993: new bigname/zprestige/webhack/features/setting/Setting
    //   996: dup
    //   997: ldc_w '羥㌜翣㶥쳡鄩เ'
    //   1000: getstatic Perryc.c : I
    //   1003: iflt -> 1017
    //   1006: ldc2_w 1320215194
    //   1009: l2i
    //   1010: ldc_w -1982975913
    //   1013: ixor
    //   1014: goto -> 1025
    //   1017: ldc2_w 1580151846
    //   1020: l2i
    //   1021: ldc_w 435971958
    //   1024: ixor
    //   1025: ldc2_w -333326141
    //   1028: l2i
    //   1029: ldc_w 1310458533
    //   1032: ixor
    //   1033: ixor
    //   1034: lookupswitch default -> 1060, -709771781 -> 1017, 1698891947 -> 1506
    //   1060: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1063: ldc2_w 2057668307
    //   1066: l2i
    //   1067: ldc_w 2057667777
    //   1070: ixor
    //   1071: getstatic Perryc.c : I
    //   1074: iflt -> 1088
    //   1077: ldc2_w 1711667139
    //   1080: l2i
    //   1081: ldc_w -511550391
    //   1084: ixor
    //   1085: goto -> 1096
    //   1088: ldc2_w -938580349
    //   1091: l2i
    //   1092: ldc_w 1242447833
    //   1095: ixor
    //   1096: ldc2_w 278167212
    //   1099: l2i
    //   1100: ldc_w 1100913234
    //   1103: ixor
    //   1104: ixor
    //   1105: lookupswitch default -> 1132, -1671054748 -> 1088, -695382156 -> 1484
    //   1132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1135: ldc2_w -181522669
    //   1138: l2i
    //   1139: ldc_w -181522669
    //   1142: ixor
    //   1143: getstatic Perryc.0 : I
    //   1146: ifle -> 1160
    //   1149: ldc2_w -199389782
    //   1152: l2i
    //   1153: ldc_w -1075653002
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w -1802604292
    //   1163: l2i
    //   1164: ldc_w 657199214
    //   1167: ixor
    //   1168: ldc2_w 1423412117
    //   1171: l2i
    //   1172: ldc_w 1218216261
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 1508, -1343657406 -> 1204, 1471435020 -> 1160
    //   1204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1207: ldc2_w -924848287
    //   1210: l2i
    //   1211: ldc_w -924848781
    //   1214: ixor
    //   1215: getstatic Perryc.c : I
    //   1218: iflt -> 1232
    //   1221: ldc2_w -487587143
    //   1224: l2i
    //   1225: ldc_w 178233569
    //   1228: ixor
    //   1229: goto -> 1240
    //   1232: ldc2_w -1977774075
    //   1235: l2i
    //   1236: ldc_w 1276265722
    //   1239: ixor
    //   1240: ldc2_w 324104786
    //   1243: l2i
    //   1244: ldc_w 1173312734
    //   1247: ixor
    //   1248: ixor
    //   1249: lookupswitch default -> 1276, -1093565228 -> 1488, 101549952 -> 1232
    //   1276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1279: getstatic Perryc.1 : I
    //   1282: ifeq -> 1296
    //   1285: ldc2_w 504064710
    //   1288: l2i
    //   1289: ldc_w -308828696
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w -66248359
    //   1299: l2i
    //   1300: ldc_w 403075575
    //   1303: ixor
    //   1304: ldc2_w 1528773660
    //   1307: l2i
    //   1308: ldc_w 635992
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 1512, -1467332758 -> 1296, -1088562966 -> 1340
    //   1340: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1343: getstatic Perryc.1 : I
    //   1346: ifeq -> 1360
    //   1349: ldc2_w -336687799
    //   1352: l2i
    //   1353: ldc_w -239259275
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w -1009956033
    //   1363: l2i
    //   1364: ldc_w 52048965
    //   1367: ixor
    //   1368: ldc2_w -230735956
    //   1371: l2i
    //   1372: ldc_w 2053474312
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 1404, -1844900968 -> 1502, 1917189339 -> 1360
    //   1404: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1407: getstatic Perryc.0 : I
    //   1410: ifle -> 1424
    //   1413: ldc2_w 696366428
    //   1416: l2i
    //   1417: ldc_w -1663381992
    //   1420: ixor
    //   1421: goto -> 1432
    //   1424: ldc2_w 467352071
    //   1427: l2i
    //   1428: ldc_w -1448514108
    //   1431: ixor
    //   1432: ldc2_w -1896994766
    //   1435: l2i
    //   1436: ldc_w -1100207255
    //   1439: ixor
    //   1440: ixor
    //   1441: lookupswitch default -> 1486, -2098178920 -> 1468, -2049345505 -> 1424
    //   1468: putfield y : Lbigname/zprestige/webhack/features/setting/Setting;
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1472	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Coords;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Coords.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */