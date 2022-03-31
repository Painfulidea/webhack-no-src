package bigname.zprestige.webhack.event.events;

import Perryc;

public enum Packet$Type {
  OUTGOING, INCOMING;
  
  public static Packet$Type[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/event/events/Packet$Type
    //   3: dup
    //   4: ldc '锭㌽镍ㅃ嚑箑๗'
    //   6: getstatic Perryc.1 : I
    //   9: ifeq -> 22
    //   12: ldc2_w 887427017
    //   15: l2i
    //   16: ldc -1125088198
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 130378708
    //   25: l2i
    //   26: ldc 783632231
    //   28: ixor
    //   29: ldc2_w 2014921978
    //   32: l2i
    //   33: ldc 1393581568
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, -1558408951 -> 600, -515802839 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 126687830
    //   70: l2i
    //   71: ldc 126687830
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w -1658551491
    //   83: l2i
    //   84: ldc -525386884
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 748714838
    //   93: l2i
    //   94: ldc 2044179072
    //   96: ixor
    //   97: ldc2_w 1331094664
    //   100: l2i
    //   101: ldc -1456636601
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 610, -1678761586 -> 90, -1291038695 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 151
    //   141: ldc2_w -278666676
    //   144: l2i
    //   145: ldc 159493566
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -1470297593
    //   154: l2i
    //   155: ldc 1465899215
    //   157: ixor
    //   158: ldc2_w -624548641
    //   161: l2i
    //   162: ldc -362866564
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 612, -811864469 -> 192, -696552623 -> 151
    //   192: putstatic bigname/zprestige/webhack/event/events/Packet$Type.INCOMING : Lbigname/zprestige/webhack/event/events/Packet$Type;
    //   195: new bigname/zprestige/webhack/event/events/Packet$Type
    //   198: dup
    //   199: ldc '锫㌦镚ㅋ嚓箑๗'
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w 1115302280
    //   210: l2i
    //   211: ldc -974301576
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 1744363720
    //   220: l2i
    //   221: ldc -864772671
    //   223: ixor
    //   224: ldc2_w -1525529243
    //   227: l2i
    //   228: ldc 438796542
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 614, 347715730 -> 260, 950188651 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 877563558
    //   266: l2i
    //   267: ldc 877563559
    //   269: ixor
    //   270: getstatic Perryc.1 : I
    //   273: ifeq -> 286
    //   276: ldc2_w -394755551
    //   279: l2i
    //   280: ldc 772169284
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -272595592
    //   289: l2i
    //   290: ldc -1320690542
    //   292: ixor
    //   293: ldc2_w 1802742592
    //   296: l2i
    //   297: ldc -994161252
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, 932694727 -> 286, 1773353657 -> 616
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.1 : I
    //   334: ifeq -> 347
    //   337: ldc2_w -269925735
    //   340: l2i
    //   341: ldc 1961567353
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 1057046300
    //   350: l2i
    //   351: ldc 557720322
    //   353: ixor
    //   354: ldc2_w 42883335
    //   357: l2i
    //   358: ldc -1465231097
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, 824600288 -> 606, 1941124598 -> 347
    //   388: putstatic bigname/zprestige/webhack/event/events/Packet$Type.OUTGOING : Lbigname/zprestige/webhack/event/events/Packet$Type;
    //   391: ldc2_w 221986662
    //   394: l2i
    //   395: ldc 221986660
    //   397: ixor
    //   398: anewarray bigname/zprestige/webhack/event/events/Packet$Type
    //   401: dup
    //   402: ldc2_w -2076114977
    //   405: l2i
    //   406: ldc -2076114977
    //   408: ixor
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 425
    //   415: ldc2_w 615659488
    //   418: l2i
    //   419: ldc 692972299
    //   421: ixor
    //   422: goto -> 432
    //   425: ldc2_w 1791631092
    //   428: l2i
    //   429: ldc 587444402
    //   431: ixor
    //   432: ldc2_w -542938837
    //   435: l2i
    //   436: ldc -1741731474
    //   438: ixor
    //   439: ixor
    //   440: lookupswitch default -> 608, 239439363 -> 468, 1249115310 -> 425
    //   468: getstatic bigname/zprestige/webhack/event/events/Packet$Type.INCOMING : Lbigname/zprestige/webhack/event/events/Packet$Type;
    //   471: aastore
    //   472: dup
    //   473: ldc2_w -1250943636
    //   476: l2i
    //   477: ldc -1250943635
    //   479: ixor
    //   480: getstatic Perryc.0 : I
    //   483: ifle -> 496
    //   486: ldc2_w 1887602575
    //   489: l2i
    //   490: ldc 1501418576
    //   492: ixor
    //   493: goto -> 503
    //   496: ldc2_w -1481651539
    //   499: l2i
    //   500: ldc 1912184409
    //   502: ixor
    //   503: ldc2_w 1032786462
    //   506: l2i
    //   507: ldc 594337313
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 536, 33386806 -> 496, 924622816 -> 602
    //   536: getstatic bigname/zprestige/webhack/event/events/Packet$Type.OUTGOING : Lbigname/zprestige/webhack/event/events/Packet$Type;
    //   539: aastore
    //   540: getstatic Perryc.1 : I
    //   543: ifeq -> 556
    //   546: ldc2_w 1602930089
    //   549: l2i
    //   550: ldc -787140704
    //   552: ixor
    //   553: goto -> 563
    //   556: ldc2_w 77736654
    //   559: l2i
    //   560: ldc -735605679
    //   562: ixor
    //   563: ldc2_w -1746636691
    //   566: l2i
    //   567: ldc 994981606
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 604, 573942914 -> 556, 2083512340 -> 596
    //   596: putstatic bigname/zprestige/webhack/event/events/Packet$Type.$VALUES : [Lbigname/zprestige/webhack/event/events/Packet$Type;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\Packet$Type.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */