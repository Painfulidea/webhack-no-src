package bigname.zprestige.webhack.features.gui;

import Perryc;
import bigname.zprestige.webhack.features.gui.components.Component;
import bigname.zprestige.webhack.features.modules.Module;

public class OyVeyGui$1 extends Component {
  public Module.Category val$category;
  
  public OyVeyGui this$0;
  
  public void setupItems() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 531
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 523
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 515
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w 1309374390
    //   27: l2i
    //   28: ldc 1309374391
    //   30: ixor
    //   31: newarray int
    //   33: dup
    //   34: ldc2_w 864416861
    //   37: l2i
    //   38: ldc 864416861
    //   40: ixor
    //   41: ldc2_w 1585799361
    //   44: l2i
    //   45: ldc 1585799360
    //   47: ixor
    //   48: iastore
    //   49: getstatic Perryc.0 : I
    //   52: ifle -> 65
    //   55: ldc2_w 1720883454
    //   58: l2i
    //   59: ldc 220143153
    //   61: ixor
    //   62: goto -> 72
    //   65: ldc2_w -308964100
    //   68: l2i
    //   69: ldc -1261506132
    //   71: ixor
    //   72: ldc2_w 1921658543
    //   75: l2i
    //   76: ldc -865806909
    //   78: ixor
    //   79: ixor
    //   80: lookupswitch default -> 108, -714900061 -> 504, 150017883 -> 65
    //   108: putstatic bigname/zprestige/webhack/features/gui/OyVeyGui$1.counter1 : [I
    //   111: getstatic Perryc.c : I
    //   114: iflt -> 127
    //   117: ldc2_w 935907971
    //   120: l2i
    //   121: ldc 2058151418
    //   123: ixor
    //   124: goto -> 134
    //   127: ldc2_w 1479859554
    //   130: l2i
    //   131: ldc 1319277140
    //   133: ixor
    //   134: ldc2_w -666390115
    //   137: l2i
    //   138: ldc 514900886
    //   140: ixor
    //   141: ixor
    //   142: lookupswitch default -> 500, -1953282702 -> 127, -798933699 -> 168
    //   168: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   171: getstatic Perryc.0 : I
    //   174: ifle -> 187
    //   177: ldc2_w 56895630
    //   180: l2i
    //   181: ldc -401697096
    //   183: ixor
    //   184: goto -> 194
    //   187: ldc2_w -1694858830
    //   190: l2i
    //   191: ldc -1184563309
    //   193: ixor
    //   194: ldc2_w 1553552378
    //   197: l2i
    //   198: ldc -2016916963
    //   200: ixor
    //   201: ixor
    //   202: lookupswitch default -> 228, -1146533642 -> 187, 809215953 -> 494
    //   228: aload_0
    //   229: getstatic Perryc.0 : I
    //   232: ifle -> 245
    //   235: ldc2_w 14780562
    //   238: l2i
    //   239: ldc -245771574
    //   241: ixor
    //   242: goto -> 252
    //   245: ldc2_w 305262981
    //   248: l2i
    //   249: ldc -1845693458
    //   251: ixor
    //   252: ldc2_w 1043983486
    //   255: l2i
    //   256: ldc 28365195
    //   258: ixor
    //   259: ixor
    //   260: lookupswitch default -> 492, -1136377954 -> 288, -835622995 -> 245
    //   288: getfield val$category : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   291: getstatic Perryc.1 : I
    //   294: ifeq -> 307
    //   297: ldc2_w -1676209293
    //   300: l2i
    //   301: ldc 41113725
    //   303: ixor
    //   304: goto -> 314
    //   307: ldc2_w -1057187387
    //   310: l2i
    //   311: ldc 948192879
    //   313: ixor
    //   314: ldc2_w 205872745
    //   317: l2i
    //   318: ldc 1139531694
    //   320: ixor
    //   321: ixor
    //   322: lookupswitch default -> 348, -775238967 -> 502, 293107192 -> 307
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual getModulesByCategory : (Lbigname/zprestige/webhack/features/modules/Module$Category;)Ljava/util/ArrayList;
    //   355: goto -> 359
    //   358: athrow
    //   359: getstatic Perryc.0 : I
    //   362: ifle -> 375
    //   365: ldc2_w 471196303
    //   368: l2i
    //   369: ldc 2012872255
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -490479815
    //   378: l2i
    //   379: ldc 2140394180
    //   381: ixor
    //   382: ldc2_w -1755061722
    //   385: l2i
    //   386: ldc -2062373814
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 496, -1893645423 -> 416, 2040353500 -> 375
    //   416: aload_0
    //   417: <illegal opcode> accept : (Lbigname/zprestige/webhack/features/gui/OyVeyGui$1;)Ljava/util/function/Consumer;
    //   422: getstatic Perryc.c : I
    //   425: iflt -> 438
    //   428: ldc2_w -205506784
    //   431: l2i
    //   432: ldc -1928064069
    //   434: ixor
    //   435: goto -> 445
    //   438: ldc2_w -1979494177
    //   441: l2i
    //   442: ldc -716670758
    //   444: ixor
    //   445: ldc2_w 482133340
    //   448: l2i
    //   449: ldc -935245320
    //   451: ixor
    //   452: ixor
    //   453: lookupswitch default -> 480, -1440110529 -> 498, 1878589947 -> 438
    //   480: goto -> 484
    //   483: athrow
    //   484: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   487: goto -> 491
    //   490: athrow
    //   491: return
    //   492: aconst_null
    //   493: athrow
    //   494: aconst_null
    //   495: athrow
    //   496: aconst_null
    //   497: athrow
    //   498: aconst_null
    //   499: athrow
    //   500: aconst_null
    //   501: athrow
    //   502: aconst_null
    //   503: athrow
    //   504: aconst_null
    //   505: athrow
    //   506: pop
    //   507: goto -> 24
    //   510: pop
    //   511: aconst_null
    //   512: goto -> 506
    //   515: dup
    //   516: ifnull -> 506
    //   519: checkcast java/lang/Throwable
    //   522: athrow
    //   523: dup
    //   524: ifnull -> 510
    //   527: checkcast java/lang/Throwable
    //   530: athrow
    //   531: aconst_null
    //   532: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	468	0	this	Lbigname/zprestige/webhack/features/gui/OyVeyGui$1;
    // Exception table:
    //   from	to	target	type
    //   8	20	515	java/lang/NumberFormatException
    //   351	358	358	finally
    //   351	358	3	finally
    //   351	358	3	java/lang/ArithmeticException
    //   352	358	358	finally
    //   352	358	351	finally
    //   483	490	490	finally
    //   483	490	490	java/lang/EnumConstantNotPresentException
    //   483	490	3	finally
    //   484	490	483	finally
    //   484	490	483	java/lang/AssertionError
    //   515	523	515	java/lang/AssertionError
    //   531	533	3	finally
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public OyVeyGui$1(OyVeyGui this$0, String name, int x, int y, boolean open, Module.Category paramCategory) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 838951933
    //   9: l2i
    //   10: ldc 297914528
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1984710177
    //   19: l2i
    //   20: ldc -682138359
    //   22: ixor
    //   23: ldc2_w 474416987
    //   26: l2i
    //   27: ldc -1248389018
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 728, -1978618784 -> 16, 147536917 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1815223146
    //   66: l2i
    //   67: ldc -630287916
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -480494664
    //   76: l2i
    //   77: ldc 278653192
    //   79: ixor
    //   80: ldc2_w 176544109
    //   83: l2i
    //   84: ldc -347324123
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1469387510 -> 748, 901068671 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w -987276917
    //   126: l2i
    //   127: ldc -673923047
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 1407620488
    //   136: l2i
    //   137: ldc -129417689
    //   139: ixor
    //   140: ldc2_w -228796747
    //   143: l2i
    //   144: ldc 2066507707
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 730, -1685903204 -> 133, 585046689 -> 176
    //   176: putfield this$0 : Lbigname/zprestige/webhack/features/gui/OyVeyGui;
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -1801171068
    //   188: l2i
    //   189: ldc -178256703
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -381189919
    //   198: l2i
    //   199: ldc -373745824
    //   201: ixor
    //   202: ldc2_w 1069488192
    //   205: l2i
    //   206: ldc -146862435
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -1455137384 -> 732, 148408743 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w -1517808697
    //   246: l2i
    //   247: ldc 1650256463
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1559707447
    //   256: l2i
    //   257: ldc -1480581362
    //   259: ixor
    //   260: ldc2_w -1280763811
    //   263: l2i
    //   264: ldc -372967589
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -1648814450 -> 742, -232550766 -> 253
    //   296: aload #6
    //   298: getstatic Perryc.c : I
    //   301: iflt -> 314
    //   304: ldc2_w 872160304
    //   307: l2i
    //   308: ldc -530747815
    //   310: ixor
    //   311: goto -> 321
    //   314: ldc2_w -1407348209
    //   317: l2i
    //   318: ldc -2057150867
    //   320: ixor
    //   321: ldc2_w -841861325
    //   324: l2i
    //   325: ldc 1259254552
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 356, 1434318402 -> 734, 1486822434 -> 314
    //   356: putfield val$category : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w -859599192
    //   368: l2i
    //   369: ldc 1866056715
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -79014105
    //   378: l2i
    //   379: ldc -1036727321
    //   381: ixor
    //   382: ldc2_w -382532444
    //   385: l2i
    //   386: ldc -1162268567
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 416, -762379504 -> 375, -261063058 -> 738
    //   416: aload_0
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w -211262066
    //   426: l2i
    //   427: ldc -1343663175
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w -1037556031
    //   436: l2i
    //   437: ldc -194517832
    //   439: ixor
    //   440: ldc2_w 2014082226
    //   443: l2i
    //   444: ldc -953345766
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -476030049 -> 744, -13584187 -> 433
    //   476: aload_2
    //   477: getstatic Perryc.1 : I
    //   480: ifeq -> 493
    //   483: ldc2_w -615341296
    //   486: l2i
    //   487: ldc -192270012
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w 1181836663
    //   496: l2i
    //   497: ldc 2053699119
    //   499: ixor
    //   500: ldc2_w 1799204269
    //   503: l2i
    //   504: ldc 1288045665
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -982772495 -> 493, 136526744 -> 736
    //   536: iload_3
    //   537: getstatic Perryc.1 : I
    //   540: ifeq -> 553
    //   543: ldc2_w 1436448620
    //   546: l2i
    //   547: ldc -1360795846
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w 1246424498
    //   556: l2i
    //   557: ldc -45330631
    //   559: ixor
    //   560: ldc2_w 804415370
    //   563: l2i
    //   564: ldc -88074264
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -666665019 -> 553, 776986676 -> 750
    //   596: iload #4
    //   598: getstatic Perryc.0 : I
    //   601: ifle -> 615
    //   604: ldc2_w 1273291357
    //   607: l2i
    //   608: ldc_w -642856579
    //   611: ixor
    //   612: goto -> 623
    //   615: ldc2_w 1808190358
    //   618: l2i
    //   619: ldc_w 1471560997
    //   622: ixor
    //   623: ldc2_w -442400871
    //   626: l2i
    //   627: ldc_w -1117773589
    //   630: ixor
    //   631: ixor
    //   632: lookupswitch default -> 660, -896830382 -> 746, 230600489 -> 615
    //   660: iload #5
    //   662: getstatic Perryc.c : I
    //   665: iflt -> 679
    //   668: ldc2_w -249065433
    //   671: l2i
    //   672: ldc_w -612209686
    //   675: ixor
    //   676: goto -> 687
    //   679: ldc2_w 1765181564
    //   682: l2i
    //   683: ldc_w -1713929954
    //   686: ixor
    //   687: ldc2_w -1615289886
    //   690: l2i
    //   691: ldc_w -714328373
    //   694: ixor
    //   695: ixor
    //   696: lookupswitch default -> 724, -515784799 -> 679, 1618046180 -> 740
    //   724: invokespecial <init> : (Ljava/lang/String;IIZ)V
    //   727: return
    //   728: aconst_null
    //   729: athrow
    //   730: aconst_null
    //   731: athrow
    //   732: aconst_null
    //   733: athrow
    //   734: aconst_null
    //   735: athrow
    //   736: aconst_null
    //   737: athrow
    //   738: aconst_null
    //   739: athrow
    //   740: aconst_null
    //   741: athrow
    //   742: aconst_null
    //   743: athrow
    //   744: aconst_null
    //   745: athrow
    //   746: aconst_null
    //   747: athrow
    //   748: aconst_null
    //   749: athrow
    //   750: aconst_null
    //   751: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	728	0	this	Lbigname/zprestige/webhack/features/gui/OyVeyGui$1;
    //   0	728	1	this$0	Lbigname/zprestige/webhack/features/gui/OyVeyGui;
    //   0	728	2	name	Ljava/lang/String;
    //   0	728	3	x	I
    //   0	728	4	y	I
    //   0	728	5	open	Z
  }
  
  public void lambda$setupItems$0(Module module) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\OyVeyGui$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */