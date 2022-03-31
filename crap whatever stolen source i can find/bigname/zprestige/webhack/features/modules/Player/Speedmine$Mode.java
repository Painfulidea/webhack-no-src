package bigname.zprestige.webhack.features.modules.Player;

import Perryc;

public enum Speedmine$Mode {
  INSTANT, DAMAGE, PACKET;
  
  public static Speedmine$Mode[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode
    //   3: dup
    //   4: ldc 'ᚡ㌲ᛀㅇ?'
    //   6: getstatic Perryc.1 : I
    //   9: ifeq -> 22
    //   12: ldc2_w 977862879
    //   15: l2i
    //   16: ldc -300684946
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w -142343531
    //   25: l2i
    //   26: ldc -12153454
    //   28: ixor
    //   29: ldc2_w 1255692871
    //   32: l2i
    //   33: ldc 636856479
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 886, -1149822103 -> 22, 1743748575 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 380712182
    //   70: l2i
    //   71: ldc 380712182
    //   73: ixor
    //   74: getstatic Perryc.1 : I
    //   77: ifeq -> 90
    //   80: ldc2_w 1628749216
    //   83: l2i
    //   84: ldc 1005156125
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -938234133
    //   93: l2i
    //   94: ldc 1571168832
    //   96: ixor
    //   97: ldc2_w -913947303
    //   100: l2i
    //   101: ldc -1059501853
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 872, -1662353135 -> 132, 1403176711 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 151
    //   141: ldc2_w 2055378761
    //   144: l2i
    //   145: ldc 1368428829
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -271221972
    //   154: l2i
    //   155: ldc -1429446519
    //   157: ixor
    //   158: ldc2_w 781969822
    //   161: l2i
    //   162: ldc 303015923
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 876, 394676281 -> 151, 2039305672 -> 192
    //   192: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.PACKET : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   195: new bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode
    //   198: dup
    //   199: ldc 'ᚵ㌲ᛎㅍ?'
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 217
    //   207: ldc2_w -395056797
    //   210: l2i
    //   211: ldc -1528347574
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 99078550
    //   220: l2i
    //   221: ldc 1511368108
    //   223: ixor
    //   224: ldc2_w -2091933480
    //   227: l2i
    //   228: ldc 33104278
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -836621209 -> 894, 352615838 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 837230560
    //   266: l2i
    //   267: ldc 837230561
    //   269: ixor
    //   270: getstatic Perryc.c : I
    //   273: iflt -> 286
    //   276: ldc2_w 736950313
    //   279: l2i
    //   280: ldc 1414149164
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 546247539
    //   289: l2i
    //   290: ldc 47084394
    //   292: ixor
    //   293: ldc2_w 1546884796
    //   296: l2i
    //   297: ldc 783749368
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -52090157 -> 286, 220351041 -> 892
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w 102886065
    //   340: l2i
    //   341: ldc 52282412
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 53699703
    //   350: l2i
    //   351: ldc -1294443197
    //   353: ixor
    //   354: ldc2_w -1077277545
    //   357: l2i
    //   358: ldc 567631278
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 896, -1692172380 -> 347, 804546573 -> 388
    //   388: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.DAMAGE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   391: new bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode
    //   394: dup
    //   395: ldc 'ᚸ㌽ᛐㅘ?ํ'
    //   397: getstatic Perryc.c : I
    //   400: iflt -> 413
    //   403: ldc2_w 1219751013
    //   406: l2i
    //   407: ldc 2144639189
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 1511601254
    //   416: l2i
    //   417: ldc 305989850
    //   419: ixor
    //   420: ldc2_w -1093320456
    //   423: l2i
    //   424: ldc 1556937068
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 874, -1438808792 -> 456, -713110236 -> 413
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w -38068355
    //   462: l2i
    //   463: ldc -38068353
    //   465: ixor
    //   466: getstatic Perryc.0 : I
    //   469: ifle -> 482
    //   472: ldc2_w -242593084
    //   475: l2i
    //   476: ldc 415827899
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w -1524178682
    //   485: l2i
    //   486: ldc -1559213089
    //   488: ixor
    //   489: ldc2_w 498661950
    //   492: l2i
    //   493: ldc -1791750588
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 880, -1900388701 -> 524, 1640997125 -> 482
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 543
    //   533: ldc2_w -1436042052
    //   536: l2i
    //   537: ldc 1919473361
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -1456445935
    //   546: l2i
    //   547: ldc 59145810
    //   549: ixor
    //   550: ldc2_w 1189675013
    //   553: l2i
    //   554: ldc 853309073
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 888, -1405477639 -> 543, -561811753 -> 584
    //   584: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.INSTANT : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   587: ldc2_w -1008836808
    //   590: l2i
    //   591: ldc -1008836805
    //   593: ixor
    //   594: anewarray bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode
    //   597: dup
    //   598: ldc2_w -427232411
    //   601: l2i
    //   602: ldc -427232411
    //   604: ixor
    //   605: getstatic Perryc.c : I
    //   608: iflt -> 621
    //   611: ldc2_w -375821180
    //   614: l2i
    //   615: ldc 1897414830
    //   617: ixor
    //   618: goto -> 628
    //   621: ldc2_w -2097713391
    //   624: l2i
    //   625: ldc -564300816
    //   627: ixor
    //   628: ldc2_w 356212458
    //   631: l2i
    //   632: ldc 664039312
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 882, -1439818416 -> 621, 1845833115 -> 664
    //   664: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.PACKET : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   667: aastore
    //   668: dup
    //   669: ldc2_w 1394969405
    //   672: l2i
    //   673: ldc 1394969404
    //   675: ixor
    //   676: getstatic Perryc.c : I
    //   679: iflt -> 692
    //   682: ldc2_w -1421911360
    //   685: l2i
    //   686: ldc -1273225346
    //   688: ixor
    //   689: goto -> 699
    //   692: ldc2_w 1075667123
    //   695: l2i
    //   696: ldc -1904293867
    //   698: ixor
    //   699: ldc2_w -208515184
    //   702: l2i
    //   703: ldc -440357261
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 732, 158442589 -> 890, 615481350 -> 692
    //   732: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.DAMAGE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   735: aastore
    //   736: dup
    //   737: ldc2_w -540848997
    //   740: l2i
    //   741: ldc -540848999
    //   743: ixor
    //   744: getstatic Perryc.0 : I
    //   747: ifle -> 761
    //   750: ldc2_w 116411959
    //   753: l2i
    //   754: ldc_w -555326730
    //   757: ixor
    //   758: goto -> 769
    //   761: ldc2_w 1674635239
    //   764: l2i
    //   765: ldc_w 53497037
    //   768: ixor
    //   769: ldc2_w 536508640
    //   772: l2i
    //   773: ldc_w 873110789
    //   776: ixor
    //   777: ixor
    //   778: lookupswitch default -> 804, -996827789 -> 761, -202979036 -> 878
    //   804: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.INSTANT : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   807: aastore
    //   808: getstatic Perryc.c : I
    //   811: iflt -> 825
    //   814: ldc2_w -298854236
    //   817: l2i
    //   818: ldc_w 1480053592
    //   821: ixor
    //   822: goto -> 833
    //   825: ldc2_w -1139517919
    //   828: l2i
    //   829: ldc_w 324950034
    //   832: ixor
    //   833: ldc2_w -279789448
    //   836: l2i
    //   837: ldc_w -1986653766
    //   840: ixor
    //   841: ixor
    //   842: lookupswitch default -> 884, -913383439 -> 868, -790832578 -> 825
    //   868: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.$VALUES : [Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   871: return
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
    //   890: aconst_null
    //   891: athrow
    //   892: aconst_null
    //   893: athrow
    //   894: aconst_null
    //   895: athrow
    //   896: aconst_null
    //   897: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Speedmine$Mode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */