package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.ClientEvent;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.Map;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArrayListZ extends Module {
  public boolean shouldIncrement;
  
  public static ArrayListZ INSTANCE;
  
  public int hitMarkerTimer;
  
  public int color;
  
  public Setting<Integer> arrayListY;
  
  public Setting<Boolean> renderingUp;
  
  public Setting<Integer> arrayListY2;
  
  public void onLoad() {
    Perry1.3H(this, (int)-706867227L ^ 0xD40A2368);
  }
  
  public void setInstance() {
    Perry1.3W(this, (int)1190280656L ^ 0x3286D50C);
  }
  
  public String getCommandMessage() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 881
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 873
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 865
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 44
    //   34: ldc2_w 789673959
    //   37: l2i
    //   38: ldc -1308032932
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w 1636667801
    //   47: l2i
    //   48: ldc 1625741113
    //   50: ixor
    //   51: ldc2_w -379593548
    //   54: l2i
    //   55: ldc 1205066461
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 840, -1343799095 -> 84, 865366482 -> 44
    //   84: goto -> 88
    //   87: athrow
    //   88: invokespecial <init> : ()V
    //   91: goto -> 95
    //   94: athrow
    //   95: ldc '['
    //   97: getstatic Perryc.c : I
    //   100: iflt -> 113
    //   103: ldc2_w -1801443768
    //   106: l2i
    //   107: ldc 229505227
    //   109: ixor
    //   110: goto -> 120
    //   113: ldc2_w -1085198508
    //   116: l2i
    //   117: ldc -1312820963
    //   119: ixor
    //   120: ldc2_w -1962024807
    //   123: l2i
    //   124: ldc 1592201456
    //   126: ixor
    //   127: ixor
    //   128: lookupswitch default -> 832, -620483040 -> 156, 1290219242 -> 113
    //   156: getstatic bigname/zprestige/webhack/util/TextUtil$Color.WHITE : Lbigname/zprestige/webhack/util/TextUtil$Color;
    //   159: getstatic Perryc.1 : I
    //   162: ifeq -> 175
    //   165: ldc2_w 96437994
    //   168: l2i
    //   169: ldc 2034420257
    //   171: ixor
    //   172: goto -> 182
    //   175: ldc2_w 815573556
    //   178: l2i
    //   179: ldc -166114472
    //   181: ixor
    //   182: ldc2_w -1861930380
    //   185: l2i
    //   186: ldc -1983621656
    //   188: ixor
    //   189: ixor
    //   190: lookupswitch default -> 852, -565934352 -> 216, 1681664855 -> 175
    //   216: goto -> 220
    //   219: athrow
    //   220: invokestatic coloredString : (Ljava/lang/String;Lbigname/zprestige/webhack/util/TextUtil$Color;)Ljava/lang/String;
    //   223: goto -> 227
    //   226: athrow
    //   227: getstatic Perryc.0 : I
    //   230: ifle -> 243
    //   233: ldc2_w -1660856596
    //   236: l2i
    //   237: ldc 678997649
    //   239: ixor
    //   240: goto -> 250
    //   243: ldc2_w 1295041263
    //   246: l2i
    //   247: ldc 2044716358
    //   249: ixor
    //   250: ldc2_w 1224270166
    //   253: l2i
    //   254: ldc 331672037
    //   256: ixor
    //   257: ixor
    //   258: lookupswitch default -> 850, -297406258 -> 243, 1876111130 -> 284
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: goto -> 295
    //   294: athrow
    //   295: ldc 'ጼ㌖፫霡ﶴ๲'
    //   297: getstatic Perryc.c : I
    //   300: iflt -> 313
    //   303: ldc2_w -330500159
    //   306: l2i
    //   307: ldc 1821622646
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w 1459412076
    //   316: l2i
    //   317: ldc -473817798
    //   319: ixor
    //   320: ldc2_w -234647075
    //   323: l2i
    //   324: ldc 1330039107
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, -2143793492 -> 313, 1033530921 -> 848
    //   356: goto -> 360
    //   359: athrow
    //   360: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   363: goto -> 367
    //   366: athrow
    //   367: getstatic Perryc.c : I
    //   370: iflt -> 383
    //   373: ldc2_w 433860268
    //   376: l2i
    //   377: ldc 711287063
    //   379: ixor
    //   380: goto -> 390
    //   383: ldc2_w -1514173325
    //   386: l2i
    //   387: ldc 1915786656
    //   389: ixor
    //   390: ldc2_w -727470611
    //   393: l2i
    //   394: ldc -464552798
    //   396: ixor
    //   397: ixor
    //   398: lookupswitch default -> 842, -412890980 -> 424, 55942900 -> 383
    //   424: getstatic bigname/zprestige/webhack/util/TextUtil$Color.WHITE : Lbigname/zprestige/webhack/util/TextUtil$Color;
    //   427: getstatic Perryc.0 : I
    //   430: ifle -> 443
    //   433: ldc2_w -1116329591
    //   436: l2i
    //   437: ldc -1000914709
    //   439: ixor
    //   440: goto -> 450
    //   443: ldc2_w 24846480
    //   446: l2i
    //   447: ldc -1621149350
    //   449: ixor
    //   450: ldc2_w -996373674
    //   453: l2i
    //   454: ldc -134239222
    //   456: ixor
    //   457: ixor
    //   458: lookupswitch default -> 834, -1387839850 -> 484, 1245859390 -> 443
    //   484: goto -> 488
    //   487: athrow
    //   488: invokestatic coloredString : (Ljava/lang/String;Lbigname/zprestige/webhack/util/TextUtil$Color;)Ljava/lang/String;
    //   491: goto -> 495
    //   494: athrow
    //   495: getstatic Perryc.c : I
    //   498: iflt -> 511
    //   501: ldc2_w 565691008
    //   504: l2i
    //   505: ldc 1245788603
    //   507: ixor
    //   508: goto -> 518
    //   511: ldc2_w -768377003
    //   514: l2i
    //   515: ldc -1362774262
    //   517: ixor
    //   518: ldc2_w -285659624
    //   521: l2i
    //   522: ldc 1250828609
    //   524: ixor
    //   525: ixor
    //   526: lookupswitch default -> 838, -813566878 -> 511, -662583546 -> 552
    //   552: goto -> 556
    //   555: athrow
    //   556: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   559: goto -> 563
    //   562: athrow
    //   563: ldc ']'
    //   565: getstatic Perryc.c : I
    //   568: iflt -> 581
    //   571: ldc2_w 1209196121
    //   574: l2i
    //   575: ldc -1656503104
    //   577: ixor
    //   578: goto -> 588
    //   581: ldc2_w -1019282719
    //   584: l2i
    //   585: ldc -129142338
    //   587: ixor
    //   588: ldc2_w -995466139
    //   591: l2i
    //   592: ldc 1482477266
    //   594: ixor
    //   595: ixor
    //   596: lookupswitch default -> 854, -1484447256 -> 624, 1235726382 -> 581
    //   624: getstatic bigname/zprestige/webhack/util/TextUtil$Color.WHITE : Lbigname/zprestige/webhack/util/TextUtil$Color;
    //   627: getstatic Perryc.1 : I
    //   630: ifeq -> 643
    //   633: ldc2_w 626872328
    //   636: l2i
    //   637: ldc -2085328228
    //   639: ixor
    //   640: goto -> 650
    //   643: ldc2_w -12834981
    //   646: l2i
    //   647: ldc -828314388
    //   649: ixor
    //   650: ldc2_w 907852305
    //   653: l2i
    //   654: ldc -692408540
    //   656: ixor
    //   657: ixor
    //   658: lookupswitch default -> 836, -784671102 -> 684, 1179594657 -> 643
    //   684: goto -> 688
    //   687: athrow
    //   688: invokestatic coloredString : (Ljava/lang/String;Lbigname/zprestige/webhack/util/TextUtil$Color;)Ljava/lang/String;
    //   691: goto -> 695
    //   694: athrow
    //   695: getstatic Perryc.1 : I
    //   698: ifeq -> 711
    //   701: ldc2_w 523901159
    //   704: l2i
    //   705: ldc -2073751014
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -268679516
    //   714: l2i
    //   715: ldc 1829812804
    //   717: ixor
    //   718: ldc2_w -1310652859
    //   721: l2i
    //   722: ldc -62066453
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 844, -817821106 -> 752, -688718765 -> 711
    //   752: goto -> 756
    //   755: athrow
    //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: goto -> 763
    //   762: athrow
    //   763: getstatic Perryc.c : I
    //   766: iflt -> 779
    //   769: ldc2_w -177707751
    //   772: l2i
    //   773: ldc -1205061733
    //   775: ixor
    //   776: goto -> 786
    //   779: ldc2_w 470458074
    //   782: l2i
    //   783: ldc -1299782890
    //   785: ixor
    //   786: ldc2_w 617355447
    //   789: l2i
    //   790: ldc 47905346
    //   792: ixor
    //   793: ixor
    //   794: lookupswitch default -> 846, -2003132615 -> 820, 1800581239 -> 779
    //   820: goto -> 824
    //   823: athrow
    //   824: invokevirtual toString : ()Ljava/lang/String;
    //   827: goto -> 831
    //   830: athrow
    //   831: areturn
    //   832: aconst_null
    //   833: athrow
    //   834: aconst_null
    //   835: athrow
    //   836: aconst_null
    //   837: athrow
    //   838: aconst_null
    //   839: athrow
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
    //   856: pop
    //   857: goto -> 24
    //   860: pop
    //   861: aconst_null
    //   862: goto -> 856
    //   865: dup
    //   866: ifnull -> 856
    //   869: checkcast java/lang/Throwable
    //   872: athrow
    //   873: dup
    //   874: ifnull -> 860
    //   877: checkcast java/lang/Throwable
    //   880: athrow
    //   881: aconst_null
    //   882: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	808	0	this	Lbigname/zprestige/webhack/features/modules/Hud/ArrayListZ;
    // Exception table:
    //   from	to	target	type
    //   8	20	865	finally
    //   87	94	94	finally
    //   87	94	94	finally
    //   87	94	87	java/lang/NumberFormatException
    //   88	94	87	java/util/ConcurrentModificationException
    //   88	94	94	java/lang/NegativeArraySizeException
    //   220	226	226	finally
    //   220	226	3	finally
    //   220	226	3	finally
    //   220	226	226	finally
    //   220	226	226	finally
    //   287	294	294	finally
    //   287	294	3	java/lang/ClassCastException
    //   287	294	294	finally
    //   287	294	287	finally
    //   288	294	3	finally
    //   359	366	366	finally
    //   359	366	3	finally
    //   359	366	3	java/lang/IllegalStateException
    //   360	366	3	finally
    //   360	366	359	finally
    //   488	494	494	finally
    //   488	494	3	finally
    //   488	494	494	finally
    //   488	494	494	java/lang/UnsupportedOperationException
    //   488	494	494	java/util/NoSuchElementException
    //   555	562	562	finally
    //   555	562	555	java/lang/RuntimeException
    //   555	562	555	finally
    //   556	562	3	java/lang/NumberFormatException
    //   556	562	3	java/lang/ClassCastException
    //   687	694	694	finally
    //   687	694	687	java/lang/IndexOutOfBoundsException
    //   687	694	694	java/lang/IndexOutOfBoundsException
    //   687	694	694	java/lang/NegativeArraySizeException
    //   688	694	687	java/lang/IndexOutOfBoundsException
    //   756	762	762	finally
    //   756	762	3	java/lang/NullPointerException
    //   756	762	762	java/util/ConcurrentModificationException
    //   756	762	3	java/lang/IllegalArgumentException
    //   756	762	3	java/lang/NumberFormatException
    //   823	830	830	finally
    //   823	830	823	java/lang/StringIndexOutOfBoundsException
    //   824	830	830	finally
    //   824	830	830	finally
    //   824	830	3	finally
    //   865	873	865	java/lang/ArrayIndexOutOfBoundsException
    //   881	883	3	java/lang/IllegalStateException
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Hud/ArrayListZ
    //   3: dup
    //   4: getstatic Perryc.0 : I
    //   7: ifle -> 20
    //   10: ldc2_w -1032189900
    //   13: l2i
    //   14: ldc -1483500420
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w -653052553
    //   23: l2i
    //   24: ldc -93589102
    //   26: ixor
    //   27: ldc2_w -1543052391
    //   30: l2i
    //   31: ldc 1381513716
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 60, -1816705499 -> 126, 1645364430 -> 20
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.0 : I
    //   66: ifle -> 79
    //   69: ldc2_w -388184048
    //   72: l2i
    //   73: ldc -485519061
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w 541688796
    //   82: l2i
    //   83: ldc -383823051
    //   85: ixor
    //   86: ldc2_w 345638865
    //   89: l2i
    //   90: ldc -1226408224
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 124, -1448140790 -> 79, 1797958104 -> 120
    //   120: putstatic bigname/zprestige/webhack/features/modules/Hud/ArrayListZ.INSTANCE : Lbigname/zprestige/webhack/features/modules/Hud/ArrayListZ;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(AttackEntityEvent paramAttackEntityEvent) {
    Perry1.x(this, (int)-620401674L ^ 0xCF01FE9D, paramAttackEntityEvent);
  }
  
  public static ArrayListZ getInstance() {
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
  
  public boolean lambda$new$0(Integer paramInteger) {
    return Perry1.5e(this, (int)-1422925628L ^ 0xCDF9B148, paramInteger);
  }
  
  public void onUpdate() {
    Perry1.3z(this, (int)986941928L ^ 0x2AC23E1E);
  }
  
  @SubscribeEvent
  public void onSettingChange(ClientEvent event) {
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
  
  public Map getTextRadarPlayers() {
    return Perry1.0h(this, (int)-1780271677L ^ 0xFCFC4A12);
  }
  
  public void onRender2D(Render2DEvent event) {
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
  
  public ArrayListZ() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1468264096
    //   9: l2i
    //   10: ldc_w 1222818961
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -904184488
    //   20: l2i
    //   21: ldc_w 1145344785
    //   24: ixor
    //   25: ldc2_w -83009407
    //   28: l2i
    //   29: ldc_w 711135156
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 2268, -837862140 -> 17, 1597096316 -> 60
    //   60: aload_0
    //   61: ldc_w 'ጪ㌁፻㶶ꁹﶛ๰溽蹷'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -1590367803
    //   73: l2i
    //   74: ldc_w -445117311
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 179612366
    //   84: l2i
    //   85: ldc_w 77435101
    //   88: ixor
    //   89: ldc2_w 1814576886
    //   92: l2i
    //   93: ldc_w 728530195
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -974260761 -> 81, 50898593 -> 2276
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w 'ጊ㌁፻㶶ꁹﶧ๶溡蹳'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 1752312652
    //   139: l2i
    //   140: ldc_w 218763688
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -994021570
    //   150: l2i
    //   151: ldc_w -1719448370
    //   154: ixor
    //   155: ldc2_w 609889607
    //   158: l2i
    //   159: ldc_w 1182424372
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 2306, 123226775 -> 147, 1063474051 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 212
    //   201: ldc2_w -948341516
    //   204: l2i
    //   205: ldc_w -422094887
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -521814221
    //   215: l2i
    //   216: ldc_w -753263614
    //   219: ixor
    //   220: ldc2_w 948552069
    //   223: l2i
    //   224: ldc_w -1673905815
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -2061640767 -> 2304, 1969481531 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 720720957
    //   262: l2i
    //   263: ldc_w 720720956
    //   266: ixor
    //   267: ldc2_w -172749102
    //   270: l2i
    //   271: ldc_w -172749102
    //   274: ixor
    //   275: ldc2_w 1151194649
    //   278: l2i
    //   279: ldc_w 1151194649
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -575490949
    //   292: l2i
    //   293: ldc_w -1389385385
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1526309702
    //   303: l2i
    //   304: ldc_w 273865257
    //   307: ixor
    //   308: ldc2_w -1601076472
    //   311: l2i
    //   312: ldc_w 1073333550
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 2294, -708624567 -> 344, -269133046 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w -200754187
    //   356: l2i
    //   357: ldc_w -1647789606
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -895713950
    //   367: l2i
    //   368: ldc_w 828254357
    //   371: ixor
    //   372: ldc2_w -879871990
    //   375: l2i
    //   376: ldc_w 1296547781
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 2284, -284588576 -> 364, 2097926712 -> 408
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 568831155
    //   418: l2i
    //   419: ldc_w -1980960564
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -2130487432
    //   429: l2i
    //   430: ldc_w -1749603623
    //   433: ixor
    //   434: ldc2_w 1065168135
    //   437: l2i
    //   438: ldc_w 1076244179
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -682598485 -> 2312, 1375974318 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w 'ጹ㌖፧㶳ꁥﶥ์溾'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -423723222
    //   485: l2i
    //   486: ldc_w 1060369802
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 98887268
    //   496: l2i
    //   497: ldc_w 469451084
    //   500: ixor
    //   501: ldc2_w 953707957
    //   504: l2i
    //   505: ldc_w -2055931289
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, 1679891826 -> 2322, 1774743443 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1893896203
    //   542: l2i
    //   543: ldc_w 1893896203
    //   546: ixor
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w -898605944
    //   556: l2i
    //   557: ldc_w 424087776
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1191835359
    //   567: l2i
    //   568: ldc_w 1764472186
    //   571: ixor
    //   572: ldc2_w -1930928508
    //   575: l2i
    //   576: ldc_w 1526827173
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -301933431 -> 564, 81697353 -> 2316
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: ldc_w ''
    //   614: getstatic Perryc.1 : I
    //   617: ifeq -> 631
    //   620: ldc2_w 907075631
    //   623: l2i
    //   624: ldc_w 1091555277
    //   627: ixor
    //   628: goto -> 639
    //   631: ldc2_w 1066223346
    //   634: l2i
    //   635: ldc_w 1427066634
    //   638: ixor
    //   639: ldc2_w -390011699
    //   642: l2i
    //   643: ldc_w 31158074
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 2286, -2087091697 -> 676, -1643863019 -> 631
    //   676: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   679: getstatic Perryc.c : I
    //   682: iflt -> 696
    //   685: ldc2_w 720275560
    //   688: l2i
    //   689: ldc_w -2024198520
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 1844445559
    //   699: l2i
    //   700: ldc_w -140333923
    //   703: ixor
    //   704: ldc2_w 1805445549
    //   707: l2i
    //   708: ldc_w -111752881
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 2292, 144215304 -> 740, 1065190914 -> 696
    //   740: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   743: getstatic Perryc.c : I
    //   746: iflt -> 760
    //   749: ldc2_w -305755571
    //   752: l2i
    //   753: ldc_w 284120385
    //   756: ixor
    //   757: goto -> 768
    //   760: ldc2_w 312788791
    //   763: l2i
    //   764: ldc_w -383822753
    //   767: ixor
    //   768: ldc2_w -453596033
    //   771: l2i
    //   772: ldc_w 846339884
    //   775: ixor
    //   776: ixor
    //   777: lookupswitch default -> 2324, 732785759 -> 760, 759111739 -> 804
    //   804: putfield renderingUp : Lbigname/zprestige/webhack/features/setting/Setting;
    //   807: getstatic Perryc.1 : I
    //   810: ifeq -> 824
    //   813: ldc2_w 3638940
    //   816: l2i
    //   817: ldc_w -1369301532
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -1118345794
    //   827: l2i
    //   828: ldc_w -342413702
    //   831: ixor
    //   832: ldc2_w -1971871422
    //   835: l2i
    //   836: ldc_w 308618009
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 868, 696933578 -> 824, 910629155 -> 2328
    //   868: aload_0
    //   869: getstatic Perryc.0 : I
    //   872: ifle -> 886
    //   875: ldc2_w 1000683536
    //   878: l2i
    //   879: ldc_w 1565969988
    //   882: ixor
    //   883: goto -> 894
    //   886: ldc2_w -1699534769
    //   889: l2i
    //   890: ldc_w 171731637
    //   893: ixor
    //   894: ldc2_w 347644185
    //   897: l2i
    //   898: ldc_w 750508619
    //   901: ixor
    //   902: ixor
    //   903: lookupswitch default -> 928, 1190520324 -> 886, 1592823046 -> 2326
    //   928: aload_0
    //   929: new bigname/zprestige/webhack/features/setting/Setting
    //   932: dup
    //   933: ldc_w 'ጹ㌖፧㶳ꁥﶥ์溾蹚'
    //   936: getstatic Perryc.c : I
    //   939: iflt -> 953
    //   942: ldc2_w -91347484
    //   945: l2i
    //   946: ldc_w 455475725
    //   949: ixor
    //   950: goto -> 961
    //   953: ldc2_w 1168333922
    //   956: l2i
    //   957: ldc_w 128135851
    //   960: ixor
    //   961: ldc2_w -145387304
    //   964: l2i
    //   965: ldc_w -1131540134
    //   968: ixor
    //   969: ixor
    //   970: lookupswitch default -> 2330, -1435261333 -> 953, 165408587 -> 996
    //   996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   999: ldc2_w 1188441490
    //   1002: l2i
    //   1003: ldc_w 1188441490
    //   1006: ixor
    //   1007: getstatic Perryc.1 : I
    //   1010: ifeq -> 1024
    //   1013: ldc2_w -1073703937
    //   1016: l2i
    //   1017: ldc_w -462733774
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w 2085314416
    //   1027: l2i
    //   1028: ldc_w 2017439490
    //   1031: ixor
    //   1032: ldc2_w 691291947
    //   1035: l2i
    //   1036: ldc_w -549990864
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 1068, -1192702846 -> 1024, -764926762 -> 2296
    //   1068: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1071: ldc2_w -1509907605
    //   1074: l2i
    //   1075: ldc_w -1509907605
    //   1078: ixor
    //   1079: getstatic Perryc.c : I
    //   1082: iflt -> 1096
    //   1085: ldc2_w -1231571861
    //   1088: l2i
    //   1089: ldc_w 1030674286
    //   1092: ixor
    //   1093: goto -> 1104
    //   1096: ldc2_w 1318030018
    //   1099: l2i
    //   1100: ldc_w 2009641649
    //   1103: ixor
    //   1104: ldc2_w -983385851
    //   1107: l2i
    //   1108: ldc_w -1992587044
    //   1111: ixor
    //   1112: ixor
    //   1113: lookupswitch default -> 1140, -945794340 -> 2310, 1737707752 -> 1096
    //   1140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1143: ldc2_w -1320410616
    //   1146: l2i
    //   1147: ldc_w -1320411130
    //   1150: ixor
    //   1151: getstatic Perryc.0 : I
    //   1154: ifle -> 1168
    //   1157: ldc2_w -642896503
    //   1160: l2i
    //   1161: ldc_w 425395279
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w -322690175
    //   1171: l2i
    //   1172: ldc_w -1658233460
    //   1175: ixor
    //   1176: ldc2_w -1597865105
    //   1179: l2i
    //   1180: ldc_w 476798098
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 2320, -851140112 -> 1212, 2086467131 -> 1168
    //   1212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1215: getstatic Perryc.0 : I
    //   1218: ifle -> 1232
    //   1221: ldc2_w 279547884
    //   1224: l2i
    //   1225: ldc_w -1280137964
    //   1228: ixor
    //   1229: goto -> 1240
    //   1232: ldc2_w 1087517248
    //   1235: l2i
    //   1236: ldc_w -1063573589
    //   1239: ixor
    //   1240: ldc2_w -1538061448
    //   1243: l2i
    //   1244: ldc_w -332392841
    //   1247: ixor
    //   1248: ixor
    //   1249: lookupswitch default -> 2298, -936769308 -> 1276, -344442889 -> 1232
    //   1276: aload_0
    //   1277: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/ArrayListZ;)Ljava/util/function/Predicate;
    //   1282: getstatic Perryc.1 : I
    //   1285: ifeq -> 1299
    //   1288: ldc2_w -806726238
    //   1291: l2i
    //   1292: ldc_w -1586016654
    //   1295: ixor
    //   1296: goto -> 1307
    //   1299: ldc2_w 225319696
    //   1302: l2i
    //   1303: ldc_w -1621617656
    //   1306: ixor
    //   1307: ldc2_w 667125885
    //   1310: l2i
    //   1311: ldc_w 1680401626
    //   1314: ixor
    //   1315: ixor
    //   1316: lookupswitch default -> 1344, -1422030547 -> 1299, 762738551 -> 2270
    //   1344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1347: getstatic Perryc.c : I
    //   1350: iflt -> 1364
    //   1353: ldc2_w 1113501056
    //   1356: l2i
    //   1357: ldc_w 2070972767
    //   1360: ixor
    //   1361: goto -> 1372
    //   1364: ldc2_w -1659694651
    //   1367: l2i
    //   1368: ldc_w -580548063
    //   1371: ixor
    //   1372: ldc2_w -731416977
    //   1375: l2i
    //   1376: ldc_w -1574005855
    //   1379: ixor
    //   1380: ixor
    //   1381: lookupswitch default -> 1408, -353016118 -> 1364, 1332199697 -> 2318
    //   1408: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1411: getstatic Perryc.c : I
    //   1414: iflt -> 1428
    //   1417: ldc2_w -814372299
    //   1420: l2i
    //   1421: ldc_w -1768864004
    //   1424: ixor
    //   1425: goto -> 1436
    //   1428: ldc2_w -680129250
    //   1431: l2i
    //   1432: ldc_w 1822677097
    //   1435: ixor
    //   1436: ldc2_w 1981873362
    //   1439: l2i
    //   1440: ldc_w -1846527034
    //   1443: ixor
    //   1444: ixor
    //   1445: lookupswitch default -> 2274, -1103877155 -> 1428, 1543836259 -> 1472
    //   1472: putfield arrayListY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1475: getstatic Perryc.0 : I
    //   1478: ifle -> 1492
    //   1481: ldc2_w -213508378
    //   1484: l2i
    //   1485: ldc_w -67779075
    //   1488: ixor
    //   1489: goto -> 1500
    //   1492: ldc2_w 1990967905
    //   1495: l2i
    //   1496: ldc_w -2040040024
    //   1499: ixor
    //   1500: ldc2_w -210463436
    //   1503: l2i
    //   1504: ldc_w 53044693
    //   1507: ixor
    //   1508: ixor
    //   1509: lookupswitch default -> 2334, -118608902 -> 1492, 9520936 -> 1536
    //   1536: aload_0
    //   1537: getstatic Perryc.c : I
    //   1540: iflt -> 1554
    //   1543: ldc2_w 1221766485
    //   1546: l2i
    //   1547: ldc_w 1169020638
    //   1550: ixor
    //   1551: goto -> 1562
    //   1554: ldc2_w 1134552843
    //   1557: l2i
    //   1558: ldc_w -70008928
    //   1561: ixor
    //   1562: ldc2_w 390163640
    //   1565: l2i
    //   1566: ldc_w 1552590867
    //   1569: ixor
    //   1570: ixor
    //   1571: lookupswitch default -> 1596, 1186250528 -> 2300, 1763044751 -> 1554
    //   1596: aload_0
    //   1597: new bigname/zprestige/webhack/features/setting/Setting
    //   1600: dup
    //   1601: ldc_w 'ጥ㌜፻㶺ꁡﶻเ'
    //   1604: getstatic Perryc.0 : I
    //   1607: ifle -> 1621
    //   1610: ldc2_w -93512051
    //   1613: l2i
    //   1614: ldc_w -518907045
    //   1617: ixor
    //   1618: goto -> 1629
    //   1621: ldc2_w -1695237823
    //   1624: l2i
    //   1625: ldc_w -349728190
    //   1628: ixor
    //   1629: ldc2_w 1289971441
    //   1632: l2i
    //   1633: ldc_w 1868323255
    //   1636: ixor
    //   1637: ixor
    //   1638: lookupswitch default -> 1664, 446839718 -> 1621, 952122000 -> 2272
    //   1664: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1667: ldc2_w 1454097065
    //   1670: l2i
    //   1671: ldc_w 1454097065
    //   1674: ixor
    //   1675: getstatic Perryc.0 : I
    //   1678: ifle -> 1692
    //   1681: ldc2_w -2046383577
    //   1684: l2i
    //   1685: ldc_w -645163791
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w 1080782400
    //   1695: l2i
    //   1696: ldc_w 1772996042
    //   1699: ixor
    //   1700: ldc2_w -1463030775
    //   1703: l2i
    //   1704: ldc_w -1051564435
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 2288, 907326642 -> 1692, 1079976430 -> 1736
    //   1736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1739: ldc2_w 336078480
    //   1742: l2i
    //   1743: ldc_w 336078480
    //   1746: ixor
    //   1747: getstatic Perryc.0 : I
    //   1750: ifle -> 1764
    //   1753: ldc2_w -1148470709
    //   1756: l2i
    //   1757: ldc_w -1763924408
    //   1760: ixor
    //   1761: goto -> 1772
    //   1764: ldc2_w 855072113
    //   1767: l2i
    //   1768: ldc_w 1110897176
    //   1771: ixor
    //   1772: ldc2_w -1127501334
    //   1775: l2i
    //   1776: ldc_w 102014718
    //   1779: ixor
    //   1780: ixor
    //   1781: lookupswitch default -> 1808, -1752681705 -> 2278, -1473617281 -> 1764
    //   1808: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1811: ldc2_w -1888596859
    //   1814: l2i
    //   1815: ldc_w -1888596341
    //   1818: ixor
    //   1819: getstatic Perryc.1 : I
    //   1822: ifeq -> 1836
    //   1825: ldc2_w -1596978972
    //   1828: l2i
    //   1829: ldc_w 1673520157
    //   1832: ixor
    //   1833: goto -> 1844
    //   1836: ldc2_w 389546727
    //   1839: l2i
    //   1840: ldc_w -1497619139
    //   1843: ixor
    //   1844: ldc2_w -2003008837
    //   1847: l2i
    //   1848: ldc_w -116753382
    //   1851: ixor
    //   1852: ixor
    //   1853: lookupswitch default -> 1880, -1292299688 -> 2290, 2110283634 -> 1836
    //   1880: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1883: getstatic Perryc.1 : I
    //   1886: ifeq -> 1900
    //   1889: ldc2_w -434879845
    //   1892: l2i
    //   1893: ldc_w 1379924491
    //   1896: ixor
    //   1897: goto -> 1908
    //   1900: ldc2_w -1375644803
    //   1903: l2i
    //   1904: ldc_w -613128796
    //   1907: ixor
    //   1908: ldc2_w -658892846
    //   1911: l2i
    //   1912: ldc_w -1660170358
    //   1915: ixor
    //   1916: ixor
    //   1917: lookupswitch default -> 2282, -241540920 -> 1900, 818212481 -> 1944
    //   1944: aload_0
    //   1945: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Hud/ArrayListZ;)Ljava/util/function/Predicate;
    //   1950: getstatic Perryc.0 : I
    //   1953: ifle -> 1967
    //   1956: ldc2_w -2125334318
    //   1959: l2i
    //   1960: ldc_w -1450377082
    //   1963: ixor
    //   1964: goto -> 1975
    //   1967: ldc2_w 1141201748
    //   1970: l2i
    //   1971: ldc_w 1530306185
    //   1974: ixor
    //   1975: ldc2_w -537438183
    //   1978: l2i
    //   1979: ldc_w -594956967
    //   1982: ixor
    //   1983: ixor
    //   1984: lookupswitch default -> 2012, 732040468 -> 2302, 1118553985 -> 1967
    //   2012: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2015: getstatic Perryc.0 : I
    //   2018: ifle -> 2032
    //   2021: ldc2_w 503795169
    //   2024: l2i
    //   2025: ldc_w 1057050360
    //   2028: ixor
    //   2029: goto -> 2040
    //   2032: ldc2_w -654981323
    //   2035: l2i
    //   2036: ldc_w -1373738525
    //   2039: ixor
    //   2040: ldc2_w -1936830894
    //   2043: l2i
    //   2044: ldc_w -1012063013
    //   2047: ixor
    //   2048: ixor
    //   2049: lookupswitch default -> 2076, 1686995069 -> 2032, 1847945616 -> 2308
    //   2076: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2079: getstatic Perryc.1 : I
    //   2082: ifeq -> 2096
    //   2085: ldc2_w 1862149083
    //   2088: l2i
    //   2089: ldc_w 1896840489
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w -1040107533
    //   2099: l2i
    //   2100: ldc_w 1588561648
    //   2103: ixor
    //   2104: ldc2_w -610964854
    //   2107: l2i
    //   2108: ldc_w -975161305
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 2314, -2099518546 -> 2140, 25431135 -> 2096
    //   2140: putfield arrayListY2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2143: getstatic Perryc.0 : I
    //   2146: ifle -> 2160
    //   2149: ldc2_w -1275584486
    //   2152: l2i
    //   2153: ldc_w 910036262
    //   2156: ixor
    //   2157: goto -> 2168
    //   2160: ldc2_w -106292865
    //   2163: l2i
    //   2164: ldc_w 63112821
    //   2167: ixor
    //   2168: ldc2_w 1821599959
    //   2171: l2i
    //   2172: ldc_w -711099057
    //   2175: ixor
    //   2176: ixor
    //   2177: lookupswitch default -> 2204, -1738643241 -> 2160, 1019754660 -> 2280
    //   2204: aload_0
    //   2205: getstatic Perryc.1 : I
    //   2208: ifeq -> 2222
    //   2211: ldc2_w 527757618
    //   2214: l2i
    //   2215: ldc_w 12496238
    //   2218: ixor
    //   2219: goto -> 2230
    //   2222: ldc2_w -2016418774
    //   2225: l2i
    //   2226: ldc_w -1677415766
    //   2229: ixor
    //   2230: ldc2_w 1577751347
    //   2233: l2i
    //   2234: ldc_w 156816960
    //   2237: ixor
    //   2238: ixor
    //   2239: lookupswitch default -> 2332, 1217927471 -> 2222, 1285098483 -> 2264
    //   2264: invokespecial setInstance : ()V
    //   2267: return
    //   2268: aconst_null
    //   2269: athrow
    //   2270: aconst_null
    //   2271: athrow
    //   2272: aconst_null
    //   2273: athrow
    //   2274: aconst_null
    //   2275: athrow
    //   2276: aconst_null
    //   2277: athrow
    //   2278: aconst_null
    //   2279: athrow
    //   2280: aconst_null
    //   2281: athrow
    //   2282: aconst_null
    //   2283: athrow
    //   2284: aconst_null
    //   2285: athrow
    //   2286: aconst_null
    //   2287: athrow
    //   2288: aconst_null
    //   2289: athrow
    //   2290: aconst_null
    //   2291: athrow
    //   2292: aconst_null
    //   2293: athrow
    //   2294: aconst_null
    //   2295: athrow
    //   2296: aconst_null
    //   2297: athrow
    //   2298: aconst_null
    //   2299: athrow
    //   2300: aconst_null
    //   2301: athrow
    //   2302: aconst_null
    //   2303: athrow
    //   2304: aconst_null
    //   2305: athrow
    //   2306: aconst_null
    //   2307: athrow
    //   2308: aconst_null
    //   2309: athrow
    //   2310: aconst_null
    //   2311: athrow
    //   2312: aconst_null
    //   2313: athrow
    //   2314: aconst_null
    //   2315: athrow
    //   2316: aconst_null
    //   2317: athrow
    //   2318: aconst_null
    //   2319: athrow
    //   2320: aconst_null
    //   2321: athrow
    //   2322: aconst_null
    //   2323: athrow
    //   2324: aconst_null
    //   2325: athrow
    //   2326: aconst_null
    //   2327: athrow
    //   2328: aconst_null
    //   2329: athrow
    //   2330: aconst_null
    //   2331: athrow
    //   2332: aconst_null
    //   2333: athrow
    //   2334: aconst_null
    //   2335: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2268	0	this	Lbigname/zprestige/webhack/features/modules/Hud/ArrayListZ;
  }
  
  public boolean lambda$new$1(Integer paramInteger) {
    return Perry1.5z(this, (int)1355196226L ^ 0x2E367D2, paramInteger);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\ArrayListZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */