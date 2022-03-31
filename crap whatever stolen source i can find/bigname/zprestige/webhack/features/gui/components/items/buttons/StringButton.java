package bigname.zprestige.webhack.features.gui.components.items.buttons;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.setting.Setting;

public class StringButton extends Button {
  public Setting setting;
  
  public boolean isListening;
  
  public StringButton$CurrentString currentString;
  
  public void update() {
    Perry1.3q(this, (int)664591957L ^ 0x15C47FD0);
  }
  
  public StringButton(Setting setting) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1160700978
    //   9: l2i
    //   10: ldc 904873340
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -526363494
    //   19: l2i
    //   20: ldc -521984763
    //   22: ixor
    //   23: ldc2_w 1213613897
    //   26: l2i
    //   27: ldc -805916444
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 728, -2015132110 -> 56, -144615709 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -431851259
    //   66: l2i
    //   67: ldc -1960750069
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1245776646
    //   76: l2i
    //   77: ldc 722594854
    //   79: ixor
    //   80: ldc2_w -2056267217
    //   83: l2i
    //   84: ldc 1050682294
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 736, -693316457 -> 73, -627106119 -> 116
    //   116: aload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w 579570011
    //   126: l2i
    //   127: ldc -91359664
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 1285607757
    //   136: l2i
    //   137: ldc 1662176228
    //   139: ixor
    //   140: ldc2_w -1291479214
    //   143: l2i
    //   144: ldc 2040233536
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, 311989785 -> 748, 743477689 -> 133
    //   176: invokevirtual getName : ()Ljava/lang/String;
    //   179: getstatic Perryc.0 : I
    //   182: ifle -> 195
    //   185: ldc2_w 528570297
    //   188: l2i
    //   189: ldc -2146899318
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 1770095910
    //   198: l2i
    //   199: ldc 257110814
    //   201: ixor
    //   202: ldc2_w 1436848535
    //   205: l2i
    //   206: ldc 1854621562
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -1532597282 -> 738, 1115411562 -> 195
    //   236: invokespecial <init> : (Ljava/lang/String;)V
    //   239: getstatic Perryc.c : I
    //   242: iflt -> 255
    //   245: ldc2_w 1438240143
    //   248: l2i
    //   249: ldc -1916689677
    //   251: ixor
    //   252: goto -> 262
    //   255: ldc2_w 1955900785
    //   258: l2i
    //   259: ldc -2091092672
    //   261: ixor
    //   262: ldc2_w -979969764
    //   265: l2i
    //   266: ldc -2076301261
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 296, -1714381229 -> 746, 1185377097 -> 255
    //   296: aload_0
    //   297: new bigname/zprestige/webhack/features/gui/components/items/buttons/StringButton$CurrentString
    //   300: dup
    //   301: ldc ''
    //   303: getstatic Perryc.1 : I
    //   306: ifeq -> 319
    //   309: ldc2_w -754122633
    //   312: l2i
    //   313: ldc -1829545443
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w 2000394490
    //   322: l2i
    //   323: ldc 1364262356
    //   325: ixor
    //   326: ldc2_w -573393767
    //   329: l2i
    //   330: ldc 811605677
    //   332: ixor
    //   333: ixor
    //   334: lookupswitch default -> 360, -1404243874 -> 732, -1022169156 -> 319
    //   360: invokespecial <init> : (Ljava/lang/String;)V
    //   363: getstatic Perryc.0 : I
    //   366: ifle -> 379
    //   369: ldc2_w -1107354399
    //   372: l2i
    //   373: ldc -1313603553
    //   375: ixor
    //   376: goto -> 386
    //   379: ldc2_w 2084385483
    //   382: l2i
    //   383: ldc -1160409191
    //   385: ixor
    //   386: ldc2_w 110260620
    //   389: l2i
    //   390: ldc 1704170792
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 420, 1354650611 -> 379, 1867184218 -> 750
    //   420: putfield currentString : Lbigname/zprestige/webhack/features/gui/components/items/buttons/StringButton$CurrentString;
    //   423: getstatic Perryc.0 : I
    //   426: ifle -> 439
    //   429: ldc2_w 1257265710
    //   432: l2i
    //   433: ldc -1131284558
    //   435: ixor
    //   436: goto -> 446
    //   439: ldc2_w -211623425
    //   442: l2i
    //   443: ldc -2143081868
    //   445: ixor
    //   446: ldc2_w 1100576229
    //   449: l2i
    //   450: ldc -1612059236
    //   452: ixor
    //   453: ixor
    //   454: lookupswitch default -> 740, -1387179022 -> 480, 672216549 -> 439
    //   480: aload_0
    //   481: getstatic Perryc.c : I
    //   484: iflt -> 497
    //   487: ldc2_w -812989
    //   490: l2i
    //   491: ldc 163227087
    //   493: ixor
    //   494: goto -> 504
    //   497: ldc2_w 2070450101
    //   500: l2i
    //   501: ldc 515539277
    //   503: ixor
    //   504: ldc2_w -1004785069
    //   507: l2i
    //   508: ldc -614619567
    //   510: ixor
    //   511: ixor
    //   512: lookupswitch default -> 540, -1486610156 -> 497, -385308274 -> 730
    //   540: aload_1
    //   541: getstatic Perryc.1 : I
    //   544: ifeq -> 557
    //   547: ldc2_w 487780682
    //   550: l2i
    //   551: ldc 1979554765
    //   553: ixor
    //   554: goto -> 564
    //   557: ldc2_w 1626189630
    //   560: l2i
    //   561: ldc 233018352
    //   563: ixor
    //   564: ldc2_w 266989171
    //   567: l2i
    //   568: ldc 1321133709
    //   570: ixor
    //   571: ixor
    //   572: lookupswitch default -> 600, 699949689 -> 742, 874795341 -> 557
    //   600: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   603: getstatic Perryc.c : I
    //   606: iflt -> 619
    //   609: ldc2_w -571317210
    //   612: l2i
    //   613: ldc -171341142
    //   615: ixor
    //   616: goto -> 626
    //   619: ldc2_w 452621157
    //   622: l2i
    //   623: ldc 736278070
    //   625: ixor
    //   626: ldc2_w 1123861222
    //   629: l2i
    //   630: ldc 470143175
    //   632: ixor
    //   633: ixor
    //   634: lookupswitch default -> 660, -1994050152 -> 619, 1992490157 -> 734
    //   660: aload_0
    //   661: ldc2_w -923713287
    //   664: l2i
    //   665: ldc -923713290
    //   667: ixor
    //   668: getstatic Perryc.1 : I
    //   671: ifeq -> 684
    //   674: ldc2_w -1659426273
    //   677: l2i
    //   678: ldc 1246322385
    //   680: ixor
    //   681: goto -> 691
    //   684: ldc2_w 1707744773
    //   687: l2i
    //   688: ldc 1035654750
    //   690: ixor
    //   691: ldc2_w -1688897697
    //   694: l2i
    //   695: ldc -1045143070
    //   697: ixor
    //   698: ixor
    //   699: lookupswitch default -> 744, -1916837261 -> 684, 43114214 -> 724
    //   724: putfield width : I
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
    //   0	728	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/StringButton;
    //   0	728	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1041
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1033
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1025
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 1236722134
    //   33: l2i
    //   34: ldc -927777972
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -2097968636
    //   43: l2i
    //   44: ldc -439660715
    //   46: ixor
    //   47: ldc2_w -2103276589
    //   50: l2i
    //   51: ldc 512845970
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 1002, -83155440 -> 80, 490093019 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w -1188893399
    //   90: l2i
    //   91: ldc 1870629265
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1939022390
    //   100: l2i
    //   101: ldc 1044873907
    //   103: ixor
    //   104: ldc2_w -1551436703
    //   107: l2i
    //   108: ldc -1297865993
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -947932626 -> 1004, 1285306825 -> 97
    //   140: iload_1
    //   141: getstatic Perryc.1 : I
    //   144: ifeq -> 157
    //   147: ldc2_w 428758995
    //   150: l2i
    //   151: ldc 1481379608
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w -1751632783
    //   160: l2i
    //   161: ldc -200791922
    //   163: ixor
    //   164: ldc2_w -1330070939
    //   167: l2i
    //   168: ldc 1454535461
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 200, -1480027765 -> 988, 1690278008 -> 157
    //   200: iload_2
    //   201: getstatic Perryc.0 : I
    //   204: ifle -> 217
    //   207: ldc2_w -1557444181
    //   210: l2i
    //   211: ldc 301644922
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w 1564530466
    //   220: l2i
    //   221: ldc 564229166
    //   223: ixor
    //   224: ldc2_w -1509439284
    //   227: l2i
    //   228: ldc -1106193727
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 992, -1429803044 -> 217, 1693890817 -> 260
    //   260: iload_3
    //   261: getstatic Perryc.1 : I
    //   264: ifeq -> 277
    //   267: ldc2_w -1713196363
    //   270: l2i
    //   271: ldc -667658127
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w 721069396
    //   280: l2i
    //   281: ldc 796159642
    //   283: ixor
    //   284: ldc2_w 1793616302
    //   287: l2i
    //   288: ldc -1959614132
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 320, -2012048796 -> 277, -1609815514 -> 990
    //   320: goto -> 324
    //   323: athrow
    //   324: invokespecial mouseClicked : (III)V
    //   327: goto -> 331
    //   330: athrow
    //   331: getstatic Perryc.0 : I
    //   334: ifle -> 347
    //   337: ldc2_w -348723829
    //   340: l2i
    //   341: ldc -416333860
    //   343: ixor
    //   344: goto -> 354
    //   347: ldc2_w -2047043019
    //   350: l2i
    //   351: ldc -57447092
    //   353: ixor
    //   354: ldc2_w -1150167160
    //   357: l2i
    //   358: ldc -835778391
    //   360: ixor
    //   361: ixor
    //   362: lookupswitch default -> 1006, 204548184 -> 388, 2034697590 -> 347
    //   388: aload_0
    //   389: getstatic Perryc.c : I
    //   392: iflt -> 406
    //   395: ldc2_w 76116767
    //   398: l2i
    //   399: ldc_w 1623214146
    //   402: ixor
    //   403: goto -> 414
    //   406: ldc2_w 2022014949
    //   409: l2i
    //   410: ldc_w -1155291042
    //   413: ixor
    //   414: ldc2_w -1068316425
    //   417: l2i
    //   418: ldc_w 942413130
    //   421: ixor
    //   422: ixor
    //   423: lookupswitch default -> 996, -1674058016 -> 406, 1004014086 -> 448
    //   448: iload_1
    //   449: getstatic Perryc.c : I
    //   452: iflt -> 466
    //   455: ldc2_w 920307458
    //   458: l2i
    //   459: ldc_w -91867554
    //   462: ixor
    //   463: goto -> 474
    //   466: ldc2_w 608943964
    //   469: l2i
    //   470: ldc_w 1350522500
    //   473: ixor
    //   474: ldc2_w 672076170
    //   477: l2i
    //   478: ldc_w 567142491
    //   481: ixor
    //   482: ixor
    //   483: lookupswitch default -> 508, -979498867 -> 998, -253021526 -> 466
    //   508: iload_2
    //   509: getstatic Perryc.1 : I
    //   512: ifeq -> 526
    //   515: ldc2_w -1030457952
    //   518: l2i
    //   519: ldc_w -1415668839
    //   522: ixor
    //   523: goto -> 534
    //   526: ldc2_w 718355003
    //   529: l2i
    //   530: ldc_w -1286057349
    //   533: ixor
    //   534: ldc2_w -1214890656
    //   537: l2i
    //   538: ldc_w -510178873
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 568, 142423359 -> 526, 1057725086 -> 1010
    //   568: goto -> 572
    //   571: athrow
    //   572: invokevirtual isHovering : (II)Z
    //   575: goto -> 579
    //   578: athrow
    //   579: ifeq -> 593
    //   582: ldc2_w -1251898234
    //   585: l2i
    //   586: ldc_w 1318026544
    //   589: ixor
    //   590: goto -> 601
    //   593: ldc2_w -358169354
    //   596: l2i
    //   597: ldc_w 289944897
    //   600: ixor
    //   601: ldc2_w -428403792
    //   604: l2i
    //   605: ldc_w -2075659182
    //   608: ixor
    //   609: ixor
    //   610: tableswitch default -> 582, -1713498540 -> 632, -1713498539 -> 987
    //   632: getstatic Perryc.c : I
    //   635: iflt -> 649
    //   638: ldc2_w 783819428
    //   641: l2i
    //   642: ldc_w 856095844
    //   645: ixor
    //   646: goto -> 657
    //   649: ldc2_w -945333510
    //   652: l2i
    //   653: ldc_w 443286694
    //   656: ixor
    //   657: ldc2_w 457954648
    //   660: l2i
    //   661: ldc_w 1966538959
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 1014, -1279816757 -> 692, 1942096727 -> 649
    //   692: getstatic bigname/zprestige/webhack/features/gui/components/items/buttons/StringButton.mc : Lnet/minecraft/client/Minecraft;
    //   695: getstatic Perryc.0 : I
    //   698: ifle -> 712
    //   701: ldc2_w 744470570
    //   704: l2i
    //   705: ldc_w 2062278337
    //   708: ixor
    //   709: goto -> 720
    //   712: ldc2_w -1491595150
    //   715: l2i
    //   716: ldc_w 1670619186
    //   719: ixor
    //   720: ldc2_w 1662216522
    //   723: l2i
    //   724: ldc_w 1589296556
    //   727: ixor
    //   728: ixor
    //   729: lookupswitch default -> 994, -115186522 -> 756, 1797108237 -> 712
    //   756: goto -> 760
    //   759: athrow
    //   760: invokevirtual func_147118_V : ()Lnet/minecraft/client/audio/SoundHandler;
    //   763: goto -> 767
    //   766: athrow
    //   767: getstatic Perryc.1 : I
    //   770: ifeq -> 784
    //   773: ldc2_w 1039282210
    //   776: l2i
    //   777: ldc_w -937485684
    //   780: ixor
    //   781: goto -> 792
    //   784: ldc2_w 1347955545
    //   787: l2i
    //   788: ldc_w 1845463092
    //   791: ixor
    //   792: ldc2_w 58604577
    //   795: l2i
    //   796: ldc_w -1957821864
    //   799: ixor
    //   800: ixor
    //   801: lookupswitch default -> 828, 601373412 -> 784, 2111640791 -> 1008
    //   828: getstatic net/minecraft/init/SoundEvents.field_187909_gi : Lnet/minecraft/util/SoundEvent;
    //   831: ldc_w 71.513664
    //   834: invokestatic floatToIntBits : (F)I
    //   837: ldc_w 2098136831
    //   840: ixor
    //   841: invokestatic intBitsToFloat : (I)F
    //   844: getstatic Perryc.c : I
    //   847: iflt -> 861
    //   850: ldc2_w -1073483847
    //   853: l2i
    //   854: ldc_w 1452789267
    //   857: ixor
    //   858: goto -> 869
    //   861: ldc2_w -859990061
    //   864: l2i
    //   865: ldc_w 781237101
    //   868: ixor
    //   869: ldc2_w 53720761
    //   872: l2i
    //   873: ldc_w 1346398727
    //   876: ixor
    //   877: ixor
    //   878: lookupswitch default -> 1012, -1319178240 -> 904, -974652140 -> 861
    //   904: goto -> 908
    //   907: athrow
    //   908: invokestatic func_184371_a : (Lnet/minecraft/util/SoundEvent;F)Lnet/minecraft/client/audio/PositionedSoundRecord;
    //   911: goto -> 915
    //   914: athrow
    //   915: getstatic Perryc.1 : I
    //   918: ifeq -> 932
    //   921: ldc2_w 1633529827
    //   924: l2i
    //   925: ldc_w 1274610736
    //   928: ixor
    //   929: goto -> 940
    //   932: ldc2_w -1293403717
    //   935: l2i
    //   936: ldc_w 2113994478
    //   939: ixor
    //   940: ldc2_w -1696531410
    //   943: l2i
    //   944: ldc_w -271295236
    //   947: ixor
    //   948: ixor
    //   949: lookupswitch default -> 1000, -1176737913 -> 976, 1603275521 -> 932
    //   976: goto -> 980
    //   979: athrow
    //   980: invokevirtual func_147682_a : (Lnet/minecraft/client/audio/ISound;)V
    //   983: goto -> 987
    //   986: athrow
    //   987: return
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
    //   1002: aconst_null
    //   1003: athrow
    //   1004: aconst_null
    //   1005: athrow
    //   1006: aconst_null
    //   1007: athrow
    //   1008: aconst_null
    //   1009: athrow
    //   1010: aconst_null
    //   1011: athrow
    //   1012: aconst_null
    //   1013: athrow
    //   1014: aconst_null
    //   1015: athrow
    //   1016: pop
    //   1017: goto -> 24
    //   1020: pop
    //   1021: aconst_null
    //   1022: goto -> 1016
    //   1025: dup
    //   1026: ifnull -> 1016
    //   1029: checkcast java/lang/Throwable
    //   1032: athrow
    //   1033: dup
    //   1034: ifnull -> 1020
    //   1037: checkcast java/lang/Throwable
    //   1040: athrow
    //   1041: aconst_null
    //   1042: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	964	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/StringButton;
    //   24	964	1	mouseX	I
    //   24	964	2	mouseY	I
    //   24	964	3	mouseButton	I
    // Exception table:
    //   from	to	target	type
    //   8	20	1025	finally
    //   323	330	330	finally
    //   323	330	323	java/lang/NegativeArraySizeException
    //   323	330	330	java/util/NoSuchElementException
    //   324	330	330	java/lang/AssertionError
    //   324	330	323	finally
    //   572	578	578	finally
    //   572	578	578	java/lang/ClassCastException
    //   572	578	3	finally
    //   572	578	3	java/lang/ArrayIndexOutOfBoundsException
    //   572	578	3	java/lang/NullPointerException
    //   759	766	766	finally
    //   759	766	3	finally
    //   759	766	3	java/lang/IllegalArgumentException
    //   760	766	759	java/lang/EnumConstantNotPresentException
    //   760	766	759	finally
    //   907	914	914	finally
    //   907	914	3	finally
    //   908	914	914	finally
    //   908	914	914	finally
    //   908	914	907	java/lang/ArrayIndexOutOfBoundsException
    //   979	986	986	finally
    //   979	986	986	finally
    //   980	986	979	java/lang/UnsupportedOperationException
    //   980	986	986	java/lang/NullPointerException
    //   980	986	986	java/lang/ArithmeticException
    //   1025	1033	1025	java/lang/UnsupportedOperationException
    //   1041	1043	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static String removeLastChar(String paramString) {
    return Perry1.68(null, (int)-16697879L ^ 0xBD4363D7, paramString);
  }
  
  public void onKeyTyped(char typedChar, int keyCode) {
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
  
  public void enterString() {
    Perry1.3n(this, (int)-633125009L ^ 0x9139F075);
  }
  
  public void toggle() {
    Perry1.3g(this, (int)1821732595L ^ 0x7280D87E);
  }
  
  public void setString(String newString) {
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
  
  public boolean getState() {
    return Perry1.4r(this, (int)-779946232L ^ 0xBFC9E6EF);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public int getHeight() {
    return Perry1.3c(this, (int)-501739094L ^ 0xC3572D12);
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6997
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 6989
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6981
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -613740965
    //   33: l2i
    //   34: ldc_w 1232484859
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -877980075
    //   44: l2i
    //   45: ldc_w -1973061664
    //   48: ixor
    //   49: ldc2_w -375909680
    //   52: l2i
    //   53: ldc_w 1463282115
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 6852, -10380634 -> 84, 749915315 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 1511741130
    //   94: l2i
    //   95: ldc_w -841816010
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 289987448
    //   105: l2i
    //   106: ldc_w -523682892
    //   109: ixor
    //   110: ldc2_w 250187366
    //   113: l2i
    //   114: ldc_w 513500935
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -2078571732 -> 102, -2017765475 -> 6952
    //   144: getfield x : F
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w 1041498719
    //   156: l2i
    //   157: ldc_w -1737715277
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 909019313
    //   167: l2i
    //   168: ldc_w 1341368747
    //   171: ixor
    //   172: ldc2_w -415181618
    //   175: l2i
    //   176: ldc_w 22186947
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -1720530941 -> 164, 1080741089 -> 6848
    //   208: aload_0
    //   209: getstatic Perryc.0 : I
    //   212: ifle -> 226
    //   215: ldc2_w -1548003290
    //   218: l2i
    //   219: ldc_w -1307616192
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 418888551
    //   229: l2i
    //   230: ldc_w -1679079757
    //   233: ixor
    //   234: ldc2_w 618098746
    //   237: l2i
    //   238: ldc_w -662740932
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 6948, -316926880 -> 226, 2142563794 -> 268
    //   268: getfield y : F
    //   271: getstatic Perryc.0 : I
    //   274: ifle -> 288
    //   277: ldc2_w 831133916
    //   280: l2i
    //   281: ldc_w -1153293335
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w 911749868
    //   291: l2i
    //   292: ldc_w -1889768651
    //   295: ixor
    //   296: ldc2_w 468212100
    //   299: l2i
    //   300: ldc_w -2088909014
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -1966516538 -> 288, 308127131 -> 6832
    //   332: aload_0
    //   333: getstatic Perryc.c : I
    //   336: iflt -> 350
    //   339: ldc2_w 966396085
    //   342: l2i
    //   343: ldc_w 527989483
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w 1876750927
    //   353: l2i
    //   354: ldc_w 798135534
    //   357: ixor
    //   358: ldc2_w -2067892771
    //   361: l2i
    //   362: ldc_w 23422812
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 6954, -1556520737 -> 350, -980061152 -> 392
    //   392: getfield x : F
    //   395: getstatic Perryc.1 : I
    //   398: ifeq -> 412
    //   401: ldc2_w 1164925803
    //   404: l2i
    //   405: ldc_w -1697133073
    //   408: ixor
    //   409: goto -> 420
    //   412: ldc2_w 1182792422
    //   415: l2i
    //   416: ldc_w 150107337
    //   419: ixor
    //   420: ldc2_w 309211614
    //   423: l2i
    //   424: ldc_w -99006567
    //   427: ixor
    //   428: ixor
    //   429: lookupswitch default -> 456, -1759680834 -> 412, 936370371 -> 6962
    //   456: aload_0
    //   457: getstatic Perryc.0 : I
    //   460: ifle -> 474
    //   463: ldc2_w 1969092164
    //   466: l2i
    //   467: ldc_w 734916651
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w 1346526531
    //   477: l2i
    //   478: ldc_w 1306076029
    //   481: ixor
    //   482: ldc2_w -1173685100
    //   485: l2i
    //   486: ldc_w 378748700
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 516, -234240537 -> 6924, 610461644 -> 474
    //   516: getfield width : I
    //   519: i2f
    //   520: fadd
    //   521: ldc_w 0.22935641
    //   524: invokestatic floatToIntBits : (F)I
    //   527: ldc_w 2122715301
    //   530: ixor
    //   531: invokestatic intBitsToFloat : (I)F
    //   534: fadd
    //   535: getstatic Perryc.c : I
    //   538: iflt -> 552
    //   541: ldc2_w 171959584
    //   544: l2i
    //   545: ldc_w -521727446
    //   548: ixor
    //   549: goto -> 560
    //   552: ldc2_w 295098669
    //   555: l2i
    //   556: ldc_w -548051852
    //   559: ixor
    //   560: ldc2_w 1251710956
    //   563: l2i
    //   564: ldc_w 1605098996
    //   567: ixor
    //   568: ixor
    //   569: lookupswitch default -> 6950, -604768447 -> 596, -1524462 -> 552
    //   596: aload_0
    //   597: getstatic Perryc.0 : I
    //   600: ifle -> 614
    //   603: ldc2_w 1807960510
    //   606: l2i
    //   607: ldc_w 2112629431
    //   610: ixor
    //   611: goto -> 622
    //   614: ldc2_w -1211797422
    //   617: l2i
    //   618: ldc_w 1937627123
    //   621: ixor
    //   622: ldc2_w 407179148
    //   625: l2i
    //   626: ldc_w -2139240588
    //   629: ixor
    //   630: ixor
    //   631: lookupswitch default -> 656, -1911051279 -> 6872, -1680842468 -> 614
    //   656: getfield y : F
    //   659: getstatic Perryc.1 : I
    //   662: ifeq -> 676
    //   665: ldc2_w 728670772
    //   668: l2i
    //   669: ldc_w -1198195668
    //   672: ixor
    //   673: goto -> 684
    //   676: ldc2_w -1889027483
    //   679: l2i
    //   680: ldc_w 287920487
    //   683: ixor
    //   684: ldc2_w -842316786
    //   687: l2i
    //   688: ldc_w -1899999824
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 6868, -789489754 -> 676, -582622532 -> 720
    //   720: aload_0
    //   721: getstatic Perryc.1 : I
    //   724: ifeq -> 738
    //   727: ldc2_w -2074961213
    //   730: l2i
    //   731: ldc_w -1163041357
    //   734: ixor
    //   735: goto -> 746
    //   738: ldc2_w 112333125
    //   741: l2i
    //   742: ldc_w -463820564
    //   745: ixor
    //   746: ldc2_w -63678055
    //   749: l2i
    //   750: ldc_w -2032417411
    //   753: ixor
    //   754: ixor
    //   755: lookupswitch default -> 6956, -1744362163 -> 780, 1141924756 -> 738
    //   780: getfield height : I
    //   783: i2f
    //   784: fadd
    //   785: ldc_w 3.7205963
    //   788: invokestatic floatToIntBits : (F)I
    //   791: ldc_w 2137923136
    //   794: ixor
    //   795: invokestatic intBitsToFloat : (I)F
    //   798: fsub
    //   799: getstatic Perryc.1 : I
    //   802: ifeq -> 816
    //   805: ldc2_w -628891452
    //   808: l2i
    //   809: ldc_w -205884336
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -86424037
    //   819: l2i
    //   820: ldc_w -1182188116
    //   823: ixor
    //   824: ldc2_w 1899958674
    //   827: l2i
    //   828: ldc_w 199693168
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 6800, 965245269 -> 860, 1407293046 -> 816
    //   860: aload_0
    //   861: getstatic Perryc.c : I
    //   864: iflt -> 878
    //   867: ldc2_w 298075344
    //   870: l2i
    //   871: ldc_w 279343739
    //   874: ixor
    //   875: goto -> 886
    //   878: ldc2_w 273033804
    //   881: l2i
    //   882: ldc_w -271849972
    //   885: ixor
    //   886: ldc2_w 289609240
    //   889: l2i
    //   890: ldc_w -1383371179
    //   893: ixor
    //   894: ixor
    //   895: lookupswitch default -> 920, -1112912154 -> 6930, 2143409328 -> 878
    //   920: goto -> 924
    //   923: athrow
    //   924: invokevirtual getState : ()Z
    //   927: goto -> 931
    //   930: athrow
    //   931: ifeq -> 945
    //   934: ldc2_w -818197439
    //   937: l2i
    //   938: ldc_w 1184333651
    //   941: ixor
    //   942: goto -> 953
    //   945: ldc2_w -336903998
    //   948: l2i
    //   949: ldc_w 1648849873
    //   952: ixor
    //   953: ldc2_w 825969127
    //   956: l2i
    //   957: ldc_w 688821335
    //   960: ixor
    //   961: ixor
    //   962: tableswitch default -> 934, -1852182878 -> 984, -1852182877 -> 2278
    //   984: getstatic Perryc.0 : I
    //   987: ifle -> 1001
    //   990: ldc2_w 1516271275
    //   993: l2i
    //   994: ldc_w -905501421
    //   997: ixor
    //   998: goto -> 1009
    //   1001: ldc2_w -2029316076
    //   1004: l2i
    //   1005: ldc_w 135371943
    //   1008: ixor
    //   1009: ldc2_w 81898272
    //   1012: l2i
    //   1013: ldc_w -488125357
    //   1016: ixor
    //   1017: ixor
    //   1018: lookupswitch default -> 1044, -192734478 -> 1001, 1986081995 -> 6932
    //   1044: aload_0
    //   1045: getstatic Perryc.0 : I
    //   1048: ifle -> 1062
    //   1051: ldc2_w 1490062648
    //   1054: l2i
    //   1055: ldc_w -1436920217
    //   1058: ixor
    //   1059: goto -> 1070
    //   1062: ldc2_w -388857059
    //   1065: l2i
    //   1066: ldc_w 1596961365
    //   1069: ixor
    //   1070: ldc2_w -211509576
    //   1073: l2i
    //   1074: ldc_w -469443799
    //   1077: ixor
    //   1078: ixor
    //   1079: lookupswitch default -> 6822, -1600293671 -> 1104, -437608754 -> 1062
    //   1104: iload_1
    //   1105: getstatic Perryc.1 : I
    //   1108: ifeq -> 1122
    //   1111: ldc2_w 1845282266
    //   1114: l2i
    //   1115: ldc_w 549359540
    //   1118: ixor
    //   1119: goto -> 1130
    //   1122: ldc2_w -1461130809
    //   1125: l2i
    //   1126: ldc_w -810350169
    //   1129: ixor
    //   1130: ldc2_w 1426205733
    //   1133: l2i
    //   1134: ldc_w -429957695
    //   1137: ixor
    //   1138: ixor
    //   1139: lookupswitch default -> 6926, -737767036 -> 1164, -31507574 -> 1122
    //   1164: iload_2
    //   1165: getstatic Perryc.1 : I
    //   1168: ifeq -> 1182
    //   1171: ldc2_w -1860550947
    //   1174: l2i
    //   1175: ldc_w 903077131
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w -1097541965
    //   1185: l2i
    //   1186: ldc_w -567396003
    //   1189: ixor
    //   1190: ldc2_w 1702101679
    //   1193: l2i
    //   1194: ldc_w 2036604609
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 1224, -1193672776 -> 6960, -244879977 -> 1182
    //   1224: goto -> 1228
    //   1227: athrow
    //   1228: invokevirtual isHovering : (II)Z
    //   1231: goto -> 1235
    //   1234: athrow
    //   1235: ifne -> 1249
    //   1238: ldc2_w 1617454886
    //   1241: l2i
    //   1242: ldc_w -941844386
    //   1245: ixor
    //   1246: goto -> 1257
    //   1249: ldc2_w 320908040
    //   1252: l2i
    //   1253: ldc_w -1265347465
    //   1256: ixor
    //   1257: ldc2_w -2000895651
    //   1260: l2i
    //   1261: ldc_w 1128695998
    //   1264: ixor
    //   1265: ixor
    //   1266: tableswitch default -> 1238, 1817097883 -> 1288, 1817097884 -> 1782
    //   1288: getstatic Perryc.1 : I
    //   1291: ifeq -> 1305
    //   1294: ldc2_w 1704605546
    //   1297: l2i
    //   1298: ldc_w -721300500
    //   1301: ixor
    //   1302: goto -> 1313
    //   1305: ldc2_w -1695193104
    //   1308: l2i
    //   1309: ldc_w -917007163
    //   1312: ixor
    //   1313: ldc2_w 1767781050
    //   1316: l2i
    //   1317: ldc_w 638174930
    //   1320: ixor
    //   1321: ixor
    //   1322: lookupswitch default -> 1348, -3403538 -> 6908, 176541479 -> 1305
    //   1348: getstatic bigname/zprestige/webhack/WebHack.colorManager : Lbigname/zprestige/webhack/manager/ColorManager;
    //   1351: getstatic Perryc.1 : I
    //   1354: ifeq -> 1368
    //   1357: ldc2_w -655962298
    //   1360: l2i
    //   1361: ldc_w 2023629184
    //   1364: ixor
    //   1365: goto -> 1376
    //   1368: ldc2_w -247817361
    //   1371: l2i
    //   1372: ldc_w 447384769
    //   1375: ixor
    //   1376: ldc2_w -1702715842
    //   1379: l2i
    //   1380: ldc_w -881243800
    //   1383: ixor
    //   1384: ixor
    //   1385: lookupswitch default -> 1412, -2048182221 -> 1368, -243058288 -> 6958
    //   1412: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   1415: ldc_w bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   1418: getstatic Perryc.1 : I
    //   1421: ifeq -> 1435
    //   1424: ldc2_w 299410190
    //   1427: l2i
    //   1428: ldc_w -1616342255
    //   1431: ixor
    //   1432: goto -> 1443
    //   1435: ldc2_w 1157931719
    //   1438: l2i
    //   1439: ldc_w -1924746033
    //   1442: ixor
    //   1443: ldc2_w -173721622
    //   1446: l2i
    //   1447: ldc_w -764646103
    //   1450: ixor
    //   1451: ixor
    //   1452: lookupswitch default -> 1480, -1447466276 -> 6968, -899789596 -> 1435
    //   1480: goto -> 1484
    //   1483: athrow
    //   1484: invokevirtual getModuleByClass : (Ljava/lang/Class;)Lbigname/zprestige/webhack/features/modules/Module;
    //   1487: goto -> 1491
    //   1490: athrow
    //   1491: checkcast bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   1494: getstatic Perryc.1 : I
    //   1497: ifeq -> 1511
    //   1500: ldc2_w 661585047
    //   1503: l2i
    //   1504: ldc_w -660755982
    //   1507: ixor
    //   1508: goto -> 1519
    //   1511: ldc2_w -1664592298
    //   1514: l2i
    //   1515: ldc_w -267964252
    //   1518: ixor
    //   1519: ldc2_w -954156543
    //   1522: l2i
    //   1523: ldc_w -471311135
    //   1526: ixor
    //   1527: ixor
    //   1528: lookupswitch default -> 1556, -2007363461 -> 1511, -616844411 -> 6892
    //   1556: getfield hoverAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1559: getstatic Perryc.1 : I
    //   1562: ifeq -> 1576
    //   1565: ldc2_w 1677746949
    //   1568: l2i
    //   1569: ldc_w 2033460299
    //   1572: ixor
    //   1573: goto -> 1584
    //   1576: ldc2_w -1499978404
    //   1579: l2i
    //   1580: ldc_w 249058032
    //   1583: ixor
    //   1584: ldc2_w -1619843643
    //   1587: l2i
    //   1588: ldc_w 977520583
    //   1591: ixor
    //   1592: ixor
    //   1593: lookupswitch default -> 1620, -1207655092 -> 6874, -477676728 -> 1576
    //   1620: goto -> 1624
    //   1623: athrow
    //   1624: invokevirtual getValue : ()Ljava/lang/Object;
    //   1627: goto -> 1631
    //   1630: athrow
    //   1631: checkcast java/lang/Integer
    //   1634: getstatic Perryc.1 : I
    //   1637: ifeq -> 1651
    //   1640: ldc2_w 241740952
    //   1643: l2i
    //   1644: ldc_w 1940035798
    //   1647: ixor
    //   1648: goto -> 1659
    //   1651: ldc2_w 1135118655
    //   1654: l2i
    //   1655: ldc_w -1556579267
    //   1658: ixor
    //   1659: ldc2_w 1933475367
    //   1662: l2i
    //   1663: ldc_w 598412973
    //   1666: ixor
    //   1667: ixor
    //   1668: lookupswitch default -> 6808, -1341815416 -> 1696, 761218244 -> 1651
    //   1696: goto -> 1700
    //   1699: athrow
    //   1700: invokevirtual intValue : ()I
    //   1703: goto -> 1707
    //   1706: athrow
    //   1707: getstatic Perryc.0 : I
    //   1710: ifle -> 1724
    //   1713: ldc2_w -1486026082
    //   1716: l2i
    //   1717: ldc_w -1078121931
    //   1720: ixor
    //   1721: goto -> 1732
    //   1724: ldc2_w 1223398192
    //   1727: l2i
    //   1728: ldc_w 1008705991
    //   1731: ixor
    //   1732: ldc2_w -1657267842
    //   1735: l2i
    //   1736: ldc_w 1705283461
    //   1739: ixor
    //   1740: ixor
    //   1741: lookupswitch default -> 1768, -531843504 -> 6916, 1109179266 -> 1724
    //   1768: goto -> 1772
    //   1771: athrow
    //   1772: invokevirtual getColorWithAlpha : (I)I
    //   1775: goto -> 1779
    //   1778: athrow
    //   1779: goto -> 2603
    //   1782: getstatic Perryc.0 : I
    //   1785: ifle -> 1799
    //   1788: ldc2_w 220747928
    //   1791: l2i
    //   1792: ldc_w -590201402
    //   1795: ixor
    //   1796: goto -> 1807
    //   1799: ldc2_w 1282718650
    //   1802: l2i
    //   1803: ldc_w 299030630
    //   1806: ixor
    //   1807: ldc2_w 1340136348
    //   1810: l2i
    //   1811: ldc_w 479554552
    //   1814: ixor
    //   1815: ixor
    //   1816: lookupswitch default -> 6898, -2104502982 -> 1799, 248763320 -> 1844
    //   1844: getstatic bigname/zprestige/webhack/WebHack.colorManager : Lbigname/zprestige/webhack/manager/ColorManager;
    //   1847: getstatic Perryc.0 : I
    //   1850: ifle -> 1864
    //   1853: ldc2_w 2108012596
    //   1856: l2i
    //   1857: ldc_w 997566795
    //   1860: ixor
    //   1861: goto -> 1872
    //   1864: ldc2_w -424684906
    //   1867: l2i
    //   1868: ldc_w -1493966319
    //   1871: ixor
    //   1872: ldc2_w -566359721
    //   1875: l2i
    //   1876: ldc_w -124783700
    //   1879: ixor
    //   1880: ixor
    //   1881: lookupswitch default -> 6816, 1617030020 -> 1864, 1726859900 -> 1908
    //   1908: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   1911: ldc_w bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   1914: getstatic Perryc.1 : I
    //   1917: ifeq -> 1931
    //   1920: ldc2_w -1064023015
    //   1923: l2i
    //   1924: ldc_w 870543987
    //   1927: ixor
    //   1928: goto -> 1939
    //   1931: ldc2_w -791951333
    //   1934: l2i
    //   1935: ldc_w 2027890832
    //   1938: ixor
    //   1939: ldc2_w -1324915926
    //   1942: l2i
    //   1943: ldc_w -1130395393
    //   1946: ixor
    //   1947: ixor
    //   1948: lookupswitch default -> 1976, -17836609 -> 6844, 1445547937 -> 1931
    //   1976: goto -> 1980
    //   1979: athrow
    //   1980: invokevirtual getModuleByClass : (Ljava/lang/Class;)Lbigname/zprestige/webhack/features/modules/Module;
    //   1983: goto -> 1987
    //   1986: athrow
    //   1987: checkcast bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   1990: getstatic Perryc.1 : I
    //   1993: ifeq -> 2007
    //   1996: ldc2_w -908085575
    //   1999: l2i
    //   2000: ldc_w 1890921980
    //   2003: ixor
    //   2004: goto -> 2015
    //   2007: ldc2_w 1673954390
    //   2010: l2i
    //   2011: ldc_w 1552219599
    //   2014: ixor
    //   2015: ldc2_w 1044351879
    //   2018: l2i
    //   2019: ldc_w 1454972563
    //   2022: ixor
    //   2023: ixor
    //   2024: lookupswitch default -> 2052, -1600590876 -> 2007, -773058991 -> 6824
    //   2052: getfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2055: getstatic Perryc.1 : I
    //   2058: ifeq -> 2072
    //   2061: ldc2_w -154757102
    //   2064: l2i
    //   2065: ldc_w -77610366
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w -58586088
    //   2075: l2i
    //   2076: ldc_w -1479114366
    //   2079: ixor
    //   2080: ldc2_w 1701568698
    //   2083: l2i
    //   2084: ldc_w -1450553012
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 6834, -1749730196 -> 2116, -1049040026 -> 2072
    //   2116: goto -> 2120
    //   2119: athrow
    //   2120: invokevirtual getValue : ()Ljava/lang/Object;
    //   2123: goto -> 2127
    //   2126: athrow
    //   2127: checkcast java/lang/Integer
    //   2130: getstatic Perryc.0 : I
    //   2133: ifle -> 2147
    //   2136: ldc2_w 4417909
    //   2139: l2i
    //   2140: ldc_w 2100955705
    //   2143: ixor
    //   2144: goto -> 2155
    //   2147: ldc2_w 1707435015
    //   2150: l2i
    //   2151: ldc_w 78420095
    //   2154: ixor
    //   2155: ldc2_w -1138499976
    //   2158: l2i
    //   2159: ldc_w 1488345569
    //   2162: ixor
    //   2163: ixor
    //   2164: lookupswitch default -> 6880, -2047050783 -> 2192, -1712528171 -> 2147
    //   2192: goto -> 2196
    //   2195: athrow
    //   2196: invokevirtual intValue : ()I
    //   2199: goto -> 2203
    //   2202: athrow
    //   2203: getstatic Perryc.1 : I
    //   2206: ifeq -> 2220
    //   2209: ldc2_w -1042485592
    //   2212: l2i
    //   2213: ldc_w -161130704
    //   2216: ixor
    //   2217: goto -> 2228
    //   2220: ldc2_w 1921944412
    //   2223: l2i
    //   2224: ldc_w 1099440830
    //   2227: ixor
    //   2228: ldc2_w -1445702951
    //   2231: l2i
    //   2232: ldc_w -1347400188
    //   2235: ixor
    //   2236: ixor
    //   2237: lookupswitch default -> 2264, -798060955 -> 2220, 836609349 -> 6944
    //   2264: goto -> 2268
    //   2267: athrow
    //   2268: invokevirtual getColorWithAlpha : (I)I
    //   2271: goto -> 2275
    //   2274: athrow
    //   2275: goto -> 2603
    //   2278: getstatic Perryc.1 : I
    //   2281: ifeq -> 2295
    //   2284: ldc2_w -1181814631
    //   2287: l2i
    //   2288: ldc_w 1009316827
    //   2291: ixor
    //   2292: goto -> 2303
    //   2295: ldc2_w -1628565991
    //   2298: l2i
    //   2299: ldc_w -1709246300
    //   2302: ixor
    //   2303: ldc2_w 252385998
    //   2306: l2i
    //   2307: ldc_w -1125383926
    //   2310: ixor
    //   2311: ixor
    //   2312: lookupswitch default -> 2340, -942773562 -> 2295, 910235782 -> 6920
    //   2340: aload_0
    //   2341: getstatic Perryc.0 : I
    //   2344: ifle -> 2358
    //   2347: ldc2_w 167254957
    //   2350: l2i
    //   2351: ldc_w -1081337591
    //   2354: ixor
    //   2355: goto -> 2366
    //   2358: ldc2_w -1896840966
    //   2361: l2i
    //   2362: ldc_w 986229076
    //   2365: ixor
    //   2366: ldc2_w -596222257
    //   2369: l2i
    //   2370: ldc_w -692352885
    //   2373: ixor
    //   2374: ixor
    //   2375: lookupswitch default -> 6802, -1128672032 -> 2358, -1091174422 -> 2400
    //   2400: iload_1
    //   2401: getstatic Perryc.c : I
    //   2404: iflt -> 2418
    //   2407: ldc2_w 2026611965
    //   2410: l2i
    //   2411: ldc_w -1574343103
    //   2414: ixor
    //   2415: goto -> 2426
    //   2418: ldc2_w 336073495
    //   2421: l2i
    //   2422: ldc_w -934912886
    //   2425: ixor
    //   2426: ldc2_w -1242621039
    //   2429: l2i
    //   2430: ldc_w -729401362
    //   2433: ixor
    //   2434: ixor
    //   2435: lookupswitch default -> 2460, -1861201624 -> 2418, -1148459325 -> 6936
    //   2460: iload_2
    //   2461: getstatic Perryc.0 : I
    //   2464: ifle -> 2478
    //   2467: ldc2_w -823280819
    //   2470: l2i
    //   2471: ldc_w -1056902841
    //   2474: ixor
    //   2475: goto -> 2486
    //   2478: ldc2_w -1750719127
    //   2481: l2i
    //   2482: ldc_w -1900938285
    //   2485: ixor
    //   2486: ldc2_w -183800633
    //   2489: l2i
    //   2490: ldc_w -1290267282
    //   2493: ixor
    //   2494: ixor
    //   2495: lookupswitch default -> 2520, -402708208 -> 2478, 1241396131 -> 6854
    //   2520: goto -> 2524
    //   2523: athrow
    //   2524: invokevirtual isHovering : (II)Z
    //   2527: goto -> 2531
    //   2530: athrow
    //   2531: ifne -> 2545
    //   2534: ldc2_w -97695414
    //   2537: l2i
    //   2538: ldc_w -440263035
    //   2541: ixor
    //   2542: goto -> 2553
    //   2545: ldc2_w -966030546
    //   2548: l2i
    //   2549: ldc_w -645604128
    //   2552: ixor
    //   2553: ldc2_w 1508180800
    //   2556: l2i
    //   2557: ldc_w -916978597
    //   2560: ixor
    //   2561: ixor
    //   2562: tableswitch default -> 2534, -1890430764 -> 2584, -1890430763 -> 2595
    //   2584: ldc2_w 2060172233
    //   2587: l2i
    //   2588: ldc_w 1805577884
    //   2591: ixor
    //   2592: goto -> 2603
    //   2595: ldc2_w 537016872
    //   2598: l2i
    //   2599: ldc_w -1470664835
    //   2602: ixor
    //   2603: getstatic Perryc.0 : I
    //   2606: ifle -> 2620
    //   2609: ldc2_w 695712918
    //   2612: l2i
    //   2613: ldc_w 247400885
    //   2616: ixor
    //   2617: goto -> 2628
    //   2620: ldc2_w -939392430
    //   2623: l2i
    //   2624: ldc_w 1090339611
    //   2627: ixor
    //   2628: ldc2_w -1779797784
    //   2631: l2i
    //   2632: ldc_w -1253294307
    //   2635: ixor
    //   2636: ixor
    //   2637: lookupswitch default -> 6900, -1470558532 -> 2664, 124713686 -> 2620
    //   2664: goto -> 2668
    //   2667: athrow
    //   2668: invokestatic drawRect : (FFFFI)V
    //   2671: goto -> 2675
    //   2674: athrow
    //   2675: getstatic Perryc.c : I
    //   2678: iflt -> 2692
    //   2681: ldc2_w 2034248986
    //   2684: l2i
    //   2685: ldc_w 241088148
    //   2688: ixor
    //   2689: goto -> 2700
    //   2692: ldc2_w -1791356339
    //   2695: l2i
    //   2696: ldc_w -1209528735
    //   2699: ixor
    //   2700: ldc2_w -793216202
    //   2703: l2i
    //   2704: ldc_w 259670563
    //   2707: ixor
    //   2708: ixor
    //   2709: lookupswitch default -> 2736, -1461935461 -> 6940, -1131790049 -> 2692
    //   2736: aload_0
    //   2737: getstatic Perryc.c : I
    //   2740: iflt -> 2754
    //   2743: ldc2_w -1227712077
    //   2746: l2i
    //   2747: ldc_w -2041226130
    //   2750: ixor
    //   2751: goto -> 2762
    //   2754: ldc2_w -590530008
    //   2757: l2i
    //   2758: ldc_w 448015090
    //   2761: ixor
    //   2762: ldc2_w -848796559
    //   2765: l2i
    //   2766: ldc_w 1299648126
    //   2769: ixor
    //   2770: ixor
    //   2771: lookupswitch default -> 6788, -1332170798 -> 2754, 1181121237 -> 2796
    //   2796: getfield isListening : Z
    //   2799: ifeq -> 2813
    //   2802: ldc2_w -329141288
    //   2805: l2i
    //   2806: ldc_w 339960816
    //   2809: ixor
    //   2810: goto -> 2821
    //   2813: ldc2_w -487325435
    //   2816: l2i
    //   2817: ldc_w 450285868
    //   2820: ixor
    //   2821: ldc2_w -1921938327
    //   2824: l2i
    //   2825: ldc_w 979071159
    //   2828: ixor
    //   2829: ixor
    //   2830: tableswitch default -> 2802, 1325935862 -> 2852, 1325935863 -> 4234
    //   2852: getstatic Perryc.c : I
    //   2855: iflt -> 2869
    //   2858: ldc2_w -1524407580
    //   2861: l2i
    //   2862: ldc_w 160990353
    //   2865: ixor
    //   2866: goto -> 2877
    //   2869: ldc2_w -502368189
    //   2872: l2i
    //   2873: ldc_w 642213716
    //   2876: ixor
    //   2877: ldc2_w 625528090
    //   2880: l2i
    //   2881: ldc_w -57957389
    //   2884: ixor
    //   2885: ixor
    //   2886: lookupswitch default -> 6838, 495612414 -> 2912, 1970833564 -> 2869
    //   2912: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   2915: new java/lang/StringBuilder
    //   2918: dup
    //   2919: getstatic Perryc.1 : I
    //   2922: ifeq -> 2936
    //   2925: ldc2_w 831567244
    //   2928: l2i
    //   2929: ldc_w 415870282
    //   2932: ixor
    //   2933: goto -> 2944
    //   2936: ldc2_w 1748183862
    //   2939: l2i
    //   2940: ldc_w 859250798
    //   2943: ixor
    //   2944: ldc2_w 1916140335
    //   2947: l2i
    //   2948: ldc_w -2010098833
    //   2951: ixor
    //   2952: ixor
    //   2953: lookupswitch default -> 6882, -1593728232 -> 2980, -748900218 -> 2936
    //   2980: goto -> 2984
    //   2983: athrow
    //   2984: invokespecial <init> : ()V
    //   2987: goto -> 2991
    //   2990: athrow
    //   2991: getstatic Perryc.1 : I
    //   2994: ifeq -> 3008
    //   2997: ldc2_w 1238213647
    //   3000: l2i
    //   3001: ldc_w 969517806
    //   3004: ixor
    //   3005: goto -> 3016
    //   3008: ldc2_w -1019305741
    //   3011: l2i
    //   3012: ldc_w 202804500
    //   3015: ixor
    //   3016: ldc2_w -1552875240
    //   3019: l2i
    //   3020: ldc_w 440723944
    //   3023: ixor
    //   3024: ixor
    //   3025: lookupswitch default -> 3052, -919476719 -> 6860, -259333756 -> 3008
    //   3052: aload_0
    //   3053: getstatic Perryc.c : I
    //   3056: iflt -> 3070
    //   3059: ldc2_w 1052940667
    //   3062: l2i
    //   3063: ldc_w -193064410
    //   3066: ixor
    //   3067: goto -> 3078
    //   3070: ldc2_w -2047609148
    //   3073: l2i
    //   3074: ldc_w 1985430666
    //   3077: ixor
    //   3078: ldc2_w -551207696
    //   3081: l2i
    //   3082: ldc_w 1971606995
    //   3085: ixor
    //   3086: ixor
    //   3087: lookupswitch default -> 6792, 1493556077 -> 3112, 1612571262 -> 3070
    //   3112: getfield currentString : Lbigname/zprestige/webhack/features/gui/components/items/buttons/StringButton$CurrentString;
    //   3115: getstatic Perryc.c : I
    //   3118: iflt -> 3132
    //   3121: ldc2_w -223009363
    //   3124: l2i
    //   3125: ldc_w 1987301559
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w -1910694279
    //   3135: l2i
    //   3136: ldc_w 371223976
    //   3139: ixor
    //   3140: ldc2_w 1923328262
    //   3143: l2i
    //   3144: ldc_w 3580267
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 6804, -358057028 -> 3176, -162267785 -> 3132
    //   3176: goto -> 3180
    //   3179: athrow
    //   3180: invokevirtual getString : ()Ljava/lang/String;
    //   3183: goto -> 3187
    //   3186: athrow
    //   3187: getstatic Perryc.0 : I
    //   3190: ifle -> 3204
    //   3193: ldc2_w -1276975199
    //   3196: l2i
    //   3197: ldc_w -1784991531
    //   3200: ixor
    //   3201: goto -> 3212
    //   3204: ldc2_w 49618729
    //   3207: l2i
    //   3208: ldc_w 1589443437
    //   3211: ixor
    //   3212: ldc2_w -170822810
    //   3215: l2i
    //   3216: ldc_w 1803964128
    //   3219: ixor
    //   3220: ixor
    //   3221: lookupswitch default -> 6890, -1204884750 -> 3204, -1038165566 -> 3248
    //   3248: goto -> 3252
    //   3251: athrow
    //   3252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3255: goto -> 3259
    //   3258: athrow
    //   3259: getstatic Perryc.c : I
    //   3262: iflt -> 3276
    //   3265: ldc2_w 123848594
    //   3268: l2i
    //   3269: ldc_w -332302162
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w 915490657
    //   3279: l2i
    //   3280: ldc_w 1306379569
    //   3283: ixor
    //   3284: ldc2_w -1842248948
    //   3287: l2i
    //   3288: ldc_w -514651601
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 3320, -1741539809 -> 6818, -1021191972 -> 3276
    //   3320: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   3323: getstatic Perryc.c : I
    //   3326: iflt -> 3340
    //   3329: ldc2_w -636117085
    //   3332: l2i
    //   3333: ldc_w -288508189
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w 936510229
    //   3343: l2i
    //   3344: ldc_w -70594162
    //   3347: ixor
    //   3348: ldc2_w 1201394432
    //   3351: l2i
    //   3352: ldc_w 1747307465
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 3384, -40237135 -> 3340, 459682185 -> 6794
    //   3384: goto -> 3388
    //   3387: athrow
    //   3388: invokevirtual getIdleSign : ()Ljava/lang/String;
    //   3391: goto -> 3395
    //   3394: athrow
    //   3395: getstatic Perryc.0 : I
    //   3398: ifle -> 3412
    //   3401: ldc2_w 1418175112
    //   3404: l2i
    //   3405: ldc_w -875221213
    //   3408: ixor
    //   3409: goto -> 3420
    //   3412: ldc2_w 425438185
    //   3415: l2i
    //   3416: ldc_w -832410109
    //   3419: ixor
    //   3420: ldc2_w -448779558
    //   3423: l2i
    //   3424: ldc_w 1899490794
    //   3427: ixor
    //   3428: ixor
    //   3429: lookupswitch default -> 3456, 186993307 -> 6870, 1620850467 -> 3412
    //   3456: goto -> 3460
    //   3459: athrow
    //   3460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3463: goto -> 3467
    //   3466: athrow
    //   3467: getstatic Perryc.1 : I
    //   3470: ifeq -> 3484
    //   3473: ldc2_w 1640916525
    //   3476: l2i
    //   3477: ldc_w -538808040
    //   3480: ixor
    //   3481: goto -> 3492
    //   3484: ldc2_w 1803902863
    //   3487: l2i
    //   3488: ldc_w -720642279
    //   3491: ixor
    //   3492: ldc2_w 1966564297
    //   3495: l2i
    //   3496: ldc_w -686712706
    //   3499: ixor
    //   3500: ixor
    //   3501: lookupswitch default -> 3528, 470477954 -> 6964, 724346277 -> 3484
    //   3528: goto -> 3532
    //   3531: athrow
    //   3532: invokevirtual toString : ()Ljava/lang/String;
    //   3535: goto -> 3539
    //   3538: athrow
    //   3539: getstatic Perryc.1 : I
    //   3542: ifeq -> 3556
    //   3545: ldc2_w 1165313191
    //   3548: l2i
    //   3549: ldc_w -663901458
    //   3552: ixor
    //   3553: goto -> 3564
    //   3556: ldc2_w 1794937877
    //   3559: l2i
    //   3560: ldc_w -230736009
    //   3563: ixor
    //   3564: ldc2_w -532085669
    //   3567: l2i
    //   3568: ldc_w 1518505075
    //   3571: ixor
    //   3572: ixor
    //   3573: lookupswitch default -> 6928, 570958666 -> 3600, 668165729 -> 3556
    //   3600: aload_0
    //   3601: getstatic Perryc.0 : I
    //   3604: ifle -> 3618
    //   3607: ldc2_w -1051871326
    //   3610: l2i
    //   3611: ldc_w 590040476
    //   3614: ixor
    //   3615: goto -> 3626
    //   3618: ldc2_w 200325214
    //   3621: l2i
    //   3622: ldc_w 1282067525
    //   3625: ixor
    //   3626: ldc2_w 784975588
    //   3629: l2i
    //   3630: ldc_w 2098707344
    //   3633: ixor
    //   3634: ixor
    //   3635: lookupswitch default -> 6810, -1313306806 -> 3618, 340003183 -> 3660
    //   3660: getfield x : F
    //   3663: ldc_w 0.12660366
    //   3666: invokestatic floatToIntBits : (F)I
    //   3669: ldc_w 2115147607
    //   3672: ixor
    //   3673: invokestatic intBitsToFloat : (I)F
    //   3676: fadd
    //   3677: getstatic Perryc.0 : I
    //   3680: ifle -> 3694
    //   3683: ldc2_w 1937849095
    //   3686: l2i
    //   3687: ldc_w -1230772350
    //   3690: ixor
    //   3691: goto -> 3702
    //   3694: ldc2_w 1209963634
    //   3697: l2i
    //   3698: ldc_w 1704086933
    //   3701: ixor
    //   3702: ldc2_w 1845313856
    //   3705: l2i
    //   3706: ldc_w 1547218441
    //   3709: ixor
    //   3710: ixor
    //   3711: lookupswitch default -> 6918, -186174516 -> 3694, 474560174 -> 3736
    //   3736: aload_0
    //   3737: getstatic Perryc.0 : I
    //   3740: ifle -> 3754
    //   3743: ldc2_w 1787248519
    //   3746: l2i
    //   3747: ldc_w -227530721
    //   3750: ixor
    //   3751: goto -> 3762
    //   3754: ldc2_w -635577277
    //   3757: l2i
    //   3758: ldc_w 379883876
    //   3761: ixor
    //   3762: ldc2_w -832664957
    //   3765: l2i
    //   3766: ldc_w 1113688168
    //   3769: ixor
    //   3770: ixor
    //   3771: lookupswitch default -> 6910, 348657011 -> 3754, 1082544076 -> 3796
    //   3796: getfield y : F
    //   3799: ldc_w 4.435586
    //   3802: invokestatic floatToIntBits : (F)I
    //   3805: ldc_w 2136238536
    //   3808: ixor
    //   3809: invokestatic intBitsToFloat : (I)F
    //   3812: fsub
    //   3813: getstatic Perryc.c : I
    //   3816: iflt -> 3830
    //   3819: ldc2_w 1380988975
    //   3822: l2i
    //   3823: ldc_w -9900683
    //   3826: ixor
    //   3827: goto -> 3838
    //   3830: ldc2_w -1077722921
    //   3833: l2i
    //   3834: ldc_w 1518318712
    //   3837: ixor
    //   3838: ldc2_w -721538069
    //   3841: l2i
    //   3842: ldc_w -1502713105
    //   3845: ixor
    //   3846: ixor
    //   3847: lookupswitch default -> 3872, -542602146 -> 6912, -285392809 -> 3830
    //   3872: goto -> 3876
    //   3875: athrow
    //   3876: invokestatic getClickGui : ()Lbigname/zprestige/webhack/features/gui/OyVeyGui;
    //   3879: goto -> 3883
    //   3882: athrow
    //   3883: getstatic Perryc.1 : I
    //   3886: ifeq -> 3900
    //   3889: ldc2_w 462727154
    //   3892: l2i
    //   3893: ldc_w 1562102455
    //   3896: ixor
    //   3897: goto -> 3908
    //   3900: ldc2_w -2023933407
    //   3903: l2i
    //   3904: ldc_w -1152444013
    //   3907: ixor
    //   3908: ldc2_w 1601331364
    //   3911: l2i
    //   3912: ldc_w 1796614750
    //   3915: ixor
    //   3916: ixor
    //   3917: lookupswitch default -> 3944, -824645625 -> 3900, 1928013759 -> 6886
    //   3944: goto -> 3948
    //   3947: athrow
    //   3948: invokevirtual getTextOffset : ()I
    //   3951: goto -> 3955
    //   3954: athrow
    //   3955: i2f
    //   3956: fsub
    //   3957: getstatic Perryc.0 : I
    //   3960: ifle -> 3974
    //   3963: ldc2_w -1711679403
    //   3966: l2i
    //   3967: ldc_w 1582658934
    //   3970: ixor
    //   3971: goto -> 3982
    //   3974: ldc2_w 1960537946
    //   3977: l2i
    //   3978: ldc_w -1676920316
    //   3981: ixor
    //   3982: ldc2_w 1956684566
    //   3985: l2i
    //   3986: ldc_w 1904999602
    //   3989: ixor
    //   3990: ixor
    //   3991: lookupswitch default -> 4016, -1031277945 -> 6970, -390171552 -> 3974
    //   4016: aload_0
    //   4017: getstatic Perryc.c : I
    //   4020: iflt -> 4034
    //   4023: ldc2_w -49900709
    //   4026: l2i
    //   4027: ldc_w -624696292
    //   4030: ixor
    //   4031: goto -> 4042
    //   4034: ldc2_w 248333399
    //   4037: l2i
    //   4038: ldc_w -873804038
    //   4041: ixor
    //   4042: ldc2_w 1960664334
    //   4045: l2i
    //   4046: ldc_w 1141506547
    //   4049: ixor
    //   4050: ixor
    //   4051: lookupswitch default -> 4076, 114626329 -> 4034, 387066810 -> 6966
    //   4076: goto -> 4080
    //   4079: athrow
    //   4080: invokevirtual getState : ()Z
    //   4083: goto -> 4087
    //   4086: athrow
    //   4087: ifeq -> 4101
    //   4090: ldc2_w 2145807780
    //   4093: l2i
    //   4094: ldc_w 1547210741
    //   4097: ixor
    //   4098: goto -> 4109
    //   4101: ldc2_w 1647828256
    //   4104: l2i
    //   4105: ldc_w 1105805168
    //   4108: ixor
    //   4109: ldc2_w -326131573
    //   4112: l2i
    //   4113: ldc_w -1848835084
    //   4116: ixor
    //   4117: ixor
    //   4118: tableswitch default -> 4090, 1587298606 -> 4140, 1587298607 -> 4151
    //   4140: ldc2_w 600389429
    //   4143: l2i
    //   4144: ldc_w -600389430
    //   4147: ixor
    //   4148: goto -> 4159
    //   4151: ldc2_w 1656640538
    //   4154: l2i
    //   4155: ldc_w -1659568464
    //   4158: ixor
    //   4159: getstatic Perryc.c : I
    //   4162: iflt -> 4176
    //   4165: ldc2_w -622426028
    //   4168: l2i
    //   4169: ldc_w -138228983
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w -782888835
    //   4179: l2i
    //   4180: ldc_w 605045292
    //   4183: ixor
    //   4184: ldc2_w -1394945915
    //   4187: l2i
    //   4188: ldc_w -1331836834
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4220, -954188427 -> 4176, 828595078 -> 6938
    //   4220: goto -> 4224
    //   4223: athrow
    //   4224: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   4227: goto -> 4231
    //   4230: athrow
    //   4231: goto -> 6787
    //   4234: getstatic Perryc.c : I
    //   4237: iflt -> 4251
    //   4240: ldc2_w -1759916098
    //   4243: l2i
    //   4244: ldc_w 1996579351
    //   4247: ixor
    //   4248: goto -> 4259
    //   4251: ldc2_w 1099304175
    //   4254: l2i
    //   4255: ldc_w 631590955
    //   4258: ixor
    //   4259: ldc2_w -2003172091
    //   4262: l2i
    //   4263: ldc_w -1912349471
    //   4266: ixor
    //   4267: ixor
    //   4268: lookupswitch default -> 6878, -427723699 -> 4251, 1656390944 -> 4296
    //   4296: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   4299: new java/lang/StringBuilder
    //   4302: dup
    //   4303: getstatic Perryc.1 : I
    //   4306: ifeq -> 4320
    //   4309: ldc2_w 1048511282
    //   4312: l2i
    //   4313: ldc_w -476792082
    //   4316: ixor
    //   4317: goto -> 4328
    //   4320: ldc2_w 311690390
    //   4323: l2i
    //   4324: ldc_w 1918989526
    //   4327: ixor
    //   4328: ldc2_w -587150738
    //   4331: l2i
    //   4332: ldc_w -1000772463
    //   4335: ixor
    //   4336: ixor
    //   4337: lookupswitch default -> 4364, -994959581 -> 6846, -517654295 -> 4320
    //   4364: goto -> 4368
    //   4367: athrow
    //   4368: invokespecial <init> : ()V
    //   4371: goto -> 4375
    //   4374: athrow
    //   4375: getstatic Perryc.0 : I
    //   4378: ifle -> 4392
    //   4381: ldc2_w -154634931
    //   4384: l2i
    //   4385: ldc_w 1060329199
    //   4388: ixor
    //   4389: goto -> 4400
    //   4392: ldc2_w -1594340901
    //   4395: l2i
    //   4396: ldc_w -1951753128
    //   4399: ixor
    //   4400: ldc2_w -1467751426
    //   4403: l2i
    //   4404: ldc_w 34870685
    //   4407: ixor
    //   4408: ixor
    //   4409: lookupswitch default -> 6840, -2117786656 -> 4436, 1668076993 -> 4392
    //   4436: aload_0
    //   4437: getstatic Perryc.1 : I
    //   4440: ifeq -> 4454
    //   4443: ldc2_w -2046334161
    //   4446: l2i
    //   4447: ldc_w 123796548
    //   4450: ixor
    //   4451: goto -> 4462
    //   4454: ldc2_w 2008071517
    //   4457: l2i
    //   4458: ldc_w -1768707296
    //   4461: ixor
    //   4462: ldc2_w -1409179184
    //   4465: l2i
    //   4466: ldc_w 665965611
    //   4469: ixor
    //   4470: ixor
    //   4471: lookupswitch default -> 6888, 181920400 -> 4454, 1788044166 -> 4496
    //   4496: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4499: getstatic Perryc.0 : I
    //   4502: ifle -> 4516
    //   4505: ldc2_w -1223898389
    //   4508: l2i
    //   4509: ldc_w 1498041352
    //   4512: ixor
    //   4513: goto -> 4524
    //   4516: ldc2_w -766700306
    //   4519: l2i
    //   4520: ldc_w 1031178885
    //   4523: ixor
    //   4524: ldc2_w 1924396087
    //   4527: l2i
    //   4528: ldc_w 1358742052
    //   4531: ixor
    //   4532: ixor
    //   4533: lookupswitch default -> 6894, -871780112 -> 4516, -847992712 -> 4560
    //   4560: goto -> 4564
    //   4563: athrow
    //   4564: invokevirtual getName : ()Ljava/lang/String;
    //   4567: goto -> 4571
    //   4570: athrow
    //   4571: ldc_w '䋃㌆䊧?걓๪'
    //   4574: getstatic Perryc.1 : I
    //   4577: ifeq -> 4591
    //   4580: ldc2_w 968852984
    //   4583: l2i
    //   4584: ldc_w -99911169
    //   4587: ixor
    //   4588: goto -> 4599
    //   4591: ldc2_w 1198613779
    //   4594: l2i
    //   4595: ldc_w 1239907209
    //   4598: ixor
    //   4599: ldc2_w -1025330294
    //   4602: l2i
    //   4603: ldc_w -1787471746
    //   4606: ixor
    //   4607: ixor
    //   4608: lookupswitch default -> 4636, -1809639437 -> 6812, -976345271 -> 4591
    //   4636: goto -> 4640
    //   4639: athrow
    //   4640: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4643: goto -> 4647
    //   4646: athrow
    //   4647: getstatic Perryc.0 : I
    //   4650: ifle -> 4664
    //   4653: ldc2_w -1662591815
    //   4656: l2i
    //   4657: ldc_w 332587435
    //   4660: ixor
    //   4661: goto -> 4672
    //   4664: ldc2_w 1844719053
    //   4667: l2i
    //   4668: ldc_w 1817153478
    //   4671: ixor
    //   4672: ldc2_w -1493978713
    //   4675: l2i
    //   4676: ldc_w -1919643732
    //   4679: ixor
    //   4680: ixor
    //   4681: lookupswitch default -> 4708, -1538063591 -> 6836, 1067800465 -> 4664
    //   4708: goto -> 4712
    //   4711: athrow
    //   4712: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4715: goto -> 4719
    //   4718: athrow
    //   4719: ifeq -> 4733
    //   4722: ldc2_w 829962351
    //   4725: l2i
    //   4726: ldc_w 2013155975
    //   4729: ixor
    //   4730: goto -> 4741
    //   4733: ldc2_w -1160815713
    //   4736: l2i
    //   4737: ldc_w -62312074
    //   4740: ixor
    //   4741: ldc2_w -898864311
    //   4744: l2i
    //   4745: ldc_w -582080245
    //   4748: ixor
    //   4749: ixor
    //   4750: tableswitch default -> 4722, 1369712810 -> 4772, 1369712811 -> 4850
    //   4772: ldc_w '䋃㌆䊧?걓๪㼴'
    //   4775: getstatic Perryc.1 : I
    //   4778: ifeq -> 4792
    //   4781: ldc2_w -579236270
    //   4784: l2i
    //   4785: ldc_w 1114817076
    //   4788: ixor
    //   4789: goto -> 4800
    //   4792: ldc2_w -273450309
    //   4795: l2i
    //   4796: ldc_w -1032797669
    //   4799: ixor
    //   4800: ldc2_w -773513274
    //   4803: l2i
    //   4804: ldc_w -2100950050
    //   4807: ixor
    //   4808: ixor
    //   4809: lookupswitch default -> 4836, -869771138 -> 6946, 1299992692 -> 4792
    //   4836: goto -> 4840
    //   4839: athrow
    //   4840: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4843: goto -> 4847
    //   4846: athrow
    //   4847: goto -> 5684
    //   4850: getstatic Perryc.1 : I
    //   4853: ifeq -> 4867
    //   4856: ldc2_w -6246513
    //   4859: l2i
    //   4860: ldc_w -1910492180
    //   4863: ixor
    //   4864: goto -> 4875
    //   4867: ldc2_w -1471504371
    //   4870: l2i
    //   4871: ldc_w -1236854257
    //   4874: ixor
    //   4875: ldc2_w -693186802
    //   4878: l2i
    //   4879: ldc_w 173885518
    //   4882: ixor
    //   4883: ixor
    //   4884: lookupswitch default -> 6896, -1384965341 -> 4867, -1023525566 -> 4912
    //   4912: aload_0
    //   4913: getstatic Perryc.0 : I
    //   4916: ifle -> 4930
    //   4919: ldc2_w 1787955
    //   4922: l2i
    //   4923: ldc_w 1234143612
    //   4926: ixor
    //   4927: goto -> 4938
    //   4930: ldc2_w 1451663476
    //   4933: l2i
    //   4934: ldc_w -1895999950
    //   4937: ixor
    //   4938: ldc2_w 1919460974
    //   4941: l2i
    //   4942: ldc_w 132948395
    //   4945: ixor
    //   4946: ixor
    //   4947: lookupswitch default -> 6796, -1375735421 -> 4972, 1007732362 -> 4930
    //   4972: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4975: getstatic Perryc.0 : I
    //   4978: ifle -> 4992
    //   4981: ldc2_w 771451984
    //   4984: l2i
    //   4985: ldc_w -1449795870
    //   4988: ixor
    //   4989: goto -> 5000
    //   4992: ldc2_w 1113704663
    //   4995: l2i
    //   4996: ldc_w 1992904139
    //   4999: ixor
    //   5000: ldc2_w -2134651071
    //   5003: l2i
    //   5004: ldc_w 1970647860
    //   5007: ixor
    //   5008: ixor
    //   5009: lookupswitch default -> 6876, -1054934679 -> 5036, 1910034119 -> 4992
    //   5036: goto -> 5040
    //   5039: athrow
    //   5040: invokevirtual getName : ()Ljava/lang/String;
    //   5043: goto -> 5047
    //   5046: athrow
    //   5047: ldc_w '䋑㌁䊶?걅'
    //   5050: getstatic Perryc.c : I
    //   5053: iflt -> 5067
    //   5056: ldc2_w -2112949050
    //   5059: l2i
    //   5060: ldc_w -254204390
    //   5063: ixor
    //   5064: goto -> 5075
    //   5067: ldc2_w -11845378
    //   5070: l2i
    //   5071: ldc_w -1978240170
    //   5074: ixor
    //   5075: ldc2_w -2089166607
    //   5078: l2i
    //   5079: ldc_w -133143049
    //   5082: ixor
    //   5083: ixor
    //   5084: lookupswitch default -> 5112, 163475418 -> 6842, 1536384504 -> 5067
    //   5112: goto -> 5116
    //   5115: athrow
    //   5116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5119: goto -> 5123
    //   5122: athrow
    //   5123: getstatic Perryc.0 : I
    //   5126: ifle -> 5140
    //   5129: ldc2_w -1546355401
    //   5132: l2i
    //   5133: ldc_w 715806535
    //   5136: ixor
    //   5137: goto -> 5148
    //   5140: ldc2_w 253832525
    //   5143: l2i
    //   5144: ldc_w -852621798
    //   5147: ixor
    //   5148: ldc2_w -2124960087
    //   5151: l2i
    //   5152: ldc_w 1250176571
    //   5155: ixor
    //   5156: ixor
    //   5157: lookupswitch default -> 5184, -49979918 -> 5140, 1118677730 -> 6864
    //   5184: goto -> 5188
    //   5187: athrow
    //   5188: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5191: goto -> 5195
    //   5194: athrow
    //   5195: ifeq -> 5209
    //   5198: ldc2_w -1293069065
    //   5201: l2i
    //   5202: ldc_w 1567193407
    //   5205: ixor
    //   5206: goto -> 5217
    //   5209: ldc2_w -2122838552
    //   5212: l2i
    //   5213: ldc_w 1862017057
    //   5216: ixor
    //   5217: ldc2_w 1790197263
    //   5220: l2i
    //   5221: ldc_w -1426954609
    //   5224: ixor
    //   5225: ixor
    //   5226: tableswitch default -> 5198, 801273160 -> 5248, 801273161 -> 5682
    //   5248: new java/lang/StringBuilder
    //   5251: dup
    //   5252: getstatic Perryc.1 : I
    //   5255: ifeq -> 5269
    //   5258: ldc2_w -1528399600
    //   5261: l2i
    //   5262: ldc_w 1668608612
    //   5265: ixor
    //   5266: goto -> 5277
    //   5269: ldc2_w 845093261
    //   5272: l2i
    //   5273: ldc_w 1924110126
    //   5276: ixor
    //   5277: ldc2_w 1630960474
    //   5280: l2i
    //   5281: ldc_w 2007158457
    //   5284: ixor
    //   5285: ixor
    //   5286: lookupswitch default -> 6798, -788119913 -> 5269, 1449409344 -> 5312
    //   5312: goto -> 5316
    //   5315: athrow
    //   5316: invokespecial <init> : ()V
    //   5319: goto -> 5323
    //   5322: athrow
    //   5323: ldc_w '䋑㌁䊶?걅ู㼴'
    //   5326: getstatic Perryc.1 : I
    //   5329: ifeq -> 5343
    //   5332: ldc2_w 276006321
    //   5335: l2i
    //   5336: ldc_w -1146619473
    //   5339: ixor
    //   5340: goto -> 5351
    //   5343: ldc2_w -1839170522
    //   5346: l2i
    //   5347: ldc_w 244228296
    //   5350: ixor
    //   5351: ldc2_w 618985337
    //   5354: l2i
    //   5355: ldc_w 1453577777
    //   5358: ixor
    //   5359: ixor
    //   5360: lookupswitch default -> 5388, -806545669 -> 5343, -644653738 -> 6850
    //   5388: goto -> 5392
    //   5391: athrow
    //   5392: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5395: goto -> 5399
    //   5398: athrow
    //   5399: getstatic Perryc.0 : I
    //   5402: ifle -> 5416
    //   5405: ldc2_w -553440039
    //   5408: l2i
    //   5409: ldc_w 954056583
    //   5412: ixor
    //   5413: goto -> 5424
    //   5416: ldc2_w 146835706
    //   5419: l2i
    //   5420: ldc_w -2047724786
    //   5423: ixor
    //   5424: ldc2_w -905261519
    //   5427: l2i
    //   5428: ldc_w -1399718435
    //   5431: ixor
    //   5432: ixor
    //   5433: lookupswitch default -> 6828, -2126143310 -> 5416, -341211112 -> 5460
    //   5460: goto -> 5464
    //   5463: athrow
    //   5464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5467: goto -> 5471
    //   5470: athrow
    //   5471: getstatic Perryc.0 : I
    //   5474: ifle -> 5488
    //   5477: ldc2_w 126928574
    //   5480: l2i
    //   5481: ldc_w -318757740
    //   5484: ixor
    //   5485: goto -> 5496
    //   5488: ldc2_w -23762588
    //   5491: l2i
    //   5492: ldc_w 1901795448
    //   5495: ixor
    //   5496: ldc2_w 1504442616
    //   5499: l2i
    //   5500: ldc_w -1171830184
    //   5503: ixor
    //   5504: ixor
    //   5505: lookupswitch default -> 6820, 152850570 -> 5488, 1816314812 -> 5532
    //   5532: getstatic com/mojang/realmsclient/gui/ChatFormatting.GRAY : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   5535: getstatic Perryc.1 : I
    //   5538: ifeq -> 5552
    //   5541: ldc2_w 1657768830
    //   5544: l2i
    //   5545: ldc_w 1882722460
    //   5548: ixor
    //   5549: goto -> 5560
    //   5552: ldc2_w -369688276
    //   5555: l2i
    //   5556: ldc_w 2045287120
    //   5559: ixor
    //   5560: ldc2_w 520020380
    //   5563: l2i
    //   5564: ldc_w -1530133966
    //   5567: ixor
    //   5568: ixor
    //   5569: lookupswitch default -> 6806, -1463453620 -> 5552, 707622994 -> 5596
    //   5596: goto -> 5600
    //   5599: athrow
    //   5600: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5603: goto -> 5607
    //   5606: athrow
    //   5607: getstatic Perryc.0 : I
    //   5610: ifle -> 5624
    //   5613: ldc2_w 818463368
    //   5616: l2i
    //   5617: ldc_w -960364847
    //   5620: ixor
    //   5621: goto -> 5632
    //   5624: ldc2_w 1841711369
    //   5627: l2i
    //   5628: ldc_w -2129337724
    //   5631: ixor
    //   5632: ldc2_w 1630257299
    //   5635: l2i
    //   5636: ldc_w -1749621701
    //   5639: ixor
    //   5640: ixor
    //   5641: lookupswitch default -> 5668, -1127424719 -> 5624, 9705713 -> 6906
    //   5668: goto -> 5672
    //   5671: athrow
    //   5672: invokevirtual toString : ()Ljava/lang/String;
    //   5675: goto -> 5679
    //   5678: athrow
    //   5679: goto -> 5684
    //   5682: ldc ''
    //   5684: getstatic Perryc.0 : I
    //   5687: ifle -> 5701
    //   5690: ldc2_w 1466331710
    //   5693: l2i
    //   5694: ldc_w 124575714
    //   5697: ixor
    //   5698: goto -> 5709
    //   5701: ldc2_w -1079285442
    //   5704: l2i
    //   5705: ldc_w -683539872
    //   5708: ixor
    //   5709: ldc2_w 963525559
    //   5712: l2i
    //   5713: ldc_w -1066655603
    //   5716: ixor
    //   5717: ixor
    //   5718: lookupswitch default -> 6826, -1846841244 -> 5744, -1459046682 -> 5701
    //   5744: goto -> 5748
    //   5747: athrow
    //   5748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5751: goto -> 5755
    //   5754: athrow
    //   5755: getstatic Perryc.c : I
    //   5758: iflt -> 5772
    //   5761: ldc2_w 1746183884
    //   5764: l2i
    //   5765: ldc_w -857274149
    //   5768: ixor
    //   5769: goto -> 5780
    //   5772: ldc2_w -1502025696
    //   5775: l2i
    //   5776: ldc_w 1789325572
    //   5779: ixor
    //   5780: ldc2_w 248621484
    //   5783: l2i
    //   5784: ldc_w 1117390767
    //   5787: ixor
    //   5788: ixor
    //   5789: lookupswitch default -> 6902, -2137671897 -> 5816, -390594540 -> 5772
    //   5816: aload_0
    //   5817: getstatic Perryc.0 : I
    //   5820: ifle -> 5834
    //   5823: ldc2_w -594474127
    //   5826: l2i
    //   5827: ldc_w -533687383
    //   5830: ixor
    //   5831: goto -> 5842
    //   5834: ldc2_w 2146739529
    //   5837: l2i
    //   5838: ldc_w -530966802
    //   5841: ixor
    //   5842: ldc2_w -916465172
    //   5845: l2i
    //   5846: ldc_w -750353117
    //   5849: ixor
    //   5850: ixor
    //   5851: lookupswitch default -> 5876, 649643031 -> 6914, 1056424273 -> 5834
    //   5876: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5879: getstatic Perryc.c : I
    //   5882: iflt -> 5896
    //   5885: ldc2_w -571921868
    //   5888: l2i
    //   5889: ldc_w -1217831303
    //   5892: ixor
    //   5893: goto -> 5904
    //   5896: ldc2_w 1998012150
    //   5899: l2i
    //   5900: ldc_w 2087743576
    //   5903: ixor
    //   5904: ldc2_w 905323995
    //   5907: l2i
    //   5908: ldc_w 1239989234
    //   5911: ixor
    //   5912: ixor
    //   5913: lookupswitch default -> 6814, 379513444 -> 5896, 2004471943 -> 5940
    //   5940: goto -> 5944
    //   5943: athrow
    //   5944: invokevirtual getValue : ()Ljava/lang/Object;
    //   5947: goto -> 5951
    //   5950: athrow
    //   5951: getstatic Perryc.0 : I
    //   5954: ifle -> 5968
    //   5957: ldc2_w 1514955614
    //   5960: l2i
    //   5961: ldc_w -411626297
    //   5964: ixor
    //   5965: goto -> 5976
    //   5968: ldc2_w -380189472
    //   5971: l2i
    //   5972: ldc_w 1518676956
    //   5975: ixor
    //   5976: ldc2_w 1964592785
    //   5979: l2i
    //   5980: ldc_w -553118986
    //   5983: ixor
    //   5984: ixor
    //   5985: lookupswitch default -> 6856, 388639742 -> 5968, 432190299 -> 6012
    //   6012: goto -> 6016
    //   6015: athrow
    //   6016: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6019: goto -> 6023
    //   6022: athrow
    //   6023: getstatic Perryc.c : I
    //   6026: iflt -> 6040
    //   6029: ldc2_w 1862754128
    //   6032: l2i
    //   6033: ldc_w -115148822
    //   6036: ixor
    //   6037: goto -> 6048
    //   6040: ldc2_w -1602137679
    //   6043: l2i
    //   6044: ldc_w -1772295861
    //   6047: ixor
    //   6048: ldc2_w 1544806233
    //   6051: l2i
    //   6052: ldc_w -1785023286
    //   6055: ixor
    //   6056: ixor
    //   6057: lookupswitch default -> 6084, 1605157673 -> 6866, 1838359654 -> 6040
    //   6084: goto -> 6088
    //   6087: athrow
    //   6088: invokevirtual toString : ()Ljava/lang/String;
    //   6091: goto -> 6095
    //   6094: athrow
    //   6095: getstatic Perryc.0 : I
    //   6098: ifle -> 6112
    //   6101: ldc2_w -1726070930
    //   6104: l2i
    //   6105: ldc_w 1038787726
    //   6108: ixor
    //   6109: goto -> 6120
    //   6112: ldc2_w 783410428
    //   6115: l2i
    //   6116: ldc_w -2079860765
    //   6119: ixor
    //   6120: ldc2_w 303133162
    //   6123: l2i
    //   6124: ldc_w -128716631
    //   6127: ixor
    //   6128: ixor
    //   6129: lookupswitch default -> 6934, 1089778268 -> 6156, 1320557219 -> 6112
    //   6156: aload_0
    //   6157: getstatic Perryc.c : I
    //   6160: iflt -> 6174
    //   6163: ldc2_w 2009793620
    //   6166: l2i
    //   6167: ldc_w 102886643
    //   6170: ixor
    //   6171: goto -> 6182
    //   6174: ldc2_w -308646554
    //   6177: l2i
    //   6178: ldc_w 2080221146
    //   6181: ixor
    //   6182: ldc2_w -47647984
    //   6185: l2i
    //   6186: ldc_w 801625949
    //   6189: ixor
    //   6190: ixor
    //   6191: lookupswitch default -> 6942, -1559900950 -> 6174, 1149824753 -> 6216
    //   6216: getfield x : F
    //   6219: ldc_w 0.8613309
    //   6222: invokestatic floatToIntBits : (F)I
    //   6225: ldc_w 2135929628
    //   6228: ixor
    //   6229: invokestatic intBitsToFloat : (I)F
    //   6232: fadd
    //   6233: getstatic Perryc.c : I
    //   6236: iflt -> 6250
    //   6239: ldc2_w -1326351935
    //   6242: l2i
    //   6243: ldc_w 294333524
    //   6246: ixor
    //   6247: goto -> 6258
    //   6250: ldc2_w 950833874
    //   6253: l2i
    //   6254: ldc_w -262950993
    //   6257: ixor
    //   6258: ldc2_w -131217788
    //   6261: l2i
    //   6262: ldc_w -862031237
    //   6265: ixor
    //   6266: ixor
    //   6267: lookupswitch default -> 6904, -1781931670 -> 6250, -62092926 -> 6292
    //   6292: aload_0
    //   6293: getstatic Perryc.0 : I
    //   6296: ifle -> 6310
    //   6299: ldc2_w -261759678
    //   6302: l2i
    //   6303: ldc_w 40444407
    //   6306: ixor
    //   6307: goto -> 6318
    //   6310: ldc2_w -1112688283
    //   6313: l2i
    //   6314: ldc_w 1534206759
    //   6317: ixor
    //   6318: ldc2_w -430908784
    //   6321: l2i
    //   6322: ldc_w -355677839
    //   6325: ixor
    //   6326: ixor
    //   6327: lookupswitch default -> 6858, -364672605 -> 6352, -24055980 -> 6310
    //   6352: getfield y : F
    //   6355: ldc_w 30.956644
    //   6358: invokestatic floatToIntBits : (F)I
    //   6361: ldc_w 2116959919
    //   6364: ixor
    //   6365: invokestatic intBitsToFloat : (I)F
    //   6368: fsub
    //   6369: getstatic Perryc.0 : I
    //   6372: ifle -> 6386
    //   6375: ldc2_w 565660348
    //   6378: l2i
    //   6379: ldc_w 1121613367
    //   6382: ixor
    //   6383: goto -> 6394
    //   6386: ldc2_w -1004436952
    //   6389: l2i
    //   6390: ldc_w 1158127322
    //   6393: ixor
    //   6394: ldc2_w -1907151487
    //   6397: l2i
    //   6398: ldc_w 2113379873
    //   6401: ixor
    //   6402: ixor
    //   6403: lookupswitch default -> 6428, -1865838805 -> 6830, 1223034595 -> 6386
    //   6428: goto -> 6432
    //   6431: athrow
    //   6432: invokestatic getClickGui : ()Lbigname/zprestige/webhack/features/gui/OyVeyGui;
    //   6435: goto -> 6439
    //   6438: athrow
    //   6439: getstatic Perryc.c : I
    //   6442: iflt -> 6456
    //   6445: ldc2_w 99558164
    //   6448: l2i
    //   6449: ldc_w 1764096281
    //   6452: ixor
    //   6453: goto -> 6464
    //   6456: ldc2_w -431621324
    //   6459: l2i
    //   6460: ldc_w 725890819
    //   6463: ixor
    //   6464: ldc2_w 1770338739
    //   6467: l2i
    //   6468: ldc_w -2074606172
    //   6471: ixor
    //   6472: ixor
    //   6473: lookupswitch default -> 6500, -2129140198 -> 6862, 374427557 -> 6456
    //   6500: goto -> 6504
    //   6503: athrow
    //   6504: invokevirtual getTextOffset : ()I
    //   6507: goto -> 6511
    //   6510: athrow
    //   6511: i2f
    //   6512: fsub
    //   6513: getstatic Perryc.0 : I
    //   6516: ifle -> 6530
    //   6519: ldc2_w 338493779
    //   6522: l2i
    //   6523: ldc_w 220825055
    //   6526: ixor
    //   6527: goto -> 6538
    //   6530: ldc2_w 848917821
    //   6533: l2i
    //   6534: ldc_w -1222653561
    //   6537: ixor
    //   6538: ldc2_w 1730959267
    //   6541: l2i
    //   6542: ldc_w 810760952
    //   6545: ixor
    //   6546: ixor
    //   6547: lookupswitch default -> 6884, -755379743 -> 6572, 1316743639 -> 6530
    //   6572: aload_0
    //   6573: getstatic Perryc.c : I
    //   6576: iflt -> 6590
    //   6579: ldc2_w 1875189683
    //   6582: l2i
    //   6583: ldc_w -723838739
    //   6586: ixor
    //   6587: goto -> 6598
    //   6590: ldc2_w 1762763718
    //   6593: l2i
    //   6594: ldc_w 165177638
    //   6597: ixor
    //   6598: ldc2_w 1853424320
    //   6601: l2i
    //   6602: ldc_w -1716129300
    //   6605: ixor
    //   6606: ixor
    //   6607: lookupswitch default -> 6922, -1761265204 -> 6632, 1288893554 -> 6590
    //   6632: goto -> 6636
    //   6635: athrow
    //   6636: invokevirtual getState : ()Z
    //   6639: goto -> 6643
    //   6642: athrow
    //   6643: ifeq -> 6657
    //   6646: ldc2_w 35806242
    //   6649: l2i
    //   6650: ldc_w -2136891635
    //   6653: ixor
    //   6654: goto -> 6665
    //   6657: ldc2_w 1002217252
    //   6660: l2i
    //   6661: ldc_w -1187030006
    //   6664: ixor
    //   6665: ldc2_w 442473461
    //   6668: l2i
    //   6669: ldc_w 1374856126
    //   6672: ixor
    //   6673: ixor
    //   6674: tableswitch default -> 6646, -919667868 -> 6696, -919667867 -> 6707
    //   6696: ldc2_w 1445715202
    //   6699: l2i
    //   6700: ldc_w -1445715203
    //   6703: ixor
    //   6704: goto -> 6715
    //   6707: ldc2_w -565044919
    //   6710: l2i
    //   6711: ldc_w 569947107
    //   6714: ixor
    //   6715: getstatic Perryc.0 : I
    //   6718: ifle -> 6732
    //   6721: ldc2_w -1310531840
    //   6724: l2i
    //   6725: ldc_w -124190672
    //   6728: ixor
    //   6729: goto -> 6740
    //   6732: ldc2_w 874317120
    //   6735: l2i
    //   6736: ldc_w 1569553770
    //   6739: ixor
    //   6740: ldc2_w 24659447
    //   6743: l2i
    //   6744: ldc_w 951965330
    //   6747: ixor
    //   6748: ixor
    //   6749: lookupswitch default -> 6790, 1347808079 -> 6776, 1891519573 -> 6732
    //   6776: goto -> 6780
    //   6779: athrow
    //   6780: invokevirtual drawStringWithShadow : (Ljava/lang/String;FFI)V
    //   6783: goto -> 6787
    //   6786: athrow
    //   6787: return
    //   6788: aconst_null
    //   6789: athrow
    //   6790: aconst_null
    //   6791: athrow
    //   6792: aconst_null
    //   6793: athrow
    //   6794: aconst_null
    //   6795: athrow
    //   6796: aconst_null
    //   6797: athrow
    //   6798: aconst_null
    //   6799: athrow
    //   6800: aconst_null
    //   6801: athrow
    //   6802: aconst_null
    //   6803: athrow
    //   6804: aconst_null
    //   6805: athrow
    //   6806: aconst_null
    //   6807: athrow
    //   6808: aconst_null
    //   6809: athrow
    //   6810: aconst_null
    //   6811: athrow
    //   6812: aconst_null
    //   6813: athrow
    //   6814: aconst_null
    //   6815: athrow
    //   6816: aconst_null
    //   6817: athrow
    //   6818: aconst_null
    //   6819: athrow
    //   6820: aconst_null
    //   6821: athrow
    //   6822: aconst_null
    //   6823: athrow
    //   6824: aconst_null
    //   6825: athrow
    //   6826: aconst_null
    //   6827: athrow
    //   6828: aconst_null
    //   6829: athrow
    //   6830: aconst_null
    //   6831: athrow
    //   6832: aconst_null
    //   6833: athrow
    //   6834: aconst_null
    //   6835: athrow
    //   6836: aconst_null
    //   6837: athrow
    //   6838: aconst_null
    //   6839: athrow
    //   6840: aconst_null
    //   6841: athrow
    //   6842: aconst_null
    //   6843: athrow
    //   6844: aconst_null
    //   6845: athrow
    //   6846: aconst_null
    //   6847: athrow
    //   6848: aconst_null
    //   6849: athrow
    //   6850: aconst_null
    //   6851: athrow
    //   6852: aconst_null
    //   6853: athrow
    //   6854: aconst_null
    //   6855: athrow
    //   6856: aconst_null
    //   6857: athrow
    //   6858: aconst_null
    //   6859: athrow
    //   6860: aconst_null
    //   6861: athrow
    //   6862: aconst_null
    //   6863: athrow
    //   6864: aconst_null
    //   6865: athrow
    //   6866: aconst_null
    //   6867: athrow
    //   6868: aconst_null
    //   6869: athrow
    //   6870: aconst_null
    //   6871: athrow
    //   6872: aconst_null
    //   6873: athrow
    //   6874: aconst_null
    //   6875: athrow
    //   6876: aconst_null
    //   6877: athrow
    //   6878: aconst_null
    //   6879: athrow
    //   6880: aconst_null
    //   6881: athrow
    //   6882: aconst_null
    //   6883: athrow
    //   6884: aconst_null
    //   6885: athrow
    //   6886: aconst_null
    //   6887: athrow
    //   6888: aconst_null
    //   6889: athrow
    //   6890: aconst_null
    //   6891: athrow
    //   6892: aconst_null
    //   6893: athrow
    //   6894: aconst_null
    //   6895: athrow
    //   6896: aconst_null
    //   6897: athrow
    //   6898: aconst_null
    //   6899: athrow
    //   6900: aconst_null
    //   6901: athrow
    //   6902: aconst_null
    //   6903: athrow
    //   6904: aconst_null
    //   6905: athrow
    //   6906: aconst_null
    //   6907: athrow
    //   6908: aconst_null
    //   6909: athrow
    //   6910: aconst_null
    //   6911: athrow
    //   6912: aconst_null
    //   6913: athrow
    //   6914: aconst_null
    //   6915: athrow
    //   6916: aconst_null
    //   6917: athrow
    //   6918: aconst_null
    //   6919: athrow
    //   6920: aconst_null
    //   6921: athrow
    //   6922: aconst_null
    //   6923: athrow
    //   6924: aconst_null
    //   6925: athrow
    //   6926: aconst_null
    //   6927: athrow
    //   6928: aconst_null
    //   6929: athrow
    //   6930: aconst_null
    //   6931: athrow
    //   6932: aconst_null
    //   6933: athrow
    //   6934: aconst_null
    //   6935: athrow
    //   6936: aconst_null
    //   6937: athrow
    //   6938: aconst_null
    //   6939: athrow
    //   6940: aconst_null
    //   6941: athrow
    //   6942: aconst_null
    //   6943: athrow
    //   6944: aconst_null
    //   6945: athrow
    //   6946: aconst_null
    //   6947: athrow
    //   6948: aconst_null
    //   6949: athrow
    //   6950: aconst_null
    //   6951: athrow
    //   6952: aconst_null
    //   6953: athrow
    //   6954: aconst_null
    //   6955: athrow
    //   6956: aconst_null
    //   6957: athrow
    //   6958: aconst_null
    //   6959: athrow
    //   6960: aconst_null
    //   6961: athrow
    //   6962: aconst_null
    //   6963: athrow
    //   6964: aconst_null
    //   6965: athrow
    //   6966: aconst_null
    //   6967: athrow
    //   6968: aconst_null
    //   6969: athrow
    //   6970: aconst_null
    //   6971: athrow
    //   6972: pop
    //   6973: goto -> 24
    //   6976: pop
    //   6977: aconst_null
    //   6978: goto -> 6972
    //   6981: dup
    //   6982: ifnull -> 6972
    //   6985: checkcast java/lang/Throwable
    //   6988: athrow
    //   6989: dup
    //   6990: ifnull -> 6976
    //   6993: checkcast java/lang/Throwable
    //   6996: athrow
    //   6997: aconst_null
    //   6998: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	6764	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/StringButton;
    //   24	6764	1	mouseX	I
    //   24	6764	2	mouseY	I
    //   24	6764	3	partialTicks	F
    // Exception table:
    //   from	to	target	type
    //   8	20	6981	java/lang/IndexOutOfBoundsException
    //   924	930	930	finally
    //   924	930	3	finally
    //   924	930	3	finally
    //   924	930	930	java/lang/EnumConstantNotPresentException
    //   924	930	930	finally
    //   1227	1234	1234	finally
    //   1227	1234	1234	finally
    //   1227	1234	1234	finally
    //   1228	1234	3	java/lang/NegativeArraySizeException
    //   1228	1234	1227	java/lang/NullPointerException
    //   1483	1490	1490	finally
    //   1483	1490	1483	java/lang/IllegalStateException
    //   1484	1490	3	finally
    //   1484	1490	1490	finally
    //   1484	1490	3	java/lang/ArithmeticException
    //   1623	1630	1630	finally
    //   1623	1630	1630	java/lang/NumberFormatException
    //   1623	1630	3	java/lang/EnumConstantNotPresentException
    //   1624	1630	1630	java/lang/ArithmeticException
    //   1624	1630	1623	finally
    //   1699	1706	1706	finally
    //   1700	1706	1699	finally
    //   1700	1706	1706	finally
    //   1700	1706	3	finally
    //   1700	1706	1706	finally
    //   1771	1778	1778	finally
    //   1771	1778	3	finally
    //   1771	1778	1771	finally
    //   1771	1778	1771	java/lang/ArrayIndexOutOfBoundsException
    //   1772	1778	1778	java/util/ConcurrentModificationException
    //   1979	1986	1986	finally
    //   1979	1986	1979	finally
    //   1979	1986	1986	java/lang/IndexOutOfBoundsException
    //   1980	1986	3	finally
    //   1980	1986	1986	java/lang/NegativeArraySizeException
    //   2119	2126	2126	finally
    //   2119	2126	2119	java/lang/IllegalStateException
    //   2119	2126	2126	java/lang/ClassCastException
    //   2119	2126	3	finally
    //   2120	2126	2126	finally
    //   2195	2202	2202	finally
    //   2195	2202	2195	finally
    //   2196	2202	2195	finally
    //   2196	2202	3	finally
    //   2196	2202	2202	finally
    //   2267	2274	2274	finally
    //   2267	2274	2274	finally
    //   2267	2274	2267	finally
    //   2268	2274	2267	finally
    //   2268	2274	2274	java/lang/ClassCastException
    //   2523	2530	2530	finally
    //   2523	2530	2530	java/lang/RuntimeException
    //   2524	2530	3	java/lang/AssertionError
    //   2524	2530	2523	java/lang/RuntimeException
    //   2524	2530	3	java/lang/IllegalStateException
    //   2667	2674	2674	finally
    //   2667	2674	3	java/lang/AssertionError
    //   2667	2674	3	finally
    //   2668	2674	3	finally
    //   2668	2674	2667	finally
    //   2983	2990	2990	finally
    //   2983	2990	2990	java/lang/ArrayIndexOutOfBoundsException
    //   2983	2990	2990	java/lang/NullPointerException
    //   2984	2990	2990	java/util/ConcurrentModificationException
    //   2984	2990	2983	finally
    //   3179	3186	3186	finally
    //   3179	3186	3179	java/lang/NegativeArraySizeException
    //   3180	3186	3	finally
    //   3180	3186	3186	java/lang/ArrayIndexOutOfBoundsException
    //   3180	3186	3	java/lang/IllegalArgumentException
    //   3251	3258	3258	finally
    //   3251	3258	3251	finally
    //   3252	3258	3	java/util/ConcurrentModificationException
    //   3252	3258	3258	finally
    //   3252	3258	3251	java/lang/NullPointerException
    //   3387	3394	3394	finally
    //   3387	3394	3387	finally
    //   3387	3394	3394	java/lang/NegativeArraySizeException
    //   3388	3394	3394	finally
    //   3388	3394	3394	java/lang/IllegalStateException
    //   3459	3466	3466	finally
    //   3459	3466	3459	finally
    //   3459	3466	3	finally
    //   3460	3466	3459	finally
    //   3460	3466	3459	java/lang/NumberFormatException
    //   3531	3538	3538	finally
    //   3531	3538	3538	java/lang/EnumConstantNotPresentException
    //   3531	3538	3538	java/lang/UnsupportedOperationException
    //   3532	3538	3531	finally
    //   3532	3538	3531	java/util/NoSuchElementException
    //   3876	3882	3882	finally
    //   3876	3882	3882	java/lang/AssertionError
    //   3876	3882	3882	finally
    //   3876	3882	3	finally
    //   3876	3882	3	finally
    //   3947	3954	3954	finally
    //   3947	3954	3954	finally
    //   3948	3954	3954	finally
    //   3948	3954	3947	java/util/ConcurrentModificationException
    //   3948	3954	3947	finally
    //   4079	4086	4086	finally
    //   4080	4086	4086	finally
    //   4080	4086	4079	finally
    //   4080	4086	4086	java/lang/IllegalStateException
    //   4080	4086	4086	finally
    //   4224	4230	4230	finally
    //   4224	4230	4230	finally
    //   4224	4230	4230	finally
    //   4224	4230	4230	finally
    //   4224	4230	4230	java/lang/ClassCastException
    //   4367	4374	4374	finally
    //   4367	4374	4367	finally
    //   4367	4374	4374	finally
    //   4368	4374	4367	java/util/ConcurrentModificationException
    //   4368	4374	4367	finally
    //   4564	4570	4570	finally
    //   4564	4570	3	java/lang/RuntimeException
    //   4564	4570	3	java/lang/AssertionError
    //   4564	4570	4570	finally
    //   4564	4570	4570	finally
    //   4639	4646	4646	finally
    //   4639	4646	4639	java/lang/ArrayIndexOutOfBoundsException
    //   4639	4646	4639	finally
    //   4639	4646	4646	java/lang/IndexOutOfBoundsException
    //   4640	4646	4646	java/lang/NullPointerException
    //   4712	4718	4718	finally
    //   4712	4718	3	java/lang/UnsupportedOperationException
    //   4712	4718	4718	java/util/NoSuchElementException
    //   4712	4718	4718	java/lang/NumberFormatException
    //   4712	4718	4718	finally
    //   4840	4846	4846	finally
    //   4840	4846	3	finally
    //   4840	4846	4846	java/lang/ArrayIndexOutOfBoundsException
    //   4840	4846	3	finally
    //   4840	4846	4846	finally
    //   5039	5046	5046	finally
    //   5039	5046	5039	finally
    //   5039	5046	5046	java/lang/NullPointerException
    //   5040	5046	5046	java/lang/NumberFormatException
    //   5040	5046	5039	finally
    //   5115	5122	5122	finally
    //   5115	5122	5115	java/lang/ArithmeticException
    //   5116	5122	5115	java/lang/IllegalArgumentException
    //   5116	5122	5115	java/lang/AssertionError
    //   5116	5122	3	java/lang/NegativeArraySizeException
    //   5187	5194	5194	finally
    //   5187	5194	3	finally
    //   5187	5194	5187	finally
    //   5188	5194	5194	java/lang/StringIndexOutOfBoundsException
    //   5188	5194	5187	java/lang/RuntimeException
    //   5315	5322	5322	finally
    //   5315	5322	3	finally
    //   5315	5322	5322	java/lang/UnsupportedOperationException
    //   5316	5322	5315	java/lang/StringIndexOutOfBoundsException
    //   5316	5322	5315	java/lang/ClassCastException
    //   5391	5398	5398	finally
    //   5392	5398	5391	java/lang/ArrayIndexOutOfBoundsException
    //   5392	5398	5391	finally
    //   5392	5398	5398	java/util/NoSuchElementException
    //   5392	5398	5391	finally
    //   5464	5470	5470	finally
    //   5464	5470	5470	java/lang/IllegalStateException
    //   5464	5470	3	java/lang/ClassCastException
    //   5464	5470	3	finally
    //   5464	5470	3	java/lang/NegativeArraySizeException
    //   5599	5606	5606	finally
    //   5599	5606	5606	finally
    //   5599	5606	5599	finally
    //   5599	5606	5606	java/lang/IllegalStateException
    //   5600	5606	5606	java/lang/EnumConstantNotPresentException
    //   5671	5678	5678	finally
    //   5671	5678	3	java/lang/IllegalStateException
    //   5671	5678	5671	finally
    //   5672	5678	5678	finally
    //   5672	5678	3	java/lang/IndexOutOfBoundsException
    //   5748	5754	5754	finally
    //   5748	5754	3	java/lang/IllegalStateException
    //   5748	5754	3	finally
    //   5748	5754	5754	finally
    //   5748	5754	5754	java/lang/NullPointerException
    //   5943	5950	5950	finally
    //   5943	5950	5943	java/lang/ArrayIndexOutOfBoundsException
    //   5944	5950	3	finally
    //   5944	5950	5950	finally
    //   5944	5950	3	java/lang/UnsupportedOperationException
    //   6015	6022	6022	finally
    //   6015	6022	6022	java/lang/ClassCastException
    //   6015	6022	6015	java/lang/UnsupportedOperationException
    //   6016	6022	6015	finally
    //   6016	6022	6022	java/lang/ArrayIndexOutOfBoundsException
    //   6087	6094	6094	finally
    //   6087	6094	6094	java/lang/ArithmeticException
    //   6087	6094	6094	finally
    //   6088	6094	6087	finally
    //   6088	6094	3	java/lang/IllegalStateException
    //   6431	6438	6438	finally
    //   6432	6438	6431	finally
    //   6432	6438	6438	java/lang/IllegalStateException
    //   6432	6438	6438	java/lang/EnumConstantNotPresentException
    //   6432	6438	6438	finally
    //   6503	6510	6510	finally
    //   6503	6510	6503	java/lang/UnsupportedOperationException
    //   6503	6510	6510	java/lang/NullPointerException
    //   6503	6510	6503	java/lang/StringIndexOutOfBoundsException
    //   6504	6510	6503	java/lang/ClassCastException
    //   6636	6642	6642	finally
    //   6636	6642	3	finally
    //   6636	6642	6642	finally
    //   6636	6642	3	finally
    //   6636	6642	3	java/lang/IllegalArgumentException
    //   6780	6786	6786	finally
    //   6780	6786	6786	java/lang/IllegalArgumentException
    //   6780	6786	3	java/lang/IndexOutOfBoundsException
    //   6780	6786	6786	finally
    //   6780	6786	3	java/lang/NumberFormatException
    //   6981	6989	6981	finally
    //   6997	6999	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\buttons\StringButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */