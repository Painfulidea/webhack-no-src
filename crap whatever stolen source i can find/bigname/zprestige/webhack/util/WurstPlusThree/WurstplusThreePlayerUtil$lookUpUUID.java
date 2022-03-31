package bigname.zprestige.webhack.util.WurstPlusThree;

import Perry1;
import java.util.UUID;
import net.minecraft.client.network.NetworkPlayerInfo;

public class WurstplusThreePlayerUtil$lookUpUUID implements Runnable {
  public String name;
  
  public static boolean $assertionsDisabled;
  
  public UUID uuid;
  
  public String getName() {
    return Perry1.f(this, (int)1209184209L ^ 0x1383EC3A);
  }
  
  public WurstplusThreePlayerUtil$lookUpUUID(String name) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -468896957
    //   9: l2i
    //   10: ldc -577445938
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1099855376
    //   19: l2i
    //   20: ldc -320189937
    //   22: ixor
    //   23: ldc2_w -571249869
    //   26: l2i
    //   27: ldc -1317729897
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -174205306 -> 16, 1428131369 -> 302
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -735843727
    //   66: l2i
    //   67: ldc -390611430
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1380514160
    //   76: l2i
    //   77: ldc 397151443
    //   79: ixor
    //   80: ldc2_w 288139394
    //   83: l2i
    //   84: ldc -1297720101
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1625382862 -> 304, -264190771 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 2057647096
    //   128: l2i
    //   129: ldc 683767389
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -674279738
    //   138: l2i
    //   139: ldc 78480251
    //   141: ixor
    //   142: ldc2_w 1064720283
    //   145: l2i
    //   146: ldc 946451293
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1254918659 -> 135, 1434165603 -> 308
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w -857165742
    //   186: l2i
    //   187: ldc -810690052
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -369482060
    //   196: l2i
    //   197: ldc 1891998782
    //   199: ixor
    //   200: ldc2_w 574508786
    //   203: l2i
    //   204: ldc 69322974
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 300, -1088406362 -> 236, 626716546 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1185896183
    //   246: l2i
    //   247: ldc 1815453438
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1710551740
    //   256: l2i
    //   257: ldc -1680854432
    //   259: ixor
    //   260: ldc2_w -1921870877
    //   263: l2i
    //   264: ldc 1752269510
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 306, 455594489 -> 296, 812000978 -> 253
    //   296: putfield name : Ljava/lang/String;
    //   299: return
    //   300: aconst_null
    //   301: athrow
    //   302: aconst_null
    //   303: athrow
    //   304: aconst_null
    //   305: athrow
    //   306: aconst_null
    //   307: athrow
    //   308: aconst_null
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	300	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil$lookUpUUID;
    //   0	300	1	name	Ljava/lang/String;
  }
  
  public UUID getUUID() {
    return Perry1.1g(this, (int)1079897090L ^ 0x1401A6DF);
  }
  
  public void run() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4561
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 4553
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4545
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 44
    //   34: ldc2_w -1602959574
    //   37: l2i
    //   38: ldc -1362592824
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w 1086699319
    //   47: l2i
    //   48: ldc -1427772792
    //   50: ixor
    //   51: ldc2_w 85712271
    //   54: l2i
    //   55: ldc 594456307
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 4532, -866832701 -> 84, 684314526 -> 44
    //   84: getstatic bigname/zprestige/webhack/util/Globals.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 103
    //   93: ldc2_w -476505347
    //   96: l2i
    //   97: ldc -1145544338
    //   99: ixor
    //   100: goto -> 110
    //   103: ldc2_w -206867437
    //   106: l2i
    //   107: ldc -203589324
    //   109: ixor
    //   110: ldc2_w -2024581618
    //   113: l2i
    //   114: ldc -1900509985
    //   116: ixor
    //   117: ixor
    //   118: lookupswitch default -> 144, -1550711090 -> 103, 1372236098 -> 4476
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 171
    //   161: ldc2_w 674088250
    //   164: l2i
    //   165: ldc -543993329
    //   167: ixor
    //   168: goto -> 178
    //   171: ldc2_w 910665880
    //   174: l2i
    //   175: ldc -228216752
    //   177: ixor
    //   178: ldc2_w 1806944564
    //   181: l2i
    //   182: ldc -545888507
    //   184: ixor
    //   185: ixor
    //   186: lookupswitch default -> 4508, 1132148996 -> 171, 1894233849 -> 212
    //   212: goto -> 216
    //   215: athrow
    //   216: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   219: goto -> 223
    //   222: athrow
    //   223: checkcast net/minecraft/client/network/NetHandlerPlayClient
    //   226: getstatic Perryc.1 : I
    //   229: ifeq -> 242
    //   232: ldc2_w 1069433320
    //   235: l2i
    //   236: ldc -2062008659
    //   238: ixor
    //   239: goto -> 249
    //   242: ldc2_w -247039358
    //   245: l2i
    //   246: ldc 1681975633
    //   248: ixor
    //   249: ldc2_w -963680164
    //   252: l2i
    //   253: ldc -174971098
    //   255: ixor
    //   256: ixor
    //   257: lookupswitch default -> 284, -1984221121 -> 4500, -1478468648 -> 242
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_175106_d : ()Ljava/util/Collection;
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.c : I
    //   298: iflt -> 311
    //   301: ldc2_w 414348648
    //   304: l2i
    //   305: ldc 1264452860
    //   307: ixor
    //   308: goto -> 318
    //   311: ldc2_w -1928426100
    //   314: l2i
    //   315: ldc 950792341
    //   317: ixor
    //   318: ldc2_w 2086031888
    //   321: l2i
    //   322: ldc -65950430
    //   324: ixor
    //   325: ixor
    //   326: lookupswitch default -> 4422, -743731546 -> 311, 904036907 -> 352
    //   352: goto -> 356
    //   355: athrow
    //   356: invokespecial <init> : (Ljava/util/Collection;)V
    //   359: goto -> 363
    //   362: athrow
    //   363: getstatic Perryc.c : I
    //   366: iflt -> 379
    //   369: ldc2_w 2107488227
    //   372: l2i
    //   373: ldc 833637168
    //   375: ixor
    //   376: goto -> 386
    //   379: ldc2_w 868768288
    //   382: l2i
    //   383: ldc -577196037
    //   385: ixor
    //   386: ldc2_w -100937749
    //   389: l2i
    //   390: ldc -387985553
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 420, 8610771 -> 379, 1560935511 -> 4534
    //   420: astore_2
    //   421: getstatic Perryc.0 : I
    //   424: ifle -> 437
    //   427: ldc2_w -1581376774
    //   430: l2i
    //   431: ldc 1143404228
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w 1833560722
    //   440: l2i
    //   441: ldc 943412162
    //   443: ixor
    //   444: ldc2_w -971606593
    //   447: l2i
    //   448: ldc -311488670
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 4436, -824076573 -> 437, 2114700173 -> 480
    //   480: aload_2
    //   481: getstatic Perryc.0 : I
    //   484: ifle -> 497
    //   487: ldc2_w 1035428155
    //   490: l2i
    //   491: ldc 1675142067
    //   493: ixor
    //   494: goto -> 504
    //   497: ldc2_w 469200805
    //   500: l2i
    //   501: ldc -1860995601
    //   503: ixor
    //   504: ldc2_w -2110939580
    //   507: l2i
    //   508: ldc 2090287043
    //   510: ixor
    //   511: ixor
    //   512: lookupswitch default -> 4518, -1596628209 -> 497, 1952365517 -> 540
    //   540: goto -> 544
    //   543: athrow
    //   544: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   547: goto -> 551
    //   550: athrow
    //   551: getstatic Perryc.c : I
    //   554: iflt -> 567
    //   557: ldc2_w 1079780697
    //   560: l2i
    //   561: ldc -2029060119
    //   563: ixor
    //   564: goto -> 574
    //   567: ldc2_w -955284411
    //   570: l2i
    //   571: ldc 4433272
    //   573: ixor
    //   574: ldc2_w 1968749262
    //   577: l2i
    //   578: ldc 478096834
    //   580: ixor
    //   581: ixor
    //   582: lookupswitch default -> 608, -1368044100 -> 4426, -795566046 -> 567
    //   608: aload_0
    //   609: <illegal opcode> test : (Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil$lookUpUUID;)Ljava/util/function/Predicate;
    //   614: getstatic Perryc.c : I
    //   617: iflt -> 631
    //   620: ldc2_w -1711948969
    //   623: l2i
    //   624: ldc_w -1004683826
    //   627: ixor
    //   628: goto -> 639
    //   631: ldc2_w -230304420
    //   634: l2i
    //   635: ldc_w -749518420
    //   638: ixor
    //   639: ldc2_w -694365736
    //   642: l2i
    //   643: ldc_w -1357371216
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 4452, 611123185 -> 631, 1485991320 -> 676
    //   676: goto -> 680
    //   679: athrow
    //   680: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   685: goto -> 689
    //   688: athrow
    //   689: getstatic Perryc.0 : I
    //   692: ifle -> 706
    //   695: ldc2_w -35095701
    //   698: l2i
    //   699: ldc_w -1482009891
    //   702: ixor
    //   703: goto -> 714
    //   706: ldc2_w 143822646
    //   709: l2i
    //   710: ldc_w -406314275
    //   713: ixor
    //   714: ldc2_w -624723586
    //   717: l2i
    //   718: ldc_w 183653576
    //   721: ixor
    //   722: ixor
    //   723: lookupswitch default -> 4516, -1972173824 -> 706, 1064009821 -> 748
    //   748: goto -> 752
    //   751: athrow
    //   752: invokeinterface findFirst : ()Ljava/util/Optional;
    //   757: goto -> 761
    //   760: athrow
    //   761: aconst_null
    //   762: getstatic Perryc.1 : I
    //   765: ifeq -> 779
    //   768: ldc2_w -338378502
    //   771: l2i
    //   772: ldc_w 572560077
    //   775: ixor
    //   776: goto -> 787
    //   779: ldc2_w -666872635
    //   782: l2i
    //   783: ldc_w 606155392
    //   786: ixor
    //   787: ldc2_w -1821582730
    //   790: l2i
    //   791: ldc_w -1186670330
    //   794: ixor
    //   795: ixor
    //   796: lookupswitch default -> 824, -1387753426 -> 779, -472100537 -> 4486
    //   824: goto -> 828
    //   827: athrow
    //   828: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   831: goto -> 835
    //   834: athrow
    //   835: checkcast net/minecraft/client/network/NetworkPlayerInfo
    //   838: getstatic Perryc.0 : I
    //   841: ifle -> 855
    //   844: ldc2_w 1568374714
    //   847: l2i
    //   848: ldc_w -625439407
    //   851: ixor
    //   852: goto -> 863
    //   855: ldc2_w -970551844
    //   858: l2i
    //   859: ldc_w 1026760402
    //   862: ixor
    //   863: ldc2_w 1742681423
    //   866: l2i
    //   867: ldc_w -362644858
    //   870: ixor
    //   871: ixor
    //   872: lookupswitch default -> 900, -593146988 -> 855, 176078114 -> 4444
    //   900: astore_1
    //   901: getstatic Perryc.c : I
    //   904: iflt -> 918
    //   907: ldc2_w -1793843586
    //   910: l2i
    //   911: ldc_w -1743142116
    //   914: ixor
    //   915: goto -> 926
    //   918: ldc2_w 272865015
    //   921: l2i
    //   922: ldc_w 286355458
    //   925: ixor
    //   926: ldc2_w -1403509792
    //   929: l2i
    //   930: ldc_w -236095978
    //   933: ixor
    //   934: ixor
    //   935: lookupswitch default -> 960, -1865350397 -> 918, 1354270868 -> 4488
    //   960: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil$lookUpUUID.$assertionsDisabled : Z
    //   963: ifne -> 977
    //   966: ldc2_w -200437120
    //   969: l2i
    //   970: ldc_w -476456752
    //   973: ixor
    //   974: goto -> 985
    //   977: ldc2_w -1518551362
    //   980: l2i
    //   981: ldc_w -1293355799
    //   984: ixor
    //   985: ldc2_w 634805271
    //   988: l2i
    //   989: ldc_w -1975803716
    //   992: ixor
    //   993: ixor
    //   994: tableswitch default -> 966, -1199982853 -> 1016, -1199982852 -> 1208
    //   1016: getstatic Perryc.1 : I
    //   1019: ifeq -> 1033
    //   1022: ldc2_w 479944561
    //   1025: l2i
    //   1026: ldc_w 605824351
    //   1029: ixor
    //   1030: goto -> 1041
    //   1033: ldc2_w -2015338714
    //   1036: l2i
    //   1037: ldc_w -264630885
    //   1040: ixor
    //   1041: ldc2_w 637022013
    //   1044: l2i
    //   1045: ldc_w 1887090973
    //   1048: ixor
    //   1049: ixor
    //   1050: lookupswitch default -> 1076, 1615306705 -> 1033, 1829104654 -> 4416
    //   1076: aload_1
    //   1077: ifnonnull -> 1091
    //   1080: ldc2_w -1102744274
    //   1083: l2i
    //   1084: ldc_w -1512209360
    //   1087: ixor
    //   1088: goto -> 1099
    //   1091: ldc2_w -1051887500
    //   1094: l2i
    //   1095: ldc_w -623539859
    //   1098: ixor
    //   1099: ldc2_w 299552449
    //   1102: l2i
    //   1103: ldc_w -384473540
    //   1106: ixor
    //   1107: ixor
    //   1108: tableswitch default -> 1080, -480814621 -> 1132, -480814620 -> 1208
    //   1132: new java/lang/AssertionError
    //   1135: dup
    //   1136: getstatic Perryc.1 : I
    //   1139: ifeq -> 1153
    //   1142: ldc2_w -819566427
    //   1145: l2i
    //   1146: ldc_w -2081414942
    //   1149: ixor
    //   1150: goto -> 1161
    //   1153: ldc2_w 678675414
    //   1156: l2i
    //   1157: ldc_w -1759681902
    //   1160: ixor
    //   1161: ldc2_w 1924754453
    //   1164: l2i
    //   1165: ldc_w -2060394410
    //   1168: ixor
    //   1169: ixor
    //   1170: lookupswitch default -> 1196, -1373002865 -> 1153, -1151351804 -> 4458
    //   1196: goto -> 1200
    //   1199: athrow
    //   1200: invokespecial <init> : ()V
    //   1203: goto -> 1207
    //   1206: athrow
    //   1207: athrow
    //   1208: getstatic Perryc.0 : I
    //   1211: ifle -> 1225
    //   1214: ldc2_w -262002686
    //   1217: l2i
    //   1218: ldc_w 1749852403
    //   1221: ixor
    //   1222: goto -> 1233
    //   1225: ldc2_w -223572232
    //   1228: l2i
    //   1229: ldc_w 468746555
    //   1232: ixor
    //   1233: ldc2_w 694633729
    //   1236: l2i
    //   1237: ldc_w 512800214
    //   1240: ixor
    //   1241: ixor
    //   1242: lookupswitch default -> 1268, -1344702426 -> 4498, -359743959 -> 1225
    //   1268: aload_0
    //   1269: getstatic Perryc.1 : I
    //   1272: ifeq -> 1286
    //   1275: ldc2_w -665215639
    //   1278: l2i
    //   1279: ldc_w -1792100100
    //   1282: ixor
    //   1283: goto -> 1294
    //   1286: ldc2_w 256363910
    //   1289: l2i
    //   1290: ldc_w 466796110
    //   1293: ixor
    //   1294: ldc2_w 817528620
    //   1297: l2i
    //   1298: ldc_w -1414417943
    //   1301: ixor
    //   1302: ixor
    //   1303: lookupswitch default -> 1328, -1332909995 -> 1286, -696456368 -> 4450
    //   1328: aload_1
    //   1329: getstatic Perryc.c : I
    //   1332: iflt -> 1346
    //   1335: ldc2_w -1845265397
    //   1338: l2i
    //   1339: ldc_w 1958080289
    //   1342: ixor
    //   1343: goto -> 1354
    //   1346: ldc2_w 2029266194
    //   1349: l2i
    //   1350: ldc_w 2052172050
    //   1353: ixor
    //   1354: ldc2_w 32110648
    //   1357: l2i
    //   1358: ldc_w 1271651801
    //   1361: ixor
    //   1362: ixor
    //   1363: lookupswitch default -> 4524, -1399540021 -> 1346, 1216850401 -> 1388
    //   1388: goto -> 1392
    //   1391: athrow
    //   1392: invokevirtual func_178845_a : ()Lcom/mojang/authlib/GameProfile;
    //   1395: goto -> 1399
    //   1398: athrow
    //   1399: getstatic Perryc.0 : I
    //   1402: ifle -> 1416
    //   1405: ldc2_w 1759936671
    //   1408: l2i
    //   1409: ldc_w 1408468325
    //   1412: ixor
    //   1413: goto -> 1424
    //   1416: ldc2_w 1999590873
    //   1419: l2i
    //   1420: ldc_w 2052823346
    //   1423: ixor
    //   1424: ldc2_w -76206393
    //   1427: l2i
    //   1428: ldc_w -1886449198
    //   1431: ixor
    //   1432: ixor
    //   1433: lookupswitch default -> 4474, 1341078255 -> 1416, 2039411710 -> 1460
    //   1460: goto -> 1464
    //   1463: athrow
    //   1464: invokevirtual getId : ()Ljava/util/UUID;
    //   1467: goto -> 1471
    //   1470: athrow
    //   1471: getstatic Perryc.c : I
    //   1474: iflt -> 1488
    //   1477: ldc2_w 1054627051
    //   1480: l2i
    //   1481: ldc_w -805678360
    //   1484: ixor
    //   1485: goto -> 1496
    //   1488: ldc2_w 2046558928
    //   1491: l2i
    //   1492: ldc_w 1704366941
    //   1495: ixor
    //   1496: ldc2_w -205753553
    //   1499: l2i
    //   1500: ldc_w -1380846369
    //   1503: ixor
    //   1504: ixor
    //   1505: lookupswitch default -> 4466, -1356103181 -> 1488, 1114052221 -> 1532
    //   1532: putfield uuid : Ljava/util/UUID;
    //   1535: goto -> 1665
    //   1538: getstatic Perryc.0 : I
    //   1541: ifle -> 1555
    //   1544: ldc2_w 1080112359
    //   1547: l2i
    //   1548: ldc_w -1468909096
    //   1551: ixor
    //   1552: goto -> 1563
    //   1555: ldc2_w 1404027256
    //   1558: l2i
    //   1559: ldc_w 1263465815
    //   1562: ixor
    //   1563: ldc2_w 104121332
    //   1566: l2i
    //   1567: ldc_w -1900292251
    //   1570: ixor
    //   1571: ixor
    //   1572: lookupswitch default -> 4480, -1871830850 -> 1600, 1620842926 -> 1555
    //   1600: astore_2
    //   1601: aconst_null
    //   1602: getstatic Perryc.c : I
    //   1605: iflt -> 1619
    //   1608: ldc2_w 1313832138
    //   1611: l2i
    //   1612: ldc_w -1005777379
    //   1615: ixor
    //   1616: goto -> 1627
    //   1619: ldc2_w 2125163369
    //   1622: l2i
    //   1623: ldc_w -696008842
    //   1626: ixor
    //   1627: ldc2_w -165034043
    //   1630: l2i
    //   1631: ldc_w -674572435
    //   1634: ixor
    //   1635: ixor
    //   1636: lookupswitch default -> 1664, -1415486849 -> 4482, -80494620 -> 1619
    //   1664: astore_1
    //   1665: getstatic Perryc.c : I
    //   1668: iflt -> 1682
    //   1671: ldc2_w 1112516410
    //   1674: l2i
    //   1675: ldc_w -1596791695
    //   1678: ixor
    //   1679: goto -> 1690
    //   1682: ldc2_w 908591641
    //   1685: l2i
    //   1686: ldc_w 996650779
    //   1689: ixor
    //   1690: ldc2_w -995187260
    //   1693: l2i
    //   1694: ldc_w -1083038974
    //   1697: ixor
    //   1698: ixor
    //   1699: lookupswitch default -> 4522, -1723742835 -> 1682, 1989356484 -> 1724
    //   1724: aload_1
    //   1725: ifnonnull -> 1739
    //   1728: ldc2_w 1850724416
    //   1731: l2i
    //   1732: ldc_w 237522228
    //   1735: ixor
    //   1736: goto -> 1747
    //   1739: ldc2_w -1371466289
    //   1742: l2i
    //   1743: ldc_w -836335432
    //   1746: ixor
    //   1747: ldc2_w -1209388095
    //   1750: l2i
    //   1751: ldc_w 403181500
    //   1754: ixor
    //   1755: ixor
    //   1756: tableswitch default -> 1728, -813326071 -> 1780, -813326070 -> 4415
    //   1780: new java/lang/StringBuilder
    //   1783: dup
    //   1784: getstatic Perryc.0 : I
    //   1787: ifle -> 1801
    //   1790: ldc2_w -1993940894
    //   1793: l2i
    //   1794: ldc_w 800770252
    //   1797: ixor
    //   1798: goto -> 1809
    //   1801: ldc2_w -1530175053
    //   1804: l2i
    //   1805: ldc_w -957611280
    //   1808: ixor
    //   1809: ldc2_w -1458520734
    //   1812: l2i
    //   1813: ldc_w 331212764
    //   1816: ixor
    //   1817: ixor
    //   1818: lookupswitch default -> 1844, -938057582 -> 1801, 473002512 -> 4454
    //   1844: goto -> 1848
    //   1847: athrow
    //   1848: invokespecial <init> : ()V
    //   1851: goto -> 1855
    //   1854: athrow
    //   1855: ldc_w '꣒㍑'
    //   1858: getstatic Perryc.c : I
    //   1861: iflt -> 1875
    //   1864: ldc2_w 1628896098
    //   1867: l2i
    //   1868: ldc_w -403093998
    //   1871: ixor
    //   1872: goto -> 1883
    //   1875: ldc2_w -2049804001
    //   1878: l2i
    //   1879: ldc_w 1503794776
    //   1882: ixor
    //   1883: ldc2_w 1074921566
    //   1886: l2i
    //   1887: ldc_w 1978114857
    //   1890: ixor
    //   1891: ixor
    //   1892: lookupswitch default -> 4442, -1290134009 -> 1875, -377107408 -> 1920
    //   1920: goto -> 1924
    //   1923: athrow
    //   1924: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1927: goto -> 1931
    //   1930: athrow
    //   1931: getstatic Perryc.0 : I
    //   1934: ifle -> 1948
    //   1937: ldc2_w 1201778782
    //   1940: l2i
    //   1941: ldc_w -895226380
    //   1944: ixor
    //   1945: goto -> 1956
    //   1948: ldc2_w -1800796172
    //   1951: l2i
    //   1952: ldc_w 1873356991
    //   1955: ixor
    //   1956: ldc2_w -1397059317
    //   1959: l2i
    //   1960: ldc_w -909509968
    //   1963: ixor
    //   1964: ixor
    //   1965: lookupswitch default -> 4424, -1636809488 -> 1992, -395233775 -> 1948
    //   1992: goto -> 1996
    //   1995: athrow
    //   1996: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1999: goto -> 2003
    //   2002: athrow
    //   2003: getstatic Perryc.0 : I
    //   2006: ifle -> 2020
    //   2009: ldc2_w 356473626
    //   2012: l2i
    //   2013: ldc_w 195127420
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 1724639689
    //   2023: l2i
    //   2024: ldc_w -1562510520
    //   2027: ixor
    //   2028: ldc2_w 634182054
    //   2031: l2i
    //   2032: ldc_w -361611561
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2064, -786377705 -> 4510, 581536603 -> 2020
    //   2064: aload_0
    //   2065: getstatic Perryc.0 : I
    //   2068: ifle -> 2082
    //   2071: ldc2_w 386524791
    //   2074: l2i
    //   2075: ldc_w -738427409
    //   2078: ixor
    //   2079: goto -> 2090
    //   2082: ldc2_w -561274196
    //   2085: l2i
    //   2086: ldc_w -390641035
    //   2089: ixor
    //   2090: ldc2_w -1153570097
    //   2093: l2i
    //   2094: ldc_w -977815559
    //   2097: ixor
    //   2098: ixor
    //   2099: lookupswitch default -> 2124, -1166031186 -> 4432, 1931193306 -> 2082
    //   2124: getfield name : Ljava/lang/String;
    //   2127: getstatic Perryc.c : I
    //   2130: iflt -> 2144
    //   2133: ldc2_w 1417914328
    //   2136: l2i
    //   2137: ldc_w 1235130306
    //   2140: ixor
    //   2141: goto -> 2152
    //   2144: ldc2_w -272219999
    //   2147: l2i
    //   2148: ldc_w -1956609405
    //   2151: ixor
    //   2152: ldc2_w 50489575
    //   2155: l2i
    //   2156: ldc_w 1935966332
    //   2159: ixor
    //   2160: ixor
    //   2161: lookupswitch default -> 2188, -900599 -> 2144, 1836832897 -> 4464
    //   2188: goto -> 2192
    //   2191: athrow
    //   2192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2195: goto -> 2199
    //   2198: athrow
    //   2199: ldc_w 'ꢫ㌮'
    //   2202: getstatic Perryc.0 : I
    //   2205: ifle -> 2219
    //   2208: ldc2_w 155752458
    //   2211: l2i
    //   2212: ldc_w -683223139
    //   2215: ixor
    //   2216: goto -> 2227
    //   2219: ldc2_w -967853157
    //   2222: l2i
    //   2223: ldc_w -895304528
    //   2226: ixor
    //   2227: ldc2_w -1004068876
    //   2230: l2i
    //   2231: ldc_w -328155159
    //   2234: ixor
    //   2235: ixor
    //   2236: lookupswitch default -> 4468, -161878134 -> 2219, 616212278 -> 2264
    //   2264: goto -> 2268
    //   2267: athrow
    //   2268: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2271: goto -> 2275
    //   2274: athrow
    //   2275: getstatic Perryc.c : I
    //   2278: iflt -> 2292
    //   2281: ldc2_w 60388662
    //   2284: l2i
    //   2285: ldc_w -985198496
    //   2288: ixor
    //   2289: goto -> 2300
    //   2292: ldc2_w 255493540
    //   2295: l2i
    //   2296: ldc_w -617584124
    //   2299: ixor
    //   2300: ldc2_w -281795753
    //   2303: l2i
    //   2304: ldc_w -1661647324
    //   2307: ixor
    //   2308: ixor
    //   2309: lookupswitch default -> 2336, -1256259547 -> 4478, 1180548501 -> 2292
    //   2336: goto -> 2340
    //   2339: athrow
    //   2340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2343: goto -> 2347
    //   2346: athrow
    //   2347: getstatic Perryc.1 : I
    //   2350: ifeq -> 2364
    //   2353: ldc2_w -684077748
    //   2356: l2i
    //   2357: ldc_w -816065879
    //   2360: ixor
    //   2361: goto -> 2372
    //   2364: ldc2_w 1399428287
    //   2367: l2i
    //   2368: ldc_w -89676746
    //   2371: ixor
    //   2372: ldc2_w -401611160
    //   2375: l2i
    //   2376: ldc_w 2062464482
    //   2379: ixor
    //   2380: ixor
    //   2381: lookupswitch default -> 2408, -1971106705 -> 4530, 1152444769 -> 2364
    //   2408: goto -> 2412
    //   2411: athrow
    //   2412: invokevirtual toString : ()Ljava/lang/String;
    //   2415: goto -> 2419
    //   2418: athrow
    //   2419: getstatic Perryc.c : I
    //   2422: iflt -> 2436
    //   2425: ldc2_w -2078708630
    //   2428: l2i
    //   2429: ldc_w 1693865206
    //   2432: ixor
    //   2433: goto -> 2444
    //   2436: ldc2_w -1327591213
    //   2439: l2i
    //   2440: ldc_w -512063372
    //   2443: ixor
    //   2444: ldc2_w 138655228
    //   2447: l2i
    //   2448: ldc_w -1774668567
    //   2451: ixor
    //   2452: ixor
    //   2453: lookupswitch default -> 2480, 1520822464 -> 2436, 2123643273 -> 4496
    //   2480: goto -> 2484
    //   2483: athrow
    //   2484: invokestatic requestIDs : (Ljava/lang/String;)Ljava/lang/String;
    //   2487: goto -> 2491
    //   2490: athrow
    //   2491: getstatic Perryc.c : I
    //   2494: iflt -> 2508
    //   2497: ldc2_w -1478111263
    //   2500: l2i
    //   2501: ldc_w 255300000
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -634115102
    //   2511: l2i
    //   2512: ldc_w -515816937
    //   2515: ixor
    //   2516: ldc2_w 1557276681
    //   2519: l2i
    //   2520: ldc_w -291760369
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 4428, -1992599821 -> 2552, 446456135 -> 2508
    //   2552: astore_2
    //   2553: getstatic Perryc.c : I
    //   2556: iflt -> 2570
    //   2559: ldc2_w -185402918
    //   2562: l2i
    //   2563: ldc_w 2083110941
    //   2566: ixor
    //   2567: goto -> 2578
    //   2570: ldc2_w 401801281
    //   2573: l2i
    //   2574: ldc_w 1104059164
    //   2577: ixor
    //   2578: ldc2_w -2006739849
    //   2581: l2i
    //   2582: ldc_w 263027222
    //   2585: ixor
    //   2586: ixor
    //   2587: lookupswitch default -> 4470, -772573892 -> 2612, 253089702 -> 2570
    //   2612: aload_2
    //   2613: ifnull -> 2627
    //   2616: ldc2_w -525777508
    //   2619: l2i
    //   2620: ldc_w 1078533369
    //   2623: ixor
    //   2624: goto -> 2635
    //   2627: ldc2_w -1612418611
    //   2630: l2i
    //   2631: ldc_w 1057237161
    //   2634: ixor
    //   2635: ldc2_w 332982383
    //   2638: l2i
    //   2639: ldc_w -1540429852
    //   2642: ixor
    //   2643: ixor
    //   2644: tableswitch default -> 2616, 387340014 -> 2668, 387340015 -> 4415
    //   2668: getstatic Perryc.1 : I
    //   2671: ifeq -> 2685
    //   2674: ldc2_w -137448782
    //   2677: l2i
    //   2678: ldc_w -2080512127
    //   2681: ixor
    //   2682: goto -> 2693
    //   2685: ldc2_w -325252899
    //   2688: l2i
    //   2689: ldc_w 684964882
    //   2692: ixor
    //   2693: ldc2_w 2479527
    //   2696: l2i
    //   2697: ldc_w -1944459637
    //   2700: ixor
    //   2701: ixor
    //   2702: lookupswitch default -> 2728, -133208545 -> 4504, 321233735 -> 2685
    //   2728: aload_2
    //   2729: getstatic Perryc.1 : I
    //   2732: ifeq -> 2746
    //   2735: ldc2_w 783088982
    //   2738: l2i
    //   2739: ldc_w 303968799
    //   2742: ixor
    //   2743: goto -> 2754
    //   2746: ldc2_w -1005953255
    //   2749: l2i
    //   2750: ldc_w 1973525353
    //   2753: ixor
    //   2754: ldc2_w 1748747378
    //   2757: l2i
    //   2758: ldc_w -165602396
    //   2761: ixor
    //   2762: ixor
    //   2763: lookupswitch default -> 2788, -1566044001 -> 4526, -1273573133 -> 2746
    //   2788: goto -> 2792
    //   2791: athrow
    //   2792: invokevirtual isEmpty : ()Z
    //   2795: goto -> 2799
    //   2798: athrow
    //   2799: ifeq -> 2813
    //   2802: ldc2_w 2086217728
    //   2805: l2i
    //   2806: ldc_w 1573722149
    //   2809: ixor
    //   2810: goto -> 2821
    //   2813: ldc2_w 2143078712
    //   2816: l2i
    //   2817: ldc_w 1579743516
    //   2820: ixor
    //   2821: ldc2_w 1946848224
    //   2824: l2i
    //   2825: ldc_w 344444811
    //   2828: ixor
    //   2829: ixor
    //   2830: tableswitch default -> 2802, 1092187214 -> 2852, 1092187215 -> 2855
    //   2852: goto -> 4415
    //   2855: new com/google/gson/JsonParser
    //   2858: dup
    //   2859: getstatic Perryc.1 : I
    //   2862: ifeq -> 2876
    //   2865: ldc2_w 474420672
    //   2868: l2i
    //   2869: ldc_w 1327418611
    //   2872: ixor
    //   2873: goto -> 2884
    //   2876: ldc2_w 421871235
    //   2879: l2i
    //   2880: ldc_w 726452538
    //   2883: ixor
    //   2884: ldc2_w -1141858749
    //   2887: l2i
    //   2888: ldc_w -212838916
    //   2891: ixor
    //   2892: ixor
    //   2893: lookupswitch default -> 4440, 469308044 -> 2876, 2060008454 -> 2920
    //   2920: goto -> 2924
    //   2923: athrow
    //   2924: invokespecial <init> : ()V
    //   2927: goto -> 2931
    //   2930: athrow
    //   2931: getstatic Perryc.1 : I
    //   2934: ifeq -> 2948
    //   2937: ldc2_w -1979700214
    //   2940: l2i
    //   2941: ldc_w 427746713
    //   2944: ixor
    //   2945: goto -> 2956
    //   2948: ldc2_w 2001481630
    //   2951: l2i
    //   2952: ldc_w -2019055417
    //   2955: ixor
    //   2956: ldc2_w -1306680753
    //   2959: l2i
    //   2960: ldc_w -1906343514
    //   2963: ixor
    //   2964: ixor
    //   2965: lookupswitch default -> 4456, -1354962310 -> 2948, -861297488 -> 2992
    //   2992: aload_2
    //   2993: getstatic Perryc.c : I
    //   2996: iflt -> 3010
    //   2999: ldc2_w 256165929
    //   3002: l2i
    //   3003: ldc_w -1493396647
    //   3006: ixor
    //   3007: goto -> 3018
    //   3010: ldc2_w -1983341630
    //   3013: l2i
    //   3014: ldc_w 1570475635
    //   3017: ixor
    //   3018: ldc2_w -1239562414
    //   3021: l2i
    //   3022: ldc_w -1088230263
    //   3025: ixor
    //   3026: ixor
    //   3027: lookupswitch default -> 3052, -1601736533 -> 4418, 1337155425 -> 3010
    //   3052: goto -> 3056
    //   3055: athrow
    //   3056: invokevirtual parse : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   3059: goto -> 3063
    //   3062: athrow
    //   3063: getstatic Perryc.1 : I
    //   3066: ifeq -> 3080
    //   3069: ldc2_w -459721448
    //   3072: l2i
    //   3073: ldc_w -244917521
    //   3076: ixor
    //   3077: goto -> 3088
    //   3080: ldc2_w 99239125
    //   3083: l2i
    //   3084: ldc_w -444244046
    //   3087: ixor
    //   3088: ldc2_w 1779388465
    //   3091: l2i
    //   3092: ldc_w 1577071974
    //   3095: ixor
    //   3096: ixor
    //   3097: lookupswitch default -> 4446, -731873744 -> 3124, 569412256 -> 3080
    //   3124: astore_3
    //   3125: getstatic Perryc.c : I
    //   3128: iflt -> 3142
    //   3131: ldc2_w -1479989214
    //   3134: l2i
    //   3135: ldc_w 753610665
    //   3138: ixor
    //   3139: goto -> 3150
    //   3142: ldc2_w -579927790
    //   3145: l2i
    //   3146: ldc_w -1726370438
    //   3149: ixor
    //   3150: ldc2_w 271636169
    //   3153: l2i
    //   3154: ldc_w -1910397668
    //   3157: ixor
    //   3158: ixor
    //   3159: lookupswitch default -> 3184, 147751016 -> 3142, 355693662 -> 4420
    //   3184: aload_3
    //   3185: getstatic Perryc.1 : I
    //   3188: ifeq -> 3202
    //   3191: ldc2_w 566442075
    //   3194: l2i
    //   3195: ldc_w 517438061
    //   3198: ixor
    //   3199: goto -> 3210
    //   3202: ldc2_w 1734003396
    //   3205: l2i
    //   3206: ldc_w 529383021
    //   3209: ixor
    //   3210: ldc2_w 1862018804
    //   3213: l2i
    //   3214: ldc_w 1097438755
    //   3217: ixor
    //   3218: ixor
    //   3219: lookupswitch default -> 4472, 276951777 -> 3202, 1463993470 -> 3244
    //   3244: goto -> 3248
    //   3247: athrow
    //   3248: invokevirtual getAsJsonArray : ()Lcom/google/gson/JsonArray;
    //   3251: goto -> 3255
    //   3254: athrow
    //   3255: getstatic Perryc.0 : I
    //   3258: ifle -> 3272
    //   3261: ldc2_w -473494557
    //   3264: l2i
    //   3265: ldc_w 1757989976
    //   3268: ixor
    //   3269: goto -> 3280
    //   3272: ldc2_w 1203720453
    //   3275: l2i
    //   3276: ldc_w -1292597025
    //   3279: ixor
    //   3280: ldc2_w -1033013918
    //   3283: l2i
    //   3284: ldc_w 1645841256
    //   3287: ixor
    //   3288: ixor
    //   3289: lookupswitch default -> 3316, -803895063 -> 3272, 729495985 -> 4434
    //   3316: goto -> 3320
    //   3319: athrow
    //   3320: invokevirtual size : ()I
    //   3323: goto -> 3327
    //   3326: athrow
    //   3327: ifne -> 3341
    //   3330: ldc2_w 1469162716
    //   3333: l2i
    //   3334: ldc_w 1048056401
    //   3337: ixor
    //   3338: goto -> 3349
    //   3341: ldc2_w -579248214
    //   3344: l2i
    //   3345: ldc_w -1265571546
    //   3348: ixor
    //   3349: ldc2_w 2052070345
    //   3352: l2i
    //   3353: ldc_w -2021004894
    //   3356: ixor
    //   3357: ixor
    //   3358: tableswitch default -> 3330, -1808775962 -> 3380, -1808775961 -> 3383
    //   3380: goto -> 4415
    //   3383: getstatic Perryc.0 : I
    //   3386: ifle -> 3400
    //   3389: ldc2_w 136137282
    //   3392: l2i
    //   3393: ldc_w -272384326
    //   3396: ixor
    //   3397: goto -> 3408
    //   3400: ldc2_w -701767283
    //   3403: l2i
    //   3404: ldc_w -312090600
    //   3407: ixor
    //   3408: ldc2_w 1212083986
    //   3411: l2i
    //   3412: ldc_w -223917948
    //   3415: ixor
    //   3416: ixor
    //   3417: lookupswitch default -> 3444, 1564955502 -> 4430, 1589244835 -> 3400
    //   3444: aload_3
    //   3445: getstatic Perryc.c : I
    //   3448: iflt -> 3462
    //   3451: ldc2_w 254874759
    //   3454: l2i
    //   3455: ldc_w -1723858607
    //   3458: ixor
    //   3459: goto -> 3470
    //   3462: ldc2_w -832239646
    //   3465: l2i
    //   3466: ldc_w -1840205954
    //   3469: ixor
    //   3470: ldc2_w -1098805083
    //   3473: l2i
    //   3474: ldc_w -436228198
    //   3477: ixor
    //   3478: ixor
    //   3479: lookupswitch default -> 3504, -854643991 -> 4438, 628686118 -> 3462
    //   3504: goto -> 3508
    //   3507: athrow
    //   3508: invokevirtual getAsJsonArray : ()Lcom/google/gson/JsonArray;
    //   3511: goto -> 3515
    //   3514: athrow
    //   3515: ldc2_w 1910812331
    //   3518: l2i
    //   3519: ldc_w 1910812331
    //   3522: ixor
    //   3523: getstatic Perryc.c : I
    //   3526: iflt -> 3540
    //   3529: ldc2_w -192581754
    //   3532: l2i
    //   3533: ldc_w -1964837361
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w 1550081333
    //   3543: l2i
    //   3544: ldc_w 779482861
    //   3547: ixor
    //   3548: ldc2_w 639104751
    //   3551: l2i
    //   3552: ldc_w 1509030695
    //   3555: ixor
    //   3556: ixor
    //   3557: lookupswitch default -> 3584, -1883273874 -> 3540, 25269313 -> 4528
    //   3584: goto -> 3588
    //   3587: athrow
    //   3588: invokevirtual get : (I)Lcom/google/gson/JsonElement;
    //   3591: goto -> 3595
    //   3594: athrow
    //   3595: getstatic Perryc.1 : I
    //   3598: ifeq -> 3612
    //   3601: ldc2_w -1811479252
    //   3604: l2i
    //   3605: ldc_w -182041586
    //   3608: ixor
    //   3609: goto -> 3620
    //   3612: ldc2_w 1529641625
    //   3615: l2i
    //   3616: ldc_w 2131057689
    //   3619: ixor
    //   3620: ldc2_w 791792761
    //   3623: l2i
    //   3624: ldc_w -909380975
    //   3627: ixor
    //   3628: ixor
    //   3629: lookupswitch default -> 4484, -2015658038 -> 3612, -1026353048 -> 3656
    //   3656: goto -> 3660
    //   3659: athrow
    //   3660: invokevirtual getAsJsonObject : ()Lcom/google/gson/JsonObject;
    //   3663: goto -> 3667
    //   3666: athrow
    //   3667: ldc_w '꣠㌗'
    //   3670: getstatic Perryc.0 : I
    //   3673: ifle -> 3687
    //   3676: ldc2_w 1489300796
    //   3679: l2i
    //   3680: ldc_w 1437299730
    //   3683: ixor
    //   3684: goto -> 3695
    //   3687: ldc2_w 1650431566
    //   3690: l2i
    //   3691: ldc_w 1680858644
    //   3694: ixor
    //   3695: ldc2_w -1324783263
    //   3698: l2i
    //   3699: ldc_w 1842879419
    //   3702: ixor
    //   3703: ixor
    //   3704: lookupswitch default -> 4492, -776016908 -> 3687, -626967936 -> 3732
    //   3732: goto -> 3736
    //   3735: athrow
    //   3736: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3739: goto -> 3743
    //   3742: athrow
    //   3743: getstatic Perryc.c : I
    //   3746: iflt -> 3760
    //   3749: ldc2_w -1003897080
    //   3752: l2i
    //   3753: ldc_w -730001680
    //   3756: ixor
    //   3757: goto -> 3768
    //   3760: ldc2_w -783989385
    //   3763: l2i
    //   3764: ldc_w 2048552946
    //   3767: ixor
    //   3768: ldc2_w 1979096892
    //   3771: l2i
    //   3772: ldc_w -1414208747
    //   3775: ixor
    //   3776: ixor
    //   3777: lookupswitch default -> 4460, -837366319 -> 3760, 1964857004 -> 3804
    //   3804: goto -> 3808
    //   3807: athrow
    //   3808: invokevirtual get : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   3811: goto -> 3815
    //   3814: athrow
    //   3815: getstatic Perryc.1 : I
    //   3818: ifeq -> 3832
    //   3821: ldc2_w 964820308
    //   3824: l2i
    //   3825: ldc_w 1865779111
    //   3828: ixor
    //   3829: goto -> 3840
    //   3832: ldc2_w 598244896
    //   3835: l2i
    //   3836: ldc_w -1532539882
    //   3839: ixor
    //   3840: ldc2_w -169145998
    //   3843: l2i
    //   3844: ldc_w 1164577337
    //   3847: ixor
    //   3848: ixor
    //   3849: lookupswitch default -> 3876, -432703048 -> 4520, -25329254 -> 3832
    //   3876: goto -> 3880
    //   3879: athrow
    //   3880: invokevirtual getAsString : ()Ljava/lang/String;
    //   3883: goto -> 3887
    //   3886: athrow
    //   3887: getstatic Perryc.1 : I
    //   3890: ifeq -> 3904
    //   3893: ldc2_w 1005530217
    //   3896: l2i
    //   3897: ldc_w -538765506
    //   3900: ixor
    //   3901: goto -> 3912
    //   3904: ldc2_w 97824906
    //   3907: l2i
    //   3908: ldc_w -396230344
    //   3911: ixor
    //   3912: ldc2_w -2128679961
    //   3915: l2i
    //   3916: ldc_w -780685322
    //   3919: ixor
    //   3920: ixor
    //   3921: lookupswitch default -> 3948, -1268416698 -> 4448, 1774624704 -> 3904
    //   3948: astore #4
    //   3950: getstatic Perryc.0 : I
    //   3953: ifle -> 3967
    //   3956: ldc2_w -1583707527
    //   3959: l2i
    //   3960: ldc_w 1287453178
    //   3963: ixor
    //   3964: goto -> 3975
    //   3967: ldc2_w -1510442166
    //   3970: l2i
    //   3971: ldc_w 1101139801
    //   3974: ixor
    //   3975: ldc2_w 1983305570
    //   3978: l2i
    //   3979: ldc_w 1103706988
    //   3982: ixor
    //   3983: ixor
    //   3984: lookupswitch default -> 4506, -744122339 -> 4012, -623272051 -> 3967
    //   4012: aload_0
    //   4013: getstatic Perryc.c : I
    //   4016: iflt -> 4030
    //   4019: ldc2_w -25584849
    //   4022: l2i
    //   4023: ldc_w 574035212
    //   4026: ixor
    //   4027: goto -> 4038
    //   4030: ldc2_w -1888871361
    //   4033: l2i
    //   4034: ldc_w 1097975769
    //   4037: ixor
    //   4038: ldc2_w -1278483232
    //   4041: l2i
    //   4042: ldc_w 1516749431
    //   4045: ixor
    //   4046: ixor
    //   4047: lookupswitch default -> 4462, 666369393 -> 4072, 904046772 -> 4030
    //   4072: aload #4
    //   4074: getstatic Perryc.0 : I
    //   4077: ifle -> 4091
    //   4080: ldc2_w -1241060182
    //   4083: l2i
    //   4084: ldc_w 1912388841
    //   4087: ixor
    //   4088: goto -> 4099
    //   4091: ldc2_w -1901330022
    //   4094: l2i
    //   4095: ldc_w 791470703
    //   4098: ixor
    //   4099: ldc2_w -673297321
    //   4102: l2i
    //   4103: ldc_w 2125117505
    //   4106: ixor
    //   4107: ixor
    //   4108: lookupswitch default -> 4494, 150214627 -> 4136, 1854841941 -> 4091
    //   4136: goto -> 4140
    //   4139: athrow
    //   4140: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
    //   4143: goto -> 4147
    //   4146: athrow
    //   4147: getstatic Perryc.0 : I
    //   4150: ifle -> 4164
    //   4153: ldc2_w -1020274646
    //   4156: l2i
    //   4157: ldc_w 1462948027
    //   4160: ixor
    //   4161: goto -> 4172
    //   4164: ldc2_w 389689140
    //   4167: l2i
    //   4168: ldc_w 2134677919
    //   4171: ixor
    //   4172: ldc2_w 1446083254
    //   4175: l2i
    //   4176: ldc_w -2032317209
    //   4179: ixor
    //   4180: ixor
    //   4181: lookupswitch default -> 4208, 849637139 -> 4164, 1156660928 -> 4502
    //   4208: putfield uuid : Ljava/util/UUID;
    //   4211: goto -> 4415
    //   4214: getstatic Perryc.0 : I
    //   4217: ifle -> 4231
    //   4220: ldc2_w 1804199232
    //   4223: l2i
    //   4224: ldc_w -798601005
    //   4227: ixor
    //   4228: goto -> 4239
    //   4231: ldc2_w -1648383361
    //   4234: l2i
    //   4235: ldc_w -319822164
    //   4238: ixor
    //   4239: ldc2_w 1332878755
    //   4242: l2i
    //   4243: ldc_w 747058232
    //   4246: ixor
    //   4247: ixor
    //   4248: lookupswitch default -> 4276, -669344760 -> 4514, -528001839 -> 4231
    //   4276: astore #4
    //   4278: getstatic Perryc.0 : I
    //   4281: ifle -> 4295
    //   4284: ldc2_w 128592758
    //   4287: l2i
    //   4288: ldc_w -870642210
    //   4291: ixor
    //   4292: goto -> 4303
    //   4295: ldc2_w -1766974186
    //   4298: l2i
    //   4299: ldc_w 1754647671
    //   4302: ixor
    //   4303: ldc2_w -1373418199
    //   4306: l2i
    //   4307: ldc_w 1923421114
    //   4310: ixor
    //   4311: ixor
    //   4312: lookupswitch default -> 4340, -125003575 -> 4295, 389511227 -> 4512
    //   4340: aload #4
    //   4342: getstatic Perryc.1 : I
    //   4345: ifeq -> 4359
    //   4348: ldc2_w -765306875
    //   4351: l2i
    //   4352: ldc_w 106198214
    //   4355: ixor
    //   4356: goto -> 4367
    //   4359: ldc2_w 9616737
    //   4362: l2i
    //   4363: ldc_w 13031007
    //   4366: ixor
    //   4367: ldc2_w 1555310613
    //   4370: l2i
    //   4371: ldc_w 769067286
    //   4374: ixor
    //   4375: ixor
    //   4376: lookupswitch default -> 4490, -1521152576 -> 4359, 1899448893 -> 4404
    //   4404: goto -> 4408
    //   4407: athrow
    //   4408: invokevirtual printStackTrace : ()V
    //   4411: goto -> 4415
    //   4414: athrow
    //   4415: return
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
    //   4492: aconst_null
    //   4493: athrow
    //   4494: aconst_null
    //   4495: athrow
    //   4496: aconst_null
    //   4497: athrow
    //   4498: aconst_null
    //   4499: athrow
    //   4500: aconst_null
    //   4501: athrow
    //   4502: aconst_null
    //   4503: athrow
    //   4504: aconst_null
    //   4505: athrow
    //   4506: aconst_null
    //   4507: athrow
    //   4508: aconst_null
    //   4509: athrow
    //   4510: aconst_null
    //   4511: athrow
    //   4512: aconst_null
    //   4513: athrow
    //   4514: aconst_null
    //   4515: athrow
    //   4516: aconst_null
    //   4517: athrow
    //   4518: aconst_null
    //   4519: athrow
    //   4520: aconst_null
    //   4521: athrow
    //   4522: aconst_null
    //   4523: athrow
    //   4524: aconst_null
    //   4525: athrow
    //   4526: aconst_null
    //   4527: athrow
    //   4528: aconst_null
    //   4529: athrow
    //   4530: aconst_null
    //   4531: athrow
    //   4532: aconst_null
    //   4533: athrow
    //   4534: aconst_null
    //   4535: athrow
    //   4536: pop
    //   4537: goto -> 24
    //   4540: pop
    //   4541: aconst_null
    //   4542: goto -> 4536
    //   4545: dup
    //   4546: ifnull -> 4536
    //   4549: checkcast java/lang/Throwable
    //   4552: athrow
    //   4553: dup
    //   4554: ifnull -> 4540
    //   4557: checkcast java/lang/Throwable
    //   4560: athrow
    //   4561: aconst_null
    //   4562: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   421	1114	2	infoMap	Ljava/util/ArrayList;
    //   901	637	1	profile	Lnet/minecraft/client/network/NetworkPlayerInfo;
    //   1601	64	2	e2	Ljava/lang/Exception;
    //   3950	261	4	id	Ljava/lang/String;
    //   4278	137	4	e	Ljava/lang/Exception;
    //   3125	1290	3	element	Lcom/google/gson/JsonElement;
    //   2553	1862	2	s	Ljava/lang/String;
    //   24	4392	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil$lookUpUUID;
    //   1665	2751	1	profile	Lnet/minecraft/client/network/NetworkPlayerInfo;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   421	1114	2	infoMap	Ljava/util/ArrayList<Lnet/minecraft/client/network/NetworkPlayerInfo;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	4545	java/lang/EnumConstantNotPresentException
    //   24	147	1538	java/lang/Exception
    //   148	154	154	finally
    //   148	154	154	java/lang/UnsupportedOperationException
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	154	java/lang/IndexOutOfBoundsException
    //   148	1535	1538	java/lang/Exception
    //   215	222	222	finally
    //   215	222	222	finally
    //   216	222	215	java/lang/RuntimeException
    //   216	222	222	finally
    //   216	222	3	finally
    //   287	294	294	finally
    //   287	294	3	java/util/ConcurrentModificationException
    //   287	294	287	finally
    //   288	294	294	java/lang/IllegalStateException
    //   288	294	294	finally
    //   355	362	362	finally
    //   355	362	355	finally
    //   355	362	355	finally
    //   356	362	355	java/lang/NullPointerException
    //   356	362	3	finally
    //   543	550	550	finally
    //   543	550	550	finally
    //   543	550	543	finally
    //   543	550	543	finally
    //   544	550	3	finally
    //   679	688	688	finally
    //   679	688	679	java/lang/StringIndexOutOfBoundsException
    //   679	688	688	finally
    //   680	688	679	finally
    //   680	688	3	java/lang/EnumConstantNotPresentException
    //   751	760	760	finally
    //   751	760	3	finally
    //   751	760	3	finally
    //   752	760	760	java/lang/ArithmeticException
    //   752	760	751	finally
    //   827	834	834	finally
    //   827	834	827	java/lang/NullPointerException
    //   827	834	827	finally
    //   828	834	3	finally
    //   828	834	834	java/lang/ArithmeticException
    //   1199	1206	1206	finally
    //   1199	1206	1206	finally
    //   1199	1206	1206	finally
    //   1200	1206	1199	java/lang/AssertionError
    //   1200	1206	1199	java/util/NoSuchElementException
    //   1391	1398	1398	finally
    //   1391	1398	3	finally
    //   1392	1398	1398	java/lang/RuntimeException
    //   1392	1398	1398	finally
    //   1392	1398	1391	finally
    //   1463	1470	1470	finally
    //   1463	1470	1470	finally
    //   1463	1470	1463	java/lang/AssertionError
    //   1464	1470	3	java/lang/IllegalArgumentException
    //   1464	1470	1463	java/lang/UnsupportedOperationException
    //   1847	1854	1854	finally
    //   1847	1854	1847	java/lang/IndexOutOfBoundsException
    //   1847	1854	3	java/lang/NullPointerException
    //   1848	1854	1847	finally
    //   1848	1854	3	finally
    //   1923	1930	1930	finally
    //   1923	1930	1923	finally
    //   1923	1930	1923	finally
    //   1924	1930	1923	java/lang/IllegalArgumentException
    //   1924	1930	3	java/util/ConcurrentModificationException
    //   1995	2002	2002	finally
    //   1995	2002	1995	java/util/ConcurrentModificationException
    //   1995	2002	2002	finally
    //   1995	2002	1995	java/lang/IndexOutOfBoundsException
    //   1996	2002	1995	java/lang/IllegalArgumentException
    //   2191	2198	2198	finally
    //   2191	2198	2198	java/lang/NumberFormatException
    //   2191	2198	2198	java/lang/IndexOutOfBoundsException
    //   2191	2198	3	finally
    //   2192	2198	2191	java/lang/ArrayIndexOutOfBoundsException
    //   2267	2274	2274	finally
    //   2267	2274	3	java/lang/ClassCastException
    //   2267	2274	2267	java/lang/IndexOutOfBoundsException
    //   2267	2274	3	java/lang/ArithmeticException
    //   2268	2274	2274	finally
    //   2339	2346	2346	finally
    //   2339	2346	2339	java/util/NoSuchElementException
    //   2339	2346	2339	finally
    //   2340	2346	2339	java/lang/IndexOutOfBoundsException
    //   2340	2346	2346	java/lang/IllegalArgumentException
    //   2411	2418	2418	finally
    //   2411	2418	2411	finally
    //   2412	2418	2418	java/lang/UnsupportedOperationException
    //   2412	2418	2411	finally
    //   2412	2418	2418	finally
    //   2484	2490	2490	finally
    //   2484	2490	2490	java/lang/ArithmeticException
    //   2484	2490	3	java/lang/ArrayIndexOutOfBoundsException
    //   2484	2490	2490	java/lang/AssertionError
    //   2484	2490	3	finally
    //   2791	2798	2798	finally
    //   2791	2798	2791	java/lang/IndexOutOfBoundsException
    //   2791	2798	2798	finally
    //   2792	2798	2791	finally
    //   2792	2798	3	finally
    //   2923	2930	2930	finally
    //   2924	2930	2923	finally
    //   2924	2930	2923	finally
    //   2924	2930	2930	finally
    //   2924	2930	3	java/lang/NumberFormatException
    //   3055	3062	3062	finally
    //   3055	3062	3062	java/lang/NegativeArraySizeException
    //   3056	3062	3055	java/lang/IllegalStateException
    //   3056	3062	3055	java/lang/NegativeArraySizeException
    //   3056	3062	3055	finally
    //   3247	3254	3254	finally
    //   3247	3254	3254	java/lang/ArrayIndexOutOfBoundsException
    //   3247	3254	3247	finally
    //   3248	3254	3247	finally
    //   3248	3254	3	java/lang/NullPointerException
    //   3320	3326	3326	finally
    //   3320	3326	3	java/lang/EnumConstantNotPresentException
    //   3320	3326	3326	java/lang/ArithmeticException
    //   3320	3326	3326	java/lang/IndexOutOfBoundsException
    //   3320	3326	3326	java/lang/ClassCastException
    //   3383	3507	4214	java/lang/Exception
    //   3508	3514	3514	finally
    //   3508	3514	3514	finally
    //   3508	3514	3514	finally
    //   3508	3514	3	finally
    //   3508	3514	3514	java/util/ConcurrentModificationException
    //   3508	3659	4214	java/lang/Exception
    //   3587	3594	3594	finally
    //   3587	3594	3	finally
    //   3587	3594	3587	finally
    //   3588	3594	3	finally
    //   3588	3594	3	finally
    //   3660	3666	3666	finally
    //   3660	3666	3666	java/lang/IllegalStateException
    //   3660	3666	3	java/lang/NegativeArraySizeException
    //   3660	3666	3	finally
    //   3660	3666	3666	java/lang/UnsupportedOperationException
    //   3660	4211	4214	java/lang/Exception
    //   3735	3742	3742	finally
    //   3736	3742	3	java/lang/ArithmeticException
    //   3736	3742	3735	java/lang/RuntimeException
    //   3736	3742	3742	java/lang/NullPointerException
    //   3736	3742	3742	java/util/NoSuchElementException
    //   3807	3814	3814	finally
    //   3807	3814	3814	java/util/ConcurrentModificationException
    //   3807	3814	3807	java/lang/IllegalArgumentException
    //   3808	3814	3807	finally
    //   3808	3814	3	finally
    //   3879	3886	3886	finally
    //   3879	3886	3886	finally
    //   3880	3886	3879	java/lang/IllegalArgumentException
    //   3880	3886	3	java/util/NoSuchElementException
    //   3880	3886	3886	finally
    //   4139	4146	4146	finally
    //   4139	4146	4139	finally
    //   4139	4146	4139	finally
    //   4140	4146	3	java/util/NoSuchElementException
    //   4140	4146	3	finally
    //   4408	4414	4414	finally
    //   4408	4414	4414	finally
    //   4408	4414	4414	java/lang/ArrayIndexOutOfBoundsException
    //   4408	4414	4414	finally
    //   4408	4414	4414	finally
    //   4545	4553	4545	java/lang/AssertionError
    //   4561	4563	3	finally
  }
  
  static {
    // Byte code:
    //   0: ldc_w bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil
    //   3: getstatic Perryc.0 : I
    //   6: ifle -> 20
    //   9: ldc2_w 1630294197
    //   12: l2i
    //   13: ldc_w -6768149
    //   16: ixor
    //   17: goto -> 28
    //   20: ldc2_w 305815395
    //   23: l2i
    //   24: ldc_w 1459911004
    //   27: ixor
    //   28: ldc2_w 869620275
    //   31: l2i
    //   32: ldc_w -1865159115
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 204, -432500167 -> 64, 1035099480 -> 20
    //   64: invokevirtual desiredAssertionStatus : ()Z
    //   67: ifne -> 81
    //   70: ldc2_w -68642217
    //   73: l2i
    //   74: ldc_w -130965952
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -724808663
    //   84: l2i
    //   85: ldc_w -686471105
    //   88: ixor
    //   89: ldc2_w -1722147894
    //   92: l2i
    //   93: ldc_w -2002529097
    //   96: ixor
    //   97: ixor
    //   98: tableswitch default -> 70, 304139114 -> 120, 304139115 -> 131
    //   120: ldc2_w -1132227644
    //   123: l2i
    //   124: ldc_w -1132227643
    //   127: ixor
    //   128: goto -> 139
    //   131: ldc2_w -1855103709
    //   134: l2i
    //   135: ldc_w -1855103709
    //   138: ixor
    //   139: getstatic Perryc.0 : I
    //   142: ifle -> 156
    //   145: ldc2_w 239166373
    //   148: l2i
    //   149: ldc_w -1286388466
    //   152: ixor
    //   153: goto -> 164
    //   156: ldc2_w 1329411301
    //   159: l2i
    //   160: ldc_w -90645897
    //   163: ixor
    //   164: ldc2_w 1494381237
    //   167: l2i
    //   168: ldc_w 2100546586
    //   171: ixor
    //   172: ixor
    //   173: lookupswitch default -> 206, -1853599683 -> 200, -1724671996 -> 156
    //   200: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreePlayerUtil$lookUpUUID.$assertionsDisabled : Z
    //   203: return
    //   204: aconst_null
    //   205: athrow
    //   206: aconst_null
    //   207: athrow
  }
  
  public boolean lambda$run$0(NetworkPlayerInfo paramNetworkPlayerInfo) {
    return Perry1.5M(this, (int)1945878434L ^ 0x2B9BA3BB, paramNetworkPlayerInfo);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreePlayerUtil$lookUpUUID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */