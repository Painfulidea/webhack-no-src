package bigname.zprestige.webhack.features.modules.Player;

import Perryc;

public enum Blink$Mode {
  MANUAL, TIME, DISTANCE, PACKETS;
  
  public static Blink$Mode[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Player/Blink$Mode
    //   3: dup
    //   4: ldc '㌲ㅙ琀ᰃ'
    //   6: getstatic Perryc.1 : I
    //   9: ifeq -> 22
    //   12: ldc2_w 1522371731
    //   15: l2i
    //   16: ldc 1931115129
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w -857201257
    //   25: l2i
    //   26: ldc -893552710
    //   28: ixor
    //   29: ldc2_w 984759953
    //   32: l2i
    //   33: ldc 376771647
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 1128, 90233924 -> 22, 714242179 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w -296051600
    //   70: l2i
    //   71: ldc -296051600
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 90
    //   80: ldc2_w 1075992516
    //   83: l2i
    //   84: ldc -1725806450
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 431450256
    //   93: l2i
    //   94: ldc -584499135
    //   96: ixor
    //   97: ldc2_w -1854915080
    //   100: l2i
    //   101: ldc 1396929369
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 132, -1783133603 -> 90, 456348139 -> 1142
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.1 : I
    //   138: ifeq -> 151
    //   141: ldc2_w -1544381588
    //   144: l2i
    //   145: ldc 760246194
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 365989240
    //   154: l2i
    //   155: ldc -2099283619
    //   157: ixor
    //   158: ldc2_w 1100022098
    //   161: l2i
    //   162: ldc 898704163
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 1158, -485501356 -> 192, -89991505 -> 151
    //   192: putstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.MANUAL : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   195: new bigname/zprestige/webhack/features/modules/Player/Blink$Mode
    //   198: dup
    //   199: ldc '㌺ㅉ'
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 217
    //   207: ldc2_w -1507476052
    //   210: l2i
    //   211: ldc -1358442016
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 440037169
    //   220: l2i
    //   221: ldc 2090934500
    //   223: ixor
    //   224: ldc2_w 2113058257
    //   227: l2i
    //   228: ldc 1578192896
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 1138, 717326749 -> 217, 1165535748 -> 260
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 1512286032
    //   266: l2i
    //   267: ldc 1512286033
    //   269: ixor
    //   270: getstatic Perryc.c : I
    //   273: iflt -> 286
    //   276: ldc2_w -917892535
    //   279: l2i
    //   280: ldc -655912178
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 1241719518
    //   289: l2i
    //   290: ldc -119067163
    //   292: ixor
    //   293: ldc2_w 1893662005
    //   296: l2i
    //   297: ldc 593956119
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, 1108636005 -> 1134, 1628731332 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w 2130268737
    //   340: l2i
    //   341: ldc -1040483223
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -185641905
    //   350: l2i
    //   351: ldc -605390911
    //   353: ixor
    //   354: ldc2_w -1282945141
    //   357: l2i
    //   358: ldc -24071362
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 1136, -233483619 -> 347, 1645371195 -> 388
    //   388: putstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.TIME : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   391: new bigname/zprestige/webhack/features/modules/Player/Blink$Mode
    //   394: dup
    //   395: ldc '㌺ㅘ琀ᰁ๚較'
    //   397: getstatic Perryc.0 : I
    //   400: ifle -> 413
    //   403: ldc2_w 1704649229
    //   406: l2i
    //   407: ldc 165171751
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w -1041004510
    //   416: l2i
    //   417: ldc 6247195
    //   419: ixor
    //   420: ldc2_w 599893827
    //   423: l2i
    //   424: ldc 1721029158
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, 689423695 -> 1154, 696047010 -> 413
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 1588623040
    //   462: l2i
    //   463: ldc 1588623042
    //   465: ixor
    //   466: getstatic Perryc.c : I
    //   469: iflt -> 482
    //   472: ldc2_w -1433623347
    //   475: l2i
    //   476: ldc 985077299
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w 1498834076
    //   485: l2i
    //   486: ldc 1777846458
    //   488: ixor
    //   489: ldc2_w 1427750456
    //   492: l2i
    //   493: ldc 310756006
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 1130, -676868512 -> 482, 2000539832 -> 524
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 543
    //   533: ldc2_w 1013587067
    //   536: l2i
    //   537: ldc -211620907
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w 218598582
    //   546: l2i
    //   547: ldc -1680827684
    //   549: ixor
    //   550: ldc2_w 417359021
    //   553: l2i
    //   554: ldc 1514126123
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 1156, -1915279320 -> 543, -737621524 -> 584
    //   584: putstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.DISTANCE : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   587: new bigname/zprestige/webhack/features/modules/Player/Blink$Mode
    //   590: dup
    //   591: ldc '㌲ㅇ琄ᰛ๊'
    //   593: getstatic Perryc.c : I
    //   596: iflt -> 609
    //   599: ldc2_w 1983363954
    //   602: l2i
    //   603: ldc -1826702943
    //   605: ixor
    //   606: goto -> 616
    //   609: ldc2_w -692164275
    //   612: l2i
    //   613: ldc 1076332430
    //   615: ixor
    //   616: ldc2_w 694696830
    //   619: l2i
    //   620: ldc -1708964187
    //   622: ixor
    //   623: ixor
    //   624: lookupswitch default -> 1150, 634557208 -> 652, 1449295624 -> 609
    //   652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   655: ldc2_w -1859278256
    //   658: l2i
    //   659: ldc -1859278253
    //   661: ixor
    //   662: getstatic Perryc.1 : I
    //   665: ifeq -> 678
    //   668: ldc2_w 1087750185
    //   671: l2i
    //   672: ldc -1198037978
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w -230330171
    //   681: l2i
    //   682: ldc 2044253597
    //   684: ixor
    //   685: ldc2_w 265156859
    //   688: l2i
    //   689: ldc 1041784696
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -912850036 -> 1148, 1516268694 -> 678
    //   720: invokespecial <init> : (Ljava/lang/String;I)V
    //   723: getstatic Perryc.c : I
    //   726: iflt -> 739
    //   729: ldc2_w 242265377
    //   732: l2i
    //   733: ldc -973361683
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w 2110348466
    //   742: l2i
    //   743: ldc 953453565
    //   745: ixor
    //   746: ldc2_w 1464919221
    //   749: l2i
    //   750: ldc 690765989
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 1160, -1242061604 -> 739, 996242271 -> 780
    //   780: putstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.PACKETS : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   783: ldc2_w -1919327963
    //   786: l2i
    //   787: ldc -1919327967
    //   789: ixor
    //   790: anewarray bigname/zprestige/webhack/features/modules/Player/Blink$Mode
    //   793: dup
    //   794: ldc2_w 1307894714
    //   797: l2i
    //   798: ldc 1307894714
    //   800: ixor
    //   801: getstatic Perryc.1 : I
    //   804: ifeq -> 817
    //   807: ldc2_w -646948738
    //   810: l2i
    //   811: ldc 144956816
    //   813: ixor
    //   814: goto -> 824
    //   817: ldc2_w 871718191
    //   820: l2i
    //   821: ldc 1858271107
    //   823: ixor
    //   824: ldc2_w 2077572012
    //   827: l2i
    //   828: ldc -959632037
    //   830: ixor
    //   831: ixor
    //   832: lookupswitch default -> 860, -1805200915 -> 817, 1825280793 -> 1140
    //   860: getstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.MANUAL : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   863: aastore
    //   864: dup
    //   865: ldc2_w 369815081
    //   868: l2i
    //   869: ldc 369815080
    //   871: ixor
    //   872: getstatic Perryc.0 : I
    //   875: ifle -> 888
    //   878: ldc2_w -1923954695
    //   881: l2i
    //   882: ldc 562980021
    //   884: ixor
    //   885: goto -> 895
    //   888: ldc2_w 331206747
    //   891: l2i
    //   892: ldc 1825543349
    //   894: ixor
    //   895: ldc2_w -2127529479
    //   898: l2i
    //   899: ldc 1262297315
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, 584163898 -> 888, 1725037142 -> 1132
    //   928: getstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.TIME : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   931: aastore
    //   932: dup
    //   933: ldc2_w 512653646
    //   936: l2i
    //   937: ldc 512653644
    //   939: ixor
    //   940: getstatic Perryc.0 : I
    //   943: ifle -> 956
    //   946: ldc2_w 1005502198
    //   949: l2i
    //   950: ldc -1181552472
    //   952: ixor
    //   953: goto -> 963
    //   956: ldc2_w -369804546
    //   959: l2i
    //   960: ldc -765418441
    //   962: ixor
    //   963: ldc2_w -727553851
    //   966: l2i
    //   967: ldc 665767307
    //   969: ixor
    //   970: ixor
    //   971: lookupswitch default -> 1152, -929481849 -> 996, 1903225616 -> 956
    //   996: getstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.DISTANCE : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   999: aastore
    //   1000: dup
    //   1001: ldc2_w -813445444
    //   1004: l2i
    //   1005: ldc -813445441
    //   1007: ixor
    //   1008: getstatic Perryc.0 : I
    //   1011: ifle -> 1024
    //   1014: ldc2_w 1844916471
    //   1017: l2i
    //   1018: ldc 2111169418
    //   1020: ixor
    //   1021: goto -> 1031
    //   1024: ldc2_w 1748064990
    //   1027: l2i
    //   1028: ldc -1221027096
    //   1030: ixor
    //   1031: ldc2_w 306556567
    //   1034: l2i
    //   1035: ldc -1516500281
    //   1037: ixor
    //   1038: ixor
    //   1039: lookupswitch default -> 1064, -1476692179 -> 1144, 542567009 -> 1024
    //   1064: getstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.PACKETS : Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
    //   1067: aastore
    //   1068: getstatic Perryc.c : I
    //   1071: iflt -> 1084
    //   1074: ldc2_w -676596515
    //   1077: l2i
    //   1078: ldc -482942794
    //   1080: ixor
    //   1081: goto -> 1091
    //   1084: ldc2_w -929782665
    //   1087: l2i
    //   1088: ldc 1808046782
    //   1090: ixor
    //   1091: ldc2_w 1645352083
    //   1094: l2i
    //   1095: ldc -1883237239
    //   1097: ixor
    //   1098: ixor
    //   1099: lookupswitch default -> 1146, -649128847 -> 1084, 1317158611 -> 1124
    //   1124: putstatic bigname/zprestige/webhack/features/modules/Player/Blink$Mode.$VALUES : [Lbigname/zprestige/webhack/features/modules/Player/Blink$Mode;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Blink$Mode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */