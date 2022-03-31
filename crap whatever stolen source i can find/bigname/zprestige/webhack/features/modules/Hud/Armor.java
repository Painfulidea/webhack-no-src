package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;

public class Armor extends Module {
  public int color;
  
  public Armor() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1592271528
    //   9: l2i
    //   10: ldc 1827716779
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -464638195
    //   19: l2i
    //   20: ldc 737099646
    //   22: ixor
    //   23: ldc2_w -1886485754
    //   26: l2i
    //   27: ldc -808971457
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 1918766138 -> 324, 1922122514 -> 16
    //   56: aload_0
    //   57: ldc '톂㌁퇼㶸鴊'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -1833304562
    //   68: l2i
    //   69: ldc 1731121983
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1367294282
    //   78: l2i
    //   79: ldc -1078597563
    //   81: ixor
    //   82: ldc2_w -798117755
    //   85: l2i
    //   86: ldc 1038674201
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 328, -55570577 -> 116, 403862701 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '톇㌚퇢㶧鴔㼞๠갥踣쇧楪ਪ᱌煳'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w -199012899
    //   130: l2i
    //   131: ldc -2141265032
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -1719813564
    //   140: l2i
    //   141: ldc 916196301
    //   143: ixor
    //   144: ldc2_w 1418217852
    //   147: l2i
    //   148: ldc 922498178
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 326, -845820809 -> 180, 369742683 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w 74431613
    //   192: l2i
    //   193: ldc -1842564223
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1636276029
    //   202: l2i
    //   203: ldc 1064622479
    //   205: ixor
    //   206: ldc2_w -929251151
    //   209: l2i
    //   210: ldc -438542012
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 330, -1941172039 -> 240, -1157386743 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1496853436
    //   246: l2i
    //   247: ldc 1496853437
    //   249: ixor
    //   250: ldc2_w 1432792215
    //   253: l2i
    //   254: ldc 1432792215
    //   256: ixor
    //   257: ldc2_w -239492837
    //   260: l2i
    //   261: ldc -239492837
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 1135652056
    //   273: l2i
    //   274: ldc -471267816
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -429284260
    //   283: l2i
    //   284: ldc 85570608
    //   286: ixor
    //   287: ldc2_w -1925241988
    //   290: l2i
    //   291: ldc -1715626917
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1260710425 -> 332, 338416302 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: return
    //   324: aconst_null
    //   325: athrow
    //   326: aconst_null
    //   327: athrow
    //   328: aconst_null
    //   329: athrow
    //   330: aconst_null
    //   331: athrow
    //   332: aconst_null
    //   333: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	324	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Armor;
  }
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.T(this, (int)-1549613809L ^ 0xAA4C60EB, paramRender2DEvent);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void renderArmorHUD(boolean percent) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 9347
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 9339
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 9331
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -1309606760
    //   33: l2i
    //   34: ldc 1870463726
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1904638731
    //   43: l2i
    //   44: ldc 1943472675
    //   46: ixor
    //   47: ldc2_w 893915007
    //   50: l2i
    //   51: ldc -915741661
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 9180, 25978250 -> 80, 581899562 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w 1770096332
    //   90: l2i
    //   91: ldc -2138161180
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 272512490
    //   100: l2i
    //   101: ldc -763567891
    //   103: ixor
    //   104: ldc2_w 1733507421
    //   107: l2i
    //   108: ldc 332803347
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1651856026 -> 9220, 1585418067 -> 97
    //   140: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   143: getstatic Perryc.c : I
    //   146: iflt -> 159
    //   149: ldc2_w 1838124769
    //   152: l2i
    //   153: ldc 1368855662
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1756645333
    //   162: l2i
    //   163: ldc -849125377
    //   165: ixor
    //   166: ldc2_w -1609164482
    //   169: l2i
    //   170: ldc -1898480160
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -982026795 -> 159, 316276305 -> 9168
    //   200: getfield scaledWidth : I
    //   203: getstatic Perryc.c : I
    //   206: iflt -> 219
    //   209: ldc2_w -189336829
    //   212: l2i
    //   213: ldc -1631337364
    //   215: ixor
    //   216: goto -> 226
    //   219: ldc2_w 761614518
    //   222: l2i
    //   223: ldc -136670507
    //   225: ixor
    //   226: ldc2_w 256629658
    //   229: l2i
    //   230: ldc -1822235659
    //   232: ixor
    //   233: ixor
    //   234: lookupswitch default -> 9318, -161739008 -> 219, 1184299532 -> 260
    //   260: istore_2
    //   261: getstatic Perryc.1 : I
    //   264: ifeq -> 277
    //   267: ldc2_w 2003877775
    //   270: l2i
    //   271: ldc 1624048906
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w -1606854851
    //   280: l2i
    //   281: ldc 287104177
    //   283: ixor
    //   284: ldc2_w 542312139
    //   287: l2i
    //   288: ldc 1584986445
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 9214, -821136374 -> 320, 1771455747 -> 277
    //   320: aload_0
    //   321: getstatic Perryc.c : I
    //   324: iflt -> 337
    //   327: ldc2_w -1103876710
    //   330: l2i
    //   331: ldc -1900982126
    //   333: ixor
    //   334: goto -> 344
    //   337: ldc2_w -1642634981
    //   340: l2i
    //   341: ldc -1100908442
    //   343: ixor
    //   344: ldc2_w -1477821502
    //   347: l2i
    //   348: ldc 1060723854
    //   350: ixor
    //   351: ixor
    //   352: lookupswitch default -> 9098, -1470752188 -> 337, -1197113807 -> 380
    //   380: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   383: getstatic Perryc.0 : I
    //   386: ifle -> 399
    //   389: ldc2_w 827653056
    //   392: l2i
    //   393: ldc 323434489
    //   395: ixor
    //   396: goto -> 406
    //   399: ldc2_w -850650077
    //   402: l2i
    //   403: ldc 391704600
    //   405: ixor
    //   406: ldc2_w -1297630064
    //   409: l2i
    //   410: ldc -45901787
    //   412: ixor
    //   413: ixor
    //   414: lookupswitch default -> 9172, -1779382130 -> 440, 1844963468 -> 399
    //   440: getfield scaledHeight : I
    //   443: getstatic Perryc.0 : I
    //   446: ifle -> 459
    //   449: ldc2_w -964097420
    //   452: l2i
    //   453: ldc 319465493
    //   455: ixor
    //   456: goto -> 466
    //   459: ldc2_w -387598403
    //   462: l2i
    //   463: ldc 2005024143
    //   465: ixor
    //   466: ldc2_w -58609441
    //   469: l2i
    //   470: ldc -865380462
    //   472: ixor
    //   473: ixor
    //   474: lookupswitch default -> 9128, -1349685889 -> 500, -446085844 -> 459
    //   500: istore_3
    //   501: getstatic Perryc.1 : I
    //   504: ifeq -> 517
    //   507: ldc2_w 501615377
    //   510: l2i
    //   511: ldc -598642696
    //   513: ixor
    //   514: goto -> 524
    //   517: ldc2_w -2050431934
    //   520: l2i
    //   521: ldc -1702495921
    //   523: ixor
    //   524: ldc2_w -222959759
    //   527: l2i
    //   528: ldc 299558100
    //   530: ixor
    //   531: ixor
    //   532: lookupswitch default -> 560, -338432941 -> 517, 584607564 -> 9146
    //   560: goto -> 564
    //   563: athrow
    //   564: invokestatic func_179098_w : ()V
    //   567: goto -> 571
    //   570: athrow
    //   571: getstatic Perryc.c : I
    //   574: iflt -> 587
    //   577: ldc2_w 165594815
    //   580: l2i
    //   581: ldc 712502401
    //   583: ixor
    //   584: goto -> 594
    //   587: ldc2_w -1077381944
    //   590: l2i
    //   591: ldc -1622328293
    //   593: ixor
    //   594: ldc2_w -2016819052
    //   597: l2i
    //   598: ldc 969435293
    //   600: ixor
    //   601: ixor
    //   602: lookupswitch default -> 9202, -1649898953 -> 587, -1635456806 -> 628
    //   628: iload_2
    //   629: ldc2_w -1757650313
    //   632: l2i
    //   633: ldc -1757650315
    //   635: ixor
    //   636: idiv
    //   637: getstatic Perryc.0 : I
    //   640: ifle -> 654
    //   643: ldc2_w 1284572714
    //   646: l2i
    //   647: ldc_w 479962696
    //   650: ixor
    //   651: goto -> 662
    //   654: ldc2_w -1445363256
    //   657: l2i
    //   658: ldc_w 781879763
    //   661: ixor
    //   662: ldc2_w -1777277874
    //   665: l2i
    //   666: ldc_w 582134522
    //   669: ixor
    //   670: ixor
    //   671: lookupswitch default -> 9126, -458690858 -> 654, 870401711 -> 696
    //   696: istore #4
    //   698: ldc2_w 491503642
    //   701: l2i
    //   702: ldc_w 491503642
    //   705: ixor
    //   706: getstatic Perryc.c : I
    //   709: iflt -> 723
    //   712: ldc2_w 1292970525
    //   715: l2i
    //   716: ldc_w 1548041816
    //   719: ixor
    //   720: goto -> 731
    //   723: ldc2_w 1263231525
    //   726: l2i
    //   727: ldc_w 1045688485
    //   730: ixor
    //   731: ldc2_w 177495119
    //   734: l2i
    //   735: ldc_w -1598737268
    //   738: ixor
    //   739: ixor
    //   740: lookupswitch default -> 9122, -1149928314 -> 723, -549848509 -> 768
    //   768: istore #5
    //   770: getstatic Perryc.0 : I
    //   773: ifle -> 787
    //   776: ldc2_w -1559124959
    //   779: l2i
    //   780: ldc_w 1545847637
    //   783: ixor
    //   784: goto -> 795
    //   787: ldc2_w -737803454
    //   790: l2i
    //   791: ldc_w 500808271
    //   794: ixor
    //   795: ldc2_w -2075894960
    //   798: l2i
    //   799: ldc_w -945947856
    //   802: ixor
    //   803: ixor
    //   804: lookupswitch default -> 832, -1125398764 -> 9282, -883971806 -> 787
    //   832: iload_3
    //   833: ldc2_w -829012970
    //   836: l2i
    //   837: ldc_w -829012959
    //   840: ixor
    //   841: isub
    //   842: getstatic Perryc.0 : I
    //   845: ifle -> 859
    //   848: ldc2_w 1863448859
    //   851: l2i
    //   852: ldc_w 1461487511
    //   855: ixor
    //   856: goto -> 867
    //   859: ldc2_w 884546436
    //   862: l2i
    //   863: ldc_w -1262494599
    //   866: ixor
    //   867: ldc2_w -1297790383
    //   870: l2i
    //   871: ldc_w 927219681
    //   874: ixor
    //   875: ixor
    //   876: lookupswitch default -> 9218, -1108604100 -> 859, 99070541 -> 904
    //   904: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   907: getstatic Perryc.c : I
    //   910: iflt -> 924
    //   913: ldc2_w -903738096
    //   916: l2i
    //   917: ldc_w 553666927
    //   920: ixor
    //   921: goto -> 932
    //   924: ldc2_w -1299942075
    //   927: l2i
    //   928: ldc_w 989631135
    //   931: ixor
    //   932: ldc2_w 920838536
    //   935: l2i
    //   936: ldc_w -1821638304
    //   939: ixor
    //   940: ixor
    //   941: lookupswitch default -> 9152, 771098418 -> 968, 1319937175 -> 924
    //   968: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   971: getstatic Perryc.1 : I
    //   974: ifeq -> 988
    //   977: ldc2_w 2129399505
    //   980: l2i
    //   981: ldc_w 1137473435
    //   984: ixor
    //   985: goto -> 996
    //   988: ldc2_w 881710798
    //   991: l2i
    //   992: ldc_w 210713395
    //   995: ixor
    //   996: ldc2_w 667971220
    //   999: l2i
    //   1000: ldc_w 1481169770
    //   1003: ixor
    //   1004: ixor
    //   1005: lookupswitch default -> 9084, 1119407284 -> 988, 1201297411 -> 1032
    //   1032: goto -> 1036
    //   1035: athrow
    //   1036: invokevirtual func_70090_H : ()Z
    //   1039: goto -> 1043
    //   1042: athrow
    //   1043: ifeq -> 1057
    //   1046: ldc2_w 392929
    //   1049: l2i
    //   1050: ldc_w 1459775429
    //   1053: ixor
    //   1054: goto -> 1065
    //   1057: ldc2_w 1353046895
    //   1060: l2i
    //   1061: ldc_w 128074314
    //   1064: ixor
    //   1065: ldc2_w -230273516
    //   1068: l2i
    //   1069: ldc_w 82917226
    //   1072: ixor
    //   1073: ixor
    //   1074: tableswitch default -> 1046, -1582243750 -> 1096, -1582243749 -> 1359
    //   1096: getstatic Perryc.1 : I
    //   1099: ifeq -> 1113
    //   1102: ldc2_w -547254367
    //   1105: l2i
    //   1106: ldc_w 421477190
    //   1109: ixor
    //   1110: goto -> 1121
    //   1113: ldc2_w 408784252
    //   1116: l2i
    //   1117: ldc_w -2117566261
    //   1120: ixor
    //   1121: ldc2_w 102091356
    //   1124: l2i
    //   1125: ldc_w 1237607045
    //   1128: ixor
    //   1129: ixor
    //   1130: lookupswitch default -> 9170, -1985012674 -> 1113, -700144274 -> 1156
    //   1156: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   1159: getstatic Perryc.0 : I
    //   1162: ifle -> 1176
    //   1165: ldc2_w 1576148357
    //   1168: l2i
    //   1169: ldc_w 1510183602
    //   1172: ixor
    //   1173: goto -> 1184
    //   1176: ldc2_w 241070163
    //   1179: l2i
    //   1180: ldc_w 906818097
    //   1183: ixor
    //   1184: ldc2_w -1144870474
    //   1187: l2i
    //   1188: ldc_w -1241976496
    //   1191: ixor
    //   1192: ixor
    //   1193: lookupswitch default -> 9320, 164354001 -> 1176, 912841348 -> 1220
    //   1220: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   1223: getstatic Perryc.c : I
    //   1226: iflt -> 1240
    //   1229: ldc2_w -2102831453
    //   1232: l2i
    //   1233: ldc_w -101919215
    //   1236: ixor
    //   1237: goto -> 1248
    //   1240: ldc2_w -1598360534
    //   1243: l2i
    //   1244: ldc_w -277520449
    //   1247: ixor
    //   1248: ldc2_w 1777380100
    //   1251: l2i
    //   1252: ldc_w -647041525
    //   1255: ixor
    //   1256: ixor
    //   1257: lookupswitch default -> 9230, -874789443 -> 1240, -11407718 -> 1284
    //   1284: goto -> 1288
    //   1287: athrow
    //   1288: invokevirtual func_78763_f : ()Z
    //   1291: goto -> 1295
    //   1294: athrow
    //   1295: ifeq -> 1309
    //   1298: ldc2_w -1581187787
    //   1301: l2i
    //   1302: ldc_w 532800223
    //   1305: ixor
    //   1306: goto -> 1317
    //   1309: ldc2_w -1638671313
    //   1312: l2i
    //   1313: ldc_w 542294980
    //   1316: ixor
    //   1317: ldc2_w -1911084635
    //   1320: l2i
    //   1321: ldc_w 76286209
    //   1324: ixor
    //   1325: ixor
    //   1326: tableswitch default -> 1298, 882523982 -> 1348, 882523983 -> 1359
    //   1348: ldc2_w -1858594494
    //   1351: l2i
    //   1352: ldc_w -1858594488
    //   1355: ixor
    //   1356: goto -> 1367
    //   1359: ldc2_w 474479870
    //   1362: l2i
    //   1363: ldc_w 474479870
    //   1366: ixor
    //   1367: isub
    //   1368: getstatic Perryc.1 : I
    //   1371: ifeq -> 1385
    //   1374: ldc2_w 1355012660
    //   1377: l2i
    //   1378: ldc_w 386470284
    //   1381: ixor
    //   1382: goto -> 1393
    //   1385: ldc2_w 663240090
    //   1388: l2i
    //   1389: ldc_w -1219755394
    //   1392: ixor
    //   1393: ldc2_w 1505090465
    //   1396: l2i
    //   1397: ldc_w -1798870588
    //   1400: ixor
    //   1401: ixor
    //   1402: lookupswitch default -> 9082, -1967621667 -> 1385, 1572244865 -> 1428
    //   1428: istore #6
    //   1430: getstatic Perryc.0 : I
    //   1433: ifle -> 1447
    //   1436: ldc2_w -1398871800
    //   1439: l2i
    //   1440: ldc_w -995596230
    //   1443: ixor
    //   1444: goto -> 1455
    //   1447: ldc2_w 610738833
    //   1450: l2i
    //   1451: ldc_w 2082875722
    //   1454: ixor
    //   1455: ldc2_w -62686855
    //   1458: l2i
    //   1459: ldc_w -2122307917
    //   1462: ixor
    //   1463: ixor
    //   1464: lookupswitch default -> 1492, -314619450 -> 1447, 368434936 -> 9266
    //   1492: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   1495: getstatic Perryc.c : I
    //   1498: iflt -> 1512
    //   1501: ldc2_w -724096855
    //   1504: l2i
    //   1505: ldc_w 1522992074
    //   1508: ixor
    //   1509: goto -> 1520
    //   1512: ldc2_w 1031714318
    //   1515: l2i
    //   1516: ldc_w -1704475906
    //   1519: ixor
    //   1520: ldc2_w -1488343476
    //   1523: l2i
    //   1524: ldc_w -1231384140
    //   1527: ixor
    //   1528: ixor
    //   1529: lookupswitch default -> 9302, -1614605157 -> 1512, -1228256504 -> 1556
    //   1556: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1559: getstatic Perryc.1 : I
    //   1562: ifeq -> 1576
    //   1565: ldc2_w -1378186992
    //   1568: l2i
    //   1569: ldc_w 222638224
    //   1572: ixor
    //   1573: goto -> 1584
    //   1576: ldc2_w -1892602485
    //   1579: l2i
    //   1580: ldc_w 751169551
    //   1583: ixor
    //   1584: ldc2_w -303807381
    //   1587: l2i
    //   1588: ldc_w 1727496308
    //   1591: ixor
    //   1592: ixor
    //   1593: lookupswitch default -> 1620, -1446306027 -> 1576, 730627487 -> 9088
    //   1620: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   1623: getstatic Perryc.c : I
    //   1626: iflt -> 1640
    //   1629: ldc2_w -553154281
    //   1632: l2i
    //   1633: ldc_w -2100771851
    //   1636: ixor
    //   1637: goto -> 1648
    //   1640: ldc2_w 2021356310
    //   1643: l2i
    //   1644: ldc_w 1744296262
    //   1647: ixor
    //   1648: ldc2_w 1847605177
    //   1651: l2i
    //   1652: ldc_w 1627029340
    //   1655: ixor
    //   1656: ixor
    //   1657: lookupswitch default -> 1684, -706268417 -> 1640, 1393885703 -> 9198
    //   1684: getfield field_70460_b : Lnet/minecraft/util/NonNullList;
    //   1687: getstatic Perryc.c : I
    //   1690: iflt -> 1704
    //   1693: ldc2_w 1438277478
    //   1696: l2i
    //   1697: ldc_w 1407942351
    //   1700: ixor
    //   1701: goto -> 1712
    //   1704: ldc2_w -1942808966
    //   1707: l2i
    //   1708: ldc_w 95479370
    //   1711: ixor
    //   1712: ldc2_w 1672978976
    //   1715: l2i
    //   1716: ldc_w 565218500
    //   1719: ixor
    //   1720: ixor
    //   1721: lookupswitch default -> 1748, -1545593560 -> 1704, 1146490701 -> 9176
    //   1748: goto -> 1752
    //   1751: athrow
    //   1752: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1755: goto -> 1759
    //   1758: athrow
    //   1759: getstatic Perryc.c : I
    //   1762: iflt -> 1776
    //   1765: ldc2_w -1895655267
    //   1768: l2i
    //   1769: ldc_w 2135511823
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w -221002413
    //   1779: l2i
    //   1780: ldc_w -169524910
    //   1783: ixor
    //   1784: ldc2_w -810908073
    //   1787: l2i
    //   1788: ldc_w -1590379313
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 1820, -1630146294 -> 9252, -1521385709 -> 1776
    //   1820: astore #7
    //   1822: getstatic Perryc.0 : I
    //   1825: ifle -> 1839
    //   1828: ldc2_w -651408612
    //   1831: l2i
    //   1832: ldc_w 580910449
    //   1835: ixor
    //   1836: goto -> 1847
    //   1839: ldc2_w -1974991912
    //   1842: l2i
    //   1843: ldc_w -501870227
    //   1846: ixor
    //   1847: ldc2_w 976626964
    //   1850: l2i
    //   1851: ldc_w 2110314169
    //   1854: ixor
    //   1855: ixor
    //   1856: lookupswitch default -> 1884, -1135786560 -> 9164, -311515120 -> 1839
    //   1884: aload #7
    //   1886: getstatic Perryc.c : I
    //   1889: iflt -> 1903
    //   1892: ldc2_w -512873300
    //   1895: l2i
    //   1896: ldc_w 1035112134
    //   1899: ixor
    //   1900: goto -> 1911
    //   1903: ldc2_w 1057818656
    //   1906: l2i
    //   1907: ldc_w -1471974340
    //   1910: ixor
    //   1911: ldc2_w -571331557
    //   1914: l2i
    //   1915: ldc_w -92238432
    //   1918: ixor
    //   1919: ixor
    //   1920: lookupswitch default -> 9276, -1338188377 -> 1948, -72481839 -> 1903
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokeinterface hasNext : ()Z
    //   1957: goto -> 1961
    //   1960: athrow
    //   1961: ifeq -> 1975
    //   1964: ldc2_w -1135929258
    //   1967: l2i
    //   1968: ldc_w -1442029102
    //   1971: ixor
    //   1972: goto -> 1983
    //   1975: ldc2_w 1720472229
    //   1978: l2i
    //   1979: ldc_w 1892363042
    //   1982: ixor
    //   1983: ldc2_w -374428277
    //   1986: l2i
    //   1987: ldc_w 1877666722
    //   1990: ixor
    //   1991: ixor
    //   1992: tableswitch default -> 1964, -1878835283 -> 2016, -1878835282 -> 8930
    //   2016: getstatic Perryc.c : I
    //   2019: iflt -> 2033
    //   2022: ldc2_w -1494587694
    //   2025: l2i
    //   2026: ldc_w 1454356973
    //   2029: ixor
    //   2030: goto -> 2041
    //   2033: ldc2_w 83803508
    //   2036: l2i
    //   2037: ldc_w -1991046525
    //   2040: ixor
    //   2041: ldc2_w 633993649
    //   2044: l2i
    //   2045: ldc_w 969601246
    //   2048: ixor
    //   2049: ixor
    //   2050: lookupswitch default -> 2076, -330901936 -> 9222, 1168517977 -> 2033
    //   2076: aload #7
    //   2078: getstatic Perryc.1 : I
    //   2081: ifeq -> 2095
    //   2084: ldc2_w -961549524
    //   2087: l2i
    //   2088: ldc_w 1497671861
    //   2091: ixor
    //   2092: goto -> 2103
    //   2095: ldc2_w -612985140
    //   2098: l2i
    //   2099: ldc_w 1394384725
    //   2102: ixor
    //   2103: ldc2_w -1264978537
    //   2106: l2i
    //   2107: ldc_w 1592967580
    //   2110: ixor
    //   2111: ixor
    //   2112: lookupswitch default -> 9232, 1644248466 -> 2140, 1971353490 -> 2095
    //   2140: goto -> 2144
    //   2143: athrow
    //   2144: invokeinterface next : ()Ljava/lang/Object;
    //   2149: goto -> 2153
    //   2152: athrow
    //   2153: checkcast net/minecraft/item/ItemStack
    //   2156: getstatic Perryc.c : I
    //   2159: iflt -> 2173
    //   2162: ldc2_w 1532236672
    //   2165: l2i
    //   2166: ldc_w -901424938
    //   2169: ixor
    //   2170: goto -> 2181
    //   2173: ldc2_w -1618416767
    //   2176: l2i
    //   2177: ldc_w -463724546
    //   2180: ixor
    //   2181: ldc2_w 747651263
    //   2184: l2i
    //   2185: ldc_w -1047838493
    //   2188: ixor
    //   2189: ixor
    //   2190: lookupswitch default -> 9280, -1764756445 -> 2216, 2081049354 -> 2173
    //   2216: astore #8
    //   2218: iinc #5, 1
    //   2221: getstatic Perryc.0 : I
    //   2224: ifle -> 2238
    //   2227: ldc2_w 1192109574
    //   2230: l2i
    //   2231: ldc_w -1907553841
    //   2234: ixor
    //   2235: goto -> 2246
    //   2238: ldc2_w 641818685
    //   2241: l2i
    //   2242: ldc_w 1268771573
    //   2245: ixor
    //   2246: ldc2_w -1087465992
    //   2249: l2i
    //   2250: ldc_w -1005639995
    //   2253: ixor
    //   2254: ixor
    //   2255: lookupswitch default -> 2280, -1302160140 -> 9234, 1953345941 -> 2238
    //   2280: aload #8
    //   2282: getstatic Perryc.0 : I
    //   2285: ifle -> 2299
    //   2288: ldc2_w -1496276745
    //   2291: l2i
    //   2292: ldc_w -1463299342
    //   2295: ixor
    //   2296: goto -> 2307
    //   2299: ldc2_w 835018168
    //   2302: l2i
    //   2303: ldc_w 477533925
    //   2306: ixor
    //   2307: ldc2_w -1604824308
    //   2310: l2i
    //   2311: ldc_w -958588959
    //   2314: ixor
    //   2315: ixor
    //   2316: lookupswitch default -> 2344, 1583170655 -> 2299, 1754412776 -> 9116
    //   2344: goto -> 2348
    //   2347: athrow
    //   2348: invokevirtual func_190926_b : ()Z
    //   2351: goto -> 2355
    //   2354: athrow
    //   2355: ifeq -> 2369
    //   2358: ldc2_w 1607524300
    //   2361: l2i
    //   2362: ldc_w -1958236649
    //   2365: ixor
    //   2366: goto -> 2377
    //   2369: ldc2_w -2096477416
    //   2372: l2i
    //   2373: ldc_w 1469921984
    //   2376: ixor
    //   2377: ldc2_w 1375964710
    //   2380: l2i
    //   2381: ldc_w -172658040
    //   2384: ixor
    //   2385: ixor
    //   2386: tableswitch default -> 2358, 1931578741 -> 2408, 1931578742 -> 2411
    //   2408: goto -> 1822
    //   2411: getstatic Perryc.c : I
    //   2414: iflt -> 2428
    //   2417: ldc2_w -1988847674
    //   2420: l2i
    //   2421: ldc_w -1923462888
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w -715705643
    //   2431: l2i
    //   2432: ldc_w -2043494754
    //   2435: ixor
    //   2436: ldc2_w -1318827391
    //   2439: l2i
    //   2440: ldc_w -1722545045
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 9178, 740202548 -> 2428, 2069220001 -> 2472
    //   2472: iload #4
    //   2474: ldc2_w 1311298706
    //   2477: l2i
    //   2478: ldc_w 1311298760
    //   2481: ixor
    //   2482: isub
    //   2483: ldc2_w 1022512734
    //   2486: l2i
    //   2487: ldc_w 1022512727
    //   2490: ixor
    //   2491: getstatic Perryc.1 : I
    //   2494: ifeq -> 2508
    //   2497: ldc2_w 144192300
    //   2500: l2i
    //   2501: ldc_w -1932154412
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -1798543315
    //   2511: l2i
    //   2512: ldc_w -175923080
    //   2515: ixor
    //   2516: ldc2_w -948113633
    //   2519: l2i
    //   2520: ldc_w -1064689715
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 9144, -2084869590 -> 2508, 1723414663 -> 2552
    //   2552: iload #5
    //   2554: isub
    //   2555: ldc2_w -1326663267
    //   2558: l2i
    //   2559: ldc_w -1326663287
    //   2562: ixor
    //   2563: imul
    //   2564: iadd
    //   2565: ldc2_w 445085140
    //   2568: l2i
    //   2569: ldc_w 445085142
    //   2572: ixor
    //   2573: iadd
    //   2574: getstatic Perryc.c : I
    //   2577: iflt -> 2591
    //   2580: ldc2_w -512959382
    //   2583: l2i
    //   2584: ldc_w 484682957
    //   2587: ixor
    //   2588: goto -> 2599
    //   2591: ldc2_w -1371800600
    //   2594: l2i
    //   2595: ldc_w 1476329728
    //   2598: ixor
    //   2599: ldc2_w -1098857901
    //   2602: l2i
    //   2603: ldc_w -1368219102
    //   2606: ixor
    //   2607: ixor
    //   2608: lookupswitch default -> 9104, -382297447 -> 2636, -310570794 -> 2591
    //   2636: istore #9
    //   2638: getstatic Perryc.c : I
    //   2641: iflt -> 2655
    //   2644: ldc2_w -283931721
    //   2647: l2i
    //   2648: ldc_w 1002258203
    //   2651: ixor
    //   2652: goto -> 2663
    //   2655: ldc2_w 517453712
    //   2658: l2i
    //   2659: ldc_w -852367254
    //   2662: ixor
    //   2663: ldc2_w 994403319
    //   2666: l2i
    //   2667: ldc_w -1670903163
    //   2670: ixor
    //   2671: ixor
    //   2672: lookupswitch default -> 2700, 1287537061 -> 2655, 1938021854 -> 9156
    //   2700: goto -> 2704
    //   2703: athrow
    //   2704: invokestatic func_179126_j : ()V
    //   2707: goto -> 2711
    //   2710: athrow
    //   2711: getstatic Perryc.0 : I
    //   2714: ifle -> 2728
    //   2717: ldc2_w -1709249100
    //   2720: l2i
    //   2721: ldc_w -178048069
    //   2724: ixor
    //   2725: goto -> 2736
    //   2728: ldc2_w -1799113126
    //   2731: l2i
    //   2732: ldc_w 1477180052
    //   2735: ixor
    //   2736: ldc2_w -1623846889
    //   2739: l2i
    //   2740: ldc_w -1212363265
    //   2743: ixor
    //   2744: ixor
    //   2745: lookupswitch default -> 9278, -465399514 -> 2772, 1207370727 -> 2728
    //   2772: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   2775: getstatic Perryc.c : I
    //   2778: iflt -> 2792
    //   2781: ldc2_w -1995767828
    //   2784: l2i
    //   2785: ldc_w -1150935214
    //   2788: ixor
    //   2789: goto -> 2800
    //   2792: ldc2_w 67698129
    //   2795: l2i
    //   2796: ldc_w -1234418423
    //   2799: ixor
    //   2800: ldc2_w -385312385
    //   2803: l2i
    //   2804: ldc_w -258199434
    //   2807: ixor
    //   2808: ixor
    //   2809: lookupswitch default -> 9264, -1410330159 -> 2836, 737692087 -> 2792
    //   2836: goto -> 2840
    //   2839: athrow
    //   2840: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   2843: goto -> 2847
    //   2846: athrow
    //   2847: ldc_w 0.48568293
    //   2850: invokestatic floatToIntBits : (F)I
    //   2853: ldc_w 2108730223
    //   2856: ixor
    //   2857: invokestatic intBitsToFloat : (I)F
    //   2860: getstatic Perryc.1 : I
    //   2863: ifeq -> 2877
    //   2866: ldc2_w -901598417
    //   2869: l2i
    //   2870: ldc_w 343798074
    //   2873: ixor
    //   2874: goto -> 2885
    //   2877: ldc2_w 1220713916
    //   2880: l2i
    //   2881: ldc_w -1299576002
    //   2884: ixor
    //   2885: ldc2_w 1065450153
    //   2888: l2i
    //   2889: ldc_w -2036734141
    //   2892: ixor
    //   2893: ixor
    //   2894: lookupswitch default -> 2920, 1730666495 -> 9284, 2009708139 -> 2877
    //   2920: putfield field_77023_b : F
    //   2923: getstatic Perryc.0 : I
    //   2926: ifle -> 2940
    //   2929: ldc2_w 1677531804
    //   2932: l2i
    //   2933: ldc_w 1587624947
    //   2936: ixor
    //   2937: goto -> 2948
    //   2940: ldc2_w 497161678
    //   2943: l2i
    //   2944: ldc_w 1553840433
    //   2947: ixor
    //   2948: ldc2_w -558717024
    //   2951: l2i
    //   2952: ldc_w 1774879285
    //   2955: ixor
    //   2956: ixor
    //   2957: lookupswitch default -> 9228, -1977350918 -> 2940, -163083926 -> 2984
    //   2984: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   2987: getstatic Perryc.0 : I
    //   2990: ifle -> 3004
    //   2993: ldc2_w -1236456997
    //   2996: l2i
    //   2997: ldc_w -2027497038
    //   3000: ixor
    //   3001: goto -> 3012
    //   3004: ldc2_w 660849856
    //   3007: l2i
    //   3008: ldc_w -1374913176
    //   3011: ixor
    //   3012: ldc2_w 751951554
    //   3015: l2i
    //   3016: ldc_w -1053570519
    //   3019: ixor
    //   3020: ixor
    //   3021: lookupswitch default -> 9138, -594942846 -> 3004, 1687006531 -> 3048
    //   3048: goto -> 3052
    //   3051: athrow
    //   3052: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   3055: goto -> 3059
    //   3058: athrow
    //   3059: getstatic Perryc.c : I
    //   3062: iflt -> 3076
    //   3065: ldc2_w -1035354887
    //   3068: l2i
    //   3069: ldc_w 944132838
    //   3072: ixor
    //   3073: goto -> 3084
    //   3076: ldc2_w -1729847004
    //   3079: l2i
    //   3080: ldc_w -1242713571
    //   3083: ixor
    //   3084: ldc2_w -740578271
    //   3087: l2i
    //   3088: ldc_w 987612267
    //   3091: ixor
    //   3092: ixor
    //   3093: lookupswitch default -> 9100, -1005618317 -> 3120, 319391317 -> 3076
    //   3120: aload #8
    //   3122: getstatic Perryc.1 : I
    //   3125: ifeq -> 3139
    //   3128: ldc2_w 1678453100
    //   3131: l2i
    //   3132: ldc_w -2031226274
    //   3135: ixor
    //   3136: goto -> 3147
    //   3139: ldc2_w -127103743
    //   3142: l2i
    //   3143: ldc_w 79906663
    //   3146: ixor
    //   3147: ldc2_w -1115840204
    //   3150: l2i
    //   3151: ldc_w -321269835
    //   3154: ixor
    //   3155: ixor
    //   3156: lookupswitch default -> 3184, -1287473741 -> 9080, 832663777 -> 3139
    //   3184: iload #9
    //   3186: getstatic Perryc.c : I
    //   3189: iflt -> 3203
    //   3192: ldc2_w 522276981
    //   3195: l2i
    //   3196: ldc_w 1759768118
    //   3199: ixor
    //   3200: goto -> 3211
    //   3203: ldc2_w -1744858120
    //   3206: l2i
    //   3207: ldc_w -2083097927
    //   3210: ixor
    //   3211: ldc2_w -742321685
    //   3214: l2i
    //   3215: ldc_w -906136045
    //   3218: ixor
    //   3219: ixor
    //   3220: lookupswitch default -> 9162, 236291769 -> 3248, 1845418427 -> 3203
    //   3248: iload #6
    //   3250: getstatic Perryc.1 : I
    //   3253: ifeq -> 3267
    //   3256: ldc2_w 589265266
    //   3259: l2i
    //   3260: ldc_w 1108105425
    //   3263: ixor
    //   3264: goto -> 3275
    //   3267: ldc2_w 804507069
    //   3270: l2i
    //   3271: ldc_w 1702230728
    //   3274: ixor
    //   3275: ldc2_w 685546037
    //   3278: l2i
    //   3279: ldc_w -577400104
    //   3282: ixor
    //   3283: ixor
    //   3284: lookupswitch default -> 3312, -1806030514 -> 9140, -312237491 -> 3267
    //   3312: goto -> 3316
    //   3315: athrow
    //   3316: invokevirtual func_180450_b : (Lnet/minecraft/item/ItemStack;II)V
    //   3319: goto -> 3323
    //   3322: athrow
    //   3323: getstatic Perryc.0 : I
    //   3326: ifle -> 3340
    //   3329: ldc2_w -1668342969
    //   3332: l2i
    //   3333: ldc_w -937806127
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w -1090062316
    //   3343: l2i
    //   3344: ldc_w -1653739706
    //   3347: ixor
    //   3348: ldc2_w -1939406725
    //   3351: l2i
    //   3352: ldc_w -1074697921
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 9132, 301825558 -> 3384, 1728267474 -> 3340
    //   3384: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   3387: getstatic Perryc.0 : I
    //   3390: ifle -> 3404
    //   3393: ldc2_w 1316928413
    //   3396: l2i
    //   3397: ldc_w 1895344086
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w -6564910
    //   3407: l2i
    //   3408: ldc_w -1485043577
    //   3411: ixor
    //   3412: ldc2_w -1255097821
    //   3415: l2i
    //   3416: ldc_w -176348334
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 9190, 413811236 -> 3448, 2127267130 -> 3404
    //   3448: goto -> 3452
    //   3451: athrow
    //   3452: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   3455: goto -> 3459
    //   3458: athrow
    //   3459: getstatic Perryc.0 : I
    //   3462: ifle -> 3476
    //   3465: ldc2_w -736633017
    //   3468: l2i
    //   3469: ldc_w -1818613162
    //   3472: ixor
    //   3473: goto -> 3484
    //   3476: ldc2_w -1843774159
    //   3479: l2i
    //   3480: ldc_w 267618653
    //   3483: ixor
    //   3484: ldc2_w -2099319951
    //   3487: l2i
    //   3488: ldc_w -1560121185
    //   3491: ixor
    //   3492: ixor
    //   3493: lookupswitch default -> 9078, -1137365118 -> 3520, 1716612863 -> 3476
    //   3520: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   3523: getstatic Perryc.c : I
    //   3526: iflt -> 3540
    //   3529: ldc2_w 709629344
    //   3532: l2i
    //   3533: ldc_w 317246418
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w 92435539
    //   3543: l2i
    //   3544: ldc_w -24013981
    //   3547: ixor
    //   3548: ldc2_w 1923494077
    //   3551: l2i
    //   3552: ldc_w -1076387335
    //   3555: ixor
    //   3556: ixor
    //   3557: lookupswitch default -> 9296, -170569930 -> 3540, 912422516 -> 3584
    //   3584: getfield field_71466_p : Lnet/minecraft/client/gui/FontRenderer;
    //   3587: getstatic Perryc.c : I
    //   3590: iflt -> 3604
    //   3593: ldc2_w 1032886653
    //   3596: l2i
    //   3597: ldc_w -708963476
    //   3600: ixor
    //   3601: goto -> 3612
    //   3604: ldc2_w -1953975740
    //   3607: l2i
    //   3608: ldc_w -888167256
    //   3611: ixor
    //   3612: ldc2_w 400423240
    //   3615: l2i
    //   3616: ldc_w 1640789746
    //   3619: ixor
    //   3620: ixor
    //   3621: lookupswitch default -> 3648, -1640036949 -> 9212, -772730605 -> 3604
    //   3648: aload #8
    //   3650: getstatic Perryc.0 : I
    //   3653: ifle -> 3667
    //   3656: ldc2_w -133430736
    //   3659: l2i
    //   3660: ldc_w -616362383
    //   3663: ixor
    //   3664: goto -> 3675
    //   3667: ldc2_w -1455626994
    //   3670: l2i
    //   3671: ldc_w 1280464814
    //   3674: ixor
    //   3675: ldc2_w -1631759291
    //   3678: l2i
    //   3679: ldc_w 2070868842
    //   3682: ixor
    //   3683: ixor
    //   3684: lookupswitch default -> 3712, -962811026 -> 9148, 397784133 -> 3667
    //   3712: iload #9
    //   3714: getstatic Perryc.0 : I
    //   3717: ifle -> 3731
    //   3720: ldc2_w 2082934222
    //   3723: l2i
    //   3724: ldc_w 1634141915
    //   3727: ixor
    //   3728: goto -> 3739
    //   3731: ldc2_w -1309739971
    //   3734: l2i
    //   3735: ldc_w 657468570
    //   3738: ixor
    //   3739: ldc2_w -1340607036
    //   3742: l2i
    //   3743: ldc_w -257016621
    //   3746: ixor
    //   3747: ixor
    //   3748: lookupswitch default -> 3776, 1576649218 -> 9166, 1691527838 -> 3731
    //   3776: iload #6
    //   3778: ldc_w ''
    //   3781: getstatic Perryc.c : I
    //   3784: iflt -> 3798
    //   3787: ldc2_w 1442065421
    //   3790: l2i
    //   3791: ldc_w -1151190089
    //   3794: ixor
    //   3795: goto -> 3806
    //   3798: ldc2_w -2093181438
    //   3801: l2i
    //   3802: ldc_w -1144310322
    //   3805: ixor
    //   3806: ldc2_w -1465609986
    //   3809: l2i
    //   3810: ldc_w 733885784
    //   3813: ixor
    //   3814: ixor
    //   3815: lookupswitch default -> 3840, -1316904792 -> 3798, 1837937180 -> 9306
    //   3840: goto -> 3844
    //   3843: athrow
    //   3844: invokevirtual func_180453_a : (Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V
    //   3847: goto -> 3851
    //   3850: athrow
    //   3851: getstatic Perryc.1 : I
    //   3854: ifeq -> 3868
    //   3857: ldc2_w 1426736723
    //   3860: l2i
    //   3861: ldc_w 532899601
    //   3864: ixor
    //   3865: goto -> 3876
    //   3868: ldc2_w -1012448539
    //   3871: l2i
    //   3872: ldc_w -423094214
    //   3875: ixor
    //   3876: ldc2_w 1544446751
    //   3879: l2i
    //   3880: ldc_w -713995592
    //   3883: ixor
    //   3884: ixor
    //   3885: lookupswitch default -> 9272, -1408208008 -> 3912, -1011480347 -> 3868
    //   3912: getstatic bigname/zprestige/webhack/features/modules/Hud/Armor.mc : Lnet/minecraft/client/Minecraft;
    //   3915: getstatic Perryc.c : I
    //   3918: iflt -> 3932
    //   3921: ldc2_w 1994294505
    //   3924: l2i
    //   3925: ldc_w 1891386444
    //   3928: ixor
    //   3929: goto -> 3940
    //   3932: ldc2_w 720405290
    //   3935: l2i
    //   3936: ldc_w 1361515889
    //   3939: ixor
    //   3940: ldc2_w 72021118
    //   3943: l2i
    //   3944: ldc_w 1155477661
    //   3947: ixor
    //   3948: ixor
    //   3949: lookupswitch default -> 3976, -175750687 -> 3932, 1190593606 -> 9246
    //   3976: goto -> 3980
    //   3979: athrow
    //   3980: invokevirtual func_175599_af : ()Lnet/minecraft/client/renderer/RenderItem;
    //   3983: goto -> 3987
    //   3986: athrow
    //   3987: ldc_w 1.6072269E38
    //   3990: invokestatic floatToIntBits : (F)I
    //   3993: ldc_w 2129777697
    //   3996: ixor
    //   3997: invokestatic intBitsToFloat : (I)F
    //   4000: getstatic Perryc.c : I
    //   4003: iflt -> 4017
    //   4006: ldc2_w 79729311
    //   4009: l2i
    //   4010: ldc_w 581680126
    //   4013: ixor
    //   4014: goto -> 4025
    //   4017: ldc2_w 628694863
    //   4020: l2i
    //   4021: ldc_w -642434115
    //   4024: ixor
    //   4025: ldc2_w 1677184855
    //   4028: l2i
    //   4029: ldc_w -545404588
    //   4032: ixor
    //   4033: ixor
    //   4034: lookupswitch default -> 9136, -1696518302 -> 4017, 1078338289 -> 4060
    //   4060: putfield field_77023_b : F
    //   4063: getstatic Perryc.c : I
    //   4066: iflt -> 4080
    //   4069: ldc2_w 818373157
    //   4072: l2i
    //   4073: ldc_w -248483710
    //   4076: ixor
    //   4077: goto -> 4088
    //   4080: ldc2_w 644352874
    //   4083: l2i
    //   4084: ldc_w -993247003
    //   4087: ixor
    //   4088: ldc2_w -2135892181
    //   4091: l2i
    //   4092: ldc_w -731691851
    //   4095: ixor
    //   4096: ixor
    //   4097: lookupswitch default -> 9154, -1792767687 -> 4080, -1233661935 -> 4124
    //   4124: goto -> 4128
    //   4127: athrow
    //   4128: invokestatic func_179098_w : ()V
    //   4131: goto -> 4135
    //   4134: athrow
    //   4135: getstatic Perryc.0 : I
    //   4138: ifle -> 4152
    //   4141: ldc2_w 1101619575
    //   4144: l2i
    //   4145: ldc_w 2028573703
    //   4148: ixor
    //   4149: goto -> 4160
    //   4152: ldc2_w -92838897
    //   4155: l2i
    //   4156: ldc_w 1412472363
    //   4159: ixor
    //   4160: ldc2_w 845917204
    //   4163: l2i
    //   4164: ldc_w -380641588
    //   4167: ixor
    //   4168: ixor
    //   4169: lookupswitch default -> 4196, -727779877 -> 4152, -496728152 -> 9236
    //   4196: goto -> 4200
    //   4199: athrow
    //   4200: invokestatic func_179140_f : ()V
    //   4203: goto -> 4207
    //   4206: athrow
    //   4207: getstatic Perryc.0 : I
    //   4210: ifle -> 4224
    //   4213: ldc2_w 2050841087
    //   4216: l2i
    //   4217: ldc_w 515636026
    //   4220: ixor
    //   4221: goto -> 4232
    //   4224: ldc2_w -1462445924
    //   4227: l2i
    //   4228: ldc_w 2130786694
    //   4231: ixor
    //   4232: ldc2_w -1473414856
    //   4235: l2i
    //   4236: ldc_w 1154180017
    //   4239: ixor
    //   4240: ixor
    //   4241: lookupswitch default -> 4268, -2006927284 -> 9206, -247374455 -> 4224
    //   4268: goto -> 4272
    //   4271: athrow
    //   4272: invokestatic func_179097_i : ()V
    //   4275: goto -> 4279
    //   4278: athrow
    //   4279: getstatic Perryc.1 : I
    //   4282: ifeq -> 4296
    //   4285: ldc2_w -2123735426
    //   4288: l2i
    //   4289: ldc_w 1038609307
    //   4292: ixor
    //   4293: goto -> 4304
    //   4296: ldc2_w -12005938
    //   4299: l2i
    //   4300: ldc_w 455309118
    //   4303: ixor
    //   4304: ldc2_w 1508017874
    //   4307: l2i
    //   4308: ldc_w 385850484
    //   4311: ixor
    //   4312: ixor
    //   4313: lookupswitch default -> 9096, -1418289066 -> 4340, -208621757 -> 4296
    //   4340: aload #8
    //   4342: getstatic Perryc.1 : I
    //   4345: ifeq -> 4359
    //   4348: ldc2_w 1788723483
    //   4351: l2i
    //   4352: ldc_w 799260819
    //   4355: ixor
    //   4356: goto -> 4367
    //   4359: ldc2_w -859272461
    //   4362: l2i
    //   4363: ldc_w -1249157457
    //   4366: ixor
    //   4367: ldc2_w -339843694
    //   4370: l2i
    //   4371: ldc_w 119621811
    //   4374: ixor
    //   4375: ixor
    //   4376: lookupswitch default -> 9200, -1780680323 -> 4404, -1449055063 -> 4359
    //   4404: goto -> 4408
    //   4407: athrow
    //   4408: invokevirtual func_190916_E : ()I
    //   4411: goto -> 4415
    //   4414: athrow
    //   4415: ldc2_w 1816777393
    //   4418: l2i
    //   4419: ldc_w 1816777392
    //   4422: ixor
    //   4423: if_icmple -> 4437
    //   4426: ldc2_w -1830277714
    //   4429: l2i
    //   4430: ldc_w 495740053
    //   4433: ixor
    //   4434: goto -> 4445
    //   4437: ldc2_w -1440316279
    //   4440: l2i
    //   4441: ldc_w 625134989
    //   4444: ixor
    //   4445: ldc2_w 1900172836
    //   4448: l2i
    //   4449: ldc_w 2051608000
    //   4452: ixor
    //   4453: ixor
    //   4454: tableswitch default -> 4426, -2073095457 -> 4476, -2073095456 -> 4910
    //   4476: new java/lang/StringBuilder
    //   4479: dup
    //   4480: getstatic Perryc.c : I
    //   4483: iflt -> 4497
    //   4486: ldc2_w 1691394299
    //   4489: l2i
    //   4490: ldc_w 2146824999
    //   4493: ixor
    //   4494: goto -> 4505
    //   4497: ldc2_w -1994865409
    //   4500: l2i
    //   4501: ldc_w -213580251
    //   4504: ixor
    //   4505: ldc2_w 503660514
    //   4508: l2i
    //   4509: ldc_w -1244141310
    //   4512: ixor
    //   4513: ixor
    //   4514: lookupswitch default -> 9314, -1325955780 -> 4497, -779152326 -> 4540
    //   4540: goto -> 4544
    //   4543: athrow
    //   4544: invokespecial <init> : ()V
    //   4547: goto -> 4551
    //   4550: athrow
    //   4551: getstatic Perryc.0 : I
    //   4554: ifle -> 4568
    //   4557: ldc2_w -1315354323
    //   4560: l2i
    //   4561: ldc_w 401163760
    //   4564: ixor
    //   4565: goto -> 4576
    //   4568: ldc2_w 464761379
    //   4571: l2i
    //   4572: ldc_w -1308824868
    //   4575: ixor
    //   4576: ldc2_w -2117261634
    //   4579: l2i
    //   4580: ldc_w 1835524070
    //   4583: ixor
    //   4584: ixor
    //   4585: lookupswitch default -> 9242, 1189454247 -> 4612, 1255863685 -> 4568
    //   4612: aload #8
    //   4614: getstatic Perryc.0 : I
    //   4617: ifle -> 4631
    //   4620: ldc2_w 198563796
    //   4623: l2i
    //   4624: ldc_w -357760540
    //   4627: ixor
    //   4628: goto -> 4639
    //   4631: ldc2_w -43818504
    //   4634: l2i
    //   4635: ldc_w -1360167234
    //   4638: ixor
    //   4639: ldc2_w 1196132572
    //   4642: l2i
    //   4643: ldc_w 890354364
    //   4646: ixor
    //   4647: ixor
    //   4648: lookupswitch default -> 9244, -1826429872 -> 4631, 567553318 -> 4676
    //   4676: goto -> 4680
    //   4679: athrow
    //   4680: invokevirtual func_190916_E : ()I
    //   4683: goto -> 4687
    //   4686: athrow
    //   4687: getstatic Perryc.0 : I
    //   4690: ifle -> 4704
    //   4693: ldc2_w 627282184
    //   4696: l2i
    //   4697: ldc_w 313982071
    //   4700: ixor
    //   4701: goto -> 4712
    //   4704: ldc2_w 33563365
    //   4707: l2i
    //   4708: ldc_w 1536510366
    //   4711: ixor
    //   4712: ldc2_w 1162640426
    //   4715: l2i
    //   4716: ldc_w 603638662
    //   4719: ixor
    //   4720: ixor
    //   4721: lookupswitch default -> 9300, 1059314903 -> 4748, 1365498579 -> 4704
    //   4748: goto -> 4752
    //   4751: athrow
    //   4752: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4755: goto -> 4759
    //   4758: athrow
    //   4759: ldc_w ''
    //   4762: getstatic Perryc.c : I
    //   4765: iflt -> 4779
    //   4768: ldc2_w 1409279162
    //   4771: l2i
    //   4772: ldc_w -1966816791
    //   4775: ixor
    //   4776: goto -> 4787
    //   4779: ldc2_w 950808553
    //   4782: l2i
    //   4783: ldc_w -256379291
    //   4786: ixor
    //   4787: ldc2_w -648507223
    //   4790: l2i
    //   4791: ldc_w -683594442
    //   4794: ixor
    //   4795: ixor
    //   4796: lookupswitch default -> 4824, -1710750287 -> 4779, -685598516 -> 9256
    //   4824: goto -> 4828
    //   4827: athrow
    //   4828: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4831: goto -> 4835
    //   4834: athrow
    //   4835: getstatic Perryc.c : I
    //   4838: iflt -> 4852
    //   4841: ldc2_w -1622762100
    //   4844: l2i
    //   4845: ldc_w 1892783550
    //   4848: ixor
    //   4849: goto -> 4860
    //   4852: ldc2_w 1734665756
    //   4855: l2i
    //   4856: ldc_w -1444029737
    //   4859: ixor
    //   4860: ldc2_w -2049935623
    //   4863: l2i
    //   4864: ldc_w 1597107413
    //   4867: ixor
    //   4868: ixor
    //   4869: lookupswitch default -> 9102, 342402791 -> 4896, 896963102 -> 4852
    //   4896: goto -> 4900
    //   4899: athrow
    //   4900: invokevirtual toString : ()Ljava/lang/String;
    //   4903: goto -> 4907
    //   4906: athrow
    //   4907: goto -> 4913
    //   4910: ldc_w ''
    //   4913: getstatic Perryc.0 : I
    //   4916: ifle -> 4930
    //   4919: ldc2_w -1470726071
    //   4922: l2i
    //   4923: ldc_w 2130881139
    //   4926: ixor
    //   4927: goto -> 4938
    //   4930: ldc2_w -1189406692
    //   4933: l2i
    //   4934: ldc_w 648810986
    //   4937: ixor
    //   4938: ldc2_w 1199139565
    //   4941: l2i
    //   4942: ldc_w -2008384109
    //   4945: ixor
    //   4946: ixor
    //   4947: lookupswitch default -> 9304, 409419076 -> 4930, 1350835848 -> 4972
    //   4972: astore #10
    //   4974: getstatic Perryc.1 : I
    //   4977: ifeq -> 4991
    //   4980: ldc2_w -1856261879
    //   4983: l2i
    //   4984: ldc_w 1789399454
    //   4987: ixor
    //   4988: goto -> 4999
    //   4991: ldc2_w 2092096043
    //   4994: l2i
    //   4995: ldc_w -3316728
    //   4998: ixor
    //   4999: ldc2_w -1719124768
    //   5002: l2i
    //   5003: ldc_w 1554427517
    //   5006: ixor
    //   5007: ixor
    //   5008: lookupswitch default -> 5036, 1054683658 -> 9094, 1271566015 -> 4991
    //   5036: aload_0
    //   5037: getstatic Perryc.0 : I
    //   5040: ifle -> 5054
    //   5043: ldc2_w 313627599
    //   5046: l2i
    //   5047: ldc_w 1999398560
    //   5050: ixor
    //   5051: goto -> 5062
    //   5054: ldc2_w -569189765
    //   5057: l2i
    //   5058: ldc_w 1025036208
    //   5061: ixor
    //   5062: ldc2_w -365988089
    //   5065: l2i
    //   5066: ldc_w 1907719861
    //   5069: ixor
    //   5070: ixor
    //   5071: lookupswitch default -> 9208, -33030947 -> 5054, 2022710393 -> 5096
    //   5096: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   5099: getstatic Perryc.1 : I
    //   5102: ifeq -> 5116
    //   5105: ldc2_w 1975500998
    //   5108: l2i
    //   5109: ldc_w -475881495
    //   5112: ixor
    //   5113: goto -> 5124
    //   5116: ldc2_w 1741776541
    //   5119: l2i
    //   5120: ldc_w 48771883
    //   5123: ixor
    //   5124: ldc2_w -619679497
    //   5127: l2i
    //   5128: ldc_w -1485155841
    //   5131: ixor
    //   5132: ixor
    //   5133: lookupswitch default -> 5160, -1148354295 -> 5116, -361267673 -> 9182
    //   5160: aload #10
    //   5162: getstatic Perryc.1 : I
    //   5165: ifeq -> 5179
    //   5168: ldc2_w -479229041
    //   5171: l2i
    //   5172: ldc_w -229944092
    //   5175: ixor
    //   5176: goto -> 5187
    //   5179: ldc2_w -1719202449
    //   5182: l2i
    //   5183: ldc_w 558350656
    //   5186: ixor
    //   5187: ldc2_w -2087559624
    //   5190: l2i
    //   5191: ldc_w -1802462449
    //   5194: ixor
    //   5195: ixor
    //   5196: lookupswitch default -> 9114, -1346238184 -> 5224, 103160412 -> 5179
    //   5224: iload #9
    //   5226: ldc2_w -1506542732
    //   5229: l2i
    //   5230: ldc_w -1506542745
    //   5233: ixor
    //   5234: iadd
    //   5235: ldc2_w -1039890588
    //   5238: l2i
    //   5239: ldc_w -1039890586
    //   5242: ixor
    //   5243: isub
    //   5244: getstatic Perryc.c : I
    //   5247: iflt -> 5261
    //   5250: ldc2_w -422559850
    //   5253: l2i
    //   5254: ldc_w -1897873178
    //   5257: ixor
    //   5258: goto -> 5269
    //   5261: ldc2_w -1422053855
    //   5264: l2i
    //   5265: ldc_w -836625490
    //   5268: ixor
    //   5269: ldc2_w -346058857
    //   5272: l2i
    //   5273: ldc_w -1349637426
    //   5276: ixor
    //   5277: ixor
    //   5278: lookupswitch default -> 9286, 567185622 -> 5304, 752966185 -> 5261
    //   5304: aload_0
    //   5305: getstatic Perryc.0 : I
    //   5308: ifle -> 5322
    //   5311: ldc2_w -505490265
    //   5314: l2i
    //   5315: ldc_w -1193851218
    //   5318: ixor
    //   5319: goto -> 5330
    //   5322: ldc2_w -680542388
    //   5325: l2i
    //   5326: ldc_w 505474871
    //   5329: ixor
    //   5330: ldc2_w -1669527315
    //   5333: l2i
    //   5334: ldc_w 1051042625
    //   5337: ixor
    //   5338: ixor
    //   5339: lookupswitch default -> 9274, -70174299 -> 5322, 1805122519 -> 5364
    //   5364: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   5367: getstatic Perryc.0 : I
    //   5370: ifle -> 5384
    //   5373: ldc2_w 1897575119
    //   5376: l2i
    //   5377: ldc_w 866174412
    //   5380: ixor
    //   5381: goto -> 5392
    //   5384: ldc2_w -2130270396
    //   5387: l2i
    //   5388: ldc_w 1063595567
    //   5391: ixor
    //   5392: ldc2_w -786336596
    //   5395: l2i
    //   5396: ldc_w 912436201
    //   5399: ixor
    //   5400: ixor
    //   5401: lookupswitch default -> 5428, -1510365114 -> 9216, 1546152488 -> 5384
    //   5428: aload #10
    //   5430: getstatic Perryc.c : I
    //   5433: iflt -> 5447
    //   5436: ldc2_w 122106083
    //   5439: l2i
    //   5440: ldc_w -575495047
    //   5443: ixor
    //   5444: goto -> 5455
    //   5447: ldc2_w 1779012986
    //   5450: l2i
    //   5451: ldc_w -156539456
    //   5454: ixor
    //   5455: ldc2_w -99549595
    //   5458: l2i
    //   5459: ldc_w 32055918
    //   5462: ixor
    //   5463: ixor
    //   5464: lookupswitch default -> 5492, -732243034 -> 5447, 554453137 -> 9226
    //   5492: goto -> 5496
    //   5495: athrow
    //   5496: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   5499: goto -> 5503
    //   5502: athrow
    //   5503: isub
    //   5504: i2f
    //   5505: getstatic Perryc.c : I
    //   5508: iflt -> 5522
    //   5511: ldc2_w 1668022123
    //   5514: l2i
    //   5515: ldc_w 1192499613
    //   5518: ixor
    //   5519: goto -> 5530
    //   5522: ldc2_w 1506028485
    //   5525: l2i
    //   5526: ldc_w 112486295
    //   5529: ixor
    //   5530: ldc2_w 1885988550
    //   5533: l2i
    //   5534: ldc_w -433074620
    //   5537: ixor
    //   5538: ixor
    //   5539: lookupswitch default -> 5564, -1304834444 -> 9258, 1130719830 -> 5522
    //   5564: iload #6
    //   5566: ldc2_w 1235068805
    //   5569: l2i
    //   5570: ldc_w 1235068812
    //   5573: ixor
    //   5574: iadd
    //   5575: i2f
    //   5576: ldc2_w -1617650008
    //   5579: l2i
    //   5580: ldc_w -1620352681
    //   5583: ixor
    //   5584: getstatic Perryc.0 : I
    //   5587: ifle -> 5601
    //   5590: ldc2_w -1724758094
    //   5593: l2i
    //   5594: ldc_w -1738154922
    //   5597: ixor
    //   5598: goto -> 5609
    //   5601: ldc2_w 1851684162
    //   5604: l2i
    //   5605: ldc_w 949377106
    //   5608: ixor
    //   5609: ldc2_w 314655120
    //   5612: l2i
    //   5613: ldc_w -29583245
    //   5616: ixor
    //   5617: ixor
    //   5618: lookupswitch default -> 5644, -307609081 -> 9090, 984497337 -> 5601
    //   5644: goto -> 5648
    //   5647: athrow
    //   5648: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   5651: goto -> 5655
    //   5654: athrow
    //   5655: getstatic Perryc.0 : I
    //   5658: ifle -> 5672
    //   5661: ldc2_w -2144706713
    //   5664: l2i
    //   5665: ldc_w 2126596914
    //   5668: ixor
    //   5669: goto -> 5680
    //   5672: ldc2_w 227533290
    //   5675: l2i
    //   5676: ldc_w -733235626
    //   5679: ixor
    //   5680: ldc2_w 1526042634
    //   5683: l2i
    //   5684: ldc_w 1336596718
    //   5687: ixor
    //   5688: ixor
    //   5689: lookupswitch default -> 9268, -862249128 -> 5716, -340501327 -> 5672
    //   5716: iload_1
    //   5717: ifne -> 5731
    //   5720: ldc2_w -1313151996
    //   5723: l2i
    //   5724: ldc_w -983689619
    //   5727: ixor
    //   5728: goto -> 5739
    //   5731: ldc2_w -879165479
    //   5734: l2i
    //   5735: ldc_w -1082389069
    //   5738: ixor
    //   5739: ldc2_w -233159955
    //   5742: l2i
    //   5743: ldc_w -210768443
    //   5746: ixor
    //   5747: ixor
    //   5748: tableswitch default -> 5720, 1972460865 -> 5772, 1972460866 -> 5775
    //   5772: goto -> 1822
    //   5775: ldc2_w -167580978
    //   5778: l2i
    //   5779: ldc_w -167580978
    //   5782: ixor
    //   5783: getstatic Perryc.c : I
    //   5786: iflt -> 5800
    //   5789: ldc2_w -1248514452
    //   5792: l2i
    //   5793: ldc_w -638211564
    //   5796: ixor
    //   5797: goto -> 5808
    //   5800: ldc2_w -995619078
    //   5803: l2i
    //   5804: ldc_w 1608028140
    //   5807: ixor
    //   5808: ldc2_w -1449407075
    //   5811: l2i
    //   5812: ldc_w 1901830329
    //   5815: ixor
    //   5816: ixor
    //   5817: lookupswitch default -> 5844, -1264522916 -> 9238, 2094063019 -> 5800
    //   5844: istore #11
    //   5846: getstatic Perryc.0 : I
    //   5849: ifle -> 5863
    //   5852: ldc2_w -2091727686
    //   5855: l2i
    //   5856: ldc_w -1054014763
    //   5859: ixor
    //   5860: goto -> 5871
    //   5863: ldc2_w -935176777
    //   5866: l2i
    //   5867: ldc_w 1525254102
    //   5870: ixor
    //   5871: ldc2_w 532905483
    //   5874: l2i
    //   5875: ldc_w -51943579
    //   5878: ixor
    //   5879: ixor
    //   5880: lookupswitch default -> 5908, -2127488720 -> 5863, -1587814655 -> 9248
    //   5908: aload #8
    //   5910: getstatic Perryc.0 : I
    //   5913: ifle -> 5927
    //   5916: ldc2_w 202312569
    //   5919: l2i
    //   5920: ldc_w -913225965
    //   5923: ixor
    //   5924: goto -> 5935
    //   5927: ldc2_w 1249385532
    //   5930: l2i
    //   5931: ldc_w 2012161083
    //   5934: ixor
    //   5935: ldc2_w -661413746
    //   5938: l2i
    //   5939: ldc_w -1974277285
    //   5942: ixor
    //   5943: ixor
    //   5944: lookupswitch default -> 9310, -1755379777 -> 5927, 1867936722 -> 5972
    //   5972: goto -> 5976
    //   5975: athrow
    //   5976: invokevirtual func_77958_k : ()I
    //   5979: goto -> 5983
    //   5982: athrow
    //   5983: i2f
    //   5984: getstatic Perryc.c : I
    //   5987: iflt -> 6001
    //   5990: ldc2_w -932562763
    //   5993: l2i
    //   5994: ldc_w 728321130
    //   5997: ixor
    //   5998: goto -> 6009
    //   6001: ldc2_w -1420349703
    //   6004: l2i
    //   6005: ldc_w -849335383
    //   6008: ixor
    //   6009: ldc2_w -846718645
    //   6012: l2i
    //   6013: ldc_w 2046065393
    //   6016: ixor
    //   6017: ixor
    //   6018: lookupswitch default -> 9106, -766810390 -> 6044, 1467946853 -> 6001
    //   6044: aload #8
    //   6046: getstatic Perryc.c : I
    //   6049: iflt -> 6063
    //   6052: ldc2_w 96990535
    //   6055: l2i
    //   6056: ldc_w -141525068
    //   6059: ixor
    //   6060: goto -> 6071
    //   6063: ldc2_w 1851177169
    //   6066: l2i
    //   6067: ldc_w -422951689
    //   6070: ixor
    //   6071: ldc2_w 704471852
    //   6074: l2i
    //   6075: ldc_w 89161132
    //   6078: ixor
    //   6079: ixor
    //   6080: lookupswitch default -> 6108, -1182182547 -> 6063, -554003341 -> 9112
    //   6108: goto -> 6112
    //   6111: athrow
    //   6112: invokevirtual func_77952_i : ()I
    //   6115: goto -> 6119
    //   6118: athrow
    //   6119: i2f
    //   6120: fsub
    //   6121: getstatic Perryc.1 : I
    //   6124: ifeq -> 6138
    //   6127: ldc2_w 1594977534
    //   6130: l2i
    //   6131: ldc_w -1954081466
    //   6134: ixor
    //   6135: goto -> 6146
    //   6138: ldc2_w -1470737809
    //   6141: l2i
    //   6142: ldc_w -2107761161
    //   6145: ixor
    //   6146: ldc2_w -327891030
    //   6149: l2i
    //   6150: ldc_w 296196979
    //   6153: ixor
    //   6154: ixor
    //   6155: lookupswitch default -> 9240, -673508543 -> 6180, 692397409 -> 6138
    //   6180: aload #8
    //   6182: getstatic Perryc.0 : I
    //   6185: ifle -> 6199
    //   6188: ldc2_w 2070030249
    //   6191: l2i
    //   6192: ldc_w 190196558
    //   6195: ixor
    //   6196: goto -> 6207
    //   6199: ldc2_w -1255958572
    //   6202: l2i
    //   6203: ldc_w -338456642
    //   6206: ixor
    //   6207: ldc2_w 468356440
    //   6210: l2i
    //   6211: ldc_w 1280082494
    //   6214: ixor
    //   6215: ixor
    //   6216: lookupswitch default -> 6244, 663880577 -> 9076, 1010658430 -> 6199
    //   6244: goto -> 6248
    //   6247: athrow
    //   6248: invokevirtual func_77958_k : ()I
    //   6251: goto -> 6255
    //   6254: athrow
    //   6255: i2f
    //   6256: fdiv
    //   6257: getstatic Perryc.1 : I
    //   6260: ifeq -> 6274
    //   6263: ldc2_w -956350434
    //   6266: l2i
    //   6267: ldc_w 19994965
    //   6270: ixor
    //   6271: goto -> 6282
    //   6274: ldc2_w -1350157818
    //   6277: l2i
    //   6278: ldc_w -364072486
    //   6281: ixor
    //   6282: ldc2_w -49989852
    //   6285: l2i
    //   6286: ldc_w -763266074
    //   6289: ixor
    //   6290: ixor
    //   6291: lookupswitch default -> 9108, -397798007 -> 6274, 1783547678 -> 6316
    //   6316: fstore #12
    //   6318: ldc_w 226.19969
    //   6321: invokestatic floatToIntBits : (F)I
    //   6324: ldc_w 2095199007
    //   6327: ixor
    //   6328: invokestatic intBitsToFloat : (I)F
    //   6331: getstatic Perryc.c : I
    //   6334: iflt -> 6348
    //   6337: ldc2_w -616713564
    //   6340: l2i
    //   6341: ldc_w 1001254647
    //   6344: ixor
    //   6345: goto -> 6356
    //   6348: ldc2_w 196728141
    //   6351: l2i
    //   6352: ldc_w -1396332427
    //   6355: ixor
    //   6356: ldc2_w -2064424782
    //   6359: l2i
    //   6360: ldc_w 623390969
    //   6363: ixor
    //   6364: ixor
    //   6365: lookupswitch default -> 9142, 111619443 -> 6392, 1095437336 -> 6348
    //   6392: fload #12
    //   6394: fsub
    //   6395: getstatic Perryc.1 : I
    //   6398: ifeq -> 6412
    //   6401: ldc2_w 87673139
    //   6404: l2i
    //   6405: ldc_w 1755185239
    //   6408: ixor
    //   6409: goto -> 6420
    //   6412: ldc2_w -1992637436
    //   6415: l2i
    //   6416: ldc_w 1149119891
    //   6419: ixor
    //   6420: ldc2_w -173280913
    //   6423: l2i
    //   6424: ldc_w -304130065
    //   6427: ixor
    //   6428: ixor
    //   6429: lookupswitch default -> 6456, -2083408750 -> 6412, 1976791012 -> 9292
    //   6456: fstore #13
    //   6458: ldc2_w -631161277
    //   6461: l2i
    //   6462: ldc_w -631161305
    //   6465: ixor
    //   6466: getstatic Perryc.c : I
    //   6469: iflt -> 6483
    //   6472: ldc2_w 1671449474
    //   6475: l2i
    //   6476: ldc_w 1224271480
    //   6479: ixor
    //   6480: goto -> 6491
    //   6483: ldc2_w -356140486
    //   6486: l2i
    //   6487: ldc_w 530832186
    //   6490: ixor
    //   6491: ldc2_w 149189660
    //   6494: l2i
    //   6495: ldc_w 1377016985
    //   6498: ixor
    //   6499: ixor
    //   6500: lookupswitch default -> 6528, -774861264 -> 6483, 1907311999 -> 9120
    //   6528: fload #13
    //   6530: ldc_w 0.013945187
    //   6533: invokestatic floatToIntBits : (F)I
    //   6536: ldc_w 2125232731
    //   6539: ixor
    //   6540: invokestatic intBitsToFloat : (I)F
    //   6543: fmul
    //   6544: f2i
    //   6545: isub
    //   6546: getstatic Perryc.1 : I
    //   6549: ifeq -> 6563
    //   6552: ldc2_w 1855246088
    //   6555: l2i
    //   6556: ldc_w 915831443
    //   6559: ixor
    //   6560: goto -> 6571
    //   6563: ldc2_w -1041130361
    //   6566: l2i
    //   6567: ldc_w -982149834
    //   6570: ixor
    //   6571: ldc2_w 1277715524
    //   6574: l2i
    //   6575: ldc_w -1924240798
    //   6578: ixor
    //   6579: ixor
    //   6580: lookupswitch default -> 6608, -1721451587 -> 9288, -280085711 -> 6563
    //   6608: istore #11
    //   6610: getstatic Perryc.c : I
    //   6613: iflt -> 6627
    //   6616: ldc2_w -1936748885
    //   6619: l2i
    //   6620: ldc_w 1482548597
    //   6623: ixor
    //   6624: goto -> 6635
    //   6627: ldc2_w 1492421248
    //   6630: l2i
    //   6631: ldc_w 2004316646
    //   6634: ixor
    //   6635: ldc2_w 1459144666
    //   6638: l2i
    //   6639: ldc_w 1017087683
    //   6642: ixor
    //   6643: ixor
    //   6644: lookupswitch default -> 6672, -1095423289 -> 9130, 1233106874 -> 6627
    //   6672: fload #13
    //   6674: ldc_w 5.221455
    //   6677: invokestatic floatToIntBits : (F)I
    //   6680: ldc_w 2133268009
    //   6683: ixor
    //   6684: invokestatic intBitsToFloat : (I)F
    //   6687: fcmpl
    //   6688: ifle -> 6702
    //   6691: ldc2_w -310197004
    //   6694: l2i
    //   6695: ldc_w 1423839500
    //   6698: ixor
    //   6699: goto -> 6710
    //   6702: ldc2_w -1928175545
    //   6705: l2i
    //   6706: ldc_w 877573564
    //   6709: ixor
    //   6710: ldc2_w -1320234937
    //   6713: l2i
    //   6714: ldc_w 1002740666
    //   6717: ixor
    //   6718: ixor
    //   6719: tableswitch default -> 6691, 869703173 -> 6740, 869703174 -> 6814
    //   6740: ldc_w 29.476187
    //   6743: invokestatic floatToIntBits : (F)I
    //   6746: ldc_w 2120994619
    //   6749: ixor
    //   6750: invokestatic intBitsToFloat : (I)F
    //   6753: getstatic Perryc.0 : I
    //   6756: ifle -> 6770
    //   6759: ldc2_w 558681841
    //   6762: l2i
    //   6763: ldc_w 1777698192
    //   6766: ixor
    //   6767: goto -> 6778
    //   6770: ldc2_w -125669253
    //   6773: l2i
    //   6774: ldc_w 2085150411
    //   6777: ixor
    //   6778: ldc2_w 1822409611
    //   6781: l2i
    //   6782: ldc_w -1045419911
    //   6785: ixor
    //   6786: ixor
    //   6787: lookupswitch default -> 6812, -443113325 -> 9150, 1369410383 -> 6770
    //   6812: fstore #13
    //   6814: getstatic Perryc.c : I
    //   6817: iflt -> 6831
    //   6820: ldc2_w 1377493902
    //   6823: l2i
    //   6824: ldc_w 179661924
    //   6827: ixor
    //   6828: goto -> 6839
    //   6831: ldc2_w 178651045
    //   6834: l2i
    //   6835: ldc_w -1542123266
    //   6838: ixor
    //   6839: ldc2_w -719115884
    //   6842: l2i
    //   6843: ldc_w -1904576271
    //   6846: ixor
    //   6847: ixor
    //   6848: lookupswitch default -> 6876, -2091235072 -> 6831, 66510479 -> 9124
    //   6876: fload #12
    //   6878: ldc_w 11.790383
    //   6881: invokestatic floatToIntBits : (F)I
    //   6884: ldc_w 2126292329
    //   6887: ixor
    //   6888: invokestatic intBitsToFloat : (I)F
    //   6891: fcmpl
    //   6892: ifle -> 6906
    //   6895: ldc2_w -2130639676
    //   6898: l2i
    //   6899: ldc_w 694769577
    //   6902: ixor
    //   6903: goto -> 6914
    //   6906: ldc2_w -339552267
    //   6909: l2i
    //   6910: ldc_w 1135248539
    //   6913: ixor
    //   6914: ldc2_w 13515839
    //   6917: l2i
    //   6918: ldc_w -198616301
    //   6921: ixor
    //   6922: ixor
    //   6923: tableswitch default -> 6895, 1552888897 -> 6944, 1552888898 -> 7018
    //   6944: ldc_w 13.2088995
    //   6947: invokestatic floatToIntBits : (F)I
    //   6950: ldc_w 2127779751
    //   6953: ixor
    //   6954: invokestatic intBitsToFloat : (I)F
    //   6957: getstatic Perryc.0 : I
    //   6960: ifle -> 6974
    //   6963: ldc2_w -1531355757
    //   6966: l2i
    //   6967: ldc_w 1667866153
    //   6970: ixor
    //   6971: goto -> 6982
    //   6974: ldc2_w 1607037673
    //   6977: l2i
    //   6978: ldc_w -679400874
    //   6981: ixor
    //   6982: ldc2_w -563371575
    //   6985: l2i
    //   6986: ldc_w 305953109
    //   6989: ixor
    //   6990: ixor
    //   6991: lookupswitch default -> 9298, 193403686 -> 6974, 1142915107 -> 7016
    //   7016: fstore #12
    //   7018: getstatic Perryc.0 : I
    //   7021: ifle -> 7035
    //   7024: ldc2_w -440851984
    //   7027: l2i
    //   7028: ldc_w 361186423
    //   7031: ixor
    //   7032: goto -> 7043
    //   7035: ldc2_w 659033356
    //   7038: l2i
    //   7039: ldc_w 1321874014
    //   7042: ixor
    //   7043: ldc2_w -698259874
    //   7046: l2i
    //   7047: ldc_w 923403004
    //   7050: ixor
    //   7051: ixor
    //   7052: lookupswitch default -> 7080, 290783525 -> 9204, 749084590 -> 7035
    //   7080: fload #13
    //   7082: ldc_w 5.110826E37
    //   7085: invokestatic floatToIntBits : (F)I
    //   7088: ldc_w 2115619935
    //   7091: ixor
    //   7092: invokestatic intBitsToFloat : (I)F
    //   7095: fcmpg
    //   7096: ifge -> 7110
    //   7099: ldc2_w 248557550
    //   7102: l2i
    //   7103: ldc_w -632490766
    //   7106: ixor
    //   7107: goto -> 7118
    //   7110: ldc2_w 1164439150
    //   7113: l2i
    //   7114: ldc_w -1845774989
    //   7117: ixor
    //   7118: ldc2_w -2120428939
    //   7121: l2i
    //   7122: ldc_w -1257576935
    //   7125: ixor
    //   7126: ixor
    //   7127: tableswitch default -> 7099, -536187024 -> 7148, -536187023 -> 7222
    //   7148: ldc_w 2.1721753E38
    //   7151: invokestatic floatToIntBits : (F)I
    //   7154: ldc_w 2133027475
    //   7157: ixor
    //   7158: invokestatic intBitsToFloat : (I)F
    //   7161: getstatic Perryc.c : I
    //   7164: iflt -> 7178
    //   7167: ldc2_w -25041013
    //   7170: l2i
    //   7171: ldc_w -1028359077
    //   7174: ixor
    //   7175: goto -> 7186
    //   7178: ldc2_w 1471659748
    //   7181: l2i
    //   7182: ldc_w 1400951588
    //   7185: ixor
    //   7186: ldc2_w 924277271
    //   7189: l2i
    //   7190: ldc_w 1224229686
    //   7193: ixor
    //   7194: ixor
    //   7195: lookupswitch default -> 9290, 1138393841 -> 7178, 2077783265 -> 7220
    //   7220: fstore #13
    //   7222: getstatic Perryc.1 : I
    //   7225: ifeq -> 7239
    //   7228: ldc2_w -1711194546
    //   7231: l2i
    //   7232: ldc_w -280401795
    //   7235: ixor
    //   7236: goto -> 7247
    //   7239: ldc2_w 1369205458
    //   7242: l2i
    //   7243: ldc_w 1000301975
    //   7246: ixor
    //   7247: ldc2_w 208529611
    //   7250: l2i
    //   7251: ldc_w -697081255
    //   7254: ixor
    //   7255: ixor
    //   7256: lookupswitch default -> 9270, -1353261919 -> 7239, -1340242473 -> 7284
    //   7284: fload #12
    //   7286: ldc_w 6.828519E36
    //   7289: invokestatic floatToIntBits : (F)I
    //   7292: ldc_w 2091148287
    //   7295: ixor
    //   7296: invokestatic intBitsToFloat : (I)F
    //   7299: fcmpg
    //   7300: ifge -> 7314
    //   7303: ldc2_w 2097842953
    //   7306: l2i
    //   7307: ldc_w -1180874789
    //   7310: ixor
    //   7311: goto -> 7322
    //   7314: ldc2_w -483737256
    //   7317: l2i
    //   7318: ldc_w 666701193
    //   7321: ixor
    //   7322: ldc2_w 1655451531
    //   7325: l2i
    //   7326: ldc_w -197152708
    //   7329: ixor
    //   7330: ixor
    //   7331: tableswitch default -> 7303, 1376015205 -> 7352, 1376015206 -> 7426
    //   7352: ldc_w 4.8596527E37
    //   7355: invokestatic floatToIntBits : (F)I
    //   7358: ldc_w 2115124583
    //   7361: ixor
    //   7362: invokestatic intBitsToFloat : (I)F
    //   7365: getstatic Perryc.0 : I
    //   7368: ifle -> 7382
    //   7371: ldc2_w 699314264
    //   7374: l2i
    //   7375: ldc_w 1936624375
    //   7378: ixor
    //   7379: goto -> 7390
    //   7382: ldc2_w -1823389875
    //   7385: l2i
    //   7386: ldc_w 1200996093
    //   7389: ixor
    //   7390: ldc2_w 414276545
    //   7393: l2i
    //   7394: ldc_w -551156551
    //   7397: ixor
    //   7398: ixor
    //   7399: lookupswitch default -> 9158, -1655216681 -> 7382, 324249288 -> 7424
    //   7424: fstore #12
    //   7426: getstatic Perryc.0 : I
    //   7429: ifle -> 7443
    //   7432: ldc2_w -1501046304
    //   7435: l2i
    //   7436: ldc_w -1493087040
    //   7439: ixor
    //   7440: goto -> 7451
    //   7443: ldc2_w -1732141793
    //   7446: l2i
    //   7447: ldc_w -1722341475
    //   7450: ixor
    //   7451: ldc2_w -1218487891
    //   7454: l2i
    //   7455: ldc_w -1651099220
    //   7458: ixor
    //   7459: ixor
    //   7460: lookupswitch default -> 9110, 726660385 -> 7443, 727702147 -> 7488
    //   7488: aload_0
    //   7489: getstatic Perryc.c : I
    //   7492: iflt -> 7506
    //   7495: ldc2_w 1627580220
    //   7498: l2i
    //   7499: ldc_w 219306580
    //   7502: ixor
    //   7503: goto -> 7514
    //   7506: ldc2_w -162914959
    //   7509: l2i
    //   7510: ldc_w -1624473540
    //   7513: ixor
    //   7514: ldc2_w 352326127
    //   7517: l2i
    //   7518: ldc_w 509578351
    //   7521: ixor
    //   7522: ixor
    //   7523: lookupswitch default -> 7548, 1367747338 -> 7506, 1733239016 -> 9092
    //   7548: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   7551: new java/lang/StringBuilder
    //   7554: dup
    //   7555: getstatic Perryc.c : I
    //   7558: iflt -> 7572
    //   7561: ldc2_w 2060440546
    //   7564: l2i
    //   7565: ldc_w -916681094
    //   7568: ixor
    //   7569: goto -> 7580
    //   7572: ldc2_w 888758163
    //   7575: l2i
    //   7576: ldc_w -2026528082
    //   7579: ixor
    //   7580: ldc2_w 1987214879
    //   7583: l2i
    //   7584: ldc_w 1675048292
    //   7587: ixor
    //   7588: ixor
    //   7589: lookupswitch default -> 9186, -1506404637 -> 7572, -1503021498 -> 7616
    //   7616: goto -> 7620
    //   7619: athrow
    //   7620: invokespecial <init> : ()V
    //   7623: goto -> 7627
    //   7626: athrow
    //   7627: getstatic Perryc.0 : I
    //   7630: ifle -> 7644
    //   7633: ldc2_w -991832189
    //   7636: l2i
    //   7637: ldc_w -1687910128
    //   7640: ixor
    //   7641: goto -> 7652
    //   7644: ldc2_w -1562895666
    //   7647: l2i
    //   7648: ldc_w -664275815
    //   7651: ixor
    //   7652: ldc2_w -1258289322
    //   7655: l2i
    //   7656: ldc_w 1620722445
    //   7659: ixor
    //   7660: ixor
    //   7661: lookupswitch default -> 7688, -1977673016 -> 9308, 987247587 -> 7644
    //   7688: iload #11
    //   7690: getstatic Perryc.c : I
    //   7693: iflt -> 7707
    //   7696: ldc2_w 719414221
    //   7699: l2i
    //   7700: ldc_w 308496738
    //   7703: ixor
    //   7704: goto -> 7715
    //   7707: ldc2_w 834358842
    //   7710: l2i
    //   7711: ldc_w -659821127
    //   7714: ixor
    //   7715: ldc2_w -437836258
    //   7718: l2i
    //   7719: ldc_w -233260881
    //   7722: ixor
    //   7723: ixor
    //   7724: lookupswitch default -> 9192, -17875662 -> 7752, 796767262 -> 7707
    //   7752: goto -> 7756
    //   7755: athrow
    //   7756: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   7759: goto -> 7763
    //   7762: athrow
    //   7763: ldc_w ''
    //   7766: getstatic Perryc.c : I
    //   7769: iflt -> 7783
    //   7772: ldc2_w -1435549151
    //   7775: l2i
    //   7776: ldc_w 2000178909
    //   7779: ixor
    //   7780: goto -> 7791
    //   7783: ldc2_w -612297293
    //   7786: l2i
    //   7787: ldc_w -407715979
    //   7790: ixor
    //   7791: ldc2_w -335408137
    //   7794: l2i
    //   7795: ldc_w -897152679
    //   7798: ixor
    //   7799: ixor
    //   7800: lookupswitch default -> 9262, -70019502 -> 7783, 448213096 -> 7828
    //   7828: goto -> 7832
    //   7831: athrow
    //   7832: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7835: goto -> 7839
    //   7838: athrow
    //   7839: getstatic Perryc.c : I
    //   7842: iflt -> 7856
    //   7845: ldc2_w -1472829995
    //   7848: l2i
    //   7849: ldc_w 14316043
    //   7852: ixor
    //   7853: goto -> 7864
    //   7856: ldc2_w 717647328
    //   7859: l2i
    //   7860: ldc_w -516382309
    //   7863: ixor
    //   7864: ldc2_w -1998350108
    //   7867: l2i
    //   7868: ldc_w -2052658662
    //   7871: ixor
    //   7872: ixor
    //   7873: lookupswitch default -> 9196, -1515625184 -> 7856, -960774523 -> 7900
    //   7900: goto -> 7904
    //   7903: athrow
    //   7904: invokevirtual toString : ()Ljava/lang/String;
    //   7907: goto -> 7911
    //   7910: athrow
    //   7911: getstatic Perryc.c : I
    //   7914: iflt -> 7928
    //   7917: ldc2_w -2049984263
    //   7920: l2i
    //   7921: ldc_w -274011285
    //   7924: ixor
    //   7925: goto -> 7936
    //   7928: ldc2_w -683633599
    //   7931: l2i
    //   7932: ldc_w -1968267705
    //   7935: ixor
    //   7936: ldc2_w 834165524
    //   7939: l2i
    //   7940: ldc_w -1666828512
    //   7943: ixor
    //   7944: ixor
    //   7945: lookupswitch default -> 9184, -948224090 -> 7928, -252680654 -> 7972
    //   7972: iload #9
    //   7974: ldc2_w 71524052
    //   7977: l2i
    //   7978: ldc_w 71524060
    //   7981: ixor
    //   7982: iadd
    //   7983: getstatic Perryc.c : I
    //   7986: iflt -> 8000
    //   7989: ldc2_w 194029718
    //   7992: l2i
    //   7993: ldc_w -1320030428
    //   7996: ixor
    //   7997: goto -> 8008
    //   8000: ldc2_w 597358847
    //   8003: l2i
    //   8004: ldc_w 748648751
    //   8007: ixor
    //   8008: ldc2_w 1084052284
    //   8011: l2i
    //   8012: ldc_w -1443740886
    //   8015: ixor
    //   8016: ixor
    //   8017: lookupswitch default -> 8044, 846640015 -> 8000, 1403934628 -> 9250
    //   8044: aload_0
    //   8045: getstatic Perryc.0 : I
    //   8048: ifle -> 8062
    //   8051: ldc2_w -205078909
    //   8054: l2i
    //   8055: ldc_w 322934632
    //   8058: ixor
    //   8059: goto -> 8070
    //   8062: ldc2_w 1396027813
    //   8065: l2i
    //   8066: ldc_w 1632810833
    //   8069: ixor
    //   8070: ldc2_w 460461365
    //   8073: l2i
    //   8074: ldc_w 928780130
    //   8077: ixor
    //   8078: ixor
    //   8079: lookupswitch default -> 8104, -1715853709 -> 8062, -858311748 -> 9210
    //   8104: getfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   8107: new java/lang/StringBuilder
    //   8110: dup
    //   8111: getstatic Perryc.0 : I
    //   8114: ifle -> 8128
    //   8117: ldc2_w -1764710757
    //   8120: l2i
    //   8121: ldc_w -1542428237
    //   8124: ixor
    //   8125: goto -> 8136
    //   8128: ldc2_w -1191867160
    //   8131: l2i
    //   8132: ldc_w 39186664
    //   8135: ixor
    //   8136: ldc2_w -2045194272
    //   8139: l2i
    //   8140: ldc_w -434930118
    //   8143: ixor
    //   8144: ixor
    //   8145: lookupswitch default -> 9194, -626274854 -> 8172, 1389068018 -> 8128
    //   8172: goto -> 8176
    //   8175: athrow
    //   8176: invokespecial <init> : ()V
    //   8179: goto -> 8183
    //   8182: athrow
    //   8183: getstatic Perryc.1 : I
    //   8186: ifeq -> 8200
    //   8189: ldc2_w 1902145484
    //   8192: l2i
    //   8193: ldc_w -1141885827
    //   8196: ixor
    //   8197: goto -> 8208
    //   8200: ldc2_w 583916168
    //   8203: l2i
    //   8204: ldc_w -568289276
    //   8207: ixor
    //   8208: ldc2_w -980098389
    //   8211: l2i
    //   8212: ldc_w -342075885
    //   8215: ixor
    //   8216: ixor
    //   8217: lookupswitch default -> 8244, -459739383 -> 9134, -229629480 -> 8200
    //   8244: iload #11
    //   8246: getstatic Perryc.0 : I
    //   8249: ifle -> 8263
    //   8252: ldc2_w 986440205
    //   8255: l2i
    //   8256: ldc_w -788590675
    //   8259: ixor
    //   8260: goto -> 8271
    //   8263: ldc2_w -43511162
    //   8266: l2i
    //   8267: ldc_w -1368250357
    //   8270: ixor
    //   8271: ldc2_w -1306078403
    //   8274: l2i
    //   8275: ldc_w -1108750544
    //   8278: ixor
    //   8279: ixor
    //   8280: lookupswitch default -> 9312, -436473427 -> 8263, 1557472896 -> 8308
    //   8308: goto -> 8312
    //   8311: athrow
    //   8312: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   8315: goto -> 8319
    //   8318: athrow
    //   8319: ldc_w ''
    //   8322: getstatic Perryc.1 : I
    //   8325: ifeq -> 8339
    //   8328: ldc2_w -2139887658
    //   8331: l2i
    //   8332: ldc_w 1212490801
    //   8335: ixor
    //   8336: goto -> 8347
    //   8339: ldc2_w -1865741595
    //   8342: l2i
    //   8343: ldc_w -596960540
    //   8346: ixor
    //   8347: ldc2_w 741021401
    //   8350: l2i
    //   8351: ldc_w -2067402518
    //   8354: ixor
    //   8355: ixor
    //   8356: lookupswitch default -> 9118, -464587214 -> 8384, 1624778196 -> 8339
    //   8384: goto -> 8388
    //   8387: athrow
    //   8388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8391: goto -> 8395
    //   8394: athrow
    //   8395: getstatic Perryc.1 : I
    //   8398: ifeq -> 8412
    //   8401: ldc2_w 1581737765
    //   8404: l2i
    //   8405: ldc_w 188407428
    //   8408: ixor
    //   8409: goto -> 8420
    //   8412: ldc2_w -1966300012
    //   8415: l2i
    //   8416: ldc_w 340040481
    //   8419: ixor
    //   8420: ldc2_w -1030003201
    //   8423: l2i
    //   8424: ldc_w 566654024
    //   8427: ixor
    //   8428: ixor
    //   8429: lookupswitch default -> 8456, -1239373802 -> 9316, -461858262 -> 8412
    //   8456: goto -> 8460
    //   8459: athrow
    //   8460: invokevirtual toString : ()Ljava/lang/String;
    //   8463: goto -> 8467
    //   8466: athrow
    //   8467: getstatic Perryc.c : I
    //   8470: iflt -> 8484
    //   8473: ldc2_w -566985511
    //   8476: l2i
    //   8477: ldc_w 1859240305
    //   8480: ixor
    //   8481: goto -> 8492
    //   8484: ldc2_w -1151896840
    //   8487: l2i
    //   8488: ldc_w 963441157
    //   8491: ixor
    //   8492: ldc2_w 335475114
    //   8495: l2i
    //   8496: ldc_w 1400167227
    //   8499: ixor
    //   8500: ixor
    //   8501: lookupswitch default -> 8528, -2015398807 -> 8484, -261122247 -> 9224
    //   8528: goto -> 8532
    //   8531: athrow
    //   8532: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   8535: goto -> 8539
    //   8538: athrow
    //   8539: ldc2_w -1187651981
    //   8542: l2i
    //   8543: ldc_w -1187651983
    //   8546: ixor
    //   8547: idiv
    //   8548: isub
    //   8549: i2f
    //   8550: getstatic Perryc.c : I
    //   8553: iflt -> 8567
    //   8556: ldc2_w 1238316238
    //   8559: l2i
    //   8560: ldc_w -1314046895
    //   8563: ixor
    //   8564: goto -> 8575
    //   8567: ldc2_w -1897088720
    //   8570: l2i
    //   8571: ldc_w 1750305663
    //   8574: ixor
    //   8575: ldc2_w -1706572156
    //   8578: l2i
    //   8579: ldc_w 436078936
    //   8582: ixor
    //   8583: ixor
    //   8584: lookupswitch default -> 9294, 1694956947 -> 8612, 2078000963 -> 8567
    //   8612: iload #6
    //   8614: ldc2_w 375195254
    //   8617: l2i
    //   8618: ldc_w 375195261
    //   8621: ixor
    //   8622: isub
    //   8623: i2f
    //   8624: getstatic Perryc.1 : I
    //   8627: ifeq -> 8641
    //   8630: ldc2_w -1173131580
    //   8633: l2i
    //   8634: ldc_w 291130151
    //   8637: ixor
    //   8638: goto -> 8649
    //   8641: ldc2_w 363452509
    //   8644: l2i
    //   8645: ldc_w 1068342834
    //   8648: ixor
    //   8649: ldc2_w -241126439
    //   8652: l2i
    //   8653: ldc_w 1883800826
    //   8656: ixor
    //   8657: ixor
    //   8658: lookupswitch default -> 9188, -1410567860 -> 8684, 715199168 -> 8641
    //   8684: fload #13
    //   8686: ldc_w 0.45346352
    //   8689: invokestatic floatToIntBits : (F)I
    //   8692: ldc_w 2107059295
    //   8695: ixor
    //   8696: invokestatic intBitsToFloat : (I)F
    //   8699: fmul
    //   8700: f2i
    //   8701: getstatic Perryc.1 : I
    //   8704: ifeq -> 8718
    //   8707: ldc2_w 469885690
    //   8710: l2i
    //   8711: ldc_w -1885517580
    //   8714: ixor
    //   8715: goto -> 8726
    //   8718: ldc2_w 1300564566
    //   8721: l2i
    //   8722: ldc_w 717470039
    //   8725: ixor
    //   8726: ldc2_w 1215634283
    //   8729: l2i
    //   8730: ldc_w -1154791582
    //   8733: ixor
    //   8734: ixor
    //   8735: lookupswitch default -> 9160, -1810305272 -> 8760, 1623389703 -> 8718
    //   8760: fload #12
    //   8762: ldc_w 0.05318616
    //   8765: invokestatic floatToIntBits : (F)I
    //   8768: ldc_w 2116475323
    //   8771: ixor
    //   8772: invokestatic intBitsToFloat : (I)F
    //   8775: fmul
    //   8776: f2i
    //   8777: ldc2_w -1373184897
    //   8780: l2i
    //   8781: ldc_w -1373184897
    //   8784: ixor
    //   8785: getstatic Perryc.1 : I
    //   8788: ifeq -> 8802
    //   8791: ldc2_w -1074807080
    //   8794: l2i
    //   8795: ldc_w -24576482
    //   8798: ixor
    //   8799: goto -> 8810
    //   8802: ldc2_w -1198000010
    //   8805: l2i
    //   8806: ldc_w -948294968
    //   8809: ixor
    //   8810: ldc2_w 1495527518
    //   8813: l2i
    //   8814: ldc_w 1111053767
    //   8817: ixor
    //   8818: ixor
    //   8819: lookupswitch default -> 8844, 1033234595 -> 8802, 1518200159 -> 9254
    //   8844: goto -> 8848
    //   8847: athrow
    //   8848: invokestatic toRGBA : (III)I
    //   8851: goto -> 8855
    //   8854: athrow
    //   8855: getstatic Perryc.c : I
    //   8858: iflt -> 8872
    //   8861: ldc2_w 1613800299
    //   8864: l2i
    //   8865: ldc_w -807083216
    //   8868: ixor
    //   8869: goto -> 8880
    //   8872: ldc2_w 368752469
    //   8875: l2i
    //   8876: ldc_w 1745371521
    //   8879: ixor
    //   8880: ldc2_w -949366955
    //   8883: l2i
    //   8884: ldc_w 139287250
    //   8887: ixor
    //   8888: ixor
    //   8889: lookupswitch default -> 9260, -1294572717 -> 8916, 1626396124 -> 8872
    //   8916: goto -> 8920
    //   8919: athrow
    //   8920: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   8923: goto -> 8927
    //   8926: athrow
    //   8927: goto -> 1822
    //   8930: getstatic Perryc.1 : I
    //   8933: ifeq -> 8947
    //   8936: ldc2_w 11829093
    //   8939: l2i
    //   8940: ldc_w 1881219754
    //   8943: ixor
    //   8944: goto -> 8955
    //   8947: ldc2_w 437621858
    //   8950: l2i
    //   8951: ldc_w 1245903602
    //   8954: ixor
    //   8955: ldc2_w -635182734
    //   8958: l2i
    //   8959: ldc_w 1079130365
    //   8962: ixor
    //   8963: ixor
    //   8964: lookupswitch default -> 9086, -903432417 -> 8992, -354122688 -> 8947
    //   8992: goto -> 8996
    //   8995: athrow
    //   8996: invokestatic func_179126_j : ()V
    //   8999: goto -> 9003
    //   9002: athrow
    //   9003: getstatic Perryc.c : I
    //   9006: iflt -> 9020
    //   9009: ldc2_w -610397825
    //   9012: l2i
    //   9013: ldc_w 941058190
    //   9016: ixor
    //   9017: goto -> 9028
    //   9020: ldc2_w 1468356572
    //   9023: l2i
    //   9024: ldc_w 925952351
    //   9027: ixor
    //   9028: ldc2_w 1331015466
    //   9031: l2i
    //   9032: ldc_w -1986468513
    //   9035: ixor
    //   9036: ixor
    //   9037: lookupswitch default -> 9064, -1490486835 -> 9020, 625226628 -> 9174
    //   9064: goto -> 9068
    //   9067: athrow
    //   9068: invokestatic func_179140_f : ()V
    //   9071: goto -> 9075
    //   9074: athrow
    //   9075: return
    //   9076: aconst_null
    //   9077: athrow
    //   9078: aconst_null
    //   9079: athrow
    //   9080: aconst_null
    //   9081: athrow
    //   9082: aconst_null
    //   9083: athrow
    //   9084: aconst_null
    //   9085: athrow
    //   9086: aconst_null
    //   9087: athrow
    //   9088: aconst_null
    //   9089: athrow
    //   9090: aconst_null
    //   9091: athrow
    //   9092: aconst_null
    //   9093: athrow
    //   9094: aconst_null
    //   9095: athrow
    //   9096: aconst_null
    //   9097: athrow
    //   9098: aconst_null
    //   9099: athrow
    //   9100: aconst_null
    //   9101: athrow
    //   9102: aconst_null
    //   9103: athrow
    //   9104: aconst_null
    //   9105: athrow
    //   9106: aconst_null
    //   9107: athrow
    //   9108: aconst_null
    //   9109: athrow
    //   9110: aconst_null
    //   9111: athrow
    //   9112: aconst_null
    //   9113: athrow
    //   9114: aconst_null
    //   9115: athrow
    //   9116: aconst_null
    //   9117: athrow
    //   9118: aconst_null
    //   9119: athrow
    //   9120: aconst_null
    //   9121: athrow
    //   9122: aconst_null
    //   9123: athrow
    //   9124: aconst_null
    //   9125: athrow
    //   9126: aconst_null
    //   9127: athrow
    //   9128: aconst_null
    //   9129: athrow
    //   9130: aconst_null
    //   9131: athrow
    //   9132: aconst_null
    //   9133: athrow
    //   9134: aconst_null
    //   9135: athrow
    //   9136: aconst_null
    //   9137: athrow
    //   9138: aconst_null
    //   9139: athrow
    //   9140: aconst_null
    //   9141: athrow
    //   9142: aconst_null
    //   9143: athrow
    //   9144: aconst_null
    //   9145: athrow
    //   9146: aconst_null
    //   9147: athrow
    //   9148: aconst_null
    //   9149: athrow
    //   9150: aconst_null
    //   9151: athrow
    //   9152: aconst_null
    //   9153: athrow
    //   9154: aconst_null
    //   9155: athrow
    //   9156: aconst_null
    //   9157: athrow
    //   9158: aconst_null
    //   9159: athrow
    //   9160: aconst_null
    //   9161: athrow
    //   9162: aconst_null
    //   9163: athrow
    //   9164: aconst_null
    //   9165: athrow
    //   9166: aconst_null
    //   9167: athrow
    //   9168: aconst_null
    //   9169: athrow
    //   9170: aconst_null
    //   9171: athrow
    //   9172: aconst_null
    //   9173: athrow
    //   9174: aconst_null
    //   9175: athrow
    //   9176: aconst_null
    //   9177: athrow
    //   9178: aconst_null
    //   9179: athrow
    //   9180: aconst_null
    //   9181: athrow
    //   9182: aconst_null
    //   9183: athrow
    //   9184: aconst_null
    //   9185: athrow
    //   9186: aconst_null
    //   9187: athrow
    //   9188: aconst_null
    //   9189: athrow
    //   9190: aconst_null
    //   9191: athrow
    //   9192: aconst_null
    //   9193: athrow
    //   9194: aconst_null
    //   9195: athrow
    //   9196: aconst_null
    //   9197: athrow
    //   9198: aconst_null
    //   9199: athrow
    //   9200: aconst_null
    //   9201: athrow
    //   9202: aconst_null
    //   9203: athrow
    //   9204: aconst_null
    //   9205: athrow
    //   9206: aconst_null
    //   9207: athrow
    //   9208: aconst_null
    //   9209: athrow
    //   9210: aconst_null
    //   9211: athrow
    //   9212: aconst_null
    //   9213: athrow
    //   9214: aconst_null
    //   9215: athrow
    //   9216: aconst_null
    //   9217: athrow
    //   9218: aconst_null
    //   9219: athrow
    //   9220: aconst_null
    //   9221: athrow
    //   9222: aconst_null
    //   9223: athrow
    //   9224: aconst_null
    //   9225: athrow
    //   9226: aconst_null
    //   9227: athrow
    //   9228: aconst_null
    //   9229: athrow
    //   9230: aconst_null
    //   9231: athrow
    //   9232: aconst_null
    //   9233: athrow
    //   9234: aconst_null
    //   9235: athrow
    //   9236: aconst_null
    //   9237: athrow
    //   9238: aconst_null
    //   9239: athrow
    //   9240: aconst_null
    //   9241: athrow
    //   9242: aconst_null
    //   9243: athrow
    //   9244: aconst_null
    //   9245: athrow
    //   9246: aconst_null
    //   9247: athrow
    //   9248: aconst_null
    //   9249: athrow
    //   9250: aconst_null
    //   9251: athrow
    //   9252: aconst_null
    //   9253: athrow
    //   9254: aconst_null
    //   9255: athrow
    //   9256: aconst_null
    //   9257: athrow
    //   9258: aconst_null
    //   9259: athrow
    //   9260: aconst_null
    //   9261: athrow
    //   9262: aconst_null
    //   9263: athrow
    //   9264: aconst_null
    //   9265: athrow
    //   9266: aconst_null
    //   9267: athrow
    //   9268: aconst_null
    //   9269: athrow
    //   9270: aconst_null
    //   9271: athrow
    //   9272: aconst_null
    //   9273: athrow
    //   9274: aconst_null
    //   9275: athrow
    //   9276: aconst_null
    //   9277: athrow
    //   9278: aconst_null
    //   9279: athrow
    //   9280: aconst_null
    //   9281: athrow
    //   9282: aconst_null
    //   9283: athrow
    //   9284: aconst_null
    //   9285: athrow
    //   9286: aconst_null
    //   9287: athrow
    //   9288: aconst_null
    //   9289: athrow
    //   9290: aconst_null
    //   9291: athrow
    //   9292: aconst_null
    //   9293: athrow
    //   9294: aconst_null
    //   9295: athrow
    //   9296: aconst_null
    //   9297: athrow
    //   9298: aconst_null
    //   9299: athrow
    //   9300: aconst_null
    //   9301: athrow
    //   9302: aconst_null
    //   9303: athrow
    //   9304: aconst_null
    //   9305: athrow
    //   9306: aconst_null
    //   9307: athrow
    //   9308: aconst_null
    //   9309: athrow
    //   9310: aconst_null
    //   9311: athrow
    //   9312: aconst_null
    //   9313: athrow
    //   9314: aconst_null
    //   9315: athrow
    //   9316: aconst_null
    //   9317: athrow
    //   9318: aconst_null
    //   9319: athrow
    //   9320: aconst_null
    //   9321: athrow
    //   9322: pop
    //   9323: goto -> 24
    //   9326: pop
    //   9327: aconst_null
    //   9328: goto -> 9322
    //   9331: dup
    //   9332: ifnull -> 9322
    //   9335: checkcast java/lang/Throwable
    //   9338: athrow
    //   9339: dup
    //   9340: ifnull -> 9326
    //   9343: checkcast java/lang/Throwable
    //   9346: athrow
    //   9347: aconst_null
    //   9348: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2638	6289	9	x	I
    //   4974	3953	10	s	Ljava/lang/String;
    //   5846	3081	11	dmg	I
    //   6318	2609	12	green	F
    //   6458	2469	13	red	F
    //   2218	6709	8	is	Lnet/minecraft/item/ItemStack;
    //   24	9052	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Armor;
    //   24	9052	1	percent	Z
    //   261	8815	2	width	I
    //   501	8575	3	height	I
    //   698	8378	4	i	I
    //   770	8306	5	iteration	I
    //   1430	7646	6	y	I
    // Exception table:
    //   from	to	target	type
    //   8	20	9331	java/lang/AssertionError
    //   563	570	570	finally
    //   563	570	570	finally
    //   563	570	3	finally
    //   563	570	3	java/lang/EnumConstantNotPresentException
    //   564	570	563	finally
    //   1035	1042	1042	finally
    //   1035	1042	1035	java/lang/StringIndexOutOfBoundsException
    //   1036	1042	1042	finally
    //   1036	1042	1042	finally
    //   1036	1042	1042	java/lang/StringIndexOutOfBoundsException
    //   1287	1294	1294	finally
    //   1287	1294	1287	finally
    //   1287	1294	1294	finally
    //   1288	1294	3	java/lang/ArithmeticException
    //   1288	1294	3	finally
    //   1751	1758	1758	finally
    //   1751	1758	1758	java/lang/NullPointerException
    //   1751	1758	1751	java/lang/NumberFormatException
    //   1751	1758	1758	finally
    //   1751	1758	3	finally
    //   1952	1960	1960	finally
    //   1952	1960	1960	finally
    //   1952	1960	3	java/util/ConcurrentModificationException
    //   1952	1960	1960	java/lang/AssertionError
    //   1952	1960	1960	java/lang/NegativeArraySizeException
    //   2143	2152	2152	finally
    //   2143	2152	2143	finally
    //   2143	2152	2152	java/lang/IllegalArgumentException
    //   2144	2152	2143	java/lang/RuntimeException
    //   2144	2152	3	java/lang/ClassCastException
    //   2347	2354	2354	finally
    //   2347	2354	2354	java/util/NoSuchElementException
    //   2347	2354	2347	finally
    //   2347	2354	2354	finally
    //   2348	2354	2347	java/lang/UnsupportedOperationException
    //   2703	2710	2710	finally
    //   2703	2710	2703	finally
    //   2703	2710	2710	java/lang/UnsupportedOperationException
    //   2703	2710	3	java/lang/NullPointerException
    //   2704	2710	3	finally
    //   2840	2846	2846	finally
    //   2840	2846	3	java/lang/ClassCastException
    //   2840	2846	2846	finally
    //   2840	2846	2846	finally
    //   2840	2846	3	java/util/ConcurrentModificationException
    //   3051	3058	3058	finally
    //   3051	3058	3058	java/lang/IndexOutOfBoundsException
    //   3052	3058	3051	java/lang/IndexOutOfBoundsException
    //   3052	3058	3051	finally
    //   3052	3058	3	java/util/NoSuchElementException
    //   3315	3322	3322	finally
    //   3315	3322	3	java/lang/RuntimeException
    //   3315	3322	3322	java/lang/IllegalStateException
    //   3316	3322	3322	finally
    //   3316	3322	3315	java/lang/IndexOutOfBoundsException
    //   3451	3458	3458	finally
    //   3451	3458	3458	finally
    //   3452	3458	3458	java/lang/IllegalStateException
    //   3452	3458	3451	java/lang/ArrayIndexOutOfBoundsException
    //   3452	3458	3458	finally
    //   3843	3850	3850	finally
    //   3843	3850	3850	finally
    //   3843	3850	3843	finally
    //   3844	3850	3	java/lang/EnumConstantNotPresentException
    //   3844	3850	3843	finally
    //   3980	3986	3986	finally
    //   3980	3986	3986	java/util/NoSuchElementException
    //   3980	3986	3	finally
    //   3980	3986	3986	java/lang/IllegalStateException
    //   3980	3986	3	java/lang/AssertionError
    //   4127	4134	4134	finally
    //   4127	4134	4127	java/lang/NumberFormatException
    //   4127	4134	4127	java/lang/StringIndexOutOfBoundsException
    //   4128	4134	4127	java/lang/IllegalArgumentException
    //   4128	4134	4127	java/lang/UnsupportedOperationException
    //   4199	4206	4206	finally
    //   4199	4206	4199	java/util/ConcurrentModificationException
    //   4199	4206	4206	java/lang/NegativeArraySizeException
    //   4200	4206	4206	java/lang/EnumConstantNotPresentException
    //   4200	4206	4206	finally
    //   4271	4278	4278	finally
    //   4271	4278	4278	java/lang/IndexOutOfBoundsException
    //   4271	4278	4271	finally
    //   4272	4278	4278	java/lang/IndexOutOfBoundsException
    //   4272	4278	4271	java/lang/RuntimeException
    //   4407	4414	4414	finally
    //   4407	4414	4407	java/lang/ArithmeticException
    //   4408	4414	3	finally
    //   4408	4414	3	finally
    //   4408	4414	3	finally
    //   4543	4550	4550	finally
    //   4543	4550	4543	java/lang/IndexOutOfBoundsException
    //   4544	4550	3	finally
    //   4544	4550	4543	java/lang/IllegalArgumentException
    //   4544	4550	3	java/lang/IllegalStateException
    //   4679	4686	4686	finally
    //   4679	4686	4679	java/lang/UnsupportedOperationException
    //   4679	4686	4686	java/lang/IllegalStateException
    //   4679	4686	4686	finally
    //   4680	4686	3	java/lang/NegativeArraySizeException
    //   4751	4758	4758	finally
    //   4751	4758	4751	java/lang/ArithmeticException
    //   4751	4758	4758	java/lang/ClassCastException
    //   4752	4758	4758	java/lang/NumberFormatException
    //   4752	4758	3	java/lang/AssertionError
    //   4827	4834	4834	finally
    //   4827	4834	4827	java/lang/IllegalArgumentException
    //   4827	4834	4834	finally
    //   4827	4834	4834	finally
    //   4828	4834	3	finally
    //   4899	4906	4906	finally
    //   4899	4906	4899	java/lang/NumberFormatException
    //   4899	4906	3	java/lang/RuntimeException
    //   4899	4906	4906	java/lang/ArithmeticException
    //   4900	4906	4906	finally
    //   5495	5502	5502	finally
    //   5495	5502	3	finally
    //   5495	5502	5502	java/lang/StringIndexOutOfBoundsException
    //   5496	5502	5502	java/lang/NumberFormatException
    //   5496	5502	5495	java/lang/EnumConstantNotPresentException
    //   5648	5654	5654	finally
    //   5648	5654	3	finally
    //   5648	5654	5654	finally
    //   5648	5654	5654	finally
    //   5648	5654	5654	finally
    //   5975	5982	5982	finally
    //   5975	5982	5982	java/lang/UnsupportedOperationException
    //   5976	5982	5975	java/lang/NegativeArraySizeException
    //   5976	5982	5982	finally
    //   5976	5982	5975	java/lang/NullPointerException
    //   6111	6118	6118	finally
    //   6112	6118	3	java/lang/RuntimeException
    //   6112	6118	3	java/util/NoSuchElementException
    //   6112	6118	3	java/lang/ClassCastException
    //   6112	6118	6111	java/lang/AssertionError
    //   6247	6254	6254	finally
    //   6247	6254	6254	java/lang/IllegalArgumentException
    //   6247	6254	3	finally
    //   6248	6254	6247	finally
    //   6248	6254	6254	java/lang/AssertionError
    //   7619	7626	7626	finally
    //   7619	7626	3	finally
    //   7620	7626	7619	finally
    //   7620	7626	7626	finally
    //   7620	7626	7626	java/lang/ClassCastException
    //   7755	7762	7762	finally
    //   7755	7762	3	finally
    //   7756	7762	7762	finally
    //   7756	7762	7755	finally
    //   7756	7762	7755	finally
    //   7831	7838	7838	finally
    //   7831	7838	3	finally
    //   7831	7838	3	finally
    //   7832	7838	7831	finally
    //   7832	7838	7831	finally
    //   7903	7910	7910	finally
    //   7904	7910	7910	finally
    //   7904	7910	3	finally
    //   7904	7910	7903	finally
    //   7904	7910	3	finally
    //   8175	8182	8182	finally
    //   8175	8182	8182	finally
    //   8176	8182	8175	java/lang/NumberFormatException
    //   8176	8182	8182	java/lang/NegativeArraySizeException
    //   8176	8182	8175	finally
    //   8311	8318	8318	finally
    //   8311	8318	8311	java/lang/ClassCastException
    //   8311	8318	8318	finally
    //   8312	8318	8311	finally
    //   8312	8318	3	finally
    //   8387	8394	8394	finally
    //   8388	8394	3	finally
    //   8388	8394	8387	java/lang/AssertionError
    //   8388	8394	8394	finally
    //   8388	8394	8394	finally
    //   8460	8466	8466	finally
    //   8460	8466	3	java/lang/UnsupportedOperationException
    //   8460	8466	3	finally
    //   8460	8466	8466	java/lang/ArrayIndexOutOfBoundsException
    //   8460	8466	8466	finally
    //   8531	8538	8538	finally
    //   8531	8538	8538	finally
    //   8531	8538	3	finally
    //   8532	8538	8531	finally
    //   8532	8538	8538	java/lang/NullPointerException
    //   8848	8854	8854	finally
    //   8848	8854	3	java/lang/AssertionError
    //   8848	8854	3	java/lang/StringIndexOutOfBoundsException
    //   8848	8854	3	finally
    //   8848	8854	3	java/lang/ClassCastException
    //   8920	8926	8926	finally
    //   8920	8926	8926	java/lang/NullPointerException
    //   8920	8926	3	finally
    //   8920	8926	8926	finally
    //   8920	8926	3	java/lang/NullPointerException
    //   8995	9002	9002	finally
    //   8995	9002	9002	java/lang/ArrayIndexOutOfBoundsException
    //   8995	9002	9002	finally
    //   8996	9002	8995	finally
    //   8996	9002	3	finally
    //   9067	9074	9074	finally
    //   9067	9074	9067	finally
    //   9067	9074	9074	java/lang/RuntimeException
    //   9068	9074	3	java/lang/UnsupportedOperationException
    //   9068	9074	3	java/lang/IndexOutOfBoundsException
    //   9331	9339	9331	java/lang/ArithmeticException
    //   9347	9349	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Armor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */