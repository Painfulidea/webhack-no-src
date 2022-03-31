package bigname.zprestige.webhack.features.gui.font;

import Perry1;
import Perryc;
import java.awt.Font;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.DynamicTexture;

public class CFont {
  public int fontHeight;
  
  public boolean antiAlias;
  
  public boolean fractionalMetrics;
  
  public CFont$CharData[] charData;
  
  public DynamicTexture tex;
  
  public int charOffset;
  
  public float imgSize;
  
  public Font font;
  
  public DynamicTexture setupTexture(Font font, boolean antiAlias, boolean fractionalMetrics, CFont$CharData[] chars) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 822
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 814
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 806
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -802700056
    //   33: l2i
    //   34: ldc 1821108704
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 505963918
    //   43: l2i
    //   44: ldc 1612582494
    //   46: ixor
    //   47: ldc2_w -522691854
    //   50: l2i
    //   51: ldc 1433194367
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 791, -880607651 -> 80, 152615045 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w -763527570
    //   90: l2i
    //   91: ldc 1387510922
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -196727630
    //   100: l2i
    //   101: ldc -1534102528
    //   103: ixor
    //   104: ldc2_w 79782563
    //   107: l2i
    //   108: ldc -418587697
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 775, -1291525666 -> 140, 1661172616 -> 97
    //   140: aload_1
    //   141: getstatic Perryc.1 : I
    //   144: ifeq -> 157
    //   147: ldc2_w -2056260959
    //   150: l2i
    //   151: ldc -448861024
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w 487802191
    //   160: l2i
    //   161: ldc 1119090760
    //   163: ixor
    //   164: ldc2_w 1596702026
    //   167: l2i
    //   168: ldc -2022791035
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 200, -1206645810 -> 783, -268330514 -> 157
    //   200: iload_2
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 217
    //   207: ldc2_w 704143083
    //   210: l2i
    //   211: ldc 2092978689
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 1878941027
    //   220: l2i
    //   221: ldc -1152311836
    //   223: ixor
    //   224: ldc2_w 220166656
    //   227: l2i
    //   228: ldc -1012401287
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -1686073965 -> 787, 1046304508 -> 217
    //   260: iload_3
    //   261: getstatic Perryc.0 : I
    //   264: ifle -> 277
    //   267: ldc2_w -198028616
    //   270: l2i
    //   271: ldc 834472718
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w -942488139
    //   280: l2i
    //   281: ldc -1285151583
    //   283: ixor
    //   284: ldc2_w -125101999
    //   287: l2i
    //   288: ldc -1927954210
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 320, -1341030087 -> 793, 1640974795 -> 277
    //   320: aload #4
    //   322: getstatic Perryc.c : I
    //   325: iflt -> 338
    //   328: ldc2_w 2089632078
    //   331: l2i
    //   332: ldc -1748023260
    //   334: ixor
    //   335: goto -> 345
    //   338: ldc2_w -544687200
    //   341: l2i
    //   342: ldc 419353764
    //   344: ixor
    //   345: ldc2_w 1495154501
    //   348: l2i
    //   349: ldc 861189507
    //   351: ixor
    //   352: ixor
    //   353: lookupswitch default -> 380, -2130148436 -> 777, -748015045 -> 338
    //   380: goto -> 384
    //   383: athrow
    //   384: invokevirtual generateFontImage : (Ljava/awt/Font;ZZ[Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;)Ljava/awt/image/BufferedImage;
    //   387: goto -> 391
    //   390: athrow
    //   391: getstatic Perryc.c : I
    //   394: iflt -> 407
    //   397: ldc2_w -1165092717
    //   400: l2i
    //   401: ldc -428266697
    //   403: ixor
    //   404: goto -> 414
    //   407: ldc2_w 608927339
    //   410: l2i
    //   411: ldc 703875839
    //   413: ixor
    //   414: ldc2_w -1823020545
    //   417: l2i
    //   418: ldc -1273640069
    //   420: ixor
    //   421: ixor
    //   422: lookupswitch default -> 789, 721163792 -> 448, 2075398432 -> 407
    //   448: astore #5
    //   450: new net/minecraft/client/renderer/texture/DynamicTexture
    //   453: dup
    //   454: getstatic Perryc.1 : I
    //   457: ifeq -> 470
    //   460: ldc2_w 1784456253
    //   463: l2i
    //   464: ldc -1733950180
    //   466: ixor
    //   467: goto -> 477
    //   470: ldc2_w -1019842675
    //   473: l2i
    //   474: ldc -1173201596
    //   476: ixor
    //   477: ldc2_w 1527230805
    //   480: l2i
    //   481: ldc -1875605097
    //   483: ixor
    //   484: ixor
    //   485: lookupswitch default -> 785, -1307112949 -> 512, 969513443 -> 470
    //   512: aload #5
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w -855105597
    //   523: l2i
    //   524: ldc -139068236
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w 201933892
    //   533: l2i
    //   534: ldc -1743684879
    //   536: ixor
    //   537: ldc2_w 458227254
    //   540: l2i
    //   541: ldc -199275189
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 773, -705867766 -> 530, 2068352456 -> 572
    //   572: goto -> 576
    //   575: athrow
    //   576: invokespecial <init> : (Ljava/awt/image/BufferedImage;)V
    //   579: goto -> 583
    //   582: athrow
    //   583: areturn
    //   584: getstatic Perryc.0 : I
    //   587: ifle -> 600
    //   590: ldc2_w 835560557
    //   593: l2i
    //   594: ldc 679563757
    //   596: ixor
    //   597: goto -> 607
    //   600: ldc2_w -2067363532
    //   603: l2i
    //   604: ldc 613396727
    //   606: ixor
    //   607: ldc2_w 935482252
    //   610: l2i
    //   611: ldc -1163478403
    //   613: ixor
    //   614: ixor
    //   615: lookupswitch default -> 640, -1809310607 -> 779, 903090511 -> 600
    //   640: astore #6
    //   642: getstatic Perryc.0 : I
    //   645: ifle -> 658
    //   648: ldc2_w 985491540
    //   651: l2i
    //   652: ldc 192279626
    //   654: ixor
    //   655: goto -> 665
    //   658: ldc2_w -991271822
    //   661: l2i
    //   662: ldc 1517207821
    //   664: ixor
    //   665: ldc2_w 1748308955
    //   668: l2i
    //   669: ldc 1560478277
    //   671: ixor
    //   672: ixor
    //   673: lookupswitch default -> 700, -96322011 -> 658, 83791232 -> 781
    //   700: aload #6
    //   702: getstatic Perryc.c : I
    //   705: iflt -> 718
    //   708: ldc2_w -617924354
    //   711: l2i
    //   712: ldc 1637174826
    //   714: ixor
    //   715: goto -> 725
    //   718: ldc2_w -1306866850
    //   721: l2i
    //   722: ldc -1372308118
    //   724: ixor
    //   725: ldc2_w 542155371
    //   728: l2i
    //   729: ldc 2007468827
    //   731: ixor
    //   732: ixor
    //   733: lookupswitch default -> 795, -313958492 -> 718, 1272569668 -> 760
    //   760: goto -> 764
    //   763: athrow
    //   764: invokevirtual printStackTrace : ()V
    //   767: goto -> 771
    //   770: athrow
    //   771: aconst_null
    //   772: areturn
    //   773: aconst_null
    //   774: athrow
    //   775: aconst_null
    //   776: athrow
    //   777: aconst_null
    //   778: athrow
    //   779: aconst_null
    //   780: athrow
    //   781: aconst_null
    //   782: athrow
    //   783: aconst_null
    //   784: athrow
    //   785: aconst_null
    //   786: athrow
    //   787: aconst_null
    //   788: athrow
    //   789: aconst_null
    //   790: athrow
    //   791: aconst_null
    //   792: athrow
    //   793: aconst_null
    //   794: athrow
    //   795: aconst_null
    //   796: athrow
    //   797: pop
    //   798: goto -> 24
    //   801: pop
    //   802: aconst_null
    //   803: goto -> 797
    //   806: dup
    //   807: ifnull -> 797
    //   810: checkcast java/lang/Throwable
    //   813: athrow
    //   814: dup
    //   815: ifnull -> 801
    //   818: checkcast java/lang/Throwable
    //   821: athrow
    //   822: aconst_null
    //   823: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   642	131	6	e	Ljava/lang/Exception;
    //   24	749	0	this	Lbigname/zprestige/webhack/features/gui/font/CFont;
    //   24	749	1	font	Ljava/awt/Font;
    //   24	749	2	antiAlias	Z
    //   24	749	3	fractionalMetrics	Z
    //   24	749	4	chars	[Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   450	323	5	img	Ljava/awt/image/BufferedImage;
    // Exception table:
    //   from	to	target	type
    //   8	20	806	java/lang/NumberFormatException
    //   383	390	390	finally
    //   384	390	3	finally
    //   384	390	390	java/lang/NegativeArraySizeException
    //   384	390	383	finally
    //   384	390	390	finally
    //   450	583	584	java/lang/Exception
    //   575	582	582	finally
    //   575	582	582	java/lang/ArrayIndexOutOfBoundsException
    //   576	582	582	java/lang/AssertionError
    //   576	582	575	java/lang/NumberFormatException
    //   576	582	582	finally
    //   763	770	770	finally
    //   763	770	763	java/util/NoSuchElementException
    //   764	770	763	finally
    //   764	770	770	java/lang/IndexOutOfBoundsException
    //   764	770	770	java/lang/AssertionError
    //   806	814	806	finally
    //   822	824	3	finally
  }
  
  public void setFractionalMetrics(boolean paramBoolean) {
    Perry1.63(this, (int)-2136977756L ^ 0xBDE40F8E, paramBoolean);
  }
  
  public BufferedImage generateFontImage(Font font, boolean antiAlias, boolean fractionalMetrics, CFont$CharData[] chars) {
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
  
  public void drawQuad(float x, float y, float width, float height, float srcX, float srcY, float srcWidth, float srcHeight) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4425
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 4417
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4409
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1175611800
    //   33: l2i
    //   34: ldc_w -1376112467
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 292446245
    //   44: l2i
    //   45: ldc_w -1072412653
    //   48: ixor
    //   49: ldc2_w -895164452
    //   52: l2i
    //   53: ldc_w -1910798933
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1967079511 -> 41, -1353252030 -> 4286
    //   84: fload #5
    //   86: getstatic Perryc.1 : I
    //   89: ifeq -> 103
    //   92: ldc2_w 1761932014
    //   95: l2i
    //   96: ldc_w 1117034374
    //   99: ixor
    //   100: goto -> 111
    //   103: ldc2_w -154201439
    //   106: l2i
    //   107: ldc_w 396391141
    //   110: ixor
    //   111: ldc2_w -482265923
    //   114: l2i
    //   115: ldc_w -420540360
    //   118: ixor
    //   119: ixor
    //   120: lookupswitch default -> 148, -1296119247 -> 103, 775832045 -> 4302
    //   148: aload_0
    //   149: getstatic Perryc.c : I
    //   152: iflt -> 166
    //   155: ldc2_w -276771373
    //   158: l2i
    //   159: ldc_w 1043372038
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -2043574963
    //   169: l2i
    //   170: ldc_w -1626759595
    //   173: ixor
    //   174: ldc2_w -1067493882
    //   177: l2i
    //   178: ldc_w 2134766680
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 4346, -1504003770 -> 208, 1859319691 -> 166
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual getClass : ()Ljava/lang/Class;
    //   215: goto -> 219
    //   218: athrow
    //   219: pop
    //   220: ldc_w 3.464415E-4
    //   223: invokestatic floatToIntBits : (F)I
    //   226: ldc_w 2109055639
    //   229: ixor
    //   230: invokestatic intBitsToFloat : (I)F
    //   233: fdiv
    //   234: getstatic Perryc.0 : I
    //   237: ifle -> 251
    //   240: ldc2_w -214562739
    //   243: l2i
    //   244: ldc_w 89556135
    //   247: ixor
    //   248: goto -> 259
    //   251: ldc2_w 1050627529
    //   254: l2i
    //   255: ldc_w 208236442
    //   258: ixor
    //   259: ldc2_w -1961024393
    //   262: l2i
    //   263: ldc_w 1393249229
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 4276, -354398743 -> 296, 779543376 -> 251
    //   296: fstore #9
    //   298: getstatic Perryc.0 : I
    //   301: ifle -> 315
    //   304: ldc2_w -165392921
    //   307: l2i
    //   308: ldc_w -88666942
    //   311: ixor
    //   312: goto -> 323
    //   315: ldc2_w -1450163448
    //   318: l2i
    //   319: ldc_w 357153931
    //   322: ixor
    //   323: ldc2_w 667382173
    //   326: l2i
    //   327: ldc_w -1456990843
    //   330: ixor
    //   331: ixor
    //   332: lookupswitch default -> 360, -2105793219 -> 4352, 1168494582 -> 315
    //   360: fload #6
    //   362: getstatic Perryc.c : I
    //   365: iflt -> 379
    //   368: ldc2_w 612606918
    //   371: l2i
    //   372: ldc_w 2045357892
    //   375: ixor
    //   376: goto -> 387
    //   379: ldc2_w 1994894015
    //   382: l2i
    //   383: ldc_w -1422453281
    //   386: ixor
    //   387: ldc2_w -355290481
    //   390: l2i
    //   391: ldc_w -745256233
    //   394: ixor
    //   395: ixor
    //   396: lookupswitch default -> 4362, -459913416 -> 424, 1680667866 -> 379
    //   424: aload_0
    //   425: getstatic Perryc.c : I
    //   428: iflt -> 442
    //   431: ldc2_w 336890647
    //   434: l2i
    //   435: ldc_w 1922261935
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w -1817493316
    //   445: l2i
    //   446: ldc_w -876153599
    //   449: ixor
    //   450: ldc2_w 298014616
    //   453: l2i
    //   454: ldc_w 1017813269
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 4272, 1273898549 -> 442, 1963227952 -> 484
    //   484: goto -> 488
    //   487: athrow
    //   488: invokevirtual getClass : ()Ljava/lang/Class;
    //   491: goto -> 495
    //   494: athrow
    //   495: pop
    //   496: ldc_w 6.2476605E-4
    //   499: invokestatic floatToIntBits : (F)I
    //   502: ldc_w 2116274007
    //   505: ixor
    //   506: invokestatic intBitsToFloat : (I)F
    //   509: fdiv
    //   510: getstatic Perryc.1 : I
    //   513: ifeq -> 527
    //   516: ldc2_w 1336313906
    //   519: l2i
    //   520: ldc_w 1504347738
    //   523: ixor
    //   524: goto -> 535
    //   527: ldc2_w -581109401
    //   530: l2i
    //   531: ldc_w 61234903
    //   534: ixor
    //   535: ldc2_w -346498782
    //   538: l2i
    //   539: ldc_w -735862717
    //   542: ixor
    //   543: ixor
    //   544: lookupswitch default -> 572, -1508117620 -> 527, 695695113 -> 4366
    //   572: fstore #10
    //   574: getstatic Perryc.c : I
    //   577: iflt -> 591
    //   580: ldc2_w 501416626
    //   583: l2i
    //   584: ldc_w -345145671
    //   587: ixor
    //   588: goto -> 599
    //   591: ldc2_w 836377199
    //   594: l2i
    //   595: ldc_w 279802806
    //   598: ixor
    //   599: ldc2_w 703156690
    //   602: l2i
    //   603: ldc_w 559134745
    //   606: ixor
    //   607: ixor
    //   608: lookupswitch default -> 636, -30108224 -> 4368, 601117709 -> 591
    //   636: fload #7
    //   638: getstatic Perryc.c : I
    //   641: iflt -> 655
    //   644: ldc2_w 1461305250
    //   647: l2i
    //   648: ldc_w -1139014619
    //   651: ixor
    //   652: goto -> 663
    //   655: ldc2_w -794764989
    //   658: l2i
    //   659: ldc_w -1283121223
    //   662: ixor
    //   663: ldc2_w 1819411905
    //   666: l2i
    //   667: ldc_w -1452282061
    //   670: ixor
    //   671: ixor
    //   672: lookupswitch default -> 4356, -1506268152 -> 700, 773345653 -> 655
    //   700: aload_0
    //   701: getstatic Perryc.1 : I
    //   704: ifeq -> 718
    //   707: ldc2_w 99632634
    //   710: l2i
    //   711: ldc_w 1081143191
    //   714: ixor
    //   715: goto -> 726
    //   718: ldc2_w 1456099868
    //   721: l2i
    //   722: ldc_w -1875493823
    //   725: ixor
    //   726: ldc2_w -389184988
    //   729: l2i
    //   730: ldc_w -1392101625
    //   733: ixor
    //   734: ixor
    //   735: lookupswitch default -> 4280, -2093491330 -> 760, 4923214 -> 718
    //   760: goto -> 764
    //   763: athrow
    //   764: invokevirtual getClass : ()Ljava/lang/Class;
    //   767: goto -> 771
    //   770: athrow
    //   771: pop
    //   772: ldc_w 0.0020225425
    //   775: invokestatic floatToIntBits : (F)I
    //   778: ldc_w 2131004578
    //   781: ixor
    //   782: invokestatic intBitsToFloat : (I)F
    //   785: fdiv
    //   786: getstatic Perryc.c : I
    //   789: iflt -> 803
    //   792: ldc2_w -434557569
    //   795: l2i
    //   796: ldc_w 637802311
    //   799: ixor
    //   800: goto -> 811
    //   803: ldc2_w 28219743
    //   806: l2i
    //   807: ldc_w -1954319156
    //   810: ixor
    //   811: ldc2_w 1543135913
    //   814: l2i
    //   815: ldc_w 1987060679
    //   818: ixor
    //   819: ixor
    //   820: lookupswitch default -> 848, -535018984 -> 803, -308839594 -> 4290
    //   848: fstore #11
    //   850: getstatic Perryc.1 : I
    //   853: ifeq -> 867
    //   856: ldc2_w 2106820669
    //   859: l2i
    //   860: ldc_w 1645143898
    //   863: ixor
    //   864: goto -> 875
    //   867: ldc2_w -2080419808
    //   870: l2i
    //   871: ldc_w 1930867036
    //   874: ixor
    //   875: ldc2_w 1608613633
    //   878: l2i
    //   879: ldc_w 2038166856
    //   882: ixor
    //   883: ixor
    //   884: lookupswitch default -> 4398, -697078987 -> 912, 956818734 -> 867
    //   912: fload #8
    //   914: getstatic Perryc.c : I
    //   917: iflt -> 931
    //   920: ldc2_w 1557293863
    //   923: l2i
    //   924: ldc_w 2033241747
    //   927: ixor
    //   928: goto -> 939
    //   931: ldc2_w -1407752711
    //   934: l2i
    //   935: ldc_w 342376780
    //   938: ixor
    //   939: ldc2_w 817965927
    //   942: l2i
    //   943: ldc_w -2000747056
    //   946: ixor
    //   947: ixor
    //   948: lookupswitch default -> 976, -1650685181 -> 4292, 1705307032 -> 931
    //   976: aload_0
    //   977: getstatic Perryc.0 : I
    //   980: ifle -> 994
    //   983: ldc2_w 676570241
    //   986: l2i
    //   987: ldc_w -1739053519
    //   990: ixor
    //   991: goto -> 1002
    //   994: ldc2_w 1967116787
    //   997: l2i
    //   998: ldc_w 804098766
    //   1001: ixor
    //   1002: ldc2_w 1218782467
    //   1005: l2i
    //   1006: ldc_w -1257958938
    //   1009: ixor
    //   1010: ixor
    //   1011: lookupswitch default -> 1036, 1303098965 -> 4334, 1685857102 -> 994
    //   1036: goto -> 1040
    //   1039: athrow
    //   1040: invokevirtual getClass : ()Ljava/lang/Class;
    //   1043: goto -> 1047
    //   1046: athrow
    //   1047: pop
    //   1048: ldc_w 0.0030605784
    //   1051: invokestatic floatToIntBits : (F)I
    //   1054: ldc_w 2135462908
    //   1057: ixor
    //   1058: invokestatic intBitsToFloat : (I)F
    //   1061: fdiv
    //   1062: getstatic Perryc.0 : I
    //   1065: ifle -> 1079
    //   1068: ldc2_w -1050186712
    //   1071: l2i
    //   1072: ldc_w 345253081
    //   1075: ixor
    //   1076: goto -> 1087
    //   1079: ldc2_w 1344437654
    //   1082: l2i
    //   1083: ldc_w -548636449
    //   1086: ixor
    //   1087: ldc2_w 290292203
    //   1090: l2i
    //   1091: ldc_w -1970368171
    //   1094: ixor
    //   1095: ixor
    //   1096: lookupswitch default -> 4378, 346887671 -> 1124, 1311791183 -> 1079
    //   1124: fstore #12
    //   1126: getstatic Perryc.0 : I
    //   1129: ifle -> 1143
    //   1132: ldc2_w -2079185989
    //   1135: l2i
    //   1136: ldc_w -1814966231
    //   1139: ixor
    //   1140: goto -> 1151
    //   1143: ldc2_w 250308030
    //   1146: l2i
    //   1147: ldc_w 1430835181
    //   1150: ixor
    //   1151: ldc2_w -1102422529
    //   1154: l2i
    //   1155: ldc_w 357311569
    //   1158: ixor
    //   1159: ixor
    //   1160: lookupswitch default -> 4380, -1127904708 -> 1143, -257567747 -> 1188
    //   1188: fload #9
    //   1190: getstatic Perryc.1 : I
    //   1193: ifeq -> 1207
    //   1196: ldc2_w 921456538
    //   1199: l2i
    //   1200: ldc_w 514631642
    //   1203: ixor
    //   1204: goto -> 1215
    //   1207: ldc2_w -527349801
    //   1210: l2i
    //   1211: ldc_w 2134447153
    //   1214: ixor
    //   1215: ldc2_w -1880012782
    //   1218: l2i
    //   1219: ldc_w -746930294
    //   1222: ixor
    //   1223: ixor
    //   1224: lookupswitch default -> 1252, -1286529478 -> 1207, 1959469016 -> 4358
    //   1252: fload #11
    //   1254: fadd
    //   1255: getstatic Perryc.c : I
    //   1258: iflt -> 1272
    //   1261: ldc2_w -208011837
    //   1264: l2i
    //   1265: ldc_w -1439345311
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w -1047116989
    //   1275: l2i
    //   1276: ldc_w 1715133226
    //   1279: ixor
    //   1280: ldc2_w -818909741
    //   1283: l2i
    //   1284: ldc_w -2023237318
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 1316, 177939186 -> 1272, 301669451 -> 4274
    //   1316: fload #10
    //   1318: getstatic Perryc.c : I
    //   1321: iflt -> 1335
    //   1324: ldc2_w 1346191913
    //   1327: l2i
    //   1328: ldc_w 1774031620
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w -1975459667
    //   1338: l2i
    //   1339: ldc_w 1403399414
    //   1342: ixor
    //   1343: ldc2_w -646870663
    //   1346: l2i
    //   1347: ldc_w -526624615
    //   1350: ixor
    //   1351: ixor
    //   1352: lookupswitch default -> 1380, -1899798514 -> 1335, 7143629 -> 4370
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokestatic glTexCoord2f : (FF)V
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: getstatic Perryc.1 : I
    //   1394: ifeq -> 1408
    //   1397: ldc2_w -477804092
    //   1400: l2i
    //   1401: ldc_w -953549200
    //   1404: ixor
    //   1405: goto -> 1416
    //   1408: ldc2_w -319404798
    //   1411: l2i
    //   1412: ldc_w -312697189
    //   1415: ixor
    //   1416: ldc2_w 47303834
    //   1419: l2i
    //   1420: ldc_w 1602754604
    //   1423: ixor
    //   1424: ixor
    //   1425: lookupswitch default -> 4396, 1559433007 -> 1452, 2046124802 -> 1408
    //   1452: fload_1
    //   1453: getstatic Perryc.1 : I
    //   1456: ifeq -> 1470
    //   1459: ldc2_w -481108200
    //   1462: l2i
    //   1463: ldc_w 910792814
    //   1466: ixor
    //   1467: goto -> 1478
    //   1470: ldc2_w 297303326
    //   1473: l2i
    //   1474: ldc_w -1046179284
    //   1477: ixor
    //   1478: ldc2_w 175114126
    //   1481: l2i
    //   1482: ldc_w 745080707
    //   1485: ixor
    //   1486: ixor
    //   1487: lookupswitch default -> 1512, -1853449944 -> 1470, -217954437 -> 4354
    //   1512: fload_3
    //   1513: fadd
    //   1514: f2d
    //   1515: getstatic Perryc.0 : I
    //   1518: ifle -> 1532
    //   1521: ldc2_w -1318464055
    //   1524: l2i
    //   1525: ldc_w -1986501205
    //   1528: ixor
    //   1529: goto -> 1540
    //   1532: ldc2_w 1421877513
    //   1535: l2i
    //   1536: ldc_w 1948614167
    //   1539: ixor
    //   1540: ldc2_w -1338682390
    //   1543: l2i
    //   1544: ldc_w -338965163
    //   1547: ixor
    //   1548: ixor
    //   1549: lookupswitch default -> 1576, 790067865 -> 1532, 1661939421 -> 4310
    //   1576: fload_2
    //   1577: f2d
    //   1578: getstatic Perryc.0 : I
    //   1581: ifle -> 1595
    //   1584: ldc2_w -1241258930
    //   1587: l2i
    //   1588: ldc_w -606624855
    //   1591: ixor
    //   1592: goto -> 1603
    //   1595: ldc2_w 1574756286
    //   1598: l2i
    //   1599: ldc_w 1607059928
    //   1602: ixor
    //   1603: ldc2_w 1707254933
    //   1606: l2i
    //   1607: ldc_w 954244107
    //   1610: ixor
    //   1611: ixor
    //   1612: lookupswitch default -> 1640, -1598873486 -> 1595, 821460857 -> 4372
    //   1640: goto -> 1644
    //   1643: athrow
    //   1644: invokestatic glVertex2d : (DD)V
    //   1647: goto -> 1651
    //   1650: athrow
    //   1651: getstatic Perryc.c : I
    //   1654: iflt -> 1668
    //   1657: ldc2_w -1121356200
    //   1660: l2i
    //   1661: ldc_w -688633028
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w -1371662333
    //   1671: l2i
    //   1672: ldc_w -155864086
    //   1675: ixor
    //   1676: ldc2_w 1889567697
    //   1679: l2i
    //   1680: ldc_w -1611700842
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 4278, -2070750429 -> 1668, -1211871826 -> 1712
    //   1712: fload #9
    //   1714: getstatic Perryc.0 : I
    //   1717: ifle -> 1731
    //   1720: ldc2_w -1413960971
    //   1723: l2i
    //   1724: ldc_w -1169246396
    //   1727: ixor
    //   1728: goto -> 1739
    //   1731: ldc2_w -1378118327
    //   1734: l2i
    //   1735: ldc_w 1443575499
    //   1738: ixor
    //   1739: ldc2_w -1058119527
    //   1742: l2i
    //   1743: ldc_w -1145390591
    //   1746: ixor
    //   1747: ixor
    //   1748: lookupswitch default -> 4296, -2138801894 -> 1776, 1789052713 -> 1731
    //   1776: fload #10
    //   1778: getstatic Perryc.1 : I
    //   1781: ifeq -> 1795
    //   1784: ldc2_w -940965281
    //   1787: l2i
    //   1788: ldc_w -933703086
    //   1791: ixor
    //   1792: goto -> 1803
    //   1795: ldc2_w 1575873451
    //   1798: l2i
    //   1799: ldc_w -719398335
    //   1802: ixor
    //   1803: ldc2_w -645415342
    //   1806: l2i
    //   1807: ldc_w -1437155586
    //   1810: ixor
    //   1811: ixor
    //   1812: lookupswitch default -> 4282, -81645242 -> 1840, 2086916257 -> 1795
    //   1840: goto -> 1844
    //   1843: athrow
    //   1844: invokestatic glTexCoord2f : (FF)V
    //   1847: goto -> 1851
    //   1850: athrow
    //   1851: getstatic Perryc.c : I
    //   1854: iflt -> 1868
    //   1857: ldc2_w -839400425
    //   1860: l2i
    //   1861: ldc_w -1145334743
    //   1864: ixor
    //   1865: goto -> 1876
    //   1868: ldc2_w 58945467
    //   1871: l2i
    //   1872: ldc_w 857445561
    //   1875: ixor
    //   1876: ldc2_w -179561595
    //   1879: l2i
    //   1880: ldc_w -1931142531
    //   1883: ixor
    //   1884: ixor
    //   1885: lookupswitch default -> 4390, 266686918 -> 1868, 1228012282 -> 1912
    //   1912: fload_1
    //   1913: f2d
    //   1914: getstatic Perryc.1 : I
    //   1917: ifeq -> 1931
    //   1920: ldc2_w -866141938
    //   1923: l2i
    //   1924: ldc_w 188401269
    //   1927: ixor
    //   1928: goto -> 1939
    //   1931: ldc2_w 1533540132
    //   1934: l2i
    //   1935: ldc_w 1947237550
    //   1938: ixor
    //   1939: ldc2_w -1898925161
    //   1942: l2i
    //   1943: ldc_w 592572881
    //   1946: ixor
    //   1947: ixor
    //   1948: lookupswitch default -> 1976, -1585447563 -> 1931, 1793342781 -> 4314
    //   1976: fload_2
    //   1977: f2d
    //   1978: getstatic Perryc.0 : I
    //   1981: ifle -> 1995
    //   1984: ldc2_w -1635569820
    //   1987: l2i
    //   1988: ldc_w 1061104038
    //   1991: ixor
    //   1992: goto -> 2003
    //   1995: ldc2_w -1275797248
    //   1998: l2i
    //   1999: ldc_w -1395755511
    //   2002: ixor
    //   2003: ldc2_w 1908263842
    //   2006: l2i
    //   2007: ldc_w -2081578229
    //   2010: ixor
    //   2011: ixor
    //   2012: lookupswitch default -> 2040, 1408003691 -> 4330, 1494153675 -> 1995
    //   2040: goto -> 2044
    //   2043: athrow
    //   2044: invokestatic glVertex2d : (DD)V
    //   2047: goto -> 2051
    //   2050: athrow
    //   2051: getstatic Perryc.1 : I
    //   2054: ifeq -> 2068
    //   2057: ldc2_w 1601185436
    //   2060: l2i
    //   2061: ldc_w -570984798
    //   2064: ixor
    //   2065: goto -> 2076
    //   2068: ldc2_w -1793722867
    //   2071: l2i
    //   2072: ldc_w -1533259123
    //   2075: ixor
    //   2076: ldc2_w 1031236049
    //   2079: l2i
    //   2080: ldc_w 975414042
    //   2083: ixor
    //   2084: ixor
    //   2085: lookupswitch default -> 4338, -2049729803 -> 2068, 920481355 -> 2112
    //   2112: fload #9
    //   2114: getstatic Perryc.1 : I
    //   2117: ifeq -> 2131
    //   2120: ldc2_w -1070466316
    //   2123: l2i
    //   2124: ldc_w -756952235
    //   2127: ixor
    //   2128: goto -> 2139
    //   2131: ldc2_w 766548027
    //   2134: l2i
    //   2135: ldc_w -311667345
    //   2138: ixor
    //   2139: ldc2_w 1458142746
    //   2142: l2i
    //   2143: ldc_w 5538589
    //   2146: ixor
    //   2147: ixor
    //   2148: lookupswitch default -> 2176, -285602304 -> 2131, 1148048550 -> 4288
    //   2176: fload #10
    //   2178: getstatic Perryc.c : I
    //   2181: iflt -> 2195
    //   2184: ldc2_w 938198875
    //   2187: l2i
    //   2188: ldc_w 1968666377
    //   2191: ixor
    //   2192: goto -> 2203
    //   2195: ldc2_w -857432233
    //   2198: l2i
    //   2199: ldc_w 829569522
    //   2202: ixor
    //   2203: ldc2_w 1283644204
    //   2206: l2i
    //   2207: ldc_w -647373040
    //   2210: ixor
    //   2211: ixor
    //   2212: lookupswitch default -> 4304, -682118034 -> 2195, 1753064089 -> 2240
    //   2240: fload #12
    //   2242: fadd
    //   2243: getstatic Perryc.1 : I
    //   2246: ifeq -> 2260
    //   2249: ldc2_w 862141155
    //   2252: l2i
    //   2253: ldc_w -2034455981
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w 1216754912
    //   2263: l2i
    //   2264: ldc_w -27243535
    //   2267: ixor
    //   2268: ldc2_w -413693643
    //   2271: l2i
    //   2272: ldc_w 1492574300
    //   2275: ixor
    //   2276: ixor
    //   2277: lookupswitch default -> 2304, -1987540954 -> 2260, 176093657 -> 4348
    //   2304: goto -> 2308
    //   2307: athrow
    //   2308: invokestatic glTexCoord2f : (FF)V
    //   2311: goto -> 2315
    //   2314: athrow
    //   2315: getstatic Perryc.0 : I
    //   2318: ifle -> 2332
    //   2321: ldc2_w 1027293958
    //   2324: l2i
    //   2325: ldc_w -1195394705
    //   2328: ixor
    //   2329: goto -> 2340
    //   2332: ldc2_w -1271216988
    //   2335: l2i
    //   2336: ldc_w 1884148134
    //   2339: ixor
    //   2340: ldc2_w -1896207309
    //   2343: l2i
    //   2344: ldc_w 205978449
    //   2347: ixor
    //   2348: ixor
    //   2349: lookupswitch default -> 2376, -380787301 -> 2332, 121122059 -> 4318
    //   2376: fload_1
    //   2377: f2d
    //   2378: getstatic Perryc.c : I
    //   2381: iflt -> 2395
    //   2384: ldc2_w -2035508125
    //   2387: l2i
    //   2388: ldc_w 1765407469
    //   2391: ixor
    //   2392: goto -> 2403
    //   2395: ldc2_w -869575135
    //   2398: l2i
    //   2399: ldc_w -118193532
    //   2402: ixor
    //   2403: ldc2_w 144833746
    //   2406: l2i
    //   2407: ldc_w -1518999642
    //   2410: ixor
    //   2411: ixor
    //   2412: lookupswitch default -> 4344, -1727279151 -> 2440, 1111588346 -> 2395
    //   2440: fload_2
    //   2441: getstatic Perryc.c : I
    //   2444: iflt -> 2458
    //   2447: ldc2_w 1211335408
    //   2450: l2i
    //   2451: ldc_w -924501452
    //   2454: ixor
    //   2455: goto -> 2466
    //   2458: ldc2_w -199959666
    //   2461: l2i
    //   2462: ldc_w 1175737949
    //   2465: ixor
    //   2466: ldc2_w -76993421
    //   2469: l2i
    //   2470: ldc_w -1223563579
    //   2473: ixor
    //   2474: ixor
    //   2475: lookupswitch default -> 4294, -860982670 -> 2458, -25671835 -> 2500
    //   2500: fload #4
    //   2502: fadd
    //   2503: f2d
    //   2504: getstatic Perryc.0 : I
    //   2507: ifle -> 2521
    //   2510: ldc2_w 1858289995
    //   2513: l2i
    //   2514: ldc_w 2101984461
    //   2517: ixor
    //   2518: goto -> 2529
    //   2521: ldc2_w 920345580
    //   2524: l2i
    //   2525: ldc_w 1062737967
    //   2528: ixor
    //   2529: ldc2_w -1357479504
    //   2532: l2i
    //   2533: ldc_w -1391749602
    //   2536: ixor
    //   2537: ixor
    //   2538: lookupswitch default -> 4394, 194925677 -> 2564, 295168552 -> 2521
    //   2564: goto -> 2568
    //   2567: athrow
    //   2568: invokestatic glVertex2d : (DD)V
    //   2571: goto -> 2575
    //   2574: athrow
    //   2575: getstatic Perryc.0 : I
    //   2578: ifle -> 2592
    //   2581: ldc2_w 2132714033
    //   2584: l2i
    //   2585: ldc_w -1917395196
    //   2588: ixor
    //   2589: goto -> 2600
    //   2592: ldc2_w -1120084129
    //   2595: l2i
    //   2596: ldc_w -412891955
    //   2599: ixor
    //   2600: ldc2_w -2868888
    //   2603: l2i
    //   2604: ldc_w 2095889097
    //   2607: ixor
    //   2608: ixor
    //   2609: lookupswitch default -> 2636, -1576354928 -> 2592, 1905327764 -> 4384
    //   2636: fload #9
    //   2638: getstatic Perryc.c : I
    //   2641: iflt -> 2655
    //   2644: ldc2_w 624717296
    //   2647: l2i
    //   2648: ldc_w -122212333
    //   2651: ixor
    //   2652: goto -> 2663
    //   2655: ldc2_w -1572687560
    //   2658: l2i
    //   2659: ldc_w 1555762161
    //   2662: ixor
    //   2663: ldc2_w 1995710986
    //   2666: l2i
    //   2667: ldc_w 1553289444
    //   2670: ixor
    //   2671: ixor
    //   2672: lookupswitch default -> 2700, -135647475 -> 4316, 1909803084 -> 2655
    //   2700: fload #10
    //   2702: getstatic Perryc.c : I
    //   2705: iflt -> 2719
    //   2708: ldc2_w -409261288
    //   2711: l2i
    //   2712: ldc_w -6481154
    //   2715: ixor
    //   2716: goto -> 2727
    //   2719: ldc2_w -203811096
    //   2722: l2i
    //   2723: ldc_w 159635577
    //   2726: ixor
    //   2727: ldc2_w 17323521
    //   2730: l2i
    //   2731: ldc_w -1755909227
    //   2734: ixor
    //   2735: ixor
    //   2736: lookupswitch default -> 2764, -1906797454 -> 4332, 323399360 -> 2719
    //   2764: fload #12
    //   2766: fadd
    //   2767: getstatic Perryc.0 : I
    //   2770: ifle -> 2784
    //   2773: ldc2_w -1521015368
    //   2776: l2i
    //   2777: ldc_w 1018320427
    //   2780: ixor
    //   2781: goto -> 2792
    //   2784: ldc2_w -1990118823
    //   2787: l2i
    //   2788: ldc_w 1944653577
    //   2791: ixor
    //   2792: ldc2_w 566267802
    //   2795: l2i
    //   2796: ldc_w -1259882422
    //   2799: ixor
    //   2800: ixor
    //   2801: lookupswitch default -> 4322, 214058051 -> 2784, 1873742464 -> 2828
    //   2828: goto -> 2832
    //   2831: athrow
    //   2832: invokestatic glTexCoord2f : (FF)V
    //   2835: goto -> 2839
    //   2838: athrow
    //   2839: getstatic Perryc.1 : I
    //   2842: ifeq -> 2856
    //   2845: ldc2_w 544954354
    //   2848: l2i
    //   2849: ldc_w -1107173191
    //   2852: ixor
    //   2853: goto -> 2864
    //   2856: ldc2_w 1727404402
    //   2859: l2i
    //   2860: ldc_w -826612248
    //   2863: ixor
    //   2864: ldc2_w -674101422
    //   2867: l2i
    //   2868: ldc_w -1695028036
    //   2871: ixor
    //   2872: ixor
    //   2873: lookupswitch default -> 4350, -748725083 -> 2856, -446097548 -> 2900
    //   2900: fload_1
    //   2901: f2d
    //   2902: getstatic Perryc.c : I
    //   2905: iflt -> 2919
    //   2908: ldc2_w 2028587221
    //   2911: l2i
    //   2912: ldc_w -38812836
    //   2915: ixor
    //   2916: goto -> 2927
    //   2919: ldc2_w 1672338361
    //   2922: l2i
    //   2923: ldc_w 1799690850
    //   2926: ixor
    //   2927: ldc2_w -1494068929
    //   2930: l2i
    //   2931: ldc_w 597067734
    //   2934: ixor
    //   2935: ixor
    //   2936: lookupswitch default -> 4364, -1920198862 -> 2964, 2284896 -> 2919
    //   2964: fload_2
    //   2965: getstatic Perryc.c : I
    //   2968: iflt -> 2982
    //   2971: ldc2_w 1240059833
    //   2974: l2i
    //   2975: ldc_w -2013196993
    //   2978: ixor
    //   2979: goto -> 2990
    //   2982: ldc2_w -664455597
    //   2985: l2i
    //   2986: ldc_w -2026817459
    //   2989: ixor
    //   2990: ldc2_w -2041496498
    //   2993: l2i
    //   2994: ldc_w 1647698060
    //   2997: ixor
    //   2998: ixor
    //   2999: lookupswitch default -> 4336, -1154428196 -> 3024, 629939780 -> 2982
    //   3024: fload #4
    //   3026: fadd
    //   3027: f2d
    //   3028: getstatic Perryc.0 : I
    //   3031: ifle -> 3045
    //   3034: ldc2_w -1842603908
    //   3037: l2i
    //   3038: ldc_w -1570252719
    //   3041: ixor
    //   3042: goto -> 3053
    //   3045: ldc2_w 836146024
    //   3048: l2i
    //   3049: ldc_w -1082591242
    //   3052: ixor
    //   3053: ldc2_w -1124243066
    //   3056: l2i
    //   3057: ldc_w 1498714598
    //   3060: ixor
    //   3061: ixor
    //   3062: lookupswitch default -> 4360, -706594739 -> 3045, 1795661054 -> 3088
    //   3088: goto -> 3092
    //   3091: athrow
    //   3092: invokestatic glVertex2d : (DD)V
    //   3095: goto -> 3099
    //   3098: athrow
    //   3099: getstatic Perryc.1 : I
    //   3102: ifeq -> 3116
    //   3105: ldc2_w 1913135072
    //   3108: l2i
    //   3109: ldc_w 1000738908
    //   3112: ixor
    //   3113: goto -> 3124
    //   3116: ldc2_w 772271407
    //   3119: l2i
    //   3120: ldc_w -1125710966
    //   3123: ixor
    //   3124: ldc2_w -1351140817
    //   3127: l2i
    //   3128: ldc_w -1193404718
    //   3131: ixor
    //   3132: ixor
    //   3133: lookupswitch default -> 3160, -962757358 -> 3116, 1577526081 -> 4388
    //   3160: fload #9
    //   3162: getstatic Perryc.0 : I
    //   3165: ifle -> 3179
    //   3168: ldc2_w 1055809576
    //   3171: l2i
    //   3172: ldc_w 1331949532
    //   3175: ixor
    //   3176: goto -> 3187
    //   3179: ldc2_w 82143566
    //   3182: l2i
    //   3183: ldc_w 2042664510
    //   3186: ixor
    //   3187: ldc2_w 1807273526
    //   3190: l2i
    //   3191: ldc_w -1668694009
    //   3194: ixor
    //   3195: ixor
    //   3196: lookupswitch default -> 4312, -2034466363 -> 3179, -1978339007 -> 3224
    //   3224: fload #11
    //   3226: fadd
    //   3227: getstatic Perryc.c : I
    //   3230: iflt -> 3244
    //   3233: ldc2_w -713646056
    //   3236: l2i
    //   3237: ldc_w -36135848
    //   3240: ixor
    //   3241: goto -> 3252
    //   3244: ldc2_w 968345477
    //   3247: l2i
    //   3248: ldc_w -925279709
    //   3251: ixor
    //   3252: ldc2_w -462855456
    //   3255: l2i
    //   3256: ldc_w -318485696
    //   3259: ixor
    //   3260: ixor
    //   3261: lookupswitch default -> 4298, -133975034 -> 3288, 566433248 -> 3244
    //   3288: fload #10
    //   3290: getstatic Perryc.1 : I
    //   3293: ifeq -> 3307
    //   3296: ldc2_w -527702954
    //   3299: l2i
    //   3300: ldc_w 1436839216
    //   3303: ixor
    //   3304: goto -> 3315
    //   3307: ldc2_w -1401767817
    //   3310: l2i
    //   3311: ldc_w -1459346985
    //   3314: ixor
    //   3315: ldc2_w -832630623
    //   3318: l2i
    //   3319: ldc_w 1697477370
    //   3322: ixor
    //   3323: ixor
    //   3324: lookupswitch default -> 4306, -1375405061 -> 3352, 509471549 -> 3307
    //   3352: fload #12
    //   3354: fadd
    //   3355: getstatic Perryc.c : I
    //   3358: iflt -> 3372
    //   3361: ldc2_w 1309490321
    //   3364: l2i
    //   3365: ldc_w -651652431
    //   3368: ixor
    //   3369: goto -> 3380
    //   3372: ldc2_w 1403575295
    //   3375: l2i
    //   3376: ldc_w 1859415457
    //   3379: ixor
    //   3380: ldc2_w -1359961391
    //   3383: l2i
    //   3384: ldc_w -2130530289
    //   3387: ixor
    //   3388: ixor
    //   3389: lookupswitch default -> 4300, -1193820930 -> 3372, 311338112 -> 3416
    //   3416: goto -> 3420
    //   3419: athrow
    //   3420: invokestatic glTexCoord2f : (FF)V
    //   3423: goto -> 3427
    //   3426: athrow
    //   3427: getstatic Perryc.1 : I
    //   3430: ifeq -> 3444
    //   3433: ldc2_w -1292075005
    //   3436: l2i
    //   3437: ldc_w 1114733399
    //   3440: ixor
    //   3441: goto -> 3452
    //   3444: ldc2_w -327965132
    //   3447: l2i
    //   3448: ldc_w 1212184120
    //   3451: ixor
    //   3452: ldc2_w 566716479
    //   3455: l2i
    //   3456: ldc_w -2097609195
    //   3459: ixor
    //   3460: ixor
    //   3461: lookupswitch default -> 3488, 1404278142 -> 4382, 1517122341 -> 3444
    //   3488: fload_1
    //   3489: getstatic Perryc.0 : I
    //   3492: ifle -> 3506
    //   3495: ldc2_w 1291652749
    //   3498: l2i
    //   3499: ldc_w -1628675308
    //   3502: ixor
    //   3503: goto -> 3514
    //   3506: ldc2_w -1430130382
    //   3509: l2i
    //   3510: ldc_w 805842837
    //   3513: ixor
    //   3514: ldc2_w 1498504312
    //   3517: l2i
    //   3518: ldc_w 1505382400
    //   3521: ixor
    //   3522: ixor
    //   3523: lookupswitch default -> 3548, -1353649165 -> 3506, -755342879 -> 4392
    //   3548: fload_3
    //   3549: fadd
    //   3550: f2d
    //   3551: getstatic Perryc.c : I
    //   3554: iflt -> 3568
    //   3557: ldc2_w -1403741870
    //   3560: l2i
    //   3561: ldc_w -1486628035
    //   3564: ixor
    //   3565: goto -> 3576
    //   3568: ldc2_w -368807969
    //   3571: l2i
    //   3572: ldc_w 2104515186
    //   3575: ixor
    //   3576: ldc2_w 670106002
    //   3579: l2i
    //   3580: ldc_w 1131793337
    //   3583: ixor
    //   3584: ixor
    //   3585: lookupswitch default -> 4374, -202309754 -> 3612, 1874036804 -> 3568
    //   3612: fload_2
    //   3613: getstatic Perryc.0 : I
    //   3616: ifle -> 3630
    //   3619: ldc2_w 1216956793
    //   3622: l2i
    //   3623: ldc_w -655098204
    //   3626: ixor
    //   3627: goto -> 3638
    //   3630: ldc2_w 1317637643
    //   3633: l2i
    //   3634: ldc_w 864416980
    //   3637: ixor
    //   3638: ldc2_w 1419440356
    //   3641: l2i
    //   3642: ldc_w 1828226175
    //   3645: ixor
    //   3646: ixor
    //   3647: lookupswitch default -> 4386, -1474772154 -> 3630, 1164840516 -> 3672
    //   3672: fload #4
    //   3674: fadd
    //   3675: f2d
    //   3676: getstatic Perryc.c : I
    //   3679: iflt -> 3693
    //   3682: ldc2_w 1156281130
    //   3685: l2i
    //   3686: ldc_w -1713501490
    //   3689: ixor
    //   3690: goto -> 3701
    //   3693: ldc2_w 1564403661
    //   3696: l2i
    //   3697: ldc_w -823335258
    //   3700: ixor
    //   3701: ldc2_w 1316459858
    //   3704: l2i
    //   3705: ldc_w -138175026
    //   3708: ixor
    //   3709: ixor
    //   3710: lookupswitch default -> 4324, 711330295 -> 3736, 1686204792 -> 3693
    //   3736: goto -> 3740
    //   3739: athrow
    //   3740: invokestatic glVertex2d : (DD)V
    //   3743: goto -> 3747
    //   3746: athrow
    //   3747: getstatic Perryc.0 : I
    //   3750: ifle -> 3764
    //   3753: ldc2_w 464333053
    //   3756: l2i
    //   3757: ldc_w -1407990515
    //   3760: ixor
    //   3761: goto -> 3772
    //   3764: ldc2_w -13188362
    //   3767: l2i
    //   3768: ldc_w 1193332842
    //   3771: ixor
    //   3772: ldc2_w -368023280
    //   3775: l2i
    //   3776: ldc_w 582752081
    //   3779: ixor
    //   3780: ixor
    //   3781: lookupswitch default -> 3808, -1602895090 -> 3764, 2131923889 -> 4342
    //   3808: fload #9
    //   3810: getstatic Perryc.c : I
    //   3813: iflt -> 3827
    //   3816: ldc2_w 1951164770
    //   3819: l2i
    //   3820: ldc_w 240458405
    //   3823: ixor
    //   3824: goto -> 3835
    //   3827: ldc2_w 953890993
    //   3830: l2i
    //   3831: ldc_w -1399502462
    //   3834: ixor
    //   3835: ldc2_w 290612956
    //   3838: l2i
    //   3839: ldc_w 272932104
    //   3842: ixor
    //   3843: ixor
    //   3844: lookupswitch default -> 3872, 2064615443 -> 4284, 2107747448 -> 3827
    //   3872: fload #11
    //   3874: fadd
    //   3875: getstatic Perryc.c : I
    //   3878: iflt -> 3892
    //   3881: ldc2_w 267117766
    //   3884: l2i
    //   3885: ldc_w 771792297
    //   3888: ixor
    //   3889: goto -> 3900
    //   3892: ldc2_w 505617928
    //   3895: l2i
    //   3896: ldc_w 2131975073
    //   3899: ixor
    //   3900: ldc2_w -557498428
    //   3903: l2i
    //   3904: ldc_w 1216043699
    //   3907: ixor
    //   3908: ixor
    //   3909: lookupswitch default -> 4340, -1219159016 -> 3892, -141680418 -> 3936
    //   3936: fload #10
    //   3938: getstatic Perryc.0 : I
    //   3941: ifle -> 3955
    //   3944: ldc2_w -1143416039
    //   3947: l2i
    //   3948: ldc_w 1375536232
    //   3951: ixor
    //   3952: goto -> 3963
    //   3955: ldc2_w 904531545
    //   3958: l2i
    //   3959: ldc_w -642182268
    //   3962: ixor
    //   3963: ldc2_w -1489722354
    //   3966: l2i
    //   3967: ldc_w 303126502
    //   3970: ixor
    //   3971: ixor
    //   3972: lookupswitch default -> 4328, 1500966453 -> 4000, 1593846937 -> 3955
    //   4000: goto -> 4004
    //   4003: athrow
    //   4004: invokestatic glTexCoord2f : (FF)V
    //   4007: goto -> 4011
    //   4010: athrow
    //   4011: getstatic Perryc.c : I
    //   4014: iflt -> 4028
    //   4017: ldc2_w 435766196
    //   4020: l2i
    //   4021: ldc_w -221929366
    //   4024: ixor
    //   4025: goto -> 4036
    //   4028: ldc2_w 99459135
    //   4031: l2i
    //   4032: ldc_w -430985685
    //   4035: ixor
    //   4036: ldc2_w -963343550
    //   4039: l2i
    //   4040: ldc_w -1582885997
    //   4043: ixor
    //   4044: ixor
    //   4045: lookupswitch default -> 4072, -1945142513 -> 4376, 1317079575 -> 4028
    //   4072: fload_1
    //   4073: getstatic Perryc.c : I
    //   4076: iflt -> 4090
    //   4079: ldc2_w 239949559
    //   4082: l2i
    //   4083: ldc_w 1578539408
    //   4086: ixor
    //   4087: goto -> 4098
    //   4090: ldc2_w 4865
    //   4093: l2i
    //   4094: ldc_w -181157151
    //   4097: ixor
    //   4098: ldc2_w -131565735
    //   4101: l2i
    //   4102: ldc_w 627028325
    //   4105: ixor
    //   4106: ixor
    //   4107: lookupswitch default -> 4132, -1926493861 -> 4308, 2064633025 -> 4090
    //   4132: fload_3
    //   4133: fadd
    //   4134: f2d
    //   4135: getstatic Perryc.0 : I
    //   4138: ifle -> 4152
    //   4141: ldc2_w 1339357129
    //   4144: l2i
    //   4145: ldc_w -1294689337
    //   4148: ixor
    //   4149: goto -> 4160
    //   4152: ldc2_w -382982215
    //   4155: l2i
    //   4156: ldc_w -2033945964
    //   4159: ixor
    //   4160: ldc2_w 1533313834
    //   4163: l2i
    //   4164: ldc_w -1267188689
    //   4167: ixor
    //   4168: ixor
    //   4169: lookupswitch default -> 4196, 303878923 -> 4320, 626757644 -> 4152
    //   4196: fload_2
    //   4197: f2d
    //   4198: getstatic Perryc.0 : I
    //   4201: ifle -> 4215
    //   4204: ldc2_w -1287143580
    //   4207: l2i
    //   4208: ldc_w 999888472
    //   4211: ixor
    //   4212: goto -> 4223
    //   4215: ldc2_w 1566122633
    //   4218: l2i
    //   4219: ldc_w -2035863999
    //   4222: ixor
    //   4223: ldc2_w -261499473
    //   4226: l2i
    //   4227: ldc_w -1258658722
    //   4230: ixor
    //   4231: ixor
    //   4232: lookupswitch default -> 4326, -1620198087 -> 4260, -867362611 -> 4215
    //   4260: goto -> 4264
    //   4263: athrow
    //   4264: invokestatic glVertex2d : (DD)V
    //   4267: goto -> 4271
    //   4270: athrow
    //   4271: return
    //   4272: aconst_null
    //   4273: athrow
    //   4274: aconst_null
    //   4275: athrow
    //   4276: aconst_null
    //   4277: athrow
    //   4278: aconst_null
    //   4279: athrow
    //   4280: aconst_null
    //   4281: athrow
    //   4282: aconst_null
    //   4283: athrow
    //   4284: aconst_null
    //   4285: athrow
    //   4286: aconst_null
    //   4287: athrow
    //   4288: aconst_null
    //   4289: athrow
    //   4290: aconst_null
    //   4291: athrow
    //   4292: aconst_null
    //   4293: athrow
    //   4294: aconst_null
    //   4295: athrow
    //   4296: aconst_null
    //   4297: athrow
    //   4298: aconst_null
    //   4299: athrow
    //   4300: aconst_null
    //   4301: athrow
    //   4302: aconst_null
    //   4303: athrow
    //   4304: aconst_null
    //   4305: athrow
    //   4306: aconst_null
    //   4307: athrow
    //   4308: aconst_null
    //   4309: athrow
    //   4310: aconst_null
    //   4311: athrow
    //   4312: aconst_null
    //   4313: athrow
    //   4314: aconst_null
    //   4315: athrow
    //   4316: aconst_null
    //   4317: athrow
    //   4318: aconst_null
    //   4319: athrow
    //   4320: aconst_null
    //   4321: athrow
    //   4322: aconst_null
    //   4323: athrow
    //   4324: aconst_null
    //   4325: athrow
    //   4326: aconst_null
    //   4327: athrow
    //   4328: aconst_null
    //   4329: athrow
    //   4330: aconst_null
    //   4331: athrow
    //   4332: aconst_null
    //   4333: athrow
    //   4334: aconst_null
    //   4335: athrow
    //   4336: aconst_null
    //   4337: athrow
    //   4338: aconst_null
    //   4339: athrow
    //   4340: aconst_null
    //   4341: athrow
    //   4342: aconst_null
    //   4343: athrow
    //   4344: aconst_null
    //   4345: athrow
    //   4346: aconst_null
    //   4347: athrow
    //   4348: aconst_null
    //   4349: athrow
    //   4350: aconst_null
    //   4351: athrow
    //   4352: aconst_null
    //   4353: athrow
    //   4354: aconst_null
    //   4355: athrow
    //   4356: aconst_null
    //   4357: athrow
    //   4358: aconst_null
    //   4359: athrow
    //   4360: aconst_null
    //   4361: athrow
    //   4362: aconst_null
    //   4363: athrow
    //   4364: aconst_null
    //   4365: athrow
    //   4366: aconst_null
    //   4367: athrow
    //   4368: aconst_null
    //   4369: athrow
    //   4370: aconst_null
    //   4371: athrow
    //   4372: aconst_null
    //   4373: athrow
    //   4374: aconst_null
    //   4375: athrow
    //   4376: aconst_null
    //   4377: athrow
    //   4378: aconst_null
    //   4379: athrow
    //   4380: aconst_null
    //   4381: athrow
    //   4382: aconst_null
    //   4383: athrow
    //   4384: aconst_null
    //   4385: athrow
    //   4386: aconst_null
    //   4387: athrow
    //   4388: aconst_null
    //   4389: athrow
    //   4390: aconst_null
    //   4391: athrow
    //   4392: aconst_null
    //   4393: athrow
    //   4394: aconst_null
    //   4395: athrow
    //   4396: aconst_null
    //   4397: athrow
    //   4398: aconst_null
    //   4399: athrow
    //   4400: pop
    //   4401: goto -> 24
    //   4404: pop
    //   4405: aconst_null
    //   4406: goto -> 4400
    //   4409: dup
    //   4410: ifnull -> 4400
    //   4413: checkcast java/lang/Throwable
    //   4416: athrow
    //   4417: dup
    //   4418: ifnull -> 4404
    //   4421: checkcast java/lang/Throwable
    //   4424: athrow
    //   4425: aconst_null
    //   4426: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4248	0	this	Lbigname/zprestige/webhack/features/gui/font/CFont;
    //   24	4248	1	x	F
    //   24	4248	2	y	F
    //   24	4248	3	width	F
    //   24	4248	4	height	F
    //   24	4248	5	srcX	F
    //   24	4248	6	srcY	F
    //   24	4248	7	srcWidth	F
    //   24	4248	8	srcHeight	F
    //   298	3974	9	renderSRCX	F
    //   574	3698	10	renderSRCY	F
    //   850	3422	11	renderSRCWidth	F
    //   1126	3146	12	renderSRCHeight	F
    // Exception table:
    //   from	to	target	type
    //   8	20	4409	finally
    //   211	218	218	finally
    //   211	218	3	finally
    //   212	218	218	finally
    //   212	218	211	finally
    //   212	218	218	java/lang/NumberFormatException
    //   487	494	494	finally
    //   487	494	494	finally
    //   488	494	3	java/util/ConcurrentModificationException
    //   488	494	494	java/lang/NumberFormatException
    //   488	494	487	finally
    //   763	770	770	finally
    //   763	770	3	finally
    //   763	770	763	java/lang/RuntimeException
    //   764	770	3	java/lang/RuntimeException
    //   764	770	770	java/util/NoSuchElementException
    //   1039	1046	1046	finally
    //   1039	1046	1039	finally
    //   1040	1046	1046	java/lang/IllegalArgumentException
    //   1040	1046	3	finally
    //   1040	1046	3	java/lang/ArrayIndexOutOfBoundsException
    //   1383	1390	1390	finally
    //   1383	1390	1383	java/lang/EnumConstantNotPresentException
    //   1383	1390	1390	java/lang/IllegalArgumentException
    //   1383	1390	3	java/lang/IllegalArgumentException
    //   1384	1390	1390	finally
    //   1643	1650	1650	finally
    //   1643	1650	1643	finally
    //   1643	1650	1650	java/lang/StringIndexOutOfBoundsException
    //   1644	1650	1650	finally
    //   1644	1650	1650	finally
    //   1843	1850	1850	finally
    //   1844	1850	1850	finally
    //   1844	1850	3	java/lang/IllegalStateException
    //   1844	1850	1843	java/lang/IndexOutOfBoundsException
    //   1844	1850	1850	java/lang/UnsupportedOperationException
    //   2043	2050	2050	finally
    //   2043	2050	2050	java/lang/IllegalStateException
    //   2044	2050	2043	finally
    //   2044	2050	2043	java/lang/ArrayIndexOutOfBoundsException
    //   2044	2050	2043	finally
    //   2307	2314	2314	finally
    //   2307	2314	2314	java/lang/IllegalArgumentException
    //   2307	2314	2307	java/lang/NegativeArraySizeException
    //   2308	2314	2314	java/lang/NumberFormatException
    //   2308	2314	2314	java/lang/IllegalStateException
    //   2568	2574	2574	finally
    //   2568	2574	3	java/lang/IllegalArgumentException
    //   2568	2574	3	java/lang/NegativeArraySizeException
    //   2568	2574	3	finally
    //   2568	2574	3	java/lang/NegativeArraySizeException
    //   2831	2838	2838	finally
    //   2831	2838	2838	java/lang/ClassCastException
    //   2831	2838	2838	java/util/NoSuchElementException
    //   2831	2838	2838	finally
    //   2832	2838	2831	finally
    //   3092	3098	3098	finally
    //   3092	3098	3	finally
    //   3092	3098	3	java/lang/IllegalArgumentException
    //   3092	3098	3098	java/lang/NumberFormatException
    //   3092	3098	3	java/lang/NullPointerException
    //   3419	3426	3426	finally
    //   3419	3426	3	finally
    //   3419	3426	3	finally
    //   3419	3426	3419	finally
    //   3419	3426	3	java/lang/RuntimeException
    //   3740	3746	3746	finally
    //   3740	3746	3746	finally
    //   3740	3746	3	finally
    //   3740	3746	3746	java/lang/NegativeArraySizeException
    //   3740	3746	3	finally
    //   4003	4010	4010	finally
    //   4003	4010	3	finally
    //   4004	4010	4003	java/lang/ArrayIndexOutOfBoundsException
    //   4004	4010	3	finally
    //   4004	4010	3	java/lang/ArithmeticException
    //   4263	4270	4270	finally
    //   4263	4270	4270	java/util/NoSuchElementException
    //   4263	4270	4263	java/lang/AssertionError
    //   4263	4270	4263	java/lang/ClassCastException
    //   4264	4270	4270	java/lang/ArrayIndexOutOfBoundsException
    //   4409	4417	4409	finally
    //   4425	4427	3	finally
  }
  
  public Font getFont() {
    return Perry1.P(this, (int)-1258026820L ^ 0x803096F5);
  }
  
  public void setAntiAlias(boolean paramBoolean) {
    Perry1.64(this, (int)1781942614L ^ 0x5AC3303E, paramBoolean);
  }
  
  public boolean isFractionalMetrics() {
    return Perry1.4G(this, (int)-1775955294L ^ 0x8EF6A48D);
  }
  
  public int getHeight() {
    return Perry1.2R(this, (int)823782159L ^ 0x3DDD9EA4);
  }
  
  public boolean isAntiAlias() {
    return Perry1.4z(this, (int)1772293468L ^ 0x419C8870);
  }
  
  public void drawChar(CFont$CharData[] chars, char c, float x, float y) {
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
  
  public int getStringHeight(String paramString) {
    return Perry1.19(this, (int)508386771L ^ 0x69143E1C, paramString);
  }
  
  public void setFont(Font font) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 949
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 941
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 933
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -563924727
    //   33: l2i
    //   34: ldc_w -959418753
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -948224409
    //   44: l2i
    //   45: ldc_w 1363088501
    //   48: ixor
    //   49: ldc2_w 1167357007
    //   52: l2i
    //   53: ldc_w 1946205024
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 912, -1479482051 -> 84, 690458713 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -195440456
    //   94: l2i
    //   95: ldc_w -774799740
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -72806802
    //   105: l2i
    //   106: ldc_w 117966572
    //   109: ixor
    //   110: ldc2_w -1690740361
    //   113: l2i
    //   114: ldc_w -478315448
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -425072063 -> 102, 1573686019 -> 916
    //   144: aload_1
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 162
    //   151: ldc2_w 395280388
    //   154: l2i
    //   155: ldc_w 2080700917
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 7828770
    //   165: l2i
    //   166: ldc_w 133391372
    //   169: ixor
    //   170: ldc2_w -1679618095
    //   173: l2i
    //   174: ldc_w -1730554204
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 918, 79611995 -> 204, 1756471428 -> 162
    //   204: putfield font : Ljava/awt/Font;
    //   207: getstatic Perryc.1 : I
    //   210: ifeq -> 224
    //   213: ldc2_w -111162943
    //   216: l2i
    //   217: ldc_w -1877878360
    //   220: ixor
    //   221: goto -> 232
    //   224: ldc2_w 867261435
    //   227: l2i
    //   228: ldc_w -1559357167
    //   231: ixor
    //   232: ldc2_w -2000763890
    //   235: l2i
    //   236: ldc_w -682679937
    //   239: ixor
    //   240: ixor
    //   241: lookupswitch default -> 268, 918549784 -> 906, 2131932281 -> 224
    //   268: aload_0
    //   269: getstatic Perryc.c : I
    //   272: iflt -> 286
    //   275: ldc2_w -537885278
    //   278: l2i
    //   279: ldc_w 1472017288
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w -492041441
    //   289: l2i
    //   290: ldc_w 824679233
    //   293: ixor
    //   294: ldc2_w 637570801
    //   297: l2i
    //   298: ldc_w 209066607
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 902, -1573182796 -> 286, -100858688 -> 328
    //   328: aload_0
    //   329: getstatic Perryc.1 : I
    //   332: ifeq -> 346
    //   335: ldc2_w -1411181855
    //   338: l2i
    //   339: ldc_w 610738381
    //   342: ixor
    //   343: goto -> 354
    //   346: ldc2_w 1486232306
    //   349: l2i
    //   350: ldc_w -108334288
    //   353: ixor
    //   354: ldc2_w 1824094332
    //   357: l2i
    //   358: ldc_w -921900889
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 388, 249672112 -> 346, 707896055 -> 904
    //   388: aload_1
    //   389: getstatic Perryc.c : I
    //   392: iflt -> 406
    //   395: ldc2_w -1179236567
    //   398: l2i
    //   399: ldc_w 1221433232
    //   402: ixor
    //   403: goto -> 414
    //   406: ldc2_w 1910872905
    //   409: l2i
    //   410: ldc_w -1139980550
    //   413: ixor
    //   414: ldc2_w 505668318
    //   417: l2i
    //   418: ldc_w -70861536
    //   421: ixor
    //   422: ixor
    //   423: lookupswitch default -> 448, 345935687 -> 908, 732415763 -> 406
    //   448: aload_0
    //   449: getstatic Perryc.0 : I
    //   452: ifle -> 466
    //   455: ldc2_w 644397373
    //   458: l2i
    //   459: ldc_w -934317979
    //   462: ixor
    //   463: goto -> 474
    //   466: ldc2_w 1377020497
    //   469: l2i
    //   470: ldc_w -179965394
    //   473: ixor
    //   474: ldc2_w -493085835
    //   477: l2i
    //   478: ldc_w 2096532537
    //   481: ixor
    //   482: ixor
    //   483: lookupswitch default -> 896, 960286515 -> 508, 1884118548 -> 466
    //   508: getfield antiAlias : Z
    //   511: getstatic Perryc.1 : I
    //   514: ifeq -> 528
    //   517: ldc2_w -1247261660
    //   520: l2i
    //   521: ldc_w -201351251
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w -473963541
    //   531: l2i
    //   532: ldc_w -548470353
    //   535: ixor
    //   536: ldc2_w -1075041904
    //   539: l2i
    //   540: ldc_w 1977071678
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 920, -1939062233 -> 528, -154438678 -> 572
    //   572: aload_0
    //   573: getstatic Perryc.0 : I
    //   576: ifle -> 590
    //   579: ldc2_w 1356677020
    //   582: l2i
    //   583: ldc_w -1581607407
    //   586: ixor
    //   587: goto -> 598
    //   590: ldc2_w -1499786934
    //   593: l2i
    //   594: ldc_w 1344349840
    //   597: ixor
    //   598: ldc2_w -468155890
    //   601: l2i
    //   602: ldc_w 564600261
    //   605: ixor
    //   606: ixor
    //   607: lookupswitch default -> 632, -852048928 -> 590, 886584902 -> 922
    //   632: getfield fractionalMetrics : Z
    //   635: getstatic Perryc.1 : I
    //   638: ifeq -> 652
    //   641: ldc2_w 1918455812
    //   644: l2i
    //   645: ldc_w -881575850
    //   648: ixor
    //   649: goto -> 660
    //   652: ldc2_w -1259100483
    //   655: l2i
    //   656: ldc_w 566930656
    //   659: ixor
    //   660: ldc2_w 637032695
    //   663: l2i
    //   664: ldc_w -1236183655
    //   667: ixor
    //   668: ixor
    //   669: lookupswitch default -> 898, 110102323 -> 696, 713319740 -> 652
    //   696: aload_0
    //   697: getstatic Perryc.0 : I
    //   700: ifle -> 714
    //   703: ldc2_w -1895000899
    //   706: l2i
    //   707: ldc_w 2013027738
    //   710: ixor
    //   711: goto -> 722
    //   714: ldc2_w 1163386641
    //   717: l2i
    //   718: ldc_w 2058613809
    //   721: ixor
    //   722: ldc2_w 1282258151
    //   725: l2i
    //   726: ldc_w 2115861392
    //   729: ixor
    //   730: ixor
    //   731: lookupswitch default -> 910, -897579440 -> 714, 227861591 -> 756
    //   756: getfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   759: getstatic Perryc.0 : I
    //   762: ifle -> 776
    //   765: ldc2_w -1456724072
    //   768: l2i
    //   769: ldc_w 691875607
    //   772: ixor
    //   773: goto -> 784
    //   776: ldc2_w -15275047
    //   779: l2i
    //   780: ldc_w -1748898210
    //   783: ixor
    //   784: ldc2_w 966917124
    //   787: l2i
    //   788: ldc_w 921495979
    //   791: ixor
    //   792: ixor
    //   793: lookupswitch default -> 914, -1889788640 -> 776, 1738149928 -> 820
    //   820: goto -> 824
    //   823: athrow
    //   824: invokevirtual setupTexture : (Ljava/awt/Font;ZZ[Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;)Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   827: goto -> 831
    //   830: athrow
    //   831: getstatic Perryc.0 : I
    //   834: ifle -> 848
    //   837: ldc2_w 1682532118
    //   840: l2i
    //   841: ldc_w 1916590435
    //   844: ixor
    //   845: goto -> 856
    //   848: ldc2_w 2025524513
    //   851: l2i
    //   852: ldc_w 1591950738
    //   855: ixor
    //   856: ldc2_w 391872293
    //   859: l2i
    //   860: ldc_w 1496110926
    //   863: ixor
    //   864: ixor
    //   865: lookupswitch default -> 892, 460566206 -> 848, 1476531742 -> 900
    //   892: putfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   895: return
    //   896: aconst_null
    //   897: athrow
    //   898: aconst_null
    //   899: athrow
    //   900: aconst_null
    //   901: athrow
    //   902: aconst_null
    //   903: athrow
    //   904: aconst_null
    //   905: athrow
    //   906: aconst_null
    //   907: athrow
    //   908: aconst_null
    //   909: athrow
    //   910: aconst_null
    //   911: athrow
    //   912: aconst_null
    //   913: athrow
    //   914: aconst_null
    //   915: athrow
    //   916: aconst_null
    //   917: athrow
    //   918: aconst_null
    //   919: athrow
    //   920: aconst_null
    //   921: athrow
    //   922: aconst_null
    //   923: athrow
    //   924: pop
    //   925: goto -> 24
    //   928: pop
    //   929: aconst_null
    //   930: goto -> 924
    //   933: dup
    //   934: ifnull -> 924
    //   937: checkcast java/lang/Throwable
    //   940: athrow
    //   941: dup
    //   942: ifnull -> 928
    //   945: checkcast java/lang/Throwable
    //   948: athrow
    //   949: aconst_null
    //   950: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	872	0	this	Lbigname/zprestige/webhack/features/gui/font/CFont;
    //   24	872	1	font	Ljava/awt/Font;
    // Exception table:
    //   from	to	target	type
    //   8	20	933	java/lang/ArrayIndexOutOfBoundsException
    //   823	830	830	finally
    //   823	830	830	finally
    //   823	830	830	finally
    //   824	830	3	finally
    //   824	830	823	finally
    //   933	941	933	finally
    //   949	951	3	finally
  }
  
  public CFont(Font font, boolean antiAlias, boolean fractionalMetrics) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -745632111
    //   9: l2i
    //   10: ldc_w 2010255332
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1963174578
    //   20: l2i
    //   21: ldc_w -1982857376
    //   24: ixor
    //   25: ldc2_w 507029728
    //   28: l2i
    //   29: ldc_w -1133120754
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 1922, 101833371 -> 17, 1585516092 -> 60
    //   60: aload_0
    //   61: ldc_w 8.921625E-4
    //   64: invokestatic floatToIntBits : (F)I
    //   67: ldc_w 2120867843
    //   70: ixor
    //   71: invokestatic intBitsToFloat : (I)F
    //   74: getstatic Perryc.c : I
    //   77: iflt -> 91
    //   80: ldc2_w -8619216
    //   83: l2i
    //   84: ldc_w -1188337795
    //   87: ixor
    //   88: goto -> 99
    //   91: ldc2_w 1489527095
    //   94: l2i
    //   95: ldc_w 1699178201
    //   98: ixor
    //   99: ldc2_w -2136624000
    //   102: l2i
    //   103: ldc_w 1712818113
    //   106: ixor
    //   107: ixor
    //   108: lookupswitch default -> 136, -1595592948 -> 1952, 1645418990 -> 91
    //   136: putfield imgSize : F
    //   139: getstatic Perryc.0 : I
    //   142: ifle -> 156
    //   145: ldc2_w 113062081
    //   148: l2i
    //   149: ldc_w 527032816
    //   152: ixor
    //   153: goto -> 164
    //   156: ldc2_w -2104021091
    //   159: l2i
    //   160: ldc_w -465031744
    //   163: ixor
    //   164: ldc2_w 937312382
    //   167: l2i
    //   168: ldc_w -136196283
    //   171: ixor
    //   172: ixor
    //   173: lookupswitch default -> 200, -909757174 -> 156, -638886390 -> 1932
    //   200: aload_0
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 218
    //   207: ldc2_w -1643680747
    //   210: l2i
    //   211: ldc_w 2067870899
    //   214: ixor
    //   215: goto -> 226
    //   218: ldc2_w -1965749019
    //   221: l2i
    //   222: ldc_w 1361670832
    //   225: ixor
    //   226: ldc2_w 57122854
    //   229: l2i
    //   230: ldc_w 1278280956
    //   233: ixor
    //   234: ixor
    //   235: lookupswitch default -> 260, -2008959063 -> 218, -1441727364 -> 1946
    //   260: invokespecial <init> : ()V
    //   263: getstatic Perryc.1 : I
    //   266: ifeq -> 280
    //   269: ldc2_w 441864021
    //   272: l2i
    //   273: ldc_w 1729224777
    //   276: ixor
    //   277: goto -> 288
    //   280: ldc2_w 88267413
    //   283: l2i
    //   284: ldc_w -590568222
    //   287: ixor
    //   288: ldc2_w 2066311061
    //   291: l2i
    //   292: ldc_w -1211433921
    //   295: ixor
    //   296: ixor
    //   297: lookupswitch default -> 324, -1314638666 -> 1912, -736382516 -> 280
    //   324: aload_0
    //   325: ldc_w 2.442065E-4
    //   328: invokestatic floatToIntBits : (F)I
    //   331: ldc_w 2105542871
    //   334: ixor
    //   335: invokestatic intBitsToFloat : (I)F
    //   338: getstatic Perryc.0 : I
    //   341: ifle -> 355
    //   344: ldc2_w -1911128471
    //   347: l2i
    //   348: ldc_w 361676596
    //   351: ixor
    //   352: goto -> 363
    //   355: ldc2_w 282965813
    //   358: l2i
    //   359: ldc_w -1624208106
    //   362: ixor
    //   363: ldc2_w 1259735210
    //   366: l2i
    //   367: ldc_w 696241848
    //   370: ixor
    //   371: ixor
    //   372: lookupswitch default -> 400, -101644465 -> 1942, 1495962610 -> 355
    //   400: putfield imgSize : F
    //   403: getstatic Perryc.c : I
    //   406: iflt -> 420
    //   409: ldc2_w 729019887
    //   412: l2i
    //   413: ldc_w -1424930728
    //   416: ixor
    //   417: goto -> 428
    //   420: ldc2_w 772228067
    //   423: l2i
    //   424: ldc_w -1859731793
    //   427: ixor
    //   428: ldc2_w -10433810
    //   431: l2i
    //   432: ldc_w -1719610459
    //   435: ixor
    //   436: ixor
    //   437: lookupswitch default -> 1926, -641604601 -> 464, -427645700 -> 420
    //   464: aload_0
    //   465: ldc2_w 1023103656
    //   468: l2i
    //   469: ldc_w 1023103912
    //   472: ixor
    //   473: anewarray bigname/zprestige/webhack/features/gui/font/CFont$CharData
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w 1682102651
    //   485: l2i
    //   486: ldc_w -1548898165
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1297546290
    //   496: l2i
    //   497: ldc_w 124670603
    //   500: ixor
    //   501: ldc2_w 1752592761
    //   504: l2i
    //   505: ldc_w 887120991
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -1686537002 -> 1958, 1857736163 -> 493
    //   536: putfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 556
    //   545: ldc2_w -1391102950
    //   548: l2i
    //   549: ldc_w -1914941257
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 1560091110
    //   559: l2i
    //   560: ldc_w -7583311
    //   563: ixor
    //   564: ldc2_w 1567308768
    //   567: l2i
    //   568: ldc_w 2103758641
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 600, 13029500 -> 1914, 1767579455 -> 556
    //   600: aload_0
    //   601: ldc2_w 1222048985
    //   604: l2i
    //   605: ldc_w -1222048986
    //   608: ixor
    //   609: getstatic Perryc.c : I
    //   612: iflt -> 626
    //   615: ldc2_w 581881390
    //   618: l2i
    //   619: ldc_w 183523522
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w 1443625915
    //   629: l2i
    //   630: ldc_w 1385396254
    //   633: ixor
    //   634: ldc2_w -232586254
    //   637: l2i
    //   638: ldc_w -1918388822
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, 580211832 -> 626, 1473913012 -> 1964
    //   668: putfield fontHeight : I
    //   671: getstatic Perryc.1 : I
    //   674: ifeq -> 688
    //   677: ldc2_w -2001098228
    //   680: l2i
    //   681: ldc_w 1713687163
    //   684: ixor
    //   685: goto -> 696
    //   688: ldc2_w -1625277441
    //   691: l2i
    //   692: ldc_w -1873009059
    //   695: ixor
    //   696: ldc2_w 695195870
    //   699: l2i
    //   700: ldc_w 7250000
    //   703: ixor
    //   704: ixor
    //   705: lookupswitch default -> 1940, -946071303 -> 688, 645752108 -> 732
    //   732: aload_0
    //   733: ldc2_w -1525524123
    //   736: l2i
    //   737: ldc_w -1525524123
    //   740: ixor
    //   741: getstatic Perryc.c : I
    //   744: iflt -> 758
    //   747: ldc2_w 595972889
    //   750: l2i
    //   751: ldc_w -412734011
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w -650264210
    //   761: l2i
    //   762: ldc_w 1071288788
    //   765: ixor
    //   766: ldc2_w 1695872235
    //   769: l2i
    //   770: ldc_w -331267443
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 1948, 1303791802 -> 758, 1873995484 -> 800
    //   800: putfield charOffset : I
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 820
    //   809: ldc2_w -1828930811
    //   812: l2i
    //   813: ldc_w 1942503137
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -1948019663
    //   823: l2i
    //   824: ldc_w -1018514423
    //   827: ixor
    //   828: ldc2_w -1816155293
    //   831: l2i
    //   832: ldc_w -263048334
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 864, -2099700235 -> 1918, -1950242201 -> 820
    //   864: aload_0
    //   865: getstatic Perryc.0 : I
    //   868: ifle -> 882
    //   871: ldc2_w 2012746846
    //   874: l2i
    //   875: ldc_w -853283786
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w -1308316605
    //   885: l2i
    //   886: ldc_w -2056918197
    //   889: ixor
    //   890: ldc2_w 1212409716
    //   893: l2i
    //   894: ldc_w -80951953
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, 162847347 -> 1962, 1672801498 -> 882
    //   924: aload_1
    //   925: getstatic Perryc.1 : I
    //   928: ifeq -> 942
    //   931: ldc2_w -441867185
    //   934: l2i
    //   935: ldc_w 1811124536
    //   938: ixor
    //   939: goto -> 950
    //   942: ldc2_w 314880946
    //   945: l2i
    //   946: ldc_w -726584645
    //   949: ixor
    //   950: ldc2_w 970414936
    //   953: l2i
    //   954: ldc_w 968883798
    //   957: ixor
    //   958: ixor
    //   959: lookupswitch default -> 984, -1909288839 -> 1966, -1211337229 -> 942
    //   984: putfield font : Ljava/awt/Font;
    //   987: getstatic Perryc.c : I
    //   990: iflt -> 1004
    //   993: ldc2_w -954882383
    //   996: l2i
    //   997: ldc_w -299587199
    //   1000: ixor
    //   1001: goto -> 1012
    //   1004: ldc2_w -521718183
    //   1007: l2i
    //   1008: ldc_w 428578643
    //   1011: ixor
    //   1012: ldc2_w -1001558881
    //   1015: l2i
    //   1016: ldc_w 567737136
    //   1019: ixor
    //   1020: ixor
    //   1021: lookupswitch default -> 1048, -1528728253 -> 1004, -861235041 -> 1910
    //   1048: aload_0
    //   1049: getstatic Perryc.c : I
    //   1052: iflt -> 1066
    //   1055: ldc2_w -1943388168
    //   1058: l2i
    //   1059: ldc_w -19014799
    //   1062: ixor
    //   1063: goto -> 1074
    //   1066: ldc2_w 1892990339
    //   1069: l2i
    //   1070: ldc_w -1678820557
    //   1073: ixor
    //   1074: ldc2_w 1779156338
    //   1077: l2i
    //   1078: ldc_w -1700574714
    //   1081: ixor
    //   1082: ixor
    //   1083: lookupswitch default -> 1108, -2107675651 -> 1924, -539601991 -> 1066
    //   1108: iload_2
    //   1109: getstatic Perryc.0 : I
    //   1112: ifle -> 1126
    //   1115: ldc2_w 420633332
    //   1118: l2i
    //   1119: ldc_w 1550093112
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w -1300269394
    //   1129: l2i
    //   1130: ldc_w 1296483206
    //   1133: ixor
    //   1134: ldc2_w -1323594894
    //   1137: l2i
    //   1138: ldc_w 686861743
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 1956, -593627375 -> 1126, 1725076469 -> 1168
    //   1168: putfield antiAlias : Z
    //   1171: getstatic Perryc.0 : I
    //   1174: ifle -> 1188
    //   1177: ldc2_w 1004867658
    //   1180: l2i
    //   1181: ldc_w 1847873707
    //   1184: ixor
    //   1185: goto -> 1196
    //   1188: ldc2_w 706327355
    //   1191: l2i
    //   1192: ldc_w -1032829932
    //   1195: ixor
    //   1196: ldc2_w -735929629
    //   1199: l2i
    //   1200: ldc_w 1782742560
    //   1203: ixor
    //   1204: ixor
    //   1205: lookupswitch default -> 1232, -341728222 -> 1934, 2035373847 -> 1188
    //   1232: aload_0
    //   1233: getstatic Perryc.c : I
    //   1236: iflt -> 1250
    //   1239: ldc2_w 2005029633
    //   1242: l2i
    //   1243: ldc_w 1239647915
    //   1246: ixor
    //   1247: goto -> 1258
    //   1250: ldc2_w 2135244756
    //   1253: l2i
    //   1254: ldc_w -1634856177
    //   1257: ixor
    //   1258: ldc2_w 1061756155
    //   1261: l2i
    //   1262: ldc_w -1610353485
    //   1265: ixor
    //   1266: ixor
    //   1267: lookupswitch default -> 1292, -1591001630 -> 1916, 349213512 -> 1250
    //   1292: iload_3
    //   1293: getstatic Perryc.0 : I
    //   1296: ifle -> 1310
    //   1299: ldc2_w -587744672
    //   1302: l2i
    //   1303: ldc_w 557016589
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w 1462953688
    //   1313: l2i
    //   1314: ldc_w -2045738777
    //   1317: ixor
    //   1318: ldc2_w 389053521
    //   1321: l2i
    //   1322: ldc_w -3235005
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1950, 356123519 -> 1310, 970766637 -> 1352
    //   1352: putfield fractionalMetrics : Z
    //   1355: getstatic Perryc.c : I
    //   1358: iflt -> 1372
    //   1361: ldc2_w -1308224664
    //   1364: l2i
    //   1365: ldc_w -468606703
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 927112928
    //   1375: l2i
    //   1376: ldc_w -954875038
    //   1379: ixor
    //   1380: ldc2_w -207149028
    //   1383: l2i
    //   1384: ldc_w 2082154911
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 1944, -643058694 -> 1372, 2146130945 -> 1416
    //   1416: aload_0
    //   1417: getstatic Perryc.c : I
    //   1420: iflt -> 1434
    //   1423: ldc2_w -1944725648
    //   1426: l2i
    //   1427: ldc_w -399957877
    //   1430: ixor
    //   1431: goto -> 1442
    //   1434: ldc2_w -1116419677
    //   1437: l2i
    //   1438: ldc_w -2015342180
    //   1441: ixor
    //   1442: ldc2_w -223475572
    //   1445: l2i
    //   1446: ldc_w 678143539
    //   1449: ixor
    //   1450: ixor
    //   1451: lookupswitch default -> 1920, -1090954940 -> 1434, -531548544 -> 1476
    //   1476: aload_0
    //   1477: getstatic Perryc.0 : I
    //   1480: ifle -> 1494
    //   1483: ldc2_w -1004342333
    //   1486: l2i
    //   1487: ldc_w 646660708
    //   1490: ixor
    //   1491: goto -> 1502
    //   1494: ldc2_w -1503620867
    //   1497: l2i
    //   1498: ldc_w -1477944970
    //   1501: ixor
    //   1502: ldc2_w 77901567
    //   1505: l2i
    //   1506: ldc_w 576244054
    //   1509: ixor
    //   1510: ixor
    //   1511: lookupswitch default -> 1536, -1001007602 -> 1954, 1707708855 -> 1494
    //   1536: aload_1
    //   1537: getstatic Perryc.0 : I
    //   1540: ifle -> 1554
    //   1543: ldc2_w -1385914183
    //   1546: l2i
    //   1547: ldc_w -1866441614
    //   1550: ixor
    //   1551: goto -> 1562
    //   1554: ldc2_w 2010955183
    //   1557: l2i
    //   1558: ldc_w 2087101775
    //   1561: ixor
    //   1562: ldc2_w 1875136312
    //   1565: l2i
    //   1566: ldc_w -1891027537
    //   1569: ixor
    //   1570: ixor
    //   1571: lookupswitch default -> 1596, -584481188 -> 1928, 1957475841 -> 1554
    //   1596: iload_2
    //   1597: getstatic Perryc.1 : I
    //   1600: ifeq -> 1614
    //   1603: ldc2_w 1298681976
    //   1606: l2i
    //   1607: ldc_w -690545793
    //   1610: ixor
    //   1611: goto -> 1622
    //   1614: ldc2_w 1880928751
    //   1617: l2i
    //   1618: ldc_w -1473461074
    //   1621: ixor
    //   1622: ldc2_w 1512271036
    //   1625: l2i
    //   1626: ldc_w -831103953
    //   1629: ixor
    //   1630: ixor
    //   1631: lookupswitch default -> 1656, -1062143450 -> 1614, 267025300 -> 1936
    //   1656: iload_3
    //   1657: getstatic Perryc.c : I
    //   1660: iflt -> 1674
    //   1663: ldc2_w -1446983321
    //   1666: l2i
    //   1667: ldc_w -1322960181
    //   1670: ixor
    //   1671: goto -> 1682
    //   1674: ldc2_w -1616968419
    //   1677: l2i
    //   1678: ldc_w -1047931017
    //   1681: ixor
    //   1682: ldc2_w -1015420027
    //   1685: l2i
    //   1686: ldc_w 1333477173
    //   1689: ixor
    //   1690: ixor
    //   1691: lookupswitch default -> 1716, -1796790500 -> 1960, -1411171404 -> 1674
    //   1716: aload_0
    //   1717: getstatic Perryc.1 : I
    //   1720: ifeq -> 1734
    //   1723: ldc2_w 98979832
    //   1726: l2i
    //   1727: ldc_w 1183402990
    //   1730: ixor
    //   1731: goto -> 1742
    //   1734: ldc2_w -640300047
    //   1737: l2i
    //   1738: ldc_w -1742243414
    //   1741: ixor
    //   1742: ldc2_w -1980318320
    //   1745: l2i
    //   1746: ldc_w 1194290938
    //   1749: ixor
    //   1750: ixor
    //   1751: lookupswitch default -> 1938, -1917397124 -> 1734, -1892982479 -> 1776
    //   1776: getfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   1779: getstatic Perryc.c : I
    //   1782: iflt -> 1796
    //   1785: ldc2_w 1348304339
    //   1788: l2i
    //   1789: ldc_w 67433581
    //   1792: ixor
    //   1793: goto -> 1804
    //   1796: ldc2_w 2029692748
    //   1799: l2i
    //   1800: ldc_w -298534526
    //   1803: ixor
    //   1804: ldc2_w -1994261496
    //   1807: l2i
    //   1808: ldc_w -1556193938
    //   1811: ixor
    //   1812: ixor
    //   1813: lookupswitch default -> 1908, -1127104600 -> 1840, 2118527192 -> 1796
    //   1840: invokevirtual setupTexture : (Ljava/awt/Font;ZZ[Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;)Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   1843: getstatic Perryc.c : I
    //   1846: iflt -> 1860
    //   1849: ldc2_w -685119560
    //   1852: l2i
    //   1853: ldc_w -380503569
    //   1856: ixor
    //   1857: goto -> 1868
    //   1860: ldc2_w 145620768
    //   1863: l2i
    //   1864: ldc_w 278298602
    //   1867: ixor
    //   1868: ldc2_w 1723454161
    //   1871: l2i
    //   1872: ldc_w -908319648
    //   1875: ixor
    //   1876: ixor
    //   1877: lookupswitch default -> 1930, -1860310810 -> 1860, -1218546053 -> 1904
    //   1904: putfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   1907: return
    //   1908: aconst_null
    //   1909: athrow
    //   1910: aconst_null
    //   1911: athrow
    //   1912: aconst_null
    //   1913: athrow
    //   1914: aconst_null
    //   1915: athrow
    //   1916: aconst_null
    //   1917: athrow
    //   1918: aconst_null
    //   1919: athrow
    //   1920: aconst_null
    //   1921: athrow
    //   1922: aconst_null
    //   1923: athrow
    //   1924: aconst_null
    //   1925: athrow
    //   1926: aconst_null
    //   1927: athrow
    //   1928: aconst_null
    //   1929: athrow
    //   1930: aconst_null
    //   1931: athrow
    //   1932: aconst_null
    //   1933: athrow
    //   1934: aconst_null
    //   1935: athrow
    //   1936: aconst_null
    //   1937: athrow
    //   1938: aconst_null
    //   1939: athrow
    //   1940: aconst_null
    //   1941: athrow
    //   1942: aconst_null
    //   1943: athrow
    //   1944: aconst_null
    //   1945: athrow
    //   1946: aconst_null
    //   1947: athrow
    //   1948: aconst_null
    //   1949: athrow
    //   1950: aconst_null
    //   1951: athrow
    //   1952: aconst_null
    //   1953: athrow
    //   1954: aconst_null
    //   1955: athrow
    //   1956: aconst_null
    //   1957: athrow
    //   1958: aconst_null
    //   1959: athrow
    //   1960: aconst_null
    //   1961: athrow
    //   1962: aconst_null
    //   1963: athrow
    //   1964: aconst_null
    //   1965: athrow
    //   1966: aconst_null
    //   1967: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   139	1769	0	this	Lbigname/zprestige/webhack/features/gui/font/CFont;
    //   139	1769	1	font	Ljava/awt/Font;
    //   139	1769	2	antiAlias	Z
    //   139	1769	3	fractionalMetrics	Z
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public int getStringWidth(String text) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\font\CFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */