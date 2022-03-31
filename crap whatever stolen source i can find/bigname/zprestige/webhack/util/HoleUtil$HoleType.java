package bigname.zprestige.webhack.util;

import Perryc;

public enum HoleUtil$HoleType {
  CUSTOM, DOUBLE, NONE, SINGLE;
  
  public static HoleUtil$HoleType[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/HoleUtil$HoleType
    //   3: dup
    //   4: ldc '㌺ㅋ䱽к'
    //   6: getstatic Perryc.0 : I
    //   9: ifle -> 22
    //   12: ldc2_w 269565301
    //   15: l2i
    //   16: ldc -1647737036
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 473190175
    //   25: l2i
    //   26: ldc 1493736442
    //   28: ixor
    //   29: ldc2_w 1624711456
    //   32: l2i
    //   33: ldc -525060703
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 1162, -983580572 -> 64, 230403776 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w -225602638
    //   70: l2i
    //   71: ldc -225602638
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w 687219308
    //   83: l2i
    //   84: ldc -1573136839
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 669982116
    //   93: l2i
    //   94: ldc 117340104
    //   96: ixor
    //   97: ldc2_w 2138806906
    //   100: l2i
    //   101: ldc 265084476
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 1146, -92622829 -> 90, 1369845290 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 151
    //   141: ldc2_w -1045867769
    //   144: l2i
    //   145: ldc -753541002
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 1914913141
    //   154: l2i
    //   155: ldc -646257173
    //   157: ixor
    //   158: ldc2_w -1855044376
    //   161: l2i
    //   162: ldc -258363260
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -899132655 -> 151, 1934313245 -> 1164
    //   192: putstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.SINGLE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   195: new bigname/zprestige/webhack/util/HoleUtil$HoleType
    //   198: dup
    //   199: ldc '㌼ㅎ䱽к'
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 217
    //   207: ldc2_w 1645970446
    //   210: l2i
    //   211: ldc -1366877721
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -700877365
    //   220: l2i
    //   221: ldc 759866913
    //   223: ixor
    //   224: ldc2_w 1397198694
    //   227: l2i
    //   228: ldc 463211648
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 1148, -2075714033 -> 217, -1280815092 -> 260
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -1502250799
    //   266: l2i
    //   267: ldc -1502250800
    //   269: ixor
    //   270: getstatic Perryc.0 : I
    //   273: ifle -> 286
    //   276: ldc2_w -1918157560
    //   279: l2i
    //   280: ldc -1538599785
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 2086936908
    //   289: l2i
    //   290: ldc 1254743091
    //   292: ixor
    //   293: ldc2_w -649541617
    //   296: l2i
    //   297: ldc 1464663204
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 1156, -1478107852 -> 286, -1196832300 -> 328
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w 281740297
    //   340: l2i
    //   341: ldc 1506472724
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 1793166770
    //   350: l2i
    //   351: ldc 89436404
    //   353: ixor
    //   354: ldc2_w 772815271
    //   357: l2i
    //   358: ldc -1520656777
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -1035120435 -> 1172, 950567179 -> 347
    //   388: putstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.DOUBLE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   391: new bigname/zprestige/webhack/util/HoleUtil$HoleType
    //   394: dup
    //   395: ldc '㌦ㅘ䱾в'
    //   397: getstatic Perryc.0 : I
    //   400: ifle -> 413
    //   403: ldc2_w -1938078252
    //   406: l2i
    //   407: ldc 689704979
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 1962884226
    //   416: l2i
    //   417: ldc 504151558
    //   419: ixor
    //   420: ldc2_w 1347526230
    //   423: l2i
    //   424: ldc -1519759460
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, 1348240397 -> 1140, 2126438564 -> 413
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 1417521641
    //   462: l2i
    //   463: ldc 1417521643
    //   465: ixor
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w -1071428098
    //   475: l2i
    //   476: ldc 1824736729
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w -598679519
    //   485: l2i
    //   486: ldc -583065966
    //   488: ixor
    //   489: ldc2_w -1678790472
    //   492: l2i
    //   493: ldc 1645120678
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 1160, -124861779 -> 524, 1426142265 -> 482
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 543
    //   533: ldc2_w -798487799
    //   536: l2i
    //   537: ldc 1288921397
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -596369791
    //   546: l2i
    //   547: ldc -982714997
    //   549: ixor
    //   550: ldc2_w 1447423273
    //   553: l2i
    //   554: ldc -1549451888
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 1158, -319276109 -> 584, 1767619205 -> 543
    //   584: putstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.CUSTOM : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   587: new bigname/zprestige/webhack/util/HoleUtil$HoleType
    //   590: dup
    //   591: ldc '㌼ㅉ'
    //   593: getstatic Perryc.0 : I
    //   596: ifle -> 609
    //   599: ldc2_w 2032949723
    //   602: l2i
    //   603: ldc 598482642
    //   605: ixor
    //   606: goto -> 616
    //   609: ldc2_w 831274335
    //   612: l2i
    //   613: ldc 219553100
    //   615: ixor
    //   616: ldc2_w 155053962
    //   619: l2i
    //   620: ldc 624485558
    //   622: ixor
    //   623: ixor
    //   624: lookupswitch default -> 652, 1540571596 -> 609, 1988447285 -> 1142
    //   652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   655: ldc2_w 198696517
    //   658: l2i
    //   659: ldc 198696518
    //   661: ixor
    //   662: getstatic Perryc.0 : I
    //   665: ifle -> 678
    //   668: ldc2_w 2114931251
    //   671: l2i
    //   672: ldc -1854575944
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w 56035875
    //   681: l2i
    //   682: ldc -1212267100
    //   684: ixor
    //   685: ldc2_w -618958381
    //   688: l2i
    //   689: ldc -1452981078
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -1660676622 -> 1150, -1475821162 -> 678
    //   720: invokespecial <init> : (Ljava/lang/String;I)V
    //   723: getstatic Perryc.c : I
    //   726: iflt -> 739
    //   729: ldc2_w -493318848
    //   732: l2i
    //   733: ldc 405646953
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w 2081929439
    //   742: l2i
    //   743: ldc -1322319622
    //   745: ixor
    //   746: ldc2_w 1829284053
    //   749: l2i
    //   750: ldc 196423825
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 780, -1677149331 -> 1166, -927460925 -> 739
    //   780: putstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.NONE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   783: ldc2_w -1205105263
    //   786: l2i
    //   787: ldc -1205105259
    //   789: ixor
    //   790: anewarray bigname/zprestige/webhack/util/HoleUtil$HoleType
    //   793: dup
    //   794: ldc2_w 1201949958
    //   797: l2i
    //   798: ldc 1201949958
    //   800: ixor
    //   801: getstatic Perryc.c : I
    //   804: iflt -> 817
    //   807: ldc2_w 965680118
    //   810: l2i
    //   811: ldc 2075554898
    //   813: ixor
    //   814: goto -> 824
    //   817: ldc2_w 1573237286
    //   820: l2i
    //   821: ldc 2115768382
    //   823: ixor
    //   824: ldc2_w -1551510775
    //   827: l2i
    //   828: ldc 675271167
    //   830: ixor
    //   831: ixor
    //   832: lookupswitch default -> 1144, -1469865746 -> 860, -914133678 -> 817
    //   860: getstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.SINGLE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   863: aastore
    //   864: dup
    //   865: ldc2_w 427753221
    //   868: l2i
    //   869: ldc 427753220
    //   871: ixor
    //   872: getstatic Perryc.c : I
    //   875: iflt -> 888
    //   878: ldc2_w 164664252
    //   881: l2i
    //   882: ldc 1413281191
    //   884: ixor
    //   885: goto -> 895
    //   888: ldc2_w -1435934237
    //   891: l2i
    //   892: ldc -671068082
    //   894: ixor
    //   895: ldc2_w -253154327
    //   898: l2i
    //   899: ldc -2000886182
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, -507161676 -> 888, 632925096 -> 1152
    //   928: getstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.DOUBLE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   931: aastore
    //   932: dup
    //   933: ldc2_w 294611436
    //   936: l2i
    //   937: ldc 294611438
    //   939: ixor
    //   940: getstatic Perryc.c : I
    //   943: iflt -> 957
    //   946: ldc2_w 773960219
    //   949: l2i
    //   950: ldc_w 1130441777
    //   953: ixor
    //   954: goto -> 965
    //   957: ldc2_w -723718642
    //   960: l2i
    //   961: ldc_w -73914588
    //   964: ixor
    //   965: ldc2_w -1888084670
    //   968: l2i
    //   969: ldc_w 1492067247
    //   972: ixor
    //   973: ixor
    //   974: lookupswitch default -> 1000, -1160142649 -> 1154, -254303086 -> 957
    //   1000: getstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.CUSTOM : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   1003: aastore
    //   1004: dup
    //   1005: ldc2_w 429095325
    //   1008: l2i
    //   1009: ldc_w 429095326
    //   1012: ixor
    //   1013: getstatic Perryc.1 : I
    //   1016: ifeq -> 1030
    //   1019: ldc2_w -1819184148
    //   1022: l2i
    //   1023: ldc_w 1521077996
    //   1026: ixor
    //   1027: goto -> 1038
    //   1030: ldc2_w -831384829
    //   1033: l2i
    //   1034: ldc_w 1758593793
    //   1037: ixor
    //   1038: ldc2_w 1671475944
    //   1041: l2i
    //   1042: ldc_w -1564069679
    //   1045: ixor
    //   1046: ixor
    //   1047: lookupswitch default -> 1072, 140394297 -> 1168, 1393494358 -> 1030
    //   1072: getstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.NONE : Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   1075: aastore
    //   1076: getstatic Perryc.1 : I
    //   1079: ifeq -> 1093
    //   1082: ldc2_w 316599689
    //   1085: l2i
    //   1086: ldc_w 1650046965
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w 1798615569
    //   1096: l2i
    //   1097: ldc_w -20650667
    //   1100: ixor
    //   1101: ldc2_w -1025933857
    //   1104: l2i
    //   1105: ldc_w 848261458
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 1136, -2133764367 -> 1170, -1633657759 -> 1093
    //   1136: putstatic bigname/zprestige/webhack/util/HoleUtil$HoleType.$VALUES : [Lbigname/zprestige/webhack/util/HoleUtil$HoleType;
    //   1139: return
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
    //   1170: aconst_null
    //   1171: athrow
    //   1172: aconst_null
    //   1173: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\HoleUtil$HoleType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */