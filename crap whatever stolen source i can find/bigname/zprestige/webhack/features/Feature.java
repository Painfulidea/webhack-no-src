package bigname.zprestige.webhack.features;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.manager.TextManager;
import bigname.zprestige.webhack.util.Util;
import java.util.List;

public class Feature implements Util {
  public String name;
  
  public TextManager renderer;
  
  public List<Setting> settings;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public boolean hasSettings() {
    return Perry1.4J(this, (int)-1852304866L ^ 0x9929E584);
  }
  
  public boolean isDisabled() {
    return Perry1.4C(this, (int)-208482899L ^ 0x8C5ABB1E);
  }
  
  public void unregister(Setting settingIn) {
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
  
  public static boolean nullCheck() {
    return Perry1.4E(null, (int)2083396880L ^ 0x7C441711);
  }
  
  public void reset() {
    Perry1.3Z(this, (int)1910138860L ^ 0x39C74776);
  }
  
  public boolean isEnabled() {
    return Perry1.4p(this, (int)-389621214L ^ 0xB4B48616);
  }
  
  public static boolean fullNullCheck() {
    return Perry1.4p(null, (int)-1271621603L ^ 0xE846C428);
  }
  
  public Feature() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 2081042590
    //   9: l2i
    //   10: ldc_w -1319190238
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1172030773
    //   20: l2i
    //   21: ldc_w -947521407
    //   24: ixor
    //   25: ldc2_w -1289169855
    //   28: l2i
    //   29: ldc_w -862296378
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1293532357 -> 506, 1557594873 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 487680547
    //   70: l2i
    //   71: ldc_w -1216355128
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1968229308
    //   81: l2i
    //   82: ldc_w -2040314562
    //   85: ixor
    //   86: ldc2_w -2024863635
    //   89: l2i
    //   90: ldc_w -1585855167
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 510, -1940372537 -> 78, 721075286 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -314494763
    //   132: l2i
    //   133: ldc_w -1321478459
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -1169121301
    //   143: l2i
    //   144: ldc_w 23969815
    //   147: ixor
    //   148: ldc2_w -93212272
    //   151: l2i
    //   152: ldc_w -984892212
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, 1561795259 -> 140, 1665198924 -> 512
    //   184: aload_0
    //   185: new java/util/ArrayList
    //   188: dup
    //   189: getstatic Perryc.1 : I
    //   192: ifeq -> 206
    //   195: ldc2_w 1629324322
    //   198: l2i
    //   199: ldc_w -2101540900
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w 307837758
    //   209: l2i
    //   210: ldc_w 1208211478
    //   213: ixor
    //   214: ldc2_w -1387840987
    //   217: l2i
    //   218: ldc_w 1289153924
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 248, 36787295 -> 518, 1849791516 -> 206
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.c : I
    //   254: iflt -> 268
    //   257: ldc2_w -2029186090
    //   260: l2i
    //   261: ldc_w -1799885955
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w -1481250435
    //   271: l2i
    //   272: ldc_w -1335966372
    //   275: ixor
    //   276: ldc2_w -1376024390
    //   279: l2i
    //   280: ldc_w 964748025
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 312, -2017357080 -> 508, 719168981 -> 268
    //   312: putfield settings : Ljava/util/List;
    //   315: getstatic Perryc.1 : I
    //   318: ifeq -> 332
    //   321: ldc2_w 1214797470
    //   324: l2i
    //   325: ldc_w -741026645
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w -212908073
    //   335: l2i
    //   336: ldc_w -944082227
    //   339: ixor
    //   340: ldc2_w -1895997120
    //   343: l2i
    //   344: ldc_w 1335949517
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 514, -173495145 -> 376, 1524702136 -> 332
    //   376: aload_0
    //   377: getstatic Perryc.0 : I
    //   380: ifle -> 394
    //   383: ldc2_w 1226184281
    //   386: l2i
    //   387: ldc_w -1324713489
    //   390: ixor
    //   391: goto -> 402
    //   394: ldc2_w 2071373696
    //   397: l2i
    //   398: ldc_w -1215948511
    //   401: ixor
    //   402: ldc2_w 126091316
    //   405: l2i
    //   406: ldc_w 1517003090
    //   409: ixor
    //   410: ixor
    //   411: lookupswitch default -> 516, -1860231225 -> 436, -1510748464 -> 394
    //   436: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   439: getstatic Perryc.0 : I
    //   442: ifle -> 456
    //   445: ldc2_w 1362730308
    //   448: l2i
    //   449: ldc_w 1318935352
    //   452: ixor
    //   453: goto -> 464
    //   456: ldc2_w -325993332
    //   459: l2i
    //   460: ldc_w -523567288
    //   463: ixor
    //   464: ldc2_w -1939519452
    //   467: l2i
    //   468: ldc_w -80603765
    //   471: ixor
    //   472: ixor
    //   473: lookupswitch default -> 500, 1326485986 -> 456, 1760795603 -> 504
    //   500: putfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   503: return
    //   504: aconst_null
    //   505: athrow
    //   506: aconst_null
    //   507: athrow
    //   508: aconst_null
    //   509: athrow
    //   510: aconst_null
    //   511: athrow
    //   512: aconst_null
    //   513: athrow
    //   514: aconst_null
    //   515: athrow
    //   516: aconst_null
    //   517: athrow
    //   518: aconst_null
    //   519: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	504	0	this	Lbigname/zprestige/webhack/features/Feature;
  }
  
  public Setting getSettingByName(String name) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1101
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1093
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1085
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1838863295
    //   33: l2i
    //   34: ldc_w -946355160
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1910264078
    //   44: l2i
    //   45: ldc_w 1713568036
    //   48: ixor
    //   49: ldc2_w 1079621611
    //   52: l2i
    //   53: ldc_w 1888755558
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -874822462 -> 41, 1698644196 -> 1052
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 414172371
    //   94: l2i
    //   95: ldc_w -940636258
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -917713760
    //   105: l2i
    //   106: ldc_w 714116700
    //   109: ixor
    //   110: ldc2_w -643457474
    //   113: l2i
    //   114: ldc_w 872637821
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1068, 242923967 -> 144, 853948430 -> 102
    //   144: getfield settings : Ljava/util/List;
    //   147: getstatic Perryc.1 : I
    //   150: ifeq -> 164
    //   153: ldc2_w -1448440532
    //   156: l2i
    //   157: ldc_w -526967173
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 1382522480
    //   167: l2i
    //   168: ldc_w -1115777171
    //   171: ixor
    //   172: ldc2_w -1438153335
    //   175: l2i
    //   176: ldc_w 1027473122
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 1048, -565712836 -> 164, 2019783286 -> 208
    //   208: goto -> 212
    //   211: athrow
    //   212: invokeinterface iterator : ()Ljava/util/Iterator;
    //   217: goto -> 221
    //   220: athrow
    //   221: getstatic Perryc.0 : I
    //   224: ifle -> 238
    //   227: ldc2_w -398189825
    //   230: l2i
    //   231: ldc_w 413446698
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w -1703237360
    //   241: l2i
    //   242: ldc_w -2107662135
    //   245: ixor
    //   246: ldc2_w 241857054
    //   249: l2i
    //   250: ldc_w -1839523120
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 280, 280720411 -> 238, 1825685531 -> 1062
    //   280: astore_2
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 298
    //   287: ldc2_w 850569400
    //   290: l2i
    //   291: ldc_w 1535778956
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 1985167935
    //   301: l2i
    //   302: ldc_w 1083805363
    //   305: ixor
    //   306: ldc2_w 627121149
    //   309: l2i
    //   310: ldc_w 1838729044
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, 566318237 -> 1058, 1427860892 -> 298
    //   340: aload_2
    //   341: getstatic Perryc.0 : I
    //   344: ifle -> 358
    //   347: ldc2_w 450866778
    //   350: l2i
    //   351: ldc_w 89302351
    //   354: ixor
    //   355: goto -> 366
    //   358: ldc2_w -224038426
    //   361: l2i
    //   362: ldc_w 1175480591
    //   365: ixor
    //   366: ldc2_w 859734319
    //   369: l2i
    //   370: ldc_w -752961967
    //   373: ixor
    //   374: ixor
    //   375: lookupswitch default -> 400, -2097148251 -> 358, -5424021 -> 1064
    //   400: goto -> 404
    //   403: athrow
    //   404: invokeinterface hasNext : ()Z
    //   409: goto -> 413
    //   412: athrow
    //   413: ifeq -> 427
    //   416: ldc2_w -1854473162
    //   419: l2i
    //   420: ldc_w 445807404
    //   423: ixor
    //   424: goto -> 435
    //   427: ldc2_w 741948455
    //   430: l2i
    //   431: ldc_w -1478640834
    //   434: ixor
    //   435: ldc2_w 396347354
    //   438: l2i
    //   439: ldc_w 606143297
    //   442: ixor
    //   443: ixor
    //   444: tableswitch default -> 416, -1202044031 -> 468, -1202044030 -> 1046
    //   468: getstatic Perryc.c : I
    //   471: iflt -> 485
    //   474: ldc2_w -2108259818
    //   477: l2i
    //   478: ldc_w -339798085
    //   481: ixor
    //   482: goto -> 493
    //   485: ldc2_w -1698065066
    //   488: l2i
    //   489: ldc_w 1826757003
    //   492: ixor
    //   493: ldc2_w -227578233
    //   496: l2i
    //   497: ldc_w 1635066899
    //   500: ixor
    //   501: ixor
    //   502: lookupswitch default -> 528, -927944221 -> 485, -84680903 -> 1060
    //   528: aload_2
    //   529: getstatic Perryc.c : I
    //   532: iflt -> 546
    //   535: ldc2_w -195551230
    //   538: l2i
    //   539: ldc_w 2143256713
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w 2095159263
    //   549: l2i
    //   550: ldc_w -496459803
    //   553: ixor
    //   554: ldc2_w 2096392964
    //   557: l2i
    //   558: ldc_w 1726255714
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 1054, -2070285988 -> 588, -1846060563 -> 546
    //   588: goto -> 592
    //   591: athrow
    //   592: invokeinterface next : ()Ljava/lang/Object;
    //   597: goto -> 601
    //   600: athrow
    //   601: checkcast bigname/zprestige/webhack/features/setting/Setting
    //   604: getstatic Perryc.c : I
    //   607: iflt -> 621
    //   610: ldc2_w 1527709915
    //   613: l2i
    //   614: ldc_w 405962166
    //   617: ixor
    //   618: goto -> 629
    //   621: ldc2_w -471473292
    //   624: l2i
    //   625: ldc_w -1400903093
    //   628: ixor
    //   629: ldc2_w -1673876290
    //   632: l2i
    //   633: ldc_w 129962999
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 664, -658980316 -> 1074, 661459625 -> 621
    //   664: astore_3
    //   665: getstatic Perryc.0 : I
    //   668: ifle -> 682
    //   671: ldc2_w 1385623968
    //   674: l2i
    //   675: ldc_w -1976747253
    //   678: ixor
    //   679: goto -> 690
    //   682: ldc2_w -1680565563
    //   685: l2i
    //   686: ldc_w 1050336944
    //   689: ixor
    //   690: ldc2_w -1828481327
    //   693: l2i
    //   694: ldc_w 797382711
    //   697: ixor
    //   698: ixor
    //   699: lookupswitch default -> 724, -65939877 -> 682, 1681867853 -> 1070
    //   724: aload_3
    //   725: getstatic Perryc.0 : I
    //   728: ifle -> 742
    //   731: ldc2_w 731461550
    //   734: l2i
    //   735: ldc_w 656521339
    //   738: ixor
    //   739: goto -> 750
    //   742: ldc2_w 482009114
    //   745: l2i
    //   746: ldc_w -1060105022
    //   749: ixor
    //   750: ldc2_w -442582800
    //   753: l2i
    //   754: ldc_w -1738616235
    //   757: ixor
    //   758: ixor
    //   759: lookupswitch default -> 784, -1308979756 -> 742, 1903748464 -> 1072
    //   784: goto -> 788
    //   787: athrow
    //   788: invokevirtual getName : ()Ljava/lang/String;
    //   791: goto -> 795
    //   794: athrow
    //   795: getstatic Perryc.0 : I
    //   798: ifle -> 812
    //   801: ldc2_w -431117683
    //   804: l2i
    //   805: ldc_w -1304238775
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w -1389867043
    //   815: l2i
    //   816: ldc_w -1633864417
    //   819: ixor
    //   820: ldc2_w 910319801
    //   823: l2i
    //   824: ldc_w 227844140
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 856, 169382436 -> 812, 1876528977 -> 1066
    //   856: aload_1
    //   857: getstatic Perryc.c : I
    //   860: iflt -> 874
    //   863: ldc2_w -1430127129
    //   866: l2i
    //   867: ldc_w -786801598
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w -229767691
    //   877: l2i
    //   878: ldc_w -1434681584
    //   881: ixor
    //   882: ldc2_w -1593335517
    //   885: l2i
    //   886: ldc_w -1886596555
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 1056, 1431360179 -> 874, 1991838195 -> 916
    //   916: goto -> 920
    //   919: athrow
    //   920: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   923: goto -> 927
    //   926: athrow
    //   927: ifne -> 941
    //   930: ldc2_w -1386142983
    //   933: l2i
    //   934: ldc_w 1168751054
    //   937: ixor
    //   938: goto -> 949
    //   941: ldc2_w 93413396
    //   944: l2i
    //   945: ldc_w -312870112
    //   948: ixor
    //   949: ldc2_w -266352640
    //   952: l2i
    //   953: ldc_w -247956038
    //   956: ixor
    //   957: ixor
    //   958: tableswitch default -> 930, -370200947 -> 980, -370200946 -> 983
    //   980: goto -> 281
    //   983: getstatic Perryc.1 : I
    //   986: ifeq -> 1000
    //   989: ldc2_w 1162705025
    //   992: l2i
    //   993: ldc_w 517668332
    //   996: ixor
    //   997: goto -> 1008
    //   1000: ldc2_w -1032548067
    //   1003: l2i
    //   1004: ldc_w 1414991409
    //   1007: ixor
    //   1008: ldc2_w -541850618
    //   1011: l2i
    //   1012: ldc_w -794075653
    //   1015: ixor
    //   1016: ixor
    //   1017: lookupswitch default -> 1050, -1724070191 -> 1044, 1418255504 -> 1000
    //   1044: aload_3
    //   1045: areturn
    //   1046: aconst_null
    //   1047: areturn
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
    //   1076: pop
    //   1077: goto -> 24
    //   1080: pop
    //   1081: aconst_null
    //   1082: goto -> 1076
    //   1085: dup
    //   1086: ifnull -> 1076
    //   1089: checkcast java/lang/Throwable
    //   1092: athrow
    //   1093: dup
    //   1094: ifnull -> 1080
    //   1097: checkcast java/lang/Throwable
    //   1100: athrow
    //   1101: aconst_null
    //   1102: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   665	381	3	setting	Lbigname/zprestige/webhack/features/setting/Setting;
    //   24	1024	0	this	Lbigname/zprestige/webhack/features/Feature;
    //   24	1024	1	name	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	1085	finally
    //   211	220	220	finally
    //   212	220	211	finally
    //   212	220	3	finally
    //   212	220	220	finally
    //   212	220	211	finally
    //   403	412	412	finally
    //   403	412	403	java/lang/IndexOutOfBoundsException
    //   403	412	3	java/lang/NumberFormatException
    //   403	412	412	java/util/NoSuchElementException
    //   404	412	403	finally
    //   591	600	600	finally
    //   592	600	591	java/lang/IndexOutOfBoundsException
    //   592	600	3	finally
    //   592	600	3	finally
    //   592	600	3	java/lang/UnsupportedOperationException
    //   787	794	794	finally
    //   787	794	787	java/util/ConcurrentModificationException
    //   787	794	3	java/lang/IndexOutOfBoundsException
    //   787	794	794	java/lang/ArrayIndexOutOfBoundsException
    //   788	794	787	finally
    //   919	926	926	finally
    //   919	926	3	java/util/NoSuchElementException
    //   920	926	919	finally
    //   920	926	919	java/lang/ArrayIndexOutOfBoundsException
    //   920	926	919	java/lang/StringIndexOutOfBoundsException
    //   1085	1093	1085	java/lang/NegativeArraySizeException
    //   1101	1103	3	java/lang/ClassCastException
  }
  
  public List getSettings() {
    return Perry1.57(this, (int)160708697L ^ 0x4D0FDFA0);
  }
  
  public Feature(String name) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1832267818
    //   9: l2i
    //   10: ldc_w -267846930
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -337764422
    //   20: l2i
    //   21: ldc_w 445164048
    //   24: ixor
    //   25: ldc2_w -1905532215
    //   28: l2i
    //   29: ldc_w 1899524679
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 692, -1651333706 -> 17, 235218212 -> 60
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -1297791040
    //   70: l2i
    //   71: ldc_w 1946859850
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1864668214
    //   81: l2i
    //   82: ldc_w -239172236
    //   85: ixor
    //   86: ldc2_w 938696982
    //   89: l2i
    //   90: ldc_w -592844059
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1048883822 -> 78, 771061113 -> 688
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -1090529310
    //   132: l2i
    //   133: ldc_w 1696135457
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -59525504
    //   143: l2i
    //   144: ldc_w 1930371715
    //   147: ixor
    //   148: ldc2_w -445221863
    //   151: l2i
    //   152: ldc_w 1292826754
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -1998232598 -> 140, 1939841624 -> 690
    //   184: aload_0
    //   185: new java/util/ArrayList
    //   188: dup
    //   189: getstatic Perryc.0 : I
    //   192: ifle -> 206
    //   195: ldc2_w 1290433303
    //   198: l2i
    //   199: ldc_w -1506947145
    //   202: ixor
    //   203: goto -> 214
    //   206: ldc2_w -381463041
    //   209: l2i
    //   210: ldc_w 500678440
    //   213: ixor
    //   214: ldc2_w 1126693302
    //   217: l2i
    //   218: ldc_w -80040968
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 700, 1284094105 -> 248, 1390079726 -> 206
    //   248: invokespecial <init> : ()V
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 268
    //   257: ldc2_w -1553746331
    //   260: l2i
    //   261: ldc_w 6696292
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w -1768345379
    //   271: l2i
    //   272: ldc_w 2079515646
    //   275: ixor
    //   276: ldc2_w -1262098765
    //   279: l2i
    //   280: ldc_w 24588759
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 312, 282710836 -> 268, 381111397 -> 706
    //   312: putfield settings : Ljava/util/List;
    //   315: getstatic Perryc.0 : I
    //   318: ifle -> 332
    //   321: ldc2_w 1444548247
    //   324: l2i
    //   325: ldc_w 1757005057
    //   328: ixor
    //   329: goto -> 340
    //   332: ldc2_w -1685829997
    //   335: l2i
    //   336: ldc_w -1336604590
    //   339: ixor
    //   340: ldc2_w 486607948
    //   343: l2i
    //   344: ldc_w 591947237
    //   347: ixor
    //   348: ixor
    //   349: lookupswitch default -> 694, 15376959 -> 332, 362293096 -> 376
    //   376: aload_0
    //   377: getstatic Perryc.c : I
    //   380: iflt -> 394
    //   383: ldc2_w -778237965
    //   386: l2i
    //   387: ldc_w 620020926
    //   390: ixor
    //   391: goto -> 402
    //   394: ldc2_w -789125709
    //   397: l2i
    //   398: ldc_w 471794895
    //   401: ixor
    //   402: ldc2_w 1267017220
    //   405: l2i
    //   406: ldc_w -962174465
    //   409: ixor
    //   410: ixor
    //   411: lookupswitch default -> 436, 583018601 -> 394, 2018149558 -> 698
    //   436: getstatic bigname/zprestige/webhack/WebHack.textManager : Lbigname/zprestige/webhack/manager/TextManager;
    //   439: getstatic Perryc.0 : I
    //   442: ifle -> 456
    //   445: ldc2_w -1625688468
    //   448: l2i
    //   449: ldc_w 48377029
    //   452: ixor
    //   453: goto -> 464
    //   456: ldc2_w -1137276879
    //   459: l2i
    //   460: ldc_w 1292473459
    //   463: ixor
    //   464: ldc2_w 656784676
    //   467: l2i
    //   468: ldc_w 1442880463
    //   471: ixor
    //   472: ixor
    //   473: lookupswitch default -> 696, -2145764695 -> 500, -320930750 -> 456
    //   500: putfield renderer : Lbigname/zprestige/webhack/manager/TextManager;
    //   503: getstatic Perryc.c : I
    //   506: iflt -> 520
    //   509: ldc2_w -359336621
    //   512: l2i
    //   513: ldc_w -218068370
    //   516: ixor
    //   517: goto -> 528
    //   520: ldc2_w 1029580170
    //   523: l2i
    //   524: ldc_w 1513545694
    //   527: ixor
    //   528: ldc2_w 550342081
    //   531: l2i
    //   532: ldc_w -1115733528
    //   535: ixor
    //   536: ixor
    //   537: lookupswitch default -> 564, -2077838572 -> 702, 1289812177 -> 520
    //   564: aload_0
    //   565: getstatic Perryc.1 : I
    //   568: ifeq -> 582
    //   571: ldc2_w 619756469
    //   574: l2i
    //   575: ldc_w 783734291
    //   578: ixor
    //   579: goto -> 590
    //   582: ldc2_w 1498470075
    //   585: l2i
    //   586: ldc_w 1270426677
    //   589: ixor
    //   590: ldc2_w -2049652353
    //   593: l2i
    //   594: ldc_w -662321017
    //   597: ixor
    //   598: ixor
    //   599: lookupswitch default -> 704, 1337523062 -> 624, 1461152862 -> 582
    //   624: aload_1
    //   625: getstatic Perryc.0 : I
    //   628: ifle -> 642
    //   631: ldc2_w -511226569
    //   634: l2i
    //   635: ldc_w -1089728103
    //   638: ixor
    //   639: goto -> 650
    //   642: ldc2_w 1351196758
    //   645: l2i
    //   646: ldc_w 1147882249
    //   649: ixor
    //   650: ldc2_w -355308837
    //   653: l2i
    //   654: ldc_w -200041996
    //   657: ixor
    //   658: ixor
    //   659: lookupswitch default -> 708, 170072176 -> 684, 1078636417 -> 642
    //   684: putfield name : Ljava/lang/String;
    //   687: return
    //   688: aconst_null
    //   689: athrow
    //   690: aconst_null
    //   691: athrow
    //   692: aconst_null
    //   693: athrow
    //   694: aconst_null
    //   695: athrow
    //   696: aconst_null
    //   697: athrow
    //   698: aconst_null
    //   699: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	688	0	this	Lbigname/zprestige/webhack/features/Feature;
    //   0	688	1	name	Ljava/lang/String;
  }
  
  public void clearSettings() {
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
  
  public Setting register(Setting setting) {
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
  
  public String getName() {
    return Perry1.b(this, (int)636438889L ^ 0x32E2CA9F);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\Feature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */