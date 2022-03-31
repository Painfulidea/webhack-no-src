package bigname.zprestige.webhack.features.command;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;

public abstract class Command extends Feature {
  public String[] commands;
  
  public String name;
  
  public String[] getCommands() {
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
  
  public abstract void execute(String[] paramArrayOfString);
  
  public String getName() {
    return Perry1.3(this, (int)911152057L ^ 0x1479AA84);
  }
  
  public static void sendSilentMessage(String message) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 501
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 493
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 485
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 941454688
    //   33: l2i
    //   34: ldc -52358082
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1895462573
    //   43: l2i
    //   44: ldc -1988046208
    //   46: ixor
    //   47: ldc2_w 375555710
    //   50: l2i
    //   51: ldc -956123650
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 468, -672831405 -> 80, 362566366 -> 40
    //   80: goto -> 84
    //   83: athrow
    //   84: invokestatic nullCheck : ()Z
    //   87: goto -> 91
    //   90: athrow
    //   91: ifeq -> 104
    //   94: ldc2_w -224205134
    //   97: l2i
    //   98: ldc 1829325549
    //   100: ixor
    //   101: goto -> 111
    //   104: ldc2_w -213591770
    //   107: l2i
    //   108: ldc 1827632506
    //   110: ixor
    //   111: ldc2_w -104533745
    //   114: l2i
    //   115: ldc -2002598543
    //   117: ixor
    //   118: ixor
    //   119: tableswitch default -> 94, -288516063 -> 140, -288516062 -> 141
    //   140: return
    //   141: getstatic Perryc.1 : I
    //   144: ifeq -> 157
    //   147: ldc2_w 460914136
    //   150: l2i
    //   151: ldc 281816535
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w -1242882221
    //   160: l2i
    //   161: ldc 835037703
    //   163: ixor
    //   164: ldc2_w 748461131
    //   167: l2i
    //   168: ldc -592482811
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 200, -414071203 -> 157, -75029951 -> 474
    //   200: getstatic bigname/zprestige/webhack/features/command/Command.mc : Lnet/minecraft/client/Minecraft;
    //   203: getstatic Perryc.0 : I
    //   206: ifle -> 219
    //   209: ldc2_w -721586243
    //   212: l2i
    //   213: ldc 1939317013
    //   215: ixor
    //   216: goto -> 226
    //   219: ldc2_w -870158953
    //   222: l2i
    //   223: ldc 1036075016
    //   225: ixor
    //   226: ldc2_w 1368068399
    //   229: l2i
    //   230: ldc -951860532
    //   232: ixor
    //   233: ixor
    //   234: lookupswitch default -> 472, 832701771 -> 219, 1730936444 -> 260
    //   260: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   263: new bigname/zprestige/webhack/features/command/Command$ChatMessage
    //   266: dup
    //   267: getstatic Perryc.c : I
    //   270: iflt -> 283
    //   273: ldc2_w 630387416
    //   276: l2i
    //   277: ldc -1632958574
    //   279: ixor
    //   280: goto -> 290
    //   283: ldc2_w -1733918800
    //   286: l2i
    //   287: ldc -1897351713
    //   289: ixor
    //   290: ldc2_w -312868401
    //   293: l2i
    //   294: ldc -1738210219
    //   296: ixor
    //   297: ixor
    //   298: lookupswitch default -> 470, -838405936 -> 283, 1668403189 -> 324
    //   324: aload_0
    //   325: getstatic Perryc.0 : I
    //   328: ifle -> 341
    //   331: ldc2_w 798927253
    //   334: l2i
    //   335: ldc 1836269439
    //   337: ixor
    //   338: goto -> 348
    //   341: ldc2_w 711890104
    //   344: l2i
    //   345: ldc -949111614
    //   347: ixor
    //   348: ldc2_w -1418407925
    //   351: l2i
    //   352: ldc -2135532147
    //   354: ixor
    //   355: ixor
    //   356: lookupswitch default -> 384, 1444415331 -> 341, 1764694892 -> 464
    //   384: goto -> 388
    //   387: athrow
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: goto -> 395
    //   394: athrow
    //   395: getstatic Perryc.c : I
    //   398: iflt -> 411
    //   401: ldc2_w 231053250
    //   404: l2i
    //   405: ldc -966158198
    //   407: ixor
    //   408: goto -> 418
    //   411: ldc2_w -2101310914
    //   414: l2i
    //   415: ldc -2065784844
    //   417: ixor
    //   418: ldc2_w -1058244631
    //   421: l2i
    //   422: ldc 1007911486
    //   424: ixor
    //   425: ixor
    //   426: lookupswitch default -> 452, 928250527 -> 466, 1360568692 -> 411
    //   452: goto -> 456
    //   455: athrow
    //   456: invokevirtual func_145747_a : (Lnet/minecraft/util/text/ITextComponent;)V
    //   459: goto -> 463
    //   462: athrow
    //   463: return
    //   464: aconst_null
    //   465: athrow
    //   466: aconst_null
    //   467: athrow
    //   468: aconst_null
    //   469: athrow
    //   470: aconst_null
    //   471: athrow
    //   472: aconst_null
    //   473: athrow
    //   474: aconst_null
    //   475: athrow
    //   476: pop
    //   477: goto -> 24
    //   480: pop
    //   481: aconst_null
    //   482: goto -> 476
    //   485: dup
    //   486: ifnull -> 476
    //   489: checkcast java/lang/Throwable
    //   492: athrow
    //   493: dup
    //   494: ifnull -> 480
    //   497: checkcast java/lang/Throwable
    //   500: athrow
    //   501: aconst_null
    //   502: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	440	0	message	Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	485	finally
    //   83	90	90	finally
    //   83	90	83	java/lang/ArrayIndexOutOfBoundsException
    //   83	90	83	finally
    //   84	90	83	finally
    //   84	90	83	finally
    //   387	394	394	finally
    //   387	394	387	finally
    //   387	394	3	finally
    //   388	394	3	java/lang/ClassCastException
    //   388	394	387	finally
    //   455	462	462	finally
    //   455	462	455	java/lang/ArrayIndexOutOfBoundsException
    //   455	462	3	finally
    //   455	462	462	finally
    //   456	462	455	finally
    //   485	493	485	finally
    //   501	503	3	finally
  }
  
  public static String getCommandPrefix() {
    return Perry1.5(null, (int)-211670299L ^ 0xED712321);
  }
  
  public static void sendMessage(String message) {
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
  
  public Command(String name) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -1124996116
    //   9: l2i
    //   10: ldc_w -1745966665
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1701999500
    //   20: l2i
    //   21: ldc_w 418352862
    //   24: ixor
    //   25: ldc2_w 1569542978
    //   28: l2i
    //   29: ldc_w 1680222211
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 313800986 -> 522, 672435997 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w 1897772988
    //   70: l2i
    //   71: ldc_w -1318728582
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -296058015
    //   81: l2i
    //   82: ldc_w 777867806
    //   85: ixor
    //   86: ldc2_w -1268894206
    //   89: l2i
    //   90: ldc_w 1327959361
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 520, 989937797 -> 78, 998173244 -> 120
    //   120: aload_1
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 138
    //   127: ldc2_w 476695046
    //   130: l2i
    //   131: ldc_w -1993474071
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w -1664684037
    //   141: l2i
    //   142: ldc_w -1196127992
    //   145: ixor
    //   146: ldc2_w 1749297175
    //   149: l2i
    //   150: ldc_w 902763810
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 180, -925955878 -> 516, 178898370 -> 138
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 200
    //   189: ldc2_w 726480711
    //   192: l2i
    //   193: ldc_w 151169842
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w 25311500
    //   203: l2i
    //   204: ldc_w 1392862297
    //   207: ixor
    //   208: ldc2_w -819199887
    //   211: l2i
    //   212: ldc_w 782323018
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 526, -1291186066 -> 244, -1010642610 -> 200
    //   244: aload_0
    //   245: getstatic Perryc.0 : I
    //   248: ifle -> 262
    //   251: ldc2_w 1244736105
    //   254: l2i
    //   255: ldc_w -1844161124
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1779260747
    //   265: l2i
    //   266: ldc_w 1436038303
    //   269: ixor
    //   270: ldc2_w -958435539
    //   273: l2i
    //   274: ldc_w 1317710345
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 528, -1212109584 -> 304, 1349565137 -> 262
    //   304: aload_1
    //   305: getstatic Perryc.1 : I
    //   308: ifeq -> 322
    //   311: ldc2_w 380776761
    //   314: l2i
    //   315: ldc_w -1979588899
    //   318: ixor
    //   319: goto -> 330
    //   322: ldc2_w -105111686
    //   325: l2i
    //   326: ldc_w -232971468
    //   329: ixor
    //   330: ldc2_w -580533875
    //   333: l2i
    //   334: ldc_w -241628601
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 364, -1336990674 -> 530, -512145967 -> 322
    //   364: putfield name : Ljava/lang/String;
    //   367: getstatic Perryc.1 : I
    //   370: ifeq -> 384
    //   373: ldc2_w -1333632832
    //   376: l2i
    //   377: ldc_w -1787382121
    //   380: ixor
    //   381: goto -> 392
    //   384: ldc2_w -1710961930
    //   387: l2i
    //   388: ldc_w -2017736966
    //   391: ixor
    //   392: ldc2_w 1093611448
    //   395: l2i
    //   396: ldc_w -1753975521
    //   399: ixor
    //   400: ixor
    //   401: lookupswitch default -> 524, -874228053 -> 428, -206598928 -> 384
    //   428: aload_0
    //   429: ldc2_w 525199081
    //   432: l2i
    //   433: ldc_w 525199080
    //   436: ixor
    //   437: anewarray java/lang/String
    //   440: dup
    //   441: ldc2_w -940061771
    //   444: l2i
    //   445: ldc_w -940061771
    //   448: ixor
    //   449: ldc_w ''
    //   452: aastore
    //   453: getstatic Perryc.c : I
    //   456: iflt -> 470
    //   459: ldc2_w 1800919132
    //   462: l2i
    //   463: ldc_w -342668355
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w -689934884
    //   473: l2i
    //   474: ldc_w -1538162304
    //   477: ixor
    //   478: ldc2_w 438405836
    //   481: l2i
    //   482: ldc_w -387777191
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 512, 1616797898 -> 470, 1913119860 -> 518
    //   512: putfield commands : [Ljava/lang/String;
    //   515: return
    //   516: aconst_null
    //   517: athrow
    //   518: aconst_null
    //   519: athrow
    //   520: aconst_null
    //   521: athrow
    //   522: aconst_null
    //   523: athrow
    //   524: aconst_null
    //   525: athrow
    //   526: aconst_null
    //   527: athrow
    //   528: aconst_null
    //   529: athrow
    //   530: aconst_null
    //   531: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	516	0	this	Lbigname/zprestige/webhack/features/command/Command;
    //   0	516	1	name	Ljava/lang/String;
  }
  
  public Command(String name, String[] commands) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -230678324
    //   9: l2i
    //   10: ldc_w 1917632436
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1423699830
    //   20: l2i
    //   21: ldc_w 514792643
    //   24: ixor
    //   25: ldc2_w -544114957
    //   28: l2i
    //   29: ldc_w -458970550
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 556, -1900097296 -> 60, -1153875007 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w 827080030
    //   70: l2i
    //   71: ldc_w 374172945
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1625988350
    //   81: l2i
    //   82: ldc_w -746772517
    //   85: ixor
    //   86: ldc2_w -1357353348
    //   89: l2i
    //   90: ldc_w -890086523
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 912444374 -> 78, 1122723254 -> 558
    //   120: aload_1
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 138
    //   127: ldc2_w 1667647390
    //   130: l2i
    //   131: ldc_w 67454934
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w -1528388087
    //   141: l2i
    //   142: ldc_w 241879559
    //   145: ixor
    //   146: ldc2_w -1614615164
    //   149: l2i
    //   150: ldc_w 1046458118
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 180, -956415286 -> 564, 2041848145 -> 138
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 200
    //   189: ldc2_w 1040666590
    //   192: l2i
    //   193: ldc_w -1515896914
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w 1287068815
    //   203: l2i
    //   204: ldc_w -1659555683
    //   207: ixor
    //   208: ldc2_w 770325429
    //   211: l2i
    //   212: ldc_w -474575476
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 562, 536779307 -> 244, 1442760265 -> 200
    //   244: aload_0
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w -1776567757
    //   254: l2i
    //   255: ldc_w 138262286
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 2015557729
    //   265: l2i
    //   266: ldc_w 2048480253
    //   269: ixor
    //   270: ldc2_w -708530892
    //   273: l2i
    //   274: ldc_w 584094187
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, 630863231 -> 262, 1764897250 -> 568
    //   304: aload_1
    //   305: getstatic Perryc.1 : I
    //   308: ifeq -> 322
    //   311: ldc2_w -1262113180
    //   314: l2i
    //   315: ldc_w 1609759872
    //   318: ixor
    //   319: goto -> 330
    //   322: ldc2_w -393260409
    //   325: l2i
    //   326: ldc_w -1691314684
    //   329: ixor
    //   330: ldc2_w -1300432902
    //   333: l2i
    //   334: ldc_w 198061445
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 364, 927556058 -> 322, 1384482971 -> 566
    //   364: putfield name : Ljava/lang/String;
    //   367: getstatic Perryc.1 : I
    //   370: ifeq -> 384
    //   373: ldc2_w 921219409
    //   376: l2i
    //   377: ldc_w 1921217938
    //   380: ixor
    //   381: goto -> 392
    //   384: ldc2_w 712068618
    //   387: l2i
    //   388: ldc_w 490655964
    //   391: ixor
    //   392: ldc2_w 1232810887
    //   395: l2i
    //   396: ldc_w -1007511938
    //   399: ixor
    //   400: ixor
    //   401: lookupswitch default -> 428, -824024774 -> 554, -119481734 -> 384
    //   428: aload_0
    //   429: getstatic Perryc.c : I
    //   432: iflt -> 446
    //   435: ldc2_w 1182151487
    //   438: l2i
    //   439: ldc_w 1439592355
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w 1710202912
    //   449: l2i
    //   450: ldc_w -1490266933
    //   453: ixor
    //   454: ldc2_w 1917698453
    //   457: l2i
    //   458: ldc_w -1896475807
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 552, -284979608 -> 446, 1048061471 -> 488
    //   488: aload_2
    //   489: getstatic Perryc.0 : I
    //   492: ifle -> 506
    //   495: ldc2_w -980906501
    //   498: l2i
    //   499: ldc_w 1887150439
    //   502: ixor
    //   503: goto -> 514
    //   506: ldc2_w -994592941
    //   509: l2i
    //   510: ldc_w -1132558338
    //   513: ixor
    //   514: ldc2_w -1087004258
    //   517: l2i
    //   518: ldc_w 999272276
    //   521: ixor
    //   522: ixor
    //   523: lookupswitch default -> 560, -59556249 -> 548, 826876502 -> 506
    //   548: putfield commands : [Ljava/lang/String;
    //   551: return
    //   552: aconst_null
    //   553: athrow
    //   554: aconst_null
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	552	0	this	Lbigname/zprestige/webhack/features/command/Command;
    //   0	552	1	name	Ljava/lang/String;
    //   0	552	2	commands	[Ljava/lang/String;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\command\Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */