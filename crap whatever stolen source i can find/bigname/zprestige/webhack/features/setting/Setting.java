package bigname.zprestige.webhack.features.setting;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import java.util.function.Predicate;

public class Setting {
  public T min;
  
  public T max;
  
  public Predicate<T> visibility;
  
  public T plannedValue;
  
  public T value;
  
  public String name;
  
  public Feature feature;
  
  public String description;
  
  public T defaultValue;
  
  public boolean hasRestriction;
  
  public boolean isStringSetting() {
    return Perry1.4m(this, (int)-282478441L ^ 0x9D21CC1D);
  }
  
  public String currentEnumName() {
    return Perry1.j(this, (int)-773255317L ^ 0xD68DC4D2);
  }
  
  public Setting(String name, T defaultValue) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1789341694
    //   9: l2i
    //   10: ldc 1786965838
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1976978704
    //   19: l2i
    //   20: ldc 100347811
    //   22: ixor
    //   23: ldc2_w -1838528338
    //   26: l2i
    //   27: ldc 1165384561
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -684076177 -> 972, 1720093052 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 390689431
    //   66: l2i
    //   67: ldc 1819951241
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -447237318
    //   76: l2i
    //   77: ldc 1813144815
    //   79: ixor
    //   80: ldc2_w -1114361655
    //   83: l2i
    //   84: ldc -214773116
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 988, -941410920 -> 116, 899010643 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1672784818
    //   128: l2i
    //   129: ldc -2069676541
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -352668932
    //   138: l2i
    //   139: ldc -695030436
    //   141: ixor
    //   142: ldc2_w -1145103038
    //   145: l2i
    //   146: ldc -998259334
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 974, -1730720375 -> 135, 1135134616 -> 176
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w -772855517
    //   186: l2i
    //   187: ldc 2122782211
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 185939181
    //   196: l2i
    //   197: ldc -1739829587
    //   199: ixor
    //   200: ldc2_w -2020744354
    //   203: l2i
    //   204: ldc 414388288
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 964, 208111966 -> 236, 810994750 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w 1629652800
    //   246: l2i
    //   247: ldc 1401513638
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -5789165
    //   256: l2i
    //   257: ldc 2052908178
    //   259: ixor
    //   260: ldc2_w 1428563716
    //   263: l2i
    //   264: ldc 1801923776
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 976, -1145420475 -> 296, 216721954 -> 253
    //   296: putfield name : Ljava/lang/String;
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w -176136070
    //   308: l2i
    //   309: ldc 1168912651
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 1454198428
    //   318: l2i
    //   319: ldc -404502857
    //   321: ixor
    //   322: ldc2_w 1161186674
    //   325: l2i
    //   326: ldc 1545054776
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 968, -1469091999 -> 356, -1458719173 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 373
    //   363: ldc2_w 1537775540
    //   366: l2i
    //   367: ldc -484339578
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -696181210
    //   376: l2i
    //   377: ldc 1202068269
    //   379: ixor
    //   380: ldc2_w 1039759973
    //   383: l2i
    //   384: ldc -651317190
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 960, 1549651309 -> 373, 1978912596 -> 416
    //   416: aload_2
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w 331674487
    //   426: l2i
    //   427: ldc 287603643
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 359670792
    //   436: l2i
    //   437: ldc 355226860
    //   439: ixor
    //   440: ldc2_w 103094674
    //   443: l2i
    //   444: ldc -501797323
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -422396053 -> 984, 753279956 -> 433
    //   476: putfield defaultValue : Ljava/lang/Object;
    //   479: getstatic Perryc.c : I
    //   482: iflt -> 495
    //   485: ldc2_w -34063749
    //   488: l2i
    //   489: ldc -806499139
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -1768395564
    //   498: l2i
    //   499: ldc -1202087430
    //   501: ixor
    //   502: ldc2_w 861098834
    //   505: l2i
    //   506: ldc 1369804682
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, 73238137 -> 495, 1357064734 -> 970
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w -2114021103
    //   546: l2i
    //   547: ldc -1410961025
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w -596343972
    //   556: l2i
    //   557: ldc 1576527658
    //   559: ixor
    //   560: ldc2_w 346648754
    //   563: l2i
    //   564: ldc 890714934
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, 195470314 -> 962, 1759655650 -> 553
    //   596: aload_2
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 613
    //   603: ldc2_w 845964812
    //   606: l2i
    //   607: ldc 428094476
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w 2097851928
    //   616: l2i
    //   617: ldc 336868630
    //   619: ixor
    //   620: ldc2_w 1991473781
    //   623: l2i
    //   624: ldc -1007066391
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 656, -1633531236 -> 990, 1465055736 -> 613
    //   656: putfield value : Ljava/lang/Object;
    //   659: getstatic Perryc.0 : I
    //   662: ifle -> 675
    //   665: ldc2_w -1137551810
    //   668: l2i
    //   669: ldc -1643853885
    //   671: ixor
    //   672: goto -> 682
    //   675: ldc2_w -1265622733
    //   678: l2i
    //   679: ldc -1474456287
    //   681: ixor
    //   682: ldc2_w 1036785778
    //   685: l2i
    //   686: ldc -1467070729
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 716, -1217081480 -> 966, 1816538557 -> 675
    //   716: aload_0
    //   717: getstatic Perryc.1 : I
    //   720: ifeq -> 733
    //   723: ldc2_w 718810061
    //   726: l2i
    //   727: ldc 607396689
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w -1703279290
    //   736: l2i
    //   737: ldc -364796294
    //   739: ixor
    //   740: ldc2_w -656696102
    //   743: l2i
    //   744: ldc 1722591335
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 978, -1332003807 -> 733, -833841279 -> 776
    //   776: aload_2
    //   777: getstatic Perryc.1 : I
    //   780: ifeq -> 793
    //   783: ldc2_w 1059452658
    //   786: l2i
    //   787: ldc -829126968
    //   789: ixor
    //   790: goto -> 800
    //   793: ldc2_w 930127043
    //   796: l2i
    //   797: ldc -1880326595
    //   799: ixor
    //   800: ldc2_w -1443874250
    //   803: l2i
    //   804: ldc 1942728034
    //   806: ixor
    //   807: ixor
    //   808: lookupswitch default -> 982, 730523502 -> 793, 1655141802 -> 836
    //   836: putfield plannedValue : Ljava/lang/Object;
    //   839: getstatic Perryc.1 : I
    //   842: ifeq -> 855
    //   845: ldc2_w -1298388643
    //   848: l2i
    //   849: ldc 382708826
    //   851: ixor
    //   852: goto -> 862
    //   855: ldc2_w 1092744625
    //   858: l2i
    //   859: ldc -970708903
    //   861: ixor
    //   862: ldc2_w 1264255827
    //   865: l2i
    //   866: ldc 1217877275
    //   868: ixor
    //   869: ixor
    //   870: lookupswitch default -> 986, -2067166304 -> 896, -1482697905 -> 855
    //   896: aload_0
    //   897: ldc ''
    //   899: getstatic Perryc.c : I
    //   902: iflt -> 915
    //   905: ldc2_w -1905731989
    //   908: l2i
    //   909: ldc 1331741883
    //   911: ixor
    //   912: goto -> 922
    //   915: ldc2_w 27724208
    //   918: l2i
    //   919: ldc 1455052193
    //   921: ixor
    //   922: ldc2_w -1070115195
    //   925: l2i
    //   926: ldc -340597925
    //   928: ixor
    //   929: ixor
    //   930: lookupswitch default -> 956, -1349046246 -> 915, -359815410 -> 980
    //   956: putfield description : Ljava/lang/String;
    //   959: return
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	960	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	960	1	name	Ljava/lang/String;
    //   0	960	2	defaultValue	Ljava/lang/Object;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	960	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	960	2	defaultValue	TT;
  }
  
  public Object getMax() {
    return Perry1.2g(this, (int)-333607937L ^ 0xAF5454A9);
  }
  
  public void increaseEnumNoEvent() {
    Perry1.4c(this, (int)371130058L ^ 0x56DD18E1);
  }
  
  public void setMin(Object paramObject) {
    Perry1.1m(this, (int)-439650807L ^ 0xDE3DB96E, paramObject);
  }
  
  public boolean isEnumSetting() {
    return Perry1.4x(this, (int)-981152439L ^ 0x8E47ECF7);
  }
  
  public void increaseEnum() {
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
  
  public String getDescription() {
    return Perry1.f(this, (int)-1510624555L ^ 0xFE64F13F);
  }
  
  public void setValue(T value) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2859
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2851
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2843
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 2116024804
    //   33: l2i
    //   34: ldc_w 975835169
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -597440461
    //   44: l2i
    //   45: ldc_w 2096652161
    //   48: ixor
    //   49: ldc2_w 1269342572
    //   52: l2i
    //   53: ldc_w -322547041
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2776, -480568778 -> 41, 133522497 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -404283511
    //   94: l2i
    //   95: ldc_w -1375281135
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 407863337
    //   105: l2i
    //   106: ldc_w -1966515088
    //   109: ixor
    //   110: ldc2_w 115352483
    //   113: l2i
    //   114: ldc_w -302847283
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1561118986 -> 2804, -8928021 -> 102
    //   144: aload_1
    //   145: getstatic Perryc.1 : I
    //   148: ifeq -> 162
    //   151: ldc2_w 1155044772
    //   154: l2i
    //   155: ldc_w -1422716303
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -2009741913
    //   165: l2i
    //   166: ldc_w 917295395
    //   169: ixor
    //   170: ldc2_w 1066120532
    //   173: l2i
    //   174: ldc_w -1981698379
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 2778, 150146917 -> 204, 1501666356 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual setPlannedValue : (Ljava/lang/Object;)V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w -1808358234
    //   224: l2i
    //   225: ldc_w -1737758153
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1874116313
    //   235: l2i
    //   236: ldc_w 681942088
    //   239: ixor
    //   240: ldc2_w -988590702
    //   243: l2i
    //   244: ldc_w -692046384
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -1497579403 -> 232, 529413843 -> 2828
    //   276: aload_0
    //   277: getstatic Perryc.1 : I
    //   280: ifeq -> 294
    //   283: ldc2_w -1401058432
    //   286: l2i
    //   287: ldc_w 272008383
    //   290: ixor
    //   291: goto -> 302
    //   294: ldc2_w -2109872469
    //   297: l2i
    //   298: ldc_w 40801803
    //   301: ixor
    //   302: ldc2_w -1157570256
    //   305: l2i
    //   306: ldc_w 709256365
    //   309: ixor
    //   310: ixor
    //   311: lookupswitch default -> 2756, 286651709 -> 336, 755862178 -> 294
    //   336: getfield hasRestriction : Z
    //   339: ifeq -> 353
    //   342: ldc2_w 1443375687
    //   345: l2i
    //   346: ldc_w 1770408154
    //   349: ixor
    //   350: goto -> 361
    //   353: ldc2_w -1216506913
    //   356: l2i
    //   357: ldc_w -1997278909
    //   360: ixor
    //   361: ldc2_w -358246111
    //   364: l2i
    //   365: ldc_w -257049590
    //   368: ixor
    //   369: ixor
    //   370: tableswitch default -> 342, 629557174 -> 392, 629557175 -> 1679
    //   392: getstatic Perryc.0 : I
    //   395: ifle -> 409
    //   398: ldc2_w 4349007
    //   401: l2i
    //   402: ldc_w 2085039711
    //   405: ixor
    //   406: goto -> 417
    //   409: ldc2_w 793443870
    //   412: l2i
    //   413: ldc_w 1060597598
    //   416: ixor
    //   417: ldc2_w 566998540
    //   420: l2i
    //   421: ldc_w 769837636
    //   424: ixor
    //   425: ixor
    //   426: lookupswitch default -> 2786, 475327752 -> 452, 1881935448 -> 409
    //   452: aload_0
    //   453: getstatic Perryc.1 : I
    //   456: ifeq -> 470
    //   459: ldc2_w -906784886
    //   462: l2i
    //   463: ldc_w 1750029354
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w 1482259441
    //   473: l2i
    //   474: ldc_w 28307680
    //   477: ixor
    //   478: ldc2_w -302649264
    //   481: l2i
    //   482: ldc_w 2064551757
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 2832, -821169140 -> 512, 927442109 -> 470
    //   512: getfield min : Ljava/lang/Object;
    //   515: checkcast java/lang/Number
    //   518: getstatic Perryc.0 : I
    //   521: ifle -> 535
    //   524: ldc2_w 125882115
    //   527: l2i
    //   528: ldc_w 1729273203
    //   531: ixor
    //   532: goto -> 543
    //   535: ldc2_w 85682051
    //   538: l2i
    //   539: ldc_w -644845656
    //   542: ixor
    //   543: ldc2_w -1291113
    //   546: l2i
    //   547: ldc_w -1970958772
    //   550: ixor
    //   551: ixor
    //   552: lookupswitch default -> 580, 368808107 -> 2800, 2118042574 -> 535
    //   580: goto -> 584
    //   583: athrow
    //   584: invokevirtual floatValue : ()F
    //   587: goto -> 591
    //   590: athrow
    //   591: getstatic Perryc.1 : I
    //   594: ifeq -> 608
    //   597: ldc2_w 1200721800
    //   600: l2i
    //   601: ldc_w 395808184
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 2003549710
    //   611: l2i
    //   612: ldc_w 749433603
    //   615: ixor
    //   616: ldc2_w 1848476124
    //   619: l2i
    //   620: ldc_w 447884934
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 652, 606845601 -> 608, 614051178 -> 2824
    //   652: aload_1
    //   653: checkcast java/lang/Number
    //   656: getstatic Perryc.0 : I
    //   659: ifle -> 673
    //   662: ldc2_w -729251289
    //   665: l2i
    //   666: ldc_w -816609798
    //   669: ixor
    //   670: goto -> 681
    //   673: ldc2_w 439921037
    //   676: l2i
    //   677: ldc_w -966019952
    //   680: ixor
    //   681: ldc2_w 70024165
    //   684: l2i
    //   685: ldc_w 1861506742
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 2826, -1232392114 -> 716, 1896032910 -> 673
    //   716: goto -> 720
    //   719: athrow
    //   720: invokevirtual floatValue : ()F
    //   723: goto -> 727
    //   726: athrow
    //   727: fcmpl
    //   728: ifle -> 742
    //   731: ldc2_w -660189491
    //   734: l2i
    //   735: ldc_w -1812845724
    //   738: ixor
    //   739: goto -> 750
    //   742: ldc2_w 1060252047
    //   745: l2i
    //   746: ldc_w 1952861273
    //   749: ixor
    //   750: ldc2_w 320953097
    //   753: l2i
    //   754: ldc_w 459635999
    //   757: ixor
    //   758: ixor
    //   759: tableswitch default -> 731, 1125139391 -> 780, 1125139392 -> 1035
    //   780: getstatic Perryc.c : I
    //   783: iflt -> 797
    //   786: ldc2_w 1899441270
    //   789: l2i
    //   790: ldc_w -1331879598
    //   793: ixor
    //   794: goto -> 805
    //   797: ldc2_w -570162660
    //   800: l2i
    //   801: ldc_w 1642935240
    //   804: ixor
    //   805: ldc2_w -341794686
    //   808: l2i
    //   809: ldc_w 1087679456
    //   812: ixor
    //   813: ixor
    //   814: lookupswitch default -> 840, 1017456314 -> 797, 1792935494 -> 2818
    //   840: aload_0
    //   841: getstatic Perryc.1 : I
    //   844: ifeq -> 858
    //   847: ldc2_w -1092092254
    //   850: l2i
    //   851: ldc_w -883143854
    //   854: ixor
    //   855: goto -> 866
    //   858: ldc2_w 1302713849
    //   861: l2i
    //   862: ldc_w 1811450265
    //   865: ixor
    //   866: ldc2_w 1034660155
    //   869: l2i
    //   870: ldc_w 2117012162
    //   873: ixor
    //   874: ixor
    //   875: lookupswitch default -> 900, 605883013 -> 858, 910104073 -> 2766
    //   900: aload_0
    //   901: getstatic Perryc.1 : I
    //   904: ifeq -> 918
    //   907: ldc2_w -127495698
    //   910: l2i
    //   911: ldc_w 1575096634
    //   914: ixor
    //   915: goto -> 926
    //   918: ldc2_w 1533247164
    //   921: l2i
    //   922: ldc_w -811478387
    //   925: ixor
    //   926: ldc2_w -1464637908
    //   929: l2i
    //   930: ldc_w 560275735
    //   933: ixor
    //   934: ixor
    //   935: lookupswitch default -> 960, 743622639 -> 2796, 1254771774 -> 918
    //   960: getfield min : Ljava/lang/Object;
    //   963: getstatic Perryc.0 : I
    //   966: ifle -> 980
    //   969: ldc2_w 1638535362
    //   972: l2i
    //   973: ldc_w -877971961
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w -1311872647
    //   983: l2i
    //   984: ldc_w 1288766981
    //   987: ixor
    //   988: ldc2_w 1650497878
    //   991: l2i
    //   992: ldc_w -775755372
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, 430134791 -> 2810, 1130204631 -> 980
    //   1024: goto -> 1028
    //   1027: athrow
    //   1028: invokevirtual setPlannedValue : (Ljava/lang/Object;)V
    //   1031: goto -> 1035
    //   1034: athrow
    //   1035: getstatic Perryc.0 : I
    //   1038: ifle -> 1052
    //   1041: ldc2_w 1650633603
    //   1044: l2i
    //   1045: ldc_w -2071723868
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w 1221921310
    //   1055: l2i
    //   1056: ldc_w 1137367883
    //   1059: ixor
    //   1060: ldc2_w 975550029
    //   1063: l2i
    //   1064: ldc_w 1903456994
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 1096, -1380487288 -> 2758, 1430465835 -> 1052
    //   1096: aload_0
    //   1097: getstatic Perryc.1 : I
    //   1100: ifeq -> 1114
    //   1103: ldc2_w 1413641776
    //   1106: l2i
    //   1107: ldc_w -126217330
    //   1110: ixor
    //   1111: goto -> 1122
    //   1114: ldc2_w 1616059169
    //   1117: l2i
    //   1118: ldc_w -1644885265
    //   1121: ixor
    //   1122: ldc2_w 702985035
    //   1125: l2i
    //   1126: ldc_w 1686567006
    //   1129: ixor
    //   1130: ixor
    //   1131: lookupswitch default -> 1156, -514314581 -> 2822, 1025807293 -> 1114
    //   1156: getfield max : Ljava/lang/Object;
    //   1159: checkcast java/lang/Number
    //   1162: getstatic Perryc.0 : I
    //   1165: ifle -> 1179
    //   1168: ldc2_w -1801773748
    //   1171: l2i
    //   1172: ldc_w 1005275034
    //   1175: ixor
    //   1176: goto -> 1187
    //   1179: ldc2_w 212284759
    //   1182: l2i
    //   1183: ldc_w 1010135485
    //   1186: ixor
    //   1187: ldc2_w 1741229567
    //   1190: l2i
    //   1191: ldc_w 174849320
    //   1194: ixor
    //   1195: ixor
    //   1196: lookupswitch default -> 2794, -1026381311 -> 1179, 1563472957 -> 1224
    //   1224: goto -> 1228
    //   1227: athrow
    //   1228: invokevirtual floatValue : ()F
    //   1231: goto -> 1235
    //   1234: athrow
    //   1235: getstatic Perryc.c : I
    //   1238: iflt -> 1252
    //   1241: ldc2_w -2106895880
    //   1244: l2i
    //   1245: ldc_w 1251859794
    //   1248: ixor
    //   1249: goto -> 1260
    //   1252: ldc2_w -1063751128
    //   1255: l2i
    //   1256: ldc_w -1470474487
    //   1259: ixor
    //   1260: ldc2_w 1577605587
    //   1263: l2i
    //   1264: ldc_w 799077344
    //   1267: ixor
    //   1268: ixor
    //   1269: lookupswitch default -> 2816, -1185012071 -> 1252, 426413842 -> 1296
    //   1296: aload_1
    //   1297: checkcast java/lang/Number
    //   1300: getstatic Perryc.c : I
    //   1303: iflt -> 1317
    //   1306: ldc2_w -763592074
    //   1309: l2i
    //   1310: ldc_w 929258612
    //   1313: ixor
    //   1314: goto -> 1325
    //   1317: ldc2_w -550568656
    //   1320: l2i
    //   1321: ldc_w 1769868129
    //   1324: ixor
    //   1325: ldc2_w 495950990
    //   1328: l2i
    //   1329: ldc_w -1638302094
    //   1332: ixor
    //   1333: ixor
    //   1334: lookupswitch default -> 2760, 897979565 -> 1360, 1724464382 -> 1317
    //   1360: goto -> 1364
    //   1363: athrow
    //   1364: invokevirtual floatValue : ()F
    //   1367: goto -> 1371
    //   1370: athrow
    //   1371: fcmpg
    //   1372: ifge -> 1386
    //   1375: ldc2_w 1042668430
    //   1378: l2i
    //   1379: ldc_w 1649874606
    //   1382: ixor
    //   1383: goto -> 1394
    //   1386: ldc2_w -1863198867
    //   1389: l2i
    //   1390: ldc_w -863823282
    //   1393: ixor
    //   1394: ldc2_w 1267489890
    //   1397: l2i
    //   1398: ldc_w -58338169
    //   1401: ixor
    //   1402: ixor
    //   1403: tableswitch default -> 1375, -344242747 -> 1424, -344242746 -> 1679
    //   1424: getstatic Perryc.1 : I
    //   1427: ifeq -> 1441
    //   1430: ldc2_w 554298686
    //   1433: l2i
    //   1434: ldc_w 857831814
    //   1437: ixor
    //   1438: goto -> 1449
    //   1441: ldc2_w 1295551585
    //   1444: l2i
    //   1445: ldc_w 236563450
    //   1448: ixor
    //   1449: ldc2_w 186292311
    //   1452: l2i
    //   1453: ldc_w -1900212529
    //   1456: ixor
    //   1457: ixor
    //   1458: lookupswitch default -> 1484, -1752235488 -> 2802, 1324079327 -> 1441
    //   1484: aload_0
    //   1485: getstatic Perryc.0 : I
    //   1488: ifle -> 1502
    //   1491: ldc2_w -325172490
    //   1494: l2i
    //   1495: ldc_w -305641972
    //   1498: ixor
    //   1499: goto -> 1510
    //   1502: ldc2_w 1536587639
    //   1505: l2i
    //   1506: ldc_w 1467034255
    //   1509: ixor
    //   1510: ldc2_w -144243145
    //   1513: l2i
    //   1514: ldc_w -1308250160
    //   1517: ixor
    //   1518: ixor
    //   1519: lookupswitch default -> 1544, -1253726051 -> 1502, 1144302877 -> 2812
    //   1544: aload_0
    //   1545: getstatic Perryc.1 : I
    //   1548: ifeq -> 1562
    //   1551: ldc2_w 1714132853
    //   1554: l2i
    //   1555: ldc_w -836995275
    //   1558: ixor
    //   1559: goto -> 1570
    //   1562: ldc2_w -231429753
    //   1565: l2i
    //   1566: ldc_w 2037383339
    //   1569: ixor
    //   1570: ldc2_w 69484487
    //   1573: l2i
    //   1574: ldc_w 990414769
    //   1577: ixor
    //   1578: ixor
    //   1579: lookupswitch default -> 2798, -1759815626 -> 1562, -1268248230 -> 1604
    //   1604: getfield max : Ljava/lang/Object;
    //   1607: getstatic Perryc.0 : I
    //   1610: ifle -> 1624
    //   1613: ldc2_w 1715213366
    //   1616: l2i
    //   1617: ldc_w -1603470907
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w 1933128586
    //   1627: l2i
    //   1628: ldc_w -1330654944
    //   1631: ixor
    //   1632: ldc2_w 1434169157
    //   1635: l2i
    //   1636: ldc_w -1369958874
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 1668, 1030968464 -> 2762, 1211721219 -> 1624
    //   1668: goto -> 1672
    //   1671: athrow
    //   1672: invokevirtual setPlannedValue : (Ljava/lang/Object;)V
    //   1675: goto -> 1679
    //   1678: athrow
    //   1679: new bigname/zprestige/webhack/event/events/ClientEvent
    //   1682: dup
    //   1683: getstatic Perryc.0 : I
    //   1686: ifle -> 1700
    //   1689: ldc2_w 365386030
    //   1692: l2i
    //   1693: ldc_w -2059008206
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w -156008401
    //   1703: l2i
    //   1704: ldc_w 164572429
    //   1707: ixor
    //   1708: ldc2_w -1371642483
    //   1711: l2i
    //   1712: ldc_w -2064971277
    //   1715: ixor
    //   1716: ixor
    //   1717: lookupswitch default -> 1744, -1381748517 -> 1700, -1168887198 -> 2830
    //   1744: aload_0
    //   1745: getstatic Perryc.0 : I
    //   1748: ifle -> 1762
    //   1751: ldc2_w -921350308
    //   1754: l2i
    //   1755: ldc_w -354335588
    //   1758: ixor
    //   1759: goto -> 1770
    //   1762: ldc2_w -1262989828
    //   1765: l2i
    //   1766: ldc_w -718187271
    //   1769: ixor
    //   1770: ldc2_w 897420977
    //   1773: l2i
    //   1774: ldc_w -112244043
    //   1777: ixor
    //   1778: ixor
    //   1779: lookupswitch default -> 2792, -1380197119 -> 1804, -272183356 -> 1762
    //   1804: goto -> 1808
    //   1807: athrow
    //   1808: invokespecial <init> : (Lbigname/zprestige/webhack/features/setting/Setting;)V
    //   1811: goto -> 1815
    //   1814: athrow
    //   1815: getstatic Perryc.1 : I
    //   1818: ifeq -> 1832
    //   1821: ldc2_w -1127468777
    //   1824: l2i
    //   1825: ldc_w 1284705780
    //   1828: ixor
    //   1829: goto -> 1840
    //   1832: ldc2_w -2046116837
    //   1835: l2i
    //   1836: ldc_w 1772464405
    //   1839: ixor
    //   1840: ldc2_w -1708712319
    //   1843: l2i
    //   1844: ldc_w 529163172
    //   1847: ixor
    //   1848: ixor
    //   1849: lookupswitch default -> 1876, 544626093 -> 1832, 1978810822 -> 2774
    //   1876: astore_2
    //   1877: getstatic Perryc.1 : I
    //   1880: ifeq -> 1894
    //   1883: ldc2_w 1626678411
    //   1886: l2i
    //   1887: ldc_w 1191012842
    //   1890: ixor
    //   1891: goto -> 1902
    //   1894: ldc2_w -172256552
    //   1897: l2i
    //   1898: ldc_w 144510437
    //   1901: ixor
    //   1902: ldc2_w -1326185609
    //   1905: l2i
    //   1906: ldc_w -680611610
    //   1909: ixor
    //   1910: ixor
    //   1911: lookupswitch default -> 1936, -831839350 -> 1894, 1100152560 -> 2768
    //   1936: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lnet/minecraftforge/fml/common/eventhandler/EventBus;
    //   1939: getstatic Perryc.1 : I
    //   1942: ifeq -> 1956
    //   1945: ldc2_w 1667278028
    //   1948: l2i
    //   1949: ldc_w -188020353
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w -1468270199
    //   1959: l2i
    //   1960: ldc_w -1403635755
    //   1963: ixor
    //   1964: ldc2_w -1706815797
    //   1967: l2i
    //   1968: ldc_w 395222421
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 2000, -1768548455 -> 1956, 442580717 -> 2780
    //   2000: aload_2
    //   2001: getstatic Perryc.1 : I
    //   2004: ifeq -> 2018
    //   2007: ldc2_w 1116866361
    //   2010: l2i
    //   2011: ldc_w 747806259
    //   2014: ixor
    //   2015: goto -> 2026
    //   2018: ldc2_w 93262816
    //   2021: l2i
    //   2022: ldc_w -1581016462
    //   2025: ixor
    //   2026: ldc2_w 567432789
    //   2029: l2i
    //   2030: ldc_w -1156654470
    //   2033: ixor
    //   2034: ixor
    //   2035: lookupswitch default -> 2060, -186903259 -> 2788, 2107075793 -> 2018
    //   2060: goto -> 2064
    //   2063: athrow
    //   2064: invokevirtual post : (Lnet/minecraftforge/fml/common/eventhandler/Event;)Z
    //   2067: goto -> 2071
    //   2070: athrow
    //   2071: pop
    //   2072: getstatic Perryc.0 : I
    //   2075: ifle -> 2089
    //   2078: ldc2_w 39868389
    //   2081: l2i
    //   2082: ldc_w 318660772
    //   2085: ixor
    //   2086: goto -> 2097
    //   2089: ldc2_w -1648135208
    //   2092: l2i
    //   2093: ldc_w -1194601581
    //   2096: ixor
    //   2097: ldc2_w -1014322942
    //   2100: l2i
    //   2101: ldc_w -587279837
    //   2104: ixor
    //   2105: ixor
    //   2106: lookupswitch default -> 2772, 267013216 -> 2089, 981261162 -> 2132
    //   2132: aload_2
    //   2133: getstatic Perryc.c : I
    //   2136: iflt -> 2150
    //   2139: ldc2_w 856517880
    //   2142: l2i
    //   2143: ldc_w 237280504
    //   2146: ixor
    //   2147: goto -> 2158
    //   2150: ldc2_w -1004899090
    //   2153: l2i
    //   2154: ldc_w 2075378658
    //   2157: ixor
    //   2158: ldc2_w -654463561
    //   2161: l2i
    //   2162: ldc_w 559137035
    //   2165: ixor
    //   2166: ixor
    //   2167: lookupswitch default -> 2192, -1486777974 -> 2150, -997745476 -> 2820
    //   2192: goto -> 2196
    //   2195: athrow
    //   2196: invokevirtual isCanceled : ()Z
    //   2199: goto -> 2203
    //   2202: athrow
    //   2203: ifne -> 2217
    //   2206: ldc2_w -1900145110
    //   2209: l2i
    //   2210: ldc_w -60300816
    //   2213: ixor
    //   2214: goto -> 2225
    //   2217: ldc2_w -1256161213
    //   2220: l2i
    //   2221: ldc_w -939952232
    //   2224: ixor
    //   2225: ldc2_w 403980505
    //   2228: l2i
    //   2229: ldc_w -2029557223
    //   2232: ixor
    //   2233: ixor
    //   2234: tableswitch default -> 2206, -305472230 -> 2256, -305472229 -> 2506
    //   2256: getstatic Perryc.0 : I
    //   2259: ifle -> 2273
    //   2262: ldc2_w 673752345
    //   2265: l2i
    //   2266: ldc_w 177832945
    //   2269: ixor
    //   2270: goto -> 2281
    //   2273: ldc2_w -1158437996
    //   2276: l2i
    //   2277: ldc_w 125539531
    //   2280: ixor
    //   2281: ldc2_w 2102042341
    //   2284: l2i
    //   2285: ldc_w -1156148852
    //   2288: ixor
    //   2289: ixor
    //   2290: lookupswitch default -> 2316, -454219391 -> 2806, 1195336926 -> 2273
    //   2316: aload_0
    //   2317: getstatic Perryc.0 : I
    //   2320: ifle -> 2334
    //   2323: ldc2_w 1103776873
    //   2326: l2i
    //   2327: ldc_w -435246318
    //   2330: ixor
    //   2331: goto -> 2342
    //   2334: ldc2_w 1668140184
    //   2337: l2i
    //   2338: ldc_w -2076211892
    //   2341: ixor
    //   2342: ldc2_w -1839448737
    //   2345: l2i
    //   2346: ldc_w 409068478
    //   2349: ixor
    //   2350: ixor
    //   2351: lookupswitch default -> 2782, 771307930 -> 2334, 1836029749 -> 2376
    //   2376: aload_0
    //   2377: getstatic Perryc.0 : I
    //   2380: ifle -> 2394
    //   2383: ldc2_w 1529868668
    //   2386: l2i
    //   2387: ldc_w -1282643931
    //   2390: ixor
    //   2391: goto -> 2402
    //   2394: ldc2_w -272396965
    //   2397: l2i
    //   2398: ldc_w 518833707
    //   2401: ixor
    //   2402: ldc2_w -1372517689
    //   2405: l2i
    //   2406: ldc_w 2061420670
    //   2409: ixor
    //   2410: ixor
    //   2411: lookupswitch default -> 2436, 790064012 -> 2394, 1011637216 -> 2784
    //   2436: getfield plannedValue : Ljava/lang/Object;
    //   2439: getstatic Perryc.0 : I
    //   2442: ifle -> 2456
    //   2445: ldc2_w 906958041
    //   2448: l2i
    //   2449: ldc_w 855461712
    //   2452: ixor
    //   2453: goto -> 2464
    //   2456: ldc2_w 301400826
    //   2459: l2i
    //   2460: ldc_w -1468270966
    //   2463: ixor
    //   2464: ldc2_w 1310536642
    //   2467: l2i
    //   2468: ldc_w 1173978520
    //   2471: ixor
    //   2472: ixor
    //   2473: lookupswitch default -> 2790, -1301759446 -> 2500, 253105619 -> 2456
    //   2500: putfield value : Ljava/lang/Object;
    //   2503: goto -> 2755
    //   2506: getstatic Perryc.0 : I
    //   2509: ifle -> 2523
    //   2512: ldc2_w 1553834215
    //   2515: l2i
    //   2516: ldc_w 404153702
    //   2519: ixor
    //   2520: goto -> 2531
    //   2523: ldc2_w -147321637
    //   2526: l2i
    //   2527: ldc_w 1735262681
    //   2530: ixor
    //   2531: ldc2_w 1278093348
    //   2534: l2i
    //   2535: ldc_w 1293190025
    //   2538: ixor
    //   2539: ixor
    //   2540: lookupswitch default -> 2568, -1144569008 -> 2523, 1169288748 -> 2770
    //   2568: aload_0
    //   2569: getstatic Perryc.0 : I
    //   2572: ifle -> 2586
    //   2575: ldc2_w 1674624829
    //   2578: l2i
    //   2579: ldc_w 41219017
    //   2582: ixor
    //   2583: goto -> 2594
    //   2586: ldc2_w -677812836
    //   2589: l2i
    //   2590: ldc_w 1139407066
    //   2593: ixor
    //   2594: ldc2_w -100906511
    //   2597: l2i
    //   2598: ldc_w -355102411
    //   2601: ixor
    //   2602: ixor
    //   2603: lookupswitch default -> 2764, -2024192638 -> 2628, 1921881136 -> 2586
    //   2628: aload_0
    //   2629: getstatic Perryc.c : I
    //   2632: iflt -> 2646
    //   2635: ldc2_w 47721555
    //   2638: l2i
    //   2639: ldc_w -1598153203
    //   2642: ixor
    //   2643: goto -> 2654
    //   2646: ldc2_w 651431651
    //   2649: l2i
    //   2650: ldc_w 1580728688
    //   2653: ixor
    //   2654: ldc2_w -1947382326
    //   2657: l2i
    //   2658: ldc_w -1589061714
    //   2661: ixor
    //   2662: ixor
    //   2663: lookupswitch default -> 2688, -2000443334 -> 2814, -469796809 -> 2646
    //   2688: getfield value : Ljava/lang/Object;
    //   2691: getstatic Perryc.0 : I
    //   2694: ifle -> 2708
    //   2697: ldc2_w -1775598134
    //   2700: l2i
    //   2701: ldc_w 142533508
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w -943125904
    //   2711: l2i
    //   2712: ldc_w -1992377569
    //   2715: ixor
    //   2716: ldc2_w 1062197416
    //   2719: l2i
    //   2720: ldc_w -1072937675
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 2752, 300606985 -> 2708, 1628961747 -> 2808
    //   2752: putfield plannedValue : Ljava/lang/Object;
    //   2755: return
    //   2756: aconst_null
    //   2757: athrow
    //   2758: aconst_null
    //   2759: athrow
    //   2760: aconst_null
    //   2761: athrow
    //   2762: aconst_null
    //   2763: athrow
    //   2764: aconst_null
    //   2765: athrow
    //   2766: aconst_null
    //   2767: athrow
    //   2768: aconst_null
    //   2769: athrow
    //   2770: aconst_null
    //   2771: athrow
    //   2772: aconst_null
    //   2773: athrow
    //   2774: aconst_null
    //   2775: athrow
    //   2776: aconst_null
    //   2777: athrow
    //   2778: aconst_null
    //   2779: athrow
    //   2780: aconst_null
    //   2781: athrow
    //   2782: aconst_null
    //   2783: athrow
    //   2784: aconst_null
    //   2785: athrow
    //   2786: aconst_null
    //   2787: athrow
    //   2788: aconst_null
    //   2789: athrow
    //   2790: aconst_null
    //   2791: athrow
    //   2792: aconst_null
    //   2793: athrow
    //   2794: aconst_null
    //   2795: athrow
    //   2796: aconst_null
    //   2797: athrow
    //   2798: aconst_null
    //   2799: athrow
    //   2800: aconst_null
    //   2801: athrow
    //   2802: aconst_null
    //   2803: athrow
    //   2804: aconst_null
    //   2805: athrow
    //   2806: aconst_null
    //   2807: athrow
    //   2808: aconst_null
    //   2809: athrow
    //   2810: aconst_null
    //   2811: athrow
    //   2812: aconst_null
    //   2813: athrow
    //   2814: aconst_null
    //   2815: athrow
    //   2816: aconst_null
    //   2817: athrow
    //   2818: aconst_null
    //   2819: athrow
    //   2820: aconst_null
    //   2821: athrow
    //   2822: aconst_null
    //   2823: athrow
    //   2824: aconst_null
    //   2825: athrow
    //   2826: aconst_null
    //   2827: athrow
    //   2828: aconst_null
    //   2829: athrow
    //   2830: aconst_null
    //   2831: athrow
    //   2832: aconst_null
    //   2833: athrow
    //   2834: pop
    //   2835: goto -> 24
    //   2838: pop
    //   2839: aconst_null
    //   2840: goto -> 2834
    //   2843: dup
    //   2844: ifnull -> 2834
    //   2847: checkcast java/lang/Throwable
    //   2850: athrow
    //   2851: dup
    //   2852: ifnull -> 2838
    //   2855: checkcast java/lang/Throwable
    //   2858: athrow
    //   2859: aconst_null
    //   2860: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2732	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   24	2732	1	value	Ljava/lang/Object;
    //   1877	879	2	event	Lbigname/zprestige/webhack/event/events/ClientEvent;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	2732	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   24	2732	1	value	TT;
    // Exception table:
    //   from	to	target	type
    //   8	20	2843	finally
    //   208	214	214	finally
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	214	finally
    //   208	214	3	java/lang/StringIndexOutOfBoundsException
    //   583	590	590	finally
    //   583	590	583	java/lang/ArrayIndexOutOfBoundsException
    //   583	590	583	finally
    //   584	590	3	finally
    //   584	590	590	finally
    //   719	726	726	finally
    //   719	726	719	finally
    //   719	726	719	finally
    //   719	726	719	finally
    //   720	726	719	finally
    //   1027	1034	1034	finally
    //   1027	1034	3	java/lang/AssertionError
    //   1027	1034	1034	java/lang/NegativeArraySizeException
    //   1028	1034	1034	finally
    //   1028	1034	1027	java/lang/RuntimeException
    //   1227	1234	1234	finally
    //   1228	1234	3	finally
    //   1228	1234	1234	finally
    //   1228	1234	1227	finally
    //   1228	1234	3	finally
    //   1363	1370	1370	finally
    //   1363	1370	1370	finally
    //   1363	1370	1363	java/lang/NumberFormatException
    //   1363	1370	1370	java/lang/AssertionError
    //   1364	1370	1363	finally
    //   1672	1678	1678	finally
    //   1672	1678	1678	finally
    //   1672	1678	1678	java/lang/IllegalStateException
    //   1672	1678	3	finally
    //   1672	1678	1678	finally
    //   1807	1814	1814	finally
    //   1807	1814	1814	java/lang/AssertionError
    //   1807	1814	3	java/lang/StringIndexOutOfBoundsException
    //   1808	1814	3	java/lang/IllegalArgumentException
    //   1808	1814	1807	finally
    //   2064	2070	2070	finally
    //   2064	2070	2070	finally
    //   2064	2070	2070	finally
    //   2064	2070	2070	java/lang/ArithmeticException
    //   2064	2070	2070	finally
    //   2195	2202	2202	finally
    //   2195	2202	3	finally
    //   2196	2202	2195	finally
    //   2196	2202	2202	finally
    //   2196	2202	3	finally
    //   2843	2851	2843	java/lang/ClassCastException
    //   2859	2861	3	finally
  }
  
  public boolean hasRestriction() {
    return Perry1.4y(this, (int)1570975780L ^ 0x74BF5698);
  }
  
  public void setMax(T max) {
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
  
  public void setPlannedValue(Object paramObject) {
    Perry1.1n(this, (int)-1988244574L ^ 0xB65A33BC, paramObject);
  }
  
  public Setting(String name, T defaultValue, T min, T max, Predicate<T> visibility, String description) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 876564233
    //   9: l2i
    //   10: ldc_w -255114322
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 408816800
    //   20: l2i
    //   21: ldc_w -1501442784
    //   24: ixor
    //   25: ldc2_w -171108866
    //   28: l2i
    //   29: ldc_w 852159082
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1621422731 -> 17, 66319155 -> 1748
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -1677338320
    //   70: l2i
    //   71: ldc_w -387844104
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -448785145
    //   81: l2i
    //   82: ldc_w 1688946424
    //   85: ixor
    //   86: ldc2_w 1292186304
    //   89: l2i
    //   90: ldc_w 463665939
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 1754, -682845652 -> 120, 574875419 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 133693979
    //   132: l2i
    //   133: ldc_w -424164251
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 905867914
    //   143: l2i
    //   144: ldc_w -575236363
    //   147: ixor
    //   148: ldc2_w -148790706
    //   151: l2i
    //   152: ldc_w -1917552445
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 1764, -1830994190 -> 184, -1680204557 -> 140
    //   184: aload_0
    //   185: getstatic Perryc.1 : I
    //   188: ifeq -> 202
    //   191: ldc2_w 2008594523
    //   194: l2i
    //   195: ldc_w 1328066865
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1910271690
    //   205: l2i
    //   206: ldc_w 885658126
    //   209: ixor
    //   210: ldc2_w -69561558
    //   213: l2i
    //   214: ldc_w 906527735
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 1774, -180217417 -> 202, 2000393189 -> 244
    //   244: aload_1
    //   245: getstatic Perryc.1 : I
    //   248: ifeq -> 262
    //   251: ldc2_w 1712990138
    //   254: l2i
    //   255: ldc_w 131826875
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -1748189613
    //   265: l2i
    //   266: ldc_w 973740072
    //   269: ixor
    //   270: ldc2_w -100159851
    //   273: l2i
    //   274: ldc_w 642026134
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 1744, -1115519230 -> 262, 1904575096 -> 304
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.c : I
    //   310: iflt -> 324
    //   313: ldc2_w -603302722
    //   316: l2i
    //   317: ldc_w 1931802348
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w -30247108
    //   327: l2i
    //   328: ldc_w 1752257310
    //   331: ixor
    //   332: ldc2_w 957006335
    //   335: l2i
    //   336: ldc_w -1337583384
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 368, -1643296529 -> 324, 643988293 -> 1750
    //   368: aload_0
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -1030893718
    //   378: l2i
    //   379: ldc_w -1463083551
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 547674178
    //   389: l2i
    //   390: ldc_w -753821645
    //   393: ixor
    //   394: ldc2_w -335950826
    //   397: l2i
    //   398: ldc_w -81135587
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 1792, -479890310 -> 428, 2056709760 -> 386
    //   428: aload_2
    //   429: getstatic Perryc.c : I
    //   432: iflt -> 446
    //   435: ldc2_w -2012247865
    //   438: l2i
    //   439: ldc_w 807126318
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 1227491684
    //   449: l2i
    //   450: ldc_w -96120974
    //   453: ixor
    //   454: ldc2_w -100493931
    //   457: l2i
    //   458: ldc_w -699860317
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 1766, -1805770017 -> 446, -1624954592 -> 488
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w 879176705
    //   500: l2i
    //   501: ldc_w 2083049233
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1574681402
    //   511: l2i
    //   512: ldc_w -446217062
    //   515: ixor
    //   516: ldc2_w 807173279
    //   519: l2i
    //   520: ldc_w 1786394165
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, -2077313506 -> 508, 304720314 -> 1768
    //   552: aload_0
    //   553: getstatic Perryc.1 : I
    //   556: ifeq -> 570
    //   559: ldc2_w -2054429945
    //   562: l2i
    //   563: ldc_w -1508431126
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -1511551483
    //   573: l2i
    //   574: ldc_w 181803554
    //   577: ixor
    //   578: ldc2_w -971830387
    //   581: l2i
    //   582: ldc_w 1158519631
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, -2102779071 -> 570, -1602070225 -> 1786
    //   612: aload_2
    //   613: getstatic Perryc.c : I
    //   616: iflt -> 630
    //   619: ldc2_w 1388195963
    //   622: l2i
    //   623: ldc_w 1313275360
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w -917662249
    //   633: l2i
    //   634: ldc_w 1352748747
    //   637: ixor
    //   638: ldc2_w 66535172
    //   641: l2i
    //   642: ldc_w -1341523226
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -1358559111 -> 1758, -958966615 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w 1763659535
    //   684: l2i
    //   685: ldc_w -363584875
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -1499944181
    //   695: l2i
    //   696: ldc_w -236051821
    //   699: ixor
    //   700: ldc2_w -1612023681
    //   703: l2i
    //   704: ldc_w 1835052964
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 1782, -1510187453 -> 736, 1908521537 -> 692
    //   736: aload_0
    //   737: getstatic Perryc.c : I
    //   740: iflt -> 754
    //   743: ldc2_w -1704185979
    //   746: l2i
    //   747: ldc_w -2087114857
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -1414795807
    //   757: l2i
    //   758: ldc_w -2073831773
    //   761: ixor
    //   762: ldc2_w -2124103243
    //   765: l2i
    //   766: ldc_w 2145468821
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 796, -2074498346 -> 754, -412055502 -> 1756
    //   796: aload_3
    //   797: getstatic Perryc.c : I
    //   800: iflt -> 814
    //   803: ldc2_w 985216285
    //   806: l2i
    //   807: ldc_w -2003187559
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 659028385
    //   817: l2i
    //   818: ldc_w -7993849
    //   821: ixor
    //   822: ldc2_w -337875073
    //   825: l2i
    //   826: ldc_w 17946450
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, -1220924658 -> 814, 1491944873 -> 1760
    //   856: putfield min : Ljava/lang/Object;
    //   859: getstatic Perryc.0 : I
    //   862: ifle -> 876
    //   865: ldc2_w 119535133
    //   868: l2i
    //   869: ldc_w -1291173319
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -365661431
    //   879: l2i
    //   880: ldc_w 1232678375
    //   883: ixor
    //   884: ldc2_w -1941868373
    //   887: l2i
    //   888: ldc_w -485261951
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 1780, -870362172 -> 920, -616056562 -> 876
    //   920: aload_0
    //   921: getstatic Perryc.c : I
    //   924: iflt -> 938
    //   927: ldc2_w 1615349681
    //   930: l2i
    //   931: ldc_w -1410878268
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 1949854954
    //   941: l2i
    //   942: ldc_w 992759656
    //   945: ixor
    //   946: ldc2_w -1561977295
    //   949: l2i
    //   950: ldc_w 1015475524
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 1790, -780873481 -> 980, 1439629312 -> 938
    //   980: aload #4
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w 580578423
    //   991: l2i
    //   992: ldc_w 1851353305
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w 1844343401
    //   1002: l2i
    //   1003: ldc_w -568288444
    //   1006: ixor
    //   1007: ldc2_w -665913259
    //   1010: l2i
    //   1011: ldc_w 280116976
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 1742, -2076229109 -> 999, 2066886536 -> 1044
    //   1044: putfield max : Ljava/lang/Object;
    //   1047: getstatic Perryc.1 : I
    //   1050: ifeq -> 1064
    //   1053: ldc2_w 636733866
    //   1056: l2i
    //   1057: ldc_w -1376933494
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w -626372848
    //   1067: l2i
    //   1068: ldc_w -1217493298
    //   1071: ixor
    //   1072: ldc2_w -894649190
    //   1075: l2i
    //   1076: ldc_w 228956895
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1788, -1429344357 -> 1108, 1326925413 -> 1064
    //   1108: aload_0
    //   1109: getstatic Perryc.1 : I
    //   1112: ifeq -> 1126
    //   1115: ldc2_w -1963509746
    //   1118: l2i
    //   1119: ldc_w -1288357204
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w -1469575870
    //   1129: l2i
    //   1130: ldc_w 1609623985
    //   1133: ixor
    //   1134: ldc2_w 588516762
    //   1137: l2i
    //   1138: ldc_w 1802611569
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 1168, 1481668260 -> 1126, 1906811977 -> 1746
    //   1168: aload_2
    //   1169: getstatic Perryc.c : I
    //   1172: iflt -> 1186
    //   1175: ldc2_w 1974454207
    //   1178: l2i
    //   1179: ldc_w -472728013
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 309582736
    //   1189: l2i
    //   1190: ldc_w 1518656931
    //   1193: ixor
    //   1194: ldc2_w 115833666
    //   1197: l2i
    //   1198: ldc_w 271781419
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1228, -2136404763 -> 1776, 1958983807 -> 1186
    //   1228: putfield plannedValue : Ljava/lang/Object;
    //   1231: getstatic Perryc.c : I
    //   1234: iflt -> 1248
    //   1237: ldc2_w 330945660
    //   1240: l2i
    //   1241: ldc_w -752109649
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w 2065996392
    //   1251: l2i
    //   1252: ldc_w -53166665
    //   1255: ixor
    //   1256: ldc2_w -300473096
    //   1259: l2i
    //   1260: ldc_w 1470507796
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, 1729958627 -> 1248, 2032364607 -> 1784
    //   1292: aload_0
    //   1293: getstatic Perryc.1 : I
    //   1296: ifeq -> 1310
    //   1299: ldc2_w -2087789105
    //   1302: l2i
    //   1303: ldc_w -1202845619
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w 1524903131
    //   1313: l2i
    //   1314: ldc_w 495679365
    //   1317: ixor
    //   1318: ldc2_w 2100205222
    //   1321: l2i
    //   1322: ldc_w -1875901101
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1352, -690076041 -> 1794, 810733728 -> 1310
    //   1352: aload #5
    //   1354: getstatic Perryc.c : I
    //   1357: iflt -> 1371
    //   1360: ldc2_w 43876706
    //   1363: l2i
    //   1364: ldc_w 672348579
    //   1367: ixor
    //   1368: goto -> 1379
    //   1371: ldc2_w -50524074
    //   1374: l2i
    //   1375: ldc_w -1776472670
    //   1378: ixor
    //   1379: ldc2_w -1402630726
    //   1382: l2i
    //   1383: ldc_w -14647643
    //   1386: ixor
    //   1387: ixor
    //   1388: lookupswitch default -> 1740, 967167723 -> 1416, 2043366366 -> 1371
    //   1416: putfield visibility : Ljava/util/function/Predicate;
    //   1419: getstatic Perryc.0 : I
    //   1422: ifle -> 1436
    //   1425: ldc2_w 1808259533
    //   1428: l2i
    //   1429: ldc_w 101069709
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w -1659420195
    //   1439: l2i
    //   1440: ldc_w -1059596736
    //   1443: ixor
    //   1444: ldc2_w -190922013
    //   1447: l2i
    //   1448: ldc_w -2097368954
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1778, 463706149 -> 1436, 732095992 -> 1480
    //   1480: aload_0
    //   1481: getstatic Perryc.1 : I
    //   1484: ifeq -> 1498
    //   1487: ldc2_w 1848480164
    //   1490: l2i
    //   1491: ldc_w -503594983
    //   1494: ixor
    //   1495: goto -> 1506
    //   1498: ldc2_w -727571256
    //   1501: l2i
    //   1502: ldc_w 133770568
    //   1505: ixor
    //   1506: ldc2_w 2036816871
    //   1509: l2i
    //   1510: ldc_w -1592107325
    //   1513: ixor
    //   1514: ixor
    //   1515: lookupswitch default -> 1540, -1553264016 -> 1498, 1470846105 -> 1772
    //   1540: aload #6
    //   1542: getstatic Perryc.1 : I
    //   1545: ifeq -> 1559
    //   1548: ldc2_w -150470244
    //   1551: l2i
    //   1552: ldc_w 832511554
    //   1555: ixor
    //   1556: goto -> 1567
    //   1559: ldc2_w 916268086
    //   1562: l2i
    //   1563: ldc_w -2072005213
    //   1566: ixor
    //   1567: ldc2_w 2094445984
    //   1570: l2i
    //   1571: ldc_w 1836469853
    //   1574: ixor
    //   1575: ixor
    //   1576: lookupswitch default -> 1762, -1555928472 -> 1604, -684202973 -> 1559
    //   1604: putfield description : Ljava/lang/String;
    //   1607: getstatic Perryc.0 : I
    //   1610: ifle -> 1624
    //   1613: ldc2_w 416729680
    //   1616: l2i
    //   1617: ldc_w 1467627887
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w 793680055
    //   1627: l2i
    //   1628: ldc_w -182926918
    //   1631: ixor
    //   1632: ldc2_w -1829190986
    //   1635: l2i
    //   1636: ldc_w 1637986508
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 1668, -1124761275 -> 1752, 662177905 -> 1624
    //   1668: aload_0
    //   1669: ldc2_w 556685341
    //   1672: l2i
    //   1673: ldc_w 556685340
    //   1676: ixor
    //   1677: getstatic Perryc.1 : I
    //   1680: ifeq -> 1694
    //   1683: ldc2_w 811575578
    //   1686: l2i
    //   1687: ldc_w 155003875
    //   1690: ixor
    //   1691: goto -> 1702
    //   1694: ldc2_w -759928528
    //   1697: l2i
    //   1698: ldc_w 436861096
    //   1701: ixor
    //   1702: ldc2_w 872336126
    //   1705: l2i
    //   1706: ldc_w -1704309916
    //   1709: ixor
    //   1710: ixor
    //   1711: lookupswitch default -> 1770, -1862925469 -> 1694, 1630081026 -> 1736
    //   1736: putfield hasRestriction : Z
    //   1739: return
    //   1740: aconst_null
    //   1741: athrow
    //   1742: aconst_null
    //   1743: athrow
    //   1744: aconst_null
    //   1745: athrow
    //   1746: aconst_null
    //   1747: athrow
    //   1748: aconst_null
    //   1749: athrow
    //   1750: aconst_null
    //   1751: athrow
    //   1752: aconst_null
    //   1753: athrow
    //   1754: aconst_null
    //   1755: athrow
    //   1756: aconst_null
    //   1757: athrow
    //   1758: aconst_null
    //   1759: athrow
    //   1760: aconst_null
    //   1761: athrow
    //   1762: aconst_null
    //   1763: athrow
    //   1764: aconst_null
    //   1765: athrow
    //   1766: aconst_null
    //   1767: athrow
    //   1768: aconst_null
    //   1769: athrow
    //   1770: aconst_null
    //   1771: athrow
    //   1772: aconst_null
    //   1773: athrow
    //   1774: aconst_null
    //   1775: athrow
    //   1776: aconst_null
    //   1777: athrow
    //   1778: aconst_null
    //   1779: athrow
    //   1780: aconst_null
    //   1781: athrow
    //   1782: aconst_null
    //   1783: athrow
    //   1784: aconst_null
    //   1785: athrow
    //   1786: aconst_null
    //   1787: athrow
    //   1788: aconst_null
    //   1789: athrow
    //   1790: aconst_null
    //   1791: athrow
    //   1792: aconst_null
    //   1793: athrow
    //   1794: aconst_null
    //   1795: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1740	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1740	1	name	Ljava/lang/String;
    //   0	1740	2	defaultValue	Ljava/lang/Object;
    //   0	1740	3	min	Ljava/lang/Object;
    //   0	1740	4	max	Ljava/lang/Object;
    //   0	1740	5	visibility	Ljava/util/function/Predicate;
    //   0	1740	6	description	Ljava/lang/String;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1740	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1740	2	defaultValue	TT;
    //   0	1740	3	min	TT;
    //   0	1740	4	max	TT;
    //   0	1740	5	visibility	Ljava/util/function/Predicate<TT;>;
  }
  
  public Setting(String name, T defaultValue, T min, T max, String description) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -706039640
    //   9: l2i
    //   10: ldc_w 2069643760
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1416160419
    //   20: l2i
    //   21: ldc_w -1773949882
    //   24: ixor
    //   25: ldc2_w 238315331
    //   28: l2i
    //   29: ldc_w -2013123372
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1406681357 -> 17, 679525071 -> 1556
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 1426079315
    //   70: l2i
    //   71: ldc_w -566611368
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -280673425
    //   81: l2i
    //   82: ldc_w -2109480651
    //   85: ixor
    //   86: ldc2_w 1644433652
    //   89: l2i
    //   90: ldc_w 487462075
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -198178748 -> 1590, -94655510 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 684023174
    //   132: l2i
    //   133: ldc_w 1023824434
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 418066218
    //   143: l2i
    //   144: ldc_w -1267537575
    //   147: ixor
    //   148: ldc2_w 171093794
    //   151: l2i
    //   152: ldc_w -454281518
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -1542890467 -> 140, -81947068 -> 1572
    //   184: aload_0
    //   185: getstatic Perryc.0 : I
    //   188: ifle -> 202
    //   191: ldc2_w 1099878930
    //   194: l2i
    //   195: ldc_w -410168513
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1526919250
    //   205: l2i
    //   206: ldc_w 151763277
    //   209: ixor
    //   210: ldc2_w 2143877655
    //   213: l2i
    //   214: ldc_w -1326608408
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 1576, 1658045212 -> 244, 1764160722 -> 202
    //   244: aload_1
    //   245: getstatic Perryc.0 : I
    //   248: ifle -> 262
    //   251: ldc2_w 167284845
    //   254: l2i
    //   255: ldc_w -257642881
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1886398199
    //   265: l2i
    //   266: ldc_w 1799677999
    //   269: ixor
    //   270: ldc2_w -2003404296
    //   273: l2i
    //   274: ldc_w -1813756087
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 1596, -500301661 -> 262, 4649065 -> 304
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.0 : I
    //   310: ifle -> 324
    //   313: ldc2_w -1388618102
    //   316: l2i
    //   317: ldc_w 839291927
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 834705444
    //   327: l2i
    //   328: ldc_w 1125493037
    //   331: ixor
    //   332: ldc2_w 612103822
    //   335: l2i
    //   336: ldc_w 1128520215
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 1566, -133831164 -> 324, 367861136 -> 368
    //   368: aload_0
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -1976345918
    //   378: l2i
    //   379: ldc_w 1726481593
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -2128272475
    //   389: l2i
    //   390: ldc_w -1174437374
    //   393: ixor
    //   394: ldc2_w 1795218092
    //   397: l2i
    //   398: ldc_w -491718189
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -1905036187 -> 386, 1701543172 -> 1580
    //   428: aload_2
    //   429: getstatic Perryc.1 : I
    //   432: ifeq -> 446
    //   435: ldc2_w -1670547464
    //   438: l2i
    //   439: ldc_w -2038835614
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 1616748803
    //   449: l2i
    //   450: ldc_w 1363739036
    //   453: ixor
    //   454: ldc2_w 926933933
    //   457: l2i
    //   458: ldc_w 527498709
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, 735029208 -> 446, 844873698 -> 1570
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w -193360399
    //   500: l2i
    //   501: ldc_w 2075448139
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1003020157
    //   511: l2i
    //   512: ldc_w -1840448238
    //   515: ixor
    //   516: ldc2_w 1267107072
    //   519: l2i
    //   520: ldc_w -856615711
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, 146460507 -> 1568, 1919459163 -> 508
    //   552: aload_0
    //   553: getstatic Perryc.0 : I
    //   556: ifle -> 570
    //   559: ldc2_w 1921377739
    //   562: l2i
    //   563: ldc_w -847170278
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -1537049663
    //   573: l2i
    //   574: ldc_w 1702579827
    //   577: ixor
    //   578: ldc2_w 441127403
    //   581: l2i
    //   582: ldc_w 1449787759
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, -215629739 -> 1578, 1204231264 -> 570
    //   612: aload_2
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w 1834863493
    //   622: l2i
    //   623: ldc_w 1791033048
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 1032885137
    //   633: l2i
    //   634: ldc_w -976263289
    //   637: ixor
    //   638: ldc2_w -1059280499
    //   641: l2i
    //   642: ldc_w 2084343836
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -1149432628 -> 1586, -721304830 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.1 : I
    //   678: ifeq -> 692
    //   681: ldc2_w 537329643
    //   684: l2i
    //   685: ldc_w -969508786
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -583102084
    //   695: l2i
    //   696: ldc_w -993527516
    //   699: ixor
    //   700: ldc2_w -1886820808
    //   703: l2i
    //   704: ldc_w 1682859493
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 1600, -230790267 -> 736, 234325112 -> 692
    //   736: aload_0
    //   737: getstatic Perryc.c : I
    //   740: iflt -> 754
    //   743: ldc2_w -837157995
    //   746: l2i
    //   747: ldc_w -1073508663
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w 1756763039
    //   757: l2i
    //   758: ldc_w 1026878022
    //   761: ixor
    //   762: ldc2_w -1192239823
    //   765: l2i
    //   766: ldc_w -1452696413
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 796, 530330830 -> 1552, 1807731488 -> 754
    //   796: aload_3
    //   797: getstatic Perryc.1 : I
    //   800: ifeq -> 814
    //   803: ldc2_w -706542707
    //   806: l2i
    //   807: ldc_w 1397204103
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 1715557768
    //   817: l2i
    //   818: ldc_w -1289350347
    //   821: ixor
    //   822: ldc2_w 55993485
    //   825: l2i
    //   826: ldc_w 1030810128
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, -1317489774 -> 814, -1199429225 -> 1584
    //   856: putfield min : Ljava/lang/Object;
    //   859: getstatic Perryc.c : I
    //   862: iflt -> 876
    //   865: ldc2_w -225942285
    //   868: l2i
    //   869: ldc_w 1468074312
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w 662840946
    //   879: l2i
    //   880: ldc_w 1740443878
    //   883: ixor
    //   884: ldc2_w -1694447556
    //   887: l2i
    //   888: ldc_w 618979058
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 1562, -2416550 -> 920, 451771253 -> 876
    //   920: aload_0
    //   921: getstatic Perryc.1 : I
    //   924: ifeq -> 938
    //   927: ldc2_w -229857128
    //   930: l2i
    //   931: ldc_w -2033820528
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 1393789720
    //   941: l2i
    //   942: ldc_w 1163565586
    //   945: ixor
    //   946: ldc2_w 286971813
    //   949: l2i
    //   950: ldc_w -961490520
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 1598, -1558121979 -> 938, -1042082041 -> 980
    //   980: aload #4
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w -805917569
    //   991: l2i
    //   992: ldc_w -140803354
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w 1962692387
    //   1002: l2i
    //   1003: ldc_w -276739933
    //   1006: ixor
    //   1007: ldc2_w -1191423862
    //   1010: l2i
    //   1011: ldc_w -221472096
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 1044, 20452186 -> 999, 1918756019 -> 1554
    //   1044: putfield max : Ljava/lang/Object;
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w -1630386401
    //   1056: l2i
    //   1057: ldc_w -1975185945
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w -682733977
    //   1067: l2i
    //   1068: ldc_w -224084610
    //   1071: ixor
    //   1072: ldc2_w 385824124
    //   1075: l2i
    //   1076: ldc_w -1165776652
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1560, -1986629999 -> 1108, -1192503440 -> 1064
    //   1108: aload_0
    //   1109: getstatic Perryc.1 : I
    //   1112: ifeq -> 1126
    //   1115: ldc2_w -1816361591
    //   1118: l2i
    //   1119: ldc_w 855964469
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w -888399892
    //   1129: l2i
    //   1130: ldc_w 918736124
    //   1133: ixor
    //   1134: ldc2_w 1967291442
    //   1137: l2i
    //   1138: ldc_w -1557339285
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 1564, 731923529 -> 1168, 1993794021 -> 1126
    //   1168: aload_2
    //   1169: getstatic Perryc.c : I
    //   1172: iflt -> 1186
    //   1175: ldc2_w -564766208
    //   1178: l2i
    //   1179: ldc_w -1016518585
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w -1792587593
    //   1189: l2i
    //   1190: ldc_w 965574370
    //   1193: ixor
    //   1194: ldc2_w 81537604
    //   1197: l2i
    //   1198: ldc_w 88270279
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1592, -1389037098 -> 1228, 480361924 -> 1186
    //   1228: putfield plannedValue : Ljava/lang/Object;
    //   1231: getstatic Perryc.0 : I
    //   1234: ifle -> 1248
    //   1237: ldc2_w -1516698738
    //   1240: l2i
    //   1241: ldc_w -1442026786
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w 1353302100
    //   1251: l2i
    //   1252: ldc_w 2140903361
    //   1255: ixor
    //   1256: ldc2_w 2043761844
    //   1259: l2i
    //   1260: ldc_w 842973390
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, 549143615 -> 1248, 1148910890 -> 1574
    //   1292: aload_0
    //   1293: getstatic Perryc.1 : I
    //   1296: ifeq -> 1310
    //   1299: ldc2_w -373525166
    //   1302: l2i
    //   1303: ldc_w -865137056
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w 374539863
    //   1313: l2i
    //   1314: ldc_w 1010390668
    //   1317: ixor
    //   1318: ldc2_w -882736436
    //   1321: l2i
    //   1322: ldc_w 1228651356
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1558, -1484111198 -> 1310, -1473025717 -> 1352
    //   1352: aload #5
    //   1354: getstatic Perryc.0 : I
    //   1357: ifle -> 1371
    //   1360: ldc2_w -1451226918
    //   1363: l2i
    //   1364: ldc_w 2052990488
    //   1367: ixor
    //   1368: goto -> 1379
    //   1371: ldc2_w -1731681965
    //   1374: l2i
    //   1375: ldc_w -80449847
    //   1378: ixor
    //   1379: ldc2_w 840607687
    //   1382: l2i
    //   1383: ldc_w 703574349
    //   1386: ixor
    //   1387: ixor
    //   1388: lookupswitch default -> 1594, -936691640 -> 1371, 2013911312 -> 1416
    //   1416: putfield description : Ljava/lang/String;
    //   1419: getstatic Perryc.0 : I
    //   1422: ifle -> 1436
    //   1425: ldc2_w -1708460254
    //   1428: l2i
    //   1429: ldc_w 1677762164
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 807389695
    //   1439: l2i
    //   1440: ldc_w 240851173
    //   1443: ixor
    //   1444: ldc2_w 1650948939
    //   1447: l2i
    //   1448: ldc_w 1459214057
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1582, -894122764 -> 1436, 182090936 -> 1480
    //   1480: aload_0
    //   1481: ldc2_w 1856738620
    //   1484: l2i
    //   1485: ldc_w 1856738621
    //   1488: ixor
    //   1489: getstatic Perryc.c : I
    //   1492: iflt -> 1506
    //   1495: ldc2_w 675446110
    //   1498: l2i
    //   1499: ldc_w -225377739
    //   1502: ixor
    //   1503: goto -> 1514
    //   1506: ldc2_w 42737123
    //   1509: l2i
    //   1510: ldc_w -912126347
    //   1513: ixor
    //   1514: ldc2_w -1354260789
    //   1517: l2i
    //   1518: ldc_w -258969154
    //   1521: ixor
    //   1522: ixor
    //   1523: lookupswitch default -> 1548, -2063298530 -> 1588, 814312129 -> 1506
    //   1548: putfield hasRestriction : Z
    //   1551: return
    //   1552: aconst_null
    //   1553: athrow
    //   1554: aconst_null
    //   1555: athrow
    //   1556: aconst_null
    //   1557: athrow
    //   1558: aconst_null
    //   1559: athrow
    //   1560: aconst_null
    //   1561: athrow
    //   1562: aconst_null
    //   1563: athrow
    //   1564: aconst_null
    //   1565: athrow
    //   1566: aconst_null
    //   1567: athrow
    //   1568: aconst_null
    //   1569: athrow
    //   1570: aconst_null
    //   1571: athrow
    //   1572: aconst_null
    //   1573: athrow
    //   1574: aconst_null
    //   1575: athrow
    //   1576: aconst_null
    //   1577: athrow
    //   1578: aconst_null
    //   1579: athrow
    //   1580: aconst_null
    //   1581: athrow
    //   1582: aconst_null
    //   1583: athrow
    //   1584: aconst_null
    //   1585: athrow
    //   1586: aconst_null
    //   1587: athrow
    //   1588: aconst_null
    //   1589: athrow
    //   1590: aconst_null
    //   1591: athrow
    //   1592: aconst_null
    //   1593: athrow
    //   1594: aconst_null
    //   1595: athrow
    //   1596: aconst_null
    //   1597: athrow
    //   1598: aconst_null
    //   1599: athrow
    //   1600: aconst_null
    //   1601: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1552	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1552	1	name	Ljava/lang/String;
    //   0	1552	2	defaultValue	Ljava/lang/Object;
    //   0	1552	3	min	Ljava/lang/Object;
    //   0	1552	4	max	Ljava/lang/Object;
    //   0	1552	5	description	Ljava/lang/String;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1552	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1552	2	defaultValue	TT;
    //   0	1552	3	min	TT;
    //   0	1552	4	max	TT;
  }
  
  public int currentEnum() {
    return Perry1.3c(this, (int)-936550865L ^ 0xE9626296);
  }
  
  public Feature getFeature() {
    return Perry1.1k(this, (int)-287775367L ^ 0x9DFC8B09);
  }
  
  public void setVisibility(Predicate<T> visibility) {
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
  
  public Object getPlannedValue() {
    return Perry1.2e(this, (int)-894632661L ^ 0x88FCA9DC);
  }
  
  public boolean isNumberSetting() {
    return Perry1.4B(this, (int)328427072L ^ 0x69F75989);
  }
  
  public Setting(String name, T defaultValue, T min, T max) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1396306250
    //   9: l2i
    //   10: ldc_w -1663231373
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 803791997
    //   20: l2i
    //   21: ldc_w -1834285050
    //   24: ixor
    //   25: ldc2_w 1267053893
    //   28: l2i
    //   29: ldc_w 1855520340
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -352739288 -> 1516, -241464765 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -723574990
    //   70: l2i
    //   71: ldc_w -1088761722
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 597893638
    //   81: l2i
    //   82: ldc_w 1184202627
    //   85: ixor
    //   86: ldc2_w 405428343
    //   89: l2i
    //   90: ldc_w 959820930
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -2114104541 -> 78, 1255809857 -> 1512
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.1 : I
    //   126: ifeq -> 140
    //   129: ldc2_w -1721281834
    //   132: l2i
    //   133: ldc_w -1438669615
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 632612752
    //   143: l2i
    //   144: ldc_w 407694832
    //   147: ixor
    //   148: ldc2_w 1671056531
    //   151: l2i
    //   152: ldc_w -552165455
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -1881922267 -> 1502, -374798878 -> 140
    //   184: aload_0
    //   185: getstatic Perryc.0 : I
    //   188: ifle -> 202
    //   191: ldc2_w -628738080
    //   194: l2i
    //   195: ldc_w 1081871322
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w 804301222
    //   205: l2i
    //   206: ldc_w -1316430304
    //   209: ixor
    //   210: ldc2_w -263444228
    //   213: l2i
    //   214: ldc_w 651858396
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -1747530622 -> 202, 1282180378 -> 1524
    //   244: aload_1
    //   245: getstatic Perryc.1 : I
    //   248: ifeq -> 262
    //   251: ldc2_w -1837004012
    //   254: l2i
    //   255: ldc_w -153979368
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -644593263
    //   265: l2i
    //   266: ldc_w -1792104240
    //   269: ixor
    //   270: ldc2_w -1271431781
    //   273: l2i
    //   274: ldc_w 324909757
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1064454090 -> 262, -1019659734 -> 1496
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.0 : I
    //   310: ifle -> 324
    //   313: ldc2_w 1884802530
    //   316: l2i
    //   317: ldc_w -821909711
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 1738071110
    //   327: l2i
    //   328: ldc_w 1273235795
    //   331: ixor
    //   332: ldc2_w 1940503730
    //   335: l2i
    //   336: ldc_w -1192357328
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 1506, -415532137 -> 368, 1947386961 -> 324
    //   368: aload_0
    //   369: getstatic Perryc.c : I
    //   372: iflt -> 386
    //   375: ldc2_w -726622960
    //   378: l2i
    //   379: ldc_w 1333032441
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -1325909263
    //   389: l2i
    //   390: ldc_w -142081397
    //   393: ixor
    //   394: ldc2_w -338130381
    //   397: l2i
    //   398: ldc_w -1619686281
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 1498, -278270291 -> 386, 870137406 -> 428
    //   428: aload_2
    //   429: getstatic Perryc.0 : I
    //   432: ifle -> 446
    //   435: ldc2_w 1594931196
    //   438: l2i
    //   439: ldc_w 170097607
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 589276649
    //   449: l2i
    //   450: ldc_w 1013980939
    //   453: ixor
    //   454: ldc2_w -1419754942
    //   457: l2i
    //   458: ldc_w -1819723060
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 1504, 663143020 -> 488, 1843049653 -> 446
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.c : I
    //   494: iflt -> 508
    //   497: ldc2_w 2099690199
    //   500: l2i
    //   501: ldc_w -1990608520
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w 1073199172
    //   511: l2i
    //   512: ldc_w -1008697191
    //   515: ixor
    //   516: ldc2_w -1724974605
    //   519: l2i
    //   520: ldc_w -1427313313
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 1520, -943909117 -> 508, -808113039 -> 552
    //   552: aload_0
    //   553: getstatic Perryc.1 : I
    //   556: ifeq -> 570
    //   559: ldc2_w 757695529
    //   562: l2i
    //   563: ldc_w -1907341462
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -824128448
    //   573: l2i
    //   574: ldc_w 1564031445
    //   577: ixor
    //   578: ldc2_w -366175308
    //   581: l2i
    //   582: ldc_w 700335708
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 1536, 1347102845 -> 612, 1626021547 -> 570
    //   612: aload_2
    //   613: getstatic Perryc.1 : I
    //   616: ifeq -> 630
    //   619: ldc2_w -2006486660
    //   622: l2i
    //   623: ldc_w 1938238256
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 1185881845
    //   633: l2i
    //   634: ldc_w -724169182
    //   637: ixor
    //   638: ldc2_w -130352068
    //   641: l2i
    //   642: ldc_w 1296624992
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 1500, 655032715 -> 672, 1318210320 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w -1610951016
    //   684: l2i
    //   685: ldc_w 1476376829
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -564351918
    //   695: l2i
    //   696: ldc_w 1497363806
    //   699: ixor
    //   700: ldc2_w 811420420
    //   703: l2i
    //   704: ldc_w 738852042
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -732833365 -> 1492, 1952599361 -> 692
    //   736: aload_0
    //   737: getstatic Perryc.0 : I
    //   740: ifle -> 754
    //   743: ldc2_w -78315733
    //   746: l2i
    //   747: ldc_w -256451805
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -2044199717
    //   757: l2i
    //   758: ldc_w -456680008
    //   761: ixor
    //   762: ldc2_w 1452021519
    //   765: l2i
    //   766: ldc_w -1057897734
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 1532, -1650462211 -> 754, -190991210 -> 796
    //   796: aload_3
    //   797: getstatic Perryc.1 : I
    //   800: ifeq -> 814
    //   803: ldc2_w -2028252079
    //   806: l2i
    //   807: ldc_w 32186025
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 1500671856
    //   817: l2i
    //   818: ldc_w -1506446216
    //   821: ixor
    //   822: ldc2_w 1753794055
    //   825: l2i
    //   826: ldc_w 378456497
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 1526, -2126441282 -> 856, -118078130 -> 814
    //   856: putfield min : Ljava/lang/Object;
    //   859: getstatic Perryc.c : I
    //   862: iflt -> 876
    //   865: ldc2_w 644776951
    //   868: l2i
    //   869: ldc_w 410704608
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -952939287
    //   879: l2i
    //   880: ldc_w -1646751089
    //   883: ixor
    //   884: ldc2_w -1529995458
    //   887: l2i
    //   888: ldc_w -986026993
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 1494, 991931735 -> 920, 1608526374 -> 876
    //   920: aload_0
    //   921: getstatic Perryc.1 : I
    //   924: ifeq -> 938
    //   927: ldc2_w 1475646482
    //   930: l2i
    //   931: ldc_w 103330303
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 1329093786
    //   941: l2i
    //   942: ldc_w 874964826
    //   945: ixor
    //   946: ldc2_w -1524613931
    //   949: l2i
    //   950: ldc_w 610100288
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 980, -794722952 -> 1522, 1787867532 -> 938
    //   980: aload #4
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w 944128196
    //   991: l2i
    //   992: ldc_w 931125923
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w 423253808
    //   1002: l2i
    //   1003: ldc_w 257405199
    //   1006: ixor
    //   1007: ldc2_w 372533254
    //   1010: l2i
    //   1011: ldc_w 1437004650
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 1534, 1286275339 -> 999, 1442807123 -> 1044
    //   1044: putfield max : Ljava/lang/Object;
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w 2117064884
    //   1056: l2i
    //   1057: ldc_w 1333378432
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w -238142548
    //   1067: l2i
    //   1068: ldc_w -1822178115
    //   1071: ixor
    //   1072: ldc2_w 1371689666
    //   1075: l2i
    //   1076: ldc_w -21755935
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1508, -1642057705 -> 1064, -841242062 -> 1108
    //   1108: aload_0
    //   1109: getstatic Perryc.c : I
    //   1112: iflt -> 1126
    //   1115: ldc2_w 2002874308
    //   1118: l2i
    //   1119: ldc_w 59037183
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w 191338565
    //   1129: l2i
    //   1130: ldc_w -1789614220
    //   1133: ixor
    //   1134: ldc2_w -423455008
    //   1137: l2i
    //   1138: ldc_w 813047384
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 1530, -1571736957 -> 1126, 1216853897 -> 1168
    //   1168: aload_2
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w 1709713150
    //   1178: l2i
    //   1179: ldc_w -1828380538
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w -1391397699
    //   1189: l2i
    //   1190: ldc_w 475912284
    //   1193: ixor
    //   1194: ldc2_w 504683045
    //   1197: l2i
    //   1198: ldc_w 1358294485
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1518, -1207160440 -> 1186, -5498095 -> 1228
    //   1228: putfield plannedValue : Ljava/lang/Object;
    //   1231: getstatic Perryc.c : I
    //   1234: iflt -> 1248
    //   1237: ldc2_w 1859684932
    //   1240: l2i
    //   1241: ldc_w 590329408
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w 1996098284
    //   1251: l2i
    //   1252: ldc_w 765529468
    //   1255: ixor
    //   1256: ldc2_w -1881783297
    //   1259: l2i
    //   1260: ldc_w -1280702572
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1514, 1730626555 -> 1292, 1904965743 -> 1248
    //   1292: aload_0
    //   1293: ldc ''
    //   1295: getstatic Perryc.0 : I
    //   1298: ifle -> 1312
    //   1301: ldc2_w 1772723249
    //   1304: l2i
    //   1305: ldc_w -1688081763
    //   1308: ixor
    //   1309: goto -> 1320
    //   1312: ldc2_w 805978939
    //   1315: l2i
    //   1316: ldc_w -181798299
    //   1319: ixor
    //   1320: ldc2_w -628002677
    //   1323: l2i
    //   1324: ldc_w 1446118605
    //   1327: ixor
    //   1328: ixor
    //   1329: lookupswitch default -> 1356, 431945397 -> 1312, 2120942314 -> 1528
    //   1356: putfield description : Ljava/lang/String;
    //   1359: getstatic Perryc.0 : I
    //   1362: ifle -> 1376
    //   1365: ldc2_w 923191781
    //   1368: l2i
    //   1369: ldc_w 1361272669
    //   1372: ixor
    //   1373: goto -> 1384
    //   1376: ldc2_w -1210401127
    //   1379: l2i
    //   1380: ldc_w -898087909
    //   1383: ixor
    //   1384: ldc2_w 255906612
    //   1387: l2i
    //   1388: ldc_w 552711137
    //   1391: ixor
    //   1392: ixor
    //   1393: lookupswitch default -> 1538, 1234499181 -> 1376, 1377016407 -> 1420
    //   1420: aload_0
    //   1421: ldc2_w -994947691
    //   1424: l2i
    //   1425: ldc_w -994947692
    //   1428: ixor
    //   1429: getstatic Perryc.0 : I
    //   1432: ifle -> 1446
    //   1435: ldc2_w -1093444900
    //   1438: l2i
    //   1439: ldc_w 749173151
    //   1442: ixor
    //   1443: goto -> 1454
    //   1446: ldc2_w -144373723
    //   1449: l2i
    //   1450: ldc_w 67177351
    //   1453: ixor
    //   1454: ldc2_w 43345585
    //   1457: l2i
    //   1458: ldc_w 1529865120
    //   1461: ixor
    //   1462: ixor
    //   1463: lookupswitch default -> 1488, -875649454 -> 1510, 1565964697 -> 1446
    //   1488: putfield hasRestriction : Z
    //   1491: return
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1492	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1492	1	name	Ljava/lang/String;
    //   0	1492	2	defaultValue	Ljava/lang/Object;
    //   0	1492	3	min	Ljava/lang/Object;
    //   0	1492	4	max	Ljava/lang/Object;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1492	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1492	2	defaultValue	TT;
    //   0	1492	3	min	TT;
    //   0	1492	4	max	TT;
  }
  
  public boolean isVisible() {
    return Perry1.4J(this, (int)-1502487320L ^ 0xAEC02B75);
  }
  
  public void setValueNoEvent(Object paramObject) {
    Perry1.1m(this, (int)1205152167L ^ 0x7C23E6C7, paramObject);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Object getMin() {
    return Perry1.2e(this, (int)1449282906L ^ 0x143219AC);
  }
  
  public String getName() {
    return Perry1.l(this, (int)1415448386L ^ 0x3CB6E92D);
  }
  
  public Setting(String name, T defaultValue, String description) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 903337115
    //   9: l2i
    //   10: ldc_w 914795133
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1918380686
    //   20: l2i
    //   21: ldc_w 1695169095
    //   24: ixor
    //   25: ldc2_w -1325317852
    //   28: l2i
    //   29: ldc_w -251122998
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1942066417 -> 17, 1129846024 -> 1056
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1588785100
    //   70: l2i
    //   71: ldc_w 807778714
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 237966249
    //   81: l2i
    //   82: ldc_w 213896674
    //   85: ixor
    //   86: ldc2_w -2122894728
    //   89: l2i
    //   90: ldc_w -226982783
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -496558249 -> 1074, 769389294 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 2069067216
    //   132: l2i
    //   133: ldc_w -2032731152
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -2129581337
    //   143: l2i
    //   144: ldc_w 1236550099
    //   147: ixor
    //   148: ldc2_w -998305805
    //   151: l2i
    //   152: ldc_w 728186865
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 1054, 312327714 -> 140, 666721078 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.c : I
    //   188: iflt -> 202
    //   191: ldc2_w 1925320762
    //   194: l2i
    //   195: ldc_w 1806867541
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -240944740
    //   205: l2i
    //   206: ldc_w 1039095938
    //   209: ixor
    //   210: ldc2_w -1135236543
    //   213: l2i
    //   214: ldc_w -1422611764
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 1076, -617799277 -> 244, 236031202 -> 202
    //   244: aload_1
    //   245: getstatic Perryc.1 : I
    //   248: ifeq -> 262
    //   251: ldc2_w 1903462977
    //   254: l2i
    //   255: ldc_w -566218710
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -1440326316
    //   265: l2i
    //   266: ldc_w 1420418097
    //   269: ixor
    //   270: ldc2_w 1937621051
    //   273: l2i
    //   274: ldc_w 2016511303
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 1066, -1535574249 -> 262, -171719655 -> 304
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.0 : I
    //   310: ifle -> 324
    //   313: ldc2_w 549587912
    //   316: l2i
    //   317: ldc_w -130886784
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 355831842
    //   327: l2i
    //   328: ldc_w 928276147
    //   331: ixor
    //   332: ldc2_w -85758494
    //   335: l2i
    //   336: ldc_w -400195221
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 1052, -902417215 -> 324, 816259608 -> 368
    //   368: aload_0
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -857828586
    //   378: l2i
    //   379: ldc_w 1185495420
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 443836377
    //   389: l2i
    //   390: ldc_w -1747451948
    //   393: ixor
    //   394: ldc2_w -774672744
    //   397: l2i
    //   398: ldc_w 140923716
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -790721303 -> 386, 1405261750 -> 1058
    //   428: aload_2
    //   429: getstatic Perryc.1 : I
    //   432: ifeq -> 446
    //   435: ldc2_w -1351687083
    //   438: l2i
    //   439: ldc_w 1262424099
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 1305738120
    //   449: l2i
    //   450: ldc_w 158449546
    //   453: ixor
    //   454: ldc2_w 268332639
    //   457: l2i
    //   458: ldc_w -1719938846
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 1044, -769131841 -> 488, 1926515403 -> 446
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w -39796662
    //   500: l2i
    //   501: ldc_w 915732658
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1119758838
    //   511: l2i
    //   512: ldc_w -1929200689
    //   515: ixor
    //   516: ldc2_w 1240104746
    //   519: l2i
    //   520: ldc_w -1016523458
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, -335946468 -> 508, 1102533356 -> 1068
    //   552: aload_0
    //   553: getstatic Perryc.c : I
    //   556: iflt -> 570
    //   559: ldc2_w 1664625132
    //   562: l2i
    //   563: ldc_w -189873201
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -1174013760
    //   573: l2i
    //   574: ldc_w -1237850799
    //   577: ixor
    //   578: ldc2_w -1241698492
    //   581: l2i
    //   582: ldc_w 569145465
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 1064, -1742517588 -> 612, 59227422 -> 570
    //   612: aload_2
    //   613: getstatic Perryc.c : I
    //   616: iflt -> 630
    //   619: ldc2_w -729782496
    //   622: l2i
    //   623: ldc_w 1200763470
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w -1837421514
    //   633: l2i
    //   634: ldc_w -203077568
    //   637: ixor
    //   638: ldc2_w -1249908711
    //   641: l2i
    //   642: ldc_w -444010586
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -1008381231 -> 1046, 1320309989 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w 1295683995
    //   684: l2i
    //   685: ldc_w -121503181
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -355542411
    //   695: l2i
    //   696: ldc_w 405029533
    //   699: ixor
    //   700: ldc2_w -1121992598
    //   703: l2i
    //   704: ldc_w 1012804053
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, 671109122 -> 692, 884570647 -> 1072
    //   736: aload_0
    //   737: getstatic Perryc.c : I
    //   740: iflt -> 754
    //   743: ldc2_w -264410145
    //   746: l2i
    //   747: ldc_w 2111048128
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -1952185770
    //   757: l2i
    //   758: ldc_w -2110473398
    //   761: ixor
    //   762: ldc2_w -1379724002
    //   765: l2i
    //   766: ldc_w -1356221508
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 796, -1895578435 -> 1050, 951844354 -> 754
    //   796: aload_2
    //   797: getstatic Perryc.1 : I
    //   800: ifeq -> 814
    //   803: ldc2_w -2122391210
    //   806: l2i
    //   807: ldc_w -1625006738
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 1128293356
    //   817: l2i
    //   818: ldc_w -1142665192
    //   821: ixor
    //   822: ldc2_w -460685363
    //   825: l2i
    //   826: ldc_w -1052252354
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 1048, -580277497 -> 856, 999761099 -> 814
    //   856: putfield plannedValue : Ljava/lang/Object;
    //   859: getstatic Perryc.0 : I
    //   862: ifle -> 876
    //   865: ldc2_w -1444991725
    //   868: l2i
    //   869: ldc_w 1882955694
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -341245239
    //   879: l2i
    //   880: ldc_w 2027942033
    //   883: ixor
    //   884: ldc2_w -330038606
    //   887: l2i
    //   888: ldc_w 736606723
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 920, 509020684 -> 1060, 1325050404 -> 876
    //   920: aload_0
    //   921: getstatic Perryc.c : I
    //   924: iflt -> 938
    //   927: ldc2_w 1105271675
    //   930: l2i
    //   931: ldc_w 1791685693
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 2143291779
    //   941: l2i
    //   942: ldc_w 1822105770
    //   945: ixor
    //   946: ldc2_w -770896291
    //   949: l2i
    //   950: ldc_w 661140675
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 1070, -565258792 -> 938, -432139337 -> 980
    //   980: aload_3
    //   981: getstatic Perryc.1 : I
    //   984: ifeq -> 998
    //   987: ldc2_w 1161029908
    //   990: l2i
    //   991: ldc_w 200516978
    //   994: ixor
    //   995: goto -> 1006
    //   998: ldc2_w -1126259910
    //   1001: l2i
    //   1002: ldc_w -1694522463
    //   1005: ixor
    //   1006: ldc2_w -373961929
    //   1009: l2i
    //   1010: ldc_w -293590274
    //   1013: ixor
    //   1014: ixor
    //   1015: lookupswitch default -> 1040, -1226839962 -> 998, 1240837551 -> 1062
    //   1040: putfield description : Ljava/lang/String;
    //   1043: return
    //   1044: aconst_null
    //   1045: athrow
    //   1046: aconst_null
    //   1047: athrow
    //   1048: aconst_null
    //   1049: athrow
    //   1050: aconst_null
    //   1051: athrow
    //   1052: aconst_null
    //   1053: athrow
    //   1054: aconst_null
    //   1055: athrow
    //   1056: aconst_null
    //   1057: athrow
    //   1058: aconst_null
    //   1059: athrow
    //   1060: aconst_null
    //   1061: athrow
    //   1062: aconst_null
    //   1063: athrow
    //   1064: aconst_null
    //   1065: athrow
    //   1066: aconst_null
    //   1067: athrow
    //   1068: aconst_null
    //   1069: athrow
    //   1070: aconst_null
    //   1071: athrow
    //   1072: aconst_null
    //   1073: athrow
    //   1074: aconst_null
    //   1075: athrow
    //   1076: aconst_null
    //   1077: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1044	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1044	1	name	Ljava/lang/String;
    //   0	1044	2	defaultValue	Ljava/lang/Object;
    //   0	1044	3	description	Ljava/lang/String;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1044	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1044	2	defaultValue	TT;
  }
  
  public Setting(String name, T defaultValue, T min, T max, Predicate<T> visibility) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -686148811
    //   9: l2i
    //   10: ldc_w 1092707002
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1721427733
    //   20: l2i
    //   21: ldc_w -1630669454
    //   24: ixor
    //   25: ldc2_w 1404120558
    //   28: l2i
    //   29: ldc_w -18304558
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 147138280 -> 17, 996330931 -> 1720
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 1637038714
    //   70: l2i
    //   71: ldc_w -1385878311
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 852318623
    //   81: l2i
    //   82: ldc_w 1636532607
    //   85: ixor
    //   86: ldc2_w 1461817188
    //   89: l2i
    //   90: ldc_w -17657213
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 1730, -90847993 -> 120, 1696926532 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w -1399826300
    //   132: l2i
    //   133: ldc_w 434857311
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1408522668
    //   143: l2i
    //   144: ldc_w 323210533
    //   147: ixor
    //   148: ldc2_w -1166436479
    //   151: l2i
    //   152: ldc_w 1938851782
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -1941050517 -> 140, 2089954716 -> 1684
    //   184: aload_0
    //   185: getstatic Perryc.0 : I
    //   188: ifle -> 202
    //   191: ldc2_w 598142112
    //   194: l2i
    //   195: ldc_w -379557942
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1834381780
    //   205: l2i
    //   206: ldc_w -1287286034
    //   209: ixor
    //   210: ldc2_w -705401038
    //   213: l2i
    //   214: ldc_w 200624943
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -620592669 -> 202, 348630903 -> 1700
    //   244: aload_1
    //   245: getstatic Perryc.0 : I
    //   248: ifle -> 262
    //   251: ldc2_w -462105418
    //   254: l2i
    //   255: ldc_w 1276727074
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1757166364
    //   265: l2i
    //   266: ldc_w -331115071
    //   269: ixor
    //   270: ldc2_w 1841031196
    //   273: l2i
    //   274: ldc_w 705794587
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1794490706 -> 262, -272113261 -> 1726
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.c : I
    //   310: iflt -> 324
    //   313: ldc2_w -2036880500
    //   316: l2i
    //   317: ldc_w -693646275
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w -711598184
    //   327: l2i
    //   328: ldc_w 362828867
    //   331: ixor
    //   332: ldc2_w 410933499
    //   335: l2i
    //   336: ldc_w -1584066137
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 1690, -371511571 -> 324, 2044641927 -> 368
    //   368: aload_0
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w 784910162
    //   378: l2i
    //   379: ldc_w 119036909
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 1841214572
    //   389: l2i
    //   390: ldc_w 566485763
    //   393: ixor
    //   394: ldc2_w -361936945
    //   397: l2i
    //   398: ldc_w -1972459819
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, 231521176 -> 386, 1238597029 -> 1724
    //   428: aload_2
    //   429: getstatic Perryc.0 : I
    //   432: ifle -> 446
    //   435: ldc2_w -171568408
    //   438: l2i
    //   439: ldc_w -523838173
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w -2011249322
    //   449: l2i
    //   450: ldc_w 951764770
    //   453: ixor
    //   454: ldc2_w -774451493
    //   457: l2i
    //   458: ldc_w -43783924
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, 968222748 -> 1688, 1846256743 -> 446
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w -1493235827
    //   500: l2i
    //   501: ldc_w 904642238
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w 788164036
    //   511: l2i
    //   512: ldc_w 844198783
    //   515: ixor
    //   516: ldc2_w 1530405737
    //   519: l2i
    //   520: ldc_w 1691188526
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 1704, -1394481292 -> 508, 593379580 -> 552
    //   552: aload_0
    //   553: getstatic Perryc.1 : I
    //   556: ifeq -> 570
    //   559: ldc2_w -916680840
    //   562: l2i
    //   563: ldc_w -1993887124
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -33897234
    //   573: l2i
    //   574: ldc_w 534880074
    //   577: ixor
    //   578: ldc2_w 693609653
    //   581: l2i
    //   582: ldc_w -1795651820
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, -36430155 -> 1718, 463103253 -> 570
    //   612: aload_2
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w 1685459689
    //   622: l2i
    //   623: ldc_w -1942004979
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 703930459
    //   633: l2i
    //   634: ldc_w 2114848044
    //   637: ixor
    //   638: ldc2_w 2053475615
    //   641: l2i
    //   642: ldc_w -489638398
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 1732, -816963990 -> 672, 1895592697 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.1 : I
    //   678: ifeq -> 692
    //   681: ldc2_w -1869103647
    //   684: l2i
    //   685: ldc_w -286891535
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1729078800
    //   695: l2i
    //   696: ldc_w -1235259305
    //   699: ixor
    //   700: ldc2_w -1514523553
    //   703: l2i
    //   704: ldc_w 908201254
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -303438487 -> 1710, 686976824 -> 692
    //   736: aload_0
    //   737: getstatic Perryc.0 : I
    //   740: ifle -> 754
    //   743: ldc2_w 797422320
    //   746: l2i
    //   747: ldc_w -1945616044
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -966435807
    //   757: l2i
    //   758: ldc_w 654922831
    //   761: ixor
    //   762: ldc2_w 1321749265
    //   765: l2i
    //   766: ldc_w -1179743149
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 796, -1425757611 -> 754, 1424569574 -> 1714
    //   796: aload_3
    //   797: getstatic Perryc.1 : I
    //   800: ifeq -> 814
    //   803: ldc2_w 2088085429
    //   806: l2i
    //   807: ldc_w 2049714882
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w -595785419
    //   817: l2i
    //   818: ldc_w 1525681205
    //   821: ixor
    //   822: ldc2_w -179852065
    //   825: l2i
    //   826: ldc_w -499856986
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, -519839477 -> 814, 288024590 -> 1686
    //   856: putfield min : Ljava/lang/Object;
    //   859: getstatic Perryc.c : I
    //   862: iflt -> 876
    //   865: ldc2_w -1447451627
    //   868: l2i
    //   869: ldc_w 1995056315
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -1437114294
    //   879: l2i
    //   880: ldc_w 2142790871
    //   883: ixor
    //   884: ldc2_w 2066064899
    //   887: l2i
    //   888: ldc_w -374522722
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 1702, 1197972992 -> 920, 1306204723 -> 876
    //   920: aload_0
    //   921: getstatic Perryc.1 : I
    //   924: ifeq -> 938
    //   927: ldc2_w -266940138
    //   930: l2i
    //   931: ldc_w -1967891628
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w 222906817
    //   941: l2i
    //   942: ldc_w 466223297
    //   945: ixor
    //   946: ldc2_w 1631608465
    //   949: l2i
    //   950: ldc_w -1020720909
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 1716, -1259724958 -> 980, -657728480 -> 938
    //   980: aload #4
    //   982: getstatic Perryc.0 : I
    //   985: ifle -> 999
    //   988: ldc2_w 836087018
    //   991: l2i
    //   992: ldc_w -887062093
    //   995: ixor
    //   996: goto -> 1007
    //   999: ldc2_w -779012488
    //   1002: l2i
    //   1003: ldc_w -515690869
    //   1006: ixor
    //   1007: ldc2_w 707243156
    //   1010: l2i
    //   1011: ldc_w -1331027763
    //   1014: ixor
    //   1015: ixor
    //   1016: lookupswitch default -> 1712, -1436576598 -> 1044, 1618518272 -> 999
    //   1044: putfield max : Ljava/lang/Object;
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w -205168239
    //   1056: l2i
    //   1057: ldc_w 293920954
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w 664876255
    //   1067: l2i
    //   1068: ldc_w 1640003823
    //   1071: ixor
    //   1072: ldc2_w 1408809370
    //   1075: l2i
    //   1076: ldc_w 1239478604
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1108, -790921192 -> 1064, -128333315 -> 1728
    //   1108: aload_0
    //   1109: getstatic Perryc.1 : I
    //   1112: ifeq -> 1126
    //   1115: ldc2_w 1203776524
    //   1118: l2i
    //   1119: ldc_w 1236057125
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w 1921877741
    //   1129: l2i
    //   1130: ldc_w -495434543
    //   1133: ixor
    //   1134: ldc2_w 1189140304
    //   1137: l2i
    //   1138: ldc_w 1083595530
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 1168, 135928947 -> 1682, 1638632913 -> 1126
    //   1168: aload_2
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w -2131185536
    //   1178: l2i
    //   1179: ldc_w 898808974
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w -224709754
    //   1189: l2i
    //   1190: ldc_w 842758489
    //   1193: ixor
    //   1194: ldc2_w -735867380
    //   1197: l2i
    //   1198: ldc_w -1227955904
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1692, -1572002413 -> 1228, -678993086 -> 1186
    //   1228: putfield plannedValue : Ljava/lang/Object;
    //   1231: getstatic Perryc.0 : I
    //   1234: ifle -> 1248
    //   1237: ldc2_w 10137390
    //   1240: l2i
    //   1241: ldc_w 124401785
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w 1963218687
    //   1251: l2i
    //   1252: ldc_w 1024772668
    //   1255: ixor
    //   1256: ldc2_w -739030443
    //   1259: l2i
    //   1260: ldc_w -1863487165
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, -909521826 -> 1248, 1156492353 -> 1708
    //   1292: aload_0
    //   1293: getstatic Perryc.1 : I
    //   1296: ifeq -> 1310
    //   1299: ldc2_w 1294606471
    //   1302: l2i
    //   1303: ldc_w -775755015
    //   1306: ixor
    //   1307: goto -> 1318
    //   1310: ldc2_w -1779019395
    //   1313: l2i
    //   1314: ldc_w -82625100
    //   1317: ixor
    //   1318: ldc2_w 1834285700
    //   1321: l2i
    //   1322: ldc_w 802226639
    //   1325: ixor
    //   1326: ixor
    //   1327: lookupswitch default -> 1352, -563269323 -> 1698, 758064198 -> 1310
    //   1352: aload #5
    //   1354: getstatic Perryc.1 : I
    //   1357: ifeq -> 1371
    //   1360: ldc2_w -1353388017
    //   1363: l2i
    //   1364: ldc_w 239084888
    //   1367: ixor
    //   1368: goto -> 1379
    //   1371: ldc2_w 475133424
    //   1374: l2i
    //   1375: ldc_w -2093076947
    //   1378: ixor
    //   1379: ldc2_w -316454621
    //   1382: l2i
    //   1383: ldc_w -1558928267
    //   1386: ixor
    //   1387: ixor
    //   1388: lookupswitch default -> 1680, -782748021 -> 1416, -282904575 -> 1371
    //   1416: putfield visibility : Ljava/util/function/Predicate;
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w 1285687407
    //   1428: l2i
    //   1429: ldc_w 112650640
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 1020773459
    //   1439: l2i
    //   1440: ldc_w -280059834
    //   1443: ixor
    //   1444: ldc2_w -1473370786
    //   1447: l2i
    //   1448: ldc_w 1067229952
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1722, -576297055 -> 1436, 1143726667 -> 1480
    //   1480: aload_0
    //   1481: ldc ''
    //   1483: getstatic Perryc.0 : I
    //   1486: ifle -> 1500
    //   1489: ldc2_w -1520347850
    //   1492: l2i
    //   1493: ldc_w 519722710
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w -224837277
    //   1503: l2i
    //   1504: ldc_w -1424413721
    //   1507: ixor
    //   1508: ldc2_w 355111204
    //   1511: l2i
    //   1512: ldc_w 604343667
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1696, -1967906889 -> 1500, 1756329683 -> 1544
    //   1544: putfield description : Ljava/lang/String;
    //   1547: getstatic Perryc.0 : I
    //   1550: ifle -> 1564
    //   1553: ldc2_w 278763150
    //   1556: l2i
    //   1557: ldc_w -549536199
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w -1425405655
    //   1567: l2i
    //   1568: ldc_w 1560993328
    //   1571: ixor
    //   1572: ldc2_w -1338254885
    //   1575: l2i
    //   1576: ldc_w 339227439
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1694, 1375944173 -> 1608, 1805697603 -> 1564
    //   1608: aload_0
    //   1609: ldc2_w -1354394704
    //   1612: l2i
    //   1613: ldc_w -1354394703
    //   1616: ixor
    //   1617: getstatic Perryc.0 : I
    //   1620: ifle -> 1634
    //   1623: ldc2_w 150573792
    //   1626: l2i
    //   1627: ldc_w -1950339984
    //   1630: ixor
    //   1631: goto -> 1642
    //   1634: ldc2_w -1432823270
    //   1637: l2i
    //   1638: ldc_w 1472844881
    //   1641: ixor
    //   1642: ldc2_w -674466968
    //   1645: l2i
    //   1646: ldc_w 382017795
    //   1649: ixor
    //   1650: ixor
    //   1651: lookupswitch default -> 1706, 1012423712 -> 1676, 1110502651 -> 1634
    //   1676: putfield hasRestriction : Z
    //   1679: return
    //   1680: aconst_null
    //   1681: athrow
    //   1682: aconst_null
    //   1683: athrow
    //   1684: aconst_null
    //   1685: athrow
    //   1686: aconst_null
    //   1687: athrow
    //   1688: aconst_null
    //   1689: athrow
    //   1690: aconst_null
    //   1691: athrow
    //   1692: aconst_null
    //   1693: athrow
    //   1694: aconst_null
    //   1695: athrow
    //   1696: aconst_null
    //   1697: athrow
    //   1698: aconst_null
    //   1699: athrow
    //   1700: aconst_null
    //   1701: athrow
    //   1702: aconst_null
    //   1703: athrow
    //   1704: aconst_null
    //   1705: athrow
    //   1706: aconst_null
    //   1707: athrow
    //   1708: aconst_null
    //   1709: athrow
    //   1710: aconst_null
    //   1711: athrow
    //   1712: aconst_null
    //   1713: athrow
    //   1714: aconst_null
    //   1715: athrow
    //   1716: aconst_null
    //   1717: athrow
    //   1718: aconst_null
    //   1719: athrow
    //   1720: aconst_null
    //   1721: athrow
    //   1722: aconst_null
    //   1723: athrow
    //   1724: aconst_null
    //   1725: athrow
    //   1726: aconst_null
    //   1727: athrow
    //   1728: aconst_null
    //   1729: athrow
    //   1730: aconst_null
    //   1731: athrow
    //   1732: aconst_null
    //   1733: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1680	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1680	1	name	Ljava/lang/String;
    //   0	1680	2	defaultValue	Ljava/lang/Object;
    //   0	1680	3	min	Ljava/lang/Object;
    //   0	1680	4	max	Ljava/lang/Object;
    //   0	1680	5	visibility	Ljava/util/function/Predicate;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1680	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1680	2	defaultValue	TT;
    //   0	1680	3	min	TT;
    //   0	1680	4	max	TT;
    //   0	1680	5	visibility	Ljava/util/function/Predicate<TT;>;
  }
  
  public Setting(String name, T defaultValue, Predicate<T> visibility) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 208994769
    //   9: l2i
    //   10: ldc_w -261985047
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1993017044
    //   20: l2i
    //   21: ldc_w -146819518
    //   24: ixor
    //   25: ldc2_w -1275298998
    //   28: l2i
    //   29: ldc_w -1561791330
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -394601471 -> 17, -318512404 -> 1056
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 1148672372
    //   70: l2i
    //   71: ldc_w -1406393402
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1833910487
    //   81: l2i
    //   82: ldc_w -497820914
    //   85: ixor
    //   86: ldc2_w 800042081
    //   89: l2i
    //   90: ldc_w 149434606
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -820189635 -> 1058, 172132654 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -2121581745
    //   132: l2i
    //   133: ldc_w -1099362922
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -445402107
    //   143: l2i
    //   144: ldc_w -1766404614
    //   147: ixor
    //   148: ldc2_w 2145714511
    //   151: l2i
    //   152: ldc_w -666473336
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 1060, -1739498722 -> 140, -731507656 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.c : I
    //   188: iflt -> 202
    //   191: ldc2_w -1768051382
    //   194: l2i
    //   195: ldc_w 993323258
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w 1143267233
    //   205: l2i
    //   206: ldc_w 1408569630
    //   209: ixor
    //   210: ldc2_w -1932440119
    //   213: l2i
    //   214: ldc_w 1661343266
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 1064, -133786284 -> 244, 1115561563 -> 202
    //   244: aload_1
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w -862355240
    //   254: l2i
    //   255: ldc_w 168943255
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1914933049
    //   265: l2i
    //   266: ldc_w -962784813
    //   269: ixor
    //   270: ldc2_w 477279252
    //   273: l2i
    //   274: ldc_w -727291011
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 1068, 240943398 -> 262, 2087338371 -> 304
    //   304: putfield name : Ljava/lang/String;
    //   307: getstatic Perryc.1 : I
    //   310: ifeq -> 324
    //   313: ldc2_w 314341324
    //   316: l2i
    //   317: ldc_w 1899545035
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 348548965
    //   327: l2i
    //   328: ldc_w -731281781
    //   331: ixor
    //   332: ldc2_w 1014610556
    //   335: l2i
    //   336: ldc_w -253041674
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 1070, -1357385843 -> 324, 205303908 -> 368
    //   368: aload_0
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w -2080157863
    //   378: l2i
    //   379: ldc_w 555963604
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 173789515
    //   389: l2i
    //   390: ldc_w -1216835933
    //   393: ixor
    //   394: ldc2_w -1093124124
    //   397: l2i
    //   398: ldc_w 312230926
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, 157573223 -> 1048, 320946289 -> 386
    //   428: aload_2
    //   429: getstatic Perryc.0 : I
    //   432: ifle -> 446
    //   435: ldc2_w -572513894
    //   438: l2i
    //   439: ldc_w -906567969
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 1618455384
    //   449: l2i
    //   450: ldc_w -11792715
    //   453: ixor
    //   454: ldc2_w 103478364
    //   457: l2i
    //   458: ldc_w 1493161209
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, 928371855 -> 446, 1254350816 -> 1074
    //   488: putfield defaultValue : Ljava/lang/Object;
    //   491: getstatic Perryc.c : I
    //   494: iflt -> 508
    //   497: ldc2_w 1379544362
    //   500: l2i
    //   501: ldc_w -1421372215
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w 107308640
    //   511: l2i
    //   512: ldc_w -942940950
    //   515: ixor
    //   516: ldc2_w 1257532125
    //   519: l2i
    //   520: ldc_w -545848091
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, -276901540 -> 508, 1828640731 -> 1044
    //   552: aload_0
    //   553: getstatic Perryc.0 : I
    //   556: ifle -> 570
    //   559: ldc2_w 123507489
    //   562: l2i
    //   563: ldc_w -1190743729
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w 1679652317
    //   573: l2i
    //   574: ldc_w -657997439
    //   577: ixor
    //   578: ldc2_w 1456585505
    //   581: l2i
    //   582: ldc_w 2138050748
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, -1745122829 -> 1076, 195212018 -> 570
    //   612: aload_2
    //   613: getstatic Perryc.1 : I
    //   616: ifeq -> 630
    //   619: ldc2_w -2012346912
    //   622: l2i
    //   623: ldc_w 2099460983
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 1554592408
    //   633: l2i
    //   634: ldc_w -1436807056
    //   637: ixor
    //   638: ldc2_w -1258339217
    //   641: l2i
    //   642: ldc_w 1798389762
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 1062, 691742341 -> 672, 719534842 -> 630
    //   672: putfield value : Ljava/lang/Object;
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w 539957721
    //   684: l2i
    //   685: ldc_w 1159793527
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1450064960
    //   695: l2i
    //   696: ldc_w 2003244867
    //   699: ixor
    //   700: ldc2_w -2004225599
    //   703: l2i
    //   704: ldc_w -134780827
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -1438391011 -> 692, 443583242 -> 1052
    //   736: aload_0
    //   737: getstatic Perryc.0 : I
    //   740: ifle -> 754
    //   743: ldc2_w -120506877
    //   746: l2i
    //   747: ldc_w 700916363
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w 536812455
    //   757: l2i
    //   758: ldc_w -2015307325
    //   761: ixor
    //   762: ldc2_w 1781051463
    //   765: l2i
    //   766: ldc_w 1291571839
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 1072, -1093885860 -> 796, -138053968 -> 754
    //   796: aload_3
    //   797: getstatic Perryc.0 : I
    //   800: ifle -> 814
    //   803: ldc2_w -301379677
    //   806: l2i
    //   807: ldc_w 1358148639
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w -1211659051
    //   817: l2i
    //   818: ldc_w 632090641
    //   821: ixor
    //   822: ldc2_w -1324341743
    //   825: l2i
    //   826: ldc_w -6763330
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 1054, -589064597 -> 856, -260959981 -> 814
    //   856: putfield visibility : Ljava/util/function/Predicate;
    //   859: getstatic Perryc.1 : I
    //   862: ifeq -> 876
    //   865: ldc2_w 605593111
    //   868: l2i
    //   869: ldc_w 1507900702
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w 1396741687
    //   879: l2i
    //   880: ldc_w -1375684608
    //   883: ixor
    //   884: ldc2_w 151472976
    //   887: l2i
    //   888: ldc_w 48868004
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 920, -1003476646 -> 876, 1981203197 -> 1050
    //   920: aload_0
    //   921: getstatic Perryc.1 : I
    //   924: ifeq -> 938
    //   927: ldc2_w -315714718
    //   930: l2i
    //   931: ldc_w -1126265106
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w -1086942270
    //   941: l2i
    //   942: ldc_w -2035646482
    //   945: ixor
    //   946: ldc2_w 524157791
    //   949: l2i
    //   950: ldc_w 1257539933
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 980, 70948750 -> 1046, 1111209837 -> 938
    //   980: aload_2
    //   981: getstatic Perryc.c : I
    //   984: iflt -> 998
    //   987: ldc2_w 1878569000
    //   990: l2i
    //   991: ldc_w -1104473239
    //   994: ixor
    //   995: goto -> 1006
    //   998: ldc2_w 707853055
    //   1001: l2i
    //   1002: ldc_w -600057452
    //   1005: ixor
    //   1006: ldc2_w 1959150617
    //   1009: l2i
    //   1010: ldc_w -2036769139
    //   1013: ixor
    //   1014: ixor
    //   1015: lookupswitch default -> 1040, -125986105 -> 998, 596425173 -> 1066
    //   1040: putfield plannedValue : Ljava/lang/Object;
    //   1043: return
    //   1044: aconst_null
    //   1045: athrow
    //   1046: aconst_null
    //   1047: athrow
    //   1048: aconst_null
    //   1049: athrow
    //   1050: aconst_null
    //   1051: athrow
    //   1052: aconst_null
    //   1053: athrow
    //   1054: aconst_null
    //   1055: athrow
    //   1056: aconst_null
    //   1057: athrow
    //   1058: aconst_null
    //   1059: athrow
    //   1060: aconst_null
    //   1061: athrow
    //   1062: aconst_null
    //   1063: athrow
    //   1064: aconst_null
    //   1065: athrow
    //   1066: aconst_null
    //   1067: athrow
    //   1068: aconst_null
    //   1069: athrow
    //   1070: aconst_null
    //   1071: athrow
    //   1072: aconst_null
    //   1073: athrow
    //   1074: aconst_null
    //   1075: athrow
    //   1076: aconst_null
    //   1077: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1044	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   0	1044	1	name	Ljava/lang/String;
    //   0	1044	2	defaultValue	Ljava/lang/Object;
    //   0	1044	3	visibility	Ljava/util/function/Predicate;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	1044	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   0	1044	2	defaultValue	TT;
    //   0	1044	3	visibility	Ljava/util/function/Predicate<TT;>;
  }
  
  public String getValueAsString() {
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
  
  public int getEnum(String input) {
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
  
  public void setEnumValue(String value) {
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
  
  public void setFeature(Feature feature) {
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
  
  public Object getDefaultValue() {
    return Perry1.2h(this, (int)-1565786236L ^ 0xD9EE50DC);
  }
  
  public String getClassName(T value) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 259
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 251
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 243
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1258309738
    //   33: l2i
    //   34: ldc_w 282220245
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 528043649
    //   44: l2i
    //   45: ldc_w -194081336
    //   48: ixor
    //   49: ldc2_w 1686645813
    //   52: l2i
    //   53: ldc_w -813557840
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -254270150 -> 228, 1930229691 -> 41
    //   84: aload_1
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -2035446884
    //   94: l2i
    //   95: ldc_w -791981062
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -146841148
    //   105: l2i
    //   106: ldc_w 1233301516
    //   109: ixor
    //   110: ldc2_w 209896853
    //   113: l2i
    //   114: ldc_w 1040493452
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, 1217077498 -> 102, 1692448383 -> 230
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getClass : ()Ljava/lang/Class;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w 423294090
    //   164: l2i
    //   165: ldc_w -965696348
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -2063976846
    //   175: l2i
    //   176: ldc_w 303216773
    //   179: ixor
    //   180: ldc2_w 182218405
    //   183: l2i
    //   184: ldc_w 1386361766
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 232, -2026631891 -> 172, -828976140 -> 216
    //   216: goto -> 220
    //   219: athrow
    //   220: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   223: goto -> 227
    //   226: athrow
    //   227: areturn
    //   228: aconst_null
    //   229: athrow
    //   230: aconst_null
    //   231: athrow
    //   232: aconst_null
    //   233: athrow
    //   234: pop
    //   235: goto -> 24
    //   238: pop
    //   239: aconst_null
    //   240: goto -> 234
    //   243: dup
    //   244: ifnull -> 234
    //   247: checkcast java/lang/Throwable
    //   250: athrow
    //   251: dup
    //   252: ifnull -> 238
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: aconst_null
    //   260: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	204	0	this	Lbigname/zprestige/webhack/features/setting/Setting;
    //   24	204	1	value	Ljava/lang/Object;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	204	0	this	Lbigname/zprestige/webhack/features/setting/Setting<TT;>;
    //   24	204	1	value	TT;
    // Exception table:
    //   from	to	target	type
    //   8	20	243	java/lang/NullPointerException
    //   147	154	154	finally
    //   147	154	147	java/util/ConcurrentModificationException
    //   147	154	3	finally
    //   148	154	147	finally
    //   148	154	154	finally
    //   219	226	226	finally
    //   219	226	219	finally
    //   219	226	3	java/lang/UnsupportedOperationException
    //   219	226	3	java/lang/StringIndexOutOfBoundsException
    //   220	226	3	java/lang/RuntimeException
    //   243	251	243	java/lang/NumberFormatException
    //   259	261	3	java/lang/NumberFormatException
  }
  
  public Object getValue() {
    return Perry1.2a(this, (int)1581320363L ^ 0xE2F290A);
  }
  
  public String getType() {
    return Perry1.i(this, (int)995003107L ^ 0x643AC6D1);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\setting\Setting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */