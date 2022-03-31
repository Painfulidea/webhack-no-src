package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import Perryc;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class UtilTwo {
  public static String CRLF;
  
  public static String HEADER_ACCEPT;
  
  public static String METHOD_GET;
  
  public boolean multipart;
  
  public UtilTwo$RequestOutputStream output;
  
  public static String HEADER_ETAG;
  
  public static String[] EMPTY_STRINGS;
  
  public UtilTwo$UploadProgress progress;
  
  public static String HEADER_CACHE_CONTROL;
  
  public String requestMethod;
  
  public static String HEADER_REFERER;
  
  public static String HEADER_PROXY_AUTHORIZATION;
  
  public boolean ignoreCloseExceptions;
  
  public int bufferSize;
  
  public static String CONTENT_TYPE_FORM;
  
  public long totalWritten;
  
  public static String PARAM_CHARSET;
  
  public static String METHOD_OPTIONS;
  
  public static String HEADER_AUTHORIZATION;
  
  public static String CHARSET_UTF8;
  
  public HttpURLConnection connection;
  
  public static String HEADER_SERVER;
  
  public static String ENCODING_GZIP;
  
  public static String METHOD_POST;
  
  public static String HEADER_ACCEPT_ENCODING;
  
  public boolean form;
  
  public static String HEADER_IF_NONE_MATCH;
  
  public static String METHOD_DELETE;
  
  public static String CONTENT_TYPE_JSON;
  
  public static String HEADER_LAST_MODIFIED;
  
  public static String METHOD_PATCH;
  
  public static String HEADER_ACCEPT_CHARSET;
  
  public boolean uncompress;
  
  public static String METHOD_PUT;
  
  public static String CONTENT_TYPE_MULTIPART;
  
  public static String HEADER_LOCATION;
  
  public static String HEADER_CONTENT_ENCODING;
  
  public static String HEADER_CONTENT_LENGTH;
  
  public static String METHOD_HEAD;
  
  public int httpProxyPort;
  
  public static String HEADER_USER_AGENT;
  
  public URL url;
  
  public static String HEADER_CONTENT_TYPE;
  
  public static String BOUNDARY;
  
  public static String METHOD_TRACE;
  
  public static String HEADER_EXPIRES;
  
  public static String HEADER_DATE;
  
  public static UtilTwo$ConnectionFactory CONNECTION_FACTORY;
  
  public String httpProxyHost;
  
  public static SSLSocketFactory TRUSTED_FACTORY;
  
  public long totalSize;
  
  public static HostnameVerifier TRUSTED_VERIFIER;
  
  public UtilTwo form(Map paramMap) {
    return Perry1.r(this, (int)2079410657L ^ 0x537DC0C6, paramMap);
  }
  
  public UtilTwo accept(String paramString) {
    return Perry1.01(this, (int)-1618280928L ^ 0xE2EF373F, paramString);
  }
  
  public UtilTwo send(File input) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 981
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 973
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 965
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/io/BufferedInputStream
    //   27: dup
    //   28: new java/io/FileInputStream
    //   31: dup
    //   32: getstatic Perryc.c : I
    //   35: iflt -> 48
    //   38: ldc2_w 1328630470
    //   41: l2i
    //   42: ldc 640428383
    //   44: ixor
    //   45: goto -> 55
    //   48: ldc2_w 1375244142
    //   51: l2i
    //   52: ldc 1004955308
    //   54: ixor
    //   55: ldc2_w 314120672
    //   58: l2i
    //   59: ldc -640699368
    //   61: ixor
    //   62: ixor
    //   63: lookupswitch default -> 88, -1569993119 -> 928, 1765406328 -> 48
    //   88: aload_1
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 105
    //   95: ldc2_w -1535281171
    //   98: l2i
    //   99: ldc 355221851
    //   101: ixor
    //   102: goto -> 112
    //   105: ldc2_w -390020957
    //   108: l2i
    //   109: ldc 5691634
    //   111: ixor
    //   112: ldc2_w -945521132
    //   115: l2i
    //   116: ldc -630059684
    //   118: ixor
    //   119: ixor
    //   120: lookupswitch default -> 950, -1400420866 -> 105, -180327655 -> 148
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : (Ljava/io/File;)V
    //   155: goto -> 159
    //   158: athrow
    //   159: getstatic Perryc.1 : I
    //   162: ifeq -> 175
    //   165: ldc2_w 1852792702
    //   168: l2i
    //   169: ldc 172325994
    //   171: ixor
    //   172: goto -> 182
    //   175: ldc2_w 903083937
    //   178: l2i
    //   179: ldc -615846173
    //   181: ixor
    //   182: ldc2_w -925717683
    //   185: l2i
    //   186: ldc 2029210091
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 216, -737427022 -> 936, -136528006 -> 175
    //   216: goto -> 220
    //   219: athrow
    //   220: invokespecial <init> : (Ljava/io/InputStream;)V
    //   223: goto -> 227
    //   226: athrow
    //   227: getstatic Perryc.c : I
    //   230: iflt -> 243
    //   233: ldc2_w -1133694728
    //   236: l2i
    //   237: ldc -1676700587
    //   239: ixor
    //   240: goto -> 250
    //   243: ldc2_w 1324024664
    //   246: l2i
    //   247: ldc 1705177646
    //   249: ixor
    //   250: ldc2_w -1572369100
    //   253: l2i
    //   254: ldc -1219426415
    //   256: ixor
    //   257: ixor
    //   258: lookupswitch default -> 940, 896806408 -> 243, 1046445011 -> 284
    //   284: astore_2
    //   285: getstatic Perryc.c : I
    //   288: iflt -> 301
    //   291: ldc2_w 1991682000
    //   294: l2i
    //   295: ldc -512444461
    //   297: ixor
    //   298: goto -> 308
    //   301: ldc2_w -2026300387
    //   304: l2i
    //   305: ldc -435414491
    //   307: ixor
    //   308: ldc2_w 1259178080
    //   311: l2i
    //   312: ldc 610466568
    //   314: ixor
    //   315: ixor
    //   316: lookupswitch default -> 930, -122854549 -> 301, 240809296 -> 344
    //   344: aload_0
    //   345: getstatic Perryc.1 : I
    //   348: ifeq -> 361
    //   351: ldc2_w -1919131349
    //   354: l2i
    //   355: ldc 550019158
    //   357: ixor
    //   358: goto -> 368
    //   361: ldc2_w 1367262487
    //   364: l2i
    //   365: ldc -1962601443
    //   367: ixor
    //   368: ldc2_w 1208666019
    //   371: l2i
    //   372: ldc 10258205
    //   374: ixor
    //   375: ixor
    //   376: lookupswitch default -> 404, -1670980238 -> 361, -440237629 -> 946
    //   404: aload_1
    //   405: getstatic Perryc.1 : I
    //   408: ifeq -> 421
    //   411: ldc2_w 1371782366
    //   414: l2i
    //   415: ldc 1269978057
    //   417: ixor
    //   418: goto -> 428
    //   421: ldc2_w -402016083
    //   424: l2i
    //   425: ldc -203654450
    //   427: ixor
    //   428: ldc2_w -1013980029
    //   431: l2i
    //   432: ldc 796886170
    //   434: ixor
    //   435: ixor
    //   436: lookupswitch default -> 948, -159281394 -> 421, -148528518 -> 464
    //   464: goto -> 468
    //   467: athrow
    //   468: invokevirtual length : ()J
    //   471: goto -> 475
    //   474: athrow
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 491
    //   481: ldc2_w -120265893
    //   484: l2i
    //   485: ldc -1753606374
    //   487: ixor
    //   488: goto -> 498
    //   491: ldc2_w -1382543021
    //   494: l2i
    //   495: ldc 1214396240
    //   497: ixor
    //   498: ldc2_w 70686287
    //   501: l2i
    //   502: ldc -316735166
    //   504: ixor
    //   505: ixor
    //   506: lookupswitch default -> 532, -2037947572 -> 954, -495759091 -> 491
    //   532: goto -> 536
    //   535: athrow
    //   536: invokespecial incrementTotalSize : (J)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   539: goto -> 543
    //   542: athrow
    //   543: pop
    //   544: goto -> 740
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 563
    //   553: ldc2_w -1121084719
    //   556: l2i
    //   557: ldc -1976355998
    //   559: ixor
    //   560: goto -> 570
    //   563: ldc2_w -200753858
    //   566: l2i
    //   567: ldc -1184521785
    //   569: ixor
    //   570: ldc2_w 1407971582
    //   573: l2i
    //   574: ldc 576316743
    //   576: ixor
    //   577: ixor
    //   578: lookupswitch default -> 938, 1021249856 -> 604, 1185725450 -> 563
    //   604: astore_3
    //   605: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   608: dup
    //   609: getstatic Perryc.c : I
    //   612: iflt -> 625
    //   615: ldc2_w -465482561
    //   618: l2i
    //   619: ldc -1710090673
    //   621: ixor
    //   622: goto -> 632
    //   625: ldc2_w -1893255992
    //   628: l2i
    //   629: ldc -393876625
    //   631: ixor
    //   632: ldc2_w 42475307
    //   635: l2i
    //   636: ldc 272688244
    //   638: ixor
    //   639: ixor
    //   640: lookupswitch default -> 668, 1152939435 -> 625, 1822138799 -> 932
    //   668: aload_3
    //   669: getstatic Perryc.0 : I
    //   672: ifle -> 685
    //   675: ldc2_w -359438907
    //   678: l2i
    //   679: ldc 1539820955
    //   681: ixor
    //   682: goto -> 692
    //   685: ldc2_w -1529186
    //   688: l2i
    //   689: ldc 1385176319
    //   691: ixor
    //   692: ldc2_w -743766405
    //   695: l2i
    //   696: ldc -1167198548
    //   698: ixor
    //   699: ixor
    //   700: lookupswitch default -> 934, -994163018 -> 728, -661497719 -> 685
    //   728: goto -> 732
    //   731: athrow
    //   732: invokespecial <init> : (Ljava/io/IOException;)V
    //   735: goto -> 739
    //   738: athrow
    //   739: athrow
    //   740: getstatic Perryc.1 : I
    //   743: ifeq -> 756
    //   746: ldc2_w 2020409143
    //   749: l2i
    //   750: ldc 667180441
    //   752: ixor
    //   753: goto -> 763
    //   756: ldc2_w 2115187390
    //   759: l2i
    //   760: ldc -1886941504
    //   762: ixor
    //   763: ldc2_w 581528486
    //   766: l2i
    //   767: ldc -1190020305
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 952, -1005555161 -> 756, 1781296375 -> 796
    //   796: aload_0
    //   797: getstatic Perryc.0 : I
    //   800: ifle -> 814
    //   803: ldc2_w -2011238696
    //   806: l2i
    //   807: ldc_w 1067889631
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w -1875413021
    //   817: l2i
    //   818: ldc_w 450540041
    //   821: ixor
    //   822: ldc2_w -914990043
    //   825: l2i
    //   826: ldc_w 711733206
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, 1419914996 -> 944, 1567673134 -> 814
    //   856: aload_2
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w -2031861260
    //   866: l2i
    //   867: ldc_w 1446672305
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w -217778316
    //   877: l2i
    //   878: ldc_w -948609923
    //   881: ixor
    //   882: ldc2_w 2140162437
    //   885: l2i
    //   886: ldc_w 1847789749
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 942, -1049790603 -> 874, 633530937 -> 916
    //   916: goto -> 920
    //   919: athrow
    //   920: invokevirtual send : (Ljava/io/InputStream;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   923: goto -> 927
    //   926: athrow
    //   927: areturn
    //   928: aconst_null
    //   929: athrow
    //   930: aconst_null
    //   931: athrow
    //   932: aconst_null
    //   933: athrow
    //   934: aconst_null
    //   935: athrow
    //   936: aconst_null
    //   937: athrow
    //   938: aconst_null
    //   939: athrow
    //   940: aconst_null
    //   941: athrow
    //   942: aconst_null
    //   943: athrow
    //   944: aconst_null
    //   945: athrow
    //   946: aconst_null
    //   947: athrow
    //   948: aconst_null
    //   949: athrow
    //   950: aconst_null
    //   951: athrow
    //   952: aconst_null
    //   953: athrow
    //   954: aconst_null
    //   955: athrow
    //   956: pop
    //   957: goto -> 24
    //   960: pop
    //   961: aconst_null
    //   962: goto -> 956
    //   965: dup
    //   966: ifnull -> 956
    //   969: checkcast java/lang/Throwable
    //   972: athrow
    //   973: dup
    //   974: ifnull -> 960
    //   977: checkcast java/lang/Throwable
    //   980: athrow
    //   981: aconst_null
    //   982: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   285	262	2	stream	Ljava/io/InputStream;
    //   605	135	3	e	Ljava/io/FileNotFoundException;
    //   24	904	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	904	1	input	Ljava/io/File;
    //   740	188	2	stream	Ljava/io/InputStream;
    // Exception table:
    //   from	to	target	type
    //   8	20	965	finally
    //   24	151	547	java/io/FileNotFoundException
    //   152	158	158	finally
    //   152	158	158	finally
    //   152	158	158	finally
    //   152	158	3	finally
    //   152	158	158	java/lang/IndexOutOfBoundsException
    //   152	535	547	java/io/FileNotFoundException
    //   219	226	226	finally
    //   219	226	219	finally
    //   220	226	226	java/lang/IllegalArgumentException
    //   220	226	219	finally
    //   220	226	226	java/util/ConcurrentModificationException
    //   467	474	474	finally
    //   467	474	467	finally
    //   468	474	467	java/lang/UnsupportedOperationException
    //   468	474	467	java/lang/StringIndexOutOfBoundsException
    //   468	474	3	finally
    //   536	542	542	finally
    //   536	542	3	java/lang/IllegalStateException
    //   536	542	542	java/lang/IndexOutOfBoundsException
    //   536	542	3	java/lang/ArrayIndexOutOfBoundsException
    //   536	542	3	finally
    //   536	544	547	java/io/FileNotFoundException
    //   731	738	738	finally
    //   731	738	3	finally
    //   731	738	731	java/lang/IndexOutOfBoundsException
    //   731	738	731	finally
    //   732	738	738	java/lang/StringIndexOutOfBoundsException
    //   919	926	926	finally
    //   920	926	919	java/lang/IllegalArgumentException
    //   920	926	919	finally
    //   920	926	3	java/lang/NullPointerException
    //   920	926	3	java/lang/IllegalArgumentException
    //   965	973	965	java/lang/IndexOutOfBoundsException
    //   981	983	3	finally
  }
  
  public UtilTwo send(InputStream input) {
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
  
  public UtilTwo acceptCharset(String paramString) {
    return Perry1.Z(this, (int)1836730192L ^ 0x67C2587F, paramString);
  }
  
  public String cacheControl() {
    return Perry1.e(this, (int)-1163452263L ^ 0xB9100D21);
  }
  
  public HttpURLConnection getConnection() {
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
  
  public static UtilTwo delete(URL url) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w 650013192
    //   37: l2i
    //   38: ldc_w 589362573
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -604887229
    //   48: l2i
    //   49: ldc_w 1233143028
    //   52: ixor
    //   53: ldc2_w -165552748
    //   56: l2i
    //   57: ldc_w -1494715477
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -794649326 -> 45, 1431777722 -> 236
    //   88: aload_0
    //   89: ldc_w '庪㌶廈멋椐뀗'
    //   92: getstatic Perryc.c : I
    //   95: iflt -> 109
    //   98: ldc2_w -1698796106
    //   101: l2i
    //   102: ldc_w 743160137
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 1180034355
    //   112: l2i
    //   113: ldc_w 66839898
    //   116: ixor
    //   117: ldc2_w 1304626444
    //   120: l2i
    //   121: ldc_w 1453396800
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 152, -1382563149 -> 240, -283718312 -> 109
    //   152: goto -> 156
    //   155: athrow
    //   156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.0 : I
    //   166: ifle -> 180
    //   169: ldc2_w -538720773
    //   172: l2i
    //   173: ldc_w 1985997584
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w -354737043
    //   183: l2i
    //   184: ldc_w -202523409
    //   187: ixor
    //   188: ldc2_w -81742535
    //   191: l2i
    //   192: ldc_w 133260346
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 238, -437827199 -> 224, 1433272296 -> 180
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: areturn
    //   236: aconst_null
    //   237: athrow
    //   238: aconst_null
    //   239: athrow
    //   240: aconst_null
    //   241: athrow
    //   242: pop
    //   243: goto -> 24
    //   246: pop
    //   247: aconst_null
    //   248: goto -> 242
    //   251: dup
    //   252: ifnull -> 242
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: dup
    //   260: ifnull -> 246
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: aconst_null
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	212	0	url	Ljava/net/URL;
    // Exception table:
    //   from	to	target	type
    //   8	20	251	java/lang/RuntimeException
    //   156	162	162	finally
    //   156	162	162	java/lang/NumberFormatException
    //   156	162	162	java/lang/AssertionError
    //   156	162	162	java/lang/ArithmeticException
    //   156	162	3	finally
    //   227	234	234	finally
    //   227	234	227	java/lang/IllegalStateException
    //   227	234	3	java/util/ConcurrentModificationException
    //   228	234	227	finally
    //   228	234	234	java/util/NoSuchElementException
    //   251	259	251	finally
    //   267	269	3	finally
  }
  
  public byte[] bytes() {
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
  
  public HttpURLConnection createConnection() {
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
  
  public UtilTwo form(Map.Entry<?, ?> entry, String charset) {
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
  
  public UtilTwo incrementTotalSize(long paramLong) {
    return Perry1.0I(this, (int)143699184L ^ 0x671EDEE0, paramLong);
  }
  
  public UtilTwo header(String paramString1, String paramString2) {
    return Perry1.S(this, (int)1481107233L ^ 0x72D87B6C, paramString1, paramString2);
  }
  
  public boolean notModified() {
    return Perry1.4u(this, (int)-984454295L ^ 0xCB4F0FF5);
  }
  
  public static UtilTwo post(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs) {
    return Perry1.Y(null, (int)-204351001L ^ 0xFCB3E04E, paramCharSequence, paramBoolean, paramVarArgs);
  }
  
  public UtilTwo body(AtomicReference<String> output) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 385
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 377
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 369
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1828397521
    //   33: l2i
    //   34: ldc_w 1289933034
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1854705660
    //   44: l2i
    //   45: ldc_w 1457009663
    //   48: ixor
    //   49: ldc2_w -1052462783
    //   52: l2i
    //   53: ldc_w -1994086990
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 350, -1882499320 -> 84, -1752819146 -> 41
    //   84: aload_1
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 907103211
    //   94: l2i
    //   95: ldc_w 1398436427
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1746934617
    //   105: l2i
    //   106: ldc_w -187205927
    //   109: ixor
    //   110: ldc2_w -194369890
    //   113: l2i
    //   114: ldc_w 760255843
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1133409699 -> 358, 284359900 -> 102
    //   144: aload_0
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w 341888033
    //   154: l2i
    //   155: ldc_w 224813951
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 805144273
    //   165: l2i
    //   166: ldc_w 1304813504
    //   169: ixor
    //   170: ldc2_w 1233883673
    //   173: l2i
    //   174: ldc_w 77192238
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, -40742099 -> 162, 1410654569 -> 354
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual body : ()Ljava/lang/String;
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w -523708782
    //   224: l2i
    //   225: ldc_w 92568353
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -661636809
    //   235: l2i
    //   236: ldc_w 1002405109
    //   239: ixor
    //   240: ldc2_w 288726495
    //   243: l2i
    //   244: ldc_w 1805215291
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 356, -1719419354 -> 276, -1612687785 -> 232
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual set : (Ljava/lang/Object;)V
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.1 : I
    //   290: ifeq -> 304
    //   293: ldc2_w 1058375673
    //   296: l2i
    //   297: ldc_w 663165719
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w -737876742
    //   307: l2i
    //   308: ldc_w -2080189302
    //   311: ixor
    //   312: ldc2_w 628375904
    //   315: l2i
    //   316: ldc_w 2137580378
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, 1116618452 -> 352, 1268064212 -> 304
    //   348: aload_0
    //   349: areturn
    //   350: aconst_null
    //   351: athrow
    //   352: aconst_null
    //   353: athrow
    //   354: aconst_null
    //   355: athrow
    //   356: aconst_null
    //   357: athrow
    //   358: aconst_null
    //   359: athrow
    //   360: pop
    //   361: goto -> 24
    //   364: pop
    //   365: aconst_null
    //   366: goto -> 360
    //   369: dup
    //   370: ifnull -> 360
    //   373: checkcast java/lang/Throwable
    //   376: athrow
    //   377: dup
    //   378: ifnull -> 364
    //   381: checkcast java/lang/Throwable
    //   384: athrow
    //   385: aconst_null
    //   386: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	326	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	326	1	output	Ljava/util/concurrent/atomic/AtomicReference;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	326	1	output	Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	369	java/lang/NullPointerException
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	3	finally
    //   208	214	214	finally
    //   208	214	3	finally
    //   279	286	286	finally
    //   279	286	286	java/lang/IndexOutOfBoundsException
    //   279	286	279	java/lang/IllegalArgumentException
    //   280	286	286	finally
    //   280	286	3	java/lang/ClassCastException
    //   369	377	369	java/lang/ArrayIndexOutOfBoundsException
    //   385	387	3	java/lang/UnsupportedOperationException
  }
  
  public int intHeader(String name, int defaultValue) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 519
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 511
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 503
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1127829702
    //   33: l2i
    //   34: ldc_w 261288046
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -975053570
    //   44: l2i
    //   45: ldc_w -1438642633
    //   48: ixor
    //   49: ldc2_w -396196691
    //   52: l2i
    //   53: ldc_w 1676133347
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -953227290 -> 480, 397251330 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -208109562
    //   94: l2i
    //   95: ldc_w 708196699
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1847453138
    //   105: l2i
    //   106: ldc_w -1212942356
    //   109: ixor
    //   110: ldc2_w -1813600350
    //   113: l2i
    //   114: ldc_w 927104392
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 482, -2097858584 -> 144, 2097832823 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual closeOutputQuietly : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: pop
    //   156: getstatic Perryc.c : I
    //   159: iflt -> 173
    //   162: ldc2_w -404871373
    //   165: l2i
    //   166: ldc_w 114917706
    //   169: ixor
    //   170: goto -> 181
    //   173: ldc2_w -714278907
    //   176: l2i
    //   177: ldc_w 1122878888
    //   180: ixor
    //   181: ldc2_w -225239139
    //   184: l2i
    //   185: ldc_w -415280233
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 216, -507300545 -> 173, -190059917 -> 484
    //   216: aload_0
    //   217: getstatic Perryc.1 : I
    //   220: ifeq -> 234
    //   223: ldc2_w 599096150
    //   226: l2i
    //   227: ldc_w -609585648
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 1486776633
    //   237: l2i
    //   238: ldc_w 303511073
    //   241: ixor
    //   242: ldc2_w -582823884
    //   245: l2i
    //   246: ldc_w -1219105843
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 486, -1844955457 -> 234, 547251425 -> 276
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual getConnection : ()Ljava/net/HttpURLConnection;
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.0 : I
    //   290: ifle -> 304
    //   293: ldc2_w 847762036
    //   296: l2i
    //   297: ldc_w -607112376
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 9635522
    //   307: l2i
    //   308: ldc_w 213230934
    //   311: ixor
    //   312: ldc2_w -1382996832
    //   315: l2i
    //   316: ldc_w 1997080267
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, 869253975 -> 488, 1608152417 -> 304
    //   348: aload_1
    //   349: getstatic Perryc.1 : I
    //   352: ifeq -> 366
    //   355: ldc2_w 1918612388
    //   358: l2i
    //   359: ldc_w 1490806934
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w 2016846197
    //   369: l2i
    //   370: ldc_w -1170274533
    //   373: ixor
    //   374: ldc2_w 1898642308
    //   377: l2i
    //   378: ldc_w 1794784474
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 408, 793082132 -> 366, 827366508 -> 492
    //   408: iload_2
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 2136630191
    //   418: l2i
    //   419: ldc_w 94627765
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -1279924833
    //   429: l2i
    //   430: ldc_w -651642591
    //   433: ixor
    //   434: ldc2_w -1409768072
    //   437: l2i
    //   438: ldc_w 1792194865
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1143760813 -> 490, 410176288 -> 426
    //   468: goto -> 472
    //   471: athrow
    //   472: invokevirtual getHeaderFieldInt : (Ljava/lang/String;I)I
    //   475: goto -> 479
    //   478: athrow
    //   479: ireturn
    //   480: aconst_null
    //   481: athrow
    //   482: aconst_null
    //   483: athrow
    //   484: aconst_null
    //   485: athrow
    //   486: aconst_null
    //   487: athrow
    //   488: aconst_null
    //   489: athrow
    //   490: aconst_null
    //   491: athrow
    //   492: aconst_null
    //   493: athrow
    //   494: pop
    //   495: goto -> 24
    //   498: pop
    //   499: aconst_null
    //   500: goto -> 494
    //   503: dup
    //   504: ifnull -> 494
    //   507: checkcast java/lang/Throwable
    //   510: athrow
    //   511: dup
    //   512: ifnull -> 498
    //   515: checkcast java/lang/Throwable
    //   518: athrow
    //   519: aconst_null
    //   520: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	456	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	456	1	name	Ljava/lang/String;
    //   24	456	2	defaultValue	I
    // Exception table:
    //   from	to	target	type
    //   8	20	503	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	3	finally
    //   148	154	3	java/lang/StringIndexOutOfBoundsException
    //   148	154	154	finally
    //   279	286	286	finally
    //   279	286	3	finally
    //   279	286	279	finally
    //   279	286	3	java/lang/AssertionError
    //   279	286	279	finally
    //   471	478	478	finally
    //   471	478	471	finally
    //   472	478	3	finally
    //   472	478	478	finally
    //   472	478	3	java/lang/ClassCastException
    //   503	511	503	java/lang/StringIndexOutOfBoundsException
    //   519	521	3	finally
  }
  
  public UtilTwo receive(Writer writer) {
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
  
  public boolean ignoreCloseExceptions() {
    return Perry1.4A(this, (int)-1988997371L ^ 0xBA326317);
  }
  
  public String message() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 597
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 589
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 581
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1045877664
    //   33: l2i
    //   34: ldc_w 759273648
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1665928871
    //   44: l2i
    //   45: ldc_w 2033095816
    //   48: ixor
    //   49: ldc2_w 1796442312
    //   52: l2i
    //   53: ldc_w -1026719428
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1161215260 -> 566, 1657069538 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -1351486050
    //   94: l2i
    //   95: ldc_w 2098316719
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -585429234
    //   105: l2i
    //   106: ldc_w -851525177
    //   109: ixor
    //   110: ldc2_w 849153824
    //   113: l2i
    //   114: ldc_w 84719661
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 556, -437156036 -> 102, 666139076 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual closeOutput : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: pop
    //   156: getstatic Perryc.0 : I
    //   159: ifle -> 173
    //   162: ldc2_w -1528615060
    //   165: l2i
    //   166: ldc_w -1887927739
    //   169: ixor
    //   170: goto -> 181
    //   173: ldc2_w -1248019473
    //   176: l2i
    //   177: ldc_w -1382728416
    //   180: ixor
    //   181: ldc2_w -1116946927
    //   184: l2i
    //   185: ldc_w -934203568
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 216, -1462382965 -> 173, 1587952744 -> 558
    //   216: aload_0
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w -1447382988
    //   226: l2i
    //   227: ldc_w 1786540831
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w -814635431
    //   237: l2i
    //   238: ldc_w 289319418
    //   241: ixor
    //   242: ldc2_w -1709345230
    //   245: l2i
    //   246: ldc_w -772016113
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -2011149034 -> 568, -570941995 -> 234
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual getConnection : ()Ljava/net/HttpURLConnection;
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.1 : I
    //   290: ifeq -> 304
    //   293: ldc2_w 961733520
    //   296: l2i
    //   297: ldc_w 1681739238
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 1185456601
    //   307: l2i
    //   308: ldc_w 383630156
    //   311: ixor
    //   312: ldc2_w -1450705434
    //   315: l2i
    //   316: ldc_w 1396451205
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1479248875 -> 570, -67058238 -> 304
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual getResponseMessage : ()Ljava/lang/String;
    //   355: goto -> 359
    //   358: athrow
    //   359: areturn
    //   360: getstatic Perryc.0 : I
    //   363: ifle -> 377
    //   366: ldc2_w -436407346
    //   369: l2i
    //   370: ldc_w 424233365
    //   373: ixor
    //   374: goto -> 385
    //   377: ldc2_w 1387056349
    //   380: l2i
    //   381: ldc_w -984444508
    //   384: ixor
    //   385: ldc2_w -1781781298
    //   388: l2i
    //   389: ldc_w -1890825602
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 420, -1460457549 -> 377, -432677653 -> 564
    //   420: astore_1
    //   421: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   424: dup
    //   425: getstatic Perryc.c : I
    //   428: iflt -> 442
    //   431: ldc2_w 167226162
    //   434: l2i
    //   435: ldc_w -1302125048
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w -1951194829
    //   445: l2i
    //   446: ldc_w -1140434693
    //   449: ixor
    //   450: ldc2_w 1382308262
    //   453: l2i
    //   454: ldc_w -1823958561
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 484, 527367217 -> 442, 2058898755 -> 560
    //   484: aload_1
    //   485: getstatic Perryc.c : I
    //   488: iflt -> 502
    //   491: ldc2_w 1526479972
    //   494: l2i
    //   495: ldc_w 105776621
    //   498: ixor
    //   499: goto -> 510
    //   502: ldc2_w -398555617
    //   505: l2i
    //   506: ldc_w -646162587
    //   509: ixor
    //   510: ldc2_w 1078825343
    //   513: l2i
    //   514: ldc_w -48001950
    //   517: ixor
    //   518: ixor
    //   519: lookupswitch default -> 562, -1943221145 -> 544, -505666412 -> 502
    //   544: goto -> 548
    //   547: athrow
    //   548: invokespecial <init> : (Ljava/io/IOException;)V
    //   551: goto -> 555
    //   554: athrow
    //   555: athrow
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
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
    //   572: pop
    //   573: goto -> 24
    //   576: pop
    //   577: aconst_null
    //   578: goto -> 572
    //   581: dup
    //   582: ifnull -> 572
    //   585: checkcast java/lang/Throwable
    //   588: athrow
    //   589: dup
    //   590: ifnull -> 576
    //   593: checkcast java/lang/Throwable
    //   596: athrow
    //   597: aconst_null
    //   598: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   421	135	1	e	Ljava/io/IOException;
    //   24	532	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	581	java/lang/StringIndexOutOfBoundsException
    //   24	351	360	java/io/IOException
    //   147	154	154	finally
    //   147	154	154	java/lang/IndexOutOfBoundsException
    //   148	154	147	finally
    //   148	154	3	finally
    //   148	154	3	finally
    //   279	286	286	finally
    //   279	286	286	finally
    //   280	286	279	finally
    //   280	286	3	finally
    //   280	286	3	java/lang/ArithmeticException
    //   352	358	358	finally
    //   352	358	3	finally
    //   352	358	3	finally
    //   352	358	3	java/lang/ClassCastException
    //   352	358	3	java/lang/StringIndexOutOfBoundsException
    //   352	359	360	java/io/IOException
    //   547	554	554	finally
    //   547	554	547	finally
    //   548	554	3	finally
    //   548	554	547	finally
    //   548	554	3	finally
    //   581	589	581	finally
    //   597	599	3	finally
  }
  
  public String method() {
    return Perry1.d(this, (int)2083854212L ^ 0x1B6B27CB);
  }
  
  public long dateHeader(String name) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 255
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 247
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 239
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1822100906
    //   33: l2i
    //   34: ldc_w 361864952
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -483066589
    //   44: l2i
    //   45: ldc_w 1158449713
    //   48: ixor
    //   49: ldc2_w 1173497564
    //   52: l2i
    //   53: ldc_w -1176171956
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 224, -2061647934 -> 41, 1513053058 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -1244294169
    //   94: l2i
    //   95: ldc_w -2003652660
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1145309992
    //   105: l2i
    //   106: ldc_w 1975896674
    //   109: ixor
    //   110: ldc2_w -2021633514
    //   113: l2i
    //   114: ldc_w -597094161
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, 163981621 -> 102, 1722711762 -> 226
    //   144: aload_1
    //   145: ldc_w -1621858426
    //   148: i2l
    //   149: ldc2_w 1621858425
    //   152: lxor
    //   153: getstatic Perryc.1 : I
    //   156: ifeq -> 170
    //   159: ldc2_w 426864756
    //   162: l2i
    //   163: ldc_w 738032837
    //   166: ixor
    //   167: goto -> 178
    //   170: ldc2_w 196024410
    //   173: l2i
    //   174: ldc_w 1757963681
    //   177: ixor
    //   178: ldc2_w -1497960897
    //   181: l2i
    //   182: ldc_w -1564545326
    //   185: ixor
    //   186: ixor
    //   187: lookupswitch default -> 212, -378398268 -> 170, 914623580 -> 228
    //   212: goto -> 216
    //   215: athrow
    //   216: invokevirtual dateHeader : (Ljava/lang/String;J)J
    //   219: goto -> 223
    //   222: athrow
    //   223: lreturn
    //   224: aconst_null
    //   225: athrow
    //   226: aconst_null
    //   227: athrow
    //   228: aconst_null
    //   229: athrow
    //   230: pop
    //   231: goto -> 24
    //   234: pop
    //   235: aconst_null
    //   236: goto -> 230
    //   239: dup
    //   240: ifnull -> 230
    //   243: checkcast java/lang/Throwable
    //   246: athrow
    //   247: dup
    //   248: ifnull -> 234
    //   251: checkcast java/lang/Throwable
    //   254: athrow
    //   255: aconst_null
    //   256: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	200	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	200	1	name	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	239	java/lang/IllegalArgumentException
    //   215	222	222	finally
    //   215	222	3	finally
    //   215	222	222	finally
    //   215	222	222	finally
    //   216	222	215	java/lang/ClassCastException
    //   239	247	239	java/util/NoSuchElementException
    //   255	257	3	java/lang/ArithmeticException
  }
  
  public int contentLength() {
    return Perry1.33(this, (int)248259175L ^ 0x2085857);
  }
  
  public static String append(CharSequence url, Map<?, ?> params) {
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
  
  public UtilTwo part(String name, String filename, File part) {
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
  
  public UtilTwo trustAllHosts() {
    return Perry1.0T(this, (int)962494118L ^ 0x1B3A490C);
  }
  
  public UtilTwo form(Map.Entry paramEntry) {
    return Perry1.0k(this, (int)39382449L ^ 0xE45EF49, paramEntry);
  }
  
  public UtilTwo(CharSequence url, String method) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1411252494
    //   9: l2i
    //   10: ldc_w -1771629256
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1889769390
    //   20: l2i
    //   21: ldc_w -356348436
    //   24: ixor
    //   25: ldc2_w 575758935
    //   28: l2i
    //   29: ldc_w 314206916
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -225305435 -> 1818, -79613280 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1380473240
    //   70: l2i
    //   71: ldc_w 1149691539
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 242031532
    //   81: l2i
    //   82: ldc_w -1422440131
    //   85: ixor
    //   86: ldc2_w -1827257092
    //   89: l2i
    //   90: ldc_w 1480409157
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1485494864 -> 78, 572146754 -> 1808
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w -276351805
    //   132: l2i
    //   133: ldc_w 1135326869
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 905166144
    //   143: l2i
    //   144: ldc_w -1874709505
    //   147: ixor
    //   148: ldc2_w 1609366195
    //   151: l2i
    //   152: ldc_w -1635021524
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, -994458164 -> 140, 1833694665 -> 1842
    //   184: aload_0
    //   185: aconst_null
    //   186: getstatic Perryc.1 : I
    //   189: ifeq -> 203
    //   192: ldc2_w 1685967835
    //   195: l2i
    //   196: ldc_w -1578426486
    //   199: ixor
    //   200: goto -> 211
    //   203: ldc2_w -1483926459
    //   206: l2i
    //   207: ldc_w -489112859
    //   210: ixor
    //   211: ldc2_w -410277182
    //   214: l2i
    //   215: ldc_w 1717451729
    //   218: ixor
    //   219: ixor
    //   220: lookupswitch default -> 1794, -998228045 -> 248, 1145265474 -> 203
    //   248: putfield connection : Ljava/net/HttpURLConnection;
    //   251: getstatic Perryc.c : I
    //   254: iflt -> 268
    //   257: ldc2_w 622781705
    //   260: l2i
    //   261: ldc_w -1685376025
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w -156051606
    //   271: l2i
    //   272: ldc_w 1722642464
    //   275: ixor
    //   276: ldc2_w 1711134098
    //   279: l2i
    //   280: ldc_w -2023128765
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 1820, 1543602751 -> 268, 1921774491 -> 312
    //   312: aload_0
    //   313: ldc2_w 41929349
    //   316: l2i
    //   317: ldc_w 41929348
    //   320: ixor
    //   321: getstatic Perryc.0 : I
    //   324: ifle -> 338
    //   327: ldc2_w -44371454
    //   330: l2i
    //   331: ldc_w -1675780497
    //   334: ixor
    //   335: goto -> 346
    //   338: ldc2_w -1033944921
    //   341: l2i
    //   342: ldc_w 1588846235
    //   345: ixor
    //   346: ldc2_w 365444096
    //   349: l2i
    //   350: ldc_w 1579433018
    //   353: ixor
    //   354: ixor
    //   355: lookupswitch default -> 1826, -687825402 -> 380, 715877463 -> 338
    //   380: putfield ignoreCloseExceptions : Z
    //   383: getstatic Perryc.c : I
    //   386: iflt -> 400
    //   389: ldc2_w -1144140737
    //   392: l2i
    //   393: ldc_w -529645445
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w 707241964
    //   403: l2i
    //   404: ldc_w 811553637
    //   407: ixor
    //   408: ldc2_w 1326925912
    //   411: l2i
    //   412: ldc_w 998424114
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 1816, 792099374 -> 400, 1861026531 -> 444
    //   444: aload_0
    //   445: ldc2_w 1122712984
    //   448: l2i
    //   449: ldc_w 1122712984
    //   452: ixor
    //   453: getstatic Perryc.c : I
    //   456: iflt -> 470
    //   459: ldc2_w 915737709
    //   462: l2i
    //   463: ldc_w 2074423359
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w 916382623
    //   473: l2i
    //   474: ldc_w 1474110262
    //   477: ixor
    //   478: ldc2_w -802376202
    //   481: l2i
    //   482: ldc_w 615462393
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 1792, -1782562650 -> 512, -1179403171 -> 470
    //   512: putfield uncompress : Z
    //   515: getstatic Perryc.1 : I
    //   518: ifeq -> 532
    //   521: ldc2_w 1147587012
    //   524: l2i
    //   525: ldc_w -844046952
    //   528: ixor
    //   529: goto -> 540
    //   532: ldc2_w 1054023026
    //   535: l2i
    //   536: ldc_w 747231386
    //   539: ixor
    //   540: ldc2_w -2067248678
    //   543: l2i
    //   544: ldc_w -1003971786
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, -919157072 -> 1798, 60362142 -> 532
    //   576: aload_0
    //   577: ldc2_w 1542305792
    //   580: l2i
    //   581: ldc_w 1542297600
    //   584: ixor
    //   585: getstatic Perryc.1 : I
    //   588: ifeq -> 602
    //   591: ldc2_w -1776868340
    //   594: l2i
    //   595: ldc_w 1045315248
    //   598: ixor
    //   599: goto -> 610
    //   602: ldc2_w 503836926
    //   605: l2i
    //   606: ldc_w -1973990981
    //   609: ixor
    //   610: ldc2_w 313413592
    //   613: l2i
    //   614: ldc_w -2024088840
    //   617: ixor
    //   618: ixor
    //   619: lookupswitch default -> 1834, 27536485 -> 644, 1034784668 -> 602
    //   644: putfield bufferSize : I
    //   647: getstatic Perryc.0 : I
    //   650: ifle -> 664
    //   653: ldc2_w 611943203
    //   656: l2i
    //   657: ldc_w -1034428175
    //   660: ixor
    //   661: goto -> 672
    //   664: ldc2_w 1638809283
    //   667: l2i
    //   668: ldc_w -962202159
    //   671: ixor
    //   672: ldc2_w -1060826102
    //   675: l2i
    //   676: ldc_w -1233517880
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 708, -1869515504 -> 1822, 364742959 -> 664
    //   708: aload_0
    //   709: ldc_w -1620211903
    //   712: i2l
    //   713: ldc2_w 1620211902
    //   716: lxor
    //   717: getstatic Perryc.1 : I
    //   720: ifeq -> 734
    //   723: ldc2_w 1966273412
    //   726: l2i
    //   727: ldc_w -1655563146
    //   730: ixor
    //   731: goto -> 742
    //   734: ldc2_w -163904282
    //   737: l2i
    //   738: ldc_w 2124751957
    //   741: ixor
    //   742: ldc2_w 1881541568
    //   745: l2i
    //   746: ldc_w 1415028801
    //   749: ixor
    //   750: ixor
    //   751: lookupswitch default -> 776, -871283597 -> 1846, -150448246 -> 734
    //   776: putfield totalSize : J
    //   779: getstatic Perryc.c : I
    //   782: iflt -> 796
    //   785: ldc2_w 1516533558
    //   788: l2i
    //   789: ldc_w -856859020
    //   792: ixor
    //   793: goto -> 804
    //   796: ldc2_w 538492434
    //   799: l2i
    //   800: ldc_w -655653879
    //   803: ixor
    //   804: ldc2_w 1306603083
    //   807: l2i
    //   808: ldc_w 58180622
    //   811: ixor
    //   812: ixor
    //   813: lookupswitch default -> 840, -669007097 -> 1810, -457192098 -> 796
    //   840: aload_0
    //   841: ldc_w -1266416809
    //   844: i2l
    //   845: ldc2_w -1266416809
    //   848: lxor
    //   849: getstatic Perryc.1 : I
    //   852: ifeq -> 866
    //   855: ldc2_w -1199995213
    //   858: l2i
    //   859: ldc_w -600701852
    //   862: ixor
    //   863: goto -> 874
    //   866: ldc2_w -809530228
    //   869: l2i
    //   870: ldc_w 1329361264
    //   873: ixor
    //   874: ldc2_w 990495713
    //   877: l2i
    //   878: ldc_w -1419058241
    //   881: ixor
    //   882: ixor
    //   883: lookupswitch default -> 908, -198663543 -> 1840, -89777673 -> 866
    //   908: putfield totalWritten : J
    //   911: getstatic Perryc.1 : I
    //   914: ifeq -> 928
    //   917: ldc2_w 599961908
    //   920: l2i
    //   921: ldc_w -1403823732
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w 322034591
    //   931: l2i
    //   932: ldc_w 541583025
    //   935: ixor
    //   936: ldc2_w 2089602486
    //   939: l2i
    //   940: ldc_w 476122228
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 1806, -277075590 -> 928, 1402731756 -> 972
    //   972: aload_0
    //   973: getstatic Perryc.1 : I
    //   976: ifeq -> 990
    //   979: ldc2_w -866848882
    //   982: l2i
    //   983: ldc_w 1454681840
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w 737088268
    //   993: l2i
    //   994: ldc_w 1671207326
    //   997: ixor
    //   998: ldc2_w -1156210815
    //   1001: l2i
    //   1002: ldc_w -930122115
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 1828, -377837438 -> 990, 1005151086 -> 1032
    //   1032: getstatic bigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress.DEFAULT : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress;
    //   1035: getstatic Perryc.1 : I
    //   1038: ifeq -> 1052
    //   1041: ldc2_w -1719740253
    //   1044: l2i
    //   1045: ldc_w -275699835
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w 947593723
    //   1055: l2i
    //   1056: ldc_w -1101633779
    //   1059: ixor
    //   1060: ldc2_w 268596216
    //   1063: l2i
    //   1064: ldc_w 1131847467
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 1802, -715544027 -> 1096, 630920181 -> 1052
    //   1096: putfield progress : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress;
    //   1099: getstatic Perryc.1 : I
    //   1102: ifeq -> 1116
    //   1105: ldc2_w 1069768393
    //   1108: l2i
    //   1109: ldc_w -167695980
    //   1112: ixor
    //   1113: goto -> 1124
    //   1116: ldc2_w -1161734438
    //   1119: l2i
    //   1120: ldc_w 1747593977
    //   1123: ixor
    //   1124: ldc2_w 388155137
    //   1127: l2i
    //   1128: ldc_w 444536241
    //   1131: ixor
    //   1132: ixor
    //   1133: lookupswitch default -> 1814, -996170259 -> 1116, -541675885 -> 1160
    //   1160: aload_0
    //   1161: new java/net/URL
    //   1164: dup
    //   1165: getstatic Perryc.0 : I
    //   1168: ifle -> 1182
    //   1171: ldc2_w 526428069
    //   1174: l2i
    //   1175: ldc_w -1110316071
    //   1178: ixor
    //   1179: goto -> 1190
    //   1182: ldc2_w -417082345
    //   1185: l2i
    //   1186: ldc_w -70983510
    //   1189: ixor
    //   1190: ldc2_w 1948366941
    //   1193: l2i
    //   1194: ldc_w 1926506817
    //   1197: ixor
    //   1198: ixor
    //   1199: lookupswitch default -> 1832, -1538990752 -> 1182, 437429665 -> 1224
    //   1224: aload_1
    //   1225: getstatic Perryc.0 : I
    //   1228: ifle -> 1242
    //   1231: ldc2_w 918557384
    //   1234: l2i
    //   1235: ldc_w 1137448355
    //   1238: ixor
    //   1239: goto -> 1250
    //   1242: ldc2_w 679881652
    //   1245: l2i
    //   1246: ldc_w -422767730
    //   1249: ixor
    //   1250: ldc2_w -1004036193
    //   1253: l2i
    //   1254: ldc_w 949208087
    //   1257: ixor
    //   1258: ixor
    //   1259: lookupswitch default -> 1830, -1984406301 -> 1242, 855598002 -> 1284
    //   1284: invokeinterface toString : ()Ljava/lang/String;
    //   1289: getstatic Perryc.1 : I
    //   1292: ifeq -> 1306
    //   1295: ldc2_w 27550856
    //   1298: l2i
    //   1299: ldc_w 1314184746
    //   1302: ixor
    //   1303: goto -> 1314
    //   1306: ldc2_w 1167820182
    //   1309: l2i
    //   1310: ldc_w -412092815
    //   1313: ixor
    //   1314: ldc2_w -524889532
    //   1317: l2i
    //   1318: ldc_w -1330397307
    //   1321: ixor
    //   1322: ixor
    //   1323: lookupswitch default -> 1348, -959820879 -> 1306, 536205155 -> 1836
    //   1348: invokespecial <init> : (Ljava/lang/String;)V
    //   1351: getstatic Perryc.1 : I
    //   1354: ifeq -> 1368
    //   1357: ldc2_w 816081123
    //   1360: l2i
    //   1361: ldc_w -202809654
    //   1364: ixor
    //   1365: goto -> 1376
    //   1368: ldc2_w 1737631912
    //   1371: l2i
    //   1372: ldc_w -1104709164
    //   1375: ixor
    //   1376: ldc2_w -36793325
    //   1379: l2i
    //   1380: ldc_w 1120637406
    //   1383: ixor
    //   1384: ixor
    //   1385: lookupswitch default -> 1412, -1365814275 -> 1368, 2085106660 -> 1824
    //   1412: putfield url : Ljava/net/URL;
    //   1415: goto -> 1608
    //   1418: getstatic Perryc.c : I
    //   1421: iflt -> 1435
    //   1424: ldc2_w -1005912570
    //   1427: l2i
    //   1428: ldc_w -723370946
    //   1431: ixor
    //   1432: goto -> 1443
    //   1435: ldc2_w -1909465549
    //   1438: l2i
    //   1439: ldc_w -1096790259
    //   1442: ixor
    //   1443: ldc2_w -1187787170
    //   1446: l2i
    //   1447: ldc_w -537169755
    //   1450: ixor
    //   1451: ixor
    //   1452: lookupswitch default -> 1480, -684554990 -> 1435, 1981840579 -> 1844
    //   1480: astore_3
    //   1481: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   1484: dup
    //   1485: getstatic Perryc.c : I
    //   1488: iflt -> 1502
    //   1491: ldc2_w 150997045
    //   1494: l2i
    //   1495: ldc_w 1537502218
    //   1498: ixor
    //   1499: goto -> 1510
    //   1502: ldc2_w -45787267
    //   1505: l2i
    //   1506: ldc_w 2018655341
    //   1509: ixor
    //   1510: ldc2_w 1362608105
    //   1513: l2i
    //   1514: ldc_w -1188156172
    //   1517: ixor
    //   1518: ixor
    //   1519: lookupswitch default -> 1544, -1161955550 -> 1804, 484366918 -> 1502
    //   1544: aload_3
    //   1545: getstatic Perryc.0 : I
    //   1548: ifle -> 1562
    //   1551: ldc2_w -2100187610
    //   1554: l2i
    //   1555: ldc_w -794496710
    //   1558: ixor
    //   1559: goto -> 1570
    //   1562: ldc2_w -66713712
    //   1565: l2i
    //   1566: ldc_w -262963696
    //   1569: ixor
    //   1570: ldc2_w -1319977600
    //   1573: l2i
    //   1574: ldc_w 2120059665
    //   1577: ixor
    //   1578: ixor
    //   1579: lookupswitch default -> 1800, -1652921971 -> 1562, -1017491695 -> 1604
    //   1604: invokespecial <init> : (Ljava/io/IOException;)V
    //   1607: athrow
    //   1608: getstatic Perryc.0 : I
    //   1611: ifle -> 1625
    //   1614: ldc2_w -1257626216
    //   1617: l2i
    //   1618: ldc_w 1081360459
    //   1621: ixor
    //   1622: goto -> 1633
    //   1625: ldc2_w -186771360
    //   1628: l2i
    //   1629: ldc_w 274944318
    //   1632: ixor
    //   1633: ldc2_w 1380281229
    //   1636: l2i
    //   1637: ldc_w 867646616
    //   1640: ixor
    //   1641: ixor
    //   1642: lookupswitch default -> 1668, -1802751290 -> 1796, -714432817 -> 1625
    //   1668: aload_0
    //   1669: getstatic Perryc.1 : I
    //   1672: ifeq -> 1686
    //   1675: ldc2_w -2062491119
    //   1678: l2i
    //   1679: ldc_w -1347864074
    //   1682: ixor
    //   1683: goto -> 1694
    //   1686: ldc2_w 676424829
    //   1689: l2i
    //   1690: ldc_w -1565984803
    //   1693: ixor
    //   1694: ldc2_w -1684617157
    //   1697: l2i
    //   1698: ldc_w -671956130
    //   1701: ixor
    //   1702: ixor
    //   1703: lookupswitch default -> 1838, -962752315 -> 1728, 1725812866 -> 1686
    //   1728: aload_2
    //   1729: getstatic Perryc.c : I
    //   1732: iflt -> 1746
    //   1735: ldc2_w 1512635733
    //   1738: l2i
    //   1739: ldc_w 1251015756
    //   1742: ixor
    //   1743: goto -> 1754
    //   1746: ldc2_w 1600371637
    //   1749: l2i
    //   1750: ldc_w 207748107
    //   1753: ixor
    //   1754: ldc2_w 1406814834
    //   1757: l2i
    //   1758: ldc_w 1429694002
    //   1761: ixor
    //   1762: ixor
    //   1763: lookupswitch default -> 1788, -1817140915 -> 1746, 374680921 -> 1812
    //   1788: putfield requestMethod : Ljava/lang/String;
    //   1791: return
    //   1792: aconst_null
    //   1793: athrow
    //   1794: aconst_null
    //   1795: athrow
    //   1796: aconst_null
    //   1797: athrow
    //   1798: aconst_null
    //   1799: athrow
    //   1800: aconst_null
    //   1801: athrow
    //   1802: aconst_null
    //   1803: athrow
    //   1804: aconst_null
    //   1805: athrow
    //   1806: aconst_null
    //   1807: athrow
    //   1808: aconst_null
    //   1809: athrow
    //   1810: aconst_null
    //   1811: athrow
    //   1812: aconst_null
    //   1813: athrow
    //   1814: aconst_null
    //   1815: athrow
    //   1816: aconst_null
    //   1817: athrow
    //   1818: aconst_null
    //   1819: athrow
    //   1820: aconst_null
    //   1821: athrow
    //   1822: aconst_null
    //   1823: athrow
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aconst_null
    //   1827: athrow
    //   1828: aconst_null
    //   1829: athrow
    //   1830: aconst_null
    //   1831: athrow
    //   1832: aconst_null
    //   1833: athrow
    //   1834: aconst_null
    //   1835: athrow
    //   1836: aconst_null
    //   1837: athrow
    //   1838: aconst_null
    //   1839: athrow
    //   1840: aconst_null
    //   1841: athrow
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1481	127	3	e	Ljava/net/MalformedURLException;
    //   0	1792	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   0	1792	1	url	Ljava/lang/CharSequence;
    //   0	1792	2	method	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   1099	1415	1418	java/net/MalformedURLException
  }
  
  public InputStreamReader reader(String charset) {
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
  
  public boolean created() {
    return Perry1.4D(this, (int)-1744193065L ^ 0xB3C0C523);
  }
  
  public static void nonProxyHosts(String... hosts) {
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
  
  public Map headers() {
    return Perry1.0i(this, (int)153206707L ^ 0x2AF3EFA0);
  }
  
  public UtilTwo openOutput() {
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
  
  public boolean notFound() {
    return Perry1.4n(this, (int)2036880624L ^ 0x350DAD88);
  }
  
  public String server() {
    return Perry1.d(this, (int)-57584953L ^ 0x9BCF628F);
  }
  
  public static UtilTwo head(CharSequence url) {
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
  
  public UtilTwo readTimeout(int paramInt) {
    return Perry1.1p(this, (int)-1935016433L ^ 0xB41BC13A, paramInt);
  }
  
  public InputStream stream() {
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
  
  public String body() {
    return Perry1.9(this, (int)-1986912676L ^ 0xB241B979);
  }
  
  public UtilTwo receive(File file) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1132
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1124
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1116
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/io/BufferedOutputStream
    //   27: dup
    //   28: new java/io/FileOutputStream
    //   31: dup
    //   32: getstatic Perryc.1 : I
    //   35: ifeq -> 49
    //   38: ldc2_w 1075939384
    //   41: l2i
    //   42: ldc_w 2045536261
    //   45: ixor
    //   46: goto -> 57
    //   49: ldc2_w -1249023320
    //   52: l2i
    //   53: ldc_w -1262384714
    //   56: ixor
    //   57: ldc2_w 1489233041
    //   60: l2i
    //   61: ldc_w -1590258602
    //   64: ixor
    //   65: ixor
    //   66: lookupswitch default -> 92, -1070034694 -> 1091, 896914391 -> 49
    //   92: aload_1
    //   93: getstatic Perryc.c : I
    //   96: iflt -> 110
    //   99: ldc2_w 1896619990
    //   102: l2i
    //   103: ldc_w -789619760
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w -1722436254
    //   113: l2i
    //   114: ldc_w 235783714
    //   117: ixor
    //   118: ldc2_w 1951597012
    //   121: l2i
    //   122: ldc_w -1158537959
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 1089, 1509519245 -> 152, 1866619083 -> 110
    //   152: goto -> 156
    //   155: athrow
    //   156: invokespecial <init> : (Ljava/io/File;)V
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.1 : I
    //   166: ifeq -> 180
    //   169: ldc2_w -871821459
    //   172: l2i
    //   173: ldc_w -108806453
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w 110017227
    //   183: l2i
    //   184: ldc_w -1329966354
    //   187: ixor
    //   188: ldc2_w 134964111
    //   191: l2i
    //   192: ldc_w -2126582113
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 1079, -1128317770 -> 180, 1057056053 -> 224
    //   224: aload_0
    //   225: getstatic Perryc.0 : I
    //   228: ifle -> 242
    //   231: ldc2_w 1666634421
    //   234: l2i
    //   235: ldc_w -1488981431
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -12687889
    //   245: l2i
    //   246: ldc_w -895895274
    //   249: ixor
    //   250: ldc2_w -846656189
    //   253: l2i
    //   254: ldc_w -1542577833
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 284, -1376908056 -> 1075, -390752985 -> 242
    //   284: getfield bufferSize : I
    //   287: getstatic Perryc.1 : I
    //   290: ifeq -> 304
    //   293: ldc2_w -620784085
    //   296: l2i
    //   297: ldc_w -468038752
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 2073393647
    //   307: l2i
    //   308: ldc_w 320271091
    //   311: ixor
    //   312: ldc2_w -1997884516
    //   315: l2i
    //   316: ldc_w 2828759
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1239136320 -> 1093, -723009917 -> 304
    //   348: goto -> 352
    //   351: athrow
    //   352: invokespecial <init> : (Ljava/io/OutputStream;I)V
    //   355: goto -> 359
    //   358: athrow
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 376
    //   365: ldc2_w -2028926344
    //   368: l2i
    //   369: ldc_w 391872813
    //   372: ixor
    //   373: goto -> 384
    //   376: ldc2_w 1403519598
    //   379: l2i
    //   380: ldc_w 321332302
    //   383: ixor
    //   384: ldc2_w -535227995
    //   387: l2i
    //   388: ldc_w 29250945
    //   391: ixor
    //   392: ixor
    //   393: lookupswitch default -> 1103, -1591188988 -> 420, 1911410545 -> 376
    //   420: astore_2
    //   421: goto -> 620
    //   424: getstatic Perryc.1 : I
    //   427: ifeq -> 441
    //   430: ldc2_w -1127924739
    //   433: l2i
    //   434: ldc_w 1443251802
    //   437: ixor
    //   438: goto -> 449
    //   441: ldc2_w -308922374
    //   444: l2i
    //   445: ldc_w 1730926680
    //   448: ixor
    //   449: ldc2_w 375101661
    //   452: l2i
    //   453: ldc_w 1957894835
    //   456: ixor
    //   457: ixor
    //   458: lookupswitch default -> 1083, -2010382391 -> 441, -397054516 -> 484
    //   484: astore_3
    //   485: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   488: dup
    //   489: getstatic Perryc.c : I
    //   492: iflt -> 506
    //   495: ldc2_w -909500688
    //   498: l2i
    //   499: ldc_w 732682255
    //   502: ixor
    //   503: goto -> 514
    //   506: ldc2_w -440278555
    //   509: l2i
    //   510: ldc_w -431198843
    //   513: ixor
    //   514: ldc2_w -250693537
    //   517: l2i
    //   518: ldc_w -1547269300
    //   521: ixor
    //   522: ixor
    //   523: lookupswitch default -> 1095, -1331038740 -> 506, 1363525491 -> 548
    //   548: aload_3
    //   549: getstatic Perryc.c : I
    //   552: iflt -> 566
    //   555: ldc2_w 1564698166
    //   558: l2i
    //   559: ldc_w -995757870
    //   562: ixor
    //   563: goto -> 574
    //   566: ldc2_w 1984343565
    //   569: l2i
    //   570: ldc_w -613331919
    //   573: ixor
    //   574: ldc2_w -621485131
    //   577: l2i
    //   578: ldc_w 1997848454
    //   581: ixor
    //   582: ixor
    //   583: lookupswitch default -> 608, 872860375 -> 1099, 1748433145 -> 566
    //   608: goto -> 612
    //   611: athrow
    //   612: invokespecial <init> : (Ljava/io/IOException;)V
    //   615: goto -> 619
    //   618: athrow
    //   619: athrow
    //   620: new bigname/zprestige/webhack/manager/Identity/UtilTwo$5
    //   623: dup
    //   624: getstatic Perryc.1 : I
    //   627: ifeq -> 641
    //   630: ldc2_w 1795971951
    //   633: l2i
    //   634: ldc_w 801351426
    //   637: ixor
    //   638: goto -> 649
    //   641: ldc2_w -350171415
    //   644: l2i
    //   645: ldc_w 1443309206
    //   648: ixor
    //   649: ldc2_w 12352844
    //   652: l2i
    //   653: ldc_w 1985393713
    //   656: ixor
    //   657: ixor
    //   658: lookupswitch default -> 1087, -875749118 -> 684, 841299216 -> 641
    //   684: aload_0
    //   685: getstatic Perryc.c : I
    //   688: iflt -> 702
    //   691: ldc2_w 1258442463
    //   694: l2i
    //   695: ldc_w 1398790880
    //   698: ixor
    //   699: goto -> 710
    //   702: ldc2_w -1089314088
    //   705: l2i
    //   706: ldc_w 1308823700
    //   709: ixor
    //   710: ldc2_w -52099442
    //   713: l2i
    //   714: ldc_w 288242317
    //   717: ixor
    //   718: ixor
    //   719: lookupswitch default -> 1085, -174675908 -> 702, 484068943 -> 744
    //   744: aload_2
    //   745: getstatic Perryc.0 : I
    //   748: ifle -> 762
    //   751: ldc2_w -1242850175
    //   754: l2i
    //   755: ldc_w 1258238037
    //   758: ixor
    //   759: goto -> 770
    //   762: ldc2_w 853320466
    //   765: l2i
    //   766: ldc_w -789403477
    //   769: ixor
    //   770: ldc2_w 847691636
    //   773: l2i
    //   774: ldc_w -6402404
    //   777: ixor
    //   778: ixor
    //   779: lookupswitch default -> 804, -1791274244 -> 762, 839671100 -> 1097
    //   804: aload_0
    //   805: getstatic Perryc.1 : I
    //   808: ifeq -> 822
    //   811: ldc2_w -761279084
    //   814: l2i
    //   815: ldc_w -811136560
    //   818: ixor
    //   819: goto -> 830
    //   822: ldc2_w 1816716275
    //   825: l2i
    //   826: ldc_w 815203282
    //   829: ixor
    //   830: ldc2_w -350459237
    //   833: l2i
    //   834: ldc_w 2118274392
    //   837: ixor
    //   838: ixor
    //   839: lookupswitch default -> 1101, -2006523001 -> 822, -914241566 -> 864
    //   864: getfield ignoreCloseExceptions : Z
    //   867: getstatic Perryc.1 : I
    //   870: ifeq -> 884
    //   873: ldc2_w -1537891309
    //   876: l2i
    //   877: ldc_w 520671336
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w 733203273
    //   887: l2i
    //   888: ldc_w 327849106
    //   891: ixor
    //   892: ldc2_w -795777423
    //   895: l2i
    //   896: ldc_w -394670605
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 928, -2085232647 -> 1105, -1282000263 -> 884
    //   928: aload_2
    //   929: getstatic Perryc.c : I
    //   932: iflt -> 946
    //   935: ldc2_w 2060423791
    //   938: l2i
    //   939: ldc_w 2123813871
    //   942: ixor
    //   943: goto -> 954
    //   946: ldc2_w -524082558
    //   949: l2i
    //   950: ldc_w 1221140854
    //   953: ixor
    //   954: ldc2_w 238540409
    //   957: l2i
    //   958: ldc_w -20655726
    //   961: ixor
    //   962: ixor
    //   963: lookupswitch default -> 988, -190167445 -> 1077, 1382625238 -> 946
    //   988: goto -> 992
    //   991: athrow
    //   992: invokespecial <init> : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;Ljava/io/Closeable;ZLjava/io/OutputStream;)V
    //   995: goto -> 999
    //   998: athrow
    //   999: getstatic Perryc.0 : I
    //   1002: ifle -> 1016
    //   1005: ldc2_w 895639176
    //   1008: l2i
    //   1009: ldc_w 261944932
    //   1012: ixor
    //   1013: goto -> 1024
    //   1016: ldc2_w -972911472
    //   1019: l2i
    //   1020: ldc_w -140714711
    //   1023: ixor
    //   1024: ldc2_w -53595739
    //   1027: l2i
    //   1028: ldc_w -1818276690
    //   1031: ixor
    //   1032: ixor
    //   1033: lookupswitch default -> 1060, 1437586919 -> 1081, 2146211297 -> 1016
    //   1060: goto -> 1064
    //   1063: athrow
    //   1064: invokevirtual call : ()Ljava/lang/Object;
    //   1067: goto -> 1071
    //   1070: athrow
    //   1071: checkcast bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   1074: areturn
    //   1075: aconst_null
    //   1076: athrow
    //   1077: aconst_null
    //   1078: athrow
    //   1079: aconst_null
    //   1080: athrow
    //   1081: aconst_null
    //   1082: athrow
    //   1083: aconst_null
    //   1084: athrow
    //   1085: aconst_null
    //   1086: athrow
    //   1087: aconst_null
    //   1088: athrow
    //   1089: aconst_null
    //   1090: athrow
    //   1091: aconst_null
    //   1092: athrow
    //   1093: aconst_null
    //   1094: athrow
    //   1095: aconst_null
    //   1096: athrow
    //   1097: aconst_null
    //   1098: athrow
    //   1099: aconst_null
    //   1100: athrow
    //   1101: aconst_null
    //   1102: athrow
    //   1103: aconst_null
    //   1104: athrow
    //   1105: aconst_null
    //   1106: athrow
    //   1107: pop
    //   1108: goto -> 24
    //   1111: pop
    //   1112: aconst_null
    //   1113: goto -> 1107
    //   1116: dup
    //   1117: ifnull -> 1107
    //   1120: checkcast java/lang/Throwable
    //   1123: athrow
    //   1124: dup
    //   1125: ifnull -> 1111
    //   1128: checkcast java/lang/Throwable
    //   1131: athrow
    //   1132: aconst_null
    //   1133: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   421	3	2	output	Ljava/io/OutputStream;
    //   485	135	3	e	Ljava/io/FileNotFoundException;
    //   24	1051	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	1051	1	file	Ljava/io/File;
    //   620	455	2	output	Ljava/io/OutputStream;
    // Exception table:
    //   from	to	target	type
    //   8	20	1116	java/lang/ArithmeticException
    //   24	351	424	java/io/FileNotFoundException
    //   155	162	162	finally
    //   155	162	162	java/lang/ArrayIndexOutOfBoundsException
    //   155	162	3	finally
    //   155	162	162	finally
    //   156	162	155	finally
    //   352	358	358	finally
    //   352	358	3	finally
    //   352	358	358	finally
    //   352	358	3	finally
    //   352	358	358	finally
    //   352	421	424	java/io/FileNotFoundException
    //   611	618	618	finally
    //   611	618	611	finally
    //   612	618	618	java/lang/StringIndexOutOfBoundsException
    //   612	618	618	finally
    //   612	618	611	finally
    //   991	998	998	finally
    //   991	998	998	finally
    //   991	998	991	finally
    //   991	998	3	java/util/NoSuchElementException
    //   992	998	998	java/lang/UnsupportedOperationException
    //   1063	1070	1070	finally
    //   1063	1070	1063	finally
    //   1063	1070	1070	java/util/ConcurrentModificationException
    //   1064	1070	1063	java/lang/AssertionError
    //   1064	1070	1070	java/util/NoSuchElementException
    //   1116	1124	1116	java/lang/NumberFormatException
    //   1132	1134	3	finally
  }
  
  public int bufferSize() {
    return Perry1.35(this, (int)-1836651388L ^ 0x941F9AAD);
  }
  
  public static UtilTwo delete(CharSequence url) {
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
  
  public static UtilTwo post(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean) {
    return Perry1.5G(null, (int)404495822L ^ 0x4F2B1903, paramCharSequence, paramMap, paramBoolean);
  }
  
  public static void setConnectionFactory(UtilTwo$ConnectionFactory connectionFactory) {
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
  
  public UtilTwo part(String name, String filename, String contentType, String part) {
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
  
  public static UtilTwo get(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean) {
    return Perry1.5F(null, (int)-601583114L ^ 0x9DBF3FB4, paramCharSequence, paramMap, paramBoolean);
  }
  
  public static String append(CharSequence url, Object... params) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2659
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 2651
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2643
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1502294569
    //   33: l2i
    //   34: ldc_w -359709465
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -930004879
    //   44: l2i
    //   45: ldc_w 2067171173
    //   48: ixor
    //   49: ldc2_w 2025447501
    //   52: l2i
    //   53: ldc_w 1106170196
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2582, -1974253609 -> 41, -1963919859 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w -1439496943
    //   94: l2i
    //   95: ldc_w -2026852396
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1435093644
    //   105: l2i
    //   106: ldc_w -1916784644
    //   109: ixor
    //   110: ldc2_w -1663493885
    //   113: l2i
    //   114: ldc_w 1809361070
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2592, -637396120 -> 102, 793269469 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokeinterface toString : ()Ljava/lang/String;
    //   153: goto -> 157
    //   156: athrow
    //   157: getstatic Perryc.0 : I
    //   160: ifle -> 174
    //   163: ldc2_w 495434900
    //   166: l2i
    //   167: ldc_w 1811425713
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w -1565193803
    //   177: l2i
    //   178: ldc_w 1768479269
    //   181: ixor
    //   182: ldc2_w -866316190
    //   185: l2i
    //   186: ldc_w 327772424
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 216, -1448350641 -> 2604, 273199216 -> 174
    //   216: astore_2
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w 1787933196
    //   226: l2i
    //   227: ldc_w -693135780
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w -413864826
    //   237: l2i
    //   238: ldc_w 1564691727
    //   241: ixor
    //   242: ldc2_w -803631978
    //   245: l2i
    //   246: ldc_w -430977867
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -1972870029 -> 2612, 1764231771 -> 234
    //   276: aload_1
    //   277: ifnull -> 291
    //   280: ldc2_w -1266856210
    //   283: l2i
    //   284: ldc_w 1430579844
    //   287: ixor
    //   288: goto -> 299
    //   291: ldc2_w -2074236880
    //   294: l2i
    //   295: ldc_w 1701055581
    //   298: ixor
    //   299: ldc2_w 1879073014
    //   302: l2i
    //   303: ldc_w -729105425
    //   306: ixor
    //   307: ixor
    //   308: tableswitch default -> 280, 1169391475 -> 332, 1169391476 -> 448
    //   332: getstatic Perryc.c : I
    //   335: iflt -> 349
    //   338: ldc2_w -159711833
    //   341: l2i
    //   342: ldc_w 559159179
    //   345: ixor
    //   346: goto -> 357
    //   349: ldc2_w 226275964
    //   352: l2i
    //   353: ldc_w -1981098351
    //   356: ixor
    //   357: ldc2_w 2039643276
    //   360: l2i
    //   361: ldc_w -398052475
    //   364: ixor
    //   365: ixor
    //   366: lookupswitch default -> 392, 1190831397 -> 2626, 1381444376 -> 349
    //   392: aload_1
    //   393: arraylength
    //   394: ifne -> 408
    //   397: ldc2_w -2038203266
    //   400: l2i
    //   401: ldc_w -1238696002
    //   404: ixor
    //   405: goto -> 416
    //   408: ldc2_w 1582196866
    //   411: l2i
    //   412: ldc_w 1860692803
    //   415: ixor
    //   416: ldc2_w 2098838936
    //   419: l2i
    //   420: ldc_w -451201440
    //   423: ixor
    //   424: ixor
    //   425: tableswitch default -> 397, -1465186248 -> 448, -1465186247 -> 510
    //   448: getstatic Perryc.0 : I
    //   451: ifle -> 465
    //   454: ldc2_w -2126487543
    //   457: l2i
    //   458: ldc_w 1763930809
    //   461: ixor
    //   462: goto -> 473
    //   465: ldc2_w 968729211
    //   468: l2i
    //   469: ldc_w 782486415
    //   472: ixor
    //   473: ldc2_w -765848153
    //   476: l2i
    //   477: ldc_w -314355003
    //   480: ixor
    //   481: ixor
    //   482: lookupswitch default -> 2596, -679848494 -> 465, 671559318 -> 508
    //   508: aload_2
    //   509: areturn
    //   510: getstatic Perryc.c : I
    //   513: iflt -> 527
    //   516: ldc2_w 898952129
    //   519: l2i
    //   520: ldc_w -1344002832
    //   523: ixor
    //   524: goto -> 535
    //   527: ldc2_w 762092613
    //   530: l2i
    //   531: ldc_w 131333482
    //   534: ixor
    //   535: ldc2_w 484007000
    //   538: l2i
    //   539: ldc_w 1982166626
    //   542: ixor
    //   543: ixor
    //   544: lookupswitch default -> 572, -259201781 -> 2568, -104734771 -> 527
    //   572: aload_1
    //   573: arraylength
    //   574: ldc2_w -359978887
    //   577: l2i
    //   578: ldc_w -359978885
    //   581: ixor
    //   582: irem
    //   583: ifeq -> 597
    //   586: ldc2_w 268065944
    //   589: l2i
    //   590: ldc_w -318016657
    //   593: ixor
    //   594: goto -> 605
    //   597: ldc2_w -2057142186
    //   600: l2i
    //   601: ldc_w 1737732002
    //   604: ixor
    //   605: ldc2_w -1556183746
    //   608: l2i
    //   609: ldc_w 13137100
    //   612: ixor
    //   613: ixor
    //   614: tableswitch default -> 586, 1091034629 -> 636, 1091034630 -> 788
    //   636: new java/lang/IllegalArgumentException
    //   639: dup
    //   640: ldc_w '庣㌆廷ꃵ뀡๩⌦䌈ﱂਾ錖밈碳쎫辚蚕樃붓턥便됌诛｡શᣜ﯍獄㮉摥㠿כֿ鵪㍨奥矧삧鄵檙瓶陚켙᎖됮쎉蛁渔ڡ⑌'
    //   643: getstatic Perryc.0 : I
    //   646: ifle -> 660
    //   649: ldc2_w -1765239306
    //   652: l2i
    //   653: ldc_w 36137684
    //   656: ixor
    //   657: goto -> 668
    //   660: ldc2_w -692106540
    //   663: l2i
    //   664: ldc_w 136130155
    //   667: ixor
    //   668: ldc2_w -1830728638
    //   671: l2i
    //   672: ldc_w 1958844547
    //   675: ixor
    //   676: ixor
    //   677: lookupswitch default -> 704, 398966726 -> 660, 1926179811 -> 2618
    //   704: goto -> 708
    //   707: athrow
    //   708: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   711: goto -> 715
    //   714: athrow
    //   715: getstatic Perryc.c : I
    //   718: iflt -> 732
    //   721: ldc2_w 574360096
    //   724: l2i
    //   725: ldc_w -1580316053
    //   728: ixor
    //   729: goto -> 740
    //   732: ldc2_w -1550972432
    //   735: l2i
    //   736: ldc_w 551192505
    //   739: ixor
    //   740: ldc2_w 1048111788
    //   743: l2i
    //   744: ldc_w 492506495
    //   747: ixor
    //   748: ixor
    //   749: lookupswitch default -> 776, -1596872808 -> 2584, 416537953 -> 732
    //   776: goto -> 780
    //   779: athrow
    //   780: invokespecial <init> : (Ljava/lang/String;)V
    //   783: goto -> 787
    //   786: athrow
    //   787: athrow
    //   788: new java/lang/StringBuilder
    //   791: dup
    //   792: getstatic Perryc.0 : I
    //   795: ifle -> 809
    //   798: ldc2_w 405012464
    //   801: l2i
    //   802: ldc_w 2059602411
    //   805: ixor
    //   806: goto -> 817
    //   809: ldc2_w -107081042
    //   812: l2i
    //   813: ldc_w 2112340043
    //   816: ixor
    //   817: ldc2_w 1145532807
    //   820: l2i
    //   821: ldc_w -427124301
    //   824: ixor
    //   825: ixor
    //   826: lookupswitch default -> 2602, -1070784977 -> 809, 649345745 -> 852
    //   852: aload_2
    //   853: getstatic Perryc.1 : I
    //   856: ifeq -> 870
    //   859: ldc2_w 175802976
    //   862: l2i
    //   863: ldc_w -155841916
    //   866: ixor
    //   867: goto -> 878
    //   870: ldc2_w -1692755399
    //   873: l2i
    //   874: ldc_w -746081655
    //   877: ixor
    //   878: ldc2_w -632362545
    //   881: l2i
    //   882: ldc_w -1116698999
    //   885: ixor
    //   886: ixor
    //   887: lookupswitch default -> 912, -1678577758 -> 2628, -1296961772 -> 870
    //   912: goto -> 916
    //   915: athrow
    //   916: invokespecial <init> : (Ljava/lang/String;)V
    //   919: goto -> 923
    //   922: athrow
    //   923: getstatic Perryc.0 : I
    //   926: ifle -> 940
    //   929: ldc2_w -478027766
    //   932: l2i
    //   933: ldc_w 1092008792
    //   936: ixor
    //   937: goto -> 948
    //   940: ldc2_w 636426718
    //   943: l2i
    //   944: ldc_w -755963642
    //   947: ixor
    //   948: ldc2_w -1705157156
    //   951: l2i
    //   952: ldc_w -908493628
    //   955: ixor
    //   956: ixor
    //   957: lookupswitch default -> 2594, -1533292096 -> 984, -250381750 -> 940
    //   984: astore_3
    //   985: getstatic Perryc.c : I
    //   988: iflt -> 1002
    //   991: ldc2_w 1578439231
    //   994: l2i
    //   995: ldc_w -1429283257
    //   998: ixor
    //   999: goto -> 1010
    //   1002: ldc2_w 70538218
    //   1005: l2i
    //   1006: ldc_w 1964016150
    //   1009: ixor
    //   1010: ldc2_w -731819268
    //   1013: l2i
    //   1014: ldc_w 366784129
    //   1017: ixor
    //   1018: ixor
    //   1019: lookupswitch default -> 2572, -1332138623 -> 1044, 895889413 -> 1002
    //   1044: aload_2
    //   1045: getstatic Perryc.c : I
    //   1048: iflt -> 1062
    //   1051: ldc2_w 45198537
    //   1054: l2i
    //   1055: ldc_w 868602087
    //   1058: ixor
    //   1059: goto -> 1070
    //   1062: ldc2_w -1286884109
    //   1065: l2i
    //   1066: ldc_w -2126172044
    //   1069: ixor
    //   1070: ldc2_w -158122640
    //   1073: l2i
    //   1074: ldc_w -784107260
    //   1077: ixor
    //   1078: ixor
    //   1079: lookupswitch default -> 2620, 366919923 -> 1104, 379861082 -> 1062
    //   1104: aload_3
    //   1105: getstatic Perryc.1 : I
    //   1108: ifeq -> 1122
    //   1111: ldc2_w -1316046414
    //   1114: l2i
    //   1115: ldc_w 432578604
    //   1118: ixor
    //   1119: goto -> 1130
    //   1122: ldc2_w 1306929330
    //   1125: l2i
    //   1126: ldc_w 1027247276
    //   1129: ixor
    //   1130: ldc2_w -1568452246
    //   1133: l2i
    //   1134: ldc_w -263779864
    //   1137: ixor
    //   1138: ixor
    //   1139: lookupswitch default -> 1164, -92126948 -> 2588, 1223896977 -> 1122
    //   1164: goto -> 1168
    //   1167: athrow
    //   1168: invokestatic addPathSeparator : (Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   1171: goto -> 1175
    //   1174: athrow
    //   1175: pop
    //   1176: getstatic Perryc.1 : I
    //   1179: ifeq -> 1193
    //   1182: ldc2_w 2052202494
    //   1185: l2i
    //   1186: ldc_w -916997302
    //   1189: ixor
    //   1190: goto -> 1201
    //   1193: ldc2_w -1023949963
    //   1196: l2i
    //   1197: ldc_w -1319505083
    //   1200: ixor
    //   1201: ldc2_w 842792699
    //   1204: l2i
    //   1205: ldc_w 1432051205
    //   1208: ixor
    //   1209: ixor
    //   1210: lookupswitch default -> 1236, -731577270 -> 2608, 1140661064 -> 1193
    //   1236: aload_2
    //   1237: getstatic Perryc.1 : I
    //   1240: ifeq -> 1254
    //   1243: ldc2_w 502133542
    //   1246: l2i
    //   1247: ldc_w -686116100
    //   1250: ixor
    //   1251: goto -> 1262
    //   1254: ldc2_w 674518934
    //   1257: l2i
    //   1258: ldc_w 962311297
    //   1261: ixor
    //   1262: ldc2_w 262089921
    //   1265: l2i
    //   1266: ldc_w 318745559
    //   1269: ixor
    //   1270: ixor
    //   1271: lookupswitch default -> 1296, -677919028 -> 2622, 626273865 -> 1254
    //   1296: aload_3
    //   1297: getstatic Perryc.0 : I
    //   1300: ifle -> 1314
    //   1303: ldc2_w -2132782734
    //   1306: l2i
    //   1307: ldc_w -357354357
    //   1310: ixor
    //   1311: goto -> 1322
    //   1314: ldc2_w 399814384
    //   1317: l2i
    //   1318: ldc_w -3615009
    //   1321: ixor
    //   1322: ldc2_w -1087420121
    //   1325: l2i
    //   1326: ldc_w 212659241
    //   1329: ixor
    //   1330: ixor
    //   1331: lookupswitch default -> 1356, -640630537 -> 2570, 1576218798 -> 1314
    //   1356: goto -> 1360
    //   1359: athrow
    //   1360: invokestatic addParamPrefix : (Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   1363: goto -> 1367
    //   1366: athrow
    //   1367: pop
    //   1368: getstatic Perryc.1 : I
    //   1371: ifeq -> 1385
    //   1374: ldc2_w -198245342
    //   1377: l2i
    //   1378: ldc_w 945525141
    //   1381: ixor
    //   1382: goto -> 1393
    //   1385: ldc2_w -271368699
    //   1388: l2i
    //   1389: ldc_w -1477664671
    //   1392: ixor
    //   1393: ldc2_w -873605598
    //   1396: l2i
    //   1397: ldc_w -987268477
    //   1400: ixor
    //   1401: ixor
    //   1402: lookupswitch default -> 2576, -1027720938 -> 1385, 1190474437 -> 1428
    //   1428: aload_1
    //   1429: ldc2_w 314760287
    //   1432: l2i
    //   1433: ldc_w 314760287
    //   1436: ixor
    //   1437: aaload
    //   1438: getstatic Perryc.c : I
    //   1441: iflt -> 1455
    //   1444: ldc2_w -1867162588
    //   1447: l2i
    //   1448: ldc_w -1843001063
    //   1451: ixor
    //   1452: goto -> 1463
    //   1455: ldc2_w -755220120
    //   1458: l2i
    //   1459: ldc_w -183816399
    //   1462: ixor
    //   1463: ldc2_w -1700133261
    //   1466: l2i
    //   1467: ldc_w -1840199351
    //   1470: ixor
    //   1471: ixor
    //   1472: lookupswitch default -> 2614, 174692871 -> 1455, 789422435 -> 1500
    //   1500: aload_1
    //   1501: ldc2_w -1307581910
    //   1504: l2i
    //   1505: ldc_w -1307581909
    //   1508: ixor
    //   1509: aaload
    //   1510: getstatic Perryc.1 : I
    //   1513: ifeq -> 1527
    //   1516: ldc2_w 1160027946
    //   1519: l2i
    //   1520: ldc_w 703119161
    //   1523: ixor
    //   1524: goto -> 1535
    //   1527: ldc2_w -1610126722
    //   1530: l2i
    //   1531: ldc_w 1866003042
    //   1534: ixor
    //   1535: ldc2_w 903351332
    //   1538: l2i
    //   1539: ldc_w -1369987278
    //   1542: ixor
    //   1543: ixor
    //   1544: lookupswitch default -> 2564, -146568443 -> 1527, 1420833546 -> 1572
    //   1572: aload_3
    //   1573: getstatic Perryc.0 : I
    //   1576: ifle -> 1590
    //   1579: ldc2_w 1762169758
    //   1582: l2i
    //   1583: ldc_w 1001660264
    //   1586: ixor
    //   1587: goto -> 1598
    //   1590: ldc2_w -862469809
    //   1593: l2i
    //   1594: ldc_w -2093494119
    //   1597: ixor
    //   1598: ldc2_w 1822998281
    //   1601: l2i
    //   1602: ldc_w 121990128
    //   1605: ixor
    //   1606: ixor
    //   1607: lookupswitch default -> 2578, 609076527 -> 1632, 961632271 -> 1590
    //   1632: goto -> 1636
    //   1635: athrow
    //   1636: invokestatic addParam : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   1639: goto -> 1643
    //   1642: athrow
    //   1643: pop
    //   1644: ldc2_w -794341113
    //   1647: l2i
    //   1648: ldc_w -794341115
    //   1651: ixor
    //   1652: getstatic Perryc.0 : I
    //   1655: ifle -> 1669
    //   1658: ldc2_w -1762777835
    //   1661: l2i
    //   1662: ldc_w 538664145
    //   1665: ixor
    //   1666: goto -> 1677
    //   1669: ldc2_w -247223284
    //   1672: l2i
    //   1673: ldc_w 278855552
    //   1676: ixor
    //   1677: ldc2_w 1696588732
    //   1680: l2i
    //   1681: ldc_w 45898504
    //   1684: ixor
    //   1685: ixor
    //   1686: lookupswitch default -> 2566, -2038502600 -> 1712, -782843536 -> 1669
    //   1712: istore #4
    //   1714: getstatic Perryc.c : I
    //   1717: iflt -> 1731
    //   1720: ldc2_w -1634957216
    //   1723: l2i
    //   1724: ldc_w 690930524
    //   1727: ixor
    //   1728: goto -> 1739
    //   1731: ldc2_w 693113372
    //   1734: l2i
    //   1735: ldc_w 550888483
    //   1738: ixor
    //   1739: ldc2_w 941350647
    //   1742: l2i
    //   1743: ldc_w -1106211672
    //   1746: ixor
    //   1747: ixor
    //   1748: lookupswitch default -> 1776, -1235846097 -> 1731, 833165667 -> 2624
    //   1776: iload #4
    //   1778: getstatic Perryc.c : I
    //   1781: iflt -> 1795
    //   1784: ldc2_w -315538920
    //   1787: l2i
    //   1788: ldc_w 258141359
    //   1791: ixor
    //   1792: goto -> 1803
    //   1795: ldc2_w 882953640
    //   1798: l2i
    //   1799: ldc_w 1638036135
    //   1802: ixor
    //   1803: ldc2_w -1768613671
    //   1806: l2i
    //   1807: ldc_w 154938114
    //   1810: ixor
    //   1811: ixor
    //   1812: lookupswitch default -> 2598, -894726956 -> 1840, 2113576300 -> 1795
    //   1840: aload_1
    //   1841: arraylength
    //   1842: if_icmpge -> 1856
    //   1845: ldc2_w -320935319
    //   1848: l2i
    //   1849: ldc_w -665058269
    //   1852: ixor
    //   1853: goto -> 1864
    //   1856: ldc2_w 1684055503
    //   1859: l2i
    //   1860: ldc_w 1357007748
    //   1863: ixor
    //   1864: ldc2_w -1761048967
    //   1867: l2i
    //   1868: ldc_w 932432167
    //   1871: ixor
    //   1872: ixor
    //   1873: tableswitch default -> 1845, -1810259692 -> 1896, -1810259691 -> 2430
    //   1896: getstatic Perryc.1 : I
    //   1899: ifeq -> 1913
    //   1902: ldc2_w -718526481
    //   1905: l2i
    //   1906: ldc_w -1384972350
    //   1909: ixor
    //   1910: goto -> 1921
    //   1913: ldc2_w 295980490
    //   1916: l2i
    //   1917: ldc_w -2140574293
    //   1920: ixor
    //   1921: ldc2_w -1112107071
    //   1924: l2i
    //   1925: ldc_w -1841728897
    //   1928: ixor
    //   1929: ixor
    //   1930: lookupswitch default -> 1956, 892464237 -> 1913, 1473330579 -> 2630
    //   1956: aload_3
    //   1957: ldc2_w -1655429193
    //   1960: l2i
    //   1961: ldc_w -1655429231
    //   1964: ixor
    //   1965: getstatic Perryc.0 : I
    //   1968: ifle -> 1982
    //   1971: ldc2_w -1776982153
    //   1974: l2i
    //   1975: ldc_w 207758163
    //   1978: ixor
    //   1979: goto -> 1990
    //   1982: ldc2_w 392568317
    //   1985: l2i
    //   1986: ldc_w 137166235
    //   1989: ixor
    //   1990: ldc2_w -87095639
    //   1993: l2i
    //   1994: ldc_w -1812305841
    //   1997: ixor
    //   1998: ixor
    //   1999: lookupswitch default -> 2024, -213767486 -> 2590, -83118574 -> 1982
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: pop
    //   2036: getstatic Perryc.0 : I
    //   2039: ifle -> 2053
    //   2042: ldc2_w 1213505931
    //   2045: l2i
    //   2046: ldc_w 164756746
    //   2049: ixor
    //   2050: goto -> 2061
    //   2053: ldc2_w -2031170891
    //   2056: l2i
    //   2057: ldc_w -1318307520
    //   2060: ixor
    //   2061: ldc2_w 692783682
    //   2064: l2i
    //   2065: ldc_w 860764396
    //   2068: ixor
    //   2069: ixor
    //   2070: lookupswitch default -> 2600, 763871579 -> 2096, 1535143471 -> 2053
    //   2096: aload_1
    //   2097: getstatic Perryc.1 : I
    //   2100: ifeq -> 2114
    //   2103: ldc2_w -257141544
    //   2106: l2i
    //   2107: ldc_w -1061135122
    //   2110: ixor
    //   2111: goto -> 2122
    //   2114: ldc2_w 1217828949
    //   2117: l2i
    //   2118: ldc_w -345667479
    //   2121: ixor
    //   2122: ldc2_w -2000181183
    //   2125: l2i
    //   2126: ldc_w -1726281076
    //   2129: ixor
    //   2130: ixor
    //   2131: lookupswitch default -> 2156, 565226235 -> 2580, 816807241 -> 2114
    //   2156: iload #4
    //   2158: aaload
    //   2159: getstatic Perryc.c : I
    //   2162: iflt -> 2176
    //   2165: ldc2_w -451925962
    //   2168: l2i
    //   2169: ldc_w 1694194526
    //   2172: ixor
    //   2173: goto -> 2184
    //   2176: ldc2_w 129786053
    //   2179: l2i
    //   2180: ldc_w 1815094207
    //   2183: ixor
    //   2184: ldc2_w 885502352
    //   2187: l2i
    //   2188: ldc_w -2111273039
    //   2191: ixor
    //   2192: ixor
    //   2193: lookupswitch default -> 2616, -580684453 -> 2220, 923026761 -> 2176
    //   2220: aload_1
    //   2221: getstatic Perryc.1 : I
    //   2224: ifeq -> 2238
    //   2227: ldc2_w 1553458525
    //   2230: l2i
    //   2231: ldc_w 929563146
    //   2234: ixor
    //   2235: goto -> 2246
    //   2238: ldc2_w -823885566
    //   2241: l2i
    //   2242: ldc_w 1719143546
    //   2245: ixor
    //   2246: ldc2_w 1308068372
    //   2249: l2i
    //   2250: ldc_w -1380397498
    //   2253: ixor
    //   2254: ixor
    //   2255: lookupswitch default -> 2280, -1951358203 -> 2574, -1195232788 -> 2238
    //   2280: iload #4
    //   2282: ldc2_w -303448956
    //   2285: l2i
    //   2286: ldc_w -303448955
    //   2289: ixor
    //   2290: iadd
    //   2291: aaload
    //   2292: getstatic Perryc.1 : I
    //   2295: ifeq -> 2309
    //   2298: ldc2_w 791703555
    //   2301: l2i
    //   2302: ldc_w -1682632989
    //   2305: ixor
    //   2306: goto -> 2317
    //   2309: ldc2_w 793867392
    //   2312: l2i
    //   2313: ldc_w 163494993
    //   2316: ixor
    //   2317: ldc2_w -193550529
    //   2320: l2i
    //   2321: ldc_w 2011543712
    //   2324: ixor
    //   2325: ixor
    //   2326: lookupswitch default -> 2586, -1518545074 -> 2352, 924213631 -> 2309
    //   2352: aload_3
    //   2353: getstatic Perryc.0 : I
    //   2356: ifle -> 2370
    //   2359: ldc2_w 1213422884
    //   2362: l2i
    //   2363: ldc_w 396839027
    //   2366: ixor
    //   2367: goto -> 2378
    //   2370: ldc2_w 1082123456
    //   2373: l2i
    //   2374: ldc_w 1639962403
    //   2377: ixor
    //   2378: ldc2_w 85550519
    //   2381: l2i
    //   2382: ldc_w 1898867788
    //   2385: ixor
    //   2386: ixor
    //   2387: lookupswitch default -> 2412, 734207148 -> 2606, 1075342947 -> 2370
    //   2412: goto -> 2416
    //   2415: athrow
    //   2416: invokestatic addParam : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   2419: goto -> 2423
    //   2422: athrow
    //   2423: pop
    //   2424: iinc #4, 2
    //   2427: goto -> 1714
    //   2430: getstatic Perryc.0 : I
    //   2433: ifle -> 2447
    //   2436: ldc2_w 854288023
    //   2439: l2i
    //   2440: ldc_w 1231570743
    //   2443: ixor
    //   2444: goto -> 2455
    //   2447: ldc2_w -1270428814
    //   2450: l2i
    //   2451: ldc_w 1420640165
    //   2454: ixor
    //   2455: ldc2_w -300400710
    //   2458: l2i
    //   2459: ldc_w -1308235568
    //   2462: ixor
    //   2463: ixor
    //   2464: lookupswitch default -> 2632, -1124719683 -> 2492, 664729290 -> 2447
    //   2492: aload_3
    //   2493: getstatic Perryc.1 : I
    //   2496: ifeq -> 2510
    //   2499: ldc2_w -1930534309
    //   2502: l2i
    //   2503: ldc_w 1847406792
    //   2506: ixor
    //   2507: goto -> 2518
    //   2510: ldc2_w -497920062
    //   2513: l2i
    //   2514: ldc_w 2093542511
    //   2517: ixor
    //   2518: ldc2_w -1244355676
    //   2521: l2i
    //   2522: ldc_w -1959227984
    //   2525: ixor
    //   2526: ixor
    //   2527: lookupswitch default -> 2610, -1602841159 -> 2552, -601916281 -> 2510
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokevirtual toString : ()Ljava/lang/String;
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: areturn
    //   2564: aconst_null
    //   2565: athrow
    //   2566: aconst_null
    //   2567: athrow
    //   2568: aconst_null
    //   2569: athrow
    //   2570: aconst_null
    //   2571: athrow
    //   2572: aconst_null
    //   2573: athrow
    //   2574: aconst_null
    //   2575: athrow
    //   2576: aconst_null
    //   2577: athrow
    //   2578: aconst_null
    //   2579: athrow
    //   2580: aconst_null
    //   2581: athrow
    //   2582: aconst_null
    //   2583: athrow
    //   2584: aconst_null
    //   2585: athrow
    //   2586: aconst_null
    //   2587: athrow
    //   2588: aconst_null
    //   2589: athrow
    //   2590: aconst_null
    //   2591: athrow
    //   2592: aconst_null
    //   2593: athrow
    //   2594: aconst_null
    //   2595: athrow
    //   2596: aconst_null
    //   2597: athrow
    //   2598: aconst_null
    //   2599: athrow
    //   2600: aconst_null
    //   2601: athrow
    //   2602: aconst_null
    //   2603: athrow
    //   2604: aconst_null
    //   2605: athrow
    //   2606: aconst_null
    //   2607: athrow
    //   2608: aconst_null
    //   2609: athrow
    //   2610: aconst_null
    //   2611: athrow
    //   2612: aconst_null
    //   2613: athrow
    //   2614: aconst_null
    //   2615: athrow
    //   2616: aconst_null
    //   2617: athrow
    //   2618: aconst_null
    //   2619: athrow
    //   2620: aconst_null
    //   2621: athrow
    //   2622: aconst_null
    //   2623: athrow
    //   2624: aconst_null
    //   2625: athrow
    //   2626: aconst_null
    //   2627: athrow
    //   2628: aconst_null
    //   2629: athrow
    //   2630: aconst_null
    //   2631: athrow
    //   2632: aconst_null
    //   2633: athrow
    //   2634: pop
    //   2635: goto -> 24
    //   2638: pop
    //   2639: aconst_null
    //   2640: goto -> 2634
    //   2643: dup
    //   2644: ifnull -> 2634
    //   2647: checkcast java/lang/Throwable
    //   2650: athrow
    //   2651: dup
    //   2652: ifnull -> 2638
    //   2655: checkcast java/lang/Throwable
    //   2658: athrow
    //   2659: aconst_null
    //   2660: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1714	716	4	i	I
    //   24	2540	0	url	Ljava/lang/CharSequence;
    //   24	2540	1	params	[Ljava/lang/Object;
    //   217	2347	2	baseUrl	Ljava/lang/String;
    //   985	1579	3	result	Ljava/lang/StringBuilder;
    // Exception table:
    //   from	to	target	type
    //   8	20	2643	java/lang/ClassCastException
    //   147	156	156	finally
    //   147	156	147	finally
    //   147	156	3	finally
    //   148	156	147	java/lang/NegativeArraySizeException
    //   148	156	156	java/lang/IllegalArgumentException
    //   707	714	714	finally
    //   707	714	3	finally
    //   707	714	3	finally
    //   708	714	707	java/util/ConcurrentModificationException
    //   708	714	714	finally
    //   779	786	786	finally
    //   779	786	3	java/lang/NegativeArraySizeException
    //   780	786	786	finally
    //   780	786	779	java/util/NoSuchElementException
    //   780	786	3	java/lang/EnumConstantNotPresentException
    //   915	922	922	finally
    //   915	922	915	finally
    //   915	922	922	finally
    //   916	922	922	finally
    //   916	922	3	finally
    //   1167	1174	1174	finally
    //   1167	1174	1174	java/util/NoSuchElementException
    //   1167	1174	1167	finally
    //   1168	1174	1174	java/lang/ArithmeticException
    //   1168	1174	3	java/lang/ArithmeticException
    //   1359	1366	1366	finally
    //   1359	1366	1359	finally
    //   1360	1366	1366	java/lang/NullPointerException
    //   1360	1366	3	java/lang/ArrayIndexOutOfBoundsException
    //   1360	1366	1366	finally
    //   1636	1642	1642	finally
    //   1636	1642	3	java/lang/ArithmeticException
    //   1636	1642	1642	java/util/ConcurrentModificationException
    //   1636	1642	1642	finally
    //   1636	1642	1642	finally
    //   2027	2034	2034	finally
    //   2027	2034	2027	finally
    //   2027	2034	3	java/lang/StringIndexOutOfBoundsException
    //   2028	2034	2027	finally
    //   2028	2034	3	finally
    //   2415	2422	2422	finally
    //   2415	2422	3	java/lang/NegativeArraySizeException
    //   2416	2422	2415	finally
    //   2416	2422	2415	java/util/ConcurrentModificationException
    //   2416	2422	2415	finally
    //   2555	2562	2562	finally
    //   2555	2562	3	finally
    //   2555	2562	3	finally
    //   2556	2562	2555	java/lang/ClassCastException
    //   2556	2562	2555	finally
    //   2643	2651	2643	java/lang/IllegalStateException
    //   2659	2661	3	finally
  }
  
  public UtilTwo part(String name, String filename, String part) {
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
  
  public Proxy createProxy() {
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
  
  public UtilTwo startPart() {
    return Perry1.0W(this, (int)1964507700L ^ 0x5769874C);
  }
  
  public static StringBuilder addPathSeparator(String paramString, StringBuilder paramStringBuilder) {
    return Perry1.5C(null, (int)-1456735751L ^ 0x8E546099, paramString, paramStringBuilder);
  }
  
  public UtilTwo copy(Reader input, Writer output) {
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
  
  public ByteArrayOutputStream byteStream() {
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
  
  public OutputStreamWriter writer() {
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
  
  public String getParam(String paramString1, String paramString2) {
    return Perry1.17(this, (int)2049290687L ^ 0x407D125A, paramString1, paramString2);
  }
  
  public UtilTwo writePartHeader(String paramString1, String paramString2) {
    return Perry1.R(this, (int)-332269069L ^ 0xE32440F6, paramString1, paramString2);
  }
  
  public static UtilTwo options(URL url) {
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
  
  public UtilTwo followRedirects(boolean paramBoolean) {
    return Perry1.c(this, (int)-861162565L ^ 0xDE1F165A, paramBoolean);
  }
  
  public static SSLSocketFactory getTrustedFactory() {
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
  
  public Map parameters(String headerName) {
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
  
  public UtilTwo contentLength(int paramInt) {
    return Perry1.1p(this, (int)-540927761L ^ 0xE77027DD, paramInt);
  }
  
  public static UtilTwo get(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs) {
    return Perry1.Y(null, (int)-1830499775L ^ 0x9D86F3E9, paramCharSequence, paramBoolean, paramVarArgs);
  }
  
  public UtilTwo uncompress(boolean paramBoolean) {
    return Perry1.c(this, (int)-2023079613L ^ 0x95DEE4A3, paramBoolean);
  }
  
  public InputStreamReader reader() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 321
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 313
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 305
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1178800403
    //   33: l2i
    //   34: ldc_w 1807217015
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1269540342
    //   44: l2i
    //   45: ldc_w -1217392533
    //   48: ixor
    //   49: ldc2_w 1407921028
    //   52: l2i
    //   53: ldc_w 570592203
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 288, -1545420843 -> 41, 1926097454 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 113350410
    //   94: l2i
    //   95: ldc_w 1079716593
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 2047015998
    //   105: l2i
    //   106: ldc_w -368197158
    //   109: ixor
    //   110: ldc2_w 1890232342
    //   113: l2i
    //   114: ldc_w -1555562982
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 294, -1787302921 -> 102, 1138912232 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.1 : I
    //   148: ifeq -> 162
    //   151: ldc2_w -1420173644
    //   154: l2i
    //   155: ldc_w 1189733722
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -334510770
    //   165: l2i
    //   166: ldc_w -1315589217
    //   169: ixor
    //   170: ldc2_w -1988205890
    //   173: l2i
    //   174: ldc_w 753807991
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 292, -133552616 -> 204, 1210084135 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual charset : ()Ljava/lang/String;
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.1 : I
    //   218: ifeq -> 232
    //   221: ldc2_w 555602852
    //   224: l2i
    //   225: ldc_w -476828835
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 1182536141
    //   235: l2i
    //   236: ldc_w 598787224
    //   239: ixor
    //   240: ldc2_w 865502837
    //   243: l2i
    //   244: ldc_w -1934237247
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, 1291103843 -> 232, 2108333901 -> 290
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual reader : (Ljava/lang/String;)Ljava/io/InputStreamReader;
    //   283: goto -> 287
    //   286: athrow
    //   287: areturn
    //   288: aconst_null
    //   289: athrow
    //   290: aconst_null
    //   291: athrow
    //   292: aconst_null
    //   293: athrow
    //   294: aconst_null
    //   295: athrow
    //   296: pop
    //   297: goto -> 24
    //   300: pop
    //   301: aconst_null
    //   302: goto -> 296
    //   305: dup
    //   306: ifnull -> 296
    //   309: checkcast java/lang/Throwable
    //   312: athrow
    //   313: dup
    //   314: ifnull -> 300
    //   317: checkcast java/lang/Throwable
    //   320: athrow
    //   321: aconst_null
    //   322: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	264	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	305	finally
    //   207	214	214	finally
    //   207	214	214	finally
    //   208	214	207	finally
    //   208	214	214	java/lang/IllegalStateException
    //   208	214	3	finally
    //   280	286	286	finally
    //   280	286	3	java/lang/NullPointerException
    //   280	286	286	finally
    //   280	286	286	finally
    //   280	286	286	finally
    //   305	313	305	finally
    //   321	323	3	finally
  }
  
  public String eTag() {
    return Perry1.h(this, (int)-378774219L ^ 0xFC621370);
  }
  
  public UtilTwo ifNoneMatch(String paramString) {
    return Perry1.00(this, (int)1813500018L ^ 0x2B01C976, paramString);
  }
  
  public boolean serverError() {
    return Perry1.4D(this, (int)1429008907L ^ 0x7EE58EFC);
  }
  
  public String[] headers(String paramString) {
    return Perry1.12(this, (int)-1956776591L ^ 0xCF1D7769, paramString);
  }
  
  public UtilTwo closeOutputQuietly() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 387
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 379
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 371
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 178568761
    //   33: l2i
    //   34: ldc_w 919619023
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 409338101
    //   44: l2i
    //   45: ldc_w -692728158
    //   48: ixor
    //   49: ldc2_w 218498486
    //   52: l2i
    //   53: ldc_w -1251042239
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 354, -2078514687 -> 41, 1991989152 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -1241964161
    //   94: l2i
    //   95: ldc_w -1735837157
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -2013109387
    //   105: l2i
    //   106: ldc_w -1770327434
    //   109: ixor
    //   110: ldc2_w 2014334904
    //   113: l2i
    //   114: ldc_w 1318163329
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 352, 468830045 -> 102, 687426874 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual closeOutput : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: areturn
    //   156: getstatic Perryc.1 : I
    //   159: ifeq -> 173
    //   162: ldc2_w 463529827
    //   165: l2i
    //   166: ldc_w -1901585514
    //   169: ixor
    //   170: goto -> 181
    //   173: ldc2_w 1286429280
    //   176: l2i
    //   177: ldc_w -1830331694
    //   180: ixor
    //   181: ldc2_w -1230545665
    //   184: l2i
    //   185: ldc_w -1008435794
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 356, -1425464861 -> 216, -531898972 -> 173
    //   216: astore_1
    //   217: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   220: dup
    //   221: getstatic Perryc.1 : I
    //   224: ifeq -> 238
    //   227: ldc2_w -1318556370
    //   230: l2i
    //   231: ldc_w -72706071
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w -91662243
    //   241: l2i
    //   242: ldc_w 1974995655
    //   245: ixor
    //   246: ldc2_w -1922340998
    //   249: l2i
    //   250: ldc_w -205795612
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 358, -236848380 -> 280, 873616217 -> 238
    //   280: aload_1
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 298
    //   287: ldc2_w 740299565
    //   290: l2i
    //   291: ldc_w -607353354
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w -1171616019
    //   301: l2i
    //   302: ldc_w -655148943
    //   305: ixor
    //   306: ldc2_w -1034536684
    //   309: l2i
    //   310: ldc_w 25690484
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, 875736763 -> 360, 1208452782 -> 298
    //   340: goto -> 344
    //   343: athrow
    //   344: invokespecial <init> : (Ljava/io/IOException;)V
    //   347: goto -> 351
    //   350: athrow
    //   351: athrow
    //   352: aconst_null
    //   353: athrow
    //   354: aconst_null
    //   355: athrow
    //   356: aconst_null
    //   357: athrow
    //   358: aconst_null
    //   359: athrow
    //   360: aconst_null
    //   361: athrow
    //   362: pop
    //   363: goto -> 24
    //   366: pop
    //   367: aconst_null
    //   368: goto -> 362
    //   371: dup
    //   372: ifnull -> 362
    //   375: checkcast java/lang/Throwable
    //   378: athrow
    //   379: dup
    //   380: ifnull -> 366
    //   383: checkcast java/lang/Throwable
    //   386: athrow
    //   387: aconst_null
    //   388: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   217	135	1	e	Ljava/io/IOException;
    //   24	328	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	371	finally
    //   24	147	156	java/io/IOException
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	3	finally
    //   148	154	3	java/lang/IllegalStateException
    //   148	155	156	java/io/IOException
    //   343	350	350	finally
    //   343	350	350	finally
    //   343	350	350	java/lang/UnsupportedOperationException
    //   343	350	343	finally
    //   343	350	350	finally
    //   371	379	371	finally
    //   387	389	3	finally
  }
  
  public Map getParams(String header) {
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
  
  public UtilTwo acceptGzipEncoding() {
    return Perry1.0U(this, (int)2070816L ^ 0x6BC7C5AD);
  }
  
  public UtilTwo contentLength(String paramString) {
    return Perry1.01(this, (int)959169537L ^ 0x444E0D1F, paramString);
  }
  
  public UtilTwo contentType(String paramString) {
    return Perry1.Z(this, (int)407806790L ^ 0x12F6BC68, paramString);
  }
  
  public UtilTwo part(String name, File part) {
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
  
  public UtilTwo contentType(String contentType, String charset) {
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
  
  public UtilTwo part(String name, Number part) {
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
  
  public String charset() {
    return Perry1.4(this, (int)671241471L ^ 0x5CD72812);
  }
  
  public UtilTwo send(Reader input) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1338
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1330
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1322
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -1035790191
    //   33: l2i
    //   34: ldc_w 688213734
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -2072156903
    //   44: l2i
    //   45: ldc_w -1872238844
    //   48: ixor
    //   49: ldc2_w -990502727
    //   52: l2i
    //   53: ldc_w 1760177339
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1311, -1207529953 -> 84, 1197103733 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w 976276391
    //   94: l2i
    //   95: ldc_w -1864421003
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -608354129
    //   105: l2i
    //   106: ldc_w 604610467
    //   109: ixor
    //   110: ldc2_w 1887271790
    //   113: l2i
    //   114: ldc_w 199095459
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 1305, -2079043391 -> 144, -783321825 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual openOutput : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: pop
    //   156: goto -> 356
    //   159: getstatic Perryc.1 : I
    //   162: ifeq -> 176
    //   165: ldc2_w -303480148
    //   168: l2i
    //   169: ldc_w -377590582
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w -1410852026
    //   179: l2i
    //   180: ldc_w 887599720
    //   183: ixor
    //   184: ldc2_w 236486989
    //   187: l2i
    //   188: ldc_w 1568491573
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 1277, -865443754 -> 220, 1475536670 -> 176
    //   220: astore_2
    //   221: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   224: dup
    //   225: getstatic Perryc.1 : I
    //   228: ifeq -> 242
    //   231: ldc2_w 1822965100
    //   234: l2i
    //   235: ldc_w -685174978
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w 2055505032
    //   245: l2i
    //   246: ldc_w 1527576918
    //   249: ixor
    //   250: ldc2_w 1424845551
    //   253: l2i
    //   254: ldc_w 1274731902
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 1285, -1533639229 -> 242, 1050659407 -> 284
    //   284: aload_2
    //   285: getstatic Perryc.0 : I
    //   288: ifle -> 302
    //   291: ldc2_w -524214052
    //   294: l2i
    //   295: ldc_w 2008179743
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w -478420393
    //   305: l2i
    //   306: ldc_w 1536674767
    //   309: ixor
    //   310: ldc2_w -1692234232
    //   313: l2i
    //   314: ldc_w -1365630995
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 1275, -1923827587 -> 344, -1563699930 -> 302
    //   344: goto -> 348
    //   347: athrow
    //   348: invokespecial <init> : (Ljava/io/IOException;)V
    //   351: goto -> 355
    //   354: athrow
    //   355: athrow
    //   356: new java/io/OutputStreamWriter
    //   359: dup
    //   360: getstatic Perryc.0 : I
    //   363: ifle -> 377
    //   366: ldc2_w -1861069393
    //   369: l2i
    //   370: ldc_w 1028473430
    //   373: ixor
    //   374: goto -> 385
    //   377: ldc2_w -485941473
    //   380: l2i
    //   381: ldc_w 2076232247
    //   384: ixor
    //   385: ldc2_w -848008135
    //   388: l2i
    //   389: ldc_w -1918569785
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 1279, -669430826 -> 420, -326137593 -> 377
    //   420: aload_0
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 438
    //   427: ldc2_w -1159776400
    //   430: l2i
    //   431: ldc_w -742758292
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w -1997994941
    //   441: l2i
    //   442: ldc_w -1673204043
    //   445: ixor
    //   446: ldc2_w 1176416599
    //   449: l2i
    //   450: ldc_w 102001561
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 480, -2008323835 -> 438, 695174610 -> 1299
    //   480: getfield output : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$RequestOutputStream;
    //   483: getstatic Perryc.1 : I
    //   486: ifeq -> 500
    //   489: ldc2_w -338406543
    //   492: l2i
    //   493: ldc_w -1830958395
    //   496: ixor
    //   497: goto -> 508
    //   500: ldc2_w -2076749060
    //   503: l2i
    //   504: ldc_w -1449598386
    //   507: ixor
    //   508: ldc2_w -178717380
    //   511: l2i
    //   512: ldc_w 273262391
    //   515: ixor
    //   516: ixor
    //   517: lookupswitch default -> 1307, -1676098625 -> 500, -927012167 -> 544
    //   544: aload_0
    //   545: getstatic Perryc.1 : I
    //   548: ifeq -> 562
    //   551: ldc2_w -1267587543
    //   554: l2i
    //   555: ldc_w 1193118769
    //   558: ixor
    //   559: goto -> 570
    //   562: ldc2_w 1993590821
    //   565: l2i
    //   566: ldc_w 1522331036
    //   569: ixor
    //   570: ldc2_w 983731993
    //   573: l2i
    //   574: ldc_w 1196713579
    //   577: ixor
    //   578: ixor
    //   579: lookupswitch default -> 604, -1902558358 -> 1283, -551491809 -> 562
    //   604: getfield output : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$RequestOutputStream;
    //   607: getstatic Perryc.1 : I
    //   610: ifeq -> 624
    //   613: ldc2_w 6309043
    //   616: l2i
    //   617: ldc_w 963383691
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w -1383968627
    //   627: l2i
    //   628: ldc_w -1338869861
    //   631: ixor
    //   632: ldc2_w -1561476126
    //   635: l2i
    //   636: ldc_w 1959465128
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 1301, -879299492 -> 668, -282425742 -> 624
    //   668: goto -> 672
    //   671: athrow
    //   672: invokestatic access$500 : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo$RequestOutputStream;)Ljava/nio/charset/CharsetEncoder;
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 696
    //   685: ldc2_w 1830507450
    //   688: l2i
    //   689: ldc_w -189515167
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -581722951
    //   699: l2i
    //   700: ldc_w -1471661653
    //   703: ixor
    //   704: ldc2_w 1928143942
    //   707: l2i
    //   708: ldc_w 1497199015
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 740, -1300284358 -> 1297, 213064044 -> 696
    //   740: goto -> 744
    //   743: athrow
    //   744: invokevirtual charset : ()Ljava/nio/charset/Charset;
    //   747: goto -> 751
    //   750: athrow
    //   751: getstatic Perryc.c : I
    //   754: iflt -> 768
    //   757: ldc2_w -1897883901
    //   760: l2i
    //   761: ldc_w -1497803614
    //   764: ixor
    //   765: goto -> 776
    //   768: ldc2_w -1719658116
    //   771: l2i
    //   772: ldc_w 1084745686
    //   775: ixor
    //   776: ldc2_w 498616448
    //   779: l2i
    //   780: ldc_w 1702135068
    //   783: ixor
    //   784: ixor
    //   785: lookupswitch default -> 1289, -1578421450 -> 812, 1351945789 -> 768
    //   812: goto -> 816
    //   815: athrow
    //   816: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   819: goto -> 823
    //   822: athrow
    //   823: getstatic Perryc.c : I
    //   826: iflt -> 840
    //   829: ldc2_w -542564235
    //   832: l2i
    //   833: ldc_w 357207956
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w -616605232
    //   843: l2i
    //   844: ldc_w 90924537
    //   847: ixor
    //   848: ldc2_w 746442410
    //   851: l2i
    //   852: ldc_w -1824525793
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 1287, 1628831900 -> 884, 1973523284 -> 840
    //   884: astore_2
    //   885: new bigname/zprestige/webhack/manager/Identity/UtilTwo$10
    //   888: dup
    //   889: getstatic Perryc.0 : I
    //   892: ifle -> 906
    //   895: ldc2_w -1346015815
    //   898: l2i
    //   899: ldc_w 1854614443
    //   902: ixor
    //   903: goto -> 914
    //   906: ldc2_w 892452830
    //   909: l2i
    //   910: ldc_w -1607492126
    //   913: ixor
    //   914: ldc2_w -130625352
    //   917: l2i
    //   918: ldc_w -128402012
    //   921: ixor
    //   922: ixor
    //   923: lookupswitch default -> 1303, -1787801824 -> 948, -1054856434 -> 906
    //   948: aload_0
    //   949: getstatic Perryc.1 : I
    //   952: ifeq -> 966
    //   955: ldc2_w 1927853146
    //   958: l2i
    //   959: ldc_w -508077542
    //   962: ixor
    //   963: goto -> 974
    //   966: ldc2_w -280711828
    //   969: l2i
    //   970: ldc_w -1444415827
    //   973: ixor
    //   974: ldc2_w 1045802553
    //   977: l2i
    //   978: ldc_w 2142759692
    //   981: ixor
    //   982: ixor
    //   983: lookupswitch default -> 1008, -759321739 -> 1293, -73694081 -> 966
    //   1008: aload_2
    //   1009: getstatic Perryc.0 : I
    //   1012: ifle -> 1026
    //   1015: ldc2_w -1284850792
    //   1018: l2i
    //   1019: ldc_w 1368210141
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 699389152
    //   1029: l2i
    //   1030: ldc_w -2101496108
    //   1033: ixor
    //   1034: ldc2_w 1664626910
    //   1037: l2i
    //   1038: ldc_w 472035329
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1295, -1644363366 -> 1026, -737615125 -> 1068
    //   1068: aload_1
    //   1069: getstatic Perryc.1 : I
    //   1072: ifeq -> 1086
    //   1075: ldc2_w -1489895768
    //   1078: l2i
    //   1079: ldc_w 282411479
    //   1082: ixor
    //   1083: goto -> 1094
    //   1086: ldc2_w -1304613118
    //   1089: l2i
    //   1090: ldc_w -127881892
    //   1093: ixor
    //   1094: ldc2_w 1384756292
    //   1097: l2i
    //   1098: ldc_w -1307908263
    //   1101: ixor
    //   1102: ixor
    //   1103: lookupswitch default -> 1281, -1428238013 -> 1128, 1466428514 -> 1086
    //   1128: aload_2
    //   1129: getstatic Perryc.0 : I
    //   1132: ifle -> 1146
    //   1135: ldc2_w 233115112
    //   1138: l2i
    //   1139: ldc_w 1359665473
    //   1142: ixor
    //   1143: goto -> 1154
    //   1146: ldc2_w -930594169
    //   1149: l2i
    //   1150: ldc_w -1017845018
    //   1153: ixor
    //   1154: ldc2_w -1144103621
    //   1157: l2i
    //   1158: ldc_w 1620295874
    //   1161: ixor
    //   1162: ixor
    //   1163: lookupswitch default -> 1188, -2142721799 -> 1146, -2018358960 -> 1291
    //   1188: goto -> 1192
    //   1191: athrow
    //   1192: invokespecial <init> : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;Ljava/io/Flushable;Ljava/io/Reader;Ljava/io/Writer;)V
    //   1195: goto -> 1199
    //   1198: athrow
    //   1199: getstatic Perryc.c : I
    //   1202: iflt -> 1216
    //   1205: ldc2_w 1917632945
    //   1208: l2i
    //   1209: ldc_w 1842259320
    //   1212: ixor
    //   1213: goto -> 1224
    //   1216: ldc2_w 1619629236
    //   1219: l2i
    //   1220: ldc_w 977042275
    //   1223: ixor
    //   1224: ldc2_w 641099444
    //   1227: l2i
    //   1228: ldc_w 946267028
    //   1231: ixor
    //   1232: ixor
    //   1233: lookupswitch default -> 1309, 30597609 -> 1216, 1155885815 -> 1260
    //   1260: goto -> 1264
    //   1263: athrow
    //   1264: invokevirtual call : ()Ljava/lang/Object;
    //   1267: goto -> 1271
    //   1270: athrow
    //   1271: checkcast bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   1274: areturn
    //   1275: aconst_null
    //   1276: athrow
    //   1277: aconst_null
    //   1278: athrow
    //   1279: aconst_null
    //   1280: athrow
    //   1281: aconst_null
    //   1282: athrow
    //   1283: aconst_null
    //   1284: athrow
    //   1285: aconst_null
    //   1286: athrow
    //   1287: aconst_null
    //   1288: athrow
    //   1289: aconst_null
    //   1290: athrow
    //   1291: aconst_null
    //   1292: athrow
    //   1293: aconst_null
    //   1294: athrow
    //   1295: aconst_null
    //   1296: athrow
    //   1297: aconst_null
    //   1298: athrow
    //   1299: aconst_null
    //   1300: athrow
    //   1301: aconst_null
    //   1302: athrow
    //   1303: aconst_null
    //   1304: athrow
    //   1305: aconst_null
    //   1306: athrow
    //   1307: aconst_null
    //   1308: athrow
    //   1309: aconst_null
    //   1310: athrow
    //   1311: aconst_null
    //   1312: athrow
    //   1313: pop
    //   1314: goto -> 24
    //   1317: pop
    //   1318: aconst_null
    //   1319: goto -> 1313
    //   1322: dup
    //   1323: ifnull -> 1313
    //   1326: checkcast java/lang/Throwable
    //   1329: athrow
    //   1330: dup
    //   1331: ifnull -> 1317
    //   1334: checkcast java/lang/Throwable
    //   1337: athrow
    //   1338: aconst_null
    //   1339: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   221	135	2	e	Ljava/io/IOException;
    //   24	1251	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	1251	1	input	Ljava/io/Reader;
    //   885	390	2	writer	Ljava/io/Writer;
    // Exception table:
    //   from	to	target	type
    //   8	20	1322	finally
    //   24	147	159	java/io/IOException
    //   148	154	154	finally
    //   148	154	3	finally
    //   148	154	3	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	156	159	java/io/IOException
    //   347	354	354	finally
    //   347	354	347	java/lang/NumberFormatException
    //   348	354	347	finally
    //   348	354	347	finally
    //   348	354	3	finally
    //   671	678	678	finally
    //   671	678	3	java/util/NoSuchElementException
    //   671	678	671	finally
    //   672	678	678	finally
    //   672	678	3	finally
    //   743	750	750	finally
    //   743	750	3	finally
    //   743	750	750	java/lang/NullPointerException
    //   744	750	750	java/lang/IllegalStateException
    //   744	750	743	finally
    //   815	822	822	finally
    //   815	822	822	finally
    //   815	822	815	java/lang/IndexOutOfBoundsException
    //   816	822	822	java/util/ConcurrentModificationException
    //   816	822	822	java/lang/ClassCastException
    //   1191	1198	1198	finally
    //   1191	1198	1198	finally
    //   1191	1198	1191	java/lang/IllegalArgumentException
    //   1191	1198	3	java/lang/StringIndexOutOfBoundsException
    //   1192	1198	1198	finally
    //   1263	1270	1270	finally
    //   1264	1270	1263	finally
    //   1264	1270	3	finally
    //   1264	1270	1270	java/lang/ClassCastException
    //   1264	1270	1263	finally
    //   1322	1330	1322	java/lang/IllegalArgumentException
    //   1338	1340	3	java/lang/NegativeArraySizeException
  }
  
  public static StringBuilder addParamPrefix(String paramString, StringBuilder paramStringBuilder) {
    return Perry1.5C(null, (int)-118638183L ^ 0xDF9220F8, paramString, paramStringBuilder);
  }
  
  public UtilTwo writePartHeader(String name, String filename, String contentType) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2121
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2113
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2105
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w 136247399
    //   37: l2i
    //   38: ldc_w 1213340507
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 276869515
    //   48: l2i
    //   49: ldc_w -1438046352
    //   52: ixor
    //   53: ldc2_w 975159793
    //   56: l2i
    //   57: ldc_w -1145320677
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1620518863 -> 45, -1041700394 -> 2058
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w -1441493360
    //   108: l2i
    //   109: ldc_w -840333031
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 986195005
    //   119: l2i
    //   120: ldc_w 1517307472
    //   123: ixor
    //   124: ldc2_w -2084712813
    //   127: l2i
    //   128: ldc_w -1937189124
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 2060, 1757945830 -> 116, 1871542786 -> 160
    //   160: astore #4
    //   162: getstatic Perryc.0 : I
    //   165: ifle -> 179
    //   168: ldc2_w -1491975123
    //   171: l2i
    //   172: ldc_w 1896554529
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -1062952666
    //   182: l2i
    //   183: ldc_w -724772873
    //   186: ixor
    //   187: ldc2_w -1908822940
    //   190: l2i
    //   191: ldc_w 387791872
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -542622614 -> 179, 1329460328 -> 2042
    //   224: aload #4
    //   226: ldc_w '庈㌜延晗啽뀶๸⌷햏ক਩鍗⪁贽쎶违'
    //   229: getstatic Perryc.c : I
    //   232: iflt -> 246
    //   235: ldc2_w -2092425355
    //   238: l2i
    //   239: ldc_w 1599932734
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w -1983199043
    //   249: l2i
    //   250: ldc_w 1195544797
    //   253: ixor
    //   254: ldc2_w 764483755
    //   257: l2i
    //   258: ldc_w 1637255828
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 2088, -2104505761 -> 288, -1877834636 -> 246
    //   288: goto -> 292
    //   291: athrow
    //   292: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   295: goto -> 299
    //   298: athrow
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 316
    //   305: ldc2_w 1529464926
    //   308: l2i
    //   309: ldc_w 779107582
    //   312: ixor
    //   313: goto -> 324
    //   316: ldc2_w -1840631977
    //   319: l2i
    //   320: ldc_w 897085153
    //   323: ixor
    //   324: ldc2_w -1469082733
    //   327: l2i
    //   328: ldc_w -350514073
    //   331: ixor
    //   332: ixor
    //   333: lookupswitch default -> 2050, -465156542 -> 360, 908981076 -> 316
    //   360: goto -> 364
    //   363: athrow
    //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: goto -> 371
    //   370: athrow
    //   371: getstatic Perryc.0 : I
    //   374: ifle -> 388
    //   377: ldc2_w 416195973
    //   380: l2i
    //   381: ldc_w 212820455
    //   384: ixor
    //   385: goto -> 396
    //   388: ldc2_w 1658773419
    //   391: l2i
    //   392: ldc_w 1878378582
    //   395: ixor
    //   396: ldc2_w -532923223
    //   399: l2i
    //   400: ldc_w 1551082016
    //   403: ixor
    //   404: ixor
    //   405: lookupswitch default -> 432, -1473357077 -> 2074, 1219320504 -> 388
    //   432: aload_1
    //   433: getstatic Perryc.1 : I
    //   436: ifeq -> 450
    //   439: ldc2_w -1799810034
    //   442: l2i
    //   443: ldc_w 1538112542
    //   446: ixor
    //   447: goto -> 458
    //   450: ldc2_w -309948470
    //   453: l2i
    //   454: ldc_w -1552082207
    //   457: ixor
    //   458: ldc2_w 205870833
    //   461: l2i
    //   462: ldc_w -961836511
    //   465: ixor
    //   466: ixor
    //   467: lookupswitch default -> 492, -260890474 -> 450, 100299968 -> 2044
    //   492: goto -> 496
    //   495: athrow
    //   496: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: goto -> 503
    //   502: athrow
    //   503: pop
    //   504: getstatic Perryc.c : I
    //   507: iflt -> 521
    //   510: ldc2_w 931647831
    //   513: l2i
    //   514: ldc_w -2047342974
    //   517: ixor
    //   518: goto -> 529
    //   521: ldc2_w 2115300901
    //   524: l2i
    //   525: ldc_w 2090052751
    //   528: ixor
    //   529: ldc2_w 1123539535
    //   532: l2i
    //   533: ldc_w -1525695380
    //   536: ixor
    //   537: ixor
    //   538: lookupswitch default -> 2070, -444652407 -> 564, 1434956278 -> 521
    //   564: aload_2
    //   565: ifnull -> 579
    //   568: ldc2_w 866904353
    //   571: l2i
    //   572: ldc_w 1136526616
    //   575: ixor
    //   576: goto -> 587
    //   579: ldc2_w -871231598
    //   582: l2i
    //   583: ldc_w -1140333656
    //   586: ixor
    //   587: ldc2_w -1159577465
    //   590: l2i
    //   591: ldc_w -580423625
    //   594: ixor
    //   595: ixor
    //   596: tableswitch default -> 568, 395369609 -> 620, 395369610 -> 960
    //   620: getstatic Perryc.1 : I
    //   623: ifeq -> 637
    //   626: ldc2_w 170689168
    //   629: l2i
    //   630: ldc_w 282020922
    //   633: ixor
    //   634: goto -> 645
    //   637: ldc2_w -650627271
    //   640: l2i
    //   641: ldc_w -126597437
    //   644: ixor
    //   645: ldc2_w 1457690721
    //   648: l2i
    //   649: ldc_w 809297998
    //   652: ixor
    //   653: ixor
    //   654: lookupswitch default -> 2094, 1200751061 -> 680, 2084421253 -> 637
    //   680: aload #4
    //   682: ldc_w '廌㍈庤晜唹뀾๼⌭햏ৃ੺錔'
    //   685: getstatic Perryc.c : I
    //   688: iflt -> 702
    //   691: ldc2_w 1393411316
    //   694: l2i
    //   695: ldc_w -695553271
    //   698: ixor
    //   699: goto -> 710
    //   702: ldc2_w 1464791972
    //   705: l2i
    //   706: ldc_w -103971178
    //   709: ixor
    //   710: ldc2_w -530527725
    //   713: l2i
    //   714: ldc_w -1532331591
    //   717: ixor
    //   718: ixor
    //   719: lookupswitch default -> 744, -1051868073 -> 2056, 879076381 -> 702
    //   744: goto -> 748
    //   747: athrow
    //   748: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   751: goto -> 755
    //   754: athrow
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w 31427417
    //   764: l2i
    //   765: ldc_w 159757250
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -1066880809
    //   775: l2i
    //   776: ldc_w 1803122138
    //   779: ixor
    //   780: ldc2_w 516193058
    //   783: l2i
    //   784: ldc_w -386488524
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 816, -26680179 -> 2066, 595888579 -> 772
    //   816: goto -> 820
    //   819: athrow
    //   820: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: goto -> 827
    //   826: athrow
    //   827: getstatic Perryc.c : I
    //   830: iflt -> 844
    //   833: ldc2_w 1090935006
    //   836: l2i
    //   837: ldc_w -1835633364
    //   840: ixor
    //   841: goto -> 852
    //   844: ldc2_w -850612542
    //   847: l2i
    //   848: ldc_w 632901047
    //   851: ixor
    //   852: ldc2_w -696037784
    //   855: l2i
    //   856: ldc_w 1156908115
    //   859: ixor
    //   860: ixor
    //   861: lookupswitch default -> 888, -1390322640 -> 844, 1105618889 -> 2040
    //   888: aload_2
    //   889: getstatic Perryc.0 : I
    //   892: ifle -> 906
    //   895: ldc2_w -1400140620
    //   898: l2i
    //   899: ldc_w -361153558
    //   902: ixor
    //   903: goto -> 914
    //   906: ldc2_w -116582550
    //   909: l2i
    //   910: ldc_w 788660447
    //   913: ixor
    //   914: ldc2_w -772892631
    //   917: l2i
    //   918: ldc_w 1909609972
    //   921: ixor
    //   922: ixor
    //   923: lookupswitch default -> 2046, -422675837 -> 906, 1983109736 -> 948
    //   948: goto -> 952
    //   951: athrow
    //   952: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: goto -> 959
    //   958: athrow
    //   959: pop
    //   960: getstatic Perryc.c : I
    //   963: iflt -> 977
    //   966: ldc2_w 1643458851
    //   969: l2i
    //   970: ldc_w -36439591
    //   973: ixor
    //   974: goto -> 985
    //   977: ldc2_w -63856897
    //   980: l2i
    //   981: ldc_w 1144270506
    //   984: ixor
    //   985: ldc2_w -1001056684
    //   988: l2i
    //   989: ldc_w -217456658
    //   992: ixor
    //   993: ixor
    //   994: lookupswitch default -> 2080, -1889961489 -> 1020, -1418067648 -> 977
    //   1020: aload #4
    //   1022: ldc2_w -1552808832
    //   1025: l2i
    //   1026: ldc_w -1552808798
    //   1029: ixor
    //   1030: getstatic Perryc.1 : I
    //   1033: ifeq -> 1047
    //   1036: ldc2_w 496660331
    //   1039: l2i
    //   1040: ldc_w 911221356
    //   1043: ixor
    //   1044: goto -> 1055
    //   1047: ldc2_w -496288084
    //   1050: l2i
    //   1051: ldc_w 194981564
    //   1054: ixor
    //   1055: ldc2_w -168969548
    //   1058: l2i
    //   1059: ldc_w -770962498
    //   1062: ixor
    //   1063: ixor
    //   1064: lookupswitch default -> 2086, -837443302 -> 1092, 204209165 -> 1047
    //   1092: goto -> 1096
    //   1095: athrow
    //   1096: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1099: goto -> 1103
    //   1102: athrow
    //   1103: pop
    //   1104: getstatic Perryc.1 : I
    //   1107: ifeq -> 1121
    //   1110: ldc2_w 1066343489
    //   1113: l2i
    //   1114: ldc_w -459206089
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w 1804308380
    //   1124: l2i
    //   1125: ldc_w 2079116188
    //   1128: ixor
    //   1129: ldc2_w 1197284589
    //   1132: l2i
    //   1133: ldc_w -461311125
    //   1136: ixor
    //   1137: ixor
    //   1138: lookupswitch default -> 1164, 1177876654 -> 1121, 2029249008 -> 2052
    //   1164: aload_0
    //   1165: ldc_w '庭㌜廪晎唵뀼๭⍮햪ে਷鍙⪟贱쏿辖蚌ﲍ'
    //   1168: getstatic Perryc.c : I
    //   1171: iflt -> 1185
    //   1174: ldc2_w 1568574809
    //   1177: l2i
    //   1178: ldc_w -2137223576
    //   1181: ixor
    //   1182: goto -> 1193
    //   1185: ldc2_w 1548022669
    //   1188: l2i
    //   1189: ldc_w 1012512048
    //   1192: ixor
    //   1193: ldc2_w 1218885467
    //   1196: l2i
    //   1197: ldc_w 447985799
    //   1200: ixor
    //   1201: ixor
    //   1202: lookupswitch default -> 2054, -1879634707 -> 1185, 839403873 -> 1228
    //   1228: goto -> 1232
    //   1231: athrow
    //   1232: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1235: goto -> 1239
    //   1238: athrow
    //   1239: getstatic Perryc.1 : I
    //   1242: ifeq -> 1256
    //   1245: ldc2_w -1029583168
    //   1248: l2i
    //   1249: ldc_w 957055689
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w 1699377097
    //   1259: l2i
    //   1260: ldc_w 652477341
    //   1263: ixor
    //   1264: ldc2_w -9302834
    //   1267: l2i
    //   1268: ldc_w -1865439910
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 1300, -1810373219 -> 2082, -1309566907 -> 1256
    //   1300: aload #4
    //   1302: getstatic Perryc.c : I
    //   1305: iflt -> 1319
    //   1308: ldc2_w 610488913
    //   1311: l2i
    //   1312: ldc_w -1253534807
    //   1315: ixor
    //   1316: goto -> 1327
    //   1319: ldc2_w -1398919175
    //   1322: l2i
    //   1323: ldc_w -1643139561
    //   1326: ixor
    //   1327: ldc2_w 1589631553
    //   1330: l2i
    //   1331: ldc_w -663760011
    //   1334: ixor
    //   1335: ixor
    //   1336: lookupswitch default -> 1364, -379965011 -> 1319, 402376908 -> 2062
    //   1364: goto -> 1368
    //   1367: athrow
    //   1368: invokevirtual toString : ()Ljava/lang/String;
    //   1371: goto -> 1375
    //   1374: athrow
    //   1375: getstatic Perryc.c : I
    //   1378: iflt -> 1392
    //   1381: ldc2_w -619754781
    //   1384: l2i
    //   1385: ldc_w 1076347143
    //   1388: ixor
    //   1389: goto -> 1400
    //   1392: ldc2_w -1053258348
    //   1395: l2i
    //   1396: ldc_w -1503572286
    //   1399: ixor
    //   1400: ldc2_w 555491315
    //   1403: l2i
    //   1404: ldc_w -1480712712
    //   1407: ixor
    //   1408: ixor
    //   1409: lookupswitch default -> 2072, -503594659 -> 1436, 495618543 -> 1392
    //   1436: goto -> 1440
    //   1439: athrow
    //   1440: invokevirtual partHeader : (Ljava/lang/String;Ljava/lang/String;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1443: goto -> 1447
    //   1446: athrow
    //   1447: pop
    //   1448: getstatic Perryc.c : I
    //   1451: iflt -> 1465
    //   1454: ldc2_w 1520576863
    //   1457: l2i
    //   1458: ldc_w 1712623502
    //   1461: ixor
    //   1462: goto -> 1473
    //   1465: ldc2_w 119545354
    //   1468: l2i
    //   1469: ldc_w 1133656480
    //   1472: ixor
    //   1473: ldc2_w 351692667
    //   1476: l2i
    //   1477: ldc_w 21021305
    //   1480: ixor
    //   1481: ixor
    //   1482: lookupswitch default -> 1508, -123500959 -> 1465, 687866835 -> 2076
    //   1508: aload_3
    //   1509: ifnull -> 1523
    //   1512: ldc2_w -7889471
    //   1515: l2i
    //   1516: ldc_w -1353273381
    //   1519: ixor
    //   1520: goto -> 1531
    //   1523: ldc2_w -23953095
    //   1526: l2i
    //   1527: ldc_w -1371294944
    //   1530: ixor
    //   1531: ldc2_w -1161022136
    //   1534: l2i
    //   1535: ldc_w -1743485069
    //   1538: ixor
    //   1539: ixor
    //   1540: tableswitch default -> 1512, 1913225249 -> 1564, 1913225250 -> 1832
    //   1564: getstatic Perryc.0 : I
    //   1567: ifle -> 1581
    //   1570: ldc2_w 514542840
    //   1573: l2i
    //   1574: ldc_w -1788708592
    //   1577: ixor
    //   1578: goto -> 1589
    //   1581: ldc2_w 1055702422
    //   1584: l2i
    //   1585: ldc_w -51148635
    //   1588: ixor
    //   1589: ldc2_w 705329220
    //   1592: l2i
    //   1593: ldc_w -633933579
    //   1596: ixor
    //   1597: ixor
    //   1598: lookupswitch default -> 1624, 811224354 -> 1581, 2079702361 -> 2078
    //   1624: aload_0
    //   1625: ldc_w '庭㌜廪晎唵뀼๭⍮햺ৗਢ'
    //   1628: getstatic Perryc.1 : I
    //   1631: ifeq -> 1645
    //   1634: ldc2_w 97988025
    //   1637: l2i
    //   1638: ldc_w 155736825
    //   1641: ixor
    //   1642: goto -> 1653
    //   1645: ldc2_w -810098207
    //   1648: l2i
    //   1649: ldc_w -1150360045
    //   1652: ixor
    //   1653: ldc2_w -1444182210
    //   1656: l2i
    //   1657: ldc_w 193433652
    //   1660: ixor
    //   1661: ixor
    //   1662: lookupswitch default -> 1688, -1739518395 -> 1645, -1359781814 -> 2092
    //   1688: goto -> 1692
    //   1691: athrow
    //   1692: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1695: goto -> 1699
    //   1698: athrow
    //   1699: getstatic Perryc.c : I
    //   1702: iflt -> 1716
    //   1705: ldc2_w 19802610
    //   1708: l2i
    //   1709: ldc_w 1239619371
    //   1712: ixor
    //   1713: goto -> 1724
    //   1716: ldc2_w 1653206809
    //   1719: l2i
    //   1720: ldc_w 16080993
    //   1723: ixor
    //   1724: ldc2_w 1582460940
    //   1727: l2i
    //   1728: ldc_w -909135728
    //   1731: ixor
    //   1732: ixor
    //   1733: lookupswitch default -> 1760, -548340155 -> 2064, 874061508 -> 1716
    //   1760: aload_3
    //   1761: getstatic Perryc.0 : I
    //   1764: ifle -> 1778
    //   1767: ldc2_w -1873560317
    //   1770: l2i
    //   1771: ldc_w -886953373
    //   1774: ixor
    //   1775: goto -> 1786
    //   1778: ldc2_w 509260076
    //   1781: l2i
    //   1782: ldc_w 1828208307
    //   1785: ixor
    //   1786: ldc2_w -1026842854
    //   1789: l2i
    //   1790: ldc_w -169015789
    //   1793: ixor
    //   1794: ixor
    //   1795: lookupswitch default -> 1820, -1491414619 -> 1778, 1817644649 -> 2068
    //   1820: goto -> 1824
    //   1823: athrow
    //   1824: invokevirtual partHeader : (Ljava/lang/String;Ljava/lang/String;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1827: goto -> 1831
    //   1830: athrow
    //   1831: pop
    //   1832: getstatic Perryc.c : I
    //   1835: iflt -> 1849
    //   1838: ldc2_w 2108057346
    //   1841: l2i
    //   1842: ldc_w -989881375
    //   1845: ixor
    //   1846: goto -> 1857
    //   1849: ldc2_w 587796776
    //   1852: l2i
    //   1853: ldc_w 1196622433
    //   1856: ixor
    //   1857: ldc2_w 1029566558
    //   1860: l2i
    //   1861: ldc_w 411126445
    //   1864: ixor
    //   1865: ixor
    //   1866: lookupswitch default -> 2090, -1668987376 -> 1849, 1099344314 -> 1892
    //   1892: aload_0
    //   1893: ldc_w '廣㍹'
    //   1896: getstatic Perryc.0 : I
    //   1899: ifle -> 1913
    //   1902: ldc2_w 1308667960
    //   1905: l2i
    //   1906: ldc_w -1533282797
    //   1909: ixor
    //   1910: goto -> 1921
    //   1913: ldc2_w -921163009
    //   1916: l2i
    //   1917: ldc_w -767950665
    //   1920: ixor
    //   1921: ldc2_w 880158926
    //   1924: l2i
    //   1925: ldc_w 1417497220
    //   1928: ixor
    //   1929: ixor
    //   1930: lookupswitch default -> 1956, -1970264991 -> 2048, -547264474 -> 1913
    //   1956: goto -> 1960
    //   1959: athrow
    //   1960: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1963: goto -> 1967
    //   1966: athrow
    //   1967: getstatic Perryc.1 : I
    //   1970: ifeq -> 1984
    //   1973: ldc2_w 191531381
    //   1976: l2i
    //   1977: ldc_w -2138100868
    //   1980: ixor
    //   1981: goto -> 1992
    //   1984: ldc2_w 709545572
    //   1987: l2i
    //   1988: ldc_w -1866891268
    //   1991: ixor
    //   1992: ldc2_w -393695227
    //   1995: l2i
    //   1996: ldc_w -371712533
    //   1999: ixor
    //   2000: ixor
    //   2001: lookupswitch default -> 2028, -1967845401 -> 2084, -214885536 -> 1984
    //   2028: goto -> 2032
    //   2031: athrow
    //   2032: invokevirtual send : (Ljava/lang/CharSequence;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   2035: goto -> 2039
    //   2038: athrow
    //   2039: areturn
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
    //   2092: aconst_null
    //   2093: athrow
    //   2094: aconst_null
    //   2095: athrow
    //   2096: pop
    //   2097: goto -> 24
    //   2100: pop
    //   2101: aconst_null
    //   2102: goto -> 2096
    //   2105: dup
    //   2106: ifnull -> 2096
    //   2109: checkcast java/lang/Throwable
    //   2112: athrow
    //   2113: dup
    //   2114: ifnull -> 2100
    //   2117: checkcast java/lang/Throwable
    //   2120: athrow
    //   2121: aconst_null
    //   2122: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	2016	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	2016	1	name	Ljava/lang/String;
    //   24	2016	2	filename	Ljava/lang/String;
    //   24	2016	3	contentType	Ljava/lang/String;
    //   162	1878	4	partBuffer	Ljava/lang/StringBuilder;
    // Exception table:
    //   from	to	target	type
    //   8	20	2105	java/lang/ArithmeticException
    //   92	98	98	finally
    //   92	98	3	finally
    //   92	98	3	java/lang/StringIndexOutOfBoundsException
    //   92	98	98	finally
    //   92	98	98	finally
    //   291	298	298	finally
    //   291	298	291	java/lang/ClassCastException
    //   291	298	298	finally
    //   292	298	3	finally
    //   292	298	291	finally
    //   363	370	370	finally
    //   363	370	363	finally
    //   363	370	363	finally
    //   364	370	370	java/lang/NumberFormatException
    //   364	370	363	finally
    //   496	502	502	finally
    //   496	502	3	java/lang/StringIndexOutOfBoundsException
    //   496	502	3	java/lang/NullPointerException
    //   496	502	502	java/lang/ArithmeticException
    //   496	502	3	finally
    //   747	754	754	finally
    //   747	754	754	finally
    //   747	754	3	java/lang/EnumConstantNotPresentException
    //   747	754	747	java/lang/StringIndexOutOfBoundsException
    //   748	754	754	finally
    //   819	826	826	finally
    //   819	826	819	java/lang/StringIndexOutOfBoundsException
    //   819	826	3	java/lang/NegativeArraySizeException
    //   819	826	819	finally
    //   820	826	826	java/lang/IndexOutOfBoundsException
    //   951	958	958	finally
    //   952	958	951	finally
    //   952	958	951	java/lang/ArithmeticException
    //   952	958	958	finally
    //   952	958	958	java/lang/ArithmeticException
    //   1095	1102	1102	finally
    //   1095	1102	1102	finally
    //   1095	1102	1095	java/lang/StringIndexOutOfBoundsException
    //   1095	1102	1095	finally
    //   1096	1102	1095	java/lang/ArrayIndexOutOfBoundsException
    //   1231	1238	1238	finally
    //   1231	1238	1238	java/lang/ArrayIndexOutOfBoundsException
    //   1231	1238	1238	finally
    //   1231	1238	1238	finally
    //   1232	1238	1231	finally
    //   1367	1374	1374	finally
    //   1368	1374	1367	finally
    //   1368	1374	3	finally
    //   1368	1374	1374	finally
    //   1368	1374	3	java/lang/ArrayIndexOutOfBoundsException
    //   1439	1446	1446	finally
    //   1439	1446	3	java/lang/StringIndexOutOfBoundsException
    //   1439	1446	1446	java/util/ConcurrentModificationException
    //   1439	1446	3	finally
    //   1440	1446	1439	java/lang/NumberFormatException
    //   1691	1698	1698	finally
    //   1691	1698	1698	java/lang/NumberFormatException
    //   1691	1698	1691	finally
    //   1691	1698	1691	finally
    //   1692	1698	1691	finally
    //   1823	1830	1830	finally
    //   1823	1830	3	finally
    //   1824	1830	1823	finally
    //   1824	1830	1823	finally
    //   1824	1830	1830	finally
    //   1959	1966	1966	finally
    //   1959	1966	1959	finally
    //   1959	1966	1959	java/lang/ArrayIndexOutOfBoundsException
    //   1959	1966	1966	java/lang/UnsupportedOperationException
    //   1960	1966	1959	java/lang/StringIndexOutOfBoundsException
    //   2031	2038	2038	finally
    //   2031	2038	2038	finally
    //   2031	2038	2038	java/util/ConcurrentModificationException
    //   2032	2038	2038	finally
    //   2032	2038	2031	java/lang/UnsupportedOperationException
    //   2105	2113	2105	finally
    //   2121	2123	3	finally
  }
  
  public static UtilTwo put(CharSequence baseUrl, Map<?, ?> params, boolean encode) {
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
  
  public UtilTwo acceptEncoding(String paramString) {
    return Perry1.0c(this, (int)354372205L ^ 0x62799757, paramString);
  }
  
  public static String getValidCharset(String paramString) {
    return Perry1.68(null, (int)-1182199555L ^ 0xFBCB46C2, paramString);
  }
  
  public static UtilTwo head(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean) {
    return Perry1.5G(null, (int)-2134668394L ^ 0xD7F48F5A, paramCharSequence, paramMap, paramBoolean);
  }
  
  public String contentType() {
    return Perry1.8(this, (int)1014901338L ^ 0x5E47050B);
  }
  
  public UtilTwo disconnect() {
    return Perry1.0T(this, (int)-1332025849L ^ 0x92FED1AC);
  }
  
  public static void maxConnections(int paramInt) {
    Perry1.y(null, (int)68806942L ^ 0x571488FB, paramInt);
  }
  
  public UtilTwo closeOutput() {
    return Perry1.0V(this, (int)-159081230L ^ 0x99927F9A);
  }
  
  public String location() {
    return Perry1.9(this, (int)-1005823490L ^ 0xFFDFFED4);
  }
  
  public static UtilTwo delete(CharSequence paramCharSequence, Map paramMap, boolean paramBoolean) {
    return Perry1.5F(null, (int)-746317485L ^ 0x921FB712, paramCharSequence, paramMap, paramBoolean);
  }
  
  public long lastModified() {
    return Perry1.39(this, (int)-1401242513L ^ 0x939C0A4B);
  }
  
  public UtilTwo body(AtomicReference<String> output, String charset) {
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
  
  public UtilTwo(URL url, String method) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 2102534162
    //   9: l2i
    //   10: ldc_w 633593595
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1322895597
    //   20: l2i
    //   21: ldc_w 2092240617
    //   24: ixor
    //   25: ldc2_w -536093961
    //   28: l2i
    //   29: ldc_w 988286378
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 1484, -2106447436 -> 17, 393277095 -> 60
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 1040856741
    //   70: l2i
    //   71: ldc_w 1167469087
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1272649281
    //   81: l2i
    //   82: ldc_w -508615606
    //   85: ixor
    //   86: ldc2_w -201406815
    //   89: l2i
    //   90: ldc_w -142337344
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 1502, 1374753172 -> 120, 2145829083 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.c : I
    //   126: iflt -> 140
    //   129: ldc2_w 609873896
    //   132: l2i
    //   133: ldc_w 1288719981
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1665305490
    //   143: l2i
    //   144: ldc_w 823207535
    //   147: ixor
    //   148: ldc2_w 949488313
    //   151: l2i
    //   152: ldc_w 788888412
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 184, 1310687712 -> 140, 2132070496 -> 1506
    //   184: aload_0
    //   185: aconst_null
    //   186: getstatic Perryc.c : I
    //   189: iflt -> 203
    //   192: ldc2_w 1056344801
    //   195: l2i
    //   196: ldc_w -2026793778
    //   199: ixor
    //   200: goto -> 211
    //   203: ldc2_w -8748311
    //   206: l2i
    //   207: ldc_w 1372366426
    //   210: ixor
    //   211: ldc2_w -555898895
    //   214: l2i
    //   215: ldc_w -1922653379
    //   218: ixor
    //   219: ixor
    //   220: lookupswitch default -> 248, -360965405 -> 1472, 2108411778 -> 203
    //   248: putfield connection : Ljava/net/HttpURLConnection;
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 268
    //   257: ldc2_w 19431809
    //   260: l2i
    //   261: ldc_w -2012271118
    //   264: ixor
    //   265: goto -> 276
    //   268: ldc2_w 905384567
    //   271: l2i
    //   272: ldc_w 9185221
    //   275: ixor
    //   276: ldc2_w -963192618
    //   279: l2i
    //   280: ldc_w -1343339156
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 312, -530632247 -> 1510, 1136320682 -> 268
    //   312: aload_0
    //   313: ldc2_w 1314370346
    //   316: l2i
    //   317: ldc_w 1314370347
    //   320: ixor
    //   321: getstatic Perryc.c : I
    //   324: iflt -> 338
    //   327: ldc2_w -940166038
    //   330: l2i
    //   331: ldc_w -475067661
    //   334: ixor
    //   335: goto -> 346
    //   338: ldc2_w 1063532504
    //   341: l2i
    //   342: ldc_w 2118693369
    //   345: ixor
    //   346: ldc2_w 207843807
    //   349: l2i
    //   350: ldc_w -1518850791
    //   353: ixor
    //   354: ixor
    //   355: lookupswitch default -> 1494, -1925029281 -> 338, -398992665 -> 380
    //   380: putfield ignoreCloseExceptions : Z
    //   383: getstatic Perryc.0 : I
    //   386: ifle -> 400
    //   389: ldc2_w 1061937112
    //   392: l2i
    //   393: ldc_w 1896939088
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w -542403965
    //   403: l2i
    //   404: ldc_w -478460602
    //   407: ixor
    //   408: ldc2_w -1531825771
    //   411: l2i
    //   412: ldc_w 12519767
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 1474, -1730285817 -> 444, -363456182 -> 400
    //   444: aload_0
    //   445: ldc2_w -425096797
    //   448: l2i
    //   449: ldc_w -425096797
    //   452: ixor
    //   453: getstatic Perryc.1 : I
    //   456: ifeq -> 470
    //   459: ldc2_w -1472763393
    //   462: l2i
    //   463: ldc_w -1403044978
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w 379583727
    //   473: l2i
    //   474: ldc_w -1614720065
    //   477: ixor
    //   478: ldc2_w -2039175151
    //   481: l2i
    //   482: ldc_w -162250363
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 512, 570476639 -> 470, 1950923749 -> 1486
    //   512: putfield uncompress : Z
    //   515: getstatic Perryc.0 : I
    //   518: ifle -> 532
    //   521: ldc2_w 1873240496
    //   524: l2i
    //   525: ldc_w 847085850
    //   528: ixor
    //   529: goto -> 540
    //   532: ldc2_w 1559263266
    //   535: l2i
    //   536: ldc_w -562812399
    //   539: ixor
    //   540: ldc2_w 1241269178
    //   543: l2i
    //   544: ldc_w -1405914643
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, -1206529283 -> 1490, -325660789 -> 532
    //   576: aload_0
    //   577: ldc2_w -54529787
    //   580: l2i
    //   581: ldc_w -54537979
    //   584: ixor
    //   585: getstatic Perryc.0 : I
    //   588: ifle -> 602
    //   591: ldc2_w -1118779388
    //   594: l2i
    //   595: ldc_w 114906785
    //   598: ixor
    //   599: goto -> 610
    //   602: ldc2_w -1068839390
    //   605: l2i
    //   606: ldc_w 1534798896
    //   609: ixor
    //   610: ldc2_w 900996071
    //   613: l2i
    //   614: ldc_w 1833324279
    //   617: ixor
    //   618: ixor
    //   619: lookupswitch default -> 1480, -1010583806 -> 644, -478426187 -> 602
    //   644: putfield bufferSize : I
    //   647: getstatic Perryc.1 : I
    //   650: ifeq -> 664
    //   653: ldc2_w -145936054
    //   656: l2i
    //   657: ldc_w -824192568
    //   660: ixor
    //   661: goto -> 672
    //   664: ldc2_w 566145864
    //   667: l2i
    //   668: ldc_w -356785734
    //   671: ixor
    //   672: ldc2_w -2019199170
    //   675: l2i
    //   676: ldc_w -1587229291
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 1500, -305862567 -> 708, 525556265 -> 664
    //   708: aload_0
    //   709: ldc_w -110699007
    //   712: i2l
    //   713: ldc2_w 110699006
    //   716: lxor
    //   717: getstatic Perryc.0 : I
    //   720: ifle -> 734
    //   723: ldc2_w -2138539251
    //   726: l2i
    //   727: ldc_w 1076683199
    //   730: ixor
    //   731: goto -> 742
    //   734: ldc2_w 1774220888
    //   737: l2i
    //   738: ldc_w 1567469920
    //   741: ixor
    //   742: ldc2_w 1420160133
    //   745: l2i
    //   746: ldc_w 1103904670
    //   749: ixor
    //   750: ixor
    //   751: lookupswitch default -> 1488, -707966551 -> 734, 566498339 -> 776
    //   776: putfield totalSize : J
    //   779: getstatic Perryc.c : I
    //   782: iflt -> 796
    //   785: ldc2_w -1325218689
    //   788: l2i
    //   789: ldc_w 661401188
    //   792: ixor
    //   793: goto -> 804
    //   796: ldc2_w 455736357
    //   799: l2i
    //   800: ldc_w -881468888
    //   803: ixor
    //   804: ldc2_w 922952256
    //   807: l2i
    //   808: ldc_w -610342998
    //   811: ixor
    //   812: ixor
    //   813: lookupswitch default -> 1468, 1019339751 -> 840, 2062757873 -> 796
    //   840: aload_0
    //   841: ldc_w -423842247
    //   844: i2l
    //   845: ldc2_w -423842247
    //   848: lxor
    //   849: getstatic Perryc.1 : I
    //   852: ifeq -> 866
    //   855: ldc2_w -188084392
    //   858: l2i
    //   859: ldc_w -528873676
    //   862: ixor
    //   863: goto -> 874
    //   866: ldc2_w -1683907063
    //   869: l2i
    //   870: ldc_w 945068496
    //   873: ixor
    //   874: ldc2_w -628994841
    //   877: l2i
    //   878: ldc_w 1479585378
    //   881: ixor
    //   882: ixor
    //   883: lookupswitch default -> 908, -1778193687 -> 1496, -1549665372 -> 866
    //   908: putfield totalWritten : J
    //   911: getstatic Perryc.1 : I
    //   914: ifeq -> 928
    //   917: ldc2_w 1763813088
    //   920: l2i
    //   921: ldc_w -691712731
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w 353039042
    //   931: l2i
    //   932: ldc_w 1091037566
    //   935: ixor
    //   936: ldc2_w 336333762
    //   939: l2i
    //   940: ldc_w -657349360
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 1512, -1731152530 -> 972, 1933133079 -> 928
    //   972: aload_0
    //   973: getstatic Perryc.1 : I
    //   976: ifeq -> 990
    //   979: ldc2_w -496530349
    //   982: l2i
    //   983: ldc_w 332989131
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w 1908459092
    //   993: l2i
    //   994: ldc_w 2093509527
    //   997: ixor
    //   998: ldc2_w 1491922780
    //   1001: l2i
    //   1002: ldc_w -1704666333
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 1032, -1327603499 -> 990, 859224807 -> 1470
    //   1032: getstatic bigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress.DEFAULT : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress;
    //   1035: getstatic Perryc.c : I
    //   1038: iflt -> 1052
    //   1041: ldc2_w -835875168
    //   1044: l2i
    //   1045: ldc_w -2016425014
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w 1684150960
    //   1055: l2i
    //   1056: ldc_w -325866720
    //   1059: ixor
    //   1060: ldc2_w -109351831
    //   1063: l2i
    //   1064: ldc_w 1900676592
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 1096, -1043125005 -> 1478, 1114352392 -> 1052
    //   1096: putfield progress : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$UploadProgress;
    //   1099: getstatic Perryc.1 : I
    //   1102: ifeq -> 1116
    //   1105: ldc2_w 574231433
    //   1108: l2i
    //   1109: ldc_w 110919007
    //   1112: ixor
    //   1113: goto -> 1124
    //   1116: ldc2_w 1936567009
    //   1119: l2i
    //   1120: ldc_w 1866164603
    //   1123: ixor
    //   1124: ldc2_w 1485605133
    //   1127: l2i
    //   1128: ldc_w 1875105127
    //   1131: ixor
    //   1132: ixor
    //   1133: lookupswitch default -> 1498, 334049980 -> 1116, 723099632 -> 1160
    //   1160: aload_0
    //   1161: getstatic Perryc.0 : I
    //   1164: ifle -> 1178
    //   1167: ldc2_w 1937599198
    //   1170: l2i
    //   1171: ldc_w 883224259
    //   1174: ixor
    //   1175: goto -> 1186
    //   1178: ldc2_w -2145700708
    //   1181: l2i
    //   1182: ldc_w -1847281354
    //   1185: ixor
    //   1186: ldc2_w -1599449724
    //   1189: l2i
    //   1190: ldc_w -1586795791
    //   1193: ixor
    //   1194: ixor
    //   1195: lookupswitch default -> 1492, 272544479 -> 1220, 1176025960 -> 1178
    //   1220: aload_1
    //   1221: getstatic Perryc.1 : I
    //   1224: ifeq -> 1238
    //   1227: ldc2_w -2104090464
    //   1230: l2i
    //   1231: ldc_w -68350311
    //   1234: ixor
    //   1235: goto -> 1246
    //   1238: ldc2_w 924748987
    //   1241: l2i
    //   1242: ldc_w 584159992
    //   1245: ixor
    //   1246: ldc2_w -2143623253
    //   1249: l2i
    //   1250: ldc_w 1233659641
    //   1253: ixor
    //   1254: ixor
    //   1255: lookupswitch default -> 1280, -1328943253 -> 1482, -1095864895 -> 1238
    //   1280: putfield url : Ljava/net/URL;
    //   1283: getstatic Perryc.1 : I
    //   1286: ifeq -> 1300
    //   1289: ldc2_w 1919214606
    //   1292: l2i
    //   1293: ldc_w 178001003
    //   1296: ixor
    //   1297: goto -> 1308
    //   1300: ldc2_w 1953099669
    //   1303: l2i
    //   1304: ldc_w -408164800
    //   1307: ixor
    //   1308: ldc2_w 1219587911
    //   1311: l2i
    //   1312: ldc_w -614261759
    //   1315: ixor
    //   1316: ixor
    //   1317: lookupswitch default -> 1504, -349535453 -> 1300, 1079955 -> 1344
    //   1344: aload_0
    //   1345: getstatic Perryc.1 : I
    //   1348: ifeq -> 1362
    //   1351: ldc2_w -1901541886
    //   1354: l2i
    //   1355: ldc_w 1641087663
    //   1358: ixor
    //   1359: goto -> 1370
    //   1362: ldc2_w -436700662
    //   1365: l2i
    //   1366: ldc_w -2121026501
    //   1369: ixor
    //   1370: ldc2_w 433450704
    //   1373: l2i
    //   1374: ldc_w -1211122943
    //   1377: ixor
    //   1378: ixor
    //   1379: lookupswitch default -> 1404, 142033845 -> 1362, 1097044348 -> 1508
    //   1404: aload_2
    //   1405: getstatic Perryc.0 : I
    //   1408: ifle -> 1422
    //   1411: ldc2_w 868137786
    //   1414: l2i
    //   1415: ldc_w 757980565
    //   1418: ixor
    //   1419: goto -> 1430
    //   1422: ldc2_w -298314196
    //   1425: l2i
    //   1426: ldc_w 1366083913
    //   1429: ixor
    //   1430: ldc2_w -1735232646
    //   1433: l2i
    //   1434: ldc_w -1053278700
    //   1437: ixor
    //   1438: ixor
    //   1439: lookupswitch default -> 1476, -419524085 -> 1464, 1194929089 -> 1422
    //   1464: putfield requestMethod : Ljava/lang/String;
    //   1467: return
    //   1468: aconst_null
    //   1469: athrow
    //   1470: aconst_null
    //   1471: athrow
    //   1472: aconst_null
    //   1473: athrow
    //   1474: aconst_null
    //   1475: athrow
    //   1476: aconst_null
    //   1477: athrow
    //   1478: aconst_null
    //   1479: athrow
    //   1480: aconst_null
    //   1481: athrow
    //   1482: aconst_null
    //   1483: athrow
    //   1484: aconst_null
    //   1485: athrow
    //   1486: aconst_null
    //   1487: athrow
    //   1488: aconst_null
    //   1489: athrow
    //   1490: aconst_null
    //   1491: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1468	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   0	1468	1	url	Ljava/net/URL;
    //   0	1468	2	method	Ljava/lang/String;
  }
  
  public static UtilTwo post(URL url) {
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
  
  public UtilTwo connectTimeout(int paramInt) {
    return Perry1.1o(this, (int)-688208738L ^ 0xA6C3EC44, paramInt);
  }
  
  public static void proxyHost(String paramString) {
    Perry1.1b(null, (int)1850091566L ^ 0x6B112CF5, paramString);
  }
  
  public boolean noContent() {
    return Perry1.4t(this, (int)1450875633L ^ 0x3350FCBE);
  }
  
  public static UtilTwo patch(CharSequence url) {
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
  
  public UtilTwo userAgent(String paramString) {
    return Perry1.02(this, (int)-1247558739L ^ 0xAC0BD495, paramString);
  }
  
  public static List arrayToList(Object array) {
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
  
  public String body(String charset) {
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
  
  public int intHeader(String paramString) {
    return Perry1.19(this, (int)-1595998836L ^ 0xD7879EBC, paramString);
  }
  
  public UtilTwo basic(String name, String password) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1143
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 1135
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1127
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -1042247824
    //   33: l2i
    //   34: ldc_w 671106420
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 394375804
    //   44: l2i
    //   45: ldc_w 2037887958
    //   48: ixor
    //   49: ldc2_w 1947331118
    //   52: l2i
    //   53: ldc_w -2106735637
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -414212683 -> 41, 530375617 -> 1106
    //   84: aload_0
    //   85: new java/lang/StringBuilder
    //   88: dup
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w 509920514
    //   98: l2i
    //   99: ldc_w -437160891
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 680479883
    //   109: l2i
    //   110: ldc_w 19547861
    //   113: ixor
    //   114: ldc2_w -263229534
    //   117: l2i
    //   118: ldc_w 48977732
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 1090, -620678472 -> 148, 154241441 -> 106
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : ()V
    //   155: goto -> 159
    //   158: athrow
    //   159: ldc_w '庬㌒廷?끲'
    //   162: getstatic Perryc.1 : I
    //   165: ifeq -> 179
    //   168: ldc2_w 376233536
    //   171: l2i
    //   172: ldc_w -248538053
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w -93731083
    //   182: l2i
    //   183: ldc_w 1210244837
    //   186: ixor
    //   187: ldc2_w -172270437
    //   190: l2i
    //   191: ldc_w -651102454
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 224, -876025366 -> 1100, 1882392619 -> 179
    //   224: goto -> 228
    //   227: athrow
    //   228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   231: goto -> 235
    //   234: athrow
    //   235: getstatic Perryc.1 : I
    //   238: ifeq -> 252
    //   241: ldc2_w -1470847644
    //   244: l2i
    //   245: ldc_w 1029565735
    //   248: ixor
    //   249: goto -> 260
    //   252: ldc2_w 1269317804
    //   255: l2i
    //   256: ldc_w -458048982
    //   259: ixor
    //   260: ldc2_w -2033461728
    //   263: l2i
    //   264: ldc_w -1929720128
    //   267: ixor
    //   268: ixor
    //   269: lookupswitch default -> 1116, -1623699293 -> 252, -1523850650 -> 296
    //   296: goto -> 300
    //   299: athrow
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: goto -> 307
    //   306: athrow
    //   307: new java/lang/StringBuilder
    //   310: dup
    //   311: getstatic Perryc.0 : I
    //   314: ifle -> 328
    //   317: ldc2_w -1041228806
    //   320: l2i
    //   321: ldc_w -1317755975
    //   324: ixor
    //   325: goto -> 336
    //   328: ldc2_w 1458158272
    //   331: l2i
    //   332: ldc_w -574807822
    //   335: ixor
    //   336: ldc2_w 2050910375
    //   339: l2i
    //   340: ldc_w 1132771591
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 1112, -1293005934 -> 372, 1228827107 -> 328
    //   372: goto -> 376
    //   375: athrow
    //   376: invokespecial <init> : ()V
    //   379: goto -> 383
    //   382: athrow
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 400
    //   389: ldc2_w -501084360
    //   392: l2i
    //   393: ldc_w 499424265
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w -1074751172
    //   403: l2i
    //   404: ldc_w 2099802545
    //   407: ixor
    //   408: ldc2_w -1442580972
    //   411: l2i
    //   412: ldc_w -1880246451
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 444, -636956056 -> 1114, 393315759 -> 400
    //   444: aload_1
    //   445: getstatic Perryc.0 : I
    //   448: ifle -> 462
    //   451: ldc2_w 746526954
    //   454: l2i
    //   455: ldc_w -1957956442
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w 1423319030
    //   465: l2i
    //   466: ldc_w 458464167
    //   469: ixor
    //   470: ldc2_w -431769736
    //   473: l2i
    //   474: ldc_w 1231157910
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 1098, -525874753 -> 504, 135700898 -> 462
    //   504: goto -> 508
    //   507: athrow
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: goto -> 515
    //   514: athrow
    //   515: ldc2_w -2040313911
    //   518: l2i
    //   519: ldc_w -2040313869
    //   522: ixor
    //   523: getstatic Perryc.1 : I
    //   526: ifeq -> 540
    //   529: ldc2_w -1480961754
    //   532: l2i
    //   533: ldc_w -829328540
    //   536: ixor
    //   537: goto -> 548
    //   540: ldc2_w 1284932490
    //   543: l2i
    //   544: ldc_w -453722623
    //   547: ixor
    //   548: ldc2_w -103379613
    //   551: l2i
    //   552: ldc_w 1139954160
    //   555: ixor
    //   556: ixor
    //   557: lookupswitch default -> 1104, -753926447 -> 540, 306635032 -> 584
    //   584: goto -> 588
    //   587: athrow
    //   588: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   591: goto -> 595
    //   594: athrow
    //   595: getstatic Perryc.0 : I
    //   598: ifle -> 612
    //   601: ldc2_w 2000039829
    //   604: l2i
    //   605: ldc_w 248045425
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w -686736876
    //   615: l2i
    //   616: ldc_w 1954623827
    //   619: ixor
    //   620: ldc2_w 668587487
    //   623: l2i
    //   624: ldc_w 985217109
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 656, 102414331 -> 612, 1688083822 -> 1102
    //   656: aload_2
    //   657: getstatic Perryc.0 : I
    //   660: ifle -> 674
    //   663: ldc2_w -300810200
    //   666: l2i
    //   667: ldc_w 1948790997
    //   670: ixor
    //   671: goto -> 682
    //   674: ldc2_w 1379590829
    //   677: l2i
    //   678: ldc_w 934143458
    //   681: ixor
    //   682: ldc2_w -1923426561
    //   685: l2i
    //   686: ldc_w 879616092
    //   689: ixor
    //   690: ixor
    //   691: lookupswitch default -> 716, 588056158 -> 1110, 685239371 -> 674
    //   716: goto -> 720
    //   719: athrow
    //   720: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: goto -> 727
    //   726: athrow
    //   727: getstatic Perryc.0 : I
    //   730: ifle -> 744
    //   733: ldc2_w 855604043
    //   736: l2i
    //   737: ldc_w 577880479
    //   740: ixor
    //   741: goto -> 752
    //   744: ldc2_w -454179854
    //   747: l2i
    //   748: ldc_w -1348561333
    //   751: ixor
    //   752: ldc2_w -1740961103
    //   755: l2i
    //   756: ldc_w -31522152
    //   759: ixor
    //   760: ixor
    //   761: lookupswitch default -> 788, -892373388 -> 744, 1990898429 -> 1088
    //   788: goto -> 792
    //   791: athrow
    //   792: invokevirtual toString : ()Ljava/lang/String;
    //   795: goto -> 799
    //   798: athrow
    //   799: getstatic Perryc.c : I
    //   802: iflt -> 816
    //   805: ldc2_w 2028065970
    //   808: l2i
    //   809: ldc_w -1432880140
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w -1716370779
    //   819: l2i
    //   820: ldc_w -481338538
    //   823: ixor
    //   824: ldc2_w 1209286705
    //   827: l2i
    //   828: ldc_w -841602716
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 860, -313486349 -> 816, 1471432211 -> 1092
    //   860: goto -> 864
    //   863: athrow
    //   864: invokestatic encode : (Ljava/lang/String;)Ljava/lang/String;
    //   867: goto -> 871
    //   870: athrow
    //   871: getstatic Perryc.c : I
    //   874: iflt -> 888
    //   877: ldc2_w -956833515
    //   880: l2i
    //   881: ldc_w -736884736
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 930936383
    //   891: l2i
    //   892: ldc_w 353292405
    //   895: ixor
    //   896: ldc2_w -390203573
    //   899: l2i
    //   900: ldc_w -1906239748
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 1096, 1152305149 -> 932, 1950288034 -> 888
    //   932: goto -> 936
    //   935: athrow
    //   936: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   939: goto -> 943
    //   942: athrow
    //   943: getstatic Perryc.0 : I
    //   946: ifle -> 960
    //   949: ldc2_w 2020984699
    //   952: l2i
    //   953: ldc_w -777138472
    //   956: ixor
    //   957: goto -> 968
    //   960: ldc2_w 1697012512
    //   963: l2i
    //   964: ldc_w -545317073
    //   967: ixor
    //   968: ldc2_w -2111004253
    //   971: l2i
    //   972: ldc_w 1036957259
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 1004, 372907595 -> 1094, 2024266067 -> 960
    //   1004: goto -> 1008
    //   1007: athrow
    //   1008: invokevirtual toString : ()Ljava/lang/String;
    //   1011: goto -> 1015
    //   1014: athrow
    //   1015: getstatic Perryc.0 : I
    //   1018: ifle -> 1032
    //   1021: ldc2_w -1930266927
    //   1024: l2i
    //   1025: ldc_w 2002358994
    //   1028: ixor
    //   1029: goto -> 1040
    //   1032: ldc2_w -32073373
    //   1035: l2i
    //   1036: ldc_w -228499756
    //   1039: ixor
    //   1040: ldc2_w 1875425197
    //   1043: l2i
    //   1044: ldc_w -820634935
    //   1047: ixor
    //   1048: ixor
    //   1049: lookupswitch default -> 1108, -1398183213 -> 1076, 1534413159 -> 1032
    //   1076: goto -> 1080
    //   1079: athrow
    //   1080: invokevirtual authorization : (Ljava/lang/String;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   1083: goto -> 1087
    //   1086: athrow
    //   1087: areturn
    //   1088: aconst_null
    //   1089: athrow
    //   1090: aconst_null
    //   1091: athrow
    //   1092: aconst_null
    //   1093: athrow
    //   1094: aconst_null
    //   1095: athrow
    //   1096: aconst_null
    //   1097: athrow
    //   1098: aconst_null
    //   1099: athrow
    //   1100: aconst_null
    //   1101: athrow
    //   1102: aconst_null
    //   1103: athrow
    //   1104: aconst_null
    //   1105: athrow
    //   1106: aconst_null
    //   1107: athrow
    //   1108: aconst_null
    //   1109: athrow
    //   1110: aconst_null
    //   1111: athrow
    //   1112: aconst_null
    //   1113: athrow
    //   1114: aconst_null
    //   1115: athrow
    //   1116: aconst_null
    //   1117: athrow
    //   1118: pop
    //   1119: goto -> 24
    //   1122: pop
    //   1123: aconst_null
    //   1124: goto -> 1118
    //   1127: dup
    //   1128: ifnull -> 1118
    //   1131: checkcast java/lang/Throwable
    //   1134: athrow
    //   1135: dup
    //   1136: ifnull -> 1122
    //   1139: checkcast java/lang/Throwable
    //   1142: athrow
    //   1143: aconst_null
    //   1144: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1064	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	1064	1	name	Ljava/lang/String;
    //   24	1064	2	password	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	1127	finally
    //   151	158	158	finally
    //   151	158	3	finally
    //   152	158	158	finally
    //   152	158	3	java/lang/NumberFormatException
    //   152	158	151	finally
    //   227	234	234	finally
    //   227	234	234	finally
    //   227	234	227	java/lang/NegativeArraySizeException
    //   227	234	234	java/lang/ArrayIndexOutOfBoundsException
    //   228	234	234	java/lang/NegativeArraySizeException
    //   300	306	306	finally
    //   300	306	3	finally
    //   300	306	3	java/util/NoSuchElementException
    //   300	306	306	java/lang/NegativeArraySizeException
    //   300	306	3	java/util/ConcurrentModificationException
    //   375	382	382	finally
    //   375	382	375	finally
    //   375	382	3	java/lang/ArrayIndexOutOfBoundsException
    //   375	382	382	java/lang/IllegalStateException
    //   375	382	3	java/lang/NullPointerException
    //   507	514	514	finally
    //   507	514	3	finally
    //   507	514	514	java/lang/EnumConstantNotPresentException
    //   507	514	514	java/lang/IllegalArgumentException
    //   508	514	507	java/lang/AssertionError
    //   588	594	594	finally
    //   588	594	3	java/util/NoSuchElementException
    //   588	594	3	java/lang/IllegalArgumentException
    //   588	594	594	java/lang/EnumConstantNotPresentException
    //   588	594	3	finally
    //   719	726	726	finally
    //   719	726	719	finally
    //   719	726	719	java/lang/NegativeArraySizeException
    //   720	726	726	java/lang/UnsupportedOperationException
    //   720	726	3	java/lang/ArrayIndexOutOfBoundsException
    //   792	798	798	finally
    //   792	798	3	finally
    //   792	798	798	java/lang/ArrayIndexOutOfBoundsException
    //   792	798	798	finally
    //   792	798	798	finally
    //   863	870	870	finally
    //   863	870	863	java/lang/EnumConstantNotPresentException
    //   863	870	870	java/lang/NullPointerException
    //   864	870	3	finally
    //   864	870	870	java/lang/EnumConstantNotPresentException
    //   935	942	942	finally
    //   935	942	3	finally
    //   935	942	942	finally
    //   936	942	3	java/lang/EnumConstantNotPresentException
    //   936	942	935	java/lang/UnsupportedOperationException
    //   1007	1014	1014	finally
    //   1007	1014	1007	finally
    //   1007	1014	1014	finally
    //   1007	1014	1014	java/lang/IllegalArgumentException
    //   1008	1014	3	finally
    //   1080	1086	1086	finally
    //   1080	1086	3	java/lang/UnsupportedOperationException
    //   1080	1086	1086	java/util/NoSuchElementException
    //   1080	1086	3	finally
    //   1080	1086	3	java/lang/ArrayIndexOutOfBoundsException
    //   1127	1135	1127	finally
    //   1143	1145	3	finally
  }
  
  public String toString() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 703
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 695
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 687
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 1105581698
    //   37: l2i
    //   38: ldc_w 1053126252
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 2109884682
    //   48: l2i
    //   49: ldc_w 771631009
    //   52: ixor
    //   53: ldc2_w 1210007363
    //   56: l2i
    //   57: ldc_w -2140780524
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 672, -1740301828 -> 88, -1218850887 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w 1005919222
    //   108: l2i
    //   109: ldc_w 924092781
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 1830647189
    //   119: l2i
    //   120: ldc_w 2005436402
    //   123: ixor
    //   124: ldc2_w -90674765
    //   127: l2i
    //   128: ldc_w -1849583373
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 660, 1740137435 -> 116, 1909195559 -> 160
    //   160: aload_0
    //   161: getstatic Perryc.0 : I
    //   164: ifle -> 178
    //   167: ldc2_w 1389712920
    //   170: l2i
    //   171: ldc_w -523608646
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w -1249034287
    //   181: l2i
    //   182: ldc_w -1514428963
    //   185: ixor
    //   186: ldc2_w -1025828483
    //   189: l2i
    //   190: ldc_w 302133575
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 220, -1839483524 -> 178, 1657152408 -> 662
    //   220: goto -> 224
    //   223: athrow
    //   224: invokevirtual method : ()Ljava/lang/String;
    //   227: goto -> 231
    //   230: athrow
    //   231: getstatic Perryc.c : I
    //   234: iflt -> 248
    //   237: ldc2_w -950323830
    //   240: l2i
    //   241: ldc_w -1525991504
    //   244: ixor
    //   245: goto -> 256
    //   248: ldc2_w 844156570
    //   251: l2i
    //   252: ldc_w -616738161
    //   255: ixor
    //   256: ldc2_w 1329999568
    //   259: l2i
    //   260: ldc_w 1931098801
    //   263: ixor
    //   264: ixor
    //   265: lookupswitch default -> 292, 1577850459 -> 674, 2055050868 -> 248
    //   292: goto -> 296
    //   295: athrow
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: goto -> 303
    //   302: athrow
    //   303: ldc2_w 488732394
    //   306: l2i
    //   307: ldc_w 488732362
    //   310: ixor
    //   311: getstatic Perryc.1 : I
    //   314: ifeq -> 328
    //   317: ldc2_w -1388358326
    //   320: l2i
    //   321: ldc_w 1679487568
    //   324: ixor
    //   325: goto -> 336
    //   328: ldc2_w 1778407512
    //   331: l2i
    //   332: ldc_w 831275229
    //   335: ixor
    //   336: ldc2_w 989298704
    //   339: l2i
    //   340: ldc_w -734048789
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 372, -681596777 -> 328, 669870817 -> 664
    //   372: goto -> 376
    //   375: athrow
    //   376: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   379: goto -> 383
    //   382: athrow
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 400
    //   389: ldc2_w 134056549
    //   392: l2i
    //   393: ldc_w -1596937405
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w -91963005
    //   403: l2i
    //   404: ldc_w -1697035324
    //   407: ixor
    //   408: ldc2_w -618345768
    //   411: l2i
    //   412: ldc_w -1981606319
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 444, -169149009 -> 666, 760324892 -> 400
    //   444: aload_0
    //   445: getstatic Perryc.1 : I
    //   448: ifeq -> 462
    //   451: ldc2_w 874328410
    //   454: l2i
    //   455: ldc_w 1924231016
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w 468002594
    //   465: l2i
    //   466: ldc_w 1603290022
    //   469: ixor
    //   470: ldc2_w -838476773
    //   473: l2i
    //   474: ldc_w 74178665
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 504, -2069714253 -> 462, -1933417920 -> 668
    //   504: goto -> 508
    //   507: athrow
    //   508: invokevirtual url : ()Ljava/net/URL;
    //   511: goto -> 515
    //   514: athrow
    //   515: getstatic Perryc.1 : I
    //   518: ifeq -> 532
    //   521: ldc2_w -1430974702
    //   524: l2i
    //   525: ldc_w -1379001996
    //   528: ixor
    //   529: goto -> 540
    //   532: ldc2_w -65243523
    //   535: l2i
    //   536: ldc_w -262853794
    //   539: ixor
    //   540: ldc2_w 1716848095
    //   543: l2i
    //   544: ldc_w -1612163489
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, -20560410 -> 670, 405138840 -> 532
    //   576: goto -> 580
    //   579: athrow
    //   580: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   583: goto -> 587
    //   586: athrow
    //   587: getstatic Perryc.1 : I
    //   590: ifeq -> 604
    //   593: ldc2_w 2088249532
    //   596: l2i
    //   597: ldc_w 1985404022
    //   600: ixor
    //   601: goto -> 612
    //   604: ldc2_w -1699085256
    //   607: l2i
    //   608: ldc_w 1574753224
    //   611: ixor
    //   612: ldc2_w -2114491849
    //   615: l2i
    //   616: ldc_w 1646046076
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 676, -372951679 -> 604, 613226171 -> 648
    //   648: goto -> 652
    //   651: athrow
    //   652: invokevirtual toString : ()Ljava/lang/String;
    //   655: goto -> 659
    //   658: athrow
    //   659: areturn
    //   660: aconst_null
    //   661: athrow
    //   662: aconst_null
    //   663: athrow
    //   664: aconst_null
    //   665: athrow
    //   666: aconst_null
    //   667: athrow
    //   668: aconst_null
    //   669: athrow
    //   670: aconst_null
    //   671: athrow
    //   672: aconst_null
    //   673: athrow
    //   674: aconst_null
    //   675: athrow
    //   676: aconst_null
    //   677: athrow
    //   678: pop
    //   679: goto -> 24
    //   682: pop
    //   683: aconst_null
    //   684: goto -> 678
    //   687: dup
    //   688: ifnull -> 678
    //   691: checkcast java/lang/Throwable
    //   694: athrow
    //   695: dup
    //   696: ifnull -> 682
    //   699: checkcast java/lang/Throwable
    //   702: athrow
    //   703: aconst_null
    //   704: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	636	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	687	java/lang/IllegalStateException
    //   91	98	98	finally
    //   91	98	98	java/lang/NullPointerException
    //   91	98	98	java/lang/UnsupportedOperationException
    //   91	98	98	java/lang/StringIndexOutOfBoundsException
    //   91	98	91	java/lang/IndexOutOfBoundsException
    //   223	230	230	finally
    //   223	230	3	finally
    //   223	230	3	java/lang/IllegalArgumentException
    //   224	230	3	java/lang/NumberFormatException
    //   224	230	223	java/lang/ArithmeticException
    //   295	302	302	finally
    //   295	302	295	finally
    //   295	302	302	java/lang/StringIndexOutOfBoundsException
    //   296	302	295	finally
    //   296	302	3	finally
    //   376	382	382	finally
    //   376	382	382	finally
    //   376	382	382	finally
    //   376	382	382	finally
    //   376	382	3	finally
    //   507	514	514	finally
    //   507	514	507	java/lang/IndexOutOfBoundsException
    //   508	514	514	java/lang/IndexOutOfBoundsException
    //   508	514	514	finally
    //   508	514	514	java/lang/StringIndexOutOfBoundsException
    //   580	586	586	finally
    //   580	586	3	finally
    //   580	586	3	java/lang/EnumConstantNotPresentException
    //   580	586	586	finally
    //   580	586	3	finally
    //   651	658	658	finally
    //   651	658	651	finally
    //   652	658	3	java/util/NoSuchElementException
    //   652	658	658	java/lang/IndexOutOfBoundsException
    //   652	658	651	finally
    //   687	695	687	java/lang/EnumConstantNotPresentException
    //   703	705	3	finally
  }
  
  public UtilTwo part(String name, String filename, String contentType, InputStream part) {
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
  
  public UtilTwo useProxy(String proxyHost, int proxyPort) {
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
  
  public static UtilTwo head(CharSequence baseUrl, boolean encode, Object... params) {
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
  
  public boolean badRequest() {
    return Perry1.4B(this, (int)1271691908L ^ 0x31A8454C);
  }
  
  public static UtilTwo head(URL url) {
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
  
  public UtilTwo form(Object name, Object value) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 387
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 379
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 371
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -336729768
    //   33: l2i
    //   34: ldc_w -171593843
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1926325551
    //   44: l2i
    //   45: ldc_w 714091886
    //   48: ixor
    //   49: ldc2_w -138184238
    //   52: l2i
    //   53: ldc_w -466904242
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 356, -1269410525 -> 84, 230728777 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -177169890
    //   94: l2i
    //   95: ldc_w -1458748602
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -323181836
    //   105: l2i
    //   106: ldc_w 2122192088
    //   109: ixor
    //   110: ldc2_w -1911763815
    //   113: l2i
    //   114: ldc_w 1347148515
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -2110075102 -> 352, 557321423 -> 102
    //   144: aload_1
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w -1975583493
    //   154: l2i
    //   155: ldc_w 220366077
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w -1423870324
    //   165: l2i
    //   166: ldc_w 538248573
    //   169: ixor
    //   170: ldc2_w 1178693551
    //   173: l2i
    //   174: ldc_w 2038508566
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 358, -1259065272 -> 204, -1193526337 -> 162
    //   204: aload_2
    //   205: ldc_w '庻㌧廂㍌'
    //   208: getstatic Perryc.0 : I
    //   211: ifle -> 225
    //   214: ldc2_w 997473001
    //   217: l2i
    //   218: ldc_w -1397101072
    //   221: ixor
    //   222: goto -> 233
    //   225: ldc2_w 473144065
    //   228: l2i
    //   229: ldc_w 951566008
    //   232: ixor
    //   233: ldc2_w -1107073940
    //   236: l2i
    //   237: ldc_w -419234223
    //   240: ixor
    //   241: ixor
    //   242: lookupswitch default -> 268, -825471708 -> 360, 1360394859 -> 225
    //   268: goto -> 272
    //   271: athrow
    //   272: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   275: goto -> 279
    //   278: athrow
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w -318224210
    //   288: l2i
    //   289: ldc_w 380018982
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 1208456714
    //   299: l2i
    //   300: ldc_w -779349580
    //   303: ixor
    //   304: ldc2_w -1474474756
    //   307: l2i
    //   308: ldc_w 2094637553
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -2116061366 -> 296, 795477125 -> 354
    //   340: goto -> 344
    //   343: athrow
    //   344: invokevirtual form : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   347: goto -> 351
    //   350: athrow
    //   351: areturn
    //   352: aconst_null
    //   353: athrow
    //   354: aconst_null
    //   355: athrow
    //   356: aconst_null
    //   357: athrow
    //   358: aconst_null
    //   359: athrow
    //   360: aconst_null
    //   361: athrow
    //   362: pop
    //   363: goto -> 24
    //   366: pop
    //   367: aconst_null
    //   368: goto -> 362
    //   371: dup
    //   372: ifnull -> 362
    //   375: checkcast java/lang/Throwable
    //   378: athrow
    //   379: dup
    //   380: ifnull -> 366
    //   383: checkcast java/lang/Throwable
    //   386: athrow
    //   387: aconst_null
    //   388: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	328	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	328	1	name	Ljava/lang/Object;
    //   24	328	2	value	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   8	20	371	java/lang/ArithmeticException
    //   271	278	278	finally
    //   271	278	3	finally
    //   271	278	278	java/lang/IndexOutOfBoundsException
    //   272	278	271	java/lang/ArithmeticException
    //   272	278	3	finally
    //   343	350	350	finally
    //   343	350	343	finally
    //   344	350	350	finally
    //   344	350	350	finally
    //   344	350	3	java/lang/ArithmeticException
    //   371	379	371	finally
    //   387	389	3	java/lang/UnsupportedOperationException
  }
  
  public UtilTwo referer(String paramString) {
    return Perry1.00(this, (int)-27691540L ^ 0xB94F6CEB, paramString);
  }
  
  public long date() {
    return Perry1.38(this, (int)-741328344L ^ 0xC5861985);
  }
  
  public static UtilTwo put(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs) {
    return Perry1.X(null, (int)954330351L ^ 0x7AB8FBFA, paramCharSequence, paramBoolean, paramVarArgs);
  }
  
  public UtilTwo headers(Map paramMap) {
    return Perry1.r(this, (int)1501711865L ^ 0x710EC4DD, paramMap);
  }
  
  public UtilTwo trustAllCerts() {
    return Perry1.0V(this, (int)436031375L ^ 0x76EBACE0);
  }
  
  public static UtilTwo delete(CharSequence paramCharSequence, boolean paramBoolean, Object... paramVarArgs) {
    return Perry1.X(null, (int)-838753792L ^ 0x8C58B516, paramCharSequence, paramBoolean, paramVarArgs);
  }
  
  public static String encode(CharSequence url) {
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
  
  public static UtilTwo get(URL url) {
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
  
  public BufferedInputStream buffer() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 391
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 383
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 375
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/io/BufferedInputStream
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 26713178
    //   37: l2i
    //   38: ldc_w -1810527006
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 100727697
    //   48: l2i
    //   49: ldc_w -337000168
    //   52: ixor
    //   53: ldc2_w -1674729844
    //   56: l2i
    //   57: ldc_w 1822466554
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 362, 493106687 -> 88, 1695487950 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.1 : I
    //   92: ifeq -> 106
    //   95: ldc2_w 72139171
    //   98: l2i
    //   99: ldc_w 874126707
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -1386001462
    //   109: l2i
    //   110: ldc_w -1167527624
    //   113: ixor
    //   114: ldc2_w -1651531356
    //   117: l2i
    //   118: ldc_w 537304336
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -2101217423 -> 106, -1914707868 -> 356
    //   148: goto -> 152
    //   151: athrow
    //   152: invokevirtual stream : ()Ljava/io/InputStream;
    //   155: goto -> 159
    //   158: athrow
    //   159: getstatic Perryc.c : I
    //   162: iflt -> 176
    //   165: ldc2_w -524992660
    //   168: l2i
    //   169: ldc_w -1633120752
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w 221982672
    //   179: l2i
    //   180: ldc_w 311667926
    //   183: ixor
    //   184: ldc2_w -531230887
    //   187: l2i
    //   188: ldc_w -822652098
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 220, 1093378167 -> 176, 1354558747 -> 358
    //   220: aload_0
    //   221: getstatic Perryc.1 : I
    //   224: ifeq -> 238
    //   227: ldc2_w 307954132
    //   230: l2i
    //   231: ldc_w 799911103
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w 1256136257
    //   241: l2i
    //   242: ldc_w 2126184275
    //   245: ixor
    //   246: ldc2_w -981425716
    //   249: l2i
    //   250: ldc_w -1729064435
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 280, 1145024668 -> 238, 1619435178 -> 360
    //   280: getfield bufferSize : I
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -1428143508
    //   292: l2i
    //   293: ldc_w 969142247
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1380553816
    //   303: l2i
    //   304: ldc_w 1792006660
    //   307: ixor
    //   308: ldc2_w 416890045
    //   311: l2i
    //   312: ldc_w -1757127682
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 364, 482265800 -> 300, 1222956783 -> 344
    //   344: goto -> 348
    //   347: athrow
    //   348: invokespecial <init> : (Ljava/io/InputStream;I)V
    //   351: goto -> 355
    //   354: athrow
    //   355: areturn
    //   356: aconst_null
    //   357: athrow
    //   358: aconst_null
    //   359: athrow
    //   360: aconst_null
    //   361: athrow
    //   362: aconst_null
    //   363: athrow
    //   364: aconst_null
    //   365: athrow
    //   366: pop
    //   367: goto -> 24
    //   370: pop
    //   371: aconst_null
    //   372: goto -> 366
    //   375: dup
    //   376: ifnull -> 366
    //   379: checkcast java/lang/Throwable
    //   382: athrow
    //   383: dup
    //   384: ifnull -> 370
    //   387: checkcast java/lang/Throwable
    //   390: athrow
    //   391: aconst_null
    //   392: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	332	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	375	finally
    //   151	158	158	finally
    //   151	158	158	java/lang/NegativeArraySizeException
    //   151	158	158	finally
    //   151	158	158	finally
    //   152	158	151	finally
    //   348	354	354	finally
    //   348	354	3	finally
    //   348	354	354	finally
    //   348	354	3	java/lang/ArrayIndexOutOfBoundsException
    //   348	354	354	java/lang/NegativeArraySizeException
    //   375	383	375	java/util/NoSuchElementException
    //   391	393	3	finally
  }
  
  public static void proxyPort(int paramInt) {
    Perry1.E(null, (int)-810513371L ^ 0xDE44D2B5, paramInt);
  }
  
  public static StringBuilder addParam(Object key, Object value, StringBuilder result) {
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
  
  public URL url() {
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
  
  public UtilTwo useCaches(boolean paramBoolean) {
    return Perry1.0(this, (int)-221526705L ^ 0xFD4CF00C, paramBoolean);
  }
  
  public int code() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 597
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 589
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 581
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 2062134420
    //   33: l2i
    //   34: ldc_w -576611560
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1322166321
    //   44: l2i
    //   45: ldc_w -775025186
    //   48: ixor
    //   49: ldc2_w 1511281464
    //   52: l2i
    //   53: ldc_w -420972152
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 464788796 -> 560, 2036700872 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.c : I
    //   88: iflt -> 102
    //   91: ldc2_w -2037849008
    //   94: l2i
    //   95: ldc_w -1765740713
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 965597419
    //   105: l2i
    //   106: ldc_w -38615467
    //   109: ixor
    //   110: ldc2_w 1220956175
    //   113: l2i
    //   114: ldc_w 1877218163
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1400636281 -> 102, 929712251 -> 556
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual closeOutput : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: pop
    //   156: getstatic Perryc.c : I
    //   159: iflt -> 173
    //   162: ldc2_w -2119440044
    //   165: l2i
    //   166: ldc_w -158170349
    //   169: ixor
    //   170: goto -> 181
    //   173: ldc2_w 857170315
    //   176: l2i
    //   177: ldc_w -1228829351
    //   180: ixor
    //   181: ldc2_w 578777518
    //   184: l2i
    //   185: ldc_w 686828972
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 568, -1889947440 -> 216, 2109093445 -> 173
    //   216: aload_0
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w 1284127632
    //   226: l2i
    //   227: ldc_w 1085000310
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 1316137708
    //   237: l2i
    //   238: ldc_w 1985721058
    //   241: ixor
    //   242: ldc2_w 2088742952
    //   245: l2i
    //   246: ldc_w 178713679
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, 408907112 -> 234, 2063119745 -> 564
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual getConnection : ()Ljava/net/HttpURLConnection;
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.0 : I
    //   290: ifle -> 304
    //   293: ldc2_w 526812771
    //   296: l2i
    //   297: ldc_w -612034506
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w -840601928
    //   307: l2i
    //   308: ldc_w 1192265285
    //   311: ixor
    //   312: ldc2_w 1144867370
    //   315: l2i
    //   316: ldc_w 1683763380
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 566, -1433103773 -> 348, -461183797 -> 304
    //   348: goto -> 352
    //   351: athrow
    //   352: invokevirtual getResponseCode : ()I
    //   355: goto -> 359
    //   358: athrow
    //   359: ireturn
    //   360: getstatic Perryc.1 : I
    //   363: ifeq -> 377
    //   366: ldc2_w 201407381
    //   369: l2i
    //   370: ldc_w 762981079
    //   373: ixor
    //   374: goto -> 385
    //   377: ldc2_w 1742237645
    //   380: l2i
    //   381: ldc_w -1153516204
    //   384: ixor
    //   385: ldc2_w 1703252411
    //   388: l2i
    //   389: ldc_w -1780966790
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 420, -786031997 -> 562, 738690801 -> 377
    //   420: astore_1
    //   421: new bigname/zprestige/webhack/manager/Identity/UtilTwo$HttpRequestException
    //   424: dup
    //   425: getstatic Perryc.1 : I
    //   428: ifeq -> 442
    //   431: ldc2_w -1277965110
    //   434: l2i
    //   435: ldc_w -811038670
    //   438: ixor
    //   439: goto -> 450
    //   442: ldc2_w 583027228
    //   445: l2i
    //   446: ldc_w -806208709
    //   449: ixor
    //   450: ldc2_w -2123104938
    //   453: l2i
    //   454: ldc_w 2074574121
    //   457: ixor
    //   458: ixor
    //   459: lookupswitch default -> 558, -2035301241 -> 442, 401011032 -> 484
    //   484: aload_1
    //   485: getstatic Perryc.0 : I
    //   488: ifle -> 502
    //   491: ldc2_w 1178391105
    //   494: l2i
    //   495: ldc_w -1169524579
    //   498: ixor
    //   499: goto -> 510
    //   502: ldc2_w 1335826195
    //   505: l2i
    //   506: ldc_w -14555928
    //   509: ixor
    //   510: ldc2_w 332037896
    //   513: l2i
    //   514: ldc_w 950297184
    //   517: ixor
    //   518: ixor
    //   519: lookupswitch default -> 570, -1680806253 -> 544, -686245964 -> 502
    //   544: goto -> 548
    //   547: athrow
    //   548: invokespecial <init> : (Ljava/io/IOException;)V
    //   551: goto -> 555
    //   554: athrow
    //   555: athrow
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
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
    //   572: pop
    //   573: goto -> 24
    //   576: pop
    //   577: aconst_null
    //   578: goto -> 572
    //   581: dup
    //   582: ifnull -> 572
    //   585: checkcast java/lang/Throwable
    //   588: athrow
    //   589: dup
    //   590: ifnull -> 576
    //   593: checkcast java/lang/Throwable
    //   596: athrow
    //   597: aconst_null
    //   598: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   421	135	1	e	Ljava/io/IOException;
    //   24	532	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    // Exception table:
    //   from	to	target	type
    //   8	20	581	finally
    //   24	359	360	java/io/IOException
    //   147	154	154	finally
    //   147	154	147	java/lang/IllegalArgumentException
    //   147	154	3	finally
    //   148	154	154	java/lang/NumberFormatException
    //   148	154	147	finally
    //   279	286	286	finally
    //   279	286	279	java/lang/ArithmeticException
    //   279	286	279	java/lang/IllegalStateException
    //   280	286	286	java/util/ConcurrentModificationException
    //   280	286	286	java/lang/IllegalStateException
    //   351	358	358	finally
    //   351	358	351	finally
    //   351	358	3	finally
    //   351	358	3	java/lang/IllegalStateException
    //   352	358	358	java/lang/IllegalStateException
    //   547	554	554	finally
    //   547	554	547	java/lang/EnumConstantNotPresentException
    //   547	554	547	java/lang/AssertionError
    //   548	554	3	finally
    //   548	554	3	finally
    //   581	589	581	finally
    //   597	599	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public UtilTwo form(Object name, Object value, String charset) {
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
  
  public boolean ok() {
    return Perry1.4n(this, (int)-2115364543L ^ 0xCD8FE038);
  }
  
  public UtilTwo part(String name, String filename, Number part) {
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
  
  public UtilTwo acceptJson() {
    return Perry1.0S(this, (int)-375975098L ^ 0xF2A7865B);
  }
  
  public UtilTwo copy(InputStream input, OutputStream output) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 580
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 572
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 564
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo$8
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1399651960
    //   37: l2i
    //   38: ldc_w 1125326999
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 470555897
    //   48: l2i
    //   49: ldc_w 1658743956
    //   52: ixor
    //   53: ldc2_w -2005537440
    //   56: l2i
    //   57: ldc_w 566414261
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 549, -681224520 -> 88, 1178011594 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.0 : I
    //   92: ifle -> 106
    //   95: ldc2_w 1557435364
    //   98: l2i
    //   99: ldc_w -670720630
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w -333888537
    //   109: l2i
    //   110: ldc_w 2052363103
    //   113: ixor
    //   114: ldc2_w -1270287353
    //   117: l2i
    //   118: ldc_w -1099872561
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -1897349978 -> 547, 1511323785 -> 106
    //   148: aload_1
    //   149: getstatic Perryc.c : I
    //   152: iflt -> 166
    //   155: ldc2_w 276389756
    //   158: l2i
    //   159: ldc_w -42402236
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -479932349
    //   169: l2i
    //   170: ldc_w 1947589363
    //   173: ixor
    //   174: ldc2_w 656346254
    //   177: l2i
    //   178: ldc_w 1893981989
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 208, -1157795181 -> 539, 1254126766 -> 166
    //   208: aload_0
    //   209: getstatic Perryc.0 : I
    //   212: ifle -> 226
    //   215: ldc2_w 1135803510
    //   218: l2i
    //   219: ldc_w -1197614456
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w 2114590093
    //   229: l2i
    //   230: ldc_w -1438538079
    //   233: ixor
    //   234: ldc2_w 458940354
    //   237: l2i
    //   238: ldc_w -1846260763
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 543, 1592076043 -> 268, 1904325337 -> 226
    //   268: getfield ignoreCloseExceptions : Z
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w -1127755784
    //   280: l2i
    //   281: ldc_w -1079506392
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -92217383
    //   291: l2i
    //   292: ldc_w -479096730
    //   295: ixor
    //   296: ldc2_w 1436342871
    //   299: l2i
    //   300: ldc_w -1787977596
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 551, -1013006589 -> 288, -654297748 -> 332
    //   332: aload_1
    //   333: getstatic Perryc.1 : I
    //   336: ifeq -> 350
    //   339: ldc2_w -311489442
    //   342: l2i
    //   343: ldc_w 908675336
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w 1618822634
    //   353: l2i
    //   354: ldc_w -1248161667
    //   357: ixor
    //   358: ldc2_w -1107047938
    //   361: l2i
    //   362: ldc_w -1973759186
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 392, -1991691062 -> 350, -283156602 -> 541
    //   392: aload_2
    //   393: getstatic Perryc.1 : I
    //   396: ifeq -> 410
    //   399: ldc2_w 1683541100
    //   402: l2i
    //   403: ldc_w 1483295681
    //   406: ixor
    //   407: goto -> 418
    //   410: ldc2_w 1535536848
    //   413: l2i
    //   414: ldc_w -1385457659
    //   417: ixor
    //   418: ldc2_w 1185795478
    //   421: l2i
    //   422: ldc_w 962326476
    //   425: ixor
    //   426: ixor
    //   427: lookupswitch default -> 452, 371561782 -> 410, 1137157623 -> 545
    //   452: goto -> 456
    //   455: athrow
    //   456: invokespecial <init> : (Lbigname/zprestige/webhack/manager/Identity/UtilTwo;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    //   459: goto -> 463
    //   462: athrow
    //   463: getstatic Perryc.1 : I
    //   466: ifeq -> 480
    //   469: ldc2_w 1049730525
    //   472: l2i
    //   473: ldc_w 1127769428
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -554015803
    //   483: l2i
    //   484: ldc_w 2011423946
    //   487: ixor
    //   488: ldc2_w 213550141
    //   491: l2i
    //   492: ldc_w -1239951738
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -955995598 -> 553, -492747006 -> 480
    //   524: goto -> 528
    //   527: athrow
    //   528: invokevirtual call : ()Ljava/lang/Object;
    //   531: goto -> 535
    //   534: athrow
    //   535: checkcast bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   538: areturn
    //   539: aconst_null
    //   540: athrow
    //   541: aconst_null
    //   542: athrow
    //   543: aconst_null
    //   544: athrow
    //   545: aconst_null
    //   546: athrow
    //   547: aconst_null
    //   548: athrow
    //   549: aconst_null
    //   550: athrow
    //   551: aconst_null
    //   552: athrow
    //   553: aconst_null
    //   554: athrow
    //   555: pop
    //   556: goto -> 24
    //   559: pop
    //   560: aconst_null
    //   561: goto -> 555
    //   564: dup
    //   565: ifnull -> 555
    //   568: checkcast java/lang/Throwable
    //   571: athrow
    //   572: dup
    //   573: ifnull -> 559
    //   576: checkcast java/lang/Throwable
    //   579: athrow
    //   580: aconst_null
    //   581: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	515	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	515	1	input	Ljava/io/InputStream;
    //   24	515	2	output	Ljava/io/OutputStream;
    // Exception table:
    //   from	to	target	type
    //   8	20	564	java/lang/IllegalArgumentException
    //   456	462	462	finally
    //   456	462	3	finally
    //   456	462	462	java/lang/IllegalArgumentException
    //   456	462	3	finally
    //   456	462	3	java/lang/NullPointerException
    //   527	534	534	finally
    //   527	534	534	java/lang/NumberFormatException
    //   527	534	3	finally
    //   528	534	527	finally
    //   528	534	527	finally
    //   564	572	564	java/lang/IllegalStateException
    //   580	582	3	finally
  }
  
  public UtilTwo send(byte[] input) {
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
  
  public BufferedReader bufferedReader(String charset) {
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
  
  public UtilTwo progress(UtilTwo$UploadProgress callback) {
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
  
  public UtilTwo partHeader(String paramString1, String paramString2) {
    return Perry1.R(this, (int)-1942792613L ^ 0x8326EF5F, paramString1, paramString2);
  }
  
  public UtilTwo part(String paramString1, String paramString2) {
    return Perry1.S(this, (int)282739420L ^ 0x3A45DE96, paramString1, paramString2);
  }
  
  public UtilTwo header(Map.Entry paramEntry) {
    return Perry1.0k(this, (int)-880115135L ^ 0xC79780BE, paramEntry);
  }
  
  public boolean isBodyEmpty() {
    return Perry1.4v(this, (int)1939139887L ^ 0x4E77189F);
  }
  
  public static HostnameVerifier getTrustedVerifier() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 586283268
    //   33: l2i
    //   34: ldc_w -1543509642
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -378955959
    //   44: l2i
    //   45: ldc_w 205010212
    //   48: ixor
    //   49: ldc2_w -200520838
    //   52: l2i
    //   53: ldc_w 1413342018
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -445531922 -> 41, 557824074 -> 346
    //   84: getstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.TRUSTED_VERIFIER : Ljavax/net/ssl/HostnameVerifier;
    //   87: ifnonnull -> 101
    //   90: ldc2_w 1956086691
    //   93: l2i
    //   94: ldc_w -573157564
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -1404450163
    //   104: l2i
    //   105: ldc_w 84412011
    //   108: ixor
    //   109: ldc2_w 765471498
    //   112: l2i
    //   113: ldc_w 679346253
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, -1398806624 -> 140, -1398806623 -> 279
    //   140: new bigname/zprestige/webhack/manager/Identity/UtilTwo$2
    //   143: dup
    //   144: getstatic Perryc.0 : I
    //   147: ifle -> 161
    //   150: ldc2_w -1084053528
    //   153: l2i
    //   154: ldc_w 1007946175
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 1858391723
    //   164: l2i
    //   165: ldc_w 1442279992
    //   168: ixor
    //   169: ldc2_w 2007952793
    //   172: l2i
    //   173: ldc_w 493287907
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 348, -373376467 -> 161, 1375447273 -> 204
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w -1662798685
    //   224: l2i
    //   225: ldc_w 1393438812
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -2077943998
    //   235: l2i
    //   236: ldc_w 1130099289
    //   239: ixor
    //   240: ldc2_w 660338192
    //   243: l2i
    //   244: ldc_w -1065699542
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 344, 543138849 -> 276, 684508613 -> 232
    //   276: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.TRUSTED_VERIFIER : Ljavax/net/ssl/HostnameVerifier;
    //   279: getstatic Perryc.c : I
    //   282: iflt -> 296
    //   285: ldc2_w -970410192
    //   288: l2i
    //   289: ldc_w 597797773
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -2038316041
    //   299: l2i
    //   300: ldc_w -683262615
    //   303: ixor
    //   304: ldc2_w 1529153442
    //   307: l2i
    //   308: ldc_w -830418182
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -705793671 -> 296, 1881983461 -> 350
    //   340: getstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.TRUSTED_VERIFIER : Ljavax/net/ssl/HostnameVerifier;
    //   343: areturn
    //   344: aconst_null
    //   345: athrow
    //   346: aconst_null
    //   347: athrow
    //   348: aconst_null
    //   349: athrow
    //   350: aconst_null
    //   351: athrow
    //   352: pop
    //   353: goto -> 24
    //   356: pop
    //   357: aconst_null
    //   358: goto -> 352
    //   361: dup
    //   362: ifnull -> 352
    //   365: checkcast java/lang/Throwable
    //   368: athrow
    //   369: dup
    //   370: ifnull -> 356
    //   373: checkcast java/lang/Throwable
    //   376: athrow
    //   377: aconst_null
    //   378: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	361	java/lang/AssertionError
    //   207	214	214	finally
    //   207	214	3	finally
    //   208	214	3	finally
    //   208	214	214	finally
    //   208	214	207	java/lang/IndexOutOfBoundsException
    //   361	369	361	java/lang/AssertionError
    //   377	379	3	java/util/NoSuchElementException
  }
  
  public static void keepAlive(boolean paramBoolean) {
    Perry1.66(null, (int)1981637634L ^ 0x6093E1E7, paramBoolean);
  }
  
  public String contentEncoding() {
    return Perry1.4(this, (int)1618888796L ^ 0x14AB34B6);
  }
  
  public static UtilTwo post(CharSequence url) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -1199958526
    //   37: l2i
    //   38: ldc_w -827325237
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -2109892327
    //   48: l2i
    //   49: ldc_w 832832561
    //   52: ixor
    //   53: ldc2_w -103090051
    //   56: l2i
    //   57: ldc_w -114781191
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, 744526558 -> 45, 1983412557 -> 238
    //   88: aload_0
    //   89: ldc_w '庾㌼廗ꝑ'
    //   92: getstatic Perryc.c : I
    //   95: iflt -> 109
    //   98: ldc2_w -2035529663
    //   101: l2i
    //   102: ldc_w -1151914013
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w -1527734157
    //   112: l2i
    //   113: ldc_w -1261506273
    //   116: ixor
    //   117: ldc2_w 2036280164
    //   120: l2i
    //   121: ldc_w 348224297
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 152, -1039600968 -> 109, 1348810735 -> 240
    //   152: goto -> 156
    //   155: athrow
    //   156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.c : I
    //   166: iflt -> 180
    //   169: ldc2_w 2094224308
    //   172: l2i
    //   173: ldc_w 1341829443
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w 1971993164
    //   183: l2i
    //   184: ldc_w 1858797818
    //   187: ixor
    //   188: ldc2_w -734063889
    //   191: l2i
    //   192: ldc_w -32655973
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 236, 421217667 -> 180, 829660610 -> 224
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/lang/CharSequence;Ljava/lang/String;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: areturn
    //   236: aconst_null
    //   237: athrow
    //   238: aconst_null
    //   239: athrow
    //   240: aconst_null
    //   241: athrow
    //   242: pop
    //   243: goto -> 24
    //   246: pop
    //   247: aconst_null
    //   248: goto -> 242
    //   251: dup
    //   252: ifnull -> 242
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: dup
    //   260: ifnull -> 246
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: aconst_null
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	212	0	url	Ljava/lang/CharSequence;
    // Exception table:
    //   from	to	target	type
    //   8	20	251	finally
    //   156	162	162	finally
    //   156	162	3	finally
    //   156	162	162	java/lang/UnsupportedOperationException
    //   156	162	162	java/lang/UnsupportedOperationException
    //   156	162	3	finally
    //   227	234	234	finally
    //   227	234	3	java/lang/StringIndexOutOfBoundsException
    //   227	234	227	java/lang/EnumConstantNotPresentException
    //   228	234	234	java/util/ConcurrentModificationException
    //   228	234	234	java/lang/IllegalArgumentException
    //   251	259	251	finally
    //   267	269	3	finally
  }
  
  public UtilTwo ignoreCloseExceptions(boolean paramBoolean) {
    return Perry1.0(this, (int)957465498L ^ 0x3696F6DE, paramBoolean);
  }
  
  public UtilTwo ifModifiedSince(long paramLong) {
    return Perry1.0I(this, (int)-1054814602L ^ 0xAEAEBC61, paramLong);
  }
  
  public static UtilTwo get(CharSequence url) {
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
  
  public static UtilTwo put(URL url) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 35916161
    //   37: l2i
    //   38: ldc_w -2022447616
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1803318208
    //   48: l2i
    //   49: ldc_w 162293601
    //   52: ixor
    //   53: ldc2_w -1203541554
    //   56: l2i
    //   57: ldc_w 79646878
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 238, -567529999 -> 88, 967562961 -> 45
    //   88: aload_0
    //   89: ldc_w '庾㌦廐'
    //   92: getstatic Perryc.0 : I
    //   95: ifle -> 109
    //   98: ldc2_w 919871112
    //   101: l2i
    //   102: ldc_w 1851649381
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 1707237803
    //   112: l2i
    //   113: ldc_w 1877126740
    //   116: ixor
    //   117: ldc2_w 1402550647
    //   120: l2i
    //   121: ldc_w -382656010
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 152, -501093524 -> 240, 1251702602 -> 109
    //   152: goto -> 156
    //   155: athrow
    //   156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.1 : I
    //   166: ifeq -> 180
    //   169: ldc2_w -1635776109
    //   172: l2i
    //   173: ldc_w 2130245430
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w 947078847
    //   183: l2i
    //   184: ldc_w 265589487
    //   187: ixor
    //   188: ldc2_w 1827617404
    //   191: l2i
    //   192: ldc_w -1908174512
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 236, -720666756 -> 224, 47469961 -> 180
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: areturn
    //   236: aconst_null
    //   237: athrow
    //   238: aconst_null
    //   239: athrow
    //   240: aconst_null
    //   241: athrow
    //   242: pop
    //   243: goto -> 24
    //   246: pop
    //   247: aconst_null
    //   248: goto -> 242
    //   251: dup
    //   252: ifnull -> 242
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: dup
    //   260: ifnull -> 246
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: aconst_null
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	212	0	url	Ljava/net/URL;
    // Exception table:
    //   from	to	target	type
    //   8	20	251	finally
    //   155	162	162	finally
    //   155	162	155	java/lang/StringIndexOutOfBoundsException
    //   155	162	155	finally
    //   155	162	3	finally
    //   156	162	155	finally
    //   227	234	234	finally
    //   227	234	227	java/lang/ArrayIndexOutOfBoundsException
    //   227	234	3	finally
    //   227	234	3	finally
    //   228	234	234	java/lang/ClassCastException
    //   251	259	251	finally
    //   267	269	3	java/lang/IllegalArgumentException
  }
  
  public UtilTwo header(String name, Number value) {
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
  
  public static UtilTwo put(CharSequence url) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w 884042146
    //   37: l2i
    //   38: ldc_w -638610457
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1342831603
    //   48: l2i
    //   49: ldc_w -2003554948
    //   52: ixor
    //   53: ldc2_w 330321136
    //   56: l2i
    //   57: ldc_w 919391973
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 240, -937265072 -> 45, 35564388 -> 88
    //   88: aload_0
    //   89: ldc_w '庾㌦廐'
    //   92: getstatic Perryc.1 : I
    //   95: ifeq -> 109
    //   98: ldc2_w -82747085
    //   101: l2i
    //   102: ldc_w 69681694
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w -1296076372
    //   112: l2i
    //   113: ldc_w -972295760
    //   116: ixor
    //   117: ldc2_w 1005327231
    //   120: l2i
    //   121: ldc_w 1137792477
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 236, -2029296241 -> 109, 210355902 -> 152
    //   152: goto -> 156
    //   155: athrow
    //   156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.1 : I
    //   166: ifeq -> 180
    //   169: ldc2_w -65469495
    //   172: l2i
    //   173: ldc_w -760569914
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w -756918922
    //   183: l2i
    //   184: ldc_w 1310072877
    //   187: ixor
    //   188: ldc2_w 1887871577
    //   191: l2i
    //   192: ldc_w -2030893088
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 224, -1258348103 -> 180, -658097738 -> 238
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/lang/CharSequence;Ljava/lang/String;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: areturn
    //   236: aconst_null
    //   237: athrow
    //   238: aconst_null
    //   239: athrow
    //   240: aconst_null
    //   241: athrow
    //   242: pop
    //   243: goto -> 24
    //   246: pop
    //   247: aconst_null
    //   248: goto -> 242
    //   251: dup
    //   252: ifnull -> 242
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: dup
    //   260: ifnull -> 246
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: aconst_null
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	212	0	url	Ljava/lang/CharSequence;
    // Exception table:
    //   from	to	target	type
    //   8	20	251	java/lang/IndexOutOfBoundsException
    //   156	162	162	finally
    //   156	162	162	finally
    //   156	162	162	finally
    //   156	162	3	finally
    //   156	162	162	java/lang/RuntimeException
    //   227	234	234	finally
    //   227	234	227	java/lang/ArrayIndexOutOfBoundsException
    //   227	234	3	finally
    //   227	234	227	finally
    //   228	234	227	finally
    //   251	259	251	finally
    //   267	269	3	java/lang/NullPointerException
  }
  
  public UtilTwo bufferSize(int size) {
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
  
  public UtilTwo receive(PrintStream output) {
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
  
  public UtilTwo part(String name, InputStream part) {
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
  
  public UtilTwo code(AtomicInteger output) {
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
  
  public static UtilTwo trace(CharSequence url) {
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
  
  public UtilTwo proxyBasic(String name, String password) {
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
  
  public UtilTwo form(Map<?, ?> values, String charset) {
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
    // Byte code:
    //   0: ldc_w '庫㌧廥ㅫ'
    //   3: getstatic Perryc.c : I
    //   6: iflt -> 20
    //   9: ldc2_w -257126550
    //   12: l2i
    //   13: ldc_w 1653150209
    //   16: ixor
    //   17: goto -> 28
    //   20: ldc2_w 1680540806
    //   23: l2i
    //   24: ldc_w -1240317668
    //   27: ixor
    //   28: ldc2_w -691315935
    //   31: l2i
    //   32: ldc_w -721264105
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 4758, -1846762403 -> 20, -772768596 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: getstatic Perryc.c : I
    //   70: iflt -> 84
    //   73: ldc2_w -785164133
    //   76: l2i
    //   77: ldc_w 572932122
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -1594206219
    //   87: l2i
    //   88: ldc_w 1611340280
    //   91: ixor
    //   92: ldc2_w -902763675
    //   95: l2i
    //   96: ldc_w 1279311134
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -1746648924 -> 84, 1969573626 -> 4802
    //   128: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_ETAG : Ljava/lang/String;
    //   131: ldc_w '庻㌧廂ㄡ'
    //   134: getstatic Perryc.c : I
    //   137: iflt -> 151
    //   140: ldc2_w -1697538112
    //   143: l2i
    //   144: ldc_w 201063890
    //   147: ixor
    //   148: goto -> 159
    //   151: ldc2_w -333961440
    //   154: l2i
    //   155: ldc_w -2086518365
    //   158: ixor
    //   159: ldc2_w 1311432109
    //   162: l2i
    //   163: ldc_w 761394536
    //   166: ixor
    //   167: ixor
    //   168: lookupswitch default -> 4726, -228504873 -> 151, 217140806 -> 196
    //   196: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   199: getstatic Perryc.c : I
    //   202: iflt -> 216
    //   205: ldc2_w 567453628
    //   208: l2i
    //   209: ldc_w -916736487
    //   212: ixor
    //   213: goto -> 224
    //   216: ldc2_w -1658408131
    //   219: l2i
    //   220: ldc_w 1068828647
    //   223: ixor
    //   224: ldc2_w -986419588
    //   227: l2i
    //   228: ldc_w 2098350990
    //   231: ixor
    //   232: ixor
    //   233: lookupswitch default -> 4792, 448106792 -> 260, 1353659479 -> 216
    //   260: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CHARSET_UTF8 : Ljava/lang/String;
    //   263: ldc_w '庾㌲廐ㅏ'
    //   266: getstatic Perryc.1 : I
    //   269: ifeq -> 283
    //   272: ldc2_w -1037183333
    //   275: l2i
    //   276: ldc_w 54343064
    //   279: ixor
    //   280: goto -> 291
    //   283: ldc2_w -313623581
    //   286: l2i
    //   287: ldc_w 569109454
    //   290: ixor
    //   291: ldc2_w -51772000
    //   294: l2i
    //   295: ldc_w 1330401520
    //   298: ixor
    //   299: ixor
    //   300: lookupswitch default -> 4768, 1924576851 -> 283, 2130953597 -> 328
    //   328: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 348
    //   337: ldc2_w -1727756581
    //   340: l2i
    //   341: ldc_w -1137871461
    //   344: ixor
    //   345: goto -> 356
    //   348: ldc2_w 1503347965
    //   351: l2i
    //   352: ldc_w 1431007116
    //   355: ixor
    //   356: ldc2_w 879023396
    //   359: l2i
    //   360: ldc_w 1708708177
    //   363: ixor
    //   364: ixor
    //   365: lookupswitch default -> 392, -1231734780 -> 348, 1955985205 -> 4718
    //   392: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_PATCH : Ljava/lang/String;
    //   395: ldc_w '序㌃廴ㅠ뀱๸⌷花볗੨鍜綩㠡쏥'
    //   398: getstatic Perryc.0 : I
    //   401: ifle -> 415
    //   404: ldc2_w 1661622065
    //   407: l2i
    //   408: ldc_w 539547133
    //   411: ixor
    //   412: goto -> 423
    //   415: ldc2_w -761947144
    //   418: l2i
    //   419: ldc_w -73247948
    //   422: ixor
    //   423: ldc2_w 2101531941
    //   426: l2i
    //   427: ldc_w 807206233
    //   430: ixor
    //   431: ixor
    //   432: lookupswitch default -> 460, -1680656428 -> 415, 243051184 -> 4694
    //   460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   463: getstatic Perryc.c : I
    //   466: iflt -> 480
    //   469: ldc2_w -708575923
    //   472: l2i
    //   473: ldc_w -1257956540
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w 490409233
    //   483: l2i
    //   484: ldc_w 1153734367
    //   487: ixor
    //   488: ldc2_w 492510538
    //   491: l2i
    //   492: ldc_w -737370238
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -1450089279 -> 4788, 880551251 -> 480
    //   524: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CONTENT_TYPE_JSON : Ljava/lang/String;
    //   527: ldc_w '庭㌜廪ㅸ뀼๭⍮芔볝ਠ鍂網'
    //   530: getstatic Perryc.c : I
    //   533: iflt -> 547
    //   536: ldc2_w 966997243
    //   539: l2i
    //   540: ldc_w 981905143
    //   543: ixor
    //   544: goto -> 555
    //   547: ldc2_w 1365726568
    //   550: l2i
    //   551: ldc_w -1530618041
    //   554: ixor
    //   555: ldc2_w 453664176
    //   558: l2i
    //   559: ldc_w 1892463147
    //   562: ixor
    //   563: ixor
    //   564: lookupswitch default -> 592, 1759737239 -> 4736, 1838601329 -> 547
    //   592: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   595: getstatic Perryc.c : I
    //   598: iflt -> 612
    //   601: ldc2_w 1938073550
    //   604: l2i
    //   605: ldc_w 649808203
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w 412579537
    //   615: l2i
    //   616: ldc_w 126871552
    //   619: ixor
    //   620: ldc2_w 1193405691
    //   623: l2i
    //   624: ldc_w 47438519
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 656, 281925833 -> 4818, 1395774776 -> 612
    //   656: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_CONTENT_LENGTH : Ljava/lang/String;
    //   659: ldc_w '庯㌐廧ㅩ뀦'
    //   662: getstatic Perryc.c : I
    //   665: iflt -> 679
    //   668: ldc2_w -1639990391
    //   671: l2i
    //   672: ldc_w -801779592
    //   675: ixor
    //   676: goto -> 687
    //   679: ldc2_w 1417799078
    //   682: l2i
    //   683: ldc_w -397456086
    //   686: ixor
    //   687: ldc2_w -1554283038
    //   690: l2i
    //   691: ldc_w 1270177989
    //   694: ixor
    //   695: ixor
    //   696: lookupswitch default -> 4754, -1494970666 -> 679, 1411403179 -> 724
    //   724: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   727: getstatic Perryc.0 : I
    //   730: ifle -> 744
    //   733: ldc2_w -1350303317
    //   736: l2i
    //   737: ldc_w 32807913
    //   740: ixor
    //   741: goto -> 752
    //   744: ldc2_w -715894511
    //   747: l2i
    //   748: ldc_w 66413697
    //   751: ixor
    //   752: ldc2_w -155171719
    //   755: l2i
    //   756: ldc_w -735586144
    //   759: ixor
    //   760: ixor
    //   761: lookupswitch default -> 4776, -1936259429 -> 744, -196695735 -> 788
    //   788: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_ACCEPT : Ljava/lang/String;
    //   791: ldc_w '座㌕庩ㅂ뀼๼⍮芕볙ਤ鍞'
    //   794: getstatic Perryc.1 : I
    //   797: ifeq -> 811
    //   800: ldc2_w -914155542
    //   803: l2i
    //   804: ldc_w 203993293
    //   807: ixor
    //   808: goto -> 819
    //   811: ldc2_w 1884530092
    //   814: l2i
    //   815: ldc_w 1070474634
    //   818: ixor
    //   819: ldc2_w 1918745029
    //   822: l2i
    //   823: ldc_w -157349868
    //   826: ixor
    //   827: ixor
    //   828: lookupswitch default -> 856, -1552522401 -> 811, 1097406198 -> 4770
    //   856: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   859: getstatic Perryc.c : I
    //   862: iflt -> 876
    //   865: ldc2_w -1700998368
    //   868: l2i
    //   869: ldc_w -1375583024
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w 813502339
    //   879: l2i
    //   880: ldc_w 1320305937
    //   883: ixor
    //   884: ldc2_w -1620104553
    //   887: l2i
    //   888: ldc_w -323310305
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 4714, 219860250 -> 920, 1196101752 -> 876
    //   920: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_IF_NONE_MATCH : Ljava/lang/String;
    //   923: ldc_w '庢㌒廷ㅸ뀟๶⌧花볞ਢ鍒'
    //   926: getstatic Perryc.c : I
    //   929: iflt -> 943
    //   932: ldc2_w -879264655
    //   935: l2i
    //   936: ldc_w 940827227
    //   939: ixor
    //   940: goto -> 951
    //   943: ldc2_w -1816350763
    //   946: l2i
    //   947: ldc_w -303304645
    //   950: ixor
    //   951: ldc2_w -1112926091
    //   954: l2i
    //   955: ldc_w -1426590822
    //   958: ixor
    //   959: ixor
    //   960: lookupswitch default -> 4756, -455510587 -> 943, 1762309121 -> 988
    //   988: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   991: getstatic Perryc.1 : I
    //   994: ifeq -> 1008
    //   997: ldc2_w 182510753
    //   1000: l2i
    //   1001: ldc_w -292449273
    //   1004: ixor
    //   1005: goto -> 1016
    //   1008: ldc2_w -1037096040
    //   1011: l2i
    //   1012: ldc_w 125376932
    //   1015: ixor
    //   1016: ldc2_w -201430972
    //   1019: l2i
    //   1020: ldc_w -1358460704
    //   1023: ixor
    //   1024: ixor
    //   1025: lookupswitch default -> 1052, -1199009790 -> 4720, 534979980 -> 1008
    //   1052: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_LAST_MODIFIED : Ljava/lang/String;
    //   1055: ldc_w '庯㌐廧ㅩ뀦ิ⌆芶볛ਣ鍟綴㠩'
    //   1058: getstatic Perryc.1 : I
    //   1061: ifeq -> 1075
    //   1064: ldc2_w -1357816646
    //   1067: l2i
    //   1068: ldc_w -561010680
    //   1071: ixor
    //   1072: goto -> 1083
    //   1075: ldc2_w 682914393
    //   1078: l2i
    //   1079: ldc_w -1369926604
    //   1082: ixor
    //   1083: ldc2_w -934974453
    //   1086: l2i
    //   1087: ldc_w -533831238
    //   1090: ixor
    //   1091: ixor
    //   1092: lookupswitch default -> 1120, 1509292291 -> 4804, 2102658683 -> 1075
    //   1120: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1123: getstatic Perryc.1 : I
    //   1126: ifeq -> 1140
    //   1129: ldc2_w -1261513142
    //   1132: l2i
    //   1133: ldc_w 1859569892
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w 1932955240
    //   1143: l2i
    //   1144: ldc_w 996887600
    //   1147: ixor
    //   1148: ldc2_w -1470777766
    //   1151: l2i
    //   1152: ldc_w 192119729
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1184, -2106294115 -> 1140, 2034117445 -> 4790
    //   1184: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_ACCEPT_ENCODING : Ljava/lang/String;
    //   1187: ldc_w '庯㌐廧ㅩ뀦ิ⌀芰볙਴鍓綮'
    //   1190: getstatic Perryc.1 : I
    //   1193: ifeq -> 1207
    //   1196: ldc2_w 1487201725
    //   1199: l2i
    //   1200: ldc_w -1025115375
    //   1203: ixor
    //   1204: goto -> 1215
    //   1207: ldc2_w 853487626
    //   1210: l2i
    //   1211: ldc_w -9838988
    //   1214: ixor
    //   1215: ldc2_w 1915346003
    //   1218: l2i
    //   1219: ldc_w 1933598742
    //   1222: ixor
    //   1223: ixor
    //   1224: lookupswitch default -> 4742, -1691835671 -> 1207, -857779653 -> 1252
    //   1252: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1255: getstatic Perryc.1 : I
    //   1258: ifeq -> 1272
    //   1261: ldc2_w -594126531
    //   1264: l2i
    //   1265: ldc_w 2126441580
    //   1268: ixor
    //   1269: goto -> 1280
    //   1272: ldc2_w -1732371981
    //   1275: l2i
    //   1276: ldc_w 540228165
    //   1279: ixor
    //   1280: ldc2_w 434091386
    //   1283: l2i
    //   1284: ldc_w -1060056576
    //   1287: ixor
    //   1288: ixor
    //   1289: lookupswitch default -> 4752, 1635927244 -> 1316, 2066207275 -> 1272
    //   1316: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_ACCEPT_CHARSET : Ljava/lang/String;
    //   1319: ldc_w '広㌆廨ㅸ뀢๸⌱芬벗ਨ鍄綷㡣쏯辞蚗ꮴﵕ턥侳됖䩰뿾ષᣏﮟ▗㎌㮙搥㠽㫣?㍱奥矽ąꎩ鄴檍땆훈켋Ꮛ됡ɫ옎'
    //   1322: getstatic Perryc.c : I
    //   1325: iflt -> 1339
    //   1328: ldc2_w -1224500709
    //   1331: l2i
    //   1332: ldc_w 465112742
    //   1335: ixor
    //   1336: goto -> 1347
    //   1339: ldc2_w -1431096609
    //   1342: l2i
    //   1343: ldc_w 2066047241
    //   1346: ixor
    //   1347: ldc2_w -1895850784
    //   1350: l2i
    //   1351: ldc_w -436882037
    //   1354: ixor
    //   1355: ixor
    //   1356: lookupswitch default -> 1384, -944718378 -> 4702, 2001745939 -> 1339
    //   1384: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1387: getstatic Perryc.1 : I
    //   1390: ifeq -> 1404
    //   1393: ldc2_w -2070113939
    //   1396: l2i
    //   1397: ldc_w 1973250738
    //   1400: ixor
    //   1401: goto -> 1412
    //   1404: ldc2_w 1836199357
    //   1407: l2i
    //   1408: ldc_w 349417214
    //   1411: ixor
    //   1412: ldc2_w -1299130630
    //   1415: l2i
    //   1416: ldc_w -50722874
    //   1419: ixor
    //   1420: ixor
    //   1421: lookupswitch default -> 1448, -1825571614 -> 1404, -1083495709 -> 4780
    //   1448: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CONTENT_TYPE_MULTIPART : Ljava/lang/String;
    //   1451: ldc_w '庾㌁廫ㅴ끿๘⌶芬볐ਵ鍟綠㠯쏿辖蚌ꮻ'
    //   1454: getstatic Perryc.0 : I
    //   1457: ifle -> 1471
    //   1460: ldc2_w -1487246217
    //   1463: l2i
    //   1464: ldc_w -899963485
    //   1467: ixor
    //   1468: goto -> 1479
    //   1471: ldc2_w 12275826
    //   1474: l2i
    //   1475: ldc_w 1398780820
    //   1478: ixor
    //   1479: ldc2_w 1997323877
    //   1482: l2i
    //   1483: ldc_w -1288529325
    //   1486: ixor
    //   1487: ixor
    //   1488: lookupswitch default -> 4824, -1747269680 -> 1516, -1455428126 -> 1471
    //   1516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1519: getstatic Perryc.c : I
    //   1522: iflt -> 1536
    //   1525: ldc2_w -2078379132
    //   1528: l2i
    //   1529: ldc_w 1814046933
    //   1532: ixor
    //   1533: goto -> 1544
    //   1536: ldc2_w -529604074
    //   1539: l2i
    //   1540: ldc_w 805234193
    //   1543: ixor
    //   1544: ldc2_w 592900377
    //   1547: l2i
    //   1548: ldc_w -287312899
    //   1551: ixor
    //   1552: ixor
    //   1553: lookupswitch default -> 1580, -1622739672 -> 1536, 632773045 -> 4732
    //   1580: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_PROXY_AUTHORIZATION : Ljava/lang/String;
    //   1583: ldc_w '庫㌋廴ㅥ뀷๪'
    //   1586: getstatic Perryc.0 : I
    //   1589: ifle -> 1603
    //   1592: ldc2_w 8383295
    //   1595: l2i
    //   1596: ldc_w 1962511669
    //   1599: ixor
    //   1600: goto -> 1611
    //   1603: ldc2_w -1027492066
    //   1606: l2i
    //   1607: ldc_w -2061912306
    //   1610: ixor
    //   1611: ldc2_w 975757992
    //   1614: l2i
    //   1615: ldc_w 484218641
    //   1618: ixor
    //   1619: ixor
    //   1620: lookupswitch default -> 4778, 1383207859 -> 1603, 1630303657 -> 1648
    //   1648: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1651: getstatic Perryc.0 : I
    //   1654: ifle -> 1668
    //   1657: ldc2_w -1267098184
    //   1660: l2i
    //   1661: ldc_w -2024938253
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w 58053813
    //   1671: l2i
    //   1672: ldc_w 770335190
    //   1675: ixor
    //   1676: ldc2_w 1879427663
    //   1679: l2i
    //   1680: ldc_w 1793610729
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 4734, 702144749 -> 1668, 879897797 -> 1712
    //   1712: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_EXPIRES : Ljava/lang/String;
    //   1715: ldc_w '庾㌦廐'
    //   1718: getstatic Perryc.1 : I
    //   1721: ifeq -> 1735
    //   1724: ldc2_w -730420815
    //   1727: l2i
    //   1728: ldc_w 481117634
    //   1731: ixor
    //   1732: goto -> 1743
    //   1735: ldc2_w 1954797703
    //   1738: l2i
    //   1739: ldc_w -461910980
    //   1742: ixor
    //   1743: ldc2_w 724867531
    //   1746: l2i
    //   1747: ldc_w -455027002
    //   1750: ixor
    //   1751: ixor
    //   1752: lookupswitch default -> 1780, 118465406 -> 4796, 1306293273 -> 1735
    //   1780: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 667880238
    //   1792: l2i
    //   1793: ldc_w 1306606982
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -1263512008
    //   1803: l2i
    //   1804: ldc_w 1837486599
    //   1807: ixor
    //   1808: ldc2_w -915772688
    //   1811: l2i
    //   1812: ldc_w -672096387
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 4816, -944803406 -> 1844, 1958003493 -> 1800
    //   1844: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_PUT : Ljava/lang/String;
    //   1847: ldc_w '庪㌒廰ㅩ'
    //   1850: getstatic Perryc.0 : I
    //   1853: ifle -> 1867
    //   1856: ldc2_w 1857961373
    //   1859: l2i
    //   1860: ldc_w 955733972
    //   1863: ixor
    //   1864: goto -> 1875
    //   1867: ldc2_w -1877209379
    //   1870: l2i
    //   1871: ldc_w -1164770067
    //   1874: ixor
    //   1875: ldc2_w -1904761723
    //   1878: l2i
    //   1879: ldc_w -183109968
    //   1882: ixor
    //   1883: ixor
    //   1884: lookupswitch default -> 4738, 757807228 -> 1867, 1374509061 -> 1912
    //   1912: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1915: getstatic Perryc.0 : I
    //   1918: ifle -> 1932
    //   1921: ldc2_w 2097355593
    //   1924: l2i
    //   1925: ldc_w 1100233213
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w -1126576770
    //   1935: l2i
    //   1936: ldc_w -978869167
    //   1939: ixor
    //   1940: ldc2_w -1560810952
    //   1943: l2i
    //   1944: ldc_w -218924026
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 1976, 1166741418 -> 1932, 1821619338 -> 4820
    //   1976: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_DATE : Ljava/lang/String;
    //   1979: ldc_w '庉㌉廭ㅼ'
    //   1982: getstatic Perryc.1 : I
    //   1985: ifeq -> 1999
    //   1988: ldc2_w 1306564451
    //   1991: l2i
    //   1992: ldc_w 777536030
    //   1995: ixor
    //   1996: goto -> 2007
    //   1999: ldc2_w -2015744920
    //   2002: l2i
    //   2003: ldc_w 1172035789
    //   2006: ixor
    //   2007: ldc2_w -738977354
    //   2010: l2i
    //   2011: ldc_w 646791239
    //   2014: ixor
    //   2015: ixor
    //   2016: lookupswitch default -> 4810, -1765700468 -> 1999, 930655572 -> 2044
    //   2044: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2047: getstatic Perryc.c : I
    //   2050: iflt -> 2064
    //   2053: ldc2_w -51946864
    //   2056: l2i
    //   2057: ldc_w -1778419380
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w -1289421595
    //   2067: l2i
    //   2068: ldc_w -462574771
    //   2071: ixor
    //   2072: ldc2_w 1509286514
    //   2075: l2i
    //   2076: ldc_w -91002326
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 4692, -897668220 -> 2064, -198189072 -> 2108
    //   2108: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.ENCODING_GZIP : Ljava/lang/String;
    //   2111: ldc_w '廞㍃廧ㅣ뀦๼⌭芬번ਨ鍃綴㠪쏪辍蚚ꯥﵞ'
    //   2114: getstatic Perryc.c : I
    //   2117: iflt -> 2131
    //   2120: ldc2_w -378930597
    //   2123: l2i
    //   2124: ldc_w 451653234
    //   2127: ixor
    //   2128: goto -> 2139
    //   2131: ldc2_w 31324853
    //   2134: l2i
    //   2135: ldc_w -1738183246
    //   2138: ixor
    //   2139: ldc2_w 1743265046
    //   2142: l2i
    //   2143: ldc_w 623789511
    //   2146: ixor
    //   2147: ixor
    //   2148: lookupswitch default -> 4762, -1320940296 -> 2131, -612446250 -> 2176
    //   2176: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2179: getstatic Perryc.c : I
    //   2182: iflt -> 2196
    //   2185: ldc2_w 222799062
    //   2188: l2i
    //   2189: ldc_w 496710675
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w -1182541881
    //   2199: l2i
    //   2200: ldc_w -518818677
    //   2203: ixor
    //   2204: ldc2_w 309377466
    //   2207: l2i
    //   2208: ldc_w 1357999578
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 4822, 437352236 -> 2240, 1381844133 -> 2196
    //   2240: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.BOUNDARY : Ljava/lang/String;
    //   2243: ldc_w '庭㌒廧ㅤ끿๚⌬芶볌ਨ鍚'
    //   2246: getstatic Perryc.1 : I
    //   2249: ifeq -> 2263
    //   2252: ldc2_w 716174423
    //   2255: l2i
    //   2256: ldc_w 1345324246
    //   2259: ixor
    //   2260: goto -> 2271
    //   2263: ldc2_w -398264725
    //   2266: l2i
    //   2267: ldc_w -776940172
    //   2270: ixor
    //   2271: ldc2_w -1784027942
    //   2274: l2i
    //   2275: ldc_w -915857272
    //   2278: ixor
    //   2279: ixor
    //   2280: lookupswitch default -> 4730, 643773651 -> 2263, 1697834829 -> 2308
    //   2308: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2311: getstatic Perryc.c : I
    //   2314: iflt -> 2328
    //   2317: ldc2_w 1543304702
    //   2320: l2i
    //   2321: ldc_w -12121140
    //   2324: ixor
    //   2325: goto -> 2336
    //   2328: ldc2_w 1403074604
    //   2331: l2i
    //   2332: ldc_w 59714309
    //   2335: ixor
    //   2336: ldc2_w 240035962
    //   2339: l2i
    //   2340: ldc_w -192925063
    //   2343: ixor
    //   2344: ixor
    //   2345: lookupswitch default -> 2372, 1584751665 -> 4812, 1710177522 -> 2328
    //   2372: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_CACHE_CONTROL : Ljava/lang/String;
    //   2375: ldc_w '廣㍹'
    //   2378: getstatic Perryc.1 : I
    //   2381: ifeq -> 2395
    //   2384: ldc2_w -236190115
    //   2387: l2i
    //   2388: ldc_w -807312213
    //   2391: ixor
    //   2392: goto -> 2403
    //   2395: ldc2_w 902060658
    //   2398: l2i
    //   2399: ldc_w 892915808
    //   2402: ixor
    //   2403: ldc2_w -1317581614
    //   2406: l2i
    //   2407: ldc_w -1376397759
    //   2410: ixor
    //   2411: ixor
    //   2412: lookupswitch default -> 2440, 579860581 -> 4800, 760383881 -> 2395
    //   2440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2443: getstatic Perryc.c : I
    //   2446: iflt -> 2460
    //   2449: ldc2_w 1318528699
    //   2452: l2i
    //   2453: ldc_w -974789325
    //   2456: ixor
    //   2457: goto -> 2468
    //   2460: ldc2_w -1855127482
    //   2463: l2i
    //   2464: ldc_w 982628989
    //   2467: ixor
    //   2468: ldc2_w -2015630333
    //   2471: l2i
    //   2472: ldc_w 36627856
    //   2475: ixor
    //   2476: ixor
    //   2477: lookupswitch default -> 2504, 243780123 -> 4696, 640201649 -> 2460
    //   2504: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CRLF : Ljava/lang/String;
    //   2507: ldc_w '庪㌶廈ㅉ뀗'
    //   2510: getstatic Perryc.1 : I
    //   2513: ifeq -> 2527
    //   2516: ldc2_w 700824789
    //   2519: l2i
    //   2520: ldc_w -2008778339
    //   2523: ixor
    //   2524: goto -> 2535
    //   2527: ldc2_w -1903893190
    //   2530: l2i
    //   2531: ldc_w 1887725848
    //   2534: ixor
    //   2535: ldc2_w -2129686855
    //   2538: l2i
    //   2539: ldc_w -370405705
    //   2542: ixor
    //   2543: ixor
    //   2544: lookupswitch default -> 4772, -1763505108 -> 2572, -916306618 -> 2527
    //   2572: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2575: getstatic Perryc.0 : I
    //   2578: ifle -> 2592
    //   2581: ldc2_w 469688219
    //   2584: l2i
    //   2585: ldc_w 1403425521
    //   2588: ixor
    //   2589: goto -> 2600
    //   2592: ldc2_w 1557920913
    //   2595: l2i
    //   2596: ldc_w -1046975632
    //   2599: ixor
    //   2600: ldc2_w -1604609372
    //   2603: l2i
    //   2604: ldc_w -2064877089
    //   2607: ixor
    //   2608: ixor
    //   2609: lookupswitch default -> 4766, -1175161702 -> 2636, 1827646993 -> 2592
    //   2636: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_DELETE : Ljava/lang/String;
    //   2639: ldc_w '庼㌖廢ㅩ뀷๫'
    //   2642: getstatic Perryc.1 : I
    //   2645: ifeq -> 2659
    //   2648: ldc2_w -1842817754
    //   2651: l2i
    //   2652: ldc_w -1331650145
    //   2655: ixor
    //   2656: goto -> 2667
    //   2659: ldc2_w -200475805
    //   2662: l2i
    //   2663: ldc_w 1815183767
    //   2666: ixor
    //   2667: ldc2_w -1969901249
    //   2670: l2i
    //   2671: ldc_w 1787003466
    //   2674: ixor
    //   2675: ixor
    //   2676: lookupswitch default -> 2704, -1029814324 -> 4782, 1045353940 -> 2659
    //   2704: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2707: getstatic Perryc.0 : I
    //   2710: ifle -> 2724
    //   2713: ldc2_w 1835503182
    //   2716: l2i
    //   2717: ldc_w -871869003
    //   2720: ixor
    //   2721: goto -> 2732
    //   2724: ldc2_w -939735030
    //   2727: l2i
    //   2728: ldc_w -1979484589
    //   2731: ixor
    //   2732: ldc2_w 1264226138
    //   2735: l2i
    //   2736: ldc_w -730092825
    //   2739: ixor
    //   2740: ixor
    //   2741: lookupswitch default -> 2768, 614126530 -> 2724, 1045364294 -> 4784
    //   2768: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_REFERER : Ljava/lang/String;
    //   2771: ldc_w '庭㌜廪ㅸ뀼๭⍮芝볖ਨ鍒綳㠠쏬'
    //   2774: getstatic Perryc.0 : I
    //   2777: ifle -> 2791
    //   2780: ldc2_w 1811803401
    //   2783: l2i
    //   2784: ldc_w 400372308
    //   2787: ixor
    //   2788: goto -> 2799
    //   2791: ldc2_w -1366046484
    //   2794: l2i
    //   2795: ldc_w -1571393389
    //   2798: ixor
    //   2799: ldc2_w -814767416
    //   2802: l2i
    //   2803: ldc_w -1063011756
    //   2806: ixor
    //   2807: ixor
    //   2808: lookupswitch default -> 4708, 50962659 -> 2836, 1944897473 -> 2791
    //   2836: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2839: getstatic Perryc.c : I
    //   2842: iflt -> 2856
    //   2845: ldc2_w 1218452668
    //   2848: l2i
    //   2849: ldc_w -997948833
    //   2852: ixor
    //   2853: goto -> 2864
    //   2856: ldc2_w -53293306
    //   2859: l2i
    //   2860: ldc_w 1043947100
    //   2863: ixor
    //   2864: ldc2_w 2008846249
    //   2867: l2i
    //   2868: ldc_w 843071900
    //   2871: ixor
    //   2872: ixor
    //   2873: lookupswitch default -> 4704, -2028511377 -> 2900, -908570410 -> 2856
    //   2900: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_CONTENT_ENCODING : Ljava/lang/String;
    //   2903: ldc_w '序㌃廴ㅠ뀱๸⌷花볗੨鍎緷㠹쏼辈蛎ꮳﴁ텷侼둔䩰뿢િᣋﮃ▍㏞㯍摰㠺'
    //   2906: getstatic Perryc.0 : I
    //   2909: ifle -> 2923
    //   2912: ldc2_w 1335028089
    //   2915: l2i
    //   2916: ldc_w -1445500708
    //   2919: ixor
    //   2920: goto -> 2931
    //   2923: ldc2_w 2111278311
    //   2926: l2i
    //   2927: ldc_w -197116852
    //   2930: ixor
    //   2931: ldc2_w 1253323122
    //   2934: l2i
    //   2935: ldc_w -781295458
    //   2938: ixor
    //   2939: ixor
    //   2940: lookupswitch default -> 2968, -783861030 -> 2923, 2107625545 -> 4698
    //   2968: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2971: getstatic Perryc.1 : I
    //   2974: ifeq -> 2988
    //   2977: ldc2_w -485768449
    //   2980: l2i
    //   2981: ldc_w -198216898
    //   2984: ixor
    //   2985: goto -> 2996
    //   2988: ldc2_w 749594483
    //   2991: l2i
    //   2992: ldc_w -954639269
    //   2995: ixor
    //   2996: ldc2_w 226012519
    //   2999: l2i
    //   3000: ldc_w -2062283557
    //   3003: ixor
    //   3004: ixor
    //   3005: lookupswitch default -> 3032, -1622667139 -> 4710, 1981368484 -> 2988
    //   3032: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CONTENT_TYPE_FORM : Ljava/lang/String;
    //   3035: ldc_w '庡㌣廐ㅅ뀜๊'
    //   3038: getstatic Perryc.0 : I
    //   3041: ifle -> 3055
    //   3044: ldc2_w 567807067
    //   3047: l2i
    //   3048: ldc_w 634039061
    //   3051: ixor
    //   3052: goto -> 3063
    //   3055: ldc2_w -414905664
    //   3058: l2i
    //   3059: ldc_w 2022927824
    //   3062: ixor
    //   3063: ldc2_w 270212665
    //   3066: l2i
    //   3067: ldc_w -560340227
    //   3070: ixor
    //   3071: ixor
    //   3072: lookupswitch default -> 4740, -896509046 -> 3055, 1364499412 -> 3100
    //   3100: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3103: getstatic Perryc.0 : I
    //   3106: ifle -> 3120
    //   3109: ldc2_w 417844079
    //   3112: l2i
    //   3113: ldc_w -98556066
    //   3116: ixor
    //   3117: goto -> 3128
    //   3120: ldc2_w 327517618
    //   3123: l2i
    //   3124: ldc_w -913625714
    //   3127: ixor
    //   3128: ldc2_w -1536494279
    //   3131: l2i
    //   3132: ldc_w 947862036
    //   3135: ixor
    //   3136: ixor
    //   3137: lookupswitch default -> 3164, 145073903 -> 3120, 2127700764 -> 4746
    //   3164: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_OPTIONS : Ljava/lang/String;
    //   3167: ldc_w '庾㌼廗ㅘ'
    //   3170: getstatic Perryc.c : I
    //   3173: iflt -> 3187
    //   3176: ldc2_w 533729002
    //   3179: l2i
    //   3180: ldc_w 1046125467
    //   3183: ixor
    //   3184: goto -> 3195
    //   3187: ldc2_w -877184466
    //   3190: l2i
    //   3191: ldc_w -891590800
    //   3194: ixor
    //   3195: ldc2_w -1666065223
    //   3198: l2i
    //   3199: ldc_w -1338781573
    //   3202: ixor
    //   3203: ixor
    //   3204: lookupswitch default -> 4764, 218667443 -> 3187, 770593180 -> 3232
    //   3232: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3235: getstatic Perryc.1 : I
    //   3238: ifeq -> 3252
    //   3241: ldc2_w -1862616131
    //   3244: l2i
    //   3245: ldc_w -542075205
    //   3248: ixor
    //   3249: goto -> 3260
    //   3252: ldc2_w -1127418571
    //   3255: l2i
    //   3256: ldc_w -171847776
    //   3259: ixor
    //   3260: ldc2_w 1364725656
    //   3263: l2i
    //   3264: ldc_w 2061878453
    //   3267: ixor
    //   3268: ixor
    //   3269: lookupswitch default -> 3296, -1836018732 -> 3252, 1693967915 -> 4716
    //   3296: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_POST : Ljava/lang/String;
    //   3299: ldc_w '庢㌜廧ㅭ뀻๶⌭'
    //   3302: getstatic Perryc.1 : I
    //   3305: ifeq -> 3319
    //   3308: ldc2_w -1575050536
    //   3311: l2i
    //   3312: ldc_w -1196206586
    //   3315: ixor
    //   3316: goto -> 3327
    //   3319: ldc2_w 1832782531
    //   3322: l2i
    //   3323: ldc_w 32886779
    //   3326: ixor
    //   3327: ldc2_w 778683656
    //   3330: l2i
    //   3331: ldc_w 2005584837
    //   3334: ixor
    //   3335: ixor
    //   3336: lookupswitch default -> 3364, -371811313 -> 3319, 1129249299 -> 4774
    //   3364: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3367: getstatic Perryc.1 : I
    //   3370: ifeq -> 3384
    //   3373: ldc2_w 57943326
    //   3376: l2i
    //   3377: ldc_w 2018276691
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w -1609939953
    //   3387: l2i
    //   3388: ldc_w -541051503
    //   3391: ixor
    //   3392: ldc2_w -15127904
    //   3395: l2i
    //   3396: ldc_w -823634566
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 4712, 1254698903 -> 3384, 1312493124 -> 3428
    //   3428: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_LOCATION : Ljava/lang/String;
    //   3431: ldc_w '庯㌆廰ㅤ뀠๰⌹芹볌ਨ鍘'
    //   3434: getstatic Perryc.1 : I
    //   3437: ifeq -> 3451
    //   3440: ldc2_w 756632100
    //   3443: l2i
    //   3444: ldc_w -576838522
    //   3447: ixor
    //   3448: goto -> 3459
    //   3451: ldc2_w -145895720
    //   3454: l2i
    //   3455: ldc_w 1577317929
    //   3458: ixor
    //   3459: ldc2_w 172764787
    //   3462: l2i
    //   3463: ldc_w 970520621
    //   3466: ixor
    //   3467: ixor
    //   3468: lookupswitch default -> 4706, -1696928081 -> 3496, -1022117636 -> 3451
    //   3496: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3499: getstatic Perryc.1 : I
    //   3502: ifeq -> 3516
    //   3505: ldc2_w -1068258393
    //   3508: l2i
    //   3509: ldc_w -1489427877
    //   3512: ixor
    //   3513: goto -> 3524
    //   3516: ldc2_w -1928009473
    //   3519: l2i
    //   3520: ldc_w 196904145
    //   3523: ixor
    //   3524: ldc2_w -1131183938
    //   3527: l2i
    //   3528: ldc_w -495470497
    //   3531: ixor
    //   3532: ixor
    //   3533: lookupswitch default -> 4806, -666086193 -> 3560, 965652765 -> 3516
    //   3560: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_AUTHORIZATION : Ljava/lang/String;
    //   3563: ldc_w '庺㌡廅ㅏ'
    //   3566: getstatic Perryc.0 : I
    //   3569: ifle -> 3583
    //   3572: ldc2_w 963000951
    //   3575: l2i
    //   3576: ldc_w -1679615344
    //   3579: ixor
    //   3580: goto -> 3591
    //   3583: ldc2_w 671375585
    //   3586: l2i
    //   3587: ldc_w -1346071777
    //   3590: ixor
    //   3591: ldc2_w -1115839263
    //   3594: l2i
    //   3595: ldc_w 853997204
    //   3598: ixor
    //   3599: ixor
    //   3600: lookupswitch default -> 4830, 140222859 -> 3628, 756970130 -> 3583
    //   3628: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3631: getstatic Perryc.0 : I
    //   3634: ifle -> 3648
    //   3637: ldc2_w 709374329
    //   3640: l2i
    //   3641: ldc_w 846936017
    //   3644: ixor
    //   3645: goto -> 3656
    //   3648: ldc2_w 1663302010
    //   3651: l2i
    //   3652: ldc_w -1137260886
    //   3655: ixor
    //   3656: ldc2_w -1220237335
    //   3659: l2i
    //   3660: ldc_w 299647827
    //   3663: ixor
    //   3664: ixor
    //   3665: lookupswitch default -> 4760, -1096031726 -> 3648, 2039339882 -> 3692
    //   3692: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_TRACE : Ljava/lang/String;
    //   3695: ldc_w '庽㌖延ㅺ뀠'
    //   3698: getstatic Perryc.1 : I
    //   3701: ifeq -> 3715
    //   3704: ldc2_w 1909121549
    //   3707: l2i
    //   3708: ldc_w -632689026
    //   3711: ixor
    //   3712: goto -> 3723
    //   3715: ldc2_w -1672790155
    //   3718: l2i
    //   3719: ldc_w -367842498
    //   3722: ixor
    //   3723: ldc2_w 2083697261
    //   3726: l2i
    //   3727: ldc_w -939934408
    //   3730: ixor
    //   3731: ixor
    //   3732: lookupswitch default -> 4722, -845997282 -> 3760, 273154854 -> 3715
    //   3760: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3763: getstatic Perryc.c : I
    //   3766: iflt -> 3780
    //   3769: ldc2_w 1579366866
    //   3772: l2i
    //   3773: ldc_w -179530906
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w -1009235696
    //   3783: l2i
    //   3784: ldc_w -1477912031
    //   3787: ixor
    //   3788: ldc2_w 955359403
    //   3791: l2i
    //   3792: ldc_w 1285251954
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 3824, -553293459 -> 4808, 1389434475 -> 3780
    //   3824: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_SERVER : Ljava/lang/String;
    //   3827: ldc_w '度㌶廅ㅈ'
    //   3830: getstatic Perryc.1 : I
    //   3833: ifeq -> 3847
    //   3836: ldc2_w -1966590124
    //   3839: l2i
    //   3840: ldc_w -1431895402
    //   3843: ixor
    //   3844: goto -> 3855
    //   3847: ldc2_w -137124740
    //   3850: l2i
    //   3851: ldc_w -914667778
    //   3854: ixor
    //   3855: ldc2_w -1909981953
    //   3858: l2i
    //   3859: ldc_w -1787918690
    //   3862: ixor
    //   3863: ixor
    //   3864: lookupswitch default -> 4786, 635541731 -> 3892, 992366499 -> 3847
    //   3892: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3895: getstatic Perryc.0 : I
    //   3898: ifle -> 3912
    //   3901: ldc2_w -239241256
    //   3904: l2i
    //   3905: ldc_w -1707362877
    //   3908: ixor
    //   3909: goto -> 3920
    //   3912: ldc2_w -829943017
    //   3915: l2i
    //   3916: ldc_w -2067788225
    //   3919: ixor
    //   3920: ldc2_w -399511806
    //   3923: l2i
    //   3924: ldc_w 1412903547
    //   3927: ixor
    //   3928: ixor
    //   3929: lookupswitch default -> 3956, -677503134 -> 4748, -199199237 -> 3912
    //   3956: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_HEAD : Ljava/lang/String;
    //   3959: ldc_w '庭㌜廪ㅸ뀼๭⍮芌볁ਢ'
    //   3962: getstatic Perryc.1 : I
    //   3965: ifeq -> 3979
    //   3968: ldc2_w 1712817464
    //   3971: l2i
    //   3972: ldc_w 1499718967
    //   3975: ixor
    //   3976: goto -> 3987
    //   3979: ldc2_w 1303951625
    //   3982: l2i
    //   3983: ldc_w -923089279
    //   3986: ixor
    //   3987: ldc2_w -717286132
    //   3990: l2i
    //   3991: ldc_w 1625023471
    //   3994: ixor
    //   3995: ixor
    //   3996: lookupswitch default -> 4024, -1970235668 -> 4724, -1364036427 -> 3979
    //   4024: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4027: getstatic Perryc.0 : I
    //   4030: ifle -> 4044
    //   4033: ldc2_w -214756063
    //   4036: l2i
    //   4037: ldc_w -605630825
    //   4040: ixor
    //   4041: goto -> 4052
    //   4044: ldc2_w -486044994
    //   4047: l2i
    //   4048: ldc_w 232394818
    //   4051: ixor
    //   4052: ldc2_w -1735547394
    //   4055: l2i
    //   4056: ldc_w -1881634446
    //   4059: ixor
    //   4060: ixor
    //   4061: lookupswitch default -> 4088, 865379831 -> 4044, 1065416506 -> 4832
    //   4088: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_CONTENT_TYPE : Ljava/lang/String;
    //   4091: ldc_w '庍㌛廥ㅾ뀷๭'
    //   4094: getstatic Perryc.0 : I
    //   4097: ifle -> 4111
    //   4100: ldc2_w -2046302817
    //   4103: l2i
    //   4104: ldc_w 1752822663
    //   4107: ixor
    //   4108: goto -> 4119
    //   4111: ldc2_w -2074333301
    //   4114: l2i
    //   4115: ldc_w -534989831
    //   4118: ixor
    //   4119: ldc2_w -996319478
    //   4122: l2i
    //   4123: ldc_w -1154327479
    //   4126: ixor
    //   4127: ixor
    //   4128: lookupswitch default -> 4798, -1848568485 -> 4111, 468688689 -> 4156
    //   4156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4159: getstatic Perryc.0 : I
    //   4162: ifle -> 4176
    //   4165: ldc2_w -333984891
    //   4168: l2i
    //   4169: ldc_w 129111701
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w -1406308478
    //   4179: l2i
    //   4180: ldc_w 331297517
    //   4183: ixor
    //   4184: ldc2_w 582233545
    //   4187: l2i
    //   4188: ldc_w 1997894818
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4826, -1107000197 -> 4176, -365755388 -> 4220
    //   4220: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.PARAM_CHARSET : Ljava/lang/String;
    //   4223: ldc_w '庻㌀廡ㅾ뀓๾⌦芶볌'
    //   4226: getstatic Perryc.1 : I
    //   4229: ifeq -> 4243
    //   4232: ldc2_w -64142406
    //   4235: l2i
    //   4236: ldc_w 1015766348
    //   4239: ixor
    //   4240: goto -> 4251
    //   4243: ldc2_w -893158249
    //   4246: l2i
    //   4247: ldc_w -387186272
    //   4250: ixor
    //   4251: ldc2_w -207537586
    //   4254: l2i
    //   4255: ldc_w -324093365
    //   4258: ixor
    //   4259: ixor
    //   4260: lookupswitch default -> 4700, -542531853 -> 4243, 1025572146 -> 4288
    //   4288: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4291: getstatic Perryc.0 : I
    //   4294: ifle -> 4308
    //   4297: ldc2_w -567485734
    //   4300: l2i
    //   4301: ldc_w 1138775814
    //   4304: ixor
    //   4305: goto -> 4316
    //   4308: ldc2_w -134714699
    //   4311: l2i
    //   4312: ldc_w -1116216969
    //   4315: ixor
    //   4316: ldc2_w 993579428
    //   4319: l2i
    //   4320: ldc_w 87481522
    //   4323: ixor
    //   4324: ixor
    //   4325: lookupswitch default -> 4750, -1547534134 -> 4308, 1954645716 -> 4352
    //   4352: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.HEADER_USER_AGENT : Ljava/lang/String;
    //   4355: ldc_w '庩㌶廐'
    //   4358: getstatic Perryc.c : I
    //   4361: iflt -> 4375
    //   4364: ldc2_w 780134673
    //   4367: l2i
    //   4368: ldc_w -389353356
    //   4371: ixor
    //   4372: goto -> 4383
    //   4375: ldc2_w 2027304074
    //   4378: l2i
    //   4379: ldc_w -804925078
    //   4382: ixor
    //   4383: ldc2_w -1139134489
    //   4386: l2i
    //   4387: ldc_w 1807503734
    //   4390: ixor
    //   4391: ixor
    //   4392: lookupswitch default -> 4794, 286484468 -> 4375, 2138413937 -> 4420
    //   4420: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4423: getstatic Perryc.1 : I
    //   4426: ifeq -> 4440
    //   4429: ldc2_w 529196872
    //   4432: l2i
    //   4433: ldc_w -105197715
    //   4436: ixor
    //   4437: goto -> 4448
    //   4440: ldc2_w -1995789144
    //   4443: l2i
    //   4444: ldc_w -197746835
    //   4447: ixor
    //   4448: ldc2_w 2132138641
    //   4451: l2i
    //   4452: ldc_w 435755765
    //   4455: ixor
    //   4456: ixor
    //   4457: lookupswitch default -> 4828, -2133006271 -> 4440, 466678689 -> 4484
    //   4484: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.METHOD_GET : Ljava/lang/String;
    //   4487: ldc2_w -954768652
    //   4490: l2i
    //   4491: ldc_w -954768652
    //   4494: ixor
    //   4495: anewarray java/lang/String
    //   4498: getstatic Perryc.1 : I
    //   4501: ifeq -> 4515
    //   4504: ldc2_w 1643074911
    //   4507: l2i
    //   4508: ldc_w -941105640
    //   4511: ixor
    //   4512: goto -> 4523
    //   4515: ldc2_w 628941941
    //   4518: l2i
    //   4519: ldc_w -1744604424
    //   4522: ixor
    //   4523: ldc2_w -1509459836
    //   4526: l2i
    //   4527: ldc_w -1241327580
    //   4530: ixor
    //   4531: ixor
    //   4532: lookupswitch default -> 4560, -1240650777 -> 4814, -936178819 -> 4515
    //   4560: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.EMPTY_STRINGS : [Ljava/lang/String;
    //   4563: getstatic Perryc.0 : I
    //   4566: ifle -> 4580
    //   4569: ldc2_w 1090815804
    //   4572: l2i
    //   4573: ldc_w 1613852726
    //   4576: ixor
    //   4577: goto -> 4588
    //   4580: ldc2_w -287403014
    //   4583: l2i
    //   4584: ldc_w 407644783
    //   4587: ixor
    //   4588: ldc2_w -62319620
    //   4591: l2i
    //   4592: ldc_w 98818224
    //   4595: ixor
    //   4596: ixor
    //   4597: lookupswitch default -> 4744, -660652986 -> 4580, 255357657 -> 4624
    //   4624: getstatic bigname/zprestige/webhack/manager/Identity/UtilTwo$ConnectionFactory.DEFAULT : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$ConnectionFactory;
    //   4627: getstatic Perryc.0 : I
    //   4630: ifle -> 4644
    //   4633: ldc2_w 65968923
    //   4636: l2i
    //   4637: ldc_w -1817876906
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w -1019406354
    //   4647: l2i
    //   4648: ldc_w -135628374
    //   4651: ixor
    //   4652: ldc2_w 1429064077
    //   4655: l2i
    //   4656: ldc_w 735128184
    //   4659: ixor
    //   4660: ixor
    //   4661: lookupswitch default -> 4688, -289988936 -> 4728, 545454079 -> 4644
    //   4688: putstatic bigname/zprestige/webhack/manager/Identity/UtilTwo.CONNECTION_FACTORY : Lbigname/zprestige/webhack/manager/Identity/UtilTwo$ConnectionFactory;
    //   4691: return
    //   4692: aconst_null
    //   4693: athrow
    //   4694: aconst_null
    //   4695: athrow
    //   4696: aconst_null
    //   4697: athrow
    //   4698: aconst_null
    //   4699: athrow
    //   4700: aconst_null
    //   4701: athrow
    //   4702: aconst_null
    //   4703: athrow
    //   4704: aconst_null
    //   4705: athrow
    //   4706: aconst_null
    //   4707: athrow
    //   4708: aconst_null
    //   4709: athrow
    //   4710: aconst_null
    //   4711: athrow
    //   4712: aconst_null
    //   4713: athrow
    //   4714: aconst_null
    //   4715: athrow
    //   4716: aconst_null
    //   4717: athrow
    //   4718: aconst_null
    //   4719: athrow
    //   4720: aconst_null
    //   4721: athrow
    //   4722: aconst_null
    //   4723: athrow
    //   4724: aconst_null
    //   4725: athrow
    //   4726: aconst_null
    //   4727: athrow
    //   4728: aconst_null
    //   4729: athrow
    //   4730: aconst_null
    //   4731: athrow
    //   4732: aconst_null
    //   4733: athrow
    //   4734: aconst_null
    //   4735: athrow
    //   4736: aconst_null
    //   4737: athrow
    //   4738: aconst_null
    //   4739: athrow
    //   4740: aconst_null
    //   4741: athrow
    //   4742: aconst_null
    //   4743: athrow
    //   4744: aconst_null
    //   4745: athrow
    //   4746: aconst_null
    //   4747: athrow
    //   4748: aconst_null
    //   4749: athrow
    //   4750: aconst_null
    //   4751: athrow
    //   4752: aconst_null
    //   4753: athrow
    //   4754: aconst_null
    //   4755: athrow
    //   4756: aconst_null
    //   4757: athrow
    //   4758: aconst_null
    //   4759: athrow
    //   4760: aconst_null
    //   4761: athrow
    //   4762: aconst_null
    //   4763: athrow
    //   4764: aconst_null
    //   4765: athrow
    //   4766: aconst_null
    //   4767: athrow
    //   4768: aconst_null
    //   4769: athrow
    //   4770: aconst_null
    //   4771: athrow
    //   4772: aconst_null
    //   4773: athrow
    //   4774: aconst_null
    //   4775: athrow
    //   4776: aconst_null
    //   4777: athrow
    //   4778: aconst_null
    //   4779: athrow
    //   4780: aconst_null
    //   4781: athrow
    //   4782: aconst_null
    //   4783: athrow
    //   4784: aconst_null
    //   4785: athrow
    //   4786: aconst_null
    //   4787: athrow
    //   4788: aconst_null
    //   4789: athrow
    //   4790: aconst_null
    //   4791: athrow
    //   4792: aconst_null
    //   4793: athrow
    //   4794: aconst_null
    //   4795: athrow
    //   4796: aconst_null
    //   4797: athrow
    //   4798: aconst_null
    //   4799: athrow
    //   4800: aconst_null
    //   4801: athrow
    //   4802: aconst_null
    //   4803: athrow
    //   4804: aconst_null
    //   4805: athrow
    //   4806: aconst_null
    //   4807: athrow
    //   4808: aconst_null
    //   4809: athrow
    //   4810: aconst_null
    //   4811: athrow
    //   4812: aconst_null
    //   4813: athrow
    //   4814: aconst_null
    //   4815: athrow
    //   4816: aconst_null
    //   4817: athrow
    //   4818: aconst_null
    //   4819: athrow
    //   4820: aconst_null
    //   4821: athrow
    //   4822: aconst_null
    //   4823: athrow
    //   4824: aconst_null
    //   4825: athrow
    //   4826: aconst_null
    //   4827: athrow
    //   4828: aconst_null
    //   4829: athrow
    //   4830: aconst_null
    //   4831: athrow
    //   4832: aconst_null
    //   4833: athrow
  }
  
  public BufferedReader bufferedReader() {
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
  
  public UtilTwo proxyAuthorization(String paramString) {
    return Perry1.0c(this, (int)1499047812L ^ 0x2E3F7ABF, paramString);
  }
  
  public UtilTwo receive(Appendable appendable) {
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
  
  public UtilTwo part(String name, String filename, String contentType, File part) {
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
  
  public String header(String paramString) {
    return Perry1.69(this, (int)1803744187L ^ 0x4BDD78FE, paramString);
  }
  
  public UtilTwo authorization(String paramString) {
    return Perry1.02(this, (int)552472056L ^ 0x39461AC1, paramString);
  }
  
  public long expires() {
    return Perry1.39(this, (int)-410526475L ^ 0xD8616AD0);
  }
  
  public UtilTwo chunk(int paramInt) {
    return Perry1.1o(this, (int)650890355L ^ 0x56F2E4A8, paramInt);
  }
  
  public static UtilTwo trace(URL url) {
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
  
  public UtilTwo receive(OutputStream output) {
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
  
  public static String setProperty(String name, String value) {
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
  
  public String parameter(String headerName, String paramName) {
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
  
  public UtilTwo send(CharSequence value) {
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
  
  public long dateHeader(String name, long defaultValue) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 519
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 511
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 503
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 430990008
    //   33: l2i
    //   34: ldc_w 1203826661
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1242450431
    //   44: l2i
    //   45: ldc_w 1701870957
    //   48: ixor
    //   49: ldc2_w 448693626
    //   52: l2i
    //   53: ldc_w -1543223505
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 482, -1849362745 -> 84, -523612408 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 398811372
    //   94: l2i
    //   95: ldc_w 2091898676
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 1579939881
    //   105: l2i
    //   106: ldc_w 430176741
    //   109: ixor
    //   110: ldc2_w 1845702746
    //   113: l2i
    //   114: ldc_w -2035621893
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 492, -2084349831 -> 102, -1356730771 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual closeOutputQuietly : ()Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   151: goto -> 155
    //   154: athrow
    //   155: pop
    //   156: getstatic Perryc.c : I
    //   159: iflt -> 173
    //   162: ldc2_w 551716503
    //   165: l2i
    //   166: ldc_w 956042110
    //   169: ixor
    //   170: goto -> 181
    //   173: ldc2_w -2040553402
    //   176: l2i
    //   177: ldc_w -907979687
    //   180: ixor
    //   181: ldc2_w -1821154949
    //   184: l2i
    //   185: ldc_w 1437952622
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 216, -574852902 -> 173, -556235012 -> 484
    //   216: aload_0
    //   217: getstatic Perryc.0 : I
    //   220: ifle -> 234
    //   223: ldc2_w -1774126703
    //   226: l2i
    //   227: ldc_w -766192947
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w -202171337
    //   237: l2i
    //   238: ldc_w 1079702084
    //   241: ixor
    //   242: ldc2_w 439631045
    //   245: l2i
    //   246: ldc_w -1794160517
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -886087710 -> 480, 342771772 -> 234
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual getConnection : ()Ljava/net/HttpURLConnection;
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.1 : I
    //   290: ifeq -> 304
    //   293: ldc2_w 694056131
    //   296: l2i
    //   297: ldc_w 521673881
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 1553784665
    //   307: l2i
    //   308: ldc_w -978426038
    //   311: ixor
    //   312: ldc2_w 1950238680
    //   315: l2i
    //   316: ldc_w 845696310
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -1674564606 -> 304, 1880122036 -> 486
    //   348: aload_1
    //   349: getstatic Perryc.0 : I
    //   352: ifle -> 366
    //   355: ldc2_w 582370772
    //   358: l2i
    //   359: ldc_w -1262007401
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w 903250364
    //   369: l2i
    //   370: ldc_w -1148278880
    //   373: ixor
    //   374: ldc2_w 2141332379
    //   377: l2i
    //   378: ldc_w -2134998014
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 408, 1529339069 -> 366, 1768794586 -> 488
    //   408: lload_2
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w -383332727
    //   418: l2i
    //   419: ldc_w 888526049
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1382723115
    //   429: l2i
    //   430: ldc_w 702271218
    //   433: ixor
    //   434: ldc2_w 268723465
    //   437: l2i
    //   438: ldc_w 1510281027
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1877020928 -> 426, -1747816414 -> 490
    //   468: goto -> 472
    //   471: athrow
    //   472: invokevirtual getHeaderFieldDate : (Ljava/lang/String;J)J
    //   475: goto -> 479
    //   478: athrow
    //   479: lreturn
    //   480: aconst_null
    //   481: athrow
    //   482: aconst_null
    //   483: athrow
    //   484: aconst_null
    //   485: athrow
    //   486: aconst_null
    //   487: athrow
    //   488: aconst_null
    //   489: athrow
    //   490: aconst_null
    //   491: athrow
    //   492: aconst_null
    //   493: athrow
    //   494: pop
    //   495: goto -> 24
    //   498: pop
    //   499: aconst_null
    //   500: goto -> 494
    //   503: dup
    //   504: ifnull -> 494
    //   507: checkcast java/lang/Throwable
    //   510: athrow
    //   511: dup
    //   512: ifnull -> 498
    //   515: checkcast java/lang/Throwable
    //   518: athrow
    //   519: aconst_null
    //   520: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	456	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   24	456	1	name	Ljava/lang/String;
    //   24	456	2	defaultValue	J
    // Exception table:
    //   from	to	target	type
    //   8	20	503	java/lang/ArithmeticException
    //   147	154	154	finally
    //   147	154	3	finally
    //   147	154	147	finally
    //   148	154	154	java/util/ConcurrentModificationException
    //   148	154	147	finally
    //   279	286	286	finally
    //   279	286	286	java/lang/NumberFormatException
    //   279	286	3	finally
    //   280	286	286	java/lang/ArrayIndexOutOfBoundsException
    //   280	286	279	java/lang/StringIndexOutOfBoundsException
    //   471	478	478	finally
    //   471	478	3	java/lang/IllegalArgumentException
    //   471	478	3	finally
    //   472	478	478	finally
    //   472	478	471	java/lang/IndexOutOfBoundsException
    //   503	511	503	finally
    //   519	521	3	finally
  }
  
  public static UtilTwo options(CharSequence url) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/manager/Identity/UtilTwo
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1439630512
    //   37: l2i
    //   38: ldc_w 1556477064
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1250105096
    //   48: l2i
    //   49: ldc_w 1729293208
    //   52: ixor
    //   53: ldc2_w -1144724724
    //   56: l2i
    //   57: ldc_w -1517237796
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -392092408 -> 238, 1570306800 -> 45
    //   88: aload_0
    //   89: ldc_w '庡㌣廐륲栞뀜๊'
    //   92: getstatic Perryc.0 : I
    //   95: ifle -> 109
    //   98: ldc2_w 1516346292
    //   101: l2i
    //   102: ldc_w 1662558041
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 1359734046
    //   112: l2i
    //   113: ldc_w -1709917684
    //   116: ixor
    //   117: ldc2_w -223136410
    //   120: l2i
    //   121: ldc_w 2071822716
    //   124: ixor
    //   125: ixor
    //   126: lookupswitch default -> 240, -1330138889 -> 109, 1121053448 -> 152
    //   152: goto -> 156
    //   155: athrow
    //   156: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   159: goto -> 163
    //   162: athrow
    //   163: getstatic Perryc.1 : I
    //   166: ifeq -> 180
    //   169: ldc2_w 1865032317
    //   172: l2i
    //   173: ldc_w -621777997
    //   176: ixor
    //   177: goto -> 188
    //   180: ldc2_w -1584993400
    //   183: l2i
    //   184: ldc_w 78604371
    //   187: ixor
    //   188: ldc2_w -1966008048
    //   191: l2i
    //   192: ldc_w -25232184
    //   195: ixor
    //   196: ixor
    //   197: lookupswitch default -> 224, -1940593165 -> 180, -1049252842 -> 236
    //   224: goto -> 228
    //   227: athrow
    //   228: invokespecial <init> : (Ljava/lang/CharSequence;Ljava/lang/String;)V
    //   231: goto -> 235
    //   234: athrow
    //   235: areturn
    //   236: aconst_null
    //   237: athrow
    //   238: aconst_null
    //   239: athrow
    //   240: aconst_null
    //   241: athrow
    //   242: pop
    //   243: goto -> 24
    //   246: pop
    //   247: aconst_null
    //   248: goto -> 242
    //   251: dup
    //   252: ifnull -> 242
    //   255: checkcast java/lang/Throwable
    //   258: athrow
    //   259: dup
    //   260: ifnull -> 246
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: aconst_null
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	212	0	url	Ljava/lang/CharSequence;
    // Exception table:
    //   from	to	target	type
    //   8	20	251	finally
    //   155	162	162	finally
    //   155	162	3	finally
    //   156	162	155	finally
    //   156	162	162	finally
    //   156	162	155	finally
    //   227	234	234	finally
    //   227	234	227	finally
    //   227	234	234	finally
    //   227	234	234	finally
    //   228	234	234	java/lang/ArithmeticException
    //   251	259	251	finally
    //   267	269	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */