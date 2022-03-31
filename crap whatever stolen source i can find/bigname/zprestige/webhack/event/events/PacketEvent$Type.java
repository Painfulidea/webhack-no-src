package bigname.zprestige.webhack.event.events;

import Perryc;

public enum PacketEvent$Type {
  OUTGOING, INCOMING;
  
  public static PacketEvent$Type[] $VALUES;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/event/events/PacketEvent$Type
    //   3: dup
    //   4: ldc 'ᩯ㌽ᨏㅃ?๗柌'
    //   6: getstatic Perryc.c : I
    //   9: iflt -> 22
    //   12: ldc2_w -236519286
    //   15: l2i
    //   16: ldc -821633101
    //   18: ixor
    //   19: goto -> 29
    //   22: ldc2_w 237174825
    //   25: l2i
    //   26: ldc -301740936
    //   28: ixor
    //   29: ldc2_w -51189320
    //   32: l2i
    //   33: ldc -2048798827
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 64, 1207105812 -> 610, 2008341612 -> 22
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: ldc2_w -63662669
    //   70: l2i
    //   71: ldc -63662669
    //   73: ixor
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 90
    //   80: ldc2_w -1521818020
    //   83: l2i
    //   84: ldc 544147861
    //   86: ixor
    //   87: goto -> 97
    //   90: ldc2_w -1723636887
    //   93: l2i
    //   94: ldc 1596637725
    //   96: ixor
    //   97: ldc2_w 1544166275
    //   100: l2i
    //   101: ldc -810550025
    //   103: ixor
    //   104: ixor
    //   105: lookupswitch default -> 614, 377489597 -> 90, 1439450624 -> 132
    //   132: invokespecial <init> : (Ljava/lang/String;I)V
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 151
    //   141: ldc2_w -636669840
    //   144: l2i
    //   145: ldc 1382271062
    //   147: ixor
    //   148: goto -> 158
    //   151: ldc2_w -2120078163
    //   154: l2i
    //   155: ldc 1752950460
    //   157: ixor
    //   158: ldc2_w -824167015
    //   161: l2i
    //   162: ldc 550985473
    //   164: ixor
    //   165: ixor
    //   166: lookupswitch default -> 612, 133079177 -> 192, 1717146302 -> 151
    //   192: putstatic bigname/zprestige/webhack/event/events/PacketEvent$Type.INCOMING : Lbigname/zprestige/webhack/event/events/PacketEvent$Type;
    //   195: new bigname/zprestige/webhack/event/events/PacketEvent$Type
    //   198: dup
    //   199: ldc 'ᩩ㌦ᨘㅋ?๗柌'
    //   201: getstatic Perryc.c : I
    //   204: iflt -> 217
    //   207: ldc2_w -54217486
    //   210: l2i
    //   211: ldc -131154336
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -810601276
    //   220: l2i
    //   221: ldc -1940046455
    //   223: ixor
    //   224: ldc2_w -1855017072
    //   227: l2i
    //   228: ldc 313808382
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 616, -2026835716 -> 217, -1071058141 -> 260
    //   260: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   263: ldc2_w -583406294
    //   266: l2i
    //   267: ldc -583406293
    //   269: ixor
    //   270: getstatic Perryc.0 : I
    //   273: ifle -> 286
    //   276: ldc2_w -2002913999
    //   279: l2i
    //   280: ldc -519224427
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 1558818303
    //   289: l2i
    //   290: ldc -2134276221
    //   292: ixor
    //   293: ldc2_w 687830390
    //   296: l2i
    //   297: ldc 617385860
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, 122626494 -> 286, 1705200726 -> 608
    //   328: invokespecial <init> : (Ljava/lang/String;I)V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 347
    //   337: ldc2_w -846132631
    //   340: l2i
    //   341: ldc 553889896
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -1093935560
    //   350: l2i
    //   351: ldc -1461677335
    //   353: ixor
    //   354: ldc2_w -518331643
    //   357: l2i
    //   358: ldc 372229712
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 388, -1665864784 -> 347, 463970132 -> 602
    //   388: putstatic bigname/zprestige/webhack/event/events/PacketEvent$Type.OUTGOING : Lbigname/zprestige/webhack/event/events/PacketEvent$Type;
    //   391: ldc2_w -416248814
    //   394: l2i
    //   395: ldc -416248816
    //   397: ixor
    //   398: anewarray bigname/zprestige/webhack/event/events/PacketEvent$Type
    //   401: dup
    //   402: ldc2_w -165019404
    //   405: l2i
    //   406: ldc -165019404
    //   408: ixor
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 425
    //   415: ldc2_w 2013531848
    //   418: l2i
    //   419: ldc 1884084776
    //   421: ixor
    //   422: goto -> 432
    //   425: ldc2_w 453099660
    //   428: l2i
    //   429: ldc -302336351
    //   431: ixor
    //   432: ldc2_w -1938154966
    //   435: l2i
    //   436: ldc 1312535050
    //   438: ixor
    //   439: ixor
    //   440: lookupswitch default -> 600, -905347904 -> 425, 884661773 -> 468
    //   468: getstatic bigname/zprestige/webhack/event/events/PacketEvent$Type.INCOMING : Lbigname/zprestige/webhack/event/events/PacketEvent$Type;
    //   471: aastore
    //   472: dup
    //   473: ldc2_w -755227256
    //   476: l2i
    //   477: ldc -755227255
    //   479: ixor
    //   480: getstatic Perryc.c : I
    //   483: iflt -> 496
    //   486: ldc2_w 1313051589
    //   489: l2i
    //   490: ldc 122221833
    //   492: ixor
    //   493: goto -> 503
    //   496: ldc2_w 1210095420
    //   499: l2i
    //   500: ldc -549717839
    //   502: ixor
    //   503: ldc2_w -584675473
    //   506: l2i
    //   507: ldc 1254511527
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 536, -554976764 -> 604, 1216726450 -> 496
    //   536: getstatic bigname/zprestige/webhack/event/events/PacketEvent$Type.OUTGOING : Lbigname/zprestige/webhack/event/events/PacketEvent$Type;
    //   539: aastore
    //   540: getstatic Perryc.c : I
    //   543: iflt -> 556
    //   546: ldc2_w -1092438758
    //   549: l2i
    //   550: ldc 1351301821
    //   552: ixor
    //   553: goto -> 563
    //   556: ldc2_w 602939310
    //   559: l2i
    //   560: ldc 802758283
    //   562: ixor
    //   563: ldc2_w 860642816
    //   566: l2i
    //   567: ldc 842911369
    //   569: ixor
    //   570: ixor
    //   571: lookupswitch default -> 606, -283631826 -> 556, 223908268 -> 596
    //   596: putstatic bigname/zprestige/webhack/event/events/PacketEvent$Type.$VALUES : [Lbigname/zprestige/webhack/event/events/PacketEvent$Type;
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\PacketEvent$Type.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */