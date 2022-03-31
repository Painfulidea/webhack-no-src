package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;

public class FriendManager extends Feature {
  public List<FriendManager$Friend> friends;
  
  public List getFriends() {
    return Perry1.56(this, (int)-1122413974L ^ 0xCBFA77E6);
  }
  
  public void cleanFriends() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 402
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 394
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 386
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w -1930385664
    //   33: l2i
    //   34: ldc 1043372908
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 235400623
    //   43: l2i
    //   44: ldc 1699634673
    //   46: ixor
    //   47: ldc2_w 983535581
    //   50: l2i
    //   51: ldc -596035273
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -583512802 -> 40, 1411811974 -> 375
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -175809033
    //   90: l2i
    //   91: ldc 1224926278
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1729114215
    //   100: l2i
    //   101: ldc -63872094
    //   103: ixor
    //   104: ldc2_w 1038511494
    //   107: l2i
    //   108: ldc 1926932579
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 373, -205816748 -> 97, 736258526 -> 140
    //   140: getfield friends : Ljava/util/List;
    //   143: getstatic Perryc.c : I
    //   146: iflt -> 159
    //   149: ldc2_w -1052010779
    //   152: l2i
    //   153: ldc 423813996
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -893841115
    //   162: l2i
    //   163: ldc 1416866604
    //   165: ixor
    //   166: ldc2_w -1092315991
    //   169: l2i
    //   170: ldc -315107690
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 371, -1948633162 -> 159, -853936074 -> 200
    //   200: goto -> 204
    //   203: athrow
    //   204: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   209: goto -> 213
    //   212: athrow
    //   213: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   218: getstatic Perryc.0 : I
    //   221: ifle -> 234
    //   224: ldc2_w 481695951
    //   227: l2i
    //   228: ldc 1871592094
    //   230: ixor
    //   231: goto -> 241
    //   234: ldc2_w 1261046847
    //   237: l2i
    //   238: ldc -482129006
    //   240: ixor
    //   241: ldc2_w 327492445
    //   244: l2i
    //   245: ldc -1071831772
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, -1600117720 -> 367, 1578821229 -> 234
    //   276: goto -> 280
    //   279: athrow
    //   280: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   285: goto -> 289
    //   288: athrow
    //   289: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   294: getstatic Perryc.1 : I
    //   297: ifeq -> 310
    //   300: ldc2_w 1063564674
    //   303: l2i
    //   304: ldc 1305363642
    //   306: ixor
    //   307: goto -> 317
    //   310: ldc2_w 2050628952
    //   313: l2i
    //   314: ldc -1240854579
    //   316: ixor
    //   317: ldc2_w -814396144
    //   320: l2i
    //   321: ldc 306085055
    //   323: ixor
    //   324: ixor
    //   325: lookupswitch default -> 369, -1344159593 -> 310, 293282618 -> 352
    //   352: goto -> 356
    //   355: athrow
    //   356: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   361: goto -> 365
    //   364: athrow
    //   365: pop
    //   366: return
    //   367: aconst_null
    //   368: athrow
    //   369: aconst_null
    //   370: athrow
    //   371: aconst_null
    //   372: athrow
    //   373: aconst_null
    //   374: athrow
    //   375: aconst_null
    //   376: athrow
    //   377: pop
    //   378: goto -> 24
    //   381: pop
    //   382: aconst_null
    //   383: goto -> 377
    //   386: dup
    //   387: ifnull -> 377
    //   390: checkcast java/lang/Throwable
    //   393: athrow
    //   394: dup
    //   395: ifnull -> 381
    //   398: checkcast java/lang/Throwable
    //   401: athrow
    //   402: aconst_null
    //   403: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	343	0	this	Lbigname/zprestige/webhack/manager/FriendManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	386	java/lang/NegativeArraySizeException
    //   203	212	212	finally
    //   203	212	203	java/lang/ClassCastException
    //   204	212	3	finally
    //   204	212	203	finally
    //   204	212	203	finally
    //   279	288	288	finally
    //   279	288	279	java/lang/NumberFormatException
    //   279	288	279	java/lang/RuntimeException
    //   280	288	279	finally
    //   280	288	288	finally
    //   355	364	364	finally
    //   355	364	364	java/lang/IllegalStateException
    //   355	364	355	java/lang/AssertionError
    //   355	364	364	java/lang/RuntimeException
    //   355	364	364	finally
    //   386	394	386	finally
    //   402	404	3	finally
  }
  
  public static boolean lambda$cleanFriends$1(FriendManager$Friend friend) {
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
  
  public boolean isFriend(EntityPlayer paramEntityPlayer) {
    return Perry1.0b(this, (int)2004291808L ^ 0x5C195330, paramEntityPlayer);
  }
  
  public FriendManager$Friend getFriendByName(String input) {
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
  
  public static boolean lambda$isFriend$0(String name, FriendManager$Friend friend) {
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
  
  public void addFriend(FriendManager$Friend friend) {
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
  
  public void removeFriend(String paramString) {
    Perry1.1e(this, (int)1790120034L ^ 0x7F89B459, paramString);
  }
  
  public boolean isFriend(String name) {
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
  
  public FriendManager() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -678398007
    //   9: l2i
    //   10: ldc_w 1037467708
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 103947273
    //   20: l2i
    //   21: ldc_w -358870260
    //   24: ixor
    //   25: ldc2_w -288958032
    //   28: l2i
    //   29: ldc_w -203481583
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1837577102 -> 17, -144756652 -> 384
    //   60: aload_0
    //   61: ldc_w '?㌁?㶲橪㎿๪'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -26546521
    //   73: l2i
    //   74: ldc_w 1764018339
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -79619715
    //   84: l2i
    //   85: ldc_w -1415119184
    //   88: ixor
    //   89: ldc2_w 1775213718
    //   92: l2i
    //   93: ldc_w -1097227692
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 390, -2018387697 -> 124, 1075321030 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: getstatic Perryc.c : I
    //   130: iflt -> 144
    //   133: ldc2_w -831946514
    //   136: l2i
    //   137: ldc_w -808466685
    //   140: ixor
    //   141: goto -> 152
    //   144: ldc2_w -951289903
    //   147: l2i
    //   148: ldc_w 1621321036
    //   151: ixor
    //   152: ldc2_w 251802182
    //   155: l2i
    //   156: ldc_w 2120232411
    //   159: ixor
    //   160: ixor
    //   161: lookupswitch default -> 188, 797582327 -> 144, 1891915888 -> 394
    //   188: invokespecial <init> : (Ljava/lang/String;)V
    //   191: getstatic Perryc.0 : I
    //   194: ifle -> 208
    //   197: ldc2_w 602822115
    //   200: l2i
    //   201: ldc_w 1903588328
    //   204: ixor
    //   205: goto -> 216
    //   208: ldc2_w 1160052474
    //   211: l2i
    //   212: ldc_w 1445218167
    //   215: ixor
    //   216: ldc2_w -842671935
    //   219: l2i
    //   220: ldc_w -999847152
    //   223: ixor
    //   224: ixor
    //   225: lookupswitch default -> 252, -977808095 -> 208, 1530557914 -> 388
    //   252: aload_0
    //   253: new java/util/ArrayList
    //   256: dup
    //   257: getstatic Perryc.0 : I
    //   260: ifle -> 274
    //   263: ldc2_w -343779256
    //   266: l2i
    //   267: ldc_w 244269315
    //   270: ixor
    //   271: goto -> 282
    //   274: ldc2_w 569272155
    //   277: l2i
    //   278: ldc_w -761286621
    //   281: ixor
    //   282: ldc2_w -1710648926
    //   285: l2i
    //   286: ldc_w 280961781
    //   289: ixor
    //   290: ixor
    //   291: lookupswitch default -> 316, -177075930 -> 274, 1874569756 -> 392
    //   316: invokespecial <init> : ()V
    //   319: getstatic Perryc.1 : I
    //   322: ifeq -> 336
    //   325: ldc2_w -485541823
    //   328: l2i
    //   329: ldc_w -795159725
    //   332: ixor
    //   333: goto -> 344
    //   336: ldc2_w 1301462950
    //   339: l2i
    //   340: ldc_w 1227516731
    //   343: ixor
    //   344: ldc2_w -470521867
    //   347: l2i
    //   348: ldc_w -1597956105
    //   351: ixor
    //   352: ixor
    //   353: lookupswitch default -> 386, 1200467103 -> 380, 1889571600 -> 336
    //   380: putfield friends : Ljava/util/List;
    //   383: return
    //   384: aconst_null
    //   385: athrow
    //   386: aconst_null
    //   387: athrow
    //   388: aconst_null
    //   389: athrow
    //   390: aconst_null
    //   391: athrow
    //   392: aconst_null
    //   393: athrow
    //   394: aconst_null
    //   395: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	384	0	this	Lbigname/zprestige/webhack/manager/FriendManager;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void saveFriends() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1543
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 1535
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1527
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -1160676848
    //   33: l2i
    //   34: ldc_w -1953097273
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1950550085
    //   44: l2i
    //   45: ldc_w -185011131
    //   48: ixor
    //   49: ldc2_w -1265416269
    //   52: l2i
    //   53: ldc_w 680770923
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1478, -1387816689 -> 41, -482019034 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 1424030304
    //   94: l2i
    //   95: ldc_w 520001856
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1481636725
    //   105: l2i
    //   106: ldc_w 1011412996
    //   109: ixor
    //   110: ldc2_w 2095104349
    //   113: l2i
    //   114: ldc_w 726763487
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -646627592 -> 102, 498017698 -> 1476
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual clearSettings : ()V
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.1 : I
    //   158: ifeq -> 172
    //   161: ldc2_w 27736045
    //   164: l2i
    //   165: ldc_w -1239442875
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 581033496
    //   175: l2i
    //   176: ldc_w 1996168731
    //   179: ixor
    //   180: ldc2_w 1582130139
    //   183: l2i
    //   184: ldc_w -1838954844
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, 154132732 -> 172, 2073430231 -> 1506
    //   216: aload_0
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w -1090860113
    //   226: l2i
    //   227: ldc_w -1173243337
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 1301920790
    //   237: l2i
    //   238: ldc_w 498034716
    //   241: ixor
    //   242: ldc2_w 1855266805
    //   245: l2i
    //   246: ldc_w 968903490
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -1403166438 -> 234, 1404970287 -> 1492
    //   276: goto -> 280
    //   279: athrow
    //   280: invokevirtual cleanFriends : ()V
    //   283: goto -> 287
    //   286: athrow
    //   287: getstatic Perryc.0 : I
    //   290: ifle -> 304
    //   293: ldc2_w 1001872317
    //   296: l2i
    //   297: ldc_w 934465760
    //   300: ixor
    //   301: goto -> 312
    //   304: ldc2_w 1252823296
    //   307: l2i
    //   308: ldc_w 1269687746
    //   311: ixor
    //   312: ldc2_w 154684929
    //   315: l2i
    //   316: ldc_w 1553828074
    //   319: ixor
    //   320: ixor
    //   321: lookupswitch default -> 348, -474785206 -> 304, 1503677878 -> 1502
    //   348: aload_0
    //   349: getstatic Perryc.1 : I
    //   352: ifeq -> 366
    //   355: ldc2_w -38978786
    //   358: l2i
    //   359: ldc_w -73237992
    //   362: ixor
    //   363: goto -> 374
    //   366: ldc2_w -2136992620
    //   369: l2i
    //   370: ldc_w 561944274
    //   373: ixor
    //   374: ldc2_w 1901793788
    //   377: l2i
    //   378: ldc_w 2099581734
    //   381: ixor
    //   382: ixor
    //   383: lookupswitch default -> 1484, -1381990244 -> 408, 175195100 -> 366
    //   408: getfield friends : Ljava/util/List;
    //   411: getstatic Perryc.1 : I
    //   414: ifeq -> 428
    //   417: ldc2_w 1010617571
    //   420: l2i
    //   421: ldc_w -223515329
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w 1012105191
    //   431: l2i
    //   432: ldc_w 1037193723
    //   435: ixor
    //   436: ldc2_w 2067111299
    //   439: l2i
    //   440: ldc_w 1858268361
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -1718302833 -> 428, -614018922 -> 1498
    //   472: goto -> 476
    //   475: athrow
    //   476: invokeinterface iterator : ()Ljava/util/Iterator;
    //   481: goto -> 485
    //   484: athrow
    //   485: getstatic Perryc.c : I
    //   488: iflt -> 502
    //   491: ldc2_w -546897606
    //   494: l2i
    //   495: ldc_w 628056973
    //   498: ixor
    //   499: goto -> 510
    //   502: ldc2_w -619896136
    //   505: l2i
    //   506: ldc_w -990353542
    //   509: ixor
    //   510: ldc2_w 1715139607
    //   513: l2i
    //   514: ldc_w -1449367747
    //   517: ixor
    //   518: ixor
    //   519: lookupswitch default -> 544, 358713399 -> 502, 900657565 -> 1488
    //   544: astore_1
    //   545: getstatic Perryc.c : I
    //   548: iflt -> 562
    //   551: ldc2_w -460126885
    //   554: l2i
    //   555: ldc_w 935386485
    //   558: ixor
    //   559: goto -> 570
    //   562: ldc2_w 576108600
    //   565: l2i
    //   566: ldc_w -678403002
    //   569: ixor
    //   570: ldc2_w 1641166756
    //   573: l2i
    //   574: ldc_w -1656689450
    //   577: ixor
    //   578: ixor
    //   579: lookupswitch default -> 1512, 156501772 -> 604, 801178460 -> 562
    //   604: aload_1
    //   605: getstatic Perryc.0 : I
    //   608: ifle -> 622
    //   611: ldc2_w -1555761853
    //   614: l2i
    //   615: ldc_w 1470355423
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w 2040397392
    //   625: l2i
    //   626: ldc_w -2079645848
    //   629: ixor
    //   630: ldc2_w -343219214
    //   633: l2i
    //   634: ldc_w 120589882
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 1490, 288099568 -> 664, 408801108 -> 622
    //   664: goto -> 668
    //   667: athrow
    //   668: invokeinterface hasNext : ()Z
    //   673: goto -> 677
    //   676: athrow
    //   677: ifeq -> 691
    //   680: ldc2_w -465873590
    //   683: l2i
    //   684: ldc_w -1358195378
    //   687: ixor
    //   688: goto -> 699
    //   691: ldc2_w -794202336
    //   694: l2i
    //   695: ldc_w -1684426981
    //   698: ixor
    //   699: ldc2_w -168841126
    //   702: l2i
    //   703: ldc_w -104185919
    //   706: ixor
    //   707: ixor
    //   708: tableswitch default -> 680, 1192578975 -> 732, 1192578976 -> 1475
    //   732: getstatic Perryc.0 : I
    //   735: ifle -> 749
    //   738: ldc2_w -469780352
    //   741: l2i
    //   742: ldc_w -167193514
    //   745: ixor
    //   746: goto -> 757
    //   749: ldc2_w 1726368293
    //   752: l2i
    //   753: ldc_w -1921443919
    //   756: ixor
    //   757: ldc2_w -1314451049
    //   760: l2i
    //   761: ldc_w -2130944856
    //   764: ixor
    //   765: ixor
    //   766: lookupswitch default -> 792, -1046714890 -> 749, 615260649 -> 1480
    //   792: aload_1
    //   793: getstatic Perryc.1 : I
    //   796: ifeq -> 810
    //   799: ldc2_w -612734060
    //   802: l2i
    //   803: ldc_w 1174546170
    //   806: ixor
    //   807: goto -> 818
    //   810: ldc2_w 344064977
    //   813: l2i
    //   814: ldc_w -282429302
    //   817: ixor
    //   818: ldc2_w -1755783494
    //   821: l2i
    //   822: ldc_w 1225910070
    //   825: ixor
    //   826: ixor
    //   827: lookupswitch default -> 852, -97100869 -> 810, 1127314658 -> 1500
    //   852: goto -> 856
    //   855: athrow
    //   856: invokeinterface next : ()Ljava/lang/Object;
    //   861: goto -> 865
    //   864: athrow
    //   865: checkcast bigname/zprestige/webhack/manager/FriendManager$Friend
    //   868: getstatic Perryc.c : I
    //   871: iflt -> 885
    //   874: ldc2_w 177057867
    //   877: l2i
    //   878: ldc_w 336405605
    //   881: ixor
    //   882: goto -> 893
    //   885: ldc2_w 1204906890
    //   888: l2i
    //   889: ldc_w -251473456
    //   892: ixor
    //   893: ldc2_w 2109563833
    //   896: l2i
    //   897: ldc_w -160263970
    //   900: ixor
    //   901: ixor
    //   902: lookupswitch default -> 928, -1789958327 -> 1514, 824080318 -> 885
    //   928: astore_2
    //   929: getstatic Perryc.0 : I
    //   932: ifle -> 946
    //   935: ldc2_w 2083154954
    //   938: l2i
    //   939: ldc_w 237686836
    //   942: ixor
    //   943: goto -> 954
    //   946: ldc2_w -502511797
    //   949: l2i
    //   950: ldc_w -1648491596
    //   953: ixor
    //   954: ldc2_w -1283540924
    //   957: l2i
    //   958: ldc_w 1480893729
    //   961: ixor
    //   962: ixor
    //   963: lookupswitch default -> 988, -1724210853 -> 1494, -803113971 -> 946
    //   988: aload_0
    //   989: new bigname/zprestige/webhack/features/setting/Setting
    //   992: dup
    //   993: getstatic Perryc.0 : I
    //   996: ifle -> 1010
    //   999: ldc2_w 762731428
    //   1002: l2i
    //   1003: ldc_w -1370523610
    //   1006: ixor
    //   1007: goto -> 1018
    //   1010: ldc2_w 2058784460
    //   1013: l2i
    //   1014: ldc_w 1277645267
    //   1017: ixor
    //   1018: ldc2_w -1682301238
    //   1021: l2i
    //   1022: ldc_w -1254194433
    //   1025: ixor
    //   1026: ixor
    //   1027: lookupswitch default -> 1504, -1380073545 -> 1010, 404046634 -> 1052
    //   1052: aload_2
    //   1053: getstatic Perryc.1 : I
    //   1056: ifeq -> 1070
    //   1059: ldc2_w 370177412
    //   1062: l2i
    //   1063: ldc_w 1499068702
    //   1066: ixor
    //   1067: goto -> 1078
    //   1070: ldc2_w -592912907
    //   1073: l2i
    //   1074: ldc_w -2134084440
    //   1077: ixor
    //   1078: ldc2_w -2140342651
    //   1081: l2i
    //   1082: ldc_w -1583774550
    //   1085: ixor
    //   1086: ixor
    //   1087: lookupswitch default -> 1112, -259105956 -> 1070, 1857879733 -> 1482
    //   1112: goto -> 1116
    //   1115: athrow
    //   1116: invokevirtual getUuid : ()Ljava/util/UUID;
    //   1119: goto -> 1123
    //   1122: athrow
    //   1123: getstatic Perryc.0 : I
    //   1126: ifle -> 1140
    //   1129: ldc2_w -1425833905
    //   1132: l2i
    //   1133: ldc_w -2064286190
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -361415283
    //   1143: l2i
    //   1144: ldc_w 1727896723
    //   1147: ixor
    //   1148: ldc2_w -308811277
    //   1151: l2i
    //   1152: ldc_w -1271433155
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1184, 601911663 -> 1140, 1985376147 -> 1516
    //   1184: goto -> 1188
    //   1187: athrow
    //   1188: invokevirtual toString : ()Ljava/lang/String;
    //   1191: goto -> 1195
    //   1194: athrow
    //   1195: getstatic Perryc.c : I
    //   1198: iflt -> 1212
    //   1201: ldc2_w -1191690901
    //   1204: l2i
    //   1205: ldc_w 332525093
    //   1208: ixor
    //   1209: goto -> 1220
    //   1212: ldc2_w 2017202454
    //   1215: l2i
    //   1216: ldc_w -1324944826
    //   1219: ixor
    //   1220: ldc2_w -77347226
    //   1223: l2i
    //   1224: ldc_w 2098025713
    //   1227: ixor
    //   1228: ixor
    //   1229: lookupswitch default -> 1486, 759644633 -> 1212, 1330934215 -> 1256
    //   1256: aload_2
    //   1257: getstatic Perryc.1 : I
    //   1260: ifeq -> 1274
    //   1263: ldc2_w 750565011
    //   1266: l2i
    //   1267: ldc_w 2101319280
    //   1270: ixor
    //   1271: goto -> 1282
    //   1274: ldc2_w -1697862384
    //   1277: l2i
    //   1278: ldc_w -1747961838
    //   1281: ixor
    //   1282: ldc2_w -1613540511
    //   1285: l2i
    //   1286: ldc_w 672899932
    //   1289: ixor
    //   1290: ixor
    //   1291: lookupswitch default -> 1508, -1160485569 -> 1316, -431238946 -> 1274
    //   1316: goto -> 1320
    //   1319: athrow
    //   1320: invokevirtual getUsername : ()Ljava/lang/String;
    //   1323: goto -> 1327
    //   1326: athrow
    //   1327: getstatic Perryc.1 : I
    //   1330: ifeq -> 1344
    //   1333: ldc2_w 1232486059
    //   1336: l2i
    //   1337: ldc_w 2057107731
    //   1340: ixor
    //   1341: goto -> 1352
    //   1344: ldc2_w 233545234
    //   1347: l2i
    //   1348: ldc_w -1366565907
    //   1351: ixor
    //   1352: ldc2_w 1107185556
    //   1355: l2i
    //   1356: ldc_w -1859596245
    //   1359: ixor
    //   1360: ixor
    //   1361: lookupswitch default -> 1496, -482584569 -> 1344, 1941363264 -> 1388
    //   1388: goto -> 1392
    //   1391: athrow
    //   1392: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1395: goto -> 1399
    //   1398: athrow
    //   1399: getstatic Perryc.0 : I
    //   1402: ifle -> 1416
    //   1405: ldc2_w 1841891586
    //   1408: l2i
    //   1409: ldc_w 1671645442
    //   1412: ixor
    //   1413: goto -> 1424
    //   1416: ldc2_w 914771681
    //   1419: l2i
    //   1420: ldc_w -1426386340
    //   1423: ixor
    //   1424: ldc2_w -945609575
    //   1427: l2i
    //   1428: ldc_w -678900441
    //   1431: ixor
    //   1432: ixor
    //   1433: lookupswitch default -> 1460, 507619774 -> 1510, 953093900 -> 1416
    //   1460: goto -> 1464
    //   1463: athrow
    //   1464: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1467: goto -> 1471
    //   1470: athrow
    //   1471: pop
    //   1472: goto -> 545
    //   1475: return
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
    //   1514: aconst_null
    //   1515: athrow
    //   1516: aconst_null
    //   1517: athrow
    //   1518: pop
    //   1519: goto -> 24
    //   1522: pop
    //   1523: aconst_null
    //   1524: goto -> 1518
    //   1527: dup
    //   1528: ifnull -> 1518
    //   1531: checkcast java/lang/Throwable
    //   1534: athrow
    //   1535: dup
    //   1536: ifnull -> 1522
    //   1539: checkcast java/lang/Throwable
    //   1542: athrow
    //   1543: aconst_null
    //   1544: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   929	543	2	friend	Lbigname/zprestige/webhack/manager/FriendManager$Friend;
    //   24	1452	0	this	Lbigname/zprestige/webhack/manager/FriendManager;
    // Exception table:
    //   from	to	target	type
    //   8	20	1527	finally
    //   147	154	154	finally
    //   147	154	147	finally
    //   147	154	3	finally
    //   148	154	3	finally
    //   148	154	147	java/lang/RuntimeException
    //   279	286	286	finally
    //   279	286	286	finally
    //   279	286	3	java/lang/NumberFormatException
    //   280	286	3	java/lang/ArrayIndexOutOfBoundsException
    //   280	286	279	java/util/ConcurrentModificationException
    //   475	484	484	finally
    //   475	484	484	finally
    //   475	484	475	finally
    //   475	484	3	java/lang/IllegalArgumentException
    //   476	484	475	finally
    //   667	676	676	finally
    //   667	676	3	finally
    //   668	676	676	finally
    //   668	676	667	java/lang/IllegalArgumentException
    //   668	676	667	finally
    //   855	864	864	finally
    //   855	864	3	java/lang/IllegalStateException
    //   855	864	855	java/lang/IllegalStateException
    //   855	864	855	finally
    //   856	864	855	finally
    //   1115	1122	1122	finally
    //   1115	1122	1122	finally
    //   1115	1122	1122	finally
    //   1115	1122	1115	finally
    //   1116	1122	1122	finally
    //   1187	1194	1194	finally
    //   1187	1194	3	finally
    //   1187	1194	1187	finally
    //   1188	1194	1194	java/util/NoSuchElementException
    //   1188	1194	1194	java/lang/EnumConstantNotPresentException
    //   1319	1326	1326	finally
    //   1319	1326	1319	finally
    //   1319	1326	1319	java/lang/IllegalStateException
    //   1319	1326	1326	finally
    //   1319	1326	1319	java/lang/IllegalArgumentException
    //   1391	1398	1398	finally
    //   1391	1398	3	finally
    //   1391	1398	1398	java/util/NoSuchElementException
    //   1391	1398	1391	finally
    //   1391	1398	3	java/lang/AssertionError
    //   1463	1470	1470	finally
    //   1464	1470	1470	finally
    //   1464	1470	1463	finally
    //   1464	1470	3	java/util/NoSuchElementException
    //   1464	1470	3	java/lang/EnumConstantNotPresentException
    //   1527	1535	1527	finally
    //   1543	1545	3	java/lang/EnumConstantNotPresentException
  }
  
  public void addFriend(String paramString) {
    Perry1.1d(this, (int)-139516238L ^ 0x85F0590E, paramString);
  }
  
  public void onLoad() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\FriendManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */