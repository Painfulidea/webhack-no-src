package bigname.zprestige.webhack.util;

import Perryc;

public enum InventoryUtil$Switch {
  NONE, NORMAL, SILENT;
  
  public static InventoryUtil$Switch[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/util/InventoryUtil$Switch
    //   3: dup
    //   4: ldc '⺑㌼⻧ㅁ達쀯'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w -181693314
    //   15: l2i
    //   16: ldc 1164319006
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w -623910870
    //   25: l2i
    //   26: ldc -1298766883
    //   28: ixor
    //   29: ldc2_w -1871962521
    //   32: l2i
    //   33: ldc -39162857
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, -578027760 -> 872, -473635049 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 834024193
    //   70: l2i
    //   71: ldc 834024193
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w 1477699125
    //   83: l2i
    //   84: ldc -313124566
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -383963993
    //   93: l2i
    //   94: ldc -1854560490
    //   96: ixor
    //   97: ldc2_w 1050396591
    //   100: l2i
    //   101: ldc 1016643923
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 882, -1220085277 -> 90, 2053868877 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 151
    //   141: ldc2_w -463209289
    //   144: l2i
    //   145: ldc -1817559361
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -825513925
    //   154: l2i
    //   155: ldc -1699914571
    //   157: ixor
    //   158: ldc2_w -841547126
    //   161: l2i
    //   162: ldc -1162070870
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 884, 10679336 -> 151, 588104366 -> 192
    //   192: putstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.NORMAL : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   195: new bigname/zprestige/webhack/util/InventoryUtil$Switch
    //   198: dup
    //   199: ldc '⺌㌺⻹ㅉ遛쀷'
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 217
    //   207: ldc2_w -1623619665
    //   210: l2i
    //   211: ldc -93836175
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1584809010
    //   220: l2i
    //   221: ldc 791072045
    //   223: ixor
    //   224: ldc2_w -726673113
    //   227: l2i
    //   228: ldc 1964491781
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -2095410822 -> 217, -991316228 -> 888
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 527382816
    //   266: l2i
    //   267: ldc 527382817
    //   269: ixor
    //   270: getstatic Perryc.c : I
    //   273: iflt -> 286
    //   276: ldc2_w -870109958
    //   279: l2i
    //   280: ldc 1075969043
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 1507001587
    //   289: l2i
    //   290: ldc -895067853
    //   292: ixor
    //   293: ldc2_w -1412471092
    //   296: l2i
    //   297: ldc -729070663
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -213453412 -> 868, 80485095 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w -1253526499
    //   340: l2i
    //   341: ldc 2106141383
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1115999835
    //   350: l2i
    //   351: ldc -195145568
    //   353: ixor
    //   354: ldc2_w 1960170143
    //   357: l2i
    //   358: ldc -620897950
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, 322232376 -> 347, 1726584103 -> 876
    //   388: putstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.SILENT : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   391: new bigname/zprestige/webhack/util/InventoryUtil$Switch
    //   394: dup
    //   395: ldc '⺑㌼⻻ㅉ'
    //   397: getstatic Perryc.1 : I
    //   400: ifeq -> 413
    //   403: ldc2_w 1428881640
    //   406: l2i
    //   407: ldc 1073651920
    //   409: ixor
    //   410: goto -> 420
    //   413: ldc2_w -459646649
    //   416: l2i
    //   417: ldc 1174597065
    //   419: ixor
    //   420: ldc2_w -1930699568
    //   423: l2i
    //   424: ldc 1673826860
    //   426: ixor
    //   427: ixor
    //   428: lookupswitch default -> 456, -2047152444 -> 864, 1271649467 -> 413
    //   456: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   459: ldc2_w -1557920716
    //   462: l2i
    //   463: ldc -1557920714
    //   465: ixor
    //   466: getstatic Perryc.1 : I
    //   469: ifeq -> 482
    //   472: ldc2_w -201812521
    //   475: l2i
    //   476: ldc -469612772
    //   478: ixor
    //   479: goto -> 489
    //   482: ldc2_w 2109698202
    //   485: l2i
    //   486: ldc -1131936036
    //   488: ixor
    //   489: ldc2_w -1170502922
    //   492: l2i
    //   493: ldc 541047259
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 874, -1912675866 -> 482, 1530086763 -> 524
    //   524: invokespecial <init> : (Ljava/lang/String;I)V
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 543
    //   533: ldc2_w -775205754
    //   536: l2i
    //   537: ldc 805145702
    //   539: ixor
    //   540: goto -> 550
    //   543: ldc2_w -83124753
    //   546: l2i
    //   547: ldc -1522841161
    //   549: ixor
    //   550: ldc2_w 1791365179
    //   553: l2i
    //   554: ldc -309416419
    //   556: ixor
    //   557: ixor
    //   558: lookupswitch default -> 870, -646419842 -> 584, 2038333126 -> 543
    //   584: putstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.NONE : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   587: ldc2_w -1191571774
    //   590: l2i
    //   591: ldc -1191571775
    //   593: ixor
    //   594: anewarray bigname/zprestige/webhack/util/InventoryUtil$Switch
    //   597: dup
    //   598: ldc2_w 117640513
    //   601: l2i
    //   602: ldc 117640513
    //   604: ixor
    //   605: getstatic Perryc.1 : I
    //   608: ifeq -> 621
    //   611: ldc2_w 674943850
    //   614: l2i
    //   615: ldc -1393282186
    //   617: ixor
    //   618: goto -> 628
    //   621: ldc2_w 655394891
    //   624: l2i
    //   625: ldc 706649123
    //   627: ixor
    //   628: ldc2_w 2045802254
    //   631: l2i
    //   632: ldc 841730894
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 878, -820683684 -> 621, 1188407336 -> 664
    //   664: getstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.NORMAL : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   667: aastore
    //   668: dup
    //   669: ldc2_w -39864484
    //   672: l2i
    //   673: ldc -39864483
    //   675: ixor
    //   676: getstatic Perryc.0 : I
    //   679: ifle -> 692
    //   682: ldc2_w 1851846374
    //   685: l2i
    //   686: ldc 1841932526
    //   688: ixor
    //   689: goto -> 699
    //   692: ldc2_w 217990784
    //   695: l2i
    //   696: ldc -126486165
    //   698: ixor
    //   699: ldc2_w 1468099167
    //   702: l2i
    //   703: ldc 1596095873
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 866, -64444363 -> 732, 185225686 -> 692
    //   732: getstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.SILENT : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   735: aastore
    //   736: dup
    //   737: ldc2_w -403889442
    //   740: l2i
    //   741: ldc -403889444
    //   743: ixor
    //   744: getstatic Perryc.c : I
    //   747: iflt -> 760
    //   750: ldc2_w -427397257
    //   753: l2i
    //   754: ldc 1935760134
    //   756: ixor
    //   757: goto -> 767
    //   760: ldc2_w -1901928627
    //   763: l2i
    //   764: ldc 1744096591
    //   766: ixor
    //   767: ldc2_w 1448528771
    //   770: l2i
    //   771: ldc -1600929475
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 880, 529733820 -> 800, 1663188687 -> 760
    //   800: getstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.NONE : Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
    //   803: aastore
    //   804: getstatic Perryc.1 : I
    //   807: ifeq -> 820
    //   810: ldc2_w -1054110711
    //   813: l2i
    //   814: ldc -277519460
    //   816: ixor
    //   817: goto -> 827
    //   820: ldc2_w -802168133
    //   823: l2i
    //   824: ldc 1743836305
    //   826: ixor
    //   827: ldc2_w -1388793345
    //   830: l2i
    //   831: ldc 1285293643
    //   833: ixor
    //   834: ixor
    //   835: lookupswitch default -> 886, -805677023 -> 820, 1450934686 -> 860
    //   860: putstatic bigname/zprestige/webhack/util/InventoryUtil$Switch.$VALUES : [Lbigname/zprestige/webhack/util/InventoryUtil$Switch;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\InventoryUtil$Switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */