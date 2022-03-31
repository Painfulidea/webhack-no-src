package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class Watermark extends Module {
  public Setting<Integer> waterMarkX;
  
  public int color;
  
  public Setting<Integer> waterMarkY;
  
  public Watermark() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -320460819
    //   9: l2i
    //   10: ldc 1732332326
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1558956860
    //   19: l2i
    //   20: ldc 1299706655
    //   22: ixor
    //   23: ldc2_w 1852972232
    //   26: l2i
    //   27: ldc 1731489505
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 1480, -2099175710 -> 16, -416958990 -> 56
    //   56: aload_0
    //   57: ldc '觳㌒覺㶲㔱杵๸蹨'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -526240901
    //   68: l2i
    //   69: ldc -371371816
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1425010944
    //   78: l2i
    //   79: ldc 2113177335
    //   81: ixor
    //   82: ldc2_w -139613384
    //   85: l2i
    //   86: ldc -1600299636
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -872669425 -> 75, 1582273815 -> 1482
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '觠㌚覽㶧㔯杹๠踣槓ㄞਪ䐙無ᒧ迟凊Ꝣ⠂ت便捇'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w -1255163278
    //   130: l2i
    //   131: ldc 1863798385
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1546082453
    //   140: l2i
    //   141: ldc 1625224822
    //   143: ixor
    //   144: ldc2_w -1184287483
    //   147: l2i
    //   148: ldc -451694547
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 1476, -2042466005 -> 137, 1619209163 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w -1910545110
    //   192: l2i
    //   193: ldc -1781549649
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1480267544
    //   202: l2i
    //   203: ldc 1180213191
    //   205: ixor
    //   206: ldc2_w -1822549865
    //   209: l2i
    //   210: ldc -1045093385
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, 589010963 -> 199, 1228663781 -> 1492
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1322031508
    //   246: l2i
    //   247: ldc 1322031509
    //   249: ixor
    //   250: ldc2_w -1887114979
    //   253: l2i
    //   254: ldc -1887114979
    //   256: ixor
    //   257: ldc2_w 1041959289
    //   260: l2i
    //   261: ldc 1041959289
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w -246369224
    //   273: l2i
    //   274: ldc -520432275
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 169791072
    //   283: l2i
    //   284: ldc -1836142876
    //   286: ixor
    //   287: ldc2_w -2003218560
    //   290: l2i
    //   291: ldc -43492317
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1480411616 -> 280, 1683714806 -> 1512
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w 1487187508
    //   332: l2i
    //   333: ldc -1843209508
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1015552982
    //   342: l2i
    //   343: ldc 1226577551
    //   345: ixor
    //   346: ldc2_w -1894807308
    //   349: l2i
    //   350: ldc 969751120
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -391798650 -> 339, 2084881996 -> 1478
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -1729941114
    //   390: l2i
    //   391: ldc 1111685669
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 746443412
    //   400: l2i
    //   401: ldc -1339295602
    //   403: ixor
    //   404: ldc2_w 312748932
    //   407: l2i
    //   408: ldc 1086564694
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -2000270991 -> 1516, -1550899217 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '觳㌒覺㶲㔱杵๸蹨槥'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w -143958497
    //   456: l2i
    //   457: ldc -1438934424
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 997597880
    //   466: l2i
    //   467: ldc -1554191871
    //   469: ixor
    //   470: ldc2_w -271600309
    //   473: l2i
    //   474: ldc 600660100
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -1856886344 -> 1508, -1761353107 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -274466509
    //   510: l2i
    //   511: ldc -274466509
    //   513: ixor
    //   514: getstatic Perryc.c : I
    //   517: iflt -> 530
    //   520: ldc2_w -552049154
    //   523: l2i
    //   524: ldc -1199389851
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -166868011
    //   533: l2i
    //   534: ldc 1287577659
    //   536: ixor
    //   537: ldc2_w 906023679
    //   540: l2i
    //   541: ldc -879911295
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1500, -1709708571 -> 530, 1195272080 -> 572
    //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   575: ldc2_w -1382002657
    //   578: l2i
    //   579: ldc -1382002657
    //   581: ixor
    //   582: getstatic Perryc.0 : I
    //   585: ifle -> 598
    //   588: ldc2_w -2145554013
    //   591: l2i
    //   592: ldc 840762313
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w -863723066
    //   601: l2i
    //   602: ldc 455042792
    //   604: ixor
    //   605: ldc2_w -519568994
    //   608: l2i
    //   609: ldc 959063506
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 1510, 263840610 -> 640, 1780635174 -> 598
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: ldc2_w -1546901796
    //   646: l2i
    //   647: ldc -1546902184
    //   649: ixor
    //   650: getstatic Perryc.c : I
    //   653: iflt -> 666
    //   656: ldc2_w 590903031
    //   659: l2i
    //   660: ldc -74424101
    //   662: ixor
    //   663: goto -> 673
    //   666: ldc2_w -514510454
    //   669: l2i
    //   670: ldc -345118230
    //   672: ixor
    //   673: ldc2_w 381908231
    //   676: l2i
    //   677: ldc 640262605
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 708, -1540249168 -> 666, -398277914 -> 1494
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: getstatic Perryc.c : I
    //   714: iflt -> 727
    //   717: ldc2_w 713283068
    //   720: l2i
    //   721: ldc -1560923082
    //   723: ixor
    //   724: goto -> 734
    //   727: ldc2_w 1481380405
    //   730: l2i
    //   731: ldc -663892673
    //   733: ixor
    //   734: ldc2_w -1263458553
    //   737: l2i
    //   738: ldc 608739909
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 768, 411853960 -> 1514, 1834741679 -> 727
    //   768: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   771: getstatic Perryc.1 : I
    //   774: ifeq -> 787
    //   777: ldc2_w -1002858287
    //   780: l2i
    //   781: ldc 241738004
    //   783: ixor
    //   784: goto -> 794
    //   787: ldc2_w -1575016409
    //   790: l2i
    //   791: ldc -503927563
    //   793: ixor
    //   794: ldc2_w 513492790
    //   797: l2i
    //   798: ldc -656789409
    //   800: ixor
    //   801: ixor
    //   802: lookupswitch default -> 1518, -2052525125 -> 828, 202395308 -> 787
    //   828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   831: getstatic Perryc.1 : I
    //   834: ifeq -> 847
    //   837: ldc2_w -1442281754
    //   840: l2i
    //   841: ldc -305816101
    //   843: ixor
    //   844: goto -> 854
    //   847: ldc2_w 904758241
    //   850: l2i
    //   851: ldc -362328026
    //   853: ixor
    //   854: ldc2_w 99783340
    //   857: l2i
    //   858: ldc -716812787
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 888, -1753626724 -> 1498, -471051400 -> 847
    //   888: putfield waterMarkX : Lbigname/zprestige/webhack/features/setting/Setting;
    //   891: getstatic Perryc.1 : I
    //   894: ifeq -> 907
    //   897: ldc2_w 1771441963
    //   900: l2i
    //   901: ldc 1255239187
    //   903: ixor
    //   904: goto -> 914
    //   907: ldc2_w -674051811
    //   910: l2i
    //   911: ldc 488595570
    //   913: ixor
    //   914: ldc2_w -1503977017
    //   917: l2i
    //   918: ldc 1240287782
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 948, -856618279 -> 1504, 2006569255 -> 907
    //   948: aload_0
    //   949: getstatic Perryc.0 : I
    //   952: ifle -> 965
    //   955: ldc2_w 1198985416
    //   958: l2i
    //   959: ldc -1752006770
    //   961: ixor
    //   962: goto -> 972
    //   965: ldc2_w 761461370
    //   968: l2i
    //   969: ldc -27182421
    //   971: ixor
    //   972: ldc2_w -223831262
    //   975: l2i
    //   976: ldc -173768183
    //   978: ixor
    //   979: ixor
    //   980: lookupswitch default -> 1486, -737158662 -> 1008, -672565651 -> 965
    //   1008: aload_0
    //   1009: new bigname/zprestige/webhack/features/setting/Setting
    //   1012: dup
    //   1013: ldc '觳㌒覺㶲㔱杵๸蹨槤'
    //   1015: getstatic Perryc.0 : I
    //   1018: ifle -> 1031
    //   1021: ldc2_w 405105096
    //   1024: l2i
    //   1025: ldc -28839870
    //   1027: ixor
    //   1028: goto -> 1038
    //   1031: ldc2_w 402851022
    //   1034: l2i
    //   1035: ldc -1628167974
    //   1037: ixor
    //   1038: ldc2_w -728279572
    //   1041: l2i
    //   1042: ldc 120152810
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 1072, -518693236 -> 1031, 903655052 -> 1506
    //   1072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1075: ldc2_w -1649272218
    //   1078: l2i
    //   1079: ldc -1649272218
    //   1081: ixor
    //   1082: getstatic Perryc.0 : I
    //   1085: ifle -> 1098
    //   1088: ldc2_w -217718247
    //   1091: l2i
    //   1092: ldc 246081840
    //   1094: ixor
    //   1095: goto -> 1105
    //   1098: ldc2_w -1841946572
    //   1101: l2i
    //   1102: ldc -1245165696
    //   1104: ixor
    //   1105: ldc2_w 1083699382
    //   1108: l2i
    //   1109: ldc 1081807289
    //   1111: ixor
    //   1112: ixor
    //   1113: lookupswitch default -> 1140, -467664204 -> 1098, -45880794 -> 1490
    //   1140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1143: ldc2_w -927867862
    //   1146: l2i
    //   1147: ldc -927867862
    //   1149: ixor
    //   1150: getstatic Perryc.c : I
    //   1153: iflt -> 1166
    //   1156: ldc2_w 1740850711
    //   1159: l2i
    //   1160: ldc 474641494
    //   1162: ixor
    //   1163: goto -> 1173
    //   1166: ldc2_w 1441870154
    //   1169: l2i
    //   1170: ldc -780658957
    //   1172: ixor
    //   1173: ldc2_w -1683248829
    //   1176: l2i
    //   1177: ldc_w -1643865585
    //   1180: ixor
    //   1181: ixor
    //   1182: lookupswitch default -> 1502, -2128210699 -> 1208, 2116419853 -> 1166
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w -198842635
    //   1214: l2i
    //   1215: ldc_w -198843161
    //   1218: ixor
    //   1219: getstatic Perryc.c : I
    //   1222: iflt -> 1236
    //   1225: ldc2_w -413909328
    //   1228: l2i
    //   1229: ldc_w -170002104
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -605401260
    //   1239: l2i
    //   1240: ldc_w 880617948
    //   1243: ixor
    //   1244: ldc2_w 319687685
    //   1247: l2i
    //   1248: ldc_w -1399578778
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 1484, -1391209317 -> 1236, 1343059435 -> 1280
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: getstatic Perryc.0 : I
    //   1286: ifle -> 1300
    //   1289: ldc2_w -1745893162
    //   1292: l2i
    //   1293: ldc_w -526214767
    //   1296: ixor
    //   1297: goto -> 1308
    //   1300: ldc2_w 505994686
    //   1303: l2i
    //   1304: ldc_w 346330939
    //   1307: ixor
    //   1308: ldc2_w 2014833457
    //   1311: l2i
    //   1312: ldc_w -713408774
    //   1315: ixor
    //   1316: ixor
    //   1317: lookupswitch default -> 1488, -1478385842 -> 1344, -635403124 -> 1300
    //   1344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1347: getstatic Perryc.0 : I
    //   1350: ifle -> 1364
    //   1353: ldc2_w -1922985277
    //   1356: l2i
    //   1357: ldc_w 1465751059
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w 1012402787
    //   1367: l2i
    //   1368: ldc_w -1082293079
    //   1371: ixor
    //   1372: ldc2_w 1152109138
    //   1375: l2i
    //   1376: ldc_w -734751458
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 1496, 331010438 -> 1408, 1252219804 -> 1364
    //   1408: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1411: getstatic Perryc.0 : I
    //   1414: ifle -> 1428
    //   1417: ldc2_w -828589803
    //   1420: l2i
    //   1421: ldc_w -1613315590
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w -1322630450
    //   1431: l2i
    //   1432: ldc_w 1690205854
    //   1435: ixor
    //   1436: ldc2_w -1512638719
    //   1439: l2i
    //   1440: ldc_w -36338923
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, -359084456 -> 1428, 155782395 -> 1520
    //   1472: putfield waterMarkY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1475: return
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
    //   1518: aconst_null
    //   1519: athrow
    //   1520: aconst_null
    //   1521: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1476	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Watermark;
  }
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.U(this, (int)1262688358L ^ 0xB99C823, paramRender2DEvent);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Watermark.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */