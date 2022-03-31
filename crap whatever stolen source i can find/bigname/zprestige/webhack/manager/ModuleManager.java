package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.modules.Module;
import java.util.ArrayList;
import java.util.List;

public class ModuleManager extends Feature {
  public ArrayList<Module> webmods;
  
  public List<String> sortedModulesABC;
  
  public List<Module> sortedModules;
  
  public ModuleManager$Animation animationThread;
  
  public void onLoad() {
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
  
  public ArrayList getModulesByCategory(Module.Category category) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 579
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 571
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 563
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 44
    //   34: ldc2_w -2047093727
    //   37: l2i
    //   38: ldc -676768052
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w -1042894601
    //   47: l2i
    //   48: ldc -754647715
    //   50: ixor
    //   51: ldc2_w -1452092140
    //   54: l2i
    //   55: ldc -1534755946
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 544, 522576680 -> 84, 1604660335 -> 44
    //   84: goto -> 88
    //   87: athrow
    //   88: invokespecial <init> : ()V
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.c : I
    //   98: iflt -> 111
    //   101: ldc2_w -353275349
    //   104: l2i
    //   105: ldc -1681590645
    //   107: ixor
    //   108: goto -> 118
    //   111: ldc2_w -2072821612
    //   114: l2i
    //   115: ldc -75913924
    //   117: ixor
    //   118: ldc2_w 1189208394
    //   121: l2i
    //   122: ldc -323034876
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 152, -1672956121 -> 111, -613776146 -> 552
    //   152: astore_2
    //   153: getstatic Perryc.1 : I
    //   156: ifeq -> 169
    //   159: ldc2_w 977783220
    //   162: l2i
    //   163: ldc -808410955
    //   165: ixor
    //   166: goto -> 176
    //   169: ldc2_w -1245819934
    //   172: l2i
    //   173: ldc -183985450
    //   175: ixor
    //   176: ldc2_w -223161904
    //   179: l2i
    //   180: ldc -1450812137
    //   182: ixor
    //   183: ixor
    //   184: lookupswitch default -> 212, -1534567082 -> 169, -1364990522 -> 548
    //   212: aload_0
    //   213: getstatic Perryc.c : I
    //   216: iflt -> 229
    //   219: ldc2_w -1915183889
    //   222: l2i
    //   223: ldc -1574094313
    //   225: ixor
    //   226: goto -> 237
    //   229: ldc2_w 388730947
    //   232: l2i
    //   233: ldc_w 614244102
    //   236: ixor
    //   237: ldc2_w -581655307
    //   240: l2i
    //   241: ldc_w 408476994
    //   244: ixor
    //   245: ixor
    //   246: lookupswitch default -> 550, -352723121 -> 229, -155486478 -> 272
    //   272: getfield webmods : Ljava/util/ArrayList;
    //   275: getstatic Perryc.1 : I
    //   278: ifeq -> 292
    //   281: ldc2_w 92024680
    //   284: l2i
    //   285: ldc_w 1133323275
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w -709924549
    //   295: l2i
    //   296: ldc_w -1315181678
    //   299: ixor
    //   300: ldc2_w -6747250
    //   303: l2i
    //   304: ldc_w -215236975
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 336, 1146123562 -> 292, 1245953660 -> 542
    //   336: aload_1
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w -1374319561
    //   346: l2i
    //   347: ldc_w -2109769977
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -580382564
    //   357: l2i
    //   358: ldc_w 746218337
    //   361: ixor
    //   362: ldc2_w -1952507678
    //   365: l2i
    //   366: ldc_w -1481721970
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 546, -584852335 -> 396, 1791068 -> 354
    //   396: aload_2
    //   397: <illegal opcode> accept : (Lbigname/zprestige/webhack/features/modules/Module$Category;Ljava/util/ArrayList;)Ljava/util/function/Consumer;
    //   402: getstatic Perryc.1 : I
    //   405: ifeq -> 419
    //   408: ldc2_w 507983363
    //   411: l2i
    //   412: ldc_w -2084443533
    //   415: ixor
    //   416: goto -> 427
    //   419: ldc2_w 1124046588
    //   422: l2i
    //   423: ldc_w -276307097
    //   426: ixor
    //   427: ldc2_w 1436371559
    //   430: l2i
    //   431: ldc_w -975096594
    //   434: ixor
    //   435: ixor
    //   436: lookupswitch default -> 464, 234529529 -> 538, 1539830877 -> 419
    //   464: goto -> 468
    //   467: athrow
    //   468: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   471: goto -> 475
    //   474: athrow
    //   475: getstatic Perryc.0 : I
    //   478: ifle -> 492
    //   481: ldc2_w 1077916774
    //   484: l2i
    //   485: ldc_w -268429016
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 1516384470
    //   495: l2i
    //   496: ldc_w 751705197
    //   499: ixor
    //   500: ldc2_w 1283361110
    //   503: l2i
    //   504: ldc_w -1058264147
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, 1017974709 -> 540, 1323938513 -> 492
    //   536: aload_2
    //   537: areturn
    //   538: aconst_null
    //   539: athrow
    //   540: aconst_null
    //   541: athrow
    //   542: aconst_null
    //   543: athrow
    //   544: aconst_null
    //   545: athrow
    //   546: aconst_null
    //   547: athrow
    //   548: aconst_null
    //   549: athrow
    //   550: aconst_null
    //   551: athrow
    //   552: aconst_null
    //   553: athrow
    //   554: pop
    //   555: goto -> 24
    //   558: pop
    //   559: aconst_null
    //   560: goto -> 554
    //   563: dup
    //   564: ifnull -> 554
    //   567: checkcast java/lang/Throwable
    //   570: athrow
    //   571: dup
    //   572: ifnull -> 558
    //   575: checkcast java/lang/Throwable
    //   578: athrow
    //   579: aconst_null
    //   580: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	514	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    //   24	514	1	category	Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   153	385	2	modulesCategory	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   153	385	2	modulesCategory	Ljava/util/ArrayList<Lbigname/zprestige/webhack/features/modules/Module;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	563	java/lang/ArithmeticException
    //   87	94	94	finally
    //   87	94	3	finally
    //   87	94	94	java/lang/UnsupportedOperationException
    //   87	94	94	java/lang/IllegalStateException
    //   88	94	87	java/lang/UnsupportedOperationException
    //   467	474	474	finally
    //   468	474	474	java/util/NoSuchElementException
    //   468	474	474	java/lang/EnumConstantNotPresentException
    //   468	474	467	finally
    //   468	474	474	java/lang/IllegalStateException
    //   563	571	563	java/lang/NegativeArraySizeException
    //   579	581	3	finally
  }
  
  public void onRender2D(Render2DEvent event) {
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
  
  public void onLogin() {
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
  
  public void sortModules(boolean reverse) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 897
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 889
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 881
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 152663741
    //   33: l2i
    //   34: ldc_w -715754493
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1182803370
    //   44: l2i
    //   45: ldc_w -52462184
    //   48: ixor
    //   49: ldc2_w 1893817584
    //   52: l2i
    //   53: ldc_w 155489827
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1662225949 -> 41, -1511339923 -> 860
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -2131521777
    //   94: l2i
    //   95: ldc_w 255340442
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1668891024
    //   105: l2i
    //   106: ldc_w -710417580
    //   109: ixor
    //   110: ldc2_w -578057595
    //   113: l2i
    //   114: ldc_w -883593770
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 862, -1726658618 -> 102, -1610594921 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.0 : I
    //   148: ifle -> 162
    //   151: ldc2_w 213382902
    //   154: l2i
    //   155: ldc_w 1411137736
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -652588011
    //   165: l2i
    //   166: ldc_w -715614820
    //   169: ixor
    //   170: ldc2_w -580789625
    //   173: l2i
    //   174: ldc_w -602327734
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 854, 221918788 -> 204, 1507023347 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual getEnabledModules : ()Ljava/util/ArrayList;
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 232
    //   221: ldc2_w -1877603249
    //   224: l2i
    //   225: ldc_w 653036176
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 543115388
    //   235: l2i
    //   236: ldc_w -616167226
    //   239: ixor
    //   240: ldc2_w 951532799
    //   243: l2i
    //   244: ldc_w 1319390722
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -1058409438 -> 868, -491285933 -> 232
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   283: goto -> 287
    //   286: athrow
    //   287: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   292: getstatic Perryc.0 : I
    //   295: ifle -> 309
    //   298: ldc2_w 134035164
    //   301: l2i
    //   302: ldc_w 543519482
    //   305: ixor
    //   306: goto -> 317
    //   309: ldc2_w -1182880056
    //   312: l2i
    //   313: ldc_w 448150345
    //   316: ixor
    //   317: ldc2_w 1903088063
    //   320: l2i
    //   321: ldc_w 395085877
    //   324: ixor
    //   325: ixor
    //   326: lookupswitch default -> 352, 82861860 -> 309, 1098522028 -> 856
    //   352: goto -> 356
    //   355: athrow
    //   356: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   361: goto -> 365
    //   364: athrow
    //   365: getstatic Perryc.c : I
    //   368: iflt -> 382
    //   371: ldc2_w 1985342869
    //   374: l2i
    //   375: ldc_w 436301580
    //   378: ixor
    //   379: goto -> 390
    //   382: ldc2_w 506967990
    //   385: l2i
    //   386: ldc_w 59081407
    //   389: ixor
    //   390: ldc2_w -387421055
    //   393: l2i
    //   394: ldc_w 1874812628
    //   397: ixor
    //   398: ixor
    //   399: lookupswitch default -> 852, -1696266404 -> 424, -352079668 -> 382
    //   424: aload_0
    //   425: getstatic Perryc.1 : I
    //   428: ifeq -> 442
    //   431: ldc2_w -479095724
    //   434: l2i
    //   435: ldc_w -1684992014
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w 1283605425
    //   445: l2i
    //   446: ldc_w -99769771
    //   449: ixor
    //   450: ldc2_w 1446247709
    //   453: l2i
    //   454: ldc_w -1320979805
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 484, -1617947624 -> 870, -759476671 -> 442
    //   484: iload_1
    //   485: <illegal opcode> apply : (Lbigname/zprestige/webhack/manager/ModuleManager;Z)Ljava/util/function/Function;
    //   490: getstatic Perryc.0 : I
    //   493: ifle -> 507
    //   496: ldc2_w -602755668
    //   499: l2i
    //   500: ldc_w -121628185
    //   503: ixor
    //   504: goto -> 515
    //   507: ldc2_w -709542143
    //   510: l2i
    //   511: ldc_w 215100451
    //   514: ixor
    //   515: ldc2_w -1529837270
    //   518: l2i
    //   519: ldc_w 200581946
    //   522: ixor
    //   523: ixor
    //   524: lookupswitch default -> 848, -1946771877 -> 507, 1984117042 -> 552
    //   552: goto -> 556
    //   555: athrow
    //   556: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   559: goto -> 563
    //   562: athrow
    //   563: getstatic Perryc.1 : I
    //   566: ifeq -> 580
    //   569: ldc2_w 1772838457
    //   572: l2i
    //   573: ldc_w 2046886086
    //   576: ixor
    //   577: goto -> 588
    //   580: ldc2_w -1405392824
    //   583: l2i
    //   584: ldc_w 527382057
    //   587: ixor
    //   588: ldc2_w -829892652
    //   591: l2i
    //   592: ldc_w -171521583
    //   595: ixor
    //   596: ixor
    //   597: lookupswitch default -> 624, -1367030760 -> 580, 686047482 -> 864
    //   624: goto -> 628
    //   627: athrow
    //   628: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   633: goto -> 637
    //   636: athrow
    //   637: getstatic Perryc.c : I
    //   640: iflt -> 654
    //   643: ldc2_w 755437867
    //   646: l2i
    //   647: ldc_w 963310912
    //   650: ixor
    //   651: goto -> 662
    //   654: ldc2_w -1008534441
    //   657: l2i
    //   658: ldc_w 2001513685
    //   661: ixor
    //   662: ldc2_w -1637249571
    //   665: l2i
    //   666: ldc_w -389571534
    //   669: ixor
    //   670: ixor
    //   671: lookupswitch default -> 696, -795127645 -> 654, 1657009540 -> 858
    //   696: goto -> 700
    //   699: athrow
    //   700: invokestatic toList : ()Ljava/util/stream/Collector;
    //   703: goto -> 707
    //   706: athrow
    //   707: getstatic Perryc.0 : I
    //   710: ifle -> 724
    //   713: ldc2_w 1369181529
    //   716: l2i
    //   717: ldc_w -1523361545
    //   720: ixor
    //   721: goto -> 732
    //   724: ldc2_w 447347012
    //   727: l2i
    //   728: ldc_w -1035599166
    //   731: ixor
    //   732: ldc2_w -798420859
    //   735: l2i
    //   736: ldc_w 1250136691
    //   739: ixor
    //   740: ixor
    //   741: lookupswitch default -> 866, 1107655024 -> 768, 1850070872 -> 724
    //   768: goto -> 772
    //   771: athrow
    //   772: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   777: goto -> 781
    //   780: athrow
    //   781: checkcast java/util/List
    //   784: getstatic Perryc.0 : I
    //   787: ifle -> 801
    //   790: ldc2_w 1862479939
    //   793: l2i
    //   794: ldc_w -1524294784
    //   797: ixor
    //   798: goto -> 809
    //   801: ldc2_w 615319123
    //   804: l2i
    //   805: ldc_w -903515807
    //   808: ixor
    //   809: ldc2_w -304482452
    //   812: l2i
    //   813: ldc_w -1727856325
    //   816: ixor
    //   817: ixor
    //   818: lookupswitch default -> 850, -1705868955 -> 844, -1090724460 -> 801
    //   844: putfield sortedModules : Ljava/util/List;
    //   847: return
    //   848: aconst_null
    //   849: athrow
    //   850: aconst_null
    //   851: athrow
    //   852: aconst_null
    //   853: athrow
    //   854: aconst_null
    //   855: athrow
    //   856: aconst_null
    //   857: athrow
    //   858: aconst_null
    //   859: athrow
    //   860: aconst_null
    //   861: athrow
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
    //   872: pop
    //   873: goto -> 24
    //   876: pop
    //   877: aconst_null
    //   878: goto -> 872
    //   881: dup
    //   882: ifnull -> 872
    //   885: checkcast java/lang/Throwable
    //   888: athrow
    //   889: dup
    //   890: ifnull -> 876
    //   893: checkcast java/lang/Throwable
    //   896: athrow
    //   897: aconst_null
    //   898: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	824	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    //   24	824	1	reverse	Z
    // Exception table:
    //   from	to	target	type
    //   8	20	881	finally
    //   207	214	214	finally
    //   207	214	214	finally
    //   208	214	207	finally
    //   208	214	3	finally
    //   208	214	214	java/lang/IllegalArgumentException
    //   280	286	286	finally
    //   280	286	286	finally
    //   280	286	286	java/lang/RuntimeException
    //   280	286	3	finally
    //   280	286	3	java/lang/NullPointerException
    //   356	364	364	finally
    //   356	364	364	java/lang/ArrayIndexOutOfBoundsException
    //   356	364	3	finally
    //   356	364	3	finally
    //   356	364	3	java/lang/EnumConstantNotPresentException
    //   555	562	562	finally
    //   555	562	562	java/lang/ClassCastException
    //   555	562	555	java/lang/ArrayIndexOutOfBoundsException
    //   556	562	3	finally
    //   556	562	562	finally
    //   627	636	636	finally
    //   627	636	3	finally
    //   627	636	3	finally
    //   628	636	3	java/lang/ArithmeticException
    //   628	636	627	java/lang/IllegalArgumentException
    //   699	706	706	finally
    //   699	706	706	java/lang/StringIndexOutOfBoundsException
    //   700	706	706	java/lang/RuntimeException
    //   700	706	699	java/lang/RuntimeException
    //   700	706	706	finally
    //   771	780	780	finally
    //   771	780	771	java/lang/IllegalStateException
    //   771	780	3	finally
    //   771	780	771	java/lang/EnumConstantNotPresentException
    //   771	780	780	finally
    //   881	889	881	java/lang/IllegalStateException
    //   897	899	3	finally
  }
  
  public static void lambda$onRender3D$2(Render3DEvent event, Module module) {
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
  
  public void disableModule(Class paramClass) {
    Perry1.0r(this, (int)-62469763L ^ 0xA4FDEDFC, paramClass);
  }
  
  public void init() {
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
  
  public Integer lambda$sortModules$3(boolean reverse, Module module) {
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
  
  public void onLogout() {
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
  
  public static void lambda$onKeyPressed$4(int eventKey, Module module) {
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
  
  public void enableModule(String paramString) {
    Perry1.1e(this, (int)1583796769L ^ 0x4B5C761B, paramString);
  }
  
  public void onUnloadPost() {
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
  
  public ArrayList getEnabledModulesName() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1567
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1559
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1551
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1030679901
    //   37: l2i
    //   38: ldc_w 1873998364
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1600218747
    //   48: l2i
    //   49: ldc_w 1850760861
    //   52: ixor
    //   53: ldc2_w 1389820980
    //   56: l2i
    //   57: ldc_w 79598028
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 1528, -78934713 -> 45, 1733907742 -> 88
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w -718947351
    //   108: l2i
    //   109: ldc_w 663058324
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 1960865252
    //   119: l2i
    //   120: ldc_w 2125289534
    //   123: ixor
    //   124: ldc2_w -1474870500
    //   127: l2i
    //   128: ldc_w -1101675159
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -454931960 -> 1510, 896258986 -> 116
    //   160: astore_1
    //   161: getstatic Perryc.1 : I
    //   164: ifeq -> 178
    //   167: ldc2_w -727093377
    //   170: l2i
    //   171: ldc_w -1611323066
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 612155760
    //   181: l2i
    //   182: ldc_w 18815425
    //   185: ixor
    //   186: ldc2_w 578407498
    //   189: l2i
    //   190: ldc_w -404653787
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 1504, -1899695274 -> 178, -520393250 -> 220
    //   220: aload_0
    //   221: getstatic Perryc.0 : I
    //   224: ifle -> 238
    //   227: ldc2_w 1564528632
    //   230: l2i
    //   231: ldc_w -1694444621
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w -1143312548
    //   241: l2i
    //   242: ldc_w -889960564
    //   245: ixor
    //   246: ldc2_w -2095392179
    //   249: l2i
    //   250: ldc_w 1544443654
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 1524, -1371888229 -> 280, 424972544 -> 238
    //   280: getfield webmods : Ljava/util/ArrayList;
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -92771842
    //   292: l2i
    //   293: ldc_w 1896374372
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1703606215
    //   303: l2i
    //   304: ldc_w -820426153
    //   307: ixor
    //   308: ldc2_w 353253626
    //   311: l2i
    //   312: ldc_w -707678457
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -1507578829 -> 300, 1269800551 -> 1536
    //   344: goto -> 348
    //   347: athrow
    //   348: invokevirtual iterator : ()Ljava/util/Iterator;
    //   351: goto -> 355
    //   354: athrow
    //   355: getstatic Perryc.c : I
    //   358: iflt -> 372
    //   361: ldc2_w -614939720
    //   364: l2i
    //   365: ldc_w -679761612
    //   368: ixor
    //   369: goto -> 380
    //   372: ldc2_w -1982161884
    //   375: l2i
    //   376: ldc_w -1442988395
    //   379: ixor
    //   380: ldc2_w 1115373212
    //   383: l2i
    //   384: ldc_w -205674977
    //   387: ixor
    //   388: ixor
    //   389: lookupswitch default -> 1506, -1847477710 -> 416, -1109003761 -> 372
    //   416: astore_2
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 434
    //   423: ldc2_w 1309042927
    //   426: l2i
    //   427: ldc_w 1582069461
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w 417850915
    //   437: l2i
    //   438: ldc_w 160748100
    //   441: ixor
    //   442: ldc2_w 145770179
    //   445: l2i
    //   446: ldc_w -1943746949
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 476, -1797349758 -> 1522, -952454001 -> 434
    //   476: aload_2
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 494
    //   483: ldc2_w -50192800
    //   486: l2i
    //   487: ldc_w -205388087
    //   490: ixor
    //   491: goto -> 502
    //   494: ldc2_w 1093890957
    //   497: l2i
    //   498: ldc_w -814543740
    //   501: ixor
    //   502: ldc2_w 2030421163
    //   505: l2i
    //   506: ldc_w -1664769542
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 1532, -352289288 -> 494, 1803557464 -> 536
    //   536: goto -> 540
    //   539: athrow
    //   540: invokeinterface hasNext : ()Z
    //   545: goto -> 549
    //   548: athrow
    //   549: ifeq -> 563
    //   552: ldc2_w 979652142
    //   555: l2i
    //   556: ldc_w 250338200
    //   559: ixor
    //   560: goto -> 571
    //   563: ldc2_w -917704470
    //   566: l2i
    //   567: ldc_w -37526177
    //   570: ixor
    //   571: ldc2_w 1713741119
    //   574: l2i
    //   575: ldc_w -1777078688
    //   578: ixor
    //   579: ixor
    //   580: tableswitch default -> 552, -994449687 -> 604, -994449686 -> 1439
    //   604: getstatic Perryc.1 : I
    //   607: ifeq -> 621
    //   610: ldc2_w -1191666090
    //   613: l2i
    //   614: ldc_w -1008681253
    //   617: ixor
    //   618: goto -> 629
    //   621: ldc2_w -1351955690
    //   624: l2i
    //   625: ldc_w 90000971
    //   628: ixor
    //   629: ldc2_w -1848296949
    //   632: l2i
    //   633: ldc_w -63472367
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 664, 385509271 -> 1534, 720734576 -> 621
    //   664: aload_2
    //   665: getstatic Perryc.c : I
    //   668: iflt -> 682
    //   671: ldc2_w -858569055
    //   674: l2i
    //   675: ldc_w 288446140
    //   678: ixor
    //   679: goto -> 690
    //   682: ldc2_w 2015204331
    //   685: l2i
    //   686: ldc_w 80396208
    //   689: ixor
    //   690: ldc2_w 873340839
    //   693: l2i
    //   694: ldc_w 1089605882
    //   697: ixor
    //   698: ixor
    //   699: lookupswitch default -> 724, -1457643712 -> 1502, -967612461 -> 682
    //   724: goto -> 728
    //   727: athrow
    //   728: invokeinterface next : ()Ljava/lang/Object;
    //   733: goto -> 737
    //   736: athrow
    //   737: checkcast bigname/zprestige/webhack/features/modules/Module
    //   740: getstatic Perryc.c : I
    //   743: iflt -> 757
    //   746: ldc2_w 154442935
    //   749: l2i
    //   750: ldc_w 1131986958
    //   753: ixor
    //   754: goto -> 765
    //   757: ldc2_w 1323716390
    //   760: l2i
    //   761: ldc_w -883590031
    //   764: ixor
    //   765: ldc2_w -1290042903
    //   768: l2i
    //   769: ldc_w -1923007162
    //   772: ixor
    //   773: ixor
    //   774: lookupswitch default -> 800, -456545213 -> 757, 1949753366 -> 1514
    //   800: astore_3
    //   801: getstatic Perryc.c : I
    //   804: iflt -> 818
    //   807: ldc2_w -800052796
    //   810: l2i
    //   811: ldc_w -1066303576
    //   814: ixor
    //   815: goto -> 826
    //   818: ldc2_w -516153757
    //   821: l2i
    //   822: ldc_w -22308537
    //   825: ixor
    //   826: ldc2_w 761311704
    //   829: l2i
    //   830: ldc_w 489868520
    //   833: ixor
    //   834: ixor
    //   835: lookupswitch default -> 1512, 544418652 -> 818, 801503764 -> 860
    //   860: aload_3
    //   861: getstatic Perryc.1 : I
    //   864: ifeq -> 878
    //   867: ldc2_w -1809905029
    //   870: l2i
    //   871: ldc_w 809370901
    //   874: ixor
    //   875: goto -> 886
    //   878: ldc2_w 1662714981
    //   881: l2i
    //   882: ldc_w 531914303
    //   885: ixor
    //   886: ldc2_w -1688684736
    //   889: l2i
    //   890: ldc_w 396255409
    //   893: ixor
    //   894: ixor
    //   895: lookupswitch default -> 920, 686282911 -> 1508, 2040414003 -> 878
    //   920: goto -> 924
    //   923: athrow
    //   924: invokevirtual isEnabled : ()Z
    //   927: goto -> 931
    //   930: athrow
    //   931: ifeq -> 945
    //   934: ldc2_w -317410190
    //   937: l2i
    //   938: ldc_w -13988569
    //   941: ixor
    //   942: goto -> 953
    //   945: ldc2_w -317085600
    //   948: l2i
    //   949: ldc_w -14184140
    //   952: ixor
    //   953: ldc2_w 2087719329
    //   956: l2i
    //   957: ldc_w -539421026
    //   960: ixor
    //   961: ixor
    //   962: tableswitch default -> 934, -1315488150 -> 984, -1315488149 -> 417
    //   984: getstatic Perryc.1 : I
    //   987: ifeq -> 1001
    //   990: ldc2_w 1415763325
    //   993: l2i
    //   994: ldc_w -552091029
    //   997: ixor
    //   998: goto -> 1009
    //   1001: ldc2_w 245609793
    //   1004: l2i
    //   1005: ldc_w 1871563312
    //   1008: ixor
    //   1009: ldc2_w 449781517
    //   1012: l2i
    //   1013: ldc_w 874539968
    //   1016: ixor
    //   1017: ixor
    //   1018: lookupswitch default -> 1044, -2051601178 -> 1001, -1516608549 -> 1516
    //   1044: aload_3
    //   1045: getstatic Perryc.1 : I
    //   1048: ifeq -> 1062
    //   1051: ldc2_w 866424269
    //   1054: l2i
    //   1055: ldc_w -765220695
    //   1058: ixor
    //   1059: goto -> 1070
    //   1062: ldc2_w 53998421
    //   1065: l2i
    //   1066: ldc_w -2042984974
    //   1069: ixor
    //   1070: ldc2_w 747276627
    //   1073: l2i
    //   1074: ldc_w 946799207
    //   1077: ixor
    //   1078: ixor
    //   1079: lookupswitch default -> 1104, -182274480 -> 1518, 1438748008 -> 1062
    //   1104: goto -> 1108
    //   1107: athrow
    //   1108: invokevirtual isDrawn : ()Z
    //   1111: goto -> 1115
    //   1114: athrow
    //   1115: ifne -> 1129
    //   1118: ldc2_w 527705892
    //   1121: l2i
    //   1122: ldc_w 2044640911
    //   1125: ixor
    //   1126: goto -> 1137
    //   1129: ldc2_w 254816485
    //   1132: l2i
    //   1133: ldc_w 1771743567
    //   1136: ixor
    //   1137: ldc2_w -617704038
    //   1140: l2i
    //   1141: ldc_w 995467409
    //   1144: ixor
    //   1145: ixor
    //   1146: tableswitch default -> 1118, -2033079136 -> 1168, -2033079135 -> 1171
    //   1168: goto -> 417
    //   1171: getstatic Perryc.0 : I
    //   1174: ifle -> 1188
    //   1177: ldc2_w 2094681673
    //   1180: l2i
    //   1181: ldc_w -1110533744
    //   1184: ixor
    //   1185: goto -> 1196
    //   1188: ldc2_w -1989749809
    //   1191: l2i
    //   1192: ldc_w 1259422030
    //   1195: ixor
    //   1196: ldc2_w 119550564
    //   1199: l2i
    //   1200: ldc_w -2115780911
    //   1203: ixor
    //   1204: ixor
    //   1205: lookupswitch default -> 1526, 1152654900 -> 1232, 1205295980 -> 1188
    //   1232: aload_1
    //   1233: getstatic Perryc.0 : I
    //   1236: ifle -> 1250
    //   1239: ldc2_w 1598667431
    //   1242: l2i
    //   1243: ldc_w -1883761096
    //   1246: ixor
    //   1247: goto -> 1258
    //   1250: ldc2_w -1414695658
    //   1253: l2i
    //   1254: ldc_w 441060355
    //   1257: ixor
    //   1258: ldc2_w 658043835
    //   1261: l2i
    //   1262: ldc_w 934475410
    //   1265: ixor
    //   1266: ixor
    //   1267: lookupswitch default -> 1292, -1065637450 -> 1540, -661604532 -> 1250
    //   1292: aload_3
    //   1293: getstatic Perryc.c : I
    //   1296: iflt -> 1310
    //   1299: ldc2_w -2093787994
    //   1302: l2i
    //   1303: ldc_w 1708141280
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w 437983909
    //   1313: l2i
    //   1314: ldc_w -670473029
    //   1317: ixor
    //   1318: ldc2_w 771936483
    //   1321: l2i
    //   1322: ldc_w -2077704182
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1352, 1288269487 -> 1538, 1323869810 -> 1310
    //   1352: goto -> 1356
    //   1355: athrow
    //   1356: invokevirtual getFullArrayString : ()Ljava/lang/String;
    //   1359: goto -> 1363
    //   1362: athrow
    //   1363: getstatic Perryc.c : I
    //   1366: iflt -> 1380
    //   1369: ldc2_w -1960398255
    //   1372: l2i
    //   1373: ldc_w 1807786012
    //   1376: ixor
    //   1377: goto -> 1388
    //   1380: ldc2_w 277626687
    //   1383: l2i
    //   1384: ldc_w -227329894
    //   1387: ixor
    //   1388: ldc2_w -1317719505
    //   1391: l2i
    //   1392: ldc_w 2102387664
    //   1395: ixor
    //   1396: ixor
    //   1397: lookupswitch default -> 1530, 752665522 -> 1380, 784717402 -> 1424
    //   1424: goto -> 1428
    //   1427: athrow
    //   1428: invokevirtual add : (Ljava/lang/Object;)Z
    //   1431: goto -> 1435
    //   1434: athrow
    //   1435: pop
    //   1436: goto -> 417
    //   1439: getstatic Perryc.c : I
    //   1442: iflt -> 1456
    //   1445: ldc2_w -567596762
    //   1448: l2i
    //   1449: ldc_w -257644776
    //   1452: ixor
    //   1453: goto -> 1464
    //   1456: ldc2_w 969040986
    //   1459: l2i
    //   1460: ldc_w 220975775
    //   1463: ixor
    //   1464: ldc2_w -1969800583
    //   1467: l2i
    //   1468: ldc_w 2058714998
    //   1471: ixor
    //   1472: ixor
    //   1473: lookupswitch default -> 1520, -993266742 -> 1500, -559035599 -> 1456
    //   1500: aload_1
    //   1501: areturn
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
    //   1526: aconst_null
    //   1527: athrow
    //   1528: aconst_null
    //   1529: athrow
    //   1530: aconst_null
    //   1531: athrow
    //   1532: aconst_null
    //   1533: athrow
    //   1534: aconst_null
    //   1535: athrow
    //   1536: aconst_null
    //   1537: athrow
    //   1538: aconst_null
    //   1539: athrow
    //   1540: aconst_null
    //   1541: athrow
    //   1542: pop
    //   1543: goto -> 24
    //   1546: pop
    //   1547: aconst_null
    //   1548: goto -> 1542
    //   1551: dup
    //   1552: ifnull -> 1542
    //   1555: checkcast java/lang/Throwable
    //   1558: athrow
    //   1559: dup
    //   1560: ifnull -> 1546
    //   1563: checkcast java/lang/Throwable
    //   1566: athrow
    //   1567: aconst_null
    //   1568: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   801	635	3	module	Lbigname/zprestige/webhack/features/modules/Module;
    //   24	1478	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    //   161	1341	1	enabledModules	Ljava/util/ArrayList;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   161	1341	1	enabledModules	Ljava/util/ArrayList<Ljava/lang/String;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	1551	java/lang/NullPointerException
    //   91	98	98	finally
    //   92	98	98	finally
    //   92	98	91	java/lang/NegativeArraySizeException
    //   92	98	98	java/lang/StringIndexOutOfBoundsException
    //   92	98	98	java/lang/IllegalStateException
    //   348	354	354	finally
    //   348	354	354	finally
    //   348	354	354	java/lang/IllegalStateException
    //   348	354	354	finally
    //   348	354	3	finally
    //   540	548	548	finally
    //   540	548	3	java/lang/AssertionError
    //   540	548	3	java/lang/EnumConstantNotPresentException
    //   540	548	3	java/util/ConcurrentModificationException
    //   540	548	548	finally
    //   727	736	736	finally
    //   727	736	727	java/util/NoSuchElementException
    //   727	736	3	java/lang/NegativeArraySizeException
    //   728	736	3	finally
    //   728	736	736	java/lang/NullPointerException
    //   923	930	930	finally
    //   923	930	923	finally
    //   923	930	930	finally
    //   924	930	930	finally
    //   924	930	3	finally
    //   1107	1114	1114	finally
    //   1107	1114	3	java/lang/ArrayIndexOutOfBoundsException
    //   1107	1114	1107	finally
    //   1108	1114	1107	java/lang/ArrayIndexOutOfBoundsException
    //   1108	1114	3	java/lang/NumberFormatException
    //   1355	1362	1362	finally
    //   1356	1362	1355	java/lang/UnsupportedOperationException
    //   1356	1362	1362	finally
    //   1356	1362	1362	java/lang/AssertionError
    //   1356	1362	1355	finally
    //   1427	1434	1434	finally
    //   1428	1434	1434	java/lang/UnsupportedOperationException
    //   1428	1434	1434	java/lang/ArrayIndexOutOfBoundsException
    //   1428	1434	1427	java/lang/StringIndexOutOfBoundsException
    //   1428	1434	1427	finally
    //   1551	1559	1551	java/lang/IllegalStateException
    //   1567	1569	3	java/lang/UnsupportedOperationException
  }
  
  public Module getModuleByName(String paramString) {
    return Perry1.5D(this, (int)-2049707967L ^ 0xDDB99697, paramString);
  }
  
  public boolean isModuleEnabled(Class paramClass) {
    return Perry1.0C(this, (int)1921379380L ^ 0x26AF47D0, paramClass);
  }
  
  public Module getModuleByDisplayName(String paramString) {
    return Perry1.5D(this, (int)-1459390739L ^ 0xF169103A, paramString);
  }
  
  public List getCategories() {
    return Perry1.57(this, (int)-36866079L ^ 0xB9569019);
  }
  
  public Module getModuleByClass(Class<T> clazz) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1027
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1019
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1011
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1858893797
    //   33: l2i
    //   34: ldc_w 1141113587
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1791260449
    //   44: l2i
    //   45: ldc_w 184873296
    //   48: ixor
    //   49: ldc2_w -1713576239
    //   52: l2i
    //   53: ldc_w 998757906
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2003614251 -> 1000, -451898135 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -1112871122
    //   94: l2i
    //   95: ldc_w 311632936
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1454345316
    //   105: l2i
    //   106: ldc_w 721283291
    //   109: ixor
    //   110: ldc2_w -1751812555
    //   113: l2i
    //   114: ldc_w -467358245
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 994, -595062552 -> 102, -266583895 -> 144
    //   144: getfield webmods : Ljava/util/ArrayList;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w -1622579191
    //   156: l2i
    //   157: ldc_w 355113431
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 1601896510
    //   167: l2i
    //   168: ldc_w -2136627631
    //   171: ixor
    //   172: ldc2_w 197285689
    //   175: l2i
    //   176: ldc_w -966128160
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -133387653 -> 164, 1204529927 -> 988
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual iterator : ()Ljava/util/Iterator;
    //   215: goto -> 219
    //   218: athrow
    //   219: getstatic Perryc.c : I
    //   222: iflt -> 236
    //   225: ldc2_w -1287581111
    //   228: l2i
    //   229: ldc_w 1048455282
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w 1248154029
    //   239: l2i
    //   240: ldc_w 1354248470
    //   243: ixor
    //   244: ldc2_w -1887999248
    //   247: l2i
    //   248: ldc_w -78039026
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 998, -116299579 -> 236, 1861431877 -> 280
    //   280: astore_2
    //   281: getstatic Perryc.0 : I
    //   284: ifle -> 298
    //   287: ldc2_w -1110507897
    //   290: l2i
    //   291: ldc_w -1569672915
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 1468467922
    //   301: l2i
    //   302: ldc_w 1284894517
    //   305: ixor
    //   306: ldc2_w -607810385
    //   309: l2i
    //   310: ldc_w -1772974904
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 978, 1378439117 -> 298, 1451615616 -> 340
    //   340: aload_2
    //   341: getstatic Perryc.0 : I
    //   344: ifle -> 358
    //   347: ldc2_w -244402000
    //   350: l2i
    //   351: ldc_w -451530133
    //   354: ixor
    //   355: goto -> 366
    //   358: ldc2_w 1860336098
    //   361: l2i
    //   362: ldc_w -527538188
    //   365: ixor
    //   366: ldc2_w 1693383486
    //   369: l2i
    //   370: ldc_w 1915348667
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 984, -1733622893 -> 400, 46110558 -> 358
    //   400: goto -> 404
    //   403: athrow
    //   404: invokeinterface hasNext : ()Z
    //   409: goto -> 413
    //   412: athrow
    //   413: ifeq -> 427
    //   416: ldc2_w -21191910
    //   419: l2i
    //   420: ldc_w -1825784135
    //   423: ixor
    //   424: goto -> 435
    //   427: ldc2_w -40083701
    //   430: l2i
    //   431: ldc_w -1878244689
    //   434: ixor
    //   435: ldc2_w -761300056
    //   438: l2i
    //   439: ldc_w 1071387136
    //   442: ixor
    //   443: ixor
    //   444: tableswitch default -> 416, -2133625845 -> 468, -2133625844 -> 974
    //   468: getstatic Perryc.0 : I
    //   471: ifle -> 485
    //   474: ldc2_w 1328440819
    //   477: l2i
    //   478: ldc_w 2090151500
    //   481: ixor
    //   482: goto -> 493
    //   485: ldc2_w 1287516862
    //   488: l2i
    //   489: ldc_w -1992697924
    //   492: ixor
    //   493: ldc2_w 1136633381
    //   496: l2i
    //   497: ldc_w -2861639
    //   500: ixor
    //   501: ixor
    //   502: lookupswitch default -> 996, -1882146781 -> 485, 2045761182 -> 528
    //   528: aload_2
    //   529: getstatic Perryc.0 : I
    //   532: ifle -> 546
    //   535: ldc2_w 643373469
    //   538: l2i
    //   539: ldc_w -1610793743
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w -1517505434
    //   549: l2i
    //   550: ldc_w -144066752
    //   553: ixor
    //   554: ldc2_w 1160037694
    //   557: l2i
    //   558: ldc_w -497452771
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 588, -637826426 -> 546, 517577039 -> 990
    //   588: goto -> 592
    //   591: athrow
    //   592: invokeinterface next : ()Ljava/lang/Object;
    //   597: goto -> 601
    //   600: athrow
    //   601: checkcast bigname/zprestige/webhack/features/modules/Module
    //   604: getstatic Perryc.c : I
    //   607: iflt -> 621
    //   610: ldc2_w -1997198873
    //   613: l2i
    //   614: ldc_w 468706311
    //   617: ixor
    //   618: goto -> 629
    //   621: ldc2_w 1890146458
    //   624: l2i
    //   625: ldc_w 536755876
    //   628: ixor
    //   629: ldc2_w -507279322
    //   632: l2i
    //   633: ldc_w 983922340
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 980, -1271818052 -> 664, 1216099170 -> 621
    //   664: astore_3
    //   665: getstatic Perryc.1 : I
    //   668: ifeq -> 682
    //   671: ldc2_w 1500925998
    //   674: l2i
    //   675: ldc_w 1619701107
    //   678: ixor
    //   679: goto -> 690
    //   682: ldc2_w 1088416629
    //   685: l2i
    //   686: ldc_w 1817235850
    //   689: ixor
    //   690: ldc2_w -540373970
    //   693: l2i
    //   694: ldc_w 650465023
    //   697: ixor
    //   698: ixor
    //   699: lookupswitch default -> 986, -1057800308 -> 682, -712968146 -> 724
    //   724: aload_1
    //   725: getstatic Perryc.c : I
    //   728: iflt -> 742
    //   731: ldc2_w 2084565138
    //   734: l2i
    //   735: ldc_w -680548945
    //   738: ixor
    //   739: goto -> 750
    //   742: ldc2_w -54813873
    //   745: l2i
    //   746: ldc_w 470697660
    //   749: ixor
    //   750: ldc2_w 1834176317
    //   753: l2i
    //   754: ldc_w 882915745
    //   757: ixor
    //   758: ixor
    //   759: lookupswitch default -> 982, -1186550929 -> 784, -224189535 -> 742
    //   784: aload_3
    //   785: getstatic Perryc.c : I
    //   788: iflt -> 802
    //   791: ldc2_w -1236169012
    //   794: l2i
    //   795: ldc_w -2086979650
    //   798: ixor
    //   799: goto -> 810
    //   802: ldc2_w -434280069
    //   805: l2i
    //   806: ldc_w 759054633
    //   809: ixor
    //   810: ldc2_w -587188946
    //   813: l2i
    //   814: ldc_w -471391137
    //   817: ixor
    //   818: ixor
    //   819: lookupswitch default -> 992, -171689693 -> 844, 187541507 -> 802
    //   844: goto -> 848
    //   847: athrow
    //   848: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   851: goto -> 855
    //   854: athrow
    //   855: ifne -> 869
    //   858: ldc2_w -1169004376
    //   861: l2i
    //   862: ldc_w 2125343751
    //   865: ixor
    //   866: goto -> 877
    //   869: ldc2_w -1760052708
    //   872: l2i
    //   873: ldc_w 1407975090
    //   876: ixor
    //   877: ldc2_w 2037599421
    //   880: l2i
    //   881: ldc_w 1662688710
    //   884: ixor
    //   885: ixor
    //   886: tableswitch default -> 858, -560622124 -> 908, -560622123 -> 911
    //   908: goto -> 281
    //   911: getstatic Perryc.c : I
    //   914: iflt -> 928
    //   917: ldc2_w -171746206
    //   920: l2i
    //   921: ldc_w 175044223
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w -2087230550
    //   931: l2i
    //   932: ldc_w -942630286
    //   935: ixor
    //   936: ldc2_w -2140841942
    //   939: l2i
    //   940: ldc_w -485820779
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 976, -1665006430 -> 928, 656955239 -> 972
    //   972: aload_3
    //   973: areturn
    //   974: aconst_null
    //   975: areturn
    //   976: aconst_null
    //   977: athrow
    //   978: aconst_null
    //   979: athrow
    //   980: aconst_null
    //   981: athrow
    //   982: aconst_null
    //   983: athrow
    //   984: aconst_null
    //   985: athrow
    //   986: aconst_null
    //   987: athrow
    //   988: aconst_null
    //   989: athrow
    //   990: aconst_null
    //   991: athrow
    //   992: aconst_null
    //   993: athrow
    //   994: aconst_null
    //   995: athrow
    //   996: aconst_null
    //   997: athrow
    //   998: aconst_null
    //   999: athrow
    //   1000: aconst_null
    //   1001: athrow
    //   1002: pop
    //   1003: goto -> 24
    //   1006: pop
    //   1007: aconst_null
    //   1008: goto -> 1002
    //   1011: dup
    //   1012: ifnull -> 1002
    //   1015: checkcast java/lang/Throwable
    //   1018: athrow
    //   1019: dup
    //   1020: ifnull -> 1006
    //   1023: checkcast java/lang/Throwable
    //   1026: athrow
    //   1027: aconst_null
    //   1028: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   665	309	3	module	Lbigname/zprestige/webhack/features/modules/Module;
    //   24	952	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    //   24	952	1	clazz	Ljava/lang/Class;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	952	1	clazz	Ljava/lang/Class<TT;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	1011	finally
    //   211	218	218	finally
    //   211	218	211	java/lang/IndexOutOfBoundsException
    //   211	218	3	finally
    //   211	218	3	finally
    //   212	218	211	finally
    //   403	412	412	finally
    //   403	412	3	finally
    //   403	412	412	java/lang/RuntimeException
    //   403	412	412	java/lang/IndexOutOfBoundsException
    //   403	412	403	java/lang/IllegalStateException
    //   591	600	600	finally
    //   591	600	3	java/lang/IllegalStateException
    //   591	600	600	java/lang/NullPointerException
    //   591	600	591	java/lang/NegativeArraySizeException
    //   592	600	3	java/util/NoSuchElementException
    //   847	854	854	finally
    //   848	854	3	java/lang/NullPointerException
    //   848	854	3	finally
    //   848	854	847	finally
    //   848	854	3	java/lang/ArrayIndexOutOfBoundsException
    //   1011	1019	1011	finally
    //   1027	1029	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public ModuleManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 2138499537
    //   9: l2i
    //   10: ldc_w 1405656354
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -37226500
    //   20: l2i
    //   21: ldc_w 1899897880
    //   24: ixor
    //   25: ldc2_w 467865482
    //   28: l2i
    //   29: ldc_w -1641035987
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1452098476 -> 704, -514783722 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -873141833
    //   70: l2i
    //   71: ldc_w -361746568
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 1445611701
    //   81: l2i
    //   82: ldc_w -1556254568
    //   85: ixor
    //   86: ldc2_w 1924055581
    //   89: l2i
    //   90: ldc_w -1332595393
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 718, -474467859 -> 78, 925617935 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 2011175590
    //   132: l2i
    //   133: ldc_w 1694011288
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1524230531
    //   143: l2i
    //   144: ldc_w 783767242
    //   147: ixor
    //   148: ldc2_w -897287530
    //   151: l2i
    //   152: ldc_w 1330161908
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 700, -1764472996 -> 140, -241013461 -> 184
    //   184: aload_0
    //   185: new java/util/ArrayList
    //   188: dup
    //   189: getstatic Perryc.1 : I
    //   192: ifeq -> 206
    //   195: ldc2_w 434068877
    //   198: l2i
    //   199: ldc_w -1657976825
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w -411621220
    //   209: l2i
    //   210: ldc_w -1549863638
    //   213: ixor
    //   214: ldc2_w -1695675626
    //   217: l2i
    //   218: ldc_w -1011790400
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 720, -575843492 -> 206, 498506592 -> 248
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 268
    //   257: ldc2_w 2055140995
    //   260: l2i
    //   261: ldc_w -486958858
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w -307392760
    //   271: l2i
    //   272: ldc_w 1186913987
    //   275: ixor
    //   276: ldc2_w 1059900583
    //   279: l2i
    //   280: ldc_w -111865424
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 716, 1593750370 -> 268, 1835699420 -> 312
    //   312: putfield webmods : Ljava/util/ArrayList;
    //   315: getstatic Perryc.1 : I
    //   318: ifeq -> 332
    //   321: ldc2_w 1364408106
    //   324: l2i
    //   325: ldc_w -269781642
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w 653877568
    //   335: l2i
    //   336: ldc_w -1886462456
    //   339: ixor
    //   340: ldc2_w 1238278683
    //   343: l2i
    //   344: ldc_w 211383088
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 710, -333418909 -> 376, -68185225 -> 332
    //   376: aload_0
    //   377: new java/util/ArrayList
    //   380: dup
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 398
    //   387: ldc2_w -2097509554
    //   390: l2i
    //   391: ldc_w 1748507888
    //   394: ixor
    //   395: goto -> 406
    //   398: ldc2_w 1368870664
    //   401: l2i
    //   402: ldc_w -1912984626
    //   405: ixor
    //   406: ldc2_w -226985102
    //   409: l2i
    //   410: ldc_w 1264690288
    //   413: ixor
    //   414: ixor
    //   415: lookupswitch default -> 440, 1406879932 -> 712, 1521496784 -> 398
    //   440: invokespecial <init> : ()V
    //   443: getstatic Perryc.c : I
    //   446: iflt -> 460
    //   449: ldc2_w 13658671
    //   452: l2i
    //   453: ldc_w -1362790810
    //   456: ixor
    //   457: goto -> 468
    //   460: ldc2_w -657280703
    //   463: l2i
    //   464: ldc_w 837499867
    //   467: ixor
    //   468: ldc2_w 1745435801
    //   471: l2i
    //   472: ldc_w -1619747079
    //   475: ixor
    //   476: ixor
    //   477: lookupswitch default -> 504, -2097491682 -> 460, 1500036649 -> 702
    //   504: putfield sortedModules : Ljava/util/List;
    //   507: getstatic Perryc.1 : I
    //   510: ifeq -> 524
    //   513: ldc2_w 240837300
    //   516: l2i
    //   517: ldc_w -212402416
    //   520: ixor
    //   521: goto -> 532
    //   524: ldc2_w -31262202
    //   527: l2i
    //   528: ldc_w -748319173
    //   531: ixor
    //   532: ldc2_w 1761989244
    //   535: l2i
    //   536: ldc_w 1305388900
    //   539: ixor
    //   540: ixor
    //   541: lookupswitch default -> 568, -1613091597 -> 524, -641242948 -> 706
    //   568: aload_0
    //   569: new java/util/ArrayList
    //   572: dup
    //   573: getstatic Perryc.0 : I
    //   576: ifle -> 590
    //   579: ldc2_w -1983507530
    //   582: l2i
    //   583: ldc_w 64711536
    //   586: ixor
    //   587: goto -> 598
    //   590: ldc2_w 514398480
    //   593: l2i
    //   594: ldc_w -948922427
    //   597: ixor
    //   598: ldc2_w 580999564
    //   601: l2i
    //   602: ldc_w -751502038
    //   605: ixor
    //   606: ixor
    //   607: lookupswitch default -> 714, 676080243 -> 632, 2072566880 -> 590
    //   632: invokespecial <init> : ()V
    //   635: getstatic Perryc.0 : I
    //   638: ifle -> 652
    //   641: ldc2_w 563975860
    //   644: l2i
    //   645: ldc_w 132015192
    //   648: ixor
    //   649: goto -> 660
    //   652: ldc2_w -1903143126
    //   655: l2i
    //   656: ldc_w 1985898890
    //   659: ixor
    //   660: ldc2_w -1581641285
    //   663: l2i
    //   664: ldc_w -2101795387
    //   667: ixor
    //   668: ixor
    //   669: lookupswitch default -> 708, -607319330 -> 696, 88131218 -> 652
    //   696: putfield sortedModulesABC : Ljava/util/List;
    //   699: return
    //   700: aconst_null
    //   701: athrow
    //   702: aconst_null
    //   703: athrow
    //   704: aconst_null
    //   705: athrow
    //   706: aconst_null
    //   707: athrow
    //   708: aconst_null
    //   709: athrow
    //   710: aconst_null
    //   711: athrow
    //   712: aconst_null
    //   713: athrow
    //   714: aconst_null
    //   715: athrow
    //   716: aconst_null
    //   717: athrow
    //   718: aconst_null
    //   719: athrow
    //   720: aconst_null
    //   721: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	700	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
  }
  
  public boolean isModuleEnabled(String paramString) {
    return Perry1.0O(this, (int)-772426148L ^ 0xFF7274D5, paramString);
  }
  
  public void sortModulesABC() {
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
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onRender3D(Render3DEvent event) {
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
  
  public void onUnload() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 601
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 593
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 585
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -607946614
    //   33: l2i
    //   34: ldc_w -1606389032
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1531076671
    //   44: l2i
    //   45: ldc_w 1319848158
    //   48: ixor
    //   49: ldc2_w -1431011866
    //   52: l2i
    //   53: ldc_w -1990723148
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 564, 906669235 -> 84, 1482722816 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 698159036
    //   94: l2i
    //   95: ldc_w -501466991
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1821446575
    //   105: l2i
    //   106: ldc_w 1445233579
    //   109: ixor
    //   110: ldc2_w 1621328607
    //   113: l2i
    //   114: ldc_w 1378676288
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 568, -138083995 -> 144, -116499534 -> 102
    //   144: getfield webmods : Ljava/util/ArrayList;
    //   147: getstatic Perryc.0 : I
    //   150: ifle -> 164
    //   153: ldc2_w -371981721
    //   156: l2i
    //   157: ldc_w 1456141225
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -782676977
    //   167: l2i
    //   168: ldc_w 664382767
    //   171: ixor
    //   172: ldc2_w -1825955531
    //   175: l2i
    //   176: ldc_w -1790690832
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -1183782645 -> 562, 18410040 -> 164
    //   208: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lnet/minecraftforge/fml/common/eventhandler/EventBus;
    //   211: dup
    //   212: getstatic Perryc.0 : I
    //   215: ifle -> 229
    //   218: ldc2_w 1091632711
    //   221: l2i
    //   222: ldc_w 1937194540
    //   225: ixor
    //   226: goto -> 237
    //   229: ldc2_w 1099010276
    //   232: l2i
    //   233: ldc_w 2108898552
    //   236: ixor
    //   237: ldc2_w -1917031066
    //   240: l2i
    //   241: ldc_w -169737482
    //   244: ixor
    //   245: ixor
    //   246: lookupswitch default -> 566, 1147978636 -> 272, 1245294587 -> 229
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual getClass : ()Ljava/lang/Class;
    //   279: goto -> 283
    //   282: athrow
    //   283: pop
    //   284: <illegal opcode> accept : (Lnet/minecraftforge/fml/common/eventhandler/EventBus;)Ljava/util/function/Consumer;
    //   289: getstatic Perryc.1 : I
    //   292: ifeq -> 306
    //   295: ldc2_w 998009342
    //   298: l2i
    //   299: ldc_w -988295585
    //   302: ixor
    //   303: goto -> 314
    //   306: ldc2_w -280570297
    //   309: l2i
    //   310: ldc_w 1701867819
    //   313: ixor
    //   314: ldc2_w -354936064
    //   317: l2i
    //   318: ldc_w 1801983164
    //   321: ixor
    //   322: ixor
    //   323: lookupswitch default -> 348, 1000485195 -> 306, 2145101853 -> 570
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   355: goto -> 359
    //   358: athrow
    //   359: getstatic Perryc.c : I
    //   362: iflt -> 376
    //   365: ldc2_w 812768982
    //   368: l2i
    //   369: ldc_w -866198763
    //   372: ixor
    //   373: goto -> 384
    //   376: ldc2_w -158691857
    //   379: l2i
    //   380: ldc_w -212498757
    //   383: ixor
    //   384: ldc2_w -922575531
    //   387: l2i
    //   388: ldc_w -1843999839
    //   391: ixor
    //   392: ixor
    //   393: lookupswitch default -> 560, -1489284297 -> 376, 1590386080 -> 420
    //   420: aload_0
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 438
    //   427: ldc2_w -448983270
    //   430: l2i
    //   431: ldc_w -1885014502
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w -195778237
    //   441: l2i
    //   442: ldc_w 1582856745
    //   445: ixor
    //   446: ldc2_w -314188987
    //   449: l2i
    //   450: ldc_w -45205001
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 480, 577561034 -> 438, 2056395698 -> 572
    //   480: getfield webmods : Ljava/util/ArrayList;
    //   483: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   488: getstatic Perryc.c : I
    //   491: iflt -> 505
    //   494: ldc2_w -1419720546
    //   497: l2i
    //   498: ldc_w -1580524076
    //   501: ixor
    //   502: goto -> 513
    //   505: ldc2_w 238364041
    //   508: l2i
    //   509: ldc_w -1613072798
    //   512: ixor
    //   513: ldc2_w -1672413493
    //   516: l2i
    //   517: ldc_w 382164361
    //   520: ixor
    //   521: ixor
    //   522: lookupswitch default -> 574, -2143521272 -> 505, 460910761 -> 548
    //   548: goto -> 552
    //   551: athrow
    //   552: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   555: goto -> 559
    //   558: athrow
    //   559: return
    //   560: aconst_null
    //   561: athrow
    //   562: aconst_null
    //   563: athrow
    //   564: aconst_null
    //   565: athrow
    //   566: aconst_null
    //   567: athrow
    //   568: aconst_null
    //   569: athrow
    //   570: aconst_null
    //   571: athrow
    //   572: aconst_null
    //   573: athrow
    //   574: aconst_null
    //   575: athrow
    //   576: pop
    //   577: goto -> 24
    //   580: pop
    //   581: aconst_null
    //   582: goto -> 576
    //   585: dup
    //   586: ifnull -> 576
    //   589: checkcast java/lang/Throwable
    //   592: athrow
    //   593: dup
    //   594: ifnull -> 580
    //   597: checkcast java/lang/Throwable
    //   600: athrow
    //   601: aconst_null
    //   602: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	536	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	585	finally
    //   275	282	282	finally
    //   275	282	282	java/lang/NegativeArraySizeException
    //   275	282	282	java/lang/StringIndexOutOfBoundsException
    //   276	282	275	java/lang/NullPointerException
    //   276	282	275	finally
    //   351	358	358	finally
    //   351	358	351	finally
    //   352	358	351	java/lang/ArithmeticException
    //   352	358	351	java/lang/NullPointerException
    //   352	358	358	java/lang/IllegalArgumentException
    //   552	558	558	finally
    //   552	558	3	finally
    //   552	558	3	java/lang/UnsupportedOperationException
    //   552	558	3	finally
    //   552	558	3	java/lang/ArrayIndexOutOfBoundsException
    //   585	593	585	java/util/NoSuchElementException
    //   601	603	3	java/lang/IllegalArgumentException
  }
  
  public ArrayList getEnabledModules() {
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
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 413
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 405
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 397
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -35755248
    //   33: l2i
    //   34: ldc_w 1198585007
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 859784057
    //   44: l2i
    //   45: ldc_w 1989741216
    //   48: ixor
    //   49: ldc2_w 631208436
    //   52: l2i
    //   53: ldc_w 1327566229
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 386, -804197410 -> 41, 790117816 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -1028995617
    //   94: l2i
    //   95: ldc_w -1486890646
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1966255202
    //   105: l2i
    //   106: ldc_w 925946057
    //   109: ixor
    //   110: ldc2_w 991061033
    //   113: l2i
    //   114: ldc_w 827662548
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -383286696 -> 102, 1873958984 -> 384
    //   144: getfield webmods : Ljava/util/ArrayList;
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w 1074347239
    //   156: l2i
    //   157: ldc_w -1869940621
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 1746360576
    //   167: l2i
    //   168: ldc_w 1344529211
    //   171: ixor
    //   172: ldc2_w -715625168
    //   175: l2i
    //   176: ldc_w 1732397460
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, 1099703814 -> 164, 1654251568 -> 380
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   215: goto -> 219
    //   218: athrow
    //   219: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   224: getstatic Perryc.c : I
    //   227: iflt -> 241
    //   230: ldc2_w -1150477467
    //   233: l2i
    //   234: ldc_w 286614099
    //   237: ixor
    //   238: goto -> 249
    //   241: ldc2_w 1844495386
    //   244: l2i
    //   245: ldc_w 1638334770
    //   248: ixor
    //   249: ldc2_w 57995231
    //   252: l2i
    //   253: ldc_w 1416188322
    //   256: ixor
    //   257: ixor
    //   258: lookupswitch default -> 378, -43661493 -> 241, 1531607893 -> 284
    //   284: goto -> 288
    //   287: athrow
    //   288: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   293: goto -> 297
    //   296: athrow
    //   297: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   302: getstatic Perryc.1 : I
    //   305: ifeq -> 319
    //   308: ldc2_w 1068540811
    //   311: l2i
    //   312: ldc_w 686813424
    //   315: ixor
    //   316: goto -> 327
    //   319: ldc2_w -1213382073
    //   322: l2i
    //   323: ldc_w 1394029620
    //   326: ixor
    //   327: ldc2_w 1924983947
    //   330: l2i
    //   331: ldc_w 1164294945
    //   334: ixor
    //   335: ixor
    //   336: lookupswitch default -> 382, -748477991 -> 364, 545653969 -> 319
    //   364: goto -> 368
    //   367: athrow
    //   368: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   373: goto -> 377
    //   376: athrow
    //   377: return
    //   378: aconst_null
    //   379: athrow
    //   380: aconst_null
    //   381: athrow
    //   382: aconst_null
    //   383: athrow
    //   384: aconst_null
    //   385: athrow
    //   386: aconst_null
    //   387: athrow
    //   388: pop
    //   389: goto -> 24
    //   392: pop
    //   393: aconst_null
    //   394: goto -> 388
    //   397: dup
    //   398: ifnull -> 388
    //   401: checkcast java/lang/Throwable
    //   404: athrow
    //   405: dup
    //   406: ifnull -> 392
    //   409: checkcast java/lang/Throwable
    //   412: athrow
    //   413: aconst_null
    //   414: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	354	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	397	java/lang/NumberFormatException
    //   212	218	218	finally
    //   212	218	218	java/lang/StringIndexOutOfBoundsException
    //   212	218	3	finally
    //   212	218	218	java/util/NoSuchElementException
    //   212	218	218	java/lang/AssertionError
    //   287	296	296	finally
    //   287	296	3	finally
    //   287	296	287	finally
    //   288	296	287	finally
    //   288	296	287	java/lang/IllegalArgumentException
    //   367	376	376	finally
    //   367	376	367	java/lang/StringIndexOutOfBoundsException
    //   367	376	376	finally
    //   368	376	376	java/lang/IllegalArgumentException
    //   368	376	367	java/lang/NegativeArraySizeException
    //   397	405	397	finally
    //   413	415	3	finally
  }
  
  public static void lambda$getModulesByCategory$0(Module.Category category, ArrayList modulesCategory, Module module) {
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
  
  public void enableModule(Class paramClass) {
    Perry1.0r(this, (int)25004922L ^ 0x59C6AFFA, paramClass);
  }
  
  public void onKeyPressed(int eventKey) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 753
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 745
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 737
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -404880566
    //   33: l2i
    //   34: ldc_w -726705354
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1794215122
    //   44: l2i
    //   45: ldc_w 655561315
    //   48: ixor
    //   49: ldc2_w -1642479936
    //   52: l2i
    //   53: ldc_w -1047437868
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 712, -308968871 -> 84, 1828305768 -> 41
    //   84: iload_1
    //   85: ifeq -> 99
    //   88: ldc2_w 74997971
    //   91: l2i
    //   92: ldc_w -2070098394
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w -680190433
    //   102: l2i
    //   103: ldc_w 1469165801
    //   106: ixor
    //   107: ldc2_w 723749012
    //   110: l2i
    //   111: ldc_w -1568176632
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, 155230313 -> 140, 155230314 -> 448
    //   140: getstatic Perryc.c : I
    //   143: iflt -> 157
    //   146: ldc2_w -1309753707
    //   149: l2i
    //   150: ldc_w 409157379
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w 1493938518
    //   160: l2i
    //   161: ldc_w 564917948
    //   164: ixor
    //   165: ldc2_w 1104557895
    //   168: l2i
    //   169: ldc_w 662947492
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -1236437901 -> 157, -807899019 -> 718
    //   200: goto -> 204
    //   203: athrow
    //   204: invokestatic getEventKeyState : ()Z
    //   207: goto -> 211
    //   210: athrow
    //   211: ifeq -> 225
    //   214: ldc2_w 236687779
    //   217: l2i
    //   218: ldc_w 2084188982
    //   221: ixor
    //   222: goto -> 233
    //   225: ldc2_w 698215046
    //   228: l2i
    //   229: ldc_w 1539065872
    //   232: ixor
    //   233: ldc2_w -435519901
    //   236: l2i
    //   237: ldc_w 1861754195
    //   240: ixor
    //   241: ixor
    //   242: tableswitch default -> 214, -86785627 -> 264, -86785626 -> 448
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 281
    //   270: ldc2_w 1258910356
    //   273: l2i
    //   274: ldc_w -170040333
    //   277: ixor
    //   278: goto -> 289
    //   281: ldc2_w -1242647278
    //   284: l2i
    //   285: ldc_w -1779043731
    //   288: ixor
    //   289: ldc2_w 178408567
    //   292: l2i
    //   293: ldc_w -46664542
    //   296: ixor
    //   297: ixor
    //   298: lookupswitch default -> 324, -235858766 -> 281, 1229040050 -> 720
    //   324: getstatic bigname/zprestige/webhack/manager/ModuleManager.mc : Lnet/minecraft/client/Minecraft;
    //   327: getstatic Perryc.c : I
    //   330: iflt -> 344
    //   333: ldc2_w 1910366643
    //   336: l2i
    //   337: ldc_w 42334641
    //   340: ixor
    //   341: goto -> 352
    //   344: ldc2_w -50362510
    //   347: l2i
    //   348: ldc_w 67571929
    //   351: ixor
    //   352: ldc2_w 1687584433
    //   355: l2i
    //   356: ldc_w 1353146876
    //   359: ixor
    //   360: ixor
    //   361: lookupswitch default -> 388, 1198065487 -> 722, 1649913449 -> 344
    //   388: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   391: instanceof bigname/zprestige/webhack/features/gui/OyVeyGui
    //   394: ifeq -> 408
    //   397: ldc2_w -973130211
    //   400: l2i
    //   401: ldc_w 1479748233
    //   404: ixor
    //   405: goto -> 416
    //   408: ldc2_w 1268929898
    //   411: l2i
    //   412: ldc_w -697415169
    //   415: ixor
    //   416: ldc2_w -761796334
    //   419: l2i
    //   420: ldc_w 1453067376
    //   423: ixor
    //   424: ixor
    //   425: tableswitch default -> 397, 432536054 -> 448, 432536055 -> 449
    //   448: return
    //   449: getstatic Perryc.c : I
    //   452: iflt -> 466
    //   455: ldc2_w 2009045510
    //   458: l2i
    //   459: ldc_w 2096141097
    //   462: ixor
    //   463: goto -> 474
    //   466: ldc2_w 1337384608
    //   469: l2i
    //   470: ldc_w -141738514
    //   473: ixor
    //   474: ldc2_w 388340143
    //   477: l2i
    //   478: ldc_w -228833714
    //   481: ixor
    //   482: ixor
    //   483: lookupswitch default -> 508, -298395954 -> 714, 743576289 -> 466
    //   508: aload_0
    //   509: getstatic Perryc.c : I
    //   512: iflt -> 526
    //   515: ldc2_w -298993992
    //   518: l2i
    //   519: ldc_w 578900358
    //   522: ixor
    //   523: goto -> 534
    //   526: ldc2_w -211939715
    //   529: l2i
    //   530: ldc_w 392637092
    //   533: ixor
    //   534: ldc2_w 320072179
    //   537: l2i
    //   538: ldc_w -1206540969
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 568, 290688383 -> 526, 1739238298 -> 716
    //   568: getfield webmods : Ljava/util/ArrayList;
    //   571: getstatic Perryc.c : I
    //   574: iflt -> 588
    //   577: ldc2_w 1587870809
    //   580: l2i
    //   581: ldc_w -1464909402
    //   584: ixor
    //   585: goto -> 596
    //   588: ldc2_w -826971918
    //   591: l2i
    //   592: ldc_w 979254389
    //   595: ixor
    //   596: ldc2_w -341321841
    //   599: l2i
    //   600: ldc_w 1869433473
    //   603: ixor
    //   604: ixor
    //   605: lookupswitch default -> 632, -1363175025 -> 588, 1925259505 -> 724
    //   632: iload_1
    //   633: <illegal opcode> accept : (I)Ljava/util/function/Consumer;
    //   638: getstatic Perryc.0 : I
    //   641: ifle -> 655
    //   644: ldc2_w 1539833810
    //   647: l2i
    //   648: ldc_w -58379136
    //   651: ixor
    //   652: goto -> 663
    //   655: ldc2_w 2002280158
    //   658: l2i
    //   659: ldc_w 842446956
    //   662: ixor
    //   663: ldc2_w 1301322088
    //   666: l2i
    //   667: ldc_w -464063314
    //   670: ixor
    //   671: ixor
    //   672: lookupswitch default -> 700, 243574420 -> 726, 833319605 -> 655
    //   700: goto -> 704
    //   703: athrow
    //   704: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   707: goto -> 711
    //   710: athrow
    //   711: return
    //   712: aconst_null
    //   713: athrow
    //   714: aconst_null
    //   715: athrow
    //   716: aconst_null
    //   717: athrow
    //   718: aconst_null
    //   719: athrow
    //   720: aconst_null
    //   721: athrow
    //   722: aconst_null
    //   723: athrow
    //   724: aconst_null
    //   725: athrow
    //   726: aconst_null
    //   727: athrow
    //   728: pop
    //   729: goto -> 24
    //   732: pop
    //   733: aconst_null
    //   734: goto -> 728
    //   737: dup
    //   738: ifnull -> 728
    //   741: checkcast java/lang/Throwable
    //   744: athrow
    //   745: dup
    //   746: ifnull -> 732
    //   749: checkcast java/lang/Throwable
    //   752: athrow
    //   753: aconst_null
    //   754: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	688	0	this	Lbigname/zprestige/webhack/manager/ModuleManager;
    //   24	688	1	eventKey	I
    // Exception table:
    //   from	to	target	type
    //   8	20	737	finally
    //   203	210	210	finally
    //   204	210	203	finally
    //   204	210	203	java/lang/NullPointerException
    //   204	210	3	java/lang/NumberFormatException
    //   204	210	210	finally
    //   703	710	710	finally
    //   703	710	710	finally
    //   703	710	703	finally
    //   703	710	703	finally
    //   704	710	703	finally
    //   737	745	737	java/lang/ClassCastException
    //   753	755	3	finally
  }
  
  public static void lambda$onRender2D$1(Render2DEvent event, Module module) {
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
  
  public void disableModule(String paramString) {
    Perry1.1b(this, (int)171220478L ^ 0xF639924, paramString);
  }
  
  public void onTick() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ModuleManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */