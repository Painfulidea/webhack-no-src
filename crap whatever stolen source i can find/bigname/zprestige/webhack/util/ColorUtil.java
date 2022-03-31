package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.awt.Color;

public class ColorUtil {
  public static int toARGB(int r, int g, int b, int a) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 441
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 433
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 425
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/awt/Color
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 44
    //   34: ldc2_w -1816102460
    //   37: l2i
    //   38: ldc -1632363719
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w 1499045827
    //   47: l2i
    //   48: ldc 951498724
    //   50: ixor
    //   51: ldc2_w -1784261452
    //   54: l2i
    //   55: ldc 525650586
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 410, -2021196589 -> 44, -350374391 -> 84
    //   84: iload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 101
    //   91: ldc2_w 613368534
    //   94: l2i
    //   95: ldc -1403980471
    //   97: ixor
    //   98: goto -> 108
    //   101: ldc2_w 929007381
    //   104: l2i
    //   105: ldc 1657154269
    //   107: ixor
    //   108: ldc2_w -669338625
    //   111: l2i
    //   112: ldc -483574367
    //   114: ixor
    //   115: ixor
    //   116: lookupswitch default -> 144, -1276626495 -> 404, -452867886 -> 101
    //   144: iload_1
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 161
    //   151: ldc2_w -1638000858
    //   154: l2i
    //   155: ldc 2122078429
    //   157: ixor
    //   158: goto -> 168
    //   161: ldc2_w -962428213
    //   164: l2i
    //   165: ldc -1707678859
    //   167: ixor
    //   168: ldc2_w -522578066
    //   171: l2i
    //   172: ldc -2099564459
    //   174: ixor
    //   175: ixor
    //   176: lookupswitch default -> 204, -2111608640 -> 406, 947429240 -> 161
    //   204: iload_2
    //   205: getstatic Perryc.c : I
    //   208: iflt -> 221
    //   211: ldc2_w 2068551967
    //   214: l2i
    //   215: ldc 1216747032
    //   217: ixor
    //   218: goto -> 228
    //   221: ldc2_w 757541650
    //   224: l2i
    //   225: ldc 176796423
    //   227: ixor
    //   228: ldc2_w 1243336827
    //   231: l2i
    //   232: ldc -1421588682
    //   234: ixor
    //   235: ixor
    //   236: lookupswitch default -> 264, -1353275519 -> 221, -762177462 -> 408
    //   264: iload_3
    //   265: getstatic Perryc.c : I
    //   268: iflt -> 281
    //   271: ldc2_w -1768200269
    //   274: l2i
    //   275: ldc 1290251565
    //   277: ixor
    //   278: goto -> 288
    //   281: ldc2_w 1584769715
    //   284: l2i
    //   285: ldc 791368482
    //   287: ixor
    //   288: ldc2_w 930486767
    //   291: l2i
    //   292: ldc 237554898
    //   294: ixor
    //   295: ixor
    //   296: lookupswitch default -> 324, -484302941 -> 412, 623383435 -> 281
    //   324: goto -> 328
    //   327: athrow
    //   328: invokespecial <init> : (IIII)V
    //   331: goto -> 335
    //   334: athrow
    //   335: getstatic Perryc.1 : I
    //   338: ifeq -> 351
    //   341: ldc2_w -718532330
    //   344: l2i
    //   345: ldc 1592474777
    //   347: ixor
    //   348: goto -> 358
    //   351: ldc2_w -1206910485
    //   354: l2i
    //   355: ldc 1814291297
    //   357: ixor
    //   358: ldc2_w -1955086354
    //   361: l2i
    //   362: ldc 1860788814
    //   364: ixor
    //   365: ixor
    //   366: lookupswitch default -> 392, 85949401 -> 351, 1851387951 -> 414
    //   392: goto -> 396
    //   395: athrow
    //   396: invokevirtual getRGB : ()I
    //   399: goto -> 403
    //   402: athrow
    //   403: ireturn
    //   404: aconst_null
    //   405: athrow
    //   406: aconst_null
    //   407: athrow
    //   408: aconst_null
    //   409: athrow
    //   410: aconst_null
    //   411: athrow
    //   412: aconst_null
    //   413: athrow
    //   414: aconst_null
    //   415: athrow
    //   416: pop
    //   417: goto -> 24
    //   420: pop
    //   421: aconst_null
    //   422: goto -> 416
    //   425: dup
    //   426: ifnull -> 416
    //   429: checkcast java/lang/Throwable
    //   432: athrow
    //   433: dup
    //   434: ifnull -> 420
    //   437: checkcast java/lang/Throwable
    //   440: athrow
    //   441: aconst_null
    //   442: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	380	0	r	I
    //   24	380	1	g	I
    //   24	380	2	b	I
    //   24	380	3	a	I
    // Exception table:
    //   from	to	target	type
    //   8	20	425	java/lang/NegativeArraySizeException
    //   327	334	334	finally
    //   327	334	3	finally
    //   328	334	327	java/util/NoSuchElementException
    //   328	334	334	java/util/NoSuchElementException
    //   328	334	334	finally
    //   395	402	402	finally
    //   395	402	395	finally
    //   395	402	395	java/lang/NumberFormatException
    //   395	402	395	java/lang/UnsupportedOperationException
    //   396	402	402	java/lang/UnsupportedOperationException
    //   425	433	425	java/util/ConcurrentModificationException
    //   441	443	3	finally
  }
  
  public ColorUtil() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 634626885
    //   9: l2i
    //   10: ldc 1418607977
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1468418170
    //   19: l2i
    //   20: ldc 1940285356
    //   22: ixor
    //   23: ldc2_w 1158677771
    //   26: l2i
    //   27: ldc -279055496
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 120, -619681697 -> 16, 1905403481 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 639804713
    //   66: l2i
    //   67: ldc -671232918
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -2002317987
    //   76: l2i
    //   77: ldc -1301325766
    //   79: ixor
    //   80: ldc2_w -435994442
    //   83: l2i
    //   84: ldc 1482768592
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -2069211903 -> 116, 1337813285 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/ColorUtil;
  }
  
  public static int toRGBA(Color color) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 647
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 639
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 631
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w 242253001
    //   33: l2i
    //   34: ldc 1423262654
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1294285739
    //   43: l2i
    //   44: ldc 1635574349
    //   46: ixor
    //   47: ldc2_w -1276111298
    //   50: l2i
    //   51: ldc 992457630
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 610, -1534165946 -> 80, -764241193 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 1547604497
    //   90: l2i
    //   91: ldc 520608512
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1919838349
    //   100: l2i
    //   101: ldc 1949968954
    //   103: ixor
    //   104: ldc2_w 474616136
    //   107: l2i
    //   108: ldc 73501050
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -302139638 -> 97, 1527959843 -> 618
    //   140: goto -> 144
    //   143: athrow
    //   144: invokevirtual getRed : ()I
    //   147: goto -> 151
    //   150: athrow
    //   151: getstatic Perryc.0 : I
    //   154: ifle -> 167
    //   157: ldc2_w 971983685
    //   160: l2i
    //   161: ldc 629942417
    //   163: ixor
    //   164: goto -> 174
    //   167: ldc2_w 1737227399
    //   170: l2i
    //   171: ldc -272216098
    //   173: ixor
    //   174: ldc2_w -1602925297
    //   177: l2i
    //   178: ldc -1210599234
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 606, -1611708696 -> 208, 197236325 -> 167
    //   208: aload_0
    //   209: getstatic Perryc.c : I
    //   212: iflt -> 225
    //   215: ldc2_w -1325400112
    //   218: l2i
    //   219: ldc -484110482
    //   221: ixor
    //   222: goto -> 232
    //   225: ldc2_w 263975383
    //   228: l2i
    //   229: ldc 983395308
    //   231: ixor
    //   232: ldc2_w 1326485813
    //   235: l2i
    //   236: ldc 688924914
    //   238: ixor
    //   239: ixor
    //   240: lookupswitch default -> 268, -1741207457 -> 225, 903498105 -> 612
    //   268: goto -> 272
    //   271: athrow
    //   272: invokevirtual getGreen : ()I
    //   275: goto -> 279
    //   278: athrow
    //   279: getstatic Perryc.0 : I
    //   282: ifle -> 295
    //   285: ldc2_w -381671351
    //   288: l2i
    //   289: ldc 1245172161
    //   291: ixor
    //   292: goto -> 302
    //   295: ldc2_w -876944494
    //   298: l2i
    //   299: ldc 664020104
    //   301: ixor
    //   302: ldc2_w 660694352
    //   305: l2i
    //   306: ldc 239104586
    //   308: ixor
    //   309: ixor
    //   310: lookupswitch default -> 336, -1974014318 -> 604, 510824557 -> 295
    //   336: aload_0
    //   337: getstatic Perryc.1 : I
    //   340: ifeq -> 353
    //   343: ldc2_w 1335563651
    //   346: l2i
    //   347: ldc -312201028
    //   349: ixor
    //   350: goto -> 360
    //   353: ldc2_w 1264582989
    //   356: l2i
    //   357: ldc -1837760233
    //   359: ixor
    //   360: ldc2_w -366473069
    //   363: l2i
    //   364: ldc 1932378595
    //   366: ixor
    //   367: ixor
    //   368: lookupswitch default -> 396, 1006302287 -> 620, 1448695709 -> 353
    //   396: goto -> 400
    //   399: athrow
    //   400: invokevirtual getBlue : ()I
    //   403: goto -> 407
    //   406: athrow
    //   407: getstatic Perryc.0 : I
    //   410: ifle -> 423
    //   413: ldc2_w 1039856731
    //   416: l2i
    //   417: ldc 1131121888
    //   419: ixor
    //   420: goto -> 430
    //   423: ldc2_w -880281735
    //   426: l2i
    //   427: ldc 1714186598
    //   429: ixor
    //   430: ldc2_w 748623125
    //   433: l2i
    //   434: ldc 1970679869
    //   436: ixor
    //   437: ixor
    //   438: lookupswitch default -> 616, -196953289 -> 464, 662199699 -> 423
    //   464: aload_0
    //   465: getstatic Perryc.c : I
    //   468: iflt -> 481
    //   471: ldc2_w 1467564925
    //   474: l2i
    //   475: ldc 2087856419
    //   477: ixor
    //   478: goto -> 488
    //   481: ldc2_w -483704094
    //   484: l2i
    //   485: ldc -84507691
    //   487: ixor
    //   488: ldc2_w 525655955
    //   491: l2i
    //   492: ldc 962920864
    //   494: ixor
    //   495: ixor
    //   496: lookupswitch default -> 524, 221951085 -> 608, 2061177923 -> 481
    //   524: goto -> 528
    //   527: athrow
    //   528: invokevirtual getAlpha : ()I
    //   531: goto -> 535
    //   534: athrow
    //   535: getstatic Perryc.c : I
    //   538: iflt -> 551
    //   541: ldc2_w -1256745977
    //   544: l2i
    //   545: ldc 569078544
    //   547: ixor
    //   548: goto -> 558
    //   551: ldc2_w -525817046
    //   554: l2i
    //   555: ldc -105918466
    //   557: ixor
    //   558: ldc2_w 148419420
    //   561: l2i
    //   562: ldc 2014651043
    //   564: ixor
    //   565: ixor
    //   566: lookupswitch default -> 592, -466520344 -> 614, -225157411 -> 551
    //   592: goto -> 596
    //   595: athrow
    //   596: invokestatic toRGBA : (IIII)I
    //   599: goto -> 603
    //   602: athrow
    //   603: ireturn
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
    //   618: aconst_null
    //   619: athrow
    //   620: aconst_null
    //   621: athrow
    //   622: pop
    //   623: goto -> 24
    //   626: pop
    //   627: aconst_null
    //   628: goto -> 622
    //   631: dup
    //   632: ifnull -> 622
    //   635: checkcast java/lang/Throwable
    //   638: athrow
    //   639: dup
    //   640: ifnull -> 626
    //   643: checkcast java/lang/Throwable
    //   646: athrow
    //   647: aconst_null
    //   648: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	580	0	color	Ljava/awt/Color;
    // Exception table:
    //   from	to	target	type
    //   8	20	631	finally
    //   143	150	150	finally
    //   143	150	3	finally
    //   143	150	150	finally
    //   144	150	3	finally
    //   144	150	143	java/lang/IllegalArgumentException
    //   271	278	278	finally
    //   271	278	271	java/lang/IllegalStateException
    //   271	278	278	java/lang/IllegalStateException
    //   271	278	3	finally
    //   271	278	278	java/lang/ArrayIndexOutOfBoundsException
    //   399	406	406	finally
    //   399	406	406	java/lang/ArrayIndexOutOfBoundsException
    //   399	406	399	java/lang/AssertionError
    //   400	406	406	java/lang/NumberFormatException
    //   400	406	3	finally
    //   527	534	534	finally
    //   527	534	527	java/util/NoSuchElementException
    //   527	534	527	java/lang/StringIndexOutOfBoundsException
    //   528	534	534	java/lang/ArrayIndexOutOfBoundsException
    //   528	534	527	finally
    //   595	602	602	finally
    //   595	602	602	java/lang/NullPointerException
    //   595	602	3	java/lang/UnsupportedOperationException
    //   596	602	595	java/lang/ArrayIndexOutOfBoundsException
    //   596	602	602	finally
    //   631	639	631	java/lang/IllegalArgumentException
    //   647	649	3	finally
  }
  
  public static void color(int paramInt) {
    Perry1.C(null, (int)843258971L ^ 0x125C04C7, paramInt);
  }
  
  public static int toRGBA(float[] colors) {
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
  
  public static int getRainbow(int speed, int offset, float s) {
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
  
  public static int toRGBA(int r, int g, int b, int a) {
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
  
  public static int toRGBA(double[] colors) {
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
  
  public static int toRGBA(int paramInt1, int paramInt2, int paramInt3) {
    return Perry1.3a(null, (int)-1092438758L ^ 0x9F27B0B7, paramInt1, paramInt2, paramInt3);
  }
  
  public static int toRGBA(float r, float g, float b, float a) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 435
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 427
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 419
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1495264847
    //   33: l2i
    //   34: ldc_w -1903245785
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 240890905
    //   44: l2i
    //   45: ldc_w -705123166
    //   48: ixor
    //   49: ldc2_w -1025636720
    //   52: l2i
    //   53: ldc_w -397650524
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 404, -248427633 -> 84, -50103460 -> 41
    //   84: fload_0
    //   85: ldc_w 0.08879047
    //   88: invokestatic floatToIntBits : (F)I
    //   91: ldc_w 2127222727
    //   94: ixor
    //   95: invokestatic intBitsToFloat : (I)F
    //   98: fmul
    //   99: f2i
    //   100: getstatic Perryc.c : I
    //   103: iflt -> 117
    //   106: ldc2_w 556474907
    //   109: l2i
    //   110: ldc_w 399651055
    //   113: ixor
    //   114: goto -> 125
    //   117: ldc2_w 132951508
    //   120: l2i
    //   121: ldc_w 634512595
    //   124: ixor
    //   125: ldc2_w 812155569
    //   128: l2i
    //   129: ldc_w -1138285787
    //   132: ixor
    //   133: ixor
    //   134: lookupswitch default -> 402, -1368201069 -> 160, -1162431648 -> 117
    //   160: fload_1
    //   161: ldc_w 0.008874043
    //   164: invokestatic floatToIntBits : (F)I
    //   167: ldc_w 2137941103
    //   170: ixor
    //   171: invokestatic intBitsToFloat : (I)F
    //   174: fmul
    //   175: f2i
    //   176: getstatic Perryc.c : I
    //   179: iflt -> 193
    //   182: ldc2_w 2079509512
    //   185: l2i
    //   186: ldc_w -824572215
    //   189: ixor
    //   190: goto -> 201
    //   193: ldc2_w -1030539510
    //   196: l2i
    //   197: ldc_w 2043986559
    //   200: ixor
    //   201: ldc2_w 999906994
    //   204: l2i
    //   205: ldc_w -835216799
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 406, 1082527250 -> 193, 1323905446 -> 236
    //   236: fload_2
    //   237: ldc_w 0.011368373
    //   240: invokestatic floatToIntBits : (F)I
    //   243: ldc_w 2135245418
    //   246: ixor
    //   247: invokestatic intBitsToFloat : (I)F
    //   250: fmul
    //   251: f2i
    //   252: getstatic Perryc.0 : I
    //   255: ifle -> 269
    //   258: ldc2_w -1973376709
    //   261: l2i
    //   262: ldc_w 171793187
    //   265: ixor
    //   266: goto -> 277
    //   269: ldc2_w -1500581640
    //   272: l2i
    //   273: ldc_w 1152588727
    //   276: ixor
    //   277: ldc2_w -1885081510
    //   280: l2i
    //   281: ldc_w 1340194418
    //   284: ixor
    //   285: ixor
    //   286: lookupswitch default -> 400, 578790759 -> 312, 1075821616 -> 269
    //   312: fload_3
    //   313: ldc_w 0.10510004
    //   316: invokestatic floatToIntBits : (F)I
    //   319: ldc_w 2124955313
    //   322: ixor
    //   323: invokestatic intBitsToFloat : (I)F
    //   326: fmul
    //   327: f2i
    //   328: getstatic Perryc.1 : I
    //   331: ifeq -> 345
    //   334: ldc2_w 185053769
    //   337: l2i
    //   338: ldc_w -383131107
    //   341: ixor
    //   342: goto -> 353
    //   345: ldc2_w -1748728709
    //   348: l2i
    //   349: ldc_w 2084251141
    //   352: ixor
    //   353: ldc2_w -1810949451
    //   356: l2i
    //   357: ldc_w 1882686711
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 408, 102157846 -> 345, 264715324 -> 388
    //   388: goto -> 392
    //   391: athrow
    //   392: invokestatic toRGBA : (IIII)I
    //   395: goto -> 399
    //   398: athrow
    //   399: ireturn
    //   400: aconst_null
    //   401: athrow
    //   402: aconst_null
    //   403: athrow
    //   404: aconst_null
    //   405: athrow
    //   406: aconst_null
    //   407: athrow
    //   408: aconst_null
    //   409: athrow
    //   410: pop
    //   411: goto -> 24
    //   414: pop
    //   415: aconst_null
    //   416: goto -> 410
    //   419: dup
    //   420: ifnull -> 410
    //   423: checkcast java/lang/Throwable
    //   426: athrow
    //   427: dup
    //   428: ifnull -> 414
    //   431: checkcast java/lang/Throwable
    //   434: athrow
    //   435: aconst_null
    //   436: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	376	0	r	F
    //   24	376	1	g	F
    //   24	376	2	b	F
    //   24	376	3	a	F
    // Exception table:
    //   from	to	target	type
    //   8	20	419	finally
    //   391	398	398	finally
    //   391	398	398	finally
    //   392	398	3	finally
    //   392	398	391	finally
    //   392	398	3	java/lang/StringIndexOutOfBoundsException
    //   419	427	419	finally
    //   435	437	3	finally
  }
  
  public static Color rainbow(int delay) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\ColorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */