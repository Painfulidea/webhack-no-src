package bigname.zprestige.webhack.features.modules.Client;

import Perryc;

public enum ClickGui$Mode {
  NONE, COLOR, BLUR;
  
  public static ClickGui$Mode[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode
    //   3: dup
    //   4: ldc '볁㌼벜ㅃ㺠'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w 2070178712
    //   15: l2i
    //   16: ldc 1483072043
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 1699999765
    //   25: l2i
    //   26: ldc 264832744
    //   28: ixor
    //   29: ldc2_w 1345506580
    //   32: l2i
    //   33: ldc 1702218084
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, 373722563 -> 876, 546990226 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 1908637579
    //   70: l2i
    //   71: ldc 1908637579
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 90
    //   80: ldc2_w 2147037504
    //   83: l2i
    //   84: ldc 1318343905
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -1288038941
    //   93: l2i
    //   94: ldc 757321611
    //   96: ixor
    //   97: ldc2_w 2144728899
    //   100: l2i
    //   101: ldc -1759384561
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 132, -644251923 -> 886, -487448313 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.1 : I
    //   138: ifeq -> 151
    //   141: ldc2_w 729437399
    //   144: l2i
    //   145: ldc -436177643
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -2114523500
    //   154: l2i
    //   155: ldc -1356657409
    //   157: ixor
    //   158: ldc2_w -948934711
    //   161: l2i
    //   162: ldc 1919699077
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, -1038874181 -> 151, 2019954318 -> 870
    //   192: putstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.COLOR : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   195: new bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode
    //   198: dup
    //   199: ldc '변㌿벅ㅞ'
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 217
    //   207: ldc2_w 1124027936
    //   210: l2i
    //   211: ldc -1263685626
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1493568091
    //   220: l2i
    //   221: ldc 292883967
    //   223: ixor
    //   224: ldc2_w 1723498844
    //   227: l2i
    //   228: ldc -768809908
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, 1120181046 -> 866, 1591041435 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -2103049322
    //   266: l2i
    //   267: ldc -2103049321
    //   269: ixor
    //   270: getstatic Perryc.0 : I
    //   273: ifle -> 286
    //   276: ldc2_w -1549761409
    //   279: l2i
    //   280: ldc -1869470499
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -611862740
    //   289: l2i
    //   290: ldc -1800005849
    //   292: ixor
    //   293: ldc2_w 1662703015
    //   296: l2i
    //   297: ldc 1425863694
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -96805103 -> 286, 81035531 -> 874
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w 1614583436
    //   340: l2i
    //   341: ldc 1974073170
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -81104583
    //   350: l2i
    //   351: ldc -495244085
    //   353: ixor
    //   354: ldc2_w 724041564
    //   357: l2i
    //   358: ldc -832727940
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 878, -252769538 -> 347, -64276782 -> 388
    //   388: putstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.BLUR : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   391: new bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode
    //   394: dup
    //   395: ldc '볌㌼벞ㅉ'
    //   397: getstatic Perryc.0 : I
    //   400: ifle -> 413
    //   403: ldc2_w 930902553
    //   406: l2i
    //   407: ldc -2074638043
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w 328909077
    //   416: l2i
    //   417: ldc -23996781
    //   419: ixor
    //   420: ldc2_w -2001356833
    //   423: l2i
    //   424: ldc 393798538
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, -2146858600 -> 413, 753315689 -> 880
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w 1102845377
    //   462: l2i
    //   463: ldc 1102845379
    //   465: ixor
    //   466: getstatic Perryc.c : I
    //   469: iflt -> 482
    //   472: ldc2_w -1764818105
    //   475: l2i
    //   476: ldc -1920065242
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w -361677085
    //   485: l2i
    //   486: ldc -1048586708
    //   488: ixor
    //   489: ldc2_w 219186554
    //   492: l2i
    //   493: ldc -320622356
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 882, -889332391 -> 524, -88991753 -> 482
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 543
    //   533: ldc2_w 261128429
    //   536: l2i
    //   537: ldc -1650001958
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w 1648475863
    //   546: l2i
    //   547: ldc -1162339810
    //   549: ixor
    //   550: ldc2_w -1752689720
    //   553: l2i
    //   554: ldc -9496382
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 584, -245951203 -> 543, -86934467 -> 872
    //   584: putstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.NONE : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   587: ldc2_w 58006304
    //   590: l2i
    //   591: ldc 58006307
    //   593: ixor
    //   594: anewarray bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode
    //   597: dup
    //   598: ldc2_w -1157393146
    //   601: l2i
    //   602: ldc -1157393146
    //   604: ixor
    //   605: getstatic Perryc.0 : I
    //   608: ifle -> 621
    //   611: ldc2_w -1535648103
    //   614: l2i
    //   615: ldc -1484788670
    //   617: ixor
    //   618: goto -> 628
    //   621: ldc2_w -164716614
    //   624: l2i
    //   625: ldc 1086374623
    //   627: ixor
    //   628: ldc2_w -1442612147
    //   631: l2i
    //   632: ldc -730512328
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 884, -929536752 -> 664, 2105412270 -> 621
    //   664: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.COLOR : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   667: aastore
    //   668: dup
    //   669: ldc2_w 1583307349
    //   672: l2i
    //   673: ldc 1583307348
    //   675: ixor
    //   676: getstatic Perryc.c : I
    //   679: iflt -> 692
    //   682: ldc2_w 42272116
    //   685: l2i
    //   686: ldc 1728336091
    //   688: ixor
    //   689: goto -> 699
    //   692: ldc2_w 736043629
    //   695: l2i
    //   696: ldc 1339964075
    //   698: ixor
    //   699: ldc2_w 858445592
    //   702: l2i
    //   703: ldc 1251872307
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 732, -108862804 -> 692, 473271428 -> 888
    //   732: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.BLUR : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   735: aastore
    //   736: dup
    //   737: ldc2_w -1326085781
    //   740: l2i
    //   741: ldc -1326085783
    //   743: ixor
    //   744: getstatic Perryc.0 : I
    //   747: ifle -> 760
    //   750: ldc2_w 1776337791
    //   753: l2i
    //   754: ldc 1126648828
    //   756: ixor
    //   757: goto -> 767
    //   760: ldc2_w -2056172644
    //   763: l2i
    //   764: ldc 662425059
    //   766: ixor
    //   767: ldc2_w -757435564
    //   770: l2i
    //   771: ldc -2106719160
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 800, 1490800505 -> 760, 2054422431 -> 868
    //   800: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.NONE : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   803: aastore
    //   804: getstatic Perryc.1 : I
    //   807: ifeq -> 820
    //   810: ldc2_w -1486664755
    //   813: l2i
    //   814: ldc 1976794853
    //   816: ixor
    //   817: goto -> 827
    //   820: ldc2_w 908004122
    //   823: l2i
    //   824: ldc -1803799261
    //   826: ixor
    //   827: ldc2_w -1591247451
    //   830: l2i
    //   831: ldc 2129656118
    //   833: ixor
    //   834: ixor
    //   835: lookupswitch default -> 864, 226013627 -> 820, 2108406442 -> 860
    //   860: putstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.$VALUES : [Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Client\ClickGui$Mode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */