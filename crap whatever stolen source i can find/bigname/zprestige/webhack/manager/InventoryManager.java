package bigname.zprestige.webhack.manager;

import Perry1;
import bigname.zprestige.webhack.util.Util;

public class InventoryManager implements Util {
  public int recoverySlot;
  
  public int currentPlayerItem;
  
  public void recoverSilent(int paramInt) {
    Perry1.C(this, (int)-1013474542L ^ 0xE388838F, paramInt);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void update() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3109
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 3101
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3093
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 2080778731
    //   33: l2i
    //   34: ldc -680907925
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1295927653
    //   43: l2i
    //   44: ldc -1566382090
    //   46: ixor
    //   47: ldc2_w -573250367
    //   50: l2i
    //   51: ldc 1566301790
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 3036, 736311327 -> 40, 1863554060 -> 80
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w 2084058070
    //   90: l2i
    //   91: ldc -1033815319
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 101823142
    //   100: l2i
    //   101: ldc 896189382
    //   103: ixor
    //   104: ldc2_w -1194063324
    //   107: l2i
    //   108: ldc 252765272
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, 161343299 -> 3016, 1133827206 -> 97
    //   140: getfield recoverySlot : I
    //   143: ldc2_w -39359237
    //   146: l2i
    //   147: ldc 39359236
    //   149: ixor
    //   150: if_icmpeq -> 163
    //   153: ldc2_w 945673185
    //   156: l2i
    //   157: ldc -1845748262
    //   159: ixor
    //   160: goto -> 170
    //   163: ldc2_w 1129663674
    //   166: l2i
    //   167: ldc -353074560
    //   169: ixor
    //   170: ldc2_w -1265329777
    //   173: l2i
    //   174: ldc 1520588970
    //   176: ixor
    //   177: ixor
    //   178: tableswitch default -> 153, 1201082142 -> 200, 1201082143 -> 2995
    //   200: getstatic Perryc.0 : I
    //   203: ifle -> 216
    //   206: ldc2_w 471899390
    //   209: l2i
    //   210: ldc -1063022334
    //   212: ixor
    //   213: goto -> 223
    //   216: ldc2_w 119274716
    //   219: l2i
    //   220: ldc 1973926933
    //   222: ixor
    //   223: ldc2_w 1110951918
    //   226: l2i
    //   227: ldc -1542908659
    //   229: ixor
    //   230: ixor
    //   231: lookupswitch default -> 3068, -1803382230 -> 256, 985521951 -> 216
    //   256: getstatic bigname/zprestige/webhack/manager/InventoryManager.mc : Lnet/minecraft/client/Minecraft;
    //   259: getstatic Perryc.c : I
    //   262: iflt -> 275
    //   265: ldc2_w -1826962403
    //   268: l2i
    //   269: ldc 1242443820
    //   271: ixor
    //   272: goto -> 282
    //   275: ldc2_w -2002187745
    //   278: l2i
    //   279: ldc -3922587
    //   281: ixor
    //   282: ldc2_w -396324001
    //   285: l2i
    //   286: ldc 923090521
    //   288: ixor
    //   289: ixor
    //   290: lookupswitch default -> 3034, -1475837316 -> 316, 108091703 -> 275
    //   316: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   319: getstatic Perryc.0 : I
    //   322: ifle -> 335
    //   325: ldc2_w -1424557015
    //   328: l2i
    //   329: ldc 1054203544
    //   331: ixor
    //   332: goto -> 342
    //   335: ldc2_w -1885436856
    //   338: l2i
    //   339: ldc 1121154827
    //   341: ixor
    //   342: ldc2_w 1409616161
    //   345: l2i
    //   346: ldc 109918595
    //   348: ixor
    //   349: ixor
    //   350: lookupswitch default -> 376, -951381485 -> 3030, 2115755389 -> 335
    //   376: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   379: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   382: dup
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 399
    //   389: ldc2_w -1660607956
    //   392: l2i
    //   393: ldc 1325959917
    //   395: ixor
    //   396: goto -> 406
    //   399: ldc2_w 79441946
    //   402: l2i
    //   403: ldc 1012981706
    //   405: ixor
    //   406: ldc2_w -2113792371
    //   409: l2i
    //   410: ldc -24219852
    //   412: ixor
    //   413: ixor
    //   414: lookupswitch default -> 3006, -1367223944 -> 399, 1146132073 -> 440
    //   440: aload_0
    //   441: getstatic Perryc.1 : I
    //   444: ifeq -> 457
    //   447: ldc2_w -786750893
    //   450: l2i
    //   451: ldc 917590545
    //   453: ixor
    //   454: goto -> 464
    //   457: ldc2_w -1769533207
    //   460: l2i
    //   461: ldc 953859096
    //   463: ixor
    //   464: ldc2_w -1315301816
    //   467: l2i
    //   468: ldc 1902215982
    //   470: ixor
    //   471: ixor
    //   472: lookupswitch default -> 3070, 659678500 -> 457, 1856387479 -> 500
    //   500: getfield recoverySlot : I
    //   503: ldc2_w -673812187
    //   506: l2i
    //   507: ldc -673812179
    //   509: ixor
    //   510: if_icmpne -> 523
    //   513: ldc2_w 1010758495
    //   516: l2i
    //   517: ldc 2071925180
    //   519: ixor
    //   520: goto -> 530
    //   523: ldc2_w -1468961034
    //   526: l2i
    //   527: ldc -282031078
    //   529: ixor
    //   530: ldc2_w -684654117
    //   533: l2i
    //   534: ldc 933895711
    //   536: ixor
    //   537: ixor
    //   538: tableswitch default -> 513, -1478820569 -> 560, -1478820568 -> 570
    //   560: ldc2_w -1047812624
    //   563: l2i
    //   564: ldc -1047812617
    //   566: ixor
    //   567: goto -> 699
    //   570: getstatic Perryc.1 : I
    //   573: ifeq -> 586
    //   576: ldc2_w 1307475588
    //   579: l2i
    //   580: ldc -1894427030
    //   582: ixor
    //   583: goto -> 593
    //   586: ldc2_w -1309185532
    //   589: l2i
    //   590: ldc 1051904736
    //   592: ixor
    //   593: ldc2_w -523600919
    //   596: l2i
    //   597: ldc 329829482
    //   599: ixor
    //   600: ixor
    //   601: lookupswitch default -> 3024, 832151405 -> 586, 2082936679 -> 628
    //   628: aload_0
    //   629: getstatic Perryc.0 : I
    //   632: ifle -> 645
    //   635: ldc2_w -2046453752
    //   638: l2i
    //   639: ldc 186453416
    //   641: ixor
    //   642: goto -> 652
    //   645: ldc2_w -804610938
    //   648: l2i
    //   649: ldc 2144111291
    //   651: ixor
    //   652: ldc2_w -353656339
    //   655: l2i
    //   656: ldc 500032270
    //   658: ixor
    //   659: ixor
    //   660: lookupswitch default -> 3076, 1491096798 -> 688, 2050938691 -> 645
    //   688: getfield recoverySlot : I
    //   691: ldc2_w 195528718
    //   694: l2i
    //   695: ldc 195528719
    //   697: ixor
    //   698: iadd
    //   699: getstatic Perryc.c : I
    //   702: iflt -> 715
    //   705: ldc2_w 1119908309
    //   708: l2i
    //   709: ldc 234555711
    //   711: ixor
    //   712: goto -> 722
    //   715: ldc2_w 1832265166
    //   718: l2i
    //   719: ldc -2129396159
    //   721: ixor
    //   722: ldc2_w 1461523868
    //   725: l2i
    //   726: ldc -2085478955
    //   728: ixor
    //   729: ixor
    //   730: lookupswitch default -> 756, -1684770653 -> 3040, -1644252419 -> 715
    //   756: goto -> 760
    //   759: athrow
    //   760: invokespecial <init> : (I)V
    //   763: goto -> 767
    //   766: athrow
    //   767: getstatic Perryc.1 : I
    //   770: ifeq -> 783
    //   773: ldc2_w -1212392145
    //   776: l2i
    //   777: ldc 1252447659
    //   779: ixor
    //   780: goto -> 790
    //   783: ldc2_w -1291561878
    //   786: l2i
    //   787: ldc 819783137
    //   789: ixor
    //   790: ldc2_w -254425855
    //   793: l2i
    //   794: ldc 1005224840
    //   796: ixor
    //   797: ixor
    //   798: lookupswitch default -> 3062, 908447245 -> 783, 1223161602 -> 824
    //   824: goto -> 828
    //   827: athrow
    //   828: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   831: goto -> 835
    //   834: athrow
    //   835: getstatic Perryc.0 : I
    //   838: ifle -> 851
    //   841: ldc2_w 1106504018
    //   844: l2i
    //   845: ldc -641463654
    //   847: ixor
    //   848: goto -> 858
    //   851: ldc2_w 1122198435
    //   854: l2i
    //   855: ldc -2140971792
    //   857: ixor
    //   858: ldc2_w -85122298
    //   861: l2i
    //   862: ldc 1698816079
    //   864: ixor
    //   865: ixor
    //   866: lookupswitch default -> 892, -974951010 -> 851, 127606913 -> 3026
    //   892: getstatic bigname/zprestige/webhack/manager/InventoryManager.mc : Lnet/minecraft/client/Minecraft;
    //   895: getstatic Perryc.1 : I
    //   898: ifeq -> 911
    //   901: ldc2_w 1408357956
    //   904: l2i
    //   905: ldc 95527234
    //   907: ixor
    //   908: goto -> 918
    //   911: ldc2_w -2024500379
    //   914: l2i
    //   915: ldc 456912828
    //   917: ixor
    //   918: ldc2_w -687402033
    //   921: l2i
    //   922: ldc 1061732538
    //   924: ixor
    //   925: ixor
    //   926: lookupswitch default -> 952, -1106271117 -> 3072, 103408670 -> 911
    //   952: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   955: getstatic Perryc.c : I
    //   958: iflt -> 971
    //   961: ldc2_w 1797261340
    //   964: l2i
    //   965: ldc 1091998328
    //   967: ixor
    //   968: goto -> 978
    //   971: ldc2_w 516303283
    //   974: l2i
    //   975: ldc -1018460988
    //   977: ixor
    //   978: ldc2_w -493334326
    //   981: l2i
    //   982: ldc 1716155711
    //   984: ixor
    //   985: ixor
    //   986: lookupswitch default -> 2998, -1360740463 -> 971, 1499433090 -> 1012
    //   1012: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   1015: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   1018: dup
    //   1019: getstatic Perryc.c : I
    //   1022: iflt -> 1035
    //   1025: ldc2_w 212711261
    //   1028: l2i
    //   1029: ldc 1125323178
    //   1031: ixor
    //   1032: goto -> 1042
    //   1035: ldc2_w 71823451
    //   1038: l2i
    //   1039: ldc 908768655
    //   1041: ixor
    //   1042: ldc2_w -1858516485
    //   1045: l2i
    //   1046: ldc 2000225882
    //   1048: ixor
    //   1049: ixor
    //   1050: lookupswitch default -> 3074, -1447106218 -> 1035, -731051403 -> 1076
    //   1076: aload_0
    //   1077: getstatic Perryc.1 : I
    //   1080: ifeq -> 1093
    //   1083: ldc2_w 1608765418
    //   1086: l2i
    //   1087: ldc 1914866241
    //   1089: ixor
    //   1090: goto -> 1100
    //   1093: ldc2_w -1899796736
    //   1096: l2i
    //   1097: ldc 769566024
    //   1099: ixor
    //   1100: ldc2_w -155423352
    //   1103: l2i
    //   1104: ldc_w 1636195038
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 3000, -1157926147 -> 1093, 875033886 -> 1136
    //   1136: getfield recoverySlot : I
    //   1139: getstatic Perryc.c : I
    //   1142: iflt -> 1156
    //   1145: ldc2_w 1733375468
    //   1148: l2i
    //   1149: ldc_w -1820189057
    //   1152: ixor
    //   1153: goto -> 1164
    //   1156: ldc2_w 1538147612
    //   1159: l2i
    //   1160: ldc_w -1589475485
    //   1163: ixor
    //   1164: ldc2_w 144694876
    //   1167: l2i
    //   1168: ldc_w -607336403
    //   1171: ixor
    //   1172: ixor
    //   1173: lookupswitch default -> 3048, 662715874 -> 1156, 700437518 -> 1200
    //   1200: goto -> 1204
    //   1203: athrow
    //   1204: invokespecial <init> : (I)V
    //   1207: goto -> 1211
    //   1210: athrow
    //   1211: getstatic Perryc.c : I
    //   1214: iflt -> 1228
    //   1217: ldc2_w -278723190
    //   1220: l2i
    //   1221: ldc_w -805752692
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 870011812
    //   1231: l2i
    //   1232: ldc_w 1571557784
    //   1235: ixor
    //   1236: ldc2_w 1567861116
    //   1239: l2i
    //   1240: ldc_w -783119507
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, -1397025001 -> 3052, 1886814420 -> 1228
    //   1272: goto -> 1276
    //   1275: athrow
    //   1276: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   1279: goto -> 1283
    //   1282: athrow
    //   1283: getstatic Perryc.0 : I
    //   1286: ifle -> 1300
    //   1289: ldc2_w -811408657
    //   1292: l2i
    //   1293: ldc_w -400508750
    //   1296: ixor
    //   1297: goto -> 1308
    //   1300: ldc2_w -1924411752
    //   1303: l2i
    //   1304: ldc_w 198534195
    //   1307: ixor
    //   1308: ldc2_w 1001243987
    //   1311: l2i
    //   1312: ldc_w -1230667980
    //   1315: ixor
    //   1316: ixor
    //   1317: lookupswitch default -> 3008, -1433739206 -> 1300, 194384076 -> 1344
    //   1344: getstatic bigname/zprestige/webhack/manager/InventoryManager.mc : Lnet/minecraft/client/Minecraft;
    //   1347: getstatic Perryc.c : I
    //   1350: iflt -> 1364
    //   1353: ldc2_w 1481118460
    //   1356: l2i
    //   1357: ldc_w -267848654
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w 327654459
    //   1367: l2i
    //   1368: ldc_w 1209411948
    //   1371: ixor
    //   1372: ldc2_w -1023486
    //   1375: l2i
    //   1376: ldc_w 719829285
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 1408, -113991469 -> 1364, 2102869481 -> 2996
    //   1408: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1411: getstatic Perryc.1 : I
    //   1414: ifeq -> 1428
    //   1417: ldc2_w -707320566
    //   1420: l2i
    //   1421: ldc_w -1492323790
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w -1322778659
    //   1431: l2i
    //   1432: ldc_w 314167042
    //   1435: ixor
    //   1436: ldc2_w -2031483219
    //   1439: l2i
    //   1440: ldc_w 548353979
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, -727783890 -> 3028, -574036267 -> 1428
    //   1472: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   1475: getstatic Perryc.c : I
    //   1478: iflt -> 1492
    //   1481: ldc2_w -2002029672
    //   1484: l2i
    //   1485: ldc_w -314171583
    //   1488: ixor
    //   1489: goto -> 1500
    //   1492: ldc2_w -325585638
    //   1495: l2i
    //   1496: ldc_w -1275182967
    //   1499: ixor
    //   1500: ldc2_w -987322049
    //   1503: l2i
    //   1504: ldc_w 1821262627
    //   1507: ixor
    //   1508: ixor
    //   1509: lookupswitch default -> 3038, -867858747 -> 1492, -155099249 -> 1536
    //   1536: aload_0
    //   1537: getstatic Perryc.c : I
    //   1540: iflt -> 1554
    //   1543: ldc2_w -643373667
    //   1546: l2i
    //   1547: ldc_w -418986172
    //   1550: ixor
    //   1551: goto -> 1562
    //   1554: ldc2_w -1257193001
    //   1557: l2i
    //   1558: ldc_w 261800414
    //   1561: ixor
    //   1562: ldc2_w 1810214130
    //   1565: l2i
    //   1566: ldc_w -1999362810
    //   1569: ixor
    //   1570: ixor
    //   1571: lookupswitch default -> 1596, -577656019 -> 3060, 1402773851 -> 1554
    //   1596: getfield recoverySlot : I
    //   1599: getstatic Perryc.0 : I
    //   1602: ifle -> 1616
    //   1605: ldc2_w -1976472983
    //   1608: l2i
    //   1609: ldc_w 769576694
    //   1612: ixor
    //   1613: goto -> 1624
    //   1616: ldc2_w -640429588
    //   1619: l2i
    //   1620: ldc_w 1474990515
    //   1623: ixor
    //   1624: ldc2_w 853016539
    //   1627: l2i
    //   1628: ldc_w 1581555654
    //   1631: ixor
    //   1632: ixor
    //   1633: lookupswitch default -> 1660, -881015678 -> 3012, -857229911 -> 1616
    //   1660: putfield field_70461_c : I
    //   1663: getstatic Perryc.c : I
    //   1666: iflt -> 1680
    //   1669: ldc2_w 412473803
    //   1672: l2i
    //   1673: ldc_w -299181178
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w 489852415
    //   1683: l2i
    //   1684: ldc_w -874003407
    //   1687: ixor
    //   1688: ldc2_w 861259865
    //   1691: l2i
    //   1692: ldc_w -627286011
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 3032, 527870481 -> 1680, 1058857362 -> 1724
    //   1724: getstatic bigname/zprestige/webhack/manager/InventoryManager.mc : Lnet/minecraft/client/Minecraft;
    //   1727: getstatic Perryc.1 : I
    //   1730: ifeq -> 1744
    //   1733: ldc2_w -1498852537
    //   1736: l2i
    //   1737: ldc_w -1803893300
    //   1740: ixor
    //   1741: goto -> 1752
    //   1744: ldc2_w -2083353141
    //   1747: l2i
    //   1748: ldc_w 730160868
    //   1751: ixor
    //   1752: ldc2_w 591456959
    //   1755: l2i
    //   1756: ldc_w 2067341637
    //   1759: ixor
    //   1760: ixor
    //   1761: lookupswitch default -> 3056, -265414443 -> 1788, 1789549937 -> 1744
    //   1788: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1791: getstatic Perryc.1 : I
    //   1794: ifeq -> 1808
    //   1797: ldc2_w -1648816660
    //   1800: l2i
    //   1801: ldc_w 815646137
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w -816292391
    //   1811: l2i
    //   1812: ldc_w -858947779
    //   1815: ixor
    //   1816: ldc2_w 1707250807
    //   1819: l2i
    //   1820: ldc_w 1780783325
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 3082, -1564293889 -> 1808, 208875086 -> 1852
    //   1852: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
    //   1855: getstatic Perryc.c : I
    //   1858: iflt -> 1872
    //   1861: ldc2_w -1433323051
    //   1864: l2i
    //   1865: ldc_w 784465018
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w 96851354
    //   1875: l2i
    //   1876: ldc_w -234644815
    //   1879: ixor
    //   1880: ldc2_w -1423211075
    //   1883: l2i
    //   1884: ldc_w -1979349882
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 3050, -1518418796 -> 1872, -689418736 -> 1916
    //   1916: getfield field_70461_c : I
    //   1919: getstatic Perryc.1 : I
    //   1922: ifeq -> 1936
    //   1925: ldc2_w -865561927
    //   1928: l2i
    //   1929: ldc_w 897839232
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w 1260719368
    //   1939: l2i
    //   1940: ldc_w 603778595
    //   1943: ixor
    //   1944: ldc2_w 2124636086
    //   1947: l2i
    //   1948: ldc_w -1186743468
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 3042, -1355216951 -> 1980, 1040942811 -> 1936
    //   1980: istore_1
    //   1981: getstatic Perryc.0 : I
    //   1984: ifle -> 1998
    //   1987: ldc2_w 1529154856
    //   1990: l2i
    //   1991: ldc_w 1321738921
    //   1994: ixor
    //   1995: goto -> 2006
    //   1998: ldc2_w -800087080
    //   2001: l2i
    //   2002: ldc_w 1721329197
    //   2005: ixor
    //   2006: ldc2_w 4613593
    //   2009: l2i
    //   2010: ldc_w -1337451377
    //   2013: ixor
    //   2014: ixor
    //   2015: lookupswitch default -> 3054, -1511827753 -> 1998, 114867363 -> 2040
    //   2040: iload_1
    //   2041: getstatic Perryc.0 : I
    //   2044: ifle -> 2058
    //   2047: ldc2_w 772263322
    //   2050: l2i
    //   2051: ldc_w 678732009
    //   2054: ixor
    //   2055: goto -> 2066
    //   2058: ldc2_w 2089660650
    //   2061: l2i
    //   2062: ldc_w 2059868061
    //   2065: ixor
    //   2066: ldc2_w -11885678
    //   2069: l2i
    //   2070: ldc_w 91036996
    //   2073: ixor
    //   2074: ixor
    //   2075: lookupswitch default -> 3018, -61549659 -> 2058, -59958879 -> 2100
    //   2100: aload_0
    //   2101: getstatic Perryc.c : I
    //   2104: iflt -> 2118
    //   2107: ldc2_w 1473825119
    //   2110: l2i
    //   2111: ldc_w 1837153506
    //   2114: ixor
    //   2115: goto -> 2126
    //   2118: ldc2_w 848259893
    //   2121: l2i
    //   2122: ldc_w -1749987096
    //   2125: ixor
    //   2126: ldc2_w -1747981520
    //   2129: l2i
    //   2130: ldc_w -406241862
    //   2133: ixor
    //   2134: ixor
    //   2135: lookupswitch default -> 3002, -717689513 -> 2160, 1247716151 -> 2118
    //   2160: getfield currentPlayerItem : I
    //   2163: if_icmpeq -> 2177
    //   2166: ldc2_w -771339336
    //   2169: l2i
    //   2170: ldc_w 77458879
    //   2173: ixor
    //   2174: goto -> 2185
    //   2177: ldc2_w -99637003
    //   2180: l2i
    //   2181: ldc_w 747900659
    //   2184: ixor
    //   2185: ldc2_w 1852045855
    //   2188: l2i
    //   2189: ldc_w 968518280
    //   2192: ixor
    //   2193: ixor
    //   2194: tableswitch default -> 2166, -2126367088 -> 2216, -2126367087 -> 2863
    //   2216: getstatic Perryc.c : I
    //   2219: iflt -> 2233
    //   2222: ldc2_w -679141837
    //   2225: l2i
    //   2226: ldc_w 543393081
    //   2229: ixor
    //   2230: goto -> 2241
    //   2233: ldc2_w 924498846
    //   2236: l2i
    //   2237: ldc_w -1825405048
    //   2240: ixor
    //   2241: ldc2_w -1149942330
    //   2244: l2i
    //   2245: ldc_w 1397982465
    //   2248: ixor
    //   2249: ixor
    //   2250: lookupswitch default -> 3004, 532700109 -> 2233, 1276050641 -> 2276
    //   2276: aload_0
    //   2277: getstatic Perryc.0 : I
    //   2280: ifle -> 2294
    //   2283: ldc2_w -150113525
    //   2286: l2i
    //   2287: ldc_w 1956139856
    //   2290: ixor
    //   2291: goto -> 2302
    //   2294: ldc2_w -793448003
    //   2297: l2i
    //   2298: ldc_w 994564013
    //   2301: ixor
    //   2302: ldc2_w 240880653
    //   2305: l2i
    //   2306: ldc_w -1243526810
    //   2309: ixor
    //   2310: ixor
    //   2311: lookupswitch default -> 2336, -632651092 -> 2294, 942662960 -> 3022
    //   2336: iload_1
    //   2337: getstatic Perryc.c : I
    //   2340: iflt -> 2354
    //   2343: ldc2_w -853978969
    //   2346: l2i
    //   2347: ldc_w 1076369920
    //   2350: ixor
    //   2351: goto -> 2362
    //   2354: ldc2_w 146040197
    //   2357: l2i
    //   2358: ldc_w 6802641
    //   2361: ixor
    //   2362: ldc2_w -406210352
    //   2365: l2i
    //   2366: ldc_w -2103854658
    //   2369: ixor
    //   2370: ixor
    //   2371: lookupswitch default -> 3010, -396276791 -> 2354, 1837344826 -> 2396
    //   2396: putfield currentPlayerItem : I
    //   2399: getstatic Perryc.c : I
    //   2402: iflt -> 2416
    //   2405: ldc2_w -1873202874
    //   2408: l2i
    //   2409: ldc_w -1256295731
    //   2412: ixor
    //   2413: goto -> 2424
    //   2416: ldc2_w -1707868542
    //   2419: l2i
    //   2420: ldc_w -2018002813
    //   2423: ixor
    //   2424: ldc2_w 657872390
    //   2427: l2i
    //   2428: ldc_w -541885487
    //   2431: ixor
    //   2432: ixor
    //   2433: lookupswitch default -> 2460, -1913420142 -> 2416, -574460324 -> 3058
    //   2460: getstatic bigname/zprestige/webhack/manager/InventoryManager.mc : Lnet/minecraft/client/Minecraft;
    //   2463: getstatic Perryc.1 : I
    //   2466: ifeq -> 2480
    //   2469: ldc2_w 1917785069
    //   2472: l2i
    //   2473: ldc_w 2094165980
    //   2476: ixor
    //   2477: goto -> 2488
    //   2480: ldc2_w 55928880
    //   2483: l2i
    //   2484: ldc_w 1511041024
    //   2487: ixor
    //   2488: ldc2_w 410898152
    //   2491: l2i
    //   2492: ldc_w -622782038
    //   2495: ixor
    //   2496: ixor
    //   2497: lookupswitch default -> 2524, -872305805 -> 3078, 52384641 -> 2480
    //   2524: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2527: getstatic Perryc.1 : I
    //   2530: ifeq -> 2544
    //   2533: ldc2_w -2036458836
    //   2536: l2i
    //   2537: ldc_w -1579792998
    //   2540: ixor
    //   2541: goto -> 2552
    //   2544: ldc2_w -459113355
    //   2547: l2i
    //   2548: ldc_w -659907370
    //   2551: ixor
    //   2552: ldc2_w -789508003
    //   2555: l2i
    //   2556: ldc_w 1547564597
    //   2559: ixor
    //   2560: ixor
    //   2561: lookupswitch default -> 2588, -1417365154 -> 3066, -617940939 -> 2544
    //   2588: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   2591: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   2594: dup
    //   2595: getstatic Perryc.c : I
    //   2598: iflt -> 2612
    //   2601: ldc2_w 1795855587
    //   2604: l2i
    //   2605: ldc_w 310270171
    //   2608: ixor
    //   2609: goto -> 2620
    //   2612: ldc2_w -950155810
    //   2615: l2i
    //   2616: ldc_w 366182117
    //   2619: ixor
    //   2620: ldc2_w -1752256802
    //   2623: l2i
    //   2624: ldc_w -1399311561
    //   2627: ixor
    //   2628: ixor
    //   2629: lookupswitch default -> 3064, -375904558 -> 2656, 1113739729 -> 2612
    //   2656: aload_0
    //   2657: getstatic Perryc.0 : I
    //   2660: ifle -> 2674
    //   2663: ldc2_w -1685698721
    //   2666: l2i
    //   2667: ldc_w -1381389211
    //   2670: ixor
    //   2671: goto -> 2682
    //   2674: ldc2_w 443221446
    //   2677: l2i
    //   2678: ldc_w -2064585282
    //   2681: ixor
    //   2682: ldc2_w -1735552424
    //   2685: l2i
    //   2686: ldc_w -1186399408
    //   2689: ixor
    //   2690: ixor
    //   2691: lookupswitch default -> 2716, -1642482505 -> 2674, 401244722 -> 3020
    //   2716: getfield currentPlayerItem : I
    //   2719: getstatic Perryc.1 : I
    //   2722: ifeq -> 2736
    //   2725: ldc2_w -250777169
    //   2728: l2i
    //   2729: ldc_w 138092196
    //   2732: ixor
    //   2733: goto -> 2744
    //   2736: ldc2_w 1088695629
    //   2739: l2i
    //   2740: ldc_w 1933839092
    //   2743: ixor
    //   2744: ldc2_w -1023055142
    //   2747: l2i
    //   2748: ldc_w 441221913
    //   2751: ixor
    //   2752: ixor
    //   2753: lookupswitch default -> 3080, -353776006 -> 2780, 545228488 -> 2736
    //   2780: goto -> 2784
    //   2783: athrow
    //   2784: invokespecial <init> : (I)V
    //   2787: goto -> 2791
    //   2790: athrow
    //   2791: getstatic Perryc.1 : I
    //   2794: ifeq -> 2808
    //   2797: ldc2_w -1031682014
    //   2800: l2i
    //   2801: ldc_w 1310149325
    //   2804: ixor
    //   2805: goto -> 2816
    //   2808: ldc2_w 585445057
    //   2811: l2i
    //   2812: ldc_w 1579351270
    //   2815: ixor
    //   2816: ldc2_w 2073680452
    //   2819: l2i
    //   2820: ldc_w -1836038920
    //   2823: ixor
    //   2824: ixor
    //   2825: lookupswitch default -> 2852, 808455151 -> 2808, 1704926291 -> 3046
    //   2852: goto -> 2856
    //   2855: athrow
    //   2856: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   2859: goto -> 2863
    //   2862: athrow
    //   2863: getstatic Perryc.0 : I
    //   2866: ifle -> 2880
    //   2869: ldc2_w -1005708335
    //   2872: l2i
    //   2873: ldc_w -573068827
    //   2876: ixor
    //   2877: goto -> 2888
    //   2880: ldc2_w 1937305205
    //   2883: l2i
    //   2884: ldc_w 1680561721
    //   2887: ixor
    //   2888: ldc2_w -1298199947
    //   2891: l2i
    //   2892: ldc_w -1777083283
    //   2895: ixor
    //   2896: ixor
    //   2897: lookupswitch default -> 3014, 870280788 -> 2924, 1029006380 -> 2880
    //   2924: aload_0
    //   2925: ldc2_w -337105022
    //   2928: l2i
    //   2929: ldc_w 337105021
    //   2932: ixor
    //   2933: getstatic Perryc.0 : I
    //   2936: ifle -> 2950
    //   2939: ldc2_w 314613272
    //   2942: l2i
    //   2943: ldc_w -5465736
    //   2946: ixor
    //   2947: goto -> 2958
    //   2950: ldc2_w -985404506
    //   2953: l2i
    //   2954: ldc_w 1735563302
    //   2957: ixor
    //   2958: ldc2_w 1498236558
    //   2961: l2i
    //   2962: ldc_w 962285536
    //   2965: ixor
    //   2966: ixor
    //   2967: lookupswitch default -> 2992, -1921380850 -> 3044, -739997557 -> 2950
    //   2992: putfield recoverySlot : I
    //   2995: return
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
    //   3008: aconst_null
    //   3009: athrow
    //   3010: aconst_null
    //   3011: athrow
    //   3012: aconst_null
    //   3013: athrow
    //   3014: aconst_null
    //   3015: athrow
    //   3016: aconst_null
    //   3017: athrow
    //   3018: aconst_null
    //   3019: athrow
    //   3020: aconst_null
    //   3021: athrow
    //   3022: aconst_null
    //   3023: athrow
    //   3024: aconst_null
    //   3025: athrow
    //   3026: aconst_null
    //   3027: athrow
    //   3028: aconst_null
    //   3029: athrow
    //   3030: aconst_null
    //   3031: athrow
    //   3032: aconst_null
    //   3033: athrow
    //   3034: aconst_null
    //   3035: athrow
    //   3036: aconst_null
    //   3037: athrow
    //   3038: aconst_null
    //   3039: athrow
    //   3040: aconst_null
    //   3041: athrow
    //   3042: aconst_null
    //   3043: athrow
    //   3044: aconst_null
    //   3045: athrow
    //   3046: aconst_null
    //   3047: athrow
    //   3048: aconst_null
    //   3049: athrow
    //   3050: aconst_null
    //   3051: athrow
    //   3052: aconst_null
    //   3053: athrow
    //   3054: aconst_null
    //   3055: athrow
    //   3056: aconst_null
    //   3057: athrow
    //   3058: aconst_null
    //   3059: athrow
    //   3060: aconst_null
    //   3061: athrow
    //   3062: aconst_null
    //   3063: athrow
    //   3064: aconst_null
    //   3065: athrow
    //   3066: aconst_null
    //   3067: athrow
    //   3068: aconst_null
    //   3069: athrow
    //   3070: aconst_null
    //   3071: athrow
    //   3072: aconst_null
    //   3073: athrow
    //   3074: aconst_null
    //   3075: athrow
    //   3076: aconst_null
    //   3077: athrow
    //   3078: aconst_null
    //   3079: athrow
    //   3080: aconst_null
    //   3081: athrow
    //   3082: aconst_null
    //   3083: athrow
    //   3084: pop
    //   3085: goto -> 24
    //   3088: pop
    //   3089: aconst_null
    //   3090: goto -> 3084
    //   3093: dup
    //   3094: ifnull -> 3084
    //   3097: checkcast java/lang/Throwable
    //   3100: athrow
    //   3101: dup
    //   3102: ifnull -> 3088
    //   3105: checkcast java/lang/Throwable
    //   3108: athrow
    //   3109: aconst_null
    //   3110: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1981	1014	1	i	I
    //   24	2972	0	this	Lbigname/zprestige/webhack/manager/InventoryManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	3093	java/lang/IllegalStateException
    //   759	766	766	finally
    //   759	766	759	finally
    //   760	766	3	finally
    //   760	766	766	finally
    //   760	766	759	finally
    //   827	834	834	finally
    //   828	834	834	java/util/NoSuchElementException
    //   828	834	834	finally
    //   828	834	834	java/lang/NegativeArraySizeException
    //   828	834	827	java/lang/EnumConstantNotPresentException
    //   1203	1210	1210	finally
    //   1203	1210	1203	finally
    //   1203	1210	1203	finally
    //   1203	1210	1203	finally
    //   1204	1210	1210	finally
    //   1275	1282	1282	finally
    //   1275	1282	1282	java/lang/NullPointerException
    //   1275	1282	1282	finally
    //   1275	1282	1282	finally
    //   1276	1282	1275	finally
    //   2783	2790	2790	finally
    //   2783	2790	2790	finally
    //   2783	2790	2790	finally
    //   2784	2790	3	java/util/NoSuchElementException
    //   2784	2790	2783	finally
    //   2855	2862	2862	finally
    //   2856	2862	2855	finally
    //   2856	2862	2855	finally
    //   2856	2862	2862	java/lang/NumberFormatException
    //   2856	2862	3	java/lang/ClassCastException
    //   3093	3101	3093	finally
    //   3109	3111	3	java/lang/IllegalArgumentException
  }
  
  public InventoryManager() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1361038572
    //   9: l2i
    //   10: ldc_w -266823414
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1273663716
    //   20: l2i
    //   21: ldc_w -1923481931
    //   24: ixor
    //   25: ldc2_w -1517261267
    //   28: l2i
    //   29: ldc_w -773321595
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -713083058 -> 258, 2133231794 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 169543049
    //   70: l2i
    //   71: ldc_w 1615846269
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 513061142
    //   81: l2i
    //   82: ldc_w 117569488
    //   85: ixor
    //   86: ldc2_w -1343996766
    //   89: l2i
    //   90: ldc_w -537243059
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 256, 441102363 -> 78, 1770727465 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.1 : I
    //   126: ifeq -> 140
    //   129: ldc2_w -1822934859
    //   132: l2i
    //   133: ldc_w 968849318
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 736360541
    //   143: l2i
    //   144: ldc_w 973940355
    //   147: ixor
    //   148: ldc2_w 762421930
    //   151: l2i
    //   152: ldc_w 697469238
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 262, -1375443825 -> 140, 353236290 -> 184
    //   184: aload_0
    //   185: ldc2_w -1353158137
    //   188: l2i
    //   189: ldc_w 1353158136
    //   192: ixor
    //   193: getstatic Perryc.c : I
    //   196: iflt -> 210
    //   199: ldc2_w 2111211568
    //   202: l2i
    //   203: ldc_w -710926202
    //   206: ixor
    //   207: goto -> 218
    //   210: ldc2_w 432559268
    //   213: l2i
    //   214: ldc_w -1786492570
    //   217: ixor
    //   218: ldc2_w 1934646339
    //   221: l2i
    //   222: ldc_w -360122225
    //   225: ixor
    //   226: ixor
    //   227: lookupswitch default -> 260, 362068238 -> 252, 833490042 -> 210
    //   252: putfield recoverySlot : I
    //   255: return
    //   256: aconst_null
    //   257: athrow
    //   258: aconst_null
    //   259: athrow
    //   260: aconst_null
    //   261: athrow
    //   262: aconst_null
    //   263: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	256	0	this	Lbigname/zprestige/webhack/manager/InventoryManager;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\InventoryManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */