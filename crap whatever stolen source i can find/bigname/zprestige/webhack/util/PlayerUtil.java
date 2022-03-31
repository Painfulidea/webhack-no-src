package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class PlayerUtil implements Util {
  public static JsonParser PARSER;
  
  public static int findHotbarObi() {
    return Perry1.2Z(null, (int)-392174868L ^ 0xAAAC46EC);
  }
  
  static {
    // Byte code:
    //   0: new com/google/gson/JsonParser
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 20
    //   10: ldc2_w -1162880319
    //   13: l2i
    //   14: ldc -705486115
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w 1863637661
    //   23: l2i
    //   24: ldc -691995240
    //   26: ixor
    //   27: ldc2_w -1545840038
    //   30: l2i
    //   31: ldc -73703788
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 126, -510450741 -> 60, 924581074 -> 20
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.0 : I
    //   66: ifle -> 79
    //   69: ldc2_w 1438169941
    //   72: l2i
    //   73: ldc -210446655
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w 1622156136
    //   82: l2i
    //   83: ldc -1858083755
    //   85: ixor
    //   86: ldc2_w 1514250781
    //   89: l2i
    //   90: ldc 1285323070
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 124, -1341016393 -> 79, -414049250 -> 120
    //   120: putstatic bigname/zprestige/webhack/util/PlayerUtil.PARSER : Lcom/google/gson/JsonParser;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public static List getHistoryOfNames(UUID id) {
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
  
  public static JsonElement getResources(URL url, String request) {
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
  
  public static String requestIDs(String data) {
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
  
  public static String getNameFromUUID(String uuid) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 926
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 918
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 910
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/util/PlayerUtil$lookUpName
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -2076162190
    //   37: l2i
    //   38: ldc_w -1764733930
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1145497443
    //   48: l2i
    //   49: ldc_w 1788107902
    //   52: ixor
    //   53: ldc2_w -1647648907
    //   56: l2i
    //   57: ldc_w 311497156
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1647589931 -> 891, 1108357375 -> 45
    //   88: aload_0
    //   89: getstatic Perryc.1 : I
    //   92: ifeq -> 106
    //   95: ldc2_w -704665280
    //   98: l2i
    //   99: ldc_w -5403926
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 901773219
    //   109: l2i
    //   110: ldc_w -742986351
    //   113: ixor
    //   114: ldc2_w -1322951170
    //   117: l2i
    //   118: ldc_w 143645260
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -1812421608 -> 875, 479280215 -> 106
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: goto -> 159
    //   158: athrow
    //   159: getstatic Perryc.0 : I
    //   162: ifle -> 176
    //   165: ldc2_w 1827617344
    //   168: l2i
    //   169: ldc_w -1542558520
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w 230532774
    //   179: l2i
    //   180: ldc_w -565386218
    //   183: ixor
    //   184: ldc2_w -1831852438
    //   187: l2i
    //   188: ldc_w 328308377
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 879, 1235281531 -> 176, 1387328067 -> 220
    //   220: astore_1
    //   221: new java/lang/Thread
    //   224: dup
    //   225: getstatic Perryc.c : I
    //   228: iflt -> 242
    //   231: ldc2_w -855537659
    //   234: l2i
    //   235: ldc_w -1351072083
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w 438427663
    //   245: l2i
    //   246: ldc_w 1137979797
    //   249: ixor
    //   250: ldc2_w 147280183
    //   253: l2i
    //   254: ldc_w 1811577944
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 897, 21291975 -> 242, 986250485 -> 284
    //   284: aload_1
    //   285: getstatic Perryc.0 : I
    //   288: ifle -> 302
    //   291: ldc2_w -1773071032
    //   294: l2i
    //   295: ldc_w 1772112014
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w 1112900207
    //   305: l2i
    //   306: ldc_w 2121689190
    //   309: ixor
    //   310: ldc2_w 428309778
    //   313: l2i
    //   314: ldc_w -1925144228
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 877, -1461438905 -> 344, 1798734216 -> 302
    //   344: goto -> 348
    //   347: athrow
    //   348: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   351: goto -> 355
    //   354: athrow
    //   355: getstatic Perryc.1 : I
    //   358: ifeq -> 372
    //   361: ldc2_w 1632283275
    //   364: l2i
    //   365: ldc_w -591784749
    //   368: ixor
    //   369: goto -> 380
    //   372: ldc2_w 1292148218
    //   375: l2i
    //   376: ldc_w -1157833528
    //   379: ixor
    //   380: ldc2_w 676012667
    //   383: l2i
    //   384: ldc_w 980413110
    //   387: ixor
    //   388: ixor
    //   389: lookupswitch default -> 416, -1345030507 -> 881, -352118799 -> 372
    //   416: astore_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 434
    //   423: ldc2_w -494616090
    //   426: l2i
    //   427: ldc_w 919015471
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w 1986601387
    //   437: l2i
    //   438: ldc_w -212589978
    //   441: ixor
    //   442: ldc2_w -878093786
    //   445: l2i
    //   446: ldc_w 590349317
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 476, 291662363 -> 434, 1020956650 -> 895
    //   476: aload_2
    //   477: getstatic Perryc.1 : I
    //   480: ifeq -> 494
    //   483: ldc2_w -389577795
    //   486: l2i
    //   487: ldc_w -1454875028
    //   490: ixor
    //   491: goto -> 502
    //   494: ldc2_w 752841368
    //   497: l2i
    //   498: ldc_w 553802282
    //   501: ixor
    //   502: ldc2_w -748946379
    //   505: l2i
    //   506: ldc_w 2094946233
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 536, -1908498765 -> 494, -301304227 -> 899
    //   536: goto -> 540
    //   539: athrow
    //   540: invokevirtual start : ()V
    //   543: goto -> 547
    //   546: athrow
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 934516925
    //   556: l2i
    //   557: ldc_w 1946125107
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1434696433
    //   567: l2i
    //   568: ldc_w -911451986
    //   571: ixor
    //   572: ldc2_w -987619835
    //   575: l2i
    //   576: ldc_w 1005502406
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 885, -1659061150 -> 608, -1165968819 -> 564
    //   608: aload_2
    //   609: getstatic Perryc.0 : I
    //   612: ifle -> 626
    //   615: ldc2_w 1873417960
    //   618: l2i
    //   619: ldc_w 1466592183
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w 789343694
    //   629: l2i
    //   630: ldc_w 424408086
    //   633: ixor
    //   634: ldc2_w -721967041
    //   637: l2i
    //   638: ldc_w -63360160
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, 269411840 -> 887, 307599297 -> 626
    //   668: goto -> 672
    //   671: athrow
    //   672: invokevirtual join : ()V
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w 1311409732
    //   688: l2i
    //   689: ldc_w -1132269750
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -961396642
    //   699: l2i
    //   700: ldc_w -1268793914
    //   703: ixor
    //   704: ldc2_w -63305488
    //   707: l2i
    //   708: ldc_w 1471967832
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 889, -647264464 -> 740, 1496191910 -> 696
    //   740: aload_1
    //   741: getstatic Perryc.c : I
    //   744: iflt -> 758
    //   747: ldc2_w 1752021671
    //   750: l2i
    //   751: ldc_w -538273847
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w 1870993439
    //   761: l2i
    //   762: ldc_w 1127590374
    //   765: ixor
    //   766: ldc2_w -385037499
    //   769: l2i
    //   770: ldc_w 1988198927
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 893, -1287784269 -> 800, 671769636 -> 758
    //   800: goto -> 804
    //   803: athrow
    //   804: invokevirtual getName : ()Ljava/lang/String;
    //   807: goto -> 811
    //   810: athrow
    //   811: areturn
    //   812: getstatic Perryc.0 : I
    //   815: ifle -> 829
    //   818: ldc2_w 181945258
    //   821: l2i
    //   822: ldc_w 213239470
    //   825: ixor
    //   826: goto -> 837
    //   829: ldc2_w -1567664454
    //   832: l2i
    //   833: ldc_w -1272259414
    //   836: ixor
    //   837: ldc2_w -181707189
    //   840: l2i
    //   841: ldc_w 317290973
    //   844: ixor
    //   845: ixor
    //   846: lookupswitch default -> 872, -1339954092 -> 829, -508583278 -> 883
    //   872: astore_1
    //   873: aconst_null
    //   874: areturn
    //   875: aconst_null
    //   876: athrow
    //   877: aconst_null
    //   878: athrow
    //   879: aconst_null
    //   880: athrow
    //   881: aconst_null
    //   882: athrow
    //   883: aconst_null
    //   884: athrow
    //   885: aconst_null
    //   886: athrow
    //   887: aconst_null
    //   888: athrow
    //   889: aconst_null
    //   890: athrow
    //   891: aconst_null
    //   892: athrow
    //   893: aconst_null
    //   894: athrow
    //   895: aconst_null
    //   896: athrow
    //   897: aconst_null
    //   898: athrow
    //   899: aconst_null
    //   900: athrow
    //   901: pop
    //   902: goto -> 24
    //   905: pop
    //   906: aconst_null
    //   907: goto -> 901
    //   910: dup
    //   911: ifnull -> 901
    //   914: checkcast java/lang/Throwable
    //   917: athrow
    //   918: dup
    //   919: ifnull -> 905
    //   922: checkcast java/lang/Throwable
    //   925: athrow
    //   926: aconst_null
    //   927: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   221	591	1	process	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpName;
    //   417	395	2	thread	Ljava/lang/Thread;
    //   873	2	1	e	Ljava/lang/Exception;
    //   24	851	0	uuid	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	910	finally
    //   24	151	812	java/lang/Exception
    //   152	158	158	finally
    //   152	158	158	finally
    //   152	158	158	java/lang/ArrayIndexOutOfBoundsException
    //   152	158	158	finally
    //   152	158	158	finally
    //   152	539	812	java/lang/Exception
    //   347	354	354	finally
    //   347	354	347	finally
    //   347	354	3	finally
    //   348	354	347	finally
    //   348	354	3	finally
    //   540	546	546	finally
    //   540	546	3	finally
    //   540	546	3	java/lang/NegativeArraySizeException
    //   540	546	3	java/lang/IllegalArgumentException
    //   540	546	546	finally
    //   540	803	812	java/lang/Exception
    //   671	678	678	finally
    //   671	678	678	java/lang/EnumConstantNotPresentException
    //   671	678	671	java/lang/UnsupportedOperationException
    //   672	678	678	java/lang/IllegalStateException
    //   672	678	3	java/lang/AssertionError
    //   804	810	810	finally
    //   804	810	810	finally
    //   804	810	810	java/lang/NegativeArraySizeException
    //   804	810	3	finally
    //   804	810	3	java/lang/ArrayIndexOutOfBoundsException
    //   804	811	812	java/lang/Exception
    //   910	918	910	finally
    //   926	928	3	finally
  }
  
  public static String getNameFromUUID(UUID uuid) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 926
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 918
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 910
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new bigname/zprestige/webhack/util/PlayerUtil$lookUpName
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 45
    //   34: ldc2_w -115975916
    //   37: l2i
    //   38: ldc_w -1909481536
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 299079761
    //   48: l2i
    //   49: ldc_w -162177952
    //   52: ixor
    //   53: ldc2_w 1021885867
    //   56: l2i
    //   57: ldc_w -2049948876
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 875, -838780853 -> 45, 1589525166 -> 88
    //   88: aload_0
    //   89: getstatic Perryc.c : I
    //   92: iflt -> 106
    //   95: ldc2_w -604276907
    //   98: l2i
    //   99: ldc_w 1538649969
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 665371182
    //   109: l2i
    //   110: ldc_w -657399976
    //   113: ixor
    //   114: ldc2_w 672666551
    //   117: l2i
    //   118: ldc_w -240901981
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, 1388543564 -> 106, 1509075760 -> 897
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : (Ljava/util/UUID;)V
    //   155: goto -> 159
    //   158: athrow
    //   159: getstatic Perryc.0 : I
    //   162: ifle -> 176
    //   165: ldc2_w -1343107525
    //   168: l2i
    //   169: ldc_w -1484164606
    //   172: ixor
    //   173: goto -> 184
    //   176: ldc2_w -622622545
    //   179: l2i
    //   180: ldc_w -2061127138
    //   183: ixor
    //   184: ldc2_w -1789090526
    //   187: l2i
    //   188: ldc_w -1526668510
    //   191: ixor
    //   192: ixor
    //   193: lookupswitch default -> 889, 941947449 -> 176, 1872395441 -> 220
    //   220: astore_1
    //   221: new java/lang/Thread
    //   224: dup
    //   225: getstatic Perryc.0 : I
    //   228: ifle -> 242
    //   231: ldc2_w 2010385241
    //   234: l2i
    //   235: ldc_w -1490140374
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w 1804807538
    //   245: l2i
    //   246: ldc_w 403161645
    //   249: ixor
    //   250: ldc2_w 1938872859
    //   253: l2i
    //   254: ldc_w -1064535936
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 284, -1542565232 -> 242, 1676077800 -> 899
    //   284: aload_1
    //   285: getstatic Perryc.c : I
    //   288: iflt -> 302
    //   291: ldc2_w 128598743
    //   294: l2i
    //   295: ldc_w 252905689
    //   298: ixor
    //   299: goto -> 310
    //   302: ldc2_w -691457268
    //   305: l2i
    //   306: ldc_w 568273576
    //   309: ixor
    //   310: ldc2_w 2143104327
    //   313: l2i
    //   314: ldc_w 712341611
    //   317: ixor
    //   318: ixor
    //   319: lookupswitch default -> 883, -1562489720 -> 344, 1567694626 -> 302
    //   344: goto -> 348
    //   347: athrow
    //   348: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   351: goto -> 355
    //   354: athrow
    //   355: getstatic Perryc.0 : I
    //   358: ifle -> 372
    //   361: ldc2_w 404549474
    //   364: l2i
    //   365: ldc_w -593785960
    //   368: ixor
    //   369: goto -> 380
    //   372: ldc2_w 1984974661
    //   375: l2i
    //   376: ldc_w 124527820
    //   379: ixor
    //   380: ldc2_w -1998006635
    //   383: l2i
    //   384: ldc_w -1255006597
    //   387: ixor
    //   388: ixor
    //   389: lookupswitch default -> 891, -111301612 -> 372, 1290183527 -> 416
    //   416: astore_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 434
    //   423: ldc2_w -1065478871
    //   426: l2i
    //   427: ldc_w 1552225256
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w -1466070750
    //   437: l2i
    //   438: ldc_w -409639074
    //   441: ixor
    //   442: ldc2_w 938083875
    //   445: l2i
    //   446: ldc_w -972073979
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 476, 1830704359 -> 877, 2023636475 -> 434
    //   476: aload_2
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 494
    //   483: ldc2_w 2014694284
    //   486: l2i
    //   487: ldc_w -366128629
    //   490: ixor
    //   491: goto -> 502
    //   494: ldc2_w -1811573577
    //   497: l2i
    //   498: ldc_w 1722273439
    //   501: ixor
    //   502: ldc2_w -577976907
    //   505: l2i
    //   506: ldc_w 761604804
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 887, 38516057 -> 536, 1657894646 -> 494
    //   536: goto -> 540
    //   539: athrow
    //   540: invokevirtual start : ()V
    //   543: goto -> 547
    //   546: athrow
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 1328854310
    //   556: l2i
    //   557: ldc_w -56651800
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 675888845
    //   567: l2i
    //   568: ldc_w 1146181060
    //   571: ixor
    //   572: ldc2_w 1968520607
    //   575: l2i
    //   576: ldc_w -215811793
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -242453116 -> 564, 903675518 -> 893
    //   608: aload_2
    //   609: getstatic Perryc.1 : I
    //   612: ifeq -> 626
    //   615: ldc2_w -1519403838
    //   618: l2i
    //   619: ldc_w 29673983
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w -478360505
    //   629: l2i
    //   630: ldc_w 1069365878
    //   633: ixor
    //   634: ldc2_w -1916692507
    //   637: l2i
    //   638: ldc_w 61305892
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 895, 718116604 -> 626, 1386681840 -> 668
    //   668: goto -> 672
    //   671: athrow
    //   672: invokevirtual join : ()V
    //   675: goto -> 679
    //   678: athrow
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w -1673754389
    //   688: l2i
    //   689: ldc_w 993019339
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 1555718333
    //   699: l2i
    //   700: ldc_w -1726423611
    //   703: ixor
    //   704: ldc2_w -410596738
    //   707: l2i
    //   708: ldc_w -1557229285
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 885, -2129992163 -> 740, -475752891 -> 696
    //   740: aload_1
    //   741: getstatic Perryc.c : I
    //   744: iflt -> 758
    //   747: ldc2_w 1251590083
    //   750: l2i
    //   751: ldc_w -1830229974
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w -894258926
    //   761: l2i
    //   762: ldc_w -994067049
    //   765: ixor
    //   766: ldc2_w 2082638774
    //   769: l2i
    //   770: ldc_w -7529196
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 879, -1918723545 -> 800, 1541325131 -> 758
    //   800: goto -> 804
    //   803: athrow
    //   804: invokevirtual getName : ()Ljava/lang/String;
    //   807: goto -> 811
    //   810: athrow
    //   811: areturn
    //   812: getstatic Perryc.0 : I
    //   815: ifle -> 829
    //   818: ldc2_w -821068243
    //   821: l2i
    //   822: ldc_w 246020237
    //   825: ixor
    //   826: goto -> 837
    //   829: ldc2_w 414989033
    //   832: l2i
    //   833: ldc_w 5677087
    //   836: ixor
    //   837: ldc2_w -386781631
    //   840: l2i
    //   841: ldc_w 1098696323
    //   844: ixor
    //   845: ixor
    //   846: lookupswitch default -> 872, 255087636 -> 829, 1747480162 -> 881
    //   872: astore_1
    //   873: aconst_null
    //   874: areturn
    //   875: aconst_null
    //   876: athrow
    //   877: aconst_null
    //   878: athrow
    //   879: aconst_null
    //   880: athrow
    //   881: aconst_null
    //   882: athrow
    //   883: aconst_null
    //   884: athrow
    //   885: aconst_null
    //   886: athrow
    //   887: aconst_null
    //   888: athrow
    //   889: aconst_null
    //   890: athrow
    //   891: aconst_null
    //   892: athrow
    //   893: aconst_null
    //   894: athrow
    //   895: aconst_null
    //   896: athrow
    //   897: aconst_null
    //   898: athrow
    //   899: aconst_null
    //   900: athrow
    //   901: pop
    //   902: goto -> 24
    //   905: pop
    //   906: aconst_null
    //   907: goto -> 901
    //   910: dup
    //   911: ifnull -> 901
    //   914: checkcast java/lang/Throwable
    //   917: athrow
    //   918: dup
    //   919: ifnull -> 905
    //   922: checkcast java/lang/Throwable
    //   925: athrow
    //   926: aconst_null
    //   927: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   221	591	1	process	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpName;
    //   417	395	2	thread	Ljava/lang/Thread;
    //   873	2	1	e	Ljava/lang/Exception;
    //   24	851	0	uuid	Ljava/util/UUID;
    // Exception table:
    //   from	to	target	type
    //   8	20	910	java/util/NoSuchElementException
    //   24	803	812	java/lang/Exception
    //   151	158	158	finally
    //   151	158	158	finally
    //   152	158	151	finally
    //   152	158	151	finally
    //   152	158	3	finally
    //   347	354	354	finally
    //   347	354	347	java/lang/ArithmeticException
    //   347	354	3	finally
    //   348	354	354	finally
    //   348	354	3	java/lang/StringIndexOutOfBoundsException
    //   539	546	546	finally
    //   539	546	546	finally
    //   539	546	3	finally
    //   540	546	539	java/lang/IllegalStateException
    //   540	546	539	finally
    //   671	678	678	finally
    //   671	678	678	java/lang/RuntimeException
    //   671	678	671	java/lang/IllegalStateException
    //   672	678	671	finally
    //   672	678	671	finally
    //   804	810	810	finally
    //   804	810	3	finally
    //   804	810	810	finally
    //   804	810	3	java/lang/ArithmeticException
    //   804	810	810	finally
    //   804	811	812	java/lang/Exception
    //   910	918	910	finally
    //   926	928	3	java/lang/IllegalStateException
  }
  
  public static JsonElement getResources(URL url, String request, JsonElement element) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4330
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 4322
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4314
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: aconst_null
    //   25: getstatic Perryc.c : I
    //   28: iflt -> 42
    //   31: ldc2_w 136666187
    //   34: l2i
    //   35: ldc_w 1271605613
    //   38: ixor
    //   39: goto -> 50
    //   42: ldc2_w -1347957634
    //   45: l2i
    //   46: ldc_w -1966784741
    //   49: ixor
    //   50: ldc2_w 1115477643
    //   53: l2i
    //   54: ldc_w -1163400256
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1154135955 -> 4287, 1631220846 -> 42
    //   84: astore_3
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 298693302
    //   94: l2i
    //   95: ldc_w 727307181
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 990082065
    //   105: l2i
    //   106: ldc_w 1202892029
    //   109: ixor
    //   110: ldc2_w -436561465
    //   113: l2i
    //   114: ldc_w 1444171064
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 4203, -1988446748 -> 102, -815854573 -> 144
    //   144: aload_0
    //   145: getstatic Perryc.1 : I
    //   148: ifeq -> 162
    //   151: ldc2_w 1016285940
    //   154: l2i
    //   155: ldc_w 1859759705
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 593536168
    //   165: l2i
    //   166: ldc_w -463036086
    //   169: ixor
    //   170: ldc2_w 366889128
    //   173: l2i
    //   174: ldc_w -1220713706
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 204, -257306861 -> 4211, 1111142846 -> 162
    //   204: goto -> 208
    //   207: athrow
    //   208: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   211: goto -> 215
    //   214: athrow
    //   215: checkcast javax/net/ssl/HttpsURLConnection
    //   218: getstatic Perryc.1 : I
    //   221: ifeq -> 235
    //   224: ldc2_w -1379337744
    //   227: l2i
    //   228: ldc_w -917666848
    //   231: ixor
    //   232: goto -> 243
    //   235: ldc2_w 16894476
    //   238: l2i
    //   239: ldc_w -217003294
    //   242: ixor
    //   243: ldc2_w -2045244544
    //   246: l2i
    //   247: ldc_w -538952775
    //   250: ixor
    //   251: ixor
    //   252: lookupswitch default -> 4253, -1410780969 -> 280, 1031621161 -> 235
    //   280: astore_3
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 298
    //   287: ldc2_w 683599242
    //   290: l2i
    //   291: ldc_w -1299037924
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 1766067075
    //   301: l2i
    //   302: ldc_w 2023194167
    //   305: ixor
    //   306: ldc2_w -1659599467
    //   309: l2i
    //   310: ldc_w -1004068760
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, -1636524127 -> 298, -1021378197 -> 4235
    //   340: aload_3
    //   341: ldc2_w 618437501
    //   344: l2i
    //   345: ldc_w 618437500
    //   348: ixor
    //   349: getstatic Perryc.1 : I
    //   352: ifeq -> 366
    //   355: ldc2_w 1728800669
    //   358: l2i
    //   359: ldc_w 493097509
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w -1436487823
    //   369: l2i
    //   370: ldc_w -1254475557
    //   373: ixor
    //   374: ldc2_w -234719345
    //   377: l2i
    //   378: ldc_w 280673136
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 408, -1730692793 -> 4243, -657270838 -> 366
    //   408: goto -> 412
    //   411: athrow
    //   412: invokevirtual setDoOutput : (Z)V
    //   415: goto -> 419
    //   418: athrow
    //   419: getstatic Perryc.c : I
    //   422: iflt -> 436
    //   425: ldc2_w 571183409
    //   428: l2i
    //   429: ldc_w -970621297
    //   432: ixor
    //   433: goto -> 444
    //   436: ldc2_w -1893604020
    //   439: l2i
    //   440: ldc_w 219954675
    //   443: ixor
    //   444: ldc2_w -453575841
    //   447: l2i
    //   448: ldc_w 832169274
    //   451: ixor
    //   452: ixor
    //   453: lookupswitch default -> 480, -1409919568 -> 436, 826405339 -> 4299
    //   480: aload_3
    //   481: getstatic Perryc.1 : I
    //   484: ifeq -> 498
    //   487: ldc2_w -567774495
    //   490: l2i
    //   491: ldc_w -1832657544
    //   494: ixor
    //   495: goto -> 506
    //   498: ldc2_w 174154843
    //   501: l2i
    //   502: ldc_w 566225534
    //   505: ixor
    //   506: ldc2_w -1660638323
    //   509: l2i
    //   510: ldc_w 1517400939
    //   513: ixor
    //   514: ixor
    //   515: lookupswitch default -> 540, -1952532609 -> 4279, 89164855 -> 498
    //   540: aload_1
    //   541: getstatic Perryc.c : I
    //   544: iflt -> 558
    //   547: ldc2_w -1293730568
    //   550: l2i
    //   551: ldc_w -799127955
    //   554: ixor
    //   555: goto -> 566
    //   558: ldc2_w -2053824256
    //   561: l2i
    //   562: ldc_w -1676321165
    //   565: ixor
    //   566: ldc2_w -1524466115
    //   569: l2i
    //   570: ldc_w 347347473
    //   573: ixor
    //   574: ixor
    //   575: lookupswitch default -> 4239, -1474946209 -> 600, -752148807 -> 558
    //   600: goto -> 604
    //   603: athrow
    //   604: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   607: goto -> 611
    //   610: athrow
    //   611: getstatic Perryc.c : I
    //   614: iflt -> 628
    //   617: ldc2_w 601348320
    //   620: l2i
    //   621: ldc_w 376299121
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w -1048157213
    //   631: l2i
    //   632: ldc_w -1780163654
    //   635: ixor
    //   636: ldc2_w -25445648
    //   639: l2i
    //   640: ldc_w -1076216317
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 4207, 365116586 -> 672, 1947959906 -> 628
    //   672: aload_3
    //   673: ldc_w '쓧㌜쒠Ⴞ蔣⩶๭뤤ꍊ?簏ਢ'
    //   676: getstatic Perryc.c : I
    //   679: iflt -> 693
    //   682: ldc2_w 618492227
    //   685: l2i
    //   686: ldc_w -1416385034
    //   689: ixor
    //   690: goto -> 701
    //   693: ldc2_w 1402266140
    //   696: l2i
    //   697: ldc_w -2072129560
    //   700: ixor
    //   701: ldc2_w 1702438351
    //   704: l2i
    //   705: ldc_w 1178172962
    //   708: ixor
    //   709: ixor
    //   710: lookupswitch default -> 4229, -1408333992 -> 693, -190220775 -> 736
    //   736: goto -> 740
    //   739: athrow
    //   740: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   743: goto -> 747
    //   746: athrow
    //   747: ldc_w '쓅㌃쒾Ⴆ蔯⩻๸륽ꍷ?簑੨ख屯崡妯'
    //   750: getstatic Perryc.0 : I
    //   753: ifle -> 767
    //   756: ldc2_w 125492235
    //   759: l2i
    //   760: ldc_w 467717106
    //   763: ixor
    //   764: goto -> 775
    //   767: ldc2_w 1220503044
    //   770: l2i
    //   771: ldc_w 538026386
    //   774: ixor
    //   775: ldc2_w 35638104
    //   778: l2i
    //   779: ldc_w 1707057178
    //   782: ixor
    //   783: ixor
    //   784: lookupswitch default -> 812, -188475570 -> 767, 2067430587 -> 4259
    //   812: goto -> 816
    //   815: athrow
    //   816: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   819: goto -> 823
    //   822: athrow
    //   823: getstatic Perryc.c : I
    //   826: iflt -> 840
    //   829: ldc2_w 258640161
    //   832: l2i
    //   833: ldc_w -482937888
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w -872935904
    //   843: l2i
    //   844: ldc_w -1709354229
    //   847: ixor
    //   848: ldc2_w 1179951478
    //   851: l2i
    //   852: ldc_w 422197983
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 884, -1289559704 -> 4189, -693674734 -> 840
    //   884: goto -> 888
    //   887: athrow
    //   888: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   891: goto -> 895
    //   894: athrow
    //   895: getstatic Perryc.c : I
    //   898: iflt -> 912
    //   901: ldc2_w 397468236
    //   904: l2i
    //   905: ldc_w -1526157519
    //   908: ixor
    //   909: goto -> 920
    //   912: ldc2_w 1454862281
    //   915: l2i
    //   916: ldc_w -1641358788
    //   919: ixor
    //   920: ldc2_w 1027984126
    //   923: l2i
    //   924: ldc_w 601415951
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 956, -1406835060 -> 4241, -555387484 -> 912
    //   956: aload_2
    //   957: ifnull -> 971
    //   960: ldc2_w -566012072
    //   963: l2i
    //   964: ldc_w -714250036
    //   967: ixor
    //   968: goto -> 979
    //   971: ldc2_w 438462184
    //   974: l2i
    //   975: ldc_w 286022015
    //   978: ixor
    //   979: ldc2_w -1058054510
    //   982: l2i
    //   983: ldc_w -1391751817
    //   986: ixor
    //   987: ixor
    //   988: tableswitch default -> 960, 1724574833 -> 1012, 1724574834 -> 1751
    //   1012: new java/io/DataOutputStream
    //   1015: dup
    //   1016: getstatic Perryc.0 : I
    //   1019: ifle -> 1033
    //   1022: ldc2_w 443891960
    //   1025: l2i
    //   1026: ldc_w -99888487
    //   1029: ixor
    //   1030: goto -> 1041
    //   1033: ldc2_w 577254067
    //   1036: l2i
    //   1037: ldc_w -541838187
    //   1040: ixor
    //   1041: ldc2_w 2013012808
    //   1044: l2i
    //   1045: ldc_w 56864228
    //   1048: ixor
    //   1049: ixor
    //   1050: lookupswitch default -> 1076, -1797186355 -> 4237, -129725320 -> 1033
    //   1076: aload_3
    //   1077: getstatic Perryc.0 : I
    //   1080: ifle -> 1094
    //   1083: ldc2_w -1386871797
    //   1086: l2i
    //   1087: ldc_w -1050419914
    //   1090: ixor
    //   1091: goto -> 1102
    //   1094: ldc2_w 482428236
    //   1097: l2i
    //   1098: ldc_w -1421912550
    //   1101: ixor
    //   1102: ldc2_w 426121798
    //   1105: l2i
    //   1106: ldc_w 1448399964
    //   1109: ixor
    //   1110: ixor
    //   1111: lookupswitch default -> 1136, -10251860 -> 1094, 587667239 -> 4209
    //   1136: goto -> 1140
    //   1139: athrow
    //   1140: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   1143: goto -> 1147
    //   1146: athrow
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w 454542952
    //   1156: l2i
    //   1157: ldc_w 422844954
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 43071956
    //   1167: l2i
    //   1168: ldc_w -1289575443
    //   1171: ixor
    //   1172: ldc2_w 486856502
    //   1175: l2i
    //   1176: ldc_w 1790480925
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -1534385885 -> 1164, 1973393753 -> 4257
    //   1208: goto -> 1212
    //   1211: athrow
    //   1212: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   1215: goto -> 1219
    //   1218: athrow
    //   1219: getstatic Perryc.1 : I
    //   1222: ifeq -> 1236
    //   1225: ldc2_w -299673431
    //   1228: l2i
    //   1229: ldc_w -1279560867
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -455736241
    //   1239: l2i
    //   1240: ldc_w 1713790665
    //   1243: ixor
    //   1244: ldc2_w 332534925
    //   1247: l2i
    //   1248: ldc_w -321922022
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 4191, -1568283805 -> 1236, 2112721425 -> 1280
    //   1280: astore #4
    //   1282: getstatic Perryc.c : I
    //   1285: iflt -> 1299
    //   1288: ldc2_w -252971348
    //   1291: l2i
    //   1292: ldc_w 119712784
    //   1295: ixor
    //   1296: goto -> 1307
    //   1299: ldc2_w -574327533
    //   1302: l2i
    //   1303: ldc_w 332230667
    //   1306: ixor
    //   1307: ldc2_w -328771794
    //   1310: l2i
    //   1311: ldc_w -487139848
    //   1314: ixor
    //   1315: ixor
    //   1316: lookupswitch default -> 1344, -2016564296 -> 1299, -111617942 -> 4219
    //   1344: aload #4
    //   1346: getstatic Perryc.1 : I
    //   1349: ifeq -> 1363
    //   1352: ldc2_w 1862887230
    //   1355: l2i
    //   1356: ldc_w -88670698
    //   1359: ixor
    //   1360: goto -> 1371
    //   1363: ldc2_w -304019583
    //   1366: l2i
    //   1367: ldc_w 681802305
    //   1370: ixor
    //   1371: ldc2_w 1414722314
    //   1374: l2i
    //   1375: ldc_w 1839564974
    //   1378: ixor
    //   1379: ixor
    //   1380: lookupswitch default -> 4245, -1404509556 -> 1363, -55245212 -> 1408
    //   1408: getstatic net/minecraft/advancements/AdvancementManager.field_192783_b : Lcom/google/gson/Gson;
    //   1411: getstatic Perryc.1 : I
    //   1414: ifeq -> 1428
    //   1417: ldc2_w 891525069
    //   1420: l2i
    //   1421: ldc_w 805959207
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w -1006059748
    //   1431: l2i
    //   1432: ldc_w 42160924
    //   1435: ixor
    //   1436: ldc2_w -1636259245
    //   1439: l2i
    //   1440: ldc_w -1358620516
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 1472, -1884841156 -> 1428, 878170917 -> 4265
    //   1472: aload_2
    //   1473: getstatic Perryc.1 : I
    //   1476: ifeq -> 1490
    //   1479: ldc2_w 2132010977
    //   1482: l2i
    //   1483: ldc_w 884041606
    //   1486: ixor
    //   1487: goto -> 1498
    //   1490: ldc2_w 36717190
    //   1493: l2i
    //   1494: ldc_w -1818591777
    //   1497: ixor
    //   1498: ldc2_w -1371346487
    //   1501: l2i
    //   1502: ldc_w 1676471732
    //   1505: ixor
    //   1506: ixor
    //   1507: lookupswitch default -> 4213, -2046000102 -> 1490, 1543781156 -> 1532
    //   1532: goto -> 1536
    //   1535: athrow
    //   1536: invokevirtual toJson : (Lcom/google/gson/JsonElement;)Ljava/lang/String;
    //   1539: goto -> 1543
    //   1542: athrow
    //   1543: getstatic Perryc.0 : I
    //   1546: ifle -> 1560
    //   1549: ldc2_w -1765438560
    //   1552: l2i
    //   1553: ldc_w 1876416114
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w -1892102129
    //   1563: l2i
    //   1564: ldc_w -803883585
    //   1567: ixor
    //   1568: ldc2_w -804707481
    //   1571: l2i
    //   1572: ldc_w -211623305
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 1604, -629564222 -> 4231, 972762262 -> 1560
    //   1604: goto -> 1608
    //   1607: athrow
    //   1608: invokevirtual writeBytes : (Ljava/lang/String;)V
    //   1611: goto -> 1615
    //   1614: athrow
    //   1615: getstatic Perryc.1 : I
    //   1618: ifeq -> 1632
    //   1621: ldc2_w -2066119943
    //   1624: l2i
    //   1625: ldc_w -1207915647
    //   1628: ixor
    //   1629: goto -> 1640
    //   1632: ldc2_w -599948946
    //   1635: l2i
    //   1636: ldc_w 1856429599
    //   1639: ixor
    //   1640: ldc2_w -1850717603
    //   1643: l2i
    //   1644: ldc_w -1044726375
    //   1647: ixor
    //   1648: ixor
    //   1649: lookupswitch default -> 1676, 965954031 -> 1632, 1825824444 -> 4289
    //   1676: aload #4
    //   1678: getstatic Perryc.c : I
    //   1681: iflt -> 1695
    //   1684: ldc2_w 1181429380
    //   1687: l2i
    //   1688: ldc_w -1263682621
    //   1691: ixor
    //   1692: goto -> 1703
    //   1695: ldc2_w 192262728
    //   1698: l2i
    //   1699: ldc_w 521756846
    //   1702: ixor
    //   1703: ldc2_w -1107631055
    //   1706: l2i
    //   1707: ldc_w -1971852283
    //   1710: ixor
    //   1711: ixor
    //   1712: lookupswitch default -> 4267, -984900237 -> 1695, 602004178 -> 1740
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual close : ()V
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: new java/util/Scanner
    //   1754: dup
    //   1755: getstatic Perryc.1 : I
    //   1758: ifeq -> 1772
    //   1761: ldc2_w 642307906
    //   1764: l2i
    //   1765: ldc_w 2090939372
    //   1768: ixor
    //   1769: goto -> 1780
    //   1772: ldc2_w -195836730
    //   1775: l2i
    //   1776: ldc_w 1257590160
    //   1779: ixor
    //   1780: ldc2_w 2076520659
    //   1783: l2i
    //   1784: ldc_w 886038084
    //   1787: ixor
    //   1788: ixor
    //   1789: lookupswitch default -> 1816, 367200825 -> 4215, 989691479 -> 1772
    //   1816: aload_3
    //   1817: getstatic Perryc.0 : I
    //   1820: ifle -> 1834
    //   1823: ldc2_w -243919306
    //   1826: l2i
    //   1827: ldc_w 2124274084
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w -593170075
    //   1837: l2i
    //   1838: ldc_w -1212832751
    //   1841: ixor
    //   1842: ldc2_w 299349338
    //   1845: l2i
    //   1846: ldc_w -268192557
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 1876, -527026336 -> 1834, 1849675291 -> 4205
    //   1876: goto -> 1880
    //   1879: athrow
    //   1880: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   1883: goto -> 1887
    //   1886: athrow
    //   1887: getstatic Perryc.c : I
    //   1890: iflt -> 1904
    //   1893: ldc2_w -1850036957
    //   1896: l2i
    //   1897: ldc_w -244300297
    //   1900: ixor
    //   1901: goto -> 1912
    //   1904: ldc2_w -695022633
    //   1907: l2i
    //   1908: ldc_w -305170055
    //   1911: ixor
    //   1912: ldc2_w 783855008
    //   1915: l2i
    //   1916: ldc_w -1601323701
    //   1919: ixor
    //   1920: ixor
    //   1921: lookupswitch default -> 1948, -285214657 -> 4201, 1633535263 -> 1904
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokespecial <init> : (Ljava/io/InputStream;)V
    //   1955: goto -> 1959
    //   1958: athrow
    //   1959: getstatic Perryc.1 : I
    //   1962: ifeq -> 1976
    //   1965: ldc2_w -341830906
    //   1968: l2i
    //   1969: ldc_w 1619160232
    //   1972: ixor
    //   1973: goto -> 1984
    //   1976: ldc2_w 1618462351
    //   1979: l2i
    //   1980: ldc_w -1749724457
    //   1983: ixor
    //   1984: ldc2_w 144921589
    //   1987: l2i
    //   1988: ldc_w 905201941
    //   1991: ixor
    //   1992: ixor
    //   1993: lookupswitch default -> 2020, -1233820338 -> 4281, 978214311 -> 1976
    //   2020: astore #4
    //   2022: new java/lang/StringBuilder
    //   2025: dup
    //   2026: getstatic Perryc.c : I
    //   2029: iflt -> 2043
    //   2032: ldc2_w 1847763420
    //   2035: l2i
    //   2036: ldc_w 1421522744
    //   2039: ixor
    //   2040: goto -> 2051
    //   2043: ldc2_w -1014690997
    //   2046: l2i
    //   2047: ldc_w -560233626
    //   2050: ixor
    //   2051: ldc2_w 1083237791
    //   2054: l2i
    //   2055: ldc_w -1080618703
    //   2058: ixor
    //   2059: ixor
    //   2060: lookupswitch default -> 2088, -979377590 -> 4295, 634822165 -> 2043
    //   2088: goto -> 2092
    //   2091: athrow
    //   2092: invokespecial <init> : ()V
    //   2095: goto -> 2099
    //   2098: athrow
    //   2099: getstatic Perryc.1 : I
    //   2102: ifeq -> 2116
    //   2105: ldc2_w 37921696
    //   2108: l2i
    //   2109: ldc_w -82878591
    //   2112: ixor
    //   2113: goto -> 2124
    //   2116: ldc2_w -402025008
    //   2119: l2i
    //   2120: ldc_w -1361593471
    //   2123: ixor
    //   2124: ldc2_w -1527878547
    //   2127: l2i
    //   2128: ldc_w 1777466544
    //   2131: ixor
    //   2132: ixor
    //   2133: lookupswitch default -> 4195, -1950237044 -> 2160, 877817084 -> 2116
    //   2160: astore #5
    //   2162: getstatic Perryc.c : I
    //   2165: iflt -> 2179
    //   2168: ldc2_w 1460308637
    //   2171: l2i
    //   2172: ldc_w 1252084665
    //   2175: ixor
    //   2176: goto -> 2187
    //   2179: ldc2_w 1365569688
    //   2182: l2i
    //   2183: ldc_w -1898352450
    //   2186: ixor
    //   2187: ldc2_w 1040040665
    //   2190: l2i
    //   2191: ldc_w -574479109
    //   2194: ixor
    //   2195: ixor
    //   2196: lookupswitch default -> 4247, -40622330 -> 2179, 1065510404 -> 2224
    //   2224: aload #4
    //   2226: getstatic Perryc.1 : I
    //   2229: ifeq -> 2243
    //   2232: ldc2_w 466389984
    //   2235: l2i
    //   2236: ldc_w -743900373
    //   2239: ixor
    //   2240: goto -> 2251
    //   2243: ldc2_w 563715205
    //   2246: l2i
    //   2247: ldc_w -1567836514
    //   2250: ixor
    //   2251: ldc2_w 1436817065
    //   2254: l2i
    //   2255: ldc_w 1532743197
    //   2258: ixor
    //   2259: ixor
    //   2260: lookupswitch default -> 2288, -962877313 -> 4303, -372846064 -> 2243
    //   2288: goto -> 2292
    //   2291: athrow
    //   2292: invokevirtual hasNextLine : ()Z
    //   2295: goto -> 2299
    //   2298: athrow
    //   2299: ifeq -> 2313
    //   2302: ldc2_w 1226318211
    //   2305: l2i
    //   2306: ldc_w -25228555
    //   2309: ixor
    //   2310: goto -> 2321
    //   2313: ldc2_w -224773184
    //   2316: l2i
    //   2317: ldc_w 1174212791
    //   2320: ixor
    //   2321: ldc2_w -541834472
    //   2324: l2i
    //   2325: ldc_w 2068074932
    //   2328: ixor
    //   2329: ixor
    //   2330: tableswitch default -> 2302, 328677850 -> 2352, 328677851 -> 2771
    //   2352: getstatic Perryc.0 : I
    //   2355: ifle -> 2369
    //   2358: ldc2_w -782868892
    //   2361: l2i
    //   2362: ldc_w -1642561789
    //   2365: ixor
    //   2366: goto -> 2377
    //   2369: ldc2_w -1327640753
    //   2372: l2i
    //   2373: ldc_w -1099293325
    //   2376: ixor
    //   2377: ldc2_w -1277658359
    //   2380: l2i
    //   2381: ldc_w 1574100407
    //   2384: ixor
    //   2385: ixor
    //   2386: lookupswitch default -> 2412, -1929426647 -> 2369, -1589344295 -> 4271
    //   2412: aload #5
    //   2414: getstatic Perryc.1 : I
    //   2417: ifeq -> 2431
    //   2420: ldc2_w -1132660301
    //   2423: l2i
    //   2424: ldc_w 2083219567
    //   2427: ixor
    //   2428: goto -> 2439
    //   2431: ldc2_w -876543949
    //   2434: l2i
    //   2435: ldc_w -311090236
    //   2438: ixor
    //   2439: ldc2_w 537111428
    //   2442: l2i
    //   2443: ldc_w -1050483885
    //   2446: ixor
    //   2447: ixor
    //   2448: lookupswitch default -> 2476, -478215941 -> 2431, 557242635 -> 4223
    //   2476: aload #4
    //   2478: getstatic Perryc.1 : I
    //   2481: ifeq -> 2495
    //   2484: ldc2_w 2033427431
    //   2487: l2i
    //   2488: ldc_w -768716916
    //   2491: ixor
    //   2492: goto -> 2503
    //   2495: ldc2_w 1105825212
    //   2498: l2i
    //   2499: ldc_w 1075264344
    //   2502: ixor
    //   2503: ldc2_w -1064055683
    //   2506: l2i
    //   2507: ldc_w 328371375
    //   2510: ixor
    //   2511: ixor
    //   2512: lookupswitch default -> 4275, -754977226 -> 2540, 2015145145 -> 2495
    //   2540: goto -> 2544
    //   2543: athrow
    //   2544: invokevirtual nextLine : ()Ljava/lang/String;
    //   2547: goto -> 2551
    //   2550: athrow
    //   2551: getstatic Perryc.c : I
    //   2554: iflt -> 2568
    //   2557: ldc2_w -604140612
    //   2560: l2i
    //   2561: ldc_w 2098757882
    //   2564: ixor
    //   2565: goto -> 2576
    //   2568: ldc2_w 1022822690
    //   2571: l2i
    //   2572: ldc_w -2100647520
    //   2575: ixor
    //   2576: ldc2_w -441284977
    //   2579: l2i
    //   2580: ldc_w 1276995562
    //   2583: ixor
    //   2584: ixor
    //   2585: lookupswitch default -> 4193, 256567843 -> 2568, 395461095 -> 2612
    //   2612: goto -> 2616
    //   2615: athrow
    //   2616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2619: goto -> 2623
    //   2622: athrow
    //   2623: pop
    //   2624: getstatic Perryc.c : I
    //   2627: iflt -> 2641
    //   2630: ldc2_w 442045189
    //   2633: l2i
    //   2634: ldc_w -1526820787
    //   2637: ixor
    //   2638: goto -> 2649
    //   2641: ldc2_w -1508866632
    //   2644: l2i
    //   2645: ldc_w -1209777187
    //   2648: ixor
    //   2649: ldc2_w -1741471842
    //   2652: l2i
    //   2653: ldc_w 976254954
    //   2656: ixor
    //   2657: ixor
    //   2658: lookupswitch default -> 4263, -1275621871 -> 2684, 480561980 -> 2641
    //   2684: aload #5
    //   2686: ldc2_w -524445675
    //   2689: l2i
    //   2690: ldc_w -524445665
    //   2693: ixor
    //   2694: getstatic Perryc.1 : I
    //   2697: ifeq -> 2711
    //   2700: ldc2_w 2091010193
    //   2703: l2i
    //   2704: ldc_w -1627112734
    //   2707: ixor
    //   2708: goto -> 2719
    //   2711: ldc2_w -433362576
    //   2714: l2i
    //   2715: ldc_w 357384046
    //   2718: ixor
    //   2719: ldc2_w 1631741200
    //   2722: l2i
    //   2723: ldc_w -1354953479
    //   2726: ixor
    //   2727: ixor
    //   2728: lookupswitch default -> 4301, 769203098 -> 2711, 1025064951 -> 2756
    //   2756: goto -> 2760
    //   2759: athrow
    //   2760: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2763: goto -> 2767
    //   2766: athrow
    //   2767: pop
    //   2768: goto -> 2162
    //   2771: getstatic Perryc.1 : I
    //   2774: ifeq -> 2788
    //   2777: ldc2_w -390359596
    //   2780: l2i
    //   2781: ldc_w 1312944954
    //   2784: ixor
    //   2785: goto -> 2796
    //   2788: ldc2_w -1283131073
    //   2791: l2i
    //   2792: ldc_w -539255257
    //   2795: ixor
    //   2796: ldc2_w -1834776206
    //   2799: l2i
    //   2800: ldc_w 772534027
    //   2803: ixor
    //   2804: ixor
    //   2805: lookupswitch default -> 2832, -1056410486 -> 2788, 441581719 -> 4293
    //   2832: aload #4
    //   2834: getstatic Perryc.0 : I
    //   2837: ifle -> 2851
    //   2840: ldc2_w 791062150
    //   2843: l2i
    //   2844: ldc_w 717242760
    //   2847: ixor
    //   2848: goto -> 2859
    //   2851: ldc2_w -646702682
    //   2854: l2i
    //   2855: ldc_w 450600479
    //   2858: ixor
    //   2859: ldc2_w -1802373540
    //   2862: l2i
    //   2863: ldc_w -1155300950
    //   2866: ixor
    //   2867: ixor
    //   2868: lookupswitch default -> 2896, 710185208 -> 4285, 2133449324 -> 2851
    //   2896: goto -> 2900
    //   2899: athrow
    //   2900: invokevirtual close : ()V
    //   2903: goto -> 2907
    //   2906: athrow
    //   2907: getstatic Perryc.c : I
    //   2910: iflt -> 2924
    //   2913: ldc2_w -976911963
    //   2916: l2i
    //   2917: ldc_w 1592316761
    //   2920: ixor
    //   2921: goto -> 2932
    //   2924: ldc2_w -274479563
    //   2927: l2i
    //   2928: ldc_w 423728408
    //   2931: ixor
    //   2932: ldc2_w -1546026777
    //   2935: l2i
    //   2936: ldc_w -634733826
    //   2939: ixor
    //   2940: ixor
    //   2941: lookupswitch default -> 2968, -488740635 -> 4269, 249229891 -> 2924
    //   2968: aload #5
    //   2970: getstatic Perryc.0 : I
    //   2973: ifle -> 2987
    //   2976: ldc2_w 888906462
    //   2979: l2i
    //   2980: ldc_w 2082137637
    //   2983: ixor
    //   2984: goto -> 2995
    //   2987: ldc2_w -1055533660
    //   2990: l2i
    //   2991: ldc_w 692284863
    //   2994: ixor
    //   2995: ldc2_w 2006793060
    //   2998: l2i
    //   2999: ldc_w 1128608371
    //   3002: ixor
    //   3003: ixor
    //   3004: lookupswitch default -> 3032, -942583259 -> 2987, 2084130284 -> 4225
    //   3032: goto -> 3036
    //   3035: athrow
    //   3036: invokevirtual toString : ()Ljava/lang/String;
    //   3039: goto -> 3043
    //   3042: athrow
    //   3043: getstatic Perryc.0 : I
    //   3046: ifle -> 3060
    //   3049: ldc2_w 1688312971
    //   3052: l2i
    //   3053: ldc_w -1828718062
    //   3056: ixor
    //   3057: goto -> 3068
    //   3060: ldc2_w 1284943820
    //   3063: l2i
    //   3064: ldc_w -1950323931
    //   3067: ixor
    //   3068: ldc2_w 218402709
    //   3071: l2i
    //   3072: ldc_w 817660565
    //   3075: ixor
    //   3076: ixor
    //   3077: lookupswitch default -> 3104, -1702051390 -> 3060, -874091623 -> 4297
    //   3104: astore #6
    //   3106: getstatic Perryc.1 : I
    //   3109: ifeq -> 3123
    //   3112: ldc2_w 489231045
    //   3115: l2i
    //   3116: ldc_w -1864871505
    //   3119: ixor
    //   3120: goto -> 3131
    //   3123: ldc2_w 824660751
    //   3126: l2i
    //   3127: ldc_w 1155575822
    //   3130: ixor
    //   3131: ldc2_w 336444483
    //   3134: l2i
    //   3135: ldc_w 566764548
    //   3138: ixor
    //   3139: ixor
    //   3140: lookupswitch default -> 4261, -1204495571 -> 3123, 1073904454 -> 3168
    //   3168: getstatic bigname/zprestige/webhack/util/PlayerUtil.PARSER : Lcom/google/gson/JsonParser;
    //   3171: getstatic Perryc.0 : I
    //   3174: ifle -> 3188
    //   3177: ldc2_w -1917789912
    //   3180: l2i
    //   3181: ldc_w 1497657012
    //   3184: ixor
    //   3185: goto -> 3196
    //   3188: ldc2_w 63617994
    //   3191: l2i
    //   3192: ldc_w 884777450
    //   3195: ixor
    //   3196: ldc2_w -1021280608
    //   3199: l2i
    //   3200: ldc_w -40160139
    //   3203: ixor
    //   3204: ixor
    //   3205: lookupswitch default -> 3232, -1900074213 -> 3188, -363856567 -> 4227
    //   3232: aload #6
    //   3234: getstatic Perryc.c : I
    //   3237: iflt -> 3251
    //   3240: ldc2_w 1432820320
    //   3243: l2i
    //   3244: ldc_w 1081363976
    //   3247: ixor
    //   3248: goto -> 3259
    //   3251: ldc2_w -1172135319
    //   3254: l2i
    //   3255: ldc_w -1294401819
    //   3258: ixor
    //   3259: ldc2_w 1963871034
    //   3262: l2i
    //   3263: ldc_w -508759528
    //   3266: ixor
    //   3267: ixor
    //   3268: lookupswitch default -> 4199, -2119045814 -> 3251, -1671895634 -> 3296
    //   3296: goto -> 3300
    //   3299: athrow
    //   3300: invokevirtual parse : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   3303: goto -> 3307
    //   3306: athrow
    //   3307: getstatic Perryc.1 : I
    //   3310: ifeq -> 3324
    //   3313: ldc2_w 160338184
    //   3316: l2i
    //   3317: ldc_w -1955650623
    //   3320: ixor
    //   3321: goto -> 3332
    //   3324: ldc2_w 1401378460
    //   3327: l2i
    //   3328: ldc_w 856292370
    //   3331: ixor
    //   3332: ldc2_w 1651305205
    //   3335: l2i
    //   3336: ldc_w 1565041252
    //   3339: ixor
    //   3340: ixor
    //   3341: lookupswitch default -> 4233, -1111098792 -> 3324, 1605034527 -> 3368
    //   3368: astore #7
    //   3370: getstatic Perryc.1 : I
    //   3373: ifeq -> 3387
    //   3376: ldc2_w 71161120
    //   3379: l2i
    //   3380: ldc_w 504034940
    //   3383: ixor
    //   3384: goto -> 3395
    //   3387: ldc2_w 714713230
    //   3390: l2i
    //   3391: ldc_w -298288467
    //   3394: ixor
    //   3395: ldc2_w 1164195995
    //   3398: l2i
    //   3399: ldc_w -2128772239
    //   3402: ixor
    //   3403: ixor
    //   3404: lookupswitch default -> 3432, -565274442 -> 4249, 2017950456 -> 3387
    //   3432: aload #7
    //   3434: getstatic Perryc.0 : I
    //   3437: ifle -> 3451
    //   3440: ldc2_w -546150444
    //   3443: l2i
    //   3444: ldc_w 1589226693
    //   3447: ixor
    //   3448: goto -> 3459
    //   3451: ldc2_w -422977618
    //   3454: l2i
    //   3455: ldc_w 745607485
    //   3458: ixor
    //   3459: ldc2_w -1521811747
    //   3462: l2i
    //   3463: ldc_w 1680543750
    //   3466: ixor
    //   3467: ixor
    //   3468: lookupswitch default -> 3496, 902755220 -> 3451, 1084892618 -> 4255
    //   3496: astore #8
    //   3498: getstatic Perryc.c : I
    //   3501: iflt -> 3515
    //   3504: ldc2_w -650476303
    //   3507: l2i
    //   3508: ldc_w -928148483
    //   3511: ixor
    //   3512: goto -> 3523
    //   3515: ldc2_w -1349875087
    //   3518: l2i
    //   3519: ldc_w -1280360608
    //   3522: ixor
    //   3523: ldc2_w 535802266
    //   3526: l2i
    //   3527: ldc_w -1918022369
    //   3530: ixor
    //   3531: ixor
    //   3532: lookupswitch default -> 3560, -2083132535 -> 4221, -1383937063 -> 3515
    //   3560: aload_3
    //   3561: ifnull -> 3575
    //   3564: ldc2_w 474638528
    //   3567: l2i
    //   3568: ldc_w -1019573200
    //   3571: ixor
    //   3572: goto -> 3583
    //   3575: ldc2_w -1367996088
    //   3578: l2i
    //   3579: ldc_w 1896279481
    //   3582: ixor
    //   3583: ldc2_w 1571934308
    //   3586: l2i
    //   3587: ldc_w 1297670264
    //   3590: ixor
    //   3591: ixor
    //   3592: tableswitch default -> 3564, -812002068 -> 3616, -812002067 -> 3747
    //   3616: getstatic Perryc.0 : I
    //   3619: ifle -> 3633
    //   3622: ldc2_w -1011805218
    //   3625: l2i
    //   3626: ldc_w 1969821312
    //   3629: ixor
    //   3630: goto -> 3641
    //   3633: ldc2_w 1106122385
    //   3636: l2i
    //   3637: ldc_w -2078350958
    //   3640: ixor
    //   3641: ldc2_w 780027603
    //   3644: l2i
    //   3645: ldc_w -715521812
    //   3648: ixor
    //   3649: ixor
    //   3650: lookupswitch default -> 3676, -1176406803 -> 3633, 1308377953 -> 4277
    //   3676: aload_3
    //   3677: getstatic Perryc.0 : I
    //   3680: ifle -> 3694
    //   3683: ldc2_w 58034356
    //   3686: l2i
    //   3687: ldc_w 1811217743
    //   3690: ixor
    //   3691: goto -> 3702
    //   3694: ldc2_w -218542425
    //   3697: l2i
    //   3698: ldc_w -1034246336
    //   3701: ixor
    //   3702: ldc2_w 1734579487
    //   3705: l2i
    //   3706: ldc_w 462030009
    //   3709: ixor
    //   3710: ixor
    //   3711: lookupswitch default -> 3736, -382778206 -> 3694, 342418525 -> 4291
    //   3736: goto -> 3740
    //   3739: athrow
    //   3740: invokevirtual disconnect : ()V
    //   3743: goto -> 3747
    //   3746: athrow
    //   3747: getstatic Perryc.1 : I
    //   3750: ifeq -> 3764
    //   3753: ldc2_w -442854561
    //   3756: l2i
    //   3757: ldc_w 2139924004
    //   3760: ixor
    //   3761: goto -> 3772
    //   3764: ldc2_w 1118246891
    //   3767: l2i
    //   3768: ldc_w 132057293
    //   3771: ixor
    //   3772: ldc2_w 1003935098
    //   3775: l2i
    //   3776: ldc_w 1421376410
    //   3779: ixor
    //   3780: ixor
    //   3781: lookupswitch default -> 3808, -1458608817 -> 3764, -176645221 -> 4187
    //   3808: aload #8
    //   3810: areturn
    //   3811: getstatic Perryc.c : I
    //   3814: iflt -> 3828
    //   3817: ldc2_w -1315580705
    //   3820: l2i
    //   3821: ldc_w 643466794
    //   3824: ixor
    //   3825: goto -> 3836
    //   3828: ldc2_w 611381701
    //   3831: l2i
    //   3832: ldc_w -1110400539
    //   3835: ixor
    //   3836: ldc2_w -1254002672
    //   3839: l2i
    //   3840: ldc_w -1621334360
    //   3843: ixor
    //   3844: ixor
    //   3845: lookupswitch default -> 4197, -1279441256 -> 3872, -1110293427 -> 3828
    //   3872: astore #9
    //   3874: getstatic Perryc.0 : I
    //   3877: ifle -> 3891
    //   3880: ldc2_w -943702880
    //   3883: l2i
    //   3884: ldc_w -8627988
    //   3887: ixor
    //   3888: goto -> 3899
    //   3891: ldc2_w -1084123477
    //   3894: l2i
    //   3895: ldc_w -1099048839
    //   3898: ixor
    //   3899: ldc2_w 1977451955
    //   3902: l2i
    //   3903: ldc_w -399602605
    //   3906: ixor
    //   3907: ixor
    //   3908: lookupswitch default -> 4217, -1662040270 -> 3936, -1521521236 -> 3891
    //   3936: aload_3
    //   3937: ifnull -> 3951
    //   3940: ldc2_w -1467911562
    //   3943: l2i
    //   3944: ldc_w -34386078
    //   3947: ixor
    //   3948: goto -> 3959
    //   3951: ldc2_w -1799470524
    //   3954: l2i
    //   3955: ldc_w -1043562671
    //   3958: ixor
    //   3959: ldc2_w -1147618590
    //   3962: l2i
    //   3963: ldc_w -1239568276
    //   3966: ixor
    //   3967: ixor
    //   3968: tableswitch default -> 3940, 1492596634 -> 3992, 1492596635 -> 4123
    //   3992: getstatic Perryc.0 : I
    //   3995: ifle -> 4009
    //   3998: ldc2_w 1243175749
    //   4001: l2i
    //   4002: ldc_w 1001779871
    //   4005: ixor
    //   4006: goto -> 4017
    //   4009: ldc2_w 1869709383
    //   4012: l2i
    //   4013: ldc_w -241431637
    //   4016: ixor
    //   4017: ldc2_w -112862586
    //   4020: l2i
    //   4021: ldc_w 401658460
    //   4024: ixor
    //   4025: ixor
    //   4026: lookupswitch default -> 4273, -1625710336 -> 4009, 1884848950 -> 4052
    //   4052: aload_3
    //   4053: getstatic Perryc.c : I
    //   4056: iflt -> 4070
    //   4059: ldc2_w -297779259
    //   4062: l2i
    //   4063: ldc_w 2119596567
    //   4066: ixor
    //   4067: goto -> 4078
    //   4070: ldc2_w -363775511
    //   4073: l2i
    //   4074: ldc_w -246927388
    //   4077: ixor
    //   4078: ldc2_w -833596590
    //   4081: l2i
    //   4082: ldc_w -1725518960
    //   4085: ixor
    //   4086: ixor
    //   4087: lookupswitch default -> 4112, -949961456 -> 4283, -869890429 -> 4070
    //   4112: goto -> 4116
    //   4115: athrow
    //   4116: invokevirtual disconnect : ()V
    //   4119: goto -> 4123
    //   4122: athrow
    //   4123: getstatic Perryc.0 : I
    //   4126: ifle -> 4140
    //   4129: ldc2_w -1740842316
    //   4132: l2i
    //   4133: ldc_w 1462365156
    //   4136: ixor
    //   4137: goto -> 4148
    //   4140: ldc2_w -1744671959
    //   4143: l2i
    //   4144: ldc_w 1668997334
    //   4147: ixor
    //   4148: ldc2_w 333866043
    //   4151: l2i
    //   4152: ldc_w -947007935
    //   4155: ixor
    //   4156: ixor
    //   4157: lookupswitch default -> 4184, 51975041 -> 4140, 461282090 -> 4251
    //   4184: aload #9
    //   4186: athrow
    //   4187: aconst_null
    //   4188: athrow
    //   4189: aconst_null
    //   4190: athrow
    //   4191: aconst_null
    //   4192: athrow
    //   4193: aconst_null
    //   4194: athrow
    //   4195: aconst_null
    //   4196: athrow
    //   4197: aconst_null
    //   4198: athrow
    //   4199: aconst_null
    //   4200: athrow
    //   4201: aconst_null
    //   4202: athrow
    //   4203: aconst_null
    //   4204: athrow
    //   4205: aconst_null
    //   4206: athrow
    //   4207: aconst_null
    //   4208: athrow
    //   4209: aconst_null
    //   4210: athrow
    //   4211: aconst_null
    //   4212: athrow
    //   4213: aconst_null
    //   4214: athrow
    //   4215: aconst_null
    //   4216: athrow
    //   4217: aconst_null
    //   4218: athrow
    //   4219: aconst_null
    //   4220: athrow
    //   4221: aconst_null
    //   4222: athrow
    //   4223: aconst_null
    //   4224: athrow
    //   4225: aconst_null
    //   4226: athrow
    //   4227: aconst_null
    //   4228: athrow
    //   4229: aconst_null
    //   4230: athrow
    //   4231: aconst_null
    //   4232: athrow
    //   4233: aconst_null
    //   4234: athrow
    //   4235: aconst_null
    //   4236: athrow
    //   4237: aconst_null
    //   4238: athrow
    //   4239: aconst_null
    //   4240: athrow
    //   4241: aconst_null
    //   4242: athrow
    //   4243: aconst_null
    //   4244: athrow
    //   4245: aconst_null
    //   4246: athrow
    //   4247: aconst_null
    //   4248: athrow
    //   4249: aconst_null
    //   4250: athrow
    //   4251: aconst_null
    //   4252: athrow
    //   4253: aconst_null
    //   4254: athrow
    //   4255: aconst_null
    //   4256: athrow
    //   4257: aconst_null
    //   4258: athrow
    //   4259: aconst_null
    //   4260: athrow
    //   4261: aconst_null
    //   4262: athrow
    //   4263: aconst_null
    //   4264: athrow
    //   4265: aconst_null
    //   4266: athrow
    //   4267: aconst_null
    //   4268: athrow
    //   4269: aconst_null
    //   4270: athrow
    //   4271: aconst_null
    //   4272: athrow
    //   4273: aconst_null
    //   4274: athrow
    //   4275: aconst_null
    //   4276: athrow
    //   4277: aconst_null
    //   4278: athrow
    //   4279: aconst_null
    //   4280: athrow
    //   4281: aconst_null
    //   4282: athrow
    //   4283: aconst_null
    //   4284: athrow
    //   4285: aconst_null
    //   4286: athrow
    //   4287: aconst_null
    //   4288: athrow
    //   4289: aconst_null
    //   4290: athrow
    //   4291: aconst_null
    //   4292: athrow
    //   4293: aconst_null
    //   4294: athrow
    //   4295: aconst_null
    //   4296: athrow
    //   4297: aconst_null
    //   4298: athrow
    //   4299: aconst_null
    //   4300: athrow
    //   4301: aconst_null
    //   4302: athrow
    //   4303: aconst_null
    //   4304: athrow
    //   4305: pop
    //   4306: goto -> 24
    //   4309: pop
    //   4310: aconst_null
    //   4311: goto -> 4305
    //   4314: dup
    //   4315: ifnull -> 4305
    //   4318: checkcast java/lang/Throwable
    //   4321: athrow
    //   4322: dup
    //   4323: ifnull -> 4309
    //   4326: checkcast java/lang/Throwable
    //   4329: athrow
    //   4330: aconst_null
    //   4331: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1282	469	4	output	Ljava/io/DataOutputStream;
    //   2022	1789	4	scanner	Ljava/util/Scanner;
    //   2162	1649	5	builder	Ljava/lang/StringBuilder;
    //   3106	705	6	json	Ljava/lang/String;
    //   3370	441	7	data	Lcom/google/gson/JsonElement;
    //   24	4163	0	url	Ljava/net/URL;
    //   24	4163	1	request	Ljava/lang/String;
    //   24	4163	2	element	Lcom/google/gson/JsonElement;
    //   85	4102	3	connection	Ljavax/net/ssl/HttpsURLConnection;
    // Exception table:
    //   from	to	target	type
    //   8	20	4314	finally
    //   85	739	3811	finally
    //   207	214	214	finally
    //   208	214	214	java/lang/ClassCastException
    //   208	214	214	finally
    //   208	214	207	java/lang/UnsupportedOperationException
    //   208	214	207	java/util/NoSuchElementException
    //   411	418	418	finally
    //   411	418	418	java/lang/ArithmeticException
    //   411	418	3	finally
    //   411	418	418	java/lang/UnsupportedOperationException
    //   412	418	411	java/lang/NegativeArraySizeException
    //   603	610	610	finally
    //   603	610	610	finally
    //   604	610	3	finally
    //   604	610	610	java/lang/NumberFormatException
    //   604	610	603	finally
    //   740	746	746	finally
    //   740	746	3	finally
    //   740	746	746	finally
    //   740	746	746	finally
    //   740	746	3	java/lang/ArrayIndexOutOfBoundsException
    //   740	2759	3811	finally
    //   815	822	822	finally
    //   815	822	822	java/lang/IndexOutOfBoundsException
    //   815	822	815	java/lang/RuntimeException
    //   816	822	815	java/lang/AssertionError
    //   816	822	3	java/lang/IllegalArgumentException
    //   887	894	894	finally
    //   887	894	887	finally
    //   887	894	887	finally
    //   888	894	894	java/lang/AssertionError
    //   888	894	887	java/lang/RuntimeException
    //   1139	1146	1146	finally
    //   1139	1146	3	java/lang/AssertionError
    //   1140	1146	3	java/lang/ArrayIndexOutOfBoundsException
    //   1140	1146	1146	java/lang/AssertionError
    //   1140	1146	1139	java/util/NoSuchElementException
    //   1211	1218	1218	finally
    //   1211	1218	1211	finally
    //   1211	1218	1211	java/lang/EnumConstantNotPresentException
    //   1212	1218	3	finally
    //   1212	1218	1211	java/util/NoSuchElementException
    //   1535	1542	1542	finally
    //   1535	1542	3	finally
    //   1535	1542	1535	java/lang/RuntimeException
    //   1536	1542	1542	java/lang/NegativeArraySizeException
    //   1536	1542	1535	finally
    //   1607	1614	1614	finally
    //   1607	1614	1607	finally
    //   1608	1614	3	finally
    //   1608	1614	1607	finally
    //   1608	1614	1614	java/lang/ClassCastException
    //   1743	1750	1750	finally
    //   1743	1750	1750	finally
    //   1743	1750	1743	java/lang/IllegalArgumentException
    //   1744	1750	1750	finally
    //   1744	1750	1750	java/lang/RuntimeException
    //   1879	1886	1886	finally
    //   1879	1886	1879	finally
    //   1879	1886	1879	finally
    //   1879	1886	1886	java/lang/IllegalArgumentException
    //   1880	1886	3	java/lang/ClassCastException
    //   1951	1958	1958	finally
    //   1951	1958	3	java/lang/StringIndexOutOfBoundsException
    //   1952	1958	1958	finally
    //   1952	1958	1951	java/lang/ArithmeticException
    //   1952	1958	1958	java/lang/ClassCastException
    //   2091	2098	2098	finally
    //   2091	2098	2098	java/lang/RuntimeException
    //   2091	2098	3	finally
    //   2091	2098	2091	java/lang/ArithmeticException
    //   2091	2098	2098	finally
    //   2291	2298	2298	finally
    //   2291	2298	2298	finally
    //   2291	2298	2291	finally
    //   2292	2298	3	finally
    //   2292	2298	2298	java/lang/AssertionError
    //   2543	2550	2550	finally
    //   2543	2550	3	java/lang/NullPointerException
    //   2543	2550	2543	finally
    //   2544	2550	2550	finally
    //   2544	2550	2543	java/lang/AssertionError
    //   2615	2622	2622	finally
    //   2616	2622	2622	java/lang/ArithmeticException
    //   2616	2622	3	java/lang/NumberFormatException
    //   2616	2622	2615	finally
    //   2616	2622	2615	finally
    //   2760	2766	2766	finally
    //   2760	2766	2766	java/lang/EnumConstantNotPresentException
    //   2760	2766	3	finally
    //   2760	2766	3	finally
    //   2760	2766	3	finally
    //   2760	3498	3811	finally
    //   2899	2906	2906	finally
    //   2899	2906	2899	java/lang/NullPointerException
    //   2899	2906	2899	java/lang/RuntimeException
    //   2899	2906	2899	java/lang/EnumConstantNotPresentException
    //   2899	2906	2906	java/lang/RuntimeException
    //   3035	3042	3042	finally
    //   3035	3042	3035	java/util/NoSuchElementException
    //   3036	3042	3042	finally
    //   3036	3042	3042	java/lang/IllegalStateException
    //   3036	3042	3042	finally
    //   3299	3306	3306	finally
    //   3299	3306	3299	java/lang/IndexOutOfBoundsException
    //   3300	3306	3	java/lang/AssertionError
    //   3300	3306	3306	java/util/NoSuchElementException
    //   3300	3306	3	finally
    //   3739	3746	3746	finally
    //   3739	3746	3746	java/lang/AssertionError
    //   3739	3746	3	java/lang/IllegalStateException
    //   3740	3746	3739	finally
    //   3740	3746	3739	finally
    //   3811	3874	3811	finally
    //   4115	4122	4122	finally
    //   4115	4122	3	java/lang/IllegalArgumentException
    //   4115	4122	4115	finally
    //   4116	4122	3	java/lang/ArrayIndexOutOfBoundsException
    //   4116	4122	4122	java/lang/StringIndexOutOfBoundsException
    //   4314	4322	4314	java/lang/IllegalStateException
    //   4330	4332	3	finally
  }
  
  public static UUID getUUIDFromName(String name) {
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
  
  public static int findObiInHotbar() {
    return Perry1.2W(null, (int)1133135215L ^ 0x4398C52A);
  }
  
  public static BlockPos getPlayerPos() {
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
  
  public PlayerUtil() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1555793673
    //   9: l2i
    //   10: ldc_w -2122536637
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 272217945
    //   20: l2i
    //   21: ldc_w 1476853696
    //   24: ixor
    //   25: ldc2_w -902059166
    //   28: l2i
    //   29: ldc_w 1160378840
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -2137903609 -> 17, -1389722866 -> 124
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -656633273
    //   70: l2i
    //   71: ldc_w 1824288888
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -335465820
    //   81: l2i
    //   82: ldc_w 368550817
    //   85: ixor
    //   86: ldc2_w -2086730994
    //   89: l2i
    //   90: ldc_w -366616260
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1966089503 -> 78, -572915699 -> 126
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/PlayerUtil;
  }
  
  public static String convertStreamToString(InputStream is) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 733
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 725
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 717
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/Scanner
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w 878544865
    //   37: l2i
    //   38: ldc_w 2003952531
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -730625033
    //   48: l2i
    //   49: ldc_w -1358100058
    //   52: ixor
    //   53: ldc2_w -975681812
    //   56: l2i
    //   57: ldc_w -1970747542
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -837714893 -> 45, 209511924 -> 698
    //   88: aload_0
    //   89: getstatic Perryc.0 : I
    //   92: ifle -> 106
    //   95: ldc2_w -907005060
    //   98: l2i
    //   99: ldc_w -1678774511
    //   102: ixor
    //   103: goto -> 114
    //   106: ldc2_w 324331851
    //   109: l2i
    //   110: ldc_w 1330407290
    //   113: ixor
    //   114: ldc2_w -988289343
    //   117: l2i
    //   118: ldc_w -960512783
    //   121: ixor
    //   122: ixor
    //   123: lookupswitch default -> 148, -1542938557 -> 106, 1370981981 -> 690
    //   148: goto -> 152
    //   151: athrow
    //   152: invokespecial <init> : (Ljava/io/InputStream;)V
    //   155: goto -> 159
    //   158: athrow
    //   159: ldc_w '쓸㌲'
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w -340518429
    //   171: l2i
    //   172: ldc_w -1634637871
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 121914585
    //   182: l2i
    //   183: ldc_w -1374884680
    //   186: ixor
    //   187: ldc2_w 578834889
    //   190: l2i
    //   191: ldc_w 1123224055
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 700, -918818721 -> 224, 357967372 -> 179
    //   224: goto -> 228
    //   227: athrow
    //   228: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   231: goto -> 235
    //   234: athrow
    //   235: getstatic Perryc.1 : I
    //   238: ifeq -> 252
    //   241: ldc2_w 173975057
    //   244: l2i
    //   245: ldc_w 691694713
    //   248: ixor
    //   249: goto -> 260
    //   252: ldc2_w 1497807575
    //   255: l2i
    //   256: ldc_w -1508838789
    //   259: ixor
    //   260: ldc2_w -804126045
    //   263: l2i
    //   264: ldc_w 1695623622
    //   267: ixor
    //   268: ixor
    //   269: lookupswitch default -> 694, -1771577075 -> 252, 1247110089 -> 296
    //   296: goto -> 300
    //   299: athrow
    //   300: invokevirtual useDelimiter : (Ljava/lang/String;)Ljava/util/Scanner;
    //   303: goto -> 307
    //   306: athrow
    //   307: getstatic Perryc.1 : I
    //   310: ifeq -> 324
    //   313: ldc2_w 302881392
    //   316: l2i
    //   317: ldc_w 1188325332
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w -2115023316
    //   327: l2i
    //   328: ldc_w -78935592
    //   331: ixor
    //   332: ldc2_w -1162128741
    //   335: l2i
    //   336: ldc_w 2139414418
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 368, -1847168851 -> 692, 1595898631 -> 324
    //   368: astore_1
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -1610212665
    //   378: l2i
    //   379: ldc_w -697779522
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -431135547
    //   389: l2i
    //   390: ldc_w 2112681609
    //   393: ixor
    //   394: ldc2_w 750184012
    //   397: l2i
    //   398: ldc_w -849483530
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -1986425130 -> 386, -1752846653 -> 696
    //   428: aload_1
    //   429: getstatic Perryc.0 : I
    //   432: ifle -> 446
    //   435: ldc2_w 332355753
    //   438: l2i
    //   439: ldc_w -516053655
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w -723385280
    //   449: l2i
    //   450: ldc_w 978935115
    //   453: ixor
    //   454: ldc2_w -496711530
    //   457: l2i
    //   458: ldc_w 1125319528
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 706, 1338807029 -> 488, 1401239102 -> 446
    //   488: goto -> 492
    //   491: athrow
    //   492: invokevirtual hasNext : ()Z
    //   495: goto -> 499
    //   498: athrow
    //   499: ifeq -> 513
    //   502: ldc2_w -2013084750
    //   505: l2i
    //   506: ldc_w 524372501
    //   509: ixor
    //   510: goto -> 521
    //   513: ldc2_w 853370961
    //   516: l2i
    //   517: ldc_w -1516314121
    //   520: ixor
    //   521: ldc2_w -1375134810
    //   524: l2i
    //   525: ldc_w -12140699
    //   528: ixor
    //   529: ixor
    //   530: tableswitch default -> 502, -972280476 -> 552, -972280475 -> 686
    //   552: getstatic Perryc.c : I
    //   555: iflt -> 569
    //   558: ldc2_w 481099325
    //   561: l2i
    //   562: ldc_w -975325440
    //   565: ixor
    //   566: goto -> 577
    //   569: ldc2_w -959897189
    //   572: l2i
    //   573: ldc_w -102572560
    //   576: ixor
    //   577: ldc2_w -694497077
    //   580: l2i
    //   581: ldc_w 307460473
    //   584: ixor
    //   585: ixor
    //   586: lookupswitch default -> 702, -69052967 -> 612, 498655375 -> 569
    //   612: aload_1
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w 1125375301
    //   622: l2i
    //   623: ldc_w 853687001
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 898883041
    //   633: l2i
    //   634: ldc_w 867362056
    //   637: ixor
    //   638: ldc2_w -1388356814
    //   641: l2i
    //   642: ldc_w -1938440124
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 704, 661365663 -> 672, 1354464490 -> 630
    //   672: goto -> 676
    //   675: athrow
    //   676: invokevirtual next : ()Ljava/lang/String;
    //   679: goto -> 683
    //   682: athrow
    //   683: goto -> 689
    //   686: ldc_w '/'
    //   689: areturn
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
    //   708: pop
    //   709: goto -> 24
    //   712: pop
    //   713: aconst_null
    //   714: goto -> 708
    //   717: dup
    //   718: ifnull -> 708
    //   721: checkcast java/lang/Throwable
    //   724: athrow
    //   725: dup
    //   726: ifnull -> 712
    //   729: checkcast java/lang/Throwable
    //   732: athrow
    //   733: aconst_null
    //   734: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	666	0	is	Ljava/io/InputStream;
    //   369	321	1	s	Ljava/util/Scanner;
    // Exception table:
    //   from	to	target	type
    //   8	20	717	java/lang/StringIndexOutOfBoundsException
    //   151	158	158	finally
    //   151	158	158	finally
    //   152	158	151	finally
    //   152	158	3	finally
    //   152	158	151	finally
    //   227	234	234	finally
    //   227	234	227	finally
    //   227	234	227	java/lang/ClassCastException
    //   227	234	234	finally
    //   228	234	234	finally
    //   299	306	306	finally
    //   299	306	3	java/util/NoSuchElementException
    //   300	306	299	java/lang/RuntimeException
    //   300	306	299	finally
    //   300	306	299	java/lang/ArrayIndexOutOfBoundsException
    //   491	498	498	finally
    //   491	498	491	finally
    //   491	498	3	java/lang/ArrayIndexOutOfBoundsException
    //   492	498	498	finally
    //   492	498	491	java/lang/StringIndexOutOfBoundsException
    //   675	682	682	finally
    //   675	682	3	java/lang/IllegalStateException
    //   675	682	682	java/lang/IllegalStateException
    //   676	682	675	java/lang/ClassCastException
    //   676	682	675	java/lang/AssertionError
    //   717	725	717	java/lang/AssertionError
    //   733	735	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static String getIdNoHyphens(UUID uuid) {
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
  
  public static boolean isInHole(Entity e) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\PlayerUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */