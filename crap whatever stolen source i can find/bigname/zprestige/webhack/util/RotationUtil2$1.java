package bigname.zprestige.webhack.util;

public class RotationUtil2$1 {
  public static int[] $SwitchMap$net$minecraft$util$EnumFacing;
  
  static {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1657922314
    //   9: l2i
    //   10: ldc 6395943
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -259053316
    //   19: l2i
    //   20: ldc -879678843
    //   22: ixor
    //   23: ldc2_w -1755249838
    //   26: l2i
    //   27: ldc -2093298836
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 1416, 793102919 -> 56, 1995158291 -> 16
    //   56: invokestatic values : ()[Lnet/minecraft/util/EnumFacing;
    //   59: arraylength
    //   60: newarray int
    //   62: getstatic Perryc.0 : I
    //   65: ifle -> 78
    //   68: ldc2_w 990416850
    //   71: l2i
    //   72: ldc 632987053
    //   74: ixor
    //   75: goto -> 85
    //   78: ldc2_w -175857855
    //   81: l2i
    //   82: ldc 444689568
    //   84: ixor
    //   85: ldc2_w 1273807739
    //   88: l2i
    //   89: ldc 552925311
    //   91: ixor
    //   92: ixor
    //   93: lookupswitch default -> 120, -1458065700 -> 78, 1974086011 -> 1418
    //   120: putstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 139
    //   129: ldc2_w -886182740
    //   132: l2i
    //   133: ldc -1792785092
    //   135: ixor
    //   136: goto -> 146
    //   139: ldc2_w 879076909
    //   142: l2i
    //   143: ldc 2085604301
    //   145: ixor
    //   146: ldc2_w -1959543980
    //   149: l2i
    //   150: ldc -979947953
    //   152: ixor
    //   153: ixor
    //   154: lookupswitch default -> 1426, 110033147 -> 180, 279788683 -> 139
    //   180: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w -1071776636
    //   192: l2i
    //   193: ldc -832073614
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1051404825
    //   202: l2i
    //   203: ldc 1719261084
    //   205: ixor
    //   206: ldc2_w -1047979479
    //   209: l2i
    //   210: ldc 639036246
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -370827895 -> 1394, -114564713 -> 199
    //   240: getstatic net/minecraft/util/EnumFacing.DOWN : Lnet/minecraft/util/EnumFacing;
    //   243: getstatic Perryc.c : I
    //   246: iflt -> 259
    //   249: ldc2_w -2047476011
    //   252: l2i
    //   253: ldc 2052177397
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w -744210239
    //   262: l2i
    //   263: ldc -213557995
    //   265: ixor
    //   266: ldc2_w 1074644870
    //   269: l2i
    //   270: ldc 259036090
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 300, -1327950052 -> 1404, 2134262904 -> 259
    //   300: invokevirtual ordinal : ()I
    //   303: ldc2_w -1701853227
    //   306: l2i
    //   307: ldc -1701853228
    //   309: ixor
    //   310: iastore
    //   311: goto -> 373
    //   314: getstatic Perryc.1 : I
    //   317: ifeq -> 330
    //   320: ldc2_w 1660271139
    //   323: l2i
    //   324: ldc 1888163036
    //   326: ixor
    //   327: goto -> 337
    //   330: ldc2_w -412516589
    //   333: l2i
    //   334: ldc 925972332
    //   336: ixor
    //   337: ldc2_w 741330746
    //   340: l2i
    //   341: ldc 1820448866
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 372, 1235912993 -> 330, 1389410727 -> 1398
    //   372: astore_0
    //   373: getstatic Perryc.1 : I
    //   376: ifeq -> 389
    //   379: ldc2_w 870259789
    //   382: l2i
    //   383: ldc -1070638926
    //   385: ixor
    //   386: goto -> 396
    //   389: ldc2_w -787423511
    //   392: l2i
    //   393: ldc -934545759
    //   395: ixor
    //   396: ldc2_w 1599856411
    //   399: l2i
    //   400: ldc -1036504629
    //   402: ixor
    //   403: ixor
    //   404: lookupswitch default -> 1408, -2076653928 -> 432, 1855171119 -> 389
    //   432: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   435: getstatic Perryc.1 : I
    //   438: ifeq -> 451
    //   441: ldc2_w -229547849
    //   444: l2i
    //   445: ldc -1586943354
    //   447: ixor
    //   448: goto -> 458
    //   451: ldc2_w 216466542
    //   454: l2i
    //   455: ldc 73626453
    //   457: ixor
    //   458: ldc2_w -1486672144
    //   461: l2i
    //   462: ldc -1992378479
    //   464: ixor
    //   465: ixor
    //   466: lookupswitch default -> 492, 1449826590 -> 451, 2103825232 -> 1428
    //   492: getstatic net/minecraft/util/EnumFacing.UP : Lnet/minecraft/util/EnumFacing;
    //   495: getstatic Perryc.0 : I
    //   498: ifle -> 511
    //   501: ldc2_w 857046691
    //   504: l2i
    //   505: ldc -1597975849
    //   507: ixor
    //   508: goto -> 518
    //   511: ldc2_w 2077285466
    //   514: l2i
    //   515: ldc 835129702
    //   517: ixor
    //   518: ldc2_w 1942863697
    //   521: l2i
    //   522: ldc 50628219
    //   524: ixor
    //   525: ixor
    //   526: lookupswitch default -> 552, -484666018 -> 1422, -315894206 -> 511
    //   552: invokevirtual ordinal : ()I
    //   555: ldc2_w -199775664
    //   558: l2i
    //   559: ldc -199775662
    //   561: ixor
    //   562: iastore
    //   563: goto -> 625
    //   566: getstatic Perryc.0 : I
    //   569: ifle -> 582
    //   572: ldc2_w -257336560
    //   575: l2i
    //   576: ldc 1585154764
    //   578: ixor
    //   579: goto -> 589
    //   582: ldc2_w -1988505702
    //   585: l2i
    //   586: ldc 1257752433
    //   588: ixor
    //   589: ldc2_w 1696299939
    //   592: l2i
    //   593: ldc -258615827
    //   595: ixor
    //   596: ixor
    //   597: lookupswitch default -> 1410, 995917714 -> 582, 1442883237 -> 624
    //   624: astore_0
    //   625: getstatic Perryc.0 : I
    //   628: ifle -> 641
    //   631: ldc2_w -1290887608
    //   634: l2i
    //   635: ldc -407300778
    //   637: ixor
    //   638: goto -> 648
    //   641: ldc2_w 530235704
    //   644: l2i
    //   645: ldc -232846238
    //   647: ixor
    //   648: ldc2_w 1812243509
    //   651: l2i
    //   652: ldc -587834227
    //   654: ixor
    //   655: ixor
    //   656: lookupswitch default -> 684, -465210458 -> 1412, 1303283978 -> 641
    //   684: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   687: getstatic Perryc.c : I
    //   690: iflt -> 703
    //   693: ldc2_w -18771438
    //   696: l2i
    //   697: ldc -1742378557
    //   699: ixor
    //   700: goto -> 710
    //   703: ldc2_w -57377679
    //   706: l2i
    //   707: ldc 80002609
    //   709: ixor
    //   710: ldc2_w -477267809
    //   713: l2i
    //   714: ldc -1411848679
    //   716: ixor
    //   717: ixor
    //   718: lookupswitch default -> 744, -875969704 -> 703, 781280599 -> 1400
    //   744: getstatic net/minecraft/util/EnumFacing.NORTH : Lnet/minecraft/util/EnumFacing;
    //   747: getstatic Perryc.c : I
    //   750: iflt -> 763
    //   753: ldc2_w 1676488119
    //   756: l2i
    //   757: ldc -311238554
    //   759: ixor
    //   760: goto -> 770
    //   763: ldc2_w 399958526
    //   766: l2i
    //   767: ldc -538275971
    //   769: ixor
    //   770: ldc2_w 703995105
    //   773: l2i
    //   774: ldc -1998301057
    //   776: ixor
    //   777: ixor
    //   778: lookupswitch default -> 1386, 797804879 -> 763, 1764633117 -> 804
    //   804: invokevirtual ordinal : ()I
    //   807: ldc2_w -1612355244
    //   810: l2i
    //   811: ldc -1612355241
    //   813: ixor
    //   814: iastore
    //   815: goto -> 877
    //   818: getstatic Perryc.c : I
    //   821: iflt -> 834
    //   824: ldc2_w -307436698
    //   827: l2i
    //   828: ldc 170820709
    //   830: ixor
    //   831: goto -> 841
    //   834: ldc2_w 1103533477
    //   837: l2i
    //   838: ldc 2110291482
    //   840: ixor
    //   841: ldc2_w -985368661
    //   844: l2i
    //   845: ldc -613430174
    //   847: ixor
    //   848: ixor
    //   849: lookupswitch default -> 1388, -106308406 -> 834, 572870774 -> 876
    //   876: astore_0
    //   877: getstatic Perryc.1 : I
    //   880: ifeq -> 893
    //   883: ldc2_w 666278607
    //   886: l2i
    //   887: ldc -553234040
    //   889: ixor
    //   890: goto -> 900
    //   893: ldc2_w 379967259
    //   896: l2i
    //   897: ldc 410306181
    //   899: ixor
    //   900: ldc2_w 767970362
    //   903: l2i
    //   904: ldc 548222198
    //   906: ixor
    //   907: ixor
    //   908: lookupswitch default -> 1424, -170151029 -> 893, 62548306 -> 936
    //   936: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   939: getstatic Perryc.1 : I
    //   942: ifeq -> 955
    //   945: ldc2_w 1847366040
    //   948: l2i
    //   949: ldc -1770625566
    //   951: ixor
    //   952: goto -> 962
    //   955: ldc2_w -1544343403
    //   958: l2i
    //   959: ldc -560170667
    //   961: ixor
    //   962: ldc2_w 1932171814
    //   965: l2i
    //   966: ldc -212734311
    //   968: ixor
    //   969: ixor
    //   970: lookupswitch default -> 996, 575030443 -> 955, 2014412997 -> 1414
    //   996: getstatic net/minecraft/util/EnumFacing.SOUTH : Lnet/minecraft/util/EnumFacing;
    //   999: getstatic Perryc.0 : I
    //   1002: ifle -> 1015
    //   1005: ldc2_w -1160732858
    //   1008: l2i
    //   1009: ldc -924636891
    //   1011: ixor
    //   1012: goto -> 1022
    //   1015: ldc2_w 1933497651
    //   1018: l2i
    //   1019: ldc 863224738
    //   1021: ixor
    //   1022: ldc2_w -1095991056
    //   1025: l2i
    //   1026: ldc -161491770
    //   1028: ixor
    //   1029: ixor
    //   1030: lookupswitch default -> 1390, 146686631 -> 1056, 985719381 -> 1015
    //   1056: invokevirtual ordinal : ()I
    //   1059: ldc2_w 1864491722
    //   1062: l2i
    //   1063: ldc 1864491726
    //   1065: ixor
    //   1066: iastore
    //   1067: goto -> 1129
    //   1070: getstatic Perryc.c : I
    //   1073: iflt -> 1086
    //   1076: ldc2_w -1395884999
    //   1079: l2i
    //   1080: ldc -364631532
    //   1082: ixor
    //   1083: goto -> 1093
    //   1086: ldc2_w -24814324
    //   1089: l2i
    //   1090: ldc -2071816516
    //   1092: ixor
    //   1093: ldc2_w 1323232702
    //   1096: l2i
    //   1097: ldc 1724822243
    //   1099: ixor
    //   1100: ixor
    //   1101: lookupswitch default -> 1420, 1377277165 -> 1128, 1855457648 -> 1086
    //   1128: astore_0
    //   1129: getstatic Perryc.c : I
    //   1132: iflt -> 1145
    //   1135: ldc2_w -702455135
    //   1138: l2i
    //   1139: ldc 655985797
    //   1141: ixor
    //   1142: goto -> 1152
    //   1145: ldc2_w 518957745
    //   1148: l2i
    //   1149: ldc -1019567790
    //   1151: ixor
    //   1152: ldc2_w 947165498
    //   1155: l2i
    //   1156: ldc 1350018232
    //   1158: ixor
    //   1159: ixor
    //   1160: lookupswitch default -> 1188, -1724132442 -> 1406, 1027071671 -> 1145
    //   1188: getstatic bigname/zprestige/webhack/util/RotationUtil2$1.$SwitchMap$net$minecraft$util$EnumFacing : [I
    //   1191: getstatic Perryc.1 : I
    //   1194: ifeq -> 1207
    //   1197: ldc2_w -1759472580
    //   1200: l2i
    //   1201: ldc -654210582
    //   1203: ixor
    //   1204: goto -> 1214
    //   1207: ldc2_w -1151012624
    //   1210: l2i
    //   1211: ldc 1396626223
    //   1213: ixor
    //   1214: ldc2_w 1993923030
    //   1217: l2i
    //   1218: ldc -411102522
    //   1220: ixor
    //   1221: ixor
    //   1222: lookupswitch default -> 1392, -544811322 -> 1207, 2046683343 -> 1248
    //   1248: getstatic net/minecraft/util/EnumFacing.WEST : Lnet/minecraft/util/EnumFacing;
    //   1251: getstatic Perryc.1 : I
    //   1254: ifeq -> 1267
    //   1257: ldc2_w 170972928
    //   1260: l2i
    //   1261: ldc -1305730135
    //   1263: ixor
    //   1264: goto -> 1274
    //   1267: ldc2_w 1298880002
    //   1270: l2i
    //   1271: ldc 270835086
    //   1273: ixor
    //   1274: ldc2_w -270927632
    //   1277: l2i
    //   1278: ldc -358650406
    //   1280: ixor
    //   1281: ixor
    //   1282: lookupswitch default -> 1396, -1118150269 -> 1267, 1477009062 -> 1308
    //   1308: invokevirtual ordinal : ()I
    //   1311: ldc2_w -1808076362
    //   1314: l2i
    //   1315: ldc_w -1808076365
    //   1318: ixor
    //   1319: iastore
    //   1320: goto -> 1385
    //   1323: getstatic Perryc.1 : I
    //   1326: ifeq -> 1340
    //   1329: ldc2_w 1316901853
    //   1332: l2i
    //   1333: ldc_w -118672656
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w -2143208975
    //   1343: l2i
    //   1344: ldc_w 912896690
    //   1347: ixor
    //   1348: ldc2_w 1286875540
    //   1351: l2i
    //   1352: ldc_w -1206293450
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 1402, 1111368847 -> 1340, 1116065505 -> 1384
    //   1384: astore_0
    //   1385: return
    //   1386: aconst_null
    //   1387: athrow
    //   1388: aconst_null
    //   1389: athrow
    //   1390: aconst_null
    //   1391: athrow
    //   1392: aconst_null
    //   1393: athrow
    //   1394: aconst_null
    //   1395: athrow
    //   1396: aconst_null
    //   1397: athrow
    //   1398: aconst_null
    //   1399: athrow
    //   1400: aconst_null
    //   1401: athrow
    //   1402: aconst_null
    //   1403: athrow
    //   1404: aconst_null
    //   1405: athrow
    //   1406: aconst_null
    //   1407: athrow
    //   1408: aconst_null
    //   1409: athrow
    //   1410: aconst_null
    //   1411: athrow
    //   1412: aconst_null
    //   1413: athrow
    //   1414: aconst_null
    //   1415: athrow
    //   1416: aconst_null
    //   1417: athrow
    //   1418: aconst_null
    //   1419: athrow
    //   1420: aconst_null
    //   1421: athrow
    //   1422: aconst_null
    //   1423: athrow
    //   1424: aconst_null
    //   1425: athrow
    //   1426: aconst_null
    //   1427: athrow
    //   1428: aconst_null
    //   1429: athrow
    // Exception table:
    //   from	to	target	type
    //   123	311	314	java/lang/NoSuchFieldError
    //   373	563	566	java/lang/NoSuchFieldError
    //   625	815	818	java/lang/NoSuchFieldError
    //   877	1067	1070	java/lang/NoSuchFieldError
    //   1129	1320	1323	java/lang/NoSuchFieldError
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\RotationUtil2$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */