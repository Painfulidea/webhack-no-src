package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import Perryc;
import com.google.gson.annotations.SerializedName;

public class UtilFour extends UtilThree {
  public String username;
  
  @SerializedName("avatar_url")
  public String avatarUrl;
  
  public String content;
  
  @SerializedName("tts")
  public boolean textToSpeech;
  
  public void checkCapeUrl(String avatarUrl) {
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
  
  public UtilFour(String username, String content, String avatar_url, boolean tts) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1861466276
    //   9: l2i
    //   10: ldc 148675496
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1588563700
    //   19: l2i
    //   20: ldc -1917248264
    //   22: ixor
    //   23: ldc2_w 568575113
    //   26: l2i
    //   27: ldc 2130786181
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 858, 953012224 -> 16, 1913364216 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 770171467
    //   66: l2i
    //   67: ldc 817354942
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 2070997932
    //   76: l2i
    //   77: ldc 1084870022
    //   79: ixor
    //   80: ldc2_w -47340483
    //   83: l2i
    //   84: ldc -428508944
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 101246520 -> 852, 711463433 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 706479933
    //   128: l2i
    //   129: ldc 552052499
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -2107625520
    //   138: l2i
    //   139: ldc 1447872633
    //   141: ixor
    //   142: ldc2_w -1631482927
    //   145: l2i
    //   146: ldc -785890936
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 840, -1681576464 -> 176, 1158834807 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w 1994261056
    //   186: l2i
    //   187: ldc 2102748888
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 871214937
    //   196: l2i
    //   197: ldc -34960301
    //   199: ixor
    //   200: ldc2_w -983615207
    //   203: l2i
    //   204: ldc -389530334
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, 639393955 -> 844, 2024907919 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w 1982848007
    //   246: l2i
    //   247: ldc 1071373180
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 72463787
    //   256: l2i
    //   257: ldc -446354082
    //   259: ixor
    //   260: ldc2_w 2021034792
    //   263: l2i
    //   264: ldc 1683676651
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -1123082955 -> 253, 1440240056 -> 850
    //   296: invokevirtual capeUsername : (Ljava/lang/String;)V
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w 350250085
    //   308: l2i
    //   309: ldc -287471340
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -1716986967
    //   318: l2i
    //   319: ldc -1319924788
    //   321: ixor
    //   322: ldc2_w 1858581394
    //   325: l2i
    //   326: ldc -1348675788
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 846, -375376701 -> 356, 996575703 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 373
    //   363: ldc2_w 908001962
    //   366: l2i
    //   367: ldc -2141544280
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 345425490
    //   376: l2i
    //   377: ldc 2068405752
    //   379: ixor
    //   380: ldc2_w 1008352163
    //   383: l2i
    //   384: ldc -1694429892
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1895107662 -> 373, 291411101 -> 856
    //   416: aload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w -1999150922
    //   426: l2i
    //   427: ldc 1074778854
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 140140204
    //   436: l2i
    //   437: ldc 1872738652
    //   439: ixor
    //   440: ldc2_w -587725743
    //   443: l2i
    //   444: ldc 1933048809
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 860, -938862520 -> 476, 1729580520 -> 433
    //   476: invokevirtual setCape : (Ljava/lang/String;)V
    //   479: getstatic Perryc.1 : I
    //   482: ifeq -> 495
    //   485: ldc2_w -1429614448
    //   488: l2i
    //   489: ldc 903981215
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w 1703364018
    //   498: l2i
    //   499: ldc 1024146529
    //   501: ixor
    //   502: ldc2_w -753564941
    //   505: l2i
    //   506: ldc -435137359
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 848, -1439846835 -> 495, 1837739921 -> 536
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w -1569175932
    //   546: l2i
    //   547: ldc -1860660361
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w -1845123750
    //   556: l2i
    //   557: ldc -1066161158
    //   559: ixor
    //   560: ldc2_w -1749291860
    //   563: l2i
    //   564: ldc 780728405
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 864, -1974222582 -> 553, -347792807 -> 596
    //   596: aload_3
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 613
    //   603: ldc2_w 1606922995
    //   606: l2i
    //   607: ldc -482654130
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w 895978952
    //   616: l2i
    //   617: ldc -1625717246
    //   619: ixor
    //   620: ldc2_w 719769281
    //   623: l2i
    //   624: ldc 1318014861
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 866, -837318010 -> 656, -661292047 -> 613
    //   656: invokevirtual checkCapeUrl : (Ljava/lang/String;)V
    //   659: getstatic Perryc.0 : I
    //   662: ifle -> 675
    //   665: ldc2_w 1603272322
    //   668: l2i
    //   669: ldc 1727187504
    //   671: ixor
    //   672: goto -> 682
    //   675: ldc2_w -1388756501
    //   678: l2i
    //   679: ldc -1052197830
    //   681: ixor
    //   682: ldc2_w 1071968349
    //   685: l2i
    //   686: ldc -2030390785
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 842, -2140965616 -> 675, -714097549 -> 716
    //   716: aload_0
    //   717: getstatic Perryc.c : I
    //   720: iflt -> 733
    //   723: ldc2_w -1361426862
    //   726: l2i
    //   727: ldc -1819990034
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w -1575140757
    //   736: l2i
    //   737: ldc -1472347269
    //   739: ixor
    //   740: ldc2_w -423619298
    //   743: l2i
    //   744: ldc -725819208
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 854, 253989914 -> 733, 945583286 -> 776
    //   776: iload #4
    //   778: getstatic Perryc.1 : I
    //   781: ifeq -> 794
    //   784: ldc2_w -1996186040
    //   787: l2i
    //   788: ldc -1368565835
    //   790: ixor
    //   791: goto -> 801
    //   794: ldc2_w -477606990
    //   797: l2i
    //   798: ldc -1057478459
    //   800: ixor
    //   801: ldc2_w 1604647971
    //   804: l2i
    //   805: ldc 1453626988
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 862, 711985464 -> 836, 778675122 -> 794
    //   836: invokevirtual isDev : (Z)V
    //   839: return
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	840	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilFour;
    //   0	840	1	username	Ljava/lang/String;
    //   0	840	2	content	Ljava/lang/String;
    //   0	840	3	avatar_url	Ljava/lang/String;
    //   0	840	4	tts	Z
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void isDev(boolean paramBoolean) {
    Perry1.65(this, (int)-574923682L ^ 0xBE6649A2, paramBoolean);
  }
  
  public void setCape(String paramString) {
    Perry1.1f(this, (int)673815349L ^ 0x78DE7FBE, paramString);
  }
  
  public void capeUsername(String paramString) {
    Perry1.1a(this, (int)-1203300021L ^ 0xCCB194C8, paramString);
  }
  
  public UtilFour(String content) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -1094791784
    //   9: l2i
    //   10: ldc -924024231
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 410845223
    //   19: l2i
    //   20: ldc 1272546606
    //   22: ixor
    //   23: ldc2_w 826616450
    //   26: l2i
    //   27: ldc -2044393389
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 190, -1053659888 -> 16, -456874024 -> 56
    //   56: aload_0
    //   57: aconst_null
    //   58: getstatic Perryc.1 : I
    //   61: ifeq -> 74
    //   64: ldc2_w 1932659787
    //   67: l2i
    //   68: ldc -505751080
    //   70: ixor
    //   71: goto -> 81
    //   74: ldc2_w -813878306
    //   77: l2i
    //   78: ldc 968567890
    //   80: ixor
    //   81: ldc2_w 125913119
    //   84: l2i
    //   85: ldc -1275813131
    //   87: ixor
    //   88: ixor
    //   89: lookupswitch default -> 188, 647839609 -> 74, 1119090022 -> 116
    //   116: aload_1
    //   117: aconst_null
    //   118: ldc2_w -741767038
    //   121: l2i
    //   122: ldc -741767038
    //   124: ixor
    //   125: getstatic Perryc.c : I
    //   128: iflt -> 142
    //   131: ldc2_w -2075526411
    //   134: l2i
    //   135: ldc_w -1616210842
    //   138: ixor
    //   139: goto -> 150
    //   142: ldc2_w -1881619807
    //   145: l2i
    //   146: ldc_w 436087838
    //   149: ixor
    //   150: ldc2_w 755033982
    //   153: l2i
    //   154: ldc_w 1340262084
    //   157: ixor
    //   158: ixor
    //   159: lookupswitch default -> 192, -188428539 -> 184, 2030128937 -> 142
    //   184: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   187: return
    //   188: aconst_null
    //   189: athrow
    //   190: aconst_null
    //   191: athrow
    //   192: aconst_null
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	188	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilFour;
    //   0	188	1	content	Ljava/lang/String;
  }
  
  public UtilFour(String username, String content, String avatar_url) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 815274716
    //   9: l2i
    //   10: ldc_w 1719841015
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1205570739
    //   20: l2i
    //   21: ldc_w -1628466004
    //   24: ixor
    //   25: ldc2_w 1045227350
    //   28: l2i
    //   29: ldc_w -407636172
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 312, -1880769975 -> 17, -13305981 -> 60
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -65182682
    //   70: l2i
    //   71: ldc_w -1614560247
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1020024459
    //   81: l2i
    //   82: ldc_w -2012097893
    //   85: ixor
    //   86: ldc2_w 1194881272
    //   89: l2i
    //   90: ldc_w 522580599
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -933100722 -> 78, 1002644128 -> 314
    //   120: aload_1
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 138
    //   127: ldc2_w 2074912169
    //   130: l2i
    //   131: ldc_w 153056021
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w 960994636
    //   141: l2i
    //   142: ldc_w -986631828
    //   145: ixor
    //   146: ldc2_w 218694571
    //   149: l2i
    //   150: ldc_w -1034889552
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 180, -1108737113 -> 320, -697238562 -> 138
    //   180: aload_2
    //   181: getstatic Perryc.1 : I
    //   184: ifeq -> 198
    //   187: ldc2_w -912570972
    //   190: l2i
    //   191: ldc_w -703863334
    //   194: ixor
    //   195: goto -> 206
    //   198: ldc2_w 1654336191
    //   201: l2i
    //   202: ldc_w -1238178349
    //   205: ixor
    //   206: ldc2_w -958531765
    //   209: l2i
    //   210: ldc_w 773118822
    //   213: ixor
    //   214: ixor
    //   215: lookupswitch default -> 318, -145126317 -> 198, 1012982593 -> 240
    //   240: aload_3
    //   241: ldc2_w -584386917
    //   244: l2i
    //   245: ldc_w -584386917
    //   248: ixor
    //   249: getstatic Perryc.0 : I
    //   252: ifle -> 266
    //   255: ldc2_w 1564213237
    //   258: l2i
    //   259: ldc_w 311916195
    //   262: ixor
    //   263: goto -> 274
    //   266: ldc2_w -1498835991
    //   269: l2i
    //   270: ldc_w 186578217
    //   273: ixor
    //   274: ldc2_w -1418133437
    //   277: l2i
    //   278: ldc_w -2096796606
    //   281: ixor
    //   282: ixor
    //   283: lookupswitch default -> 308, -513101358 -> 266, 1741743447 -> 316
    //   308: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   311: return
    //   312: aconst_null
    //   313: athrow
    //   314: aconst_null
    //   315: athrow
    //   316: aconst_null
    //   317: athrow
    //   318: aconst_null
    //   319: athrow
    //   320: aconst_null
    //   321: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	312	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilFour;
    //   0	312	1	username	Ljava/lang/String;
    //   0	312	2	content	Ljava/lang/String;
    //   0	312	3	avatar_url	Ljava/lang/String;
  }
  
  public UtilFour() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -2024719323
    //   9: l2i
    //   10: ldc_w 225037016
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1436430808
    //   20: l2i
    //   21: ldc_w -1319438656
    //   24: ixor
    //   25: ldc2_w 413576369
    //   28: l2i
    //   29: ldc_w 281691159
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -2108416421 -> 142, 1073408468 -> 17
    //   60: aload_0
    //   61: aconst_null
    //   62: ldc_w ''
    //   65: aconst_null
    //   66: ldc2_w 1796038356
    //   69: l2i
    //   70: ldc_w 1796038356
    //   73: ixor
    //   74: getstatic Perryc.0 : I
    //   77: ifle -> 91
    //   80: ldc2_w -869972689
    //   83: l2i
    //   84: ldc_w -1968381997
    //   87: ixor
    //   88: goto -> 99
    //   91: ldc2_w 1865699713
    //   94: l2i
    //   95: ldc_w -870099103
    //   98: ixor
    //   99: ldc2_w -261722626
    //   102: l2i
    //   103: ldc_w -1903415178
    //   106: ixor
    //   107: ixor
    //   108: lookupswitch default -> 140, -570598552 -> 136, 946063220 -> 91
    //   136: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   139: return
    //   140: aconst_null
    //   141: athrow
    //   142: aconst_null
    //   143: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	140	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilFour;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilFour.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */