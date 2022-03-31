package bigname.zprestige.webhack.util.WurstPlusThree;

import Perryc;

public enum WurstplusThreeBlockUtil$ValidResult {
  NoEntityCollision, NoNeighbors, Ok, AlreadyBlockThere;
  
  public static WurstplusThreeBlockUtil$ValidResult[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult
    //   3: dup
    //   4: ldc '꿕㌜꾼ㅢྜྷ䅎๭퉇芛卸ᜬਫ戢綩히㊑辑'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w 181590306
    //   15: l2i
    //   16: ldc -1709054052
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 72574407
    //   25: l2i
    //   26: ldc -1221000593
    //   28: ixor
    //   29: ldc2_w -2140417552
    //   32: l2i
    //   33: ldc 557697070
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 1146, 305954422 -> 64, 832907104 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 1569546566
    //   70: l2i
    //   71: ldc 1569546566
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 90
    //   80: ldc2_w 1591458847
    //   83: l2i
    //   84: ldc 1013302714
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 677279802
    //   93: l2i
    //   94: ldc -1987803128
    //   96: ixor
    //   97: ldc2_w -1779497509
    //   100: l2i
    //   101: ldc -1940948100
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 1160, -1199927659 -> 132, 2065565442 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w 2047200726
    //   144: l2i
    //   145: ldc 1227609967
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 202986501
    //   154: l2i
    //   155: ldc 362638351
    //   157: ixor
    //   158: ldc2_w 1899293807
    //   161: l2i
    //   162: ldc 1183270707
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 1152, 77443557 -> 151, 775394134 -> 192
    //   192: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.NoEntityCollision : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   195: new bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult
    //   198: dup
    //   199: ldc '꿚㌟꾋ㅩྈ䅃๠퉼芴卸ᜣਬ戟網힄㊌辚'
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w 842406595
    //   210: l2i
    //   211: ldc -2110932710
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 86679206
    //   220: l2i
    //   221: ldc -1903900560
    //   223: ixor
    //   224: ldc2_w -1754859598
    //   227: l2i
    //   228: ldc -1369173107
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -1994831898 -> 1174, -770550652 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 996547084
    //   266: l2i
    //   267: ldc 996547085
    //   269: ixor
    //   270: getstatic Perryc.1 : I
    //   273: ifeq -> 286
    //   276: ldc2_w -1425238411
    //   279: l2i
    //   280: ldc 1941590188
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -1719127929
    //   289: l2i
    //   290: ldc -2141355714
    //   292: ixor
    //   293: ldc2_w -90550509
    //   296: l2i
    //   297: ldc -1504938453
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 1158, -2074017823 -> 286, 1157859457 -> 328
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.1 : I
    //   334: ifeq -> 347
    //   337: ldc2_w 1094033603
    //   340: l2i
    //   341: ldc -758724690
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1997324186
    //   350: l2i
    //   351: ldc -197973053
    //   353: ixor
    //   354: ldc2_w -170149782
    //   357: l2i
    //   358: ldc -851607103
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -1424662842 -> 1172, -1204397399 -> 347
    //   388: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.AlreadyBlockThere : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   391: new bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult
    //   394: dup
    //   395: ldc '꿕㌜꾷ㅩྀ䅀๱퉜芷卥ᜳ'
    //   397: getstatic Perryc.c : I
    //   400: iflt -> 413
    //   403: ldc2_w -774295742
    //   406: l2i
    //   407: ldc -525522017
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w -783344508
    //   416: l2i
    //   417: ldc 1534799802
    //   419: ixor
    //   420: ldc2_w -726256733
    //   423: l2i
    //   424: ldc -1606620648
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, 1024225484 -> 413, 1174330726 -> 1168
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 279814792
    //   462: l2i
    //   463: ldc 279814794
    //   465: ixor
    //   466: getstatic Perryc.c : I
    //   469: iflt -> 482
    //   472: ldc2_w 701062436
    //   475: l2i
    //   476: ldc 1307158874
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w 1170308618
    //   485: l2i
    //   486: ldc 437359499
    //   488: ixor
    //   489: ldc2_w 902352127
    //   492: l2i
    //   493: ldc -1000564328
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -1783324391 -> 1176, -425470550 -> 482
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 543
    //   533: ldc2_w -632663789
    //   536: l2i
    //   537: ldc -235899980
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w 17516684
    //   546: l2i
    //   547: ldc -1100232722
    //   549: ixor
    //   550: ldc2_w 1756117638
    //   553: l2i
    //   554: ldc 540581927
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 1144, -134998589 -> 584, 1664006150 -> 543
    //   584: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.NoNeighbors : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   587: new bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult
    //   590: dup
    //   591: ldc '꿔㌘'
    //   593: getstatic Perryc.0 : I
    //   596: ifle -> 609
    //   599: ldc2_w -413766132
    //   602: l2i
    //   603: ldc -1653399378
    //   605: ixor
    //   606: goto -> 616
    //   609: ldc2_w 2025959087
    //   612: l2i
    //   613: ldc -946902998
    //   615: ixor
    //   616: ldc2_w -992491774
    //   619: l2i
    //   620: ldc 1170819945
    //   622: ixor
    //   623: ixor
    //   624: lookupswitch default -> 652, -2100472067 -> 609, -79969591 -> 1170
    //   652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   655: ldc2_w 132435966
    //   658: l2i
    //   659: ldc 132435965
    //   661: ixor
    //   662: getstatic Perryc.c : I
    //   665: iflt -> 678
    //   668: ldc2_w 1479261126
    //   671: l2i
    //   672: ldc 969937712
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w 549685456
    //   681: l2i
    //   682: ldc 987285686
    //   684: ixor
    //   685: ldc2_w -491046794
    //   688: l2i
    //   689: ldc -1863114955
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -2022891142 -> 678, 330534837 -> 1154
    //   720: invokespecial <init> : (Ljava/lang/String;I)V
    //   723: getstatic Perryc.0 : I
    //   726: ifle -> 739
    //   729: ldc2_w -993494745
    //   732: l2i
    //   733: ldc -1902401822
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w 1807855530
    //   742: l2i
    //   743: ldc -1876779005
    //   745: ixor
    //   746: ldc2_w -2122928248
    //   749: l2i
    //   750: ldc -1351541915
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 780, 1547030658 -> 739, 1683254056 -> 1164
    //   780: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.Ok : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   783: ldc2_w -1089145169
    //   786: l2i
    //   787: ldc -1089145173
    //   789: ixor
    //   790: anewarray bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult
    //   793: dup
    //   794: ldc2_w 815540085
    //   797: l2i
    //   798: ldc 815540085
    //   800: ixor
    //   801: getstatic Perryc.1 : I
    //   804: ifeq -> 817
    //   807: ldc2_w -1941363686
    //   810: l2i
    //   811: ldc -1330464175
    //   813: ixor
    //   814: goto -> 825
    //   817: ldc2_w 209538920
    //   820: l2i
    //   821: ldc_w 1340820865
    //   824: ixor
    //   825: ldc2_w -574681513
    //   828: l2i
    //   829: ldc_w 770417226
    //   832: ixor
    //   833: ixor
    //   834: lookupswitch default -> 860, -860933546 -> 1148, 1553283278 -> 817
    //   860: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.NoEntityCollision : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   863: aastore
    //   864: dup
    //   865: ldc2_w -147711949
    //   868: l2i
    //   869: ldc_w -147711950
    //   872: ixor
    //   873: getstatic Perryc.c : I
    //   876: iflt -> 890
    //   879: ldc2_w -1954157156
    //   882: l2i
    //   883: ldc_w 1721748542
    //   886: ixor
    //   887: goto -> 898
    //   890: ldc2_w -474863305
    //   893: l2i
    //   894: ldc_w 1354051355
    //   897: ixor
    //   898: ldc2_w 2074316223
    //   901: l2i
    //   902: ldc_w -1237513783
    //   905: ixor
    //   906: ixor
    //   907: lookupswitch default -> 1166, 545564116 -> 890, 2123989594 -> 932
    //   932: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.AlreadyBlockThere : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   935: aastore
    //   936: dup
    //   937: ldc2_w -1660966068
    //   940: l2i
    //   941: ldc_w -1660966066
    //   944: ixor
    //   945: getstatic Perryc.1 : I
    //   948: ifeq -> 962
    //   951: ldc2_w -738453136
    //   954: l2i
    //   955: ldc_w 1680482371
    //   958: ixor
    //   959: goto -> 970
    //   962: ldc2_w 1314516551
    //   965: l2i
    //   966: ldc_w -278665720
    //   969: ixor
    //   970: ldc2_w 1924936381
    //   973: l2i
    //   974: ldc_w -2047432771
    //   977: ixor
    //   978: ixor
    //   979: lookupswitch default -> 1004, 601478250 -> 962, 1084009523 -> 1156
    //   1004: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.NoNeighbors : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   1007: aastore
    //   1008: dup
    //   1009: ldc2_w 1922297673
    //   1012: l2i
    //   1013: ldc_w 1922297674
    //   1016: ixor
    //   1017: getstatic Perryc.1 : I
    //   1020: ifeq -> 1034
    //   1023: ldc2_w -619736770
    //   1026: l2i
    //   1027: ldc_w -1541098387
    //   1030: ixor
    //   1031: goto -> 1042
    //   1034: ldc2_w -64298944
    //   1037: l2i
    //   1038: ldc_w 1381847352
    //   1041: ixor
    //   1042: ldc2_w 994223703
    //   1045: l2i
    //   1046: ldc_w 46601273
    //   1049: ixor
    //   1050: ixor
    //   1051: lookupswitch default -> 1076, -94519405 -> 1034, 1185847101 -> 1150
    //   1076: getstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.Ok : Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   1079: aastore
    //   1080: getstatic Perryc.0 : I
    //   1083: ifle -> 1097
    //   1086: ldc2_w -1636533050
    //   1089: l2i
    //   1090: ldc_w -2134344578
    //   1093: ixor
    //   1094: goto -> 1105
    //   1097: ldc2_w 961058808
    //   1100: l2i
    //   1101: ldc_w -1517050745
    //   1104: ixor
    //   1105: ldc2_w 1298893968
    //   1108: l2i
    //   1109: ldc_w -233825083
    //   1112: ixor
    //   1113: ixor
    //   1114: lookupswitch default -> 1140, -1580756755 -> 1162, -23400888 -> 1097
    //   1140: putstatic bigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult.$VALUES : [Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeBlockUtil$ValidResult;
    //   1143: return
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
    //   1174: aconst_null
    //   1175: athrow
    //   1176: aconst_null
    //   1177: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreeBlockUtil$ValidResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */