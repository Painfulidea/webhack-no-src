package bigname.zprestige.webhack.manager.Identity;

import Perryc;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.charset.CharsetEncoder;

public class UtilTwo$RequestOutputStream extends BufferedOutputStream {
  public CharsetEncoder encoder;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public UtilTwo$RequestOutputStream(OutputStream stream, String charset, int bufferSize) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1735485894
    //   9: l2i
    //   10: ldc -1157787731
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -2131695037
    //   19: l2i
    //   20: ldc -210675125
    //   22: ixor
    //   23: ldc2_w -1511768078
    //   26: l2i
    //   27: ldc 1375490343
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1989142037 -> 16, -697600190 -> 606
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 971804562
    //   66: l2i
    //   67: ldc 599667839
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1909858270
    //   76: l2i
    //   77: ldc -1198301745
    //   79: ixor
    //   80: ldc2_w 1728335566
    //   83: l2i
    //   84: ldc 1425520972
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 608, 88689263 -> 116, 698436719 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w -728121392
    //   126: l2i
    //   127: ldc -1563708595
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 1031561983
    //   136: l2i
    //   137: ldc -693033291
    //   139: ixor
    //   140: ldc2_w 1530728960
    //   143: l2i
    //   144: ldc -1686214315
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -1240369208 -> 600, 309943291 -> 133
    //   176: iload_3
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w 378664211
    //   186: l2i
    //   187: ldc -207445185
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 56775237
    //   196: l2i
    //   197: ldc 482976042
    //   199: ixor
    //   200: ldc2_w -595128579
    //   203: l2i
    //   204: ldc -1293491613
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -1957512526 -> 602, -324131094 -> 193
    //   236: invokespecial <init> : (Ljava/io/OutputStream;I)V
    //   239: getstatic Perryc.0 : I
    //   242: ifle -> 255
    //   245: ldc2_w 1951857596
    //   248: l2i
    //   249: ldc -1969671408
    //   251: ixor
    //   252: goto -> 262
    //   255: ldc2_w -1608063872
    //   258: l2i
    //   259: ldc 2038363286
    //   261: ixor
    //   262: ldc2_w 1899806644
    //   265: l2i
    //   266: ldc -776925928
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 612, 1581414912 -> 255, 2044043962 -> 296
    //   296: aload_0
    //   297: getstatic Perryc.0 : I
    //   300: ifle -> 313
    //   303: ldc2_w -897336758
    //   306: l2i
    //   307: ldc -2131078813
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -1291453298
    //   316: l2i
    //   317: ldc -1753006472
    //   319: ixor
    //   320: ldc2_w 1070062199
    //   323: l2i
    //   324: ldc 938928590
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 604, 750252367 -> 356, 1112070288 -> 313
    //   356: aload_2
    //   357: getstatic Perryc.0 : I
    //   360: ifle -> 373
    //   363: ldc2_w -809801641
    //   366: l2i
    //   367: ldc 1788116924
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -1076738742
    //   376: l2i
    //   377: ldc -475245164
    //   379: ixor
    //   380: ldc2_w -648347115
    //   383: l2i
    //   384: ldc -1610771187
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1440567729 -> 373, -477527821 -> 610
    //   416: invokestatic access$000 : (Ljava/lang/String;)Ljava/lang/String;
    //   419: getstatic Perryc.c : I
    //   422: iflt -> 435
    //   425: ldc2_w -2110274524
    //   428: l2i
    //   429: ldc 496426964
    //   431: ixor
    //   432: goto -> 442
    //   435: ldc2_w 65754960
    //   438: l2i
    //   439: ldc -41445861
    //   441: ixor
    //   442: ldc2_w -1455263608
    //   445: l2i
    //   446: ldc -1311986128
    //   448: ixor
    //   449: ixor
    //   450: lookupswitch default -> 616, -2026912440 -> 435, -421388301 -> 476
    //   476: invokestatic forName : (Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   479: getstatic Perryc.c : I
    //   482: iflt -> 495
    //   485: ldc2_w 391400271
    //   488: l2i
    //   489: ldc 1814142116
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -1102669790
    //   498: l2i
    //   499: ldc -839086962
    //   501: ixor
    //   502: ldc2_w -404701335
    //   505: l2i
    //   506: ldc -167875785
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 618, 1638187250 -> 536, 1768620981 -> 495
    //   536: invokevirtual newEncoder : ()Ljava/nio/charset/CharsetEncoder;
    //   539: getstatic Perryc.1 : I
    //   542: ifeq -> 555
    //   545: ldc2_w 1446475608
    //   548: l2i
    //   549: ldc -134682606
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w 2139694876
    //   558: l2i
    //   559: ldc -196332010
    //   561: ixor
    //   562: ldc2_w 2049742632
    //   565: l2i
    //   566: ldc 259464253
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, -728492961 -> 614, 2134779668 -> 555
    //   596: putfield encoder : Ljava/nio/charset/CharsetEncoder;
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
    //   618: aconst_null
    //   619: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	600	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$RequestOutputStream;
    //   0	600	1	stream	Ljava/io/OutputStream;
    //   0	600	2	charset	Ljava/lang/String;
    //   0	600	3	bufferSize	I
  }
  
  public UtilTwo$RequestOutputStream write(String value) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 913
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 905
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 897
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -1448151472
    //   33: l2i
    //   34: ldc -2058286891
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1219964989
    //   43: l2i
    //   44: ldc 1266406476
    //   46: ixor
    //   47: ldc2_w -1109870161
    //   50: l2i
    //   51: ldc 749185688
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -1364936868 -> 40, -1115624014 -> 872
    //   80: aload_0
    //   81: getstatic Perryc.c : I
    //   84: iflt -> 97
    //   87: ldc2_w -369906070
    //   90: l2i
    //   91: ldc 1495293863
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1784420219
    //   100: l2i
    //   101: ldc -577185196
    //   103: ixor
    //   104: ldc2_w 805557976
    //   107: l2i
    //   108: ldc 992880321
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1140981292 -> 868, 2050436778 -> 97
    //   140: getfield encoder : Ljava/nio/charset/CharsetEncoder;
    //   143: getstatic Perryc.0 : I
    //   146: ifle -> 159
    //   149: ldc2_w -1926245269
    //   152: l2i
    //   153: ldc -1045790443
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1006614013
    //   162: l2i
    //   163: ldc 1831734849
    //   165: ixor
    //   166: ldc2_w 1100785020
    //   169: l2i
    //   170: ldc 58886966
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -14144417 -> 159, 245070644 -> 882
    //   200: aload_1
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -27272894
    //   210: l2i
    //   211: ldc -1507412448
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -1054016785
    //   220: l2i
    //   221: ldc 1504525532
    //   223: ixor
    //   224: ldc2_w -1636509774
    //   227: l2i
    //   228: ldc 267929159
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 260, -906625385 -> 864, 1859126277 -> 217
    //   260: goto -> 264
    //   263: athrow
    //   264: invokestatic wrap : (Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;
    //   267: goto -> 271
    //   270: athrow
    //   271: getstatic Perryc.0 : I
    //   274: ifle -> 287
    //   277: ldc2_w -1148005997
    //   280: l2i
    //   281: ldc -1678857451
    //   283: ixor
    //   284: goto -> 294
    //   287: ldc2_w -1707147308
    //   290: l2i
    //   291: ldc 1983167060
    //   293: ixor
    //   294: ldc2_w -1364425036
    //   297: l2i
    //   298: ldc 1134268528
    //   300: ixor
    //   301: ixor
    //   302: lookupswitch default -> 866, -850695102 -> 287, 20796228 -> 328
    //   328: goto -> 332
    //   331: athrow
    //   332: invokevirtual encode : (Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;
    //   335: goto -> 339
    //   338: athrow
    //   339: getstatic Perryc.c : I
    //   342: iflt -> 355
    //   345: ldc2_w -1514307515
    //   348: l2i
    //   349: ldc 2043072377
    //   351: ixor
    //   352: goto -> 362
    //   355: ldc2_w 1753788283
    //   358: l2i
    //   359: ldc -231866066
    //   361: ixor
    //   362: ldc2_w -1316741967
    //   365: l2i
    //   366: ldc_w -1026780617
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 396, -1355562566 -> 870, -354666651 -> 355
    //   396: astore_2
    //   397: getstatic Perryc.0 : I
    //   400: ifle -> 414
    //   403: ldc2_w 1129969168
    //   406: l2i
    //   407: ldc_w 2032691504
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w -1875659391
    //   417: l2i
    //   418: ldc_w -1390938962
    //   421: ixor
    //   422: ldc2_w 328080450
    //   425: l2i
    //   426: ldc_w 1133818546
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 456, -1013389908 -> 414, 1785410000 -> 878
    //   456: aload_0
    //   457: getstatic Perryc.0 : I
    //   460: ifle -> 474
    //   463: ldc2_w 847087451
    //   466: l2i
    //   467: ldc_w -935416523
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w 633668154
    //   477: l2i
    //   478: ldc_w -229264492
    //   481: ixor
    //   482: ldc2_w -1416462428
    //   485: l2i
    //   486: ldc_w 1142234834
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 886, 365185816 -> 474, 941084888 -> 516
    //   516: aload_2
    //   517: getstatic Perryc.0 : I
    //   520: ifle -> 534
    //   523: ldc2_w -2128449191
    //   526: l2i
    //   527: ldc_w 1047120102
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w -1221007425
    //   537: l2i
    //   538: ldc_w 393378276
    //   541: ixor
    //   542: ldc2_w -2095792982
    //   545: l2i
    //   546: ldc_w 834416797
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 576, -1947888027 -> 534, 232994184 -> 874
    //   576: goto -> 580
    //   579: athrow
    //   580: invokevirtual array : ()[B
    //   583: goto -> 587
    //   586: athrow
    //   587: ldc2_w -360416967
    //   590: l2i
    //   591: ldc_w -360416967
    //   594: ixor
    //   595: getstatic Perryc.1 : I
    //   598: ifeq -> 612
    //   601: ldc2_w 1775135668
    //   604: l2i
    //   605: ldc_w -449933627
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w -259862448
    //   615: l2i
    //   616: ldc_w 45990280
    //   619: ixor
    //   620: ldc2_w 1852146956
    //   623: l2i
    //   624: ldc_w -2101796250
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 862, 518239922 -> 656, 1614561819 -> 612
    //   656: aload_2
    //   657: getstatic Perryc.1 : I
    //   660: ifeq -> 674
    //   663: ldc2_w 790741217
    //   666: l2i
    //   667: ldc_w -1132709324
    //   670: ixor
    //   671: goto -> 682
    //   674: ldc2_w 709405049
    //   677: l2i
    //   678: ldc_w -615499001
    //   681: ixor
    //   682: ldc2_w -1440950227
    //   685: l2i
    //   686: ldc_w 40114934
    //   689: ixor
    //   690: ixor
    //   691: lookupswitch default -> 716, 992294926 -> 880, 2024411993 -> 674
    //   716: goto -> 720
    //   719: athrow
    //   720: invokevirtual limit : ()I
    //   723: goto -> 727
    //   726: athrow
    //   727: getstatic Perryc.1 : I
    //   730: ifeq -> 744
    //   733: ldc2_w -757564645
    //   736: l2i
    //   737: ldc_w 69123624
    //   740: ixor
    //   741: goto -> 752
    //   744: ldc2_w 2004272170
    //   747: l2i
    //   748: ldc_w -729964340
    //   751: ixor
    //   752: ldc2_w 1896799157
    //   755: l2i
    //   756: ldc_w 414732082
    //   759: ixor
    //   760: ixor
    //   761: lookupswitch default -> 788, -1083158092 -> 876, 353198859 -> 744
    //   788: goto -> 792
    //   791: athrow
    //   792: invokespecial write : ([BII)V
    //   795: goto -> 799
    //   798: athrow
    //   799: getstatic Perryc.1 : I
    //   802: ifeq -> 816
    //   805: ldc2_w 1358953805
    //   808: l2i
    //   809: ldc_w 104588729
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -1329941187
    //   819: l2i
    //   820: ldc_w 378621193
    //   823: ixor
    //   824: ldc2_w 165608640
    //   827: l2i
    //   828: ldc_w 2084033360
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 860, 590165860 -> 884, 776848907 -> 816
    //   860: aload_0
    //   861: areturn
    //   862: aconst_null
    //   863: athrow
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
    //   888: pop
    //   889: goto -> 24
    //   892: pop
    //   893: aconst_null
    //   894: goto -> 888
    //   897: dup
    //   898: ifnull -> 888
    //   901: checkcast java/lang/Throwable
    //   904: athrow
    //   905: dup
    //   906: ifnull -> 892
    //   909: checkcast java/lang/Throwable
    //   912: athrow
    //   913: aconst_null
    //   914: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	838	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$RequestOutputStream;
    //   24	838	1	value	Ljava/lang/String;
    //   397	465	2	bytes	Ljava/nio/ByteBuffer;
    // Exception table:
    //   from	to	target	type
    //   8	20	897	java/lang/IndexOutOfBoundsException
    //   263	270	270	finally
    //   263	270	263	finally
    //   263	270	270	finally
    //   264	270	270	java/lang/IllegalArgumentException
    //   264	270	270	finally
    //   332	338	338	finally
    //   332	338	338	finally
    //   332	338	3	finally
    //   332	338	3	finally
    //   332	338	3	java/lang/RuntimeException
    //   579	586	586	finally
    //   579	586	3	java/lang/NullPointerException
    //   579	586	3	java/lang/NumberFormatException
    //   580	586	579	java/lang/EnumConstantNotPresentException
    //   580	586	3	java/lang/UnsupportedOperationException
    //   720	726	726	finally
    //   720	726	3	finally
    //   720	726	726	finally
    //   720	726	726	finally
    //   720	726	726	java/lang/UnsupportedOperationException
    //   791	798	798	finally
    //   791	798	798	java/lang/NumberFormatException
    //   791	798	798	finally
    //   792	798	791	java/lang/AssertionError
    //   792	798	791	finally
    //   897	905	897	java/util/ConcurrentModificationException
    //   913	915	3	java/lang/StringIndexOutOfBoundsException
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$RequestOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */