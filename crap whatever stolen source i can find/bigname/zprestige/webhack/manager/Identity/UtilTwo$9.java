package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import java.io.Closeable;
import java.io.Reader;
import java.io.Writer;

public class UtilTwo$9 extends UtilTwo$CloseOperation {
  public Reader val$input;
  
  public Writer val$output;
  
  public UtilTwo this$0;
  
  public UtilTwo$9(UtilTwo this$0, Closeable closeable, boolean ignoreCloseExceptions, Reader paramReader, Writer paramWriter) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -104839648
    //   9: l2i
    //   10: ldc 2082668532
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1517360662
    //   19: l2i
    //   20: ldc -1336263658
    //   22: ixor
    //   23: ldc2_w -225320707
    //   26: l2i
    //   27: ldc -727014829
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1545995398 -> 798, 1998582333 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1325346847
    //   66: l2i
    //   67: ldc 980717557
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1838851131
    //   76: l2i
    //   77: ldc 1459553289
    //   79: ixor
    //   80: ldc2_w 830069208
    //   83: l2i
    //   84: ldc 596390770
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 790, 697322136 -> 116, 1719555392 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w -1076224066
    //   126: l2i
    //   127: ldc 1735476543
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 606128832
    //   136: l2i
    //   137: ldc -792532001
    //   139: ixor
    //   140: ldc2_w 1049166666
    //   143: l2i
    //   144: ldc 1537551786
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 792, -1848766465 -> 176, -1115196319 -> 133
    //   176: putfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -1381779249
    //   188: l2i
    //   189: ldc 934614029
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 352472330
    //   198: l2i
    //   199: ldc 1768550890
    //   201: ixor
    //   202: ldc2_w -1991783582
    //   205: l2i
    //   206: ldc -534482671
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 794, -210430287 -> 195, 352847507 -> 236
    //   236: aload_0
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w 164599484
    //   246: l2i
    //   247: ldc -132085077
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -1958489130
    //   256: l2i
    //   257: ldc -1852076948
    //   259: ixor
    //   260: ldc2_w 1436434886
    //   263: l2i
    //   264: ldc 1027299237
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 782, -1723200908 -> 253, 1920813529 -> 296
    //   296: aload #4
    //   298: getstatic Perryc.c : I
    //   301: iflt -> 314
    //   304: ldc2_w 2146116993
    //   307: l2i
    //   308: ldc -1119307565
    //   310: ixor
    //   311: goto -> 321
    //   314: ldc2_w -322053198
    //   317: l2i
    //   318: ldc 436314048
    //   320: ixor
    //   321: ldc2_w 1207622707
    //   324: l2i
    //   325: ldc -764570742
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 356, -2079461717 -> 314, 1463079659 -> 788
    //   356: putfield val$input : Ljava/io/Reader;
    //   359: getstatic Perryc.0 : I
    //   362: ifle -> 375
    //   365: ldc2_w 649915582
    //   368: l2i
    //   369: ldc -977633930
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w 1870134001
    //   378: l2i
    //   379: ldc -1403772948
    //   381: ixor
    //   382: ldc2_w 11305846
    //   385: l2i
    //   386: ldc -1106876377
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 416, -1606694357 -> 375, 1571584665 -> 786
    //   416: aload_0
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w -522856933
    //   426: l2i
    //   427: ldc 1035432873
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1633126470
    //   436: l2i
    //   437: ldc -947984900
    //   439: ixor
    //   440: ldc2_w 756386786
    //   443: l2i
    //   444: ldc -219909095
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 780, 43211337 -> 433, 2044236353 -> 476
    //   476: aload #5
    //   478: getstatic Perryc.1 : I
    //   481: ifeq -> 494
    //   484: ldc2_w -1071773164
    //   487: l2i
    //   488: ldc 735835486
    //   490: ixor
    //   491: goto -> 501
    //   494: ldc2_w -108592882
    //   497: l2i
    //   498: ldc -46954064
    //   500: ixor
    //   501: ldc2_w 693388501
    //   504: l2i
    //   505: ldc -1584574239
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, 396263455 -> 494, 1662839678 -> 784
    //   536: putfield val$output : Ljava/io/Writer;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 555
    //   545: ldc2_w 1532951952
    //   548: l2i
    //   549: ldc -1725873237
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w -807601753
    //   558: l2i
    //   559: ldc 1400325777
    //   561: ixor
    //   562: ldc2_w -479651903
    //   565: l2i
    //   566: ldc -183163662
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 802, -1965585403 -> 596, -737964792 -> 555
    //   596: aload_0
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 613
    //   603: ldc2_w -616811935
    //   606: l2i
    //   607: ldc -1512894000
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w -884873887
    //   616: l2i
    //   617: ldc 499881285
    //   619: ixor
    //   620: ldc2_w 417039070
    //   623: l2i
    //   624: ldc 507074114
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 804, -798448456 -> 656, 2014181165 -> 613
    //   656: aload_2
    //   657: getstatic Perryc.c : I
    //   660: iflt -> 673
    //   663: ldc2_w -1485562141
    //   666: l2i
    //   667: ldc 850355358
    //   669: ixor
    //   670: goto -> 680
    //   673: ldc2_w 615144951
    //   676: l2i
    //   677: ldc 435344285
    //   679: ixor
    //   680: ldc2_w -567237020
    //   683: l2i
    //   684: ldc -90936797
    //   686: ixor
    //   687: ixor
    //   688: lookupswitch default -> 716, -1317030342 -> 800, 1297917773 -> 673
    //   716: iload_3
    //   717: getstatic Perryc.1 : I
    //   720: ifeq -> 733
    //   723: ldc2_w 1869956008
    //   726: l2i
    //   727: ldc 734916946
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w 1557703902
    //   736: l2i
    //   737: ldc 627981081
    //   739: ixor
    //   740: ldc2_w 1755107469
    //   743: l2i
    //   744: ldc -706984050
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 776, -101177863 -> 796, 335997369 -> 733
    //   776: invokespecial <init> : (Ljava/io/Closeable;Z)V
    //   779: return
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
    //   790: aconst_null
    //   791: athrow
    //   792: aconst_null
    //   793: athrow
    //   794: aconst_null
    //   795: athrow
    //   796: aconst_null
    //   797: athrow
    //   798: aconst_null
    //   799: athrow
    //   800: aconst_null
    //   801: athrow
    //   802: aconst_null
    //   803: athrow
    //   804: aconst_null
    //   805: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	780	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$9;
    //   0	780	1	this$0	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   0	780	2	closeable	Ljava/io/Closeable;
    //   0	780	3	ignoreCloseExceptions	Z
  }
  
  public Object run() {
    return Perry1.2f(this, (int)-992214660L ^ 0xB9F23619);
  }
  
  public UtilTwo run() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2117
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2109
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2101
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w -38683205
    //   33: l2i
    //   34: ldc 1116301839
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1783932229
    //   43: l2i
    //   44: ldc -611430358
    //   46: ixor
    //   47: ldc2_w -404153984
    //   50: l2i
    //   51: ldc -1292843841
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 2050, -456972208 -> 80, -366933365 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w 391743819
    //   90: l2i
    //   91: ldc 1392608218
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 638389498
    //   100: l2i
    //   101: ldc 1937594734
    //   103: ixor
    //   104: ldc2_w 2023257154
    //   107: l2i
    //   108: ldc -1951363418
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1217335179 -> 2070, 1707044507 -> 97
    //   140: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   143: getstatic Perryc.1 : I
    //   146: ifeq -> 159
    //   149: ldc2_w -1856967102
    //   152: l2i
    //   153: ldc -2005987293
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1028918004
    //   162: l2i
    //   163: ldc -1821910132
    //   165: ixor
    //   166: ldc2_w 1483901996
    //   169: l2i
    //   170: ldc -420812526
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 2052, -1482187937 -> 159, -279688258 -> 200
    //   200: goto -> 204
    //   203: athrow
    //   204: invokestatic access$100 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;)I
    //   207: goto -> 211
    //   210: athrow
    //   211: newarray char
    //   213: getstatic Perryc.0 : I
    //   216: ifle -> 229
    //   219: ldc2_w -487093335
    //   222: l2i
    //   223: ldc 2016093786
    //   225: ixor
    //   226: goto -> 236
    //   229: ldc2_w -429587872
    //   232: l2i
    //   233: ldc 1691126214
    //   235: ixor
    //   236: ldc2_w -1272407791
    //   239: l2i
    //   240: ldc -1546889965
    //   242: ixor
    //   243: ixor
    //   244: lookupswitch default -> 272, -1925684751 -> 2056, 1721373849 -> 229
    //   272: astore_1
    //   273: getstatic Perryc.1 : I
    //   276: ifeq -> 289
    //   279: ldc2_w -1791113627
    //   282: l2i
    //   283: ldc -156486396
    //   285: ixor
    //   286: goto -> 296
    //   289: ldc2_w -2130291495
    //   292: l2i
    //   293: ldc 1901246003
    //   295: ixor
    //   296: ldc2_w 1345568294
    //   299: l2i
    //   300: ldc -385111820
    //   302: ixor
    //   303: ixor
    //   304: lookupswitch default -> 332, -626399821 -> 2084, 968149830 -> 289
    //   332: aload_0
    //   333: getstatic Perryc.c : I
    //   336: iflt -> 349
    //   339: ldc2_w -285526901
    //   342: l2i
    //   343: ldc -1354868882
    //   345: ixor
    //   346: goto -> 357
    //   349: ldc2_w 1654641700
    //   352: l2i
    //   353: ldc_w -1511637881
    //   356: ixor
    //   357: ldc2_w 1046950399
    //   360: l2i
    //   361: ldc_w -1650928224
    //   364: ixor
    //   365: ixor
    //   366: lookupswitch default -> 392, -838478120 -> 349, -499480646 -> 2034
    //   392: getfield val$input : Ljava/io/Reader;
    //   395: getstatic Perryc.0 : I
    //   398: ifle -> 412
    //   401: ldc2_w -1420814521
    //   404: l2i
    //   405: ldc_w -213520721
    //   408: ixor
    //   409: goto -> 420
    //   412: ldc2_w 1172002559
    //   415: l2i
    //   416: ldc_w -685144935
    //   419: ixor
    //   420: ldc2_w -1730235468
    //   423: l2i
    //   424: ldc_w -1190950240
    //   427: ixor
    //   428: ixor
    //   429: lookupswitch default -> 456, 1889203339 -> 412, 2043199740 -> 2058
    //   456: aload_1
    //   457: getstatic Perryc.c : I
    //   460: iflt -> 474
    //   463: ldc2_w 1314024708
    //   466: l2i
    //   467: ldc_w 1683706507
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w -312834833
    //   477: l2i
    //   478: ldc_w -1826839897
    //   481: ixor
    //   482: ldc2_w 725035892
    //   485: l2i
    //   486: ldc_w 1491668021
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 516, -520422119 -> 474, 1507268814 -> 2072
    //   516: goto -> 520
    //   519: athrow
    //   520: invokevirtual read : ([C)I
    //   523: goto -> 527
    //   526: athrow
    //   527: dup
    //   528: getstatic Perryc.0 : I
    //   531: ifle -> 545
    //   534: ldc2_w -785632936
    //   537: l2i
    //   538: ldc_w -75270165
    //   541: ixor
    //   542: goto -> 553
    //   545: ldc2_w 1342824805
    //   548: l2i
    //   549: ldc_w -1081920366
    //   552: ixor
    //   553: ldc2_w 248927020
    //   556: l2i
    //   557: ldc_w -312033455
    //   560: ixor
    //   561: ixor
    //   562: lookupswitch default -> 588, -920671538 -> 2086, 658358571 -> 545
    //   588: istore_2
    //   589: ldc2_w -2037495405
    //   592: l2i
    //   593: ldc_w 2037495404
    //   596: ixor
    //   597: if_icmpeq -> 611
    //   600: ldc2_w 1466614589
    //   603: l2i
    //   604: ldc_w -1875452769
    //   607: ixor
    //   608: goto -> 619
    //   611: ldc2_w -471398585
    //   614: l2i
    //   615: ldc_w 616241380
    //   618: ixor
    //   619: ldc2_w 70031055
    //   622: l2i
    //   623: ldc_w 574975545
    //   626: ixor
    //   627: ixor
    //   628: tableswitch default -> 600, -516561068 -> 652, -516561067 -> 1908
    //   652: getstatic Perryc.0 : I
    //   655: ifle -> 669
    //   658: ldc2_w 666633853
    //   661: l2i
    //   662: ldc_w -565210888
    //   665: ixor
    //   666: goto -> 677
    //   669: ldc2_w -1920077231
    //   672: l2i
    //   673: ldc_w -582763284
    //   676: ixor
    //   677: ldc2_w -1033833934
    //   680: l2i
    //   681: ldc_w -809283811
    //   684: ixor
    //   685: ixor
    //   686: lookupswitch default -> 712, -196072534 -> 2044, 808469258 -> 669
    //   712: aload_0
    //   713: getstatic Perryc.1 : I
    //   716: ifeq -> 730
    //   719: ldc2_w -2037778408
    //   722: l2i
    //   723: ldc_w 1613517107
    //   726: ixor
    //   727: goto -> 738
    //   730: ldc2_w 1571095817
    //   733: l2i
    //   734: ldc_w 523743203
    //   737: ixor
    //   738: ldc2_w -1537334137
    //   741: l2i
    //   742: ldc_w -677210062
    //   745: ixor
    //   746: ixor
    //   747: lookupswitch default -> 2090, -1789323874 -> 730, 829298271 -> 772
    //   772: getfield val$output : Ljava/io/Writer;
    //   775: getstatic Perryc.0 : I
    //   778: ifle -> 792
    //   781: ldc2_w -922308429
    //   784: l2i
    //   785: ldc_w 1259514458
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w 728081296
    //   795: l2i
    //   796: ldc_w 1074297084
    //   799: ixor
    //   800: ldc2_w 1970685464
    //   803: l2i
    //   804: ldc_w -1951436390
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 836, 1085166020 -> 792, 2093821291 -> 2076
    //   836: aload_1
    //   837: ldc2_w -604375628
    //   840: l2i
    //   841: ldc_w -604375628
    //   844: ixor
    //   845: getstatic Perryc.c : I
    //   848: iflt -> 862
    //   851: ldc2_w 288230675
    //   854: l2i
    //   855: ldc_w 731395558
    //   858: ixor
    //   859: goto -> 870
    //   862: ldc2_w 1260654454
    //   865: l2i
    //   866: ldc_w 1037836914
    //   869: ixor
    //   870: ldc2_w -843048269
    //   873: l2i
    //   874: ldc_w -1340481154
    //   877: ixor
    //   878: ixor
    //   879: lookupswitch default -> 904, 1198506808 -> 2036, 1352770262 -> 862
    //   904: iload_2
    //   905: getstatic Perryc.0 : I
    //   908: ifle -> 922
    //   911: ldc2_w -1041699858
    //   914: l2i
    //   915: ldc_w 595933800
    //   918: ixor
    //   919: goto -> 930
    //   922: ldc2_w -1286912576
    //   925: l2i
    //   926: ldc_w 485735680
    //   929: ixor
    //   930: ldc2_w -1161675379
    //   933: l2i
    //   934: ldc_w 1008103118
    //   937: ixor
    //   938: ixor
    //   939: lookupswitch default -> 2048, 694987651 -> 964, 1689879237 -> 922
    //   964: goto -> 968
    //   967: athrow
    //   968: invokevirtual write : ([CII)V
    //   971: goto -> 975
    //   974: athrow
    //   975: getstatic Perryc.1 : I
    //   978: ifeq -> 992
    //   981: ldc2_w -1058186863
    //   984: l2i
    //   985: ldc_w 1113533136
    //   988: ixor
    //   989: goto -> 1000
    //   992: ldc2_w 1389806786
    //   995: l2i
    //   996: ldc_w 1941897714
    //   999: ixor
    //   1000: ldc2_w 1504870763
    //   1003: l2i
    //   1004: ldc_w 301795423
    //   1007: ixor
    //   1008: ixor
    //   1009: lookupswitch default -> 1036, -889324939 -> 2062, -785927051 -> 992
    //   1036: aload_0
    //   1037: getstatic Perryc.1 : I
    //   1040: ifeq -> 1054
    //   1043: ldc2_w -733751651
    //   1046: l2i
    //   1047: ldc_w 964019368
    //   1050: ixor
    //   1051: goto -> 1062
    //   1054: ldc2_w -1852205900
    //   1057: l2i
    //   1058: ldc_w -641481569
    //   1061: ixor
    //   1062: ldc2_w 825710473
    //   1065: l2i
    //   1066: ldc_w 1354814475
    //   1069: ixor
    //   1070: ixor
    //   1071: lookupswitch default -> 2032, -1933471305 -> 1054, 699257769 -> 1096
    //   1096: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1099: getstatic Perryc.1 : I
    //   1102: ifeq -> 1116
    //   1105: ldc2_w 1709728639
    //   1108: l2i
    //   1109: ldc_w 2045208774
    //   1112: ixor
    //   1113: goto -> 1124
    //   1116: ldc2_w 1306797209
    //   1119: l2i
    //   1120: ldc_w -594689455
    //   1123: ixor
    //   1124: ldc2_w -190972866
    //   1127: l2i
    //   1128: ldc_w 573221436
    //   1131: ixor
    //   1132: ixor
    //   1133: lookupswitch default -> 2074, -893887045 -> 1116, 1205776586 -> 1160
    //   1160: aload_0
    //   1161: getstatic Perryc.0 : I
    //   1164: ifle -> 1178
    //   1167: ldc2_w 621633297
    //   1170: l2i
    //   1171: ldc_w 1549836487
    //   1174: ixor
    //   1175: goto -> 1186
    //   1178: ldc2_w 2135143948
    //   1181: l2i
    //   1182: ldc_w 2034483055
    //   1185: ixor
    //   1186: ldc2_w 942384267
    //   1189: l2i
    //   1190: ldc_w 2060559355
    //   1193: ixor
    //   1194: ixor
    //   1195: lookupswitch default -> 1220, -1413075242 -> 1178, 999815334 -> 2082
    //   1220: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1223: getstatic Perryc.c : I
    //   1226: iflt -> 1240
    //   1229: ldc2_w -1542508432
    //   1232: l2i
    //   1233: ldc_w 815530687
    //   1236: ixor
    //   1237: goto -> 1248
    //   1240: ldc2_w -1805066407
    //   1243: l2i
    //   1244: ldc_w -1673127758
    //   1247: ixor
    //   1248: ldc2_w -1781117069
    //   1251: l2i
    //   1252: ldc_w -346536160
    //   1255: ixor
    //   1256: ixor
    //   1257: lookupswitch default -> 2038, -367183204 -> 1240, 1990250424 -> 1284
    //   1284: goto -> 1288
    //   1287: athrow
    //   1288: invokestatic access$200 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;)J
    //   1291: goto -> 1295
    //   1294: athrow
    //   1295: getstatic Perryc.c : I
    //   1298: iflt -> 1312
    //   1301: ldc2_w -1020267298
    //   1304: l2i
    //   1305: ldc_w 343807936
    //   1308: ixor
    //   1309: goto -> 1320
    //   1312: ldc2_w -1528688597
    //   1315: l2i
    //   1316: ldc_w 1119519497
    //   1319: ixor
    //   1320: ldc2_w -168292158
    //   1323: l2i
    //   1324: ldc_w 603844683
    //   1327: ixor
    //   1328: ixor
    //   1329: lookupswitch default -> 2078, 22283159 -> 1312, 811430827 -> 1356
    //   1356: iload_2
    //   1357: i2l
    //   1358: ladd
    //   1359: getstatic Perryc.0 : I
    //   1362: ifle -> 1376
    //   1365: ldc2_w 1719929709
    //   1368: l2i
    //   1369: ldc_w -491297267
    //   1372: ixor
    //   1373: goto -> 1384
    //   1376: ldc2_w 1264224222
    //   1379: l2i
    //   1380: ldc_w 216701835
    //   1383: ixor
    //   1384: ldc2_w -1139646953
    //   1387: l2i
    //   1388: ldc_w 1421494856
    //   1391: ixor
    //   1392: ixor
    //   1393: lookupswitch default -> 1420, 1725318258 -> 1376, 1822128447 -> 2040
    //   1420: goto -> 1424
    //   1423: athrow
    //   1424: invokestatic access$202 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;J)J
    //   1427: goto -> 1431
    //   1430: athrow
    //   1431: pop2
    //   1432: getstatic Perryc.1 : I
    //   1435: ifeq -> 1449
    //   1438: ldc2_w -1917780674
    //   1441: l2i
    //   1442: ldc_w -647775492
    //   1445: ixor
    //   1446: goto -> 1457
    //   1449: ldc2_w -358509698
    //   1452: l2i
    //   1453: ldc_w -299244382
    //   1456: ixor
    //   1457: ldc2_w 1900637112
    //   1460: l2i
    //   1461: ldc_w 562727249
    //   1464: ixor
    //   1465: ixor
    //   1466: lookupswitch default -> 2054, 68199723 -> 1449, 1414239541 -> 1492
    //   1492: aload_0
    //   1493: getstatic Perryc.1 : I
    //   1496: ifeq -> 1510
    //   1499: ldc2_w -158118291
    //   1502: l2i
    //   1503: ldc_w -82916805
    //   1506: ixor
    //   1507: goto -> 1518
    //   1510: ldc2_w -1203746837
    //   1513: l2i
    //   1514: ldc_w -953695624
    //   1517: ixor
    //   1518: ldc2_w -451518351
    //   1521: l2i
    //   1522: ldc_w -983349471
    //   1525: ixor
    //   1526: ixor
    //   1527: lookupswitch default -> 2046, 770220806 -> 1510, 1595056835 -> 1552
    //   1552: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1555: getstatic Perryc.c : I
    //   1558: iflt -> 1572
    //   1561: ldc2_w 847798275
    //   1564: l2i
    //   1565: ldc_w 1262710785
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w -1722392913
    //   1575: l2i
    //   1576: ldc_w -193256616
    //   1579: ixor
    //   1580: ldc2_w 759570353
    //   1583: l2i
    //   1584: ldc_w -1873643416
    //   1587: ixor
    //   1588: ixor
    //   1589: lookupswitch default -> 1616, -991987749 -> 2080, 580090524 -> 1572
    //   1616: goto -> 1620
    //   1619: athrow
    //   1620: invokestatic access$400 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress;
    //   1623: goto -> 1627
    //   1626: athrow
    //   1627: getstatic Perryc.c : I
    //   1630: iflt -> 1644
    //   1633: ldc2_w -1726661365
    //   1636: l2i
    //   1637: ldc_w -88517125
    //   1640: ixor
    //   1641: goto -> 1652
    //   1644: ldc2_w 819116743
    //   1647: l2i
    //   1648: ldc_w 1949820158
    //   1651: ixor
    //   1652: ldc2_w -1228197474
    //   1655: l2i
    //   1656: ldc_w -1045529174
    //   1659: ixor
    //   1660: ixor
    //   1661: lookupswitch default -> 1688, -612251235 -> 1644, 348726468 -> 2068
    //   1688: aload_0
    //   1689: getstatic Perryc.c : I
    //   1692: iflt -> 1706
    //   1695: ldc2_w 1496730505
    //   1698: l2i
    //   1699: ldc_w -42378192
    //   1702: ixor
    //   1703: goto -> 1714
    //   1706: ldc2_w -1909389366
    //   1709: l2i
    //   1710: ldc_w -1944415201
    //   1713: ixor
    //   1714: ldc2_w 759490239
    //   1717: l2i
    //   1718: ldc_w -1329720780
    //   1721: ixor
    //   1722: ixor
    //   1723: lookupswitch default -> 2088, -1613666466 -> 1748, 968221490 -> 1706
    //   1748: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1751: getstatic Perryc.c : I
    //   1754: iflt -> 1768
    //   1757: ldc2_w 1532692848
    //   1760: l2i
    //   1761: ldc_w -291777603
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w 382884551
    //   1771: l2i
    //   1772: ldc_w -1962797618
    //   1775: ixor
    //   1776: ldc2_w -519804623
    //   1779: l2i
    //   1780: ldc_w 1097344216
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 2042, 363632420 -> 1768, 1035731680 -> 1812
    //   1812: goto -> 1816
    //   1815: athrow
    //   1816: invokestatic access$200 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;)J
    //   1819: goto -> 1823
    //   1822: athrow
    //   1823: ldc_w 19553602
    //   1826: i2l
    //   1827: ldc2_w -19553603
    //   1830: lxor
    //   1831: getstatic Perryc.0 : I
    //   1834: ifle -> 1848
    //   1837: ldc2_w 2083010147
    //   1840: l2i
    //   1841: ldc_w 22958703
    //   1844: ixor
    //   1845: goto -> 1856
    //   1848: ldc2_w -1673193652
    //   1851: l2i
    //   1852: ldc_w 1771158349
    //   1855: ixor
    //   1856: ldc2_w 1062438927
    //   1859: l2i
    //   1860: ldc_w -2125966534
    //   1863: ixor
    //   1864: ixor
    //   1865: lookupswitch default -> 2060, -1016217799 -> 1848, 1271887668 -> 1892
    //   1892: goto -> 1896
    //   1895: athrow
    //   1896: invokeinterface onUpload : (JJ)V
    //   1901: goto -> 1905
    //   1904: athrow
    //   1905: goto -> 273
    //   1908: getstatic Perryc.c : I
    //   1911: iflt -> 1925
    //   1914: ldc2_w 877536156
    //   1917: l2i
    //   1918: ldc_w -1119425490
    //   1921: ixor
    //   1922: goto -> 1933
    //   1925: ldc2_w 294229435
    //   1928: l2i
    //   1929: ldc_w 1326734837
    //   1932: ixor
    //   1933: ldc2_w 1955514804
    //   1936: l2i
    //   1937: ldc_w 548616676
    //   1940: ixor
    //   1941: ixor
    //   1942: lookupswitch default -> 2064, -583712798 -> 1925, 178272286 -> 1968
    //   1968: aload_0
    //   1969: getstatic Perryc.c : I
    //   1972: iflt -> 1986
    //   1975: ldc2_w 315888931
    //   1978: l2i
    //   1979: ldc_w 698208166
    //   1982: ixor
    //   1983: goto -> 1994
    //   1986: ldc2_w -922411609
    //   1989: l2i
    //   1990: ldc_w 1570609122
    //   1993: ixor
    //   1994: ldc2_w 1862599338
    //   1997: l2i
    //   1998: ldc_w -1750200347
    //   2001: ixor
    //   2002: ixor
    //   2003: lookupswitch default -> 2028, -1119528240 -> 1986, -1008543798 -> 2066
    //   2028: getfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   2031: areturn
    //   2032: aconst_null
    //   2033: athrow
    //   2034: aconst_null
    //   2035: athrow
    //   2036: aconst_null
    //   2037: athrow
    //   2038: aconst_null
    //   2039: athrow
    //   2040: aconst_null
    //   2041: athrow
    //   2042: aconst_null
    //   2043: athrow
    //   2044: aconst_null
    //   2045: athrow
    //   2046: aconst_null
    //   2047: athrow
    //   2048: aconst_null
    //   2049: athrow
    //   2050: aconst_null
    //   2051: athrow
    //   2052: aconst_null
    //   2053: athrow
    //   2054: aconst_null
    //   2055: athrow
    //   2056: aconst_null
    //   2057: athrow
    //   2058: aconst_null
    //   2059: athrow
    //   2060: aconst_null
    //   2061: athrow
    //   2062: aconst_null
    //   2063: athrow
    //   2064: aconst_null
    //   2065: athrow
    //   2066: aconst_null
    //   2067: athrow
    //   2068: aconst_null
    //   2069: athrow
    //   2070: aconst_null
    //   2071: athrow
    //   2072: aconst_null
    //   2073: athrow
    //   2074: aconst_null
    //   2075: athrow
    //   2076: aconst_null
    //   2077: athrow
    //   2078: aconst_null
    //   2079: athrow
    //   2080: aconst_null
    //   2081: athrow
    //   2082: aconst_null
    //   2083: athrow
    //   2084: aconst_null
    //   2085: athrow
    //   2086: aconst_null
    //   2087: athrow
    //   2088: aconst_null
    //   2089: athrow
    //   2090: aconst_null
    //   2091: athrow
    //   2092: pop
    //   2093: goto -> 24
    //   2096: pop
    //   2097: aconst_null
    //   2098: goto -> 2092
    //   2101: dup
    //   2102: ifnull -> 2092
    //   2105: checkcast java/lang/Throwable
    //   2108: athrow
    //   2109: dup
    //   2110: ifnull -> 2096
    //   2113: checkcast java/lang/Throwable
    //   2116: athrow
    //   2117: aconst_null
    //   2118: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2008	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$9;
    //   273	1759	1	buffer	[C
    //   589	1443	2	read	I
    // Exception table:
    //   from	to	target	type
    //   8	20	2101	finally
    //   203	210	210	finally
    //   203	210	3	finally
    //   204	210	210	java/lang/UnsupportedOperationException
    //   204	210	203	java/lang/EnumConstantNotPresentException
    //   204	210	3	java/util/NoSuchElementException
    //   519	526	526	finally
    //   519	526	3	java/util/NoSuchElementException
    //   519	526	526	java/lang/EnumConstantNotPresentException
    //   520	526	3	finally
    //   520	526	519	finally
    //   967	974	974	finally
    //   967	974	967	finally
    //   967	974	967	finally
    //   968	974	3	java/lang/NegativeArraySizeException
    //   968	974	967	java/lang/ClassCastException
    //   1287	1294	1294	finally
    //   1287	1294	1287	finally
    //   1287	1294	1294	java/lang/NegativeArraySizeException
    //   1287	1294	1294	finally
    //   1288	1294	3	java/lang/ArrayIndexOutOfBoundsException
    //   1424	1430	1430	finally
    //   1424	1430	3	finally
    //   1424	1430	1430	finally
    //   1424	1430	1430	java/lang/UnsupportedOperationException
    //   1424	1430	1430	finally
    //   1619	1626	1626	finally
    //   1619	1626	1619	finally
    //   1619	1626	1626	finally
    //   1619	1626	1619	java/util/ConcurrentModificationException
    //   1620	1626	1619	java/util/ConcurrentModificationException
    //   1815	1822	1822	finally
    //   1815	1822	1822	java/lang/NumberFormatException
    //   1815	1822	1822	finally
    //   1815	1822	1815	java/util/NoSuchElementException
    //   1816	1822	3	java/lang/RuntimeException
    //   1895	1904	1904	finally
    //   1895	1904	1904	finally
    //   1895	1904	1895	finally
    //   1895	1904	1904	finally
    //   1895	1904	1895	java/util/ConcurrentModificationException
    //   2101	2109	2101	finally
    //   2117	2119	3	java/lang/IndexOutOfBoundsException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */