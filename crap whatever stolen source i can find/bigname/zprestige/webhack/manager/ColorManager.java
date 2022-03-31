package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import java.awt.Color;

public class ColorManager {
  public float red;
  
  public float blue;
  
  public float alpha;
  
  public Color color;
  
  public float green;
  
  public int getColorAsInt() {
    return Perry1.32(this, (int)-994178193L ^ 0xE618B2AB);
  }
  
  public void updateColor() {
    if (Perryc.c < 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public void setColor(int red, int green, int blue, int alpha) {
    if (Perryc.0 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setGreen(float paramFloat) {
    Perry1.1c(this, (int)201545036L ^ 0x953312F, paramFloat);
  }
  
  public void setAlpha(float paramFloat) {
    Perry1.0Y(this, (int)1188331093L ^ 0x284E0929, paramFloat);
  }
  
  public void setRed(float paramFloat) {
    Perry1.10(this, (int)-957105405L ^ 0xFC80D9C6, paramFloat);
  }
  
  public int getColorAsIntFullAlpha() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 815
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 807
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 799
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/awt/Color
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1865261073
    //   37: l2i
    //   38: ldc_w -1351972460
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 50771618
    //   48: l2i
    //   49: ldc_w -115742295
    //   52: ixor
    //   53: ldc2_w 173020160
    //   56: l2i
    //   57: ldc_w 1799364278
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1588124877 -> 776, 2014916651 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w 999763032
    //   98: l2i
    //   99: ldc_w -268796624
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -423579390
    //   109: l2i
    //   110: ldc_w 24062778
    //   113: ixor
    //   114: ldc2_w -599721945
    //   117: l2i
    //   118: ldc_w -917465359
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -1048756290 -> 778, 1978085257 -> 106
    //   148: getfield color : Ljava/awt/Color;
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w -1058902899
    //   160: l2i
    //   161: ldc_w -579993040
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w -1051412513
    //   171: l2i
    //   172: ldc_w 224283220
    //   175: ixor
    //   176: ldc2_w 1010380989
    //   179: l2i
    //   180: ldc_w 1304315993
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, 379846886 -> 168, 1812665945 -> 768
    //   212: goto -> 216
    //   215: athrow
    //   216: invokevirtual getRed : ()I
    //   219: goto -> 223
    //   222: athrow
    //   223: getstatic Perryc.c : I
    //   226: iflt -> 240
    //   229: ldc2_w 159978705
    //   232: l2i
    //   233: ldc_w -184781866
    //   236: ixor
    //   237: goto -> 248
    //   240: ldc2_w 438376103
    //   243: l2i
    //   244: ldc_w -499685314
    //   247: ixor
    //   248: ldc2_w -1815526186
    //   251: l2i
    //   252: ldc_w 1675241169
    //   255: ixor
    //   256: ixor
    //   257: lookupswitch default -> 774, 134552734 -> 284, 224789760 -> 240
    //   284: aload_0
    //   285: getstatic Perryc.0 : I
    //   288: ifle -> 302
    //   291: ldc2_w -1675001013
    //   294: l2i
    //   295: ldc_w -1436137976
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w 1210983387
    //   305: l2i
    //   306: ldc_w 56862457
    //   309: ixor
    //   310: ldc2_w 1470978087
    //   313: l2i
    //   314: ldc_w -2048906719
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 344, -469584059 -> 772, 1204163309 -> 302
    //   344: getfield color : Ljava/awt/Color;
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w -1151870657
    //   356: l2i
    //   357: ldc_w 1105790093
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1838067632
    //   367: l2i
    //   368: ldc_w 1582358981
    //   371: ixor
    //   372: ldc2_w 1810988742
    //   375: l2i
    //   376: ldc_w 630902310
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1261081262 -> 786, 495917860 -> 364
    //   408: goto -> 412
    //   411: athrow
    //   412: invokevirtual getGreen : ()I
    //   415: goto -> 419
    //   418: athrow
    //   419: getstatic Perryc.c : I
    //   422: iflt -> 436
    //   425: ldc2_w 1326917674
    //   428: l2i
    //   429: ldc_w -2112335732
    //   432: ixor
    //   433: goto -> 444
    //   436: ldc2_w 21196504
    //   439: l2i
    //   440: ldc_w -944450727
    //   443: ixor
    //   444: ldc2_w 74030098
    //   447: l2i
    //   448: ldc_w -143352077
    //   451: ixor
    //   452: ixor
    //   453: lookupswitch default -> 480, 424660482 -> 436, 1041398343 -> 770
    //   480: aload_0
    //   481: getstatic Perryc.c : I
    //   484: iflt -> 498
    //   487: ldc2_w -1307204766
    //   490: l2i
    //   491: ldc_w 1196461954
    //   494: ixor
    //   495: goto -> 506
    //   498: ldc2_w -1619531727
    //   501: l2i
    //   502: ldc_w -361547161
    //   505: ixor
    //   506: ldc2_w -709323422
    //   509: l2i
    //   510: ldc_w 921042
    //   513: ixor
    //   514: ixor
    //   515: lookupswitch default -> 540, 552842320 -> 788, 1615718185 -> 498
    //   540: getfield color : Ljava/awt/Color;
    //   543: getstatic Perryc.0 : I
    //   546: ifle -> 560
    //   549: ldc2_w 1203190771
    //   552: l2i
    //   553: ldc_w 726653099
    //   556: ixor
    //   557: goto -> 568
    //   560: ldc2_w -789963324
    //   563: l2i
    //   564: ldc_w 1333800756
    //   567: ixor
    //   568: ldc2_w 1907033845
    //   571: l2i
    //   572: ldc_w 819545373
    //   575: ixor
    //   576: ixor
    //   577: lookupswitch default -> 604, 5042278 -> 560, 764059824 -> 782
    //   604: goto -> 608
    //   607: athrow
    //   608: invokevirtual getBlue : ()I
    //   611: goto -> 615
    //   614: athrow
    //   615: ldc2_w 1417541185
    //   618: l2i
    //   619: ldc_w 1417541310
    //   622: ixor
    //   623: getstatic Perryc.0 : I
    //   626: ifle -> 640
    //   629: ldc2_w -1572305822
    //   632: l2i
    //   633: ldc_w -847207407
    //   636: ixor
    //   637: goto -> 648
    //   640: ldc2_w 1677145211
    //   643: l2i
    //   644: ldc_w 1573136719
    //   647: ixor
    //   648: ldc2_w 2061753690
    //   651: l2i
    //   652: ldc_w 1895419301
    //   655: ixor
    //   656: ixor
    //   657: lookupswitch default -> 684, 1309301696 -> 640, 1708273804 -> 780
    //   684: goto -> 688
    //   687: athrow
    //   688: invokespecial <init> : (IIII)V
    //   691: goto -> 695
    //   694: athrow
    //   695: getstatic Perryc.0 : I
    //   698: ifle -> 712
    //   701: ldc2_w -1837038942
    //   704: l2i
    //   705: ldc_w 224200080
    //   708: ixor
    //   709: goto -> 720
    //   712: ldc2_w 1132543166
    //   715: l2i
    //   716: ldc_w -360469924
    //   719: ixor
    //   720: ldc2_w -1184886246
    //   723: l2i
    //   724: ldc_w 1652033496
    //   727: ixor
    //   728: ixor
    //   729: lookupswitch default -> 756, 1153700592 -> 784, 1449297938 -> 712
    //   756: goto -> 760
    //   759: athrow
    //   760: invokestatic toRGBA : (Ljava/awt/Color;)I
    //   763: goto -> 767
    //   766: athrow
    //   767: ireturn
    //   768: aconst_null
    //   769: athrow
    //   770: aconst_null
    //   771: athrow
    //   772: aconst_null
    //   773: athrow
    //   774: aconst_null
    //   775: athrow
    //   776: aconst_null
    //   777: athrow
    //   778: aconst_null
    //   779: athrow
    //   780: aconst_null
    //   781: athrow
    //   782: aconst_null
    //   783: athrow
    //   784: aconst_null
    //   785: athrow
    //   786: aconst_null
    //   787: athrow
    //   788: aconst_null
    //   789: athrow
    //   790: pop
    //   791: goto -> 24
    //   794: pop
    //   795: aconst_null
    //   796: goto -> 790
    //   799: dup
    //   800: ifnull -> 790
    //   803: checkcast java/lang/Throwable
    //   806: athrow
    //   807: dup
    //   808: ifnull -> 794
    //   811: checkcast java/lang/Throwable
    //   814: athrow
    //   815: aconst_null
    //   816: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	744	0	this	Lbigname/zprestige/webhack/manager/ColorManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	799	finally
    //   216	222	222	finally
    //   216	222	3	finally
    //   216	222	222	java/lang/ArrayIndexOutOfBoundsException
    //   216	222	222	java/util/NoSuchElementException
    //   216	222	222	java/lang/IllegalArgumentException
    //   411	418	418	finally
    //   411	418	418	java/util/NoSuchElementException
    //   411	418	411	finally
    //   411	418	418	finally
    //   412	418	418	java/lang/IndexOutOfBoundsException
    //   607	614	614	finally
    //   607	614	607	finally
    //   607	614	607	finally
    //   607	614	3	java/lang/NumberFormatException
    //   608	614	3	java/lang/NumberFormatException
    //   687	694	694	finally
    //   687	694	3	finally
    //   687	694	687	java/lang/IndexOutOfBoundsException
    //   688	694	3	finally
    //   688	694	694	java/lang/ClassCastException
    //   759	766	766	finally
    //   759	766	759	java/lang/ClassCastException
    //   759	766	759	java/lang/UnsupportedOperationException
    //   759	766	3	finally
    //   759	766	766	finally
    //   799	807	799	finally
    //   815	817	3	java/lang/RuntimeException
  }
  
  public void setColor(float red, float green, float blue, float alpha) {
    if (Perryc.0 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public int getColorWithAlpha(int alpha) {
    if (Perryc.0 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public Color getColor() {
    if (Perryc.1 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public void setBlue(float paramFloat) {
    Perry1.11(this, (int)-1522815676L ^ 0x9B4918DD, paramFloat);
  }
  
  public void setColor(Color color) {
    if (Perryc.0 <= 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public ColorManager() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -482395899
    //   9: l2i
    //   10: ldc_w -629745740
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -625911573
    //   20: l2i
    //   21: ldc_w -530896104
    //   24: ixor
    //   25: ldc2_w -2101427363
    //   28: l2i
    //   29: ldc_w 672038101
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 1392, -1873097605 -> 60, -1812377287 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -1620822784
    //   70: l2i
    //   71: ldc_w 1714584148
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 744170243
    //   81: l2i
    //   82: ldc_w -602804091
    //   85: ixor
    //   86: ldc2_w 731244220
    //   89: l2i
    //   90: ldc_w -1490078119
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 55818275 -> 78, 1978441649 -> 1388
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -1395348134
    //   132: l2i
    //   133: ldc_w -2106304531
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 754329510
    //   143: l2i
    //   144: ldc_w -1540168187
    //   147: ixor
    //   148: ldc2_w -1999847887
    //   151: l2i
    //   152: ldc_w -1748936756
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 1404, -1748424610 -> 184, 833426250 -> 140
    //   184: aload_0
    //   185: ldc_w 5.381165
    //   188: invokestatic floatToIntBits : (F)I
    //   191: ldc_w 2133602945
    //   194: ixor
    //   195: invokestatic intBitsToFloat : (I)F
    //   198: getstatic Perryc.c : I
    //   201: iflt -> 215
    //   204: ldc2_w -1003239779
    //   207: l2i
    //   208: ldc_w -28906226
    //   211: ixor
    //   212: goto -> 223
    //   215: ldc2_w -1409925264
    //   218: l2i
    //   219: ldc_w -939561557
    //   222: ixor
    //   223: ldc2_w -1358887350
    //   226: l2i
    //   227: ldc_w 105341170
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 1412, -1825354453 -> 215, -984664989 -> 260
    //   260: putfield red : F
    //   263: getstatic Perryc.1 : I
    //   266: ifeq -> 280
    //   269: ldc2_w 241182694
    //   272: l2i
    //   273: ldc_w -225216014
    //   276: ixor
    //   277: goto -> 288
    //   280: ldc2_w -885911215
    //   283: l2i
    //   284: ldc_w 107292009
    //   287: ixor
    //   288: ldc2_w 907570044
    //   291: l2i
    //   292: ldc_w 1877195781
    //   295: ixor
    //   296: ixor
    //   297: lookupswitch default -> 1372, -1800608959 -> 324, -1526167187 -> 280
    //   324: aload_0
    //   325: ldc_w 7.3647294
    //   328: invokestatic floatToIntBits : (F)I
    //   331: ldc_w 2137762781
    //   334: ixor
    //   335: invokestatic intBitsToFloat : (I)F
    //   338: getstatic Perryc.1 : I
    //   341: ifeq -> 355
    //   344: ldc2_w 318893644
    //   347: l2i
    //   348: ldc_w 618471789
    //   351: ixor
    //   352: goto -> 363
    //   355: ldc2_w 30481664
    //   358: l2i
    //   359: ldc_w 843871469
    //   362: ixor
    //   363: ldc2_w 955336751
    //   366: l2i
    //   367: ldc_w -613515250
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 400, -733804800 -> 1390, 589386695 -> 355
    //   400: putfield green : F
    //   403: getstatic Perryc.0 : I
    //   406: ifle -> 420
    //   409: ldc2_w -54651403
    //   412: l2i
    //   413: ldc_w -16841412
    //   416: ixor
    //   417: goto -> 428
    //   420: ldc2_w -1542136642
    //   423: l2i
    //   424: ldc_w -553532750
    //   427: ixor
    //   428: ldc2_w 524805385
    //   431: l2i
    //   432: ldc_w 419984551
    //   435: ixor
    //   436: ixor
    //   437: lookupswitch default -> 464, 68059495 -> 1382, 428900190 -> 420
    //   464: aload_0
    //   465: ldc_w 4.45311
    //   468: invokestatic floatToIntBits : (F)I
    //   471: ldc_w 2131656673
    //   474: ixor
    //   475: invokestatic intBitsToFloat : (I)F
    //   478: getstatic Perryc.c : I
    //   481: iflt -> 495
    //   484: ldc2_w -1681264132
    //   487: l2i
    //   488: ldc_w 588878382
    //   491: ixor
    //   492: goto -> 503
    //   495: ldc2_w -657479120
    //   498: l2i
    //   499: ldc_w 563134977
    //   502: ixor
    //   503: ldc2_w -1553637494
    //   506: l2i
    //   507: ldc_w 437089953
    //   510: ixor
    //   511: ixor
    //   512: lookupswitch default -> 1376, 28855033 -> 495, 1077362970 -> 540
    //   540: putfield blue : F
    //   543: getstatic Perryc.0 : I
    //   546: ifle -> 560
    //   549: ldc2_w 2077427201
    //   552: l2i
    //   553: ldc_w -160961405
    //   556: ixor
    //   557: goto -> 568
    //   560: ldc2_w -1976873505
    //   563: l2i
    //   564: ldc_w -1588921817
    //   567: ixor
    //   568: ldc2_w -2138268323
    //   571: l2i
    //   572: ldc_w -701859299
    //   575: ixor
    //   576: ixor
    //   577: lookupswitch default -> 1410, -619573822 -> 560, 2110214328 -> 604
    //   604: aload_0
    //   605: ldc_w 4.4467583
    //   608: invokestatic floatToIntBits : (F)I
    //   611: ldc_w 2131643352
    //   614: ixor
    //   615: invokestatic intBitsToFloat : (I)F
    //   618: getstatic Perryc.1 : I
    //   621: ifeq -> 635
    //   624: ldc2_w -300285330
    //   627: l2i
    //   628: ldc_w -114791328
    //   631: ixor
    //   632: goto -> 643
    //   635: ldc2_w 1408294462
    //   638: l2i
    //   639: ldc_w -428641428
    //   642: ixor
    //   643: ldc2_w -641822825
    //   646: l2i
    //   647: ldc_w -310245790
    //   650: ixor
    //   651: ixor
    //   652: lookupswitch default -> 680, -1037758587 -> 635, 588179451 -> 1408
    //   680: putfield alpha : F
    //   683: getstatic Perryc.0 : I
    //   686: ifle -> 700
    //   689: ldc2_w 10656744
    //   692: l2i
    //   693: ldc_w -1269093298
    //   696: ixor
    //   697: goto -> 708
    //   700: ldc2_w -588807901
    //   703: l2i
    //   704: ldc_w 283721411
    //   707: ixor
    //   708: ldc2_w 327060056
    //   711: l2i
    //   712: ldc_w 118286333
    //   715: ixor
    //   716: ixor
    //   717: lookupswitch default -> 744, -1601447421 -> 1394, -597981128 -> 700
    //   744: aload_0
    //   745: new java/awt/Color
    //   748: dup
    //   749: getstatic Perryc.0 : I
    //   752: ifle -> 766
    //   755: ldc2_w -1918942664
    //   758: l2i
    //   759: ldc_w 1311310886
    //   762: ixor
    //   763: goto -> 774
    //   766: ldc2_w 707312168
    //   769: l2i
    //   770: ldc_w 851315639
    //   773: ixor
    //   774: ldc2_w -529089209
    //   777: l2i
    //   778: ldc_w 1805109524
    //   781: ixor
    //   782: ixor
    //   783: lookupswitch default -> 808, -1973798975 -> 766, 1213674061 -> 1406
    //   808: aload_0
    //   809: getstatic Perryc.0 : I
    //   812: ifle -> 826
    //   815: ldc2_w 538401830
    //   818: l2i
    //   819: ldc_w -205208670
    //   822: ixor
    //   823: goto -> 834
    //   826: ldc2_w -779077791
    //   829: l2i
    //   830: ldc_w -1724971301
    //   833: ixor
    //   834: ldc2_w -656843820
    //   837: l2i
    //   838: ldc_w -21696240
    //   841: ixor
    //   842: ixor
    //   843: lookupswitch default -> 868, -172083904 -> 1384, -56023126 -> 826
    //   868: getfield red : F
    //   871: getstatic Perryc.1 : I
    //   874: ifeq -> 888
    //   877: ldc2_w 1334983472
    //   880: l2i
    //   881: ldc_w -847253532
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 1788862587
    //   891: l2i
    //   892: ldc_w 520725614
    //   895: ixor
    //   896: ldc2_w 1283656767
    //   899: l2i
    //   900: ldc_w -957421625
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 1396, -282643 -> 932, 142622508 -> 888
    //   932: aload_0
    //   933: getstatic Perryc.0 : I
    //   936: ifle -> 950
    //   939: ldc2_w 1892160098
    //   942: l2i
    //   943: ldc_w 629128864
    //   946: ixor
    //   947: goto -> 958
    //   950: ldc2_w 2048992539
    //   953: l2i
    //   954: ldc_w -40965604
    //   957: ixor
    //   958: ldc2_w -1115993172
    //   961: l2i
    //   962: ldc_w 1213222719
    //   965: ixor
    //   966: ixor
    //   967: lookupswitch default -> 992, -1600346031 -> 1378, 909991346 -> 950
    //   992: getfield green : F
    //   995: getstatic Perryc.0 : I
    //   998: ifle -> 1012
    //   1001: ldc2_w -1970330587
    //   1004: l2i
    //   1005: ldc_w -886038897
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w 1690153542
    //   1015: l2i
    //   1016: ldc_w -215475808
    //   1019: ixor
    //   1020: ldc2_w -1688277147
    //   1023: l2i
    //   1024: ldc_w 1978368041
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1056, -1358277146 -> 1398, 1528951910 -> 1012
    //   1056: aload_0
    //   1057: getstatic Perryc.c : I
    //   1060: iflt -> 1074
    //   1063: ldc2_w -276366585
    //   1066: l2i
    //   1067: ldc_w -888988956
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w -1103156800
    //   1077: l2i
    //   1078: ldc_w 347941170
    //   1081: ixor
    //   1082: ldc2_w -1941515320
    //   1085: l2i
    //   1086: ldc_w 2143591084
    //   1089: ixor
    //   1090: ixor
    //   1091: lookupswitch default -> 1116, -687363961 -> 1402, 1365126983 -> 1074
    //   1116: getfield blue : F
    //   1119: getstatic Perryc.c : I
    //   1122: iflt -> 1136
    //   1125: ldc2_w -145195945
    //   1128: l2i
    //   1129: ldc_w -155921494
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w -1771344033
    //   1139: l2i
    //   1140: ldc_w 496139435
    //   1143: ixor
    //   1144: ldc2_w 1901120060
    //   1147: l2i
    //   1148: ldc_w 2109365149
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1180, 218512988 -> 1380, 808295655 -> 1136
    //   1180: aload_0
    //   1181: getstatic Perryc.1 : I
    //   1184: ifeq -> 1198
    //   1187: ldc2_w 302343002
    //   1190: l2i
    //   1191: ldc_w -1025427506
    //   1194: ixor
    //   1195: goto -> 1206
    //   1198: ldc2_w -522627534
    //   1201: l2i
    //   1202: ldc_w 491509421
    //   1205: ixor
    //   1206: ldc2_w 1550954854
    //   1209: l2i
    //   1210: ldc_w -227360996
    //   1213: ixor
    //   1214: ixor
    //   1215: lookupswitch default -> 1240, 1853316267 -> 1198, 2129091310 -> 1386
    //   1240: getfield alpha : F
    //   1243: getstatic Perryc.c : I
    //   1246: iflt -> 1260
    //   1249: ldc2_w 885928382
    //   1252: l2i
    //   1253: ldc_w 643810862
    //   1256: ixor
    //   1257: goto -> 1268
    //   1260: ldc2_w 56037224
    //   1263: l2i
    //   1264: ldc_w 715444657
    //   1267: ixor
    //   1268: ldc2_w -945912959
    //   1271: l2i
    //   1272: ldc_w 342285509
    //   1275: ixor
    //   1276: ixor
    //   1277: lookupswitch default -> 1304, -1050040108 -> 1374, 1639044598 -> 1260
    //   1304: invokespecial <init> : (FFFF)V
    //   1307: getstatic Perryc.1 : I
    //   1310: ifeq -> 1324
    //   1313: ldc2_w -839284817
    //   1316: l2i
    //   1317: ldc_w -979544478
    //   1320: ixor
    //   1321: goto -> 1332
    //   1324: ldc2_w 139532064
    //   1327: l2i
    //   1328: ldc_w -1704349454
    //   1331: ixor
    //   1332: ldc2_w 985449956
    //   1335: l2i
    //   1336: ldc_w -635273981
    //   1339: ixor
    //   1340: ixor
    //   1341: lookupswitch default -> 1368, -386242262 -> 1400, 795322120 -> 1324
    //   1368: putfield color : Ljava/awt/Color;
    //   1371: return
    //   1372: aconst_null
    //   1373: athrow
    //   1374: aconst_null
    //   1375: athrow
    //   1376: aconst_null
    //   1377: athrow
    //   1378: aconst_null
    //   1379: athrow
    //   1380: aconst_null
    //   1381: athrow
    //   1382: aconst_null
    //   1383: athrow
    //   1384: aconst_null
    //   1385: athrow
    //   1386: aconst_null
    //   1387: athrow
    //   1388: aconst_null
    //   1389: athrow
    //   1390: aconst_null
    //   1391: athrow
    //   1392: aconst_null
    //   1393: athrow
    //   1394: aconst_null
    //   1395: athrow
    //   1396: aconst_null
    //   1397: athrow
    //   1398: aconst_null
    //   1399: athrow
    //   1400: aconst_null
    //   1401: athrow
    //   1402: aconst_null
    //   1403: athrow
    //   1404: aconst_null
    //   1405: athrow
    //   1406: aconst_null
    //   1407: athrow
    //   1408: aconst_null
    //   1409: athrow
    //   1410: aconst_null
    //   1411: athrow
    //   1412: aconst_null
    //   1413: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1372	0	this	Lbigname/zprestige/webhack/manager/ColorManager;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ColorManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */