package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileManager extends Feature {
  public Path base;
  
  public Path config;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public String[] expandPath(String paramString) {
    return Perry1.12(this, (int)2051121845L ^ 0x3E0120AC, paramString);
  }
  
  public Path getBasePath() {
    return Perry1.4O(this, (int)-54113652L ^ 0xC455A183);
  }
  
  public Path getCache() {
    return Perry1.4O(this, (int)-850823171L ^ 0xF5DA9CF3);
  }
  
  public Path getRoot() {
    return Perry1.4P(this, (int)1385014654L ^ 0x137809A3);
  }
  
  public Path getMkDirectory(Path parent, String... paths) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 801
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 793
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 785
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w 1806435883
    //   33: l2i
    //   34: ldc 1246282025
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1137238716
    //   43: l2i
    //   44: ldc -719773662
    //   46: ixor
    //   47: ldc2_w -1007970887
    //   50: l2i
    //   51: ldc 300911748
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -356362163 -> 40, -203366849 -> 764
    //   80: aload_2
    //   81: arraylength
    //   82: ldc2_w 1850155987
    //   85: l2i
    //   86: ldc 1850155986
    //   88: ixor
    //   89: if_icmpge -> 102
    //   92: ldc2_w -1569521227
    //   95: l2i
    //   96: ldc -1409351232
    //   98: ixor
    //   99: goto -> 109
    //   102: ldc2_w 56721656
    //   105: l2i
    //   106: ldc 183337100
    //   108: ixor
    //   109: ldc2_w 2140796895
    //   112: l2i
    //   113: ldc -984468424
    //   115: ixor
    //   116: ixor
    //   117: tableswitch default -> 92, -1287142510 -> 140, -1287142509 -> 198
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 156
    //   146: ldc2_w 1209139462
    //   149: l2i
    //   150: ldc -690520920
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w 1161967965
    //   159: l2i
    //   160: ldc 845332985
    //   162: ixor
    //   163: ldc2_w -1532919094
    //   166: l2i
    //   167: ldc -1000916759
    //   169: ixor
    //   170: ixor
    //   171: lookupswitch default -> 196, -426214859 -> 156, -30161011 -> 758
    //   196: aload_1
    //   197: areturn
    //   198: getstatic Perryc.0 : I
    //   201: ifle -> 214
    //   204: ldc2_w 716747201
    //   207: l2i
    //   208: ldc 476800844
    //   210: ixor
    //   211: goto -> 221
    //   214: ldc2_w 1846766909
    //   217: l2i
    //   218: ldc -568094360
    //   220: ixor
    //   221: ldc2_w 1537869133
    //   224: l2i
    //   225: ldc 205128444
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -1742564002 -> 214, 1631834428 -> 754
    //   256: aload_0
    //   257: getstatic Perryc.c : I
    //   260: iflt -> 273
    //   263: ldc2_w 345620343
    //   266: l2i
    //   267: ldc 869334388
    //   269: ixor
    //   270: goto -> 280
    //   273: ldc2_w 153119541
    //   276: l2i
    //   277: ldc 1767786969
    //   279: ixor
    //   280: ldc2_w 1450272004
    //   283: l2i
    //   284: ldc 1042850328
    //   286: ixor
    //   287: ixor
    //   288: lookupswitch default -> 756, 136832496 -> 316, 1326482719 -> 273
    //   316: aload_1
    //   317: getstatic Perryc.0 : I
    //   320: ifle -> 333
    //   323: ldc2_w -1821497250
    //   326: l2i
    //   327: ldc -152425805
    //   329: ixor
    //   330: goto -> 340
    //   333: ldc2_w 665689664
    //   336: l2i
    //   337: ldc 846468068
    //   339: ixor
    //   340: ldc2_w 667635922
    //   343: l2i
    //   344: ldc -834339428
    //   346: ixor
    //   347: ixor
    //   348: lookupswitch default -> 770, -1945391197 -> 333, -61464342 -> 376
    //   376: aload_2
    //   377: getstatic Perryc.1 : I
    //   380: ifeq -> 393
    //   383: ldc2_w 1477779838
    //   386: l2i
    //   387: ldc -33067670
    //   389: ixor
    //   390: goto -> 400
    //   393: ldc2_w 1682456468
    //   396: l2i
    //   397: ldc 773906263
    //   399: ixor
    //   400: ldc2_w 41460783
    //   403: l2i
    //   404: ldc -124315060
    //   406: ixor
    //   407: ixor
    //   408: lookupswitch default -> 436, 574733007 -> 393, 1560146551 -> 772
    //   436: goto -> 440
    //   439: athrow
    //   440: invokespecial lookupPath : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   443: goto -> 447
    //   446: athrow
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w -41940728
    //   456: l2i
    //   457: ldc 1094701522
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 1437228796
    //   466: l2i
    //   467: ldc 1092666418
    //   469: ixor
    //   470: ldc2_w -297789027
    //   473: l2i
    //   474: ldc 555800295
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 768, -605399628 -> 504, 1944000416 -> 463
    //   504: astore_3
    //   505: getstatic Perryc.1 : I
    //   508: ifeq -> 521
    //   511: ldc2_w -195177270
    //   514: l2i
    //   515: ldc -1752807966
    //   517: ixor
    //   518: goto -> 528
    //   521: ldc2_w -1466357947
    //   524: l2i
    //   525: ldc 2006955951
    //   527: ixor
    //   528: ldc2_w -1690629363
    //   531: l2i
    //   532: ldc -1014651983
    //   534: ixor
    //   535: ixor
    //   536: lookupswitch default -> 564, -1937922005 -> 521, 996489620 -> 774
    //   564: aload_0
    //   565: getstatic Perryc.0 : I
    //   568: ifle -> 581
    //   571: ldc2_w -1132606235
    //   574: l2i
    //   575: ldc 826778870
    //   577: ixor
    //   578: goto -> 588
    //   581: ldc2_w 1707734388
    //   584: l2i
    //   585: ldc 1033020773
    //   587: ixor
    //   588: ldc2_w -709947168
    //   591: l2i
    //   592: ldc 539819895
    //   594: ixor
    //   595: ixor
    //   596: lookupswitch default -> 760, -1378304122 -> 624, 2025424772 -> 581
    //   624: aload_3
    //   625: getstatic Perryc.1 : I
    //   628: ifeq -> 641
    //   631: ldc2_w -1543780437
    //   634: l2i
    //   635: ldc -914272633
    //   637: ixor
    //   638: goto -> 648
    //   641: ldc2_w -1649977159
    //   644: l2i
    //   645: ldc -636037414
    //   647: ixor
    //   648: ldc2_w 1355608033
    //   651: l2i
    //   652: ldc 826364708
    //   654: ixor
    //   655: ixor
    //   656: lookupswitch default -> 684, -602580763 -> 641, 200750569 -> 766
    //   684: goto -> 688
    //   687: athrow
    //   688: invokespecial createDirectory : (Ljava/nio/file/Path;)V
    //   691: goto -> 695
    //   694: athrow
    //   695: getstatic Perryc.c : I
    //   698: iflt -> 711
    //   701: ldc2_w -1099006635
    //   704: l2i
    //   705: ldc 95824394
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -1201544940
    //   714: l2i
    //   715: ldc 531679661
    //   717: ixor
    //   718: ldc2_w -247447982
    //   721: l2i
    //   722: ldc 316451376
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 752, -609521671 -> 711, 1481950013 -> 762
    //   752: aload_3
    //   753: areturn
    //   754: aconst_null
    //   755: athrow
    //   756: aconst_null
    //   757: athrow
    //   758: aconst_null
    //   759: athrow
    //   760: aconst_null
    //   761: athrow
    //   762: aconst_null
    //   763: athrow
    //   764: aconst_null
    //   765: athrow
    //   766: aconst_null
    //   767: athrow
    //   768: aconst_null
    //   769: athrow
    //   770: aconst_null
    //   771: athrow
    //   772: aconst_null
    //   773: athrow
    //   774: aconst_null
    //   775: athrow
    //   776: pop
    //   777: goto -> 24
    //   780: pop
    //   781: aconst_null
    //   782: goto -> 776
    //   785: dup
    //   786: ifnull -> 776
    //   789: checkcast java/lang/Throwable
    //   792: athrow
    //   793: dup
    //   794: ifnull -> 780
    //   797: checkcast java/lang/Throwable
    //   800: athrow
    //   801: aconst_null
    //   802: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	730	0	this	Lbigname/zprestige/webhack/manager/FileManager;
    //   24	730	1	parent	Ljava/nio/file/Path;
    //   24	730	2	paths	[Ljava/lang/String;
    //   505	249	3	dir	Ljava/nio/file/Path;
    // Exception table:
    //   from	to	target	type
    //   8	20	785	finally
    //   439	446	446	finally
    //   439	446	3	finally
    //   439	446	3	java/lang/IllegalArgumentException
    //   440	446	439	finally
    //   440	446	446	java/lang/NumberFormatException
    //   687	694	694	finally
    //   687	694	694	finally
    //   688	694	687	java/lang/IllegalArgumentException
    //   688	694	694	finally
    //   688	694	694	java/lang/NegativeArraySizeException
    //   785	793	785	java/lang/IllegalStateException
    //   801	803	3	finally
  }
  
  public static String[] lambda$getBaseResolve$0(int x$0) {
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
  
  public Path getMkConfigDirectory(String... names) {
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
  
  public static boolean appendTextFile(String data, String file) {
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
  
  public Path getMkBaseResolve(String... paths) {
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
  
  public Path lookupPath(Path root, String... paths) {
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
  
  public Path getMkBaseDirectory(String... names) {
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
  
  public Path getConfig() {
    return Perry1.4P(this, (int)1448404909L ^ 0x17A14B71);
  }
  
  public void createDirectory(Path dir) {
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
  
  public Path getBaseResolve(String... paths) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1007
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 999
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 991
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1326123167
    //   33: l2i
    //   34: ldc_w -1065424407
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -567270575
    //   44: l2i
    //   45: ldc_w 1592082583
    //   48: ixor
    //   49: ldc2_w 1173818052
    //   52: l2i
    //   53: ldc_w -155846402
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 970, -1010242382 -> 41, 865571324 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -2073714843
    //   94: l2i
    //   95: ldc_w -1885205079
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1808148096
    //   105: l2i
    //   106: ldc_w -1109347800
    //   109: ixor
    //   110: ldc2_w -1685338958
    //   113: l2i
    //   114: ldc_w 1205828345
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 974, -678220665 -> 102, -175254045 -> 144
    //   144: aload_1
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w -2041213858
    //   154: l2i
    //   155: ldc_w 1856968026
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 1291193769
    //   165: l2i
    //   166: ldc_w 345788511
    //   169: ixor
    //   170: ldc2_w 1262180651
    //   173: l2i
    //   174: ldc_w -987715947
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, 656319867 -> 162, 1726047930 -> 976
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial expandPaths : ([Ljava/lang/String;)Ljava/util/stream/Stream;
    //   211: goto -> 215
    //   214: athrow
    //   215: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   220: getstatic Perryc.1 : I
    //   223: ifeq -> 237
    //   226: ldc2_w -1647779495
    //   229: l2i
    //   230: ldc_w -900268590
    //   233: ixor
    //   234: goto -> 245
    //   237: ldc2_w 1620228959
    //   240: l2i
    //   241: ldc_w -1063779539
    //   244: ixor
    //   245: ldc2_w 1021521849
    //   248: l2i
    //   249: ldc_w 1375528939
    //   252: ixor
    //   253: ixor
    //   254: lookupswitch default -> 280, 981587161 -> 972, 1147040784 -> 237
    //   280: goto -> 284
    //   283: athrow
    //   284: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   289: goto -> 293
    //   292: athrow
    //   293: checkcast [Ljava/lang/String;
    //   296: getstatic Perryc.1 : I
    //   299: ifeq -> 313
    //   302: ldc2_w -1811943482
    //   305: l2i
    //   306: ldc_w 1625563003
    //   309: ixor
    //   310: goto -> 321
    //   313: ldc2_w -510460173
    //   316: l2i
    //   317: ldc_w 852590993
    //   320: ixor
    //   321: ldc2_w -131806398
    //   324: l2i
    //   325: ldc_w -1773833987
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 956, -1652929790 -> 313, -1121794851 -> 356
    //   356: astore_2
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 374
    //   363: ldc2_w 995508344
    //   366: l2i
    //   367: ldc_w 205893457
    //   370: ixor
    //   371: goto -> 382
    //   374: ldc2_w 986681806
    //   377: l2i
    //   378: ldc_w -259713846
    //   381: ixor
    //   382: ldc2_w -568298266
    //   385: l2i
    //   386: ldc_w -752269313
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 964, -951863779 -> 416, 974838832 -> 374
    //   416: aload_2
    //   417: arraylength
    //   418: ldc2_w 397645633
    //   421: l2i
    //   422: ldc_w 397645632
    //   425: ixor
    //   426: if_icmpge -> 440
    //   429: ldc2_w -904802949
    //   432: l2i
    //   433: ldc_w 1450296518
    //   436: ixor
    //   437: goto -> 448
    //   440: ldc2_w -447085946
    //   443: l2i
    //   444: ldc_w 2033847098
    //   447: ixor
    //   448: ldc2_w -234449246
    //   451: l2i
    //   452: ldc_w 225958081
    //   455: ixor
    //   456: ixor
    //   457: tableswitch default -> 429, 1662076894 -> 480, 1662076895 -> 632
    //   480: new java/lang/IllegalArgumentException
    //   483: dup
    //   484: ldc_w '僨㌚傜ͳ⒖빗๾ⴈ낤硠ਯ'
    //   487: getstatic Perryc.1 : I
    //   490: ifeq -> 504
    //   493: ldc2_w -689475961
    //   496: l2i
    //   497: ldc_w -145200365
    //   500: ixor
    //   501: goto -> 512
    //   504: ldc2_w -385749240
    //   507: l2i
    //   508: ldc_w -1854726002
    //   511: ixor
    //   512: ldc2_w -892466687
    //   515: l2i
    //   516: ldc_w 2106430231
    //   519: ixor
    //   520: ixor
    //   521: lookupswitch default -> 548, -1761829758 -> 968, 289966642 -> 504
    //   548: goto -> 552
    //   551: athrow
    //   552: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   555: goto -> 559
    //   558: athrow
    //   559: getstatic Perryc.1 : I
    //   562: ifeq -> 576
    //   565: ldc2_w -2046797802
    //   568: l2i
    //   569: ldc_w -452559979
    //   572: ixor
    //   573: goto -> 584
    //   576: ldc2_w -1632630561
    //   579: l2i
    //   580: ldc_w 229693632
    //   583: ixor
    //   584: ldc2_w 2059087339
    //   587: l2i
    //   588: ldc_w 408540110
    //   591: ixor
    //   592: ixor
    //   593: lookupswitch default -> 962, -236835270 -> 620, 31776166 -> 576
    //   620: goto -> 624
    //   623: athrow
    //   624: invokespecial <init> : (Ljava/lang/String;)V
    //   627: goto -> 631
    //   630: athrow
    //   631: athrow
    //   632: getstatic Perryc.0 : I
    //   635: ifle -> 649
    //   638: ldc2_w -2103530588
    //   641: l2i
    //   642: ldc_w -178067165
    //   645: ixor
    //   646: goto -> 657
    //   649: ldc2_w 1901086395
    //   652: l2i
    //   653: ldc_w 903310667
    //   656: ixor
    //   657: ldc2_w -232754527
    //   660: l2i
    //   661: ldc_w 1777010013
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 692, -331926149 -> 958, 598430059 -> 649
    //   692: aload_0
    //   693: getstatic Perryc.0 : I
    //   696: ifle -> 710
    //   699: ldc2_w 34639120
    //   702: l2i
    //   703: ldc_w 305447569
    //   706: ixor
    //   707: goto -> 718
    //   710: ldc2_w -2109485116
    //   713: l2i
    //   714: ldc_w -799903266
    //   717: ixor
    //   718: ldc2_w 962081157
    //   721: l2i
    //   722: ldc_w -770575890
    //   725: ixor
    //   726: ixor
    //   727: lookupswitch default -> 752, -931423010 -> 710, -76705814 -> 980
    //   752: aload_0
    //   753: getstatic Perryc.c : I
    //   756: iflt -> 770
    //   759: ldc2_w -2060138120
    //   762: l2i
    //   763: ldc_w 1200868621
    //   766: ixor
    //   767: goto -> 778
    //   770: ldc2_w 911972238
    //   773: l2i
    //   774: ldc_w 1639742683
    //   777: ixor
    //   778: ldc2_w 1676557664
    //   781: l2i
    //   782: ldc_w 1326506327
    //   785: ixor
    //   786: ixor
    //   787: lookupswitch default -> 966, -296101822 -> 770, 2065250146 -> 812
    //   812: goto -> 816
    //   815: athrow
    //   816: invokevirtual getBasePath : ()Ljava/nio/file/Path;
    //   819: goto -> 823
    //   822: athrow
    //   823: getstatic Perryc.1 : I
    //   826: ifeq -> 840
    //   829: ldc2_w -1361149397
    //   832: l2i
    //   833: ldc_w 867360929
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 1962117427
    //   843: l2i
    //   844: ldc_w 1454955897
    //   847: ixor
    //   848: ldc2_w -1314128338
    //   851: l2i
    //   852: ldc_w -1741131028
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 978, -1258295736 -> 840, 198760584 -> 884
    //   884: aload_2
    //   885: getstatic Perryc.0 : I
    //   888: ifle -> 902
    //   891: ldc2_w -2034975764
    //   894: l2i
    //   895: ldc_w 1093575748
    //   898: ixor
    //   899: goto -> 910
    //   902: ldc2_w -181401256
    //   905: l2i
    //   906: ldc_w 2089028185
    //   909: ixor
    //   910: ldc2_w -1013761204
    //   913: l2i
    //   914: ldc_w -1074702730
    //   917: ixor
    //   918: ixor
    //   919: lookupswitch default -> 960, -1141345646 -> 902, -170496453 -> 944
    //   944: goto -> 948
    //   947: athrow
    //   948: invokespecial lookupPath : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   951: goto -> 955
    //   954: athrow
    //   955: areturn
    //   956: aconst_null
    //   957: athrow
    //   958: aconst_null
    //   959: athrow
    //   960: aconst_null
    //   961: athrow
    //   962: aconst_null
    //   963: athrow
    //   964: aconst_null
    //   965: athrow
    //   966: aconst_null
    //   967: athrow
    //   968: aconst_null
    //   969: athrow
    //   970: aconst_null
    //   971: athrow
    //   972: aconst_null
    //   973: athrow
    //   974: aconst_null
    //   975: athrow
    //   976: aconst_null
    //   977: athrow
    //   978: aconst_null
    //   979: athrow
    //   980: aconst_null
    //   981: athrow
    //   982: pop
    //   983: goto -> 24
    //   986: pop
    //   987: aconst_null
    //   988: goto -> 982
    //   991: dup
    //   992: ifnull -> 982
    //   995: checkcast java/lang/Throwable
    //   998: athrow
    //   999: dup
    //   1000: ifnull -> 986
    //   1003: checkcast java/lang/Throwable
    //   1006: athrow
    //   1007: aconst_null
    //   1008: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	932	0	this	Lbigname/zprestige/webhack/manager/FileManager;
    //   24	932	1	paths	[Ljava/lang/String;
    //   357	599	2	names	[Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	991	finally
    //   208	214	214	finally
    //   208	214	214	java/lang/IndexOutOfBoundsException
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	3	java/lang/NumberFormatException
    //   284	292	292	finally
    //   284	292	292	finally
    //   284	292	292	java/lang/IllegalArgumentException
    //   284	292	3	java/util/ConcurrentModificationException
    //   284	292	292	finally
    //   551	558	558	finally
    //   551	558	558	java/lang/NumberFormatException
    //   552	558	3	finally
    //   552	558	3	finally
    //   552	558	551	finally
    //   623	630	630	finally
    //   623	630	623	finally
    //   623	630	3	finally
    //   624	630	630	java/lang/IllegalStateException
    //   624	630	623	finally
    //   815	822	822	finally
    //   815	822	3	java/lang/AssertionError
    //   815	822	815	java/lang/EnumConstantNotPresentException
    //   815	822	822	finally
    //   816	822	822	finally
    //   947	954	954	finally
    //   947	954	3	java/lang/EnumConstantNotPresentException
    //   947	954	947	java/lang/NullPointerException
    //   948	954	947	finally
    //   948	954	3	java/lang/ArrayIndexOutOfBoundsException
    //   991	999	991	finally
    //   1007	1009	3	finally
  }
  
  public static List readTextFileAllLines(String file) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1317
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1309
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1301
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1833602985
    //   33: l2i
    //   34: ldc_w 1129081150
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1685329542
    //   44: l2i
    //   45: ldc_w 2115822696
    //   48: ixor
    //   49: ldc2_w 1686011908
    //   52: l2i
    //   53: ldc_w 1561388831
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -830663342 -> 41, -392724878 -> 1256
    //   84: aload_0
    //   85: ldc2_w 1170066270
    //   88: l2i
    //   89: ldc_w 1170066270
    //   92: ixor
    //   93: anewarray java/lang/String
    //   96: getstatic Perryc.0 : I
    //   99: ifle -> 113
    //   102: ldc2_w 1083626507
    //   105: l2i
    //   106: ldc_w 1750051065
    //   109: ixor
    //   110: goto -> 121
    //   113: ldc2_w -841581022
    //   116: l2i
    //   117: ldc_w -1791850677
    //   120: ixor
    //   121: ldc2_w 1670273882
    //   124: l2i
    //   125: ldc_w -727058004
    //   128: ixor
    //   129: ixor
    //   130: lookupswitch default -> 1264, -1610686972 -> 113, -272409697 -> 156
    //   156: goto -> 160
    //   159: athrow
    //   160: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   163: goto -> 167
    //   166: athrow
    //   167: getstatic Perryc.1 : I
    //   170: ifeq -> 184
    //   173: ldc2_w 1881507900
    //   176: l2i
    //   177: ldc_w 676425597
    //   180: ixor
    //   181: goto -> 192
    //   184: ldc2_w 615070445
    //   187: l2i
    //   188: ldc_w 689632106
    //   191: ixor
    //   192: ldc2_w 1291983499
    //   195: l2i
    //   196: ldc_w -472852203
    //   199: ixor
    //   200: ixor
    //   201: lookupswitch default -> 1286, -1553921511 -> 228, -156883745 -> 184
    //   228: astore_1
    //   229: getstatic Perryc.0 : I
    //   232: ifle -> 246
    //   235: ldc2_w -964503292
    //   238: l2i
    //   239: ldc_w -1310359720
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w -546019656
    //   249: l2i
    //   250: ldc_w 1085316675
    //   253: ixor
    //   254: ldc2_w 1012125981
    //   257: l2i
    //   258: ldc_w -1683299826
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 288, -794913457 -> 1260, 2043032352 -> 246
    //   288: aload_1
    //   289: getstatic Perryc.1 : I
    //   292: ifeq -> 306
    //   295: ldc2_w 1030183911
    //   298: l2i
    //   299: ldc_w 836848147
    //   302: ixor
    //   303: goto -> 314
    //   306: ldc2_w 523198464
    //   309: l2i
    //   310: ldc_w -15866430
    //   313: ixor
    //   314: ldc2_w -1746362746
    //   317: l2i
    //   318: ldc_w -280905577
    //   321: ixor
    //   322: ixor
    //   323: lookupswitch default -> 348, 1949251557 -> 1266, 1974098112 -> 306
    //   348: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   351: getstatic Perryc.1 : I
    //   354: ifeq -> 368
    //   357: ldc2_w 2104268236
    //   360: l2i
    //   361: ldc_w -221770180
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w -857920031
    //   371: l2i
    //   372: ldc_w -1782116385
    //   375: ixor
    //   376: ldc2_w 2075796521
    //   379: l2i
    //   380: ldc_w 641975301
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 412, -765625380 -> 1290, -707437874 -> 368
    //   412: goto -> 416
    //   415: athrow
    //   416: invokestatic readAllLines : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
    //   419: goto -> 423
    //   422: athrow
    //   423: areturn
    //   424: getstatic Perryc.1 : I
    //   427: ifeq -> 441
    //   430: ldc2_w 66554614
    //   433: l2i
    //   434: ldc_w 616543450
    //   437: ixor
    //   438: goto -> 449
    //   441: ldc2_w 340376352
    //   444: l2i
    //   445: ldc_w -188641335
    //   448: ixor
    //   449: ldc2_w 302117619
    //   452: l2i
    //   453: ldc_w -1442564360
    //   456: ixor
    //   457: ixor
    //   458: lookupswitch default -> 484, -1622279641 -> 1270, 661383598 -> 441
    //   484: astore_1
    //   485: getstatic Perryc.0 : I
    //   488: ifle -> 502
    //   491: ldc2_w -1061889459
    //   494: l2i
    //   495: ldc_w 466691889
    //   498: ixor
    //   499: goto -> 510
    //   502: ldc2_w 118941826
    //   505: l2i
    //   506: ldc_w -1686831822
    //   509: ixor
    //   510: ldc2_w -373063918
    //   513: l2i
    //   514: ldc_w 1392817770
    //   517: ixor
    //   518: ixor
    //   519: lookupswitch default -> 1288, 648404168 -> 544, 1638020100 -> 502
    //   544: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   547: new java/lang/StringBuilder
    //   550: dup
    //   551: getstatic Perryc.1 : I
    //   554: ifeq -> 568
    //   557: ldc2_w -1806373278
    //   560: l2i
    //   561: ldc_w 769794483
    //   564: ixor
    //   565: goto -> 576
    //   568: ldc2_w 693996183
    //   571: l2i
    //   572: ldc_w 1942773945
    //   575: ixor
    //   576: ldc2_w 1349881311
    //   579: l2i
    //   580: ldc_w 1098391317
    //   583: ixor
    //   584: ixor
    //   585: lookupswitch default -> 612, -1464115941 -> 1258, 129579110 -> 568
    //   612: goto -> 616
    //   615: athrow
    //   616: invokespecial <init> : ()V
    //   619: goto -> 623
    //   622: athrow
    //   623: ldc_w '僒㌲傽틞빷๞ⴒ䊬踼ਦ鴿뷢ૺ췀辋裧殡쿍?侰멶話货ӑᣂŀ㖡摧㙐調㴇奮禟섅鄦鄬撳甚셭Ꮬ먉숯'
    //   626: getstatic Perryc.1 : I
    //   629: ifeq -> 643
    //   632: ldc2_w -1325381238
    //   635: l2i
    //   636: ldc_w -1774362190
    //   639: ixor
    //   640: goto -> 651
    //   643: ldc2_w 1713026634
    //   646: l2i
    //   647: ldc_w 891444775
    //   650: ixor
    //   651: ldc2_w 193425423
    //   654: l2i
    //   655: ldc_w -542118243
    //   658: ixor
    //   659: ixor
    //   660: lookupswitch default -> 1278, -2028964097 -> 688, -216680790 -> 643
    //   688: goto -> 692
    //   691: athrow
    //   692: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   695: goto -> 699
    //   698: athrow
    //   699: getstatic Perryc.1 : I
    //   702: ifeq -> 716
    //   705: ldc2_w 1909756216
    //   708: l2i
    //   709: ldc_w -981713460
    //   712: ixor
    //   713: goto -> 724
    //   716: ldc2_w -1219610355
    //   719: l2i
    //   720: ldc_w 550234387
    //   723: ixor
    //   724: ldc2_w 247038107
    //   727: l2i
    //   728: ldc_w -1405942707
    //   731: ixor
    //   732: ixor
    //   733: lookupswitch default -> 760, 371337250 -> 1280, 451799370 -> 716
    //   760: goto -> 764
    //   763: athrow
    //   764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: goto -> 771
    //   770: athrow
    //   771: getstatic Perryc.0 : I
    //   774: ifle -> 788
    //   777: ldc2_w 296380483
    //   780: l2i
    //   781: ldc_w -1426448695
    //   784: ixor
    //   785: goto -> 796
    //   788: ldc2_w 469059765
    //   791: l2i
    //   792: ldc_w -1257839337
    //   795: ixor
    //   796: ldc2_w 1994833117
    //   799: l2i
    //   800: ldc_w 148119898
    //   803: ixor
    //   804: ixor
    //   805: lookupswitch default -> 832, -1184707323 -> 788, -983373043 -> 1274
    //   832: aload_0
    //   833: getstatic Perryc.c : I
    //   836: iflt -> 850
    //   839: ldc2_w -970631096
    //   842: l2i
    //   843: ldc_w 970552101
    //   846: ixor
    //   847: goto -> 858
    //   850: ldc2_w 1570699345
    //   853: l2i
    //   854: ldc_w -53371779
    //   857: ixor
    //   858: ldc2_w 195227653
    //   861: l2i
    //   862: ldc_w 1964262931
    //   865: ixor
    //   866: ixor
    //   867: lookupswitch default -> 1276, -2125816453 -> 850, -537275846 -> 892
    //   892: goto -> 896
    //   895: athrow
    //   896: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   899: goto -> 903
    //   902: athrow
    //   903: getstatic Perryc.1 : I
    //   906: ifeq -> 920
    //   909: ldc2_w 1226988536
    //   912: l2i
    //   913: ldc_w -545403791
    //   916: ixor
    //   917: goto -> 928
    //   920: ldc2_w 1435097356
    //   923: l2i
    //   924: ldc_w -1489204797
    //   927: ixor
    //   928: ldc2_w -1359017462
    //   931: l2i
    //   932: ldc_w 1033291226
    //   935: ixor
    //   936: ixor
    //   937: lookupswitch default -> 1272, 87447641 -> 920, 1641848607 -> 964
    //   964: goto -> 968
    //   967: athrow
    //   968: invokevirtual toString : ()Ljava/lang/String;
    //   971: goto -> 975
    //   974: athrow
    //   975: getstatic Perryc.0 : I
    //   978: ifle -> 992
    //   981: ldc2_w -1821229117
    //   984: l2i
    //   985: ldc_w 1321055057
    //   988: ixor
    //   989: goto -> 1000
    //   992: ldc2_w 410829730
    //   995: l2i
    //   996: ldc_w 303897980
    //   999: ixor
    //   1000: ldc2_w -1976295738
    //   1003: l2i
    //   1004: ldc_w -727973859
    //   1007: ixor
    //   1008: ixor
    //   1009: lookupswitch default -> 1268, -2090364343 -> 992, 1422508037 -> 1036
    //   1036: goto -> 1040
    //   1039: athrow
    //   1040: invokevirtual println : (Ljava/lang/String;)V
    //   1043: goto -> 1047
    //   1046: athrow
    //   1047: ldc_w ''
    //   1050: getstatic Perryc.0 : I
    //   1053: ifle -> 1067
    //   1056: ldc2_w -953611140
    //   1059: l2i
    //   1060: ldc_w 1117047801
    //   1063: ixor
    //   1064: goto -> 1075
    //   1067: ldc2_w -1353005402
    //   1070: l2i
    //   1071: ldc_w -1527934333
    //   1074: ixor
    //   1075: ldc2_w -790587941
    //   1078: l2i
    //   1079: ldc_w -1955909965
    //   1082: ixor
    //   1083: ixor
    //   1084: lookupswitch default -> 1284, -566854419 -> 1067, 1346170701 -> 1112
    //   1112: aload_0
    //   1113: getstatic Perryc.1 : I
    //   1116: ifeq -> 1130
    //   1119: ldc2_w -408410097
    //   1122: l2i
    //   1123: ldc_w -693559757
    //   1126: ixor
    //   1127: goto -> 1138
    //   1130: ldc2_w 1987045665
    //   1133: l2i
    //   1134: ldc_w -833641976
    //   1137: ixor
    //   1138: ldc2_w 99079320
    //   1141: l2i
    //   1142: ldc_w -974140485
    //   1145: ixor
    //   1146: ixor
    //   1147: lookupswitch default -> 1172, -1016909833 -> 1130, -251057889 -> 1262
    //   1172: goto -> 1176
    //   1175: athrow
    //   1176: invokestatic appendTextFile : (Ljava/lang/String;Ljava/lang/String;)Z
    //   1179: goto -> 1183
    //   1182: athrow
    //   1183: pop
    //   1184: getstatic Perryc.1 : I
    //   1187: ifeq -> 1201
    //   1190: ldc2_w -1214927793
    //   1193: l2i
    //   1194: ldc_w -253958406
    //   1197: ixor
    //   1198: goto -> 1209
    //   1201: ldc2_w -1355764136
    //   1204: l2i
    //   1205: ldc_w -1934287115
    //   1208: ixor
    //   1209: ldc2_w -1959903100
    //   1212: l2i
    //   1213: ldc_w 1298620373
    //   1216: ixor
    //   1217: ixor
    //   1218: lookupswitch default -> 1244, -2130684444 -> 1282, -1938905168 -> 1201
    //   1244: goto -> 1248
    //   1247: athrow
    //   1248: invokestatic emptyList : ()Ljava/util/List;
    //   1251: goto -> 1255
    //   1254: athrow
    //   1255: areturn
    //   1256: aconst_null
    //   1257: athrow
    //   1258: aconst_null
    //   1259: athrow
    //   1260: aconst_null
    //   1261: athrow
    //   1262: aconst_null
    //   1263: athrow
    //   1264: aconst_null
    //   1265: athrow
    //   1266: aconst_null
    //   1267: athrow
    //   1268: aconst_null
    //   1269: athrow
    //   1270: aconst_null
    //   1271: athrow
    //   1272: aconst_null
    //   1273: athrow
    //   1274: aconst_null
    //   1275: athrow
    //   1276: aconst_null
    //   1277: athrow
    //   1278: aconst_null
    //   1279: athrow
    //   1280: aconst_null
    //   1281: athrow
    //   1282: aconst_null
    //   1283: athrow
    //   1284: aconst_null
    //   1285: athrow
    //   1286: aconst_null
    //   1287: athrow
    //   1288: aconst_null
    //   1289: athrow
    //   1290: aconst_null
    //   1291: athrow
    //   1292: pop
    //   1293: goto -> 24
    //   1296: pop
    //   1297: aconst_null
    //   1298: goto -> 1292
    //   1301: dup
    //   1302: ifnull -> 1292
    //   1305: checkcast java/lang/Throwable
    //   1308: athrow
    //   1309: dup
    //   1310: ifnull -> 1296
    //   1313: checkcast java/lang/Throwable
    //   1316: athrow
    //   1317: aconst_null
    //   1318: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   229	195	1	path	Ljava/nio/file/Path;
    //   485	771	1	e	Ljava/io/IOException;
    //   24	1232	0	file	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	1301	java/util/ConcurrentModificationException
    //   24	423	424	java/io/IOException
    //   159	166	166	finally
    //   159	166	166	finally
    //   160	166	159	finally
    //   160	166	166	finally
    //   160	166	3	finally
    //   415	422	422	finally
    //   415	422	422	java/lang/IndexOutOfBoundsException
    //   415	422	3	finally
    //   415	422	422	finally
    //   416	422	415	java/lang/NegativeArraySizeException
    //   615	622	622	finally
    //   615	622	622	java/lang/NegativeArraySizeException
    //   616	622	3	finally
    //   616	622	615	finally
    //   616	622	615	java/lang/ArrayIndexOutOfBoundsException
    //   691	698	698	finally
    //   691	698	3	finally
    //   692	698	698	finally
    //   692	698	691	finally
    //   692	698	3	java/lang/ArrayIndexOutOfBoundsException
    //   763	770	770	finally
    //   763	770	763	java/util/ConcurrentModificationException
    //   764	770	3	finally
    //   764	770	763	java/lang/IllegalArgumentException
    //   764	770	763	java/util/ConcurrentModificationException
    //   896	902	902	finally
    //   896	902	3	finally
    //   896	902	902	finally
    //   896	902	902	finally
    //   896	902	3	java/lang/RuntimeException
    //   967	974	974	finally
    //   967	974	967	finally
    //   967	974	967	java/lang/ClassCastException
    //   968	974	974	finally
    //   968	974	3	java/lang/UnsupportedOperationException
    //   1039	1046	1046	finally
    //   1039	1046	1039	finally
    //   1039	1046	1039	java/lang/IndexOutOfBoundsException
    //   1039	1046	1046	java/lang/StringIndexOutOfBoundsException
    //   1040	1046	1039	java/lang/NullPointerException
    //   1175	1182	1182	finally
    //   1176	1182	1175	java/lang/EnumConstantNotPresentException
    //   1176	1182	3	finally
    //   1176	1182	1182	java/lang/IllegalStateException
    //   1176	1182	1182	finally
    //   1247	1254	1254	finally
    //   1247	1254	1247	java/lang/IllegalStateException
    //   1248	1254	1247	finally
    //   1248	1254	1254	java/lang/NullPointerException
    //   1248	1254	3	java/lang/AssertionError
    //   1301	1309	1301	finally
    //   1317	1319	3	finally
  }
  
  public Stream expandPaths(String... paths) {
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
  
  public FileManager() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 281255648
    //   9: l2i
    //   10: ldc_w 473964924
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 919485660
    //   20: l2i
    //   21: ldc_w 1214609545
    //   24: ixor
    //   25: ldc2_w -1490230178
    //   28: l2i
    //   29: ldc_w 666729328
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1944969038 -> 2402, 1454932071 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 973633121
    //   70: l2i
    //   71: ldc_w -934344547
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -622887539
    //   81: l2i
    //   82: ldc_w 1341213685
    //   85: ixor
    //   86: ldc2_w -1166705485
    //   89: l2i
    //   90: ldc_w -93765358
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1302641827 -> 2440, 1757121343 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w -267260622
    //   132: l2i
    //   133: ldc_w 767846078
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -373675102
    //   143: l2i
    //   144: ldc_w 289810810
    //   147: ixor
    //   148: ldc2_w 1769522819
    //   151: l2i
    //   152: ldc_w -1880321345
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 2412, 510154468 -> 184, 994172848 -> 140
    //   184: aload_0
    //   185: getstatic Perryc.1 : I
    //   188: ifeq -> 202
    //   191: ldc2_w 1442330043
    //   194: l2i
    //   195: ldc_w 15118236
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1497835127
    //   205: l2i
    //   206: ldc_w 972663152
    //   209: ixor
    //   210: ldc2_w -2114406099
    //   213: l2i
    //   214: ldc_w -1478428906
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 2436, -1185333566 -> 244, 1929827356 -> 202
    //   244: aload_0
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w -310880794
    //   254: l2i
    //   255: ldc_w 1753674161
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -23881982
    //   265: l2i
    //   266: ldc_w 1188329325
    //   269: ixor
    //   270: ldc2_w -339809644
    //   273: l2i
    //   274: ldc_w 169244607
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1326514786 -> 262, 1683372412 -> 2428
    //   304: aload_0
    //   305: getstatic Perryc.0 : I
    //   308: ifle -> 322
    //   311: ldc2_w 35674730
    //   314: l2i
    //   315: ldc_w -648678481
    //   318: ixor
    //   319: goto -> 330
    //   322: ldc2_w 1420030909
    //   325: l2i
    //   326: ldc_w 578464371
    //   329: ixor
    //   330: ldc2_w -779199722
    //   333: l2i
    //   334: ldc_w -1919148557
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 2414, -2023231712 -> 322, 717954859 -> 364
    //   364: invokespecial getRoot : ()Ljava/nio/file/Path;
    //   367: ldc2_w -599149287
    //   370: l2i
    //   371: ldc_w -599149288
    //   374: ixor
    //   375: anewarray java/lang/String
    //   378: dup
    //   379: ldc2_w -355322081
    //   382: l2i
    //   383: ldc_w -355322081
    //   386: ixor
    //   387: ldc_w '僒㌖傍㶟ṃ빚๲'
    //   390: getstatic Perryc.c : I
    //   393: iflt -> 407
    //   396: ldc2_w 1577155028
    //   399: l2i
    //   400: ldc_w 845845287
    //   403: ixor
    //   404: goto -> 415
    //   407: ldc2_w -1779680071
    //   410: l2i
    //   411: ldc_w -197847706
    //   414: ixor
    //   415: ldc2_w 5724341
    //   418: l2i
    //   419: ldc_w 787289680
    //   422: ixor
    //   423: ixor
    //   424: lookupswitch default -> 452, 1121035286 -> 2416, 1649949428 -> 407
    //   452: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   455: aastore
    //   456: getstatic Perryc.c : I
    //   459: iflt -> 473
    //   462: ldc2_w 1425532891
    //   465: l2i
    //   466: ldc_w -1054187420
    //   469: ixor
    //   470: goto -> 481
    //   473: ldc2_w 558054671
    //   476: l2i
    //   477: ldc_w 482290871
    //   480: ixor
    //   481: ldc2_w 673378316
    //   484: l2i
    //   485: ldc_w 1804240983
    //   488: ixor
    //   489: ixor
    //   490: lookupswitch default -> 516, -696909852 -> 2396, 408200971 -> 473
    //   516: invokespecial getMkDirectory : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   519: getstatic Perryc.c : I
    //   522: iflt -> 536
    //   525: ldc2_w -1926407223
    //   528: l2i
    //   529: ldc_w -1296380352
    //   532: ixor
    //   533: goto -> 544
    //   536: ldc2_w -1839151769
    //   539: l2i
    //   540: ldc_w 1150356416
    //   543: ixor
    //   544: ldc2_w 2003619008
    //   547: l2i
    //   548: ldc_w 766099950
    //   551: ixor
    //   552: ixor
    //   553: lookupswitch default -> 2422, -1942699127 -> 580, 1699911847 -> 536
    //   580: putfield base : Ljava/nio/file/Path;
    //   583: getstatic Perryc.0 : I
    //   586: ifle -> 600
    //   589: ldc2_w -1303865688
    //   592: l2i
    //   593: ldc_w 1446584243
    //   596: ixor
    //   597: goto -> 608
    //   600: ldc2_w -1461007080
    //   603: l2i
    //   604: ldc_w -1866643486
    //   607: ixor
    //   608: ldc2_w 1697389441
    //   611: l2i
    //   612: ldc_w -103869108
    //   615: ixor
    //   616: ixor
    //   617: lookupswitch default -> 644, -1423221638 -> 600, 2022868950 -> 2462
    //   644: aload_0
    //   645: getstatic Perryc.c : I
    //   648: iflt -> 662
    //   651: ldc2_w 490650575
    //   654: l2i
    //   655: ldc_w -370631524
    //   658: ixor
    //   659: goto -> 670
    //   662: ldc2_w -1575380866
    //   665: l2i
    //   666: ldc_w 1356797737
    //   669: ixor
    //   670: ldc2_w -1495502418
    //   673: l2i
    //   674: ldc_w 1370827975
    //   677: ixor
    //   678: ixor
    //   679: lookupswitch default -> 704, -1570600343 -> 662, 62880314 -> 2406
    //   704: aload_0
    //   705: getstatic Perryc.c : I
    //   708: iflt -> 722
    //   711: ldc2_w 115666863
    //   714: l2i
    //   715: ldc_w 1078591602
    //   718: ixor
    //   719: goto -> 730
    //   722: ldc2_w -1589205195
    //   725: l2i
    //   726: ldc_w -1188378233
    //   729: ixor
    //   730: ldc2_w 1928870071
    //   733: l2i
    //   734: ldc_w -1512677637
    //   737: ixor
    //   738: ixor
    //   739: lookupswitch default -> 2420, -1853847151 -> 722, -817755906 -> 764
    //   764: aload_0
    //   765: getstatic Perryc.1 : I
    //   768: ifeq -> 782
    //   771: ldc2_w 336601508
    //   774: l2i
    //   775: ldc_w 1794621962
    //   778: ixor
    //   779: goto -> 790
    //   782: ldc2_w 66981620
    //   785: l2i
    //   786: ldc_w 655308827
    //   789: ixor
    //   790: ldc2_w 1139179470
    //   793: l2i
    //   794: ldc_w -1282757333
    //   797: ixor
    //   798: ixor
    //   799: lookupswitch default -> 824, -2059720614 -> 782, -1903480501 -> 2450
    //   824: getfield base : Ljava/nio/file/Path;
    //   827: ldc2_w 993025102
    //   830: l2i
    //   831: ldc_w 993025103
    //   834: ixor
    //   835: anewarray java/lang/String
    //   838: dup
    //   839: ldc2_w -224765234
    //   842: l2i
    //   843: ldc_w -224765234
    //   846: ixor
    //   847: ldc_w '僦㌜傁㶱ṋ빞'
    //   850: getstatic Perryc.c : I
    //   853: iflt -> 867
    //   856: ldc2_w 1763168965
    //   859: l2i
    //   860: ldc_w -1215742593
    //   863: ixor
    //   864: goto -> 875
    //   867: ldc2_w -1618361258
    //   870: l2i
    //   871: ldc_w 507267625
    //   874: ixor
    //   875: ldc2_w 1992877436
    //   878: l2i
    //   879: ldc_w 437569295
    //   882: ixor
    //   883: ixor
    //   884: lookupswitch default -> 912, -1633184711 -> 867, -1304244791 -> 2464
    //   912: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   915: aastore
    //   916: getstatic Perryc.1 : I
    //   919: ifeq -> 933
    //   922: ldc2_w 1617790359
    //   925: l2i
    //   926: ldc_w -87784214
    //   929: ixor
    //   930: goto -> 941
    //   933: ldc2_w 740674932
    //   936: l2i
    //   937: ldc_w -1851542845
    //   940: ixor
    //   941: ldc2_w -102693140
    //   944: l2i
    //   945: ldc_w 484462554
    //   948: ixor
    //   949: ixor
    //   950: lookupswitch default -> 976, -245263339 -> 933, 2141734987 -> 2438
    //   976: invokespecial getMkDirectory : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   979: getstatic Perryc.1 : I
    //   982: ifeq -> 996
    //   985: ldc2_w 173639943
    //   988: l2i
    //   989: ldc_w -581298625
    //   992: ixor
    //   993: goto -> 1004
    //   996: ldc2_w 1558022442
    //   999: l2i
    //   1000: ldc_w 79295393
    //   1003: ixor
    //   1004: ldc2_w 752457477
    //   1007: l2i
    //   1008: ldc_w 931782354
    //   1011: ixor
    //   1012: ixor
    //   1013: lookupswitch default -> 2454, -866920721 -> 996, 1127494492 -> 1040
    //   1040: putfield config : Ljava/nio/file/Path;
    //   1043: getstatic Perryc.c : I
    //   1046: iflt -> 1060
    //   1049: ldc2_w -672169548
    //   1052: l2i
    //   1053: ldc_w -26118298
    //   1056: ixor
    //   1057: goto -> 1068
    //   1060: ldc2_w -276867688
    //   1063: l2i
    //   1064: ldc_w -410284530
    //   1067: ixor
    //   1068: ldc2_w 667669655
    //   1071: l2i
    //   1072: ldc_w 1484728609
    //   1075: ixor
    //   1076: ixor
    //   1077: lookupswitch default -> 1104, 1445596004 -> 2430, 1866115978 -> 1060
    //   1104: aload_0
    //   1105: getstatic Perryc.0 : I
    //   1108: ifle -> 1122
    //   1111: ldc2_w 1799113286
    //   1114: l2i
    //   1115: ldc_w 103019906
    //   1118: ixor
    //   1119: goto -> 1130
    //   1122: ldc2_w 475440831
    //   1125: l2i
    //   1126: ldc_w -1579144753
    //   1129: ixor
    //   1130: ldc2_w 105786082
    //   1133: l2i
    //   1134: ldc_w -1025720158
    //   1137: ixor
    //   1138: ixor
    //   1139: lookupswitch default -> 1164, -1450355324 -> 2398, -1250787538 -> 1122
    //   1164: aload_0
    //   1165: getstatic Perryc.0 : I
    //   1168: ifle -> 1182
    //   1171: ldc2_w -1617888856
    //   1174: l2i
    //   1175: ldc_w 121566596
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w -569964154
    //   1185: l2i
    //   1186: ldc_w 186106613
    //   1189: ixor
    //   1190: ldc2_w -1701767410
    //   1193: l2i
    //   1194: ldc_w -202933610
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 2452, -1134123285 -> 1224, -237477452 -> 1182
    //   1224: getfield base : Ljava/nio/file/Path;
    //   1227: ldc2_w 1308868786
    //   1230: l2i
    //   1231: ldc_w 1308868787
    //   1234: ixor
    //   1235: anewarray java/lang/String
    //   1238: dup
    //   1239: ldc2_w -1731017217
    //   1242: l2i
    //   1243: ldc_w -1731017217
    //   1246: ixor
    //   1247: ldc_w '僵㌅傟'
    //   1250: getstatic Perryc.c : I
    //   1253: iflt -> 1267
    //   1256: ldc2_w 1658958099
    //   1259: l2i
    //   1260: ldc_w 1627023462
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w -740074989
    //   1270: l2i
    //   1271: ldc_w -1441025302
    //   1274: ixor
    //   1275: ldc2_w -1729886794
    //   1278: l2i
    //   1279: ldc_w 1597618866
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 1312, -1445754963 -> 1267, -976853391 -> 2408
    //   1312: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1315: aastore
    //   1316: getstatic Perryc.c : I
    //   1319: iflt -> 1333
    //   1322: ldc2_w -2103373246
    //   1325: l2i
    //   1326: ldc_w -807460780
    //   1329: ixor
    //   1330: goto -> 1341
    //   1333: ldc2_w -292250699
    //   1336: l2i
    //   1337: ldc_w -453874911
    //   1340: ixor
    //   1341: ldc2_w 411876645
    //   1344: l2i
    //   1345: ldc_w -111360014
    //   1348: ixor
    //   1349: ixor
    //   1350: lookupswitch default -> 2460, -1397864255 -> 1333, -340358589 -> 1376
    //   1376: invokespecial getMkDirectory : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   1379: pop
    //   1380: getstatic Perryc.c : I
    //   1383: iflt -> 1397
    //   1386: ldc2_w -1918014085
    //   1389: l2i
    //   1390: ldc_w 1771946120
    //   1393: ixor
    //   1394: goto -> 1405
    //   1397: ldc2_w 539738336
    //   1400: l2i
    //   1401: ldc_w -1898821959
    //   1404: ixor
    //   1405: ldc2_w -114634275
    //   1408: l2i
    //   1409: ldc_w 1452912576
    //   1412: ixor
    //   1413: ixor
    //   1414: lookupswitch default -> 1440, 367038531 -> 1397, 1266930670 -> 2426
    //   1440: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   1443: getstatic Perryc.c : I
    //   1446: iflt -> 1460
    //   1449: ldc2_w 1371237701
    //   1452: l2i
    //   1453: ldc_w -1433660779
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w -2001894348
    //   1463: l2i
    //   1464: ldc_w -2098240580
    //   1467: ixor
    //   1468: ldc2_w -298999741
    //   1471: l2i
    //   1472: ldc_w -2036251171
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 2404, -1816421810 -> 1460, 1657668118 -> 1504
    //   1504: invokevirtual getCategories : ()Ljava/util/List;
    //   1507: getstatic Perryc.1 : I
    //   1510: ifeq -> 1524
    //   1513: ldc2_w 1973836023
    //   1516: l2i
    //   1517: ldc_w -1565894748
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w -2104759365
    //   1527: l2i
    //   1528: ldc_w 2134812599
    //   1531: ixor
    //   1532: ldc2_w 864396946
    //   1535: l2i
    //   1536: ldc_w -125714454
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 1568, -805463620 -> 1524, 470292011 -> 2434
    //   1568: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1573: getstatic Perryc.1 : I
    //   1576: ifeq -> 1590
    //   1579: ldc2_w -729856853
    //   1582: l2i
    //   1583: ldc_w 1853892415
    //   1586: ixor
    //   1587: goto -> 1598
    //   1590: ldc2_w -2014524156
    //   1593: l2i
    //   1594: ldc_w 642474824
    //   1597: ixor
    //   1598: ldc2_w 1795721022
    //   1601: l2i
    //   1602: ldc_w 1420902943
    //   1605: ixor
    //   1606: ixor
    //   1607: lookupswitch default -> 1632, -2058967371 -> 2442, 827933309 -> 1590
    //   1632: astore_1
    //   1633: getstatic Perryc.1 : I
    //   1636: ifeq -> 1650
    //   1639: ldc2_w 1636542246
    //   1642: l2i
    //   1643: ldc_w -1966237080
    //   1646: ixor
    //   1647: goto -> 1658
    //   1650: ldc2_w -1456432410
    //   1653: l2i
    //   1654: ldc_w -31080679
    //   1657: ixor
    //   1658: ldc2_w 1044608480
    //   1661: l2i
    //   1662: ldc_w 1328367743
    //   1665: ixor
    //   1666: ixor
    //   1667: lookupswitch default -> 1692, -1708654383 -> 2446, 1808136231 -> 1650
    //   1692: aload_1
    //   1693: getstatic Perryc.1 : I
    //   1696: ifeq -> 1710
    //   1699: ldc2_w -1730908772
    //   1702: l2i
    //   1703: ldc_w 970681233
    //   1706: ixor
    //   1707: goto -> 1718
    //   1710: ldc2_w 1870338928
    //   1713: l2i
    //   1714: ldc_w -1153317114
    //   1717: ixor
    //   1718: ldc2_w 1570781108
    //   1721: l2i
    //   1722: ldc_w -848960434
    //   1725: ixor
    //   1726: ixor
    //   1727: lookupswitch default -> 1752, 835376631 -> 2444, 854419106 -> 1710
    //   1752: invokeinterface hasNext : ()Z
    //   1757: ifeq -> 1771
    //   1760: ldc2_w -1779090576
    //   1763: l2i
    //   1764: ldc_w -484271416
    //   1767: ixor
    //   1768: goto -> 1779
    //   1771: ldc2_w -1731029837
    //   1774: l2i
    //   1775: ldc_w -301648630
    //   1778: ixor
    //   1779: ldc2_w 386009862
    //   1782: l2i
    //   1783: ldc_w 206196058
    //   1786: ixor
    //   1787: ixor
    //   1788: tableswitch default -> 1760, 1839196132 -> 1812, 1839196133 -> 2395
    //   1812: getstatic Perryc.0 : I
    //   1815: ifle -> 1829
    //   1818: ldc2_w 392562076
    //   1821: l2i
    //   1822: ldc_w -1453284725
    //   1825: ixor
    //   1826: goto -> 1837
    //   1829: ldc2_w 1404119530
    //   1832: l2i
    //   1833: ldc_w 302874771
    //   1836: ixor
    //   1837: ldc2_w 867840510
    //   1840: l2i
    //   1841: ldc_w -51738412
    //   1844: ixor
    //   1845: ixor
    //   1846: lookupswitch default -> 1872, -1038620724 -> 1829, 1901469245 -> 2456
    //   1872: aload_1
    //   1873: getstatic Perryc.0 : I
    //   1876: ifle -> 1890
    //   1879: ldc2_w -928910925
    //   1882: l2i
    //   1883: ldc_w 877830283
    //   1886: ixor
    //   1887: goto -> 1898
    //   1890: ldc2_w -1448400218
    //   1893: l2i
    //   1894: ldc_w -462090979
    //   1897: ixor
    //   1898: ldc2_w -1083682664
    //   1901: l2i
    //   1902: ldc_w 1853176004
    //   1905: ixor
    //   1906: ixor
    //   1907: lookupswitch default -> 2448, -1664921625 -> 1932, 770586980 -> 1890
    //   1932: invokeinterface next : ()Ljava/lang/Object;
    //   1937: checkcast bigname/zprestige/webhack/features/modules/Module$Category
    //   1940: getstatic Perryc.1 : I
    //   1943: ifeq -> 1957
    //   1946: ldc2_w -2102641147
    //   1949: l2i
    //   1950: ldc_w 1830769659
    //   1953: ixor
    //   1954: goto -> 1965
    //   1957: ldc2_w 275512573
    //   1960: l2i
    //   1961: ldc_w -762649117
    //   1964: ixor
    //   1965: ldc2_w 1572009873
    //   1968: l2i
    //   1969: ldc_w -1161559982
    //   1972: ixor
    //   1973: ixor
    //   1974: lookupswitch default -> 2418, 147167805 -> 1957, 630714077 -> 2000
    //   2000: astore_2
    //   2001: getstatic Perryc.1 : I
    //   2004: ifeq -> 2018
    //   2007: ldc2_w -2063947513
    //   2010: l2i
    //   2011: ldc_w -1523489577
    //   2014: ixor
    //   2015: goto -> 2026
    //   2018: ldc2_w 611326512
    //   2021: l2i
    //   2022: ldc_w 1174593867
    //   2025: ixor
    //   2026: ldc2_w 1403728109
    //   2029: l2i
    //   2030: ldc_w -346601046
    //   2033: ixor
    //   2034: ixor
    //   2035: lookupswitch default -> 2060, -1924461052 -> 2018, -1724402537 -> 2432
    //   2060: aload_0
    //   2061: getstatic Perryc.c : I
    //   2064: iflt -> 2078
    //   2067: ldc2_w 1334770210
    //   2070: l2i
    //   2071: ldc_w 1158001362
    //   2074: ixor
    //   2075: goto -> 2086
    //   2078: ldc2_w -343681135
    //   2081: l2i
    //   2082: ldc_w -191289295
    //   2085: ixor
    //   2086: ldc2_w -2140026038
    //   2089: l2i
    //   2090: ldc_w 168032816
    //   2093: ixor
    //   2094: ixor
    //   2095: lookupswitch default -> 2424, -2131134070 -> 2078, -1788293414 -> 2120
    //   2120: aload_0
    //   2121: getstatic Perryc.c : I
    //   2124: iflt -> 2138
    //   2127: ldc2_w 679017070
    //   2130: l2i
    //   2131: ldc_w 1963764141
    //   2134: ixor
    //   2135: goto -> 2146
    //   2138: ldc2_w -1410334815
    //   2141: l2i
    //   2142: ldc_w 1453937508
    //   2145: ixor
    //   2146: ldc2_w -212101260
    //   2149: l2i
    //   2150: ldc_w -1056101760
    //   2153: ixor
    //   2154: ixor
    //   2155: lookupswitch default -> 2400, -821030607 -> 2180, 1864560183 -> 2138
    //   2180: getfield config : Ljava/nio/file/Path;
    //   2183: ldc2_w 1079518518
    //   2186: l2i
    //   2187: ldc_w 1079518519
    //   2190: ixor
    //   2191: anewarray java/lang/String
    //   2194: dup
    //   2195: ldc2_w -1496173811
    //   2198: l2i
    //   2199: ldc_w -1496173811
    //   2202: ixor
    //   2203: getstatic Perryc.c : I
    //   2206: iflt -> 2220
    //   2209: ldc2_w 514715033
    //   2212: l2i
    //   2213: ldc_w -795292554
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w -231572833
    //   2223: l2i
    //   2224: ldc_w 1316617657
    //   2227: ixor
    //   2228: ldc2_w -351339519
    //   2231: l2i
    //   2232: ldc_w 1177172374
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 2264, 1103999610 -> 2220, 1662116984 -> 2466
    //   2264: aload_2
    //   2265: getstatic Perryc.c : I
    //   2268: iflt -> 2282
    //   2271: ldc2_w 471299481
    //   2274: l2i
    //   2275: ldc_w 597185056
    //   2278: ixor
    //   2279: goto -> 2290
    //   2282: ldc2_w 1477277492
    //   2285: l2i
    //   2286: ldc_w -2073876873
    //   2289: ixor
    //   2290: ldc2_w 270200483
    //   2293: l2i
    //   2294: ldc_w -1257411005
    //   2297: ixor
    //   2298: ixor
    //   2299: lookupswitch default -> 2458, -1701271719 -> 2282, 2038026659 -> 2324
    //   2324: invokevirtual getName : ()Ljava/lang/String;
    //   2327: aastore
    //   2328: getstatic Perryc.1 : I
    //   2331: ifeq -> 2345
    //   2334: ldc2_w -99917942
    //   2337: l2i
    //   2338: ldc_w -2072172891
    //   2341: ixor
    //   2342: goto -> 2353
    //   2345: ldc2_w -211617042
    //   2348: l2i
    //   2349: ldc_w 1789938450
    //   2352: ixor
    //   2353: ldc2_w -335314657
    //   2356: l2i
    //   2357: ldc_w -1789392226
    //   2360: ixor
    //   2361: ixor
    //   2362: lookupswitch default -> 2410, -527877507 -> 2388, 120451758 -> 2345
    //   2388: invokespecial getMkDirectory : (Ljava/nio/file/Path;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   2391: pop
    //   2392: goto -> 1633
    //   2395: return
    //   2396: aconst_null
    //   2397: athrow
    //   2398: aconst_null
    //   2399: athrow
    //   2400: aconst_null
    //   2401: athrow
    //   2402: aconst_null
    //   2403: athrow
    //   2404: aconst_null
    //   2405: athrow
    //   2406: aconst_null
    //   2407: athrow
    //   2408: aconst_null
    //   2409: athrow
    //   2410: aconst_null
    //   2411: athrow
    //   2412: aconst_null
    //   2413: athrow
    //   2414: aconst_null
    //   2415: athrow
    //   2416: aconst_null
    //   2417: athrow
    //   2418: aconst_null
    //   2419: athrow
    //   2420: aconst_null
    //   2421: athrow
    //   2422: aconst_null
    //   2423: athrow
    //   2424: aconst_null
    //   2425: athrow
    //   2426: aconst_null
    //   2427: athrow
    //   2428: aconst_null
    //   2429: athrow
    //   2430: aconst_null
    //   2431: athrow
    //   2432: aconst_null
    //   2433: athrow
    //   2434: aconst_null
    //   2435: athrow
    //   2436: aconst_null
    //   2437: athrow
    //   2438: aconst_null
    //   2439: athrow
    //   2440: aconst_null
    //   2441: athrow
    //   2442: aconst_null
    //   2443: athrow
    //   2444: aconst_null
    //   2445: athrow
    //   2446: aconst_null
    //   2447: athrow
    //   2448: aconst_null
    //   2449: athrow
    //   2450: aconst_null
    //   2451: athrow
    //   2452: aconst_null
    //   2453: athrow
    //   2454: aconst_null
    //   2455: athrow
    //   2456: aconst_null
    //   2457: athrow
    //   2458: aconst_null
    //   2459: athrow
    //   2460: aconst_null
    //   2461: athrow
    //   2462: aconst_null
    //   2463: athrow
    //   2464: aconst_null
    //   2465: athrow
    //   2466: aconst_null
    //   2467: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2001	391	2	category	Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   0	2396	0	this	Lbigname/zprestige/webhack/manager/FileManager;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\FileManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */