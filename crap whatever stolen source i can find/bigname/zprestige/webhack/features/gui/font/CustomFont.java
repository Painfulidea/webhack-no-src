package bigname.zprestige.webhack.features.gui.font;

import Perry1;
import Perryc;
import java.awt.Font;
import java.util.List;
import net.minecraft.client.renderer.texture.DynamicTexture;

public class CustomFont extends CFont {
  public String colorcodeIdentifiers;
  
  public DynamicTexture texItalic;
  
  public CFont$CharData[] boldChars;
  
  public CFont$CharData[] boldItalicChars;
  
  public int[] colorCode;
  
  public CFont$CharData[] italicChars;
  
  public DynamicTexture texItalicBold;
  
  public DynamicTexture texBold;
  
  public void setFont(Font font) {
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
  
  public int getStringWidth(String paramString) {
    return Perry1.18(this, (int)-12775702L ^ 0xD6FBA726, paramString);
  }
  
  public void drawLine(double x, double y, double x1, double y1, float width) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 877
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 869
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 861
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w -117237560
    //   27: l2i
    //   28: ldc -117238487
    //   30: ixor
    //   31: getstatic Perryc.1 : I
    //   34: ifeq -> 47
    //   37: ldc2_w 1077354626
    //   40: l2i
    //   41: ldc -1081700646
    //   43: ixor
    //   44: goto -> 54
    //   47: ldc2_w 43786509
    //   50: l2i
    //   51: ldc 210614286
    //   53: ixor
    //   54: ldc2_w 1674874792
    //   57: l2i
    //   58: ldc 2046802234
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -442853174 -> 830, -372438341 -> 47
    //   88: goto -> 92
    //   91: athrow
    //   92: invokestatic glDisable : (I)V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 115
    //   105: ldc2_w -1326021940
    //   108: l2i
    //   109: ldc -708786393
    //   111: ixor
    //   112: goto -> 122
    //   115: ldc2_w 167186922
    //   118: l2i
    //   119: ldc -1752398228
    //   121: ixor
    //   122: ldc2_w 587910316
    //   125: l2i
    //   126: ldc -759906073
    //   128: ixor
    //   129: ixor
    //   130: lookupswitch default -> 156, -1803007584 -> 834, -1781660489 -> 115
    //   156: fload #9
    //   158: getstatic Perryc.c : I
    //   161: iflt -> 174
    //   164: ldc2_w 1358922742
    //   167: l2i
    //   168: ldc -314433116
    //   170: ixor
    //   171: goto -> 181
    //   174: ldc2_w -496899246
    //   177: l2i
    //   178: ldc -657386333
    //   180: ixor
    //   181: ldc2_w -243411118
    //   184: l2i
    //   185: ldc 1773864764
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, 628847164 -> 832, 1569233033 -> 174
    //   216: goto -> 220
    //   219: athrow
    //   220: invokestatic glLineWidth : (F)V
    //   223: goto -> 227
    //   226: athrow
    //   227: ldc2_w -1462977182
    //   230: l2i
    //   231: ldc -1462977181
    //   233: ixor
    //   234: getstatic Perryc.0 : I
    //   237: ifle -> 250
    //   240: ldc2_w 58328370
    //   243: l2i
    //   244: ldc -139361602
    //   246: ixor
    //   247: goto -> 257
    //   250: ldc2_w 912156297
    //   253: l2i
    //   254: ldc 1553236797
    //   256: ixor
    //   257: ldc2_w -892633587
    //   260: l2i
    //   261: ldc -431477894
    //   263: ixor
    //   264: ixor
    //   265: lookupswitch default -> 850, -666316037 -> 250, 1179234499 -> 292
    //   292: goto -> 296
    //   295: athrow
    //   296: invokestatic glBegin : (I)V
    //   299: goto -> 303
    //   302: athrow
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 319
    //   309: ldc2_w 1394238157
    //   312: l2i
    //   313: ldc -801664536
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w 313022588
    //   322: l2i
    //   323: ldc 310047880
    //   325: ixor
    //   326: ldc2_w 1169469399
    //   329: l2i
    //   330: ldc 1415067188
    //   332: ixor
    //   333: ixor
    //   334: lookupswitch default -> 360, -1832817978 -> 828, -341399696 -> 319
    //   360: dload_1
    //   361: getstatic Perryc.0 : I
    //   364: ifle -> 377
    //   367: ldc2_w 600879491
    //   370: l2i
    //   371: ldc 2131436356
    //   373: ixor
    //   374: goto -> 384
    //   377: ldc2_w -264591338
    //   380: l2i
    //   381: ldc -1288062024
    //   383: ixor
    //   384: ldc2_w 895210615
    //   387: l2i
    //   388: ldc -772616473
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 842, -1482028738 -> 420, -1200453545 -> 377
    //   420: dload_3
    //   421: getstatic Perryc.c : I
    //   424: iflt -> 437
    //   427: ldc2_w 335841170
    //   430: l2i
    //   431: ldc 1808114674
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w -931733380
    //   440: l2i
    //   441: ldc -289953761
    //   443: ixor
    //   444: ldc2_w -1704353787
    //   447: l2i
    //   448: ldc -295171514
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 844, 197168675 -> 437, 1388372512 -> 480
    //   480: goto -> 484
    //   483: athrow
    //   484: invokestatic glVertex2d : (DD)V
    //   487: goto -> 491
    //   490: athrow
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 507
    //   497: ldc2_w -1568039101
    //   500: l2i
    //   501: ldc 833340527
    //   503: ixor
    //   504: goto -> 514
    //   507: ldc2_w 1506294839
    //   510: l2i
    //   511: ldc -1289000557
    //   513: ixor
    //   514: ldc2_w 1158121368
    //   517: l2i
    //   518: ldc -1880445307
    //   520: ixor
    //   521: ixor
    //   522: lookupswitch default -> 548, -1743801776 -> 507, 1506767409 -> 846
    //   548: dload #5
    //   550: getstatic Perryc.1 : I
    //   553: ifeq -> 566
    //   556: ldc2_w -666245697
    //   559: l2i
    //   560: ldc -1545334269
    //   562: ixor
    //   563: goto -> 573
    //   566: ldc2_w -1459336395
    //   569: l2i
    //   570: ldc 2007570620
    //   572: ixor
    //   573: ldc2_w 1934754200
    //   576: l2i
    //   577: ldc -206907143
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 836, -78303523 -> 566, 1582664424 -> 608
    //   608: dload #7
    //   610: getstatic Perryc.c : I
    //   613: iflt -> 626
    //   616: ldc2_w 1173184056
    //   619: l2i
    //   620: ldc 629895080
    //   622: ixor
    //   623: goto -> 633
    //   626: ldc2_w -1701086329
    //   629: l2i
    //   630: ldc 998254189
    //   632: ixor
    //   633: ldc2_w -1566253260
    //   636: l2i
    //   637: ldc 374222864
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, -728965452 -> 838, 1054392995 -> 626
    //   668: goto -> 672
    //   671: athrow
    //   672: invokestatic glVertex2d : (DD)V
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 695
    //   685: ldc2_w 1131884888
    //   688: l2i
    //   689: ldc -1247055566
    //   691: ixor
    //   692: goto -> 702
    //   695: ldc2_w 442096349
    //   698: l2i
    //   699: ldc 306863353
    //   701: ixor
    //   702: ldc2_w -2075264066
    //   705: l2i
    //   706: ldc 965045505
    //   708: ixor
    //   709: ixor
    //   710: lookupswitch default -> 736, -1712158829 -> 695, 1259656917 -> 840
    //   736: goto -> 740
    //   739: athrow
    //   740: invokestatic glEnd : ()V
    //   743: goto -> 747
    //   746: athrow
    //   747: ldc2_w -134400644
    //   750: l2i
    //   751: ldc -134399843
    //   753: ixor
    //   754: getstatic Perryc.c : I
    //   757: iflt -> 771
    //   760: ldc2_w 833012380
    //   763: l2i
    //   764: ldc_w -2024768584
    //   767: ixor
    //   768: goto -> 779
    //   771: ldc2_w 212103215
    //   774: l2i
    //   775: ldc_w -541032195
    //   778: ixor
    //   779: ldc2_w 515202653
    //   782: l2i
    //   783: ldc_w -675585018
    //   786: ixor
    //   787: ixor
    //   788: lookupswitch default -> 848, 443206281 -> 816, 2146993023 -> 771
    //   816: goto -> 820
    //   819: athrow
    //   820: invokestatic glEnable : (I)V
    //   823: goto -> 827
    //   826: athrow
    //   827: return
    //   828: aconst_null
    //   829: athrow
    //   830: aconst_null
    //   831: athrow
    //   832: aconst_null
    //   833: athrow
    //   834: aconst_null
    //   835: athrow
    //   836: aconst_null
    //   837: athrow
    //   838: aconst_null
    //   839: athrow
    //   840: aconst_null
    //   841: athrow
    //   842: aconst_null
    //   843: athrow
    //   844: aconst_null
    //   845: athrow
    //   846: aconst_null
    //   847: athrow
    //   848: aconst_null
    //   849: athrow
    //   850: aconst_null
    //   851: athrow
    //   852: pop
    //   853: goto -> 24
    //   856: pop
    //   857: aconst_null
    //   858: goto -> 852
    //   861: dup
    //   862: ifnull -> 852
    //   865: checkcast java/lang/Throwable
    //   868: athrow
    //   869: dup
    //   870: ifnull -> 856
    //   873: checkcast java/lang/Throwable
    //   876: athrow
    //   877: aconst_null
    //   878: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	804	0	this	Lbigname/zprestige/webhack/features/gui/font/CustomFont;
    //   24	804	1	x	D
    //   24	804	3	y	D
    //   24	804	5	x1	D
    //   24	804	7	y1	D
    //   24	804	9	width	F
    // Exception table:
    //   from	to	target	type
    //   8	20	861	finally
    //   91	98	98	finally
    //   92	98	91	finally
    //   92	98	3	finally
    //   92	98	91	java/lang/UnsupportedOperationException
    //   92	98	91	java/lang/AssertionError
    //   220	226	226	finally
    //   220	226	3	finally
    //   220	226	3	java/lang/NullPointerException
    //   220	226	3	finally
    //   220	226	226	finally
    //   296	302	302	finally
    //   296	302	302	finally
    //   296	302	302	java/lang/ArithmeticException
    //   296	302	302	java/lang/AssertionError
    //   296	302	3	finally
    //   483	490	490	finally
    //   483	490	3	java/lang/UnsupportedOperationException
    //   483	490	3	java/lang/NumberFormatException
    //   484	490	3	finally
    //   484	490	483	java/lang/ClassCastException
    //   671	678	678	finally
    //   671	678	671	finally
    //   671	678	3	finally
    //   671	678	3	finally
    //   672	678	3	java/lang/NegativeArraySizeException
    //   739	746	746	finally
    //   739	746	3	java/lang/AssertionError
    //   739	746	746	finally
    //   739	746	739	finally
    //   740	746	739	java/lang/NumberFormatException
    //   819	826	826	finally
    //   819	826	819	finally
    //   819	826	3	java/lang/IllegalArgumentException
    //   819	826	819	java/lang/RuntimeException
    //   820	826	819	finally
    //   861	869	861	java/lang/ArithmeticException
    //   877	879	3	java/lang/NullPointerException
  }
  
  public float drawString(String text, double x, double y, int color, boolean shadow) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 15990
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 15982
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 15974
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1022374116
    //   33: l2i
    //   34: ldc_w -1171246801
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1916469810
    //   44: l2i
    //   45: ldc_w 235958459
    //   48: ixor
    //   49: ldc2_w 1392371372
    //   52: l2i
    //   53: ldc_w -2027081006
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 15567, -1393612211 -> 41, 1443125515 -> 84
    //   84: dload_2
    //   85: ldc2_w 26.337727185024374
    //   88: invokestatic doubleToLongBits : (D)J
    //   91: ldc2_w 9208267449863939675
    //   94: lxor
    //   95: invokestatic longBitsToDouble : (J)D
    //   98: dsub
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w -716002302
    //   108: l2i
    //   109: ldc_w -857002331
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 822979007
    //   119: l2i
    //   120: ldc_w -953726441
    //   123: ixor
    //   124: ldc2_w 448833098
    //   127: l2i
    //   128: ldc_w -1124832525
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 15739, -1081258466 -> 116, 1344155409 -> 160
    //   160: dstore_2
    //   161: getstatic Perryc.0 : I
    //   164: ifle -> 178
    //   167: ldc2_w -816011662
    //   170: l2i
    //   171: ldc_w -1151868908
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w -295618192
    //   181: l2i
    //   182: ldc_w 735375583
    //   185: ixor
    //   186: ldc2_w -440052057
    //   189: l2i
    //   190: ldc_w -266831619
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 220, 98821077 -> 178, 1641441340 -> 15629
    //   220: dload #4
    //   222: ldc2_w 0.619017647868307
    //   225: invokestatic doubleToLongBits : (D)J
    //   228: ldc2_w 9215436853269215257
    //   231: lxor
    //   232: invokestatic longBitsToDouble : (J)D
    //   235: dsub
    //   236: getstatic Perryc.c : I
    //   239: iflt -> 253
    //   242: ldc2_w -167599824
    //   245: l2i
    //   246: ldc_w 1559345166
    //   249: ixor
    //   250: goto -> 261
    //   253: ldc2_w -1185557360
    //   256: l2i
    //   257: ldc_w 694658924
    //   260: ixor
    //   261: ldc2_w 2086131860
    //   264: l2i
    //   265: ldc_w 900293118
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 15847, -640890218 -> 296, -485646252 -> 253
    //   296: dstore #4
    //   298: getstatic Perryc.c : I
    //   301: iflt -> 315
    //   304: ldc2_w 1921742948
    //   307: l2i
    //   308: ldc_w -74580297
    //   311: ixor
    //   312: goto -> 323
    //   315: ldc2_w -877513660
    //   318: l2i
    //   319: ldc_w 2131068070
    //   322: ixor
    //   323: ldc2_w -885231638
    //   326: l2i
    //   327: ldc_w 815255390
    //   330: ixor
    //   331: ixor
    //   332: lookupswitch default -> 15755, 1327239254 -> 360, 1923950183 -> 315
    //   360: aload_1
    //   361: ifnonnull -> 375
    //   364: ldc2_w 1452811002
    //   367: l2i
    //   368: ldc_w 1248756956
    //   371: ixor
    //   372: goto -> 383
    //   375: ldc2_w -1586893714
    //   378: l2i
    //   379: ldc_w -1113634229
    //   382: ixor
    //   383: ldc2_w -1595641090
    //   386: l2i
    //   387: ldc_w -294325527
    //   390: ixor
    //   391: ixor
    //   392: tableswitch default -> 364, 1382426161 -> 416, 1382426162 -> 430
    //   416: ldc_w 2.2844692E38
    //   419: invokestatic floatToIntBits : (F)I
    //   422: ldc_w 2133581127
    //   425: ixor
    //   426: invokestatic intBitsToFloat : (I)F
    //   429: freturn
    //   430: getstatic Perryc.1 : I
    //   433: ifeq -> 447
    //   436: ldc2_w 544742549
    //   439: l2i
    //   440: ldc_w -168529560
    //   443: ixor
    //   444: goto -> 455
    //   447: ldc2_w 1751494649
    //   450: l2i
    //   451: ldc_w 542913419
    //   454: ixor
    //   455: ldc2_w 23414131
    //   458: l2i
    //   459: ldc_w 1330076460
    //   462: ixor
    //   463: ixor
    //   464: lookupswitch default -> 492, -1683065950 -> 15659, -1252328086 -> 447
    //   492: iload #6
    //   494: ldc2_w -1203088681
    //   497: l2i
    //   498: ldc_w -1732924120
    //   501: ixor
    //   502: if_icmpne -> 516
    //   505: ldc2_w -1911167164
    //   508: l2i
    //   509: ldc_w 408084933
    //   512: ixor
    //   513: goto -> 524
    //   516: ldc2_w -615263763
    //   519: l2i
    //   520: ldc_w 1293211501
    //   523: ixor
    //   524: ldc2_w -842173839
    //   527: l2i
    //   528: ldc_w -1706787632
    //   531: ixor
    //   532: ixor
    //   533: tableswitch default -> 505, -1043462112 -> 556, -1043462111 -> 626
    //   556: ldc2_w -473739852
    //   559: l2i
    //   560: ldc_w -482561461
    //   563: ixor
    //   564: getstatic Perryc.0 : I
    //   567: ifle -> 581
    //   570: ldc2_w 1147193188
    //   573: l2i
    //   574: ldc_w 2053375
    //   577: ixor
    //   578: goto -> 589
    //   581: ldc2_w -1107496832
    //   584: l2i
    //   585: ldc_w 985184347
    //   588: ixor
    //   589: ldc2_w 55875885
    //   592: l2i
    //   593: ldc_w -874157898
    //   596: ixor
    //   597: ixor
    //   598: lookupswitch default -> 15843, -1932631552 -> 581, 1341503808 -> 624
    //   624: istore #6
    //   626: getstatic Perryc.1 : I
    //   629: ifeq -> 643
    //   632: ldc2_w 427933427
    //   635: l2i
    //   636: ldc_w -1342231265
    //   639: ixor
    //   640: goto -> 651
    //   643: ldc2_w -550783469
    //   646: l2i
    //   647: ldc_w 622436270
    //   650: ixor
    //   651: ldc2_w -1620483507
    //   654: l2i
    //   655: ldc_w -2076884324
    //   658: ixor
    //   659: ixor
    //   660: lookupswitch default -> 688, -1390234819 -> 15589, -318185995 -> 643
    //   688: iload #6
    //   690: ldc2_w -1771564542
    //   693: l2i
    //   694: ldc_w 1785205250
    //   697: ixor
    //   698: iand
    //   699: ifne -> 713
    //   702: ldc2_w 1142224478
    //   705: l2i
    //   706: ldc_w -15420906
    //   709: ixor
    //   710: goto -> 721
    //   713: ldc2_w -1537532260
    //   716: l2i
    //   717: ldc_w 526080723
    //   720: ixor
    //   721: ldc2_w -1724469102
    //   724: l2i
    //   725: ldc_w -1921771231
    //   728: ixor
    //   729: ixor
    //   730: tableswitch default -> 702, -1354568197 -> 752, -1354568196 -> 886
    //   752: getstatic Perryc.c : I
    //   755: iflt -> 769
    //   758: ldc2_w -56809285
    //   761: l2i
    //   762: ldc_w -1970935556
    //   765: ixor
    //   766: goto -> 777
    //   769: ldc2_w -661966028
    //   772: l2i
    //   773: ldc_w 1420597596
    //   776: ixor
    //   777: ldc2_w 17164313
    //   780: l2i
    //   781: ldc_w -2076744353
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 812, -215331583 -> 15821, 416270658 -> 769
    //   812: iload #6
    //   814: ldc2_w -969695319
    //   817: l2i
    //   818: ldc_w 959684521
    //   821: ixor
    //   822: ior
    //   823: getstatic Perryc.1 : I
    //   826: ifeq -> 840
    //   829: ldc2_w -1619292429
    //   832: l2i
    //   833: ldc_w -65590159
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w -966570147
    //   843: l2i
    //   844: ldc_w 858301030
    //   847: ixor
    //   848: ldc2_w -110863290
    //   851: l2i
    //   852: ldc_w 113810718
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 15705, -1665113126 -> 840, 182922339 -> 884
    //   884: istore #6
    //   886: getstatic Perryc.0 : I
    //   889: ifle -> 903
    //   892: ldc2_w 1984571279
    //   895: l2i
    //   896: ldc_w 2141590018
    //   899: ixor
    //   900: goto -> 911
    //   903: ldc2_w -1515768104
    //   906: l2i
    //   907: ldc_w 168972820
    //   910: ixor
    //   911: ldc2_w 99239912
    //   914: l2i
    //   915: ldc_w 1055412030
    //   918: ixor
    //   919: ixor
    //   920: lookupswitch default -> 15709, -1799918566 -> 948, 854474075 -> 903
    //   948: iload #7
    //   950: ifeq -> 964
    //   953: ldc2_w 2011059244
    //   956: l2i
    //   957: ldc_w 238172686
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 1901606632
    //   967: l2i
    //   968: ldc_w 146036917
    //   971: ixor
    //   972: ldc2_w -322078745
    //   975: l2i
    //   976: ldc_w -1493978886
    //   979: ixor
    //   980: ixor
    //   981: tableswitch default -> 953, 869443903 -> 1004, 869443904 -> 1218
    //   1004: getstatic Perryc.1 : I
    //   1007: ifeq -> 1021
    //   1010: ldc2_w 1002720349
    //   1013: l2i
    //   1014: ldc_w 1789165836
    //   1017: ixor
    //   1018: goto -> 1029
    //   1021: ldc2_w 849306150
    //   1024: l2i
    //   1025: ldc_w 715121072
    //   1028: ixor
    //   1029: ldc2_w 2014356625
    //   1032: l2i
    //   1033: ldc_w -1021482862
    //   1036: ixor
    //   1037: ixor
    //   1038: lookupswitch default -> 1064, -361954990 -> 15561, -172753919 -> 1021
    //   1064: iload #6
    //   1066: ldc2_w 509516800
    //   1069: l2i
    //   1070: ldc_w 513958140
    //   1073: ixor
    //   1074: iand
    //   1075: ldc2_w 1033057329
    //   1078: l2i
    //   1079: ldc_w 1033057331
    //   1082: ixor
    //   1083: ishr
    //   1084: getstatic Perryc.0 : I
    //   1087: ifle -> 1101
    //   1090: ldc2_w -849144839
    //   1093: l2i
    //   1094: ldc_w 416308487
    //   1097: ixor
    //   1098: goto -> 1109
    //   1101: ldc2_w 505847267
    //   1104: l2i
    //   1105: ldc_w 415748499
    //   1108: ixor
    //   1109: ldc2_w -763518331
    //   1112: l2i
    //   1113: ldc_w 91046066
    //   1116: ixor
    //   1117: ixor
    //   1118: lookupswitch default -> 1144, -1296317764 -> 1101, 44281033 -> 15617
    //   1144: iload #6
    //   1146: ldc2_w 2054477404
    //   1149: l2i
    //   1150: ldc_w -2055940516
    //   1153: ixor
    //   1154: iand
    //   1155: ior
    //   1156: getstatic Perryc.c : I
    //   1159: iflt -> 1173
    //   1162: ldc2_w -611957476
    //   1165: l2i
    //   1166: ldc_w -170367736
    //   1169: ixor
    //   1170: goto -> 1181
    //   1173: ldc2_w -526797507
    //   1176: l2i
    //   1177: ldc_w -1838528991
    //   1180: ixor
    //   1181: ldc2_w -1902453891
    //   1184: l2i
    //   1185: ldc_w -1161535331
    //   1188: ixor
    //   1189: ixor
    //   1190: lookupswitch default -> 15675, 436247540 -> 1173, 1185761532 -> 1216
    //   1216: istore #6
    //   1218: getstatic Perryc.c : I
    //   1221: iflt -> 1235
    //   1224: ldc2_w 903256379
    //   1227: l2i
    //   1228: ldc_w 1532300127
    //   1231: ixor
    //   1232: goto -> 1243
    //   1235: ldc2_w -1045927562
    //   1238: l2i
    //   1239: ldc_w 1644791204
    //   1242: ixor
    //   1243: ldc2_w 66723826
    //   1246: l2i
    //   1247: ldc_w -1854573134
    //   1250: ixor
    //   1251: ixor
    //   1252: lookupswitch default -> 1280, -1836176131 -> 1235, -66258908 -> 15769
    //   1280: aload_0
    //   1281: getstatic Perryc.0 : I
    //   1284: ifle -> 1298
    //   1287: ldc2_w -1382123138
    //   1290: l2i
    //   1291: ldc_w -1746498459
    //   1294: ixor
    //   1295: goto -> 1306
    //   1298: ldc2_w 356243270
    //   1301: l2i
    //   1302: ldc_w 991738207
    //   1305: ixor
    //   1306: ldc2_w 1794248196
    //   1309: l2i
    //   1310: ldc_w 213314735
    //   1313: ixor
    //   1314: ixor
    //   1315: lookupswitch default -> 1340, 209390214 -> 1298, 1547442096 -> 15941
    //   1340: getfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   1343: getstatic Perryc.c : I
    //   1346: iflt -> 1360
    //   1349: ldc2_w 1784108076
    //   1352: l2i
    //   1353: ldc_w 921035743
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w 689418062
    //   1363: l2i
    //   1364: ldc_w -838092723
    //   1367: ixor
    //   1368: ldc2_w 1556553774
    //   1371: l2i
    //   1372: ldc_w 909749516
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 15665, -1914529247 -> 1404, 910965457 -> 1360
    //   1404: astore #8
    //   1406: getstatic Perryc.c : I
    //   1409: iflt -> 1423
    //   1412: ldc2_w 1041249572
    //   1415: l2i
    //   1416: ldc_w -527477222
    //   1419: ixor
    //   1420: goto -> 1431
    //   1423: ldc2_w 176340535
    //   1426: l2i
    //   1427: ldc_w 1636054724
    //   1430: ixor
    //   1431: ldc2_w -1845412171
    //   1434: l2i
    //   1435: ldc_w -327528323
    //   1438: ixor
    //   1439: ixor
    //   1440: lookupswitch default -> 1468, -1595666954 -> 15599, 325155240 -> 1423
    //   1468: iload #6
    //   1470: ldc2_w 1793952993
    //   1473: l2i
    //   1474: ldc_w 1793953017
    //   1477: ixor
    //   1478: ishr
    //   1479: ldc2_w 88608634
    //   1482: l2i
    //   1483: ldc_w 88608645
    //   1486: ixor
    //   1487: iand
    //   1488: i2f
    //   1489: ldc_w 0.013174682
    //   1492: invokestatic floatToIntBits : (F)I
    //   1495: ldc_w 2133383839
    //   1498: ixor
    //   1499: invokestatic intBitsToFloat : (I)F
    //   1502: fdiv
    //   1503: getstatic Perryc.c : I
    //   1506: iflt -> 1520
    //   1509: ldc2_w -809628320
    //   1512: l2i
    //   1513: ldc_w -1934419433
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w 1483775475
    //   1523: l2i
    //   1524: ldc_w -895248470
    //   1527: ixor
    //   1528: ldc2_w 1020358135
    //   1531: l2i
    //   1532: ldc_w 563044742
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 15951, -1886583256 -> 1564, 1582504710 -> 1520
    //   1564: fstore #9
    //   1566: ldc2_w 964323295
    //   1569: l2i
    //   1570: ldc_w 964323295
    //   1573: ixor
    //   1574: getstatic Perryc.0 : I
    //   1577: ifle -> 1591
    //   1580: ldc2_w 390179139
    //   1583: l2i
    //   1584: ldc_w -424185557
    //   1587: ixor
    //   1588: goto -> 1599
    //   1591: ldc2_w 1959498790
    //   1594: l2i
    //   1595: ldc_w 1187012194
    //   1598: ixor
    //   1599: ldc2_w -349641630
    //   1602: l2i
    //   1603: ldc_w -977593518
    //   1606: ixor
    //   1607: ixor
    //   1608: lookupswitch default -> 1636, -547018920 -> 15577, 507657992 -> 1591
    //   1636: istore #10
    //   1638: ldc2_w -1792716535
    //   1641: l2i
    //   1642: ldc_w -1792716535
    //   1645: ixor
    //   1646: getstatic Perryc.1 : I
    //   1649: ifeq -> 1663
    //   1652: ldc2_w -2136720031
    //   1655: l2i
    //   1656: ldc_w -33936327
    //   1659: ixor
    //   1660: goto -> 1671
    //   1663: ldc2_w -1816740287
    //   1666: l2i
    //   1667: ldc_w -340732688
    //   1670: ixor
    //   1671: ldc2_w 1415861415
    //   1674: l2i
    //   1675: ldc_w -2125448787
    //   1678: ixor
    //   1679: ixor
    //   1680: lookupswitch default -> 15875, -1469416366 -> 1663, -1389230149 -> 1708
    //   1708: istore #11
    //   1710: ldc2_w 391554912
    //   1713: l2i
    //   1714: ldc_w 391554912
    //   1717: ixor
    //   1718: getstatic Perryc.1 : I
    //   1721: ifeq -> 1735
    //   1724: ldc2_w -1101104644
    //   1727: l2i
    //   1728: ldc_w -1842032223
    //   1731: ixor
    //   1732: goto -> 1743
    //   1735: ldc2_w -1918075465
    //   1738: l2i
    //   1739: ldc_w -1983476950
    //   1742: ixor
    //   1743: ldc2_w 2028739274
    //   1746: l2i
    //   1747: ldc_w 1151846099
    //   1750: ixor
    //   1751: ixor
    //   1752: lookupswitch default -> 1780, -646740832 -> 1735, 270627908 -> 15907
    //   1780: istore #12
    //   1782: ldc2_w -2005826918
    //   1785: l2i
    //   1786: ldc_w -2005826918
    //   1789: ixor
    //   1790: getstatic Perryc.0 : I
    //   1793: ifle -> 1807
    //   1796: ldc2_w 1866244522
    //   1799: l2i
    //   1800: ldc_w 1658868434
    //   1803: ixor
    //   1804: goto -> 1815
    //   1807: ldc2_w -2115176759
    //   1810: l2i
    //   1811: ldc_w -184583475
    //   1814: ixor
    //   1815: ldc2_w 696167438
    //   1818: l2i
    //   1819: ldc_w -536337480
    //   1822: ixor
    //   1823: ixor
    //   1824: lookupswitch default -> 1852, -995459890 -> 15855, 464494075 -> 1807
    //   1852: istore #13
    //   1854: ldc2_w 1385724564
    //   1857: l2i
    //   1858: ldc_w 1385724564
    //   1861: ixor
    //   1862: getstatic Perryc.0 : I
    //   1865: ifle -> 1879
    //   1868: ldc2_w 1216217382
    //   1871: l2i
    //   1872: ldc_w 264332087
    //   1875: ixor
    //   1876: goto -> 1887
    //   1879: ldc2_w -1746837586
    //   1882: l2i
    //   1883: ldc_w -6308831
    //   1886: ixor
    //   1887: ldc2_w -389777414
    //   1890: l2i
    //   1891: ldc_w 2051361600
    //   1894: ixor
    //   1895: ixor
    //   1896: lookupswitch default -> 15569, -717332821 -> 1879, -83894475 -> 1924
    //   1924: istore #14
    //   1926: ldc2_w 277143749
    //   1929: l2i
    //   1930: ldc_w 277143748
    //   1933: ixor
    //   1934: getstatic Perryc.c : I
    //   1937: iflt -> 1951
    //   1940: ldc2_w -1875649089
    //   1943: l2i
    //   1944: ldc_w 1502339489
    //   1947: ixor
    //   1948: goto -> 1959
    //   1951: ldc2_w -1869733960
    //   1954: l2i
    //   1955: ldc_w -1592196899
    //   1958: ixor
    //   1959: ldc2_w 1270132981
    //   1962: l2i
    //   1963: ldc_w 1587374746
    //   1966: ixor
    //   1967: ixor
    //   1968: lookupswitch default -> 15805, -594418063 -> 1951, 616482058 -> 1996
    //   1996: istore #15
    //   1998: getstatic Perryc.0 : I
    //   2001: ifle -> 2015
    //   2004: ldc2_w 685620386
    //   2007: l2i
    //   2008: ldc_w 259473674
    //   2011: ixor
    //   2012: goto -> 2023
    //   2015: ldc2_w -345642213
    //   2018: l2i
    //   2019: ldc_w -1917183318
    //   2022: ixor
    //   2023: ldc2_w 1580862614
    //   2026: l2i
    //   2027: ldc_w 243047492
    //   2030: ixor
    //   2031: ixor
    //   2032: lookupswitch default -> 2060, 2011983226 -> 15803, 2027849354 -> 2015
    //   2060: dload_2
    //   2061: ldc2_w 0.7616145519572075
    //   2064: invokestatic doubleToLongBits : (D)J
    //   2067: ldc2_w 9216721251997453174
    //   2070: lxor
    //   2071: invokestatic longBitsToDouble : (J)D
    //   2074: dmul
    //   2075: getstatic Perryc.0 : I
    //   2078: ifle -> 2092
    //   2081: ldc2_w -562755217
    //   2084: l2i
    //   2085: ldc_w -289488840
    //   2088: ixor
    //   2089: goto -> 2100
    //   2092: ldc2_w 939083515
    //   2095: l2i
    //   2096: ldc_w -873706647
    //   2099: ixor
    //   2100: ldc2_w 922762306
    //   2103: l2i
    //   2104: ldc_w -741025950
    //   2107: ixor
    //   2108: ixor
    //   2109: lookupswitch default -> 2136, -736157065 -> 15553, -108324688 -> 2092
    //   2136: dstore_2
    //   2137: getstatic Perryc.c : I
    //   2140: iflt -> 2154
    //   2143: ldc2_w 129265678
    //   2146: l2i
    //   2147: ldc_w 1156174779
    //   2150: ixor
    //   2151: goto -> 2162
    //   2154: ldc2_w -1113085077
    //   2157: l2i
    //   2158: ldc_w -2023637336
    //   2161: ixor
    //   2162: ldc2_w 1665561557
    //   2165: l2i
    //   2166: ldc_w 1868099312
    //   2169: ixor
    //   2170: ixor
    //   2171: lookupswitch default -> 2196, -1171397238 -> 2154, 1329806992 -> 15741
    //   2196: dload #4
    //   2198: ldc2_w 0.34262641913340836
    //   2201: invokestatic doubleToLongBits : (D)J
    //   2204: ldc2_w 9211529847199439845
    //   2207: lxor
    //   2208: invokestatic longBitsToDouble : (J)D
    //   2211: dmul
    //   2212: getstatic Perryc.c : I
    //   2215: iflt -> 2229
    //   2218: ldc2_w -934015203
    //   2221: l2i
    //   2222: ldc_w 1859727781
    //   2225: ixor
    //   2226: goto -> 2237
    //   2229: ldc2_w 464656939
    //   2232: l2i
    //   2233: ldc_w -976762344
    //   2236: ixor
    //   2237: ldc2_w 47066020
    //   2240: l2i
    //   2241: ldc_w -2072380566
    //   2244: ixor
    //   2245: ixor
    //   2246: lookupswitch default -> 15917, 540733046 -> 2229, 1489109245 -> 2272
    //   2272: dstore #4
    //   2274: getstatic Perryc.0 : I
    //   2277: ifle -> 2291
    //   2280: ldc2_w -698981675
    //   2283: l2i
    //   2284: ldc_w 725853248
    //   2287: ixor
    //   2288: goto -> 2299
    //   2291: ldc2_w -1278648956
    //   2294: l2i
    //   2295: ldc_w -647848290
    //   2298: ixor
    //   2299: ldc2_w -1275962324
    //   2302: l2i
    //   2303: ldc_w -592026265
    //   2306: ixor
    //   2307: ixor
    //   2308: lookupswitch default -> 2336, -1840119842 -> 15585, 332930345 -> 2291
    //   2336: iload #15
    //   2338: ifeq -> 2352
    //   2341: ldc2_w 834241158
    //   2344: l2i
    //   2345: ldc_w 1373823365
    //   2348: ixor
    //   2349: goto -> 2360
    //   2352: ldc2_w -452387728
    //   2355: l2i
    //   2356: ldc_w -2058190980
    //   2359: ixor
    //   2360: ldc2_w -97300483
    //   2363: l2i
    //   2364: ldc_w 660376569
    //   2367: ixor
    //   2368: ixor
    //   2369: tableswitch default -> 2341, -1120622841 -> 2392, -1120622840 -> 15475
    //   2392: getstatic Perryc.c : I
    //   2395: iflt -> 2409
    //   2398: ldc2_w 801052860
    //   2401: l2i
    //   2402: ldc_w -1298275066
    //   2405: ixor
    //   2406: goto -> 2417
    //   2409: ldc2_w 855461423
    //   2412: l2i
    //   2413: ldc_w 1014281680
    //   2416: ixor
    //   2417: ldc2_w 102952796
    //   2420: l2i
    //   2421: ldc_w -955439352
    //   2424: ixor
    //   2425: ixor
    //   2426: lookupswitch default -> 2452, -613796387 -> 2409, 1544369646 -> 15799
    //   2452: goto -> 2456
    //   2455: athrow
    //   2456: invokestatic glPushMatrix : ()V
    //   2459: goto -> 2463
    //   2462: athrow
    //   2463: ldc2_w 2.5686498085196003
    //   2466: invokestatic doubleToLongBits : (D)J
    //   2469: ldc2_w 9215645323132911404
    //   2472: lxor
    //   2473: invokestatic longBitsToDouble : (J)D
    //   2476: ldc2_w 11.603181289359425
    //   2479: invokestatic doubleToLongBits : (D)J
    //   2482: ldc2_w 9207386049084307255
    //   2485: lxor
    //   2486: invokestatic longBitsToDouble : (J)D
    //   2489: ldc2_w 2.5159684011636028
    //   2492: invokestatic doubleToLongBits : (D)J
    //   2495: ldc2_w 9215526695149642492
    //   2498: lxor
    //   2499: invokestatic longBitsToDouble : (J)D
    //   2502: getstatic Perryc.1 : I
    //   2505: ifeq -> 2519
    //   2508: ldc2_w -390128822
    //   2511: l2i
    //   2512: ldc_w 1190090823
    //   2515: ixor
    //   2516: goto -> 2527
    //   2519: ldc2_w 1749764018
    //   2522: l2i
    //   2523: ldc_w -322597888
    //   2526: ixor
    //   2527: ldc2_w -1654623796
    //   2530: l2i
    //   2531: ldc_w -635666041
    //   2534: ixor
    //   2535: ixor
    //   2536: lookupswitch default -> 15773, -1007535111 -> 2564, -382946490 -> 2519
    //   2564: goto -> 2568
    //   2567: athrow
    //   2568: invokestatic func_179139_a : (DDD)V
    //   2571: goto -> 2575
    //   2574: athrow
    //   2575: getstatic Perryc.c : I
    //   2578: iflt -> 2592
    //   2581: ldc2_w -1156807871
    //   2584: l2i
    //   2585: ldc_w -1023609600
    //   2588: ixor
    //   2589: goto -> 2600
    //   2592: ldc2_w 901984484
    //   2595: l2i
    //   2596: ldc_w 2052921381
    //   2599: ixor
    //   2600: ldc2_w -1086807877
    //   2603: l2i
    //   2604: ldc_w -309287382
    //   2607: ixor
    //   2608: ixor
    //   2609: lookupswitch default -> 2636, 727216336 -> 15657, 1562564662 -> 2592
    //   2636: goto -> 2640
    //   2639: athrow
    //   2640: invokestatic func_179147_l : ()V
    //   2643: goto -> 2647
    //   2646: athrow
    //   2647: ldc2_w 864003439
    //   2650: l2i
    //   2651: ldc_w 864003693
    //   2654: ixor
    //   2655: ldc2_w -1504836198
    //   2658: l2i
    //   2659: ldc_w -1504835943
    //   2662: ixor
    //   2663: getstatic Perryc.c : I
    //   2666: iflt -> 2680
    //   2669: ldc2_w 627493879
    //   2672: l2i
    //   2673: ldc_w -2131849144
    //   2676: ixor
    //   2677: goto -> 2688
    //   2680: ldc2_w 426065222
    //   2683: l2i
    //   2684: ldc_w -1298244850
    //   2687: ixor
    //   2688: ldc2_w 874817644
    //   2691: l2i
    //   2692: ldc_w 401682401
    //   2695: ixor
    //   2696: ixor
    //   2697: lookupswitch default -> 15697, -2040669134 -> 2680, -2010193467 -> 2724
    //   2724: goto -> 2728
    //   2727: athrow
    //   2728: invokestatic func_179112_b : (II)V
    //   2731: goto -> 2735
    //   2734: athrow
    //   2735: getstatic Perryc.0 : I
    //   2738: ifle -> 2752
    //   2741: ldc2_w 1282874067
    //   2744: l2i
    //   2745: ldc_w -1173142168
    //   2748: ixor
    //   2749: goto -> 2760
    //   2752: ldc2_w 2106337125
    //   2755: l2i
    //   2756: ldc_w 153571342
    //   2759: ixor
    //   2760: ldc2_w -1289224412
    //   2763: l2i
    //   2764: ldc_w -144683384
    //   2767: ixor
    //   2768: ixor
    //   2769: lookupswitch default -> 2796, -1306268137 -> 15623, -835901028 -> 2752
    //   2796: iload #6
    //   2798: ldc2_w 504910755
    //   2801: l2i
    //   2802: ldc_w 504910771
    //   2805: ixor
    //   2806: ishr
    //   2807: ldc2_w 248317584
    //   2810: l2i
    //   2811: ldc_w 248317551
    //   2814: ixor
    //   2815: iand
    //   2816: i2f
    //   2817: ldc_w 0.012913516
    //   2820: invokestatic floatToIntBits : (F)I
    //   2823: ldc_w 2133627702
    //   2826: ixor
    //   2827: invokestatic intBitsToFloat : (I)F
    //   2830: fdiv
    //   2831: getstatic Perryc.c : I
    //   2834: iflt -> 2848
    //   2837: ldc2_w -2107042992
    //   2840: l2i
    //   2841: ldc_w -1207000950
    //   2844: ixor
    //   2845: goto -> 2856
    //   2848: ldc2_w 1500821144
    //   2851: l2i
    //   2852: ldc_w 945262577
    //   2855: ixor
    //   2856: ldc2_w 29288528
    //   2859: l2i
    //   2860: ldc_w -1879973223
    //   2863: ixor
    //   2864: ixor
    //   2865: lookupswitch default -> 15651, -1272399597 -> 2848, -278121568 -> 2892
    //   2892: iload #6
    //   2894: ldc2_w 152549450
    //   2897: l2i
    //   2898: ldc_w 152549442
    //   2901: ixor
    //   2902: ishr
    //   2903: ldc2_w 927916850
    //   2906: l2i
    //   2907: ldc_w 927917005
    //   2910: ixor
    //   2911: iand
    //   2912: i2f
    //   2913: ldc_w 0.05977368
    //   2916: invokestatic floatToIntBits : (F)I
    //   2919: ldc_w 2114704703
    //   2922: ixor
    //   2923: invokestatic intBitsToFloat : (I)F
    //   2926: fdiv
    //   2927: getstatic Perryc.0 : I
    //   2930: ifle -> 2944
    //   2933: ldc2_w 1994164597
    //   2936: l2i
    //   2937: ldc_w -1802402426
    //   2940: ixor
    //   2941: goto -> 2952
    //   2944: ldc2_w 1527322647
    //   2947: l2i
    //   2948: ldc_w -334282288
    //   2951: ixor
    //   2952: ldc2_w -1612483128
    //   2955: l2i
    //   2956: ldc_w 777017076
    //   2959: ixor
    //   2960: ixor
    //   2961: lookupswitch default -> 2988, -1474325457 -> 2944, 1409167311 -> 15613
    //   2988: iload #6
    //   2990: ldc2_w 1328499496
    //   2993: l2i
    //   2994: ldc_w 1328499671
    //   2997: ixor
    //   2998: iand
    //   2999: i2f
    //   3000: ldc_w 0.054356646
    //   3003: invokestatic floatToIntBits : (F)I
    //   3006: ldc_w 2116134163
    //   3009: ixor
    //   3010: invokestatic intBitsToFloat : (I)F
    //   3013: fdiv
    //   3014: getstatic Perryc.1 : I
    //   3017: ifeq -> 3031
    //   3020: ldc2_w 482412506
    //   3023: l2i
    //   3024: ldc_w -348983247
    //   3027: ixor
    //   3028: goto -> 3039
    //   3031: ldc2_w -157815511
    //   3034: l2i
    //   3035: ldc_w -1126714182
    //   3038: ixor
    //   3039: ldc2_w -65028334
    //   3042: l2i
    //   3043: ldc_w 1832355659
    //   3046: ixor
    //   3047: ixor
    //   3048: lookupswitch default -> 3076, 772800230 -> 3031, 1725681586 -> 15933
    //   3076: fload #9
    //   3078: getstatic Perryc.1 : I
    //   3081: ifeq -> 3095
    //   3084: ldc2_w -808593211
    //   3087: l2i
    //   3088: ldc_w 1094894623
    //   3091: ixor
    //   3092: goto -> 3103
    //   3095: ldc2_w -1647999053
    //   3098: l2i
    //   3099: ldc_w -37261373
    //   3102: ixor
    //   3103: ldc2_w 431187717
    //   3106: l2i
    //   3107: ldc_w -181653313
    //   3110: ixor
    //   3111: ixor
    //   3112: lookupswitch default -> 3140, -999737266 -> 3095, 1645235040 -> 15565
    //   3140: goto -> 3144
    //   3143: athrow
    //   3144: invokestatic func_179131_c : (FFFF)V
    //   3147: goto -> 3151
    //   3150: athrow
    //   3151: getstatic Perryc.c : I
    //   3154: iflt -> 3168
    //   3157: ldc2_w 953881010
    //   3160: l2i
    //   3161: ldc_w 129052889
    //   3164: ixor
    //   3165: goto -> 3176
    //   3168: ldc2_w -1363612375
    //   3171: l2i
    //   3172: ldc_w -650999652
    //   3175: ixor
    //   3176: ldc2_w 17881805
    //   3179: l2i
    //   3180: ldc_w 1856211561
    //   3183: ixor
    //   3184: ixor
    //   3185: lookupswitch default -> 15721, 406402321 -> 3212, 1356427727 -> 3168
    //   3212: aload_1
    //   3213: getstatic Perryc.c : I
    //   3216: iflt -> 3230
    //   3219: ldc2_w 741259318
    //   3222: l2i
    //   3223: ldc_w 1921549902
    //   3226: ixor
    //   3227: goto -> 3238
    //   3230: ldc2_w -104802283
    //   3233: l2i
    //   3234: ldc_w -1850154769
    //   3237: ixor
    //   3238: ldc2_w -878323950
    //   3241: l2i
    //   3242: ldc_w 727441264
    //   3245: ixor
    //   3246: ixor
    //   3247: lookupswitch default -> 15913, -2004471656 -> 3272, -1101515238 -> 3230
    //   3272: goto -> 3276
    //   3275: athrow
    //   3276: invokevirtual length : ()I
    //   3279: goto -> 3283
    //   3282: athrow
    //   3283: getstatic Perryc.0 : I
    //   3286: ifle -> 3300
    //   3289: ldc2_w -1400910722
    //   3292: l2i
    //   3293: ldc_w 1691388715
    //   3296: ixor
    //   3297: goto -> 3308
    //   3300: ldc2_w -538082473
    //   3303: l2i
    //   3304: ldc_w 1583383139
    //   3307: ixor
    //   3308: ldc2_w -1289892091
    //   3311: l2i
    //   3312: ldc_w -2039046654
    //   3315: ixor
    //   3316: ixor
    //   3317: lookupswitch default -> 3344, -37480878 -> 15813, 1454450231 -> 3300
    //   3344: istore #16
    //   3346: getstatic Perryc.c : I
    //   3349: iflt -> 3363
    //   3352: ldc2_w -1750727396
    //   3355: l2i
    //   3356: ldc_w 1443679763
    //   3359: ixor
    //   3360: goto -> 3371
    //   3363: ldc2_w -1073185502
    //   3366: l2i
    //   3367: ldc_w -641898013
    //   3370: ixor
    //   3371: ldc2_w -307148087
    //   3374: l2i
    //   3375: ldc_w -1371524843
    //   3378: ixor
    //   3379: ixor
    //   3380: lookupswitch default -> 15877, -2107920173 -> 3363, 1514434333 -> 3408
    //   3408: goto -> 3412
    //   3411: athrow
    //   3412: invokestatic func_179098_w : ()V
    //   3415: goto -> 3419
    //   3418: athrow
    //   3419: getstatic Perryc.c : I
    //   3422: iflt -> 3436
    //   3425: ldc2_w -1527590489
    //   3428: l2i
    //   3429: ldc_w 314260531
    //   3432: ixor
    //   3433: goto -> 3444
    //   3436: ldc2_w 1663571456
    //   3439: l2i
    //   3440: ldc_w 1982409089
    //   3443: ixor
    //   3444: ldc2_w 1696892266
    //   3447: l2i
    //   3448: ldc_w 794202381
    //   3451: ixor
    //   3452: ixor
    //   3453: lookupswitch default -> 15701, -63178253 -> 3436, 1601383398 -> 3480
    //   3480: aload_0
    //   3481: getstatic Perryc.0 : I
    //   3484: ifle -> 3498
    //   3487: ldc2_w 1108832463
    //   3490: l2i
    //   3491: ldc_w 830975629
    //   3494: ixor
    //   3495: goto -> 3506
    //   3498: ldc2_w 2080266267
    //   3501: l2i
    //   3502: ldc_w -1632969418
    //   3505: ixor
    //   3506: ldc2_w -1996756898
    //   3509: l2i
    //   3510: ldc_w 2039262707
    //   3513: ixor
    //   3514: ixor
    //   3515: lookupswitch default -> 15699, -2098750481 -> 3498, 337887360 -> 3540
    //   3540: getfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   3543: getstatic Perryc.1 : I
    //   3546: ifeq -> 3560
    //   3549: ldc2_w 1127351114
    //   3552: l2i
    //   3553: ldc_w -24499605
    //   3556: ixor
    //   3557: goto -> 3568
    //   3560: ldc2_w 749779840
    //   3563: l2i
    //   3564: ldc_w 498338811
    //   3567: ixor
    //   3568: ldc2_w -175504718
    //   3571: l2i
    //   3572: ldc_w -1695979298
    //   3575: ixor
    //   3576: ixor
    //   3577: lookupswitch default -> 15829, -757382323 -> 3560, 1583864343 -> 3604
    //   3604: goto -> 3608
    //   3607: athrow
    //   3608: invokevirtual func_110552_b : ()I
    //   3611: goto -> 3615
    //   3614: athrow
    //   3615: getstatic Perryc.0 : I
    //   3618: ifle -> 3632
    //   3621: ldc2_w -1400420547
    //   3624: l2i
    //   3625: ldc_w -1094521416
    //   3628: ixor
    //   3629: goto -> 3640
    //   3632: ldc2_w 1242771756
    //   3635: l2i
    //   3636: ldc_w 1075773787
    //   3639: ixor
    //   3640: ldc2_w 903412127
    //   3643: l2i
    //   3644: ldc_w 328019197
    //   3647: ixor
    //   3648: ixor
    //   3649: lookupswitch default -> 15557, 744088853 -> 3676, 873496551 -> 3632
    //   3676: goto -> 3680
    //   3679: athrow
    //   3680: invokestatic func_179144_i : (I)V
    //   3683: goto -> 3687
    //   3686: athrow
    //   3687: ldc2_w -1333856983
    //   3690: l2i
    //   3691: ldc_w -1333856056
    //   3694: ixor
    //   3695: getstatic Perryc.c : I
    //   3698: iflt -> 3712
    //   3701: ldc2_w 658480902
    //   3704: l2i
    //   3705: ldc_w -920084775
    //   3708: ixor
    //   3709: goto -> 3720
    //   3712: ldc2_w -181342114
    //   3715: l2i
    //   3716: ldc_w -1655703528
    //   3719: ixor
    //   3720: ldc2_w 1696396048
    //   3723: l2i
    //   3724: ldc_w 946746226
    //   3727: ixor
    //   3728: ixor
    //   3729: lookupswitch default -> 3756, -1851249104 -> 3712, -1285176899 -> 15957
    //   3756: aload_0
    //   3757: getstatic Perryc.1 : I
    //   3760: ifeq -> 3774
    //   3763: ldc2_w -439975941
    //   3766: l2i
    //   3767: ldc_w 1769608113
    //   3770: ixor
    //   3771: goto -> 3782
    //   3774: ldc2_w 905693739
    //   3777: l2i
    //   3778: ldc_w -831116102
    //   3781: ixor
    //   3782: ldc2_w 1214130966
    //   3785: l2i
    //   3786: ldc_w 1380356561
    //   3789: ixor
    //   3790: ixor
    //   3791: lookupswitch default -> 15645, -1767582067 -> 3774, -510305194 -> 3816
    //   3816: getfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   3819: getstatic Perryc.0 : I
    //   3822: ifle -> 3836
    //   3825: ldc2_w -1236949020
    //   3828: l2i
    //   3829: ldc_w 733779885
    //   3832: ixor
    //   3833: goto -> 3844
    //   3836: ldc2_w 14967000
    //   3839: l2i
    //   3840: ldc_w 2062812102
    //   3843: ixor
    //   3844: ldc2_w 916093440
    //   3847: l2i
    //   3848: ldc_w 467111465
    //   3851: ixor
    //   3852: ixor
    //   3853: lookupswitch default -> 15619, -1330330528 -> 3836, 1465751351 -> 3880
    //   3880: goto -> 3884
    //   3883: athrow
    //   3884: invokevirtual func_110552_b : ()I
    //   3887: goto -> 3891
    //   3890: athrow
    //   3891: getstatic Perryc.1 : I
    //   3894: ifeq -> 3908
    //   3897: ldc2_w 29365945
    //   3900: l2i
    //   3901: ldc_w -1658594381
    //   3904: ixor
    //   3905: goto -> 3916
    //   3908: ldc2_w 234106413
    //   3911: l2i
    //   3912: ldc_w 744193883
    //   3915: ixor
    //   3916: ldc2_w 1283780791
    //   3919: l2i
    //   3920: ldc_w 1348190766
    //   3923: ixor
    //   3924: ixor
    //   3925: lookupswitch default -> 15859, -2143486061 -> 3908, 1030775791 -> 3952
    //   3952: goto -> 3956
    //   3955: athrow
    //   3956: invokestatic glBindTexture : (II)V
    //   3959: goto -> 3963
    //   3962: athrow
    //   3963: ldc2_w -2038192298
    //   3966: l2i
    //   3967: ldc_w -2038192298
    //   3970: ixor
    //   3971: getstatic Perryc.c : I
    //   3974: iflt -> 3988
    //   3977: ldc2_w -719327380
    //   3980: l2i
    //   3981: ldc_w -202583987
    //   3984: ixor
    //   3985: goto -> 3996
    //   3988: ldc2_w 1493890480
    //   3991: l2i
    //   3992: ldc_w -1287389907
    //   3995: ixor
    //   3996: ldc2_w -884960309
    //   3999: l2i
    //   4000: ldc_w 559795151
    //   4003: ixor
    //   4004: ixor
    //   4005: lookupswitch default -> 4032, -856791259 -> 15779, 2109787087 -> 3988
    //   4032: istore #17
    //   4034: getstatic Perryc.0 : I
    //   4037: ifle -> 4051
    //   4040: ldc2_w -1984115319
    //   4043: l2i
    //   4044: ldc_w 1978952079
    //   4047: ixor
    //   4048: goto -> 4059
    //   4051: ldc2_w -290760640
    //   4054: l2i
    //   4055: ldc_w -1648889935
    //   4058: ixor
    //   4059: ldc2_w -264920657
    //   4062: l2i
    //   4063: ldc_w 1421547989
    //   4066: ixor
    //   4067: ixor
    //   4068: lookupswitch default -> 15725, -678293621 -> 4096, 1489378428 -> 4051
    //   4096: iload #17
    //   4098: getstatic Perryc.0 : I
    //   4101: ifle -> 4115
    //   4104: ldc2_w -1151228908
    //   4107: l2i
    //   4108: ldc_w -93586450
    //   4111: ixor
    //   4112: goto -> 4123
    //   4115: ldc2_w -1795565074
    //   4118: l2i
    //   4119: ldc_w -224034180
    //   4122: ixor
    //   4123: ldc2_w -2119323432
    //   4126: l2i
    //   4127: ldc_w -667485985
    //   4130: ixor
    //   4131: ixor
    //   4132: lookupswitch default -> 4160, 383647661 -> 4115, 412162045 -> 15747
    //   4160: iload #16
    //   4162: if_icmpge -> 4176
    //   4165: ldc2_w -1936826139
    //   4168: l2i
    //   4169: ldc_w 1123191156
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w 1511157756
    //   4179: l2i
    //   4180: ldc_w -1804695956
    //   4183: ixor
    //   4184: ldc2_w 126580096
    //   4187: l2i
    //   4188: ldc_w -618662527
    //   4191: ixor
    //   4192: ixor
    //   4193: tableswitch default -> 4165, 317221264 -> 4216, 317221265 -> 15315
    //   4216: getstatic Perryc.0 : I
    //   4219: ifle -> 4233
    //   4222: ldc2_w 70561860
    //   4225: l2i
    //   4226: ldc_w 1900540041
    //   4229: ixor
    //   4230: goto -> 4241
    //   4233: ldc2_w 1765869842
    //   4236: l2i
    //   4237: ldc_w 159599631
    //   4240: ixor
    //   4241: ldc2_w -874895699
    //   4244: l2i
    //   4245: ldc_w -1182918053
    //   4248: ixor
    //   4249: ixor
    //   4250: lookupswitch default -> 4276, 131562555 -> 15807, 352639552 -> 4233
    //   4276: aload_1
    //   4277: getstatic Perryc.c : I
    //   4280: iflt -> 4294
    //   4283: ldc2_w 1502593945
    //   4286: l2i
    //   4287: ldc_w 1621246674
    //   4290: ixor
    //   4291: goto -> 4302
    //   4294: ldc2_w -2082096049
    //   4297: l2i
    //   4298: ldc_w 743521849
    //   4301: ixor
    //   4302: ldc2_w 326601986
    //   4305: l2i
    //   4306: ldc_w -1328135563
    //   4309: ixor
    //   4310: ixor
    //   4311: lookupswitch default -> 15783, -1702080964 -> 4294, 202722561 -> 4336
    //   4336: iload #17
    //   4338: getstatic Perryc.c : I
    //   4341: iflt -> 4355
    //   4344: ldc2_w 2123784567
    //   4347: l2i
    //   4348: ldc_w 1860713744
    //   4351: ixor
    //   4352: goto -> 4363
    //   4355: ldc2_w 184518567
    //   4358: l2i
    //   4359: ldc_w 671270183
    //   4362: ixor
    //   4363: ldc2_w -588418834
    //   4366: l2i
    //   4367: ldc_w 1612525118
    //   4370: ixor
    //   4371: ixor
    //   4372: lookupswitch default -> 15583, -1643307952 -> 4400, -1399979337 -> 4355
    //   4400: goto -> 4404
    //   4403: athrow
    //   4404: invokevirtual charAt : (I)C
    //   4407: goto -> 4411
    //   4410: athrow
    //   4411: getstatic Perryc.1 : I
    //   4414: ifeq -> 4428
    //   4417: ldc2_w 559686629
    //   4420: l2i
    //   4421: ldc_w 913018443
    //   4424: ixor
    //   4425: goto -> 4436
    //   4428: ldc2_w 334295238
    //   4431: l2i
    //   4432: ldc_w 1427836485
    //   4435: ixor
    //   4436: ldc2_w 1475463225
    //   4439: l2i
    //   4440: ldc_w -1982325093
    //   4443: ixor
    //   4444: ixor
    //   4445: lookupswitch default -> 4472, -1502782713 -> 4428, -920749300 -> 15811
    //   4472: istore #18
    //   4474: getstatic Perryc.0 : I
    //   4477: ifle -> 4491
    //   4480: ldc2_w 1390382212
    //   4483: l2i
    //   4484: ldc_w 12885817
    //   4487: ixor
    //   4488: goto -> 4499
    //   4491: ldc2_w -1542700891
    //   4494: l2i
    //   4495: ldc_w 363090297
    //   4498: ixor
    //   4499: ldc2_w -1565375039
    //   4502: l2i
    //   4503: ldc_w 1719055543
    //   4506: ixor
    //   4507: ixor
    //   4508: lookupswitch default -> 4536, -1981481284 -> 4491, -1763712309 -> 15731
    //   4536: iload #18
    //   4538: ldc2_w -1631453361
    //   4541: l2i
    //   4542: ldc_w -1631453208
    //   4545: ixor
    //   4546: if_icmpne -> 4560
    //   4549: ldc2_w -1594066939
    //   4552: l2i
    //   4553: ldc_w 1882690614
    //   4556: ixor
    //   4557: goto -> 4568
    //   4560: ldc2_w -1116529492
    //   4563: l2i
    //   4564: ldc_w 1840836764
    //   4567: ixor
    //   4568: ldc2_w 1774898491
    //   4571: l2i
    //   4572: ldc_w -317548023
    //   4575: ixor
    //   4576: ixor
    //   4577: tableswitch default -> 4549, 1410579201 -> 4600, 1410579202 -> 11768
    //   4600: getstatic Perryc.c : I
    //   4603: iflt -> 4617
    //   4606: ldc2_w -1753904005
    //   4609: l2i
    //   4610: ldc_w 694638795
    //   4613: ixor
    //   4614: goto -> 4625
    //   4617: ldc2_w 897684134
    //   4620: l2i
    //   4621: ldc_w -2002633103
    //   4624: ixor
    //   4625: ldc2_w 1915806934
    //   4628: l2i
    //   4629: ldc_w 2048053404
    //   4632: ixor
    //   4633: ixor
    //   4634: lookupswitch default -> 4660, -1238310662 -> 15693, 254797654 -> 4617
    //   4660: iload #17
    //   4662: getstatic Perryc.0 : I
    //   4665: ifle -> 4679
    //   4668: ldc2_w 2001996316
    //   4671: l2i
    //   4672: ldc_w -556662289
    //   4675: ixor
    //   4676: goto -> 4687
    //   4679: ldc2_w 240280643
    //   4682: l2i
    //   4683: ldc_w -199170089
    //   4686: ixor
    //   4687: ldc2_w -1746746528
    //   4690: l2i
    //   4691: ldc_w -1584965050
    //   4694: ixor
    //   4695: ixor
    //   4696: lookupswitch default -> 4724, -1612475691 -> 15871, -350643364 -> 4679
    //   4724: iload #16
    //   4726: if_icmpge -> 4740
    //   4729: ldc2_w -33842120
    //   4732: l2i
    //   4733: ldc_w 433283236
    //   4736: ixor
    //   4737: goto -> 4748
    //   4740: ldc2_w -244999798
    //   4743: l2i
    //   4744: ldc_w 357393673
    //   4747: ixor
    //   4748: ldc2_w 1373131767
    //   4751: l2i
    //   4752: ldc_w 352897444
    //   4755: ixor
    //   4756: ixor
    //   4757: tableswitch default -> 4729, -1594333489 -> 4780, -1594333488 -> 11768
    //   4780: ldc2_w -1008928939
    //   4783: l2i
    //   4784: ldc_w -1008928960
    //   4787: ixor
    //   4788: getstatic Perryc.0 : I
    //   4791: ifle -> 4805
    //   4794: ldc2_w 362794157
    //   4797: l2i
    //   4798: ldc_w 1707783829
    //   4801: ixor
    //   4802: goto -> 4813
    //   4805: ldc2_w 1468220436
    //   4808: l2i
    //   4809: ldc_w 1337073184
    //   4812: ixor
    //   4813: ldc2_w 643809033
    //   4816: l2i
    //   4817: ldc_w 241765564
    //   4820: ixor
    //   4821: ixor
    //   4822: lookupswitch default -> 15905, 805824897 -> 4848, 1482934669 -> 4805
    //   4848: istore #19
    //   4850: ldc_w '麞㍂黶䧣롾瀧ฯ屮☔ਥ匕բ性έ辔䛏퍤ꔌᄪ侣'
    //   4853: getstatic Perryc.c : I
    //   4856: iflt -> 4870
    //   4859: ldc2_w 946700949
    //   4862: l2i
    //   4863: ldc_w 2098203144
    //   4866: ixor
    //   4867: goto -> 4878
    //   4870: ldc2_w 1916125006
    //   4873: l2i
    //   4874: ldc_w 858177885
    //   4877: ixor
    //   4878: ldc2_w 1129955647
    //   4881: l2i
    //   4882: ldc_w 661393910
    //   4885: ixor
    //   4886: ixor
    //   4887: lookupswitch default -> 15781, 558389332 -> 4870, 623292122 -> 4912
    //   4912: goto -> 4916
    //   4915: athrow
    //   4916: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4919: goto -> 4923
    //   4922: athrow
    //   4923: getstatic Perryc.0 : I
    //   4926: ifle -> 4940
    //   4929: ldc2_w 92058687
    //   4932: l2i
    //   4933: ldc_w -1455459122
    //   4936: ixor
    //   4937: goto -> 4948
    //   4940: ldc2_w -748687099
    //   4943: l2i
    //   4944: ldc_w -78750148
    //   4947: ixor
    //   4948: ldc2_w 802613406
    //   4951: l2i
    //   4952: ldc_w 2117592484
    //   4955: ixor
    //   4956: ixor
    //   4957: lookupswitch default -> 15961, -39662133 -> 4940, 2045813251 -> 4984
    //   4984: aload_1
    //   4985: getstatic Perryc.1 : I
    //   4988: ifeq -> 5002
    //   4991: ldc2_w 1580430548
    //   4994: l2i
    //   4995: ldc_w 794043447
    //   4998: ixor
    //   4999: goto -> 5010
    //   5002: ldc2_w 11127631
    //   5005: l2i
    //   5006: ldc_w -1508822570
    //   5009: ixor
    //   5010: ldc2_w 304129844
    //   5013: l2i
    //   5014: ldc_w 2034886082
    //   5017: ixor
    //   5018: ixor
    //   5019: lookupswitch default -> 5044, -2103323420 -> 5002, 437129749 -> 15571
    //   5044: iload #17
    //   5046: ldc2_w 1921110704
    //   5049: l2i
    //   5050: ldc_w 1921110705
    //   5053: ixor
    //   5054: iadd
    //   5055: getstatic Perryc.0 : I
    //   5058: ifle -> 5072
    //   5061: ldc2_w 353992338
    //   5064: l2i
    //   5065: ldc_w 1048598618
    //   5068: ixor
    //   5069: goto -> 5080
    //   5072: ldc2_w -2076815245
    //   5075: l2i
    //   5076: ldc_w -681062413
    //   5079: ixor
    //   5080: ldc2_w -1759850574
    //   5083: l2i
    //   5084: ldc_w -843725850
    //   5087: ixor
    //   5088: ixor
    //   5089: lookupswitch default -> 5116, 933086366 -> 5072, 1899375260 -> 15817
    //   5116: goto -> 5120
    //   5119: athrow
    //   5120: invokevirtual charAt : (I)C
    //   5123: goto -> 5127
    //   5126: athrow
    //   5127: getstatic Perryc.c : I
    //   5130: iflt -> 5144
    //   5133: ldc2_w -1146952702
    //   5136: l2i
    //   5137: ldc_w -1160119753
    //   5140: ixor
    //   5141: goto -> 5152
    //   5144: ldc2_w -728220803
    //   5147: l2i
    //   5148: ldc_w -196321303
    //   5151: ixor
    //   5152: ldc2_w 836191731
    //   5155: l2i
    //   5156: ldc_w -904712883
    //   5159: ixor
    //   5160: ixor
    //   5161: lookupswitch default -> 15641, -619705302 -> 5188, -88115573 -> 5144
    //   5188: goto -> 5192
    //   5191: athrow
    //   5192: invokevirtual indexOf : (I)I
    //   5195: goto -> 5199
    //   5198: athrow
    //   5199: getstatic Perryc.c : I
    //   5202: iflt -> 5216
    //   5205: ldc2_w -69328907
    //   5208: l2i
    //   5209: ldc_w 789723029
    //   5212: ixor
    //   5213: goto -> 5224
    //   5216: ldc2_w 741573975
    //   5219: l2i
    //   5220: ldc_w 861570548
    //   5223: ixor
    //   5224: ldc2_w 104112095
    //   5227: l2i
    //   5228: ldc_w -889734867
    //   5231: ixor
    //   5232: ixor
    //   5233: lookupswitch default -> 5260, 403639954 -> 15667, 1559159013 -> 5216
    //   5260: istore #19
    //   5262: goto -> 5326
    //   5265: getstatic Perryc.1 : I
    //   5268: ifeq -> 5282
    //   5271: ldc2_w 985671249
    //   5274: l2i
    //   5275: ldc_w 1056417951
    //   5278: ixor
    //   5279: goto -> 5290
    //   5282: ldc2_w -1308294388
    //   5285: l2i
    //   5286: ldc_w 198640431
    //   5289: ixor
    //   5290: ldc2_w -1795624509
    //   5293: l2i
    //   5294: ldc_w 1999277181
    //   5297: ixor
    //   5298: ixor
    //   5299: lookupswitch default -> 15681, -404360336 -> 5282, 1509981597 -> 5324
    //   5324: astore #20
    //   5326: getstatic Perryc.0 : I
    //   5329: ifle -> 5343
    //   5332: ldc2_w -1626269452
    //   5335: l2i
    //   5336: ldc_w 1318651293
    //   5339: ixor
    //   5340: goto -> 5351
    //   5343: ldc2_w -910159663
    //   5346: l2i
    //   5347: ldc_w 1963864867
    //   5350: ixor
    //   5351: ldc2_w 954734309
    //   5354: l2i
    //   5355: ldc_w 961710137
    //   5358: ixor
    //   5359: ixor
    //   5360: lookupswitch default -> 5388, -875365632 -> 5343, -801995851 -> 15711
    //   5388: iload #19
    //   5390: ldc2_w 1697325009
    //   5393: l2i
    //   5394: ldc_w 1697324993
    //   5397: ixor
    //   5398: if_icmpge -> 5412
    //   5401: ldc2_w 1461304366
    //   5404: l2i
    //   5405: ldc_w 64034803
    //   5408: ixor
    //   5409: goto -> 5420
    //   5412: ldc2_w -570673526
    //   5415: l2i
    //   5416: ldc_w -1993040554
    //   5419: ixor
    //   5420: ldc2_w 1917169696
    //   5423: l2i
    //   5424: ldc_w -1734011389
    //   5427: ixor
    //   5428: ixor
    //   5429: tableswitch default -> 5401, -1104671234 -> 5452, -1104671233 -> 7370
    //   5452: ldc2_w -12880025
    //   5455: l2i
    //   5456: ldc_w -12880025
    //   5459: ixor
    //   5460: getstatic Perryc.c : I
    //   5463: iflt -> 5477
    //   5466: ldc2_w 286406986
    //   5469: l2i
    //   5470: ldc_w -984603957
    //   5473: ixor
    //   5474: goto -> 5485
    //   5477: ldc2_w 991189651
    //   5480: l2i
    //   5481: ldc_w -52923873
    //   5484: ixor
    //   5485: ldc2_w -435162533
    //   5488: l2i
    //   5489: ldc_w 1987996564
    //   5492: ixor
    //   5493: ixor
    //   5494: lookupswitch default -> 15835, 1144226382 -> 5477, 1472049475 -> 5520
    //   5520: istore #11
    //   5522: ldc2_w 552735107
    //   5525: l2i
    //   5526: ldc_w 552735107
    //   5529: ixor
    //   5530: getstatic Perryc.1 : I
    //   5533: ifeq -> 5547
    //   5536: ldc2_w 373126121
    //   5539: l2i
    //   5540: ldc_w 749210153
    //   5543: ixor
    //   5544: goto -> 5555
    //   5547: ldc2_w -885022834
    //   5550: l2i
    //   5551: ldc_w 366064728
    //   5554: ixor
    //   5555: ldc2_w -875111741
    //   5558: l2i
    //   5559: ldc_w -1078107361
    //   5562: ixor
    //   5563: ixor
    //   5564: lookupswitch default -> 15789, -1434086902 -> 5592, 1325318172 -> 5547
    //   5592: istore #12
    //   5594: ldc2_w -1140419526
    //   5597: l2i
    //   5598: ldc_w -1140419526
    //   5601: ixor
    //   5602: getstatic Perryc.0 : I
    //   5605: ifle -> 5619
    //   5608: ldc2_w 432607603
    //   5611: l2i
    //   5612: ldc_w 440223399
    //   5615: ixor
    //   5616: goto -> 5627
    //   5619: ldc2_w 1501515902
    //   5622: l2i
    //   5623: ldc_w -1158123064
    //   5626: ixor
    //   5627: ldc2_w 1490018292
    //   5630: l2i
    //   5631: ldc_w -736842020
    //   5634: ixor
    //   5635: ixor
    //   5636: lookupswitch default -> 5664, -1965595724 -> 5619, -1892735236 -> 15633
    //   5664: istore #10
    //   5666: ldc2_w 887842213
    //   5669: l2i
    //   5670: ldc_w 887842213
    //   5673: ixor
    //   5674: getstatic Perryc.c : I
    //   5677: iflt -> 5691
    //   5680: ldc2_w -2028605474
    //   5683: l2i
    //   5684: ldc_w -802122211
    //   5687: ixor
    //   5688: goto -> 5699
    //   5691: ldc2_w 452767479
    //   5694: l2i
    //   5695: ldc_w -2083221460
    //   5698: ixor
    //   5699: ldc2_w 607616400
    //   5702: l2i
    //   5703: ldc_w 2058029287
    //   5706: ixor
    //   5707: ixor
    //   5708: lookupswitch default -> 15809, -944485460 -> 5736, 163122356 -> 5691
    //   5736: istore #14
    //   5738: ldc2_w -1419544798
    //   5741: l2i
    //   5742: ldc_w -1419544798
    //   5745: ixor
    //   5746: getstatic Perryc.1 : I
    //   5749: ifeq -> 5763
    //   5752: ldc2_w -1747915558
    //   5755: l2i
    //   5756: ldc_w 395241972
    //   5759: ixor
    //   5760: goto -> 5771
    //   5763: ldc2_w 506057006
    //   5766: l2i
    //   5767: ldc_w -1366267343
    //   5770: ixor
    //   5771: ldc2_w 614977864
    //   5774: l2i
    //   5775: ldc_w -1569578316
    //   5778: ixor
    //   5779: ixor
    //   5780: lookupswitch default -> 15945, 109835986 -> 5763, 913066211 -> 5808
    //   5808: istore #13
    //   5810: getstatic Perryc.0 : I
    //   5813: ifle -> 5827
    //   5816: ldc2_w 1532058917
    //   5819: l2i
    //   5820: ldc_w 1861332530
    //   5823: ixor
    //   5824: goto -> 5835
    //   5827: ldc2_w 425232707
    //   5830: l2i
    //   5831: ldc_w 564091566
    //   5834: ixor
    //   5835: ldc2_w -60343590
    //   5838: l2i
    //   5839: ldc_w -784960169
    //   5842: ixor
    //   5843: ixor
    //   5844: lookupswitch default -> 15713, 362191968 -> 5872, 418495642 -> 5827
    //   5872: aload_0
    //   5873: getstatic Perryc.c : I
    //   5876: iflt -> 5890
    //   5879: ldc2_w -1273690454
    //   5882: l2i
    //   5883: ldc_w 373755126
    //   5886: ixor
    //   5887: goto -> 5898
    //   5890: ldc2_w 2012873483
    //   5893: l2i
    //   5894: ldc_w -69309978
    //   5897: ixor
    //   5898: ldc2_w 1102383021
    //   5901: l2i
    //   5902: ldc_w -2145403602
    //   5905: ixor
    //   5906: ixor
    //   5907: lookupswitch default -> 15771, 1301205102 -> 5932, 1677242591 -> 5890
    //   5932: getfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   5935: getstatic Perryc.0 : I
    //   5938: ifle -> 5952
    //   5941: ldc2_w 1204017834
    //   5944: l2i
    //   5945: ldc_w -352629046
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w -1619477731
    //   5955: l2i
    //   5956: ldc_w -1477971840
    //   5959: ixor
    //   5960: ldc2_w -1433417860
    //   5963: l2i
    //   5964: ldc_w -1015102692
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 5996, -993423360 -> 15851, -534057533 -> 5952
    //   5996: goto -> 6000
    //   5999: athrow
    //   6000: invokevirtual func_110552_b : ()I
    //   6003: goto -> 6007
    //   6006: athrow
    //   6007: getstatic Perryc.c : I
    //   6010: iflt -> 6024
    //   6013: ldc2_w -2010135314
    //   6016: l2i
    //   6017: ldc_w -915633711
    //   6020: ixor
    //   6021: goto -> 6032
    //   6024: ldc2_w -59169534
    //   6027: l2i
    //   6028: ldc_w -1833417714
    //   6031: ixor
    //   6032: ldc2_w 626898426
    //   6035: l2i
    //   6036: ldc_w 1202132179
    //   6039: ixor
    //   6040: ixor
    //   6041: lookupswitch default -> 15841, 205242405 -> 6068, 599387158 -> 6024
    //   6068: goto -> 6072
    //   6071: athrow
    //   6072: invokestatic func_179144_i : (I)V
    //   6075: goto -> 6079
    //   6078: athrow
    //   6079: getstatic Perryc.1 : I
    //   6082: ifeq -> 6096
    //   6085: ldc2_w 842753415
    //   6088: l2i
    //   6089: ldc_w 1455666276
    //   6092: ixor
    //   6093: goto -> 6104
    //   6096: ldc2_w -1708394912
    //   6099: l2i
    //   6100: ldc_w -1662600653
    //   6103: ixor
    //   6104: ldc2_w -1508976915
    //   6107: l2i
    //   6108: ldc_w 2089794500
    //   6111: ixor
    //   6112: ixor
    //   6113: lookupswitch default -> 6140, -1600075666 -> 6096, -1099318070 -> 15775
    //   6140: aload_0
    //   6141: getstatic Perryc.0 : I
    //   6144: ifle -> 6158
    //   6147: ldc2_w -2091402007
    //   6150: l2i
    //   6151: ldc_w 605140850
    //   6154: ixor
    //   6155: goto -> 6166
    //   6158: ldc2_w -1035933990
    //   6161: l2i
    //   6162: ldc_w -2072974116
    //   6165: ixor
    //   6166: ldc2_w -1948909580
    //   6169: l2i
    //   6170: ldc_w 969750845
    //   6173: ixor
    //   6174: ixor
    //   6175: lookupswitch default -> 15757, -198652721 -> 6200, 358534482 -> 6158
    //   6200: getfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   6203: getstatic Perryc.0 : I
    //   6206: ifle -> 6220
    //   6209: ldc2_w -131052153
    //   6212: l2i
    //   6213: ldc_w 1644009498
    //   6216: ixor
    //   6217: goto -> 6228
    //   6220: ldc2_w 912771642
    //   6223: l2i
    //   6224: ldc_w -2087417190
    //   6227: ixor
    //   6228: ldc2_w 557028640
    //   6231: l2i
    //   6232: ldc_w -1933306424
    //   6235: ixor
    //   6236: ixor
    //   6237: lookupswitch default -> 6264, 876238197 -> 15889, 1638679458 -> 6220
    //   6264: astore #8
    //   6266: getstatic Perryc.c : I
    //   6269: iflt -> 6283
    //   6272: ldc2_w -1603135123
    //   6275: l2i
    //   6276: ldc_w 713468056
    //   6279: ixor
    //   6280: goto -> 6291
    //   6283: ldc2_w 1208767344
    //   6286: l2i
    //   6287: ldc_w -2046225835
    //   6290: ixor
    //   6291: ldc2_w 1680298364
    //   6294: l2i
    //   6295: ldc_w 1619965631
    //   6298: ixor
    //   6299: ixor
    //   6300: lookupswitch default -> 6328, -1906485706 -> 15673, -4996886 -> 6283
    //   6328: iload #19
    //   6330: iflt -> 6344
    //   6333: ldc2_w -519508575
    //   6336: l2i
    //   6337: ldc_w 220598545
    //   6340: ixor
    //   6341: goto -> 6352
    //   6344: ldc2_w 723958319
    //   6347: l2i
    //   6348: ldc_w -955758952
    //   6351: ixor
    //   6352: ldc2_w -365657301
    //   6355: l2i
    //   6356: ldc_w 874408848
    //   6359: ixor
    //   6360: ixor
    //   6361: tableswitch default -> 6333, 839128075 -> 6384, 839128076 -> 6508
    //   6384: getstatic Perryc.c : I
    //   6387: iflt -> 6401
    //   6390: ldc2_w 607024626
    //   6393: l2i
    //   6394: ldc_w -1349264630
    //   6397: ixor
    //   6398: goto -> 6409
    //   6401: ldc2_w -353498492
    //   6404: l2i
    //   6405: ldc_w -1596313382
    //   6408: ixor
    //   6409: ldc2_w -1088092692
    //   6412: l2i
    //   6413: ldc_w 526368716
    //   6416: ixor
    //   6417: ixor
    //   6418: lookupswitch default -> 15857, -363954050 -> 6444, 734467288 -> 6401
    //   6444: iload #19
    //   6446: ldc2_w -1256531741
    //   6449: l2i
    //   6450: ldc_w -1256531732
    //   6453: ixor
    //   6454: if_icmple -> 6468
    //   6457: ldc2_w -193974635
    //   6460: l2i
    //   6461: ldc_w -812622017
    //   6464: ixor
    //   6465: goto -> 6476
    //   6468: ldc2_w 602088891
    //   6471: l2i
    //   6472: ldc_w 402871314
    //   6475: ixor
    //   6476: ldc2_w 570512185
    //   6479: l2i
    //   6480: ldc_w -1190719250
    //   6483: ixor
    //   6484: ixor
    //   6485: tableswitch default -> 6457, -1595526531 -> 6508, -1595526530 -> 6578
    //   6508: ldc2_w -2017308987
    //   6511: l2i
    //   6512: ldc_w -2017308982
    //   6515: ixor
    //   6516: getstatic Perryc.1 : I
    //   6519: ifeq -> 6533
    //   6522: ldc2_w -1025121956
    //   6525: l2i
    //   6526: ldc_w 619230147
    //   6529: ixor
    //   6530: goto -> 6541
    //   6533: ldc2_w 106389543
    //   6536: l2i
    //   6537: ldc_w -1913688749
    //   6540: ixor
    //   6541: ldc2_w -1106897495
    //   6544: l2i
    //   6545: ldc_w 1966300382
    //   6548: ixor
    //   6549: ixor
    //   6550: lookupswitch default -> 6576, -828566454 -> 6533, 758651880 -> 15911
    //   6576: istore #19
    //   6578: getstatic Perryc.c : I
    //   6581: iflt -> 6595
    //   6584: ldc2_w 1998215110
    //   6587: l2i
    //   6588: ldc_w 888365732
    //   6591: ixor
    //   6592: goto -> 6603
    //   6595: ldc2_w -613972099
    //   6598: l2i
    //   6599: ldc_w -1022980329
    //   6602: ixor
    //   6603: ldc2_w -367315070
    //   6606: l2i
    //   6607: ldc_w 1092021142
    //   6610: ixor
    //   6611: ixor
    //   6612: lookupswitch default -> 6640, -387651210 -> 15949, 90736044 -> 6595
    //   6640: iload #7
    //   6642: ifeq -> 6656
    //   6645: ldc2_w 2111899213
    //   6648: l2i
    //   6649: ldc_w 1714086616
    //   6652: ixor
    //   6653: goto -> 6664
    //   6656: ldc2_w -1806508557
    //   6659: l2i
    //   6660: ldc_w -1885783707
    //   6663: ixor
    //   6664: ldc2_w 1458674874
    //   6667: l2i
    //   6668: ldc_w -91224602
    //   6671: ixor
    //   6672: ixor
    //   6673: tableswitch default -> 6645, -1213563447 -> 6696, -1213563446 -> 6699
    //   6696: iinc #19, 16
    //   6699: getstatic Perryc.c : I
    //   6702: iflt -> 6716
    //   6705: ldc2_w 1641574569
    //   6708: l2i
    //   6709: ldc_w 1926624211
    //   6712: ixor
    //   6713: goto -> 6724
    //   6716: ldc2_w 1470788518
    //   6719: l2i
    //   6720: ldc_w 1765905630
    //   6723: ixor
    //   6724: ldc2_w 109215266
    //   6727: l2i
    //   6728: ldc_w 431422567
    //   6731: ixor
    //   6732: ixor
    //   6733: lookupswitch default -> 6760, -605591547 -> 6716, 205062463 -> 15853
    //   6760: aload_0
    //   6761: getstatic Perryc.0 : I
    //   6764: ifle -> 6778
    //   6767: ldc2_w -1435832140
    //   6770: l2i
    //   6771: ldc_w 2010024755
    //   6774: ixor
    //   6775: goto -> 6786
    //   6778: ldc2_w 587662882
    //   6781: l2i
    //   6782: ldc_w 1546897503
    //   6785: ixor
    //   6786: ldc2_w 1825018041
    //   6789: l2i
    //   6790: ldc_w 1099341358
    //   6793: ixor
    //   6794: ixor
    //   6795: lookupswitch default -> 6820, -1216164154 -> 6778, -253397744 -> 15777
    //   6820: getfield colorCode : [I
    //   6823: getstatic Perryc.c : I
    //   6826: iflt -> 6840
    //   6829: ldc2_w 1923727900
    //   6832: l2i
    //   6833: ldc_w -1165393206
    //   6836: ixor
    //   6837: goto -> 6848
    //   6840: ldc2_w 1004487487
    //   6843: l2i
    //   6844: ldc_w -1785642076
    //   6847: ixor
    //   6848: ldc2_w 1280512042
    //   6851: l2i
    //   6852: ldc_w 1946701119
    //   6855: ixor
    //   6856: ixor
    //   6857: lookupswitch default -> 6884, -260366909 -> 15597, 1845264938 -> 6840
    //   6884: iload #19
    //   6886: iaload
    //   6887: getstatic Perryc.0 : I
    //   6890: ifle -> 6904
    //   6893: ldc2_w -296851195
    //   6896: l2i
    //   6897: ldc_w 234741652
    //   6900: ixor
    //   6901: goto -> 6912
    //   6904: ldc2_w 1787231829
    //   6907: l2i
    //   6908: ldc_w -1903882694
    //   6911: ixor
    //   6912: ldc2_w 1612668240
    //   6915: l2i
    //   6916: ldc_w -1515599730
    //   6919: ixor
    //   6920: ixor
    //   6921: lookupswitch default -> 15677, 565536177 -> 6948, 637870927 -> 6904
    //   6948: istore #20
    //   6950: getstatic Perryc.1 : I
    //   6953: ifeq -> 6967
    //   6956: ldc2_w 510400273
    //   6959: l2i
    //   6960: ldc_w 1448330032
    //   6963: ixor
    //   6964: goto -> 6975
    //   6967: ldc2_w -1693096264
    //   6970: l2i
    //   6971: ldc_w -1751164995
    //   6974: ixor
    //   6975: ldc2_w -714088240
    //   6978: l2i
    //   6979: ldc_w -1383822481
    //   6982: ixor
    //   6983: ixor
    //   6984: lookupswitch default -> 7012, 16751614 -> 6967, 819249054 -> 15823
    //   7012: iload #20
    //   7014: ldc2_w 893473936
    //   7017: l2i
    //   7018: ldc_w 893473920
    //   7021: ixor
    //   7022: ishr
    //   7023: ldc2_w 1174175834
    //   7026: l2i
    //   7027: ldc_w 1174175909
    //   7030: ixor
    //   7031: iand
    //   7032: i2f
    //   7033: ldc_w 0.008889606
    //   7036: invokestatic floatToIntBits : (F)I
    //   7039: ldc_w 2137957814
    //   7042: ixor
    //   7043: invokestatic intBitsToFloat : (I)F
    //   7046: fdiv
    //   7047: getstatic Perryc.1 : I
    //   7050: ifeq -> 7064
    //   7053: ldc2_w -1375881808
    //   7056: l2i
    //   7057: ldc_w 1539115905
    //   7060: ixor
    //   7061: goto -> 7072
    //   7064: ldc2_w 1879672493
    //   7067: l2i
    //   7068: ldc_w -1120630177
    //   7071: ixor
    //   7072: ldc2_w -1247591386
    //   7075: l2i
    //   7076: ldc_w -1859038154
    //   7079: ixor
    //   7080: ixor
    //   7081: lookupswitch default -> 15795, -757944799 -> 7064, -374399774 -> 7108
    //   7108: iload #20
    //   7110: ldc2_w 439264204
    //   7113: l2i
    //   7114: ldc_w 439264196
    //   7117: ixor
    //   7118: ishr
    //   7119: ldc2_w 1028345544
    //   7122: l2i
    //   7123: ldc_w 1028345399
    //   7126: ixor
    //   7127: iand
    //   7128: i2f
    //   7129: ldc_w 0.101034366
    //   7132: invokestatic floatToIntBits : (F)I
    //   7135: ldc_w 2125589275
    //   7138: ixor
    //   7139: invokestatic intBitsToFloat : (I)F
    //   7142: fdiv
    //   7143: getstatic Perryc.c : I
    //   7146: iflt -> 7160
    //   7149: ldc2_w 908609554
    //   7152: l2i
    //   7153: ldc_w 723821818
    //   7156: ixor
    //   7157: goto -> 7168
    //   7160: ldc2_w -1324848231
    //   7163: l2i
    //   7164: ldc_w 1877238618
    //   7167: ixor
    //   7168: ldc2_w -703574330
    //   7171: l2i
    //   7172: ldc_w -91308198
    //   7175: ixor
    //   7176: ixor
    //   7177: lookupswitch default -> 7204, -1421715767 -> 7160, 831659380 -> 15625
    //   7204: iload #20
    //   7206: ldc2_w 1180696871
    //   7209: l2i
    //   7210: ldc_w 1180697048
    //   7213: ixor
    //   7214: iand
    //   7215: i2f
    //   7216: ldc_w 0.0109442575
    //   7219: invokestatic floatToIntBits : (F)I
    //   7222: ldc_w 2135707531
    //   7225: ixor
    //   7226: invokestatic intBitsToFloat : (I)F
    //   7229: fdiv
    //   7230: getstatic Perryc.c : I
    //   7233: iflt -> 7247
    //   7236: ldc2_w -45587189
    //   7239: l2i
    //   7240: ldc_w 533040632
    //   7243: ixor
    //   7244: goto -> 7255
    //   7247: ldc2_w -1971472994
    //   7250: l2i
    //   7251: ldc_w 2094053346
    //   7254: ixor
    //   7255: ldc2_w -2050790076
    //   7258: l2i
    //   7259: ldc_w 346985667
    //   7262: ixor
    //   7263: ixor
    //   7264: lookupswitch default -> 7292, 1732265406 -> 7247, 1944064372 -> 15691
    //   7292: fload #9
    //   7294: getstatic Perryc.1 : I
    //   7297: ifeq -> 7311
    //   7300: ldc2_w -594771221
    //   7303: l2i
    //   7304: ldc_w -282551187
    //   7307: ixor
    //   7308: goto -> 7319
    //   7311: ldc2_w 1933269195
    //   7314: l2i
    //   7315: ldc_w -54130059
    //   7318: ixor
    //   7319: ldc2_w -1271258600
    //   7322: l2i
    //   7323: ldc_w 541588045
    //   7326: ixor
    //   7327: ixor
    //   7328: lookupswitch default -> 15921, -1478900013 -> 7311, 461409003 -> 7356
    //   7356: goto -> 7360
    //   7359: athrow
    //   7360: invokestatic func_179131_c : (FFFF)V
    //   7363: goto -> 7367
    //   7366: athrow
    //   7367: goto -> 11762
    //   7370: getstatic Perryc.0 : I
    //   7373: ifle -> 7387
    //   7376: ldc2_w 1813172019
    //   7379: l2i
    //   7380: ldc_w 1903007285
    //   7383: ixor
    //   7384: goto -> 7395
    //   7387: ldc2_w -21913454
    //   7390: l2i
    //   7391: ldc_w -1465686831
    //   7394: ixor
    //   7395: ldc2_w 367171742
    //   7398: l2i
    //   7399: ldc_w -1351618392
    //   7402: ixor
    //   7403: ixor
    //   7404: lookupswitch default -> 7432, -1477299920 -> 15761, 484866751 -> 7387
    //   7432: iload #19
    //   7434: ldc2_w -1569881072
    //   7437: l2i
    //   7438: ldc_w -1569881088
    //   7441: ixor
    //   7442: if_icmpne -> 7456
    //   7445: ldc2_w 1313908713
    //   7448: l2i
    //   7449: ldc_w -2066693910
    //   7452: ixor
    //   7453: goto -> 7464
    //   7456: ldc2_w -1450053544
    //   7459: l2i
    //   7460: ldc_w 1662097242
    //   7463: ixor
    //   7464: ldc2_w 634095384
    //   7467: l2i
    //   7468: ldc_w 2035029349
    //   7471: ixor
    //   7472: ixor
    //   7473: tableswitch default -> 7445, -1777863298 -> 7496, -1777863297 -> 7569
    //   7496: ldc2_w -1525262678
    //   7499: l2i
    //   7500: ldc_w -1525262677
    //   7503: ixor
    //   7504: getstatic Perryc.1 : I
    //   7507: ifeq -> 7521
    //   7510: ldc2_w 105697713
    //   7513: l2i
    //   7514: ldc_w -925154637
    //   7517: ixor
    //   7518: goto -> 7529
    //   7521: ldc2_w -815172754
    //   7524: l2i
    //   7525: ldc_w -1491328815
    //   7528: ixor
    //   7529: ldc2_w -48232966
    //   7532: l2i
    //   7533: ldc_w 700036400
    //   7536: ixor
    //   7537: ixor
    //   7538: lookupswitch default -> 15891, -1125325963 -> 7564, 437134280 -> 7521
    //   7564: istore #10
    //   7566: goto -> 11762
    //   7569: getstatic Perryc.c : I
    //   7572: iflt -> 7586
    //   7575: ldc2_w -1907727815
    //   7578: l2i
    //   7579: ldc_w 815466335
    //   7582: ixor
    //   7583: goto -> 7594
    //   7586: ldc2_w -685663068
    //   7589: l2i
    //   7590: ldc_w -1969293588
    //   7593: ixor
    //   7594: ldc2_w -1734272584
    //   7597: l2i
    //   7598: ldc_w -324034303
    //   7601: ixor
    //   7602: ixor
    //   7603: lookupswitch default -> 15863, -891298337 -> 7586, 699519729 -> 7628
    //   7628: iload #19
    //   7630: ldc2_w -1123939766
    //   7633: l2i
    //   7634: ldc_w -1123939749
    //   7637: ixor
    //   7638: if_icmpne -> 7652
    //   7641: ldc2_w 1123508762
    //   7644: l2i
    //   7645: ldc_w -435796933
    //   7648: ixor
    //   7649: goto -> 7660
    //   7652: ldc2_w 1339058375
    //   7655: l2i
    //   7656: ldc_w -350138651
    //   7659: ixor
    //   7660: ldc2_w 139070306
    //   7663: l2i
    //   7664: ldc_w 1754333786
    //   7667: ixor
    //   7668: ixor
    //   7669: tableswitch default -> 7641, -1003868391 -> 7692, -1003868390 -> 8793
    //   7692: ldc2_w 760786787
    //   7695: l2i
    //   7696: ldc_w 760786786
    //   7699: ixor
    //   7700: getstatic Perryc.c : I
    //   7703: iflt -> 7717
    //   7706: ldc2_w 838936562
    //   7709: l2i
    //   7710: ldc_w 151336214
    //   7713: ixor
    //   7714: goto -> 7725
    //   7717: ldc2_w -1318485384
    //   7720: l2i
    //   7721: ldc_w 1083100650
    //   7724: ixor
    //   7725: ldc2_w -952192519
    //   7728: l2i
    //   7729: ldc_w 278074208
    //   7732: ixor
    //   7733: ixor
    //   7734: lookupswitch default -> 15695, -324423555 -> 7717, 642444555 -> 7760
    //   7760: istore #11
    //   7762: getstatic Perryc.c : I
    //   7765: iflt -> 7779
    //   7768: ldc2_w 1964334981
    //   7771: l2i
    //   7772: ldc_w -1001350361
    //   7775: ixor
    //   7776: goto -> 7787
    //   7779: ldc2_w -1541093376
    //   7782: l2i
    //   7783: ldc_w 623073872
    //   7786: ixor
    //   7787: ldc2_w 1459696456
    //   7790: l2i
    //   7791: ldc_w -1826501215
    //   7794: ixor
    //   7795: ixor
    //   7796: lookupswitch default -> 7824, -1158003107 -> 7779, 1969568331 -> 15679
    //   7824: iload #12
    //   7826: ifeq -> 7840
    //   7829: ldc2_w 218714322
    //   7832: l2i
    //   7833: ldc_w 919951273
    //   7836: ixor
    //   7837: goto -> 7848
    //   7840: ldc2_w -70668156
    //   7843: l2i
    //   7844: ldc_w -1072318466
    //   7847: ixor
    //   7848: ldc2_w -1277083618
    //   7851: l2i
    //   7852: ldc_w 897997981
    //   7855: ixor
    //   7856: ixor
    //   7857: tableswitch default -> 7829, -1111811080 -> 7880, -1111811079 -> 8337
    //   7880: getstatic Perryc.0 : I
    //   7883: ifle -> 7897
    //   7886: ldc2_w 371558577
    //   7889: l2i
    //   7890: ldc_w -482509398
    //   7893: ixor
    //   7894: goto -> 7905
    //   7897: ldc2_w 167986281
    //   7900: l2i
    //   7901: ldc_w -1221373987
    //   7904: ixor
    //   7905: ldc2_w -571940420
    //   7908: l2i
    //   7909: ldc_w -164329609
    //   7912: ixor
    //   7913: ixor
    //   7914: lookupswitch default -> 7940, -1204020320 -> 7897, -557542448 -> 15893
    //   7940: aload_0
    //   7941: getstatic Perryc.1 : I
    //   7944: ifeq -> 7958
    //   7947: ldc2_w -1949502401
    //   7950: l2i
    //   7951: ldc_w -1204483325
    //   7954: ixor
    //   7955: goto -> 7966
    //   7958: ldc2_w -358703822
    //   7961: l2i
    //   7962: ldc_w -1921149565
    //   7965: ixor
    //   7966: ldc2_w -1224620967
    //   7969: l2i
    //   7970: ldc_w -57488813
    //   7973: ixor
    //   7974: ixor
    //   7975: lookupswitch default -> 15897, 745539259 -> 8000, 2020274486 -> 7958
    //   8000: getfield texItalicBold : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   8003: getstatic Perryc.0 : I
    //   8006: ifle -> 8020
    //   8009: ldc2_w 1967129492
    //   8012: l2i
    //   8013: ldc_w 655657409
    //   8016: ixor
    //   8017: goto -> 8028
    //   8020: ldc2_w -555106803
    //   8023: l2i
    //   8024: ldc_w -1532498017
    //   8027: ixor
    //   8028: ldc2_w -1474314549
    //   8031: l2i
    //   8032: ldc_w 1730553162
    //   8035: ixor
    //   8036: ixor
    //   8037: lookupswitch default -> 15663, -1653796396 -> 8020, -1250440685 -> 8064
    //   8064: goto -> 8068
    //   8067: athrow
    //   8068: invokevirtual func_110552_b : ()I
    //   8071: goto -> 8075
    //   8074: athrow
    //   8075: getstatic Perryc.0 : I
    //   8078: ifle -> 8092
    //   8081: ldc2_w 353424762
    //   8084: l2i
    //   8085: ldc_w 1308618742
    //   8088: ixor
    //   8089: goto -> 8100
    //   8092: ldc2_w 1435476990
    //   8095: l2i
    //   8096: ldc_w 104660564
    //   8099: ixor
    //   8100: ldc2_w 165660081
    //   8103: l2i
    //   8104: ldc_w 943600829
    //   8107: ixor
    //   8108: ixor
    //   8109: lookupswitch default -> 15885, 1649585318 -> 8136, 1762577280 -> 8092
    //   8136: goto -> 8140
    //   8139: athrow
    //   8140: invokestatic func_179144_i : (I)V
    //   8143: goto -> 8147
    //   8146: athrow
    //   8147: getstatic Perryc.c : I
    //   8150: iflt -> 8164
    //   8153: ldc2_w 87912404
    //   8156: l2i
    //   8157: ldc_w -836561580
    //   8160: ixor
    //   8161: goto -> 8172
    //   8164: ldc2_w -1362698399
    //   8167: l2i
    //   8168: ldc_w 2044306770
    //   8171: ixor
    //   8172: ldc2_w -346191592
    //   8175: l2i
    //   8176: ldc_w -276876983
    //   8179: ixor
    //   8180: ixor
    //   8181: lookupswitch default -> 8208, -2075635366 -> 8164, -818101551 -> 15927
    //   8208: aload_0
    //   8209: getstatic Perryc.1 : I
    //   8212: ifeq -> 8226
    //   8215: ldc2_w -716623593
    //   8218: l2i
    //   8219: ldc_w 587199593
    //   8222: ixor
    //   8223: goto -> 8234
    //   8226: ldc2_w 1387319989
    //   8229: l2i
    //   8230: ldc_w 297234616
    //   8233: ixor
    //   8234: ldc2_w 1264210388
    //   8237: l2i
    //   8238: ldc_w 374276101
    //   8241: ixor
    //   8242: ixor
    //   8243: lookupswitch default -> 8268, -1432120145 -> 15647, -233024888 -> 8226
    //   8268: getfield boldItalicChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   8271: getstatic Perryc.1 : I
    //   8274: ifeq -> 8288
    //   8277: ldc2_w -243273343
    //   8280: l2i
    //   8281: ldc_w 14789976
    //   8284: ixor
    //   8285: goto -> 8296
    //   8288: ldc2_w -188641170
    //   8291: l2i
    //   8292: ldc_w -412128866
    //   8295: ixor
    //   8296: ldc2_w -1492316382
    //   8299: l2i
    //   8300: ldc_w 1315506427
    //   8303: ixor
    //   8304: ixor
    //   8305: lookupswitch default -> 8332, -19627862 -> 8288, 419060480 -> 15865
    //   8332: astore #8
    //   8334: goto -> 11762
    //   8337: getstatic Perryc.c : I
    //   8340: iflt -> 8354
    //   8343: ldc2_w -848662726
    //   8346: l2i
    //   8347: ldc_w 1142019121
    //   8350: ixor
    //   8351: goto -> 8362
    //   8354: ldc2_w -163096082
    //   8357: l2i
    //   8358: ldc_w 1926792238
    //   8361: ixor
    //   8362: ldc2_w 1094052859
    //   8365: l2i
    //   8366: ldc_w 571407900
    //   8369: ixor
    //   8370: ixor
    //   8371: lookupswitch default -> 15881, -408631257 -> 8396, -364859668 -> 8354
    //   8396: aload_0
    //   8397: getstatic Perryc.1 : I
    //   8400: ifeq -> 8414
    //   8403: ldc2_w -1142049784
    //   8406: l2i
    //   8407: ldc_w -2074756812
    //   8410: ixor
    //   8411: goto -> 8422
    //   8414: ldc2_w 1388712471
    //   8417: l2i
    //   8418: ldc_w -295507716
    //   8421: ixor
    //   8422: ldc2_w 1057126574
    //   8425: l2i
    //   8426: ldc_w -1737248310
    //   8429: ixor
    //   8430: ixor
    //   8431: lookupswitch default -> 15791, -1731607464 -> 8414, 466957199 -> 8456
    //   8456: getfield texBold : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   8459: getstatic Perryc.c : I
    //   8462: iflt -> 8476
    //   8465: ldc2_w 53996372
    //   8468: l2i
    //   8469: ldc_w 1964954264
    //   8472: ixor
    //   8473: goto -> 8484
    //   8476: ldc2_w 1521563176
    //   8479: l2i
    //   8480: ldc_w -779704841
    //   8483: ixor
    //   8484: ldc2_w 365596714
    //   8487: l2i
    //   8488: ldc_w -157952631
    //   8491: ixor
    //   8492: ixor
    //   8493: lookupswitch default -> 15931, -1787397009 -> 8476, 1751701116 -> 8520
    //   8520: goto -> 8524
    //   8523: athrow
    //   8524: invokevirtual func_110552_b : ()I
    //   8527: goto -> 8531
    //   8530: athrow
    //   8531: getstatic Perryc.0 : I
    //   8534: ifle -> 8548
    //   8537: ldc2_w -1946127692
    //   8540: l2i
    //   8541: ldc_w -1136083572
    //   8544: ixor
    //   8545: goto -> 8556
    //   8548: ldc2_w -137139497
    //   8551: l2i
    //   8552: ldc_w 1364036774
    //   8555: ixor
    //   8556: ldc2_w 295839983
    //   8559: l2i
    //   8560: ldc_w -1150949322
    //   8563: ixor
    //   8564: ixor
    //   8565: lookupswitch default -> 15729, -1701900319 -> 8548, 207169192 -> 8592
    //   8592: goto -> 8596
    //   8595: athrow
    //   8596: invokestatic func_179144_i : (I)V
    //   8599: goto -> 8603
    //   8602: athrow
    //   8603: getstatic Perryc.0 : I
    //   8606: ifle -> 8620
    //   8609: ldc2_w -1655635251
    //   8612: l2i
    //   8613: ldc_w -1453864377
    //   8616: ixor
    //   8617: goto -> 8628
    //   8620: ldc2_w -2095747442
    //   8623: l2i
    //   8624: ldc_w -1681868799
    //   8627: ixor
    //   8628: ldc2_w -271412067
    //   8631: l2i
    //   8632: ldc_w 66983368
    //   8635: ixor
    //   8636: ixor
    //   8637: lookupswitch default -> 15559, -668317217 -> 8620, -184985638 -> 8664
    //   8664: aload_0
    //   8665: getstatic Perryc.c : I
    //   8668: iflt -> 8682
    //   8671: ldc2_w -2111102188
    //   8674: l2i
    //   8675: ldc_w -365714561
    //   8678: ixor
    //   8679: goto -> 8690
    //   8682: ldc2_w 1813311336
    //   8685: l2i
    //   8686: ldc_w 1178079371
    //   8689: ixor
    //   8690: ldc2_w -707304589
    //   8693: l2i
    //   8694: ldc_w -720042032
    //   8697: ixor
    //   8698: ixor
    //   8699: lookupswitch default -> 8724, 893800833 -> 8682, 1759175880 -> 15887
    //   8724: getfield boldChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   8727: getstatic Perryc.1 : I
    //   8730: ifeq -> 8744
    //   8733: ldc2_w -139510881
    //   8736: l2i
    //   8737: ldc_w -694885209
    //   8740: ixor
    //   8741: goto -> 8752
    //   8744: ldc2_w -1635059243
    //   8747: l2i
    //   8748: ldc_w 508615182
    //   8751: ixor
    //   8752: ldc2_w 445203081
    //   8755: l2i
    //   8756: ldc_w -278691911
    //   8759: ixor
    //   8760: ixor
    //   8761: lookupswitch default -> 8788, -1384397201 -> 8744, -724442616 -> 15653
    //   8788: astore #8
    //   8790: goto -> 11762
    //   8793: getstatic Perryc.1 : I
    //   8796: ifeq -> 8810
    //   8799: ldc2_w -1954098382
    //   8802: l2i
    //   8803: ldc_w 1205172793
    //   8806: ixor
    //   8807: goto -> 8818
    //   8810: ldc2_w -1100520323
    //   8813: l2i
    //   8814: ldc_w 1040627660
    //   8817: ixor
    //   8818: ldc2_w 1997720615
    //   8821: l2i
    //   8822: ldc_w 1008464200
    //   8825: ixor
    //   8826: ixor
    //   8827: lookupswitch default -> 15963, -2024106908 -> 8810, -882315554 -> 8852
    //   8852: iload #19
    //   8854: ldc2_w -919643328
    //   8857: l2i
    //   8858: ldc_w -919643310
    //   8861: ixor
    //   8862: if_icmpne -> 8876
    //   8865: ldc2_w -36046037
    //   8868: l2i
    //   8869: ldc_w 198038613
    //   8872: ixor
    //   8873: goto -> 8884
    //   8876: ldc2_w -187698990
    //   8879: l2i
    //   8880: ldc_w 47964079
    //   8883: ixor
    //   8884: ldc2_w 1243747169
    //   8887: l2i
    //   8888: ldc_w -371858134
    //   8891: ixor
    //   8892: ixor
    //   8893: tableswitch default -> 8865, 1440995637 -> 8916, 1440995638 -> 8989
    //   8916: ldc2_w 486085736
    //   8919: l2i
    //   8920: ldc_w 486085737
    //   8923: ixor
    //   8924: getstatic Perryc.0 : I
    //   8927: ifle -> 8941
    //   8930: ldc2_w 210449366
    //   8933: l2i
    //   8934: ldc_w 709227042
    //   8937: ixor
    //   8938: goto -> 8949
    //   8941: ldc2_w -915959589
    //   8944: l2i
    //   8945: ldc_w -1643622085
    //   8948: ixor
    //   8949: ldc2_w 1205299423
    //   8952: l2i
    //   8953: ldc_w 300096584
    //   8956: ixor
    //   8957: ixor
    //   8958: lookupswitch default -> 15595, 22787447 -> 8984, 1895478627 -> 8941
    //   8984: istore #13
    //   8986: goto -> 11762
    //   8989: getstatic Perryc.1 : I
    //   8992: ifeq -> 9006
    //   8995: ldc2_w 52881445
    //   8998: l2i
    //   8999: ldc_w -1217807538
    //   9002: ixor
    //   9003: goto -> 9014
    //   9006: ldc2_w -382405984
    //   9009: l2i
    //   9010: ldc_w -2084293756
    //   9013: ixor
    //   9014: ldc2_w 459740632
    //   9017: l2i
    //   9018: ldc_w 1139375140
    //   9021: ixor
    //   9022: ixor
    //   9023: lookupswitch default -> 9048, -941523635 -> 9006, -322880873 -> 15901
    //   9048: iload #19
    //   9050: ldc2_w -70898148
    //   9053: l2i
    //   9054: ldc_w -70898161
    //   9057: ixor
    //   9058: if_icmpne -> 9072
    //   9061: ldc2_w 2072641467
    //   9064: l2i
    //   9065: ldc_w -2062185981
    //   9068: ixor
    //   9069: goto -> 9080
    //   9072: ldc2_w -1612005890
    //   9075: l2i
    //   9076: ldc_w 1635174471
    //   9079: ixor
    //   9080: ldc2_w -392924711
    //   9083: l2i
    //   9084: ldc_w -1890342683
    //   9087: ixor
    //   9088: ixor
    //   9089: tableswitch default -> 9061, -1722045308 -> 9112, -1722045307 -> 9185
    //   9112: ldc2_w 1169860696
    //   9115: l2i
    //   9116: ldc_w 1169860697
    //   9119: ixor
    //   9120: getstatic Perryc.0 : I
    //   9123: ifle -> 9137
    //   9126: ldc2_w -1734311713
    //   9129: l2i
    //   9130: ldc_w 907484951
    //   9133: ixor
    //   9134: goto -> 9145
    //   9137: ldc2_w 634260759
    //   9140: l2i
    //   9141: ldc_w -1180938449
    //   9144: ixor
    //   9145: ldc2_w 1762545091
    //   9148: l2i
    //   9149: ldc_w -2057063511
    //   9152: ixor
    //   9153: ixor
    //   9154: lookupswitch default -> 9180, -1734222249 -> 9137, 1121608098 -> 15727
    //   9180: istore #14
    //   9182: goto -> 11762
    //   9185: getstatic Perryc.c : I
    //   9188: iflt -> 9202
    //   9191: ldc2_w -1749073136
    //   9194: l2i
    //   9195: ldc_w -476510468
    //   9198: ixor
    //   9199: goto -> 9210
    //   9202: ldc2_w -1821983157
    //   9205: l2i
    //   9206: ldc_w -1579746854
    //   9209: ixor
    //   9210: ldc2_w 186463484
    //   9213: l2i
    //   9214: ldc_w -1090521137
    //   9217: ixor
    //   9218: ixor
    //   9219: lookupswitch default -> 9244, -1044085025 -> 15579, 577273147 -> 9202
    //   9244: iload #19
    //   9246: ldc2_w 661533447
    //   9249: l2i
    //   9250: ldc_w 661533459
    //   9253: ixor
    //   9254: if_icmpne -> 9268
    //   9257: ldc2_w -838922721
    //   9260: l2i
    //   9261: ldc_w 1304500640
    //   9264: ixor
    //   9265: goto -> 9276
    //   9268: ldc2_w 1647339779
    //   9271: l2i
    //   9272: ldc_w -502366531
    //   9275: ixor
    //   9276: ldc2_w 503381051
    //   9279: l2i
    //   9280: ldc_w 1267218624
    //   9283: ixor
    //   9284: ixor
    //   9285: tableswitch default -> 9257, -709438652 -> 9308, -709438651 -> 10409
    //   9308: ldc2_w -1110099643
    //   9311: l2i
    //   9312: ldc_w -1110099644
    //   9315: ixor
    //   9316: getstatic Perryc.0 : I
    //   9319: ifle -> 9333
    //   9322: ldc2_w 26021740
    //   9325: l2i
    //   9326: ldc_w 757697341
    //   9329: ixor
    //   9330: goto -> 9341
    //   9333: ldc2_w 1312002270
    //   9336: l2i
    //   9337: ldc_w -1519210632
    //   9340: ixor
    //   9341: ldc2_w -1705456371
    //   9344: l2i
    //   9345: ldc_w 762364996
    //   9348: ixor
    //   9349: ixor
    //   9350: lookupswitch default -> 15767, -1685287656 -> 9333, 1550399215 -> 9376
    //   9376: istore #12
    //   9378: getstatic Perryc.1 : I
    //   9381: ifeq -> 9395
    //   9384: ldc2_w 478686989
    //   9387: l2i
    //   9388: ldc_w 1408220150
    //   9391: ixor
    //   9392: goto -> 9403
    //   9395: ldc2_w -1537127442
    //   9398: l2i
    //   9399: ldc_w 607487404
    //   9402: ixor
    //   9403: ldc2_w -1458992506
    //   9406: l2i
    //   9407: ldc_w -1799817227
    //   9410: ixor
    //   9411: ixor
    //   9412: lookupswitch default -> 15717, -1109019855 -> 9440, 1926687112 -> 9395
    //   9440: iload #11
    //   9442: ifeq -> 9456
    //   9445: ldc2_w -1503207080
    //   9448: l2i
    //   9449: ldc_w 497863551
    //   9452: ixor
    //   9453: goto -> 9464
    //   9456: ldc2_w 619331057
    //   9459: l2i
    //   9460: ldc_w -1625286711
    //   9463: ixor
    //   9464: ldc2_w -358296255
    //   9467: l2i
    //   9468: ldc_w 1136897257
    //   9471: ixor
    //   9472: ixor
    //   9473: tableswitch default -> 9445, 313349007 -> 9496, 313349008 -> 9953
    //   9496: getstatic Perryc.0 : I
    //   9499: ifle -> 9513
    //   9502: ldc2_w 1538811903
    //   9505: l2i
    //   9506: ldc_w -118706513
    //   9509: ixor
    //   9510: goto -> 9521
    //   9513: ldc2_w 2004314272
    //   9516: l2i
    //   9517: ldc_w 137724650
    //   9520: ixor
    //   9521: ldc2_w -1290804254
    //   9524: l2i
    //   9525: ldc_w 539373645
    //   9528: ixor
    //   9529: ixor
    //   9530: lookupswitch default -> 15827, -328517147 -> 9556, 813505279 -> 9513
    //   9556: aload_0
    //   9557: getstatic Perryc.0 : I
    //   9560: ifle -> 9574
    //   9563: ldc2_w 1491740442
    //   9566: l2i
    //   9567: ldc_w -113364518
    //   9570: ixor
    //   9571: goto -> 9582
    //   9574: ldc2_w -242438420
    //   9577: l2i
    //   9578: ldc_w 2140153006
    //   9581: ixor
    //   9582: ldc2_w 213459669
    //   9585: l2i
    //   9586: ldc_w 1787248896
    //   9589: ixor
    //   9590: ixor
    //   9591: lookupswitch default -> 9616, -940935915 -> 15733, 485369517 -> 9574
    //   9616: getfield texItalicBold : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   9619: getstatic Perryc.1 : I
    //   9622: ifeq -> 9636
    //   9625: ldc2_w -861011308
    //   9628: l2i
    //   9629: ldc_w 728597951
    //   9632: ixor
    //   9633: goto -> 9644
    //   9636: ldc2_w -548185109
    //   9639: l2i
    //   9640: ldc_w 1361497582
    //   9643: ixor
    //   9644: ldc2_w -832695225
    //   9647: l2i
    //   9648: ldc_w -151761279
    //   9651: ixor
    //   9652: ixor
    //   9653: lookupswitch default -> 9680, -723205356 -> 9636, -546710035 -> 15849
    //   9680: goto -> 9684
    //   9683: athrow
    //   9684: invokevirtual func_110552_b : ()I
    //   9687: goto -> 9691
    //   9690: athrow
    //   9691: getstatic Perryc.1 : I
    //   9694: ifeq -> 9708
    //   9697: ldc2_w 2134650863
    //   9700: l2i
    //   9701: ldc_w -1021963966
    //   9704: ixor
    //   9705: goto -> 9716
    //   9708: ldc2_w -754019606
    //   9711: l2i
    //   9712: ldc_w -616160153
    //   9715: ixor
    //   9716: ldc2_w 90721981
    //   9719: l2i
    //   9720: ldc_w 1340327356
    //   9723: ixor
    //   9724: ixor
    //   9725: lookupswitch default -> 9752, -1151976279 -> 9708, -157174356 -> 15601
    //   9752: goto -> 9756
    //   9755: athrow
    //   9756: invokestatic func_179144_i : (I)V
    //   9759: goto -> 9763
    //   9762: athrow
    //   9763: getstatic Perryc.0 : I
    //   9766: ifle -> 9780
    //   9769: ldc2_w -1046445115
    //   9772: l2i
    //   9773: ldc_w 1879250419
    //   9776: ixor
    //   9777: goto -> 9788
    //   9780: ldc2_w 1492421170
    //   9783: l2i
    //   9784: ldc_w 1152772516
    //   9787: ixor
    //   9788: ldc2_w 160802157
    //   9791: l2i
    //   9792: ldc_w 1721491159
    //   9795: ixor
    //   9796: ixor
    //   9797: lookupswitch default -> 15929, -559026804 -> 9780, 1934563372 -> 9824
    //   9824: aload_0
    //   9825: getstatic Perryc.c : I
    //   9828: iflt -> 9842
    //   9831: ldc2_w -1205188625
    //   9834: l2i
    //   9835: ldc_w -681857177
    //   9838: ixor
    //   9839: goto -> 9850
    //   9842: ldc2_w 648327901
    //   9845: l2i
    //   9846: ldc_w 574932373
    //   9849: ixor
    //   9850: ldc2_w 767704728
    //   9853: l2i
    //   9854: ldc_w 2125720679
    //   9857: ixor
    //   9858: ixor
    //   9859: lookupswitch default -> 15785, 1006647927 -> 9842, 1469162935 -> 9884
    //   9884: getfield boldItalicChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   9887: getstatic Perryc.1 : I
    //   9890: ifeq -> 9904
    //   9893: ldc2_w -557230506
    //   9896: l2i
    //   9897: ldc_w -163265302
    //   9900: ixor
    //   9901: goto -> 9912
    //   9904: ldc2_w -50048707
    //   9907: l2i
    //   9908: ldc_w 636200457
    //   9911: ixor
    //   9912: ldc2_w 359305423
    //   9915: l2i
    //   9916: ldc_w 183778127
    //   9919: ixor
    //   9920: ixor
    //   9921: lookupswitch default -> 15687, -948872012 -> 9948, 924006716 -> 9904
    //   9948: astore #8
    //   9950: goto -> 11762
    //   9953: getstatic Perryc.c : I
    //   9956: iflt -> 9970
    //   9959: ldc2_w -897732617
    //   9962: l2i
    //   9963: ldc_w 2063878463
    //   9966: ixor
    //   9967: goto -> 9978
    //   9970: ldc2_w 2123452290
    //   9973: l2i
    //   9974: ldc_w -1627224506
    //   9977: ixor
    //   9978: ldc2_w 1504982408
    //   9981: l2i
    //   9982: ldc_w 1647875513
    //   9985: ixor
    //   9986: ixor
    //   9987: lookupswitch default -> 10012, -1963636999 -> 15845, 537140899 -> 9970
    //   10012: aload_0
    //   10013: getstatic Perryc.0 : I
    //   10016: ifle -> 10030
    //   10019: ldc2_w 515313712
    //   10022: l2i
    //   10023: ldc_w 34100968
    //   10026: ixor
    //   10027: goto -> 10038
    //   10030: ldc2_w 241387998
    //   10033: l2i
    //   10034: ldc_w -331291046
    //   10037: ixor
    //   10038: ldc2_w -569884334
    //   10041: l2i
    //   10042: ldc_w 1336949644
    //   10045: ixor
    //   10046: ixor
    //   10047: lookupswitch default -> 15831, -1928905722 -> 10030, 1939592538 -> 10072
    //   10072: getfield texItalic : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   10075: getstatic Perryc.c : I
    //   10078: iflt -> 10092
    //   10081: ldc2_w 848323567
    //   10084: l2i
    //   10085: ldc_w 1022997820
    //   10088: ixor
    //   10089: goto -> 10100
    //   10092: ldc2_w 1912322977
    //   10095: l2i
    //   10096: ldc_w 565624017
    //   10099: ixor
    //   10100: ldc2_w -1933405629
    //   10103: l2i
    //   10104: ldc_w -753533724
    //   10107: ixor
    //   10108: ixor
    //   10109: lookupswitch default -> 10136, -294831043 -> 10092, 1371453556 -> 15719
    //   10136: goto -> 10140
    //   10139: athrow
    //   10140: invokevirtual func_110552_b : ()I
    //   10143: goto -> 10147
    //   10146: athrow
    //   10147: getstatic Perryc.1 : I
    //   10150: ifeq -> 10164
    //   10153: ldc2_w -1045597765
    //   10156: l2i
    //   10157: ldc_w -123949992
    //   10160: ixor
    //   10161: goto -> 10172
    //   10164: ldc2_w -586710761
    //   10167: l2i
    //   10168: ldc_w 140888435
    //   10171: ixor
    //   10172: ldc2_w 2032631650
    //   10175: l2i
    //   10176: ldc_w 1937831241
    //   10179: ixor
    //   10180: ixor
    //   10181: lookupswitch default -> 10208, -597248938 -> 10164, 865490888 -> 15955
    //   10208: goto -> 10212
    //   10211: athrow
    //   10212: invokestatic func_179144_i : (I)V
    //   10215: goto -> 10219
    //   10218: athrow
    //   10219: getstatic Perryc.1 : I
    //   10222: ifeq -> 10236
    //   10225: ldc2_w 843588550
    //   10228: l2i
    //   10229: ldc_w -358627413
    //   10232: ixor
    //   10233: goto -> 10244
    //   10236: ldc2_w -365534836
    //   10239: l2i
    //   10240: ldc_w -1203784372
    //   10243: ixor
    //   10244: ldc2_w 481719584
    //   10247: l2i
    //   10248: ldc_w -1265577122
    //   10251: ixor
    //   10252: ixor
    //   10253: lookupswitch default -> 15581, -97553730 -> 10280, 1894859283 -> 10236
    //   10280: aload_0
    //   10281: getstatic Perryc.0 : I
    //   10284: ifle -> 10298
    //   10287: ldc2_w -823239677
    //   10290: l2i
    //   10291: ldc_w 1728162296
    //   10294: ixor
    //   10295: goto -> 10306
    //   10298: ldc2_w 1612794966
    //   10301: l2i
    //   10302: ldc_w -361446861
    //   10305: ixor
    //   10306: ldc2_w 1928323732
    //   10309: l2i
    //   10310: ldc_w 308411957
    //   10313: ixor
    //   10314: ixor
    //   10315: lookupswitch default -> 10340, -916330150 -> 15587, 1555000684 -> 10298
    //   10340: getfield italicChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   10343: getstatic Perryc.c : I
    //   10346: iflt -> 10360
    //   10349: ldc2_w -854549983
    //   10352: l2i
    //   10353: ldc_w 1606630639
    //   10356: ixor
    //   10357: goto -> 10368
    //   10360: ldc2_w 397641804
    //   10363: l2i
    //   10364: ldc_w -1951463466
    //   10367: ixor
    //   10368: ldc2_w -682784801
    //   10371: l2i
    //   10372: ldc_w 964825917
    //   10375: ixor
    //   10376: ixor
    //   10377: lookupswitch default -> 15943, 1926437752 -> 10404, 2082222636 -> 10360
    //   10404: astore #8
    //   10406: goto -> 11762
    //   10409: getstatic Perryc.0 : I
    //   10412: ifle -> 10426
    //   10415: ldc2_w -2053496672
    //   10418: l2i
    //   10419: ldc_w -552680576
    //   10422: ixor
    //   10423: goto -> 10434
    //   10426: ldc2_w -250717558
    //   10429: l2i
    //   10430: ldc_w 250884530
    //   10433: ixor
    //   10434: ldc2_w -1159498989
    //   10437: l2i
    //   10438: ldc_w 399487672
    //   10441: ixor
    //   10442: ixor
    //   10443: lookupswitch default -> 15787, -138927477 -> 10426, 1389800083 -> 10468
    //   10468: iload #19
    //   10470: ldc2_w 1896702857
    //   10473: l2i
    //   10474: ldc_w 1896702876
    //   10477: ixor
    //   10478: if_icmpne -> 10492
    //   10481: ldc2_w -2049223689
    //   10484: l2i
    //   10485: ldc_w -69997452
    //   10488: ixor
    //   10489: goto -> 10500
    //   10492: ldc2_w -21386426
    //   10495: l2i
    //   10496: ldc_w -2135878460
    //   10499: ixor
    //   10500: ldc2_w 655433362
    //   10503: l2i
    //   10504: ldc_w -454793133
    //   10507: ixor
    //   10508: ixor
    //   10509: tableswitch default -> 10481, -1107441342 -> 10532, -1107441341 -> 11762
    //   10532: ldc2_w 839015894
    //   10535: l2i
    //   10536: ldc_w 839015894
    //   10539: ixor
    //   10540: getstatic Perryc.c : I
    //   10543: iflt -> 10557
    //   10546: ldc2_w 1443133946
    //   10549: l2i
    //   10550: ldc_w -2092110663
    //   10553: ixor
    //   10554: goto -> 10565
    //   10557: ldc2_w -1710203099
    //   10560: l2i
    //   10561: ldc_w -1526249221
    //   10564: ixor
    //   10565: ldc2_w -1721932864
    //   10568: l2i
    //   10569: ldc_w 1887320174
    //   10572: ixor
    //   10573: ixor
    //   10574: lookupswitch default -> 10600, -1357614205 -> 10557, 1013698285 -> 15655
    //   10600: istore #11
    //   10602: ldc2_w -521207522
    //   10605: l2i
    //   10606: ldc_w -521207522
    //   10609: ixor
    //   10610: getstatic Perryc.0 : I
    //   10613: ifle -> 10627
    //   10616: ldc2_w -1011351349
    //   10619: l2i
    //   10620: ldc_w 1917027139
    //   10623: ixor
    //   10624: goto -> 10635
    //   10627: ldc2_w 181921005
    //   10630: l2i
    //   10631: ldc_w -1803011928
    //   10634: ixor
    //   10635: ldc2_w 219012516
    //   10638: l2i
    //   10639: ldc_w -894940929
    //   10642: ixor
    //   10643: ixor
    //   10644: lookupswitch default -> 15861, 1509574942 -> 10672, 1985877715 -> 10627
    //   10672: istore #12
    //   10674: ldc2_w 1861552193
    //   10677: l2i
    //   10678: ldc_w 1861552193
    //   10681: ixor
    //   10682: getstatic Perryc.0 : I
    //   10685: ifle -> 10699
    //   10688: ldc2_w 36416515
    //   10691: l2i
    //   10692: ldc_w -943319153
    //   10695: ixor
    //   10696: goto -> 10707
    //   10699: ldc2_w 217545056
    //   10702: l2i
    //   10703: ldc_w 1404305456
    //   10706: ixor
    //   10707: ldc2_w 1409294035
    //   10710: l2i
    //   10711: ldc_w 1408764488
    //   10714: ixor
    //   10715: ixor
    //   10716: lookupswitch default -> 15643, -1038766313 -> 10699, 1488678347 -> 10744
    //   10744: istore #10
    //   10746: ldc2_w -1637115729
    //   10749: l2i
    //   10750: ldc_w -1637115729
    //   10753: ixor
    //   10754: getstatic Perryc.c : I
    //   10757: iflt -> 10771
    //   10760: ldc2_w 437188770
    //   10763: l2i
    //   10764: ldc_w -1726347280
    //   10767: ixor
    //   10768: goto -> 10779
    //   10771: ldc2_w -899872181
    //   10774: l2i
    //   10775: ldc_w -1791632140
    //   10778: ixor
    //   10779: ldc2_w 554527726
    //   10782: l2i
    //   10783: ldc_w -703838364
    //   10786: ixor
    //   10787: ixor
    //   10788: lookupswitch default -> 15703, -1469449675 -> 10816, 1947587544 -> 10771
    //   10816: istore #14
    //   10818: ldc2_w 254403663
    //   10821: l2i
    //   10822: ldc_w 254403663
    //   10825: ixor
    //   10826: getstatic Perryc.c : I
    //   10829: iflt -> 10843
    //   10832: ldc2_w 1848479942
    //   10835: l2i
    //   10836: ldc_w -1879718035
    //   10839: ixor
    //   10840: goto -> 10851
    //   10843: ldc2_w -610265574
    //   10846: l2i
    //   10847: ldc_w -766774737
    //   10850: ixor
    //   10851: ldc2_w 1028194602
    //   10854: l2i
    //   10855: ldc_w -2105146939
    //   10858: ixor
    //   10859: ixor
    //   10860: lookupswitch default -> 10888, 1183481180 -> 10843, 1578587972 -> 15683
    //   10888: istore #13
    //   10890: getstatic Perryc.0 : I
    //   10893: ifle -> 10907
    //   10896: ldc2_w -656695212
    //   10899: l2i
    //   10900: ldc_w 1211397911
    //   10903: ixor
    //   10904: goto -> 10915
    //   10907: ldc2_w -224509596
    //   10910: l2i
    //   10911: ldc_w 1136814709
    //   10914: ixor
    //   10915: ldc2_w 910835585
    //   10918: l2i
    //   10919: ldc_w -1568821445
    //   10922: ixor
    //   10923: ixor
    //   10924: lookupswitch default -> 15873, 81283065 -> 10907, 627817387 -> 10952
    //   10952: iload #6
    //   10954: ldc2_w 33965219
    //   10957: l2i
    //   10958: ldc_w 33965235
    //   10961: ixor
    //   10962: ishr
    //   10963: ldc2_w 901212909
    //   10966: l2i
    //   10967: ldc_w 901212690
    //   10970: ixor
    //   10971: iand
    //   10972: i2f
    //   10973: ldc_w 0.25555488
    //   10976: invokestatic floatToIntBits : (F)I
    //   10979: ldc_w 2113787927
    //   10982: ixor
    //   10983: invokestatic intBitsToFloat : (I)F
    //   10986: fdiv
    //   10987: getstatic Perryc.c : I
    //   10990: iflt -> 11004
    //   10993: ldc2_w -612566358
    //   10996: l2i
    //   10997: ldc_w 1181119846
    //   11000: ixor
    //   11001: goto -> 11012
    //   11004: ldc2_w -721293453
    //   11007: l2i
    //   11008: ldc_w 762954260
    //   11011: ixor
    //   11012: ldc2_w -897673421
    //   11015: l2i
    //   11016: ldc_w -2140783100
    //   11019: ixor
    //   11020: ixor
    //   11021: lookupswitch default -> 11048, -2067073287 -> 11004, -687724805 -> 15935
    //   11048: iload #6
    //   11050: ldc2_w -628704731
    //   11053: l2i
    //   11054: ldc_w -628704723
    //   11057: ixor
    //   11058: ishr
    //   11059: ldc2_w -1567615391
    //   11062: l2i
    //   11063: ldc_w -1567615330
    //   11066: ixor
    //   11067: iand
    //   11068: i2f
    //   11069: ldc_w 0.014302107
    //   11072: invokestatic floatToIntBits : (F)I
    //   11075: ldc_w 2132104034
    //   11078: ixor
    //   11079: invokestatic intBitsToFloat : (I)F
    //   11082: fdiv
    //   11083: getstatic Perryc.1 : I
    //   11086: ifeq -> 11100
    //   11089: ldc2_w 193623975
    //   11092: l2i
    //   11093: ldc_w 1479316006
    //   11096: ixor
    //   11097: goto -> 11108
    //   11100: ldc2_w -904243028
    //   11103: l2i
    //   11104: ldc_w -781561
    //   11107: ixor
    //   11108: ldc2_w 281167776
    //   11111: l2i
    //   11112: ldc_w -2023488085
    //   11115: ixor
    //   11116: ixor
    //   11117: lookupswitch default -> 11144, -1006590070 -> 15947, 1946218322 -> 11100
    //   11144: iload #6
    //   11146: ldc2_w 1744226296
    //   11149: l2i
    //   11150: ldc_w 1744226055
    //   11153: ixor
    //   11154: iand
    //   11155: i2f
    //   11156: ldc_w 0.014155283
    //   11159: invokestatic floatToIntBits : (F)I
    //   11162: ldc_w 2132339599
    //   11165: ixor
    //   11166: invokestatic intBitsToFloat : (I)F
    //   11169: fdiv
    //   11170: getstatic Perryc.0 : I
    //   11173: ifle -> 11187
    //   11176: ldc2_w 1994208981
    //   11179: l2i
    //   11180: ldc_w -1232272016
    //   11183: ixor
    //   11184: goto -> 11195
    //   11187: ldc2_w -442753735
    //   11190: l2i
    //   11191: ldc_w -663745263
    //   11194: ixor
    //   11195: ldc2_w 1069737768
    //   11198: l2i
    //   11199: ldc_w -2127546168
    //   11202: ixor
    //   11203: ixor
    //   11204: lookupswitch default -> 11232, 102501277 -> 11187, 2124606533 -> 15563
    //   11232: fload #9
    //   11234: getstatic Perryc.1 : I
    //   11237: ifeq -> 11251
    //   11240: ldc2_w 1769928960
    //   11243: l2i
    //   11244: ldc_w -1450057682
    //   11247: ixor
    //   11248: goto -> 11259
    //   11251: ldc2_w -774087446
    //   11254: l2i
    //   11255: ldc_w 1837207859
    //   11258: ixor
    //   11259: ldc2_w 828043519
    //   11262: l2i
    //   11263: ldc_w 161509210
    //   11266: ixor
    //   11267: ixor
    //   11268: lookupswitch default -> 11296, -132807029 -> 15937, 781344669 -> 11251
    //   11296: goto -> 11300
    //   11299: athrow
    //   11300: invokestatic func_179131_c : (FFFF)V
    //   11303: goto -> 11307
    //   11306: athrow
    //   11307: getstatic Perryc.0 : I
    //   11310: ifle -> 11324
    //   11313: ldc2_w -2013478409
    //   11316: l2i
    //   11317: ldc_w 2058818938
    //   11320: ixor
    //   11321: goto -> 11332
    //   11324: ldc2_w 1309204375
    //   11327: l2i
    //   11328: ldc_w 1062060834
    //   11331: ixor
    //   11332: ldc2_w 1488883666
    //   11335: l2i
    //   11336: ldc_w -731255194
    //   11339: ixor
    //   11340: ixor
    //   11341: lookupswitch default -> 11368, 1196297365 -> 11324, 1906095417 -> 15867
    //   11368: aload_0
    //   11369: getstatic Perryc.c : I
    //   11372: iflt -> 11386
    //   11375: ldc2_w -509741313
    //   11378: l2i
    //   11379: ldc_w -898636825
    //   11382: ixor
    //   11383: goto -> 11394
    //   11386: ldc2_w 46367141
    //   11389: l2i
    //   11390: ldc_w -943752879
    //   11393: ixor
    //   11394: ldc2_w -318540885
    //   11397: l2i
    //   11398: ldc_w 1657563841
    //   11401: ixor
    //   11402: ixor
    //   11403: lookupswitch default -> 11428, -1539502990 -> 15743, 1158585125 -> 11386
    //   11428: getfield tex : Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   11431: getstatic Perryc.0 : I
    //   11434: ifle -> 11448
    //   11437: ldc2_w 769693610
    //   11440: l2i
    //   11441: ldc_w -941914274
    //   11444: ixor
    //   11445: goto -> 11456
    //   11448: ldc2_w -1389238530
    //   11451: l2i
    //   11452: ldc_w 892600369
    //   11455: ixor
    //   11456: ldc2_w -1925415685
    //   11459: l2i
    //   11460: ldc_w -804091493
    //   11463: ixor
    //   11464: ixor
    //   11465: lookupswitch default -> 11492, -1223301740 -> 15833, 1240392526 -> 11448
    //   11492: goto -> 11496
    //   11495: athrow
    //   11496: invokevirtual func_110552_b : ()I
    //   11499: goto -> 11503
    //   11502: athrow
    //   11503: getstatic Perryc.1 : I
    //   11506: ifeq -> 11520
    //   11509: ldc2_w 186335435
    //   11512: l2i
    //   11513: ldc_w -2058731734
    //   11516: ixor
    //   11517: goto -> 11528
    //   11520: ldc2_w 1049649345
    //   11523: l2i
    //   11524: ldc_w -699951265
    //   11527: ixor
    //   11528: ldc2_w -75875638
    //   11531: l2i
    //   11532: ldc_w 1015342821
    //   11535: ixor
    //   11536: ixor
    //   11537: lookupswitch default -> 11564, -472072987 -> 11520, 1236247502 -> 15627
    //   11564: goto -> 11568
    //   11567: athrow
    //   11568: invokestatic func_179144_i : (I)V
    //   11571: goto -> 11575
    //   11574: athrow
    //   11575: getstatic Perryc.1 : I
    //   11578: ifeq -> 11592
    //   11581: ldc2_w 1436641838
    //   11584: l2i
    //   11585: ldc_w 1786317482
    //   11588: ixor
    //   11589: goto -> 11600
    //   11592: ldc2_w 48945076
    //   11595: l2i
    //   11596: ldc_w -606112164
    //   11599: ixor
    //   11600: ldc2_w 1586275994
    //   11603: l2i
    //   11604: ldc_w -1355201956
    //   11607: ixor
    //   11608: ixor
    //   11609: lookupswitch default -> 11636, -831683518 -> 15839, 699861286 -> 11592
    //   11636: aload_0
    //   11637: getstatic Perryc.0 : I
    //   11640: ifle -> 11654
    //   11643: ldc2_w 2041236039
    //   11646: l2i
    //   11647: ldc_w -165656753
    //   11650: ixor
    //   11651: goto -> 11662
    //   11654: ldc2_w -1044811030
    //   11657: l2i
    //   11658: ldc_w -718563344
    //   11661: ixor
    //   11662: ldc2_w 1592583715
    //   11665: l2i
    //   11666: ldc_w 1513768763
    //   11669: ixor
    //   11670: ixor
    //   11671: lookupswitch default -> 15689, -1956893680 -> 11654, 272909314 -> 11696
    //   11696: getfield charData : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   11699: getstatic Perryc.1 : I
    //   11702: ifeq -> 11716
    //   11705: ldc2_w 620760098
    //   11708: l2i
    //   11709: ldc_w -2131595226
    //   11712: ixor
    //   11713: goto -> 11724
    //   11716: ldc2_w -1039864806
    //   11719: l2i
    //   11720: ldc_w -1502643082
    //   11723: ixor
    //   11724: ldc2_w 883755784
    //   11727: l2i
    //   11728: ldc_w 780243049
    //   11731: ixor
    //   11732: ixor
    //   11733: lookupswitch default -> 11760, -1928470334 -> 11716, -1075910811 -> 15819
    //   11760: astore #8
    //   11762: iinc #17, 1
    //   11765: goto -> 15309
    //   11768: getstatic Perryc.1 : I
    //   11771: ifeq -> 11785
    //   11774: ldc2_w -648365950
    //   11777: l2i
    //   11778: ldc_w -1684074200
    //   11781: ixor
    //   11782: goto -> 11793
    //   11785: ldc2_w 1514007398
    //   11788: l2i
    //   11789: ldc_w 1458700702
    //   11792: ixor
    //   11793: ldc2_w -924783881
    //   11796: l2i
    //   11797: ldc_w -1554448686
    //   11800: ixor
    //   11801: ixor
    //   11802: lookupswitch default -> 15707, 696106383 -> 11785, 1735917277 -> 11828
    //   11828: iload #18
    //   11830: getstatic Perryc.c : I
    //   11833: iflt -> 11847
    //   11836: ldc2_w 593470075
    //   11839: l2i
    //   11840: ldc_w -1187288846
    //   11843: ixor
    //   11844: goto -> 11855
    //   11847: ldc2_w -1618248343
    //   11850: l2i
    //   11851: ldc_w -1324257697
    //   11854: ixor
    //   11855: ldc2_w -273292886
    //   11858: l2i
    //   11859: ldc_w -1660802938
    //   11862: ixor
    //   11863: ixor
    //   11864: lookupswitch default -> 15671, -388824155 -> 11847, 1546508826 -> 11892
    //   11892: aload #8
    //   11894: arraylength
    //   11895: if_icmpge -> 11909
    //   11898: ldc2_w -1839967316
    //   11901: l2i
    //   11902: ldc_w -1407943978
    //   11905: ixor
    //   11906: goto -> 11917
    //   11909: ldc2_w 1790674332
    //   11912: l2i
    //   11913: ldc_w 1425779943
    //   11916: ixor
    //   11917: ldc2_w -813282311
    //   11920: l2i
    //   11921: ldc_w 1108957977
    //   11924: ixor
    //   11925: ixor
    //   11926: tableswitch default -> 11898, -1277216358 -> 11948, -1277216357 -> 15309
    //   11948: getstatic Perryc.1 : I
    //   11951: ifeq -> 11965
    //   11954: ldc2_w -850538716
    //   11957: l2i
    //   11958: ldc_w 1883535649
    //   11961: ixor
    //   11962: goto -> 11973
    //   11965: ldc2_w -1756639984
    //   11968: l2i
    //   11969: ldc_w 190846008
    //   11972: ixor
    //   11973: ldc2_w 497787301
    //   11976: l2i
    //   11977: ldc_w -1947344770
    //   11980: ixor
    //   11981: ixor
    //   11982: lookupswitch default -> 15753, 174954739 -> 12008, 726661086 -> 11965
    //   12008: iload #18
    //   12010: iflt -> 12024
    //   12013: ldc2_w -1560110494
    //   12016: l2i
    //   12017: ldc_w 1549187907
    //   12020: ixor
    //   12021: goto -> 12032
    //   12024: ldc2_w 1621768851
    //   12027: l2i
    //   12028: ldc_w -1610736719
    //   12031: ixor
    //   12032: ldc2_w -1064697045
    //   12035: l2i
    //   12036: ldc_w -643031745
    //   12039: ixor
    //   12040: ixor
    //   12041: tableswitch default -> 12013, -428720331 -> 12064, -428720330 -> 15309
    //   12064: ldc2_w 450666979
    //   12067: l2i
    //   12068: ldc_w 450666983
    //   12071: ixor
    //   12072: getstatic Perryc.c : I
    //   12075: iflt -> 12089
    //   12078: ldc2_w -279576789
    //   12081: l2i
    //   12082: ldc_w 117515923
    //   12085: ixor
    //   12086: goto -> 12097
    //   12089: ldc2_w 532691106
    //   12092: l2i
    //   12093: ldc_w -792229346
    //   12096: ixor
    //   12097: ldc2_w 1773252951
    //   12100: l2i
    //   12101: ldc_w 2050784235
    //   12104: ixor
    //   12105: ixor
    //   12106: lookupswitch default -> 15909, -594905088 -> 12132, -69659900 -> 12089
    //   12132: goto -> 12136
    //   12135: athrow
    //   12136: invokestatic glBegin : (I)V
    //   12139: goto -> 12143
    //   12142: athrow
    //   12143: getstatic Perryc.1 : I
    //   12146: ifeq -> 12160
    //   12149: ldc2_w -1988746887
    //   12152: l2i
    //   12153: ldc_w 324027633
    //   12156: ixor
    //   12157: goto -> 12168
    //   12160: ldc2_w 1695958200
    //   12163: l2i
    //   12164: ldc_w -1433848042
    //   12167: ixor
    //   12168: ldc2_w 732671114
    //   12171: l2i
    //   12172: ldc_w -1034754894
    //   12175: ixor
    //   12176: ixor
    //   12177: lookupswitch default -> 15669, 644234134 -> 12204, 1944006064 -> 12160
    //   12204: aload_0
    //   12205: getstatic Perryc.0 : I
    //   12208: ifle -> 12222
    //   12211: ldc2_w -567119898
    //   12214: l2i
    //   12215: ldc_w 1578972971
    //   12218: ixor
    //   12219: goto -> 12230
    //   12222: ldc2_w 1654048300
    //   12225: l2i
    //   12226: ldc_w 1017333951
    //   12229: ixor
    //   12230: ldc2_w -1665492537
    //   12233: l2i
    //   12234: ldc_w -950567391
    //   12237: ixor
    //   12238: ixor
    //   12239: lookupswitch default -> 15797, -607994069 -> 12222, 98068853 -> 12264
    //   12264: aload #8
    //   12266: getstatic Perryc.1 : I
    //   12269: ifeq -> 12283
    //   12272: ldc2_w 1897955140
    //   12275: l2i
    //   12276: ldc_w -2130555137
    //   12279: ixor
    //   12280: goto -> 12291
    //   12283: ldc2_w -1113091480
    //   12286: l2i
    //   12287: ldc_w 1090403875
    //   12290: ixor
    //   12291: ldc2_w 951872782
    //   12294: l2i
    //   12295: ldc_w -487212213
    //   12298: ixor
    //   12299: ixor
    //   12300: lookupswitch default -> 12328, -175146919 -> 12283, 711714814 -> 15573
    //   12328: iload #18
    //   12330: getstatic Perryc.0 : I
    //   12333: ifle -> 12347
    //   12336: ldc2_w -935641722
    //   12339: l2i
    //   12340: ldc_w 402751078
    //   12343: ixor
    //   12344: goto -> 12355
    //   12347: ldc2_w -147867694
    //   12350: l2i
    //   12351: ldc_w 821324976
    //   12354: ixor
    //   12355: ldc2_w 1519375021
    //   12358: l2i
    //   12359: ldc_w 1107560762
    //   12362: ixor
    //   12363: ixor
    //   12364: lookupswitch default -> 12392, -927885193 -> 15959, -702229928 -> 12347
    //   12392: dload_2
    //   12393: d2f
    //   12394: getstatic Perryc.c : I
    //   12397: iflt -> 12411
    //   12400: ldc2_w -842082480
    //   12403: l2i
    //   12404: ldc_w 111578177
    //   12407: ixor
    //   12408: goto -> 12419
    //   12411: ldc2_w 1069825770
    //   12414: l2i
    //   12415: ldc_w 2056029546
    //   12418: ixor
    //   12419: ldc2_w -1376805524
    //   12422: l2i
    //   12423: ldc_w -86894954
    //   12426: ixor
    //   12427: ixor
    //   12428: lookupswitch default -> 12456, -1672097557 -> 15685, 722547308 -> 12411
    //   12456: dload #4
    //   12458: d2f
    //   12459: getstatic Perryc.c : I
    //   12462: iflt -> 12476
    //   12465: ldc2_w -334315059
    //   12468: l2i
    //   12469: ldc_w 747445774
    //   12472: ixor
    //   12473: goto -> 12484
    //   12476: ldc2_w 800365752
    //   12479: l2i
    //   12480: ldc_w 7593159
    //   12483: ixor
    //   12484: ldc2_w 1351770133
    //   12487: l2i
    //   12488: ldc_w -1890112970
    //   12491: ixor
    //   12492: ixor
    //   12493: lookupswitch default -> 12520, -1520376629 -> 12476, 526030304 -> 15723
    //   12520: goto -> 12524
    //   12523: athrow
    //   12524: invokevirtual drawChar : ([Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;CFF)V
    //   12527: goto -> 12531
    //   12530: athrow
    //   12531: getstatic Perryc.0 : I
    //   12534: ifle -> 12548
    //   12537: ldc2_w 1960469701
    //   12540: l2i
    //   12541: ldc_w 1521283927
    //   12544: ixor
    //   12545: goto -> 12556
    //   12548: ldc2_w 272068942
    //   12551: l2i
    //   12552: ldc_w -1149840950
    //   12555: ixor
    //   12556: ldc2_w 805345299
    //   12559: l2i
    //   12560: ldc_w -1930175253
    //   12563: ixor
    //   12564: ixor
    //   12565: lookupswitch default -> 12592, -1836723350 -> 15915, -136837096 -> 12548
    //   12592: goto -> 12596
    //   12595: athrow
    //   12596: invokestatic glEnd : ()V
    //   12599: goto -> 12603
    //   12602: athrow
    //   12603: getstatic Perryc.0 : I
    //   12606: ifle -> 12620
    //   12609: ldc2_w -960374691
    //   12612: l2i
    //   12613: ldc_w 1235132651
    //   12616: ixor
    //   12617: goto -> 12628
    //   12620: ldc2_w -1063043574
    //   12623: l2i
    //   12624: ldc_w -1665411908
    //   12627: ixor
    //   12628: ldc2_w 22199116
    //   12631: l2i
    //   12632: ldc_w 291946602
    //   12635: ixor
    //   12636: ixor
    //   12637: lookupswitch default -> 12664, -1766188359 -> 12620, -1620376688 -> 15635
    //   12664: iload #13
    //   12666: ifeq -> 12680
    //   12669: ldc2_w -5204853
    //   12672: l2i
    //   12673: ldc_w -868374299
    //   12676: ixor
    //   12677: goto -> 12688
    //   12680: ldc2_w -741628157
    //   12683: l2i
    //   12684: ldc_w -532243604
    //   12687: ixor
    //   12688: ldc2_w -722164505
    //   12691: l2i
    //   12692: ldc_w 634048577
    //   12695: ixor
    //   12696: ixor
    //   12697: tableswitch default -> 12669, -1028437816 -> 12720, -1028437815 -> 13727
    //   12720: getstatic Perryc.c : I
    //   12723: iflt -> 12737
    //   12726: ldc2_w 929995102
    //   12729: l2i
    //   12730: ldc_w 1938131165
    //   12733: ixor
    //   12734: goto -> 12745
    //   12737: ldc2_w 1420026349
    //   12740: l2i
    //   12741: ldc_w 2104841475
    //   12744: ixor
    //   12745: ldc2_w 2066253050
    //   12748: l2i
    //   12749: ldc_w -2018487078
    //   12752: ixor
    //   12753: ixor
    //   12754: lookupswitch default -> 15611, -1200373341 -> 12737, -716282674 -> 12780
    //   12780: aload_0
    //   12781: getstatic Perryc.c : I
    //   12784: iflt -> 12798
    //   12787: ldc2_w 1267095548
    //   12790: l2i
    //   12791: ldc_w -69414954
    //   12794: ixor
    //   12795: goto -> 12806
    //   12798: ldc2_w 2058975082
    //   12801: l2i
    //   12802: ldc_w 1994533806
    //   12805: ixor
    //   12806: ldc2_w -2028810308
    //   12809: l2i
    //   12810: ldc_w 1438421772
    //   12813: ixor
    //   12814: ixor
    //   12815: lookupswitch default -> 12840, 794366603 -> 12798, 1660208282 -> 15715
    //   12840: dload_2
    //   12841: getstatic Perryc.0 : I
    //   12844: ifle -> 12858
    //   12847: ldc2_w 1788635389
    //   12850: l2i
    //   12851: ldc_w -207988845
    //   12854: ixor
    //   12855: goto -> 12866
    //   12858: ldc2_w 278263796
    //   12861: l2i
    //   12862: ldc_w -548043655
    //   12865: ixor
    //   12866: ldc2_w 541551196
    //   12869: l2i
    //   12870: ldc_w 661829183
    //   12873: ixor
    //   12874: ixor
    //   12875: lookupswitch default -> 12900, -1640766707 -> 15603, 291257651 -> 12858
    //   12900: dload #4
    //   12902: getstatic Perryc.0 : I
    //   12905: ifle -> 12919
    //   12908: ldc2_w 591647779
    //   12911: l2i
    //   12912: ldc_w 297083368
    //   12915: ixor
    //   12916: goto -> 12927
    //   12919: ldc2_w -298409580
    //   12922: l2i
    //   12923: ldc_w 1508873572
    //   12926: ixor
    //   12927: ldc2_w 1729978080
    //   12930: l2i
    //   12931: ldc_w 2118565814
    //   12934: ixor
    //   12935: ixor
    //   12936: lookupswitch default -> 12964, 732763293 -> 15637, 1543445262 -> 12919
    //   12964: aload #8
    //   12966: getstatic Perryc.0 : I
    //   12969: ifle -> 12983
    //   12972: ldc2_w -1679403492
    //   12975: l2i
    //   12976: ldc_w -39619624
    //   12979: ixor
    //   12980: goto -> 12991
    //   12983: ldc2_w -1280805112
    //   12986: l2i
    //   12987: ldc_w -229522782
    //   12990: ixor
    //   12991: ldc2_w 1307678376
    //   12994: l2i
    //   12995: ldc_w 1026785006
    //   12998: ixor
    //   12999: ixor
    //   13000: lookupswitch default -> 15939, 377998722 -> 12983, 825974252 -> 13028
    //   13028: iload #18
    //   13030: aaload
    //   13031: getstatic Perryc.0 : I
    //   13034: ifle -> 13048
    //   13037: ldc2_w -1217899736
    //   13040: l2i
    //   13041: ldc_w -1472072971
    //   13044: ixor
    //   13045: goto -> 13056
    //   13048: ldc2_w -770902169
    //   13051: l2i
    //   13052: ldc_w 1426908456
    //   13055: ixor
    //   13056: ldc2_w 1239843515
    //   13059: l2i
    //   13060: ldc_w 804169845
    //   13063: ixor
    //   13064: ixor
    //   13065: lookupswitch default -> 13092, 1585151318 -> 13048, 2032241427 -> 15899
    //   13092: getfield height : I
    //   13095: ldc2_w -1686954545
    //   13098: l2i
    //   13099: ldc_w -1686954547
    //   13102: ixor
    //   13103: idiv
    //   13104: i2d
    //   13105: dadd
    //   13106: getstatic Perryc.c : I
    //   13109: iflt -> 13123
    //   13112: ldc2_w 10701021
    //   13115: l2i
    //   13116: ldc_w 2048419353
    //   13119: ixor
    //   13120: goto -> 13131
    //   13123: ldc2_w 659604946
    //   13126: l2i
    //   13127: ldc_w 609408852
    //   13130: ixor
    //   13131: ldc2_w -1134853008
    //   13134: l2i
    //   13135: ldc_w 1064614901
    //   13138: ixor
    //   13139: ixor
    //   13140: lookupswitch default -> 15869, -2144523005 -> 13168, -107736767 -> 13123
    //   13168: dload_2
    //   13169: getstatic Perryc.c : I
    //   13172: iflt -> 13186
    //   13175: ldc2_w -1055459699
    //   13178: l2i
    //   13179: ldc_w -2130946635
    //   13182: ixor
    //   13183: goto -> 13194
    //   13186: ldc2_w 1169634235
    //   13189: l2i
    //   13190: ldc_w -747009077
    //   13193: ixor
    //   13194: ldc2_w 457348571
    //   13197: l2i
    //   13198: ldc_w -2097611196
    //   13201: ixor
    //   13202: ixor
    //   13203: lookupswitch default -> 15903, -665794393 -> 13186, 259314671 -> 13228
    //   13228: aload #8
    //   13230: getstatic Perryc.1 : I
    //   13233: ifeq -> 13247
    //   13236: ldc2_w -1234727083
    //   13239: l2i
    //   13240: ldc_w 228874234
    //   13243: ixor
    //   13244: goto -> 13255
    //   13247: ldc2_w 192320577
    //   13250: l2i
    //   13251: ldc_w -551436473
    //   13254: ixor
    //   13255: ldc2_w -1120022579
    //   13258: l2i
    //   13259: ldc_w -283395147
    //   13262: ixor
    //   13263: ixor
    //   13264: lookupswitch default -> 15615, -2039390338 -> 13292, -370823977 -> 13247
    //   13292: iload #18
    //   13294: aaload
    //   13295: getstatic Perryc.0 : I
    //   13298: ifle -> 13312
    //   13301: ldc2_w -1895156567
    //   13304: l2i
    //   13305: ldc_w -1425354998
    //   13308: ixor
    //   13309: goto -> 13320
    //   13312: ldc2_w -6979929
    //   13315: l2i
    //   13316: ldc_w 1394771815
    //   13319: ixor
    //   13320: ldc2_w 789298479
    //   13323: l2i
    //   13324: ldc_w 716061236
    //   13327: ixor
    //   13328: ixor
    //   13329: lookupswitch default -> 15735, -1458405669 -> 13356, 564493496 -> 13312
    //   13356: getfield width : I
    //   13359: i2d
    //   13360: dadd
    //   13361: ldc2_w 0.19567354822795813
    //   13364: invokestatic doubleToLongBits : (D)J
    //   13367: ldc2_w 9216911120523749880
    //   13370: lxor
    //   13371: invokestatic longBitsToDouble : (J)D
    //   13374: dsub
    //   13375: getstatic Perryc.0 : I
    //   13378: ifle -> 13392
    //   13381: ldc2_w -602679145
    //   13384: l2i
    //   13385: ldc_w -888613903
    //   13388: ixor
    //   13389: goto -> 13400
    //   13392: ldc2_w -1188220709
    //   13395: l2i
    //   13396: ldc_w -95997698
    //   13399: ixor
    //   13400: ldc2_w -1276232955
    //   13403: l2i
    //   13404: ldc_w -1589213441
    //   13407: ixor
    //   13408: ixor
    //   13409: lookupswitch default -> 15879, 95663772 -> 13392, 1371717087 -> 13436
    //   13436: dload #4
    //   13438: getstatic Perryc.1 : I
    //   13441: ifeq -> 13455
    //   13444: ldc2_w 110024823
    //   13447: l2i
    //   13448: ldc_w -345671840
    //   13451: ixor
    //   13452: goto -> 13463
    //   13455: ldc2_w -1974087524
    //   13458: l2i
    //   13459: ldc_w 1307102289
    //   13462: ixor
    //   13463: ldc2_w -2080358602
    //   13466: l2i
    //   13467: ldc_w -23965725
    //   13470: ixor
    //   13471: ixor
    //   13472: lookupswitch default -> 15763, -1753620542 -> 13455, -1120965608 -> 13500
    //   13500: aload #8
    //   13502: getstatic Perryc.1 : I
    //   13505: ifeq -> 13519
    //   13508: ldc2_w 1333209191
    //   13511: l2i
    //   13512: ldc_w 1966752712
    //   13515: ixor
    //   13516: goto -> 13527
    //   13519: ldc2_w -62487664
    //   13522: l2i
    //   13523: ldc_w -269005793
    //   13526: ixor
    //   13527: ldc2_w -636149904
    //   13530: l2i
    //   13531: ldc_w 2045596707
    //   13534: ixor
    //   13535: ixor
    //   13536: lookupswitch default -> 15609, -1716182788 -> 13519, -1337359140 -> 13564
    //   13564: iload #18
    //   13566: aaload
    //   13567: getstatic Perryc.c : I
    //   13570: iflt -> 13584
    //   13573: ldc2_w 570754245
    //   13576: l2i
    //   13577: ldc_w 1511085381
    //   13580: ixor
    //   13581: goto -> 13592
    //   13584: ldc2_w 1132032143
    //   13587: l2i
    //   13588: ldc_w -842552613
    //   13591: ixor
    //   13592: ldc2_w 166410048
    //   13595: l2i
    //   13596: ldc_w -294907121
    //   13599: ixor
    //   13600: ixor
    //   13601: lookupswitch default -> 13628, -1617726001 -> 15923, 2033227739 -> 13584
    //   13628: getfield height : I
    //   13631: ldc2_w -1655205262
    //   13634: l2i
    //   13635: ldc_w -1655205264
    //   13638: ixor
    //   13639: idiv
    //   13640: i2d
    //   13641: dadd
    //   13642: ldc_w 4.412784
    //   13645: invokestatic floatToIntBits : (F)I
    //   13648: ldc_w 2131572103
    //   13651: ixor
    //   13652: invokestatic intBitsToFloat : (I)F
    //   13655: getstatic Perryc.1 : I
    //   13658: ifeq -> 13672
    //   13661: ldc2_w 110945498
    //   13664: l2i
    //   13665: ldc_w -514325580
    //   13668: ixor
    //   13669: goto -> 13680
    //   13672: ldc2_w 715635797
    //   13675: l2i
    //   13676: ldc_w 1907034911
    //   13679: ixor
    //   13680: ldc2_w 555862437
    //   13683: l2i
    //   13684: ldc_w 1280262587
    //   13687: ixor
    //   13688: ixor
    //   13689: lookupswitch default -> 13716, -1968541840 -> 15793, 1631290065 -> 13672
    //   13716: goto -> 13720
    //   13719: athrow
    //   13720: invokespecial drawLine : (DDDDF)V
    //   13723: goto -> 13727
    //   13726: athrow
    //   13727: getstatic Perryc.c : I
    //   13730: iflt -> 13744
    //   13733: ldc2_w 1518316815
    //   13736: l2i
    //   13737: ldc_w 441595569
    //   13740: ixor
    //   13741: goto -> 13752
    //   13744: ldc2_w 1725424859
    //   13747: l2i
    //   13748: ldc_w 1132872234
    //   13751: ixor
    //   13752: ldc2_w 2092519471
    //   13755: l2i
    //   13756: ldc_w -722727552
    //   13759: ixor
    //   13760: ixor
    //   13761: lookupswitch default -> 15919, -1929053346 -> 13788, -394738159 -> 13744
    //   13788: iload #14
    //   13790: ifeq -> 13804
    //   13793: ldc2_w -1310921308
    //   13796: l2i
    //   13797: ldc_w 1346427861
    //   13800: ixor
    //   13801: goto -> 13812
    //   13804: ldc2_w 1853991160
    //   13807: l2i
    //   13808: ldc_w -1893884280
    //   13811: ixor
    //   13812: ldc2_w -228029201
    //   13815: l2i
    //   13816: ldc_w 1642979900
    //   13819: ixor
    //   13820: ixor
    //   13821: tableswitch default -> 13793, 1914263714 -> 13844, 1914263715 -> 14859
    //   13844: getstatic Perryc.0 : I
    //   13847: ifle -> 13861
    //   13850: ldc2_w 78583570
    //   13853: l2i
    //   13854: ldc_w 840379732
    //   13857: ixor
    //   13858: goto -> 13869
    //   13861: ldc2_w 1232156280
    //   13864: l2i
    //   13865: ldc_w 1750734090
    //   13868: ixor
    //   13869: ldc2_w 859287399
    //   13872: l2i
    //   13873: ldc_w -1059387053
    //   13876: ixor
    //   13877: ixor
    //   13878: lookupswitch default -> 15895, -984310670 -> 13861, -758676154 -> 13904
    //   13904: aload_0
    //   13905: getstatic Perryc.c : I
    //   13908: iflt -> 13922
    //   13911: ldc2_w 1162955647
    //   13914: l2i
    //   13915: ldc_w 2130882002
    //   13918: ixor
    //   13919: goto -> 13930
    //   13922: ldc2_w -127690431
    //   13925: l2i
    //   13926: ldc_w 1078064712
    //   13929: ixor
    //   13930: ldc2_w 1486088777
    //   13933: l2i
    //   13934: ldc_w 832210286
    //   13937: ixor
    //   13938: ixor
    //   13939: lookupswitch default -> 13964, 1398442378 -> 15837, 1581201609 -> 13922
    //   13964: dload_2
    //   13965: getstatic Perryc.c : I
    //   13968: iflt -> 13982
    //   13971: ldc2_w -816679626
    //   13974: l2i
    //   13975: ldc_w -123895655
    //   13978: ixor
    //   13979: goto -> 13990
    //   13982: ldc2_w 1405044836
    //   13985: l2i
    //   13986: ldc_w 2017057309
    //   13989: ixor
    //   13990: ldc2_w -73671175
    //   13993: l2i
    //   13994: ldc_w -832211260
    //   13997: ixor
    //   13998: ixor
    //   13999: lookupswitch default -> 15575, 36789906 -> 13982, 511195460 -> 14024
    //   14024: dload #4
    //   14026: getstatic Perryc.1 : I
    //   14029: ifeq -> 14043
    //   14032: ldc2_w 408407719
    //   14035: l2i
    //   14036: ldc_w 279063806
    //   14039: ixor
    //   14040: goto -> 14051
    //   14043: ldc2_w 2142004520
    //   14046: l2i
    //   14047: ldc_w -549206980
    //   14050: ixor
    //   14051: ldc2_w -386785144
    //   14054: l2i
    //   14055: ldc_w 1542762880
    //   14058: ixor
    //   14059: ixor
    //   14060: lookupswitch default -> 15765, -1141673135 -> 14043, 334049308 -> 14088
    //   14088: aload #8
    //   14090: getstatic Perryc.0 : I
    //   14093: ifle -> 14107
    //   14096: ldc2_w 1920987703
    //   14099: l2i
    //   14100: ldc_w 1834558630
    //   14103: ixor
    //   14104: goto -> 14115
    //   14107: ldc2_w -1255235945
    //   14110: l2i
    //   14111: ldc_w -1148639216
    //   14114: ixor
    //   14115: ldc2_w 2125441913
    //   14118: l2i
    //   14119: ldc_w 1696077298
    //   14122: ixor
    //   14123: ixor
    //   14124: lookupswitch default -> 14152, -1028716562 -> 14107, 76638234 -> 15661
    //   14152: iload #18
    //   14154: aaload
    //   14155: getstatic Perryc.1 : I
    //   14158: ifeq -> 14172
    //   14161: ldc2_w 1920240271
    //   14164: l2i
    //   14165: ldc_w 549280345
    //   14168: ixor
    //   14169: goto -> 14180
    //   14172: ldc2_w 1528373772
    //   14175: l2i
    //   14176: ldc_w 1398219186
    //   14179: ixor
    //   14180: ldc2_w -281966914
    //   14183: l2i
    //   14184: ldc_w 1622316358
    //   14187: ixor
    //   14188: ixor
    //   14189: lookupswitch default -> 14216, -582302930 -> 15631, 93530537 -> 14172
    //   14216: getfield height : I
    //   14219: i2d
    //   14220: dadd
    //   14221: ldc2_w 0.11035713762243259
    //   14224: invokestatic doubleToLongBits : (D)J
    //   14227: ldc2_w 9204302508912537823
    //   14230: lxor
    //   14231: invokestatic longBitsToDouble : (J)D
    //   14234: dsub
    //   14235: getstatic Perryc.1 : I
    //   14238: ifeq -> 14252
    //   14241: ldc2_w 706581778
    //   14244: l2i
    //   14245: ldc_w -1945614825
    //   14248: ixor
    //   14249: goto -> 14260
    //   14252: ldc2_w 1614768346
    //   14255: l2i
    //   14256: ldc_w 135650184
    //   14259: ixor
    //   14260: ldc2_w 1268434130
    //   14263: l2i
    //   14264: ldc_w -1411403938
    //   14267: ixor
    //   14268: ixor
    //   14269: lookupswitch default -> 15555, -2005935906 -> 14296, 1179695241 -> 14252
    //   14296: dload_2
    //   14297: getstatic Perryc.0 : I
    //   14300: ifle -> 14314
    //   14303: ldc2_w -727233473
    //   14306: l2i
    //   14307: ldc_w -162977731
    //   14310: ixor
    //   14311: goto -> 14322
    //   14314: ldc2_w -1860733554
    //   14317: l2i
    //   14318: ldc_w -880162937
    //   14321: ixor
    //   14322: ldc2_w 228185221
    //   14325: l2i
    //   14326: ldc_w 1300851182
    //   14329: ixor
    //   14330: ixor
    //   14331: lookupswitch default -> 15605, 445517666 -> 14356, 1660868969 -> 14314
    //   14356: aload #8
    //   14358: getstatic Perryc.1 : I
    //   14361: ifeq -> 14375
    //   14364: ldc2_w -1692674323
    //   14367: l2i
    //   14368: ldc_w -1236118954
    //   14371: ixor
    //   14372: goto -> 14383
    //   14375: ldc2_w -747147187
    //   14378: l2i
    //   14379: ldc_w -548784840
    //   14382: ixor
    //   14383: ldc2_w 1066292927
    //   14386: l2i
    //   14387: ldc_w -1228129902
    //   14390: ixor
    //   14391: ixor
    //   14392: lookupswitch default -> 14420, -1542722666 -> 15751, 935981764 -> 14375
    //   14420: iload #18
    //   14422: aaload
    //   14423: getstatic Perryc.c : I
    //   14426: iflt -> 14440
    //   14429: ldc2_w -215064240
    //   14432: l2i
    //   14433: ldc_w -258654786
    //   14436: ixor
    //   14437: goto -> 14448
    //   14440: ldc2_w 1939598402
    //   14443: l2i
    //   14444: ldc_w 1899596936
    //   14447: ixor
    //   14448: ldc2_w -2008178228
    //   14451: l2i
    //   14452: ldc_w 1683603887
    //   14455: ixor
    //   14456: ixor
    //   14457: lookupswitch default -> 15593, -290062167 -> 14484, -273728371 -> 14440
    //   14484: getfield width : I
    //   14487: i2d
    //   14488: dadd
    //   14489: ldc2_w 0.02099311661103406
    //   14492: invokestatic doubleToLongBits : (D)J
    //   14495: ldc2_w 9202401292987947927
    //   14498: lxor
    //   14499: invokestatic longBitsToDouble : (J)D
    //   14502: dsub
    //   14503: getstatic Perryc.c : I
    //   14506: iflt -> 14520
    //   14509: ldc2_w -1624243190
    //   14512: l2i
    //   14513: ldc_w -1478606952
    //   14516: ixor
    //   14517: goto -> 14528
    //   14520: ldc2_w -317773508
    //   14523: l2i
    //   14524: ldc_w -1457252237
    //   14527: ixor
    //   14528: ldc2_w 1277763079
    //   14531: l2i
    //   14532: ldc_w -829526707
    //   14535: ixor
    //   14536: ixor
    //   14537: lookupswitch default -> 14564, -1169602344 -> 15953, -1058782978 -> 14520
    //   14564: dload #4
    //   14566: getstatic Perryc.0 : I
    //   14569: ifle -> 14583
    //   14572: ldc2_w 2015726933
    //   14575: l2i
    //   14576: ldc_w 1320134245
    //   14579: ixor
    //   14580: goto -> 14591
    //   14583: ldc2_w 126785858
    //   14586: l2i
    //   14587: ldc_w -470985994
    //   14590: ixor
    //   14591: ldc2_w -1647231645
    //   14594: l2i
    //   14595: ldc_w -381918344
    //   14598: ixor
    //   14599: ixor
    //   14600: lookupswitch default -> 14628, -1753901945 -> 14583, 1114076459 -> 15825
    //   14628: aload #8
    //   14630: getstatic Perryc.c : I
    //   14633: iflt -> 14647
    //   14636: ldc2_w 2050645287
    //   14639: l2i
    //   14640: ldc_w -1036209423
    //   14643: ixor
    //   14644: goto -> 14655
    //   14647: ldc2_w -1865889297
    //   14650: l2i
    //   14651: ldc_w -1499797552
    //   14654: ixor
    //   14655: ldc2_w -1165247923
    //   14658: l2i
    //   14659: ldc_w -1631856021
    //   14662: ixor
    //   14663: ixor
    //   14664: lookupswitch default -> 14692, -1674145808 -> 15745, -212977282 -> 14647
    //   14692: iload #18
    //   14694: aaload
    //   14695: getstatic Perryc.c : I
    //   14698: iflt -> 14712
    //   14701: ldc2_w 1922084761
    //   14704: l2i
    //   14705: ldc_w -996082527
    //   14708: ixor
    //   14709: goto -> 14720
    //   14712: ldc2_w 1753766146
    //   14715: l2i
    //   14716: ldc_w -721136715
    //   14719: ixor
    //   14720: ldc2_w -825919225
    //   14723: l2i
    //   14724: ldc_w 840148144
    //   14727: ixor
    //   14728: ixor
    //   14729: lookupswitch default -> 15591, 1096472320 -> 14756, 1256623759 -> 14712
    //   14756: getfield height : I
    //   14759: i2d
    //   14760: dadd
    //   14761: ldc2_w 0.5949409706548904
    //   14764: invokestatic doubleToLongBits : (D)J
    //   14767: ldc2_w 9215219989840161931
    //   14770: lxor
    //   14771: invokestatic longBitsToDouble : (J)D
    //   14774: dsub
    //   14775: ldc_w 7.1174836
    //   14778: invokestatic floatToIntBits : (F)I
    //   14781: ldc_w 2137244269
    //   14784: ixor
    //   14785: invokestatic intBitsToFloat : (I)F
    //   14788: getstatic Perryc.0 : I
    //   14791: ifle -> 14805
    //   14794: ldc2_w -781780545
    //   14797: l2i
    //   14798: ldc_w 249579650
    //   14801: ixor
    //   14802: goto -> 14813
    //   14805: ldc2_w -433659438
    //   14808: l2i
    //   14809: ldc_w -1489121727
    //   14812: ixor
    //   14813: ldc2_w -1463456962
    //   14816: l2i
    //   14817: ldc_w 124455294
    //   14820: ixor
    //   14821: ixor
    //   14822: lookupswitch default -> 14848, 1343989287 -> 14805, 1881723773 -> 15925
    //   14848: goto -> 14852
    //   14851: athrow
    //   14852: invokespecial drawLine : (DDDDF)V
    //   14855: goto -> 14859
    //   14858: athrow
    //   14859: getstatic Perryc.1 : I
    //   14862: ifeq -> 14876
    //   14865: ldc2_w -905408840
    //   14868: l2i
    //   14869: ldc_w 1116788609
    //   14872: ixor
    //   14873: goto -> 14884
    //   14876: ldc2_w -2052191321
    //   14879: l2i
    //   14880: ldc_w 691844693
    //   14883: ixor
    //   14884: ldc2_w -1418719994
    //   14887: l2i
    //   14888: ldc_w -1490564785
    //   14891: ixor
    //   14892: ixor
    //   14893: lookupswitch default -> 14920, -2066768528 -> 15801, -144581531 -> 14876
    //   14920: dload_2
    //   14921: getstatic Perryc.c : I
    //   14924: iflt -> 14938
    //   14927: ldc2_w 403150528
    //   14930: l2i
    //   14931: ldc_w 1974755087
    //   14934: ixor
    //   14935: goto -> 14946
    //   14938: ldc2_w -1186421814
    //   14941: l2i
    //   14942: ldc_w -504805483
    //   14945: ixor
    //   14946: ldc2_w -706075589
    //   14949: l2i
    //   14950: ldc_w -928326454
    //   14953: ixor
    //   14954: ixor
    //   14955: lookupswitch default -> 14980, -1383642243 -> 14938, 1894986046 -> 15759
    //   14980: aload #8
    //   14982: getstatic Perryc.c : I
    //   14985: iflt -> 14999
    //   14988: ldc2_w -1619907227
    //   14991: l2i
    //   14992: ldc_w 947899896
    //   14995: ixor
    //   14996: goto -> 15007
    //   14999: ldc2_w -1701928463
    //   15002: l2i
    //   15003: ldc_w -854051619
    //   15006: ixor
    //   15007: ldc2_w -813295494
    //   15010: l2i
    //   15011: ldc_w -712699148
    //   15014: ixor
    //   15015: ixor
    //   15016: lookupswitch default -> 15044, -1123096045 -> 15737, 249843207 -> 14999
    //   15044: iload #18
    //   15046: aaload
    //   15047: getstatic Perryc.0 : I
    //   15050: ifle -> 15064
    //   15053: ldc2_w 283750651
    //   15056: l2i
    //   15057: ldc_w 217960150
    //   15060: ixor
    //   15061: goto -> 15072
    //   15064: ldc2_w -532336384
    //   15067: l2i
    //   15068: ldc_w 601165958
    //   15071: ixor
    //   15072: ldc2_w 684848362
    //   15075: l2i
    //   15076: ldc_w -829432935
    //   15079: ixor
    //   15080: ixor
    //   15081: lookupswitch default -> 15108, -266421603 -> 15064, -95792802 -> 15815
    //   15108: getfield width : I
    //   15111: ldc2_w -764909125
    //   15114: l2i
    //   15115: ldc_w -764909133
    //   15118: ixor
    //   15119: isub
    //   15120: getstatic Perryc.c : I
    //   15123: iflt -> 15137
    //   15126: ldc2_w -245645307
    //   15129: l2i
    //   15130: ldc_w 283213443
    //   15133: ixor
    //   15134: goto -> 15145
    //   15137: ldc2_w -1158621216
    //   15140: l2i
    //   15141: ldc_w -1585774318
    //   15144: ixor
    //   15145: ldc2_w -534313308
    //   15148: l2i
    //   15149: ldc_w -1263213930
    //   15152: ixor
    //   15153: ixor
    //   15154: lookupswitch default -> 15607, -1255581004 -> 15137, 1326985920 -> 15180
    //   15180: aload_0
    //   15181: getstatic Perryc.0 : I
    //   15184: ifle -> 15198
    //   15187: ldc2_w -393036826
    //   15190: l2i
    //   15191: ldc_w 1416896029
    //   15194: ixor
    //   15195: goto -> 15206
    //   15198: ldc2_w 1967896026
    //   15201: l2i
    //   15202: ldc_w 236145454
    //   15205: ixor
    //   15206: ldc2_w 518026497
    //   15209: l2i
    //   15210: ldc_w -495325125
    //   15213: ixor
    //   15214: ixor
    //   15215: lookupswitch default -> 15240, -1818857834 -> 15198, 1082073281 -> 15621
    //   15240: getfield charOffset : I
    //   15243: iadd
    //   15244: i2d
    //   15245: dadd
    //   15246: getstatic Perryc.1 : I
    //   15249: ifeq -> 15263
    //   15252: ldc2_w 642057867
    //   15255: l2i
    //   15256: ldc_w 293396664
    //   15259: ixor
    //   15260: goto -> 15271
    //   15263: ldc2_w 69425879
    //   15266: l2i
    //   15267: ldc_w -1886138083
    //   15270: ixor
    //   15271: ldc2_w 1074389772
    //   15274: l2i
    //   15275: ldc_w -26801862
    //   15278: ixor
    //   15279: ixor
    //   15280: lookupswitch default -> 15639, -1990783995 -> 15263, 903766524 -> 15308
    //   15308: dstore_2
    //   15309: iinc #17, 1
    //   15312: goto -> 4034
    //   15315: ldc2_w -1843577050
    //   15318: l2i
    //   15319: ldc_w -1843580043
    //   15322: ixor
    //   15323: ldc2_w 1222742257
    //   15326: l2i
    //   15327: ldc_w 1222738417
    //   15330: ixor
    //   15331: getstatic Perryc.0 : I
    //   15334: ifle -> 15348
    //   15337: ldc2_w -385901209
    //   15340: l2i
    //   15341: ldc_w -1787425338
    //   15344: ixor
    //   15345: goto -> 15356
    //   15348: ldc2_w -786502600
    //   15351: l2i
    //   15352: ldc_w 1607647597
    //   15355: ixor
    //   15356: ldc2_w -639126538
    //   15359: l2i
    //   15360: ldc_w -612671522
    //   15363: ixor
    //   15364: ixor
    //   15365: lookupswitch default -> 15883, -1940864643 -> 15392, 2132114569 -> 15348
    //   15392: goto -> 15396
    //   15395: athrow
    //   15396: invokestatic glHint : (II)V
    //   15399: goto -> 15403
    //   15402: athrow
    //   15403: getstatic Perryc.0 : I
    //   15406: ifle -> 15420
    //   15409: ldc2_w 812422177
    //   15412: l2i
    //   15413: ldc_w -1193089720
    //   15416: ixor
    //   15417: goto -> 15428
    //   15420: ldc2_w 1345203001
    //   15423: l2i
    //   15424: ldc_w -760293099
    //   15427: ixor
    //   15428: ldc2_w 246573450
    //   15431: l2i
    //   15432: ldc_w -1435738041
    //   15435: ixor
    //   15436: ixor
    //   15437: lookupswitch default -> 15464, -2000941554 -> 15420, 743471268 -> 15749
    //   15464: goto -> 15468
    //   15467: athrow
    //   15468: invokestatic glPopMatrix : ()V
    //   15471: goto -> 15475
    //   15474: athrow
    //   15475: getstatic Perryc.c : I
    //   15478: iflt -> 15492
    //   15481: ldc2_w 660631488
    //   15484: l2i
    //   15485: ldc_w -1989773367
    //   15488: ixor
    //   15489: goto -> 15500
    //   15492: ldc2_w 788571499
    //   15495: l2i
    //   15496: ldc_w -2033451861
    //   15499: ixor
    //   15500: ldc2_w -1165584817
    //   15503: l2i
    //   15504: ldc_w 768234269
    //   15507: ixor
    //   15508: ixor
    //   15509: lookupswitch default -> 15536, -838531118 -> 15492, 961207643 -> 15649
    //   15536: dload_2
    //   15537: d2f
    //   15538: ldc_w 0.64618385
    //   15541: invokestatic floatToIntBits : (F)I
    //   15544: ldc_w 2133158990
    //   15547: ixor
    //   15548: invokestatic intBitsToFloat : (I)F
    //   15551: fdiv
    //   15552: freturn
    //   15553: aconst_null
    //   15554: athrow
    //   15555: aconst_null
    //   15556: athrow
    //   15557: aconst_null
    //   15558: athrow
    //   15559: aconst_null
    //   15560: athrow
    //   15561: aconst_null
    //   15562: athrow
    //   15563: aconst_null
    //   15564: athrow
    //   15565: aconst_null
    //   15566: athrow
    //   15567: aconst_null
    //   15568: athrow
    //   15569: aconst_null
    //   15570: athrow
    //   15571: aconst_null
    //   15572: athrow
    //   15573: aconst_null
    //   15574: athrow
    //   15575: aconst_null
    //   15576: athrow
    //   15577: aconst_null
    //   15578: athrow
    //   15579: aconst_null
    //   15580: athrow
    //   15581: aconst_null
    //   15582: athrow
    //   15583: aconst_null
    //   15584: athrow
    //   15585: aconst_null
    //   15586: athrow
    //   15587: aconst_null
    //   15588: athrow
    //   15589: aconst_null
    //   15590: athrow
    //   15591: aconst_null
    //   15592: athrow
    //   15593: aconst_null
    //   15594: athrow
    //   15595: aconst_null
    //   15596: athrow
    //   15597: aconst_null
    //   15598: athrow
    //   15599: aconst_null
    //   15600: athrow
    //   15601: aconst_null
    //   15602: athrow
    //   15603: aconst_null
    //   15604: athrow
    //   15605: aconst_null
    //   15606: athrow
    //   15607: aconst_null
    //   15608: athrow
    //   15609: aconst_null
    //   15610: athrow
    //   15611: aconst_null
    //   15612: athrow
    //   15613: aconst_null
    //   15614: athrow
    //   15615: aconst_null
    //   15616: athrow
    //   15617: aconst_null
    //   15618: athrow
    //   15619: aconst_null
    //   15620: athrow
    //   15621: aconst_null
    //   15622: athrow
    //   15623: aconst_null
    //   15624: athrow
    //   15625: aconst_null
    //   15626: athrow
    //   15627: aconst_null
    //   15628: athrow
    //   15629: aconst_null
    //   15630: athrow
    //   15631: aconst_null
    //   15632: athrow
    //   15633: aconst_null
    //   15634: athrow
    //   15635: aconst_null
    //   15636: athrow
    //   15637: aconst_null
    //   15638: athrow
    //   15639: aconst_null
    //   15640: athrow
    //   15641: aconst_null
    //   15642: athrow
    //   15643: aconst_null
    //   15644: athrow
    //   15645: aconst_null
    //   15646: athrow
    //   15647: aconst_null
    //   15648: athrow
    //   15649: aconst_null
    //   15650: athrow
    //   15651: aconst_null
    //   15652: athrow
    //   15653: aconst_null
    //   15654: athrow
    //   15655: aconst_null
    //   15656: athrow
    //   15657: aconst_null
    //   15658: athrow
    //   15659: aconst_null
    //   15660: athrow
    //   15661: aconst_null
    //   15662: athrow
    //   15663: aconst_null
    //   15664: athrow
    //   15665: aconst_null
    //   15666: athrow
    //   15667: aconst_null
    //   15668: athrow
    //   15669: aconst_null
    //   15670: athrow
    //   15671: aconst_null
    //   15672: athrow
    //   15673: aconst_null
    //   15674: athrow
    //   15675: aconst_null
    //   15676: athrow
    //   15677: aconst_null
    //   15678: athrow
    //   15679: aconst_null
    //   15680: athrow
    //   15681: aconst_null
    //   15682: athrow
    //   15683: aconst_null
    //   15684: athrow
    //   15685: aconst_null
    //   15686: athrow
    //   15687: aconst_null
    //   15688: athrow
    //   15689: aconst_null
    //   15690: athrow
    //   15691: aconst_null
    //   15692: athrow
    //   15693: aconst_null
    //   15694: athrow
    //   15695: aconst_null
    //   15696: athrow
    //   15697: aconst_null
    //   15698: athrow
    //   15699: aconst_null
    //   15700: athrow
    //   15701: aconst_null
    //   15702: athrow
    //   15703: aconst_null
    //   15704: athrow
    //   15705: aconst_null
    //   15706: athrow
    //   15707: aconst_null
    //   15708: athrow
    //   15709: aconst_null
    //   15710: athrow
    //   15711: aconst_null
    //   15712: athrow
    //   15713: aconst_null
    //   15714: athrow
    //   15715: aconst_null
    //   15716: athrow
    //   15717: aconst_null
    //   15718: athrow
    //   15719: aconst_null
    //   15720: athrow
    //   15721: aconst_null
    //   15722: athrow
    //   15723: aconst_null
    //   15724: athrow
    //   15725: aconst_null
    //   15726: athrow
    //   15727: aconst_null
    //   15728: athrow
    //   15729: aconst_null
    //   15730: athrow
    //   15731: aconst_null
    //   15732: athrow
    //   15733: aconst_null
    //   15734: athrow
    //   15735: aconst_null
    //   15736: athrow
    //   15737: aconst_null
    //   15738: athrow
    //   15739: aconst_null
    //   15740: athrow
    //   15741: aconst_null
    //   15742: athrow
    //   15743: aconst_null
    //   15744: athrow
    //   15745: aconst_null
    //   15746: athrow
    //   15747: aconst_null
    //   15748: athrow
    //   15749: aconst_null
    //   15750: athrow
    //   15751: aconst_null
    //   15752: athrow
    //   15753: aconst_null
    //   15754: athrow
    //   15755: aconst_null
    //   15756: athrow
    //   15757: aconst_null
    //   15758: athrow
    //   15759: aconst_null
    //   15760: athrow
    //   15761: aconst_null
    //   15762: athrow
    //   15763: aconst_null
    //   15764: athrow
    //   15765: aconst_null
    //   15766: athrow
    //   15767: aconst_null
    //   15768: athrow
    //   15769: aconst_null
    //   15770: athrow
    //   15771: aconst_null
    //   15772: athrow
    //   15773: aconst_null
    //   15774: athrow
    //   15775: aconst_null
    //   15776: athrow
    //   15777: aconst_null
    //   15778: athrow
    //   15779: aconst_null
    //   15780: athrow
    //   15781: aconst_null
    //   15782: athrow
    //   15783: aconst_null
    //   15784: athrow
    //   15785: aconst_null
    //   15786: athrow
    //   15787: aconst_null
    //   15788: athrow
    //   15789: aconst_null
    //   15790: athrow
    //   15791: aconst_null
    //   15792: athrow
    //   15793: aconst_null
    //   15794: athrow
    //   15795: aconst_null
    //   15796: athrow
    //   15797: aconst_null
    //   15798: athrow
    //   15799: aconst_null
    //   15800: athrow
    //   15801: aconst_null
    //   15802: athrow
    //   15803: aconst_null
    //   15804: athrow
    //   15805: aconst_null
    //   15806: athrow
    //   15807: aconst_null
    //   15808: athrow
    //   15809: aconst_null
    //   15810: athrow
    //   15811: aconst_null
    //   15812: athrow
    //   15813: aconst_null
    //   15814: athrow
    //   15815: aconst_null
    //   15816: athrow
    //   15817: aconst_null
    //   15818: athrow
    //   15819: aconst_null
    //   15820: athrow
    //   15821: aconst_null
    //   15822: athrow
    //   15823: aconst_null
    //   15824: athrow
    //   15825: aconst_null
    //   15826: athrow
    //   15827: aconst_null
    //   15828: athrow
    //   15829: aconst_null
    //   15830: athrow
    //   15831: aconst_null
    //   15832: athrow
    //   15833: aconst_null
    //   15834: athrow
    //   15835: aconst_null
    //   15836: athrow
    //   15837: aconst_null
    //   15838: athrow
    //   15839: aconst_null
    //   15840: athrow
    //   15841: aconst_null
    //   15842: athrow
    //   15843: aconst_null
    //   15844: athrow
    //   15845: aconst_null
    //   15846: athrow
    //   15847: aconst_null
    //   15848: athrow
    //   15849: aconst_null
    //   15850: athrow
    //   15851: aconst_null
    //   15852: athrow
    //   15853: aconst_null
    //   15854: athrow
    //   15855: aconst_null
    //   15856: athrow
    //   15857: aconst_null
    //   15858: athrow
    //   15859: aconst_null
    //   15860: athrow
    //   15861: aconst_null
    //   15862: athrow
    //   15863: aconst_null
    //   15864: athrow
    //   15865: aconst_null
    //   15866: athrow
    //   15867: aconst_null
    //   15868: athrow
    //   15869: aconst_null
    //   15870: athrow
    //   15871: aconst_null
    //   15872: athrow
    //   15873: aconst_null
    //   15874: athrow
    //   15875: aconst_null
    //   15876: athrow
    //   15877: aconst_null
    //   15878: athrow
    //   15879: aconst_null
    //   15880: athrow
    //   15881: aconst_null
    //   15882: athrow
    //   15883: aconst_null
    //   15884: athrow
    //   15885: aconst_null
    //   15886: athrow
    //   15887: aconst_null
    //   15888: athrow
    //   15889: aconst_null
    //   15890: athrow
    //   15891: aconst_null
    //   15892: athrow
    //   15893: aconst_null
    //   15894: athrow
    //   15895: aconst_null
    //   15896: athrow
    //   15897: aconst_null
    //   15898: athrow
    //   15899: aconst_null
    //   15900: athrow
    //   15901: aconst_null
    //   15902: athrow
    //   15903: aconst_null
    //   15904: athrow
    //   15905: aconst_null
    //   15906: athrow
    //   15907: aconst_null
    //   15908: athrow
    //   15909: aconst_null
    //   15910: athrow
    //   15911: aconst_null
    //   15912: athrow
    //   15913: aconst_null
    //   15914: athrow
    //   15915: aconst_null
    //   15916: athrow
    //   15917: aconst_null
    //   15918: athrow
    //   15919: aconst_null
    //   15920: athrow
    //   15921: aconst_null
    //   15922: athrow
    //   15923: aconst_null
    //   15924: athrow
    //   15925: aconst_null
    //   15926: athrow
    //   15927: aconst_null
    //   15928: athrow
    //   15929: aconst_null
    //   15930: athrow
    //   15931: aconst_null
    //   15932: athrow
    //   15933: aconst_null
    //   15934: athrow
    //   15935: aconst_null
    //   15936: athrow
    //   15937: aconst_null
    //   15938: athrow
    //   15939: aconst_null
    //   15940: athrow
    //   15941: aconst_null
    //   15942: athrow
    //   15943: aconst_null
    //   15944: athrow
    //   15945: aconst_null
    //   15946: athrow
    //   15947: aconst_null
    //   15948: athrow
    //   15949: aconst_null
    //   15950: athrow
    //   15951: aconst_null
    //   15952: athrow
    //   15953: aconst_null
    //   15954: athrow
    //   15955: aconst_null
    //   15956: athrow
    //   15957: aconst_null
    //   15958: athrow
    //   15959: aconst_null
    //   15960: athrow
    //   15961: aconst_null
    //   15962: athrow
    //   15963: aconst_null
    //   15964: athrow
    //   15965: pop
    //   15966: goto -> 24
    //   15969: pop
    //   15970: aconst_null
    //   15971: goto -> 15965
    //   15974: dup
    //   15975: ifnull -> 15965
    //   15978: checkcast java/lang/Throwable
    //   15981: athrow
    //   15982: dup
    //   15983: ifnull -> 15969
    //   15986: checkcast java/lang/Throwable
    //   15989: athrow
    //   15990: aconst_null
    //   15991: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   6950	417	20	colorcode	I
    //   4850	6915	19	colorIndex	I
    //   4474	10835	18	character	C
    //   4034	11281	17	i	I
    //   3346	12129	16	size	I
    //   24	15529	0	this	Lbigname/zprestige/webhack/features/gui/font/CustomFont;
    //   24	15529	1	text	Ljava/lang/String;
    //   24	15529	2	x	D
    //   24	15529	4	y	D
    //   24	15529	6	color	I
    //   24	15529	7	shadow	Z
    //   1406	14147	8	currentData	[Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   1566	13987	9	alpha	F
    //   1638	13915	10	randomCase	Z
    //   1710	13843	11	bold	Z
    //   1782	13771	12	italic	Z
    //   1854	13699	13	strikethrough	Z
    //   1926	13627	14	underline	Z
    //   1998	13555	15	render	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	15974	finally
    //   2455	2462	2462	finally
    //   2455	2462	2462	java/util/NoSuchElementException
    //   2455	2462	3	finally
    //   2456	2462	2462	finally
    //   2456	2462	2455	java/lang/NumberFormatException
    //   2567	2574	2574	finally
    //   2567	2574	2567	java/lang/IllegalArgumentException
    //   2567	2574	2574	java/lang/IllegalArgumentException
    //   2567	2574	2574	java/lang/ArrayIndexOutOfBoundsException
    //   2568	2574	2574	finally
    //   2639	2646	2646	finally
    //   2639	2646	2646	finally
    //   2639	2646	2646	finally
    //   2639	2646	3	java/lang/UnsupportedOperationException
    //   2640	2646	2639	java/util/NoSuchElementException
    //   2727	2734	2734	finally
    //   2727	2734	2727	java/lang/IllegalStateException
    //   2728	2734	3	java/lang/ClassCastException
    //   2728	2734	2727	finally
    //   2728	2734	2734	finally
    //   3143	3150	3150	finally
    //   3143	3150	3	java/lang/NumberFormatException
    //   3144	3150	3150	java/lang/UnsupportedOperationException
    //   3144	3150	3143	java/lang/NumberFormatException
    //   3144	3150	3143	java/lang/ArithmeticException
    //   3275	3282	3282	finally
    //   3275	3282	3282	finally
    //   3276	3282	3282	java/lang/StringIndexOutOfBoundsException
    //   3276	3282	3282	finally
    //   3276	3282	3275	java/lang/NumberFormatException
    //   3411	3418	3418	finally
    //   3411	3418	3418	java/util/ConcurrentModificationException
    //   3412	3418	3411	finally
    //   3412	3418	3411	java/lang/AssertionError
    //   3412	3418	3411	java/lang/IllegalStateException
    //   3607	3614	3614	finally
    //   3607	3614	3607	java/lang/NumberFormatException
    //   3608	3614	3	finally
    //   3608	3614	3607	finally
    //   3608	3614	3	java/lang/IllegalArgumentException
    //   3679	3686	3686	finally
    //   3679	3686	3	java/util/NoSuchElementException
    //   3679	3686	3679	finally
    //   3680	3686	3686	java/lang/NegativeArraySizeException
    //   3680	3686	3	java/lang/IndexOutOfBoundsException
    //   3883	3890	3890	finally
    //   3883	3890	3883	java/lang/RuntimeException
    //   3883	3890	3	finally
    //   3883	3890	3	java/lang/IllegalArgumentException
    //   3884	3890	3890	finally
    //   3955	3962	3962	finally
    //   3955	3962	3955	finally
    //   3955	3962	3955	java/util/NoSuchElementException
    //   3956	3962	3962	java/lang/ClassCastException
    //   3956	3962	3962	java/lang/ArithmeticException
    //   4403	4410	4410	finally
    //   4403	4410	4410	finally
    //   4404	4410	3	java/lang/ClassCastException
    //   4404	4410	4403	java/lang/ArrayIndexOutOfBoundsException
    //   4404	4410	4410	java/lang/ClassCastException
    //   4850	4915	5265	java/lang/Exception
    //   4916	4922	4922	finally
    //   4916	4922	4922	java/lang/RuntimeException
    //   4916	4922	3	finally
    //   4916	4922	3	finally
    //   4916	4922	4922	finally
    //   4916	5262	5265	java/lang/Exception
    //   5119	5126	5126	finally
    //   5119	5126	5126	java/lang/UnsupportedOperationException
    //   5119	5126	5119	finally
    //   5119	5126	5126	java/util/ConcurrentModificationException
    //   5119	5126	5126	java/lang/ArrayIndexOutOfBoundsException
    //   5191	5198	5198	finally
    //   5191	5198	3	finally
    //   5191	5198	5198	java/lang/RuntimeException
    //   5191	5198	5191	java/lang/EnumConstantNotPresentException
    //   5192	5198	3	java/lang/ArithmeticException
    //   5999	6006	6006	finally
    //   5999	6006	6006	finally
    //   5999	6006	3	finally
    //   6000	6006	6006	finally
    //   6000	6006	5999	java/lang/IllegalStateException
    //   6071	6078	6078	finally
    //   6071	6078	6071	java/lang/NegativeArraySizeException
    //   6071	6078	6078	finally
    //   6072	6078	6078	finally
    //   6072	6078	6071	finally
    //   7359	7366	7366	finally
    //   7359	7366	3	finally
    //   7359	7366	7366	java/util/NoSuchElementException
    //   7360	7366	7359	finally
    //   7360	7366	7359	java/lang/UnsupportedOperationException
    //   8067	8074	8074	finally
    //   8067	8074	8074	finally
    //   8067	8074	8067	java/lang/ArrayIndexOutOfBoundsException
    //   8068	8074	8074	java/lang/IllegalStateException
    //   8068	8074	8074	finally
    //   8139	8146	8146	finally
    //   8139	8146	8146	java/util/ConcurrentModificationException
    //   8139	8146	8146	java/lang/RuntimeException
    //   8140	8146	8139	java/lang/ArithmeticException
    //   8140	8146	3	finally
    //   8524	8530	8530	finally
    //   8524	8530	3	finally
    //   8524	8530	3	finally
    //   8524	8530	3	java/lang/IllegalArgumentException
    //   8524	8530	3	finally
    //   8596	8602	8602	finally
    //   8596	8602	8602	finally
    //   8596	8602	8602	java/util/ConcurrentModificationException
    //   8596	8602	3	finally
    //   8596	8602	8602	finally
    //   9683	9690	9690	finally
    //   9683	9690	9683	finally
    //   9683	9690	9683	java/util/NoSuchElementException
    //   9683	9690	3	java/util/ConcurrentModificationException
    //   9684	9690	9683	java/lang/ArrayIndexOutOfBoundsException
    //   9755	9762	9762	finally
    //   9755	9762	3	java/lang/EnumConstantNotPresentException
    //   9755	9762	3	java/lang/IllegalStateException
    //   9756	9762	9755	java/lang/NegativeArraySizeException
    //   9756	9762	9762	finally
    //   10139	10146	10146	finally
    //   10140	10146	10146	finally
    //   10140	10146	10139	java/util/ConcurrentModificationException
    //   10140	10146	3	java/lang/NegativeArraySizeException
    //   10140	10146	10146	java/lang/UnsupportedOperationException
    //   10211	10218	10218	finally
    //   10211	10218	10211	java/lang/ClassCastException
    //   10211	10218	10211	finally
    //   10212	10218	3	java/lang/EnumConstantNotPresentException
    //   10212	10218	10218	java/lang/NegativeArraySizeException
    //   11300	11306	11306	finally
    //   11300	11306	11306	finally
    //   11300	11306	11306	finally
    //   11300	11306	11306	java/lang/NullPointerException
    //   11300	11306	11306	java/lang/NumberFormatException
    //   11495	11502	11502	finally
    //   11495	11502	11495	finally
    //   11495	11502	11502	finally
    //   11496	11502	11502	finally
    //   11496	11502	3	java/lang/NegativeArraySizeException
    //   11567	11574	11574	finally
    //   11568	11574	11567	finally
    //   11568	11574	11567	finally
    //   11568	11574	11574	java/util/ConcurrentModificationException
    //   11568	11574	11574	finally
    //   12136	12142	12142	finally
    //   12136	12142	3	java/lang/NumberFormatException
    //   12136	12142	12142	finally
    //   12136	12142	12142	finally
    //   12136	12142	3	finally
    //   12524	12530	12530	finally
    //   12524	12530	12530	java/lang/EnumConstantNotPresentException
    //   12524	12530	3	java/lang/StringIndexOutOfBoundsException
    //   12524	12530	3	java/lang/NegativeArraySizeException
    //   12524	12530	12530	finally
    //   12595	12602	12602	finally
    //   12595	12602	3	finally
    //   12596	12602	12602	finally
    //   12596	12602	12595	finally
    //   12596	12602	12602	java/lang/RuntimeException
    //   13720	13726	13726	finally
    //   13720	13726	13726	java/util/ConcurrentModificationException
    //   13720	13726	3	finally
    //   13720	13726	3	finally
    //   13720	13726	13726	java/lang/ArrayIndexOutOfBoundsException
    //   14851	14858	14858	finally
    //   14851	14858	14851	finally
    //   14851	14858	14858	java/lang/UnsupportedOperationException
    //   14851	14858	14858	finally
    //   14852	14858	14851	finally
    //   15395	15402	15402	finally
    //   15395	15402	3	java/lang/RuntimeException
    //   15395	15402	15402	java/lang/StringIndexOutOfBoundsException
    //   15395	15402	15395	finally
    //   15396	15402	15395	finally
    //   15467	15474	15474	finally
    //   15468	15474	15474	finally
    //   15468	15474	15467	finally
    //   15468	15474	15467	finally
    //   15468	15474	15467	finally
    //   15974	15982	15974	finally
    //   15990	15992	3	finally
  }
  
  public float drawCenteredStringWithShadow(String text, float x, float y, int color) {
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
  
  public void setFractionalMetrics(boolean fractionalMetrics) {
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
  
  public float drawCenteredString(String paramString, float paramFloat1, float paramFloat2, int paramInt) {
    return Perry1.N(this, (int)-1633500316L ^ 0xD6569D13, paramString, paramFloat1, paramFloat2, paramInt);
  }
  
  public List formatString(String string, double width) {
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
  
  public List wrapWords(String text, double width) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 7672
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 7664
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 7656
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1005608325
    //   37: l2i
    //   38: ldc_w 1790289545
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -582256046
    //   48: l2i
    //   49: ldc_w -1271906230
    //   52: ixor
    //   53: ldc2_w 133015704
    //   56: l2i
    //   57: ldc_w -1383334527
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1279842647 -> 45, -81547755 -> 7469
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w -900637355
    //   108: l2i
    //   109: ldc_w 1353778909
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1744133128
    //   119: l2i
    //   120: ldc_w -1101642180
    //   123: ixor
    //   124: ldc2_w 1737313716
    //   127: l2i
    //   128: ldc_w 489103848
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 7565, -532006956 -> 116, 1559660952 -> 160
    //   160: astore #4
    //   162: getstatic Perryc.0 : I
    //   165: ifle -> 179
    //   168: ldc2_w -1632273026
    //   171: l2i
    //   172: ldc_w 1939274602
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 755413108
    //   182: l2i
    //   183: ldc_w -852762479
    //   186: ixor
    //   187: ldc2_w 1204006034
    //   190: l2i
    //   191: ldc_w -665851650
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 7533, 1924121208 -> 179, 2141262985 -> 224
    //   224: aload_0
    //   225: getstatic Perryc.c : I
    //   228: iflt -> 242
    //   231: ldc2_w 1048621890
    //   234: l2i
    //   235: ldc_w 1413481686
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -773810932
    //   245: l2i
    //   246: ldc_w -913644063
    //   249: ixor
    //   250: ldc2_w 1070189533
    //   253: l2i
    //   254: ldc_w 1934011823
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 284, 642765286 -> 7471, 1282261114 -> 242
    //   284: aload_1
    //   285: getstatic Perryc.c : I
    //   288: iflt -> 302
    //   291: ldc2_w 1094744296
    //   294: l2i
    //   295: ldc_w 656718713
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w 1396413018
    //   305: l2i
    //   306: ldc_w 1539144638
    //   309: ixor
    //   310: ldc2_w 1219308468
    //   313: l2i
    //   314: ldc_w 563594424
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 344, -683160788 -> 302, 257830045 -> 7625
    //   344: goto -> 348
    //   347: athrow
    //   348: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   351: goto -> 355
    //   354: athrow
    //   355: i2d
    //   356: getstatic Perryc.c : I
    //   359: iflt -> 373
    //   362: ldc2_w -870551119
    //   365: l2i
    //   366: ldc_w -1565208495
    //   369: ixor
    //   370: goto -> 381
    //   373: ldc2_w -1887021046
    //   376: l2i
    //   377: ldc_w 1678843070
    //   380: ixor
    //   381: ldc2_w 1648233415
    //   384: l2i
    //   385: ldc_w 1087817845
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 7511, -914389242 -> 416, 1279287890 -> 373
    //   416: dload_2
    //   417: dcmpl
    //   418: ifle -> 432
    //   421: ldc2_w 2008818143
    //   424: l2i
    //   425: ldc_w 1271189839
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w -660945459
    //   435: l2i
    //   436: ldc_w -454937252
    //   439: ixor
    //   440: ldc2_w -655454814
    //   443: l2i
    //   444: ldc_w -1139722328
    //   447: ixor
    //   448: ixor
    //   449: tableswitch default -> 421, 1485261466 -> 472, 1485261467 -> 7180
    //   472: getstatic Perryc.c : I
    //   475: iflt -> 489
    //   478: ldc2_w 2117971870
    //   481: l2i
    //   482: ldc_w -790979584
    //   485: ixor
    //   486: goto -> 497
    //   489: ldc2_w 1353957310
    //   492: l2i
    //   493: ldc_w -1077833450
    //   496: ixor
    //   497: ldc2_w -425207298
    //   500: l2i
    //   501: ldc_w 895144390
    //   504: ixor
    //   505: ixor
    //   506: lookupswitch default -> 7465, 1016014480 -> 532, 2098871206 -> 489
    //   532: aload_1
    //   533: ldc_w ' '
    //   536: getstatic Perryc.c : I
    //   539: iflt -> 553
    //   542: ldc2_w -319727042
    //   545: l2i
    //   546: ldc_w -385910641
    //   549: ixor
    //   550: goto -> 561
    //   553: ldc2_w -788239812
    //   556: l2i
    //   557: ldc_w 1915619079
    //   560: ixor
    //   561: ldc2_w -245188832
    //   564: l2i
    //   565: ldc_w -916131434
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, -1487247312 -> 553, 1007182855 -> 7521
    //   596: goto -> 600
    //   599: athrow
    //   600: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   603: goto -> 607
    //   606: athrow
    //   607: getstatic Perryc.c : I
    //   610: iflt -> 624
    //   613: ldc2_w 1523575126
    //   616: l2i
    //   617: ldc_w 844487418
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -1799452710
    //   627: l2i
    //   628: ldc_w -350721497
    //   631: ixor
    //   632: ldc2_w -1598615601
    //   635: l2i
    //   636: ldc_w -263767697
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 668, 455394077 -> 624, 946472204 -> 7621
    //   668: astore #5
    //   670: ldc_w ''
    //   673: getstatic Perryc.c : I
    //   676: iflt -> 690
    //   679: ldc2_w 698049119
    //   682: l2i
    //   683: ldc_w 1283515627
    //   686: ixor
    //   687: goto -> 698
    //   690: ldc2_w 64112829
    //   693: l2i
    //   694: ldc_w -587640837
    //   697: ixor
    //   698: ldc2_w 2105723110
    //   701: l2i
    //   702: ldc_w -483041533
    //   705: ixor
    //   706: ixor
    //   707: lookupswitch default -> 732, -1676988056 -> 690, -72609455 -> 7597
    //   732: astore #6
    //   734: ldc2_w 977869658
    //   737: l2i
    //   738: ldc_w 977921189
    //   741: ixor
    //   742: getstatic Perryc.0 : I
    //   745: ifle -> 759
    //   748: ldc2_w 1867820511
    //   751: l2i
    //   752: ldc_w 817029402
    //   755: ixor
    //   756: goto -> 767
    //   759: ldc2_w 441752274
    //   762: l2i
    //   763: ldc_w 1834646300
    //   766: ixor
    //   767: ldc2_w 1062568383
    //   770: l2i
    //   771: ldc_w 522779614
    //   774: ixor
    //   775: ixor
    //   776: lookupswitch default -> 804, 1965960304 -> 759, 2140878500 -> 7473
    //   804: istore #7
    //   806: getstatic Perryc.c : I
    //   809: iflt -> 823
    //   812: ldc2_w -635648085
    //   815: l2i
    //   816: ldc_w 19559295
    //   819: ixor
    //   820: goto -> 831
    //   823: ldc2_w -310164503
    //   826: l2i
    //   827: ldc_w -1095715774
    //   830: ixor
    //   831: ldc2_w -1037082047
    //   834: l2i
    //   835: ldc_w 655157568
    //   838: ixor
    //   839: ixor
    //   840: lookupswitch default -> 868, -1885839475 -> 823, 1041579989 -> 7539
    //   868: aload #5
    //   870: getstatic Perryc.0 : I
    //   873: ifle -> 887
    //   876: ldc2_w -1660796649
    //   879: l2i
    //   880: ldc_w 458303935
    //   883: ixor
    //   884: goto -> 895
    //   887: ldc2_w 1056510648
    //   890: l2i
    //   891: ldc_w -1934239150
    //   894: ixor
    //   895: ldc2_w -1431740765
    //   898: l2i
    //   899: ldc_w -1931497780
    //   902: ixor
    //   903: ixor
    //   904: lookupswitch default -> 932, -1608148793 -> 7627, 1425169927 -> 887
    //   932: astore #8
    //   934: getstatic Perryc.1 : I
    //   937: ifeq -> 951
    //   940: ldc2_w 1988921269
    //   943: l2i
    //   944: ldc_w 1059390215
    //   947: ixor
    //   948: goto -> 959
    //   951: ldc2_w 31361122
    //   954: l2i
    //   955: ldc_w -1840188351
    //   958: ixor
    //   959: ldc2_w -201782191
    //   962: l2i
    //   963: ldc_w 1161499802
    //   966: ixor
    //   967: ixor
    //   968: lookupswitch default -> 7605, -9724807 -> 951, 625763560 -> 996
    //   996: aload #8
    //   998: arraylength
    //   999: getstatic Perryc.c : I
    //   1002: iflt -> 1016
    //   1005: ldc2_w 1814734846
    //   1008: l2i
    //   1009: ldc_w -1951525991
    //   1012: ixor
    //   1013: goto -> 1024
    //   1016: ldc2_w 1143025624
    //   1019: l2i
    //   1020: ldc_w 1858840927
    //   1023: ixor
    //   1024: ldc2_w -680478866
    //   1027: l2i
    //   1028: ldc_w -301994311
    //   1031: ixor
    //   1032: ixor
    //   1033: lookupswitch default -> 7619, -586420816 -> 1016, 275111760 -> 1060
    //   1060: istore #9
    //   1062: ldc2_w -1394791416
    //   1065: l2i
    //   1066: ldc_w -1394791416
    //   1069: ixor
    //   1070: getstatic Perryc.c : I
    //   1073: iflt -> 1087
    //   1076: ldc2_w 1513439218
    //   1079: l2i
    //   1080: ldc_w -1740514209
    //   1083: ixor
    //   1084: goto -> 1095
    //   1087: ldc2_w 487614895
    //   1090: l2i
    //   1091: ldc_w 516304045
    //   1094: ixor
    //   1095: ldc2_w 110534882
    //   1098: l2i
    //   1099: ldc_w -944329977
    //   1102: ixor
    //   1103: ixor
    //   1104: lookupswitch default -> 1132, 55896136 -> 7587, 1848484382 -> 1087
    //   1132: istore #10
    //   1134: getstatic Perryc.1 : I
    //   1137: ifeq -> 1151
    //   1140: ldc2_w -1908705796
    //   1143: l2i
    //   1144: ldc_w -1445968020
    //   1147: ixor
    //   1148: goto -> 1159
    //   1151: ldc2_w 1894825644
    //   1154: l2i
    //   1155: ldc_w 179737724
    //   1158: ixor
    //   1159: ldc2_w -1494258363
    //   1162: l2i
    //   1163: ldc_w -1992630723
    //   1166: ixor
    //   1167: ixor
    //   1168: lookupswitch default -> 1196, -969842259 -> 1151, 138314216 -> 7509
    //   1196: iload #10
    //   1198: getstatic Perryc.c : I
    //   1201: iflt -> 1215
    //   1204: ldc2_w 1925642177
    //   1207: l2i
    //   1208: ldc_w -1652554643
    //   1211: ixor
    //   1212: goto -> 1223
    //   1215: ldc2_w 547280076
    //   1218: l2i
    //   1219: ldc_w -1174143007
    //   1222: ixor
    //   1223: ldc2_w 377031290
    //   1226: l2i
    //   1227: ldc_w -633625741
    //   1230: ixor
    //   1231: ixor
    //   1232: lookupswitch default -> 1260, 289686429 -> 1215, 587487909 -> 7613
    //   1260: iload #9
    //   1262: if_icmpge -> 1276
    //   1265: ldc2_w 1611381033
    //   1268: l2i
    //   1269: ldc_w -1436858500
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w 1515120494
    //   1279: l2i
    //   1280: ldc_w -1877075656
    //   1283: ixor
    //   1284: ldc2_w 153589282
    //   1287: l2i
    //   1288: ldc_w -468100002
    //   1291: ixor
    //   1292: ixor
    //   1293: tableswitch default -> 1265, 661533737 -> 1316, 661533738 -> 4908
    //   1316: getstatic Perryc.1 : I
    //   1319: ifeq -> 1333
    //   1322: ldc2_w 2109805922
    //   1325: l2i
    //   1326: ldc_w -1739334911
    //   1329: ixor
    //   1330: goto -> 1341
    //   1333: ldc2_w -373706933
    //   1336: l2i
    //   1337: ldc_w 1044961902
    //   1340: ixor
    //   1341: ldc2_w -1604925901
    //   1344: l2i
    //   1345: ldc_w 997951166
    //   1348: ixor
    //   1349: ixor
    //   1350: lookupswitch default -> 1376, -58307896 -> 1333, 2126483182 -> 7457
    //   1376: aload #8
    //   1378: getstatic Perryc.1 : I
    //   1381: ifeq -> 1395
    //   1384: ldc2_w 1166605531
    //   1387: l2i
    //   1388: ldc_w 1035534204
    //   1391: ixor
    //   1392: goto -> 1403
    //   1395: ldc2_w -994285512
    //   1398: l2i
    //   1399: ldc_w 54062887
    //   1402: ixor
    //   1403: ldc2_w -1686696708
    //   1406: l2i
    //   1407: ldc_w -1249778564
    //   1410: ixor
    //   1411: ixor
    //   1412: lookupswitch default -> 1440, -417444570 -> 1395, 1455876903 -> 7549
    //   1440: iload #10
    //   1442: aaload
    //   1443: getstatic Perryc.c : I
    //   1446: iflt -> 1460
    //   1449: ldc2_w 1632520704
    //   1452: l2i
    //   1453: ldc_w -1742712812
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w -548288982
    //   1463: l2i
    //   1464: ldc_w 943522311
    //   1467: ixor
    //   1468: ldc2_w -1242997613
    //   1471: l2i
    //   1472: ldc_w 1582477126
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 1504, -323490631 -> 1460, 316008897 -> 7483
    //   1504: astore #11
    //   1506: ldc2_w 1506395483
    //   1509: l2i
    //   1510: ldc_w 1506395483
    //   1513: ixor
    //   1514: getstatic Perryc.0 : I
    //   1517: ifle -> 1531
    //   1520: ldc2_w -993256847
    //   1523: l2i
    //   1524: ldc_w 1074209650
    //   1527: ixor
    //   1528: goto -> 1539
    //   1531: ldc2_w 46153240
    //   1534: l2i
    //   1535: ldc_w 2143535404
    //   1538: ixor
    //   1539: ldc2_w 1258667269
    //   1542: l2i
    //   1543: ldc_w -1447209359
    //   1546: ixor
    //   1547: ixor
    //   1548: lookupswitch default -> 1576, 702176011 -> 1531, 1718866551 -> 7551
    //   1576: istore #12
    //   1578: getstatic Perryc.0 : I
    //   1581: ifle -> 1595
    //   1584: ldc2_w -1219181183
    //   1587: l2i
    //   1588: ldc_w -802315658
    //   1591: ixor
    //   1592: goto -> 1603
    //   1595: ldc2_w 1311357595
    //   1598: l2i
    //   1599: ldc_w -1954685446
    //   1602: ixor
    //   1603: ldc2_w -1086325539
    //   1606: l2i
    //   1607: ldc_w -1885608493
    //   1610: ixor
    //   1611: ixor
    //   1612: lookupswitch default -> 7541, -168788369 -> 1640, 1474133753 -> 1595
    //   1640: iload #12
    //   1642: getstatic Perryc.0 : I
    //   1645: ifle -> 1659
    //   1648: ldc2_w 2064786755
    //   1651: l2i
    //   1652: ldc_w 947647037
    //   1655: ixor
    //   1656: goto -> 1667
    //   1659: ldc2_w -54910295
    //   1662: l2i
    //   1663: ldc_w -1914690868
    //   1666: ixor
    //   1667: ldc2_w 2130941094
    //   1670: l2i
    //   1671: ldc_w -1770981173
    //   1674: ixor
    //   1675: ixor
    //   1676: lookupswitch default -> 7475, -1742115832 -> 1704, -1441088749 -> 1659
    //   1704: aload #11
    //   1706: getstatic Perryc.1 : I
    //   1709: ifeq -> 1723
    //   1712: ldc2_w -1912442391
    //   1715: l2i
    //   1716: ldc_w -282375060
    //   1719: ixor
    //   1720: goto -> 1731
    //   1723: ldc2_w 765551625
    //   1726: l2i
    //   1727: ldc_w -1095466753
    //   1730: ixor
    //   1731: ldc2_w -95079211
    //   1734: l2i
    //   1735: ldc_w 165758246
    //   1738: ixor
    //   1739: ixor
    //   1740: lookupswitch default -> 1768, -1835185034 -> 7629, -1272763307 -> 1723
    //   1768: goto -> 1772
    //   1771: athrow
    //   1772: invokevirtual toCharArray : ()[C
    //   1775: goto -> 1779
    //   1778: athrow
    //   1779: arraylength
    //   1780: if_icmpge -> 1794
    //   1783: ldc2_w 1665952552
    //   1786: l2i
    //   1787: ldc_w 1115955497
    //   1790: ixor
    //   1791: goto -> 1802
    //   1794: ldc2_w -1894600846
    //   1797: l2i
    //   1798: ldc_w -1361386126
    //   1801: ixor
    //   1802: ldc2_w -1682958009
    //   1805: l2i
    //   1806: ldc_w -622651342
    //   1809: ixor
    //   1810: ixor
    //   1811: tableswitch default -> 1783, 1620790132 -> 1832, 1620790133 -> 2760
    //   1832: getstatic Perryc.1 : I
    //   1835: ifeq -> 1849
    //   1838: ldc2_w -974431701
    //   1841: l2i
    //   1842: ldc_w 866330915
    //   1845: ixor
    //   1846: goto -> 1857
    //   1849: ldc2_w -1923791249
    //   1852: l2i
    //   1853: ldc_w -988261960
    //   1856: ixor
    //   1857: ldc2_w -1625129620
    //   1860: l2i
    //   1861: ldc_w -600549860
    //   1864: ixor
    //   1865: ixor
    //   1866: lookupswitch default -> 7599, -1252108168 -> 1849, 190528679 -> 1892
    //   1892: aload #11
    //   1894: getstatic Perryc.0 : I
    //   1897: ifle -> 1911
    //   1900: ldc2_w -2027165449
    //   1903: l2i
    //   1904: ldc_w -1045426634
    //   1907: ixor
    //   1908: goto -> 1919
    //   1911: ldc2_w 396487242
    //   1914: l2i
    //   1915: ldc_w -160781293
    //   1918: ixor
    //   1919: ldc2_w -958754132
    //   1922: l2i
    //   1923: ldc_w -651050819
    //   1926: ixor
    //   1927: ixor
    //   1928: lookupswitch default -> 7447, -31452088 -> 1956, 1500558544 -> 1911
    //   1956: goto -> 1960
    //   1959: athrow
    //   1960: invokevirtual toCharArray : ()[C
    //   1963: goto -> 1967
    //   1966: athrow
    //   1967: getstatic Perryc.c : I
    //   1970: iflt -> 1984
    //   1973: ldc2_w -1786217543
    //   1976: l2i
    //   1977: ldc_w 501291828
    //   1980: ixor
    //   1981: goto -> 1992
    //   1984: ldc2_w 1530601987
    //   1987: l2i
    //   1988: ldc_w 758012544
    //   1991: ixor
    //   1992: ldc2_w 1119008293
    //   1995: l2i
    //   1996: ldc_w 21517999
    //   1999: ixor
    //   2000: ixor
    //   2001: lookupswitch default -> 7505, -879525881 -> 1984, 904894473 -> 2028
    //   2028: iload #12
    //   2030: caload
    //   2031: getstatic Perryc.1 : I
    //   2034: ifeq -> 2048
    //   2037: ldc2_w -936575418
    //   2040: l2i
    //   2041: ldc_w 2101143474
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w 1936775121
    //   2051: l2i
    //   2052: ldc_w -131448127
    //   2055: ixor
    //   2056: ldc2_w 458492996
    //   2059: l2i
    //   2060: ldc_w 84091916
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 7451, -1794261672 -> 2092, -1421397572 -> 2048
    //   2092: istore #13
    //   2094: getstatic Perryc.0 : I
    //   2097: ifle -> 2111
    //   2100: ldc2_w 1497547180
    //   2103: l2i
    //   2104: ldc_w 2081791348
    //   2107: ixor
    //   2108: goto -> 2119
    //   2111: ldc2_w 713616032
    //   2114: l2i
    //   2115: ldc_w 1504029668
    //   2118: ixor
    //   2119: ldc2_w -1562501041
    //   2122: l2i
    //   2123: ldc_w 670253390
    //   2126: ixor
    //   2127: ixor
    //   2128: lookupswitch default -> 2156, -1602601511 -> 7499, -783159946 -> 2111
    //   2156: iload #13
    //   2158: ldc2_w -1288146501
    //   2161: l2i
    //   2162: ldc_w -1288146660
    //   2165: ixor
    //   2166: if_icmpne -> 2180
    //   2169: ldc2_w -887412069
    //   2172: l2i
    //   2173: ldc_w 856803820
    //   2176: ixor
    //   2177: goto -> 2188
    //   2180: ldc2_w 521915507
    //   2183: l2i
    //   2184: ldc_w -418304253
    //   2187: ixor
    //   2188: ldc2_w 1703832424
    //   2191: l2i
    //   2192: ldc_w -147522244
    //   2195: ixor
    //   2196: ixor
    //   2197: tableswitch default -> 2169, 1789949219 -> 2220, 1789949220 -> 2754
    //   2220: getstatic Perryc.c : I
    //   2223: iflt -> 2237
    //   2226: ldc2_w -1547017346
    //   2229: l2i
    //   2230: ldc_w -1389653322
    //   2233: ixor
    //   2234: goto -> 2245
    //   2237: ldc2_w -1201309273
    //   2240: l2i
    //   2241: ldc_w 1490180927
    //   2244: ixor
    //   2245: ldc2_w -1661814496
    //   2248: l2i
    //   2249: ldc_w -676558034
    //   2252: ixor
    //   2253: ixor
    //   2254: lookupswitch default -> 2280, -131498417 -> 2237, 1170195398 -> 7497
    //   2280: iload #12
    //   2282: getstatic Perryc.0 : I
    //   2285: ifle -> 2299
    //   2288: ldc2_w 474323034
    //   2291: l2i
    //   2292: ldc_w -1281518651
    //   2295: ixor
    //   2296: goto -> 2307
    //   2299: ldc2_w 348032902
    //   2302: l2i
    //   2303: ldc_w -1568224423
    //   2306: ixor
    //   2307: ldc2_w 670625342
    //   2310: l2i
    //   2311: ldc_w 378930042
    //   2314: ixor
    //   2315: ixor
    //   2316: lookupswitch default -> 2344, -1632180517 -> 7567, 1614670741 -> 2299
    //   2344: aload #11
    //   2346: getstatic Perryc.c : I
    //   2349: iflt -> 2363
    //   2352: ldc2_w -824465236
    //   2355: l2i
    //   2356: ldc_w -1843048672
    //   2359: ixor
    //   2360: goto -> 2371
    //   2363: ldc2_w 2132600470
    //   2366: l2i
    //   2367: ldc_w 1957844039
    //   2370: ixor
    //   2371: ldc2_w 738084826
    //   2374: l2i
    //   2375: ldc_w 544356057
    //   2378: ixor
    //   2379: ixor
    //   2380: lookupswitch default -> 2408, -963971173 -> 2363, 1467127439 -> 7623
    //   2408: goto -> 2412
    //   2411: athrow
    //   2412: invokevirtual toCharArray : ()[C
    //   2415: goto -> 2419
    //   2418: athrow
    //   2419: arraylength
    //   2420: ldc2_w -1976837414
    //   2423: l2i
    //   2424: ldc_w -1976837413
    //   2427: ixor
    //   2428: isub
    //   2429: if_icmpge -> 2443
    //   2432: ldc2_w 383207840
    //   2435: l2i
    //   2436: ldc_w -514463547
    //   2439: ixor
    //   2440: goto -> 2451
    //   2443: ldc2_w 499822402
    //   2446: l2i
    //   2447: ldc_w -364376540
    //   2450: ixor
    //   2451: ldc2_w -1248196089
    //   2454: l2i
    //   2455: ldc_w 734868811
    //   2458: ixor
    //   2459: ixor
    //   2460: tableswitch default -> 2432, 1775607337 -> 2484, 1775607338 -> 2754
    //   2484: getstatic Perryc.c : I
    //   2487: iflt -> 2501
    //   2490: ldc2_w -1126420474
    //   2493: l2i
    //   2494: ldc_w 362252277
    //   2497: ixor
    //   2498: goto -> 2509
    //   2501: ldc2_w -1916965425
    //   2504: l2i
    //   2505: ldc_w 1543508652
    //   2508: ixor
    //   2509: ldc2_w 89674895
    //   2512: l2i
    //   2513: ldc_w -645222936
    //   2516: ixor
    //   2517: ixor
    //   2518: lookupswitch default -> 2544, 470016803 -> 2501, 1972981396 -> 7589
    //   2544: aload #11
    //   2546: getstatic Perryc.1 : I
    //   2549: ifeq -> 2563
    //   2552: ldc2_w 26545061
    //   2555: l2i
    //   2556: ldc_w 880120602
    //   2559: ixor
    //   2560: goto -> 2571
    //   2563: ldc2_w -484035048
    //   2566: l2i
    //   2567: ldc_w -453323544
    //   2570: ixor
    //   2571: ldc2_w 261088057
    //   2574: l2i
    //   2575: ldc_w -1550121699
    //   2578: ixor
    //   2579: ixor
    //   2580: lookupswitch default -> 2608, -1712030053 -> 7453, 917992092 -> 2563
    //   2608: goto -> 2612
    //   2611: athrow
    //   2612: invokevirtual toCharArray : ()[C
    //   2615: goto -> 2619
    //   2618: athrow
    //   2619: getstatic Perryc.c : I
    //   2622: iflt -> 2636
    //   2625: ldc2_w 465139131
    //   2628: l2i
    //   2629: ldc_w 967415664
    //   2632: ixor
    //   2633: goto -> 2644
    //   2636: ldc2_w -509975983
    //   2639: l2i
    //   2640: ldc_w 1238111945
    //   2643: ixor
    //   2644: ldc2_w -1249001436
    //   2647: l2i
    //   2648: ldc_w 468383706
    //   2651: ixor
    //   2652: ixor
    //   2653: lookupswitch default -> 7603, -1938303691 -> 2636, 103891814 -> 2680
    //   2680: iload #12
    //   2682: ldc2_w -1267555972
    //   2685: l2i
    //   2686: ldc_w -1267555971
    //   2689: ixor
    //   2690: iadd
    //   2691: caload
    //   2692: getstatic Perryc.c : I
    //   2695: iflt -> 2709
    //   2698: ldc2_w 1762736612
    //   2701: l2i
    //   2702: ldc_w -166370145
    //   2705: ixor
    //   2706: goto -> 2717
    //   2709: ldc2_w 1286678972
    //   2712: l2i
    //   2713: ldc_w 98778309
    //   2716: ixor
    //   2717: ldc2_w 2082215954
    //   2720: l2i
    //   2721: ldc_w -222063045
    //   2724: ixor
    //   2725: ixor
    //   2726: lookupswitch default -> 2752, 299619154 -> 7559, 1939193897 -> 2709
    //   2752: istore #7
    //   2754: iinc #12, 1
    //   2757: goto -> 1578
    //   2760: getstatic Perryc.c : I
    //   2763: iflt -> 2777
    //   2766: ldc2_w 1903248945
    //   2769: l2i
    //   2770: ldc_w -681326351
    //   2773: ixor
    //   2774: goto -> 2785
    //   2777: ldc2_w 2062842873
    //   2780: l2i
    //   2781: ldc_w 897127168
    //   2784: ixor
    //   2785: ldc2_w 1519212709
    //   2788: l2i
    //   2789: ldc_w 1700097753
    //   2792: ixor
    //   2793: ixor
    //   2794: lookupswitch default -> 7553, -1714767684 -> 2777, 1884642949 -> 2820
    //   2820: aload_0
    //   2821: new java/lang/StringBuilder
    //   2824: dup
    //   2825: getstatic Perryc.0 : I
    //   2828: ifle -> 2842
    //   2831: ldc2_w -1398504214
    //   2834: l2i
    //   2835: ldc_w -1888133680
    //   2838: ixor
    //   2839: goto -> 2850
    //   2842: ldc2_w -948568474
    //   2845: l2i
    //   2846: ldc_w 1034944823
    //   2849: ixor
    //   2850: ldc2_w 1515155298
    //   2853: l2i
    //   2854: ldc_w -1734171851
    //   2857: ixor
    //   2858: ixor
    //   2859: lookupswitch default -> 2884, -516156051 -> 7577, 552012870 -> 2842
    //   2884: goto -> 2888
    //   2887: athrow
    //   2888: invokespecial <init> : ()V
    //   2891: goto -> 2895
    //   2894: athrow
    //   2895: getstatic Perryc.c : I
    //   2898: iflt -> 2912
    //   2901: ldc2_w -1971592233
    //   2904: l2i
    //   2905: ldc_w -1000639781
    //   2908: ixor
    //   2909: goto -> 2920
    //   2912: ldc2_w 2076520383
    //   2915: l2i
    //   2916: ldc_w 1718133462
    //   2919: ixor
    //   2920: ldc2_w 32645536
    //   2923: l2i
    //   2924: ldc_w -536091214
    //   2927: ixor
    //   2928: ixor
    //   2929: lookupswitch default -> 7593, -1344711394 -> 2912, -61585029 -> 2956
    //   2956: aload #6
    //   2958: getstatic Perryc.0 : I
    //   2961: ifle -> 2975
    //   2964: ldc2_w 928214064
    //   2967: l2i
    //   2968: ldc_w 1022299351
    //   2971: ixor
    //   2972: goto -> 2983
    //   2975: ldc2_w -563556514
    //   2978: l2i
    //   2979: ldc_w 1279484237
    //   2982: ixor
    //   2983: ldc2_w -758445315
    //   2986: l2i
    //   2987: ldc_w -1280440043
    //   2990: ixor
    //   2991: ixor
    //   2992: lookupswitch default -> 7531, -212947461 -> 3020, 1792631567 -> 2975
    //   3020: goto -> 3024
    //   3023: athrow
    //   3024: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3027: goto -> 3031
    //   3030: athrow
    //   3031: getstatic Perryc.c : I
    //   3034: iflt -> 3048
    //   3037: ldc2_w 935944704
    //   3040: l2i
    //   3041: ldc_w -630596447
    //   3044: ixor
    //   3045: goto -> 3056
    //   3048: ldc2_w -1602326426
    //   3051: l2i
    //   3052: ldc_w 2001906832
    //   3055: ixor
    //   3056: ldc2_w -259685619
    //   3059: l2i
    //   3060: ldc_w -1366828256
    //   3063: ixor
    //   3064: ixor
    //   3065: lookupswitch default -> 7581, -1993440037 -> 3092, -1281169780 -> 3048
    //   3092: aload #11
    //   3094: getstatic Perryc.0 : I
    //   3097: ifle -> 3111
    //   3100: ldc2_w 1312747333
    //   3103: l2i
    //   3104: ldc_w -857809390
    //   3107: ixor
    //   3108: goto -> 3119
    //   3111: ldc2_w 1450449143
    //   3114: l2i
    //   3115: ldc_w 137165770
    //   3118: ixor
    //   3119: ldc2_w -1778272867
    //   3122: l2i
    //   3123: ldc_w 599602168
    //   3126: ixor
    //   3127: ixor
    //   3128: lookupswitch default -> 7449, -337353384 -> 3156, 928823090 -> 3111
    //   3156: goto -> 3160
    //   3159: athrow
    //   3160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3163: goto -> 3167
    //   3166: athrow
    //   3167: ldc_w ' '
    //   3170: getstatic Perryc.0 : I
    //   3173: ifle -> 3187
    //   3176: ldc2_w -1442079138
    //   3179: l2i
    //   3180: ldc_w -1909155656
    //   3183: ixor
    //   3184: goto -> 3195
    //   3187: ldc2_w 560848536
    //   3190: l2i
    //   3191: ldc_w -932242923
    //   3194: ixor
    //   3195: ldc2_w -819045976
    //   3198: l2i
    //   3199: ldc_w 892392778
    //   3202: ixor
    //   3203: ixor
    //   3204: lookupswitch default -> 3232, -795860946 -> 3187, -568227324 -> 7573
    //   3232: goto -> 3236
    //   3235: athrow
    //   3236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3239: goto -> 3243
    //   3242: athrow
    //   3243: getstatic Perryc.0 : I
    //   3246: ifle -> 3260
    //   3249: ldc2_w 1533620090
    //   3252: l2i
    //   3253: ldc_w -1364342930
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w 1219817628
    //   3263: l2i
    //   3264: ldc_w 188063098
    //   3267: ixor
    //   3268: ldc2_w -1945244528
    //   3271: l2i
    //   3272: ldc_w -57248227
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 3304, -2057342311 -> 7545, 1904970489 -> 3260
    //   3304: goto -> 3308
    //   3307: athrow
    //   3308: invokevirtual toString : ()Ljava/lang/String;
    //   3311: goto -> 3315
    //   3314: athrow
    //   3315: getstatic Perryc.c : I
    //   3318: iflt -> 3332
    //   3321: ldc2_w -1574326301
    //   3324: l2i
    //   3325: ldc_w -2136032726
    //   3328: ixor
    //   3329: goto -> 3340
    //   3332: ldc2_w -132868052
    //   3335: l2i
    //   3336: ldc_w -1936010931
    //   3339: ixor
    //   3340: ldc2_w -2113732159
    //   3343: l2i
    //   3344: ldc_w -1439885171
    //   3347: ixor
    //   3348: ixor
    //   3349: lookupswitch default -> 3376, 178850949 -> 7555, 777788136 -> 3332
    //   3376: goto -> 3380
    //   3379: athrow
    //   3380: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   3383: goto -> 3387
    //   3386: athrow
    //   3387: i2d
    //   3388: getstatic Perryc.1 : I
    //   3391: ifeq -> 3405
    //   3394: ldc2_w 1475807573
    //   3397: l2i
    //   3398: ldc_w -2007613741
    //   3401: ixor
    //   3402: goto -> 3413
    //   3405: ldc2_w -1367531593
    //   3408: l2i
    //   3409: ldc_w -984585811
    //   3412: ixor
    //   3413: ldc2_w 1067899551
    //   3416: l2i
    //   3417: ldc_w 1483926959
    //   3420: ixor
    //   3421: ixor
    //   3422: lookupswitch default -> 3448, -1200291658 -> 7537, 1130804555 -> 3405
    //   3448: dload_2
    //   3449: dcmpg
    //   3450: ifge -> 3464
    //   3453: ldc2_w 2111336219
    //   3456: l2i
    //   3457: ldc_w 1100156935
    //   3460: ixor
    //   3461: goto -> 3472
    //   3464: ldc2_w -61283206
    //   3467: l2i
    //   3468: ldc_w -1072456839
    //   3471: ixor
    //   3472: ldc2_w 668949852
    //   3475: l2i
    //   3476: ldc_w -76144049
    //   3479: ixor
    //   3480: ixor
    //   3481: tableswitch default -> 3453, -522059761 -> 3504, -522059760 -> 4065
    //   3504: new java/lang/StringBuilder
    //   3507: dup
    //   3508: getstatic Perryc.1 : I
    //   3511: ifeq -> 3525
    //   3514: ldc2_w 188591297
    //   3517: l2i
    //   3518: ldc_w 1776079584
    //   3521: ixor
    //   3522: goto -> 3533
    //   3525: ldc2_w -344657016
    //   3528: l2i
    //   3529: ldc_w 36439259
    //   3532: ixor
    //   3533: ldc2_w 459371256
    //   3536: l2i
    //   3537: ldc_w 709979869
    //   3540: ixor
    //   3541: ixor
    //   3542: lookupswitch default -> 7579, -664212618 -> 3568, 1406231044 -> 3525
    //   3568: goto -> 3572
    //   3571: athrow
    //   3572: invokespecial <init> : ()V
    //   3575: goto -> 3579
    //   3578: athrow
    //   3579: getstatic Perryc.c : I
    //   3582: iflt -> 3596
    //   3585: ldc2_w -1124632722
    //   3588: l2i
    //   3589: ldc_w -1537226156
    //   3592: ixor
    //   3593: goto -> 3604
    //   3596: ldc2_w -1008745785
    //   3599: l2i
    //   3600: ldc_w 414642052
    //   3603: ixor
    //   3604: ldc2_w 1518083864
    //   3607: l2i
    //   3608: ldc_w -1456670671
    //   3611: ixor
    //   3612: ixor
    //   3613: lookupswitch default -> 3640, -452844757 -> 3596, -336045549 -> 7507
    //   3640: aload #6
    //   3642: getstatic Perryc.c : I
    //   3645: iflt -> 3659
    //   3648: ldc2_w -1408533183
    //   3651: l2i
    //   3652: ldc_w -1783765832
    //   3655: ixor
    //   3656: goto -> 3667
    //   3659: ldc2_w 392698196
    //   3662: l2i
    //   3663: ldc_w 1917162360
    //   3666: ixor
    //   3667: ldc2_w -864156919
    //   3670: l2i
    //   3671: ldc_w 325018050
    //   3674: ixor
    //   3675: ixor
    //   3676: lookupswitch default -> 7557, -1173559065 -> 3704, -427295950 -> 3659
    //   3704: goto -> 3708
    //   3707: athrow
    //   3708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3711: goto -> 3715
    //   3714: athrow
    //   3715: getstatic Perryc.1 : I
    //   3718: ifeq -> 3732
    //   3721: ldc2_w 419660845
    //   3724: l2i
    //   3725: ldc_w -362966759
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w 742090066
    //   3735: l2i
    //   3736: ldc_w -1462030583
    //   3739: ixor
    //   3740: ldc2_w -396327344
    //   3743: l2i
    //   3744: ldc_w -1313812003
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 7615, -1433517383 -> 3732, -584049194 -> 3776
    //   3776: aload #11
    //   3778: getstatic Perryc.0 : I
    //   3781: ifle -> 3795
    //   3784: ldc2_w 1803903844
    //   3787: l2i
    //   3788: ldc_w -326640557
    //   3791: ixor
    //   3792: goto -> 3803
    //   3795: ldc2_w -143360988
    //   3798: l2i
    //   3799: ldc_w 1699696378
    //   3802: ixor
    //   3803: ldc2_w 757982249
    //   3806: l2i
    //   3807: ldc_w 1291908312
    //   3810: ixor
    //   3811: ixor
    //   3812: lookupswitch default -> 3840, -2124754954 -> 3795, -416305210 -> 7547
    //   3840: goto -> 3844
    //   3843: athrow
    //   3844: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3847: goto -> 3851
    //   3850: athrow
    //   3851: ldc_w ' '
    //   3854: getstatic Perryc.1 : I
    //   3857: ifeq -> 3871
    //   3860: ldc2_w -492086704
    //   3863: l2i
    //   3864: ldc_w -899786595
    //   3867: ixor
    //   3868: goto -> 3879
    //   3871: ldc2_w 1912194242
    //   3874: l2i
    //   3875: ldc_w -931797906
    //   3878: ixor
    //   3879: ldc2_w -1186849739
    //   3882: l2i
    //   3883: ldc_w 1411587099
    //   3886: ixor
    //   3887: ixor
    //   3888: lookupswitch default -> 7463, -980155677 -> 3871, 1424826498 -> 3916
    //   3916: goto -> 3920
    //   3919: athrow
    //   3920: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3923: goto -> 3927
    //   3926: athrow
    //   3927: getstatic Perryc.1 : I
    //   3930: ifeq -> 3944
    //   3933: ldc2_w -403080082
    //   3936: l2i
    //   3937: ldc_w -450635066
    //   3940: ixor
    //   3941: goto -> 3952
    //   3944: ldc2_w -1269319803
    //   3947: l2i
    //   3948: ldc_w 2122163743
    //   3951: ixor
    //   3952: ldc2_w -1138459835
    //   3955: l2i
    //   3956: ldc_w -1328069114
    //   3959: ixor
    //   3960: ixor
    //   3961: lookupswitch default -> 7479, -958845735 -> 3988, 237607915 -> 3944
    //   3988: goto -> 3992
    //   3991: athrow
    //   3992: invokevirtual toString : ()Ljava/lang/String;
    //   3995: goto -> 3999
    //   3998: athrow
    //   3999: getstatic Perryc.1 : I
    //   4002: ifeq -> 4016
    //   4005: ldc2_w -1163062550
    //   4008: l2i
    //   4009: ldc_w -1613488611
    //   4012: ixor
    //   4013: goto -> 4024
    //   4016: ldc2_w -515060642
    //   4019: l2i
    //   4020: ldc_w 1784499662
    //   4023: ixor
    //   4024: ldc2_w -2068727203
    //   4027: l2i
    //   4028: ldc_w 1010225328
    //   4031: ixor
    //   4032: ixor
    //   4033: lookupswitch default -> 7461, -1644272102 -> 4016, 865528701 -> 4060
    //   4060: astore #6
    //   4062: goto -> 4902
    //   4065: getstatic Perryc.c : I
    //   4068: iflt -> 4082
    //   4071: ldc2_w -2123005918
    //   4074: l2i
    //   4075: ldc_w 936623617
    //   4078: ixor
    //   4079: goto -> 4090
    //   4082: ldc2_w -1007969175
    //   4085: l2i
    //   4086: ldc_w -1897659490
    //   4089: ixor
    //   4090: ldc2_w 1602112438
    //   4093: l2i
    //   4094: ldc_w -2074225558
    //   4097: ixor
    //   4098: ixor
    //   4099: lookupswitch default -> 4124, -739846918 -> 4082, 1837474303 -> 7445
    //   4124: aload #4
    //   4126: getstatic Perryc.1 : I
    //   4129: ifeq -> 4143
    //   4132: ldc2_w -1058841329
    //   4135: l2i
    //   4136: ldc_w -565169591
    //   4139: ixor
    //   4140: goto -> 4151
    //   4143: ldc2_w 1387720141
    //   4146: l2i
    //   4147: ldc_w -893656160
    //   4150: ixor
    //   4151: ldc2_w 625129687
    //   4154: l2i
    //   4155: ldc_w 895317869
    //   4158: ixor
    //   4159: ixor
    //   4160: lookupswitch default -> 4188, -262489792 -> 4143, 246194428 -> 7529
    //   4188: aload #6
    //   4190: getstatic Perryc.1 : I
    //   4193: ifeq -> 4207
    //   4196: ldc2_w -2145482891
    //   4199: l2i
    //   4200: ldc_w 959393908
    //   4203: ixor
    //   4204: goto -> 4215
    //   4207: ldc2_w -1239198154
    //   4210: l2i
    //   4211: ldc_w 1921081035
    //   4214: ixor
    //   4215: ldc2_w 300480788
    //   4218: l2i
    //   4219: ldc_w 2061183270
    //   4222: ixor
    //   4223: ixor
    //   4224: lookupswitch default -> 4252, -771594445 -> 7443, 177659413 -> 4207
    //   4252: goto -> 4256
    //   4255: athrow
    //   4256: invokeinterface add : (Ljava/lang/Object;)Z
    //   4261: goto -> 4265
    //   4264: athrow
    //   4265: pop
    //   4266: new java/lang/StringBuilder
    //   4269: dup
    //   4270: getstatic Perryc.1 : I
    //   4273: ifeq -> 4287
    //   4276: ldc2_w -930818160
    //   4279: l2i
    //   4280: ldc_w -566837720
    //   4283: ixor
    //   4284: goto -> 4295
    //   4287: ldc2_w -84814101
    //   4290: l2i
    //   4291: ldc_w -101083960
    //   4294: ixor
    //   4295: ldc2_w -1387175453
    //   4298: l2i
    //   4299: ldc_w 1652011718
    //   4302: ixor
    //   4303: ixor
    //   4304: lookupswitch default -> 4332, -644564323 -> 7609, 934574497 -> 4287
    //   4332: goto -> 4336
    //   4335: athrow
    //   4336: invokespecial <init> : ()V
    //   4339: goto -> 4343
    //   4342: athrow
    //   4343: ldc_w '§'
    //   4346: getstatic Perryc.c : I
    //   4349: iflt -> 4363
    //   4352: ldc2_w 287048925
    //   4355: l2i
    //   4356: ldc_w 352558087
    //   4359: ixor
    //   4360: goto -> 4371
    //   4363: ldc2_w 599514296
    //   4366: l2i
    //   4367: ldc_w -234035625
    //   4370: ixor
    //   4371: ldc2_w -1308951820
    //   4374: l2i
    //   4375: ldc_w 1830745121
    //   4378: ixor
    //   4379: ixor
    //   4380: lookupswitch default -> 4408, -654600689 -> 7535, 147196426 -> 4363
    //   4408: goto -> 4412
    //   4411: athrow
    //   4412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4415: goto -> 4419
    //   4418: athrow
    //   4419: getstatic Perryc.0 : I
    //   4422: ifle -> 4436
    //   4425: ldc2_w -384994512
    //   4428: l2i
    //   4429: ldc_w 54250356
    //   4432: ixor
    //   4433: goto -> 4444
    //   4436: ldc2_w 139958515
    //   4439: l2i
    //   4440: ldc_w -70848016
    //   4443: ixor
    //   4444: ldc2_w 2110775945
    //   4447: l2i
    //   4448: ldc_w 12183412
    //   4451: ixor
    //   4452: ixor
    //   4453: lookupswitch default -> 7569, -1897435906 -> 4480, -1757364807 -> 4436
    //   4480: iload #7
    //   4482: getstatic Perryc.1 : I
    //   4485: ifeq -> 4499
    //   4488: ldc2_w -1319590956
    //   4491: l2i
    //   4492: ldc_w -1829946074
    //   4495: ixor
    //   4496: goto -> 4507
    //   4499: ldc2_w -2086612622
    //   4502: l2i
    //   4503: ldc_w 1123424236
    //   4506: ixor
    //   4507: ldc2_w -31351243
    //   4510: l2i
    //   4511: ldc_w 995362944
    //   4514: ixor
    //   4515: ixor
    //   4516: lookupswitch default -> 4544, -423622585 -> 7513, 1639199039 -> 4499
    //   4544: goto -> 4548
    //   4547: athrow
    //   4548: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   4551: goto -> 4555
    //   4554: athrow
    //   4555: getstatic Perryc.1 : I
    //   4558: ifeq -> 4572
    //   4561: ldc2_w 829020252
    //   4564: l2i
    //   4565: ldc_w 974098895
    //   4568: ixor
    //   4569: goto -> 4580
    //   4572: ldc2_w 1472813675
    //   4575: l2i
    //   4576: ldc_w -1781589904
    //   4579: ixor
    //   4580: ldc2_w 700909778
    //   4583: l2i
    //   4584: ldc_w -938355109
    //   4587: ixor
    //   4588: ixor
    //   4589: lookupswitch default -> 4616, -877985922 -> 4572, -357525734 -> 7503
    //   4616: aload #11
    //   4618: getstatic Perryc.c : I
    //   4621: iflt -> 4635
    //   4624: ldc2_w 179248638
    //   4627: l2i
    //   4628: ldc_w -1434027821
    //   4631: ixor
    //   4632: goto -> 4643
    //   4635: ldc2_w -1943326425
    //   4638: l2i
    //   4639: ldc_w -686101965
    //   4642: ixor
    //   4643: ldc2_w -1604910426
    //   4646: l2i
    //   4647: ldc_w -849026870
    //   4650: ixor
    //   4651: ixor
    //   4652: lookupswitch default -> 4680, -853899455 -> 7639, 459934148 -> 4635
    //   4680: goto -> 4684
    //   4683: athrow
    //   4684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4687: goto -> 4691
    //   4690: athrow
    //   4691: ldc_w ' '
    //   4694: getstatic Perryc.0 : I
    //   4697: ifle -> 4711
    //   4700: ldc2_w 483117238
    //   4703: l2i
    //   4704: ldc_w 1050104288
    //   4707: ixor
    //   4708: goto -> 4719
    //   4711: ldc2_w -121889811
    //   4714: l2i
    //   4715: ldc_w 1455332285
    //   4718: ixor
    //   4719: ldc2_w -618901689
    //   4722: l2i
    //   4723: ldc_w -111533508
    //   4726: ixor
    //   4727: ixor
    //   4728: lookupswitch default -> 4756, -132677422 -> 4711, 1766445 -> 7501
    //   4756: goto -> 4760
    //   4759: athrow
    //   4760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4763: goto -> 4767
    //   4766: athrow
    //   4767: getstatic Perryc.0 : I
    //   4770: ifle -> 4784
    //   4773: ldc2_w -332137580
    //   4776: l2i
    //   4777: ldc_w -1845522686
    //   4780: ixor
    //   4781: goto -> 4792
    //   4784: ldc2_w -1644047237
    //   4787: l2i
    //   4788: ldc_w 1918420734
    //   4791: ixor
    //   4792: ldc2_w 293776330
    //   4795: l2i
    //   4796: ldc_w 1169462155
    //   4799: ixor
    //   4800: ixor
    //   4801: lookupswitch default -> 4828, 704269527 -> 7575, 911971374 -> 4784
    //   4828: goto -> 4832
    //   4831: athrow
    //   4832: invokevirtual toString : ()Ljava/lang/String;
    //   4835: goto -> 4839
    //   4838: athrow
    //   4839: getstatic Perryc.1 : I
    //   4842: ifeq -> 4856
    //   4845: ldc2_w 2100789052
    //   4848: l2i
    //   4849: ldc_w -1737070207
    //   4852: ixor
    //   4853: goto -> 4864
    //   4856: ldc2_w 1366305059
    //   4859: l2i
    //   4860: ldc_w 1516935773
    //   4863: ixor
    //   4864: ldc2_w -1590105372
    //   4867: l2i
    //   4868: ldc_w -1343268520
    //   4871: ixor
    //   4872: ixor
    //   4873: lookupswitch default -> 7561, -342448895 -> 4856, 97321154 -> 4900
    //   4900: astore #6
    //   4902: iinc #10, 1
    //   4905: goto -> 1134
    //   4908: getstatic Perryc.1 : I
    //   4911: ifeq -> 4925
    //   4914: ldc2_w 1154678082
    //   4917: l2i
    //   4918: ldc_w -390702624
    //   4921: ixor
    //   4922: goto -> 4933
    //   4925: ldc2_w -1347214711
    //   4928: l2i
    //   4929: ldc_w -2116021346
    //   4932: ixor
    //   4933: ldc2_w -525371112
    //   4936: l2i
    //   4937: ldc_w 894389845
    //   4940: ixor
    //   4941: ixor
    //   4942: lookupswitch default -> 4968, 224569275 -> 4925, 2038731759 -> 7571
    //   4968: aload #6
    //   4970: getstatic Perryc.0 : I
    //   4973: ifle -> 4987
    //   4976: ldc2_w 1210658448
    //   4979: l2i
    //   4980: ldc_w -2031722537
    //   4983: ixor
    //   4984: goto -> 4995
    //   4987: ldc2_w -285057584
    //   4990: l2i
    //   4991: ldc_w 296122355
    //   4994: ixor
    //   4995: ldc2_w 4939405
    //   4998: l2i
    //   4999: ldc_w -968751394
    //   5002: ixor
    //   5003: ixor
    //   5004: lookupswitch default -> 7487, 147204372 -> 4987, 950891120 -> 5032
    //   5032: goto -> 5036
    //   5035: athrow
    //   5036: invokevirtual length : ()I
    //   5039: goto -> 5043
    //   5042: athrow
    //   5043: ifle -> 5057
    //   5046: ldc2_w 1085740434
    //   5049: l2i
    //   5050: ldc_w -2134373373
    //   5053: ixor
    //   5054: goto -> 5065
    //   5057: ldc2_w -726501433
    //   5060: l2i
    //   5061: ldc_w 349007447
    //   5064: ixor
    //   5065: ldc2_w 2090217064
    //   5068: l2i
    //   5069: ldc_w 1223415547
    //   5072: ixor
    //   5073: ixor
    //   5074: tableswitch default -> 5046, -201137918 -> 5096, -201137917 -> 7177
    //   5096: getstatic Perryc.1 : I
    //   5099: ifeq -> 5113
    //   5102: ldc2_w -1345299890
    //   5105: l2i
    //   5106: ldc_w -861216925
    //   5109: ixor
    //   5110: goto -> 5121
    //   5113: ldc2_w 827967848
    //   5116: l2i
    //   5117: ldc_w 951707353
    //   5120: ixor
    //   5121: ldc2_w 91204238
    //   5124: l2i
    //   5125: ldc_w 1799945117
    //   5128: ixor
    //   5129: ixor
    //   5130: lookupswitch default -> 7635, 224252990 -> 5113, 1741127330 -> 5156
    //   5156: aload_0
    //   5157: getstatic Perryc.0 : I
    //   5160: ifle -> 5174
    //   5163: ldc2_w -1543419912
    //   5166: l2i
    //   5167: ldc_w 781079494
    //   5170: ixor
    //   5171: goto -> 5182
    //   5174: ldc2_w 489325851
    //   5177: l2i
    //   5178: ldc_w 1438923801
    //   5181: ixor
    //   5182: ldc2_w 1024163783
    //   5185: l2i
    //   5186: ldc_w -284127030
    //   5189: ixor
    //   5190: ixor
    //   5191: lookupswitch default -> 5216, 1173786578 -> 5174, 1486158643 -> 7523
    //   5216: aload #6
    //   5218: getstatic Perryc.1 : I
    //   5221: ifeq -> 5235
    //   5224: ldc2_w -44444003
    //   5227: l2i
    //   5228: ldc_w 1587748398
    //   5231: ixor
    //   5232: goto -> 5243
    //   5235: ldc2_w 1861799777
    //   5238: l2i
    //   5239: ldc_w 688931297
    //   5242: ixor
    //   5243: ldc2_w -1475099732
    //   5246: l2i
    //   5247: ldc_w -14615595
    //   5250: ixor
    //   5251: ixor
    //   5252: lookupswitch default -> 5280, -188092214 -> 7617, 639635158 -> 5235
    //   5280: goto -> 5284
    //   5283: athrow
    //   5284: invokevirtual getStringWidth : (Ljava/lang/String;)I
    //   5287: goto -> 5291
    //   5290: athrow
    //   5291: i2d
    //   5292: getstatic Perryc.c : I
    //   5295: iflt -> 5309
    //   5298: ldc2_w 1060845733
    //   5301: l2i
    //   5302: ldc_w 607658142
    //   5305: ixor
    //   5306: goto -> 5317
    //   5309: ldc2_w 235487682
    //   5312: l2i
    //   5313: ldc_w -1389772884
    //   5316: ixor
    //   5317: ldc2_w -15524912
    //   5320: l2i
    //   5321: ldc_w 1359096718
    //   5324: ixor
    //   5325: ixor
    //   5326: lookupswitch default -> 7481, -1257101211 -> 5309, 221367856 -> 5352
    //   5352: dload_2
    //   5353: dcmpg
    //   5354: ifge -> 5368
    //   5357: ldc2_w -1738752307
    //   5360: l2i
    //   5361: ldc_w -390846419
    //   5364: ixor
    //   5365: goto -> 5376
    //   5368: ldc2_w -1209892587
    //   5371: l2i
    //   5372: ldc_w -955639820
    //   5375: ixor
    //   5376: ldc2_w 789330920
    //   5379: l2i
    //   5380: ldc_w -67320218
    //   5383: ixor
    //   5384: ixor
    //   5385: tableswitch default -> 5357, -1541903506 -> 5408, -1541903505 -> 6185
    //   5408: getstatic Perryc.1 : I
    //   5411: ifeq -> 5425
    //   5414: ldc2_w -369971630
    //   5417: l2i
    //   5418: ldc_w 145867683
    //   5421: ixor
    //   5422: goto -> 5433
    //   5425: ldc2_w 751797119
    //   5428: l2i
    //   5429: ldc_w -1756580474
    //   5432: ixor
    //   5433: ldc2_w -572343844
    //   5436: l2i
    //   5437: ldc_w 502000809
    //   5440: ixor
    //   5441: ixor
    //   5442: lookupswitch default -> 5468, -11438613 -> 5425, 558512260 -> 7631
    //   5468: aload #4
    //   5470: new java/lang/StringBuilder
    //   5473: dup
    //   5474: getstatic Perryc.c : I
    //   5477: iflt -> 5491
    //   5480: ldc2_w -834855797
    //   5483: l2i
    //   5484: ldc_w 1803536268
    //   5487: ixor
    //   5488: goto -> 5499
    //   5491: ldc2_w 854071498
    //   5494: l2i
    //   5495: ldc_w -577970395
    //   5498: ixor
    //   5499: ldc2_w -716964882
    //   5502: l2i
    //   5503: ldc_w -1990481547
    //   5506: ixor
    //   5507: ixor
    //   5508: lookupswitch default -> 5536, -111507044 -> 7611, 1228198396 -> 5491
    //   5536: goto -> 5540
    //   5539: athrow
    //   5540: invokespecial <init> : ()V
    //   5543: goto -> 5547
    //   5546: athrow
    //   5547: ldc_w '§'
    //   5550: getstatic Perryc.c : I
    //   5553: iflt -> 5567
    //   5556: ldc2_w -1844652156
    //   5559: l2i
    //   5560: ldc_w -781583520
    //   5563: ixor
    //   5564: goto -> 5575
    //   5567: ldc2_w 1322908458
    //   5570: l2i
    //   5571: ldc_w -690274973
    //   5574: ixor
    //   5575: ldc2_w 1652324860
    //   5578: l2i
    //   5579: ldc_w -2124763881
    //   5582: ixor
    //   5583: ixor
    //   5584: lookupswitch default -> 5612, -1606158321 -> 7459, -258169880 -> 5567
    //   5612: goto -> 5616
    //   5615: athrow
    //   5616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5619: goto -> 5623
    //   5622: athrow
    //   5623: getstatic Perryc.0 : I
    //   5626: ifle -> 5640
    //   5629: ldc2_w -227955085
    //   5632: l2i
    //   5633: ldc_w -167558628
    //   5636: ixor
    //   5637: goto -> 5648
    //   5640: ldc2_w 910992701
    //   5643: l2i
    //   5644: ldc_w -1517159495
    //   5647: ixor
    //   5648: ldc2_w -1263609054
    //   5651: l2i
    //   5652: ldc_w -1659687709
    //   5655: ixor
    //   5656: ixor
    //   5657: lookupswitch default -> 5684, 769072046 -> 7491, 1699237004 -> 5640
    //   5684: iload #7
    //   5686: getstatic Perryc.0 : I
    //   5689: ifle -> 5703
    //   5692: ldc2_w 1367045909
    //   5695: l2i
    //   5696: ldc_w 44136644
    //   5699: ixor
    //   5700: goto -> 5711
    //   5703: ldc2_w -1304360236
    //   5706: l2i
    //   5707: ldc_w 1824761487
    //   5710: ixor
    //   5711: ldc2_w 1358454452
    //   5714: l2i
    //   5715: ldc_w 1558078904
    //   5718: ixor
    //   5719: ixor
    //   5720: lookupswitch default -> 7519, -760965289 -> 5748, 1610364125 -> 5703
    //   5748: goto -> 5752
    //   5751: athrow
    //   5752: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   5755: goto -> 5759
    //   5758: athrow
    //   5759: getstatic Perryc.1 : I
    //   5762: ifeq -> 5776
    //   5765: ldc2_w 1772524167
    //   5768: l2i
    //   5769: ldc_w 1297668295
    //   5772: ixor
    //   5773: goto -> 5784
    //   5776: ldc2_w -1738396639
    //   5779: l2i
    //   5780: ldc_w -1080202071
    //   5783: ixor
    //   5784: ldc2_w -1611865190
    //   5787: l2i
    //   5788: ldc_w -1650421397
    //   5791: ixor
    //   5792: ixor
    //   5793: lookupswitch default -> 5820, 197826181 -> 5776, 649214129 -> 7591
    //   5820: aload #6
    //   5822: getstatic Perryc.0 : I
    //   5825: ifle -> 5839
    //   5828: ldc2_w 1589500043
    //   5831: l2i
    //   5832: ldc_w 1626889676
    //   5835: ixor
    //   5836: goto -> 5847
    //   5839: ldc2_w -723475641
    //   5842: l2i
    //   5843: ldc_w -339167825
    //   5846: ixor
    //   5847: ldc2_w 1326949440
    //   5850: l2i
    //   5851: ldc_w 924541480
    //   5854: ixor
    //   5855: ixor
    //   5856: lookupswitch default -> 7583, 1179206447 -> 5839, 1193595008 -> 5884
    //   5884: goto -> 5888
    //   5887: athrow
    //   5888: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5891: goto -> 5895
    //   5894: athrow
    //   5895: ldc_w ' '
    //   5898: getstatic Perryc.0 : I
    //   5901: ifle -> 5915
    //   5904: ldc2_w -1321608051
    //   5907: l2i
    //   5908: ldc_w -1422538487
    //   5911: ixor
    //   5912: goto -> 5923
    //   5915: ldc2_w 1391829653
    //   5918: l2i
    //   5919: ldc_w 2052351935
    //   5922: ixor
    //   5923: ldc2_w 259094438
    //   5926: l2i
    //   5927: ldc_w 1321929004
    //   5930: ixor
    //   5931: ixor
    //   5932: lookupswitch default -> 5960, 395419918 -> 5915, 1538681614 -> 7645
    //   5960: goto -> 5964
    //   5963: athrow
    //   5964: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5967: goto -> 5971
    //   5970: athrow
    //   5971: getstatic Perryc.1 : I
    //   5974: ifeq -> 5988
    //   5977: ldc2_w 1163063902
    //   5980: l2i
    //   5981: ldc_w 1712783021
    //   5984: ixor
    //   5985: goto -> 5996
    //   5988: ldc2_w -1190855726
    //   5991: l2i
    //   5992: ldc_w -413857816
    //   5995: ixor
    //   5996: ldc2_w 1741899030
    //   5999: l2i
    //   6000: ldc_w 216253757
    //   6003: ixor
    //   6004: ixor
    //   6005: lookupswitch default -> 7637, 895581201 -> 6032, 1215597784 -> 5988
    //   6032: goto -> 6036
    //   6035: athrow
    //   6036: invokevirtual toString : ()Ljava/lang/String;
    //   6039: goto -> 6043
    //   6042: athrow
    //   6043: getstatic Perryc.1 : I
    //   6046: ifeq -> 6060
    //   6049: ldc2_w -399545209
    //   6052: l2i
    //   6053: ldc_w 447306946
    //   6056: ixor
    //   6057: goto -> 6068
    //   6060: ldc2_w -582466659
    //   6063: l2i
    //   6064: ldc_w -805348796
    //   6067: ixor
    //   6068: ldc2_w -1984711131
    //   6071: l2i
    //   6072: ldc_w 1889419733
    //   6075: ixor
    //   6076: ixor
    //   6077: lookupswitch default -> 7515, -342168023 -> 6104, 195807157 -> 6060
    //   6104: goto -> 6108
    //   6107: athrow
    //   6108: invokeinterface add : (Ljava/lang/Object;)Z
    //   6113: goto -> 6117
    //   6116: athrow
    //   6117: pop
    //   6118: ldc_w ''
    //   6121: getstatic Perryc.c : I
    //   6124: iflt -> 6138
    //   6127: ldc2_w -1946988758
    //   6130: l2i
    //   6131: ldc_w 2013431145
    //   6134: ixor
    //   6135: goto -> 6146
    //   6138: ldc2_w -1955950042
    //   6141: l2i
    //   6142: ldc_w 1018385786
    //   6145: ixor
    //   6146: ldc2_w 1779187683
    //   6149: l2i
    //   6150: ldc_w 991662125
    //   6153: ixor
    //   6154: ixor
    //   6155: lookupswitch default -> 7607, -1561959027 -> 6138, -422680430 -> 6180
    //   6180: astore #6
    //   6182: goto -> 7177
    //   6185: getstatic Perryc.1 : I
    //   6188: ifeq -> 6202
    //   6191: ldc2_w -839510880
    //   6194: l2i
    //   6195: ldc_w 454821333
    //   6198: ixor
    //   6199: goto -> 6210
    //   6202: ldc2_w 116477603
    //   6205: l2i
    //   6206: ldc_w -531374179
    //   6209: ixor
    //   6210: ldc2_w -1937135849
    //   6213: l2i
    //   6214: ldc_w 584380695
    //   6217: ixor
    //   6218: ixor
    //   6219: lookupswitch default -> 6244, 812316997 -> 6202, 2025277301 -> 7485
    //   6244: aload_0
    //   6245: getstatic Perryc.c : I
    //   6248: iflt -> 6262
    //   6251: ldc2_w 519808223
    //   6254: l2i
    //   6255: ldc_w -1649910198
    //   6258: ixor
    //   6259: goto -> 6270
    //   6262: ldc2_w -754274911
    //   6265: l2i
    //   6266: ldc_w -2087879983
    //   6269: ixor
    //   6270: ldc2_w 218749640
    //   6273: l2i
    //   6274: ldc_w 585617942
    //   6277: ixor
    //   6278: ixor
    //   6279: lookupswitch default -> 6304, -2041911232 -> 6262, -1396837813 -> 7601
    //   6304: aload #6
    //   6306: getstatic Perryc.1 : I
    //   6309: ifeq -> 6323
    //   6312: ldc2_w -1693469455
    //   6315: l2i
    //   6316: ldc_w -1422256480
    //   6319: ixor
    //   6320: goto -> 6331
    //   6323: ldc2_w 1154416133
    //   6326: l2i
    //   6327: ldc_w -478121349
    //   6330: ixor
    //   6331: ldc2_w 825083594
    //   6334: l2i
    //   6335: ldc_w -2019136116
    //   6338: ixor
    //   6339: ixor
    //   6340: lookupswitch default -> 7493, -2034366185 -> 6323, 298133304 -> 6368
    //   6368: dload_2
    //   6369: getstatic Perryc.0 : I
    //   6372: ifle -> 6386
    //   6375: ldc2_w 1661633430
    //   6378: l2i
    //   6379: ldc_w 640206428
    //   6382: ixor
    //   6383: goto -> 6394
    //   6386: ldc2_w -1906052140
    //   6389: l2i
    //   6390: ldc_w -1914545741
    //   6393: ixor
    //   6394: ldc2_w -311170666
    //   6397: l2i
    //   6398: ldc_w -1822496927
    //   6401: ixor
    //   6402: ixor
    //   6403: lookupswitch default -> 7595, 990858045 -> 6386, 2108466320 -> 6428
    //   6428: goto -> 6432
    //   6431: athrow
    //   6432: invokevirtual formatString : (Ljava/lang/String;D)Ljava/util/List;
    //   6435: goto -> 6439
    //   6438: athrow
    //   6439: getstatic Perryc.0 : I
    //   6442: ifle -> 6456
    //   6445: ldc2_w -247732076
    //   6448: l2i
    //   6449: ldc_w -1966453104
    //   6452: ixor
    //   6453: goto -> 6464
    //   6456: ldc2_w 1690384260
    //   6459: l2i
    //   6460: ldc_w -800110099
    //   6463: ixor
    //   6464: ldc2_w 1858907338
    //   6467: l2i
    //   6468: ldc_w -1837289422
    //   6471: ixor
    //   6472: ixor
    //   6473: lookupswitch default -> 7633, -2025833732 -> 6456, 1212146321 -> 6500
    //   6500: goto -> 6504
    //   6503: athrow
    //   6504: invokeinterface iterator : ()Ljava/util/Iterator;
    //   6509: goto -> 6513
    //   6512: athrow
    //   6513: getstatic Perryc.c : I
    //   6516: iflt -> 6530
    //   6519: ldc2_w 1356067514
    //   6522: l2i
    //   6523: ldc_w -1857512104
    //   6526: ixor
    //   6527: goto -> 6538
    //   6530: ldc2_w 1543038137
    //   6533: l2i
    //   6534: ldc_w -1114024127
    //   6537: ixor
    //   6538: ldc2_w 1877464132
    //   6541: l2i
    //   6542: ldc_w -1062324317
    //   6545: ixor
    //   6546: ixor
    //   6547: lookupswitch default -> 6572, 1225428498 -> 6530, 1859292165 -> 7517
    //   6572: astore #8
    //   6574: getstatic Perryc.1 : I
    //   6577: ifeq -> 6591
    //   6580: ldc2_w -1549091568
    //   6583: l2i
    //   6584: ldc_w -529115689
    //   6587: ixor
    //   6588: goto -> 6599
    //   6591: ldc2_w 1578887921
    //   6594: l2i
    //   6595: ldc_w 715240462
    //   6598: ixor
    //   6599: ldc2_w -1489199593
    //   6602: l2i
    //   6603: ldc_w 403720895
    //   6606: ixor
    //   6607: ixor
    //   6608: lookupswitch default -> 6636, -324267200 -> 6591, -51364753 -> 7543
    //   6636: aload #8
    //   6638: getstatic Perryc.c : I
    //   6641: iflt -> 6655
    //   6644: ldc2_w -1343919693
    //   6647: l2i
    //   6648: ldc_w 1775408396
    //   6651: ixor
    //   6652: goto -> 6663
    //   6655: ldc2_w -420890975
    //   6658: l2i
    //   6659: ldc_w -1037109689
    //   6662: ixor
    //   6663: ldc2_w -1542241977
    //   6666: l2i
    //   6667: ldc_w -802936239
    //   6670: ixor
    //   6671: ixor
    //   6672: lookupswitch default -> 6700, -1308584023 -> 7489, -1263789879 -> 6655
    //   6700: goto -> 6704
    //   6703: athrow
    //   6704: invokeinterface hasNext : ()Z
    //   6709: goto -> 6713
    //   6712: athrow
    //   6713: ifeq -> 6727
    //   6716: ldc2_w 1474656596
    //   6719: l2i
    //   6720: ldc_w 1461525852
    //   6723: ixor
    //   6724: goto -> 6735
    //   6727: ldc2_w 357061740
    //   6730: l2i
    //   6731: ldc_w 363868283
    //   6734: ixor
    //   6735: ldc2_w -1028050809
    //   6738: l2i
    //   6739: ldc_w 414371264
    //   6742: ixor
    //   6743: ixor
    //   6744: tableswitch default -> 6716, -621569713 -> 6768, -621569712 -> 7177
    //   6768: getstatic Perryc.0 : I
    //   6771: ifle -> 6785
    //   6774: ldc2_w -1448866321
    //   6777: l2i
    //   6778: ldc_w -56322334
    //   6781: ixor
    //   6782: goto -> 6793
    //   6785: ldc2_w 1987613843
    //   6788: l2i
    //   6789: ldc_w -1441161491
    //   6792: ixor
    //   6793: ldc2_w -2033496882
    //   6796: l2i
    //   6797: ldc_w 557207302
    //   6800: ixor
    //   6801: ixor
    //   6802: lookupswitch default -> 7467, -218261307 -> 6785, 2073823670 -> 6828
    //   6828: aload #8
    //   6830: getstatic Perryc.0 : I
    //   6833: ifle -> 6847
    //   6836: ldc2_w -538234906
    //   6839: l2i
    //   6840: ldc_w -990233837
    //   6843: ixor
    //   6844: goto -> 6855
    //   6847: ldc2_w 1868580888
    //   6850: l2i
    //   6851: ldc_w 1795175677
    //   6854: ixor
    //   6855: ldc2_w 1416354530
    //   6858: l2i
    //   6859: ldc_w 1852494029
    //   6862: ixor
    //   6863: ixor
    //   6864: lookupswitch default -> 7525, 554704602 -> 6847, 1046574794 -> 6892
    //   6892: goto -> 6896
    //   6895: athrow
    //   6896: invokeinterface next : ()Ljava/lang/Object;
    //   6901: goto -> 6905
    //   6904: athrow
    //   6905: checkcast java/lang/String
    //   6908: getstatic Perryc.c : I
    //   6911: iflt -> 6925
    //   6914: ldc2_w -342602374
    //   6917: l2i
    //   6918: ldc_w 887722351
    //   6921: ixor
    //   6922: goto -> 6933
    //   6925: ldc2_w 315249455
    //   6928: l2i
    //   6929: ldc_w -1081587166
    //   6932: ixor
    //   6933: ldc2_w -520250062
    //   6936: l2i
    //   6937: ldc_w 612281959
    //   6940: ixor
    //   6941: ixor
    //   6942: lookupswitch default -> 6968, 469692224 -> 7527, 1582679382 -> 6925
    //   6968: astore #9
    //   6970: getstatic Perryc.c : I
    //   6973: iflt -> 6987
    //   6976: ldc2_w 568053143
    //   6979: l2i
    //   6980: ldc_w -1830669965
    //   6983: ixor
    //   6984: goto -> 6995
    //   6987: ldc2_w 1721203299
    //   6990: l2i
    //   6991: ldc_w 213261065
    //   6994: ixor
    //   6995: ldc2_w -454994011
    //   6998: l2i
    //   6999: ldc_w -2081644522
    //   7002: ixor
    //   7003: ixor
    //   7004: lookupswitch default -> 7032, -1553953134 -> 6987, -734786729 -> 7641
    //   7032: aload #4
    //   7034: getstatic Perryc.0 : I
    //   7037: ifle -> 7051
    //   7040: ldc2_w -643258431
    //   7043: l2i
    //   7044: ldc_w 660520723
    //   7047: ixor
    //   7048: goto -> 7059
    //   7051: ldc2_w 592021874
    //   7054: l2i
    //   7055: ldc_w -190350856
    //   7058: ixor
    //   7059: ldc2_w 1360384566
    //   7062: l2i
    //   7063: ldc_w 1509487730
    //   7066: ixor
    //   7067: ixor
    //   7068: lookupswitch default -> 7585, -553396530 -> 7096, -165986666 -> 7051
    //   7096: aload #9
    //   7098: getstatic Perryc.c : I
    //   7101: iflt -> 7115
    //   7104: ldc2_w -18037809
    //   7107: l2i
    //   7108: ldc_w -2081349101
    //   7111: ixor
    //   7112: goto -> 7123
    //   7115: ldc2_w 1254808886
    //   7118: l2i
    //   7119: ldc_w -1191600956
    //   7122: ixor
    //   7123: ldc2_w 333611633
    //   7126: l2i
    //   7127: ldc_w -1578146908
    //   7130: ixor
    //   7131: ixor
    //   7132: lookupswitch default -> 7563, -821034999 -> 7115, 1077846055 -> 7160
    //   7160: goto -> 7164
    //   7163: athrow
    //   7164: invokeinterface add : (Ljava/lang/Object;)Z
    //   7169: goto -> 7173
    //   7172: athrow
    //   7173: pop
    //   7174: goto -> 6574
    //   7177: goto -> 7378
    //   7180: getstatic Perryc.1 : I
    //   7183: ifeq -> 7197
    //   7186: ldc2_w 135625528
    //   7189: l2i
    //   7190: ldc_w 2025071241
    //   7193: ixor
    //   7194: goto -> 7205
    //   7197: ldc2_w -698432933
    //   7200: l2i
    //   7201: ldc_w -942646019
    //   7204: ixor
    //   7205: ldc2_w 945601140
    //   7208: l2i
    //   7209: ldc_w 2137551655
    //   7212: ixor
    //   7213: ixor
    //   7214: lookupswitch default -> 7643, 932548834 -> 7197, 1455052789 -> 7240
    //   7240: aload #4
    //   7242: getstatic Perryc.0 : I
    //   7245: ifle -> 7259
    //   7248: ldc2_w -526653367
    //   7251: l2i
    //   7252: ldc_w 877971611
    //   7255: ixor
    //   7256: goto -> 7267
    //   7259: ldc2_w 1507084376
    //   7262: l2i
    //   7263: ldc_w -1870150074
    //   7266: ixor
    //   7267: ldc2_w -928852349
    //   7270: l2i
    //   7271: ldc_w -1112877181
    //   7274: ixor
    //   7275: ixor
    //   7276: lookupswitch default -> 7495, -1580785198 -> 7259, -1134850274 -> 7304
    //   7304: aload_1
    //   7305: getstatic Perryc.1 : I
    //   7308: ifeq -> 7322
    //   7311: ldc2_w -1526095988
    //   7314: l2i
    //   7315: ldc_w 1414239113
    //   7318: ixor
    //   7319: goto -> 7330
    //   7322: ldc2_w 1839063847
    //   7325: l2i
    //   7326: ldc_w 1624459784
    //   7329: ixor
    //   7330: ldc2_w -1563216452
    //   7333: l2i
    //   7334: ldc_w 1739554061
    //   7337: ixor
    //   7338: ixor
    //   7339: lookupswitch default -> 7477, -936189538 -> 7364, 876496052 -> 7322
    //   7364: goto -> 7368
    //   7367: athrow
    //   7368: invokeinterface add : (Ljava/lang/Object;)Z
    //   7373: goto -> 7377
    //   7376: athrow
    //   7377: pop
    //   7378: getstatic Perryc.1 : I
    //   7381: ifeq -> 7395
    //   7384: ldc2_w 14855582
    //   7387: l2i
    //   7388: ldc_w -1075649362
    //   7391: ixor
    //   7392: goto -> 7403
    //   7395: ldc2_w -267151030
    //   7398: l2i
    //   7399: ldc_w -1470838890
    //   7402: ixor
    //   7403: ldc2_w 821783363
    //   7406: l2i
    //   7407: ldc_w -153226823
    //   7410: ixor
    //   7411: ixor
    //   7412: lookupswitch default -> 7455, -1637759962 -> 7440, 2032587722 -> 7395
    //   7440: aload #4
    //   7442: areturn
    //   7443: aconst_null
    //   7444: athrow
    //   7445: aconst_null
    //   7446: athrow
    //   7447: aconst_null
    //   7448: athrow
    //   7449: aconst_null
    //   7450: athrow
    //   7451: aconst_null
    //   7452: athrow
    //   7453: aconst_null
    //   7454: athrow
    //   7455: aconst_null
    //   7456: athrow
    //   7457: aconst_null
    //   7458: athrow
    //   7459: aconst_null
    //   7460: athrow
    //   7461: aconst_null
    //   7462: athrow
    //   7463: aconst_null
    //   7464: athrow
    //   7465: aconst_null
    //   7466: athrow
    //   7467: aconst_null
    //   7468: athrow
    //   7469: aconst_null
    //   7470: athrow
    //   7471: aconst_null
    //   7472: athrow
    //   7473: aconst_null
    //   7474: athrow
    //   7475: aconst_null
    //   7476: athrow
    //   7477: aconst_null
    //   7478: athrow
    //   7479: aconst_null
    //   7480: athrow
    //   7481: aconst_null
    //   7482: athrow
    //   7483: aconst_null
    //   7484: athrow
    //   7485: aconst_null
    //   7486: athrow
    //   7487: aconst_null
    //   7488: athrow
    //   7489: aconst_null
    //   7490: athrow
    //   7491: aconst_null
    //   7492: athrow
    //   7493: aconst_null
    //   7494: athrow
    //   7495: aconst_null
    //   7496: athrow
    //   7497: aconst_null
    //   7498: athrow
    //   7499: aconst_null
    //   7500: athrow
    //   7501: aconst_null
    //   7502: athrow
    //   7503: aconst_null
    //   7504: athrow
    //   7505: aconst_null
    //   7506: athrow
    //   7507: aconst_null
    //   7508: athrow
    //   7509: aconst_null
    //   7510: athrow
    //   7511: aconst_null
    //   7512: athrow
    //   7513: aconst_null
    //   7514: athrow
    //   7515: aconst_null
    //   7516: athrow
    //   7517: aconst_null
    //   7518: athrow
    //   7519: aconst_null
    //   7520: athrow
    //   7521: aconst_null
    //   7522: athrow
    //   7523: aconst_null
    //   7524: athrow
    //   7525: aconst_null
    //   7526: athrow
    //   7527: aconst_null
    //   7528: athrow
    //   7529: aconst_null
    //   7530: athrow
    //   7531: aconst_null
    //   7532: athrow
    //   7533: aconst_null
    //   7534: athrow
    //   7535: aconst_null
    //   7536: athrow
    //   7537: aconst_null
    //   7538: athrow
    //   7539: aconst_null
    //   7540: athrow
    //   7541: aconst_null
    //   7542: athrow
    //   7543: aconst_null
    //   7544: athrow
    //   7545: aconst_null
    //   7546: athrow
    //   7547: aconst_null
    //   7548: athrow
    //   7549: aconst_null
    //   7550: athrow
    //   7551: aconst_null
    //   7552: athrow
    //   7553: aconst_null
    //   7554: athrow
    //   7555: aconst_null
    //   7556: athrow
    //   7557: aconst_null
    //   7558: athrow
    //   7559: aconst_null
    //   7560: athrow
    //   7561: aconst_null
    //   7562: athrow
    //   7563: aconst_null
    //   7564: athrow
    //   7565: aconst_null
    //   7566: athrow
    //   7567: aconst_null
    //   7568: athrow
    //   7569: aconst_null
    //   7570: athrow
    //   7571: aconst_null
    //   7572: athrow
    //   7573: aconst_null
    //   7574: athrow
    //   7575: aconst_null
    //   7576: athrow
    //   7577: aconst_null
    //   7578: athrow
    //   7579: aconst_null
    //   7580: athrow
    //   7581: aconst_null
    //   7582: athrow
    //   7583: aconst_null
    //   7584: athrow
    //   7585: aconst_null
    //   7586: athrow
    //   7587: aconst_null
    //   7588: athrow
    //   7589: aconst_null
    //   7590: athrow
    //   7591: aconst_null
    //   7592: athrow
    //   7593: aconst_null
    //   7594: athrow
    //   7595: aconst_null
    //   7596: athrow
    //   7597: aconst_null
    //   7598: athrow
    //   7599: aconst_null
    //   7600: athrow
    //   7601: aconst_null
    //   7602: athrow
    //   7603: aconst_null
    //   7604: athrow
    //   7605: aconst_null
    //   7606: athrow
    //   7607: aconst_null
    //   7608: athrow
    //   7609: aconst_null
    //   7610: athrow
    //   7611: aconst_null
    //   7612: athrow
    //   7613: aconst_null
    //   7614: athrow
    //   7615: aconst_null
    //   7616: athrow
    //   7617: aconst_null
    //   7618: athrow
    //   7619: aconst_null
    //   7620: athrow
    //   7621: aconst_null
    //   7622: athrow
    //   7623: aconst_null
    //   7624: athrow
    //   7625: aconst_null
    //   7626: athrow
    //   7627: aconst_null
    //   7628: athrow
    //   7629: aconst_null
    //   7630: athrow
    //   7631: aconst_null
    //   7632: athrow
    //   7633: aconst_null
    //   7634: athrow
    //   7635: aconst_null
    //   7636: athrow
    //   7637: aconst_null
    //   7638: athrow
    //   7639: aconst_null
    //   7640: athrow
    //   7641: aconst_null
    //   7642: athrow
    //   7643: aconst_null
    //   7644: athrow
    //   7645: aconst_null
    //   7646: athrow
    //   7647: pop
    //   7648: goto -> 24
    //   7651: pop
    //   7652: aconst_null
    //   7653: goto -> 7647
    //   7656: dup
    //   7657: ifnull -> 7647
    //   7660: checkcast java/lang/Throwable
    //   7663: athrow
    //   7664: dup
    //   7665: ifnull -> 7651
    //   7668: checkcast java/lang/Throwable
    //   7671: athrow
    //   7672: aconst_null
    //   7673: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2094	660	13	c	C
    //   1578	1182	12	i	I
    //   1506	3396	11	word	Ljava/lang/String;
    //   6970	204	9	s	Ljava/lang/String;
    //   670	6507	5	words	[Ljava/lang/String;
    //   734	6443	6	currentWord	Ljava/lang/String;
    //   806	6371	7	lastColorCode	C
    //   24	7419	0	this	Lbigname/zprestige/webhack/features/gui/font/CustomFont;
    //   24	7419	1	text	Ljava/lang/String;
    //   24	7419	2	width	D
    //   162	7281	4	finalWords	Ljava/util/List;
    // Exception table:
    //   from	to	target	type
    //   8	20	7656	java/lang/StringIndexOutOfBoundsException
    //   91	98	98	finally
    //   92	98	91	finally
    //   92	98	91	java/lang/ArrayIndexOutOfBoundsException
    //   92	98	98	finally
    //   92	98	3	finally
    //   347	354	354	finally
    //   347	354	347	java/lang/RuntimeException
    //   347	354	354	finally
    //   347	354	347	finally
    //   348	354	354	finally
    //   599	606	606	finally
    //   599	606	606	finally
    //   599	606	599	finally
    //   599	606	599	finally
    //   600	606	606	java/lang/AssertionError
    //   1771	1778	1778	finally
    //   1771	1778	1771	finally
    //   1772	1778	1778	finally
    //   1772	1778	1771	finally
    //   1772	1778	1771	java/lang/RuntimeException
    //   1959	1966	1966	finally
    //   1960	1966	1959	finally
    //   1960	1966	1959	java/lang/IllegalStateException
    //   1960	1966	3	java/lang/IllegalArgumentException
    //   1960	1966	1966	finally
    //   2412	2418	2418	finally
    //   2412	2418	3	finally
    //   2412	2418	3	java/lang/IllegalStateException
    //   2412	2418	2418	finally
    //   2412	2418	3	java/lang/IndexOutOfBoundsException
    //   2611	2618	2618	finally
    //   2611	2618	3	java/lang/NullPointerException
    //   2611	2618	3	java/lang/ArithmeticException
    //   2612	2618	2618	java/lang/IllegalStateException
    //   2612	2618	2611	java/lang/RuntimeException
    //   2887	2894	2894	finally
    //   2887	2894	2894	finally
    //   2887	2894	2887	finally
    //   2887	2894	3	java/lang/ClassCastException
    //   2888	2894	3	java/lang/ArithmeticException
    //   3023	3030	3030	finally
    //   3023	3030	3030	finally
    //   3023	3030	3	java/lang/IllegalStateException
    //   3023	3030	3023	java/lang/AssertionError
    //   3024	3030	3	finally
    //   3159	3166	3166	finally
    //   3159	3166	3159	finally
    //   3159	3166	3166	java/lang/UnsupportedOperationException
    //   3159	3166	3	finally
    //   3160	3166	3166	finally
    //   3235	3242	3242	finally
    //   3235	3242	3	java/lang/ArithmeticException
    //   3235	3242	3242	finally
    //   3236	3242	3235	finally
    //   3236	3242	3242	java/lang/NumberFormatException
    //   3307	3314	3314	finally
    //   3307	3314	3307	finally
    //   3308	3314	3307	finally
    //   3308	3314	3314	finally
    //   3308	3314	3	finally
    //   3379	3386	3386	finally
    //   3379	3386	3379	finally
    //   3379	3386	3	finally
    //   3380	3386	3	finally
    //   3380	3386	3379	java/lang/RuntimeException
    //   3572	3578	3578	finally
    //   3572	3578	3	finally
    //   3572	3578	3578	finally
    //   3572	3578	3	java/lang/NegativeArraySizeException
    //   3572	3578	3	finally
    //   3707	3714	3714	finally
    //   3707	3714	3707	finally
    //   3707	3714	3	finally
    //   3708	3714	3714	finally
    //   3708	3714	3707	finally
    //   3844	3850	3850	finally
    //   3844	3850	3	finally
    //   3844	3850	3	finally
    //   3844	3850	3	finally
    //   3844	3850	3850	finally
    //   3919	3926	3926	finally
    //   3919	3926	3919	finally
    //   3919	3926	3	finally
    //   3919	3926	3919	java/util/NoSuchElementException
    //   3920	3926	3926	finally
    //   3991	3998	3998	finally
    //   3991	3998	3	finally
    //   3991	3998	3	finally
    //   3992	3998	3991	finally
    //   3992	3998	3991	finally
    //   4256	4264	4264	finally
    //   4256	4264	3	java/lang/RuntimeException
    //   4256	4264	3	finally
    //   4256	4264	4264	finally
    //   4256	4264	4264	java/util/NoSuchElementException
    //   4335	4342	4342	finally
    //   4335	4342	4335	finally
    //   4335	4342	4342	java/lang/UnsupportedOperationException
    //   4336	4342	4335	java/lang/UnsupportedOperationException
    //   4336	4342	3	java/lang/StringIndexOutOfBoundsException
    //   4411	4418	4418	finally
    //   4411	4418	3	java/lang/ArrayIndexOutOfBoundsException
    //   4411	4418	4418	java/lang/NegativeArraySizeException
    //   4412	4418	4411	finally
    //   4412	4418	4418	finally
    //   4548	4554	4554	finally
    //   4548	4554	4554	finally
    //   4548	4554	3	java/lang/RuntimeException
    //   4548	4554	4554	java/lang/RuntimeException
    //   4548	4554	4554	java/lang/ClassCastException
    //   4683	4690	4690	finally
    //   4683	4690	4690	finally
    //   4683	4690	4683	java/lang/RuntimeException
    //   4683	4690	4690	java/lang/IllegalStateException
    //   4684	4690	4690	finally
    //   4760	4766	4766	finally
    //   4760	4766	3	java/lang/ArithmeticException
    //   4760	4766	3	java/lang/RuntimeException
    //   4760	4766	3	finally
    //   4760	4766	4766	finally
    //   4832	4838	4838	finally
    //   4832	4838	3	java/lang/NegativeArraySizeException
    //   4832	4838	4838	java/util/NoSuchElementException
    //   4832	4838	4838	java/lang/UnsupportedOperationException
    //   4832	4838	4838	java/lang/RuntimeException
    //   5036	5042	5042	finally
    //   5036	5042	5042	java/lang/NullPointerException
    //   5036	5042	5042	finally
    //   5036	5042	3	java/lang/ArrayIndexOutOfBoundsException
    //   5036	5042	3	finally
    //   5283	5290	5290	finally
    //   5283	5290	5290	finally
    //   5283	5290	5290	java/lang/IllegalStateException
    //   5284	5290	5283	java/lang/ClassCastException
    //   5284	5290	3	finally
    //   5539	5546	5546	finally
    //   5539	5546	3	java/util/NoSuchElementException
    //   5539	5546	5546	java/lang/NumberFormatException
    //   5539	5546	5539	java/lang/ArrayIndexOutOfBoundsException
    //   5540	5546	3	finally
    //   5615	5622	5622	finally
    //   5615	5622	5615	java/lang/IndexOutOfBoundsException
    //   5615	5622	3	finally
    //   5616	5622	5622	finally
    //   5616	5622	5622	finally
    //   5751	5758	5758	finally
    //   5751	5758	5758	java/lang/NegativeArraySizeException
    //   5751	5758	5751	finally
    //   5752	5758	5758	finally
    //   5752	5758	3	finally
    //   5888	5894	5894	finally
    //   5888	5894	3	finally
    //   5888	5894	5894	java/lang/StringIndexOutOfBoundsException
    //   5888	5894	5894	finally
    //   5888	5894	5894	java/lang/NegativeArraySizeException
    //   5963	5970	5970	finally
    //   5963	5970	5970	finally
    //   5963	5970	5963	finally
    //   5964	5970	5970	finally
    //   5964	5970	5963	java/util/ConcurrentModificationException
    //   6035	6042	6042	finally
    //   6035	6042	6035	java/lang/AssertionError
    //   6036	6042	6042	finally
    //   6036	6042	3	finally
    //   6036	6042	6042	finally
    //   6107	6116	6116	finally
    //   6107	6116	6107	finally
    //   6107	6116	6107	java/util/NoSuchElementException
    //   6107	6116	6116	finally
    //   6108	6116	6116	java/lang/StringIndexOutOfBoundsException
    //   6431	6438	6438	finally
    //   6431	6438	6438	finally
    //   6432	6438	3	java/lang/UnsupportedOperationException
    //   6432	6438	6438	java/lang/EnumConstantNotPresentException
    //   6432	6438	6431	java/lang/NegativeArraySizeException
    //   6503	6512	6512	finally
    //   6504	6512	6503	java/lang/NullPointerException
    //   6504	6512	3	finally
    //   6504	6512	6512	java/util/ConcurrentModificationException
    //   6504	6512	6512	finally
    //   6704	6712	6712	finally
    //   6704	6712	6712	finally
    //   6704	6712	6712	java/lang/EnumConstantNotPresentException
    //   6704	6712	6712	java/lang/NegativeArraySizeException
    //   6704	6712	3	finally
    //   6896	6904	6904	finally
    //   6896	6904	3	finally
    //   6896	6904	6904	finally
    //   6896	6904	6904	java/util/ConcurrentModificationException
    //   6896	6904	3	java/lang/EnumConstantNotPresentException
    //   7163	7172	7172	finally
    //   7163	7172	3	java/lang/ArithmeticException
    //   7164	7172	7172	finally
    //   7164	7172	7163	finally
    //   7164	7172	3	finally
    //   7367	7376	7376	finally
    //   7367	7376	3	finally
    //   7367	7376	3	java/lang/NegativeArraySizeException
    //   7368	7376	7367	finally
    //   7368	7376	7376	finally
    //   7656	7664	7656	finally
    //   7672	7674	3	java/lang/EnumConstantNotPresentException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setAntiAlias(boolean antiAlias) {
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
  
  public float drawStringWithShadow(String text, double x, double y, int color) {
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
  
  public void setupMinecraftColorcodes() {
    Perry1.3Q(this, (int)1186338902L ^ 0x2AA3A842);
  }
  
  public CustomFont(Font font, boolean antiAlias, boolean fractionalMetrics) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -1809277043
    //   9: l2i
    //   10: ldc_w 1257082697
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 2072019426
    //   20: l2i
    //   21: ldc_w 1541134413
    //   24: ixor
    //   25: ldc2_w -459140015
    //   28: l2i
    //   29: ldc_w 1284263481
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -2133230086 -> 17, 1995131564 -> 1480
    //   60: aload_0
    //   61: ldc_w '麞㍂黶㷤ⱹ瀧ฯ踻炊☔ਥ匕煥έ辔䛏ꝣㄋᄪ侣'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w 1298710170
    //   73: l2i
    //   74: ldc_w 1777612150
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 303969363
    //   84: l2i
    //   85: ldc_w -1450827285
    //   88: ixor
    //   89: ldc2_w -1965946279
    //   92: l2i
    //   93: ldc_w -272879905
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, 1106423658 -> 1484, 1406245579 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: getstatic Perryc.0 : I
    //   130: ifle -> 144
    //   133: ldc2_w -2120118258
    //   136: l2i
    //   137: ldc_w 1666068115
    //   140: ixor
    //   141: goto -> 152
    //   144: ldc2_w -795632283
    //   147: l2i
    //   148: ldc_w 983619710
    //   151: ixor
    //   152: ldc2_w -548529860
    //   155: l2i
    //   156: ldc_w -1071311192
    //   159: ixor
    //   160: ixor
    //   161: lookupswitch default -> 188, -624035062 -> 144, -41635575 -> 1508
    //   188: putfield colorcodeIdentifiers : Ljava/lang/String;
    //   191: getstatic Perryc.1 : I
    //   194: ifeq -> 208
    //   197: ldc2_w 481094275
    //   200: l2i
    //   201: ldc_w -407257407
    //   204: ixor
    //   205: goto -> 216
    //   208: ldc2_w 1416159919
    //   211: l2i
    //   212: ldc_w 338656363
    //   215: ixor
    //   216: ldc2_w -103148971
    //   219: l2i
    //   220: ldc_w 2016649685
    //   223: ixor
    //   224: ixor
    //   225: lookupswitch default -> 252, 1284772797 -> 208, 2063394754 -> 1496
    //   252: aload_0
    //   253: getstatic Perryc.1 : I
    //   256: ifeq -> 270
    //   259: ldc2_w 24004061
    //   262: l2i
    //   263: ldc_w -1704043062
    //   266: ixor
    //   267: goto -> 278
    //   270: ldc2_w 194130741
    //   273: l2i
    //   274: ldc_w 88283011
    //   277: ixor
    //   278: ldc2_w 1492243398
    //   281: l2i
    //   282: ldc_w 1122720035
    //   285: ixor
    //   286: ixor
    //   287: lookupswitch default -> 1494, -2128964878 -> 270, 348892755 -> 312
    //   312: aload_1
    //   313: getstatic Perryc.c : I
    //   316: iflt -> 330
    //   319: ldc2_w -652071662
    //   322: l2i
    //   323: ldc_w -335300001
    //   326: ixor
    //   327: goto -> 338
    //   330: ldc2_w -106187025
    //   333: l2i
    //   334: ldc_w -77854099
    //   337: ixor
    //   338: ldc2_w 56145240
    //   341: l2i
    //   342: ldc_w 877813046
    //   345: ixor
    //   346: ixor
    //   347: lookupswitch default -> 1504, 36405027 -> 330, 905794796 -> 372
    //   372: iload_2
    //   373: getstatic Perryc.c : I
    //   376: iflt -> 390
    //   379: ldc2_w -635160672
    //   382: l2i
    //   383: ldc_w 970523108
    //   386: ixor
    //   387: goto -> 398
    //   390: ldc2_w 571596773
    //   393: l2i
    //   394: ldc_w -309368960
    //   397: ixor
    //   398: ldc2_w -558685266
    //   401: l2i
    //   402: ldc_w 1899284374
    //   405: ixor
    //   406: ixor
    //   407: lookupswitch default -> 432, 1283117692 -> 1516, 2145836569 -> 390
    //   432: iload_3
    //   433: getstatic Perryc.c : I
    //   436: iflt -> 450
    //   439: ldc2_w 1979242288
    //   442: l2i
    //   443: ldc_w -1896435637
    //   446: ixor
    //   447: goto -> 458
    //   450: ldc2_w 2015865455
    //   453: l2i
    //   454: ldc_w -258782590
    //   457: ixor
    //   458: ldc2_w -107923893
    //   461: l2i
    //   462: ldc_w 233117408
    //   465: ixor
    //   466: ixor
    //   467: lookupswitch default -> 492, 259672016 -> 1492, 1661082451 -> 450
    //   492: invokespecial <init> : (Ljava/awt/Font;ZZ)V
    //   495: getstatic Perryc.0 : I
    //   498: ifle -> 512
    //   501: ldc2_w 1723171198
    //   504: l2i
    //   505: ldc_w 1949981636
    //   508: ixor
    //   509: goto -> 520
    //   512: ldc2_w -2001695526
    //   515: l2i
    //   516: ldc_w -1187451510
    //   519: ixor
    //   520: ldc2_w 1866477002
    //   523: l2i
    //   524: ldc_w 2087832619
    //   527: ixor
    //   528: ixor
    //   529: lookupswitch default -> 1482, 29244251 -> 512, 582582449 -> 556
    //   556: aload_0
    //   557: ldc2_w 1559387438
    //   560: l2i
    //   561: ldc_w 1559387406
    //   564: ixor
    //   565: newarray int
    //   567: getstatic Perryc.1 : I
    //   570: ifeq -> 584
    //   573: ldc2_w -1498528656
    //   576: l2i
    //   577: ldc_w 1465403829
    //   580: ixor
    //   581: goto -> 592
    //   584: ldc2_w 56645119
    //   587: l2i
    //   588: ldc_w 301964104
    //   591: ixor
    //   592: ldc2_w 1443278764
    //   595: l2i
    //   596: ldc_w 123641652
    //   599: ixor
    //   600: ixor
    //   601: lookupswitch default -> 628, -1599193763 -> 1510, 1684653610 -> 584
    //   628: putfield colorCode : [I
    //   631: getstatic Perryc.0 : I
    //   634: ifle -> 648
    //   637: ldc2_w 484727887
    //   640: l2i
    //   641: ldc_w 1066617491
    //   644: ixor
    //   645: goto -> 656
    //   648: ldc2_w -1431767548
    //   651: l2i
    //   652: ldc_w 437992950
    //   655: ixor
    //   656: ldc2_w -586097251
    //   659: l2i
    //   660: ldc_w 856894251
    //   663: ixor
    //   664: ixor
    //   665: lookupswitch default -> 1524, -847978390 -> 648, 1588608324 -> 692
    //   692: aload_0
    //   693: ldc_w '麞㍂黶㷤ⱹ瀧ฯ踻炊☔ਥ匕煥έ辔䛏ꝣㄋᄪ侣'
    //   696: getstatic Perryc.0 : I
    //   699: ifle -> 713
    //   702: ldc2_w 747597541
    //   705: l2i
    //   706: ldc_w -890248848
    //   709: ixor
    //   710: goto -> 721
    //   713: ldc2_w -2033432400
    //   716: l2i
    //   717: ldc_w -1722412715
    //   720: ixor
    //   721: ldc2_w 789523193
    //   724: l2i
    //   725: ldc_w -450278369
    //   728: ixor
    //   729: ixor
    //   730: lookupswitch default -> 756, -2009283647 -> 713, 742844787 -> 1488
    //   756: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   759: getstatic Perryc.0 : I
    //   762: ifle -> 776
    //   765: ldc2_w -5392793
    //   768: l2i
    //   769: ldc_w 403024936
    //   772: ixor
    //   773: goto -> 784
    //   776: ldc2_w -1114557551
    //   779: l2i
    //   780: ldc_w 1991869384
    //   783: ixor
    //   784: ldc2_w -1703796419
    //   787: l2i
    //   788: ldc_w 34438355
    //   791: ixor
    //   792: ixor
    //   793: lookupswitch default -> 820, -485763124 -> 776, 2144815009 -> 1486
    //   820: putfield colorcodeIdentifiers : Ljava/lang/String;
    //   823: getstatic Perryc.c : I
    //   826: iflt -> 840
    //   829: ldc2_w 842215703
    //   832: l2i
    //   833: ldc_w -59876090
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 315464761
    //   843: l2i
    //   844: ldc_w -2048873650
    //   847: ixor
    //   848: ldc2_w -70474091
    //   851: l2i
    //   852: ldc_w 771680947
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 1502, 409935927 -> 840, 1092582225 -> 884
    //   884: aload_0
    //   885: ldc2_w 758599160
    //   888: l2i
    //   889: ldc_w 758598904
    //   892: ixor
    //   893: anewarray bigname/zprestige/webhack/features/gui/font/CFont$CharData
    //   896: getstatic Perryc.c : I
    //   899: iflt -> 913
    //   902: ldc2_w -1910734515
    //   905: l2i
    //   906: ldc_w -1450613811
    //   909: ixor
    //   910: goto -> 921
    //   913: ldc2_w -1719910768
    //   916: l2i
    //   917: ldc_w 181475086
    //   920: ixor
    //   921: ldc2_w -1608527464
    //   924: l2i
    //   925: ldc_w -289348565
    //   928: ixor
    //   929: ixor
    //   930: lookupswitch default -> 956, -729229643 -> 913, 1766512435 -> 1520
    //   956: putfield boldChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   959: getstatic Perryc.0 : I
    //   962: ifle -> 976
    //   965: ldc2_w -367418154
    //   968: l2i
    //   969: ldc_w 118844575
    //   972: ixor
    //   973: goto -> 984
    //   976: ldc2_w -133668056
    //   979: l2i
    //   980: ldc_w -1820104344
    //   983: ixor
    //   984: ldc2_w 1181912114
    //   987: l2i
    //   988: ldc_w 656459282
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 1514, -1939963287 -> 976, 182009952 -> 1020
    //   1020: aload_0
    //   1021: ldc2_w -1459705730
    //   1024: l2i
    //   1025: ldc_w -1459705474
    //   1028: ixor
    //   1029: anewarray bigname/zprestige/webhack/features/gui/font/CFont$CharData
    //   1032: getstatic Perryc.1 : I
    //   1035: ifeq -> 1049
    //   1038: ldc2_w -1620342892
    //   1041: l2i
    //   1042: ldc_w -703918790
    //   1045: ixor
    //   1046: goto -> 1057
    //   1049: ldc2_w -1563367795
    //   1052: l2i
    //   1053: ldc_w -551410902
    //   1056: ixor
    //   1057: ldc2_w 931733305
    //   1060: l2i
    //   1061: ldc_w 1643752388
    //   1064: ixor
    //   1065: ixor
    //   1066: lookupswitch default -> 1498, 521158227 -> 1049, 729968986 -> 1092
    //   1092: putfield italicChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   1095: getstatic Perryc.1 : I
    //   1098: ifeq -> 1112
    //   1101: ldc2_w 813878004
    //   1104: l2i
    //   1105: ldc_w 836868141
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -276064383
    //   1115: l2i
    //   1116: ldc_w 259715559
    //   1119: ixor
    //   1120: ldc2_w -538930999
    //   1123: l2i
    //   1124: ldc_w -515891269
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 1506, -565057260 -> 1156, 1069800875 -> 1112
    //   1156: aload_0
    //   1157: ldc2_w 985386224
    //   1160: l2i
    //   1161: ldc_w 985386480
    //   1164: ixor
    //   1165: anewarray bigname/zprestige/webhack/features/gui/font/CFont$CharData
    //   1168: getstatic Perryc.c : I
    //   1171: iflt -> 1185
    //   1174: ldc2_w -1177964489
    //   1177: l2i
    //   1178: ldc_w 1308812674
    //   1181: ixor
    //   1182: goto -> 1193
    //   1185: ldc2_w 1528679037
    //   1188: l2i
    //   1189: ldc_w 1327612531
    //   1192: ixor
    //   1193: ldc2_w -1937613853
    //   1196: l2i
    //   1197: ldc_w -463345510
    //   1200: ixor
    //   1201: ixor
    //   1202: lookupswitch default -> 1522, -1624709428 -> 1185, 2095037303 -> 1228
    //   1228: putfield boldItalicChars : [Lbigname/zprestige/webhack/features/gui/font/CFont$CharData;
    //   1231: getstatic Perryc.0 : I
    //   1234: ifle -> 1248
    //   1237: ldc2_w 2133840128
    //   1240: l2i
    //   1241: ldc_w -1698631703
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w -1879377176
    //   1251: l2i
    //   1252: ldc_w -496694938
    //   1255: ixor
    //   1256: ldc2_w 1505163697
    //   1259: l2i
    //   1260: ldc_w 529587550
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, -1547101690 -> 1490, 677176990 -> 1248
    //   1292: aload_0
    //   1293: getstatic Perryc.c : I
    //   1296: iflt -> 1310
    //   1299: ldc2_w 1487826444
    //   1302: l2i
    //   1303: ldc_w -1528854554
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w 125779389
    //   1313: l2i
    //   1314: ldc_w 1076012163
    //   1317: ixor
    //   1318: ldc2_w 708298262
    //   1321: l2i
    //   1322: ldc_w 512953892
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1500, -925556264 -> 1310, 1945719052 -> 1352
    //   1352: invokespecial setupMinecraftColorcodes : ()V
    //   1355: getstatic Perryc.1 : I
    //   1358: ifeq -> 1372
    //   1361: ldc2_w -784562053
    //   1364: l2i
    //   1365: ldc_w -1215535193
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 573985070
    //   1375: l2i
    //   1376: ldc_w -936339140
    //   1379: ixor
    //   1380: ldc2_w 317713989
    //   1383: l2i
    //   1384: ldc_w 969617691
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 1416, 1094892439 -> 1372, 1301557378 -> 1512
    //   1416: aload_0
    //   1417: getstatic Perryc.0 : I
    //   1420: ifle -> 1434
    //   1423: ldc2_w -1698841792
    //   1426: l2i
    //   1427: ldc_w 1983177690
    //   1430: ixor
    //   1431: goto -> 1442
    //   1434: ldc2_w -333700432
    //   1437: l2i
    //   1438: ldc_w 1720466070
    //   1441: ixor
    //   1442: ldc2_w -2021087373
    //   1445: l2i
    //   1446: ldc_w -971386776
    //   1449: ixor
    //   1450: ixor
    //   1451: lookupswitch default -> 1476, -1390923903 -> 1518, 828331078 -> 1434
    //   1476: invokespecial setupBoldItalicIDs : ()V
    //   1479: return
    //   1480: aconst_null
    //   1481: athrow
    //   1482: aconst_null
    //   1483: athrow
    //   1484: aconst_null
    //   1485: athrow
    //   1486: aconst_null
    //   1487: athrow
    //   1488: aconst_null
    //   1489: athrow
    //   1490: aconst_null
    //   1491: athrow
    //   1492: aconst_null
    //   1493: athrow
    //   1494: aconst_null
    //   1495: athrow
    //   1496: aconst_null
    //   1497: athrow
    //   1498: aconst_null
    //   1499: athrow
    //   1500: aconst_null
    //   1501: athrow
    //   1502: aconst_null
    //   1503: athrow
    //   1504: aconst_null
    //   1505: athrow
    //   1506: aconst_null
    //   1507: athrow
    //   1508: aconst_null
    //   1509: athrow
    //   1510: aconst_null
    //   1511: athrow
    //   1512: aconst_null
    //   1513: athrow
    //   1514: aconst_null
    //   1515: athrow
    //   1516: aconst_null
    //   1517: athrow
    //   1518: aconst_null
    //   1519: athrow
    //   1520: aconst_null
    //   1521: athrow
    //   1522: aconst_null
    //   1523: athrow
    //   1524: aconst_null
    //   1525: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   191	1289	0	this	Lbigname/zprestige/webhack/features/gui/font/CustomFont;
    //   191	1289	1	font	Ljava/awt/Font;
    //   191	1289	2	antiAlias	Z
    //   191	1289	3	fractionalMetrics	Z
  }
  
  public void setupBoldItalicIDs() {
    Perry1.3M(this, (int)-581740610L ^ 0x82969FE0);
  }
  
  public float drawString(String paramString, float paramFloat1, float paramFloat2, int paramInt) {
    return Perry1.N(this, (int)2058491614L ^ 0x324648AE, paramString, paramFloat1, paramFloat2, paramInt);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\font\CustomFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */