package bigname.zprestige.webhack.util;

import Perryc;

public enum BlockUtil$BlockResistance {
  Unbreakable, Resistant, Blank, Breakable;
  
  public static BlockUtil$BlockResistance[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/BlockUtil$BlockResistance
    //   3: dup
    //   4: ldc '⟖㌟➟ㅢ螇'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w 1424460222
    //   15: l2i
    //   16: ldc -1684599652
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 20395574
    //   25: l2i
    //   26: ldc -1722586895
    //   28: ixor
    //   29: ldc2_w -233455744
    //   32: l2i
    //   33: ldc 473029096
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 1128, 559211338 -> 22, 1983920303 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 49090670
    //   70: l2i
    //   71: ldc 49090670
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w -796338828
    //   83: l2i
    //   84: ldc 1084672921
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 2064879817
    //   93: l2i
    //   94: ldc -1462298744
    //   96: ixor
    //   97: ldc2_w 2025849463
    //   100: l2i
    //   101: ldc 1557982201
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 1130, -1271728285 -> 90, -136810801 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w 208155719
    //   144: l2i
    //   145: ldc -606295665
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 811169446
    //   154: l2i
    //   155: ldc 1109123157
    //   157: ixor
    //   158: ldc2_w 1536608622
    //   161: l2i
    //   162: ldc -1581721161
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -1716501180 -> 151, 765103377 -> 1132
    //   192: putstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   195: new bigname/zprestige/webhack/util/BlockUtil$BlockResistance
    //   198: dup
    //   199: ldc '⟖㌁➛ㅭ螇쥉๻婕芽'
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w 1102807503
    //   210: l2i
    //   211: ldc -2076334147
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1324304668
    //   220: l2i
    //   221: ldc 361895806
    //   223: ixor
    //   224: ldc2_w -655394971
    //   227: l2i
    //   228: ldc 1682988523
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 1142, 406686484 -> 260, 2033782012 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -1136851540
    //   266: l2i
    //   267: ldc -1136851539
    //   269: ixor
    //   270: getstatic Perryc.0 : I
    //   273: ifle -> 286
    //   276: ldc2_w 1685712975
    //   279: l2i
    //   280: ldc 810866887
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 1802086892
    //   289: l2i
    //   290: ldc -1202701878
    //   292: ixor
    //   293: ldc2_w -1573072332
    //   296: l2i
    //   297: ldc 1256479362
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -1124753346 -> 1136, 304893472 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w 778533139
    //   340: l2i
    //   341: ldc -747862178
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1126343728
    //   350: l2i
    //   351: ldc -470093483
    //   353: ixor
    //   354: ldc2_w 982580130
    //   357: l2i
    //   358: ldc 1960471452
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 1146, -1287557517 -> 347, 292371131 -> 388
    //   388: putstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Breakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   391: new bigname/zprestige/webhack/util/BlockUtil$BlockResistance
    //   394: dup
    //   395: ldc '⟆㌖➍ㅥ螟쥜๸婗芬'
    //   397: getstatic Perryc.1 : I
    //   400: ifeq -> 413
    //   403: ldc2_w 330946570
    //   406: l2i
    //   407: ldc -803281447
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 1816907451
    //   416: l2i
    //   417: ldc -434933773
    //   419: ixor
    //   420: ldc2_w 871155367
    //   423: l2i
    //   424: ldc 506488643
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 1144, -1484521300 -> 456, -293888969 -> 413
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 1901965144
    //   462: l2i
    //   463: ldc 1901965146
    //   465: ixor
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w 1204638627
    //   475: l2i
    //   476: ldc -2079204986
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w 1456879611
    //   485: l2i
    //   486: ldc -960968057
    //   488: ixor
    //   489: ldc2_w 81658915
    //   492: l2i
    //   493: ldc 1618408912
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 1158, -1485538346 -> 482, -188347249 -> 524
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 543
    //   533: ldc2_w 921978246
    //   536: l2i
    //   537: ldc -314436179
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -231351034
    //   546: l2i
    //   547: ldc 273893671
    //   549: ixor
    //   550: ldc2_w -666789674
    //   553: l2i
    //   554: ldc 1687343007
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 1160, 1588970344 -> 584, 1734674274 -> 543
    //   584: putstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   587: new bigname/zprestige/webhack/util/BlockUtil$BlockResistance
    //   590: dup
    //   591: ldc '⟁㌝➜ㅾ螉쥉๲婘芺?鼪'
    //   593: getstatic Perryc.1 : I
    //   596: ifeq -> 609
    //   599: ldc2_w 2111972798
    //   602: l2i
    //   603: ldc 71979477
    //   605: ixor
    //   606: goto -> 616
    //   609: ldc2_w 1112686716
    //   612: l2i
    //   613: ldc 1292584834
    //   615: ixor
    //   616: ldc2_w 1858787555
    //   619: l2i
    //   620: ldc 443391643
    //   622: ixor
    //   623: ixor
    //   624: lookupswitch default -> 652, 219099667 -> 1152, 2101488342 -> 609
    //   652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   655: ldc2_w -854049598
    //   658: l2i
    //   659: ldc -854049599
    //   661: ixor
    //   662: getstatic Perryc.c : I
    //   665: iflt -> 678
    //   668: ldc2_w 1062634282
    //   671: l2i
    //   672: ldc -770095222
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w 1144994010
    //   681: l2i
    //   682: ldc -1244190128
    //   684: ixor
    //   685: ldc2_w 714769551
    //   688: l2i
    //   689: ldc -102150583
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 1154, 580638796 -> 720, 1044123238 -> 678
    //   720: invokespecial <init> : (Ljava/lang/String;I)V
    //   723: getstatic Perryc.0 : I
    //   726: ifle -> 739
    //   729: ldc2_w -40482650
    //   732: l2i
    //   733: ldc -1261326263
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w -182969460
    //   742: l2i
    //   743: ldc 1282343713
    //   745: ixor
    //   746: ldc2_w -1274104060
    //   749: l2i
    //   750: ldc -1828731063
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 1138, -1618581280 -> 780, 1874233506 -> 739
    //   780: putstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Unbreakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   783: ldc2_w 1442870301
    //   786: l2i
    //   787: ldc 1442870297
    //   789: ixor
    //   790: anewarray bigname/zprestige/webhack/util/BlockUtil$BlockResistance
    //   793: dup
    //   794: ldc2_w 1069988405
    //   797: l2i
    //   798: ldc 1069988405
    //   800: ixor
    //   801: getstatic Perryc.0 : I
    //   804: ifle -> 817
    //   807: ldc2_w 23093436
    //   810: l2i
    //   811: ldc -1365163960
    //   813: ixor
    //   814: goto -> 824
    //   817: ldc2_w 749719967
    //   820: l2i
    //   821: ldc -772813269
    //   823: ixor
    //   824: ldc2_w 594641318
    //   827: l2i
    //   828: ldc -1283156012
    //   830: ixor
    //   831: ixor
    //   832: lookupswitch default -> 860, -1871439137 -> 817, 1060386438 -> 1150
    //   860: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   863: aastore
    //   864: dup
    //   865: ldc2_w -74292111
    //   868: l2i
    //   869: ldc -74292112
    //   871: ixor
    //   872: getstatic Perryc.c : I
    //   875: iflt -> 888
    //   878: ldc2_w -620821791
    //   881: l2i
    //   882: ldc -1127772205
    //   884: ixor
    //   885: goto -> 895
    //   888: ldc2_w -389415612
    //   891: l2i
    //   892: ldc 926607165
    //   894: ixor
    //   895: ldc2_w 115953308
    //   898: l2i
    //   899: ldc 1568642252
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 1140, -2073706455 -> 928, 1034835810 -> 888
    //   928: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Breakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   931: aastore
    //   932: dup
    //   933: ldc2_w 1699883400
    //   936: l2i
    //   937: ldc 1699883402
    //   939: ixor
    //   940: getstatic Perryc.0 : I
    //   943: ifle -> 956
    //   946: ldc2_w 2006634213
    //   949: l2i
    //   950: ldc 119760726
    //   952: ixor
    //   953: goto -> 963
    //   956: ldc2_w 79303224
    //   959: l2i
    //   960: ldc -1315114598
    //   962: ixor
    //   963: ldc2_w 426347906
    //   966: l2i
    //   967: ldc -1959133727
    //   969: ixor
    //   970: ixor
    //   971: lookupswitch default -> 996, -487990832 -> 1148, -130539810 -> 956
    //   996: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   999: aastore
    //   1000: dup
    //   1001: ldc2_w -282705007
    //   1004: l2i
    //   1005: ldc -282705006
    //   1007: ixor
    //   1008: getstatic Perryc.0 : I
    //   1011: ifle -> 1024
    //   1014: ldc2_w -671865890
    //   1017: l2i
    //   1018: ldc -1109250603
    //   1020: ixor
    //   1021: goto -> 1031
    //   1024: ldc2_w -2114670190
    //   1027: l2i
    //   1028: ldc 1652567502
    //   1030: ixor
    //   1031: ldc2_w -938969833
    //   1034: l2i
    //   1035: ldc 226925480
    //   1037: ixor
    //   1038: ixor
    //   1039: lookupswitch default -> 1064, -1348935500 -> 1134, 597603235 -> 1024
    //   1064: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Unbreakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   1067: aastore
    //   1068: getstatic Perryc.c : I
    //   1071: iflt -> 1084
    //   1074: ldc2_w 219224839
    //   1077: l2i
    //   1078: ldc -1979046186
    //   1080: ixor
    //   1081: goto -> 1091
    //   1084: ldc2_w 1608667034
    //   1087: l2i
    //   1088: ldc -262625170
    //   1090: ixor
    //   1091: ldc2_w 1615977543
    //   1094: l2i
    //   1095: ldc 275987080
    //   1097: ixor
    //   1098: ixor
    //   1099: lookupswitch default -> 1156, -543686341 -> 1124, -147203298 -> 1084
    //   1124: putstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.$VALUES : [Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   1127: return
    //   1128: aconst_null
    //   1129: athrow
    //   1130: aconst_null
    //   1131: athrow
    //   1132: aconst_null
    //   1133: athrow
    //   1134: aconst_null
    //   1135: athrow
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
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\BlockUtil$BlockResistance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */