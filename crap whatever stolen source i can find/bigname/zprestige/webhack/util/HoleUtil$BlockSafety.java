package bigname.zprestige.webhack.util;

import Perryc;

public enum HoleUtil$BlockSafety {
  UNBREAKABLE, BREAKABLE, RESISTANT;
  
  public static HoleUtil$BlockSafety[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/HoleUtil$BlockSafety
    //   3: dup
    //   4: ldc '籗㌽簒ㅞ︷鋿๒ǖ芚ꋀ쒜'
    //   6: getstatic Perryc.1 : I
    //   9: ifeq -> 22
    //   12: ldc2_w 1157186676
    //   15: l2i
    //   16: ldc -298727239
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 55614078
    //   25: l2i
    //   26: ldc 567282363
    //   28: ixor
    //   29: ldc2_w 1616163798
    //   32: l2i
    //   33: ldc 1074284866
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 868, -1969981863 -> 22, 47999569 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 1030311254
    //   70: l2i
    //   71: ldc 1030311254
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 90
    //   80: ldc2_w 1411515544
    //   83: l2i
    //   84: ldc -597312054
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -188647857
    //   93: l2i
    //   94: ldc -830470240
    //   96: ixor
    //   97: ldc2_w -534144742
    //   100: l2i
    //   101: ldc 306955757
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 878, -937218792 -> 132, 2049303973 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w -1953797189
    //   144: l2i
    //   145: ldc 1618237639
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -1723151222
    //   154: l2i
    //   155: ldc 595089986
    //   157: ixor
    //   158: ldc2_w 1461554003
    //   161: l2i
    //   162: ldc -909912341
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -984966679 -> 151, 1965125316 -> 886
    //   192: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.UNBREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   195: new bigname/zprestige/webhack/util/HoleUtil$BlockSafety
    //   198: dup
    //   199: ldc '籐㌶簃ㅅ︡鋪๘Ǚ芌'
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w 1228844977
    //   210: l2i
    //   211: ldc -144808734
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 38021636
    //   220: l2i
    //   221: ldc -328131668
    //   223: ixor
    //   224: ldc2_w 1661434536
    //   227: l2i
    //   228: ldc 225134863
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -1592599332 -> 217, -804456204 -> 870
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -659253280
    //   266: l2i
    //   267: ldc -659253279
    //   269: ixor
    //   270: getstatic Perryc.c : I
    //   273: iflt -> 286
    //   276: ldc2_w 1762962712
    //   279: l2i
    //   280: ldc 1229239302
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -1107534398
    //   289: l2i
    //   290: ldc 1320818824
    //   292: ixor
    //   293: ldc2_w 905805021
    //   296: l2i
    //   297: ldc 1016941618
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 872, -98142811 -> 328, 691022321 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w 867114999
    //   340: l2i
    //   341: ldc 1688860017
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 95434981
    //   350: l2i
    //   351: ldc 829986509
    //   353: ixor
    //   354: ldc2_w 767581108
    //   357: l2i
    //   358: ldc -680045910
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -1380850792 -> 866, 408723927 -> 347
    //   388: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.RESISTANT : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   391: new bigname/zprestige/webhack/util/HoleUtil$BlockSafety
    //   394: dup
    //   395: ldc '籀㌡簕ㅍ︹鋿๛Ǜ芝'
    //   397: getstatic Perryc.0 : I
    //   400: ifle -> 413
    //   403: ldc2_w 779084480
    //   406: l2i
    //   407: ldc -323959295
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 136348979
    //   416: l2i
    //   417: ldc -1089088763
    //   419: ixor
    //   420: ldc2_w 1378916694
    //   423: l2i
    //   424: ldc -403718360
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, 1250184652 -> 413, 1996489407 -> 864
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 667729521
    //   462: l2i
    //   463: ldc 667729523
    //   465: ixor
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w 980569572
    //   475: l2i
    //   476: ldc 707366890
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w -451804273
    //   485: l2i
    //   486: ldc -750291185
    //   488: ixor
    //   489: ldc2_w -675946726
    //   492: l2i
    //   493: ldc 1262460781
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 880, -1932426631 -> 482, -1428212489 -> 524
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 543
    //   533: ldc2_w -2084987959
    //   536: l2i
    //   537: ldc -915940714
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -1449792744
    //   546: l2i
    //   547: ldc 753167815
    //   549: ixor
    //   550: ldc2_w 459360008
    //   553: l2i
    //   554: ldc 689942078
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 888, -1223725079 -> 584, 2023794793 -> 543
    //   584: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.BREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   587: ldc2_w 302313686
    //   590: l2i
    //   591: ldc 302313685
    //   593: ixor
    //   594: anewarray bigname/zprestige/webhack/util/HoleUtil$BlockSafety
    //   597: dup
    //   598: ldc2_w -839106525
    //   601: l2i
    //   602: ldc -839106525
    //   604: ixor
    //   605: getstatic Perryc.1 : I
    //   608: ifeq -> 621
    //   611: ldc2_w 1602908463
    //   614: l2i
    //   615: ldc -1080629295
    //   617: ixor
    //   618: goto -> 628
    //   621: ldc2_w -12939887
    //   624: l2i
    //   625: ldc -1146722932
    //   627: ixor
    //   628: ldc2_w -84804558
    //   631: l2i
    //   632: ldc -1307797652
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 664, -1461584480 -> 874, 649573337 -> 621
    //   664: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.UNBREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   667: aastore
    //   668: dup
    //   669: ldc2_w 642315628
    //   672: l2i
    //   673: ldc 642315629
    //   675: ixor
    //   676: getstatic Perryc.c : I
    //   679: iflt -> 692
    //   682: ldc2_w 1334603463
    //   685: l2i
    //   686: ldc 1190728402
    //   688: ixor
    //   689: goto -> 699
    //   692: ldc2_w -374781528
    //   695: l2i
    //   696: ldc 1577284575
    //   698: ixor
    //   699: ldc2_w 1004650914
    //   702: l2i
    //   703: ldc 1890974504
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 876, -50462467 -> 732, 1109477023 -> 692
    //   732: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.RESISTANT : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   735: aastore
    //   736: dup
    //   737: ldc2_w 359674930
    //   740: l2i
    //   741: ldc 359674928
    //   743: ixor
    //   744: getstatic Perryc.c : I
    //   747: iflt -> 760
    //   750: ldc2_w -1409603562
    //   753: l2i
    //   754: ldc -1175056123
    //   756: ixor
    //   757: goto -> 767
    //   760: ldc2_w -480225156
    //   763: l2i
    //   764: ldc -915604660
    //   766: ixor
    //   767: ldc2_w 659851620
    //   770: l2i
    //   771: ldc -1022043754
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 882, -833817662 -> 800, -162698783 -> 760
    //   800: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.BREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   803: aastore
    //   804: getstatic Perryc.1 : I
    //   807: ifeq -> 820
    //   810: ldc2_w -592267376
    //   813: l2i
    //   814: ldc 262417436
    //   816: ixor
    //   817: goto -> 827
    //   820: ldc2_w -315638163
    //   823: l2i
    //   824: ldc -516576045
    //   826: ixor
    //   827: ldc2_w 2070541017
    //   830: l2i
    //   831: ldc -1404043428
    //   833: ixor
    //   834: ixor
    //   835: lookupswitch default -> 884, -616816837 -> 860, 70293001 -> 820
    //   860: putstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.$VALUES : [Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   863: return
    //   864: aconst_null
    //   865: athrow
    //   866: aconst_null
    //   867: athrow
    //   868: aconst_null
    //   869: athrow
    //   870: aconst_null
    //   871: athrow
    //   872: aconst_null
    //   873: athrow
    //   874: aconst_null
    //   875: athrow
    //   876: aconst_null
    //   877: athrow
    //   878: aconst_null
    //   879: athrow
    //   880: aconst_null
    //   881: athrow
    //   882: aconst_null
    //   883: athrow
    //   884: aconst_null
    //   885: athrow
    //   886: aconst_null
    //   887: athrow
    //   888: aconst_null
    //   889: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\HoleUtil$BlockSafety.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */