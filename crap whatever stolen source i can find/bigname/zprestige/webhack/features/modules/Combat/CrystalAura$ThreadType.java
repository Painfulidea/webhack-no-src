package bigname.zprestige.webhack.features.modules.Combat;

import Perryc;

public enum CrystalAura$ThreadType {
  CRYSTAL, BLOCK;
  
  public static CrystalAura$ThreadType[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType
    //   3: dup
    //   4: ldc '쁂㌿쀝ㅏ戻'
    //   6: getstatic Perryc.0 : I
    //   9: ifle -> 22
    //   12: ldc2_w 1572294290
    //   15: l2i
    //   16: ldc 1043696246
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 1979654079
    //   25: l2i
    //   26: ldc -1806526080
    //   28: ixor
    //   29: ldc2_w -1450944576
    //   32: l2i
    //   33: ldc -1868235824
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, -1111474945 -> 22, 1520593140 -> 600
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w -855015471
    //   70: l2i
    //   71: ldc -855015471
    //   73: ixor
    //   74: getstatic Perryc.1 : I
    //   77: ifeq -> 90
    //   80: ldc2_w -1397160549
    //   83: l2i
    //   84: ldc 1886348373
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -1445564039
    //   93: l2i
    //   94: ldc 1111469930
    //   96: ixor
    //   97: ldc2_w 524727424
    //   100: l2i
    //   101: ldc 2141154780
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 132, -1139820398 -> 612, -216177146 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.1 : I
    //   138: ifeq -> 151
    //   141: ldc2_w -388123120
    //   144: l2i
    //   145: ldc -552799665
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 1768965495
    //   154: l2i
    //   155: ldc -121115296
    //   157: ixor
    //   158: ldc2_w 1045199920
    //   161: l2i
    //   162: ldc 1248502742
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, 1140300729 -> 604, 1734071924 -> 151
    //   192: putstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType.BLOCK : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
    //   195: new bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType
    //   198: dup
    //   199: ldc '쁃㌡쀋ㅟ戤⻽๕'
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -550386410
    //   210: l2i
    //   211: ldc -1763113425
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 465245136
    //   220: l2i
    //   221: ldc 636119797
    //   223: ixor
    //   224: ldc2_w 373912353
    //   227: l2i
    //   228: ldc -270236532
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 610, -1334496108 -> 217, -939749752 -> 260
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -1070187758
    //   266: l2i
    //   267: ldc -1070187757
    //   269: ixor
    //   270: getstatic Perryc.0 : I
    //   273: ifle -> 286
    //   276: ldc2_w 797957600
    //   279: l2i
    //   280: ldc 1436365110
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -1908810587
    //   289: l2i
    //   290: ldc 1486152260
    //   292: ixor
    //   293: ldc2_w -1317333676
    //   296: l2i
    //   297: ldc -123400623
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 614, -1619843612 -> 328, 869070803 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w -2006220394
    //   340: l2i
    //   341: ldc 1852614613
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 1096695455
    //   350: l2i
    //   351: ldc 1723919367
    //   353: ixor
    //   354: ldc2_w -1413875481
    //   357: l2i
    //   358: ldc 833198154
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 616, -1114721739 -> 388, 2081900270 -> 347
    //   388: putstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType.CRYSTAL : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
    //   391: ldc2_w 1022822786
    //   394: l2i
    //   395: ldc 1022822784
    //   397: ixor
    //   398: anewarray bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType
    //   401: dup
    //   402: ldc2_w 564337543
    //   405: l2i
    //   406: ldc 564337543
    //   408: ixor
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 425
    //   415: ldc2_w 682371344
    //   418: l2i
    //   419: ldc -515525746
    //   421: ixor
    //   422: goto -> 432
    //   425: ldc2_w -1473147058
    //   428: l2i
    //   429: ldc 574745778
    //   431: ixor
    //   432: ldc2_w -469416079
    //   435: l2i
    //   436: ldc -632412274
    //   438: ixor
    //   439: ixor
    //   440: lookupswitch default -> 606, -1271201021 -> 468, -140314015 -> 425
    //   468: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType.BLOCK : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
    //   471: aastore
    //   472: dup
    //   473: ldc2_w 1559025989
    //   476: l2i
    //   477: ldc 1559025988
    //   479: ixor
    //   480: getstatic Perryc.c : I
    //   483: iflt -> 496
    //   486: ldc2_w -790931073
    //   489: l2i
    //   490: ldc -60037979
    //   492: ixor
    //   493: goto -> 503
    //   496: ldc2_w 1288952909
    //   499: l2i
    //   500: ldc 381608682
    //   502: ixor
    //   503: ldc2_w -1907362545
    //   506: l2i
    //   507: ldc 813349963
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 602, -1836714850 -> 496, -463964189 -> 536
    //   536: getstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType.CRYSTAL : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
    //   539: aastore
    //   540: getstatic Perryc.1 : I
    //   543: ifeq -> 556
    //   546: ldc2_w -1131176301
    //   549: l2i
    //   550: ldc 1202264390
    //   552: ixor
    //   553: goto -> 563
    //   556: ldc2_w -488516280
    //   559: l2i
    //   560: ldc -1518944899
    //   562: ixor
    //   563: ldc2_w 569130560
    //   566: l2i
    //   567: ldc 1892884584
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 596, -1442473475 -> 608, 989937483 -> 556
    //   596: putstatic bigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType.$VALUES : [Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
    //   599: return
    //   600: aconst_null
    //   601: athrow
    //   602: aconst_null
    //   603: athrow
    //   604: aconst_null
    //   605: athrow
    //   606: aconst_null
    //   607: athrow
    //   608: aconst_null
    //   609: athrow
    //   610: aconst_null
    //   611: athrow
    //   612: aconst_null
    //   613: athrow
    //   614: aconst_null
    //   615: athrow
    //   616: aconst_null
    //   617: athrow
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\CrystalAura$ThreadType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */