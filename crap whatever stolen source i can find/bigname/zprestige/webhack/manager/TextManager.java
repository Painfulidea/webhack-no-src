package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.gui.font.CustomFont;
import bigname.zprestige.webhack.util.Timer;
import java.awt.Font;

public class TextManager extends Feature {
  public int scaledWidth;
  
  public int scaleFactor;
  
  public boolean idling;
  
  public CustomFont customFont;
  
  public int scaledHeight;
  
  public Timer idleTimer;
  
  public Font getCurrentFont() {
    return Perry1.P(this, (int)1003126170L ^ 0xEFEE3DC);
  }
  
  public void drawStringWithShadow(String text, float x, float y, int color) {
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
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setFontRenderer(Font font, boolean antiAlias, boolean fractionalMetrics) {
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
  
  public TextManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -990968304
    //   9: l2i
    //   10: ldc 956371520
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -2101967759
    //   19: l2i
    //   20: ldc -1777831387
    //   22: ixor
    //   23: ldc2_w -1979735654
    //   26: l2i
    //   27: ldc 1912847023
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 802, -280826527 -> 56, 101846885 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 700974276
    //   66: l2i
    //   67: ldc 522778950
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -459063802
    //   76: l2i
    //   77: ldc -705795486
    //   79: ixor
    //   80: ldc2_w -340260663
    //   83: l2i
    //   84: ldc -150176352
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 786, 710183147 -> 73, 771301645 -> 116
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1027030733
    //   128: l2i
    //   129: ldc 655359345
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 93474274
    //   138: l2i
    //   139: ldc 258613458
    //   141: ixor
    //   142: ldc2_w -1320574504
    //   145: l2i
    //   146: ldc 2089525444
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -671432032 -> 788, -314235433 -> 135
    //   176: aload_0
    //   177: new bigname/zprestige/webhack/util/Timer
    //   180: dup
    //   181: getstatic Perryc.0 : I
    //   184: ifle -> 197
    //   187: ldc2_w -1293142882
    //   190: l2i
    //   191: ldc -1716031933
    //   193: ixor
    //   194: goto -> 204
    //   197: ldc2_w -1203474390
    //   200: l2i
    //   201: ldc 814503466
    //   203: ixor
    //   204: ldc2_w 1430046610
    //   207: l2i
    //   208: ldc 1486059771
    //   210: ixor
    //   211: ixor
    //   212: lookupswitch default -> 796, -2056808087 -> 240, 653583796 -> 197
    //   240: invokespecial <init> : ()V
    //   243: getstatic Perryc.1 : I
    //   246: ifeq -> 259
    //   249: ldc2_w 1292899214
    //   252: l2i
    //   253: ldc -954469511
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w 147530010
    //   262: l2i
    //   263: ldc 1444746456
    //   265: ixor
    //   266: ldc2_w -1329231998
    //   269: l2i
    //   270: ldc -566591182
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 300, -755506051 -> 259, -453712313 -> 798
    //   300: putfield idleTimer : Lbigname/zprestige/webhack/util/Timer;
    //   303: getstatic Perryc.1 : I
    //   306: ifeq -> 319
    //   309: ldc2_w -332699868
    //   312: l2i
    //   313: ldc -1006481043
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w 174909870
    //   322: l2i
    //   323: ldc -1862979064
    //   325: ixor
    //   326: ldc2_w 1075365360
    //   329: l2i
    //   330: ldc_w 944845528
    //   333: ixor
    //   334: ixor
    //   335: lookupswitch default -> 360, 580621482 -> 319, 1348518241 -> 804
    //   360: aload_0
    //   361: new bigname/zprestige/webhack/features/gui/font/CustomFont
    //   364: dup
    //   365: new java/awt/Font
    //   368: dup
    //   369: ldc_w '砢㌖硬㶳잒隦๸'
    //   372: getstatic Perryc.c : I
    //   375: iflt -> 389
    //   378: ldc2_w 1447095934
    //   381: l2i
    //   382: ldc_w 619938363
    //   385: ixor
    //   386: goto -> 397
    //   389: ldc2_w 443479374
    //   392: l2i
    //   393: ldc_w -1616305000
    //   396: ixor
    //   397: ldc2_w 1124591609
    //   400: l2i
    //   401: ldc_w -305186847
    //   404: ixor
    //   405: ixor
    //   406: lookupswitch default -> 432, -1722268675 -> 389, -595870627 -> 784
    //   432: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   435: ldc2_w -1521806490
    //   438: l2i
    //   439: ldc_w -1521806490
    //   442: ixor
    //   443: ldc2_w 1226375632
    //   446: l2i
    //   447: ldc_w 1226375617
    //   450: ixor
    //   451: getstatic Perryc.0 : I
    //   454: ifle -> 468
    //   457: ldc2_w -1861906642
    //   460: l2i
    //   461: ldc_w -1259416154
    //   464: ixor
    //   465: goto -> 476
    //   468: ldc2_w 1058136524
    //   471: l2i
    //   472: ldc_w -1810566972
    //   475: ixor
    //   476: ldc2_w -111550993
    //   479: l2i
    //   480: ldc_w 1869886664
    //   483: ixor
    //   484: ixor
    //   485: lookupswitch default -> 512, -1278823505 -> 806, -439649922 -> 468
    //   512: invokespecial <init> : (Ljava/lang/String;II)V
    //   515: ldc2_w 995361546
    //   518: l2i
    //   519: ldc_w 995361547
    //   522: ixor
    //   523: ldc2_w 2056026470
    //   526: l2i
    //   527: ldc_w 2056026470
    //   530: ixor
    //   531: getstatic Perryc.c : I
    //   534: iflt -> 548
    //   537: ldc2_w 2109919468
    //   540: l2i
    //   541: ldc_w -1255504814
    //   544: ixor
    //   545: goto -> 556
    //   548: ldc2_w 1749239908
    //   551: l2i
    //   552: ldc_w -799367301
    //   555: ixor
    //   556: ldc2_w 1254056493
    //   559: l2i
    //   560: ldc_w -653278762
    //   563: ixor
    //   564: ixor
    //   565: lookupswitch default -> 790, 732525796 -> 592, 1532557125 -> 548
    //   592: invokespecial <init> : (Ljava/awt/Font;ZZ)V
    //   595: getstatic Perryc.1 : I
    //   598: ifeq -> 612
    //   601: ldc2_w -1090156411
    //   604: l2i
    //   605: ldc_w -1548914423
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w -1213575668
    //   615: l2i
    //   616: ldc_w 812532728
    //   619: ixor
    //   620: ldc2_w -115128946
    //   623: l2i
    //   624: ldc_w 964243443
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 656, -588082191 -> 792, 288787600 -> 612
    //   656: putfield customFont : Lbigname/zprestige/webhack/features/gui/font/CustomFont;
    //   659: getstatic Perryc.1 : I
    //   662: ifeq -> 676
    //   665: ldc2_w -1102278351
    //   668: l2i
    //   669: ldc_w -1241075235
    //   672: ixor
    //   673: goto -> 684
    //   676: ldc2_w -200190087
    //   679: l2i
    //   680: ldc_w 433513136
    //   683: ixor
    //   684: ldc2_w 1457761338
    //   687: l2i
    //   688: ldc_w -1104810796
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 794, -527671294 -> 676, 84014375 -> 720
    //   720: aload_0
    //   721: getstatic Perryc.c : I
    //   724: iflt -> 738
    //   727: ldc2_w -1589060244
    //   730: l2i
    //   731: ldc_w -1093356548
    //   734: ixor
    //   735: goto -> 746
    //   738: ldc2_w -187064211
    //   741: l2i
    //   742: ldc_w 1746699627
    //   745: ixor
    //   746: ldc2_w 1466238783
    //   749: l2i
    //   750: ldc_w -58395621
    //   753: ixor
    //   754: ixor
    //   755: lookupswitch default -> 780, -1266836044 -> 800, 1187220267 -> 738
    //   780: invokevirtual updateResolution : ()V
    //   783: return
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
    //   806: aconst_null
    //   807: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	784	0	this	Lbigname/zprestige/webhack/manager/TextManager;
  }
  
  public int getStringWidth(String paramString) {
    return Perry1.18(this, (int)-480074513L ^ 0xCAA40D22, paramString);
  }
  
  public void drawString(String text, float x, float y, int color, boolean shadow) {
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
  
  public void init(boolean startup) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1867
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1859
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1851
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 675412721
    //   33: l2i
    //   34: ldc_w -1227640241
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1270737326
    //   44: l2i
    //   45: ldc_w 437829167
    //   48: ixor
    //   49: ldc2_w 291086134
    //   52: l2i
    //   53: ldc_w -1650041843
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1633121126 -> 41, 309169029 -> 1810
    //   84: getstatic bigname/zprestige/webhack/WebHack.moduleManager : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   87: ldc_w bigname/zprestige/webhack/features/modules/Client/FontMod
    //   90: getstatic Perryc.c : I
    //   93: iflt -> 107
    //   96: ldc2_w -166873043
    //   99: l2i
    //   100: ldc_w -86306676
    //   103: ixor
    //   104: goto -> 115
    //   107: ldc2_w -1732749082
    //   110: l2i
    //   111: ldc_w -1003902443
    //   114: ixor
    //   115: ldc2_w -487421068
    //   118: l2i
    //   119: ldc_w -612517034
    //   122: ixor
    //   123: ixor
    //   124: lookupswitch default -> 152, -24366145 -> 107, 895064195 -> 1814
    //   152: goto -> 156
    //   155: athrow
    //   156: invokevirtual getModuleByClass : (Ljava/lang/Class;)Lbigname/zprestige/webhack/features/modules/Module;
    //   159: goto -> 163
    //   162: athrow
    //   163: checkcast bigname/zprestige/webhack/features/modules/Client/FontMod
    //   166: getstatic Perryc.0 : I
    //   169: ifle -> 183
    //   172: ldc2_w -802102198
    //   175: l2i
    //   176: ldc_w -8807009
    //   179: ixor
    //   180: goto -> 191
    //   183: ldc2_w 1773331014
    //   186: l2i
    //   187: ldc_w 1649136019
    //   190: ixor
    //   191: ldc2_w -1620610342
    //   194: l2i
    //   195: ldc_w -1907150224
    //   198: ixor
    //   199: ixor
    //   200: lookupswitch default -> 228, -329875048 -> 183, 1048394111 -> 1826
    //   228: astore_2
    //   229: getstatic Perryc.0 : I
    //   232: ifle -> 246
    //   235: ldc2_w -1673921870
    //   238: l2i
    //   239: ldc_w -1947571548
    //   242: ixor
    //   243: goto -> 254
    //   246: ldc2_w -1183356607
    //   249: l2i
    //   250: ldc_w 1163642917
    //   253: ixor
    //   254: ldc2_w 533756102
    //   257: l2i
    //   258: ldc_w -1345331766
    //   261: ixor
    //   262: ixor
    //   263: lookupswitch default -> 1812, -1479789286 -> 246, 1278411880 -> 288
    //   288: aload_0
    //   289: new java/awt/Font
    //   292: dup
    //   293: getstatic Perryc.0 : I
    //   296: ifle -> 310
    //   299: ldc2_w -1683112722
    //   302: l2i
    //   303: ldc_w -67072880
    //   306: ixor
    //   307: goto -> 318
    //   310: ldc2_w -1468122539
    //   313: l2i
    //   314: ldc_w 1227256882
    //   317: ixor
    //   318: ldc2_w 882994653
    //   321: l2i
    //   322: ldc_w 2002392673
    //   325: ixor
    //   326: ixor
    //   327: lookupswitch default -> 1830, -1566362149 -> 352, 609635266 -> 310
    //   352: aload_2
    //   353: getstatic Perryc.c : I
    //   356: iflt -> 370
    //   359: ldc2_w 887311936
    //   362: l2i
    //   363: ldc_w -975896799
    //   366: ixor
    //   367: goto -> 378
    //   370: ldc2_w -814202828
    //   373: l2i
    //   374: ldc_w 659641589
    //   377: ixor
    //   378: ldc2_w -703275776
    //   381: l2i
    //   382: ldc_w -1283776054
    //   385: ixor
    //   386: ixor
    //   387: lookupswitch default -> 1822, -1924732917 -> 412, -1806152277 -> 370
    //   412: getfield fontName : Lbigname/zprestige/webhack/features/setting/Setting;
    //   415: getstatic Perryc.0 : I
    //   418: ifle -> 432
    //   421: ldc2_w -1260340356
    //   424: l2i
    //   425: ldc_w -1382292280
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w 599338165
    //   435: l2i
    //   436: ldc_w 312578647
    //   439: ixor
    //   440: ldc2_w -716086371
    //   443: l2i
    //   444: ldc_w -1619494284
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 1804, 1397900893 -> 432, 2066851595 -> 476
    //   476: goto -> 480
    //   479: athrow
    //   480: invokevirtual getValue : ()Ljava/lang/Object;
    //   483: goto -> 487
    //   486: athrow
    //   487: checkcast java/lang/String
    //   490: getstatic Perryc.1 : I
    //   493: ifeq -> 507
    //   496: ldc2_w 801756804
    //   499: l2i
    //   500: ldc_w -1057421163
    //   503: ixor
    //   504: goto -> 515
    //   507: ldc2_w 1845497086
    //   510: l2i
    //   511: ldc_w 1433804278
    //   514: ixor
    //   515: ldc2_w -244374761
    //   518: l2i
    //   519: ldc_w -1650684676
    //   522: ixor
    //   523: ixor
    //   524: lookupswitch default -> 552, -2084343302 -> 1838, -1544742320 -> 507
    //   552: aload_2
    //   553: getstatic Perryc.c : I
    //   556: iflt -> 570
    //   559: ldc2_w -108902708
    //   562: l2i
    //   563: ldc_w 1735203945
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -1419867356
    //   573: l2i
    //   574: ldc_w -2016172326
    //   577: ixor
    //   578: ldc2_w -762416323
    //   581: l2i
    //   582: ldc_w 205118930
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 612, 251600048 -> 570, 1079571530 -> 1816
    //   612: getfield fontStyle : Lbigname/zprestige/webhack/features/setting/Setting;
    //   615: getstatic Perryc.0 : I
    //   618: ifle -> 632
    //   621: ldc2_w -819142606
    //   624: l2i
    //   625: ldc_w -891346008
    //   628: ixor
    //   629: goto -> 640
    //   632: ldc2_w 575802701
    //   635: l2i
    //   636: ldc_w -32529337
    //   639: ixor
    //   640: ldc2_w 1678570045
    //   643: l2i
    //   644: ldc_w -2021554005
    //   647: ixor
    //   648: ixor
    //   649: lookupswitch default -> 676, -427902708 -> 1840, 467678962 -> 632
    //   676: goto -> 680
    //   679: athrow
    //   680: invokevirtual getValue : ()Ljava/lang/Object;
    //   683: goto -> 687
    //   686: athrow
    //   687: checkcast java/lang/Integer
    //   690: getstatic Perryc.0 : I
    //   693: ifle -> 707
    //   696: ldc2_w 544401682
    //   699: l2i
    //   700: ldc_w 2059932206
    //   703: ixor
    //   704: goto -> 715
    //   707: ldc2_w 97317707
    //   710: l2i
    //   711: ldc_w -1979768540
    //   714: ixor
    //   715: ldc2_w 896501929
    //   718: l2i
    //   719: ldc_w 164231049
    //   722: ixor
    //   723: ixor
    //   724: lookupswitch default -> 752, -374959626 -> 707, 1713144860 -> 1796
    //   752: goto -> 756
    //   755: athrow
    //   756: invokevirtual intValue : ()I
    //   759: goto -> 763
    //   762: athrow
    //   763: getstatic Perryc.1 : I
    //   766: ifeq -> 780
    //   769: ldc2_w 1333224755
    //   772: l2i
    //   773: ldc_w 471367205
    //   776: ixor
    //   777: goto -> 788
    //   780: ldc2_w -70472570
    //   783: l2i
    //   784: ldc_w 649483397
    //   787: ixor
    //   788: ldc2_w -469840768
    //   791: l2i
    //   792: ldc_w 1299942936
    //   795: ixor
    //   796: ixor
    //   797: lookupswitch default -> 1798, -34973298 -> 780, 1946139291 -> 824
    //   824: aload_2
    //   825: getstatic Perryc.1 : I
    //   828: ifeq -> 842
    //   831: ldc2_w 342031071
    //   834: l2i
    //   835: ldc_w 1747674055
    //   838: ixor
    //   839: goto -> 850
    //   842: ldc2_w -1695732745
    //   845: l2i
    //   846: ldc_w 2146795324
    //   849: ixor
    //   850: ldc2_w -1372602446
    //   853: l2i
    //   854: ldc_w 1019232113
    //   857: ixor
    //   858: ixor
    //   859: lookupswitch default -> 884, -1576144370 -> 842, -291104293 -> 1832
    //   884: getfield fontSize : Lbigname/zprestige/webhack/features/setting/Setting;
    //   887: getstatic Perryc.c : I
    //   890: iflt -> 904
    //   893: ldc2_w -1063443663
    //   896: l2i
    //   897: ldc_w 952780286
    //   900: ixor
    //   901: goto -> 912
    //   904: ldc2_w -1606335889
    //   907: l2i
    //   908: ldc_w 277864823
    //   911: ixor
    //   912: ldc2_w 1680138977
    //   915: l2i
    //   916: ldc_w -2019383694
    //   919: ixor
    //   920: ixor
    //   921: lookupswitch default -> 948, -401666110 -> 904, 466690652 -> 1824
    //   948: goto -> 952
    //   951: athrow
    //   952: invokevirtual getValue : ()Ljava/lang/Object;
    //   955: goto -> 959
    //   958: athrow
    //   959: checkcast java/lang/Integer
    //   962: getstatic Perryc.1 : I
    //   965: ifeq -> 979
    //   968: ldc2_w 1961749730
    //   971: l2i
    //   972: ldc_w -539417025
    //   975: ixor
    //   976: goto -> 987
    //   979: ldc2_w 1780774145
    //   982: l2i
    //   983: ldc_w 480753383
    //   986: ixor
    //   987: ldc2_w 1766039823
    //   990: l2i
    //   991: ldc_w 1978510314
    //   994: ixor
    //   995: ixor
    //   996: lookupswitch default -> 1806, -1214595016 -> 979, 1781385475 -> 1024
    //   1024: goto -> 1028
    //   1027: athrow
    //   1028: invokevirtual intValue : ()I
    //   1031: goto -> 1035
    //   1034: athrow
    //   1035: getstatic Perryc.c : I
    //   1038: iflt -> 1052
    //   1041: ldc2_w -1980180619
    //   1044: l2i
    //   1045: ldc_w -1178410033
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w -1962125419
    //   1055: l2i
    //   1056: ldc_w -1902706632
    //   1059: ixor
    //   1060: ldc2_w 1532417555
    //   1063: l2i
    //   1064: ldc_w -1955769400
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 1096, -536759967 -> 1800, 837820462 -> 1052
    //   1096: goto -> 1100
    //   1099: athrow
    //   1100: invokespecial <init> : (Ljava/lang/String;II)V
    //   1103: goto -> 1107
    //   1106: athrow
    //   1107: getstatic Perryc.c : I
    //   1110: iflt -> 1124
    //   1113: ldc2_w -975163624
    //   1116: l2i
    //   1117: ldc_w 105407213
    //   1120: ixor
    //   1121: goto -> 1132
    //   1124: ldc2_w 237152206
    //   1127: l2i
    //   1128: ldc_w -1035048154
    //   1131: ixor
    //   1132: ldc2_w -1395473422
    //   1135: l2i
    //   1136: ldc_w 1231936703
    //   1139: ixor
    //   1140: ixor
    //   1141: lookupswitch default -> 1168, -66623152 -> 1124, 639062712 -> 1828
    //   1168: aload_2
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w 1884501693
    //   1178: l2i
    //   1179: ldc_w 1573022591
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 1960660561
    //   1189: l2i
    //   1190: ldc_w 598258365
    //   1193: ixor
    //   1194: ldc2_w -258840134
    //   1197: l2i
    //   1198: ldc_w -214119046
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 1228, 775944450 -> 1818, 1946559944 -> 1186
    //   1228: getfield antiAlias : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1231: getstatic Perryc.1 : I
    //   1234: ifeq -> 1248
    //   1237: ldc2_w -1075439888
    //   1240: l2i
    //   1241: ldc_w 832232077
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w 1699236033
    //   1251: l2i
    //   1252: ldc_w -1627550054
    //   1255: ixor
    //   1256: ldc2_w 1543831077
    //   1259: l2i
    //   1260: ldc_w -2140894623
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, -1771613741 -> 1248, 1377613881 -> 1820
    //   1292: goto -> 1296
    //   1295: athrow
    //   1296: invokevirtual getValue : ()Ljava/lang/Object;
    //   1299: goto -> 1303
    //   1302: athrow
    //   1303: checkcast java/lang/Boolean
    //   1306: getstatic Perryc.0 : I
    //   1309: ifle -> 1323
    //   1312: ldc2_w -42546453
    //   1315: l2i
    //   1316: ldc_w -2034583063
    //   1319: ixor
    //   1320: goto -> 1331
    //   1323: ldc2_w 2091656337
    //   1326: l2i
    //   1327: ldc_w 1863917115
    //   1330: ixor
    //   1331: ldc2_w -1463275175
    //   1334: l2i
    //   1335: ldc_w 627518682
    //   1338: ixor
    //   1339: ixor
    //   1340: lookupswitch default -> 1368, -161255807 -> 1834, 865136184 -> 1323
    //   1368: goto -> 1372
    //   1371: athrow
    //   1372: invokevirtual booleanValue : ()Z
    //   1375: goto -> 1379
    //   1378: athrow
    //   1379: getstatic Perryc.1 : I
    //   1382: ifeq -> 1396
    //   1385: ldc2_w -712328696
    //   1388: l2i
    //   1389: ldc_w -402332095
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w 1910930455
    //   1399: l2i
    //   1400: ldc_w 1202157349
    //   1403: ixor
    //   1404: ldc2_w 1285365257
    //   1407: l2i
    //   1408: ldc_w -602083084
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 1794, -1497307697 -> 1440, -1391480140 -> 1396
    //   1440: aload_2
    //   1441: getstatic Perryc.c : I
    //   1444: iflt -> 1458
    //   1447: ldc2_w 1873246410
    //   1450: l2i
    //   1451: ldc_w -960828781
    //   1454: ixor
    //   1455: goto -> 1466
    //   1458: ldc2_w -798674332
    //   1461: l2i
    //   1462: ldc_w -1622475112
    //   1465: ixor
    //   1466: ldc2_w 1312648037
    //   1469: l2i
    //   1470: ldc_w -1676009300
    //   1473: ixor
    //   1474: ixor
    //   1475: lookupswitch default -> 1790, -1660385483 -> 1500, 2067454352 -> 1458
    //   1500: getfield fractionalMetrics : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1503: getstatic Perryc.c : I
    //   1506: iflt -> 1520
    //   1509: ldc2_w 911607909
    //   1512: l2i
    //   1513: ldc_w -2053859712
    //   1516: ixor
    //   1517: goto -> 1528
    //   1520: ldc2_w -1391953896
    //   1523: l2i
    //   1524: ldc_w -427318593
    //   1527: ixor
    //   1528: ldc2_w 1630009906
    //   1531: l2i
    //   1532: ldc_w 772792976
    //   1535: ixor
    //   1536: ixor
    //   1537: lookupswitch default -> 1564, -51739065 -> 1836, 2040155183 -> 1520
    //   1564: goto -> 1568
    //   1567: athrow
    //   1568: invokevirtual getValue : ()Ljava/lang/Object;
    //   1571: goto -> 1575
    //   1574: athrow
    //   1575: checkcast java/lang/Boolean
    //   1578: getstatic Perryc.c : I
    //   1581: iflt -> 1595
    //   1584: ldc2_w -1306508303
    //   1587: l2i
    //   1588: ldc_w 650401632
    //   1591: ixor
    //   1592: goto -> 1603
    //   1595: ldc2_w -2070784945
    //   1598: l2i
    //   1599: ldc_w -1141209425
    //   1602: ixor
    //   1603: ldc2_w 1301536306
    //   1606: l2i
    //   1607: ldc_w 1569220706
    //   1610: ixor
    //   1611: ixor
    //   1612: lookupswitch default -> 1808, -2063621439 -> 1595, 796091568 -> 1640
    //   1640: goto -> 1644
    //   1643: athrow
    //   1644: invokevirtual booleanValue : ()Z
    //   1647: goto -> 1651
    //   1650: athrow
    //   1651: getstatic Perryc.1 : I
    //   1654: ifeq -> 1668
    //   1657: ldc2_w 1307334779
    //   1660: l2i
    //   1661: ldc_w -1715876193
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w -2109300181
    //   1671: l2i
    //   1672: ldc_w 939440096
    //   1675: ixor
    //   1676: ldc2_w 1322115260
    //   1679: l2i
    //   1680: ldc_w 570427429
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1792, -1197965699 -> 1668, -646578862 -> 1712
    //   1712: goto -> 1716
    //   1715: athrow
    //   1716: invokevirtual setFontRenderer : (Ljava/awt/Font;ZZ)V
    //   1719: goto -> 1723
    //   1722: athrow
    //   1723: goto -> 1789
    //   1726: getstatic Perryc.c : I
    //   1729: iflt -> 1743
    //   1732: ldc2_w -926432505
    //   1735: l2i
    //   1736: ldc_w -630402855
    //   1739: ixor
    //   1740: goto -> 1751
    //   1743: ldc2_w 1611164712
    //   1746: l2i
    //   1747: ldc_w 537172347
    //   1750: ixor
    //   1751: ldc2_w 218978482
    //   1754: l2i
    //   1755: ldc_w -271724253
    //   1758: ixor
    //   1759: ixor
    //   1760: lookupswitch default -> 1788, -1388387052 -> 1743, -261383601 -> 1802
    //   1788: astore_3
    //   1789: return
    //   1790: aconst_null
    //   1791: athrow
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
    //   1842: pop
    //   1843: goto -> 24
    //   1846: pop
    //   1847: aconst_null
    //   1848: goto -> 1842
    //   1851: dup
    //   1852: ifnull -> 1842
    //   1855: checkcast java/lang/Throwable
    //   1858: athrow
    //   1859: dup
    //   1860: ifnull -> 1846
    //   1863: checkcast java/lang/Throwable
    //   1866: athrow
    //   1867: aconst_null
    //   1868: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1766	0	this	Lbigname/zprestige/webhack/manager/TextManager;
    //   24	1766	1	startup	Z
    //   229	1561	2	cFont	Lbigname/zprestige/webhack/features/modules/Client/FontMod;
    // Exception table:
    //   from	to	target	type
    //   8	20	1851	java/lang/StringIndexOutOfBoundsException
    //   155	162	162	finally
    //   155	162	162	finally
    //   155	162	155	java/lang/ClassCastException
    //   156	162	155	java/lang/NullPointerException
    //   156	162	162	finally
    //   229	951	1726	java/lang/Exception
    //   479	486	486	finally
    //   479	486	486	finally
    //   480	486	486	java/lang/UnsupportedOperationException
    //   480	486	3	finally
    //   480	486	479	finally
    //   679	686	686	finally
    //   679	686	3	java/util/NoSuchElementException
    //   679	686	679	finally
    //   680	686	686	java/lang/NullPointerException
    //   680	686	3	finally
    //   755	762	762	finally
    //   755	762	755	java/lang/ArrayIndexOutOfBoundsException
    //   756	762	3	finally
    //   756	762	755	finally
    //   756	762	3	finally
    //   952	958	958	finally
    //   952	958	958	finally
    //   952	958	3	java/util/NoSuchElementException
    //   952	958	958	finally
    //   952	958	3	java/lang/StringIndexOutOfBoundsException
    //   952	1371	1726	java/lang/Exception
    //   1027	1034	1034	finally
    //   1027	1034	1027	finally
    //   1027	1034	1034	finally
    //   1028	1034	3	finally
    //   1028	1034	1034	finally
    //   1099	1106	1106	finally
    //   1099	1106	1099	finally
    //   1099	1106	1099	java/util/ConcurrentModificationException
    //   1099	1106	1099	java/lang/StringIndexOutOfBoundsException
    //   1100	1106	1099	java/lang/NegativeArraySizeException
    //   1295	1302	1302	finally
    //   1295	1302	1302	java/lang/NegativeArraySizeException
    //   1296	1302	1295	java/lang/NegativeArraySizeException
    //   1296	1302	1302	java/lang/EnumConstantNotPresentException
    //   1296	1302	1302	java/lang/IndexOutOfBoundsException
    //   1372	1378	1378	finally
    //   1372	1378	3	finally
    //   1372	1378	1378	finally
    //   1372	1378	1378	java/lang/IndexOutOfBoundsException
    //   1372	1378	1378	java/lang/UnsupportedOperationException
    //   1372	1723	1726	java/lang/Exception
    //   1567	1574	1574	finally
    //   1567	1574	3	java/lang/ClassCastException
    //   1567	1574	1567	java/lang/AssertionError
    //   1567	1574	1574	java/lang/StringIndexOutOfBoundsException
    //   1567	1574	3	finally
    //   1643	1650	1650	finally
    //   1643	1650	1650	finally
    //   1643	1650	1650	finally
    //   1643	1650	1643	finally
    //   1644	1650	1650	finally
    //   1715	1722	1722	finally
    //   1715	1722	1722	java/lang/RuntimeException
    //   1716	1722	1715	finally
    //   1716	1722	1722	java/lang/NegativeArraySizeException
    //   1716	1722	3	java/lang/ClassCastException
    //   1851	1859	1851	java/lang/IllegalArgumentException
    //   1867	1869	3	java/lang/IllegalArgumentException
  }
  
  public void updateResolution() {
    Perry1.4a(this, (int)-727747497L ^ 0xA472388F);
  }
  
  public int getFontHeight() {
    return Perry1.34(this, (int)1170027574L ^ 0x39D08861);
  }
  
  public String getIdleSign() {
    return Perry1.o(this, (int)674022374L ^ 0x2BE84BA);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\TextManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */