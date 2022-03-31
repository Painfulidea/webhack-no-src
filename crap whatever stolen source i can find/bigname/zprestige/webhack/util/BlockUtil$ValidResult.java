package bigname.zprestige.webhack.util;

import Perryc;

public enum BlockUtil$ValidResult {
  AlreadyBlockThere, NoNeighbors, Ok, NoEntityCollision;
  
  public static BlockUtil$ValidResult[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/BlockUtil$ValidResult
    //   3: dup
    //   4: ldc '咥㌜哌ㅢᘭ먾๭⤷芛䫈ਫ饒綩츸짡辑'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w -1109215580
    //   15: l2i
    //   16: ldc -1206620231
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w -418791098
    //   25: l2i
    //   26: ldc 1906428337
    //   28: ixor
    //   29: ldc2_w 1996785499
    //   32: l2i
    //   33: ldc -1368694391
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 1152, -593936433 -> 22, 1338502693 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 136803444
    //   70: l2i
    //   71: ldc 136803444
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w 1530665893
    //   83: l2i
    //   84: ldc 702362942
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 553685382
    //   93: l2i
    //   94: ldc 1874659536
    //   96: ixor
    //   97: ldc2_w -2102922547
    //   100: l2i
    //   101: ldc -1583166493
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 1166, 1373902773 -> 90, 1840816248 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.1 : I
    //   138: ifeq -> 151
    //   141: ldc2_w -1961786150
    //   144: l2i
    //   145: ldc -1180223021
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -982482575
    //   154: l2i
    //   155: ldc 976807018
    //   157: ixor
    //   158: ldc2_w 321178664
    //   161: l2i
    //   162: ldc -735106106
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 1146, -172139801 -> 151, 943948533 -> 192
    //   192: putstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.NoEntityCollision : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   195: new bigname/zprestige/webhack/util/BlockUtil$ValidResult
    //   198: dup
    //   199: ldc '咪㌟哻ㅩᘸ먳๠⤌芴䫈ਬ饯網츴짼辚'
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 217
    //   207: ldc2_w -740314673
    //   210: l2i
    //   211: ldc -1987840504
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -897679040
    //   220: l2i
    //   221: ldc 1016328812
    //   223: ixor
    //   224: ldc2_w 955378619
    //   227: l2i
    //   228: ldc -622577379
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 1138, -1203137183 -> 217, 351838602 -> 260
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 1430100294
    //   266: l2i
    //   267: ldc 1430100295
    //   269: ixor
    //   270: getstatic Perryc.1 : I
    //   273: ifeq -> 286
    //   276: ldc2_w -1297899750
    //   279: l2i
    //   280: ldc -694759243
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -1203109019
    //   289: l2i
    //   290: ldc 84177620
    //   292: ixor
    //   293: ldc2_w 815364555
    //   296: l2i
    //   297: ldc 2010679799
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 1156, -99647091 -> 328, 594853779 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w 1803160502
    //   340: l2i
    //   341: ldc 1547774335
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1591815702
    //   350: l2i
    //   351: ldc -358166651
    //   353: ixor
    //   354: ldc2_w 716072553
    //   357: l2i
    //   358: ldc -877374027
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -702476011 -> 1140, 168314878 -> 347
    //   388: putstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.AlreadyBlockThere : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   391: new bigname/zprestige/webhack/util/BlockUtil$ValidResult
    //   394: dup
    //   395: ldc '咥㌜哇ㅩᘰ먰๱⤬芷䫕'
    //   397: getstatic Perryc.1 : I
    //   400: ifeq -> 413
    //   403: ldc2_w 1999415439
    //   406: l2i
    //   407: ldc -1638275604
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 643518424
    //   416: l2i
    //   417: ldc -751333338
    //   419: ixor
    //   420: ldc2_w 2007674061
    //   423: l2i
    //   424: ldc -1293325380
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 1144, 741771794 -> 413, 808392847 -> 456
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 1845837057
    //   462: l2i
    //   463: ldc 1845837059
    //   465: ixor
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w 1544551808
    //   475: l2i
    //   476: ldc -412385358
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w 659579764
    //   485: l2i
    //   486: ldc -1759061981
    //   488: ixor
    //   489: ldc2_w 769207843
    //   492: l2i
    //   493: ldc 781471666
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -1205214301 -> 1162, 1608529672 -> 482
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 543
    //   533: ldc2_w -1631940719
    //   536: l2i
    //   537: ldc -1064816186
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -1667146363
    //   546: l2i
    //   547: ldc -1617944391
    //   549: ixor
    //   550: ldc2_w 1538644667
    //   553: l2i
    //   554: ldc -1020232201
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 584, -1104060875 -> 543, -961079013 -> 1168
    //   584: putstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.NoNeighbors : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   587: new bigname/zprestige/webhack/util/BlockUtil$ValidResult
    //   590: dup
    //   591: ldc '咤㌘'
    //   593: getstatic Perryc.1 : I
    //   596: ifeq -> 609
    //   599: ldc2_w 147530298
    //   602: l2i
    //   603: ldc -964067652
    //   605: ixor
    //   606: goto -> 616
    //   609: ldc2_w 2019755297
    //   612: l2i
    //   613: ldc -1921990329
    //   615: ixor
    //   616: ldc2_w -625401635
    //   619: l2i
    //   620: ldc 1363192293
    //   622: ixor
    //   623: ixor
    //   624: lookupswitch default -> 652, -163755080 -> 609, 1169937854 -> 1154
    //   652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   655: ldc2_w -1575291888
    //   658: l2i
    //   659: ldc -1575291885
    //   661: ixor
    //   662: getstatic Perryc.1 : I
    //   665: ifeq -> 678
    //   668: ldc2_w 774619756
    //   671: l2i
    //   672: ldc -798087910
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w -279220471
    //   681: l2i
    //   682: ldc 80238605
    //   684: ixor
    //   685: ldc2_w -36443271
    //   688: l2i
    //   689: ldc -434808032
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 1136, -444377297 -> 678, -262830243 -> 720
    //   720: invokespecial <init> : (Ljava/lang/String;I)V
    //   723: getstatic Perryc.0 : I
    //   726: ifle -> 739
    //   729: ldc2_w 718360179
    //   732: l2i
    //   733: ldc 1381179900
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w -446239998
    //   742: l2i
    //   743: ldc -1624380142
    //   745: ixor
    //   746: ldc2_w -37111523
    //   749: l2i
    //   750: ldc 1004136097
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 780, -1097715661 -> 1148, -1065002928 -> 739
    //   780: putstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.Ok : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   783: ldc2_w -1796821064
    //   786: l2i
    //   787: ldc -1796821060
    //   789: ixor
    //   790: anewarray bigname/zprestige/webhack/util/BlockUtil$ValidResult
    //   793: dup
    //   794: ldc2_w 1268588393
    //   797: l2i
    //   798: ldc 1268588393
    //   800: ixor
    //   801: getstatic Perryc.0 : I
    //   804: ifle -> 817
    //   807: ldc2_w -1705053487
    //   810: l2i
    //   811: ldc -35658727
    //   813: ixor
    //   814: goto -> 824
    //   817: ldc2_w 2012965853
    //   820: l2i
    //   821: ldc 1001250752
    //   823: ixor
    //   824: ldc2_w -1051187718
    //   827: l2i
    //   828: ldc 1436943466
    //   830: ixor
    //   831: ixor
    //   832: lookupswitch default -> 1164, -660040307 -> 860, -209766568 -> 817
    //   860: getstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.NoEntityCollision : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   863: aastore
    //   864: dup
    //   865: ldc2_w -309913205
    //   868: l2i
    //   869: ldc -309913206
    //   871: ixor
    //   872: getstatic Perryc.1 : I
    //   875: ifeq -> 888
    //   878: ldc2_w 157179869
    //   881: l2i
    //   882: ldc -1310408229
    //   884: ixor
    //   885: goto -> 895
    //   888: ldc2_w 461274882
    //   891: l2i
    //   892: ldc -387888603
    //   894: ixor
    //   895: ldc2_w -269434809
    //   898: l2i
    //   899: ldc -995878899
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, -1813100980 -> 1150, 637273944 -> 888
    //   928: getstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.AlreadyBlockThere : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   931: aastore
    //   932: dup
    //   933: ldc2_w 544997028
    //   936: l2i
    //   937: ldc 544997030
    //   939: ixor
    //   940: getstatic Perryc.1 : I
    //   943: ifeq -> 956
    //   946: ldc2_w -240101806
    //   949: l2i
    //   950: ldc 972386867
    //   952: ixor
    //   953: goto -> 963
    //   956: ldc2_w 517361449
    //   959: l2i
    //   960: ldc 1117466843
    //   962: ixor
    //   963: ldc2_w 1351182923
    //   966: l2i
    //   967: ldc -765767911
    //   969: ixor
    //   970: ixor
    //   971: lookupswitch default -> 1158, -559981920 -> 996, 1251410227 -> 956
    //   996: getstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.NoNeighbors : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   999: aastore
    //   1000: dup
    //   1001: ldc2_w 447500121
    //   1004: l2i
    //   1005: ldc 447500122
    //   1007: ixor
    //   1008: getstatic Perryc.1 : I
    //   1011: ifeq -> 1024
    //   1014: ldc2_w 773104042
    //   1017: l2i
    //   1018: ldc 621414187
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w -2011323835
    //   1027: l2i
    //   1028: ldc_w 1074395519
    //   1031: ixor
    //   1032: ldc2_w -1162864163
    //   1035: l2i
    //   1036: ldc_w 28340363
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 1068, -1340157993 -> 1160, 489764184 -> 1024
    //   1068: getstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.Ok : Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   1071: aastore
    //   1072: getstatic Perryc.1 : I
    //   1075: ifeq -> 1089
    //   1078: ldc2_w -1586038729
    //   1081: l2i
    //   1082: ldc_w -41502482
    //   1085: ixor
    //   1086: goto -> 1097
    //   1089: ldc2_w 985608517
    //   1092: l2i
    //   1093: ldc_w -2105179569
    //   1096: ixor
    //   1097: ldc2_w -1571122830
    //   1100: l2i
    //   1101: ldc_w 754560594
    //   1104: ixor
    //   1105: ixor
    //   1106: lookupswitch default -> 1142, -766279687 -> 1089, 916032554 -> 1132
    //   1132: putstatic bigname/zprestige/webhack/util/BlockUtil$ValidResult.$VALUES : [Lbigname/zprestige/webhack/util/BlockUtil$ValidResult;
    //   1135: return
    //   1136: aconst_null
    //   1137: athrow
    //   1138: aconst_null
    //   1139: athrow
    //   1140: aconst_null
    //   1141: athrow
    //   1142: aconst_null
    //   1143: athrow
    //   1144: aconst_null
    //   1145: athrow
    //   1146: aconst_null
    //   1147: athrow
    //   1148: aconst_null
    //   1149: athrow
    //   1150: aconst_null
    //   1151: athrow
    //   1152: aconst_null
    //   1153: athrow
    //   1154: aconst_null
    //   1155: athrow
    //   1156: aconst_null
    //   1157: athrow
    //   1158: aconst_null
    //   1159: athrow
    //   1160: aconst_null
    //   1161: athrow
    //   1162: aconst_null
    //   1163: athrow
    //   1164: aconst_null
    //   1165: athrow
    //   1166: aconst_null
    //   1167: athrow
    //   1168: aconst_null
    //   1169: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\BlockUtil$ValidResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */