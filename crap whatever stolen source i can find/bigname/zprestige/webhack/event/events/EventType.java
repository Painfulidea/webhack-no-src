package bigname.zprestige.webhack.event.events;

import Perryc;

public enum EventType {
  POST, PRE;
  
  public static EventType[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/event/events/EventType
    //   3: dup
    //   4: ldc 'ꌶ㌡ꍉ'
    //   6: getstatic Perryc.0 : I
    //   9: ifle -> 22
    //   12: ldc2_w 2104694755
    //   15: l2i
    //   16: ldc -2128708161
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w -856541483
    //   25: l2i
    //   26: ldc -1416916597
    //   28: ixor
    //   29: ldc2_w 582772695
    //   32: l2i
    //   33: ldc 2059704358
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 600, -1542089299 -> 22, 1057052847 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w 156041819
    //   70: l2i
    //   71: ldc 156041819
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 90
    //   80: ldc2_w 1223247812
    //   83: l2i
    //   84: ldc -1392168722
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w 343976927
    //   93: l2i
    //   94: ldc -1601842828
    //   96: ixor
    //   97: ldc2_w 1319482088
    //   100: l2i
    //   101: ldc 1814932695
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 610, -1769118572 -> 132, -949720811 -> 90
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.c : I
    //   138: iflt -> 151
    //   141: ldc2_w -475990145
    //   144: l2i
    //   145: ldc 1118865046
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w 1060192352
    //   154: l2i
    //   155: ldc -808871141
    //   157: ixor
    //   158: ldc2_w -1686642358
    //   161: l2i
    //   162: ldc 1696904545
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 192, 141207164 -> 151, 1598236098 -> 604
    //   192: putstatic bigname/zprestige/webhack/event/events/EventType.PRE : Lbigname/zprestige/webhack/event/events/EventType;
    //   195: new bigname/zprestige/webhack/event/events/EventType
    //   198: dup
    //   199: ldc 'ꌶ㌼ꍟㅘ'
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 217
    //   207: ldc2_w 2019588521
    //   210: l2i
    //   211: ldc 86405329
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -957415872
    //   220: l2i
    //   221: ldc -650022878
    //   223: ixor
    //   224: ldc2_w 425070319
    //   227: l2i
    //   228: ldc 686630465
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 616, 773105356 -> 260, 1291657686 -> 217
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w 1034064525
    //   266: l2i
    //   267: ldc 1034064524
    //   269: ixor
    //   270: getstatic Perryc.c : I
    //   273: iflt -> 286
    //   276: ldc2_w 986679418
    //   279: l2i
    //   280: ldc 1286026015
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w -281759832
    //   289: l2i
    //   290: ldc 1802965325
    //   292: ixor
    //   293: ldc2_w 999513681
    //   296: l2i
    //   297: ldc -1990801228
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, -995283584 -> 606, -910351657 -> 286
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w 1999283772
    //   340: l2i
    //   341: ldc 1499831745
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w 1666456723
    //   350: l2i
    //   351: ldc 1815810279
    //   353: ixor
    //   354: ldc2_w -92918653
    //   357: l2i
    //   358: ldc -1890808514
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -973941430 -> 347, 1534433856 -> 612
    //   388: putstatic bigname/zprestige/webhack/event/events/EventType.POST : Lbigname/zprestige/webhack/event/events/EventType;
    //   391: ldc2_w 1325047266
    //   394: l2i
    //   395: ldc 1325047264
    //   397: ixor
    //   398: anewarray bigname/zprestige/webhack/event/events/EventType
    //   401: dup
    //   402: ldc2_w 743039932
    //   405: l2i
    //   406: ldc 743039932
    //   408: ixor
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 425
    //   415: ldc2_w -1844607452
    //   418: l2i
    //   419: ldc 1933244739
    //   421: ixor
    //   422: goto -> 432
    //   425: ldc2_w 651635848
    //   428: l2i
    //   429: ldc 1343081970
    //   431: ixor
    //   432: ldc2_w 497101187
    //   435: l2i
    //   436: ldc 586364830
    //   438: ixor
    //   439: ixor
    //   440: lookupswitch default -> 614, -563781254 -> 425, 1233715047 -> 468
    //   468: getstatic bigname/zprestige/webhack/event/events/EventType.PRE : Lbigname/zprestige/webhack/event/events/EventType;
    //   471: aastore
    //   472: dup
    //   473: ldc2_w 540427318
    //   476: l2i
    //   477: ldc 540427319
    //   479: ixor
    //   480: getstatic Perryc.1 : I
    //   483: ifeq -> 496
    //   486: ldc2_w -730778279
    //   489: l2i
    //   490: ldc 201200827
    //   492: ixor
    //   493: goto -> 503
    //   496: ldc2_w -413409243
    //   499: l2i
    //   500: ldc -1059475557
    //   502: ixor
    //   503: ldc2_w -1553618062
    //   506: l2i
    //   507: ldc 1356296816
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 536, 122152181 -> 496, 742258912 -> 608
    //   536: getstatic bigname/zprestige/webhack/event/events/EventType.POST : Lbigname/zprestige/webhack/event/events/EventType;
    //   539: aastore
    //   540: getstatic Perryc.0 : I
    //   543: ifle -> 556
    //   546: ldc2_w -555831211
    //   549: l2i
    //   550: ldc 1977682729
    //   552: ixor
    //   553: goto -> 563
    //   556: ldc2_w -1374602687
    //   559: l2i
    //   560: ldc -1773890657
    //   562: ixor
    //   563: ldc2_w 2043467640
    //   566: l2i
    //   567: ldc -2106318560
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 596, -1754617782 -> 556, 1351044388 -> 602
    //   596: putstatic bigname/zprestige/webhack/event/events/EventType.$VALUES : [Lbigname/zprestige/webhack/event/events/EventType;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\EventType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */