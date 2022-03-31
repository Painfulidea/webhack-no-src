package bigname.zprestige.webhack.features.setting;

import Perry1;
import Perryc;
import com.google.common.base.Converter;
import com.google.gson.JsonElement;

public class EnumConverter extends Converter {
  public Class<? extends Enum> clazz;
  
  public static String getProperName(Enum clazz) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 893
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 885
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 877
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 44
    //   34: ldc2_w 1412888790
    //   37: l2i
    //   38: ldc -1553568278
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w -387899660
    //   47: l2i
    //   48: ldc -846166861
    //   50: ixor
    //   51: ldc2_w -1876617142
    //   54: l2i
    //   55: ldc -779089987
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1901795611 -> 44, -1226470709 -> 846
    //   84: goto -> 88
    //   87: athrow
    //   88: invokespecial <init> : ()V
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.0 : I
    //   98: ifle -> 111
    //   101: ldc2_w -1524806442
    //   104: l2i
    //   105: ldc 1796589108
    //   107: ixor
    //   108: goto -> 118
    //   111: ldc2_w 1110607447
    //   114: l2i
    //   115: ldc -1968464801
    //   117: ixor
    //   118: ldc2_w -831486975
    //   121: l2i
    //   122: ldc 1294912051
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 852, 1271354426 -> 152, 1297532112 -> 111
    //   152: aload_0
    //   153: getstatic Perryc.0 : I
    //   156: ifle -> 169
    //   159: ldc2_w 810818769
    //   162: l2i
    //   163: ldc 595597019
    //   165: ixor
    //   166: goto -> 176
    //   169: ldc2_w -717061213
    //   172: l2i
    //   173: ldc -716368553
    //   175: ixor
    //   176: ldc2_w 1090643985
    //   179: l2i
    //   180: ldc -595044117
    //   182: ixor
    //   183: ixor
    //   184: lookupswitch default -> 854, -1906459920 -> 169, -1652152818 -> 212
    //   212: goto -> 216
    //   215: athrow
    //   216: invokevirtual name : ()Ljava/lang/String;
    //   219: goto -> 223
    //   222: athrow
    //   223: ldc2_w 678655329
    //   226: l2i
    //   227: ldc 678655329
    //   229: ixor
    //   230: getstatic Perryc.1 : I
    //   233: ifeq -> 246
    //   236: ldc2_w 1141999019
    //   239: l2i
    //   240: ldc 1312032460
    //   242: ixor
    //   243: goto -> 253
    //   246: ldc2_w -93414584
    //   249: l2i
    //   250: ldc -948826118
    //   252: ixor
    //   253: ldc2_w 1277859669
    //   256: l2i
    //   257: ldc 1806048232
    //   259: ixor
    //   260: ixor
    //   261: lookupswitch default -> 864, 445650959 -> 288, 766054362 -> 246
    //   288: goto -> 292
    //   291: athrow
    //   292: invokevirtual charAt : (I)C
    //   295: goto -> 299
    //   298: athrow
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w -2077981006
    //   308: l2i
    //   309: ldc -254834530
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -521870423
    //   318: l2i
    //   319: ldc 453593841
    //   321: ixor
    //   322: ldc2_w 1224612130
    //   325: l2i
    //   326: ldc -757694416
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 866, -289171650 -> 315, 1640312906 -> 356
    //   356: goto -> 360
    //   359: athrow
    //   360: invokestatic toUpperCase : (C)C
    //   363: goto -> 367
    //   366: athrow
    //   367: getstatic Perryc.0 : I
    //   370: ifle -> 383
    //   373: ldc2_w 1355350459
    //   376: l2i
    //   377: ldc 425620695
    //   379: ixor
    //   380: goto -> 390
    //   383: ldc2_w -323558442
    //   386: l2i
    //   387: ldc -2028885326
    //   389: ixor
    //   390: ldc2_w 1610429417
    //   393: l2i
    //   394: ldc 2096527359
    //   396: ixor
    //   397: ixor
    //   398: lookupswitch default -> 424, 982417711 -> 383, 1788621178 -> 858
    //   424: goto -> 428
    //   427: athrow
    //   428: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   431: goto -> 435
    //   434: athrow
    //   435: getstatic Perryc.c : I
    //   438: iflt -> 451
    //   441: ldc2_w 606679186
    //   444: l2i
    //   445: ldc -203981513
    //   447: ixor
    //   448: goto -> 458
    //   451: ldc2_w 2042253790
    //   454: l2i
    //   455: ldc 1469241159
    //   457: ixor
    //   458: ldc2_w -333770984
    //   461: l2i
    //   462: ldc 159863347
    //   464: ixor
    //   465: ixor
    //   466: lookupswitch default -> 492, -265552286 -> 451, 845287566 -> 860
    //   492: aload_0
    //   493: getstatic Perryc.1 : I
    //   496: ifeq -> 509
    //   499: ldc2_w 1338409205
    //   502: l2i
    //   503: ldc 1805098791
    //   505: ixor
    //   506: goto -> 516
    //   509: ldc2_w 1203587932
    //   512: l2i
    //   513: ldc 2039985988
    //   515: ixor
    //   516: ldc2_w -2627977
    //   519: l2i
    //   520: ldc 916568014
    //   522: ixor
    //   523: ixor
    //   524: lookupswitch default -> 850, -316191125 -> 509, -144921183 -> 552
    //   552: goto -> 556
    //   555: athrow
    //   556: invokevirtual name : ()Ljava/lang/String;
    //   559: goto -> 563
    //   562: athrow
    //   563: getstatic Perryc.c : I
    //   566: iflt -> 579
    //   569: ldc2_w -836918785
    //   572: l2i
    //   573: ldc -1143718593
    //   575: ixor
    //   576: goto -> 586
    //   579: ldc2_w -834658895
    //   582: l2i
    //   583: ldc 383464274
    //   585: ixor
    //   586: ldc2_w -2034483081
    //   589: l2i
    //   590: ldc -1422838427
    //   592: ixor
    //   593: ixor
    //   594: lookupswitch default -> 848, -183084047 -> 620, 1480911314 -> 579
    //   620: goto -> 624
    //   623: athrow
    //   624: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   627: goto -> 631
    //   630: athrow
    //   631: ldc2_w 1694312762
    //   634: l2i
    //   635: ldc 1694312763
    //   637: ixor
    //   638: getstatic Perryc.1 : I
    //   641: ifeq -> 654
    //   644: ldc2_w -1829207193
    //   647: l2i
    //   648: ldc -2083205859
    //   650: ixor
    //   651: goto -> 661
    //   654: ldc2_w 1482267853
    //   657: l2i
    //   658: ldc 138426324
    //   660: ixor
    //   661: ldc2_w -823544299
    //   664: l2i
    //   665: ldc -1844009872
    //   667: ixor
    //   668: ixor
    //   669: lookupswitch default -> 696, 1111732883 -> 654, 1305697311 -> 862
    //   696: goto -> 700
    //   699: athrow
    //   700: invokevirtual substring : (I)Ljava/lang/String;
    //   703: goto -> 707
    //   706: athrow
    //   707: getstatic Perryc.0 : I
    //   710: ifle -> 723
    //   713: ldc2_w 1859955146
    //   716: l2i
    //   717: ldc -102139942
    //   719: ixor
    //   720: goto -> 730
    //   723: ldc2_w -1483373657
    //   726: l2i
    //   727: ldc 620630881
    //   729: ixor
    //   730: ldc2_w 877439675
    //   733: l2i
    //   734: ldc -2078717802
    //   736: ixor
    //   737: ixor
    //   738: lookupswitch default -> 844, 660618301 -> 723, 859730667 -> 764
    //   764: goto -> 768
    //   767: athrow
    //   768: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   771: goto -> 775
    //   774: athrow
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 791
    //   781: ldc2_w -845170728
    //   784: l2i
    //   785: ldc 1892851137
    //   787: ixor
    //   788: goto -> 798
    //   791: ldc2_w 752933972
    //   794: l2i
    //   795: ldc -525431061
    //   797: ixor
    //   798: ldc2_w -1770992428
    //   801: l2i
    //   802: ldc 1772397070
    //   804: ixor
    //   805: ixor
    //   806: lookupswitch default -> 856, 865746021 -> 832, 1117340867 -> 791
    //   832: goto -> 836
    //   835: athrow
    //   836: invokevirtual toString : ()Ljava/lang/String;
    //   839: goto -> 843
    //   842: athrow
    //   843: areturn
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
    //   868: pop
    //   869: goto -> 24
    //   872: pop
    //   873: aconst_null
    //   874: goto -> 868
    //   877: dup
    //   878: ifnull -> 868
    //   881: checkcast java/lang/Throwable
    //   884: athrow
    //   885: dup
    //   886: ifnull -> 872
    //   889: checkcast java/lang/Throwable
    //   892: athrow
    //   893: aconst_null
    //   894: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	820	0	clazz	Ljava/lang/Enum;
    // Exception table:
    //   from	to	target	type
    //   8	20	877	finally
    //   87	94	94	finally
    //   87	94	3	finally
    //   88	94	94	finally
    //   88	94	87	java/lang/IllegalArgumentException
    //   88	94	87	finally
    //   215	222	222	finally
    //   215	222	215	finally
    //   216	222	215	java/lang/UnsupportedOperationException
    //   216	222	3	java/lang/AssertionError
    //   216	222	215	finally
    //   291	298	298	finally
    //   291	298	3	java/lang/RuntimeException
    //   291	298	298	finally
    //   292	298	291	java/lang/ClassCastException
    //   292	298	298	finally
    //   359	366	366	finally
    //   359	366	3	java/lang/AssertionError
    //   359	366	3	java/util/ConcurrentModificationException
    //   360	366	359	java/lang/IndexOutOfBoundsException
    //   360	366	366	finally
    //   427	434	434	finally
    //   427	434	427	java/lang/NullPointerException
    //   427	434	434	java/lang/AssertionError
    //   428	434	434	finally
    //   428	434	434	finally
    //   555	562	562	finally
    //   555	562	562	finally
    //   556	562	3	finally
    //   556	562	555	java/lang/ArrayIndexOutOfBoundsException
    //   556	562	562	finally
    //   624	630	630	finally
    //   624	630	3	java/lang/NullPointerException
    //   624	630	630	java/lang/ClassCastException
    //   624	630	630	java/lang/UnsupportedOperationException
    //   624	630	3	finally
    //   700	706	706	finally
    //   700	706	3	java/util/NoSuchElementException
    //   700	706	3	java/lang/NullPointerException
    //   700	706	706	java/lang/StringIndexOutOfBoundsException
    //   700	706	706	java/lang/IndexOutOfBoundsException
    //   767	774	774	finally
    //   767	774	3	finally
    //   768	774	3	finally
    //   768	774	767	finally
    //   768	774	3	java/lang/ArithmeticException
    //   835	842	842	finally
    //   835	842	835	finally
    //   835	842	835	finally
    //   836	842	842	finally
    //   836	842	3	finally
    //   877	885	877	java/lang/NumberFormatException
    //   893	895	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public JsonElement doForward(Enum anEnum) {
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
  
  public Object doForward(Object paramObject) {
    return Perry1.H(this, (int)-2044040214L ^ 0xC162EF1E, paramObject);
  }
  
  public Enum doBackward(JsonElement jsonElement) {
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
  
  public Object doBackward(Object paramObject) {
    return Perry1.H(this, (int)-312971448L ^ 0xAA10EBBF, paramObject);
  }
  
  public EnumConverter(Class<? extends Enum> clazz) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 1231992703
    //   9: l2i
    //   10: ldc_w 689403073
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1709468429
    //   20: l2i
    //   21: ldc_w -1123813388
    //   24: ixor
    //   25: ldc2_w 1961143408
    //   28: l2i
    //   29: ldc_w -428828186
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 308, -1249093999 -> 60, -219285976 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -813982483
    //   70: l2i
    //   71: ldc_w 967280463
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 469457638
    //   81: l2i
    //   82: ldc_w -630567978
    //   85: ixor
    //   86: ldc2_w 342667532
    //   89: l2i
    //   90: ldc_w -1836555634
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -904095410 -> 78, 1882769440 -> 312
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.1 : I
    //   126: ifeq -> 140
    //   129: ldc2_w 1384930572
    //   132: l2i
    //   133: ldc_w 968077489
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1053616309
    //   143: l2i
    //   144: ldc_w 1064002684
    //   147: ixor
    //   148: ldc2_w -1955440099
    //   151: l2i
    //   152: ldc_w 122150077
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -418747619 -> 314, 2004078525 -> 140
    //   184: aload_0
    //   185: getstatic Perryc.1 : I
    //   188: ifeq -> 202
    //   191: ldc2_w -702412952
    //   194: l2i
    //   195: ldc_w -659925424
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w 810652392
    //   205: l2i
    //   206: ldc_w -286602604
    //   209: ixor
    //   210: ldc2_w 1603702327
    //   213: l2i
    //   214: ldc_w 976581176
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 316, -1156012941 -> 244, 1798024503 -> 202
    //   244: aload_1
    //   245: getstatic Perryc.1 : I
    //   248: ifeq -> 262
    //   251: ldc2_w 611078913
    //   254: l2i
    //   255: ldc_w 426465323
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1446456452
    //   265: l2i
    //   266: ldc_w -54380939
    //   269: ixor
    //   270: ldc2_w -1604395807
    //   273: l2i
    //   274: ldc_w 1608248609
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1031652630 -> 310, -61887026 -> 262
    //   304: putfield clazz : Ljava/lang/Class;
    //   307: return
    //   308: aconst_null
    //   309: athrow
    //   310: aconst_null
    //   311: athrow
    //   312: aconst_null
    //   313: athrow
    //   314: aconst_null
    //   315: athrow
    //   316: aconst_null
    //   317: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	308	0	this	Lbigname/zprestige/webhack/features/setting/EnumConverter;
    //   0	308	1	clazz	Ljava/lang/Class;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	308	1	clazz	Ljava/lang/Class<+Ljava/lang/Enum;>;
  }
  
  public static int currentEnum(Enum clazz) {
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
  
  public static Enum increaseEnum(Enum clazz) {
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
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\setting\EnumConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */