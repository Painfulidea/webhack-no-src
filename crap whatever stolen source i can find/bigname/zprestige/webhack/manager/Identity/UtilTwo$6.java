package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import java.io.BufferedReader;
import java.io.Closeable;

public class UtilTwo$6 extends UtilTwo$CloseOperation {
  public BufferedReader val$reader;
  
  public UtilTwo this$0;
  
  public Appendable val$appendable;
  
  public UtilTwo$6(UtilTwo this$0, Closeable closeable, boolean ignoreCloseExceptions, BufferedReader paramBufferedReader, Appendable paramAppendable) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1806239662
    //   9: l2i
    //   10: ldc -532545531
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1786652238
    //   19: l2i
    //   20: ldc -1659064634
    //   22: ixor
    //   23: ldc2_w -2041348762
    //   26: l2i
    //   27: ldc -747219851
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1929485383 -> 16, -556912968 -> 796
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1150129441
    //   66: l2i
    //   67: ldc -1435289364
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1512460637
    //   76: l2i
    //   77: ldc -1181722765
    //   79: ixor
    //   80: ldc2_w -565817424
    //   83: l2i
    //   84: ldc 240629730
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 1055872415 -> 782, 1541943158 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w 115190390
    //   126: l2i
    //   127: ldc -101762493
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 1274698632
    //   136: l2i
    //   137: ldc 1733155765
    //   139: ixor
    //   140: ldc2_w 1179539478
    //   143: l2i
    //   144: ldc 1180094580
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -879048522 -> 133, -14018473 -> 804
    //   176: putfield this$0 : Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -1800916589
    //   188: l2i
    //   189: ldc 1121555557
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -1147301460
    //   198: l2i
    //   199: ldc -1916271244
    //   201: ixor
    //   202: ldc2_w 470316058
    //   205: l2i
    //   206: ldc -12613489
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 788, -714971059 -> 236, 893802851 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w -1020108288
    //   246: l2i
    //   247: ldc -214241468
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -81473843
    //   256: l2i
    //   257: ldc 1203604355
    //   259: ixor
    //   260: ldc2_w 1319861541
    //   263: l2i
    //   264: ldc 1513886311
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 792, -1475466740 -> 296, 614457862 -> 253
    //   296: aload #4
    //   298: getstatic Perryc.0 : I
    //   301: ifle -> 314
    //   304: ldc2_w 836518705
    //   307: l2i
    //   308: ldc -1292823115
    //   310: ixor
    //   311: goto -> 321
    //   314: ldc2_w 2136743505
    //   317: l2i
    //   318: ldc 368637192
    //   320: ixor
    //   321: ldc2_w -1669234368
    //   324: l2i
    //   325: ldc 1941579890
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 356, -891460157 -> 314, 1813446582 -> 786
    //   356: putfield val$reader : Ljava/io/BufferedReader;
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w -1694626092
    //   368: l2i
    //   369: ldc -897694808
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -464285480
    //   378: l2i
    //   379: ldc -296245407
    //   381: ixor
    //   382: ldc2_w 1879748169
    //   385: l2i
    //   386: ldc 1455773862
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 798, 751550806 -> 416, 1984936851 -> 375
    //   416: aload_0
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 1456678668
    //   426: l2i
    //   427: ldc -203841976
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w -425067511
    //   436: l2i
    //   437: ldc -1959216838
    //   439: ixor
    //   440: ldc2_w -1314117246
    //   443: l2i
    //   444: ldc 2090204881
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 794, -1599565216 -> 476, 1748200983 -> 433
    //   476: aload #5
    //   478: getstatic Perryc.0 : I
    //   481: ifle -> 494
    //   484: ldc2_w -833723266
    //   487: l2i
    //   488: ldc 1686993936
    //   490: ixor
    //   491: goto -> 501
    //   494: ldc2_w -7230691
    //   497: l2i
    //   498: ldc 1076220264
    //   500: ixor
    //   501: ldc2_w -1407826789
    //   504: l2i
    //   505: ldc -47753000
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, -1033487323 -> 494, -68025299 -> 800
    //   536: putfield val$appendable : Ljava/lang/Appendable;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 555
    //   545: ldc2_w -1497297179
    //   548: l2i
    //   549: ldc 1176146764
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w -1529874570
    //   558: l2i
    //   559: ldc -1422316701
    //   561: ixor
    //   562: ldc2_w -1948914787
    //   565: l2i
    //   566: ldc 2064458865
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, 268653125 -> 802, 317141588 -> 555
    //   596: aload_0
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 613
    //   603: ldc2_w 1215775953
    //   606: l2i
    //   607: ldc 532363753
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w 1638416351
    //   616: l2i
    //   617: ldc 1962141817
    //   619: ixor
    //   620: ldc2_w -2082278815
    //   623: l2i
    //   624: ldc -1683015832
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 784, 219550383 -> 656, 1333901361 -> 613
    //   656: aload_2
    //   657: getstatic Perryc.0 : I
    //   660: ifle -> 673
    //   663: ldc2_w -585164290
    //   666: l2i
    //   667: ldc 448013848
    //   669: ixor
    //   670: goto -> 680
    //   673: ldc2_w 661940650
    //   676: l2i
    //   677: ldc -1328699416
    //   679: ixor
    //   680: ldc2_w -901699590
    //   683: l2i
    //   684: ldc -1866454041
    //   686: ixor
    //   687: ixor
    //   688: lookupswitch default -> 716, -1658178565 -> 780, 1954208665 -> 673
    //   716: iload_3
    //   717: getstatic Perryc.1 : I
    //   720: ifeq -> 733
    //   723: ldc2_w 1508068825
    //   726: l2i
    //   727: ldc -980527539
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w -1627475694
    //   736: l2i
    //   737: ldc -1007924486
    //   739: ixor
    //   740: ldc2_w -2103041230
    //   743: l2i
    //   744: ldc 751251062
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 776, -1442854929 -> 733, 839653072 -> 790
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
    //   0	780	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$6;
    //   0	780	1	this$0	Lbigname/zprestige/webhack/manager/Identity/UtilTwo;
    //   0	780	2	closeable	Ljava/io/Closeable;
    //   0	780	3	ignoreCloseExceptions	Z
  }
  
  public UtilTwo run() {
    return Perry1.0U(this, (int)330438305L ^ 0x786A4A2B);
  }
  
  public Object run() {
    return Perry1.2d(this, (int)-878196368L ^ 0xB522A54A);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */